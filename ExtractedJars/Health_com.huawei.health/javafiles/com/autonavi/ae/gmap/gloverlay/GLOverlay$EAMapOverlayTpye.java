// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap.gloverlay;


// Referenced classes of package com.autonavi.ae.gmap.gloverlay:
//			GLOverlay

public static final class GLOverlay$EAMapOverlayTpye extends Enum
{

	public static GLOverlay$EAMapOverlayTpye valueOf(String s)
	{
		return (GLOverlay$EAMapOverlayTpye)Enum.valueOf(com/autonavi/ae/gmap/gloverlay/GLOverlay$EAMapOverlayTpye, s);
	//    0    0:ldc1            #2   <Class GLOverlay$EAMapOverlayTpye>
	//    1    2:aload_0         
	//    2    3:invokestatic    #79  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class GLOverlay$EAMapOverlayTpye>
	//    4    9:areturn         
	}

	public static GLOverlay$EAMapOverlayTpye[] values()
	{
		return (GLOverlay$EAMapOverlayTpye[])((GLOverlay$EAMapOverlayTpye []) ($VALUES)).clone();
	//    0    0:getstatic       #71  <Field GLOverlay$EAMapOverlayTpye[] $VALUES>
	//    1    3:invokevirtual   #86  <Method Object _5B_Lcom.autonavi.ae.gmap.gloverlay.GLOverlay$EAMapOverlayTpye_3B_.clone()>
	//    2    6:checkcast       #82  <Class GLOverlay$EAMapOverlayTpye[]>
	//    3    9:areturn         
	}

	private static final GLOverlay$EAMapOverlayTpye $VALUES[];
	public static final GLOverlay$EAMapOverlayTpye AMAPOVERLAY_ARC;
	public static final GLOverlay$EAMapOverlayTpye AMAPOVERLAY_ARROW;
	public static final GLOverlay$EAMapOverlayTpye AMAPOVERLAY_GPS;
	public static final GLOverlay$EAMapOverlayTpye AMAPOVERLAY_MODEL;
	public static final GLOverlay$EAMapOverlayTpye AMAPOVERLAY_NAVI;
	public static final GLOverlay$EAMapOverlayTpye AMAPOVERLAY_PLANE;
	public static final GLOverlay$EAMapOverlayTpye AMAPOVERLAY_POINT;
	public static final GLOverlay$EAMapOverlayTpye AMAPOVERLAY_POLYGON;
	public static final GLOverlay$EAMapOverlayTpye AMAPOVERLAY_POLYLINE;
	public static final GLOverlay$EAMapOverlayTpye AMAPOVERLAY_RCTROUTE;
	public static final GLOverlay$EAMapOverlayTpye AMAPOVERLAY_ROUTE;
	public static final GLOverlay$EAMapOverlayTpye AMAPOVERLAY_VECTOR;
	public static final GLOverlay$EAMapOverlayTpye AMAPOVERLAY_WATERWAVE;

