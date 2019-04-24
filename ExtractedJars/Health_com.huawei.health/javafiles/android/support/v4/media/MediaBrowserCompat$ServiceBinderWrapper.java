// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.Context;
import android.os.*;
import android.support.v4.app.BundleCompat;
import android.support.v4.os.ResultReceiver;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat

static class MediaBrowserCompat$ServiceBinderWrapper
{

	private void sendRequest(int i, Bundle bundle, Messenger messenger)
		throws RemoteException
	{
		Message message = Message.obtain();
	//    0    0:invokestatic    #36  <Method Message Message.obtain()>
	//    1    3:astore          4
		message.what = i;
	//    2    5:aload           4
	//    3    7:iload_1         
	//    4    8:putfield        #40  <Field int Message.what>
		message.arg1 = 1;
	//    5   11:aload           4
	//    6   13:iconst_1        
	//    7   14:putfield        #43  <Field int Message.arg1>
		message.setData(bundle);
	//    8   17:aload           4
	//    9   19:aload_2         
	//   10   20:invokevirtual   #47  <Method void Message.setData(Bundle)>
		message.replyTo = messenger;
	//   11   23:aload           4
	//   12   25:aload_3         
	//   13   26:putfield        #50  <Field Messenger Message.replyTo>
		mMessenger.send(message);
	//   14   29:aload_0         
	//   15   30:getfield        #23  <Field Messenger mMessenger>
	//   16   33:aload           4
	//   17   35:invokevirtual   #54  <Method void Messenger.send(Message)>
	//   18   38:return          
	}

	void addSubscription(String s, IBinder ibinder, Bundle bundle, Messenger messenger)
		throws RemoteException
	{
		Bundle bundle1 = new Bundle();
	//    0    0:new             #59  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void Bundle()>
	//    3    7:astore          5
		bundle1.putString("data_media_item_id", s);
	//    4    9:aload           5
	//    5   11:ldc1            #62  <String "data_media_item_id">
	//    6   13:aload_1         
	//    7   14:invokevirtual   #66  <Method void Bundle.putString(String, String)>
		BundleCompat.putBinder(bundle1, "data_callback_token", ibinder);
	//    8   17:aload           5
	//    9   19:ldc1            #68  <String "data_callback_token">
	//   10   21:aload_2         
	//   11   22:invokestatic    #74  <Method void BundleCompat.putBinder(Bundle, String, IBinder)>
		bundle1.putBundle("data_options", bundle);
	//   12   25:aload           5
	//   13   27:ldc1            #76  <String "data_options">
	//   14   29:aload_3         
	//   15   30:invokevirtual   #80  <Method void Bundle.putBundle(String, Bundle)>
		sendRequest(3, bundle1, messenger);
	//   16   33:aload_0         
	//   17   34:iconst_3        
	//   18   35:aload           5
	//   19   37:aload           4
	//   20   39:invokespecial   #82  <Method void sendRequest(int, Bundle, Messenger)>
	//   21   42:return          
	}

