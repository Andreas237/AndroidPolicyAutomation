// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			awj, awn, awh, awg, 
//			awp

public final class ayi extends awj
{

	public ayi()
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
		Z = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #21  <Field awl Z>
		aa = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #25  <Field int aa>
	//   14   24:return          
	}

	public static ayi[] b()
	{
		if(c == null)
	//*   0    0:getstatic       #29  <Field ayi[] c>
	//*   1    3:ifnonnull       35
			synchronized(awn.b)
	//*   2    6:getstatic       #34  <Field Object awn.b>
	//*   3    9:astore_0        
	//*   4   10:aload_0         
	//*   5   11:monitorenter    
			{
				if(c == null)
	//*   6   12:getstatic       #29  <Field ayi[] c>
	//*   7   15:ifnonnull       25
					c = new ayi[0];
	//    8   18:iconst_0        
	//    9   19:anewarray       ayi[]
	//   10   22:putstatic       #29  <Field ayi[] c>
			}
	//   11   25:aload_0         
	//   12   26:monitorexit     
		break MISSING_BLOCK_LABEL_35;
	//   13   27:goto            35
		exception;
	//   14   30:astore_1        
		obj;
	//   15   31:aload_0         
		JVM INSTR monitorexit ;
	//   16   32:monitorexit     
		throw exception;
	//   17   33:aload_1         
	//   18   34:athrow          
		return c;
	//   19   35:getstatic       #29  <Field ayi[] c>
	//   20   38:areturn         
	}

	protected final int a()
	{
		int j = super.a() + awh.b(1, a);
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method int awj.a()>
	//    2    4:iconst_1        
	//    3    5:aload_0         
	//    4    6:getfield        #15  <Field byte[] a>
	//    5    9:invokestatic    #42  <Method int awh.b(int, byte[])>
	//    6   12:iadd            
	//    7   13:istore_2        
		byte abyte0[] = b;
	//    8   14:aload_0         
	//    9   15:getfield        #17  <Field byte[] b>
	//   10   18:astore_3        
		int i = j;
	//   11   19:iload_2         
	//   12   20:istore_1        
		if(abyte0 != null)
	//*  13   21:aload_3         
	//*  14   22:ifnull          33
			i = j + awh.b(2, abyte0);
	//   15   25:iload_2         
	//   16   26:iconst_2        
	//   17   27:aload_3         
	//   18   28:invokestatic    #42  <Method int awh.b(int, byte[])>
	//   19   31:iadd            
	//   20   32:istore_1        
		return i;
	//   21   33:iload_1         
	//   22   34:ireturn         
	}

	public final awp a(awg awg1)
	{
		do
		{
			int i = awg1.a();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #46  <Method int awg.a()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            54
			if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          43
			{
				if(i != 18)
	//*   8   15:iload_2         
	//*   9   16:bipush          18
	//*  10   18:icmpeq          32
				{
					if(!super.a(awg1, i))
	//*  11   21:aload_0         
	//*  12   22:aload_1         
	//*  13   23:iload_2         
	//*  14   24:invokespecial   #49  <Method boolean awj.a(awg, int)>
	//*  15   27:ifne            0
						return ((awp) (this));
	//   16   30:aload_0         
	//   17   31:areturn         
				} else
				{
					b = awg1.f();
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:invokevirtual   #53  <Method byte[] awg.f()>
	//   21   37:putfield        #17  <Field byte[] b>
				}
			} else
	//*  22   40:goto            0
			{
				a = awg1.f();
	//   23   43:aload_0         
	//   24   44:aload_1         
	//   25   45:invokevirtual   #53  <Method byte[] awg.f()>
	//   26   48:putfield        #15  <Field byte[] a>
			}
		} while(true);
	//   27   51:goto            0
		return ((awp) (this));
	//   28   54:aload_0         
	//   29   55:areturn         
	}

	public final void a(awh awh1)
	{
		awh1.a(1, a);
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:getfield        #15  <Field byte[] a>
	//    4    6:invokevirtual   #57  <Method void awh.a(int, byte[])>
		byte abyte0[] = b;
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field byte[] b>
	//    7   13:astore_2        
		if(abyte0 != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          24
			awh1.a(2, abyte0);
	//   10   18:aload_1         
	//   11   19:iconst_2        
	//   12   20:aload_2         
	//   13   21:invokevirtual   #57  <Method void awh.a(int, byte[])>
		super.a(awh1);
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:invokespecial   #59  <Method void awj.a(awh)>
	//   17   29:return          
	}

	private static volatile ayi c[];
	public byte a[];
	public byte b[];
}
