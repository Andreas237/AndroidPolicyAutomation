// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;


// Referenced classes of package bolts:
//			AppLinkNavigation

public static final class AppLinkNavigation$NavigationResult extends Enum
{

	public static AppLinkNavigation$NavigationResult valueOf(String s)
	{
		return (AppLinkNavigation$NavigationResult)Enum.valueOf(bolts/AppLinkNavigation$NavigationResult, s);
	//    0    0:ldc1            #2   <Class AppLinkNavigation$NavigationResult>
	//    1    2:aload_0         
	//    2    3:invokestatic    #56  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AppLinkNavigation$NavigationResult>
	//    4    9:areturn         
	}

	public static AppLinkNavigation$NavigationResult[] values()
	{
		return (AppLinkNavigation$NavigationResult[])((AppLinkNavigation$NavigationResult []) ($VALUES)).clone();
	//    0    0:getstatic       #41  <Field AppLinkNavigation$NavigationResult[] $VALUES>
	//    1    3:invokevirtual   #63  <Method Object _5B_Lbolts.AppLinkNavigation$NavigationResult_3B_.clone()>
	//    2    6:checkcast       #59  <Class AppLinkNavigation$NavigationResult[]>
	//    3    9:areturn         
	}

	public String getCode()
	{
		return code;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field String code>
	//    2    4:areturn         
	}

	public boolean isSucceeded()
	{
		return succeeded;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field boolean succeeded>
	//    2    4:ireturn         
	}

	private static final AppLinkNavigation$NavigationResult $VALUES[];
	public static final AppLinkNavigation$NavigationResult APP;
	public static final AppLinkNavigation$NavigationResult FAILED;
	public static final AppLinkNavigation$NavigationResult WEB;
	private String code;
	private boolean succeeded;

	static 
	{
		FAILED = new AppLinkNavigation$NavigationResult("FAILED", 0, "failed", false);
	//    0    0:new             #2   <Class AppLinkNavigation$NavigationResult>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "FAILED">
	//    3    6:iconst_0        
	//    4    7:ldc1            #23  <String "failed">
	//    5    9:iconst_0        
	//    6   10:invokespecial   #27  <Method void AppLinkNavigation$NavigationResult(String, int, String, boolean)>
	//    7   13:putstatic       #29  <Field AppLinkNavigation$NavigationResult FAILED>
		WEB = new AppLinkNavigation$NavigationResult("WEB", 1, "web", true);
	//    8   16:new             #2   <Class AppLinkNavigation$NavigationResult>
	//    9   19:dup             
	//   10   20:ldc1            #30  <String "WEB">
	//   11   22:iconst_1        
	//   12   23:ldc1            #32  <String "web">
	//   13   25:iconst_1        
	//   14   26:invokespecial   #27  <Method void AppLinkNavigation$NavigationResult(String, int, String, boolean)>
	//   15   29:putstatic       #34  <Field AppLinkNavigation$NavigationResult WEB>
		APP = new AppLinkNavigation$NavigationResult("APP", 2, "app", true);
	//   16   32:new             #2   <Class AppLinkNavigation$NavigationResult>
	//   17   35:dup             
	//   18   36:ldc1            #35  <String "APP">
	//   19   38:iconst_2        
	//   20   39:ldc1            #37  <String "app">
	//   21   41:iconst_1        
	//   22   42:invokespecial   #27  <Method void AppLinkNavigation$NavigationResult(String, int, String, boolean)>
	//   23   45:putstatic       #39  <Field AppLinkNavigation$NavigationResult APP>
		$VALUES = (new AppLinkNavigation$NavigationResult[] {
			FAILED, WEB, APP
		});
	//   24   48:iconst_3        
	//   25   49:anewarray       AppLinkNavigation$NavigationResult[]
	//   26   52:dup             
	//   27   53:iconst_0        
	//   28   54:getstatic       #29  <Field AppLinkNavigation$NavigationResult FAILED>
	//   29   57:aastore         
	//   30   58:dup             
	//   31   59:iconst_1        
	//   32   60:getstatic       #34  <Field AppLinkNavigation$NavigationResult WEB>
	//   33   63:aastore         
	//   34   64:dup             
	//   35   65:iconst_2        
	//   36   66:getstatic       #39  <Field AppLinkNavigation$NavigationResult APP>
	//   37   69:aastore         
	//   38   70:putstatic       #41  <Field AppLinkNavigation$NavigationResult[] $VALUES>
	//*  39   73:return          
	}

	private AppLinkNavigation$NavigationResult(String s, int i, String s1, boolean flag)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #45  <Method void Enum(String, int)>
		code = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #47  <Field String code>
		succeeded = flag;
	//    7   11:aload_0         
	//    8   12:iload           4
	//    9   14:putfield        #49  <Field boolean succeeded>
	//   10   17:return          
	}
}
