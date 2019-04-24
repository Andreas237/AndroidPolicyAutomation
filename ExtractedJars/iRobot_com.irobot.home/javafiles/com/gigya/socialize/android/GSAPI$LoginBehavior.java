// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;


// Referenced classes of package com.gigya.socialize.android:
//			GSAPI

public static final class GSAPI$LoginBehavior extends Enum
{

	public static GSAPI$LoginBehavior valueOf(String s)
	{
		return (GSAPI$LoginBehavior)Enum.valueOf(com/gigya/socialize/android/GSAPI$LoginBehavior, s);
	//    0    0:ldc1            #2   <Class GSAPI$LoginBehavior>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class GSAPI$LoginBehavior>
	//    4    9:areturn         
	}

	public static GSAPI$LoginBehavior[] values()
	{
		return (GSAPI$LoginBehavior[])((GSAPI$LoginBehavior []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field GSAPI$LoginBehavior[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.gigya.socialize.android.GSAPI$LoginBehavior_3B_.clone()>
	//    2    6:checkcast       #38  <Class GSAPI$LoginBehavior[]>
	//    3    9:areturn         
	}

	private static final GSAPI$LoginBehavior $VALUES[];
	public static final GSAPI$LoginBehavior BROWSER;
	public static final GSAPI$LoginBehavior WEBVIEW_DIALOG;

	static 
	{
		BROWSER = new GSAPI$LoginBehavior("BROWSER", 0);
	//    0    0:new             #2   <Class GSAPI$LoginBehavior>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "BROWSER">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void GSAPI$LoginBehavior(String, int)>
	//    5   10:putstatic       #22  <Field GSAPI$LoginBehavior BROWSER>
		WEBVIEW_DIALOG = new GSAPI$LoginBehavior("WEBVIEW_DIALOG", 1);
	//    6   13:new             #2   <Class GSAPI$LoginBehavior>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "WEBVIEW_DIALOG">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void GSAPI$LoginBehavior(String, int)>
	//   11   23:putstatic       #25  <Field GSAPI$LoginBehavior WEBVIEW_DIALOG>
		$VALUES = (new GSAPI$LoginBehavior[] {
			BROWSER, WEBVIEW_DIALOG
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       GSAPI$LoginBehavior[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field GSAPI$LoginBehavior BROWSER>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field GSAPI$LoginBehavior WEBVIEW_DIALOG>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field GSAPI$LoginBehavior[] $VALUES>
	//*  23   45:return          
	}

	private GSAPI$LoginBehavior(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
