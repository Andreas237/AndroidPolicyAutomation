// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media.events;


// Referenced classes of package com.appscend.media.events:
//			APSMediaOverlay

public static final class APSMediaOverlay$APSMediaOverlayPosition extends Enum
{

	public static APSMediaOverlay$APSMediaOverlayPosition valueOf(String s)
	{
		return (APSMediaOverlay$APSMediaOverlayPosition)Enum.valueOf(com/appscend/media/events/APSMediaOverlay$APSMediaOverlayPosition, s);
	//    0    0:ldc1            #2   <Class APSMediaOverlay$APSMediaOverlayPosition>
	//    1    2:aload_0         
	//    2    3:invokestatic    #67  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class APSMediaOverlay$APSMediaOverlayPosition>
	//    4    9:areturn         
	}

	public static APSMediaOverlay$APSMediaOverlayPosition[] values()
	{
		return (APSMediaOverlay$APSMediaOverlayPosition[])((APSMediaOverlay$APSMediaOverlayPosition []) ($VALUES)).clone();
	//    0    0:getstatic       #59  <Field APSMediaOverlay$APSMediaOverlayPosition[] $VALUES>
	//    1    3:invokevirtual   #74  <Method Object _5B_Lcom.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition_3B_.clone()>
	//    2    6:checkcast       #70  <Class APSMediaOverlay$APSMediaOverlayPosition[]>
	//    3    9:areturn         
	}

	private static final APSMediaOverlay$APSMediaOverlayPosition $VALUES[];
	public static final APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionBottom;
	public static final APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionBottomLeft;
	public static final APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionBottomRight;
	public static final APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionFullscreen;
	public static final APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionLeft;
	public static final APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionRight;
	public static final APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionTop;
	public static final APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionTopLeft;
	public static final APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionTopRight;
	public static final APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionUnspecified;

