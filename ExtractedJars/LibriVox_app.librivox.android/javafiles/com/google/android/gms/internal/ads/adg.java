// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Handler;

// Referenced classes of package com.google.android.gms.internal.ads:
//			xg, aco

final class adg
	implements Runnable
{

	adg(aco aco1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		b = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #18  <Field boolean b>
		a = aco1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #20  <Field aco a>
	//    8   14:return          
	}

	private final void c()
	{
		xg.a.removeCallbacks(((Runnable) (this)));
	//    0    0:getstatic       #27  <Field Handler xg.a>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #33  <Method void Handler.removeCallbacks(Runnable)>
		xg.a.postDelayed(((Runnable) (this)), 250L);
	//    3    7:getstatic       #27  <Field Handler xg.a>
	//    4   10:aload_0         
	//    5   11:ldc2w           #34  <Long 250L>
	//    6   14:invokevirtual   #39  <Method boolean Handler.postDelayed(Runnable, long)>
	//    7   17:pop             
	//    8   18:return          
	}

	public final void a()
	{
		b = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #18  <Field boolean b>
		a.o();
	//    3    5:aload_0         
	//    4    6:getfield        #20  <Field aco a>
	//    5    9:invokevirtual   #44  <Method void aco.o()>
	//    6   12:return          
	}

	public final void b()
	{
		b = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #18  <Field boolean b>
		c();
	//    3    5:aload_0         
	//    4    6:invokespecial   #46  <Method void c()>
	//    5    9:return          
	}

	public final void run()
	{
		if(!b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field boolean b>
	//*   2    4:ifne            18
		{
			a.o();
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field aco a>
	//    5   11:invokevirtual   #44  <Method void aco.o()>
			c();
	//    6   14:aload_0         
	//    7   15:invokespecial   #46  <Method void c()>
		}
	//    8   18:return          
	}

	private aco a;
	private boolean b;
}
