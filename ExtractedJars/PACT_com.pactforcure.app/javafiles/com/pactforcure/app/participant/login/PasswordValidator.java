// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.participant.login;

import java.util.*;

public class PasswordValidator
{
	public static final class InvalidPasswordReason extends Enum
	{

		public static InvalidPasswordReason valueOf(String s)
		{
			return (InvalidPasswordReason)Enum.valueOf(com/pactforcure/app/participant/login/PasswordValidator$InvalidPasswordReason, s);
		//    0    0:ldc1            #2   <Class PasswordValidator$InvalidPasswordReason>
		//    1    2:aload_0         
		//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class PasswordValidator$InvalidPasswordReason>
		//    4    9:areturn         
		}

		public static InvalidPasswordReason[] values()
		{
			return (InvalidPasswordReason[])((InvalidPasswordReason []) ($VALUES)).clone();
		//    0    0:getstatic       #39  <Field PasswordValidator$InvalidPasswordReason[] $VALUES>
		//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.pactforcure.app.participant.login.PasswordValidator$InvalidPasswordReason_3B_.clone()>
		//    2    6:checkcast       #50  <Class PasswordValidator$InvalidPasswordReason[]>
		//    3    9:areturn         
		}

		private static final InvalidPasswordReason $VALUES[];
		public static final InvalidPasswordReason AT_LEAST_ONE_LOWERCASE;
		public static final InvalidPasswordReason AT_LEAST_ONE_NUMERIC;
		public static final InvalidPasswordReason AT_LEAST_ONE_UPPERCASE;
		public static final InvalidPasswordReason TOO_LONG;
		public static final InvalidPasswordReason TOO_SHORT;

