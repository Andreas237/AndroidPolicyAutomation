// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;


// Referenced classes of package com.facebook.appevents:
//			AppEventsLogger

private static final class AppEventsLogger$FlushReason extends Enum
{

	public static AppEventsLogger$FlushReason valueOf(String s)
	{
		return (AppEventsLogger$FlushReason)Enum.valueOf(com/facebook/appevents/AppEventsLogger$FlushReason, s);
	//    0    0:ldc1            #2   <Class AppEventsLogger$FlushReason>
	//    1    2:aload_0         
	//    2    3:invokestatic    #51  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AppEventsLogger$FlushReason>
	//    4    9:areturn         
	}

	public static AppEventsLogger$FlushReason[] values()
	{
		return (AppEventsLogger$FlushReason[])((AppEventsLogger$FlushReason []) ($VALUES)).clone();
	//    0    0:getstatic       #43  <Field AppEventsLogger$FlushReason[] $VALUES>
	//    1    3:invokevirtual   #58  <Method Object _5B_Lcom.facebook.appevents.AppEventsLogger$FlushReason_3B_.clone()>
	//    2    6:checkcast       #54  <Class AppEventsLogger$FlushReason[]>
	//    3    9:areturn         
	}

	private static final AppEventsLogger$FlushReason $VALUES[];
	public static final AppEventsLogger$FlushReason EAGER_FLUSHING_EVENT;
	public static final AppEventsLogger$FlushReason EVENT_THRESHOLD;
	public static final AppEventsLogger$FlushReason EXPLICIT;
	public static final AppEventsLogger$FlushReason PERSISTED_EVENTS;
	public static final AppEventsLogger$FlushReason SESSION_CHANGE;
	public static final AppEventsLogger$FlushReason TIMER;

	static 
	{
		EXPLICIT = new AppEventsLogger$FlushReason("EXPLICIT", 0);
	//    0    0:new             #2   <Class AppEventsLogger$FlushReason>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "EXPLICIT">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #24  <Method void AppEventsLogger$FlushReason(String, int)>
	//    5   10:putstatic       #26  <Field AppEventsLogger$FlushReason EXPLICIT>
		TIMER = new AppEventsLogger$FlushReason("TIMER", 1);
	//    6   13:new             #2   <Class AppEventsLogger$FlushReason>
	//    7   16:dup             
	//    8   17:ldc1            #27  <String "TIMER">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #24  <Method void AppEventsLogger$FlushReason(String, int)>
	//   11   23:putstatic       #29  <Field AppEventsLogger$FlushReason TIMER>
		SESSION_CHANGE = new AppEventsLogger$FlushReason("SESSION_CHANGE", 2);
	//   12   26:new             #2   <Class AppEventsLogger$FlushReason>
	//   13   29:dup             
	//   14   30:ldc1            #30  <String "SESSION_CHANGE">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #24  <Method void AppEventsLogger$FlushReason(String, int)>
	//   17   36:putstatic       #32  <Field AppEventsLogger$FlushReason SESSION_CHANGE>
		PERSISTED_EVENTS = new AppEventsLogger$FlushReason("PERSISTED_EVENTS", 3);
	//   18   39:new             #2   <Class AppEventsLogger$FlushReason>
	//   19   42:dup             
	//   20   43:ldc1            #33  <String "PERSISTED_EVENTS">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #24  <Method void AppEventsLogger$FlushReason(String, int)>
	//   23   49:putstatic       #35  <Field AppEventsLogger$FlushReason PERSISTED_EVENTS>
		EVENT_THRESHOLD = new AppEventsLogger$FlushReason("EVENT_THRESHOLD", 4);
	//   24   52:new             #2   <Class AppEventsLogger$FlushReason>
	//   25   55:dup             
	//   26   56:ldc1            #36  <String "EVENT_THRESHOLD">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #24  <Method void AppEventsLogger$FlushReason(String, int)>
	//   29   62:putstatic       #38  <Field AppEventsLogger$FlushReason EVENT_THRESHOLD>
		EAGER_FLUSHING_EVENT = new AppEventsLogger$FlushReason("EAGER_FLUSHING_EVENT", 5);
	//   30   65:new             #2   <Class AppEventsLogger$FlushReason>
	//   31   68:dup             
	//   32   69:ldc1            #39  <String "EAGER_FLUSHING_EVENT">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #24  <Method void AppEventsLogger$FlushReason(String, int)>
	//   35   75:putstatic       #41  <Field AppEventsLogger$FlushReason EAGER_FLUSHING_EVENT>
		$VALUES = (new AppEventsLogger$FlushReason[] {
			EXPLICIT, TIMER, SESSION_CHANGE, PERSISTED_EVENTS, EVENT_THRESHOLD, EAGER_FLUSHING_EVENT
		});
	//   36   78:bipush          6
	//   37   80:anewarray       AppEventsLogger$FlushReason[]
	//   38   83:dup             
	//   39   84:iconst_0        
	//   40   85:getstatic       #26  <Field AppEventsLogger$FlushReason EXPLICIT>
	//   41   88:aastore         
	//   42   89:dup             
	//   43   90:iconst_1        
	//   44   91:getstatic       #29  <Field AppEventsLogger$FlushReason TIMER>
	//   45   94:aastore         
	//   46   95:dup             
	//   47   96:iconst_2        
	//   48   97:getstatic       #32  <Field AppEventsLogger$FlushReason SESSION_CHANGE>
	//   49  100:aastore         
	//   50  101:dup             
	//   51  102:iconst_3        
	//   52  103:getstatic       #35  <Field AppEventsLogger$FlushReason PERSISTED_EVENTS>
	//   53  106:aastore         
	//   54  107:dup             
	//   55  108:iconst_4        
	//   56  109:getstatic       #38  <Field AppEventsLogger$FlushReason EVENT_THRESHOLD>
	//   57  112:aastore         
	//   58  113:dup             
	//   59  114:iconst_5        
	//   60  115:getstatic       #41  <Field AppEventsLogger$FlushReason EAGER_FLUSHING_EVENT>
	//   61  118:aastore         
	//   62  119:putstatic       #43  <Field AppEventsLogger$FlushReason[] $VALUES>
	//*  63  122:return          
	}

	private AppEventsLogger$FlushReason(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #45  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
