// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

// Referenced classes of package bo.app:
//			az, ep

public final class bc extends az
{

	public bc(String s, ThreadFactory threadfactory)
	{
		super(s, 1, 1, 0L, a, ep.d(), threadfactory);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:iconst_1        
	//    4    4:lconst_0        
	//    5    5:getstatic       #15  <Field TimeUnit a>
	//    6    8:invokestatic    #24  <Method java.util.concurrent.BlockingQueue ep.d()>
	//    7   11:aload_2         
	//    8   12:invokespecial   #27  <Method void az(String, int, int, long, TimeUnit, java.util.concurrent.BlockingQueue, ThreadFactory)>
	//    9   15:return          
	}

	private static final TimeUnit a;

	static 
	{
		a = TimeUnit.MILLISECONDS;
	//    0    0:getstatic       #13  <Field TimeUnit TimeUnit.MILLISECONDS>
	//    1    3:putstatic       #15  <Field TimeUnit a>
	//*   2    6:return          
	}
}
