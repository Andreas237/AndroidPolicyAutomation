// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bfo

final class bgi
{

	public bgi()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:bipush          8
	//    4    7:newarray        byte[]
	//    5    9:putfield        #35  <Field byte[] b>
	//    6   12:return          
	}

	public static int a(int i)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		do
		{
			long al[] = a;
	//    2    2:getstatic       #29  <Field long[] a>
	//    3    5:astore_2        
			if(j < al.length)
	//*   4    6:iload_1         
	//*   5    7:aload_2         
	//*   6    8:arraylength     
	//*   7    9:icmpge          34
			{
				if((al[j] & (long)i) != 0L)
	//*   8   12:aload_2         
	//*   9   13:iload_1         
	//*  10   14:laload          
	//*  11   15:iload_0         
	//*  12   16:i2l             
	//*  13   17:land            
	//*  14   18:lconst_0        
	//*  15   19:lcmp            
	//*  16   20:ifeq            27
					return j + 1;
	//   17   23:iload_1         
	//   18   24:iconst_1        
	//   19   25:iadd            
	//   20   26:ireturn         
				j++;
	//   21   27:iload_1         
	//   22   28:iconst_1        
	//   23   29:iadd            
	//   24   30:istore_1        
			} else
	//*  25   31:goto            2
			{
				return -1;
	//   26   34:iconst_m1       
	//   27   35:ireturn         
			}
		} while(true);
	}

	public static long a(byte abyte0[], int i, boolean flag)
	{
		long l1 = (long)abyte0[0] & 255L;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:baload          
	//    3    3:i2l             
	//    4    4:ldc2w           #38  <Long 255L>
	//    5    7:land            
	//    6    8:lstore          6
		long l = l1;
	//    7   10:lload           6
	//    8   12:lstore          4
		if(flag)
	//*   9   14:iload_2         
	//*  10   15:ifeq            34
			l = l1 & ~a[i - 1];
	//   11   18:lload           6
	//   12   20:getstatic       #29  <Field long[] a>
	//   13   23:iload_1         
	//   14   24:iconst_1        
	//   15   25:isub            
	//   16   26:laload          
	//   17   27:ldc2w           #40  <Long -1L>
	//   18   30:lxor            
	//   19   31:land            
	//   20   32:lstore          4
		for(int j = 1; j < i; j++)
	//*  21   34:iconst_1        
	//*  22   35:istore_3        
	//*  23   36:iload_3         
	//*  24   37:iload_1         
	//*  25   38:icmpge          64
			l = l << 8 | (long)abyte0[j] & 255L;
	//   26   41:lload           4
	//   27   43:bipush          8
	//   28   45:lshl            
	//   29   46:aload_0         
	//   30   47:iload_3         
	//   31   48:baload          
	//   32   49:i2l             
	//   33   50:ldc2w           #38  <Long 255L>
	//   34   53:land            
	//   35   54:lor             
	//   36   55:lstore          4

	//   37   57:iload_3         
	//   38   58:iconst_1        
	//   39   59:iadd            
	//   40   60:istore_3        
	//*  41   61:goto            36
		return l;
	//   42   64:lload           4
	//   43   66:lreturn         
	}

	public final long a(bfo bfo1, boolean flag, boolean flag1, int i)
	{
		if(c == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field int c>
	//*   2    4:ifne            70
		{
			if(!bfo1.a(b, 0, 1, flag))
	//*   3    7:aload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #35  <Field byte[] b>
	//*   6   12:iconst_0        
	//*   7   13:iconst_1        
	//*   8   14:iload_2         
	//*   9   15:invokeinterface #49  <Method boolean bfo.a(byte[], int, int, boolean)>
	//*  10   20:ifne            27
				return -1L;
	//   11   23:ldc2w           #40  <Long -1L>
	//   12   26:lreturn         
			d = a(b[0] & 0xff);
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #35  <Field byte[] b>
	//   16   32:iconst_0        
	//   17   33:baload          
	//   18   34:sipush          255
	//   19   37:iand            
	//   20   38:invokestatic    #51  <Method int a(int)>
	//   21   41:putfield        #53  <Field int d>
			if(d != -1)
	//*  22   44:aload_0         
	//*  23   45:getfield        #53  <Field int d>
	//*  24   48:iconst_m1       
	//*  25   49:icmpeq          60
				c = 1;
	//   26   52:aload_0         
	//   27   53:iconst_1        
	//   28   54:putfield        #44  <Field int c>
			else
	//*  29   57:goto            70
				throw new IllegalStateException("No valid varint length mask found");
	//   30   60:new             #55  <Class IllegalStateException>
	//   31   63:dup             
	//   32   64:ldc1            #57  <String "No valid varint length mask found">
	//   33   66:invokespecial   #60  <Method void IllegalStateException(String)>
	//   34   69:athrow          
		}
		int j = d;
	//   35   70:aload_0         
	//   36   71:getfield        #53  <Field int d>
	//   37   74:istore          5
		if(j > i)
	//*  38   76:iload           5
	//*  39   78:iload           4
	//*  40   80:icmple          92
		{
			c = 0;
	//   41   83:aload_0         
	//   42   84:iconst_0        
	//   43   85:putfield        #44  <Field int c>
			return -2L;
	//   44   88:ldc2w           #61  <Long -2L>
	//   45   91:lreturn         
		}
		if(j != 1)
	//*  46   92:iload           5
	//*  47   94:iconst_1        
	//*  48   95:icmpeq          113
			bfo1.b(b, 1, j - 1);
	//   49   98:aload_1         
	//   50   99:aload_0         
	//   51  100:getfield        #35  <Field byte[] b>
	//   52  103:iconst_1        
	//   53  104:iload           5
	//   54  106:iconst_1        
	//   55  107:isub            
	//   56  108:invokeinterface #65  <Method void bfo.b(byte[], int, int)>
		c = 0;
	//   57  113:aload_0         
	//   58  114:iconst_0        
	//   59  115:putfield        #44  <Field int c>
		return a(b, d, flag1);
	//   60  118:aload_0         
	//   61  119:getfield        #35  <Field byte[] b>
	//   62  122:aload_0         
	//   63  123:getfield        #53  <Field int d>
	//   64  126:iload_3         
	//   65  127:invokestatic    #67  <Method long a(byte[], int, boolean)>
	//   66  130:lreturn         
	}

	public final void a()
	{
		c = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #44  <Field int c>
		d = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #53  <Field int d>
	//    6   10:return          
	}

	public final int b()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field int d>
	//    2    4:ireturn         
	}

	private static final long a[] = {
		128L, 64L, 32L, 16L, 8L, 4L, 2L, 1L
	};
	private final byte b[] = new byte[8];
	private int c;
	private int d;

	static 
	{
	//    0    0:bipush          8
	//    1    2:newarray        long[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc2w           #14  <Long 128L>
	//    5    9:lastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc2w           #16  <Long 64L>
	//    9   15:lastore         
	//   10   16:dup             
	//   11   17:iconst_2        
	//   12   18:ldc2w           #18  <Long 32L>
	//   13   21:lastore         
	//   14   22:dup             
	//   15   23:iconst_3        
	//   16   24:ldc2w           #20  <Long 16L>
	//   17   27:lastore         
	//   18   28:dup             
	//   19   29:iconst_4        
	//   20   30:ldc2w           #22  <Long 8L>
	//   21   33:lastore         
	//   22   34:dup             
	//   23   35:iconst_5        
	//   24   36:ldc2w           #24  <Long 4L>
	//   25   39:lastore         
	//   26   40:dup             
	//   27   41:bipush          6
	//   28   43:ldc2w           #26  <Long 2L>
	//   29   46:lastore         
	//   30   47:dup             
	//   31   48:bipush          7
	//   32   50:lconst_1        
	//   33   51:lastore         
	//   34   52:putstatic       #29  <Field long[] a>
	//*  35   55:return          
	}
}
