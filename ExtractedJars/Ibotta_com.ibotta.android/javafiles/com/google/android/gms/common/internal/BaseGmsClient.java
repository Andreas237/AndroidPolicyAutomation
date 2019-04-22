// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.*;
import android.os.*;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.*;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.common.internal:
//			Preconditions, GmsClientSupervisor, GmsServiceEndpoint, IGmsServiceBroker, 
//			ConnectionInfo, GetServiceRequest, IAccountAccessor

public abstract class BaseGmsClient
{
	public static interface BaseConnectionCallbacks
	{

		public abstract void onConnected(Bundle bundle);

		public abstract void onConnectionSuspended(int i);

		public static final int CAUSE_NETWORK_LOST = 2;
		public static final int CAUSE_SERVICE_DISCONNECTED = 1;
	}

	public static interface BaseOnConnectionFailedListener
	{

		public abstract void onConnectionFailed(ConnectionResult connectionresult);
	}

	protected abstract class CallbackProxy
	{

		public void deliverCallback()
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			Object obj;
			obj = zzli;
		//    2    2:aload_0         
		//    3    3:getfield        #24  <Field Object zzli>
		//    4    6:astore_1        
			if(zzrv)
		//*   5    7:aload_0         
		//*   6    8:getfield        #26  <Field boolean zzrv>
		//*   7   11:ifeq            67
			{
				String s = String.valueOf(((Object) (this)));
		//    8   14:aload_0         
		//    9   15:invokestatic    #38  <Method String String.valueOf(Object)>
		//   10   18:astore_2        
				StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 47);
		//   11   19:new             #40  <Class StringBuilder>
		//   12   22:dup             
		//   13   23:aload_2         
		//   14   24:invokestatic    #38  <Method String String.valueOf(Object)>
		//   15   27:invokevirtual   #44  <Method int String.length()>
		//   16   30:bipush          47
		//   17   32:iadd            
		//   18   33:invokespecial   #47  <Method void StringBuilder(int)>
		//   19   36:astore_3        
				stringbuilder.append("Callback proxy ");
		//   20   37:aload_3         
		//   21   38:ldc1            #49  <String "Callback proxy ">
		//   22   40:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
		//   23   43:pop             
				stringbuilder.append(s);
		//   24   44:aload_3         
		//   25   45:aload_2         
		//   26   46:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
		//   27   49:pop             
				stringbuilder.append(" being reused. This is not safe.");
		//   28   50:aload_3         
		//   29   51:ldc1            #55  <String " being reused. This is not safe.">
		//   30   53:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
		//   31   56:pop             
				Log.w("GmsClient", stringbuilder.toString());
		//   32   57:ldc1            #57  <String "GmsClient">
		//   33   59:aload_3         
		//   34   60:invokevirtual   #61  <Method String StringBuilder.toString()>
		//   35   63:invokestatic    #67  <Method int Log.w(String, String)>
		//   36   66:pop             
			}
			this;
		//   37   67:aload_0         
			JVM INSTR monitorexit ;
		//   38   68:monitorexit     
			if(obj != null)
		//*  39   69:aload_1         
		//*  40   70:ifnull          88
				try
				{
					deliverCallback(obj);
		//   41   73:aload_0         
		//   42   74:aload_1         
		//   43   75:invokevirtual   #70  <Method void deliverCallback(Object)>
				}
		//*  44   78:goto            92
				catch(RuntimeException runtimeexception)
		//*  45   81:astore_1        
				{
					onDeliverCallbackFailed();
		//   46   82:aload_0         
		//   47   83:invokevirtual   #73  <Method void onDeliverCallbackFailed()>
					throw runtimeexception;
		//   48   86:aload_1         
		//   49   87:athrow          
				}
			else
				onDeliverCallbackFailed();
		//   50   88:aload_0         
		//   51   89:invokevirtual   #73  <Method void onDeliverCallbackFailed()>
			this;
		//   52   92:aload_0         
			JVM INSTR monitorenter ;
		//   53   93:monitorenter    
			zzrv = true;
		//   54   94:aload_0         
		//   55   95:iconst_1        
		//   56   96:putfield        #26  <Field boolean zzrv>
			this;
		//   57   99:aload_0         
			JVM INSTR monitorexit ;
		//   58  100:monitorexit     
			unregister();
		//   59  101:aload_0         
		//   60  102:invokevirtual   #76  <Method void unregister()>
			return;
		//   61  105:return          
			Exception exception;
			exception;
		//   62  106:astore_1        
			this;
		//   63  107:aload_0         
			JVM INSTR monitorexit ;
		//   64  108:monitorexit     
			throw exception;
		//   65  109:aload_1         
		//   66  110:athrow          
			exception;
		//   67  111:astore_1        
			this;
		//   68  112:aload_0         
			JVM INSTR monitorexit ;
		//   69  113:monitorexit     
			throw exception;
		//   70  114:aload_1         
		//   71  115:athrow          
		}

		protected abstract void deliverCallback(Object obj);

		protected abstract void onDeliverCallbackFailed();

		public void removeListener()
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			zzli = null;
		//    2    2:aload_0         
		//    3    3:aconst_null     
		//    4    4:putfield        #24  <Field Object zzli>
			this;
		//    5    7:aload_0         
			JVM INSTR monitorexit ;
		//    6    8:monitorexit     
			return;
		//    7    9:return          
			Exception exception;
			exception;
		//    8   10:astore_1        
			this;
		//    9   11:aload_0         
			JVM INSTR monitorexit ;
		//   10   12:monitorexit     
			throw exception;
		//   11   13:aload_1         
		//   12   14:athrow          
		}

		public void unregister()
		{
			removeListener();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #79  <Method void removeListener()>
			synchronized(BaseGmsClient.zzf(zzru))
		//*   2    4:aload_0         
		//*   3    5:getfield        #19  <Field BaseGmsClient zzru>
		//*   4    8:invokestatic    #83  <Method ArrayList BaseGmsClient.zzf(BaseGmsClient)>
		//*   5   11:astore_1        
		//*   6   12:aload_1         
		//*   7   13:monitorenter    
			{
				BaseGmsClient.zzf(zzru).remove(((Object) (this)));
		//    8   14:aload_0         
		//    9   15:getfield        #19  <Field BaseGmsClient zzru>
		//   10   18:invokestatic    #83  <Method ArrayList BaseGmsClient.zzf(BaseGmsClient)>
		//   11   21:aload_0         
		//   12   22:invokevirtual   #89  <Method boolean ArrayList.remove(Object)>
		//   13   25:pop             
			}
		//   14   26:aload_1         
		//   15   27:monitorexit     
			return;
		//   16   28:return          
			exception;
		//   17   29:astore_2        
			arraylist;
		//   18   30:aload_1         
			JVM INSTR monitorexit ;
		//   19   31:monitorexit     
			throw exception;
		//   20   32:aload_2         
		//   21   33:athrow          
		}

		private Object zzli;
		private final BaseGmsClient zzru;
		private boolean zzrv;

		public CallbackProxy(Object obj)
		{
			zzru = BaseGmsClient.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field BaseGmsClient zzru>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #22  <Method void Object()>
			zzli = obj;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field Object zzli>
			zzrv = false;
		//    8   14:aload_0         
		//    9   15:iconst_0        
		//   10   16:putfield        #26  <Field boolean zzrv>
		//   11   19:return          
		}
	}

	public static interface ConnectionProgressReportCallbacks
	{

		public abstract void onReportServiceBinding(ConnectionResult connectionresult);
	}

	public static final class GmsCallbacks extends IGmsCallbacks.Stub
	{

		public final void onAccountValidationComplete(int i, Bundle bundle)
		{
			Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", ((Throwable) (new Exception())));
		//    0    0:ldc1            #30  <String "GmsClient">
		//    1    2:ldc1            #32  <String "received deprecated onAccountValidationComplete callback, ignoring">
		//    2    4:new             #34  <Class Exception>
		//    3    7:dup             
		//    4    8:invokespecial   #35  <Method void Exception()>
		//    5   11:invokestatic    #41  <Method int Log.wtf(String, String, Throwable)>
		//    6   14:pop             
		//    7   15:return          
		}

		public final void onPostInitComplete(int i, IBinder ibinder, Bundle bundle)
		{
			Preconditions.checkNotNull(((Object) (zzrw)), "onPostInitComplete can be called only once per call to getRemoteService");
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field BaseGmsClient zzrw>
		//    2    4:ldc1            #46  <String "onPostInitComplete can be called only once per call to getRemoteService">
		//    3    6:invokestatic    #52  <Method Object Preconditions.checkNotNull(Object, Object)>
		//    4    9:pop             
			zzrw.onPostInitHandler(i, ibinder, bundle, zzrx);
		//    5   10:aload_0         
		//    6   11:getfield        #20  <Field BaseGmsClient zzrw>
		//    7   14:iload_1         
		//    8   15:aload_2         
		//    9   16:aload_3         
		//   10   17:aload_0         
		//   11   18:getfield        #22  <Field int zzrx>
		//   12   21:invokevirtual   #56  <Method void BaseGmsClient.onPostInitHandler(int, IBinder, Bundle, int)>
			zzrw = null;
		//   13   24:aload_0         
		//   14   25:aconst_null     
		//   15   26:putfield        #20  <Field BaseGmsClient zzrw>
		//   16   29:return          
		}

		public final void onPostInitCompleteWithConnectionInfo(int i, IBinder ibinder, ConnectionInfo connectioninfo)
		{
			Preconditions.checkNotNull(((Object) (zzrw)), "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field BaseGmsClient zzrw>
		//    2    4:ldc1            #60  <String "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService">
		//    3    6:invokestatic    #52  <Method Object Preconditions.checkNotNull(Object, Object)>
		//    4    9:pop             
			Preconditions.checkNotNull(((Object) (connectioninfo)));
		//    5   10:aload_3         
		//    6   11:invokestatic    #63  <Method Object Preconditions.checkNotNull(Object)>
		//    7   14:pop             
			BaseGmsClient.zza(zzrw, connectioninfo);
		//    8   15:aload_0         
		//    9   16:getfield        #20  <Field BaseGmsClient zzrw>
		//   10   19:aload_3         
		//   11   20:invokestatic    #67  <Method void BaseGmsClient.zza(BaseGmsClient, ConnectionInfo)>
			onPostInitComplete(i, ibinder, connectioninfo.getResolutionBundle());
		//   12   23:aload_0         
		//   13   24:iload_1         
		//   14   25:aload_2         
		//   15   26:aload_3         
		//   16   27:invokevirtual   #73  <Method Bundle ConnectionInfo.getResolutionBundle()>
		//   17   30:invokevirtual   #75  <Method void onPostInitComplete(int, IBinder, Bundle)>
		//   18   33:return          
		}

		private BaseGmsClient zzrw;
		private final int zzrx;

		public GmsCallbacks(BaseGmsClient basegmsclient, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void IGmsCallbacks$Stub()>
			zzrw = basegmsclient;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field BaseGmsClient zzrw>
			zzrx = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #22  <Field int zzrx>
		//    8   14:return          
		}
	}

	public final class GmsServiceConnection
		implements ServiceConnection
	{

		public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_2         
		//*   1    1:ifnonnull       14
			{
				BaseGmsClient.zza(zzru, 16);
		//    2    4:aload_0         
		//    3    5:getfield        #18  <Field BaseGmsClient zzru>
		//    4    8:bipush          16
		//    5   10:invokestatic    #29  <Method void BaseGmsClient.zza(BaseGmsClient, int)>
				return;
		//    6   13:return          
			}
			synchronized(BaseGmsClient.zza(zzru))
		//*   7   14:aload_0         
		//*   8   15:getfield        #18  <Field BaseGmsClient zzru>
		//*   9   18:invokestatic    #32  <Method Object BaseGmsClient.zza(BaseGmsClient)>
		//*  10   21:astore_1        
		//*  11   22:aload_1         
		//*  12   23:monitorenter    
			{
				BaseGmsClient.zza(zzru, IGmsServiceBroker.Stub.asInterface(ibinder));
		//   13   24:aload_0         
		//   14   25:getfield        #18  <Field BaseGmsClient zzru>
		//   15   28:aload_2         
		//   16   29:invokestatic    #38  <Method IGmsServiceBroker IGmsServiceBroker$Stub.asInterface(IBinder)>
		//   17   32:invokestatic    #41  <Method IGmsServiceBroker BaseGmsClient.zza(BaseGmsClient, IGmsServiceBroker)>
		//   18   35:pop             
			}
		//   19   36:aload_1         
		//   20   37:monitorexit     
			zzru.onPostServiceBindingHandler(0, ((Bundle) (null)), zzrx);
		//   21   38:aload_0         
		//   22   39:getfield        #18  <Field BaseGmsClient zzru>
		//   23   42:iconst_0        
		//   24   43:aconst_null     
		//   25   44:aload_0         
		//   26   45:getfield        #23  <Field int zzrx>
		//   27   48:invokevirtual   #45  <Method void BaseGmsClient.onPostServiceBindingHandler(int, Bundle, int)>
			return;
		//   28   51:return          
			ibinder;
		//   29   52:astore_2        
			componentname;
		//   30   53:aload_1         
			JVM INSTR monitorexit ;
		//   31   54:monitorexit     
			throw ibinder;
		//   32   55:aload_2         
		//   33   56:athrow          
		}

		public final void onServiceDisconnected(ComponentName componentname)
		{
			synchronized(BaseGmsClient.zza(zzru))
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field BaseGmsClient zzru>
		//*   2    4:invokestatic    #32  <Method Object BaseGmsClient.zza(BaseGmsClient)>
		//*   3    7:astore_1        
		//*   4    8:aload_1         
		//*   5    9:monitorenter    
			{
				BaseGmsClient.zza(zzru, ((IGmsServiceBroker) (null)));
		//    6   10:aload_0         
		//    7   11:getfield        #18  <Field BaseGmsClient zzru>
		//    8   14:aconst_null     
		//    9   15:invokestatic    #41  <Method IGmsServiceBroker BaseGmsClient.zza(BaseGmsClient, IGmsServiceBroker)>
		//   10   18:pop             
			}
		//   11   19:aload_1         
		//   12   20:monitorexit     
			zzru.mHandler.sendMessage(zzru.mHandler.obtainMessage(6, zzrx, 1));
		//   13   21:aload_0         
		//   14   22:getfield        #18  <Field BaseGmsClient zzru>
		//   15   25:getfield        #51  <Field Handler BaseGmsClient.mHandler>
		//   16   28:aload_0         
		//   17   29:getfield        #18  <Field BaseGmsClient zzru>
		//   18   32:getfield        #51  <Field Handler BaseGmsClient.mHandler>
		//   19   35:bipush          6
		//   20   37:aload_0         
		//   21   38:getfield        #23  <Field int zzrx>
		//   22   41:iconst_1        
		//   23   42:invokevirtual   #57  <Method Message Handler.obtainMessage(int, int, int)>
		//   24   45:invokevirtual   #61  <Method boolean Handler.sendMessage(Message)>
		//   25   48:pop             
			return;
		//   26   49:return          
			exception;
		//   27   50:astore_2        
			componentname;
		//   28   51:aload_1         
			JVM INSTR monitorexit ;
		//   29   52:monitorexit     
			throw exception;
		//   30   53:aload_2         
		//   31   54:athrow          
		}

		private final BaseGmsClient zzru;
		private final int zzrx;

		public GmsServiceConnection(int i)
		{
			zzru = BaseGmsClient.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field BaseGmsClient zzru>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
			zzrx = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #23  <Field int zzrx>
		//    8   14:return          
		}
	}

	protected class LegacyClientCallbackAdapter
		implements ConnectionProgressReportCallbacks
	{

		public void onReportServiceBinding(ConnectionResult connectionresult)
		{
			if(connectionresult.isSuccess())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #28  <Method boolean ConnectionResult.isSuccess()>
		//*   2    4:ifeq            22
			{
				connectionresult = ((ConnectionResult) (zzru));
		//    3    7:aload_0         
		//    4    8:getfield        #15  <Field BaseGmsClient zzru>
		//    5   11:astore_1        
				((BaseGmsClient) (connectionresult)).getRemoteService(((IAccountAccessor) (null)), ((BaseGmsClient) (connectionresult)).getScopes());
		//    6   12:aload_1         
		//    7   13:aconst_null     
		//    8   14:aload_1         
		//    9   15:invokevirtual   #32  <Method Set BaseGmsClient.getScopes()>
		//   10   18:invokevirtual   #36  <Method void BaseGmsClient.getRemoteService(IAccountAccessor, Set)>
				return;
		//   11   21:return          
			}
			if(BaseGmsClient.zzg(zzru) != null)
		//*  12   22:aload_0         
		//*  13   23:getfield        #15  <Field BaseGmsClient zzru>
		//*  14   26:invokestatic    #40  <Method BaseGmsClient$BaseOnConnectionFailedListener BaseGmsClient.zzg(BaseGmsClient)>
		//*  15   29:ifnull          45
				BaseGmsClient.zzg(zzru).onConnectionFailed(connectionresult);
		//   16   32:aload_0         
		//   17   33:getfield        #15  <Field BaseGmsClient zzru>
		//   18   36:invokestatic    #40  <Method BaseGmsClient$BaseOnConnectionFailedListener BaseGmsClient.zzg(BaseGmsClient)>
		//   19   39:aload_1         
		//   20   40:invokeinterface #45  <Method void BaseGmsClient$BaseOnConnectionFailedListener.onConnectionFailed(ConnectionResult)>
		//   21   45:return          
		}

		private final BaseGmsClient zzru;

		public LegacyClientCallbackAdapter()
		{
			zzru = BaseGmsClient.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field BaseGmsClient zzru>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}

	protected final class PostInitCallback extends zza
	{

		protected final void handleServiceFailure(ConnectionResult connectionresult)
		{
			if(BaseGmsClient.zzg(zzru) != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field BaseGmsClient zzru>
		//*   2    4:invokestatic    #30  <Method BaseGmsClient$BaseOnConnectionFailedListener BaseGmsClient.zzg(BaseGmsClient)>
		//*   3    7:ifnull          23
				BaseGmsClient.zzg(zzru).onConnectionFailed(connectionresult);
		//    4   10:aload_0         
		//    5   11:getfield        #17  <Field BaseGmsClient zzru>
		//    6   14:invokestatic    #30  <Method BaseGmsClient$BaseOnConnectionFailedListener BaseGmsClient.zzg(BaseGmsClient)>
		//    7   17:aload_1         
		//    8   18:invokeinterface #35  <Method void BaseGmsClient$BaseOnConnectionFailedListener.onConnectionFailed(ConnectionResult)>
			zzru.onConnectionFailed(connectionresult);
		//    9   23:aload_0         
		//   10   24:getfield        #17  <Field BaseGmsClient zzru>
		//   11   27:aload_1         
		//   12   28:invokevirtual   #36  <Method void BaseGmsClient.onConnectionFailed(ConnectionResult)>
		//   13   31:return          
		}

		protected final boolean handleServiceSuccess()
		{
			RemoteException remoteexception;
label0:
			{
				boolean flag1 = false;
		//    0    0:iconst_0        
		//    1    1:istore_2        
				boolean flag;
				Object obj;
				try
				{
					obj = ((Object) (service.getInterfaceDescriptor()));
		//    2    2:aload_0         
		//    3    3:getfield        #22  <Field IBinder service>
		//    4    6:invokeinterface #46  <Method String IBinder.getInterfaceDescriptor()>
		//    5   11:astore_3        
				}
		//*   6   12:aload_0         
		//*   7   13:getfield        #17  <Field BaseGmsClient zzru>
		//*   8   16:invokevirtual   #49  <Method String BaseGmsClient.getServiceDescriptor()>
		//*   9   19:aload_3         
		//*  10   20:invokevirtual   #55  <Method boolean String.equals(Object)>
		//*  11   23:ifne            107
		//*  12   26:aload_0         
		//*  13   27:getfield        #17  <Field BaseGmsClient zzru>
		//*  14   30:invokevirtual   #49  <Method String BaseGmsClient.getServiceDescriptor()>
		//*  15   33:astore          4
		//*  16   35:new             #57  <Class StringBuilder>
		//*  17   38:dup             
		//*  18   39:aload           4
		//*  19   41:invokestatic    #61  <Method String String.valueOf(Object)>
		//*  20   44:invokevirtual   #65  <Method int String.length()>
		//*  21   47:bipush          34
		//*  22   49:iadd            
		//*  23   50:aload_3         
		//*  24   51:invokestatic    #61  <Method String String.valueOf(Object)>
		//*  25   54:invokevirtual   #65  <Method int String.length()>
		//*  26   57:iadd            
		//*  27   58:invokespecial   #68  <Method void StringBuilder(int)>
		//*  28   61:astore          5
		//*  29   63:aload           5
		//*  30   65:ldc1            #70  <String "service descriptor mismatch: ">
		//*  31   67:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
		//*  32   70:pop             
		//*  33   71:aload           5
		//*  34   73:aload           4
		//*  35   75:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
		//*  36   78:pop             
		//*  37   79:aload           5
		//*  38   81:ldc1            #76  <String " vs. ">
		//*  39   83:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
		//*  40   86:pop             
		//*  41   87:aload           5
		//*  42   89:aload_3         
		//*  43   90:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
		//*  44   93:pop             
		//*  45   94:ldc1            #78  <String "GmsClient">
		//*  46   96:aload           5
		//*  47   98:invokevirtual   #81  <Method String StringBuilder.toString()>
		//*  48  101:invokestatic    #87  <Method int Log.e(String, String)>
		//*  49  104:pop             
		//*  50  105:iconst_0        
		//*  51  106:ireturn         
		//*  52  107:aload_0         
		//*  53  108:getfield        #17  <Field BaseGmsClient zzru>
		//*  54  111:aload_0         
		//*  55  112:getfield        #22  <Field IBinder service>
		//*  56  115:invokevirtual   #91  <Method IInterface BaseGmsClient.createServiceInterface(IBinder)>
		//*  57  118:astore_3        
		//*  58  119:iload_2         
		//*  59  120:istore_1        
		//*  60  121:aload_3         
		//*  61  122:ifnull          195
		//*  62  125:aload_0         
		//*  63  126:getfield        #17  <Field BaseGmsClient zzru>
		//*  64  129:iconst_2        
		//*  65  130:iconst_4        
		//*  66  131:aload_3         
		//*  67  132:invokestatic    #95  <Method boolean BaseGmsClient.zza(BaseGmsClient, int, int, IInterface)>
		//*  68  135:ifne            153
		//*  69  138:iload_2         
		//*  70  139:istore_1        
		//*  71  140:aload_0         
		//*  72  141:getfield        #17  <Field BaseGmsClient zzru>
		//*  73  144:iconst_3        
		//*  74  145:iconst_4        
		//*  75  146:aload_3         
		//*  76  147:invokestatic    #95  <Method boolean BaseGmsClient.zza(BaseGmsClient, int, int, IInterface)>
		//*  77  150:ifeq            195
		//*  78  153:aload_0         
		//*  79  154:getfield        #17  <Field BaseGmsClient zzru>
		//*  80  157:aconst_null     
		//*  81  158:invokestatic    #98  <Method ConnectionResult BaseGmsClient.zza(BaseGmsClient, ConnectionResult)>
		//*  82  161:pop             
		//*  83  162:aload_0         
		//*  84  163:getfield        #17  <Field BaseGmsClient zzru>
		//*  85  166:invokevirtual   #102 <Method Bundle BaseGmsClient.getConnectionHint()>
		//*  86  169:astore_3        
		//*  87  170:aload_0         
		//*  88  171:getfield        #17  <Field BaseGmsClient zzru>
		//*  89  174:invokestatic    #106 <Method BaseGmsClient$BaseConnectionCallbacks BaseGmsClient.zze(BaseGmsClient)>
		//*  90  177:ifnull          193
		//*  91  180:aload_0         
		//*  92  181:getfield        #17  <Field BaseGmsClient zzru>
		//*  93  184:invokestatic    #106 <Method BaseGmsClient$BaseConnectionCallbacks BaseGmsClient.zze(BaseGmsClient)>
		//*  94  187:aload_3         
		//*  95  188:invokeinterface #112 <Method void BaseGmsClient$BaseConnectionCallbacks.onConnected(Bundle)>
		//*  96  193:iconst_1        
		//*  97  194:istore_1        
		//*  98  195:iload_1         
		//*  99  196:ireturn         
		//* 100  197:ldc1            #78  <String "GmsClient">
		//* 101  199:ldc1            #114 <String "service probably died">
		//* 102  201:invokestatic    #117 <Method int Log.w(String, String)>
		//* 103  204:pop             
		//* 104  205:iconst_0        
		//* 105  206:ireturn         
				// Misplaced declaration of an exception variable
				catch(RemoteException remoteexception)
				{
					Log.w("GmsClient", "service probably died");
					return false;
				}
				if(!zzru.getServiceDescriptor().equals(obj))
				{
					String s = zzru.getServiceDescriptor();
					StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 34 + String.valueOf(obj).length());
					stringbuilder.append("service descriptor mismatch: ");
					stringbuilder.append(s);
					stringbuilder.append(" vs. ");
					stringbuilder.append(((String) (obj)));
					Log.e("GmsClient", stringbuilder.toString());
					return false;
				}
				obj = ((Object) (zzru.createServiceInterface(service)));
				flag = flag1;
				if(obj == null)
					break label0;
				if(!BaseGmsClient.zza(zzru, 2, 4, ((IInterface) (obj))))
				{
					flag = flag1;
					if(!BaseGmsClient.zza(zzru, 3, 4, ((IInterface) (obj))))
						break label0;
				}
				BaseGmsClient.zza(zzru, ((ConnectionResult) (null)));
				obj = ((Object) (zzru.getConnectionHint()));
				if(BaseGmsClient.zze(zzru) != null)
					BaseGmsClient.zze(zzru).onConnected(((Bundle) (obj)));
				flag = true;
			}
			return flag;
		//* 106  207:astore_3        
		//* 107  208:goto            197
		}

		public final IBinder service;
		private final BaseGmsClient zzru;

		public PostInitCallback(int i, IBinder ibinder, Bundle bundle)
		{
			zzru = BaseGmsClient.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field BaseGmsClient zzru>
			super(i, bundle);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:iload_2         
		//    6    8:aload           4
		//    7   10:invokespecial   #20  <Method void BaseGmsClient$zza(BaseGmsClient, int, Bundle)>
			service = ibinder;
		//    8   13:aload_0         
		//    9   14:aload_3         
		//   10   15:putfield        #22  <Field IBinder service>
		//   11   18:return          
		}
	}

	protected final class PostServiceBindingCallback extends zza
	{

		protected final void handleServiceFailure(ConnectionResult connectionresult)
		{
			zzru.mConnectionProgressReportCallbacks.onReportServiceBinding(connectionresult);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field BaseGmsClient zzru>
		//    2    4:getfield        #27  <Field BaseGmsClient$ConnectionProgressReportCallbacks BaseGmsClient.mConnectionProgressReportCallbacks>
		//    3    7:aload_1         
		//    4    8:invokeinterface #32  <Method void BaseGmsClient$ConnectionProgressReportCallbacks.onReportServiceBinding(ConnectionResult)>
			zzru.onConnectionFailed(connectionresult);
		//    5   13:aload_0         
		//    6   14:getfield        #16  <Field BaseGmsClient zzru>
		//    7   17:aload_1         
		//    8   18:invokevirtual   #35  <Method void BaseGmsClient.onConnectionFailed(ConnectionResult)>
		//    9   21:return          
		}

		protected final boolean handleServiceSuccess()
		{
			zzru.mConnectionProgressReportCallbacks.onReportServiceBinding(ConnectionResult.RESULT_SUCCESS);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field BaseGmsClient zzru>
		//    2    4:getfield        #27  <Field BaseGmsClient$ConnectionProgressReportCallbacks BaseGmsClient.mConnectionProgressReportCallbacks>
		//    3    7:getstatic       #43  <Field ConnectionResult ConnectionResult.RESULT_SUCCESS>
		//    4   10:invokeinterface #32  <Method void BaseGmsClient$ConnectionProgressReportCallbacks.onReportServiceBinding(ConnectionResult)>
			return true;
		//    5   15:iconst_1        
		//    6   16:ireturn         
		}

		private final BaseGmsClient zzru;

		public PostServiceBindingCallback(int i, Bundle bundle)
		{
			zzru = BaseGmsClient.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field BaseGmsClient zzru>
			super(i, bundle);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:iload_2         
		//    6    8:aload_3         
		//    7    9:invokespecial   #18  <Method void BaseGmsClient$zza(BaseGmsClient, int, Bundle)>
		//    8   12:return          
		}
	}

	public static interface SignOutCallbacks
	{

		public abstract void onSignOutComplete();
	}

	private abstract class zza extends CallbackProxy
	{

		protected void deliverCallback(Boolean boolean1)
		{
			Object obj = null;
		//    0    0:aconst_null     
		//    1    1:astore_3        
			if(boolean1 == null)
		//*   2    2:aload_1         
		//*   3    3:ifnonnull       16
			{
				BaseGmsClient.zza(zzru, 1, ((IInterface) (null)));
		//    4    6:aload_0         
		//    5    7:getfield        #19  <Field BaseGmsClient zzru>
		//    6   10:iconst_1        
		//    7   11:aconst_null     
		//    8   12:invokestatic    #39  <Method void BaseGmsClient.zza(BaseGmsClient, int, IInterface)>
				return;
		//    9   15:return          
			}
			int i = statusCode;
		//   10   16:aload_0         
		//   11   17:getfield        #30  <Field int statusCode>
		//   12   20:istore_2        
			if(i != 0)
		//*  13   21:iload_2         
		//*  14   22:ifeq            100
				if(i != 10)
		//*  15   25:iload_2         
		//*  16   26:bipush          10
		//*  17   28:icmpeq          81
				{
					BaseGmsClient.zza(zzru, 1, ((IInterface) (null)));
		//   18   31:aload_0         
		//   19   32:getfield        #19  <Field BaseGmsClient zzru>
		//   20   35:iconst_1        
		//   21   36:aconst_null     
		//   22   37:invokestatic    #39  <Method void BaseGmsClient.zza(BaseGmsClient, int, IInterface)>
					Bundle bundle = resolution;
		//   23   40:aload_0         
		//   24   41:getfield        #32  <Field Bundle resolution>
		//   25   44:astore          4
					boolean1 = ((Boolean) (obj));
		//   26   46:aload_3         
		//   27   47:astore_1        
					if(bundle != null)
		//*  28   48:aload           4
		//*  29   50:ifnull          64
						boolean1 = ((Boolean) ((PendingIntent)bundle.getParcelable("pendingIntent")));
		//   30   53:aload           4
		//   31   55:ldc1            #41  <String "pendingIntent">
		//   32   57:invokevirtual   #47  <Method android.os.Parcelable Bundle.getParcelable(String)>
		//   33   60:checkcast       #49  <Class PendingIntent>
		//   34   63:astore_1        
					handleServiceFailure(new ConnectionResult(statusCode, ((PendingIntent) (boolean1))));
		//   35   64:aload_0         
		//   36   65:new             #51  <Class ConnectionResult>
		//   37   68:dup             
		//   38   69:aload_0         
		//   39   70:getfield        #30  <Field int statusCode>
		//   40   73:aload_1         
		//   41   74:invokespecial   #54  <Method void ConnectionResult(int, PendingIntent)>
		//   42   77:invokevirtual   #58  <Method void handleServiceFailure(ConnectionResult)>
					return;
		//   43   80:return          
				} else
				{
					BaseGmsClient.zza(zzru, 1, ((IInterface) (null)));
		//   44   81:aload_0         
		//   45   82:getfield        #19  <Field BaseGmsClient zzru>
		//   46   85:iconst_1        
		//   47   86:aconst_null     
		//   48   87:invokestatic    #39  <Method void BaseGmsClient.zza(BaseGmsClient, int, IInterface)>
					throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
		//   49   90:new             #60  <Class IllegalStateException>
		//   50   93:dup             
		//   51   94:ldc1            #62  <String "A fatal developer error has occurred. Check the logs for further information.">
		//   52   96:invokespecial   #65  <Method void IllegalStateException(String)>
		//   53   99:athrow          
				}
			if(!handleServiceSuccess())
		//*  54  100:aload_0         
		//*  55  101:invokevirtual   #69  <Method boolean handleServiceSuccess()>
		//*  56  104:ifne            130
			{
				BaseGmsClient.zza(zzru, 1, ((IInterface) (null)));
		//   57  107:aload_0         
		//   58  108:getfield        #19  <Field BaseGmsClient zzru>
		//   59  111:iconst_1        
		//   60  112:aconst_null     
		//   61  113:invokestatic    #39  <Method void BaseGmsClient.zza(BaseGmsClient, int, IInterface)>
				handleServiceFailure(new ConnectionResult(8, ((PendingIntent) (null))));
		//   62  116:aload_0         
		//   63  117:new             #51  <Class ConnectionResult>
		//   64  120:dup             
		//   65  121:bipush          8
		//   66  123:aconst_null     
		//   67  124:invokespecial   #54  <Method void ConnectionResult(int, PendingIntent)>
		//   68  127:invokevirtual   #58  <Method void handleServiceFailure(ConnectionResult)>
			}
		//   69  130:return          
		}

		protected volatile void deliverCallback(Object obj)
		{
			deliverCallback((Boolean)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #21  <Class Boolean>
		//    3    5:invokevirtual   #72  <Method void deliverCallback(Boolean)>
		//    4    8:return          
		}

		protected abstract void handleServiceFailure(ConnectionResult connectionresult);

		protected abstract boolean handleServiceSuccess();

		protected void onDeliverCallbackFailed()
		{
		//    0    0:return          
		}

		public final Bundle resolution;
		public final int statusCode;
		private final BaseGmsClient zzru;

		protected zza(int i, Bundle bundle)
		{
			zzru = BaseGmsClient.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field BaseGmsClient zzru>
			super(((Object) (Boolean.valueOf(true))));
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:iconst_1        
		//    6    8:invokestatic    #25  <Method Boolean Boolean.valueOf(boolean)>
		//    7   11:invokespecial   #28  <Method void BaseGmsClient$CallbackProxy(BaseGmsClient, Object)>
			statusCode = i;
		//    8   14:aload_0         
		//    9   15:iload_2         
		//   10   16:putfield        #30  <Field int statusCode>
			resolution = bundle;
		//   11   19:aload_0         
		//   12   20:aload_3         
		//   13   21:putfield        #32  <Field Bundle resolution>
		//   14   24:return          
		}
	}

	final class zzb extends Handler
	{

		private static void zza(Message message)
		{
			message = ((Message) ((CallbackProxy)message.obj));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Object Message.obj>
		//    2    4:checkcast       #27  <Class BaseGmsClient$CallbackProxy>
		//    3    7:astore_0        
			((CallbackProxy) (message)).onDeliverCallbackFailed();
		//    4    8:aload_0         
		//    5    9:invokevirtual   #31  <Method void BaseGmsClient$CallbackProxy.onDeliverCallbackFailed()>
			((CallbackProxy) (message)).unregister();
		//    6   12:aload_0         
		//    7   13:invokevirtual   #34  <Method void BaseGmsClient$CallbackProxy.unregister()>
		//    8   16:return          
		}

		private static boolean zzb(Message message)
		{
			if(message.what != 2 && message.what != 1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #39  <Field int Message.what>
		//*   2    4:iconst_2        
		//*   3    5:icmpeq          29
		//*   4    8:aload_0         
		//*   5    9:getfield        #39  <Field int Message.what>
		//*   6   12:iconst_1        
		//*   7   13:icmpeq          29
				return message.what == 7;
		//    8   16:aload_0         
		//    9   17:getfield        #39  <Field int Message.what>
		//   10   20:bipush          7
		//   11   22:icmpne          27
		//   12   25:iconst_1        
		//   13   26:ireturn         
		//   14   27:iconst_0        
		//   15   28:ireturn         
			else
				return true;
		//   16   29:iconst_1        
		//   17   30:ireturn         
		}

		public final void handleMessage(Message message)
		{
			if(zzru.mDisconnectCount.get() != message.arg1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #13  <Field BaseGmsClient zzru>
		//*   2    4:getfield        #44  <Field AtomicInteger BaseGmsClient.mDisconnectCount>
		//*   3    7:invokevirtual   #50  <Method int AtomicInteger.get()>
		//*   4   10:aload_1         
		//*   5   11:getfield        #53  <Field int Message.arg1>
		//*   6   14:icmpeq          29
			{
				if(zzb(message))
		//*   7   17:aload_1         
		//*   8   18:invokestatic    #55  <Method boolean zzb(Message)>
		//*   9   21:ifeq            28
					zza(message);
		//   10   24:aload_1         
		//   11   25:invokestatic    #57  <Method void zza(Message)>
				return;
		//   12   28:return          
			}
			if((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !zzru.isConnecting())
		//*  13   29:aload_1         
		//*  14   30:getfield        #39  <Field int Message.what>
		//*  15   33:iconst_1        
		//*  16   34:icmpeq          62
		//*  17   37:aload_1         
		//*  18   38:getfield        #39  <Field int Message.what>
		//*  19   41:bipush          7
		//*  20   43:icmpeq          62
		//*  21   46:aload_1         
		//*  22   47:getfield        #39  <Field int Message.what>
		//*  23   50:iconst_4        
		//*  24   51:icmpeq          62
		//*  25   54:aload_1         
		//*  26   55:getfield        #39  <Field int Message.what>
		//*  27   58:iconst_5        
		//*  28   59:icmpne          77
		//*  29   62:aload_0         
		//*  30   63:getfield        #13  <Field BaseGmsClient zzru>
		//*  31   66:invokevirtual   #61  <Method boolean BaseGmsClient.isConnecting()>
		//*  32   69:ifne            77
			{
				zza(message);
		//   33   72:aload_1         
		//   34   73:invokestatic    #57  <Method void zza(Message)>
				return;
		//   35   76:return          
			}
			int i = message.what;
		//   36   77:aload_1         
		//   37   78:getfield        #39  <Field int Message.what>
		//   38   81:istore_2        
			PendingIntent pendingintent = null;
		//   39   82:aconst_null     
		//   40   83:astore_3        
			if(i == 4)
		//*  41   84:iload_2         
		//*  42   85:iconst_4        
		//*  43   86:icmpne          191
			{
				BaseGmsClient.zza(zzru, new ConnectionResult(message.arg2));
		//   44   89:aload_0         
		//   45   90:getfield        #13  <Field BaseGmsClient zzru>
		//   46   93:new             #63  <Class ConnectionResult>
		//   47   96:dup             
		//   48   97:aload_1         
		//   49   98:getfield        #66  <Field int Message.arg2>
		//   50  101:invokespecial   #69  <Method void ConnectionResult(int)>
		//   51  104:invokestatic    #72  <Method ConnectionResult BaseGmsClient.zza(BaseGmsClient, ConnectionResult)>
		//   52  107:pop             
				if(BaseGmsClient.zzb(zzru) && !BaseGmsClient.zzc(zzru))
		//*  53  108:aload_0         
		//*  54  109:getfield        #13  <Field BaseGmsClient zzru>
		//*  55  112:invokestatic    #75  <Method boolean BaseGmsClient.zzb(BaseGmsClient)>
		//*  56  115:ifeq            138
		//*  57  118:aload_0         
		//*  58  119:getfield        #13  <Field BaseGmsClient zzru>
		//*  59  122:invokestatic    #78  <Method boolean BaseGmsClient.zzc(BaseGmsClient)>
		//*  60  125:ifne            138
				{
					BaseGmsClient.zza(zzru, 3, ((IInterface) (null)));
		//   61  128:aload_0         
		//   62  129:getfield        #13  <Field BaseGmsClient zzru>
		//   63  132:iconst_3        
		//   64  133:aconst_null     
		//   65  134:invokestatic    #81  <Method void BaseGmsClient.zza(BaseGmsClient, int, IInterface)>
					return;
		//   66  137:return          
				}
				if(BaseGmsClient.zzd(zzru) != null)
		//*  67  138:aload_0         
		//*  68  139:getfield        #13  <Field BaseGmsClient zzru>
		//*  69  142:invokestatic    #85  <Method ConnectionResult BaseGmsClient.zzd(BaseGmsClient)>
		//*  70  145:ifnull          159
					message = ((Message) (BaseGmsClient.zzd(zzru)));
		//   71  148:aload_0         
		//   72  149:getfield        #13  <Field BaseGmsClient zzru>
		//   73  152:invokestatic    #85  <Method ConnectionResult BaseGmsClient.zzd(BaseGmsClient)>
		//   74  155:astore_1        
				else
		//*  75  156:goto            169
					message = ((Message) (new ConnectionResult(8)));
		//   76  159:new             #63  <Class ConnectionResult>
		//   77  162:dup             
		//   78  163:bipush          8
		//   79  165:invokespecial   #69  <Method void ConnectionResult(int)>
		//   80  168:astore_1        
				zzru.mConnectionProgressReportCallbacks.onReportServiceBinding(((ConnectionResult) (message)));
		//   81  169:aload_0         
		//   82  170:getfield        #13  <Field BaseGmsClient zzru>
		//   83  173:getfield        #89  <Field BaseGmsClient$ConnectionProgressReportCallbacks BaseGmsClient.mConnectionProgressReportCallbacks>
		//   84  176:aload_1         
		//   85  177:invokeinterface #95  <Method void BaseGmsClient$ConnectionProgressReportCallbacks.onReportServiceBinding(ConnectionResult)>
				zzru.onConnectionFailed(((ConnectionResult) (message)));
		//   86  182:aload_0         
		//   87  183:getfield        #13  <Field BaseGmsClient zzru>
		//   88  186:aload_1         
		//   89  187:invokevirtual   #98  <Method void BaseGmsClient.onConnectionFailed(ConnectionResult)>
				return;
		//   90  190:return          
			}
			if(message.what == 5)
		//*  91  191:aload_1         
		//*  92  192:getfield        #39  <Field int Message.what>
		//*  93  195:iconst_5        
		//*  94  196:icmpne          252
			{
				if(BaseGmsClient.zzd(zzru) != null)
		//*  95  199:aload_0         
		//*  96  200:getfield        #13  <Field BaseGmsClient zzru>
		//*  97  203:invokestatic    #85  <Method ConnectionResult BaseGmsClient.zzd(BaseGmsClient)>
		//*  98  206:ifnull          220
					message = ((Message) (BaseGmsClient.zzd(zzru)));
		//   99  209:aload_0         
		//  100  210:getfield        #13  <Field BaseGmsClient zzru>
		//  101  213:invokestatic    #85  <Method ConnectionResult BaseGmsClient.zzd(BaseGmsClient)>
		//  102  216:astore_1        
				else
		//* 103  217:goto            230
					message = ((Message) (new ConnectionResult(8)));
		//  104  220:new             #63  <Class ConnectionResult>
		//  105  223:dup             
		//  106  224:bipush          8
		//  107  226:invokespecial   #69  <Method void ConnectionResult(int)>
		//  108  229:astore_1        
				zzru.mConnectionProgressReportCallbacks.onReportServiceBinding(((ConnectionResult) (message)));
		//  109  230:aload_0         
		//  110  231:getfield        #13  <Field BaseGmsClient zzru>
		//  111  234:getfield        #89  <Field BaseGmsClient$ConnectionProgressReportCallbacks BaseGmsClient.mConnectionProgressReportCallbacks>
		//  112  237:aload_1         
		//  113  238:invokeinterface #95  <Method void BaseGmsClient$ConnectionProgressReportCallbacks.onReportServiceBinding(ConnectionResult)>
				zzru.onConnectionFailed(((ConnectionResult) (message)));
		//  114  243:aload_0         
		//  115  244:getfield        #13  <Field BaseGmsClient zzru>
		//  116  247:aload_1         
		//  117  248:invokevirtual   #98  <Method void BaseGmsClient.onConnectionFailed(ConnectionResult)>
				return;
		//  118  251:return          
			}
			if(message.what == 3)
		//* 119  252:aload_1         
		//* 120  253:getfield        #39  <Field int Message.what>
		//* 121  256:iconst_3        
		//* 122  257:icmpne          313
			{
				if(message.obj instanceof PendingIntent)
		//* 123  260:aload_1         
		//* 124  261:getfield        #25  <Field Object Message.obj>
		//* 125  264:instanceof      #100 <Class PendingIntent>
		//* 126  267:ifeq            278
					pendingintent = (PendingIntent)message.obj;
		//  127  270:aload_1         
		//  128  271:getfield        #25  <Field Object Message.obj>
		//  129  274:checkcast       #100 <Class PendingIntent>
		//  130  277:astore_3        
				message = ((Message) (new ConnectionResult(message.arg2, pendingintent)));
		//  131  278:new             #63  <Class ConnectionResult>
		//  132  281:dup             
		//  133  282:aload_1         
		//  134  283:getfield        #66  <Field int Message.arg2>
		//  135  286:aload_3         
		//  136  287:invokespecial   #103 <Method void ConnectionResult(int, PendingIntent)>
		//  137  290:astore_1        
				zzru.mConnectionProgressReportCallbacks.onReportServiceBinding(((ConnectionResult) (message)));
		//  138  291:aload_0         
		//  139  292:getfield        #13  <Field BaseGmsClient zzru>
		//  140  295:getfield        #89  <Field BaseGmsClient$ConnectionProgressReportCallbacks BaseGmsClient.mConnectionProgressReportCallbacks>
		//  141  298:aload_1         
		//  142  299:invokeinterface #95  <Method void BaseGmsClient$ConnectionProgressReportCallbacks.onReportServiceBinding(ConnectionResult)>
				zzru.onConnectionFailed(((ConnectionResult) (message)));
		//  143  304:aload_0         
		//  144  305:getfield        #13  <Field BaseGmsClient zzru>
		//  145  308:aload_1         
		//  146  309:invokevirtual   #98  <Method void BaseGmsClient.onConnectionFailed(ConnectionResult)>
				return;
		//  147  312:return          
			}
			if(message.what == 6)
		//* 148  313:aload_1         
		//* 149  314:getfield        #39  <Field int Message.what>
		//* 150  317:bipush          6
		//* 151  319:icmpne          380
			{
				BaseGmsClient.zza(zzru, 5, ((IInterface) (null)));
		//  152  322:aload_0         
		//  153  323:getfield        #13  <Field BaseGmsClient zzru>
		//  154  326:iconst_5        
		//  155  327:aconst_null     
		//  156  328:invokestatic    #81  <Method void BaseGmsClient.zza(BaseGmsClient, int, IInterface)>
				if(BaseGmsClient.zze(zzru) != null)
		//* 157  331:aload_0         
		//* 158  332:getfield        #13  <Field BaseGmsClient zzru>
		//* 159  335:invokestatic    #107 <Method BaseGmsClient$BaseConnectionCallbacks BaseGmsClient.zze(BaseGmsClient)>
		//* 160  338:ifnull          357
					BaseGmsClient.zze(zzru).onConnectionSuspended(message.arg2);
		//  161  341:aload_0         
		//  162  342:getfield        #13  <Field BaseGmsClient zzru>
		//  163  345:invokestatic    #107 <Method BaseGmsClient$BaseConnectionCallbacks BaseGmsClient.zze(BaseGmsClient)>
		//  164  348:aload_1         
		//  165  349:getfield        #66  <Field int Message.arg2>
		//  166  352:invokeinterface #112 <Method void BaseGmsClient$BaseConnectionCallbacks.onConnectionSuspended(int)>
				zzru.onConnectionSuspended(message.arg2);
		//  167  357:aload_0         
		//  168  358:getfield        #13  <Field BaseGmsClient zzru>
		//  169  361:aload_1         
		//  170  362:getfield        #66  <Field int Message.arg2>
		//  171  365:invokevirtual   #113 <Method void BaseGmsClient.onConnectionSuspended(int)>
				BaseGmsClient.zza(zzru, 5, 1, ((IInterface) (null)));
		//  172  368:aload_0         
		//  173  369:getfield        #13  <Field BaseGmsClient zzru>
		//  174  372:iconst_5        
		//  175  373:iconst_1        
		//  176  374:aconst_null     
		//  177  375:invokestatic    #116 <Method boolean BaseGmsClient.zza(BaseGmsClient, int, int, IInterface)>
		//  178  378:pop             
				return;
		//  179  379:return          
			}
			if(message.what == 2 && !zzru.isConnected())
		//* 180  380:aload_1         
		//* 181  381:getfield        #39  <Field int Message.what>
		//* 182  384:iconst_2        
		//* 183  385:icmpne          403
		//* 184  388:aload_0         
		//* 185  389:getfield        #13  <Field BaseGmsClient zzru>
		//* 186  392:invokevirtual   #119 <Method boolean BaseGmsClient.isConnected()>
		//* 187  395:ifne            403
			{
				zza(message);
		//  188  398:aload_1         
		//  189  399:invokestatic    #57  <Method void zza(Message)>
				return;
		//  190  402:return          
			}
			if(zzb(message))
		//* 191  403:aload_1         
		//* 192  404:invokestatic    #55  <Method boolean zzb(Message)>
		//* 193  407:ifeq            421
			{
				((CallbackProxy)message.obj).deliverCallback();
		//  194  410:aload_1         
		//  195  411:getfield        #25  <Field Object Message.obj>
		//  196  414:checkcast       #27  <Class BaseGmsClient$CallbackProxy>
		//  197  417:invokevirtual   #122 <Method void BaseGmsClient$CallbackProxy.deliverCallback()>
				return;
		//  198  420:return          
			} else
			{
				int j = message.what;
		//  199  421:aload_1         
		//  200  422:getfield        #39  <Field int Message.what>
		//  201  425:istore_2        
				message = ((Message) (new StringBuilder(45)));
		//  202  426:new             #124 <Class StringBuilder>
		//  203  429:dup             
		//  204  430:bipush          45
		//  205  432:invokespecial   #125 <Method void StringBuilder(int)>
		//  206  435:astore_1        
				((StringBuilder) (message)).append("Don't know how to handle message: ");
		//  207  436:aload_1         
		//  208  437:ldc1            #127 <String "Don't know how to handle message: ">
		//  209  439:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
		//  210  442:pop             
				((StringBuilder) (message)).append(j);
		//  211  443:aload_1         
		//  212  444:iload_2         
		//  213  445:invokevirtual   #134 <Method StringBuilder StringBuilder.append(int)>
		//  214  448:pop             
				Log.wtf("GmsClient", ((StringBuilder) (message)).toString(), ((Throwable) (new Exception())));
		//  215  449:ldc1            #136 <String "GmsClient">
		//  216  451:aload_1         
		//  217  452:invokevirtual   #140 <Method String StringBuilder.toString()>
		//  218  455:new             #142 <Class Exception>
		//  219  458:dup             
		//  220  459:invokespecial   #144 <Method void Exception()>
		//  221  462:invokestatic    #150 <Method int Log.wtf(String, String, Throwable)>
		//  222  465:pop             
				return;
		//  223  466:return          
			}
		}

		private final BaseGmsClient zzru;

		public zzb(Looper looper)
		{
			zzru = BaseGmsClient.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field BaseGmsClient zzru>
			super(looper);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #16  <Method void Handler(Looper)>
		//    6   10:return          
		}
	}


	protected BaseGmsClient(Context context, Handler handler, GmsClientSupervisor gmsclientsupervisor, GoogleApiAvailabilityLight googleapiavailabilitylight, int i, BaseConnectionCallbacks baseconnectioncallbacks, BaseOnConnectionFailedListener baseonconnectionfailedlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #136 <Method void Object()>
		mLock = new Object();
	//    2    4:aload_0         
	//    3    5:new             #5   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #136 <Method void Object()>
	//    6   12:putfield        #138 <Field Object mLock>
		zzrh = new Object();
	//    7   15:aload_0         
	//    8   16:new             #5   <Class Object>
	//    9   19:dup             
	//   10   20:invokespecial   #136 <Method void Object()>
	//   11   23:putfield        #140 <Field Object zzrh>
		zzrk = new ArrayList();
	//   12   26:aload_0         
	//   13   27:new             #142 <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #143 <Method void ArrayList()>
	//   16   34:putfield        #145 <Field ArrayList zzrk>
		zzrm = 1;
	//   17   37:aload_0         
	//   18   38:iconst_1        
	//   19   39:putfield        #147 <Field int zzrm>
		zzrr = null;
	//   20   42:aload_0         
	//   21   43:aconst_null     
	//   22   44:putfield        #149 <Field ConnectionResult zzrr>
		zzrs = false;
	//   23   47:aload_0         
	//   24   48:iconst_0        
	//   25   49:putfield        #151 <Field boolean zzrs>
		zzrt = null;
	//   26   52:aload_0         
	//   27   53:aconst_null     
	//   28   54:putfield        #153 <Field ConnectionInfo zzrt>
		mDisconnectCount = new AtomicInteger(0);
	//   29   57:aload_0         
	//   30   58:new             #155 <Class AtomicInteger>
	//   31   61:dup             
	//   32   62:iconst_0        
	//   33   63:invokespecial   #158 <Method void AtomicInteger(int)>
	//   34   66:putfield        #160 <Field AtomicInteger mDisconnectCount>
		mContext = (Context)Preconditions.checkNotNull(((Object) (context)), "Context must not be null");
	//   35   69:aload_0         
	//   36   70:aload_1         
	//   37   71:ldc1            #162 <String "Context must not be null">
	//   38   73:invokestatic    #168 <Method Object Preconditions.checkNotNull(Object, Object)>
	//   39   76:checkcast       #170 <Class Context>
	//   40   79:putfield        #172 <Field Context mContext>
		mHandler = (Handler)Preconditions.checkNotNull(((Object) (handler)), "Handler must not be null");
	//   41   82:aload_0         
	//   42   83:aload_2         
	//   43   84:ldc1            #174 <String "Handler must not be null">
	//   44   86:invokestatic    #168 <Method Object Preconditions.checkNotNull(Object, Object)>
	//   45   89:checkcast       #176 <Class Handler>
	//   46   92:putfield        #178 <Field Handler mHandler>
		zzcn = handler.getLooper();
	//   47   95:aload_0         
	//   48   96:aload_2         
	//   49   97:invokevirtual   #182 <Method Looper Handler.getLooper()>
	//   50  100:putfield        #184 <Field Looper zzcn>
		zzrg = (GmsClientSupervisor)Preconditions.checkNotNull(((Object) (gmsclientsupervisor)), "Supervisor must not be null");
	//   51  103:aload_0         
	//   52  104:aload_3         
	//   53  105:ldc1            #186 <String "Supervisor must not be null">
	//   54  107:invokestatic    #168 <Method Object Preconditions.checkNotNull(Object, Object)>
	//   55  110:checkcast       #188 <Class GmsClientSupervisor>
	//   56  113:putfield        #190 <Field GmsClientSupervisor zzrg>
		zzgk = (GoogleApiAvailabilityLight)Preconditions.checkNotNull(((Object) (googleapiavailabilitylight)), "API availability must not be null");
	//   57  116:aload_0         
	//   58  117:aload           4
	//   59  119:ldc1            #192 <String "API availability must not be null">
	//   60  121:invokestatic    #168 <Method Object Preconditions.checkNotNull(Object, Object)>
	//   61  124:checkcast       #194 <Class GoogleApiAvailabilityLight>
	//   62  127:putfield        #196 <Field GoogleApiAvailabilityLight zzgk>
		zzrp = i;
	//   63  130:aload_0         
	//   64  131:iload           5
	//   65  133:putfield        #198 <Field int zzrp>
		zzrn = baseconnectioncallbacks;
	//   66  136:aload_0         
	//   67  137:aload           6
	//   68  139:putfield        #200 <Field BaseGmsClient$BaseConnectionCallbacks zzrn>
		zzro = baseonconnectionfailedlistener;
	//   69  142:aload_0         
	//   70  143:aload           7
	//   71  145:putfield        #202 <Field BaseGmsClient$BaseOnConnectionFailedListener zzro>
		zzrq = null;
	//   72  148:aload_0         
	//   73  149:aconst_null     
	//   74  150:putfield        #204 <Field String zzrq>
	//   75  153:return          
	}

	protected BaseGmsClient(Context context, Looper looper, int i, BaseConnectionCallbacks baseconnectioncallbacks, BaseOnConnectionFailedListener baseonconnectionfailedlistener, String s)
	{
		this(context, looper, GmsClientSupervisor.getInstance(context), GoogleApiAvailabilityLight.getInstance(), i, (BaseConnectionCallbacks)Preconditions.checkNotNull(((Object) (baseconnectioncallbacks))), (BaseOnConnectionFailedListener)Preconditions.checkNotNull(((Object) (baseonconnectionfailedlistener))), s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_1         
	//    4    4:invokestatic    #210 <Method GmsClientSupervisor GmsClientSupervisor.getInstance(Context)>
	//    5    7:invokestatic    #213 <Method GoogleApiAvailabilityLight GoogleApiAvailabilityLight.getInstance()>
	//    6   10:iload_3         
	//    7   11:aload           4
	//    8   13:invokestatic    #216 <Method Object Preconditions.checkNotNull(Object)>
	//    9   16:checkcast       #7   <Class BaseGmsClient$BaseConnectionCallbacks>
	//   10   19:aload           5
	//   11   21:invokestatic    #216 <Method Object Preconditions.checkNotNull(Object)>
	//   12   24:checkcast       #10  <Class BaseGmsClient$BaseOnConnectionFailedListener>
	//   13   27:aload           6
	//   14   29:invokespecial   #219 <Method void BaseGmsClient(Context, Looper, GmsClientSupervisor, GoogleApiAvailabilityLight, int, BaseGmsClient$BaseConnectionCallbacks, BaseGmsClient$BaseOnConnectionFailedListener, String)>
	//   15   32:return          
	}

	protected BaseGmsClient(Context context, Looper looper, GmsClientSupervisor gmsclientsupervisor, GoogleApiAvailabilityLight googleapiavailabilitylight, int i, BaseConnectionCallbacks baseconnectioncallbacks, BaseOnConnectionFailedListener baseonconnectionfailedlistener, 
			String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #136 <Method void Object()>
		mLock = new Object();
	//    2    4:aload_0         
	//    3    5:new             #5   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #136 <Method void Object()>
	//    6   12:putfield        #138 <Field Object mLock>
		zzrh = new Object();
	//    7   15:aload_0         
	//    8   16:new             #5   <Class Object>
	//    9   19:dup             
	//   10   20:invokespecial   #136 <Method void Object()>
	//   11   23:putfield        #140 <Field Object zzrh>
		zzrk = new ArrayList();
	//   12   26:aload_0         
	//   13   27:new             #142 <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #143 <Method void ArrayList()>
	//   16   34:putfield        #145 <Field ArrayList zzrk>
		zzrm = 1;
	//   17   37:aload_0         
	//   18   38:iconst_1        
	//   19   39:putfield        #147 <Field int zzrm>
		zzrr = null;
	//   20   42:aload_0         
	//   21   43:aconst_null     
	//   22   44:putfield        #149 <Field ConnectionResult zzrr>
		zzrs = false;
	//   23   47:aload_0         
	//   24   48:iconst_0        
	//   25   49:putfield        #151 <Field boolean zzrs>
		zzrt = null;
	//   26   52:aload_0         
	//   27   53:aconst_null     
	//   28   54:putfield        #153 <Field ConnectionInfo zzrt>
		mDisconnectCount = new AtomicInteger(0);
	//   29   57:aload_0         
	//   30   58:new             #155 <Class AtomicInteger>
	//   31   61:dup             
	//   32   62:iconst_0        
	//   33   63:invokespecial   #158 <Method void AtomicInteger(int)>
	//   34   66:putfield        #160 <Field AtomicInteger mDisconnectCount>
		mContext = (Context)Preconditions.checkNotNull(((Object) (context)), "Context must not be null");
	//   35   69:aload_0         
	//   36   70:aload_1         
	//   37   71:ldc1            #162 <String "Context must not be null">
	//   38   73:invokestatic    #168 <Method Object Preconditions.checkNotNull(Object, Object)>
	//   39   76:checkcast       #170 <Class Context>
	//   40   79:putfield        #172 <Field Context mContext>
		zzcn = (Looper)Preconditions.checkNotNull(((Object) (looper)), "Looper must not be null");
	//   41   82:aload_0         
	//   42   83:aload_2         
	//   43   84:ldc1            #221 <String "Looper must not be null">
	//   44   86:invokestatic    #168 <Method Object Preconditions.checkNotNull(Object, Object)>
	//   45   89:checkcast       #223 <Class Looper>
	//   46   92:putfield        #184 <Field Looper zzcn>
		zzrg = (GmsClientSupervisor)Preconditions.checkNotNull(((Object) (gmsclientsupervisor)), "Supervisor must not be null");
	//   47   95:aload_0         
	//   48   96:aload_3         
	//   49   97:ldc1            #186 <String "Supervisor must not be null">
	//   50   99:invokestatic    #168 <Method Object Preconditions.checkNotNull(Object, Object)>
	//   51  102:checkcast       #188 <Class GmsClientSupervisor>
	//   52  105:putfield        #190 <Field GmsClientSupervisor zzrg>
		zzgk = (GoogleApiAvailabilityLight)Preconditions.checkNotNull(((Object) (googleapiavailabilitylight)), "API availability must not be null");
	//   53  108:aload_0         
	//   54  109:aload           4
	//   55  111:ldc1            #192 <String "API availability must not be null">
	//   56  113:invokestatic    #168 <Method Object Preconditions.checkNotNull(Object, Object)>
	//   57  116:checkcast       #194 <Class GoogleApiAvailabilityLight>
	//   58  119:putfield        #196 <Field GoogleApiAvailabilityLight zzgk>
		mHandler = ((Handler) (new zzb(looper)));
	//   59  122:aload_0         
	//   60  123:new             #40  <Class BaseGmsClient$zzb>
	//   61  126:dup             
	//   62  127:aload_0         
	//   63  128:aload_2         
	//   64  129:invokespecial   #226 <Method void BaseGmsClient$zzb(BaseGmsClient, Looper)>
	//   65  132:putfield        #178 <Field Handler mHandler>
		zzrp = i;
	//   66  135:aload_0         
	//   67  136:iload           5
	//   68  138:putfield        #198 <Field int zzrp>
		zzrn = baseconnectioncallbacks;
	//   69  141:aload_0         
	//   70  142:aload           6
	//   71  144:putfield        #200 <Field BaseGmsClient$BaseConnectionCallbacks zzrn>
		zzro = baseonconnectionfailedlistener;
	//   72  147:aload_0         
	//   73  148:aload           7
	//   74  150:putfield        #202 <Field BaseGmsClient$BaseOnConnectionFailedListener zzro>
		zzrq = s;
	//   75  153:aload_0         
	//   76  154:aload           8
	//   77  156:putfield        #204 <Field String zzrq>
	//   78  159:return          
	}

	static ConnectionResult zza(BaseGmsClient basegmsclient, ConnectionResult connectionresult)
	{
		basegmsclient.zzrr = connectionresult;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #149 <Field ConnectionResult zzrr>
		return connectionresult;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static IGmsServiceBroker zza(BaseGmsClient basegmsclient, IGmsServiceBroker igmsservicebroker)
	{
		basegmsclient.zzri = igmsservicebroker;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #230 <Field IGmsServiceBroker zzri>
		return igmsservicebroker;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static Object zza(BaseGmsClient basegmsclient)
	{
		return basegmsclient.zzrh;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field Object zzrh>
	//    2    4:areturn         
	}

	private final void zza(int i, IInterface iinterface)
	{
		boolean flag;
		if(i == 4)
	//*   0    0:iload_1         
	//*   1    1:iconst_4        
	//*   2    2:icmpne          10
			flag = true;
	//    3    5:iconst_1        
	//    4    6:istore_3        
		else
	//*   5    7:goto            12
			flag = false;
	//    6   10:iconst_0        
	//    7   11:istore_3        
		boolean flag1;
		if(iinterface != null)
	//*   8   12:aload_2         
	//*   9   13:ifnull          22
			flag1 = true;
	//   10   16:iconst_1        
	//   11   17:istore          4
		else
	//*  12   19:goto            25
			flag1 = false;
	//   13   22:iconst_0        
	//   14   23:istore          4
		boolean flag2;
		if(flag == flag1)
	//*  15   25:iload_3         
	//*  16   26:iload           4
	//*  17   28:icmpne          37
			flag2 = true;
	//   18   31:iconst_1        
	//   19   32:istore          5
		else
	//*  20   34:goto            40
			flag2 = false;
	//   21   37:iconst_0        
	//   22   38:istore          5
		Preconditions.checkArgument(flag2);
	//   23   40:iload           5
	//   24   42:invokestatic    #236 <Method void Preconditions.checkArgument(boolean)>
		Object obj = mLock;
	//   25   45:aload_0         
	//   26   46:getfield        #138 <Field Object mLock>
	//   27   49:astore          6
		obj;
	//   28   51:aload           6
		JVM INSTR monitorenter ;
	//   29   53:monitorenter    
		zzrm = i;
	//   30   54:aload_0         
	//   31   55:iload_1         
	//   32   56:putfield        #147 <Field int zzrm>
		zzrj = iinterface;
	//   33   59:aload_0         
	//   34   60:aload_2         
	//   35   61:putfield        #238 <Field IInterface zzrj>
		onSetConnectState(i, iinterface);
	//   36   64:aload_0         
	//   37   65:iload_1         
	//   38   66:aload_2         
	//   39   67:invokevirtual   #241 <Method void onSetConnectState(int, IInterface)>
		i;
	//   40   70:iload_1         
		JVM INSTR tableswitch 1 4: default 538
	//	               1 489
	//	               2 108
	//	               3 108
	//	               4 100;
	//   41   71:tableswitch     1 4: default 538
	//	               1 489
	//	               2 108
	//	               3 108
	//	               4 100
		   goto _L1 _L2 _L3 _L3 _L4
_L1:
		break MISSING_BLOCK_LABEL_528;
_L4:
		onConnectedLocked(iinterface);
	//   42  100:aload_0         
	//   43  101:aload_2         
	//   44  102:invokevirtual   #245 <Method void onConnectedLocked(IInterface)>
		break MISSING_BLOCK_LABEL_528;
	//   45  105:goto            528
_L3:
		if(zzrl != null && zzrf != null)
	//*  46  108:aload_0         
	//*  47  109:getfield        #247 <Field BaseGmsClient$GmsServiceConnection zzrl>
	//*  48  112:ifnull          256
	//*  49  115:aload_0         
	//*  50  116:getfield        #249 <Field GmsServiceEndpoint zzrf>
	//*  51  119:ifnull          256
		{
			iinterface = ((IInterface) (zzrf.zzcw()));
	//   52  122:aload_0         
	//   53  123:getfield        #249 <Field GmsServiceEndpoint zzrf>
	//   54  126:invokevirtual   #255 <Method String GmsServiceEndpoint.zzcw()>
	//   55  129:astore_2        
			String s = zzrf.getPackageName();
	//   56  130:aload_0         
	//   57  131:getfield        #249 <Field GmsServiceEndpoint zzrf>
	//   58  134:invokevirtual   #258 <Method String GmsServiceEndpoint.getPackageName()>
	//   59  137:astore          7
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (iinterface))).length() + 70 + String.valueOf(((Object) (s))).length());
	//   60  139:new             #260 <Class StringBuilder>
	//   61  142:dup             
	//   62  143:aload_2         
	//   63  144:invokestatic    #264 <Method String String.valueOf(Object)>
	//   64  147:invokevirtual   #268 <Method int String.length()>
	//   65  150:bipush          70
	//   66  152:iadd            
	//   67  153:aload           7
	//   68  155:invokestatic    #264 <Method String String.valueOf(Object)>
	//   69  158:invokevirtual   #268 <Method int String.length()>
	//   70  161:iadd            
	//   71  162:invokespecial   #269 <Method void StringBuilder(int)>
	//   72  165:astore          8
			stringbuilder.append("Calling connect() while still connected, missing disconnect() for ");
	//   73  167:aload           8
	//   74  169:ldc2            #271 <String "Calling connect() while still connected, missing disconnect() for ">
	//   75  172:invokevirtual   #275 <Method StringBuilder StringBuilder.append(String)>
	//   76  175:pop             
			stringbuilder.append(((String) (iinterface)));
	//   77  176:aload           8
	//   78  178:aload_2         
	//   79  179:invokevirtual   #275 <Method StringBuilder StringBuilder.append(String)>
	//   80  182:pop             
			stringbuilder.append(" on ");
	//   81  183:aload           8
	//   82  185:ldc2            #277 <String " on ">
	//   83  188:invokevirtual   #275 <Method StringBuilder StringBuilder.append(String)>
	//   84  191:pop             
			stringbuilder.append(s);
	//   85  192:aload           8
	//   86  194:aload           7
	//   87  196:invokevirtual   #275 <Method StringBuilder StringBuilder.append(String)>
	//   88  199:pop             
			Log.e("GmsClient", stringbuilder.toString());
	//   89  200:ldc2            #279 <String "GmsClient">
	//   90  203:aload           8
	//   91  205:invokevirtual   #282 <Method String StringBuilder.toString()>
	//   92  208:invokestatic    #288 <Method int Log.e(String, String)>
	//   93  211:pop             
			zzrg.unbindService(zzrf.zzcw(), zzrf.getPackageName(), zzrf.getBindFlags(), ((ServiceConnection) (zzrl)), getRealClientName());
	//   94  212:aload_0         
	//   95  213:getfield        #190 <Field GmsClientSupervisor zzrg>
	//   96  216:aload_0         
	//   97  217:getfield        #249 <Field GmsServiceEndpoint zzrf>
	//   98  220:invokevirtual   #255 <Method String GmsServiceEndpoint.zzcw()>
	//   99  223:aload_0         
	//  100  224:getfield        #249 <Field GmsServiceEndpoint zzrf>
	//  101  227:invokevirtual   #258 <Method String GmsServiceEndpoint.getPackageName()>
	//  102  230:aload_0         
	//  103  231:getfield        #249 <Field GmsServiceEndpoint zzrf>
	//  104  234:invokevirtual   #291 <Method int GmsServiceEndpoint.getBindFlags()>
	//  105  237:aload_0         
	//  106  238:getfield        #247 <Field BaseGmsClient$GmsServiceConnection zzrl>
	//  107  241:aload_0         
	//  108  242:invokevirtual   #294 <Method String getRealClientName()>
	//  109  245:invokevirtual   #298 <Method void GmsClientSupervisor.unbindService(String, String, int, ServiceConnection, String)>
			mDisconnectCount.incrementAndGet();
	//  110  248:aload_0         
	//  111  249:getfield        #160 <Field AtomicInteger mDisconnectCount>
	//  112  252:invokevirtual   #301 <Method int AtomicInteger.incrementAndGet()>
	//  113  255:pop             
		}
		zzrl = new GmsServiceConnection(mDisconnectCount.get());
	//  114  256:aload_0         
	//  115  257:new             #22  <Class BaseGmsClient$GmsServiceConnection>
	//  116  260:dup             
	//  117  261:aload_0         
	//  118  262:aload_0         
	//  119  263:getfield        #160 <Field AtomicInteger mDisconnectCount>
	//  120  266:invokevirtual   #304 <Method int AtomicInteger.get()>
	//  121  269:invokespecial   #307 <Method void BaseGmsClient$GmsServiceConnection(BaseGmsClient, int)>
	//  122  272:putfield        #247 <Field BaseGmsClient$GmsServiceConnection zzrl>
		if(zzrm != 3 || getLocalStartServiceAction() == null) goto _L6; else goto _L5
	//  123  275:aload_0         
	//  124  276:getfield        #147 <Field int zzrm>
	//  125  279:iconst_3        
	//  126  280:icmpne          317
	//  127  283:aload_0         
	//  128  284:invokevirtual   #310 <Method String getLocalStartServiceAction()>
	//  129  287:ifnull          317
_L5:
		iinterface = ((IInterface) (new GmsServiceEndpoint(getContext().getPackageName(), getLocalStartServiceAction(), true, getServiceBindFlags())));
	//  130  290:new             #251 <Class GmsServiceEndpoint>
	//  131  293:dup             
	//  132  294:aload_0         
	//  133  295:invokevirtual   #314 <Method Context getContext()>
	//  134  298:invokevirtual   #315 <Method String Context.getPackageName()>
	//  135  301:aload_0         
	//  136  302:invokevirtual   #310 <Method String getLocalStartServiceAction()>
	//  137  305:iconst_1        
	//  138  306:aload_0         
	//  139  307:invokevirtual   #318 <Method int getServiceBindFlags()>
	//  140  310:invokespecial   #321 <Method void GmsServiceEndpoint(String, String, boolean, int)>
	//  141  313:astore_2        
		  goto _L7
	//* 142  314:goto            338
_L6:
		iinterface = ((IInterface) (new GmsServiceEndpoint(getStartServicePackage(), getStartServiceAction(), false, getServiceBindFlags())));
	//  143  317:new             #251 <Class GmsServiceEndpoint>
	//  144  320:dup             
	//  145  321:aload_0         
	//  146  322:invokevirtual   #324 <Method String getStartServicePackage()>
	//  147  325:aload_0         
	//  148  326:invokevirtual   #327 <Method String getStartServiceAction()>
	//  149  329:iconst_0        
	//  150  330:aload_0         
	//  151  331:invokevirtual   #318 <Method int getServiceBindFlags()>
	//  152  334:invokespecial   #321 <Method void GmsServiceEndpoint(String, String, boolean, int)>
	//  153  337:astore_2        
_L7:
		zzrf = ((GmsServiceEndpoint) (iinterface));
	//  154  338:aload_0         
	//  155  339:aload_2         
	//  156  340:putfield        #249 <Field GmsServiceEndpoint zzrf>
		if(!zzrg.bindService(zzrf.zzcw(), zzrf.getPackageName(), zzrf.getBindFlags(), ((ServiceConnection) (zzrl)), getRealClientName()))
	//* 157  343:aload_0         
	//* 158  344:getfield        #190 <Field GmsClientSupervisor zzrg>
	//* 159  347:aload_0         
	//* 160  348:getfield        #249 <Field GmsServiceEndpoint zzrf>
	//* 161  351:invokevirtual   #255 <Method String GmsServiceEndpoint.zzcw()>
	//* 162  354:aload_0         
	//* 163  355:getfield        #249 <Field GmsServiceEndpoint zzrf>
	//* 164  358:invokevirtual   #258 <Method String GmsServiceEndpoint.getPackageName()>
	//* 165  361:aload_0         
	//* 166  362:getfield        #249 <Field GmsServiceEndpoint zzrf>
	//* 167  365:invokevirtual   #291 <Method int GmsServiceEndpoint.getBindFlags()>
	//* 168  368:aload_0         
	//* 169  369:getfield        #247 <Field BaseGmsClient$GmsServiceConnection zzrl>
	//* 170  372:aload_0         
	//* 171  373:invokevirtual   #294 <Method String getRealClientName()>
	//* 172  376:invokevirtual   #331 <Method boolean GmsClientSupervisor.bindService(String, String, int, ServiceConnection, String)>
	//* 173  379:ifne            528
		{
			iinterface = ((IInterface) (zzrf.zzcw()));
	//  174  382:aload_0         
	//  175  383:getfield        #249 <Field GmsServiceEndpoint zzrf>
	//  176  386:invokevirtual   #255 <Method String GmsServiceEndpoint.zzcw()>
	//  177  389:astore_2        
			String s1 = zzrf.getPackageName();
	//  178  390:aload_0         
	//  179  391:getfield        #249 <Field GmsServiceEndpoint zzrf>
	//  180  394:invokevirtual   #258 <Method String GmsServiceEndpoint.getPackageName()>
	//  181  397:astore          7
			StringBuilder stringbuilder1 = new StringBuilder(String.valueOf(((Object) (iinterface))).length() + 34 + String.valueOf(((Object) (s1))).length());
	//  182  399:new             #260 <Class StringBuilder>
	//  183  402:dup             
	//  184  403:aload_2         
	//  185  404:invokestatic    #264 <Method String String.valueOf(Object)>
	//  186  407:invokevirtual   #268 <Method int String.length()>
	//  187  410:bipush          34
	//  188  412:iadd            
	//  189  413:aload           7
	//  190  415:invokestatic    #264 <Method String String.valueOf(Object)>
	//  191  418:invokevirtual   #268 <Method int String.length()>
	//  192  421:iadd            
	//  193  422:invokespecial   #269 <Method void StringBuilder(int)>
	//  194  425:astore          8
			stringbuilder1.append("unable to connect to service: ");
	//  195  427:aload           8
	//  196  429:ldc2            #333 <String "unable to connect to service: ">
	//  197  432:invokevirtual   #275 <Method StringBuilder StringBuilder.append(String)>
	//  198  435:pop             
			stringbuilder1.append(((String) (iinterface)));
	//  199  436:aload           8
	//  200  438:aload_2         
	//  201  439:invokevirtual   #275 <Method StringBuilder StringBuilder.append(String)>
	//  202  442:pop             
			stringbuilder1.append(" on ");
	//  203  443:aload           8
	//  204  445:ldc2            #277 <String " on ">
	//  205  448:invokevirtual   #275 <Method StringBuilder StringBuilder.append(String)>
	//  206  451:pop             
			stringbuilder1.append(s1);
	//  207  452:aload           8
	//  208  454:aload           7
	//  209  456:invokevirtual   #275 <Method StringBuilder StringBuilder.append(String)>
	//  210  459:pop             
			Log.e("GmsClient", stringbuilder1.toString());
	//  211  460:ldc2            #279 <String "GmsClient">
	//  212  463:aload           8
	//  213  465:invokevirtual   #282 <Method String StringBuilder.toString()>
	//  214  468:invokestatic    #288 <Method int Log.e(String, String)>
	//  215  471:pop             
			onPostServiceBindingHandler(16, ((Bundle) (null)), mDisconnectCount.get());
	//  216  472:aload_0         
	//  217  473:bipush          16
	//  218  475:aconst_null     
	//  219  476:aload_0         
	//  220  477:getfield        #160 <Field AtomicInteger mDisconnectCount>
	//  221  480:invokevirtual   #304 <Method int AtomicInteger.get()>
	//  222  483:invokevirtual   #337 <Method void onPostServiceBindingHandler(int, Bundle, int)>
		}
		break MISSING_BLOCK_LABEL_528;
	//  223  486:goto            528
_L2:
		if(zzrl != null)
	//* 224  489:aload_0         
	//* 225  490:getfield        #247 <Field BaseGmsClient$GmsServiceConnection zzrl>
	//* 226  493:ifnull          528
		{
			zzrg.unbindService(getStartServiceAction(), getStartServicePackage(), getServiceBindFlags(), ((ServiceConnection) (zzrl)), getRealClientName());
	//  227  496:aload_0         
	//  228  497:getfield        #190 <Field GmsClientSupervisor zzrg>
	//  229  500:aload_0         
	//  230  501:invokevirtual   #327 <Method String getStartServiceAction()>
	//  231  504:aload_0         
	//  232  505:invokevirtual   #324 <Method String getStartServicePackage()>
	//  233  508:aload_0         
	//  234  509:invokevirtual   #318 <Method int getServiceBindFlags()>
	//  235  512:aload_0         
	//  236  513:getfield        #247 <Field BaseGmsClient$GmsServiceConnection zzrl>
	//  237  516:aload_0         
	//  238  517:invokevirtual   #294 <Method String getRealClientName()>
	//  239  520:invokevirtual   #298 <Method void GmsClientSupervisor.unbindService(String, String, int, ServiceConnection, String)>
			zzrl = null;
	//  240  523:aload_0         
	//  241  524:aconst_null     
	//  242  525:putfield        #247 <Field BaseGmsClient$GmsServiceConnection zzrl>
		}
		obj;
	//  243  528:aload           6
		JVM INSTR monitorexit ;
	//  244  530:monitorexit     
		return;
	//  245  531:return          
		iinterface;
	//  246  532:astore_2        
		obj;
	//  247  533:aload           6
		JVM INSTR monitorexit ;
	//  248  535:monitorexit     
		throw iinterface;
	//  249  536:aload_2         
	//  250  537:athrow          
	//* 251  538:goto            528
	}

	static void zza(BaseGmsClient basegmsclient, int i)
	{
		basegmsclient.zzj(16);
	//    0    0:aload_0         
	//    1    1:bipush          16
	//    2    3:invokespecial   #342 <Method void zzj(int)>
	//    3    6:return          
	}

	static void zza(BaseGmsClient basegmsclient, int i, IInterface iinterface)
	{
		basegmsclient.zza(i, ((IInterface) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #345 <Method void zza(int, IInterface)>
	//    4    6:return          
	}

	static void zza(BaseGmsClient basegmsclient, ConnectionInfo connectioninfo)
	{
		basegmsclient.zza(connectioninfo);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #349 <Method void zza(ConnectionInfo)>
	//    3    5:return          
	}

	private final void zza(ConnectionInfo connectioninfo)
	{
		zzrt = connectioninfo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #153 <Field ConnectionInfo zzrt>
	//    3    5:return          
	}

	private final boolean zza(int i, int j, IInterface iinterface)
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #138 <Field Object mLock>
	//*   2    4:astore          4
	//*   3    6:aload           4
	//*   4    8:monitorenter    
			{
				if(zzrm == i)
					break label0;
	//    5    9:aload_0         
	//    6   10:getfield        #147 <Field int zzrm>
	//    7   13:iload_1         
	//    8   14:icmpeq          22
			}
	//    9   17:aload           4
	//   10   19:monitorexit     
			return false;
	//   11   20:iconst_0        
	//   12   21:ireturn         
		}
		zza(j, iinterface);
	//   13   22:aload_0         
	//   14   23:iload_2         
	//   15   24:aload_3         
	//   16   25:invokespecial   #345 <Method void zza(int, IInterface)>
		obj;
	//   17   28:aload           4
		JVM INSTR monitorexit ;
	//   18   30:monitorexit     
		return true;
	//   19   31:iconst_1        
	//   20   32:ireturn         
		iinterface;
	//   21   33:astore_3        
		obj;
	//   22   34:aload           4
		JVM INSTR monitorexit ;
	//   23   36:monitorexit     
		throw iinterface;
	//   24   37:aload_3         
	//   25   38:athrow          
	}

	static boolean zza(BaseGmsClient basegmsclient, int i, int j, IInterface iinterface)
	{
		return basegmsclient.zza(i, j, iinterface);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #354 <Method boolean zza(int, int, IInterface)>
	//    5    7:ireturn         
	}

	static boolean zzb(BaseGmsClient basegmsclient)
	{
		return basegmsclient.zzcr();
	//    0    0:aload_0         
	//    1    1:invokespecial   #359 <Method boolean zzcr()>
	//    2    4:ireturn         
	}

	static boolean zzc(BaseGmsClient basegmsclient)
	{
		return basegmsclient.zzrs;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field boolean zzrs>
	//    2    4:ireturn         
	}

	private final boolean zzcq()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		Exception exception;
		if(zzrm == 3)
	//*   5    7:aload_0         
	//*   6    8:getfield        #147 <Field int zzrm>
	//*   7   11:iconst_3        
	//*   8   12:icmpne          29
			flag = true;
	//    9   15:iconst_1        
	//   10   16:istore_1        
		else
	//*  11   17:goto            20
	//*  12   20:aload_2         
	//*  13   21:monitorexit     
	//*  14   22:iload_1         
	//*  15   23:ireturn         
	//*  16   24:astore_3        
	//*  17   25:aload_2         
	//*  18   26:monitorexit     
	//*  19   27:aload_3         
	//*  20   28:athrow          
			flag = false;
	//   21   29:iconst_0        
	//   22   30:istore_1        
		obj;
		JVM INSTR monitorexit ;
		return flag;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  23   31:goto            20
	}

	private final boolean zzcr()
	{
		if(zzrs)
	//*   0    0:aload_0         
	//*   1    1:getfield        #151 <Field boolean zzrs>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(TextUtils.isEmpty(((CharSequence) (getServiceDescriptor()))))
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #366 <Method String getServiceDescriptor()>
	//*   7   13:invokestatic    #372 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   8   16:ifeq            21
			return false;
	//    9   19:iconst_0        
	//   10   20:ireturn         
		if(TextUtils.isEmpty(((CharSequence) (getLocalStartServiceAction()))))
	//*  11   21:aload_0         
	//*  12   22:invokevirtual   #310 <Method String getLocalStartServiceAction()>
	//*  13   25:invokestatic    #372 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  14   28:ifeq            33
			return false;
	//   15   31:iconst_0        
	//   16   32:ireturn         
		try
		{
			Class.forName(getServiceDescriptor());
	//   17   33:aload_0         
	//   18   34:invokevirtual   #366 <Method String getServiceDescriptor()>
	//   19   37:invokestatic    #378 <Method Class Class.forName(String)>
	//   20   40:pop             
		}
	//*  21   41:iconst_1        
	//*  22   42:ireturn         
		catch(ClassNotFoundException classnotfoundexception)
	//*  23   43:astore_1        
		{
			return false;
	//   24   44:iconst_0        
	//   25   45:ireturn         
		}
		return true;
	}

	static ConnectionResult zzd(BaseGmsClient basegmsclient)
	{
		return basegmsclient.zzrr;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field ConnectionResult zzrr>
	//    2    4:areturn         
	}

	static BaseConnectionCallbacks zze(BaseGmsClient basegmsclient)
	{
		return basegmsclient.zzrn;
	//    0    0:aload_0         
	//    1    1:getfield        #200 <Field BaseGmsClient$BaseConnectionCallbacks zzrn>
	//    2    4:areturn         
	}

	static ArrayList zzf(BaseGmsClient basegmsclient)
	{
		return basegmsclient.zzrk;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field ArrayList zzrk>
	//    2    4:areturn         
	}

	static BaseOnConnectionFailedListener zzg(BaseGmsClient basegmsclient)
	{
		return basegmsclient.zzro;
	//    0    0:aload_0         
	//    1    1:getfield        #202 <Field BaseGmsClient$BaseOnConnectionFailedListener zzro>
	//    2    4:areturn         
	}

	private final void zzj(int i)
	{
		if(zzcq())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #388 <Method boolean zzcq()>
	//*   2    4:ifeq            17
		{
			i = 5;
	//    3    7:iconst_5        
	//    4    8:istore_1        
			zzrs = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #151 <Field boolean zzrs>
		} else
	//*   8   14:goto            19
		{
			i = 4;
	//    9   17:iconst_4        
	//   10   18:istore_1        
		}
		Handler handler = mHandler;
	//   11   19:aload_0         
	//   12   20:getfield        #178 <Field Handler mHandler>
	//   13   23:astore_2        
		handler.sendMessage(handler.obtainMessage(i, mDisconnectCount.get(), 16));
	//   14   24:aload_2         
	//   15   25:aload_2         
	//   16   26:iload_1         
	//   17   27:aload_0         
	//   18   28:getfield        #160 <Field AtomicInteger mDisconnectCount>
	//   19   31:invokevirtual   #304 <Method int AtomicInteger.get()>
	//   20   34:bipush          16
	//   21   36:invokevirtual   #392 <Method Message Handler.obtainMessage(int, int, int)>
	//   22   39:invokevirtual   #396 <Method boolean Handler.sendMessage(Message)>
	//   23   42:pop             
	//   24   43:return          
	}

	public void checkAvailabilityAndConnect()
	{
		int i = zzgk.isGooglePlayServicesAvailable(mContext, getMinApkVersion());
	//    0    0:aload_0         
	//    1    1:getfield        #196 <Field GoogleApiAvailabilityLight zzgk>
	//    2    4:aload_0         
	//    3    5:getfield        #172 <Field Context mContext>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #400 <Method int getMinApkVersion()>
	//    6   12:invokevirtual   #404 <Method int GoogleApiAvailabilityLight.isGooglePlayServicesAvailable(Context, int)>
	//    7   15:istore_1        
		if(i != 0)
	//*   8   16:iload_1         
	//*   9   17:ifeq            41
		{
			zza(1, ((IInterface) (null)));
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:aconst_null     
	//   13   23:invokespecial   #345 <Method void zza(int, IInterface)>
			triggerNotAvailable(((ConnectionProgressReportCallbacks) (new LegacyClientCallbackAdapter())), i, ((PendingIntent) (null)));
	//   14   26:aload_0         
	//   15   27:new             #25  <Class BaseGmsClient$LegacyClientCallbackAdapter>
	//   16   30:dup             
	//   17   31:aload_0         
	//   18   32:invokespecial   #407 <Method void BaseGmsClient$LegacyClientCallbackAdapter(BaseGmsClient)>
	//   19   35:iload_1         
	//   20   36:aconst_null     
	//   21   37:invokevirtual   #411 <Method void triggerNotAvailable(BaseGmsClient$ConnectionProgressReportCallbacks, int, PendingIntent)>
			return;
	//   22   40:return          
		} else
		{
			connect(((ConnectionProgressReportCallbacks) (new LegacyClientCallbackAdapter())));
	//   23   41:aload_0         
	//   24   42:new             #25  <Class BaseGmsClient$LegacyClientCallbackAdapter>
	//   25   45:dup             
	//   26   46:aload_0         
	//   27   47:invokespecial   #407 <Method void BaseGmsClient$LegacyClientCallbackAdapter(BaseGmsClient)>
	//   28   50:invokevirtual   #415 <Method void connect(BaseGmsClient$ConnectionProgressReportCallbacks)>
			return;
	//   29   53:return          
		}
	}

	protected final void checkConnected()
	{
		if(isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #419 <Method boolean isConnected()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		else
			throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
	//    4    8:new             #421 <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:ldc2            #423 <String "Not connected. Call connect() and wait for onConnected() to be called.">
	//    7   15:invokespecial   #426 <Method void IllegalStateException(String)>
	//    8   18:athrow          
	}

	public void connect(ConnectionProgressReportCallbacks connectionprogressreportcallbacks)
	{
		mConnectionProgressReportCallbacks = (ConnectionProgressReportCallbacks)Preconditions.checkNotNull(((Object) (connectionprogressreportcallbacks)), "Connection progress callbacks cannot be null.");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #429 <String "Connection progress callbacks cannot be null.">
	//    3    5:invokestatic    #168 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    4    8:checkcast       #16  <Class BaseGmsClient$ConnectionProgressReportCallbacks>
	//    5   11:putfield        #431 <Field BaseGmsClient$ConnectionProgressReportCallbacks mConnectionProgressReportCallbacks>
		zza(2, ((IInterface) (null)));
	//    6   14:aload_0         
	//    7   15:iconst_2        
	//    8   16:aconst_null     
	//    9   17:invokespecial   #345 <Method void zza(int, IInterface)>
	//   10   20:return          
	}

	protected abstract IInterface createServiceInterface(IBinder ibinder);

	public void disconnect()
	{
		mDisconnectCount.incrementAndGet();
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field AtomicInteger mDisconnectCount>
	//    2    4:invokevirtual   #301 <Method int AtomicInteger.incrementAndGet()>
	//    3    7:pop             
		obj = ((Object) (zzrk));
	//    4    8:aload_0         
	//    5    9:getfield        #145 <Field ArrayList zzrk>
	//    6   12:astore_3        
		obj;
	//    7   13:aload_3         
		JVM INSTR monitorenter ;
	//    8   14:monitorenter    
		int j = zzrk.size();
	//    9   15:aload_0         
	//   10   16:getfield        #145 <Field ArrayList zzrk>
	//   11   19:invokevirtual   #439 <Method int ArrayList.size()>
	//   12   22:istore_2        
		int i = 0;
	//   13   23:iconst_0        
	//   14   24:istore_1        
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   15   25:iload_1         
	//   16   26:iload_2         
	//   17   27:icmpge          51
		((CallbackProxy)zzrk.get(i)).removeListener();
	//   18   30:aload_0         
	//   19   31:getfield        #145 <Field ArrayList zzrk>
	//   20   34:iload_1         
	//   21   35:invokevirtual   #442 <Method Object ArrayList.get(int)>
	//   22   38:checkcast       #13  <Class BaseGmsClient$CallbackProxy>
	//   23   41:invokevirtual   #445 <Method void BaseGmsClient$CallbackProxy.removeListener()>
		i++;
	//   24   44:iload_1         
	//   25   45:iconst_1        
	//   26   46:iadd            
	//   27   47:istore_1        
		if(true) goto _L2; else goto _L1
	//   28   48:goto            25
_L1:
		zzrk.clear();
	//   29   51:aload_0         
	//   30   52:getfield        #145 <Field ArrayList zzrk>
	//   31   55:invokevirtual   #448 <Method void ArrayList.clear()>
		obj;
	//   32   58:aload_3         
		JVM INSTR monitorexit ;
	//   33   59:monitorexit     
		synchronized(zzrh)
	//*  34   60:aload_0         
	//*  35   61:getfield        #140 <Field Object zzrh>
	//*  36   64:astore_3        
	//*  37   65:aload_3         
	//*  38   66:monitorenter    
		{
			zzri = null;
	//   39   67:aload_0         
	//   40   68:aconst_null     
	//   41   69:putfield        #230 <Field IGmsServiceBroker zzri>
		}
	//   42   72:aload_3         
	//   43   73:monitorexit     
		zza(1, ((IInterface) (null)));
	//   44   74:aload_0         
	//   45   75:iconst_1        
	//   46   76:aconst_null     
	//   47   77:invokespecial   #345 <Method void zza(int, IInterface)>
		return;
	//   48   80:return          
		exception;
	//   49   81:astore          4
		obj;
	//   50   83:aload_3         
		JVM INSTR monitorexit ;
	//   51   84:monitorexit     
		throw exception;
	//   52   85:aload           4
	//   53   87:athrow          
		Exception exception1;
		exception1;
	//   54   88:astore          4
		obj;
	//   55   90:aload_3         
		JVM INSTR monitorexit ;
	//   56   91:monitorexit     
		throw exception1;
	//   57   92:aload           4
	//   58   94:athrow          
	}

	public final void doCallbackDEPRECATED(CallbackProxy callbackproxy)
	{
		synchronized(zzrk)
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field ArrayList zzrk>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzrk.add(((Object) (callbackproxy)));
	//    5    7:aload_0         
	//    6    8:getfield        #145 <Field ArrayList zzrk>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #455 <Method boolean ArrayList.add(Object)>
	//    9   15:pop             
		}
	//   10   16:aload_2         
	//   11   17:monitorexit     
		obj = ((Object) (mHandler));
	//   12   18:aload_0         
	//   13   19:getfield        #178 <Field Handler mHandler>
	//   14   22:astore_2        
		((Handler) (obj)).sendMessage(((Handler) (obj)).obtainMessage(2, mDisconnectCount.get(), -1, ((Object) (callbackproxy))));
	//   15   23:aload_2         
	//   16   24:aload_2         
	//   17   25:iconst_2        
	//   18   26:aload_0         
	//   19   27:getfield        #160 <Field AtomicInteger mDisconnectCount>
	//   20   30:invokevirtual   #304 <Method int AtomicInteger.get()>
	//   21   33:iconst_m1       
	//   22   34:aload_1         
	//   23   35:invokevirtual   #458 <Method Message Handler.obtainMessage(int, int, int, Object)>
	//   24   38:invokevirtual   #396 <Method boolean Handler.sendMessage(Message)>
	//   25   41:pop             
		return;
	//   26   42:return          
		callbackproxy;
	//   27   43:astore_1        
		obj;
	//   28   44:aload_2         
		JVM INSTR monitorexit ;
	//   29   45:monitorexit     
		throw callbackproxy;
	//   30   46:aload_1         
	//   31   47:athrow          
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		int i;
		IGmsServiceBroker igmsservicebroker;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #138 <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			i = zzrm;
	//    5    7:aload_0         
	//    6    8:getfield        #147 <Field int zzrm>
	//    7   11:istore          5
			as = ((String []) (zzrj));
	//    8   13:aload_0         
	//    9   14:getfield        #238 <Field IInterface zzrj>
	//   10   17:astore          4
		}
	//   11   19:aload_2         
	//   12   20:monitorexit     
		synchronized(zzrh)
	//*  13   21:aload_0         
	//*  14   22:getfield        #140 <Field Object zzrh>
	//*  15   25:astore_2        
	//*  16   26:aload_2         
	//*  17   27:monitorenter    
		{
			igmsservicebroker = zzri;
	//   18   28:aload_0         
	//   19   29:getfield        #230 <Field IGmsServiceBroker zzri>
	//   20   32:astore          8
		}
	//   21   34:aload_2         
	//   22   35:monitorexit     
		printwriter.append(((CharSequence) (s))).append("mConnectState=");
	//   23   36:aload_3         
	//   24   37:aload_1         
	//   25   38:invokevirtual   #467 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   26   41:ldc2            #469 <String "mConnectState=">
	//   27   44:invokevirtual   #467 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   28   47:pop             
		i;
	//   29   48:iload           5
		JVM INSTR tableswitch 1 5: default 84
	//	               1 124
	//	               2 117
	//	               3 110
	//	               4 103
	//	               5 96;
	//   30   50:tableswitch     1 5: default 84
	//	               1 124
	//	               2 117
	//	               3 110
	//	               4 103
	//	               5 96
		   goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
		filedescriptor = "UNKNOWN";
	//   31   84:ldc2            #471 <String "UNKNOWN">
	//   32   87:astore_2        
_L8:
		printwriter.print(((String) (filedescriptor)));
	//   33   88:aload_3         
	//   34   89:aload_2         
	//   35   90:invokevirtual   #474 <Method void PrintWriter.print(String)>
		break; /* Loop/switch isn't completed */
	//   36   93:goto            131
_L6:
		filedescriptor = "DISCONNECTING";
	//   37   96:ldc2            #476 <String "DISCONNECTING">
	//   38   99:astore_2        
		continue; /* Loop/switch isn't completed */
	//   39  100:goto            88
_L5:
		filedescriptor = "CONNECTED";
	//   40  103:ldc2            #478 <String "CONNECTED">
	//   41  106:astore_2        
		continue; /* Loop/switch isn't completed */
	//   42  107:goto            88
_L4:
		filedescriptor = "LOCAL_CONNECTING";
	//   43  110:ldc2            #480 <String "LOCAL_CONNECTING">
	//   44  113:astore_2        
		continue; /* Loop/switch isn't completed */
	//   45  114:goto            88
_L3:
		filedescriptor = "REMOTE_CONNECTING";
	//   46  117:ldc2            #482 <String "REMOTE_CONNECTING">
	//   47  120:astore_2        
		continue; /* Loop/switch isn't completed */
	//   48  121:goto            88
_L2:
		filedescriptor = "DISCONNECTED";
	//   49  124:ldc2            #484 <String "DISCONNECTED">
	//   50  127:astore_2        
		if(true) goto _L8; else goto _L7
	//   51  128:goto            88
_L7:
		printwriter.append(" mService=");
	//   52  131:aload_3         
	//   53  132:ldc2            #486 <String " mService=">
	//   54  135:invokevirtual   #467 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   55  138:pop             
		if(as == null)
	//*  56  139:aload           4
	//*  57  141:ifnonnull       155
			printwriter.append("null");
	//   58  144:aload_3         
	//   59  145:ldc2            #488 <String "null">
	//   60  148:invokevirtual   #467 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   61  151:pop             
		else
	//*  62  152:goto            186
			printwriter.append(((CharSequence) (getServiceDescriptor()))).append("@").append(((CharSequence) (Integer.toHexString(System.identityHashCode(((Object) (((IInterface) (as)).asBinder())))))));
	//   63  155:aload_3         
	//   64  156:aload_0         
	//   65  157:invokevirtual   #366 <Method String getServiceDescriptor()>
	//   66  160:invokevirtual   #467 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   67  163:ldc2            #490 <String "@">
	//   68  166:invokevirtual   #467 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   69  169:aload           4
	//   70  171:invokeinterface #496 <Method IBinder IInterface.asBinder()>
	//   71  176:invokestatic    #502 <Method int System.identityHashCode(Object)>
	//   72  179:invokestatic    #508 <Method String Integer.toHexString(int)>
	//   73  182:invokevirtual   #467 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   74  185:pop             
		printwriter.append(" mServiceBroker=");
	//   75  186:aload_3         
	//   76  187:ldc2            #510 <String " mServiceBroker=">
	//   77  190:invokevirtual   #467 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   78  193:pop             
		if(igmsservicebroker == null)
	//*  79  194:aload           8
	//*  80  196:ifnonnull       209
			printwriter.println("null");
	//   81  199:aload_3         
	//   82  200:ldc2            #488 <String "null">
	//   83  203:invokevirtual   #513 <Method void PrintWriter.println(String)>
		else
	//*  84  206:goto            232
			printwriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(((Object) (igmsservicebroker.asBinder())))));
	//   85  209:aload_3         
	//   86  210:ldc2            #515 <String "IGmsServiceBroker@">
	//   87  213:invokevirtual   #467 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   88  216:aload           8
	//   89  218:invokeinterface #518 <Method IBinder IGmsServiceBroker.asBinder()>
	//   90  223:invokestatic    #502 <Method int System.identityHashCode(Object)>
	//   91  226:invokestatic    #508 <Method String Integer.toHexString(int)>
	//   92  229:invokevirtual   #513 <Method void PrintWriter.println(String)>
		as = ((String []) (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US)));
	//   93  232:new             #520 <Class SimpleDateFormat>
	//   94  235:dup             
	//   95  236:ldc2            #522 <String "yyyy-MM-dd HH:mm:ss.SSS">
	//   96  239:getstatic       #528 <Field Locale Locale.US>
	//   97  242:invokespecial   #531 <Method void SimpleDateFormat(String, Locale)>
	//   98  245:astore          4
		if(zzrc > 0L)
	//*  99  247:aload_0         
	//* 100  248:getfield        #533 <Field long zzrc>
	//* 101  251:lconst_0        
	//* 102  252:lcmp            
	//* 103  253:ifle            344
		{
			filedescriptor = ((FileDescriptor) (printwriter.append(((CharSequence) (s))).append("lastConnectedTime=")));
	//  104  256:aload_3         
	//  105  257:aload_1         
	//  106  258:invokevirtual   #467 <Method PrintWriter PrintWriter.append(CharSequence)>
	//  107  261:ldc2            #535 <String "lastConnectedTime=">
	//  108  264:invokevirtual   #467 <Method PrintWriter PrintWriter.append(CharSequence)>
	//  109  267:astore_2        
			long l = zzrc;
	//  110  268:aload_0         
	//  111  269:getfield        #533 <Field long zzrc>
	//  112  272:lstore          6
			String s1 = ((SimpleDateFormat) (as)).format(new Date(l));
	//  113  274:aload           4
	//  114  276:new             #537 <Class Date>
	//  115  279:dup             
	//  116  280:lload           6
	//  117  282:invokespecial   #540 <Method void Date(long)>
	//  118  285:invokevirtual   #544 <Method String SimpleDateFormat.format(Date)>
	//  119  288:astore          8
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s1))).length() + 21);
	//  120  290:new             #260 <Class StringBuilder>
	//  121  293:dup             
	//  122  294:aload           8
	//  123  296:invokestatic    #264 <Method String String.valueOf(Object)>
	//  124  299:invokevirtual   #268 <Method int String.length()>
	//  125  302:bipush          21
	//  126  304:iadd            
	//  127  305:invokespecial   #269 <Method void StringBuilder(int)>
	//  128  308:astore          9
			stringbuilder.append(l);
	//  129  310:aload           9
	//  130  312:lload           6
	//  131  314:invokevirtual   #547 <Method StringBuilder StringBuilder.append(long)>
	//  132  317:pop             
			stringbuilder.append(" ");
	//  133  318:aload           9
	//  134  320:ldc2            #549 <String " ">
	//  135  323:invokevirtual   #275 <Method StringBuilder StringBuilder.append(String)>
	//  136  326:pop             
			stringbuilder.append(s1);
	//  137  327:aload           9
	//  138  329:aload           8
	//  139  331:invokevirtual   #275 <Method StringBuilder StringBuilder.append(String)>
	//  140  334:pop             
			((PrintWriter) (filedescriptor)).println(stringbuilder.toString());
	//  141  335:aload_2         
	//  142  336:aload           9
	//  143  338:invokevirtual   #282 <Method String StringBuilder.toString()>
	//  144  341:invokevirtual   #513 <Method void PrintWriter.println(String)>
		}
		if(zzrb <= 0L)
			break MISSING_BLOCK_LABEL_509;
	//  145  344:aload_0         
	//  146  345:getfield        #551 <Field long zzrb>
	//  147  348:lconst_0        
	//  148  349:lcmp            
	//  149  350:ifle            509
		printwriter.append(((CharSequence) (s))).append("lastSuspendedCause=");
	//  150  353:aload_3         
	//  151  354:aload_1         
	//  152  355:invokevirtual   #467 <Method PrintWriter PrintWriter.append(CharSequence)>
	//  153  358:ldc2            #553 <String "lastSuspendedCause=">
	//  154  361:invokevirtual   #467 <Method PrintWriter PrintWriter.append(CharSequence)>
	//  155  364:pop             
		i = zzra;
	//  156  365:aload_0         
	//  157  366:getfield        #555 <Field int zzra>
	//  158  369:istore          5
		i;
	//  159  371:iload           5
		JVM INSTR tableswitch 1 2: default 396
	//	               1 418
	//	               2 411;
	//  160  373:tableswitch     1 2: default 396
	//	               1 418
	//	               2 411
		   goto _L9 _L10 _L11
