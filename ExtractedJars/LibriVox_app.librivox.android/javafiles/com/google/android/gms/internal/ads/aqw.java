// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			awj, awh, awg, awp

public final class aqw extends awj
{

	public aqw()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void awj()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #16  <Field Long a>
		b = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #18  <Field String b>
		c = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #20  <Field byte[] c>
		aa = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #24  <Field int aa>
	//   14   24:return          
	}

	protected final int a()
	{
		int j = super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method int awj.a()>
	//    2    4:istore_2        
		Object obj = ((Object) (a));
	//    3    5:aload_0         
	//    4    6:getfield        #16  <Field Long a>
	//    5    9:astore_3        
		int i = j;
	//    6   10:iload_2         
	//    7   11:istore_1        
		if(obj != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          27
			i = j + awh.d(1, ((Long) (obj)).longValue());
	//   10   16:iload_2         
	//   11   17:iconst_1        
	//   12   18:aload_3         
	//   13   19:invokevirtual   #34  <Method long Long.longValue()>
	//   14   22:invokestatic    #40  <Method int awh.d(int, long)>
	//   15   25:iadd            
	//   16   26:istore_1        
		obj = ((Object) (b));
	//   17   27:aload_0         
	//   18   28:getfield        #18  <Field String b>
	//   19   31:astore_3        
		j = i;
	//   20   32:iload_1         
	//   21   33:istore_2        
		if(obj != null)
	//*  22   34:aload_3         
	//*  23   35:ifnull          46
			j = i + awh.b(3, ((String) (obj)));
	//   24   38:iload_1         
	//   25   39:iconst_3        
	//   26   40:aload_3         
	//   27   41:invokestatic    #43  <Method int awh.b(int, String)>
	//   28   44:iadd            
	//   29   45:istore_2        
		byte abyte0[] = c;
	//   30   46:aload_0         
	//   31   47:getfield        #20  <Field byte[] c>
	//   32   50:astore_3        
		i = j;
	//   33   51:iload_2         
	//   34   52:istore_1        
		if(abyte0 != null)
	//*  35   53:aload_3         
	//*  36   54:ifnull          65
			i = j + awh.b(4, abyte0);
	//   37   57:iload_2         
	//   38   58:iconst_4        
	//   39   59:aload_3         
	//   40   60:invokestatic    #46  <Method int awh.b(int, byte[])>
	//   41   63:iadd            
	//   42   64:istore_1        
		return i;
	//   43   65:iload_1         
	//   44   66:ireturn         
	}

	public final awp a(awg awg1)
	{
		do
		{
			int i = awg1.a();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #50  <Method int awg.a()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            74
			if(i != 8)
	//*   5    9:iload_2         
	//*   6   10:bipush          8
	//*   7   12:icmpeq          60
			{
				if(i != 26)
	//*   8   15:iload_2         
	//*   9   16:bipush          26
	//*  10   18:icmpeq          49
				{
					if(i != 34)
	//*  11   21:iload_2         
	//*  12   22:bipush          34
	//*  13   24:icmpeq          38
					{
						if(!super.a(awg1, i))
	//*  14   27:aload_0         
	//*  15   28:aload_1         
	//*  16   29:iload_2         
	//*  17   30:invokespecial   #53  <Method boolean awj.a(awg, int)>
	//*  18   33:ifne            0
							return ((awp) (this));
	//   19   36:aload_0         
	//   20   37:areturn         
					} else
					{
						c = awg1.f();
	//   21   38:aload_0         
	//   22   39:aload_1         
	//   23   40:invokevirtual   #57  <Method byte[] awg.f()>
	//   24   43:putfield        #20  <Field byte[] c>
					}
				} else
	//*  25   46:goto            0
				{
					b = awg1.e();
	//   26   49:aload_0         
	//   27   50:aload_1         
	//   28   51:invokevirtual   #61  <Method String awg.e()>
	//   29   54:putfield        #18  <Field String b>
				}
			} else
	//*  30   57:goto            0
			{
				a = Long.valueOf(awg1.h());
	//   31   60:aload_0         
	//   32   61:aload_1         
	//   33   62:invokevirtual   #64  <Method long awg.h()>
	//   34   65:invokestatic    #68  <Method Long Long.valueOf(long)>
	//   35   68:putfield        #16  <Field Long a>
			}
		} while(true);
	//   36   71:goto            0
		return ((awp) (this));
	//   37   74:aload_0         
	//   38   75:areturn         
	}

	public final void a(awh awh1)
	{
		Object obj = ((Object) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Long a>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          18
			awh1.b(1, ((Long) (obj)).longValue());
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_2         
	//    8   12:invokevirtual   #34  <Method long Long.longValue()>
	//    9   15:invokevirtual   #72  <Method void awh.b(int, long)>
		obj = ((Object) (b));
	//   10   18:aload_0         
	//   11   19:getfield        #18  <Field String b>
	//   12   22:astore_2        
		if(obj != null)
	//*  13   23:aload_2         
	//*  14   24:ifnull          33
			awh1.a(3, ((String) (obj)));
	//   15   27:aload_1         
	//   16   28:iconst_3        
	//   17   29:aload_2         
	//   18   30:invokevirtual   #75  <Method void awh.a(int, String)>
		byte abyte0[] = c;
	//   19   33:aload_0         
	//   20   34:getfield        #20  <Field byte[] c>
	//   21   37:astore_2        
		if(abyte0 != null)
	//*  22   38:aload_2         
	//*  23   39:ifnull          48
			awh1.a(4, abyte0);
	//   24   42:aload_1         
	//   25   43:iconst_4        
	//   26   44:aload_2         
	//   27   45:invokevirtual   #78  <Method void awh.a(int, byte[])>
		super.a(awh1);
	//   28   48:aload_0         
	//   29   49:aload_1         
	//   30   50:invokespecial   #80  <Method void awj.a(awh)>
	//   31   53:return          
	}

	public Long a;
	private String b;
	private byte c[];
}
