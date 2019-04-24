// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzanz, zzank, zzaoj

final class zzanq
	implements Runnable
{

	zzanq(zzaoj zzaoj1, zzank zzank1, zzanz zzanz1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzbnu = zzaoj1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field zzaoj zzbnu>
		zzcvl = zzank1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field zzank zzcvl>
		zzcvm = zzanz1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #23  <Field zzanz zzcvm>
	//   11   19:return          
	}

	public final void run()
	{
		CancellationException cancellationexception;
		zzaoj zzaoj1 = zzbnu;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzaoj zzbnu>
	//    2    4:astore_3        
		zzank zzank1 = zzcvl;
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field zzank zzcvl>
	//    5    9:astore_1        
		zzanz zzanz1 = zzcvm;
	//    6   10:aload_0         
	//    7   11:getfield        #23  <Field zzanz zzcvm>
	//    8   14:astore_2        
		try
		{
			zzaoj1.set(zzank1.apply(zzanz1.get()));
	//    9   15:aload_3         
	//   10   16:aload_1         
	//   11   17:aload_2         
	//   12   18:invokeinterface #39  <Method Object zzanz.get()>
	//   13   23:invokeinterface #45  <Method Object zzank.apply(Object)>
	//   14   28:invokevirtual   #51  <Method void zzaoj.set(Object)>
			return;
	//   15   31:return          
		}
	//*  16   32:astore_1        
	//*  17   33:aload_3         
	//*  18   34:aload_1         
	//*  19   35:invokevirtual   #55  <Method void zzaoj.setException(Throwable)>
	//*  20   38:return          
	//*  21   39:astore_1        
	//*  22   40:invokestatic    #61  <Method Thread Thread.currentThread()>
	//*  23   43:invokevirtual   #64  <Method void Thread.interrupt()>
	//*  24   46:aload_3         
	//*  25   47:aload_1         
	//*  26   48:invokevirtual   #55  <Method void zzaoj.setException(Throwable)>
	//*  27   51:return          
	//*  28   52:astore_1        
	//*  29   53:aload_1         
	//*  30   54:invokevirtual   #68  <Method Throwable ExecutionException.getCause()>
	//*  31   57:astore_2        
	//*  32   58:aload_2         
	//*  33   59:ifnonnull       65
	//*  34   62:goto            67
	//*  35   65:aload_2         
	//*  36   66:astore_1        
	//*  37   67:aload_3         
	//*  38   68:aload_1         
	//*  39   69:invokevirtual   #55  <Method void zzaoj.setException(Throwable)>
	//*  40   72:return          
	//*  41   73:aload_3         
	//*  42   74:iconst_1        
	//*  43   75:invokevirtual   #72  <Method boolean zzaoj.cancel(boolean)>
	//*  44   78:pop             
	//*  45   79:return          
		// Misplaced declaration of an exception variable
		catch(CancellationException cancellationexception)
		{
			zzaoj1.cancel(true);
		}
		catch(Object obj)
		{
			Throwable throwable = ((ExecutionException) (obj)).getCause();
			if(throwable != null)
				obj = ((Object) (throwable));
			zzaoj1.setException(((Throwable) (obj)));
			return;
		}
		catch(InterruptedException interruptedexception)
		{
			Thread.currentThread().interrupt();
			zzaoj1.setException(((Throwable) (interruptedexception)));
			return;
		}
		catch(Exception exception)
		{
			zzaoj1.setException(((Throwable) (exception)));
			return;
		}
	//*  46   80:astore_1        
	//*  47   81:goto            73
	}

	private final zzaoj zzbnu;
	private final zzank zzcvl;
	private final zzanz zzcvm;
}
