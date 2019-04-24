// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.listener;


// Referenced classes of package com.github.mikephil.charting.listener:
//			ChartTouchListener

public static final class ChartTouchListener$ChartGesture extends Enum
{

	public static ChartTouchListener$ChartGesture valueOf(String s)
	{
		return (ChartTouchListener$ChartGesture)Enum.valueOf(com/github/mikephil/charting/listener/ChartTouchListener$ChartGesture, s);
	//    0    0:ldc1            #2   <Class ChartTouchListener$ChartGesture>
	//    1    2:aload_0         
	//    2    3:invokestatic    #67  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ChartTouchListener$ChartGesture>
	//    4    9:areturn         
	}

	public static ChartTouchListener$ChartGesture[] values()
	{
		return (ChartTouchListener$ChartGesture[])((ChartTouchListener$ChartGesture []) ($VALUES)).clone();
	//    0    0:getstatic       #59  <Field ChartTouchListener$ChartGesture[] $VALUES>
	//    1    3:invokevirtual   #74  <Method Object _5B_Lcom.github.mikephil.charting.listener.ChartTouchListener$ChartGesture_3B_.clone()>
	//    2    6:checkcast       #70  <Class ChartTouchListener$ChartGesture[]>
	//    3    9:areturn         
	}

	private static final ChartTouchListener$ChartGesture $VALUES[];
	public static final ChartTouchListener$ChartGesture DOUBLE_TAP;
	public static final ChartTouchListener$ChartGesture DRAG;
	public static final ChartTouchListener$ChartGesture FLING;
	public static final ChartTouchListener$ChartGesture LONG_PRESS;
	public static final ChartTouchListener$ChartGesture NONE;
	public static final ChartTouchListener$ChartGesture PINCH_ZOOM;
	public static final ChartTouchListener$ChartGesture ROTATE;
	public static final ChartTouchListener$ChartGesture SINGLE_TAP;
	public static final ChartTouchListener$ChartGesture X_ZOOM;
	public static final ChartTouchListener$ChartGesture Y_ZOOM;

