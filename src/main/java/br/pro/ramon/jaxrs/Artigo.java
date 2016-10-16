package br.pro.ramon.jaxrs;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Artigo {

    private Integer id;
    private String texto;

    protected Artigo() {
    }

    public Artigo(Integer id) {
        this.id = id;
        this.texto = "Artigo de id " + id + ".";
    }

    @XmlAttribute
    public Integer getId() {
        return id;
    }

    @XmlElement
    public String getTexto() {
        return texto;
    }

}
