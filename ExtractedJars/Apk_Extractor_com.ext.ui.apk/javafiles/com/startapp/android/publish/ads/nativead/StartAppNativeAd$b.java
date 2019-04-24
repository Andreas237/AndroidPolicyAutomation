// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.nativead;


// Referenced classes of package com.startapp.android.publish.ads.nativead:
//			StartAppNativeAd

public static final class StartAppNativeAd$b extends Enum
{

	public static StartAppNativeAd$b valueOf(String s)
	{
		return (StartAppNativeAd$b)Enum.valueOf(com/startapp/android/publish/ads/nativead/StartAppNativeAd$b, s);
	//    0    0:ldc1            #2   <Class StartAppNativeAd$b>
	//    1    2:aload_0         
	//    2    3:invokestatic    #36  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class StartAppNativeAd$b>
	//    4    9:areturn         
	}

	public static StartAppNativeAd$b[] values()
	{
		return (StartAppNativeAd$b[])((StartAppNativeAd$b []) (c)).clone();
	//    0    0:getstatic       #28  <Field StartAppNativeAd$b[] c>
	//    1    3:invokevirtual   #43  <Method Object _5B_Lcom.startapp.android.publish.ads.nativead.StartAppNativeAd$b_3B_.clone()>
	//    2    6:checkcast       #39  <Class StartAppNativeAd$b[]>
	//    3    9:areturn         
	}

	public static final StartAppNativeAd$b a;
	public static final StartAppNativeAd$b b;
	private static final StartAppNativeAd$b c[];

	static 
	{
		a = new StartAppNativeAd$b("LAUNCH_APP", 0);
	//    0    0:new             #2   <Class StartAppNativeAd$b>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "LAUNCH_APP">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void StartAppNativeAd$b(String, int)>
	//    5   10:putstatic       #22  <Field StartAppNativeAd$b a>
		b = new StartAppNativeAd$b("OPEN_MARKET", 1);
	//    6   13:new             #2   <Class StartAppNativeAd$b>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "OPEN_MARKET">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void StartAppNativeAd$b(String, int)>
	//   11   23:putstatic       #26  <Field StartAppNativeAd$b b>
		c = (new StartAppNativeAd$b[] {
			a, b
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       StartAppNativeAd$b[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field StartAppNativeAd$b a>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #26  <Field StartAppNativeAd$b b>
	//   21   41:aastore         
	//   22   42:putstatic       #28  <Field StartAppNativeAd$b[] c>
	//*  23   45:return          
	}

	private StartAppNativeAd$b(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #30  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
