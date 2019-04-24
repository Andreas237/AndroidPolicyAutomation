// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.xml.xmp;

import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.xml.XmlDomWriter;
import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class XmpReader
{

	public XmpReader(byte abyte0[])
		throws SAXException, IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		try
		{
			DocumentBuilderFactory documentbuilderfactory = DocumentBuilderFactory.newInstance();
	//    2    4:invokestatic    #34  <Method DocumentBuilderFactory DocumentBuilderFactory.newInstance()>
	//    3    7:astore_2        
			documentbuilderfactory.setNamespaceAware(true);
	//    4    8:aload_2         
	//    5    9:iconst_1        
	//    6   10:invokevirtual   #38  <Method void DocumentBuilderFactory.setNamespaceAware(boolean)>
			domDocument = documentbuilderfactory.newDocumentBuilder().parse(((java.io.InputStream) (new ByteArrayInputStream(abyte0))));
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #42  <Method DocumentBuilder DocumentBuilderFactory.newDocumentBuilder()>
	//   10   18:new             #44  <Class ByteArrayInputStream>
	//   11   21:dup             
	//   12   22:aload_1         
	//   13   23:invokespecial   #46  <Method void ByteArrayInputStream(byte[])>
	//   14   26:invokevirtual   #52  <Method Document DocumentBuilder.parse(java.io.InputStream)>
	//   15   29:putfield        #54  <Field Document domDocument>
			return;
	//   16   32:return          
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  17   33:astore_1        
		{
			throw new ExceptionConverter(((Exception) (abyte0)));
	//   18   34:new             #56  <Class ExceptionConverter>
	//   19   37:dup             
	//   20   38:aload_1         
	//   21   39:invokespecial   #59  <Method void ExceptionConverter(Exception)>
	//   22   42:athrow          
		}
	}

	public boolean add(String s, String s1, String s2, String s3)
	{
		NodeList nodelist = domDocument.getElementsByTagName(s);
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field Document domDocument>
	//    2    4:aload_1         
	//    3    5:invokeinterface #69  <Method NodeList Document.getElementsByTagName(String)>
	//    4   10:astore          7
		if(nodelist.getLength() != 0)
	//*   5   12:aload           7
	//*   6   14:invokeinterface #75  <Method int NodeList.getLength()>
	//*   7   19:ifne            24
	//*   8   22:iconst_0        
	//*   9   23:ireturn         
		{
			int i = 0;
	//   10   24:iconst_0        
	//   11   25:istore          5
			while(i < nodelist.getLength()) 
	//*  12   27:iload           5
	//*  13   29:aload           7
	//*  14   31:invokeinterface #75  <Method int NodeList.getLength()>
	//*  15   36:icmpge          22
			{
				s = ((String) (nodelist.item(i)));
	//   16   39:aload           7
	//   17   41:iload           5
	//   18   43:invokeinterface #79  <Method Node NodeList.item(int)>
	//   19   48:astore_1        
				NamedNodeMap namednodemap = ((Node) (s)).getAttributes();
	//   20   49:aload_1         
	//   21   50:invokeinterface #85  <Method NamedNodeMap Node.getAttributes()>
	//   22   55:astore          8
				for(int j = 0; j < namednodemap.getLength(); j++)
	//*  23   57:iconst_0        
	//*  24   58:istore          6
	//*  25   60:iload           6
	//*  26   62:aload           8
	//*  27   64:invokeinterface #88  <Method int NamedNodeMap.getLength()>
	//*  28   69:icmpge          163
				{
					Node node = namednodemap.item(j);
	//   29   72:aload           8
	//   30   74:iload           6
	//   31   76:invokeinterface #89  <Method Node NamedNodeMap.item(int)>
	//   32   81:astore          9
					if(s1.equals(((Object) (node.getNodeValue()))))
	//*  33   83:aload_2         
	//*  34   84:aload           9
	//*  35   86:invokeinterface #93  <Method String Node.getNodeValue()>
	//*  36   91:invokevirtual   #99  <Method boolean String.equals(Object)>
	//*  37   94:ifeq            154
					{
						String s4 = node.getLocalName();
	//   38   97:aload           9
	//   39   99:invokeinterface #102 <Method String Node.getLocalName()>
	//   40  104:astore          7
						s1 = ((String) (domDocument.createElementNS(s1, s2)));
	//   41  106:aload_0         
	//   42  107:getfield        #54  <Field Document domDocument>
	//   43  110:aload_2         
	//   44  111:aload_3         
	//   45  112:invokeinterface #106 <Method org.w3c.dom.Element Document.createElementNS(String, String)>
	//   46  117:astore_2        
						((Node) (s1)).setPrefix(s4);
	//   47  118:aload_2         
	//   48  119:aload           7
	//   49  121:invokeinterface #110 <Method void Node.setPrefix(String)>
						((Node) (s1)).appendChild(((Node) (domDocument.createTextNode(s3))));
	//   50  126:aload_2         
	//   51  127:aload_0         
	//   52  128:getfield        #54  <Field Document domDocument>
	//   53  131:aload           4
	//   54  133:invokeinterface #114 <Method org.w3c.dom.Text Document.createTextNode(String)>
	//   55  138:invokeinterface #118 <Method Node Node.appendChild(Node)>
	//   56  143:pop             
						((Node) (s)).appendChild(((Node) (s1)));
	//   57  144:aload_1         
	//   58  145:aload_2         
	//   59  146:invokeinterface #118 <Method Node Node.appendChild(Node)>
	//   60  151:pop             
						return true;
	//   61  152:iconst_1        
	//   62  153:ireturn         
					}
				}

	//   63  154:iload           6
	//   64  156:iconst_1        
	//   65  157:iadd            
	//   66  158:istore          6
	//*  67  160:goto            60
				i++;
	//   68  163:iload           5
	//   69  165:iconst_1        
	//   70  166:iadd            
	//   71  167:istore          5
			}
		}
		return false;
	//*  72  169:goto            27
	}

	public boolean replaceDescriptionAttribute(String s, String s1, String s2)
	{
		NodeList nodelist = domDocument.getElementsByTagNameNS("http://www.w3.org/1999/02/22-rdf-syntax-ns#", "Description");
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field Document domDocument>
	//    2    4:ldc1            #122 <String "http://www.w3.org/1999/02/22-rdf-syntax-ns#">
	//    3    6:ldc1            #124 <String "Description">
	//    4    8:invokeinterface #128 <Method NodeList Document.getElementsByTagNameNS(String, String)>
	//    5   13:astore          5
		if(nodelist.getLength() != 0)
	//*   6   15:aload           5
	//*   7   17:invokeinterface #75  <Method int NodeList.getLength()>
	//*   8   22:ifne            27
	//*   9   25:iconst_0        
	//*  10   26:ireturn         
		{
			int i = 0;
	//   11   27:iconst_0        
	//   12   28:istore          4
			while(i < nodelist.getLength()) 
	//*  13   30:iload           4
	//*  14   32:aload           5
	//*  15   34:invokeinterface #75  <Method int NodeList.getLength()>
	//*  16   39:icmpge          25
			{
				Node node = nodelist.item(i).getAttributes().getNamedItemNS(s, s1);
	//   17   42:aload           5
	//   18   44:iload           4
	//   19   46:invokeinterface #79  <Method Node NodeList.item(int)>
	//   20   51:invokeinterface #85  <Method NamedNodeMap Node.getAttributes()>
	//   21   56:aload_1         
	//   22   57:aload_2         
	//   23   58:invokeinterface #132 <Method Node NamedNodeMap.getNamedItemNS(String, String)>
	//   24   63:astore          6
				if(node != null)
	//*  25   65:aload           6
	//*  26   67:ifnull          80
				{
					node.setNodeValue(s2);
	//   27   70:aload           6
	//   28   72:aload_3         
	//   29   73:invokeinterface #135 <Method void Node.setNodeValue(String)>
					return true;
	//   30   78:iconst_1        
	//   31   79:ireturn         
				}
				i++;
	//   32   80:iload           4
	//   33   82:iconst_1        
	//   34   83:iadd            
	//   35   84:istore          4
			}
		}
		return false;
	//*  36   86:goto            30
	}

	public boolean replaceNode(String s, String s1, String s2)
	{
		s = ((String) (domDocument.getElementsByTagNameNS(s, s1)));
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field Document domDocument>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #128 <Method NodeList Document.getElementsByTagNameNS(String, String)>
	//    5   11:astore_1        
		if(((NodeList) (s)).getLength() == 0)
	//*   6   12:aload_1         
	//*   7   13:invokeinterface #75  <Method int NodeList.getLength()>
	//*   8   18:ifne            23
			return false;
	//    9   21:iconst_0        
	//   10   22:ireturn         
		for(int i = 0; i < ((NodeList) (s)).getLength(); i++)
	//*  11   23:iconst_0        
	//*  12   24:istore          4
	//*  13   26:iload           4
	//*  14   28:aload_1         
	//*  15   29:invokeinterface #75  <Method int NodeList.getLength()>
	//*  16   34:icmpge          66
		{
			s1 = ((String) (((NodeList) (s)).item(i)));
	//   17   37:aload_1         
	//   18   38:iload           4
	//   19   40:invokeinterface #79  <Method Node NodeList.item(int)>
	//   20   45:astore_2        
			setNodeText(domDocument, ((Node) (s1)), s2);
	//   21   46:aload_0         
	//   22   47:aload_0         
	//   23   48:getfield        #54  <Field Document domDocument>
	//   24   51:aload_2         
	//   25   52:aload_3         
	//   26   53:invokevirtual   #140 <Method boolean setNodeText(Document, Node, String)>
	//   27   56:pop             
		}

	//   28   57:iload           4
	//   29   59:iconst_1        
	//   30   60:iadd            
	//   31   61:istore          4
	//*  32   63:goto            26
		return true;
	//   33   66:iconst_1        
	//   34   67:ireturn         
	}

	public byte[] serializeDoc()
		throws IOException
	{
		XmlDomWriter xmldomwriter = new XmlDomWriter();
	//    0    0:new             #144 <Class XmlDomWriter>
	//    1    3:dup             
	//    2    4:invokespecial   #145 <Method void XmlDomWriter()>
	//    3    7:astore_2        
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    4    8:new             #147 <Class ByteArrayOutputStream>
	//    5   11:dup             
	//    6   12:invokespecial   #148 <Method void ByteArrayOutputStream()>
	//    7   15:astore_3        
		xmldomwriter.setOutput(((java.io.OutputStream) (bytearrayoutputstream)), ((String) (null)));
	//    8   16:aload_2         
	//    9   17:aload_3         
	//   10   18:aconst_null     
	//   11   19:invokevirtual   #152 <Method void XmlDomWriter.setOutput(java.io.OutputStream, String)>
		bytearrayoutputstream.write("<?xpacket begin=\"\uFEFF\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?>\n".getBytes("UTF-8"));
	//   12   22:aload_3         
	//   13   23:ldc1            #12  <String "<?xpacket begin=\"\uFEFF\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?>\n">
	//   14   25:ldc1            #154 <String "UTF-8">
	//   15   27:invokevirtual   #158 <Method byte[] String.getBytes(String)>
	//   16   30:invokevirtual   #161 <Method void ByteArrayOutputStream.write(byte[])>
		bytearrayoutputstream.flush();
	//   17   33:aload_3         
	//   18   34:invokevirtual   #164 <Method void ByteArrayOutputStream.flush()>
		xmldomwriter.write(domDocument.getElementsByTagName("x:xmpmeta").item(0));
	//   19   37:aload_2         
	//   20   38:aload_0         
	//   21   39:getfield        #54  <Field Document domDocument>
	//   22   42:ldc1            #166 <String "x:xmpmeta">
	//   23   44:invokeinterface #69  <Method NodeList Document.getElementsByTagName(String)>
	//   24   49:iconst_0        
	//   25   50:invokeinterface #79  <Method Node NodeList.item(int)>
	//   26   55:invokevirtual   #169 <Method void XmlDomWriter.write(Node)>
		bytearrayoutputstream.flush();
	//   27   58:aload_3         
	//   28   59:invokevirtual   #164 <Method void ByteArrayOutputStream.flush()>
		for(int i = 0; i < 20; i++)
	//*  29   62:iconst_0        
	//*  30   63:istore_1        
	//*  31   64:iload_1         
	//*  32   65:bipush          20
	//*  33   67:icmpge          86
			bytearrayoutputstream.write("                                                                                                   \n".getBytes());
	//   34   70:aload_3         
	//   35   71:ldc1            #9   <String "                                                                                                   \n">
	//   36   73:invokevirtual   #171 <Method byte[] String.getBytes()>
	//   37   76:invokevirtual   #161 <Method void ByteArrayOutputStream.write(byte[])>

	//   38   79:iload_1         
	//   39   80:iconst_1        
	//   40   81:iadd            
	//   41   82:istore_1        
	//*  42   83:goto            64
		bytearrayoutputstream.write("<?xpacket end=\"w\"?>".getBytes());
	//   43   86:aload_3         
	//   44   87:ldc1            #15  <String "<?xpacket end=\"w\"?>">
	//   45   89:invokevirtual   #171 <Method byte[] String.getBytes()>
	//   46   92:invokevirtual   #161 <Method void ByteArrayOutputStream.write(byte[])>
		bytearrayoutputstream.close();
	//   47   95:aload_3         
	//   48   96:invokevirtual   #174 <Method void ByteArrayOutputStream.close()>
		return bytearrayoutputstream.toByteArray();
	//   49   99:aload_3         
	//   50  100:invokevirtual   #177 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   51  103:areturn         
	}

	public boolean setNodeText(Document document, Node node, String s)
	{
		if(node == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		do
		{
			Node node1 = node.getFirstChild();
	//    4    6:aload_2         
	//    5    7:invokeinterface #181 <Method Node Node.getFirstChild()>
	//    6   12:astore          4
			if(node1 != null)
	//*   7   14:aload           4
	//*   8   16:ifnull          31
			{
				node.removeChild(node1);
	//    9   19:aload_2         
	//   10   20:aload           4
	//   11   22:invokeinterface #184 <Method Node Node.removeChild(Node)>
	//   12   27:pop             
			} else
	//*  13   28:goto            6
			{
				node.appendChild(((Node) (document.createTextNode(s))));
	//   14   31:aload_2         
	//   15   32:aload_1         
	//   16   33:aload_3         
	//   17   34:invokeinterface #114 <Method org.w3c.dom.Text Document.createTextNode(String)>
	//   18   39:invokeinterface #118 <Method Node Node.appendChild(Node)>
	//   19   44:pop             
				return true;
	//   20   45:iconst_1        
	//   21   46:ireturn         
			}
		} while(true);
	}

	public static final String EXTRASPACE = "                                                                                                   \n";
	public static final String XPACKET_PI_BEGIN = "<?xpacket begin=\"\uFEFF\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?>\n";
	public static final String XPACKET_PI_END_W = "<?xpacket end=\"w\"?>";
	private Document domDocument;
}
