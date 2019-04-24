// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.*;
import android.support.v4.app.BundleCompat;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.os.ResultReceiver;
import android.support.v4.util.ArrayMap;
import android.support.v4.util.Pair;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.annotation.Annotation;
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
		//    1    1:getfield        #42  <Field Bundle mExtras>
		//    2    4:areturn         
		}

		public String getRootId()
		{
			return mRootId;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field String mRootId>
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
			if(s == null)
		//*   2    4:aload_1         
		//*   3    5:ifnonnull       18
			{
				throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead.");
		//    4    8:new             #33  <Class IllegalArgumentException>
		//    5   11:dup             
		//    6   12:ldc1            #35  <String "The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead.">
		//    7   14:invokespecial   #38  <Method void IllegalArgumentException(String)>
		//    8   17:athrow          
			} else
			{
				mRootId = s;
		//    9   18:aload_0         
		//   10   19:aload_1         
		//   11   20:putfield        #40  <Field String mRootId>
				mExtras = bundle;
		//   12   23:aload_0         
		//   13   24:aload_2         
		//   14   25:putfield        #42  <Field Bundle mExtras>
				return;
		//   15   28:return          
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
		//    1    1:getfield        #28  <Field MediaBrowserServiceCompat this$0>
		//    2    4:getfield        #42  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//    3    7:new             #11  <Class MediaBrowserServiceCompat$ConnectionRecord$1>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:invokespecial   #45  <Method void MediaBrowserServiceCompat$ConnectionRecord$1(MediaBrowserServiceCompat$ConnectionRecord)>
		//    7   15:invokevirtual   #51  <Method boolean MediaBrowserServiceCompat$ServiceHandler.post(Runnable)>
		//    8   18:pop             
		//    9   19:return          
		}

		ServiceCallbacks callbacks;
		String pkg;
		BrowserRoot root;
		Bundle rootHints;
		HashMap subscriptions;
		final MediaBrowserServiceCompat this$0;

		ConnectionRecord()
		{
			this$0 = MediaBrowserServiceCompat.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #28  <Field MediaBrowserServiceCompat this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #31  <Method void Object()>
			subscriptions = new HashMap();
		//    5    9:aload_0         
		//    6   10:new             #33  <Class HashMap>
		//    7   13:dup             
		//    8   14:invokespecial   #34  <Method void HashMap()>
		//    9   17:putfield        #36  <Field HashMap subscriptions>
		//   10   20:return          
		}
	}

	static interface MediaBrowserServiceImpl
	{

		public abstract Bundle getBrowserRootHints();

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
		//*   1    1:getfield        #46  <Field Messenger mMessenger>
		//*   2    4:ifnonnull       9
				return null;
		//    3    7:aconst_null     
		//    4    8:areturn         
			if(mCurConnection == null)
		//*   5    9:aload_0         
		//*   6   10:getfield        #33  <Field MediaBrowserServiceCompat this$0>
		//*   7   13:getfield        #50  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
		//*   8   16:ifnonnull       29
				throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem or onSearch methods");
		//    9   19:new             #52  <Class IllegalStateException>
		//   10   22:dup             
		//   11   23:ldc1            #54  <String "This should be called inside of onLoadChildren, onLoadItem or onSearch methods">
		//   12   25:invokespecial   #57  <Method void IllegalStateException(String)>
		//   13   28:athrow          
			if(mCurConnection.rootHints == null)
		//*  14   29:aload_0         
		//*  15   30:getfield        #33  <Field MediaBrowserServiceCompat this$0>
		//*  16   33:getfield        #50  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
		//*  17   36:getfield        #63  <Field Bundle MediaBrowserServiceCompat$ConnectionRecord.rootHints>
		//*  18   39:ifnonnull       44
				return null;
		//   19   42:aconst_null     
		//   20   43:areturn         
			else
				return new Bundle(mCurConnection.rootHints);
		//   21   44:new             #65  <Class Bundle>
		//   22   47:dup             
		//   23   48:aload_0         
		//   24   49:getfield        #33  <Field MediaBrowserServiceCompat this$0>
		//   25   52:getfield        #50  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
		//   26   55:getfield        #63  <Field Bundle MediaBrowserServiceCompat$ConnectionRecord.rootHints>
		//   27   58:invokespecial   #68  <Method void Bundle(Bundle)>
		//   28   61:areturn         
		}

		public void notifyChildrenChanged(String s, Bundle bundle)
		{
			notifyChildrenChangedForFramework(s, bundle);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #73  <Method void notifyChildrenChangedForFramework(String, Bundle)>
			notifyChildrenChangedForCompat(s, bundle);
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:aload_2         
		//    7    9:invokevirtual   #76  <Method void notifyChildrenChangedForCompat(String, Bundle)>
		//    8   12:return          
		}

		void notifyChildrenChangedForCompat(final String parentId, Bundle bundle)
		{
			mHandler.post(((_cls3) (bundle)). new Runnable() {

				public void run()
				{
					for(Iterator iterator = mConnections.keySet().iterator(); iterator.hasNext();)
				//*   0    0:aload_0         
				//*   1    1:getfield        #24  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
				//*   2    4:getfield        #37  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$MediaBrowserServiceImplApi21.this$0>
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
						obj = ((Object) ((ConnectionRecord)mConnections.get(obj)));
				//   14   38:aload_0         
				//   15   39:getfield        #24  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
				//   16   42:getfield        #37  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$MediaBrowserServiceImplApi21.this$0>
				//   17   45:getfield        #41  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
				//   18   48:aload_2         
				//   19   49:invokevirtual   #69  <Method Object ArrayMap.get(Object)>
				//   20   52:checkcast       #71  <Class MediaBrowserServiceCompat$ConnectionRecord>
				//   21   55:astore_2        
						Object obj1 = ((Object) ((List)((ConnectionRecord) (obj)).subscriptions.get(((Object) (parentId)))));
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
									performLoadChildren(parentId, ((ConnectionRecord) (obj)), (Bundle)pair.second);
				//   48  120:aload_0         
				//   49  121:getfield        #24  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
				//   50  124:getfield        #37  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$MediaBrowserServiceImplApi21.this$0>
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
		//    1    1:getfield        #33  <Field MediaBrowserServiceCompat this$0>
		//    2    4:getfield        #80  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//    3    7:new             #17  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$3>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:aload_2         
		//    8   14:invokespecial   #83  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$3(MediaBrowserServiceCompat$MediaBrowserServiceImplApi21, String, Bundle)>
		//    9   17:invokevirtual   #89  <Method boolean MediaBrowserServiceCompat$ServiceHandler.post(Runnable)>
		//   10   20:pop             
		//   11   21:return          
		}

		void notifyChildrenChangedForFramework(String s, Bundle bundle)
		{
			MediaBrowserServiceCompatApi21.notifyChildrenChanged(mServiceObj, s);
		//    0    0:aload_0         
		//    1    1:getfield        #91  <Field Object mServiceObj>
		//    2    4:aload_1         
		//    3    5:invokestatic    #96  <Method void MediaBrowserServiceCompatApi21.notifyChildrenChanged(Object, String)>
		//    4    8:return          
		}

		public IBinder onBind(Intent intent)
		{
			return MediaBrowserServiceCompatApi21.onBind(mServiceObj, intent);
		//    0    0:aload_0         
		//    1    1:getfield        #91  <Field Object mServiceObj>
		//    2    4:aload_1         
		//    3    5:invokestatic    #101 <Method IBinder MediaBrowserServiceCompatApi21.onBind(Object, Intent)>
		//    4    8:areturn         
		}

		public void onCreate()
		{
			mServiceObj = MediaBrowserServiceCompatApi21.createService(((android.content.Context) (MediaBrowserServiceCompat.this)), ((MediaBrowserServiceCompatApi21.ServiceCompatProxy) (this)));
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #33  <Field MediaBrowserServiceCompat this$0>
		//    3    5:aload_0         
		//    4    6:invokestatic    #106 <Method Object MediaBrowserServiceCompatApi21.createService(android.content.Context, MediaBrowserServiceCompatApi21$ServiceCompatProxy)>
		//    5    9:putfield        #91  <Field Object mServiceObj>
			MediaBrowserServiceCompatApi21.onCreate(mServiceObj);
		//    6   12:aload_0         
		//    7   13:getfield        #91  <Field Object mServiceObj>
		//    8   16:invokestatic    #109 <Method void MediaBrowserServiceCompatApi21.onCreate(Object)>
		//    9   19:return          
		}

		public MediaBrowserServiceCompatApi21.BrowserRoot onGetRoot(String s, int i, Bundle bundle)
		{
			Object obj;
			if(bundle != null && bundle.getInt("extra_client_version", 0) != 0)
		//*   0    0:aload_3         
		//*   1    1:ifnull          146
		//*   2    4:aload_3         
		//*   3    5:ldc1            #113 <String "extra_client_version">
		//*   4    7:iconst_0        
		//*   5    8:invokevirtual   #117 <Method int Bundle.getInt(String, int)>
		//*   6   11:ifeq            146
			{
				bundle.remove("extra_client_version");
		//    7   14:aload_3         
		//    8   15:ldc1            #113 <String "extra_client_version">
		//    9   17:invokevirtual   #120 <Method void Bundle.remove(String)>
				mMessenger = new Messenger(((Handler) (mHandler)));
		//   10   20:aload_0         
		//   11   21:new             #122 <Class Messenger>
		//   12   24:dup             
		//   13   25:aload_0         
		//   14   26:getfield        #33  <Field MediaBrowserServiceCompat this$0>
		//   15   29:getfield        #80  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//   16   32:invokespecial   #125 <Method void Messenger(Handler)>
		//   17   35:putfield        #46  <Field Messenger mMessenger>
				Bundle bundle1 = new Bundle();
		//   18   38:new             #65  <Class Bundle>
		//   19   41:dup             
		//   20   42:invokespecial   #126 <Method void Bundle()>
		//   21   45:astore          5
				bundle1.putInt("extra_service_version", 2);
		//   22   47:aload           5
		//   23   49:ldc1            #128 <String "extra_service_version">
		//   24   51:iconst_2        
		//   25   52:invokevirtual   #132 <Method void Bundle.putInt(String, int)>
				BundleCompat.putBinder(bundle1, "extra_messenger", mMessenger.getBinder());
		//   26   55:aload           5
		//   27   57:ldc1            #134 <String "extra_messenger">
		//   28   59:aload_0         
		//   29   60:getfield        #46  <Field Messenger mMessenger>
		//   30   63:invokevirtual   #138 <Method IBinder Messenger.getBinder()>
		//   31   66:invokestatic    #144 <Method void BundleCompat.putBinder(Bundle, String, IBinder)>
				if(mSession != null)
		//*  32   69:aload_0         
		//*  33   70:getfield        #33  <Field MediaBrowserServiceCompat this$0>
		//*  34   73:getfield        #148 <Field android.support.v4.media.session.MediaSessionCompat$Token MediaBrowserServiceCompat.mSession>
		//*  35   76:ifnull          127
				{
					obj = ((Object) (mSession.getExtraBinder()));
		//   36   79:aload_0         
		//   37   80:getfield        #33  <Field MediaBrowserServiceCompat this$0>
		//   38   83:getfield        #148 <Field android.support.v4.media.session.MediaSessionCompat$Token MediaBrowserServiceCompat.mSession>
		//   39   86:invokevirtual   #154 <Method IMediaSession android.support.v4.media.session.MediaSessionCompat$Token.getExtraBinder()>
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
		//   47  104:invokeinterface #159 <Method IBinder IMediaSession.asBinder()>
		//   48  109:astore          4
					BundleCompat.putBinder(bundle1, "extra_session_binder", ((IBinder) (obj)));
		//   49  111:aload           5
		//   50  113:ldc1            #161 <String "extra_session_binder">
		//   51  115:aload           4
		//   52  117:invokestatic    #144 <Method void BundleCompat.putBinder(Bundle, String, IBinder)>
					obj = ((Object) (bundle1));
		//   53  120:aload           5
		//   54  122:astore          4
				} else
		//*  55  124:goto            149
				{
					mRootExtrasList.add(((Object) (bundle1)));
		//   56  127:aload_0         
		//   57  128:getfield        #41  <Field List mRootExtrasList>
		//   58  131:aload           5
		//   59  133:invokeinterface #167 <Method boolean List.add(Object)>
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
			bundle = ((Bundle) (MediaBrowserServiceCompat.this.onGetRoot(s, i, bundle)));
		//   66  149:aload_0         
		//   67  150:getfield        #33  <Field MediaBrowserServiceCompat this$0>
		//   68  153:aload_1         
		//   69  154:iload_2         
		//   70  155:aload_3         
		//   71  156:invokevirtual   #170 <Method MediaBrowserServiceCompat$BrowserRoot MediaBrowserServiceCompat.onGetRoot(String, int, Bundle)>
		//   72  159:astore_3        
			if(bundle == null)
		//*  73  160:aload_3         
		//*  74  161:ifnonnull       166
				return null;
		//   75  164:aconst_null     
		//   76  165:areturn         
			if(obj == null)
		//*  77  166:aload           4
		//*  78  168:ifnonnull       179
			{
				s = ((String) (((BrowserRoot) (bundle)).getExtras()));
		//   79  171:aload_3         
		//   80  172:invokevirtual   #175 <Method Bundle MediaBrowserServiceCompat$BrowserRoot.getExtras()>
		//   81  175:astore_1        
			} else
		//*  82  176:goto            201
			{
				s = ((String) (obj));
		//   83  179:aload           4
		//   84  181:astore_1        
				if(((BrowserRoot) (bundle)).getExtras() != null)
		//*  85  182:aload_3         
		//*  86  183:invokevirtual   #175 <Method Bundle MediaBrowserServiceCompat$BrowserRoot.getExtras()>
		//*  87  186:ifnull          201
				{
					((Bundle) (obj)).putAll(((BrowserRoot) (bundle)).getExtras());
		//   88  189:aload           4
		//   89  191:aload_3         
		//   90  192:invokevirtual   #175 <Method Bundle MediaBrowserServiceCompat$BrowserRoot.getExtras()>
		//   91  195:invokevirtual   #178 <Method void Bundle.putAll(Bundle)>
					s = ((String) (obj));
		//   92  198:aload           4
		//   93  200:astore_1        
				}
			}
			return new MediaBrowserServiceCompatApi21.BrowserRoot(((BrowserRoot) (bundle)).getRootId(), ((Bundle) (s)));
		//   94  201:new             #180 <Class MediaBrowserServiceCompatApi21$BrowserRoot>
		//   95  204:dup             
		//   96  205:aload_3         
		//   97  206:invokevirtual   #184 <Method String MediaBrowserServiceCompat$BrowserRoot.getRootId()>
		//   98  209:aload_1         
		//   99  210:invokespecial   #186 <Method void MediaBrowserServiceCompatApi21$BrowserRoot(String, Bundle)>
		//  100  213:areturn         
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
		//    5    7:invokespecial   #191 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$2(MediaBrowserServiceCompat$MediaBrowserServiceImplApi21, Object, MediaBrowserServiceCompatApi21$ResultWrapper)>
		//    6   10:astore_2        
			MediaBrowserServiceCompat.this.onLoadChildren(s, ((Result) (resultwrapper)));
		//    7   11:aload_0         
		//    8   12:getfield        #33  <Field MediaBrowserServiceCompat this$0>
		//    9   15:aload_1         
		//   10   16:aload_2         
		//   11   17:invokevirtual   #194 <Method void MediaBrowserServiceCompat.onLoadChildren(String, MediaBrowserServiceCompat$Result)>
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
		//    1    1:getfield        #33  <Field MediaBrowserServiceCompat this$0>
		//    2    4:getfield        #80  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//    3    7:new             #13  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$1>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:invokespecial   #201 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$1(MediaBrowserServiceCompat$MediaBrowserServiceImplApi21, android.support.v4.media.session.MediaSessionCompat$Token)>
		//    8   16:invokevirtual   #205 <Method void MediaBrowserServiceCompat$ServiceHandler.postOrRun(Runnable)>
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
		//    2    2:putfield        #33  <Field MediaBrowserServiceCompat this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #36  <Method void Object()>
		//    5    9:aload_0         
		//    6   10:new             #38  <Class ArrayList>
		//    7   13:dup             
		//    8   14:invokespecial   #39  <Method void ArrayList()>
		//    9   17:putfield        #41  <Field List mRootExtrasList>
		//   10   20:return          
		}
	}

	class MediaBrowserServiceImplApi23 extends MediaBrowserServiceImplApi21
		implements MediaBrowserServiceCompatApi23.ServiceCompatProxy
	{

		public void onCreate()
		{
			mServiceObj = MediaBrowserServiceCompatApi23.createService(((android.content.Context) (MediaBrowserServiceCompat.this)), ((MediaBrowserServiceCompatApi23.ServiceCompatProxy) (this)));
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #20  <Field MediaBrowserServiceCompat this$0>
		//    3    5:aload_0         
		//    4    6:invokestatic    #31  <Method Object MediaBrowserServiceCompatApi23.createService(android.content.Context, MediaBrowserServiceCompatApi23$ServiceCompatProxy)>
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
			mServiceObj = MediaBrowserServiceCompatApi26.createService(((android.content.Context) (MediaBrowserServiceCompat.this)), ((MediaBrowserServiceCompatApi26.ServiceCompatProxy) (this)));
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #20  <Field MediaBrowserServiceCompat this$0>
		//    3    5:aload_0         
		//    4    6:invokestatic    #63  <Method Object MediaBrowserServiceCompatApi26.createService(android.content.Context, MediaBrowserServiceCompatApi26$ServiceCompatProxy)>
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

	class MediaBrowserServiceImplBase
		implements MediaBrowserServiceImpl
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

		public void notifyChildrenChanged(final String parentId, Bundle bundle)
		{
			mHandler.post(((_cls2) (bundle)). new Runnable() {

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
						obj = ((Object) ((ConnectionRecord)mConnections.get(obj)));
				//   14   38:aload_0         
				//   15   39:getfield        #24  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplBase this$1>
				//   16   42:getfield        #37  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$MediaBrowserServiceImplBase.this$0>
				//   17   45:getfield        #41  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
				//   18   48:aload_2         
				//   19   49:invokevirtual   #69  <Method Object ArrayMap.get(Object)>
				//   20   52:checkcast       #71  <Class MediaBrowserServiceCompat$ConnectionRecord>
				//   21   55:astore_2        
						Object obj1 = ((Object) ((List)((ConnectionRecord) (obj)).subscriptions.get(((Object) (parentId)))));
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
									performLoadChildren(parentId, ((ConnectionRecord) (obj)), (Bundle)pair.second);
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
			mMessenger = new Messenger(((Handler) (mHandler)));
		//    0    0:aload_0         
		//    1    1:new             #86  <Class Messenger>
		//    2    4:dup             
		//    3    5:aload_0         
		//    4    6:getfield        #21  <Field MediaBrowserServiceCompat this$0>
		//    5    9:getfield        #56  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//    6   12:invokespecial   #94  <Method void Messenger(Handler)>
		//    7   15:putfield        #84  <Field Messenger mMessenger>
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

		MediaBrowserServiceImplBase()
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
		//*   6   11:ifeq            45
			{
				float f = bundle.getFloat("android.media.browse.extra.DOWNLOAD_PROGRESS");
		//    7   14:aload_1         
		//    8   15:ldc1            #29  <String "android.media.browse.extra.DOWNLOAD_PROGRESS">
		//    9   17:invokevirtual   #39  <Method float Bundle.getFloat(String)>
		//   10   20:fstore_2        
				if(f < -1E-05F || f > 1.00001F)
		//*  11   21:fload_2         
		//*  12   22:ldc1            #40  <Float -1E-05F>
		//*  13   24:fcmpg           
		//*  14   25:iflt            35
		//*  15   28:fload_2         
		//*  16   29:ldc1            #41  <Float 1.00001F>
		//*  17   31:fcmpl           
		//*  18   32:ifle            45
					throw new IllegalArgumentException("The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0].");
		//   19   35:new             #43  <Class IllegalArgumentException>
		//   20   38:dup             
		//   21   39:ldc1            #45  <String "The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0].">
		//   22   41:invokespecial   #48  <Method void IllegalArgumentException(String)>
		//   23   44:athrow          
			}
		//   24   45:return          
		}

		public void detach()
		{
			if(mDetachCalled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #51  <Field boolean mDetachCalled>
		//*   2    4:ifeq            43
			{
				StringBuilder stringbuilder = new StringBuilder();
		//    3    7:new             #53  <Class StringBuilder>
		//    4   10:dup             
		//    5   11:invokespecial   #54  <Method void StringBuilder()>
		//    6   14:astore_1        
				stringbuilder.append("detach() called when detach() had already been called for: ");
		//    7   15:aload_1         
		//    8   16:ldc1            #56  <String "detach() called when detach() had already been called for: ">
		//    9   18:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
		//   10   21:pop             
				stringbuilder.append(mDebug);
		//   11   22:aload_1         
		//   12   23:aload_0         
		//   13   24:getfield        #24  <Field Object mDebug>
		//   14   27:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
		//   15   30:pop             
				throw new IllegalStateException(stringbuilder.toString());
		//   16   31:new             #65  <Class IllegalStateException>
		//   17   34:dup             
		//   18   35:aload_1         
		//   19   36:invokevirtual   #69  <Method String StringBuilder.toString()>
		//   20   39:invokespecial   #70  <Method void IllegalStateException(String)>
		//   21   42:athrow          
			}
			if(mSendResultCalled)
		//*  22   43:aload_0         
		//*  23   44:getfield        #72  <Field boolean mSendResultCalled>
		//*  24   47:ifeq            86
			{
				StringBuilder stringbuilder1 = new StringBuilder();
		//   25   50:new             #53  <Class StringBuilder>
		//   26   53:dup             
		//   27   54:invokespecial   #54  <Method void StringBuilder()>
		//   28   57:astore_1        
				stringbuilder1.append("detach() called when sendResult() had already been called for: ");
		//   29   58:aload_1         
		//   30   59:ldc1            #74  <String "detach() called when sendResult() had already been called for: ">
		//   31   61:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
		//   32   64:pop             
				stringbuilder1.append(mDebug);
		//   33   65:aload_1         
		//   34   66:aload_0         
		//   35   67:getfield        #24  <Field Object mDebug>
		//   36   70:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
		//   37   73:pop             
				throw new IllegalStateException(stringbuilder1.toString());
		//   38   74:new             #65  <Class IllegalStateException>
		//   39   77:dup             
		//   40   78:aload_1         
		//   41   79:invokevirtual   #69  <Method String StringBuilder.toString()>
		//   42   82:invokespecial   #70  <Method void IllegalStateException(String)>
		//   43   85:athrow          
			}
			if(mSendErrorCalled)
		//*  44   86:aload_0         
		//*  45   87:getfield        #76  <Field boolean mSendErrorCalled>
		//*  46   90:ifeq            129
			{
				StringBuilder stringbuilder2 = new StringBuilder();
		//   47   93:new             #53  <Class StringBuilder>
		//   48   96:dup             
		//   49   97:invokespecial   #54  <Method void StringBuilder()>
		//   50  100:astore_1        
				stringbuilder2.append("detach() called when sendError() had already been called for: ");
		//   51  101:aload_1         
		//   52  102:ldc1            #78  <String "detach() called when sendError() had already been called for: ">
		//   53  104:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
		//   54  107:pop             
				stringbuilder2.append(mDebug);
		//   55  108:aload_1         
		//   56  109:aload_0         
		//   57  110:getfield        #24  <Field Object mDebug>
		//   58  113:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
		//   59  116:pop             
				throw new IllegalStateException(stringbuilder2.toString());
		//   60  117:new             #65  <Class IllegalStateException>
		//   61  120:dup             
		//   62  121:aload_1         
		//   63  122:invokevirtual   #69  <Method String StringBuilder.toString()>
		//   64  125:invokespecial   #70  <Method void IllegalStateException(String)>
		//   65  128:athrow          
			} else
			{
				mDetachCalled = true;
		//   66  129:aload_0         
		//   67  130:iconst_1        
		//   68  131:putfield        #51  <Field boolean mDetachCalled>
				return;
		//   69  134:return          
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
		//    4    8:getfield        #72  <Field boolean mSendResultCalled>
		//    5   11:ifne            26
		//    6   14:aload_0         
		//    7   15:getfield        #76  <Field boolean mSendErrorCalled>
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
		//    0    0:new             #53  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #54  <Method void StringBuilder()>
		//    3    7:astore_1        
			((StringBuilder) (bundle)).append("It is not supported to send an error for ");
		//    4    8:aload_1         
		//    5    9:ldc1            #87  <String "It is not supported to send an error for ">
		//    6   11:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			((StringBuilder) (bundle)).append(mDebug);
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:getfield        #24  <Field Object mDebug>
		//   11   20:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
		//   12   23:pop             
			throw new UnsupportedOperationException(((StringBuilder) (bundle)).toString());
		//   13   24:new             #89  <Class UnsupportedOperationException>
		//   14   27:dup             
		//   15   28:aload_1         
		//   16   29:invokevirtual   #69  <Method String StringBuilder.toString()>
		//   17   32:invokespecial   #90  <Method void UnsupportedOperationException(String)>
		//   18   35:athrow          
		}

		void onProgressUpdateSent(Bundle bundle)
		{
			bundle = ((Bundle) (new StringBuilder()));
		//    0    0:new             #53  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #54  <Method void StringBuilder()>
		//    3    7:astore_1        
			((StringBuilder) (bundle)).append("It is not supported to send an interim update for ");
		//    4    8:aload_1         
		//    5    9:ldc1            #93  <String "It is not supported to send an interim update for ">
		//    6   11:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			((StringBuilder) (bundle)).append(mDebug);
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:getfield        #24  <Field Object mDebug>
		//   11   20:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
		//   12   23:pop             
			throw new UnsupportedOperationException(((StringBuilder) (bundle)).toString());
		//   13   24:new             #89  <Class UnsupportedOperationException>
		//   14   27:dup             
		//   15   28:aload_1         
		//   16   29:invokevirtual   #69  <Method String StringBuilder.toString()>
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
		//*   1    1:getfield        #72  <Field boolean mSendResultCalled>
		//*   2    4:ifne            28
		//*   3    7:aload_0         
		//*   4    8:getfield        #76  <Field boolean mSendErrorCalled>
		//*   5   11:ifeq            17
		//*   6   14:goto            28
			{
				mSendErrorCalled = true;
		//    7   17:aload_0         
		//    8   18:iconst_1        
		//    9   19:putfield        #76  <Field boolean mSendErrorCalled>
				onErrorSent(bundle);
		//   10   22:aload_0         
		//   11   23:aload_1         
		//   12   24:invokevirtual   #99  <Method void onErrorSent(Bundle)>
				return;
		//   13   27:return          
			} else
			{
				bundle = ((Bundle) (new StringBuilder()));
		//   14   28:new             #53  <Class StringBuilder>
		//   15   31:dup             
		//   16   32:invokespecial   #54  <Method void StringBuilder()>
		//   17   35:astore_1        
				((StringBuilder) (bundle)).append("sendError() called when either sendResult() or sendError() had already been called for: ");
		//   18   36:aload_1         
		//   19   37:ldc1            #101 <String "sendError() called when either sendResult() or sendError() had already been called for: ">
		//   20   39:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
		//   21   42:pop             
				((StringBuilder) (bundle)).append(mDebug);
		//   22   43:aload_1         
		//   23   44:aload_0         
		//   24   45:getfield        #24  <Field Object mDebug>
		//   25   48:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
		//   26   51:pop             
				throw new IllegalStateException(((StringBuilder) (bundle)).toString());
		//   27   52:new             #65  <Class IllegalStateException>
		//   28   55:dup             
		//   29   56:aload_1         
		//   30   57:invokevirtual   #69  <Method String StringBuilder.toString()>
		//   31   60:invokespecial   #70  <Method void IllegalStateException(String)>
		//   32   63:athrow          
			}
		}

		public void sendProgressUpdate(Bundle bundle)
		{
			if(!mSendResultCalled && !mSendErrorCalled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #72  <Field boolean mSendResultCalled>
		//*   2    4:ifne            33
		//*   3    7:aload_0         
		//*   4    8:getfield        #76  <Field boolean mSendErrorCalled>
		//*   5   11:ifeq            17
		//*   6   14:goto            33
			{
				checkExtraFields(bundle);
		//    7   17:aload_0         
		//    8   18:aload_1         
		//    9   19:invokespecial   #104 <Method void checkExtraFields(Bundle)>
				mSendProgressUpdateCalled = true;
		//   10   22:aload_0         
		//   11   23:iconst_1        
		//   12   24:putfield        #106 <Field boolean mSendProgressUpdateCalled>
				onProgressUpdateSent(bundle);
		//   13   27:aload_0         
		//   14   28:aload_1         
		//   15   29:invokevirtual   #108 <Method void onProgressUpdateSent(Bundle)>
				return;
		//   16   32:return          
			} else
			{
				bundle = ((Bundle) (new StringBuilder()));
		//   17   33:new             #53  <Class StringBuilder>
		//   18   36:dup             
		//   19   37:invokespecial   #54  <Method void StringBuilder()>
		//   20   40:astore_1        
				((StringBuilder) (bundle)).append("sendProgressUpdate() called when either sendResult() or sendError() had already been called for: ");
		//   21   41:aload_1         
		//   22   42:ldc1            #110 <String "sendProgressUpdate() called when either sendResult() or sendError() had already been called for: ">
		//   23   44:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
		//   24   47:pop             
				((StringBuilder) (bundle)).append(mDebug);
		//   25   48:aload_1         
		//   26   49:aload_0         
		//   27   50:getfield        #24  <Field Object mDebug>
		//   28   53:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
		//   29   56:pop             
				throw new IllegalStateException(((StringBuilder) (bundle)).toString());
		//   30   57:new             #65  <Class IllegalStateException>
		//   31   60:dup             
		//   32   61:aload_1         
		//   33   62:invokevirtual   #69  <Method String StringBuilder.toString()>
		//   34   65:invokespecial   #70  <Method void IllegalStateException(String)>
		//   35   68:athrow          
			}
		}

		public void sendResult(Object obj)
		{
			if(!mSendResultCalled && !mSendErrorCalled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #72  <Field boolean mSendResultCalled>
		//*   2    4:ifne            28
		//*   3    7:aload_0         
		//*   4    8:getfield        #76  <Field boolean mSendErrorCalled>
		//*   5   11:ifeq            17
		//*   6   14:goto            28
			{
				mSendResultCalled = true;
		//    7   17:aload_0         
		//    8   18:iconst_1        
		//    9   19:putfield        #72  <Field boolean mSendResultCalled>
				onResultSent(obj);
		//   10   22:aload_0         
		//   11   23:aload_1         
		//   12   24:invokevirtual   #113 <Method void onResultSent(Object)>
				return;
		//   13   27:return          
			} else
			{
				obj = ((Object) (new StringBuilder()));
		//   14   28:new             #53  <Class StringBuilder>
		//   15   31:dup             
		//   16   32:invokespecial   #54  <Method void StringBuilder()>
		//   17   35:astore_1        
				((StringBuilder) (obj)).append("sendResult() called when either sendResult() or sendError() had already been called for: ");
		//   18   36:aload_1         
		//   19   37:ldc1            #115 <String "sendResult() called when either sendResult() or sendError() had already been called for: ">
		//   20   39:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
		//   21   42:pop             
				((StringBuilder) (obj)).append(mDebug);
		//   22   43:aload_1         
		//   23   44:aload_0         
		//   24   45:getfield        #24  <Field Object mDebug>
		//   25   48:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
		//   26   51:pop             
				throw new IllegalStateException(((StringBuilder) (obj)).toString());
		//   27   52:new             #65  <Class IllegalStateException>
		//   28   55:dup             
		//   29   56:aload_1         
		//   30   57:invokevirtual   #69  <Method String StringBuilder.toString()>
		//   31   60:invokespecial   #70  <Method void IllegalStateException(String)>
		//   32   63:athrow          
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

	private static interface ResultFlags
		extends Annotation
	{
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

		public void connect(final String pkg, int i, final Bundle rootHints, final ServiceCallbacks callbacks)
		{
			if(!isValidPackage(pkg, i))
		//*   0    0:aload_0         
		//*   1    1:getfield        #31  <Field MediaBrowserServiceCompat this$0>
		//*   2    4:aload_1         
		//*   3    5:iload_2         
		//*   4    6:invokevirtual   #56  <Method boolean MediaBrowserServiceCompat.isValidPackage(String, int)>
		//*   5    9:ifne            58
			{
				rootHints = ((Bundle) (new StringBuilder()));
		//    6   12:new             #58  <Class StringBuilder>
		//    7   15:dup             
		//    8   16:invokespecial   #59  <Method void StringBuilder()>
		//    9   19:astore_3        
				((StringBuilder) (rootHints)).append("Package/uid mismatch: uid=");
		//   10   20:aload_3         
		//   11   21:ldc1            #61  <String "Package/uid mismatch: uid=">
		//   12   23:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
		//   13   26:pop             
				((StringBuilder) (rootHints)).append(i);
		//   14   27:aload_3         
		//   15   28:iload_2         
		//   16   29:invokevirtual   #68  <Method StringBuilder StringBuilder.append(int)>
		//   17   32:pop             
				((StringBuilder) (rootHints)).append(" package=");
		//   18   33:aload_3         
		//   19   34:ldc1            #70  <String " package=">
		//   20   36:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
		//   21   39:pop             
				((StringBuilder) (rootHints)).append(pkg);
		//   22   40:aload_3         
		//   23   41:aload_1         
		//   24   42:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
		//   25   45:pop             
				throw new IllegalArgumentException(((StringBuilder) (rootHints)).toString());
		//   26   46:new             #72  <Class IllegalArgumentException>
		//   27   49:dup             
		//   28   50:aload_3         
		//   29   51:invokevirtual   #76  <Method String StringBuilder.toString()>
		//   30   54:invokespecial   #79  <Method void IllegalArgumentException(String)>
		//   31   57:athrow          
			} else
			{
				mHandler.postOrRun(((_cls1) (i)). new Runnable() {

					public void run()
					{
						RemoteException remoteexception;
						RemoteException remoteexception1;
						Object obj = ((Object) (callbacks.asBinder()));
					//    0    0:aload_0         
					//    1    1:getfield        #30  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
					//    2    4:invokeinterface #49  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
					//    3    9:astore_1        
						mConnections.remove(obj);
					//    4   10:aload_0         
					//    5   11:getfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
					//    6   14:getfield        #53  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
					//    7   17:getfield        #57  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
					//    8   20:aload_1         
					//    9   21:invokevirtual   #63  <Method Object ArrayMap.remove(Object)>
					//   10   24:pop             
						Object obj1 = ((Object) (new ConnectionRecord()));
					//   11   25:new             #65  <Class MediaBrowserServiceCompat$ConnectionRecord>
					//   12   28:dup             
					//   13   29:aload_0         
					//   14   30:getfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
					//   15   33:getfield        #53  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
					//   16   36:invokespecial   #68  <Method void MediaBrowserServiceCompat$ConnectionRecord(MediaBrowserServiceCompat)>
					//   17   39:astore_2        
						obj1.pkg = pkg;
					//   18   40:aload_2         
					//   19   41:aload_0         
					//   20   42:getfield        #32  <Field String val$pkg>
					//   21   45:putfield        #71  <Field String MediaBrowserServiceCompat$ConnectionRecord.pkg>
						obj1.rootHints = rootHints;
					//   22   48:aload_2         
					//   23   49:aload_0         
					//   24   50:getfield        #34  <Field Bundle val$rootHints>
					//   25   53:putfield        #74  <Field Bundle MediaBrowserServiceCompat$ConnectionRecord.rootHints>
						obj1.callbacks = callbacks;
					//   26   56:aload_2         
					//   27   57:aload_0         
					//   28   58:getfield        #30  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
					//   29   61:putfield        #77  <Field MediaBrowserServiceCompat$ServiceCallbacks MediaBrowserServiceCompat$ConnectionRecord.callbacks>
						obj1.root = onGetRoot(pkg, uid, rootHints);
					//   30   64:aload_2         
					//   31   65:aload_0         
					//   32   66:getfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
					//   33   69:getfield        #53  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
					//   34   72:aload_0         
					//   35   73:getfield        #32  <Field String val$pkg>
					//   36   76:aload_0         
					//   37   77:getfield        #36  <Field int val$uid>
					//   38   80:aload_0         
					//   39   81:getfield        #34  <Field Bundle val$rootHints>
					//   40   84:invokevirtual   #81  <Method MediaBrowserServiceCompat$BrowserRoot MediaBrowserServiceCompat.onGetRoot(String, int, Bundle)>
					//   41   87:putfield        #85  <Field MediaBrowserServiceCompat$BrowserRoot MediaBrowserServiceCompat$ConnectionRecord.root>
						if(((ConnectionRecord) (obj1)).root == null)
					//*  42   90:aload_2         
					//*  43   91:getfield        #85  <Field MediaBrowserServiceCompat$BrowserRoot MediaBrowserServiceCompat$ConnectionRecord.root>
					//*  44   94:ifnonnull       195
						{
							obj = ((Object) (new StringBuilder()));
					//   45   97:new             #87  <Class StringBuilder>
					//   46  100:dup             
					//   47  101:invokespecial   #88  <Method void StringBuilder()>
					//   48  104:astore_1        
							((StringBuilder) (obj)).append("No root for client ");
					//   49  105:aload_1         
					//   50  106:ldc1            #90  <String "No root for client ">
					//   51  108:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
					//   52  111:pop             
							((StringBuilder) (obj)).append(pkg);
					//   53  112:aload_1         
					//   54  113:aload_0         
					//   55  114:getfield        #32  <Field String val$pkg>
					//   56  117:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
					//   57  120:pop             
							((StringBuilder) (obj)).append(" from service ");
					//   58  121:aload_1         
					//   59  122:ldc1            #96  <String " from service ">
					//   60  124:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
					//   61  127:pop             
							((StringBuilder) (obj)).append(((Object)this).getClass().getName());
					//   62  128:aload_1         
					//   63  129:aload_0         
					//   64  130:invokevirtual   #100 <Method Class Object.getClass()>
					//   65  133:invokevirtual   #106 <Method String Class.getName()>
					//   66  136:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
					//   67  139:pop             
							Log.i("MBServiceCompat", ((StringBuilder) (obj)).toString());
					//   68  140:ldc1            #108 <String "MBServiceCompat">
					//   69  142:aload_1         
					//   70  143:invokevirtual   #111 <Method String StringBuilder.toString()>
					//   71  146:invokestatic    #117 <Method int Log.i(String, String)>
					//   72  149:pop             
							try
							{
								callbacks.onConnectFailed();
					//   73  150:aload_0         
					//   74  151:getfield        #30  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
					//   75  154:invokeinterface #120 <Method void MediaBrowserServiceCompat$ServiceCallbacks.onConnectFailed()>
								return;
					//   76  159:return          
							}
					//*  77  160:new             #87  <Class StringBuilder>
					//*  78  163:dup             
					//*  79  164:invokespecial   #88  <Method void StringBuilder()>
					//*  80  167:astore_1        
					//*  81  168:aload_1         
					//*  82  169:ldc1            #122 <String "Calling onConnectFailed() failed. Ignoring. pkg=">
					//*  83  171:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
					//*  84  174:pop             
					//*  85  175:aload_1         
					//*  86  176:aload_0         
					//*  87  177:getfield        #32  <Field String val$pkg>
					//*  88  180:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
					//*  89  183:pop             
					//*  90  184:ldc1            #108 <String "MBServiceCompat">
					//*  91  186:aload_1         
					//*  92  187:invokevirtual   #111 <Method String StringBuilder.toString()>
					//*  93  190:invokestatic    #125 <Method int Log.w(String, String)>
					//*  94  193:pop             
					//*  95  194:return          
					//*  96  195:aload_0         
					//*  97  196:getfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
					//*  98  199:getfield        #53  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
					//*  99  202:getfield        #57  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
					//* 100  205:aload_1         
					//* 101  206:aload_2         
					//* 102  207:invokevirtual   #129 <Method Object ArrayMap.put(Object, Object)>
					//* 103  210:pop             
					//* 104  211:aload_1         
					//* 105  212:aload_2         
					//* 106  213:iconst_0        
					//* 107  214:invokeinterface #135 <Method void IBinder.linkToDeath(android.os.IBinder$DeathRecipient, int)>
					//* 108  219:aload_0         
					//* 109  220:getfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
					//* 110  223:getfield        #53  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
					//* 111  226:getfield        #139 <Field android.support.v4.media.session.MediaSessionCompat$Token MediaBrowserServiceCompat.mSession>
					//* 112  229:ifnull          315
					//* 113  232:aload_0         
					//* 114  233:getfield        #30  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
					//* 115  236:aload_2         
					//* 116  237:getfield        #85  <Field MediaBrowserServiceCompat$BrowserRoot MediaBrowserServiceCompat$ConnectionRecord.root>
					//* 117  240:invokevirtual   #144 <Method String MediaBrowserServiceCompat$BrowserRoot.getRootId()>
					//* 118  243:aload_0         
					//* 119  244:getfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
					//* 120  247:getfield        #53  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
					//* 121  250:getfield        #139 <Field android.support.v4.media.session.MediaSessionCompat$Token MediaBrowserServiceCompat.mSession>
					//* 122  253:aload_2         
					//* 123  254:getfield        #85  <Field MediaBrowserServiceCompat$BrowserRoot MediaBrowserServiceCompat$ConnectionRecord.root>
					//* 124  257:invokevirtual   #148 <Method Bundle MediaBrowserServiceCompat$BrowserRoot.getExtras()>
					//* 125  260:invokeinterface #152 <Method void MediaBrowserServiceCompat$ServiceCallbacks.onConnect(String, android.support.v4.media.session.MediaSessionCompat$Token, Bundle)>
					//* 126  265:return          
					//* 127  266:new             #87  <Class StringBuilder>
					//* 128  269:dup             
					//* 129  270:invokespecial   #88  <Method void StringBuilder()>
					//* 130  273:astore_2        
					//* 131  274:aload_2         
					//* 132  275:ldc1            #154 <String "Calling onConnect() failed. Dropping client. pkg=">
					//* 133  277:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
					//* 134  280:pop             
					//* 135  281:aload_2         
					//* 136  282:aload_0         
					//* 137  283:getfield        #32  <Field String val$pkg>
					//* 138  286:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
					//* 139  289:pop             
					//* 140  290:ldc1            #108 <String "MBServiceCompat">
					//* 141  292:aload_2         
					//* 142  293:invokevirtual   #111 <Method String StringBuilder.toString()>
					//* 143  296:invokestatic    #125 <Method int Log.w(String, String)>
					//* 144  299:pop             
					//* 145  300:aload_0         
					//* 146  301:getfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
					//* 147  304:getfield        #53  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
					//* 148  307:getfield        #57  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
					//* 149  310:aload_1         
					//* 150  311:invokevirtual   #63  <Method Object ArrayMap.remove(Object)>
					//* 151  314:pop             
					//* 152  315:return          
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
					//* 153  316:astore_1        
					//* 154  317:goto            160
						// Misplaced declaration of an exception variable
						catch(RemoteException remoteexception1)
						{
							obj1 = ((Object) (new StringBuilder()));
							((StringBuilder) (obj1)).append("Calling onConnect() failed. Dropping client. pkg=");
							((StringBuilder) (obj1)).append(pkg);
							Log.w("MBServiceCompat", ((StringBuilder) (obj1)).toString());
							mConnections.remove(obj);
						}
					//* 155  320:astore_2        
					//* 156  321:goto            266
					}

					final ServiceBinderImpl this$1;
					final ServiceCallbacks val$callbacks;
					final String val$pkg;
					final Bundle val$rootHints;
					final int val$uid;

			
			{
				this$1 = final_servicebinderimpl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				callbacks = servicecallbacks;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #30  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
				pkg = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #32  <Field String val$pkg>
				rootHints = bundle;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #34  <Field Bundle val$rootHints>
				uid = I.this;
			//   12   21:aload_0         
			//   13   22:iload           5
			//   14   24:putfield        #36  <Field int val$uid>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #39  <Method void Object()>
			//   17   31:return          
			}
				}
);
		//   32   58:aload_0         
		//   33   59:getfield        #31  <Field MediaBrowserServiceCompat this$0>
		//   34   62:getfield        #41  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//   35   65:new             #9   <Class MediaBrowserServiceCompat$ServiceBinderImpl$1>
		//   36   68:dup             
		//   37   69:aload_0         
		//   38   70:aload           4
		//   39   72:aload_1         
		//   40   73:aload_3         
		//   41   74:iload_2         
		//   42   75:invokespecial   #82  <Method void MediaBrowserServiceCompat$ServiceBinderImpl$1(MediaBrowserServiceCompat$ServiceBinderImpl, MediaBrowserServiceCompat$ServiceCallbacks, String, Bundle, int)>
		//   43   78:invokevirtual   #50  <Method void MediaBrowserServiceCompat$ServiceHandler.postOrRun(Runnable)>
				return;
		//   44   81:return          
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

		public void registerCallbacks(final ServiceCallbacks callbacks, Bundle bundle)
		{
			mHandler.postOrRun(((_cls6) (bundle)). new Runnable() {

				public void run()
				{
					RemoteException remoteexception;
					IBinder ibinder = callbacks.asBinder();
				//    0    0:aload_0         
				//    1    1:getfield        #26  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
				//    2    4:invokeinterface #41  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
				//    3    9:astore_1        
					mConnections.remove(((Object) (ibinder)));
				//    4   10:aload_0         
				//    5   11:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				//    6   14:getfield        #45  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
				//    7   17:getfield        #49  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
				//    8   20:aload_1         
				//    9   21:invokevirtual   #55  <Method Object ArrayMap.remove(Object)>
				//   10   24:pop             
					ConnectionRecord connectionrecord = new ConnectionRecord();
				//   11   25:new             #57  <Class MediaBrowserServiceCompat$ConnectionRecord>
				//   12   28:dup             
				//   13   29:aload_0         
				//   14   30:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				//   15   33:getfield        #45  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
				//   16   36:invokespecial   #60  <Method void MediaBrowserServiceCompat$ConnectionRecord(MediaBrowserServiceCompat)>
				//   17   39:astore_2        
					connectionrecord.callbacks = callbacks;
				//   18   40:aload_2         
				//   19   41:aload_0         
				//   20   42:getfield        #26  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
				//   21   45:putfield        #63  <Field MediaBrowserServiceCompat$ServiceCallbacks MediaBrowserServiceCompat$ConnectionRecord.callbacks>
					connectionrecord.rootHints = rootHints;
				//   22   48:aload_2         
				//   23   49:aload_0         
				//   24   50:getfield        #28  <Field Bundle val$rootHints>
				//   25   53:putfield        #66  <Field Bundle MediaBrowserServiceCompat$ConnectionRecord.rootHints>
					mConnections.put(((Object) (ibinder)), ((Object) (connectionrecord)));
				//   26   56:aload_0         
				//   27   57:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				//   28   60:getfield        #45  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
				//   29   63:getfield        #49  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
				//   30   66:aload_1         
				//   31   67:aload_2         
				//   32   68:invokevirtual   #70  <Method Object ArrayMap.put(Object, Object)>
				//   33   71:pop             
					try
					{
						ibinder.linkToDeath(((android.os.IBinder.DeathRecipient) (connectionrecord)), 0);
				//   34   72:aload_1         
				//   35   73:aload_2         
				//   36   74:iconst_0        
				//   37   75:invokeinterface #76  <Method void IBinder.linkToDeath(android.os.IBinder$DeathRecipient, int)>
						return;
				//   38   80:return          
					}
				//*  39   81:ldc1            #78  <String "MBServiceCompat">
				//*  40   83:ldc1            #80  <String "IBinder is already dead.">
				//*  41   85:invokestatic    #86  <Method int Log.w(String, String)>
				//*  42   88:pop             
				//*  43   89:return          
					// Misplaced declaration of an exception variable
					catch(RemoteException remoteexception)
					{
						Log.w("MBServiceCompat", "IBinder is already dead.");
					}
				//*  44   90:astore_1        
				//*  45   91:goto            81
				}

				final ServiceBinderImpl this$1;
				final ServiceCallbacks val$callbacks;
				final Bundle val$rootHints;

			
			{
				this$1 = final_servicebinderimpl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				callbacks = servicecallbacks;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
				rootHints = Bundle.this;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field Bundle val$rootHints>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #31  <Method void Object()>
			//   11   19:return          
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
		//    8   14:invokespecial   #103 <Method void MediaBrowserServiceCompat$ServiceBinderImpl$6(MediaBrowserServiceCompat$ServiceBinderImpl, MediaBrowserServiceCompat$ServiceCallbacks, Bundle)>
		//    9   17:invokevirtual   #50  <Method void MediaBrowserServiceCompat$ServiceHandler.postOrRun(Runnable)>
		//   10   20:return          
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
		//    9   15:invokespecial   #108 <Method void MediaBrowserServiceCompat$ServiceBinderImpl$4(MediaBrowserServiceCompat$ServiceBinderImpl, MediaBrowserServiceCompat$ServiceCallbacks, String, IBinder)>
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
		//   16   29:invokespecial   #113 <Method void MediaBrowserServiceCompat$ServiceBinderImpl$8(MediaBrowserServiceCompat$ServiceBinderImpl, MediaBrowserServiceCompat$ServiceCallbacks, String, Bundle, ResultReceiver)>
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
		//   16   29:invokespecial   #115 <Method void MediaBrowserServiceCompat$ServiceBinderImpl$9(MediaBrowserServiceCompat$ServiceBinderImpl, MediaBrowserServiceCompat$ServiceCallbacks, String, Bundle, ResultReceiver)>
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
		//    7   13:invokespecial   #117 <Method void MediaBrowserServiceCompat$ServiceBinderImpl$7(MediaBrowserServiceCompat$ServiceBinderImpl, MediaBrowserServiceCompat$ServiceCallbacks)>
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

		public abstract void onLoadChildren(String s, List list, Bundle bundle)
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

		public void onLoadChildren(String s, List list, Bundle bundle)
			throws RemoteException
		{
			Bundle bundle1 = new Bundle();
		//    0    0:new             #56  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #57  <Method void Bundle()>
		//    3    7:astore          4
			bundle1.putString("data_media_item_id", s);
		//    4    9:aload           4
		//    5   11:ldc1            #65  <String "data_media_item_id">
		//    6   13:aload_1         
		//    7   14:invokevirtual   #69  <Method void Bundle.putString(String, String)>
			bundle1.putBundle("data_options", bundle);
		//    8   17:aload           4
		//    9   19:ldc1            #88  <String "data_options">
		//   10   21:aload_3         
		//   11   22:invokevirtual   #81  <Method void Bundle.putBundle(String, Bundle)>
			if(list != null)
		//*  12   25:aload_2         
		//*  13   26:ifnull          61
			{
				if(list instanceof ArrayList)
		//*  14   29:aload_2         
		//*  15   30:instanceof      #90  <Class ArrayList>
		//*  16   33:ifeq            44
					s = ((String) ((ArrayList)list));
		//   17   36:aload_2         
		//   18   37:checkcast       #90  <Class ArrayList>
		//   19   40:astore_1        
				else
		//*  20   41:goto            53
					s = ((String) (new ArrayList(((Collection) (list)))));
		//   21   44:new             #90  <Class ArrayList>
		//   22   47:dup             
		//   23   48:aload_2         
		//   24   49:invokespecial   #93  <Method void ArrayList(Collection)>
		//   25   52:astore_1        
				bundle1.putParcelableArrayList("data_media_item_list", ((ArrayList) (s)));
		//   26   53:aload           4
		//   27   55:ldc1            #95  <String "data_media_item_list">
		//   28   57:aload_1         
		//   29   58:invokevirtual   #99  <Method void Bundle.putParcelableArrayList(String, ArrayList)>
			}
			sendRequest(3, bundle1);
		//   30   61:aload_0         
		//   31   62:iconst_3        
		//   32   63:aload           4
		//   33   65:invokespecial   #83  <Method void sendRequest(int, Bundle)>
		//   34   68:return          
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
		//		               1 366
		//		               2 347
		//		               3 310
		//		               4 279
		//		               5 245
		//		               6 220
		//		               7 201
		//		               8 161
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
				mServiceBinderImpl.sendCustomAction(((Bundle) (obj)).getString("data_custom_action"), ((Bundle) (obj)).getBundle("data_custom_action_extras"), (ResultReceiver)((Bundle) (obj)).getParcelable("data_result_receiver"), ((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))));
		//   41  121:aload_0         
		//   42  122:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//   43  125:aload_2         
		//   44  126:ldc1            #73  <String "data_custom_action">
		//   45  128:invokevirtual   #79  <Method String Bundle.getString(String)>
		//   46  131:aload_2         
		//   47  132:ldc1            #81  <String "data_custom_action_extras">
		//   48  134:invokevirtual   #85  <Method Bundle Bundle.getBundle(String)>
		//   49  137:aload_2         
		//   50  138:ldc1            #87  <String "data_result_receiver">
		//   51  140:invokevirtual   #91  <Method android.os.Parcelable Bundle.getParcelable(String)>
		//   52  143:checkcast       #93  <Class ResultReceiver>
		//   53  146:new             #95  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//   54  149:dup             
		//   55  150:aload_1         
		//   56  151:getfield        #99  <Field Messenger Message.replyTo>
		//   57  154:invokespecial   #102 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(Messenger)>
		//   58  157:invokevirtual   #106 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.sendCustomAction(String, Bundle, ResultReceiver, MediaBrowserServiceCompat$ServiceCallbacks)>
				return;
		//   59  160:return          

			case 8: // '\b'
				mServiceBinderImpl.search(((Bundle) (obj)).getString("data_search_query"), ((Bundle) (obj)).getBundle("data_search_extras"), (ResultReceiver)((Bundle) (obj)).getParcelable("data_result_receiver"), ((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))));
		//   60  161:aload_0         
		//   61  162:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//   62  165:aload_2         
		//   63  166:ldc1            #108 <String "data_search_query">
		//   64  168:invokevirtual   #79  <Method String Bundle.getString(String)>
		//   65  171:aload_2         
		//   66  172:ldc1            #110 <String "data_search_extras">
		//   67  174:invokevirtual   #85  <Method Bundle Bundle.getBundle(String)>
		//   68  177:aload_2         
		//   69  178:ldc1            #87  <String "data_result_receiver">
		//   70  180:invokevirtual   #91  <Method android.os.Parcelable Bundle.getParcelable(String)>
		//   71  183:checkcast       #93  <Class ResultReceiver>
		//   72  186:new             #95  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//   73  189:dup             
		//   74  190:aload_1         
		//   75  191:getfield        #99  <Field Messenger Message.replyTo>
		//   76  194:invokespecial   #102 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(Messenger)>
		//   77  197:invokevirtual   #113 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.search(String, Bundle, ResultReceiver, MediaBrowserServiceCompat$ServiceCallbacks)>
				return;
		//   78  200:return          

			case 7: // '\007'
				mServiceBinderImpl.unregisterCallbacks(((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))));
		//   79  201:aload_0         
		//   80  202:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//   81  205:new             #95  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//   82  208:dup             
		//   83  209:aload_1         
		//   84  210:getfield        #99  <Field Messenger Message.replyTo>
		//   85  213:invokespecial   #102 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(Messenger)>
		//   86  216:invokevirtual   #117 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.unregisterCallbacks(MediaBrowserServiceCompat$ServiceCallbacks)>
				return;
		//   87  219:return          

			case 6: // '\006'
				mServiceBinderImpl.registerCallbacks(((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))), ((Bundle) (obj)).getBundle("data_root_hints"));
		//   88  220:aload_0         
		//   89  221:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//   90  224:new             #95  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//   91  227:dup             
		//   92  228:aload_1         
		//   93  229:getfield        #99  <Field Messenger Message.replyTo>
		//   94  232:invokespecial   #102 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(Messenger)>
		//   95  235:aload_2         
		//   96  236:ldc1            #119 <String "data_root_hints">
		//   97  238:invokevirtual   #85  <Method Bundle Bundle.getBundle(String)>
		//   98  241:invokevirtual   #123 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.registerCallbacks(MediaBrowserServiceCompat$ServiceCallbacks, Bundle)>
				return;
		//   99  244:return          

			case 5: // '\005'
				mServiceBinderImpl.getMediaItem(((Bundle) (obj)).getString("data_media_item_id"), (ResultReceiver)((Bundle) (obj)).getParcelable("data_result_receiver"), ((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))));
		//  100  245:aload_0         
		//  101  246:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//  102  249:aload_2         
		//  103  250:ldc1            #125 <String "data_media_item_id">
		//  104  252:invokevirtual   #79  <Method String Bundle.getString(String)>
		//  105  255:aload_2         
		//  106  256:ldc1            #87  <String "data_result_receiver">
		//  107  258:invokevirtual   #91  <Method android.os.Parcelable Bundle.getParcelable(String)>
		//  108  261:checkcast       #93  <Class ResultReceiver>
		//  109  264:new             #95  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//  110  267:dup             
		//  111  268:aload_1         
		//  112  269:getfield        #99  <Field Messenger Message.replyTo>
		//  113  272:invokespecial   #102 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(Messenger)>
		//  114  275:invokevirtual   #129 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.getMediaItem(String, ResultReceiver, MediaBrowserServiceCompat$ServiceCallbacks)>
				return;
		//  115  278:return          

			case 4: // '\004'
				mServiceBinderImpl.removeSubscription(((Bundle) (obj)).getString("data_media_item_id"), BundleCompat.getBinder(((Bundle) (obj)), "data_callback_token"), ((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))));
		//  116  279:aload_0         
		//  117  280:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//  118  283:aload_2         
		//  119  284:ldc1            #125 <String "data_media_item_id">
		//  120  286:invokevirtual   #79  <Method String Bundle.getString(String)>
		//  121  289:aload_2         
		//  122  290:ldc1            #131 <String "data_callback_token">
		//  123  292:invokestatic    #137 <Method IBinder BundleCompat.getBinder(Bundle, String)>
		//  124  295:new             #95  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//  125  298:dup             
		//  126  299:aload_1         
		//  127  300:getfield        #99  <Field Messenger Message.replyTo>
		//  128  303:invokespecial   #102 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(Messenger)>
		//  129  306:invokevirtual   #141 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.removeSubscription(String, IBinder, MediaBrowserServiceCompat$ServiceCallbacks)>
				return;
		//  130  309:return          

			case 3: // '\003'
				mServiceBinderImpl.addSubscription(((Bundle) (obj)).getString("data_media_item_id"), BundleCompat.getBinder(((Bundle) (obj)), "data_callback_token"), ((Bundle) (obj)).getBundle("data_options"), ((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))));
		//  131  310:aload_0         
		//  132  311:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//  133  314:aload_2         
		//  134  315:ldc1            #125 <String "data_media_item_id">
		//  135  317:invokevirtual   #79  <Method String Bundle.getString(String)>
		//  136  320:aload_2         
		//  137  321:ldc1            #131 <String "data_callback_token">
		//  138  323:invokestatic    #137 <Method IBinder BundleCompat.getBinder(Bundle, String)>
		//  139  326:aload_2         
		//  140  327:ldc1            #143 <String "data_options">
		//  141  329:invokevirtual   #85  <Method Bundle Bundle.getBundle(String)>
		//  142  332:new             #95  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//  143  335:dup             
		//  144  336:aload_1         
		//  145  337:getfield        #99  <Field Messenger Message.replyTo>
		//  146  340:invokespecial   #102 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(Messenger)>
		//  147  343:invokevirtual   #147 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.addSubscription(String, IBinder, Bundle, MediaBrowserServiceCompat$ServiceCallbacks)>
				return;
		//  148  346:return          

			case 2: // '\002'
				mServiceBinderImpl.disconnect(((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))));
		//  149  347:aload_0         
		//  150  348:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//  151  351:new             #95  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//  152  354:dup             
		//  153  355:aload_1         
		//  154  356:getfield        #99  <Field Messenger Message.replyTo>
		//  155  359:invokespecial   #102 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(Messenger)>
		//  156  362:invokevirtual   #150 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.disconnect(MediaBrowserServiceCompat$ServiceCallbacks)>
				return;
		//  157  365:return          

			case 1: // '\001'
				mServiceBinderImpl.connect(((Bundle) (obj)).getString("data_package_name"), ((Bundle) (obj)).getInt("data_calling_uid"), ((Bundle) (obj)).getBundle("data_root_hints"), ((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))));
		//  158  366:aload_0         
		//  159  367:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//  160  370:aload_2         
		//  161  371:ldc1            #152 <String "data_package_name">
		//  162  373:invokevirtual   #79  <Method String Bundle.getString(String)>
		//  163  376:aload_2         
		//  164  377:ldc1            #154 <String "data_calling_uid">
		//  165  379:invokevirtual   #158 <Method int Bundle.getInt(String)>
		//  166  382:aload_2         
		//  167  383:ldc1            #119 <String "data_root_hints">
		//  168  385:invokevirtual   #85  <Method Bundle Bundle.getBundle(String)>
		//  169  388:new             #95  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//  170  391:dup             
		//  171  392:aload_1         
		//  172  393:getfield        #99  <Field Messenger Message.replyTo>
		//  173  396:invokespecial   #102 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(Messenger)>
		//  174  399:invokevirtual   #162 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.connect(String, int, Bundle, MediaBrowserServiceCompat$ServiceCallbacks)>
				return;
		//  175  402:return          
			}
		}

		public void postOrRun(Runnable runnable)
		{
			if(Thread.currentThread() == getLooper().getThread())
		//*   0    0:invokestatic    #170 <Method Thread Thread.currentThread()>
		//*   1    3:aload_0         
		//*   2    4:invokevirtual   #174 <Method Looper getLooper()>
		//*   3    7:invokevirtual   #179 <Method Thread Looper.getThread()>
		//*   4   10:if_acmpne       20
			{
				runnable.run();
		//    5   13:aload_1         
		//    6   14:invokeinterface #184 <Method void Runnable.run()>
				return;
		//    7   19:return          
			} else
			{
				post(runnable);
		//    8   20:aload_0         
		//    9   21:aload_1         
		//   10   22:invokevirtual   #188 <Method boolean post(Runnable)>
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
		//    4    8:ldc1            #192 <Class MediaBrowserCompat>
		//    5   10:invokevirtual   #198 <Method ClassLoader Class.getClassLoader()>
		//    6   13:invokevirtual   #202 <Method void Bundle.setClassLoader(ClassLoader)>
			bundle.putInt("data_calling_uid", Binder.getCallingUid());
		//    7   16:aload           4
		//    8   18:ldc1            #154 <String "data_calling_uid">
		//    9   20:invokestatic    #208 <Method int Binder.getCallingUid()>
		//   10   23:invokevirtual   #212 <Method void Bundle.putInt(String, int)>
			return super.sendMessageAtTime(message, l);
		//   11   26:aload_0         
		//   12   27:aload_1         
		//   13   28:lload_2         
		//   14   29:invokespecial   #214 <Method boolean Handler.sendMessageAtTime(Message, long)>
		//   15   32:ireturn         
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
	//    1    1:invokespecial   #144 <Method void Service()>
	//    2    4:aload_0         
	//    3    5:new             #146 <Class ArrayMap>
	//    4    8:dup             
	//    5    9:invokespecial   #147 <Method void ArrayMap()>
	//    6   12:putfield        #149 <Field ArrayMap mConnections>
	//    7   15:aload_0         
	//    8   16:new             #84  <Class MediaBrowserServiceCompat$ServiceHandler>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #152 <Method void MediaBrowserServiceCompat$ServiceHandler(MediaBrowserServiceCompat)>
	//   12   24:putfield        #154 <Field MediaBrowserServiceCompat$ServiceHandler mHandler>
	//   13   27:return          
	}

	void addSubscription(String s, ConnectionRecord connectionrecord, IBinder ibinder, Bundle bundle)
	{
		List list = (List)connectionrecord.subscriptions.get(((Object) (s)));
	//    0    0:aload_2         
	//    1    1:getfield        #160 <Field HashMap MediaBrowserServiceCompat$ConnectionRecord.subscriptions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #166 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #168 <Class List>
	//    5   11:astore          6
		Object obj = ((Object) (list));
	//    6   13:aload           6
	//    7   15:astore          5
		if(list == null)
	//*   8   17:aload           6
	//*   9   19:ifnonnull       31
			obj = ((Object) (new ArrayList()));
	//   10   22:new             #170 <Class ArrayList>
	//   11   25:dup             
	//   12   26:invokespecial   #171 <Method void ArrayList()>
	//   13   29:astore          5
		for(Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext();)
	//*  14   31:aload           5
	//*  15   33:invokeinterface #175 <Method Iterator List.iterator()>
	//*  16   38:astore          6
	//*  17   40:aload           6
	//*  18   42:invokeinterface #181 <Method boolean Iterator.hasNext()>
	//*  19   47:ifeq            88
		{
			Pair pair = (Pair)iterator.next();
	//   20   50:aload           6
	//   21   52:invokeinterface #185 <Method Object Iterator.next()>
	//   22   57:checkcast       #187 <Class Pair>
	//   23   60:astore          7
			if(ibinder == pair.first && MediaBrowserCompatUtils.areSameOptions(bundle, (Bundle)pair.second))
	//*  24   62:aload_3         
	//*  25   63:aload           7
	//*  26   65:getfield        #191 <Field Object Pair.first>
	//*  27   68:if_acmpne       40
	//*  28   71:aload           4
	//*  29   73:aload           7
	//*  30   75:getfield        #194 <Field Object Pair.second>
	//*  31   78:checkcast       #196 <Class Bundle>
	//*  32   81:invokestatic    #202 <Method boolean MediaBrowserCompatUtils.areSameOptions(Bundle, Bundle)>
	//*  33   84:ifeq            40
				return;
	//   34   87:return          
		}

		((List) (obj)).add(((Object) (new Pair(((Object) (ibinder)), ((Object) (bundle))))));
	//   35   88:aload           5
	//   36   90:new             #187 <Class Pair>
	//   37   93:dup             
	//   38   94:aload_3         
	//   39   95:aload           4
	//   40   97:invokespecial   #205 <Method void Pair(Object, Object)>
	//   41  100:invokeinterface #209 <Method boolean List.add(Object)>
	//   42  105:pop             
		connectionrecord.subscriptions.put(((Object) (s)), obj);
	//   43  106:aload_2         
	//   44  107:getfield        #160 <Field HashMap MediaBrowserServiceCompat$ConnectionRecord.subscriptions>
	//   45  110:aload_1         
	//   46  111:aload           5
	//   47  113:invokevirtual   #213 <Method Object HashMap.put(Object, Object)>
	//   48  116:pop             
		performLoadChildren(s, connectionrecord, bundle);
	//   49  117:aload_0         
	//   50  118:aload_1         
	//   51  119:aload_2         
	//   52  120:aload           4
	//   53  122:invokevirtual   #217 <Method void performLoadChildren(String, MediaBrowserServiceCompat$ConnectionRecord, Bundle)>
	//   54  125:return          
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
	//    5    7:ldc1            #221 <String "android.media.browse.extra.PAGE">
	//    6    9:iconst_m1       
	//    7   10:invokevirtual   #225 <Method int Bundle.getInt(String, int)>
	//    8   13:istore_3        
		int i1 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
	//    9   14:aload_2         
	//   10   15:ldc1            #227 <String "android.media.browse.extra.PAGE_SIZE">
	//   11   17:iconst_m1       
	//   12   18:invokevirtual   #225 <Method int Bundle.getInt(String, int)>
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
	//*  37   62:invokeinterface #231 <Method int List.size()>
	//*  38   67:icmplt          73
	//*  39   70:goto            104
		{
			int j = k;
	//   40   73:iload           4
	//   41   75:istore_3        
			if(k > list.size())
	//*  42   76:iload           4
	//*  43   78:aload_1         
	//*  44   79:invokeinterface #231 <Method int List.size()>
	//*  45   84:icmple          94
				j = list.size();
	//   46   87:aload_1         
	//   47   88:invokeinterface #231 <Method int List.size()>
	//   48   93:istore_3        
			return list.subList(l, j);
	//   49   94:aload_1         
	//   50   95:iload           5
	//   51   97:iload_3         
	//   52   98:invokeinterface #235 <Method List List.subList(int, int)>
	//   53  103:areturn         
		} else
		{
			return Collections.EMPTY_LIST;
	//   54  104:getstatic       #241 <Field List Collections.EMPTY_LIST>
	//   55  107:areturn         
		}
	}

	public void dump(FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
	//    0    0:return          
	}

	public final Bundle getBrowserRootHints()
	{
		return mImpl.getBrowserRootHints();
	//    0    0:aload_0         
	//    1    1:getfield        #249 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
	//    2    4:invokeinterface #251 <Method Bundle MediaBrowserServiceCompat$MediaBrowserServiceImpl.getBrowserRootHints()>
	//    3    9:areturn         
	}

	public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken()
	{
		return mSession;
	//    0    0:aload_0         
	//    1    1:getfield        #256 <Field android.support.v4.media.session.MediaSessionCompat$Token mSession>
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
	//    5    7:invokevirtual   #262 <Method PackageManager getPackageManager()>
	//    6   10:iload_2         
	//    7   11:invokevirtual   #268 <Method String[] PackageManager.getPackagesForUid(int)>
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
	//*  21   32:invokevirtual   #273 <Method boolean String.equals(Object)>
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

	public void notifyChildrenChanged(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
	//    2    4:new             #278 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #280 <String "parentId cannot be null in notifyChildrenChanged">
	//    5   11:invokespecial   #282 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		} else
		{
			mImpl.notifyChildrenChanged(s, ((Bundle) (null)));
	//    7   15:aload_0         
	//    8   16:getfield        #249 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
	//    9   19:aload_1         
	//   10   20:aconst_null     
	//   11   21:invokeinterface #285 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImpl.notifyChildrenChanged(String, Bundle)>
			return;
	//   12   26:return          
		}
	}

	public void notifyChildrenChanged(String s, Bundle bundle)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
	//    2    4:new             #278 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #280 <String "parentId cannot be null in notifyChildrenChanged">
	//    5   11:invokespecial   #282 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(bundle == null)
	//*   7   15:aload_2         
	//*   8   16:ifnonnull       30
		{
			throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
	//    9   19:new             #278 <Class IllegalArgumentException>
	//   10   22:dup             
	//   11   23:ldc2            #288 <String "options cannot be null in notifyChildrenChanged">
	//   12   26:invokespecial   #282 <Method void IllegalArgumentException(String)>
	//   13   29:athrow          
		} else
		{
			mImpl.notifyChildrenChanged(s, bundle);
	//   14   30:aload_0         
	//   15   31:getfield        #249 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
	//   16   34:aload_1         
	//   17   35:aload_2         
	//   18   36:invokeinterface #285 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImpl.notifyChildrenChanged(String, Bundle)>
			return;
	//   19   41:return          
		}
	}

	public IBinder onBind(Intent intent)
	{
		return mImpl.onBind(intent);
	//    0    0:aload_0         
	//    1    1:getfield        #249 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #292 <Method IBinder MediaBrowserServiceCompat$MediaBrowserServiceImpl.onBind(Intent)>
	//    4   10:areturn         
	}

	public void onCreate()
	{
		super.onCreate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #295 <Method void Service.onCreate()>
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   2    4:getstatic       #300 <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          26
	//*   4    9:icmplt          27
			mImpl = ((MediaBrowserServiceImpl) (new MediaBrowserServiceImplApi26()));
	//    5   12:aload_0         
	//    6   13:new             #39  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplApi26>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokespecial   #301 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi26(MediaBrowserServiceCompat)>
	//   10   21:putfield        #249 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
		else
	//*  11   24:goto            85
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  12   27:getstatic       #300 <Field int android.os.Build$VERSION.SDK_INT>
	//*  13   30:bipush          23
	//*  14   32:icmplt          50
			mImpl = ((MediaBrowserServiceImpl) (new MediaBrowserServiceImplApi23()));
	//   15   35:aload_0         
	//   16   36:new             #34  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplApi23>
	//   17   39:dup             
	//   18   40:aload_0         
	//   19   41:invokespecial   #302 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi23(MediaBrowserServiceCompat)>
	//   20   44:putfield        #249 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
		else
	//*  21   47:goto            85
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  22   50:getstatic       #300 <Field int android.os.Build$VERSION.SDK_INT>
	//*  23   53:bipush          21
	//*  24   55:icmplt          73
			mImpl = ((MediaBrowserServiceImpl) (new MediaBrowserServiceImplApi21()));
	//   25   58:aload_0         
	//   26   59:new             #25  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21>
	//   27   62:dup             
	//   28   63:aload_0         
	//   29   64:invokespecial   #303 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi21(MediaBrowserServiceCompat)>
	//   30   67:putfield        #249 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
		else
	//*  31   70:goto            85
			mImpl = ((MediaBrowserServiceImpl) (new MediaBrowserServiceImplBase()));
	//   32   73:aload_0         
	//   33   74:new             #44  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplBase>
	//   34   77:dup             
	//   35   78:aload_0         
	//   36   79:invokespecial   #304 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplBase(MediaBrowserServiceCompat)>
	//   37   82:putfield        #249 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
		mImpl.onCreate();
	//   38   85:aload_0         
	//   39   86:getfield        #249 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
	//   40   89:invokeinterface #305 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImpl.onCreate()>
	//   41   94:return          
	}

	public void onCustomAction(String s, Bundle bundle, Result result)
	{
		result.sendError(((Bundle) (null)));
	//    0    0:aload_3         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #311 <Method void MediaBrowserServiceCompat$Result.sendError(Bundle)>
	//    3    5:return          
	}

	public abstract BrowserRoot onGetRoot(String s, int i, Bundle bundle);

	public abstract void onLoadChildren(String s, Result result);

	public void onLoadChildren(String s, Result result, Bundle bundle)
	{
		result.setFlags(1);
	//    0    0:aload_2         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #321 <Method void MediaBrowserServiceCompat$Result.setFlags(int)>
		onLoadChildren(s, result);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #323 <Method void onLoadChildren(String, MediaBrowserServiceCompat$Result)>
	//    7   11:return          
	}

	public void onLoadItem(String s, Result result)
	{
		result.setFlags(2);
	//    0    0:aload_2         
	//    1    1:iconst_2        
	//    2    2:invokevirtual   #321 <Method void MediaBrowserServiceCompat$Result.setFlags(int)>
		result.sendResult(((Object) (null)));
	//    3    5:aload_2         
	//    4    6:aconst_null     
	//    5    7:invokevirtual   #329 <Method void MediaBrowserServiceCompat$Result.sendResult(Object)>
	//    6   10:return          
	}

	public void onSearch(String s, Bundle bundle, Result result)
	{
		result.setFlags(4);
	//    0    0:aload_3         
	//    1    1:iconst_4        
	//    2    2:invokevirtual   #321 <Method void MediaBrowserServiceCompat$Result.setFlags(int)>
		result.sendResult(((Object) (null)));
	//    3    5:aload_3         
	//    4    6:aconst_null     
	//    5    7:invokevirtual   #329 <Method void MediaBrowserServiceCompat$Result.sendResult(Object)>
	//    6   10:return          
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
	//    5    8:invokespecial   #337 <Method void MediaBrowserServiceCompat$4(MediaBrowserServiceCompat, Object, ResultReceiver)>
	//    6   11:astore          4
		mCurConnection = connectionrecord;
	//    7   13:aload_0         
	//    8   14:aload_3         
	//    9   15:putfield        #339 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		onCustomAction(final_obj, bundle, ((Result) (resultreceiver)));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:aload           4
	//   14   23:invokevirtual   #341 <Method void onCustomAction(String, Bundle, MediaBrowserServiceCompat$Result)>
		mCurConnection = null;
	//   15   26:aload_0         
	//   16   27:aconst_null     
	//   17   28:putfield        #339 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		if(!((Result) (resultreceiver)).isDone())
	//*  18   31:aload           4
	//*  19   33:invokevirtual   #344 <Method boolean MediaBrowserServiceCompat$Result.isDone()>
	//*  20   36:ifne            87
		{
			connectionrecord = ((ConnectionRecord) (new StringBuilder()));
	//   21   39:new             #346 <Class StringBuilder>
	//   22   42:dup             
	//   23   43:invokespecial   #347 <Method void StringBuilder()>
	//   24   46:astore_3        
			((StringBuilder) (connectionrecord)).append("onCustomAction must call detach() or sendResult() or sendError() before returning for action=");
	//   25   47:aload_3         
	//   26   48:ldc2            #349 <String "onCustomAction must call detach() or sendResult() or sendError() before returning for action=">
	//   27   51:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   28   54:pop             
			((StringBuilder) (connectionrecord)).append(final_obj);
	//   29   55:aload_3         
	//   30   56:aload_1         
	//   31   57:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   32   60:pop             
			((StringBuilder) (connectionrecord)).append(" extras=");
	//   33   61:aload_3         
	//   34   62:ldc2            #355 <String " extras=">
	//   35   65:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   36   68:pop             
			((StringBuilder) (connectionrecord)).append(((Object) (bundle)));
	//   37   69:aload_3         
	//   38   70:aload_2         
	//   39   71:invokevirtual   #358 <Method StringBuilder StringBuilder.append(Object)>
	//   40   74:pop             
			throw new IllegalStateException(((StringBuilder) (connectionrecord)).toString());
	//   41   75:new             #360 <Class IllegalStateException>
	//   42   78:dup             
	//   43   79:aload_3         
	//   44   80:invokevirtual   #364 <Method String StringBuilder.toString()>
	//   45   83:invokespecial   #365 <Method void IllegalStateException(String)>
	//   46   86:athrow          
		} else
		{
			return;
	//   47   87:return          
		}
	}

	void performLoadChildren(final String final_obj, final ConnectionRecord connection, Bundle bundle)
	{
		Result result = new Result(bundle) {

			volatile void onResultSent(Object obj)
			{
				onResultSent((List)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #35  <Class List>
			//    3    5:invokevirtual   #38  <Method void onResultSent(List)>
			//    4    8:return          
			}

			void onResultSent(List list)
			{
				if(mConnections.get(((Object) (connection.callbacks.asBinder()))) != connection)
			//*   0    0:aload_0         
			//*   1    1:getfield        #22  <Field MediaBrowserServiceCompat this$0>
			//*   2    4:getfield        #44  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
			//*   3    7:aload_0         
			//*   4    8:getfield        #24  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
			//*   5   11:getfield        #50  <Field MediaBrowserServiceCompat$ServiceCallbacks MediaBrowserServiceCompat$ConnectionRecord.callbacks>
			//*   6   14:invokeinterface #56  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
			//*   7   19:invokevirtual   #62  <Method Object ArrayMap.get(Object)>
			//*   8   22:aload_0         
			//*   9   23:getfield        #24  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
			//*  10   26:if_acmpeq       89
				{
					if(MediaBrowserServiceCompat.DEBUG)
			//*  11   29:getstatic       #66  <Field boolean MediaBrowserServiceCompat.DEBUG>
			//*  12   32:ifeq            88
					{
						list = ((List) (new StringBuilder()));
			//   13   35:new             #68  <Class StringBuilder>
			//   14   38:dup             
			//   15   39:invokespecial   #71  <Method void StringBuilder()>
			//   16   42:astore_1        
						((StringBuilder) (list)).append("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
			//   17   43:aload_1         
			//   18   44:ldc1            #73  <String "Not sending onLoadChildren result for connection that has been disconnected. pkg=">
			//   19   46:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
			//   20   49:pop             
						((StringBuilder) (list)).append(connection.pkg);
			//   21   50:aload_1         
			//   22   51:aload_0         
			//   23   52:getfield        #24  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
			//   24   55:getfield        #80  <Field String MediaBrowserServiceCompat$ConnectionRecord.pkg>
			//   25   58:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
			//   26   61:pop             
						((StringBuilder) (list)).append(" id=");
			//   27   62:aload_1         
			//   28   63:ldc1            #82  <String " id=">
			//   29   65:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
			//   30   68:pop             
						((StringBuilder) (list)).append(parentId);
			//   31   69:aload_1         
			//   32   70:aload_0         
			//   33   71:getfield        #26  <Field String val$parentId>
			//   34   74:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
			//   35   77:pop             
						Log.d("MBServiceCompat", ((StringBuilder) (list)).toString());
			//   36   78:ldc1            #84  <String "MBServiceCompat">
			//   37   80:aload_1         
			//   38   81:invokevirtual   #88  <Method String StringBuilder.toString()>
			//   39   84:invokestatic    #94  <Method int Log.d(String, String)>
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
			//*  45   92:invokevirtual   #98  <Method int getFlags()>
			//*  46   95:iconst_1        
			//*  47   96:iand            
			//*  48   97:ifeq            113
					list1 = applyOptions(list, options);
			//   49  100:aload_0         
			//   50  101:getfield        #22  <Field MediaBrowserServiceCompat this$0>
			//   51  104:aload_1         
			//   52  105:aload_0         
			//   53  106:getfield        #28  <Field Bundle val$options>
			//   54  109:invokevirtual   #102 <Method List MediaBrowserServiceCompat.applyOptions(List, Bundle)>
			//   55  112:astore_2        
				try
				{
					connection.callbacks.onLoadChildren(parentId, list1, options);
			//   56  113:aload_0         
			//   57  114:getfield        #24  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
			//   58  117:getfield        #50  <Field MediaBrowserServiceCompat$ServiceCallbacks MediaBrowserServiceCompat$ConnectionRecord.callbacks>
			//   59  120:aload_0         
			//   60  121:getfield        #26  <Field String val$parentId>
			//   61  124:aload_2         
			//   62  125:aload_0         
			//   63  126:getfield        #28  <Field Bundle val$options>
			//   64  129:invokeinterface #106 <Method void MediaBrowserServiceCompat$ServiceCallbacks.onLoadChildren(String, List, Bundle)>
					return;
			//   65  134:return          
				}
			//*  66  135:new             #68  <Class StringBuilder>
			//*  67  138:dup             
			//*  68  139:invokespecial   #71  <Method void StringBuilder()>
			//*  69  142:astore_1        
			//*  70  143:aload_1         
			//*  71  144:ldc1            #108 <String "Calling onLoadChildren() failed for id=">
			//*  72  146:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
			//*  73  149:pop             
			//*  74  150:aload_1         
			//*  75  151:aload_0         
			//*  76  152:getfield        #26  <Field String val$parentId>
			//*  77  155:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
			//*  78  158:pop             
			//*  79  159:aload_1         
			//*  80  160:ldc1            #110 <String " package=">
			//*  81  162:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
			//*  82  165:pop             
			//*  83  166:aload_1         
			//*  84  167:aload_0         
			//*  85  168:getfield        #24  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
			//*  86  171:getfield        #80  <Field String MediaBrowserServiceCompat$ConnectionRecord.pkg>
			//*  87  174:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
			//*  88  177:pop             
			//*  89  178:ldc1            #84  <String "MBServiceCompat">
			//*  90  180:aload_1         
			//*  91  181:invokevirtual   #88  <Method String StringBuilder.toString()>
			//*  92  184:invokestatic    #113 <Method int Log.w(String, String)>
			//*  93  187:pop             
			//*  94  188:return          
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
			//*  95  189:astore_1        
			//*  96  190:goto            135
			}

			final MediaBrowserServiceCompat this$0;
			final ConnectionRecord val$connection;
			final Bundle val$options;
			final String val$parentId;

			
			{
				this$0 = MediaBrowserServiceCompat.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field MediaBrowserServiceCompat this$0>
				connection = connectionrecord;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #24  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
				parentId = s;
			//    6   10:aload_0         
			//    7   11:aload           4
			//    8   13:putfield        #26  <Field String val$parentId>
				options = bundle;
			//    9   16:aload_0         
			//   10   17:aload           5
			//   11   19:putfield        #28  <Field Bundle val$options>
				super(final_obj);
			//   12   22:aload_0         
			//   13   23:aload_2         
			//   14   24:invokespecial   #31  <Method void MediaBrowserServiceCompat$Result(Object)>
			//   15   27:return          
			}
		}
;
	//    0    0:new             #6   <Class MediaBrowserServiceCompat$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_1         
	//    6    8:aload_3         
	//    7    9:invokespecial   #368 <Method void MediaBrowserServiceCompat$1(MediaBrowserServiceCompat, Object, MediaBrowserServiceCompat$ConnectionRecord, String, Bundle)>
	//    8   12:astore          4
		mCurConnection = connection;
	//    9   14:aload_0         
	//   10   15:aload_2         
	//   11   16:putfield        #339 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		if(bundle == null)
	//*  12   19:aload_3         
	//*  13   20:ifnonnull       33
			onLoadChildren(final_obj, ((Result) (result)));
	//   14   23:aload_0         
	//   15   24:aload_1         
	//   16   25:aload           4
	//   17   27:invokevirtual   #323 <Method void onLoadChildren(String, MediaBrowserServiceCompat$Result)>
		else
	//*  18   30:goto            41
			onLoadChildren(final_obj, ((Result) (result)), bundle);
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:aload           4
	//   22   37:aload_3         
	//   23   38:invokevirtual   #370 <Method void onLoadChildren(String, MediaBrowserServiceCompat$Result, Bundle)>
		mCurConnection = null;
	//   24   41:aload_0         
	//   25   42:aconst_null     
	//   26   43:putfield        #339 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		if(!((Result) (result)).isDone())
	//*  27   46:aload           4
	//*  28   48:invokevirtual   #344 <Method boolean MediaBrowserServiceCompat$Result.isDone()>
	//*  29   51:ifne            105
		{
			bundle = ((Bundle) (new StringBuilder()));
	//   30   54:new             #346 <Class StringBuilder>
	//   31   57:dup             
	//   32   58:invokespecial   #347 <Method void StringBuilder()>
	//   33   61:astore_3        
			((StringBuilder) (bundle)).append("onLoadChildren must call detach() or sendResult() before returning for package=");
	//   34   62:aload_3         
	//   35   63:ldc2            #372 <String "onLoadChildren must call detach() or sendResult() before returning for package=">
	//   36   66:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   37   69:pop             
			((StringBuilder) (bundle)).append(connection.pkg);
	//   38   70:aload_3         
	//   39   71:aload_2         
	//   40   72:getfield        #375 <Field String MediaBrowserServiceCompat$ConnectionRecord.pkg>
	//   41   75:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   42   78:pop             
			((StringBuilder) (bundle)).append(" id=");
	//   43   79:aload_3         
	//   44   80:ldc2            #377 <String " id=">
	//   45   83:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   46   86:pop             
			((StringBuilder) (bundle)).append(final_obj);
	//   47   87:aload_3         
	//   48   88:aload_1         
	//   49   89:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   50   92:pop             
			throw new IllegalStateException(((StringBuilder) (bundle)).toString());
	//   51   93:new             #360 <Class IllegalStateException>
	//   52   96:dup             
	//   53   97:aload_3         
	//   54   98:invokevirtual   #364 <Method String StringBuilder.toString()>
	//   55  101:invokespecial   #365 <Method void IllegalStateException(String)>
	//   56  104:athrow          
		} else
		{
			return;
	//   57  105:return          
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
	//    5    7:invokespecial   #380 <Method void MediaBrowserServiceCompat$2(MediaBrowserServiceCompat, Object, ResultReceiver)>
	//    6   10:astore_3        
		mCurConnection = connectionrecord;
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:putfield        #339 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		onLoadItem(final_obj, ((Result) (resultreceiver)));
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:aload_3         
	//   13   19:invokevirtual   #382 <Method void onLoadItem(String, MediaBrowserServiceCompat$Result)>
		mCurConnection = null;
	//   14   22:aload_0         
	//   15   23:aconst_null     
	//   16   24:putfield        #339 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		if(!((Result) (resultreceiver)).isDone())
	//*  17   27:aload_3         
	//*  18   28:invokevirtual   #344 <Method boolean MediaBrowserServiceCompat$Result.isDone()>
	//*  19   31:ifne            68
		{
			connectionrecord = ((ConnectionRecord) (new StringBuilder()));
	//   20   34:new             #346 <Class StringBuilder>
	//   21   37:dup             
	//   22   38:invokespecial   #347 <Method void StringBuilder()>
	//   23   41:astore_2        
			((StringBuilder) (connectionrecord)).append("onLoadItem must call detach() or sendResult() before returning for id=");
	//   24   42:aload_2         
	//   25   43:ldc2            #384 <String "onLoadItem must call detach() or sendResult() before returning for id=">
	//   26   46:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   27   49:pop             
			((StringBuilder) (connectionrecord)).append(final_obj);
	//   28   50:aload_2         
	//   29   51:aload_1         
	//   30   52:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   31   55:pop             
			throw new IllegalStateException(((StringBuilder) (connectionrecord)).toString());
	//   32   56:new             #360 <Class IllegalStateException>
	//   33   59:dup             
	//   34   60:aload_2         
	//   35   61:invokevirtual   #364 <Method String StringBuilder.toString()>
	//   36   64:invokespecial   #365 <Method void IllegalStateException(String)>
	//   37   67:athrow          
		} else
		{
			return;
	//   38   68:return          
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
	//    5    8:invokespecial   #386 <Method void MediaBrowserServiceCompat$3(MediaBrowserServiceCompat, Object, ResultReceiver)>
	//    6   11:astore          4
		mCurConnection = connectionrecord;
	//    7   13:aload_0         
	//    8   14:aload_3         
	//    9   15:putfield        #339 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		onSearch(final_obj, bundle, ((Result) (resultreceiver)));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:aload           4
	//   14   23:invokevirtual   #388 <Method void onSearch(String, Bundle, MediaBrowserServiceCompat$Result)>
		mCurConnection = null;
	//   15   26:aload_0         
	//   16   27:aconst_null     
	//   17   28:putfield        #339 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		if(!((Result) (resultreceiver)).isDone())
	//*  18   31:aload           4
	//*  19   33:invokevirtual   #344 <Method boolean MediaBrowserServiceCompat$Result.isDone()>
	//*  20   36:ifne            73
		{
			bundle = ((Bundle) (new StringBuilder()));
	//   21   39:new             #346 <Class StringBuilder>
	//   22   42:dup             
	//   23   43:invokespecial   #347 <Method void StringBuilder()>
	//   24   46:astore_2        
			((StringBuilder) (bundle)).append("onSearch must call detach() or sendResult() before returning for query=");
	//   25   47:aload_2         
	//   26   48:ldc2            #390 <String "onSearch must call detach() or sendResult() before returning for query=">
	//   27   51:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   28   54:pop             
			((StringBuilder) (bundle)).append(final_obj);
	//   29   55:aload_2         
	//   30   56:aload_1         
	//   31   57:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   32   60:pop             
			throw new IllegalStateException(((StringBuilder) (bundle)).toString());
	//   33   61:new             #360 <Class IllegalStateException>
	//   34   64:dup             
	//   35   65:aload_2         
	//   36   66:invokevirtual   #364 <Method String StringBuilder.toString()>
	//   37   69:invokespecial   #365 <Method void IllegalStateException(String)>
	//   38   72:athrow          
		} else
		{
			return;
	//   39   73:return          
		}
	}

	boolean removeSubscription(String s, ConnectionRecord connectionrecord, IBinder ibinder)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		boolean flag2 = false;
	//    2    3:iconst_0        
	//    3    4:istore          6
		boolean flag1 = false;
	//    4    6:iconst_0        
	//    5    7:istore          5
		if(ibinder == null)
	//*   6    9:aload_3         
	//*   7   10:ifnonnull       34
		{
			flag = flag1;
	//    8   13:iload           5
	//    9   15:istore          4
			if(connectionrecord.subscriptions.remove(((Object) (s))) != null)
	//*  10   17:aload_2         
	//*  11   18:getfield        #160 <Field HashMap MediaBrowserServiceCompat$ConnectionRecord.subscriptions>
	//*  12   21:aload_1         
	//*  13   22:invokevirtual   #395 <Method Object HashMap.remove(Object)>
	//*  14   25:ifnull          31
				flag = true;
	//   15   28:iconst_1        
	//   16   29:istore          4
			return flag;
	//   17   31:iload           4
	//   18   33:ireturn         
		}
		List list = (List)connectionrecord.subscriptions.get(((Object) (s)));
	//   19   34:aload_2         
	//   20   35:getfield        #160 <Field HashMap MediaBrowserServiceCompat$ConnectionRecord.subscriptions>
	//   21   38:aload_1         
	//   22   39:invokevirtual   #166 <Method Object HashMap.get(Object)>
	//   23   42:checkcast       #168 <Class List>
	//   24   45:astore          7
		flag1 = flag2;
	//   25   47:iload           6
	//   26   49:istore          5
		if(list != null)
	//*  27   51:aload           7
	//*  28   53:ifnull          132
		{
			Iterator iterator = list.iterator();
	//   29   56:aload           7
	//   30   58:invokeinterface #175 <Method Iterator List.iterator()>
	//   31   63:astore          8
			do
			{
				if(!iterator.hasNext())
					break;
	//   32   65:aload           8
	//   33   67:invokeinterface #181 <Method boolean Iterator.hasNext()>
	//   34   72:ifeq            105
				if(ibinder == ((Pair)iterator.next()).first)
	//*  35   75:aload_3         
	//*  36   76:aload           8
	//*  37   78:invokeinterface #185 <Method Object Iterator.next()>
	//*  38   83:checkcast       #187 <Class Pair>
	//*  39   86:getfield        #191 <Field Object Pair.first>
	//*  40   89:if_acmpne       65
				{
					iterator.remove();
	//   41   92:aload           8
	//   42   94:invokeinterface #397 <Method void Iterator.remove()>
					flag = true;
	//   43   99:iconst_1        
	//   44  100:istore          4
				}
			} while(true);
	//   45  102:goto            65
			flag1 = flag;
	//   46  105:iload           4
	//   47  107:istore          5
			if(list.size() == 0)
	//*  48  109:aload           7
	//*  49  111:invokeinterface #231 <Method int List.size()>
	//*  50  116:ifne            132
			{
				connectionrecord.subscriptions.remove(((Object) (s)));
	//   51  119:aload_2         
	//   52  120:getfield        #160 <Field HashMap MediaBrowserServiceCompat$ConnectionRecord.subscriptions>
	//   53  123:aload_1         
	//   54  124:invokevirtual   #395 <Method Object HashMap.remove(Object)>
	//   55  127:pop             
				flag1 = flag;
	//   56  128:iload           4
	//   57  130:istore          5
			}
		}
		return flag1;
	//   58  132:iload           5
	//   59  134:ireturn         
	}

	public void setSessionToken(android.support.v4.media.session.MediaSessionCompat.Token token)
	{
		if(token == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("Session token may not be null.");
	//    2    4:new             #278 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #401 <String "Session token may not be null.">
	//    5   11:invokespecial   #282 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(mSession != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #256 <Field android.support.v4.media.session.MediaSessionCompat$Token mSession>
	//*   9   19:ifnull          33
		{
			throw new IllegalStateException("The session token has already been set.");
	//   10   22:new             #360 <Class IllegalStateException>
	//   11   25:dup             
	//   12   26:ldc2            #403 <String "The session token has already been set.">
	//   13   29:invokespecial   #365 <Method void IllegalStateException(String)>
	//   14   32:athrow          
		} else
		{
			mSession = token;
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:putfield        #256 <Field android.support.v4.media.session.MediaSessionCompat$Token mSession>
			mImpl.setSessionToken(token);
	//   18   38:aload_0         
	//   19   39:getfield        #249 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
	//   20   42:aload_1         
	//   21   43:invokeinterface #405 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImpl.setSessionToken(android.support.v4.media.session.MediaSessionCompat$Token)>
			return;
	//   22   48:return          
		}
	}

	static final boolean DEBUG = Log.isLoggable("MBServiceCompat", 3);
	private static final float EPSILON = 1E-05F;
	public static final String KEY_MEDIA_ITEM = "media_item";
	public static final String KEY_SEARCH_RESULTS = "search_results";
	static final int RESULT_ERROR = -1;
	static final int RESULT_FLAG_ON_LOAD_ITEM_NOT_IMPLEMENTED = 2;
	static final int RESULT_FLAG_ON_SEARCH_NOT_IMPLEMENTED = 4;
	static final int RESULT_FLAG_OPTION_NOT_HANDLED = 1;
	static final int RESULT_OK = 0;
	static final int RESULT_PROGRESS_UPDATE = 1;
	public static final String SERVICE_INTERFACE = "android.media.browse.MediaBrowserService";
	static final String TAG = "MBServiceCompat";
	final ArrayMap mConnections = new ArrayMap();
	ConnectionRecord mCurConnection;
	final ServiceHandler mHandler = new ServiceHandler();
	private MediaBrowserServiceImpl mImpl;
	android.support.v4.media.session.MediaSessionCompat.Token mSession;

	static 
	{
	//    0    0:ldc1            #119 <String "MBServiceCompat">
	//    1    2:iconst_3        
	//    2    3:invokestatic    #138 <Method boolean Log.isLoggable(String, int)>
	//    3    6:putstatic       #140 <Field boolean DEBUG>
	//*   4    9:return          
	}
}
