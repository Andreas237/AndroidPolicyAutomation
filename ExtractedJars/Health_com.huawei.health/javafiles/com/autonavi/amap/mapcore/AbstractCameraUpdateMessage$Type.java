// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore;


// Referenced classes of package com.autonavi.amap.mapcore:
//			AbstractCameraUpdateMessage

public static final class AbstractCameraUpdateMessage$Type extends Enum
{

	public static AbstractCameraUpdateMessage$Type valueOf(String s)
	{
		return (AbstractCameraUpdateMessage$Type)Enum.valueOf(com/autonavi/amap/mapcore/AbstractCameraUpdateMessage$Type, s);
	//    0    0:ldc1            #2   <Class AbstractCameraUpdateMessage$Type>
	//    1    2:aload_0         
	//    2    3:invokestatic    #87  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AbstractCameraUpdateMessage$Type>
	//    4    9:areturn         
	}

	public static AbstractCameraUpdateMessage$Type[] values()
	{
		return (AbstractCameraUpdateMessage$Type[])((AbstractCameraUpdateMessage$Type []) ($VALUES)).clone();
	//    0    0:getstatic       #79  <Field AbstractCameraUpdateMessage$Type[] $VALUES>
	//    1    3:invokevirtual   #94  <Method Object _5B_Lcom.autonavi.amap.mapcore.AbstractCameraUpdateMessage$Type_3B_.clone()>
	//    2    6:checkcast       #90  <Class AbstractCameraUpdateMessage$Type[]>
	//    3    9:areturn         
	}

	private static final AbstractCameraUpdateMessage$Type $VALUES[];
	public static final AbstractCameraUpdateMessage$Type changeBearing;
	public static final AbstractCameraUpdateMessage$Type changeBearingGeoCenter;
	public static final AbstractCameraUpdateMessage$Type changeCenter;
	public static final AbstractCameraUpdateMessage$Type changeGeoCenterZoom;
	public static final AbstractCameraUpdateMessage$Type changeGeoCenterZoomTiltBearing;
	public static final AbstractCameraUpdateMessage$Type changeTilt;
	public static final AbstractCameraUpdateMessage$Type newCameraPosition;
	public static final AbstractCameraUpdateMessage$Type newLatLngBounds;
	public static final AbstractCameraUpdateMessage$Type newLatLngBoundsWithSize;
	public static final AbstractCameraUpdateMessage$Type none;
	public static final AbstractCameraUpdateMessage$Type scrollBy;
	public static final AbstractCameraUpdateMessage$Type zoomBy;
	public static final AbstractCameraUpdateMessage$Type zoomIn;
	public static final AbstractCameraUpdateMessage$Type zoomOut;
	public static final AbstractCameraUpdateMessage$Type zoomTo;

