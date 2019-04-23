// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bfo, bml, bnw

public final class bfk
	implements bfo
{

	public bfk(bml bml1, long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		b = bml1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field bml b>
		d = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #30  <Field long d>
		c = l1;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #32  <Field long c>
		e = new byte[0x10000];
	//   11   20:aload_0         
	//   12   21:ldc1            #33  <Int 0x10000>
	//   13   23:newarray        byte[]
	//   14   25:putfield        #35  <Field byte[] e>
	//   15   28:return          
	}

	private final int a(byte abyte0[], int i, int j, int k, boolean flag)
	{
		if(!Thread.interrupted())
	//*   0    0:invokestatic    #42  <Method boolean Thread.interrupted()>
	//*   1    3:ifne            55
		{
			i = b.a(abyte0, i + k, j - k);
	//    2    6:aload_0         
	//    3    7:getfield        #28  <Field bml b>
	//    4   10:aload_1         
	//    5   11:iload_2         
	//    6   12:iload           4
	//    7   14:iadd            
	//    8   15:iload_3         
	//    9   16:iload           4
	//   10   18:isub            
	//   11   19:invokeinterface #47  <Method int bml.a(byte[], int, int)>
	//   12   24:istore_2        
			if(i == -1)
	//*  13   25:iload_2         
	//*  14   26:iconst_m1       
	//*  15   27:icmpne          50
			{
				if(k == 0 && flag)
	//*  16   30:iload           4
	//*  17   32:ifne            42
	//*  18   35:iload           5
	//*  19   37:ifeq            42
					return -1;
	//   20   40:iconst_m1       
	//   21   41:ireturn         
				else
					throw new EOFException();
	//   22   42:new             #49  <Class EOFException>
	//   23   45:dup             
	//   24   46:invokespecial   #50  <Method void EOFException()>
	//   25   49:athrow          
			} else
			{
				return k + i;
	//   26   50:iload           4
	//   27   52:iload_2         
	//   28   53:iadd            
	//   29   54:ireturn         
			}
		} else
		{
			throw new InterruptedException();
	//   30   55:new             #52  <Class InterruptedException>
	//   31   58:dup             
	//   32   59:invokespecial   #53  <Method void InterruptedException()>
	//   33   62:athrow          
		}
	}

	private final boolean a(int i, boolean flag)
	{
		int j = f + i;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int f>
	//    2    4:iload_1         
	//    3    5:iadd            
	//    4    6:istore_3        
		byte abyte0[] = e;
	//    5    7:aload_0         
	//    6    8:getfield        #35  <Field byte[] e>
	//    7   11:astore          5
		if(j > abyte0.length)
	//*   8   13:iload_3         
	//*   9   14:aload           5
	//*  10   16:arraylength     
	//*  11   17:icmple          49
		{
			j = bnw.a(abyte0.length << 1, 0x10000 + j, j + 0x80000);
	//   12   20:aload           5
	//   13   22:arraylength     
	//   14   23:iconst_1        
	//   15   24:ishl            
	//   16   25:ldc1            #33  <Int 0x10000>
	//   17   27:iload_3         
	//   18   28:iadd            
	//   19   29:iload_3         
	//   20   30:ldc1            #57  <Int 0x80000>
	//   21   32:iadd            
	//   22   33:invokestatic    #62  <Method int bnw.a(int, int, int)>
	//   23   36:istore_3        
			e = Arrays.copyOf(e, j);
	//   24   37:aload_0         
	//   25   38:aload_0         
	//   26   39:getfield        #35  <Field byte[] e>
	//   27   42:iload_3         
	//   28   43:invokestatic    #68  <Method byte[] Arrays.copyOf(byte[], int)>
	//   29   46:putfield        #35  <Field byte[] e>
		}
		for(int k = Math.min(g - f, i); k < i;)
	//*  30   49:aload_0         
	//*  31   50:getfield        #70  <Field int g>
	//*  32   53:aload_0         
	//*  33   54:getfield        #56  <Field int f>
	//*  34   57:isub            
	//*  35   58:iload_1         
	//*  36   59:invokestatic    #76  <Method int Math.min(int, int)>
	//*  37   62:istore_3        
	//*  38   63:iload_3         
	//*  39   64:iload_1         
	//*  40   65:icmpge          96
		{
			int l = a(e, f, i, k, false);
	//   41   68:aload_0         
	//   42   69:aload_0         
	//   43   70:getfield        #35  <Field byte[] e>
	//   44   73:aload_0         
	//   45   74:getfield        #56  <Field int f>
	//   46   77:iload_1         
	//   47   78:iload_3         
	//   48   79:iconst_0        
	//   49   80:invokespecial   #78  <Method int a(byte[], int, int, int, boolean)>
	//   50   83:istore          4
			k = l;
	//   51   85:iload           4
	//   52   87:istore_3        
			if(l == -1)
	//*  53   88:iload           4
	//*  54   90:iconst_m1       
	//*  55   91:icmpne          63
				return false;
	//   56   94:iconst_0        
	//   57   95:ireturn         
		}

		f = f + i;
	//   58   96:aload_0         
	//   59   97:aload_0         
	//   60   98:getfield        #56  <Field int f>
	//   61  101:iload_1         
	//   62  102:iadd            
	//   63  103:putfield        #56  <Field int f>
		g = Math.max(g, f);
	//   64  106:aload_0         
	//   65  107:aload_0         
	//   66  108:getfield        #70  <Field int g>
	//   67  111:aload_0         
	//   68  112:getfield        #56  <Field int f>
	//   69  115:invokestatic    #81  <Method int Math.max(int, int)>
	//   70  118:putfield        #70  <Field int g>
		return true;
	//   71  121:iconst_1        
	//   72  122:ireturn         
	}

	private final int d(int i)
	{
		i = Math.min(g, i);
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field int g>
	//    2    4:iload_1         
	//    3    5:invokestatic    #76  <Method int Math.min(int, int)>
	//    4    8:istore_1        
		e(i);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:invokespecial   #85  <Method void e(int)>
		return i;
	//    8   14:iload_1         
	//    9   15:ireturn         
	}

	private final int d(byte abyte0[], int i, int j)
	{
		int k = g;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field int g>
	//    2    4:istore          4
		if(k == 0)
	//*   3    6:iload           4
	//*   4    8:ifne            13
		{
			return 0;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		} else
		{
			j = Math.min(k, j);
	//    7   13:iload           4
	//    8   15:iload_3         
	//    9   16:invokestatic    #76  <Method int Math.min(int, int)>
	//   10   19:istore_3        
			System.arraycopy(((Object) (e)), 0, ((Object) (abyte0)), i, j);
	//   11   20:aload_0         
	//   12   21:getfield        #35  <Field byte[] e>
	//   13   24:iconst_0        
	//   14   25:aload_1         
	//   15   26:iload_2         
	//   16   27:iload_3         
	//   17   28:invokestatic    #91  <Method void System.arraycopy(Object, int, Object, int, int)>
			e(j);
	//   18   31:aload_0         
	//   19   32:iload_3         
	//   20   33:invokespecial   #85  <Method void e(int)>
			return j;
	//   21   36:iload_3         
	//   22   37:ireturn         
		}
	}

	private final void e(int i)
	{
		g = g - i;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #70  <Field int g>
	//    3    5:iload_1         
	//    4    6:isub            
	//    5    7:putfield        #70  <Field int g>
		f = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #56  <Field int f>
		byte abyte1[] = e;
	//    9   15:aload_0         
	//   10   16:getfield        #35  <Field byte[] e>
	//   11   19:astore          4
		int j = g;
	//   12   21:aload_0         
	//   13   22:getfield        #70  <Field int g>
	//   14   25:istore_2        
		byte abyte0[] = abyte1;
	//   15   26:aload           4
	//   16   28:astore_3        
		if(j < abyte1.length - 0x80000)
	//*  17   29:iload_2         
	//*  18   30:aload           4
	//*  19   32:arraylength     
	//*  20   33:ldc1            #57  <Int 0x80000>
	//*  21   35:isub            
	//*  22   36:icmpge          46
			abyte0 = new byte[j + 0x10000];
	//   23   39:iload_2         
	//   24   40:ldc1            #33  <Int 0x10000>
	//   25   42:iadd            
	//   26   43:newarray        byte[]
	//   27   45:astore_3        
		System.arraycopy(((Object) (e)), i, ((Object) (abyte0)), 0, g);
	//   28   46:aload_0         
	//   29   47:getfield        #35  <Field byte[] e>
	//   30   50:iload_1         
	//   31   51:aload_3         
	//   32   52:iconst_0        
	//   33   53:aload_0         
	//   34   54:getfield        #70  <Field int g>
	//   35   57:invokestatic    #91  <Method void System.arraycopy(Object, int, Object, int, int)>
		e = abyte0;
	//   36   60:aload_0         
	//   37   61:aload_3         
	//   38   62:putfield        #35  <Field byte[] e>
	//   39   65:return          
	}

	private final void f(int i)
	{
		if(i != -1)
	//*   0    0:iload_1         
	//*   1    1:iconst_m1       
	//*   2    2:icmpeq          16
			d = d + (long)i;
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #30  <Field long d>
	//    6   10:iload_1         
	//    7   11:i2l             
	//    8   12:ladd            
	//    9   13:putfield        #30  <Field long d>
	//   10   16:return          
	}

	public final int a(int i)
	{
		int k = d(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #93  <Method int d(int)>
	//    3    5:istore_3        
		int j = k;
	//    4    6:iload_3         
	//    5    7:istore_2        
		if(k == 0)
	//*   6    8:iload_3         
	//*   7    9:ifne            34
		{
			byte abyte0[] = a;
	//    8   12:getstatic       #21  <Field byte[] a>
	//    9   15:astore          4
			j = a(abyte0, 0, Math.min(i, abyte0.length), 0, true);
	//   10   17:aload_0         
	//   11   18:aload           4
	//   12   20:iconst_0        
	//   13   21:iload_1         
	//   14   22:aload           4
	//   15   24:arraylength     
	//   16   25:invokestatic    #76  <Method int Math.min(int, int)>
	//   17   28:iconst_0        
	//   18   29:iconst_1        
	//   19   30:invokespecial   #78  <Method int a(byte[], int, int, int, boolean)>
	//   20   33:istore_2        
		}
		f(j);
	//   21   34:aload_0         
	//   22   35:iload_2         
	//   23   36:invokespecial   #95  <Method void f(int)>
		return j;
	//   24   39:iload_2         
	//   25   40:ireturn         
	}

	public final int a(byte abyte0[], int i, int j)
	{
		int l = d(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #97  <Method int d(byte[], int, int)>
	//    5    7:istore          5
		int k = l;
	//    6    9:iload           5
	//    7   11:istore          4
		if(l == 0)
	//*   8   13:iload           5
	//*   9   15:ifne            29
			k = a(abyte0, i, j, 0, true);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:iload_2         
	//   13   21:iload_3         
	//   14   22:iconst_0        
	//   15   23:iconst_1        
	//   16   24:invokespecial   #78  <Method int a(byte[], int, int, int, boolean)>
	//   17   27:istore          4
		f(k);
	//   18   29:aload_0         
	//   19   30:iload           4
	//   20   32:invokespecial   #95  <Method void f(int)>
		return k;
	//   21   35:iload           4
	//   22   37:ireturn         
	}

	public final void a()
	{
		f = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #56  <Field int f>
	//    3    5:return          
	}

	public final boolean a(byte abyte0[], int i, int j, boolean flag)
	{
		int k;
		for(k = d(abyte0, i, j); k < j && k != -1; k = a(abyte0, i, j, k, flag));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #97  <Method int d(byte[], int, int)>
	//    5    7:istore          5
	//    6    9:iload           5
	//    7   11:iload_3         
	//    8   12:icmpge          37
	//    9   15:iload           5
	//   10   17:iconst_m1       
	//   11   18:icmpeq          37
	//   12   21:aload_0         
	//   13   22:aload_1         
	//   14   23:iload_2         
	//   15   24:iload_3         
	//   16   25:iload           5
	//   17   27:iload           4
	//   18   29:invokespecial   #78  <Method int a(byte[], int, int, int, boolean)>
	//   19   32:istore          5
	//*  20   34:goto            9
		f(k);
	//   21   37:aload_0         
	//   22   38:iload           5
	//   23   40:invokespecial   #95  <Method void f(int)>
		return k != -1;
	//   24   43:iload           5
	//   25   45:iconst_m1       
	//   26   46:icmpeq          51
	//   27   49:iconst_1        
	//   28   50:ireturn         
	//   29   51:iconst_0        
	//   30   52:ireturn         
	}

	public final long b()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field long d>
	//    2    4:lreturn         
	}

	public final void b(int i)
	{
		int j;
		byte abyte0[];
		for(j = d(i); j < i && j != -1; j = a(abyte0, -j, Math.min(i, abyte0.length + j), j, false))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:invokespecial   #93  <Method int d(int)>
	//*   3    5:istore_2        
	//*   4    6:iload_2         
	//*   5    7:iload_1         
	//*   6    8:icmpge          41
	//*   7   11:iload_2         
	//*   8   12:iconst_m1       
	//*   9   13:icmpeq          41
			abyte0 = a;
	//   10   16:getstatic       #21  <Field byte[] a>
	//   11   19:astore_3        

	//   12   20:aload_0         
	//   13   21:aload_3         
	//   14   22:iload_2         
	//   15   23:ineg            
	//   16   24:iload_1         
	//   17   25:aload_3         
	//   18   26:arraylength     
	//   19   27:iload_2         
	//   20   28:iadd            
	//   21   29:invokestatic    #76  <Method int Math.min(int, int)>
	//   22   32:iload_2         
	//   23   33:iconst_0        
	//   24   34:invokespecial   #78  <Method int a(byte[], int, int, int, boolean)>
	//   25   37:istore_2        
	//*  26   38:goto            6
		f(j);
	//   27   41:aload_0         
	//   28   42:iload_2         
	//   29   43:invokespecial   #95  <Method void f(int)>
	//   30   46:return          
	}

	public final void b(byte abyte0[], int i, int j)
	{
		a(abyte0, i, j, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #102 <Method boolean a(byte[], int, int, boolean)>
	//    6    8:pop             
	//    7    9:return          
	}

	public final long c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field long c>
	//    2    4:lreturn         
	}

	public final void c(int i)
	{
		a(i, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #104 <Method boolean a(int, boolean)>
	//    4    6:pop             
	//    5    7:return          
	}

	public final void c(byte abyte0[], int i, int j)
	{
		if(a(j, false))
	//*   0    0:aload_0         
	//*   1    1:iload_3         
	//*   2    2:iconst_0        
	//*   3    3:invokespecial   #104 <Method boolean a(int, boolean)>
	//*   4    6:ifeq            25
			System.arraycopy(((Object) (e)), f - j, ((Object) (abyte0)), i, j);
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field byte[] e>
	//    7   13:aload_0         
	//    8   14:getfield        #56  <Field int f>
	//    9   17:iload_3         
	//   10   18:isub            
	//   11   19:aload_1         
	//   12   20:iload_2         
	//   13   21:iload_3         
	//   14   22:invokestatic    #91  <Method void System.arraycopy(Object, int, Object, int, int)>
	//   15   25:return          
	}

	private static final byte a[] = new byte[4096];
	private final bml b;
	private final long c;
	private long d;
	private byte e[];
	private int f;
	private int g;

	static 
	{
	//    0    0:sipush          4096
	//    1    3:newarray        byte[]
	//    2    5:putstatic       #21  <Field byte[] a>
	//*   3    8:return          
	}
}
