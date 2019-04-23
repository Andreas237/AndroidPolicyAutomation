// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bnf

public final class bno
{

	public bno()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public bno(int i1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = new byte[i1];
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:newarray        byte[]
	//    5    8:putfield        #17  <Field byte[] a>
		c = i1;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:putfield        #19  <Field int c>
	//    9   16:return          
	}

	public bno(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = abyte0;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field byte[] a>
		c = abyte0.length;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:arraylength     
	//    8   12:putfield        #19  <Field int c>
	//    9   15:return          
	}

	public final void a()
	{
		b = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #22  <Field int b>
		c = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #19  <Field int c>
	//    6   10:return          
	}

	public final void a(int i1)
	{
		byte abyte0[];
		if(e() < i1)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #26  <Method int e()>
	//*   2    4:iload_1         
	//*   3    5:icmpge          15
			abyte0 = new byte[i1];
	//    4    8:iload_1         
	//    5    9:newarray        byte[]
	//    6   11:astore_2        
		else
	//*   7   12:goto            20
			abyte0 = a;
	//    8   15:aload_0         
	//    9   16:getfield        #17  <Field byte[] a>
	//   10   19:astore_2        
		a(abyte0, i1);
	//   11   20:aload_0         
	//   12   21:aload_2         
	//   13   22:iload_1         
	//   14   23:invokevirtual   #29  <Method void a(byte[], int)>
	//   15   26:return          
	}

	public final void a(byte abyte0[], int i1)
	{
		a = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field byte[] a>
		c = i1;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #19  <Field int c>
		b = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #22  <Field int b>
	//    9   15:return          
	}

