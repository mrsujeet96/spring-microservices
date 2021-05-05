package com.image.Model;

import javax.persistence.*;

@Entity
public class Doc {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer doc_id;

    private String docName;
    private String docType;

    @Lob
    private byte[] data;

    public Doc() {
    }

    public Doc(String docName, String docType, byte[] data) {
        super();
        this.docName = docName;
        this.docType = docType;
        this.data = data;
    }

    public Integer getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(Integer doc_id) {
        this.doc_id = doc_id;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }


}
