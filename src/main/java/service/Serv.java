package service;

import enum_.Continent;
import pojo.Country;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
@Service
public class Serv implements Interface {

    public static ArrayList<Country> XML(String filepath) {
        ArrayList<Country> list = new ArrayList<>();
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(filepath);
            Element rootElement = doc.getDocumentElement();
            NodeList childNodeList = rootElement.getChildNodes();
            Node node;
            for (int i = 0; i < childNodeList.getLength(); i++) {
                node = childNodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    NodeList childnodelist = node.getChildNodes();
                    String name = "", area = "", capital = "", continent = "";
                    for (int j = 0; j < childnodelist.getLength(); j++) {
                        Node childnode = childnodelist.item(j);
                        if (childnode.getNodeType() == Node.ELEMENT_NODE) {
                            switch (childnode.getNodeName()) {
                                case "name" -> name = childnode.getTextContent();
                                case "area" -> area = childnode.getTextContent();
                                case "capital" -> capital = childnode.getTextContent();
                                case "continent" -> continent = childnode.getTextContent();
                            }
                        }
                    }
                    list.add(new Country(name, Integer.parseInt(area), capital, Continent.valueOf(continent)));

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public ArrayList<String> XML() {
        return null;
    }
}