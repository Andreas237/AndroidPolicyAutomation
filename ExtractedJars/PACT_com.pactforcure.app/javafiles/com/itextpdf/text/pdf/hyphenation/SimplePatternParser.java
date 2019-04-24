// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.hyphenation;

import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.xml.simpleparser.SimpleXMLDocHandler;
import com.itextpdf.text.xml.simpleparser.SimpleXMLParser;
import java.io.*;
import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf.hyphenation:
//			PatternConsumer, Hyphen

public class SimplePatternParser
	implements SimpleXMLDocHandler, PatternConsumer
{

	public SimplePatternParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		token = new StringBuffer();
	//    2    4:aload_0         
	//    3    5:new             #35  <Class StringBuffer>
	//    4    8:dup             
	//    5    9:invokespecial   #36  <Method void StringBuffer()>
	//    6   12:putfield        #38  <Field StringBuffer token>
		hyphenChar = '-';
	//    7   15:aload_0         
	//    8   16:bipush          45
	//    9   18:putfield        #40  <Field char hyphenChar>
	//   10   21:return          
	}

	protected static String getInterletterValues(String s)
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #35  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void StringBuffer()>
	//    3    7:astore          4
		s = (new StringBuilder()).append(s).append("a").toString();
	//    4    9:new             #45  <Class StringBuilder>
	//    5   12:dup             
	//    6   13:invokespecial   #46  <Method void StringBuilder()>
	//    7   16:aload_0         
	//    8   17:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:ldc1            #52  <String "a">
	//   10   22:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   12   28:astore_0        
		int j = s.length();
	//   13   29:aload_0         
	//   14   30:invokevirtual   #62  <Method int String.length()>
	//   15   33:istore_3        
		int i = 0;
	//   16   34:iconst_0        
	//   17   35:istore_2        
		while(i < j) 
	//*  18   36:iload_2         
	//*  19   37:iload_3         
	//*  20   38:icmpge          83
		{
			char c = s.charAt(i);
	//   21   41:aload_0         
	//   22   42:iload_2         
	//   23   43:invokevirtual   #66  <Method char String.charAt(int)>
	//   24   46:istore_1        
			if(Character.isDigit(c))
	//*  25   47:iload_1         
	//*  26   48:invokestatic    #72  <Method boolean Character.isDigit(char)>
	//*  27   51:ifeq            72
			{
				stringbuffer.append(c);
	//   28   54:aload           4
	//   29   56:iload_1         
	//   30   57:invokevirtual   #75  <Method StringBuffer StringBuffer.append(char)>
	//   31   60:pop             
				i++;
	//   32   61:iload_2         
	//   33   62:iconst_1        
	//   34   63:iadd            
	//   35   64:istore_2        
			} else
	//*  36   65:iload_2         
	//*  37   66:iconst_1        
	//*  38   67:iadd            
	//*  39   68:istore_2        
	//*  40   69:goto            36
			{
				stringbuffer.append('0');
	//   41   72:aload           4
	//   42   74:bipush          48
	//   43   76:invokevirtual   #75  <Method StringBuffer StringBuffer.append(char)>
	//   44   79:pop             
			}
			i++;
		}
	//*  45   80:goto            65
		return stringbuffer.toString();
	//   46   83:aload           4
	//   47   85:invokevirtual   #76  <Method String StringBuffer.toString()>
	//   48   88:areturn         
	}

	protected static String getPattern(String s)
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #35  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void StringBuffer()>
	//    3    7:astore_3        
		int j = s.length();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #62  <Method int String.length()>
	//    6   12:istore_2        
		for(int i = 0; i < j; i++)
	//*   7   13:iconst_0        
	//*   8   14:istore_1        
	//*   9   15:iload_1         
	//*  10   16:iload_2         
	//*  11   17:icmpge          48
			if(!Character.isDigit(s.charAt(i)))
	//*  12   20:aload_0         
	//*  13   21:iload_1         
	//*  14   22:invokevirtual   #66  <Method char String.charAt(int)>
	//*  15   25:invokestatic    #72  <Method boolean Character.isDigit(char)>
	//*  16   28:ifne            41
				stringbuffer.append(s.charAt(i));
	//   17   31:aload_3         
	//   18   32:aload_0         
	//   19   33:iload_1         
	//   20   34:invokevirtual   #66  <Method char String.charAt(int)>
	//   21   37:invokevirtual   #75  <Method StringBuffer StringBuffer.append(char)>
	//   22   40:pop             

	//   23   41:iload_1         
	//   24   42:iconst_1        
	//   25   43:iadd            
	//   26   44:istore_1        
	//*  27   45:goto            15
		return stringbuffer.toString();
	//   28   48:aload_3         
	//   29   49:invokevirtual   #76  <Method String StringBuffer.toString()>
	//   30   52:areturn         
	}

	public void addClass(String s)
	{
		System.out.println((new StringBuilder()).append("class: ").append(s).toString());
	//    0    0:getstatic       #85  <Field PrintStream System.out>
	//    1    3:new             #45  <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #46  <Method void StringBuilder()>
	//    4   10:ldc1            #87  <String "class: ">
	//    5   12:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//    6   15:aload_1         
	//    7   16:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:invokevirtual   #56  <Method String StringBuilder.toString()>
	//    9   22:invokevirtual   #92  <Method void PrintStream.println(String)>
	//   10   25:return          
	}

	public void addException(String s, ArrayList arraylist)
	{
		System.out.println((new StringBuilder()).append("exception: ").append(s).append(" : ").append(arraylist.toString()).toString());
	//    0    0:getstatic       #85  <Field PrintStream System.out>
	//    1    3:new             #45  <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #46  <Method void StringBuilder()>
	//    4   10:ldc1            #96  <String "exception: ">
	//    5   12:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//    6   15:aload_1         
	//    7   16:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #98  <String " : ">
	//    9   21:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_2         
	//   11   25:invokevirtual   #101 <Method String ArrayList.toString()>
	//   12   28:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   13   31:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   14   34:invokevirtual   #92  <Method void PrintStream.println(String)>
	//   15   37:return          
	}

	public void addPattern(String s, String s1)
	{
		System.out.println((new StringBuilder()).append("pattern: ").append(s).append(" : ").append(s1).toString());
	//    0    0:getstatic       #85  <Field PrintStream System.out>
	//    1    3:new             #45  <Class StringBuilder>
	//    2    6:dup             
	//    3    7:invokespecial   #46  <Method void StringBuilder()>
	//    4   10:ldc1            #107 <String "pattern: ">
	//    5   12:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//    6   15:aload_1         
	//    7   16:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #98  <String " : ">
	//    9   21:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_2         
	//   11   25:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   12   28:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   13   31:invokevirtual   #92  <Method void PrintStream.println(String)>
	//   14   34:return          
	}

	public void endDocument()
	{
	//    0    0:return          
	}

	public void endElement(String s)
	{
		if(token.length() <= 0) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field StringBuffer token>
	//    2    4:invokevirtual   #110 <Method int StringBuffer.length()>
	//    3    7:ifle            64
_L1:
		s = token.toString();
	//    4   10:aload_0         
	//    5   11:getfield        #38  <Field StringBuffer token>
	//    6   14:invokevirtual   #76  <Method String StringBuffer.toString()>
	//    7   17:astore_1        
		currElement;
	//    8   18:aload_0         
	//    9   19:getfield        #112 <Field int currElement>
		JVM INSTR tableswitch 1 3: default 48
	//	               1 78
	//	               2 91
	//	               3 142;
	//   10   22:tableswitch     1 3: default 48
	//	               1 78
	//	               2 91
	//	               3 142
		   goto _L3 _L4 _L5 _L6
_L3:
		if(currElement != 4)
	//*  11   48:aload_0         
	//*  12   49:getfield        #112 <Field int currElement>
	//*  13   52:iconst_4        
	//*  14   53:icmpeq          64
			token.setLength(0);
	//   15   56:aload_0         
	//   16   57:getfield        #38  <Field StringBuffer token>
	//   17   60:iconst_0        
	//   18   61:invokevirtual   #116 <Method void StringBuffer.setLength(int)>
_L2:
		if(currElement == 4)
	//*  19   64:aload_0         
	//*  20   65:getfield        #112 <Field int currElement>
	//*  21   68:iconst_4        
	//*  22   69:icmpne          162
		{
			currElement = 2;
	//   23   72:aload_0         
	//   24   73:iconst_2        
	//   25   74:putfield        #112 <Field int currElement>
			return;
	//   26   77:return          
		} else
	//*  27   78:aload_0         
	//*  28   79:getfield        #118 <Field PatternConsumer consumer>
	//*  29   82:aload_1         
	//*  30   83:invokeinterface #120 <Method void PatternConsumer.addClass(String)>
	//*  31   88:goto            48
	//*  32   91:aload_0         
	//*  33   92:getfield        #122 <Field ArrayList exception>
	//*  34   95:aload_1         
	//*  35   96:invokevirtual   #126 <Method boolean ArrayList.add(Object)>
	//*  36   99:pop             
	//*  37  100:aload_0         
	//*  38  101:aload_0         
	//*  39  102:aload_0         
	//*  40  103:getfield        #122 <Field ArrayList exception>
	//*  41  106:invokevirtual   #130 <Method ArrayList normalizeException(ArrayList)>
	//*  42  109:putfield        #122 <Field ArrayList exception>
	//*  43  112:aload_0         
	//*  44  113:getfield        #118 <Field PatternConsumer consumer>
	//*  45  116:aload_0         
	//*  46  117:aload_0         
	//*  47  118:getfield        #122 <Field ArrayList exception>
	//*  48  121:invokevirtual   #134 <Method String getExceptionWord(ArrayList)>
	//*  49  124:aload_0         
	//*  50  125:getfield        #122 <Field ArrayList exception>
	//*  51  128:invokevirtual   #138 <Method Object ArrayList.clone()>
	//*  52  131:checkcast       #100 <Class ArrayList>
	//*  53  134:invokeinterface #140 <Method void PatternConsumer.addException(String, ArrayList)>
	//*  54  139:goto            48
	//*  55  142:aload_0         
	//*  56  143:getfield        #118 <Field PatternConsumer consumer>
	//*  57  146:aload_1         
	//*  58  147:invokestatic    #142 <Method String getPattern(String)>
	//*  59  150:aload_1         
	//*  60  151:invokestatic    #144 <Method String getInterletterValues(String)>
	//*  61  154:invokeinterface #146 <Method void PatternConsumer.addPattern(String, String)>
	//*  62  159:goto            48
		{
			currElement = 0;
	//   63  162:aload_0         
	//   64  163:iconst_0        
	//   65  164:putfield        #112 <Field int currElement>
			return;
	//   66  167:return          
		}
_L4:
		consumer.addClass(s);
		continue; /* Loop/switch isn't completed */
_L5:
		exception.add(((Object) (s)));
		exception = normalizeException(exception);
		consumer.addException(getExceptionWord(exception), (ArrayList)exception.clone());
		continue; /* Loop/switch isn't completed */
_L6:
		consumer.addPattern(getPattern(s), getInterletterValues(s));
		if(true) goto _L3; else goto _L7
_L7:
	}

	protected String getExceptionWord(ArrayList arraylist)
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #35  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void StringBuffer()>
	//    3    7:astore_3        
		int i = 0;
	//    4    8:iconst_0        
	//    5    9:istore_2        
		while(i < arraylist.size()) 
	//*   6   10:iload_2         
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #149 <Method int ArrayList.size()>
	//*   9   15:icmpge          77
		{
			Object obj = arraylist.get(i);
	//   10   18:aload_1         
	//   11   19:iload_2         
	//   12   20:invokevirtual   #153 <Method Object ArrayList.get(int)>
	//   13   23:astore          4
			if(obj instanceof String)
	//*  14   25:aload           4
	//*  15   27:instanceof      #58  <Class String>
	//*  16   30:ifeq            50
				stringbuffer.append((String)obj);
	//   17   33:aload_3         
	//   18   34:aload           4
	//   19   36:checkcast       #58  <Class String>
	//   20   39:invokevirtual   #156 <Method StringBuffer StringBuffer.append(String)>
	//   21   42:pop             
			else
	//*  22   43:iload_2         
	//*  23   44:iconst_1        
	//*  24   45:iadd            
	//*  25   46:istore_2        
	//*  26   47:goto            10
			if(((Hyphen)obj).noBreak != null)
	//*  27   50:aload           4
	//*  28   52:checkcast       #158 <Class Hyphen>
	//*  29   55:getfield        #162 <Field String Hyphen.noBreak>
	//*  30   58:ifnull          43
				stringbuffer.append(((Hyphen)obj).noBreak);
	//   31   61:aload_3         
	//   32   62:aload           4
	//   33   64:checkcast       #158 <Class Hyphen>
	//   34   67:getfield        #162 <Field String Hyphen.noBreak>
	//   35   70:invokevirtual   #156 <Method StringBuffer StringBuffer.append(String)>
	//   36   73:pop             
			i++;
		}
	//*  37   74:goto            43
		return stringbuffer.toString();
	//   38   77:aload_3         
	//   39   78:invokevirtual   #76  <Method String StringBuffer.toString()>
	//   40   81:areturn         
	}

	protected ArrayList normalizeException(ArrayList arraylist)
	{
		ArrayList arraylist1 = new ArrayList();
	//    0    0:new             #100 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #164 <Method void ArrayList()>
	//    3    7:astore          5
		int i = 0;
	//    4    9:iconst_0        
	//    5   10:istore_3        
		while(i < arraylist.size()) 
	//*   6   11:iload_3         
	//*   7   12:aload_1         
	//*   8   13:invokevirtual   #149 <Method int ArrayList.size()>
	//*   9   16:icmpge          184
		{
			Object obj = arraylist.get(i);
	//   10   19:aload_1         
	//   11   20:iload_3         
	//   12   21:invokevirtual   #153 <Method Object ArrayList.get(int)>
	//   13   24:astore          6
			if(obj instanceof String)
	//*  14   26:aload           6
	//*  15   28:instanceof      #58  <Class String>
	//*  16   31:ifeq            173
			{
				obj = ((Object) ((String)obj));
	//   17   34:aload           6
	//   18   36:checkcast       #58  <Class String>
	//   19   39:astore          6
				StringBuffer stringbuffer = new StringBuffer();
	//   20   41:new             #35  <Class StringBuffer>
	//   21   44:dup             
	//   22   45:invokespecial   #36  <Method void StringBuffer()>
	//   23   48:astore          7
				int j = 0;
	//   24   50:iconst_0        
	//   25   51:istore          4
				while(j < ((String) (obj)).length()) 
	//*  26   53:iload           4
	//*  27   55:aload           6
	//*  28   57:invokevirtual   #62  <Method int String.length()>
	//*  29   60:icmpge          147
				{
					char c = ((String) (obj)).charAt(j);
	//   30   63:aload           6
	//   31   65:iload           4
	//   32   67:invokevirtual   #66  <Method char String.charAt(int)>
	//   33   70:istore_2        
					if(c != hyphenChar)
	//*  34   71:iload_2         
	//*  35   72:aload_0         
	//*  36   73:getfield        #40  <Field char hyphenChar>
	//*  37   76:icmpeq          95
					{
						stringbuffer.append(c);
	//   38   79:aload           7
	//   39   81:iload_2         
	//   40   82:invokevirtual   #75  <Method StringBuffer StringBuffer.append(char)>
	//   41   85:pop             
					} else
	//*  42   86:iload           4
	//*  43   88:iconst_1        
	//*  44   89:iadd            
	//*  45   90:istore          4
	//*  46   92:goto            53
					{
						arraylist1.add(((Object) (stringbuffer.toString())));
	//   47   95:aload           5
	//   48   97:aload           7
	//   49   99:invokevirtual   #76  <Method String StringBuffer.toString()>
	//   50  102:invokevirtual   #126 <Method boolean ArrayList.add(Object)>
	//   51  105:pop             
						stringbuffer.setLength(0);
	//   52  106:aload           7
	//   53  108:iconst_0        
	//   54  109:invokevirtual   #116 <Method void StringBuffer.setLength(int)>
						arraylist1.add(((Object) (new Hyphen(new String(new char[] {
							hyphenChar
						}), ((String) (null)), ((String) (null))))));
	//   55  112:aload           5
	//   56  114:new             #158 <Class Hyphen>
	//   57  117:dup             
	//   58  118:new             #58  <Class String>
	//   59  121:dup             
	//   60  122:iconst_1        
	//   61  123:newarray        char[]
	//   62  125:dup             
	//   63  126:iconst_0        
	//   64  127:aload_0         
	//   65  128:getfield        #40  <Field char hyphenChar>
	//   66  131:castore         
	//   67  132:invokespecial   #167 <Method void String(char[])>
	//   68  135:aconst_null     
	//   69  136:aconst_null     
	//   70  137:invokespecial   #170 <Method void Hyphen(String, String, String)>
	//   71  140:invokevirtual   #126 <Method boolean ArrayList.add(Object)>
	//   72  143:pop             
					}
					j++;
				}
	//*  73  144:goto            86
				if(stringbuffer.length() > 0)
	//*  74  147:aload           7
	//*  75  149:invokevirtual   #110 <Method int StringBuffer.length()>
	//*  76  152:ifle            166
					arraylist1.add(((Object) (stringbuffer.toString())));
	//   77  155:aload           5
	//   78  157:aload           7
	//   79  159:invokevirtual   #76  <Method String StringBuffer.toString()>
	//   80  162:invokevirtual   #126 <Method boolean ArrayList.add(Object)>
	//   81  165:pop             
			} else
	//*  82  166:iload_3         
	//*  83  167:iconst_1        
	//*  84  168:iadd            
	//*  85  169:istore_3        
	//*  86  170:goto            11
			{
				arraylist1.add(obj);
	//   87  173:aload           5
	//   88  175:aload           6
	//   89  177:invokevirtual   #126 <Method boolean ArrayList.add(Object)>
	//   90  180:pop             
			}
			i++;
		}
	//*  91  181:goto            166
		return arraylist1;
	//   92  184:aload           5
	//   93  186:areturn         
	}

	public void parse(InputStream inputstream, PatternConsumer patternconsumer)
	{
		consumer = patternconsumer;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #118 <Field PatternConsumer consumer>
		SimpleXMLParser.parse(((SimpleXMLDocHandler) (this)), inputstream);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokestatic    #182 <Method void SimpleXMLParser.parse(SimpleXMLDocHandler, InputStream)>
		try
		{
			inputstream.close();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #187 <Method void InputStream.close()>
			return;
	//    8   14:return          
		}
	//*   9   15:astore_2        
	//*  10   16:new             #189 <Class ExceptionConverter>
	//*  11   19:dup             
	//*  12   20:aload_2         
	//*  13   21:invokespecial   #192 <Method void ExceptionConverter(Exception)>
	//*  14   24:athrow          
	//*  15   25:astore_2        
	//*  16   26:aload_1         
	//*  17   27:invokevirtual   #187 <Method void InputStream.close()>
	//*  18   30:aload_2         
	//*  19   31:athrow          
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//*  20   32:astore_1        
		{
			return;
	//   21   33:return          
		}
		patternconsumer;
		throw new ExceptionConverter(((Exception) (patternconsumer)));
		patternconsumer;
		try
		{
			inputstream.close();
		}
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream) { }
	//   22   34:astore_1        
		throw patternconsumer;
	//*  23   35:goto            30
	}

	public void startDocument()
	{
	//    0    0:return          
	}

	public void startElement(String s, Map map)
	{
		if(!s.equals("hyphen-char")) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ldc1            #197 <String "hyphen-char">
	//    2    3:invokevirtual   #200 <Method boolean String.equals(Object)>
	//    3    6:ifeq            51
_L1:
		s = (String)map.get("value");
	//    4    9:aload_2         
	//    5   10:ldc1            #202 <String "value">
	//    6   12:invokeinterface #207 <Method Object Map.get(Object)>
	//    7   17:checkcast       #58  <Class String>
	//    8   20:astore_1        
		if(s != null && s.length() == 1)
	//*   9   21:aload_1         
	//*  10   22:ifnull          42
	//*  11   25:aload_1         
	//*  12   26:invokevirtual   #62  <Method int String.length()>
	//*  13   29:iconst_1        
	//*  14   30:icmpne          42
			hyphenChar = s.charAt(0);
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:iconst_0        
	//   18   36:invokevirtual   #66  <Method char String.charAt(int)>
	//   19   39:putfield        #40  <Field char hyphenChar>
_L4:
		token.setLength(0);
	//   20   42:aload_0         
	//   21   43:getfield        #38  <Field StringBuffer token>
	//   22   46:iconst_0        
	//   23   47:invokevirtual   #116 <Method void StringBuffer.setLength(int)>
		return;
	//   24   50:return          
_L2:
		if(s.equals("classes"))
	//*  25   51:aload_1         
	//*  26   52:ldc1            #209 <String "classes">
	//*  27   54:invokevirtual   #200 <Method boolean String.equals(Object)>
	//*  28   57:ifeq            68
			currElement = 1;
	//   29   60:aload_0         
	//   30   61:iconst_1        
	//   31   62:putfield        #112 <Field int currElement>
		else
	//*  32   65:goto            42
		if(s.equals("patterns"))
	//*  33   68:aload_1         
	//*  34   69:ldc1            #211 <String "patterns">
	//*  35   71:invokevirtual   #200 <Method boolean String.equals(Object)>
	//*  36   74:ifeq            85
			currElement = 3;
	//   37   77:aload_0         
	//   38   78:iconst_3        
	//   39   79:putfield        #112 <Field int currElement>
		else
	//*  40   82:goto            42
		if(s.equals("exceptions"))
	//*  41   85:aload_1         
	//*  42   86:ldc1            #213 <String "exceptions">
	//*  43   88:invokevirtual   #200 <Method boolean String.equals(Object)>
	//*  44   91:ifeq            113
		{
			currElement = 2;
	//   45   94:aload_0         
	//   46   95:iconst_2        
	//   47   96:putfield        #112 <Field int currElement>
			exception = new ArrayList();
	//   48   99:aload_0         
	//   49  100:new             #100 <Class ArrayList>
	//   50  103:dup             
	//   51  104:invokespecial   #164 <Method void ArrayList()>
	//   52  107:putfield        #122 <Field ArrayList exception>
		} else
	//*  53  110:goto            42
		if(s.equals("hyphen"))
	//*  54  113:aload_1         
	//*  55  114:ldc1            #215 <String "hyphen">
	//*  56  116:invokevirtual   #200 <Method boolean String.equals(Object)>
	//*  57  119:ifeq            42
		{
			if(token.length() > 0)
	//*  58  122:aload_0         
	//*  59  123:getfield        #38  <Field StringBuffer token>
	//*  60  126:invokevirtual   #110 <Method int StringBuffer.length()>
	//*  61  129:ifle            147
				exception.add(((Object) (token.toString())));
	//   62  132:aload_0         
	//   63  133:getfield        #122 <Field ArrayList exception>
	//   64  136:aload_0         
	//   65  137:getfield        #38  <Field StringBuffer token>
	//   66  140:invokevirtual   #76  <Method String StringBuffer.toString()>
	//   67  143:invokevirtual   #126 <Method boolean ArrayList.add(Object)>
	//   68  146:pop             
			exception.add(((Object) (new Hyphen((String)map.get("pre"), (String)map.get("no"), (String)map.get("post")))));
	//   69  147:aload_0         
	//   70  148:getfield        #122 <Field ArrayList exception>
	//   71  151:new             #158 <Class Hyphen>
	//   72  154:dup             
	//   73  155:aload_2         
	//   74  156:ldc1            #217 <String "pre">
	//   75  158:invokeinterface #207 <Method Object Map.get(Object)>
	//   76  163:checkcast       #58  <Class String>
	//   77  166:aload_2         
	//   78  167:ldc1            #219 <String "no">
	//   79  169:invokeinterface #207 <Method Object Map.get(Object)>
	//   80  174:checkcast       #58  <Class String>
	//   81  177:aload_2         
	//   82  178:ldc1            #221 <String "post">
	//   83  180:invokeinterface #207 <Method Object Map.get(Object)>
	//   84  185:checkcast       #58  <Class String>
	//   85  188:invokespecial   #170 <Method void Hyphen(String, String, String)>
	//   86  191:invokevirtual   #126 <Method boolean ArrayList.add(Object)>
	//   87  194:pop             
			currElement = 4;
	//   88  195:aload_0         
	//   89  196:iconst_4        
	//   90  197:putfield        #112 <Field int currElement>
		}
		if(true) goto _L4; else goto _L3
	//   91  200:goto            42
_L3:
	}

	public void text(String s)
	{
		s = ((String) (new StringTokenizer(s)));
	//    0    0:new             #225 <Class StringTokenizer>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #227 <Method void StringTokenizer(String)>
	//    4    8:astore_1        
		do
		{
			if(!((StringTokenizer) (s)).hasMoreTokens())
				break;
	//    5    9:aload_1         
	//    6   10:invokevirtual   #231 <Method boolean StringTokenizer.hasMoreTokens()>
	//    7   13:ifeq            146
			String s1 = ((StringTokenizer) (s)).nextToken();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #234 <Method String StringTokenizer.nextToken()>
	//   10   20:astore_2        
			switch(currElement)
	//*  11   21:aload_0         
	//*  12   22:getfield        #112 <Field int currElement>
			{
	//*  13   25:tableswitch     1 3: default 52
	//	               1 55
	//	               2 68
	//	               3 126
	//*  14   52:goto            9
			case 1: // '\001'
				consumer.addClass(s1);
	//   15   55:aload_0         
	//   16   56:getfield        #118 <Field PatternConsumer consumer>
	//   17   59:aload_2         
	//   18   60:invokeinterface #120 <Method void PatternConsumer.addClass(String)>
				break;

	//*  19   65:goto            9
			case 2: // '\002'
				exception.add(((Object) (s1)));
	//   20   68:aload_0         
	//   21   69:getfield        #122 <Field ArrayList exception>
	//   22   72:aload_2         
	//   23   73:invokevirtual   #126 <Method boolean ArrayList.add(Object)>
	//   24   76:pop             
				exception = normalizeException(exception);
	//   25   77:aload_0         
	//   26   78:aload_0         
	//   27   79:aload_0         
	//   28   80:getfield        #122 <Field ArrayList exception>
	//   29   83:invokevirtual   #130 <Method ArrayList normalizeException(ArrayList)>
	//   30   86:putfield        #122 <Field ArrayList exception>
				consumer.addException(getExceptionWord(exception), (ArrayList)exception.clone());
	//   31   89:aload_0         
	//   32   90:getfield        #118 <Field PatternConsumer consumer>
	//   33   93:aload_0         
	//   34   94:aload_0         
	//   35   95:getfield        #122 <Field ArrayList exception>
	//   36   98:invokevirtual   #134 <Method String getExceptionWord(ArrayList)>
	//   37  101:aload_0         
	//   38  102:getfield        #122 <Field ArrayList exception>
	//   39  105:invokevirtual   #138 <Method Object ArrayList.clone()>
	//   40  108:checkcast       #100 <Class ArrayList>
	//   41  111:invokeinterface #140 <Method void PatternConsumer.addException(String, ArrayList)>
				exception.clear();
	//   42  116:aload_0         
	//   43  117:getfield        #122 <Field ArrayList exception>
	//   44  120:invokevirtual   #237 <Method void ArrayList.clear()>
				break;

	//*  45  123:goto            9
			case 3: // '\003'
				consumer.addPattern(getPattern(s1), getInterletterValues(s1));
	//   46  126:aload_0         
	//   47  127:getfield        #118 <Field PatternConsumer consumer>
	//   48  130:aload_2         
	//   49  131:invokestatic    #142 <Method String getPattern(String)>
	//   50  134:aload_2         
	//   51  135:invokestatic    #144 <Method String getInterletterValues(String)>
	//   52  138:invokeinterface #146 <Method void PatternConsumer.addPattern(String, String)>
				break;
			}
		} while(true);
	//*  53  143:goto            9
	//   54  146:return          
	}

	static final int ELEM_CLASSES = 1;
	static final int ELEM_EXCEPTIONS = 2;
	static final int ELEM_HYPHEN = 4;
	static final int ELEM_PATTERNS = 3;
	PatternConsumer consumer;
	int currElement;
	ArrayList exception;
	char hyphenChar;
	SimpleXMLParser parser;
	StringBuffer token;
}
