// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.xml;

import java.io.*;
import org.w3c.dom.*;

public class XmlDomWriter
{

	public XmlDomWriter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public XmlDomWriter(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		fCanonical = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #17  <Field boolean fCanonical>
	//    5    9:return          
	}

	protected void normalizeAndPrint(char c, boolean flag)
	{
		c;
	//    0    0:iload_1         
		JVM INSTR lookupswitch 6: default 60
	//	               10: 223
	//	               13: 213
	//	               34: 189
	//	               38: 179
	//	               60: 159
	//	               62: 169;
	//    1    1:lookupswitch    6: default 60
	//	               10: 223
	//	               13: 213
	//	               34: 189
	//	               38: 179
	//	               60: 159
	//	               62: 169
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
		if(fXML11 && (c >= '\001' && c <= '\037' && c != '\t' && c != '\n' || c >= '\177' && c <= '\237' || c == '\u2028') || flag && (c == '\t' || c == '\n'))
	//*   2   60:aload_0         
	//*   3   61:getfield        #21  <Field boolean fXML11>
	//*   4   64:ifeq            110
	//*   5   67:iload_1         
	//*   6   68:iconst_1        
	//*   7   69:icmplt          90
	//*   8   72:iload_1         
	//*   9   73:bipush          31
	//*  10   75:icmpgt          90
	//*  11   78:iload_1         
	//*  12   79:bipush          9
	//*  13   81:icmpeq          90
	//*  14   84:iload_1         
	//*  15   85:bipush          10
	//*  16   87:icmpne          126
	//*  17   90:iload_1         
	//*  18   91:bipush          127
	//*  19   93:icmplt          103
	//*  20   96:iload_1         
	//*  21   97:sipush          159
	//*  22  100:icmple          126
	//*  23  103:iload_1         
	//*  24  104:sipush          8232
	//*  25  107:icmpeq          126
	//*  26  110:iload_2         
	//*  27  111:ifeq            240
	//*  28  114:iload_1         
	//*  29  115:bipush          9
	//*  30  117:icmpeq          126
	//*  31  120:iload_1         
	//*  32  121:bipush          10
	//*  33  123:icmpne          240
		{
			fOut.print("&#x");
	//   34  126:aload_0         
	//   35  127:getfield        #23  <Field PrintWriter fOut>
	//   36  130:ldc1            #25  <String "&#x">
	//   37  132:invokevirtual   #31  <Method void PrintWriter.print(String)>
			fOut.print(Integer.toHexString(((int) (c))).toUpperCase());
	//   38  135:aload_0         
	//   39  136:getfield        #23  <Field PrintWriter fOut>
	//   40  139:iload_1         
	//   41  140:invokestatic    #37  <Method String Integer.toHexString(int)>
	//   42  143:invokevirtual   #43  <Method String String.toUpperCase()>
	//   43  146:invokevirtual   #31  <Method void PrintWriter.print(String)>
			fOut.print(";");
	//   44  149:aload_0         
	//   45  150:getfield        #23  <Field PrintWriter fOut>
	//   46  153:ldc1            #45  <String ";">
	//   47  155:invokevirtual   #31  <Method void PrintWriter.print(String)>
			return;
	//   48  158:return          
		} else
	//*  49  159:aload_0         
	//*  50  160:getfield        #23  <Field PrintWriter fOut>
	//*  51  163:ldc1            #47  <String "&lt;">
	//*  52  165:invokevirtual   #31  <Method void PrintWriter.print(String)>
	//*  53  168:return          
	//*  54  169:aload_0         
	//*  55  170:getfield        #23  <Field PrintWriter fOut>
	//*  56  173:ldc1            #49  <String "&gt;">
	//*  57  175:invokevirtual   #31  <Method void PrintWriter.print(String)>
	//*  58  178:return          
	//*  59  179:aload_0         
	//*  60  180:getfield        #23  <Field PrintWriter fOut>
	//*  61  183:ldc1            #51  <String "&amp;">
	//*  62  185:invokevirtual   #31  <Method void PrintWriter.print(String)>
	//*  63  188:return          
	//*  64  189:iload_2         
	//*  65  190:ifeq            203
	//*  66  193:aload_0         
	//*  67  194:getfield        #23  <Field PrintWriter fOut>
	//*  68  197:ldc1            #53  <String "&quot;">
	//*  69  199:invokevirtual   #31  <Method void PrintWriter.print(String)>
	//*  70  202:return          
	//*  71  203:aload_0         
	//*  72  204:getfield        #23  <Field PrintWriter fOut>
	//*  73  207:ldc1            #55  <String "\"">
	//*  74  209:invokevirtual   #31  <Method void PrintWriter.print(String)>
	//*  75  212:return          
	//*  76  213:aload_0         
	//*  77  214:getfield        #23  <Field PrintWriter fOut>
	//*  78  217:ldc1            #57  <String "&#xD;">
	//*  79  219:invokevirtual   #31  <Method void PrintWriter.print(String)>
	//*  80  222:return          
	//*  81  223:aload_0         
	//*  82  224:getfield        #17  <Field boolean fCanonical>
	//*  83  227:ifeq            60
	//*  84  230:aload_0         
	//*  85  231:getfield        #23  <Field PrintWriter fOut>
	//*  86  234:ldc1            #59  <String "&#xA;">
	//*  87  236:invokevirtual   #31  <Method void PrintWriter.print(String)>
	//*  88  239:return          
		{
			fOut.print(c);
	//   89  240:aload_0         
	//   90  241:getfield        #23  <Field PrintWriter fOut>
	//   91  244:iload_1         
	//   92  245:invokevirtual   #62  <Method void PrintWriter.print(char)>
			return;
	//   93  248:return          
		}
_L6:
		fOut.print("&lt;");
		return;
_L7:
		fOut.print("&gt;");
		return;
_L5:
		fOut.print("&amp;");
		return;
_L4:
		if(flag)
		{
			fOut.print("&quot;");
			return;
		} else
		{
			fOut.print("\"");
			return;
		}
_L3:
		fOut.print("&#xD;");
		return;
_L2:
		if(fCanonical)
		{
			fOut.print("&#xA;");
			return;
		}
		  goto _L1
	}

