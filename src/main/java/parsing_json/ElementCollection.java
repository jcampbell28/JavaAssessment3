package parsing_json;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ElementCollection extends ArrayList {

    ArrayList<Element> elementArrayList;

    public ElementCollection() {
    }

    public Element findByAtomicNumber(int atomic_number) {
        try {
            elementArrayList = ElementCollectionInitializer.generate();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (Element element : elementArrayList) {
            if (element.getNumber() == atomic_number) {
                return element;
            }
        }
        return null;
    }

    public Element findByName(String name) {
        try {
            elementArrayList = ElementCollectionInitializer.generate();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (Element element : elementArrayList) {
            if (element.getName().equals(name)) {
                return element;
            }
        }
        return null;
    }

    public ElementCollection where(String fieldName, Object value) {
        ArrayList<Element> matchedElements = new ArrayList<>();
        try {
            elementArrayList = ElementCollectionInitializer.generate();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (Element element : elementArrayList) {
            if (element.getName().equals(fieldName)) {
                for (int i = 0; i < elementArrayList.size(); i++) {
                    if (elementArrayList.get(i).equals(value)) {
                        matchedElements.add(element);
                    }
                }
            }
        }
        return (ElementCollection) matchedElements;
    }
}
