// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.internal.ads:
//			b, bgo, boq, bhp, 
//			bwq, de

public final class bfn
	implements b
{

	public bfn(Handler handler)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = ((Executor) (new bgo(this, handler)));
	//    2    4:aload_0         
	//    3    5:new             #15  <Class bgo>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #18  <Method void bgo(bfn, Handler)>
	//    8   14:putfield        #20  <Field Executor a>
	//    9   17:return          
	}

	public final void a(boq boq1, bwq bwq1)
	{
		a(boq1, bwq1, ((Runnable) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #25  <Method void a(boq, bwq, Runnable)>
	//    5    7:return          
	}

	public final void a(boq boq1, bwq bwq1, Runnable runnable)
	{
		boq1.l();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #30  <Method void boq.l()>
		boq1.b("post-response");
	//    2    4:aload_1         
	//    3    5:ldc1            #32  <String "post-response">
	//    4    7:invokevirtual   #36  <Method void boq.b(String)>
		a.execute(((Runnable) (new bhp(boq1, bwq1, runnable))));
	//    5   10:aload_0         
	//    6   11:getfield        #20  <Field Executor a>
	//    7   14:new             #38  <Class bhp>
	//    8   17:dup             
	//    9   18:aload_1         
	//   10   19:aload_2         
	//   11   20:aload_3         
	//   12   21:invokespecial   #40  <Method void bhp(boq, bwq, Runnable)>
	//   13   24:invokeinterface #46  <Method void Executor.execute(Runnable)>
	//   14   29:return          
	}

	public final void a(boq boq1, de de)
	{
		boq1.b("post-error");
	//    0    0:aload_1         
	//    1    1:ldc1            #49  <String "post-error">
	//    2    3:invokevirtual   #36  <Method void boq.b(String)>
		de = ((de) (bwq.a(de)));
	//    3    6:aload_2         
	//    4    7:invokestatic    #54  <Method bwq bwq.a(de)>
	//    5   10:astore_2        
		a.execute(((Runnable) (new bhp(boq1, ((bwq) (de)), ((Runnable) (null))))));
	//    6   11:aload_0         
	//    7   12:getfield        #20  <Field Executor a>
	//    8   15:new             #38  <Class bhp>
	//    9   18:dup             
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:aconst_null     
	//   13   22:invokespecial   #40  <Method void bhp(boq, bwq, Runnable)>
	//   14   25:invokeinterface #46  <Method void Executor.execute(Runnable)>
	//   15   30:return          
	}

	private final Executor a;
}
