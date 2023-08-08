/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter.pattern;


public class JsonToXmlAdapter implements Adapter {

    private JSON json;

    public JsonToXmlAdapter(JSON json){
        this.json = json;
    }
    @Override
    public XML convert(Object type) {
        return this.json.convertToXML();
    }
}
