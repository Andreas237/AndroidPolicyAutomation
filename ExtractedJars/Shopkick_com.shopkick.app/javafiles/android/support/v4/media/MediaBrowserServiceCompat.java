// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.*;
import android.service.media.MediaBrowserService;
import android.support.v4.app.BundleCompat;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.support.v4.util.ArrayMap;
import android.support.v4.util.Pair;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.*;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompatUtils, MediaBrowserServiceCompatApi21, MediaBrowserServiceCompatApi23, MediaBrowserServiceCompatApi26, 
//			MediaBrowserCompat

public abstract class MediaBrowserServiceCompat extends Service
{
	public static final class BrowserRoot
	{

		public Bundle getExtras()
		{
			return mExtras;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field Bundle mExtras>
		//    2    4:areturn         
		}

		public String getRootId()
		{
			return mRootId;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field String mRootId>
		//    2    4:areturn         
		}

		public static final String EXTRA_OFFLINE = "android.service.media.extra.OFFLINE";
		public static final String EXTRA_RECENT = "android.service.media.extra.RECENT";
		public static final String EXTRA_SUGGESTED = "android.service.media.extra.SUGGESTED";
		public static final String EXTRA_SUGGESTION_KEYWORDS = "android.service.media.extra.SUGGESTION_KEYWORDS";
		private final Bundle mExtras;
		private final String mRootId;

