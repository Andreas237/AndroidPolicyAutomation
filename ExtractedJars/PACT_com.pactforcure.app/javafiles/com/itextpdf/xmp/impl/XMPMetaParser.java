// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.impl;

import com.itextpdf.xmp.XMPException;
import com.itextpdf.xmp.XMPMeta;
import com.itextpdf.xmp.options.ParseOptions;
import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

// Referenced classes of package com.itextpdf.xmp.impl:
//			ParameterAsserts, ParseRDF, XMPMetaImpl, XMPNormalizer, 
//			ByteBuffer, Latin1Converter, FixASCIIControlsReader

public class XMPMetaParser
{

	private XMPMetaParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	private static DocumentBuilderFactory createDocumentBuilderFactory()
	{
		DocumentBuilderFactory documentbuilderfactory = DocumentBuilderFactory.newInstance();
	//    0    0:invokestatic    #29  <Method DocumentBuilderFactory DocumentBuilderFactory.newInstance()>
	//    1    3:astore_0        
		documentbuilderfactory.setNamespaceAware(true);
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #33  <Method void DocumentBuilderFactory.setNamespaceAware(boolean)>
		documentbuilderfactory.setIgnoringComments(true);
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #36  <Method void DocumentBuilderFactory.setIgnoringComments(boolean)>
		try
		{
			documentbuilderfactory.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
	//    8   14:aload_0         
	//    9   15:ldc1            #38  <String "http://javax.xml.XMLConstants/feature/secure-processing">
	//   10   17:iconst_1        
	//   11   18:invokevirtual   #42  <Method void DocumentBuilderFactory.setFeature(String, boolean)>
			documentbuilderfactory.setFeature("http://xml.org/sax/features/external-general-entities", false);
	//   12   21:aload_0         
	//   13   22:ldc1            #44  <String "http://xml.org/sax/features/external-general-entities">
	//   14   24:iconst_0        
	//   15   25:invokevirtual   #42  <Method void DocumentBuilderFactory.setFeature(String, boolean)>
			documentbuilderfactory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", false);
	//   16   28:aload_0         
	//   17   29:ldc1            #46  <String "http://apache.org/xml/features/disallow-doctype-decl">
	//   18   31:iconst_0        
	//   19   32:invokevirtual   #42  <Method void DocumentBuilderFactory.setFeature(String, boolean)>
			documentbuilderfactory.setXIncludeAware(false);
	//   20   35:aload_0         
	//   21   36:iconst_0        
	//   22   37:invokevirtual   #49  <Method void DocumentBuilderFactory.setXIncludeAware(boolean)>
			documentbuilderfactory.setExpandEntityReferences(false);
	//   23   40:aload_0         
	//   24   41:iconst_0        
	//   25   42:invokevirtual   #52  <Method void DocumentBuilderFactory.setExpandEntityReferences(boolean)>
		}
	//*  26   45:aload_0         
	//*  27   46:areturn         
		catch(Exception exception)
	//*  28   47:astore_1        
		{
			return documentbuilderfactory;
	//   29   48:aload_0         
	//   30   49:areturn         
		}
		return documentbuilderfactory;
	}

