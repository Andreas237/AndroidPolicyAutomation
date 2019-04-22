// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;


// Referenced classes of package bo.app:
//			dm, ds, cc

class dm$2
	implements Runnable
{

	public void run()
	{
		dm.a(b).b(a);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field dm b>
	//    2    4:invokestatic    #28  <Method ds dm.a(dm)>
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field cc a>
	//    5   11:invokeinterface #31  <Method void ds.b(cc)>
	//    6   16:return          
	}

	final cc a;
	final dm b;

	dm$2(dm dm1, cc cc)
	{
		b = dm1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field dm b>
		a = cc;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field cc a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
