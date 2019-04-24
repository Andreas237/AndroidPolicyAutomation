// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			dem

public abstract class dek
{

	protected dek(int i, int j, int k, int l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		d = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #18  <Field int d>
		b = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #20  <Field int b>
		if(k > 0 && l > 0)
	//*   8   14:iload_3         
	//*   9   15:ifle            28
	//*  10   18:iload           4
	//*  11   20:ifle            28
			i = 1;
	//   12   23:iconst_1        
	//   13   24:istore_1        
		else
	//*  14   25:goto            30
			i = 0;
	//   15   28:iconst_0        
	//   16   29:istore_1        
		if(i != 0)
	//*  17   30:iload_1         
	//*  18   31:ifeq            43
			i = (k / j) * j;
	//   19   34:iload_3         
	//   20   35:iload_2         
	//   21   36:idiv            
	//   22   37:iload_2         
	//   23   38:imul            
	//   24   39:istore_1        
		else
	//*  25   40:goto            45
			i = 0;
	//   26   43:iconst_0        
	//   27   44:istore_1        
		e = i;
	//   28   45:aload_0         
	//   29   46:iload_1         
	//   30   47:putfield        #22  <Field int e>
		a = l;
	//   31   50:aload_0         
	//   32   51:iload           4
	//   33   53:putfield        #24  <Field int a>
	//   34   56:return          
	}

