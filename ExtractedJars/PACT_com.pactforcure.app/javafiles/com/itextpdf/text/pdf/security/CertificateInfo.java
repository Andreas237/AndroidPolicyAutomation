// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.error_messages.MessageLocalization;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.X509Certificate;
import java.util.*;
import org.spongycastle.asn1.*;

public class CertificateInfo
{
	public static class X500Name
	{

		public String getField(String s)
		{
			s = ((String) ((List)values.get(((Object) (s)))));
		//    0    0:aload_0         
		//    1    1:getfield        #135 <Field Map values>
		//    2    4:aload_1         
		//    3    5:invokeinterface #177 <Method Object Map.get(Object)>
		//    4   10:checkcast       #220 <Class List>
		//    5   13:astore_1        
			if(s == null)
		//*   6   14:aload_1         
		//*   7   15:ifnonnull       20
				return null;
		//    8   18:aconst_null     
		//    9   19:areturn         
			else
				return (String)((List) (s)).get(0);
		//   10   20:aload_1         
		//   11   21:iconst_0        
		//   12   22:invokeinterface #223 <Method Object List.get(int)>
		//   13   27:checkcast       #148 <Class String>
		//   14   30:areturn         
		}

		public List getFieldArray(String s)
		{
			return (List)values.get(((Object) (s)));
		//    0    0:aload_0         
		//    1    1:getfield        #135 <Field Map values>
		//    2    4:aload_1         
		//    3    5:invokeinterface #177 <Method Object Map.get(Object)>
		//    4   10:checkcast       #220 <Class List>
		//    5   13:areturn         
		}

		public Map getFields()
		{
			return values;
		//    0    0:aload_0         
		//    1    1:getfield        #135 <Field Map values>
		//    2    4:areturn         
		}

		public String toString()
		{
			return ((Object) (values)).toString();
		//    0    0:aload_0         
		//    1    1:getfield        #135 <Field Map values>
		//    2    4:invokevirtual   #233 <Method String Object.toString()>
		//    3    7:areturn         
		}

		public static final ASN1ObjectIdentifier C;
		public static final ASN1ObjectIdentifier CN;
		public static final ASN1ObjectIdentifier DC;
		public static final Map DefaultSymbols;
		public static final ASN1ObjectIdentifier E;
		public static final ASN1ObjectIdentifier EmailAddress;
		public static final ASN1ObjectIdentifier GENERATION;
		public static final ASN1ObjectIdentifier GIVENNAME;
		public static final ASN1ObjectIdentifier INITIALS;
		public static final ASN1ObjectIdentifier L;
		public static final ASN1ObjectIdentifier O;
		public static final ASN1ObjectIdentifier OU;
		public static final ASN1ObjectIdentifier SN;
		public static final ASN1ObjectIdentifier ST;
		public static final ASN1ObjectIdentifier SURNAME;
		public static final ASN1ObjectIdentifier T;
		public static final ASN1ObjectIdentifier UID;
		public static final ASN1ObjectIdentifier UNIQUE_IDENTIFIER = new ASN1ObjectIdentifier("2.5.4.45");
		public Map values;

