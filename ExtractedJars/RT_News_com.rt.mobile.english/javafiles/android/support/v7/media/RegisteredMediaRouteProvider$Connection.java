// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.Intent;
import android.os.*;
import android.util.Log;
import android.util.SparseArray;

// Referenced classes of package android.support.v7.media:
//			RegisteredMediaRouteProvider, MediaRouteProviderDescriptor, MediaRouteDiscoveryRequest

private final class RegisteredMediaRouteProvider$Connection
	implements android.os.IBinder.DeathRecipient
{

	private boolean sendRequest(int i, int j, int k, Object obj, Bundle bundle)
	{
		Message message;
		message = Message.obtain();
	//    0    0:invokestatic    #73  <Method Message Message.obtain()>
	//    1    3:astore          6
		message.what = i;
	//    2    5:aload           6
	//    3    7:iload_1         
	//    4    8:putfield        #76  <Field int Message.what>
		message.arg1 = j;
	//    5   11:aload           6
	//    6   13:iload_2         
	//    7   14:putfield        #79  <Field int Message.arg1>
		message.arg2 = k;
	//    8   17:aload           6
	//    9   19:iload_3         
	//   10   20:putfield        #82  <Field int Message.arg2>
		message.obj = obj;
	//   11   23:aload           6
	//   12   25:aload           4
	//   13   27:putfield        #86  <Field Object Message.obj>
		message.setData(bundle);
	//   14   30:aload           6
	//   15   32:aload           5
	//   16   34:invokevirtual   #90  <Method void Message.setData(Bundle)>
		message.replyTo = mReceiveMessenger;
	//   17   37:aload           6
	//   18   39:aload_0         
	//   19   40:getfield        #60  <Field Messenger mReceiveMessenger>
	//   20   43:putfield        #93  <Field Messenger Message.replyTo>
		mServiceMessenger.send(message);
	//   21   46:aload_0         
	//   22   47:getfield        #46  <Field Messenger mServiceMessenger>
	//   23   50:aload           6
	//   24   52:invokevirtual   #97  <Method void Messenger.send(Message)>
		return true;
	//   25   55:iconst_1        
	//   26   56:ireturn         
		obj;
	//   27   57:astore          4
		if(i != 2)
	//*  28   59:iload_1         
	//*  29   60:iconst_2        
	//*  30   61:icmpeq          74
			Log.e("MediaRouteProviderProxy", "Could not send message to service.", ((Throwable) (obj)));
	//   31   64:ldc1            #99  <String "MediaRouteProviderProxy">
	//   32   66:ldc1            #101 <String "Could not send message to service.">
	//   33   68:aload           4
	//   34   70:invokestatic    #107 <Method int Log.e(String, String, Throwable)>
	//   35   73:pop             
_L2:
		return false;
	//   36   74:iconst_0        
	//   37   75:ireturn         
		obj;
	//   38   76:astore          4
		if(true) goto _L2; else goto _L1
	//   39   78:goto            74
_L1:
	}

	public void binderDied()
	{
		mPrivateHandler.post(new Runnable() {

			public void run()
			{
				onConnectionDied(RegisteredMediaRouteProvider.Connection.this);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field RegisteredMediaRouteProvider$Connection this$1>
			//    2    4:getfield        #28  <Field RegisteredMediaRouteProvider RegisteredMediaRouteProvider$Connection.this$0>
			//    3    7:aload_0         
			//    4    8:getfield        #20  <Field RegisteredMediaRouteProvider$Connection this$1>
			//    5   11:invokevirtual   #31  <Method void RegisteredMediaRouteProvider.onConnectionDied(RegisteredMediaRouteProvider$Connection)>
			//    6   14:return          
			}

			final RegisteredMediaRouteProvider.Connection this$1;

			
			{
				this$1 = RegisteredMediaRouteProvider.Connection.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field RegisteredMediaRouteProvider$Connection this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field RegisteredMediaRouteProvider this$0>
	//    2    4:getfield        #112 <Field RegisteredMediaRouteProvider$PrivateHandler RegisteredMediaRouteProvider.mPrivateHandler>
	//    3    7:new             #13  <Class RegisteredMediaRouteProvider$Connection$2>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #113 <Method void RegisteredMediaRouteProvider$Connection$2(RegisteredMediaRouteProvider$Connection)>
	//    7   15:invokevirtual   #119 <Method boolean RegisteredMediaRouteProvider$PrivateHandler.post(Runnable)>
	//    8   18:pop             
	//    9   19:return          
	}

	public int createRouteController(String s, String s1)
	{
		int i = mNextControllerId;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int mNextControllerId>
	//    2    4:istore_3        
		mNextControllerId = i + 1;
	//    3    5:aload_0         
	//    4    6:iload_3         
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:putfield        #39  <Field int mNextControllerId>
		Bundle bundle = new Bundle();
	//    8   12:new             #123 <Class Bundle>
	//    9   15:dup             
	//   10   16:invokespecial   #124 <Method void Bundle()>
	//   11   19:astore          5
		bundle.putString("routeId", s);
	//   12   21:aload           5
	//   13   23:ldc1            #126 <String "routeId">
	//   14   25:aload_1         
	//   15   26:invokevirtual   #130 <Method void Bundle.putString(String, String)>
		bundle.putString("routeGroupId", s1);
	//   16   29:aload           5
	//   17   31:ldc1            #132 <String "routeGroupId">
	//   18   33:aload_2         
	//   19   34:invokevirtual   #130 <Method void Bundle.putString(String, String)>
		int j = mNextRequestId;
	//   20   37:aload_0         
	//   21   38:getfield        #37  <Field int mNextRequestId>
	//   22   41:istore          4
		mNextRequestId = j + 1;
	//   23   43:aload_0         
	//   24   44:iload           4
	//   25   46:iconst_1        
	//   26   47:iadd            
	//   27   48:putfield        #37  <Field int mNextRequestId>
		sendRequest(3, j, i, ((Object) (null)), bundle);
	//   28   51:aload_0         
	//   29   52:iconst_3        
	//   30   53:iload           4
	//   31   55:iload_3         
	//   32   56:aconst_null     
	//   33   57:aload           5
	//   34   59:invokespecial   #134 <Method boolean sendRequest(int, int, int, Object, Bundle)>
	//   35   62:pop             
		return i;
	//   36   63:iload_3         
	//   37   64:ireturn         
	}

	public void dispose()
	{
		sendRequest(2, 0, 0, ((Object) (null)), ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:iconst_0        
	//    3    3:iconst_0        
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:invokespecial   #134 <Method boolean sendRequest(int, int, int, Object, Bundle)>
	//    7    9:pop             
		mReceiveHandler.dispose();
	//    8   10:aload_0         
	//    9   11:getfield        #53  <Field RegisteredMediaRouteProvider$ReceiveHandler mReceiveHandler>
	//   10   14:invokevirtual   #137 <Method void RegisteredMediaRouteProvider$ReceiveHandler.dispose()>
		mServiceMessenger.getBinder().unlinkToDeath(((android.os.IBinder.DeathRecipient) (this)), 0);
	//   11   17:aload_0         
	//   12   18:getfield        #46  <Field Messenger mServiceMessenger>
	//   13   21:invokevirtual   #141 <Method IBinder Messenger.getBinder()>
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:invokeinterface #147 <Method boolean IBinder.unlinkToDeath(android.os.IBinder$DeathRecipient, int)>
	//   17   31:pop             
		mPrivateHandler.post(new Runnable() {

			public void run()
			{
				failPendingCallbacks();
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field RegisteredMediaRouteProvider$Connection this$1>
			//    2    4:invokevirtual   #27  <Method void RegisteredMediaRouteProvider$Connection.failPendingCallbacks()>
			//    3    7:return          
			}

			final RegisteredMediaRouteProvider.Connection this$1;

			
			{
				this$1 = RegisteredMediaRouteProvider.Connection.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field RegisteredMediaRouteProvider$Connection this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   18   32:aload_0         
	//   19   33:getfield        #32  <Field RegisteredMediaRouteProvider this$0>
	//   20   36:getfield        #112 <Field RegisteredMediaRouteProvider$PrivateHandler RegisteredMediaRouteProvider.mPrivateHandler>
	//   21   39:new             #11  <Class RegisteredMediaRouteProvider$Connection$1>
	//   22   42:dup             
	//   23   43:aload_0         
	//   24   44:invokespecial   #148 <Method void RegisteredMediaRouteProvider$Connection$1(RegisteredMediaRouteProvider$Connection)>
	//   25   47:invokevirtual   #119 <Method boolean RegisteredMediaRouteProvider$PrivateHandler.post(Runnable)>
	//   26   50:pop             
	//   27   51:return          
	}

	void failPendingCallbacks()
	{
		for(int i = 0; i < mPendingCallbacks.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #44  <Field SparseArray mPendingCallbacks>
	//*   5    7:invokevirtual   #153 <Method int SparseArray.size()>
	//*   6   10:icmpge          36
			((MediaRouter.ControlRequestCallback)mPendingCallbacks.valueAt(i)).onError(((String) (null)), ((Bundle) (null)));
	//    7   13:aload_0         
	//    8   14:getfield        #44  <Field SparseArray mPendingCallbacks>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #157 <Method Object SparseArray.valueAt(int)>
	//   11   21:checkcast       #159 <Class MediaRouter$ControlRequestCallback>
	//   12   24:aconst_null     
	//   13   25:aconst_null     
	//   14   26:invokevirtual   #163 <Method void MediaRouter$ControlRequestCallback.onError(String, Bundle)>

	//   15   29:iload_1         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_1        
	//*  19   33:goto            2
		mPendingCallbacks.clear();
	//   20   36:aload_0         
	//   21   37:getfield        #44  <Field SparseArray mPendingCallbacks>
	//   22   40:invokevirtual   #166 <Method void SparseArray.clear()>
	//   23   43:return          
	}

	public boolean onControlRequestFailed(int i, String s, Bundle bundle)
	{
		MediaRouter.ControlRequestCallback controlrequestcallback = (MediaRouter.ControlRequestCallback)mPendingCallbacks.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field SparseArray mPendingCallbacks>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #171 <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #159 <Class MediaRouter$ControlRequestCallback>
	//    5   11:astore          4
		if(controlrequestcallback != null)
	//*   6   13:aload           4
	//*   7   15:ifnull          35
		{
			mPendingCallbacks.remove(i);
	//    8   18:aload_0         
	//    9   19:getfield        #44  <Field SparseArray mPendingCallbacks>
	//   10   22:iload_1         
	//   11   23:invokevirtual   #175 <Method void SparseArray.remove(int)>
			controlrequestcallback.onError(s, bundle);
	//   12   26:aload           4
	//   13   28:aload_2         
	//   14   29:aload_3         
	//   15   30:invokevirtual   #163 <Method void MediaRouter$ControlRequestCallback.onError(String, Bundle)>
			return true;
	//   16   33:iconst_1        
	//   17   34:ireturn         
		} else
		{
			return false;
	//   18   35:iconst_0        
	//   19   36:ireturn         
		}
	}

	public boolean onControlRequestSucceeded(int i, Bundle bundle)
	{
		MediaRouter.ControlRequestCallback controlrequestcallback = (MediaRouter.ControlRequestCallback)mPendingCallbacks.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field SparseArray mPendingCallbacks>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #171 <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #159 <Class MediaRouter$ControlRequestCallback>
	//    5   11:astore_3        
		if(controlrequestcallback != null)
	//*   6   12:aload_3         
	//*   7   13:ifnull          31
		{
			mPendingCallbacks.remove(i);
	//    8   16:aload_0         
	//    9   17:getfield        #44  <Field SparseArray mPendingCallbacks>
	//   10   20:iload_1         
	//   11   21:invokevirtual   #175 <Method void SparseArray.remove(int)>
			controlrequestcallback.onResult(bundle);
	//   12   24:aload_3         
	//   13   25:aload_2         
	//   14   26:invokevirtual   #180 <Method void MediaRouter$ControlRequestCallback.onResult(Bundle)>
			return true;
	//   15   29:iconst_1        
	//   16   30:ireturn         
		} else
		{
			return false;
	//   17   31:iconst_0        
	//   18   32:ireturn         
		}
	}

	public boolean onDescriptorChanged(Bundle bundle)
	{
		if(mServiceVersion != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #184 <Field int mServiceVersion>
	//*   2    4:ifeq            21
		{
			onConnectionDescriptorChanged(this, MediaRouteProviderDescriptor.fromBundle(bundle));
	//    3    7:aload_0         
	//    4    8:getfield        #32  <Field RegisteredMediaRouteProvider this$0>
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokestatic    #190 <Method MediaRouteProviderDescriptor MediaRouteProviderDescriptor.fromBundle(Bundle)>
	//    8   16:invokevirtual   #194 <Method void RegisteredMediaRouteProvider.onConnectionDescriptorChanged(RegisteredMediaRouteProvider$Connection, MediaRouteProviderDescriptor)>
			return true;
	//    9   19:iconst_1        
	//   10   20:ireturn         
		} else
		{
			return false;
	//   11   21:iconst_0        
	//   12   22:ireturn         
		}
	}

	public boolean onGenericFailure(int i)
	{
		if(i == mPendingRegisterRequestId)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #198 <Field int mPendingRegisterRequestId>
	//*   3    5:icmpne          23
		{
			mPendingRegisterRequestId = 0;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #198 <Field int mPendingRegisterRequestId>
			onConnectionError(this, "Registration failed");
	//    7   13:aload_0         
	//    8   14:getfield        #32  <Field RegisteredMediaRouteProvider this$0>
	//    9   17:aload_0         
	//   10   18:ldc1            #200 <String "Registration failed">
	//   11   20:invokevirtual   #204 <Method void RegisteredMediaRouteProvider.onConnectionError(RegisteredMediaRouteProvider$Connection, String)>
		}
		MediaRouter.ControlRequestCallback controlrequestcallback = (MediaRouter.ControlRequestCallback)mPendingCallbacks.get(i);
	//   12   23:aload_0         
	//   13   24:getfield        #44  <Field SparseArray mPendingCallbacks>
	//   14   27:iload_1         
	//   15   28:invokevirtual   #171 <Method Object SparseArray.get(int)>
	//   16   31:checkcast       #159 <Class MediaRouter$ControlRequestCallback>
	//   17   34:astore_2        
		if(controlrequestcallback != null)
	//*  18   35:aload_2         
	//*  19   36:ifnull          53
		{
			mPendingCallbacks.remove(i);
	//   20   39:aload_0         
	//   21   40:getfield        #44  <Field SparseArray mPendingCallbacks>
	//   22   43:iload_1         
	//   23   44:invokevirtual   #175 <Method void SparseArray.remove(int)>
			controlrequestcallback.onError(((String) (null)), ((Bundle) (null)));
	//   24   47:aload_2         
	//   25   48:aconst_null     
	//   26   49:aconst_null     
	//   27   50:invokevirtual   #163 <Method void MediaRouter$ControlRequestCallback.onError(String, Bundle)>
		}
		return true;
	//   28   53:iconst_1        
	//   29   54:ireturn         
	}

	public boolean onGenericSuccess(int i)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean onRegistered(int i, int j, Bundle bundle)
	{
		if(mServiceVersion == 0 && i == mPendingRegisterRequestId && j >= 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #184 <Field int mServiceVersion>
	//*   2    4:ifne            52
	//*   3    7:iload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #198 <Field int mPendingRegisterRequestId>
	//*   6   12:icmpne          52
	//*   7   15:iload_2         
	//*   8   16:iconst_1        
	//*   9   17:icmplt          52
		{
			mPendingRegisterRequestId = 0;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #198 <Field int mPendingRegisterRequestId>
			mServiceVersion = j;
	//   13   25:aload_0         
	//   14   26:iload_2         
	//   15   27:putfield        #184 <Field int mServiceVersion>
			onConnectionDescriptorChanged(this, MediaRouteProviderDescriptor.fromBundle(bundle));
	//   16   30:aload_0         
	//   17   31:getfield        #32  <Field RegisteredMediaRouteProvider this$0>
	//   18   34:aload_0         
	//   19   35:aload_3         
	//   20   36:invokestatic    #190 <Method MediaRouteProviderDescriptor MediaRouteProviderDescriptor.fromBundle(Bundle)>
	//   21   39:invokevirtual   #194 <Method void RegisteredMediaRouteProvider.onConnectionDescriptorChanged(RegisteredMediaRouteProvider$Connection, MediaRouteProviderDescriptor)>
			onConnectionReady(this);
	//   22   42:aload_0         
	//   23   43:getfield        #32  <Field RegisteredMediaRouteProvider this$0>
	//   24   46:aload_0         
	//   25   47:invokevirtual   #210 <Method void RegisteredMediaRouteProvider.onConnectionReady(RegisteredMediaRouteProvider$Connection)>
			return true;
	//   26   50:iconst_1        
	//   27   51:ireturn         
		} else
		{
			return false;
	//   28   52:iconst_0        
	//   29   53:ireturn         
		}
	}

	public boolean register()
	{
		RemoteException remoteexception;
		int i = mNextRequestId;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int mNextRequestId>
	//    2    4:istore_1        
		mNextRequestId = i + 1;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:putfield        #37  <Field int mNextRequestId>
		mPendingRegisterRequestId = i;
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:putfield        #198 <Field int mPendingRegisterRequestId>
		if(!sendRequest(1, mPendingRegisterRequestId, 2, ((Object) (null)), ((Bundle) (null))))
	//*  11   17:aload_0         
	//*  12   18:iconst_1        
	//*  13   19:aload_0         
	//*  14   20:getfield        #198 <Field int mPendingRegisterRequestId>
	//*  15   23:iconst_2        
	//*  16   24:aconst_null     
	//*  17   25:aconst_null     
	//*  18   26:invokespecial   #134 <Method boolean sendRequest(int, int, int, Object, Bundle)>
	//*  19   29:ifne            34
			return false;
	//   20   32:iconst_0        
	//   21   33:ireturn         
		try
		{
			mServiceMessenger.getBinder().linkToDeath(((android.os.IBinder.DeathRecipient) (this)), 0);
	//   22   34:aload_0         
	//   23   35:getfield        #46  <Field Messenger mServiceMessenger>
	//   24   38:invokevirtual   #141 <Method IBinder Messenger.getBinder()>
	//   25   41:aload_0         
	//   26   42:iconst_0        
	//   27   43:invokeinterface #216 <Method void IBinder.linkToDeath(android.os.IBinder$DeathRecipient, int)>
		}
	//*  28   48:iconst_1        
	//*  29   49:ireturn         
	//*  30   50:aload_0         
	//*  31   51:invokevirtual   #218 <Method void binderDied()>
	//*  32   54:iconst_0        
	//*  33   55:ireturn         
		// Misplaced declaration of an exception variable
		catch(RemoteException remoteexception)
		{
			binderDied();
			return false;
		}
		return true;
	//*  34   56:astore_2        
	//*  35   57:goto            50
	}

	public void releaseRouteController(int i)
	{
		int j = mNextRequestId;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int mNextRequestId>
	//    2    4:istore_2        
		mNextRequestId = j + 1;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:putfield        #37  <Field int mNextRequestId>
		sendRequest(4, j, i, ((Object) (null)), ((Bundle) (null)));
	//    8   12:aload_0         
	//    9   13:iconst_4        
	//   10   14:iload_2         
	//   11   15:iload_1         
	//   12   16:aconst_null     
	//   13   17:aconst_null     
	//   14   18:invokespecial   #134 <Method boolean sendRequest(int, int, int, Object, Bundle)>
	//   15   21:pop             
	//   16   22:return          
	}

	public void selectRoute(int i)
	{
		int j = mNextRequestId;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int mNextRequestId>
	//    2    4:istore_2        
		mNextRequestId = j + 1;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:putfield        #37  <Field int mNextRequestId>
		sendRequest(5, j, i, ((Object) (null)), ((Bundle) (null)));
	//    8   12:aload_0         
	//    9   13:iconst_5        
	//   10   14:iload_2         
	//   11   15:iload_1         
	//   12   16:aconst_null     
	//   13   17:aconst_null     
	//   14   18:invokespecial   #134 <Method boolean sendRequest(int, int, int, Object, Bundle)>
	//   15   21:pop             
	//   16   22:return          
	}

	public boolean sendControlRequest(int i, Intent intent, MediaRouter.ControlRequestCallback controlrequestcallback)
	{
		int j = mNextRequestId;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int mNextRequestId>
	//    2    4:istore          4
		mNextRequestId = j + 1;
	//    3    6:aload_0         
	//    4    7:iload           4
	//    5    9:iconst_1        
	//    6   10:iadd            
	//    7   11:putfield        #37  <Field int mNextRequestId>
		if(sendRequest(9, j, i, ((Object) (intent)), ((Bundle) (null))))
	//*   8   14:aload_0         
	//*   9   15:bipush          9
	//*  10   17:iload           4
	//*  11   19:iload_1         
	//*  12   20:aload_2         
	//*  13   21:aconst_null     
	//*  14   22:invokespecial   #134 <Method boolean sendRequest(int, int, int, Object, Bundle)>
	//*  15   25:ifeq            44
		{
			if(controlrequestcallback != null)
	//*  16   28:aload_3         
	//*  17   29:ifnull          42
				mPendingCallbacks.put(j, ((Object) (controlrequestcallback)));
	//   18   32:aload_0         
	//   19   33:getfield        #44  <Field SparseArray mPendingCallbacks>
	//   20   36:iload           4
	//   21   38:aload_3         
	//   22   39:invokevirtual   #226 <Method void SparseArray.put(int, Object)>
			return true;
	//   23   42:iconst_1        
	//   24   43:ireturn         
		} else
		{
			return false;
	//   25   44:iconst_0        
	//   26   45:ireturn         
		}
	}

	public void setDiscoveryRequest(MediaRouteDiscoveryRequest mediaroutediscoveryrequest)
	{
		int i = mNextRequestId;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int mNextRequestId>
	//    2    4:istore_2        
		mNextRequestId = i + 1;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:putfield        #37  <Field int mNextRequestId>
		if(mediaroutediscoveryrequest != null)
	//*   8   12:aload_1         
	//*   9   13:ifnull          24
			mediaroutediscoveryrequest = ((MediaRouteDiscoveryRequest) (mediaroutediscoveryrequest.asBundle()));
	//   10   16:aload_1         
	//   11   17:invokevirtual   #234 <Method Bundle MediaRouteDiscoveryRequest.asBundle()>
	//   12   20:astore_1        
		else
	//*  13   21:goto            29
			mediaroutediscoveryrequest = null;
	//   14   24:aconst_null     
	//   15   25:astore_1        
	//*  16   26:goto            21
		sendRequest(10, i, 0, ((Object) (mediaroutediscoveryrequest)), ((Bundle) (null)));
	//   17   29:aload_0         
	//   18   30:bipush          10
	//   19   32:iload_2         
	//   20   33:iconst_0        
	//   21   34:aload_1         
	//   22   35:aconst_null     
	//   23   36:invokespecial   #134 <Method boolean sendRequest(int, int, int, Object, Bundle)>
	//   24   39:pop             
	//   25   40:return          
	}

	public void setVolume(int i, int j)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #123 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #124 <Method void Bundle()>
	//    3    7:astore_3        
		bundle.putInt("volume", j);
	//    4    8:aload_3         
	//    5    9:ldc1            #238 <String "volume">
	//    6   11:iload_2         
	//    7   12:invokevirtual   #242 <Method void Bundle.putInt(String, int)>
		j = mNextRequestId;
	//    8   15:aload_0         
	//    9   16:getfield        #37  <Field int mNextRequestId>
	//   10   19:istore_2        
		mNextRequestId = j + 1;
	//   11   20:aload_0         
	//   12   21:iload_2         
	//   13   22:iconst_1        
	//   14   23:iadd            
	//   15   24:putfield        #37  <Field int mNextRequestId>
		sendRequest(7, j, i, ((Object) (null)), bundle);
	//   16   27:aload_0         
	//   17   28:bipush          7
	//   18   30:iload_2         
	//   19   31:iload_1         
	//   20   32:aconst_null     
	//   21   33:aload_3         
	//   22   34:invokespecial   #134 <Method boolean sendRequest(int, int, int, Object, Bundle)>
	//   23   37:pop             
	//   24   38:return          
	}

	public void unselectRoute(int i, int j)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #123 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #124 <Method void Bundle()>
	//    3    7:astore_3        
		bundle.putInt("unselectReason", j);
	//    4    8:aload_3         
	//    5    9:ldc1            #245 <String "unselectReason">
	//    6   11:iload_2         
	//    7   12:invokevirtual   #242 <Method void Bundle.putInt(String, int)>
		j = mNextRequestId;
	//    8   15:aload_0         
	//    9   16:getfield        #37  <Field int mNextRequestId>
	//   10   19:istore_2        
		mNextRequestId = j + 1;
	//   11   20:aload_0         
	//   12   21:iload_2         
	//   13   22:iconst_1        
	//   14   23:iadd            
	//   15   24:putfield        #37  <Field int mNextRequestId>
		sendRequest(6, j, i, ((Object) (null)), bundle);
	//   16   27:aload_0         
	//   17   28:bipush          6
	//   18   30:iload_2         
	//   19   31:iload_1         
	//   20   32:aconst_null     
	//   21   33:aload_3         
	//   22   34:invokespecial   #134 <Method boolean sendRequest(int, int, int, Object, Bundle)>
	//   23   37:pop             
	//   24   38:return          
	}

	public void updateVolume(int i, int j)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #123 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #124 <Method void Bundle()>
	//    3    7:astore_3        
		bundle.putInt("volume", j);
	//    4    8:aload_3         
	//    5    9:ldc1            #238 <String "volume">
	//    6   11:iload_2         
	//    7   12:invokevirtual   #242 <Method void Bundle.putInt(String, int)>
		j = mNextRequestId;
	//    8   15:aload_0         
	//    9   16:getfield        #37  <Field int mNextRequestId>
	//   10   19:istore_2        
		mNextRequestId = j + 1;
	//   11   20:aload_0         
	//   12   21:iload_2         
	//   13   22:iconst_1        
	//   14   23:iadd            
	//   15   24:putfield        #37  <Field int mNextRequestId>
		sendRequest(8, j, i, ((Object) (null)), bundle);
	//   16   27:aload_0         
	//   17   28:bipush          8
	//   18   30:iload_2         
	//   19   31:iload_1         
	//   20   32:aconst_null     
	//   21   33:aload_3         
	//   22   34:invokespecial   #134 <Method boolean sendRequest(int, int, int, Object, Bundle)>
	//   23   37:pop             
	//   24   38:return          
	}

	private int mNextControllerId;
	private int mNextRequestId;
	private final SparseArray mPendingCallbacks = new SparseArray();
	private int mPendingRegisterRequestId;
	private final ler mReceiveHandler = new ler(this);
	private final Messenger mReceiveMessenger;
	private final Messenger mServiceMessenger;
	private int mServiceVersion;
	final RegisteredMediaRouteProvider this$0;

	public RegisteredMediaRouteProvider$Connection(Messenger messenger)
	{
		this$0 = RegisteredMediaRouteProvider.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field RegisteredMediaRouteProvider this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #35  <Method void Object()>
		mNextRequestId = 1;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #37  <Field int mNextRequestId>
		mNextControllerId = 1;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #39  <Field int mNextControllerId>
	//   11   19:aload_0         
	//   12   20:new             #41  <Class SparseArray>
	//   13   23:dup             
	//   14   24:invokespecial   #42  <Method void SparseArray()>
	//   15   27:putfield        #44  <Field SparseArray mPendingCallbacks>
		mServiceMessenger = messenger;
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:putfield        #46  <Field Messenger mServiceMessenger>
	//   19   35:aload_0         
	//   20   36:new             #48  <Class RegisteredMediaRouteProvider$ReceiveHandler>
	//   21   39:dup             
	//   22   40:aload_0         
	//   23   41:invokespecial   #51  <Method void RegisteredMediaRouteProvider$ReceiveHandler(RegisteredMediaRouteProvider$Connection)>
	//   24   44:putfield        #53  <Field RegisteredMediaRouteProvider$ReceiveHandler mReceiveHandler>
		mReceiveMessenger = new Messenger(((android.os.Handler) (mReceiveHandler)));
	//   25   47:aload_0         
	//   26   48:new             #55  <Class Messenger>
	//   27   51:dup             
	//   28   52:aload_0         
	//   29   53:getfield        #53  <Field RegisteredMediaRouteProvider$ReceiveHandler mReceiveHandler>
	//   30   56:invokespecial   #58  <Method void Messenger(android.os.Handler)>
	//   31   59:putfield        #60  <Field Messenger mReceiveMessenger>
	//   32   62:return          
	}
}
