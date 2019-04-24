// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.managers;

import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import com.gigya.socialize.android.*;
import com.gigya.socialize.android.keyStore.BaseKey;
import com.gigya.socialize.android.keyStore.KeyStoreHelper;
import com.gigya.socialize.android.log.GigyaLog;

// Referenced classes of package com.gigya.socialize.android.managers:
//			IFingerprintCallbacks, SessionManager, FingerprintOperation, IFingerprintOperation

public class GigyaFingerprintManager
{
	public static final class FingerprintError extends Enum
	{

		public static FingerprintError valueOf(String s)
		{
			return (FingerprintError)Enum.valueOf(com/gigya/socialize/android/managers/GigyaFingerprintManager$FingerprintError, s);
		//    0    0:ldc1            #2   <Class GigyaFingerprintManager$FingerprintError>
		//    1    2:aload_0         
		//    2    3:invokestatic    #66  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class GigyaFingerprintManager$FingerprintError>
		//    4    9:areturn         
		}

		public static FingerprintError[] values()
		{
			return (FingerprintError[])((FingerprintError []) ($VALUES)).clone();
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

		private static final FingerprintError $VALUES[];
		public static final FingerprintError NO_FINGERPRINT_ENROLLED;
		public static final FingerprintError NO_HARDWARE_DETECTED;
		public static final FingerprintError NO_LOCKSCREEN_ENABLED;
		public static final FingerprintError NO_SESSION;
		private final int errorCode;
		private final String errorMessage;

		static 
		{
			NO_HARDWARE_DETECTED = new FingerprintError("NO_HARDWARE_DETECTED", 0, 0x1d4e4, "No fingerprint authentication hardware detected");
		//    0    0:new             #2   <Class GigyaFingerprintManager$FingerprintError>
		//    1    3:dup             
		//    2    4:ldc1            #22  <String "NO_HARDWARE_DETECTED">
		//    3    6:iconst_0        
		//    4    7:ldc1            #23  <Int 0x1d4e4>
		//    5    9:ldc1            #25  <String "No fingerprint authentication hardware detected">
		//    6   11:invokespecial   #29  <Method void GigyaFingerprintManager$FingerprintError(String, int, int, String)>
		//    7   14:putstatic       #31  <Field GigyaFingerprintManager$FingerprintError NO_HARDWARE_DETECTED>
			NO_FINGERPRINT_ENROLLED = new FingerprintError("NO_FINGERPRINT_ENROLLED", 1, 0x1d4e5, "No fingerprint configured. Please register at least one fingerprint in your device's Settings");
		//    8   17:new             #2   <Class GigyaFingerprintManager$FingerprintError>
		//    9   20:dup             
		//   10   21:ldc1            #32  <String "NO_FINGERPRINT_ENROLLED">
		//   11   23:iconst_1        
		//   12   24:ldc1            #33  <Int 0x1d4e5>
		//   13   26:ldc1            #35  <String "No fingerprint configured. Please register at least one fingerprint in your device's Settings">
		//   14   28:invokespecial   #29  <Method void GigyaFingerprintManager$FingerprintError(String, int, int, String)>
		//   15   31:putstatic       #37  <Field GigyaFingerprintManager$FingerprintError NO_FINGERPRINT_ENROLLED>
			NO_LOCKSCREEN_ENABLED = new FingerprintError("NO_LOCKSCREEN_ENABLED", 2, 0x1d4e6, "Lockscreen security is not enabled. Please enable lockscreen security in your device's Settings");
		//   16   34:new             #2   <Class GigyaFingerprintManager$FingerprintError>
		//   17   37:dup             
		//   18   38:ldc1            #38  <String "NO_LOCKSCREEN_ENABLED">
		//   19   40:iconst_2        
		//   20   41:ldc1            #39  <Int 0x1d4e6>
		//   21   43:ldc1            #41  <String "Lockscreen security is not enabled. Please enable lockscreen security in your device's Settings">
		//   22   45:invokespecial   #29  <Method void GigyaFingerprintManager$FingerprintError(String, int, int, String)>
		//   23   48:putstatic       #43  <Field GigyaFingerprintManager$FingerprintError NO_LOCKSCREEN_ENABLED>
			NO_SESSION = new FingerprintError("NO_SESSION", 3, 0x1d4e7, "There is no active session");
		//   24   51:new             #2   <Class GigyaFingerprintManager$FingerprintError>
		//   25   54:dup             
		//   26   55:ldc1            #44  <String "NO_SESSION">
		//   27   57:iconst_3        
		//   28   58:ldc1            #45  <Int 0x1d4e7>
		//   29   60:ldc1            #47  <String "There is no active session">
		//   30   62:invokespecial   #29  <Method void GigyaFingerprintManager$FingerprintError(String, int, int, String)>
		//   31   65:putstatic       #49  <Field GigyaFingerprintManager$FingerprintError NO_SESSION>
			$VALUES = (new FingerprintError[] {
				NO_HARDWARE_DETECTED, NO_FINGERPRINT_ENROLLED, NO_LOCKSCREEN_ENABLED, NO_SESSION
			});
		//   32   68:iconst_4        
		//   33   69:anewarray       FingerprintError[]
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

		private FingerprintError(String s, int i, int j, String s1)
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

	public static final class OperationMode extends Enum
	{

		public static OperationMode valueOf(String s)
		{
			return (OperationMode)Enum.valueOf(com/gigya/socialize/android/managers/GigyaFingerprintManager$OperationMode, s);
		//    0    0:ldc1            #2   <Class GigyaFingerprintManager$OperationMode>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class GigyaFingerprintManager$OperationMode>
		//    4    9:areturn         
		}

		public static OperationMode[] values()
		{
			return (OperationMode[])((OperationMode []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field GigyaFingerprintManager$OperationMode[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.gigya.socialize.android.managers.GigyaFingerprintManager$OperationMode_3B_.clone()>
		//    2    6:checkcast       #38  <Class GigyaFingerprintManager$OperationMode[]>
		//    3    9:areturn         
		}

		private static final OperationMode $VALUES[];
		public static final OperationMode DECRYPT;
		public static final OperationMode ENCRYPT;

		static 
		{
			DECRYPT = new OperationMode("DECRYPT", 0);
		//    0    0:new             #2   <Class GigyaFingerprintManager$OperationMode>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "DECRYPT">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void GigyaFingerprintManager$OperationMode(String, int)>
		//    5   10:putstatic       #22  <Field GigyaFingerprintManager$OperationMode DECRYPT>
			ENCRYPT = new OperationMode("ENCRYPT", 1);
		//    6   13:new             #2   <Class GigyaFingerprintManager$OperationMode>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "ENCRYPT">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void GigyaFingerprintManager$OperationMode(String, int)>
		//   11   23:putstatic       #25  <Field GigyaFingerprintManager$OperationMode ENCRYPT>
			$VALUES = (new OperationMode[] {
				DECRYPT, ENCRYPT
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       OperationMode[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field GigyaFingerprintManager$OperationMode DECRYPT>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field GigyaFingerprintManager$OperationMode ENCRYPT>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field GigyaFingerprintManager$OperationMode[] $VALUES>
		//*  23   45:return          
		}

		private OperationMode(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public GigyaFingerprintManager(SessionManager sessionmanager, FingerprintManager fingerprintmanager)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		mSessionManager = sessionmanager;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field SessionManager mSessionManager>
		mFingerprintManager = fingerprintmanager;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #35  <Field FingerprintManager mFingerprintManager>
	//    8   14:return          
	}

	public static FingerprintManager getSystemFingerprintManager(Context context)
	{
		GigyaLog.i("GigyaFingerprintManager", "getSystemFingerprintManager");
	//    0    0:ldc1            #22  <String "GigyaFingerprintManager">
	//    1    2:ldc1            #43  <String "getSystemFingerprintManager">
	//    2    4:invokestatic    #49  <Method void GigyaLog.i(String, String)>
		if(android.os.Build.VERSION.SDK_INT < 23)
			break MISSING_BLOCK_LABEL_61;
	//    3    7:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//    4   10:bipush          23
	//    5   12:icmplt          61
		context = ((Context) ((FingerprintManager)context.getSystemService("fingerprint")));
	//    6   15:aload_0         
	//    7   16:ldc1            #57  <String "fingerprint">
	//    8   18:invokevirtual   #63  <Method Object Context.getSystemService(String)>
	//    9   21:checkcast       #65  <Class FingerprintManager>
	//   10   24:astore_0        
		return ((FingerprintManager) (context));
	//   11   25:aload_0         
	//   12   26:areturn         
		context;
	//   13   27:astore_0        
		StringBuilder stringbuilder = new StringBuilder();
	//   14   28:new             #67  <Class StringBuilder>
	//   15   31:dup             
	//   16   32:invokespecial   #68  <Method void StringBuilder()>
	//   17   35:astore_1        
		stringbuilder.append("Error: FingerprintManager is not supported ");
	//   18   36:aload_1         
	//   19   37:ldc1            #70  <String "Error: FingerprintManager is not supported ">
	//   20   39:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   21   42:pop             
		stringbuilder.append(android.os.Build.VERSION.SDK_INT);
	//   22   43:aload_1         
	//   23   44:getstatic       #55  <Field int android.os.Build$VERSION.SDK_INT>
	//   24   47:invokevirtual   #77  <Method StringBuilder StringBuilder.append(int)>
	//   25   50:pop             
		GigyaLog.e("GigyaFingerprintManager", stringbuilder.toString(), ((Throwable) (context)));
	//   26   51:ldc1            #22  <String "GigyaFingerprintManager">
	//   27   53:aload_1         
	//   28   54:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   29   57:aload_0         
	//   30   58:invokestatic    #85  <Method void GigyaLog.e(String, String, Throwable)>
		return null;
	//   31   61:aconst_null     
	//   32   62:areturn         
	}

	private boolean hasEnrolledFingerprints()
	{
		if(mFingerprintManager == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field FingerprintManager mFingerprintManager>
	//*   2    4:ifnonnull       9
		{
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5    9:new             #67  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #68  <Method void StringBuilder()>
	//    8   16:astore_1        
			stringbuilder.append("Enrolled? ");
	//    9   17:aload_1         
	//   10   18:ldc1            #92  <String "Enrolled? ">
	//   11   20:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
			stringbuilder.append(mFingerprintManager.hasEnrolledFingerprints());
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:getfield        #35  <Field FingerprintManager mFingerprintManager>
	//   16   29:invokevirtual   #94  <Method boolean FingerprintManager.hasEnrolledFingerprints()>
	//   17   32:invokevirtual   #97  <Method StringBuilder StringBuilder.append(boolean)>
	//   18   35:pop             
			GigyaLog.i("GigyaFingerprintManager", stringbuilder.toString());
	//   19   36:ldc1            #22  <String "GigyaFingerprintManager">
	//   20   38:aload_1         
	//   21   39:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   22   42:invokestatic    #49  <Method void GigyaLog.i(String, String)>
			return mFingerprintManager.hasEnrolledFingerprints();
	//   23   45:aload_0         
	//   24   46:getfield        #35  <Field FingerprintManager mFingerprintManager>
	//   25   49:invokevirtual   #94  <Method boolean FingerprintManager.hasEnrolledFingerprints()>
	//   26   52:ireturn         
		}
	}

	private boolean isFingerprintSupportedWithResponse(IFingerprintCallbacks ifingerprintcallbacks)
	{
		GigyaLog.i("GigyaFingerprintManager", "isFingerprintSupportedWithResponse");
	//    0    0:ldc1            #22  <String "GigyaFingerprintManager">
	//    1    2:ldc1            #101 <String "isFingerprintSupportedWithResponse">
	//    2    4:invokestatic    #49  <Method void GigyaLog.i(String, String)>
		FingerprintError fingerprinterror;
		if(!isHardwareDetected())
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #104 <Method boolean isHardwareDetected()>
	//*   5   11:ifne            28
			fingerprinterror = FingerprintError.NO_HARDWARE_DETECTED;
	//    6   14:getstatic       #108 <Field GigyaFingerprintManager$FingerprintError GigyaFingerprintManager$FingerprintError.NO_HARDWARE_DETECTED>
	//    7   17:astore_2        
		else
	//*   8   18:aload_1         
	//*   9   19:aload_2         
	//*  10   20:invokeinterface #114 <Method void IFingerprintCallbacks.onNotSupported(GigyaFingerprintManager$FingerprintError)>
	//*  11   25:goto            56
		if(!isLockScreenEnabled())
	//*  12   28:aload_0         
	//*  13   29:invokespecial   #117 <Method boolean isLockScreenEnabled()>
	//*  14   32:ifne            42
			fingerprinterror = FingerprintError.NO_LOCKSCREEN_ENABLED;
	//   15   35:getstatic       #120 <Field GigyaFingerprintManager$FingerprintError GigyaFingerprintManager$FingerprintError.NO_LOCKSCREEN_ENABLED>
	//   16   38:astore_2        
		else
	//*  17   39:goto            18
		if(!hasEnrolledFingerprints())
	//*  18   42:aload_0         
	//*  19   43:invokespecial   #121 <Method boolean hasEnrolledFingerprints()>
	//*  20   46:ifne            58
			fingerprinterror = FingerprintError.NO_FINGERPRINT_ENROLLED;
	//   21   49:getstatic       #124 <Field GigyaFingerprintManager$FingerprintError GigyaFingerprintManager$FingerprintError.NO_FINGERPRINT_ENROLLED>
	//   22   52:astore_2        
		else
	//*  23   53:goto            18
	//*  24   56:iconst_0        
	//*  25   57:ireturn         
			return true;
	//   26   58:iconst_1        
	//   27   59:ireturn         
		ifingerprintcallbacks.onNotSupported(fingerprinterror);
		return false;
	}

	private boolean isHardwareDetected()
	{
		if(mFingerprintManager == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field FingerprintManager mFingerprintManager>
	//*   2    4:ifnonnull       9
		{
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5    9:new             #67  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #68  <Method void StringBuilder()>
	//    8   16:astore_1        
			stringbuilder.append("Detected? ");
	//    9   17:aload_1         
	//   10   18:ldc1            #126 <String "Detected? ">
	//   11   20:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
			stringbuilder.append(mFingerprintManager.isHardwareDetected());
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:getfield        #35  <Field FingerprintManager mFingerprintManager>
	//   16   29:invokevirtual   #127 <Method boolean FingerprintManager.isHardwareDetected()>
	//   17   32:invokevirtual   #97  <Method StringBuilder StringBuilder.append(boolean)>
	//   18   35:pop             
			GigyaLog.i("GigyaFingerprintManager", stringbuilder.toString());
	//   19   36:ldc1            #22  <String "GigyaFingerprintManager">
	//   20   38:aload_1         
	//   21   39:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   22   42:invokestatic    #49  <Method void GigyaLog.i(String, String)>
			return mFingerprintManager.isHardwareDetected();
	//   23   45:aload_0         
	//   24   46:getfield        #35  <Field FingerprintManager mFingerprintManager>
	//   25   49:invokevirtual   #127 <Method boolean FingerprintManager.isHardwareDetected()>
	//   26   52:ireturn         
		}
	}

	private boolean isLockScreenEnabled()
	{
		KeyguardManager keyguardmanager = (KeyguardManager)GSAPI.getInstance().getContext().getSystemService("keyguard");
	//    0    0:invokestatic    #134 <Method GSAPI GSAPI.getInstance()>
	//    1    3:invokevirtual   #138 <Method Context GSAPI.getContext()>
	//    2    6:ldc1            #140 <String "keyguard">
	//    3    8:invokevirtual   #63  <Method Object Context.getSystemService(String)>
	//    4   11:checkcast       #142 <Class KeyguardManager>
	//    5   14:astore_1        
		if(keyguardmanager == null)
	//*   6   15:aload_1         
	//*   7   16:ifnonnull       21
		{
			return false;
	//    8   19:iconst_0        
	//    9   20:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   21:new             #67  <Class StringBuilder>
	//   11   24:dup             
	//   12   25:invokespecial   #68  <Method void StringBuilder()>
	//   13   28:astore_2        
			stringbuilder.append("Secured? ");
	//   14   29:aload_2         
	//   15   30:ldc1            #144 <String "Secured? ">
	//   16   32:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
			stringbuilder.append(keyguardmanager.isKeyguardSecure());
	//   18   36:aload_2         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #147 <Method boolean KeyguardManager.isKeyguardSecure()>
	//   21   41:invokevirtual   #97  <Method StringBuilder StringBuilder.append(boolean)>
	//   22   44:pop             
			GigyaLog.i("GigyaFingerprintManager", stringbuilder.toString());
	//   23   45:ldc1            #22  <String "GigyaFingerprintManager">
	//   24   47:aload_2         
	//   25   48:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   26   51:invokestatic    #49  <Method void GigyaLog.i(String, String)>
			return keyguardmanager.isKeyguardSecure();
	//   27   54:aload_1         
	//   28   55:invokevirtual   #147 <Method boolean KeyguardManager.isKeyguardSecure()>
	//   29   58:ireturn         
		}
	}

	private boolean isSupportedAndValid(IFingerprintCallbacks ifingerprintcallbacks)
	{
		GigyaLog.i("GigyaFingerprintManager", "isSupportedAndValid");
	//    0    0:ldc1            #22  <String "GigyaFingerprintManager">
	//    1    2:ldc1            #149 <String "isSupportedAndValid">
	//    2    4:invokestatic    #49  <Method void GigyaLog.i(String, String)>
		if(!isFingerprintSupportedWithResponse(ifingerprintcallbacks))
	//*   3    7:aload_0         
	//*   4    8:aload_1         
	//*   5    9:invokespecial   #151 <Method boolean isFingerprintSupportedWithResponse(IFingerprintCallbacks)>
	//*   6   12:ifne            24
		{
			GigyaLog.d("GigyaFingerprintManager", "isSupportedAndValid: fingerprint is supported");
	//    7   15:ldc1            #22  <String "GigyaFingerprintManager">
	//    8   17:ldc1            #153 <String "isSupportedAndValid: fingerprint is supported">
	//    9   19:invokestatic    #156 <Method void GigyaLog.d(String, String)>
			return false;
	//   10   22:iconst_0        
	//   11   23:ireturn         
		}
		if(!mSessionManager.isValidSession())
	//*  12   24:aload_0         
	//*  13   25:getfield        #33  <Field SessionManager mSessionManager>
	//*  14   28:invokevirtual   #161 <Method boolean SessionManager.isValidSession()>
	//*  15   31:ifne            52
		{
			GigyaLog.d("GigyaFingerprintManager", "isSupportedAndValid: session is invalid");
	//   16   34:ldc1            #22  <String "GigyaFingerprintManager">
	//   17   36:ldc1            #163 <String "isSupportedAndValid: session is invalid">
	//   18   38:invokestatic    #156 <Method void GigyaLog.d(String, String)>
			ifingerprintcallbacks.onNotSupported(FingerprintError.NO_SESSION);
	//   19   41:aload_1         
	//   20   42:getstatic       #166 <Field GigyaFingerprintManager$FingerprintError GigyaFingerprintManager$FingerprintError.NO_SESSION>
	//   21   45:invokeinterface #114 <Method void IFingerprintCallbacks.onNotSupported(GigyaFingerprintManager$FingerprintError)>
			return false;
	//   22   50:iconst_0        
	//   23   51:ireturn         
		} else
		{
			return true;
	//   24   52:iconst_1        
	//   25   53:ireturn         
		}
	}

	private IFingerprintOperation startFingerprintAuthentication(IFingerprintCallbacks ifingerprintcallbacks, OperationMode operationmode, FingerprintOperation.FingerprintCallback fingerprintcallback)
	{
		ifingerprintcallbacks = ((IFingerprintCallbacks) (new FingerprintOperation(mFingerprintManager, fingerprintcallback, operationmode, ifingerprintcallbacks)));
	//    0    0:new             #170 <Class FingerprintOperation>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field FingerprintManager mFingerprintManager>
	//    4    8:aload_3         
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokespecial   #173 <Method void FingerprintOperation(FingerprintManager, FingerprintOperation$FingerprintCallback, GigyaFingerprintManager$OperationMode, IFingerprintCallbacks)>
	//    8   14:astore_1        
		((FingerprintOperation) (ifingerprintcallbacks)).run();
	//    9   15:aload_1         
	//   10   16:invokevirtual   #176 <Method void FingerprintOperation.run()>
		return ((IFingerprintOperation) (ifingerprintcallbacks));
	//   11   19:aload_1         
	//   12   20:areturn         
	}

	public boolean isLocked()
	{
		GigyaLog.i("GigyaFingerprintManager", "isLocked");
	//    0    0:ldc1            #22  <String "GigyaFingerprintManager">
	//    1    2:ldc1            #178 <String "isLocked">
	//    2    4:invokestatic    #49  <Method void GigyaLog.i(String, String)>
		return !mSessionManager.isValidSession() && isOptIn();
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field SessionManager mSessionManager>
	//    5   11:invokevirtual   #161 <Method boolean SessionManager.isValidSession()>
	//    6   14:ifne            26
	//    7   17:aload_0         
	//    8   18:invokevirtual   #181 <Method boolean isOptIn()>
	//    9   21:ifeq            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public boolean isOptIn()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #67  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #68  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("isOptIn ");
	//    4    8:aload_1         
	//    5    9:ldc1            #183 <String "isOptIn ">
	//    6   11:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (mSessionManager.getSessionEncryption())));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #33  <Field SessionManager mSessionManager>
	//   11   20:invokevirtual   #187 <Method SessionManager$SessionEncryption SessionManager.getSessionEncryption()>
	//   12   23:invokevirtual   #190 <Method StringBuilder StringBuilder.append(Object)>
	//   13   26:pop             
		GigyaLog.i("GigyaFingerprintManager", stringbuilder.toString());
	//   14   27:ldc1            #22  <String "GigyaFingerprintManager">
	//   15   29:aload_1         
	//   16   30:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   17   33:invokestatic    #49  <Method void GigyaLog.i(String, String)>
		return mSessionManager.getSessionEncryption() == SessionManager.SessionEncryption.FINGERPRINT;
	//   18   36:aload_0         
	//   19   37:getfield        #33  <Field SessionManager mSessionManager>
	//   20   40:invokevirtual   #187 <Method SessionManager$SessionEncryption SessionManager.getSessionEncryption()>
	//   21   43:getstatic       #196 <Field SessionManager$SessionEncryption SessionManager$SessionEncryption.FINGERPRINT>
	//   22   46:if_acmpne       51
	//   23   49:iconst_1        
	//   24   50:ireturn         
	//   25   51:iconst_0        
	//   26   52:ireturn         
	}

	public boolean isSupported()
	{
		GigyaLog.i("GigyaFingerprintManager", "isSupported");
	//    0    0:ldc1            #22  <String "GigyaFingerprintManager">
	//    1    2:ldc1            #198 <String "isSupported">
	//    2    4:invokestatic    #49  <Method void GigyaLog.i(String, String)>
		return isHardwareDetected() && isLockScreenEnabled() && hasEnrolledFingerprints();
	//    3    7:aload_0         
	//    4    8:invokespecial   #104 <Method boolean isHardwareDetected()>
	//    5   11:ifeq            30
	//    6   14:aload_0         
	//    7   15:invokespecial   #117 <Method boolean isLockScreenEnabled()>
	//    8   18:ifeq            30
	//    9   21:aload_0         
	//   10   22:invokespecial   #121 <Method boolean hasEnrolledFingerprints()>
	//   11   25:ifeq            30
	//   12   28:iconst_1        
	//   13   29:ireturn         
	//   14   30:iconst_0        
	//   15   31:ireturn         
	}

	public void lock(IFingerprintCallbacks ifingerprintcallbacks)
	{
		GigyaLog.i("GigyaFingerprintManager", "lock");
	//    0    0:ldc1            #22  <String "GigyaFingerprintManager">
	//    1    2:ldc1            #201 <String "lock">
	//    2    4:invokestatic    #49  <Method void GigyaLog.i(String, String)>
		if(isSupportedAndValid(ifingerprintcallbacks))
	//*   3    7:aload_0         
	//*   4    8:aload_1         
	//*   5    9:invokespecial   #203 <Method boolean isSupportedAndValid(IFingerprintCallbacks)>
	//*   6   12:ifeq            59
		{
			GigyaLog.d("GigyaFingerprintManager", "optIn:supported and valid");
	//    7   15:ldc1            #22  <String "GigyaFingerprintManager">
	//    8   17:ldc1            #205 <String "optIn:supported and valid">
	//    9   19:invokestatic    #156 <Method void GigyaLog.d(String, String)>
			if(isOptIn())
	//*  10   22:aload_0         
	//*  11   23:invokevirtual   #181 <Method boolean isOptIn()>
	//*  12   26:ifeq            44
			{
				mSessionManager.clearSession(false);
	//   13   29:aload_0         
	//   14   30:getfield        #33  <Field SessionManager mSessionManager>
	//   15   33:iconst_0        
	//   16   34:invokevirtual   #209 <Method void SessionManager.clearSession(boolean)>
				ifingerprintcallbacks.onSuccess();
	//   17   37:aload_1         
	//   18   38:invokeinterface #212 <Method void IFingerprintCallbacks.onSuccess()>
				return;
	//   19   43:return          
			}
			ifingerprintcallbacks.onError(((Exception) (new GigyaException("User is not optIn"))));
	//   20   44:aload_1         
	//   21   45:new             #214 <Class GigyaException>
	//   22   48:dup             
	//   23   49:ldc1            #216 <String "User is not optIn">
	//   24   51:invokespecial   #219 <Method void GigyaException(String)>
	//   25   54:invokeinterface #223 <Method void IFingerprintCallbacks.onError(Exception)>
		}
	//   26   59:return          
	}

	public IFingerprintOperation optIn(final IFingerprintCallbacks response)
	{
		GigyaLog.i("GigyaFingerprintManager", "optIn");
	//    0    0:ldc1            #22  <String "GigyaFingerprintManager">
	//    1    2:ldc1            #226 <String "optIn">
	//    2    4:invokestatic    #49  <Method void GigyaLog.i(String, String)>
		if(isSupportedAndValid(response))
	//*   3    7:aload_0         
	//*   4    8:aload_1         
	//*   5    9:invokespecial   #203 <Method boolean isSupportedAndValid(IFingerprintCallbacks)>
	//*   6   12:ifeq            40
		{
			GigyaLog.d("GigyaFingerprintManager", "optIn:supported and valid");
	//    7   15:ldc1            #22  <String "GigyaFingerprintManager">
	//    8   17:ldc1            #205 <String "optIn:supported and valid">
	//    9   19:invokestatic    #156 <Method void GigyaLog.d(String, String)>
			return startFingerprintAuthentication(response, OperationMode.ENCRYPT, new FingerprintOperation.FingerprintCallback() {

				public void onError(Exception exception)
				{
					response.onError(exception);
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field IFingerprintCallbacks val$response>
				//    2    4:aload_1         
				//    3    5:invokeinterface #31  <Method void IFingerprintCallbacks.onError(Exception)>
				//    4   10:return          
				}

				public void onFingerprintSuccess(BaseKey basekey)
				{
					mSessionManager.fingerprintOptIn(basekey, ((ICallback) (response)));
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field GigyaFingerprintManager this$0>
				//    2    4:invokestatic    #37  <Method SessionManager GigyaFingerprintManager.access$000(GigyaFingerprintManager)>
				//    3    7:aload_1         
				//    4    8:aload_0         
				//    5    9:getfield        #21  <Field IFingerprintCallbacks val$response>
				//    6   12:invokevirtual   #43  <Method void SessionManager.fingerprintOptIn(BaseKey, ICallback)>
				//    7   15:return          
				}

				final GigyaFingerprintManager this$0;
				final IFingerprintCallbacks val$response;

			
			{
				this$0 = GigyaFingerprintManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field GigyaFingerprintManager this$0>
				response = ifingerprintcallbacks;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field IFingerprintCallbacks val$response>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:getstatic       #230 <Field GigyaFingerprintManager$OperationMode GigyaFingerprintManager$OperationMode.ENCRYPT>
	//   13   27:new             #6   <Class GigyaFingerprintManager$1>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokespecial   #233 <Method void GigyaFingerprintManager$1(GigyaFingerprintManager, IFingerprintCallbacks)>
	//   18   36:invokespecial   #235 <Method IFingerprintOperation startFingerprintAuthentication(IFingerprintCallbacks, GigyaFingerprintManager$OperationMode, FingerprintOperation$FingerprintCallback)>
	//   19   39:areturn         
		} else
		{
			return null;
	//   20   40:aconst_null     
	//   21   41:areturn         
		}
	}

	public IFingerprintOperation optOut(final IFingerprintCallbacks response)
	{
		GigyaLog.i("GigyaFingerprintManager", "optOut");
	//    0    0:ldc1            #22  <String "GigyaFingerprintManager">
	//    1    2:ldc1            #237 <String "optOut">
	//    2    4:invokestatic    #49  <Method void GigyaLog.i(String, String)>
		if(isSupportedAndValid(response))
	//*   3    7:aload_0         
	//*   4    8:aload_1         
	//*   5    9:invokespecial   #203 <Method boolean isSupportedAndValid(IFingerprintCallbacks)>
	//*   6   12:ifeq            62
		{
			GigyaLog.d("GigyaFingerprintManager", "optIn:supported and valid");
	//    7   15:ldc1            #22  <String "GigyaFingerprintManager">
	//    8   17:ldc1            #205 <String "optIn:supported and valid">
	//    9   19:invokestatic    #156 <Method void GigyaLog.d(String, String)>
			if(isOptIn())
	//*  10   22:aload_0         
	//*  11   23:invokevirtual   #181 <Method boolean isOptIn()>
	//*  12   26:ifeq            47
				return startFingerprintAuthentication(response, OperationMode.DECRYPT, new FingerprintOperation.FingerprintCallback() {

					public void onError(Exception exception)
					{
						response.onError(exception);
					//    0    0:aload_0         
					//    1    1:getfield        #23  <Field IFingerprintCallbacks val$response>
					//    2    4:aload_1         
					//    3    5:invokeinterface #33  <Method void IFingerprintCallbacks.onError(Exception)>
					//    4   10:return          
					}

					public void onFingerprintSuccess(BaseKey basekey)
					{
						mSessionManager.fingerprintOptOut(new ICallback() {

							public void onError(Exception exception)
							{
								StringBuilder stringbuilder = new StringBuilder();
							//    0    0:new             #26  <Class StringBuilder>
							//    1    3:dup             
							//    2    4:invokespecial   #27  <Method void StringBuilder()>
							//    3    7:astore_2        
								stringbuilder.append("optIn:onError: ");
							//    4    8:aload_2         
							//    5    9:ldc1            #29  <String "optIn:onError: ">
							//    6   11:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
							//    7   14:pop             
								stringbuilder.append(exception.getMessage());
							//    8   15:aload_2         
							//    9   16:aload_1         
							//   10   17:invokevirtual   #39  <Method String Exception.getMessage()>
							//   11   20:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
							//   12   23:pop             
								GigyaLog.e("GigyaFingerprintManager", stringbuilder.toString());
							//   13   24:ldc1            #41  <String "GigyaFingerprintManager">
							//   14   26:aload_2         
							//   15   27:invokevirtual   #44  <Method String StringBuilder.toString()>
							//   16   30:invokestatic    #50  <Method void GigyaLog.e(String, String)>
								response.onError(exception);
							//   17   33:aload_0         
							//   18   34:getfield        #18  <Field GigyaFingerprintManager$2 this$1>
							//   19   37:getfield        #54  <Field IFingerprintCallbacks GigyaFingerprintManager$2.val$response>
							//   20   40:aload_1         
							//   21   41:invokeinterface #58  <Method void IFingerprintCallbacks.onError(Exception)>
							//   22   46:return          
							}

							public volatile void onError(Throwable throwable)
							{
								onError((Exception)throwable);
							//    0    0:aload_0         
							//    1    1:aload_1         
							//    2    2:checkcast       #35  <Class Exception>
							//    3    5:invokevirtual   #60  <Method void onError(Exception)>
							//    4    8:return          
							}

							public void onSuccess()
							{
								GigyaLog.d("GigyaFingerprintManager", "optIn:onSuccess");
							//    0    0:ldc1            #41  <String "GigyaFingerprintManager">
							//    1    2:ldc1            #65  <String "optIn:onSuccess">
							//    2    4:invokestatic    #68  <Method void GigyaLog.d(String, String)>
								try
								{
									KeyStoreHelper.getInstance().deleteKey("fingerprint");
							//    3    7:invokestatic    #74  <Method KeyStoreHelper KeyStoreHelper.getInstance()>
							//    4   10:ldc1            #76  <String "fingerprint">
							//    5   12:invokevirtual   #80  <Method void KeyStoreHelper.deleteKey(String)>
									response.onSuccess();
							//    6   15:aload_0         
							//    7   16:getfield        #18  <Field GigyaFingerprintManager$2 this$1>
							//    8   19:getfield        #54  <Field IFingerprintCallbacks GigyaFingerprintManager$2.val$response>
							//    9   22:invokeinterface #82  <Method void IFingerprintCallbacks.onSuccess()>
									return;
							//   10   27:return          
								}
								catch(com.gigya.socialize.android.keyStore.KeyStoreHelper.KeyStoreHelperException keystorehelperexception)
							//*  11   28:astore_1        
								{
									GigyaLog.e("GigyaFingerprintManager", "Error: delete key operation was failed", ((Throwable) (keystorehelperexception)));
							//   12   29:ldc1            #41  <String "GigyaFingerprintManager">
							//   13   31:ldc1            #84  <String "Error: delete key operation was failed">
							//   14   33:aload_1         
							//   15   34:invokestatic    #87  <Method void GigyaLog.e(String, String, Throwable)>
									response.onError(((Exception) (new GigyaException("Error: delete key operation was failed", ((Throwable) (keystorehelperexception))))));
							//   16   37:aload_0         
							//   17   38:getfield        #18  <Field GigyaFingerprintManager$2 this$1>
							//   18   41:getfield        #54  <Field IFingerprintCallbacks GigyaFingerprintManager$2.val$response>
							//   19   44:new             #89  <Class GigyaException>
							//   20   47:dup             
							//   21   48:ldc1            #84  <String "Error: delete key operation was failed">
							//   22   50:aload_1         
							//   23   51:invokespecial   #92  <Method void GigyaException(String, Throwable)>
							//   24   54:invokeinterface #58  <Method void IFingerprintCallbacks.onError(Exception)>
									return;
							//   25   59:return          
								}
							}

							final _cls2 this$1;

			
			{
				this$1 = _cls2.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field GigyaFingerprintManager$2 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
						}
);
					//    0    0:aload_0         
					//    1    1:getfield        #21  <Field GigyaFingerprintManager this$0>
					//    2    4:invokestatic    #39  <Method SessionManager GigyaFingerprintManager.access$000(GigyaFingerprintManager)>
					//    3    7:new             #13  <Class GigyaFingerprintManager$2$1>
					//    4   10:dup             
					//    5   11:aload_0         
					//    6   12:invokespecial   #42  <Method void GigyaFingerprintManager$2$1(GigyaFingerprintManager$2)>
					//    7   15:invokevirtual   #48  <Method void SessionManager.fingerprintOptOut(ICallback)>
					//    8   18:return          
					}

					final GigyaFingerprintManager this$0;
					final IFingerprintCallbacks val$response;

			
			{
				this$0 = GigyaFingerprintManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field GigyaFingerprintManager this$0>
				response = ifingerprintcallbacks;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field IFingerprintCallbacks val$response>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
				}
);
	//   13   29:aload_0         
	//   14   30:aload_1         
	//   15   31:getstatic       #240 <Field GigyaFingerprintManager$OperationMode GigyaFingerprintManager$OperationMode.DECRYPT>
	//   16   34:new             #8   <Class GigyaFingerprintManager$2>
	//   17   37:dup             
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:invokespecial   #241 <Method void GigyaFingerprintManager$2(GigyaFingerprintManager, IFingerprintCallbacks)>
	//   21   43:invokespecial   #235 <Method IFingerprintOperation startFingerprintAuthentication(IFingerprintCallbacks, GigyaFingerprintManager$OperationMode, FingerprintOperation$FingerprintCallback)>
	//   22   46:areturn         
			response.onError(((Exception) (new GigyaException("Error: User is not optIn"))));
	//   23   47:aload_1         
	//   24   48:new             #214 <Class GigyaException>
	//   25   51:dup             
	//   26   52:ldc1            #243 <String "Error: User is not optIn">
	//   27   54:invokespecial   #219 <Method void GigyaException(String)>
	//   28   57:invokeinterface #223 <Method void IFingerprintCallbacks.onError(Exception)>
		}
		return null;
	//   29   62:aconst_null     
	//   30   63:areturn         
	}

	public IFingerprintOperation unlock(final IFingerprintCallbacks response)
	{
		GigyaLog.i("GigyaFingerprintManager", "unlock");
	//    0    0:ldc1            #22  <String "GigyaFingerprintManager">
	//    1    2:ldc1            #245 <String "unlock">
	//    2    4:invokestatic    #49  <Method void GigyaLog.i(String, String)>
		if(isFingerprintSupportedWithResponse(response))
	//*   3    7:aload_0         
	//*   4    8:aload_1         
	//*   5    9:invokespecial   #151 <Method boolean isFingerprintSupportedWithResponse(IFingerprintCallbacks)>
	//*   6   12:ifeq            65
		{
			GigyaLog.d("GigyaFingerprintManager", "unlock: fingerprint is supported");
	//    7   15:ldc1            #22  <String "GigyaFingerprintManager">
	//    8   17:ldc1            #247 <String "unlock: fingerprint is supported">
	//    9   19:invokestatic    #156 <Method void GigyaLog.d(String, String)>
			if(!isOptIn())
	//*  10   22:aload_0         
	//*  11   23:invokevirtual   #181 <Method boolean isOptIn()>
	//*  12   26:ifne            47
				response.onError(((Exception) (new GigyaException("User is not optIn"))));
	//   13   29:aload_1         
	//   14   30:new             #214 <Class GigyaException>
	//   15   33:dup             
	//   16   34:ldc1            #216 <String "User is not optIn">
	//   17   36:invokespecial   #219 <Method void GigyaException(String)>
	//   18   39:invokeinterface #223 <Method void IFingerprintCallbacks.onError(Exception)>
			else
	//*  19   44:goto            65
				return startFingerprintAuthentication(response, OperationMode.DECRYPT, new FingerprintOperation.FingerprintCallback() {

					public void onError(Exception exception)
					{
						response.onError(exception);
					//    0    0:aload_0         
					//    1    1:getfield        #21  <Field IFingerprintCallbacks val$response>
					//    2    4:aload_1         
					//    3    5:invokeinterface #31  <Method void IFingerprintCallbacks.onError(Exception)>
					//    4   10:return          
					}

					public void onFingerprintSuccess(BaseKey basekey)
					{
						mSessionManager.loadFingerprintSession(basekey, ((ICallback) (response)));
					//    0    0:aload_0         
					//    1    1:getfield        #19  <Field GigyaFingerprintManager this$0>
					//    2    4:invokestatic    #37  <Method SessionManager GigyaFingerprintManager.access$000(GigyaFingerprintManager)>
					//    3    7:aload_1         
					//    4    8:aload_0         
					//    5    9:getfield        #21  <Field IFingerprintCallbacks val$response>
					//    6   12:invokevirtual   #43  <Method void SessionManager.loadFingerprintSession(BaseKey, ICallback)>
					//    7   15:return          
					}

					final GigyaFingerprintManager this$0;
					final IFingerprintCallbacks val$response;

			
			{
				this$0 = GigyaFingerprintManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field GigyaFingerprintManager this$0>
				response = ifingerprintcallbacks;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field IFingerprintCallbacks val$response>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
				}
);
	//   20   47:aload_0         
	//   21   48:aload_1         
	//   22   49:getstatic       #240 <Field GigyaFingerprintManager$OperationMode GigyaFingerprintManager$OperationMode.DECRYPT>
	//   23   52:new             #12  <Class GigyaFingerprintManager$3>
	//   24   55:dup             
	//   25   56:aload_0         
	//   26   57:aload_1         
	//   27   58:invokespecial   #248 <Method void GigyaFingerprintManager$3(GigyaFingerprintManager, IFingerprintCallbacks)>
	//   28   61:invokespecial   #235 <Method IFingerprintOperation startFingerprintAuthentication(IFingerprintCallbacks, GigyaFingerprintManager$OperationMode, FingerprintOperation$FingerprintCallback)>
	//   29   64:areturn         
		}
		return null;
	//   30   65:aconst_null     
	//   31   66:areturn         
	}

	private static final String TAG = "GigyaFingerprintManager";
	private FingerprintManager mFingerprintManager;
	private SessionManager mSessionManager;


/*
	static SessionManager access$000(GigyaFingerprintManager gigyafingerprintmanager)
	{
		return gigyafingerprintmanager.mSessionManager;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field SessionManager mSessionManager>
	//    2    4:areturn         
	}

*/
}
