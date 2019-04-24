// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.gigya.socialize.android.log.GigyaLog;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.gigya.socialize.android.utils:
//			SessionEncryption, Utils

public class SessionEncryptionImpl extends SessionEncryption
{

	public SessionEncryptionImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void SessionEncryption()>
	//    2    4:return          
	}

	public SecretKey init(Context context, SharedPreferences sharedpreferences)
	{
		GigyaLog.i("SessionEncryptionImpl", "Generate secret key");
	//    0    0:ldc1            #8   <String "SessionEncryptionImpl">
	//    1    2:ldc1            #22  <String "Generate secret key">
	//    2    4:invokestatic    #28  <Method void GigyaLog.i(String, String)>
		try
		{
			if(sharedpreferences.getString("GS_PREFA", ((String) (null))) != null)
	//*   3    7:aload_2         
	//*   4    8:ldc1            #30  <String "GS_PREFA">
	//*   5   10:aconst_null     
	//*   6   11:invokeinterface #36  <Method String SharedPreferences.getString(String, String)>
	//*   7   16:ifnull          25
				return loadSecret(sharedpreferences);
	//    8   19:aload_0         
	//    9   20:aload_2         
	//   10   21:invokevirtual   #40  <Method SecretKey loadSecret(SharedPreferences)>
	//   11   24:areturn         
			context = ((Context) (KeyGenerator.getInstance("AES")));
	//   12   25:ldc1            #42  <String "AES">
	//   13   27:invokestatic    #48  <Method KeyGenerator KeyGenerator.getInstance(String)>
	//   14   30:astore_1        
			((KeyGenerator) (context)).init(128);
	//   15   31:aload_1         
	//   16   32:sipush          128
	//   17   35:invokevirtual   #51  <Method void KeyGenerator.init(int)>
			context = ((Context) (((KeyGenerator) (context)).generateKey()));
	//   18   38:aload_1         
	//   19   39:invokevirtual   #55  <Method SecretKey KeyGenerator.generateKey()>
	//   20   42:astore_1        
			String s = Utils.bytesToString(((SecretKey) (context)).getEncoded());
	//   21   43:aload_1         
	//   22   44:invokeinterface #61  <Method byte[] SecretKey.getEncoded()>
	//   23   49:invokestatic    #67  <Method String Utils.bytesToString(byte[])>
	//   24   52:astore_3        
			sharedpreferences = ((SharedPreferences) (sharedpreferences.edit()));
	//   25   53:aload_2         
	//   26   54:invokeinterface #71  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   27   59:astore_2        
			((android.content.SharedPreferences.Editor) (sharedpreferences)).putString("GS_PREFA", s);
	//   28   60:aload_2         
	//   29   61:ldc1            #30  <String "GS_PREFA">
	//   30   63:aload_3         
	//   31   64:invokeinterface #77  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   32   69:pop             
			((android.content.SharedPreferences.Editor) (sharedpreferences)).commit();
	//   33   70:aload_2         
	//   34   71:invokeinterface #81  <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   35   76:pop             
		}
	//*  36   77:aload_1         
	//*  37   78:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  38   79:astore_1        
		{
			((Exception) (context)).printStackTrace();
	//   39   80:aload_1         
	//   40   81:invokevirtual   #84  <Method void Exception.printStackTrace()>
			throw new SessionEncryption.SessionEncryptionException("Session encryption exception | exception while generating secret key", ((Exception) (context)).getCause());
	//   41   84:new             #86  <Class SessionEncryption$SessionEncryptionException>
	//   42   87:dup             
	//   43   88:ldc1            #88  <String "Session encryption exception | exception while generating secret key">
	//   44   90:aload_1         
	//   45   91:invokevirtual   #92  <Method Throwable Exception.getCause()>
	//   46   94:invokespecial   #95  <Method void SessionEncryption$SessionEncryptionException(String, Throwable)>
	//   47   97:athrow          
		}
		return ((SecretKey) (context));
	}

	public SecretKey loadSecret(SharedPreferences sharedpreferences)
	{
		try
		{
			sharedpreferences = ((SharedPreferences) (sharedpreferences.getString("GS_PREFA", ((String) (null)))));
	//    0    0:aload_1         
	//    1    1:ldc1            #30  <String "GS_PREFA">
	//    2    3:aconst_null     
	//    3    4:invokeinterface #36  <Method String SharedPreferences.getString(String, String)>
	//    4    9:astore_1        
		}
	//*   5   10:aload_1         
	//*   6   11:ifnonnull       16
	//*   7   14:aconst_null     
	//*   8   15:areturn         
	//*   9   16:aload_1         
	//*  10   17:invokestatic    #100 <Method byte[] Utils.stringToBytes(String)>
	//*  11   20:astore_1        
	//*  12   21:new             #102 <Class SecretKeySpec>
	//*  13   24:dup             
	//*  14   25:aload_1         
	//*  15   26:iconst_0        
	//*  16   27:aload_1         
	//*  17   28:arraylength     
	//*  18   29:ldc1            #42  <String "AES">
	//*  19   31:invokespecial   #105 <Method void SecretKeySpec(byte[], int, int, String)>
	//*  20   34:astore_1        
	//*  21   35:aload_1         
	//*  22   36:areturn         
		// Misplaced declaration of an exception variable
		catch(SharedPreferences sharedpreferences)
	//*  23   37:astore_1        
		{
			((Exception) (sharedpreferences)).printStackTrace();
	//   24   38:aload_1         
	//   25   39:invokevirtual   #84  <Method void Exception.printStackTrace()>
			throw new SessionEncryption.SessionEncryptionException("Session encryption exception | exception while loading secret key", ((Exception) (sharedpreferences)).getCause());
	//   26   42:new             #86  <Class SessionEncryption$SessionEncryptionException>
	//   27   45:dup             
	//   28   46:ldc1            #107 <String "Session encryption exception | exception while loading secret key">
	//   29   48:aload_1         
	//   30   49:invokevirtual   #92  <Method Throwable Exception.getCause()>
	//   31   52:invokespecial   #95  <Method void SessionEncryption$SessionEncryptionException(String, Throwable)>
	//   32   55:athrow          
		}
		if(sharedpreferences == null)
			return null;
		sharedpreferences = ((SharedPreferences) (Utils.stringToBytes(((String) (sharedpreferences)))));
		sharedpreferences = ((SharedPreferences) (new SecretKeySpec(((byte []) (sharedpreferences)), 0, sharedpreferences.length, "AES")));
		return ((SecretKey) (sharedpreferences));
	}

	private static final String TAG = "SessionEncryptionImpl";
}
