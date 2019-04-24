// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzatz, zzazl, zzayy

public final class zzayj
	implements zzatz
{

	public zzayj(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		zzdna = ((SecretKey) (new SecretKeySpec(abyte0, "AES")));
	//    2    4:aload_0         
	//    3    5:new             #15  <Class SecretKeySpec>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:ldc1            #17  <String "AES">
	//    7   12:invokespecial   #20  <Method void SecretKeySpec(byte[], String)>
	//    8   15:putfield        #22  <Field SecretKey zzdna>
	//    9   18:return          
	}

	public final byte[] zzc(byte abyte0[], byte abyte1[])
		throws GeneralSecurityException
	{
		if(abyte0.length > 0x7fffffe3)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:ldc1            #28  <Int 0x7fffffe3>
	//*   3    4:icmple          17
			throw new GeneralSecurityException("plaintext too long");
	//    4    7:new             #27  <Class GeneralSecurityException>
	//    5   10:dup             
	//    6   11:ldc1            #30  <String "plaintext too long">
	//    7   13:invokespecial   #33  <Method void GeneralSecurityException(String)>
	//    8   16:athrow          
		byte abyte3[] = new byte[abyte0.length + 12 + 16];
	//    9   17:aload_1         
	//   10   18:arraylength     
	//   11   19:bipush          12
	//   12   21:iadd            
	//   13   22:bipush          16
	//   14   24:iadd            
	//   15   25:newarray        byte[]
	//   16   27:astore          4
		byte abyte2[] = zzazl.zzbh(12);
	//   17   29:bipush          12
	//   18   31:invokestatic    #39  <Method byte[] zzazl.zzbh(int)>
	//   19   34:astore_3        
		System.arraycopy(((Object) (abyte2)), 0, ((Object) (abyte3)), 0, 12);
	//   20   35:aload_3         
	//   21   36:iconst_0        
	//   22   37:aload           4
	//   23   39:iconst_0        
	//   24   40:bipush          12
	//   25   42:invokestatic    #45  <Method void System.arraycopy(Object, int, Object, int, int)>
		Cipher cipher = (Cipher)zzayy.zzdnz.zzek("AES/GCM/NoPadding");
	//   26   45:getstatic       #51  <Field zzayy zzayy.zzdnz>
	//   27   48:ldc1            #53  <String "AES/GCM/NoPadding">
	//   28   50:invokevirtual   #57  <Method Object zzayy.zzek(String)>
	//   29   53:checkcast       #59  <Class Cipher>
	//   30   56:astore          5
		GCMParameterSpec gcmparameterspec = new GCMParameterSpec(128, abyte2);
	//   31   58:new             #61  <Class GCMParameterSpec>
	//   32   61:dup             
	//   33   62:sipush          128
	//   34   65:aload_3         
	//   35   66:invokespecial   #64  <Method void GCMParameterSpec(int, byte[])>
	//   36   69:astore_3        
		cipher.init(1, ((java.security.Key) (zzdna)), ((java.security.spec.AlgorithmParameterSpec) (gcmparameterspec)));
	//   37   70:aload           5
	//   38   72:iconst_1        
	//   39   73:aload_0         
	//   40   74:getfield        #22  <Field SecretKey zzdna>
	//   41   77:aload_3         
	//   42   78:invokevirtual   #68  <Method void Cipher.init(int, java.security.Key, java.security.spec.AlgorithmParameterSpec)>
		gcmparameterspec = ((GCMParameterSpec) (abyte1));
	//   43   81:aload_2         
	//   44   82:astore_3        
		if(abyte1 == null)
	//*  45   83:aload_2         
	//*  46   84:ifnonnull       91
			gcmparameterspec = ((GCMParameterSpec) (new byte[0]));
	//   47   87:iconst_0        
	//   48   88:newarray        byte[]
	//   49   90:astore_3        
		cipher.updateAAD(((byte []) (gcmparameterspec)));
	//   50   91:aload           5
	//   51   93:aload_3         
	//   52   94:invokevirtual   #71  <Method void Cipher.updateAAD(byte[])>
		cipher.doFinal(abyte0, 0, abyte0.length, abyte3, 12);
	//   53   97:aload           5
	//   54   99:aload_1         
	//   55  100:iconst_0        
	//   56  101:aload_1         
	//   57  102:arraylength     
	//   58  103:aload           4
	//   59  105:bipush          12
	//   60  107:invokevirtual   #75  <Method int Cipher.doFinal(byte[], int, int, byte[], int)>
	//   61  110:pop             
		return abyte3;
	//   62  111:aload           4
	//   63  113:areturn         
	}

	private final SecretKey zzdna;
}
