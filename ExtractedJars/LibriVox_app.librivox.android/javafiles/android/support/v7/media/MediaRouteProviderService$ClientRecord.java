// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.os.*;
import android.support.v4.g.p;
import android.util.SparseArray;

// Referenced classes of package android.support.v7.media:
//			MediaRouteProviderService, MediaRouteProvider, MediaRouteDiscoveryRequest

final class MediaRouteProviderService$ClientRecord
	implements android.os.IBinder.DeathRecipient
{

	public void binderDied()
	{
		mPrivateHandler.obtainMessage(1, ((Object) (mMessenger))).sendToTarget();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field MediaRouteProviderService this$0>
	//    2    4:getfield        #40  <Field MediaRouteProviderService$PrivateHandler MediaRouteProviderService.mPrivateHandler>
	//    3    7:iconst_1        
	//    4    8:aload_0         
	//    5    9:getfield        #30  <Field Messenger mMessenger>
	//    6   12:invokevirtual   #46  <Method Message MediaRouteProviderService$PrivateHandler.obtainMessage(int, Object)>
	//    7   15:invokevirtual   #51  <Method void Message.sendToTarget()>
	//    8   18:return          
	}

	public boolean createRouteController(String s, String s1, int i)
	{
		if(mControllers.indexOfKey(i) < 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field SparseArray mControllers>
	//*   2    4:iload_3         
	//*   3    5:invokevirtual   #57  <Method int SparseArray.indexOfKey(int)>
	//*   4    8:ifge            58
		{
			if(s1 == null)
	//*   5   11:aload_2         
	//*   6   12:ifnonnull       30
				s = ((String) (mProvider.onCreateRouteController(s)));
	//    7   15:aload_0         
	//    8   16:getfield        #20  <Field MediaRouteProviderService this$0>
	//    9   19:getfield        #61  <Field MediaRouteProvider MediaRouteProviderService.mProvider>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #67  <Method MediaRouteProvider$RouteController MediaRouteProvider.onCreateRouteController(String)>
	//   12   26:astore_1        
			else
	//*  13   27:goto            43
				s = ((String) (mProvider.onCreateRouteController(s, s1)));
	//   14   30:aload_0         
	//   15   31:getfield        #20  <Field MediaRouteProviderService this$0>
	//   16   34:getfield        #61  <Field MediaRouteProvider MediaRouteProviderService.mProvider>
	//   17   37:aload_1         
	//   18   38:aload_2         
	//   19   39:invokevirtual   #70  <Method MediaRouteProvider$RouteController MediaRouteProvider.onCreateRouteController(String, String)>
	//   20   42:astore_1        
			if(s != null)
	//*  21   43:aload_1         
	//*  22   44:ifnull          58
			{
				mControllers.put(i, ((Object) (s)));
	//   23   47:aload_0         
	//   24   48:getfield        #28  <Field SparseArray mControllers>
	//   25   51:iload_3         
	//   26   52:aload_1         
	//   27   53:invokevirtual   #74  <Method void SparseArray.put(int, Object)>
				return true;
	//   28   56:iconst_1        
	//   29   57:ireturn         
			}
		}
		return false;
	//   30   58:iconst_0        
	//   31   59:ireturn         
	}

	public void dispose()
	{
		int j = mControllers.size();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field SparseArray mControllers>
	//    2    4:invokevirtual   #79  <Method int SparseArray.size()>
	//    3    7:istore_2        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpge          36
			((MediaRouteProvider.RouteController)mControllers.valueAt(i)).onRelease();
	//    9   15:aload_0         
	//   10   16:getfield        #28  <Field SparseArray mControllers>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #83  <Method Object SparseArray.valueAt(int)>
	//   13   23:checkcast       #85  <Class MediaRouteProvider$RouteController>
	//   14   26:invokevirtual   #88  <Method void MediaRouteProvider$RouteController.onRelease()>

	//   15   29:iload_1         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_1        
	//*  19   33:goto            10
		mControllers.clear();
	//   20   36:aload_0         
	//   21   37:getfield        #28  <Field SparseArray mControllers>
	//   22   40:invokevirtual   #91  <Method void SparseArray.clear()>
		mMessenger.getBinder().unlinkToDeath(((android.os.IBinder.DeathRecipient) (this)), 0);
	//   23   43:aload_0         
	//   24   44:getfield        #30  <Field Messenger mMessenger>
	//   25   47:invokevirtual   #97  <Method IBinder Messenger.getBinder()>
	//   26   50:aload_0         
	//   27   51:iconst_0        
	//   28   52:invokeinterface #103 <Method boolean IBinder.unlinkToDeath(android.os.IBinder$DeathRecipient, int)>
	//   29   57:pop             
		setDiscoveryRequest(((MediaRouteDiscoveryRequest) (null)));
	//   30   58:aload_0         
	//   31   59:aconst_null     
	//   32   60:invokevirtual   #107 <Method boolean setDiscoveryRequest(MediaRouteDiscoveryRequest)>
	//   33   63:pop             
	//   34   64:return          
	}

	public MediaRouteProvider.RouteController getRouteController(int i)
	{
		return (MediaRouteProvider.RouteController)mControllers.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field SparseArray mControllers>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #112 <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #85  <Class MediaRouteProvider$RouteController>
	//    5   11:areturn         
	}

	public boolean hasMessenger(Messenger messenger)
	{
		return mMessenger.getBinder() == messenger.getBinder();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Messenger mMessenger>
	//    2    4:invokevirtual   #97  <Method IBinder Messenger.getBinder()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #97  <Method IBinder Messenger.getBinder()>
	//    5   11:if_acmpne       16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean register()
	{
		RemoteException remoteexception;
		try
		{
			mMessenger.getBinder().linkToDeath(((android.os.IBinder.DeathRecipient) (this)), 0);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Messenger mMessenger>
	//    2    4:invokevirtual   #97  <Method IBinder Messenger.getBinder()>
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:invokeinterface #122 <Method void IBinder.linkToDeath(android.os.IBinder$DeathRecipient, int)>
		}
	//*   6   14:iconst_1        
	//*   7   15:ireturn         
	//*   8   16:aload_0         
	//*   9   17:invokevirtual   #124 <Method void binderDied()>
	//*  10   20:iconst_0        
	//*  11   21:ireturn         
		// Misplaced declaration of an exception variable
		catch(RemoteException remoteexception)
		{
			binderDied();
			return false;
		}
		return true;
	//*  12   22:astore_1        
	//*  13   23:goto            16
	}

	public boolean releaseRouteController(int i)
	{
		MediaRouteProvider.RouteController routecontroller = (MediaRouteProvider.RouteController)mControllers.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field SparseArray mControllers>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #112 <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #85  <Class MediaRouteProvider$RouteController>
	//    5   11:astore_2        
		if(routecontroller != null)
	//*   6   12:aload_2         
	//*   7   13:ifnull          30
		{
			mControllers.remove(i);
	//    8   16:aload_0         
	//    9   17:getfield        #28  <Field SparseArray mControllers>
	//   10   20:iload_1         
	//   11   21:invokevirtual   #130 <Method void SparseArray.remove(int)>
			routecontroller.onRelease();
	//   12   24:aload_2         
	//   13   25:invokevirtual   #88  <Method void MediaRouteProvider$RouteController.onRelease()>
			return true;
	//   14   28:iconst_1        
	//   15   29:ireturn         
		} else
		{
			return false;
	//   16   30:iconst_0        
	//   17   31:ireturn         
		}
	}

	public boolean setDiscoveryRequest(MediaRouteDiscoveryRequest mediaroutediscoveryrequest)
	{
		if(!p.a(((Object) (mDiscoveryRequest)), ((Object) (mediaroutediscoveryrequest))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #132 <Field MediaRouteDiscoveryRequest mDiscoveryRequest>
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #138 <Method boolean p.a(Object, Object)>
	//*   4    8:ifne            24
		{
			mDiscoveryRequest = mediaroutediscoveryrequest;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #132 <Field MediaRouteDiscoveryRequest mDiscoveryRequest>
			return updateCompositeDiscoveryRequest();
	//    8   16:aload_0         
	//    9   17:getfield        #20  <Field MediaRouteProviderService this$0>
	//   10   20:invokevirtual   #141 <Method boolean MediaRouteProviderService.updateCompositeDiscoveryRequest()>
	//   11   23:ireturn         
		} else
		{
			return false;
	//   12   24:iconst_0        
	//   13   25:ireturn         
		}
	}

	public String toString()
	{
		return MediaRouteProviderService.getClientId(mMessenger);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Messenger mMessenger>
	//    2    4:invokestatic    #147 <Method String MediaRouteProviderService.getClientId(Messenger)>
	//    3    7:areturn         
	}

	private final SparseArray mControllers = new SparseArray();
	public MediaRouteDiscoveryRequest mDiscoveryRequest;
	public final Messenger mMessenger;
	public final int mVersion;
	final MediaRouteProviderService this$0;

	public MediaRouteProviderService$ClientRecord(Messenger messenger, int i)
	{
		this$0 = MediaRouteProviderService.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field MediaRouteProviderService this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
	//    5    9:aload_0         
	//    6   10:new             #25  <Class SparseArray>
	//    7   13:dup             
	//    8   14:invokespecial   #26  <Method void SparseArray()>
	//    9   17:putfield        #28  <Field SparseArray mControllers>
		mMessenger = messenger;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #30  <Field Messenger mMessenger>
		mVersion = i;
	//   13   25:aload_0         
	//   14   26:iload_3         
	//   15   27:putfield        #32  <Field int mVersion>
	//   16   30:return          
	}
}
