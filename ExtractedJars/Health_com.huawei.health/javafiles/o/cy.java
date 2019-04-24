// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			cf

public abstract class cy
{

	public cy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		c = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #14  <Field boolean c>
	//    5    9:return          
	}

	public final void g()
	{
		c = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #14  <Field boolean c>
	//    3    5:return          
	}

	public final cf h()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field cf d>
	//    2    4:areturn         
	}

	public final boolean i()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field boolean c>
	//    2    4:ireturn         
	}

	private boolean c;
	protected cf d;
}
