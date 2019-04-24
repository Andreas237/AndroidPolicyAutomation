// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.managers;


// Referenced classes of package com.gigya.socialize.android.managers:
//			GigyaFingerprintManager

public static final class GigyaFingerprintManager$FingerprintError extends Enum
{

	public static GigyaFingerprintManager$FingerprintError valueOf(String s)
	{
		return (GigyaFingerprintManager$FingerprintError)Enum.valueOf(com/gigya/socialize/android/managers/GigyaFingerprintManager$FingerprintError, s);
	//    0    0:ldc1            #2   <Class GigyaFingerprintManager$FingerprintError>
	//    1    2:aload_0         
	//    2    3:invokestatic    #66  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class GigyaFingerprintManager$FingerprintError>
	//    4    9:areturn         
	}

	public static GigyaFingerprintManager$FingerprintError[] values()
	{
		return (GigyaFingerprintManager$FingerprintError[])((GigyaFingerprintManager$FingerprintError []) ($VALUES)).clone();
	//    0    0:getstatic       #51  <Field GigyaFingerprintManager$FingerprintError[] $VALUES>
	//    1    3:invokevirtual   #73  <Method Object _5B_Lcom.gigya.socialize.android.managers.GigyaFingerprintManager$FingerprintError_3B_.clone()>
	//    2    6:checkcast       #69  <Class GigyaFingerprintManager$FingerprintError[]>
	//    3    9:areturn         
	}

	public int getErrorCode()
	{
		return errorCode;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field int errorCode>
	//    2    4:ireturn         
	}

	public String getErrorMessage()
	{
		return errorMessage;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field String errorMessage>
	//    2    4:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #80  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #82  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("ErrorCode: ");
	//    4    8:aload_1         
	//    5    9:ldc1            #84  <String "ErrorCode: ">
	//    6   11:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(errorCode);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #57  <Field int errorCode>
	//   11   20:invokevirtual   #91  <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		stringbuilder.append(" ErrorMessage: ");
	//   13   24:aload_1         
	//   14   25:ldc1            #93  <String " ErrorMessage: ">
	//   15   27:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(errorMessage);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #59  <Field String errorMessage>
	//   20   36:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		return stringbuilder.toString();
	//   22   40:aload_1         
	//   23   41:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   24   44:areturn         
	}

	private static final GigyaFingerprintManager$FingerprintError $VALUES[];
	public static final GigyaFingerprintManager$FingerprintError NO_FINGERPRINT_ENROLLED;
	public static final GigyaFingerprintManager$FingerprintError NO_HARDWARE_DETECTED;
	public static final GigyaFingerprintManager$FingerprintError NO_LOCKSCREEN_ENABLED;
	public static final GigyaFingerprintManager$FingerprintError NO_SESSION;
	private final int errorCode;
	private final String errorMessage;