	static 
	{
		kAPSMediaOverlayPositionFullscreen = new APSMediaOverlay$APSMediaOverlayPosition("kAPSMediaOverlayPositionFullscreen", 0);
	//    0    0:new             #2   <Class APSMediaOverlay$APSMediaOverlayPosition>
	//    1    3:dup             
	//    2    4:ldc1            #24  <String "kAPSMediaOverlayPositionFullscreen">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #28  <Method void APSMediaOverlay$APSMediaOverlayPosition(String, int)>
	//    5   10:putstatic       #30  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionFullscreen>
		kAPSMediaOverlayPositionBottomLeft = new APSMediaOverlay$APSMediaOverlayPosition("kAPSMediaOverlayPositionBottomLeft", 1);
	//    6   13:new             #2   <Class APSMediaOverlay$APSMediaOverlayPosition>
	//    7   16:dup             
	//    8   17:ldc1            #31  <String "kAPSMediaOverlayPositionBottomLeft">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #28  <Method void APSMediaOverlay$APSMediaOverlayPosition(String, int)>
	//   11   23:putstatic       #33  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionBottomLeft>
		kAPSMediaOverlayPositionBottomRight = new APSMediaOverlay$APSMediaOverlayPosition("kAPSMediaOverlayPositionBottomRight", 2);
	//   12   26:new             #2   <Class APSMediaOverlay$APSMediaOverlayPosition>
	//   13   29:dup             
	//   14   30:ldc1            #34  <String "kAPSMediaOverlayPositionBottomRight">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #28  <Method void APSMediaOverlay$APSMediaOverlayPosition(String, int)>
	//   17   36:putstatic       #36  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionBottomRight>
		kAPSMediaOverlayPositionTopLeft = new APSMediaOverlay$APSMediaOverlayPosition("kAPSMediaOverlayPositionTopLeft", 3);
	//   18   39:new             #2   <Class APSMediaOverlay$APSMediaOverlayPosition>
	//   19   42:dup             
	//   20   43:ldc1            #37  <String "kAPSMediaOverlayPositionTopLeft">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #28  <Method void APSMediaOverlay$APSMediaOverlayPosition(String, int)>
	//   23   49:putstatic       #39  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionTopLeft>
		kAPSMediaOverlayPositionTopRight = new APSMediaOverlay$APSMediaOverlayPosition("kAPSMediaOverlayPositionTopRight", 4);
	//   24   52:new             #2   <Class APSMediaOverlay$APSMediaOverlayPosition>
	//   25   55:dup             
	//   26   56:ldc1            #40  <String "kAPSMediaOverlayPositionTopRight">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #28  <Method void APSMediaOverlay$APSMediaOverlayPosition(String, int)>
	//   29   62:putstatic       #42  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionTopRight>
		kAPSMediaOverlayPositionTop = new APSMediaOverlay$APSMediaOverlayPosition("kAPSMediaOverlayPositionTop", 5);
	//   30   65:new             #2   <Class APSMediaOverlay$APSMediaOverlayPosition>
	//   31   68:dup             
	//   32   69:ldc1            #43  <String "kAPSMediaOverlayPositionTop">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #28  <Method void APSMediaOverlay$APSMediaOverlayPosition(String, int)>
	//   35   75:putstatic       #45  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionTop>
		kAPSMediaOverlayPositionBottom = new APSMediaOverlay$APSMediaOverlayPosition("kAPSMediaOverlayPositionBottom", 6);
	//   36   78:new             #2   <Class APSMediaOverlay$APSMediaOverlayPosition>
	//   37   81:dup             
	//   38   82:ldc1            #46  <String "kAPSMediaOverlayPositionBottom">
	//   39   84:bipush          6
	//   40   86:invokespecial   #28  <Method void APSMediaOverlay$APSMediaOverlayPosition(String, int)>
	//   41   89:putstatic       #48  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionBottom>
		kAPSMediaOverlayPositionLeft = new APSMediaOverlay$APSMediaOverlayPosition("kAPSMediaOverlayPositionLeft", 7);
	//   42   92:new             #2   <Class APSMediaOverlay$APSMediaOverlayPosition>
	//   43   95:dup             
	//   44   96:ldc1            #49  <String "kAPSMediaOverlayPositionLeft">
	//   45   98:bipush          7
	//   46  100:invokespecial   #28  <Method void APSMediaOverlay$APSMediaOverlayPosition(String, int)>
	//   47  103:putstatic       #51  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionLeft>
		kAPSMediaOverlayPositionRight = new APSMediaOverlay$APSMediaOverlayPosition("kAPSMediaOverlayPositionRight", 8);
	//   48  106:new             #2   <Class APSMediaOverlay$APSMediaOverlayPosition>
	//   49  109:dup             
	//   50  110:ldc1            #52  <String "kAPSMediaOverlayPositionRight">
	//   51  112:bipush          8
	//   52  114:invokespecial   #28  <Method void APSMediaOverlay$APSMediaOverlayPosition(String, int)>
	//   53  117:putstatic       #54  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionRight>
		kAPSMediaOverlayPositionUnspecified = new APSMediaOverlay$APSMediaOverlayPosition("kAPSMediaOverlayPositionUnspecified", 9);
	//   54  120:new             #2   <Class APSMediaOverlay$APSMediaOverlayPosition>
	//   55  123:dup             
	//   56  124:ldc1            #55  <String "kAPSMediaOverlayPositionUnspecified">
	//   57  126:bipush          9
	//   58  128:invokespecial   #28  <Method void APSMediaOverlay$APSMediaOverlayPosition(String, int)>
	//   59  131:putstatic       #57  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionUnspecified>
		$VALUES = (new APSMediaOverlay$APSMediaOverlayPosition[] {
			kAPSMediaOverlayPositionFullscreen, kAPSMediaOverlayPositionBottomLeft, kAPSMediaOverlayPositionBottomRight, kAPSMediaOverlayPositionTopLeft, kAPSMediaOverlayPositionTopRight, kAPSMediaOverlayPositionTop, kAPSMediaOverlayPositionBottom, kAPSMediaOverlayPositionLeft, kAPSMediaOverlayPositionRight, kAPSMediaOverlayPositionUnspecified
		});
	//   60  134:bipush          10
	//   61  136:anewarray       APSMediaOverlay$APSMediaOverlayPosition[]
	//   62  139:dup             
	//   63  140:iconst_0        
	//   64  141:getstatic       #30  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionFullscreen>
	//   65  144:aastore         
	//   66  145:dup             
	//   67  146:iconst_1        
	//   68  147:getstatic       #33  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionBottomLeft>
	//   69  150:aastore         
	//   70  151:dup             
	//   71  152:iconst_2        
	//   72  153:getstatic       #36  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionBottomRight>
	//   73  156:aastore         
	//   74  157:dup             
	//   75  158:iconst_3        
	//   76  159:getstatic       #39  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionTopLeft>
	//   77  162:aastore         
	//   78  163:dup             
	//   79  164:iconst_4        
	//   80  165:getstatic       #42  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionTopRight>
	//   81  168:aastore         
	//   82  169:dup             
	//   83  170:iconst_5        
	//   84  171:getstatic       #45  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionTop>
	//   85  174:aastore         
	//   86  175:dup             
	//   87  176:bipush          6
	//   88  178:getstatic       #48  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionBottom>
	//   89  181:aastore         
	//   90  182:dup             
	//   91  183:bipush          7
	//   92  185:getstatic       #51  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionLeft>
	//   93  188:aastore         
	//   94  189:dup             
	//   95  190:bipush          8
	//   96  192:getstatic       #54  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionRight>
	//   97  195:aastore         
	//   98  196:dup             
	//   99  197:bipush          9
	//  100  199:getstatic       #57  <Field APSMediaOverlay$APSMediaOverlayPosition kAPSMediaOverlayPositionUnspecified>
	//  101  202:aastore         
	//  102  203:putstatic       #59  <Field APSMediaOverlay$APSMediaOverlayPosition[] $VALUES>
	//* 103  206:return          
	}

	private APSMediaOverlay$APSMediaOverlayPosition(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #61  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