_L9:
		filedescriptor = ((FileDescriptor) (String.valueOf(i)));
	//  161  396:iload           5
	//  162  398:invokestatic    #557 <Method String String.valueOf(int)>
	//  163  401:astore_2        
_L13:
		printwriter.append(((CharSequence) (filedescriptor)));
	//  164  402:aload_3         
	//  165  403:aload_2         
	//  166  404:invokevirtual   #467 <Method PrintWriter PrintWriter.append(CharSequence)>
	//  167  407:pop             
		break; /* Loop/switch isn't completed */
	//  168  408:goto            425
_L11:
		filedescriptor = "CAUSE_NETWORK_LOST";
	//  169  411:ldc2            #559 <String "CAUSE_NETWORK_LOST">
	//  170  414:astore_2        
		continue; /* Loop/switch isn't completed */
	//  171  415:goto            402
_L10:
		filedescriptor = "CAUSE_SERVICE_DISCONNECTED";
	//  172  418:ldc2            #561 <String "CAUSE_SERVICE_DISCONNECTED">
	//  173  421:astore_2        
		if(true) goto _L13; else goto _L12
	//  174  422:goto            402
_L12:
		filedescriptor = ((FileDescriptor) (printwriter.append(" lastSuspendedTime=")));
	//  175  425:aload_3         
	//  176  426:ldc2            #563 <String " lastSuspendedTime=">
	//  177  429:invokevirtual   #467 <Method PrintWriter PrintWriter.append(CharSequence)>
	//  178  432:astore_2        
		long l1 = zzrb;
	//  179  433:aload_0         
	//  180  434:getfield        #551 <Field long zzrb>
	//  181  437:lstore          6
		String s2 = ((SimpleDateFormat) (as)).format(new Date(l1));
	//  182  439:aload           4
	//  183  441:new             #537 <Class Date>
	//  184  444:dup             
	//  185  445:lload           6
	//  186  447:invokespecial   #540 <Method void Date(long)>
	//  187  450:invokevirtual   #544 <Method String SimpleDateFormat.format(Date)>
	//  188  453:astore          8
		StringBuilder stringbuilder1 = new StringBuilder(String.valueOf(((Object) (s2))).length() + 21);
	//  189  455:new             #260 <Class StringBuilder>
	//  190  458:dup             
	//  191  459:aload           8
	//  192  461:invokestatic    #264 <Method String String.valueOf(Object)>
	//  193  464:invokevirtual   #268 <Method int String.length()>
	//  194  467:bipush          21
	//  195  469:iadd            
	//  196  470:invokespecial   #269 <Method void StringBuilder(int)>
	//  197  473:astore          9
		stringbuilder1.append(l1);
	//  198  475:aload           9
	//  199  477:lload           6
	//  200  479:invokevirtual   #547 <Method StringBuilder StringBuilder.append(long)>
	//  201  482:pop             
		stringbuilder1.append(" ");
	//  202  483:aload           9
	//  203  485:ldc2            #549 <String " ">
	//  204  488:invokevirtual   #275 <Method StringBuilder StringBuilder.append(String)>
	//  205  491:pop             
		stringbuilder1.append(s2);
	//  206  492:aload           9
	//  207  494:aload           8
	//  208  496:invokevirtual   #275 <Method StringBuilder StringBuilder.append(String)>
	//  209  499:pop             
		((PrintWriter) (filedescriptor)).println(stringbuilder1.toString());
	//  210  500:aload_2         
	//  211  501:aload           9
	//  212  503:invokevirtual   #282 <Method String StringBuilder.toString()>
	//  213  506:invokevirtual   #513 <Method void PrintWriter.println(String)>
		if(zzre > 0L)
	//* 214  509:aload_0         
	//* 215  510:getfield        #565 <Field long zzre>
	//* 216  513:lconst_0        
	//* 217  514:lcmp            
	//* 218  515:ifle            616
		{
			printwriter.append(((CharSequence) (s))).append("lastFailedStatus=").append(((CharSequence) (CommonStatusCodes.getStatusCodeString(zzrd))));
	//  219  518:aload_3         
	//  220  519:aload_1         
	//  221  520:invokevirtual   #467 <Method PrintWriter PrintWriter.append(CharSequence)>
	//  222  523:ldc2            #567 <String "lastFailedStatus=">
	//  223  526:invokevirtual   #467 <Method PrintWriter PrintWriter.append(CharSequence)>
	//  224  529:aload_0         
	//  225  530:getfield        #569 <Field int zzrd>
	//  226  533:invokestatic    #574 <Method String CommonStatusCodes.getStatusCodeString(int)>
	//  227  536:invokevirtual   #467 <Method PrintWriter PrintWriter.append(CharSequence)>
	//  228  539:pop             
			s = ((String) (printwriter.append(" lastFailedTime=")));
	//  229  540:aload_3         
	//  230  541:ldc2            #576 <String " lastFailedTime=">
	//  231  544:invokevirtual   #467 <Method PrintWriter PrintWriter.append(CharSequence)>
	//  232  547:astore_1        
			long l2 = zzre;
	//  233  548:aload_0         
	//  234  549:getfield        #565 <Field long zzre>
	//  235  552:lstore          6
			filedescriptor = ((FileDescriptor) (((SimpleDateFormat) (as)).format(new Date(l2))));
	//  236  554:aload           4
	//  237  556:new             #537 <Class Date>
	//  238  559:dup             
	//  239  560:lload           6
	//  240  562:invokespecial   #540 <Method void Date(long)>
	//  241  565:invokevirtual   #544 <Method String SimpleDateFormat.format(Date)>
	//  242  568:astore_2        
			printwriter = ((PrintWriter) (new StringBuilder(String.valueOf(((Object) (filedescriptor))).length() + 21)));
	//  243  569:new             #260 <Class StringBuilder>
	//  244  572:dup             
	//  245  573:aload_2         
	//  246  574:invokestatic    #264 <Method String String.valueOf(Object)>
	//  247  577:invokevirtual   #268 <Method int String.length()>
	//  248  580:bipush          21
	//  249  582:iadd            
	//  250  583:invokespecial   #269 <Method void StringBuilder(int)>
	//  251  586:astore_3        
			((StringBuilder) (printwriter)).append(l2);
	//  252  587:aload_3         
	//  253  588:lload           6
	//  254  590:invokevirtual   #547 <Method StringBuilder StringBuilder.append(long)>
	//  255  593:pop             
			((StringBuilder) (printwriter)).append(" ");
	//  256  594:aload_3         
	//  257  595:ldc2            #549 <String " ">
	//  258  598:invokevirtual   #275 <Method StringBuilder StringBuilder.append(String)>
	//  259  601:pop             
			((StringBuilder) (printwriter)).append(((String) (filedescriptor)));
	//  260  602:aload_3         
	//  261  603:aload_2         
	//  262  604:invokevirtual   #275 <Method StringBuilder StringBuilder.append(String)>
	//  263  607:pop             
			((PrintWriter) (s)).println(((StringBuilder) (printwriter)).toString());
	//  264  608:aload_1         
	//  265  609:aload_3         
	//  266  610:invokevirtual   #282 <Method String StringBuilder.toString()>
	//  267  613:invokevirtual   #513 <Method void PrintWriter.println(String)>
		}
		return;
	//  268  616:return          
		s;
	//  269  617:astore_1        
		filedescriptor;
	//  270  618:aload_2         
		JVM INSTR monitorexit ;
	//  271  619:monitorexit     
		throw s;
	//  272  620:aload_1         
	//  273  621:athrow          
		s;
	//  274  622:astore_1        
		filedescriptor;
	//  275  623:aload_2         
		JVM INSTR monitorexit ;
	//  276  624:monitorexit     
		throw s;
	//  277  625:aload_1         
	//  278  626:athrow          
	}

	public Account getAccount()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final Account getAccountOrDefault()
	{
		if(getAccount() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #581 <Method Account getAccount()>
	//*   2    4:ifnull          12
			return getAccount();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #581 <Method Account getAccount()>
	//    5   11:areturn         
		else
			return new Account("<<default account>>", "com.google");
	//    6   12:new             #583 <Class Account>
	//    7   15:dup             
	//    8   16:ldc1            #56  <String "<<default account>>">
	//    9   18:ldc2            #585 <String "com.google">
	//   10   21:invokespecial   #588 <Method void Account(String, String)>
	//   11   24:areturn         
	}

	public Feature[] getApiFeatures()
	{
		return zzqz;
	//    0    0:getstatic       #125 <Field Feature[] zzqz>
	//    1    3:areturn         
	}

	public final Feature[] getAvailableFeatures()
	{
		ConnectionInfo connectioninfo = zzrt;
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field ConnectionInfo zzrt>
	//    2    4:astore_1        
		if(connectioninfo == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return connectioninfo.getAvailableFeatures();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #595 <Method Feature[] ConnectionInfo.getAvailableFeatures()>
	//    9   15:areturn         
	}

	public Bundle getConnectionHint()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final Context getContext()
	{
		return mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field Context mContext>
	//    2    4:areturn         
	}

	public String getEndpointPackageName()
	{
		if(isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #419 <Method boolean isConnected()>
	//*   2    4:ifeq            21
		{
			GmsServiceEndpoint gmsserviceendpoint = zzrf;
	//    3    7:aload_0         
	//    4    8:getfield        #249 <Field GmsServiceEndpoint zzrf>
	//    5   11:astore_1        
			if(gmsserviceendpoint != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          21
				return gmsserviceendpoint.getPackageName();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #258 <Method String GmsServiceEndpoint.getPackageName()>
	//   10   20:areturn         
		}
		throw new RuntimeException("Failed to connect when checking package");
	//   11   21:new             #600 <Class RuntimeException>
	//   12   24:dup             
	//   13   25:ldc2            #602 <String "Failed to connect when checking package">
	//   14   28:invokespecial   #603 <Method void RuntimeException(String)>
	//   15   31:athrow          
	}

	protected Bundle getGetServiceRequestExtraArgs()
	{
		return new Bundle();
	//    0    0:new             #606 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #607 <Method void Bundle()>
	//    3    7:areturn         
	}

	public final Handler getHandlerForTesting()
	{
		return mHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #178 <Field Handler mHandler>
	//    2    4:areturn         
	}

	protected String getLocalStartServiceAction()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final Looper getLooper()
	{
		return zzcn;
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field Looper zzcn>
	//    2    4:areturn         
	}

	public int getMinApkVersion()
	{
		return GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
	//    0    0:getstatic       #612 <Field int GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//    1    3:ireturn         
	}

	protected final String getRealClientName()
	{
		String s1 = zzrq;
	//    0    0:aload_0         
	//    1    1:getfield        #204 <Field String zzrq>
	//    2    4:astore_2        
		String s = s1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(s1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       22
			s = ((Object) (mContext)).getClass().getName();
	//    7   11:aload_0         
	//    8   12:getfield        #172 <Field Context mContext>
	//    9   15:invokevirtual   #616 <Method Class Object.getClass()>
	//   10   18:invokevirtual   #619 <Method String Class.getName()>
	//   11   21:astore_1        
		return s;
	//   12   22:aload_1         
	//   13   23:areturn         
	}

	public void getRemoteService(IAccountAccessor iaccountaccessor, Set set)
	{
		Object obj;
		obj = ((Object) (getGetServiceRequestExtraArgs()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #630 <Method Bundle getGetServiceRequestExtraArgs()>
	//    2    4:astore_3        
		obj = ((Object) ((new GetServiceRequest(zzrp)).setCallingPackage(mContext.getPackageName()).setExtraArgs(((Bundle) (obj)))));
	//    3    5:new             #632 <Class GetServiceRequest>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:getfield        #198 <Field int zzrp>
	//    7   13:invokespecial   #633 <Method void GetServiceRequest(int)>
	//    8   16:aload_0         
	//    9   17:getfield        #172 <Field Context mContext>
	//   10   20:invokevirtual   #315 <Method String Context.getPackageName()>
	//   11   23:invokevirtual   #637 <Method GetServiceRequest GetServiceRequest.setCallingPackage(String)>
	//   12   26:aload_3         
	//   13   27:invokevirtual   #641 <Method GetServiceRequest GetServiceRequest.setExtraArgs(Bundle)>
	//   14   30:astore_3        
		if(set != null)
	//*  15   31:aload_2         
	//*  16   32:ifnull          41
			((GetServiceRequest) (obj)).setScopes(((java.util.Collection) (set)));
	//   17   35:aload_3         
	//   18   36:aload_2         
	//   19   37:invokevirtual   #645 <Method GetServiceRequest GetServiceRequest.setScopes(java.util.Collection)>
	//   20   40:pop             
		if(requiresSignIn())
	//*  21   41:aload_0         
	//*  22   42:invokevirtual   #648 <Method boolean requiresSignIn()>
	//*  23   45:ifeq            64
			((GetServiceRequest) (obj)).setClientRequestedAccount(getAccountOrDefault()).setAuthenticatedAccount(iaccountaccessor);
	//   24   48:aload_3         
	//   25   49:aload_0         
	//   26   50:invokevirtual   #650 <Method Account getAccountOrDefault()>
	//   27   53:invokevirtual   #654 <Method GetServiceRequest GetServiceRequest.setClientRequestedAccount(Account)>
	//   28   56:aload_1         
	//   29   57:invokevirtual   #658 <Method GetServiceRequest GetServiceRequest.setAuthenticatedAccount(IAccountAccessor)>
	//   30   60:pop             
		else
	//*  31   61:goto            80
		if(requiresAccount())
	//*  32   64:aload_0         
	//*  33   65:invokevirtual   #661 <Method boolean requiresAccount()>
	//*  34   68:ifeq            80
			((GetServiceRequest) (obj)).setClientRequestedAccount(getAccount());
	//   35   71:aload_3         
	//   36   72:aload_0         
	//   37   73:invokevirtual   #581 <Method Account getAccount()>
	//   38   76:invokevirtual   #654 <Method GetServiceRequest GetServiceRequest.setClientRequestedAccount(Account)>
	//   39   79:pop             
		((GetServiceRequest) (obj)).setClientRequiredFeatures(getRequiredFeatures());
	//   40   80:aload_3         
	//   41   81:aload_0         
	//   42   82:invokevirtual   #664 <Method Feature[] getRequiredFeatures()>
	//   43   85:invokevirtual   #668 <Method GetServiceRequest GetServiceRequest.setClientRequiredFeatures(Feature[])>
	//   44   88:pop             
		((GetServiceRequest) (obj)).setClientApiFeatures(getApiFeatures());
	//   45   89:aload_3         
	//   46   90:aload_0         
	//   47   91:invokevirtual   #670 <Method Feature[] getApiFeatures()>
	//   48   94:invokevirtual   #673 <Method GetServiceRequest GetServiceRequest.setClientApiFeatures(Feature[])>
	//   49   97:pop             
		iaccountaccessor = ((IAccountAccessor) (zzrh));
	//   50   98:aload_0         
	//   51   99:getfield        #140 <Field Object zzrh>
	//   52  102:astore_1        
		iaccountaccessor;
	//   53  103:aload_1         
		JVM INSTR monitorenter ;
	//   54  104:monitorenter    
		if(zzri != null)
	//*  55  105:aload_0         
	//*  56  106:getfield        #230 <Field IGmsServiceBroker zzri>
	//*  57  109:ifnull          140
		{
			zzri.getService(((IGmsCallbacks) (new GmsCallbacks(this, mDisconnectCount.get()))), ((GetServiceRequest) (obj)));
	//   58  112:aload_0         
	//   59  113:getfield        #230 <Field IGmsServiceBroker zzri>
	//   60  116:new             #19  <Class BaseGmsClient$GmsCallbacks>
	//   61  119:dup             
	//   62  120:aload_0         
	//   63  121:aload_0         
	//   64  122:getfield        #160 <Field AtomicInteger mDisconnectCount>
	//   65  125:invokevirtual   #304 <Method int AtomicInteger.get()>
	//   66  128:invokespecial   #674 <Method void BaseGmsClient$GmsCallbacks(BaseGmsClient, int)>
	//   67  131:aload_3         
	//   68  132:invokeinterface #678 <Method void IGmsServiceBroker.getService(IGmsCallbacks, GetServiceRequest)>
			break MISSING_BLOCK_LABEL_150;
	//   69  137:goto            150
		}
		Log.w("GmsClient", "mServiceBroker is null, client disconnected");
	//   70  140:ldc2            #279 <String "GmsClient">
	//   71  143:ldc2            #680 <String "mServiceBroker is null, client disconnected">
	//   72  146:invokestatic    #683 <Method int Log.w(String, String)>
	//   73  149:pop             
		iaccountaccessor;
	//   74  150:aload_1         
		JVM INSTR monitorexit ;
	//   75  151:monitorexit     
		return;
	//   76  152:return          
		set;
	//   77  153:astore_2        
		iaccountaccessor;
	//   78  154:aload_1         
		JVM INSTR monitorexit ;
	//   79  155:monitorexit     
		try
		{
			throw set;
	//   80  156:aload_2         
	//   81  157:athrow          
		}
	//*  82  158:astore_1        
	//*  83  159:goto            163
	//*  84  162:astore_1        
	//*  85  163:ldc2            #279 <String "GmsClient">
	//*  86  166:ldc2            #685 <String "IGmsServiceBroker.getService failed">
	//*  87  169:aload_1         
	//*  88  170:invokestatic    #688 <Method int Log.w(String, String, Throwable)>
	//*  89  173:pop             
	//*  90  174:aload_0         
	//*  91  175:bipush          8
	//*  92  177:aconst_null     
	//*  93  178:aconst_null     
	//*  94  179:aload_0         
	//*  95  180:getfield        #160 <Field AtomicInteger mDisconnectCount>
	//*  96  183:invokevirtual   #304 <Method int AtomicInteger.get()>
	//*  97  186:invokevirtual   #692 <Method void onPostInitHandler(int, IBinder, Bundle, int)>
	//*  98  189:return          
	//*  99  190:astore_1        
	//* 100  191:aload_1         
	//* 101  192:athrow          
		// Misplaced declaration of an exception variable
		catch(IAccountAccessor iaccountaccessor)
	//* 102  193:astore_1        
		{
			Log.w("GmsClient", "IGmsServiceBroker.getService failed", ((Throwable) (iaccountaccessor)));
	//  103  194:ldc2            #279 <String "GmsClient">
	//  104  197:ldc2            #685 <String "IGmsServiceBroker.getService failed">
	//  105  200:aload_1         
	//  106  201:invokestatic    #688 <Method int Log.w(String, String, Throwable)>
	//  107  204:pop             
			triggerConnectionSuspended(1);
	//  108  205:aload_0         
	//  109  206:iconst_1        
	//  110  207:invokevirtual   #695 <Method void triggerConnectionSuspended(int)>
			return;
	//  111  210:return          
		}
		// Misplaced declaration of an exception variable
		catch(IAccountAccessor iaccountaccessor)
		{
			throw iaccountaccessor;
		}
		// Misplaced declaration of an exception variable
		catch(IAccountAccessor iaccountaccessor) { }
		// Misplaced declaration of an exception variable
		catch(IAccountAccessor iaccountaccessor) { }
		Log.w("GmsClient", "IGmsServiceBroker.getService failed", ((Throwable) (iaccountaccessor)));
		onPostInitHandler(8, ((IBinder) (null)), ((Bundle) (null)), mDisconnectCount.get());
		return;
	}

	public Feature[] getRequiredFeatures()
	{
		return zzqz;
	//    0    0:getstatic       #125 <Field Feature[] zzqz>
	//    1    3:areturn         
	}

	protected Set getScopes()
	{
		return Collections.EMPTY_SET;
	//    0    0:getstatic       #704 <Field Set Collections.EMPTY_SET>
	//    1    3:areturn         
	}

	public final IInterface getService()
		throws DeadObjectException
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(zzrm == 5)
			break MISSING_BLOCK_LABEL_47;
	//    5    7:aload_0         
	//    6    8:getfield        #147 <Field int zzrm>
	//    7   11:iconst_5        
	//    8   12:icmpeq          47
		checkConnected();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #708 <Method void checkConnected()>
		boolean flag;
		IInterface iinterface;
		Exception exception;
		if(zzrj != null)
	//*  11   19:aload_0         
	//*  12   20:getfield        #238 <Field IInterface zzrj>
	//*  13   23:ifnull          60
			flag = true;
	//   14   26:iconst_1        
	//   15   27:istore_1        
		else
	//*  16   28:goto            31
	//*  17   31:iload_1         
	//*  18   32:ldc2            #710 <String "Client is connected but service is null">
	//*  19   35:invokestatic    #714 <Method void Preconditions.checkState(boolean, Object)>
	//*  20   38:aload_0         
	//*  21   39:getfield        #238 <Field IInterface zzrj>
	//*  22   42:astore_3        
	//*  23   43:aload_2         
	//*  24   44:monitorexit     
	//*  25   45:aload_3         
	//*  26   46:areturn         
	//*  27   47:new             #624 <Class DeadObjectException>
	//*  28   50:dup             
	//*  29   51:invokespecial   #715 <Method void DeadObjectException()>
	//*  30   54:athrow          
	//*  31   55:astore_3        
	//*  32   56:aload_2         
	//*  33   57:monitorexit     
	//*  34   58:aload_3         
	//*  35   59:athrow          
			flag = false;
	//   36   60:iconst_0        
	//   37   61:istore_1        
		Preconditions.checkState(flag, "Client is connected but service is null");
		iinterface = zzrj;
		obj;
		JVM INSTR monitorexit ;
		return iinterface;
		throw new DeadObjectException();
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  38   62:goto            31
	}

	protected int getServiceBindFlags()
	{
		return 129;
	//    0    0:sipush          129
	//    1    3:ireturn         
	}

	public IBinder getServiceBrokerBinder()
	{
label0:
		{
			synchronized(zzrh)
	//*   0    0:aload_0         
	//*   1    1:getfield        #140 <Field Object zzrh>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(zzri != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #230 <Field IGmsServiceBroker zzri>
	//    7   11:ifnonnull       18
			}
	//    8   14:aload_1         
	//    9   15:monitorexit     
			return null;
	//   10   16:aconst_null     
	//   11   17:areturn         
		}
		IBinder ibinder = zzri.asBinder();
	//   12   18:aload_0         
	//   13   19:getfield        #230 <Field IGmsServiceBroker zzri>
	//   14   22:invokeinterface #518 <Method IBinder IGmsServiceBroker.asBinder()>
	//   15   27:astore_2        
		obj;
	//   16   28:aload_1         
		JVM INSTR monitorexit ;
	//   17   29:monitorexit     
		return ibinder;
	//   18   30:aload_2         
	//   19   31:areturn         
		exception;
	//   20   32:astore_2        
		obj;
	//   21   33:aload_1         
		JVM INSTR monitorexit ;
	//   22   34:monitorexit     
		throw exception;
	//   23   35:aload_2         
	//   24   36:athrow          
	}

	public final IGmsServiceBroker getServiceBrokerForTesting()
	{
		IGmsServiceBroker igmsservicebroker;
		synchronized(zzrh)
	//*   0    0:aload_0         
	//*   1    1:getfield        #140 <Field Object zzrh>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			igmsservicebroker = zzri;
	//    5    7:aload_0         
	//    6    8:getfield        #230 <Field IGmsServiceBroker zzri>
	//    7   11:astore_2        
		}
	//    8   12:aload_1         
	//    9   13:monitorexit     
		return igmsservicebroker;
	//   10   14:aload_2         
	//   11   15:areturn         
		exception;
	//   12   16:astore_2        
		obj;
	//   13   17:aload_1         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_2         
	//   16   20:athrow          
	}

	protected abstract String getServiceDescriptor();

	public Intent getSignInIntent()
	{
		throw new UnsupportedOperationException("Not a sign in API");
	//    0    0:new             #724 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #726 <String "Not a sign in API">
	//    3    7:invokespecial   #727 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected abstract String getStartServiceAction();

	protected String getStartServicePackage()
	{
		return "com.google.android.gms";
	//    0    0:ldc2            #729 <String "com.google.android.gms">
	//    1    3:areturn         
	}

	public boolean isConnected()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		Exception exception;
		if(zzrm == 4)
	//*   5    7:aload_0         
	//*   6    8:getfield        #147 <Field int zzrm>
	//*   7   11:iconst_4        
	//*   8   12:icmpne          29
			flag = true;
	//    9   15:iconst_1        
	//   10   16:istore_1        
		else
	//*  11   17:goto            20
	//*  12   20:aload_2         
	//*  13   21:monitorexit     
	//*  14   22:iload_1         
	//*  15   23:ireturn         
	//*  16   24:astore_3        
	//*  17   25:aload_2         
	//*  18   26:monitorexit     
	//*  19   27:aload_3         
	//*  20   28:athrow          
			flag = false;
	//   21   29:iconst_0        
	//   22   30:istore_1        
		obj;
		JVM INSTR monitorexit ;
		return flag;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  23   31:goto            20
	}

	public boolean isConnecting()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		Exception exception;
		if(zzrm != 2 && zzrm != 3)
	//*   5    7:aload_0         
	//*   6    8:getfield        #147 <Field int zzrm>
	//*   7   11:iconst_2        
	//*   8   12:icmpeq          40
	//*   9   15:aload_0         
	//*  10   16:getfield        #147 <Field int zzrm>
	//*  11   19:iconst_3        
	//*  12   20:icmpne          35
	//*  13   23:goto            40
	//*  14   26:aload_2         
	//*  15   27:monitorexit     
	//*  16   28:iload_1         
	//*  17   29:ireturn         
	//*  18   30:astore_3        
	//*  19   31:aload_2         
	//*  20   32:monitorexit     
	//*  21   33:aload_3         
	//*  22   34:athrow          
			flag = false;
	//   23   35:iconst_0        
	//   24   36:istore_1        
		else
	//*  25   37:goto            26
			flag = true;
	//   26   40:iconst_1        
	//   27   41:istore_1        
		obj;
		JVM INSTR monitorexit ;
		return flag;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  28   42:goto            26
	}

	protected void onConnectedLocked(IInterface iinterface)
	{
		zzrc = System.currentTimeMillis();
	//    0    0:aload_0         
	//    1    1:invokestatic    #735 <Method long System.currentTimeMillis()>
	//    2    4:putfield        #533 <Field long zzrc>
	//    3    7:return          
	}

	protected void onConnectionFailed(ConnectionResult connectionresult)
	{
		zzrd = connectionresult.getErrorCode();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #743 <Method int ConnectionResult.getErrorCode()>
	//    3    5:putfield        #569 <Field int zzrd>
		zzre = System.currentTimeMillis();
	//    4    8:aload_0         
	//    5    9:invokestatic    #735 <Method long System.currentTimeMillis()>
	//    6   12:putfield        #565 <Field long zzre>
	//    7   15:return          
	}

	protected void onConnectionSuspended(int i)
	{
		zzra = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #555 <Field int zzra>
		zzrb = System.currentTimeMillis();
	//    3    5:aload_0         
	//    4    6:invokestatic    #735 <Method long System.currentTimeMillis()>
	//    5    9:putfield        #551 <Field long zzrb>
	//    6   12:return          
	}

	protected void onPostInitHandler(int i, IBinder ibinder, Bundle bundle, int j)
	{
		Handler handler = mHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #178 <Field Handler mHandler>
	//    2    4:astore          5
		handler.sendMessage(handler.obtainMessage(1, j, -1, ((Object) (new PostInitCallback(i, ibinder, bundle)))));
	//    3    6:aload           5
	//    4    8:aload           5
	//    5   10:iconst_1        
	//    6   11:iload           4
	//    7   13:iconst_m1       
	//    8   14:new             #28  <Class BaseGmsClient$PostInitCallback>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:aload_2         
	//   13   21:aload_3         
	//   14   22:invokespecial   #747 <Method void BaseGmsClient$PostInitCallback(BaseGmsClient, int, IBinder, Bundle)>
	//   15   25:invokevirtual   #458 <Method Message Handler.obtainMessage(int, int, int, Object)>
	//   16   28:invokevirtual   #396 <Method boolean Handler.sendMessage(Message)>
	//   17   31:pop             
	//   18   32:return          
	}

	protected void onPostServiceBindingHandler(int i, Bundle bundle, int j)
	{
		Handler handler = mHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #178 <Field Handler mHandler>
	//    2    4:astore          4
		handler.sendMessage(handler.obtainMessage(7, j, -1, ((Object) (new PostServiceBindingCallback(i, bundle)))));
	//    3    6:aload           4
	//    4    8:aload           4
	//    5   10:bipush          7
	//    6   12:iload_3         
	//    7   13:iconst_m1       
	//    8   14:new             #31  <Class BaseGmsClient$PostServiceBindingCallback>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:aload_2         
	//   13   21:invokespecial   #750 <Method void BaseGmsClient$PostServiceBindingCallback(BaseGmsClient, int, Bundle)>
	//   14   24:invokevirtual   #458 <Method Message Handler.obtainMessage(int, int, int, Object)>
	//   15   27:invokevirtual   #396 <Method boolean Handler.sendMessage(Message)>
	//   16   30:pop             
	//   17   31:return          
	}

	void onSetConnectState(int i, IInterface iinterface)
	{
	//    0    0:return          
	}

	public void onUserSignOut(SignOutCallbacks signoutcallbacks)
	{
		signoutcallbacks.onSignOutComplete();
	//    0    0:aload_1         
	//    1    1:invokeinterface #755 <Method void BaseGmsClient$SignOutCallbacks.onSignOutComplete()>
	//    2    6:return          
	}

	public boolean providesSignIn()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean requiresAccount()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean requiresGooglePlayServices()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean requiresSignIn()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void setConnectionInfoForTesting(ConnectionInfo connectioninfo)
	{
		zzrt = connectioninfo;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #153 <Field ConnectionInfo zzrt>
	//    3    5:return          
	}

	public final void setServiceBrokerForTesting(IGmsServiceBroker igmsservicebroker)
	{
		synchronized(zzrh)
	//*   0    0:aload_0         
	//*   1    1:getfield        #140 <Field Object zzrh>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzri = igmsservicebroker;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #230 <Field IGmsServiceBroker zzri>
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return;
	//   10   14:return          
		igmsservicebroker;
	//   11   15:astore_1        
		obj;
	//   12   16:aload_2         
		JVM INSTR monitorexit ;
	//   13   17:monitorexit     
		throw igmsservicebroker;
	//   14   18:aload_1         
	//   15   19:athrow          
	}

	public final void setServiceForTesting(IInterface iinterface)
	{
		byte byte0;
		if(iinterface != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          9
			byte0 = 4;
	//    2    4:iconst_4        
	//    3    5:istore_2        
		else
	//*   4    6:goto            11
			byte0 = 1;
	//    5    9:iconst_1        
	//    6   10:istore_2        
		zza(((int) (byte0)), iinterface);
	//    7   11:aload_0         
	//    8   12:iload_2         
	//    9   13:aload_1         
	//   10   14:invokespecial   #345 <Method void zza(int, IInterface)>
	//   11   17:return          
	}

	public void triggerConnectionSuspended(int i)
	{
		Handler handler = mHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #178 <Field Handler mHandler>
	//    2    4:astore_2        
		handler.sendMessage(handler.obtainMessage(6, mDisconnectCount.get(), i));
	//    3    5:aload_2         
	//    4    6:aload_2         
	//    5    7:bipush          6
	//    6    9:aload_0         
	//    7   10:getfield        #160 <Field AtomicInteger mDisconnectCount>
	//    8   13:invokevirtual   #304 <Method int AtomicInteger.get()>
	//    9   16:iload_1         
	//   10   17:invokevirtual   #392 <Method Message Handler.obtainMessage(int, int, int)>
	//   11   20:invokevirtual   #396 <Method boolean Handler.sendMessage(Message)>
	//   12   23:pop             
	//   13   24:return          
	}

	protected void triggerNotAvailable(ConnectionProgressReportCallbacks connectionprogressreportcallbacks, int i, PendingIntent pendingintent)
	{
		mConnectionProgressReportCallbacks = (ConnectionProgressReportCallbacks)Preconditions.checkNotNull(((Object) (connectionprogressreportcallbacks)), "Connection progress callbacks cannot be null.");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #429 <String "Connection progress callbacks cannot be null.">
	//    3    5:invokestatic    #168 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    4    8:checkcast       #16  <Class BaseGmsClient$ConnectionProgressReportCallbacks>
	//    5   11:putfield        #431 <Field BaseGmsClient$ConnectionProgressReportCallbacks mConnectionProgressReportCallbacks>
		connectionprogressreportcallbacks = ((ConnectionProgressReportCallbacks) (mHandler));
	//    6   14:aload_0         
	//    7   15:getfield        #178 <Field Handler mHandler>
	//    8   18:astore_1        
		((Handler) (connectionprogressreportcallbacks)).sendMessage(((Handler) (connectionprogressreportcallbacks)).obtainMessage(3, mDisconnectCount.get(), i, ((Object) (pendingintent))));
	//    9   19:aload_1         
	//   10   20:aload_1         
	//   11   21:iconst_3        
	//   12   22:aload_0         
	//   13   23:getfield        #160 <Field AtomicInteger mDisconnectCount>
	//   14   26:invokevirtual   #304 <Method int AtomicInteger.get()>
	//   15   29:iload_2         
	//   16   30:aload_3         
	//   17   31:invokevirtual   #458 <Method Message Handler.obtainMessage(int, int, int, Object)>
	//   18   34:invokevirtual   #396 <Method boolean Handler.sendMessage(Message)>
	//   19   37:pop             
	//   20   38:return          
	}

	public static final int CONNECT_STATE_CONNECTED = 4;
	public static final int CONNECT_STATE_DISCONNECTED = 1;
	public static final int CONNECT_STATE_DISCONNECTING = 5;
	public static final int CONNECT_STATE_LOCAL_CONNECTING = 3;
	public static final int CONNECT_STATE_REMOTE_CONNECTING = 2;
	public static final String DEFAULT_ACCOUNT = "<<default account>>";
	public static final String FEATURE_GOOGLE_ME = "service_googleme";
	public static final String GOOGLE_PLUS_REQUIRED_FEATURES[] = {
		"service_esmobile", "service_googleme"
	};
	public static final String KEY_PENDING_INTENT = "pendingIntent";
	private static final Feature zzqz[] = new Feature[0];
	protected ConnectionProgressReportCallbacks mConnectionProgressReportCallbacks;
	private final Context mContext;
	protected AtomicInteger mDisconnectCount;
	final Handler mHandler;
	private final Object mLock;
	private final Looper zzcn;
	private final GoogleApiAvailabilityLight zzgk;
	private int zzra;
	private long zzrb;
	private long zzrc;
	private int zzrd;
	private long zzre;
	private GmsServiceEndpoint zzrf;
	private final GmsClientSupervisor zzrg;
	private final Object zzrh;
	private IGmsServiceBroker zzri;
	private IInterface zzrj;
	private final ArrayList zzrk;
	private GmsServiceConnection zzrl;
	private int zzrm;
	private final BaseConnectionCallbacks zzrn;
	private final BaseOnConnectionFailedListener zzro;
	private final int zzrp;
	private final String zzrq;
	private ConnectionResult zzrr;
	private boolean zzrs;
	private volatile ConnectionInfo zzrt;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       Feature[]
	//    2    4:putstatic       #125 <Field Feature[] zzqz>
	//    3    7:iconst_2        
	//    4    8:anewarray       String[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:ldc1            #129 <String "service_esmobile">
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:ldc1            #59  <String "service_googleme">
	//   12   20:aastore         
	//   13   21:putstatic       #131 <Field String[] GOOGLE_PLUS_REQUIRED_FEATURES>
	//*  14   24:return          
	}
}
