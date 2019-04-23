// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.google.android.gms.internal.ads:
//			app, apy, apf, aps

public final class aon
	implements app
{

	public aon(byte abyte0[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		apy.a(abyte0.length);
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:invokestatic    #21  <Method void apy.a(int)>
		a = new SecretKeySpec(abyte0, "AES");
	//    5    9:aload_0         
	//    6   10:new             #23  <Class SecretKeySpec>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:ldc1            #25  <String "AES">
	//   10   17:invokespecial   #28  <Method void SecretKeySpec(byte[], String)>
	//   11   20:putfield        #30  <Field SecretKeySpec a>
		c = ((Cipher)apf.a.a("AES/CTR/NoPadding")).getBlockSize();
	//   12   23:aload_0         
	//   13   24:getstatic       #35  <Field apf apf.a>
	//   14   27:ldc1            #37  <String "AES/CTR/NoPadding">
	//   15   29:invokevirtual   #40  <Method Object apf.a(String)>
	//   16   32:checkcast       #42  <Class Cipher>
	//   17   35:invokevirtual   #46  <Method int Cipher.getBlockSize()>
	//   18   38:putfield        #48  <Field int c>
		if(i >= 12 && i <= c)
	//*  19   41:iload_2         
	//*  20   42:bipush          12
	//*  21   44:icmplt          61
	//*  22   47:iload_2         
	//*  23   48:aload_0         
	//*  24   49:getfield        #48  <Field int c>
	//*  25   52:icmpgt          61
		{
			b = i;
	//   26   55:aload_0         
	//   27   56:iload_2         
	//   28   57:putfield        #50  <Field int b>
			return;
	//   29   60:return          
		} else
		{
			throw new GeneralSecurityException("invalid IV size");
	//   30   61:new             #52  <Class GeneralSecurityException>
	//   31   64:dup             
	//   32   65:ldc1            #54  <String "invalid IV size">
	//   33   67:invokespecial   #57  <Method void GeneralSecurityException(String)>
	//   34   70:athrow          
		}
	}

	public final byte[] a(byte abyte0[])
	{
		int i = abyte0.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_2        
		int k = b;
	//    3    3:aload_0         
	//    4    4:getfield        #50  <Field int b>
	//    5    7:istore_3        
		if(i <= 0x7fffffff - k)
	//*   6    8:iload_2         
	//*   7    9:ldc1            #60  <Int 0x7fffffff>
	//*   8   11:iload_3         
	//*   9   12:isub            
	//*  10   13:icmpgt          136
		{
			byte abyte1[] = new byte[abyte0.length + k];
	//   11   16:aload_1         
	//   12   17:arraylength     
	//   13   18:iload_3         
	//   14   19:iadd            
	//   15   20:newarray        byte[]
	//   16   22:astore          4
			byte abyte2[] = aps.a(k);
	//   17   24:iload_3         
	//   18   25:invokestatic    #65  <Method byte[] aps.a(int)>
	//   19   28:astore          6
			System.arraycopy(((Object) (abyte2)), 0, ((Object) (abyte1)), 0, b);
	//   20   30:aload           6
	//   21   32:iconst_0        
	//   22   33:aload           4
	//   23   35:iconst_0        
	//   24   36:aload_0         
	//   25   37:getfield        #50  <Field int b>
	//   26   40:invokestatic    #71  <Method void System.arraycopy(Object, int, Object, int, int)>
			int j = abyte0.length;
	//   27   43:aload_1         
	//   28   44:arraylength     
	//   29   45:istore_2        
			k = b;
	//   30   46:aload_0         
	//   31   47:getfield        #50  <Field int b>
	//   32   50:istore_3        
			Cipher cipher = (Cipher)apf.a.a("AES/CTR/NoPadding");
	//   33   51:getstatic       #35  <Field apf apf.a>
	//   34   54:ldc1            #37  <String "AES/CTR/NoPadding">
	//   35   56:invokevirtual   #40  <Method Object apf.a(String)>
	//   36   59:checkcast       #42  <Class Cipher>
	//   37   62:astore          5
			byte abyte3[] = new byte[c];
	//   38   64:aload_0         
	//   39   65:getfield        #48  <Field int c>
	//   40   68:newarray        byte[]
	//   41   70:astore          7
			System.arraycopy(((Object) (abyte2)), 0, ((Object) (abyte3)), 0, b);
	//   42   72:aload           6
	//   43   74:iconst_0        
	//   44   75:aload           7
	//   45   77:iconst_0        
	//   46   78:aload_0         
	//   47   79:getfield        #50  <Field int b>
	//   48   82:invokestatic    #71  <Method void System.arraycopy(Object, int, Object, int, int)>
			IvParameterSpec ivparameterspec = new IvParameterSpec(abyte3);
	//   49   85:new             #73  <Class IvParameterSpec>
	//   50   88:dup             
	//   51   89:aload           7
	//   52   91:invokespecial   #76  <Method void IvParameterSpec(byte[])>
	//   53   94:astore          6
			cipher.init(1, ((java.security.Key) (a)), ((java.security.spec.AlgorithmParameterSpec) (ivparameterspec)));
	//   54   96:aload           5
	//   55   98:iconst_1        
	//   56   99:aload_0         
	//   57  100:getfield        #30  <Field SecretKeySpec a>
	//   58  103:aload           6
	//   59  105:invokevirtual   #80  <Method void Cipher.init(int, java.security.Key, java.security.spec.AlgorithmParameterSpec)>
			if(cipher.doFinal(abyte0, 0, j, abyte1, k) == j)
	//*  60  108:aload           5
	//*  61  110:aload_1         
	//*  62  111:iconst_0        
	//*  63  112:iload_2         
	//*  64  113:aload           4
	//*  65  115:iload_3         
	//*  66  116:invokevirtual   #84  <Method int Cipher.doFinal(byte[], int, int, byte[], int)>
	//*  67  119:iload_2         
	//*  68  120:icmpne          126
				return abyte1;
	//   69  123:aload           4
	//   70  125:areturn         
			else
				throw new GeneralSecurityException("stored output's length does not match input's length");
	//   71  126:new             #52  <Class GeneralSecurityException>
	//   72  129:dup             
	//   73  130:ldc1            #86  <String "stored output's length does not match input's length">
	//   74  132:invokespecial   #57  <Method void GeneralSecurityException(String)>
	//   75  135:athrow          
		} else
		{
			abyte0 = ((byte []) (new StringBuilder(43)));
	//   76  136:new             #88  <Class StringBuilder>
	//   77  139:dup             
	//   78  140:bipush          43
	//   79  142:invokespecial   #90  <Method void StringBuilder(int)>
	//   80  145:astore_1        
			((StringBuilder) (abyte0)).append("plaintext length can not exceed ");
	//   81  146:aload_1         
	//   82  147:ldc1            #92  <String "plaintext length can not exceed ">
	//   83  149:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   84  152:pop             
			((StringBuilder) (abyte0)).append(0x7fffffff - k);
	//   85  153:aload_1         
	//   86  154:ldc1            #60  <Int 0x7fffffff>
	//   87  156:iload_3         
	//   88  157:isub            
	//   89  158:invokevirtual   #99  <Method StringBuilder StringBuilder.append(int)>
	//   90  161:pop             
			throw new GeneralSecurityException(((StringBuilder) (abyte0)).toString());
	//   91  162:new             #52  <Class GeneralSecurityException>
	//   92  165:dup             
	//   93  166:aload_1         
	//   94  167:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   95  170:invokespecial   #57  <Method void GeneralSecurityException(String)>
	//   96  173:athrow          
		}
	}

	private final SecretKeySpec a;
	private final int b;
	private final int c;
}
