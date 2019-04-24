// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;


// Referenced classes of package com.facebook.appevents:
//			AppEventsLogger

private static final class AppEventsLogger$FlushResult extends Enum
{

	public static AppEventsLogger$FlushResult valueOf(String s)
	{
		return (AppEventsLogger$FlushResult)Enum.valueOf(com/facebook/appevents/AppEventsLogger$FlushResult, s);
	//    0    0:ldc1            #2   <Class AppEventsLogger$FlushResult>
	//    1    2:aload_0         
	//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AppEventsLogger$FlushResult>
	//    4    9:areturn         
	}

	public static AppEventsLogger$FlushResult[] values()
	{
		return (AppEventsLogger$FlushResult[])((AppEventsLogger$FlushResult []) ($VALUES)).clone();
	//    0    0:getstatic       #35  <Field AppEventsLogger$FlushResult[] $VALUES>
	//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.facebook.appevents.AppEventsLogger$FlushResult_3B_.clone()>
	//    2    6:checkcast       #46  <Class AppEventsLogger$FlushResult[]>
	//    3    9:areturn         
	}

	private static final AppEventsLogger$FlushResult $VALUES[];
	public static final AppEventsLogger$FlushResult NO_CONNECTIVITY;
	public static final AppEventsLogger$FlushResult SERVER_ERROR;
	public static final AppEventsLogger$FlushResult SUCCESS;
	public static final AppEventsLogger$FlushResult UNKNOWN_ERROR;

	static 
	{
		SUCCESS = new AppEventsLogger$FlushResult("SUCCESS", 0);
	//    0    0:new             #2   <Class AppEventsLogger$FlushResult>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "SUCCESS">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void AppEventsLogger$FlushResult(String, int)>
	//    5   10:putstatic       #24  <Field AppEventsLogger$FlushResult SUCCESS>
		SERVER_ERROR = new AppEventsLogger$FlushResult("SERVER_ERROR", 1);
	//    6   13:new             #2   <Class AppEventsLogger$FlushResult>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "SERVER_ERROR">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void AppEventsLogger$FlushResult(String, int)>
	//   11   23:putstatic       #27  <Field AppEventsLogger$FlushResult SERVER_ERROR>
		NO_CONNECTIVITY = new AppEventsLogger$FlushResult("NO_CONNECTIVITY", 2);
	//   12   26:new             #2   <Class AppEventsLogger$FlushResult>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "NO_CONNECTIVITY">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void AppEventsLogger$FlushResult(String, int)>
	//   17   36:putstatic       #30  <Field AppEventsLogger$FlushResult NO_CONNECTIVITY>
		UNKNOWN_ERROR = new AppEventsLogger$FlushResult("UNKNOWN_ERROR", 3);
	//   18   39:new             #2   <Class AppEventsLogger$FlushResult>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "UNKNOWN_ERROR">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void AppEventsLogger$FlushResult(String, int)>
	//   23   49:putstatic       #33  <Field AppEventsLogger$FlushResult UNKNOWN_ERROR>
		$VALUES = (new AppEventsLogger$FlushResult[] {
			SUCCESS, SERVER_ERROR, NO_CONNECTIVITY, UNKNOWN_ERROR
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       AppEventsLogger$FlushResult[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field AppEventsLogger$FlushResult SUCCESS>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #27  <Field AppEventsLogger$FlushResult SERVER_ERROR>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #30  <Field AppEventsLogger$FlushResult NO_CONNECTIVITY>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #33  <Field AppEventsLogger$FlushResult UNKNOWN_ERROR>
	//   41   79:aastore         
	//   42   80:putstatic       #35  <Field AppEventsLogger$FlushResult[] $VALUES>
	//*  43   83:return          
	}

	private AppEventsLogger$FlushResult(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
