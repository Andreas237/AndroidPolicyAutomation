// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.xml.xmp;

import com.itextpdf.text.Version;
import com.itextpdf.text.pdf.*;
import com.itextpdf.xmp.*;
import com.itextpdf.xmp.options.PropertyOptions;
import com.itextpdf.xmp.options.SerializeOptions;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;

// Referenced classes of package com.itextpdf.text.xml.xmp:
//			XmpSchema

public class XmpWriter
{

	public XmpWriter(OutputStream outputstream)
		throws IOException
	{
		this(outputstream, "UTF-8", 2000);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #17  <String "UTF-8">
	//    3    4:sipush          2000
	//    4    7:invokespecial   #30  <Method void XmpWriter(OutputStream, String, int)>
	//    5   10:return          
	}

	public XmpWriter(OutputStream outputstream, PdfDictionary pdfdictionary)
		throws IOException
	{
		this(outputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #37  <Method void XmpWriter(OutputStream)>
		if(pdfdictionary != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          91
		{
			outputstream = ((OutputStream) (pdfdictionary.getKeys().iterator()));
	//    5    9:aload_2         
	//    6   10:invokevirtual   #43  <Method Set PdfDictionary.getKeys()>
	//    7   13:invokeinterface #49  <Method Iterator Set.iterator()>
	//    8   18:astore_1        
			do
			{
				if(!((Iterator) (outputstream)).hasNext())
					break;
	//    9   19:aload_1         
	//   10   20:invokeinterface #55  <Method boolean Iterator.hasNext()>
	//   11   25:ifeq            91
				PdfName pdfname = (PdfName)((Iterator) (outputstream)).next();
	//   12   28:aload_1         
	//   13   29:invokeinterface #59  <Method Object Iterator.next()>
	//   14   34:checkcast       #61  <Class PdfName>
	//   15   37:astore_3        
				Object obj = ((Object) (pdfdictionary.get(pdfname)));
	//   16   38:aload_2         
	//   17   39:aload_3         
	//   18   40:invokevirtual   #65  <Method PdfObject PdfDictionary.get(PdfName)>
	//   19   43:astore          4
				if(obj != null && ((PdfObject) (obj)).isString())
	//*  20   45:aload           4
	//*  21   47:ifnull          19
	//*  22   50:aload           4
	//*  23   52:invokevirtual   #70  <Method boolean PdfObject.isString()>
	//*  24   55:ifeq            19
				{
					obj = ((Object) (((PdfString)obj).toUnicodeString()));
	//   25   58:aload           4
	//   26   60:checkcast       #72  <Class PdfString>
	//   27   63:invokevirtual   #76  <Method String PdfString.toUnicodeString()>
	//   28   66:astore          4
					try
					{
						addDocInfoProperty(((Object) (pdfname)), ((String) (obj)));
	//   29   68:aload_0         
	//   30   69:aload_3         
	//   31   70:aload           4
	//   32   72:invokevirtual   #80  <Method void addDocInfoProperty(Object, String)>
					}
	//*  33   75:goto            19
					// Misplaced declaration of an exception variable
					catch(OutputStream outputstream)
	//*  34   78:astore_1        
					{
						throw new IOException(((XMPException) (outputstream)).getMessage());
	//   35   79:new             #27  <Class IOException>
	//   36   82:dup             
	//   37   83:aload_1         
	//   38   84:invokevirtual   #83  <Method String XMPException.getMessage()>
	//   39   87:invokespecial   #86  <Method void IOException(String)>
	//   40   90:athrow          
					}
				}
			} while(true);
		}
	//   41   91:return          
	}

	public XmpWriter(OutputStream outputstream, String s, int i)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #89  <Method void Object()>
		outputStream = outputstream;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #91  <Field OutputStream outputStream>
		serializeOptions = new SerializeOptions();
	//    5    9:aload_0         
	//    6   10:new             #93  <Class SerializeOptions>
	//    7   13:dup             
	//    8   14:invokespecial   #94  <Method void SerializeOptions()>
	//    9   17:putfield        #96  <Field SerializeOptions serializeOptions>
		if("UTF-16BE".equals(((Object) (s))) || "UTF-16".equals(((Object) (s))))
	//*  10   20:ldc1            #11  <String "UTF-16BE">
	//*  11   22:aload_2         
	//*  12   23:invokevirtual   #102 <Method boolean String.equals(Object)>
	//*  13   26:ifne            38
	//*  14   29:ldc1            #8   <String "UTF-16">
	//*  15   31:aload_2         
	//*  16   32:invokevirtual   #102 <Method boolean String.equals(Object)>
	//*  17   35:ifeq            120
			serializeOptions.setEncodeUTF16BE(true);
	//   18   38:aload_0         
	//   19   39:getfield        #96  <Field SerializeOptions serializeOptions>
	//   20   42:iconst_1        
	//   21   43:invokevirtual   #106 <Method SerializeOptions SerializeOptions.setEncodeUTF16BE(boolean)>
	//   22   46:pop             
		else
	//*  23   47:aload_0         
	//*  24   48:getfield        #96  <Field SerializeOptions serializeOptions>
	//*  25   51:iload_3         
	//*  26   52:invokevirtual   #110 <Method SerializeOptions SerializeOptions.setPadding(int)>
	//*  27   55:pop             
	//*  28   56:aload_0         
	//*  29   57:invokestatic    #116 <Method XMPMeta XMPMetaFactory.create()>
	//*  30   60:putfield        #118 <Field XMPMeta xmpMeta>
	//*  31   63:aload_0         
	//*  32   64:getfield        #118 <Field XMPMeta xmpMeta>
	//*  33   67:ldc1            #120 <String "xmpmeta">
	//*  34   69:invokeinterface #125 <Method void XMPMeta.setObjectName(String)>
	//*  35   74:aload_0         
	//*  36   75:getfield        #118 <Field XMPMeta xmpMeta>
	//*  37   78:ldc1            #127 <String "">
	//*  38   80:invokeinterface #125 <Method void XMPMeta.setObjectName(String)>
	//*  39   85:aload_0         
	//*  40   86:getfield        #118 <Field XMPMeta xmpMeta>
	//*  41   89:ldc1            #129 <String "http://purl.org/dc/elements/1.1/">
	//*  42   91:ldc1            #131 <String "format">
	//*  43   93:ldc1            #133 <String "application/pdf">
	//*  44   95:invokeinterface #137 <Method void XMPMeta.setProperty(String, String, Object)>
	//*  45  100:aload_0         
	//*  46  101:getfield        #118 <Field XMPMeta xmpMeta>
	//*  47  104:ldc1            #139 <String "http://ns.adobe.com/pdf/1.3/">
	//*  48  106:ldc1            #141 <String "Producer">
	//*  49  108:invokestatic    #147 <Method Version Version.getInstance()>
	//*  50  111:invokevirtual   #150 <Method String Version.getVersion()>
	//*  51  114:invokeinterface #137 <Method void XMPMeta.setProperty(String, String, Object)>
	//*  52  119:return          
		if("UTF-16LE".equals(((Object) (s))))
	//*  53  120:ldc1            #14  <String "UTF-16LE">
	//*  54  122:aload_2         
	//*  55  123:invokevirtual   #102 <Method boolean String.equals(Object)>
	//*  56  126:ifeq            47
			serializeOptions.setEncodeUTF16LE(true);
	//   57  129:aload_0         
	//   58  130:getfield        #96  <Field SerializeOptions serializeOptions>
	//   59  133:iconst_1        
	//   60  134:invokevirtual   #153 <Method SerializeOptions SerializeOptions.setEncodeUTF16LE(boolean)>
	//   61  137:pop             
		serializeOptions.setPadding(i);
		xmpMeta = XMPMetaFactory.create();
		xmpMeta.setObjectName("xmpmeta");
		xmpMeta.setObjectName("");
		try
		{
			xmpMeta.setProperty("http://purl.org/dc/elements/1.1/", "format", "application/pdf");
			xmpMeta.setProperty("http://ns.adobe.com/pdf/1.3/", "Producer", ((Object) (Version.getInstance().getVersion())));
			return;
		}
	//*  62  138:goto            47
		// Misplaced declaration of an exception variable
		catch(OutputStream outputstream)
	//*  63  141:astore_1        
		{
			return;
	//   64  142:return          
		}
	}

	public XmpWriter(OutputStream outputstream, Map map)
		throws IOException
	{
		this(outputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #37  <Method void XmpWriter(OutputStream)>
		if(map != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          86
		{
			outputstream = ((OutputStream) (map.entrySet().iterator()));
	//    5    9:aload_2         
	//    6   10:invokeinterface #159 <Method Set Map.entrySet()>
	//    7   15:invokeinterface #49  <Method Iterator Set.iterator()>
	//    8   20:astore_1        
			do
			{
				if(!((Iterator) (outputstream)).hasNext())
					break;
	//    9   21:aload_1         
	//   10   22:invokeinterface #55  <Method boolean Iterator.hasNext()>
	//   11   27:ifeq            86
				Object obj = ((Object) ((java.util.Map.Entry)((Iterator) (outputstream)).next()));
	//   12   30:aload_1         
	//   13   31:invokeinterface #59  <Method Object Iterator.next()>
	//   14   36:checkcast       #161 <Class java.util.Map$Entry>
	//   15   39:astore_3        
				map = ((Map) ((String)((java.util.Map.Entry) (obj)).getKey()));
	//   16   40:aload_3         
	//   17   41:invokeinterface #164 <Method Object java.util.Map$Entry.getKey()>
	//   18   46:checkcast       #98  <Class String>
	//   19   49:astore_2        
				obj = ((Object) ((String)((java.util.Map.Entry) (obj)).getValue()));
	//   20   50:aload_3         
	//   21   51:invokeinterface #167 <Method Object java.util.Map$Entry.getValue()>
	//   22   56:checkcast       #98  <Class String>
	//   23   59:astore_3        
				if(obj != null)
	//*  24   60:aload_3         
	//*  25   61:ifnull          21
					try
					{
						addDocInfoProperty(((Object) (map)), ((String) (obj)));
	//   26   64:aload_0         
	//   27   65:aload_2         
	//   28   66:aload_3         
	//   29   67:invokevirtual   #80  <Method void addDocInfoProperty(Object, String)>
					}
	//*  30   70:goto            21
					// Misplaced declaration of an exception variable
					catch(OutputStream outputstream)
	//*  31   73:astore_1        
					{
						throw new IOException(((XMPException) (outputstream)).getMessage());
	//   32   74:new             #27  <Class IOException>
	//   33   77:dup             
	//   34   78:aload_1         
	//   35   79:invokevirtual   #83  <Method String XMPException.getMessage()>
	//   36   82:invokespecial   #86  <Method void IOException(String)>
	//   37   85:athrow          
					}
			} while(true);
		}
	//   38   86:return          
	}

	public void addDocInfoProperty(Object obj, String s)
		throws XMPException
	{
		Object obj1 = obj;
	//    0    0:aload_1         
	//    1    1:astore          5
		if(obj instanceof String)
	//*   2    3:aload_1         
	//*   3    4:instanceof      #98  <Class String>
	//*   4    7:ifeq            23
			obj1 = ((Object) (new PdfName((String)obj)));
	//    5   10:new             #61  <Class PdfName>
	//    6   13:dup             
	//    7   14:aload_1         
	//    8   15:checkcast       #98  <Class String>
	//    9   18:invokespecial   #170 <Method void PdfName(String)>
	//   10   21:astore          5
		if(PdfName.TITLE.equals(obj1))
	//*  11   23:getstatic       #174 <Field PdfName PdfName.TITLE>
	//*  12   26:aload           5
	//*  13   28:invokevirtual   #175 <Method boolean PdfName.equals(Object)>
	//*  14   31:ifeq            53
		{
			xmpMeta.setLocalizedText("http://purl.org/dc/elements/1.1/", "title", "x-default", "x-default", s);
	//   15   34:aload_0         
	//   16   35:getfield        #118 <Field XMPMeta xmpMeta>
	//   17   38:ldc1            #129 <String "http://purl.org/dc/elements/1.1/">
	//   18   40:ldc1            #177 <String "title">
	//   19   42:ldc1            #179 <String "x-default">
	//   20   44:ldc1            #179 <String "x-default">
	//   21   46:aload_2         
	//   22   47:invokeinterface #183 <Method void XMPMeta.setLocalizedText(String, String, String, String, String)>
		} else
	//*  23   52:return          
		{
			if(PdfName.AUTHOR.equals(obj1))
	//*  24   53:getstatic       #186 <Field PdfName PdfName.AUTHOR>
	//*  25   56:aload           5
	//*  26   58:invokevirtual   #175 <Method boolean PdfName.equals(Object)>
	//*  27   61:ifeq            90
			{
				xmpMeta.appendArrayItem("http://purl.org/dc/elements/1.1/", "creator", new PropertyOptions(1024), s, ((PropertyOptions) (null)));
	//   28   64:aload_0         
	//   29   65:getfield        #118 <Field XMPMeta xmpMeta>
	//   30   68:ldc1            #129 <String "http://purl.org/dc/elements/1.1/">
	//   31   70:ldc1            #188 <String "creator">
	//   32   72:new             #190 <Class PropertyOptions>
	//   33   75:dup             
	//   34   76:sipush          1024
	//   35   79:invokespecial   #193 <Method void PropertyOptions(int)>
	//   36   82:aload_2         
	//   37   83:aconst_null     
	//   38   84:invokeinterface #197 <Method void XMPMeta.appendArrayItem(String, String, PropertyOptions, String, PropertyOptions)>
				return;
	//   39   89:return          
			}
			if(PdfName.SUBJECT.equals(obj1))
	//*  40   90:getstatic       #200 <Field PdfName PdfName.SUBJECT>
	//*  41   93:aload           5
	//*  42   95:invokevirtual   #175 <Method boolean PdfName.equals(Object)>
	//*  43   98:ifeq            120
			{
				xmpMeta.setLocalizedText("http://purl.org/dc/elements/1.1/", "description", "x-default", "x-default", s);
	//   44  101:aload_0         
	//   45  102:getfield        #118 <Field XMPMeta xmpMeta>
	//   46  105:ldc1            #129 <String "http://purl.org/dc/elements/1.1/">
	//   47  107:ldc1            #202 <String "description">
	//   48  109:ldc1            #179 <String "x-default">
	//   49  111:ldc1            #179 <String "x-default">
	//   50  113:aload_2         
	//   51  114:invokeinterface #183 <Method void XMPMeta.setLocalizedText(String, String, String, String, String)>
				return;
	//   52  119:return          
			}
			if(PdfName.KEYWORDS.equals(obj1))
	//*  53  120:getstatic       #205 <Field PdfName PdfName.KEYWORDS>
	//*  54  123:aload           5
	//*  55  125:invokevirtual   #175 <Method boolean PdfName.equals(Object)>
	//*  56  128:ifeq            217
			{
				obj = ((Object) (s.split(",|;")));
	//   57  131:aload_2         
	//   58  132:ldc1            #207 <String ",|;">
	//   59  134:invokevirtual   #211 <Method String[] String.split(String)>
	//   60  137:astore_1        
				int j = obj.length;
	//   61  138:aload_1         
	//   62  139:arraylength     
	//   63  140:istore          4
				for(int i = 0; i < j; i++)
	//*  64  142:iconst_0        
	//*  65  143:istore_3        
	//*  66  144:iload_3         
	//*  67  145:iload           4
	//*  68  147:icmpge          202
				{
					obj1 = ((Object) (obj[i]));
	//   69  150:aload_1         
	//   70  151:iload_3         
	//   71  152:aaload          
	//   72  153:astore          5
					if(((String) (obj1)).trim().length() > 0)
	//*  73  155:aload           5
	//*  74  157:invokevirtual   #214 <Method String String.trim()>
	//*  75  160:invokevirtual   #218 <Method int String.length()>
	//*  76  163:ifle            195
						xmpMeta.appendArrayItem("http://purl.org/dc/elements/1.1/", "subject", new PropertyOptions(512), ((String) (obj1)).trim(), ((PropertyOptions) (null)));
	//   77  166:aload_0         
	//   78  167:getfield        #118 <Field XMPMeta xmpMeta>
	//   79  170:ldc1            #129 <String "http://purl.org/dc/elements/1.1/">
	//   80  172:ldc1            #220 <String "subject">
	//   81  174:new             #190 <Class PropertyOptions>
	//   82  177:dup             
	//   83  178:sipush          512
	//   84  181:invokespecial   #193 <Method void PropertyOptions(int)>
	//   85  184:aload           5
	//   86  186:invokevirtual   #214 <Method String String.trim()>
	//   87  189:aconst_null     
	//   88  190:invokeinterface #197 <Method void XMPMeta.appendArrayItem(String, String, PropertyOptions, String, PropertyOptions)>
				}

	//   89  195:iload_3         
	//   90  196:iconst_1        
	//   91  197:iadd            
	//   92  198:istore_3        
	//*  93  199:goto            144
				xmpMeta.setProperty("http://ns.adobe.com/pdf/1.3/", "Keywords", ((Object) (s)));
	//   94  202:aload_0         
	//   95  203:getfield        #118 <Field XMPMeta xmpMeta>
	//   96  206:ldc1            #139 <String "http://ns.adobe.com/pdf/1.3/">
	//   97  208:ldc1            #222 <String "Keywords">
	//   98  210:aload_2         
	//   99  211:invokeinterface #137 <Method void XMPMeta.setProperty(String, String, Object)>
				return;
	//  100  216:return          
			}
			if(PdfName.PRODUCER.equals(obj1))
	//* 101  217:getstatic       #225 <Field PdfName PdfName.PRODUCER>
	//* 102  220:aload           5
	//* 103  222:invokevirtual   #175 <Method boolean PdfName.equals(Object)>
	//* 104  225:ifeq            243
			{
				xmpMeta.setProperty("http://ns.adobe.com/pdf/1.3/", "Producer", ((Object) (s)));
	//  105  228:aload_0         
	//  106  229:getfield        #118 <Field XMPMeta xmpMeta>
	//  107  232:ldc1            #139 <String "http://ns.adobe.com/pdf/1.3/">
	//  108  234:ldc1            #141 <String "Producer">
	//  109  236:aload_2         
	//  110  237:invokeinterface #137 <Method void XMPMeta.setProperty(String, String, Object)>
				return;
	//  111  242:return          
			}
			if(PdfName.CREATOR.equals(obj1))
	//* 112  243:getstatic       #228 <Field PdfName PdfName.CREATOR>
	//* 113  246:aload           5
	//* 114  248:invokevirtual   #175 <Method boolean PdfName.equals(Object)>
	//* 115  251:ifeq            269
			{
				xmpMeta.setProperty("http://ns.adobe.com/xap/1.0/", "CreatorTool", ((Object) (s)));
	//  116  254:aload_0         
	//  117  255:getfield        #118 <Field XMPMeta xmpMeta>
	//  118  258:ldc1            #230 <String "http://ns.adobe.com/xap/1.0/">
	//  119  260:ldc1            #232 <String "CreatorTool">
	//  120  262:aload_2         
	//  121  263:invokeinterface #137 <Method void XMPMeta.setProperty(String, String, Object)>
				return;
	//  122  268:return          
			}
			if(PdfName.CREATIONDATE.equals(obj1))
	//* 123  269:getstatic       #235 <Field PdfName PdfName.CREATIONDATE>
	//* 124  272:aload           5
	//* 125  274:invokevirtual   #175 <Method boolean PdfName.equals(Object)>
	//* 126  277:ifeq            298
			{
				xmpMeta.setProperty("http://ns.adobe.com/xap/1.0/", "CreateDate", ((Object) (PdfDate.getW3CDate(s))));
	//  127  280:aload_0         
	//  128  281:getfield        #118 <Field XMPMeta xmpMeta>
	//  129  284:ldc1            #230 <String "http://ns.adobe.com/xap/1.0/">
	//  130  286:ldc1            #237 <String "CreateDate">
	//  131  288:aload_2         
	//  132  289:invokestatic    #243 <Method String PdfDate.getW3CDate(String)>
	//  133  292:invokeinterface #137 <Method void XMPMeta.setProperty(String, String, Object)>
				return;
	//  134  297:return          
			}
			if(PdfName.MODDATE.equals(obj1))
	//* 135  298:getstatic       #246 <Field PdfName PdfName.MODDATE>
	//* 136  301:aload           5
	//* 137  303:invokevirtual   #175 <Method boolean PdfName.equals(Object)>
	//* 138  306:ifeq            52
			{
				xmpMeta.setProperty("http://ns.adobe.com/xap/1.0/", "ModifyDate", ((Object) (PdfDate.getW3CDate(s))));
	//  139  309:aload_0         
	//  140  310:getfield        #118 <Field XMPMeta xmpMeta>
	//  141  313:ldc1            #230 <String "http://ns.adobe.com/xap/1.0/">
	//  142  315:ldc1            #248 <String "ModifyDate">
	//  143  317:aload_2         
	//  144  318:invokestatic    #243 <Method String PdfDate.getW3CDate(String)>
	//  145  321:invokeinterface #137 <Method void XMPMeta.setProperty(String, String, Object)>
				return;
	//  146  326:return          
			}
		}
	}

	public void addRdfDescription(XmpSchema xmpschema)
		throws IOException
	{
		try
		{
			XMPUtils.appendProperties(XMPMetaFactory.parseFromString((new StringBuilder()).append("<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"><rdf:Description rdf:about=\"").append(xmpMeta.getObjectName()).append("\" ").append(xmpschema.getXmlns()).append(">").append(xmpschema.toString()).append("</rdf:Description></rdf:RDF>\n").toString()), xmpMeta, true, true);
	//    0    0:new             #253 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #254 <Method void StringBuilder()>
	//    3    7:ldc2            #256 <String "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"><rdf:Description rdf:about=\"">
	//    4   10:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//    5   13:aload_0         
	//    6   14:getfield        #118 <Field XMPMeta xmpMeta>
	//    7   17:invokeinterface #263 <Method String XMPMeta.getObjectName()>
	//    8   22:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//    9   25:ldc2            #265 <String "\" ">
	//   10   28:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   11   31:aload_1         
	//   12   32:invokevirtual   #270 <Method String XmpSchema.getXmlns()>
	//   13   35:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   14   38:ldc2            #272 <String ">">
	//   15   41:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   16   44:aload_1         
	//   17   45:invokevirtual   #275 <Method String XmpSchema.toString()>
	//   18   48:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   19   51:ldc2            #277 <String "</rdf:Description></rdf:RDF>\n">
	//   20   54:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   21   57:invokevirtual   #278 <Method String StringBuilder.toString()>
	//   22   60:invokestatic    #282 <Method XMPMeta XMPMetaFactory.parseFromString(String)>
	//   23   63:aload_0         
	//   24   64:getfield        #118 <Field XMPMeta xmpMeta>
	//   25   67:iconst_1        
	//   26   68:iconst_1        
	//   27   69:invokestatic    #288 <Method void XMPUtils.appendProperties(XMPMeta, XMPMeta, boolean, boolean)>
			return;
	//   28   72:return          
		}
		// Misplaced declaration of an exception variable
		catch(XmpSchema xmpschema)
	//*  29   73:astore_1        
		{
			throw new IOException(((XMPException) (xmpschema)).getMessage());
	//   30   74:new             #27  <Class IOException>
	//   31   77:dup             
	//   32   78:aload_1         
	//   33   79:invokevirtual   #83  <Method String XMPException.getMessage()>
	//   34   82:invokespecial   #86  <Method void IOException(String)>
	//   35   85:athrow          
		}
	}

	public void addRdfDescription(String s, String s1)
		throws IOException
	{
		try
		{
			XMPUtils.appendProperties(XMPMetaFactory.parseFromString((new StringBuilder()).append("<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"><rdf:Description rdf:about=\"").append(xmpMeta.getObjectName()).append("\" ").append(s).append(">").append(s1).append("</rdf:Description></rdf:RDF>\n").toString()), xmpMeta, true, true);
	//    0    0:new             #253 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #254 <Method void StringBuilder()>
	//    3    7:ldc2            #256 <String "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"><rdf:Description rdf:about=\"">
	//    4   10:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//    5   13:aload_0         
	//    6   14:getfield        #118 <Field XMPMeta xmpMeta>
	//    7   17:invokeinterface #263 <Method String XMPMeta.getObjectName()>
	//    8   22:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//    9   25:ldc2            #265 <String "\" ">
	//   10   28:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   11   31:aload_1         
	//   12   32:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   13   35:ldc2            #272 <String ">">
	//   14   38:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   15   41:aload_2         
	//   16   42:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   17   45:ldc2            #277 <String "</rdf:Description></rdf:RDF>\n">
	//   18   48:invokevirtual   #260 <Method StringBuilder StringBuilder.append(String)>
	//   19   51:invokevirtual   #278 <Method String StringBuilder.toString()>
	//   20   54:invokestatic    #282 <Method XMPMeta XMPMetaFactory.parseFromString(String)>
	//   21   57:aload_0         
	//   22   58:getfield        #118 <Field XMPMeta xmpMeta>
	//   23   61:iconst_1        
	//   24   62:iconst_1        
	//   25   63:invokestatic    #288 <Method void XMPUtils.appendProperties(XMPMeta, XMPMeta, boolean, boolean)>
			return;
	//   26   66:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  27   67:astore_1        
		{
			throw new IOException(((XMPException) (s)).getMessage());
	//   28   68:new             #27  <Class IOException>
	//   29   71:dup             
	//   30   72:aload_1         
	//   31   73:invokevirtual   #83  <Method String XMPException.getMessage()>
	//   32   76:invokespecial   #86  <Method void IOException(String)>
	//   33   79:athrow          
		}
	}

	public void appendAlternateArrayItem(String s, String s1, String s2)
		throws XMPException
	{
		xmpMeta.appendArrayItem(s, s1, new PropertyOptions(2048), s2, ((PropertyOptions) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field XMPMeta xmpMeta>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:new             #190 <Class PropertyOptions>
	//    5    9:dup             
	//    6   10:sipush          2048
	//    7   13:invokespecial   #193 <Method void PropertyOptions(int)>
	//    8   16:aload_3         
	//    9   17:aconst_null     
	//   10   18:invokeinterface #197 <Method void XMPMeta.appendArrayItem(String, String, PropertyOptions, String, PropertyOptions)>
	//   11   23:return          
	}

	public void appendArrayItem(String s, String s1, String s2)
		throws XMPException
	{
		xmpMeta.appendArrayItem(s, s1, new PropertyOptions(512), s2, ((PropertyOptions) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field XMPMeta xmpMeta>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:new             #190 <Class PropertyOptions>
	//    5    9:dup             
	//    6   10:sipush          512
	//    7   13:invokespecial   #193 <Method void PropertyOptions(int)>
	//    8   16:aload_3         
	//    9   17:aconst_null     
	//   10   18:invokeinterface #197 <Method void XMPMeta.appendArrayItem(String, String, PropertyOptions, String, PropertyOptions)>
	//   11   23:return          
	}

	public void appendOrderedArrayItem(String s, String s1, String s2)
		throws XMPException
	{
		xmpMeta.appendArrayItem(s, s1, new PropertyOptions(1024), s2, ((PropertyOptions) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field XMPMeta xmpMeta>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:new             #190 <Class PropertyOptions>
	//    5    9:dup             
	//    6   10:sipush          1024
	//    7   13:invokespecial   #193 <Method void PropertyOptions(int)>
	//    8   16:aload_3         
	//    9   17:aconst_null     
	//   10   18:invokeinterface #197 <Method void XMPMeta.appendArrayItem(String, String, PropertyOptions, String, PropertyOptions)>
	//   11   23:return          
	}

	public void close()
		throws IOException
	{
		if(outputStream == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #91  <Field OutputStream outputStream>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		try
		{
			XMPMetaFactory.serialize(xmpMeta, outputStream, serializeOptions);
	//    4    8:aload_0         
	//    5    9:getfield        #118 <Field XMPMeta xmpMeta>
	//    6   12:aload_0         
	//    7   13:getfield        #91  <Field OutputStream outputStream>
	//    8   16:aload_0         
	//    9   17:getfield        #96  <Field SerializeOptions serializeOptions>
	//   10   20:invokestatic    #298 <Method void XMPMetaFactory.serialize(XMPMeta, OutputStream, SerializeOptions)>
			outputStream = null;
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:putfield        #91  <Field OutputStream outputStream>
			return;
	//   14   28:return          
		}
		catch(XMPException xmpexception)
	//*  15   29:astore_1        
		{
			throw new IOException(xmpexception.getMessage());
	//   16   30:new             #27  <Class IOException>
	//   17   33:dup             
	//   18   34:aload_1         
	//   19   35:invokevirtual   #83  <Method String XMPException.getMessage()>
	//   20   38:invokespecial   #86  <Method void IOException(String)>
	//   21   41:athrow          
		}
	}

	public XMPMeta getXmpMeta()
	{
		return xmpMeta;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field XMPMeta xmpMeta>
	//    2    4:areturn         
	}

	public void serialize(OutputStream outputstream)
		throws XMPException
	{
		XMPMetaFactory.serialize(xmpMeta, outputstream, serializeOptions);
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field XMPMeta xmpMeta>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #96  <Field SerializeOptions serializeOptions>
	//    5    9:invokestatic    #298 <Method void XMPMetaFactory.serialize(XMPMeta, OutputStream, SerializeOptions)>
	//    6   12:return          
	}

	public void setAbout(String s)
	{
		xmpMeta.setObjectName(s);
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field XMPMeta xmpMeta>
	//    2    4:aload_1         
	//    3    5:invokeinterface #125 <Method void XMPMeta.setObjectName(String)>
	//    4   10:return          
	}

	public void setProperty(String s, String s1, Object obj)
		throws XMPException
	{
		xmpMeta.setProperty(s, s1, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field XMPMeta xmpMeta>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokeinterface #137 <Method void XMPMeta.setProperty(String, String, Object)>
	//    6   12:return          
	}

	public void setReadOnly()
	{
		serializeOptions.setReadOnlyPacket(true);
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field SerializeOptions serializeOptions>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #304 <Method SerializeOptions SerializeOptions.setReadOnlyPacket(boolean)>
	//    4    8:pop             
	//    5    9:return          
	}

	public static final String UTF16 = "UTF-16";
	public static final String UTF16BE = "UTF-16BE";
	public static final String UTF16LE = "UTF-16LE";
	public static final String UTF8 = "UTF-8";
	protected OutputStream outputStream;
	protected SerializeOptions serializeOptions;
	protected XMPMeta xmpMeta;
}