	public final void a(byte abyte0[], int i1, int j1)
	{
		System.arraycopy(((Object) (a)), b, ((Object) (abyte0)), i1, j1);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] a>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field int b>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:invokestatic    #36  <Method void System.arraycopy(Object, int, Object, int, int)>
		b = b + j1;
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field int b>
	//   11   19:iload_3         
	//   12   20:iadd            
	//   13   21:putfield        #22  <Field int b>
	//   14   24:return          
	}

	public final int b()
	{
		return c - b;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int c>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field int b>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	public final void b(int i1)
	{
		boolean flag;
		if(i1 >= 0 && i1 <= a.length)
	//*   0    0:iload_1         
	//*   1    1:iflt            18
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #17  <Field byte[] a>
	//*   5    9:arraylength     
	//*   6   10:icmpgt          18
			flag = true;
	//    7   13:iconst_1        
	//    8   14:istore_2        
		else
	//*   9   15:goto            20
			flag = false;
	//   10   18:iconst_0        
	//   11   19:istore_2        
		bnf.a(flag);
	//   12   20:iload_2         
	//   13   21:invokestatic    #41  <Method void bnf.a(boolean)>
		c = i1;
	//   14   24:aload_0         
	//   15   25:iload_1         
	//   16   26:putfield        #19  <Field int c>
	//   17   29:return          
	}

	public final int c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int c>
	//    2    4:ireturn         
	}

	public final void c(int i1)
	{
		boolean flag;
		if(i1 >= 0 && i1 <= c)
	//*   0    0:iload_1         
	//*   1    1:iflt            17
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #19  <Field int c>
	//*   5    9:icmpgt          17
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_2        
		else
	//*   8   14:goto            19
			flag = false;
	//    9   17:iconst_0        
	//   10   18:istore_2        
		bnf.a(flag);
	//   11   19:iload_2         
	//   12   20:invokestatic    #41  <Method void bnf.a(boolean)>
		b = i1;
	//   13   23:aload_0         
	//   14   24:iload_1         
	//   15   25:putfield        #22  <Field int b>
	//   16   28:return          
	}

	public final int d()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int b>
	//    2    4:ireturn         
	}

	public final void d(int i1)
	{
		c(b + i1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field int b>
	//    3    5:iload_1         
	//    4    6:iadd            
	//    5    7:invokevirtual   #44  <Method void c(int)>
	//    6   10:return          
	}

	public final int e()
	{
		byte abyte0[] = a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] a>
	//    2    4:astore_1        
		if(abyte0 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return abyte0.length;
	//    7   11:aload_1         
	//    8   12:arraylength     
	//    9   13:ireturn         
	}

	public final String e(int i1)
	{
		if(i1 == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            7
			return "";
	//    2    4:ldc1            #47  <String "">
	//    3    6:areturn         
		int j1 = (b + i1) - 1;
	//    4    7:aload_0         
	//    5    8:getfield        #22  <Field int b>
	//    6   11:iload_1         
	//    7   12:iadd            
	//    8   13:iconst_1        
	//    9   14:isub            
	//   10   15:istore_2        
		if(j1 < c && a[j1] == 0)
	//*  11   16:iload_2         
	//*  12   17:aload_0         
	//*  13   18:getfield        #19  <Field int c>
	//*  14   21:icmpge          40
	//*  15   24:aload_0         
	//*  16   25:getfield        #17  <Field byte[] a>
	//*  17   28:iload_2         
	//*  18   29:baload          
	//*  19   30:ifne            40
			j1 = i1 - 1;
	//   20   33:iload_1         
	//   21   34:iconst_1        
	//   22   35:isub            
	//   23   36:istore_2        
		else
	//*  24   37:goto            42
			j1 = i1;
	//   25   40:iload_1         
	//   26   41:istore_2        
		String s = new String(a, b, j1);
	//   27   42:new             #49  <Class String>
	//   28   45:dup             
	//   29   46:aload_0         
	//   30   47:getfield        #17  <Field byte[] a>
	//   31   50:aload_0         
	//   32   51:getfield        #22  <Field int b>
	//   33   54:iload_2         
	//   34   55:invokespecial   #51  <Method void String(byte[], int, int)>
	//   35   58:astore_3        
		b = b + i1;
	//   36   59:aload_0         
	//   37   60:aload_0         
	//   38   61:getfield        #22  <Field int b>
	//   39   64:iload_1         
	//   40   65:iadd            
	//   41   66:putfield        #22  <Field int b>
		return s;
	//   42   69:aload_3         
	//   43   70:areturn         
	}

	public final int f()
	{
		byte abyte0[] = a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] a>
	//    2    4:astore_2        
		int i1 = b;
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field int b>
	//    5    9:istore_1        
		b = i1 + 1;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #22  <Field int b>
		return abyte0[i1] & 0xff;
	//   11   17:aload_2         
	//   12   18:iload_1         
	//   13   19:baload          
	//   14   20:sipush          255
	//   15   23:iand            
	//   16   24:ireturn         
	}

	public final int g()
	{
		byte abyte0[] = a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] a>
	//    2    4:astore_3        
		int i1 = b;
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field int b>
	//    5    9:istore_1        
		b = i1 + 1;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #22  <Field int b>
		i1 = ((int) (abyte0[i1]));
	//   11   17:aload_3         
	//   12   18:iload_1         
	//   13   19:baload          
	//   14   20:istore_1        
		int j1 = b;
	//   15   21:aload_0         
	//   16   22:getfield        #22  <Field int b>
	//   17   25:istore_2        
		b = j1 + 1;
	//   18   26:aload_0         
	//   19   27:iload_2         
	//   20   28:iconst_1        
	//   21   29:iadd            
	//   22   30:putfield        #22  <Field int b>
		return abyte0[j1] & 0xff | (i1 & 0xff) << 8;
	//   23   33:aload_3         
	//   24   34:iload_2         
	//   25   35:baload          
	//   26   36:sipush          255
	//   27   39:iand            
	//   28   40:iload_1         
	//   29   41:sipush          255
	//   30   44:iand            
	//   31   45:bipush          8
	//   32   47:ishl            
	//   33   48:ior             
	//   34   49:ireturn         
	}

	public final int h()
	{
		byte abyte0[] = a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] a>
	//    2    4:astore_3        
		int i1 = b;
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field int b>
	//    5    9:istore_1        
		b = i1 + 1;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #22  <Field int b>
		i1 = ((int) (abyte0[i1]));
	//   11   17:aload_3         
	//   12   18:iload_1         
	//   13   19:baload          
	//   14   20:istore_1        
		int j1 = b;
	//   15   21:aload_0         
	//   16   22:getfield        #22  <Field int b>
	//   17   25:istore_2        
		b = j1 + 1;
	//   18   26:aload_0         
	//   19   27:iload_2         
	//   20   28:iconst_1        
	//   21   29:iadd            
	//   22   30:putfield        #22  <Field int b>
		return (abyte0[j1] & 0xff) << 8 | i1 & 0xff;
	//   23   33:aload_3         
	//   24   34:iload_2         
	//   25   35:baload          
	//   26   36:sipush          255
	//   27   39:iand            
	//   28   40:bipush          8
	//   29   42:ishl            
	//   30   43:iload_1         
	//   31   44:sipush          255
	//   32   47:iand            
	//   33   48:ior             
	//   34   49:ireturn         
	}

	public final short i()
	{
		byte abyte0[] = a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] a>
	//    2    4:astore_3        
		int i1 = b;
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field int b>
	//    5    9:istore_1        
		b = i1 + 1;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #22  <Field int b>
		i1 = ((int) (abyte0[i1]));
	//   11   17:aload_3         
	//   12   18:iload_1         
	//   13   19:baload          
	//   14   20:istore_1        
		int j1 = b;
	//   15   21:aload_0         
	//   16   22:getfield        #22  <Field int b>
	//   17   25:istore_2        
		b = j1 + 1;
	//   18   26:aload_0         
	//   19   27:iload_2         
	//   20   28:iconst_1        
	//   21   29:iadd            
	//   22   30:putfield        #22  <Field int b>
		return (short)(abyte0[j1] & 0xff | (i1 & 0xff) << 8);
	//   23   33:aload_3         
	//   24   34:iload_2         
	//   25   35:baload          
	//   26   36:sipush          255
	//   27   39:iand            
	//   28   40:iload_1         
	//   29   41:sipush          255
	//   30   44:iand            
	//   31   45:bipush          8
	//   32   47:ishl            
	//   33   48:ior             
	//   34   49:int2short       
	//   35   50:ireturn         
	}

	public final long j()
	{
		byte abyte0[] = a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] a>
	//    2    4:astore          8
		int i1 = b;
	//    3    6:aload_0         
	//    4    7:getfield        #22  <Field int b>
	//    5   10:istore_1        
		b = i1 + 1;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:iconst_1        
	//    9   14:iadd            
	//   10   15:putfield        #22  <Field int b>
		long l1 = abyte0[i1];
	//   11   18:aload           8
	//   12   20:iload_1         
	//   13   21:baload          
	//   14   22:i2l             
	//   15   23:lstore_2        
		i1 = b;
	//   16   24:aload_0         
	//   17   25:getfield        #22  <Field int b>
	//   18   28:istore_1        
		b = i1 + 1;
	//   19   29:aload_0         
	//   20   30:iload_1         
	//   21   31:iconst_1        
	//   22   32:iadd            
	//   23   33:putfield        #22  <Field int b>
		long l2 = abyte0[i1];
	//   24   36:aload           8
	//   25   38:iload_1         
	//   26   39:baload          
	//   27   40:i2l             
	//   28   41:lstore          4
		i1 = b;
	//   29   43:aload_0         
	//   30   44:getfield        #22  <Field int b>
	//   31   47:istore_1        
		b = i1 + 1;
	//   32   48:aload_0         
	//   33   49:iload_1         
	//   34   50:iconst_1        
	//   35   51:iadd            
	//   36   52:putfield        #22  <Field int b>
		long l3 = abyte0[i1];
	//   37   55:aload           8
	//   38   57:iload_1         
	//   39   58:baload          
	//   40   59:i2l             
	//   41   60:lstore          6
		i1 = b;
	//   42   62:aload_0         
	//   43   63:getfield        #22  <Field int b>
	//   44   66:istore_1        
		b = i1 + 1;
	//   45   67:aload_0         
	//   46   68:iload_1         
	//   47   69:iconst_1        
	//   48   70:iadd            
	//   49   71:putfield        #22  <Field int b>
		return (l1 & 255L) << 24 | (l2 & 255L) << 16 | (l3 & 255L) << 8 | 255L & (long)abyte0[i1];
	//   50   74:lload_2         
	//   51   75:ldc2w           #59  <Long 255L>
	//   52   78:land            
	//   53   79:bipush          24
	//   54   81:lshl            
	//   55   82:lload           4
	//   56   84:ldc2w           #59  <Long 255L>
	//   57   87:land            
	//   58   88:bipush          16
	//   59   90:lshl            
	//   60   91:lor             
	//   61   92:lload           6
	//   62   94:ldc2w           #59  <Long 255L>
	//   63   97:land            
	//   64   98:bipush          8
	//   65  100:lshl            
	//   66  101:lor             
	//   67  102:ldc2w           #59  <Long 255L>
	//   68  105:aload           8
	//   69  107:iload_1         
	//   70  108:baload          
	//   71  109:i2l             
	//   72  110:land            
	//   73  111:lor             
	//   74  112:lreturn         
	}

	public final long k()
	{
		byte abyte0[] = a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] a>
	//    2    4:astore          8
		int i1 = b;
	//    3    6:aload_0         
	//    4    7:getfield        #22  <Field int b>
	//    5   10:istore_1        
		b = i1 + 1;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:iconst_1        
	//    9   14:iadd            
	//   10   15:putfield        #22  <Field int b>
		long l1 = abyte0[i1];
	//   11   18:aload           8
	//   12   20:iload_1         
	//   13   21:baload          
	//   14   22:i2l             
	//   15   23:lstore_2        
		i1 = b;
	//   16   24:aload_0         
	//   17   25:getfield        #22  <Field int b>
	//   18   28:istore_1        
		b = i1 + 1;
	//   19   29:aload_0         
	//   20   30:iload_1         
	//   21   31:iconst_1        
	//   22   32:iadd            
	//   23   33:putfield        #22  <Field int b>
		long l2 = abyte0[i1];
	//   24   36:aload           8
	//   25   38:iload_1         
	//   26   39:baload          
	//   27   40:i2l             
	//   28   41:lstore          4
		i1 = b;
	//   29   43:aload_0         
	//   30   44:getfield        #22  <Field int b>
	//   31   47:istore_1        
		b = i1 + 1;
	//   32   48:aload_0         
	//   33   49:iload_1         
	//   34   50:iconst_1        
	//   35   51:iadd            
	//   36   52:putfield        #22  <Field int b>
		long l3 = abyte0[i1];
	//   37   55:aload           8
	//   38   57:iload_1         
	//   39   58:baload          
	//   40   59:i2l             
	//   41   60:lstore          6
		i1 = b;
	//   42   62:aload_0         
	//   43   63:getfield        #22  <Field int b>
	//   44   66:istore_1        
		b = i1 + 1;
	//   45   67:aload_0         
	//   46   68:iload_1         
	//   47   69:iconst_1        
	//   48   70:iadd            
	//   49   71:putfield        #22  <Field int b>
		return l1 & 255L | (l2 & 255L) << 8 | (l3 & 255L) << 16 | (255L & (long)abyte0[i1]) << 24;
	//   50   74:lload_2         
	//   51   75:ldc2w           #59  <Long 255L>
	//   52   78:land            
	//   53   79:lload           4
	//   54   81:ldc2w           #59  <Long 255L>
	//   55   84:land            
	//   56   85:bipush          8
	//   57   87:lshl            
	//   58   88:lor             
	//   59   89:lload           6
	//   60   91:ldc2w           #59  <Long 255L>
	//   61   94:land            
	//   62   95:bipush          16
	//   63   97:lshl            
	//   64   98:lor             
	//   65   99:ldc2w           #59  <Long 255L>
	//   66  102:aload           8
	//   67  104:iload_1         
	//   68  105:baload          
	//   69  106:i2l             
	//   70  107:land            
	//   71  108:bipush          24
	//   72  110:lshl            
	//   73  111:lor             
	//   74  112:lreturn         
	}

	public final int l()
	{
		byte abyte0[] = a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] a>
	//    2    4:astore          5
		int i1 = b;
	//    3    6:aload_0         
	//    4    7:getfield        #22  <Field int b>
	//    5   10:istore_1        
		b = i1 + 1;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:iconst_1        
	//    9   14:iadd            
	//   10   15:putfield        #22  <Field int b>
		i1 = ((int) (abyte0[i1]));
	//   11   18:aload           5
	//   12   20:iload_1         
	//   13   21:baload          
	//   14   22:istore_1        
		int j1 = b;
	//   15   23:aload_0         
	//   16   24:getfield        #22  <Field int b>
	//   17   27:istore_2        
		b = j1 + 1;
	//   18   28:aload_0         
	//   19   29:iload_2         
	//   20   30:iconst_1        
	//   21   31:iadd            
	//   22   32:putfield        #22  <Field int b>
		j1 = ((int) (abyte0[j1]));
	//   23   35:aload           5
	//   24   37:iload_2         
	//   25   38:baload          
	//   26   39:istore_2        
		int k1 = b;
	//   27   40:aload_0         
	//   28   41:getfield        #22  <Field int b>
	//   29   44:istore_3        
		b = k1 + 1;
	//   30   45:aload_0         
	//   31   46:iload_3         
	//   32   47:iconst_1        
	//   33   48:iadd            
	//   34   49:putfield        #22  <Field int b>
		k1 = ((int) (abyte0[k1]));
	//   35   52:aload           5
	//   36   54:iload_3         
	//   37   55:baload          
	//   38   56:istore_3        
		int l1 = b;
	//   39   57:aload_0         
	//   40   58:getfield        #22  <Field int b>
	//   41   61:istore          4
		b = l1 + 1;
	//   42   63:aload_0         
	//   43   64:iload           4
	//   44   66:iconst_1        
	//   45   67:iadd            
	//   46   68:putfield        #22  <Field int b>
		return abyte0[l1] & 0xff | ((i1 & 0xff) << 24 | (j1 & 0xff) << 16 | (k1 & 0xff) << 8);
	//   47   71:aload           5
	//   48   73:iload           4
	//   49   75:baload          
	//   50   76:sipush          255
	//   51   79:iand            
	//   52   80:iload_1         
	//   53   81:sipush          255
	//   54   84:iand            
	//   55   85:bipush          24
	//   56   87:ishl            
	//   57   88:iload_2         
	//   58   89:sipush          255
	//   59   92:iand            
	//   60   93:bipush          16
	//   61   95:ishl            
	//   62   96:ior             
	//   63   97:iload_3         
	//   64   98:sipush          255
	//   65  101:iand            
	//   66  102:bipush          8
	//   67  104:ishl            
	//   68  105:ior             
	//   69  106:ior             
	//   70  107:ireturn         
	}

	public final long m()
	{
		byte abyte0[] = a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] a>
	//    2    4:astore          16
		int i1 = b;
	//    3    6:aload_0         
	//    4    7:getfield        #22  <Field int b>
	//    5   10:istore_1        
		b = i1 + 1;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:iconst_1        
	//    9   14:iadd            
	//   10   15:putfield        #22  <Field int b>
		long l1 = abyte0[i1];
	//   11   18:aload           16
	//   12   20:iload_1         
	//   13   21:baload          
	//   14   22:i2l             
	//   15   23:lstore_2        
		i1 = b;
	//   16   24:aload_0         
	//   17   25:getfield        #22  <Field int b>
	//   18   28:istore_1        
		b = i1 + 1;
	//   19   29:aload_0         
	//   20   30:iload_1         
	//   21   31:iconst_1        
	//   22   32:iadd            
	//   23   33:putfield        #22  <Field int b>
		long l2 = abyte0[i1];
	//   24   36:aload           16
	//   25   38:iload_1         
	//   26   39:baload          
	//   27   40:i2l             
	//   28   41:lstore          4
		i1 = b;
	//   29   43:aload_0         
	//   30   44:getfield        #22  <Field int b>
	//   31   47:istore_1        
		b = i1 + 1;
	//   32   48:aload_0         
	//   33   49:iload_1         
	//   34   50:iconst_1        
	//   35   51:iadd            
	//   36   52:putfield        #22  <Field int b>
		long l3 = abyte0[i1];
	//   37   55:aload           16
	//   38   57:iload_1         
	//   39   58:baload          
	//   40   59:i2l             
	//   41   60:lstore          6
		i1 = b;
	//   42   62:aload_0         
	//   43   63:getfield        #22  <Field int b>
	//   44   66:istore_1        
		b = i1 + 1;
	//   45   67:aload_0         
	//   46   68:iload_1         
	//   47   69:iconst_1        
	//   48   70:iadd            
	//   49   71:putfield        #22  <Field int b>
		long l4 = abyte0[i1];
	//   50   74:aload           16
	//   51   76:iload_1         
	//   52   77:baload          
	//   53   78:i2l             
	//   54   79:lstore          8
		i1 = b;
	//   55   81:aload_0         
	//   56   82:getfield        #22  <Field int b>
	//   57   85:istore_1        
		b = i1 + 1;
	//   58   86:aload_0         
	//   59   87:iload_1         
	//   60   88:iconst_1        
	//   61   89:iadd            
	//   62   90:putfield        #22  <Field int b>
		long l5 = abyte0[i1];
	//   63   93:aload           16
	//   64   95:iload_1         
	//   65   96:baload          
	//   66   97:i2l             
	//   67   98:lstore          10
		i1 = b;
	//   68  100:aload_0         
	//   69  101:getfield        #22  <Field int b>
	//   70  104:istore_1        
		b = i1 + 1;
	//   71  105:aload_0         
	//   72  106:iload_1         
	//   73  107:iconst_1        
	//   74  108:iadd            
	//   75  109:putfield        #22  <Field int b>
		long l6 = abyte0[i1];
	//   76  112:aload           16
	//   77  114:iload_1         
	//   78  115:baload          
	//   79  116:i2l             
	//   80  117:lstore          12
		i1 = b;
	//   81  119:aload_0         
	//   82  120:getfield        #22  <Field int b>
	//   83  123:istore_1        
		b = i1 + 1;
	//   84  124:aload_0         
	//   85  125:iload_1         
	//   86  126:iconst_1        
	//   87  127:iadd            
	//   88  128:putfield        #22  <Field int b>
		long l7 = abyte0[i1];
	//   89  131:aload           16
	//   90  133:iload_1         
	//   91  134:baload          
	//   92  135:i2l             
	//   93  136:lstore          14
		i1 = b;
	//   94  138:aload_0         
	//   95  139:getfield        #22  <Field int b>
	//   96  142:istore_1        
		b = i1 + 1;
	//   97  143:aload_0         
	//   98  144:iload_1         
	//   99  145:iconst_1        
	//  100  146:iadd            
	//  101  147:putfield        #22  <Field int b>
		return (l1 & 255L) << 56 | (l2 & 255L) << 48 | (l3 & 255L) << 40 | (l4 & 255L) << 32 | (l5 & 255L) << 24 | (l6 & 255L) << 16 | (l7 & 255L) << 8 | 255L & (long)abyte0[i1];
	//  102  150:lload_2         
	//  103  151:ldc2w           #59  <Long 255L>
	//  104  154:land            
	//  105  155:bipush          56
	//  106  157:lshl            
	//  107  158:lload           4
	//  108  160:ldc2w           #59  <Long 255L>
	//  109  163:land            
	//  110  164:bipush          48
	//  111  166:lshl            
	//  112  167:lor             
	//  113  168:lload           6
	//  114  170:ldc2w           #59  <Long 255L>
	//  115  173:land            
	//  116  174:bipush          40
	//  117  176:lshl            
	//  118  177:lor             
	//  119  178:lload           8
	//  120  180:ldc2w           #59  <Long 255L>
	//  121  183:land            
	//  122  184:bipush          32
	//  123  186:lshl            
	//  124  187:lor             
	//  125  188:lload           10
	//  126  190:ldc2w           #59  <Long 255L>
	//  127  193:land            
	//  128  194:bipush          24
	//  129  196:lshl            
	//  130  197:lor             
	//  131  198:lload           12
	//  132  200:ldc2w           #59  <Long 255L>
	//  133  203:land            
	//  134  204:bipush          16
	//  135  206:lshl            
	//  136  207:lor             
	//  137  208:lload           14
	//  138  210:ldc2w           #59  <Long 255L>
	//  139  213:land            
	//  140  214:bipush          8
	//  141  216:lshl            
	//  142  217:lor             
	//  143  218:ldc2w           #59  <Long 255L>
	//  144  221:aload           16
	//  145  223:iload_1         
	//  146  224:baload          
	//  147  225:i2l             
	//  148  226:land            
	//  149  227:lor             
	//  150  228:lreturn         
	}

	public final int n()
	{
		byte abyte0[] = a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field byte[] a>
	//    2    4:astore_3        
		int i1 = b;
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field int b>
	//    5    9:istore_1        
		b = i1 + 1;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #22  <Field int b>
		i1 = ((int) (abyte0[i1]));
	//   11   17:aload_3         
	//   12   18:iload_1         
	//   13   19:baload          
	//   14   20:istore_1        
		int j1 = b;
	//   15   21:aload_0         
	//   16   22:getfield        #22  <Field int b>
	//   17   25:istore_2        
		b = j1 + 1;
	//   18   26:aload_0         
	//   19   27:iload_2         
	//   20   28:iconst_1        
	//   21   29:iadd            
	//   22   30:putfield        #22  <Field int b>
		j1 = ((int) (abyte0[j1]));
	//   23   33:aload_3         
	//   24   34:iload_2         
	//   25   35:baload          
	//   26   36:istore_2        
		b = b + 2;
	//   27   37:aload_0         
	//   28   38:aload_0         
	//   29   39:getfield        #22  <Field int b>
	//   30   42:iconst_2        
	//   31   43:iadd            
	//   32   44:putfield        #22  <Field int b>
		return j1 & 0xff | (i1 & 0xff) << 8;
	//   33   47:iload_2         
	//   34   48:sipush          255
	//   35   51:iand            
	//   36   52:iload_1         
	//   37   53:sipush          255
	//   38   56:iand            
	//   39   57:bipush          8
	//   40   59:ishl            
	//   41   60:ior             
	//   42   61:ireturn         
	}

	public final int o()
	{
		int i1 = l();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #67  <Method int l()>
	//    2    4:istore_1        
		if(i1 >= 0)
	//*   3    5:iload_1         
	//*   4    6:iflt            11
		{
			return i1;
	//    5    9:iload_1         
	//    6   10:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(29);
	//    7   11:new             #69  <Class StringBuilder>
	//    8   14:dup             
	//    9   15:bipush          29
	//   10   17:invokespecial   #71  <Method void StringBuilder(int)>
	//   11   20:astore_2        
			stringbuilder.append("Top bit not zero: ");
	//   12   21:aload_2         
	//   13   22:ldc1            #73  <String "Top bit not zero: ">
	//   14   24:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
			stringbuilder.append(i1);
	//   16   28:aload_2         
	//   17   29:iload_1         
	//   18   30:invokevirtual   #80  <Method StringBuilder StringBuilder.append(int)>
	//   19   33:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   20   34:new             #82  <Class IllegalStateException>
	//   21   37:dup             
	//   22   38:aload_2         
	//   23   39:invokevirtual   #86  <Method String StringBuilder.toString()>
	//   24   42:invokespecial   #89  <Method void IllegalStateException(String)>
	//   25   45:athrow          
		}
	}

	public final long p()
	{
		long l1 = m();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #92  <Method long m()>
	//    2    4:lstore_1        
		if(l1 >= 0L)
	//*   3    5:lload_1         
	//*   4    6:lconst_0        
	//*   5    7:lcmp            
	//*   6    8:iflt            13
		{
			return l1;
	//    7   11:lload_1         
	//    8   12:lreturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(38);
	//    9   13:new             #69  <Class StringBuilder>
	//   10   16:dup             
	//   11   17:bipush          38
	//   12   19:invokespecial   #71  <Method void StringBuilder(int)>
	//   13   22:astore_3        
			stringbuilder.append("Top bit not zero: ");
	//   14   23:aload_3         
	//   15   24:ldc1            #73  <String "Top bit not zero: ">
	//   16   26:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   17   29:pop             
			stringbuilder.append(l1);
	//   18   30:aload_3         
	//   19   31:lload_1         
	//   20   32:invokevirtual   #95  <Method StringBuilder StringBuilder.append(long)>
	//   21   35:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   22   36:new             #82  <Class IllegalStateException>
	//   23   39:dup             
	//   24   40:aload_3         
	//   25   41:invokevirtual   #86  <Method String StringBuilder.toString()>
	//   26   44:invokespecial   #89  <Method void IllegalStateException(String)>
	//   27   47:athrow          
		}
	}

	public final String q()
	{
		if(b() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #98  <Method int b()>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		int i1;
		for(i1 = b; i1 < c && a[i1] != 0; i1++);
	//    5    9:aload_0         
	//    6   10:getfield        #22  <Field int b>
	//    7   13:istore_1        
	//    8   14:iload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #19  <Field int c>
	//   11   19:icmpge          38
	//   12   22:aload_0         
	//   13   23:getfield        #17  <Field byte[] a>
	//   14   26:iload_1         
	//   15   27:baload          
	//   16   28:ifeq            38
	//   17   31:iload_1         
	//   18   32:iconst_1        
	//   19   33:iadd            
	//   20   34:istore_1        
	//*  21   35:goto            14
		byte abyte0[] = a;
	//   22   38:aload_0         
	//   23   39:getfield        #17  <Field byte[] a>
	//   24   42:astore_3        
		int j1 = b;
	//   25   43:aload_0         
	//   26   44:getfield        #22  <Field int b>
	//   27   47:istore_2        
		String s = new String(abyte0, j1, i1 - j1);
	//   28   48:new             #49  <Class String>
	//   29   51:dup             
	//   30   52:aload_3         
	//   31   53:iload_2         
	//   32   54:iload_1         
	//   33   55:iload_2         
	//   34   56:isub            
	//   35   57:invokespecial   #51  <Method void String(byte[], int, int)>
	//   36   60:astore_3        
		b = i1;
	//   37   61:aload_0         
	//   38   62:iload_1         
	//   39   63:putfield        #22  <Field int b>
		i1 = b;
	//   40   66:aload_0         
	//   41   67:getfield        #22  <Field int b>
	//   42   70:istore_1        
		if(i1 < c)
	//*  43   71:iload_1         
	//*  44   72:aload_0         
	//*  45   73:getfield        #19  <Field int c>
	//*  46   76:icmpge          86
			b = i1 + 1;
	//   47   79:aload_0         
	//   48   80:iload_1         
	//   49   81:iconst_1        
	//   50   82:iadd            
	//   51   83:putfield        #22  <Field int b>
		return s;
	//   52   86:aload_3         
	//   53   87:areturn         
	}

	public byte a[];
	private int b;
	private int c;
}
