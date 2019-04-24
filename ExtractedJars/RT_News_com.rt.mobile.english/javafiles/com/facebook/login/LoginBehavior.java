// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;


public final class LoginBehavior extends Enum
{

	private LoginBehavior(String s, int i, boolean flag, boolean flag1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #35  <Method void Enum(String, int)>
		allowsKatanaAuth = flag;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #37  <Field boolean allowsKatanaAuth>
		allowsWebViewAuth = flag1;
	//    7   11:aload_0         
	//    8   12:iload           4
	//    9   14:putfield        #39  <Field boolean allowsWebViewAuth>
	//   10   17:return          
	}

	public static LoginBehavior valueOf(String s)
	{
		return (LoginBehavior)Enum.valueOf(com/facebook/login/LoginBehavior, s);
	//    0    0:ldc1            #2   <Class LoginBehavior>
	//    1    2:aload_0         
	//    2    3:invokestatic    #46  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class LoginBehavior>
	//    4    9:areturn         
	}

	public static LoginBehavior[] values()
	{
		return (LoginBehavior[])((LoginBehavior []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field LoginBehavior[] $VALUES>
	//    1    3:invokevirtual   #53  <Method Object _5B_Lcom.facebook.login.LoginBehavior_3B_.clone()>
	//    2    6:checkcast       #49  <Class LoginBehavior[]>
	//    3    9:areturn         
	}

	boolean allowsKatanaAuth()
	{
		return allowsKatanaAuth;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field boolean allowsKatanaAuth>
	//    2    4:ireturn         
	}

	boolean allowsWebViewAuth()
	{
		return allowsWebViewAuth;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field boolean allowsWebViewAuth>
	//    2    4:ireturn         
	}

	private static final LoginBehavior $VALUES[];
	public static final LoginBehavior NATIVE_ONLY;
	public static final LoginBehavior NATIVE_WITH_FALLBACK;
	public static final LoginBehavior WEB_ONLY;
	private final boolean allowsKatanaAuth;
	private final boolean allowsWebViewAuth;

	static 
	{
		NATIVE_WITH_FALLBACK = new LoginBehavior("NATIVE_WITH_FALLBACK", 0, true, true);
	//    0    0:new             #2   <Class LoginBehavior>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "NATIVE_WITH_FALLBACK">
	//    3    6:iconst_0        
	//    4    7:iconst_1        
	//    5    8:iconst_1        
	//    6    9:invokespecial   #21  <Method void LoginBehavior(String, int, boolean, boolean)>
	//    7   12:putstatic       #23  <Field LoginBehavior NATIVE_WITH_FALLBACK>
		NATIVE_ONLY = new LoginBehavior("NATIVE_ONLY", 1, true, false);
	//    8   15:new             #2   <Class LoginBehavior>
	//    9   18:dup             
	//   10   19:ldc1            #24  <String "NATIVE_ONLY">
	//   11   21:iconst_1        
	//   12   22:iconst_1        
	//   13   23:iconst_0        
	//   14   24:invokespecial   #21  <Method void LoginBehavior(String, int, boolean, boolean)>
	//   15   27:putstatic       #26  <Field LoginBehavior NATIVE_ONLY>
		WEB_ONLY = new LoginBehavior("WEB_ONLY", 2, false, true);
	//   16   30:new             #2   <Class LoginBehavior>
	//   17   33:dup             
	//   18   34:ldc1            #27  <String "WEB_ONLY">
	//   19   36:iconst_2        
	//   20   37:iconst_0        
	//   21   38:iconst_1        
	//   22   39:invokespecial   #21  <Method void LoginBehavior(String, int, boolean, boolean)>
	//   23   42:putstatic       #29  <Field LoginBehavior WEB_ONLY>
		$VALUES = (new LoginBehavior[] {
			NATIVE_WITH_FALLBACK, NATIVE_ONLY, WEB_ONLY
		});
	//   24   45:iconst_3        
	//   25   46:anewarray       LoginBehavior[]
	//   26   49:dup             
	//   27   50:iconst_0        
	//   28   51:getstatic       #23  <Field LoginBehavior NATIVE_WITH_FALLBACK>
	//   29   54:aastore         
	//   30   55:dup             
	//   31   56:iconst_1        
	//   32   57:getstatic       #26  <Field LoginBehavior NATIVE_ONLY>
	//   33   60:aastore         
	//   34   61:dup             
	//   35   62:iconst_2        
	//   36   63:getstatic       #29  <Field LoginBehavior WEB_ONLY>
	//   37   66:aastore         
	//   38   67:putstatic       #31  <Field LoginBehavior[] $VALUES>
	//*  39   70:return          
	}
}
