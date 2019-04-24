// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.*;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzats, zzba, zzatt, zzatx, 
//			zzatv

final class zzatr
	implements com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
{

	public zzatr(Context context, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		packageName = s;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #26  <Field String packageName>
		zzdha = s1;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #28  <Field String zzdha>
	//    8   14:aload_0         
	//    9   15:new             #30  <Class HandlerThread>
	//   10   18:dup             
	//   11   19:ldc1            #32  <String "GassClient">
	//   12   21:invokespecial   #35  <Method void HandlerThread(String)>
	//   13   24:putfield        #37  <Field HandlerThread zzdhc>
		zzdhc.start();
	//   14   27:aload_0         
	//   15   28:getfield        #37  <Field HandlerThread zzdhc>
	//   16   31:invokevirtual   #40  <Method void HandlerThread.start()>
		zzdgz = new zzats(context, zzdhc.getLooper(), ((com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks) (this)), ((com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener) (this)));
	//   17   34:aload_0         
	//   18   35:new             #42  <Class zzats>
	//   19   38:dup             
	//   20   39:aload_1         
	//   21   40:aload_0         
	//   22   41:getfield        #37  <Field HandlerThread zzdhc>
	//   23   44:invokevirtual   #46  <Method android.os.Looper HandlerThread.getLooper()>
	//   24   47:aload_0         
	//   25   48:aload_0         
	//   26   49:invokespecial   #49  <Method void zzats(Context, android.os.Looper, com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener)>
	//   27   52:putfield        #51  <Field zzats zzdgz>
	//   28   55:aload_0         
	//   29   56:new             #53  <Class LinkedBlockingQueue>
	//   30   59:dup             
	//   31   60:invokespecial   #54  <Method void LinkedBlockingQueue()>
	//   32   63:putfield        #56  <Field LinkedBlockingQueue zzdhb>
		zzdgz.checkAvailabilityAndConnect();
	//   33   66:aload_0         
	//   34   67:getfield        #51  <Field zzats zzdgz>
	//   35   70:invokevirtual   #59  <Method void zzats.checkAvailabilityAndConnect()>
	//   36   73:return          
	}

	private final void zznz()
	{
		if(zzdgz != null && (zzdgz.isConnected() || zzdgz.isConnecting()))
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field zzats zzdgz>
	//*   2    4:ifnull          34
	//*   3    7:aload_0         
	//*   4    8:getfield        #51  <Field zzats zzdgz>
	//*   5   11:invokevirtual   #65  <Method boolean zzats.isConnected()>
	//*   6   14:ifne            27
	//*   7   17:aload_0         
	//*   8   18:getfield        #51  <Field zzats zzdgz>
	//*   9   21:invokevirtual   #68  <Method boolean zzats.isConnecting()>
	//*  10   24:ifeq            34
			zzdgz.disconnect();
	//   11   27:aload_0         
	//   12   28:getfield        #51  <Field zzats zzdgz>
	//   13   31:invokevirtual   #71  <Method void zzats.disconnect()>
	//   14   34:return          
	}

	private final zzatx zzwb()
	{
		Object obj;
		zzatx zzatx1;
		try
		{
			zzatx1 = zzdgz.zzwd();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field zzats zzdgz>
	//    2    4:invokevirtual   #80  <Method zzatx zzats.zzwd()>
	//    3    7:astore_1        
		}
	//*   4    8:aload_1         
	//*   5    9:areturn         
	//*   6   10:aconst_null     
	//*   7   11:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			return null;
		}
		return zzatx1;
	//*   8   12:astore_1        
	//*   9   13:goto            10
	}

	private static zzba zzwc()
	{
		zzba zzba1 = new zzba();
	//    0    0:new             #84  <Class zzba>
	//    1    3:dup             
	//    2    4:invokespecial   #85  <Method void zzba()>
	//    3    7:astore_0        
		zzba1.zzdu = Long.valueOf(32768L);
	//    4    8:aload_0         
	//    5    9:ldc2w           #86  <Long 32768L>
	//    6   12:invokestatic    #93  <Method Long Long.valueOf(long)>
	//    7   15:putfield        #97  <Field Long zzba.zzdu>
		return zzba1;
	//    8   18:aload_0         
	//    9   19:areturn         
	}

	public final void onConnected(Bundle bundle)
	{
		bundle = ((Bundle) (zzwb()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #106 <Method zzatx zzwb()>
	//    2    4:astore_1        
		if(bundle == null) goto _L2; else goto _L1
	//    3    5:aload_1         
	//    4    6:ifnull          86
_L1:
		bundle = ((Bundle) (((zzatx) (bundle)).zza(new zzatt(packageName, zzdha)).zzwe()));
	//    5    9:aload_1         
	//    6   10:new             #108 <Class zzatt>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #26  <Field String packageName>
	//   10   18:aload_0         
	//   11   19:getfield        #28  <Field String zzdha>
	//   12   22:invokespecial   #111 <Method void zzatt(String, String)>
	//   13   25:invokeinterface #117 <Method zzatv zzatx.zza(zzatt)>
	//   14   30:invokevirtual   #122 <Method zzba zzatv.zzwe()>
	//   15   33:astore_1        
		zzdhb.put(((Object) (bundle)));
	//   16   34:aload_0         
	//   17   35:getfield        #56  <Field LinkedBlockingQueue zzdhb>
	//   18   38:aload_1         
	//   19   39:invokevirtual   #126 <Method void LinkedBlockingQueue.put(Object)>
_L4:
		zznz();
	//   20   42:aload_0         
	//   21   43:invokespecial   #128 <Method void zznz()>
		zzdhc.quit();
	//   22   46:aload_0         
	//   23   47:getfield        #37  <Field HandlerThread zzdhc>
	//   24   50:invokevirtual   #131 <Method boolean HandlerThread.quit()>
	//   25   53:pop             
		return;
	//   26   54:return          
		bundle;
	//   27   55:astore_1        
		  goto _L3
	//*  28   56:goto            72
_L5:
		try
		{
			zzdhb.put(((Object) (zzwc())));
	//   29   59:aload_0         
	//   30   60:getfield        #56  <Field LinkedBlockingQueue zzdhb>
	//   31   63:invokestatic    #133 <Method zzba zzwc()>
	//   32   66:invokevirtual   #126 <Method void LinkedBlockingQueue.put(Object)>
		}
	//*  33   69:goto            42
	//*  34   72:aload_0         
	//*  35   73:invokespecial   #128 <Method void zznz()>
	//*  36   76:aload_0         
	//*  37   77:getfield        #37  <Field HandlerThread zzdhc>
	//*  38   80:invokevirtual   #131 <Method boolean HandlerThread.quit()>
	//*  39   83:pop             
	//*  40   84:aload_1         
	//*  41   85:athrow          
	//*  42   86:return          
	//*  43   87:astore_1        
	//*  44   88:goto            59
		// Misplaced declaration of an exception variable
		catch(Bundle bundle) { }
	//   45   91:astore_1        
		if(true) goto _L4; else goto _L3
	//   46   92:goto            42
_L3:
		zznz();
		zzdhc.quit();
		throw bundle;
_L2:
		return;
		bundle;
		  goto _L5
	}

	public final void onConnectionFailed(ConnectionResult connectionresult)
	{
		try
		{
			zzdhb.put(((Object) (zzwc())));
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field LinkedBlockingQueue zzdhb>
	//    2    4:invokestatic    #133 <Method zzba zzwc()>
	//    3    7:invokevirtual   #126 <Method void LinkedBlockingQueue.put(Object)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(ConnectionResult connectionresult)
	//*   5   11:astore_1        
		{
			return;
	//    6   12:return          
		}
	}

	public final void onConnectionSuspended(int i)
	{
		try
		{
			zzdhb.put(((Object) (zzwc())));
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field LinkedBlockingQueue zzdhb>
	//    2    4:invokestatic    #133 <Method zzba zzwc()>
	//    3    7:invokevirtual   #126 <Method void LinkedBlockingQueue.put(Object)>
			return;
	//    4   10:return          
		}
		catch(InterruptedException interruptedexception)
	//*   5   11:astore_2        
		{
			return;
	//    6   12:return          
		}
	}

	public final zzba zzak(int i)
	{
		InterruptedException interruptedexception;
		zzba zzba1;
		try
		{
			zzba1 = (zzba)zzdhb.poll(5000L, TimeUnit.MILLISECONDS);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field LinkedBlockingQueue zzdhb>
	//    2    4:ldc2w           #140 <Long 5000L>
	//    3    7:getstatic       #147 <Field TimeUnit TimeUnit.MILLISECONDS>
	//    4   10:invokevirtual   #151 <Method Object LinkedBlockingQueue.poll(long, TimeUnit)>
	//    5   13:checkcast       #84  <Class zzba>
	//    6   16:astore_2        
		}
	//*   7   17:goto            22
	//*   8   20:aconst_null     
	//*   9   21:astore_2        
	//*  10   22:aload_2         
	//*  11   23:astore_3        
	//*  12   24:aload_2         
	//*  13   25:ifnonnull       32
	//*  14   28:invokestatic    #133 <Method zzba zzwc()>
	//*  15   31:astore_3        
	//*  16   32:aload_3         
	//*  17   33:areturn         
		// Misplaced declaration of an exception variable
		catch(InterruptedException interruptedexception)
		{
			zzba1 = null;
		}
		zzba zzba2 = zzba1;
		if(zzba1 == null)
			zzba2 = zzwc();
		return zzba2;
	//*  18   34:astore_2        
	//*  19   35:goto            20
	}

	private final String packageName;
	private zzats zzdgz;
	private final String zzdha;
	private final LinkedBlockingQueue zzdhb = new LinkedBlockingQueue();
	private final HandlerThread zzdhc = new HandlerThread("GassClient");
}
