// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.os.Messenger;

abstract class MediaRouteProviderProtocol
{

	MediaRouteProviderProtocol()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #61  <Method void Object()>
	//    2    4:return          
	}

	public static boolean isValidRemoteMessenger(Messenger messenger)
	{
		if(messenger != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          15
		{
			try
			{
				messenger = ((Messenger) (messenger.getBinder()));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #72  <Method android.os.IBinder Messenger.getBinder()>
	//    4    8:astore_0        
			}
	//*   5    9:aload_0         
	//*   6   10:ifnull          15
	//*   7   13:iconst_1        
	//*   8   14:ireturn         
	//*   9   15:iconst_0        
	//*  10   16:ireturn         
			// Misplaced declaration of an exception variable
			catch(Messenger messenger)
	//*  11   17:astore_0        
			{
				return false;
	//   12   18:iconst_0        
	//   13   19:ireturn         
			}
			if(messenger != null)
				return true;
		}
		return false;
	}

	public static final String CLIENT_DATA_ROUTE_ID = "routeId";
	public static final String CLIENT_DATA_ROUTE_LIBRARY_GROUP = "routeGroupId";
	public static final String CLIENT_DATA_UNSELECT_REASON = "unselectReason";
	public static final String CLIENT_DATA_VOLUME = "volume";
	public static final int CLIENT_MSG_CREATE_ROUTE_CONTROLLER = 3;
	public static final int CLIENT_MSG_REGISTER = 1;
	public static final int CLIENT_MSG_RELEASE_ROUTE_CONTROLLER = 4;
	public static final int CLIENT_MSG_ROUTE_CONTROL_REQUEST = 9;
	public static final int CLIENT_MSG_SELECT_ROUTE = 5;
	public static final int CLIENT_MSG_SET_DISCOVERY_REQUEST = 10;
	public static final int CLIENT_MSG_SET_ROUTE_VOLUME = 7;
	public static final int CLIENT_MSG_UNREGISTER = 2;
	public static final int CLIENT_MSG_UNSELECT_ROUTE = 6;
	public static final int CLIENT_MSG_UPDATE_ROUTE_VOLUME = 8;
	public static final int CLIENT_VERSION_1 = 1;
	public static final int CLIENT_VERSION_2 = 2;
	public static final int CLIENT_VERSION_CURRENT = 2;
	static final int CLIENT_VERSION_START = 1;
	public static final String SERVICE_DATA_ERROR = "error";
	public static final String SERVICE_INTERFACE = "android.media.MediaRouteProviderService";
	public static final int SERVICE_MSG_CONTROL_REQUEST_FAILED = 4;
	public static final int SERVICE_MSG_CONTROL_REQUEST_SUCCEEDED = 3;
	public static final int SERVICE_MSG_DESCRIPTOR_CHANGED = 5;
	public static final int SERVICE_MSG_GENERIC_FAILURE = 0;
	public static final int SERVICE_MSG_GENERIC_SUCCESS = 1;
	public static final int SERVICE_MSG_REGISTERED = 2;
	public static final int SERVICE_VERSION_1 = 1;
	public static final int SERVICE_VERSION_CURRENT = 1;
}
