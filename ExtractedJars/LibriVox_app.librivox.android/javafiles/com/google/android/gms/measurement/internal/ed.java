// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.measurement.internal;


// Referenced classes of package com.google.android.gms.measurement.internal:
//			ec, ee

abstract class ed extends ec
{

	ed(ee ee1)
	{
		super(ee1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void ec(ee)>
		a.a(this);
	//    3    5:aload_0         
	//    4    6:getfield        #14  <Field ee a>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #19  <Method void ee.a(ed)>
	//    7   13:return          
	}

	protected abstract boolean e();

	final boolean j()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field boolean b>
	//    2    4:ifeq            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	protected final void k()
	{
		if(j())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #29  <Method boolean j()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		else
			throw new IllegalStateException("Not initialized");
	//    4    8:new             #31  <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:ldc1            #33  <String "Not initialized">
	//    7   14:invokespecial   #36  <Method void IllegalStateException(String)>
	//    8   17:athrow          
	}

	public final void v()
	{
		if(!b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field boolean b>
	//*   2    4:ifne            25
		{
			e();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #39  <Method boolean e()>
	//    5   11:pop             
			a.o();
	//    6   12:aload_0         
	//    7   13:getfield        #14  <Field ee a>
	//    8   16:invokevirtual   #42  <Method void ee.o()>
			b = true;
	//    9   19:aload_0         
	//   10   20:iconst_1        
	//   11   21:putfield        #25  <Field boolean b>
			return;
	//   12   24:return          
		} else
		{
			throw new IllegalStateException("Can't initialize twice");
	//   13   25:new             #31  <Class IllegalStateException>
	//   14   28:dup             
	//   15   29:ldc1            #44  <String "Can't initialize twice">
	//   16   31:invokespecial   #36  <Method void IllegalStateException(String)>
	//   17   34:athrow          
		}
	}

	private boolean b;
}
