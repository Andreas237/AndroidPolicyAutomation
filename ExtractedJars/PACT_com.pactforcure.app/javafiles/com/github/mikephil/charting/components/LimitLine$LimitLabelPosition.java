// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.components;


// Referenced classes of package com.github.mikephil.charting.components:
//			LimitLine

public static final class LimitLine$LimitLabelPosition extends Enum
{

	public static LimitLine$LimitLabelPosition valueOf(String s)
	{
		return (LimitLine$LimitLabelPosition)Enum.valueOf(com/github/mikephil/charting/components/LimitLine$LimitLabelPosition, s);
	//    0    0:ldc1            #2   <Class LimitLine$LimitLabelPosition>
	//    1    2:aload_0         
	//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class LimitLine$LimitLabelPosition>
	//    4    9:areturn         
	}

	public static LimitLine$LimitLabelPosition[] values()
	{
		return (LimitLine$LimitLabelPosition[])((LimitLine$LimitLabelPosition []) ($VALUES)).clone();
	//    0    0:getstatic       #35  <Field LimitLine$LimitLabelPosition[] $VALUES>
	//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.github.mikephil.charting.components.LimitLine$LimitLabelPosition_3B_.clone()>
	//    2    6:checkcast       #46  <Class LimitLine$LimitLabelPosition[]>
	//    3    9:areturn         
	}

	private static final LimitLine$LimitLabelPosition $VALUES[];
	public static final LimitLine$LimitLabelPosition LEFT_BOTTOM;
	public static final LimitLine$LimitLabelPosition LEFT_TOP;
	public static final LimitLine$LimitLabelPosition RIGHT_BOTTOM;
	public static final LimitLine$LimitLabelPosition RIGHT_TOP;

	static 
	{
		LEFT_TOP = new LimitLine$LimitLabelPosition("LEFT_TOP", 0);
	//    0    0:new             #2   <Class LimitLine$LimitLabelPosition>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "LEFT_TOP">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void LimitLine$LimitLabelPosition(String, int)>
	//    5   10:putstatic       #24  <Field LimitLine$LimitLabelPosition LEFT_TOP>
		LEFT_BOTTOM = new LimitLine$LimitLabelPosition("LEFT_BOTTOM", 1);
	//    6   13:new             #2   <Class LimitLine$LimitLabelPosition>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "LEFT_BOTTOM">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void LimitLine$LimitLabelPosition(String, int)>
	//   11   23:putstatic       #27  <Field LimitLine$LimitLabelPosition LEFT_BOTTOM>
		RIGHT_TOP = new LimitLine$LimitLabelPosition("RIGHT_TOP", 2);
	//   12   26:new             #2   <Class LimitLine$LimitLabelPosition>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "RIGHT_TOP">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void LimitLine$LimitLabelPosition(String, int)>
	//   17   36:putstatic       #30  <Field LimitLine$LimitLabelPosition RIGHT_TOP>
		RIGHT_BOTTOM = new LimitLine$LimitLabelPosition("RIGHT_BOTTOM", 3);
	//   18   39:new             #2   <Class LimitLine$LimitLabelPosition>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "RIGHT_BOTTOM">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void LimitLine$LimitLabelPosition(String, int)>
	//   23   49:putstatic       #33  <Field LimitLine$LimitLabelPosition RIGHT_BOTTOM>
		$VALUES = (new LimitLine$LimitLabelPosition[] {
			LEFT_TOP, LEFT_BOTTOM, RIGHT_TOP, RIGHT_BOTTOM
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       LimitLine$LimitLabelPosition[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field LimitLine$LimitLabelPosition LEFT_TOP>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #27  <Field LimitLine$LimitLabelPosition LEFT_BOTTOM>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #30  <Field LimitLine$LimitLabelPosition RIGHT_TOP>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #33  <Field LimitLine$LimitLabelPosition RIGHT_BOTTOM>
	//   41   79:aastore         
	//   42   80:putstatic       #35  <Field LimitLine$LimitLabelPosition[] $VALUES>
	//*  43   83:return          
	}

	private LimitLine$LimitLabelPosition(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
