// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			fm

final class fj
	implements ho.d
{

	fj(fm fm1)
	{
		c = fm1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field fm c>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void c()
	{
		fm.d(c);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field fm c>
	//    2    4:invokestatic    #21  <Method void fm.d(fm)>
	//    3    7:return          
	}

	final fm c;
}