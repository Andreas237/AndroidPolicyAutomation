// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.util.Pair;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bnn, bnf

public final class bng
{

	private static int a(bnn bnn1)
	{
		int j = bnn1.a(5);
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:invokevirtual   #31  <Method int bnn.a(int)>
	//    3    5:istore_2        
		int i = j;
	//    4    6:iload_2         
	//    5    7:istore_1        
		if(j == 31)
	//*   6    8:iload_2         
	//*   7    9:bipush          31
	//*   8   11:icmpne          24
			i = bnn1.a(6) + 32;
	//    9   14:aload_0         
	//   10   15:bipush          6
	//   11   17:invokevirtual   #31  <Method int bnn.a(int)>
	//   12   20:bipush          32
	//   13   22:iadd            
	//   14   23:istore_1        
		return i;
	//   15   24:iload_1         
	//   16   25:ireturn         
	}

	public static Pair a(byte abyte0[])
	{
		int i;
		int j;
label0:
		{
			abyte0 = ((byte []) (new bnn(abyte0)));
	//    0    0:new             #28  <Class bnn>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #36  <Method void bnn(byte[])>
	//    4    8:astore_0        
			int l = a(((bnn) (abyte0)));
	//    5    9:aload_0         
	//    6   10:invokestatic    #38  <Method int a(bnn)>
	//    7   13:istore          4
			i = b(((bnn) (abyte0)));
	//    8   15:aload_0         
	//    9   16:invokestatic    #40  <Method int b(bnn)>
	//   10   19:istore_1        
			int k = ((bnn) (abyte0)).a(4);
	//   11   20:aload_0         
	//   12   21:iconst_4        
	//   13   22:invokevirtual   #31  <Method int bnn.a(int)>
	//   14   25:istore_3        
			if(l != 5)
	//*  15   26:iload           4
	//*  16   28:iconst_5        
	//*  17   29:icmpeq          41
			{
				j = k;
	//   18   32:iload_3         
	//   19   33:istore_2        
				if(l != 29)
					break label0;
	//   20   34:iload           4
	//   21   36:bipush          29
	//   22   38:icmpne          70
			}
			l = b(((bnn) (abyte0)));
	//   23   41:aload_0         
	//   24   42:invokestatic    #40  <Method int b(bnn)>
	//   25   45:istore          4
			i = l;
	//   26   47:iload           4
	//   27   49:istore_1        
			j = k;
	//   28   50:iload_3         
	//   29   51:istore_2        
			if(a(((bnn) (abyte0))) == 22)
	//*  30   52:aload_0         
	//*  31   53:invokestatic    #38  <Method int a(bnn)>
	//*  32   56:bipush          22
	//*  33   58:icmpne          70
			{
				j = ((bnn) (abyte0)).a(4);
	//   34   61:aload_0         
	//   35   62:iconst_4        
	//   36   63:invokevirtual   #31  <Method int bnn.a(int)>
	//   37   66:istore_2        
				i = l;
	//   38   67:iload           4
	//   39   69:istore_1        
			}
		}
		j = c[j];
	//   40   70:getstatic       #24  <Field int[] c>
	//   41   73:iload_2         
	//   42   74:iaload          
	//   43   75:istore_2        
		boolean flag;
		if(j != -1)
	//*  44   76:iload_2         
	//*  45   77:iconst_m1       
	//*  46   78:icmpeq          87
			flag = true;
	//   47   81:iconst_1        
	//   48   82:istore          5
		else
	//*  49   84:goto            90
			flag = false;
	//   50   87:iconst_0        
	//   51   88:istore          5
		bnf.a(flag);
	//   52   90:iload           5
	//   53   92:invokestatic    #45  <Method void bnf.a(boolean)>
		return Pair.create(((Object) (Integer.valueOf(i))), ((Object) (Integer.valueOf(j))));
	//   54   95:iload_1         
	//   55   96:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//   56   99:iload_2         
	//   57  100:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//   58  103:invokestatic    #57  <Method Pair Pair.create(Object, Object)>
	//   59  106:areturn         
	}

