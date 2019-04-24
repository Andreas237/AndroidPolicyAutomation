// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import java.security.*;

// Referenced classes of package com.itextpdf.text.pdf.security:
//			ExternalSignature, DigestAlgorithms

public class PrivateKeySignature
	implements ExternalSignature
{

	public PrivateKeySignature(PrivateKey privatekey, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		pk = privatekey;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field PrivateKey pk>
		provider = s1;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #21  <Field String provider>
		hashAlgorithm = DigestAlgorithms.getDigest(DigestAlgorithms.getAllowedDigests(s));
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:invokestatic    #27  <Method String DigestAlgorithms.getAllowedDigests(String)>
	//   11   19:invokestatic    #30  <Method String DigestAlgorithms.getDigest(String)>
	//   12   22:putfield        #32  <Field String hashAlgorithm>
		encryptionAlgorithm = privatekey.getAlgorithm();
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokeinterface #38  <Method String PrivateKey.getAlgorithm()>
	//   16   32:putfield        #40  <Field String encryptionAlgorithm>
		if(encryptionAlgorithm.startsWith("EC"))
	//*  17   35:aload_0         
	//*  18   36:getfield        #40  <Field String encryptionAlgorithm>
	//*  19   39:ldc1            #42  <String "EC">
	//*  20   41:invokevirtual   #48  <Method boolean String.startsWith(String)>
	//*  21   44:ifeq            53
			encryptionAlgorithm = "ECDSA";
	//   22   47:aload_0         
	//   23   48:ldc1            #50  <String "ECDSA">
	//   24   50:putfield        #40  <Field String encryptionAlgorithm>
	//   25   53:return          
	}

	public String getEncryptionAlgorithm()
	{
		return encryptionAlgorithm;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String encryptionAlgorithm>
	//    2    4:areturn         
	}

	public String getHashAlgorithm()
	{
		return hashAlgorithm;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String hashAlgorithm>
	//    2    4:areturn         
	}

	public byte[] sign(byte abyte0[])
		throws GeneralSecurityException
	{
		Object obj = ((Object) ((new StringBuilder()).append(hashAlgorithm).append("with").append(encryptionAlgorithm).toString()));
	//    0    0:new             #59  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:getfield        #32  <Field String hashAlgorithm>
	//    5   11:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//    6   14:ldc1            #66  <String "with">
	//    7   16:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:aload_0         
	//    9   20:getfield        #40  <Field String encryptionAlgorithm>
	//   10   23:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   11   26:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   12   29:astore_2        
		if(provider == null)
	//*  13   30:aload_0         
	//*  14   31:getfield        #21  <Field String provider>
	//*  15   34:ifnonnull       60
			obj = ((Object) (Signature.getInstance(((String) (obj)))));
	//   16   37:aload_2         
	//   17   38:invokestatic    #75  <Method Signature Signature.getInstance(String)>
	//   18   41:astore_2        
		else
	//*  19   42:aload_2         
	//*  20   43:aload_0         
	//*  21   44:getfield        #19  <Field PrivateKey pk>
	//*  22   47:invokevirtual   #79  <Method void Signature.initSign(PrivateKey)>
	//*  23   50:aload_2         
	//*  24   51:aload_1         
	//*  25   52:invokevirtual   #83  <Method void Signature.update(byte[])>
	//*  26   55:aload_2         
	//*  27   56:invokevirtual   #86  <Method byte[] Signature.sign()>
	//*  28   59:areturn         
			obj = ((Object) (Signature.getInstance(((String) (obj)), provider)));
	//   29   60:aload_2         
	//   30   61:aload_0         
	//   31   62:getfield        #21  <Field String provider>
	//   32   65:invokestatic    #89  <Method Signature Signature.getInstance(String, String)>
	//   33   68:astore_2        
		((Signature) (obj)).initSign(pk);
		((Signature) (obj)).update(abyte0);
		return ((Signature) (obj)).sign();
	//*  34   69:goto            42
	}

	private String encryptionAlgorithm;
	private String hashAlgorithm;
	private PrivateKey pk;
	private String provider;
}
