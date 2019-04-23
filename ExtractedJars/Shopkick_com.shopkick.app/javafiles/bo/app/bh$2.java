// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.*;
import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//			bh, aa

class bh$2 extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		context = ((Context) (bh.a(a)));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field bh a>
	//    2    4:invokestatic    #25  <Method Object bh.a(bh)>
	//    3    7:astore_1        
		context;
	//    4    8:aload_1         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		try
		{
			bh.b(a);
	//    6   10:aload_0         
	//    7   11:getfield        #14  <Field bh a>
	//    8   14:invokestatic    #28  <Method void bh.b(bh)>
			break MISSING_BLOCK_LABEL_54;
	//    9   17:goto            54
		}
	//*  10   20:astore_2        
	//*  11   21:goto            57
		// Misplaced declaration of an exception variable
		catch(Intent intent) { }
	//   12   24:astore_2        
		break MISSING_BLOCK_LABEL_25;
		intent;
		break MISSING_BLOCK_LABEL_57;
		try
		{
			bh.c(a).a(((Object) (intent)), java/lang/Throwable);
	//   13   25:aload_0         
	//   14   26:getfield        #14  <Field bh a>
	//   15   29:invokestatic    #32  <Method aa bh.c(bh)>
	//   16   32:aload_2         
	//   17   33:ldc1            #34  <Class Throwable>
	//   18   35:invokeinterface #39  <Method void aa.a(Object, Class)>
			break MISSING_BLOCK_LABEL_54;
	//   19   40:goto            54
		}
		// Misplaced declaration of an exception variable
		catch(Intent intent) { }
	//   20   43:astore_2        
		AppboyLogger.e(bh.h(), "Failed to log throwable.", ((Throwable) (intent)));
	//   21   44:invokestatic    #43  <Method String bh.h()>
	//   22   47:ldc1            #45  <String "Failed to log throwable.">
	//   23   49:aload_2         
	//   24   50:invokestatic    #51  <Method int AppboyLogger.e(String, String, Throwable)>
	//   25   53:pop             
		context;
	//   26   54:aload_1         
		JVM INSTR monitorexit ;
	//   27   55:monitorexit     
		return;
	//   28   56:return          
		context;
	//   29   57:aload_1         
		JVM INSTR monitorexit ;
	//   30   58:monitorexit     
		throw intent;
	//   31   59:aload_2         
	//   32   60:athrow          
	}

	final bh a;

	bh$2(bh bh1)
	{
		a = bh1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field bh a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void BroadcastReceiver()>
	//    5    9:return          
	}
}
