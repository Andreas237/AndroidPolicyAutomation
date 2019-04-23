// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			apv, apo

final class aor extends apv
{

	aor(byte abyte0[], int i)
	{
		super(abyte0, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #15  <Method void apv(byte[], int)>
	//    4    6:return          
	}

	private static void a(int ai[], int i, int j, int k, int l)
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
		ai[l] = a(ai[l] ^ ai[i], 16);
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
	//   20   23:invokestatic    #20  <Method int a(int, int)>
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
		ai[j] = a(ai[j] ^ ai[k], 12);
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
	//   42   49:invokestatic    #20  <Method int a(int, int)>
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
		ai[l] = a(ai[i] ^ i1, 8);
	//   58   69:aload_0         
	//   59   70:iload           4
	//   60   72:aload_0         
	//   61   73:iload_1         
	//   62   74:iaload          
	//   63   75:iload           5
	//   64   77:ixor            
	//   65   78:bipush          8
	//   66   80:invokestatic    #20  <Method int a(int, int)>
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
		ai[j] = a(ai[j] ^ ai[k], 7);
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
	//   88  106:invokestatic    #20  <Method int a(int, int)>
	//   89  109:iastore         
	//   90  110:return          
	}

	final int a()
	{
		return 12;
	//    0    0:bipush          12
	//    1    2:ireturn         
	}