	static 
	{
		NONE = new ChartTouchListener$ChartGesture("NONE", 0);
	//    0    0:new             #2   <Class ChartTouchListener$ChartGesture>
	//    1    3:dup             
	//    2    4:ldc1            #24  <String "NONE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #28  <Method void ChartTouchListener$ChartGesture(String, int)>
	//    5   10:putstatic       #30  <Field ChartTouchListener$ChartGesture NONE>
		DRAG = new ChartTouchListener$ChartGesture("DRAG", 1);
	//    6   13:new             #2   <Class ChartTouchListener$ChartGesture>
	//    7   16:dup             
	//    8   17:ldc1            #31  <String "DRAG">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #28  <Method void ChartTouchListener$ChartGesture(String, int)>
	//   11   23:putstatic       #33  <Field ChartTouchListener$ChartGesture DRAG>
		X_ZOOM = new ChartTouchListener$ChartGesture("X_ZOOM", 2);
	//   12   26:new             #2   <Class ChartTouchListener$ChartGesture>
	//   13   29:dup             
	//   14   30:ldc1            #34  <String "X_ZOOM">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #28  <Method void ChartTouchListener$ChartGesture(String, int)>
	//   17   36:putstatic       #36  <Field ChartTouchListener$ChartGesture X_ZOOM>
		Y_ZOOM = new ChartTouchListener$ChartGesture("Y_ZOOM", 3);
	//   18   39:new             #2   <Class ChartTouchListener$ChartGesture>
	//   19   42:dup             
	//   20   43:ldc1            #37  <String "Y_ZOOM">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #28  <Method void ChartTouchListener$ChartGesture(String, int)>
	//   23   49:putstatic       #39  <Field ChartTouchListener$ChartGesture Y_ZOOM>
		PINCH_ZOOM = new ChartTouchListener$ChartGesture("PINCH_ZOOM", 4);
	//   24   52:new             #2   <Class ChartTouchListener$ChartGesture>
	//   25   55:dup             
	//   26   56:ldc1            #40  <String "PINCH_ZOOM">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #28  <Method void ChartTouchListener$ChartGesture(String, int)>
	//   29   62:putstatic       #42  <Field ChartTouchListener$ChartGesture PINCH_ZOOM>
		ROTATE = new ChartTouchListener$ChartGesture("ROTATE", 5);
	//   30   65:new             #2   <Class ChartTouchListener$ChartGesture>
	//   31   68:dup             
	//   32   69:ldc1            #43  <String "ROTATE">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #28  <Method void ChartTouchListener$ChartGesture(String, int)>
	//   35   75:putstatic       #45  <Field ChartTouchListener$ChartGesture ROTATE>
		SINGLE_TAP = new ChartTouchListener$ChartGesture("SINGLE_TAP", 6);
	//   36   78:new             #2   <Class ChartTouchListener$ChartGesture>
	//   37   81:dup             
	//   38   82:ldc1            #46  <String "SINGLE_TAP">
	//   39   84:bipush          6
	//   40   86:invokespecial   #28  <Method void ChartTouchListener$ChartGesture(String, int)>
	//   41   89:putstatic       #48  <Field ChartTouchListener$ChartGesture SINGLE_TAP>
		DOUBLE_TAP = new ChartTouchListener$ChartGesture("DOUBLE_TAP", 7);
	//   42   92:new             #2   <Class ChartTouchListener$ChartGesture>
	//   43   95:dup             
	//   44   96:ldc1            #49  <String "DOUBLE_TAP">
	//   45   98:bipush          7
	//   46  100:invokespecial   #28  <Method void ChartTouchListener$ChartGesture(String, int)>
	//   47  103:putstatic       #51  <Field ChartTouchListener$ChartGesture DOUBLE_TAP>
		LONG_PRESS = new ChartTouchListener$ChartGesture("LONG_PRESS", 8);
	//   48  106:new             #2   <Class ChartTouchListener$ChartGesture>
	//   49  109:dup             
	//   50  110:ldc1            #52  <String "LONG_PRESS">
	//   51  112:bipush          8
	//   52  114:invokespecial   #28  <Method void ChartTouchListener$ChartGesture(String, int)>
	//   53  117:putstatic       #54  <Field ChartTouchListener$ChartGesture LONG_PRESS>
		FLING = new ChartTouchListener$ChartGesture("FLING", 9);
	//   54  120:new             #2   <Class ChartTouchListener$ChartGesture>
	//   55  123:dup             
	//   56  124:ldc1            #55  <String "FLING">
	//   57  126:bipush          9
	//   58  128:invokespecial   #28  <Method void ChartTouchListener$ChartGesture(String, int)>
	//   59  131:putstatic       #57  <Field ChartTouchListener$ChartGesture FLING>
		$VALUES = (new ChartTouchListener$ChartGesture[] {
			NONE, DRAG, X_ZOOM, Y_ZOOM, PINCH_ZOOM, ROTATE, SINGLE_TAP, DOUBLE_TAP, LONG_PRESS, FLING
		});
	//   60  134:bipush          10
	//   61  136:anewarray       ChartTouchListener$ChartGesture[]
	//   62  139:dup             
	//   63  140:iconst_0        
	//   64  141:getstatic       #30  <Field ChartTouchListener$ChartGesture NONE>
	//   65  144:aastore         
	//   66  145:dup             
	//   67  146:iconst_1        
	//   68  147:getstatic       #33  <Field ChartTouchListener$ChartGesture DRAG>
	//   69  150:aastore         
	//   70  151:dup             
	//   71  152:iconst_2        
	//   72  153:getstatic       #36  <Field ChartTouchListener$ChartGesture X_ZOOM>
	//   73  156:aastore         
	//   74  157:dup             
	//   75  158:iconst_3        
	//   76  159:getstatic       #39  <Field ChartTouchListener$ChartGesture Y_ZOOM>
	//   77  162:aastore         
	//   78  163:dup             
	//   79  164:iconst_4        
	//   80  165:getstatic       #42  <Field ChartTouchListener$ChartGesture PINCH_ZOOM>
	//   81  168:aastore         
	//   82  169:dup             
	//   83  170:iconst_5        
	//   84  171:getstatic       #45  <Field ChartTouchListener$ChartGesture ROTATE>
	//   85  174:aastore         
	//   86  175:dup             
	//   87  176:bipush          6
	//   88  178:getstatic       #48  <Field ChartTouchListener$ChartGesture SINGLE_TAP>
	//   89  181:aastore         
	//   90  182:dup             
	//   91  183:bipush          7
	//   92  185:getstatic       #51  <Field ChartTouchListener$ChartGesture DOUBLE_TAP>
	//   93  188:aastore         
	//   94  189:dup             
	//   95  190:bipush          8
	//   96  192:getstatic       #54  <Field ChartTouchListener$ChartGesture LONG_PRESS>
	//   97  195:aastore         
	//   98  196:dup             
	//   99  197:bipush          9
	//  100  199:getstatic       #57  <Field ChartTouchListener$ChartGesture FLING>
	//  101  202:aastore         
	//  102  203:putstatic       #59  <Field ChartTouchListener$ChartGesture[] $VALUES>
	//* 103  206:return          
	}

	private ChartTouchListener$ChartGesture(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #61  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
