// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

// Referenced classes of package o:
//			ho

final class hn
	implements ServiceConnection
{

	hn(ho ho1)
	{
		a = ho1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field ho a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
	{
		componentname = ((ComponentName) (ho.c(a)));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field ho a>
	//    2    4:invokestatic    #24  <Method Object ho.c(ho)>
	//    3    7:astore_1        
		componentname;
	//    4    8:aload_1         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		ho.c(a, br.d.c(ibinder));
	//    6   10:aload_0         
	//    7   11:getfield        #12  <Field ho a>
	//    8   14:aload_2         
	//    9   15:invokestatic    #29  <Method br br$d.c(IBinder)>
	//   10   18:invokestatic    #32  <Method br ho.c(ho, br)>
	//   11   21:pop             
		ho.c(a).notify();
	//   12   22:aload_0         
	//   13   23:getfield        #12  <Field ho a>
	//   14   26:invokestatic    #24  <Method Object ho.c(ho)>
	//   15   29:invokevirtual   #35  <Method void Object.notify()>
		componentname;
	//   16   32:aload_1         
		JVM INSTR monitorexit ;
	//   17   33:monitorexit     
		return;
	//   18   34:return          
		ibinder;
	//   19   35:astore_2        
	//*  20   36:aload_1         
		throw ibinder;
	//   21   37:monitorexit     
	//   22   38:aload_2         
	//   23   39:athrow          
	}

	public final void onServiceDisconnected(ComponentName componentname)
	{
		ho.c(a, ((br) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field ho a>
	//    2    4:aconst_null     
	//    3    5:invokestatic    #32  <Method br ho.c(ho, br)>
	//    4    8:pop             
	//    5    9:return          
	}

	final ho a;
}
