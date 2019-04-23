// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ais, apy, apx, aps, 
//			apf

public final class aop
	implements ais
{

	public aop(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		apy.a(abyte0.length);
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:invokestatic    #18  <Method void apy.a(int)>
		a = ((SecretKey) (new SecretKeySpec(abyte0, "AES")));
	//    5    9:aload_0         
	//    6   10:new             #20  <Class SecretKeySpec>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:ldc1            #22  <String "AES">
	//   10   17:invokespecial   #25  <Method void SecretKeySpec(byte[], String)>
	//   11   20:putfield        #27  <Field SecretKey a>
	//   12   23:return          
	}

	private static AlgorithmParameterSpec a(byte abyte0[], int i, int j)
	{
		ClassNotFoundException classnotfoundexception;
		GCMParameterSpec gcmparameterspec;
		try
		{
			Class.forName("javax.crypto.spec.GCMParameterSpec");
	//    0    0:ldc1            #33  <String "javax.crypto.spec.GCMParameterSpec">
	//    1    2:invokestatic    #39  <Method Class Class.forName(String)>
	//    2    5:pop             
			gcmparameterspec = new GCMParameterSpec(128, abyte0, 0, j);
	//    3    6:new             #41  <Class GCMParameterSpec>
	//    4    9:dup             
	//    5   10:sipush          128
	//    6   13:aload_0         
	//    7   14:iconst_0        
	//    8   15:iload_2         
	//    9   16:invokespecial   #44  <Method void GCMParameterSpec(int, byte[], int, int)>
	//   10   19:astore_3        
		}
	//*  11   20:aload_3         
	//*  12   21:areturn         
	//*  13   22:invokestatic    #49  <Method boolean apx.a()>
	//*  14   25:ifeq            39
	//*  15   28:new             #51  <Class IvParameterSpec>
	//*  16   31:dup             
	//*  17   32:aload_0         
	//*  18   33:iconst_0        
	//*  19   34:iload_2         
	//*  20   35:invokespecial   #54  <Method void IvParameterSpec(byte[], int, int)>
	//*  21   38:areturn         
	//*  22   39:new             #56  <Class GeneralSecurityException>
	//*  23   42:dup             
	//*  24   43:ldc1            #58  <String "cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found">
	//*  25   45:invokespecial   #61  <Method void GeneralSecurityException(String)>
	//*  26   48:athrow          
		// Misplaced declaration of an exception variable
		catch(ClassNotFoundException classnotfoundexception)
		{
			if(apx.a())
				return ((AlgorithmParameterSpec) (new IvParameterSpec(abyte0, 0, j)));
			else
				throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
		}
		return ((AlgorithmParameterSpec) (gcmparameterspec));
	//*  27   49:astore_3        
	//*  28   50:goto            22
	}

	public final byte[] a(byte abyte0[], byte abyte1[])
	{
		if(abyte0.length <= 0x7fffffe3)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:ldc1            #63  <Int 0x7fffffe3>
	//*   3    4:icmpgt          149
		{
			byte abyte2[] = new byte[abyte0.length + 12 + 16];
	//    4    7:aload_1         
	//    5    8:arraylength     
	//    6    9:bipush          12
	//    7   11:iadd            
	//    8   12:bipush          16
	//    9   14:iadd            
	//   10   15:newarray        byte[]
	//   11   17:astore          4
			byte abyte3[] = aps.a(12);
	//   12   19:bipush          12
	//   13   21:invokestatic    #68  <Method byte[] aps.a(int)>
	//   14   24:astore          6
			System.arraycopy(((Object) (abyte3)), 0, ((Object) (abyte2)), 0, 12);
	//   15   26:aload           6
	//   16   28:iconst_0        
	//   17   29:aload           4
	//   18   31:iconst_0        
	//   19   32:bipush          12
	//   20   34:invokestatic    #74  <Method void System.arraycopy(Object, int, Object, int, int)>
			Cipher cipher = (Cipher)apf.a.a("AES/GCM/NoPadding");
	//   21   37:getstatic       #79  <Field apf apf.a>
	//   22   40:ldc1            #81  <String "AES/GCM/NoPadding">
	//   23   42:invokevirtual   #84  <Method Object apf.a(String)>
	//   24   45:checkcast       #86  <Class Cipher>
	//   25   48:astore          5
			AlgorithmParameterSpec algorithmparameterspec = a(abyte3, 0, abyte3.length);
	//   26   50:aload           6
	//   27   52:iconst_0        
	//   28   53:aload           6
	//   29   55:arraylength     
	//   30   56:invokestatic    #88  <Method AlgorithmParameterSpec a(byte[], int, int)>
	//   31   59:astore          6
			cipher.init(1, ((java.security.Key) (a)), algorithmparameterspec);
	//   32   61:aload           5
	//   33   63:iconst_1        
	//   34   64:aload_0         
	//   35   65:getfield        #27  <Field SecretKey a>
	//   36   68:aload           6
	//   37   70:invokevirtual   #92  <Method void Cipher.init(int, java.security.Key, AlgorithmParameterSpec)>
			if(abyte1 != null && abyte1.length != 0)
	//*  38   73:aload_2         
	//*  39   74:ifnull          88
	//*  40   77:aload_2         
	//*  41   78:arraylength     
	//*  42   79:ifeq            88
				cipher.updateAAD(abyte1);
	//   43   82:aload           5
	//   44   84:aload_2         
	//   45   85:invokevirtual   #95  <Method void Cipher.updateAAD(byte[])>
			int i = cipher.doFinal(abyte0, 0, abyte0.length, abyte2, 12);
	//   46   88:aload           5
	//   47   90:aload_1         
	//   48   91:iconst_0        
	//   49   92:aload_1         
	//   50   93:arraylength     
	//   51   94:aload           4
	//   52   96:bipush          12
	//   53   98:invokevirtual   #99  <Method int Cipher.doFinal(byte[], int, int, byte[], int)>
	//   54  101:istore_3        
			if(i == abyte0.length + 16)
	//*  55  102:iload_3         
	//*  56  103:aload_1         
	//*  57  104:arraylength     
	//*  58  105:bipush          16
	//*  59  107:iadd            
	//*  60  108:icmpne          114
				return abyte2;
	//   61  111:aload           4
	//   62  113:areturn         
			else
				throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[] {
					Integer.valueOf(16), Integer.valueOf(i - abyte0.length)
				}));
	//   63  114:new             #56  <Class GeneralSecurityException>
	//   64  117:dup             
	//   65  118:ldc1            #101 <String "encryption failed; GCM tag must be %s bytes, but got only %s bytes">
	//   66  120:iconst_2        
	//   67  121:anewarray       Object[]
	//   68  124:dup             
	//   69  125:iconst_0        
	//   70  126:bipush          16
	//   71  128:invokestatic    #107 <Method Integer Integer.valueOf(int)>
	//   72  131:aastore         
	//   73  132:dup             
	//   74  133:iconst_1        
	//   75  134:iload_3         
	//   76  135:aload_1         
	//   77  136:arraylength     
	//   78  137:isub            
	//   79  138:invokestatic    #107 <Method Integer Integer.valueOf(int)>
	//   80  141:aastore         
	//   81  142:invokestatic    #113 <Method String String.format(String, Object[])>
	//   82  145:invokespecial   #61  <Method void GeneralSecurityException(String)>
	//   83  148:athrow          
		} else
		{
			throw new GeneralSecurityException("plaintext too long");
	//   84  149:new             #56  <Class GeneralSecurityException>
	//   85  152:dup             
	//   86  153:ldc1            #115 <String "plaintext too long">
	//   87  155:invokespecial   #61  <Method void GeneralSecurityException(String)>
	//   88  158:athrow          
		}
	}

	private final SecretKey a;
}
