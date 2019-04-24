// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.researchstack.backbone.storage.file;

import android.content.Context;
import org.researchstack.backbone.storage.file.aes.ClearEncrypter;
import org.researchstack.backbone.storage.file.aes.Encrypter;

// Referenced classes of package org.researchstack.backbone.storage.file:
//			EncryptionProvider, PinCodeConfig

public class UnencryptedProvider
	implements EncryptionProvider
{

	public UnencryptedProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public void changePinCode(Context context, String s, String s1)
	{
		throw new RuntimeException("Pin codes should not be used with this encryption provider");
	//    0    0:new             #19  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #10  <String "Pin codes should not be used with this encryption provider">
	//    3    6:invokespecial   #22  <Method void RuntimeException(String)>
	//    4    9:athrow          
	}

	public void createPinCode(Context context, String s)
	{
		throw new RuntimeException("Pin codes should not be used with this encryption provider");
	//    0    0:new             #19  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #10  <String "Pin codes should not be used with this encryption provider">
	//    3    6:invokespecial   #22  <Method void RuntimeException(String)>
	//    4    9:athrow          
	}

	public Encrypter getEncrypter()
	{
		return ((Encrypter) (new ClearEncrypter()));
	//    0    0:new             #28  <Class ClearEncrypter>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void ClearEncrypter()>
	//    3    7:areturn         
	}

	public boolean hasPinCode(Context context)
	{
		throw new RuntimeException("Pin codes should not be used with this encryption provider");
	//    0    0:new             #19  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #10  <String "Pin codes should not be used with this encryption provider">
	//    3    6:invokespecial   #22  <Method void RuntimeException(String)>
	//    4    9:athrow          
	}

	public void logAccessTime()
	{
	//    0    0:return          
	}

	public boolean needsAuth(Context context, PinCodeConfig pincodeconfig)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void removePinCode(Context context)
	{
		throw new RuntimeException("Pin codes should not be used with this encryption provider");
	//    0    0:new             #19  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #10  <String "Pin codes should not be used with this encryption provider">
	//    3    6:invokespecial   #22  <Method void RuntimeException(String)>
	//    4    9:athrow          
	}

	public void startWithPassphrase(Context context, String s)
	{
		throw new RuntimeException("Pin codes should not be used with this encryption provider");
	//    0    0:new             #19  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #10  <String "Pin codes should not be used with this encryption provider">
	//    3    6:invokespecial   #22  <Method void RuntimeException(String)>
	//    4    9:athrow          
	}

	public static final String PIN_CODE_ERROR_MSG = "Pin codes should not be used with this encryption provider";
}
