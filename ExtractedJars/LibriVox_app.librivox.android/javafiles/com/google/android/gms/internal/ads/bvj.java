// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			awj, awh, awg, awp

public final class bvj extends awj
{

	public bvj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void awj()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #14  <Field Integer a>
		b = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #16  <Field Integer b>
		c = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #18  <Field Integer c>
		Z = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #22  <Field awl Z>
		aa = -1;
	//   14   24:aload_0         
	//   15   25:iconst_m1       
	//   16   26:putfield        #26  <Field int aa>
	//   17   29:return          
	}

	protected final int a()
	{
		int j = super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method int awj.a()>
	//    2    4:istore_2        
		Integer integer = a;
	//    3    5:aload_0         
	//    4    6:getfield        #14  <Field Integer a>
	//    5    9:astore_3        
		int i = j;
	//    6   10:iload_2         
	//    7   11:istore_1        
		if(integer != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          27
			i = j + awh.b(1, integer.intValue());
	//   10   16:iload_2         
	//   11   17:iconst_1        
	//   12   18:aload_3         
	//   13   19:invokevirtual   #35  <Method int Integer.intValue()>
	//   14   22:invokestatic    #40  <Method int awh.b(int, int)>
	//   15   25:iadd            
	//   16   26:istore_1        
		integer = b;
	//   17   27:aload_0         
	//   18   28:getfield        #16  <Field Integer b>
	//   19   31:astore_3        
		j = i;
	//   20   32:iload_1         
	//   21   33:istore_2        
		if(integer != null)
	//*  22   34:aload_3         
	//*  23   35:ifnull          49
			j = i + awh.b(2, integer.intValue());
	//   24   38:iload_1         
	//   25   39:iconst_2        
	//   26   40:aload_3         
	//   27   41:invokevirtual   #35  <Method int Integer.intValue()>
	//   28   44:invokestatic    #40  <Method int awh.b(int, int)>
	//   29   47:iadd            
	//   30   48:istore_2        
		integer = c;
	//   31   49:aload_0         
	//   32   50:getfield        #18  <Field Integer c>
	//   33   53:astore_3        
		i = j;
	//   34   54:iload_2         
	//   35   55:istore_1        
		if(integer != null)
	//*  36   56:aload_3         
	//*  37   57:ifnull          71
			i = j + awh.b(3, integer.intValue());
	//   38   60:iload_2         
	//   39   61:iconst_3        
	//   40   62:aload_3         
	//   41   63:invokevirtual   #35  <Method int Integer.intValue()>
	//   42   66:invokestatic    #40  <Method int awh.b(int, int)>
	//   43   69:iadd            
	//   44   70:istore_1        
		return i;
	//   45   71:iload_1         
	//   46   72:ireturn         
	}

	public final awp a(awg awg1)
	{
		do
		{
			int i = awg1.a();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #44  <Method int awg.a()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            80
			if(i != 8)
	//*   5    9:iload_2         
	//*   6   10:bipush          8
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
	//*  17   30:invokespecial   #47  <Method boolean awj.a(awg, int)>
	//*  18   33:ifne            0
							return ((awp) (this));
	//   19   36:aload_0         
	//   20   37:areturn         
					} else
					{
						c = Integer.valueOf(awg1.g());
	//   21   38:aload_0         
	//   22   39:aload_1         
	//   23   40:invokevirtual   #50  <Method int awg.g()>
	//   24   43:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//   25   46:putfield        #18  <Field Integer c>
					}
				} else
	//*  26   49:goto            0
				{
					b = Integer.valueOf(awg1.g());
	//   27   52:aload_0         
	//   28   53:aload_1         
	//   29   54:invokevirtual   #50  <Method int awg.g()>
	//   30   57:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//   31   60:putfield        #16  <Field Integer b>
				}
			} else
	//*  32   63:goto            0
			{
				a = Integer.valueOf(awg1.g());
	//   33   66:aload_0         
	//   34   67:aload_1         
	//   35   68:invokevirtual   #50  <Method int awg.g()>
	//   36   71:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//   37   74:putfield        #14  <Field Integer a>
			}
		} while(true);
	//   38   77:goto            0
		return ((awp) (this));
	//   39   80:aload_0         
	//   40   81:areturn         
	}

	public final void a(awh awh1)
	{
		Integer integer = a;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Integer a>
	//    2    4:astore_2        
		if(integer != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          18
			awh1.a(1, integer.intValue());
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_2         
	//    8   12:invokevirtual   #35  <Method int Integer.intValue()>
	//    9   15:invokevirtual   #58  <Method void awh.a(int, int)>
		integer = b;
	//   10   18:aload_0         
	//   11   19:getfield        #16  <Field Integer b>
	//   12   22:astore_2        
		if(integer != null)
	//*  13   23:aload_2         
	//*  14   24:ifnull          36
			awh1.a(2, integer.intValue());
	//   15   27:aload_1         
	//   16   28:iconst_2        
	//   17   29:aload_2         
	//   18   30:invokevirtual   #35  <Method int Integer.intValue()>
	//   19   33:invokevirtual   #58  <Method void awh.a(int, int)>
		integer = c;
	//   20   36:aload_0         
	//   21   37:getfield        #18  <Field Integer c>
	//   22   40:astore_2        
		if(integer != null)
	//*  23   41:aload_2         
	//*  24   42:ifnull          54
			awh1.a(3, integer.intValue());
	//   25   45:aload_1         
	//   26   46:iconst_3        
	//   27   47:aload_2         
	//   28   48:invokevirtual   #35  <Method int Integer.intValue()>
	//   29   51:invokevirtual   #58  <Method void awh.a(int, int)>
		super.a(awh1);
	//   30   54:aload_0         
	//   31   55:aload_1         
	//   32   56:invokespecial   #60  <Method void awj.a(awh)>
	//   33   59:return          
	}

	public Integer a;
	public Integer b;
	public Integer c;
}
