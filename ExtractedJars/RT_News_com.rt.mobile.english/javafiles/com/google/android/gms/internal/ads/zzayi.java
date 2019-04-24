// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzatz, zzazl

public final class zzayi
	implements zzatz
{

	public zzayi(byte abyte0[], int i)
		throws GeneralSecurityException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		if(i != 12 && i != 16)
	//*   2    4:iload_2         
	//*   3    5:bipush          12
	//*   4    7:icmpeq          26
	//*   5   10:iload_2         
	//*   6   11:bipush          16
	//*   7   13:icmpeq          26
		{
			throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
	//    8   16:new             #22  <Class IllegalArgumentException>
	//    9   19:dup             
	//   10   20:ldc1            #24  <String "IV size should be either 12 or 16 bytes">
	//   11   22:invokespecial   #27  <Method void IllegalArgumentException(String)>
	//   12   25:athrow          
		} else
		{
			zzdmz = i;
	//   13   26:aload_0         
	//   14   27:iload_2         
	//   15   28:putfield        #29  <Field int zzdmz>
			zzdmu = new SecretKeySpec(abyte0, "AES");
	//   16   31:aload_0         
	//   17   32:new             #31  <Class SecretKeySpec>
	//   18   35:dup             
	//   19   36:aload_1         
	//   20   37:ldc1            #33  <String "AES">
	//   21   39:invokespecial   #36  <Method void SecretKeySpec(byte[], String)>
	//   22   42:putfield        #38  <Field SecretKeySpec zzdmu>
			abyte0 = ((byte []) (Cipher.getInstance("AES/ECB/NOPADDING")));
	//   23   45:ldc1            #40  <String "AES/ECB/NOPADDING">
	//   24   47:invokestatic    #46  <Method Cipher Cipher.getInstance(String)>
	//   25   50:astore_1        
			((Cipher) (abyte0)).init(1, ((java.security.Key) (zzdmu)));
	//   26   51:aload_1         
	//   27   52:iconst_1        
	//   28   53:aload_0         
	//   29   54:getfield        #38  <Field SecretKeySpec zzdmu>
	//   30   57:invokevirtual   #50  <Method void Cipher.init(int, java.security.Key)>
			zzdmx = zzl(((Cipher) (abyte0)).doFinal(new byte[16]));
	//   31   60:aload_0         
	//   32   61:aload_1         
	//   33   62:bipush          16
	//   34   64:newarray        byte[]
	//   35   66:invokevirtual   #54  <Method byte[] Cipher.doFinal(byte[])>
	//   36   69:invokestatic    #57  <Method byte[] zzl(byte[])>
	//   37   72:putfield        #59  <Field byte[] zzdmx>
			zzdmy = zzl(zzdmx);
	//   38   75:aload_0         
	//   39   76:aload_0         
	//   40   77:getfield        #59  <Field byte[] zzdmx>
	//   41   80:invokestatic    #57  <Method byte[] zzl(byte[])>
	//   42   83:putfield        #61  <Field byte[] zzdmy>
			return;
	//   43   86:return          
		}
	}

	private final byte[] zza(Cipher cipher, int i, byte abyte0[], int j, int k)
		throws IllegalBlockSizeException, BadPaddingException
	{
		byte abyte1[] = new byte[16];
	//    0    0:bipush          16
	//    1    2:newarray        byte[]
	//    2    4:astore          8
		abyte1[15] = (byte)i;
	//    3    6:aload           8
	//    4    8:bipush          15
	//    5   10:iload_2         
	//    6   11:int2byte        
	//    7   12:bastore         
		if(k == 0)
	//*   8   13:iload           5
	//*   9   15:ifne            34
		{
			abyte0 = zzd(abyte1, zzdmx);
	//   10   18:aload           8
	//   11   20:aload_0         
	//   12   21:getfield        #59  <Field byte[] zzdmx>
	//   13   24:invokestatic    #73  <Method byte[] zzd(byte[], byte[])>
	//   14   27:astore_3        
		} else
	//*  15   28:aload_1         
	//*  16   29:aload_3         
	//*  17   30:invokevirtual   #54  <Method byte[] Cipher.doFinal(byte[])>
	//*  18   33:areturn         
		{
			abyte1 = cipher.doFinal(abyte1);
	//   19   34:aload_1         
	//   20   35:aload           8
	//   21   37:invokevirtual   #54  <Method byte[] Cipher.doFinal(byte[])>
	//   22   40:astore          8
			boolean flag = false;
	//   23   42:iconst_0        
	//   24   43:istore          7
			for(i = 0; k - i > 16; i += 16)
	//*  25   45:iconst_0        
	//*  26   46:istore_2        
	//*  27   47:iload           5
	//*  28   49:iload_2         
	//*  29   50:isub            
	//*  30   51:bipush          16
	//*  31   53:icmple          112
			{
				for(int l = 0; l < 16; l++)
	//*  32   56:iconst_0        
	//*  33   57:istore          6
	//*  34   59:iload           6
	//*  35   61:bipush          16
	//*  36   63:icmpge          96
					abyte1[l] = (byte)(abyte1[l] ^ abyte0[j + i + l]);
	//   37   66:aload           8
	//   38   68:iload           6
	//   39   70:aload           8
	//   40   72:iload           6
	//   41   74:baload          
	//   42   75:aload_3         
	//   43   76:iload           4
	//   44   78:iload_2         
	//   45   79:iadd            
	//   46   80:iload           6
	//   47   82:iadd            
	//   48   83:baload          
	//   49   84:ixor            
	//   50   85:int2byte        
	//   51   86:bastore         

	//   52   87:iload           6
	//   53   89:iconst_1        
	//   54   90:iadd            
	//   55   91:istore          6
	//*  56   93:goto            59
				abyte1 = cipher.doFinal(abyte1);
	//   57   96:aload_1         
	//   58   97:aload           8
	//   59   99:invokevirtual   #54  <Method byte[] Cipher.doFinal(byte[])>
	//   60  102:astore          8
			}

	//   61  104:iload_2         
	//   62  105:bipush          16
	//   63  107:iadd            
	//   64  108:istore_2        
	//*  65  109:goto            47
			byte abyte2[] = Arrays.copyOfRange(abyte0, i + j, j + k);
	//   66  112:aload_3         
	//   67  113:iload_2         
	//   68  114:iload           4
	//   69  116:iadd            
	//   70  117:iload           4
	//   71  119:iload           5
	//   72  121:iadd            
	//   73  122:invokestatic    #79  <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   74  125:astore          9
			if(abyte2.length == 16)
	//*  75  127:aload           9
	//*  76  129:arraylength     
	//*  77  130:bipush          16
	//*  78  132:icmpne          148
			{
				abyte0 = zzd(abyte2, zzdmx);
	//   79  135:aload           9
	//   80  137:aload_0         
	//   81  138:getfield        #59  <Field byte[] zzdmx>
	//   82  141:invokestatic    #73  <Method byte[] zzd(byte[], byte[])>
	//   83  144:astore_3        
			} else
	//*  84  145:goto            202
			{
				abyte0 = Arrays.copyOf(zzdmy, 16);
	//   85  148:aload_0         
	//   86  149:getfield        #61  <Field byte[] zzdmy>
	//   87  152:bipush          16
	//   88  154:invokestatic    #83  <Method byte[] Arrays.copyOf(byte[], int)>
	//   89  157:astore_3        
				for(i = ((int) (flag)); i < abyte2.length; i++)
	//*  90  158:iload           7
	//*  91  160:istore_2        
	//*  92  161:iload_2         
	//*  93  162:aload           9
	//*  94  164:arraylength     
	//*  95  165:icmpge          187
					abyte0[i] = (byte)(abyte0[i] ^ abyte2[i]);
	//   96  168:aload_3         
	//   97  169:iload_2         
	//   98  170:aload_3         
	//   99  171:iload_2         
	//  100  172:baload          
	//  101  173:aload           9
	//  102  175:iload_2         
	//  103  176:baload          
	//  104  177:ixor            
	//  105  178:int2byte        
	//  106  179:bastore         

	//  107  180:iload_2         
	//  108  181:iconst_1        
	//  109  182:iadd            
	//  110  183:istore_2        
	//* 111  184:goto            161
				abyte0[abyte2.length] = (byte)(abyte0[abyte2.length] ^ 0x80);
	//  112  187:aload_3         
	//  113  188:aload           9
	//  114  190:arraylength     
	//  115  191:aload_3         
	//  116  192:aload           9
	//  117  194:arraylength     
	//  118  195:baload          
	//  119  196:sipush          128
	//  120  199:ixor            
	//  121  200:int2byte        
	//  122  201:bastore         
			}
			abyte0 = zzd(abyte1, abyte0);
	//  123  202:aload           8
	//  124  204:aload_3         
	//  125  205:invokestatic    #73  <Method byte[] zzd(byte[], byte[])>
	//  126  208:astore_3        
		}
		return cipher.doFinal(abyte0);
	//* 127  209:goto            28
	}

	private static byte[] zzd(byte abyte0[], byte abyte1[])
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int j = abyte0.length;
	//    2    2:aload_0         
	//    3    3:arraylength     
	//    4    4:istore_3        
		byte abyte2[] = new byte[j];
	//    5    5:iload_3         
	//    6    6:newarray        byte[]
	//    7    8:astore          4
		for(; i < j; i++)
	//*   8   10:iload_2         
	//*   9   11:iload_3         
	//*  10   12:icmpge          34
			abyte2[i] = (byte)(abyte0[i] ^ abyte1[i]);
	//   11   15:aload           4
	//   12   17:iload_2         
	//   13   18:aload_0         
	//   14   19:iload_2         
	//   15   20:baload          
	//   16   21:aload_1         
	//   17   22:iload_2         
	//   18   23:baload          
	//   19   24:ixor            
	//   20   25:int2byte        
	//   21   26:bastore         

	//   22   27:iload_2         
	//   23   28:iconst_1        
	//   24   29:iadd            
	//   25   30:istore_2        
	//*  26   31:goto            10
		return abyte2;
	//   27   34:aload           4
	//   28   36:areturn         
	}

	private static byte[] zzl(byte abyte0[])
	{
		byte abyte1[] = new byte[16];
	//    0    0:bipush          16
	//    1    2:newarray        byte[]
	//    2    4:astore          5
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore_2        
		int j;
		for(int i = 0; i < 15; i = j)
	//*   5    8:iconst_0        
	//*   6    9:istore_1        
	//*   7   10:iload_1         
	//*   8   11:bipush          15
	//*   9   13:icmpge          50
		{
			byte byte1 = abyte0[i];
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:baload          
	//   13   19:istore          4
			j = i + 1;
	//   14   21:iload_1         
	//   15   22:iconst_1        
	//   16   23:iadd            
	//   17   24:istore_3        
			abyte1[i] = (byte)(byte1 << 1 ^ (abyte0[j] & 0xff) >>> 7);
	//   18   25:aload           5
	//   19   27:iload_1         
	//   20   28:iload           4
	//   21   30:iconst_1        
	//   22   31:ishl            
	//   23   32:aload_0         
	//   24   33:iload_3         
	//   25   34:baload          
	//   26   35:sipush          255
	//   27   38:iand            
	//   28   39:bipush          7
	//   29   41:iushr           
	//   30   42:ixor            
	//   31   43:int2byte        
	//   32   44:bastore         
		}

	//   33   45:iload_3         
	//   34   46:istore_1        
	//*  35   47:goto            10
		byte byte0 = abyte0[15];
	//   36   50:aload_0         
	//   37   51:bipush          15
	//   38   53:baload          
	//   39   54:istore_3        
		char c;
		if((abyte0[0] & 0x80) == 0)
	//*  40   55:aload_0         
	//*  41   56:iconst_0        
	//*  42   57:baload          
	//*  43   58:sipush          128
	//*  44   61:iand            
	//*  45   62:ifne            70
			c = ((char) (flag));
	//   46   65:iload_2         
	//   47   66:istore_1        
		else
	//*  48   67:goto            74
			c = '\207';
	//   49   70:sipush          135
	//   50   73:istore_1        
		abyte1[15] = (byte)(byte0 << 1 ^ c);
	//   51   74:aload           5
	//   52   76:bipush          15
	//   53   78:iload_3         
	//   54   79:iconst_1        
	//   55   80:ishl            
	//   56   81:iload_1         
	//   57   82:ixor            
	//   58   83:int2byte        
	//   59   84:bastore         
		return abyte1;
	//   60   85:aload           5
	//   61   87:areturn         
	}

	public final byte[] zzc(byte abyte0[], byte abyte1[])
		throws GeneralSecurityException
	{
		if(abyte0.length > 0x7fffffff - zzdmz - 16)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:ldc1            #85  <Int 0x7fffffff>
	//*   3    4:aload_0         
	//*   4    5:getfield        #29  <Field int zzdmz>
	//*   5    8:isub            
	//*   6    9:bipush          16
	//*   7   11:isub            
	//*   8   12:icmple          25
			throw new GeneralSecurityException("plaintext too long");
	//    9   15:new             #17  <Class GeneralSecurityException>
	//   10   18:dup             
	//   11   19:ldc1            #87  <String "plaintext too long">
	//   12   21:invokespecial   #88  <Method void GeneralSecurityException(String)>
	//   13   24:athrow          
		int j = zzdmz;
	//   14   25:aload_0         
	//   15   26:getfield        #29  <Field int zzdmz>
	//   16   29:istore          4
		int i = 0;
	//   17   31:iconst_0        
	//   18   32:istore_3        
		byte abyte2[] = new byte[j + abyte0.length + 16];
	//   19   33:iload           4
	//   20   35:aload_1         
	//   21   36:arraylength     
	//   22   37:iadd            
	//   23   38:bipush          16
	//   24   40:iadd            
	//   25   41:newarray        byte[]
	//   26   43:astore          6
		byte abyte4[] = zzazl.zzbh(zzdmz);
	//   27   45:aload_0         
	//   28   46:getfield        #29  <Field int zzdmz>
	//   29   49:invokestatic    #94  <Method byte[] zzazl.zzbh(int)>
	//   30   52:astore          8
		System.arraycopy(((Object) (abyte4)), 0, ((Object) (abyte2)), 0, zzdmz);
	//   31   54:aload           8
	//   32   56:iconst_0        
	//   33   57:aload           6
	//   34   59:iconst_0        
	//   35   60:aload_0         
	//   36   61:getfield        #29  <Field int zzdmz>
	//   37   64:invokestatic    #100 <Method void System.arraycopy(Object, int, Object, int, int)>
		Cipher cipher = Cipher.getInstance("AES/ECB/NOPADDING");
	//   38   67:ldc1            #40  <String "AES/ECB/NOPADDING">
	//   39   69:invokestatic    #46  <Method Cipher Cipher.getInstance(String)>
	//   40   72:astore          7
		cipher.init(1, ((java.security.Key) (zzdmu)));
	//   41   74:aload           7
	//   42   76:iconst_1        
	//   43   77:aload_0         
	//   44   78:getfield        #38  <Field SecretKeySpec zzdmu>
	//   45   81:invokevirtual   #50  <Method void Cipher.init(int, java.security.Key)>
		abyte4 = zza(cipher, 0, abyte4, 0, abyte4.length);
	//   46   84:aload_0         
	//   47   85:aload           7
	//   48   87:iconst_0        
	//   49   88:aload           8
	//   50   90:iconst_0        
	//   51   91:aload           8
	//   52   93:arraylength     
	//   53   94:invokespecial   #102 <Method byte[] zza(Cipher, int, byte[], int, int)>
	//   54   97:astore          8
		if(abyte1 == null)
	//*  55   99:aload_2         
	//*  56  100:ifnonnull       110
			abyte1 = new byte[0];
	//   57  103:iconst_0        
	//   58  104:newarray        byte[]
	//   59  106:astore_2        
	//*  60  107:goto            110
		abyte1 = zza(cipher, 1, abyte1, 0, abyte1.length);
	//   61  110:aload_0         
	//   62  111:aload           7
	//   63  113:iconst_1        
	//   64  114:aload_2         
	//   65  115:iconst_0        
	//   66  116:aload_2         
	//   67  117:arraylength     
	//   68  118:invokespecial   #102 <Method byte[] zza(Cipher, int, byte[], int, int)>
	//   69  121:astore_2        
		Cipher cipher1 = Cipher.getInstance("AES/CTR/NOPADDING");
	//   70  122:ldc1            #104 <String "AES/CTR/NOPADDING">
	//   71  124:invokestatic    #46  <Method Cipher Cipher.getInstance(String)>
	//   72  127:astore          9
		cipher1.init(1, ((java.security.Key) (zzdmu)), ((java.security.spec.AlgorithmParameterSpec) (new IvParameterSpec(abyte4))));
	//   73  129:aload           9
	//   74  131:iconst_1        
	//   75  132:aload_0         
	//   76  133:getfield        #38  <Field SecretKeySpec zzdmu>
	//   77  136:new             #106 <Class IvParameterSpec>
	//   78  139:dup             
	//   79  140:aload           8
	//   80  142:invokespecial   #109 <Method void IvParameterSpec(byte[])>
	//   81  145:invokevirtual   #112 <Method void Cipher.init(int, java.security.Key, java.security.spec.AlgorithmParameterSpec)>
		cipher1.doFinal(abyte0, 0, abyte0.length, abyte2, zzdmz);
	//   82  148:aload           9
	//   83  150:aload_1         
	//   84  151:iconst_0        
	//   85  152:aload_1         
	//   86  153:arraylength     
	//   87  154:aload           6
	//   88  156:aload_0         
	//   89  157:getfield        #29  <Field int zzdmz>
	//   90  160:invokevirtual   #115 <Method int Cipher.doFinal(byte[], int, int, byte[], int)>
	//   91  163:pop             
		byte abyte3[] = zza(cipher, 2, abyte2, zzdmz, abyte0.length);
	//   92  164:aload_0         
	//   93  165:aload           7
	//   94  167:iconst_2        
	//   95  168:aload           6
	//   96  170:aload_0         
	//   97  171:getfield        #29  <Field int zzdmz>
	//   98  174:aload_1         
	//   99  175:arraylength     
	//  100  176:invokespecial   #102 <Method byte[] zza(Cipher, int, byte[], int, int)>
	//  101  179:astore          7
		j = abyte0.length;
	//  102  181:aload_1         
	//  103  182:arraylength     
	//  104  183:istore          4
		int k = zzdmz;
	//  105  185:aload_0         
	//  106  186:getfield        #29  <Field int zzdmz>
	//  107  189:istore          5
		for(; i < 16; i++)
	//* 108  191:iload_3         
	//* 109  192:bipush          16
	//* 110  194:icmpge          228
			abyte2[j + k + i] = (byte)(abyte1[i] ^ abyte4[i] ^ abyte3[i]);
	//  111  197:aload           6
	//  112  199:iload           4
	//  113  201:iload           5
	//  114  203:iadd            
	//  115  204:iload_3         
	//  116  205:iadd            
	//  117  206:aload_2         
	//  118  207:iload_3         
	//  119  208:baload          
	//  120  209:aload           8
	//  121  211:iload_3         
	//  122  212:baload          
	//  123  213:ixor            
	//  124  214:aload           7
	//  125  216:iload_3         
	//  126  217:baload          
	//  127  218:ixor            
	//  128  219:int2byte        
	//  129  220:bastore         

	//  130  221:iload_3         
	//  131  222:iconst_1        
	//  132  223:iadd            
	//  133  224:istore_3        
	//* 134  225:goto            191
		return abyte2;
	//  135  228:aload           6
	//  136  230:areturn         
	}

	private final SecretKeySpec zzdmu;
	private final byte zzdmx[];
	private final byte zzdmy[];
	private final int zzdmz;
}