		public BrowserRoot(String s, Bundle bundle)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #31  <Method void Object()>
			if(s != null)
		//*   2    4:aload_1         
		//*   3    5:ifnull          19
			{
				mRootId = s;
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:putfield        #33  <Field String mRootId>
				mExtras = bundle;
		//    7   13:aload_0         
		//    8   14:aload_2         
		//    9   15:putfield        #35  <Field Bundle mExtras>
				return;
		//   10   18:return          
			} else
			{
				throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead.");
		//   11   19:new             #37  <Class IllegalArgumentException>
		//   12   22:dup             
		//   13   23:ldc1            #39  <String "The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead.">
		//   14   25:invokespecial   #42  <Method void IllegalArgumentException(String)>
		//   15   28:athrow          
			}
		}
	}

	private class ConnectionRecord
		implements android.os.IBinder.DeathRecipient
	{

		public void binderDied()
		{
			mHandler.post(new Runnable() {

				public void run()
				{
					mConnections.remove(((Object) (callbacks.asBinder())));
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field MediaBrowserServiceCompat$ConnectionRecord this$1>
				//    2    4:getfield        #28  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ConnectionRecord.this$0>
				//    3    7:getfield        #32  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
				//    4   10:aload_0         
				//    5   11:getfield        #20  <Field MediaBrowserServiceCompat$ConnectionRecord this$1>
				//    6   14:getfield        #36  <Field MediaBrowserServiceCompat$ServiceCallbacks MediaBrowserServiceCompat$ConnectionRecord.callbacks>
				//    7   17:invokeinterface #42  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
				//    8   22:invokevirtual   #48  <Method Object ArrayMap.remove(Object)>
				//    9   25:pop             
				//   10   26:return          
				}

				final ConnectionRecord this$1;

			
			{
				this$1 = ConnectionRecord.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field MediaBrowserServiceCompat$ConnectionRecord this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
			}
);
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field MediaBrowserServiceCompat this$0>
		//    2    4:getfield        #64  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//    3    7:new             #11  <Class MediaBrowserServiceCompat$ConnectionRecord$1>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:invokespecial   #67  <Method void MediaBrowserServiceCompat$ConnectionRecord$1(MediaBrowserServiceCompat$ConnectionRecord)>
		//    7   15:invokevirtual   #73  <Method boolean MediaBrowserServiceCompat$ServiceHandler.post(Runnable)>
		//    8   18:pop             
		//    9   19:return          
		}

		public final MediaSessionManager.RemoteUserInfo browserInfo;
		public final ServiceCallbacks callbacks;
		public final int pid;
		public final String pkg;
		public BrowserRoot root;
		public final Bundle rootHints;
		public final HashMap subscriptions = new HashMap();
		final MediaBrowserServiceCompat this$0;
		public final int uid;

		ConnectionRecord(String s, int i, int j, Bundle bundle, ServiceCallbacks servicecallbacks)
		{
			this$0 = MediaBrowserServiceCompat.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #33  <Field MediaBrowserServiceCompat this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #36  <Method void Object()>
		//    5    9:aload_0         
		//    6   10:new             #38  <Class HashMap>
		//    7   13:dup             
		//    8   14:invokespecial   #39  <Method void HashMap()>
		//    9   17:putfield        #41  <Field HashMap subscriptions>
			pkg = s;
		//   10   20:aload_0         
		//   11   21:aload_2         
		//   12   22:putfield        #43  <Field String pkg>
			pid = i;
		//   13   25:aload_0         
		//   14   26:iload_3         
		//   15   27:putfield        #45  <Field int pid>
			uid = j;
		//   16   30:aload_0         
		//   17   31:iload           4
		//   18   33:putfield        #47  <Field int uid>
			browserInfo = new MediaSessionManager.RemoteUserInfo(s, i, j);
		//   19   36:aload_0         
		//   20   37:new             #49  <Class MediaSessionManager$RemoteUserInfo>
		//   21   40:dup             
		//   22   41:aload_2         
		//   23   42:iload_3         
		//   24   43:iload           4
		//   25   45:invokespecial   #52  <Method void MediaSessionManager$RemoteUserInfo(String, int, int)>
		//   26   48:putfield        #54  <Field MediaSessionManager$RemoteUserInfo browserInfo>
			rootHints = bundle;
		//   27   51:aload_0         
		//   28   52:aload           5
		//   29   54:putfield        #56  <Field Bundle rootHints>
			callbacks = servicecallbacks;
		//   30   57:aload_0         
		//   31   58:aload           6
		//   32   60:putfield        #58  <Field MediaBrowserServiceCompat$ServiceCallbacks callbacks>
		//   33   63:return          
		}
	}

	static interface MediaBrowserServiceImpl
	{

		public abstract Bundle getBrowserRootHints();

		public abstract MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo();

		public abstract void notifyChildrenChanged(MediaSessionManager.RemoteUserInfo remoteuserinfo, String s, Bundle bundle);

		public abstract void notifyChildrenChanged(String s, Bundle bundle);

		public abstract IBinder onBind(Intent intent);

		public abstract void onCreate();

		public abstract void setSessionToken(android.support.v4.media.session.MediaSessionCompat.Token token);
	}

	class MediaBrowserServiceImplApi21
		implements MediaBrowserServiceImpl, MediaBrowserServiceCompatApi21.ServiceCompatProxy
	{

		public Bundle getBrowserRootHints()
		{
			if(mMessenger == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #48  <Field Messenger mMessenger>
		//*   2    4:ifnonnull       9
				return null;
		//    3    7:aconst_null     
		//    4    8:areturn         
			if(mCurConnection != null)
		//*   5    9:aload_0         
		//*   6   10:getfield        #35  <Field MediaBrowserServiceCompat this$0>
		//*   7   13:getfield        #52  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
		//*   8   16:ifnull          52
			{
				if(mCurConnection.rootHints == null)
		//*   9   19:aload_0         
		//*  10   20:getfield        #35  <Field MediaBrowserServiceCompat this$0>
		//*  11   23:getfield        #52  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
		//*  12   26:getfield        #58  <Field Bundle MediaBrowserServiceCompat$ConnectionRecord.rootHints>
		//*  13   29:ifnonnull       34
					return null;
		//   14   32:aconst_null     
		//   15   33:areturn         
				else
					return new Bundle(mCurConnection.rootHints);
		//   16   34:new             #60  <Class Bundle>
		//   17   37:dup             
		//   18   38:aload_0         
		//   19   39:getfield        #35  <Field MediaBrowserServiceCompat this$0>
		//   20   42:getfield        #52  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
		//   21   45:getfield        #58  <Field Bundle MediaBrowserServiceCompat$ConnectionRecord.rootHints>
		//   22   48:invokespecial   #63  <Method void Bundle(Bundle)>
		//   23   51:areturn         
			} else
			{
				throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
		//   24   52:new             #65  <Class IllegalStateException>
		//   25   55:dup             
		//   26   56:ldc1            #67  <String "This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods">
		//   27   58:invokespecial   #70  <Method void IllegalStateException(String)>
		//   28   61:athrow          
			}
		}

		public MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo()
		{
			if(mCurConnection != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #35  <Field MediaBrowserServiceCompat this$0>
		//*   2    4:getfield        #52  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
		//*   3    7:ifnull          21
				return mCurConnection.browserInfo;
		//    4   10:aload_0         
		//    5   11:getfield        #35  <Field MediaBrowserServiceCompat this$0>
		//    6   14:getfield        #52  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
		//    7   17:getfield        #76  <Field MediaSessionManager$RemoteUserInfo MediaBrowserServiceCompat$ConnectionRecord.browserInfo>
		//    8   20:areturn         
			else
				throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
		//    9   21:new             #65  <Class IllegalStateException>
		//   10   24:dup             
		//   11   25:ldc1            #67  <String "This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods">
		//   12   27:invokespecial   #70  <Method void IllegalStateException(String)>
		//   13   30:athrow          
		}

		public void notifyChildrenChanged(MediaSessionManager.RemoteUserInfo remoteuserinfo, String s, Bundle bundle)
		{
			notifyChildrenChangedForCompat(remoteuserinfo, s, bundle);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokevirtual   #81  <Method void notifyChildrenChangedForCompat(MediaSessionManager$RemoteUserInfo, String, Bundle)>
		//    5    7:return          
		}

		public void notifyChildrenChanged(String s, Bundle bundle)
		{
			notifyChildrenChangedForFramework(s, bundle);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #85  <Method void notifyChildrenChangedForFramework(String, Bundle)>
			notifyChildrenChangedForCompat(s, bundle);
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:aload_2         
		//    7    9:invokevirtual   #87  <Method void notifyChildrenChangedForCompat(String, Bundle)>
		//    8   12:return          
		}

		void notifyChildrenChangedForCompat(final MediaSessionManager.RemoteUserInfo remoteUserInfo, final String parentId, Bundle bundle)
		{
			mHandler.post(((_cls4) (bundle)). new Runnable() {

				public void run()
				{
					for(int i = 0; i < mConnections.size(); i++)
				//*   0    0:iconst_0        
				//*   1    1:istore_1        
				//*   2    2:iload_1         
				//*   3    3:aload_0         
				//*   4    4:getfield        #26  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
				//*   5    7:getfield        #41  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$MediaBrowserServiceImplApi21.this$0>
				//*   6   10:getfield        #45  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
				//*   7   13:invokevirtual   #51  <Method int ArrayMap.size()>
				//*   8   16:icmpge          74
					{
						ConnectionRecord connectionrecord = (ConnectionRecord)mConnections.valueAt(i);
				//    9   19:aload_0         
				//   10   20:getfield        #26  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
				//   11   23:getfield        #41  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$MediaBrowserServiceImplApi21.this$0>
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
				//*  22   48:ifeq            67
							notifyChildrenChangedForCompatOnHandler(connectionrecord, parentId, options);
				//   23   51:aload_0         
				//   24   52:getfield        #26  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
				//   25   55:aload_2         
				//   26   56:aload_0         
				//   27   57:getfield        #30  <Field String val$parentId>
				//   28   60:aload_0         
				//   29   61:getfield        #32  <Field Bundle val$options>
				//   30   64:invokevirtual   #70  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi21.notifyChildrenChangedForCompatOnHandler(MediaBrowserServiceCompat$ConnectionRecord, String, Bundle)>
					}

				//   31   67:iload_1         
				//   32   68:iconst_1        
				//   33   69:iadd            
				//   34   70:istore_1        
				//*  35   71:goto            2
				//   36   74:return          
				}

				final MediaBrowserServiceImplApi21 this$1;
				final Bundle val$options;
				final String val$parentId;
				final MediaSessionManager.RemoteUserInfo val$remoteUserInfo;

			
			{
				this$1 = final_mediabrowserserviceimplapi21;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
				remoteUserInfo = remoteuserinfo;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field MediaSessionManager$RemoteUserInfo val$remoteUserInfo>
				parentId = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field String val$parentId>
				options = Bundle.this;
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
		//    1    1:getfield        #35  <Field MediaBrowserServiceCompat this$0>
		//    2    4:getfield        #91  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//    3    7:new             #19  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$4>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:aload_2         
		//    8   14:aload_3         
		//    9   15:invokespecial   #94  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$4(MediaBrowserServiceCompat$MediaBrowserServiceImplApi21, MediaSessionManager$RemoteUserInfo, String, Bundle)>
		//   10   18:invokevirtual   #100 <Method boolean MediaBrowserServiceCompat$ServiceHandler.post(Runnable)>
		//   11   21:pop             
		//   12   22:return          
		}

		void notifyChildrenChangedForCompat(final String parentId, Bundle bundle)
		{
			mHandler.post(((_cls3) (bundle)). new Runnable() {

				public void run()
				{
					Object obj;
					for(Iterator iterator = mConnections.keySet().iterator(); iterator.hasNext(); notifyChildrenChangedForCompatOnHandler(((ConnectionRecord) (obj)), parentId, options))
				//*   0    0:aload_0         
				//*   1    1:getfield        #24  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
				//*   2    4:getfield        #37  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$MediaBrowserServiceImplApi21.this$0>
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
						obj = ((Object) ((ConnectionRecord)mConnections.get(obj)));
				//   14   38:aload_0         
				//   15   39:getfield        #24  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
				//   16   42:getfield        #37  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$MediaBrowserServiceImplApi21.this$0>
				//   17   45:getfield        #41  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
				//   18   48:aload_2         
				//   19   49:invokevirtual   #69  <Method Object ArrayMap.get(Object)>
				//   20   52:checkcast       #71  <Class MediaBrowserServiceCompat$ConnectionRecord>
				//   21   55:astore_2        
					}

				//   22   56:aload_0         
				//   23   57:getfield        #24  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
				//   24   60:aload_2         
				//   25   61:aload_0         
				//   26   62:getfield        #26  <Field String val$parentId>
				//   27   65:aload_0         
				//   28   66:getfield        #28  <Field Bundle val$options>
				//   29   69:invokevirtual   #75  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi21.notifyChildrenChangedForCompatOnHandler(MediaBrowserServiceCompat$ConnectionRecord, String, Bundle)>
				//*  30   72:goto            19
				//   31   75:return          
				}

				final MediaBrowserServiceImplApi21 this$1;
				final Bundle val$options;
				final String val$parentId;

			
			{
				this$1 = final_mediabrowserserviceimplapi21;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
				parentId = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field String val$parentId>
				options = Bundle.this;
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
		//    1    1:getfield        #35  <Field MediaBrowserServiceCompat this$0>
		//    2    4:getfield        #91  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//    3    7:new             #17  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$3>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:aload_2         
		//    8   14:invokespecial   #103 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$3(MediaBrowserServiceCompat$MediaBrowserServiceImplApi21, String, Bundle)>
		//    9   17:invokevirtual   #100 <Method boolean MediaBrowserServiceCompat$ServiceHandler.post(Runnable)>
		//   10   20:pop             
		//   11   21:return          
		}

		void notifyChildrenChangedForCompatOnHandler(ConnectionRecord connectionrecord, String s, Bundle bundle)
		{
			Object obj = ((Object) ((List)connectionrecord.subscriptions.get(((Object) (s)))));
		//    0    0:aload_1         
		//    1    1:getfield        #109 <Field HashMap MediaBrowserServiceCompat$ConnectionRecord.subscriptions>
		//    2    4:aload_2         
		//    3    5:invokevirtual   #115 <Method Object HashMap.get(Object)>
		//    4    8:checkcast       #117 <Class List>
		//    5   11:astore          4
			if(obj != null)
		//*   6   13:aload           4
		//*   7   15:ifnull          85
			{
				obj = ((Object) (((List) (obj)).iterator()));
		//    8   18:aload           4
		//    9   20:invokeinterface #121 <Method Iterator List.iterator()>
		//   10   25:astore          4
				do
				{
					if(!((Iterator) (obj)).hasNext())
						break;
		//   11   27:aload           4
		//   12   29:invokeinterface #127 <Method boolean Iterator.hasNext()>
		//   13   34:ifeq            85
					Pair pair = (Pair)((Iterator) (obj)).next();
		//   14   37:aload           4
		//   15   39:invokeinterface #131 <Method Object Iterator.next()>
		//   16   44:checkcast       #133 <Class Pair>
		//   17   47:astore          5
					if(MediaBrowserCompatUtils.hasDuplicatedItems(bundle, (Bundle)pair.second))
		//*  18   49:aload_3         
		//*  19   50:aload           5
		//*  20   52:getfield        #136 <Field Object Pair.second>
		//*  21   55:checkcast       #60  <Class Bundle>
		//*  22   58:invokestatic    #142 <Method boolean MediaBrowserCompatUtils.hasDuplicatedItems(Bundle, Bundle)>
		//*  23   61:ifeq            27
						performLoadChildren(s, connectionrecord, (Bundle)pair.second, bundle);
		//   24   64:aload_0         
		//   25   65:getfield        #35  <Field MediaBrowserServiceCompat this$0>
		//   26   68:aload_2         
		//   27   69:aload_1         
		//   28   70:aload           5
		//   29   72:getfield        #136 <Field Object Pair.second>
		//   30   75:checkcast       #60  <Class Bundle>
		//   31   78:aload_3         
		//   32   79:invokevirtual   #146 <Method void MediaBrowserServiceCompat.performLoadChildren(String, MediaBrowserServiceCompat$ConnectionRecord, Bundle, Bundle)>
				} while(true);
		//   33   82:goto            27
			}
		//   34   85:return          
		}

		void notifyChildrenChangedForFramework(String s, Bundle bundle)
		{
			MediaBrowserServiceCompatApi21.notifyChildrenChanged(mServiceObj, s);
		//    0    0:aload_0         
		//    1    1:getfield        #148 <Field Object mServiceObj>
		//    2    4:aload_1         
		//    3    5:invokestatic    #153 <Method void MediaBrowserServiceCompatApi21.notifyChildrenChanged(Object, String)>
		//    4    8:return          
		}

		public IBinder onBind(Intent intent)
		{
			return MediaBrowserServiceCompatApi21.onBind(mServiceObj, intent);
		//    0    0:aload_0         
		//    1    1:getfield        #148 <Field Object mServiceObj>
		//    2    4:aload_1         
		//    3    5:invokestatic    #158 <Method IBinder MediaBrowserServiceCompatApi21.onBind(Object, Intent)>
		//    4    8:areturn         
		}

		public void onCreate()
		{
			mServiceObj = MediaBrowserServiceCompatApi21.createService(((Context) (MediaBrowserServiceCompat.this)), ((MediaBrowserServiceCompatApi21.ServiceCompatProxy) (this)));
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field MediaBrowserServiceCompat this$0>
		//    3    5:aload_0         
		//    4    6:invokestatic    #163 <Method Object MediaBrowserServiceCompatApi21.createService(Context, MediaBrowserServiceCompatApi21$ServiceCompatProxy)>
		//    5    9:putfield        #148 <Field Object mServiceObj>
			MediaBrowserServiceCompatApi21.onCreate(mServiceObj);
		//    6   12:aload_0         
		//    7   13:getfield        #148 <Field Object mServiceObj>
		//    8   16:invokestatic    #166 <Method void MediaBrowserServiceCompatApi21.onCreate(Object)>
		//    9   19:return          
		}

		public MediaBrowserServiceCompatApi21.BrowserRoot onGetRoot(String s, int i, Bundle bundle)
		{
			Object obj;
			if(bundle != null && bundle.getInt("extra_client_version", 0) != 0)
		//*   0    0:aload_3         
		//*   1    1:ifnull          146
		//*   2    4:aload_3         
		//*   3    5:ldc1            #170 <String "extra_client_version">
		//*   4    7:iconst_0        
		//*   5    8:invokevirtual   #174 <Method int Bundle.getInt(String, int)>
		//*   6   11:ifeq            146
			{
				bundle.remove("extra_client_version");
		//    7   14:aload_3         
		//    8   15:ldc1            #170 <String "extra_client_version">
		//    9   17:invokevirtual   #177 <Method void Bundle.remove(String)>
				mMessenger = new Messenger(((Handler) (mHandler)));
		//   10   20:aload_0         
		//   11   21:new             #179 <Class Messenger>
		//   12   24:dup             
		//   13   25:aload_0         
		//   14   26:getfield        #35  <Field MediaBrowserServiceCompat this$0>
		//   15   29:getfield        #91  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//   16   32:invokespecial   #182 <Method void Messenger(Handler)>
		//   17   35:putfield        #48  <Field Messenger mMessenger>
				Bundle bundle1 = new Bundle();
		//   18   38:new             #60  <Class Bundle>
		//   19   41:dup             
		//   20   42:invokespecial   #183 <Method void Bundle()>
		//   21   45:astore          5
				bundle1.putInt("extra_service_version", 2);
		//   22   47:aload           5
		//   23   49:ldc1            #185 <String "extra_service_version">
		//   24   51:iconst_2        
		//   25   52:invokevirtual   #189 <Method void Bundle.putInt(String, int)>
				BundleCompat.putBinder(bundle1, "extra_messenger", mMessenger.getBinder());
		//   26   55:aload           5
		//   27   57:ldc1            #191 <String "extra_messenger">
		//   28   59:aload_0         
		//   29   60:getfield        #48  <Field Messenger mMessenger>
		//   30   63:invokevirtual   #195 <Method IBinder Messenger.getBinder()>
		//   31   66:invokestatic    #201 <Method void BundleCompat.putBinder(Bundle, String, IBinder)>
				if(mSession != null)
		//*  32   69:aload_0         
		//*  33   70:getfield        #35  <Field MediaBrowserServiceCompat this$0>
		//*  34   73:getfield        #205 <Field android.support.v4.media.session.MediaSessionCompat$Token MediaBrowserServiceCompat.mSession>
		//*  35   76:ifnull          127
				{
					obj = ((Object) (mSession.getExtraBinder()));
		//   36   79:aload_0         
		//   37   80:getfield        #35  <Field MediaBrowserServiceCompat this$0>
		//   38   83:getfield        #205 <Field android.support.v4.media.session.MediaSessionCompat$Token MediaBrowserServiceCompat.mSession>
		//   39   86:invokevirtual   #211 <Method IMediaSession android.support.v4.media.session.MediaSessionCompat$Token.getExtraBinder()>
		//   40   89:astore          4
					if(obj == null)
		//*  41   91:aload           4
		//*  42   93:ifnonnull       102
						obj = null;
		//   43   96:aconst_null     
		//   44   97:astore          4
					else
		//*  45   99:goto            111
						obj = ((Object) (((IMediaSession) (obj)).asBinder()));
		//   46  102:aload           4
		//   47  104:invokeinterface #216 <Method IBinder IMediaSession.asBinder()>
		//   48  109:astore          4
					BundleCompat.putBinder(bundle1, "extra_session_binder", ((IBinder) (obj)));
		//   49  111:aload           5
		//   50  113:ldc1            #218 <String "extra_session_binder">
		//   51  115:aload           4
		//   52  117:invokestatic    #201 <Method void BundleCompat.putBinder(Bundle, String, IBinder)>
					obj = ((Object) (bundle1));
		//   53  120:aload           5
		//   54  122:astore          4
				} else
		//*  55  124:goto            149
				{
					mRootExtrasList.add(((Object) (bundle1)));
		//   56  127:aload_0         
		//   57  128:getfield        #43  <Field List mRootExtrasList>
		//   58  131:aload           5
		//   59  133:invokeinterface #222 <Method boolean List.add(Object)>
		//   60  138:pop             
					obj = ((Object) (bundle1));
		//   61  139:aload           5
		//   62  141:astore          4
				}
			} else
		//*  63  143:goto            149
			{
				obj = null;
		//   64  146:aconst_null     
		//   65  147:astore          4
			}
			MediaBrowserServiceCompat mediabrowserservicecompat = MediaBrowserServiceCompat.this;
		//   66  149:aload_0         
		//   67  150:getfield        #35  <Field MediaBrowserServiceCompat this$0>
		//   68  153:astore          5
			mediabrowserservicecompat.mCurConnection = ((ConnectionRecord) (mediabrowserservicecompat)). new ConnectionRecord(s, -1, i, bundle, ((ServiceCallbacks) (null)));
		//   69  155:aload           5
		//   70  157:new             #54  <Class MediaBrowserServiceCompat$ConnectionRecord>
		//   71  160:dup             
		//   72  161:aload           5
		//   73  163:aload_1         
		//   74  164:iconst_m1       
		//   75  165:iload_2         
		//   76  166:aload_3         
		//   77  167:aconst_null     
		//   78  168:invokespecial   #225 <Method void MediaBrowserServiceCompat$ConnectionRecord(MediaBrowserServiceCompat, String, int, int, Bundle, MediaBrowserServiceCompat$ServiceCallbacks)>
		//   79  171:putfield        #52  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
			bundle = ((Bundle) (MediaBrowserServiceCompat.this.onGetRoot(s, i, bundle)));
		//   80  174:aload_0         
		//   81  175:getfield        #35  <Field MediaBrowserServiceCompat this$0>
		//   82  178:aload_1         
		//   83  179:iload_2         
		//   84  180:aload_3         
		//   85  181:invokevirtual   #228 <Method MediaBrowserServiceCompat$BrowserRoot MediaBrowserServiceCompat.onGetRoot(String, int, Bundle)>
		//   86  184:astore_3        
			mCurConnection = null;
		//   87  185:aload_0         
		//   88  186:getfield        #35  <Field MediaBrowserServiceCompat this$0>
		//   89  189:aconst_null     
		//   90  190:putfield        #52  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
			if(bundle == null)
		//*  91  193:aload_3         
		//*  92  194:ifnonnull       199
				return null;
		//   93  197:aconst_null     
		//   94  198:areturn         
			if(obj == null)
		//*  95  199:aload           4
		//*  96  201:ifnonnull       212
			{
				s = ((String) (((BrowserRoot) (bundle)).getExtras()));
		//   97  204:aload_3         
		//   98  205:invokevirtual   #233 <Method Bundle MediaBrowserServiceCompat$BrowserRoot.getExtras()>
		//   99  208:astore_1        
			} else
		//* 100  209:goto            234
			{
				s = ((String) (obj));
		//  101  212:aload           4
		//  102  214:astore_1        
				if(((BrowserRoot) (bundle)).getExtras() != null)
		//* 103  215:aload_3         
		//* 104  216:invokevirtual   #233 <Method Bundle MediaBrowserServiceCompat$BrowserRoot.getExtras()>
		//* 105  219:ifnull          234
				{
					((Bundle) (obj)).putAll(((BrowserRoot) (bundle)).getExtras());
		//  106  222:aload           4
		//  107  224:aload_3         
		//  108  225:invokevirtual   #233 <Method Bundle MediaBrowserServiceCompat$BrowserRoot.getExtras()>
		//  109  228:invokevirtual   #236 <Method void Bundle.putAll(Bundle)>
					s = ((String) (obj));
		//  110  231:aload           4
		//  111  233:astore_1        
				}
			}
			return new MediaBrowserServiceCompatApi21.BrowserRoot(((BrowserRoot) (bundle)).getRootId(), ((Bundle) (s)));
		//  112  234:new             #238 <Class MediaBrowserServiceCompatApi21$BrowserRoot>
		//  113  237:dup             
		//  114  238:aload_3         
		//  115  239:invokevirtual   #242 <Method String MediaBrowserServiceCompat$BrowserRoot.getRootId()>
		//  116  242:aload_1         
		//  117  243:invokespecial   #244 <Method void MediaBrowserServiceCompatApi21$BrowserRoot(String, Bundle)>
		//  118  246:areturn         
		}

		public void onLoadChildren(String s, MediaBrowserServiceCompatApi21.ResultWrapper resultwrapper)
		{
			resultwrapper = ((MediaBrowserServiceCompatApi21.ResultWrapper) (((_cls2) (s)). new Result(resultwrapper) {

				public void detach()
				{
					resultWrapper.detach();
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field MediaBrowserServiceCompatApi21$ResultWrapper val$resultWrapper>
				//    2    4:invokevirtual   #33  <Method void MediaBrowserServiceCompatApi21$ResultWrapper.detach()>
				//    3    7:return          
				}

				volatile void onResultSent(Object obj)
				{
					onResultSent((List)obj);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:checkcast       #36  <Class List>
				//    3    5:invokevirtual   #39  <Method void onResultSent(List)>
				//    4    8:return          
				}

				void onResultSent(List list)
				{
					if(list != null)
				//*   0    0:aload_1         
				//*   1    1:ifnull          64
					{
						ArrayList arraylist = new ArrayList();
				//    2    4:new             #41  <Class ArrayList>
				//    3    7:dup             
				//    4    8:invokespecial   #43  <Method void ArrayList()>
				//    5   11:astore_2        
						Iterator iterator = list.iterator();
				//    6   12:aload_1         
				//    7   13:invokeinterface #47  <Method Iterator List.iterator()>
				//    8   18:astore_3        
						do
						{
							list = ((List) (arraylist));
				//    9   19:aload_2         
				//   10   20:astore_1        
							if(!iterator.hasNext())
								break;
				//   11   21:aload_3         
				//   12   22:invokeinterface #53  <Method boolean Iterator.hasNext()>
				//   13   27:ifeq            66
							list = ((List) ((MediaBrowserCompat.MediaItem)iterator.next()));
				//   14   30:aload_3         
				//   15   31:invokeinterface #57  <Method Object Iterator.next()>
				//   16   36:checkcast       #59  <Class MediaBrowserCompat$MediaItem>
				//   17   39:astore_1        
							Parcel parcel = Parcel.obtain();
				//   18   40:invokestatic    #65  <Method Parcel Parcel.obtain()>
				//   19   43:astore          4
							((MediaBrowserCompat.MediaItem) (list)).writeToParcel(parcel, 0);
				//   20   45:aload_1         
				//   21   46:aload           4
				//   22   48:iconst_0        
				//   23   49:invokevirtual   #69  <Method void MediaBrowserCompat$MediaItem.writeToParcel(Parcel, int)>
							((List) (arraylist)).add(((Object) (parcel)));
				//   24   52:aload_2         
				//   25   53:aload           4
				//   26   55:invokeinterface #73  <Method boolean List.add(Object)>
				//   27   60:pop             
						} while(true);
				//   28   61:goto            19
					} else
					{
						list = null;
				//   29   64:aconst_null     
				//   30   65:astore_1        
					}
					resultWrapper.sendResult(((Object) (list)));
				//   31   66:aload_0         
				//   32   67:getfield        #23  <Field MediaBrowserServiceCompatApi21$ResultWrapper val$resultWrapper>
				//   33   70:aload_1         
				//   34   71:invokevirtual   #76  <Method void MediaBrowserServiceCompatApi21$ResultWrapper.sendResult(Object)>
				//   35   74:return          
				}

				final MediaBrowserServiceImplApi21 this$1;
				final MediaBrowserServiceCompatApi21.ResultWrapper val$resultWrapper;

			
			{
				this$1 = final_mediabrowserserviceimplapi21;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
				resultWrapper = resultwrapper;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #23  <Field MediaBrowserServiceCompatApi21$ResultWrapper val$resultWrapper>
				super(Object.this);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:invokespecial   #26  <Method void MediaBrowserServiceCompat$Result(Object)>
			//    9   15:return          
			}
			}
));
		//    0    0:new             #15  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$2>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #249 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$2(MediaBrowserServiceCompat$MediaBrowserServiceImplApi21, Object, MediaBrowserServiceCompatApi21$ResultWrapper)>
		//    6   10:astore_2        
			MediaBrowserServiceCompat.this.onLoadChildren(s, ((Result) (resultwrapper)));
		//    7   11:aload_0         
		//    8   12:getfield        #35  <Field MediaBrowserServiceCompat this$0>
		//    9   15:aload_1         
		//   10   16:aload_2         
		//   11   17:invokevirtual   #252 <Method void MediaBrowserServiceCompat.onLoadChildren(String, MediaBrowserServiceCompat$Result)>
		//   12   20:return          
		}

		public void setSessionToken(android.support.v4.media.session.MediaSessionCompat.Token token)
		{
			mHandler.postOrRun(((_cls1) (token)). new Runnable() {

				public void run()
				{
					if(!mRootExtrasList.isEmpty())
				//*   0    0:aload_0         
				//*   1    1:getfield        #22  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
				//*   2    4:getfield        #33  <Field List MediaBrowserServiceCompat$MediaBrowserServiceImplApi21.mRootExtrasList>
				//*   3    7:invokeinterface #39  <Method boolean List.isEmpty()>
				//*   4   12:ifne            84
					{
						IMediaSession imediasession = token.getExtraBinder();
				//    5   15:aload_0         
				//    6   16:getfield        #24  <Field android.support.v4.media.session.MediaSessionCompat$Token val$token>
				//    7   19:invokevirtual   #45  <Method IMediaSession android.support.v4.media.session.MediaSessionCompat$Token.getExtraBinder()>
				//    8   22:astore_1        
						if(imediasession != null)
				//*   9   23:aload_1         
				//*  10   24:ifnull          72
						{
							for(Iterator iterator = mRootExtrasList.iterator(); iterator.hasNext(); BundleCompat.putBinder((Bundle)iterator.next(), "extra_session_binder", imediasession.asBinder()));
				//   11   27:aload_0         
				//   12   28:getfield        #22  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
				//   13   31:getfield        #33  <Field List MediaBrowserServiceCompat$MediaBrowserServiceImplApi21.mRootExtrasList>
				//   14   34:invokeinterface #49  <Method Iterator List.iterator()>
				//   15   39:astore_2        
				//   16   40:aload_2         
				//   17   41:invokeinterface #54  <Method boolean Iterator.hasNext()>
				//   18   46:ifeq            72
				//   19   49:aload_2         
				//   20   50:invokeinterface #58  <Method Object Iterator.next()>
				//   21   55:checkcast       #60  <Class Bundle>
				//   22   58:ldc1            #62  <String "extra_session_binder">
				//   23   60:aload_1         
				//   24   61:invokeinterface #68  <Method IBinder IMediaSession.asBinder()>
				//   25   66:invokestatic    #74  <Method void BundleCompat.putBinder(Bundle, String, IBinder)>
						}
				//*  26   69:goto            40
						mRootExtrasList.clear();
				//   27   72:aload_0         
				//   28   73:getfield        #22  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
				//   29   76:getfield        #33  <Field List MediaBrowserServiceCompat$MediaBrowserServiceImplApi21.mRootExtrasList>
				//   30   79:invokeinterface #77  <Method void List.clear()>
					}
					MediaBrowserServiceCompatApi21.setSessionToken(mServiceObj, token.getToken());
				//   31   84:aload_0         
				//   32   85:getfield        #22  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
				//   33   88:getfield        #81  <Field Object MediaBrowserServiceCompat$MediaBrowserServiceImplApi21.mServiceObj>
				//   34   91:aload_0         
				//   35   92:getfield        #24  <Field android.support.v4.media.session.MediaSessionCompat$Token val$token>
				//   36   95:invokevirtual   #84  <Method Object android.support.v4.media.session.MediaSessionCompat$Token.getToken()>
				//   37   98:invokestatic    #89  <Method void MediaBrowserServiceCompatApi21.setSessionToken(Object, Object)>
				//   38  101:return          
				}

				final MediaBrowserServiceImplApi21 this$1;
				final android.support.v4.media.session.MediaSessionCompat.Token val$token;

			
			{
				this$1 = final_mediabrowserserviceimplapi21;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
				token = android.support.v4.media.session.MediaSessionCompat.Token.this;
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
		//    1    1:getfield        #35  <Field MediaBrowserServiceCompat this$0>
		//    2    4:getfield        #91  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//    3    7:new             #13  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$1>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:invokespecial   #259 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$1(MediaBrowserServiceCompat$MediaBrowserServiceImplApi21, android.support.v4.media.session.MediaSessionCompat$Token)>
		//    8   16:invokevirtual   #263 <Method void MediaBrowserServiceCompat$ServiceHandler.postOrRun(Runnable)>
		//    9   19:return          
		}

		Messenger mMessenger;
		final List mRootExtrasList = new ArrayList();
		Object mServiceObj;
		final MediaBrowserServiceCompat this$0;

		MediaBrowserServiceImplApi21()
		{
			this$0 = MediaBrowserServiceCompat.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #35  <Field MediaBrowserServiceCompat this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #38  <Method void Object()>
		//    5    9:aload_0         
		//    6   10:new             #40  <Class ArrayList>
		//    7   13:dup             
		//    8   14:invokespecial   #41  <Method void ArrayList()>
		//    9   17:putfield        #43  <Field List mRootExtrasList>
		//   10   20:return          
		}
	}

	class MediaBrowserServiceImplApi23 extends MediaBrowserServiceImplApi21
		implements MediaBrowserServiceCompatApi23.ServiceCompatProxy
	{

		public void onCreate()
		{
			mServiceObj = MediaBrowserServiceCompatApi23.createService(((Context) (MediaBrowserServiceCompat.this)), ((MediaBrowserServiceCompatApi23.ServiceCompatProxy) (this)));
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #20  <Field MediaBrowserServiceCompat this$0>
		//    3    5:aload_0         
		//    4    6:invokestatic    #31  <Method Object MediaBrowserServiceCompatApi23.createService(Context, MediaBrowserServiceCompatApi23$ServiceCompatProxy)>
		//    5    9:putfield        #35  <Field Object mServiceObj>
			MediaBrowserServiceCompatApi21.onCreate(mServiceObj);
		//    6   12:aload_0         
		//    7   13:getfield        #35  <Field Object mServiceObj>
		//    8   16:invokestatic    #40  <Method void MediaBrowserServiceCompatApi21.onCreate(Object)>
		//    9   19:return          
		}

		public void onLoadItem(String s, MediaBrowserServiceCompatApi21.ResultWrapper resultwrapper)
		{
			resultwrapper = ((MediaBrowserServiceCompatApi21.ResultWrapper) (((_cls1) (s)). new Result(resultwrapper) {

				public void detach()
				{
					resultWrapper.detach();
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field MediaBrowserServiceCompatApi21$ResultWrapper val$resultWrapper>
				//    2    4:invokevirtual   #33  <Method void MediaBrowserServiceCompatApi21$ResultWrapper.detach()>
				//    3    7:return          
				}

				void onResultSent(MediaBrowserCompat.MediaItem mediaitem)
				{
					if(mediaitem == null)
				//*   0    0:aload_1         
				//*   1    1:ifnonnull       13
					{
						resultWrapper.sendResult(((Object) (null)));
				//    2    4:aload_0         
				//    3    5:getfield        #23  <Field MediaBrowserServiceCompatApi21$ResultWrapper val$resultWrapper>
				//    4    8:aconst_null     
				//    5    9:invokevirtual   #38  <Method void MediaBrowserServiceCompatApi21$ResultWrapper.sendResult(Object)>
						return;
				//    6   12:return          
					} else
					{
						Parcel parcel = Parcel.obtain();
				//    7   13:invokestatic    #44  <Method Parcel Parcel.obtain()>
				//    8   16:astore_2        
						mediaitem.writeToParcel(parcel, 0);
				//    9   17:aload_1         
				//   10   18:aload_2         
				//   11   19:iconst_0        
				//   12   20:invokevirtual   #50  <Method void MediaBrowserCompat$MediaItem.writeToParcel(Parcel, int)>
						resultWrapper.sendResult(((Object) (parcel)));
				//   13   23:aload_0         
				//   14   24:getfield        #23  <Field MediaBrowserServiceCompatApi21$ResultWrapper val$resultWrapper>
				//   15   27:aload_2         
				//   16   28:invokevirtual   #38  <Method void MediaBrowserServiceCompatApi21$ResultWrapper.sendResult(Object)>
						return;
				//   17   31:return          
					}
				}

				volatile void onResultSent(Object obj)
				{
					onResultSent((MediaBrowserCompat.MediaItem)obj);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:checkcast       #46  <Class MediaBrowserCompat$MediaItem>
				//    3    5:invokevirtual   #52  <Method void onResultSent(MediaBrowserCompat$MediaItem)>
				//    4    8:return          
				}

				final MediaBrowserServiceImplApi23 this$1;
				final MediaBrowserServiceCompatApi21.ResultWrapper val$resultWrapper;

			
			{
				this$1 = final_mediabrowserserviceimplapi23;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi23 this$1>
				resultWrapper = resultwrapper;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #23  <Field MediaBrowserServiceCompatApi21$ResultWrapper val$resultWrapper>
				super(Object.this);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:invokespecial   #26  <Method void MediaBrowserServiceCompat$Result(Object)>
			//    9   15:return          
			}
			}
));
		//    0    0:new             #11  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$1>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #45  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$1(MediaBrowserServiceCompat$MediaBrowserServiceImplApi23, Object, MediaBrowserServiceCompatApi21$ResultWrapper)>
		//    6   10:astore_2        
			MediaBrowserServiceCompat.this.onLoadItem(s, ((Result) (resultwrapper)));
		//    7   11:aload_0         
		//    8   12:getfield        #20  <Field MediaBrowserServiceCompat this$0>
		//    9   15:aload_1         
		//   10   16:aload_2         
		//   11   17:invokevirtual   #48  <Method void MediaBrowserServiceCompat.onLoadItem(String, MediaBrowserServiceCompat$Result)>
		//   12   20:return          
		}

		final MediaBrowserServiceCompat this$0;

		MediaBrowserServiceImplApi23()
		{
			this$0 = MediaBrowserServiceCompat.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #20  <Field MediaBrowserServiceCompat this$0>
			super();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #22  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi21(MediaBrowserServiceCompat)>
		//    6   10:return          
		}
	}

	class MediaBrowserServiceImplApi26 extends MediaBrowserServiceImplApi23
		implements MediaBrowserServiceCompatApi26.ServiceCompatProxy
	{

		public Bundle getBrowserRootHints()
		{
			if(mCurConnection != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #20  <Field MediaBrowserServiceCompat this$0>
		//*   2    4:getfield        #29  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
		//*   3    7:ifnull          43
			{
				if(mCurConnection.rootHints == null)
		//*   4   10:aload_0         
		//*   5   11:getfield        #20  <Field MediaBrowserServiceCompat this$0>
		//*   6   14:getfield        #29  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
		//*   7   17:getfield        #35  <Field Bundle MediaBrowserServiceCompat$ConnectionRecord.rootHints>
		//*   8   20:ifnonnull       25
					return null;
		//    9   23:aconst_null     
		//   10   24:areturn         
				else
					return new Bundle(mCurConnection.rootHints);
		//   11   25:new             #37  <Class Bundle>
		//   12   28:dup             
		//   13   29:aload_0         
		//   14   30:getfield        #20  <Field MediaBrowserServiceCompat this$0>
		//   15   33:getfield        #29  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
		//   16   36:getfield        #35  <Field Bundle MediaBrowserServiceCompat$ConnectionRecord.rootHints>
		//   17   39:invokespecial   #40  <Method void Bundle(Bundle)>
		//   18   42:areturn         
			} else
			{
				return MediaBrowserServiceCompatApi26.getBrowserRootHints(mServiceObj);
		//   19   43:aload_0         
		//   20   44:getfield        #44  <Field Object mServiceObj>
		//   21   47:invokestatic    #49  <Method Bundle MediaBrowserServiceCompatApi26.getBrowserRootHints(Object)>
		//   22   50:areturn         
			}
		}

		void notifyChildrenChangedForFramework(String s, Bundle bundle)
		{
			if(bundle != null)
		//*   0    0:aload_2         
		//*   1    1:ifnull          14
			{
				MediaBrowserServiceCompatApi26.notifyChildrenChanged(mServiceObj, s, bundle);
		//    2    4:aload_0         
		//    3    5:getfield        #44  <Field Object mServiceObj>
		//    4    8:aload_1         
		//    5    9:aload_2         
		//    6   10:invokestatic    #55  <Method void MediaBrowserServiceCompatApi26.notifyChildrenChanged(Object, String, Bundle)>
				return;
		//    7   13:return          
			} else
			{
				super.notifyChildrenChangedForFramework(s, bundle);
		//    8   14:aload_0         
		//    9   15:aload_1         
		//   10   16:aload_2         
		//   11   17:invokespecial   #57  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi23.notifyChildrenChangedForFramework(String, Bundle)>
				return;
		//   12   20:return          
			}
		}

		public void onCreate()
		{
			mServiceObj = MediaBrowserServiceCompatApi26.createService(((Context) (MediaBrowserServiceCompat.this)), ((MediaBrowserServiceCompatApi26.ServiceCompatProxy) (this)));
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #20  <Field MediaBrowserServiceCompat this$0>
		//    3    5:aload_0         
		//    4    6:invokestatic    #63  <Method Object MediaBrowserServiceCompatApi26.createService(Context, MediaBrowserServiceCompatApi26$ServiceCompatProxy)>
		//    5    9:putfield        #44  <Field Object mServiceObj>
			MediaBrowserServiceCompatApi21.onCreate(mServiceObj);
		//    6   12:aload_0         
		//    7   13:getfield        #44  <Field Object mServiceObj>
		//    8   16:invokestatic    #68  <Method void MediaBrowserServiceCompatApi21.onCreate(Object)>
		//    9   19:return          
		}

		public void onLoadChildren(String s, MediaBrowserServiceCompatApi26.ResultWrapper resultwrapper, Bundle bundle)
		{
			resultwrapper = ((MediaBrowserServiceCompatApi26.ResultWrapper) (((_cls1) (s)). new Result(resultwrapper) {

				public void detach()
				{
					resultWrapper.detach();
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field MediaBrowserServiceCompatApi26$ResultWrapper val$resultWrapper>
				//    2    4:invokevirtual   #33  <Method void MediaBrowserServiceCompatApi26$ResultWrapper.detach()>
				//    3    7:return          
				}

				volatile void onResultSent(Object obj)
				{
					onResultSent((List)obj);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:checkcast       #36  <Class List>
				//    3    5:invokevirtual   #39  <Method void onResultSent(List)>
				//    4    8:return          
				}

				void onResultSent(List list)
				{
					if(list != null)
				//*   0    0:aload_1         
				//*   1    1:ifnull          64
					{
						ArrayList arraylist = new ArrayList();
				//    2    4:new             #41  <Class ArrayList>
				//    3    7:dup             
				//    4    8:invokespecial   #43  <Method void ArrayList()>
				//    5   11:astore_2        
						Iterator iterator = list.iterator();
				//    6   12:aload_1         
				//    7   13:invokeinterface #47  <Method Iterator List.iterator()>
				//    8   18:astore_3        
						do
						{
							list = ((List) (arraylist));
				//    9   19:aload_2         
				//   10   20:astore_1        
							if(!iterator.hasNext())
								break;
				//   11   21:aload_3         
				//   12   22:invokeinterface #53  <Method boolean Iterator.hasNext()>
				//   13   27:ifeq            66
							list = ((List) ((MediaBrowserCompat.MediaItem)iterator.next()));
				//   14   30:aload_3         
				//   15   31:invokeinterface #57  <Method Object Iterator.next()>
				//   16   36:checkcast       #59  <Class MediaBrowserCompat$MediaItem>
				//   17   39:astore_1        
							Parcel parcel = Parcel.obtain();
				//   18   40:invokestatic    #65  <Method Parcel Parcel.obtain()>
				//   19   43:astore          4
							((MediaBrowserCompat.MediaItem) (list)).writeToParcel(parcel, 0);
				//   20   45:aload_1         
				//   21   46:aload           4
				//   22   48:iconst_0        
				//   23   49:invokevirtual   #69  <Method void MediaBrowserCompat$MediaItem.writeToParcel(Parcel, int)>
							((List) (arraylist)).add(((Object) (parcel)));
				//   24   52:aload_2         
				//   25   53:aload           4
				//   26   55:invokeinterface #73  <Method boolean List.add(Object)>
				//   27   60:pop             
						} while(true);
				//   28   61:goto            19
					} else
					{
						list = null;
				//   29   64:aconst_null     
				//   30   65:astore_1        
					}
					resultWrapper.sendResult(list, getFlags());
				//   31   66:aload_0         
				//   32   67:getfield        #23  <Field MediaBrowserServiceCompatApi26$ResultWrapper val$resultWrapper>
				//   33   70:aload_1         
				//   34   71:aload_0         
				//   35   72:invokevirtual   #77  <Method int getFlags()>
				//   36   75:invokevirtual   #81  <Method void MediaBrowserServiceCompatApi26$ResultWrapper.sendResult(List, int)>
				//   37   78:return          
				}

				final MediaBrowserServiceImplApi26 this$1;
				final MediaBrowserServiceCompatApi26.ResultWrapper val$resultWrapper;

			
			{
				this$1 = final_mediabrowserserviceimplapi26;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi26 this$1>
				resultWrapper = resultwrapper;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #23  <Field MediaBrowserServiceCompatApi26$ResultWrapper val$resultWrapper>
				super(Object.this);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:invokespecial   #26  <Method void MediaBrowserServiceCompat$Result(Object)>
			//    9   15:return          
			}
			}
));
		//    0    0:new             #11  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$1>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #73  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi26$1(MediaBrowserServiceCompat$MediaBrowserServiceImplApi26, Object, MediaBrowserServiceCompatApi26$ResultWrapper)>
		//    6   10:astore_2        
			MediaBrowserServiceCompat.this.onLoadChildren(s, ((Result) (resultwrapper)), bundle);
		//    7   11:aload_0         
		//    8   12:getfield        #20  <Field MediaBrowserServiceCompat this$0>
		//    9   15:aload_1         
		//   10   16:aload_2         
		//   11   17:aload_3         
		//   12   18:invokevirtual   #76  <Method void MediaBrowserServiceCompat.onLoadChildren(String, MediaBrowserServiceCompat$Result, Bundle)>
		//   13   21:return          
		}

		final MediaBrowserServiceCompat this$0;

		MediaBrowserServiceImplApi26()
		{
			this$0 = MediaBrowserServiceCompat.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #20  <Field MediaBrowserServiceCompat this$0>
			super();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #22  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi23(MediaBrowserServiceCompat)>
		//    6   10:return          
		}
	}

	class MediaBrowserServiceImplApi28 extends MediaBrowserServiceImplApi26
	{

		public MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo()
		{
			if(mCurConnection != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #16  <Field MediaBrowserServiceCompat this$0>
		//*   2    4:getfield        #25  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
		//*   3    7:ifnull          21
				return mCurConnection.browserInfo;
		//    4   10:aload_0         
		//    5   11:getfield        #16  <Field MediaBrowserServiceCompat this$0>
		//    6   14:getfield        #25  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
		//    7   17:getfield        #31  <Field MediaSessionManager$RemoteUserInfo MediaBrowserServiceCompat$ConnectionRecord.browserInfo>
		//    8   20:areturn         
			else
				return new MediaSessionManager.RemoteUserInfo(((MediaBrowserService)mServiceObj).getCurrentBrowserInfo());
		//    9   21:new             #33  <Class MediaSessionManager$RemoteUserInfo>
		//   10   24:dup             
		//   11   25:aload_0         
		//   12   26:getfield        #37  <Field Object mServiceObj>
		//   13   29:checkcast       #39  <Class MediaBrowserService>
		//   14   32:invokevirtual   #42  <Method android.media.session.MediaSessionManager$RemoteUserInfo MediaBrowserService.getCurrentBrowserInfo()>
		//   15   35:invokespecial   #45  <Method void MediaSessionManager$RemoteUserInfo(android.media.session.MediaSessionManager$RemoteUserInfo)>
		//   16   38:areturn         
		}

		final MediaBrowserServiceCompat this$0;

		MediaBrowserServiceImplApi28()
		{
			this$0 = MediaBrowserServiceCompat.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field MediaBrowserServiceCompat this$0>
			super();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #18  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi26(MediaBrowserServiceCompat)>
		//    6   10:return          
		}
	}

	class MediaBrowserServiceImplBase
		implements MediaBrowserServiceImpl
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

		public void notifyChildrenChanged(final MediaSessionManager.RemoteUserInfo remoteUserInfo, final String parentId, Bundle bundle)
		{
			mHandler.post(((_cls3) (bundle)). new Runnable() {

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
						ConnectionRecord connectionrecord = (ConnectionRecord)mConnections.valueAt(i);
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

				final MediaBrowserServiceImplBase this$1;
				final Bundle val$options;
				final String val$parentId;
				final MediaSessionManager.RemoteUserInfo val$remoteUserInfo;

			
			{
				this$1 = final_mediabrowserserviceimplbase;
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
				options = Bundle.this;
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

		public void notifyChildrenChanged(final String parentId, Bundle bundle)
		{
			mHandler.post(((_cls2) (bundle)). new Runnable() {

				public void run()
				{
					Object obj;
					for(Iterator iterator = mConnections.keySet().iterator(); iterator.hasNext(); notifyChildrenChangedOnHandler(((ConnectionRecord) (obj)), parentId, options))
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
						obj = ((Object) ((ConnectionRecord)mConnections.get(obj)));
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

				final MediaBrowserServiceImplBase this$1;
				final Bundle val$options;
				final String val$parentId;

			
			{
				this$1 = final_mediabrowserserviceimplbase;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplBase this$1>
				parentId = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field String val$parentId>
				options = Bundle.this;
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

		void notifyChildrenChangedOnHandler(ConnectionRecord connectionrecord, String s, Bundle bundle)
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
			mMessenger = new Messenger(((Handler) (mHandler)));
		//    0    0:aload_0         
		//    1    1:new             #142 <Class Messenger>
		//    2    4:dup             
		//    3    5:aload_0         
		//    4    6:getfield        #23  <Field MediaBrowserServiceCompat this$0>
		//    5    9:getfield        #64  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//    6   12:invokespecial   #150 <Method void Messenger(Handler)>
		//    7   15:putfield        #140 <Field Messenger mMessenger>
		//    8   18:return          
		}

		public void setSessionToken(android.support.v4.media.session.MediaSessionCompat.Token token)
		{
			mHandler.post(((_cls1) (token)). new Runnable() {

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
						ConnectionRecord connectionrecord = (ConnectionRecord)iterator.next();
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

				final MediaBrowserServiceImplBase this$1;
				final android.support.v4.media.session.MediaSessionCompat.Token val$token;

			
			{
				this$1 = final_mediabrowserserviceimplbase;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplBase this$1>
				token = android.support.v4.media.session.MediaSessionCompat.Token.this;
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

		MediaBrowserServiceImplBase()
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

	public static class Result
	{

		private void checkExtraFields(Bundle bundle)
		{
			if(bundle == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       5
				return;
		//    2    4:return          
			if(bundle.containsKey("android.media.browse.extra.DOWNLOAD_PROGRESS"))
		//*   3    5:aload_1         
		//*   4    6:ldc1            #29  <String "android.media.browse.extra.DOWNLOAD_PROGRESS">
		//*   5    8:invokevirtual   #35  <Method boolean Bundle.containsKey(String)>
		//*   6   11:ifeq            46
			{
				float f = bundle.getFloat("android.media.browse.extra.DOWNLOAD_PROGRESS");
		//    7   14:aload_1         
		//    8   15:ldc1            #29  <String "android.media.browse.extra.DOWNLOAD_PROGRESS">
		//    9   17:invokevirtual   #39  <Method float Bundle.getFloat(String)>
		//   10   20:fstore_2        
				if(f >= -1E-05F && f <= 1.00001F)
		//*  11   21:fload_2         
		//*  12   22:ldc1            #40  <Float -1E-05F>
		//*  13   24:fcmpg           
		//*  14   25:iflt            36
		//*  15   28:fload_2         
		//*  16   29:ldc1            #41  <Float 1.00001F>
		//*  17   31:fcmpl           
		//*  18   32:ifgt            36
					return;
		//   19   35:return          
				else
					throw new IllegalArgumentException("The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0].");
		//   20   36:new             #43  <Class IllegalArgumentException>
		//   21   39:dup             
		//   22   40:ldc1            #45  <String "The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0].">
		//   23   42:invokespecial   #48  <Method void IllegalArgumentException(String)>
		//   24   45:athrow          
			} else
			{
				return;
		//   25   46:return          
			}
		}

		public void detach()
		{
			if(!mDetachCalled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #51  <Field boolean mDetachCalled>
		//*   2    4:ifne            99
			{
				if(!mSendResultCalled)
		//*   3    7:aload_0         
		//*   4    8:getfield        #53  <Field boolean mSendResultCalled>
		//*   5   11:ifne            63
				{
					if(!mSendErrorCalled)
		//*   6   14:aload_0         
		//*   7   15:getfield        #55  <Field boolean mSendErrorCalled>
		//*   8   18:ifne            27
					{
						mDetachCalled = true;
		//    9   21:aload_0         
		//   10   22:iconst_1        
		//   11   23:putfield        #51  <Field boolean mDetachCalled>
						return;
		//   12   26:return          
					} else
					{
						StringBuilder stringbuilder = new StringBuilder();
		//   13   27:new             #57  <Class StringBuilder>
		//   14   30:dup             
		//   15   31:invokespecial   #58  <Method void StringBuilder()>
		//   16   34:astore_1        
						stringbuilder.append("detach() called when sendError() had already been called for: ");
		//   17   35:aload_1         
		//   18   36:ldc1            #60  <String "detach() called when sendError() had already been called for: ">
		//   19   38:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//   20   41:pop             
						stringbuilder.append(mDebug);
		//   21   42:aload_1         
		//   22   43:aload_0         
		//   23   44:getfield        #24  <Field Object mDebug>
		//   24   47:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
		//   25   50:pop             
						throw new IllegalStateException(stringbuilder.toString());
		//   26   51:new             #69  <Class IllegalStateException>
		//   27   54:dup             
		//   28   55:aload_1         
		//   29   56:invokevirtual   #73  <Method String StringBuilder.toString()>
		//   30   59:invokespecial   #74  <Method void IllegalStateException(String)>
		//   31   62:athrow          
					}
				} else
				{
					StringBuilder stringbuilder1 = new StringBuilder();
		//   32   63:new             #57  <Class StringBuilder>
		//   33   66:dup             
		//   34   67:invokespecial   #58  <Method void StringBuilder()>
		//   35   70:astore_1        
					stringbuilder1.append("detach() called when sendResult() had already been called for: ");
		//   36   71:aload_1         
		//   37   72:ldc1            #76  <String "detach() called when sendResult() had already been called for: ">
		//   38   74:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//   39   77:pop             
					stringbuilder1.append(mDebug);
		//   40   78:aload_1         
		//   41   79:aload_0         
		//   42   80:getfield        #24  <Field Object mDebug>
		//   43   83:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
		//   44   86:pop             
					throw new IllegalStateException(stringbuilder1.toString());
		//   45   87:new             #69  <Class IllegalStateException>
		//   46   90:dup             
		//   47   91:aload_1         
		//   48   92:invokevirtual   #73  <Method String StringBuilder.toString()>
		//   49   95:invokespecial   #74  <Method void IllegalStateException(String)>
		//   50   98:athrow          
				}
			} else
			{
				StringBuilder stringbuilder2 = new StringBuilder();
		//   51   99:new             #57  <Class StringBuilder>
		//   52  102:dup             
		//   53  103:invokespecial   #58  <Method void StringBuilder()>
		//   54  106:astore_1        
				stringbuilder2.append("detach() called when detach() had already been called for: ");
		//   55  107:aload_1         
		//   56  108:ldc1            #78  <String "detach() called when detach() had already been called for: ">
		//   57  110:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//   58  113:pop             
				stringbuilder2.append(mDebug);
		//   59  114:aload_1         
		//   60  115:aload_0         
		//   61  116:getfield        #24  <Field Object mDebug>
		//   62  119:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
		//   63  122:pop             
				throw new IllegalStateException(stringbuilder2.toString());
		//   64  123:new             #69  <Class IllegalStateException>
		//   65  126:dup             
		//   66  127:aload_1         
		//   67  128:invokevirtual   #73  <Method String StringBuilder.toString()>
		//   68  131:invokespecial   #74  <Method void IllegalStateException(String)>
		//   69  134:athrow          
			}
		}

		int getFlags()
		{
			return mFlags;
		//    0    0:aload_0         
		//    1    1:getfield        #82  <Field int mFlags>
		//    2    4:ireturn         
		}

		boolean isDone()
		{
			return mDetachCalled || mSendResultCalled || mSendErrorCalled;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field boolean mDetachCalled>
		//    2    4:ifne            26
		//    3    7:aload_0         
		//    4    8:getfield        #53  <Field boolean mSendResultCalled>
		//    5   11:ifne            26
		//    6   14:aload_0         
		//    7   15:getfield        #55  <Field boolean mSendErrorCalled>
		//    8   18:ifeq            24
		//    9   21:goto            26
		//   10   24:iconst_0        
		//   11   25:ireturn         
		//   12   26:iconst_1        
		//   13   27:ireturn         
		}

		void onErrorSent(Bundle bundle)
		{
			bundle = ((Bundle) (new StringBuilder()));
		//    0    0:new             #57  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #58  <Method void StringBuilder()>
		//    3    7:astore_1        
			((StringBuilder) (bundle)).append("It is not supported to send an error for ");
		//    4    8:aload_1         
		//    5    9:ldc1            #87  <String "It is not supported to send an error for ">
		//    6   11:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			((StringBuilder) (bundle)).append(mDebug);
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:getfield        #24  <Field Object mDebug>
		//   11   20:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
		//   12   23:pop             
			throw new UnsupportedOperationException(((StringBuilder) (bundle)).toString());
		//   13   24:new             #89  <Class UnsupportedOperationException>
		//   14   27:dup             
		//   15   28:aload_1         
		//   16   29:invokevirtual   #73  <Method String StringBuilder.toString()>
		//   17   32:invokespecial   #90  <Method void UnsupportedOperationException(String)>
		//   18   35:athrow          
		}

		void onProgressUpdateSent(Bundle bundle)
		{
			bundle = ((Bundle) (new StringBuilder()));
		//    0    0:new             #57  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #58  <Method void StringBuilder()>
		//    3    7:astore_1        
			((StringBuilder) (bundle)).append("It is not supported to send an interim update for ");
		//    4    8:aload_1         
		//    5    9:ldc1            #93  <String "It is not supported to send an interim update for ">
		//    6   11:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			((StringBuilder) (bundle)).append(mDebug);
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:getfield        #24  <Field Object mDebug>
		//   11   20:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
		//   12   23:pop             
			throw new UnsupportedOperationException(((StringBuilder) (bundle)).toString());
		//   13   24:new             #89  <Class UnsupportedOperationException>
		//   14   27:dup             
		//   15   28:aload_1         
		//   16   29:invokevirtual   #73  <Method String StringBuilder.toString()>
		//   17   32:invokespecial   #90  <Method void UnsupportedOperationException(String)>
		//   18   35:athrow          
		}

		void onResultSent(Object obj)
		{
		//    0    0:return          
		}

		public void sendError(Bundle bundle)
		{
			if(!mSendResultCalled && !mSendErrorCalled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #53  <Field boolean mSendResultCalled>
		//*   2    4:ifne            25
		//*   3    7:aload_0         
		//*   4    8:getfield        #55  <Field boolean mSendErrorCalled>
		//*   5   11:ifne            25
			{
				mSendErrorCalled = true;
		//    6   14:aload_0         
		//    7   15:iconst_1        
		//    8   16:putfield        #55  <Field boolean mSendErrorCalled>
				onErrorSent(bundle);
		//    9   19:aload_0         
		//   10   20:aload_1         
		//   11   21:invokevirtual   #99  <Method void onErrorSent(Bundle)>
				return;
		//   12   24:return          
			} else
			{
				bundle = ((Bundle) (new StringBuilder()));
		//   13   25:new             #57  <Class StringBuilder>
		//   14   28:dup             
		//   15   29:invokespecial   #58  <Method void StringBuilder()>
		//   16   32:astore_1        
				((StringBuilder) (bundle)).append("sendError() called when either sendResult() or sendError() had already been called for: ");
		//   17   33:aload_1         
		//   18   34:ldc1            #101 <String "sendError() called when either sendResult() or sendError() had already been called for: ">
		//   19   36:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//   20   39:pop             
				((StringBuilder) (bundle)).append(mDebug);
		//   21   40:aload_1         
		//   22   41:aload_0         
		//   23   42:getfield        #24  <Field Object mDebug>
		//   24   45:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
		//   25   48:pop             
				throw new IllegalStateException(((StringBuilder) (bundle)).toString());
		//   26   49:new             #69  <Class IllegalStateException>
		//   27   52:dup             
		//   28   53:aload_1         
		//   29   54:invokevirtual   #73  <Method String StringBuilder.toString()>
		//   30   57:invokespecial   #74  <Method void IllegalStateException(String)>
		//   31   60:athrow          
			}
		}

		public void sendProgressUpdate(Bundle bundle)
		{
			if(!mSendResultCalled && !mSendErrorCalled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #53  <Field boolean mSendResultCalled>
		//*   2    4:ifne            30
		//*   3    7:aload_0         
		//*   4    8:getfield        #55  <Field boolean mSendErrorCalled>
		//*   5   11:ifne            30
			{
				checkExtraFields(bundle);
		//    6   14:aload_0         
		//    7   15:aload_1         
		//    8   16:invokespecial   #104 <Method void checkExtraFields(Bundle)>
				mSendProgressUpdateCalled = true;
		//    9   19:aload_0         
		//   10   20:iconst_1        
		//   11   21:putfield        #106 <Field boolean mSendProgressUpdateCalled>
				onProgressUpdateSent(bundle);
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:invokevirtual   #108 <Method void onProgressUpdateSent(Bundle)>
				return;
		//   15   29:return          
			} else
			{
				bundle = ((Bundle) (new StringBuilder()));
		//   16   30:new             #57  <Class StringBuilder>
		//   17   33:dup             
		//   18   34:invokespecial   #58  <Method void StringBuilder()>
		//   19   37:astore_1        
				((StringBuilder) (bundle)).append("sendProgressUpdate() called when either sendResult() or sendError() had already been called for: ");
		//   20   38:aload_1         
		//   21   39:ldc1            #110 <String "sendProgressUpdate() called when either sendResult() or sendError() had already been called for: ">
		//   22   41:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//   23   44:pop             
				((StringBuilder) (bundle)).append(mDebug);
		//   24   45:aload_1         
		//   25   46:aload_0         
		//   26   47:getfield        #24  <Field Object mDebug>
		//   27   50:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
		//   28   53:pop             
				throw new IllegalStateException(((StringBuilder) (bundle)).toString());
		//   29   54:new             #69  <Class IllegalStateException>
		//   30   57:dup             
		//   31   58:aload_1         
		//   32   59:invokevirtual   #73  <Method String StringBuilder.toString()>
		//   33   62:invokespecial   #74  <Method void IllegalStateException(String)>
		//   34   65:athrow          
			}
		}

		public void sendResult(Object obj)
		{
			if(!mSendResultCalled && !mSendErrorCalled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #53  <Field boolean mSendResultCalled>
		//*   2    4:ifne            25
		//*   3    7:aload_0         
		//*   4    8:getfield        #55  <Field boolean mSendErrorCalled>
		//*   5   11:ifne            25
			{
				mSendResultCalled = true;
		//    6   14:aload_0         
		//    7   15:iconst_1        
		//    8   16:putfield        #53  <Field boolean mSendResultCalled>
				onResultSent(obj);
		//    9   19:aload_0         
		//   10   20:aload_1         
		//   11   21:invokevirtual   #113 <Method void onResultSent(Object)>
				return;
		//   12   24:return          
			} else
			{
				obj = ((Object) (new StringBuilder()));
		//   13   25:new             #57  <Class StringBuilder>
		//   14   28:dup             
		//   15   29:invokespecial   #58  <Method void StringBuilder()>
		//   16   32:astore_1        
				((StringBuilder) (obj)).append("sendResult() called when either sendResult() or sendError() had already been called for: ");
		//   17   33:aload_1         
		//   18   34:ldc1            #115 <String "sendResult() called when either sendResult() or sendError() had already been called for: ">
		//   19   36:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//   20   39:pop             
				((StringBuilder) (obj)).append(mDebug);
		//   21   40:aload_1         
		//   22   41:aload_0         
		//   23   42:getfield        #24  <Field Object mDebug>
		//   24   45:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
		//   25   48:pop             
				throw new IllegalStateException(((StringBuilder) (obj)).toString());
		//   26   49:new             #69  <Class IllegalStateException>
		//   27   52:dup             
		//   28   53:aload_1         
		//   29   54:invokevirtual   #73  <Method String StringBuilder.toString()>
		//   30   57:invokespecial   #74  <Method void IllegalStateException(String)>
		//   31   60:athrow          
			}
		}

		void setFlags(int i)
		{
			mFlags = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #82  <Field int mFlags>
		//    3    5:return          
		}

		private final Object mDebug;
		private boolean mDetachCalled;
		private int mFlags;
		private boolean mSendErrorCalled;
		private boolean mSendProgressUpdateCalled;
		private boolean mSendResultCalled;

		Result(Object obj)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			mDebug = obj;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #24  <Field Object mDebug>
		//    5    9:return          
		}
	}

	private class ServiceBinderImpl
	{

		public void addSubscription(final String id, final IBinder token, Bundle bundle, final ServiceCallbacks callbacks)
		{
			mHandler.postOrRun(((_cls3) (bundle)). new Runnable() {

				public void run()
				{
					Object obj = ((Object) (callbacks.asBinder()));
				//    0    0:aload_0         
				//    1    1:getfield        #30  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
				//    2    4:invokeinterface #47  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
				//    3    9:astore_1        
					obj = ((Object) ((ConnectionRecord)mConnections.get(obj)));
				//    4   10:aload_0         
				//    5   11:getfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				//    6   14:getfield        #51  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
				//    7   17:getfield        #55  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
				//    8   20:aload_1         
				//    9   21:invokevirtual   #61  <Method Object ArrayMap.get(Object)>
				//   10   24:checkcast       #63  <Class MediaBrowserServiceCompat$ConnectionRecord>
				//   11   27:astore_1        
					if(obj == null)
				//*  12   28:aload_1         
				//*  13   29:ifnonnull       67
					{
						obj = ((Object) (new StringBuilder()));
				//   14   32:new             #65  <Class StringBuilder>
				//   15   35:dup             
				//   16   36:invokespecial   #66  <Method void StringBuilder()>
				//   17   39:astore_1        
						((StringBuilder) (obj)).append("addSubscription for callback that isn't registered id=");
				//   18   40:aload_1         
				//   19   41:ldc1            #68  <String "addSubscription for callback that isn't registered id=">
				//   20   43:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
				//   21   46:pop             
						((StringBuilder) (obj)).append(id);
				//   22   47:aload_1         
				//   23   48:aload_0         
				//   24   49:getfield        #32  <Field String val$id>
				//   25   52:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
				//   26   55:pop             
						Log.w("MBServiceCompat", ((StringBuilder) (obj)).toString());
				//   27   56:ldc1            #74  <String "MBServiceCompat">
				//   28   58:aload_1         
				//   29   59:invokevirtual   #78  <Method String StringBuilder.toString()>
				//   30   62:invokestatic    #84  <Method int Log.w(String, String)>
				//   31   65:pop             
						return;
				//   32   66:return          
					} else
					{
						addSubscription(id, ((ConnectionRecord) (obj)), token, options);
				//   33   67:aload_0         
				//   34   68:getfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				//   35   71:getfield        #51  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
				//   36   74:aload_0         
				//   37   75:getfield        #32  <Field String val$id>
				//   38   78:aload_1         
				//   39   79:aload_0         
				//   40   80:getfield        #34  <Field IBinder val$token>
				//   41   83:aload_0         
				//   42   84:getfield        #36  <Field Bundle val$options>
				//   43   87:invokevirtual   #87  <Method void MediaBrowserServiceCompat.addSubscription(String, MediaBrowserServiceCompat$ConnectionRecord, IBinder, Bundle)>
						return;
				//   44   90:return          
					}
				}

				final ServiceBinderImpl this$1;
				final ServiceCallbacks val$callbacks;
				final String val$id;
				final Bundle val$options;
				final IBinder val$token;

			
			{
				this$1 = final_servicebinderimpl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				callbacks = servicecallbacks;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #30  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
				id = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #32  <Field String val$id>
				token = ibinder;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #34  <Field IBinder val$token>
				options = Bundle.this;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #36  <Field Bundle val$options>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #39  <Method void Object()>
			//   17   31:return          
			}
			}
);
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field MediaBrowserServiceCompat this$0>
		//    2    4:getfield        #41  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//    3    7:new             #13  <Class MediaBrowserServiceCompat$ServiceBinderImpl$3>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:aload           4
		//    7   14:aload_1         
		//    8   15:aload_2         
		//    9   16:aload_3         
		//   10   17:invokespecial   #44  <Method void MediaBrowserServiceCompat$ServiceBinderImpl$3(MediaBrowserServiceCompat$ServiceBinderImpl, MediaBrowserServiceCompat$ServiceCallbacks, String, IBinder, Bundle)>
		//   11   20:invokevirtual   #50  <Method void MediaBrowserServiceCompat$ServiceHandler.postOrRun(Runnable)>
		//   12   23:return          
		}

		public void connect(final String pkg, final int pid, final int uid, Bundle bundle, final ServiceCallbacks callbacks)
		{
			if(isValidPackage(pkg, uid))
		//*   0    0:aload_0         
		//*   1    1:getfield        #31  <Field MediaBrowserServiceCompat this$0>
		//*   2    4:aload_1         
		//*   3    5:iload_3         
		//*   4    6:invokevirtual   #56  <Method boolean MediaBrowserServiceCompat.isValidPackage(String, int)>
		//*   5    9:ifeq            38
			{
				mHandler.postOrRun(((_cls1) (bundle)). new Runnable() {

					public void run()
					{
						RemoteException remoteexception;
						RemoteException remoteexception1;
						Object obj = ((Object) (callbacks.asBinder()));
					//    0    0:aload_0         
					//    1    1:getfield        #31  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
					//    2    4:invokeinterface #52  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
					//    3    9:astore_1        
						mConnections.remove(obj);
					//    4   10:aload_0         
					//    5   11:getfield        #29  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
					//    6   14:getfield        #56  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
					//    7   17:getfield        #60  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
					//    8   20:aload_1         
					//    9   21:invokevirtual   #66  <Method Object ArrayMap.remove(Object)>
					//   10   24:pop             
						Object obj1 = ((Object) (new ConnectionRecord(pkg, pid, uid, rootHints, callbacks)));
					//   11   25:new             #68  <Class MediaBrowserServiceCompat$ConnectionRecord>
					//   12   28:dup             
					//   13   29:aload_0         
					//   14   30:getfield        #29  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
					//   15   33:getfield        #56  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
					//   16   36:aload_0         
					//   17   37:getfield        #33  <Field String val$pkg>
					//   18   40:aload_0         
					//   19   41:getfield        #35  <Field int val$pid>
					//   20   44:aload_0         
					//   21   45:getfield        #37  <Field int val$uid>
					//   22   48:aload_0         
					//   23   49:getfield        #39  <Field Bundle val$rootHints>
					//   24   52:aload_0         
					//   25   53:getfield        #31  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
					//   26   56:invokespecial   #71  <Method void MediaBrowserServiceCompat$ConnectionRecord(MediaBrowserServiceCompat, String, int, int, Bundle, MediaBrowserServiceCompat$ServiceCallbacks)>
					//   27   59:astore_2        
						mCurConnection = ((ConnectionRecord) (obj1));
					//   28   60:aload_0         
					//   29   61:getfield        #29  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
					//   30   64:getfield        #56  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
					//   31   67:aload_2         
					//   32   68:putfield        #75  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
						obj1.root = onGetRoot(pkg, uid, rootHints);
					//   33   71:aload_2         
					//   34   72:aload_0         
					//   35   73:getfield        #29  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
					//   36   76:getfield        #56  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
					//   37   79:aload_0         
					//   38   80:getfield        #33  <Field String val$pkg>
					//   39   83:aload_0         
					//   40   84:getfield        #37  <Field int val$uid>
					//   41   87:aload_0         
					//   42   88:getfield        #39  <Field Bundle val$rootHints>
					//   43   91:invokevirtual   #79  <Method MediaBrowserServiceCompat$BrowserRoot MediaBrowserServiceCompat.onGetRoot(String, int, Bundle)>
					//   44   94:putfield        #83  <Field MediaBrowserServiceCompat$BrowserRoot MediaBrowserServiceCompat$ConnectionRecord.root>
						mCurConnection = null;
					//   45   97:aload_0         
					//   46   98:getfield        #29  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
					//   47  101:getfield        #56  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
					//   48  104:aconst_null     
					//   49  105:putfield        #75  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
						if(((ConnectionRecord) (obj1)).root == null)
					//*  50  108:aload_2         
					//*  51  109:getfield        #83  <Field MediaBrowserServiceCompat$BrowserRoot MediaBrowserServiceCompat$ConnectionRecord.root>
					//*  52  112:ifnonnull       213
						{
							obj = ((Object) (new StringBuilder()));
					//   53  115:new             #85  <Class StringBuilder>
					//   54  118:dup             
					//   55  119:invokespecial   #86  <Method void StringBuilder()>
					//   56  122:astore_1        
							((StringBuilder) (obj)).append("No root for client ");
					//   57  123:aload_1         
					//   58  124:ldc1            #88  <String "No root for client ">
					//   59  126:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
					//   60  129:pop             
							((StringBuilder) (obj)).append(pkg);
					//   61  130:aload_1         
					//   62  131:aload_0         
					//   63  132:getfield        #33  <Field String val$pkg>
					//   64  135:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
					//   65  138:pop             
							((StringBuilder) (obj)).append(" from service ");
					//   66  139:aload_1         
					//   67  140:ldc1            #94  <String " from service ">
					//   68  142:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
					//   69  145:pop             
							((StringBuilder) (obj)).append(((Object)this).getClass().getName());
					//   70  146:aload_1         
					//   71  147:aload_0         
					//   72  148:invokevirtual   #98  <Method Class Object.getClass()>
					//   73  151:invokevirtual   #104 <Method String Class.getName()>
					//   74  154:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
					//   75  157:pop             
							Log.i("MBServiceCompat", ((StringBuilder) (obj)).toString());
					//   76  158:ldc1            #106 <String "MBServiceCompat">
					//   77  160:aload_1         
					//   78  161:invokevirtual   #109 <Method String StringBuilder.toString()>
					//   79  164:invokestatic    #115 <Method int Log.i(String, String)>
					//   80  167:pop             
							try
							{
								callbacks.onConnectFailed();
					//   81  168:aload_0         
					//   82  169:getfield        #31  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
					//   83  172:invokeinterface #118 <Method void MediaBrowserServiceCompat$ServiceCallbacks.onConnectFailed()>
								return;
					//   84  177:return          
							}
					//*  85  178:new             #85  <Class StringBuilder>
					//*  86  181:dup             
					//*  87  182:invokespecial   #86  <Method void StringBuilder()>
					//*  88  185:astore_1        
					//*  89  186:aload_1         
					//*  90  187:ldc1            #120 <String "Calling onConnectFailed() failed. Ignoring. pkg=">
					//*  91  189:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
					//*  92  192:pop             
					//*  93  193:aload_1         
					//*  94  194:aload_0         
					//*  95  195:getfield        #33  <Field String val$pkg>
					//*  96  198:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
					//*  97  201:pop             
					//*  98  202:ldc1            #106 <String "MBServiceCompat">
					//*  99  204:aload_1         
					//* 100  205:invokevirtual   #109 <Method String StringBuilder.toString()>
					//* 101  208:invokestatic    #123 <Method int Log.w(String, String)>
					//* 102  211:pop             
					//* 103  212:return          
					//* 104  213:aload_0         
					//* 105  214:getfield        #29  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
					//* 106  217:getfield        #56  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
					//* 107  220:getfield        #60  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
					//* 108  223:aload_1         
					//* 109  224:aload_2         
					//* 110  225:invokevirtual   #127 <Method Object ArrayMap.put(Object, Object)>
					//* 111  228:pop             
					//* 112  229:aload_1         
					//* 113  230:aload_2         
					//* 114  231:iconst_0        
					//* 115  232:invokeinterface #133 <Method void IBinder.linkToDeath(android.os.IBinder$DeathRecipient, int)>
					//* 116  237:aload_0         
					//* 117  238:getfield        #29  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
					//* 118  241:getfield        #56  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
					//* 119  244:getfield        #137 <Field android.support.v4.media.session.MediaSessionCompat$Token MediaBrowserServiceCompat.mSession>
					//* 120  247:ifnull          333
					//* 121  250:aload_0         
					//* 122  251:getfield        #31  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
					//* 123  254:aload_2         
					//* 124  255:getfield        #83  <Field MediaBrowserServiceCompat$BrowserRoot MediaBrowserServiceCompat$ConnectionRecord.root>
					//* 125  258:invokevirtual   #142 <Method String MediaBrowserServiceCompat$BrowserRoot.getRootId()>
					//* 126  261:aload_0         
					//* 127  262:getfield        #29  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
					//* 128  265:getfield        #56  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
					//* 129  268:getfield        #137 <Field android.support.v4.media.session.MediaSessionCompat$Token MediaBrowserServiceCompat.mSession>
					//* 130  271:aload_2         
					//* 131  272:getfield        #83  <Field MediaBrowserServiceCompat$BrowserRoot MediaBrowserServiceCompat$ConnectionRecord.root>
					//* 132  275:invokevirtual   #146 <Method Bundle MediaBrowserServiceCompat$BrowserRoot.getExtras()>
					//* 133  278:invokeinterface #150 <Method void MediaBrowserServiceCompat$ServiceCallbacks.onConnect(String, android.support.v4.media.session.MediaSessionCompat$Token, Bundle)>
					//* 134  283:return          
					//* 135  284:new             #85  <Class StringBuilder>
					//* 136  287:dup             
					//* 137  288:invokespecial   #86  <Method void StringBuilder()>
					//* 138  291:astore_2        
					//* 139  292:aload_2         
					//* 140  293:ldc1            #152 <String "Calling onConnect() failed. Dropping client. pkg=">
					//* 141  295:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
					//* 142  298:pop             
					//* 143  299:aload_2         
					//* 144  300:aload_0         
					//* 145  301:getfield        #33  <Field String val$pkg>
					//* 146  304:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
					//* 147  307:pop             
					//* 148  308:ldc1            #106 <String "MBServiceCompat">
					//* 149  310:aload_2         
					//* 150  311:invokevirtual   #109 <Method String StringBuilder.toString()>
					//* 151  314:invokestatic    #123 <Method int Log.w(String, String)>
					//* 152  317:pop             
					//* 153  318:aload_0         
					//* 154  319:getfield        #29  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
					//* 155  322:getfield        #56  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
					//* 156  325:getfield        #60  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
					//* 157  328:aload_1         
					//* 158  329:invokevirtual   #66  <Method Object ArrayMap.remove(Object)>
					//* 159  332:pop             
					//* 160  333:return          
							// Misplaced declaration of an exception variable
							catch(RemoteException remoteexception)
							{
								obj = ((Object) (new StringBuilder()));
							}
							((StringBuilder) (obj)).append("Calling onConnectFailed() failed. Ignoring. pkg=");
							((StringBuilder) (obj)).append(pkg);
							Log.w("MBServiceCompat", ((StringBuilder) (obj)).toString());
							return;
						}
						try
						{
							mConnections.put(obj, obj1);
							((IBinder) (obj)).linkToDeath(((android.os.IBinder.DeathRecipient) (obj1)), 0);
							if(mSession != null)
							{
								callbacks.onConnect(((ConnectionRecord) (obj1)).root.getRootId(), mSession, ((ConnectionRecord) (obj1)).root.getExtras());
								return;
							}
						}
					//* 161  334:astore_1        
					//* 162  335:goto            178
						// Misplaced declaration of an exception variable
						catch(RemoteException remoteexception1)
						{
							obj1 = ((Object) (new StringBuilder()));
							((StringBuilder) (obj1)).append("Calling onConnect() failed. Dropping client. pkg=");
							((StringBuilder) (obj1)).append(pkg);
							Log.w("MBServiceCompat", ((StringBuilder) (obj1)).toString());
							mConnections.remove(obj);
						}
					//* 163  338:astore_2        
					//* 164  339:goto            284
					}

					final ServiceBinderImpl this$1;
					final ServiceCallbacks val$callbacks;
					final int val$pid;
					final String val$pkg;
					final Bundle val$rootHints;
					final int val$uid;

			
			{
				this$1 = final_servicebinderimpl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #29  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				callbacks = servicecallbacks;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #31  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
				pkg = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #33  <Field String val$pkg>
				pid = i;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #35  <Field int val$pid>
				uid = j;
			//   12   21:aload_0         
			//   13   22:iload           5
			//   14   24:putfield        #37  <Field int val$uid>
				rootHints = Bundle.this;
			//   15   27:aload_0         
			//   16   28:aload           6
			//   17   30:putfield        #39  <Field Bundle val$rootHints>
				super();
			//   18   33:aload_0         
			//   19   34:invokespecial   #42  <Method void Object()>
			//   20   37:return          
			}
				}
);
		//    6   12:aload_0         
		//    7   13:getfield        #31  <Field MediaBrowserServiceCompat this$0>
		//    8   16:getfield        #41  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//    9   19:new             #9   <Class MediaBrowserServiceCompat$ServiceBinderImpl$1>
		//   10   22:dup             
		//   11   23:aload_0         
		//   12   24:aload           5
		//   13   26:aload_1         
		//   14   27:iload_2         
		//   15   28:iload_3         
		//   16   29:aload           4
		//   17   31:invokespecial   #59  <Method void MediaBrowserServiceCompat$ServiceBinderImpl$1(MediaBrowserServiceCompat$ServiceBinderImpl, MediaBrowserServiceCompat$ServiceCallbacks, String, int, int, Bundle)>
		//   18   34:invokevirtual   #50  <Method void MediaBrowserServiceCompat$ServiceHandler.postOrRun(Runnable)>
				return;
		//   19   37:return          
			} else
			{
				bundle = ((Bundle) (new StringBuilder()));
		//   20   38:new             #61  <Class StringBuilder>
		//   21   41:dup             
		//   22   42:invokespecial   #62  <Method void StringBuilder()>
		//   23   45:astore          4
				((StringBuilder) (bundle)).append("Package/uid mismatch: uid=");
		//   24   47:aload           4
		//   25   49:ldc1            #64  <String "Package/uid mismatch: uid=">
		//   26   51:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//   27   54:pop             
				((StringBuilder) (bundle)).append(uid);
		//   28   55:aload           4
		//   29   57:iload_3         
		//   30   58:invokevirtual   #71  <Method StringBuilder StringBuilder.append(int)>
		//   31   61:pop             
				((StringBuilder) (bundle)).append(" package=");
		//   32   62:aload           4
		//   33   64:ldc1            #73  <String " package=">
		//   34   66:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//   35   69:pop             
				((StringBuilder) (bundle)).append(pkg);
		//   36   70:aload           4
		//   37   72:aload_1         
		//   38   73:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//   39   76:pop             
				throw new IllegalArgumentException(((StringBuilder) (bundle)).toString());
		//   40   77:new             #75  <Class IllegalArgumentException>
		//   41   80:dup             
		//   42   81:aload           4
		//   43   83:invokevirtual   #79  <Method String StringBuilder.toString()>
		//   44   86:invokespecial   #82  <Method void IllegalArgumentException(String)>
		//   45   89:athrow          
			}
		}

		public void disconnect(ServiceCallbacks servicecallbacks)
		{
			mHandler.postOrRun(((_cls2) (servicecallbacks)). new Runnable() {

				public void run()
				{
					Object obj = ((Object) (callbacks.asBinder()));
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
				//    2    4:invokeinterface #35  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
				//    3    9:astore_1        
					obj = ((Object) ((ConnectionRecord)mConnections.remove(obj)));
				//    4   10:aload_0         
				//    5   11:getfield        #22  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				//    6   14:getfield        #39  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
				//    7   17:getfield        #43  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
				//    8   20:aload_1         
				//    9   21:invokevirtual   #49  <Method Object ArrayMap.remove(Object)>
				//   10   24:checkcast       #51  <Class MediaBrowserServiceCompat$ConnectionRecord>
				//   11   27:astore_1        
					if(obj != null)
				//*  12   28:aload_1         
				//*  13   29:ifnull          49
						((ConnectionRecord) (obj)).callbacks.asBinder().unlinkToDeath(((android.os.IBinder.DeathRecipient) (obj)), 0);
				//   14   32:aload_1         
				//   15   33:getfield        #54  <Field MediaBrowserServiceCompat$ServiceCallbacks MediaBrowserServiceCompat$ConnectionRecord.callbacks>
				//   16   36:invokeinterface #35  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
				//   17   41:aload_1         
				//   18   42:iconst_0        
				//   19   43:invokeinterface #60  <Method boolean IBinder.unlinkToDeath(android.os.IBinder$DeathRecipient, int)>
				//   20   48:pop             
				//   21   49:return          
				}

				final ServiceBinderImpl this$1;
				final ServiceCallbacks val$callbacks;

			
			{
				this$1 = final_servicebinderimpl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				callbacks = ServiceCallbacks.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
);
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field MediaBrowserServiceCompat this$0>
		//    2    4:getfield        #41  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//    3    7:new             #11  <Class MediaBrowserServiceCompat$ServiceBinderImpl$2>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:invokespecial   #87  <Method void MediaBrowserServiceCompat$ServiceBinderImpl$2(MediaBrowserServiceCompat$ServiceBinderImpl, MediaBrowserServiceCompat$ServiceCallbacks)>
		//    8   16:invokevirtual   #50  <Method void MediaBrowserServiceCompat$ServiceHandler.postOrRun(Runnable)>
		//    9   19:return          
		}

		public void getMediaItem(final String mediaId, ResultReceiver resultreceiver, final ServiceCallbacks callbacks)
		{
			if(!TextUtils.isEmpty(((CharSequence) (mediaId))))
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #95  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*   2    4:ifne            34
			{
				if(resultreceiver == null)
		//*   3    7:aload_2         
		//*   4    8:ifnonnull       12
				{
					return;
		//    5   11:return          
				} else
				{
					mHandler.postOrRun(((_cls5) (resultreceiver)). new Runnable() {

						public void run()
						{
							Object obj = ((Object) (callbacks.asBinder()));
						//    0    0:aload_0         
						//    1    1:getfield        #28  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
						//    2    4:invokeinterface #43  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
						//    3    9:astore_1        
							obj = ((Object) ((ConnectionRecord)mConnections.get(obj)));
						//    4   10:aload_0         
						//    5   11:getfield        #26  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
						//    6   14:getfield        #47  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
						//    7   17:getfield        #51  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
						//    8   20:aload_1         
						//    9   21:invokevirtual   #57  <Method Object ArrayMap.get(Object)>
						//   10   24:checkcast       #59  <Class MediaBrowserServiceCompat$ConnectionRecord>
						//   11   27:astore_1        
							if(obj == null)
						//*  12   28:aload_1         
						//*  13   29:ifnonnull       67
							{
								obj = ((Object) (new StringBuilder()));
						//   14   32:new             #61  <Class StringBuilder>
						//   15   35:dup             
						//   16   36:invokespecial   #62  <Method void StringBuilder()>
						//   17   39:astore_1        
								((StringBuilder) (obj)).append("getMediaItem for callback that isn't registered id=");
						//   18   40:aload_1         
						//   19   41:ldc1            #64  <String "getMediaItem for callback that isn't registered id=">
						//   20   43:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
						//   21   46:pop             
								((StringBuilder) (obj)).append(mediaId);
						//   22   47:aload_1         
						//   23   48:aload_0         
						//   24   49:getfield        #30  <Field String val$mediaId>
						//   25   52:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
						//   26   55:pop             
								Log.w("MBServiceCompat", ((StringBuilder) (obj)).toString());
						//   27   56:ldc1            #70  <String "MBServiceCompat">
						//   28   58:aload_1         
						//   29   59:invokevirtual   #74  <Method String StringBuilder.toString()>
						//   30   62:invokestatic    #80  <Method int Log.w(String, String)>
						//   31   65:pop             
								return;
						//   32   66:return          
							} else
							{
								performLoadItem(mediaId, ((ConnectionRecord) (obj)), receiver);
						//   33   67:aload_0         
						//   34   68:getfield        #26  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
						//   35   71:getfield        #47  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
						//   36   74:aload_0         
						//   37   75:getfield        #30  <Field String val$mediaId>
						//   38   78:aload_1         
						//   39   79:aload_0         
						//   40   80:getfield        #32  <Field ResultReceiver val$receiver>
						//   41   83:invokevirtual   #84  <Method void MediaBrowserServiceCompat.performLoadItem(String, MediaBrowserServiceCompat$ConnectionRecord, ResultReceiver)>
								return;
						//   42   86:return          
							}
						}

						final ServiceBinderImpl this$1;
						final ServiceCallbacks val$callbacks;
						final String val$mediaId;
						final ResultReceiver val$receiver;

			
			{
				this$1 = final_servicebinderimpl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				callbacks = servicecallbacks;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
				mediaId = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field String val$mediaId>
				receiver = ResultReceiver.this;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #32  <Field ResultReceiver val$receiver>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #35  <Method void Object()>
			//   14   25:return          
			}
					}
);
		//    6   12:aload_0         
		//    7   13:getfield        #31  <Field MediaBrowserServiceCompat this$0>
		//    8   16:getfield        #41  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//    9   19:new             #17  <Class MediaBrowserServiceCompat$ServiceBinderImpl$5>
		//   10   22:dup             
		//   11   23:aload_0         
		//   12   24:aload_3         
		//   13   25:aload_1         
		//   14   26:aload_2         
		//   15   27:invokespecial   #98  <Method void MediaBrowserServiceCompat$ServiceBinderImpl$5(MediaBrowserServiceCompat$ServiceBinderImpl, MediaBrowserServiceCompat$ServiceCallbacks, String, ResultReceiver)>
		//   16   30:invokevirtual   #50  <Method void MediaBrowserServiceCompat$ServiceHandler.postOrRun(Runnable)>
					return;
		//   17   33:return          
				}
			} else
			{
				return;
		//   18   34:return          
			}
		}

		public void registerCallbacks(final ServiceCallbacks callbacks, final String pkg, final int pid, final int uid, Bundle bundle)
		{
			mHandler.postOrRun(((_cls6) (bundle)). new Runnable() {

				public void run()
				{
					RemoteException remoteexception;
					IBinder ibinder = callbacks.asBinder();
				//    0    0:aload_0         
				//    1    1:getfield        #31  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
				//    2    4:invokeinterface #52  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
				//    3    9:astore_1        
					mConnections.remove(((Object) (ibinder)));
				//    4   10:aload_0         
				//    5   11:getfield        #29  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				//    6   14:getfield        #56  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
				//    7   17:getfield        #60  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
				//    8   20:aload_1         
				//    9   21:invokevirtual   #66  <Method Object ArrayMap.remove(Object)>
				//   10   24:pop             
					ConnectionRecord connectionrecord = new ConnectionRecord(pkg, pid, uid, rootHints, callbacks);
				//   11   25:new             #68  <Class MediaBrowserServiceCompat$ConnectionRecord>
				//   12   28:dup             
				//   13   29:aload_0         
				//   14   30:getfield        #29  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				//   15   33:getfield        #56  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
				//   16   36:aload_0         
				//   17   37:getfield        #33  <Field String val$pkg>
				//   18   40:aload_0         
				//   19   41:getfield        #35  <Field int val$pid>
				//   20   44:aload_0         
				//   21   45:getfield        #37  <Field int val$uid>
				//   22   48:aload_0         
				//   23   49:getfield        #39  <Field Bundle val$rootHints>
				//   24   52:aload_0         
				//   25   53:getfield        #31  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
				//   26   56:invokespecial   #71  <Method void MediaBrowserServiceCompat$ConnectionRecord(MediaBrowserServiceCompat, String, int, int, Bundle, MediaBrowserServiceCompat$ServiceCallbacks)>
				//   27   59:astore_2        
					mConnections.put(((Object) (ibinder)), ((Object) (connectionrecord)));
				//   28   60:aload_0         
				//   29   61:getfield        #29  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				//   30   64:getfield        #56  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
				//   31   67:getfield        #60  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
				//   32   70:aload_1         
				//   33   71:aload_2         
				//   34   72:invokevirtual   #75  <Method Object ArrayMap.put(Object, Object)>
				//   35   75:pop             
					try
					{
						ibinder.linkToDeath(((android.os.IBinder.DeathRecipient) (connectionrecord)), 0);
				//   36   76:aload_1         
				//   37   77:aload_2         
				//   38   78:iconst_0        
				//   39   79:invokeinterface #81  <Method void IBinder.linkToDeath(android.os.IBinder$DeathRecipient, int)>
						return;
				//   40   84:return          
					}
				//*  41   85:ldc1            #83  <String "MBServiceCompat">
				//*  42   87:ldc1            #85  <String "IBinder is already dead.">
				//*  43   89:invokestatic    #91  <Method int Log.w(String, String)>
				//*  44   92:pop             
				//*  45   93:return          
					// Misplaced declaration of an exception variable
					catch(RemoteException remoteexception)
					{
						Log.w("MBServiceCompat", "IBinder is already dead.");
					}
				//*  46   94:astore_1        
				//*  47   95:goto            85
				}

				final ServiceBinderImpl this$1;
				final ServiceCallbacks val$callbacks;
				final int val$pid;
				final String val$pkg;
				final Bundle val$rootHints;
				final int val$uid;

			
			{
				this$1 = final_servicebinderimpl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #29  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				callbacks = servicecallbacks;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #31  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
				pkg = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #33  <Field String val$pkg>
				pid = i;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #35  <Field int val$pid>
				uid = j;
			//   12   21:aload_0         
			//   13   22:iload           5
			//   14   24:putfield        #37  <Field int val$uid>
				rootHints = Bundle.this;
			//   15   27:aload_0         
			//   16   28:aload           6
			//   17   30:putfield        #39  <Field Bundle val$rootHints>
				super();
			//   18   33:aload_0         
			//   19   34:invokespecial   #42  <Method void Object()>
			//   20   37:return          
			}
			}
);
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field MediaBrowserServiceCompat this$0>
		//    2    4:getfield        #41  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//    3    7:new             #19  <Class MediaBrowserServiceCompat$ServiceBinderImpl$6>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:aload_2         
		//    8   14:iload_3         
		//    9   15:iload           4
		//   10   17:aload           5
		//   11   19:invokespecial   #101 <Method void MediaBrowserServiceCompat$ServiceBinderImpl$6(MediaBrowserServiceCompat$ServiceBinderImpl, MediaBrowserServiceCompat$ServiceCallbacks, String, int, int, Bundle)>
		//   12   22:invokevirtual   #50  <Method void MediaBrowserServiceCompat$ServiceHandler.postOrRun(Runnable)>
		//   13   25:return          
		}

		public void removeSubscription(final String id, IBinder ibinder, final ServiceCallbacks callbacks)
		{
			mHandler.postOrRun(((_cls4) (ibinder)). new Runnable() {

				public void run()
				{
					Object obj = ((Object) (callbacks.asBinder()));
				//    0    0:aload_0         
				//    1    1:getfield        #28  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
				//    2    4:invokeinterface #43  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
				//    3    9:astore_1        
					obj = ((Object) ((ConnectionRecord)mConnections.get(obj)));
				//    4   10:aload_0         
				//    5   11:getfield        #26  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				//    6   14:getfield        #47  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
				//    7   17:getfield        #51  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
				//    8   20:aload_1         
				//    9   21:invokevirtual   #57  <Method Object ArrayMap.get(Object)>
				//   10   24:checkcast       #59  <Class MediaBrowserServiceCompat$ConnectionRecord>
				//   11   27:astore_1        
					if(obj == null)
				//*  12   28:aload_1         
				//*  13   29:ifnonnull       67
					{
						obj = ((Object) (new StringBuilder()));
				//   14   32:new             #61  <Class StringBuilder>
				//   15   35:dup             
				//   16   36:invokespecial   #62  <Method void StringBuilder()>
				//   17   39:astore_1        
						((StringBuilder) (obj)).append("removeSubscription for callback that isn't registered id=");
				//   18   40:aload_1         
				//   19   41:ldc1            #64  <String "removeSubscription for callback that isn't registered id=">
				//   20   43:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
				//   21   46:pop             
						((StringBuilder) (obj)).append(id);
				//   22   47:aload_1         
				//   23   48:aload_0         
				//   24   49:getfield        #30  <Field String val$id>
				//   25   52:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
				//   26   55:pop             
						Log.w("MBServiceCompat", ((StringBuilder) (obj)).toString());
				//   27   56:ldc1            #70  <String "MBServiceCompat">
				//   28   58:aload_1         
				//   29   59:invokevirtual   #74  <Method String StringBuilder.toString()>
				//   30   62:invokestatic    #80  <Method int Log.w(String, String)>
				//   31   65:pop             
						return;
				//   32   66:return          
					}
					if(!removeSubscription(id, ((ConnectionRecord) (obj)), token))
				//*  33   67:aload_0         
				//*  34   68:getfield        #26  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				//*  35   71:getfield        #47  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
				//*  36   74:aload_0         
				//*  37   75:getfield        #30  <Field String val$id>
				//*  38   78:aload_1         
				//*  39   79:aload_0         
				//*  40   80:getfield        #32  <Field IBinder val$token>
				//*  41   83:invokevirtual   #83  <Method boolean MediaBrowserServiceCompat.removeSubscription(String, MediaBrowserServiceCompat$ConnectionRecord, IBinder)>
				//*  42   86:ifne            130
					{
						StringBuilder stringbuilder = new StringBuilder();
				//   43   89:new             #61  <Class StringBuilder>
				//   44   92:dup             
				//   45   93:invokespecial   #62  <Method void StringBuilder()>
				//   46   96:astore_1        
						stringbuilder.append("removeSubscription called for ");
				//   47   97:aload_1         
				//   48   98:ldc1            #85  <String "removeSubscription called for ">
				//   49  100:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
				//   50  103:pop             
						stringbuilder.append(id);
				//   51  104:aload_1         
				//   52  105:aload_0         
				//   53  106:getfield        #30  <Field String val$id>
				//   54  109:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
				//   55  112:pop             
						stringbuilder.append(" which is not subscribed");
				//   56  113:aload_1         
				//   57  114:ldc1            #87  <String " which is not subscribed">
				//   58  116:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
				//   59  119:pop             
						Log.w("MBServiceCompat", stringbuilder.toString());
				//   60  120:ldc1            #70  <String "MBServiceCompat">
				//   61  122:aload_1         
				//   62  123:invokevirtual   #74  <Method String StringBuilder.toString()>
				//   63  126:invokestatic    #80  <Method int Log.w(String, String)>
				//   64  129:pop             
					}
				//   65  130:return          
				}

				final ServiceBinderImpl this$1;
				final ServiceCallbacks val$callbacks;
				final String val$id;
				final IBinder val$token;

			
			{
				this$1 = final_servicebinderimpl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				callbacks = servicecallbacks;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
				id = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field String val$id>
				token = IBinder.this;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #32  <Field IBinder val$token>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #35  <Method void Object()>
			//   14   25:return          
			}
			}
);
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field MediaBrowserServiceCompat this$0>
		//    2    4:getfield        #41  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//    3    7:new             #15  <Class MediaBrowserServiceCompat$ServiceBinderImpl$4>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:aload_3         
		//    7   13:aload_1         
		//    8   14:aload_2         
		//    9   15:invokespecial   #106 <Method void MediaBrowserServiceCompat$ServiceBinderImpl$4(MediaBrowserServiceCompat$ServiceBinderImpl, MediaBrowserServiceCompat$ServiceCallbacks, String, IBinder)>
		//   10   18:invokevirtual   #50  <Method void MediaBrowserServiceCompat$ServiceHandler.postOrRun(Runnable)>
		//   11   21:return          
		}

		public void search(final String query, final Bundle extras, ResultReceiver resultreceiver, final ServiceCallbacks callbacks)
		{
			if(!TextUtils.isEmpty(((CharSequence) (query))))
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #95  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*   2    4:ifne            36
			{
				if(resultreceiver == null)
		//*   3    7:aload_3         
		//*   4    8:ifnonnull       12
				{
					return;
		//    5   11:return          
				} else
				{
					mHandler.postOrRun(((_cls8) (resultreceiver)). new Runnable() {

						public void run()
						{
							Object obj = ((Object) (callbacks.asBinder()));
						//    0    0:aload_0         
						//    1    1:getfield        #30  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
						//    2    4:invokeinterface #47  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
						//    3    9:astore_1        
							obj = ((Object) ((ConnectionRecord)mConnections.get(obj)));
						//    4   10:aload_0         
						//    5   11:getfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
						//    6   14:getfield        #51  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
						//    7   17:getfield        #55  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
						//    8   20:aload_1         
						//    9   21:invokevirtual   #61  <Method Object ArrayMap.get(Object)>
						//   10   24:checkcast       #63  <Class MediaBrowserServiceCompat$ConnectionRecord>
						//   11   27:astore_1        
							if(obj == null)
						//*  12   28:aload_1         
						//*  13   29:ifnonnull       67
							{
								obj = ((Object) (new StringBuilder()));
						//   14   32:new             #65  <Class StringBuilder>
						//   15   35:dup             
						//   16   36:invokespecial   #66  <Method void StringBuilder()>
						//   17   39:astore_1        
								((StringBuilder) (obj)).append("search for callback that isn't registered query=");
						//   18   40:aload_1         
						//   19   41:ldc1            #68  <String "search for callback that isn't registered query=">
						//   20   43:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
						//   21   46:pop             
								((StringBuilder) (obj)).append(query);
						//   22   47:aload_1         
						//   23   48:aload_0         
						//   24   49:getfield        #32  <Field String val$query>
						//   25   52:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
						//   26   55:pop             
								Log.w("MBServiceCompat", ((StringBuilder) (obj)).toString());
						//   27   56:ldc1            #74  <String "MBServiceCompat">
						//   28   58:aload_1         
						//   29   59:invokevirtual   #78  <Method String StringBuilder.toString()>
						//   30   62:invokestatic    #84  <Method int Log.w(String, String)>
						//   31   65:pop             
								return;
						//   32   66:return          
							} else
							{
								performSearch(query, extras, ((ConnectionRecord) (obj)), receiver);
						//   33   67:aload_0         
						//   34   68:getfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
						//   35   71:getfield        #51  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
						//   36   74:aload_0         
						//   37   75:getfield        #32  <Field String val$query>
						//   38   78:aload_0         
						//   39   79:getfield        #34  <Field Bundle val$extras>
						//   40   82:aload_1         
						//   41   83:aload_0         
						//   42   84:getfield        #36  <Field ResultReceiver val$receiver>
						//   43   87:invokevirtual   #88  <Method void MediaBrowserServiceCompat.performSearch(String, Bundle, MediaBrowserServiceCompat$ConnectionRecord, ResultReceiver)>
								return;
						//   44   90:return          
							}
						}

						final ServiceBinderImpl this$1;
						final ServiceCallbacks val$callbacks;
						final Bundle val$extras;
						final String val$query;
						final ResultReceiver val$receiver;

			
			{
				this$1 = final_servicebinderimpl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				callbacks = servicecallbacks;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #30  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
				query = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #32  <Field String val$query>
				extras = bundle;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #34  <Field Bundle val$extras>
				receiver = ResultReceiver.this;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #36  <Field ResultReceiver val$receiver>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #39  <Method void Object()>
			//   17   31:return          
			}
					}
);
		//    6   12:aload_0         
		//    7   13:getfield        #31  <Field MediaBrowserServiceCompat this$0>
		//    8   16:getfield        #41  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//    9   19:new             #23  <Class MediaBrowserServiceCompat$ServiceBinderImpl$8>
		//   10   22:dup             
		//   11   23:aload_0         
		//   12   24:aload           4
		//   13   26:aload_1         
		//   14   27:aload_2         
		//   15   28:aload_3         
		//   16   29:invokespecial   #111 <Method void MediaBrowserServiceCompat$ServiceBinderImpl$8(MediaBrowserServiceCompat$ServiceBinderImpl, MediaBrowserServiceCompat$ServiceCallbacks, String, Bundle, ResultReceiver)>
		//   17   32:invokevirtual   #50  <Method void MediaBrowserServiceCompat$ServiceHandler.postOrRun(Runnable)>
					return;
		//   18   35:return          
				}
			} else
			{
				return;
		//   19   36:return          
			}
		}

		public void sendCustomAction(final String action, final Bundle extras, ResultReceiver resultreceiver, final ServiceCallbacks callbacks)
		{
			if(!TextUtils.isEmpty(((CharSequence) (action))))
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #95  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*   2    4:ifne            36
			{
				if(resultreceiver == null)
		//*   3    7:aload_3         
		//*   4    8:ifnonnull       12
				{
					return;
		//    5   11:return          
				} else
				{
					mHandler.postOrRun(((_cls9) (resultreceiver)). new Runnable() {

						public void run()
						{
							Object obj = ((Object) (callbacks.asBinder()));
						//    0    0:aload_0         
						//    1    1:getfield        #30  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
						//    2    4:invokeinterface #47  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
						//    3    9:astore_1        
							obj = ((Object) ((ConnectionRecord)mConnections.get(obj)));
						//    4   10:aload_0         
						//    5   11:getfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
						//    6   14:getfield        #51  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
						//    7   17:getfield        #55  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
						//    8   20:aload_1         
						//    9   21:invokevirtual   #61  <Method Object ArrayMap.get(Object)>
						//   10   24:checkcast       #63  <Class MediaBrowserServiceCompat$ConnectionRecord>
						//   11   27:astore_1        
							if(obj == null)
						//*  12   28:aload_1         
						//*  13   29:ifnonnull       83
							{
								obj = ((Object) (new StringBuilder()));
						//   14   32:new             #65  <Class StringBuilder>
						//   15   35:dup             
						//   16   36:invokespecial   #66  <Method void StringBuilder()>
						//   17   39:astore_1        
								((StringBuilder) (obj)).append("sendCustomAction for callback that isn't registered action=");
						//   18   40:aload_1         
						//   19   41:ldc1            #68  <String "sendCustomAction for callback that isn't registered action=">
						//   20   43:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
						//   21   46:pop             
								((StringBuilder) (obj)).append(action);
						//   22   47:aload_1         
						//   23   48:aload_0         
						//   24   49:getfield        #32  <Field String val$action>
						//   25   52:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
						//   26   55:pop             
								((StringBuilder) (obj)).append(", extras=");
						//   27   56:aload_1         
						//   28   57:ldc1            #74  <String ", extras=">
						//   29   59:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
						//   30   62:pop             
								((StringBuilder) (obj)).append(((Object) (extras)));
						//   31   63:aload_1         
						//   32   64:aload_0         
						//   33   65:getfield        #34  <Field Bundle val$extras>
						//   34   68:invokevirtual   #77  <Method StringBuilder StringBuilder.append(Object)>
						//   35   71:pop             
								Log.w("MBServiceCompat", ((StringBuilder) (obj)).toString());
						//   36   72:ldc1            #79  <String "MBServiceCompat">
						//   37   74:aload_1         
						//   38   75:invokevirtual   #83  <Method String StringBuilder.toString()>
						//   39   78:invokestatic    #89  <Method int Log.w(String, String)>
						//   40   81:pop             
								return;
						//   41   82:return          
							} else
							{
								performCustomAction(action, extras, ((ConnectionRecord) (obj)), receiver);
						//   42   83:aload_0         
						//   43   84:getfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
						//   44   87:getfield        #51  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
						//   45   90:aload_0         
						//   46   91:getfield        #32  <Field String val$action>
						//   47   94:aload_0         
						//   48   95:getfield        #34  <Field Bundle val$extras>
						//   49   98:aload_1         
						//   50   99:aload_0         
						//   51  100:getfield        #36  <Field ResultReceiver val$receiver>
						//   52  103:invokevirtual   #93  <Method void MediaBrowserServiceCompat.performCustomAction(String, Bundle, MediaBrowserServiceCompat$ConnectionRecord, ResultReceiver)>
								return;
						//   53  106:return          
							}
						}

						final ServiceBinderImpl this$1;
						final String val$action;
						final ServiceCallbacks val$callbacks;
						final Bundle val$extras;
						final ResultReceiver val$receiver;

			
			{
				this$1 = final_servicebinderimpl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				callbacks = servicecallbacks;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #30  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
				action = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #32  <Field String val$action>
				extras = bundle;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #34  <Field Bundle val$extras>
				receiver = ResultReceiver.this;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #36  <Field ResultReceiver val$receiver>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #39  <Method void Object()>
			//   17   31:return          
			}
					}
);
		//    6   12:aload_0         
		//    7   13:getfield        #31  <Field MediaBrowserServiceCompat this$0>
		//    8   16:getfield        #41  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//    9   19:new             #25  <Class MediaBrowserServiceCompat$ServiceBinderImpl$9>
		//   10   22:dup             
		//   11   23:aload_0         
		//   12   24:aload           4
		//   13   26:aload_1         
		//   14   27:aload_2         
		//   15   28:aload_3         
		//   16   29:invokespecial   #113 <Method void MediaBrowserServiceCompat$ServiceBinderImpl$9(MediaBrowserServiceCompat$ServiceBinderImpl, MediaBrowserServiceCompat$ServiceCallbacks, String, Bundle, ResultReceiver)>
		//   17   32:invokevirtual   #50  <Method void MediaBrowserServiceCompat$ServiceHandler.postOrRun(Runnable)>
					return;
		//   18   35:return          
				}
			} else
			{
				return;
		//   19   36:return          
			}
		}

		public void unregisterCallbacks(ServiceCallbacks servicecallbacks)
		{
			mHandler.postOrRun(((_cls7) (servicecallbacks)). new Runnable() {

				public void run()
				{
					IBinder ibinder = callbacks.asBinder();
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
				//    2    4:invokeinterface #35  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
				//    3    9:astore_1        
					ConnectionRecord connectionrecord = (ConnectionRecord)mConnections.remove(((Object) (ibinder)));
				//    4   10:aload_0         
				//    5   11:getfield        #22  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				//    6   14:getfield        #39  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
				//    7   17:getfield        #43  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
				//    8   20:aload_1         
				//    9   21:invokevirtual   #49  <Method Object ArrayMap.remove(Object)>
				//   10   24:checkcast       #51  <Class MediaBrowserServiceCompat$ConnectionRecord>
				//   11   27:astore_2        
					if(connectionrecord != null)
				//*  12   28:aload_2         
				//*  13   29:ifnull          41
						ibinder.unlinkToDeath(((android.os.IBinder.DeathRecipient) (connectionrecord)), 0);
				//   14   32:aload_1         
				//   15   33:aload_2         
				//   16   34:iconst_0        
				//   17   35:invokeinterface #57  <Method boolean IBinder.unlinkToDeath(android.os.IBinder$DeathRecipient, int)>
				//   18   40:pop             
				//   19   41:return          
				}

				final ServiceBinderImpl this$1;
				final ServiceCallbacks val$callbacks;

			
			{
				this$1 = final_servicebinderimpl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				callbacks = ServiceCallbacks.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
);
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field MediaBrowserServiceCompat this$0>
		//    2    4:getfield        #41  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//    3    7:new             #21  <Class MediaBrowserServiceCompat$ServiceBinderImpl$7>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:invokespecial   #115 <Method void MediaBrowserServiceCompat$ServiceBinderImpl$7(MediaBrowserServiceCompat$ServiceBinderImpl, MediaBrowserServiceCompat$ServiceCallbacks)>
		//    8   16:invokevirtual   #50  <Method void MediaBrowserServiceCompat$ServiceHandler.postOrRun(Runnable)>
		//    9   19:return          
		}

		final MediaBrowserServiceCompat this$0;

		ServiceBinderImpl()
		{
			this$0 = MediaBrowserServiceCompat.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #31  <Field MediaBrowserServiceCompat this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #34  <Method void Object()>
		//    5    9:return          
		}
	}

	private static interface ServiceCallbacks
	{

		public abstract IBinder asBinder();

		public abstract void onConnect(String s, android.support.v4.media.session.MediaSessionCompat.Token token, Bundle bundle)
			throws RemoteException;

		public abstract void onConnectFailed()
			throws RemoteException;

		public abstract void onLoadChildren(String s, List list, Bundle bundle, Bundle bundle1)
			throws RemoteException;
	}

	private static class ServiceCallbacksCompat
		implements ServiceCallbacks
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
					s = ((String) (new ArrayList(((Collection) (list)))));
		//   25   53:new             #92  <Class ArrayList>
		//   26   56:dup             
		//   27   57:aload_2         
		//   28   58:invokespecial   #95  <Method void ArrayList(Collection)>
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

		ServiceCallbacksCompat(Messenger messenger)
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

	private final class ServiceHandler extends Handler
	{

		public void handleMessage(Message message)
		{
			Object obj = ((Object) (message.getData()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #33  <Method Bundle Message.getData()>
		//    2    4:astore_2        
			switch(message.what)
		//*   3    5:aload_1         
		//*   4    6:getfield        #37  <Field int Message.what>
			{
		//*   5    9:tableswitch     1 9: default 60
		//		               1 408
		//		               2 389
		//		               3 346
		//		               4 315
		//		               5 281
		//		               6 232
		//		               7 213
		//		               8 167
		//		               9 121
			default:
				obj = ((Object) (new StringBuilder()));
		//    6   60:new             #39  <Class StringBuilder>
		//    7   63:dup             
		//    8   64:invokespecial   #40  <Method void StringBuilder()>
		//    9   67:astore_2        
				((StringBuilder) (obj)).append("Unhandled message: ");
		//   10   68:aload_2         
		//   11   69:ldc1            #42  <String "Unhandled message: ">
		//   12   71:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
		//   13   74:pop             
				((StringBuilder) (obj)).append(((Object) (message)));
		//   14   75:aload_2         
		//   15   76:aload_1         
		//   16   77:invokevirtual   #49  <Method StringBuilder StringBuilder.append(Object)>
		//   17   80:pop             
				((StringBuilder) (obj)).append("\n  Service version: ");
		//   18   81:aload_2         
		//   19   82:ldc1            #51  <String "\n  Service version: ">
		//   20   84:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
		//   21   87:pop             
				((StringBuilder) (obj)).append(2);
		//   22   88:aload_2         
		//   23   89:iconst_2        
		//   24   90:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
		//   25   93:pop             
				((StringBuilder) (obj)).append("\n  Client version: ");
		//   26   94:aload_2         
		//   27   95:ldc1            #56  <String "\n  Client version: ">
		//   28   97:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
		//   29  100:pop             
				((StringBuilder) (obj)).append(message.arg1);
		//   30  101:aload_2         
		//   31  102:aload_1         
		//   32  103:getfield        #59  <Field int Message.arg1>
		//   33  106:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
		//   34  109:pop             
				Log.w("MBServiceCompat", ((StringBuilder) (obj)).toString());
		//   35  110:ldc1            #61  <String "MBServiceCompat">
		//   36  112:aload_2         
		//   37  113:invokevirtual   #65  <Method String StringBuilder.toString()>
		//   38  116:invokestatic    #71  <Method int Log.w(String, String)>
		//   39  119:pop             
				return;
		//   40  120:return          

			case 9: // '\t'
				Bundle bundle = ((Bundle) (obj)).getBundle("data_custom_action_extras");
		//   41  121:aload_2         
		//   42  122:ldc1            #73  <String "data_custom_action_extras">
		//   43  124:invokevirtual   #79  <Method Bundle Bundle.getBundle(String)>
		//   44  127:astore_3        
				MediaSessionCompat.ensureClassLoader(bundle);
		//   45  128:aload_3         
		//   46  129:invokestatic    #85  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
				mServiceBinderImpl.sendCustomAction(((Bundle) (obj)).getString("data_custom_action"), bundle, (ResultReceiver)((Bundle) (obj)).getParcelable("data_result_receiver"), ((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))));
		//   47  132:aload_0         
		//   48  133:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//   49  136:aload_2         
		//   50  137:ldc1            #87  <String "data_custom_action">
		//   51  139:invokevirtual   #91  <Method String Bundle.getString(String)>
		//   52  142:aload_3         
		//   53  143:aload_2         
		//   54  144:ldc1            #93  <String "data_result_receiver">
		//   55  146:invokevirtual   #97  <Method android.os.Parcelable Bundle.getParcelable(String)>
		//   56  149:checkcast       #99  <Class ResultReceiver>
		//   57  152:new             #101 <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//   58  155:dup             
		//   59  156:aload_1         
		//   60  157:getfield        #105 <Field Messenger Message.replyTo>
		//   61  160:invokespecial   #108 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(Messenger)>
		//   62  163:invokevirtual   #112 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.sendCustomAction(String, Bundle, ResultReceiver, MediaBrowserServiceCompat$ServiceCallbacks)>
				return;
		//   63  166:return          

			case 8: // '\b'
				Bundle bundle1 = ((Bundle) (obj)).getBundle("data_search_extras");
		//   64  167:aload_2         
		//   65  168:ldc1            #114 <String "data_search_extras">
		//   66  170:invokevirtual   #79  <Method Bundle Bundle.getBundle(String)>
		//   67  173:astore_3        
				MediaSessionCompat.ensureClassLoader(bundle1);
		//   68  174:aload_3         
		//   69  175:invokestatic    #85  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
				mServiceBinderImpl.search(((Bundle) (obj)).getString("data_search_query"), bundle1, (ResultReceiver)((Bundle) (obj)).getParcelable("data_result_receiver"), ((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))));
		//   70  178:aload_0         
		//   71  179:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//   72  182:aload_2         
		//   73  183:ldc1            #116 <String "data_search_query">
		//   74  185:invokevirtual   #91  <Method String Bundle.getString(String)>
		//   75  188:aload_3         
		//   76  189:aload_2         
		//   77  190:ldc1            #93  <String "data_result_receiver">
		//   78  192:invokevirtual   #97  <Method android.os.Parcelable Bundle.getParcelable(String)>
		//   79  195:checkcast       #99  <Class ResultReceiver>
		//   80  198:new             #101 <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//   81  201:dup             
		//   82  202:aload_1         
		//   83  203:getfield        #105 <Field Messenger Message.replyTo>
		//   84  206:invokespecial   #108 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(Messenger)>
		//   85  209:invokevirtual   #119 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.search(String, Bundle, ResultReceiver, MediaBrowserServiceCompat$ServiceCallbacks)>
				return;
		//   86  212:return          

			case 7: // '\007'
				mServiceBinderImpl.unregisterCallbacks(((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))));
		//   87  213:aload_0         
		//   88  214:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//   89  217:new             #101 <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//   90  220:dup             
		//   91  221:aload_1         
		//   92  222:getfield        #105 <Field Messenger Message.replyTo>
		//   93  225:invokespecial   #108 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(Messenger)>
		//   94  228:invokevirtual   #123 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.unregisterCallbacks(MediaBrowserServiceCompat$ServiceCallbacks)>
				return;
		//   95  231:return          

			case 6: // '\006'
				Bundle bundle2 = ((Bundle) (obj)).getBundle("data_root_hints");
		//   96  232:aload_2         
		//   97  233:ldc1            #125 <String "data_root_hints">
		//   98  235:invokevirtual   #79  <Method Bundle Bundle.getBundle(String)>
		//   99  238:astore_3        
				MediaSessionCompat.ensureClassLoader(bundle2);
		//  100  239:aload_3         
		//  101  240:invokestatic    #85  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
				mServiceBinderImpl.registerCallbacks(((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))), ((Bundle) (obj)).getString("data_package_name"), ((Bundle) (obj)).getInt("data_calling_pid"), ((Bundle) (obj)).getInt("data_calling_uid"), bundle2);
		//  102  243:aload_0         
		//  103  244:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//  104  247:new             #101 <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//  105  250:dup             
		//  106  251:aload_1         
		//  107  252:getfield        #105 <Field Messenger Message.replyTo>
		//  108  255:invokespecial   #108 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(Messenger)>
		//  109  258:aload_2         
		//  110  259:ldc1            #127 <String "data_package_name">
		//  111  261:invokevirtual   #91  <Method String Bundle.getString(String)>
		//  112  264:aload_2         
		//  113  265:ldc1            #129 <String "data_calling_pid">
		//  114  267:invokevirtual   #133 <Method int Bundle.getInt(String)>
		//  115  270:aload_2         
		//  116  271:ldc1            #135 <String "data_calling_uid">
		//  117  273:invokevirtual   #133 <Method int Bundle.getInt(String)>
		//  118  276:aload_3         
		//  119  277:invokevirtual   #139 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.registerCallbacks(MediaBrowserServiceCompat$ServiceCallbacks, String, int, int, Bundle)>
				return;
		//  120  280:return          

			case 5: // '\005'
				mServiceBinderImpl.getMediaItem(((Bundle) (obj)).getString("data_media_item_id"), (ResultReceiver)((Bundle) (obj)).getParcelable("data_result_receiver"), ((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))));
		//  121  281:aload_0         
		//  122  282:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//  123  285:aload_2         
		//  124  286:ldc1            #141 <String "data_media_item_id">
		//  125  288:invokevirtual   #91  <Method String Bundle.getString(String)>
		//  126  291:aload_2         
		//  127  292:ldc1            #93  <String "data_result_receiver">
		//  128  294:invokevirtual   #97  <Method android.os.Parcelable Bundle.getParcelable(String)>
		//  129  297:checkcast       #99  <Class ResultReceiver>
		//  130  300:new             #101 <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//  131  303:dup             
		//  132  304:aload_1         
		//  133  305:getfield        #105 <Field Messenger Message.replyTo>
		//  134  308:invokespecial   #108 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(Messenger)>
		//  135  311:invokevirtual   #145 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.getMediaItem(String, ResultReceiver, MediaBrowserServiceCompat$ServiceCallbacks)>
				return;
		//  136  314:return          

			case 4: // '\004'
				mServiceBinderImpl.removeSubscription(((Bundle) (obj)).getString("data_media_item_id"), BundleCompat.getBinder(((Bundle) (obj)), "data_callback_token"), ((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))));
		//  137  315:aload_0         
		//  138  316:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//  139  319:aload_2         
		//  140  320:ldc1            #141 <String "data_media_item_id">
		//  141  322:invokevirtual   #91  <Method String Bundle.getString(String)>
		//  142  325:aload_2         
		//  143  326:ldc1            #147 <String "data_callback_token">
		//  144  328:invokestatic    #153 <Method IBinder BundleCompat.getBinder(Bundle, String)>
		//  145  331:new             #101 <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//  146  334:dup             
		//  147  335:aload_1         
		//  148  336:getfield        #105 <Field Messenger Message.replyTo>
		//  149  339:invokespecial   #108 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(Messenger)>
		//  150  342:invokevirtual   #157 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.removeSubscription(String, IBinder, MediaBrowserServiceCompat$ServiceCallbacks)>
				return;
		//  151  345:return          

			case 3: // '\003'
				Bundle bundle3 = ((Bundle) (obj)).getBundle("data_options");
		//  152  346:aload_2         
		//  153  347:ldc1            #159 <String "data_options">
		//  154  349:invokevirtual   #79  <Method Bundle Bundle.getBundle(String)>
		//  155  352:astore_3        
				MediaSessionCompat.ensureClassLoader(bundle3);
		//  156  353:aload_3         
		//  157  354:invokestatic    #85  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
				mServiceBinderImpl.addSubscription(((Bundle) (obj)).getString("data_media_item_id"), BundleCompat.getBinder(((Bundle) (obj)), "data_callback_token"), bundle3, ((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))));
		//  158  357:aload_0         
		//  159  358:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//  160  361:aload_2         
		//  161  362:ldc1            #141 <String "data_media_item_id">
		//  162  364:invokevirtual   #91  <Method String Bundle.getString(String)>
		//  163  367:aload_2         
		//  164  368:ldc1            #147 <String "data_callback_token">
		//  165  370:invokestatic    #153 <Method IBinder BundleCompat.getBinder(Bundle, String)>
		//  166  373:aload_3         
		//  167  374:new             #101 <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//  168  377:dup             
		//  169  378:aload_1         
		//  170  379:getfield        #105 <Field Messenger Message.replyTo>
		//  171  382:invokespecial   #108 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(Messenger)>
		//  172  385:invokevirtual   #163 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.addSubscription(String, IBinder, Bundle, MediaBrowserServiceCompat$ServiceCallbacks)>
				return;
		//  173  388:return          

			case 2: // '\002'
				mServiceBinderImpl.disconnect(((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))));
		//  174  389:aload_0         
		//  175  390:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//  176  393:new             #101 <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//  177  396:dup             
		//  178  397:aload_1         
		//  179  398:getfield        #105 <Field Messenger Message.replyTo>
		//  180  401:invokespecial   #108 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(Messenger)>
		//  181  404:invokevirtual   #166 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.disconnect(MediaBrowserServiceCompat$ServiceCallbacks)>
				return;
		//  182  407:return          

			case 1: // '\001'
				Bundle bundle4 = ((Bundle) (obj)).getBundle("data_root_hints");
		//  183  408:aload_2         
		//  184  409:ldc1            #125 <String "data_root_hints">
		//  185  411:invokevirtual   #79  <Method Bundle Bundle.getBundle(String)>
		//  186  414:astore_3        
				MediaSessionCompat.ensureClassLoader(bundle4);
		//  187  415:aload_3         
		//  188  416:invokestatic    #85  <Method void MediaSessionCompat.ensureClassLoader(Bundle)>
				mServiceBinderImpl.connect(((Bundle) (obj)).getString("data_package_name"), ((Bundle) (obj)).getInt("data_calling_pid"), ((Bundle) (obj)).getInt("data_calling_uid"), bundle4, ((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))));
		//  189  419:aload_0         
		//  190  420:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//  191  423:aload_2         
		//  192  424:ldc1            #127 <String "data_package_name">
		//  193  426:invokevirtual   #91  <Method String Bundle.getString(String)>
		//  194  429:aload_2         
		//  195  430:ldc1            #129 <String "data_calling_pid">
		//  196  432:invokevirtual   #133 <Method int Bundle.getInt(String)>
		//  197  435:aload_2         
		//  198  436:ldc1            #135 <String "data_calling_uid">
		//  199  438:invokevirtual   #133 <Method int Bundle.getInt(String)>
		//  200  441:aload_3         
		//  201  442:new             #101 <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//  202  445:dup             
		//  203  446:aload_1         
		//  204  447:getfield        #105 <Field Messenger Message.replyTo>
		//  205  450:invokespecial   #108 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(Messenger)>
		//  206  453:invokevirtual   #170 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.connect(String, int, int, Bundle, MediaBrowserServiceCompat$ServiceCallbacks)>
				return;
		//  207  456:return          
			}
		}

		public void postOrRun(Runnable runnable)
		{
			if(Thread.currentThread() == getLooper().getThread())
		//*   0    0:invokestatic    #178 <Method Thread Thread.currentThread()>
		//*   1    3:aload_0         
		//*   2    4:invokevirtual   #182 <Method Looper getLooper()>
		//*   3    7:invokevirtual   #187 <Method Thread Looper.getThread()>
		//*   4   10:if_acmpne       20
			{
				runnable.run();
		//    5   13:aload_1         
		//    6   14:invokeinterface #192 <Method void Runnable.run()>
				return;
		//    7   19:return          
			} else
			{
				post(runnable);
		//    8   20:aload_0         
		//    9   21:aload_1         
		//   10   22:invokevirtual   #196 <Method boolean post(Runnable)>
		//   11   25:pop             
				return;
		//   12   26:return          
			}
		}

		public boolean sendMessageAtTime(Message message, long l)
		{
			Bundle bundle = message.getData();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #33  <Method Bundle Message.getData()>
		//    2    4:astore          4
			bundle.setClassLoader(((Class) (android/support/v4/media/MediaBrowserCompat)).getClassLoader());
		//    3    6:aload           4
		//    4    8:ldc1            #200 <Class MediaBrowserCompat>
		//    5   10:invokevirtual   #206 <Method ClassLoader Class.getClassLoader()>
		//    6   13:invokevirtual   #210 <Method void Bundle.setClassLoader(ClassLoader)>
			bundle.putInt("data_calling_uid", Binder.getCallingUid());
		//    7   16:aload           4
		//    8   18:ldc1            #135 <String "data_calling_uid">
		//    9   20:invokestatic    #216 <Method int Binder.getCallingUid()>
		//   10   23:invokevirtual   #220 <Method void Bundle.putInt(String, int)>
			bundle.putInt("data_calling_pid", Binder.getCallingPid());
		//   11   26:aload           4
		//   12   28:ldc1            #129 <String "data_calling_pid">
		//   13   30:invokestatic    #223 <Method int Binder.getCallingPid()>
		//   14   33:invokevirtual   #220 <Method void Bundle.putInt(String, int)>
			return super.sendMessageAtTime(message, l);
		//   15   36:aload_0         
		//   16   37:aload_1         
		//   17   38:lload_2         
		//   18   39:invokespecial   #225 <Method boolean Handler.sendMessageAtTime(Message, long)>
		//   19   42:ireturn         
		}

		private final ServiceBinderImpl mServiceBinderImpl;
		final MediaBrowserServiceCompat this$0;

		ServiceHandler()
		{
			this$0 = MediaBrowserServiceCompat.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field MediaBrowserServiceCompat this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Handler()>
			mServiceBinderImpl = new ServiceBinderImpl();
		//    5    9:aload_0         
		//    6   10:new             #20  <Class MediaBrowserServiceCompat$ServiceBinderImpl>
		//    7   13:dup             
		//    8   14:aload_0         
		//    9   15:getfield        #15  <Field MediaBrowserServiceCompat this$0>
		//   10   18:invokespecial   #22  <Method void MediaBrowserServiceCompat$ServiceBinderImpl(MediaBrowserServiceCompat)>
		//   11   21:putfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//   12   24:return          
		}
	}


	public MediaBrowserServiceCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #148 <Method void Service()>
	//    2    4:aload_0         
	//    3    5:new             #150 <Class ArrayMap>
	//    4    8:dup             
	//    5    9:invokespecial   #151 <Method void ArrayMap()>
	//    6   12:putfield        #153 <Field ArrayMap mConnections>
	//    7   15:aload_0         
	//    8   16:new             #88  <Class MediaBrowserServiceCompat$ServiceHandler>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #156 <Method void MediaBrowserServiceCompat$ServiceHandler(MediaBrowserServiceCompat)>
	//   12   24:putfield        #158 <Field MediaBrowserServiceCompat$ServiceHandler mHandler>
	//   13   27:return          
	}

	void addSubscription(String s, ConnectionRecord connectionrecord, IBinder ibinder, Bundle bundle)
	{
		List list = (List)connectionrecord.subscriptions.get(((Object) (s)));
	//    0    0:aload_2         
	//    1    1:getfield        #164 <Field HashMap MediaBrowserServiceCompat$ConnectionRecord.subscriptions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #170 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #172 <Class List>
	//    5   11:astore          6
		Object obj = ((Object) (list));
	//    6   13:aload           6
	//    7   15:astore          5
		if(list == null)
	//*   8   17:aload           6
	//*   9   19:ifnonnull       31
			obj = ((Object) (new ArrayList()));
	//   10   22:new             #174 <Class ArrayList>
	//   11   25:dup             
	//   12   26:invokespecial   #175 <Method void ArrayList()>
	//   13   29:astore          5
		for(Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext();)
	//*  14   31:aload           5
	//*  15   33:invokeinterface #179 <Method Iterator List.iterator()>
	//*  16   38:astore          6
	//*  17   40:aload           6
	//*  18   42:invokeinterface #185 <Method boolean Iterator.hasNext()>
	//*  19   47:ifeq            88
		{
			Pair pair = (Pair)iterator.next();
	//   20   50:aload           6
	//   21   52:invokeinterface #189 <Method Object Iterator.next()>
	//   22   57:checkcast       #191 <Class Pair>
	//   23   60:astore          7
			if(ibinder == pair.first && MediaBrowserCompatUtils.areSameOptions(bundle, (Bundle)pair.second))
	//*  24   62:aload_3         
	//*  25   63:aload           7
	//*  26   65:getfield        #195 <Field Object Pair.first>
	//*  27   68:if_acmpne       40
	//*  28   71:aload           4
	//*  29   73:aload           7
	//*  30   75:getfield        #198 <Field Object Pair.second>
	//*  31   78:checkcast       #200 <Class Bundle>
	//*  32   81:invokestatic    #206 <Method boolean MediaBrowserCompatUtils.areSameOptions(Bundle, Bundle)>
	//*  33   84:ifeq            40
				return;
	//   34   87:return          
		}

		((List) (obj)).add(((Object) (new Pair(((Object) (ibinder)), ((Object) (bundle))))));
	//   35   88:aload           5
	//   36   90:new             #191 <Class Pair>
	//   37   93:dup             
	//   38   94:aload_3         
	//   39   95:aload           4
	//   40   97:invokespecial   #209 <Method void Pair(Object, Object)>
	//   41  100:invokeinterface #213 <Method boolean List.add(Object)>
	//   42  105:pop             
		connectionrecord.subscriptions.put(((Object) (s)), obj);
	//   43  106:aload_2         
	//   44  107:getfield        #164 <Field HashMap MediaBrowserServiceCompat$ConnectionRecord.subscriptions>
	//   45  110:aload_1         
	//   46  111:aload           5
	//   47  113:invokevirtual   #217 <Method Object HashMap.put(Object, Object)>
	//   48  116:pop             
		performLoadChildren(s, connectionrecord, bundle, ((Bundle) (null)));
	//   49  117:aload_0         
	//   50  118:aload_1         
	//   51  119:aload_2         
	//   52  120:aload           4
	//   53  122:aconst_null     
	//   54  123:invokevirtual   #221 <Method void performLoadChildren(String, MediaBrowserServiceCompat$ConnectionRecord, Bundle, Bundle)>
		mCurConnection = connectionrecord;
	//   55  126:aload_0         
	//   56  127:aload_2         
	//   57  128:putfield        #223 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		onSubscribe(s, bundle);
	//   58  131:aload_0         
	//   59  132:aload_1         
	//   60  133:aload           4
	//   61  135:invokevirtual   #227 <Method void onSubscribe(String, Bundle)>
		mCurConnection = null;
	//   62  138:aload_0         
	//   63  139:aconst_null     
	//   64  140:putfield        #223 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
	//   65  143:return          
	}

	List applyOptions(List list, Bundle bundle)
	{
		if(list == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
	//    4    6:aload_2         
	//    5    7:ldc1            #231 <String "android.media.browse.extra.PAGE">
	//    6    9:iconst_m1       
	//    7   10:invokevirtual   #235 <Method int Bundle.getInt(String, int)>
	//    8   13:istore_3        
		int i1 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
	//    9   14:aload_2         
	//   10   15:ldc1            #237 <String "android.media.browse.extra.PAGE_SIZE">
	//   11   17:iconst_m1       
	//   12   18:invokevirtual   #235 <Method int Bundle.getInt(String, int)>
	//   13   21:istore          6
		if(i == -1 && i1 == -1)
	//*  14   23:iload_3         
	//*  15   24:iconst_m1       
	//*  16   25:icmpne          36
	//*  17   28:iload           6
	//*  18   30:iconst_m1       
	//*  19   31:icmpne          36
			return list;
	//   20   34:aload_1         
	//   21   35:areturn         
		int l = i1 * i;
	//   22   36:iload           6
	//   23   38:iload_3         
	//   24   39:imul            
	//   25   40:istore          5
		int k = l + i1;
	//   26   42:iload           5
	//   27   44:iload           6
	//   28   46:iadd            
	//   29   47:istore          4
		if(i >= 0 && i1 >= 1 && l < list.size())
	//*  30   49:iload_3         
	//*  31   50:iflt            104
	//*  32   53:iload           6
	//*  33   55:iconst_1        
	//*  34   56:icmplt          104
	//*  35   59:iload           5
	//*  36   61:aload_1         
	//*  37   62:invokeinterface #241 <Method int List.size()>
	//*  38   67:icmplt          73
	//*  39   70:goto            104
		{
			int j = k;
	//   40   73:iload           4
	//   41   75:istore_3        
			if(k > list.size())
	//*  42   76:iload           4
	//*  43   78:aload_1         
	//*  44   79:invokeinterface #241 <Method int List.size()>
	//*  45   84:icmple          94
				j = list.size();
	//   46   87:aload_1         
	//   47   88:invokeinterface #241 <Method int List.size()>
	//   48   93:istore_3        
			return list.subList(l, j);
	//   49   94:aload_1         
	//   50   95:iload           5
	//   51   97:iload_3         
	//   52   98:invokeinterface #245 <Method List List.subList(int, int)>
	//   53  103:areturn         
		} else
		{
			return Collections.emptyList();
	//   54  104:invokestatic    #251 <Method List Collections.emptyList()>
	//   55  107:areturn         
		}
	}

	public void attachToBaseContext(Context context)
	{
		attachBaseContext(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #258 <Method void attachBaseContext(Context)>
	//    3    5:return          
	}

	public void dump(FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
	//    0    0:return          
	}

	public final Bundle getBrowserRootHints()
	{
		return mImpl.getBrowserRootHints();
	//    0    0:aload_0         
	//    1    1:getfield        #265 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
	//    2    4:invokeinterface #267 <Method Bundle MediaBrowserServiceCompat$MediaBrowserServiceImpl.getBrowserRootHints()>
	//    3    9:areturn         
	}

	public final MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo()
	{
		return mImpl.getCurrentBrowserInfo();
	//    0    0:aload_0         
	//    1    1:getfield        #265 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
	//    2    4:invokeinterface #272 <Method MediaSessionManager$RemoteUserInfo MediaBrowserServiceCompat$MediaBrowserServiceImpl.getCurrentBrowserInfo()>
	//    3    9:areturn         
	}

	public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken()
	{
		return mSession;
	//    0    0:aload_0         
	//    1    1:getfield        #277 <Field android.support.v4.media.session.MediaSessionCompat$Token mSession>
	//    2    4:areturn         
	}

	boolean isValidPackage(String s, int i)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		String as[] = getPackageManager().getPackagesForUid(i);
	//    4    6:aload_0         
	//    5    7:invokevirtual   #282 <Method PackageManager getPackageManager()>
	//    6   10:iload_2         
	//    7   11:invokevirtual   #288 <Method String[] PackageManager.getPackagesForUid(int)>
	//    8   14:astore          4
		int j = as.length;
	//    9   16:aload           4
	//   10   18:arraylength     
	//   11   19:istore_3        
		for(i = 0; i < j; i++)
	//*  12   20:iconst_0        
	//*  13   21:istore_2        
	//*  14   22:iload_2         
	//*  15   23:iload_3         
	//*  16   24:icmpge          47
			if(as[i].equals(((Object) (s))))
	//*  17   27:aload           4
	//*  18   29:iload_2         
	//*  19   30:aaload          
	//*  20   31:aload_1         
	//*  21   32:invokevirtual   #293 <Method boolean String.equals(Object)>
	//*  22   35:ifeq            40
				return true;
	//   23   38:iconst_1        
	//   24   39:ireturn         

	//   25   40:iload_2         
	//   26   41:iconst_1        
	//   27   42:iadd            
	//   28   43:istore_2        
	//*  29   44:goto            22
		return false;
	//   30   47:iconst_0        
	//   31   48:ireturn         
	}

	public void notifyChildrenChanged(MediaSessionManager.RemoteUserInfo remoteuserinfo, String s, Bundle bundle)
	{
		if(remoteuserinfo != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          47
		{
			if(s != null)
	//*   2    4:aload_2         
	//*   3    5:ifnull          36
			{
				if(bundle != null)
	//*   4    8:aload_3         
	//*   5    9:ifnull          25
				{
					mImpl.notifyChildrenChanged(remoteuserinfo, s, bundle);
	//    6   12:aload_0         
	//    7   13:getfield        #265 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:invokeinterface #298 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImpl.notifyChildrenChanged(MediaSessionManager$RemoteUserInfo, String, Bundle)>
					return;
	//   12   24:return          
				} else
				{
					throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
	//   13   25:new             #300 <Class IllegalArgumentException>
	//   14   28:dup             
	//   15   29:ldc2            #302 <String "options cannot be null in notifyChildrenChanged">
	//   16   32:invokespecial   #305 <Method void IllegalArgumentException(String)>
	//   17   35:athrow          
				}
			} else
			{
				throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
	//   18   36:new             #300 <Class IllegalArgumentException>
	//   19   39:dup             
	//   20   40:ldc2            #307 <String "parentId cannot be null in notifyChildrenChanged">
	//   21   43:invokespecial   #305 <Method void IllegalArgumentException(String)>
	//   22   46:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("remoteUserInfo cannot be null in notifyChildrenChanged");
	//   23   47:new             #300 <Class IllegalArgumentException>
	//   24   50:dup             
	//   25   51:ldc2            #309 <String "remoteUserInfo cannot be null in notifyChildrenChanged">
	//   26   54:invokespecial   #305 <Method void IllegalArgumentException(String)>
	//   27   57:athrow          
		}
	}

	public void notifyChildrenChanged(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          16
		{
			mImpl.notifyChildrenChanged(s, ((Bundle) (null)));
	//    2    4:aload_0         
	//    3    5:getfield        #265 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
	//    4    8:aload_1         
	//    5    9:aconst_null     
	//    6   10:invokeinterface #312 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImpl.notifyChildrenChanged(String, Bundle)>
			return;
	//    7   15:return          
		} else
		{
			throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
	//    8   16:new             #300 <Class IllegalArgumentException>
	//    9   19:dup             
	//   10   20:ldc2            #307 <String "parentId cannot be null in notifyChildrenChanged">
	//   11   23:invokespecial   #305 <Method void IllegalArgumentException(String)>
	//   12   26:athrow          
		}
	}

	public void notifyChildrenChanged(String s, Bundle bundle)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          31
		{
			if(bundle != null)
	//*   2    4:aload_2         
	//*   3    5:ifnull          20
			{
				mImpl.notifyChildrenChanged(s, bundle);
	//    4    8:aload_0         
	//    5    9:getfield        #265 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokeinterface #312 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImpl.notifyChildrenChanged(String, Bundle)>
				return;
	//    9   19:return          
			} else
			{
				throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
	//   10   20:new             #300 <Class IllegalArgumentException>
	//   11   23:dup             
	//   12   24:ldc2            #302 <String "options cannot be null in notifyChildrenChanged">
	//   13   27:invokespecial   #305 <Method void IllegalArgumentException(String)>
	//   14   30:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
	//   15   31:new             #300 <Class IllegalArgumentException>
	//   16   34:dup             
	//   17   35:ldc2            #307 <String "parentId cannot be null in notifyChildrenChanged">
	//   18   38:invokespecial   #305 <Method void IllegalArgumentException(String)>
	//   19   41:athrow          
		}
	}

	public IBinder onBind(Intent intent)
	{
		return mImpl.onBind(intent);
	//    0    0:aload_0         
	//    1    1:getfield        #265 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #316 <Method IBinder MediaBrowserServiceCompat$MediaBrowserServiceImpl.onBind(Intent)>
	//    4   10:areturn         
	}

	public void onCreate()
	{
		super.onCreate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #319 <Method void Service.onCreate()>
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   2    4:getstatic       #324 <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          28
	//*   4    9:icmplt          27
			mImpl = ((MediaBrowserServiceImpl) (new MediaBrowserServiceImplApi28()));
	//    5   12:aload_0         
	//    6   13:new             #46  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplApi28>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokespecial   #325 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi28(MediaBrowserServiceCompat)>
	//   10   21:putfield        #265 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
		else
	//*  11   24:goto            108
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*  12   27:getstatic       #324 <Field int android.os.Build$VERSION.SDK_INT>
	//*  13   30:bipush          26
	//*  14   32:icmplt          50
			mImpl = ((MediaBrowserServiceImpl) (new MediaBrowserServiceImplApi26()));
	//   15   35:aload_0         
	//   16   36:new             #41  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplApi26>
	//   17   39:dup             
	//   18   40:aload_0         
	//   19   41:invokespecial   #326 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi26(MediaBrowserServiceCompat)>
	//   20   44:putfield        #265 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
		else
	//*  21   47:goto            108
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  22   50:getstatic       #324 <Field int android.os.Build$VERSION.SDK_INT>
	//*  23   53:bipush          23
	//*  24   55:icmplt          73
			mImpl = ((MediaBrowserServiceImpl) (new MediaBrowserServiceImplApi23()));
	//   25   58:aload_0         
	//   26   59:new             #36  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplApi23>
	//   27   62:dup             
	//   28   63:aload_0         
	//   29   64:invokespecial   #327 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi23(MediaBrowserServiceCompat)>
	//   30   67:putfield        #265 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
		else
	//*  31   70:goto            108
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  32   73:getstatic       #324 <Field int android.os.Build$VERSION.SDK_INT>
	//*  33   76:bipush          21
	//*  34   78:icmplt          96
			mImpl = ((MediaBrowserServiceImpl) (new MediaBrowserServiceImplApi21()));
	//   35   81:aload_0         
	//   36   82:new             #25  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21>
	//   37   85:dup             
	//   38   86:aload_0         
	//   39   87:invokespecial   #328 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi21(MediaBrowserServiceCompat)>
	//   40   90:putfield        #265 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
		else
	//*  41   93:goto            108
			mImpl = ((MediaBrowserServiceImpl) (new MediaBrowserServiceImplBase()));
	//   42   96:aload_0         
	//   43   97:new             #49  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplBase>
	//   44  100:dup             
	//   45  101:aload_0         
	//   46  102:invokespecial   #329 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplBase(MediaBrowserServiceCompat)>
	//   47  105:putfield        #265 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
		mImpl.onCreate();
	//   48  108:aload_0         
	//   49  109:getfield        #265 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
	//   50  112:invokeinterface #330 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImpl.onCreate()>
	//   51  117:return          
	}

	public void onCustomAction(String s, Bundle bundle, Result result)
	{
		result.sendError(((Bundle) (null)));
	//    0    0:aload_3         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #336 <Method void MediaBrowserServiceCompat$Result.sendError(Bundle)>
	//    3    5:return          
	}

	public abstract BrowserRoot onGetRoot(String s, int i, Bundle bundle);

	public abstract void onLoadChildren(String s, Result result);

	public void onLoadChildren(String s, Result result, Bundle bundle)
	{
		result.setFlags(1);
	//    0    0:aload_2         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #346 <Method void MediaBrowserServiceCompat$Result.setFlags(int)>
		onLoadChildren(s, result);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #348 <Method void onLoadChildren(String, MediaBrowserServiceCompat$Result)>
	//    7   11:return          
	}

	public void onLoadItem(String s, Result result)
	{
		result.setFlags(2);
	//    0    0:aload_2         
	//    1    1:iconst_2        
	//    2    2:invokevirtual   #346 <Method void MediaBrowserServiceCompat$Result.setFlags(int)>
		result.sendResult(((Object) (null)));
	//    3    5:aload_2         
	//    4    6:aconst_null     
	//    5    7:invokevirtual   #354 <Method void MediaBrowserServiceCompat$Result.sendResult(Object)>
	//    6   10:return          
	}

	public void onSearch(String s, Bundle bundle, Result result)
	{
		result.setFlags(4);
	//    0    0:aload_3         
	//    1    1:iconst_4        
	//    2    2:invokevirtual   #346 <Method void MediaBrowserServiceCompat$Result.setFlags(int)>
		result.sendResult(((Object) (null)));
	//    3    5:aload_3         
	//    4    6:aconst_null     
	//    5    7:invokevirtual   #354 <Method void MediaBrowserServiceCompat$Result.sendResult(Object)>
	//    6   10:return          
	}

	public void onSubscribe(String s, Bundle bundle)
	{
	//    0    0:return          
	}

	public void onUnsubscribe(String s)
	{
	//    0    0:return          
	}

	void performCustomAction(final String final_obj, Bundle bundle, ConnectionRecord connectionrecord, ResultReceiver resultreceiver)
	{
		resultreceiver = ((ResultReceiver) (new Result(resultreceiver) {

			void onErrorSent(Bundle bundle1)
			{
				receiver.send(-1, bundle1);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field ResultReceiver val$receiver>
			//    2    4:iconst_m1       
			//    3    5:aload_1         
			//    4    6:invokevirtual   #32  <Method void ResultReceiver.send(int, Bundle)>
			//    5    9:return          
			}

			void onProgressUpdateSent(Bundle bundle1)
			{
				receiver.send(1, bundle1);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field ResultReceiver val$receiver>
			//    2    4:iconst_1        
			//    3    5:aload_1         
			//    4    6:invokevirtual   #32  <Method void ResultReceiver.send(int, Bundle)>
			//    5    9:return          
			}

			void onResultSent(Bundle bundle1)
			{
				receiver.send(0, bundle1);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field ResultReceiver val$receiver>
			//    2    4:iconst_0        
			//    3    5:aload_1         
			//    4    6:invokevirtual   #32  <Method void ResultReceiver.send(int, Bundle)>
			//    5    9:return          
			}

			volatile void onResultSent(Object obj)
			{
				onResultSent((Bundle)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #36  <Class Bundle>
			//    3    5:invokevirtual   #38  <Method void onResultSent(Bundle)>
			//    4    8:return          
			}

			final MediaBrowserServiceCompat this$0;
			final ResultReceiver val$receiver;

			
			{
				this$0 = MediaBrowserServiceCompat.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field MediaBrowserServiceCompat this$0>
				receiver = resultreceiver;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #20  <Field ResultReceiver val$receiver>
				super(final_obj);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:invokespecial   #23  <Method void MediaBrowserServiceCompat$Result(Object)>
			//    9   15:return          
			}
		}
));
	//    0    0:new             #12  <Class MediaBrowserServiceCompat$4>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload           4
	//    5    8:invokespecial   #363 <Method void MediaBrowserServiceCompat$4(MediaBrowserServiceCompat, Object, ResultReceiver)>
	//    6   11:astore          4
		mCurConnection = connectionrecord;
	//    7   13:aload_0         
	//    8   14:aload_3         
	//    9   15:putfield        #223 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		onCustomAction(final_obj, bundle, ((Result) (resultreceiver)));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:aload           4
	//   14   23:invokevirtual   #365 <Method void onCustomAction(String, Bundle, MediaBrowserServiceCompat$Result)>
		mCurConnection = null;
	//   15   26:aload_0         
	//   16   27:aconst_null     
	//   17   28:putfield        #223 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		if(((Result) (resultreceiver)).isDone())
	//*  18   31:aload           4
	//*  19   33:invokevirtual   #368 <Method boolean MediaBrowserServiceCompat$Result.isDone()>
	//*  20   36:ifeq            40
		{
			return;
	//   21   39:return          
		} else
		{
			connectionrecord = ((ConnectionRecord) (new StringBuilder()));
	//   22   40:new             #370 <Class StringBuilder>
	//   23   43:dup             
	//   24   44:invokespecial   #371 <Method void StringBuilder()>
	//   25   47:astore_3        
			((StringBuilder) (connectionrecord)).append("onCustomAction must call detach() or sendResult() or sendError() before returning for action=");
	//   26   48:aload_3         
	//   27   49:ldc2            #373 <String "onCustomAction must call detach() or sendResult() or sendError() before returning for action=">
	//   28   52:invokevirtual   #377 <Method StringBuilder StringBuilder.append(String)>
	//   29   55:pop             
			((StringBuilder) (connectionrecord)).append(final_obj);
	//   30   56:aload_3         
	//   31   57:aload_1         
	//   32   58:invokevirtual   #377 <Method StringBuilder StringBuilder.append(String)>
	//   33   61:pop             
			((StringBuilder) (connectionrecord)).append(" extras=");
	//   34   62:aload_3         
	//   35   63:ldc2            #379 <String " extras=">
	//   36   66:invokevirtual   #377 <Method StringBuilder StringBuilder.append(String)>
	//   37   69:pop             
			((StringBuilder) (connectionrecord)).append(((Object) (bundle)));
	//   38   70:aload_3         
	//   39   71:aload_2         
	//   40   72:invokevirtual   #382 <Method StringBuilder StringBuilder.append(Object)>
	//   41   75:pop             
			throw new IllegalStateException(((StringBuilder) (connectionrecord)).toString());
	//   42   76:new             #384 <Class IllegalStateException>
	//   43   79:dup             
	//   44   80:aload_3         
	//   45   81:invokevirtual   #388 <Method String StringBuilder.toString()>
	//   46   84:invokespecial   #389 <Method void IllegalStateException(String)>
	//   47   87:athrow          
		}
	}

	void performLoadChildren(final String final_obj, final ConnectionRecord connection, final Bundle subscribeOptions, Bundle bundle)
	{
		bundle = ((Bundle) (new Result(bundle) {

			volatile void onResultSent(Object obj)
			{
				onResultSent((List)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #38  <Class List>
			//    3    5:invokevirtual   #41  <Method void onResultSent(List)>
			//    4    8:return          
			}

			void onResultSent(List list)
			{
				if(mConnections.get(((Object) (connection.callbacks.asBinder()))) != connection)
			//*   0    0:aload_0         
			//*   1    1:getfield        #23  <Field MediaBrowserServiceCompat this$0>
			//*   2    4:getfield        #47  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
			//*   3    7:aload_0         
			//*   4    8:getfield        #25  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
			//*   5   11:getfield        #53  <Field MediaBrowserServiceCompat$ServiceCallbacks MediaBrowserServiceCompat$ConnectionRecord.callbacks>
			//*   6   14:invokeinterface #59  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
			//*   7   19:invokevirtual   #65  <Method Object ArrayMap.get(Object)>
			//*   8   22:aload_0         
			//*   9   23:getfield        #25  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
			//*  10   26:if_acmpeq       89
				{
					if(MediaBrowserServiceCompat.DEBUG)
			//*  11   29:getstatic       #69  <Field boolean MediaBrowserServiceCompat.DEBUG>
			//*  12   32:ifeq            88
					{
						list = ((List) (new StringBuilder()));
			//   13   35:new             #71  <Class StringBuilder>
			//   14   38:dup             
			//   15   39:invokespecial   #74  <Method void StringBuilder()>
			//   16   42:astore_1        
						((StringBuilder) (list)).append("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
			//   17   43:aload_1         
			//   18   44:ldc1            #76  <String "Not sending onLoadChildren result for connection that has been disconnected. pkg=">
			//   19   46:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
			//   20   49:pop             
						((StringBuilder) (list)).append(connection.pkg);
			//   21   50:aload_1         
			//   22   51:aload_0         
			//   23   52:getfield        #25  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
			//   24   55:getfield        #83  <Field String MediaBrowserServiceCompat$ConnectionRecord.pkg>
			//   25   58:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
			//   26   61:pop             
						((StringBuilder) (list)).append(" id=");
			//   27   62:aload_1         
			//   28   63:ldc1            #85  <String " id=">
			//   29   65:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
			//   30   68:pop             
						((StringBuilder) (list)).append(parentId);
			//   31   69:aload_1         
			//   32   70:aload_0         
			//   33   71:getfield        #27  <Field String val$parentId>
			//   34   74:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
			//   35   77:pop             
						Log.d("MBServiceCompat", ((StringBuilder) (list)).toString());
			//   36   78:ldc1            #87  <String "MBServiceCompat">
			//   37   80:aload_1         
			//   38   81:invokevirtual   #91  <Method String StringBuilder.toString()>
			//   39   84:invokestatic    #97  <Method int Log.d(String, String)>
			//   40   87:pop             
					}
					return;
			//   41   88:return          
				}
				List list1 = list;
			//   42   89:aload_1         
			//   43   90:astore_2        
				if((getFlags() & 1) != 0)
			//*  44   91:aload_0         
			//*  45   92:invokevirtual   #101 <Method int getFlags()>
			//*  46   95:iconst_1        
			//*  47   96:iand            
			//*  48   97:ifeq            113
					list1 = applyOptions(list, subscribeOptions);
			//   49  100:aload_0         
			//   50  101:getfield        #23  <Field MediaBrowserServiceCompat this$0>
			//   51  104:aload_1         
			//   52  105:aload_0         
			//   53  106:getfield        #29  <Field Bundle val$subscribeOptions>
			//   54  109:invokevirtual   #105 <Method List MediaBrowserServiceCompat.applyOptions(List, Bundle)>
			//   55  112:astore_2        
				try
				{
					connection.callbacks.onLoadChildren(parentId, list1, subscribeOptions, notifyChildrenChangedOptions);
			//   56  113:aload_0         
			//   57  114:getfield        #25  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
			//   58  117:getfield        #53  <Field MediaBrowserServiceCompat$ServiceCallbacks MediaBrowserServiceCompat$ConnectionRecord.callbacks>
			//   59  120:aload_0         
			//   60  121:getfield        #27  <Field String val$parentId>
			//   61  124:aload_2         
			//   62  125:aload_0         
			//   63  126:getfield        #29  <Field Bundle val$subscribeOptions>
			//   64  129:aload_0         
			//   65  130:getfield        #31  <Field Bundle val$notifyChildrenChangedOptions>
			//   66  133:invokeinterface #109 <Method void MediaBrowserServiceCompat$ServiceCallbacks.onLoadChildren(String, List, Bundle, Bundle)>
					return;
			//   67  138:return          
				}
			//*  68  139:new             #71  <Class StringBuilder>
			//*  69  142:dup             
			//*  70  143:invokespecial   #74  <Method void StringBuilder()>
			//*  71  146:astore_1        
			//*  72  147:aload_1         
			//*  73  148:ldc1            #111 <String "Calling onLoadChildren() failed for id=">
			//*  74  150:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
			//*  75  153:pop             
			//*  76  154:aload_1         
			//*  77  155:aload_0         
			//*  78  156:getfield        #27  <Field String val$parentId>
			//*  79  159:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
			//*  80  162:pop             
			//*  81  163:aload_1         
			//*  82  164:ldc1            #113 <String " package=">
			//*  83  166:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
			//*  84  169:pop             
			//*  85  170:aload_1         
			//*  86  171:aload_0         
			//*  87  172:getfield        #25  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
			//*  88  175:getfield        #83  <Field String MediaBrowserServiceCompat$ConnectionRecord.pkg>
			//*  89  178:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
			//*  90  181:pop             
			//*  91  182:ldc1            #87  <String "MBServiceCompat">
			//*  92  184:aload_1         
			//*  93  185:invokevirtual   #91  <Method String StringBuilder.toString()>
			//*  94  188:invokestatic    #116 <Method int Log.w(String, String)>
			//*  95  191:pop             
			//*  96  192:return          
				// Misplaced declaration of an exception variable
				catch(List list)
				{
					list = ((List) (new StringBuilder()));
				}
				((StringBuilder) (list)).append("Calling onLoadChildren() failed for id=");
				((StringBuilder) (list)).append(parentId);
				((StringBuilder) (list)).append(" package=");
				((StringBuilder) (list)).append(connection.pkg);
				Log.w("MBServiceCompat", ((StringBuilder) (list)).toString());
			//*  97  193:astore_1        
			//*  98  194:goto            139
			}

			final MediaBrowserServiceCompat this$0;
			final ConnectionRecord val$connection;
			final Bundle val$notifyChildrenChangedOptions;
			final String val$parentId;
			final Bundle val$subscribeOptions;

			
			{
				this$0 = MediaBrowserServiceCompat.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field MediaBrowserServiceCompat this$0>
				connection = connectionrecord;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #25  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
				parentId = s;
			//    6   10:aload_0         
			//    7   11:aload           4
			//    8   13:putfield        #27  <Field String val$parentId>
				subscribeOptions = bundle;
			//    9   16:aload_0         
			//   10   17:aload           5
			//   11   19:putfield        #29  <Field Bundle val$subscribeOptions>
				notifyChildrenChangedOptions = bundle1;
			//   12   22:aload_0         
			//   13   23:aload           6
			//   14   25:putfield        #31  <Field Bundle val$notifyChildrenChangedOptions>
				super(final_obj);
			//   15   28:aload_0         
			//   16   29:aload_2         
			//   17   30:invokespecial   #34  <Method void MediaBrowserServiceCompat$Result(Object)>
			//   18   33:return          
			}
		}
));
	//    0    0:new             #6   <Class MediaBrowserServiceCompat$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_1         
	//    6    8:aload_3         
	//    7    9:aload           4
	//    8   11:invokespecial   #392 <Method void MediaBrowserServiceCompat$1(MediaBrowserServiceCompat, Object, MediaBrowserServiceCompat$ConnectionRecord, String, Bundle, Bundle)>
	//    9   14:astore          4
		mCurConnection = connection;
	//   10   16:aload_0         
	//   11   17:aload_2         
	//   12   18:putfield        #223 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		if(subscribeOptions == null)
	//*  13   21:aload_3         
	//*  14   22:ifnonnull       35
			onLoadChildren(final_obj, ((Result) (bundle)));
	//   15   25:aload_0         
	//   16   26:aload_1         
	//   17   27:aload           4
	//   18   29:invokevirtual   #348 <Method void onLoadChildren(String, MediaBrowserServiceCompat$Result)>
		else
	//*  19   32:goto            43
			onLoadChildren(final_obj, ((Result) (bundle)), subscribeOptions);
	//   20   35:aload_0         
	//   21   36:aload_1         
	//   22   37:aload           4
	//   23   39:aload_3         
	//   24   40:invokevirtual   #394 <Method void onLoadChildren(String, MediaBrowserServiceCompat$Result, Bundle)>
		mCurConnection = null;
	//   25   43:aload_0         
	//   26   44:aconst_null     
	//   27   45:putfield        #223 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		if(((Result) (bundle)).isDone())
	//*  28   48:aload           4
	//*  29   50:invokevirtual   #368 <Method boolean MediaBrowserServiceCompat$Result.isDone()>
	//*  30   53:ifeq            57
		{
			return;
	//   31   56:return          
		} else
		{
			subscribeOptions = ((Bundle) (new StringBuilder()));
	//   32   57:new             #370 <Class StringBuilder>
	//   33   60:dup             
	//   34   61:invokespecial   #371 <Method void StringBuilder()>
	//   35   64:astore_3        
			((StringBuilder) (subscribeOptions)).append("onLoadChildren must call detach() or sendResult() before returning for package=");
	//   36   65:aload_3         
	//   37   66:ldc2            #396 <String "onLoadChildren must call detach() or sendResult() before returning for package=">
	//   38   69:invokevirtual   #377 <Method StringBuilder StringBuilder.append(String)>
	//   39   72:pop             
			((StringBuilder) (subscribeOptions)).append(connection.pkg);
	//   40   73:aload_3         
	//   41   74:aload_2         
	//   42   75:getfield        #399 <Field String MediaBrowserServiceCompat$ConnectionRecord.pkg>
	//   43   78:invokevirtual   #377 <Method StringBuilder StringBuilder.append(String)>
	//   44   81:pop             
			((StringBuilder) (subscribeOptions)).append(" id=");
	//   45   82:aload_3         
	//   46   83:ldc2            #401 <String " id=">
	//   47   86:invokevirtual   #377 <Method StringBuilder StringBuilder.append(String)>
	//   48   89:pop             
			((StringBuilder) (subscribeOptions)).append(final_obj);
	//   49   90:aload_3         
	//   50   91:aload_1         
	//   51   92:invokevirtual   #377 <Method StringBuilder StringBuilder.append(String)>
	//   52   95:pop             
			throw new IllegalStateException(((StringBuilder) (subscribeOptions)).toString());
	//   53   96:new             #384 <Class IllegalStateException>
	//   54   99:dup             
	//   55  100:aload_3         
	//   56  101:invokevirtual   #388 <Method String StringBuilder.toString()>
	//   57  104:invokespecial   #389 <Method void IllegalStateException(String)>
	//   58  107:athrow          
		}
	}

	void performLoadItem(final String final_obj, ConnectionRecord connectionrecord, ResultReceiver resultreceiver)
	{
		resultreceiver = ((ResultReceiver) (new Result(resultreceiver) {

			void onResultSent(MediaBrowserCompat.MediaItem mediaitem)
			{
				if((getFlags() & 2) != 0)
			//*   0    0:aload_0         
			//*   1    1:invokevirtual   #30  <Method int getFlags()>
			//*   2    4:iconst_2        
			//*   3    5:iand            
			//*   4    6:ifeq            19
				{
					receiver.send(-1, ((Bundle) (null)));
			//    5    9:aload_0         
			//    6   10:getfield        #20  <Field ResultReceiver val$receiver>
			//    7   13:iconst_m1       
			//    8   14:aconst_null     
			//    9   15:invokevirtual   #36  <Method void ResultReceiver.send(int, Bundle)>
					return;
			//   10   18:return          
				} else
				{
					Bundle bundle = new Bundle();
			//   11   19:new             #38  <Class Bundle>
			//   12   22:dup             
			//   13   23:invokespecial   #41  <Method void Bundle()>
			//   14   26:astore_2        
					bundle.putParcelable("media_item", ((android.os.Parcelable) (mediaitem)));
			//   15   27:aload_2         
			//   16   28:ldc1            #43  <String "media_item">
			//   17   30:aload_1         
			//   18   31:invokevirtual   #47  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
					receiver.send(0, bundle);
			//   19   34:aload_0         
			//   20   35:getfield        #20  <Field ResultReceiver val$receiver>
			//   21   38:iconst_0        
			//   22   39:aload_2         
			//   23   40:invokevirtual   #36  <Method void ResultReceiver.send(int, Bundle)>
					return;
			//   24   43:return          
				}
			}

			volatile void onResultSent(Object obj)
			{
				onResultSent((MediaBrowserCompat.MediaItem)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #49  <Class MediaBrowserCompat$MediaItem>
			//    3    5:invokevirtual   #51  <Method void onResultSent(MediaBrowserCompat$MediaItem)>
			//    4    8:return          
			}

			final MediaBrowserServiceCompat this$0;
			final ResultReceiver val$receiver;

			
			{
				this$0 = MediaBrowserServiceCompat.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field MediaBrowserServiceCompat this$0>
				receiver = resultreceiver;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #20  <Field ResultReceiver val$receiver>
				super(final_obj);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:invokespecial   #23  <Method void MediaBrowserServiceCompat$Result(Object)>
			//    9   15:return          
			}
		}
));
	//    0    0:new             #8   <Class MediaBrowserServiceCompat$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_3         
	//    5    7:invokespecial   #404 <Method void MediaBrowserServiceCompat$2(MediaBrowserServiceCompat, Object, ResultReceiver)>
	//    6   10:astore_3        
		mCurConnection = connectionrecord;
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:putfield        #223 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		onLoadItem(final_obj, ((Result) (resultreceiver)));
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:aload_3         
	//   13   19:invokevirtual   #406 <Method void onLoadItem(String, MediaBrowserServiceCompat$Result)>
		mCurConnection = null;
	//   14   22:aload_0         
	//   15   23:aconst_null     
	//   16   24:putfield        #223 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		if(((Result) (resultreceiver)).isDone())
	//*  17   27:aload_3         
	//*  18   28:invokevirtual   #368 <Method boolean MediaBrowserServiceCompat$Result.isDone()>
	//*  19   31:ifeq            35
		{
			return;
	//   20   34:return          
		} else
		{
			connectionrecord = ((ConnectionRecord) (new StringBuilder()));
	//   21   35:new             #370 <Class StringBuilder>
	//   22   38:dup             
	//   23   39:invokespecial   #371 <Method void StringBuilder()>
	//   24   42:astore_2        
			((StringBuilder) (connectionrecord)).append("onLoadItem must call detach() or sendResult() before returning for id=");
	//   25   43:aload_2         
	//   26   44:ldc2            #408 <String "onLoadItem must call detach() or sendResult() before returning for id=">
	//   27   47:invokevirtual   #377 <Method StringBuilder StringBuilder.append(String)>
	//   28   50:pop             
			((StringBuilder) (connectionrecord)).append(final_obj);
	//   29   51:aload_2         
	//   30   52:aload_1         
	//   31   53:invokevirtual   #377 <Method StringBuilder StringBuilder.append(String)>
	//   32   56:pop             
			throw new IllegalStateException(((StringBuilder) (connectionrecord)).toString());
	//   33   57:new             #384 <Class IllegalStateException>
	//   34   60:dup             
	//   35   61:aload_2         
	//   36   62:invokevirtual   #388 <Method String StringBuilder.toString()>
	//   37   65:invokespecial   #389 <Method void IllegalStateException(String)>
	//   38   68:athrow          
		}
	}

	void performSearch(final String final_obj, Bundle bundle, ConnectionRecord connectionrecord, ResultReceiver resultreceiver)
	{
		resultreceiver = ((ResultReceiver) (new Result(resultreceiver) {

			volatile void onResultSent(Object obj)
			{
				onResultSent((List)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #27  <Class List>
			//    3    5:invokevirtual   #30  <Method void onResultSent(List)>
			//    4    8:return          
			}

			void onResultSent(List list)
			{
				if((getFlags() & 4) == 0 && list != null)
			//*   0    0:aload_0         
			//*   1    1:invokevirtual   #34  <Method int getFlags()>
			//*   2    4:iconst_4        
			//*   3    5:iand            
			//*   4    6:ifne            53
			//*   5    9:aload_1         
			//*   6   10:ifnonnull       16
			//*   7   13:goto            53
				{
					Bundle bundle1 = new Bundle();
			//    8   16:new             #36  <Class Bundle>
			//    9   19:dup             
			//   10   20:invokespecial   #39  <Method void Bundle()>
			//   11   23:astore_2        
					bundle1.putParcelableArray("search_results", (android.os.Parcelable[])list.toArray(((Object []) (new MediaBrowserCompat.MediaItem[0]))));
			//   12   24:aload_2         
			//   13   25:ldc1            #41  <String "search_results">
			//   14   27:aload_1         
			//   15   28:iconst_0        
			//   16   29:anewarray       MediaBrowserCompat.MediaItem[]
			//   17   32:invokeinterface #47  <Method Object[] List.toArray(Object[])>
			//   18   37:checkcast       #49  <Class android.os.Parcelable[]>
			//   19   40:invokevirtual   #53  <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
					receiver.send(0, bundle1);
			//   20   43:aload_0         
			//   21   44:getfield        #20  <Field ResultReceiver val$receiver>
			//   22   47:iconst_0        
			//   23   48:aload_2         
			//   24   49:invokevirtual   #59  <Method void ResultReceiver.send(int, Bundle)>
					return;
			//   25   52:return          
				} else
				{
					receiver.send(-1, ((Bundle) (null)));
			//   26   53:aload_0         
			//   27   54:getfield        #20  <Field ResultReceiver val$receiver>
			//   28   57:iconst_m1       
			//   29   58:aconst_null     
			//   30   59:invokevirtual   #59  <Method void ResultReceiver.send(int, Bundle)>
					return;
			//   31   62:return          
				}
			}

			final MediaBrowserServiceCompat this$0;
			final ResultReceiver val$receiver;

			
			{
				this$0 = MediaBrowserServiceCompat.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field MediaBrowserServiceCompat this$0>
				receiver = resultreceiver;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #20  <Field ResultReceiver val$receiver>
				super(final_obj);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:invokespecial   #23  <Method void MediaBrowserServiceCompat$Result(Object)>
			//    9   15:return          
			}
		}
));
	//    0    0:new             #10  <Class MediaBrowserServiceCompat$3>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload           4
	//    5    8:invokespecial   #410 <Method void MediaBrowserServiceCompat$3(MediaBrowserServiceCompat, Object, ResultReceiver)>
	//    6   11:astore          4
		mCurConnection = connectionrecord;
	//    7   13:aload_0         
	//    8   14:aload_3         
	//    9   15:putfield        #223 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		onSearch(final_obj, bundle, ((Result) (resultreceiver)));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:aload           4
	//   14   23:invokevirtual   #412 <Method void onSearch(String, Bundle, MediaBrowserServiceCompat$Result)>
		mCurConnection = null;
	//   15   26:aload_0         
	//   16   27:aconst_null     
	//   17   28:putfield        #223 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		if(((Result) (resultreceiver)).isDone())
	//*  18   31:aload           4
	//*  19   33:invokevirtual   #368 <Method boolean MediaBrowserServiceCompat$Result.isDone()>
	//*  20   36:ifeq            40
		{
			return;
	//   21   39:return          
		} else
		{
			bundle = ((Bundle) (new StringBuilder()));
	//   22   40:new             #370 <Class StringBuilder>
	//   23   43:dup             
	//   24   44:invokespecial   #371 <Method void StringBuilder()>
	//   25   47:astore_2        
			((StringBuilder) (bundle)).append("onSearch must call detach() or sendResult() before returning for query=");
	//   26   48:aload_2         
	//   27   49:ldc2            #414 <String "onSearch must call detach() or sendResult() before returning for query=">
	//   28   52:invokevirtual   #377 <Method StringBuilder StringBuilder.append(String)>
	//   29   55:pop             
			((StringBuilder) (bundle)).append(final_obj);
	//   30   56:aload_2         
	//   31   57:aload_1         
	//   32   58:invokevirtual   #377 <Method StringBuilder StringBuilder.append(String)>
	//   33   61:pop             
			throw new IllegalStateException(((StringBuilder) (bundle)).toString());
	//   34   62:new             #384 <Class IllegalStateException>
	//   35   65:dup             
	//   36   66:aload_2         
	//   37   67:invokevirtual   #388 <Method String StringBuilder.toString()>
	//   38   70:invokespecial   #389 <Method void IllegalStateException(String)>
	//   39   73:athrow          
		}
	}

	boolean removeSubscription(String s, ConnectionRecord connectionrecord, IBinder ibinder)
	{
		boolean flag;
		boolean flag1;
		boolean flag2;
		flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		flag2 = false;
	//    2    3:iconst_0        
	//    3    4:istore          6
		flag = false;
	//    4    6:iconst_0        
	//    5    7:istore          4
		if(ibinder != null)
			break MISSING_BLOCK_LABEL_54;
	//    6    9:aload_3         
	//    7   10:ifnonnull       54
		ibinder = ((IBinder) (connectionrecord.subscriptions.remove(((Object) (s)))));
	//    8   13:aload_2         
	//    9   14:getfield        #164 <Field HashMap MediaBrowserServiceCompat$ConnectionRecord.subscriptions>
	//   10   17:aload_1         
	//   11   18:invokevirtual   #419 <Method Object HashMap.remove(Object)>
	//   12   21:astore_3        
		if(ibinder != null)
	//*  13   22:aload_3         
	//*  14   23:ifnull          33
			flag = flag1;
	//   15   26:iload           5
	//   16   28:istore          4
		else
	//*  17   30:goto            36
			flag = false;
	//   18   33:iconst_0        
	//   19   34:istore          4
		mCurConnection = connectionrecord;
	//   20   36:aload_0         
	//   21   37:aload_2         
	//   22   38:putfield        #223 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		onUnsubscribe(s);
	//   23   41:aload_0         
	//   24   42:aload_1         
	//   25   43:invokevirtual   #421 <Method void onUnsubscribe(String)>
		mCurConnection = null;
	//   26   46:aload_0         
	//   27   47:aconst_null     
	//   28   48:putfield        #223 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		return flag;
	//   29   51:iload           4
	//   30   53:ireturn         
		List list = (List)connectionrecord.subscriptions.get(((Object) (s)));
	//   31   54:aload_2         
	//   32   55:getfield        #164 <Field HashMap MediaBrowserServiceCompat$ConnectionRecord.subscriptions>
	//   33   58:aload_1         
	//   34   59:invokevirtual   #170 <Method Object HashMap.get(Object)>
	//   35   62:checkcast       #172 <Class List>
	//   36   65:astore          7
		flag1 = flag2;
	//   37   67:iload           6
	//   38   69:istore          5
		if(list == null)
			break MISSING_BLOCK_LABEL_152;
	//   39   71:aload           7
	//   40   73:ifnull          152
		Iterator iterator = list.iterator();
	//   41   76:aload           7
	//   42   78:invokeinterface #179 <Method Iterator List.iterator()>
	//   43   83:astore          8
_L1:
		do
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_125;
	//   44   85:aload           8
	//   45   87:invokeinterface #185 <Method boolean Iterator.hasNext()>
	//   46   92:ifeq            125
		while(ibinder != ((Pair)iterator.next()).first);
	//   47   95:aload_3         
	//   48   96:aload           8
	//   49   98:invokeinterface #189 <Method Object Iterator.next()>
	//   50  103:checkcast       #191 <Class Pair>
	//   51  106:getfield        #195 <Field Object Pair.first>
	//   52  109:if_acmpne       85
		iterator.remove();
	//   53  112:aload           8
	//   54  114:invokeinterface #423 <Method void Iterator.remove()>
		flag = true;
	//   55  119:iconst_1        
	//   56  120:istore          4
		  goto _L1
	//*  57  122:goto            85
		flag1 = flag;
	//   58  125:iload           4
	//   59  127:istore          5
		if(list.size() != 0)
			break MISSING_BLOCK_LABEL_152;
	//   60  129:aload           7
	//   61  131:invokeinterface #241 <Method int List.size()>
	//   62  136:ifne            152
		connectionrecord.subscriptions.remove(((Object) (s)));
	//   63  139:aload_2         
	//   64  140:getfield        #164 <Field HashMap MediaBrowserServiceCompat$ConnectionRecord.subscriptions>
	//   65  143:aload_1         
	//   66  144:invokevirtual   #419 <Method Object HashMap.remove(Object)>
	//   67  147:pop             
		flag1 = flag;
	//   68  148:iload           4
	//   69  150:istore          5
		mCurConnection = connectionrecord;
	//   70  152:aload_0         
	//   71  153:aload_2         
	//   72  154:putfield        #223 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		onUnsubscribe(s);
	//   73  157:aload_0         
	//   74  158:aload_1         
	//   75  159:invokevirtual   #421 <Method void onUnsubscribe(String)>
		mCurConnection = null;
	//   76  162:aload_0         
	//   77  163:aconst_null     
	//   78  164:putfield        #223 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		return flag1;
	//   79  167:iload           5
	//   80  169:ireturn         
		ibinder;
	//   81  170:astore_3        
		mCurConnection = connectionrecord;
	//   82  171:aload_0         
	//   83  172:aload_2         
	//   84  173:putfield        #223 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		onUnsubscribe(s);
	//   85  176:aload_0         
	//   86  177:aload_1         
	//   87  178:invokevirtual   #421 <Method void onUnsubscribe(String)>
		mCurConnection = null;
	//   88  181:aload_0         
	//   89  182:aconst_null     
	//   90  183:putfield        #223 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		throw ibinder;
	//   91  186:aload_3         
	//   92  187:athrow          
	}

	public void setSessionToken(android.support.v4.media.session.MediaSessionCompat.Token token)
	{
		if(token != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          38
		{
			if(mSession == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #277 <Field android.support.v4.media.session.MediaSessionCompat$Token mSession>
	//*   4    8:ifnonnull       27
			{
				mSession = token;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #277 <Field android.support.v4.media.session.MediaSessionCompat$Token mSession>
				mImpl.setSessionToken(token);
	//    8   16:aload_0         
	//    9   17:getfield        #265 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
	//   10   20:aload_1         
	//   11   21:invokeinterface #427 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImpl.setSessionToken(android.support.v4.media.session.MediaSessionCompat$Token)>
				return;
	//   12   26:return          
			} else
			{
				throw new IllegalStateException("The session token has already been set.");
	//   13   27:new             #384 <Class IllegalStateException>
	//   14   30:dup             
	//   15   31:ldc2            #429 <String "The session token has already been set.">
	//   16   34:invokespecial   #389 <Method void IllegalStateException(String)>
	//   17   37:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("Session token may not be null.");
	//   18   38:new             #300 <Class IllegalArgumentException>
	//   19   41:dup             
	//   20   42:ldc2            #431 <String "Session token may not be null.">
	//   21   45:invokespecial   #305 <Method void IllegalArgumentException(String)>
	//   22   48:athrow          
		}
	}

	static final boolean DEBUG = Log.isLoggable("MBServiceCompat", 3);
	private static final float EPSILON = 1E-05F;
	public static final String KEY_MEDIA_ITEM = "media_item";
	public static final String KEY_SEARCH_RESULTS = "search_results";
	public static final int RESULT_ERROR = -1;
	static final int RESULT_FLAG_ON_LOAD_ITEM_NOT_IMPLEMENTED = 2;
	static final int RESULT_FLAG_ON_SEARCH_NOT_IMPLEMENTED = 4;
	static final int RESULT_FLAG_OPTION_NOT_HANDLED = 1;
	public static final int RESULT_OK = 0;
	public static final int RESULT_PROGRESS_UPDATE = 1;
	public static final String SERVICE_INTERFACE = "android.media.browse.MediaBrowserService";
	static final String TAG = "MBServiceCompat";
	final ArrayMap mConnections = new ArrayMap();
	ConnectionRecord mCurConnection;
	final ServiceHandler mHandler = new ServiceHandler();
	private MediaBrowserServiceImpl mImpl;
	android.support.v4.media.session.MediaSessionCompat.Token mSession;

	static 
	{
	//    0    0:ldc1            #123 <String "MBServiceCompat">
	//    1    2:iconst_3        
	//    2    3:invokestatic    #142 <Method boolean Log.isLoggable(String, int)>
	//    3    6:putstatic       #144 <Field boolean DEBUG>
	//*   4    9:return          
	}
}
