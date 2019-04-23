// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bnb, bnw, bnf, bmy, 
//			bmz, bmx

public final class bmw
	implements bnb
{

	public bmw(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		a = bnw.a(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #22  <Method ExecutorService bnw.a(String)>
	//    5    9:putfield        #24  <Field ExecutorService a>
	//    6   12:return          
	}

	static bmy a(bmw bmw1)
	{
		return bmw1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field bmy b>
	//    2    4:areturn         
	}

	static bmy a(bmw bmw1, bmy bmy1)
	{
		bmw1.b = bmy1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field bmy b>
		return bmy1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static IOException a(bmw bmw1, IOException ioexception)
	{
		bmw1.c = ioexception;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field IOException c>
		return ioexception;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static ExecutorService b(bmw bmw1)
	{
		return bmw1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ExecutorService a>
	//    2    4:areturn         
	}

	public final long a(bmz bmz, bmx bmx, int i)
	{
		Looper looper = Looper.myLooper();
	//    0    0:invokestatic    #40  <Method Looper Looper.myLooper()>
	//    1    3:astore          7
		boolean flag;
		if(looper != null)
	//*   2    5:aload           7
	//*   3    7:ifnull          16
			flag = true;
	//    4   10:iconst_1        
	//    5   11:istore          4
		else
	//*   6   13:goto            19
			flag = false;
	//    7   16:iconst_0        
	//    8   17:istore          4
		bnf.b(flag);
	//    9   19:iload           4
	//   10   21:invokestatic    #45  <Method void bnf.b(boolean)>
		long l = SystemClock.elapsedRealtime();
	//   11   24:invokestatic    #51  <Method long SystemClock.elapsedRealtime()>
	//   12   27:lstore          5
		(new bmy(this, looper, bmz, bmx, i, l)).a(0L);
	//   13   29:new             #53  <Class bmy>
	//   14   32:dup             
	//   15   33:aload_0         
	//   16   34:aload           7
	//   17   36:aload_1         
	//   18   37:aload_2         
	//   19   38:iload_3         
	//   20   39:lload           5
	//   21   41:invokespecial   #56  <Method void bmy(bmw, Looper, bmz, bmx, int, long)>
	//   22   44:lconst_0        
	//   23   45:invokevirtual   #59  <Method void bmy.a(long)>
		return l;
	//   24   48:lload           5
	//   25   50:lreturn         
	}

	public final void a(int i)
	{
		Object obj = ((Object) (c));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field IOException c>
	//    2    4:astore_2        
		if(obj == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       27
		{
			obj = ((Object) (b));
	//    5    9:aload_0         
	//    6   10:getfield        #28  <Field bmy b>
	//    7   13:astore_2        
			if(obj != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          26
				((bmy) (obj)).a(((bmy) (obj)).a);
	//   10   18:aload_2         
	//   11   19:aload_2         
	//   12   20:getfield        #63  <Field int bmy.a>
	//   13   23:invokevirtual   #65  <Method void bmy.a(int)>
			return;
	//   14   26:return          
		} else
		{
			throw obj;
	//   15   27:aload_2         
	//   16   28:athrow          
		}
	}

	public final void a(Runnable runnable)
	{
		bmy bmy1 = b;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field bmy b>
	//    2    4:astore_2        
		if(bmy1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			bmy1.a(true);
	//    5    9:aload_2         
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #68  <Method void bmy.a(boolean)>
		if(runnable != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          28
			a.execute(runnable);
	//   10   18:aload_0         
	//   11   19:getfield        #24  <Field ExecutorService a>
	//   12   22:aload_1         
	//   13   23:invokeinterface #73  <Method void ExecutorService.execute(Runnable)>
		a.shutdown();
	//   14   28:aload_0         
	//   15   29:getfield        #24  <Field ExecutorService a>
	//   16   32:invokeinterface #76  <Method void ExecutorService.shutdown()>
	//   17   37:return          
	}

	public final boolean a()
	{
		return b != null;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field bmy b>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public final void b()
	{
		b.a(false);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field bmy b>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #68  <Method void bmy.a(boolean)>
	//    4    8:return          
	}

	public final void c()
	{
		Object obj = ((Object) (c));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field IOException c>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       27
		{
			obj = ((Object) (b));
	//    5    9:aload_0         
	//    6   10:getfield        #28  <Field bmy b>
	//    7   13:astore_1        
			if(obj != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          26
				((bmy) (obj)).a(((bmy) (obj)).a);
	//   10   18:aload_1         
	//   11   19:aload_1         
	//   12   20:getfield        #63  <Field int bmy.a>
	//   13   23:invokevirtual   #65  <Method void bmy.a(int)>
			return;
	//   14   26:return          
		} else
		{
			throw obj;
	//   15   27:aload_1         
	//   16   28:athrow          
		}
	}

	private final ExecutorService a;
	private bmy b;
	private IOException c;
}
