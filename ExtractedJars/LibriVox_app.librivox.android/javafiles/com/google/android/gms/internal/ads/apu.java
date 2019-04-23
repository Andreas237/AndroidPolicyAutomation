// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			awj, awh, awg, awp

public final class apu extends awj
{

	public apu()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void awj()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #15  <Field byte[] a>
		b = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #17  <Field byte[] b>
		c = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #19  <Field byte[] c>
		d = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #21  <Field byte[] d>
		aa = -1;
	//   14   24:aload_0         
	//   15   25:iconst_m1       
	//   16   26:putfield        #25  <Field int aa>
	//   17   29:return          
	}

	protected final int a()
	{
		int j = super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method int awj.a()>
	//    2    4:istore_2        
		byte abyte0[] = a;
	//    3    5:aload_0         
	//    4    6:getfield        #15  <Field byte[] a>
	//    5    9:astore_3        
		int i = j;
	//    6   10:iload_2         
	//    7   11:istore_1        
		if(abyte0 != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          24
			i = j + awh.b(1, abyte0);
	//   10   16:iload_2         
	//   11   17:iconst_1        
	//   12   18:aload_3         
	//   13   19:invokestatic    #34  <Method int awh.b(int, byte[])>
	//   14   22:iadd            
	//   15   23:istore_1        
		abyte0 = b;
	//   16   24:aload_0         
	//   17   25:getfield        #17  <Field byte[] b>
	//   18   28:astore_3        
		j = i;
	//   19   29:iload_1         
	//   20   30:istore_2        
		if(abyte0 != null)
	//*  21   31:aload_3         
	//*  22   32:ifnull          43
			j = i + awh.b(2, abyte0);
	//   23   35:iload_1         
	//   24   36:iconst_2        
	//   25   37:aload_3         
	//   26   38:invokestatic    #34  <Method int awh.b(int, byte[])>
	//   27   41:iadd            
	//   28   42:istore_2        
		abyte0 = c;
	//   29   43:aload_0         
	//   30   44:getfield        #19  <Field byte[] c>
	//   31   47:astore_3        
		i = j;
	//   32   48:iload_2         
	//   33   49:istore_1        
		if(abyte0 != null)
	//*  34   50:aload_3         
	//*  35   51:ifnull          62
			i = j + awh.b(3, abyte0);
	//   36   54:iload_2         
	//   37   55:iconst_3        
	//   38   56:aload_3         
	//   39   57:invokestatic    #34  <Method int awh.b(int, byte[])>
	//   40   60:iadd            
	//   41   61:istore_1        
		abyte0 = d;
	//   42   62:aload_0         
	//   43   63:getfield        #21  <Field byte[] d>
	//   44   66:astore_3        
		j = i;
	//   45   67:iload_1         
	//   46   68:istore_2        
		if(abyte0 != null)
	//*  47   69:aload_3         
	//*  48   70:ifnull          81
			j = i + awh.b(4, abyte0);
	//   49   73:iload_1         
	//   50   74:iconst_4        
	//   51   75:aload_3         
	//   52   76:invokestatic    #34  <Method int awh.b(int, byte[])>
	//   53   79:iadd            
	//   54   80:istore_2        
		return j;
	//   55   81:iload_2         
	//   56   82:ireturn         
	}

	public final awp a(awg awg1)
	{
		do
		{
			int i = awg1.a();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #38  <Method int awg.a()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            88
			if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          77
			{
				if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          66
				{
					if(i != 26)
	//*  11   21:iload_2         
	//*  12   22:bipush          26
	//*  13   24:icmpeq          55
					{
						if(i != 34)
	//*  14   27:iload_2         
	//*  15   28:bipush          34
	//*  16   30:icmpeq          44
						{
							if(!super.a(awg1, i))
	//*  17   33:aload_0         
	//*  18   34:aload_1         
	//*  19   35:iload_2         
	//*  20   36:invokespecial   #41  <Method boolean awj.a(awg, int)>
	//*  21   39:ifne            0
								return ((awp) (this));
	//   22   42:aload_0         
	//   23   43:areturn         
						} else
						{
							d = awg1.f();
	//   24   44:aload_0         
	//   25   45:aload_1         
	//   26   46:invokevirtual   #45  <Method byte[] awg.f()>
	//   27   49:putfield        #21  <Field byte[] d>
						}
					} else
	//*  28   52:goto            0
					{
						c = awg1.f();
	//   29   55:aload_0         
	//   30   56:aload_1         
	//   31   57:invokevirtual   #45  <Method byte[] awg.f()>
	//   32   60:putfield        #19  <Field byte[] c>
					}
				} else
	//*  33   63:goto            0
				{
					b = awg1.f();
	//   34   66:aload_0         
	//   35   67:aload_1         
	//   36   68:invokevirtual   #45  <Method byte[] awg.f()>
	//   37   71:putfield        #17  <Field byte[] b>
				}
			} else
	//*  38   74:goto            0
			{
				a = awg1.f();
	//   39   77:aload_0         
	//   40   78:aload_1         
	//   41   79:invokevirtual   #45  <Method byte[] awg.f()>
	//   42   82:putfield        #15  <Field byte[] a>
			}
		} while(true);
	//   43   85:goto            0
		return ((awp) (this));
	//   44   88:aload_0         
	//   45   89:areturn         
	}

	public final void a(awh awh1)
	{
		byte abyte0[] = a;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field byte[] a>
	//    2    4:astore_2        
		if(abyte0 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			awh1.a(1, abyte0);
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_2         
	//    8   12:invokevirtual   #49  <Method void awh.a(int, byte[])>
		abyte0 = b;
	//    9   15:aload_0         
	//   10   16:getfield        #17  <Field byte[] b>
	//   11   19:astore_2        
		if(abyte0 != null)
	//*  12   20:aload_2         
	//*  13   21:ifnull          30
			awh1.a(2, abyte0);
	//   14   24:aload_1         
	//   15   25:iconst_2        
	//   16   26:aload_2         
	//   17   27:invokevirtual   #49  <Method void awh.a(int, byte[])>
		abyte0 = c;
	//   18   30:aload_0         
	//   19   31:getfield        #19  <Field byte[] c>
	//   20   34:astore_2        
		if(abyte0 != null)
	//*  21   35:aload_2         
	//*  22   36:ifnull          45
			awh1.a(3, abyte0);
	//   23   39:aload_1         
	//   24   40:iconst_3        
	//   25   41:aload_2         
	//   26   42:invokevirtual   #49  <Method void awh.a(int, byte[])>
		abyte0 = d;
	//   27   45:aload_0         
	//   28   46:getfield        #21  <Field byte[] d>
	//   29   49:astore_2        
		if(abyte0 != null)
	//*  30   50:aload_2         
	//*  31   51:ifnull          60
			awh1.a(4, abyte0);
	//   32   54:aload_1         
	//   33   55:iconst_4        
	//   34   56:aload_2         
	//   35   57:invokevirtual   #49  <Method void awh.a(int, byte[])>
		super.a(awh1);
	//   36   60:aload_0         
	//   37   61:aload_1         
	//   38   62:invokespecial   #51  <Method void awj.a(awh)>
	//   39   65:return          
	}

	public byte a[];
	public byte b[];
	public byte c[];
	public byte d[];
}
