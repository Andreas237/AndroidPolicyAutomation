// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css;

import com.itextpdf.text.html.WebColors;
import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.css.apply.MarginMemory;
import com.itextpdf.tool.xml.exceptions.NoDataException;
import java.text.MessageFormat;
import java.util.*;

public class CssUtils
{

	private CssUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #103 <Method void Object()>
	//    2    4:return          
	}

	public static CssUtils getInstance()
	{
		return instance;
	//    0    0:getstatic       #46  <Field CssUtils instance>
	//    1    3:areturn         
	}

	public float calculateMarginTop(float f, MarginMemory marginmemory)
	{
		float f1;
		try
		{
			f1 = marginmemory.getLastMarginBottom().floatValue();
	//    0    0:aload_2         
	//    1    1:invokeinterface #115 <Method Float MarginMemory.getLastMarginBottom()>
	//    2    6:invokevirtual   #121 <Method float Float.floatValue()>
	//    3    9:fstore_3        
		}
	//*   4   10:fload_1         
	//*   5   11:fload_3         
	//*   6   12:fcmpl           
	//*   7   13:ifle            20
	//*   8   16:fload_1         
	//*   9   17:fload_3         
	//*  10   18:fsub            
	//*  11   19:freturn         
	//*  12   20:fconst_0        
	//*  13   21:freturn         
		// Misplaced declaration of an exception variable
		catch(MarginMemory marginmemory)
	//*  14   22:astore_2        
		{
			return f;
	//   15   23:fload_1         
	//   16   24:freturn         
		}
		if(f > f1)
			return f - f1;
		else
			return 0.0F;
	}

	public float calculateMarginTop(String s, float f, MarginMemory marginmemory)
	{
		return calculateMarginTop(parseValueToPt(s, f), marginmemory);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:fload_2         
	//    4    4:invokevirtual   #126 <Method float parseValueToPt(String, float)>
	//    5    7:aload_3         
	//    6    8:invokevirtual   #128 <Method float calculateMarginTop(float, MarginMemory)>
	//    7   11:freturn         
	}

	public float checkMetricStyle(Tag tag, String s)
	{
		tag = ((Tag) (checkMetricStyle(tag.getCSS(), s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #136 <Method Map Tag.getCSS()>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #139 <Method Float checkMetricStyle(Map, String)>
	//    5    9:astore_1        
		if(tag != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          19
			return ((Float) (tag)).floatValue();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #121 <Method float Float.floatValue()>
	//   10   18:freturn         
		else
			return 0.0F;
	//   11   19:fconst_0        
	//   12   20:freturn         
	}

	public Float checkMetricStyle(Map map, String s)
	{
		map = ((Map) ((String)map.get(((Object) (s)))));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #145 <Method Object Map.get(Object)>
	//    3    7:checkcast       #50  <Class String>
	//    4   10:astore_1        
		if(map != null && (isMetricValue(((String) (map))) || isNumericValue(((String) (map)))))
	//*   5   11:aload_1         
	//*   6   12:ifnull          40
	//*   7   15:aload_0         
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #149 <Method boolean isMetricValue(String)>
	//*  10   20:ifne            31
	//*  11   23:aload_0         
	//*  12   24:aload_1         
	//*  13   25:invokevirtual   #152 <Method boolean isNumericValue(String)>
	//*  14   28:ifeq            40
			return Float.valueOf(parsePxInCmMmPcToPt(((String) (map))));
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokevirtual   #156 <Method float parsePxInCmMmPcToPt(String)>
	//   18   36:invokestatic    #160 <Method Float Float.valueOf(float)>
	//   19   39:areturn         
		else
			return null;
	//   20   40:aconst_null     
	//   21   41:areturn         
	}

	public int determinePositionBetweenValueAndUnit(String s)
	{
		if(s != null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnonnull       10
_L1:
		int j = 0;
	//    2    4:iconst_0        
	//    3    5:istore          4
_L4:
		return j;
	//    4    7:iload           4
	//    5    9:ireturn         
_L2:
		int i;
		boolean flag;
		i = 0;
	//    6   10:iconst_0        
	//    7   11:istore_2        
		flag = true;
	//    8   12:iconst_1        
	//    9   13:istore_3        
_L7:
		j = i;
	//   10   14:iload_2         
	//   11   15:istore          4
		if(!flag) goto _L4; else goto _L3
	//   12   17:iload_3         
	//   13   18:ifeq            7
_L3:
		j = i;
	//   14   21:iload_2         
	//   15   22:istore          4
		if(i >= s.length()) goto _L4; else goto _L5
	//   16   24:iload_2         
	//   17   25:aload_1         
	//   18   26:invokevirtual   #168 <Method int String.length()>
	//   19   29:icmpge          7
_L5:
		switch(s.charAt(i))
	//*  20   32:aload_1         
	//*  21   33:iload_2         
	//*  22   34:invokevirtual   #172 <Method char String.charAt(int)>
		{
	//*  23   37:tableswitch     43 57: default 112
	//	               43 117
	//	               44 112
	//	               45 117
	//	               46 117
	//	               47 112
	//	               48 117
	//	               49 117
	//	               50 117
	//	               51 117
	//	               52 117
	//	               53 117
	//	               54 117
	//	               55 117
	//	               56 117
	//	               57 117
		case 44: // ','
		case 47: // '/'
		default:
			flag = false;
	//   24  112:iconst_0        
	//   25  113:istore_3        
			break;

	//*  26  114:goto            14
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
	//   27  117:iload_2         
	//   28  118:iconst_1        
	//   29  119:iadd            
	//   30  120:istore_2        
			break;
		}
		if(true) goto _L7; else goto _L6
_L6:
	//*  31  121:goto            14
	}

	public String extractUrl(String s)
	{
		if(s.startsWith("url"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #176 <String "url">
	//*   2    3:invokevirtual   #179 <Method boolean String.startsWith(String)>
	//*   3    6:ifeq            111
		{
			s = s.substring(3).trim().replace("(", "").replace(")", "").trim();
	//    4    9:aload_1         
	//    5   10:iconst_3        
	//    6   11:invokevirtual   #183 <Method String String.substring(int)>
	//    7   14:invokevirtual   #187 <Method String String.trim()>
	//    8   17:ldc1            #189 <String "(">
	//    9   19:ldc1            #191 <String "">
	//   10   21:invokevirtual   #195 <Method String String.replace(CharSequence, CharSequence)>
	//   11   24:ldc1            #197 <String ")">
	//   12   26:ldc1            #191 <String "">
	//   13   28:invokevirtual   #195 <Method String String.replace(CharSequence, CharSequence)>
	//   14   31:invokevirtual   #187 <Method String String.trim()>
	//   15   34:astore_1        
			if(s.startsWith("'") && s.endsWith("'"))
	//*  16   35:aload_1         
	//*  17   36:ldc1            #199 <String "'">
	//*  18   38:invokevirtual   #179 <Method boolean String.startsWith(String)>
	//*  19   41:ifeq            72
	//*  20   44:aload_1         
	//*  21   45:ldc1            #199 <String "'">
	//*  22   47:invokevirtual   #202 <Method boolean String.endsWith(String)>
	//*  23   50:ifeq            72
				return s.substring(s.indexOf("'") + 1, s.lastIndexOf("'"));
	//   24   53:aload_1         
	//   25   54:aload_1         
	//   26   55:ldc1            #199 <String "'">
	//   27   57:invokevirtual   #205 <Method int String.indexOf(String)>
	//   28   60:iconst_1        
	//   29   61:iadd            
	//   30   62:aload_1         
	//   31   63:ldc1            #199 <String "'">
	//   32   65:invokevirtual   #208 <Method int String.lastIndexOf(String)>
	//   33   68:invokevirtual   #211 <Method String String.substring(int, int)>
	//   34   71:areturn         
			if(s.startsWith("\"") && s.endsWith("\""))
	//*  35   72:aload_1         
	//*  36   73:ldc1            #213 <String "\"">
	//*  37   75:invokevirtual   #179 <Method boolean String.startsWith(String)>
	//*  38   78:ifeq            109
	//*  39   81:aload_1         
	//*  40   82:ldc1            #213 <String "\"">
	//*  41   84:invokevirtual   #202 <Method boolean String.endsWith(String)>
	//*  42   87:ifeq            109
				return s.substring(s.indexOf('"') + 1, s.lastIndexOf('"'));
	//   43   90:aload_1         
	//   44   91:aload_1         
	//   45   92:bipush          34
	//   46   94:invokevirtual   #216 <Method int String.indexOf(int)>
	//   47   97:iconst_1        
	//   48   98:iadd            
	//   49   99:aload_1         
	//   50  100:bipush          34
	//   51  102:invokevirtual   #218 <Method int String.lastIndexOf(int)>
	//   52  105:invokevirtual   #211 <Method String String.substring(int, int)>
	//   53  108:areturn         
			else
				return s;
	//   54  109:aload_1         
	//   55  110:areturn         
		} else
		{
			return s;
	//   56  111:aload_1         
	//   57  112:areturn         
		}
	}

	public float getLeftAndRightMargin(Tag tag, float f)
	{
		float f1 = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_3        
		String s = (String)tag.getCSS().get("margin-left");
	//    2    2:aload_1         
	//    3    3:invokevirtual   #136 <Method Map Tag.getCSS()>
	//    4    6:ldc1            #222 <String "margin-left">
	//    5    8:invokeinterface #145 <Method Object Map.get(Object)>
	//    6   13:checkcast       #50  <Class String>
	//    7   16:astore          5
		if(s != null)
	//*   8   18:aload           5
	//*   9   20:ifnull          33
			f1 = 0.0F + parseValueToPt(s, f);
	//   10   23:fconst_0        
	//   11   24:aload_0         
	//   12   25:aload           5
	//   13   27:fload_2         
	//   14   28:invokevirtual   #126 <Method float parseValueToPt(String, float)>
	//   15   31:fadd            
	//   16   32:fstore_3        
		tag = ((Tag) ((String)tag.getCSS().get("margin-right")));
	//   17   33:aload_1         
	//   18   34:invokevirtual   #136 <Method Map Tag.getCSS()>
	//   19   37:ldc1            #224 <String "margin-right">
	//   20   39:invokeinterface #145 <Method Object Map.get(Object)>
	//   21   44:checkcast       #50  <Class String>
	//   22   47:astore_1        
		float f2 = f1;
	//   23   48:fload_3         
	//   24   49:fstore          4
		if(tag != null)
	//*  25   51:aload_1         
	//*  26   52:ifnull          65
			f2 = f1 + parseValueToPt(((String) (tag)), f);
	//   27   55:fload_3         
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:fload_2         
	//   31   59:invokevirtual   #126 <Method float parseValueToPt(String, float)>
	//   32   62:fadd            
	//   33   63:fstore          4
		return f2;
	//   34   65:fload           4
	//   35   67:freturn         
	}

	public boolean isMetricValue(String s)
	{
		return s.contains("px") || s.contains("in") || s.contains("cm") || s.contains("mm") || s.contains("pc") || s.contains("pt");
	//    0    0:aload_1         
	//    1    1:ldc1            #226 <String "px">
	//    2    3:invokevirtual   #230 <Method boolean String.contains(CharSequence)>
	//    3    6:ifne            54
	//    4    9:aload_1         
	//    5   10:ldc1            #232 <String "in">
	//    6   12:invokevirtual   #230 <Method boolean String.contains(CharSequence)>
	//    7   15:ifne            54
	//    8   18:aload_1         
	//    9   19:ldc1            #234 <String "cm">
	//   10   21:invokevirtual   #230 <Method boolean String.contains(CharSequence)>
	//   11   24:ifne            54
	//   12   27:aload_1         
	//   13   28:ldc1            #236 <String "mm">
	//   14   30:invokevirtual   #230 <Method boolean String.contains(CharSequence)>
	//   15   33:ifne            54
	//   16   36:aload_1         
	//   17   37:ldc1            #238 <String "pc">
	//   18   39:invokevirtual   #230 <Method boolean String.contains(CharSequence)>
	//   19   42:ifne            54
	//   20   45:aload_1         
	//   21   46:ldc1            #240 <String "pt">
	//   22   48:invokevirtual   #230 <Method boolean String.contains(CharSequence)>
	//   23   51:ifeq            56
	//   24   54:iconst_1        
	//   25   55:ireturn         
	//   26   56:iconst_0        
	//   27   57:ireturn         
	}

	public boolean isNumericValue(String s)
	{
		return s.matches("^-?\\d\\d*\\.\\d*$") || s.matches("^-?\\d\\d*$") || s.matches("^-?\\.\\d\\d*$");
	//    0    0:aload_1         
	//    1    1:ldc1            #242 <String "^-?\\d\\d*\\.\\d*$">
	//    2    3:invokevirtual   #245 <Method boolean String.matches(String)>
	//    3    6:ifne            27
	//    4    9:aload_1         
	//    5   10:ldc1            #247 <String "^-?\\d\\d*$">
	//    6   12:invokevirtual   #245 <Method boolean String.matches(String)>
	//    7   15:ifne            27
	//    8   18:aload_1         
	//    9   19:ldc1            #249 <String "^-?\\.\\d\\d*$">
	//   10   21:invokevirtual   #245 <Method boolean String.matches(String)>
	//   11   24:ifeq            29
	//   12   27:iconst_1        
	//   13   28:ireturn         
	//   14   29:iconst_0        
	//   15   30:ireturn         
	}

	public boolean isRelativeValue(String s)
	{
		return s.contains("%") || s.contains("em") || s.contains("ex");
	//    0    0:aload_1         
	//    1    1:ldc1            #252 <String "%">
	//    2    3:invokevirtual   #230 <Method boolean String.contains(CharSequence)>
	//    3    6:ifne            28
	//    4    9:aload_1         
	//    5   10:ldc1            #254 <String "em">
	//    6   12:invokevirtual   #230 <Method boolean String.contains(CharSequence)>
	//    7   15:ifne            28
	//    8   18:aload_1         
	//    9   19:ldc2            #256 <String "ex">
	//   10   22:invokevirtual   #230 <Method boolean String.contains(CharSequence)>
	//   11   25:ifeq            30
	//   12   28:iconst_1        
	//   13   29:ireturn         
	//   14   30:iconst_0        
	//   15   31:ireturn         
	}

	public Map parseBorder(String s)
	{
		return parseBorder(s, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #261 <Method Map parseBorder(String, String)>
	//    4    6:areturn         
	}

	public Map parseBorder(String s, String s1)
	{
		int j;
		HashMap hashmap;
		hashmap = new HashMap(0);
	//    0    0:new             #264 <Class HashMap>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #267 <Method void HashMap(int)>
	//    4    8:astore          5
		s = ((String) (splitComplexCssStyle(s)));
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokevirtual   #271 <Method String[] splitComplexCssStyle(String)>
	//    8   15:astore_1        
		j = s.length;
	//    9   16:aload_1         
	//   10   17:arraylength     
	//   11   18:istore          4
		if(j != 1) goto _L2; else goto _L1
	//   12   20:iload           4
	//   13   22:iconst_1        
	//   14   23:icmpne          100
_L1:
		if(!borderwidth.contains(((Object) (s[0]))) && !isNumericValue(((String) (s[0]))) && !isMetricValue(((String) (s[0])))) goto _L4; else goto _L3
	//   15   26:getstatic       #67  <Field Set borderwidth>
	//   16   29:aload_1         
	//   17   30:iconst_0        
	//   18   31:aaload          
	//   19   32:invokeinterface #276 <Method boolean Set.contains(Object)>
	//   20   37:ifne            60
	//   21   40:aload_0         
	//   22   41:aload_1         
	//   23   42:iconst_0        
	//   24   43:aaload          
	//   25   44:invokevirtual   #152 <Method boolean isNumericValue(String)>
	//   26   47:ifne            60
	//   27   50:aload_0         
	//   28   51:aload_1         
	//   29   52:iconst_0        
	//   30   53:aaload          
	//   31   54:invokevirtual   #149 <Method boolean isMetricValue(String)>
	//   32   57:ifeq            80
_L3:
		hashmap.putAll(parseBoxValues(((String) (s[0])), "border-", "-width", s1));
	//   33   60:aload           5
	//   34   62:aload_0         
	//   35   63:aload_1         
	//   36   64:iconst_0        
	//   37   65:aaload          
	//   38   66:ldc1            #8   <String "border-">
	//   39   68:ldc1            #20  <String "-width">
	//   40   70:aload_2         
	//   41   71:invokevirtual   #280 <Method Map parseBoxValues(String, String, String, String)>
	//   42   74:invokevirtual   #284 <Method void HashMap.putAll(Map)>
_L6:
		return ((Map) (hashmap));
	//   43   77:aload           5
	//   44   79:areturn         
_L4:
		hashmap.putAll(parseBoxValues(((String) (s[0])), "border-", "-style", s1));
	//   45   80:aload           5
	//   46   82:aload_0         
	//   47   83:aload_1         
	//   48   84:iconst_0        
	//   49   85:aaload          
	//   50   86:ldc1            #8   <String "border-">
	//   51   88:ldc1            #17  <String "-style">
	//   52   90:aload_2         
	//   53   91:invokevirtual   #280 <Method Map parseBoxValues(String, String, String, String)>
	//   54   94:invokevirtual   #284 <Method void HashMap.putAll(Map)>
		return ((Map) (hashmap));
	//   55   97:aload           5
	//   56   99:areturn         
_L2:
		int i = 0;
	//   57  100:iconst_0        
	//   58  101:istore_3        
		while(i < j) 
	//*  59  102:iload_3         
	//*  60  103:iload           4
	//*  61  105:icmpge          77
		{
			String s2 = ((String) (s[i]));
	//   62  108:aload_1         
	//   63  109:iload_3         
	//   64  110:aaload          
	//   65  111:astore          6
			if(borderwidth.contains(((Object) (s2))) || isNumericValue(s2) || isMetricValue(s2))
	//*  66  113:getstatic       #67  <Field Set borderwidth>
	//*  67  116:aload           6
	//*  68  118:invokeinterface #276 <Method boolean Set.contains(Object)>
	//*  69  123:ifne            144
	//*  70  126:aload_0         
	//*  71  127:aload           6
	//*  72  129:invokevirtual   #152 <Method boolean isNumericValue(String)>
	//*  73  132:ifne            144
	//*  74  135:aload_0         
	//*  75  136:aload           6
	//*  76  138:invokevirtual   #149 <Method boolean isMetricValue(String)>
	//*  77  141:ifeq            167
				hashmap.putAll(parseBoxValues(s2, "border-", "-width", s1));
	//   78  144:aload           5
	//   79  146:aload_0         
	//   80  147:aload           6
	//   81  149:ldc1            #8   <String "border-">
	//   82  151:ldc1            #20  <String "-width">
	//   83  153:aload_2         
	//   84  154:invokevirtual   #280 <Method Map parseBoxValues(String, String, String, String)>
	//   85  157:invokevirtual   #284 <Method void HashMap.putAll(Map)>
			else
	//*  86  160:iload_3         
	//*  87  161:iconst_1        
	//*  88  162:iadd            
	//*  89  163:istore_3        
	//*  90  164:goto            102
			if(borderstyle.contains(((Object) (s2))))
	//*  91  167:getstatic       #89  <Field Set borderstyle>
	//*  92  170:aload           6
	//*  93  172:invokeinterface #276 <Method boolean Set.contains(Object)>
	//*  94  177:ifeq            199
				hashmap.putAll(parseBoxValues(s2, "border-", "-style", s1));
	//   95  180:aload           5
	//   96  182:aload_0         
	//   97  183:aload           6
	//   98  185:ldc1            #8   <String "border-">
	//   99  187:ldc1            #17  <String "-style">
	//  100  189:aload_2         
	//  101  190:invokevirtual   #280 <Method Map parseBoxValues(String, String, String, String)>
	//  102  193:invokevirtual   #284 <Method void HashMap.putAll(Map)>
			else
	//* 103  196:goto            160
			if(s2.contains("rgb(") || s2.contains("#") || WebColors.NAMES.containsKey(((Object) (s2.toLowerCase()))))
	//* 104  199:aload           6
	//* 105  201:ldc2            #286 <String "rgb(">
	//* 106  204:invokevirtual   #230 <Method boolean String.contains(CharSequence)>
	//* 107  207:ifne            235
	//* 108  210:aload           6
	//* 109  212:ldc2            #288 <String "#">
	//* 110  215:invokevirtual   #230 <Method boolean String.contains(CharSequence)>
	//* 111  218:ifne            235
	//* 112  221:getstatic       #294 <Field WebColors WebColors.NAMES>
	//* 113  224:aload           6
	//* 114  226:invokevirtual   #297 <Method String String.toLowerCase()>
	//* 115  229:invokevirtual   #300 <Method boolean WebColors.containsKey(Object)>
	//* 116  232:ifeq            160
				hashmap.putAll(parseBoxValues(s2, "border-", "-color", s1));
	//  117  235:aload           5
	//  118  237:aload_0         
	//  119  238:aload           6
	//  120  240:ldc1            #8   <String "border-">
	//  121  242:ldc1            #11  <String "-color">
	//  122  244:aload_2         
	//  123  245:invokevirtual   #280 <Method Map parseBoxValues(String, String, String, String)>
	//  124  248:invokevirtual   #284 <Method void HashMap.putAll(Map)>
			i++;
		}
		if(true) goto _L6; else goto _L5
	//  125  251:goto            160
_L5:
	}

	public Map parseBoxValues(String s, String s1, String s2)
	{
		return parseBoxValues(s, s1, s2, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:invokevirtual   #280 <Method Map parseBoxValues(String, String, String, String)>
	//    6    8:areturn         
	}

	public Map parseBoxValues(String s, String s1, String s2, String s3)
	{
		int i;
		Object obj;
		obj = ((Object) (s.split(" ")));
	//    0    0:aload_1         
	//    1    1:ldc2            #305 <String " ">
	//    2    4:invokevirtual   #308 <Method String[] String.split(String)>
	//    3    7:astore          6
		i = obj.length;
	//    4    9:aload           6
	//    5   11:arraylength     
	//    6   12:istore          5
		s = ((String) (new LinkedHashMap(4)));
	//    7   14:new             #310 <Class LinkedHashMap>
	//    8   17:dup             
	//    9   18:iconst_4        
	//   10   19:invokespecial   #311 <Method void LinkedHashMap(int)>
	//   11   22:astore_1        
		if(i != 1) goto _L2; else goto _L1
	//   12   23:iload           5
	//   13   25:iconst_1        
	//   14   26:icmpne          189
_L1:
		obj = ((Object) (obj[0]));
	//   15   29:aload           6
	//   16   31:iconst_0        
	//   17   32:aaload          
	//   18   33:astore          6
		if(s3 != null) goto _L4; else goto _L3
	//   19   35:aload           4
	//   20   37:ifnonnull       146
_L3:
		((Map) (s)).put(((Object) (MessageFormat.format("{0}top{1}", new Object[] {
			s1, s2
		}))), obj);
	//   21   40:aload_1         
	//   22   41:ldc1            #32  <String "{0}top{1}">
	//   23   43:iconst_2        
	//   24   44:anewarray       Object[]
	//   25   47:dup             
	//   26   48:iconst_0        
	//   27   49:aload_2         
	//   28   50:aastore         
	//   29   51:dup             
	//   30   52:iconst_1        
	//   31   53:aload_3         
	//   32   54:aastore         
	//   33   55:invokestatic    #317 <Method String MessageFormat.format(String, Object[])>
	//   34   58:aload           6
	//   35   60:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//   36   65:pop             
		((Map) (s)).put(((Object) (MessageFormat.format("{0}bottom{1}", new Object[] {
			s1, s2
		}))), obj);
	//   37   66:aload_1         
	//   38   67:ldc1            #23  <String "{0}bottom{1}">
	//   39   69:iconst_2        
	//   40   70:anewarray       Object[]
	//   41   73:dup             
	//   42   74:iconst_0        
	//   43   75:aload_2         
	//   44   76:aastore         
	//   45   77:dup             
	//   46   78:iconst_1        
	//   47   79:aload_3         
	//   48   80:aastore         
	//   49   81:invokestatic    #317 <Method String MessageFormat.format(String, Object[])>
	//   50   84:aload           6
	//   51   86:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//   52   91:pop             
		((Map) (s)).put(((Object) (MessageFormat.format("{0}right{1}", new Object[] {
			s1, s2
		}))), obj);
	//   53   92:aload_1         
	//   54   93:ldc1            #29  <String "{0}right{1}">
	//   55   95:iconst_2        
	//   56   96:anewarray       Object[]
	//   57   99:dup             
	//   58  100:iconst_0        
	//   59  101:aload_2         
	//   60  102:aastore         
	//   61  103:dup             
	//   62  104:iconst_1        
	//   63  105:aload_3         
	//   64  106:aastore         
	//   65  107:invokestatic    #317 <Method String MessageFormat.format(String, Object[])>
	//   66  110:aload           6
	//   67  112:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//   68  117:pop             
		((Map) (s)).put(((Object) (MessageFormat.format("{0}left{1}", new Object[] {
			s1, s2
		}))), obj);
	//   69  118:aload_1         
	//   70  119:ldc1            #26  <String "{0}left{1}">
	//   71  121:iconst_2        
	//   72  122:anewarray       Object[]
	//   73  125:dup             
	//   74  126:iconst_0        
	//   75  127:aload_2         
	//   76  128:aastore         
	//   77  129:dup             
	//   78  130:iconst_1        
	//   79  131:aload_3         
	//   80  132:aastore         
	//   81  133:invokestatic    #317 <Method String MessageFormat.format(String, Object[])>
	//   82  136:aload           6
	//   83  138:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//   84  143:pop             
_L6:
		return ((Map) (s));
	//   85  144:aload_1         
	//   86  145:areturn         
_L4:
		((Map) (s)).put(((Object) (MessageFormat.format((new StringBuilder()).append(s3).append("{0}").toString(), new Object[] {
			s2
		}))), obj);
	//   87  146:aload_1         
	//   88  147:new             #323 <Class StringBuilder>
	//   89  150:dup             
	//   90  151:invokespecial   #324 <Method void StringBuilder()>
	//   91  154:aload           4
	//   92  156:invokevirtual   #328 <Method StringBuilder StringBuilder.append(String)>
	//   93  159:ldc2            #330 <String "{0}">
	//   94  162:invokevirtual   #328 <Method StringBuilder StringBuilder.append(String)>
	//   95  165:invokevirtual   #333 <Method String StringBuilder.toString()>
	//   96  168:iconst_1        
	//   97  169:anewarray       Object[]
	//   98  172:dup             
	//   99  173:iconst_0        
	//  100  174:aload_3         
	//  101  175:aastore         
	//  102  176:invokestatic    #317 <Method String MessageFormat.format(String, Object[])>
	//  103  179:aload           6
	//  104  181:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//  105  186:pop             
		return ((Map) (s));
	//  106  187:aload_1         
	//  107  188:areturn         
_L2:
		if(i == 2)
	//* 108  189:iload           5
	//* 109  191:iconst_2        
	//* 110  192:icmpne          359
			if(s3 == null)
	//* 111  195:aload           4
	//* 112  197:ifnonnull       314
			{
				((Map) (s)).put(((Object) (MessageFormat.format("{0}top{1}", new Object[] {
					s1, s2
				}))), ((Object) (obj[0])));
	//  113  200:aload_1         
	//  114  201:ldc1            #32  <String "{0}top{1}">
	//  115  203:iconst_2        
	//  116  204:anewarray       Object[]
	//  117  207:dup             
	//  118  208:iconst_0        
	//  119  209:aload_2         
	//  120  210:aastore         
	//  121  211:dup             
	//  122  212:iconst_1        
	//  123  213:aload_3         
	//  124  214:aastore         
	//  125  215:invokestatic    #317 <Method String MessageFormat.format(String, Object[])>
	//  126  218:aload           6
	//  127  220:iconst_0        
	//  128  221:aaload          
	//  129  222:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//  130  227:pop             
				((Map) (s)).put(((Object) (MessageFormat.format("{0}bottom{1}", new Object[] {
					s1, s2
				}))), ((Object) (obj[0])));
	//  131  228:aload_1         
	//  132  229:ldc1            #23  <String "{0}bottom{1}">
	//  133  231:iconst_2        
	//  134  232:anewarray       Object[]
	//  135  235:dup             
	//  136  236:iconst_0        
	//  137  237:aload_2         
	//  138  238:aastore         
	//  139  239:dup             
	//  140  240:iconst_1        
	//  141  241:aload_3         
	//  142  242:aastore         
	//  143  243:invokestatic    #317 <Method String MessageFormat.format(String, Object[])>
	//  144  246:aload           6
	//  145  248:iconst_0        
	//  146  249:aaload          
	//  147  250:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//  148  255:pop             
				((Map) (s)).put(((Object) (MessageFormat.format("{0}right{1}", new Object[] {
					s1, s2
				}))), ((Object) (obj[1])));
	//  149  256:aload_1         
	//  150  257:ldc1            #29  <String "{0}right{1}">
	//  151  259:iconst_2        
	//  152  260:anewarray       Object[]
	//  153  263:dup             
	//  154  264:iconst_0        
	//  155  265:aload_2         
	//  156  266:aastore         
	//  157  267:dup             
	//  158  268:iconst_1        
	//  159  269:aload_3         
	//  160  270:aastore         
	//  161  271:invokestatic    #317 <Method String MessageFormat.format(String, Object[])>
	//  162  274:aload           6
	//  163  276:iconst_1        
	//  164  277:aaload          
	//  165  278:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//  166  283:pop             
				((Map) (s)).put(((Object) (MessageFormat.format("{0}left{1}", new Object[] {
					s1, s2
				}))), ((Object) (obj[1])));
	//  167  284:aload_1         
	//  168  285:ldc1            #26  <String "{0}left{1}">
	//  169  287:iconst_2        
	//  170  288:anewarray       Object[]
	//  171  291:dup             
	//  172  292:iconst_0        
	//  173  293:aload_2         
	//  174  294:aastore         
	//  175  295:dup             
	//  176  296:iconst_1        
	//  177  297:aload_3         
	//  178  298:aastore         
	//  179  299:invokestatic    #317 <Method String MessageFormat.format(String, Object[])>
	//  180  302:aload           6
	//  181  304:iconst_1        
	//  182  305:aaload          
	//  183  306:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//  184  311:pop             
				return ((Map) (s));
	//  185  312:aload_1         
	//  186  313:areturn         
			} else
			{
				((Map) (s)).put(((Object) (MessageFormat.format((new StringBuilder()).append(s3).append("{0}").toString(), new Object[] {
					s2
				}))), ((Object) (obj[0])));
	//  187  314:aload_1         
	//  188  315:new             #323 <Class StringBuilder>
	//  189  318:dup             
	//  190  319:invokespecial   #324 <Method void StringBuilder()>
	//  191  322:aload           4
	//  192  324:invokevirtual   #328 <Method StringBuilder StringBuilder.append(String)>
	//  193  327:ldc2            #330 <String "{0}">
	//  194  330:invokevirtual   #328 <Method StringBuilder StringBuilder.append(String)>
	//  195  333:invokevirtual   #333 <Method String StringBuilder.toString()>
	//  196  336:iconst_1        
	//  197  337:anewarray       Object[]
	//  198  340:dup             
	//  199  341:iconst_0        
	//  200  342:aload_3         
	//  201  343:aastore         
	//  202  344:invokestatic    #317 <Method String MessageFormat.format(String, Object[])>
	//  203  347:aload           6
	//  204  349:iconst_0        
	//  205  350:aaload          
	//  206  351:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//  207  356:pop             
				return ((Map) (s));
	//  208  357:aload_1         
	//  209  358:areturn         
			}
		if(i == 3)
	//* 210  359:iload           5
	//* 211  361:iconst_3        
	//* 212  362:icmpne          529
			if(s3 == null)
	//* 213  365:aload           4
	//* 214  367:ifnonnull       484
			{
				((Map) (s)).put(((Object) (MessageFormat.format("{0}top{1}", new Object[] {
					s1, s2
				}))), ((Object) (obj[0])));
	//  215  370:aload_1         
	//  216  371:ldc1            #32  <String "{0}top{1}">
	//  217  373:iconst_2        
	//  218  374:anewarray       Object[]
	//  219  377:dup             
	//  220  378:iconst_0        
	//  221  379:aload_2         
	//  222  380:aastore         
	//  223  381:dup             
	//  224  382:iconst_1        
	//  225  383:aload_3         
	//  226  384:aastore         
	//  227  385:invokestatic    #317 <Method String MessageFormat.format(String, Object[])>
	//  228  388:aload           6
	//  229  390:iconst_0        
	//  230  391:aaload          
	//  231  392:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//  232  397:pop             
				((Map) (s)).put(((Object) (MessageFormat.format("{0}bottom{1}", new Object[] {
					s1, s2
				}))), ((Object) (obj[2])));
	//  233  398:aload_1         
	//  234  399:ldc1            #23  <String "{0}bottom{1}">
	//  235  401:iconst_2        
	//  236  402:anewarray       Object[]
	//  237  405:dup             
	//  238  406:iconst_0        
	//  239  407:aload_2         
	//  240  408:aastore         
	//  241  409:dup             
	//  242  410:iconst_1        
	//  243  411:aload_3         
	//  244  412:aastore         
	//  245  413:invokestatic    #317 <Method String MessageFormat.format(String, Object[])>
	//  246  416:aload           6
	//  247  418:iconst_2        
	//  248  419:aaload          
	//  249  420:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//  250  425:pop             
				((Map) (s)).put(((Object) (MessageFormat.format("{0}right{1}", new Object[] {
					s1, s2
				}))), ((Object) (obj[1])));
	//  251  426:aload_1         
	//  252  427:ldc1            #29  <String "{0}right{1}">
	//  253  429:iconst_2        
	//  254  430:anewarray       Object[]
	//  255  433:dup             
	//  256  434:iconst_0        
	//  257  435:aload_2         
	//  258  436:aastore         
	//  259  437:dup             
	//  260  438:iconst_1        
	//  261  439:aload_3         
	//  262  440:aastore         
	//  263  441:invokestatic    #317 <Method String MessageFormat.format(String, Object[])>
	//  264  444:aload           6
	//  265  446:iconst_1        
	//  266  447:aaload          
	//  267  448:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//  268  453:pop             
				((Map) (s)).put(((Object) (MessageFormat.format("{0}left{1}", new Object[] {
					s1, s2
				}))), ((Object) (obj[1])));
	//  269  454:aload_1         
	//  270  455:ldc1            #26  <String "{0}left{1}">
	//  271  457:iconst_2        
	//  272  458:anewarray       Object[]
	//  273  461:dup             
	//  274  462:iconst_0        
	//  275  463:aload_2         
	//  276  464:aastore         
	//  277  465:dup             
	//  278  466:iconst_1        
	//  279  467:aload_3         
	//  280  468:aastore         
	//  281  469:invokestatic    #317 <Method String MessageFormat.format(String, Object[])>
	//  282  472:aload           6
	//  283  474:iconst_1        
	//  284  475:aaload          
	//  285  476:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//  286  481:pop             
				return ((Map) (s));
	//  287  482:aload_1         
	//  288  483:areturn         
			} else
			{
				((Map) (s)).put(((Object) (MessageFormat.format((new StringBuilder()).append(s3).append("{0}").toString(), new Object[] {
					s2
				}))), ((Object) (obj[0])));
	//  289  484:aload_1         
	//  290  485:new             #323 <Class StringBuilder>
	//  291  488:dup             
	//  292  489:invokespecial   #324 <Method void StringBuilder()>
	//  293  492:aload           4
	//  294  494:invokevirtual   #328 <Method StringBuilder StringBuilder.append(String)>
	//  295  497:ldc2            #330 <String "{0}">
	//  296  500:invokevirtual   #328 <Method StringBuilder StringBuilder.append(String)>
	//  297  503:invokevirtual   #333 <Method String StringBuilder.toString()>
	//  298  506:iconst_1        
	//  299  507:anewarray       Object[]
	//  300  510:dup             
	//  301  511:iconst_0        
	//  302  512:aload_3         
	//  303  513:aastore         
	//  304  514:invokestatic    #317 <Method String MessageFormat.format(String, Object[])>
	//  305  517:aload           6
	//  306  519:iconst_0        
	//  307  520:aaload          
	//  308  521:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//  309  526:pop             
				return ((Map) (s));
	//  310  527:aload_1         
	//  311  528:areturn         
			}
		if(i == 4)
	//* 312  529:iload           5
	//* 313  531:iconst_4        
	//* 314  532:icmpne          144
			if(s3 == null)
	//* 315  535:aload           4
	//* 316  537:ifnonnull       654
			{
				((Map) (s)).put(((Object) (MessageFormat.format("{0}top{1}", new Object[] {
					s1, s2
				}))), ((Object) (obj[0])));
	//  317  540:aload_1         
	//  318  541:ldc1            #32  <String "{0}top{1}">
	//  319  543:iconst_2        
	//  320  544:anewarray       Object[]
	//  321  547:dup             
	//  322  548:iconst_0        
	//  323  549:aload_2         
	//  324  550:aastore         
	//  325  551:dup             
	//  326  552:iconst_1        
	//  327  553:aload_3         
	//  328  554:aastore         
	//  329  555:invokestatic    #317 <Method String MessageFormat.format(String, Object[])>
	//  330  558:aload           6
	//  331  560:iconst_0        
	//  332  561:aaload          
	//  333  562:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//  334  567:pop             
				((Map) (s)).put(((Object) (MessageFormat.format("{0}bottom{1}", new Object[] {
					s1, s2
				}))), ((Object) (obj[2])));
	//  335  568:aload_1         
	//  336  569:ldc1            #23  <String "{0}bottom{1}">
	//  337  571:iconst_2        
	//  338  572:anewarray       Object[]
	//  339  575:dup             
	//  340  576:iconst_0        
	//  341  577:aload_2         
	//  342  578:aastore         
	//  343  579:dup             
	//  344  580:iconst_1        
	//  345  581:aload_3         
	//  346  582:aastore         
	//  347  583:invokestatic    #317 <Method String MessageFormat.format(String, Object[])>
	//  348  586:aload           6
	//  349  588:iconst_2        
	//  350  589:aaload          
	//  351  590:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//  352  595:pop             
				((Map) (s)).put(((Object) (MessageFormat.format("{0}right{1}", new Object[] {
					s1, s2
				}))), ((Object) (obj[1])));
	//  353  596:aload_1         
	//  354  597:ldc1            #29  <String "{0}right{1}">
	//  355  599:iconst_2        
	//  356  600:anewarray       Object[]
	//  357  603:dup             
	//  358  604:iconst_0        
	//  359  605:aload_2         
	//  360  606:aastore         
	//  361  607:dup             
	//  362  608:iconst_1        
	//  363  609:aload_3         
	//  364  610:aastore         
	//  365  611:invokestatic    #317 <Method String MessageFormat.format(String, Object[])>
	//  366  614:aload           6
	//  367  616:iconst_1        
	//  368  617:aaload          
	//  369  618:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//  370  623:pop             
				((Map) (s)).put(((Object) (MessageFormat.format("{0}left{1}", new Object[] {
					s1, s2
				}))), ((Object) (obj[3])));
	//  371  624:aload_1         
	//  372  625:ldc1            #26  <String "{0}left{1}">
	//  373  627:iconst_2        
	//  374  628:anewarray       Object[]
	//  375  631:dup             
	//  376  632:iconst_0        
	//  377  633:aload_2         
	//  378  634:aastore         
	//  379  635:dup             
	//  380  636:iconst_1        
	//  381  637:aload_3         
	//  382  638:aastore         
	//  383  639:invokestatic    #317 <Method String MessageFormat.format(String, Object[])>
	//  384  642:aload           6
	//  385  644:iconst_3        
	//  386  645:aaload          
	//  387  646:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//  388  651:pop             
				return ((Map) (s));
	//  389  652:aload_1         
	//  390  653:areturn         
			} else
			{
				((Map) (s)).put(((Object) (MessageFormat.format((new StringBuilder()).append(s3).append("{0}").toString(), new Object[] {
					s2
				}))), ((Object) (obj[0])));
	//  391  654:aload_1         
	//  392  655:new             #323 <Class StringBuilder>
	//  393  658:dup             
	//  394  659:invokespecial   #324 <Method void StringBuilder()>
	//  395  662:aload           4
	//  396  664:invokevirtual   #328 <Method StringBuilder StringBuilder.append(String)>
	//  397  667:ldc2            #330 <String "{0}">
	//  398  670:invokevirtual   #328 <Method StringBuilder StringBuilder.append(String)>
	//  399  673:invokevirtual   #333 <Method String StringBuilder.toString()>
	//  400  676:iconst_1        
	//  401  677:anewarray       Object[]
	//  402  680:dup             
	//  403  681:iconst_0        
	//  404  682:aload_3         
	//  405  683:aastore         
	//  406  684:invokestatic    #317 <Method String MessageFormat.format(String, Object[])>
	//  407  687:aload           6
	//  408  689:iconst_0        
	//  409  690:aaload          
	//  410  691:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//  411  696:pop             
				return ((Map) (s));
	//  412  697:aload_1         
	//  413  698:areturn         
			}
		if(true) goto _L6; else goto _L5
_L5:
	}

	public float parsePxInCmMmPcToPt(String s)
	{
		return parsePxInCmMmPcToPt(s, "px");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #226 <String "px">
	//    3    4:invokevirtual   #337 <Method float parsePxInCmMmPcToPt(String, String)>
	//    4    7:freturn         
	}

	public float parsePxInCmMmPcToPt(String s, String s1)
	{
		int i = determinePositionBetweenValueAndUnit(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #339 <Method int determinePositionBetweenValueAndUnit(String)>
	//    3    5:istore          5
		if(i != 0) goto _L2; else goto _L1
	//    4    7:iload           5
	//    5    9:ifne            16
_L1:
		float f = 0.0F;
	//    6   12:fconst_0        
	//    7   13:fstore_3        
_L4:
		return f;
	//    8   14:fload_3         
	//    9   15:freturn         
_L2:
		float f1;
		f1 = Float.parseFloat((new StringBuilder()).append(s.substring(0, i)).append("f").toString());
	//   10   16:new             #323 <Class StringBuilder>
	//   11   19:dup             
	//   12   20:invokespecial   #324 <Method void StringBuilder()>
	//   13   23:aload_1         
	//   14   24:iconst_0        
	//   15   25:iload           5
	//   16   27:invokevirtual   #211 <Method String String.substring(int, int)>
	//   17   30:invokevirtual   #328 <Method StringBuilder StringBuilder.append(String)>
	//   18   33:ldc2            #341 <String "f">
	//   19   36:invokevirtual   #328 <Method StringBuilder StringBuilder.append(String)>
	//   20   39:invokevirtual   #333 <Method String StringBuilder.toString()>
	//   21   42:invokestatic    #344 <Method float Float.parseFloat(String)>
	//   22   45:fstore          4
		s = s.substring(i);
	//   23   47:aload_1         
	//   24   48:iload           5
	//   25   50:invokevirtual   #183 <Method String String.substring(int)>
	//   26   53:astore_1        
		if(s.startsWith("in") || s.equals("") && s1.equals("in"))
	//*  27   54:aload_1         
	//*  28   55:ldc1            #232 <String "in">
	//*  29   57:invokevirtual   #179 <Method boolean String.startsWith(String)>
	//*  30   60:ifne            81
	//*  31   63:aload_1         
	//*  32   64:ldc1            #191 <String "">
	//*  33   66:invokevirtual   #347 <Method boolean String.equals(Object)>
	//*  34   69:ifeq            88
	//*  35   72:aload_2         
	//*  36   73:ldc1            #232 <String "in">
	//*  37   75:invokevirtual   #347 <Method boolean String.equals(Object)>
	//*  38   78:ifeq            88
			return f1 * 72F;
	//   39   81:fload           4
	//   40   83:ldc2            #348 <Float 72F>
	//   41   86:fmul            
	//   42   87:freturn         
		if(s.startsWith("cm") || s.equals("") && s1.equals("cm"))
	//*  43   88:aload_1         
	//*  44   89:ldc1            #234 <String "cm">
	//*  45   91:invokevirtual   #179 <Method boolean String.startsWith(String)>
	//*  46   94:ifne            115
	//*  47   97:aload_1         
	//*  48   98:ldc1            #191 <String "">
	//*  49  100:invokevirtual   #347 <Method boolean String.equals(Object)>
	//*  50  103:ifeq            126
	//*  51  106:aload_2         
	//*  52  107:ldc1            #234 <String "cm">
	//*  53  109:invokevirtual   #347 <Method boolean String.equals(Object)>
	//*  54  112:ifeq            126
			return (f1 / 2.54F) * 72F;
	//   55  115:fload           4
	//   56  117:ldc2            #349 <Float 2.54F>
	//   57  120:fdiv            
	//   58  121:ldc2            #348 <Float 72F>
	//   59  124:fmul            
	//   60  125:freturn         
		if(s.startsWith("mm") || s.equals("") && s1.equals("mm"))
	//*  61  126:aload_1         
	//*  62  127:ldc1            #236 <String "mm">
	//*  63  129:invokevirtual   #179 <Method boolean String.startsWith(String)>
	//*  64  132:ifne            153
	//*  65  135:aload_1         
	//*  66  136:ldc1            #191 <String "">
	//*  67  138:invokevirtual   #347 <Method boolean String.equals(Object)>
	//*  68  141:ifeq            164
	//*  69  144:aload_2         
	//*  70  145:ldc1            #236 <String "mm">
	//*  71  147:invokevirtual   #347 <Method boolean String.equals(Object)>
	//*  72  150:ifeq            164
			return (f1 / 25.4F) * 72F;
	//   73  153:fload           4
	//   74  155:ldc2            #350 <Float 25.4F>
	//   75  158:fdiv            
	//   76  159:ldc2            #348 <Float 72F>
	//   77  162:fmul            
	//   78  163:freturn         
		if(s.startsWith("pc") || s.equals("") && s1.equals("pc"))
	//*  79  164:aload_1         
	//*  80  165:ldc1            #238 <String "pc">
	//*  81  167:invokevirtual   #179 <Method boolean String.startsWith(String)>
	//*  82  170:ifne            191
	//*  83  173:aload_1         
	//*  84  174:ldc1            #191 <String "">
	//*  85  176:invokevirtual   #347 <Method boolean String.equals(Object)>
	//*  86  179:ifeq            198
	//*  87  182:aload_2         
	//*  88  183:ldc1            #238 <String "pc">
	//*  89  185:invokevirtual   #347 <Method boolean String.equals(Object)>
	//*  90  188:ifeq            198
			return f1 * 12F;
	//   91  191:fload           4
	//   92  193:ldc2            #351 <Float 12F>
	//   93  196:fmul            
	//   94  197:freturn         
		if(s.startsWith("px"))
			break; /* Loop/switch isn't completed */
	//   95  198:aload_1         
	//   96  199:ldc1            #226 <String "px">
	//   97  201:invokevirtual   #179 <Method boolean String.startsWith(String)>
	//   98  204:ifne            231
		f = f1;
	//   99  207:fload           4
	//  100  209:fstore_3        
		if(!s.equals("")) goto _L4; else goto _L3
	//  101  210:aload_1         
	//  102  211:ldc1            #191 <String "">
	//  103  213:invokevirtual   #347 <Method boolean String.equals(Object)>
	//  104  216:ifeq            14
_L3:
		f = f1;
	//  105  219:fload           4
	//  106  221:fstore_3        
		if(!s1.equals("px")) goto _L4; else goto _L5
	//  107  222:aload_2         
	//  108  223:ldc1            #226 <String "px">
	//  109  225:invokevirtual   #347 <Method boolean String.equals(Object)>
	//  110  228:ifeq            14
_L5:
		return f1 * 0.75F;
	//  111  231:fload           4
	//  112  233:ldc2            #352 <Float 0.75F>
	//  113  236:fmul            
	//  114  237:freturn         
	}

	public float parseRelativeValue(String s, float f)
	{
		int i = determinePositionBetweenValueAndUnit(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #339 <Method int determinePositionBetweenValueAndUnit(String)>
	//    3    5:istore          5
		float f1;
		if(i == 0)
	//*   4    7:iload           5
	//*   5    9:ifne            16
		{
			f1 = 0.0F;
	//    6   12:fconst_0        
	//    7   13:fstore_3        
		} else
	//*   8   14:fload_3         
	//*   9   15:freturn         
		{
			float f2 = Float.parseFloat((new StringBuilder()).append(s.substring(0, i)).append("f").toString());
	//   10   16:new             #323 <Class StringBuilder>
	//   11   19:dup             
	//   12   20:invokespecial   #324 <Method void StringBuilder()>
	//   13   23:aload_1         
	//   14   24:iconst_0        
	//   15   25:iload           5
	//   16   27:invokevirtual   #211 <Method String String.substring(int, int)>
	//   17   30:invokevirtual   #328 <Method StringBuilder StringBuilder.append(String)>
	//   18   33:ldc2            #341 <String "f">
	//   19   36:invokevirtual   #328 <Method StringBuilder StringBuilder.append(String)>
	//   20   39:invokevirtual   #333 <Method String StringBuilder.toString()>
	//   21   42:invokestatic    #344 <Method float Float.parseFloat(String)>
	//   22   45:fstore          4
			s = s.substring(i);
	//   23   47:aload_1         
	//   24   48:iload           5
	//   25   50:invokevirtual   #183 <Method String String.substring(int)>
	//   26   53:astore_1        
			if(s.startsWith("%"))
	//*  27   54:aload_1         
	//*  28   55:ldc1            #252 <String "%">
	//*  29   57:invokevirtual   #179 <Method boolean String.startsWith(String)>
	//*  30   60:ifeq            72
				return (f * f2) / 100F;
	//   31   63:fload_2         
	//   32   64:fload           4
	//   33   66:fmul            
	//   34   67:ldc2            #354 <Float 100F>
	//   35   70:fdiv            
	//   36   71:freturn         
			if(s.startsWith("em"))
	//*  37   72:aload_1         
	//*  38   73:ldc1            #254 <String "em">
	//*  39   75:invokevirtual   #179 <Method boolean String.startsWith(String)>
	//*  40   78:ifeq            86
				return f2 * f;
	//   41   81:fload           4
	//   42   83:fload_2         
	//   43   84:fmul            
	//   44   85:freturn         
			f1 = f2;
	//   45   86:fload           4
	//   46   88:fstore_3        
			if(s.contains("ex"))
	//*  47   89:aload_1         
	//*  48   90:ldc2            #256 <String "ex">
	//*  49   93:invokevirtual   #230 <Method boolean String.contains(CharSequence)>
	//*  50   96:ifeq            14
				return (f * f2) / 2.0F;
	//   51   99:fload_2         
	//   52  100:fload           4
	//   53  102:fmul            
	//   54  103:fconst_2        
	//   55  104:fdiv            
	//   56  105:freturn         
		}
		return f1;
	}

	public float parseValueToPt(String s, float f)
	{
		float f1 = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_3        
		if(isMetricValue(s) || isNumericValue(s))
	//*   2    2:aload_0         
	//*   3    3:aload_1         
	//*   4    4:invokevirtual   #149 <Method boolean isMetricValue(String)>
	//*   5    7:ifne            18
	//*   6   10:aload_0         
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #152 <Method boolean isNumericValue(String)>
	//*   9   15:ifeq            26
			f1 = parsePxInCmMmPcToPt(s);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #156 <Method float parsePxInCmMmPcToPt(String)>
	//   13   23:fstore_3        
		else
	//*  14   24:fload_3         
	//*  15   25:freturn         
		if(isRelativeValue(s))
	//*  16   26:aload_0         
	//*  17   27:aload_1         
	//*  18   28:invokevirtual   #356 <Method boolean isRelativeValue(String)>
	//*  19   31:ifeq            24
			return parseRelativeValue(s, f);
	//   20   34:aload_0         
	//   21   35:aload_1         
	//   22   36:fload_2         
	//   23   37:invokevirtual   #358 <Method float parseRelativeValue(String, float)>
	//   24   40:freturn         
		return f1;
	}

	public Map processBackground(String s)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #264 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #360 <Method void HashMap()>
	//    3    7:astore          4
		s = ((String) (splitComplexCssStyle(s)));
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:invokevirtual   #271 <Method String[] splitComplexCssStyle(String)>
	//    7   14:astore_1        
		int j = s.length;
	//    8   15:aload_1         
	//    9   16:arraylength     
	//   10   17:istore_3        
		int i = 0;
	//   11   18:iconst_0        
	//   12   19:istore_2        
		while(i < j) 
	//*  13   20:iload_2         
	//*  14   21:iload_3         
	//*  15   22:icmpge          422
		{
			String s1 = ((String) (s[i]));
	//   16   25:aload_1         
	//   17   26:iload_2         
	//   18   27:aaload          
	//   19   28:astore          5
			if(s1.contains("url("))
	//*  20   30:aload           5
	//*  21   32:ldc2            #362 <String "url(">
	//*  22   35:invokevirtual   #230 <Method boolean String.contains(CharSequence)>
	//*  23   38:ifeq            61
				((Map) (hashmap)).put("background-image", ((Object) (s1)));
	//   24   41:aload           4
	//   25   43:ldc2            #364 <String "background-image">
	//   26   46:aload           5
	//   27   48:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//   28   53:pop             
			else
	//*  29   54:iload_2         
	//*  30   55:iconst_1        
	//*  31   56:iadd            
	//*  32   57:istore_2        
	//*  33   58:goto            20
			if(s1.equalsIgnoreCase("repeat") || s1.equalsIgnoreCase("no-repeat") || s1.equalsIgnoreCase("repeat-x") || s1.equalsIgnoreCase("repeat-y"))
	//*  34   61:aload           5
	//*  35   63:ldc2            #366 <String "repeat">
	//*  36   66:invokevirtual   #369 <Method boolean String.equalsIgnoreCase(String)>
	//*  37   69:ifne            105
	//*  38   72:aload           5
	//*  39   74:ldc2            #371 <String "no-repeat">
	//*  40   77:invokevirtual   #369 <Method boolean String.equalsIgnoreCase(String)>
	//*  41   80:ifne            105
	//*  42   83:aload           5
	//*  43   85:ldc2            #373 <String "repeat-x">
	//*  44   88:invokevirtual   #369 <Method boolean String.equalsIgnoreCase(String)>
	//*  45   91:ifne            105
	//*  46   94:aload           5
	//*  47   96:ldc2            #375 <String "repeat-y">
	//*  48   99:invokevirtual   #369 <Method boolean String.equalsIgnoreCase(String)>
	//*  49  102:ifeq            121
				((Map) (hashmap)).put("background-repeat", ((Object) (s1)));
	//   50  105:aload           4
	//   51  107:ldc2            #377 <String "background-repeat">
	//   52  110:aload           5
	//   53  112:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//   54  117:pop             
			else
	//*  55  118:goto            54
			if(s1.equalsIgnoreCase("fixed") || s1.equalsIgnoreCase("scroll"))
	//*  56  121:aload           5
	//*  57  123:ldc2            #379 <String "fixed">
	//*  58  126:invokevirtual   #369 <Method boolean String.equalsIgnoreCase(String)>
	//*  59  129:ifne            143
	//*  60  132:aload           5
	//*  61  134:ldc2            #381 <String "scroll">
	//*  62  137:invokevirtual   #369 <Method boolean String.equalsIgnoreCase(String)>
	//*  63  140:ifeq            159
				((Map) (hashmap)).put("background-attachment", ((Object) (s1)));
	//   64  143:aload           4
	//   65  145:ldc2            #383 <String "background-attachment">
	//   66  148:aload           5
	//   67  150:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//   68  155:pop             
			else
	//*  69  156:goto            54
			if(backgroundPositions.contains(((Object) (s1))))
	//*  70  159:getstatic       #101 <Field Set backgroundPositions>
	//*  71  162:aload           5
	//*  72  164:invokeinterface #276 <Method boolean Set.contains(Object)>
	//*  73  169:ifeq            252
			{
				if(((Map) (hashmap)).get("background-position") == null)
	//*  74  172:aload           4
	//*  75  174:ldc2            #385 <String "background-position">
	//*  76  177:invokeinterface #145 <Method Object Map.get(Object)>
	//*  77  182:ifnonnull       201
					((Map) (hashmap)).put("background-position", ((Object) (s1)));
	//   78  185:aload           4
	//   79  187:ldc2            #385 <String "background-position">
	//   80  190:aload           5
	//   81  192:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//   82  197:pop             
				else
	//*  83  198:goto            54
					((Map) (hashmap)).put("background-position", ((Object) (s1.concat((new StringBuilder()).append(" ").append((String)((Map) (hashmap)).get("background-position")).toString()))));
	//   84  201:aload           4
	//   85  203:ldc2            #385 <String "background-position">
	//   86  206:aload           5
	//   87  208:new             #323 <Class StringBuilder>
	//   88  211:dup             
	//   89  212:invokespecial   #324 <Method void StringBuilder()>
	//   90  215:ldc2            #305 <String " ">
	//   91  218:invokevirtual   #328 <Method StringBuilder StringBuilder.append(String)>
	//   92  221:aload           4
	//   93  223:ldc2            #385 <String "background-position">
	//   94  226:invokeinterface #145 <Method Object Map.get(Object)>
	//   95  231:checkcast       #50  <Class String>
	//   96  234:invokevirtual   #328 <Method StringBuilder StringBuilder.append(String)>
	//   97  237:invokevirtual   #333 <Method String StringBuilder.toString()>
	//   98  240:invokevirtual   #388 <Method String String.concat(String)>
	//   99  243:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//  100  248:pop             
			} else
	//* 101  249:goto            54
			if(isNumericValue(s1) || isMetricValue(s1) || isRelativeValue(s1))
	//* 102  252:aload_0         
	//* 103  253:aload           5
	//* 104  255:invokevirtual   #152 <Method boolean isNumericValue(String)>
	//* 105  258:ifne            279
	//* 106  261:aload_0         
	//* 107  262:aload           5
	//* 108  264:invokevirtual   #149 <Method boolean isMetricValue(String)>
	//* 109  267:ifne            279
	//* 110  270:aload_0         
	//* 111  271:aload           5
	//* 112  273:invokevirtual   #356 <Method boolean isRelativeValue(String)>
	//* 113  276:ifeq            359
			{
				if(((Map) (hashmap)).get("background-position") == null)
	//* 114  279:aload           4
	//* 115  281:ldc2            #385 <String "background-position">
	//* 116  284:invokeinterface #145 <Method Object Map.get(Object)>
	//* 117  289:ifnonnull       308
					((Map) (hashmap)).put("background-position", ((Object) (s1)));
	//  118  292:aload           4
	//  119  294:ldc2            #385 <String "background-position">
	//  120  297:aload           5
	//  121  299:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//  122  304:pop             
				else
	//* 123  305:goto            54
					((Map) (hashmap)).put("background-position", ((Object) (s1.concat((new StringBuilder()).append(" ").append((String)((Map) (hashmap)).get("background-position")).toString()))));
	//  124  308:aload           4
	//  125  310:ldc2            #385 <String "background-position">
	//  126  313:aload           5
	//  127  315:new             #323 <Class StringBuilder>
	//  128  318:dup             
	//  129  319:invokespecial   #324 <Method void StringBuilder()>
	//  130  322:ldc2            #305 <String " ">
	//  131  325:invokevirtual   #328 <Method StringBuilder StringBuilder.append(String)>
	//  132  328:aload           4
	//  133  330:ldc2            #385 <String "background-position">
	//  134  333:invokeinterface #145 <Method Object Map.get(Object)>
	//  135  338:checkcast       #50  <Class String>
	//  136  341:invokevirtual   #328 <Method StringBuilder StringBuilder.append(String)>
	//  137  344:invokevirtual   #333 <Method String StringBuilder.toString()>
	//  138  347:invokevirtual   #388 <Method String String.concat(String)>
	//  139  350:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//  140  355:pop             
			} else
	//* 141  356:goto            54
			if(s1.contains("rgb(") || s1.contains("rgba(") || s1.contains("#") || WebColors.NAMES.containsKey(((Object) (s1.toLowerCase()))))
	//* 142  359:aload           5
	//* 143  361:ldc2            #286 <String "rgb(">
	//* 144  364:invokevirtual   #230 <Method boolean String.contains(CharSequence)>
	//* 145  367:ifne            406
	//* 146  370:aload           5
	//* 147  372:ldc2            #390 <String "rgba(">
	//* 148  375:invokevirtual   #230 <Method boolean String.contains(CharSequence)>
	//* 149  378:ifne            406
	//* 150  381:aload           5
	//* 151  383:ldc2            #288 <String "#">
	//* 152  386:invokevirtual   #230 <Method boolean String.contains(CharSequence)>
	//* 153  389:ifne            406
	//* 154  392:getstatic       #294 <Field WebColors WebColors.NAMES>
	//* 155  395:aload           5
	//* 156  397:invokevirtual   #297 <Method String String.toLowerCase()>
	//* 157  400:invokevirtual   #300 <Method boolean WebColors.containsKey(Object)>
	//* 158  403:ifeq            54
				((Map) (hashmap)).put("background-color", ((Object) (s1)));
	//  159  406:aload           4
	//  160  408:ldc2            #392 <String "background-color">
	//  161  411:aload           5
	//  162  413:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//  163  418:pop             
			i++;
		}
	//* 164  419:goto            54
		return ((Map) (hashmap));
	//  165  422:aload           4
	//  166  424:areturn         
	}

	public Map processFont(String s)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #264 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #360 <Method void HashMap()>
	//    3    7:astore          4
		String as1[] = s.split("\\s");
	//    4    9:aload_1         
	//    5   10:ldc2            #395 <String "\\s">
	//    6   13:invokevirtual   #308 <Method String[] String.split(String)>
	//    7   16:astore          5
		int i = 0;
	//    8   18:iconst_0        
	//    9   19:istore_2        
		while(i < as1.length) 
	//*  10   20:iload_2         
	//*  11   21:aload           5
	//*  12   23:arraylength     
	//*  13   24:icmpge          230
		{
			String s1 = as1[i];
	//   14   27:aload           5
	//   15   29:iload_2         
	//   16   30:aaload          
	//   17   31:astore_3        
			if(s1.equalsIgnoreCase("italic") || s1.equalsIgnoreCase("oblique"))
	//*  18   32:aload_3         
	//*  19   33:ldc2            #397 <String "italic">
	//*  20   36:invokevirtual   #369 <Method boolean String.equalsIgnoreCase(String)>
	//*  21   39:ifne            52
	//*  22   42:aload_3         
	//*  23   43:ldc2            #399 <String "oblique">
	//*  24   46:invokevirtual   #369 <Method boolean String.equalsIgnoreCase(String)>
	//*  25   49:ifeq            71
				((Map) (hashmap)).put("font-style", ((Object) (s1)));
	//   26   52:aload           4
	//   27   54:ldc2            #401 <String "font-style">
	//   28   57:aload_3         
	//   29   58:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//   30   63:pop             
			else
	//*  31   64:iload_2         
	//*  32   65:iconst_1        
	//*  33   66:iadd            
	//*  34   67:istore_2        
	//*  35   68:goto            20
			if(s1.equalsIgnoreCase("small-caps"))
	//*  36   71:aload_3         
	//*  37   72:ldc2            #403 <String "small-caps">
	//*  38   75:invokevirtual   #369 <Method boolean String.equalsIgnoreCase(String)>
	//*  39   78:ifeq            96
				((Map) (hashmap)).put("font-variant", ((Object) (s1)));
	//   40   81:aload           4
	//   41   83:ldc2            #405 <String "font-variant">
	//   42   86:aload_3         
	//   43   87:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//   44   92:pop             
			else
	//*  45   93:goto            64
			if(s1.equalsIgnoreCase("bold"))
	//*  46   96:aload_3         
	//*  47   97:ldc2            #407 <String "bold">
	//*  48  100:invokevirtual   #369 <Method boolean String.equalsIgnoreCase(String)>
	//*  49  103:ifeq            121
				((Map) (hashmap)).put("font-weight", ((Object) (s1)));
	//   50  106:aload           4
	//   51  108:ldc2            #409 <String "font-weight">
	//   52  111:aload_3         
	//   53  112:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//   54  117:pop             
			else
	//*  55  118:goto            64
			if(isMetricValue(s1) || isNumericValue(s1))
	//*  56  121:aload_0         
	//*  57  122:aload_3         
	//*  58  123:invokevirtual   #149 <Method boolean isMetricValue(String)>
	//*  59  126:ifne            137
	//*  60  129:aload_0         
	//*  61  130:aload_3         
	//*  62  131:invokevirtual   #152 <Method boolean isNumericValue(String)>
	//*  63  134:ifeq            64
			{
				s = s1;
	//   64  137:aload_3         
	//   65  138:astore_1        
				if(s1.contains("/"))
	//*  66  139:aload_3         
	//*  67  140:ldc2            #411 <String "/">
	//*  68  143:invokevirtual   #230 <Method boolean String.contains(CharSequence)>
	//*  69  146:ifeq            175
				{
					String as[] = s1.split("/");
	//   70  149:aload_3         
	//   71  150:ldc2            #411 <String "/">
	//   72  153:invokevirtual   #308 <Method String[] String.split(String)>
	//   73  156:astore_3        
					s = as[0];
	//   74  157:aload_3         
	//   75  158:iconst_0        
	//   76  159:aaload          
	//   77  160:astore_1        
					((Map) (hashmap)).put("line-height", ((Object) (as[1])));
	//   78  161:aload           4
	//   79  163:ldc2            #413 <String "line-height">
	//   80  166:aload_3         
	//   81  167:iconst_1        
	//   82  168:aaload          
	//   83  169:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//   84  174:pop             
				}
				((Map) (hashmap)).put("font-size", ((Object) (s)));
	//   85  175:aload           4
	//   86  177:ldc2            #415 <String "font-size">
	//   87  180:aload_1         
	//   88  181:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//   89  186:pop             
				if(i != as1.length - 1)
	//*  90  187:iload_2         
	//*  91  188:aload           5
	//*  92  190:arraylength     
	//*  93  191:iconst_1        
	//*  94  192:isub            
	//*  95  193:icmpeq          64
					((Map) (hashmap)).put("font-family", ((Object) (as1[i + 1].replaceAll("\"", "").replaceAll("'", ""))));
	//   96  196:aload           4
	//   97  198:ldc2            #417 <String "font-family">
	//   98  201:aload           5
	//   99  203:iload_2         
	//  100  204:iconst_1        
	//  101  205:iadd            
	//  102  206:aaload          
	//  103  207:ldc1            #213 <String "\"">
	//  104  209:ldc1            #191 <String "">
	//  105  211:invokevirtual   #421 <Method String String.replaceAll(String, String)>
	//  106  214:ldc1            #199 <String "'">
	//  107  216:ldc1            #191 <String "">
	//  108  218:invokevirtual   #421 <Method String String.replaceAll(String, String)>
	//  109  221:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//  110  226:pop             
			}
			i++;
		}
	//* 111  227:goto            64
		return ((Map) (hashmap));
	//  112  230:aload           4
	//  113  232:areturn         
	}

	public Map processListStyle(String s)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #264 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #360 <Method void HashMap()>
	//    3    7:astore          4
		s = ((String) (splitComplexCssStyle(s)));
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:invokevirtual   #271 <Method String[] splitComplexCssStyle(String)>
	//    7   14:astore_1        
		int j = s.length;
	//    8   15:aload_1         
	//    9   16:arraylength     
	//   10   17:istore_3        
		int i = 0;
	//   11   18:iconst_0        
	//   12   19:istore_2        
		while(i < j) 
	//*  13   20:iload_2         
	//*  14   21:iload_3         
	//*  15   22:icmpge          236
		{
			String s1 = ((String) (s[i]));
	//   16   25:aload_1         
	//   17   26:iload_2         
	//   18   27:aaload          
	//   19   28:astore          5
			if(s1.equalsIgnoreCase("disc") || s1.equalsIgnoreCase("square") || s1.equalsIgnoreCase("circle") || s1.equalsIgnoreCase("lower-roman") || s1.equalsIgnoreCase("upper-roman") || s1.equalsIgnoreCase("lower-greek") || s1.equalsIgnoreCase("upper-greek") || s1.equalsIgnoreCase("lower-alpha") || s1.equalsIgnoreCase("upper-alpha") || s1.equalsIgnoreCase("lower-latin") || s1.equalsIgnoreCase("upper-latin"))
	//*  20   30:aload           5
	//*  21   32:ldc2            #424 <String "disc">
	//*  22   35:invokevirtual   #369 <Method boolean String.equalsIgnoreCase(String)>
	//*  23   38:ifne            151
	//*  24   41:aload           5
	//*  25   43:ldc2            #426 <String "square">
	//*  26   46:invokevirtual   #369 <Method boolean String.equalsIgnoreCase(String)>
	//*  27   49:ifne            151
	//*  28   52:aload           5
	//*  29   54:ldc2            #428 <String "circle">
	//*  30   57:invokevirtual   #369 <Method boolean String.equalsIgnoreCase(String)>
	//*  31   60:ifne            151
	//*  32   63:aload           5
	//*  33   65:ldc2            #430 <String "lower-roman">
	//*  34   68:invokevirtual   #369 <Method boolean String.equalsIgnoreCase(String)>
	//*  35   71:ifne            151
	//*  36   74:aload           5
	//*  37   76:ldc2            #432 <String "upper-roman">
	//*  38   79:invokevirtual   #369 <Method boolean String.equalsIgnoreCase(String)>
	//*  39   82:ifne            151
	//*  40   85:aload           5
	//*  41   87:ldc2            #434 <String "lower-greek">
	//*  42   90:invokevirtual   #369 <Method boolean String.equalsIgnoreCase(String)>
	//*  43   93:ifne            151
	//*  44   96:aload           5
	//*  45   98:ldc2            #436 <String "upper-greek">
	//*  46  101:invokevirtual   #369 <Method boolean String.equalsIgnoreCase(String)>
	//*  47  104:ifne            151
	//*  48  107:aload           5
	//*  49  109:ldc2            #438 <String "lower-alpha">
	//*  50  112:invokevirtual   #369 <Method boolean String.equalsIgnoreCase(String)>
	//*  51  115:ifne            151
	//*  52  118:aload           5
	//*  53  120:ldc2            #440 <String "upper-alpha">
	//*  54  123:invokevirtual   #369 <Method boolean String.equalsIgnoreCase(String)>
	//*  55  126:ifne            151
	//*  56  129:aload           5
	//*  57  131:ldc2            #442 <String "lower-latin">
	//*  58  134:invokevirtual   #369 <Method boolean String.equalsIgnoreCase(String)>
	//*  59  137:ifne            151
	//*  60  140:aload           5
	//*  61  142:ldc2            #444 <String "upper-latin">
	//*  62  145:invokevirtual   #369 <Method boolean String.equalsIgnoreCase(String)>
	//*  63  148:ifeq            171
				((Map) (hashmap)).put("list-style-type", ((Object) (s1)));
	//   64  151:aload           4
	//   65  153:ldc2            #446 <String "list-style-type">
	//   66  156:aload           5
	//   67  158:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//   68  163:pop             
			else
	//*  69  164:iload_2         
	//*  70  165:iconst_1        
	//*  71  166:iadd            
	//*  72  167:istore_2        
	//*  73  168:goto            20
			if(s1.equalsIgnoreCase("inside") || s1.equalsIgnoreCase("outside"))
	//*  74  171:aload           5
	//*  75  173:ldc2            #448 <String "inside">
	//*  76  176:invokevirtual   #369 <Method boolean String.equalsIgnoreCase(String)>
	//*  77  179:ifne            193
	//*  78  182:aload           5
	//*  79  184:ldc2            #450 <String "outside">
	//*  80  187:invokevirtual   #369 <Method boolean String.equalsIgnoreCase(String)>
	//*  81  190:ifeq            209
				((Map) (hashmap)).put("list-style-position", ((Object) (s1)));
	//   82  193:aload           4
	//   83  195:ldc2            #452 <String "list-style-position">
	//   84  198:aload           5
	//   85  200:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//   86  205:pop             
			else
	//*  87  206:goto            164
			if(s1.contains("url("))
	//*  88  209:aload           5
	//*  89  211:ldc2            #362 <String "url(">
	//*  90  214:invokevirtual   #230 <Method boolean String.contains(CharSequence)>
	//*  91  217:ifeq            164
				((Map) (hashmap)).put("list-style-image", ((Object) (s1)));
	//   92  220:aload           4
	//   93  222:ldc2            #454 <String "list-style-image">
	//   94  225:aload           5
	//   95  227:invokeinterface #321 <Method Object Map.put(Object, Object)>
	//   96  232:pop             
			i++;
		}
	//*  97  233:goto            164
		return ((Map) (hashmap));
	//   98  236:aload           4
	//   99  238:areturn         
	}

	public String[] splitComplexCssStyle(String s)
	{
		return s.replaceAll("\\s*,\\s*", ",").split("\\s");
	//    0    0:aload_1         
	//    1    1:ldc2            #456 <String "\\s*,\\s*">
	//    2    4:ldc2            #458 <String ",">
	//    3    7:invokevirtual   #421 <Method String String.replaceAll(String, String)>
	//    4   10:ldc2            #395 <String "\\s">
	//    5   13:invokevirtual   #308 <Method String[] String.split(String)>
	//    6   16:areturn         
	}

	public String stripDoubleSpacesAndTrim(String s)
	{
		char ac[] = s.toCharArray();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #463 <Method char[] String.toCharArray()>
	//    2    4:astore          4
		if(s.contains("  "))
	//*   3    6:aload_1         
	//*   4    7:ldc2            #465 <String "  ">
	//*   5   10:invokevirtual   #230 <Method boolean String.contains(CharSequence)>
	//*   6   13:ifeq            95
		{
			s = ((String) (new StringBuilder()));
	//    7   16:new             #323 <Class StringBuilder>
	//    8   19:dup             
	//    9   20:invokespecial   #324 <Method void StringBuilder()>
	//   10   23:astore_1        
			int i = 0;
	//   11   24:iconst_0        
	//   12   25:istore_3        
			while(i < ac.length) 
	//*  13   26:iload_3         
	//*  14   27:aload           4
	//*  15   29:arraylength     
	//*  16   30:icmpge          87
			{
				char c = ac[i];
	//   17   33:aload           4
	//   18   35:iload_3         
	//   19   36:caload          
	//   20   37:istore_2        
				if(c != ' ')
	//*  21   38:iload_2         
	//*  22   39:bipush          32
	//*  23   41:icmpeq          57
					((StringBuilder) (s)).append(c);
	//   24   44:aload_1         
	//   25   45:iload_2         
	//   26   46:invokevirtual   #468 <Method StringBuilder StringBuilder.append(char)>
	//   27   49:pop             
				else
	//*  28   50:iload_3         
	//*  29   51:iconst_1        
	//*  30   52:iadd            
	//*  31   53:istore_3        
	//*  32   54:goto            26
				if(i + 1 < ac.length && ac[i + 1] != ' ')
	//*  33   57:iload_3         
	//*  34   58:iconst_1        
	//*  35   59:iadd            
	//*  36   60:aload           4
	//*  37   62:arraylength     
	//*  38   63:icmpge          50
	//*  39   66:aload           4
	//*  40   68:iload_3         
	//*  41   69:iconst_1        
	//*  42   70:iadd            
	//*  43   71:caload          
	//*  44   72:bipush          32
	//*  45   74:icmpeq          50
					((StringBuilder) (s)).append(' ');
	//   46   77:aload_1         
	//   47   78:bipush          32
	//   48   80:invokevirtual   #468 <Method StringBuilder StringBuilder.append(char)>
	//   49   83:pop             
				i++;
			}
	//*  50   84:goto            50
			return ((StringBuilder) (s)).toString().trim();
	//   51   87:aload_1         
	//   52   88:invokevirtual   #333 <Method String StringBuilder.toString()>
	//   53   91:invokevirtual   #187 <Method String String.trim()>
	//   54   94:areturn         
		} else
		{
			return String.valueOf(ac).trim();
	//   55   95:aload           4
	//   56   97:invokestatic    #471 <Method String String.valueOf(char[])>
	//   57  100:invokevirtual   #187 <Method String String.trim()>
	//   58  103:areturn         
		}
	}

	public String stripDoubleSpacesTrimAndToLowerCase(String s)
	{
		return stripDoubleSpacesAndTrim(s).toLowerCase();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #474 <Method String stripDoubleSpacesAndTrim(String)>
	//    3    5:invokevirtual   #297 <Method String String.toLowerCase()>
	//    4    8:areturn         
	}

	public String trimAndRemoveQuoutes(String s)
	{
label0:
		{
			String s1 = s.trim();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #187 <Method String String.trim()>
	//    2    4:astore_2        
			if(!s1.startsWith("\"") && !s1.startsWith("'") || !s1.endsWith("\""))
	//*   3    5:aload_2         
	//*   4    6:ldc1            #213 <String "\"">
	//*   5    8:invokevirtual   #179 <Method boolean String.startsWith(String)>
	//*   6   11:ifne            23
	//*   7   14:aload_2         
	//*   8   15:ldc1            #199 <String "'">
	//*   9   17:invokevirtual   #179 <Method boolean String.startsWith(String)>
	//*  10   20:ifeq            32
	//*  11   23:aload_2         
	//*  12   24:ldc1            #213 <String "\"">
	//*  13   26:invokevirtual   #202 <Method boolean String.endsWith(String)>
	//*  14   29:ifne            43
			{
				s = s1;
	//   15   32:aload_2         
	//   16   33:astore_1        
				if(!s1.endsWith("'"))
					break label0;
	//   17   34:aload_2         
	//   18   35:ldc1            #199 <String "'">
	//   19   37:invokevirtual   #202 <Method boolean String.endsWith(String)>
	//   20   40:ifeq            55
			}
			s = s1.substring(1, s1.length() - 1);
	//   21   43:aload_2         
	//   22   44:iconst_1        
	//   23   45:aload_2         
	//   24   46:invokevirtual   #168 <Method int String.length()>
	//   25   49:iconst_1        
	//   26   50:isub            
	//   27   51:invokevirtual   #211 <Method String String.substring(int, int)>
	//   28   54:astore_1        
		}
		return s;
	//   29   55:aload_1         
	//   30   56:areturn         
	}

	public float validateTextHeight(Map map, float f)
	{
		float f1;
		if(map.get("min-height") != null && f < (new CssUtils()).parsePxInCmMmPcToPt((String)map.get("min-height")))
	//*   0    0:aload_1         
	//*   1    1:ldc2            #479 <String "min-height">
	//*   2    4:invokeinterface #145 <Method Object Map.get(Object)>
	//*   3    9:ifnull          64
	//*   4   12:fload_2         
	//*   5   13:new             #2   <Class CssUtils>
	//*   6   16:dup             
	//*   7   17:invokespecial   #44  <Method void CssUtils()>
	//*   8   20:aload_1         
	//*   9   21:ldc2            #479 <String "min-height">
	//*  10   24:invokeinterface #145 <Method Object Map.get(Object)>
	//*  11   29:checkcast       #50  <Class String>
	//*  12   32:invokevirtual   #156 <Method float parsePxInCmMmPcToPt(String)>
	//*  13   35:fcmpg           
	//*  14   36:ifge            64
		{
			f1 = (new CssUtils()).parsePxInCmMmPcToPt((String)map.get("min-height"));
	//   15   39:new             #2   <Class CssUtils>
	//   16   42:dup             
	//   17   43:invokespecial   #44  <Method void CssUtils()>
	//   18   46:aload_1         
	//   19   47:ldc2            #479 <String "min-height">
	//   20   50:invokeinterface #145 <Method Object Map.get(Object)>
	//   21   55:checkcast       #50  <Class String>
	//   22   58:invokevirtual   #156 <Method float parsePxInCmMmPcToPt(String)>
	//   23   61:fstore_3        
		} else
	//*  24   62:fload_3         
	//*  25   63:freturn         
		{
			f1 = f;
	//   26   64:fload_2         
	//   27   65:fstore_3        
			if(map.get("max-height") != null)
	//*  28   66:aload_1         
	//*  29   67:ldc2            #481 <String "max-height">
	//*  30   70:invokeinterface #145 <Method Object Map.get(Object)>
	//*  31   75:ifnull          62
			{
				f1 = f;
	//   32   78:fload_2         
	//   33   79:fstore_3        
				if(f > (new CssUtils()).parsePxInCmMmPcToPt((String)map.get("max-height")))
	//*  34   80:fload_2         
	//*  35   81:new             #2   <Class CssUtils>
	//*  36   84:dup             
	//*  37   85:invokespecial   #44  <Method void CssUtils()>
	//*  38   88:aload_1         
	//*  39   89:ldc2            #481 <String "max-height">
	//*  40   92:invokeinterface #145 <Method Object Map.get(Object)>
	//*  41   97:checkcast       #50  <Class String>
	//*  42  100:invokevirtual   #156 <Method float parsePxInCmMmPcToPt(String)>
	//*  43  103:fcmpl           
	//*  44  104:ifle            62
					return (new CssUtils()).parsePxInCmMmPcToPt((String)map.get("max-height"));
	//   45  107:new             #2   <Class CssUtils>
	//   46  110:dup             
	//   47  111:invokespecial   #44  <Method void CssUtils()>
	//   48  114:aload_1         
	//   49  115:ldc2            #481 <String "max-height">
	//   50  118:invokeinterface #145 <Method Object Map.get(Object)>
	//   51  123:checkcast       #50  <Class String>
	//   52  126:invokevirtual   #156 <Method float parsePxInCmMmPcToPt(String)>
	//   53  129:freturn         
			}
		}
		return f1;
	}

	private static final String BORDER2 = "border-";
	private static final String COLOR = "-color";
	public static final int DEFAULT_FONT_SIZE_PT = 12;
	private static final String STYLE = "-style";
	private static final String WIDTH = "-width";
	private static final String _0_BOTTOM_1 = "{0}bottom{1}";
	private static final String _0_LEFT_1 = "{0}left{1}";
	private static final String _0_RIGHT_1 = "{0}right{1}";
	private static final String _0_TOP_1 = "{0}top{1}";
	private static final Set backgroundPositions = new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
		"left", "center", "bottom", "top", "right"
	}))))));
	private static final Set borderstyle = new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
		"none", "hidden", "dotted", "dashed", "solid", "double", "groove", "ridge", "inset", "outset"
	}))))));
	private static final Set borderwidth = new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
		"thin", "medium", "thick"
	}))))));
	private static CssUtils instance = new CssUtils();

	static 
	{
	//    0    0:new             #2   <Class CssUtils>
	//    1    3:dup             
	//    2    4:invokespecial   #44  <Method void CssUtils()>
	//    3    7:putstatic       #46  <Field CssUtils instance>
	//    4   10:new             #48  <Class HashSet>
	//    5   13:dup             
	//    6   14:iconst_3        
	//    7   15:anewarray       String[]
	//    8   18:dup             
	//    9   19:iconst_0        
	//   10   20:ldc1            #52  <String "thin">
	//   11   22:aastore         
	//   12   23:dup             
	//   13   24:iconst_1        
	//   14   25:ldc1            #54  <String "medium">
	//   15   27:aastore         
	//   16   28:dup             
	//   17   29:iconst_2        
	//   18   30:ldc1            #56  <String "thick">
	//   19   32:aastore         
	//   20   33:invokestatic    #62  <Method java.util.List Arrays.asList(Object[])>
	//   21   36:invokespecial   #65  <Method void HashSet(java.util.Collection)>
	//   22   39:putstatic       #67  <Field Set borderwidth>
	//   23   42:new             #48  <Class HashSet>
	//   24   45:dup             
	//   25   46:bipush          10
	//   26   48:anewarray       String[]
	//   27   51:dup             
	//   28   52:iconst_0        
	//   29   53:ldc1            #69  <String "none">
	//   30   55:aastore         
	//   31   56:dup             
	//   32   57:iconst_1        
	//   33   58:ldc1            #71  <String "hidden">
	//   34   60:aastore         
	//   35   61:dup             
	//   36   62:iconst_2        
	//   37   63:ldc1            #73  <String "dotted">
	//   38   65:aastore         
	//   39   66:dup             
	//   40   67:iconst_3        
	//   41   68:ldc1            #75  <String "dashed">
	//   42   70:aastore         
	//   43   71:dup             
	//   44   72:iconst_4        
	//   45   73:ldc1            #77  <String "solid">
	//   46   75:aastore         
	//   47   76:dup             
	//   48   77:iconst_5        
	//   49   78:ldc1            #79  <String "double">
	//   50   80:aastore         
	//   51   81:dup             
	//   52   82:bipush          6
	//   53   84:ldc1            #81  <String "groove">
	//   54   86:aastore         
	//   55   87:dup             
	//   56   88:bipush          7
	//   57   90:ldc1            #83  <String "ridge">
	//   58   92:aastore         
	//   59   93:dup             
	//   60   94:bipush          8
	//   61   96:ldc1            #85  <String "inset">
	//   62   98:aastore         
	//   63   99:dup             
	//   64  100:bipush          9
	//   65  102:ldc1            #87  <String "outset">
	//   66  104:aastore         
	//   67  105:invokestatic    #62  <Method java.util.List Arrays.asList(Object[])>
	//   68  108:invokespecial   #65  <Method void HashSet(java.util.Collection)>
	//   69  111:putstatic       #89  <Field Set borderstyle>
	//   70  114:new             #48  <Class HashSet>
	//   71  117:dup             
	//   72  118:iconst_5        
	//   73  119:anewarray       String[]
	//   74  122:dup             
	//   75  123:iconst_0        
	//   76  124:ldc1            #91  <String "left">
	//   77  126:aastore         
	//   78  127:dup             
	//   79  128:iconst_1        
	//   80  129:ldc1            #93  <String "center">
	//   81  131:aastore         
	//   82  132:dup             
	//   83  133:iconst_2        
	//   84  134:ldc1            #95  <String "bottom">
	//   85  136:aastore         
	//   86  137:dup             
	//   87  138:iconst_3        
	//   88  139:ldc1            #97  <String "top">
	//   89  141:aastore         
	//   90  142:dup             
	//   91  143:iconst_4        
	//   92  144:ldc1            #99  <String "right">
	//   93  146:aastore         
	//   94  147:invokestatic    #62  <Method java.util.List Arrays.asList(Object[])>
	//   95  150:invokespecial   #65  <Method void HashSet(java.util.Collection)>
	//   96  153:putstatic       #101 <Field Set backgroundPositions>
	//*  97  156:return          
	}
}
