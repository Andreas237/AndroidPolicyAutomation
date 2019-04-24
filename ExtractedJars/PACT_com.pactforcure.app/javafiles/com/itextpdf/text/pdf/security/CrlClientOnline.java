// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.log.Logger;
import com.itextpdf.text.log.LoggerFactory;
import java.io.*;
import java.net.*;
import java.security.cert.*;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf.security:
//			CrlClient, CertificateUtil

public class CrlClientOnline
	implements CrlClient
{

	public CrlClientOnline()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		urls = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #27  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void ArrayList()>
	//    6   12:putfield        #30  <Field List urls>
	//    7   15:return          
	}

	public transient CrlClientOnline(String as[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		urls = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #27  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void ArrayList()>
	//    6   12:putfield        #30  <Field List urls>
		int j = as.length;
	//    7   15:aload_1         
	//    8   16:arraylength     
	//    9   17:istore_3        
		for(int i = 0; i < j; i++)
	//*  10   18:iconst_0        
	//*  11   19:istore_2        
	//*  12   20:iload_2         
	//*  13   21:iload_3         
	//*  14   22:icmpge          39
			addUrl(as[i]);
	//   15   25:aload_0         
	//   16   26:aload_1         
	//   17   27:iload_2         
	//   18   28:aaload          
	//   19   29:invokevirtual   #35  <Method void addUrl(String)>

	//   20   32:iload_2         
	//   21   33:iconst_1        
	//   22   34:iadd            
	//   23   35:istore_2        
	//*  24   36:goto            20
	//   25   39:return          
	}

	public transient CrlClientOnline(URL aurl[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		urls = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #27  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void ArrayList()>
	//    6   12:putfield        #30  <Field List urls>
		for(aurl = ((URL []) (urls.iterator())); ((Iterator) (aurl)).hasNext(); addUrl((URL)((Iterator) (aurl)).next()));
	//    7   15:aload_0         
	//    8   16:getfield        #30  <Field List urls>
	//    9   19:invokeinterface #42  <Method Iterator List.iterator()>
	//   10   24:astore_1        
	//   11   25:aload_1         
	//   12   26:invokeinterface #48  <Method boolean Iterator.hasNext()>
	//   13   31:ifeq            50
	//   14   34:aload_0         
	//   15   35:aload_1         
	//   16   36:invokeinterface #52  <Method Object Iterator.next()>
	//   17   41:checkcast       #54  <Class URL>
	//   18   44:invokevirtual   #57  <Method void addUrl(URL)>
	//*  19   47:goto            25
	//   20   50:return          
	}

	public CrlClientOnline(Certificate acertificate[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		urls = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #27  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void ArrayList()>
	//    6   12:putfield        #30  <Field List urls>
		int i = 0;
	//    7   15:iconst_0        
	//    8   16:istore_2        
		while(i < acertificate.length) 
	//*   9   17:iload_2         
	//*  10   18:aload_1         
	//*  11   19:arraylength     
	//*  12   20:icmpge          89
		{
			X509Certificate x509certificate = (X509Certificate)acertificate[i];
	//   13   23:aload_1         
	//   14   24:iload_2         
	//   15   25:aaload          
	//   16   26:checkcast       #62  <Class X509Certificate>
	//   17   29:astore_3        
			LOGGER.info((new StringBuilder()).append("Checking certificate: ").append(((Object) (x509certificate.getSubjectDN()))).toString());
	//   18   30:getstatic       #21  <Field Logger LOGGER>
	//   19   33:new             #64  <Class StringBuilder>
	//   20   36:dup             
	//   21   37:invokespecial   #65  <Method void StringBuilder()>
	//   22   40:ldc1            #67  <String "Checking certificate: ">
	//   23   42:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   24   45:aload_3         
	//   25   46:invokevirtual   #75  <Method java.security.Principal X509Certificate.getSubjectDN()>
	//   26   49:invokevirtual   #78  <Method StringBuilder StringBuilder.append(Object)>
	//   27   52:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   28   55:invokeinterface #87  <Method void Logger.info(String)>
			try
			{
				addUrl(CertificateUtil.getCRLURL(x509certificate));
	//   29   60:aload_0         
	//   30   61:aload_3         
	//   31   62:invokestatic    #93  <Method String CertificateUtil.getCRLURL(X509Certificate)>
	//   32   65:invokevirtual   #35  <Method void addUrl(String)>
			}
	//*  33   68:iload_2         
	//*  34   69:iconst_1        
	//*  35   70:iadd            
	//*  36   71:istore_2        
	//*  37   72:goto            17
			catch(CertificateParsingException certificateparsingexception)
	//*  38   75:astore_3        
			{
				LOGGER.info("Skipped CRL url (certificate could not be parsed)");
	//   39   76:getstatic       #21  <Field Logger LOGGER>
	//   40   79:ldc1            #95  <String "Skipped CRL url (certificate could not be parsed)">
	//   41   81:invokeinterface #87  <Method void Logger.info(String)>
			}
			i++;
		}
	//*  42   86:goto            68
	//   43   89:return          
	}

	protected void addUrl(String s)
	{
		try
		{
			addUrl(new URL(s));
	//    0    0:aload_0         
	//    1    1:new             #54  <Class URL>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #99  <Method void URL(String)>
	//    5    9:invokevirtual   #57  <Method void addUrl(URL)>
			return;
	//    6   12:return          
		}
		catch(MalformedURLException malformedurlexception)
	//*   7   13:astore_2        
		{
			LOGGER.info((new StringBuilder()).append("Skipped CRL url (malformed): ").append(s).toString());
	//    8   14:getstatic       #21  <Field Logger LOGGER>
	//    9   17:new             #64  <Class StringBuilder>
	//   10   20:dup             
	//   11   21:invokespecial   #65  <Method void StringBuilder()>
	//   12   24:ldc1            #101 <String "Skipped CRL url (malformed): ">
	//   13   26:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:aload_1         
	//   15   30:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   17   36:invokeinterface #87  <Method void Logger.info(String)>
		}
	//   18   41:return          
	}

	protected void addUrl(URL url)
	{
		if(urls.contains(((Object) (url))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field List urls>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #105 <Method boolean List.contains(Object)>
	//*   4   10:ifeq            41
		{
			LOGGER.info((new StringBuilder()).append("Skipped CRL url (duplicate): ").append(((Object) (url))).toString());
	//    5   13:getstatic       #21  <Field Logger LOGGER>
	//    6   16:new             #64  <Class StringBuilder>
	//    7   19:dup             
	//    8   20:invokespecial   #65  <Method void StringBuilder()>
	//    9   23:ldc1            #107 <String "Skipped CRL url (duplicate): ">
	//   10   25:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   11   28:aload_1         
	//   12   29:invokevirtual   #78  <Method StringBuilder StringBuilder.append(Object)>
	//   13   32:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   14   35:invokeinterface #87  <Method void Logger.info(String)>
			return;
	//   15   40:return          
		} else
		{
			urls.add(((Object) (url)));
	//   16   41:aload_0         
	//   17   42:getfield        #30  <Field List urls>
	//   18   45:aload_1         
	//   19   46:invokeinterface #110 <Method boolean List.add(Object)>
	//   20   51:pop             
			LOGGER.info((new StringBuilder()).append("Added CRL url: ").append(((Object) (url))).toString());
	//   21   52:getstatic       #21  <Field Logger LOGGER>
	//   22   55:new             #64  <Class StringBuilder>
	//   23   58:dup             
	//   24   59:invokespecial   #65  <Method void StringBuilder()>
	//   25   62:ldc1            #112 <String "Added CRL url: ">
	//   26   64:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   27   67:aload_1         
	//   28   68:invokevirtual   #78  <Method StringBuilder StringBuilder.append(Object)>
	//   29   71:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   30   74:invokeinterface #87  <Method void Logger.info(String)>
			return;
	//   31   79:return          
		}
	}

	public Collection getEncoded(X509Certificate x509certificate, String s)
	{
		if(x509certificate != null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnonnull       8
_L1:
		x509certificate = null;
	//    2    4:aconst_null     
	//    3    5:astore_1        
_L8:
		return ((Collection) (x509certificate));
	//    4    6:aload_1         
	//    5    7:areturn         
_L2:
		Object obj1 = ((Object) (new ArrayList(((Collection) (urls)))));
	//    6    8:new             #27  <Class ArrayList>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:getfield        #30  <Field List urls>
	//   10   16:invokespecial   #119 <Method void ArrayList(Collection)>
	//   11   19:astore          5
		if(((List) (obj1)).size() != 0) goto _L4; else goto _L3
	//   12   21:aload           5
	//   13   23:invokeinterface #123 <Method int List.size()>
	//   14   28:ifne            118
_L3:
		Object obj;
		LOGGER.info((new StringBuilder()).append("Looking for CRL for certificate ").append(((Object) (x509certificate.getSubjectDN()))).toString());
	//   15   31:getstatic       #21  <Field Logger LOGGER>
	//   16   34:new             #64  <Class StringBuilder>
	//   17   37:dup             
	//   18   38:invokespecial   #65  <Method void StringBuilder()>
	//   19   41:ldc1            #125 <String "Looking for CRL for certificate ">
	//   20   43:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   21   46:aload_1         
	//   22   47:invokevirtual   #75  <Method java.security.Principal X509Certificate.getSubjectDN()>
	//   23   50:invokevirtual   #78  <Method StringBuilder StringBuilder.append(Object)>
	//   24   53:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   25   56:invokeinterface #87  <Method void Logger.info(String)>
		obj = ((Object) (s));
	//   26   61:aload_2         
	//   27   62:astore          4
		if(s != null)
			break MISSING_BLOCK_LABEL_74;
	//   28   64:aload_2         
	//   29   65:ifnonnull       74
		obj = ((Object) (CertificateUtil.getCRLURL(x509certificate)));
	//   30   68:aload_1         
	//   31   69:invokestatic    #93  <Method String CertificateUtil.getCRLURL(X509Certificate)>
	//   32   72:astore          4
		if(obj != null) goto _L6; else goto _L5
	//   33   74:aload           4
	//   34   76:ifnonnull       269
_L5:
		try
		{
			throw new NullPointerException();
	//   35   79:new             #127 <Class NullPointerException>
	//   36   82:dup             
	//   37   83:invokespecial   #128 <Method void NullPointerException()>
	//   38   86:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(X509Certificate x509certificate)
	//*  39   87:astore_1        
		{
			LOGGER.info((new StringBuilder()).append("Skipped CRL url: ").append(((Exception) (x509certificate)).getMessage()).toString());
	//   40   88:getstatic       #21  <Field Logger LOGGER>
	//   41   91:new             #64  <Class StringBuilder>
	//   42   94:dup             
	//   43   95:invokespecial   #65  <Method void StringBuilder()>
	//   44   98:ldc1            #130 <String "Skipped CRL url: ">
	//   45  100:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   46  103:aload_1         
	//   47  104:invokevirtual   #133 <Method String Exception.getMessage()>
	//   48  107:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   49  110:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   50  113:invokeinterface #87  <Method void Logger.info(String)>
		}
_L4:
		s = ((String) (new ArrayList()));
	//   51  118:new             #27  <Class ArrayList>
	//   52  121:dup             
	//   53  122:invokespecial   #28  <Method void ArrayList()>
	//   54  125:astore_2        
		obj = ((Object) (((List) (obj1)).iterator()));
	//   55  126:aload           5
	//   56  128:invokeinterface #42  <Method Iterator List.iterator()>
	//   57  133:astore          4
_L10:
		x509certificate = ((X509Certificate) (s));
	//   58  135:aload_2         
	//   59  136:astore_1        
		if(!((Iterator) (obj)).hasNext()) goto _L8; else goto _L7
	//   60  137:aload           4
	//   61  139:invokeinterface #48  <Method boolean Iterator.hasNext()>
	//   62  144:ifeq            6
_L7:
		x509certificate = ((X509Certificate) ((URL)((Iterator) (obj)).next()));
	//   63  147:aload           4
	//   64  149:invokeinterface #52  <Method Object Iterator.next()>
	//   65  154:checkcast       #54  <Class URL>
	//   66  157:astore_1        
		LOGGER.info((new StringBuilder()).append("Checking CRL: ").append(((Object) (x509certificate))).toString());
	//   67  158:getstatic       #21  <Field Logger LOGGER>
	//   68  161:new             #64  <Class StringBuilder>
	//   69  164:dup             
	//   70  165:invokespecial   #65  <Method void StringBuilder()>
	//   71  168:ldc1            #135 <String "Checking CRL: ">
	//   72  170:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   73  173:aload_1         
	//   74  174:invokevirtual   #78  <Method StringBuilder StringBuilder.append(Object)>
	//   75  177:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   76  180:invokeinterface #87  <Method void Logger.info(String)>
		obj1 = ((Object) ((HttpURLConnection)((URL) (x509certificate)).openConnection()));
	//   77  185:aload_1         
	//   78  186:invokevirtual   #139 <Method java.net.URLConnection URL.openConnection()>
	//   79  189:checkcast       #141 <Class HttpURLConnection>
	//   80  192:astore          5
		if(((HttpURLConnection) (obj1)).getResponseCode() / 100 != 2)
	//*  81  194:aload           5
	//*  82  196:invokevirtual   #144 <Method int HttpURLConnection.getResponseCode()>
	//*  83  199:bipush          100
	//*  84  201:idiv            
	//*  85  202:iconst_2        
	//*  86  203:icmpeq          317
			throw new IOException(MessageLocalization.getComposedMessage("invalid.http.response.1", ((HttpURLConnection) (obj1)).getResponseCode()));
	//   87  206:new             #146 <Class IOException>
	//   88  209:dup             
	//   89  210:ldc1            #148 <String "invalid.http.response.1">
	//   90  212:aload           5
	//   91  214:invokevirtual   #144 <Method int HttpURLConnection.getResponseCode()>
	//   92  217:invokestatic    #154 <Method String MessageLocalization.getComposedMessage(String, int)>
	//   93  220:invokespecial   #155 <Method void IOException(String)>
	//   94  223:athrow          
		  goto _L9
	//*  95  224:astore          5
	//*  96  226:getstatic       #21  <Field Logger LOGGER>
	//*  97  229:new             #64  <Class StringBuilder>
	//*  98  232:dup             
	//*  99  233:invokespecial   #65  <Method void StringBuilder()>
	//* 100  236:ldc1            #157 <String "Skipped CRL: ">
	//* 101  238:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//* 102  241:aload           5
	//* 103  243:invokevirtual   #133 <Method String Exception.getMessage()>
	//* 104  246:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//* 105  249:ldc1            #159 <String " for ">
	//* 106  251:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//* 107  254:aload_1         
	//* 108  255:invokevirtual   #78  <Method StringBuilder StringBuilder.append(Object)>
	//* 109  258:invokevirtual   #82  <Method String StringBuilder.toString()>
	//* 110  261:invokeinterface #87  <Method void Logger.info(String)>
	//* 111  266:goto            135
_L6:
		((List) (obj1)).add(((Object) (new URL(((String) (obj))))));
	//  112  269:aload           5
	//  113  271:new             #54  <Class URL>
	//  114  274:dup             
	//  115  275:aload           4
	//  116  277:invokespecial   #99  <Method void URL(String)>
	//  117  280:invokeinterface #110 <Method boolean List.add(Object)>
	//  118  285:pop             
		LOGGER.info((new StringBuilder()).append("Found CRL url: ").append(((String) (obj))).toString());
	//  119  286:getstatic       #21  <Field Logger LOGGER>
	//  120  289:new             #64  <Class StringBuilder>
	//  121  292:dup             
	//  122  293:invokespecial   #65  <Method void StringBuilder()>
	//  123  296:ldc1            #161 <String "Found CRL url: ">
	//  124  298:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//  125  301:aload           4
	//  126  303:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//  127  306:invokevirtual   #82  <Method String StringBuilder.toString()>
	//  128  309:invokeinterface #87  <Method void Logger.info(String)>
		  goto _L4
	//* 129  314:goto            118
_L9:
		byte abyte0[];
		ByteArrayOutputStream bytearrayoutputstream;
		obj1 = ((Object) ((InputStream)((HttpURLConnection) (obj1)).getContent()));
	//  130  317:aload           5
	//  131  319:invokevirtual   #164 <Method Object HttpURLConnection.getContent()>
	//  132  322:checkcast       #166 <Class InputStream>
	//  133  325:astore          5
		abyte0 = new byte[1024];
	//  134  327:sipush          1024
	//  135  330:newarray        byte[]
	//  136  332:astore          6
		bytearrayoutputstream = new ByteArrayOutputStream();
	//  137  334:new             #168 <Class ByteArrayOutputStream>
	//  138  337:dup             
	//  139  338:invokespecial   #169 <Method void ByteArrayOutputStream()>
	//  140  341:astore          7
_L11:
		int i = ((InputStream) (obj1)).read(abyte0, 0, abyte0.length);
	//  141  343:aload           5
	//  142  345:aload           6
	//  143  347:iconst_0        
	//  144  348:aload           6
	//  145  350:arraylength     
	//  146  351:invokevirtual   #173 <Method int InputStream.read(byte[], int, int)>
	//  147  354:istore_3        
label0:
		{
			if(i > 0)
				break label0;
	//  148  355:iload_3         
	//  149  356:ifgt            404
			try
			{
				((InputStream) (obj1)).close();
	//  150  359:aload           5
	//  151  361:invokevirtual   #176 <Method void InputStream.close()>
				((ArrayList) (s)).add(((Object) (bytearrayoutputstream.toByteArray())));
	//  152  364:aload_2         
	//  153  365:aload           7
	//  154  367:invokevirtual   #180 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//  155  370:invokevirtual   #181 <Method boolean ArrayList.add(Object)>
	//  156  373:pop             
				LOGGER.info((new StringBuilder()).append("Added CRL found at: ").append(((Object) (x509certificate))).toString());
	//  157  374:getstatic       #21  <Field Logger LOGGER>
	//  158  377:new             #64  <Class StringBuilder>
	//  159  380:dup             
	//  160  381:invokespecial   #65  <Method void StringBuilder()>
	//  161  384:ldc1            #183 <String "Added CRL found at: ">
	//  162  386:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//  163  389:aload_1         
	//  164  390:invokevirtual   #78  <Method StringBuilder StringBuilder.append(Object)>
	//  165  393:invokevirtual   #82  <Method String StringBuilder.toString()>
	//  166  396:invokeinterface #87  <Method void Logger.info(String)>
			}
			// Misplaced declaration of an exception variable
			catch(Object obj1)
			{
				LOGGER.info((new StringBuilder()).append("Skipped CRL: ").append(((Exception) (obj1)).getMessage()).append(" for ").append(((Object) (x509certificate))).toString());
			}
		}
		  goto _L10
	//* 167  401:goto            135
		bytearrayoutputstream.write(abyte0, 0, i);
	//  168  404:aload           7
	//  169  406:aload           6
	//  170  408:iconst_0        
	//  171  409:iload_3         
	//  172  410:invokevirtual   #187 <Method void ByteArrayOutputStream.write(byte[], int, int)>
		  goto _L11
	//* 173  413:goto            343
	}

	private static final Logger LOGGER = LoggerFactory.getLogger(com/itextpdf/text/pdf/security/CrlClientOnline);
	protected List urls;

	static 
	{
	//    0    0:ldc1            #2   <Class CrlClientOnline>
	//    1    2:invokestatic    #19  <Method Logger LoggerFactory.getLogger(Class)>
	//    2    5:putstatic       #21  <Field Logger LOGGER>
	//*   3    8:return          
	}
}
