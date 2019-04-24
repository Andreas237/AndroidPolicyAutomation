// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.html;

import com.itextpdf.text.BaseColor;
import java.util.*;

// Referenced classes of package com.itextpdf.text.html:
//			WebColors

public class HtmlUtilities
{

	public HtmlUtilities()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Object()>
	//    2    4:return          
	}

	public static int alignmentValue(String s)
	{
		if(s != null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
	//*   2    4:iconst_m1       
	//*   3    5:ireturn         
		{
			if("center".equalsIgnoreCase(s))
	//*   4    6:ldc1            #60  <String "center">
	//*   5    8:aload_0         
	//*   6    9:invokevirtual   #66  <Method boolean String.equalsIgnoreCase(String)>
	//*   7   12:ifeq            17
				return 1;
	//    8   15:iconst_1        
	//    9   16:ireturn         
			if("left".equalsIgnoreCase(s))
	//*  10   17:ldc1            #68  <String "left">
	//*  11   19:aload_0         
	//*  12   20:invokevirtual   #66  <Method boolean String.equalsIgnoreCase(String)>
	//*  13   23:ifeq            28
				return 0;
	//   14   26:iconst_0        
	//   15   27:ireturn         
			if("right".equalsIgnoreCase(s))
	//*  16   28:ldc1            #70  <String "right">
	//*  17   30:aload_0         
	//*  18   31:invokevirtual   #66  <Method boolean String.equalsIgnoreCase(String)>
	//*  19   34:ifeq            39
				return 2;
	//   20   37:iconst_2        
	//   21   38:ireturn         
			if("justify".equalsIgnoreCase(s))
	//*  22   39:ldc1            #72  <String "justify">
	//*  23   41:aload_0         
	//*  24   42:invokevirtual   #66  <Method boolean String.equalsIgnoreCase(String)>
	//*  25   45:ifeq            50
				return 3;
	//   26   48:iconst_3        
	//   27   49:ireturn         
			if("JustifyAll".equalsIgnoreCase(s))
	//*  28   50:ldc1            #74  <String "JustifyAll">
	//*  29   52:aload_0         
	//*  30   53:invokevirtual   #66  <Method boolean String.equalsIgnoreCase(String)>
	//*  31   56:ifeq            62
				return 8;
	//   32   59:bipush          8
	//   33   61:ireturn         
			if("top".equalsIgnoreCase(s))
	//*  34   62:ldc1            #76  <String "top">
	//*  35   64:aload_0         
	//*  36   65:invokevirtual   #66  <Method boolean String.equalsIgnoreCase(String)>
	//*  37   68:ifeq            73
				return 4;
	//   38   71:iconst_4        
	//   39   72:ireturn         
			if("middle".equalsIgnoreCase(s))
	//*  40   73:ldc1            #78  <String "middle">
	//*  41   75:aload_0         
	//*  42   76:invokevirtual   #66  <Method boolean String.equalsIgnoreCase(String)>
	//*  43   79:ifeq            84
				return 5;
	//   44   82:iconst_5        
	//   45   83:ireturn         
			if("bottom".equalsIgnoreCase(s))
	//*  46   84:ldc1            #80  <String "bottom">
	//*  47   86:aload_0         
	//*  48   87:invokevirtual   #66  <Method boolean String.equalsIgnoreCase(String)>
	//*  49   90:ifeq            96
				return 6;
	//   50   93:bipush          6
	//   51   95:ireturn         
			if("baseline".equalsIgnoreCase(s))
	//*  52   96:ldc1            #82  <String "baseline">
	//*  53   98:aload_0         
	//*  54   99:invokevirtual   #66  <Method boolean String.equalsIgnoreCase(String)>
	//*  55  102:ifeq            4
				return 7;
	//   56  105:bipush          7
	//   57  107:ireturn         
		}
		return -1;
	}

	public static BaseColor decodeColor(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		s = s.toLowerCase().trim();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #90  <Method String String.toLowerCase()>
	//    6   10:invokevirtual   #93  <Method String String.trim()>
	//    7   13:astore_0        
		try
		{
			s = ((String) (WebColors.getRGBColor(s)));
	//    8   14:aload_0         
	//    9   15:invokestatic    #98  <Method BaseColor WebColors.getRGBColor(String)>
	//   10   18:astore_0        
		}
	//*  11   19:aload_0         
	//*  12   20:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  13   21:astore_0        
		{
			return null;
	//   14   22:aconst_null     
	//   15   23:areturn         
		}
		return ((BaseColor) (s));
	}

	public static String eliminateWhiteSpace(String s)
	{
		int i;
		boolean flag1;
		int j;
		StringBuffer stringbuffer;
		stringbuffer = new StringBuffer();
	//    0    0:new             #102 <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #103 <Method void StringBuffer()>
	//    3    7:astore          6
		j = s.length();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #107 <Method int String.length()>
	//    6   13:istore          5
		flag1 = false;
	//    7   15:iconst_0        
	//    8   16:istore          4
		i = 0;
	//    9   18:iconst_0        
	//   10   19:istore_3        
_L2:
		char c;
		boolean flag;
		if(i >= j)
			break MISSING_BLOCK_LABEL_140;
	//   11   20:iload_3         
	//   12   21:iload           5
	//   13   23:icmpge          140
		c = s.charAt(i);
	//   14   26:aload_0         
	//   15   27:iload_3         
	//   16   28:invokevirtual   #111 <Method char String.charAt(int)>
	//   17   31:istore_1        
		flag = flag1;
	//   18   32:iload           4
	//   19   34:istore_2        
		switch(c)
	//*  20   35:iload_1         
		{
	//*  21   36:lookupswitch    4: default 80
	//	               9: 89
	//	               10: 120
	//	               13: 89
	//	               32: 99
		default:
			flag = false;
	//   22   80:iconst_0        
	//   23   81:istore_2        
			stringbuffer.append(c);
	//   24   82:aload           6
	//   25   84:iload_1         
	//   26   85:invokevirtual   #115 <Method StringBuffer StringBuffer.append(char)>
	//   27   88:pop             
			break;

		case 9: // '\t'
		case 13: // '\r'
			break;

		case 10: // '\n'
			break MISSING_BLOCK_LABEL_120;

		case 32: // ' '
			break; /* Loop/switch isn't completed */
		}
_L3:
		i++;
	//   28   89:iload_3         
	//   29   90:iconst_1        
	//   30   91:iadd            
	//   31   92:istore_3        
		flag1 = flag;
	//   32   93:iload_2         
	//   33   94:istore          4
		if(true) goto _L2; else goto _L1
	//   34   96:goto            20
_L1:
		flag = flag1;
	//   35   99:iload           4
	//   36  101:istore_2        
		if(!flag1)
	//*  37  102:iload           4
	//*  38  104:ifne            89
		{
			stringbuffer.append(c);
	//   39  107:aload           6
	//   40  109:iload_1         
	//   41  110:invokevirtual   #115 <Method StringBuffer StringBuffer.append(char)>
	//   42  113:pop             
			flag = flag1;
	//   43  114:iload           4
	//   44  116:istore_2        
		}
		  goto _L3
	//*  45  117:goto            89
		flag = flag1;
	//   46  120:iload           4
	//   47  122:istore_2        
		if(i > 0)
	//*  48  123:iload_3         
	//*  49  124:ifle            89
		{
			flag = true;
	//   50  127:iconst_1        
	//   51  128:istore_2        
			stringbuffer.append(' ');
	//   52  129:aload           6
	//   53  131:bipush          32
	//   54  133:invokevirtual   #115 <Method StringBuffer StringBuffer.append(char)>
	//   55  136:pop             
		}
		  goto _L3
	//*  56  137:goto            89
		return stringbuffer.toString();
	//   57  140:aload           6
	//   58  142:invokevirtual   #118 <Method String StringBuffer.toString()>
	//   59  145:areturn         
	}

	public static int getIndexedFontSize(String s, String s1)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(!s.startsWith("+") && !s.startsWith("-")) goto _L2; else goto _L1
	//    2    3:aload_0         
	//    3    4:ldc1            #124 <String "+">
	//    4    6:invokevirtual   #127 <Method boolean String.startsWith(String)>
	//    5    9:ifne            21
	//    6   12:aload_0         
	//    7   13:ldc1            #129 <String "-">
	//    8   15:invokevirtual   #127 <Method boolean String.startsWith(String)>
	//    9   18:ifeq            109
_L1:
		int i;
		int l;
		String s2 = s1;
	//   10   21:aload_1         
	//   11   22:astore          6
		if(s1 == null)
	//*  12   24:aload_1         
	//*  13   25:ifnonnull       32
			s2 = "12";
	//   14   28:ldc1            #131 <String "12">
	//   15   30:astore          6
		l = (int)Float.parseFloat(s2);
	//   16   32:aload           6
	//   17   34:invokestatic    #135 <Method float Float.parseFloat(String)>
	//   18   37:f2i             
	//   19   38:istore          5
		i = FONTSIZES.length - 1;
	//   20   40:getstatic       #54  <Field int[] FONTSIZES>
	//   21   43:arraylength     
	//   22   44:iconst_1        
	//   23   45:isub            
	//   24   46:istore_2        
_L7:
		int j = ((int) (flag));
	//   25   47:iload           4
	//   26   49:istore_3        
		if(i < 0) goto _L4; else goto _L3
	//   27   50:iload_2         
	//   28   51:iflt            66
_L3:
		if(l < FONTSIZES[i]) goto _L6; else goto _L5
	//   29   54:iload           5
	//   30   56:getstatic       #54  <Field int[] FONTSIZES>
	//   31   59:iload_2         
	//   32   60:iaload          
	//   33   61:icmplt          102
_L5:
		j = i;
	//   34   64:iload_2         
	//   35   65:istore_3        
_L4:
		s1 = s;
	//   36   66:aload_0         
	//   37   67:astore_1        
		if(s.startsWith("+"))
	//*  38   68:aload_0         
	//*  39   69:ldc1            #124 <String "+">
	//*  40   71:invokevirtual   #127 <Method boolean String.startsWith(String)>
	//*  41   74:ifeq            83
			s1 = s.substring(1);
	//   42   77:aload_0         
	//   43   78:iconst_1        
	//   44   79:invokevirtual   #139 <Method String String.substring(int)>
	//   45   82:astore_1        
		i = j + Integer.parseInt(s1);
	//   46   83:iload_3         
	//   47   84:aload_1         
	//   48   85:invokestatic    #144 <Method int Integer.parseInt(String)>
	//   49   88:iadd            
	//   50   89:istore_2        
_L8:
		int k;
		if(i < 0)
	//*  51   90:iload_2         
	//*  52   91:ifge            127
		{
			k = 0;
	//   53   94:iconst_0        
	//   54   95:istore_3        
		} else
	//*  55   96:getstatic       #54  <Field int[] FONTSIZES>
	//*  56   99:iload_3         
	//*  57  100:iaload          
	//*  58  101:ireturn         
	//*  59  102:iload_2         
	//*  60  103:iconst_1        
	//*  61  104:isub            
	//*  62  105:istore_2        
	//*  63  106:goto            47
	//*  64  109:aload_0         
	//*  65  110:invokestatic    #144 <Method int Integer.parseInt(String)>
	//*  66  113:istore_2        
	//*  67  114:iload_2         
	//*  68  115:iconst_1        
	//*  69  116:isub            
	//*  70  117:istore_2        
	//*  71  118:goto            90
	//*  72  121:astore_0        
	//*  73  122:iconst_0        
	//*  74  123:istore_2        
	//*  75  124:goto            90
		{
			k = i;
	//   76  127:iload_2         
	//   77  128:istore_3        
			if(i >= FONTSIZES.length)
	//*  78  129:iload_2         
	//*  79  130:getstatic       #54  <Field int[] FONTSIZES>
	//*  80  133:arraylength     
	//*  81  134:icmplt          96
				k = FONTSIZES.length - 1;
	//   82  137:getstatic       #54  <Field int[] FONTSIZES>
	//   83  140:arraylength     
	//   84  141:iconst_1        
	//   85  142:isub            
	//   86  143:istore_3        
		}
		return FONTSIZES[k];
_L6:
		i--;
		  goto _L7
_L2:
		i = Integer.parseInt(s);
		i--;
		  goto _L8
		s;
		i = 0;
		  goto _L8
	//*  87  144:goto            96
	}

	public static Properties parseAttributes(String s)
	{
		Properties properties = new Properties();
	//    0    0:new             #148 <Class Properties>
	//    1    3:dup             
	//    2    4:invokespecial   #149 <Method void Properties()>
	//    3    7:astore_2        
		if(s != null)
	//*   4    8:aload_0         
	//*   5    9:ifnonnull       14
	//*   6   12:aload_2         
	//*   7   13:areturn         
		{
			StringTokenizer stringtokenizer = new StringTokenizer(s, ";");
	//    8   14:new             #151 <Class StringTokenizer>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:ldc1            #153 <String ";">
	//   12   21:invokespecial   #156 <Method void StringTokenizer(String, String)>
	//   13   24:astore_3        
			while(stringtokenizer.hasMoreTokens()) 
	//*  14   25:aload_3         
	//*  15   26:invokevirtual   #160 <Method boolean StringTokenizer.hasMoreTokens()>
	//*  16   29:ifeq            12
			{
				s = ((String) (new StringTokenizer(stringtokenizer.nextToken(), ":")));
	//   17   32:new             #151 <Class StringTokenizer>
	//   18   35:dup             
	//   19   36:aload_3         
	//   20   37:invokevirtual   #163 <Method String StringTokenizer.nextToken()>
	//   21   40:ldc1            #165 <String ":">
	//   22   42:invokespecial   #156 <Method void StringTokenizer(String, String)>
	//   23   45:astore_0        
				if(((StringTokenizer) (s)).hasMoreTokens())
	//*  24   46:aload_0         
	//*  25   47:invokevirtual   #160 <Method boolean StringTokenizer.hasMoreTokens()>
	//*  26   50:ifeq            25
				{
					String s2 = ((StringTokenizer) (s)).nextToken().trim();
	//   27   53:aload_0         
	//   28   54:invokevirtual   #163 <Method String StringTokenizer.nextToken()>
	//   29   57:invokevirtual   #93  <Method String String.trim()>
	//   30   60:astore          4
					if(((StringTokenizer) (s)).hasMoreTokens())
	//*  31   62:aload_0         
	//*  32   63:invokevirtual   #160 <Method boolean StringTokenizer.hasMoreTokens()>
	//*  33   66:ifeq            25
					{
						String s1 = ((StringTokenizer) (s)).nextToken().trim();
	//   34   69:aload_0         
	//   35   70:invokevirtual   #163 <Method String StringTokenizer.nextToken()>
	//   36   73:invokevirtual   #93  <Method String String.trim()>
	//   37   76:astore_1        
						s = s1;
	//   38   77:aload_1         
	//   39   78:astore_0        
						if(s1.startsWith("\""))
	//*  40   79:aload_1         
	//*  41   80:ldc1            #167 <String "\"">
	//*  42   82:invokevirtual   #127 <Method boolean String.startsWith(String)>
	//*  43   85:ifeq            94
							s = s1.substring(1);
	//   44   88:aload_1         
	//   45   89:iconst_1        
	//   46   90:invokevirtual   #139 <Method String String.substring(int)>
	//   47   93:astore_0        
						s1 = s;
	//   48   94:aload_0         
	//   49   95:astore_1        
						if(s.endsWith("\""))
	//*  50   96:aload_0         
	//*  51   97:ldc1            #167 <String "\"">
	//*  52   99:invokevirtual   #170 <Method boolean String.endsWith(String)>
	//*  53  102:ifeq            117
							s1 = s.substring(0, s.length() - 1);
	//   54  105:aload_0         
	//   55  106:iconst_0        
	//   56  107:aload_0         
	//   57  108:invokevirtual   #107 <Method int String.length()>
	//   58  111:iconst_1        
	//   59  112:isub            
	//   60  113:invokevirtual   #173 <Method String String.substring(int, int)>
	//   61  116:astore_1        
						properties.setProperty(s2.toLowerCase(), s1);
	//   62  117:aload_2         
	//   63  118:aload           4
	//   64  120:invokevirtual   #90  <Method String String.toLowerCase()>
	//   65  123:aload_1         
	//   66  124:invokevirtual   #177 <Method Object Properties.setProperty(String, String)>
	//   67  127:pop             
					}
				}
			}
		}
		return properties;
	//*  68  128:goto            25
	}

	public static float parseLength(String s)
	{
		return parseLength(s, 12F);
	//    0    0:aload_0         
	//    1    1:ldc1            #8   <Float 12F>
	//    2    3:invokestatic    #181 <Method float parseLength(String, float)>
	//    3    6:freturn         
	}

	public static float parseLength(String s, float f)
	{
		float f1 = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_2        
		if(s != null) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:ifnonnull       8
_L1:
		return f1;
	//    4    6:fload_2         
	//    5    7:freturn         
_L2:
		int i;
		int j;
		Float float1 = (Float)sizes.get(((Object) (s.toLowerCase())));
	//    6    8:getstatic       #22  <Field HashMap sizes>
	//    7   11:aload_0         
	//    8   12:invokevirtual   #90  <Method String String.toLowerCase()>
	//    9   15:invokevirtual   #185 <Method Object HashMap.get(Object)>
	//   10   18:checkcast       #26  <Class Float>
	//   11   21:astore          7
		if(float1 != null)
	//*  12   23:aload           7
	//*  13   25:ifnull          34
			return float1.floatValue();
	//   14   28:aload           7
	//   15   30:invokevirtual   #189 <Method float Float.floatValue()>
	//   16   33:freturn         
		i = 0;
	//   17   34:iconst_0        
	//   18   35:istore          4
		j = s.length();
	//   19   37:aload_0         
	//   20   38:invokevirtual   #107 <Method int String.length()>
	//   21   41:istore          6
		boolean flag = true;
	//   22   43:iconst_1        
	//   23   44:istore          5
		do
		{
			if(!flag || i >= j)
				continue; /* Loop/switch isn't completed */
	//   24   46:iload           5
	//   25   48:ifeq            155
	//   26   51:iload           4
	//   27   53:iload           6
	//   28   55:icmpge          155
			switch(s.charAt(i))
	//*  29   58:aload_0         
	//*  30   59:iload           4
	//*  31   61:invokevirtual   #111 <Method char String.charAt(int)>
			{
	//*  32   64:tableswitch     43 57: default 140
	//	               43 146
	//	               44 140
	//	               45 146
	//	               46 146
	//	               47 140
	//	               48 146
	//	               49 146
	//	               50 146
	//	               51 146
	//	               52 146
	//	               53 146
	//	               54 146
	//	               55 146
	//	               56 146
	//	               57 146
			case 44: // ','
			case 47: // '/'
			default:
				flag = false;
	//   33  140:iconst_0        
	//   34  141:istore          5
				break;

	//*  35  143:goto            46
			case 43: // '+'
			case 45: // '-'
			case 46: // '.'
			case 48: // '0'
			case 49: // '1'
			case 50: // '2'
			case 51: // '3'
			case 52: // '4'
			case 53: // '5'
			case 54: // '6'
			case 55: // '7'
			case 56: // '8'
			case 57: // '9'
				i++;
	//   36  146:iload           4
	//   37  148:iconst_1        
	//   38  149:iadd            
	//   39  150:istore          4
				break;
			}
		} while(true);
	//*  40  152:goto            46
		if(i == 0) goto _L1; else goto _L3
	//   41  155:iload           4
	//   42  157:ifeq            6
_L3:
		if(i == j)
	//*  43  160:iload           4
	//*  44  162:iload           6
	//*  45  164:icmpne          190
			return Float.parseFloat((new StringBuilder()).append(s).append("f").toString());
	//   46  167:new             #191 <Class StringBuilder>
	//   47  170:dup             
	//   48  171:invokespecial   #192 <Method void StringBuilder()>
	//   49  174:aload_0         
	//   50  175:invokevirtual   #195 <Method StringBuilder StringBuilder.append(String)>
	//   51  178:ldc1            #197 <String "f">
	//   52  180:invokevirtual   #195 <Method StringBuilder StringBuilder.append(String)>
	//   53  183:invokevirtual   #198 <Method String StringBuilder.toString()>
	//   54  186:invokestatic    #135 <Method float Float.parseFloat(String)>
	//   55  189:freturn         
		float f2 = Float.parseFloat((new StringBuilder()).append(s.substring(0, i)).append("f").toString());
	//   56  190:new             #191 <Class StringBuilder>
	//   57  193:dup             
	//   58  194:invokespecial   #192 <Method void StringBuilder()>
	//   59  197:aload_0         
	//   60  198:iconst_0        
	//   61  199:iload           4
	//   62  201:invokevirtual   #173 <Method String String.substring(int, int)>
	//   63  204:invokevirtual   #195 <Method StringBuilder StringBuilder.append(String)>
	//   64  207:ldc1            #197 <String "f">
	//   65  209:invokevirtual   #195 <Method StringBuilder StringBuilder.append(String)>
	//   66  212:invokevirtual   #198 <Method String StringBuilder.toString()>
	//   67  215:invokestatic    #135 <Method float Float.parseFloat(String)>
	//   68  218:fstore_3        
		s = s.substring(i);
	//   69  219:aload_0         
	//   70  220:iload           4
	//   71  222:invokevirtual   #139 <Method String String.substring(int)>
	//   72  225:astore_0        
		if(s.startsWith("in"))
	//*  73  226:aload_0         
	//*  74  227:ldc1            #200 <String "in">
	//*  75  229:invokevirtual   #127 <Method boolean String.startsWith(String)>
	//*  76  232:ifeq            240
			return f2 * 72F;
	//   77  235:fload_3         
	//   78  236:ldc1            #201 <Float 72F>
	//   79  238:fmul            
	//   80  239:freturn         
		if(s.startsWith("cm"))
	//*  81  240:aload_0         
	//*  82  241:ldc1            #203 <String "cm">
	//*  83  243:invokevirtual   #127 <Method boolean String.startsWith(String)>
	//*  84  246:ifeq            257
			return (f2 / 2.54F) * 72F;
	//   85  249:fload_3         
	//   86  250:ldc1            #204 <Float 2.54F>
	//   87  252:fdiv            
	//   88  253:ldc1            #201 <Float 72F>
	//   89  255:fmul            
	//   90  256:freturn         
		if(s.startsWith("mm"))
	//*  91  257:aload_0         
	//*  92  258:ldc1            #206 <String "mm">
	//*  93  260:invokevirtual   #127 <Method boolean String.startsWith(String)>
	//*  94  263:ifeq            274
			return (f2 / 25.4F) * 72F;
	//   95  266:fload_3         
	//   96  267:ldc1            #207 <Float 25.4F>
	//   97  269:fdiv            
	//   98  270:ldc1            #201 <Float 72F>
	//   99  272:fmul            
	//  100  273:freturn         
		if(s.startsWith("pc"))
	//* 101  274:aload_0         
	//* 102  275:ldc1            #209 <String "pc">
	//* 103  277:invokevirtual   #127 <Method boolean String.startsWith(String)>
	//* 104  280:ifeq            288
			return f2 * 12F;
	//  105  283:fload_3         
	//  106  284:ldc1            #8   <Float 12F>
	//  107  286:fmul            
	//  108  287:freturn         
		if(s.startsWith("em"))
	//* 109  288:aload_0         
	//* 110  289:ldc1            #211 <String "em">
	//* 111  291:invokevirtual   #127 <Method boolean String.startsWith(String)>
	//* 112  294:ifeq            301
			return f2 * f;
	//  113  297:fload_3         
	//  114  298:fload_1         
	//  115  299:fmul            
	//  116  300:freturn         
		f1 = f2;
	//  117  301:fload_3         
	//  118  302:fstore_2        
		if(s.startsWith("ex"))
	//* 119  303:aload_0         
	//* 120  304:ldc1            #213 <String "ex">
	//* 121  306:invokevirtual   #127 <Method boolean String.startsWith(String)>
	//* 122  309:ifeq            6
			return (f2 * f) / 2.0F;
	//  123  312:fload_3         
	//  124  313:fload_1         
	//  125  314:fmul            
	//  126  315:fconst_2        
	//  127  316:fdiv            
	//  128  317:freturn         
		if(true) goto _L1; else goto _L4
_L4:
	}

	public static String removeComment(String s, String s1, String s2)
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #102 <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #103 <Method void StringBuffer()>
	//    3    7:astore          6
		int i = 0;
	//    4    9:iconst_0        
	//    5   10:istore_3        
		int k = s2.length();
	//    6   11:aload_2         
	//    7   12:invokevirtual   #107 <Method int String.length()>
	//    8   15:istore          5
		for(int j = s.indexOf(s1, 0); j > -1; j = s.indexOf(s1, i))
	//*   9   17:aload_0         
	//*  10   18:aload_1         
	//*  11   19:iconst_0        
	//*  12   20:invokevirtual   #219 <Method int String.indexOf(String, int)>
	//*  13   23:istore          4
	//*  14   25:iload           4
	//*  15   27:iconst_m1       
	//*  16   28:icmple          66
		{
			stringbuffer.append(s.substring(i, j));
	//   17   31:aload           6
	//   18   33:aload_0         
	//   19   34:iload_3         
	//   20   35:iload           4
	//   21   37:invokevirtual   #173 <Method String String.substring(int, int)>
	//   22   40:invokevirtual   #222 <Method StringBuffer StringBuffer.append(String)>
	//   23   43:pop             
			i = s.indexOf(s2, j) + k;
	//   24   44:aload_0         
	//   25   45:aload_2         
	//   26   46:iload           4
	//   27   48:invokevirtual   #219 <Method int String.indexOf(String, int)>
	//   28   51:iload           5
	//   29   53:iadd            
	//   30   54:istore_3        
		}

	//   31   55:aload_0         
	//   32   56:aload_1         
	//   33   57:iload_3         
	//   34   58:invokevirtual   #219 <Method int String.indexOf(String, int)>
	//   35   61:istore          4
	//*  36   63:goto            25
		stringbuffer.append(s.substring(i));
	//   37   66:aload           6
	//   38   68:aload_0         
	//   39   69:iload_3         
	//   40   70:invokevirtual   #139 <Method String String.substring(int)>
	//   41   73:invokevirtual   #222 <Method StringBuffer StringBuffer.append(String)>
	//   42   76:pop             
		return stringbuffer.toString();
	//   43   77:aload           6
	//   44   79:invokevirtual   #118 <Method String StringBuffer.toString()>
	//   45   82:areturn         
	}

	public static final float DEFAULT_FONT_SIZE = 12F;
	public static final int FONTSIZES[] = {
		8, 10, 12, 14, 18, 24, 36
	};
	private static HashMap sizes;

	static 
	{
		sizes = new HashMap();
	//    0    0:new             #17  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void HashMap()>
	//    3    7:putstatic       #22  <Field HashMap sizes>
		sizes.put("xx-small", ((Object) (new Float(4F))));
	//    4   10:getstatic       #22  <Field HashMap sizes>
	//    5   13:ldc1            #24  <String "xx-small">
	//    6   15:new             #26  <Class Float>
	//    7   18:dup             
	//    8   19:ldc1            #27  <Float 4F>
	//    9   21:invokespecial   #30  <Method void Float(float)>
	//   10   24:invokevirtual   #34  <Method Object HashMap.put(Object, Object)>
	//   11   27:pop             
		sizes.put("x-small", ((Object) (new Float(6F))));
	//   12   28:getstatic       #22  <Field HashMap sizes>
	//   13   31:ldc1            #36  <String "x-small">
	//   14   33:new             #26  <Class Float>
	//   15   36:dup             
	//   16   37:ldc1            #37  <Float 6F>
	//   17   39:invokespecial   #30  <Method void Float(float)>
	//   18   42:invokevirtual   #34  <Method Object HashMap.put(Object, Object)>
	//   19   45:pop             
		sizes.put("small", ((Object) (new Float(8F))));
	//   20   46:getstatic       #22  <Field HashMap sizes>
	//   21   49:ldc1            #39  <String "small">
	//   22   51:new             #26  <Class Float>
	//   23   54:dup             
	//   24   55:ldc1            #40  <Float 8F>
	//   25   57:invokespecial   #30  <Method void Float(float)>
	//   26   60:invokevirtual   #34  <Method Object HashMap.put(Object, Object)>
	//   27   63:pop             
		sizes.put("medium", ((Object) (new Float(10F))));
	//   28   64:getstatic       #22  <Field HashMap sizes>
	//   29   67:ldc1            #42  <String "medium">
	//   30   69:new             #26  <Class Float>
	//   31   72:dup             
	//   32   73:ldc1            #43  <Float 10F>
	//   33   75:invokespecial   #30  <Method void Float(float)>
	//   34   78:invokevirtual   #34  <Method Object HashMap.put(Object, Object)>
	//   35   81:pop             
		sizes.put("large", ((Object) (new Float(13F))));
	//   36   82:getstatic       #22  <Field HashMap sizes>
	//   37   85:ldc1            #45  <String "large">
	//   38   87:new             #26  <Class Float>
	//   39   90:dup             
	//   40   91:ldc1            #46  <Float 13F>
	//   41   93:invokespecial   #30  <Method void Float(float)>
	//   42   96:invokevirtual   #34  <Method Object HashMap.put(Object, Object)>
	//   43   99:pop             
		sizes.put("x-large", ((Object) (new Float(18F))));
	//   44  100:getstatic       #22  <Field HashMap sizes>
	//   45  103:ldc1            #48  <String "x-large">
	//   46  105:new             #26  <Class Float>
	//   47  108:dup             
	//   48  109:ldc1            #49  <Float 18F>
	//   49  111:invokespecial   #30  <Method void Float(float)>
	//   50  114:invokevirtual   #34  <Method Object HashMap.put(Object, Object)>
	//   51  117:pop             
		sizes.put("xx-large", ((Object) (new Float(26F))));
	//   52  118:getstatic       #22  <Field HashMap sizes>
	//   53  121:ldc1            #51  <String "xx-large">
	//   54  123:new             #26  <Class Float>
	//   55  126:dup             
	//   56  127:ldc1            #52  <Float 26F>
	//   57  129:invokespecial   #30  <Method void Float(float)>
	//   58  132:invokevirtual   #34  <Method Object HashMap.put(Object, Object)>
	//   59  135:pop             
	//   60  136:bipush          7
	//   61  138:newarray        int[]
	//   62  140:dup             
	//   63  141:iconst_0        
	//   64  142:bipush          8
	//   65  144:iastore         
	//   66  145:dup             
	//   67  146:iconst_1        
	//   68  147:bipush          10
	//   69  149:iastore         
	//   70  150:dup             
	//   71  151:iconst_2        
	//   72  152:bipush          12
	//   73  154:iastore         
	//   74  155:dup             
	//   75  156:iconst_3        
	//   76  157:bipush          14
	//   77  159:iastore         
	//   78  160:dup             
	//   79  161:iconst_4        
	//   80  162:bipush          18
	//   81  164:iastore         
	//   82  165:dup             
	//   83  166:iconst_5        
	//   84  167:bipush          24
	//   85  169:iastore         
	//   86  170:dup             
	//   87  171:bipush          6
	//   88  173:bipush          36
	//   89  175:iastore         
	//   90  176:putstatic       #54  <Field int[] FONTSIZES>
	//*  91  179:return          
	}
}
