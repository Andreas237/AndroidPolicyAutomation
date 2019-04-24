// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.Intent;

// Referenced classes of package android.support.v7.media:
//			RegisteredMediaRouteProvider

private final class RegisteredMediaRouteProvider$Controller extends MediaRouteProvider.RouteController
{

	public void attachConnection(RegisteredMediaRouteProvider$Connection registeredmediarouteprovider$connection)
	{
		mConnection = registeredmediarouteprovider$connection;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field RegisteredMediaRouteProvider$Connection mConnection>
		mControllerId = registeredmediarouteprovider$connection.createRouteController(mRouteId, mRouteGroupId);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #31  <Field String mRouteId>
	//    7   11:aload_0         
	//    8   12:getfield        #33  <Field String mRouteGroupId>
	//    9   15:invokevirtual   #44  <Method int RegisteredMediaRouteProvider$Connection.createRouteController(String, String)>
	//   10   18:putfield        #46  <Field int mControllerId>
		if(mSelected)
	//*  11   21:aload_0         
	//*  12   22:getfield        #48  <Field boolean mSelected>
	//*  13   25:ifeq            84
		{
			registeredmediarouteprovider$connection.selectRoute(mControllerId);
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #46  <Field int mControllerId>
	//   17   33:invokevirtual   #52  <Method void RegisteredMediaRouteProvider$Connection.selectRoute(int)>
			if(mPendingSetVolume >= 0)
	//*  18   36:aload_0         
	//*  19   37:getfield        #29  <Field int mPendingSetVolume>
	//*  20   40:iflt            60
			{
				registeredmediarouteprovider$connection.setVolume(mControllerId, mPendingSetVolume);
	//   21   43:aload_1         
	//   22   44:aload_0         
	//   23   45:getfield        #46  <Field int mControllerId>
	//   24   48:aload_0         
	//   25   49:getfield        #29  <Field int mPendingSetVolume>
	//   26   52:invokevirtual   #56  <Method void RegisteredMediaRouteProvider$Connection.setVolume(int, int)>
				mPendingSetVolume = -1;
	//   27   55:aload_0         
	//   28   56:iconst_m1       
	//   29   57:putfield        #29  <Field int mPendingSetVolume>
			}
			if(mPendingUpdateVolumeDelta != 0)
	//*  30   60:aload_0         
	//*  31   61:getfield        #58  <Field int mPendingUpdateVolumeDelta>
	//*  32   64:ifeq            84
			{
				registeredmediarouteprovider$connection.updateVolume(mControllerId, mPendingUpdateVolumeDelta);
	//   33   67:aload_1         
	//   34   68:aload_0         
	//   35   69:getfield        #46  <Field int mControllerId>
	//   36   72:aload_0         
	//   37   73:getfield        #58  <Field int mPendingUpdateVolumeDelta>
	//   38   76:invokevirtual   #61  <Method void RegisteredMediaRouteProvider$Connection.updateVolume(int, int)>
				mPendingUpdateVolumeDelta = 0;
	//   39   79:aload_0         
	//   40   80:iconst_0        
	//   41   81:putfield        #58  <Field int mPendingUpdateVolumeDelta>
			}
		}
	//   42   84:return          
	}

