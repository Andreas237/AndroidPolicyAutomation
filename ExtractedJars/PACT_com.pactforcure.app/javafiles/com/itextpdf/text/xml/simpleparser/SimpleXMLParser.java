// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.xml.simpleparser;

import com.itextpdf.text.error_messages.MessageLocalization;
import com.itextpdf.text.xml.XMLUtil;
import com.itextpdf.text.xml.simpleparser.handler.HTMLNewLineHandler;
import com.itextpdf.text.xml.simpleparser.handler.NeverNewLineHandler;
import java.io.*;
import java.util.HashMap;
import java.util.Stack;

// Referenced classes of package com.itextpdf.text.xml.simpleparser:
//			SimpleXMLDocHandler, SimpleXMLDocHandlerComment, EntitiesToUnicode, IanaEncodings, 
//			NewLineHandler

public final class SimpleXMLParser
{

	private SimpleXMLParser(SimpleXMLDocHandler simplexmldochandler, SimpleXMLDocHandlerComment simplexmldochandlercomment, boolean flag)
	{
		int i = 1;
	//    0    0:iconst_1        
	//    1    1:istore          4
		super();
	//    2    3:aload_0         
	//    3    4:invokespecial   #70  <Method void Object()>
		character = 0;
	//    4    7:aload_0         
	//    5    8:iconst_0        
	//    6    9:putfield        #72  <Field int character>
		previousCharacter = -1;
	//    7   12:aload_0         
	//    8   13:iconst_m1       
	//    9   14:putfield        #74  <Field int previousCharacter>
		lines = 1;
	//   10   17:aload_0         
	//   11   18:iconst_1        
	//   12   19:putfield        #76  <Field int lines>
		columns = 0;
	//   13   22:aload_0         
	//   14   23:iconst_0        
	//   15   24:putfield        #78  <Field int columns>
		eol = false;
	//   16   27:aload_0         
	//   17   28:iconst_0        
	//   18   29:putfield        #80  <Field boolean eol>
		nowhite = false;
	//   19   32:aload_0         
	//   20   33:iconst_0        
	//   21   34:putfield        #82  <Field boolean nowhite>
	//   22   37:aload_0         
	//   23   38:new             #84  <Class StringBuffer>
	//   24   41:dup             
	//   25   42:invokespecial   #85  <Method void StringBuffer()>
	//   26   45:putfield        #87  <Field StringBuffer text>
	//   27   48:aload_0         
	//   28   49:new             #84  <Class StringBuffer>
	//   29   52:dup             
	//   30   53:invokespecial   #85  <Method void StringBuffer()>
	//   31   56:putfield        #89  <Field StringBuffer entity>
		tag = null;
	//   32   59:aload_0         
	//   33   60:aconst_null     
	//   34   61:putfield        #91  <Field String tag>
		attributes = null;
	//   35   64:aload_0         
	//   36   65:aconst_null     
	//   37   66:putfield        #93  <Field HashMap attributes>
		nested = 0;
	//   38   69:aload_0         
	//   39   70:iconst_0        
	//   40   71:putfield        #95  <Field int nested>
		quoteCharacter = 34;
	//   41   74:aload_0         
	//   42   75:bipush          34
	//   43   77:putfield        #97  <Field int quoteCharacter>
		attributekey = null;
	//   44   80:aload_0         
	//   45   81:aconst_null     
	//   46   82:putfield        #99  <Field String attributekey>
		attributevalue = null;
	//   47   85:aload_0         
	//   48   86:aconst_null     
	//   49   87:putfield        #101 <Field String attributevalue>
		doc = simplexmldochandler;
	//   50   90:aload_0         
	//   51   91:aload_1         
	//   52   92:putfield        #103 <Field SimpleXMLDocHandler doc>
		comment = simplexmldochandlercomment;
	//   53   95:aload_0         
	//   54   96:aload_2         
	//   55   97:putfield        #105 <Field SimpleXMLDocHandlerComment comment>
		html = flag;
	//   56  100:aload_0         
	//   57  101:iload_3         
	//   58  102:putfield        #107 <Field boolean html>
		if(flag)
	//*  59  105:iload_3         
	//*  60  106:ifeq            142
			newLineHandler = ((NewLineHandler) (new HTMLNewLineHandler()));
	//   61  109:aload_0         
	//   62  110:new             #109 <Class HTMLNewLineHandler>
	//   63  113:dup             
	//   64  114:invokespecial   #110 <Method void HTMLNewLineHandler()>
	//   65  117:putfield        #112 <Field NewLineHandler newLineHandler>
		else
	//*  66  120:aload_0         
	//*  67  121:new             #114 <Class Stack>
	//*  68  124:dup             
	//*  69  125:invokespecial   #115 <Method void Stack()>
	//*  70  128:putfield        #117 <Field Stack stack>
	//*  71  131:iload_3         
	//*  72  132:ifeq            156
	//*  73  135:aload_0         
	//*  74  136:iload           4
	//*  75  138:putfield        #119 <Field int state>
	//*  76  141:return          
			newLineHandler = ((NewLineHandler) (new NeverNewLineHandler()));
	//   77  142:aload_0         
	//   78  143:new             #121 <Class NeverNewLineHandler>
	//   79  146:dup             
	//   80  147:invokespecial   #122 <Method void NeverNewLineHandler()>
	//   81  150:putfield        #112 <Field NewLineHandler newLineHandler>
		if(!flag)
	//*  82  153:goto            120
			i = 0;
	//   83  156:iconst_0        
	//   84  157:istore          4
		state = i;
	//*  85  159:goto            135
	}