	static 
	{
		none = new AbstractCameraUpdateMessage$Type("none", 0);
	//    0    0:new             #2   <Class AbstractCameraUpdateMessage$Type>
	//    1    3:dup             
	//    2    4:ldc1            #29  <String "none">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #33  <Method void AbstractCameraUpdateMessage$Type(String, int)>
	//    5   10:putstatic       #35  <Field AbstractCameraUpdateMessage$Type none>
		zoomIn = new AbstractCameraUpdateMessage$Type("zoomIn", 1);
	//    6   13:new             #2   <Class AbstractCameraUpdateMessage$Type>
	//    7   16:dup             
	//    8   17:ldc1            #36  <String "zoomIn">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #33  <Method void AbstractCameraUpdateMessage$Type(String, int)>
	//   11   23:putstatic       #38  <Field AbstractCameraUpdateMessage$Type zoomIn>
		changeCenter = new AbstractCameraUpdateMessage$Type("changeCenter", 2);
	//   12   26:new             #2   <Class AbstractCameraUpdateMessage$Type>
	//   13   29:dup             
	//   14   30:ldc1            #39  <String "changeCenter">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #33  <Method void AbstractCameraUpdateMessage$Type(String, int)>
	//   17   36:putstatic       #41  <Field AbstractCameraUpdateMessage$Type changeCenter>
		changeTilt = new AbstractCameraUpdateMessage$Type("changeTilt", 3);
	//   18   39:new             #2   <Class AbstractCameraUpdateMessage$Type>
	//   19   42:dup             
	//   20   43:ldc1            #42  <String "changeTilt">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #33  <Method void AbstractCameraUpdateMessage$Type(String, int)>
	//   23   49:putstatic       #44  <Field AbstractCameraUpdateMessage$Type changeTilt>
		changeBearing = new AbstractCameraUpdateMessage$Type("changeBearing", 4);
	//   24   52:new             #2   <Class AbstractCameraUpdateMessage$Type>
	//   25   55:dup             
	//   26   56:ldc1            #45  <String "changeBearing">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #33  <Method void AbstractCameraUpdateMessage$Type(String, int)>
	//   29   62:putstatic       #47  <Field AbstractCameraUpdateMessage$Type changeBearing>
		changeBearingGeoCenter = new AbstractCameraUpdateMessage$Type("changeBearingGeoCenter", 5);
	//   30   65:new             #2   <Class AbstractCameraUpdateMessage$Type>
	//   31   68:dup             
	//   32   69:ldc1            #48  <String "changeBearingGeoCenter">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #33  <Method void AbstractCameraUpdateMessage$Type(String, int)>
	//   35   75:putstatic       #50  <Field AbstractCameraUpdateMessage$Type changeBearingGeoCenter>
		changeGeoCenterZoom = new AbstractCameraUpdateMessage$Type("changeGeoCenterZoom", 6);
	//   36   78:new             #2   <Class AbstractCameraUpdateMessage$Type>
	//   37   81:dup             
	//   38   82:ldc1            #51  <String "changeGeoCenterZoom">
	//   39   84:bipush          6
	//   40   86:invokespecial   #33  <Method void AbstractCameraUpdateMessage$Type(String, int)>
	//   41   89:putstatic       #53  <Field AbstractCameraUpdateMessage$Type changeGeoCenterZoom>
		zoomOut = new AbstractCameraUpdateMessage$Type("zoomOut", 7);
	//   42   92:new             #2   <Class AbstractCameraUpdateMessage$Type>
	//   43   95:dup             
	//   44   96:ldc1            #54  <String "zoomOut">
	//   45   98:bipush          7
	//   46  100:invokespecial   #33  <Method void AbstractCameraUpdateMessage$Type(String, int)>
	//   47  103:putstatic       #56  <Field AbstractCameraUpdateMessage$Type zoomOut>
		zoomTo = new AbstractCameraUpdateMessage$Type("zoomTo", 8);
	//   48  106:new             #2   <Class AbstractCameraUpdateMessage$Type>
	//   49  109:dup             
	//   50  110:ldc1            #57  <String "zoomTo">
	//   51  112:bipush          8
	//   52  114:invokespecial   #33  <Method void AbstractCameraUpdateMessage$Type(String, int)>
	//   53  117:putstatic       #59  <Field AbstractCameraUpdateMessage$Type zoomTo>
		zoomBy = new AbstractCameraUpdateMessage$Type("zoomBy", 9);
	//   54  120:new             #2   <Class AbstractCameraUpdateMessage$Type>
	//   55  123:dup             
	//   56  124:ldc1            #60  <String "zoomBy">
	//   57  126:bipush          9
	//   58  128:invokespecial   #33  <Method void AbstractCameraUpdateMessage$Type(String, int)>
	//   59  131:putstatic       #62  <Field AbstractCameraUpdateMessage$Type zoomBy>
		scrollBy = new AbstractCameraUpdateMessage$Type("scrollBy", 10);
	//   60  134:new             #2   <Class AbstractCameraUpdateMessage$Type>
	//   61  137:dup             
	//   62  138:ldc1            #63  <String "scrollBy">
	//   63  140:bipush          10
	//   64  142:invokespecial   #33  <Method void AbstractCameraUpdateMessage$Type(String, int)>
	//   65  145:putstatic       #65  <Field AbstractCameraUpdateMessage$Type scrollBy>
		newCameraPosition = new AbstractCameraUpdateMessage$Type("newCameraPosition", 11);
	//   66  148:new             #2   <Class AbstractCameraUpdateMessage$Type>
	//   67  151:dup             
	//   68  152:ldc1            #66  <String "newCameraPosition">
	//   69  154:bipush          11
	//   70  156:invokespecial   #33  <Method void AbstractCameraUpdateMessage$Type(String, int)>
	//   71  159:putstatic       #68  <Field AbstractCameraUpdateMessage$Type newCameraPosition>
		newLatLngBounds = new AbstractCameraUpdateMessage$Type("newLatLngBounds", 12);
	//   72  162:new             #2   <Class AbstractCameraUpdateMessage$Type>
	//   73  165:dup             
	//   74  166:ldc1            #69  <String "newLatLngBounds">
	//   75  168:bipush          12
	//   76  170:invokespecial   #33  <Method void AbstractCameraUpdateMessage$Type(String, int)>
	//   77  173:putstatic       #71  <Field AbstractCameraUpdateMessage$Type newLatLngBounds>
		newLatLngBoundsWithSize = new AbstractCameraUpdateMessage$Type("newLatLngBoundsWithSize", 13);
	//   78  176:new             #2   <Class AbstractCameraUpdateMessage$Type>
	//   79  179:dup             
	//   80  180:ldc1            #72  <String "newLatLngBoundsWithSize">
	//   81  182:bipush          13
	//   82  184:invokespecial   #33  <Method void AbstractCameraUpdateMessage$Type(String, int)>
	//   83  187:putstatic       #74  <Field AbstractCameraUpdateMessage$Type newLatLngBoundsWithSize>
		changeGeoCenterZoomTiltBearing = new AbstractCameraUpdateMessage$Type("changeGeoCenterZoomTiltBearing", 14);
	//   84  190:new             #2   <Class AbstractCameraUpdateMessage$Type>
	//   85  193:dup             
	//   86  194:ldc1            #75  <String "changeGeoCenterZoomTiltBearing">
	//   87  196:bipush          14
	//   88  198:invokespecial   #33  <Method void AbstractCameraUpdateMessage$Type(String, int)>
	//   89  201:putstatic       #77  <Field AbstractCameraUpdateMessage$Type changeGeoCenterZoomTiltBearing>
		$VALUES = (new AbstractCameraUpdateMessage$Type[] {
			none, zoomIn, changeCenter, changeTilt, changeBearing, changeBearingGeoCenter, changeGeoCenterZoom, zoomOut, zoomTo, zoomBy, 
			scrollBy, newCameraPosition, newLatLngBounds, newLatLngBoundsWithSize, changeGeoCenterZoomTiltBearing
		});
	//   90  204:bipush          15
	//   91  206:anewarray       AbstractCameraUpdateMessage$Type[]
	//   92  209:dup             
	//   93  210:iconst_0        
	//   94  211:getstatic       #35  <Field AbstractCameraUpdateMessage$Type none>
	//   95  214:aastore         
	//   96  215:dup             
	//   97  216:iconst_1        
	//   98  217:getstatic       #38  <Field AbstractCameraUpdateMessage$Type zoomIn>
	//   99  220:aastore         
	//  100  221:dup             
	//  101  222:iconst_2        
	//  102  223:getstatic       #41  <Field AbstractCameraUpdateMessage$Type changeCenter>
	//  103  226:aastore         
	//  104  227:dup             
	//  105  228:iconst_3        
	//  106  229:getstatic       #44  <Field AbstractCameraUpdateMessage$Type changeTilt>
	//  107  232:aastore         
	//  108  233:dup             
	//  109  234:iconst_4        
	//  110  235:getstatic       #47  <Field AbstractCameraUpdateMessage$Type changeBearing>
	//  111  238:aastore         
	//  112  239:dup             
	//  113  240:iconst_5        
	//  114  241:getstatic       #50  <Field AbstractCameraUpdateMessage$Type changeBearingGeoCenter>
	//  115  244:aastore         
	//  116  245:dup             
	//  117  246:bipush          6
	//  118  248:getstatic       #53  <Field AbstractCameraUpdateMessage$Type changeGeoCenterZoom>
	//  119  251:aastore         
	//  120  252:dup             
	//  121  253:bipush          7
	//  122  255:getstatic       #56  <Field AbstractCameraUpdateMessage$Type zoomOut>
	//  123  258:aastore         
	//  124  259:dup             
	//  125  260:bipush          8
	//  126  262:getstatic       #59  <Field AbstractCameraUpdateMessage$Type zoomTo>
	//  127  265:aastore         
	//  128  266:dup             
	//  129  267:bipush          9
	//  130  269:getstatic       #62  <Field AbstractCameraUpdateMessage$Type zoomBy>
	//  131  272:aastore         
	//  132  273:dup             
	//  133  274:bipush          10
	//  134  276:getstatic       #65  <Field AbstractCameraUpdateMessage$Type scrollBy>
	//  135  279:aastore         
	//  136  280:dup             
	//  137  281:bipush          11
	//  138  283:getstatic       #68  <Field AbstractCameraUpdateMessage$Type newCameraPosition>
	//  139  286:aastore         
	//  140  287:dup             
	//  141  288:bipush          12
	//  142  290:getstatic       #71  <Field AbstractCameraUpdateMessage$Type newLatLngBounds>
	//  143  293:aastore         
	//  144  294:dup             
	//  145  295:bipush          13
	//  146  297:getstatic       #74  <Field AbstractCameraUpdateMessage$Type newLatLngBoundsWithSize>
	//  147  300:aastore         
	//  148  301:dup             
	//  149  302:bipush          14
	//  150  304:getstatic       #77  <Field AbstractCameraUpdateMessage$Type changeGeoCenterZoomTiltBearing>
	//  151  307:aastore         
	//  152  308:putstatic       #79  <Field AbstractCameraUpdateMessage$Type[] $VALUES>
	//* 153  311:return          
	}

	private AbstractCameraUpdateMessage$Type(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #81  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
