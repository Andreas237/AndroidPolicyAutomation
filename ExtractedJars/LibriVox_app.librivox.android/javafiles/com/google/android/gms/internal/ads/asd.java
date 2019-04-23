// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			awj, awh, awg, awp

public final class asd extends awj
{

	public asd()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void awj()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #12  <Field String a>
		aa = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #16  <Field int aa>
	//    8   14:return          
	}

	protected final int a()
	{
		int j = super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method int awj.a()>
	//    2    4:istore_2        
		String s = a;
	//    3    5:aload_0         
	//    4    6:getfield        #12  <Field String a>
	//    5    9:astore_3        
		int i = j;
	//    6   10:iload_2         
	//    7   11:istore_1        
		if(s != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          24
			i = j + awh.b(1, s);
	//   10   16:iload_2         
	//   11   17:iconst_1        
	//   12   18:aload_3         
	//   13   19:invokestatic    #26  <Method int awh.b(int, String)>
	//   14   22:iadd            
	//   15   23:istore_1        
		return i;
	//   16   24:iload_1         
	//   17   25:ireturn         
	}

	public final awp a(awg awg1)
	{
		do
		{
			int i = awg1.a();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #30  <Method int awg.a()>
	//    2    4:istore_2        
			if(i == 0)
				break;
	//    3    5:iload_2         
	//    4    6:ifeq            37
			if(i != 10)
	//*   5    9:iload_2         
	//*   6   10:bipush          10
	//*   7   12:icmpeq          26
			{
				if(!super.a(awg1, i))
	//*   8   15:aload_0         
	//*   9   16:aload_1         
	//*  10   17:iload_2         
	//*  11   18:invokespecial   #33  <Method boolean awj.a(awg, int)>
	//*  12   21:ifne            0
					return ((awp) (this));
	//   13   24:aload_0         
	//   14   25:areturn         
			} else
			{
				a = awg1.e();
	//   15   26:aload_0         
	//   16   27:aload_1         
	//   17   28:invokevirtual   #37  <Method String awg.e()>
	//   18   31:putfield        #12  <Field String a>
			}
		} while(true);
	//   19   34:goto            0
		return ((awp) (this));
	//   20   37:aload_0         
	//   21   38:areturn         
	}

	public final void a(awh awh1)
	{
		String s = a;
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field String a>
	//    2    4:astore_2        
		if(s != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			awh1.a(1, s);
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:aload_2         
	//    8   12:invokevirtual   #41  <Method void awh.a(int, String)>
		super.a(awh1);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokespecial   #43  <Method void awj.a(awh)>
	//   12   20:return          
	}

	public String a;
}