	private static Object[] findRootNode(Node node, boolean flag, Object aobj[])
	{
		int i;
		node = ((Node) (node.getChildNodes()));
	//    0    0:aload_0         
	//    1    1:invokeinterface #60  <Method NodeList Node.getChildNodes()>
	//    2    6:astore_0        
		i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_3        
_L2:
		Node node1;
		if(i >= ((NodeList) (node)).getLength())
			break MISSING_BLOCK_LABEL_223;
	//    5    9:iload_3         
	//    6   10:aload_0         
	//    7   11:invokeinterface #66  <Method int NodeList.getLength()>
	//    8   16:icmpge          223
		node1 = ((NodeList) (node)).item(i);
	//    9   19:aload_0         
	//   10   20:iload_3         
	//   11   21:invokeinterface #70  <Method Node NodeList.item(int)>
	//   12   26:astore          4
		if(7 != node1.getNodeType() || !"xpacket".equals(((Object) (((ProcessingInstruction)node1).getTarget()))))
			break; /* Loop/switch isn't completed */
	//   13   28:bipush          7
	//   14   30:aload           4
	//   15   32:invokeinterface #74  <Method short Node.getNodeType()>
	//   16   37:icmpne          82
	//   17   40:ldc1            #76  <String "xpacket">
	//   18   42:aload           4
	//   19   44:checkcast       #78  <Class ProcessingInstruction>
	//   20   47:invokeinterface #82  <Method String ProcessingInstruction.getTarget()>
	//   21   52:invokevirtual   #88  <Method boolean String.equals(Object)>
	//   22   55:ifeq            82
		if(aobj != null)
	//*  23   58:aload_2         
	//*  24   59:ifnull          75
			aobj[2] = ((Object) (((ProcessingInstruction)node1).getData()));
	//   25   62:aload_2         
	//   26   63:iconst_2        
	//   27   64:aload           4
	//   28   66:checkcast       #78  <Class ProcessingInstruction>
	//   29   69:invokeinterface #91  <Method String ProcessingInstruction.getData()>
	//   30   74:aastore         
_L4:
		i++;
	//   31   75:iload_3         
	//   32   76:iconst_1        
	//   33   77:iadd            
	//   34   78:istore_3        
		if(true) goto _L2; else goto _L1
	//   35   79:goto            9
_L1:
		if(3 == node1.getNodeType() || 7 == node1.getNodeType()) goto _L4; else goto _L3
	//   36   82:iconst_3        
	//   37   83:aload           4
	//   38   85:invokeinterface #74  <Method short Node.getNodeType()>
	//   39   90:icmpeq          75
	//   40   93:bipush          7
	//   41   95:aload           4
	//   42   97:invokeinterface #74  <Method short Node.getNodeType()>
	//   43  102:icmpeq          75
_L3:
		String s;
		String s1;
		s = node1.getNamespaceURI();
	//   44  105:aload           4
	//   45  107:invokeinterface #94  <Method String Node.getNamespaceURI()>
	//   46  112:astore          5
		s1 = node1.getLocalName();
	//   47  114:aload           4
	//   48  116:invokeinterface #97  <Method String Node.getLocalName()>
	//   49  121:astore          6
		if(!"xmpmeta".equals(((Object) (s1))) && !"xapmeta".equals(((Object) (s1))) || !"adobe:ns:meta/".equals(((Object) (s)))) goto _L6; else goto _L5
	//   50  123:ldc1            #99  <String "xmpmeta">
	//   51  125:aload           6
	//   52  127:invokevirtual   #88  <Method boolean String.equals(Object)>
	//   53  130:ifne            143
	//   54  133:ldc1            #101 <String "xapmeta">
	//   55  135:aload           6
	//   56  137:invokevirtual   #88  <Method boolean String.equals(Object)>
	//   57  140:ifeq            163
	//   58  143:ldc1            #103 <String "adobe:ns:meta/">
	//   59  145:aload           5
	//   60  147:invokevirtual   #88  <Method boolean String.equals(Object)>
	//   61  150:ifeq            163
_L5:
		node = ((Node) (findRootNode(node1, false, aobj)));
	//   62  153:aload           4
	//   63  155:iconst_0        
	//   64  156:aload_2         
	//   65  157:invokestatic    #105 <Method Object[] findRootNode(Node, boolean, Object[])>
	//   66  160:astore_0        
_L8:
		return ((Object []) (node));
	//   67  161:aload_0         
	//   68  162:areturn         
_L6:
		if(flag || !"RDF".equals(((Object) (s1))) || !"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(((Object) (s))))
			break; /* Loop/switch isn't completed */
	//   69  163:iload_1         
	//   70  164:ifne            206
	//   71  167:ldc1            #107 <String "RDF">
	//   72  169:aload           6
	//   73  171:invokevirtual   #88  <Method boolean String.equals(Object)>
	//   74  174:ifeq            206
	//   75  177:ldc1            #109 <String "http://www.w3.org/1999/02/22-rdf-syntax-ns#">
	//   76  179:aload           5
	//   77  181:invokevirtual   #88  <Method boolean String.equals(Object)>
	//   78  184:ifeq            206
		node = ((Node) (aobj));
	//   79  187:aload_2         
	//   80  188:astore_0        
		if(aobj != null)
	//*  81  189:aload_2         
	//*  82  190:ifnull          161
		{
			aobj[0] = ((Object) (node1));
	//   83  193:aload_2         
	//   84  194:iconst_0        
	//   85  195:aload           4
	//   86  197:aastore         
			aobj[1] = XMP_RDF;
	//   87  198:aload_2         
	//   88  199:iconst_1        
	//   89  200:getstatic       #15  <Field Object XMP_RDF>
	//   90  203:aastore         
			return aobj;
	//   91  204:aload_2         
	//   92  205:areturn         
		}
		if(true) goto _L8; else goto _L7
_L7:
		Object aobj1[] = findRootNode(node1, flag, aobj);
	//   93  206:aload           4
	//   94  208:iload_1         
	//   95  209:aload_2         
	//   96  210:invokestatic    #105 <Method Object[] findRootNode(Node, boolean, Object[])>
	//   97  213:astore          4
		if(aobj1 == null) goto _L4; else goto _L9
	//   98  215:aload           4
	//   99  217:ifnull          75
_L9:
		return aobj1;
	//  100  220:aload           4
	//  101  222:areturn         
		return null;
	//  102  223:aconst_null     
	//  103  224:areturn         
	}

	public static XMPMeta parse(Object obj, ParseOptions parseoptions)
		throws XMPException
	{
		ParameterAsserts.assertNotNull(obj);
	//    0    0:aload_0         
	//    1    1:invokestatic    #119 <Method void ParameterAsserts.assertNotNull(Object)>
		if(parseoptions == null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          75
	//*   4    8:aload_0         
	//*   5    9:aload_1         
	//*   6   10:invokestatic    #123 <Method Document parseXml(Object, ParseOptions)>
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #129 <Method boolean ParseOptions.getRequireXMPMeta()>
	//*   9   17:iconst_3        
	//*  10   18:anewarray       Object[]
	//*  11   21:invokestatic    #105 <Method Object[] findRootNode(Node, boolean, Object[])>
	//*  12   24:astore_0        
	//*  13   25:aload_0         
	//*  14   26:ifnull          86
	//*  15   29:aload_0         
	//*  16   30:iconst_1        
	//*  17   31:aaload          
	//*  18   32:getstatic       #15  <Field Object XMP_RDF>
	//*  19   35:if_acmpne       86
	//*  20   38:aload_0         
	//*  21   39:iconst_0        
	//*  22   40:aaload          
	//*  23   41:checkcast       #56  <Class Node>
	//*  24   44:invokestatic    #134 <Method XMPMetaImpl ParseRDF.parse(Node)>
	//*  25   47:astore_2        
	//*  26   48:aload_2         
	//*  27   49:aload_0         
	//*  28   50:iconst_2        
	//*  29   51:aaload          
	//*  30   52:checkcast       #84  <Class String>
	//*  31   55:invokevirtual   #140 <Method void XMPMetaImpl.setPacketHeader(String)>
	//*  32   58:aload_2         
	//*  33   59:astore_0        
	//*  34   60:aload_1         
	//*  35   61:invokevirtual   #143 <Method boolean ParseOptions.getOmitNormalization()>
	//*  36   64:ifne            73
	//*  37   67:aload_2         
	//*  38   68:aload_1         
	//*  39   69:invokestatic    #149 <Method XMPMeta XMPNormalizer.process(XMPMetaImpl, ParseOptions)>
	//*  40   72:astore_0        
	//*  41   73:aload_0         
	//*  42   74:areturn         
			parseoptions = new ParseOptions();
	//   43   75:new             #125 <Class ParseOptions>
	//   44   78:dup             
	//   45   79:invokespecial   #150 <Method void ParseOptions()>
	//   46   82:astore_1        
		obj = ((Object) (findRootNode(((Node) (parseXml(obj, parseoptions))), parseoptions.getRequireXMPMeta(), new Object[3])));
		if(obj != null && obj[1] == XMP_RDF)
		{
			XMPMetaImpl xmpmetaimpl = ParseRDF.parse((Node)obj[0]);
			xmpmetaimpl.setPacketHeader((String)obj[2]);
			obj = ((Object) (xmpmetaimpl));
			if(!parseoptions.getOmitNormalization())
				obj = ((Object) (XMPNormalizer.process(xmpmetaimpl, parseoptions)));
			return ((XMPMeta) (obj));
		} else
	//*  47   83:goto            8
		{
			return ((XMPMeta) (new XMPMetaImpl()));
	//   48   86:new             #136 <Class XMPMetaImpl>
	//   49   89:dup             
	//   50   90:invokespecial   #151 <Method void XMPMetaImpl()>
	//   51   93:areturn         
		}
	}

	private static Document parseInputSource(InputSource inputsource)
		throws XMPException
	{
		try
		{
			DocumentBuilder documentbuilder = factory.newDocumentBuilder();
	//    0    0:getstatic       #21  <Field DocumentBuilderFactory factory>
	//    1    3:invokevirtual   #164 <Method DocumentBuilder DocumentBuilderFactory.newDocumentBuilder()>
	//    2    6:astore_1        
			documentbuilder.setErrorHandler(((org.xml.sax.ErrorHandler) (null)));
	//    3    7:aload_1         
	//    4    8:aconst_null     
	//    5    9:invokevirtual   #170 <Method void DocumentBuilder.setErrorHandler(org.xml.sax.ErrorHandler)>
			inputsource = ((InputSource) (documentbuilder.parse(inputsource)));
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #172 <Method Document DocumentBuilder.parse(InputSource)>
	//    9   17:astore_0        
		}
	//*  10   18:aload_0         
	//*  11   19:areturn         
		// Misplaced declaration of an exception variable
		catch(InputSource inputsource)
	//*  12   20:astore_0        
		{
			throw new XMPException("XML parsing failure", 201, ((Throwable) (inputsource)));
	//   13   21:new             #113 <Class XMPException>
	//   14   24:dup             
	//   15   25:ldc1            #174 <String "XML parsing failure">
	//   16   27:sipush          201
	//   17   30:aload_0         
	//   18   31:invokespecial   #177 <Method void XMPException(String, int, Throwable)>
	//   19   34:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(InputSource inputsource)
	//*  20   35:astore_0        
		{
			throw new XMPException("XML Parser not correctly configured", 0, ((Throwable) (inputsource)));
	//   21   36:new             #113 <Class XMPException>
	//   22   39:dup             
	//   23   40:ldc1            #179 <String "XML Parser not correctly configured">
	//   24   42:iconst_0        
	//   25   43:aload_0         
	//   26   44:invokespecial   #177 <Method void XMPException(String, int, Throwable)>
	//   27   47:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(InputSource inputsource)
	//*  28   48:astore_0        
		{
			throw new XMPException("Error reading the XML-file", 204, ((Throwable) (inputsource)));
	//   29   49:new             #113 <Class XMPException>
	//   30   52:dup             
	//   31   53:ldc1            #181 <String "Error reading the XML-file">
	//   32   55:sipush          204
	//   33   58:aload_0         
	//   34   59:invokespecial   #177 <Method void XMPException(String, int, Throwable)>
	//   35   62:athrow          
		}
		return ((Document) (inputsource));
	}

	private static Document parseXml(Object obj, ParseOptions parseoptions)
		throws XMPException
	{
		if(obj instanceof InputStream)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #183 <Class InputStream>
	//*   2    4:ifeq            16
			return parseXmlFromInputStream((InputStream)obj, parseoptions);
	//    3    7:aload_0         
	//    4    8:checkcast       #183 <Class InputStream>
	//    5   11:aload_1         
	//    6   12:invokestatic    #187 <Method Document parseXmlFromInputStream(InputStream, ParseOptions)>
	//    7   15:areturn         
		if(obj instanceof byte[])
	//*   8   16:aload_0         
	//*   9   17:instanceof      #189 <Class byte[]>
	//*  10   20:ifeq            42
			return parseXmlFromBytebuffer(new ByteBuffer((byte[])(byte[])obj), parseoptions);
	//   11   23:new             #191 <Class ByteBuffer>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:checkcast       #189 <Class byte[]>
	//   15   31:checkcast       #189 <Class byte[]>
	//   16   34:invokespecial   #194 <Method void ByteBuffer(byte[])>
	//   17   37:aload_1         
	//   18   38:invokestatic    #198 <Method Document parseXmlFromBytebuffer(ByteBuffer, ParseOptions)>
	//   19   41:areturn         
		else
			return parseXmlFromString((String)obj, parseoptions);
	//   20   42:aload_0         
	//   21   43:checkcast       #84  <Class String>
	//   22   46:aload_1         
	//   23   47:invokestatic    #202 <Method Document parseXmlFromString(String, ParseOptions)>
	//   24   50:areturn         
	}

	private static Document parseXmlFromBytebuffer(ByteBuffer bytebuffer, ParseOptions parseoptions)
		throws XMPException
	{
		Object obj = ((Object) (new InputSource(bytebuffer.getByteStream())));
	//    0    0:new             #206 <Class InputSource>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #210 <Method InputStream ByteBuffer.getByteStream()>
	//    4    8:invokespecial   #213 <Method void InputSource(InputStream)>
	//    5   11:astore_2        
		try
		{
			obj = ((Object) (parseInputSource(((InputSource) (obj)))));
	//    6   12:aload_2         
	//    7   13:invokestatic    #215 <Method Document parseInputSource(InputSource)>
	//    8   16:astore_2        
		}
	//*   9   17:aload_2         
	//*  10   18:areturn         
		catch(XMPException xmpexception)
	//*  11   19:astore_3        
		{
			if(xmpexception.getErrorCode() == 201 || xmpexception.getErrorCode() == 204)
	//*  12   20:aload_3         
	//*  13   21:invokevirtual   #218 <Method int XMPException.getErrorCode()>
	//*  14   24:sipush          201
	//*  15   27:icmpeq          40
	//*  16   30:aload_3         
	//*  17   31:invokevirtual   #218 <Method int XMPException.getErrorCode()>
	//*  18   34:sipush          204
	//*  19   37:icmpne          127
			{
				ByteBuffer bytebuffer1 = bytebuffer;
	//   20   40:aload_0         
	//   21   41:astore_2        
				if(parseoptions.getAcceptLatin1())
	//*  22   42:aload_1         
	//*  23   43:invokevirtual   #221 <Method boolean ParseOptions.getAcceptLatin1()>
	//*  24   46:ifeq            54
					bytebuffer1 = Latin1Converter.convert(bytebuffer);
	//   25   49:aload_0         
	//   26   50:invokestatic    #227 <Method ByteBuffer Latin1Converter.convert(ByteBuffer)>
	//   27   53:astore_2        
				if(parseoptions.getFixControlChars())
	//*  28   54:aload_1         
	//*  29   55:invokevirtual   #230 <Method boolean ParseOptions.getFixControlChars()>
	//*  30   58:ifeq            112
				{
					try
					{
						bytebuffer = ((ByteBuffer) (bytebuffer1.getEncoding()));
	//   31   61:aload_2         
	//   32   62:invokevirtual   #233 <Method String ByteBuffer.getEncoding()>
	//   33   65:astore_0        
						bytebuffer = ((ByteBuffer) (parseInputSource(new InputSource(((java.io.Reader) (new FixASCIIControlsReader(((java.io.Reader) (new InputStreamReader(bytebuffer1.getByteStream(), ((String) (bytebuffer))))))))))));
	//   34   66:new             #206 <Class InputSource>
	//   35   69:dup             
	//   36   70:new             #235 <Class FixASCIIControlsReader>
	//   37   73:dup             
	//   38   74:new             #237 <Class InputStreamReader>
	//   39   77:dup             
	//   40   78:aload_2         
	//   41   79:invokevirtual   #210 <Method InputStream ByteBuffer.getByteStream()>
	//   42   82:aload_0         
	//   43   83:invokespecial   #240 <Method void InputStreamReader(InputStream, String)>
	//   44   86:invokespecial   #243 <Method void FixASCIIControlsReader(java.io.Reader)>
	//   45   89:invokespecial   #244 <Method void InputSource(java.io.Reader)>
	//   46   92:invokestatic    #215 <Method Document parseInputSource(InputSource)>
	//   47   95:astore_0        
					}
	//*  48   96:aload_0         
	//*  49   97:areturn         
					// Misplaced declaration of an exception variable
					catch(ByteBuffer bytebuffer)
	//*  50   98:astore_0        
					{
						throw new XMPException("Unsupported Encoding", 9, ((Throwable) (xmpexception)));
	//   51   99:new             #113 <Class XMPException>
	//   52  102:dup             
	//   53  103:ldc1            #246 <String "Unsupported Encoding">
	//   54  105:bipush          9
	//   55  107:aload_3         
	//   56  108:invokespecial   #177 <Method void XMPException(String, int, Throwable)>
	//   57  111:athrow          
					}
					return ((Document) (bytebuffer));
				} else
				{
					return parseInputSource(new InputSource(bytebuffer1.getByteStream()));
	//   58  112:new             #206 <Class InputSource>
	//   59  115:dup             
	//   60  116:aload_2         
	//   61  117:invokevirtual   #210 <Method InputStream ByteBuffer.getByteStream()>
	//   62  120:invokespecial   #213 <Method void InputSource(InputStream)>
	//   63  123:invokestatic    #215 <Method Document parseInputSource(InputSource)>
	//   64  126:areturn         
				}
			} else
			{
				throw xmpexception;
	//   65  127:aload_3         
	//   66  128:athrow          
			}
		}
		return ((Document) (obj));
	}

	private static Document parseXmlFromInputStream(InputStream inputstream, ParseOptions parseoptions)
		throws XMPException
	{
		if(!parseoptions.getAcceptLatin1() && !parseoptions.getFixControlChars())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #221 <Method boolean ParseOptions.getAcceptLatin1()>
	//*   2    4:ifne            26
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #230 <Method boolean ParseOptions.getFixControlChars()>
	//*   5   11:ifne            26
			return parseInputSource(new InputSource(inputstream));
	//    6   14:new             #206 <Class InputSource>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:invokespecial   #213 <Method void InputSource(InputStream)>
	//   10   22:invokestatic    #215 <Method Document parseInputSource(InputSource)>
	//   11   25:areturn         
		try
		{
			inputstream = ((InputStream) (parseXmlFromBytebuffer(new ByteBuffer(inputstream), parseoptions)));
	//   12   26:new             #191 <Class ByteBuffer>
	//   13   29:dup             
	//   14   30:aload_0         
	//   15   31:invokespecial   #247 <Method void ByteBuffer(InputStream)>
	//   16   34:aload_1         
	//   17   35:invokestatic    #198 <Method Document parseXmlFromBytebuffer(ByteBuffer, ParseOptions)>
	//   18   38:astore_0        
		}
	//*  19   39:aload_0         
	//*  20   40:areturn         
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//*  21   41:astore_0        
		{
			throw new XMPException("Error reading the XML-file", 204, ((Throwable) (inputstream)));
	//   22   42:new             #113 <Class XMPException>
	//   23   45:dup             
	//   24   46:ldc1            #181 <String "Error reading the XML-file">
	//   25   48:sipush          204
	//   26   51:aload_0         
	//   27   52:invokespecial   #177 <Method void XMPException(String, int, Throwable)>
	//   28   55:athrow          
		}
		return ((Document) (inputstream));
	}

	private static Document parseXmlFromString(String s, ParseOptions parseoptions)
		throws XMPException
	{
		Object obj = ((Object) (new InputSource(((java.io.Reader) (new StringReader(s))))));
	//    0    0:new             #206 <Class InputSource>
	//    1    3:dup             
	//    2    4:new             #249 <Class StringReader>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #251 <Method void StringReader(String)>
	//    6   12:invokespecial   #244 <Method void InputSource(java.io.Reader)>
	//    7   15:astore_2        
		try
		{
			obj = ((Object) (parseInputSource(((InputSource) (obj)))));
	//    8   16:aload_2         
	//    9   17:invokestatic    #215 <Method Document parseInputSource(InputSource)>
	//   10   20:astore_2        
		}
	//*  11   21:aload_2         
	//*  12   22:areturn         
		catch(XMPException xmpexception)
	//*  13   23:astore_2        
		{
			if(xmpexception.getErrorCode() == 201 && parseoptions.getFixControlChars())
	//*  14   24:aload_2         
	//*  15   25:invokevirtual   #218 <Method int XMPException.getErrorCode()>
	//*  16   28:sipush          201
	//*  17   31:icmpne          67
	//*  18   34:aload_1         
	//*  19   35:invokevirtual   #230 <Method boolean ParseOptions.getFixControlChars()>
	//*  20   38:ifeq            67
				return parseInputSource(new InputSource(((java.io.Reader) (new FixASCIIControlsReader(((java.io.Reader) (new StringReader(s))))))));
	//   21   41:new             #206 <Class InputSource>
	//   22   44:dup             
	//   23   45:new             #235 <Class FixASCIIControlsReader>
	//   24   48:dup             
	//   25   49:new             #249 <Class StringReader>
	//   26   52:dup             
	//   27   53:aload_0         
	//   28   54:invokespecial   #251 <Method void StringReader(String)>
	//   29   57:invokespecial   #243 <Method void FixASCIIControlsReader(java.io.Reader)>
	//   30   60:invokespecial   #244 <Method void InputSource(java.io.Reader)>
	//   31   63:invokestatic    #215 <Method Document parseInputSource(InputSource)>
	//   32   66:areturn         
			else
				throw xmpexception;
	//   33   67:aload_2         
	//   34   68:athrow          
		}
		return ((Document) (obj));
	}

	private static final Object XMP_RDF = new Object();
	private static DocumentBuilderFactory factory = createDocumentBuilderFactory();

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void Object()>
	//    3    7:putstatic       #15  <Field Object XMP_RDF>
	//    4   10:invokestatic    #19  <Method DocumentBuilderFactory createDocumentBuilderFactory()>
	//    5   13:putstatic       #21  <Field DocumentBuilderFactory factory>
	//*   6   16:return          
	}
}
