// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;


// Referenced classes of package com.facebook.appevents:
//			AppEventsLogger

public static final class AppEventsLogger$FlushBehavior extends Enum
{

	public static AppEventsLogger$FlushBehavior valueOf(String s)
	{
		return (AppEventsLogger$FlushBehavior)Enum.valueOf(com/facebook/appevents/AppEventsLogger$FlushBehavior, s);
	//    0    0:ldc1            #2   <Class AppEventsLogger$FlushBehavior>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AppEventsLogger$FlushBehavior>
	//    4    9:areturn         
	}

	public static AppEventsLogger$FlushBehavior[] values()
	{
		return (AppEventsLogger$FlushBehavior[])((AppEventsLogger$FlushBehavior []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field AppEventsLogger$FlushBehavior[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.facebook.appevents.AppEventsLogger$FlushBehavior_3B_.clone()>
	//    2    6:checkcast       #38  <Class AppEventsLogger$FlushBehavior[]>
	//    3    9:areturn         
	}

	private static final AppEventsLogger$FlushBehavior $VALUES[];
	public static final AppEventsLogger$FlushBehavior AUTO;
	public static final AppEventsLogger$FlushBehavior EXPLICIT_ONLY;

	static 
	{
		AUTO = new AppEventsLogger$FlushBehavior("AUTO", 0);
	//    0    0:new             #2   <Class AppEventsLogger$FlushBehavior>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "AUTO">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void AppEventsLogger$FlushBehavior(String, int)>
	//    5   10:putstatic       #22  <Field AppEventsLogger$FlushBehavior AUTO>
		EXPLICIT_ONLY = new AppEventsLogger$FlushBehavior("EXPLICIT_ONLY", 1);
	//    6   13:new             #2   <Class AppEventsLogger$FlushBehavior>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "EXPLICIT_ONLY">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void AppEventsLogger$FlushBehavior(String, int)>
	//   11   23:putstatic       #25  <Field AppEventsLogger$FlushBehavior EXPLICIT_ONLY>
		$VALUES = (new AppEventsLogger$FlushBehavior[] {
			AUTO, EXPLICIT_ONLY
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       AppEventsLogger$FlushBehavior[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field AppEventsLogger$FlushBehavior AUTO>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field AppEventsLogger$FlushBehavior EXPLICIT_ONLY>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field AppEventsLogger$FlushBehavior[] $VALUES>
	//*  23   45:return          
	}

	private AppEventsLogger$FlushBehavior(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
