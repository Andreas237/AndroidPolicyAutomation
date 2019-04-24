// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.exoplayer2.util:
//			Assertions, Util

public final class ColorParser
{

	private ColorParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #473 <Method void Object()>
	//    2    4:return          
	}

	private static int argb(int i, int j, int k, int l)
	{
		return i << 24 | j << 16 | k << 8 | l;
	//    0    0:iload_0         
	//    1    1:bipush          24
	//    2    3:ishl            
	//    3    4:iload_1         
	//    4    5:bipush          16
	//    5    7:ishl            
	//    6    8:ior             
	//    7    9:iload_2         
	//    8   10:bipush          8
	//    9   12:ishl            
	//   10   13:ior             
	//   11   14:iload_3         
	//   12   15:ior             
	//   13   16:ireturn         
	}

	private static int parseColorInternal(String s, boolean flag)
	{
		Assertions.checkArgument(TextUtils.isEmpty(((CharSequence) (s))) ^ true);
	//    0    0:aload_0         
	//    1    1:invokestatic    #483 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:invokestatic    #489 <Method void Assertions.checkArgument(boolean)>
		String s1 = s.replace(" ", "");
	//    5    9:aload_0         
	//    6   10:ldc2            #491 <String " ">
	//    7   13:ldc2            #493 <String "">
	//    8   16:invokevirtual   #499 <Method String String.replace(CharSequence, CharSequence)>
	//    9   19:astore_3        
		if(s1.charAt(0) == '#')
	//*  10   20:aload_3         
	//*  11   21:iconst_0        
	//*  12   22:invokevirtual   #503 <Method char String.charAt(int)>
	//*  13   25:bipush          35
	//*  14   27:icmpne          87
		{
			int i = (int)Long.parseLong(s1.substring(1), 16);
	//   15   30:aload_3         
	//   16   31:iconst_1        
	//   17   32:invokevirtual   #507 <Method String String.substring(int)>
	//   18   35:bipush          16
	//   19   37:invokestatic    #513 <Method long Long.parseLong(String, int)>
	//   20   40:l2i             
	//   21   41:istore_2        
			if(s1.length() == 7)
	//*  22   42:aload_3         
	//*  23   43:invokevirtual   #517 <Method int String.length()>
	//*  24   46:bipush          7
	//*  25   48:icmpne          56
				return 0xff000000 | i;
	//   26   51:ldc1            #80  <Int 0xff000000>
	//   27   53:iload_2         
	//   28   54:ior             
	//   29   55:ireturn         
			if(s1.length() == 9)
	//*  30   56:aload_3         
	//*  31   57:invokevirtual   #517 <Method int String.length()>
	//*  32   60:bipush          9
	//*  33   62:icmpne          79
				return (i & 0xff) << 24 | i >>> 8;
	//   34   65:iload_2         
	//   35   66:sipush          255
	//   36   69:iand            
	//   37   70:bipush          24
	//   38   72:ishl            
	//   39   73:iload_2         
	//   40   74:bipush          8
	//   41   76:iushr           
	//   42   77:ior             
	//   43   78:ireturn         
			else
				throw new IllegalArgumentException();
	//   44   79:new             #519 <Class IllegalArgumentException>
	//   45   82:dup             
	//   46   83:invokespecial   #520 <Method void IllegalArgumentException()>
	//   47   86:athrow          
		}
		if(s1.startsWith("rgba"))
	//*  48   87:aload_3         
	//*  49   88:ldc1            #14  <String "rgba">
	//*  50   90:invokevirtual   #524 <Method boolean String.startsWith(String)>
	//*  51   93:ifeq            191
		{
			if(flag)
	//*  52   96:iload_1         
	//*  53   97:ifeq            107
				s = ((String) (RGBA_PATTERN_FLOAT_ALPHA));
	//   54  100:getstatic       #38  <Field Pattern RGBA_PATTERN_FLOAT_ALPHA>
	//   55  103:astore_0        
			else
	//*  56  104:goto            111
				s = ((String) (RGBA_PATTERN_INT_ALPHA));
	//   57  107:getstatic       #34  <Field Pattern RGBA_PATTERN_INT_ALPHA>
	//   58  110:astore_0        
			s = ((String) (((Pattern) (s)).matcher(((CharSequence) (s1)))));
	//   59  111:aload_0         
	//   60  112:aload_3         
	//   61  113:invokevirtual   #528 <Method Matcher Pattern.matcher(CharSequence)>
	//   62  116:astore_0        
			if(((Matcher) (s)).matches())
	//*  63  117:aload_0         
	//*  64  118:invokevirtual   #534 <Method boolean Matcher.matches()>
	//*  65  121:ifeq            274
			{
				int j;
				if(flag)
	//*  66  124:iload_1         
	//*  67  125:ifeq            145
					j = (int)(255F * Float.parseFloat(((Matcher) (s)).group(4)));
	//   68  128:ldc2            #535 <Float 255F>
	//   69  131:aload_0         
	//   70  132:iconst_4        
	//   71  133:invokevirtual   #538 <Method String Matcher.group(int)>
	//   72  136:invokestatic    #544 <Method float Float.parseFloat(String)>
	//   73  139:fmul            
	//   74  140:f2i             
	//   75  141:istore_2        
				else
	//*  76  142:goto            156
					j = Integer.parseInt(((Matcher) (s)).group(4), 10);
	//   77  145:aload_0         
	//   78  146:iconst_4        
	//   79  147:invokevirtual   #538 <Method String Matcher.group(int)>
	//   80  150:bipush          10
	//   81  152:invokestatic    #548 <Method int Integer.parseInt(String, int)>
	//   82  155:istore_2        
				return argb(j, Integer.parseInt(((Matcher) (s)).group(1), 10), Integer.parseInt(((Matcher) (s)).group(2), 10), Integer.parseInt(((Matcher) (s)).group(3), 10));
	//   83  156:iload_2         
	//   84  157:aload_0         
	//   85  158:iconst_1        
	//   86  159:invokevirtual   #538 <Method String Matcher.group(int)>
	//   87  162:bipush          10
	//   88  164:invokestatic    #548 <Method int Integer.parseInt(String, int)>
	//   89  167:aload_0         
	//   90  168:iconst_2        
	//   91  169:invokevirtual   #538 <Method String Matcher.group(int)>
	//   92  172:bipush          10
	//   93  174:invokestatic    #548 <Method int Integer.parseInt(String, int)>
	//   94  177:aload_0         
	//   95  178:iconst_3        
	//   96  179:invokevirtual   #538 <Method String Matcher.group(int)>
	//   97  182:bipush          10
	//   98  184:invokestatic    #548 <Method int Integer.parseInt(String, int)>
	//   99  187:invokestatic    #550 <Method int argb(int, int, int, int)>
	//  100  190:ireturn         
			}
		} else
		if(s1.startsWith("rgb"))
	//* 101  191:aload_3         
	//* 102  192:ldc1            #11  <String "rgb">
	//* 103  194:invokevirtual   #524 <Method boolean String.startsWith(String)>
	//* 104  197:ifeq            249
		{
			s = ((String) (RGB_PATTERN.matcher(((CharSequence) (s1)))));
	//  105  200:getstatic       #30  <Field Pattern RGB_PATTERN>
	//  106  203:aload_3         
	//  107  204:invokevirtual   #528 <Method Matcher Pattern.matcher(CharSequence)>
	//  108  207:astore_0        
			if(((Matcher) (s)).matches())
	//* 109  208:aload_0         
	//* 110  209:invokevirtual   #534 <Method boolean Matcher.matches()>
	//* 111  212:ifeq            274
				return rgb(Integer.parseInt(((Matcher) (s)).group(1), 10), Integer.parseInt(((Matcher) (s)).group(2), 10), Integer.parseInt(((Matcher) (s)).group(3), 10));
	//  112  215:aload_0         
	//  113  216:iconst_1        
	//  114  217:invokevirtual   #538 <Method String Matcher.group(int)>
	//  115  220:bipush          10
	//  116  222:invokestatic    #548 <Method int Integer.parseInt(String, int)>
	//  117  225:aload_0         
	//  118  226:iconst_2        
	//  119  227:invokevirtual   #538 <Method String Matcher.group(int)>
	//  120  230:bipush          10
	//  121  232:invokestatic    #548 <Method int Integer.parseInt(String, int)>
	//  122  235:aload_0         
	//  123  236:iconst_3        
	//  124  237:invokevirtual   #538 <Method String Matcher.group(int)>
	//  125  240:bipush          10
	//  126  242:invokestatic    #548 <Method int Integer.parseInt(String, int)>
	//  127  245:invokestatic    #553 <Method int rgb(int, int, int)>
	//  128  248:ireturn         
		} else
		{
			s = ((String) ((Integer)COLOR_MAP.get(((Object) (Util.toLowerInvariant(s1))))));
	//  129  249:getstatic       #45  <Field Map COLOR_MAP>
	//  130  252:aload_3         
	//  131  253:invokestatic    #559 <Method String Util.toLowerInvariant(String)>
	//  132  256:invokeinterface #563 <Method Object Map.get(Object)>
	//  133  261:checkcast       #50  <Class Integer>
	//  134  264:astore_0        
			if(s != null)
	//* 135  265:aload_0         
	//* 136  266:ifnull          274
				return ((Integer) (s)).intValue();
	//  137  269:aload_0         
	//  138  270:invokevirtual   #566 <Method int Integer.intValue()>
	//  139  273:ireturn         
		}
		throw new IllegalArgumentException();
	//  140  274:new             #519 <Class IllegalArgumentException>
	//  141  277:dup             
	//  142  278:invokespecial   #520 <Method void IllegalArgumentException()>
	//  143  281:athrow          
	}

	public static int parseCssColor(String s)
	{
		return parseColorInternal(s, true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #570 <Method int parseColorInternal(String, boolean)>
	//    3    5:ireturn         
	}

	public static int parseTtmlColor(String s)
	{
		return parseColorInternal(s, false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #570 <Method int parseColorInternal(String, boolean)>
	//    3    5:ireturn         
	}

	private static int rgb(int i, int j, int k)
	{
		return argb(255, i, j, k);
	//    0    0:sipush          255
	//    1    3:iload_0         
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #550 <Method int argb(int, int, int, int)>
	//    5    9:ireturn         
	}

	private static final Map COLOR_MAP;
	private static final String RGB = "rgb";
	private static final String RGBA = "rgba";
	private static final Pattern RGBA_PATTERN_FLOAT_ALPHA = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
	private static final Pattern RGBA_PATTERN_INT_ALPHA = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
	private static final Pattern RGB_PATTERN = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

	static 
	{
	//    0    0:ldc1            #22  <String "^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$">
	//    1    2:invokestatic    #28  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #30  <Field Pattern RGB_PATTERN>
	//    3    8:ldc1            #32  <String "^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$">
	//    4   10:invokestatic    #28  <Method Pattern Pattern.compile(String)>
	//    5   13:putstatic       #34  <Field Pattern RGBA_PATTERN_INT_ALPHA>
	//    6   16:ldc1            #36  <String "^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$">
	//    7   18:invokestatic    #28  <Method Pattern Pattern.compile(String)>
	//    8   21:putstatic       #38  <Field Pattern RGBA_PATTERN_FLOAT_ALPHA>
		COLOR_MAP = ((Map) (new HashMap()));
	//    9   24:new             #40  <Class HashMap>
	//   10   27:dup             
	//   11   28:invokespecial   #43  <Method void HashMap()>
	//   12   31:putstatic       #45  <Field Map COLOR_MAP>
		COLOR_MAP.put("aliceblue", ((Object) (Integer.valueOf(0xfff0f8ff))));
	//   13   34:getstatic       #45  <Field Map COLOR_MAP>
	//   14   37:ldc1            #47  <String "aliceblue">
	//   15   39:ldc1            #48  <Int 0xfff0f8ff>
	//   16   41:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//   17   44:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//   18   49:pop             
		COLOR_MAP.put("antiquewhite", ((Object) (Integer.valueOf(0xfffaebd7))));
	//   19   50:getstatic       #45  <Field Map COLOR_MAP>
	//   20   53:ldc1            #62  <String "antiquewhite">
	//   21   55:ldc1            #63  <Int 0xfffaebd7>
	//   22   57:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//   23   60:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//   24   65:pop             
		COLOR_MAP.put("aqua", ((Object) (Integer.valueOf(0xff00ffff))));
	//   25   66:getstatic       #45  <Field Map COLOR_MAP>
	//   26   69:ldc1            #65  <String "aqua">
	//   27   71:ldc1            #66  <Int 0xff00ffff>
	//   28   73:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//   29   76:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//   30   81:pop             
		COLOR_MAP.put("aquamarine", ((Object) (Integer.valueOf(0xff7fffd4))));
	//   31   82:getstatic       #45  <Field Map COLOR_MAP>
	//   32   85:ldc1            #68  <String "aquamarine">
	//   33   87:ldc1            #69  <Int 0xff7fffd4>
	//   34   89:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//   35   92:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//   36   97:pop             
		COLOR_MAP.put("azure", ((Object) (Integer.valueOf(0xfff0ffff))));
	//   37   98:getstatic       #45  <Field Map COLOR_MAP>
	//   38  101:ldc1            #71  <String "azure">
	//   39  103:ldc1            #72  <Int 0xfff0ffff>
	//   40  105:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//   41  108:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//   42  113:pop             
		COLOR_MAP.put("beige", ((Object) (Integer.valueOf(0xfff5f5dc))));
	//   43  114:getstatic       #45  <Field Map COLOR_MAP>
	//   44  117:ldc1            #74  <String "beige">
	//   45  119:ldc1            #75  <Int 0xfff5f5dc>
	//   46  121:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//   47  124:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//   48  129:pop             
		COLOR_MAP.put("bisque", ((Object) (Integer.valueOf(-6972))));
	//   49  130:getstatic       #45  <Field Map COLOR_MAP>
	//   50  133:ldc1            #77  <String "bisque">
	//   51  135:sipush          -6972
	//   52  138:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//   53  141:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//   54  146:pop             
		COLOR_MAP.put("black", ((Object) (Integer.valueOf(0xff000000))));
	//   55  147:getstatic       #45  <Field Map COLOR_MAP>
	//   56  150:ldc1            #79  <String "black">
	//   57  152:ldc1            #80  <Int 0xff000000>
	//   58  154:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//   59  157:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//   60  162:pop             
		COLOR_MAP.put("blanchedalmond", ((Object) (Integer.valueOf(-5171))));
	//   61  163:getstatic       #45  <Field Map COLOR_MAP>
	//   62  166:ldc1            #82  <String "blanchedalmond">
	//   63  168:sipush          -5171
	//   64  171:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//   65  174:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//   66  179:pop             
		COLOR_MAP.put("blue", ((Object) (Integer.valueOf(0xff0000ff))));
	//   67  180:getstatic       #45  <Field Map COLOR_MAP>
	//   68  183:ldc1            #84  <String "blue">
	//   69  185:ldc1            #85  <Int 0xff0000ff>
	//   70  187:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//   71  190:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//   72  195:pop             
		COLOR_MAP.put("blueviolet", ((Object) (Integer.valueOf(0xff8a2be2))));
	//   73  196:getstatic       #45  <Field Map COLOR_MAP>
	//   74  199:ldc1            #87  <String "blueviolet">
	//   75  201:ldc1            #88  <Int 0xff8a2be2>
	//   76  203:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//   77  206:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//   78  211:pop             
		COLOR_MAP.put("brown", ((Object) (Integer.valueOf(0xffa52a2a))));
	//   79  212:getstatic       #45  <Field Map COLOR_MAP>
	//   80  215:ldc1            #90  <String "brown">
	//   81  217:ldc1            #91  <Int 0xffa52a2a>
	//   82  219:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//   83  222:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//   84  227:pop             
		COLOR_MAP.put("burlywood", ((Object) (Integer.valueOf(0xffdeb887))));
	//   85  228:getstatic       #45  <Field Map COLOR_MAP>
	//   86  231:ldc1            #93  <String "burlywood">
	//   87  233:ldc1            #94  <Int 0xffdeb887>
	//   88  235:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//   89  238:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//   90  243:pop             
		COLOR_MAP.put("cadetblue", ((Object) (Integer.valueOf(0xff5f9ea0))));
	//   91  244:getstatic       #45  <Field Map COLOR_MAP>
	//   92  247:ldc1            #96  <String "cadetblue">
	//   93  249:ldc1            #97  <Int 0xff5f9ea0>
	//   94  251:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//   95  254:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//   96  259:pop             
		COLOR_MAP.put("chartreuse", ((Object) (Integer.valueOf(0xff7fff00))));
	//   97  260:getstatic       #45  <Field Map COLOR_MAP>
	//   98  263:ldc1            #99  <String "chartreuse">
	//   99  265:ldc1            #100 <Int 0xff7fff00>
	//  100  267:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  101  270:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  102  275:pop             
		COLOR_MAP.put("chocolate", ((Object) (Integer.valueOf(0xffd2691e))));
	//  103  276:getstatic       #45  <Field Map COLOR_MAP>
	//  104  279:ldc1            #102 <String "chocolate">
	//  105  281:ldc1            #103 <Int 0xffd2691e>
	//  106  283:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  107  286:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  108  291:pop             
		COLOR_MAP.put("coral", ((Object) (Integer.valueOf(-32944))));
	//  109  292:getstatic       #45  <Field Map COLOR_MAP>
	//  110  295:ldc1            #105 <String "coral">
	//  111  297:ldc1            #106 <Int -32944>
	//  112  299:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  113  302:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  114  307:pop             
		COLOR_MAP.put("cornflowerblue", ((Object) (Integer.valueOf(0xff6495ed))));
	//  115  308:getstatic       #45  <Field Map COLOR_MAP>
	//  116  311:ldc1            #108 <String "cornflowerblue">
	//  117  313:ldc1            #109 <Int 0xff6495ed>
	//  118  315:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  119  318:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  120  323:pop             
		COLOR_MAP.put("cornsilk", ((Object) (Integer.valueOf(-1828))));
	//  121  324:getstatic       #45  <Field Map COLOR_MAP>
	//  122  327:ldc1            #111 <String "cornsilk">
	//  123  329:sipush          -1828
	//  124  332:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  125  335:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  126  340:pop             
		COLOR_MAP.put("crimson", ((Object) (Integer.valueOf(0xffdc143c))));
	//  127  341:getstatic       #45  <Field Map COLOR_MAP>
	//  128  344:ldc1            #113 <String "crimson">
	//  129  346:ldc1            #114 <Int 0xffdc143c>
	//  130  348:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  131  351:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  132  356:pop             
		COLOR_MAP.put("cyan", ((Object) (Integer.valueOf(0xff00ffff))));
	//  133  357:getstatic       #45  <Field Map COLOR_MAP>
	//  134  360:ldc1            #116 <String "cyan">
	//  135  362:ldc1            #66  <Int 0xff00ffff>
	//  136  364:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  137  367:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  138  372:pop             
		COLOR_MAP.put("darkblue", ((Object) (Integer.valueOf(0xff00008b))));
	//  139  373:getstatic       #45  <Field Map COLOR_MAP>
	//  140  376:ldc1            #118 <String "darkblue">
	//  141  378:ldc1            #119 <Int 0xff00008b>
	//  142  380:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  143  383:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  144  388:pop             
		COLOR_MAP.put("darkcyan", ((Object) (Integer.valueOf(0xff008b8b))));
	//  145  389:getstatic       #45  <Field Map COLOR_MAP>
	//  146  392:ldc1            #121 <String "darkcyan">
	//  147  394:ldc1            #122 <Int 0xff008b8b>
	//  148  396:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  149  399:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  150  404:pop             
		COLOR_MAP.put("darkgoldenrod", ((Object) (Integer.valueOf(0xffb8860b))));
	//  151  405:getstatic       #45  <Field Map COLOR_MAP>
	//  152  408:ldc1            #124 <String "darkgoldenrod">
	//  153  410:ldc1            #125 <Int 0xffb8860b>
	//  154  412:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  155  415:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  156  420:pop             
		COLOR_MAP.put("darkgray", ((Object) (Integer.valueOf(0xffa9a9a9))));
	//  157  421:getstatic       #45  <Field Map COLOR_MAP>
	//  158  424:ldc1            #127 <String "darkgray">
	//  159  426:ldc1            #128 <Int 0xffa9a9a9>
	//  160  428:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  161  431:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  162  436:pop             
		COLOR_MAP.put("darkgreen", ((Object) (Integer.valueOf(0xff006400))));
	//  163  437:getstatic       #45  <Field Map COLOR_MAP>
	//  164  440:ldc1            #130 <String "darkgreen">
	//  165  442:ldc1            #131 <Int 0xff006400>
	//  166  444:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  167  447:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  168  452:pop             
		COLOR_MAP.put("darkgrey", ((Object) (Integer.valueOf(0xffa9a9a9))));
	//  169  453:getstatic       #45  <Field Map COLOR_MAP>
	//  170  456:ldc1            #133 <String "darkgrey">
	//  171  458:ldc1            #128 <Int 0xffa9a9a9>
	//  172  460:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  173  463:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  174  468:pop             
		COLOR_MAP.put("darkkhaki", ((Object) (Integer.valueOf(0xffbdb76b))));
	//  175  469:getstatic       #45  <Field Map COLOR_MAP>
	//  176  472:ldc1            #135 <String "darkkhaki">
	//  177  474:ldc1            #136 <Int 0xffbdb76b>
	//  178  476:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  179  479:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  180  484:pop             
		COLOR_MAP.put("darkmagenta", ((Object) (Integer.valueOf(0xff8b008b))));
	//  181  485:getstatic       #45  <Field Map COLOR_MAP>
	//  182  488:ldc1            #138 <String "darkmagenta">
	//  183  490:ldc1            #139 <Int 0xff8b008b>
	//  184  492:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  185  495:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  186  500:pop             
		COLOR_MAP.put("darkolivegreen", ((Object) (Integer.valueOf(0xff556b2f))));
	//  187  501:getstatic       #45  <Field Map COLOR_MAP>
	//  188  504:ldc1            #141 <String "darkolivegreen">
	//  189  506:ldc1            #142 <Int 0xff556b2f>
	//  190  508:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  191  511:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  192  516:pop             
		COLOR_MAP.put("darkorange", ((Object) (Integer.valueOf(-29696))));
	//  193  517:getstatic       #45  <Field Map COLOR_MAP>
	//  194  520:ldc1            #144 <String "darkorange">
	//  195  522:sipush          -29696
	//  196  525:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  197  528:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  198  533:pop             
		COLOR_MAP.put("darkorchid", ((Object) (Integer.valueOf(0xff9932cc))));
	//  199  534:getstatic       #45  <Field Map COLOR_MAP>
	//  200  537:ldc1            #146 <String "darkorchid">
	//  201  539:ldc1            #147 <Int 0xff9932cc>
	//  202  541:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  203  544:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  204  549:pop             
		COLOR_MAP.put("darkred", ((Object) (Integer.valueOf(0xff8b0000))));
	//  205  550:getstatic       #45  <Field Map COLOR_MAP>
	//  206  553:ldc1            #149 <String "darkred">
	//  207  555:ldc1            #150 <Int 0xff8b0000>
	//  208  557:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  209  560:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  210  565:pop             
		COLOR_MAP.put("darksalmon", ((Object) (Integer.valueOf(0xffe9967a))));
	//  211  566:getstatic       #45  <Field Map COLOR_MAP>
	//  212  569:ldc1            #152 <String "darksalmon">
	//  213  571:ldc1            #153 <Int 0xffe9967a>
	//  214  573:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  215  576:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  216  581:pop             
		COLOR_MAP.put("darkseagreen", ((Object) (Integer.valueOf(0xff8fbc8f))));
	//  217  582:getstatic       #45  <Field Map COLOR_MAP>
	//  218  585:ldc1            #155 <String "darkseagreen">
	//  219  587:ldc1            #156 <Int 0xff8fbc8f>
	//  220  589:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  221  592:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  222  597:pop             
		COLOR_MAP.put("darkslateblue", ((Object) (Integer.valueOf(0xff483d8b))));
	//  223  598:getstatic       #45  <Field Map COLOR_MAP>
	//  224  601:ldc1            #158 <String "darkslateblue">
	//  225  603:ldc1            #159 <Int 0xff483d8b>
	//  226  605:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  227  608:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  228  613:pop             
		COLOR_MAP.put("darkslategray", ((Object) (Integer.valueOf(0xff2f4f4f))));
	//  229  614:getstatic       #45  <Field Map COLOR_MAP>
	//  230  617:ldc1            #161 <String "darkslategray">
	//  231  619:ldc1            #162 <Int 0xff2f4f4f>
	//  232  621:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  233  624:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  234  629:pop             
		COLOR_MAP.put("darkslategrey", ((Object) (Integer.valueOf(0xff2f4f4f))));
	//  235  630:getstatic       #45  <Field Map COLOR_MAP>
	//  236  633:ldc1            #164 <String "darkslategrey">
	//  237  635:ldc1            #162 <Int 0xff2f4f4f>
	//  238  637:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  239  640:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  240  645:pop             
		COLOR_MAP.put("darkturquoise", ((Object) (Integer.valueOf(0xff00ced1))));
	//  241  646:getstatic       #45  <Field Map COLOR_MAP>
	//  242  649:ldc1            #166 <String "darkturquoise">
	//  243  651:ldc1            #167 <Int 0xff00ced1>
	//  244  653:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  245  656:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  246  661:pop             
		COLOR_MAP.put("darkviolet", ((Object) (Integer.valueOf(0xff9400d3))));
	//  247  662:getstatic       #45  <Field Map COLOR_MAP>
	//  248  665:ldc1            #169 <String "darkviolet">
	//  249  667:ldc1            #170 <Int 0xff9400d3>
	//  250  669:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  251  672:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  252  677:pop             
		COLOR_MAP.put("deeppink", ((Object) (Integer.valueOf(-60269))));
	//  253  678:getstatic       #45  <Field Map COLOR_MAP>
	//  254  681:ldc1            #172 <String "deeppink">
	//  255  683:ldc1            #173 <Int -60269>
	//  256  685:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  257  688:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  258  693:pop             
		COLOR_MAP.put("deepskyblue", ((Object) (Integer.valueOf(0xff00bfff))));
	//  259  694:getstatic       #45  <Field Map COLOR_MAP>
	//  260  697:ldc1            #175 <String "deepskyblue">
	//  261  699:ldc1            #176 <Int 0xff00bfff>
	//  262  701:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  263  704:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  264  709:pop             
		COLOR_MAP.put("dimgray", ((Object) (Integer.valueOf(0xff696969))));
	//  265  710:getstatic       #45  <Field Map COLOR_MAP>
	//  266  713:ldc1            #178 <String "dimgray">
	//  267  715:ldc1            #179 <Int 0xff696969>
	//  268  717:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  269  720:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  270  725:pop             
		COLOR_MAP.put("dimgrey", ((Object) (Integer.valueOf(0xff696969))));
	//  271  726:getstatic       #45  <Field Map COLOR_MAP>
	//  272  729:ldc1            #181 <String "dimgrey">
	//  273  731:ldc1            #179 <Int 0xff696969>
	//  274  733:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  275  736:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  276  741:pop             
		COLOR_MAP.put("dodgerblue", ((Object) (Integer.valueOf(0xff1e90ff))));
	//  277  742:getstatic       #45  <Field Map COLOR_MAP>
	//  278  745:ldc1            #183 <String "dodgerblue">
	//  279  747:ldc1            #184 <Int 0xff1e90ff>
	//  280  749:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  281  752:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  282  757:pop             
		COLOR_MAP.put("firebrick", ((Object) (Integer.valueOf(0xffb22222))));
	//  283  758:getstatic       #45  <Field Map COLOR_MAP>
	//  284  761:ldc1            #186 <String "firebrick">
	//  285  763:ldc1            #187 <Int 0xffb22222>
	//  286  765:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  287  768:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  288  773:pop             
		COLOR_MAP.put("floralwhite", ((Object) (Integer.valueOf(-1296))));
	//  289  774:getstatic       #45  <Field Map COLOR_MAP>
	//  290  777:ldc1            #189 <String "floralwhite">
	//  291  779:sipush          -1296
	//  292  782:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  293  785:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  294  790:pop             
		COLOR_MAP.put("forestgreen", ((Object) (Integer.valueOf(0xff228b22))));
	//  295  791:getstatic       #45  <Field Map COLOR_MAP>
	//  296  794:ldc1            #191 <String "forestgreen">
	//  297  796:ldc1            #192 <Int 0xff228b22>
	//  298  798:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  299  801:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  300  806:pop             
		COLOR_MAP.put("fuchsia", ((Object) (Integer.valueOf(-65281))));
	//  301  807:getstatic       #45  <Field Map COLOR_MAP>
	//  302  810:ldc1            #194 <String "fuchsia">
	//  303  812:ldc1            #195 <Int -65281>
	//  304  814:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  305  817:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  306  822:pop             
		COLOR_MAP.put("gainsboro", ((Object) (Integer.valueOf(0xffdcdcdc))));
	//  307  823:getstatic       #45  <Field Map COLOR_MAP>
	//  308  826:ldc1            #197 <String "gainsboro">
	//  309  828:ldc1            #198 <Int 0xffdcdcdc>
	//  310  830:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  311  833:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  312  838:pop             
		COLOR_MAP.put("ghostwhite", ((Object) (Integer.valueOf(0xfff8f8ff))));
	//  313  839:getstatic       #45  <Field Map COLOR_MAP>
	//  314  842:ldc1            #200 <String "ghostwhite">
	//  315  844:ldc1            #201 <Int 0xfff8f8ff>
	//  316  846:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  317  849:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  318  854:pop             
		COLOR_MAP.put("gold", ((Object) (Integer.valueOf(-10496))));
	//  319  855:getstatic       #45  <Field Map COLOR_MAP>
	//  320  858:ldc1            #203 <String "gold">
	//  321  860:sipush          -10496
	//  322  863:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  323  866:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  324  871:pop             
		COLOR_MAP.put("goldenrod", ((Object) (Integer.valueOf(0xffdaa520))));
	//  325  872:getstatic       #45  <Field Map COLOR_MAP>
	//  326  875:ldc1            #205 <String "goldenrod">
	//  327  877:ldc1            #206 <Int 0xffdaa520>
	//  328  879:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  329  882:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  330  887:pop             
		COLOR_MAP.put("gray", ((Object) (Integer.valueOf(0xff808080))));
	//  331  888:getstatic       #45  <Field Map COLOR_MAP>
	//  332  891:ldc1            #208 <String "gray">
	//  333  893:ldc1            #209 <Int 0xff808080>
	//  334  895:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  335  898:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  336  903:pop             
		COLOR_MAP.put("green", ((Object) (Integer.valueOf(0xff008000))));
	//  337  904:getstatic       #45  <Field Map COLOR_MAP>
	//  338  907:ldc1            #211 <String "green">
	//  339  909:ldc1            #212 <Int 0xff008000>
	//  340  911:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  341  914:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  342  919:pop             
		COLOR_MAP.put("greenyellow", ((Object) (Integer.valueOf(0xffadff2f))));
	//  343  920:getstatic       #45  <Field Map COLOR_MAP>
	//  344  923:ldc1            #214 <String "greenyellow">
	//  345  925:ldc1            #215 <Int 0xffadff2f>
	//  346  927:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  347  930:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  348  935:pop             
		COLOR_MAP.put("grey", ((Object) (Integer.valueOf(0xff808080))));
	//  349  936:getstatic       #45  <Field Map COLOR_MAP>
	//  350  939:ldc1            #217 <String "grey">
	//  351  941:ldc1            #209 <Int 0xff808080>
	//  352  943:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  353  946:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  354  951:pop             
		COLOR_MAP.put("honeydew", ((Object) (Integer.valueOf(0xfff0fff0))));
	//  355  952:getstatic       #45  <Field Map COLOR_MAP>
	//  356  955:ldc1            #219 <String "honeydew">
	//  357  957:ldc1            #220 <Int 0xfff0fff0>
	//  358  959:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  359  962:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  360  967:pop             
		COLOR_MAP.put("hotpink", ((Object) (Integer.valueOf(-38476))));
	//  361  968:getstatic       #45  <Field Map COLOR_MAP>
	//  362  971:ldc1            #222 <String "hotpink">
	//  363  973:ldc1            #223 <Int -38476>
	//  364  975:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  365  978:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  366  983:pop             
		COLOR_MAP.put("indianred", ((Object) (Integer.valueOf(0xffcd5c5c))));
	//  367  984:getstatic       #45  <Field Map COLOR_MAP>
	//  368  987:ldc1            #225 <String "indianred">
	//  369  989:ldc1            #226 <Int 0xffcd5c5c>
	//  370  991:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  371  994:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  372  999:pop             
		COLOR_MAP.put("indigo", ((Object) (Integer.valueOf(0xff4b0082))));
	//  373 1000:getstatic       #45  <Field Map COLOR_MAP>
	//  374 1003:ldc1            #228 <String "indigo">
	//  375 1005:ldc1            #229 <Int 0xff4b0082>
	//  376 1007:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  377 1010:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  378 1015:pop             
		COLOR_MAP.put("ivory", ((Object) (Integer.valueOf(-16))));
	//  379 1016:getstatic       #45  <Field Map COLOR_MAP>
	//  380 1019:ldc1            #231 <String "ivory">
	//  381 1021:bipush          -16
	//  382 1023:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  383 1026:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  384 1031:pop             
		COLOR_MAP.put("khaki", ((Object) (Integer.valueOf(0xfff0e68c))));
	//  385 1032:getstatic       #45  <Field Map COLOR_MAP>
	//  386 1035:ldc1            #233 <String "khaki">
	//  387 1037:ldc1            #234 <Int 0xfff0e68c>
	//  388 1039:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  389 1042:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  390 1047:pop             
		COLOR_MAP.put("lavender", ((Object) (Integer.valueOf(0xffe6e6fa))));
	//  391 1048:getstatic       #45  <Field Map COLOR_MAP>
	//  392 1051:ldc1            #236 <String "lavender">
	//  393 1053:ldc1            #237 <Int 0xffe6e6fa>
	//  394 1055:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  395 1058:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  396 1063:pop             
		COLOR_MAP.put("lavenderblush", ((Object) (Integer.valueOf(-3851))));
	//  397 1064:getstatic       #45  <Field Map COLOR_MAP>
	//  398 1067:ldc1            #239 <String "lavenderblush">
	//  399 1069:sipush          -3851
	//  400 1072:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  401 1075:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  402 1080:pop             
		COLOR_MAP.put("lawngreen", ((Object) (Integer.valueOf(0xff7cfc00))));
	//  403 1081:getstatic       #45  <Field Map COLOR_MAP>
	//  404 1084:ldc1            #241 <String "lawngreen">
	//  405 1086:ldc1            #242 <Int 0xff7cfc00>
	//  406 1088:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  407 1091:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  408 1096:pop             
		COLOR_MAP.put("lemonchiffon", ((Object) (Integer.valueOf(-1331))));
	//  409 1097:getstatic       #45  <Field Map COLOR_MAP>
	//  410 1100:ldc1            #244 <String "lemonchiffon">
	//  411 1102:sipush          -1331
	//  412 1105:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  413 1108:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  414 1113:pop             
		COLOR_MAP.put("lightblue", ((Object) (Integer.valueOf(0xffadd8e6))));
	//  415 1114:getstatic       #45  <Field Map COLOR_MAP>
	//  416 1117:ldc1            #246 <String "lightblue">
	//  417 1119:ldc1            #247 <Int 0xffadd8e6>
	//  418 1121:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  419 1124:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  420 1129:pop             
		COLOR_MAP.put("lightcoral", ((Object) (Integer.valueOf(0xfff08080))));
	//  421 1130:getstatic       #45  <Field Map COLOR_MAP>
	//  422 1133:ldc1            #249 <String "lightcoral">
	//  423 1135:ldc1            #250 <Int 0xfff08080>
	//  424 1137:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  425 1140:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  426 1145:pop             
		COLOR_MAP.put("lightcyan", ((Object) (Integer.valueOf(0xffe0ffff))));
	//  427 1146:getstatic       #45  <Field Map COLOR_MAP>
	//  428 1149:ldc1            #252 <String "lightcyan">
	//  429 1151:ldc1            #253 <Int 0xffe0ffff>
	//  430 1153:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  431 1156:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  432 1161:pop             
		COLOR_MAP.put("lightgoldenrodyellow", ((Object) (Integer.valueOf(0xfffafad2))));
	//  433 1162:getstatic       #45  <Field Map COLOR_MAP>
	//  434 1165:ldc1            #255 <String "lightgoldenrodyellow">
	//  435 1167:ldc2            #256 <Int 0xfffafad2>
	//  436 1170:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  437 1173:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  438 1178:pop             
		COLOR_MAP.put("lightgray", ((Object) (Integer.valueOf(0xffd3d3d3))));
	//  439 1179:getstatic       #45  <Field Map COLOR_MAP>
	//  440 1182:ldc2            #258 <String "lightgray">
	//  441 1185:ldc2            #259 <Int 0xffd3d3d3>
	//  442 1188:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  443 1191:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  444 1196:pop             
		COLOR_MAP.put("lightgreen", ((Object) (Integer.valueOf(0xff90ee90))));
	//  445 1197:getstatic       #45  <Field Map COLOR_MAP>
	//  446 1200:ldc2            #261 <String "lightgreen">
	//  447 1203:ldc2            #262 <Int 0xff90ee90>
	//  448 1206:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  449 1209:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  450 1214:pop             
		COLOR_MAP.put("lightgrey", ((Object) (Integer.valueOf(0xffd3d3d3))));
	//  451 1215:getstatic       #45  <Field Map COLOR_MAP>
	//  452 1218:ldc2            #264 <String "lightgrey">
	//  453 1221:ldc2            #259 <Int 0xffd3d3d3>
	//  454 1224:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  455 1227:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  456 1232:pop             
		COLOR_MAP.put("lightpink", ((Object) (Integer.valueOf(-18751))));
	//  457 1233:getstatic       #45  <Field Map COLOR_MAP>
	//  458 1236:ldc2            #266 <String "lightpink">
	//  459 1239:sipush          -18751
	//  460 1242:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  461 1245:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  462 1250:pop             
		COLOR_MAP.put("lightsalmon", ((Object) (Integer.valueOf(-24454))));
	//  463 1251:getstatic       #45  <Field Map COLOR_MAP>
	//  464 1254:ldc2            #268 <String "lightsalmon">
	//  465 1257:sipush          -24454
	//  466 1260:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  467 1263:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  468 1268:pop             
		COLOR_MAP.put("lightseagreen", ((Object) (Integer.valueOf(0xff20b2aa))));
	//  469 1269:getstatic       #45  <Field Map COLOR_MAP>
	//  470 1272:ldc2            #270 <String "lightseagreen">
	//  471 1275:ldc2            #271 <Int 0xff20b2aa>
	//  472 1278:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  473 1281:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  474 1286:pop             
		COLOR_MAP.put("lightskyblue", ((Object) (Integer.valueOf(0xff87cefa))));
	//  475 1287:getstatic       #45  <Field Map COLOR_MAP>
	//  476 1290:ldc2            #273 <String "lightskyblue">
	//  477 1293:ldc2            #274 <Int 0xff87cefa>
	//  478 1296:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  479 1299:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  480 1304:pop             
		COLOR_MAP.put("lightslategray", ((Object) (Integer.valueOf(0xff778899))));
	//  481 1305:getstatic       #45  <Field Map COLOR_MAP>
	//  482 1308:ldc2            #276 <String "lightslategray">
	//  483 1311:ldc2            #277 <Int 0xff778899>
	//  484 1314:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  485 1317:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  486 1322:pop             
		COLOR_MAP.put("lightslategrey", ((Object) (Integer.valueOf(0xff778899))));
	//  487 1323:getstatic       #45  <Field Map COLOR_MAP>
	//  488 1326:ldc2            #279 <String "lightslategrey">
	//  489 1329:ldc2            #277 <Int 0xff778899>
	//  490 1332:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  491 1335:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  492 1340:pop             
		COLOR_MAP.put("lightsteelblue", ((Object) (Integer.valueOf(0xffb0c4de))));
	//  493 1341:getstatic       #45  <Field Map COLOR_MAP>
	//  494 1344:ldc2            #281 <String "lightsteelblue">
	//  495 1347:ldc2            #282 <Int 0xffb0c4de>
	//  496 1350:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  497 1353:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  498 1358:pop             
		COLOR_MAP.put("lightyellow", ((Object) (Integer.valueOf(-32))));
	//  499 1359:getstatic       #45  <Field Map COLOR_MAP>
	//  500 1362:ldc2            #284 <String "lightyellow">
	//  501 1365:bipush          -32
	//  502 1367:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  503 1370:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  504 1375:pop             
		COLOR_MAP.put("lime", ((Object) (Integer.valueOf(0xff00ff00))));
	//  505 1376:getstatic       #45  <Field Map COLOR_MAP>
	//  506 1379:ldc2            #286 <String "lime">
	//  507 1382:ldc2            #287 <Int 0xff00ff00>
	//  508 1385:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  509 1388:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  510 1393:pop             
		COLOR_MAP.put("limegreen", ((Object) (Integer.valueOf(0xff32cd32))));
	//  511 1394:getstatic       #45  <Field Map COLOR_MAP>
	//  512 1397:ldc2            #289 <String "limegreen">
	//  513 1400:ldc2            #290 <Int 0xff32cd32>
	//  514 1403:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  515 1406:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  516 1411:pop             
		COLOR_MAP.put("linen", ((Object) (Integer.valueOf(0xfffaf0e6))));
	//  517 1412:getstatic       #45  <Field Map COLOR_MAP>
	//  518 1415:ldc2            #292 <String "linen">
	//  519 1418:ldc2            #293 <Int 0xfffaf0e6>
	//  520 1421:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  521 1424:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  522 1429:pop             
		COLOR_MAP.put("magenta", ((Object) (Integer.valueOf(-65281))));
	//  523 1430:getstatic       #45  <Field Map COLOR_MAP>
	//  524 1433:ldc2            #295 <String "magenta">
	//  525 1436:ldc1            #195 <Int -65281>
	//  526 1438:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  527 1441:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  528 1446:pop             
		COLOR_MAP.put("maroon", ((Object) (Integer.valueOf(0xff800000))));
	//  529 1447:getstatic       #45  <Field Map COLOR_MAP>
	//  530 1450:ldc2            #297 <String "maroon">
	//  531 1453:ldc2            #298 <Int 0xff800000>
	//  532 1456:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  533 1459:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  534 1464:pop             
		COLOR_MAP.put("mediumaquamarine", ((Object) (Integer.valueOf(0xff66cdaa))));
	//  535 1465:getstatic       #45  <Field Map COLOR_MAP>
	//  536 1468:ldc2            #300 <String "mediumaquamarine">
	//  537 1471:ldc2            #301 <Int 0xff66cdaa>
	//  538 1474:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  539 1477:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  540 1482:pop             
		COLOR_MAP.put("mediumblue", ((Object) (Integer.valueOf(0xff0000cd))));
	//  541 1483:getstatic       #45  <Field Map COLOR_MAP>
	//  542 1486:ldc2            #303 <String "mediumblue">
	//  543 1489:ldc2            #304 <Int 0xff0000cd>
	//  544 1492:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  545 1495:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  546 1500:pop             
		COLOR_MAP.put("mediumorchid", ((Object) (Integer.valueOf(0xffba55d3))));
	//  547 1501:getstatic       #45  <Field Map COLOR_MAP>
	//  548 1504:ldc2            #306 <String "mediumorchid">
	//  549 1507:ldc2            #307 <Int 0xffba55d3>
	//  550 1510:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  551 1513:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  552 1518:pop             
		COLOR_MAP.put("mediumpurple", ((Object) (Integer.valueOf(0xff9370db))));
	//  553 1519:getstatic       #45  <Field Map COLOR_MAP>
	//  554 1522:ldc2            #309 <String "mediumpurple">
	//  555 1525:ldc2            #310 <Int 0xff9370db>
	//  556 1528:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  557 1531:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  558 1536:pop             
		COLOR_MAP.put("mediumseagreen", ((Object) (Integer.valueOf(0xff3cb371))));
	//  559 1537:getstatic       #45  <Field Map COLOR_MAP>
	//  560 1540:ldc2            #312 <String "mediumseagreen">
	//  561 1543:ldc2            #313 <Int 0xff3cb371>
	//  562 1546:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  563 1549:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  564 1554:pop             
		COLOR_MAP.put("mediumslateblue", ((Object) (Integer.valueOf(0xff7b68ee))));
	//  565 1555:getstatic       #45  <Field Map COLOR_MAP>
	//  566 1558:ldc2            #315 <String "mediumslateblue">
	//  567 1561:ldc2            #316 <Int 0xff7b68ee>
	//  568 1564:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  569 1567:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  570 1572:pop             
		COLOR_MAP.put("mediumspringgreen", ((Object) (Integer.valueOf(0xff00fa9a))));
	//  571 1573:getstatic       #45  <Field Map COLOR_MAP>
	//  572 1576:ldc2            #318 <String "mediumspringgreen">
	//  573 1579:ldc2            #319 <Int 0xff00fa9a>
	//  574 1582:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  575 1585:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  576 1590:pop             
		COLOR_MAP.put("mediumturquoise", ((Object) (Integer.valueOf(0xff48d1cc))));
	//  577 1591:getstatic       #45  <Field Map COLOR_MAP>
	//  578 1594:ldc2            #321 <String "mediumturquoise">
	//  579 1597:ldc2            #322 <Int 0xff48d1cc>
	//  580 1600:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  581 1603:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  582 1608:pop             
		COLOR_MAP.put("mediumvioletred", ((Object) (Integer.valueOf(0xffc71585))));
	//  583 1609:getstatic       #45  <Field Map COLOR_MAP>
	//  584 1612:ldc2            #324 <String "mediumvioletred">
	//  585 1615:ldc2            #325 <Int 0xffc71585>
	//  586 1618:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  587 1621:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  588 1626:pop             
		COLOR_MAP.put("midnightblue", ((Object) (Integer.valueOf(0xff191970))));
	//  589 1627:getstatic       #45  <Field Map COLOR_MAP>
	//  590 1630:ldc2            #327 <String "midnightblue">
	//  591 1633:ldc2            #328 <Int 0xff191970>
	//  592 1636:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  593 1639:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  594 1644:pop             
		COLOR_MAP.put("mintcream", ((Object) (Integer.valueOf(0xfff5fffa))));
	//  595 1645:getstatic       #45  <Field Map COLOR_MAP>
	//  596 1648:ldc2            #330 <String "mintcream">
	//  597 1651:ldc2            #331 <Int 0xfff5fffa>
	//  598 1654:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  599 1657:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  600 1662:pop             
		COLOR_MAP.put("mistyrose", ((Object) (Integer.valueOf(-6943))));
	//  601 1663:getstatic       #45  <Field Map COLOR_MAP>
	//  602 1666:ldc2            #333 <String "mistyrose">
	//  603 1669:sipush          -6943
	//  604 1672:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  605 1675:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  606 1680:pop             
		COLOR_MAP.put("moccasin", ((Object) (Integer.valueOf(-6987))));
	//  607 1681:getstatic       #45  <Field Map COLOR_MAP>
	//  608 1684:ldc2            #335 <String "moccasin">
	//  609 1687:sipush          -6987
	//  610 1690:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  611 1693:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  612 1698:pop             
		COLOR_MAP.put("navajowhite", ((Object) (Integer.valueOf(-8531))));
	//  613 1699:getstatic       #45  <Field Map COLOR_MAP>
	//  614 1702:ldc2            #337 <String "navajowhite">
	//  615 1705:sipush          -8531
	//  616 1708:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  617 1711:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  618 1716:pop             
		COLOR_MAP.put("navy", ((Object) (Integer.valueOf(0xff000080))));
	//  619 1717:getstatic       #45  <Field Map COLOR_MAP>
	//  620 1720:ldc2            #339 <String "navy">
	//  621 1723:ldc2            #340 <Int 0xff000080>
	//  622 1726:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  623 1729:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  624 1734:pop             
		COLOR_MAP.put("oldlace", ((Object) (Integer.valueOf(0xfffdf5e6))));
	//  625 1735:getstatic       #45  <Field Map COLOR_MAP>
	//  626 1738:ldc2            #342 <String "oldlace">
	//  627 1741:ldc2            #343 <Int 0xfffdf5e6>
	//  628 1744:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  629 1747:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  630 1752:pop             
		COLOR_MAP.put("olive", ((Object) (Integer.valueOf(0xff808000))));
	//  631 1753:getstatic       #45  <Field Map COLOR_MAP>
	//  632 1756:ldc2            #345 <String "olive">
	//  633 1759:ldc2            #346 <Int 0xff808000>
	//  634 1762:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  635 1765:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  636 1770:pop             
		COLOR_MAP.put("olivedrab", ((Object) (Integer.valueOf(0xff6b8e23))));
	//  637 1771:getstatic       #45  <Field Map COLOR_MAP>
	//  638 1774:ldc2            #348 <String "olivedrab">
	//  639 1777:ldc2            #349 <Int 0xff6b8e23>
	//  640 1780:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  641 1783:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  642 1788:pop             
		COLOR_MAP.put("orange", ((Object) (Integer.valueOf(-23296))));
	//  643 1789:getstatic       #45  <Field Map COLOR_MAP>
	//  644 1792:ldc2            #351 <String "orange">
	//  645 1795:sipush          -23296
	//  646 1798:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  647 1801:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  648 1806:pop             
		COLOR_MAP.put("orangered", ((Object) (Integer.valueOf(-47872))));
	//  649 1807:getstatic       #45  <Field Map COLOR_MAP>
	//  650 1810:ldc2            #353 <String "orangered">
	//  651 1813:ldc2            #354 <Int -47872>
	//  652 1816:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  653 1819:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  654 1824:pop             
		COLOR_MAP.put("orchid", ((Object) (Integer.valueOf(0xffda70d6))));
	//  655 1825:getstatic       #45  <Field Map COLOR_MAP>
	//  656 1828:ldc2            #356 <String "orchid">
	//  657 1831:ldc2            #357 <Int 0xffda70d6>
	//  658 1834:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  659 1837:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  660 1842:pop             
		COLOR_MAP.put("palegoldenrod", ((Object) (Integer.valueOf(0xffeee8aa))));
	//  661 1843:getstatic       #45  <Field Map COLOR_MAP>
	//  662 1846:ldc2            #359 <String "palegoldenrod">
	//  663 1849:ldc2            #360 <Int 0xffeee8aa>
	//  664 1852:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  665 1855:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  666 1860:pop             
		COLOR_MAP.put("palegreen", ((Object) (Integer.valueOf(0xff98fb98))));
	//  667 1861:getstatic       #45  <Field Map COLOR_MAP>
	//  668 1864:ldc2            #362 <String "palegreen">
	//  669 1867:ldc2            #363 <Int 0xff98fb98>
	//  670 1870:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  671 1873:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  672 1878:pop             
		COLOR_MAP.put("paleturquoise", ((Object) (Integer.valueOf(0xffafeeee))));
	//  673 1879:getstatic       #45  <Field Map COLOR_MAP>
	//  674 1882:ldc2            #365 <String "paleturquoise">
	//  675 1885:ldc2            #366 <Int 0xffafeeee>
	//  676 1888:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  677 1891:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  678 1896:pop             
		COLOR_MAP.put("palevioletred", ((Object) (Integer.valueOf(0xffdb7093))));
	//  679 1897:getstatic       #45  <Field Map COLOR_MAP>
	//  680 1900:ldc2            #368 <String "palevioletred">
	//  681 1903:ldc2            #369 <Int 0xffdb7093>
	//  682 1906:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  683 1909:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  684 1914:pop             
		COLOR_MAP.put("papayawhip", ((Object) (Integer.valueOf(-4139))));
	//  685 1915:getstatic       #45  <Field Map COLOR_MAP>
	//  686 1918:ldc2            #371 <String "papayawhip">
	//  687 1921:sipush          -4139
	//  688 1924:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  689 1927:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  690 1932:pop             
		COLOR_MAP.put("peachpuff", ((Object) (Integer.valueOf(-9543))));
	//  691 1933:getstatic       #45  <Field Map COLOR_MAP>
	//  692 1936:ldc2            #373 <String "peachpuff">
	//  693 1939:sipush          -9543
	//  694 1942:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  695 1945:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  696 1950:pop             
		COLOR_MAP.put("peru", ((Object) (Integer.valueOf(0xffcd853f))));
	//  697 1951:getstatic       #45  <Field Map COLOR_MAP>
	//  698 1954:ldc2            #375 <String "peru">
	//  699 1957:ldc2            #376 <Int 0xffcd853f>
	//  700 1960:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  701 1963:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  702 1968:pop             
		COLOR_MAP.put("pink", ((Object) (Integer.valueOf(-16181))));
	//  703 1969:getstatic       #45  <Field Map COLOR_MAP>
	//  704 1972:ldc2            #378 <String "pink">
	//  705 1975:sipush          -16181
	//  706 1978:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  707 1981:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  708 1986:pop             
		COLOR_MAP.put("plum", ((Object) (Integer.valueOf(0xffdda0dd))));
	//  709 1987:getstatic       #45  <Field Map COLOR_MAP>
	//  710 1990:ldc2            #380 <String "plum">
	//  711 1993:ldc2            #381 <Int 0xffdda0dd>
	//  712 1996:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  713 1999:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  714 2004:pop             
		COLOR_MAP.put("powderblue", ((Object) (Integer.valueOf(0xffb0e0e6))));
	//  715 2005:getstatic       #45  <Field Map COLOR_MAP>
	//  716 2008:ldc2            #383 <String "powderblue">
	//  717 2011:ldc2            #384 <Int 0xffb0e0e6>
	//  718 2014:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  719 2017:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  720 2022:pop             
		COLOR_MAP.put("purple", ((Object) (Integer.valueOf(0xff800080))));
	//  721 2023:getstatic       #45  <Field Map COLOR_MAP>
	//  722 2026:ldc2            #386 <String "purple">
	//  723 2029:ldc2            #387 <Int 0xff800080>
	//  724 2032:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  725 2035:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  726 2040:pop             
		COLOR_MAP.put("rebeccapurple", ((Object) (Integer.valueOf(0xff663399))));
	//  727 2041:getstatic       #45  <Field Map COLOR_MAP>
	//  728 2044:ldc2            #389 <String "rebeccapurple">
	//  729 2047:ldc2            #390 <Int 0xff663399>
	//  730 2050:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  731 2053:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  732 2058:pop             
		COLOR_MAP.put("red", ((Object) (Integer.valueOf(0xffff0000))));
	//  733 2059:getstatic       #45  <Field Map COLOR_MAP>
	//  734 2062:ldc2            #392 <String "red">
	//  735 2065:ldc2            #393 <Int 0xffff0000>
	//  736 2068:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  737 2071:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  738 2076:pop             
		COLOR_MAP.put("rosybrown", ((Object) (Integer.valueOf(0xffbc8f8f))));
	//  739 2077:getstatic       #45  <Field Map COLOR_MAP>
	//  740 2080:ldc2            #395 <String "rosybrown">
	//  741 2083:ldc2            #396 <Int 0xffbc8f8f>
	//  742 2086:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  743 2089:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  744 2094:pop             
		COLOR_MAP.put("royalblue", ((Object) (Integer.valueOf(0xff4169e1))));
	//  745 2095:getstatic       #45  <Field Map COLOR_MAP>
	//  746 2098:ldc2            #398 <String "royalblue">
	//  747 2101:ldc2            #399 <Int 0xff4169e1>
	//  748 2104:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  749 2107:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  750 2112:pop             
		COLOR_MAP.put("saddlebrown", ((Object) (Integer.valueOf(0xff8b4513))));
	//  751 2113:getstatic       #45  <Field Map COLOR_MAP>
	//  752 2116:ldc2            #401 <String "saddlebrown">
	//  753 2119:ldc2            #402 <Int 0xff8b4513>
	//  754 2122:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  755 2125:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  756 2130:pop             
		COLOR_MAP.put("salmon", ((Object) (Integer.valueOf(0xfffa8072))));
	//  757 2131:getstatic       #45  <Field Map COLOR_MAP>
	//  758 2134:ldc2            #404 <String "salmon">
	//  759 2137:ldc2            #405 <Int 0xfffa8072>
	//  760 2140:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  761 2143:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  762 2148:pop             
		COLOR_MAP.put("sandybrown", ((Object) (Integer.valueOf(0xfff4a460))));
	//  763 2149:getstatic       #45  <Field Map COLOR_MAP>
	//  764 2152:ldc2            #407 <String "sandybrown">
	//  765 2155:ldc2            #408 <Int 0xfff4a460>
	//  766 2158:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  767 2161:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  768 2166:pop             
		COLOR_MAP.put("seagreen", ((Object) (Integer.valueOf(0xff2e8b57))));
	//  769 2167:getstatic       #45  <Field Map COLOR_MAP>
	//  770 2170:ldc2            #410 <String "seagreen">
	//  771 2173:ldc2            #411 <Int 0xff2e8b57>
	//  772 2176:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  773 2179:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  774 2184:pop             
		COLOR_MAP.put("seashell", ((Object) (Integer.valueOf(-2578))));
	//  775 2185:getstatic       #45  <Field Map COLOR_MAP>
	//  776 2188:ldc2            #413 <String "seashell">
	//  777 2191:sipush          -2578
	//  778 2194:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  779 2197:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  780 2202:pop             
		COLOR_MAP.put("sienna", ((Object) (Integer.valueOf(0xffa0522d))));
	//  781 2203:getstatic       #45  <Field Map COLOR_MAP>
	//  782 2206:ldc2            #415 <String "sienna">
	//  783 2209:ldc2            #416 <Int 0xffa0522d>
	//  784 2212:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  785 2215:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  786 2220:pop             
		COLOR_MAP.put("silver", ((Object) (Integer.valueOf(0xffc0c0c0))));
	//  787 2221:getstatic       #45  <Field Map COLOR_MAP>
	//  788 2224:ldc2            #418 <String "silver">
	//  789 2227:ldc2            #419 <Int 0xffc0c0c0>
	//  790 2230:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  791 2233:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  792 2238:pop             
		COLOR_MAP.put("skyblue", ((Object) (Integer.valueOf(0xff87ceeb))));
	//  793 2239:getstatic       #45  <Field Map COLOR_MAP>
	//  794 2242:ldc2            #421 <String "skyblue">
	//  795 2245:ldc2            #422 <Int 0xff87ceeb>
	//  796 2248:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  797 2251:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  798 2256:pop             
		COLOR_MAP.put("slateblue", ((Object) (Integer.valueOf(0xff6a5acd))));
	//  799 2257:getstatic       #45  <Field Map COLOR_MAP>
	//  800 2260:ldc2            #424 <String "slateblue">
	//  801 2263:ldc2            #425 <Int 0xff6a5acd>
	//  802 2266:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  803 2269:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  804 2274:pop             
		COLOR_MAP.put("slategray", ((Object) (Integer.valueOf(0xff708090))));
	//  805 2275:getstatic       #45  <Field Map COLOR_MAP>
	//  806 2278:ldc2            #427 <String "slategray">
	//  807 2281:ldc2            #428 <Int 0xff708090>
	//  808 2284:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  809 2287:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  810 2292:pop             
		COLOR_MAP.put("slategrey", ((Object) (Integer.valueOf(0xff708090))));
	//  811 2293:getstatic       #45  <Field Map COLOR_MAP>
	//  812 2296:ldc2            #430 <String "slategrey">
	//  813 2299:ldc2            #428 <Int 0xff708090>
	//  814 2302:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  815 2305:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  816 2310:pop             
		COLOR_MAP.put("snow", ((Object) (Integer.valueOf(-1286))));
	//  817 2311:getstatic       #45  <Field Map COLOR_MAP>
	//  818 2314:ldc2            #432 <String "snow">
	//  819 2317:sipush          -1286
	//  820 2320:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  821 2323:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  822 2328:pop             
		COLOR_MAP.put("springgreen", ((Object) (Integer.valueOf(0xff00ff7f))));
	//  823 2329:getstatic       #45  <Field Map COLOR_MAP>
	//  824 2332:ldc2            #434 <String "springgreen">
	//  825 2335:ldc2            #435 <Int 0xff00ff7f>
	//  826 2338:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  827 2341:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  828 2346:pop             
		COLOR_MAP.put("steelblue", ((Object) (Integer.valueOf(0xff4682b4))));
	//  829 2347:getstatic       #45  <Field Map COLOR_MAP>
	//  830 2350:ldc2            #437 <String "steelblue">
	//  831 2353:ldc2            #438 <Int 0xff4682b4>
	//  832 2356:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  833 2359:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  834 2364:pop             
		COLOR_MAP.put("tan", ((Object) (Integer.valueOf(0xffd2b48c))));
	//  835 2365:getstatic       #45  <Field Map COLOR_MAP>
	//  836 2368:ldc2            #440 <String "tan">
	//  837 2371:ldc2            #441 <Int 0xffd2b48c>
	//  838 2374:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  839 2377:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  840 2382:pop             
		COLOR_MAP.put("teal", ((Object) (Integer.valueOf(0xff008080))));
	//  841 2383:getstatic       #45  <Field Map COLOR_MAP>
	//  842 2386:ldc2            #443 <String "teal">
	//  843 2389:ldc2            #444 <Int 0xff008080>
	//  844 2392:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  845 2395:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  846 2400:pop             
		COLOR_MAP.put("thistle", ((Object) (Integer.valueOf(0xffd8bfd8))));
	//  847 2401:getstatic       #45  <Field Map COLOR_MAP>
	//  848 2404:ldc2            #446 <String "thistle">
	//  849 2407:ldc2            #447 <Int 0xffd8bfd8>
	//  850 2410:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  851 2413:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  852 2418:pop             
		COLOR_MAP.put("tomato", ((Object) (Integer.valueOf(-40121))));
	//  853 2419:getstatic       #45  <Field Map COLOR_MAP>
	//  854 2422:ldc2            #449 <String "tomato">
	//  855 2425:ldc2            #450 <Int -40121>
	//  856 2428:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  857 2431:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  858 2436:pop             
		COLOR_MAP.put("transparent", ((Object) (Integer.valueOf(0))));
	//  859 2437:getstatic       #45  <Field Map COLOR_MAP>
	//  860 2440:ldc2            #452 <String "transparent">
	//  861 2443:iconst_0        
	//  862 2444:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  863 2447:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  864 2452:pop             
		COLOR_MAP.put("turquoise", ((Object) (Integer.valueOf(0xff40e0d0))));
	//  865 2453:getstatic       #45  <Field Map COLOR_MAP>
	//  866 2456:ldc2            #454 <String "turquoise">
	//  867 2459:ldc2            #455 <Int 0xff40e0d0>
	//  868 2462:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  869 2465:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  870 2470:pop             
		COLOR_MAP.put("violet", ((Object) (Integer.valueOf(0xffee82ee))));
	//  871 2471:getstatic       #45  <Field Map COLOR_MAP>
	//  872 2474:ldc2            #457 <String "violet">
	//  873 2477:ldc2            #458 <Int 0xffee82ee>
	//  874 2480:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  875 2483:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  876 2488:pop             
		COLOR_MAP.put("wheat", ((Object) (Integer.valueOf(0xfff5deb3))));
	//  877 2489:getstatic       #45  <Field Map COLOR_MAP>
	//  878 2492:ldc2            #460 <String "wheat">
	//  879 2495:ldc2            #461 <Int 0xfff5deb3>
	//  880 2498:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  881 2501:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  882 2506:pop             
		COLOR_MAP.put("white", ((Object) (Integer.valueOf(-1))));
	//  883 2507:getstatic       #45  <Field Map COLOR_MAP>
	//  884 2510:ldc2            #463 <String "white">
	//  885 2513:iconst_m1       
	//  886 2514:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  887 2517:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  888 2522:pop             
		COLOR_MAP.put("whitesmoke", ((Object) (Integer.valueOf(0xfff5f5f5))));
	//  889 2523:getstatic       #45  <Field Map COLOR_MAP>
	//  890 2526:ldc2            #465 <String "whitesmoke">
	//  891 2529:ldc2            #466 <Int 0xfff5f5f5>
	//  892 2532:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  893 2535:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  894 2540:pop             
		COLOR_MAP.put("yellow", ((Object) (Integer.valueOf(-256))));
	//  895 2541:getstatic       #45  <Field Map COLOR_MAP>
	//  896 2544:ldc2            #468 <String "yellow">
	//  897 2547:sipush          -256
	//  898 2550:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  899 2553:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  900 2558:pop             
		COLOR_MAP.put("yellowgreen", ((Object) (Integer.valueOf(0xff9acd32))));
	//  901 2559:getstatic       #45  <Field Map COLOR_MAP>
	//  902 2562:ldc2            #470 <String "yellowgreen">
	//  903 2565:ldc2            #471 <Int 0xff9acd32>
	//  904 2568:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//  905 2571:invokeinterface #60  <Method Object Map.put(Object, Object)>
	//  906 2576:pop             
	//* 907 2577:return          
	}
}
