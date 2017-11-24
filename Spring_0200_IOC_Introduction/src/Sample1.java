import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

import java.util.*;

public class Sample1 {
    public static void main(String[] args) throws Exception {
        SAXBuilder sb = new SAXBuilder();

        Document doc = sb.build(Sample1.class.getClassLoader().getResourceAsStream("beans.xml")); //�����ĵ�����
        Element root = doc.getRootElement(); //��ȡ��Ԫ��HD
        List list = root.getChildren("bean");//ȡ����Ϊdisk������Ԫ��
        for (int i = 0; i < list.size(); i++) {
            Element element = (Element) list.get(i);
            String id = element.getAttributeValue("id");
            String clazz = element.getAttributeValue("class");
            System.out.println(id);
            System.out.println(clazz);
       /*
       String capacity=element.getChildText("capacity");//ȡdisk��Ԫ��capacity������
       String directories=element.getChildText("directories");
       String files=element.getChildText("files");
       System.out.println("������Ϣ:");
       System.out.println("�����̷�:"+name);
       System.out.println("��������:"+capacity);
       System.out.println("Ŀ¼��:"+directories);
       System.out.println("�ļ���:"+files);
       System.out.println("-----------------------------------");
       */
        }
    }
} 