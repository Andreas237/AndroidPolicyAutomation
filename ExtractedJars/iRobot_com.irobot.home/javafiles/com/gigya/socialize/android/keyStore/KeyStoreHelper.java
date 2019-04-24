// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.keyStore;

import com.gigya.socialize.android.GigyaException;
import com.gigya.socialize.android.log.GigyaLog;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Enumeration;
import javax.crypto.SecretKey;

// Referenced classes of package com.gigya.socialize.android.keyStore:
//			BaseKey, KeyFactory

public class KeyStoreHelper
{
	public class KeyStoreHelperException extends GigyaException
	{

		final KeyStoreHelper this$0;

		public KeyStoreHelperException(String s, Throwable throwable)
		{
			this$0 = KeyStoreHelper.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field KeyStoreHelper this$0>
			super(s, throwable);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:aload_3         
		//    6    8:invokespecial   #16  <Method void GigyaException(String, Throwable)>
		//    7   11:return          
		}
	}


	private KeyStoreHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		try
		{
			GigyaLog.i("KeyStoreHelper", "KeyStoreHelper Constructor");
	//    2    4:ldc1            #17  <String "KeyStoreHelper">
	//    3    6:ldc1            #31  <String "KeyStoreHelper Constructor">
	//    4    8:invokestatic    #37  <Method void GigyaLog.i(String, String)>
			initKeyStore();
	//    5   11:aload_0         
	//    6   12:invokespecial   #40  <Method void initKeyStore()>
			return;
	//    7   15:return          
		}
		catch(Object obj)
	//*   8   16:astore_1        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    9   17:new             #42  <Class StringBuilder>
	//   10   20:dup             
	//   11   21:invokespecial   #43  <Method void StringBuilder()>
	//   12   24:astore_2        
			stringbuilder.append("Error: ");
	//   13   25:aload_2         
	//   14   26:ldc1            #45  <String "Error: ">
	//   15   28:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
			stringbuilder.append(((Exception) (obj)).getMessage());
	//   17   32:aload_2         
	//   18   33:aload_1         
	//   19   34:invokevirtual   #55  <Method String Exception.getMessage()>
	//   20   37:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
			GigyaLog.e("KeyStoreHelper", stringbuilder.toString());
	//   22   41:ldc1            #17  <String "KeyStoreHelper">
	//   23   43:aload_2         
	//   24   44:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   25   47:invokestatic    #61  <Method void GigyaLog.e(String, String)>
			throw new KeyStoreHelperException("Error: failed to get an instance of KeyStore", ((Throwable) (obj)));
	//   26   50:new             #6   <Class KeyStoreHelper$KeyStoreHelperException>
	//   27   53:dup             
	//   28   54:aload_0         
	//   29   55:ldc1            #63  <String "Error: failed to get an instance of KeyStore">
	//   30   57:aload_1         
	//   31   58:invokespecial   #66  <Method void KeyStoreHelper$KeyStoreHelperException(KeyStoreHelper, String, Throwable)>
	//   32   61:athrow          
		}
	}

	private SecretKey findOrCreateKey(String s, BaseKey basekey)
	{
		try
		{
			if(isKeyExists(s))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #76  <Method boolean isKeyExists(String)>
	//*   3    5:ifeq            14
				return getKey(s);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #80  <Method SecretKey getKey(String)>
	//    7   13:areturn         
			s = ((String) (basekey.generateKey()));
	//    8   14:aload_2         
	//    9   15:invokevirtual   #86  <Method SecretKey BaseKey.generateKey()>
	//   10   18:astore_1        
		}
	//*  11   19:aload_1         
	//*  12   20:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  13   21:astore_1        
		{
			basekey = ((BaseKey) (new StringBuilder()));
	//   14   22:new             #42  <Class StringBuilder>
	//   15   25:dup             
	//   16   26:invokespecial   #43  <Method void StringBuilder()>
	//   17   29:astore_2        
			((StringBuilder) (basekey)).append("Error: ");
	//   18   30:aload_2         
	//   19   31:ldc1            #45  <String "Error: ">
	//   20   33:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   21   36:pop             
			((StringBuilder) (basekey)).append(((GeneralSecurityException) (s)).getMessage());
	//   22   37:aload_2         
	//   23   38:aload_1         
	//   24   39:invokevirtual   #87  <Method String GeneralSecurityException.getMessage()>
	//   25   42:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   26   45:pop             
			GigyaLog.e("KeyStoreHelper", ((StringBuilder) (basekey)).toString());
	//   27   46:ldc1            #17  <String "KeyStoreHelper">
	//   28   48:aload_2         
	//   29   49:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   30   52:invokestatic    #61  <Method void GigyaLog.e(String, String)>
			throw new KeyStoreHelperException("Error: creating Symmetric failed", ((Throwable) (s)));
	//   31   55:new             #6   <Class KeyStoreHelper$KeyStoreHelperException>
	//   32   58:dup             
	//   33   59:aload_0         
	//   34   60:ldc1            #89  <String "Error: creating Symmetric failed">
	//   35   62:aload_1         
	//   36   63:invokespecial   #66  <Method void KeyStoreHelper$KeyStoreHelperException(KeyStoreHelper, String, Throwable)>
	//   37   66:athrow          
		}
		return ((SecretKey) (s));
	}

	public static KeyStoreHelper getInstance()
	{
		if(mInstance != null)
			break MISSING_BLOCK_LABEL_37;
	//    0    0:getstatic       #94  <Field KeyStoreHelper mInstance>
	//    1    3:ifnonnull       37
		com/gigya/socialize/android/keyStore/KeyStoreHelper;
	//    2    6:ldc1            #2   <Class KeyStoreHelper>
		JVM INSTR monitorenter ;
	//    3    8:monitorenter    
		if(mInstance == null)
	//*   4    9:getstatic       #94  <Field KeyStoreHelper mInstance>
	//*   5   12:ifnonnull       25
			mInstance = new KeyStoreHelper();
	//    6   15:new             #2   <Class KeyStoreHelper>
	//    7   18:dup             
	//    8   19:invokespecial   #95  <Method void KeyStoreHelper()>
	//    9   22:putstatic       #94  <Field KeyStoreHelper mInstance>
		com/gigya/socialize/android/keyStore/KeyStoreHelper;
	//   10   25:ldc1            #2   <Class KeyStoreHelper>
		JVM INSTR monitorexit ;
	//   11   27:monitorexit     
		break MISSING_BLOCK_LABEL_37;
	//   12   28:goto            37
		Exception exception;
		exception;
	//   13   31:astore_0        
		com/gigya/socialize/android/keyStore/KeyStoreHelper;
	//   14   32:ldc1            #2   <Class KeyStoreHelper>
		JVM INSTR monitorexit ;
	//   15   34:monitorexit     
		throw exception;
	//   16   35:aload_0         
	//   17   36:athrow          
		return mInstance;
	//   18   37:getstatic       #94  <Field KeyStoreHelper mInstance>
	//   19   40:areturn         
	}

	private SecretKey getKey(String s)
	{
		return (SecretKey)mKeyStore.getKey(s, ((char []) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field KeyStore mKeyStore>
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #102 <Method java.security.Key KeyStore.getKey(String, char[])>
	//    5    9:checkcast       #104 <Class SecretKey>
	//    6   12:areturn         
	}

	private void initKeyStore()
	{
		mKeyStore = KeyStore.getInstance("AndroidKeyStore");
	//    0    0:aload_0         
	//    1    1:ldc1            #11  <String "AndroidKeyStore">
	//    2    3:invokestatic    #107 <Method KeyStore KeyStore.getInstance(String)>
	//    3    6:putfield        #97  <Field KeyStore mKeyStore>
		mKeyStore.load(((java.security.KeyStore.LoadStoreParameter) (null)));
	//    4    9:aload_0         
	//    5   10:getfield        #97  <Field KeyStore mKeyStore>
	//    6   13:aconst_null     
	//    7   14:invokevirtual   #111 <Method void KeyStore.load(java.security.KeyStore$LoadStoreParameter)>
	//    8   17:return          
	}

	private boolean isKeyExists(String s)
	{
		for(Enumeration enumeration = mKeyStore.aliases(); enumeration.hasMoreElements();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field KeyStore mKeyStore>
	//*   2    4:invokevirtual   #115 <Method Enumeration KeyStore.aliases()>
	//*   3    7:astore_2        
	//*   4    8:aload_2         
	//*   5    9:invokeinterface #121 <Method boolean Enumeration.hasMoreElements()>
	//*   6   14:ifeq            32
			if(s.equals(enumeration.nextElement()))
	//*   7   17:aload_1         
	//*   8   18:aload_2         
	//*   9   19:invokeinterface #125 <Method Object Enumeration.nextElement()>
	//*  10   24:invokevirtual   #131 <Method boolean String.equals(Object)>
	//*  11   27:ifeq            8
				return true;
	//   12   30:iconst_1        
	//   13   31:ireturn         

		return false;
	//   14   32:iconst_0        
	//   15   33:ireturn         
	}

	public BaseKey createKey(String s)
	{
		BaseKey basekey = KeyFactory.createKey(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #137 <Method BaseKey KeyFactory.createKey(String)>
	//    2    4:astore_2        
		basekey.setSecretKey(findOrCreateKey(s, basekey));
	//    3    5:aload_2         
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:invokespecial   #139 <Method SecretKey findOrCreateKey(String, BaseKey)>
	//    8   12:invokevirtual   #143 <Method void BaseKey.setSecretKey(SecretKey)>
		return basekey;
	//    9   15:aload_2         
	//   10   16:areturn         
	}

	public void deleteKey(String s)
	{
		StringBuilder stringbuilder1;
		try
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #42  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void StringBuilder()>
	//    3    7:astore_2        
			stringbuilder.append("deleteKey ");
	//    4    8:aload_2         
	//    5    9:ldc1            #147 <String "deleteKey ">
	//    6   11:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
			stringbuilder.append(s);
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
			GigyaLog.d("KeyStoreHelper", stringbuilder.toString());
	//   12   21:ldc1            #17  <String "KeyStoreHelper">
	//   13   23:aload_2         
	//   14   24:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   15   27:invokestatic    #150 <Method void GigyaLog.d(String, String)>
			mKeyStore.deleteEntry(s);
	//   16   30:aload_0         
	//   17   31:getfield        #97  <Field KeyStore mKeyStore>
	//   18   34:aload_1         
	//   19   35:invokevirtual   #153 <Method void KeyStore.deleteEntry(String)>
			return;
	//   20   38:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  21   39:astore_1        
		{
			stringbuilder1 = new StringBuilder();
	//   22   40:new             #42  <Class StringBuilder>
	//   23   43:dup             
	//   24   44:invokespecial   #43  <Method void StringBuilder()>
	//   25   47:astore_2        
		}
		stringbuilder1.append("Error: ");
	//   26   48:aload_2         
	//   27   49:ldc1            #45  <String "Error: ">
	//   28   51:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   29   54:pop             
		stringbuilder1.append(((GeneralSecurityException) (s)).getMessage());
	//   30   55:aload_2         
	//   31   56:aload_1         
	//   32   57:invokevirtual   #87  <Method String GeneralSecurityException.getMessage()>
	//   33   60:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   34   63:pop             
		GigyaLog.e("KeyStoreHelper", stringbuilder1.toString());
	//   35   64:ldc1            #17  <String "KeyStoreHelper">
	//   36   66:aload_2         
	//   37   67:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   38   70:invokestatic    #61  <Method void GigyaLog.e(String, String)>
		throw new KeyStoreHelperException("Error: delete key operation was failed", ((Throwable) (s)));
	//   39   73:new             #6   <Class KeyStoreHelper$KeyStoreHelperException>
	//   40   76:dup             
	//   41   77:aload_0         
	//   42   78:ldc1            #155 <String "Error: delete key operation was failed">
	//   43   80:aload_1         
	//   44   81:invokespecial   #66  <Method void KeyStoreHelper$KeyStoreHelperException(KeyStoreHelper, String, Throwable)>
	//   45   84:athrow          
	}

	private static final String ANDROID_KEY_STORE = "AndroidKeyStore";
	private static final String KEY_IV = "IV";
	private static final String TAG = "KeyStoreHelper";
	private static volatile KeyStoreHelper mInstance;
	private KeyStore mKeyStore;
}