	public static byte[] a(byte abyte0[], int i, int j)
	{
		byte abyte1[] = a;
	//    0    0:getstatic       #15  <Field byte[] a>
	//    1    3:astore_3        
		byte abyte2[] = new byte[abyte1.length + j];
	//    2    4:aload_3         
	//    3    5:arraylength     
	//    4    6:iload_2         
	//    5    7:iadd            
	//    6    8:newarray        byte[]
	//    7   10:astore          4
		System.arraycopy(((Object) (abyte1)), 0, ((Object) (abyte2)), 0, abyte1.length);
	//    8   12:aload_3         
	//    9   13:iconst_0        
	//   10   14:aload           4
	//   11   16:iconst_0        
	//   12   17:aload_3         
	//   13   18:arraylength     
	//   14   19:invokestatic    #64  <Method void System.arraycopy(Object, int, Object, int, int)>
		System.arraycopy(((Object) (abyte0)), i, ((Object) (abyte2)), a.length, j);
	//   15   22:aload_0         
	//   16   23:iload_1         
	//   17   24:aload           4
	//   18   26:getstatic       #15  <Field byte[] a>
	//   19   29:arraylength     
	//   20   30:iload_2         
	//   21   31:invokestatic    #64  <Method void System.arraycopy(Object, int, Object, int, int)>
		return abyte2;
	//   22   34:aload           4
	//   23   36:areturn         
	}

	private static int b(bnn bnn1)
	{
		int i = bnn1.a(4);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:invokevirtual   #31  <Method int bnn.a(int)>
	//    3    5:istore_1        
		if(i == 15)
	//*   4    6:iload_1         
	//*   5    7:bipush          15
	//*   6    9:icmpne          19
			return bnn1.a(24);
	//    7   12:aload_0         
	//    8   13:bipush          24
	//    9   15:invokevirtual   #31  <Method int bnn.a(int)>
	//   10   18:ireturn         
		boolean flag;
		if(i < 13)
	//*  11   19:iload_1         
	//*  12   20:bipush          13
	//*  13   22:icmpge          30
			flag = true;
	//   14   25:iconst_1        
	//   15   26:istore_2        
		else
	//*  16   27:goto            32
			flag = false;
	//   17   30:iconst_0        
	//   18   31:istore_2        
		bnf.a(flag);
	//   19   32:iload_2         
	//   20   33:invokestatic    #45  <Method void bnf.a(boolean)>
		return b[i];
	//   21   36:getstatic       #22  <Field int[] b>
	//   22   39:iload_1         
	//   23   40:iaload          
	//   24   41:ireturn         
	}

	private static final byte a[] = {
		0, 0, 0, 1
	};
	private static final int b[] = {
		0x17700, 0x15888, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 
		11025, 8000, 7350
	};
	private static final int c[] = {
		0, 1, 2, 3, 4, 5, 6, 8, -1, -1, 
		-1, 7, 8, -1, 8, -1
	};

