// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.qrcode;

import java.util.HashMap;

public final class CharacterSetECI
{

	private CharacterSetECI(int i, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		encodingName = s;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #18  <Field String encodingName>
		value = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #20  <Field int value>
	//    8   14:return          
	}

	private static void addCharacterSet(int i, String s, HashMap hashmap)
	{
		hashmap.put(((Object) (s)), ((Object) (new CharacterSetECI(i, s))));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:new             #2   <Class CharacterSetECI>
	//    3    5:dup             
	//    4    6:iload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #25  <Method void CharacterSetECI(int, String)>
	//    7   11:invokevirtual   #31  <Method Object HashMap.put(Object, Object)>
	//    8   14:pop             
	//    9   15:return          
	}

	private static void addCharacterSet(int i, String as[], HashMap hashmap)
	{
		CharacterSetECI characterseteci = new CharacterSetECI(i, as[0]);
	//    0    0:new             #2   <Class CharacterSetECI>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:aaload          
	//    6    8:invokespecial   #25  <Method void CharacterSetECI(int, String)>
	//    7   11:astore_3        
		for(i = 0; i < as.length; i++)
	//*   8   12:iconst_0        
	//*   9   13:istore_0        
	//*  10   14:iload_0         
	//*  11   15:aload_1         
	//*  12   16:arraylength     
	//*  13   17:icmpge          36
			hashmap.put(((Object) (as[i])), ((Object) (characterseteci)));
	//   14   20:aload_2         
	//   15   21:aload_1         
	//   16   22:iload_0         
	//   17   23:aaload          
	//   18   24:aload_3         
	//   19   25:invokevirtual   #31  <Method Object HashMap.put(Object, Object)>
	//   20   28:pop             

	//   21   29:iload_0         
	//   22   30:iconst_1        
	//   23   31:iadd            
	//   24   32:istore_0        
	//*  25   33:goto            14
	//   26   36:return          
	}

	public static CharacterSetECI getCharacterSetECIByName(String s)
	{
		if(NAME_TO_ECI == null)
	//*   0    0:getstatic       #39  <Field HashMap NAME_TO_ECI>
	//*   1    3:ifnonnull       9
			initialize();
	//    2    6:invokestatic    #42  <Method void initialize()>
		return (CharacterSetECI)NAME_TO_ECI.get(((Object) (s)));
	//    3    9:getstatic       #39  <Field HashMap NAME_TO_ECI>
	//    4   12:aload_0         
	//    5   13:invokevirtual   #46  <Method Object HashMap.get(Object)>
	//    6   16:checkcast       #2   <Class CharacterSetECI>
	//    7   19:areturn         
	}

