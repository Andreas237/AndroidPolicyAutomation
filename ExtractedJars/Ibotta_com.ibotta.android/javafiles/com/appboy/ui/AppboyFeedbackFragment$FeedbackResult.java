// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui;


// Referenced classes of package com.appboy.ui:
//			AppboyFeedbackFragment

public static final class AppboyFeedbackFragment$FeedbackResult extends Enum
{

	public static AppboyFeedbackFragment$FeedbackResult valueOf(String s)
	{
		return (AppboyFeedbackFragment$FeedbackResult)Enum.valueOf(com/appboy/ui/AppboyFeedbackFragment$FeedbackResult, s);
	//    0    0:ldc1            #2   <Class AppboyFeedbackFragment$FeedbackResult>
	//    1    2:aload_0         
	//    2    3:invokestatic    #36  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AppboyFeedbackFragment$FeedbackResult>
	//    4    9:areturn         
	}

	public static AppboyFeedbackFragment$FeedbackResult[] values()
	{
		return (AppboyFeedbackFragment$FeedbackResult[])((AppboyFeedbackFragment$FeedbackResult []) ($VALUES)).clone();
	//    0    0:getstatic       #28  <Field AppboyFeedbackFragment$FeedbackResult[] $VALUES>
	//    1    3:invokevirtual   #43  <Method Object _5B_Lcom.appboy.ui.AppboyFeedbackFragment$FeedbackResult_3B_.clone()>
	//    2    6:checkcast       #39  <Class AppboyFeedbackFragment$FeedbackResult[]>
	//    3    9:areturn         
	}

	private static final AppboyFeedbackFragment$FeedbackResult $VALUES[];
	public static final AppboyFeedbackFragment$FeedbackResult CANCELLED;
	public static final AppboyFeedbackFragment$FeedbackResult SUBMITTED;

	static 
	{
		SUBMITTED = new AppboyFeedbackFragment$FeedbackResult("SUBMITTED", 0);
	//    0    0:new             #2   <Class AppboyFeedbackFragment$FeedbackResult>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "SUBMITTED">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void AppboyFeedbackFragment$FeedbackResult(String, int)>
	//    5   10:putstatic       #23  <Field AppboyFeedbackFragment$FeedbackResult SUBMITTED>
		CANCELLED = new AppboyFeedbackFragment$FeedbackResult("CANCELLED", 1);
	//    6   13:new             #2   <Class AppboyFeedbackFragment$FeedbackResult>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "CANCELLED">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void AppboyFeedbackFragment$FeedbackResult(String, int)>
	//   11   23:putstatic       #26  <Field AppboyFeedbackFragment$FeedbackResult CANCELLED>
		$VALUES = (new AppboyFeedbackFragment$FeedbackResult[] {
			SUBMITTED, CANCELLED
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       AppboyFeedbackFragment$FeedbackResult[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #23  <Field AppboyFeedbackFragment$FeedbackResult SUBMITTED>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #26  <Field AppboyFeedbackFragment$FeedbackResult CANCELLED>
	//   21   41:aastore         
	//   22   42:putstatic       #28  <Field AppboyFeedbackFragment$FeedbackResult[] $VALUES>
	//*  23   45:return          
	}

	private AppboyFeedbackFragment$FeedbackResult(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #30  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
