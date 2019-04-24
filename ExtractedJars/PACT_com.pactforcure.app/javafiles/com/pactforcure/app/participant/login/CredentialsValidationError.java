// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.participant.login;


public final class CredentialsValidationError extends Enum
{

	private CredentialsValidationError(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #34  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static CredentialsValidationError valueOf(String s)
	{
		return (CredentialsValidationError)Enum.valueOf(com/pactforcure/app/participant/login/CredentialsValidationError, s);
	//    0    0:ldc1            #2   <Class CredentialsValidationError>
	//    1    2:aload_0         
	//    2    3:invokestatic    #40  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class CredentialsValidationError>
	//    4    9:areturn         
	}

	public static CredentialsValidationError[] values()
	{
		return (CredentialsValidationError[])((CredentialsValidationError []) ($VALUES)).clone();
	//    0    0:getstatic       #32  <Field CredentialsValidationError[] $VALUES>
	//    1    3:invokevirtual   #47  <Method Object _5B_Lcom.pactforcure.app.participant.login.CredentialsValidationError_3B_.clone()>
	//    2    6:checkcast       #43  <Class CredentialsValidationError[]>
	//    3    9:areturn         
	}

	private static final CredentialsValidationError $VALUES[];
	public static final CredentialsValidationError EMPTY_EMAIL;
	public static final CredentialsValidationError EMPTY_PASSWORD;
	public static final CredentialsValidationError INVALID_EMAIL;
	public static final CredentialsValidationError INVALID_PASSWORD;

	static 
	{
		EMPTY_EMAIL = new CredentialsValidationError("EMPTY_EMAIL", 0);
	//    0    0:new             #2   <Class CredentialsValidationError>
	//    1    3:dup             
	//    2    4:ldc1            #15  <String "EMPTY_EMAIL">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #19  <Method void CredentialsValidationError(String, int)>
	//    5   10:putstatic       #21  <Field CredentialsValidationError EMPTY_EMAIL>
		EMPTY_PASSWORD = new CredentialsValidationError("EMPTY_PASSWORD", 1);
	//    6   13:new             #2   <Class CredentialsValidationError>
	//    7   16:dup             
	//    8   17:ldc1            #22  <String "EMPTY_PASSWORD">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #19  <Method void CredentialsValidationError(String, int)>
	//   11   23:putstatic       #24  <Field CredentialsValidationError EMPTY_PASSWORD>
		INVALID_EMAIL = new CredentialsValidationError("INVALID_EMAIL", 2);
	//   12   26:new             #2   <Class CredentialsValidationError>
	//   13   29:dup             
	//   14   30:ldc1            #25  <String "INVALID_EMAIL">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #19  <Method void CredentialsValidationError(String, int)>
	//   17   36:putstatic       #27  <Field CredentialsValidationError INVALID_EMAIL>
		INVALID_PASSWORD = new CredentialsValidationError("INVALID_PASSWORD", 3);
	//   18   39:new             #2   <Class CredentialsValidationError>
	//   19   42:dup             
	//   20   43:ldc1            #28  <String "INVALID_PASSWORD">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #19  <Method void CredentialsValidationError(String, int)>
	//   23   49:putstatic       #30  <Field CredentialsValidationError INVALID_PASSWORD>
		$VALUES = (new CredentialsValidationError[] {
			EMPTY_EMAIL, EMPTY_PASSWORD, INVALID_EMAIL, INVALID_PASSWORD
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       CredentialsValidationError[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #21  <Field CredentialsValidationError EMPTY_EMAIL>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #24  <Field CredentialsValidationError EMPTY_PASSWORD>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #27  <Field CredentialsValidationError INVALID_EMAIL>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #30  <Field CredentialsValidationError INVALID_PASSWORD>
	//   41   79:aastore         
	//   42   80:putstatic       #32  <Field CredentialsValidationError[] $VALUES>
	//*  43   83:return          
	}
}