	private void doTag()
	{
		if(tag == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #91  <Field String tag>
	//*   2    4:ifnonnull       18
			tag = text.toString();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #87  <Field StringBuffer text>
	//    6   12:invokevirtual   #128 <Method String StringBuffer.toString()>
	//    7   15:putfield        #91  <Field String tag>
		if(html)
	//*   8   18:aload_0         
	//*   9   19:getfield        #107 <Field boolean html>
	//*  10   22:ifeq            36
			tag = tag.toLowerCase();
	//   11   25:aload_0         
	//   12   26:aload_0         
	//   13   27:getfield        #91  <Field String tag>
	//   14   30:invokevirtual   #133 <Method String String.toLowerCase()>
	//   15   33:putfield        #91  <Field String tag>
		text.setLength(0);
	//   16   36:aload_0         
	//   17   37:getfield        #87  <Field StringBuffer text>
	//   18   40:iconst_0        
	//   19   41:invokevirtual   #137 <Method void StringBuffer.setLength(int)>
	//   20   44:return          
	}

	public static String escapeXML(String s, boolean flag)
	{
		return XMLUtil.escapeXML(s, flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #144 <Method String XMLUtil.escapeXML(String, boolean)>
	//    3    5:areturn         
	}

	private void flush()
	{
		state;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field int state>
		JVM INSTR tableswitch 1 14: default 76
	//	               1 85
	//	               2 76
	//	               3 76
	//	               4 76
	//	               5 76
	//	               6 76
	//	               7 85
	//	               8 114
	//	               9 76
	//	               10 76
	//	               11 172
	//	               12 140
	//	               13 76
	//	               14 172;
	//    2    4:tableswitch     1 14: default 76
	//	               1 85
	//	               2 76
	//	               3 76
	//	               4 76
	//	               5 76
	//	               6 76
	//	               7 85
	//	               8 114
	//	               9 76
	//	               10 76
	//	               11 172
	//	               12 140
	//	               13 76
	//	               14 172
		   goto _L1 _L2 _L1 _L1 _L1 _L1 _L1 _L2 _L3 _L1 _L1 _L4 _L5 _L1 _L4
_L1:
		text.setLength(0);
	//    3   76:aload_0         
	//    4   77:getfield        #87  <Field StringBuffer text>
	//    5   80:iconst_0        
	//    6   81:invokevirtual   #137 <Method void StringBuffer.setLength(int)>
		return;
	//    7   84:return          
_L2:
		if(text.length() > 0)
	//*   8   85:aload_0         
	//*   9   86:getfield        #87  <Field StringBuffer text>
	//*  10   89:invokevirtual   #150 <Method int StringBuffer.length()>
	//*  11   92:ifle            76
			doc.text(text.toString());
	//   12   95:aload_0         
	//   13   96:getfield        #103 <Field SimpleXMLDocHandler doc>
	//   14   99:aload_0         
	//   15  100:getfield        #87  <Field StringBuffer text>
	//   16  103:invokevirtual   #128 <Method String StringBuffer.toString()>
	//   17  106:invokeinterface #155 <Method void SimpleXMLDocHandler.text(String)>
		continue; /* Loop/switch isn't completed */
	//   18  111:goto            76
_L3:
		if(comment != null)
	//*  19  114:aload_0         
	//*  20  115:getfield        #105 <Field SimpleXMLDocHandlerComment comment>
	//*  21  118:ifnull          76
			comment.comment(text.toString());
	//   22  121:aload_0         
	//   23  122:getfield        #105 <Field SimpleXMLDocHandlerComment comment>
	//   24  125:aload_0         
	//   25  126:getfield        #87  <Field StringBuffer text>
	//   26  129:invokevirtual   #128 <Method String StringBuffer.toString()>
	//   27  132:invokeinterface #159 <Method void SimpleXMLDocHandlerComment.comment(String)>
		continue; /* Loop/switch isn't completed */
	//   28  137:goto            76
_L5:
		attributekey = text.toString();
	//   29  140:aload_0         
	//   30  141:aload_0         
	//   31  142:getfield        #87  <Field StringBuffer text>
	//   32  145:invokevirtual   #128 <Method String StringBuffer.toString()>
	//   33  148:putfield        #99  <Field String attributekey>
		if(html)
	//*  34  151:aload_0         
	//*  35  152:getfield        #107 <Field boolean html>
	//*  36  155:ifeq            76
			attributekey = attributekey.toLowerCase();
	//   37  158:aload_0         
	//   38  159:aload_0         
	//   39  160:getfield        #99  <Field String attributekey>
	//   40  163:invokevirtual   #133 <Method String String.toLowerCase()>
	//   41  166:putfield        #99  <Field String attributekey>
		continue; /* Loop/switch isn't completed */
	//   42  169:goto            76
_L4:
		attributevalue = text.toString();
	//   43  172:aload_0         
	//   44  173:aload_0         
	//   45  174:getfield        #87  <Field StringBuffer text>
	//   46  177:invokevirtual   #128 <Method String StringBuffer.toString()>
	//   47  180:putfield        #101 <Field String attributevalue>
		attributes.put(((Object) (attributekey)), ((Object) (attributevalue)));
	//   48  183:aload_0         
	//   49  184:getfield        #93  <Field HashMap attributes>
	//   50  187:aload_0         
	//   51  188:getfield        #99  <Field String attributekey>
	//   52  191:aload_0         
	//   53  192:getfield        #101 <Field String attributevalue>
	//   54  195:invokevirtual   #165 <Method Object HashMap.put(Object, Object)>
	//   55  198:pop             
		if(true) goto _L1; else goto _L6
	//   56  199:goto            76
_L6:
	}

	private static String getDeclaredEncoding(String s)
	{
		if(s != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnonnull       6
_L1:
		int j;
		return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
	//*   4    6:aload_0         
	//*   5    7:ldc1            #169 <String "encoding">
	//*   6    9:invokevirtual   #173 <Method int String.indexOf(String)>
	//*   7   12:istore_2        
_L2:
		int i;
		if((j = s.indexOf("encoding")) >= 0)
	//*   8   13:iload_2         
	//*   9   14:iflt            4
		{
			i = s.indexOf('"', j);
	//   10   17:aload_0         
	//   11   18:bipush          34
	//   12   20:iload_2         
	//   13   21:invokevirtual   #176 <Method int String.indexOf(int, int)>
	//   14   24:istore_1        
			j = s.indexOf('\'', j);
	//   15   25:aload_0         
	//   16   26:bipush          39
	//   17   28:iload_2         
	//   18   29:invokevirtual   #176 <Method int String.indexOf(int, int)>
	//   19   32:istore_2        
			if(i != j)
	//*  20   33:iload_1         
	//*  21   34:iload_2         
	//*  22   35:icmpeq          4
			{
				if((i >= 0 || j <= 0) && (j <= 0 || j >= i))
					continue; /* Loop/switch isn't completed */
	//   23   38:iload_1         
	//   24   39:ifge            46
	//   25   42:iload_2         
	//   26   43:ifgt            55
	//   27   46:iload_2         
	//   28   47:ifle            78
	//   29   50:iload_2         
	//   30   51:iload_1         
	//   31   52:icmpge          78
				i = s.indexOf('\'', j + 1);
	//   32   55:aload_0         
	//   33   56:bipush          39
	//   34   58:iload_2         
	//   35   59:iconst_1        
	//   36   60:iadd            
	//   37   61:invokevirtual   #176 <Method int String.indexOf(int, int)>
	//   38   64:istore_1        
				if(i >= 0)
	//*  39   65:iload_1         
	//*  40   66:iflt            4
					return s.substring(j + 1, i);
	//   41   69:aload_0         
	//   42   70:iload_2         
	//   43   71:iconst_1        
	//   44   72:iadd            
	//   45   73:iload_1         
	//   46   74:invokevirtual   #180 <Method String String.substring(int, int)>
	//   47   77:areturn         
			}
		}
		continue; /* Loop/switch isn't completed */
		if((j >= 0 || i <= 0) && (i <= 0 || i >= j)) goto _L1; else goto _L3
	//   48   78:iload_2         
	//   49   79:ifge            86
	//   50   82:iload_1         
	//   51   83:ifgt            95
	//   52   86:iload_1         
	//   53   87:ifle            4
	//   54   90:iload_1         
	//   55   91:iload_2         
	//   56   92:icmpge          4
_L3:
		int k = s.indexOf('"', i + 1);
	//   57   95:aload_0         
	//   58   96:bipush          34
	//   59   98:iload_1         
	//   60   99:iconst_1        
	//   61  100:iadd            
	//   62  101:invokevirtual   #176 <Method int String.indexOf(int, int)>
	//   63  104:istore_2        
		if(k >= 0)
	//*  64  105:iload_2         
	//*  65  106:iflt            4
			return s.substring(i + 1, k);
	//   66  109:aload_0         
	//   67  110:iload_1         
	//   68  111:iconst_1        
	//   69  112:iadd            
	//   70  113:iload_2         
	//   71  114:invokevirtual   #180 <Method String String.substring(int, int)>
	//   72  117:areturn         
		if(true) goto _L1; else goto _L4
_L4:
	}

	private void go(Reader reader)
		throws IOException
	{
		if(reader instanceof BufferedReader)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #186 <Class BufferedReader>
	//*   2    4:ifeq            81
			reader = ((Reader) ((BufferedReader)reader));
	//    3    7:aload_1         
	//    4    8:checkcast       #186 <Class BufferedReader>
	//    5   11:astore_1        
		else
	//*   6   12:aload_0         
	//*   7   13:getfield        #103 <Field SimpleXMLDocHandler doc>
	//*   8   16:invokeinterface #189 <Method void SimpleXMLDocHandler.startDocument()>
	//*   9   21:aload_0         
	//*  10   22:getfield        #74  <Field int previousCharacter>
	//*  11   25:iconst_m1       
	//*  12   26:icmpne          93
	//*  13   29:aload_0         
	//*  14   30:aload_1         
	//*  15   31:invokevirtual   #192 <Method int BufferedReader.read()>
	//*  16   34:putfield        #72  <Field int character>
	//*  17   37:aload_0         
	//*  18   38:getfield        #72  <Field int character>
	//*  19   41:iconst_m1       
	//*  20   42:icmpne          123
	//*  21   45:aload_0         
	//*  22   46:getfield        #107 <Field boolean html>
	//*  23   49:ifeq            109
	//*  24   52:aload_0         
	//*  25   53:getfield        #107 <Field boolean html>
	//*  26   56:ifeq            71
	//*  27   59:aload_0         
	//*  28   60:getfield        #119 <Field int state>
	//*  29   63:iconst_1        
	//*  30   64:icmpne          71
	//*  31   67:aload_0         
	//*  32   68:invokespecial   #194 <Method void flush()>
	//*  33   71:aload_0         
	//*  34   72:getfield        #103 <Field SimpleXMLDocHandler doc>
	//*  35   75:invokeinterface #197 <Method void SimpleXMLDocHandler.endDocument()>
	//*  36   80:return          
			reader = ((Reader) (new BufferedReader(reader)));
	//   37   81:new             #186 <Class BufferedReader>
	//   38   84:dup             
	//   39   85:aload_1         
	//   40   86:invokespecial   #199 <Method void BufferedReader(Reader)>
	//   41   89:astore_1        
		doc.startDocument();
		do
		{
			if(previousCharacter == -1)
			{
				character = ((BufferedReader) (reader)).read();
			} else
	//*  42   90:goto            12
			{
				character = previousCharacter;
	//   43   93:aload_0         
	//   44   94:aload_0         
	//   45   95:getfield        #74  <Field int previousCharacter>
	//   46   98:putfield        #72  <Field int character>
				previousCharacter = -1;
	//   47  101:aload_0         
	//   48  102:iconst_m1       
	//   49  103:putfield        #74  <Field int previousCharacter>
			}
			if(character == -1)
				if(html)
				{
					if(html && state == 1)
						flush();
					doc.endDocument();
					return;
				} else
	//*  50  106:goto            37
				{
					throwException(MessageLocalization.getComposedMessage("missing.end.tag", new Object[0]));
	//   51  109:aload_0         
	//   52  110:ldc1            #201 <String "missing.end.tag">
	//   53  112:iconst_0        
	//   54  113:anewarray       Object[]
	//   55  116:invokestatic    #207 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   56  119:invokespecial   #210 <Method void throwException(String)>
					return;
	//   57  122:return          
				}
			if(character == 10 && eol)
	//*  58  123:aload_0         
	//*  59  124:getfield        #72  <Field int character>
	//*  60  127:bipush          10
	//*  61  129:icmpne          147
	//*  62  132:aload_0         
	//*  63  133:getfield        #80  <Field boolean eol>
	//*  64  136:ifeq            147
			{
				eol = false;
	//   65  139:aload_0         
	//   66  140:iconst_0        
	//   67  141:putfield        #80  <Field boolean eol>
				continue; /* Loop/switch isn't completed */
	//   68  144:goto            21
			}
			if(eol)
	//*  69  147:aload_0         
	//*  70  148:getfield        #80  <Field boolean eol>
	//*  71  151:ifeq            261
				eol = false;
	//   72  154:aload_0         
	//   73  155:iconst_0        
	//   74  156:putfield        #80  <Field boolean eol>
			else
	//*  75  159:aload_0         
	//*  76  160:getfield        #119 <Field int state>
	//*  77  163:tableswitch     0 14: default 236
	//	               0 239
	//	               1 339
	//	               2 543
	//	               3 608
	//	               4 809
	//	               5 889
	//	               6 959
	//	               7 1041
	//	               8 1112
	//	               9 1183
	//	               10 1216
	//	               11 1430
	//	               12 1649
	//	               13 1755
	//	               14 1907
	//*  78  236:goto            21
	//*  79  239:aload_0         
	//*  80  240:getfield        #72  <Field int character>
	//*  81  243:bipush          60
	//*  82  245:icmpne          21
	//*  83  248:aload_0         
	//*  84  249:iconst_1        
	//*  85  250:invokespecial   #213 <Method void saveState(int)>
	//*  86  253:aload_0         
	//*  87  254:iconst_2        
	//*  88  255:putfield        #119 <Field int state>
	//*  89  258:goto            21
			if(character == 10)
	//*  90  261:aload_0         
	//*  91  262:getfield        #72  <Field int character>
	//*  92  265:bipush          10
	//*  93  267:icmpne          288
			{
				lines = lines + 1;
	//   94  270:aload_0         
	//   95  271:aload_0         
	//   96  272:getfield        #76  <Field int lines>
	//   97  275:iconst_1        
	//   98  276:iadd            
	//   99  277:putfield        #76  <Field int lines>
				columns = 0;
	//  100  280:aload_0         
	//  101  281:iconst_0        
	//  102  282:putfield        #78  <Field int columns>
			} else
	//* 103  285:goto            159
			if(character == 13)
	//* 104  288:aload_0         
	//* 105  289:getfield        #72  <Field int character>
	//* 106  292:bipush          13
	//* 107  294:icmpne          326
			{
				eol = true;
	//  108  297:aload_0         
	//  109  298:iconst_1        
	//  110  299:putfield        #80  <Field boolean eol>
				character = 10;
	//  111  302:aload_0         
	//  112  303:bipush          10
	//  113  305:putfield        #72  <Field int character>
				lines = lines + 1;
	//  114  308:aload_0         
	//  115  309:aload_0         
	//  116  310:getfield        #76  <Field int lines>
	//  117  313:iconst_1        
	//  118  314:iadd            
	//  119  315:putfield        #76  <Field int lines>
				columns = 0;
	//  120  318:aload_0         
	//  121  319:iconst_0        
	//  122  320:putfield        #78  <Field int columns>
			} else
	//* 123  323:goto            159
			{
				columns = columns + 1;
	//  124  326:aload_0         
	//  125  327:aload_0         
	//  126  328:getfield        #78  <Field int columns>
	//  127  331:iconst_1        
	//  128  332:iadd            
	//  129  333:putfield        #78  <Field int columns>
			}
			switch(state)
			{
			default:
				continue; /* Loop/switch isn't completed */

			case 0: // '\0'
				if(character == 60)
				{
					saveState(1);
					state = 2;
				}
				continue; /* Loop/switch isn't completed */

	//* 130  336:goto            159
			case 1: // '\001'
				if(character == 60)
	//* 131  339:aload_0         
	//* 132  340:getfield        #72  <Field int character>
	//* 133  343:bipush          60
	//* 134  345:icmpne          368
				{
					flush();
	//  135  348:aload_0         
	//  136  349:invokespecial   #194 <Method void flush()>
					saveState(state);
	//  137  352:aload_0         
	//  138  353:aload_0         
	//  139  354:getfield        #119 <Field int state>
	//  140  357:invokespecial   #213 <Method void saveState(int)>
					state = 2;
	//  141  360:aload_0         
	//  142  361:iconst_2        
	//  143  362:putfield        #119 <Field int state>
				} else
	//* 144  365:goto            21
				if(character == 38)
	//* 145  368:aload_0         
	//* 146  369:getfield        #72  <Field int character>
	//* 147  372:bipush          38
	//* 148  374:icmpne          407
				{
					saveState(state);
	//  149  377:aload_0         
	//  150  378:aload_0         
	//  151  379:getfield        #119 <Field int state>
	//  152  382:invokespecial   #213 <Method void saveState(int)>
					entity.setLength(0);
	//  153  385:aload_0         
	//  154  386:getfield        #89  <Field StringBuffer entity>
	//  155  389:iconst_0        
	//  156  390:invokevirtual   #137 <Method void StringBuffer.setLength(int)>
					state = 10;
	//  157  393:aload_0         
	//  158  394:bipush          10
	//  159  396:putfield        #119 <Field int state>
					nowhite = true;
	//  160  399:aload_0         
	//  161  400:iconst_1        
	//  162  401:putfield        #82  <Field boolean nowhite>
				} else
	//* 163  404:goto            21
				if(character == 32)
	//* 164  407:aload_0         
	//* 165  408:getfield        #72  <Field int character>
	//* 166  411:bipush          32
	//* 167  413:icmpne          476
				{
					if(html && nowhite)
	//* 168  416:aload_0         
	//* 169  417:getfield        #107 <Field boolean html>
	//* 170  420:ifeq            448
	//* 171  423:aload_0         
	//* 172  424:getfield        #82  <Field boolean nowhite>
	//* 173  427:ifeq            448
					{
						text.append(' ');
	//  174  430:aload_0         
	//  175  431:getfield        #87  <Field StringBuffer text>
	//  176  434:bipush          32
	//  177  436:invokevirtual   #217 <Method StringBuffer StringBuffer.append(char)>
	//  178  439:pop             
						nowhite = false;
	//  179  440:aload_0         
	//  180  441:iconst_0        
	//  181  442:putfield        #82  <Field boolean nowhite>
					} else
	//* 182  445:goto            21
					{
						if(nowhite)
	//* 183  448:aload_0         
	//* 184  449:getfield        #82  <Field boolean nowhite>
	//* 185  452:ifeq            468
							text.append((char)character);
	//  186  455:aload_0         
	//  187  456:getfield        #87  <Field StringBuffer text>
	//  188  459:aload_0         
	//  189  460:getfield        #72  <Field int character>
	//  190  463:int2char        
	//  191  464:invokevirtual   #217 <Method StringBuffer StringBuffer.append(char)>
	//  192  467:pop             
						nowhite = false;
	//  193  468:aload_0         
	//  194  469:iconst_0        
	//  195  470:putfield        #82  <Field boolean nowhite>
					}
				} else
	//* 196  473:goto            21
				if(Character.isWhitespace((char)character))
	//* 197  476:aload_0         
	//* 198  477:getfield        #72  <Field int character>
	//* 199  480:int2char        
	//* 200  481:invokestatic    #223 <Method boolean Character.isWhitespace(char)>
	//* 201  484:ifeq            522
				{
					if(!html)
	//* 202  487:aload_0         
	//* 203  488:getfield        #107 <Field boolean html>
	//* 204  491:ifne            21
					{
						if(nowhite)
	//* 205  494:aload_0         
	//* 206  495:getfield        #82  <Field boolean nowhite>
	//* 207  498:ifeq            514
							text.append((char)character);
	//  208  501:aload_0         
	//  209  502:getfield        #87  <Field StringBuffer text>
	//  210  505:aload_0         
	//  211  506:getfield        #72  <Field int character>
	//  212  509:int2char        
	//  213  510:invokevirtual   #217 <Method StringBuffer StringBuffer.append(char)>
	//  214  513:pop             
						nowhite = false;
	//  215  514:aload_0         
	//  216  515:iconst_0        
	//  217  516:putfield        #82  <Field boolean nowhite>
					}
				} else
	//* 218  519:goto            21
				{
					text.append((char)character);
	//  219  522:aload_0         
	//  220  523:getfield        #87  <Field StringBuffer text>
	//  221  526:aload_0         
	//  222  527:getfield        #72  <Field int character>
	//  223  530:int2char        
	//  224  531:invokevirtual   #217 <Method StringBuffer StringBuffer.append(char)>
	//  225  534:pop             
					nowhite = true;
	//  226  535:aload_0         
	//  227  536:iconst_1        
	//  228  537:putfield        #82  <Field boolean nowhite>
				}
				continue; /* Loop/switch isn't completed */
	//  229  540:goto            21

			case 2: // '\002'
				initTag();
	//  230  543:aload_0         
	//  231  544:invokespecial   #226 <Method void initTag()>
				if(character == 47)
	//* 232  547:aload_0         
	//* 233  548:getfield        #72  <Field int character>
	//* 234  551:bipush          47
	//* 235  553:icmpne          564
					state = 5;
	//  236  556:aload_0         
	//  237  557:iconst_5        
	//  238  558:putfield        #119 <Field int state>
				else
	//* 239  561:goto            21
				if(character == 63)
	//* 240  564:aload_0         
	//* 241  565:getfield        #72  <Field int character>
	//* 242  568:bipush          63
	//* 243  570:icmpne          587
				{
					restoreState();
	//  244  573:aload_0         
	//  245  574:invokespecial   #229 <Method int restoreState()>
	//  246  577:pop             
					state = 9;
	//  247  578:aload_0         
	//  248  579:bipush          9
	//  249  581:putfield        #119 <Field int state>
				} else
	//* 250  584:goto            21
				{
					text.append((char)character);
	//  251  587:aload_0         
	//  252  588:getfield        #87  <Field StringBuffer text>
	//  253  591:aload_0         
	//  254  592:getfield        #72  <Field int character>
	//  255  595:int2char        
	//  256  596:invokevirtual   #217 <Method StringBuffer StringBuffer.append(char)>
	//  257  599:pop             
					state = 3;
	//  258  600:aload_0         
	//  259  601:iconst_3        
	//  260  602:putfield        #119 <Field int state>
				}
				continue; /* Loop/switch isn't completed */
	//  261  605:goto            21

			case 3: // '\003'
				if(character == 62)
	//* 262  608:aload_0         
	//* 263  609:getfield        #72  <Field int character>
	//* 264  612:bipush          62
	//* 265  614:icmpne          641
				{
					doTag();
	//  266  617:aload_0         
	//  267  618:invokespecial   #231 <Method void doTag()>
					processTag(true);
	//  268  621:aload_0         
	//  269  622:iconst_1        
	//  270  623:invokespecial   #235 <Method void processTag(boolean)>
					initTag();
	//  271  626:aload_0         
	//  272  627:invokespecial   #226 <Method void initTag()>
					state = restoreState();
	//  273  630:aload_0         
	//  274  631:aload_0         
	//  275  632:invokespecial   #229 <Method int restoreState()>
	//  276  635:putfield        #119 <Field int state>
				} else
	//* 277  638:goto            21
				if(character == 47)
	//* 278  641:aload_0         
	//* 279  642:getfield        #72  <Field int character>
	//* 280  645:bipush          47
	//* 281  647:icmpne          659
					state = 6;
	//  282  650:aload_0         
	//  283  651:bipush          6
	//  284  653:putfield        #119 <Field int state>
				else
	//* 285  656:goto            21
				if(character == 45 && text.toString().equals("!-"))
	//* 286  659:aload_0         
	//* 287  660:getfield        #72  <Field int character>
	//* 288  663:bipush          45
	//* 289  665:icmpne          696
	//* 290  668:aload_0         
	//* 291  669:getfield        #87  <Field StringBuffer text>
	//* 292  672:invokevirtual   #128 <Method String StringBuffer.toString()>
	//* 293  675:ldc1            #237 <String "!-">
	//* 294  677:invokevirtual   #241 <Method boolean String.equals(Object)>
	//* 295  680:ifeq            696
				{
					flush();
	//  296  683:aload_0         
	//  297  684:invokespecial   #194 <Method void flush()>
					state = 8;
	//  298  687:aload_0         
	//  299  688:bipush          8
	//  300  690:putfield        #119 <Field int state>
				} else
	//* 301  693:goto            21
				if(character == 91 && text.toString().equals("![CDATA"))
	//* 302  696:aload_0         
	//* 303  697:getfield        #72  <Field int character>
	//* 304  700:bipush          91
	//* 305  702:icmpne          733
	//* 306  705:aload_0         
	//* 307  706:getfield        #87  <Field StringBuffer text>
	//* 308  709:invokevirtual   #128 <Method String StringBuffer.toString()>
	//* 309  712:ldc1            #243 <String "![CDATA">
	//* 310  714:invokevirtual   #241 <Method boolean String.equals(Object)>
	//* 311  717:ifeq            733
				{
					flush();
	//  312  720:aload_0         
	//  313  721:invokespecial   #194 <Method void flush()>
					state = 7;
	//  314  724:aload_0         
	//  315  725:bipush          7
	//  316  727:putfield        #119 <Field int state>
				} else
	//* 317  730:goto            21
				if(character == 69 && text.toString().equals("!DOCTYP"))
	//* 318  733:aload_0         
	//* 319  734:getfield        #72  <Field int character>
	//* 320  737:bipush          69
	//* 321  739:icmpne          770
	//* 322  742:aload_0         
	//* 323  743:getfield        #87  <Field StringBuffer text>
	//* 324  746:invokevirtual   #128 <Method String StringBuffer.toString()>
	//* 325  749:ldc1            #245 <String "!DOCTYP">
	//* 326  751:invokevirtual   #241 <Method boolean String.equals(Object)>
	//* 327  754:ifeq            770
				{
					flush();
	//  328  757:aload_0         
	//  329  758:invokespecial   #194 <Method void flush()>
					state = 9;
	//  330  761:aload_0         
	//  331  762:bipush          9
	//  332  764:putfield        #119 <Field int state>
				} else
	//* 333  767:goto            21
				if(Character.isWhitespace((char)character))
	//* 334  770:aload_0         
	//* 335  771:getfield        #72  <Field int character>
	//* 336  774:int2char        
	//* 337  775:invokestatic    #223 <Method boolean Character.isWhitespace(char)>
	//* 338  778:ifeq            793
				{
					doTag();
	//  339  781:aload_0         
	//  340  782:invokespecial   #231 <Method void doTag()>
					state = 4;
	//  341  785:aload_0         
	//  342  786:iconst_4        
	//  343  787:putfield        #119 <Field int state>
				} else
	//* 344  790:goto            21
				{
					text.append((char)character);
	//  345  793:aload_0         
	//  346  794:getfield        #87  <Field StringBuffer text>
	//  347  797:aload_0         
	//  348  798:getfield        #72  <Field int character>
	//  349  801:int2char        
	//  350  802:invokevirtual   #217 <Method StringBuffer StringBuffer.append(char)>
	//  351  805:pop             
				}
				continue; /* Loop/switch isn't completed */
	//  352  806:goto            21

			case 4: // '\004'
				if(character == 62)
	//* 353  809:aload_0         
	//* 354  810:getfield        #72  <Field int character>
	//* 355  813:bipush          62
	//* 356  815:icmpne          838
				{
					processTag(true);
	//  357  818:aload_0         
	//  358  819:iconst_1        
	//  359  820:invokespecial   #235 <Method void processTag(boolean)>
					initTag();
	//  360  823:aload_0         
	//  361  824:invokespecial   #226 <Method void initTag()>
					state = restoreState();
	//  362  827:aload_0         
	//  363  828:aload_0         
	//  364  829:invokespecial   #229 <Method int restoreState()>
	//  365  832:putfield        #119 <Field int state>
				} else
	//* 366  835:goto            21
				if(character == 47)
	//* 367  838:aload_0         
	//* 368  839:getfield        #72  <Field int character>
	//* 369  842:bipush          47
	//* 370  844:icmpne          856
					state = 6;
	//  371  847:aload_0         
	//  372  848:bipush          6
	//  373  850:putfield        #119 <Field int state>
				else
	//* 374  853:goto            21
				if(!Character.isWhitespace((char)character))
	//* 375  856:aload_0         
	//* 376  857:getfield        #72  <Field int character>
	//* 377  860:int2char        
	//* 378  861:invokestatic    #223 <Method boolean Character.isWhitespace(char)>
	//* 379  864:ifne            21
				{
					text.append((char)character);
	//  380  867:aload_0         
	//  381  868:getfield        #87  <Field StringBuffer text>
	//  382  871:aload_0         
	//  383  872:getfield        #72  <Field int character>
	//  384  875:int2char        
	//  385  876:invokevirtual   #217 <Method StringBuffer StringBuffer.append(char)>
	//  386  879:pop             
					state = 12;
	//  387  880:aload_0         
	//  388  881:bipush          12
	//  389  883:putfield        #119 <Field int state>
				}
				continue; /* Loop/switch isn't completed */
	//  390  886:goto            21

			case 5: // '\005'
				if(character == 62)
	//* 391  889:aload_0         
	//* 392  890:getfield        #72  <Field int character>
	//* 393  893:bipush          62
	//* 394  895:icmpne          932
				{
					doTag();
	//  395  898:aload_0         
	//  396  899:invokespecial   #231 <Method void doTag()>
					processTag(false);
	//  397  902:aload_0         
	//  398  903:iconst_0        
	//  399  904:invokespecial   #235 <Method void processTag(boolean)>
					if(html || nested != 0)
	//* 400  907:aload_0         
	//* 401  908:getfield        #107 <Field boolean html>
	//* 402  911:ifne            921
	//* 403  914:aload_0         
	//* 404  915:getfield        #95  <Field int nested>
	//* 405  918:ifeq            80
					{
						state = restoreState();
	//  406  921:aload_0         
	//  407  922:aload_0         
	//  408  923:invokespecial   #229 <Method int restoreState()>
	//  409  926:putfield        #119 <Field int state>
						continue; /* Loop/switch isn't completed */
	//  410  929:goto            21
					}
				} else
				{
					if(!Character.isWhitespace((char)character))
	//* 411  932:aload_0         
	//* 412  933:getfield        #72  <Field int character>
	//* 413  936:int2char        
	//* 414  937:invokestatic    #223 <Method boolean Character.isWhitespace(char)>
	//* 415  940:ifne            21
						text.append((char)character);
	//  416  943:aload_0         
	//  417  944:getfield        #87  <Field StringBuffer text>
	//  418  947:aload_0         
	//  419  948:getfield        #72  <Field int character>
	//  420  951:int2char        
	//  421  952:invokevirtual   #217 <Method StringBuffer StringBuffer.append(char)>
	//  422  955:pop             
					continue; /* Loop/switch isn't completed */
	//  423  956:goto            21
				}
				break;

			case 6: // '\006'
				if(character != 62)
	//* 424  959:aload_0         
	//* 425  960:getfield        #72  <Field int character>
	//* 426  963:bipush          62
	//* 427  965:icmpeq          988
					throwException(MessageLocalization.getComposedMessage("expected.gt.for.tag.lt.1.gt", new Object[] {
						tag
					}));
	//  428  968:aload_0         
	//  429  969:ldc1            #247 <String "expected.gt.for.tag.lt.1.gt">
	//  430  971:iconst_1        
	//  431  972:anewarray       Object[]
	//  432  975:dup             
	//  433  976:iconst_0        
	//  434  977:aload_0         
	//  435  978:getfield        #91  <Field String tag>
	//  436  981:aastore         
	//  437  982:invokestatic    #207 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  438  985:invokespecial   #210 <Method void throwException(String)>
				doTag();
	//  439  988:aload_0         
	//  440  989:invokespecial   #231 <Method void doTag()>
				processTag(true);
	//  441  992:aload_0         
	//  442  993:iconst_1        
	//  443  994:invokespecial   #235 <Method void processTag(boolean)>
				processTag(false);
	//  444  997:aload_0         
	//  445  998:iconst_0        
	//  446  999:invokespecial   #235 <Method void processTag(boolean)>
				initTag();
	//  447 1002:aload_0         
	//  448 1003:invokespecial   #226 <Method void initTag()>
				if(!html && nested == 0)
	//* 449 1006:aload_0         
	//* 450 1007:getfield        #107 <Field boolean html>
	//* 451 1010:ifne            1030
	//* 452 1013:aload_0         
	//* 453 1014:getfield        #95  <Field int nested>
	//* 454 1017:ifne            1030
				{
					doc.endDocument();
	//  455 1020:aload_0         
	//  456 1021:getfield        #103 <Field SimpleXMLDocHandler doc>
	//  457 1024:invokeinterface #197 <Method void SimpleXMLDocHandler.endDocument()>
					return;
	//  458 1029:return          
				}
				state = restoreState();
	//  459 1030:aload_0         
	//  460 1031:aload_0         
	//  461 1032:invokespecial   #229 <Method int restoreState()>
	//  462 1035:putfield        #119 <Field int state>
				continue; /* Loop/switch isn't completed */
	//  463 1038:goto            21

			case 7: // '\007'
				if(character == 62 && text.toString().endsWith("]]"))
	//* 464 1041:aload_0         
	//* 465 1042:getfield        #72  <Field int character>
	//* 466 1045:bipush          62
	//* 467 1047:icmpne          1096
	//* 468 1050:aload_0         
	//* 469 1051:getfield        #87  <Field StringBuffer text>
	//* 470 1054:invokevirtual   #128 <Method String StringBuffer.toString()>
	//* 471 1057:ldc1            #249 <String "]]">
	//* 472 1059:invokevirtual   #253 <Method boolean String.endsWith(String)>
	//* 473 1062:ifeq            1096
				{
					text.setLength(text.length() - 2);
	//  474 1065:aload_0         
	//  475 1066:getfield        #87  <Field StringBuffer text>
	//  476 1069:aload_0         
	//  477 1070:getfield        #87  <Field StringBuffer text>
	//  478 1073:invokevirtual   #150 <Method int StringBuffer.length()>
	//  479 1076:iconst_2        
	//  480 1077:isub            
	//  481 1078:invokevirtual   #137 <Method void StringBuffer.setLength(int)>
					flush();
	//  482 1081:aload_0         
	//  483 1082:invokespecial   #194 <Method void flush()>
					state = restoreState();
	//  484 1085:aload_0         
	//  485 1086:aload_0         
	//  486 1087:invokespecial   #229 <Method int restoreState()>
	//  487 1090:putfield        #119 <Field int state>
				} else
	//* 488 1093:goto            21
				{
					text.append((char)character);
	//  489 1096:aload_0         
	//  490 1097:getfield        #87  <Field StringBuffer text>
	//  491 1100:aload_0         
	//  492 1101:getfield        #72  <Field int character>
	//  493 1104:int2char        
	//  494 1105:invokevirtual   #217 <Method StringBuffer StringBuffer.append(char)>
	//  495 1108:pop             
				}
				continue; /* Loop/switch isn't completed */
	//  496 1109:goto            21

			case 8: // '\b'
				if(character == 62 && text.toString().endsWith("--"))
	//* 497 1112:aload_0         
	//* 498 1113:getfield        #72  <Field int character>
	//* 499 1116:bipush          62
	//* 500 1118:icmpne          1167
	//* 501 1121:aload_0         
	//* 502 1122:getfield        #87  <Field StringBuffer text>
	//* 503 1125:invokevirtual   #128 <Method String StringBuffer.toString()>
	//* 504 1128:ldc1            #255 <String "--">
	//* 505 1130:invokevirtual   #253 <Method boolean String.endsWith(String)>
	//* 506 1133:ifeq            1167
				{
					text.setLength(text.length() - 2);
	//  507 1136:aload_0         
	//  508 1137:getfield        #87  <Field StringBuffer text>
	//  509 1140:aload_0         
	//  510 1141:getfield        #87  <Field StringBuffer text>
	//  511 1144:invokevirtual   #150 <Method int StringBuffer.length()>
	//  512 1147:iconst_2        
	//  513 1148:isub            
	//  514 1149:invokevirtual   #137 <Method void StringBuffer.setLength(int)>
					flush();
	//  515 1152:aload_0         
	//  516 1153:invokespecial   #194 <Method void flush()>
					state = restoreState();
	//  517 1156:aload_0         
	//  518 1157:aload_0         
	//  519 1158:invokespecial   #229 <Method int restoreState()>
	//  520 1161:putfield        #119 <Field int state>
				} else
	//* 521 1164:goto            21
				{
					text.append((char)character);
	//  522 1167:aload_0         
	//  523 1168:getfield        #87  <Field StringBuffer text>
	//  524 1171:aload_0         
	//  525 1172:getfield        #72  <Field int character>
	//  526 1175:int2char        
	//  527 1176:invokevirtual   #217 <Method StringBuffer StringBuffer.append(char)>
	//  528 1179:pop             
				}
				continue; /* Loop/switch isn't completed */
	//  529 1180:goto            21

			case 9: // '\t'
				if(character == 62)
	//* 530 1183:aload_0         
	//* 531 1184:getfield        #72  <Field int character>
	//* 532 1187:bipush          62
	//* 533 1189:icmpne          21
				{
					state = restoreState();
	//  534 1192:aload_0         
	//  535 1193:aload_0         
	//  536 1194:invokespecial   #229 <Method int restoreState()>
	//  537 1197:putfield        #119 <Field int state>
					if(state == 1)
	//* 538 1200:aload_0         
	//* 539 1201:getfield        #119 <Field int state>
	//* 540 1204:iconst_1        
	//* 541 1205:icmpne          21
						state = 0;
	//  542 1208:aload_0         
	//  543 1209:iconst_0        
	//  544 1210:putfield        #119 <Field int state>
				}
				continue; /* Loop/switch isn't completed */
	//  545 1213:goto            21

			case 10: // '\n'
				if(character == 59)
	//* 546 1216:aload_0         
	//* 547 1217:getfield        #72  <Field int character>
	//* 548 1220:bipush          59
	//* 549 1222:icmpne          1292
				{
					state = restoreState();
	//  550 1225:aload_0         
	//  551 1226:aload_0         
	//  552 1227:invokespecial   #229 <Method int restoreState()>
	//  553 1230:putfield        #119 <Field int state>
					String s = entity.toString();
	//  554 1233:aload_0         
	//  555 1234:getfield        #89  <Field StringBuffer entity>
	//  556 1237:invokevirtual   #128 <Method String StringBuffer.toString()>
	//  557 1240:astore_3        
					entity.setLength(0);
	//  558 1241:aload_0         
	//  559 1242:getfield        #89  <Field StringBuffer entity>
	//  560 1245:iconst_0        
	//  561 1246:invokevirtual   #137 <Method void StringBuffer.setLength(int)>
					char c = EntitiesToUnicode.decodeEntity(s);
	//  562 1249:aload_3         
	//  563 1250:invokestatic    #261 <Method char EntitiesToUnicode.decodeEntity(String)>
	//  564 1253:istore_2        
					if(c == 0)
	//* 565 1254:iload_2         
	//* 566 1255:ifne            1280
						text.append('&').append(s).append(';');
	//  567 1258:aload_0         
	//  568 1259:getfield        #87  <Field StringBuffer text>
	//  569 1262:bipush          38
	//  570 1264:invokevirtual   #217 <Method StringBuffer StringBuffer.append(char)>
	//  571 1267:aload_3         
	//  572 1268:invokevirtual   #264 <Method StringBuffer StringBuffer.append(String)>
	//  573 1271:bipush          59
	//  574 1273:invokevirtual   #217 <Method StringBuffer StringBuffer.append(char)>
	//  575 1276:pop             
					else
	//* 576 1277:goto            21
						text.append(c);
	//  577 1280:aload_0         
	//  578 1281:getfield        #87  <Field StringBuffer text>
	//  579 1284:iload_2         
	//  580 1285:invokevirtual   #217 <Method StringBuffer StringBuffer.append(char)>
	//  581 1288:pop             
				} else
	//* 582 1289:goto            21
				if(character != 35 && (character < 48 || character > 57) && (character < 97 || character > 122) && (character < 65 || character > 90) || entity.length() >= 7)
	//* 583 1292:aload_0         
	//* 584 1293:getfield        #72  <Field int character>
	//* 585 1296:bipush          35
	//* 586 1298:icmpeq          1355
	//* 587 1301:aload_0         
	//* 588 1302:getfield        #72  <Field int character>
	//* 589 1305:bipush          48
	//* 590 1307:icmplt          1319
	//* 591 1310:aload_0         
	//* 592 1311:getfield        #72  <Field int character>
	//* 593 1314:bipush          57
	//* 594 1316:icmple          1355
	//* 595 1319:aload_0         
	//* 596 1320:getfield        #72  <Field int character>
	//* 597 1323:bipush          97
	//* 598 1325:icmplt          1337
	//* 599 1328:aload_0         
	//* 600 1329:getfield        #72  <Field int character>
	//* 601 1332:bipush          122
	//* 602 1334:icmple          1355
	//* 603 1337:aload_0         
	//* 604 1338:getfield        #72  <Field int character>
	//* 605 1341:bipush          65
	//* 606 1343:icmplt          1367
	//* 607 1346:aload_0         
	//* 608 1347:getfield        #72  <Field int character>
	//* 609 1350:bipush          90
	//* 610 1352:icmpgt          1367
	//* 611 1355:aload_0         
	//* 612 1356:getfield        #89  <Field StringBuffer entity>
	//* 613 1359:invokevirtual   #150 <Method int StringBuffer.length()>
	//* 614 1362:bipush          7
	//* 615 1364:icmplt          1414
				{
					state = restoreState();
	//  616 1367:aload_0         
	//  617 1368:aload_0         
	//  618 1369:invokespecial   #229 <Method int restoreState()>
	//  619 1372:putfield        #119 <Field int state>
					previousCharacter = character;
	//  620 1375:aload_0         
	//  621 1376:aload_0         
	//  622 1377:getfield        #72  <Field int character>
	//  623 1380:putfield        #74  <Field int previousCharacter>
					text.append('&').append(entity.toString());
	//  624 1383:aload_0         
	//  625 1384:getfield        #87  <Field StringBuffer text>
	//  626 1387:bipush          38
	//  627 1389:invokevirtual   #217 <Method StringBuffer StringBuffer.append(char)>
	//  628 1392:aload_0         
	//  629 1393:getfield        #89  <Field StringBuffer entity>
	//  630 1396:invokevirtual   #128 <Method String StringBuffer.toString()>
	//  631 1399:invokevirtual   #264 <Method StringBuffer StringBuffer.append(String)>
	//  632 1402:pop             
					entity.setLength(0);
	//  633 1403:aload_0         
	//  634 1404:getfield        #89  <Field StringBuffer entity>
	//  635 1407:iconst_0        
	//  636 1408:invokevirtual   #137 <Method void StringBuffer.setLength(int)>
				} else
	//* 637 1411:goto            21
				{
					entity.append((char)character);
	//  638 1414:aload_0         
	//  639 1415:getfield        #89  <Field StringBuffer entity>
	//  640 1418:aload_0         
	//  641 1419:getfield        #72  <Field int character>
	//  642 1422:int2char        
	//  643 1423:invokevirtual   #217 <Method StringBuffer StringBuffer.append(char)>
	//  644 1426:pop             
				}
				continue; /* Loop/switch isn't completed */
	//  645 1427:goto            21

			case 11: // '\013'
				if(html && quoteCharacter == 32 && character == 62)
	//* 646 1430:aload_0         
	//* 647 1431:getfield        #107 <Field boolean html>
	//* 648 1434:ifeq            1479
	//* 649 1437:aload_0         
	//* 650 1438:getfield        #97  <Field int quoteCharacter>
	//* 651 1441:bipush          32
	//* 652 1443:icmpne          1479
	//* 653 1446:aload_0         
	//* 654 1447:getfield        #72  <Field int character>
	//* 655 1450:bipush          62
	//* 656 1452:icmpne          1479
				{
					flush();
	//  657 1455:aload_0         
	//  658 1456:invokespecial   #194 <Method void flush()>
					processTag(true);
	//  659 1459:aload_0         
	//  660 1460:iconst_1        
	//  661 1461:invokespecial   #235 <Method void processTag(boolean)>
					initTag();
	//  662 1464:aload_0         
	//  663 1465:invokespecial   #226 <Method void initTag()>
					state = restoreState();
	//  664 1468:aload_0         
	//  665 1469:aload_0         
	//  666 1470:invokespecial   #229 <Method int restoreState()>
	//  667 1473:putfield        #119 <Field int state>
				} else
	//* 668 1476:goto            21
				if(html && quoteCharacter == 32 && Character.isWhitespace((char)character))
	//* 669 1479:aload_0         
	//* 670 1480:getfield        #107 <Field boolean html>
	//* 671 1483:ifeq            1518
	//* 672 1486:aload_0         
	//* 673 1487:getfield        #97  <Field int quoteCharacter>
	//* 674 1490:bipush          32
	//* 675 1492:icmpne          1518
	//* 676 1495:aload_0         
	//* 677 1496:getfield        #72  <Field int character>
	//* 678 1499:int2char        
	//* 679 1500:invokestatic    #223 <Method boolean Character.isWhitespace(char)>
	//* 680 1503:ifeq            1518
				{
					flush();
	//  681 1506:aload_0         
	//  682 1507:invokespecial   #194 <Method void flush()>
					state = 4;
	//  683 1510:aload_0         
	//  684 1511:iconst_4        
	//  685 1512:putfield        #119 <Field int state>
				} else
	//* 686 1515:goto            21
				if(html && quoteCharacter == 32)
	//* 687 1518:aload_0         
	//* 688 1519:getfield        #107 <Field boolean html>
	//* 689 1522:ifeq            1550
	//* 690 1525:aload_0         
	//* 691 1526:getfield        #97  <Field int quoteCharacter>
	//* 692 1529:bipush          32
	//* 693 1531:icmpne          1550
					text.append((char)character);
	//  694 1534:aload_0         
	//  695 1535:getfield        #87  <Field StringBuffer text>
	//  696 1538:aload_0         
	//  697 1539:getfield        #72  <Field int character>
	//  698 1542:int2char        
	//  699 1543:invokevirtual   #217 <Method StringBuffer StringBuffer.append(char)>
	//  700 1546:pop             
				else
	//* 701 1547:goto            21
				if(character == quoteCharacter)
	//* 702 1550:aload_0         
	//* 703 1551:getfield        #72  <Field int character>
	//* 704 1554:aload_0         
	//* 705 1555:getfield        #97  <Field int quoteCharacter>
	//* 706 1558:icmpne          1573
				{
					flush();
	//  707 1561:aload_0         
	//  708 1562:invokespecial   #194 <Method void flush()>
					state = 4;
	//  709 1565:aload_0         
	//  710 1566:iconst_4        
	//  711 1567:putfield        #119 <Field int state>
				} else
	//* 712 1570:goto            21
				if(" \r\n\t".indexOf(character) >= 0)
	//* 713 1573:ldc2            #266 <String " \r\n\t">
	//* 714 1576:aload_0         
	//* 715 1577:getfield        #72  <Field int character>
	//* 716 1580:invokevirtual   #269 <Method int String.indexOf(int)>
	//* 717 1583:iflt            1599
					text.append(' ');
	//  718 1586:aload_0         
	//  719 1587:getfield        #87  <Field StringBuffer text>
	//  720 1590:bipush          32
	//  721 1592:invokevirtual   #217 <Method StringBuffer StringBuffer.append(char)>
	//  722 1595:pop             
				else
	//* 723 1596:goto            21
				if(character == 38)
	//* 724 1599:aload_0         
	//* 725 1600:getfield        #72  <Field int character>
	//* 726 1603:bipush          38
	//* 727 1605:icmpne          1633
				{
					saveState(state);
	//  728 1608:aload_0         
	//  729 1609:aload_0         
	//  730 1610:getfield        #119 <Field int state>
	//  731 1613:invokespecial   #213 <Method void saveState(int)>
					state = 10;
	//  732 1616:aload_0         
	//  733 1617:bipush          10
	//  734 1619:putfield        #119 <Field int state>
					entity.setLength(0);
	//  735 1622:aload_0         
	//  736 1623:getfield        #89  <Field StringBuffer entity>
	//  737 1626:iconst_0        
	//  738 1627:invokevirtual   #137 <Method void StringBuffer.setLength(int)>
				} else
	//* 739 1630:goto            21
				{
					text.append((char)character);
	//  740 1633:aload_0         
	//  741 1634:getfield        #87  <Field StringBuffer text>
	//  742 1637:aload_0         
	//  743 1638:getfield        #72  <Field int character>
	//  744 1641:int2char        
	//  745 1642:invokevirtual   #217 <Method StringBuffer StringBuffer.append(char)>
	//  746 1645:pop             
				}
				continue; /* Loop/switch isn't completed */
	//  747 1646:goto            21

			case 12: // '\f'
				if(Character.isWhitespace((char)character))
	//* 748 1649:aload_0         
	//* 749 1650:getfield        #72  <Field int character>
	//* 750 1653:int2char        
	//* 751 1654:invokestatic    #223 <Method boolean Character.isWhitespace(char)>
	//* 752 1657:ifeq            1673
				{
					flush();
	//  753 1660:aload_0         
	//  754 1661:invokespecial   #194 <Method void flush()>
					state = 13;
	//  755 1664:aload_0         
	//  756 1665:bipush          13
	//  757 1667:putfield        #119 <Field int state>
				} else
	//* 758 1670:goto            21
				if(character == 61)
	//* 759 1673:aload_0         
	//* 760 1674:getfield        #72  <Field int character>
	//* 761 1677:bipush          61
	//* 762 1679:icmpne          1695
				{
					flush();
	//  763 1682:aload_0         
	//  764 1683:invokespecial   #194 <Method void flush()>
					state = 14;
	//  765 1686:aload_0         
	//  766 1687:bipush          14
	//  767 1689:putfield        #119 <Field int state>
				} else
	//* 768 1692:goto            21
				if(html && character == 62)
	//* 769 1695:aload_0         
	//* 770 1696:getfield        #107 <Field boolean html>
	//* 771 1699:ifeq            1739
	//* 772 1702:aload_0         
	//* 773 1703:getfield        #72  <Field int character>
	//* 774 1706:bipush          62
	//* 775 1708:icmpne          1739
				{
					text.setLength(0);
	//  776 1711:aload_0         
	//  777 1712:getfield        #87  <Field StringBuffer text>
	//  778 1715:iconst_0        
	//  779 1716:invokevirtual   #137 <Method void StringBuffer.setLength(int)>
					processTag(true);
	//  780 1719:aload_0         
	//  781 1720:iconst_1        
	//  782 1721:invokespecial   #235 <Method void processTag(boolean)>
					initTag();
	//  783 1724:aload_0         
	//  784 1725:invokespecial   #226 <Method void initTag()>
					state = restoreState();
	//  785 1728:aload_0         
	//  786 1729:aload_0         
	//  787 1730:invokespecial   #229 <Method int restoreState()>
	//  788 1733:putfield        #119 <Field int state>
				} else
	//* 789 1736:goto            21
				{
					text.append((char)character);
	//  790 1739:aload_0         
	//  791 1740:getfield        #87  <Field StringBuffer text>
	//  792 1743:aload_0         
	//  793 1744:getfield        #72  <Field int character>
	//  794 1747:int2char        
	//  795 1748:invokevirtual   #217 <Method StringBuffer StringBuffer.append(char)>
	//  796 1751:pop             
				}
				continue; /* Loop/switch isn't completed */
	//  797 1752:goto            21

			case 13: // '\r'
				if(character == 61)
	//* 798 1755:aload_0         
	//* 799 1756:getfield        #72  <Field int character>
	//* 800 1759:bipush          61
	//* 801 1761:icmpne          1773
					state = 14;
	//  802 1764:aload_0         
	//  803 1765:bipush          14
	//  804 1767:putfield        #119 <Field int state>
				else
	//* 805 1770:goto            21
				if(!Character.isWhitespace((char)character))
	//* 806 1773:aload_0         
	//* 807 1774:getfield        #72  <Field int character>
	//* 808 1777:int2char        
	//* 809 1778:invokestatic    #223 <Method boolean Character.isWhitespace(char)>
	//* 810 1781:ifne            21
					if(html && character == 62)
	//* 811 1784:aload_0         
	//* 812 1785:getfield        #107 <Field boolean html>
	//* 813 1788:ifeq            1828
	//* 814 1791:aload_0         
	//* 815 1792:getfield        #72  <Field int character>
	//* 816 1795:bipush          62
	//* 817 1797:icmpne          1828
					{
						text.setLength(0);
	//  818 1800:aload_0         
	//  819 1801:getfield        #87  <Field StringBuffer text>
	//  820 1804:iconst_0        
	//  821 1805:invokevirtual   #137 <Method void StringBuffer.setLength(int)>
						processTag(true);
	//  822 1808:aload_0         
	//  823 1809:iconst_1        
	//  824 1810:invokespecial   #235 <Method void processTag(boolean)>
						initTag();
	//  825 1813:aload_0         
	//  826 1814:invokespecial   #226 <Method void initTag()>
						state = restoreState();
	//  827 1817:aload_0         
	//  828 1818:aload_0         
	//  829 1819:invokespecial   #229 <Method int restoreState()>
	//  830 1822:putfield        #119 <Field int state>
					} else
	//* 831 1825:goto            21
					if(html && character == 47)
	//* 832 1828:aload_0         
	//* 833 1829:getfield        #107 <Field boolean html>
	//* 834 1832:ifeq            1857
	//* 835 1835:aload_0         
	//* 836 1836:getfield        #72  <Field int character>
	//* 837 1839:bipush          47
	//* 838 1841:icmpne          1857
					{
						flush();
	//  839 1844:aload_0         
	//  840 1845:invokespecial   #194 <Method void flush()>
						state = 6;
	//  841 1848:aload_0         
	//  842 1849:bipush          6
	//  843 1851:putfield        #119 <Field int state>
					} else
	//* 844 1854:goto            21
					if(html)
	//* 845 1857:aload_0         
	//* 846 1858:getfield        #107 <Field boolean html>
	//* 847 1861:ifeq            1890
					{
						flush();
	//  848 1864:aload_0         
	//  849 1865:invokespecial   #194 <Method void flush()>
						text.append((char)character);
	//  850 1868:aload_0         
	//  851 1869:getfield        #87  <Field StringBuffer text>
	//  852 1872:aload_0         
	//  853 1873:getfield        #72  <Field int character>
	//  854 1876:int2char        
	//  855 1877:invokevirtual   #217 <Method StringBuffer StringBuffer.append(char)>
	//  856 1880:pop             
						state = 12;
	//  857 1881:aload_0         
	//  858 1882:bipush          12
	//  859 1884:putfield        #119 <Field int state>
					} else
	//* 860 1887:goto            21
					{
						throwException(MessageLocalization.getComposedMessage("error.in.attribute.processing", new Object[0]));
	//  861 1890:aload_0         
	//  862 1891:ldc2            #271 <String "error.in.attribute.processing">
	//  863 1894:iconst_0        
	//  864 1895:anewarray       Object[]
	//  865 1898:invokestatic    #207 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  866 1901:invokespecial   #210 <Method void throwException(String)>
					}
				continue; /* Loop/switch isn't completed */
	//  867 1904:goto            21

			case 14: // '\016'
				if(character == 34 || character == 39)
	//* 868 1907:aload_0         
	//* 869 1908:getfield        #72  <Field int character>
	//* 870 1911:bipush          34
	//* 871 1913:icmpeq          1925
	//* 872 1916:aload_0         
	//* 873 1917:getfield        #72  <Field int character>
	//* 874 1920:bipush          39
	//* 875 1922:icmpne          1942
				{
					quoteCharacter = character;
	//  876 1925:aload_0         
	//  877 1926:aload_0         
	//  878 1927:getfield        #72  <Field int character>
	//  879 1930:putfield        #97  <Field int quoteCharacter>
					state = 11;
	//  880 1933:aload_0         
	//  881 1934:bipush          11
	//  882 1936:putfield        #119 <Field int state>
				} else
	//* 883 1939:goto            21
				if(!Character.isWhitespace((char)character))
	//* 884 1942:aload_0         
	//* 885 1943:getfield        #72  <Field int character>
	//* 886 1946:int2char        
	//* 887 1947:invokestatic    #223 <Method boolean Character.isWhitespace(char)>
	//* 888 1950:ifne            21
					if(html && character == 62)
	//* 889 1953:aload_0         
	//* 890 1954:getfield        #107 <Field boolean html>
	//* 891 1957:ifeq            1993
	//* 892 1960:aload_0         
	//* 893 1961:getfield        #72  <Field int character>
	//* 894 1964:bipush          62
	//* 895 1966:icmpne          1993
					{
						flush();
	//  896 1969:aload_0         
	//  897 1970:invokespecial   #194 <Method void flush()>
						processTag(true);
	//  898 1973:aload_0         
	//  899 1974:iconst_1        
	//  900 1975:invokespecial   #235 <Method void processTag(boolean)>
						initTag();
	//  901 1978:aload_0         
	//  902 1979:invokespecial   #226 <Method void initTag()>
						state = restoreState();
	//  903 1982:aload_0         
	//  904 1983:aload_0         
	//  905 1984:invokespecial   #229 <Method int restoreState()>
	//  906 1987:putfield        #119 <Field int state>
					} else
	//* 907 1990:goto            21
					if(html)
	//* 908 1993:aload_0         
	//* 909 1994:getfield        #107 <Field boolean html>
	//* 910 1997:ifeq            2028
					{
						text.append((char)character);
	//  911 2000:aload_0         
	//  912 2001:getfield        #87  <Field StringBuffer text>
	//  913 2004:aload_0         
	//  914 2005:getfield        #72  <Field int character>
	//  915 2008:int2char        
	//  916 2009:invokevirtual   #217 <Method StringBuffer StringBuffer.append(char)>
	//  917 2012:pop             
						quoteCharacter = 32;
	//  918 2013:aload_0         
	//  919 2014:bipush          32
	//  920 2016:putfield        #97  <Field int quoteCharacter>
						state = 11;
	//  921 2019:aload_0         
	//  922 2020:bipush          11
	//  923 2022:putfield        #119 <Field int state>
					} else
	//* 924 2025:goto            21
					{
						throwException(MessageLocalization.getComposedMessage("error.in.attribute.processing", new Object[0]));
	//  925 2028:aload_0         
	//  926 2029:ldc2            #271 <String "error.in.attribute.processing">
	//  927 2032:iconst_0        
	//  928 2033:anewarray       Object[]
	//  929 2036:invokestatic    #207 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//  930 2039:invokespecial   #210 <Method void throwException(String)>
					}
				continue; /* Loop/switch isn't completed */
	//  931 2042:goto            21
			}
		} while(false && true);
	}

	private void initTag()
	{
		tag = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #91  <Field String tag>
		attributes = new HashMap();
	//    3    5:aload_0         
	//    4    6:new             #161 <Class HashMap>
	//    5    9:dup             
	//    6   10:invokespecial   #273 <Method void HashMap()>
	//    7   13:putfield        #93  <Field HashMap attributes>
	//    8   16:return          
	}

	public static void parse(SimpleXMLDocHandler simplexmldochandler, SimpleXMLDocHandlerComment simplexmldochandlercomment, Reader reader, boolean flag)
		throws IOException
	{
		(new SimpleXMLParser(simplexmldochandler, simplexmldochandlercomment, flag)).go(reader);
	//    0    0:new             #2   <Class SimpleXMLParser>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iload_3         
	//    5    7:invokespecial   #277 <Method void SimpleXMLParser(SimpleXMLDocHandler, SimpleXMLDocHandlerComment, boolean)>
	//    6   10:aload_2         
	//    7   11:invokespecial   #279 <Method void go(Reader)>
	//    8   14:return          
	}

	public static void parse(SimpleXMLDocHandler simplexmldochandler, InputStream inputstream)
		throws IOException
	{
		Object obj;
		String s;
		byte abyte0[] = new byte[4];
	//    0    0:iconst_4        
	//    1    1:newarray        byte[]
	//    2    3:astore_3        
		if(inputstream.read(abyte0) != 4)
	//*   3    4:aload_1         
	//*   4    5:aload_3         
	//*   5    6:invokevirtual   #285 <Method int InputStream.read(byte[])>
	//*   6    9:iconst_4        
	//*   7   10:icmpeq          31
			throw new IOException(MessageLocalization.getComposedMessage("insufficient.length", new Object[0]));
	//    8   13:new             #184 <Class IOException>
	//    9   16:dup             
	//   10   17:ldc2            #287 <String "insufficient.length">
	//   11   20:iconst_0        
	//   12   21:anewarray       Object[]
	//   13   24:invokestatic    #207 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   14   27:invokespecial   #289 <Method void IOException(String)>
	//   15   30:athrow          
		s = XMLUtil.getEncodingName(abyte0);
	//   16   31:aload_3         
	//   17   32:invokestatic    #293 <Method String XMLUtil.getEncodingName(byte[])>
	//   18   35:astore          5
		obj = null;
	//   19   37:aconst_null     
	//   20   38:astore_3        
		if(!s.equals("UTF-8")) goto _L2; else goto _L1
	//   21   39:aload           5
	//   22   41:ldc2            #295 <String "UTF-8">
	//   23   44:invokevirtual   #241 <Method boolean String.equals(Object)>
	//   24   47:ifeq            131
_L1:
		obj = ((Object) (new StringBuffer()));
	//   25   50:new             #84  <Class StringBuffer>
	//   26   53:dup             
	//   27   54:invokespecial   #85  <Method void StringBuffer()>
	//   28   57:astore_3        
_L5:
		int i = inputstream.read();
	//   29   58:aload_1         
	//   30   59:invokevirtual   #296 <Method int InputStream.read()>
	//   31   62:istore_2        
		if(i != -1 && i != 62) goto _L4; else goto _L3
	//   32   63:iload_2         
	//   33   64:iconst_m1       
	//   34   65:icmpeq          74
	//   35   68:iload_2         
	//   36   69:bipush          62
	//   37   71:icmpne          121
_L3:
		obj = ((Object) (((StringBuffer) (obj)).toString()));
	//   38   74:aload_3         
	//   39   75:invokevirtual   #128 <Method String StringBuffer.toString()>
	//   40   78:astore_3        
_L7:
		Object obj1 = ((Object) (s));
	//   41   79:aload           5
	//   42   81:astore          4
		if(obj != null)
	//*  43   83:aload_3         
	//*  44   84:ifnull          103
		{
			obj = ((Object) (getDeclaredEncoding(((String) (obj)))));
	//   45   87:aload_3         
	//   46   88:invokestatic    #298 <Method String getDeclaredEncoding(String)>
	//   47   91:astore_3        
			obj1 = ((Object) (s));
	//   48   92:aload           5
	//   49   94:astore          4
			if(obj != null)
	//*  50   96:aload_3         
	//*  51   97:ifnull          103
				obj1 = obj;
	//   52  100:aload_3         
	//   53  101:astore          4
		}
		parse(simplexmldochandler, ((Reader) (new InputStreamReader(inputstream, IanaEncodings.getJavaEncoding(((String) (obj1)))))));
	//   54  103:aload_0         
	//   55  104:new             #300 <Class InputStreamReader>
	//   56  107:dup             
	//   57  108:aload_1         
	//   58  109:aload           4
	//   59  111:invokestatic    #305 <Method String IanaEncodings.getJavaEncoding(String)>
	//   60  114:invokespecial   #308 <Method void InputStreamReader(InputStream, String)>
	//   61  117:invokestatic    #311 <Method void parse(SimpleXMLDocHandler, Reader)>
		return;
	//   62  120:return          
_L4:
		((StringBuffer) (obj)).append((char)i);
	//   63  121:aload_3         
	//   64  122:iload_2         
	//   65  123:int2char        
	//   66  124:invokevirtual   #217 <Method StringBuffer StringBuffer.append(char)>
	//   67  127:pop             
		  goto _L5
	//*  68  128:goto            58
_L2:
		if(!s.equals("CP037")) goto _L7; else goto _L6
	//   69  131:aload           5
	//   70  133:ldc2            #313 <String "CP037">
	//   71  136:invokevirtual   #241 <Method boolean String.equals(Object)>
	//   72  139:ifeq            79
_L6:
		obj = ((Object) (new ByteArrayOutputStream()));
	//   73  142:new             #315 <Class ByteArrayOutputStream>
	//   74  145:dup             
	//   75  146:invokespecial   #316 <Method void ByteArrayOutputStream()>
	//   76  149:astore_3        
_L8:
label0:
		{
			i = inputstream.read();
	//   77  150:aload_1         
	//   78  151:invokevirtual   #296 <Method int InputStream.read()>
	//   79  154:istore_2        
			if(i != -1 && i != 110)
				break label0;
	//   80  155:iload_2         
	//   81  156:iconst_m1       
	//   82  157:icmpeq          166
	//   83  160:iload_2         
	//   84  161:bipush          110
	//   85  163:icmpne          184
			obj = ((Object) (new String(((ByteArrayOutputStream) (obj)).toByteArray(), "CP037")));
	//   86  166:new             #130 <Class String>
	//   87  169:dup             
	//   88  170:aload_3         
	//   89  171:invokevirtual   #320 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   90  174:ldc2            #313 <String "CP037">
	//   91  177:invokespecial   #323 <Method void String(byte[], String)>
	//   92  180:astore_3        
		}
		  goto _L7
	//*  93  181:goto            79
		((ByteArrayOutputStream) (obj)).write(i);
	//   94  184:aload_3         
	//   95  185:iload_2         
	//   96  186:invokevirtual   #326 <Method void ByteArrayOutputStream.write(int)>
		  goto _L8
	//*  97  189:goto            150
	}

	public static void parse(SimpleXMLDocHandler simplexmldochandler, Reader reader)
		throws IOException
	{
		parse(simplexmldochandler, ((SimpleXMLDocHandlerComment) (null)), reader, false);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:iconst_0        
	//    4    4:invokestatic    #328 <Method void parse(SimpleXMLDocHandler, SimpleXMLDocHandlerComment, Reader, boolean)>
	//    5    7:return          
	}

	private void processTag(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            32
		{
			nested = nested + 1;
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #95  <Field int nested>
	//    5    9:iconst_1        
	//    6   10:iadd            
	//    7   11:putfield        #95  <Field int nested>
			doc.startElement(tag, ((java.util.Map) (attributes)));
	//    8   14:aload_0         
	//    9   15:getfield        #103 <Field SimpleXMLDocHandler doc>
	//   10   18:aload_0         
	//   11   19:getfield        #91  <Field String tag>
	//   12   22:aload_0         
	//   13   23:getfield        #93  <Field HashMap attributes>
	//   14   26:invokeinterface #332 <Method void SimpleXMLDocHandler.startElement(String, java.util.Map)>
			return;
	//   15   31:return          
		}
		if(newLineHandler.isNewLineTag(tag))
	//*  16   32:aload_0         
	//*  17   33:getfield        #112 <Field NewLineHandler newLineHandler>
	//*  18   36:aload_0         
	//*  19   37:getfield        #91  <Field String tag>
	//*  20   40:invokeinterface #337 <Method boolean NewLineHandler.isNewLineTag(String)>
	//*  21   45:ifeq            53
			nowhite = false;
	//   22   48:aload_0         
	//   23   49:iconst_0        
	//   24   50:putfield        #82  <Field boolean nowhite>
		nested = nested - 1;
	//   25   53:aload_0         
	//   26   54:aload_0         
	//   27   55:getfield        #95  <Field int nested>
	//   28   58:iconst_1        
	//   29   59:isub            
	//   30   60:putfield        #95  <Field int nested>
		doc.endElement(tag);
	//   31   63:aload_0         
	//   32   64:getfield        #103 <Field SimpleXMLDocHandler doc>
	//   33   67:aload_0         
	//   34   68:getfield        #91  <Field String tag>
	//   35   71:invokeinterface #340 <Method void SimpleXMLDocHandler.endElement(String)>
	//   36   76:return          
	}

	private int restoreState()
	{
		if(!stack.empty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field Stack stack>
	//*   2    4:invokevirtual   #344 <Method boolean Stack.empty()>
	//*   3    7:ifne            24
			return ((Integer)stack.pop()).intValue();
	//    4   10:aload_0         
	//    5   11:getfield        #117 <Field Stack stack>
	//    6   14:invokevirtual   #348 <Method Object Stack.pop()>
	//    7   17:checkcast       #350 <Class Integer>
	//    8   20:invokevirtual   #353 <Method int Integer.intValue()>
	//    9   23:ireturn         
		else
			return 0;
	//   10   24:iconst_0        
	//   11   25:ireturn         
	}

	private void saveState(int i)
	{
		stack.push(((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field Stack stack>
	//    2    4:iload_1         
	//    3    5:invokestatic    #357 <Method Integer Integer.valueOf(int)>
	//    4    8:invokevirtual   #361 <Method Object Stack.push(Object)>
	//    5   11:pop             
	//    6   12:return          
	}

	private void throwException(String s)
		throws IOException
	{
		throw new IOException(MessageLocalization.getComposedMessage("1.near.line.2.column.3", new Object[] {
			s, String.valueOf(lines), String.valueOf(columns)
		}));
	//    0    0:new             #184 <Class IOException>
	//    1    3:dup             
	//    2    4:ldc2            #363 <String "1.near.line.2.column.3">
	//    3    7:iconst_3        
	//    4    8:anewarray       Object[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:aload_1         
	//    8   14:aastore         
	//    9   15:dup             
	//   10   16:iconst_1        
	//   11   17:aload_0         
	//   12   18:getfield        #76  <Field int lines>
	//   13   21:invokestatic    #366 <Method String String.valueOf(int)>
	//   14   24:aastore         
	//   15   25:dup             
	//   16   26:iconst_2        
	//   17   27:aload_0         
	//   18   28:getfield        #78  <Field int columns>
	//   19   31:invokestatic    #366 <Method String String.valueOf(int)>
	//   20   34:aastore         
	//   21   35:invokestatic    #207 <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   22   38:invokespecial   #289 <Method void IOException(String)>
	//   23   41:athrow          
	}

	private static final int ATTRIBUTE_EQUAL = 13;
	private static final int ATTRIBUTE_KEY = 12;
	private static final int ATTRIBUTE_VALUE = 14;
	private static final int CDATA = 7;
	private static final int COMMENT = 8;
	private static final int ENTITY = 10;
	private static final int EXAMIN_TAG = 3;
	private static final int IN_CLOSETAG = 5;
	private static final int PI = 9;
	private static final int QUOTE = 11;
	private static final int SINGLE_TAG = 6;
	private static final int TAG_ENCOUNTERED = 2;
	private static final int TAG_EXAMINED = 4;
	private static final int TEXT = 1;
	private static final int UNKNOWN = 0;
	private String attributekey;
	private HashMap attributes;
	private String attributevalue;
	private int character;
	private int columns;
	private final SimpleXMLDocHandlerComment comment;
	private final SimpleXMLDocHandler doc;
	private final StringBuffer entity = new StringBuffer();
	private boolean eol;
	private final boolean html;
	private int lines;
	private int nested;
	private NewLineHandler newLineHandler;
	private boolean nowhite;
	private int previousCharacter;
	private int quoteCharacter;
	private final Stack stack = new Stack();
	private int state;
	private String tag;
	private final StringBuffer text = new StringBuffer();
}
