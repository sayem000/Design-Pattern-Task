/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter.pattern;

public class ProtobufToXmlAdapter implements Adapter {
    private Protobuf protobuf;

    public ProtobufToXmlAdapter(Protobuf protobuf){
        this.protobuf = protobuf;
    }
    @Override
    public XML convert(Object type) {
        return this.protobuf.convertToXML();
    }

}
