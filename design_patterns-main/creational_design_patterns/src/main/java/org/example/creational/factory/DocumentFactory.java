package org.example.creational.factory;

public class DocumentFactory {

    // TODO: Implement this method to return the correct type of document
    public static Document createDocument(String type) {
        switch (type) {
            case "PDF":
                // TODO: Return a PDFDocument instance
                return new PDFDocument();
            case "Word":
                // TODO: Return a WordDocument instance
                return new WordDocument();
            case "HTML":
                // TODO: Return an HTMLDocument instance
                return new HTMLDocument();
            default:
                throw new IllegalArgumentException("Unknown document type: " + type);
        }
    }
}
