// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap.gloverlay;


// Referenced classes of package com.autonavi.ae.gmap.gloverlay:
//			GLRouteProperty

public static final class GLRouteProperty$EAMapRouteTexture extends Enum
{

	public static GLRouteProperty$EAMapRouteTexture valueOf(String s)
	{
		return (GLRouteProperty$EAMapRouteTexture)Enum.valueOf(com/autonavi/ae/gmap/gloverlay/GLRouteProperty$EAMapRouteTexture, s);
	//    0    0:ldc1            #2   <Class GLRouteProperty$EAMapRouteTexture>
	//    1    2:aload_0         
	//    2    3:invokestatic    #91  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class GLRouteProperty$EAMapRouteTexture>
	//    4    9:areturn         
	}

	public static GLRouteProperty$EAMapRouteTexture[] values()
	{
		return (GLRouteProperty$EAMapRouteTexture[])((GLRouteProperty$EAMapRouteTexture []) ($VALUES)).clone();
	//    0    0:getstatic       #83  <Field GLRouteProperty$EAMapRouteTexture[] $VALUES>
	//    1    3:invokevirtual   #98  <Method Object _5B_Lcom.autonavi.ae.gmap.gloverlay.GLRouteProperty$EAMapRouteTexture_3B_.clone()>
	//    2    6:checkcast       #94  <Class GLRouteProperty$EAMapRouteTexture[]>
	//    3    9:areturn         
	}

	private static final GLRouteProperty$EAMapRouteTexture $VALUES[];
	public static final GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_AMBLE;
	public static final GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_ARROW;
	public static final GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_CHARGE;
	public static final GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_CONGESTED;
	public static final GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_DEFAULT;
	public static final GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_FASTER;
	public static final GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_FERRY;
	public static final GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_FREE;
	public static final GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_JAM;
	public static final GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_LIMIT;
	public static final GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_NAVI;
	public static final GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_NONAVI;
	public static final GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_NUMBER;
	public static final GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_OPEN;
	public static final GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_SLOWER;
	public static final GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_WRONG;

