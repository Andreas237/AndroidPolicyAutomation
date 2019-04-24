// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.pdf.XmlSignatureAppearance;
import java.io.*;
import java.math.BigInteger;
import java.security.*;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.security.auth.x500.X500Principal;
import javax.xml.crypto.dom.DOMStructure;
import javax.xml.crypto.dsig.*;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.spec.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.apache.jcp.xml.dsig.internal.dom.*;
import org.apache.xml.security.utils.Base64;
import org.w3c.dom.*;

// Referenced classes of package com.itextpdf.text.pdf.security:
//			XpathConstructor, XmlLocator, ExternalSignature

public class MakeXmlSignature
{
	private static class EmptyKey
		implements Key
	{

		public static EmptyKey getInstance()
		{
			return instance;
		//    0    0:getstatic       #18  <Field MakeXmlSignature$EmptyKey instance>
		//    1    3:areturn         
		}

		public String getAlgorithm()
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public byte[] getEncoded()
		{
			return new byte[0];
		//    0    0:iconst_0        
		//    1    1:newarray        byte[]
		//    2    3:areturn         
		}

		public String getFormat()
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		private static EmptyKey instance = new EmptyKey();

		static 
		{
		//    0    0:new             #2   <Class MakeXmlSignature$EmptyKey>
		//    1    3:dup             
		//    2    4:invokespecial   #16  <Method void MakeXmlSignature$EmptyKey()>
		//    3    7:putstatic       #18  <Field MakeXmlSignature$EmptyKey instance>
		//*   4   10:return          
		}

		private EmptyKey()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
		//    2    4:return          
		}
	}


	public MakeXmlSignature()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	private static XMLSignatureFactory createSignatureFactory()
	{
		return XMLSignatureFactory.getInstance("DOM", ((java.security.Provider) (new XMLDSigRI())));
	//    0    0:ldc1            #16  <String "DOM">
	//    1    2:new             #18  <Class XMLDSigRI>
	//    2    5:dup             
	//    3    6:invokespecial   #19  <Method void XMLDSigRI()>
	//    4    9:invokestatic    #25  <Method XMLSignatureFactory XMLSignatureFactory.getInstance(String, java.security.Provider)>
	//    5   12:areturn         
	}

	private static Element findElement(NodeList nodelist, String s)
	{
		for(int i = nodelist.getLength() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #33  <Method int NodeList.getLength()>
	//*   2    6:iconst_1        
	//*   3    7:isub            
	//*   4    8:istore_2        
	//*   5    9:iload_2         
	//*   6   10:iflt            56
		{
			Node node = nodelist.item(i);
	//    7   13:aload_0         
	//    8   14:iload_2         
	//    9   15:invokeinterface #37  <Method Node NodeList.item(int)>
	//   10   20:astore_3        
			if(node.getNodeType() == 1 && node.getLocalName().equals(((Object) (s))))
	//*  11   21:aload_3         
	//*  12   22:invokeinterface #43  <Method short Node.getNodeType()>
	//*  13   27:iconst_1        
	//*  14   28:icmpne          49
	//*  15   31:aload_3         
	//*  16   32:invokeinterface #47  <Method String Node.getLocalName()>
	//*  17   37:aload_1         
	//*  18   38:invokevirtual   #53  <Method boolean String.equals(Object)>
	//*  19   41:ifeq            49
				return (Element)node;
	//   20   44:aload_3         
	//   21   45:checkcast       #55  <Class Element>
	//   22   48:areturn         
		}

	//   23   49:iload_2         
	//   24   50:iconst_1        
	//   25   51:isub            
	//   26   52:istore_2        
	//*  27   53:goto            9
		return null;
	//   28   56:aconst_null     
	//   29   57:areturn         
	}

	private static Reference generateContentReference(XMLSignatureFactory xmlsignaturefactory, XmlSignatureAppearance xmlsignatureappearance, String s)
		throws GeneralSecurityException
	{
		javax.xml.crypto.dsig.DigestMethod digestmethod = xmlsignaturefactory.newDigestMethod("http://www.w3.org/2000/09/xmldsig#sha1", ((javax.xml.crypto.dsig.spec.DigestMethodParameterSpec) (null)));
	//    0    0:aload_0         
	//    1    1:ldc1            #61  <String "http://www.w3.org/2000/09/xmldsig#sha1">
	//    2    3:aconst_null     
	//    3    4:invokevirtual   #65  <Method javax.xml.crypto.dsig.DigestMethod XMLSignatureFactory.newDigestMethod(String, javax.xml.crypto.dsig.spec.DigestMethodParameterSpec)>
	//    4    7:astore_3        
		ArrayList arraylist = new ArrayList();
	//    5    8:new             #67  <Class ArrayList>
	//    6   11:dup             
	//    7   12:invokespecial   #68  <Method void ArrayList()>
	//    8   15:astore          4
		((List) (arraylist)).add(((Object) (xmlsignaturefactory.newTransform("http://www.w3.org/2000/09/xmldsig#enveloped-signature", (TransformParameterSpec)null))));
	//    9   17:aload           4
	//   10   19:aload_0         
	//   11   20:ldc1            #70  <String "http://www.w3.org/2000/09/xmldsig#enveloped-signature">
	//   12   22:aconst_null     
	//   13   23:checkcast       #72  <Class TransformParameterSpec>
	//   14   26:invokevirtual   #76  <Method javax.xml.crypto.dsig.Transform XMLSignatureFactory.newTransform(String, TransformParameterSpec)>
	//   15   29:invokeinterface #81  <Method boolean List.add(Object)>
	//   16   34:pop             
		xmlsignatureappearance = ((XmlSignatureAppearance) (xmlsignatureappearance.getXpathConstructor()));
	//   17   35:aload_1         
	//   18   36:invokevirtual   #87  <Method XpathConstructor XmlSignatureAppearance.getXpathConstructor()>
	//   19   39:astore_1        
		if(xmlsignatureappearance != null && ((XpathConstructor) (xmlsignatureappearance)).getXpathExpression().length() > 0)
	//*  20   40:aload_1         
	//*  21   41:ifnull          96
	//*  22   44:aload_1         
	//*  23   45:invokeinterface #92  <Method String XpathConstructor.getXpathExpression()>
	//*  24   50:invokevirtual   #95  <Method int String.length()>
	//*  25   53:ifle            96
			((List) (arraylist)).add(((Object) (xmlsignaturefactory.newTransform("http://www.w3.org/2002/06/xmldsig-filter2", ((TransformParameterSpec) (new XPathFilter2ParameterSpec(Collections.singletonList(((Object) (new XPathType(((XpathConstructor) (xmlsignatureappearance)).getXpathExpression(), javax.xml.crypto.dsig.spec.XPathType.Filter.INTERSECT)))))))))));
	//   26   56:aload           4
	//   27   58:aload_0         
	//   28   59:ldc1            #97  <String "http://www.w3.org/2002/06/xmldsig-filter2">
	//   29   61:new             #99  <Class XPathFilter2ParameterSpec>
	//   30   64:dup             
	//   31   65:new             #101 <Class XPathType>
	//   32   68:dup             
	//   33   69:aload_1         
	//   34   70:invokeinterface #92  <Method String XpathConstructor.getXpathExpression()>
	//   35   75:getstatic       #107 <Field javax.xml.crypto.dsig.spec.XPathType$Filter javax.xml.crypto.dsig.spec.XPathType$Filter.INTERSECT>
	//   36   78:invokespecial   #110 <Method void XPathType(String, javax.xml.crypto.dsig.spec.XPathType$Filter)>
	//   37   81:invokestatic    #116 <Method List Collections.singletonList(Object)>
	//   38   84:invokespecial   #119 <Method void XPathFilter2ParameterSpec(List)>
	//   39   87:invokevirtual   #76  <Method javax.xml.crypto.dsig.Transform XMLSignatureFactory.newTransform(String, TransformParameterSpec)>
	//   40   90:invokeinterface #81  <Method boolean List.add(Object)>
	//   41   95:pop             
		return xmlsignaturefactory.newReference("", digestmethod, ((List) (arraylist)), ((String) (null)), s);
	//   42   96:aload_0         
	//   43   97:ldc1            #121 <String "">
	//   44   99:aload_3         
	//   45  100:aload           4
	//   46  102:aconst_null     
	//   47  103:aload_2         
	//   48  104:invokevirtual   #125 <Method Reference XMLSignatureFactory.newReference(String, javax.xml.crypto.dsig.DigestMethod, List, String, String)>
	//   49  107:areturn         
	}

	private static Reference generateCustomReference(XMLSignatureFactory xmlsignaturefactory, String s, String s1, String s2)
		throws GeneralSecurityException
	{
		return xmlsignaturefactory.newReference(s, xmlsignaturefactory.newDigestMethod("http://www.w3.org/2000/09/xmldsig#sha1", ((javax.xml.crypto.dsig.spec.DigestMethodParameterSpec) (null))), ((List) (null)), s1, s2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:ldc1            #61  <String "http://www.w3.org/2000/09/xmldsig#sha1">
	//    4    5:aconst_null     
	//    5    6:invokevirtual   #65  <Method javax.xml.crypto.dsig.DigestMethod XMLSignatureFactory.newDigestMethod(String, javax.xml.crypto.dsig.spec.DigestMethodParameterSpec)>
	//    6    9:aconst_null     
	//    7   10:aload_2         
	//    8   11:aload_3         
	//    9   12:invokevirtual   #125 <Method Reference XMLSignatureFactory.newReference(String, javax.xml.crypto.dsig.DigestMethod, List, String, String)>
	//   10   15:areturn         
	}

	private static KeyInfo generateKeyInfo(PublicKey publickey)
		throws GeneralSecurityException
	{
		DOMKeyInfoFactory domkeyinfofactory = new DOMKeyInfoFactory();
	//    0    0:new             #132 <Class DOMKeyInfoFactory>
	//    1    3:dup             
	//    2    4:invokespecial   #133 <Method void DOMKeyInfoFactory()>
	//    3    7:astore_1        
		return ((KeyInfoFactory) (domkeyinfofactory)).newKeyInfo(Collections.singletonList(((Object) (((KeyInfoFactory) (domkeyinfofactory)).newKeyValue(publickey)))));
	//    4    8:aload_1         
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #139 <Method javax.xml.crypto.dsig.keyinfo.KeyValue KeyInfoFactory.newKeyValue(PublicKey)>
	//    8   14:invokestatic    #116 <Method List Collections.singletonList(Object)>
	//    9   17:invokevirtual   #143 <Method KeyInfo KeyInfoFactory.newKeyInfo(List)>
	//   10   20:areturn         
	}

	private static KeyInfo generateKeyInfo(Certificate acertificate[], XmlSignatureAppearance xmlsignatureappearance)
	{
		acertificate = ((Certificate []) (acertificate[0]));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aaload          
	//    3    3:astore_0        
		xmlsignatureappearance.setCertificate(((Certificate) (acertificate)));
	//    4    4:aload_1         
	//    5    5:aload_0         
	//    6    6:invokevirtual   #148 <Method void XmlSignatureAppearance.setCertificate(Certificate)>
		xmlsignatureappearance = ((XmlSignatureAppearance) (new DOMKeyInfoFactory()));
	//    7    9:new             #132 <Class DOMKeyInfoFactory>
	//    8   12:dup             
	//    9   13:invokespecial   #133 <Method void DOMKeyInfoFactory()>
	//   10   16:astore_1        
		return ((KeyInfoFactory) (xmlsignatureappearance)).newKeyInfo(Collections.singletonList(((Object) (((KeyInfoFactory) (xmlsignatureappearance)).newX509Data(Collections.singletonList(((Object) (acertificate))))))));
	//   11   17:aload_1         
	//   12   18:aload_1         
	//   13   19:aload_0         
	//   14   20:invokestatic    #116 <Method List Collections.singletonList(Object)>
	//   15   23:invokevirtual   #152 <Method javax.xml.crypto.dsig.keyinfo.X509Data KeyInfoFactory.newX509Data(List)>
	//   16   26:invokestatic    #116 <Method List Collections.singletonList(Object)>
	//   17   29:invokevirtual   #143 <Method KeyInfo KeyInfoFactory.newKeyInfo(List)>
	//   18   32:areturn         
	}

	private static XMLObject generateXadesObject(XMLSignatureFactory xmlsignaturefactory, XmlSignatureAppearance xmlsignatureappearance, String s, String s1, String s2, String as[])
		throws GeneralSecurityException
	{
		MessageDigest messagedigest = MessageDigest.getInstance("SHA1");
	//    0    0:ldc1            #156 <String "SHA1">
	//    1    2:invokestatic    #161 <Method MessageDigest MessageDigest.getInstance(String)>
	//    2    5:astore          8
		Certificate certificate = xmlsignatureappearance.getCertificate();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #165 <Method Certificate XmlSignatureAppearance.getCertificate()>
	//    5   11:astore          9
		Document document = xmlsignatureappearance.getXmlLocator().getDocument();
	//    6   13:aload_1         
	//    7   14:invokevirtual   #169 <Method XmlLocator XmlSignatureAppearance.getXmlLocator()>
	//    8   17:invokeinterface #175 <Method Document XmlLocator.getDocument()>
	//    9   22:astore          6
		Element element = document.createElementNS("http://uri.etsi.org/01903/v1.3.2#", "xades:QualifyingProperties");
	//   10   24:aload           6
	//   11   26:ldc1            #177 <String "http://uri.etsi.org/01903/v1.3.2#">
	//   12   28:ldc1            #179 <String "xades:QualifyingProperties">
	//   13   30:invokeinterface #185 <Method Element Document.createElementNS(String, String)>
	//   14   35:astore          7
		element.setAttribute("Target", (new StringBuilder()).append("#").append(s).toString());
	//   15   37:aload           7
	//   16   39:ldc1            #187 <String "Target">
	//   17   41:new             #189 <Class StringBuilder>
	//   18   44:dup             
	//   19   45:invokespecial   #190 <Method void StringBuilder()>
	//   20   48:ldc1            #192 <String "#">
	//   21   50:invokevirtual   #196 <Method StringBuilder StringBuilder.append(String)>
	//   22   53:aload_2         
	//   23   54:invokevirtual   #196 <Method StringBuilder StringBuilder.append(String)>
	//   24   57:invokevirtual   #199 <Method String StringBuilder.toString()>
	//   25   60:invokeinterface #203 <Method void Element.setAttribute(String, String)>
		s = ((String) (document.createElementNS("http://uri.etsi.org/01903/v1.3.2#", "xades:SignedProperties")));
	//   26   65:aload           6
	//   27   67:ldc1            #177 <String "http://uri.etsi.org/01903/v1.3.2#">
	//   28   69:ldc1            #205 <String "xades:SignedProperties">
	//   29   71:invokeinterface #185 <Method Element Document.createElementNS(String, String)>
	//   30   76:astore_2        
		((Element) (s)).setAttribute("Id", s2);
	//   31   77:aload_2         
	//   32   78:ldc1            #207 <String "Id">
	//   33   80:aload           4
	//   34   82:invokeinterface #203 <Method void Element.setAttribute(String, String)>
		((Element) (s)).setIdAttribute("Id", true);
	//   35   87:aload_2         
	//   36   88:ldc1            #207 <String "Id">
	//   37   90:iconst_1        
	//   38   91:invokeinterface #211 <Method void Element.setIdAttribute(String, boolean)>
		s2 = ((String) (document.createElementNS("http://uri.etsi.org/01903/v1.3.2#", "xades:SignedSignatureProperties")));
	//   39   96:aload           6
	//   40   98:ldc1            #177 <String "http://uri.etsi.org/01903/v1.3.2#">
	//   41  100:ldc1            #213 <String "xades:SignedSignatureProperties">
	//   42  102:invokeinterface #185 <Method Element Document.createElementNS(String, String)>
	//   43  107:astore          4
		Element element3 = document.createElementNS("http://uri.etsi.org/01903/v1.3.2#", "xades:SigningTime");
	//   44  109:aload           6
	//   45  111:ldc1            #177 <String "http://uri.etsi.org/01903/v1.3.2#">
	//   46  113:ldc1            #215 <String "xades:SigningTime">
	//   47  115:invokeinterface #185 <Method Element Document.createElementNS(String, String)>
	//   48  120:astore          10
		Object obj = ((Object) ((new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")).format(xmlsignatureappearance.getSignDate().getTime())));
	//   49  122:new             #217 <Class SimpleDateFormat>
	//   50  125:dup             
	//   51  126:ldc1            #219 <String "yyyy-MM-dd'T'HH:mm:ssZ">
	//   52  128:invokespecial   #222 <Method void SimpleDateFormat(String)>
	//   53  131:aload_1         
	//   54  132:invokevirtual   #226 <Method Calendar XmlSignatureAppearance.getSignDate()>
	//   55  135:invokevirtual   #232 <Method java.util.Date Calendar.getTime()>
	//   56  138:invokevirtual   #236 <Method String SimpleDateFormat.format(java.util.Date)>
	//   57  141:astore          11
		element3.appendChild(((Node) (document.createTextNode(((String) (obj)).substring(0, ((String) (obj)).length() - 2).concat(":").concat(((String) (obj)).substring(((String) (obj)).length() - 2))))));
	//   58  143:aload           10
	//   59  145:aload           6
	//   60  147:aload           11
	//   61  149:iconst_0        
	//   62  150:aload           11
	//   63  152:invokevirtual   #95  <Method int String.length()>
	//   64  155:iconst_2        
	//   65  156:isub            
	//   66  157:invokevirtual   #240 <Method String String.substring(int, int)>
	//   67  160:ldc1            #242 <String ":">
	//   68  162:invokevirtual   #246 <Method String String.concat(String)>
	//   69  165:aload           11
	//   70  167:aload           11
	//   71  169:invokevirtual   #95  <Method int String.length()>
	//   72  172:iconst_2        
	//   73  173:isub            
	//   74  174:invokevirtual   #249 <Method String String.substring(int)>
	//   75  177:invokevirtual   #246 <Method String String.concat(String)>
	//   76  180:invokeinterface #253 <Method org.w3c.dom.Text Document.createTextNode(String)>
	//   77  185:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//   78  190:pop             
		((Element) (s2)).appendChild(((Node) (element3)));
	//   79  191:aload           4
	//   80  193:aload           10
	//   81  195:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//   82  200:pop             
		element3 = document.createElementNS("http://uri.etsi.org/01903/v1.3.2#", "xades:SigningCertificate");
	//   83  201:aload           6
	//   84  203:ldc1            #177 <String "http://uri.etsi.org/01903/v1.3.2#">
	//   85  205:ldc2            #259 <String "xades:SigningCertificate">
	//   86  208:invokeinterface #185 <Method Element Document.createElementNS(String, String)>
	//   87  213:astore          10
		obj = ((Object) (document.createElementNS("http://uri.etsi.org/01903/v1.3.2#", "xades:Cert")));
	//   88  215:aload           6
	//   89  217:ldc1            #177 <String "http://uri.etsi.org/01903/v1.3.2#">
	//   90  219:ldc2            #261 <String "xades:Cert">
	//   91  222:invokeinterface #185 <Method Element Document.createElementNS(String, String)>
	//   92  227:astore          11
		Element element6 = document.createElementNS("http://uri.etsi.org/01903/v1.3.2#", "xades:CertDigest");
	//   93  229:aload           6
	//   94  231:ldc1            #177 <String "http://uri.etsi.org/01903/v1.3.2#">
	//   95  233:ldc2            #263 <String "xades:CertDigest">
	//   96  236:invokeinterface #185 <Method Element Document.createElementNS(String, String)>
	//   97  241:astore          12
		Element element9 = document.createElementNS("http://www.w3.org/2000/09/xmldsig#", "DigestMethod");
	//   98  243:aload           6
	//   99  245:ldc2            #265 <String "http://www.w3.org/2000/09/xmldsig#">
	//  100  248:ldc2            #267 <String "DigestMethod">
	//  101  251:invokeinterface #185 <Method Element Document.createElementNS(String, String)>
	//  102  256:astore          13
		element9.setAttribute("Algorithm", "http://www.w3.org/2000/09/xmldsig#sha1");
	//  103  258:aload           13
	//  104  260:ldc2            #269 <String "Algorithm">
	//  105  263:ldc1            #61  <String "http://www.w3.org/2000/09/xmldsig#sha1">
	//  106  265:invokeinterface #203 <Method void Element.setAttribute(String, String)>
		element6.appendChild(((Node) (element9)));
	//  107  270:aload           12
	//  108  272:aload           13
	//  109  274:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//  110  279:pop             
		element9 = document.createElementNS("http://www.w3.org/2000/09/xmldsig#", "DigestValue");
	//  111  280:aload           6
	//  112  282:ldc2            #265 <String "http://www.w3.org/2000/09/xmldsig#">
	//  113  285:ldc2            #271 <String "DigestValue">
	//  114  288:invokeinterface #185 <Method Element Document.createElementNS(String, String)>
	//  115  293:astore          13
		element9.appendChild(((Node) (document.createTextNode(Base64.encode(messagedigest.digest(certificate.getEncoded()))))));
	//  116  295:aload           13
	//  117  297:aload           6
	//  118  299:aload           8
	//  119  301:aload           9
	//  120  303:invokevirtual   #277 <Method byte[] Certificate.getEncoded()>
	//  121  306:invokevirtual   #281 <Method byte[] MessageDigest.digest(byte[])>
	//  122  309:invokestatic    #287 <Method String Base64.encode(byte[])>
	//  123  312:invokeinterface #253 <Method org.w3c.dom.Text Document.createTextNode(String)>
	//  124  317:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//  125  322:pop             
		element6.appendChild(((Node) (element9)));
	//  126  323:aload           12
	//  127  325:aload           13
	//  128  327:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//  129  332:pop             
		((Element) (obj)).appendChild(((Node) (element6)));
	//  130  333:aload           11
	//  131  335:aload           12
	//  132  337:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//  133  342:pop             
		if(certificate instanceof X509Certificate)
	//* 134  343:aload           9
	//* 135  345:instanceof      #289 <Class X509Certificate>
	//* 136  348:ifeq            471
		{
			Element element7 = document.createElementNS("http://uri.etsi.org/01903/v1.3.2#", "xades:IssuerSerial");
	//  137  351:aload           6
	//  138  353:ldc1            #177 <String "http://uri.etsi.org/01903/v1.3.2#">
	//  139  355:ldc2            #291 <String "xades:IssuerSerial">
	//  140  358:invokeinterface #185 <Method Element Document.createElementNS(String, String)>
	//  141  363:astore          12
			Element element10 = document.createElementNS("http://www.w3.org/2000/09/xmldsig#", "X509IssuerName");
	//  142  365:aload           6
	//  143  367:ldc2            #265 <String "http://www.w3.org/2000/09/xmldsig#">
	//  144  370:ldc2            #293 <String "X509IssuerName">
	//  145  373:invokeinterface #185 <Method Element Document.createElementNS(String, String)>
	//  146  378:astore          13
			element10.appendChild(((Node) (document.createTextNode(getX509IssuerName((X509Certificate)certificate)))));
	//  147  380:aload           13
	//  148  382:aload           6
	//  149  384:aload           9
	//  150  386:checkcast       #289 <Class X509Certificate>
	//  151  389:invokestatic    #297 <Method String getX509IssuerName(X509Certificate)>
	//  152  392:invokeinterface #253 <Method org.w3c.dom.Text Document.createTextNode(String)>
	//  153  397:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//  154  402:pop             
			element7.appendChild(((Node) (element10)));
	//  155  403:aload           12
	//  156  405:aload           13
	//  157  407:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//  158  412:pop             
			element10 = document.createElementNS("http://www.w3.org/2000/09/xmldsig#", "X509SerialNumber");
	//  159  413:aload           6
	//  160  415:ldc2            #265 <String "http://www.w3.org/2000/09/xmldsig#">
	//  161  418:ldc2            #299 <String "X509SerialNumber">
	//  162  421:invokeinterface #185 <Method Element Document.createElementNS(String, String)>
	//  163  426:astore          13
			element10.appendChild(((Node) (document.createTextNode(getX509SerialNumber((X509Certificate)certificate)))));
	//  164  428:aload           13
	//  165  430:aload           6
	//  166  432:aload           9
	//  167  434:checkcast       #289 <Class X509Certificate>
	//  168  437:invokestatic    #302 <Method String getX509SerialNumber(X509Certificate)>
	//  169  440:invokeinterface #253 <Method org.w3c.dom.Text Document.createTextNode(String)>
	//  170  445:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//  171  450:pop             
			element7.appendChild(((Node) (element10)));
	//  172  451:aload           12
	//  173  453:aload           13
	//  174  455:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//  175  460:pop             
			((Element) (obj)).appendChild(((Node) (element7)));
	//  176  461:aload           11
	//  177  463:aload           12
	//  178  465:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//  179  470:pop             
		}
		element3.appendChild(((Node) (obj)));
	//  180  471:aload           10
	//  181  473:aload           11
	//  182  475:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//  183  480:pop             
		((Element) (s2)).appendChild(((Node) (element3)));
	//  184  481:aload           4
	//  185  483:aload           10
	//  186  485:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//  187  490:pop             
		if(as != null)
	//* 188  491:aload           5
	//* 189  493:ifnull          781
		{
			Element element2 = document.createElementNS("http://uri.etsi.org/01903/v1.3.2#", "xades:SignaturePolicyIdentifier");
	//  190  496:aload           6
	//  191  498:ldc1            #177 <String "http://uri.etsi.org/01903/v1.3.2#">
	//  192  500:ldc2            #304 <String "xades:SignaturePolicyIdentifier">
	//  193  503:invokeinterface #185 <Method Element Document.createElementNS(String, String)>
	//  194  508:astore          9
			Element element4 = document.createElementNS("http://uri.etsi.org/01903/v1.3.2#", "xades:SignaturePolicyId");
	//  195  510:aload           6
	//  196  512:ldc1            #177 <String "http://uri.etsi.org/01903/v1.3.2#">
	//  197  514:ldc2            #306 <String "xades:SignaturePolicyId">
	//  198  517:invokeinterface #185 <Method Element Document.createElementNS(String, String)>
	//  199  522:astore          10
			Element element5 = document.createElementNS("http://uri.etsi.org/01903/v1.3.2#", "xades:SigPolicyId");
	//  200  524:aload           6
	//  201  526:ldc1            #177 <String "http://uri.etsi.org/01903/v1.3.2#">
	//  202  528:ldc2            #308 <String "xades:SigPolicyId">
	//  203  531:invokeinterface #185 <Method Element Document.createElementNS(String, String)>
	//  204  536:astore          11
			Element element8 = document.createElementNS("http://uri.etsi.org/01903/v1.3.2#", "xades:Identifier");
	//  205  538:aload           6
	//  206  540:ldc1            #177 <String "http://uri.etsi.org/01903/v1.3.2#">
	//  207  542:ldc2            #310 <String "xades:Identifier">
	//  208  545:invokeinterface #185 <Method Element Document.createElementNS(String, String)>
	//  209  550:astore          12
			element8.appendChild(((Node) (document.createTextNode(as[0]))));
	//  210  552:aload           12
	//  211  554:aload           6
	//  212  556:aload           5
	//  213  558:iconst_0        
	//  214  559:aaload          
	//  215  560:invokeinterface #253 <Method org.w3c.dom.Text Document.createTextNode(String)>
	//  216  565:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//  217  570:pop             
			element8.setAttribute("Qualifier", "OIDAsURN");
	//  218  571:aload           12
	//  219  573:ldc2            #312 <String "Qualifier">
	//  220  576:ldc2            #314 <String "OIDAsURN">
	//  221  579:invokeinterface #203 <Method void Element.setAttribute(String, String)>
			element5.appendChild(((Node) (element8)));
	//  222  584:aload           11
	//  223  586:aload           12
	//  224  588:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//  225  593:pop             
			element8 = document.createElementNS("http://uri.etsi.org/01903/v1.3.2#", "xades:Description");
	//  226  594:aload           6
	//  227  596:ldc1            #177 <String "http://uri.etsi.org/01903/v1.3.2#">
	//  228  598:ldc2            #316 <String "xades:Description">
	//  229  601:invokeinterface #185 <Method Element Document.createElementNS(String, String)>
	//  230  606:astore          12
			element8.appendChild(((Node) (document.createTextNode(as[1]))));
	//  231  608:aload           12
	//  232  610:aload           6
	//  233  612:aload           5
	//  234  614:iconst_1        
	//  235  615:aaload          
	//  236  616:invokeinterface #253 <Method org.w3c.dom.Text Document.createTextNode(String)>
	//  237  621:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//  238  626:pop             
			element5.appendChild(((Node) (element8)));
	//  239  627:aload           11
	//  240  629:aload           12
	//  241  631:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//  242  636:pop             
			element4.appendChild(((Node) (element5)));
	//  243  637:aload           10
	//  244  639:aload           11
	//  245  641:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//  246  646:pop             
			as = ((String []) (document.createElementNS("http://uri.etsi.org/01903/v1.3.2#", "xades:SigPolicyHash")));
	//  247  647:aload           6
	//  248  649:ldc1            #177 <String "http://uri.etsi.org/01903/v1.3.2#">
	//  249  651:ldc2            #318 <String "xades:SigPolicyHash">
	//  250  654:invokeinterface #185 <Method Element Document.createElementNS(String, String)>
	//  251  659:astore          5
			element8 = document.createElementNS("http://www.w3.org/2000/09/xmldsig#", "DigestMethod");
	//  252  661:aload           6
	//  253  663:ldc2            #265 <String "http://www.w3.org/2000/09/xmldsig#">
	//  254  666:ldc2            #267 <String "DigestMethod">
	//  255  669:invokeinterface #185 <Method Element Document.createElementNS(String, String)>
	//  256  674:astore          12
			element8.setAttribute("Algorithm", "http://www.w3.org/2000/09/xmldsig#sha1");
	//  257  676:aload           12
	//  258  678:ldc2            #269 <String "Algorithm">
	//  259  681:ldc1            #61  <String "http://www.w3.org/2000/09/xmldsig#sha1">
	//  260  683:invokeinterface #203 <Method void Element.setAttribute(String, String)>
			((Element) (as)).appendChild(((Node) (element8)));
	//  261  688:aload           5
	//  262  690:aload           12
	//  263  692:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//  264  697:pop             
			element8 = document.createElementNS("http://www.w3.org/2000/09/xmldsig#", "DigestValue");
	//  265  698:aload           6
	//  266  700:ldc2            #265 <String "http://www.w3.org/2000/09/xmldsig#">
	//  267  703:ldc2            #271 <String "DigestValue">
	//  268  706:invokeinterface #185 <Method Element Document.createElementNS(String, String)>
	//  269  711:astore          12
			element8.appendChild(((Node) (document.createTextNode(Base64.encode(messagedigest.digest(getByteArrayOfNode(((Node) (element5)))))))));
	//  270  713:aload           12
	//  271  715:aload           6
	//  272  717:aload           8
	//  273  719:aload           11
	//  274  721:invokestatic    #322 <Method byte[] getByteArrayOfNode(Node)>
	//  275  724:invokevirtual   #281 <Method byte[] MessageDigest.digest(byte[])>
	//  276  727:invokestatic    #287 <Method String Base64.encode(byte[])>
	//  277  730:invokeinterface #253 <Method org.w3c.dom.Text Document.createTextNode(String)>
	//  278  735:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//  279  740:pop             
			((Element) (as)).appendChild(((Node) (element8)));
	//  280  741:aload           5
	//  281  743:aload           12
	//  282  745:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//  283  750:pop             
			element4.appendChild(((Node) (as)));
	//  284  751:aload           10
	//  285  753:aload           5
	//  286  755:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//  287  760:pop             
			element2.appendChild(((Node) (element4)));
	//  288  761:aload           9
	//  289  763:aload           10
	//  290  765:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//  291  770:pop             
			((Element) (s2)).appendChild(((Node) (element2)));
	//  292  771:aload           4
	//  293  773:aload           9
	//  294  775:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//  295  780:pop             
		}
		((Element) (s)).appendChild(((Node) (s2)));
	//  296  781:aload_2         
	//  297  782:aload           4
	//  298  784:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//  299  789:pop             
		s2 = ((String) (document.createElement("xades:SignedDataObjectProperties")));
	//  300  790:aload           6
	//  301  792:ldc2            #324 <String "xades:SignedDataObjectProperties">
	//  302  795:invokeinterface #328 <Method Element Document.createElement(String)>
	//  303  800:astore          4
		as = ((String []) (document.createElement("xades:DataObjectFormat")));
	//  304  802:aload           6
	//  305  804:ldc2            #330 <String "xades:DataObjectFormat">
	//  306  807:invokeinterface #328 <Method Element Document.createElement(String)>
	//  307  812:astore          5
		((Element) (as)).setAttribute("ObjectReference", (new StringBuilder()).append("#").append(s1).toString());
	//  308  814:aload           5
	//  309  816:ldc2            #332 <String "ObjectReference">
	//  310  819:new             #189 <Class StringBuilder>
	//  311  822:dup             
	//  312  823:invokespecial   #190 <Method void StringBuilder()>
	//  313  826:ldc1            #192 <String "#">
	//  314  828:invokevirtual   #196 <Method StringBuilder StringBuilder.append(String)>
	//  315  831:aload_3         
	//  316  832:invokevirtual   #196 <Method StringBuilder StringBuilder.append(String)>
	//  317  835:invokevirtual   #199 <Method String StringBuilder.toString()>
	//  318  838:invokeinterface #203 <Method void Element.setAttribute(String, String)>
		s1 = xmlsignatureappearance.getDescription();
	//  319  843:aload_1         
	//  320  844:invokevirtual   #335 <Method String XmlSignatureAppearance.getDescription()>
	//  321  847:astore_3        
		if(s1 != null)
	//* 322  848:aload_3         
	//* 323  849:ifnull          890
		{
			Element element1 = document.createElement("xades:Description");
	//  324  852:aload           6
	//  325  854:ldc2            #316 <String "xades:Description">
	//  326  857:invokeinterface #328 <Method Element Document.createElement(String)>
	//  327  862:astore          8
			element1.appendChild(((Node) (document.createTextNode(s1))));
	//  328  864:aload           8
	//  329  866:aload           6
	//  330  868:aload_3         
	//  331  869:invokeinterface #253 <Method org.w3c.dom.Text Document.createTextNode(String)>
	//  332  874:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//  333  879:pop             
			((Element) (as)).appendChild(((Node) (element1)));
	//  334  880:aload           5
	//  335  882:aload           8
	//  336  884:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//  337  889:pop             
		}
		s1 = ((String) (document.createElement("xades:MimeType")));
	//  338  890:aload           6
	//  339  892:ldc2            #337 <String "xades:MimeType">
	//  340  895:invokeinterface #328 <Method Element Document.createElement(String)>
	//  341  900:astore_3        
		((Element) (s1)).appendChild(((Node) (document.createTextNode(xmlsignatureappearance.getMimeType()))));
	//  342  901:aload_3         
	//  343  902:aload           6
	//  344  904:aload_1         
	//  345  905:invokevirtual   #340 <Method String XmlSignatureAppearance.getMimeType()>
	//  346  908:invokeinterface #253 <Method org.w3c.dom.Text Document.createTextNode(String)>
	//  347  913:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//  348  918:pop             
		((Element) (as)).appendChild(((Node) (s1)));
	//  349  919:aload           5
	//  350  921:aload_3         
	//  351  922:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//  352  927:pop             
		xmlsignatureappearance = ((XmlSignatureAppearance) (xmlsignatureappearance.getXmlLocator().getEncoding()));
	//  353  928:aload_1         
	//  354  929:invokevirtual   #169 <Method XmlLocator XmlSignatureAppearance.getXmlLocator()>
	//  355  932:invokeinterface #343 <Method String XmlLocator.getEncoding()>
	//  356  937:astore_1        
		if(xmlsignatureappearance != null)
	//* 357  938:aload_1         
	//* 358  939:ifnull          977
		{
			s1 = ((String) (document.createElement("xades:Encoding")));
	//  359  942:aload           6
	//  360  944:ldc2            #345 <String "xades:Encoding">
	//  361  947:invokeinterface #328 <Method Element Document.createElement(String)>
	//  362  952:astore_3        
			((Element) (s1)).appendChild(((Node) (document.createTextNode(((String) (xmlsignatureappearance))))));
	//  363  953:aload_3         
	//  364  954:aload           6
	//  365  956:aload_1         
	//  366  957:invokeinterface #253 <Method org.w3c.dom.Text Document.createTextNode(String)>
	//  367  962:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//  368  967:pop             
			((Element) (as)).appendChild(((Node) (s1)));
	//  369  968:aload           5
	//  370  970:aload_3         
	//  371  971:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//  372  976:pop             
		}
		((Element) (s2)).appendChild(((Node) (as)));
	//  373  977:aload           4
	//  374  979:aload           5
	//  375  981:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//  376  986:pop             
		((Element) (s)).appendChild(((Node) (s2)));
	//  377  987:aload_2         
	//  378  988:aload           4
	//  379  990:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//  380  995:pop             
		element.appendChild(((Node) (s)));
	//  381  996:aload           7
	//  382  998:aload_2         
	//  383  999:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//  384 1004:pop             
		return xmlsignaturefactory.newXMLObject(Collections.singletonList(((Object) (new DOMStructure(((Node) (element)))))), ((String) (null)), ((String) (null)), ((String) (null)));
	//  385 1005:aload_0         
	//  386 1006:new             #347 <Class DOMStructure>
	//  387 1009:dup             
	//  388 1010:aload           7
	//  389 1012:invokespecial   #350 <Method void DOMStructure(Node)>
	//  390 1015:invokestatic    #116 <Method List Collections.singletonList(Object)>
	//  391 1018:aconst_null     
	//  392 1019:aconst_null     
	//  393 1020:aconst_null     
	//  394 1021:invokevirtual   #354 <Method XMLObject XMLSignatureFactory.newXMLObject(List, String, String, String)>
	//  395 1024:areturn         
	}

	private static byte[] getByteArrayOfNode(Node node)
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #358 <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #359 <Method void ByteArrayOutputStream()>
	//    3    7:astore_1        
		try
		{
			StreamResult streamresult = new StreamResult(((java.io.Writer) (new StringWriter())));
	//    4    8:new             #361 <Class StreamResult>
	//    5   11:dup             
	//    6   12:new             #363 <Class StringWriter>
	//    7   15:dup             
	//    8   16:invokespecial   #364 <Method void StringWriter()>
	//    9   19:invokespecial   #367 <Method void StreamResult(java.io.Writer)>
	//   10   22:astore_2        
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
	//   11   23:invokestatic    #373 <Method TransformerFactory TransformerFactory.newInstance()>
	//   12   26:invokevirtual   #377 <Method Transformer TransformerFactory.newTransformer()>
	//   13   29:astore_3        
			transformer.setOutputProperty("omit-xml-declaration", "yes");
	//   14   30:aload_3         
	//   15   31:ldc2            #379 <String "omit-xml-declaration">
	//   16   34:ldc2            #381 <String "yes">
	//   17   37:invokevirtual   #386 <Method void Transformer.setOutputProperty(String, String)>
			transformer.transform(((javax.xml.transform.Source) (new DOMSource(node))), ((javax.xml.transform.Result) (streamresult)));
	//   18   40:aload_3         
	//   19   41:new             #388 <Class DOMSource>
	//   20   44:dup             
	//   21   45:aload_0         
	//   22   46:invokespecial   #389 <Method void DOMSource(Node)>
	//   23   49:aload_2         
	//   24   50:invokevirtual   #393 <Method void Transformer.transform(javax.xml.transform.Source, javax.xml.transform.Result)>
			node = ((Node) (((Object) (streamresult.getWriter())).toString().getBytes()));
	//   25   53:aload_2         
	//   26   54:invokevirtual   #397 <Method java.io.Writer StreamResult.getWriter()>
	//   27   57:invokevirtual   #398 <Method String Object.toString()>
	//   28   60:invokevirtual   #401 <Method byte[] String.getBytes()>
	//   29   63:astore_0        
		}
	//*  30   64:aload_0         
	//*  31   65:areturn         
		// Misplaced declaration of an exception variable
		catch(Node node)
	//*  32   66:astore_0        
		{
			return bytearrayoutputstream.toByteArray();
	//   33   67:aload_1         
	//   34   68:invokevirtual   #404 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   35   71:areturn         
		}
		return ((byte []) (node));
	}

	private static String getRandomId()
	{
		return UUID.randomUUID().toString().substring(24);
	//    0    0:invokestatic    #411 <Method UUID UUID.randomUUID()>
	//    1    3:invokevirtual   #412 <Method String UUID.toString()>
	//    2    6:bipush          24
	//    3    8:invokevirtual   #249 <Method String String.substring(int)>
	//    4   11:areturn         
	}

	private static String getX509IssuerName(X509Certificate x509certificate)
	{
		return x509certificate.getIssuerX500Principal().toString();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #416 <Method X500Principal X509Certificate.getIssuerX500Principal()>
	//    2    4:invokevirtual   #419 <Method String X500Principal.toString()>
	//    3    7:areturn         
	}

	private static String getX509SerialNumber(X509Certificate x509certificate)
	{
		return x509certificate.getSerialNumber().toString();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #423 <Method BigInteger X509Certificate.getSerialNumber()>
	//    2    4:invokevirtual   #426 <Method String BigInteger.toString()>
	//    3    7:areturn         
	}

	private static void sign(XMLSignatureFactory xmlsignaturefactory, ExternalSignature externalsignature, XmlLocator xmllocator, DOMSignedInfo domsignedinfo, XMLObject xmlobject, KeyInfo keyinfo, String s)
		throws DocumentException
	{
		Document document = xmllocator.getDocument();
	//    0    0:aload_2         
	//    1    1:invokeinterface #175 <Method Document XmlLocator.getDocument()>
	//    2    6:astore          9
		DOMSignContext domsigncontext = new DOMSignContext(((Key) (EmptyKey.getInstance())), ((Node) (document.getDocumentElement())));
	//    3    8:new             #432 <Class DOMSignContext>
	//    4   11:dup             
	//    5   12:invokestatic    #435 <Method MakeXmlSignature$EmptyKey MakeXmlSignature$EmptyKey.getInstance()>
	//    6   15:aload           9
	//    7   17:invokeinterface #439 <Method Element Document.getDocumentElement()>
	//    8   22:invokespecial   #442 <Method void DOMSignContext(Key, Node)>
	//    9   25:astore          10
		List list = null;
	//   10   27:aconst_null     
	//   11   28:astore          8
		if(xmlobject != null)
	//*  12   30:aload           4
	//*  13   32:ifnull          42
			list = Collections.singletonList(((Object) (xmlobject)));
	//   14   35:aload           4
	//   15   37:invokestatic    #116 <Method List Collections.singletonList(Object)>
	//   16   40:astore          8
		xmlobject = ((XMLObject) ((DOMXMLSignature)xmlsignaturefactory.newXMLSignature(((javax.xml.crypto.dsig.SignedInfo) (domsignedinfo)), keyinfo, list, s, ((String) (null)))));
	//   17   42:aload_0         
	//   18   43:aload_3         
	//   19   44:aload           5
	//   20   46:aload           8
	//   21   48:aload           6
	//   22   50:aconst_null     
	//   23   51:invokevirtual   #446 <Method javax.xml.crypto.dsig.XMLSignature XMLSignatureFactory.newXMLSignature(javax.xml.crypto.dsig.SignedInfo, KeyInfo, List, String, String)>
	//   24   54:checkcast       #448 <Class DOMXMLSignature>
	//   25   57:astore          4
		xmlsignaturefactory = ((XMLSignatureFactory) (new ByteArrayOutputStream()));
	//   26   59:new             #358 <Class ByteArrayOutputStream>
	//   27   62:dup             
	//   28   63:invokespecial   #359 <Method void ByteArrayOutputStream()>
	//   29   66:astore_0        
		int i;
		try
		{
			((DOMXMLSignature) (xmlobject)).marshal(domsigncontext.getParent(), domsigncontext.getNextSibling(), DOMUtils.getSignaturePrefix(((javax.xml.crypto.XMLCryptoContext) (domsigncontext))), ((javax.xml.crypto.dom.DOMCryptoContext) (domsigncontext)));
	//   30   67:aload           4
	//   31   69:aload           10
	//   32   71:invokevirtual   #452 <Method Node DOMSignContext.getParent()>
	//   33   74:aload           10
	//   34   76:invokevirtual   #455 <Method Node DOMSignContext.getNextSibling()>
	//   35   79:aload           10
	//   36   81:invokestatic    #461 <Method String DOMUtils.getSignaturePrefix(javax.xml.crypto.XMLCryptoContext)>
	//   37   84:aload           10
	//   38   86:invokevirtual   #465 <Method void DOMXMLSignature.marshal(Node, Node, String, javax.xml.crypto.dom.DOMCryptoContext)>
			xmlobject = ((XMLObject) (findElement(document.getDocumentElement().getChildNodes(), "Signature")));
	//   39   89:aload           9
	//   40   91:invokeinterface #439 <Method Element Document.getDocumentElement()>
	//   41   96:invokeinterface #469 <Method NodeList Element.getChildNodes()>
	//   42  101:ldc2            #471 <String "Signature">
	//   43  104:invokestatic    #473 <Method Element findElement(NodeList, String)>
	//   44  107:astore          4
		}
	//*  45  109:aload           6
	//*  46  111:ifnull          129
	//*  47  114:aload           4
	//*  48  116:ldc2            #475 <String "http://www.w3.org/2000/xmlns/">
	//*  49  119:ldc2            #477 <String "xmlns:xades">
	//*  50  122:ldc1            #177 <String "http://uri.etsi.org/01903/v1.3.2#">
	//*  51  124:invokeinterface #481 <Method void Element.setAttributeNS(String, String, String)>
	//*  52  129:aload_3         
	//*  53  130:invokevirtual   #487 <Method List DOMSignedInfo.getReferences()>
	//*  54  133:astore          5
	//*  55  135:iconst_0        
	//*  56  136:istore          7
	//*  57  138:iload           7
	//*  58  140:aload           5
	//*  59  142:invokeinterface #490 <Method int List.size()>
	//*  60  147:icmpge          176
	//*  61  150:aload           5
	//*  62  152:iload           7
	//*  63  154:invokeinterface #494 <Method Object List.get(int)>
	//*  64  159:checkcast       #496 <Class DOMReference>
	//*  65  162:aload           10
	//*  66  164:invokevirtual   #499 <Method void DOMReference.digest(javax.xml.crypto.dsig.XMLSignContext)>
	//*  67  167:iload           7
	//*  68  169:iconst_1        
	//*  69  170:iadd            
	//*  70  171:istore          7
	//*  71  173:goto            138
	//*  72  176:aload_3         
	//*  73  177:aload           10
	//*  74  179:aload_0         
	//*  75  180:invokevirtual   #503 <Method void DOMSignedInfo.canonicalize(javax.xml.crypto.XMLCryptoContext, ByteArrayOutputStream)>
	//*  76  183:aload           4
	//*  77  185:invokeinterface #469 <Method NodeList Element.getChildNodes()>
	//*  78  190:ldc2            #505 <String "SignatureValue">
	//*  79  193:invokestatic    #473 <Method Element findElement(NodeList, String)>
	//*  80  196:aload           9
	//*  81  198:aload_1         
	//*  82  199:aload_0         
	//*  83  200:invokevirtual   #404 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//*  84  203:invokeinterface #509 <Method byte[] ExternalSignature.sign(byte[])>
	//*  85  208:invokestatic    #287 <Method String Base64.encode(byte[])>
	//*  86  211:invokeinterface #253 <Method org.w3c.dom.Text Document.createTextNode(String)>
	//*  87  216:invokeinterface #257 <Method Node Element.appendChild(Node)>
	//*  88  221:pop             
	//*  89  222:aload_2         
	//*  90  223:aload           9
	//*  91  225:invokeinterface #513 <Method void XmlLocator.setDocument(Document)>
	//*  92  230:return          
		// Misplaced declaration of an exception variable
		catch(XMLSignatureFactory xmlsignaturefactory)
	//*  93  231:astore_0        
		{
			throw new DocumentException(((Exception) (xmlsignaturefactory)));
	//   94  232:new             #430 <Class DocumentException>
	//   95  235:dup             
	//   96  236:aload_0         
	//   97  237:invokespecial   #516 <Method void DocumentException(Exception)>
	//   98  240:athrow          
		}
		if(s == null)
			break MISSING_BLOCK_LABEL_129;
		((Element) (xmlobject)).setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:xades", "http://uri.etsi.org/01903/v1.3.2#");
		keyinfo = ((KeyInfo) (domsignedinfo.getReferences()));
		i = 0;
_L2:
		if(i >= ((List) (keyinfo)).size())
			break; /* Loop/switch isn't completed */
		((DOMReference)((List) (keyinfo)).get(i)).digest(((javax.xml.crypto.dsig.XMLSignContext) (domsigncontext)));
		i++;
		if(true) goto _L2; else goto _L1
_L1:
		domsignedinfo.canonicalize(((javax.xml.crypto.XMLCryptoContext) (domsigncontext)), ((ByteArrayOutputStream) (xmlsignaturefactory)));
		findElement(((Element) (xmlobject)).getChildNodes(), "SignatureValue").appendChild(((Node) (document.createTextNode(Base64.encode(externalsignature.sign(((ByteArrayOutputStream) (xmlsignaturefactory)).toByteArray()))))));
		xmllocator.setDocument(document);
		return;
	}

	public static void signXades(XmlSignatureAppearance xmlsignatureappearance, ExternalSignature externalsignature, Certificate acertificate[], boolean flag)
		throws GeneralSecurityException, DocumentException, IOException
	{
		verifyArguments(xmlsignatureappearance, externalsignature);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #524 <Method void verifyArguments(XmlSignatureAppearance, ExternalSignature)>
		Object obj = null;
	//    3    5:aconst_null     
	//    4    6:astore          4
		String s;
		XMLSignatureFactory xmlsignaturefactory;
		KeyInfo keyinfo;
		Object obj1;
		Object obj2;
		if(externalsignature.getEncryptionAlgorithm().equals("RSA"))
	//*   5    8:aload_1         
	//*   6    9:invokeinterface #527 <Method String ExternalSignature.getEncryptionAlgorithm()>
	//*   7   14:ldc2            #529 <String "RSA">
	//*   8   17:invokevirtual   #53  <Method boolean String.equals(Object)>
	//*   9   20:ifeq            271
			obj = "http://www.w3.org/2000/09/xmldsig#rsa-sha1";
	//   10   23:ldc2            #531 <String "http://www.w3.org/2000/09/xmldsig#rsa-sha1">
	//   11   26:astore          4
		else
	//*  12   28:new             #189 <Class StringBuilder>
	//*  13   31:dup             
	//*  14   32:invokespecial   #190 <Method void StringBuilder()>
	//*  15   35:ldc2            #533 <String "Reference-">
	//*  16   38:invokevirtual   #196 <Method StringBuilder StringBuilder.append(String)>
	//*  17   41:invokestatic    #535 <Method String getRandomId()>
	//*  18   44:invokevirtual   #196 <Method StringBuilder StringBuilder.append(String)>
	//*  19   47:invokevirtual   #199 <Method String StringBuilder.toString()>
	//*  20   50:astore          9
	//*  21   52:new             #189 <Class StringBuilder>
	//*  22   55:dup             
	//*  23   56:invokespecial   #190 <Method void StringBuilder()>
	//*  24   59:ldc2            #537 <String "SignedProperties-">
	//*  25   62:invokevirtual   #196 <Method StringBuilder StringBuilder.append(String)>
	//*  26   65:invokestatic    #535 <Method String getRandomId()>
	//*  27   68:invokevirtual   #196 <Method StringBuilder StringBuilder.append(String)>
	//*  28   71:invokevirtual   #199 <Method String StringBuilder.toString()>
	//*  29   74:astore          8
	//*  30   76:new             #189 <Class StringBuilder>
	//*  31   79:dup             
	//*  32   80:invokespecial   #190 <Method void StringBuilder()>
	//*  33   83:ldc2            #539 <String "Signature-">
	//*  34   86:invokevirtual   #196 <Method StringBuilder StringBuilder.append(String)>
	//*  35   89:invokestatic    #535 <Method String getRandomId()>
	//*  36   92:invokevirtual   #196 <Method StringBuilder StringBuilder.append(String)>
	//*  37   95:invokevirtual   #199 <Method String StringBuilder.toString()>
	//*  38   98:astore          5
	//*  39  100:invokestatic    #541 <Method XMLSignatureFactory createSignatureFactory()>
	//*  40  103:astore          6
	//*  41  105:aload_2         
	//*  42  106:aload_0         
	//*  43  107:invokestatic    #543 <Method KeyInfo generateKeyInfo(Certificate[], XmlSignatureAppearance)>
	//*  44  110:astore          7
	//*  45  112:aconst_null     
	//*  46  113:astore_2        
	//*  47  114:iload_3         
	//*  48  115:ifeq            146
	//*  49  118:iconst_2        
	//*  50  119:anewarray       String[]
	//*  51  122:astore_2        
	//*  52  123:aload           4
	//*  53  125:ldc2            #531 <String "http://www.w3.org/2000/09/xmldsig#rsa-sha1">
	//*  54  128:invokevirtual   #53  <Method boolean String.equals(Object)>
	//*  55  131:ifeq            294
	//*  56  134:aload_2         
	//*  57  135:iconst_0        
	//*  58  136:ldc2            #545 <String "urn:oid:1.2.840.113549.1.1.5">
	//*  59  139:aastore         
	//*  60  140:aload_2         
	//*  61  141:iconst_1        
	//*  62  142:ldc2            #547 <String "RSA (PKCS #1 v1.5) with SHA-1 signature">
	//*  63  145:aastore         
	//*  64  146:aload           6
	//*  65  148:aload_0         
	//*  66  149:aload           5
	//*  67  151:aload           9
	//*  68  153:aload           8
	//*  69  155:aload_2         
	//*  70  156:invokestatic    #549 <Method XMLObject generateXadesObject(XMLSignatureFactory, XmlSignatureAppearance, String, String, String, String[])>
	//*  71  159:astore_2        
	//*  72  160:aload           6
	//*  73  162:aload_0         
	//*  74  163:aload           9
	//*  75  165:invokestatic    #551 <Method Reference generateContentReference(XMLSignatureFactory, XmlSignatureAppearance, String)>
	//*  76  168:astore          9
	//*  77  170:iconst_2        
	//*  78  171:anewarray       Reference[]
	//*  79  174:dup             
	//*  80  175:iconst_0        
	//*  81  176:aload           6
	//*  82  178:new             #189 <Class StringBuilder>
	//*  83  181:dup             
	//*  84  182:invokespecial   #190 <Method void StringBuilder()>
	//*  85  185:ldc1            #192 <String "#">
	//*  86  187:invokevirtual   #196 <Method StringBuilder StringBuilder.append(String)>
	//*  87  190:aload           8
	//*  88  192:invokevirtual   #196 <Method StringBuilder StringBuilder.append(String)>
	//*  89  195:invokevirtual   #199 <Method String StringBuilder.toString()>
	//*  90  198:ldc2            #555 <String "http://uri.etsi.org/01903#SignedProperties">
	//*  91  201:aconst_null     
	//*  92  202:invokestatic    #557 <Method Reference generateCustomReference(XMLSignatureFactory, String, String, String)>
	//*  93  205:aastore         
	//*  94  206:dup             
	//*  95  207:iconst_1        
	//*  96  208:aload           9
	//*  97  210:aastore         
	//*  98  211:invokestatic    #563 <Method List Arrays.asList(Object[])>
	//*  99  214:astore          8
	//* 100  216:aload           6
	//* 101  218:aload           6
	//* 102  220:ldc2            #565 <String "http://www.w3.org/TR/2001/REC-xml-c14n-20010315">
	//* 103  223:aconst_null     
	//* 104  224:checkcast       #567 <Class C14NMethodParameterSpec>
	//* 105  227:invokevirtual   #571 <Method javax.xml.crypto.dsig.CanonicalizationMethod XMLSignatureFactory.newCanonicalizationMethod(String, C14NMethodParameterSpec)>
	//* 106  230:aload           6
	//* 107  232:aload           4
	//* 108  234:aconst_null     
	//* 109  235:invokevirtual   #575 <Method javax.xml.crypto.dsig.SignatureMethod XMLSignatureFactory.newSignatureMethod(String, javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec)>
	//* 110  238:aload           8
	//* 111  240:aconst_null     
	//* 112  241:invokevirtual   #579 <Method javax.xml.crypto.dsig.SignedInfo XMLSignatureFactory.newSignedInfo(javax.xml.crypto.dsig.CanonicalizationMethod, javax.xml.crypto.dsig.SignatureMethod, List, String)>
	//* 113  244:checkcast       #483 <Class DOMSignedInfo>
	//* 114  247:astore          4
	//* 115  249:aload           6
	//* 116  251:aload_1         
	//* 117  252:aload_0         
	//* 118  253:invokevirtual   #169 <Method XmlLocator XmlSignatureAppearance.getXmlLocator()>
	//* 119  256:aload           4
	//* 120  258:aload_2         
	//* 121  259:aload           7
	//* 122  261:aload           5
	//* 123  263:invokestatic    #581 <Method void sign(XMLSignatureFactory, ExternalSignature, XmlLocator, DOMSignedInfo, XMLObject, KeyInfo, String)>
	//* 124  266:aload_0         
	//* 125  267:invokevirtual   #584 <Method void XmlSignatureAppearance.close()>
	//* 126  270:return          
		if(externalsignature.getEncryptionAlgorithm().equals("DSA"))
	//* 127  271:aload_1         
	//* 128  272:invokeinterface #527 <Method String ExternalSignature.getEncryptionAlgorithm()>
	//* 129  277:ldc2            #586 <String "DSA">
	//* 130  280:invokevirtual   #53  <Method boolean String.equals(Object)>
	//* 131  283:ifeq            28
			obj = "http://www.w3.org/2000/09/xmldsig#dsa-sha1";
	//  132  286:ldc2            #588 <String "http://www.w3.org/2000/09/xmldsig#dsa-sha1">
	//  133  289:astore          4
		obj2 = ((Object) ((new StringBuilder()).append("Reference-").append(getRandomId()).toString()));
		obj1 = ((Object) ((new StringBuilder()).append("SignedProperties-").append(getRandomId()).toString()));
		s = (new StringBuilder()).append("Signature-").append(getRandomId()).toString();
		xmlsignaturefactory = createSignatureFactory();
		keyinfo = generateKeyInfo(acertificate, xmlsignatureappearance);
		acertificate = null;
		if(flag)
		{
			acertificate = ((Certificate []) (new String[2]));
			if(((String) (obj)).equals("http://www.w3.org/2000/09/xmldsig#rsa-sha1"))
			{
				acertificate[0] = "urn:oid:1.2.840.113549.1.1.5";
				acertificate[1] = "RSA (PKCS #1 v1.5) with SHA-1 signature";
			} else
	//* 134  291:goto            28
			{
				acertificate[0] = "urn:oid:1.2.840.10040.4.3";
	//  135  294:aload_2         
	//  136  295:iconst_0        
	//  137  296:ldc2            #590 <String "urn:oid:1.2.840.10040.4.3">
	//  138  299:aastore         
				acertificate[1] = "ANSI X9.57 DSA signature generated with SHA-1 hash (DSA x9.30)";
	//  139  300:aload_2         
	//  140  301:iconst_1        
	//  141  302:ldc2            #592 <String "ANSI X9.57 DSA signature generated with SHA-1 hash (DSA x9.30)">
	//  142  305:aastore         
			}
		}
		acertificate = ((Certificate []) (generateXadesObject(xmlsignaturefactory, xmlsignatureappearance, s, ((String) (obj2)), ((String) (obj1)), ((String []) (acertificate)))));
		obj2 = ((Object) (generateContentReference(xmlsignaturefactory, xmlsignatureappearance, ((String) (obj2)))));
		obj1 = ((Object) (Arrays.asList(((Object []) (new Reference[] {
			generateCustomReference(xmlsignaturefactory, (new StringBuilder()).append("#").append(((String) (obj1))).toString(), "http://uri.etsi.org/01903#SignedProperties", ((String) (null))), obj2
		})))));
		obj = ((Object) ((DOMSignedInfo)xmlsignaturefactory.newSignedInfo(xmlsignaturefactory.newCanonicalizationMethod("http://www.w3.org/TR/2001/REC-xml-c14n-20010315", (C14NMethodParameterSpec)null), xmlsignaturefactory.newSignatureMethod(((String) (obj)), ((javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec) (null))), ((List) (obj1)), ((String) (null)))));
		sign(xmlsignaturefactory, externalsignature, xmlsignatureappearance.getXmlLocator(), ((DOMSignedInfo) (obj)), ((XMLObject) (acertificate)), keyinfo, s);
		xmlsignatureappearance.close();
	//* 143  306:goto            146
	}

	public static void signXadesBes(XmlSignatureAppearance xmlsignatureappearance, ExternalSignature externalsignature, Certificate acertificate[])
		throws GeneralSecurityException, DocumentException, IOException
	{
		signXades(xmlsignatureappearance, externalsignature, acertificate, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokestatic    #596 <Method void signXades(XmlSignatureAppearance, ExternalSignature, Certificate[], boolean)>
	//    5    7:return          
	}

	public static void signXadesEpes(XmlSignatureAppearance xmlsignatureappearance, ExternalSignature externalsignature, Certificate acertificate[])
		throws GeneralSecurityException, DocumentException, IOException
	{
		signXades(xmlsignatureappearance, externalsignature, acertificate, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:invokestatic    #596 <Method void signXades(XmlSignatureAppearance, ExternalSignature, Certificate[], boolean)>
	//    5    7:return          
	}

	public static void signXmlDSig(XmlSignatureAppearance xmlsignatureappearance, ExternalSignature externalsignature, PublicKey publickey)
		throws GeneralSecurityException, DocumentException, IOException
	{
		signXmlDSig(xmlsignatureappearance, externalsignature, generateKeyInfo(publickey));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #601 <Method KeyInfo generateKeyInfo(PublicKey)>
	//    4    6:invokestatic    #604 <Method void signXmlDSig(XmlSignatureAppearance, ExternalSignature, KeyInfo)>
	//    5    9:return          
	}

	public static void signXmlDSig(XmlSignatureAppearance xmlsignatureappearance, ExternalSignature externalsignature, KeyInfo keyinfo)
		throws GeneralSecurityException, IOException, DocumentException
	{
		Object obj;
		XMLSignatureFactory xmlsignaturefactory;
		Reference reference;
		verifyArguments(xmlsignatureappearance, externalsignature);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #524 <Method void verifyArguments(XmlSignatureAppearance, ExternalSignature)>
		xmlsignaturefactory = createSignatureFactory();
	//    3    5:invokestatic    #541 <Method XMLSignatureFactory createSignatureFactory()>
	//    4    8:astore          4
		reference = generateContentReference(xmlsignaturefactory, xmlsignatureappearance, ((String) (null)));
	//    5   10:aload           4
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:invokestatic    #551 <Method Reference generateContentReference(XMLSignatureFactory, XmlSignatureAppearance, String)>
	//    9   17:astore          5
		obj = null;
	//   10   19:aconst_null     
	//   11   20:astore_3        
		if(!externalsignature.getEncryptionAlgorithm().equals("RSA")) goto _L2; else goto _L1
	//   12   21:aload_1         
	//   13   22:invokeinterface #527 <Method String ExternalSignature.getEncryptionAlgorithm()>
	//   14   27:ldc2            #529 <String "RSA">
	//   15   30:invokevirtual   #53  <Method boolean String.equals(Object)>
	//   16   33:ifeq            92
_L1:
		obj = "http://www.w3.org/2000/09/xmldsig#rsa-sha1";
	//   17   36:ldc2            #531 <String "http://www.w3.org/2000/09/xmldsig#rsa-sha1">
	//   18   39:astore_3        
_L4:
		obj = ((Object) ((DOMSignedInfo)xmlsignaturefactory.newSignedInfo(xmlsignaturefactory.newCanonicalizationMethod("http://www.w3.org/TR/2001/REC-xml-c14n-20010315", (C14NMethodParameterSpec)null), xmlsignaturefactory.newSignatureMethod(((String) (obj)), ((javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec) (null))), Collections.singletonList(((Object) (reference))))));
	//   19   40:aload           4
	//   20   42:aload           4
	//   21   44:ldc2            #565 <String "http://www.w3.org/TR/2001/REC-xml-c14n-20010315">
	//   22   47:aconst_null     
	//   23   48:checkcast       #567 <Class C14NMethodParameterSpec>
	//   24   51:invokevirtual   #571 <Method javax.xml.crypto.dsig.CanonicalizationMethod XMLSignatureFactory.newCanonicalizationMethod(String, C14NMethodParameterSpec)>
	//   25   54:aload           4
	//   26   56:aload_3         
	//   27   57:aconst_null     
	//   28   58:invokevirtual   #575 <Method javax.xml.crypto.dsig.SignatureMethod XMLSignatureFactory.newSignatureMethod(String, javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec)>
	//   29   61:aload           5
	//   30   63:invokestatic    #116 <Method List Collections.singletonList(Object)>
	//   31   66:invokevirtual   #607 <Method javax.xml.crypto.dsig.SignedInfo XMLSignatureFactory.newSignedInfo(javax.xml.crypto.dsig.CanonicalizationMethod, javax.xml.crypto.dsig.SignatureMethod, List)>
	//   32   69:checkcast       #483 <Class DOMSignedInfo>
	//   33   72:astore_3        
		sign(xmlsignaturefactory, externalsignature, xmlsignatureappearance.getXmlLocator(), ((DOMSignedInfo) (obj)), ((XMLObject) (null)), keyinfo, ((String) (null)));
	//   34   73:aload           4
	//   35   75:aload_1         
	//   36   76:aload_0         
	//   37   77:invokevirtual   #169 <Method XmlLocator XmlSignatureAppearance.getXmlLocator()>
	//   38   80:aload_3         
	//   39   81:aconst_null     
	//   40   82:aload_2         
	//   41   83:aconst_null     
	//   42   84:invokestatic    #581 <Method void sign(XMLSignatureFactory, ExternalSignature, XmlLocator, DOMSignedInfo, XMLObject, KeyInfo, String)>
		xmlsignatureappearance.close();
	//   43   87:aload_0         
	//   44   88:invokevirtual   #584 <Method void XmlSignatureAppearance.close()>
		return;
	//   45   91:return          
_L2:
		if(externalsignature.getEncryptionAlgorithm().equals("DSA"))
	//*  46   92:aload_1         
	//*  47   93:invokeinterface #527 <Method String ExternalSignature.getEncryptionAlgorithm()>
	//*  48   98:ldc2            #586 <String "DSA">
	//*  49  101:invokevirtual   #53  <Method boolean String.equals(Object)>
	//*  50  104:ifeq            40
			obj = "http://www.w3.org/2000/09/xmldsig#dsa-sha1";
	//   51  107:ldc2            #588 <String "http://www.w3.org/2000/09/xmldsig#dsa-sha1">
	//   52  110:astore_3        
		if(true) goto _L4; else goto _L3
	//   53  111:goto            40
_L3:
	}

	public static void signXmlDSig(XmlSignatureAppearance xmlsignatureappearance, ExternalSignature externalsignature, Certificate acertificate[])
		throws DocumentException, GeneralSecurityException, IOException
	{
		signXmlDSig(xmlsignatureappearance, externalsignature, generateKeyInfo(acertificate, xmlsignatureappearance));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:invokestatic    #543 <Method KeyInfo generateKeyInfo(Certificate[], XmlSignatureAppearance)>
	//    5    7:invokestatic    #604 <Method void signXmlDSig(XmlSignatureAppearance, ExternalSignature, KeyInfo)>
	//    6   10:return          
	}

	private static void verifyArguments(XmlSignatureAppearance xmlsignatureappearance, ExternalSignature externalsignature)
		throws DocumentException
	{
		if(xmlsignatureappearance.getXmlLocator() == null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #169 <Method XmlLocator XmlSignatureAppearance.getXmlLocator()>
	//*   2    4:ifnonnull       25
			throw new DocumentException(MessageLocalization.getComposedMessage("xmllocator.cannot.be.null", new Object[0]));
	//    3    7:new             #430 <Class DocumentException>
	//    4   10:dup             
	//    5   11:ldc2            #609 <String "xmllocator.cannot.be.null">
	//    6   14:iconst_0        
	//    7   15:anewarray       Object[]
	//    8   18:invokestatic    #615 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//    9   21:invokespecial   #616 <Method void DocumentException(String)>
	//   10   24:athrow          
		if(!externalsignature.getHashAlgorithm().equals("SHA1"))
	//*  11   25:aload_1         
	//*  12   26:invokeinterface #619 <Method String ExternalSignature.getHashAlgorithm()>
	//*  13   31:ldc1            #156 <String "SHA1">
	//*  14   33:invokevirtual   #53  <Method boolean String.equals(Object)>
	//*  15   36:ifne            57
			throw new UnsupportedOperationException(MessageLocalization.getComposedMessage("support.only.sha1.hash.algorithm", new Object[0]));
	//   16   39:new             #621 <Class UnsupportedOperationException>
	//   17   42:dup             
	//   18   43:ldc2            #623 <String "support.only.sha1.hash.algorithm">
	//   19   46:iconst_0        
	//   20   47:anewarray       Object[]
	//   21   50:invokestatic    #615 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   22   53:invokespecial   #624 <Method void UnsupportedOperationException(String)>
	//   23   56:athrow          
		if(!externalsignature.getEncryptionAlgorithm().equals("RSA") && !externalsignature.getEncryptionAlgorithm().equals("DSA"))
	//*  24   57:aload_1         
	//*  25   58:invokeinterface #527 <Method String ExternalSignature.getEncryptionAlgorithm()>
	//*  26   63:ldc2            #529 <String "RSA">
	//*  27   66:invokevirtual   #53  <Method boolean String.equals(Object)>
	//*  28   69:ifne            105
	//*  29   72:aload_1         
	//*  30   73:invokeinterface #527 <Method String ExternalSignature.getEncryptionAlgorithm()>
	//*  31   78:ldc2            #586 <String "DSA">
	//*  32   81:invokevirtual   #53  <Method boolean String.equals(Object)>
	//*  33   84:ifne            105
			throw new UnsupportedOperationException(MessageLocalization.getComposedMessage("support.only.rsa.and.dsa.algorithms", new Object[0]));
	//   34   87:new             #621 <Class UnsupportedOperationException>
	//   35   90:dup             
	//   36   91:ldc2            #626 <String "support.only.rsa.and.dsa.algorithms">
	//   37   94:iconst_0        
	//   38   95:anewarray       Object[]
	//   39   98:invokestatic    #615 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   40  101:invokespecial   #624 <Method void UnsupportedOperationException(String)>
	//   41  104:athrow          
		else
			return;
	//   42  105:return          
	}
}
