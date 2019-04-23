// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;


// Referenced classes of package com.facebook.share.internal:
//			LikeBoxCountView

public static final class LikeBoxCountView$LikeBoxCountViewCaretPosition extends Enum
{

	public static LikeBoxCountView$LikeBoxCountViewCaretPosition valueOf(String s)
	{
		return (LikeBoxCountView$LikeBoxCountViewCaretPosition)Enum.valueOf(com/facebook/share/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition, s);
	//    0    0:ldc1            #2   <Class LikeBoxCountView$LikeBoxCountViewCaretPosition>
	//    1    2:aload_0         
	//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class LikeBoxCountView$LikeBoxCountViewCaretPosition>
	//    4    9:areturn         
	}

	public static LikeBoxCountView$LikeBoxCountViewCaretPosition[] values()
	{
		return (LikeBoxCountView$LikeBoxCountViewCaretPosition[])((LikeBoxCountView$LikeBoxCountViewCaretPosition []) ($VALUES)).clone();
	//    0    0:getstatic       #35  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition[] $VALUES>
	//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.facebook.share.internal.LikeBoxCountView$LikeBoxCountViewCaretPosition_3B_.clone()>
	//    2    6:checkcast       #46  <Class LikeBoxCountView$LikeBoxCountViewCaretPosition[]>
	//    3    9:areturn         
	}

	private static final LikeBoxCountView$LikeBoxCountViewCaretPosition $VALUES[];
	public static final LikeBoxCountView$LikeBoxCountViewCaretPosition BOTTOM;
	public static final LikeBoxCountView$LikeBoxCountViewCaretPosition LEFT;
	public static final LikeBoxCountView$LikeBoxCountViewCaretPosition RIGHT;
	public static final LikeBoxCountView$LikeBoxCountViewCaretPosition TOP;

	static 
	{
		LEFT = new LikeBoxCountView$LikeBoxCountViewCaretPosition("LEFT", 0);
	//    0    0:new             #2   <Class LikeBoxCountView$LikeBoxCountViewCaretPosition>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "LEFT">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void LikeBoxCountView$LikeBoxCountViewCaretPosition(String, int)>
	//    5   10:putstatic       #24  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition LEFT>
		TOP = new LikeBoxCountView$LikeBoxCountViewCaretPosition("TOP", 1);
	//    6   13:new             #2   <Class LikeBoxCountView$LikeBoxCountViewCaretPosition>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "TOP">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void LikeBoxCountView$LikeBoxCountViewCaretPosition(String, int)>
	//   11   23:putstatic       #27  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition TOP>
		RIGHT = new LikeBoxCountView$LikeBoxCountViewCaretPosition("RIGHT", 2);
	//   12   26:new             #2   <Class LikeBoxCountView$LikeBoxCountViewCaretPosition>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "RIGHT">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void LikeBoxCountView$LikeBoxCountViewCaretPosition(String, int)>
	//   17   36:putstatic       #30  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition RIGHT>
		BOTTOM = new LikeBoxCountView$LikeBoxCountViewCaretPosition("BOTTOM", 3);
	//   18   39:new             #2   <Class LikeBoxCountView$LikeBoxCountViewCaretPosition>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "BOTTOM">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void LikeBoxCountView$LikeBoxCountViewCaretPosition(String, int)>
	//   23   49:putstatic       #33  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition BOTTOM>
		$VALUES = (new LikeBoxCountView$LikeBoxCountViewCaretPosition[] {
			LEFT, TOP, RIGHT, BOTTOM
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       LikeBoxCountView$LikeBoxCountViewCaretPosition[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition LEFT>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #27  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition TOP>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #30  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition RIGHT>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #33  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition BOTTOM>
	//   41   79:aastore         
	//   42   80:putstatic       #35  <Field LikeBoxCountView$LikeBoxCountViewCaretPosition[] $VALUES>
	//*  43   83:return          
	}

	private LikeBoxCountView$LikeBoxCountViewCaretPosition(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