	static 
	{
		AMAPOVERLAY_POINT = new GLOverlay$EAMapOverlayTpye("AMAPOVERLAY_POINT", 0);
	//    0    0:new             #2   <Class GLOverlay$EAMapOverlayTpye>
	//    1    3:dup             
	//    2    4:ldc1            #27  <String "AMAPOVERLAY_POINT">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #31  <Method void GLOverlay$EAMapOverlayTpye(String, int)>
	//    5   10:putstatic       #33  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_POINT>
		AMAPOVERLAY_POLYLINE = new GLOverlay$EAMapOverlayTpye("AMAPOVERLAY_POLYLINE", 1);
	//    6   13:new             #2   <Class GLOverlay$EAMapOverlayTpye>
	//    7   16:dup             
	//    8   17:ldc1            #34  <String "AMAPOVERLAY_POLYLINE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #31  <Method void GLOverlay$EAMapOverlayTpye(String, int)>
	//   11   23:putstatic       #36  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_POLYLINE>
		AMAPOVERLAY_POLYGON = new GLOverlay$EAMapOverlayTpye("AMAPOVERLAY_POLYGON", 2);
	//   12   26:new             #2   <Class GLOverlay$EAMapOverlayTpye>
	//   13   29:dup             
	//   14   30:ldc1            #37  <String "AMAPOVERLAY_POLYGON">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #31  <Method void GLOverlay$EAMapOverlayTpye(String, int)>
	//   17   36:putstatic       #39  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_POLYGON>
		AMAPOVERLAY_NAVI = new GLOverlay$EAMapOverlayTpye("AMAPOVERLAY_NAVI", 3);
	//   18   39:new             #2   <Class GLOverlay$EAMapOverlayTpye>
	//   19   42:dup             
	//   20   43:ldc1            #40  <String "AMAPOVERLAY_NAVI">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #31  <Method void GLOverlay$EAMapOverlayTpye(String, int)>
	//   23   49:putstatic       #42  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_NAVI>
		AMAPOVERLAY_GPS = new GLOverlay$EAMapOverlayTpye("AMAPOVERLAY_GPS", 4);
	//   24   52:new             #2   <Class GLOverlay$EAMapOverlayTpye>
	//   25   55:dup             
	//   26   56:ldc1            #43  <String "AMAPOVERLAY_GPS">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #31  <Method void GLOverlay$EAMapOverlayTpye(String, int)>
	//   29   62:putstatic       #45  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_GPS>
		AMAPOVERLAY_ARC = new GLOverlay$EAMapOverlayTpye("AMAPOVERLAY_ARC", 5);
	//   30   65:new             #2   <Class GLOverlay$EAMapOverlayTpye>
	//   31   68:dup             
	//   32   69:ldc1            #46  <String "AMAPOVERLAY_ARC">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #31  <Method void GLOverlay$EAMapOverlayTpye(String, int)>
	//   35   75:putstatic       #48  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_ARC>
		AMAPOVERLAY_ARROW = new GLOverlay$EAMapOverlayTpye("AMAPOVERLAY_ARROW", 6);
	//   36   78:new             #2   <Class GLOverlay$EAMapOverlayTpye>
	//   37   81:dup             
	//   38   82:ldc1            #49  <String "AMAPOVERLAY_ARROW">
	//   39   84:bipush          6
	//   40   86:invokespecial   #31  <Method void GLOverlay$EAMapOverlayTpye(String, int)>
	//   41   89:putstatic       #51  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_ARROW>
		AMAPOVERLAY_VECTOR = new GLOverlay$EAMapOverlayTpye("AMAPOVERLAY_VECTOR", 7);
	//   42   92:new             #2   <Class GLOverlay$EAMapOverlayTpye>
	//   43   95:dup             
	//   44   96:ldc1            #52  <String "AMAPOVERLAY_VECTOR">
	//   45   98:bipush          7
	//   46  100:invokespecial   #31  <Method void GLOverlay$EAMapOverlayTpye(String, int)>
	//   47  103:putstatic       #54  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_VECTOR>
		AMAPOVERLAY_MODEL = new GLOverlay$EAMapOverlayTpye("AMAPOVERLAY_MODEL", 8);
	//   48  106:new             #2   <Class GLOverlay$EAMapOverlayTpye>
	//   49  109:dup             
	//   50  110:ldc1            #55  <String "AMAPOVERLAY_MODEL">
	//   51  112:bipush          8
	//   52  114:invokespecial   #31  <Method void GLOverlay$EAMapOverlayTpye(String, int)>
	//   53  117:putstatic       #57  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_MODEL>
		AMAPOVERLAY_RCTROUTE = new GLOverlay$EAMapOverlayTpye("AMAPOVERLAY_RCTROUTE", 9);
	//   54  120:new             #2   <Class GLOverlay$EAMapOverlayTpye>
	//   55  123:dup             
	//   56  124:ldc1            #58  <String "AMAPOVERLAY_RCTROUTE">
	//   57  126:bipush          9
	//   58  128:invokespecial   #31  <Method void GLOverlay$EAMapOverlayTpye(String, int)>
	//   59  131:putstatic       #60  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_RCTROUTE>
		AMAPOVERLAY_ROUTE = new GLOverlay$EAMapOverlayTpye("AMAPOVERLAY_ROUTE", 10);
	//   60  134:new             #2   <Class GLOverlay$EAMapOverlayTpye>
	//   61  137:dup             
	//   62  138:ldc1            #61  <String "AMAPOVERLAY_ROUTE">
	//   63  140:bipush          10
	//   64  142:invokespecial   #31  <Method void GLOverlay$EAMapOverlayTpye(String, int)>
	//   65  145:putstatic       #63  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_ROUTE>
		AMAPOVERLAY_WATERWAVE = new GLOverlay$EAMapOverlayTpye("AMAPOVERLAY_WATERWAVE", 11);
	//   66  148:new             #2   <Class GLOverlay$EAMapOverlayTpye>
	//   67  151:dup             
	//   68  152:ldc1            #64  <String "AMAPOVERLAY_WATERWAVE">
	//   69  154:bipush          11
	//   70  156:invokespecial   #31  <Method void GLOverlay$EAMapOverlayTpye(String, int)>
	//   71  159:putstatic       #66  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_WATERWAVE>
		AMAPOVERLAY_PLANE = new GLOverlay$EAMapOverlayTpye("AMAPOVERLAY_PLANE", 12);
	//   72  162:new             #2   <Class GLOverlay$EAMapOverlayTpye>
	//   73  165:dup             
	//   74  166:ldc1            #67  <String "AMAPOVERLAY_PLANE">
	//   75  168:bipush          12
	//   76  170:invokespecial   #31  <Method void GLOverlay$EAMapOverlayTpye(String, int)>
	//   77  173:putstatic       #69  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_PLANE>
		$VALUES = (new GLOverlay$EAMapOverlayTpye[] {
			AMAPOVERLAY_POINT, AMAPOVERLAY_POLYLINE, AMAPOVERLAY_POLYGON, AMAPOVERLAY_NAVI, AMAPOVERLAY_GPS, AMAPOVERLAY_ARC, AMAPOVERLAY_ARROW, AMAPOVERLAY_VECTOR, AMAPOVERLAY_MODEL, AMAPOVERLAY_RCTROUTE, 
			AMAPOVERLAY_ROUTE, AMAPOVERLAY_WATERWAVE, AMAPOVERLAY_PLANE
		});
	//   78  176:bipush          13
	//   79  178:anewarray       GLOverlay$EAMapOverlayTpye[]
	//   80  181:dup             
	//   81  182:iconst_0        
	//   82  183:getstatic       #33  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_POINT>
	//   83  186:aastore         
	//   84  187:dup             
	//   85  188:iconst_1        
	//   86  189:getstatic       #36  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_POLYLINE>
	//   87  192:aastore         
	//   88  193:dup             
	//   89  194:iconst_2        
	//   90  195:getstatic       #39  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_POLYGON>
	//   91  198:aastore         
	//   92  199:dup             
	//   93  200:iconst_3        
	//   94  201:getstatic       #42  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_NAVI>
	//   95  204:aastore         
	//   96  205:dup             
	//   97  206:iconst_4        
	//   98  207:getstatic       #45  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_GPS>
	//   99  210:aastore         
	//  100  211:dup             
	//  101  212:iconst_5        
	//  102  213:getstatic       #48  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_ARC>
	//  103  216:aastore         
	//  104  217:dup             
	//  105  218:bipush          6
	//  106  220:getstatic       #51  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_ARROW>
	//  107  223:aastore         
	//  108  224:dup             
	//  109  225:bipush          7
	//  110  227:getstatic       #54  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_VECTOR>
	//  111  230:aastore         
	//  112  231:dup             
	//  113  232:bipush          8
	//  114  234:getstatic       #57  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_MODEL>
	//  115  237:aastore         
	//  116  238:dup             
	//  117  239:bipush          9
	//  118  241:getstatic       #60  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_RCTROUTE>
	//  119  244:aastore         
	//  120  245:dup             
	//  121  246:bipush          10
	//  122  248:getstatic       #63  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_ROUTE>
	//  123  251:aastore         
	//  124  252:dup             
	//  125  253:bipush          11
	//  126  255:getstatic       #66  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_WATERWAVE>
	//  127  258:aastore         
	//  128  259:dup             
	//  129  260:bipush          12
	//  130  262:getstatic       #69  <Field GLOverlay$EAMapOverlayTpye AMAPOVERLAY_PLANE>
	//  131  265:aastore         
	//  132  266:putstatic       #71  <Field GLOverlay$EAMapOverlayTpye[] $VALUES>
	//* 133  269:return          
	}

	private GLOverlay$EAMapOverlayTpye(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #73  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
