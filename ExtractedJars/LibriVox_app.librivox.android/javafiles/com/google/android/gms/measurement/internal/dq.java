// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.measurement.internal;


// Referenced classes of package com.google.android.gms.measurement.internal:
//			ct, ax

abstract class dq extends ct
{

	dq(ax ax1)
	{
		super(ax1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void ct(ax)>
		r.a(this);
	//    3    5:aload_0         
	//    4    6:getfield        #14  <Field ax r>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #19  <Method void ax.a(dq)>
	//    7   13:return          
	}

	final boolean D()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field boolean a>
	//    2    4:ifeq            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	protected final void E()
	{
		if(D())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #28  <Method boolean D()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		else
			throw new IllegalStateException("Not initialized");
	//    4    8:new             #30  <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:ldc1            #32  <String "Not initialized">
	//    7   14:invokespecial   #35  <Method void IllegalStateException(String)>
	//    8   17:athrow          
	}

	public final void F()
	{
		if(!a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field boolean a>
	//*   2    4:ifne            27
		{
			if(!v())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #39  <Method boolean v()>
	//*   5   11:ifne            26
			{
				r.G();
	//    6   14:aload_0         
	//    7   15:getfield        #14  <Field ax r>
	//    8   18:invokevirtual   #42  <Method void ax.G()>
				a = true;
	//    9   21:aload_0         
	//   10   22:iconst_1        
	//   11   23:putfield        #24  <Field boolean a>
			}
			return;
	//   12   26:return          
		} else
		{
			throw new IllegalStateException("Can't initialize twice");
	//   13   27:new             #30  <Class IllegalStateException>
	//   14   30:dup             
	//   15   31:ldc1            #44  <String "Can't initialize twice">
	//   16   33:invokespecial   #35  <Method void IllegalStateException(String)>
	//   17   36:athrow          
		}
	}

	public final void G()
	{
		if(!a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field boolean a>
	//*   2    4:ifne            24
		{
			w();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #47  <Method void w()>
			r.G();
	//    5   11:aload_0         
	//    6   12:getfield        #14  <Field ax r>
	//    7   15:invokevirtual   #42  <Method void ax.G()>
			a = true;
	//    8   18:aload_0         
	//    9   19:iconst_1        
	//   10   20:putfield        #24  <Field boolean a>
			return;
	//   11   23:return          
		} else
		{
			throw new IllegalStateException("Can't initialize twice");
	//   12   24:new             #30  <Class IllegalStateException>
	//   13   27:dup             
	//   14   28:ldc1            #44  <String "Can't initialize twice">
	//   15   30:invokespecial   #35  <Method void IllegalStateException(String)>
	//   16   33:athrow          
		}
	}

	protected abstract boolean v();

	protected void w()
	{
	//    0    0:return          
	}

	private boolean a;
}
