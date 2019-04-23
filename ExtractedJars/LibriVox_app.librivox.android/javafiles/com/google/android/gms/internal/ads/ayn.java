// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			awj, awh, awg, awp

public final class ayn extends awj
{

	public ayn()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void awj()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #16  <Field String a>
		b = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #18  <Field Long b>
		c = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #20  <Field Boolean c>
		Z = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #24  <Field awl Z>
		aa = -1;
	//   14   24:aload_0         
	//   15   25:iconst_m1       
	//   16   26:putfield        #28  <Field int aa>
	//   17   29:return          
	}

	protected final int a()
	{
		int j = super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method int awj.a()>
	//    2    4:istore_2        
		Object obj = ((Object) (a));
	//    3    5:aload_0         
	//    4    6:getfield        #16  <Field String a>
	//    5    9:astore_3        
		int i = j;
	//    6   10:iload_2         
	//    7   11:istore_1        
		if(obj != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          24
			i = j + awh.b(1, ((String) (obj)));
	//   10   16:iload_2         
	//   11   17:iconst_1        
	//   12   18:aload_3         
	//   13   19:invokestatic    #37  <Method int awh.b(int, String)>
	//   14   22:iadd            
	//   15   23:istore_1        
		obj = ((Object) (b));
	//   16   24:aload_0         
	//   17   25:getfield        #18  <Field Long b>
	//   18   28:astore_3        
		j = i;
	//   19   29:iload_1         
	//   20   30:istore_2        
		if(obj != null)
	//*  21   31:aload_3         
	//*  22   32:ifnull          46
			j = i + awh.d(2, ((Long) (obj)).longValue());
	//   23   35:iload_1         
	//   24   36:iconst_2        
	//   25   37:aload_3         
	//   26   38:invokevirtual   #43  <Method long Long.longValue()>
	//   27   41:invokestatic    #47  <Method int awh.d(int, long)>
	//   28   44:iadd            
	//   29   45:istore_2        
		obj = ((Object) (c));
	//   30   46:aload_0         
	//   31   47:getfield        #20  <Field Boolean c>
	//   32   50:astore_3        
		i = j;
	//   33   51:iload_2         
	//   34   52:istore_1        
		if(obj != null)
	//*  35   53:aload_3         
	//*  36   54:ifnull          71
		{
			((Boolean) (obj)).booleanValue();
	//   37   57:aload_3         
	//   38   58:invokevirtual   #53  <Method boolean Boolean.booleanValue()>
	//   39   61:pop             
			i = j + (awh.b(3) + 1);
	//   40   62:iload_2         
	//   41   63:iconst_3        
	//   42   64:invokestatic    #56  <Method int awh.b(int)>
	//   43   67:iconst_1        
	//   44   68:iadd            
	//   45   69:iadd            
	//   46   70:istore_1        
		}
		return i;
	//   47   71:iload_1         
	//   48   72:ireturn         
	}

	public final awp a(awg awg1)
	{
		do
		{
			int i = awg1.a();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #60  <Method int awg.a()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            77
			if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          66
			{
				if(i != 16)
	//*   8   15:iload_2         
	//*   9   16:bipush          16
	//*  10   18:icmpeq          52
				{
					if(i != 24)
	//*  11   21:iload_2         
	//*  12   22:bipush          24
	//*  13   24:icmpeq          38
					{
						if(!super.a(awg1, i))
	//*  14   27:aload_0         
	//*  15   28:aload_1         
	//*  16   29:iload_2         
	//*  17   30:invokespecial   #63  <Method boolean awj.a(awg, int)>
	//*  18   33:ifne            0
							return ((awp) (this));
	//   19   36:aload_0         
	//   20   37:areturn         
					} else
					{
						c = Boolean.valueOf(awg1.d());
	//   21   38:aload_0         
	//   22   39:aload_1         
	//   23   40:invokevirtual   #65  <Method boolean awg.d()>
	//   24   43:invokestatic    #69  <Method Boolean Boolean.valueOf(boolean)>
	//   25   46:putfield        #20  <Field Boolean c>
					}
				} else
	//*  26   49:goto            0
				{
					b = Long.valueOf(awg1.b());
	//   27   52:aload_0         
	//   28   53:aload_1         
	//   29   54:invokevirtual   #71  <Method long awg.b()>
	//   30   57:invokestatic    #74  <Method Long Long.valueOf(long)>
	//   31   60:putfield        #18  <Field Long b>
				}
			} else
	//*  32   63:goto            0
			{
				a = awg1.e();
	//   33   66:aload_0         
	//   34   67:aload_1         
	//   35   68:invokevirtual   #78  <Method String awg.e()>
	//   36   71:putfield        #16  <Field String a>
			}
		} while(true);
	//   37   74:goto            0
		return ((awp) (this));
	//   38   77:aload_0         
	//   39   78:areturn         
	}

	public final void a(awh awh1)
	{
		Object obj = ((Object) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field String a>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			awh1.a(1, ((String) (obj)));
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_2         
	//    8   12:invokevirtual   #82  <Method void awh.a(int, String)>
		obj = ((Object) (b));
	//    9   15:aload_0         
	//   10   16:getfield        #18  <Field Long b>
	//   11   19:astore_2        
		if(obj != null)
	//*  12   20:aload_2         
	//*  13   21:ifnull          33
			awh1.b(2, ((Long) (obj)).longValue());
	//   14   24:aload_1         
	//   15   25:iconst_2        
	//   16   26:aload_2         
	//   17   27:invokevirtual   #43  <Method long Long.longValue()>
	//   18   30:invokevirtual   #85  <Method void awh.b(int, long)>
		obj = ((Object) (c));
	//   19   33:aload_0         
	//   20   34:getfield        #20  <Field Boolean c>
	//   21   37:astore_2        
		if(obj != null)
	//*  22   38:aload_2         
	//*  23   39:ifnull          51
			awh1.a(3, ((Boolean) (obj)).booleanValue());
	//   24   42:aload_1         
	//   25   43:iconst_3        
	//   26   44:aload_2         
	//   27   45:invokevirtual   #53  <Method boolean Boolean.booleanValue()>
	//   28   48:invokevirtual   #88  <Method void awh.a(int, boolean)>
		super.a(awh1);
	//   29   51:aload_0         
	//   30   52:aload_1         
	//   31   53:invokespecial   #90  <Method void awj.a(awh)>
	//   32   56:return          
	}

	public String a;
	public Long b;
	public Boolean c;
}
