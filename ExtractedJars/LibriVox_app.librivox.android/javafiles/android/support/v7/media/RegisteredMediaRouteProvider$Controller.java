// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.Intent;

// Referenced classes of package android.support.v7.media:
//			RegisteredMediaRouteProvider

final class RegisteredMediaRouteProvider$Controller extends MediaRouteProvider.RouteController
{

	public void attachConnection(RegisteredMediaRouteProvider$Connection registeredmediarouteprovider$connection)
	{
		mConnection = registeredmediarouteprovider$connection;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field RegisteredMediaRouteProvider$Connection mConnection>
		mControllerId = registeredmediarouteprovider$connection.createRouteController(mRouteId, mRouteGroupId);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #28  <Field String mRouteId>
	//    7   11:aload_0         
	//    8   12:getfield        #30  <Field String mRouteGroupId>
	//    9   15:invokevirtual   #41  <Method int RegisteredMediaRouteProvider$Connection.createRouteController(String, String)>
	//   10   18:putfield        #43  <Field int mControllerId>
		if(mSelected)
	//*  11   21:aload_0         
	//*  12   22:getfield        #45  <Field boolean mSelected>
	//*  13   25:ifeq            82
		{
			registeredmediarouteprovider$connection.selectRoute(mControllerId);
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #43  <Field int mControllerId>
	//   17   33:invokevirtual   #49  <Method void RegisteredMediaRouteProvider$Connection.selectRoute(int)>
			int i = mPendingSetVolume;
	//   18   36:aload_0         
	//   19   37:getfield        #26  <Field int mPendingSetVolume>
	//   20   40:istore_2        
			if(i >= 0)
	//*  21   41:iload_2         
	//*  22   42:iflt            59
			{
				registeredmediarouteprovider$connection.setVolume(mControllerId, i);
	//   23   45:aload_1         
	//   24   46:aload_0         
	//   25   47:getfield        #43  <Field int mControllerId>
	//   26   50:iload_2         
	//   27   51:invokevirtual   #53  <Method void RegisteredMediaRouteProvider$Connection.setVolume(int, int)>
				mPendingSetVolume = -1;
	//   28   54:aload_0         
	//   29   55:iconst_m1       
	//   30   56:putfield        #26  <Field int mPendingSetVolume>
			}
			i = mPendingUpdateVolumeDelta;
	//   31   59:aload_0         
	//   32   60:getfield        #55  <Field int mPendingUpdateVolumeDelta>
	//   33   63:istore_2        
			if(i != 0)
	//*  34   64:iload_2         
	//*  35   65:ifeq            82
			{
				registeredmediarouteprovider$connection.updateVolume(mControllerId, i);
	//   36   68:aload_1         
	//   37   69:aload_0         
	//   38   70:getfield        #43  <Field int mControllerId>
	//   39   73:iload_2         
	//   40   74:invokevirtual   #58  <Method void RegisteredMediaRouteProvider$Connection.updateVolume(int, int)>
				mPendingUpdateVolumeDelta = 0;
	//   41   77:aload_0         
	//   42   78:iconst_0        
	//   43   79:putfield        #55  <Field int mPendingUpdateVolumeDelta>
			}
		}
	//   44   82:return          
	}