		static 
		{
			C = new ASN1ObjectIdentifier("2.5.4.6");
		//    0    0:new             #34  <Class ASN1ObjectIdentifier>
		//    1    3:dup             
		//    2    4:ldc1            #36  <String "2.5.4.6">
		//    3    6:invokespecial   #40  <Method void ASN1ObjectIdentifier(String)>
		//    4    9:putstatic       #42  <Field ASN1ObjectIdentifier C>
			O = new ASN1ObjectIdentifier("2.5.4.10");
		//    5   12:new             #34  <Class ASN1ObjectIdentifier>
		//    6   15:dup             
		//    7   16:ldc1            #44  <String "2.5.4.10">
		//    8   18:invokespecial   #40  <Method void ASN1ObjectIdentifier(String)>
		//    9   21:putstatic       #46  <Field ASN1ObjectIdentifier O>
			OU = new ASN1ObjectIdentifier("2.5.4.11");
		//   10   24:new             #34  <Class ASN1ObjectIdentifier>
		//   11   27:dup             
		//   12   28:ldc1            #48  <String "2.5.4.11">
		//   13   30:invokespecial   #40  <Method void ASN1ObjectIdentifier(String)>
		//   14   33:putstatic       #50  <Field ASN1ObjectIdentifier OU>
			T = new ASN1ObjectIdentifier("2.5.4.12");
		//   15   36:new             #34  <Class ASN1ObjectIdentifier>
		//   16   39:dup             
		//   17   40:ldc1            #52  <String "2.5.4.12">
		//   18   42:invokespecial   #40  <Method void ASN1ObjectIdentifier(String)>
		//   19   45:putstatic       #54  <Field ASN1ObjectIdentifier T>
			CN = new ASN1ObjectIdentifier("2.5.4.3");
		//   20   48:new             #34  <Class ASN1ObjectIdentifier>
		//   21   51:dup             
		//   22   52:ldc1            #56  <String "2.5.4.3">
		//   23   54:invokespecial   #40  <Method void ASN1ObjectIdentifier(String)>
		//   24   57:putstatic       #58  <Field ASN1ObjectIdentifier CN>
			SN = new ASN1ObjectIdentifier("2.5.4.5");
		//   25   60:new             #34  <Class ASN1ObjectIdentifier>
		//   26   63:dup             
		//   27   64:ldc1            #60  <String "2.5.4.5">
		//   28   66:invokespecial   #40  <Method void ASN1ObjectIdentifier(String)>
		//   29   69:putstatic       #62  <Field ASN1ObjectIdentifier SN>
			L = new ASN1ObjectIdentifier("2.5.4.7");
		//   30   72:new             #34  <Class ASN1ObjectIdentifier>
		//   31   75:dup             
		//   32   76:ldc1            #64  <String "2.5.4.7">
		//   33   78:invokespecial   #40  <Method void ASN1ObjectIdentifier(String)>
		//   34   81:putstatic       #66  <Field ASN1ObjectIdentifier L>
			ST = new ASN1ObjectIdentifier("2.5.4.8");
		//   35   84:new             #34  <Class ASN1ObjectIdentifier>
		//   36   87:dup             
		//   37   88:ldc1            #68  <String "2.5.4.8">
		//   38   90:invokespecial   #40  <Method void ASN1ObjectIdentifier(String)>
		//   39   93:putstatic       #70  <Field ASN1ObjectIdentifier ST>
			SURNAME = new ASN1ObjectIdentifier("2.5.4.4");
		//   40   96:new             #34  <Class ASN1ObjectIdentifier>
		//   41   99:dup             
		//   42  100:ldc1            #72  <String "2.5.4.4">
		//   43  102:invokespecial   #40  <Method void ASN1ObjectIdentifier(String)>
		//   44  105:putstatic       #74  <Field ASN1ObjectIdentifier SURNAME>
			GIVENNAME = new ASN1ObjectIdentifier("2.5.4.42");
		//   45  108:new             #34  <Class ASN1ObjectIdentifier>
		//   46  111:dup             
		//   47  112:ldc1            #76  <String "2.5.4.42">
		//   48  114:invokespecial   #40  <Method void ASN1ObjectIdentifier(String)>
		//   49  117:putstatic       #78  <Field ASN1ObjectIdentifier GIVENNAME>
			INITIALS = new ASN1ObjectIdentifier("2.5.4.43");
		//   50  120:new             #34  <Class ASN1ObjectIdentifier>
		//   51  123:dup             
		//   52  124:ldc1            #80  <String "2.5.4.43">
		//   53  126:invokespecial   #40  <Method void ASN1ObjectIdentifier(String)>
		//   54  129:putstatic       #82  <Field ASN1ObjectIdentifier INITIALS>
			GENERATION = new ASN1ObjectIdentifier("2.5.4.44");
		//   55  132:new             #34  <Class ASN1ObjectIdentifier>
		//   56  135:dup             
		//   57  136:ldc1            #84  <String "2.5.4.44">
		//   58  138:invokespecial   #40  <Method void ASN1ObjectIdentifier(String)>
		//   59  141:putstatic       #86  <Field ASN1ObjectIdentifier GENERATION>
		//   60  144:new             #34  <Class ASN1ObjectIdentifier>
		//   61  147:dup             
		//   62  148:ldc1            #88  <String "2.5.4.45">
		//   63  150:invokespecial   #40  <Method void ASN1ObjectIdentifier(String)>
		//   64  153:putstatic       #90  <Field ASN1ObjectIdentifier UNIQUE_IDENTIFIER>
			EmailAddress = new ASN1ObjectIdentifier("1.2.840.113549.1.9.1");
		//   65  156:new             #34  <Class ASN1ObjectIdentifier>
		//   66  159:dup             
		//   67  160:ldc1            #92  <String "1.2.840.113549.1.9.1">
		//   68  162:invokespecial   #40  <Method void ASN1ObjectIdentifier(String)>
		//   69  165:putstatic       #94  <Field ASN1ObjectIdentifier EmailAddress>
			E = EmailAddress;
		//   70  168:getstatic       #94  <Field ASN1ObjectIdentifier EmailAddress>
		//   71  171:putstatic       #96  <Field ASN1ObjectIdentifier E>
			DC = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.25");
		//   72  174:new             #34  <Class ASN1ObjectIdentifier>
		//   73  177:dup             
		//   74  178:ldc1            #98  <String "0.9.2342.19200300.100.1.25">
		//   75  180:invokespecial   #40  <Method void ASN1ObjectIdentifier(String)>
		//   76  183:putstatic       #100 <Field ASN1ObjectIdentifier DC>
			UID = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.1");
		//   77  186:new             #34  <Class ASN1ObjectIdentifier>
		//   78  189:dup             
		//   79  190:ldc1            #102 <String "0.9.2342.19200300.100.1.1">
		//   80  192:invokespecial   #40  <Method void ASN1ObjectIdentifier(String)>
		//   81  195:putstatic       #104 <Field ASN1ObjectIdentifier UID>
			DefaultSymbols = ((Map) (new HashMap()));
		//   82  198:new             #106 <Class HashMap>
		//   83  201:dup             
		//   84  202:invokespecial   #108 <Method void HashMap()>
		//   85  205:putstatic       #110 <Field Map DefaultSymbols>
			DefaultSymbols.put(((Object) (C)), "C");
		//   86  208:getstatic       #110 <Field Map DefaultSymbols>
		//   87  211:getstatic       #42  <Field ASN1ObjectIdentifier C>
		//   88  214:ldc1            #111 <String "C">
		//   89  216:invokeinterface #117 <Method Object Map.put(Object, Object)>
		//   90  221:pop             
			DefaultSymbols.put(((Object) (O)), "O");
		//   91  222:getstatic       #110 <Field Map DefaultSymbols>
		//   92  225:getstatic       #46  <Field ASN1ObjectIdentifier O>
		//   93  228:ldc1            #118 <String "O">
		//   94  230:invokeinterface #117 <Method Object Map.put(Object, Object)>
		//   95  235:pop             
			DefaultSymbols.put(((Object) (T)), "T");
		//   96  236:getstatic       #110 <Field Map DefaultSymbols>
		//   97  239:getstatic       #54  <Field ASN1ObjectIdentifier T>
		//   98  242:ldc1            #119 <String "T">
		//   99  244:invokeinterface #117 <Method Object Map.put(Object, Object)>
		//  100  249:pop             
			DefaultSymbols.put(((Object) (OU)), "OU");
		//  101  250:getstatic       #110 <Field Map DefaultSymbols>
		//  102  253:getstatic       #50  <Field ASN1ObjectIdentifier OU>
		//  103  256:ldc1            #120 <String "OU">
		//  104  258:invokeinterface #117 <Method Object Map.put(Object, Object)>
		//  105  263:pop             
			DefaultSymbols.put(((Object) (CN)), "CN");
		//  106  264:getstatic       #110 <Field Map DefaultSymbols>
		//  107  267:getstatic       #58  <Field ASN1ObjectIdentifier CN>
		//  108  270:ldc1            #121 <String "CN">
		//  109  272:invokeinterface #117 <Method Object Map.put(Object, Object)>
		//  110  277:pop             
			DefaultSymbols.put(((Object) (L)), "L");
		//  111  278:getstatic       #110 <Field Map DefaultSymbols>
		//  112  281:getstatic       #66  <Field ASN1ObjectIdentifier L>
		//  113  284:ldc1            #122 <String "L">
		//  114  286:invokeinterface #117 <Method Object Map.put(Object, Object)>
		//  115  291:pop             
			DefaultSymbols.put(((Object) (ST)), "ST");
		//  116  292:getstatic       #110 <Field Map DefaultSymbols>
		//  117  295:getstatic       #70  <Field ASN1ObjectIdentifier ST>
		//  118  298:ldc1            #123 <String "ST">
		//  119  300:invokeinterface #117 <Method Object Map.put(Object, Object)>
		//  120  305:pop             
			DefaultSymbols.put(((Object) (SN)), "SN");
		//  121  306:getstatic       #110 <Field Map DefaultSymbols>
		//  122  309:getstatic       #62  <Field ASN1ObjectIdentifier SN>
		//  123  312:ldc1            #124 <String "SN">
		//  124  314:invokeinterface #117 <Method Object Map.put(Object, Object)>
		//  125  319:pop             
			DefaultSymbols.put(((Object) (EmailAddress)), "E");
		//  126  320:getstatic       #110 <Field Map DefaultSymbols>
		//  127  323:getstatic       #94  <Field ASN1ObjectIdentifier EmailAddress>
		//  128  326:ldc1            #125 <String "E">
		//  129  328:invokeinterface #117 <Method Object Map.put(Object, Object)>
		//  130  333:pop             
			DefaultSymbols.put(((Object) (DC)), "DC");
		//  131  334:getstatic       #110 <Field Map DefaultSymbols>
		//  132  337:getstatic       #100 <Field ASN1ObjectIdentifier DC>
		//  133  340:ldc1            #126 <String "DC">
		//  134  342:invokeinterface #117 <Method Object Map.put(Object, Object)>
		//  135  347:pop             
			DefaultSymbols.put(((Object) (UID)), "UID");
		//  136  348:getstatic       #110 <Field Map DefaultSymbols>
		//  137  351:getstatic       #104 <Field ASN1ObjectIdentifier UID>
		//  138  354:ldc1            #127 <String "UID">
		//  139  356:invokeinterface #117 <Method Object Map.put(Object, Object)>
		//  140  361:pop             
			DefaultSymbols.put(((Object) (SURNAME)), "SURNAME");
		//  141  362:getstatic       #110 <Field Map DefaultSymbols>
		//  142  365:getstatic       #74  <Field ASN1ObjectIdentifier SURNAME>
		//  143  368:ldc1            #128 <String "SURNAME">
		//  144  370:invokeinterface #117 <Method Object Map.put(Object, Object)>
		//  145  375:pop             
			DefaultSymbols.put(((Object) (GIVENNAME)), "GIVENNAME");
		//  146  376:getstatic       #110 <Field Map DefaultSymbols>
		//  147  379:getstatic       #78  <Field ASN1ObjectIdentifier GIVENNAME>
		//  148  382:ldc1            #129 <String "GIVENNAME">
		//  149  384:invokeinterface #117 <Method Object Map.put(Object, Object)>
		//  150  389:pop             
			DefaultSymbols.put(((Object) (INITIALS)), "INITIALS");
		//  151  390:getstatic       #110 <Field Map DefaultSymbols>
		//  152  393:getstatic       #82  <Field ASN1ObjectIdentifier INITIALS>
		//  153  396:ldc1            #130 <String "INITIALS">
		//  154  398:invokeinterface #117 <Method Object Map.put(Object, Object)>
		//  155  403:pop             
			DefaultSymbols.put(((Object) (GENERATION)), "GENERATION");
		//  156  404:getstatic       #110 <Field Map DefaultSymbols>
		//  157  407:getstatic       #86  <Field ASN1ObjectIdentifier GENERATION>
		//  158  410:ldc1            #131 <String "GENERATION">
		//  159  412:invokeinterface #117 <Method Object Map.put(Object, Object)>
		//  160  417:pop             
		//* 161  418:return          
		}

