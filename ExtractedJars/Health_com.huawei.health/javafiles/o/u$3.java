// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			u

class u$3
	implements android.view.TreeObserver.OnPreDrawListener
{

	public boolean onPreDraw()
	{
		e.f();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field u e>
	//    2    4:invokevirtual   #25  <Method void u.f()>
		return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
	}

	final u e;

	u$3(u u1)
	{
		e = u1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field u e>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
