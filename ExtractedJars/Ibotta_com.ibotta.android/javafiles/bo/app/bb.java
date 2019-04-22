// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

// Referenced classes of package bo.app:
//			az, ep

public final class bb extends az
{

	public bb(String s)
	{
		super(s, ep.a(), ep.b(), ep.c(), TimeUnit.SECONDS, ep.d());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #12  <Method int ep.a()>
	//    3    5:invokestatic    #15  <Method int ep.b()>
	//    4    8:invokestatic    #19  <Method long ep.c()>
	//    5   11:getstatic       #25  <Field TimeUnit TimeUnit.SECONDS>
	//    6   14:invokestatic    #29  <Method java.util.concurrent.BlockingQueue ep.d()>
	//    7   17:invokespecial   #32  <Method void az(String, int, int, long, TimeUnit, java.util.concurrent.BlockingQueue)>
	//    8   20:return          
	}

	public bb(String s, ThreadFactory threadfactory)
	{
		super(s, ep.a(), ep.b(), ep.c(), TimeUnit.SECONDS, ep.d(), threadfactory);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #12  <Method int ep.a()>
	//    3    5:invokestatic    #15  <Method int ep.b()>
	//    4    8:invokestatic    #19  <Method long ep.c()>
	//    5   11:getstatic       #25  <Field TimeUnit TimeUnit.SECONDS>
	//    6   14:invokestatic    #29  <Method java.util.concurrent.BlockingQueue ep.d()>
	//    7   17:aload_2         
	//    8   18:invokespecial   #37  <Method void az(String, int, int, long, TimeUnit, java.util.concurrent.BlockingQueue, ThreadFactory)>
	//    9   21:return          
	}
}
