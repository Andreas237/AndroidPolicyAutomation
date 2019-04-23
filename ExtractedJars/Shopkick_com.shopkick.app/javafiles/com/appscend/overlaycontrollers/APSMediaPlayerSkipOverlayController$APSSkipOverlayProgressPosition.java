// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;


// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerSkipOverlayController

public static final class APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition extends Enum
{

	public static APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition valueOf(String s)
	{
		return (APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition)Enum.valueOf(com/appscend/overlaycontrollers/APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition, s);
	//    0    0:ldc1            #2   <Class APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition>
	//    4    9:areturn         
	}

	public static APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition[] values()
	{
		return (APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition[])((APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.appscend.overlaycontrollers.APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition_3B_.clone()>
	//    2    6:checkcast       #42  <Class APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition[]>
	//    3    9:areturn         
	}

	private static final APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition $VALUES[];
	public static final APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition kAPSSkipOverlayProgressPositionHidden;
	public static final APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition kAPSSkipOverlayProgressPositionLeft;
	public static final APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition kAPSSkipOverlayProgressPositionRight;

	static 
	{
		kAPSSkipOverlayProgressPositionLeft = new APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition("kAPSSkipOverlayProgressPositionLeft", 0);
	//    0    0:new             #2   <Class APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "kAPSSkipOverlayProgressPositionLeft">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition(String, int)>
	//    5   10:putstatic       #23  <Field APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition kAPSSkipOverlayProgressPositionLeft>
		kAPSSkipOverlayProgressPositionRight = new APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition("kAPSSkipOverlayProgressPositionRight", 1);
	//    6   13:new             #2   <Class APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "kAPSSkipOverlayProgressPositionRight">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition(String, int)>
	//   11   23:putstatic       #26  <Field APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition kAPSSkipOverlayProgressPositionRight>
		kAPSSkipOverlayProgressPositionHidden = new APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition("kAPSSkipOverlayProgressPositionHidden", 2);
	//   12   26:new             #2   <Class APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "kAPSSkipOverlayProgressPositionHidden">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition(String, int)>
	//   17   36:putstatic       #29  <Field APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition kAPSSkipOverlayProgressPositionHidden>
		$VALUES = (new APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition[] {
			kAPSSkipOverlayProgressPositionLeft, kAPSSkipOverlayProgressPositionRight, kAPSSkipOverlayProgressPositionHidden
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition kAPSSkipOverlayProgressPositionLeft>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition kAPSSkipOverlayProgressPositionRight>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition kAPSSkipOverlayProgressPositionHidden>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition[] $VALUES>
	//*  33   64:return          
	}

	private APSMediaPlayerSkipOverlayController$APSSkipOverlayProgressPosition(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
