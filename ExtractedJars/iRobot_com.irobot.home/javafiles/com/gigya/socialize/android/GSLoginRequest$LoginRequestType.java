// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;


// Referenced classes of package com.gigya.socialize.android:
//			GSLoginRequest

public static final class GSLoginRequest$LoginRequestType extends Enum
{

	public static GSLoginRequest$LoginRequestType valueOf(String s)
	{
		return (GSLoginRequest$LoginRequestType)Enum.valueOf(com/gigya/socialize/android/GSLoginRequest$LoginRequestType, s);
	//    0    0:ldc1            #2   <Class GSLoginRequest$LoginRequestType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class GSLoginRequest$LoginRequestType>
	//    4    9:areturn         
	}

	public static GSLoginRequest$LoginRequestType[] values()
	{
		return (GSLoginRequest$LoginRequestType[])((GSLoginRequest$LoginRequestType []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field GSLoginRequest$LoginRequestType[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.gigya.socialize.android.GSLoginRequest$LoginRequestType_3B_.clone()>
	//    2    6:checkcast       #42  <Class GSLoginRequest$LoginRequestType[]>
	//    3    9:areturn         
	}

	private static final GSLoginRequest$LoginRequestType $VALUES[];
	public static final GSLoginRequest$LoginRequestType addConnection;
	public static final GSLoginRequest$LoginRequestType login;
	public static final GSLoginRequest$LoginRequestType socialLogin;

	static 
	{
		login = new GSLoginRequest$LoginRequestType("login", 0);
	//    0    0:new             #2   <Class GSLoginRequest$LoginRequestType>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "login">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void GSLoginRequest$LoginRequestType(String, int)>
	//    5   10:putstatic       #23  <Field GSLoginRequest$LoginRequestType login>
		addConnection = new GSLoginRequest$LoginRequestType("addConnection", 1);
	//    6   13:new             #2   <Class GSLoginRequest$LoginRequestType>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "addConnection">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void GSLoginRequest$LoginRequestType(String, int)>
	//   11   23:putstatic       #26  <Field GSLoginRequest$LoginRequestType addConnection>
		socialLogin = new GSLoginRequest$LoginRequestType("socialLogin", 2);
	//   12   26:new             #2   <Class GSLoginRequest$LoginRequestType>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "socialLogin">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void GSLoginRequest$LoginRequestType(String, int)>
	//   17   36:putstatic       #29  <Field GSLoginRequest$LoginRequestType socialLogin>
		$VALUES = (new GSLoginRequest$LoginRequestType[] {
			login, addConnection, socialLogin
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       GSLoginRequest$LoginRequestType[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field GSLoginRequest$LoginRequestType login>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field GSLoginRequest$LoginRequestType addConnection>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field GSLoginRequest$LoginRequestType socialLogin>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field GSLoginRequest$LoginRequestType[] $VALUES>
	//*  33   64:return          
	}

	private GSLoginRequest$LoginRequestType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