		static 
		{
			TOO_SHORT = new InvalidPasswordReason("TOO_SHORT", 0);
		//    0    0:new             #2   <Class PasswordValidator$InvalidPasswordReason>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "TOO_SHORT">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #23  <Method void PasswordValidator$InvalidPasswordReason(String, int)>
		//    5   10:putstatic       #25  <Field PasswordValidator$InvalidPasswordReason TOO_SHORT>
			TOO_LONG = new InvalidPasswordReason("TOO_LONG", 1);
		//    6   13:new             #2   <Class PasswordValidator$InvalidPasswordReason>
		//    7   16:dup             
		//    8   17:ldc1            #26  <String "TOO_LONG">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #23  <Method void PasswordValidator$InvalidPasswordReason(String, int)>
		//   11   23:putstatic       #28  <Field PasswordValidator$InvalidPasswordReason TOO_LONG>
			AT_LEAST_ONE_LOWERCASE = new InvalidPasswordReason("AT_LEAST_ONE_LOWERCASE", 2);
		//   12   26:new             #2   <Class PasswordValidator$InvalidPasswordReason>
		//   13   29:dup             
		//   14   30:ldc1            #29  <String "AT_LEAST_ONE_LOWERCASE">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #23  <Method void PasswordValidator$InvalidPasswordReason(String, int)>
		//   17   36:putstatic       #31  <Field PasswordValidator$InvalidPasswordReason AT_LEAST_ONE_LOWERCASE>
			AT_LEAST_ONE_UPPERCASE = new InvalidPasswordReason("AT_LEAST_ONE_UPPERCASE", 3);
		//   18   39:new             #2   <Class PasswordValidator$InvalidPasswordReason>
		//   19   42:dup             
		//   20   43:ldc1            #32  <String "AT_LEAST_ONE_UPPERCASE">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #23  <Method void PasswordValidator$InvalidPasswordReason(String, int)>
		//   23   49:putstatic       #34  <Field PasswordValidator$InvalidPasswordReason AT_LEAST_ONE_UPPERCASE>
			AT_LEAST_ONE_NUMERIC = new InvalidPasswordReason("AT_LEAST_ONE_NUMERIC", 4);
		//   24   52:new             #2   <Class PasswordValidator$InvalidPasswordReason>
		//   25   55:dup             
		//   26   56:ldc1            #35  <String "AT_LEAST_ONE_NUMERIC">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #23  <Method void PasswordValidator$InvalidPasswordReason(String, int)>
		//   29   62:putstatic       #37  <Field PasswordValidator$InvalidPasswordReason AT_LEAST_ONE_NUMERIC>
			$VALUES = (new InvalidPasswordReason[] {
				TOO_SHORT, TOO_LONG, AT_LEAST_ONE_LOWERCASE, AT_LEAST_ONE_UPPERCASE, AT_LEAST_ONE_NUMERIC
			});
		//   30   65:iconst_5        
		//   31   66:anewarray       InvalidPasswordReason[]
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

		private InvalidPasswordReason(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public PasswordValidator(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		password = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field String password>
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method List calculateErrors()>
	//    8   14:invokestatic    #30  <Method List Collections.unmodifiableList(List)>
	//    9   17:putfield        #32  <Field List errors>
	//   10   20:return          
	}

	private List calculateErrors()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #36  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void ArrayList()>
	//    3    7:astore_1        
		if(password.length() < 6)
	//*   4    8:aload_0         
	//*   5    9:getfield        #20  <Field String password>
	//*   6   12:invokevirtual   #43  <Method int String.length()>
	//*   7   15:bipush          6
	//*   8   17:icmpge          30
			((List) (arraylist)).add(((Object) (InvalidPasswordReason.TOO_SHORT)));
	//    9   20:aload_1         
	//   10   21:getstatic       #47  <Field PasswordValidator$InvalidPasswordReason PasswordValidator$InvalidPasswordReason.TOO_SHORT>
	//   11   24:invokeinterface #53  <Method boolean List.add(Object)>
	//   12   29:pop             
		if(password.length() > 20)
	//*  13   30:aload_0         
	//*  14   31:getfield        #20  <Field String password>
	//*  15   34:invokevirtual   #43  <Method int String.length()>
	//*  16   37:bipush          20
	//*  17   39:icmple          52
			((List) (arraylist)).add(((Object) (InvalidPasswordReason.TOO_LONG)));
	//   18   42:aload_1         
	//   19   43:getstatic       #56  <Field PasswordValidator$InvalidPasswordReason PasswordValidator$InvalidPasswordReason.TOO_LONG>
	//   20   46:invokeinterface #53  <Method boolean List.add(Object)>
	//   21   51:pop             
		if(!password.matches(".*[a-z].*"))
	//*  22   52:aload_0         
	//*  23   53:getfield        #20  <Field String password>
	//*  24   56:ldc1            #58  <String ".*[a-z].*">
	//*  25   58:invokevirtual   #62  <Method boolean String.matches(String)>
	//*  26   61:ifne            74
			((List) (arraylist)).add(((Object) (InvalidPasswordReason.AT_LEAST_ONE_LOWERCASE)));
	//   27   64:aload_1         
	//   28   65:getstatic       #65  <Field PasswordValidator$InvalidPasswordReason PasswordValidator$InvalidPasswordReason.AT_LEAST_ONE_LOWERCASE>
	//   29   68:invokeinterface #53  <Method boolean List.add(Object)>
	//   30   73:pop             
		if(!password.matches(".*[A-Z].*"))
	//*  31   74:aload_0         
	//*  32   75:getfield        #20  <Field String password>
	//*  33   78:ldc1            #67  <String ".*[A-Z].*">
	//*  34   80:invokevirtual   #62  <Method boolean String.matches(String)>
	//*  35   83:ifne            96
			((List) (arraylist)).add(((Object) (InvalidPasswordReason.AT_LEAST_ONE_UPPERCASE)));
	//   36   86:aload_1         
	//   37   87:getstatic       #70  <Field PasswordValidator$InvalidPasswordReason PasswordValidator$InvalidPasswordReason.AT_LEAST_ONE_UPPERCASE>
	//   38   90:invokeinterface #53  <Method boolean List.add(Object)>
	//   39   95:pop             
		if(!password.matches(".*[0-9].*"))
	//*  40   96:aload_0         
	//*  41   97:getfield        #20  <Field String password>
	//*  42  100:ldc1            #72  <String ".*[0-9].*">
	//*  43  102:invokevirtual   #62  <Method boolean String.matches(String)>
	//*  44  105:ifne            118
			((List) (arraylist)).add(((Object) (InvalidPasswordReason.AT_LEAST_ONE_NUMERIC)));
	//   45  108:aload_1         
	//   46  109:getstatic       #75  <Field PasswordValidator$InvalidPasswordReason PasswordValidator$InvalidPasswordReason.AT_LEAST_ONE_NUMERIC>
	//   47  112:invokeinterface #53  <Method boolean List.add(Object)>
	//   48  117:pop             
		return ((List) (arraylist));
	//   49  118:aload_1         
	//   50  119:areturn         
	}

	public boolean isValid()
	{
		return errors.size() == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field List errors>
	//    2    4:invokeinterface #82  <Method int List.size()>
	//    3    9:ifne            14
	//    4   12:iconst_1        
	//    5   13:ireturn         
	//    6   14:iconst_0        
	//    7   15:ireturn         
	}

	final List errors = Collections.unmodifiableList(calculateErrors());
	final String password;
}
