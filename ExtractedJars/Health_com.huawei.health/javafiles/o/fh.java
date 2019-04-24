// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			fe, fi

public final class fh
	implements Runnable
{

	public fh(fe fe1)
	{
		c = fe1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field fe c>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		try
		{
			c.e();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field fe c>
	//    2    4:invokevirtual   #24  <Method void fe.e()>
			return;
	//    3    7:return          
		}
		catch(Exception exception)
	//*   4    8:astore_1        
		{
			fi.c(((Throwable) (exception)));
	//    5    9:aload_1         
	//    6   10:invokestatic    #29  <Method void fi.c(Throwable)>
		}
	//    7   13:return          
	}

	final fe c;
}
