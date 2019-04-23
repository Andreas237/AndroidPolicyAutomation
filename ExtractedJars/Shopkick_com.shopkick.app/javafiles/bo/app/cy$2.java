// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;


// Referenced classes of package bo.app:
//			cy, dd, bu

class cy$2
	implements Runnable
{

	public void run()
	{
		cy.a(b).b(a);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field cy b>
	//    2    4:invokestatic    #28  <Method dd cy.a(cy)>
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field bu a>
	//    5   11:invokeinterface #31  <Method void dd.b(bu)>
	//    6   16:return          
	}

	final bu a;
	final cy b;

	cy$2(cy cy1, bu bu)
	{
		b = cy1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field cy b>
		a = bu;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field bu a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