	protected void normalizeAndPrint(String s, boolean flag)
	{
		int i;
		int j;
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          38
			i = s.length();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #67  <Method int String.length()>
	//    4    8:istore_3        
		else
	//*   5    9:iconst_0        
	//*   6   10:istore          4
	//*   7   12:iload           4
	//*   8   14:iload_3         
	//*   9   15:icmpge          43
	//*  10   18:aload_0         
	//*  11   19:aload_1         
	//*  12   20:iload           4
	//*  13   22:invokevirtual   #71  <Method char String.charAt(int)>
	//*  14   25:iload_2         
	//*  15   26:invokevirtual   #73  <Method void normalizeAndPrint(char, boolean)>
	//*  16   29:iload           4
	//*  17   31:iconst_1        
	//*  18   32:iadd            
	//*  19   33:istore          4
	//*  20   35:goto            12
			i = 0;
	//   21   38:iconst_0        
	//   22   39:istore_3        
		for(j = 0; j < i; j++)
			normalizeAndPrint(s.charAt(j), flag);

	//*  23   40:goto            9
	//   24   43:return          
	}

	public void setCanonical(boolean flag)
	{
		fCanonical = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #17  <Field boolean fCanonical>
	//    3    5:return          
	}

	public void setOutput(OutputStream outputstream, String s)
		throws UnsupportedEncodingException
	{
		String s1 = s;
	//    0    0:aload_2         
	//    1    1:astore_3        
		if(s == null)
	//*   2    2:aload_2         
	//*   3    3:ifnonnull       9
			s1 = "UTF8";
	//    4    6:ldc1            #80  <String "UTF8">
	//    5    8:astore_3        
		fOut = new PrintWriter(((Writer) (new OutputStreamWriter(outputstream, s1))));
	//    6    9:aload_0         
	//    7   10:new             #27  <Class PrintWriter>
	//    8   13:dup             
	//    9   14:new             #82  <Class OutputStreamWriter>
	//   10   17:dup             
	//   11   18:aload_1         
	//   12   19:aload_3         
	//   13   20:invokespecial   #84  <Method void OutputStreamWriter(OutputStream, String)>
	//   14   23:invokespecial   #87  <Method void PrintWriter(Writer)>
	//   15   26:putfield        #23  <Field PrintWriter fOut>
	//   16   29:return          
	}

	public void setOutput(Writer writer)
	{
		if(writer instanceof PrintWriter)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #27  <Class PrintWriter>
	//*   2    4:ifeq            18
			writer = ((Writer) ((PrintWriter)writer));
	//    3    7:aload_1         
	//    4    8:checkcast       #27  <Class PrintWriter>
	//    5   11:astore_1        
		else
	//*   6   12:aload_0         
	//*   7   13:aload_1         
	//*   8   14:putfield        #23  <Field PrintWriter fOut>
	//*   9   17:return          
			writer = ((Writer) (new PrintWriter(writer)));
	//   10   18:new             #27  <Class PrintWriter>
	//   11   21:dup             
	//   12   22:aload_1         
	//   13   23:invokespecial   #87  <Method void PrintWriter(Writer)>
	//   14   26:astore_1        
		fOut = ((PrintWriter) (writer));
	//*  15   27:goto            12
	}

