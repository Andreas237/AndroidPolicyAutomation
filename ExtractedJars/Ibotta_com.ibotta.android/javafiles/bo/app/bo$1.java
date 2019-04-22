// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;


// Referenced classes of package bo.app:
//			bo

class bo$1
	implements Runnable
{

	public void run()
	{
		a.d();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field bo a>
	//    2    4:invokevirtual   #24  <Method void bo.d()>
	//    3    7:return          
	}

	final bo a;

	bo$1(bo bo1)
	{
		a = bo1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field bo a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
