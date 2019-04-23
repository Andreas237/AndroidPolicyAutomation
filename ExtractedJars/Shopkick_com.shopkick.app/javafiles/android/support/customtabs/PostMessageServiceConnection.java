// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.customtabs;

import android.content.*;
import android.os.*;

// Referenced classes of package android.support.customtabs:
//			CustomTabsSessionToken, PostMessageService, IPostMessageService, ICustomTabsCallback

public abstract class PostMessageServiceConnection
	implements ServiceConnection
{

	public PostMessageServiceConnection(CustomTabsSessionToken customtabssessiontoken)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void Object()>
	//    6   12:putfield        #19  <Field Object mLock>
		mSessionBinder = ICustomTabsCallback.Stub.asInterface(customtabssessiontoken.getCallbackBinder());
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #25  <Method IBinder CustomTabsSessionToken.getCallbackBinder()>
	//   10   20:invokestatic    #31  <Method ICustomTabsCallback ICustomTabsCallback$Stub.asInterface(IBinder)>
	//   11   23:putfield        #33  <Field ICustomTabsCallback mSessionBinder>
	//   12   26:return          
	}

	public boolean bindSessionToPostMessageService(Context context, String s)
	{
		Intent intent = new Intent();
	//    0    0:new             #38  <Class Intent>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void Intent()>
	//    3    7:astore_3        
		intent.setClassName(s, ((Class) (android/support/customtabs/PostMessageService)).getName());
	//    4    8:aload_3         
	//    5    9:aload_2         
	//    6   10:ldc1            #41  <Class PostMessageService>
	//    7   12:invokevirtual   #47  <Method String Class.getName()>
	//    8   15:invokevirtual   #51  <Method Intent Intent.setClassName(String, String)>
	//    9   18:pop             
		return context.bindService(intent, ((ServiceConnection) (this)), 1);
	//   10   19:aload_1         
	//   11   20:aload_3         
	//   12   21:aload_0         
	//   13   22:iconst_1        
	//   14   23:invokevirtual   #57  <Method boolean Context.bindService(Intent, ServiceConnection, int)>
	//   15   26:ireturn         
	}

	public final boolean notifyMessageChannelReady(Bundle bundle)
	{
		if(mService == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field IPostMessageService mService>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(true) goto _L2; else goto _L1
	//*   5    9:aload_0         
	//*   6   10:getfield        #19  <Field Object mLock>
	//*   7   13:astore_2        
_L1:
		obj;
	//    8   14:aload_2         
		JVM INSTR monitorenter ;
	//    9   15:monitorenter    
_L2:
		synchronized(mLock)
		{
			mService.onMessageChannelReady(mSessionBinder, bundle);
	//   10   16:aload_0         
	//   11   17:getfield        #63  <Field IPostMessageService mService>
	//   12   20:aload_0         
	//   13   21:getfield        #33  <Field ICustomTabsCallback mSessionBinder>
	//   14   24:aload_1         
	//   15   25:invokeinterface #69  <Method void IPostMessageService.onMessageChannelReady(ICustomTabsCallback, Bundle)>
		}
	//   16   30:aload_2         
	//   17   31:monitorexit     
		return true;
	//   18   32:iconst_1        
	//   19   33:ireturn         
_L3:
		obj;
	//   20   34:aload_2         
		JVM INSTR monitorexit ;
	//   21   35:monitorexit     
		return false;
	//   22   36:iconst_0        
	//   23   37:ireturn         
_L4:
		obj;
	//   24   38:aload_2         
		JVM INSTR monitorexit ;
	//   25   39:monitorexit     
		throw bundle;
	//   26   40:aload_1         
	//   27   41:athrow          
		bundle;
	//   28   42:astore_1        
		  goto _L3
	//*  29   43:goto            34
		bundle;
	//   30   46:astore_1        
		  goto _L4
	//*  31   47:goto            38
	}

	public void onPostMessageServiceConnected()
	{
	//    0    0:return          
	}

	public void onPostMessageServiceDisconnected()
	{
	//    0    0:return          
	}

	public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
	{
		mService = IPostMessageService.Stub.asInterface(ibinder);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokestatic    #78  <Method IPostMessageService IPostMessageService$Stub.asInterface(IBinder)>
	//    3    5:putfield        #63  <Field IPostMessageService mService>
		onPostMessageServiceConnected();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #80  <Method void onPostMessageServiceConnected()>
	//    6   12:return          
	}

	public final void onServiceDisconnected(ComponentName componentname)
	{
		mService = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #63  <Field IPostMessageService mService>
		onPostMessageServiceDisconnected();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #84  <Method void onPostMessageServiceDisconnected()>
	//    5    9:return          
	}

	public final boolean postMessage(String s, Bundle bundle)
	{
		if(mService == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field IPostMessageService mService>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(true) goto _L2; else goto _L1
	//*   5    9:aload_0         
	//*   6   10:getfield        #19  <Field Object mLock>
	//*   7   13:astore_3        
_L1:
		obj;
	//    8   14:aload_3         
		JVM INSTR monitorenter ;
	//    9   15:monitorenter    
_L2:
		synchronized(mLock)
		{
			mService.onPostMessage(mSessionBinder, s, bundle);
	//   10   16:aload_0         
	//   11   17:getfield        #63  <Field IPostMessageService mService>
	//   12   20:aload_0         
	//   13   21:getfield        #33  <Field ICustomTabsCallback mSessionBinder>
	//   14   24:aload_1         
	//   15   25:aload_2         
	//   16   26:invokeinterface #90  <Method void IPostMessageService.onPostMessage(ICustomTabsCallback, String, Bundle)>
		}
	//   17   31:aload_3         
	//   18   32:monitorexit     
		return true;
	//   19   33:iconst_1        
	//   20   34:ireturn         
_L3:
		obj;
	//   21   35:aload_3         
		JVM INSTR monitorexit ;
	//   22   36:monitorexit     
		return false;
	//   23   37:iconst_0        
	//   24   38:ireturn         
_L4:
		obj;
	//   25   39:aload_3         
		JVM INSTR monitorexit ;
	//   26   40:monitorexit     
		throw s;
	//   27   41:aload_1         
	//   28   42:athrow          
		s;
	//   29   43:astore_1        
		  goto _L3
	//*  30   44:goto            35
		s;
	//   31   47:astore_1        
		  goto _L4
	//*  32   48:goto            39
	}

	public void unbindFromContext(Context context)
	{
		context.unbindService(((ServiceConnection) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #96  <Method void Context.unbindService(ServiceConnection)>
	//    3    5:return          
	}

	private final Object mLock = new Object();
	private IPostMessageService mService;
	private final ICustomTabsCallback mSessionBinder;
}