	protected Attr[] sortAttributes(NamedNodeMap namednodemap)
	{
		int l;
		Attr aattr[];
		if(namednodemap != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          48
			l = namednodemap.getLength();
	//    2    4:aload_1         
	//    3    5:invokeinterface #95  <Method int NamedNodeMap.getLength()>
	//    4   10:istore          4
		else
	//*   5   12:iload           4
	//*   6   14:anewarray       Attr[]
	//*   7   17:astore          8
	//*   8   19:iconst_0        
	//*   9   20:istore_2        
	//*  10   21:iload_2         
	//*  11   22:iload           4
	//*  12   24:icmpge          54
	//*  13   27:aload           8
	//*  14   29:iload_2         
	//*  15   30:aload_1         
	//*  16   31:iload_2         
	//*  17   32:invokeinterface #101 <Method Node NamedNodeMap.item(int)>
	//*  18   37:checkcast       #97  <Class Attr>
	//*  19   40:aastore         
	//*  20   41:iload_2         
	//*  21   42:iconst_1        
	//*  22   43:iadd            
	//*  23   44:istore_2        
	//*  24   45:goto            21
			l = 0;
	//   25   48:iconst_0        
	//   26   49:istore          4
		aattr = new Attr[l];
		for(int i = 0; i < l; i++)
			aattr[i] = (Attr)namednodemap.item(i);

	//*  27   51:goto            12
		for(int j = 0; j < l - 1; j++)
	//*  28   54:iconst_0        
	//*  29   55:istore_2        
	//*  30   56:iload_2         
	//*  31   57:iload           4
	//*  32   59:iconst_1        
	//*  33   60:isub            
	//*  34   61:icmpge          160
		{
			namednodemap = ((NamedNodeMap) (aattr[j].getNodeName()));
	//   35   64:aload           8
	//   36   66:iload_2         
	//   37   67:aaload          
	//   38   68:invokeinterface #104 <Method String Attr.getNodeName()>
	//   39   73:astore_1        
			int i1 = j;
	//   40   74:iload_2         
	//   41   75:istore          5
			for(int k = j + 1; k < l;)
	//*  42   77:iload_2         
	//*  43   78:iconst_1        
	//*  44   79:iadd            
	//*  45   80:istore_3        
	//*  46   81:iload_3         
	//*  47   82:iload           4
	//*  48   84:icmpge          127
			{
				String s = aattr[k].getNodeName();
	//   49   87:aload           8
	//   50   89:iload_3         
	//   51   90:aaload          
	//   52   91:invokeinterface #104 <Method String Attr.getNodeName()>
	//   53   96:astore          7
				Object obj = ((Object) (namednodemap));
	//   54   98:aload_1         
	//   55   99:astore          6
				if(s.compareTo(((String) (namednodemap))) < 0)
	//*  56  101:aload           7
	//*  57  103:aload_1         
	//*  58  104:invokevirtual   #108 <Method int String.compareTo(String)>
	//*  59  107:ifge            117
				{
					obj = ((Object) (s));
	//   60  110:aload           7
	//   61  112:astore          6
					i1 = k;
	//   62  114:iload_3         
	//   63  115:istore          5
				}
				k++;
	//   64  117:iload_3         
	//   65  118:iconst_1        
	//   66  119:iadd            
	//   67  120:istore_3        
				namednodemap = ((NamedNodeMap) (obj));
	//   68  121:aload           6
	//   69  123:astore_1        
			}

	//*  70  124:goto            81
			if(i1 != j)
	//*  71  127:iload           5
	//*  72  129:iload_2         
	//*  73  130:icmpeq          153
			{
				namednodemap = ((NamedNodeMap) (aattr[j]));
	//   74  133:aload           8
	//   75  135:iload_2         
	//   76  136:aaload          
	//   77  137:astore_1        
				aattr[j] = aattr[i1];
	//   78  138:aload           8
	//   79  140:iload_2         
	//   80  141:aload           8
	//   81  143:iload           5
	//   82  145:aaload          
	//   83  146:aastore         
				aattr[i1] = ((Attr) (namednodemap));
	//   84  147:aload           8
	//   85  149:iload           5
	//   86  151:aload_1         
	//   87  152:aastore         
			}
		}

	//   88  153:iload_2         
	//   89  154:iconst_1        
	//   90  155:iadd            
	//   91  156:istore_2        
	//*  92  157:goto            56
		return aattr;
	//   93  160:aload           8
	//   94  162:areturn         
	}

	public void write(Node node)
	{
		if(node != null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnonnull       5
_L1:
		return;
	//    2    4:return          
_L2:
		short word0 = node.getNodeType();
	//    3    5:aload_1         
	//    4    6:invokeinterface #116 <Method short Node.getNodeType()>
	//    5   11:istore_3        
		word0;
	//    6   12:iload_3         
		JVM INSTR tableswitch 1 10: default 68
	//	               1 375
	//	               2 68
	//	               3 672
	//	               4 610
	//	               5 531
	//	               6 68
	//	               7 693
	//	               8 773
	//	               9 112
	//	               10 190;
	//    7   13:tableswitch     1 10: default 68
	//	               1 375
	//	               2 68
	//	               3 672
	//	               4 610
	//	               5 531
	//	               6 68
	//	               7 693
	//	               8 773
	//	               9 112
	//	               10 190
		   goto _L3 _L4 _L3 _L5 _L6 _L7 _L3 _L8 _L9 _L10 _L11
_L9:
		break MISSING_BLOCK_LABEL_773;
_L3:
		break; /* Loop/switch isn't completed */
_L10:
		break; /* Loop/switch isn't completed */
_L13:
		if(word0 == 1)
	//*   8   68:iload_3         
	//*   9   69:iconst_1        
	//*  10   70:icmpne          4
		{
			fOut.print("</");
	//   11   73:aload_0         
	//   12   74:getfield        #23  <Field PrintWriter fOut>
	//   13   77:ldc1            #118 <String "</">
	//   14   79:invokevirtual   #31  <Method void PrintWriter.print(String)>
			fOut.print(node.getNodeName());
	//   15   82:aload_0         
	//   16   83:getfield        #23  <Field PrintWriter fOut>
	//   17   86:aload_1         
	//   18   87:invokeinterface #119 <Method String Node.getNodeName()>
	//   19   92:invokevirtual   #31  <Method void PrintWriter.print(String)>
			fOut.print('>');
	//   20   95:aload_0         
	//   21   96:getfield        #23  <Field PrintWriter fOut>
	//   22   99:bipush          62
	//   23  101:invokevirtual   #62  <Method void PrintWriter.print(char)>
			fOut.flush();
	//   24  104:aload_0         
	//   25  105:getfield        #23  <Field PrintWriter fOut>
	//   26  108:invokevirtual   #122 <Method void PrintWriter.flush()>
			return;
	//   27  111:return          
		}
		if(true) goto _L1; else goto _L12
_L12:
		Document document = (Document)node;
	//   28  112:aload_1         
	//   29  113:checkcast       #124 <Class Document>
	//   30  116:astore          4
		fXML11 = false;
	//   31  118:aload_0         
	//   32  119:iconst_0        
	//   33  120:putfield        #21  <Field boolean fXML11>
		if(!fCanonical)
	//*  34  123:aload_0         
	//*  35  124:getfield        #17  <Field boolean fCanonical>
	//*  36  127:ifne            164
		{
			if(fXML11)
	//*  37  130:aload_0         
	//*  38  131:getfield        #21  <Field boolean fXML11>
	//*  39  134:ifeq            178
				fOut.println("<?xml version=\"1.1\" encoding=\"UTF-8\"?>");
	//   40  137:aload_0         
	//   41  138:getfield        #23  <Field PrintWriter fOut>
	//   42  141:ldc1            #126 <String "<?xml version=\"1.1\" encoding=\"UTF-8\"?>">
	//   43  143:invokevirtual   #129 <Method void PrintWriter.println(String)>
			else
	//*  44  146:aload_0         
	//*  45  147:getfield        #23  <Field PrintWriter fOut>
	//*  46  150:invokevirtual   #122 <Method void PrintWriter.flush()>
	//*  47  153:aload_0         
	//*  48  154:aload           4
	//*  49  156:invokeinterface #133 <Method DocumentType Document.getDoctype()>
	//*  50  161:invokevirtual   #135 <Method void write(Node)>
	//*  51  164:aload_0         
	//*  52  165:aload           4
	//*  53  167:invokeinterface #139 <Method org.w3c.dom.Element Document.getDocumentElement()>
	//*  54  172:invokevirtual   #135 <Method void write(Node)>
	//*  55  175:goto            68
				fOut.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
	//   56  178:aload_0         
	//   57  179:getfield        #23  <Field PrintWriter fOut>
	//   58  182:ldc1            #141 <String "<?xml version=\"1.0\" encoding=\"UTF-8\"?>">
	//   59  184:invokevirtual   #129 <Method void PrintWriter.println(String)>
			fOut.flush();
			write(((Node) (document.getDoctype())));
		}
		write(((Node) (document.getDocumentElement())));
		  goto _L13
	//*  60  187:goto            146
_L11:
		Object obj = ((Object) ((DocumentType)node));
	//   61  190:aload_1         
	//   62  191:checkcast       #143 <Class DocumentType>
	//   63  194:astore          4
		fOut.print("<!DOCTYPE ");
	//   64  196:aload_0         
	//   65  197:getfield        #23  <Field PrintWriter fOut>
	//   66  200:ldc1            #145 <String "<!DOCTYPE ">
	//   67  202:invokevirtual   #31  <Method void PrintWriter.print(String)>
		fOut.print(((DocumentType) (obj)).getName());
	//   68  205:aload_0         
	//   69  206:getfield        #23  <Field PrintWriter fOut>
	//   70  209:aload           4
	//   71  211:invokeinterface #148 <Method String DocumentType.getName()>
	//   72  216:invokevirtual   #31  <Method void PrintWriter.print(String)>
		String s2 = ((DocumentType) (obj)).getPublicId();
	//   73  219:aload           4
	//   74  221:invokeinterface #151 <Method String DocumentType.getPublicId()>
	//   75  226:astore          5
		String s3 = ((DocumentType) (obj)).getSystemId();
	//   76  228:aload           4
	//   77  230:invokeinterface #154 <Method String DocumentType.getSystemId()>
	//   78  235:astore          6
		if(s2 != null)
	//*  79  237:aload           5
	//*  80  239:ifnull          340
		{
			fOut.print(" PUBLIC '");
	//   81  242:aload_0         
	//   82  243:getfield        #23  <Field PrintWriter fOut>
	//   83  246:ldc1            #156 <String " PUBLIC '">
	//   84  248:invokevirtual   #31  <Method void PrintWriter.print(String)>
			fOut.print(s2);
	//   85  251:aload_0         
	//   86  252:getfield        #23  <Field PrintWriter fOut>
	//   87  255:aload           5
	//   88  257:invokevirtual   #31  <Method void PrintWriter.print(String)>
			fOut.print("' '");
	//   89  260:aload_0         
	//   90  261:getfield        #23  <Field PrintWriter fOut>
	//   91  264:ldc1            #158 <String "' '">
	//   92  266:invokevirtual   #31  <Method void PrintWriter.print(String)>
			fOut.print(s3);
	//   93  269:aload_0         
	//   94  270:getfield        #23  <Field PrintWriter fOut>
	//   95  273:aload           6
	//   96  275:invokevirtual   #31  <Method void PrintWriter.print(String)>
			fOut.print('\'');
	//   97  278:aload_0         
	//   98  279:getfield        #23  <Field PrintWriter fOut>
	//   99  282:bipush          39
	//  100  284:invokevirtual   #62  <Method void PrintWriter.print(char)>
		} else
	//* 101  287:aload           4
	//* 102  289:invokeinterface #161 <Method String DocumentType.getInternalSubset()>
	//* 103  294:astore          4
	//* 104  296:aload           4
	//* 105  298:ifnull          328
	//* 106  301:aload_0         
	//* 107  302:getfield        #23  <Field PrintWriter fOut>
	//* 108  305:ldc1            #163 <String " [">
	//* 109  307:invokevirtual   #129 <Method void PrintWriter.println(String)>
	//* 110  310:aload_0         
	//* 111  311:getfield        #23  <Field PrintWriter fOut>
	//* 112  314:aload           4
	//* 113  316:invokevirtual   #31  <Method void PrintWriter.print(String)>
	//* 114  319:aload_0         
	//* 115  320:getfield        #23  <Field PrintWriter fOut>
	//* 116  323:bipush          93
	//* 117  325:invokevirtual   #62  <Method void PrintWriter.print(char)>
	//* 118  328:aload_0         
	//* 119  329:getfield        #23  <Field PrintWriter fOut>
	//* 120  332:bipush          62
	//* 121  334:invokevirtual   #165 <Method void PrintWriter.println(char)>
	//* 122  337:goto            68
		if(s3 != null)
	//* 123  340:aload           6
	//* 124  342:ifnull          287
		{
			fOut.print(" SYSTEM '");
	//  125  345:aload_0         
	//  126  346:getfield        #23  <Field PrintWriter fOut>
	//  127  349:ldc1            #167 <String " SYSTEM '">
	//  128  351:invokevirtual   #31  <Method void PrintWriter.print(String)>
			fOut.print(s3);
	//  129  354:aload_0         
	//  130  355:getfield        #23  <Field PrintWriter fOut>
	//  131  358:aload           6
	//  132  360:invokevirtual   #31  <Method void PrintWriter.print(String)>
			fOut.print('\'');
	//  133  363:aload_0         
	//  134  364:getfield        #23  <Field PrintWriter fOut>
	//  135  367:bipush          39
	//  136  369:invokevirtual   #62  <Method void PrintWriter.print(char)>
		}
		obj = ((Object) (((DocumentType) (obj)).getInternalSubset()));
		if(obj != null)
		{
			fOut.println(" [");
			fOut.print(((String) (obj)));
			fOut.print(']');
		}
		fOut.println('>');
		  goto _L13
	//* 137  372:goto            287
_L4:
		fOut.print('<');
	//  138  375:aload_0         
	//  139  376:getfield        #23  <Field PrintWriter fOut>
	//  140  379:bipush          60
	//  141  381:invokevirtual   #62  <Method void PrintWriter.print(char)>
		fOut.print(node.getNodeName());
	//  142  384:aload_0         
	//  143  385:getfield        #23  <Field PrintWriter fOut>
	//  144  388:aload_1         
	//  145  389:invokeinterface #119 <Method String Node.getNodeName()>
	//  146  394:invokevirtual   #31  <Method void PrintWriter.print(String)>
		Attr aattr[] = sortAttributes(node.getAttributes());
	//  147  397:aload_0         
	//  148  398:aload_1         
	//  149  399:invokeinterface #171 <Method NamedNodeMap Node.getAttributes()>
	//  150  404:invokevirtual   #173 <Method Attr[] sortAttributes(NamedNodeMap)>
	//  151  407:astore          4
		for(int i = 0; i < aattr.length; i++)
	//* 152  409:iconst_0        
	//* 153  410:istore_2        
	//* 154  411:iload_2         
	//* 155  412:aload           4
	//* 156  414:arraylength     
	//* 157  415:icmpge          484
		{
			Attr attr = aattr[i];
	//  158  418:aload           4
	//  159  420:iload_2         
	//  160  421:aaload          
	//  161  422:astore          5
			fOut.print(' ');
	//  162  424:aload_0         
	//  163  425:getfield        #23  <Field PrintWriter fOut>
	//  164  428:bipush          32
	//  165  430:invokevirtual   #62  <Method void PrintWriter.print(char)>
			fOut.print(attr.getNodeName());
	//  166  433:aload_0         
	//  167  434:getfield        #23  <Field PrintWriter fOut>
	//  168  437:aload           5
	//  169  439:invokeinterface #104 <Method String Attr.getNodeName()>
	//  170  444:invokevirtual   #31  <Method void PrintWriter.print(String)>
			fOut.print("=\"");
	//  171  447:aload_0         
	//  172  448:getfield        #23  <Field PrintWriter fOut>
	//  173  451:ldc1            #175 <String "=\"">
	//  174  453:invokevirtual   #31  <Method void PrintWriter.print(String)>
			normalizeAndPrint(attr.getNodeValue(), true);
	//  175  456:aload_0         
	//  176  457:aload           5
	//  177  459:invokeinterface #178 <Method String Attr.getNodeValue()>
	//  178  464:iconst_1        
	//  179  465:invokevirtual   #180 <Method void normalizeAndPrint(String, boolean)>
			fOut.print('"');
	//  180  468:aload_0         
	//  181  469:getfield        #23  <Field PrintWriter fOut>
	//  182  472:bipush          34
	//  183  474:invokevirtual   #62  <Method void PrintWriter.print(char)>
		}

	//  184  477:iload_2         
	//  185  478:iconst_1        
	//  186  479:iadd            
	//  187  480:istore_2        
	//* 188  481:goto            411
		fOut.print('>');
	//  189  484:aload_0         
	//  190  485:getfield        #23  <Field PrintWriter fOut>
	//  191  488:bipush          62
	//  192  490:invokevirtual   #62  <Method void PrintWriter.print(char)>
		fOut.flush();
	//  193  493:aload_0         
	//  194  494:getfield        #23  <Field PrintWriter fOut>
	//  195  497:invokevirtual   #122 <Method void PrintWriter.flush()>
		Node node1 = node.getFirstChild();
	//  196  500:aload_1         
	//  197  501:invokeinterface #184 <Method Node Node.getFirstChild()>
	//  198  506:astore          4
		while(node1 != null) 
	//* 199  508:aload           4
	//* 200  510:ifnull          68
		{
			write(node1);
	//  201  513:aload_0         
	//  202  514:aload           4
	//  203  516:invokevirtual   #135 <Method void write(Node)>
			node1 = node1.getNextSibling();
	//  204  519:aload           4
	//  205  521:invokeinterface #187 <Method Node Node.getNextSibling()>
	//  206  526:astore          4
		}
		  goto _L13
	//* 207  528:goto            508
_L7:
		if(fCanonical)
	//* 208  531:aload_0         
	//* 209  532:getfield        #17  <Field boolean fCanonical>
	//* 210  535:ifeq            569
		{
			Node node2 = node.getFirstChild();
	//  211  538:aload_1         
	//  212  539:invokeinterface #184 <Method Node Node.getFirstChild()>
	//  213  544:astore          4
			while(node2 != null) 
	//* 214  546:aload           4
	//* 215  548:ifnull          68
			{
				write(node2);
	//  216  551:aload_0         
	//  217  552:aload           4
	//  218  554:invokevirtual   #135 <Method void write(Node)>
				node2 = node2.getNextSibling();
	//  219  557:aload           4
	//  220  559:invokeinterface #187 <Method Node Node.getNextSibling()>
	//  221  564:astore          4
			}
		} else
	//* 222  566:goto            546
		{
			fOut.print('&');
	//  223  569:aload_0         
	//  224  570:getfield        #23  <Field PrintWriter fOut>
	//  225  573:bipush          38
	//  226  575:invokevirtual   #62  <Method void PrintWriter.print(char)>
			fOut.print(node.getNodeName());
	//  227  578:aload_0         
	//  228  579:getfield        #23  <Field PrintWriter fOut>
	//  229  582:aload_1         
	//  230  583:invokeinterface #119 <Method String Node.getNodeName()>
	//  231  588:invokevirtual   #31  <Method void PrintWriter.print(String)>
			fOut.print(';');
	//  232  591:aload_0         
	//  233  592:getfield        #23  <Field PrintWriter fOut>
	//  234  595:bipush          59
	//  235  597:invokevirtual   #62  <Method void PrintWriter.print(char)>
			fOut.flush();
	//  236  600:aload_0         
	//  237  601:getfield        #23  <Field PrintWriter fOut>
	//  238  604:invokevirtual   #122 <Method void PrintWriter.flush()>
		}
		  goto _L13
	//* 239  607:goto            68
_L6:
		if(fCanonical)
	//* 240  610:aload_0         
	//* 241  611:getfield        #17  <Field boolean fCanonical>
	//* 242  614:ifeq            638
		{
			normalizeAndPrint(node.getNodeValue(), false);
	//  243  617:aload_0         
	//  244  618:aload_1         
	//  245  619:invokeinterface #188 <Method String Node.getNodeValue()>
	//  246  624:iconst_0        
	//  247  625:invokevirtual   #180 <Method void normalizeAndPrint(String, boolean)>
		} else
	//* 248  628:aload_0         
	//* 249  629:getfield        #23  <Field PrintWriter fOut>
	//* 250  632:invokevirtual   #122 <Method void PrintWriter.flush()>
	//* 251  635:goto            68
		{
			fOut.print("<![CDATA[");
	//  252  638:aload_0         
	//  253  639:getfield        #23  <Field PrintWriter fOut>
	//  254  642:ldc1            #190 <String "<![CDATA[">
	//  255  644:invokevirtual   #31  <Method void PrintWriter.print(String)>
			fOut.print(node.getNodeValue());
	//  256  647:aload_0         
	//  257  648:getfield        #23  <Field PrintWriter fOut>
	//  258  651:aload_1         
	//  259  652:invokeinterface #188 <Method String Node.getNodeValue()>
	//  260  657:invokevirtual   #31  <Method void PrintWriter.print(String)>
			fOut.print("]]>");
	//  261  660:aload_0         
	//  262  661:getfield        #23  <Field PrintWriter fOut>
	//  263  664:ldc1            #192 <String "]]>">
	//  264  666:invokevirtual   #31  <Method void PrintWriter.print(String)>
		}
		fOut.flush();
		  goto _L13
	//* 265  669:goto            628
_L5:
		normalizeAndPrint(node.getNodeValue(), false);
	//  266  672:aload_0         
	//  267  673:aload_1         
	//  268  674:invokeinterface #188 <Method String Node.getNodeValue()>
	//  269  679:iconst_0        
	//  270  680:invokevirtual   #180 <Method void normalizeAndPrint(String, boolean)>
		fOut.flush();
	//  271  683:aload_0         
	//  272  684:getfield        #23  <Field PrintWriter fOut>
	//  273  687:invokevirtual   #122 <Method void PrintWriter.flush()>
		  goto _L13
	//* 274  690:goto            68
_L8:
		fOut.print("<?");
	//  275  693:aload_0         
	//  276  694:getfield        #23  <Field PrintWriter fOut>
	//  277  697:ldc1            #194 <String "<?">
	//  278  699:invokevirtual   #31  <Method void PrintWriter.print(String)>
		fOut.print(node.getNodeName());
	//  279  702:aload_0         
	//  280  703:getfield        #23  <Field PrintWriter fOut>
	//  281  706:aload_1         
	//  282  707:invokeinterface #119 <Method String Node.getNodeName()>
	//  283  712:invokevirtual   #31  <Method void PrintWriter.print(String)>
		String s = node.getNodeValue();
	//  284  715:aload_1         
	//  285  716:invokeinterface #188 <Method String Node.getNodeValue()>
	//  286  721:astore          4
		if(s != null && s.length() > 0)
	//* 287  723:aload           4
	//* 288  725:ifnull          754
	//* 289  728:aload           4
	//* 290  730:invokevirtual   #67  <Method int String.length()>
	//* 291  733:ifle            754
		{
			fOut.print(' ');
	//  292  736:aload_0         
	//  293  737:getfield        #23  <Field PrintWriter fOut>
	//  294  740:bipush          32
	//  295  742:invokevirtual   #62  <Method void PrintWriter.print(char)>
			fOut.print(s);
	//  296  745:aload_0         
	//  297  746:getfield        #23  <Field PrintWriter fOut>
	//  298  749:aload           4
	//  299  751:invokevirtual   #31  <Method void PrintWriter.print(String)>
		}
		fOut.print("?>");
	//  300  754:aload_0         
	//  301  755:getfield        #23  <Field PrintWriter fOut>
	//  302  758:ldc1            #196 <String "?>">
	//  303  760:invokevirtual   #31  <Method void PrintWriter.print(String)>
		fOut.flush();
	//  304  763:aload_0         
	//  305  764:getfield        #23  <Field PrintWriter fOut>
	//  306  767:invokevirtual   #122 <Method void PrintWriter.flush()>
		  goto _L13
	//* 307  770:goto            68
		if(!fCanonical)
	//* 308  773:aload_0         
	//* 309  774:getfield        #17  <Field boolean fCanonical>
	//* 310  777:ifne            68
		{
			fOut.print("<!--");
	//  311  780:aload_0         
	//  312  781:getfield        #23  <Field PrintWriter fOut>
	//  313  784:ldc1            #198 <String "<!--">
	//  314  786:invokevirtual   #31  <Method void PrintWriter.print(String)>
			String s1 = node.getNodeValue();
	//  315  789:aload_1         
	//  316  790:invokeinterface #188 <Method String Node.getNodeValue()>
	//  317  795:astore          4
			if(s1 != null && s1.length() > 0)
	//* 318  797:aload           4
	//* 319  799:ifnull          819
	//* 320  802:aload           4
	//* 321  804:invokevirtual   #67  <Method int String.length()>
	//* 322  807:ifle            819
				fOut.print(s1);
	//  323  810:aload_0         
	//  324  811:getfield        #23  <Field PrintWriter fOut>
	//  325  814:aload           4
	//  326  816:invokevirtual   #31  <Method void PrintWriter.print(String)>
			fOut.print("-->");
	//  327  819:aload_0         
	//  328  820:getfield        #23  <Field PrintWriter fOut>
	//  329  823:ldc1            #200 <String "-->">
	//  330  825:invokevirtual   #31  <Method void PrintWriter.print(String)>
			fOut.flush();
	//  331  828:aload_0         
	//  332  829:getfield        #23  <Field PrintWriter fOut>
	//  333  832:invokevirtual   #122 <Method void PrintWriter.flush()>
		}
		  goto _L13
	//* 334  835:goto            68
	}

	protected boolean fCanonical;
	protected PrintWriter fOut;
	protected boolean fXML11;
}
