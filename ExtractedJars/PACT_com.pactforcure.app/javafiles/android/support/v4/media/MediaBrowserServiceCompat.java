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
//			MediaBrowserCompatUtils, MediaBrowserServiceCompatApi21, MediaBrowserServiceCompatApi23, MediaBrowserServiceCompatApi24, 
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

	private static class ConnectionRecord
	{

		ServiceCallbacks callbacks;
		String pkg;
		BrowserRoot root;
		Bundle rootHints;
		HashMap subscriptions;

		ConnectionRecord()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			subscriptions = new HashMap();
		//    2    4:aload_0         
		//    3    5:new             #24  <Class HashMap>
		//    4    8:dup             
		//    5    9:invokespecial   #25  <Method void HashMap()>
		//    6   12:putfield        #27  <Field HashMap subscriptions>
		//    7   15:return          
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
			if(mMessenger != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #46  <Field Messenger mMessenger>
		//*   2    4:ifnonnull       9
		//*   3    7:aconst_null     
		//*   4    8:areturn         
			{
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
				if(mCurConnection.rootHints != null)
		//*  14   29:aload_0         
		//*  15   30:getfield        #33  <Field MediaBrowserServiceCompat this$0>
		//*  16   33:getfield        #50  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
		//*  17   36:getfield        #63  <Field Bundle MediaBrowserServiceCompat$ConnectionRecord.rootHints>
		//*  18   39:ifnull          7
					return new Bundle(mCurConnection.rootHints);
		//   19   42:new             #65  <Class Bundle>
		//   20   45:dup             
		//   21   46:aload_0         
		//   22   47:getfield        #33  <Field MediaBrowserServiceCompat this$0>
		//   23   50:getfield        #50  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
		//   24   53:getfield        #63  <Field Bundle MediaBrowserServiceCompat$ConnectionRecord.rootHints>
		//   25   56:invokespecial   #68  <Method void Bundle(Bundle)>
		//   26   59:areturn         
			}
			return null;
		}

		public void notifyChildrenChanged(final String parentId, Bundle bundle)
		{
			if(mMessenger == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #46  <Field Messenger mMessenger>
		//*   2    4:ifnonnull       16
			{
				MediaBrowserServiceCompatApi21.notifyChildrenChanged(mServiceObj, parentId);
		//    3    7:aload_0         
		//    4    8:getfield        #72  <Field Object mServiceObj>
		//    5   11:aload_1         
		//    6   12:invokestatic    #77  <Method void MediaBrowserServiceCompatApi21.notifyChildrenChanged(Object, String)>
				return;
		//    7   15:return          
			} else
			{
				mHandler.post(((_cls2) (bundle)). new Runnable() {

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
		//    8   16:aload_0         
		//    9   17:getfield        #33  <Field MediaBrowserServiceCompat this$0>
		//   10   20:getfield        #81  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//   11   23:new             #15  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$2>
		//   12   26:dup             
		//   13   27:aload_0         
		//   14   28:aload_1         
		//   15   29:aload_2         
		//   16   30:invokespecial   #84  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$2(MediaBrowserServiceCompat$MediaBrowserServiceImplApi21, String, Bundle)>
		//   17   33:invokevirtual   #90  <Method boolean MediaBrowserServiceCompat$ServiceHandler.post(Runnable)>
		//   18   36:pop             
				return;
		//   19   37:return          
			}
		}

		public IBinder onBind(Intent intent)
		{
			return MediaBrowserServiceCompatApi21.onBind(mServiceObj, intent);
		//    0    0:aload_0         
		//    1    1:getfield        #72  <Field Object mServiceObj>
		//    2    4:aload_1         
		//    3    5:invokestatic    #95  <Method IBinder MediaBrowserServiceCompatApi21.onBind(Object, Intent)>
		//    4    8:areturn         
		}

		public void onCreate()
		{
			mServiceObj = MediaBrowserServiceCompatApi21.createService(((android.content.Context) (MediaBrowserServiceCompat.this)), ((MediaBrowserServiceCompatApi21.ServiceCompatProxy) (this)));
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #33  <Field MediaBrowserServiceCompat this$0>
		//    3    5:aload_0         
		//    4    6:invokestatic    #100 <Method Object MediaBrowserServiceCompatApi21.createService(android.content.Context, MediaBrowserServiceCompatApi21$ServiceCompatProxy)>
		//    5    9:putfield        #72  <Field Object mServiceObj>
			MediaBrowserServiceCompatApi21.onCreate(mServiceObj);
		//    6   12:aload_0         
		//    7   13:getfield        #72  <Field Object mServiceObj>
		//    8   16:invokestatic    #103 <Method void MediaBrowserServiceCompatApi21.onCreate(Object)>
		//    9   19:return          
		}

		public MediaBrowserServiceCompatApi21.BrowserRoot onGetRoot(String s, int i, Bundle bundle)
		{
			Object obj;
			Object obj1 = null;
		//    0    0:aconst_null     
		//    1    1:astore          5
			obj = ((Object) (obj1));
		//    2    3:aload           5
		//    3    5:astore          4
			if(bundle != null)
		//*   4    7:aload_3         
		//*   5    8:ifnull          123
			{
				obj = ((Object) (obj1));
		//    6   11:aload           5
		//    7   13:astore          4
				if(bundle.getInt("extra_client_version", 0) != 0)
		//*   8   15:aload_3         
		//*   9   16:ldc1            #107 <String "extra_client_version">
		//*  10   18:iconst_0        
		//*  11   19:invokevirtual   #111 <Method int Bundle.getInt(String, int)>
		//*  12   22:ifeq            123
				{
					bundle.remove("extra_client_version");
		//   13   25:aload_3         
		//   14   26:ldc1            #107 <String "extra_client_version">
		//   15   28:invokevirtual   #114 <Method void Bundle.remove(String)>
					mMessenger = new Messenger(((Handler) (mHandler)));
		//   16   31:aload_0         
		//   17   32:new             #116 <Class Messenger>
		//   18   35:dup             
		//   19   36:aload_0         
		//   20   37:getfield        #33  <Field MediaBrowserServiceCompat this$0>
		//   21   40:getfield        #81  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//   22   43:invokespecial   #119 <Method void Messenger(Handler)>
		//   23   46:putfield        #46  <Field Messenger mMessenger>
					Bundle bundle1 = new Bundle();
		//   24   49:new             #65  <Class Bundle>
		//   25   52:dup             
		//   26   53:invokespecial   #120 <Method void Bundle()>
		//   27   56:astore          5
					bundle1.putInt("extra_service_version", 1);
		//   28   58:aload           5
		//   29   60:ldc1            #122 <String "extra_service_version">
		//   30   62:iconst_1        
		//   31   63:invokevirtual   #126 <Method void Bundle.putInt(String, int)>
					BundleCompat.putBinder(bundle1, "extra_messenger", mMessenger.getBinder());
		//   32   66:aload           5
		//   33   68:ldc1            #128 <String "extra_messenger">
		//   34   70:aload_0         
		//   35   71:getfield        #46  <Field Messenger mMessenger>
		//   36   74:invokevirtual   #132 <Method IBinder Messenger.getBinder()>
		//   37   77:invokestatic    #138 <Method void BundleCompat.putBinder(Bundle, String, IBinder)>
					if(mSession != null)
		//*  38   80:aload_0         
		//*  39   81:getfield        #33  <Field MediaBrowserServiceCompat this$0>
		//*  40   84:getfield        #142 <Field android.support.v4.media.session.MediaSessionCompat$Token MediaBrowserServiceCompat.mSession>
		//*  41   87:ifnull          152
					{
						obj = ((Object) (mSession.getExtraBinder()));
		//   42   90:aload_0         
		//   43   91:getfield        #33  <Field MediaBrowserServiceCompat this$0>
		//   44   94:getfield        #142 <Field android.support.v4.media.session.MediaSessionCompat$Token MediaBrowserServiceCompat.mSession>
		//   45   97:invokevirtual   #148 <Method IMediaSession android.support.v4.media.session.MediaSessionCompat$Token.getExtraBinder()>
		//   46  100:astore          4
						if(obj == null)
		//*  47  102:aload           4
		//*  48  104:ifnonnull       140
							obj = null;
		//   49  107:aconst_null     
		//   50  108:astore          4
						else
		//*  51  110:aload           5
		//*  52  112:ldc1            #150 <String "extra_session_binder">
		//*  53  114:aload           4
		//*  54  116:invokestatic    #138 <Method void BundleCompat.putBinder(Bundle, String, IBinder)>
		//*  55  119:aload           5
		//*  56  121:astore          4
		//*  57  123:aload_0         
		//*  58  124:getfield        #33  <Field MediaBrowserServiceCompat this$0>
		//*  59  127:aload_1         
		//*  60  128:iload_2         
		//*  61  129:aload_3         
		//*  62  130:invokevirtual   #153 <Method MediaBrowserServiceCompat$BrowserRoot MediaBrowserServiceCompat.onGetRoot(String, int, Bundle)>
		//*  63  133:astore_3        
		//*  64  134:aload_3         
		//*  65  135:ifnonnull       171
		//*  66  138:aconst_null     
		//*  67  139:areturn         
							obj = ((Object) (((IMediaSession) (obj)).asBinder()));
		//   68  140:aload           4
		//   69  142:invokeinterface #158 <Method IBinder IMediaSession.asBinder()>
		//   70  147:astore          4
						BundleCompat.putBinder(bundle1, "extra_session_binder", ((IBinder) (obj)));
						obj = ((Object) (bundle1));
					} else
		//*  71  149:goto            110
					{
						mRootExtrasList.add(((Object) (bundle1)));
		//   72  152:aload_0         
		//   73  153:getfield        #41  <Field List mRootExtrasList>
		//   74  156:aload           5
		//   75  158:invokeinterface #164 <Method boolean List.add(Object)>
		//   76  163:pop             
						obj = ((Object) (bundle1));
		//   77  164:aload           5
		//   78  166:astore          4
					}
				}
			}
			bundle = ((Bundle) (MediaBrowserServiceCompat.this.onGetRoot(s, i, bundle)));
			if(bundle == null)
				return null;
		//*  79  168:goto            123
			if(obj != null) goto _L2; else goto _L1
		//   80  171:aload           4
		//   81  173:ifnonnull       194
_L1:
			s = ((String) (((BrowserRoot) (bundle)).getExtras()));
		//   82  176:aload_3         
		//   83  177:invokevirtual   #169 <Method Bundle MediaBrowserServiceCompat$BrowserRoot.getExtras()>
		//   84  180:astore_1        
_L4:
			return new MediaBrowserServiceCompatApi21.BrowserRoot(((BrowserRoot) (bundle)).getRootId(), ((Bundle) (s)));
		//   85  181:new             #171 <Class MediaBrowserServiceCompatApi21$BrowserRoot>
		//   86  184:dup             
		//   87  185:aload_3         
		//   88  186:invokevirtual   #175 <Method String MediaBrowserServiceCompat$BrowserRoot.getRootId()>
		//   89  189:aload_1         
		//   90  190:invokespecial   #177 <Method void MediaBrowserServiceCompatApi21$BrowserRoot(String, Bundle)>
		//   91  193:areturn         
_L2:
			s = ((String) (obj));
		//   92  194:aload           4
		//   93  196:astore_1        
			if(((BrowserRoot) (bundle)).getExtras() != null)
		//*  94  197:aload_3         
		//*  95  198:invokevirtual   #169 <Method Bundle MediaBrowserServiceCompat$BrowserRoot.getExtras()>
		//*  96  201:ifnull          181
			{
				((Bundle) (obj)).putAll(((BrowserRoot) (bundle)).getExtras());
		//   97  204:aload           4
		//   98  206:aload_3         
		//   99  207:invokevirtual   #169 <Method Bundle MediaBrowserServiceCompat$BrowserRoot.getExtras()>
		//  100  210:invokevirtual   #180 <Method void Bundle.putAll(Bundle)>
				s = ((String) (obj));
		//  101  213:aload           4
		//  102  215:astore_1        
			}
			if(true) goto _L4; else goto _L3
		//  103  216:goto            181
_L3:
		}

		public void onLoadChildren(String s, MediaBrowserServiceCompatApi21.ResultWrapper resultwrapper)
		{
			resultwrapper = ((MediaBrowserServiceCompatApi21.ResultWrapper) (((_cls3) (s)). new Result(resultwrapper) {

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
					Object obj = null;
				//    0    0:aconst_null     
				//    1    1:astore_2        
					if(list != null)
				//*   2    2:aload_1         
				//*   3    3:ifnull          66
					{
						ArrayList arraylist = new ArrayList();
				//    4    6:new             #41  <Class ArrayList>
				//    5    9:dup             
				//    6   10:invokespecial   #43  <Method void ArrayList()>
				//    7   13:astore_3        
						list = ((List) (list.iterator()));
				//    8   14:aload_1         
				//    9   15:invokeinterface #47  <Method Iterator List.iterator()>
				//   10   20:astore_1        
						do
						{
							obj = ((Object) (arraylist));
				//   11   21:aload_3         
				//   12   22:astore_2        
							if(!((Iterator) (list)).hasNext())
								break;
				//   13   23:aload_1         
				//   14   24:invokeinterface #53  <Method boolean Iterator.hasNext()>
				//   15   29:ifeq            66
							obj = ((Object) ((MediaBrowserCompat.MediaItem)((Iterator) (list)).next()));
				//   16   32:aload_1         
				//   17   33:invokeinterface #57  <Method Object Iterator.next()>
				//   18   38:checkcast       #59  <Class MediaBrowserCompat$MediaItem>
				//   19   41:astore_2        
							Parcel parcel = Parcel.obtain();
				//   20   42:invokestatic    #65  <Method Parcel Parcel.obtain()>
				//   21   45:astore          4
							((MediaBrowserCompat.MediaItem) (obj)).writeToParcel(parcel, 0);
				//   22   47:aload_2         
				//   23   48:aload           4
				//   24   50:iconst_0        
				//   25   51:invokevirtual   #69  <Method void MediaBrowserCompat$MediaItem.writeToParcel(Parcel, int)>
							((List) (arraylist)).add(((Object) (parcel)));
				//   26   54:aload_3         
				//   27   55:aload           4
				//   28   57:invokeinterface #73  <Method boolean List.add(Object)>
				//   29   62:pop             
						} while(true);
				//   30   63:goto            21
					}
					resultWrapper.sendResult(obj);
				//   31   66:aload_0         
				//   32   67:getfield        #23  <Field MediaBrowserServiceCompatApi21$ResultWrapper val$resultWrapper>
				//   33   70:aload_2         
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
		//    0    0:new             #17  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$3>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #185 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$3(MediaBrowserServiceCompat$MediaBrowserServiceImplApi21, Object, MediaBrowserServiceCompatApi21$ResultWrapper)>
		//    6   10:astore_2        
			MediaBrowserServiceCompat.this.onLoadChildren(s, ((Result) (resultwrapper)));
		//    7   11:aload_0         
		//    8   12:getfield        #33  <Field MediaBrowserServiceCompat this$0>
		//    9   15:aload_1         
		//   10   16:aload_2         
		//   11   17:invokevirtual   #188 <Method void MediaBrowserServiceCompat.onLoadChildren(String, MediaBrowserServiceCompat$Result)>
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
		//    2    4:getfield        #81  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//    3    7:new             #13  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$1>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:invokespecial   #195 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$1(MediaBrowserServiceCompat$MediaBrowserServiceImplApi21, android.support.v4.media.session.MediaSessionCompat$Token)>
		//    8   16:invokevirtual   #199 <Method void MediaBrowserServiceCompat$ServiceHandler.postOrRun(Runnable)>
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

	class MediaBrowserServiceImplApi24 extends MediaBrowserServiceImplApi23
		implements MediaBrowserServiceCompatApi24.ServiceCompatProxy
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
				return MediaBrowserServiceCompatApi24.getBrowserRootHints(mServiceObj);
		//   19   43:aload_0         
		//   20   44:getfield        #44  <Field Object mServiceObj>
		//   21   47:invokestatic    #49  <Method Bundle MediaBrowserServiceCompatApi24.getBrowserRootHints(Object)>
		//   22   50:areturn         
			}
		}

		public void notifyChildrenChanged(String s, Bundle bundle)
		{
			if(bundle == null)
		//*   0    0:aload_2         
		//*   1    1:ifnonnull       13
			{
				MediaBrowserServiceCompatApi21.notifyChildrenChanged(mServiceObj, s);
		//    2    4:aload_0         
		//    3    5:getfield        #44  <Field Object mServiceObj>
		//    4    8:aload_1         
		//    5    9:invokestatic    #56  <Method void MediaBrowserServiceCompatApi21.notifyChildrenChanged(Object, String)>
				return;
		//    6   12:return          
			} else
			{
				MediaBrowserServiceCompatApi24.notifyChildrenChanged(mServiceObj, s, bundle);
		//    7   13:aload_0         
		//    8   14:getfield        #44  <Field Object mServiceObj>
		//    9   17:aload_1         
		//   10   18:aload_2         
		//   11   19:invokestatic    #59  <Method void MediaBrowserServiceCompatApi24.notifyChildrenChanged(Object, String, Bundle)>
				return;
		//   12   22:return          
			}
		}

		public void onCreate()
		{
			mServiceObj = MediaBrowserServiceCompatApi24.createService(((android.content.Context) (MediaBrowserServiceCompat.this)), ((MediaBrowserServiceCompatApi24.ServiceCompatProxy) (this)));
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #20  <Field MediaBrowserServiceCompat this$0>
		//    3    5:aload_0         
		//    4    6:invokestatic    #65  <Method Object MediaBrowserServiceCompatApi24.createService(android.content.Context, MediaBrowserServiceCompatApi24$ServiceCompatProxy)>
		//    5    9:putfield        #44  <Field Object mServiceObj>
			MediaBrowserServiceCompatApi21.onCreate(mServiceObj);
		//    6   12:aload_0         
		//    7   13:getfield        #44  <Field Object mServiceObj>
		//    8   16:invokestatic    #68  <Method void MediaBrowserServiceCompatApi21.onCreate(Object)>
		//    9   19:return          
		}

		public void onLoadChildren(String s, MediaBrowserServiceCompatApi24.ResultWrapper resultwrapper, Bundle bundle)
		{
			resultwrapper = ((MediaBrowserServiceCompatApi24.ResultWrapper) (((_cls1) (s)). new Result(resultwrapper) {

				public void detach()
				{
					resultWrapper.detach();
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field MediaBrowserServiceCompatApi24$ResultWrapper val$resultWrapper>
				//    2    4:invokevirtual   #33  <Method void MediaBrowserServiceCompatApi24$ResultWrapper.detach()>
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
					Object obj = null;
				//    0    0:aconst_null     
				//    1    1:astore_2        
					if(list != null)
				//*   2    2:aload_1         
				//*   3    3:ifnull          66
					{
						ArrayList arraylist = new ArrayList();
				//    4    6:new             #41  <Class ArrayList>
				//    5    9:dup             
				//    6   10:invokespecial   #43  <Method void ArrayList()>
				//    7   13:astore_3        
						list = ((List) (list.iterator()));
				//    8   14:aload_1         
				//    9   15:invokeinterface #47  <Method Iterator List.iterator()>
				//   10   20:astore_1        
						do
						{
							obj = ((Object) (arraylist));
				//   11   21:aload_3         
				//   12   22:astore_2        
							if(!((Iterator) (list)).hasNext())
								break;
				//   13   23:aload_1         
				//   14   24:invokeinterface #53  <Method boolean Iterator.hasNext()>
				//   15   29:ifeq            66
							obj = ((Object) ((MediaBrowserCompat.MediaItem)((Iterator) (list)).next()));
				//   16   32:aload_1         
				//   17   33:invokeinterface #57  <Method Object Iterator.next()>
				//   18   38:checkcast       #59  <Class MediaBrowserCompat$MediaItem>
				//   19   41:astore_2        
							Parcel parcel = Parcel.obtain();
				//   20   42:invokestatic    #65  <Method Parcel Parcel.obtain()>
				//   21   45:astore          4
							((MediaBrowserCompat.MediaItem) (obj)).writeToParcel(parcel, 0);
				//   22   47:aload_2         
				//   23   48:aload           4
				//   24   50:iconst_0        
				//   25   51:invokevirtual   #69  <Method void MediaBrowserCompat$MediaItem.writeToParcel(Parcel, int)>
							((List) (arraylist)).add(((Object) (parcel)));
				//   26   54:aload_3         
				//   27   55:aload           4
				//   28   57:invokeinterface #73  <Method boolean List.add(Object)>
				//   29   62:pop             
						} while(true);
				//   30   63:goto            21
					}
					resultWrapper.sendResult(((List) (obj)), getFlags());
				//   31   66:aload_0         
				//   32   67:getfield        #23  <Field MediaBrowserServiceCompatApi24$ResultWrapper val$resultWrapper>
				//   33   70:aload_2         
				//   34   71:aload_0         
				//   35   72:invokevirtual   #77  <Method int getFlags()>
				//   36   75:invokevirtual   #81  <Method void MediaBrowserServiceCompatApi24$ResultWrapper.sendResult(List, int)>
				//   37   78:return          
				}

				final MediaBrowserServiceImplApi24 this$1;
				final MediaBrowserServiceCompatApi24.ResultWrapper val$resultWrapper;

			
			{
				this$1 = final_mediabrowserserviceimplapi24;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi24 this$1>
				resultWrapper = resultwrapper;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #23  <Field MediaBrowserServiceCompatApi24$ResultWrapper val$resultWrapper>
				super(Object.this);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:invokespecial   #26  <Method void MediaBrowserServiceCompat$Result(Object)>
			//    9   15:return          
			}
			}
));
		//    0    0:new             #11  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplApi24$1>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #73  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi24$1(MediaBrowserServiceCompat$MediaBrowserServiceImplApi24, Object, MediaBrowserServiceCompatApi24$ResultWrapper)>
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

		MediaBrowserServiceImplApi24()
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
				//*   9   25:ifeq            111
					{
						ConnectionRecord connectionrecord = (ConnectionRecord)iterator.next();
				//   10   28:aload_1         
				//   11   29:invokeinterface #61  <Method Object Iterator.next()>
				//   12   34:checkcast       #63  <Class MediaBrowserServiceCompat$ConnectionRecord>
				//   13   37:astore_2        
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
						catch(RemoteException remoteexception)
				//*  26   68:astore_3        
						{
							Log.w("MBServiceCompat", (new StringBuilder()).append("Connection for ").append(connectionrecord.pkg).append(" is no longer valid.").toString());
				//   27   69:ldc1            #89  <String "MBServiceCompat">
				//   28   71:new             #91  <Class StringBuilder>
				//   29   74:dup             
				//   30   75:invokespecial   #92  <Method void StringBuilder()>
				//   31   78:ldc1            #94  <String "Connection for ">
				//   32   80:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
				//   33   83:aload_2         
				//   34   84:getfield        #102 <Field String MediaBrowserServiceCompat$ConnectionRecord.pkg>
				//   35   87:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
				//   36   90:ldc1            #104 <String " is no longer valid.">
				//   37   92:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
				//   38   95:invokevirtual   #107 <Method String StringBuilder.toString()>
				//   39   98:invokestatic    #113 <Method int Log.w(String, String)>
				//   40  101:pop             
							iterator.remove();
				//   41  102:aload_1         
				//   42  103:invokeinterface #116 <Method void Iterator.remove()>
						}
					}

				//*  43  108:goto            19
				//   44  111:return          
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
			if(bundle != null && bundle.containsKey("android.media.browse.extra.DOWNLOAD_PROGRESS"))
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       5
		//*   2    4:return          
		//*   3    5:aload_1         
		//*   4    6:ldc1            #29  <String "android.media.browse.extra.DOWNLOAD_PROGRESS">
		//*   5    8:invokevirtual   #35  <Method boolean Bundle.containsKey(String)>
		//*   6   11:ifeq            4
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
		//*  18   32:ifle            4
					throw new IllegalArgumentException("The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0].");
		//   19   35:new             #43  <Class IllegalArgumentException>
		//   20   38:dup             
		//   21   39:ldc1            #45  <String "The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0].">
		//   22   41:invokespecial   #48  <Method void IllegalArgumentException(String)>
		//   23   44:athrow          
			}
		}

		public void detach()
		{
			if(mDetachCalled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #51  <Field boolean mDetachCalled>
		//*   2    4:ifeq            37
				throw new IllegalStateException((new StringBuilder()).append("detach() called when detach() had already been called for: ").append(mDebug).toString());
		//    3    7:new             #53  <Class IllegalStateException>
		//    4   10:dup             
		//    5   11:new             #55  <Class StringBuilder>
		//    6   14:dup             
		//    7   15:invokespecial   #56  <Method void StringBuilder()>
		//    8   18:ldc1            #58  <String "detach() called when detach() had already been called for: ">
		//    9   20:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
		//   10   23:aload_0         
		//   11   24:getfield        #24  <Field Object mDebug>
		//   12   27:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
		//   13   30:invokevirtual   #69  <Method String StringBuilder.toString()>
		//   14   33:invokespecial   #70  <Method void IllegalStateException(String)>
		//   15   36:athrow          
			if(mSendResultCalled)
		//*  16   37:aload_0         
		//*  17   38:getfield        #72  <Field boolean mSendResultCalled>
		//*  18   41:ifeq            74
				throw new IllegalStateException((new StringBuilder()).append("detach() called when sendResult() had already been called for: ").append(mDebug).toString());
		//   19   44:new             #53  <Class IllegalStateException>
		//   20   47:dup             
		//   21   48:new             #55  <Class StringBuilder>
		//   22   51:dup             
		//   23   52:invokespecial   #56  <Method void StringBuilder()>
		//   24   55:ldc1            #74  <String "detach() called when sendResult() had already been called for: ">
		//   25   57:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
		//   26   60:aload_0         
		//   27   61:getfield        #24  <Field Object mDebug>
		//   28   64:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
		//   29   67:invokevirtual   #69  <Method String StringBuilder.toString()>
		//   30   70:invokespecial   #70  <Method void IllegalStateException(String)>
		//   31   73:athrow          
			if(mSendErrorCalled)
		//*  32   74:aload_0         
		//*  33   75:getfield        #76  <Field boolean mSendErrorCalled>
		//*  34   78:ifeq            111
			{
				throw new IllegalStateException((new StringBuilder()).append("detach() called when sendError() had already been called for: ").append(mDebug).toString());
		//   35   81:new             #53  <Class IllegalStateException>
		//   36   84:dup             
		//   37   85:new             #55  <Class StringBuilder>
		//   38   88:dup             
		//   39   89:invokespecial   #56  <Method void StringBuilder()>
		//   40   92:ldc1            #78  <String "detach() called when sendError() had already been called for: ">
		//   41   94:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
		//   42   97:aload_0         
		//   43   98:getfield        #24  <Field Object mDebug>
		//   44  101:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
		//   45  104:invokevirtual   #69  <Method String StringBuilder.toString()>
		//   46  107:invokespecial   #70  <Method void IllegalStateException(String)>
		//   47  110:athrow          
			} else
			{
				mDetachCalled = true;
		//   48  111:aload_0         
		//   49  112:iconst_1        
		//   50  113:putfield        #51  <Field boolean mDetachCalled>
				return;
		//   51  116:return          
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
		//    2    4:ifne            21
		//    3    7:aload_0         
		//    4    8:getfield        #72  <Field boolean mSendResultCalled>
		//    5   11:ifne            21
		//    6   14:aload_0         
		//    7   15:getfield        #76  <Field boolean mSendErrorCalled>
		//    8   18:ifeq            23
		//    9   21:iconst_1        
		//   10   22:ireturn         
		//   11   23:iconst_0        
		//   12   24:ireturn         
		}

		void onErrorSent(Bundle bundle)
		{
			throw new UnsupportedOperationException((new StringBuilder()).append("It is not supported to send an error for ").append(mDebug).toString());
		//    0    0:new             #87  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:new             #55  <Class StringBuilder>
		//    3    7:dup             
		//    4    8:invokespecial   #56  <Method void StringBuilder()>
		//    5   11:ldc1            #89  <String "It is not supported to send an error for ">
		//    6   13:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
		//    7   16:aload_0         
		//    8   17:getfield        #24  <Field Object mDebug>
		//    9   20:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
		//   10   23:invokevirtual   #69  <Method String StringBuilder.toString()>
		//   11   26:invokespecial   #90  <Method void UnsupportedOperationException(String)>
		//   12   29:athrow          
		}

		void onProgressUpdateSent(Bundle bundle)
		{
			throw new UnsupportedOperationException((new StringBuilder()).append("It is not supported to send an interim update for ").append(mDebug).toString());
		//    0    0:new             #87  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:new             #55  <Class StringBuilder>
		//    3    7:dup             
		//    4    8:invokespecial   #56  <Method void StringBuilder()>
		//    5   11:ldc1            #93  <String "It is not supported to send an interim update for ">
		//    6   13:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
		//    7   16:aload_0         
		//    8   17:getfield        #24  <Field Object mDebug>
		//    9   20:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
		//   10   23:invokevirtual   #69  <Method String StringBuilder.toString()>
		//   11   26:invokespecial   #90  <Method void UnsupportedOperationException(String)>
		//   12   29:athrow          
		}

		void onResultSent(Object obj)
		{
		//    0    0:return          
		}

		public void sendError(Bundle bundle)
		{
			if(mSendResultCalled || mSendErrorCalled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #72  <Field boolean mSendResultCalled>
		//*   2    4:ifne            14
		//*   3    7:aload_0         
		//*   4    8:getfield        #76  <Field boolean mSendErrorCalled>
		//*   5   11:ifeq            44
			{
				throw new IllegalStateException((new StringBuilder()).append("sendError() called when either sendResult() or sendError() had already been called for: ").append(mDebug).toString());
		//    6   14:new             #53  <Class IllegalStateException>
		//    7   17:dup             
		//    8   18:new             #55  <Class StringBuilder>
		//    9   21:dup             
		//   10   22:invokespecial   #56  <Method void StringBuilder()>
		//   11   25:ldc1            #99  <String "sendError() called when either sendResult() or sendError() had already been called for: ">
		//   12   27:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
		//   13   30:aload_0         
		//   14   31:getfield        #24  <Field Object mDebug>
		//   15   34:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
		//   16   37:invokevirtual   #69  <Method String StringBuilder.toString()>
		//   17   40:invokespecial   #70  <Method void IllegalStateException(String)>
		//   18   43:athrow          
			} else
			{
				mSendErrorCalled = true;
		//   19   44:aload_0         
		//   20   45:iconst_1        
		//   21   46:putfield        #76  <Field boolean mSendErrorCalled>
				onErrorSent(bundle);
		//   22   49:aload_0         
		//   23   50:aload_1         
		//   24   51:invokevirtual   #101 <Method void onErrorSent(Bundle)>
				return;
		//   25   54:return          
			}
		}

		public void sendProgressUpdate(Bundle bundle)
		{
			if(mSendResultCalled || mSendErrorCalled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #72  <Field boolean mSendResultCalled>
		//*   2    4:ifne            14
		//*   3    7:aload_0         
		//*   4    8:getfield        #76  <Field boolean mSendErrorCalled>
		//*   5   11:ifeq            44
			{
				throw new IllegalStateException((new StringBuilder()).append("sendProgressUpdate() called when either sendResult() or sendError() had already been called for: ").append(mDebug).toString());
		//    6   14:new             #53  <Class IllegalStateException>
		//    7   17:dup             
		//    8   18:new             #55  <Class StringBuilder>
		//    9   21:dup             
		//   10   22:invokespecial   #56  <Method void StringBuilder()>
		//   11   25:ldc1            #104 <String "sendProgressUpdate() called when either sendResult() or sendError() had already been called for: ">
		//   12   27:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
		//   13   30:aload_0         
		//   14   31:getfield        #24  <Field Object mDebug>
		//   15   34:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
		//   16   37:invokevirtual   #69  <Method String StringBuilder.toString()>
		//   17   40:invokespecial   #70  <Method void IllegalStateException(String)>
		//   18   43:athrow          
			} else
			{
				checkExtraFields(bundle);
		//   19   44:aload_0         
		//   20   45:aload_1         
		//   21   46:invokespecial   #106 <Method void checkExtraFields(Bundle)>
				mSendProgressUpdateCalled = true;
		//   22   49:aload_0         
		//   23   50:iconst_1        
		//   24   51:putfield        #108 <Field boolean mSendProgressUpdateCalled>
				onProgressUpdateSent(bundle);
		//   25   54:aload_0         
		//   26   55:aload_1         
		//   27   56:invokevirtual   #110 <Method void onProgressUpdateSent(Bundle)>
				return;
		//   28   59:return          
			}
		}

		public void sendResult(Object obj)
		{
			if(mSendResultCalled || mSendErrorCalled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #72  <Field boolean mSendResultCalled>
		//*   2    4:ifne            14
		//*   3    7:aload_0         
		//*   4    8:getfield        #76  <Field boolean mSendErrorCalled>
		//*   5   11:ifeq            44
			{
				throw new IllegalStateException((new StringBuilder()).append("sendResult() called when either sendResult() or sendError() had already been called for: ").append(mDebug).toString());
		//    6   14:new             #53  <Class IllegalStateException>
		//    7   17:dup             
		//    8   18:new             #55  <Class StringBuilder>
		//    9   21:dup             
		//   10   22:invokespecial   #56  <Method void StringBuilder()>
		//   11   25:ldc1            #113 <String "sendResult() called when either sendResult() or sendError() had already been called for: ">
		//   12   27:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
		//   13   30:aload_0         
		//   14   31:getfield        #24  <Field Object mDebug>
		//   15   34:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
		//   16   37:invokevirtual   #69  <Method String StringBuilder.toString()>
		//   17   40:invokespecial   #70  <Method void IllegalStateException(String)>
		//   18   43:athrow          
			} else
			{
				mSendResultCalled = true;
		//   19   44:aload_0         
		//   20   45:iconst_1        
		//   21   46:putfield        #72  <Field boolean mSendResultCalled>
				onResultSent(obj);
		//   22   49:aload_0         
		//   23   50:aload_1         
		//   24   51:invokevirtual   #115 <Method void onResultSent(Object)>
				return;
		//   25   54:return          
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
				//*  13   29:ifnonnull       61
					{
						Log.w("MBServiceCompat", (new StringBuilder()).append("addSubscription for callback that isn't registered id=").append(id).toString());
				//   14   32:ldc1            #65  <String "MBServiceCompat">
				//   15   34:new             #67  <Class StringBuilder>
				//   16   37:dup             
				//   17   38:invokespecial   #68  <Method void StringBuilder()>
				//   18   41:ldc1            #70  <String "addSubscription for callback that isn't registered id=">
				//   19   43:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
				//   20   46:aload_0         
				//   21   47:getfield        #32  <Field String val$id>
				//   22   50:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
				//   23   53:invokevirtual   #78  <Method String StringBuilder.toString()>
				//   24   56:invokestatic    #84  <Method int Log.w(String, String)>
				//   25   59:pop             
						return;
				//   26   60:return          
					} else
					{
						addSubscription(id, ((ConnectionRecord) (obj)), token, options);
				//   27   61:aload_0         
				//   28   62:getfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				//   29   65:getfield        #51  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
				//   30   68:aload_0         
				//   31   69:getfield        #32  <Field String val$id>
				//   32   72:aload_1         
				//   33   73:aload_0         
				//   34   74:getfield        #34  <Field IBinder val$token>
				//   35   77:aload_0         
				//   36   78:getfield        #36  <Field Bundle val$options>
				//   37   81:invokevirtual   #87  <Method void MediaBrowserServiceCompat.addSubscription(String, MediaBrowserServiceCompat$ConnectionRecord, IBinder, Bundle)>
						return;
				//   38   84:return          
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
		//*   5    9:ifne            48
			{
				throw new IllegalArgumentException((new StringBuilder()).append("Package/uid mismatch: uid=").append(i).append(" package=").append(pkg).toString());
		//    6   12:new             #58  <Class IllegalArgumentException>
		//    7   15:dup             
		//    8   16:new             #60  <Class StringBuilder>
		//    9   19:dup             
		//   10   20:invokespecial   #61  <Method void StringBuilder()>
		//   11   23:ldc1            #63  <String "Package/uid mismatch: uid=">
		//   12   25:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
		//   13   28:iload_2         
		//   14   29:invokevirtual   #70  <Method StringBuilder StringBuilder.append(int)>
		//   15   32:ldc1            #72  <String " package=">
		//   16   34:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
		//   17   37:aload_1         
		//   18   38:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
		//   19   41:invokevirtual   #76  <Method String StringBuilder.toString()>
		//   20   44:invokespecial   #79  <Method void IllegalArgumentException(String)>
		//   21   47:athrow          
			} else
			{
				mHandler.postOrRun(((_cls1) (i)). new Runnable() {

					public void run()
					{
						Object obj;
						ConnectionRecord connectionrecord;
						obj = ((Object) (callbacks.asBinder()));
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
						connectionrecord = new ConnectionRecord();
					//   11   25:new             #65  <Class MediaBrowserServiceCompat$ConnectionRecord>
					//   12   28:dup             
					//   13   29:invokespecial   #66  <Method void MediaBrowserServiceCompat$ConnectionRecord()>
					//   14   32:astore_2        
						connectionrecord.pkg = pkg;
					//   15   33:aload_2         
					//   16   34:aload_0         
					//   17   35:getfield        #32  <Field String val$pkg>
					//   18   38:putfield        #69  <Field String MediaBrowserServiceCompat$ConnectionRecord.pkg>
						connectionrecord.rootHints = rootHints;
					//   19   41:aload_2         
					//   20   42:aload_0         
					//   21   43:getfield        #34  <Field Bundle val$rootHints>
					//   22   46:putfield        #72  <Field Bundle MediaBrowserServiceCompat$ConnectionRecord.rootHints>
						connectionrecord.callbacks = callbacks;
					//   23   49:aload_2         
					//   24   50:aload_0         
					//   25   51:getfield        #30  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
					//   26   54:putfield        #75  <Field MediaBrowserServiceCompat$ServiceCallbacks MediaBrowserServiceCompat$ConnectionRecord.callbacks>
						connectionrecord.root = onGetRoot(pkg, uid, rootHints);
					//   27   57:aload_2         
					//   28   58:aload_0         
					//   29   59:getfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
					//   30   62:getfield        #53  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
					//   31   65:aload_0         
					//   32   66:getfield        #32  <Field String val$pkg>
					//   33   69:aload_0         
					//   34   70:getfield        #36  <Field int val$uid>
					//   35   73:aload_0         
					//   36   74:getfield        #34  <Field Bundle val$rootHints>
					//   37   77:invokevirtual   #79  <Method MediaBrowserServiceCompat$BrowserRoot MediaBrowserServiceCompat.onGetRoot(String, int, Bundle)>
					//   38   80:putfield        #83  <Field MediaBrowserServiceCompat$BrowserRoot MediaBrowserServiceCompat$ConnectionRecord.root>
						if(connectionrecord.root != null)
							break MISSING_BLOCK_LABEL_173;
					//   39   83:aload_2         
					//   40   84:getfield        #83  <Field MediaBrowserServiceCompat$BrowserRoot MediaBrowserServiceCompat$ConnectionRecord.root>
					//   41   87:ifnonnull       173
						Log.i("MBServiceCompat", (new StringBuilder()).append("No root for client ").append(pkg).append(" from service ").append(((Object)this).getClass().getName()).toString());
					//   42   90:ldc1            #85  <String "MBServiceCompat">
					//   43   92:new             #87  <Class StringBuilder>
					//   44   95:dup             
					//   45   96:invokespecial   #88  <Method void StringBuilder()>
					//   46   99:ldc1            #90  <String "No root for client ">
					//   47  101:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
					//   48  104:aload_0         
					//   49  105:getfield        #32  <Field String val$pkg>
					//   50  108:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
					//   51  111:ldc1            #96  <String " from service ">
					//   52  113:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
					//   53  116:aload_0         
					//   54  117:invokevirtual   #100 <Method Class Object.getClass()>
					//   55  120:invokevirtual   #106 <Method String Class.getName()>
					//   56  123:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
					//   57  126:invokevirtual   #109 <Method String StringBuilder.toString()>
					//   58  129:invokestatic    #115 <Method int Log.i(String, String)>
					//   59  132:pop             
						callbacks.onConnectFailed();
					//   60  133:aload_0         
					//   61  134:getfield        #30  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
					//   62  137:invokeinterface #118 <Method void MediaBrowserServiceCompat$ServiceCallbacks.onConnectFailed()>
_L1:
						return;
					//   63  142:return          
						obj;
					//   64  143:astore_1        
						Log.w("MBServiceCompat", (new StringBuilder()).append("Calling onConnectFailed() failed. Ignoring. pkg=").append(pkg).toString());
					//   65  144:ldc1            #85  <String "MBServiceCompat">
					//   66  146:new             #87  <Class StringBuilder>
					//   67  149:dup             
					//   68  150:invokespecial   #88  <Method void StringBuilder()>
					//   69  153:ldc1            #120 <String "Calling onConnectFailed() failed. Ignoring. pkg=">
					//   70  155:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
					//   71  158:aload_0         
					//   72  159:getfield        #32  <Field String val$pkg>
					//   73  162:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
					//   74  165:invokevirtual   #109 <Method String StringBuilder.toString()>
					//   75  168:invokestatic    #123 <Method int Log.w(String, String)>
					//   76  171:pop             
						return;
					//   77  172:return          
						try
						{
							mConnections.put(obj, ((Object) (connectionrecord)));
					//   78  173:aload_0         
					//   79  174:getfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
					//   80  177:getfield        #53  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
					//   81  180:getfield        #57  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
					//   82  183:aload_1         
					//   83  184:aload_2         
					//   84  185:invokevirtual   #127 <Method Object ArrayMap.put(Object, Object)>
					//   85  188:pop             
							if(mSession != null)
					//*  86  189:aload_0         
					//*  87  190:getfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
					//*  88  193:getfield        #53  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
					//*  89  196:getfield        #131 <Field android.support.v4.media.session.MediaSessionCompat$Token MediaBrowserServiceCompat.mSession>
					//*  90  199:ifnull          142
							{
								callbacks.onConnect(connectionrecord.root.getRootId(), mSession, connectionrecord.root.getExtras());
					//   91  202:aload_0         
					//   92  203:getfield        #30  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
					//   93  206:aload_2         
					//   94  207:getfield        #83  <Field MediaBrowserServiceCompat$BrowserRoot MediaBrowserServiceCompat$ConnectionRecord.root>
					//   95  210:invokevirtual   #136 <Method String MediaBrowserServiceCompat$BrowserRoot.getRootId()>
					//   96  213:aload_0         
					//   97  214:getfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
					//   98  217:getfield        #53  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
					//   99  220:getfield        #131 <Field android.support.v4.media.session.MediaSessionCompat$Token MediaBrowserServiceCompat.mSession>
					//  100  223:aload_2         
					//  101  224:getfield        #83  <Field MediaBrowserServiceCompat$BrowserRoot MediaBrowserServiceCompat$ConnectionRecord.root>
					//  102  227:invokevirtual   #140 <Method Bundle MediaBrowserServiceCompat$BrowserRoot.getExtras()>
					//  103  230:invokeinterface #144 <Method void MediaBrowserServiceCompat$ServiceCallbacks.onConnect(String, android.support.v4.media.session.MediaSessionCompat$Token, Bundle)>
								return;
					//  104  235:return          
							}
						}
						catch(RemoteException remoteexception)
					//* 105  236:astore_2        
						{
							Log.w("MBServiceCompat", (new StringBuilder()).append("Calling onConnect() failed. Dropping client. pkg=").append(pkg).toString());
					//  106  237:ldc1            #85  <String "MBServiceCompat">
					//  107  239:new             #87  <Class StringBuilder>
					//  108  242:dup             
					//  109  243:invokespecial   #88  <Method void StringBuilder()>
					//  110  246:ldc1            #146 <String "Calling onConnect() failed. Dropping client. pkg=">
					//  111  248:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
					//  112  251:aload_0         
					//  113  252:getfield        #32  <Field String val$pkg>
					//  114  255:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
					//  115  258:invokevirtual   #109 <Method String StringBuilder.toString()>
					//  116  261:invokestatic    #123 <Method int Log.w(String, String)>
					//  117  264:pop             
							mConnections.remove(obj);
					//  118  265:aload_0         
					//  119  266:getfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
					//  120  269:getfield        #53  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
					//  121  272:getfield        #57  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
					//  122  275:aload_1         
					//  123  276:invokevirtual   #63  <Method Object ArrayMap.remove(Object)>
					//  124  279:pop             
							return;
					//  125  280:return          
						}
						  goto _L1
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
		//   22   48:aload_0         
		//   23   49:getfield        #31  <Field MediaBrowserServiceCompat this$0>
		//   24   52:getfield        #41  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//   25   55:new             #9   <Class MediaBrowserServiceCompat$ServiceBinderImpl$1>
		//   26   58:dup             
		//   27   59:aload_0         
		//   28   60:aload           4
		//   29   62:aload_1         
		//   30   63:aload_3         
		//   31   64:iload_2         
		//   32   65:invokespecial   #82  <Method void MediaBrowserServiceCompat$ServiceBinderImpl$1(MediaBrowserServiceCompat$ServiceBinderImpl, MediaBrowserServiceCompat$ServiceCallbacks, String, Bundle, int)>
		//   33   68:invokevirtual   #50  <Method void MediaBrowserServiceCompat$ServiceHandler.postOrRun(Runnable)>
				return;
		//   34   71:return          
			}
		}

		public void disconnect(ServiceCallbacks servicecallbacks)
		{
			mHandler.postOrRun(((_cls2) (servicecallbacks)). new Runnable() {

				public void run()
				{
					IBinder ibinder = callbacks.asBinder();
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
				//    2    4:invokeinterface #35  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
				//    3    9:astore_1        
					if((ConnectionRecord)mConnections.remove(((Object) (ibinder))) == null);
				//    4   10:aload_0         
				//    5   11:getfield        #22  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				//    6   14:getfield        #39  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
				//    7   17:getfield        #43  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
				//    8   20:aload_1         
				//    9   21:invokevirtual   #49  <Method Object ArrayMap.remove(Object)>
				//   10   24:checkcast       #51  <Class MediaBrowserServiceCompat$ConnectionRecord>
				//   11   27:ifnull          30
				//   12   30:return          
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
			if(TextUtils.isEmpty(((CharSequence) (mediaId))) || resultreceiver == null)
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #95  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*   2    4:ifne            11
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
					//*  13   29:ifnonnull       61
						{
							Log.w("MBServiceCompat", (new StringBuilder()).append("getMediaItem for callback that isn't registered id=").append(mediaId).toString());
					//   14   32:ldc1            #61  <String "MBServiceCompat">
					//   15   34:new             #63  <Class StringBuilder>
					//   16   37:dup             
					//   17   38:invokespecial   #64  <Method void StringBuilder()>
					//   18   41:ldc1            #66  <String "getMediaItem for callback that isn't registered id=">
					//   19   43:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
					//   20   46:aload_0         
					//   21   47:getfield        #30  <Field String val$mediaId>
					//   22   50:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
					//   23   53:invokevirtual   #74  <Method String StringBuilder.toString()>
					//   24   56:invokestatic    #80  <Method int Log.w(String, String)>
					//   25   59:pop             
							return;
					//   26   60:return          
						} else
						{
							performLoadItem(mediaId, ((ConnectionRecord) (obj)), receiver);
					//   27   61:aload_0         
					//   28   62:getfield        #26  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
					//   29   65:getfield        #47  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
					//   30   68:aload_0         
					//   31   69:getfield        #30  <Field String val$mediaId>
					//   32   72:aload_1         
					//   33   73:aload_0         
					//   34   74:getfield        #32  <Field ResultReceiver val$receiver>
					//   35   77:invokevirtual   #84  <Method void MediaBrowserServiceCompat.performLoadItem(String, MediaBrowserServiceCompat$ConnectionRecord, ResultReceiver)>
							return;
					//   36   80:return          
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
		}

		public void registerCallbacks(final ServiceCallbacks callbacks, Bundle bundle)
		{
			mHandler.postOrRun(((_cls6) (bundle)). new Runnable() {

				public void run()
				{
					IBinder ibinder = callbacks.asBinder();
				//    0    0:aload_0         
				//    1    1:getfield        #26  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
				//    2    4:invokeinterface #39  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
				//    3    9:astore_1        
					mConnections.remove(((Object) (ibinder)));
				//    4   10:aload_0         
				//    5   11:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				//    6   14:getfield        #43  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
				//    7   17:getfield        #47  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
				//    8   20:aload_1         
				//    9   21:invokevirtual   #53  <Method Object ArrayMap.remove(Object)>
				//   10   24:pop             
					ConnectionRecord connectionrecord = new ConnectionRecord();
				//   11   25:new             #55  <Class MediaBrowserServiceCompat$ConnectionRecord>
				//   12   28:dup             
				//   13   29:invokespecial   #56  <Method void MediaBrowserServiceCompat$ConnectionRecord()>
				//   14   32:astore_2        
					connectionrecord.callbacks = callbacks;
				//   15   33:aload_2         
				//   16   34:aload_0         
				//   17   35:getfield        #26  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
				//   18   38:putfield        #59  <Field MediaBrowserServiceCompat$ServiceCallbacks MediaBrowserServiceCompat$ConnectionRecord.callbacks>
					connectionrecord.rootHints = rootHints;
				//   19   41:aload_2         
				//   20   42:aload_0         
				//   21   43:getfield        #28  <Field Bundle val$rootHints>
				//   22   46:putfield        #62  <Field Bundle MediaBrowserServiceCompat$ConnectionRecord.rootHints>
					mConnections.put(((Object) (ibinder)), ((Object) (connectionrecord)));
				//   23   49:aload_0         
				//   24   50:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				//   25   53:getfield        #43  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
				//   26   56:getfield        #47  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
				//   27   59:aload_1         
				//   28   60:aload_2         
				//   29   61:invokevirtual   #66  <Method Object ArrayMap.put(Object, Object)>
				//   30   64:pop             
				//   31   65:return          
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
				//*  13   29:ifnonnull       61
						Log.w("MBServiceCompat", (new StringBuilder()).append("removeSubscription for callback that isn't registered id=").append(id).toString());
				//   14   32:ldc1            #61  <String "MBServiceCompat">
				//   15   34:new             #63  <Class StringBuilder>
				//   16   37:dup             
				//   17   38:invokespecial   #64  <Method void StringBuilder()>
				//   18   41:ldc1            #66  <String "removeSubscription for callback that isn't registered id=">
				//   19   43:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
				//   20   46:aload_0         
				//   21   47:getfield        #30  <Field String val$id>
				//   22   50:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
				//   23   53:invokevirtual   #74  <Method String StringBuilder.toString()>
				//   24   56:invokestatic    #80  <Method int Log.w(String, String)>
				//   25   59:pop             
					else
				//*  26   60:return          
					if(!removeSubscription(id, ((ConnectionRecord) (obj)), token))
				//*  27   61:aload_0         
				//*  28   62:getfield        #26  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				//*  29   65:getfield        #47  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
				//*  30   68:aload_0         
				//*  31   69:getfield        #30  <Field String val$id>
				//*  32   72:aload_1         
				//*  33   73:aload_0         
				//*  34   74:getfield        #32  <Field IBinder val$token>
				//*  35   77:invokevirtual   #83  <Method boolean MediaBrowserServiceCompat.removeSubscription(String, MediaBrowserServiceCompat$ConnectionRecord, IBinder)>
				//*  36   80:ifne            60
					{
						Log.w("MBServiceCompat", (new StringBuilder()).append("removeSubscription called for ").append(id).append(" which is not subscribed").toString());
				//   37   83:ldc1            #61  <String "MBServiceCompat">
				//   38   85:new             #63  <Class StringBuilder>
				//   39   88:dup             
				//   40   89:invokespecial   #64  <Method void StringBuilder()>
				//   41   92:ldc1            #85  <String "removeSubscription called for ">
				//   42   94:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
				//   43   97:aload_0         
				//   44   98:getfield        #30  <Field String val$id>
				//   45  101:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
				//   46  104:ldc1            #87  <String " which is not subscribed">
				//   47  106:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
				//   48  109:invokevirtual   #74  <Method String StringBuilder.toString()>
				//   49  112:invokestatic    #80  <Method int Log.w(String, String)>
				//   50  115:pop             
						return;
				//   51  116:return          
					}
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
			if(TextUtils.isEmpty(((CharSequence) (query))) || resultreceiver == null)
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #95  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*   2    4:ifne            11
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
					//*  13   29:ifnonnull       61
						{
							Log.w("MBServiceCompat", (new StringBuilder()).append("search for callback that isn't registered query=").append(query).toString());
					//   14   32:ldc1            #65  <String "MBServiceCompat">
					//   15   34:new             #67  <Class StringBuilder>
					//   16   37:dup             
					//   17   38:invokespecial   #68  <Method void StringBuilder()>
					//   18   41:ldc1            #70  <String "search for callback that isn't registered query=">
					//   19   43:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
					//   20   46:aload_0         
					//   21   47:getfield        #32  <Field String val$query>
					//   22   50:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
					//   23   53:invokevirtual   #78  <Method String StringBuilder.toString()>
					//   24   56:invokestatic    #84  <Method int Log.w(String, String)>
					//   25   59:pop             
							return;
					//   26   60:return          
						} else
						{
							performSearch(query, extras, ((ConnectionRecord) (obj)), receiver);
					//   27   61:aload_0         
					//   28   62:getfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
					//   29   65:getfield        #51  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
					//   30   68:aload_0         
					//   31   69:getfield        #32  <Field String val$query>
					//   32   72:aload_0         
					//   33   73:getfield        #34  <Field Bundle val$extras>
					//   34   76:aload_1         
					//   35   77:aload_0         
					//   36   78:getfield        #36  <Field ResultReceiver val$receiver>
					//   37   81:invokevirtual   #88  <Method void MediaBrowserServiceCompat.performSearch(String, Bundle, MediaBrowserServiceCompat$ConnectionRecord, ResultReceiver)>
							return;
					//   38   84:return          
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
		}

		public void sendCustomAction(final String action, final Bundle extras, ResultReceiver resultreceiver, final ServiceCallbacks callbacks)
		{
			if(TextUtils.isEmpty(((CharSequence) (action))) || resultreceiver == null)
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #95  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*   2    4:ifne            11
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
					//*  13   29:ifnonnull       73
						{
							Log.w("MBServiceCompat", (new StringBuilder()).append("sendCustomAction for callback that isn't registered action=").append(action).append(", extras=").append(((Object) (extras))).toString());
					//   14   32:ldc1            #65  <String "MBServiceCompat">
					//   15   34:new             #67  <Class StringBuilder>
					//   16   37:dup             
					//   17   38:invokespecial   #68  <Method void StringBuilder()>
					//   18   41:ldc1            #70  <String "sendCustomAction for callback that isn't registered action=">
					//   19   43:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
					//   20   46:aload_0         
					//   21   47:getfield        #32  <Field String val$action>
					//   22   50:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
					//   23   53:ldc1            #76  <String ", extras=">
					//   24   55:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
					//   25   58:aload_0         
					//   26   59:getfield        #34  <Field Bundle val$extras>
					//   27   62:invokevirtual   #79  <Method StringBuilder StringBuilder.append(Object)>
					//   28   65:invokevirtual   #83  <Method String StringBuilder.toString()>
					//   29   68:invokestatic    #89  <Method int Log.w(String, String)>
					//   30   71:pop             
							return;
					//   31   72:return          
						} else
						{
							performCustomAction(action, extras, ((ConnectionRecord) (obj)), receiver);
					//   32   73:aload_0         
					//   33   74:getfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
					//   34   77:getfield        #51  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
					//   35   80:aload_0         
					//   36   81:getfield        #32  <Field String val$action>
					//   37   84:aload_0         
					//   38   85:getfield        #34  <Field Bundle val$extras>
					//   39   88:aload_1         
					//   40   89:aload_0         
					//   41   90:getfield        #36  <Field ResultReceiver val$receiver>
					//   42   93:invokevirtual   #93  <Method void MediaBrowserServiceCompat.performCustomAction(String, Bundle, MediaBrowserServiceCompat$ConnectionRecord, ResultReceiver)>
							return;
					//   43   96:return          
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
					mConnections.remove(((Object) (ibinder)));
				//    4   10:aload_0         
				//    5   11:getfield        #22  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				//    6   14:getfield        #39  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
				//    7   17:getfield        #43  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
				//    8   20:aload_1         
				//    9   21:invokevirtual   #49  <Method Object ArrayMap.remove(Object)>
				//   10   24:pop             
				//   11   25:return          
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
			message.arg1 = 1;
		//    5    9:aload_3         
		//    6   10:iconst_1        
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
			bundle1.putInt("extra_service_version", 1);
		//    8   16:aload           4
		//    9   18:ldc1            #59  <String "extra_service_version">
		//   10   20:iconst_1        
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
		//*  13   26:ifnull          49
			{
				if(list instanceof ArrayList)
		//*  14   29:aload_2         
		//*  15   30:instanceof      #90  <Class ArrayList>
		//*  16   33:ifeq            57
					s = ((String) ((ArrayList)list));
		//   17   36:aload_2         
		//   18   37:checkcast       #90  <Class ArrayList>
		//   19   40:astore_1        
				else
		//*  20   41:aload           4
		//*  21   43:ldc1            #92  <String "data_media_item_list">
		//*  22   45:aload_1         
		//*  23   46:invokevirtual   #96  <Method void Bundle.putParcelableArrayList(String, ArrayList)>
		//*  24   49:aload_0         
		//*  25   50:iconst_3        
		//*  26   51:aload           4
		//*  27   53:invokespecial   #83  <Method void sendRequest(int, Bundle)>
		//*  28   56:return          
					s = ((String) (new ArrayList(((Collection) (list)))));
		//   29   57:new             #90  <Class ArrayList>
		//   30   60:dup             
		//   31   61:aload_2         
		//   32   62:invokespecial   #99  <Method void ArrayList(Collection)>
		//   33   65:astore_1        
				bundle1.putParcelableArrayList("data_media_item_list", ((ArrayList) (s)));
			}
			sendRequest(3, bundle1);
		//*  34   66:goto            41
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
			Bundle bundle = message.getData();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #33  <Method Bundle Message.getData()>
		//    2    4:astore_2        
			switch(message.what)
		//*   3    5:aload_1         
		//*   4    6:getfield        #37  <Field int Message.what>
			{
		//*   5    9:tableswitch     1 9: default 60
		//		               1 107
		//		               2 144
		//		               3 163
		//		               4 200
		//		               5 231
		//		               6 265
		//		               7 290
		//		               8 309
		//		               9 349
			default:
				Log.w("MBServiceCompat", (new StringBuilder()).append("Unhandled message: ").append(((Object) (message))).append("\n  Service version: ").append(1).append("\n  Client version: ").append(message.arg1).toString());
		//    6   60:ldc1            #39  <String "MBServiceCompat">
		//    7   62:new             #41  <Class StringBuilder>
		//    8   65:dup             
		//    9   66:invokespecial   #42  <Method void StringBuilder()>
		//   10   69:ldc1            #44  <String "Unhandled message: ">
		//   11   71:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
		//   12   74:aload_1         
		//   13   75:invokevirtual   #51  <Method StringBuilder StringBuilder.append(Object)>
		//   14   78:ldc1            #53  <String "\n  Service version: ">
		//   15   80:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
		//   16   83:iconst_1        
		//   17   84:invokevirtual   #56  <Method StringBuilder StringBuilder.append(int)>
		//   18   87:ldc1            #58  <String "\n  Client version: ">
		//   19   89:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
		//   20   92:aload_1         
		//   21   93:getfield        #61  <Field int Message.arg1>
		//   22   96:invokevirtual   #56  <Method StringBuilder StringBuilder.append(int)>
		//   23   99:invokevirtual   #65  <Method String StringBuilder.toString()>
		//   24  102:invokestatic    #71  <Method int Log.w(String, String)>
		//   25  105:pop             
				return;
		//   26  106:return          

			case 1: // '\001'
				mServiceBinderImpl.connect(bundle.getString("data_package_name"), bundle.getInt("data_calling_uid"), bundle.getBundle("data_root_hints"), ((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))));
		//   27  107:aload_0         
		//   28  108:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//   29  111:aload_2         
		//   30  112:ldc1            #73  <String "data_package_name">
		//   31  114:invokevirtual   #79  <Method String Bundle.getString(String)>
		//   32  117:aload_2         
		//   33  118:ldc1            #81  <String "data_calling_uid">
		//   34  120:invokevirtual   #85  <Method int Bundle.getInt(String)>
		//   35  123:aload_2         
		//   36  124:ldc1            #87  <String "data_root_hints">
		//   37  126:invokevirtual   #91  <Method Bundle Bundle.getBundle(String)>
		//   38  129:new             #93  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//   39  132:dup             
		//   40  133:aload_1         
		//   41  134:getfield        #97  <Field Messenger Message.replyTo>
		//   42  137:invokespecial   #100 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(Messenger)>
		//   43  140:invokevirtual   #104 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.connect(String, int, Bundle, MediaBrowserServiceCompat$ServiceCallbacks)>
				return;
		//   44  143:return          

			case 2: // '\002'
				mServiceBinderImpl.disconnect(((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))));
		//   45  144:aload_0         
		//   46  145:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//   47  148:new             #93  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//   48  151:dup             
		//   49  152:aload_1         
		//   50  153:getfield        #97  <Field Messenger Message.replyTo>
		//   51  156:invokespecial   #100 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(Messenger)>
		//   52  159:invokevirtual   #108 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.disconnect(MediaBrowserServiceCompat$ServiceCallbacks)>
				return;
		//   53  162:return          

			case 3: // '\003'
				mServiceBinderImpl.addSubscription(bundle.getString("data_media_item_id"), BundleCompat.getBinder(bundle, "data_callback_token"), bundle.getBundle("data_options"), ((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))));
		//   54  163:aload_0         
		//   55  164:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//   56  167:aload_2         
		//   57  168:ldc1            #110 <String "data_media_item_id">
		//   58  170:invokevirtual   #79  <Method String Bundle.getString(String)>
		//   59  173:aload_2         
		//   60  174:ldc1            #112 <String "data_callback_token">
		//   61  176:invokestatic    #118 <Method IBinder BundleCompat.getBinder(Bundle, String)>
		//   62  179:aload_2         
		//   63  180:ldc1            #120 <String "data_options">
		//   64  182:invokevirtual   #91  <Method Bundle Bundle.getBundle(String)>
		//   65  185:new             #93  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//   66  188:dup             
		//   67  189:aload_1         
		//   68  190:getfield        #97  <Field Messenger Message.replyTo>
		//   69  193:invokespecial   #100 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(Messenger)>
		//   70  196:invokevirtual   #124 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.addSubscription(String, IBinder, Bundle, MediaBrowserServiceCompat$ServiceCallbacks)>
				return;
		//   71  199:return          

			case 4: // '\004'
				mServiceBinderImpl.removeSubscription(bundle.getString("data_media_item_id"), BundleCompat.getBinder(bundle, "data_callback_token"), ((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))));
		//   72  200:aload_0         
		//   73  201:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//   74  204:aload_2         
		//   75  205:ldc1            #110 <String "data_media_item_id">
		//   76  207:invokevirtual   #79  <Method String Bundle.getString(String)>
		//   77  210:aload_2         
		//   78  211:ldc1            #112 <String "data_callback_token">
		//   79  213:invokestatic    #118 <Method IBinder BundleCompat.getBinder(Bundle, String)>
		//   80  216:new             #93  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//   81  219:dup             
		//   82  220:aload_1         
		//   83  221:getfield        #97  <Field Messenger Message.replyTo>
		//   84  224:invokespecial   #100 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(Messenger)>
		//   85  227:invokevirtual   #128 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.removeSubscription(String, IBinder, MediaBrowserServiceCompat$ServiceCallbacks)>
				return;
		//   86  230:return          

			case 5: // '\005'
				mServiceBinderImpl.getMediaItem(bundle.getString("data_media_item_id"), (ResultReceiver)bundle.getParcelable("data_result_receiver"), ((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))));
		//   87  231:aload_0         
		//   88  232:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//   89  235:aload_2         
		//   90  236:ldc1            #110 <String "data_media_item_id">
		//   91  238:invokevirtual   #79  <Method String Bundle.getString(String)>
		//   92  241:aload_2         
		//   93  242:ldc1            #130 <String "data_result_receiver">
		//   94  244:invokevirtual   #134 <Method android.os.Parcelable Bundle.getParcelable(String)>
		//   95  247:checkcast       #136 <Class ResultReceiver>
		//   96  250:new             #93  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//   97  253:dup             
		//   98  254:aload_1         
		//   99  255:getfield        #97  <Field Messenger Message.replyTo>
		//  100  258:invokespecial   #100 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(Messenger)>
		//  101  261:invokevirtual   #140 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.getMediaItem(String, ResultReceiver, MediaBrowserServiceCompat$ServiceCallbacks)>
				return;
		//  102  264:return          

			case 6: // '\006'
				mServiceBinderImpl.registerCallbacks(((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))), bundle.getBundle("data_root_hints"));
		//  103  265:aload_0         
		//  104  266:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//  105  269:new             #93  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//  106  272:dup             
		//  107  273:aload_1         
		//  108  274:getfield        #97  <Field Messenger Message.replyTo>
		//  109  277:invokespecial   #100 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(Messenger)>
		//  110  280:aload_2         
		//  111  281:ldc1            #87  <String "data_root_hints">
		//  112  283:invokevirtual   #91  <Method Bundle Bundle.getBundle(String)>
		//  113  286:invokevirtual   #144 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.registerCallbacks(MediaBrowserServiceCompat$ServiceCallbacks, Bundle)>
				return;
		//  114  289:return          

			case 7: // '\007'
				mServiceBinderImpl.unregisterCallbacks(((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))));
		//  115  290:aload_0         
		//  116  291:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//  117  294:new             #93  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//  118  297:dup             
		//  119  298:aload_1         
		//  120  299:getfield        #97  <Field Messenger Message.replyTo>
		//  121  302:invokespecial   #100 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(Messenger)>
		//  122  305:invokevirtual   #147 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.unregisterCallbacks(MediaBrowserServiceCompat$ServiceCallbacks)>
				return;
		//  123  308:return          

			case 8: // '\b'
				mServiceBinderImpl.search(bundle.getString("data_search_query"), bundle.getBundle("data_search_extras"), (ResultReceiver)bundle.getParcelable("data_result_receiver"), ((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))));
		//  124  309:aload_0         
		//  125  310:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//  126  313:aload_2         
		//  127  314:ldc1            #149 <String "data_search_query">
		//  128  316:invokevirtual   #79  <Method String Bundle.getString(String)>
		//  129  319:aload_2         
		//  130  320:ldc1            #151 <String "data_search_extras">
		//  131  322:invokevirtual   #91  <Method Bundle Bundle.getBundle(String)>
		//  132  325:aload_2         
		//  133  326:ldc1            #130 <String "data_result_receiver">
		//  134  328:invokevirtual   #134 <Method android.os.Parcelable Bundle.getParcelable(String)>
		//  135  331:checkcast       #136 <Class ResultReceiver>
		//  136  334:new             #93  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//  137  337:dup             
		//  138  338:aload_1         
		//  139  339:getfield        #97  <Field Messenger Message.replyTo>
		//  140  342:invokespecial   #100 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(Messenger)>
		//  141  345:invokevirtual   #155 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.search(String, Bundle, ResultReceiver, MediaBrowserServiceCompat$ServiceCallbacks)>
				return;
		//  142  348:return          

			case 9: // '\t'
				mServiceBinderImpl.sendCustomAction(bundle.getString("data_custom_action"), bundle.getBundle("data_custom_action_extras"), (ResultReceiver)bundle.getParcelable("data_result_receiver"), ((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))));
		//  143  349:aload_0         
		//  144  350:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//  145  353:aload_2         
		//  146  354:ldc1            #157 <String "data_custom_action">
		//  147  356:invokevirtual   #79  <Method String Bundle.getString(String)>
		//  148  359:aload_2         
		//  149  360:ldc1            #159 <String "data_custom_action_extras">
		//  150  362:invokevirtual   #91  <Method Bundle Bundle.getBundle(String)>
		//  151  365:aload_2         
		//  152  366:ldc1            #130 <String "data_result_receiver">
		//  153  368:invokevirtual   #134 <Method android.os.Parcelable Bundle.getParcelable(String)>
		//  154  371:checkcast       #136 <Class ResultReceiver>
		//  155  374:new             #93  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//  156  377:dup             
		//  157  378:aload_1         
		//  158  379:getfield        #97  <Field Messenger Message.replyTo>
		//  159  382:invokespecial   #100 <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(Messenger)>
		//  160  385:invokevirtual   #162 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.sendCustomAction(String, Bundle, ResultReceiver, MediaBrowserServiceCompat$ServiceCallbacks)>
				break;
			}
		//  161  388:return          
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
		//    8   18:ldc1            #81  <String "data_calling_uid">
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
	//    1    1:invokespecial   #142 <Method void Service()>
	//    2    4:aload_0         
	//    3    5:new             #144 <Class ArrayMap>
	//    4    8:dup             
	//    5    9:invokespecial   #145 <Method void ArrayMap()>
	//    6   12:putfield        #147 <Field ArrayMap mConnections>
	//    7   15:aload_0         
	//    8   16:new             #82  <Class MediaBrowserServiceCompat$ServiceHandler>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #150 <Method void MediaBrowserServiceCompat$ServiceHandler(MediaBrowserServiceCompat)>
	//   12   24:putfield        #152 <Field MediaBrowserServiceCompat$ServiceHandler mHandler>
	//   13   27:return          
	}

	void addSubscription(String s, ConnectionRecord connectionrecord, IBinder ibinder, Bundle bundle)
	{
		List list = (List)connectionrecord.subscriptions.get(((Object) (s)));
	//    0    0:aload_2         
	//    1    1:getfield        #158 <Field HashMap MediaBrowserServiceCompat$ConnectionRecord.subscriptions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #164 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #166 <Class List>
	//    5   11:astore          6
		Object obj = ((Object) (list));
	//    6   13:aload           6
	//    7   15:astore          5
		if(list == null)
	//*   8   17:aload           6
	//*   9   19:ifnonnull       31
			obj = ((Object) (new ArrayList()));
	//   10   22:new             #168 <Class ArrayList>
	//   11   25:dup             
	//   12   26:invokespecial   #169 <Method void ArrayList()>
	//   13   29:astore          5
		for(Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext();)
	//*  14   31:aload           5
	//*  15   33:invokeinterface #173 <Method Iterator List.iterator()>
	//*  16   38:astore          6
	//*  17   40:aload           6
	//*  18   42:invokeinterface #179 <Method boolean Iterator.hasNext()>
	//*  19   47:ifeq            88
		{
			Pair pair = (Pair)iterator.next();
	//   20   50:aload           6
	//   21   52:invokeinterface #183 <Method Object Iterator.next()>
	//   22   57:checkcast       #185 <Class Pair>
	//   23   60:astore          7
			if(ibinder == pair.first && MediaBrowserCompatUtils.areSameOptions(bundle, (Bundle)pair.second))
	//*  24   62:aload_3         
	//*  25   63:aload           7
	//*  26   65:getfield        #189 <Field Object Pair.first>
	//*  27   68:if_acmpne       40
	//*  28   71:aload           4
	//*  29   73:aload           7
	//*  30   75:getfield        #192 <Field Object Pair.second>
	//*  31   78:checkcast       #194 <Class Bundle>
	//*  32   81:invokestatic    #200 <Method boolean MediaBrowserCompatUtils.areSameOptions(Bundle, Bundle)>
	//*  33   84:ifeq            40
				return;
	//   34   87:return          
		}

		((List) (obj)).add(((Object) (new Pair(((Object) (ibinder)), ((Object) (bundle))))));
	//   35   88:aload           5
	//   36   90:new             #185 <Class Pair>
	//   37   93:dup             
	//   38   94:aload_3         
	//   39   95:aload           4
	//   40   97:invokespecial   #203 <Method void Pair(Object, Object)>
	//   41  100:invokeinterface #207 <Method boolean List.add(Object)>
	//   42  105:pop             
		connectionrecord.subscriptions.put(((Object) (s)), obj);
	//   43  106:aload_2         
	//   44  107:getfield        #158 <Field HashMap MediaBrowserServiceCompat$ConnectionRecord.subscriptions>
	//   45  110:aload_1         
	//   46  111:aload           5
	//   47  113:invokevirtual   #211 <Method Object HashMap.put(Object, Object)>
	//   48  116:pop             
		performLoadChildren(s, connectionrecord, bundle);
	//   49  117:aload_0         
	//   50  118:aload_1         
	//   51  119:aload_2         
	//   52  120:aload           4
	//   53  122:invokevirtual   #215 <Method void performLoadChildren(String, MediaBrowserServiceCompat$ConnectionRecord, Bundle)>
	//   54  125:return          
	}

	List applyOptions(List list, Bundle bundle)
	{
		if(list != null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnonnull       8
_L1:
		bundle = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
_L4:
		return ((List) (bundle));
	//    4    6:aload_2         
	//    5    7:areturn         
_L2:
		int i;
		int l;
		i = bundle.getInt("android.media.browse.extra.PAGE", -1);
	//    6    8:aload_2         
	//    7    9:ldc1            #219 <String "android.media.browse.extra.PAGE">
	//    8   11:iconst_m1       
	//    9   12:invokevirtual   #223 <Method int Bundle.getInt(String, int)>
	//   10   15:istore_3        
		l = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
	//   11   16:aload_2         
	//   12   17:ldc1            #225 <String "android.media.browse.extra.PAGE_SIZE">
	//   13   19:iconst_m1       
	//   14   20:invokevirtual   #223 <Method int Bundle.getInt(String, int)>
	//   15   23:istore          6
		if(i != -1)
			break; /* Loop/switch isn't completed */
	//   16   25:iload_3         
	//   17   26:iconst_m1       
	//   18   27:icmpne          38
		bundle = ((Bundle) (list));
	//   19   30:aload_1         
	//   20   31:astore_2        
		if(l == -1) goto _L4; else goto _L3
	//   21   32:iload           6
	//   22   34:iconst_m1       
	//   23   35:icmpeq          6
_L3:
		int k = l * i;
	//   24   38:iload           6
	//   25   40:iload_3         
	//   26   41:imul            
	//   27   42:istore          5
		int j = k + l;
	//   28   44:iload           5
	//   29   46:iload           6
	//   30   48:iadd            
	//   31   49:istore          4
		if(i < 0 || l < 1 || k >= list.size())
	//*  32   51:iload_3         
	//*  33   52:iflt            72
	//*  34   55:iload           6
	//*  35   57:iconst_1        
	//*  36   58:icmplt          72
	//*  37   61:iload           5
	//*  38   63:aload_1         
	//*  39   64:invokeinterface #229 <Method int List.size()>
	//*  40   69:icmplt          76
			return Collections.EMPTY_LIST;
	//   41   72:getstatic       #235 <Field List Collections.EMPTY_LIST>
	//   42   75:areturn         
		i = j;
	//   43   76:iload           4
	//   44   78:istore_3        
		if(j > list.size())
	//*  45   79:iload           4
	//*  46   81:aload_1         
	//*  47   82:invokeinterface #229 <Method int List.size()>
	//*  48   87:icmple          97
			i = list.size();
	//   49   90:aload_1         
	//   50   91:invokeinterface #229 <Method int List.size()>
	//   51   96:istore_3        
		return list.subList(k, i);
	//   52   97:aload_1         
	//   53   98:iload           5
	//   54  100:iload_3         
	//   55  101:invokeinterface #239 <Method List List.subList(int, int)>
	//   56  106:areturn         
	}

	public void dump(FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
	//    0    0:return          
	}

	public final Bundle getBrowserRootHints()
	{
		return mImpl.getBrowserRootHints();
	//    0    0:aload_0         
	//    1    1:getfield        #247 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
	//    2    4:invokeinterface #249 <Method Bundle MediaBrowserServiceCompat$MediaBrowserServiceImpl.getBrowserRootHints()>
	//    3    9:areturn         
	}

	public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken()
	{
		return mSession;
	//    0    0:aload_0         
	//    1    1:getfield        #254 <Field android.support.v4.media.session.MediaSessionCompat$Token mSession>
	//    2    4:areturn         
	}

	boolean isValidPackage(String s, int i)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
	//*   2    4:iconst_0        
	//*   3    5:ireturn         
		{
			String as[] = getPackageManager().getPackagesForUid(i);
	//    4    6:aload_0         
	//    5    7:invokevirtual   #260 <Method PackageManager getPackageManager()>
	//    6   10:iload_2         
	//    7   11:invokevirtual   #266 <Method String[] PackageManager.getPackagesForUid(int)>
	//    8   14:astore          4
			int j = as.length;
	//    9   16:aload           4
	//   10   18:arraylength     
	//   11   19:istore_3        
			i = 0;
	//   12   20:iconst_0        
	//   13   21:istore_2        
			while(i < j) 
	//*  14   22:iload_2         
	//*  15   23:iload_3         
	//*  16   24:icmpge          4
			{
				if(as[i].equals(((Object) (s))))
	//*  17   27:aload           4
	//*  18   29:iload_2         
	//*  19   30:aaload          
	//*  20   31:aload_1         
	//*  21   32:invokevirtual   #271 <Method boolean String.equals(Object)>
	//*  22   35:ifeq            40
					return true;
	//   23   38:iconst_1        
	//   24   39:ireturn         
				i++;
	//   25   40:iload_2         
	//   26   41:iconst_1        
	//   27   42:iadd            
	//   28   43:istore_2        
			}
		}
		return false;
	//*  29   44:goto            22
	}

	public void notifyChildrenChanged(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
	//    2    4:new             #276 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #278 <String "parentId cannot be null in notifyChildrenChanged">
	//    5   11:invokespecial   #280 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		} else
		{
			mImpl.notifyChildrenChanged(s, ((Bundle) (null)));
	//    7   15:aload_0         
	//    8   16:getfield        #247 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
	//    9   19:aload_1         
	//   10   20:aconst_null     
	//   11   21:invokeinterface #283 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImpl.notifyChildrenChanged(String, Bundle)>
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
	//    2    4:new             #276 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #278 <String "parentId cannot be null in notifyChildrenChanged">
	//    5   11:invokespecial   #280 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(bundle == null)
	//*   7   15:aload_2         
	//*   8   16:ifnonnull       30
		{
			throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
	//    9   19:new             #276 <Class IllegalArgumentException>
	//   10   22:dup             
	//   11   23:ldc2            #286 <String "options cannot be null in notifyChildrenChanged">
	//   12   26:invokespecial   #280 <Method void IllegalArgumentException(String)>
	//   13   29:athrow          
		} else
		{
			mImpl.notifyChildrenChanged(s, bundle);
	//   14   30:aload_0         
	//   15   31:getfield        #247 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
	//   16   34:aload_1         
	//   17   35:aload_2         
	//   18   36:invokeinterface #283 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImpl.notifyChildrenChanged(String, Bundle)>
			return;
	//   19   41:return          
		}
	}

	public IBinder onBind(Intent intent)
	{
		return mImpl.onBind(intent);
	//    0    0:aload_0         
	//    1    1:getfield        #247 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #290 <Method IBinder MediaBrowserServiceCompat$MediaBrowserServiceImpl.onBind(Intent)>
	//    4   10:areturn         
	}

	public void onCreate()
	{
		super.onCreate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #293 <Method void Service.onCreate()>
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   2    4:getstatic       #298 <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          26
	//*   4    9:icmplt          34
			mImpl = ((MediaBrowserServiceImpl) (new MediaBrowserServiceImplApi24()));
	//    5   12:aload_0         
	//    6   13:new             #37  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplApi24>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokespecial   #299 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi24(MediaBrowserServiceCompat)>
	//   10   21:putfield        #247 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
		else
	//*  11   24:aload_0         
	//*  12   25:getfield        #247 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
	//*  13   28:invokeinterface #300 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImpl.onCreate()>
	//*  14   33:return          
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  15   34:getstatic       #298 <Field int android.os.Build$VERSION.SDK_INT>
	//*  16   37:bipush          23
	//*  17   39:icmplt          57
			mImpl = ((MediaBrowserServiceImpl) (new MediaBrowserServiceImplApi23()));
	//   18   42:aload_0         
	//   19   43:new             #32  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplApi23>
	//   20   46:dup             
	//   21   47:aload_0         
	//   22   48:invokespecial   #301 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi23(MediaBrowserServiceCompat)>
	//   23   51:putfield        #247 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
		else
	//*  24   54:goto            24
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  25   57:getstatic       #298 <Field int android.os.Build$VERSION.SDK_INT>
	//*  26   60:bipush          21
	//*  27   62:icmplt          80
			mImpl = ((MediaBrowserServiceImpl) (new MediaBrowserServiceImplApi21()));
	//   28   65:aload_0         
	//   29   66:new             #23  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21>
	//   30   69:dup             
	//   31   70:aload_0         
	//   32   71:invokespecial   #302 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi21(MediaBrowserServiceCompat)>
	//   33   74:putfield        #247 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
		else
	//*  34   77:goto            24
			mImpl = ((MediaBrowserServiceImpl) (new MediaBrowserServiceImplBase()));
	//   35   80:aload_0         
	//   36   81:new             #42  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplBase>
	//   37   84:dup             
	//   38   85:aload_0         
	//   39   86:invokespecial   #303 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplBase(MediaBrowserServiceCompat)>
	//   40   89:putfield        #247 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
		mImpl.onCreate();
	//*  41   92:goto            24
	}

	public void onCustomAction(String s, Bundle bundle, Result result)
	{
		result.sendError(((Bundle) (null)));
	//    0    0:aload_3         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #309 <Method void MediaBrowserServiceCompat$Result.sendError(Bundle)>
	//    3    5:return          
	}

	public abstract BrowserRoot onGetRoot(String s, int i, Bundle bundle);

	public abstract void onLoadChildren(String s, Result result);

	public void onLoadChildren(String s, Result result, Bundle bundle)
	{
		result.setFlags(1);
	//    0    0:aload_2         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #319 <Method void MediaBrowserServiceCompat$Result.setFlags(int)>
		onLoadChildren(s, result);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #321 <Method void onLoadChildren(String, MediaBrowserServiceCompat$Result)>
	//    7   11:return          
	}

	public void onLoadItem(String s, Result result)
	{
		result.setFlags(2);
	//    0    0:aload_2         
	//    1    1:iconst_2        
	//    2    2:invokevirtual   #319 <Method void MediaBrowserServiceCompat$Result.setFlags(int)>
		result.sendResult(((Object) (null)));
	//    3    5:aload_2         
	//    4    6:aconst_null     
	//    5    7:invokevirtual   #327 <Method void MediaBrowserServiceCompat$Result.sendResult(Object)>
	//    6   10:return          
	}

	public void onSearch(String s, Bundle bundle, Result result)
	{
		result.setFlags(4);
	//    0    0:aload_3         
	//    1    1:iconst_4        
	//    2    2:invokevirtual   #319 <Method void MediaBrowserServiceCompat$Result.setFlags(int)>
		result.sendResult(((Object) (null)));
	//    3    5:aload_3         
	//    4    6:aconst_null     
	//    5    7:invokevirtual   #327 <Method void MediaBrowserServiceCompat$Result.sendResult(Object)>
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
	//    5    8:invokespecial   #335 <Method void MediaBrowserServiceCompat$4(MediaBrowserServiceCompat, Object, ResultReceiver)>
	//    6   11:astore          4
		mCurConnection = connectionrecord;
	//    7   13:aload_0         
	//    8   14:aload_3         
	//    9   15:putfield        #337 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		onCustomAction(final_obj, bundle, ((Result) (resultreceiver)));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:aload           4
	//   14   23:invokevirtual   #339 <Method void onCustomAction(String, Bundle, MediaBrowserServiceCompat$Result)>
		mCurConnection = null;
	//   15   26:aload_0         
	//   16   27:aconst_null     
	//   17   28:putfield        #337 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		if(!((Result) (resultreceiver)).isDone())
	//*  18   31:aload           4
	//*  19   33:invokevirtual   #342 <Method boolean MediaBrowserServiceCompat$Result.isDone()>
	//*  20   36:ifne            77
			throw new IllegalStateException((new StringBuilder()).append("onCustomAction must call detach() or sendResult() or sendError() before returning for action=").append(final_obj).append(" extras=").append(((Object) (bundle))).toString());
	//   21   39:new             #344 <Class IllegalStateException>
	//   22   42:dup             
	//   23   43:new             #346 <Class StringBuilder>
	//   24   46:dup             
	//   25   47:invokespecial   #347 <Method void StringBuilder()>
	//   26   50:ldc2            #349 <String "onCustomAction must call detach() or sendResult() or sendError() before returning for action=">
	//   27   53:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   28   56:aload_1         
	//   29   57:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   30   60:ldc2            #355 <String " extras=">
	//   31   63:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   32   66:aload_2         
	//   33   67:invokevirtual   #358 <Method StringBuilder StringBuilder.append(Object)>
	//   34   70:invokevirtual   #362 <Method String StringBuilder.toString()>
	//   35   73:invokespecial   #363 <Method void IllegalStateException(String)>
	//   36   76:athrow          
		else
			return;
	//   37   77:return          
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
			//*  10   26:if_acmpeq       79
				{
					if(MediaBrowserServiceCompat.DEBUG)
			//*  11   29:getstatic       #66  <Field boolean MediaBrowserServiceCompat.DEBUG>
			//*  12   32:ifeq            78
						Log.d("MBServiceCompat", (new StringBuilder()).append("Not sending onLoadChildren result for connection that has been disconnected. pkg=").append(connection.pkg).append(" id=").append(parentId).toString());
			//   13   35:ldc1            #68  <String "MBServiceCompat">
			//   14   37:new             #70  <Class StringBuilder>
			//   15   40:dup             
			//   16   41:invokespecial   #73  <Method void StringBuilder()>
			//   17   44:ldc1            #75  <String "Not sending onLoadChildren result for connection that has been disconnected. pkg=">
			//   18   46:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
			//   19   49:aload_0         
			//   20   50:getfield        #24  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
			//   21   53:getfield        #82  <Field String MediaBrowserServiceCompat$ConnectionRecord.pkg>
			//   22   56:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
			//   23   59:ldc1            #84  <String " id=">
			//   24   61:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
			//   25   64:aload_0         
			//   26   65:getfield        #26  <Field String val$parentId>
			//   27   68:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
			//   28   71:invokevirtual   #88  <Method String StringBuilder.toString()>
			//   29   74:invokestatic    #94  <Method int Log.d(String, String)>
			//   30   77:pop             
					return;
			//   31   78:return          
				}
				if((getFlags() & 1) != 0)
			//*  32   79:aload_0         
			//*  33   80:invokevirtual   #98  <Method int getFlags()>
			//*  34   83:iconst_1        
			//*  35   84:iand            
			//*  36   85:ifeq            168
					list = applyOptions(list, options);
			//   37   88:aload_0         
			//   38   89:getfield        #22  <Field MediaBrowserServiceCompat this$0>
			//   39   92:aload_1         
			//   40   93:aload_0         
			//   41   94:getfield        #28  <Field Bundle val$options>
			//   42   97:invokevirtual   #102 <Method List MediaBrowserServiceCompat.applyOptions(List, Bundle)>
			//   43  100:astore_1        
				try
				{
					connection.callbacks.onLoadChildren(parentId, list, options);
			//   44  101:aload_0         
			//   45  102:getfield        #24  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
			//   46  105:getfield        #50  <Field MediaBrowserServiceCompat$ServiceCallbacks MediaBrowserServiceCompat$ConnectionRecord.callbacks>
			//   47  108:aload_0         
			//   48  109:getfield        #26  <Field String val$parentId>
			//   49  112:aload_1         
			//   50  113:aload_0         
			//   51  114:getfield        #28  <Field Bundle val$options>
			//   52  117:invokeinterface #106 <Method void MediaBrowserServiceCompat$ServiceCallbacks.onLoadChildren(String, List, Bundle)>
					return;
			//   53  122:return          
				}
				// Misplaced declaration of an exception variable
				catch(List list)
			//*  54  123:astore_1        
				{
					Log.w("MBServiceCompat", (new StringBuilder()).append("Calling onLoadChildren() failed for id=").append(parentId).append(" package=").append(connection.pkg).toString());
			//   55  124:ldc1            #68  <String "MBServiceCompat">
			//   56  126:new             #70  <Class StringBuilder>
			//   57  129:dup             
			//   58  130:invokespecial   #73  <Method void StringBuilder()>
			//   59  133:ldc1            #108 <String "Calling onLoadChildren() failed for id=">
			//   60  135:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
			//   61  138:aload_0         
			//   62  139:getfield        #26  <Field String val$parentId>
			//   63  142:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
			//   64  145:ldc1            #110 <String " package=">
			//   65  147:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
			//   66  150:aload_0         
			//   67  151:getfield        #24  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
			//   68  154:getfield        #82  <Field String MediaBrowserServiceCompat$ConnectionRecord.pkg>
			//   69  157:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
			//   70  160:invokevirtual   #88  <Method String StringBuilder.toString()>
			//   71  163:invokestatic    #113 <Method int Log.w(String, String)>
			//   72  166:pop             
				}
			//   73  167:return          
			//*  74  168:goto            101
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
	//    7    9:invokespecial   #366 <Method void MediaBrowserServiceCompat$1(MediaBrowserServiceCompat, Object, MediaBrowserServiceCompat$ConnectionRecord, String, Bundle)>
	//    8   12:astore          4
		mCurConnection = connection;
	//    9   14:aload_0         
	//   10   15:aload_2         
	//   11   16:putfield        #337 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		if(bundle == null)
	//*  12   19:aload_3         
	//*  13   20:ifnonnull       84
			onLoadChildren(final_obj, ((Result) (result)));
	//   14   23:aload_0         
	//   15   24:aload_1         
	//   16   25:aload           4
	//   17   27:invokevirtual   #321 <Method void onLoadChildren(String, MediaBrowserServiceCompat$Result)>
		else
	//*  18   30:aload_0         
	//*  19   31:aconst_null     
	//*  20   32:putfield        #337 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
	//*  21   35:aload           4
	//*  22   37:invokevirtual   #342 <Method boolean MediaBrowserServiceCompat$Result.isDone()>
	//*  23   40:ifne            95
	//*  24   43:new             #344 <Class IllegalStateException>
	//*  25   46:dup             
	//*  26   47:new             #346 <Class StringBuilder>
	//*  27   50:dup             
	//*  28   51:invokespecial   #347 <Method void StringBuilder()>
	//*  29   54:ldc2            #368 <String "onLoadChildren must call detach() or sendResult() before returning for package=">
	//*  30   57:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//*  31   60:aload_2         
	//*  32   61:getfield        #371 <Field String MediaBrowserServiceCompat$ConnectionRecord.pkg>
	//*  33   64:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//*  34   67:ldc2            #373 <String " id=">
	//*  35   70:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//*  36   73:aload_1         
	//*  37   74:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//*  38   77:invokevirtual   #362 <Method String StringBuilder.toString()>
	//*  39   80:invokespecial   #363 <Method void IllegalStateException(String)>
	//*  40   83:athrow          
			onLoadChildren(final_obj, ((Result) (result)), bundle);
	//   41   84:aload_0         
	//   42   85:aload_1         
	//   43   86:aload           4
	//   44   88:aload_3         
	//   45   89:invokevirtual   #375 <Method void onLoadChildren(String, MediaBrowserServiceCompat$Result, Bundle)>
		mCurConnection = null;
		if(!((Result) (result)).isDone())
			throw new IllegalStateException((new StringBuilder()).append("onLoadChildren must call detach() or sendResult() before returning for package=").append(connection.pkg).append(" id=").append(final_obj).toString());
		else
	//*  46   92:goto            30
			return;
	//   47   95:return          
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
	//    5    7:invokespecial   #378 <Method void MediaBrowserServiceCompat$2(MediaBrowserServiceCompat, Object, ResultReceiver)>
	//    6   10:astore_3        
		mCurConnection = connectionrecord;
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:putfield        #337 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		onLoadItem(final_obj, ((Result) (resultreceiver)));
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:aload_3         
	//   13   19:invokevirtual   #380 <Method void onLoadItem(String, MediaBrowserServiceCompat$Result)>
		mCurConnection = null;
	//   14   22:aload_0         
	//   15   23:aconst_null     
	//   16   24:putfield        #337 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		if(!((Result) (resultreceiver)).isDone())
	//*  17   27:aload_3         
	//*  18   28:invokevirtual   #342 <Method boolean MediaBrowserServiceCompat$Result.isDone()>
	//*  19   31:ifne            62
			throw new IllegalStateException((new StringBuilder()).append("onLoadItem must call detach() or sendResult() before returning for id=").append(final_obj).toString());
	//   20   34:new             #344 <Class IllegalStateException>
	//   21   37:dup             
	//   22   38:new             #346 <Class StringBuilder>
	//   23   41:dup             
	//   24   42:invokespecial   #347 <Method void StringBuilder()>
	//   25   45:ldc2            #382 <String "onLoadItem must call detach() or sendResult() before returning for id=">
	//   26   48:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   27   51:aload_1         
	//   28   52:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   29   55:invokevirtual   #362 <Method String StringBuilder.toString()>
	//   30   58:invokespecial   #363 <Method void IllegalStateException(String)>
	//   31   61:athrow          
		else
			return;
	//   32   62:return          
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
				if((getFlags() & 4) != 0 || list == null)
			//*   0    0:aload_0         
			//*   1    1:invokevirtual   #34  <Method int getFlags()>
			//*   2    4:iconst_4        
			//*   3    5:iand            
			//*   4    6:ifne            13
			//*   5    9:aload_1         
			//*   6   10:ifnonnull       23
				{
					receiver.send(-1, ((Bundle) (null)));
			//    7   13:aload_0         
			//    8   14:getfield        #20  <Field ResultReceiver val$receiver>
			//    9   17:iconst_m1       
			//   10   18:aconst_null     
			//   11   19:invokevirtual   #40  <Method void ResultReceiver.send(int, Bundle)>
					return;
			//   12   22:return          
				} else
				{
					Bundle bundle1 = new Bundle();
			//   13   23:new             #42  <Class Bundle>
			//   14   26:dup             
			//   15   27:invokespecial   #45  <Method void Bundle()>
			//   16   30:astore_2        
					bundle1.putParcelableArray("search_results", (android.os.Parcelable[])list.toArray(((Object []) (new MediaBrowserCompat.MediaItem[0]))));
			//   17   31:aload_2         
			//   18   32:ldc1            #47  <String "search_results">
			//   19   34:aload_1         
			//   20   35:iconst_0        
			//   21   36:anewarray       MediaBrowserCompat.MediaItem[]
			//   22   39:invokeinterface #53  <Method Object[] List.toArray(Object[])>
			//   23   44:checkcast       #55  <Class android.os.Parcelable[]>
			//   24   47:invokevirtual   #59  <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
					receiver.send(0, bundle1);
			//   25   50:aload_0         
			//   26   51:getfield        #20  <Field ResultReceiver val$receiver>
			//   27   54:iconst_0        
			//   28   55:aload_2         
			//   29   56:invokevirtual   #40  <Method void ResultReceiver.send(int, Bundle)>
					return;
			//   30   59:return          
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
	//    5    8:invokespecial   #384 <Method void MediaBrowserServiceCompat$3(MediaBrowserServiceCompat, Object, ResultReceiver)>
	//    6   11:astore          4
		mCurConnection = connectionrecord;
	//    7   13:aload_0         
	//    8   14:aload_3         
	//    9   15:putfield        #337 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		onSearch(final_obj, bundle, ((Result) (resultreceiver)));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:aload           4
	//   14   23:invokevirtual   #386 <Method void onSearch(String, Bundle, MediaBrowserServiceCompat$Result)>
		mCurConnection = null;
	//   15   26:aload_0         
	//   16   27:aconst_null     
	//   17   28:putfield        #337 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		if(!((Result) (resultreceiver)).isDone())
	//*  18   31:aload           4
	//*  19   33:invokevirtual   #342 <Method boolean MediaBrowserServiceCompat$Result.isDone()>
	//*  20   36:ifne            67
			throw new IllegalStateException((new StringBuilder()).append("onSearch must call detach() or sendResult() before returning for query=").append(final_obj).toString());
	//   21   39:new             #344 <Class IllegalStateException>
	//   22   42:dup             
	//   23   43:new             #346 <Class StringBuilder>
	//   24   46:dup             
	//   25   47:invokespecial   #347 <Method void StringBuilder()>
	//   26   50:ldc2            #388 <String "onSearch must call detach() or sendResult() before returning for query=">
	//   27   53:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   28   56:aload_1         
	//   29   57:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   30   60:invokevirtual   #362 <Method String StringBuilder.toString()>
	//   31   63:invokespecial   #363 <Method void IllegalStateException(String)>
	//   32   66:athrow          
		else
			return;
	//   33   67:return          
	}

	boolean removeSubscription(String s, ConnectionRecord connectionrecord, IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       19
			return connectionrecord.subscriptions.remove(((Object) (s))) != null;
	//    2    4:aload_2         
	//    3    5:getfield        #158 <Field HashMap MediaBrowserServiceCompat$ConnectionRecord.subscriptions>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #393 <Method Object HashMap.remove(Object)>
	//    6   12:ifnull          17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
		boolean flag1 = false;
	//   11   19:iconst_0        
	//   12   20:istore          5
		boolean flag = false;
	//   13   22:iconst_0        
	//   14   23:istore          4
		List list = (List)connectionrecord.subscriptions.get(((Object) (s)));
	//   15   25:aload_2         
	//   16   26:getfield        #158 <Field HashMap MediaBrowserServiceCompat$ConnectionRecord.subscriptions>
	//   17   29:aload_1         
	//   18   30:invokevirtual   #164 <Method Object HashMap.get(Object)>
	//   19   33:checkcast       #166 <Class List>
	//   20   36:astore          6
		if(list != null)
	//*  21   38:aload           6
	//*  22   40:ifnull          119
		{
			Iterator iterator = list.iterator();
	//   23   43:aload           6
	//   24   45:invokeinterface #173 <Method Iterator List.iterator()>
	//   25   50:astore          7
			do
			{
				if(!iterator.hasNext())
					break;
	//   26   52:aload           7
	//   27   54:invokeinterface #179 <Method boolean Iterator.hasNext()>
	//   28   59:ifeq            92
				if(ibinder == ((Pair)iterator.next()).first)
	//*  29   62:aload_3         
	//*  30   63:aload           7
	//*  31   65:invokeinterface #183 <Method Object Iterator.next()>
	//*  32   70:checkcast       #185 <Class Pair>
	//*  33   73:getfield        #189 <Field Object Pair.first>
	//*  34   76:if_acmpne       52
				{
					flag = true;
	//   35   79:iconst_1        
	//   36   80:istore          4
					iterator.remove();
	//   37   82:aload           7
	//   38   84:invokeinterface #395 <Method void Iterator.remove()>
				}
			} while(true);
	//   39   89:goto            52
			flag1 = flag;
	//   40   92:iload           4
	//   41   94:istore          5
			if(list.size() == 0)
	//*  42   96:aload           6
	//*  43   98:invokeinterface #229 <Method int List.size()>
	//*  44  103:ifne            119
			{
				connectionrecord.subscriptions.remove(((Object) (s)));
	//   45  106:aload_2         
	//   46  107:getfield        #158 <Field HashMap MediaBrowserServiceCompat$ConnectionRecord.subscriptions>
	//   47  110:aload_1         
	//   48  111:invokevirtual   #393 <Method Object HashMap.remove(Object)>
	//   49  114:pop             
				flag1 = flag;
	//   50  115:iload           4
	//   51  117:istore          5
			}
		}
		return flag1;
	//   52  119:iload           5
	//   53  121:ireturn         
	}

	public void setSessionToken(android.support.v4.media.session.MediaSessionCompat.Token token)
	{
		if(token == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("Session token may not be null.");
	//    2    4:new             #276 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #399 <String "Session token may not be null.">
	//    5   11:invokespecial   #280 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(mSession != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #254 <Field android.support.v4.media.session.MediaSessionCompat$Token mSession>
	//*   9   19:ifnull          33
		{
			throw new IllegalStateException("The session token has already been set.");
	//   10   22:new             #344 <Class IllegalStateException>
	//   11   25:dup             
	//   12   26:ldc2            #401 <String "The session token has already been set.">
	//   13   29:invokespecial   #363 <Method void IllegalStateException(String)>
	//   14   32:athrow          
		} else
		{
			mSession = token;
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:putfield        #254 <Field android.support.v4.media.session.MediaSessionCompat$Token mSession>
			mImpl.setSessionToken(token);
	//   18   38:aload_0         
	//   19   39:getfield        #247 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
	//   20   42:aload_1         
	//   21   43:invokeinterface #403 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImpl.setSessionToken(android.support.v4.media.session.MediaSessionCompat$Token)>
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
	//    0    0:ldc1            #117 <String "MBServiceCompat">
	//    1    2:iconst_3        
	//    2    3:invokestatic    #136 <Method boolean Log.isLoggable(String, int)>
	//    3    6:putstatic       #138 <Field boolean DEBUG>
	//*   4    9:return          
	}
}
