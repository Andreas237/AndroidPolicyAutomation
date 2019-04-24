// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			cwn

class cwn$5
	implements Runnable
{

	public void run()
	{
		cwn.c(e, d);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field cwn e>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Throwable d>
	//    4    8:invokestatic    #28  <Method void cwn.c(cwn, Throwable)>
	//    5   11:return          
	}

	final Throwable d;
	final cwn e;

	cwn$5(cwn cwn1, Throwable throwable)
	{
		e = cwn1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field cwn e>
		d = throwable;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field Throwable d>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