	final ByteBuffer a(byte abyte0[], int i)
	{
		int ai[] = new int[16];
	//    0    0:bipush          16
	//    1    2:newarray        int[]
	//    2    4:astore_3        
		System.arraycopy(((Object) (apv.a)), 0, ((Object) (ai)), 0, a.length);
	//    3    5:getstatic       #25  <Field int[] apv.a>
	//    4    8:iconst_0        
	//    5    9:aload_3         
	//    6   10:iconst_0        
	//    7   11:getstatic       #26  <Field int[] a>
	//    8   14:arraylength     
	//    9   15:invokestatic    #32  <Method void System.arraycopy(Object, int, Object, int, int)>
		int ai1[] = a(ByteBuffer.wrap(b.a()));
	//   10   18:aload_0         
	//   11   19:getfield        #36  <Field apo b>
	//   12   22:invokevirtual   #41  <Method byte[] apo.a()>
	//   13   25:invokestatic    #47  <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//   14   28:invokestatic    #50  <Method int[] a(ByteBuffer)>
	//   15   31:astore          4
		System.arraycopy(((Object) (ai1)), 0, ((Object) (ai)), 4, ai1.length);
	//   16   33:aload           4
	//   17   35:iconst_0        
	//   18   36:aload_3         
	//   19   37:iconst_4        
	//   20   38:aload           4
	//   21   40:arraylength     
	//   22   41:invokestatic    #32  <Method void System.arraycopy(Object, int, Object, int, int)>
		ai[12] = i;
	//   23   44:aload_3         
	//   24   45:bipush          12
	//   25   47:iload_2         
	//   26   48:iastore         
		System.arraycopy(((Object) (a(ByteBuffer.wrap(abyte0)))), 0, ((Object) (ai)), 13, 3);
	//   27   49:aload_1         
	//   28   50:invokestatic    #47  <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//   29   53:invokestatic    #50  <Method int[] a(ByteBuffer)>
	//   30   56:iconst_0        
	//   31   57:aload_3         
	//   32   58:bipush          13
	//   33   60:iconst_3        
	//   34   61:invokestatic    #32  <Method void System.arraycopy(Object, int, Object, int, int)>
		abyte0 = ((byte []) ((int[])((int []) (ai)).clone()));
	//   35   64:aload_3         
	//   36   65:invokevirtual   #55  <Method Object _5B_I.clone()>
	//   37   68:checkcast       #51  <Class int[]>
	//   38   71:astore_1        
		for(i = 0; i < 10; i++)
	//*  39   72:iconst_0        
	//*  40   73:istore_2        
	//*  41   74:iload_2         
	//*  42   75:bipush          10
	//*  43   77:icmpge          171
		{
			a(((int []) (abyte0)), 0, 4, 8, 12);
	//   44   80:aload_1         
	//   45   81:iconst_0        
	//   46   82:iconst_4        
	//   47   83:bipush          8
	//   48   85:bipush          12
	//   49   87:invokestatic    #57  <Method void a(int[], int, int, int, int)>
			a(((int []) (abyte0)), 1, 5, 9, 13);
	//   50   90:aload_1         
	//   51   91:iconst_1        
	//   52   92:iconst_5        
	//   53   93:bipush          9
	//   54   95:bipush          13
	//   55   97:invokestatic    #57  <Method void a(int[], int, int, int, int)>
			a(((int []) (abyte0)), 2, 6, 10, 14);
	//   56  100:aload_1         
	//   57  101:iconst_2        
	//   58  102:bipush          6
	//   59  104:bipush          10
	//   60  106:bipush          14
	//   61  108:invokestatic    #57  <Method void a(int[], int, int, int, int)>
			a(((int []) (abyte0)), 3, 7, 11, 15);
	//   62  111:aload_1         
	//   63  112:iconst_3        
	//   64  113:bipush          7
	//   65  115:bipush          11
	//   66  117:bipush          15
	//   67  119:invokestatic    #57  <Method void a(int[], int, int, int, int)>
			a(((int []) (abyte0)), 0, 5, 10, 15);
	//   68  122:aload_1         
	//   69  123:iconst_0        
	//   70  124:iconst_5        
	//   71  125:bipush          10
	//   72  127:bipush          15
	//   73  129:invokestatic    #57  <Method void a(int[], int, int, int, int)>
			a(((int []) (abyte0)), 1, 6, 11, 12);
	//   74  132:aload_1         
	//   75  133:iconst_1        
	//   76  134:bipush          6
	//   77  136:bipush          11
	//   78  138:bipush          12
	//   79  140:invokestatic    #57  <Method void a(int[], int, int, int, int)>
			a(((int []) (abyte0)), 2, 7, 8, 13);
	//   80  143:aload_1         
	//   81  144:iconst_2        
	//   82  145:bipush          7
	//   83  147:bipush          8
	//   84  149:bipush          13
	//   85  151:invokestatic    #57  <Method void a(int[], int, int, int, int)>
			a(((int []) (abyte0)), 3, 4, 9, 14);
	//   86  154:aload_1         
	//   87  155:iconst_3        
	//   88  156:iconst_4        
	//   89  157:bipush          9
	//   90  159:bipush          14
	//   91  161:invokestatic    #57  <Method void a(int[], int, int, int, int)>
		}

	//   92  164:iload_2         
	//   93  165:iconst_1        
	//   94  166:iadd            
	//   95  167:istore_2        
	//*  96  168:goto            74
		for(i = 0; i < 16; i++)
	//*  97  171:iconst_0        
	//*  98  172:istore_2        
	//*  99  173:iload_2         
	//* 100  174:bipush          16
	//* 101  176:icmpge          196
			ai[i] = ai[i] + abyte0[i];
	//  102  179:aload_3         
	//  103  180:iload_2         
	//  104  181:aload_3         
	//  105  182:iload_2         
	//  106  183:iaload          
	//  107  184:aload_1         
	//  108  185:iload_2         
	//  109  186:iaload          
	//  110  187:iadd            
	//  111  188:iastore         

	//  112  189:iload_2         
	//  113  190:iconst_1        
	//  114  191:iadd            
	//  115  192:istore_2        
	//* 116  193:goto            173
		abyte0 = ((byte []) (ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN)));
	//  117  196:bipush          64
	//  118  198:invokestatic    #61  <Method ByteBuffer ByteBuffer.allocate(int)>
	//  119  201:getstatic       #67  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//  120  204:invokevirtual   #71  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//  121  207:astore_1        
		((ByteBuffer) (abyte0)).asIntBuffer().put(ai, 0, 16);
	//  122  208:aload_1         
	//  123  209:invokevirtual   #75  <Method IntBuffer ByteBuffer.asIntBuffer()>
	//  124  212:aload_3         
	//  125  213:iconst_0        
	//  126  214:bipush          16
	//  127  216:invokevirtual   #81  <Method IntBuffer IntBuffer.put(int[], int, int)>
	//  128  219:pop             
		return ((ByteBuffer) (abyte0));
	//  129  220:aload_1         
	//  130  221:areturn         
	}

	private static final byte c[] = new byte[16];

	static 
	{
	//    0    0:bipush          16
	//    1    2:newarray        byte[]
	//    2    4:putstatic       #10  <Field byte[] c>
	//*   3    7:return          
	}
}