	private byte[] b(e e1)
	{
	/* block-local class not found */
	class e {}

		if(e1.c == null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #30  <Field byte[] dek$e.c>
	//*   2    4:ifnonnull       30
		{
			e1.c = new byte[d()];
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #33  <Method int d()>
	//    6   12:newarray        byte[]
	//    7   14:putfield        #30  <Field byte[] dek$e.c>
			e1.e = 0;
	//    8   17:aload_1         
	//    9   18:iconst_0        
	//   10   19:putfield        #34  <Field int dek$e.e>
			e1.b = 0;
	//   11   22:aload_1         
	//   12   23:iconst_0        
	//   13   24:putfield        #35  <Field int dek$e.b>
		} else
	//*  14   27:goto            60
		{
			byte abyte0[] = new byte[e1.c.length * 2];
	//   15   30:aload_1         
	//   16   31:getfield        #30  <Field byte[] dek$e.c>
	//   17   34:arraylength     
	//   18   35:iconst_2        
	//   19   36:imul            
	//   20   37:newarray        byte[]
	//   21   39:astore_2        
			System.arraycopy(((Object) (e1.c)), 0, ((Object) (abyte0)), 0, e1.c.length);
	//   22   40:aload_1         
	//   23   41:getfield        #30  <Field byte[] dek$e.c>
	//   24   44:iconst_0        
	//   25   45:aload_2         
	//   26   46:iconst_0        
	//   27   47:aload_1         
	//   28   48:getfield        #30  <Field byte[] dek$e.c>
	//   29   51:arraylength     
	//   30   52:invokestatic    #41  <Method void System.arraycopy(Object, int, Object, int, int)>
			e1.c = abyte0;
	//   31   55:aload_1         
	//   32   56:aload_2         
	//   33   57:putfield        #30  <Field byte[] dek$e.c>
		}
		return e1.c;
	//   34   60:aload_1         
	//   35   61:getfield        #30  <Field byte[] dek$e.c>
	//   36   64:areturn         
	}

	public long b(byte abyte0[])
	{
		long l1 = (long)(((abyte0.length + d) - 1) / d) * (long)b;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:aload_0         
	//    3    3:getfield        #18  <Field int d>
	//    4    6:iadd            
	//    5    7:iconst_1        
	//    6    8:isub            
	//    7    9:aload_0         
	//    8   10:getfield        #18  <Field int d>
	//    9   13:idiv            
	//   10   14:i2l             
	//   11   15:aload_0         
	//   12   16:getfield        #20  <Field int b>
	//   13   19:i2l             
	//   14   20:lmul            
	//   15   21:lstore          4
		long l = l1;
	//   16   23:lload           4
	//   17   25:lstore_2        
		if(e > 0)
	//*  18   26:aload_0         
	//*  19   27:getfield        #22  <Field int e>
	//*  20   30:ifle            59
			l = l1 + ((((long)e + l1) - 1L) / (long)e) * (long)a;
	//   21   33:lload           4
	//   22   35:aload_0         
	//   23   36:getfield        #22  <Field int e>
	//   24   39:i2l             
	//   25   40:lload           4
	//   26   42:ladd            
	//   27   43:lconst_1        
	//   28   44:lsub            
	//   29   45:aload_0         
	//   30   46:getfield        #22  <Field int e>
	//   31   49:i2l             
	//   32   50:ldiv            
	//   33   51:aload_0         
	//   34   52:getfield        #24  <Field int a>
	//   35   55:i2l             
	//   36   56:lmul            
	//   37   57:ladd            
	//   38   58:lstore_2        
		return l;
	//   39   59:lload_2         
	//   40   60:lreturn         
	}

	abstract void b(byte abyte0[], int i, int j, e e1);

	protected abstract boolean b(byte byte0);

	int c(byte abyte0[], int i, int j, e e1)
	{
		if(e1.c != null)
	//*   0    0:aload           4
	//*   1    2:getfield        #30  <Field byte[] dek$e.c>
	//*   2    5:ifnull          68
		{
			j = Math.min(d(e1), j);
	//    3    8:aload_0         
	//    4    9:aload           4
	//    5   11:invokevirtual   #48  <Method int d(dek$e)>
	//    6   14:iload_3         
	//    7   15:invokestatic    #54  <Method int Math.min(int, int)>
	//    8   18:istore_3        
			System.arraycopy(((Object) (e1.c)), e1.b, ((Object) (abyte0)), i, j);
	//    9   19:aload           4
	//   10   21:getfield        #30  <Field byte[] dek$e.c>
	//   11   24:aload           4
	//   12   26:getfield        #35  <Field int dek$e.b>
	//   13   29:aload_1         
	//   14   30:iload_2         
	//   15   31:iload_3         
	//   16   32:invokestatic    #41  <Method void System.arraycopy(Object, int, Object, int, int)>
			e1.b = e1.b + j;
	//   17   35:aload           4
	//   18   37:aload           4
	//   19   39:getfield        #35  <Field int dek$e.b>
	//   20   42:iload_3         
	//   21   43:iadd            
	//   22   44:putfield        #35  <Field int dek$e.b>
			if(e1.b >= e1.e)
	//*  23   47:aload           4
	//*  24   49:getfield        #35  <Field int dek$e.b>
	//*  25   52:aload           4
	//*  26   54:getfield        #34  <Field int dek$e.e>
	//*  27   57:icmplt          66
				e1.c = null;
	//   28   60:aload           4
	//   29   62:aconst_null     
	//   30   63:putfield        #30  <Field byte[] dek$e.c>
			return j;
	//   31   66:iload_3         
	//   32   67:ireturn         
		}
		return !e1.d ? 0 : -1;
	//   33   68:aload           4
	//   34   70:getfield        #57  <Field boolean dek$e.d>
	//   35   73:ifeq            78
	//   36   76:iconst_m1       
	//   37   77:ireturn         
	//   38   78:iconst_0        
	//   39   79:ireturn         
	}

	public byte[] c(byte abyte0[])
	{
		if(abyte0 == null || abyte0.length == 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          9
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:ifne            11
		{
			return abyte0;
	//    5    9:aload_1         
	//    6   10:areturn         
		} else
		{
			e e1 = new e();
	//    7   11:new             #6   <Class dek$e>
	//    8   14:dup             
	//    9   15:invokespecial   #59  <Method void dek$e()>
	//   10   18:astore_2        
			b(abyte0, 0, abyte0.length, e1);
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:iconst_0        
	//   14   22:aload_1         
	//   15   23:arraylength     
	//   16   24:aload_2         
	//   17   25:invokevirtual   #61  <Method void b(byte[], int, int, dek$e)>
			b(abyte0, 0, -1, e1);
	//   18   28:aload_0         
	//   19   29:aload_1         
	//   20   30:iconst_0        
	//   21   31:iconst_m1       
	//   22   32:aload_2         
	//   23   33:invokevirtual   #61  <Method void b(byte[], int, int, dek$e)>
			abyte0 = new byte[e1.e - e1.b];
	//   24   36:aload_2         
	//   25   37:getfield        #34  <Field int dek$e.e>
	//   26   40:aload_2         
	//   27   41:getfield        #35  <Field int dek$e.b>
	//   28   44:isub            
	//   29   45:newarray        byte[]
	//   30   47:astore_1        
			c(abyte0, 0, abyte0.length, e1);
	//   31   48:aload_0         
	//   32   49:aload_1         
	//   33   50:iconst_0        
	//   34   51:aload_1         
	//   35   52:arraylength     
	//   36   53:aload_2         
	//   37   54:invokevirtual   #63  <Method int c(byte[], int, int, dek$e)>
	//   38   57:pop             
			return abyte0;
	//   39   58:aload_1         
	//   40   59:areturn         
		}
	}

	protected int d()
	{
		return 8192;
	//    0    0:sipush          8192
	//    1    3:ireturn         
	}

	int d(e e1)
	{
		if(e1.c != null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #30  <Field byte[] dek$e.c>
	//*   2    4:ifnull          17
			return e1.e - e1.b;
	//    3    7:aload_1         
	//    4    8:getfield        #34  <Field int dek$e.e>
	//    5   11:aload_1         
	//    6   12:getfield        #35  <Field int dek$e.b>
	//    7   15:isub            
	//    8   16:ireturn         
		else
			return 0;
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	abstract void d(byte abyte0[], int i, int j, e e1);

	protected byte[] d(int i, e e1)
	{
		if(e1.c == null || e1.c.length < e1.e + i)
	//*   0    0:aload_2         
	//*   1    1:getfield        #30  <Field byte[] dek$e.c>
	//*   2    4:ifnull          21
	//*   3    7:aload_2         
	//*   4    8:getfield        #30  <Field byte[] dek$e.c>
	//*   5   11:arraylength     
	//*   6   12:aload_2         
	//*   7   13:getfield        #34  <Field int dek$e.e>
	//*   8   16:iload_1         
	//*   9   17:iadd            
	//*  10   18:icmpge          27
			return b(e1);
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:invokespecial   #66  <Method byte[] b(dek$e)>
	//   14   26:areturn         
		else
			return e1.c;
	//   15   27:aload_2         
	//   16   28:getfield        #30  <Field byte[] dek$e.c>
	//   17   31:areturn         
	}

	public byte[] d(byte abyte0[])
	{
		if(abyte0 == null || abyte0.length == 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          9
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:ifne            11
		{
			return abyte0;
	//    5    9:aload_1         
	//    6   10:areturn         
		} else
		{
			e e1 = new e();
	//    7   11:new             #6   <Class dek$e>
	//    8   14:dup             
	//    9   15:invokespecial   #59  <Method void dek$e()>
	//   10   18:astore_2        
			d(abyte0, 0, abyte0.length, e1);
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:iconst_0        
	//   14   22:aload_1         
	//   15   23:arraylength     
	//   16   24:aload_2         
	//   17   25:invokevirtual   #68  <Method void d(byte[], int, int, dek$e)>
			d(abyte0, 0, -1, e1);
	//   18   28:aload_0         
	//   19   29:aload_1         
	//   20   30:iconst_0        
	//   21   31:iconst_m1       
	//   22   32:aload_2         
	//   23   33:invokevirtual   #68  <Method void d(byte[], int, int, dek$e)>
			abyte0 = new byte[e1.e];
	//   24   36:aload_2         
	//   25   37:getfield        #34  <Field int dek$e.e>
	//   26   40:newarray        byte[]
	//   27   42:astore_1        
			c(abyte0, 0, abyte0.length, e1);
	//   28   43:aload_0         
	//   29   44:aload_1         
	//   30   45:iconst_0        
	//   31   46:aload_1         
	//   32   47:arraylength     
	//   33   48:aload_2         
	//   34   49:invokevirtual   #63  <Method int c(byte[], int, int, dek$e)>
	//   35   52:pop             
			return abyte0;
	//   36   53:aload_1         
	//   37   54:areturn         
		}
	}

	protected boolean e(byte abyte0[])
	{
		if(abyte0 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		int j = abyte0.length;
	//    4    6:aload_1         
	//    5    7:arraylength     
	//    6    8:istore          4
		for(int i = 0; i < j; i++)
	//*   7   10:iconst_0        
	//*   8   11:istore_3        
	//*   9   12:iload_3         
	//*  10   13:iload           4
	//*  11   15:icmpge          45
		{
			byte byte0 = abyte0[i];
	//   12   18:aload_1         
	//   13   19:iload_3         
	//   14   20:baload          
	//   15   21:istore_2        
			if(61 == byte0 || b(byte0))
	//*  16   22:bipush          61
	//*  17   24:iload_2         
	//*  18   25:icmpeq          36
	//*  19   28:aload_0         
	//*  20   29:iload_2         
	//*  21   30:invokevirtual   #71  <Method boolean b(byte)>
	//*  22   33:ifeq            38
				return true;
	//   23   36:iconst_1        
	//   24   37:ireturn         
		}

	//   25   38:iload_3         
	//   26   39:iconst_1        
	//   27   40:iadd            
	//   28   41:istore_3        
	//*  29   42:goto            12
		return false;
	//   30   45:iconst_0        
	//   31   46:ireturn         
	}

	public byte[] e(String s)
	{
		return d(dem.e(s));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #76  <Method byte[] dem.e(String)>
	//    3    5:invokevirtual   #78  <Method byte[] d(byte[])>
	//    4    8:areturn         
	}

	private final int a;
	private final int b;
	private final int d;
	protected final int e;
}
