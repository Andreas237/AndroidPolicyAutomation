// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.*;
import java.security.InvalidKeyException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzazn, zzazh

final class zzayl extends zzazn
{

	zzayl(byte abyte0[], int i)
		throws InvalidKeyException
	{
		super(abyte0, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #17  <Method void zzazn(byte[], int)>
	//    4    6:return          
	}

	private static void zza(int ai[], int i, int j, int k, int l)
	{
		ai[i] = ai[i] + ai[j];
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:iaload          
	//    5    5:aload_0         
	//    6    6:iload_2         
	//    7    7:iaload          
	//    8    8:iadd            
	//    9    9:iastore         
		ai[l] = rotateLeft(ai[l] ^ ai[i], 16);
	//   10   10:aload_0         
	//   11   11:iload           4
	//   12   13:aload_0         
	//   13   14:iload           4
	//   14   16:iaload          
	//   15   17:aload_0         
	//   16   18:iload_1         
	//   17   19:iaload          
	//   18   20:ixor            
	//   19   21:bipush          16
	//   20   23:invokestatic    #24  <Method int rotateLeft(int, int)>
	//   21   26:iastore         
		ai[k] = ai[k] + ai[l];
	//   22   27:aload_0         
	//   23   28:iload_3         
	//   24   29:aload_0         
	//   25   30:iload_3         
	//   26   31:iaload          
	//   27   32:aload_0         
	//   28   33:iload           4
	//   29   35:iaload          
	//   30   36:iadd            
	//   31   37:iastore         
		ai[j] = rotateLeft(ai[j] ^ ai[k], 12);
	//   32   38:aload_0         
	//   33   39:iload_2         
	//   34   40:aload_0         
	//   35   41:iload_2         
	//   36   42:iaload          
	//   37   43:aload_0         
	//   38   44:iload_3         
	//   39   45:iaload          
	//   40   46:ixor            
	//   41   47:bipush          12
	//   42   49:invokestatic    #24  <Method int rotateLeft(int, int)>
	//   43   52:iastore         
		ai[i] = ai[i] + ai[j];
	//   44   53:aload_0         
	//   45   54:iload_1         
	//   46   55:aload_0         
	//   47   56:iload_1         
	//   48   57:iaload          
	//   49   58:aload_0         
	//   50   59:iload_2         
	//   51   60:iaload          
	//   52   61:iadd            
	//   53   62:iastore         
		int i1 = ai[l];
	//   54   63:aload_0         
	//   55   64:iload           4
	//   56   66:iaload          
	//   57   67:istore          5
		ai[l] = rotateLeft(ai[i] ^ i1, 8);
	//   58   69:aload_0         
	//   59   70:iload           4
	//   60   72:aload_0         
	//   61   73:iload_1         
	//   62   74:iaload          
	//   63   75:iload           5
	//   64   77:ixor            
	//   65   78:bipush          8
	//   66   80:invokestatic    #24  <Method int rotateLeft(int, int)>
	//   67   83:iastore         
		ai[k] = ai[k] + ai[l];
	//   68   84:aload_0         
	//   69   85:iload_3         
	//   70   86:aload_0         
	//   71   87:iload_3         
	//   72   88:iaload          
	//   73   89:aload_0         
	//   74   90:iload           4
	//   75   92:iaload          
	//   76   93:iadd            
	//   77   94:iastore         
		ai[j] = rotateLeft(ai[j] ^ ai[k], 7);
	//   78   95:aload_0         
	//   79   96:iload_2         
	//   80   97:aload_0         
	//   81   98:iload_2         
	//   82   99:iaload          
	//   83  100:aload_0         
	//   84  101:iload_3         
	//   85  102:iaload          
	//   86  103:ixor            
	//   87  104:bipush          7
	//   88  106:invokestatic    #24  <Method int rotateLeft(int, int)>
	//   89  109:iastore         
	//   90  110:return          
	}

	final int zzaao()
	{
		return 12;
	//    0    0:bipush          12
	//    1    2:ireturn         
	}

	final ByteBuffer zzb(byte abyte0[], int i)
	{
		int ai[] = new int[16];
	//    0    0:bipush          16
	//    1    2:newarray        int[]
	//    2    4:astore          4
		System.arraycopy(((Object) (zzazn.zzdoo)), 0, ((Object) (ai)), 0, zzdoo.length);
	//    3    6:getstatic       #32  <Field int[] zzazn.zzdoo>
	//    4    9:iconst_0        
	//    5   10:aload           4
	//    6   12:iconst_0        
	//    7   13:getstatic       #33  <Field int[] zzdoo>
	//    8   16:arraylength     
	//    9   17:invokestatic    #39  <Method void System.arraycopy(Object, int, Object, int, int)>
		int ai1[] = zza(ByteBuffer.wrap(zzdop.getBytes()));
	//   10   20:aload_0         
	//   11   21:getfield        #43  <Field zzazh zzdop>
	//   12   24:invokevirtual   #49  <Method byte[] zzazh.getBytes()>
	//   13   27:invokestatic    #55  <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//   14   30:invokestatic    #58  <Method int[] zza(ByteBuffer)>
	//   15   33:astore          5
		System.arraycopy(((Object) (ai1)), 0, ((Object) (ai)), 4, ai1.length);
	//   16   35:aload           5
	//   17   37:iconst_0        
	//   18   38:aload           4
	//   19   40:iconst_4        
	//   20   41:aload           5
	//   21   43:arraylength     
	//   22   44:invokestatic    #39  <Method void System.arraycopy(Object, int, Object, int, int)>
		ai[12] = i;
	//   23   47:aload           4
	//   24   49:bipush          12
	//   25   51:iload_2         
	//   26   52:iastore         
		System.arraycopy(((Object) (zza(ByteBuffer.wrap(abyte0)))), 0, ((Object) (ai)), 13, 3);
	//   27   53:aload_1         
	//   28   54:invokestatic    #55  <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//   29   57:invokestatic    #58  <Method int[] zza(ByteBuffer)>
	//   30   60:iconst_0        
	//   31   61:aload           4
	//   32   63:bipush          13
	//   33   65:iconst_3        
	//   34   66:invokestatic    #39  <Method void System.arraycopy(Object, int, Object, int, int)>
		abyte0 = ((byte []) ((int[])((int []) (ai)).clone()));
	//   35   69:aload           4
	//   36   71:invokevirtual   #63  <Method Object _5B_I.clone()>
	//   37   74:checkcast       #59  <Class int[]>
	//   38   77:astore_1        
		for(i = 0; i < 10; i++)
	//*  39   78:iconst_0        
	//*  40   79:istore_2        
	//*  41   80:iload_2         
	//*  42   81:bipush          10
	//*  43   83:icmpge          177
		{
			zza(((int []) (abyte0)), 0, 4, 8, 12);
	//   44   86:aload_1         
	//   45   87:iconst_0        
	//   46   88:iconst_4        
	//   47   89:bipush          8
	//   48   91:bipush          12
	//   49   93:invokestatic    #65  <Method void zza(int[], int, int, int, int)>
			zza(((int []) (abyte0)), 1, 5, 9, 13);
	//   50   96:aload_1         
	//   51   97:iconst_1        
	//   52   98:iconst_5        
	//   53   99:bipush          9
	//   54  101:bipush          13
	//   55  103:invokestatic    #65  <Method void zza(int[], int, int, int, int)>
			zza(((int []) (abyte0)), 2, 6, 10, 14);
	//   56  106:aload_1         
	//   57  107:iconst_2        
	//   58  108:bipush          6
	//   59  110:bipush          10
	//   60  112:bipush          14
	//   61  114:invokestatic    #65  <Method void zza(int[], int, int, int, int)>
			zza(((int []) (abyte0)), 3, 7, 11, 15);
	//   62  117:aload_1         
	//   63  118:iconst_3        
	//   64  119:bipush          7
	//   65  121:bipush          11
	//   66  123:bipush          15
	//   67  125:invokestatic    #65  <Method void zza(int[], int, int, int, int)>
			zza(((int []) (abyte0)), 0, 5, 10, 15);
	//   68  128:aload_1         
	//   69  129:iconst_0        
	//   70  130:iconst_5        
	//   71  131:bipush          10
	//   72  133:bipush          15
	//   73  135:invokestatic    #65  <Method void zza(int[], int, int, int, int)>
			zza(((int []) (abyte0)), 1, 6, 11, 12);
	//   74  138:aload_1         
	//   75  139:iconst_1        
	//   76  140:bipush          6
	//   77  142:bipush          11
	//   78  144:bipush          12
	//   79  146:invokestatic    #65  <Method void zza(int[], int, int, int, int)>
			zza(((int []) (abyte0)), 2, 7, 8, 13);
	//   80  149:aload_1         
	//   81  150:iconst_2        
	//   82  151:bipush          7
	//   83  153:bipush          8
	//   84  155:bipush          13
	//   85  157:invokestatic    #65  <Method void zza(int[], int, int, int, int)>
			zza(((int []) (abyte0)), 3, 4, 9, 14);
	//   86  160:aload_1         
	//   87  161:iconst_3        
	//   88  162:iconst_4        
	//   89  163:bipush          9
	//   90  165:bipush          14
	//   91  167:invokestatic    #65  <Method void zza(int[], int, int, int, int)>
		}

	//   92  170:iload_2         
	//   93  171:iconst_1        
	//   94  172:iadd            
	//   95  173:istore_2        
	//*  96  174:goto            80
		byte byte0 = 16;
	//   97  177:bipush          16
	//   98  179:istore_3        
		for(i = 0; i < byte0; byte0 = 16)
	//*  99  180:iconst_0        
	//* 100  181:istore_2        
	//* 101  182:iload_2         
	//* 102  183:iload_3         
	//* 103  184:icmpge          209
		{
			ai[i] = ai[i] + abyte0[i];
	//  104  187:aload           4
	//  105  189:iload_2         
	//  106  190:aload           4
	//  107  192:iload_2         
	//  108  193:iaload          
	//  109  194:aload_1         
	//  110  195:iload_2         
	//  111  196:iaload          
	//  112  197:iadd            
	//  113  198:iastore         
			i++;
	//  114  199:iload_2         
	//  115  200:iconst_1        
	//  116  201:iadd            
	//  117  202:istore_2        
		}

	//  118  203:bipush          16
	//  119  205:istore_3        
	//* 120  206:goto            182
		abyte0 = ((byte []) (ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN)));
	//  121  209:bipush          64
	//  122  211:invokestatic    #69  <Method ByteBuffer ByteBuffer.allocate(int)>
	//  123  214:getstatic       #75  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//  124  217:invokevirtual   #79  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//  125  220:astore_1        
		((ByteBuffer) (abyte0)).asIntBuffer().put(ai, 0, 16);
	//  126  221:aload_1         
	//  127  222:invokevirtual   #83  <Method IntBuffer ByteBuffer.asIntBuffer()>
	//  128  225:aload           4
	//  129  227:iconst_0        
	//  130  228:bipush          16
	//  131  230:invokevirtual   #89  <Method IntBuffer IntBuffer.put(int[], int, int)>
	//  132  233:pop             
		return ((ByteBuffer) (abyte0));
	//  133  234:aload_1         
	//  134  235:areturn         
	}

	private static final byte zzdnb[] = new byte[16];

	static 
	{
	//    0    0:bipush          16
	//    1    2:newarray        byte[]
	//    2    4:putstatic       #10  <Field byte[] zzdnb>
	//*   3    7:return          
	}
}