	static 
	{
	//    0    0:iconst_4        
	//    1    1:newarray        byte[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #12  <Int 0>
	//    5    7:bastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:ldc1            #12  <Int 0>
	//    9   12:bastore         
	//   10   13:dup             
	//   11   14:iconst_2        
	//   12   15:ldc1            #12  <Int 0>
	//   13   17:bastore         
	//   14   18:dup             
	//   15   19:iconst_3        
	//   16   20:ldc1            #13  <Int 1>
	//   17   22:bastore         
	//   18   23:putstatic       #15  <Field byte[] a>
	//   19   26:bipush          13
	//   20   28:newarray        int[]
	//   21   30:dup             
	//   22   31:iconst_0        
	//   23   32:ldc1            #16  <Int 0x17700>
	//   24   34:iastore         
	//   25   35:dup             
	//   26   36:iconst_1        
	//   27   37:ldc1            #17  <Int 0x15888>
	//   28   39:iastore         
	//   29   40:dup             
	//   30   41:iconst_2        
	//   31   42:ldc1            #18  <Int 64000>
	//   32   44:iastore         
	//   33   45:dup             
	//   34   46:iconst_3        
	//   35   47:ldc1            #19  <Int 48000>
	//   36   49:iastore         
	//   37   50:dup             
	//   38   51:iconst_4        
	//   39   52:ldc1            #20  <Int 44100>
	//   40   54:iastore         
	//   41   55:dup             
	//   42   56:iconst_5        
	//   43   57:sipush          32000
	//   44   60:iastore         
	//   45   61:dup             
	//   46   62:bipush          6
	//   47   64:sipush          24000
	//   48   67:iastore         
	//   49   68:dup             
	//   50   69:bipush          7
	//   51   71:sipush          22050
	//   52   74:iastore         
	//   53   75:dup             
	//   54   76:bipush          8
	//   55   78:sipush          16000
	//   56   81:iastore         
	//   57   82:dup             
	//   58   83:bipush          9
	//   59   85:sipush          12000
	//   60   88:iastore         
	//   61   89:dup             
	//   62   90:bipush          10
	//   63   92:sipush          11025
	//   64   95:iastore         
	//   65   96:dup             
	//   66   97:bipush          11
	//   67   99:sipush          8000
	//   68  102:iastore         
	//   69  103:dup             
	//   70  104:bipush          12
	//   71  106:sipush          7350
	//   72  109:iastore         
	//   73  110:putstatic       #22  <Field int[] b>
	//   74  113:bipush          16
	//   75  115:newarray        int[]
	//   76  117:dup             
	//   77  118:iconst_0        
	//   78  119:iconst_0        
	//   79  120:iastore         
	//   80  121:dup             
	//   81  122:iconst_1        
	//   82  123:iconst_1        
	//   83  124:iastore         
	//   84  125:dup             
	//   85  126:iconst_2        
	//   86  127:iconst_2        
	//   87  128:iastore         
	//   88  129:dup             
	//   89  130:iconst_3        
	//   90  131:iconst_3        
	//   91  132:iastore         
	//   92  133:dup             
	//   93  134:iconst_4        
	//   94  135:iconst_4        
	//   95  136:iastore         
	//   96  137:dup             
	//   97  138:iconst_5        
	//   98  139:iconst_5        
	//   99  140:iastore         
	//  100  141:dup             
	//  101  142:bipush          6
	//  102  144:bipush          6
	//  103  146:iastore         
	//  104  147:dup             
	//  105  148:bipush          7
	//  106  150:bipush          8
	//  107  152:iastore         
	//  108  153:dup             
	//  109  154:bipush          8
	//  110  156:iconst_m1       
	//  111  157:iastore         
	//  112  158:dup             
	//  113  159:bipush          9
	//  114  161:iconst_m1       
	//  115  162:iastore         
	//  116  163:dup             
	//  117  164:bipush          10
	//  118  166:iconst_m1       
	//  119  167:iastore         
	//  120  168:dup             
	//  121  169:bipush          11
	//  122  171:bipush          7
	//  123  173:iastore         
	//  124  174:dup             
	//  125  175:bipush          12
	//  126  177:bipush          8
	//  127  179:iastore         
	//  128  180:dup             
	//  129  181:bipush          13
	//  130  183:iconst_m1       
	//  131  184:iastore         
	//  132  185:dup             
	//  133  186:bipush          14
	//  134  188:bipush          8
	//  135  190:iastore         
	//  136  191:dup             
	//  137  192:bipush          15
	//  138  194:iconst_m1       
	//  139  195:iastore         
	//  140  196:putstatic       #24  <Field int[] c>
	//* 141  199:return          
	}
}
