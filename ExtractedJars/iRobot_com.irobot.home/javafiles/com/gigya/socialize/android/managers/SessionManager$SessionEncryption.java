// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.managers;


// Referenced classes of package com.gigya.socialize.android.managers:
//			SessionManager

public static final class SessionManager$SessionEncryption extends Enum
{

	public static SessionManager$SessionEncryption valueOf(String s)
	{
		return (SessionManager$SessionEncryption)Enum.valueOf(com/gigya/socialize/android/managers/SessionManager$SessionEncryption, s);
	//    0    0:ldc1            #2   <Class SessionManager$SessionEncryption>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class SessionManager$SessionEncryption>
	//    4    9:areturn         
	}

	public static SessionManager$SessionEncryption[] values()
	{
		return (SessionManager$SessionEncryption[])((SessionManager$SessionEncryption []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field SessionManager$SessionEncryption[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.gigya.socialize.android.managers.SessionManager$SessionEncryption_3B_.clone()>
	//    2    6:checkcast       #38  <Class SessionManager$SessionEncryption[]>
	//    3    9:areturn         
	}

	private static final SessionManager$SessionEncryption $VALUES[];
	public static final SessionManager$SessionEncryption DEFAULT;
	public static final SessionManager$SessionEncryption FINGERPRINT;

	static 
	{
		DEFAULT = new SessionManager$SessionEncryption("DEFAULT", 0);
	//    0    0:new             #2   <Class SessionManager$SessionEncryption>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "DEFAULT">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void SessionManager$SessionEncryption(String, int)>
	//    5   10:putstatic       #22  <Field SessionManager$SessionEncryption DEFAULT>
		FINGERPRINT = new SessionManager$SessionEncryption("FINGERPRINT", 1);
	//    6   13:new             #2   <Class SessionManager$SessionEncryption>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "FINGERPRINT">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void SessionManager$SessionEncryption(String, int)>
	//   11   23:putstatic       #25  <Field SessionManager$SessionEncryption FINGERPRINT>
		$VALUES = (new SessionManager$SessionEncryption[] {
			DEFAULT, FINGERPRINT
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       SessionManager$SessionEncryption[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field SessionManager$SessionEncryption DEFAULT>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field SessionManager$SessionEncryption FINGERPRINT>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field SessionManager$SessionEncryption[] $VALUES>
	//*  23   45:return          
	}

	private SessionManager$SessionEncryption(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
