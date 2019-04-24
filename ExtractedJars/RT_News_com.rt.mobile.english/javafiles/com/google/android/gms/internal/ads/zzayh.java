// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzazi, zzayy, zzazl

public final class zzayh
	implements zzazi
{

	public zzayh(byte abyte0[], int i)
		throws GeneralSecurityException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		zzdmu = new SecretKeySpec(abyte0, "AES");
	//    2    4:aload_0         
	//    3    5:new             #20  <Class SecretKeySpec>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:ldc1            #22  <String "AES">
	//    7   12:invokespecial   #25  <Method void SecretKeySpec(byte[], String)>
	//    8   15:putfield        #27  <Field SecretKeySpec zzdmu>
		zzdmw = ((Cipher)zzayy.zzdnz.zzek("AES/CTR/NoPadding")).getBlockSize();
	//    9   18:aload_0         
	//   10   19:getstatic       #33  <Field zzayy zzayy.zzdnz>
	//   11   22:ldc1            #35  <String "AES/CTR/NoPadding">
	//   12   24:invokevirtual   #39  <Method Object zzayy.zzek(String)>
	//   13   27:checkcast       #41  <Class Cipher>
	//   14   30:invokevirtual   #45  <Method int Cipher.getBlockSize()>
	//   15   33:putfield        #47  <Field int zzdmw>
		if(i >= 12 && i <= zzdmw)
	//*  16   36:iload_2         
	//*  17   37:bipush          12
	//*  18   39:icmplt          59
	//*  19   42:iload_2         
	//*  20   43:aload_0         
	//*  21   44:getfield        #47  <Field int zzdmw>
	//*  22   47:icmple          53
	//*  23   50:goto            59
		{
			zzdmv = i;
	//   24   53:aload_0         
	//   25   54:iload_2         
	//   26   55:putfield        #49  <Field int zzdmv>
			return;
	//   27   58:return          
		} else
		{
			throw new GeneralSecurityException("invalid IV size");
	//   28   59:new             #15  <Class GeneralSecurityException>
	//   29   62:dup             
	//   30   63:ldc1            #51  <String "invalid IV size">
	//   31   65:invokespecial   #54  <Method void GeneralSecurityException(String)>
	//   32   68:athrow          
		}
	}

	public final byte[] zzk(byte abyte0[])
		throws GeneralSecurityException
	{
		if(abyte0.length > 0x7fffffff - zzdmv)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:ldc1            #59  <Int 0x7fffffff>
	//*   3    4:aload_0         
	//*   4    5:getfield        #49  <Field int zzdmv>
	//*   5    8:isub            
	//*   6    9:icmple          55
		{
			int i = zzdmv;
	//    7   12:aload_0         
	//    8   13:getfield        #49  <Field int zzdmv>
	//    9   16:istore_2        
			abyte0 = ((byte []) (new StringBuilder(43)));
	//   10   17:new             #61  <Class StringBuilder>
	//   11   20:dup             
	//   12   21:bipush          43
	//   13   23:invokespecial   #64  <Method void StringBuilder(int)>
	//   14   26:astore_1        
			((StringBuilder) (abyte0)).append("plaintext length can not exceed ");
	//   15   27:aload_1         
	//   16   28:ldc1            #66  <String "plaintext length can not exceed ">
	//   17   30:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   18   33:pop             
			((StringBuilder) (abyte0)).append(0x7fffffff - i);
	//   19   34:aload_1         
	//   20   35:ldc1            #59  <Int 0x7fffffff>
	//   21   37:iload_2         
	//   22   38:isub            
	//   23   39:invokevirtual   #73  <Method StringBuilder StringBuilder.append(int)>
	//   24   42:pop             
			throw new GeneralSecurityException(((StringBuilder) (abyte0)).toString());
	//   25   43:new             #15  <Class GeneralSecurityException>
	//   26   46:dup             
	//   27   47:aload_1         
	//   28   48:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   29   51:invokespecial   #54  <Method void GeneralSecurityException(String)>
	//   30   54:athrow          
		}
		byte abyte1[] = new byte[zzdmv + abyte0.length];
	//   31   55:aload_0         
	//   32   56:getfield        #49  <Field int zzdmv>
	//   33   59:aload_1         
	//   34   60:arraylength     
	//   35   61:iadd            
	//   36   62:newarray        byte[]
	//   37   64:astore          4
		byte abyte2[] = zzazl.zzbh(zzdmv);
	//   38   66:aload_0         
	//   39   67:getfield        #49  <Field int zzdmv>
	//   40   70:invokestatic    #83  <Method byte[] zzazl.zzbh(int)>
	//   41   73:astore          6
		System.arraycopy(((Object) (abyte2)), 0, ((Object) (abyte1)), 0, zzdmv);
	//   42   75:aload           6
	//   43   77:iconst_0        
	//   44   78:aload           4
	//   45   80:iconst_0        
	//   46   81:aload_0         
	//   47   82:getfield        #49  <Field int zzdmv>
	//   48   85:invokestatic    #89  <Method void System.arraycopy(Object, int, Object, int, int)>
		int j = abyte0.length;
	//   49   88:aload_1         
	//   50   89:arraylength     
	//   51   90:istore_2        
		int k = zzdmv;
	//   52   91:aload_0         
	//   53   92:getfield        #49  <Field int zzdmv>
	//   54   95:istore_3        
		Cipher cipher = (Cipher)zzayy.zzdnz.zzek("AES/CTR/NoPadding");
	//   55   96:getstatic       #33  <Field zzayy zzayy.zzdnz>
	//   56   99:ldc1            #35  <String "AES/CTR/NoPadding">
	//   57  101:invokevirtual   #39  <Method Object zzayy.zzek(String)>
	//   58  104:checkcast       #41  <Class Cipher>
	//   59  107:astore          5
		byte abyte3[] = new byte[zzdmw];
	//   60  109:aload_0         
	//   61  110:getfield        #47  <Field int zzdmw>
	//   62  113:newarray        byte[]
	//   63  115:astore          7
		System.arraycopy(((Object) (abyte2)), 0, ((Object) (abyte3)), 0, zzdmv);
	//   64  117:aload           6
	//   65  119:iconst_0        
	//   66  120:aload           7
	//   67  122:iconst_0        
	//   68  123:aload_0         
	//   69  124:getfield        #49  <Field int zzdmv>
	//   70  127:invokestatic    #89  <Method void System.arraycopy(Object, int, Object, int, int)>
		IvParameterSpec ivparameterspec = new IvParameterSpec(abyte3);
	//   71  130:new             #91  <Class IvParameterSpec>
	//   72  133:dup             
	//   73  134:aload           7
	//   74  136:invokespecial   #94  <Method void IvParameterSpec(byte[])>
	//   75  139:astore          6
		cipher.init(1, ((java.security.Key) (zzdmu)), ((java.security.spec.AlgorithmParameterSpec) (ivparameterspec)));
	//   76  141:aload           5
	//   77  143:iconst_1        
	//   78  144:aload_0         
	//   79  145:getfield        #27  <Field SecretKeySpec zzdmu>
	//   80  148:aload           6
	//   81  150:invokevirtual   #98  <Method void Cipher.init(int, java.security.Key, java.security.spec.AlgorithmParameterSpec)>
		if(cipher.doFinal(abyte0, 0, j, abyte1, k) != j)
	//*  82  153:aload           5
	//*  83  155:aload_1         
	//*  84  156:iconst_0        
	//*  85  157:iload_2         
	//*  86  158:aload           4
	//*  87  160:iload_3         
	//*  88  161:invokevirtual   #102 <Method int Cipher.doFinal(byte[], int, int, byte[], int)>
	//*  89  164:iload_2         
	//*  90  165:icmpeq          178
			throw new GeneralSecurityException("stored output's length does not match input's length");
	//   91  168:new             #15  <Class GeneralSecurityException>
	//   92  171:dup             
	//   93  172:ldc1            #104 <String "stored output's length does not match input's length">
	//   94  174:invokespecial   #54  <Method void GeneralSecurityException(String)>
	//   95  177:athrow          
		else
			return abyte1;
	//   96  178:aload           4
	//   97  180:areturn         
	}

	private final SecretKeySpec zzdmu;
	private final int zzdmv;
	private final int zzdmw;
}
