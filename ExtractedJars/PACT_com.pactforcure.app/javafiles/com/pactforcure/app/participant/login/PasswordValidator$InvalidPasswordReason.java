// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.participant.login;


// Referenced classes of package com.pactforcure.app.participant.login:
//			PasswordValidator

public static final class PasswordValidator$InvalidPasswordReason extends Enum
{

	public static PasswordValidator$InvalidPasswordReason valueOf(String s)
	{
		return (PasswordValidator$InvalidPasswordReason)Enum.valueOf(com/pactforcure/app/participant/login/PasswordValidator$InvalidPasswordReason, s);
	//    0    0:ldc1            #2   <Class PasswordValidator$InvalidPasswordReason>
	//    1    2:aload_0         
	//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class PasswordValidator$InvalidPasswordReason>
	//    4    9:areturn         
	}

	public static PasswordValidator$InvalidPasswordReason[] values()
	{
		return (PasswordValidator$InvalidPasswordReason[])((PasswordValidator$InvalidPasswordReason []) ($VALUES)).clone();
	//    0    0:getstatic       #39  <Field PasswordValidator$InvalidPasswordReason[] $VALUES>
	//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.pactforcure.app.participant.login.PasswordValidator$InvalidPasswordReason_3B_.clone()>
	//    2    6:checkcast       #50  <Class PasswordValidator$InvalidPasswordReason[]>
	//    3    9:areturn         
	}

	private static final PasswordValidator$InvalidPasswordReason $VALUES[];
	public static final PasswordValidator$InvalidPasswordReason AT_LEAST_ONE_LOWERCASE;
	public static final PasswordValidator$InvalidPasswordReason AT_LEAST_ONE_NUMERIC;
	public static final PasswordValidator$InvalidPasswordReason AT_LEAST_ONE_UPPERCASE;
	public static final PasswordValidator$InvalidPasswordReason TOO_LONG;
	public static final PasswordValidator$InvalidPasswordReason TOO_SHORT;

	static 
	{
		TOO_SHORT = new PasswordValidator$InvalidPasswordReason("TOO_SHORT", 0);
	//    0    0:new             #2   <Class PasswordValidator$InvalidPasswordReason>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "TOO_SHORT">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void PasswordValidator$InvalidPasswordReason(String, int)>
	//    5   10:putstatic       #25  <Field PasswordValidator$InvalidPasswordReason TOO_SHORT>
		TOO_LONG = new PasswordValidator$InvalidPasswordReason("TOO_LONG", 1);
	//    6   13:new             #2   <Class PasswordValidator$InvalidPasswordReason>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "TOO_LONG">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #23  <Method void PasswordValidator$InvalidPasswordReason(String, int)>
	//   11   23:putstatic       #28  <Field PasswordValidator$InvalidPasswordReason TOO_LONG>
		AT_LEAST_ONE_LOWERCASE = new PasswordValidator$InvalidPasswordReason("AT_LEAST_ONE_LOWERCASE", 2);
	//   12   26:new             #2   <Class PasswordValidator$InvalidPasswordReason>
	//   13   29:dup             
	//   14   30:ldc1            #29  <String "AT_LEAST_ONE_LOWERCASE">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #23  <Method void PasswordValidator$InvalidPasswordReason(String, int)>
	//   17   36:putstatic       #31  <Field PasswordValidator$InvalidPasswordReason AT_LEAST_ONE_LOWERCASE>
		AT_LEAST_ONE_UPPERCASE = new PasswordValidator$InvalidPasswordReason("AT_LEAST_ONE_UPPERCASE", 3);
	//   18   39:new             #2   <Class PasswordValidator$InvalidPasswordReason>
	//   19   42:dup             
	//   20   43:ldc1            #32  <String "AT_LEAST_ONE_UPPERCASE">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #23  <Method void PasswordValidator$InvalidPasswordReason(String, int)>
	//   23   49:putstatic       #34  <Field PasswordValidator$InvalidPasswordReason AT_LEAST_ONE_UPPERCASE>
		AT_LEAST_ONE_NUMERIC = new PasswordValidator$InvalidPasswordReason("AT_LEAST_ONE_NUMERIC", 4);
	//   24   52:new             #2   <Class PasswordValidator$InvalidPasswordReason>
	//   25   55:dup             
	//   26   56:ldc1            #35  <String "AT_LEAST_ONE_NUMERIC">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #23  <Method void PasswordValidator$InvalidPasswordReason(String, int)>
	//   29   62:putstatic       #37  <Field PasswordValidator$InvalidPasswordReason AT_LEAST_ONE_NUMERIC>
		$VALUES = (new PasswordValidator$InvalidPasswordReason[] {
			TOO_SHORT, TOO_LONG, AT_LEAST_ONE_LOWERCASE, AT_LEAST_ONE_UPPERCASE, AT_LEAST_ONE_NUMERIC
		});
	//   30   65:iconst_5        
	//   31   66:anewarray       PasswordValidator$InvalidPasswordReason[]
	//   32   69:dup             
	//   33   70:iconst_0        
	//   34   71:getstatic       #25  <Field PasswordValidator$InvalidPasswordReason TOO_SHORT>
	//   35   74:aastore         
	//   36   75:dup             
	//   37   76:iconst_1        
	//   38   77:getstatic       #28  <Field PasswordValidator$InvalidPasswordReason TOO_LONG>
	//   39   80:aastore         
	//   40   81:dup             
	//   41   82:iconst_2        
	//   42   83:getstatic       #31  <Field PasswordValidator$InvalidPasswordReason AT_LEAST_ONE_LOWERCASE>
	//   43   86:aastore         
	//   44   87:dup             
	//   45   88:iconst_3        
	//   46   89:getstatic       #34  <Field PasswordValidator$InvalidPasswordReason AT_LEAST_ONE_UPPERCASE>
	//   47   92:aastore         
	//   48   93:dup             
	//   49   94:iconst_4        
	//   50   95:getstatic       #37  <Field PasswordValidator$InvalidPasswordReason AT_LEAST_ONE_NUMERIC>
	//   51   98:aastore         
	//   52   99:putstatic       #39  <Field PasswordValidator$InvalidPasswordReason[] $VALUES>
	//*  53  102:return          
	}

	private PasswordValidator$InvalidPasswordReason(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
