// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ais, apy, aps

public final class aoo
	implements ais
{

	public aoo(byte abyte0[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		if(i != 12 && i != 16)
	//*   2    4:iload_2         
	//*   3    5:bipush          12
	//*   4    7:icmpeq          29
	//*   5   10:iload_2         
	//*   6   11:bipush          16
	//*   7   13:icmpne          19
	//*   8   16:goto            29
		{
			throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
	//    9   19:new             #20  <Class IllegalArgumentException>
	//   10   22:dup             
	//   11   23:ldc1            #22  <String "IV size should be either 12 or 16 bytes">
	//   12   25:invokespecial   #25  <Method void IllegalArgumentException(String)>
	//   13   28:athrow          
		} else
		{
			d = i;
	//   14   29:aload_0         
	//   15   30:iload_2         
	//   16   31:putfield        #27  <Field int d>
			apy.a(abyte0.length);
	//   17   34:aload_1         
	//   18   35:arraylength     
	//   19   36:invokestatic    #32  <Method void apy.a(int)>
			c = new SecretKeySpec(abyte0, "AES");
	//   20   39:aload_0         
	//   21   40:new             #34  <Class SecretKeySpec>
	//   22   43:dup             
	//   23   44:aload_1         
	//   24   45:ldc1            #36  <String "AES">
	//   25   47:invokespecial   #39  <Method void SecretKeySpec(byte[], String)>
	//   26   50:putfield        #41  <Field SecretKeySpec c>
			abyte0 = ((byte []) (Cipher.getInstance("AES/ECB/NOPADDING")));
	//   27   53:ldc1            #43  <String "AES/ECB/NOPADDING">
	//   28   55:invokestatic    #49  <Method Cipher Cipher.getInstance(String)>
	//   29   58:astore_1        
			((Cipher) (abyte0)).init(1, ((java.security.Key) (c)));
	//   30   59:aload_1         
	//   31   60:iconst_1        
	//   32   61:aload_0         
	//   33   62:getfield        #41  <Field SecretKeySpec c>
	//   34   65:invokevirtual   #53  <Method void Cipher.init(int, java.security.Key)>
			a = a(((Cipher) (abyte0)).doFinal(new byte[16]));
	//   35   68:aload_0         
	//   36   69:aload_1         
	//   37   70:bipush          16
	//   38   72:newarray        byte[]
	//   39   74:invokevirtual   #57  <Method byte[] Cipher.doFinal(byte[])>
	//   40   77:invokestatic    #59  <Method byte[] a(byte[])>
	//   41   80:putfield        #61  <Field byte[] a>
			b = a(a);
	//   42   83:aload_0         
	//   43   84:aload_0         
	//   44   85:getfield        #61  <Field byte[] a>
	//   45   88:invokestatic    #59  <Method byte[] a(byte[])>
	//   46   91:putfield        #63  <Field byte[] b>
			return;
	//   47   94:return          
		}
	}

	private final byte[] a(Cipher cipher, int i, byte abyte0[], int j, int k)
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
	//*   9   15:ifne            32
			return cipher.doFinal(b(abyte1, a));
	//   10   18:aload_1         
	//   11   19:aload           8
	//   12   21:aload_0         
	//   13   22:getfield        #61  <Field byte[] a>
	//   14   25:invokestatic    #68  <Method byte[] b(byte[], byte[])>
	//   15   28:invokevirtual   #57  <Method byte[] Cipher.doFinal(byte[])>
	//   16   31:areturn         
		abyte1 = cipher.doFinal(abyte1);
	//   17   32:aload_1         
	//   18   33:aload           8
	//   19   35:invokevirtual   #57  <Method byte[] Cipher.doFinal(byte[])>
	//   20   38:astore          8
		boolean flag = false;
	//   21   40:iconst_0        
	//   22   41:istore          7
		for(i = 0; k - i > 16; i += 16)
	//*  23   43:iconst_0        
	//*  24   44:istore_2        
	//*  25   45:iload           5
	//*  26   47:iload_2         
	//*  27   48:isub            
	//*  28   49:bipush          16
	//*  29   51:icmple          110
		{
			for(int l = 0; l < 16; l++)
	//*  30   54:iconst_0        
	//*  31   55:istore          6
	//*  32   57:iload           6
	//*  33   59:bipush          16
	//*  34   61:icmpge          94
				abyte1[l] = (byte)(abyte1[l] ^ abyte0[j + i + l]);
	//   35   64:aload           8
	//   36   66:iload           6
	//   37   68:aload           8
	//   38   70:iload           6
	//   39   72:baload          
	//   40   73:aload_3         
	//   41   74:iload           4
	//   42   76:iload_2         
	//   43   77:iadd            
	//   44   78:iload           6
	//   45   80:iadd            
	//   46   81:baload          
	//   47   82:ixor            
	//   48   83:int2byte        
	//   49   84:bastore         

	//   50   85:iload           6
	//   51   87:iconst_1        
	//   52   88:iadd            
	//   53   89:istore          6
	//*  54   91:goto            57
			abyte1 = cipher.doFinal(abyte1);
	//   55   94:aload_1         
	//   56   95:aload           8
	//   57   97:invokevirtual   #57  <Method byte[] Cipher.doFinal(byte[])>
	//   58  100:astore          8
		}

	//   59  102:iload_2         
	//   60  103:bipush          16
	//   61  105:iadd            
	//   62  106:istore_2        
	//*  63  107:goto            45
		byte abyte2[] = Arrays.copyOfRange(abyte0, i + j, j + k);
	//   64  110:aload_3         
	//   65  111:iload_2         
	//   66  112:iload           4
	//   67  114:iadd            
	//   68  115:iload           4
	//   69  117:iload           5
	//   70  119:iadd            
	//   71  120:invokestatic    #74  <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   72  123:astore          9
		if(abyte2.length == 16)
	//*  73  125:aload           9
	//*  74  127:arraylength     
	//*  75  128:bipush          16
	//*  76  130:icmpne          146
		{
			abyte0 = b(abyte2, a);
	//   77  133:aload           9
	//   78  135:aload_0         
	//   79  136:getfield        #61  <Field byte[] a>
	//   80  139:invokestatic    #68  <Method byte[] b(byte[], byte[])>
	//   81  142:astore_3        
		} else
	//*  82  143:goto            200
		{
			abyte0 = Arrays.copyOf(b, 16);
	//   83  146:aload_0         
	//   84  147:getfield        #63  <Field byte[] b>
	//   85  150:bipush          16
	//   86  152:invokestatic    #78  <Method byte[] Arrays.copyOf(byte[], int)>
	//   87  155:astore_3        
			for(i = ((int) (flag)); i < abyte2.length; i++)
	//*  88  156:iload           7
	//*  89  158:istore_2        
	//*  90  159:iload_2         
	//*  91  160:aload           9
	//*  92  162:arraylength     
	//*  93  163:icmpge          185
				abyte0[i] = (byte)(abyte0[i] ^ abyte2[i]);
	//   94  166:aload_3         
	//   95  167:iload_2         
	//   96  168:aload_3         
	//   97  169:iload_2         
	//   98  170:baload          
	//   99  171:aload           9
	//  100  173:iload_2         
	//  101  174:baload          
	//  102  175:ixor            
	//  103  176:int2byte        
	//  104  177:bastore         

	//  105  178:iload_2         
	//  106  179:iconst_1        
	//  107  180:iadd            
	//  108  181:istore_2        
	//* 109  182:goto            159
			abyte0[abyte2.length] = (byte)(abyte0[abyte2.length] ^ 0x80);
	//  110  185:aload_3         
	//  111  186:aload           9
	//  112  188:arraylength     
	//  113  189:aload_3         
	//  114  190:aload           9
	//  115  192:arraylength     
	//  116  193:baload          
	//  117  194:sipush          128
	//  118  197:ixor            
	//  119  198:int2byte        
	//  120  199:bastore         
		}
		return cipher.doFinal(b(abyte1, abyte0));
	//  121  200:aload_1         
	//  122  201:aload           8
	//  123  203:aload_3         
	//  124  204:invokestatic    #68  <Method byte[] b(byte[], byte[])>
	//  125  207:invokevirtual   #57  <Method byte[] Cipher.doFinal(byte[])>
	//  126  210:areturn         
	}

	private static byte[] a(byte abyte0[])
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
		char c1;
		if((abyte0[0] & 0x80) == 0)
	//*  40   55:aload_0         
	//*  41   56:iconst_0        
	//*  42   57:baload          
	//*  43   58:sipush          128
	//*  44   61:iand            
	//*  45   62:ifne            70
			c1 = ((char) (flag));
	//   46   65:iload_2         
	//   47   66:istore_1        
		else
	//*  48   67:goto            74
			c1 = '\207';
	//   49   70:sipush          135
	//   50   73:istore_1        
		abyte1[15] = (byte)(byte0 << 1 ^ c1);
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

	private static byte[] b(byte abyte0[], byte abyte1[])
	{
		int j = abyte0.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_3        
		byte abyte2[] = new byte[j];
	//    3    3:iload_3         
	//    4    4:newarray        byte[]
	//    5    6:astore          4
		for(int i = 0; i < j; i++)
	//*   6    8:iconst_0        
	//*   7    9:istore_2        
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

	public final byte[] a(byte abyte0[], byte abyte1[])
	{
		int i = abyte0.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		int k = d;
	//    3    3:aload_0         
	//    4    4:getfield        #27  <Field int d>
	//    5    7:istore          4
		if(i <= 0x7fffffff - k - 16)
	//*   6    9:iload_3         
	//*   7   10:ldc1            #79  <Int 0x7fffffff>
	//*   8   12:iload           4
	//*   9   14:isub            
	//*  10   15:bipush          16
	//*  11   17:isub            
	//*  12   18:icmpgt          223
		{
			byte abyte2[] = new byte[abyte0.length + k + 16];
	//   13   21:aload_1         
	//   14   22:arraylength     
	//   15   23:iload           4
	//   16   25:iadd            
	//   17   26:bipush          16
	//   18   28:iadd            
	//   19   29:newarray        byte[]
	//   20   31:astore          6
			byte abyte4[] = aps.a(k);
	//   21   33:iload           4
	//   22   35:invokestatic    #84  <Method byte[] aps.a(int)>
	//   23   38:astore          8
			k = d;
	//   24   40:aload_0         
	//   25   41:getfield        #27  <Field int d>
	//   26   44:istore          4
			int j = 0;
	//   27   46:iconst_0        
	//   28   47:istore_3        
			System.arraycopy(((Object) (abyte4)), 0, ((Object) (abyte2)), 0, k);
	//   29   48:aload           8
	//   30   50:iconst_0        
	//   31   51:aload           6
	//   32   53:iconst_0        
	//   33   54:iload           4
	//   34   56:invokestatic    #90  <Method void System.arraycopy(Object, int, Object, int, int)>
			Cipher cipher = Cipher.getInstance("AES/ECB/NOPADDING");
	//   35   59:ldc1            #43  <String "AES/ECB/NOPADDING">
	//   36   61:invokestatic    #49  <Method Cipher Cipher.getInstance(String)>
	//   37   64:astore          7
			cipher.init(1, ((java.security.Key) (c)));
	//   38   66:aload           7
	//   39   68:iconst_1        
	//   40   69:aload_0         
	//   41   70:getfield        #41  <Field SecretKeySpec c>
	//   42   73:invokevirtual   #53  <Method void Cipher.init(int, java.security.Key)>
			abyte4 = a(cipher, 0, abyte4, 0, abyte4.length);
	//   43   76:aload_0         
	//   44   77:aload           7
	//   45   79:iconst_0        
	//   46   80:aload           8
	//   47   82:iconst_0        
	//   48   83:aload           8
	//   49   85:arraylength     
	//   50   86:invokespecial   #92  <Method byte[] a(Cipher, int, byte[], int, int)>
	//   51   89:astore          8
			if(abyte1 == null)
	//*  52   91:aload_2         
	//*  53   92:ifnonnull       102
				abyte1 = new byte[0];
	//   54   95:iconst_0        
	//   55   96:newarray        byte[]
	//   56   98:astore_2        
	//*  57   99:goto            102
			abyte1 = a(cipher, 1, abyte1, 0, abyte1.length);
	//   58  102:aload_0         
	//   59  103:aload           7
	//   60  105:iconst_1        
	//   61  106:aload_2         
	//   62  107:iconst_0        
	//   63  108:aload_2         
	//   64  109:arraylength     
	//   65  110:invokespecial   #92  <Method byte[] a(Cipher, int, byte[], int, int)>
	//   66  113:astore_2        
			Cipher cipher1 = Cipher.getInstance("AES/CTR/NOPADDING");
	//   67  114:ldc1            #94  <String "AES/CTR/NOPADDING">
	//   68  116:invokestatic    #49  <Method Cipher Cipher.getInstance(String)>
	//   69  119:astore          9
			cipher1.init(1, ((java.security.Key) (c)), ((java.security.spec.AlgorithmParameterSpec) (new IvParameterSpec(abyte4))));
	//   70  121:aload           9
	//   71  123:iconst_1        
	//   72  124:aload_0         
	//   73  125:getfield        #41  <Field SecretKeySpec c>
	//   74  128:new             #96  <Class IvParameterSpec>
	//   75  131:dup             
	//   76  132:aload           8
	//   77  134:invokespecial   #99  <Method void IvParameterSpec(byte[])>
	//   78  137:invokevirtual   #102 <Method void Cipher.init(int, java.security.Key, java.security.spec.AlgorithmParameterSpec)>
			cipher1.doFinal(abyte0, 0, abyte0.length, abyte2, d);
	//   79  140:aload           9
	//   80  142:aload_1         
	//   81  143:iconst_0        
	//   82  144:aload_1         
	//   83  145:arraylength     
	//   84  146:aload           6
	//   85  148:aload_0         
	//   86  149:getfield        #27  <Field int d>
	//   87  152:invokevirtual   #105 <Method int Cipher.doFinal(byte[], int, int, byte[], int)>
	//   88  155:pop             
			byte abyte3[] = a(cipher, 2, abyte2, d, abyte0.length);
	//   89  156:aload_0         
	//   90  157:aload           7
	//   91  159:iconst_2        
	//   92  160:aload           6
	//   93  162:aload_0         
	//   94  163:getfield        #27  <Field int d>
	//   95  166:aload_1         
	//   96  167:arraylength     
	//   97  168:invokespecial   #92  <Method byte[] a(Cipher, int, byte[], int, int)>
	//   98  171:astore          7
			k = abyte0.length;
	//   99  173:aload_1         
	//  100  174:arraylength     
	//  101  175:istore          4
			int l = d;
	//  102  177:aload_0         
	//  103  178:getfield        #27  <Field int d>
	//  104  181:istore          5
			for(; j < 16; j++)
	//* 105  183:iload_3         
	//* 106  184:bipush          16
	//* 107  186:icmpge          220
				abyte2[k + l + j] = (byte)(abyte1[j] ^ abyte4[j] ^ abyte3[j]);
	//  108  189:aload           6
	//  109  191:iload           4
	//  110  193:iload           5
	//  111  195:iadd            
	//  112  196:iload_3         
	//  113  197:iadd            
	//  114  198:aload_2         
	//  115  199:iload_3         
	//  116  200:baload          
	//  117  201:aload           8
	//  118  203:iload_3         
	//  119  204:baload          
	//  120  205:ixor            
	//  121  206:aload           7
	//  122  208:iload_3         
	//  123  209:baload          
	//  124  210:ixor            
	//  125  211:int2byte        
	//  126  212:bastore         

	//  127  213:iload_3         
	//  128  214:iconst_1        
	//  129  215:iadd            
	//  130  216:istore_3        
	//* 131  217:goto            183
			return abyte2;
	//  132  220:aload           6
	//  133  222:areturn         
		} else
		{
			throw new GeneralSecurityException("plaintext too long");
	//  134  223:new             #107 <Class GeneralSecurityException>
	//  135  226:dup             
	//  136  227:ldc1            #109 <String "plaintext too long">
	//  137  229:invokespecial   #110 <Method void GeneralSecurityException(String)>
	//  138  232:athrow          
		}
	}

	private final byte a[];
	private final byte b[];
	private final SecretKeySpec c;
	private final int d;
}
