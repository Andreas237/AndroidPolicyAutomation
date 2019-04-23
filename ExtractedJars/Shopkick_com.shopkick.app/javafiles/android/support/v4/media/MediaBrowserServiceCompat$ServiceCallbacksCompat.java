// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.*;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

private static class MediaBrowserServiceCompat$ServiceCallbacksCompat
	implements MediaBrowserServiceCompat.ServiceCallbacks
{

	private void sendRequest(int i, Bundle bundle)
		throws RemoteException
	{
		Message message = Message.obtain();
	//    0    0:invokestatic    #29  <Method Message Message.obtain()>
	//    1    3:astore_3        
		message.what = i;
	//    2    4:aload_3         
	//    3    5:iload_1         
	//    4    6:putfield        #33  <Field int Message.what>
		message.arg1 = 2;
	//    5    9:aload_3         
	//    6   10:iconst_2        
	//    7   11:putfield        #36  <Field int Message.arg1>
		message.setData(bundle);
	//    8   14:aload_3         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #40  <Method void Message.setData(Bundle)>
		mCallbacks.send(message);
	//   11   19:aload_0         
	//   12   20:getfield        #18  <Field Messenger mCallbacks>
	//   13   23:aload_3         
	//   14   24:invokevirtual   #46  <Method void Messenger.send(Message)>
	//   15   27:return          
	}

	public IBinder asBinder()
	{
		return mCallbacks.getBinder();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Messenger mCallbacks>
	//    2    4:invokevirtual   #52  <Method IBinder Messenger.getBinder()>
	//    3    7:areturn         
	}

	public void onConnect(String s, android.support.v4.media.session.MediaSessionCompat.Token token, Bundle bundle)
		throws RemoteException
	{
		Bundle bundle1 = bundle;
	//    0    0:aload_3         
	//    1    1:astore          4
		if(bundle == null)
	//*   2    3:aload_3         
	//*   3    4:ifnonnull       16
			bundle1 = new Bundle();
	//    4    7:new             #56  <Class Bundle>
	//    5   10:dup             
	//    6   11:invokespecial   #57  <Method void Bundle()>
	//    7   14:astore          4
		bundle1.putInt("extra_service_version", 2);
	//    8   16:aload           4
	//    9   18:ldc1            #59  <String "extra_service_version">
	//   10   20:iconst_2        
	//   11   21:invokevirtual   #63  <Method void Bundle.putInt(String, int)>
		bundle = new Bundle();
	//   12   24:new             #56  <Class Bundle>
	//   13   27:dup             
	//   14   28:invokespecial   #57  <Method void Bundle()>
	//   15   31:astore_3        
		bundle.putString("data_media_item_id", s);
	//   16   32:aload_3         
	//   17   33:ldc1            #65  <String "data_media_item_id">
	//   18   35:aload_1         
	//   19   36:invokevirtual   #69  <Method void Bundle.putString(String, String)>
		bundle.putParcelable("data_media_session_token", ((android.os.Parcelable) (token)));
	//   20   39:aload_3         
	//   21   40:ldc1            #71  <String "data_media_session_token">
	//   22   42:aload_2         
	//   23   43:invokevirtual   #75  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		bundle.putBundle("data_root_hints", bundle1);
	//   24   46:aload_3         
	//   25   47:ldc1            #77  <String "data_root_hints">
	//   26   49:aload           4
	//   27   51:invokevirtual   #81  <Method void Bundle.putBundle(String, Bundle)>
		sendRequest(1, bundle);
	//   28   54:aload_0         
	//   29   55:iconst_1        
	//   30   56:aload_3         
	//   31   57:invokespecial   #83  <Method void sendRequest(int, Bundle)>
	//   32   60:return          
	}

	public void onConnectFailed()
		throws RemoteException
	{
		sendRequest(2, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aconst_null     
	//    3    3:invokespecial   #83  <Method void sendRequest(int, Bundle)>
	//    4    6:return          
	}

	public void onLoadChildren(String s, List list, Bundle bundle, Bundle bundle1)
		throws RemoteException
	{
		Bundle bundle2 = new Bundle();
	//    0    0:new             #56  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #57  <Method void Bundle()>
	//    3    7:astore          5
		bundle2.putString("data_media_item_id", s);
	//    4    9:aload           5
	//    5   11:ldc1            #65  <String "data_media_item_id">
	//    6   13:aload_1         
	//    7   14:invokevirtual   #69  <Method void Bundle.putString(String, String)>
		bundle2.putBundle("data_options", bundle);
	//    8   17:aload           5
	//    9   19:ldc1            #88  <String "data_options">
	//   10   21:aload_3         
	//   11   22:invokevirtual   #81  <Method void Bundle.putBundle(String, Bundle)>
		bundle2.putBundle("data_notify_children_changed_options", bundle1);
	//   12   25:aload           5
	//   13   27:ldc1            #90  <String "data_notify_children_changed_options">
	//   14   29:aload           4
	//   15   31:invokevirtual   #81  <Method void Bundle.putBundle(String, Bundle)>
		if(list != null)
	//*  16   34:aload_2         
	//*  17   35:ifnull          70
		{
			if(list instanceof ArrayList)
	//*  18   38:aload_2         
	//*  19   39:instanceof      #92  <Class ArrayList>
	//*  20   42:ifeq            53
				s = ((String) ((ArrayList)list));
	//   21   45:aload_2         
	//   22   46:checkcast       #92  <Class ArrayList>
	//   23   49:astore_1        
			else
	//*  24   50:goto            62
				s = ((String) (new ArrayList(((java.util.Collection) (list)))));
	//   25   53:new             #92  <Class ArrayList>
	//   26   56:dup             
	//   27   57:aload_2         
	//   28   58:invokespecial   #95  <Method void ArrayList(java.util.Collection)>
	//   29   61:astore_1        
			bundle2.putParcelableArrayList("data_media_item_list", ((ArrayList) (s)));
	//   30   62:aload           5
	//   31   64:ldc1            #97  <String "data_media_item_list">
	//   32   66:aload_1         
	//   33   67:invokevirtual   #101 <Method void Bundle.putParcelableArrayList(String, ArrayList)>
		}
		sendRequest(3, bundle2);
	//   34   70:aload_0         
	//   35   71:iconst_3        
	//   36   72:aload           5
	//   37   74:invokespecial   #83  <Method void sendRequest(int, Bundle)>
	//   38   77:return          
	}

	final Messenger mCallbacks;

	MediaBrowserServiceCompat$ServiceCallbacksCompat(Messenger messenger)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mCallbacks = messenger;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field Messenger mCallbacks>
	//    5    9:return          
	}
}
