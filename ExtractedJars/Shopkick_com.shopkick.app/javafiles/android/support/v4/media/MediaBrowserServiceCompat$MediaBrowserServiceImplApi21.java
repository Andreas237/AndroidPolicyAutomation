// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.Intent;
import android.os.*;
import android.support.v4.app.BundleCompat;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.util.ArrayMap;
import android.support.v4.util.Pair;
import java.util.*;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat, MediaBrowserCompatUtils, MediaBrowserServiceCompatApi21

class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21
	implements MediaBrowserServiceCompat.MediaBrowserServiceImpl, MediaBrowserServiceCompatApi21.ServiceCompatProxy
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

	void notifyChildrenChangedForCompat(final MediaSessionManager.RemoteUserInfo remoteUserInfo, final String parentId, final Bundle options)
	{
		mHandler.post(new Runnable() {

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
					MediaBrowserServiceCompat.ConnectionRecord connectionrecord = (MediaBrowserServiceCompat.ConnectionRecord)mConnections.valueAt(i);
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

			final MediaBrowserServiceCompat.MediaBrowserServiceImplApi21 this$1;
			final Bundle val$options;
			final String val$parentId;
			final MediaSessionManager.RemoteUserInfo val$remoteUserInfo;

			
			{
				this$1 = MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.this;
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

	void notifyChildrenChangedForCompat(final String parentId, final Bundle options)
	{
		mHandler.post(new Runnable() {

			public void run()
			{
				Object obj;
				for(Iterator iterator = mConnections.keySet().iterator(); iterator.hasNext(); notifyChildrenChangedForCompatOnHandler(((MediaBrowserServiceCompat.ConnectionRecord) (obj)), parentId, options))
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
					obj = ((Object) ((MediaBrowserServiceCompat.ConnectionRecord)mConnections.get(obj)));
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

			final MediaBrowserServiceCompat.MediaBrowserServiceImplApi21 this$1;
			final Bundle val$options;
			final String val$parentId;

			
			{
				this$1 = MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
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

	void notifyChildrenChangedForCompatOnHandler(MediaBrowserServiceCompat.ConnectionRecord connectionrecord, String s, Bundle bundle)
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
		mServiceObj = MediaBrowserServiceCompatApi21.createService(((android.content.Context) (MediaBrowserServiceCompat.this)), ((MediaBrowserServiceCompatApi21.ServiceCompatProxy) (this)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field MediaBrowserServiceCompat this$0>
	//    3    5:aload_0         
	//    4    6:invokestatic    #163 <Method Object MediaBrowserServiceCompatApi21.createService(android.content.Context, MediaBrowserServiceCompatApi21$ServiceCompatProxy)>
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
			mMessenger = new Messenger(((android.os.Handler) (mHandler)));
	//   10   20:aload_0         
	//   11   21:new             #179 <Class Messenger>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:getfield        #35  <Field MediaBrowserServiceCompat this$0>
	//   15   29:getfield        #91  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
	//   16   32:invokespecial   #182 <Method void Messenger(android.os.Handler)>
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
		mediabrowserservicecompat.mCurConnection = new MediaBrowserServiceCompat.ConnectionRecord(mediabrowserservicecompat, s, -1, i, bundle, ((MediaBrowserServiceCompat.ServiceCallbacks) (null)));
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
			s = ((String) (((MediaBrowserServiceCompat.BrowserRoot) (bundle)).getExtras()));
	//   97  204:aload_3         
	//   98  205:invokevirtual   #233 <Method Bundle MediaBrowserServiceCompat$BrowserRoot.getExtras()>
	//   99  208:astore_1        
		} else
	//* 100  209:goto            234
		{
			s = ((String) (obj));
	//  101  212:aload           4
	//  102  214:astore_1        
			if(((MediaBrowserServiceCompat.BrowserRoot) (bundle)).getExtras() != null)
	//* 103  215:aload_3         
	//* 104  216:invokevirtual   #233 <Method Bundle MediaBrowserServiceCompat$BrowserRoot.getExtras()>
	//* 105  219:ifnull          234
			{
				((Bundle) (obj)).putAll(((MediaBrowserServiceCompat.BrowserRoot) (bundle)).getExtras());
	//  106  222:aload           4
	//  107  224:aload_3         
	//  108  225:invokevirtual   #233 <Method Bundle MediaBrowserServiceCompat$BrowserRoot.getExtras()>
	//  109  228:invokevirtual   #236 <Method void Bundle.putAll(Bundle)>
				s = ((String) (obj));
	//  110  231:aload           4
	//  111  233:astore_1        
			}
		}
		return new MediaBrowserServiceCompatApi21.BrowserRoot(((MediaBrowserServiceCompat.BrowserRoot) (bundle)).getRootId(), ((Bundle) (s)));
	//  112  234:new             #238 <Class MediaBrowserServiceCompatApi21$BrowserRoot>
	//  113  237:dup             
	//  114  238:aload_3         
	//  115  239:invokevirtual   #242 <Method String MediaBrowserServiceCompat$BrowserRoot.getRootId()>
	//  116  242:aload_1         
	//  117  243:invokespecial   #244 <Method void MediaBrowserServiceCompatApi21$BrowserRoot(String, Bundle)>
	//  118  246:areturn         
	}

	public void onLoadChildren(final String final_obj, MediaBrowserServiceCompatApi21.ResultWrapper resultwrapper)
	{
		resultwrapper = ((MediaBrowserServiceCompatApi21.ResultWrapper) (new MediaBrowserServiceCompat.Result(resultwrapper) {

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

			final MediaBrowserServiceCompat.MediaBrowserServiceImplApi21 this$1;
			final MediaBrowserServiceCompatApi21.ResultWrapper val$resultWrapper;

			
			{
				this$1 = MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
				resultWrapper = resultwrapper;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #23  <Field MediaBrowserServiceCompatApi21$ResultWrapper val$resultWrapper>
				super(final_obj);
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
		MediaBrowserServiceCompat.this.onLoadChildren(final_obj, ((MediaBrowserServiceCompat.Result) (resultwrapper)));
	//    7   11:aload_0         
	//    8   12:getfield        #35  <Field MediaBrowserServiceCompat this$0>
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokevirtual   #252 <Method void MediaBrowserServiceCompat.onLoadChildren(String, MediaBrowserServiceCompat$Result)>
	//   12   20:return          
	}

	public void setSessionToken(final android.support.v4.media.session.MediaSessionCompat.Token token)
	{
		mHandler.postOrRun(new Runnable() {

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

			final MediaBrowserServiceCompat.MediaBrowserServiceImplApi21 this$1;
			final android.support.v4.media.session.MediaSessionCompat.Token val$token;

			
			{
				this$1 = MediaBrowserServiceCompat.MediaBrowserServiceImplApi21.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
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

	MediaBrowserServiceCompat$MediaBrowserServiceImplApi21()
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
