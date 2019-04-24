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
		if(mCurConnection == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field MediaBrowserServiceCompat this$0>
	//*   2    4:getfield        #31  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
	//*   3    7:ifnonnull       20
			throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem or onSearch methods");
	//    4   10:new             #33  <Class IllegalStateException>
	//    5   13:dup             
	//    6   14:ldc1            #35  <String "This should be called inside of onLoadChildren, onLoadItem or onSearch methods">
	//    7   16:invokespecial   #38  <Method void IllegalStateException(String)>
	//    8   19:athrow          
		if(mCurConnection.rootHints == null)
	//*   9   20:aload_0         
	//*  10   21:getfield        #21  <Field MediaBrowserServiceCompat this$0>
	//*  11   24:getfield        #31  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
	//*  12   27:getfield        #44  <Field Bundle MediaBrowserServiceCompat$ConnectionRecord.rootHints>
	//*  13   30:ifnonnull       35
			return null;
	//   14   33:aconst_null     
	//   15   34:areturn         
		else
			return new Bundle(mCurConnection.rootHints);
	//   16   35:new             #46  <Class Bundle>
	//   17   38:dup             
	//   18   39:aload_0         
	//   19   40:getfield        #21  <Field MediaBrowserServiceCompat this$0>
	//   20   43:getfield        #31  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
	//   21   46:getfield        #44  <Field Bundle MediaBrowserServiceCompat$ConnectionRecord.rootHints>
	//   22   49:invokespecial   #49  <Method void Bundle(Bundle)>
	//   23   52:areturn         
	}

	public void notifyChildrenChanged(final String parentId, final Bundle options)
	{
		mHandler.post(new Runnable() {

			public void run()
			{
				for(Iterator iterator = mConnections.keySet().iterator(); iterator.hasNext();)
			//*   0    0:aload_0         
			//*   1    1:getfield        #24  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplBase this$1>
			//*   2    4:getfield        #37  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$MediaBrowserServiceImplBase.this$0>
			//*   3    7:getfield        #41  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
			//*   4   10:invokevirtual   #47  <Method Set ArrayMap.keySet()>
			//*   5   13:invokeinterface #53  <Method Iterator Set.iterator()>
			//*   6   18:astore_1        
			//*   7   19:aload_1         
			//*   8   20:invokeinterface #59  <Method boolean Iterator.hasNext()>
			//*   9   25:ifeq            146
				{
					Object obj = ((Object) ((IBinder)iterator.next()));
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
					Object obj1 = ((Object) ((List)((MediaBrowserServiceCompat.ConnectionRecord) (obj)).subscriptions.get(((Object) (parentId)))));
			//   22   56:aload_2         
			//   23   57:getfield        #75  <Field HashMap MediaBrowserServiceCompat$ConnectionRecord.subscriptions>
			//   24   60:aload_0         
			//   25   61:getfield        #26  <Field String val$parentId>
			//   26   64:invokevirtual   #78  <Method Object HashMap.get(Object)>
			//   27   67:checkcast       #80  <Class List>
			//   28   70:astore_3        
					if(obj1 != null)
			//*  29   71:aload_3         
			//*  30   72:ifnull          19
					{
						obj1 = ((Object) (((List) (obj1)).iterator()));
			//   31   75:aload_3         
			//   32   76:invokeinterface #81  <Method Iterator List.iterator()>
			//   33   81:astore_3        
						while(((Iterator) (obj1)).hasNext()) 
			//*  34   82:aload_3         
			//*  35   83:invokeinterface #59  <Method boolean Iterator.hasNext()>
			//*  36   88:ifeq            19
						{
							Pair pair = (Pair)((Iterator) (obj1)).next();
			//   37   91:aload_3         
			//   38   92:invokeinterface #63  <Method Object Iterator.next()>
			//   39   97:checkcast       #83  <Class Pair>
			//   40  100:astore          4
							if(MediaBrowserCompatUtils.hasDuplicatedItems(options, (Bundle)pair.second))
			//*  41  102:aload_0         
			//*  42  103:getfield        #28  <Field Bundle val$options>
			//*  43  106:aload           4
			//*  44  108:getfield        #87  <Field Object Pair.second>
			//*  45  111:checkcast       #89  <Class Bundle>
			//*  46  114:invokestatic    #95  <Method boolean MediaBrowserCompatUtils.hasDuplicatedItems(Bundle, Bundle)>
			//*  47  117:ifeq            82
								performLoadChildren(parentId, ((MediaBrowserServiceCompat.ConnectionRecord) (obj)), (Bundle)pair.second);
			//   48  120:aload_0         
			//   49  121:getfield        #24  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplBase this$1>
			//   50  124:getfield        #37  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$MediaBrowserServiceImplBase.this$0>
			//   51  127:aload_0         
			//   52  128:getfield        #26  <Field String val$parentId>
			//   53  131:aload_2         
			//   54  132:aload           4
			//   55  134:getfield        #87  <Field Object Pair.second>
			//   56  137:checkcast       #89  <Class Bundle>
			//   57  140:invokevirtual   #99  <Method void MediaBrowserServiceCompat.performLoadChildren(String, MediaBrowserServiceCompat$ConnectionRecord, Bundle)>
						}
					}
				}

			//*  58  143:goto            82
			//   59  146:return          
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
	//    1    1:getfield        #21  <Field MediaBrowserServiceCompat this$0>
	//    2    4:getfield        #56  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
	//    3    7:new             #13  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplBase$2>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokespecial   #59  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplBase$2(MediaBrowserServiceCompat$MediaBrowserServiceImplBase, String, Bundle)>
	//    9   17:invokevirtual   #65  <Method boolean MediaBrowserServiceCompat$ServiceHandler.post(Runnable)>
	//   10   20:pop             
	//   11   21:return          
	}

	public IBinder onBind(Intent intent)
	{
		if("android.media.browse.MediaBrowserService".equals(((Object) (intent.getAction()))))
	//*   0    0:ldc1            #70  <String "android.media.browse.MediaBrowserService">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #76  <Method String Intent.getAction()>
	//*   3    6:invokevirtual   #82  <Method boolean String.equals(Object)>
	//*   4    9:ifeq            20
			return mMessenger.getBinder();
	//    5   12:aload_0         
	//    6   13:getfield        #84  <Field Messenger mMessenger>
	//    7   16:invokevirtual   #90  <Method IBinder Messenger.getBinder()>
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
	//    1    1:new             #86  <Class Messenger>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field MediaBrowserServiceCompat this$0>
	//    5    9:getfield        #56  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
	//    6   12:invokespecial   #94  <Method void Messenger(android.os.Handler)>
	//    7   15:putfield        #84  <Field Messenger mMessenger>
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
	//    1    1:getfield        #21  <Field MediaBrowserServiceCompat this$0>
	//    2    4:getfield        #56  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
	//    3    7:new             #11  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplBase$1>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokespecial   #99  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplBase$1(MediaBrowserServiceCompat$MediaBrowserServiceImplBase, android.support.v4.media.session.MediaSessionCompat$Token)>
	//    8   16:invokevirtual   #65  <Method boolean MediaBrowserServiceCompat$ServiceHandler.post(Runnable)>
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
	//    2    2:putfield        #21  <Field MediaBrowserServiceCompat this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
	//    5    9:return          
	}
}