	private static void initialize()
	{
		HashMap hashmap = new HashMap(29);
	//    0    0:new             #27  <Class HashMap>
	//    1    3:dup             
	//    2    4:bipush          29
	//    3    6:invokespecial   #49  <Method void HashMap(int)>
	//    4    9:astore_0        
		addCharacterSet(0, "Cp437", hashmap);
	//    5   10:iconst_0        
	//    6   11:ldc1            #51  <String "Cp437">
	//    7   13:aload_0         
	//    8   14:invokestatic    #53  <Method void addCharacterSet(int, String, HashMap)>
		addCharacterSet(1, new String[] {
			"ISO8859_1", "ISO-8859-1"
		}, hashmap);
	//    9   17:iconst_1        
	//   10   18:iconst_2        
	//   11   19:anewarray       String[]
	//   12   22:dup             
	//   13   23:iconst_0        
	//   14   24:ldc1            #57  <String "ISO8859_1">
	//   15   26:aastore         
	//   16   27:dup             
	//   17   28:iconst_1        
	//   18   29:ldc1            #59  <String "ISO-8859-1">
	//   19   31:aastore         
	//   20   32:aload_0         
	//   21   33:invokestatic    #61  <Method void addCharacterSet(int, String[], HashMap)>
		addCharacterSet(2, "Cp437", hashmap);
	//   22   36:iconst_2        
	//   23   37:ldc1            #51  <String "Cp437">
	//   24   39:aload_0         
	//   25   40:invokestatic    #53  <Method void addCharacterSet(int, String, HashMap)>
		addCharacterSet(3, new String[] {
			"ISO8859_1", "ISO-8859-1"
		}, hashmap);
	//   26   43:iconst_3        
	//   27   44:iconst_2        
	//   28   45:anewarray       String[]
	//   29   48:dup             
	//   30   49:iconst_0        
	//   31   50:ldc1            #57  <String "ISO8859_1">
	//   32   52:aastore         
	//   33   53:dup             
	//   34   54:iconst_1        
	//   35   55:ldc1            #59  <String "ISO-8859-1">
	//   36   57:aastore         
	//   37   58:aload_0         
	//   38   59:invokestatic    #61  <Method void addCharacterSet(int, String[], HashMap)>
		addCharacterSet(4, new String[] {
			"ISO8859_2", "ISO-8859-2"
		}, hashmap);
	//   39   62:iconst_4        
	//   40   63:iconst_2        
	//   41   64:anewarray       String[]
	//   42   67:dup             
	//   43   68:iconst_0        
	//   44   69:ldc1            #63  <String "ISO8859_2">
	//   45   71:aastore         
	//   46   72:dup             
	//   47   73:iconst_1        
	//   48   74:ldc1            #65  <String "ISO-8859-2">
	//   49   76:aastore         
	//   50   77:aload_0         
	//   51   78:invokestatic    #61  <Method void addCharacterSet(int, String[], HashMap)>
		addCharacterSet(5, new String[] {
			"ISO8859_3", "ISO-8859-3"
		}, hashmap);
	//   52   81:iconst_5        
	//   53   82:iconst_2        
	//   54   83:anewarray       String[]
	//   55   86:dup             
	//   56   87:iconst_0        
	//   57   88:ldc1            #67  <String "ISO8859_3">
	//   58   90:aastore         
	//   59   91:dup             
	//   60   92:iconst_1        
	//   61   93:ldc1            #69  <String "ISO-8859-3">
	//   62   95:aastore         
	//   63   96:aload_0         
	//   64   97:invokestatic    #61  <Method void addCharacterSet(int, String[], HashMap)>
		addCharacterSet(6, new String[] {
			"ISO8859_4", "ISO-8859-4"
		}, hashmap);
	//   65  100:bipush          6
	//   66  102:iconst_2        
	//   67  103:anewarray       String[]
	//   68  106:dup             
	//   69  107:iconst_0        
	//   70  108:ldc1            #71  <String "ISO8859_4">
	//   71  110:aastore         
	//   72  111:dup             
	//   73  112:iconst_1        
	//   74  113:ldc1            #73  <String "ISO-8859-4">
	//   75  115:aastore         
	//   76  116:aload_0         
	//   77  117:invokestatic    #61  <Method void addCharacterSet(int, String[], HashMap)>
		addCharacterSet(7, new String[] {
			"ISO8859_5", "ISO-8859-5"
		}, hashmap);
	//   78  120:bipush          7
	//   79  122:iconst_2        
	//   80  123:anewarray       String[]
	//   81  126:dup             
	//   82  127:iconst_0        
	//   83  128:ldc1            #75  <String "ISO8859_5">
	//   84  130:aastore         
	//   85  131:dup             
	//   86  132:iconst_1        
	//   87  133:ldc1            #77  <String "ISO-8859-5">
	//   88  135:aastore         
	//   89  136:aload_0         
	//   90  137:invokestatic    #61  <Method void addCharacterSet(int, String[], HashMap)>
		addCharacterSet(8, new String[] {
			"ISO8859_6", "ISO-8859-6"
		}, hashmap);
	//   91  140:bipush          8
	//   92  142:iconst_2        
	//   93  143:anewarray       String[]
	//   94  146:dup             
	//   95  147:iconst_0        
	//   96  148:ldc1            #79  <String "ISO8859_6">
	//   97  150:aastore         
	//   98  151:dup             
	//   99  152:iconst_1        
	//  100  153:ldc1            #81  <String "ISO-8859-6">
	//  101  155:aastore         
	//  102  156:aload_0         
	//  103  157:invokestatic    #61  <Method void addCharacterSet(int, String[], HashMap)>
		addCharacterSet(9, new String[] {
			"ISO8859_7", "ISO-8859-7"
		}, hashmap);
	//  104  160:bipush          9
	//  105  162:iconst_2        
	//  106  163:anewarray       String[]
	//  107  166:dup             
	//  108  167:iconst_0        
	//  109  168:ldc1            #83  <String "ISO8859_7">
	//  110  170:aastore         
	//  111  171:dup             
	//  112  172:iconst_1        
	//  113  173:ldc1            #85  <String "ISO-8859-7">
	//  114  175:aastore         
	//  115  176:aload_0         
	//  116  177:invokestatic    #61  <Method void addCharacterSet(int, String[], HashMap)>
		addCharacterSet(10, new String[] {
			"ISO8859_8", "ISO-8859-8"
		}, hashmap);
	//  117  180:bipush          10
	//  118  182:iconst_2        
	//  119  183:anewarray       String[]
	//  120  186:dup             
	//  121  187:iconst_0        
	//  122  188:ldc1            #87  <String "ISO8859_8">
	//  123  190:aastore         
	//  124  191:dup             
	//  125  192:iconst_1        
	//  126  193:ldc1            #89  <String "ISO-8859-8">
	//  127  195:aastore         
	//  128  196:aload_0         
	//  129  197:invokestatic    #61  <Method void addCharacterSet(int, String[], HashMap)>
		addCharacterSet(11, new String[] {
			"ISO8859_9", "ISO-8859-9"
		}, hashmap);
	//  130  200:bipush          11
	//  131  202:iconst_2        
	//  132  203:anewarray       String[]
	//  133  206:dup             
	//  134  207:iconst_0        
	//  135  208:ldc1            #91  <String "ISO8859_9">
	//  136  210:aastore         
	//  137  211:dup             
	//  138  212:iconst_1        
	//  139  213:ldc1            #93  <String "ISO-8859-9">
	//  140  215:aastore         
	//  141  216:aload_0         
	//  142  217:invokestatic    #61  <Method void addCharacterSet(int, String[], HashMap)>
		addCharacterSet(12, new String[] {
			"ISO8859_10", "ISO-8859-10"
		}, hashmap);
	//  143  220:bipush          12
	//  144  222:iconst_2        
	//  145  223:anewarray       String[]
	//  146  226:dup             
	//  147  227:iconst_0        
	//  148  228:ldc1            #95  <String "ISO8859_10">
	//  149  230:aastore         
	//  150  231:dup             
	//  151  232:iconst_1        
	//  152  233:ldc1            #97  <String "ISO-8859-10">
	//  153  235:aastore         
	//  154  236:aload_0         
	//  155  237:invokestatic    #61  <Method void addCharacterSet(int, String[], HashMap)>
		addCharacterSet(13, new String[] {
			"ISO8859_11", "ISO-8859-11"
		}, hashmap);
	//  156  240:bipush          13
	//  157  242:iconst_2        
	//  158  243:anewarray       String[]
	//  159  246:dup             
	//  160  247:iconst_0        
	//  161  248:ldc1            #99  <String "ISO8859_11">
	//  162  250:aastore         
	//  163  251:dup             
	//  164  252:iconst_1        
	//  165  253:ldc1            #101 <String "ISO-8859-11">
	//  166  255:aastore         
	//  167  256:aload_0         
	//  168  257:invokestatic    #61  <Method void addCharacterSet(int, String[], HashMap)>
		addCharacterSet(15, new String[] {
			"ISO8859_13", "ISO-8859-13"
		}, hashmap);
	//  169  260:bipush          15
	//  170  262:iconst_2        
	//  171  263:anewarray       String[]
	//  172  266:dup             
	//  173  267:iconst_0        
	//  174  268:ldc1            #103 <String "ISO8859_13">
	//  175  270:aastore         
	//  176  271:dup             
	//  177  272:iconst_1        
	//  178  273:ldc1            #105 <String "ISO-8859-13">
	//  179  275:aastore         
	//  180  276:aload_0         
	//  181  277:invokestatic    #61  <Method void addCharacterSet(int, String[], HashMap)>
		addCharacterSet(16, new String[] {
			"ISO8859_14", "ISO-8859-14"
		}, hashmap);
	//  182  280:bipush          16
	//  183  282:iconst_2        
	//  184  283:anewarray       String[]
	//  185  286:dup             
	//  186  287:iconst_0        
	//  187  288:ldc1            #107 <String "ISO8859_14">
	//  188  290:aastore         
	//  189  291:dup             
	//  190  292:iconst_1        
	//  191  293:ldc1            #109 <String "ISO-8859-14">
	//  192  295:aastore         
	//  193  296:aload_0         
	//  194  297:invokestatic    #61  <Method void addCharacterSet(int, String[], HashMap)>
		addCharacterSet(17, new String[] {
			"ISO8859_15", "ISO-8859-15"
		}, hashmap);
	//  195  300:bipush          17
	//  196  302:iconst_2        
	//  197  303:anewarray       String[]
	//  198  306:dup             
	//  199  307:iconst_0        
	//  200  308:ldc1            #111 <String "ISO8859_15">
	//  201  310:aastore         
	//  202  311:dup             
	//  203  312:iconst_1        
	//  204  313:ldc1            #113 <String "ISO-8859-15">
	//  205  315:aastore         
	//  206  316:aload_0         
	//  207  317:invokestatic    #61  <Method void addCharacterSet(int, String[], HashMap)>
		addCharacterSet(18, new String[] {
			"ISO8859_16", "ISO-8859-16"
		}, hashmap);
	//  208  320:bipush          18
	//  209  322:iconst_2        
	//  210  323:anewarray       String[]
	//  211  326:dup             
	//  212  327:iconst_0        
	//  213  328:ldc1            #115 <String "ISO8859_16">
	//  214  330:aastore         
	//  215  331:dup             
	//  216  332:iconst_1        
	//  217  333:ldc1            #117 <String "ISO-8859-16">
	//  218  335:aastore         
	//  219  336:aload_0         
	//  220  337:invokestatic    #61  <Method void addCharacterSet(int, String[], HashMap)>
		addCharacterSet(20, new String[] {
			"SJIS", "Shift_JIS"
		}, hashmap);
	//  221  340:bipush          20
	//  222  342:iconst_2        
	//  223  343:anewarray       String[]
	//  224  346:dup             
	//  225  347:iconst_0        
	//  226  348:ldc1            #119 <String "SJIS">
	//  227  350:aastore         
	//  228  351:dup             
	//  229  352:iconst_1        
	//  230  353:ldc1            #121 <String "Shift_JIS">
	//  231  355:aastore         
	//  232  356:aload_0         
	//  233  357:invokestatic    #61  <Method void addCharacterSet(int, String[], HashMap)>
		NAME_TO_ECI = hashmap;
	//  234  360:aload_0         
	//  235  361:putstatic       #39  <Field HashMap NAME_TO_ECI>
	//  236  364:return          
	}

	public String getEncodingName()
	{
		return encodingName;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field String encodingName>
	//    2    4:areturn         
	}

	public int getValue()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field int value>
	//    2    4:ireturn         
	}

	private static HashMap NAME_TO_ECI;
	private final String encodingName;
	private final int value;
}
