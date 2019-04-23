// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.Intent;
import android.os.*;
import android.support.v4.util.ArrayMap;
import android.support.v4.util.Pair;
import android.util.Log;
import java.util.*;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat, MediaBrowserCompatUtils

class MediaBrowserServiceCompat$MediaBrowserServiceImplBase
	implements MediaBrowserServiceCompat.MediaBrowserServiceImpl
{

	public Bundle getBrowserRootHints()
	{
		if(mCurConnection != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field MediaBrowserServiceCompat this$0>
	//*   2    4:getfield        #33  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
	//*   3    7:ifnull          43
		{
			if(mCurConnection.rootHints == null)
	//*   4   10:aload_0         
	//*   5   11:getfield        #23  <Field MediaBrowserServiceCompat this$0>
	//*   6   14:getfield        #33  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
	//*   7   17:getfield        #39  <Field Bundle MediaBrowserServiceCompat$ConnectionRecord.rootHints>
	//*   8   20:ifnonnull       25
				return null;
	//    9   23:aconst_null     
	//   10   24:areturn         
			else
				return new Bundle(mCurConnection.rootHints);
	//   11   25:new             #41  <Class Bundle>
	//   12   28:dup             
	//   13   29:aload_0         
	//   14   30:getfield        #23  <Field MediaBrowserServiceCompat this$0>
	//   15   33:getfield        #33  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
	//   16   36:getfield        #39  <Field Bundle MediaBrowserServiceCompat$ConnectionRecord.rootHints>
	//   17   39:invokespecial   #44  <Method void Bundle(Bundle)>
	//   18   42:areturn         
		} else
		{
			throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
	//   19   43:new             #46  <Class IllegalStateException>
	//   20   46:dup             
	//   21   47:ldc1            #48  <String "This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods">
	//   22   49:invokespecial   #51  <Method void IllegalStateException(String)>
	//   23   52:athrow          
		}
	}

	public MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo()
	{
		if(mCurConnection != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field MediaBrowserServiceCompat this$0>
	//*   2    4:getfield        #33  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
	//*   3    7:ifnull          21
			return mCurConnection.browserInfo;
	//    4   10:aload_0         
	//    5   11:getfield        #23  <Field MediaBrowserServiceCompat this$0>
	//    6   14:getfield        #33  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
	//    7   17:getfield        #57  <Field MediaSessionManager$RemoteUserInfo MediaBrowserServiceCompat$ConnectionRecord.browserInfo>
	//    8   20:areturn         
		else
			throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
	//    9   21:new             #46  <Class IllegalStateException>
	//   10   24:dup             
	//   11   25:ldc1            #48  <String "This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods">
	//   12   27:invokespecial   #51  <Method void IllegalStateException(String)>
	//   13   30:athrow          
	}

	public void notifyChildrenChanged(final MediaSessionManager.RemoteUserInfo remoteUserInfo, final String parentId, final Bundle options)
	{
		mHandler.post(new Runnable() {

			public void run()
			{
				for(int i = 0; i < mConnections.size(); i++)
			//*   0    0:iconst_0        
			//*   1    1:istore_1        
			//*   2    2:iload_1         
			//*   3    3:aload_0         
			//*   4    4:getfield        #26  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplBase this$1>
			//*   5    7:getfield        #41  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$MediaBrowserServiceImplBase.this$0>
			//*   6   10:getfield        #45  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
			//*   7   13:invokevirtual   #51  <Method int ArrayMap.size()>
			//*   8   16:icmpge          75
				{
					MediaBrowserServiceCompat.ConnectionRecord connectionrecord = (MediaBrowserServiceCompat.ConnectionRecord)mConnections.valueAt(i);
			//    9   19:aload_0         
			//   10   20:getfield        #26  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplBase this$1>
			//   11   23:getfield        #41  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$MediaBrowserServiceImplBase.this$0>
			//   12   26:getfield        #45  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
			//   13   29:iload_1         
			//   14   30:invokevirtual   #55  <Method Object ArrayMap.valueAt(int)>
			//   15   33:checkcast       #57  <Class MediaBrowserServiceCompat$ConnectionRecord>
			//   16   36:astore_2        
					if(connectionrecord.browserInfo.equals(((Object) (remoteUserInfo))))
			//*  17   37:aload_2         
			//*  18   38:getfield        #60  <Field MediaSessionManager$RemoteUserInfo MediaBrowserServiceCompat$ConnectionRecord.browserInfo>
			//*  19   41:aload_0         
			//*  20   42:getfield        #28  <Field MediaSessionManager$RemoteUserInfo val$remoteUserInfo>
			//*  21   45:invokevirtual   #66  <Method boolean MediaSessionManager$RemoteUserInfo.equals(Object)>
			//*  22   48:ifeq            68
					{
						notifyChildrenChangedOnHandler(connectionrecord, parentId, options);
			//   23   51:aload_0         
			//   24   52:getfield        #26  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplBase this$1>
			//   25   55:aload_2         
			//   26   56:aload_0         
			//   27   57:getfield        #30  <Field String val$parentId>
			//   28   60:aload_0         
			//   29   61:getfield        #32  <Field Bundle val$options>
			//   30   64:invokevirtual   #70  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplBase.notifyChildrenChangedOnHandler(MediaBrowserServiceCompat$ConnectionRecord, String, Bundle)>
						return;
			//   31   67:return          
					}
				}

			//   32   68:iload_1         
			//   33   69:iconst_1        
			//   34   70:iadd            
			//   35   71:istore_1        
			//*  36   72:goto            2
			//   37   75:return          
			}

			final MediaBrowserServiceCompat.MediaBrowserServiceImplBase this$1;
			final Bundle val$options;
			final String val$parentId;
			final MediaSessionManager.RemoteUserInfo val$remoteUserInfo;

			
			{
				this$1 = MediaBrowserServiceCompat.MediaBrowserServiceImplBase.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplBase this$1>
				remoteUserInfo = remoteuserinfo;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field MediaSessionManager$RemoteUserInfo val$remoteUserInfo>
				parentId = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field String val$parentId>
				options = bundle;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #32  <Field Bundle val$options>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #35  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field MediaBrowserServiceCompat this$0>
	//    2    4:getfield        #64  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
	//    3    7:new             #15  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplBase$3>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:aload_3         
	//    9   15:invokespecial   #67  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplBase$3(MediaBrowserServiceCompat$MediaBrowserServiceImplBase, MediaSessionManager$RemoteUserInfo, String, Bundle)>
	//   10   18:invokevirtual   #73  <Method boolean MediaBrowserServiceCompat$ServiceHandler.post(Runnable)>
	//   11   21:pop             
	//   12   22:return          
	}

	public void notifyChildrenChanged(final String parentId, final Bundle options)
	{
		mHandler.post(new Runnable() {

			public void run()
			{
				Object obj;
				for(Iterator iterator = mConnections.keySet().iterator(); iterator.hasNext(); notifyChildrenChangedOnHandler(((MediaBrowserServiceCompat.ConnectionRecord) (obj)), parentId, options))
			//*   0    0:aload_0         
			//*   1    1:getfield        #24  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplBase this$1>
			//*   2    4:getfield        #37  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$MediaBrowserServiceImplBase.this$0>
			//*   3    7:getfield        #41  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
			//*   4   10:invokevirtual   #47  <Method Set ArrayMap.keySet()>
			//*   5   13:invokeinterface #53  <Method Iterator Set.iterator()>
			//*   6   18:astore_1        
			//*   7   19:aload_1         
			//*   8   20:invokeinterface #59  <Method boolean Iterator.hasNext()>
			//*   9   25:ifeq            75
				{
					obj = ((Object) ((IBinder)iterator.next()));
			//   10   28:aload_1         
			//   11   29:invokeinterface #63  <Method Object Iterator.next()>
			//   12   34:checkcast       #65  <Class IBinder>
			//   13   37:astore_2        
					obj = ((Object) ((MediaBrowserServiceCompat.ConnectionRecord)mConnections.get(obj)));
			//   14   38:aload_0         
			//   15   39:getfield        #24  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplBase this$1>
			//   16   42:getfield        #37  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$MediaBrowserServiceImplBase.this$0>
			//   17   45:getfield        #41  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
			//   18   48:aload_2         
			//   19   49:invokevirtual   #69  <Method Object ArrayMap.get(Object)>
			//   20   52:checkcast       #71  <Class MediaBrowserServiceCompat$ConnectionRecord>
			//   21   55:astore_2        
				}

			//   22   56:aload_0         
			//   23   57:getfield        #24  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplBase this$1>
			//   24   60:aload_2         
			//   25   61:aload_0         
			//   26   62:getfield        #26  <Field String val$parentId>
			//   27   65:aload_0         
			//   28   66:getfield        #28  <Field Bundle val$options>
			//   29   69:invokevirtual   #75  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplBase.notifyChildrenChangedOnHandler(MediaBrowserServiceCompat$ConnectionRecord, String, Bundle)>
			//*  30   72:goto            19
			//   31   75:return          
			}

			final MediaBrowserServiceCompat.MediaBrowserServiceImplBase this$1;
			final Bundle val$options;
			final String val$parentId;

			
			{
				this$1 = MediaBrowserServiceCompat.MediaBrowserServiceImplBase.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplBase this$1>
				parentId = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field String val$parentId>
				options = bundle;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field Bundle val$options>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #31  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field MediaBrowserServiceCompat this$0>
	//    2    4:getfield        #64  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
	//    3    7:new             #13  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplBase$2>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokespecial   #78  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplBase$2(MediaBrowserServiceCompat$MediaBrowserServiceImplBase, String, Bundle)>
	//    9   17:invokevirtual   #73  <Method boolean MediaBrowserServiceCompat$ServiceHandler.post(Runnable)>
	//   10   20:pop             
	//   11   21:return          
	}

	void notifyChildrenChangedOnHandler(MediaBrowserServiceCompat.ConnectionRecord connectionrecord, String s, Bundle bundle)
	{
		Object obj = ((Object) ((List)connectionrecord.subscriptions.get(((Object) (s)))));
	//    0    0:aload_1         
	//    1    1:getfield        #84  <Field HashMap MediaBrowserServiceCompat$ConnectionRecord.subscriptions>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #90  <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #92  <Class List>
	//    5   11:astore          4
		if(obj != null)
	//*   6   13:aload           4
	//*   7   15:ifnull          85
		{
			obj = ((Object) (((List) (obj)).iterator()));
	//    8   18:aload           4
	//    9   20:invokeinterface #96  <Method Iterator List.iterator()>
	//   10   25:astore          4
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
	//   11   27:aload           4
	//   12   29:invokeinterface #102 <Method boolean Iterator.hasNext()>
	//   13   34:ifeq            85
				Pair pair = (Pair)((Iterator) (obj)).next();
	//   14   37:aload           4
	//   15   39:invokeinterface #106 <Method Object Iterator.next()>
	//   16   44:checkcast       #108 <Class Pair>
	//   17   47:astore          5
				if(MediaBrowserCompatUtils.hasDuplicatedItems(bundle, (Bundle)pair.second))
	//*  18   49:aload_3         
	//*  19   50:aload           5
	//*  20   52:getfield        #112 <Field Object Pair.second>
	//*  21   55:checkcast       #41  <Class Bundle>
	//*  22   58:invokestatic    #118 <Method boolean MediaBrowserCompatUtils.hasDuplicatedItems(Bundle, Bundle)>
	//*  23   61:ifeq            27
					performLoadChildren(s, connectionrecord, (Bundle)pair.second, bundle);
	//   24   64:aload_0         
	//   25   65:getfield        #23  <Field MediaBrowserServiceCompat this$0>
	//   26   68:aload_2         
	//   27   69:aload_1         
	//   28   70:aload           5
	//   29   72:getfield        #112 <Field Object Pair.second>
	//   30   75:checkcast       #41  <Class Bundle>
	//   31   78:aload_3         
	//   32   79:invokevirtual   #122 <Method void MediaBrowserServiceCompat.performLoadChildren(String, MediaBrowserServiceCompat$ConnectionRecord, Bundle, Bundle)>
			} while(true);
	//   33   82:goto            27
		}
	//   34   85:return          
	}

	public IBinder onBind(Intent intent)
	{
		if("android.media.browse.MediaBrowserService".equals(((Object) (intent.getAction()))))
	//*   0    0:ldc1            #126 <String "android.media.browse.MediaBrowserService">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #132 <Method String Intent.getAction()>
	//*   3    6:invokevirtual   #138 <Method boolean String.equals(Object)>
	//*   4    9:ifeq            20
			return mMessenger.getBinder();
	//    5   12:aload_0         
	//    6   13:getfield        #140 <Field Messenger mMessenger>
	//    7   16:invokevirtual   #146 <Method IBinder Messenger.getBinder()>
	//    8   19:areturn         
		else
			return null;
	//    9   20:aconst_null     
	//   10   21:areturn         
	}

	public void onCreate()
	{
		mMessenger = new Messenger(((android.os.Handler) (mHandler)));
	//    0    0:aload_0         
	//    1    1:new             #142 <Class Messenger>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #23  <Field MediaBrowserServiceCompat this$0>
	//    5    9:getfield        #64  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
	//    6   12:invokespecial   #150 <Method void Messenger(android.os.Handler)>
	//    7   15:putfield        #140 <Field Messenger mMessenger>
	//    8   18:return          
	}

	public void setSessionToken(final android.support.v4.media.session.MediaSessionCompat.Token token)
	{
		mHandler.post(new Runnable() {

			public void run()
			{
				RemoteException remoteexception;
				for(Iterator iterator = mConnections.values().iterator(); iterator.hasNext();)
			//*   0    0:aload_0         
			//*   1    1:getfield        #22  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplBase this$1>
			//*   2    4:getfield        #35  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$MediaBrowserServiceImplBase.this$0>
			//*   3    7:getfield        #39  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
			//*   4   10:invokevirtual   #45  <Method Collection ArrayMap.values()>
			//*   5   13:invokeinterface #51  <Method Iterator Collection.iterator()>
			//*   6   18:astore_1        
			//*   7   19:aload_1         
			//*   8   20:invokeinterface #57  <Method boolean Iterator.hasNext()>
			//*   9   25:ifeq            118
				{
					MediaBrowserServiceCompat.ConnectionRecord connectionrecord = (MediaBrowserServiceCompat.ConnectionRecord)iterator.next();
			//   10   28:aload_1         
			//   11   29:invokeinterface #61  <Method Object Iterator.next()>
			//   12   34:checkcast       #63  <Class MediaBrowserServiceCompat$ConnectionRecord>
			//   13   37:astore_2        
					StringBuilder stringbuilder;
					try
					{
						connectionrecord.callbacks.onConnect(connectionrecord.root.getRootId(), token, connectionrecord.root.getExtras());
			//   14   38:aload_2         
			//   15   39:getfield        #67  <Field MediaBrowserServiceCompat$ServiceCallbacks MediaBrowserServiceCompat$ConnectionRecord.callbacks>
			//   16   42:aload_2         
			//   17   43:getfield        #71  <Field MediaBrowserServiceCompat$BrowserRoot MediaBrowserServiceCompat$ConnectionRecord.root>
			//   18   46:invokevirtual   #77  <Method String MediaBrowserServiceCompat$BrowserRoot.getRootId()>
			//   19   49:aload_0         
			//   20   50:getfield        #24  <Field android.support.v4.media.session.MediaSessionCompat$Token val$token>
			//   21   53:aload_2         
			//   22   54:getfield        #71  <Field MediaBrowserServiceCompat$BrowserRoot MediaBrowserServiceCompat$ConnectionRecord.root>
			//   23   57:invokevirtual   #81  <Method Bundle MediaBrowserServiceCompat$BrowserRoot.getExtras()>
			//   24   60:invokeinterface #87  <Method void MediaBrowserServiceCompat$ServiceCallbacks.onConnect(String, android.support.v4.media.session.MediaSessionCompat$Token, Bundle)>
					}
			//*  25   65:goto            19
			//*  26   68:new             #89  <Class StringBuilder>
			//*  27   71:dup             
			//*  28   72:invokespecial   #90  <Method void StringBuilder()>
			//*  29   75:astore_3        
			//*  30   76:aload_3         
			//*  31   77:ldc1            #92  <String "Connection for ">
			//*  32   79:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
			//*  33   82:pop             
			//*  34   83:aload_3         
			//*  35   84:aload_2         
			//*  36   85:getfield        #100 <Field String MediaBrowserServiceCompat$ConnectionRecord.pkg>
			//*  37   88:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
			//*  38   91:pop             
			//*  39   92:aload_3         
			//*  40   93:ldc1            #102 <String " is no longer valid.">
			//*  41   95:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
			//*  42   98:pop             
			//*  43   99:ldc1            #104 <String "MBServiceCompat">
			//*  44  101:aload_3         
			//*  45  102:invokevirtual   #107 <Method String StringBuilder.toString()>
			//*  46  105:invokestatic    #113 <Method int Log.w(String, String)>
			//*  47  108:pop             
			//*  48  109:aload_1         
			//*  49  110:invokeinterface #116 <Method void Iterator.remove()>
			//*  50  115:goto            19
			//*  51  118:return          
					// Misplaced declaration of an exception variable
					catch(RemoteException remoteexception)
					{
						stringbuilder = new StringBuilder();
						stringbuilder.append("Connection for ");
						stringbuilder.append(connectionrecord.pkg);
						stringbuilder.append(" is no longer valid.");
						Log.w("MBServiceCompat", stringbuilder.toString());
						iterator.remove();
					}
				}

			//*  52  119:astore_3        
			//*  53  120:goto            68
			}

			final MediaBrowserServiceCompat.MediaBrowserServiceImplBase this$1;
			final android.support.v4.media.session.MediaSessionCompat.Token val$token;

			
			{
				this$1 = MediaBrowserServiceCompat.MediaBrowserServiceImplBase.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplBase this$1>
				token = token1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field android.support.v4.media.session.MediaSessionCompat$Token val$token>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field MediaBrowserServiceCompat this$0>
	//    2    4:getfield        #64  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
	//    3    7:new             #11  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplBase$1>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokespecial   #155 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplBase$1(MediaBrowserServiceCompat$MediaBrowserServiceImplBase, android.support.v4.media.session.MediaSessionCompat$Token)>
	//    8   16:invokevirtual   #73  <Method boolean MediaBrowserServiceCompat$ServiceHandler.post(Runnable)>
	//    9   19:pop             
	//   10   20:return          
	}

	private Messenger mMessenger;
	final MediaBrowserServiceCompat this$0;

	MediaBrowserServiceCompat$MediaBrowserServiceImplBase()
	{
		this$0 = MediaBrowserServiceCompat.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field MediaBrowserServiceCompat this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #26  <Method void Object()>
	//    5    9:return          
	}
}