		public X500Name(String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #133 <Method void Object()>
			values = ((Map) (new HashMap()));
		//    2    4:aload_0         
		//    3    5:new             #106 <Class HashMap>
		//    4    8:dup             
		//    5    9:invokespecial   #108 <Method void HashMap()>
		//    6   12:putfield        #135 <Field Map values>
			String s2;
			for(X509NameTokenizer x509nametokenizer = new X509NameTokenizer(s); x509nametokenizer.hasMoreTokens(); ((ArrayList) (s)).add(((Object) (s2))))
		//*   7   15:new             #137 <Class CertificateInfo$X509NameTokenizer>
		//*   8   18:dup             
		//*   9   19:aload_1         
		//*  10   20:invokespecial   #138 <Method void CertificateInfo$X509NameTokenizer(String)>
		//*  11   23:astore          4
		//*  12   25:aload           4
		//*  13   27:invokevirtual   #142 <Method boolean CertificateInfo$X509NameTokenizer.hasMoreTokens()>
		//*  14   30:ifeq            140
			{
				s = x509nametokenizer.nextToken();
		//   15   33:aload           4
		//   16   35:invokevirtual   #146 <Method String CertificateInfo$X509NameTokenizer.nextToken()>
		//   17   38:astore_1        
				int i = s.indexOf('=');
		//   18   39:aload_1         
		//   19   40:bipush          61
		//   20   42:invokevirtual   #152 <Method int String.indexOf(int)>
		//   21   45:istore_2        
				if(i == -1)
		//*  22   46:iload_2         
		//*  23   47:iconst_m1       
		//*  24   48:icmpne          68
					throw new IllegalArgumentException(MessageLocalization.getComposedMessage("badly.formated.directory.string", new Object[0]));
		//   25   51:new             #154 <Class IllegalArgumentException>
		//   26   54:dup             
		//   27   55:ldc1            #156 <String "badly.formated.directory.string">
		//   28   57:iconst_0        
		//   29   58:anewarray       Object[]
		//   30   61:invokestatic    #162 <Method String MessageLocalization.getComposedMessage(String, Object[])>
		//   31   64:invokespecial   #163 <Method void IllegalArgumentException(String)>
		//   32   67:athrow          
				String s1 = s.substring(0, i).toUpperCase();
		//   33   68:aload_1         
		//   34   69:iconst_0        
		//   35   70:iload_2         
		//   36   71:invokevirtual   #167 <Method String String.substring(int, int)>
		//   37   74:invokevirtual   #170 <Method String String.toUpperCase()>
		//   38   77:astore          5
				s2 = s.substring(i + 1);
		//   39   79:aload_1         
		//   40   80:iload_2         
		//   41   81:iconst_1        
		//   42   82:iadd            
		//   43   83:invokevirtual   #173 <Method String String.substring(int)>
		//   44   86:astore          6
				ArrayList arraylist = (ArrayList)values.get(((Object) (s1)));
		//   45   88:aload_0         
		//   46   89:getfield        #135 <Field Map values>
		//   47   92:aload           5
		//   48   94:invokeinterface #177 <Method Object Map.get(Object)>
		//   49   99:checkcast       #179 <Class ArrayList>
		//   50  102:astore_3        
				s = ((String) (arraylist));
		//   51  103:aload_3         
		//   52  104:astore_1        
				if(arraylist == null)
		//*  53  105:aload_3         
		//*  54  106:ifnonnull       130
				{
					s = ((String) (new ArrayList()));
		//   55  109:new             #179 <Class ArrayList>
		//   56  112:dup             
		//   57  113:invokespecial   #180 <Method void ArrayList()>
		//   58  116:astore_1        
					values.put(((Object) (s1)), ((Object) (s)));
		//   59  117:aload_0         
		//   60  118:getfield        #135 <Field Map values>
		//   61  121:aload           5
		//   62  123:aload_1         
		//   63  124:invokeinterface #117 <Method Object Map.put(Object, Object)>
		//   64  129:pop             
				}
			}

		//   65  130:aload_1         
		//   66  131:aload           6
		//   67  133:invokevirtual   #184 <Method boolean ArrayList.add(Object)>
		//   68  136:pop             
		//*  69  137:goto            25
		//   70  140:return          
		}