	void connect(Context context, Messenger messenger)
		throws RemoteException
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #59  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void Bundle()>
	//    3    7:astore_3        
		bundle.putString("data_package_name", context.getPackageName());
	//    4    8:aload_3         
	//    5    9:ldc1            #86  <String "data_package_name">
	//    6   11:aload_1         
	//    7   12:invokevirtual   #92  <Method String Context.getPackageName()>
	//    8   15:invokevirtual   #66  <Method void Bundle.putString(String, String)>
		bundle.putBundle("data_root_hints", mRootHints);
	//    9   18:aload_3         
	//   10   19:ldc1            #94  <String "data_root_hints">
	//   11   21:aload_0         
	//   12   22:getfield        #25  <Field Bundle mRootHints>
	//   13   25:invokevirtual   #80  <Method void Bundle.putBundle(String, Bundle)>
		sendRequest(1, bundle, messenger);
	//   14   28:aload_0         
	//   15   29:iconst_1        
	//   16   30:aload_3         
	//   17   31:aload_2         
	//   18   32:invokespecial   #82  <Method void sendRequest(int, Bundle, Messenger)>
	//   19   35:return          
	}

	void disconnect(Messenger messenger)
		throws RemoteException
	{
		sendRequest(2, ((Bundle) (null)), messenger);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aconst_null     
	//    3    3:aload_1         
	//    4    4:invokespecial   #82  <Method void sendRequest(int, Bundle, Messenger)>
	//    5    7:return          
	}

	void getMediaItem(String s, ResultReceiver resultreceiver, Messenger messenger)
		throws RemoteException
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #59  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void Bundle()>
	//    3    7:astore          4
		bundle.putString("data_media_item_id", s);
	//    4    9:aload           4
	//    5   11:ldc1            #62  <String "data_media_item_id">
	//    6   13:aload_1         
	//    7   14:invokevirtual   #66  <Method void Bundle.putString(String, String)>
		bundle.putParcelable("data_result_receiver", ((android.os.Parcelable) (resultreceiver)));
	//    8   17:aload           4
	//    9   19:ldc1            #100 <String "data_result_receiver">
	//   10   21:aload_2         
	//   11   22:invokevirtual   #104 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		sendRequest(5, bundle, messenger);
	//   12   25:aload_0         
	//   13   26:iconst_5        
	//   14   27:aload           4
	//   15   29:aload_3         
	//   16   30:invokespecial   #82  <Method void sendRequest(int, Bundle, Messenger)>
	//   17   33:return          
	}

	void registerCallbackMessenger(Messenger messenger)
		throws RemoteException
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #59  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void Bundle()>
	//    3    7:astore_2        
		bundle.putBundle("data_root_hints", mRootHints);
	//    4    8:aload_2         
	//    5    9:ldc1            #94  <String "data_root_hints">
	//    6   11:aload_0         
	//    7   12:getfield        #25  <Field Bundle mRootHints>
	//    8   15:invokevirtual   #80  <Method void Bundle.putBundle(String, Bundle)>
		sendRequest(6, bundle, messenger);
	//    9   18:aload_0         
	//   10   19:bipush          6
	//   11   21:aload_2         
	//   12   22:aload_1         
	//   13   23:invokespecial   #82  <Method void sendRequest(int, Bundle, Messenger)>
	//   14   26:return          
	}

	void removeSubscription(String s, IBinder ibinder, Messenger messenger)
		throws RemoteException
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #59  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void Bundle()>
	//    3    7:astore          4
		bundle.putString("data_media_item_id", s);
	//    4    9:aload           4
	//    5   11:ldc1            #62  <String "data_media_item_id">
	//    6   13:aload_1         
	//    7   14:invokevirtual   #66  <Method void Bundle.putString(String, String)>
		BundleCompat.putBinder(bundle, "data_callback_token", ibinder);
	//    8   17:aload           4
	//    9   19:ldc1            #68  <String "data_callback_token">
	//   10   21:aload_2         
	//   11   22:invokestatic    #74  <Method void BundleCompat.putBinder(Bundle, String, IBinder)>
		sendRequest(4, bundle, messenger);
	//   12   25:aload_0         
	//   13   26:iconst_4        
	//   14   27:aload           4
	//   15   29:aload_3         
	//   16   30:invokespecial   #82  <Method void sendRequest(int, Bundle, Messenger)>
	//   17   33:return          
	}

	void search(String s, Bundle bundle, ResultReceiver resultreceiver, Messenger messenger)
		throws RemoteException
	{
		Bundle bundle1 = new Bundle();
	//    0    0:new             #59  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void Bundle()>
	//    3    7:astore          5
		bundle1.putString("data_search_query", s);
	//    4    9:aload           5
	//    5   11:ldc1            #111 <String "data_search_query">
	//    6   13:aload_1         
	//    7   14:invokevirtual   #66  <Method void Bundle.putString(String, String)>
		bundle1.putBundle("data_search_extras", bundle);
	//    8   17:aload           5
	//    9   19:ldc1            #113 <String "data_search_extras">
	//   10   21:aload_2         
	//   11   22:invokevirtual   #80  <Method void Bundle.putBundle(String, Bundle)>
		bundle1.putParcelable("data_result_receiver", ((android.os.Parcelable) (resultreceiver)));
	//   12   25:aload           5
	//   13   27:ldc1            #100 <String "data_result_receiver">
	//   14   29:aload_3         
	//   15   30:invokevirtual   #104 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
		sendRequest(8, bundle1, messenger);
	//   16   33:aload_0         
	//   17   34:bipush          8
	//   18   36:aload           5
	//   19   38:aload           4
	//   20   40:invokespecial   #82  <Method void sendRequest(int, Bundle, Messenger)>
	//   21   43:return          
	}

	void unregisterCallbackMessenger(Messenger messenger)
		throws RemoteException
	{
		sendRequest(7, ((Bundle) (null)), messenger);
	//    0    0:aload_0         
	//    1    1:bipush          7
	//    2    3:aconst_null     
	//    3    4:aload_1         
	//    4    5:invokespecial   #82  <Method void sendRequest(int, Bundle, Messenger)>
	//    5    8:return          
	}

	private Messenger mMessenger;
	private Bundle mRootHints;

	public MediaBrowserCompat$ServiceBinderWrapper(IBinder ibinder, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mMessenger = new Messenger(ibinder);
	//    2    4:aload_0         
	//    3    5:new             #18  <Class Messenger>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #21  <Method void Messenger(IBinder)>
	//    7   13:putfield        #23  <Field Messenger mMessenger>
		mRootHints = bundle;
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:putfield        #25  <Field Bundle mRootHints>
	//   11   21:return          
	}
}
