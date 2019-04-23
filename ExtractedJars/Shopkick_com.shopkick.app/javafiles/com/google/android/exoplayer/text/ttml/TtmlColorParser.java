// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.text.ttml;

import android.text.TextUtils;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.Util;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class TtmlColorParser
{

	TtmlColorParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #130 <Method void Object()>
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

	public static int parseColor(String s)
	{
		Assertions.checkArgument(TextUtils.isEmpty(((CharSequence) (s))) ^ true);
	//    0    0:aload_0         
	//    1    1:invokestatic    #140 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:invokestatic    #146 <Method void Assertions.checkArgument(boolean)>
		s = s.replace(" ", "");
	//    5    9:aload_0         
	//    6   10:ldc1            #148 <String " ">
	//    7   12:ldc1            #150 <String "">
	//    8   14:invokevirtual   #156 <Method String String.replace(CharSequence, CharSequence)>
	//    9   17:astore_0        
		if(s.charAt(0) == '#')
	//*  10   18:aload_0         
	//*  11   19:iconst_0        
	//*  12   20:invokevirtual   #160 <Method char String.charAt(int)>
	//*  13   23:bipush          35
	//*  14   25:icmpne          85
		{
			int i = (int)Long.parseLong(s.substring(1), 16);
	//   15   28:aload_0         
	//   16   29:iconst_1        
	//   17   30:invokevirtual   #164 <Method String String.substring(int)>
	//   18   33:bipush          16
	//   19   35:invokestatic    #170 <Method long Long.parseLong(String, int)>
	//   20   38:l2i             
	//   21   39:istore_1        
			if(s.length() == 7)
	//*  22   40:aload_0         
	//*  23   41:invokevirtual   #174 <Method int String.length()>
	//*  24   44:bipush          7
	//*  25   46:icmpne          54
				return 0xff000000 | i;
	//   26   49:ldc1            #9   <Int 0xff000000>
	//   27   51:iload_1         
	//   28   52:ior             
	//   29   53:ireturn         
			if(s.length() == 9)
	//*  30   54:aload_0         
	//*  31   55:invokevirtual   #174 <Method int String.length()>
	//*  32   58:bipush          9
	//*  33   60:icmpne          77
				return (i & 0xff) << 24 | i >>> 8;
	//   34   63:iload_1         
	//   35   64:sipush          255
	//   36   67:iand            
	//   37   68:bipush          24
	//   38   70:ishl            
	//   39   71:iload_1         
	//   40   72:bipush          8
	//   41   74:iushr           
	//   42   75:ior             
	//   43   76:ireturn         
			else
				throw new IllegalArgumentException();
	//   44   77:new             #176 <Class IllegalArgumentException>
	//   45   80:dup             
	//   46   81:invokespecial   #177 <Method void IllegalArgumentException()>
	//   47   84:athrow          
		}
		if(s.startsWith("rgba"))
	//*  48   85:aload_0         
	//*  49   86:ldc1            #42  <String "rgba">
	//*  50   88:invokevirtual   #181 <Method boolean String.startsWith(String)>
	//*  51   91:ifeq            157
		{
			s = ((String) (RGBA_PATTERN.matcher(((CharSequence) (s)))));
	//   52   94:getstatic       #71  <Field Pattern RGBA_PATTERN>
	//   53   97:aload_0         
	//   54   98:invokevirtual   #185 <Method Matcher Pattern.matcher(CharSequence)>
	//   55  101:astore_0        
			if(((Matcher) (s)).matches())
	//*  56  102:aload_0         
	//*  57  103:invokevirtual   #191 <Method boolean Matcher.matches()>
	//*  58  106:ifeq            240
				return argb(255 - Integer.parseInt(((Matcher) (s)).group(4), 10), Integer.parseInt(((Matcher) (s)).group(1), 10), Integer.parseInt(((Matcher) (s)).group(2), 10), Integer.parseInt(((Matcher) (s)).group(3), 10));
	//   59  109:sipush          255
	//   60  112:aload_0         
	//   61  113:iconst_4        
	//   62  114:invokevirtual   #194 <Method String Matcher.group(int)>
	//   63  117:bipush          10
	//   64  119:invokestatic    #198 <Method int Integer.parseInt(String, int)>
	//   65  122:isub            
	//   66  123:aload_0         
	//   67  124:iconst_1        
	//   68  125:invokevirtual   #194 <Method String Matcher.group(int)>
	//   69  128:bipush          10
	//   70  130:invokestatic    #198 <Method int Integer.parseInt(String, int)>
	//   71  133:aload_0         
	//   72  134:iconst_2        
	//   73  135:invokevirtual   #194 <Method String Matcher.group(int)>
	//   74  138:bipush          10
	//   75  140:invokestatic    #198 <Method int Integer.parseInt(String, int)>
	//   76  143:aload_0         
	//   77  144:iconst_3        
	//   78  145:invokevirtual   #194 <Method String Matcher.group(int)>
	//   79  148:bipush          10
	//   80  150:invokestatic    #198 <Method int Integer.parseInt(String, int)>
	//   81  153:invokestatic    #200 <Method int argb(int, int, int, int)>
	//   82  156:ireturn         
		} else
		if(s.startsWith("rgb"))
	//*  83  157:aload_0         
	//*  84  158:ldc1            #39  <String "rgb">
	//*  85  160:invokevirtual   #181 <Method boolean String.startsWith(String)>
	//*  86  163:ifeq            215
		{
			s = ((String) (RGB_PATTERN.matcher(((CharSequence) (s)))));
	//   87  166:getstatic       #67  <Field Pattern RGB_PATTERN>
	//   88  169:aload_0         
	//   89  170:invokevirtual   #185 <Method Matcher Pattern.matcher(CharSequence)>
	//   90  173:astore_0        
			if(((Matcher) (s)).matches())
	//*  91  174:aload_0         
	//*  92  175:invokevirtual   #191 <Method boolean Matcher.matches()>
	//*  93  178:ifeq            240
				return rgb(Integer.parseInt(((Matcher) (s)).group(1), 10), Integer.parseInt(((Matcher) (s)).group(2), 10), Integer.parseInt(((Matcher) (s)).group(3), 10));
	//   94  181:aload_0         
	//   95  182:iconst_1        
	//   96  183:invokevirtual   #194 <Method String Matcher.group(int)>
	//   97  186:bipush          10
	//   98  188:invokestatic    #198 <Method int Integer.parseInt(String, int)>
	//   99  191:aload_0         
	//  100  192:iconst_2        
	//  101  193:invokevirtual   #194 <Method String Matcher.group(int)>
	//  102  196:bipush          10
	//  103  198:invokestatic    #198 <Method int Integer.parseInt(String, int)>
	//  104  201:aload_0         
	//  105  202:iconst_3        
	//  106  203:invokevirtual   #194 <Method String Matcher.group(int)>
	//  107  206:bipush          10
	//  108  208:invokestatic    #198 <Method int Integer.parseInt(String, int)>
	//  109  211:invokestatic    #203 <Method int rgb(int, int, int)>
	//  110  214:ireturn         
		} else
		{
			s = ((String) ((Integer)COLOR_NAME_MAP.get(((Object) (Util.toLowerInvariant(s))))));
	//  111  215:getstatic       #78  <Field Map COLOR_NAME_MAP>
	//  112  218:aload_0         
	//  113  219:invokestatic    #209 <Method String Util.toLowerInvariant(String)>
	//  114  222:invokeinterface #213 <Method Object Map.get(Object)>
	//  115  227:checkcast       #82  <Class Integer>
	//  116  230:astore_0        
			if(s != null)
	//* 117  231:aload_0         
	//* 118  232:ifnull          240
				return ((Integer) (s)).intValue();
	//  119  235:aload_0         
	//  120  236:invokevirtual   #216 <Method int Integer.intValue()>
	//  121  239:ireturn         
		}
		throw new IllegalArgumentException();
	//  122  240:new             #176 <Class IllegalArgumentException>
	//  123  243:dup             
	//  124  244:invokespecial   #177 <Method void IllegalArgumentException()>
	//  125  247:athrow          
	}

	private static int rgb(int i, int j, int k)
	{
		return argb(255, i, j, k);
	//    0    0:sipush          255
	//    1    3:iload_0         
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #200 <Method int argb(int, int, int, int)>
	//    5    9:ireturn         
	}

	static final int AQUA = 0xffffff;
	static final int BLACK = 0xff000000;
	static final int BLUE = 0xff0000ff;
	private static final Map COLOR_NAME_MAP;
	static final int CYAN = 0xff00ffff;
	static final int FUCHSIA = -65281;
	static final int GRAY = 0xff808080;
	static final int GREEN = 0xff008000;
	static final int LIME = 0xff00ff00;
	static final int MAGENTA = -65281;
	static final int MAROON = 0xff800000;
	static final int NAVY = 0xff000080;
	static final int OLIVE = 0xff808000;
	static final int PURPLE = 0xff800080;
	static final int RED = 0xffff0000;
	private static final String RGB = "rgb";
	private static final String RGBA = "rgba";
	private static final Pattern RGBA_PATTERN = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
	private static final Pattern RGB_PATTERN = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
	static final int SILVER = 0xffc0c0c0;
	static final int TEAL = 0xff008080;
	static final int TRANSPARENT = 0;
	static final int WHITE = -1;
	static final int YELLOW = -256;

	static 
	{
	//    0    0:ldc1            #59  <String "^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$">
	//    1    2:invokestatic    #65  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #67  <Field Pattern RGB_PATTERN>
	//    3    8:ldc1            #69  <String "^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$">
	//    4   10:invokestatic    #65  <Method Pattern Pattern.compile(String)>
	//    5   13:putstatic       #71  <Field Pattern RGBA_PATTERN>
		COLOR_NAME_MAP = ((Map) (new HashMap()));
	//    6   16:new             #73  <Class HashMap>
	//    7   19:dup             
	//    8   20:invokespecial   #76  <Method void HashMap()>
	//    9   23:putstatic       #78  <Field Map COLOR_NAME_MAP>
		COLOR_NAME_MAP.put("transparent", ((Object) (Integer.valueOf(0))));
	//   10   26:getstatic       #78  <Field Map COLOR_NAME_MAP>
	//   11   29:ldc1            #80  <String "transparent">
	//   12   31:iconst_0        
	//   13   32:invokestatic    #86  <Method Integer Integer.valueOf(int)>
	//   14   35:invokeinterface #92  <Method Object Map.put(Object, Object)>
	//   15   40:pop             
		COLOR_NAME_MAP.put("black", ((Object) (Integer.valueOf(0xff000000))));
	//   16   41:getstatic       #78  <Field Map COLOR_NAME_MAP>
	//   17   44:ldc1            #94  <String "black">
	//   18   46:ldc1            #9   <Int 0xff000000>
	//   19   48:invokestatic    #86  <Method Integer Integer.valueOf(int)>
	//   20   51:invokeinterface #92  <Method Object Map.put(Object, Object)>
	//   21   56:pop             
		COLOR_NAME_MAP.put("silver", ((Object) (Integer.valueOf(0xffc0c0c0))));
	//   22   57:getstatic       #78  <Field Map COLOR_NAME_MAP>
	//   23   60:ldc1            #96  <String "silver">
	//   24   62:ldc1            #47  <Int 0xffc0c0c0>
	//   25   64:invokestatic    #86  <Method Integer Integer.valueOf(int)>
	//   26   67:invokeinterface #92  <Method Object Map.put(Object, Object)>
	//   27   72:pop             
		COLOR_NAME_MAP.put("gray", ((Object) (Integer.valueOf(0xff808080))));
	//   28   73:getstatic       #78  <Field Map COLOR_NAME_MAP>
	//   29   76:ldc1            #98  <String "gray">
	//   30   78:ldc1            #20  <Int 0xff808080>
	//   31   80:invokestatic    #86  <Method Integer Integer.valueOf(int)>
	//   32   83:invokeinterface #92  <Method Object Map.put(Object, Object)>
	//   33   88:pop             
		COLOR_NAME_MAP.put("white", ((Object) (Integer.valueOf(-1))));
	//   34   89:getstatic       #78  <Field Map COLOR_NAME_MAP>
	//   35   92:ldc1            #100 <String "white">
	//   36   94:iconst_m1       
	//   37   95:invokestatic    #86  <Method Integer Integer.valueOf(int)>
	//   38   98:invokeinterface #92  <Method Object Map.put(Object, Object)>
	//   39  103:pop             
		COLOR_NAME_MAP.put("maroon", ((Object) (Integer.valueOf(0xff800000))));
	//   40  104:getstatic       #78  <Field Map COLOR_NAME_MAP>
	//   41  107:ldc1            #102 <String "maroon">
	//   42  109:ldc1            #27  <Int 0xff800000>
	//   43  111:invokestatic    #86  <Method Integer Integer.valueOf(int)>
	//   44  114:invokeinterface #92  <Method Object Map.put(Object, Object)>
	//   45  119:pop             
		COLOR_NAME_MAP.put("red", ((Object) (Integer.valueOf(0xffff0000))));
	//   46  120:getstatic       #78  <Field Map COLOR_NAME_MAP>
	//   47  123:ldc1            #104 <String "red">
	//   48  125:ldc1            #35  <Int 0xffff0000>
	//   49  127:invokestatic    #86  <Method Integer Integer.valueOf(int)>
	//   50  130:invokeinterface #92  <Method Object Map.put(Object, Object)>
	//   51  135:pop             
		COLOR_NAME_MAP.put("purple", ((Object) (Integer.valueOf(0xff800080))));
	//   52  136:getstatic       #78  <Field Map COLOR_NAME_MAP>
	//   53  139:ldc1            #106 <String "purple">
	//   54  141:ldc1            #33  <Int 0xff800080>
	//   55  143:invokestatic    #86  <Method Integer Integer.valueOf(int)>
	//   56  146:invokeinterface #92  <Method Object Map.put(Object, Object)>
	//   57  151:pop             
		COLOR_NAME_MAP.put("fuchsia", ((Object) (Integer.valueOf(-65281))));
	//   58  152:getstatic       #78  <Field Map COLOR_NAME_MAP>
	//   59  155:ldc1            #108 <String "fuchsia">
	//   60  157:ldc1            #18  <Int -65281>
	//   61  159:invokestatic    #86  <Method Integer Integer.valueOf(int)>
	//   62  162:invokeinterface #92  <Method Object Map.put(Object, Object)>
	//   63  167:pop             
		COLOR_NAME_MAP.put("magenta", ((Object) (Integer.valueOf(-65281))));
	//   64  168:getstatic       #78  <Field Map COLOR_NAME_MAP>
	//   65  171:ldc1            #110 <String "magenta">
	//   66  173:ldc1            #18  <Int -65281>
	//   67  175:invokestatic    #86  <Method Integer Integer.valueOf(int)>
	//   68  178:invokeinterface #92  <Method Object Map.put(Object, Object)>
	//   69  183:pop             
		COLOR_NAME_MAP.put("green", ((Object) (Integer.valueOf(0xff008000))));
	//   70  184:getstatic       #78  <Field Map COLOR_NAME_MAP>
	//   71  187:ldc1            #112 <String "green">
	//   72  189:ldc1            #22  <Int 0xff008000>
	//   73  191:invokestatic    #86  <Method Integer Integer.valueOf(int)>
	//   74  194:invokeinterface #92  <Method Object Map.put(Object, Object)>
	//   75  199:pop             
		COLOR_NAME_MAP.put("lime", ((Object) (Integer.valueOf(0xff00ff00))));
	//   76  200:getstatic       #78  <Field Map COLOR_NAME_MAP>
	//   77  203:ldc1            #114 <String "lime">
	//   78  205:ldc1            #24  <Int 0xff00ff00>
	//   79  207:invokestatic    #86  <Method Integer Integer.valueOf(int)>
	//   80  210:invokeinterface #92  <Method Object Map.put(Object, Object)>
	//   81  215:pop             
		COLOR_NAME_MAP.put("olive", ((Object) (Integer.valueOf(0xff808000))));
	//   82  216:getstatic       #78  <Field Map COLOR_NAME_MAP>
	//   83  219:ldc1            #116 <String "olive">
	//   84  221:ldc1            #31  <Int 0xff808000>
	//   85  223:invokestatic    #86  <Method Integer Integer.valueOf(int)>
	//   86  226:invokeinterface #92  <Method Object Map.put(Object, Object)>
	//   87  231:pop             
		COLOR_NAME_MAP.put("yellow", ((Object) (Integer.valueOf(-256))));
	//   88  232:getstatic       #78  <Field Map COLOR_NAME_MAP>
	//   89  235:ldc1            #118 <String "yellow">
	//   90  237:sipush          -256
	//   91  240:invokestatic    #86  <Method Integer Integer.valueOf(int)>
	//   92  243:invokeinterface #92  <Method Object Map.put(Object, Object)>
	//   93  248:pop             
		COLOR_NAME_MAP.put("navy", ((Object) (Integer.valueOf(0xff000080))));
	//   94  249:getstatic       #78  <Field Map COLOR_NAME_MAP>
	//   95  252:ldc1            #120 <String "navy">
	//   96  254:ldc1            #29  <Int 0xff000080>
	//   97  256:invokestatic    #86  <Method Integer Integer.valueOf(int)>
	//   98  259:invokeinterface #92  <Method Object Map.put(Object, Object)>
	//   99  264:pop             
		COLOR_NAME_MAP.put("blue", ((Object) (Integer.valueOf(0xff0000ff))));
	//  100  265:getstatic       #78  <Field Map COLOR_NAME_MAP>
	//  101  268:ldc1            #122 <String "blue">
	//  102  270:ldc1            #11  <Int 0xff0000ff>
	//  103  272:invokestatic    #86  <Method Integer Integer.valueOf(int)>
	//  104  275:invokeinterface #92  <Method Object Map.put(Object, Object)>
	//  105  280:pop             
		COLOR_NAME_MAP.put("teal", ((Object) (Integer.valueOf(0xff008080))));
	//  106  281:getstatic       #78  <Field Map COLOR_NAME_MAP>
	//  107  284:ldc1            #124 <String "teal">
	//  108  286:ldc1            #49  <Int 0xff008080>
	//  109  288:invokestatic    #86  <Method Integer Integer.valueOf(int)>
	//  110  291:invokeinterface #92  <Method Object Map.put(Object, Object)>
	//  111  296:pop             
		COLOR_NAME_MAP.put("aqua", ((Object) (Integer.valueOf(0xffffff))));
	//  112  297:getstatic       #78  <Field Map COLOR_NAME_MAP>
	//  113  300:ldc1            #126 <String "aqua">
	//  114  302:ldc1            #7   <Int 0xffffff>
	//  115  304:invokestatic    #86  <Method Integer Integer.valueOf(int)>
	//  116  307:invokeinterface #92  <Method Object Map.put(Object, Object)>
	//  117  312:pop             
		COLOR_NAME_MAP.put("cyan", ((Object) (Integer.valueOf(0xff00ffff))));
	//  118  313:getstatic       #78  <Field Map COLOR_NAME_MAP>
	//  119  316:ldc1            #128 <String "cyan">
	//  120  318:ldc1            #16  <Int 0xff00ffff>
	//  121  320:invokestatic    #86  <Method Integer Integer.valueOf(int)>
	//  122  323:invokeinterface #92  <Method Object Map.put(Object, Object)>
	//  123  328:pop             
	//* 124  329:return          
	}
}