		public X500Name(ASN1Sequence asn1sequence)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #133 <Method void Object()>
			values = ((Map) (new HashMap()));
		//    2    4:aload_0         
		//    3    5:new             #106 <Class HashMap>
		//    4    8:dup             
		//    5    9:invokespecial   #108 <Method void HashMap()>
		//    6   12:putfield        #135 <Field Map values>
			for(Enumeration enumeration = asn1sequence.getObjects(); enumeration.hasMoreElements();)
		//*   7   15:aload_1         
		//*   8   16:invokevirtual   #191 <Method Enumeration ASN1Sequence.getObjects()>
		//*   9   19:astore          4
		//*  10   21:aload           4
		//*  11   23:invokeinterface #196 <Method boolean Enumeration.hasMoreElements()>
		//*  12   28:ifeq            160
			{
				ASN1Set asn1set = (ASN1Set)enumeration.nextElement();
		//   13   31:aload           4
		//   14   33:invokeinterface #200 <Method Object Enumeration.nextElement()>
		//   15   38:checkcast       #202 <Class ASN1Set>
		//   16   41:astore          5
				int i = 0;
		//   17   43:iconst_0        
		//   18   44:istore_2        
				while(i < asn1set.size()) 
		//*  19   45:iload_2         
		//*  20   46:aload           5
		//*  21   48:invokevirtual   #206 <Method int ASN1Set.size()>
		//*  22   51:icmpge          21
				{
					ASN1Sequence asn1sequence1 = (ASN1Sequence)asn1set.getObjectAt(i);
		//   23   54:aload           5
		//   24   56:iload_2         
		//   25   57:invokevirtual   #210 <Method org.spongycastle.asn1.ASN1Encodable ASN1Set.getObjectAt(int)>
		//   26   60:checkcast       #187 <Class ASN1Sequence>
		//   27   63:astore          6
					String s = (String)DefaultSymbols.get(((Object) (asn1sequence1.getObjectAt(0))));
		//   28   65:getstatic       #110 <Field Map DefaultSymbols>
		//   29   68:aload           6
		//   30   70:iconst_0        
		//   31   71:invokevirtual   #211 <Method org.spongycastle.asn1.ASN1Encodable ASN1Sequence.getObjectAt(int)>
		//   32   74:invokeinterface #177 <Method Object Map.get(Object)>
		//   33   79:checkcast       #148 <Class String>
		//   34   82:astore          7
					if(s != null)
		//*  35   84:aload           7
		//*  36   86:ifnonnull       96
		//*  37   89:iload_2         
		//*  38   90:iconst_1        
		//*  39   91:iadd            
		//*  40   92:istore_2        
		//*  41   93:goto            45
					{
						ArrayList arraylist = (ArrayList)values.get(((Object) (s)));
		//   42   96:aload_0         
		//   43   97:getfield        #135 <Field Map values>
		//   44  100:aload           7
		//   45  102:invokeinterface #177 <Method Object Map.get(Object)>
		//   46  107:checkcast       #179 <Class ArrayList>
		//   47  110:astore_3        
						asn1sequence = ((ASN1Sequence) (arraylist));
		//   48  111:aload_3         
		//   49  112:astore_1        
						if(arraylist == null)
		//*  50  113:aload_3         
		//*  51  114:ifnonnull       138
						{
							asn1sequence = ((ASN1Sequence) (new ArrayList()));
		//   52  117:new             #179 <Class ArrayList>
		//   53  120:dup             
		//   54  121:invokespecial   #180 <Method void ArrayList()>
		//   55  124:astore_1        
							values.put(((Object) (s)), ((Object) (asn1sequence)));
		//   56  125:aload_0         
		//   57  126:getfield        #135 <Field Map values>
		//   58  129:aload           7
		//   59  131:aload_1         
		//   60  132:invokeinterface #117 <Method Object Map.put(Object, Object)>
		//   61  137:pop             
						}
						((ArrayList) (asn1sequence)).add(((Object) (((ASN1String)asn1sequence1.getObjectAt(1)).getString())));
		//   62  138:aload_1         
		//   63  139:aload           6
		//   64  141:iconst_1        
		//   65  142:invokevirtual   #211 <Method org.spongycastle.asn1.ASN1Encodable ASN1Sequence.getObjectAt(int)>
		//   66  145:checkcast       #213 <Class ASN1String>
		//   67  148:invokeinterface #216 <Method String ASN1String.getString()>
		//   68  153:invokevirtual   #184 <Method boolean ArrayList.add(Object)>
		//   69  156:pop             
					}
					i++;
				}
			}