	static 
	{
		NO_HARDWARE_DETECTED = new GigyaFingerprintManager$FingerprintError("NO_HARDWARE_DETECTED", 0, 0x1d4e4, "No fingerprint authentication hardware detected");
	//    0    0:new             #2   <Class GigyaFingerprintManager$FingerprintError>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "NO_HARDWARE_DETECTED">
	//    3    6:iconst_0        
	//    4    7:ldc1            #23  <Int 0x1d4e4>
	//    5    9:ldc1            #25  <String "No fingerprint authentication hardware detected">
	//    6   11:invokespecial   #29  <Method void GigyaFingerprintManager$FingerprintError(String, int, int, String)>
	//    7   14:putstatic       #31  <Field GigyaFingerprintManager$FingerprintError NO_HARDWARE_DETECTED>
		NO_FINGERPRINT_ENROLLED = new GigyaFingerprintManager$FingerprintError("NO_FINGERPRINT_ENROLLED", 1, 0x1d4e5, "No fingerprint configured. Please register at least one fingerprint in your device's Settings");
	//    8   17:new             #2   <Class GigyaFingerprintManager$FingerprintError>
	//    9   20:dup             
	//   10   21:ldc1            #32  <String "NO_FINGERPRINT_ENROLLED">
	//   11   23:iconst_1        
	//   12   24:ldc1            #33  <Int 0x1d4e5>
	//   13   26:ldc1            #35  <String "No fingerprint configured. Please register at least one fingerprint in your device's Settings">
	//   14   28:invokespecial   #29  <Method void GigyaFingerprintManager$FingerprintError(String, int, int, String)>
	//   15   31:putstatic       #37  <Field GigyaFingerprintManager$FingerprintError NO_FINGERPRINT_ENROLLED>
		NO_LOCKSCREEN_ENABLED = new GigyaFingerprintManager$FingerprintError("NO_LOCKSCREEN_ENABLED", 2, 0x1d4e6, "Lockscreen security is not enabled. Please enable lockscreen security in your device's Settings");
	//   16   34:new             #2   <Class GigyaFingerprintManager$FingerprintError>
	//   17   37:dup             
	//   18   38:ldc1            #38  <String "NO_LOCKSCREEN_ENABLED">
	//   19   40:iconst_2        
	//   20   41:ldc1            #39  <Int 0x1d4e6>
	//   21   43:ldc1            #41  <String "Lockscreen security is not enabled. Please enable lockscreen security in your device's Settings">
	//   22   45:invokespecial   #29  <Method void GigyaFingerprintManager$FingerprintError(String, int, int, String)>
	//   23   48:putstatic       #43  <Field GigyaFingerprintManager$FingerprintError NO_LOCKSCREEN_ENABLED>
		NO_SESSION = new GigyaFingerprintManager$FingerprintError("NO_SESSION", 3, 0x1d4e7, "There is no active session");
	//   24   51:new             #2   <Class GigyaFingerprintManager$FingerprintError>
	//   25   54:dup             
	//   26   55:ldc1            #44  <String "NO_SESSION">
	//   27   57:iconst_3        
	//   28   58:ldc1            #45  <Int 0x1d4e7>
	//   29   60:ldc1            #47  <String "There is no active session">
	//   30   62:invokespecial   #29  <Method void GigyaFingerprintManager$FingerprintError(String, int, int, String)>
	//   31   65:putstatic       #49  <Field GigyaFingerprintManager$FingerprintError NO_SESSION>
		$VALUES = (new GigyaFingerprintManager$FingerprintError[] {
			NO_HARDWARE_DETECTED, NO_FINGERPRINT_ENROLLED, NO_LOCKSCREEN_ENABLED, NO_SESSION
		});
	//   32   68:iconst_4        
	//   33   69:anewarray       GigyaFingerprintManager$FingerprintError[]
	//   34   72:dup             
	//   35   73:iconst_0        
	//   36   74:getstatic       #31  <Field GigyaFingerprintManager$FingerprintError NO_HARDWARE_DETECTED>
	//   37   77:aastore         
	//   38   78:dup             
	//   39   79:iconst_1        
	//   40   80:getstatic       #37  <Field GigyaFingerprintManager$FingerprintError NO_FINGERPRINT_ENROLLED>
	//   41   83:aastore         
	//   42   84:dup             
	//   43   85:iconst_2        
	//   44   86:getstatic       #43  <Field GigyaFingerprintManager$FingerprintError NO_LOCKSCREEN_ENABLED>
	//   45   89:aastore         
	//   46   90:dup             
	//   47   91:iconst_3        
	//   48   92:getstatic       #49  <Field GigyaFingerprintManager$FingerprintError NO_SESSION>
	//   49   95:aastore         
	//   50   96:putstatic       #51  <Field GigyaFingerprintManager$FingerprintError[] $VALUES>
	//*  51   99:return          
	}

	private GigyaFingerprintManager$FingerprintError(String s, int i, int j, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #55  <Method void Enum(String, int)>
		errorCode = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #57  <Field int errorCode>
		errorMessage = s1;
	//    7   11:aload_0         
	//    8   12:aload           4
	//    9   14:putfield        #59  <Field String errorMessage>
	//   10   17:return          
	}
}
