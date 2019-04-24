// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import android.text.TextUtils;
import android.util.Log;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

// Referenced classes of package android.support.v7:
//			bx, bw

public class cd
{

	public static PublicKey a(String s)
	{
		try
		{
			s = ((String) (bw.a(s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #17  <Method byte[] bw.a(String)>
	//    2    4:astore_0        
			s = ((String) (KeyFactory.getInstance("RSA").generatePublic(((java.security.spec.KeySpec) (new X509EncodedKeySpec(((byte []) (s))))))));
	//    3    5:ldc1            #19  <String "RSA">
	//    4    7:invokestatic    #25  <Method KeyFactory KeyFactory.getInstance(String)>
	//    5   10:new             #27  <Class X509EncodedKeySpec>
	//    6   13:dup             
	//    7   14:aload_0         
	//    8   15:invokespecial   #31  <Method void X509EncodedKeySpec(byte[])>
	//    9   18:invokevirtual   #35  <Method PublicKey KeyFactory.generatePublic(java.security.spec.KeySpec)>
	//   10   21:astore_0        
		}
	//*  11   22:aload_0         
	//*  12   23:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  13   24:astore_0        
		{
			throw new RuntimeException(((Throwable) (s)));
	//   14   25:new             #37  <Class RuntimeException>
	//   15   28:dup             
	//   16   29:aload_0         
	//   17   30:invokespecial   #40  <Method void RuntimeException(Throwable)>
	//   18   33:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  19   34:astore_0        
		{
			Log.e("IABUtil/Security", "Invalid key specification.");
	//   20   35:ldc1            #42  <String "IABUtil/Security">
	//   21   37:ldc1            #44  <String "Invalid key specification.">
	//   22   39:invokestatic    #50  <Method int Log.e(String, String)>
	//   23   42:pop             
			throw new IllegalArgumentException(((Throwable) (s)));
	//   24   43:new             #52  <Class IllegalArgumentException>
	//   25   46:dup             
	//   26   47:aload_0         
	//   27   48:invokespecial   #53  <Method void IllegalArgumentException(Throwable)>
	//   28   51:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  29   52:astore_0        
		{
			Log.e("IABUtil/Security", "Base64 decoding failed.");
	//   30   53:ldc1            #42  <String "IABUtil/Security">
	//   31   55:ldc1            #55  <String "Base64 decoding failed.">
	//   32   57:invokestatic    #50  <Method int Log.e(String, String)>
	//   33   60:pop             
			throw new IllegalArgumentException(((Throwable) (s)));
	//   34   61:new             #52  <Class IllegalArgumentException>
	//   35   64:dup             
	//   36   65:aload_0         
	//   37   66:invokespecial   #53  <Method void IllegalArgumentException(Throwable)>
	//   38   69:athrow          
		}
		return ((PublicKey) (s));
	}

	public static boolean a(String s, String s1, String s2)
	{
		if(TextUtils.isEmpty(((CharSequence) (s1))) || TextUtils.isEmpty(((CharSequence) (s))) || TextUtils.isEmpty(((CharSequence) (s2))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #63  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            21
	//*   3    7:aload_0         
	//*   4    8:invokestatic    #63  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5   11:ifne            21
	//*   6   14:aload_2         
	//*   7   15:invokestatic    #63  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   8   18:ifeq            31
		{
			Log.e("IABUtil/Security", "Purchase verification failed: missing data.");
	//    9   21:ldc1            #42  <String "IABUtil/Security">
	//   10   23:ldc1            #65  <String "Purchase verification failed: missing data.">
	//   11   25:invokestatic    #50  <Method int Log.e(String, String)>
	//   12   28:pop             
			return false;
	//   13   29:iconst_0        
	//   14   30:ireturn         
		} else
		{
			return a(a(s), s1, s2);
	//   15   31:aload_0         
	//   16   32:invokestatic    #67  <Method PublicKey a(String)>
	//   17   35:aload_1         
	//   18   36:aload_2         
	//   19   37:invokestatic    #70  <Method boolean a(PublicKey, String, String)>
	//   20   40:ireturn         
		}
	}

	public static boolean a(PublicKey publickey, String s, String s1)
	{
label0:
		{
			try
			{
				Signature signature = Signature.getInstance("SHA1withRSA");
	//    0    0:ldc1            #76  <String "SHA1withRSA">
	//    1    2:invokestatic    #81  <Method Signature Signature.getInstance(String)>
	//    2    5:astore_3        
				signature.initVerify(publickey);
	//    3    6:aload_3         
	//    4    7:aload_0         
	//    5    8:invokevirtual   #85  <Method void Signature.initVerify(PublicKey)>
				signature.update(s.getBytes());
	//    6   11:aload_3         
	//    7   12:aload_1         
	//    8   13:invokevirtual   #91  <Method byte[] String.getBytes()>
	//    9   16:invokevirtual   #94  <Method void Signature.update(byte[])>
				if(signature.verify(bw.a(s1)))
					break label0;
	//   10   19:aload_3         
	//   11   20:aload_2         
	//   12   21:invokestatic    #17  <Method byte[] bw.a(String)>
	//   13   24:invokevirtual   #98  <Method boolean Signature.verify(byte[])>
	//   14   27:ifne            40
				Log.e("IABUtil/Security", "Signature verification failed.");
	//   15   30:ldc1            #42  <String "IABUtil/Security">
	//   16   32:ldc1            #100 <String "Signature verification failed.">
	//   17   34:invokestatic    #50  <Method int Log.e(String, String)>
	//   18   37:pop             
			}
	//*  19   38:iconst_0        
	//*  20   39:ireturn         
	//*  21   40:iconst_1        
	//*  22   41:ireturn         
			// Misplaced declaration of an exception variable
			catch(PublicKey publickey)
	//*  23   42:astore_0        
			{
				Log.e("IABUtil/Security", "NoSuchAlgorithmException.");
	//   24   43:ldc1            #42  <String "IABUtil/Security">
	//   25   45:ldc1            #102 <String "NoSuchAlgorithmException.">
	//   26   47:invokestatic    #50  <Method int Log.e(String, String)>
	//   27   50:pop             
				return false;
	//   28   51:iconst_0        
	//   29   52:ireturn         
			}
			// Misplaced declaration of an exception variable
			catch(PublicKey publickey)
	//*  30   53:astore_0        
			{
				Log.e("IABUtil/Security", "Invalid key specification.");
	//   31   54:ldc1            #42  <String "IABUtil/Security">
	//   32   56:ldc1            #44  <String "Invalid key specification.">
	//   33   58:invokestatic    #50  <Method int Log.e(String, String)>
	//   34   61:pop             
				return false;
	//   35   62:iconst_0        
	//   36   63:ireturn         
			}
			// Misplaced declaration of an exception variable
			catch(PublicKey publickey)
	//*  37   64:astore_0        
			{
				Log.e("IABUtil/Security", "Signature exception.");
	//   38   65:ldc1            #42  <String "IABUtil/Security">
	//   39   67:ldc1            #104 <String "Signature exception.">
	//   40   69:invokestatic    #50  <Method int Log.e(String, String)>
	//   41   72:pop             
				return false;
	//   42   73:iconst_0        
	//   43   74:ireturn         
			}
			// Misplaced declaration of an exception variable
			catch(PublicKey publickey)
	//*  44   75:astore_0        
			{
				Log.e("IABUtil/Security", "Base64 decoding failed.");
	//   45   76:ldc1            #42  <String "IABUtil/Security">
	//   46   78:ldc1            #55  <String "Base64 decoding failed.">
	//   47   80:invokestatic    #50  <Method int Log.e(String, String)>
	//   48   83:pop             
				return false;
	//   49   84:iconst_0        
	//   50   85:ireturn         
			}
			return false;
		}
		return true;
	}
}