	public void detachConnection()
	{
		RegisteredMediaRouteProvider$Connection registeredmediarouteprovider$connection = mConnection;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field RegisteredMediaRouteProvider$Connection mConnection>
	//    2    4:astore_1        
		if(registeredmediarouteprovider$connection != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          27
		{
			registeredmediarouteprovider$connection.releaseRouteController(mControllerId);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #43  <Field int mControllerId>
	//    8   14:invokevirtual   #62  <Method void RegisteredMediaRouteProvider$Connection.releaseRouteController(int)>
			mConnection = null;
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:putfield        #35  <Field RegisteredMediaRouteProvider$Connection mConnection>
			mControllerId = 0;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #43  <Field int mControllerId>
		}
	//   15   27:return          
	}

	public boolean onControlRequest(Intent intent, MediaRouter.ControlRequestCallback controlrequestcallback)
	{
		RegisteredMediaRouteProvider$Connection registeredmediarouteprovider$connection = mConnection;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field RegisteredMediaRouteProvider$Connection mConnection>
	//    2    4:astore_3        
		if(registeredmediarouteprovider$connection != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          20
			return registeredmediarouteprovider$connection.sendControlRequest(mControllerId, intent, controlrequestcallback);
	//    5    9:aload_3         
	//    6   10:aload_0         
	//    7   11:getfield        #43  <Field int mControllerId>
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #68  <Method boolean RegisteredMediaRouteProvider$Connection.sendControlRequest(int, Intent, MediaRouter$ControlRequestCallback)>
	//   11   19:ireturn         
		else
			return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         
	}

	public void onRelease()
	{
		onControllerReleased(this);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field RegisteredMediaRouteProvider this$0>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #75  <Method void RegisteredMediaRouteProvider.onControllerReleased(RegisteredMediaRouteProvider$Controller)>
	//    4    8:return          
	}

	public void onSelect()
	{
		mSelected = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #45  <Field boolean mSelected>
		RegisteredMediaRouteProvider$Connection registeredmediarouteprovider$connection = mConnection;
	//    3    5:aload_0         
	//    4    6:getfield        #35  <Field RegisteredMediaRouteProvider$Connection mConnection>
	//    5    9:astore_1        
		if(registeredmediarouteprovider$connection != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          22
			registeredmediarouteprovider$connection.selectRoute(mControllerId);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #43  <Field int mControllerId>
	//   11   19:invokevirtual   #49  <Method void RegisteredMediaRouteProvider$Connection.selectRoute(int)>
	//   12   22:return          
	}

	public void onSetVolume(int i)
	{
		RegisteredMediaRouteProvider$Connection registeredmediarouteprovider$connection = mConnection;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field RegisteredMediaRouteProvider$Connection mConnection>
	//    2    4:astore_2        
		if(registeredmediarouteprovider$connection != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          19
		{
			registeredmediarouteprovider$connection.setVolume(mControllerId, i);
	//    5    9:aload_2         
	//    6   10:aload_0         
	//    7   11:getfield        #43  <Field int mControllerId>
	//    8   14:iload_1         
	//    9   15:invokevirtual   #53  <Method void RegisteredMediaRouteProvider$Connection.setVolume(int, int)>
			return;
	//   10   18:return          
		} else
		{
			mPendingSetVolume = i;
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:putfield        #26  <Field int mPendingSetVolume>
			mPendingUpdateVolumeDelta = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #55  <Field int mPendingUpdateVolumeDelta>
			return;
	//   17   29:return          
		}
	}

	public void onUnselect()
	{
		onUnselect(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #80  <Method void onUnselect(int)>
	//    3    5:return          
	}

	public void onUnselect(int i)
	{
		mSelected = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #45  <Field boolean mSelected>
		RegisteredMediaRouteProvider$Connection registeredmediarouteprovider$connection = mConnection;
	//    3    5:aload_0         
	//    4    6:getfield        #35  <Field RegisteredMediaRouteProvider$Connection mConnection>
	//    5    9:astore_2        
		if(registeredmediarouteprovider$connection != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          23
			registeredmediarouteprovider$connection.unselectRoute(mControllerId, i);
	//    8   14:aload_2         
	//    9   15:aload_0         
	//   10   16:getfield        #43  <Field int mControllerId>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #83  <Method void RegisteredMediaRouteProvider$Connection.unselectRoute(int, int)>
	//   13   23:return          
	}

	public void onUpdateVolume(int i)
	{
		RegisteredMediaRouteProvider$Connection registeredmediarouteprovider$connection = mConnection;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field RegisteredMediaRouteProvider$Connection mConnection>
	//    2    4:astore_2        
		if(registeredmediarouteprovider$connection != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          19
		{
			registeredmediarouteprovider$connection.updateVolume(mControllerId, i);
	//    5    9:aload_2         
	//    6   10:aload_0         
	//    7   11:getfield        #43  <Field int mControllerId>
	//    8   14:iload_1         
	//    9   15:invokevirtual   #58  <Method void RegisteredMediaRouteProvider$Connection.updateVolume(int, int)>
			return;
	//   10   18:return          
		} else
		{
			mPendingUpdateVolumeDelta = mPendingUpdateVolumeDelta + i;
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:getfield        #55  <Field int mPendingUpdateVolumeDelta>
	//   14   24:iload_1         
	//   15   25:iadd            
	//   16   26:putfield        #55  <Field int mPendingUpdateVolumeDelta>
			return;
	//   17   29:return          
		}
	}

	private RegisteredMediaRouteProvider$Connection mConnection;
	private int mControllerId;
	private int mPendingSetVolume;
	private int mPendingUpdateVolumeDelta;
	private final String mRouteGroupId;
	private final String mRouteId;
	private boolean mSelected;
	final RegisteredMediaRouteProvider this$0;

	public RegisteredMediaRouteProvider$Controller(String s, String s1)
	{
		this$0 = RegisteredMediaRouteProvider.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field RegisteredMediaRouteProvider this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void MediaRouteProvider$RouteController()>
		mPendingSetVolume = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #26  <Field int mPendingSetVolume>
		mRouteId = s;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #28  <Field String mRouteId>
		mRouteGroupId = s1;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #30  <Field String mRouteGroupId>
	//   14   24:return          
	}
}
