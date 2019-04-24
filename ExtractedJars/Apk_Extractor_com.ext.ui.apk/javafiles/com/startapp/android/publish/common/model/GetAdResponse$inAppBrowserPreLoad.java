// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.common.model;


// Referenced classes of package com.startapp.android.publish.common.model:
//			GetAdResponse

private static final class GetAdResponse$inAppBrowserPreLoad extends Enum
{

	public static GetAdResponse$inAppBrowserPreLoad valueOf(String s)
	{
		return (GetAdResponse$inAppBrowserPreLoad)Enum.valueOf(com/startapp/android/publish/common/model/GetAdResponse$inAppBrowserPreLoad, s);
	//    0    0:ldc1            #2   <Class GetAdResponse$inAppBrowserPreLoad>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class GetAdResponse$inAppBrowserPreLoad>
	//    4    9:areturn         
	}

	public static GetAdResponse$inAppBrowserPreLoad[] values()
	{
		return (GetAdResponse$inAppBrowserPreLoad[])((GetAdResponse$inAppBrowserPreLoad []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field GetAdResponse$inAppBrowserPreLoad[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.startapp.android.publish.common.model.GetAdResponse$inAppBrowserPreLoad_3B_.clone()>
	//    2    6:checkcast       #42  <Class GetAdResponse$inAppBrowserPreLoad[]>
	//    3    9:areturn         
	}

	private static final GetAdResponse$inAppBrowserPreLoad $VALUES[];
	public static final GetAdResponse$inAppBrowserPreLoad CONTENT;
	public static final GetAdResponse$inAppBrowserPreLoad DISABLED;
	public static final GetAdResponse$inAppBrowserPreLoad FULL;

	static 
	{
		DISABLED = new GetAdResponse$inAppBrowserPreLoad("DISABLED", 0);
	//    0    0:new             #2   <Class GetAdResponse$inAppBrowserPreLoad>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "DISABLED">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void GetAdResponse$inAppBrowserPreLoad(String, int)>
	//    5   10:putstatic       #23  <Field GetAdResponse$inAppBrowserPreLoad DISABLED>
		CONTENT = new GetAdResponse$inAppBrowserPreLoad("CONTENT", 1);
	//    6   13:new             #2   <Class GetAdResponse$inAppBrowserPreLoad>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "CONTENT">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void GetAdResponse$inAppBrowserPreLoad(String, int)>
	//   11   23:putstatic       #26  <Field GetAdResponse$inAppBrowserPreLoad CONTENT>
		FULL = new GetAdResponse$inAppBrowserPreLoad("FULL", 2);
	//   12   26:new             #2   <Class GetAdResponse$inAppBrowserPreLoad>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "FULL">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void GetAdResponse$inAppBrowserPreLoad(String, int)>
	//   17   36:putstatic       #29  <Field GetAdResponse$inAppBrowserPreLoad FULL>
		$VALUES = (new GetAdResponse$inAppBrowserPreLoad[] {
			DISABLED, CONTENT, FULL
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       GetAdResponse$inAppBrowserPreLoad[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field GetAdResponse$inAppBrowserPreLoad DISABLED>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field GetAdResponse$inAppBrowserPreLoad CONTENT>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field GetAdResponse$inAppBrowserPreLoad FULL>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field GetAdResponse$inAppBrowserPreLoad[] $VALUES>
	//*  33   64:return          
	}

	private GetAdResponse$inAppBrowserPreLoad(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
