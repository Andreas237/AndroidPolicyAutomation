// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;


// Referenced classes of package com.facebook.login:
//			LoginClient

static final class LoginClient$Result$Code extends Enum
{

	public static LoginClient$Result$Code valueOf(String s)
	{
		return (LoginClient$Result$Code)Enum.valueOf(com/facebook/login/LoginClient$Result$Code, s);
	//    0    0:ldc1            #2   <Class LoginClient$Result$Code>
	//    1    2:aload_0         
	//    2    3:invokestatic    #54  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class LoginClient$Result$Code>
	//    4    9:areturn         
	}

	public static LoginClient$Result$Code[] values()
	{
		return (LoginClient$Result$Code[])((LoginClient$Result$Code []) ($VALUES)).clone();
	//    0    0:getstatic       #42  <Field LoginClient$Result$Code[] $VALUES>
	//    1    3:invokevirtual   #61  <Method Object _5B_Lcom.facebook.login.LoginClient$Result$Code_3B_.clone()>
	//    2    6:checkcast       #57  <Class LoginClient$Result$Code[]>
	//    3    9:areturn         
	}

	String getLoggingValue()
	{
		return loggingValue;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field String loggingValue>
	//    2    4:areturn         
	}

	private static final LoginClient$Result$Code $VALUES[];
	public static final LoginClient$Result$Code CANCEL;
	public static final LoginClient$Result$Code ERROR;
	public static final LoginClient$Result$Code SUCCESS;
	private final String loggingValue;

	static 
	{
		SUCCESS = new LoginClient$Result$Code("SUCCESS", 0, "success");
	//    0    0:new             #2   <Class LoginClient$Result$Code>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "SUCCESS">
	//    3    6:iconst_0        
	//    4    7:ldc1            #24  <String "success">
	//    5    9:invokespecial   #28  <Method void LoginClient$Result$Code(String, int, String)>
	//    6   12:putstatic       #30  <Field LoginClient$Result$Code SUCCESS>
		CANCEL = new LoginClient$Result$Code("CANCEL", 1, "cancel");
	//    7   15:new             #2   <Class LoginClient$Result$Code>
	//    8   18:dup             
	//    9   19:ldc1            #31  <String "CANCEL">
	//   10   21:iconst_1        
	//   11   22:ldc1            #33  <String "cancel">
	//   12   24:invokespecial   #28  <Method void LoginClient$Result$Code(String, int, String)>
	//   13   27:putstatic       #35  <Field LoginClient$Result$Code CANCEL>
		ERROR = new LoginClient$Result$Code("ERROR", 2, "error");
	//   14   30:new             #2   <Class LoginClient$Result$Code>
	//   15   33:dup             
	//   16   34:ldc1            #36  <String "ERROR">
	//   17   36:iconst_2        
	//   18   37:ldc1            #38  <String "error">
	//   19   39:invokespecial   #28  <Method void LoginClient$Result$Code(String, int, String)>
	//   20   42:putstatic       #40  <Field LoginClient$Result$Code ERROR>
		$VALUES = (new LoginClient$Result$Code[] {
			SUCCESS, CANCEL, ERROR
		});
	//   21   45:iconst_3        
	//   22   46:anewarray       LoginClient$Result$Code[]
	//   23   49:dup             
	//   24   50:iconst_0        
	//   25   51:getstatic       #30  <Field LoginClient$Result$Code SUCCESS>
	//   26   54:aastore         
	//   27   55:dup             
	//   28   56:iconst_1        
	//   29   57:getstatic       #35  <Field LoginClient$Result$Code CANCEL>
	//   30   60:aastore         
	//   31   61:dup             
	//   32   62:iconst_2        
	//   33   63:getstatic       #40  <Field LoginClient$Result$Code ERROR>
	//   34   66:aastore         
	//   35   67:putstatic       #42  <Field LoginClient$Result$Code[] $VALUES>
	//*  36   70:return          
	}

	private LoginClient$Result$Code(String s, int i, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #45  <Method void Enum(String, int)>
		loggingValue = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #47  <Field String loggingValue>
	//    7   11:return          
	}
}
