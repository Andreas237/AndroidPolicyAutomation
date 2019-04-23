// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media;


// Referenced classes of package com.appscend.media:
//			APSMediaBuilder

public static final class APSMediaBuilder$APSWebviewDismissedAction extends Enum
{

	public static APSMediaBuilder$APSWebviewDismissedAction valueOf(String s)
	{
		return (APSMediaBuilder$APSWebviewDismissedAction)Enum.valueOf(com/appscend/media/APSMediaBuilder$APSWebviewDismissedAction, s);
	//    0    0:ldc1            #2   <Class APSMediaBuilder$APSWebviewDismissedAction>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class APSMediaBuilder$APSWebviewDismissedAction>
	//    4    9:areturn         
	}

	public static APSMediaBuilder$APSWebviewDismissedAction[] values()
	{
		return (APSMediaBuilder$APSWebviewDismissedAction[])((APSMediaBuilder$APSWebviewDismissedAction []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field APSMediaBuilder$APSWebviewDismissedAction[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.appscend.media.APSMediaBuilder$APSWebviewDismissedAction_3B_.clone()>
	//    2    6:checkcast       #42  <Class APSMediaBuilder$APSWebviewDismissedAction[]>
	//    3    9:areturn         
	}

	private static final APSMediaBuilder$APSWebviewDismissedAction $VALUES[];
	public static final APSMediaBuilder$APSWebviewDismissedAction APSDoNothingOnWebviewDismiss;
	public static final APSMediaBuilder$APSWebviewDismissedAction APSHideOverlayOnWebviewDismiss;
	public static final APSMediaBuilder$APSWebviewDismissedAction APSSkipUnitOnWebviewDismiss;

	static 
	{
		APSHideOverlayOnWebviewDismiss = new APSMediaBuilder$APSWebviewDismissedAction("APSHideOverlayOnWebviewDismiss", 0);
	//    0    0:new             #2   <Class APSMediaBuilder$APSWebviewDismissedAction>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "APSHideOverlayOnWebviewDismiss">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void APSMediaBuilder$APSWebviewDismissedAction(String, int)>
	//    5   10:putstatic       #23  <Field APSMediaBuilder$APSWebviewDismissedAction APSHideOverlayOnWebviewDismiss>
		APSSkipUnitOnWebviewDismiss = new APSMediaBuilder$APSWebviewDismissedAction("APSSkipUnitOnWebviewDismiss", 1);
	//    6   13:new             #2   <Class APSMediaBuilder$APSWebviewDismissedAction>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "APSSkipUnitOnWebviewDismiss">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void APSMediaBuilder$APSWebviewDismissedAction(String, int)>
	//   11   23:putstatic       #26  <Field APSMediaBuilder$APSWebviewDismissedAction APSSkipUnitOnWebviewDismiss>
		APSDoNothingOnWebviewDismiss = new APSMediaBuilder$APSWebviewDismissedAction("APSDoNothingOnWebviewDismiss", 2);
	//   12   26:new             #2   <Class APSMediaBuilder$APSWebviewDismissedAction>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "APSDoNothingOnWebviewDismiss">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void APSMediaBuilder$APSWebviewDismissedAction(String, int)>
	//   17   36:putstatic       #29  <Field APSMediaBuilder$APSWebviewDismissedAction APSDoNothingOnWebviewDismiss>
		$VALUES = (new APSMediaBuilder$APSWebviewDismissedAction[] {
			APSHideOverlayOnWebviewDismiss, APSSkipUnitOnWebviewDismiss, APSDoNothingOnWebviewDismiss
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       APSMediaBuilder$APSWebviewDismissedAction[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field APSMediaBuilder$APSWebviewDismissedAction APSHideOverlayOnWebviewDismiss>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field APSMediaBuilder$APSWebviewDismissedAction APSSkipUnitOnWebviewDismiss>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field APSMediaBuilder$APSWebviewDismissedAction APSDoNothingOnWebviewDismiss>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field APSMediaBuilder$APSWebviewDismissedAction[] $VALUES>
	//*  33   64:return          
	}

	private APSMediaBuilder$APSWebviewDismissedAction(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