	static 
	{
		AMAP_ROUTE_TEXTURE_NONAVI = new GLRouteProperty$EAMapRouteTexture("AMAP_ROUTE_TEXTURE_NONAVI", 0);
	//    0    0:new             #2   <Class GLRouteProperty$EAMapRouteTexture>
	//    1    3:dup             
	//    2    4:ldc1            #30  <String "AMAP_ROUTE_TEXTURE_NONAVI">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #34  <Method void GLRouteProperty$EAMapRouteTexture(String, int)>
	//    5   10:putstatic       #36  <Field GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_NONAVI>
		AMAP_ROUTE_TEXTURE_NAVI = new GLRouteProperty$EAMapRouteTexture("AMAP_ROUTE_TEXTURE_NAVI", 1);
	//    6   13:new             #2   <Class GLRouteProperty$EAMapRouteTexture>
	//    7   16:dup             
	//    8   17:ldc1            #37  <String "AMAP_ROUTE_TEXTURE_NAVI">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #34  <Method void GLRouteProperty$EAMapRouteTexture(String, int)>
	//   11   23:putstatic       #39  <Field GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_NAVI>
		AMAP_ROUTE_TEXTURE_DEFAULT = new GLRouteProperty$EAMapRouteTexture("AMAP_ROUTE_TEXTURE_DEFAULT", 2);
	//   12   26:new             #2   <Class GLRouteProperty$EAMapRouteTexture>
	//   13   29:dup             
	//   14   30:ldc1            #40  <String "AMAP_ROUTE_TEXTURE_DEFAULT">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #34  <Method void GLRouteProperty$EAMapRouteTexture(String, int)>
	//   17   36:putstatic       #42  <Field GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_DEFAULT>
		AMAP_ROUTE_TEXTURE_OPEN = new GLRouteProperty$EAMapRouteTexture("AMAP_ROUTE_TEXTURE_OPEN", 3);
	//   18   39:new             #2   <Class GLRouteProperty$EAMapRouteTexture>
	//   19   42:dup             
	//   20   43:ldc1            #43  <String "AMAP_ROUTE_TEXTURE_OPEN">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #34  <Method void GLRouteProperty$EAMapRouteTexture(String, int)>
	//   23   49:putstatic       #45  <Field GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_OPEN>
		AMAP_ROUTE_TEXTURE_AMBLE = new GLRouteProperty$EAMapRouteTexture("AMAP_ROUTE_TEXTURE_AMBLE", 4);
	//   24   52:new             #2   <Class GLRouteProperty$EAMapRouteTexture>
	//   25   55:dup             
	//   26   56:ldc1            #46  <String "AMAP_ROUTE_TEXTURE_AMBLE">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #34  <Method void GLRouteProperty$EAMapRouteTexture(String, int)>
	//   29   62:putstatic       #48  <Field GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_AMBLE>
		AMAP_ROUTE_TEXTURE_JAM = new GLRouteProperty$EAMapRouteTexture("AMAP_ROUTE_TEXTURE_JAM", 5);
	//   30   65:new             #2   <Class GLRouteProperty$EAMapRouteTexture>
	//   31   68:dup             
	//   32   69:ldc1            #49  <String "AMAP_ROUTE_TEXTURE_JAM">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #34  <Method void GLRouteProperty$EAMapRouteTexture(String, int)>
	//   35   75:putstatic       #51  <Field GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_JAM>
		AMAP_ROUTE_TEXTURE_CONGESTED = new GLRouteProperty$EAMapRouteTexture("AMAP_ROUTE_TEXTURE_CONGESTED", 6);
	//   36   78:new             #2   <Class GLRouteProperty$EAMapRouteTexture>
	//   37   81:dup             
	//   38   82:ldc1            #52  <String "AMAP_ROUTE_TEXTURE_CONGESTED">
	//   39   84:bipush          6
	//   40   86:invokespecial   #34  <Method void GLRouteProperty$EAMapRouteTexture(String, int)>
	//   41   89:putstatic       #54  <Field GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_CONGESTED>
		AMAP_ROUTE_TEXTURE_ARROW = new GLRouteProperty$EAMapRouteTexture("AMAP_ROUTE_TEXTURE_ARROW", 7);
	//   42   92:new             #2   <Class GLRouteProperty$EAMapRouteTexture>
	//   43   95:dup             
	//   44   96:ldc1            #55  <String "AMAP_ROUTE_TEXTURE_ARROW">
	//   45   98:bipush          7
	//   46  100:invokespecial   #34  <Method void GLRouteProperty$EAMapRouteTexture(String, int)>
	//   47  103:putstatic       #57  <Field GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_ARROW>
		AMAP_ROUTE_TEXTURE_CHARGE = new GLRouteProperty$EAMapRouteTexture("AMAP_ROUTE_TEXTURE_CHARGE", 8);
	//   48  106:new             #2   <Class GLRouteProperty$EAMapRouteTexture>
	//   49  109:dup             
	//   50  110:ldc1            #58  <String "AMAP_ROUTE_TEXTURE_CHARGE">
	//   51  112:bipush          8
	//   52  114:invokespecial   #34  <Method void GLRouteProperty$EAMapRouteTexture(String, int)>
	//   53  117:putstatic       #60  <Field GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_CHARGE>
		AMAP_ROUTE_TEXTURE_FREE = new GLRouteProperty$EAMapRouteTexture("AMAP_ROUTE_TEXTURE_FREE", 9);
	//   54  120:new             #2   <Class GLRouteProperty$EAMapRouteTexture>
	//   55  123:dup             
	//   56  124:ldc1            #61  <String "AMAP_ROUTE_TEXTURE_FREE">
	//   57  126:bipush          9
	//   58  128:invokespecial   #34  <Method void GLRouteProperty$EAMapRouteTexture(String, int)>
	//   59  131:putstatic       #63  <Field GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_FREE>
		AMAP_ROUTE_TEXTURE_LIMIT = new GLRouteProperty$EAMapRouteTexture("AMAP_ROUTE_TEXTURE_LIMIT", 10);
	//   60  134:new             #2   <Class GLRouteProperty$EAMapRouteTexture>
	//   61  137:dup             
	//   62  138:ldc1            #64  <String "AMAP_ROUTE_TEXTURE_LIMIT">
	//   63  140:bipush          10
	//   64  142:invokespecial   #34  <Method void GLRouteProperty$EAMapRouteTexture(String, int)>
	//   65  145:putstatic       #66  <Field GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_LIMIT>
		AMAP_ROUTE_TEXTURE_SLOWER = new GLRouteProperty$EAMapRouteTexture("AMAP_ROUTE_TEXTURE_SLOWER", 11);
	//   66  148:new             #2   <Class GLRouteProperty$EAMapRouteTexture>
	//   67  151:dup             
	//   68  152:ldc1            #67  <String "AMAP_ROUTE_TEXTURE_SLOWER">
	//   69  154:bipush          11
	//   70  156:invokespecial   #34  <Method void GLRouteProperty$EAMapRouteTexture(String, int)>
	//   71  159:putstatic       #69  <Field GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_SLOWER>
		AMAP_ROUTE_TEXTURE_FASTER = new GLRouteProperty$EAMapRouteTexture("AMAP_ROUTE_TEXTURE_FASTER", 12);
	//   72  162:new             #2   <Class GLRouteProperty$EAMapRouteTexture>
	//   73  165:dup             
	//   74  166:ldc1            #70  <String "AMAP_ROUTE_TEXTURE_FASTER">
	//   75  168:bipush          12
	//   76  170:invokespecial   #34  <Method void GLRouteProperty$EAMapRouteTexture(String, int)>
	//   77  173:putstatic       #72  <Field GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_FASTER>
		AMAP_ROUTE_TEXTURE_WRONG = new GLRouteProperty$EAMapRouteTexture("AMAP_ROUTE_TEXTURE_WRONG", 13);
	//   78  176:new             #2   <Class GLRouteProperty$EAMapRouteTexture>
	//   79  179:dup             
	//   80  180:ldc1            #73  <String "AMAP_ROUTE_TEXTURE_WRONG">
	//   81  182:bipush          13
	//   82  184:invokespecial   #34  <Method void GLRouteProperty$EAMapRouteTexture(String, int)>
	//   83  187:putstatic       #75  <Field GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_WRONG>
		AMAP_ROUTE_TEXTURE_FERRY = new GLRouteProperty$EAMapRouteTexture("AMAP_ROUTE_TEXTURE_FERRY", 14);
	//   84  190:new             #2   <Class GLRouteProperty$EAMapRouteTexture>
	//   85  193:dup             
	//   86  194:ldc1            #76  <String "AMAP_ROUTE_TEXTURE_FERRY">
	//   87  196:bipush          14
	//   88  198:invokespecial   #34  <Method void GLRouteProperty$EAMapRouteTexture(String, int)>
	//   89  201:putstatic       #78  <Field GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_FERRY>
		AMAP_ROUTE_TEXTURE_NUMBER = new GLRouteProperty$EAMapRouteTexture("AMAP_ROUTE_TEXTURE_NUMBER", 15);
	//   90  204:new             #2   <Class GLRouteProperty$EAMapRouteTexture>
	//   91  207:dup             
	//   92  208:ldc1            #79  <String "AMAP_ROUTE_TEXTURE_NUMBER">
	//   93  210:bipush          15
	//   94  212:invokespecial   #34  <Method void GLRouteProperty$EAMapRouteTexture(String, int)>
	//   95  215:putstatic       #81  <Field GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_NUMBER>
		$VALUES = (new GLRouteProperty$EAMapRouteTexture[] {
			AMAP_ROUTE_TEXTURE_NONAVI, AMAP_ROUTE_TEXTURE_NAVI, AMAP_ROUTE_TEXTURE_DEFAULT, AMAP_ROUTE_TEXTURE_OPEN, AMAP_ROUTE_TEXTURE_AMBLE, AMAP_ROUTE_TEXTURE_JAM, AMAP_ROUTE_TEXTURE_CONGESTED, AMAP_ROUTE_TEXTURE_ARROW, AMAP_ROUTE_TEXTURE_CHARGE, AMAP_ROUTE_TEXTURE_FREE, 
			AMAP_ROUTE_TEXTURE_LIMIT, AMAP_ROUTE_TEXTURE_SLOWER, AMAP_ROUTE_TEXTURE_FASTER, AMAP_ROUTE_TEXTURE_WRONG, AMAP_ROUTE_TEXTURE_FERRY, AMAP_ROUTE_TEXTURE_NUMBER
		});
	//   96  218:bipush          16
	//   97  220:anewarray       GLRouteProperty$EAMapRouteTexture[]
	//   98  223:dup             
	//   99  224:iconst_0        
	//  100  225:getstatic       #36  <Field GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_NONAVI>
	//  101  228:aastore         
	//  102  229:dup             
	//  103  230:iconst_1        
	//  104  231:getstatic       #39  <Field GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_NAVI>
	//  105  234:aastore         
	//  106  235:dup             
	//  107  236:iconst_2        
	//  108  237:getstatic       #42  <Field GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_DEFAULT>
	//  109  240:aastore         
	//  110  241:dup             
	//  111  242:iconst_3        
	//  112  243:getstatic       #45  <Field GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_OPEN>
	//  113  246:aastore         
	//  114  247:dup             
	//  115  248:iconst_4        
	//  116  249:getstatic       #48  <Field GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_AMBLE>
	//  117  252:aastore         
	//  118  253:dup             
	//  119  254:iconst_5        
	//  120  255:getstatic       #51  <Field GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_JAM>
	//  121  258:aastore         
	//  122  259:dup             
	//  123  260:bipush          6
	//  124  262:getstatic       #54  <Field GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_CONGESTED>
	//  125  265:aastore         
	//  126  266:dup             
	//  127  267:bipush          7
	//  128  269:getstatic       #57  <Field GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_ARROW>
	//  129  272:aastore         
	//  130  273:dup             
	//  131  274:bipush          8
	//  132  276:getstatic       #60  <Field GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_CHARGE>
	//  133  279:aastore         
	//  134  280:dup             
	//  135  281:bipush          9
	//  136  283:getstatic       #63  <Field GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_FREE>
	//  137  286:aastore         
	//  138  287:dup             
	//  139  288:bipush          10
	//  140  290:getstatic       #66  <Field GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_LIMIT>
	//  141  293:aastore         
	//  142  294:dup             
	//  143  295:bipush          11
	//  144  297:getstatic       #69  <Field GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_SLOWER>
	//  145  300:aastore         
	//  146  301:dup             
	//  147  302:bipush          12
	//  148  304:getstatic       #72  <Field GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_FASTER>
	//  149  307:aastore         
	//  150  308:dup             
	//  151  309:bipush          13
	//  152  311:getstatic       #75  <Field GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_WRONG>
	//  153  314:aastore         
	//  154  315:dup             
	//  155  316:bipush          14
	//  156  318:getstatic       #78  <Field GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_FERRY>
	//  157  321:aastore         
	//  158  322:dup             
	//  159  323:bipush          15
	//  160  325:getstatic       #81  <Field GLRouteProperty$EAMapRouteTexture AMAP_ROUTE_TEXTURE_NUMBER>
	//  161  328:aastore         
	//  162  329:putstatic       #83  <Field GLRouteProperty$EAMapRouteTexture[] $VALUES>
	//* 163  332:return          
	}

	private GLRouteProperty$EAMapRouteTexture(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #85  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