		//*  70  157:goto            89
		//   71  160:return          
		}
	}

	public static class X509NameTokenizer
	{

		public boolean hasMoreTokens()
		{
			return index != oid.length();
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field int index>
		//    2    4:aload_0         
		//    3    5:getfield        #25  <Field String oid>
		//    4    8:invokevirtual   #36  <Method int String.length()>
		//    5   11:icmpeq          16
		//    6   14:iconst_1        
		//    7   15:ireturn         
		//    8   16:iconst_0        
		//    9   17:ireturn         
		}

		public String nextToken()
		{
			boolean flag;
			boolean flag1;
			int i;
			if(index == oid.length())
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field int index>
		//*   2    4:aload_0         
		//*   3    5:getfield        #25  <Field String oid>
		//*   4    8:invokevirtual   #36  <Method int String.length()>
		//*   5   11:icmpne          16
				return null;
		//    6   14:aconst_null     
		//    7   15:areturn         
			i = index + 1;
		//    8   16:aload_0         
		//    9   17:getfield        #27  <Field int index>
		//   10   20:iconst_1        
		//   11   21:iadd            
		//   12   22:istore          4
			flag1 = false;
		//   13   24:iconst_0        
		//   14   25:istore_3        
			flag = false;
		//   15   26:iconst_0        
		//   16   27:istore_2        
			buf.setLength(0);
		//   17   28:aload_0         
		//   18   29:getfield        #23  <Field StringBuffer buf>
		//   19   32:iconst_0        
		//   20   33:invokevirtual   #42  <Method void StringBuffer.setLength(int)>
_L2:
			char c;
			if(i == oid.length())
				break; /* Loop/switch isn't completed */
		//   21   36:iload           4
		//   22   38:aload_0         
		//   23   39:getfield        #25  <Field String oid>
		//   24   42:invokevirtual   #36  <Method int String.length()>
		//   25   45:icmpeq          149
			c = oid.charAt(i);
		//   26   48:aload_0         
		//   27   49:getfield        #25  <Field String oid>
		//   28   52:iload           4
		//   29   54:invokevirtual   #46  <Method char String.charAt(int)>
		//   30   57:istore_1        
			if(c == '"')
		//*  31   58:iload_1         
		//*  32   59:bipush          34
		//*  33   61:icmpne          110
			{
				boolean flag2;
				if(!flag)
		//*  34   64:iload_2         
		//*  35   65:ifne            96
				{
					if(!flag1)
		//*  36   68:iload_3         
		//*  37   69:ifne            91
						flag = true;
		//   38   72:iconst_1        
		//   39   73:istore_2        
					else
		//*  40   74:iconst_0        
		//*  41   75:istore          5
		//*  42   77:iload_2         
		//*  43   78:istore_3        
		//*  44   79:iload           5
		//*  45   81:istore_2        
		//*  46   82:iload           4
		//*  47   84:iconst_1        
		//*  48   85:iadd            
		//*  49   86:istore          4
		//*  50   88:goto            36
						flag = false;
		//   51   91:iconst_0        
		//   52   92:istore_2        
				} else
		//*  53   93:goto            74
				{
					buf.append(c);
		//   54   96:aload_0         
		//   55   97:getfield        #23  <Field StringBuffer buf>
		//   56  100:iload_1         
		//   57  101:invokevirtual   #50  <Method StringBuffer StringBuffer.append(char)>
		//   58  104:pop             
					flag = flag1;
		//   59  105:iload_3         
		//   60  106:istore_2        
				}
				flag2 = false;
				flag1 = flag;
				flag = flag2;
			} else
		//*  61  107:goto            74
			if(flag || flag1)
		//*  62  110:iload_2         
		//*  63  111:ifne            118
		//*  64  114:iload_3         
		//*  65  115:ifeq            132
			{
				buf.append(c);
		//   66  118:aload_0         
		//   67  119:getfield        #23  <Field StringBuffer buf>
		//   68  122:iload_1         
		//   69  123:invokevirtual   #50  <Method StringBuffer StringBuffer.append(char)>
		//   70  126:pop             
				flag = false;
		//   71  127:iconst_0        
		//   72  128:istore_2        
			} else
		//*  73  129:goto            82
			{
label0:
				{
					if(c != '\\')
						break label0;
		//   74  132:iload_1         
		//   75  133:bipush          92
		//   76  135:icmpne          143
					flag = true;
		//   77  138:iconst_1        
		//   78  139:istore_2        
				}
			}
_L3:
			i++;
			if(true) goto _L2; else goto _L1
		//*  79  140:goto            82
			if(c != ',')
				break MISSING_BLOCK_LABEL_166;
		//   80  143:iload_1         
		//   81  144:bipush          44
		//   82  146:icmpne          166
_L1:
			index = i;
		//   83  149:aload_0         
		//   84  150:iload           4
		//   85  152:putfield        #27  <Field int index>
			return buf.toString().trim();
		//   86  155:aload_0         
		//   87  156:getfield        #23  <Field StringBuffer buf>
		//   88  159:invokevirtual   #53  <Method String StringBuffer.toString()>
		//   89  162:invokevirtual   #56  <Method String String.trim()>
		//   90  165:areturn         
			buf.append(c);
		//   91  166:aload_0         
		//   92  167:getfield        #23  <Field StringBuffer buf>
		//   93  170:iload_1         
		//   94  171:invokevirtual   #50  <Method StringBuffer StringBuffer.append(char)>
		//   95  174:pop             
			  goto _L3
		//*  96  175:goto            82
		}

		private StringBuffer buf;
		private int index;
		private String oid;

		public X509NameTokenizer(String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			buf = new StringBuffer();
		//    2    4:aload_0         
		//    3    5:new             #20  <Class StringBuffer>
		//    4    8:dup             
		//    5    9:invokespecial   #21  <Method void StringBuffer()>
		//    6   12:putfield        #23  <Field StringBuffer buf>
			oid = s;
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:putfield        #25  <Field String oid>
			index = -1;
		//   10   20:aload_0         
		//   11   21:iconst_m1       
		//   12   22:putfield        #27  <Field int index>
		//   13   25:return          
		}
	}


	public CertificateInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public static ASN1Primitive getIssuer(byte abyte0[])
	{
		abyte0 = ((byte []) ((ASN1Sequence)(new ASN1InputStream(((java.io.InputStream) (new ByteArrayInputStream(abyte0))))).readObject()));
	//    0    0:new             #21  <Class ASN1InputStream>
	//    1    3:dup             
	//    2    4:new             #23  <Class ByteArrayInputStream>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #26  <Method void ByteArrayInputStream(byte[])>
	//    6   12:invokespecial   #29  <Method void ASN1InputStream(java.io.InputStream)>
	//    7   15:invokevirtual   #33  <Method ASN1Primitive ASN1InputStream.readObject()>
	//    8   18:checkcast       #35  <Class ASN1Sequence>
	//    9   21:astore_0        
		byte byte0;
		if(((ASN1Sequence) (abyte0)).getObjectAt(0) instanceof ASN1TaggedObject)
	//*  10   22:aload_0         
	//*  11   23:iconst_0        
	//*  12   24:invokevirtual   #39  <Method org.spongycastle.asn1.ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//*  13   27:instanceof      #41  <Class ASN1TaggedObject>
	//*  14   30:ifeq            46
			byte0 = 3;
	//   15   33:iconst_3        
	//   16   34:istore_1        
		else
	//*  17   35:aload_0         
	//*  18   36:iload_1         
	//*  19   37:invokevirtual   #39  <Method org.spongycastle.asn1.ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//*  20   40:checkcast       #43  <Class ASN1Primitive>
	//*  21   43:astore_0        
	//*  22   44:aload_0         
	//*  23   45:areturn         
			byte0 = 2;
	//   24   46:iconst_2        
	//   25   47:istore_1        
		try
		{
			abyte0 = ((byte []) ((ASN1Primitive)((ASN1Sequence) (abyte0)).getObjectAt(((int) (byte0)))));
		}
	//*  26   48:goto            35
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  27   51:astore_0        
		{
			throw new ExceptionConverter(((Exception) (abyte0)));
	//   28   52:new             #45  <Class ExceptionConverter>
	//   29   55:dup             
	//   30   56:aload_0         
	//   31   57:invokespecial   #48  <Method void ExceptionConverter(Exception)>
	//   32   60:athrow          
		}
		return ((ASN1Primitive) (abyte0));
	}

	public static X500Name getIssuerFields(X509Certificate x509certificate)
	{
		try
		{
			x509certificate = ((X509Certificate) (new X500Name((ASN1Sequence)getIssuer(x509certificate.getTBSCertificate()))));
	//    0    0:new             #6   <Class CertificateInfo$X500Name>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #58  <Method byte[] X509Certificate.getTBSCertificate()>
	//    4    8:invokestatic    #60  <Method ASN1Primitive getIssuer(byte[])>
	//    5   11:checkcast       #35  <Class ASN1Sequence>
	//    6   14:invokespecial   #63  <Method void CertificateInfo$X500Name(ASN1Sequence)>
	//    7   17:astore_0        
		}
	//*   8   18:aload_0         
	//*   9   19:areturn         
		// Misplaced declaration of an exception variable
		catch(X509Certificate x509certificate)
	//*  10   20:astore_0        
		{
			throw new ExceptionConverter(((Exception) (x509certificate)));
	//   11   21:new             #45  <Class ExceptionConverter>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:invokespecial   #48  <Method void ExceptionConverter(Exception)>
	//   15   29:athrow          
		}
		return ((X500Name) (x509certificate));
	}

	public static ASN1Primitive getSubject(byte abyte0[])
	{
		abyte0 = ((byte []) ((ASN1Sequence)(new ASN1InputStream(((java.io.InputStream) (new ByteArrayInputStream(abyte0))))).readObject()));
	//    0    0:new             #21  <Class ASN1InputStream>
	//    1    3:dup             
	//    2    4:new             #23  <Class ByteArrayInputStream>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #26  <Method void ByteArrayInputStream(byte[])>
	//    6   12:invokespecial   #29  <Method void ASN1InputStream(java.io.InputStream)>
	//    7   15:invokevirtual   #33  <Method ASN1Primitive ASN1InputStream.readObject()>
	//    8   18:checkcast       #35  <Class ASN1Sequence>
	//    9   21:astore_0        
		byte byte0;
		if(((ASN1Sequence) (abyte0)).getObjectAt(0) instanceof ASN1TaggedObject)
	//*  10   22:aload_0         
	//*  11   23:iconst_0        
	//*  12   24:invokevirtual   #39  <Method org.spongycastle.asn1.ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//*  13   27:instanceof      #41  <Class ASN1TaggedObject>
	//*  14   30:ifeq            46
			byte0 = 5;
	//   15   33:iconst_5        
	//   16   34:istore_1        
		else
	//*  17   35:aload_0         
	//*  18   36:iload_1         
	//*  19   37:invokevirtual   #39  <Method org.spongycastle.asn1.ASN1Encodable ASN1Sequence.getObjectAt(int)>
	//*  20   40:checkcast       #43  <Class ASN1Primitive>
	//*  21   43:astore_0        
	//*  22   44:aload_0         
	//*  23   45:areturn         
			byte0 = 4;
	//   24   46:iconst_4        
	//   25   47:istore_1        
		try
		{
			abyte0 = ((byte []) ((ASN1Primitive)((ASN1Sequence) (abyte0)).getObjectAt(((int) (byte0)))));
		}
	//*  26   48:goto            35
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  27   51:astore_0        
		{
			throw new ExceptionConverter(((Exception) (abyte0)));
	//   28   52:new             #45  <Class ExceptionConverter>
	//   29   55:dup             
	//   30   56:aload_0         
	//   31   57:invokespecial   #48  <Method void ExceptionConverter(Exception)>
	//   32   60:athrow          
		}
		return ((ASN1Primitive) (abyte0));
	}

	public static X500Name getSubjectFields(X509Certificate x509certificate)
	{
		if(x509certificate != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          34
		{
			try
			{
				x509certificate = ((X509Certificate) (new X500Name((ASN1Sequence)getSubject(x509certificate.getTBSCertificate()))));
	//    2    4:new             #6   <Class CertificateInfo$X500Name>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokevirtual   #58  <Method byte[] X509Certificate.getTBSCertificate()>
	//    6   12:invokestatic    #67  <Method ASN1Primitive getSubject(byte[])>
	//    7   15:checkcast       #35  <Class ASN1Sequence>
	//    8   18:invokespecial   #63  <Method void CertificateInfo$X500Name(ASN1Sequence)>
	//    9   21:astore_0        
			}
	//*  10   22:aload_0         
	//*  11   23:areturn         
			// Misplaced declaration of an exception variable
			catch(X509Certificate x509certificate)
	//*  12   24:astore_0        
			{
				throw new ExceptionConverter(((Exception) (x509certificate)));
	//   13   25:new             #45  <Class ExceptionConverter>
	//   14   28:dup             
	//   15   29:aload_0         
	//   16   30:invokespecial   #48  <Method void ExceptionConverter(Exception)>
	//   17   33:athrow          
			}
			return ((X500Name) (x509certificate));
		} else
		{
			return null;
	//   18   34:aconst_null     
	//   19   35:areturn         
		}
	}
}