	public void detachConnection()
	{
		if(mConnection != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field RegisteredMediaRouteProvider$Connection mConnection>
	//*   2    4:ifnull          28
		{
			mConnection.releaseRouteController(mControllerId);
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field RegisteredMediaRouteProvider$Connection mConnection>
	//    5   11:aload_0         
	//    6   12:getfield        #46  <Field int mControllerId>
	//    7   15:invokevirtual   #65  <Method void RegisteredMediaRouteProvider$Connection.releaseRouteController(int)>
			mConnection = null;
	//    8   18:aload_0         
	//    9   19:aconst_null     
	//   10   20:putfield        #38  <Field RegisteredMediaRouteProvider$Connection mConnection>
			mControllerId = 0;
	//   11   23:aload_0         
	//   12   24:iconst_0        
	//   13   25:putfield        #46  <Field int mControllerId>
		}
	//   14   28:return          
	}

	public boolean onControlRequest(Intent intent, MediaRouter.ControlRequestCallback controlrequestcallback)
	{
		if(mConnection != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field RegisteredMediaRouteProvider$Connection mConnection>
	//*   2    4:ifnull          21
			return mConnection.sendControlRequest(mControllerId, intent, controlrequestcallback);
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field RegisteredMediaRouteProvider$Connection mConnection>
	//    5   11:aload_0         
	//    6   12:getfield        #46  <Field int mControllerId>
	//    7   15:aload_1         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #71  <Method boolean RegisteredMediaRouteProvider$Connection.sendControlRequest(int, Intent, MediaRouter$ControlRequestCallback)>
	//   10   20:ireturn         
		else
			return false;
	//   11   21:iconst_0        
	//   12   22:ireturn         
	}

	public void onRelease()
	{
		onControllerReleased(this);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field RegisteredMediaRouteProvider this$0>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #76  <Method void RegisteredMediaRouteProvider.onControllerReleased(RegisteredMediaRouteProvider$Controller)>
	//    4    8:return          
	}

	public void onSelect()
	{
		mSelected = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #48  <Field boolean mSelected>
		if(mConnection != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #38  <Field RegisteredMediaRouteProvider$Connection mConnection>
	//*   5    9:ifnull          23
			mConnection.selectRoute(mControllerId);
	//    6   12:aload_0         
	//    7   13:getfield        #38  <Field RegisteredMediaRouteProvider$Connection mConnection>
	//    8   16:aload_0         
	//    9   17:getfield        #46  <Field int mControllerId>
	//   10   20:invokevirtual   #52  <Method void RegisteredMediaRouteProvider$Connection.selectRoute(int)>
	//   11   23:return          
	}

	public void onSetVolume(int i)
	{
		if(mConnection != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field RegisteredMediaRouteProvider$Connection mConnection>
	//*   2    4:ifnull          20
		{
			mConnection.setVolume(mControllerId, i);
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field RegisteredMediaRouteProvider$Connection mConnection>
	//    5   11:aload_0         
	//    6   12:getfield        #46  <Field int mControllerId>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #56  <Method void RegisteredMediaRouteProvider$Connection.setVolume(int, int)>
			return;
	//    9   19:return          
		} else
		{
			mPendingSetVolume = i;
	//   10   20:aload_0         
	//   11   21:iload_1         
	//   12   22:putfield        #29  <Field int mPendingSetVolume>
			mPendingUpdateVolumeDelta = 0;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #58  <Field int mPendingUpdateVolumeDelta>
			return;
	//   16   30:return          
		}
	}

	public void onUnselect()
	{
		onUnselect(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #81  <Method void onUnselect(int)>
	//    3    5:return          
	}

	public void onUnselect(int i)
	{
		mSelected = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #48  <Field boolean mSelected>
		if(mConnection != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #38  <Field RegisteredMediaRouteProvider$Connection mConnection>
	//*   5    9:ifnull          24
			mConnection.unselectRoute(mControllerId, i);
	//    6   12:aload_0         
	//    7   13:getfield        #38  <Field RegisteredMediaRouteProvider$Connection mConnection>
	//    8   16:aload_0         
	//    9   17:getfield        #46  <Field int mControllerId>
	//   10   20:iload_1         
	//   11   21:invokevirtual   #84  <Method void RegisteredMediaRouteProvider$Connection.unselectRoute(int, int)>
	//   12   24:return          
	}

	public void onUpdateVolume(int i)
	{
		if(mConnection != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field RegisteredMediaRouteProvider$Connection mConnection>
	//*   2    4:ifnull          20
		{
			mConnection.updateVolume(mControllerId, i);
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field RegisteredMediaRouteProvider$Connection mConnection>
	//    5   11:aload_0         
	//    6   12:getfield        #46  <Field int mControllerId>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #61  <Method void RegisteredMediaRouteProvider$Connection.updateVolume(int, int)>
			return;
	//    9   19:return          
		} else
		{
			mPendingUpdateVolumeDelta = mPendingUpdateVolumeDelta + i;
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:getfield        #58  <Field int mPendingUpdateVolumeDelta>
	//   13   25:iload_1         
	//   14   26:iadd            
	//   15   27:putfield        #58  <Field int mPendingUpdateVolumeDelta>
			return;
	//   16   30:return          
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
	//    2    2:putfield        #24  <Field RegisteredMediaRouteProvider this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #27  <Method void MediaRouteProvider$RouteController()>
		mPendingSetVolume = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #29  <Field int mPendingSetVolume>
		mRouteId = s;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #31  <Field String mRouteId>
		mRouteGroupId = s1;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #33  <Field String mRouteGroupId>
	//   14   24:return          
	}
}
