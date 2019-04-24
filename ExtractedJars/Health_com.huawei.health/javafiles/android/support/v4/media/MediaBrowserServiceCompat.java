// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.*;
import android.support.v4.app.BundleCompat;
import android.support.v4.os.BuildCompat;
import android.support.v4.os.ResultReceiver;
import android.support.v4.util.ArrayMap;
import android.support.v4.util.Pair;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
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

	class ConnectionRecord
	{

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
		//    2    2:putfield        #24  <Field MediaBrowserServiceCompat this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #27  <Method void Object()>
			subscriptions = new HashMap();
		//    5    9:aload_0         
		//    6   10:new             #29  <Class HashMap>
		//    7   13:dup             
		//    8   14:invokespecial   #30  <Method void HashMap()>
		//    9   17:putfield        #32  <Field HashMap subscriptions>
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
		//*   1    1:getfield        #33  <Field Messenger mMessenger>
		//*   2    4:ifnonnull       9
				return null;
		//    3    7:aconst_null     
		//    4    8:areturn         
			if(mCurConnection == null)
		//*   5    9:aload_0         
		//*   6   10:getfield        #25  <Field MediaBrowserServiceCompat this$0>
		//*   7   13:getfield        #37  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
		//*   8   16:ifnonnull       29
				throw new IllegalStateException("This should be called inside of onLoadChildren or onLoadItem methods");
		//    9   19:new             #39  <Class IllegalStateException>
		//   10   22:dup             
		//   11   23:ldc1            #41  <String "This should be called inside of onLoadChildren or onLoadItem methods">
		//   12   25:invokespecial   #44  <Method void IllegalStateException(String)>
		//   13   28:athrow          
			if(mCurConnection.rootHints == null)
		//*  14   29:aload_0         
		//*  15   30:getfield        #25  <Field MediaBrowserServiceCompat this$0>
		//*  16   33:getfield        #37  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
		//*  17   36:getfield        #50  <Field Bundle MediaBrowserServiceCompat$ConnectionRecord.rootHints>
		//*  18   39:ifnonnull       44
				return null;
		//   19   42:aconst_null     
		//   20   43:areturn         
			else
				return new Bundle(mCurConnection.rootHints);
		//   21   44:new             #52  <Class Bundle>
		//   22   47:dup             
		//   23   48:aload_0         
		//   24   49:getfield        #25  <Field MediaBrowserServiceCompat this$0>
		//   25   52:getfield        #37  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
		//   26   55:getfield        #50  <Field Bundle MediaBrowserServiceCompat$ConnectionRecord.rootHints>
		//   27   58:invokespecial   #55  <Method void Bundle(Bundle)>
		//   28   61:areturn         
		}

		public void notifyChildrenChanged(final String parentId, Bundle bundle)
		{
			if(mMessenger == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #33  <Field Messenger mMessenger>
		//*   2    4:ifnonnull       16
			{
				MediaBrowserServiceCompatApi21.notifyChildrenChanged(mServiceObj, parentId);
		//    3    7:aload_0         
		//    4    8:getfield        #59  <Field Object mServiceObj>
		//    5   11:aload_1         
		//    6   12:invokestatic    #64  <Method void MediaBrowserServiceCompatApi21.notifyChildrenChanged(Object, String)>
				return;
		//    7   15:return          
			} else
			{
				mHandler.post(((_cls1) (bundle)). new Runnable() {

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
					//*   9   25:ifeq            149
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
					//*  30   72:ifnull          146
							{
								obj1 = ((Object) (((List) (obj1)).iterator()));
					//   31   75:aload_3         
					//   32   76:invokeinterface #81  <Method Iterator List.iterator()>
					//   33   81:astore_3        
								while(((Iterator) (obj1)).hasNext()) 
					//*  34   82:aload_3         
					//*  35   83:invokeinterface #59  <Method boolean Iterator.hasNext()>
					//*  36   88:ifeq            146
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
					//*  47  117:ifeq            143
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
					//*  59  146:goto            19
					//   60  149:return          
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
		//    9   17:getfield        #25  <Field MediaBrowserServiceCompat this$0>
		//   10   20:getfield        #68  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//   11   23:new             #13  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$1>
		//   12   26:dup             
		//   13   27:aload_0         
		//   14   28:aload_1         
		//   15   29:aload_2         
		//   16   30:invokespecial   #71  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$1(MediaBrowserServiceCompat$MediaBrowserServiceImplApi21, String, Bundle)>
		//   17   33:invokevirtual   #77  <Method boolean MediaBrowserServiceCompat$ServiceHandler.post(Runnable)>
		//   18   36:pop             
				return;
		//   19   37:return          
			}
		}

		public IBinder onBind(Intent intent)
		{
			return MediaBrowserServiceCompatApi21.onBind(mServiceObj, intent);
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field Object mServiceObj>
		//    2    4:aload_1         
		//    3    5:invokestatic    #82  <Method IBinder MediaBrowserServiceCompatApi21.onBind(Object, Intent)>
		//    4    8:areturn         
		}

		public void onCreate()
		{
			mServiceObj = MediaBrowserServiceCompatApi21.createService(((android.content.Context) (MediaBrowserServiceCompat.this)), ((MediaBrowserServiceCompatApi21.ServiceCompatProxy) (this)));
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #25  <Field MediaBrowserServiceCompat this$0>
		//    3    5:aload_0         
		//    4    6:invokestatic    #87  <Method Object MediaBrowserServiceCompatApi21.createService(android.content.Context, MediaBrowserServiceCompatApi21$ServiceCompatProxy)>
		//    5    9:putfield        #59  <Field Object mServiceObj>
			MediaBrowserServiceCompatApi21.onCreate(mServiceObj);
		//    6   12:aload_0         
		//    7   13:getfield        #59  <Field Object mServiceObj>
		//    8   16:invokestatic    #90  <Method void MediaBrowserServiceCompatApi21.onCreate(Object)>
		//    9   19:return          
		}

		public MediaBrowserServiceCompatApi21.BrowserRoot onGetRoot(String s, int i, Bundle bundle)
		{
			Object obj = null;
		//    0    0:aconst_null     
		//    1    1:astore          5
			Bundle bundle1 = ((Bundle) (obj));
		//    2    3:aload           5
		//    3    5:astore          4
			if(bundle != null)
		//*   4    7:aload_3         
		//*   5    8:ifnull          80
			{
				bundle1 = ((Bundle) (obj));
		//    6   11:aload           5
		//    7   13:astore          4
				if(bundle.getInt("extra_client_version", 0) != 0)
		//*   8   15:aload_3         
		//*   9   16:ldc1            #94  <String "extra_client_version">
		//*  10   18:iconst_0        
		//*  11   19:invokevirtual   #98  <Method int Bundle.getInt(String, int)>
		//*  12   22:ifeq            80
				{
					bundle.remove("extra_client_version");
		//   13   25:aload_3         
		//   14   26:ldc1            #94  <String "extra_client_version">
		//   15   28:invokevirtual   #101 <Method void Bundle.remove(String)>
					mMessenger = new Messenger(((Handler) (mHandler)));
		//   16   31:aload_0         
		//   17   32:new             #103 <Class Messenger>
		//   18   35:dup             
		//   19   36:aload_0         
		//   20   37:getfield        #25  <Field MediaBrowserServiceCompat this$0>
		//   21   40:getfield        #68  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//   22   43:invokespecial   #106 <Method void Messenger(Handler)>
		//   23   46:putfield        #33  <Field Messenger mMessenger>
					bundle1 = new Bundle();
		//   24   49:new             #52  <Class Bundle>
		//   25   52:dup             
		//   26   53:invokespecial   #107 <Method void Bundle()>
		//   27   56:astore          4
					bundle1.putInt("extra_service_version", 1);
		//   28   58:aload           4
		//   29   60:ldc1            #109 <String "extra_service_version">
		//   30   62:iconst_1        
		//   31   63:invokevirtual   #113 <Method void Bundle.putInt(String, int)>
					BundleCompat.putBinder(bundle1, "extra_messenger", mMessenger.getBinder());
		//   32   66:aload           4
		//   33   68:ldc1            #115 <String "extra_messenger">
		//   34   70:aload_0         
		//   35   71:getfield        #33  <Field Messenger mMessenger>
		//   36   74:invokevirtual   #119 <Method IBinder Messenger.getBinder()>
		//   37   77:invokestatic    #125 <Method void BundleCompat.putBinder(Bundle, String, IBinder)>
				}
			}
			bundle = ((Bundle) (MediaBrowserServiceCompat.this.onGetRoot(s, i, bundle)));
		//   38   80:aload_0         
		//   39   81:getfield        #25  <Field MediaBrowserServiceCompat this$0>
		//   40   84:aload_1         
		//   41   85:iload_2         
		//   42   86:aload_3         
		//   43   87:invokevirtual   #128 <Method MediaBrowserServiceCompat$BrowserRoot MediaBrowserServiceCompat.onGetRoot(String, int, Bundle)>
		//   44   90:astore_3        
			if(bundle == null)
		//*  45   91:aload_3         
		//*  46   92:ifnonnull       97
				return null;
		//   47   95:aconst_null     
		//   48   96:areturn         
			if(bundle1 == null)
		//*  49   97:aload           4
		//*  50   99:ifnonnull       110
			{
				s = ((String) (((BrowserRoot) (bundle)).getExtras()));
		//   51  102:aload_3         
		//   52  103:invokevirtual   #133 <Method Bundle MediaBrowserServiceCompat$BrowserRoot.getExtras()>
		//   53  106:astore_1        
			} else
		//*  54  107:goto            132
			{
				s = ((String) (bundle1));
		//   55  110:aload           4
		//   56  112:astore_1        
				if(((BrowserRoot) (bundle)).getExtras() != null)
		//*  57  113:aload_3         
		//*  58  114:invokevirtual   #133 <Method Bundle MediaBrowserServiceCompat$BrowserRoot.getExtras()>
		//*  59  117:ifnull          132
				{
					bundle1.putAll(((BrowserRoot) (bundle)).getExtras());
		//   60  120:aload           4
		//   61  122:aload_3         
		//   62  123:invokevirtual   #133 <Method Bundle MediaBrowserServiceCompat$BrowserRoot.getExtras()>
		//   63  126:invokevirtual   #136 <Method void Bundle.putAll(Bundle)>
					s = ((String) (bundle1));
		//   64  129:aload           4
		//   65  131:astore_1        
				}
			}
			return new MediaBrowserServiceCompatApi21.BrowserRoot(((BrowserRoot) (bundle)).getRootId(), ((Bundle) (s)));
		//   66  132:new             #138 <Class MediaBrowserServiceCompatApi21$BrowserRoot>
		//   67  135:dup             
		//   68  136:aload_3         
		//   69  137:invokevirtual   #142 <Method String MediaBrowserServiceCompat$BrowserRoot.getRootId()>
		//   70  140:aload_1         
		//   71  141:invokespecial   #144 <Method void MediaBrowserServiceCompatApi21$BrowserRoot(String, Bundle)>
		//   72  144:areturn         
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

				volatile void onResultSent(Object obj, int i)
				{
					onResultSent((List)obj, i);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:checkcast       #37  <Class List>
				//    3    5:iload_2         
				//    4    6:invokevirtual   #40  <Method void onResultSent(List, int)>
				//    5    9:return          
				}

				void onResultSent(List list, int i)
				{
					Object obj = null;
				//    0    0:aconst_null     
				//    1    1:astore_3        
					if(list != null)
				//*   2    2:aload_1         
				//*   3    3:ifnull          69
					{
						ArrayList arraylist = new ArrayList();
				//    4    6:new             #42  <Class ArrayList>
				//    5    9:dup             
				//    6   10:invokespecial   #44  <Method void ArrayList()>
				//    7   13:astore          4
						list = ((List) (list.iterator()));
				//    8   15:aload_1         
				//    9   16:invokeinterface #48  <Method Iterator List.iterator()>
				//   10   21:astore_1        
						do
						{
							obj = ((Object) (arraylist));
				//   11   22:aload           4
				//   12   24:astore_3        
							if(!((Iterator) (list)).hasNext())
								break;
				//   13   25:aload_1         
				//   14   26:invokeinterface #54  <Method boolean Iterator.hasNext()>
				//   15   31:ifeq            69
							obj = ((Object) ((MediaBrowserCompat.MediaItem)((Iterator) (list)).next()));
				//   16   34:aload_1         
				//   17   35:invokeinterface #58  <Method Object Iterator.next()>
				//   18   40:checkcast       #60  <Class MediaBrowserCompat$MediaItem>
				//   19   43:astore_3        
							Parcel parcel = Parcel.obtain();
				//   20   44:invokestatic    #66  <Method Parcel Parcel.obtain()>
				//   21   47:astore          5
							((MediaBrowserCompat.MediaItem) (obj)).writeToParcel(parcel, 0);
				//   22   49:aload_3         
				//   23   50:aload           5
				//   24   52:iconst_0        
				//   25   53:invokevirtual   #70  <Method void MediaBrowserCompat$MediaItem.writeToParcel(Parcel, int)>
							((List) (arraylist)).add(((Object) (parcel)));
				//   26   56:aload           4
				//   27   58:aload           5
				//   28   60:invokeinterface #74  <Method boolean List.add(Object)>
				//   29   65:pop             
						} while(true);
				//   30   66:goto            22
					}
					resultWrapper.sendResult(obj);
				//   31   69:aload_0         
				//   32   70:getfield        #23  <Field MediaBrowserServiceCompatApi21$ResultWrapper val$resultWrapper>
				//   33   73:aload_3         
				//   34   74:invokevirtual   #77  <Method void MediaBrowserServiceCompatApi21$ResultWrapper.sendResult(Object)>
				//   35   77:return          
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
		//    5    7:invokespecial   #149 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$2(MediaBrowserServiceCompat$MediaBrowserServiceImplApi21, Object, MediaBrowserServiceCompatApi21$ResultWrapper)>
		//    6   10:astore_2        
			MediaBrowserServiceCompat.this.onLoadChildren(s, ((Result) (resultwrapper)));
		//    7   11:aload_0         
		//    8   12:getfield        #25  <Field MediaBrowserServiceCompat this$0>
		//    9   15:aload_1         
		//   10   16:aload_2         
		//   11   17:invokevirtual   #152 <Method void MediaBrowserServiceCompat.onLoadChildren(String, MediaBrowserServiceCompat$Result)>
		//   12   20:return          
		}

		public void setSessionToken(android.support.v4.media.session.MediaSessionCompat.Token token)
		{
			MediaBrowserServiceCompatApi21.setSessionToken(mServiceObj, token.getToken());
		//    0    0:aload_0         
		//    1    1:getfield        #59  <Field Object mServiceObj>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #162 <Method Object android.support.v4.media.session.MediaSessionCompat$Token.getToken()>
		//    4    8:invokestatic    #165 <Method void MediaBrowserServiceCompatApi21.setSessionToken(Object, Object)>
		//    5   11:return          
		}

		Messenger mMessenger;
		Object mServiceObj;
		final MediaBrowserServiceCompat this$0;

		MediaBrowserServiceImplApi21()
		{
			this$0 = MediaBrowserServiceCompat.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #25  <Field MediaBrowserServiceCompat this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #28  <Method void Object()>
		//    5    9:return          
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
		//    2    2:getfield        #17  <Field MediaBrowserServiceCompat this$0>
		//    3    5:aload_0         
		//    4    6:invokestatic    #28  <Method Object MediaBrowserServiceCompatApi23.createService(android.content.Context, MediaBrowserServiceCompatApi23$ServiceCompatProxy)>
		//    5    9:putfield        #32  <Field Object mServiceObj>
			MediaBrowserServiceCompatApi21.onCreate(mServiceObj);
		//    6   12:aload_0         
		//    7   13:getfield        #32  <Field Object mServiceObj>
		//    8   16:invokestatic    #37  <Method void MediaBrowserServiceCompatApi21.onCreate(Object)>
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

				void onResultSent(MediaBrowserCompat.MediaItem mediaitem, int i)
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
				//    8   16:astore_3        
						mediaitem.writeToParcel(parcel, 0);
				//    9   17:aload_1         
				//   10   18:aload_3         
				//   11   19:iconst_0        
				//   12   20:invokevirtual   #50  <Method void MediaBrowserCompat$MediaItem.writeToParcel(Parcel, int)>
						resultWrapper.sendResult(((Object) (parcel)));
				//   13   23:aload_0         
				//   14   24:getfield        #23  <Field MediaBrowserServiceCompatApi21$ResultWrapper val$resultWrapper>
				//   15   27:aload_3         
				//   16   28:invokevirtual   #38  <Method void MediaBrowserServiceCompatApi21$ResultWrapper.sendResult(Object)>
						return;
				//   17   31:return          
					}
				}

				volatile void onResultSent(Object obj, int i)
				{
					onResultSent((MediaBrowserCompat.MediaItem)obj, i);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:checkcast       #46  <Class MediaBrowserCompat$MediaItem>
				//    3    5:iload_2         
				//    4    6:invokevirtual   #53  <Method void onResultSent(MediaBrowserCompat$MediaItem, int)>
				//    5    9:return          
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
		//    5    7:invokespecial   #42  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi23$1(MediaBrowserServiceCompat$MediaBrowserServiceImplApi23, Object, MediaBrowserServiceCompatApi21$ResultWrapper)>
		//    6   10:astore_2        
			MediaBrowserServiceCompat.this.onLoadItem(s, ((Result) (resultwrapper)));
		//    7   11:aload_0         
		//    8   12:getfield        #17  <Field MediaBrowserServiceCompat this$0>
		//    9   15:aload_1         
		//   10   16:aload_2         
		//   11   17:invokevirtual   #45  <Method void MediaBrowserServiceCompat.onLoadItem(String, MediaBrowserServiceCompat$Result)>
		//   12   20:return          
		}

		final MediaBrowserServiceCompat this$0;

		MediaBrowserServiceImplApi23()
		{
			this$0 = MediaBrowserServiceCompat.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field MediaBrowserServiceCompat this$0>
			super();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #19  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi21(MediaBrowserServiceCompat)>
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
		//*   1    1:getfield        #17  <Field MediaBrowserServiceCompat this$0>
		//*   2    4:getfield        #26  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
		//*   3    7:ifnull          43
			{
				if(mCurConnection.rootHints == null)
		//*   4   10:aload_0         
		//*   5   11:getfield        #17  <Field MediaBrowserServiceCompat this$0>
		//*   6   14:getfield        #26  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
		//*   7   17:getfield        #32  <Field Bundle MediaBrowserServiceCompat$ConnectionRecord.rootHints>
		//*   8   20:ifnonnull       25
					return null;
		//    9   23:aconst_null     
		//   10   24:areturn         
				else
					return new Bundle(mCurConnection.rootHints);
		//   11   25:new             #34  <Class Bundle>
		//   12   28:dup             
		//   13   29:aload_0         
		//   14   30:getfield        #17  <Field MediaBrowserServiceCompat this$0>
		//   15   33:getfield        #26  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
		//   16   36:getfield        #32  <Field Bundle MediaBrowserServiceCompat$ConnectionRecord.rootHints>
		//   17   39:invokespecial   #37  <Method void Bundle(Bundle)>
		//   18   42:areturn         
			} else
			{
				return MediaBrowserServiceCompatApi24.getBrowserRootHints(mServiceObj);
		//   19   43:aload_0         
		//   20   44:getfield        #41  <Field Object mServiceObj>
		//   21   47:invokestatic    #46  <Method Bundle MediaBrowserServiceCompatApi24.getBrowserRootHints(Object)>
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
		//    3    5:getfield        #41  <Field Object mServiceObj>
		//    4    8:aload_1         
		//    5    9:invokestatic    #53  <Method void MediaBrowserServiceCompatApi21.notifyChildrenChanged(Object, String)>
				return;
		//    6   12:return          
			} else
			{
				MediaBrowserServiceCompatApi24.notifyChildrenChanged(mServiceObj, s, bundle);
		//    7   13:aload_0         
		//    8   14:getfield        #41  <Field Object mServiceObj>
		//    9   17:aload_1         
		//   10   18:aload_2         
		//   11   19:invokestatic    #56  <Method void MediaBrowserServiceCompatApi24.notifyChildrenChanged(Object, String, Bundle)>
				return;
		//   12   22:return          
			}
		}

		public void onCreate()
		{
			mServiceObj = MediaBrowserServiceCompatApi24.createService(((android.content.Context) (MediaBrowserServiceCompat.this)), ((MediaBrowserServiceCompatApi24.ServiceCompatProxy) (this)));
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #17  <Field MediaBrowserServiceCompat this$0>
		//    3    5:aload_0         
		//    4    6:invokestatic    #62  <Method Object MediaBrowserServiceCompatApi24.createService(android.content.Context, MediaBrowserServiceCompatApi24$ServiceCompatProxy)>
		//    5    9:putfield        #41  <Field Object mServiceObj>
			MediaBrowserServiceCompatApi21.onCreate(mServiceObj);
		//    6   12:aload_0         
		//    7   13:getfield        #41  <Field Object mServiceObj>
		//    8   16:invokestatic    #65  <Method void MediaBrowserServiceCompatApi21.onCreate(Object)>
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

				volatile void onResultSent(Object obj, int i)
				{
					onResultSent((List)obj, i);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:checkcast       #37  <Class List>
				//    3    5:iload_2         
				//    4    6:invokevirtual   #40  <Method void onResultSent(List, int)>
				//    5    9:return          
				}

				void onResultSent(List list, int i)
				{
					Object obj = null;
				//    0    0:aconst_null     
				//    1    1:astore_3        
					if(list != null)
				//*   2    2:aload_1         
				//*   3    3:ifnull          69
					{
						ArrayList arraylist = new ArrayList();
				//    4    6:new             #42  <Class ArrayList>
				//    5    9:dup             
				//    6   10:invokespecial   #44  <Method void ArrayList()>
				//    7   13:astore          4
						list = ((List) (list.iterator()));
				//    8   15:aload_1         
				//    9   16:invokeinterface #48  <Method Iterator List.iterator()>
				//   10   21:astore_1        
						do
						{
							obj = ((Object) (arraylist));
				//   11   22:aload           4
				//   12   24:astore_3        
							if(!((Iterator) (list)).hasNext())
								break;
				//   13   25:aload_1         
				//   14   26:invokeinterface #54  <Method boolean Iterator.hasNext()>
				//   15   31:ifeq            69
							obj = ((Object) ((MediaBrowserCompat.MediaItem)((Iterator) (list)).next()));
				//   16   34:aload_1         
				//   17   35:invokeinterface #58  <Method Object Iterator.next()>
				//   18   40:checkcast       #60  <Class MediaBrowserCompat$MediaItem>
				//   19   43:astore_3        
							Parcel parcel = Parcel.obtain();
				//   20   44:invokestatic    #66  <Method Parcel Parcel.obtain()>
				//   21   47:astore          5
							((MediaBrowserCompat.MediaItem) (obj)).writeToParcel(parcel, 0);
				//   22   49:aload_3         
				//   23   50:aload           5
				//   24   52:iconst_0        
				//   25   53:invokevirtual   #70  <Method void MediaBrowserCompat$MediaItem.writeToParcel(Parcel, int)>
							((List) (arraylist)).add(((Object) (parcel)));
				//   26   56:aload           4
				//   27   58:aload           5
				//   28   60:invokeinterface #74  <Method boolean List.add(Object)>
				//   29   65:pop             
						} while(true);
				//   30   66:goto            22
					}
					resultWrapper.sendResult(((List) (obj)), i);
				//   31   69:aload_0         
				//   32   70:getfield        #23  <Field MediaBrowserServiceCompatApi24$ResultWrapper val$resultWrapper>
				//   33   73:aload_3         
				//   34   74:iload_2         
				//   35   75:invokevirtual   #77  <Method void MediaBrowserServiceCompatApi24$ResultWrapper.sendResult(List, int)>
				//   36   78:return          
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
		//    5    7:invokespecial   #70  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi24$1(MediaBrowserServiceCompat$MediaBrowserServiceImplApi24, Object, MediaBrowserServiceCompatApi24$ResultWrapper)>
		//    6   10:astore_2        
			MediaBrowserServiceCompat.this.onLoadChildren(s, ((Result) (resultwrapper)), bundle);
		//    7   11:aload_0         
		//    8   12:getfield        #17  <Field MediaBrowserServiceCompat this$0>
		//    9   15:aload_1         
		//   10   16:aload_2         
		//   11   17:aload_3         
		//   12   18:invokevirtual   #73  <Method void MediaBrowserServiceCompat.onLoadChildren(String, MediaBrowserServiceCompat$Result, Bundle)>
		//   13   21:return          
		}

		final MediaBrowserServiceCompat this$0;

		MediaBrowserServiceImplApi24()
		{
			this$0 = MediaBrowserServiceCompat.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field MediaBrowserServiceCompat this$0>
			super();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #19  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi23(MediaBrowserServiceCompat)>
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
				throw new IllegalStateException("This should be called inside of onLoadChildren or onLoadItem methods");
		//    4   10:new             #33  <Class IllegalStateException>
		//    5   13:dup             
		//    6   14:ldc1            #35  <String "This should be called inside of onLoadChildren or onLoadItem methods">
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
				//*   9   25:ifeq            149
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
				//*  30   72:ifnull          146
						{
							obj1 = ((Object) (((List) (obj1)).iterator()));
				//   31   75:aload_3         
				//   32   76:invokeinterface #81  <Method Iterator List.iterator()>
				//   33   81:astore_3        
							while(((Iterator) (obj1)).hasNext()) 
				//*  34   82:aload_3         
				//*  35   83:invokeinterface #59  <Method boolean Iterator.hasNext()>
				//*  36   88:ifeq            146
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
				//*  47  117:ifeq            143
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
				//*  59  146:goto            19
				//   60  149:return          
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
				//*  25   65:goto            108
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

		public void detach()
		{
			if(mDetachCalled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field boolean mDetachCalled>
		//*   2    4:ifeq            37
				throw new IllegalStateException((new StringBuilder()).append("detach() called when detach() had already been called for: ").append(mDebug).toString());
		//    3    7:new             #28  <Class IllegalStateException>
		//    4   10:dup             
		//    5   11:new             #30  <Class StringBuilder>
		//    6   14:dup             
		//    7   15:invokespecial   #31  <Method void StringBuilder()>
		//    8   18:ldc1            #33  <String "detach() called when detach() had already been called for: ">
		//    9   20:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//   10   23:aload_0         
		//   11   24:getfield        #22  <Field Object mDebug>
		//   12   27:invokevirtual   #40  <Method StringBuilder StringBuilder.append(Object)>
		//   13   30:invokevirtual   #44  <Method String StringBuilder.toString()>
		//   14   33:invokespecial   #47  <Method void IllegalStateException(String)>
		//   15   36:athrow          
			if(mSendResultCalled)
		//*  16   37:aload_0         
		//*  17   38:getfield        #49  <Field boolean mSendResultCalled>
		//*  18   41:ifeq            74
			{
				throw new IllegalStateException((new StringBuilder()).append("detach() called when sendResult() had already been called for: ").append(mDebug).toString());
		//   19   44:new             #28  <Class IllegalStateException>
		//   20   47:dup             
		//   21   48:new             #30  <Class StringBuilder>
		//   22   51:dup             
		//   23   52:invokespecial   #31  <Method void StringBuilder()>
		//   24   55:ldc1            #51  <String "detach() called when sendResult() had already been called for: ">
		//   25   57:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//   26   60:aload_0         
		//   27   61:getfield        #22  <Field Object mDebug>
		//   28   64:invokevirtual   #40  <Method StringBuilder StringBuilder.append(Object)>
		//   29   67:invokevirtual   #44  <Method String StringBuilder.toString()>
		//   30   70:invokespecial   #47  <Method void IllegalStateException(String)>
		//   31   73:athrow          
			} else
			{
				mDetachCalled = true;
		//   32   74:aload_0         
		//   33   75:iconst_1        
		//   34   76:putfield        #26  <Field boolean mDetachCalled>
				return;
		//   35   79:return          
			}
		}

		boolean isDone()
		{
			return mDetachCalled || mSendResultCalled;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field boolean mDetachCalled>
		//    2    4:ifne            14
		//    3    7:aload_0         
		//    4    8:getfield        #49  <Field boolean mSendResultCalled>
		//    5   11:ifeq            16
		//    6   14:iconst_1        
		//    7   15:ireturn         
		//    8   16:iconst_0        
		//    9   17:ireturn         
		}

		void onResultSent(Object obj, int i)
		{
		//    0    0:return          
		}

		public void sendResult(Object obj)
		{
			if(mSendResultCalled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #49  <Field boolean mSendResultCalled>
		//*   2    4:ifeq            37
			{
				throw new IllegalStateException((new StringBuilder()).append("sendResult() called twice for: ").append(mDebug).toString());
		//    3    7:new             #28  <Class IllegalStateException>
		//    4   10:dup             
		//    5   11:new             #30  <Class StringBuilder>
		//    6   14:dup             
		//    7   15:invokespecial   #31  <Method void StringBuilder()>
		//    8   18:ldc1            #60  <String "sendResult() called twice for: ">
		//    9   20:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
		//   10   23:aload_0         
		//   11   24:getfield        #22  <Field Object mDebug>
		//   12   27:invokevirtual   #40  <Method StringBuilder StringBuilder.append(Object)>
		//   13   30:invokevirtual   #44  <Method String StringBuilder.toString()>
		//   14   33:invokespecial   #47  <Method void IllegalStateException(String)>
		//   15   36:athrow          
			} else
			{
				mSendResultCalled = true;
		//   16   37:aload_0         
		//   17   38:iconst_1        
		//   18   39:putfield        #49  <Field boolean mSendResultCalled>
				onResultSent(obj, mFlags);
		//   19   42:aload_0         
		//   20   43:aload_1         
		//   21   44:aload_0         
		//   22   45:getfield        #62  <Field int mFlags>
		//   23   48:invokevirtual   #64  <Method void onResultSent(Object, int)>
				return;
		//   24   51:return          
			}
		}

		void setFlags(int i)
		{
			mFlags = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #62  <Field int mFlags>
		//    3    5:return          
		}

		private Object mDebug;
		private boolean mDetachCalled;
		private int mFlags;
		private boolean mSendResultCalled;

		Result(Object obj)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			mDebug = obj;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field Object mDebug>
		//    5    9:return          
		}
	}

	class ServiceBinderImpl
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
		//    1    1:getfield        #29  <Field MediaBrowserServiceCompat this$0>
		//    2    4:getfield        #39  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//    3    7:new             #13  <Class MediaBrowserServiceCompat$ServiceBinderImpl$3>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:aload           4
		//    7   14:aload_1         
		//    8   15:aload_2         
		//    9   16:aload_3         
		//   10   17:invokespecial   #42  <Method void MediaBrowserServiceCompat$ServiceBinderImpl$3(MediaBrowserServiceCompat$ServiceBinderImpl, MediaBrowserServiceCompat$ServiceCallbacks, String, IBinder, Bundle)>
		//   11   20:invokevirtual   #48  <Method void MediaBrowserServiceCompat$ServiceHandler.postOrRun(Runnable)>
		//   12   23:return          
		}

		public void connect(final String pkg, int i, final Bundle rootHints, final ServiceCallbacks callbacks)
		{
			if(!isValidPackage(pkg, i))
		//*   0    0:aload_0         
		//*   1    1:getfield        #29  <Field MediaBrowserServiceCompat this$0>
		//*   2    4:aload_1         
		//*   3    5:iload_2         
		//*   4    6:invokevirtual   #54  <Method boolean MediaBrowserServiceCompat.isValidPackage(String, int)>
		//*   5    9:ifne            48
			{
				throw new IllegalArgumentException((new StringBuilder()).append("Package/uid mismatch: uid=").append(i).append(" package=").append(pkg).toString());
		//    6   12:new             #56  <Class IllegalArgumentException>
		//    7   15:dup             
		//    8   16:new             #58  <Class StringBuilder>
		//    9   19:dup             
		//   10   20:invokespecial   #59  <Method void StringBuilder()>
		//   11   23:ldc1            #61  <String "Package/uid mismatch: uid=">
		//   12   25:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
		//   13   28:iload_2         
		//   14   29:invokevirtual   #68  <Method StringBuilder StringBuilder.append(int)>
		//   15   32:ldc1            #70  <String " package=">
		//   16   34:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
		//   17   37:aload_1         
		//   18   38:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
		//   19   41:invokevirtual   #74  <Method String StringBuilder.toString()>
		//   20   44:invokespecial   #77  <Method void IllegalArgumentException(String)>
		//   21   47:athrow          
			} else
			{
				mHandler.postOrRun(((_cls1) (i)). new Runnable() {

					public void run()
					{
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
						ConnectionRecord connectionrecord = new ConnectionRecord();
					//   11   25:new             #65  <Class MediaBrowserServiceCompat$ConnectionRecord>
					//   12   28:dup             
					//   13   29:aload_0         
					//   14   30:getfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
					//   15   33:getfield        #53  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
					//   16   36:invokespecial   #68  <Method void MediaBrowserServiceCompat$ConnectionRecord(MediaBrowserServiceCompat)>
					//   17   39:astore_2        
						connectionrecord.pkg = pkg;
					//   18   40:aload_2         
					//   19   41:aload_0         
					//   20   42:getfield        #32  <Field String val$pkg>
					//   21   45:putfield        #71  <Field String MediaBrowserServiceCompat$ConnectionRecord.pkg>
						connectionrecord.rootHints = rootHints;
					//   22   48:aload_2         
					//   23   49:aload_0         
					//   24   50:getfield        #34  <Field Bundle val$rootHints>
					//   25   53:putfield        #74  <Field Bundle MediaBrowserServiceCompat$ConnectionRecord.rootHints>
						connectionrecord.callbacks = callbacks;
					//   26   56:aload_2         
					//   27   57:aload_0         
					//   28   58:getfield        #30  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
					//   29   61:putfield        #77  <Field MediaBrowserServiceCompat$ServiceCallbacks MediaBrowserServiceCompat$ConnectionRecord.callbacks>
						connectionrecord.root = onGetRoot(pkg, uid, rootHints);
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
						if(connectionrecord.root == null)
					//*  42   90:aload_2         
					//*  43   91:getfield        #85  <Field MediaBrowserServiceCompat$BrowserRoot MediaBrowserServiceCompat$ConnectionRecord.root>
					//*  44   94:ifnonnull       180
						{
							Log.i("MBServiceCompat", (new StringBuilder()).append("No root for client ").append(pkg).append(" from service ").append(((Object)this).getClass().getName()).toString());
					//   45   97:ldc1            #87  <String "MBServiceCompat">
					//   46   99:new             #89  <Class StringBuilder>
					//   47  102:dup             
					//   48  103:invokespecial   #90  <Method void StringBuilder()>
					//   49  106:ldc1            #92  <String "No root for client ">
					//   50  108:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
					//   51  111:aload_0         
					//   52  112:getfield        #32  <Field String val$pkg>
					//   53  115:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
					//   54  118:ldc1            #98  <String " from service ">
					//   55  120:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
					//   56  123:aload_0         
					//   57  124:invokevirtual   #102 <Method Class Object.getClass()>
					//   58  127:invokevirtual   #108 <Method String Class.getName()>
					//   59  130:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
					//   60  133:invokevirtual   #111 <Method String StringBuilder.toString()>
					//   61  136:invokestatic    #117 <Method int Log.i(String, String)>
					//   62  139:pop             
							try
							{
								callbacks.onConnectFailed();
					//   63  140:aload_0         
					//   64  141:getfield        #30  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
					//   65  144:invokeinterface #120 <Method void MediaBrowserServiceCompat$ServiceCallbacks.onConnectFailed()>
								return;
					//   66  149:return          
							}
							// Misplaced declaration of an exception variable
							catch(Object obj)
					//*  67  150:astore_1        
							{
								Log.w("MBServiceCompat", (new StringBuilder()).append("Calling onConnectFailed() failed. Ignoring. pkg=").append(pkg).toString());
					//   68  151:ldc1            #87  <String "MBServiceCompat">
					//   69  153:new             #89  <Class StringBuilder>
					//   70  156:dup             
					//   71  157:invokespecial   #90  <Method void StringBuilder()>
					//   72  160:ldc1            #122 <String "Calling onConnectFailed() failed. Ignoring. pkg=">
					//   73  162:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
					//   74  165:aload_0         
					//   75  166:getfield        #32  <Field String val$pkg>
					//   76  169:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
					//   77  172:invokevirtual   #111 <Method String StringBuilder.toString()>
					//   78  175:invokestatic    #125 <Method int Log.w(String, String)>
					//   79  178:pop             
							}
							return;
					//   80  179:return          
						}
						try
						{
							mConnections.put(obj, ((Object) (connectionrecord)));
					//   81  180:aload_0         
					//   82  181:getfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
					//   83  184:getfield        #53  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
					//   84  187:getfield        #57  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
					//   85  190:aload_1         
					//   86  191:aload_2         
					//   87  192:invokevirtual   #129 <Method Object ArrayMap.put(Object, Object)>
					//   88  195:pop             
							if(mSession != null)
					//*  89  196:aload_0         
					//*  90  197:getfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
					//*  91  200:getfield        #53  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
					//*  92  203:getfield        #133 <Field android.support.v4.media.session.MediaSessionCompat$Token MediaBrowserServiceCompat.mSession>
					//*  93  206:ifnull          242
								callbacks.onConnect(connectionrecord.root.getRootId(), mSession, connectionrecord.root.getExtras());
					//   94  209:aload_0         
					//   95  210:getfield        #30  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
					//   96  213:aload_2         
					//   97  214:getfield        #85  <Field MediaBrowserServiceCompat$BrowserRoot MediaBrowserServiceCompat$ConnectionRecord.root>
					//   98  217:invokevirtual   #138 <Method String MediaBrowserServiceCompat$BrowserRoot.getRootId()>
					//   99  220:aload_0         
					//  100  221:getfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
					//  101  224:getfield        #53  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
					//  102  227:getfield        #133 <Field android.support.v4.media.session.MediaSessionCompat$Token MediaBrowserServiceCompat.mSession>
					//  103  230:aload_2         
					//  104  231:getfield        #85  <Field MediaBrowserServiceCompat$BrowserRoot MediaBrowserServiceCompat$ConnectionRecord.root>
					//  105  234:invokevirtual   #142 <Method Bundle MediaBrowserServiceCompat$BrowserRoot.getExtras()>
					//  106  237:invokeinterface #146 <Method void MediaBrowserServiceCompat$ServiceCallbacks.onConnect(String, android.support.v4.media.session.MediaSessionCompat$Token, Bundle)>
							return;
					//  107  242:return          
						}
						catch(RemoteException remoteexception)
					//* 108  243:astore_2        
						{
							Log.w("MBServiceCompat", (new StringBuilder()).append("Calling onConnect() failed. Dropping client. pkg=").append(pkg).toString());
					//  109  244:ldc1            #87  <String "MBServiceCompat">
					//  110  246:new             #89  <Class StringBuilder>
					//  111  249:dup             
					//  112  250:invokespecial   #90  <Method void StringBuilder()>
					//  113  253:ldc1            #148 <String "Calling onConnect() failed. Dropping client. pkg=">
					//  114  255:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
					//  115  258:aload_0         
					//  116  259:getfield        #32  <Field String val$pkg>
					//  117  262:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
					//  118  265:invokevirtual   #111 <Method String StringBuilder.toString()>
					//  119  268:invokestatic    #125 <Method int Log.w(String, String)>
					//  120  271:pop             
						}
						mConnections.remove(obj);
					//  121  272:aload_0         
					//  122  273:getfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
					//  123  276:getfield        #53  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
					//  124  279:getfield        #57  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
					//  125  282:aload_1         
					//  126  283:invokevirtual   #63  <Method Object ArrayMap.remove(Object)>
					//  127  286:pop             
					//  128  287:return          
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
		//   23   49:getfield        #29  <Field MediaBrowserServiceCompat this$0>
		//   24   52:getfield        #39  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//   25   55:new             #9   <Class MediaBrowserServiceCompat$ServiceBinderImpl$1>
		//   26   58:dup             
		//   27   59:aload_0         
		//   28   60:aload           4
		//   29   62:aload_1         
		//   30   63:aload_3         
		//   31   64:iload_2         
		//   32   65:invokespecial   #80  <Method void MediaBrowserServiceCompat$ServiceBinderImpl$1(MediaBrowserServiceCompat$ServiceBinderImpl, MediaBrowserServiceCompat$ServiceCallbacks, String, Bundle, int)>
		//   33   68:invokevirtual   #48  <Method void MediaBrowserServiceCompat$ServiceHandler.postOrRun(Runnable)>
				return;
		//   34   71:return          
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
				//   12   28:return          
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
		//    1    1:getfield        #29  <Field MediaBrowserServiceCompat this$0>
		//    2    4:getfield        #39  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//    3    7:new             #11  <Class MediaBrowserServiceCompat$ServiceBinderImpl$2>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:invokespecial   #85  <Method void MediaBrowserServiceCompat$ServiceBinderImpl$2(MediaBrowserServiceCompat$ServiceBinderImpl, MediaBrowserServiceCompat$ServiceCallbacks)>
		//    8   16:invokevirtual   #48  <Method void MediaBrowserServiceCompat$ServiceHandler.postOrRun(Runnable)>
		//    9   19:return          
		}

		public void getMediaItem(final String mediaId, ResultReceiver resultreceiver, final ServiceCallbacks callbacks)
		{
			if(TextUtils.isEmpty(((CharSequence) (mediaId))) || resultreceiver == null)
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #93  <Method boolean TextUtils.isEmpty(CharSequence)>
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
		//    7   13:getfield        #29  <Field MediaBrowserServiceCompat this$0>
		//    8   16:getfield        #39  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//    9   19:new             #17  <Class MediaBrowserServiceCompat$ServiceBinderImpl$5>
		//   10   22:dup             
		//   11   23:aload_0         
		//   12   24:aload_3         
		//   13   25:aload_1         
		//   14   26:aload_2         
		//   15   27:invokespecial   #96  <Method void MediaBrowserServiceCompat$ServiceBinderImpl$5(MediaBrowserServiceCompat$ServiceBinderImpl, MediaBrowserServiceCompat$ServiceCallbacks, String, ResultReceiver)>
		//   16   30:invokevirtual   #48  <Method void MediaBrowserServiceCompat$ServiceHandler.postOrRun(Runnable)>
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
				//   13   29:aload_0         
				//   14   30:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				//   15   33:getfield        #43  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
				//   16   36:invokespecial   #58  <Method void MediaBrowserServiceCompat$ConnectionRecord(MediaBrowserServiceCompat)>
				//   17   39:astore_2        
					connectionrecord.callbacks = callbacks;
				//   18   40:aload_2         
				//   19   41:aload_0         
				//   20   42:getfield        #26  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
				//   21   45:putfield        #61  <Field MediaBrowserServiceCompat$ServiceCallbacks MediaBrowserServiceCompat$ConnectionRecord.callbacks>
					connectionrecord.rootHints = rootHints;
				//   22   48:aload_2         
				//   23   49:aload_0         
				//   24   50:getfield        #28  <Field Bundle val$rootHints>
				//   25   53:putfield        #64  <Field Bundle MediaBrowserServiceCompat$ConnectionRecord.rootHints>
					mConnections.put(((Object) (ibinder)), ((Object) (connectionrecord)));
				//   26   56:aload_0         
				//   27   57:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				//   28   60:getfield        #43  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
				//   29   63:getfield        #47  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
				//   30   66:aload_1         
				//   31   67:aload_2         
				//   32   68:invokevirtual   #68  <Method Object ArrayMap.put(Object, Object)>
				//   33   71:pop             
				//   34   72:return          
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
		//    1    1:getfield        #29  <Field MediaBrowserServiceCompat this$0>
		//    2    4:getfield        #39  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//    3    7:new             #19  <Class MediaBrowserServiceCompat$ServiceBinderImpl$6>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:aload_2         
		//    8   14:invokespecial   #101 <Method void MediaBrowserServiceCompat$ServiceBinderImpl$6(MediaBrowserServiceCompat$ServiceBinderImpl, MediaBrowserServiceCompat$ServiceCallbacks, Bundle)>
		//    9   17:invokevirtual   #48  <Method void MediaBrowserServiceCompat$ServiceHandler.postOrRun(Runnable)>
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
					{
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
						return;
				//   26   60:return          
					}
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
				//*  36   80:ifne            116
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
				//   51  116:return          
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
		//    1    1:getfield        #29  <Field MediaBrowserServiceCompat this$0>
		//    2    4:getfield        #39  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//    3    7:new             #15  <Class MediaBrowserServiceCompat$ServiceBinderImpl$4>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:aload_3         
		//    7   13:aload_1         
		//    8   14:aload_2         
		//    9   15:invokespecial   #106 <Method void MediaBrowserServiceCompat$ServiceBinderImpl$4(MediaBrowserServiceCompat$ServiceBinderImpl, MediaBrowserServiceCompat$ServiceCallbacks, String, IBinder)>
		//   10   18:invokevirtual   #48  <Method void MediaBrowserServiceCompat$ServiceHandler.postOrRun(Runnable)>
		//   11   21:return          
		}

		public void search(final String query, final Bundle extras, ResultReceiver resultreceiver, final ServiceCallbacks callbacks)
		{
			if(TextUtils.isEmpty(((CharSequence) (query))) || resultreceiver == null)
		//*   0    0:aload_1         
		//*   1    1:invokestatic    #93  <Method boolean TextUtils.isEmpty(CharSequence)>
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
		//    7   13:getfield        #29  <Field MediaBrowserServiceCompat this$0>
		//    8   16:getfield        #39  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//    9   19:new             #23  <Class MediaBrowserServiceCompat$ServiceBinderImpl$8>
		//   10   22:dup             
		//   11   23:aload_0         
		//   12   24:aload           4
		//   13   26:aload_1         
		//   14   27:aload_2         
		//   15   28:aload_3         
		//   16   29:invokespecial   #111 <Method void MediaBrowserServiceCompat$ServiceBinderImpl$8(MediaBrowserServiceCompat$ServiceBinderImpl, MediaBrowserServiceCompat$ServiceCallbacks, String, Bundle, ResultReceiver)>
		//   17   32:invokevirtual   #48  <Method void MediaBrowserServiceCompat$ServiceHandler.postOrRun(Runnable)>
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
		//    1    1:getfield        #29  <Field MediaBrowserServiceCompat this$0>
		//    2    4:getfield        #39  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
		//    3    7:new             #21  <Class MediaBrowserServiceCompat$ServiceBinderImpl$7>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:invokespecial   #113 <Method void MediaBrowserServiceCompat$ServiceBinderImpl$7(MediaBrowserServiceCompat$ServiceBinderImpl, MediaBrowserServiceCompat$ServiceCallbacks)>
		//    8   16:invokevirtual   #48  <Method void MediaBrowserServiceCompat$ServiceHandler.postOrRun(Runnable)>
		//    9   19:return          
		}

		final MediaBrowserServiceCompat this$0;

		ServiceBinderImpl()
		{
			this$0 = MediaBrowserServiceCompat.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #29  <Field MediaBrowserServiceCompat this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #32  <Method void Object()>
		//    5    9:return          
		}
	}

	static interface ServiceCallbacks
	{

		public abstract IBinder asBinder();

		public abstract void onConnect(String s, android.support.v4.media.session.MediaSessionCompat.Token token, Bundle bundle)
			throws RemoteException;

		public abstract void onConnectFailed()
			throws RemoteException;

		public abstract void onLoadChildren(String s, List list, Bundle bundle)
			throws RemoteException;
	}

	class ServiceCallbacksCompat
		implements ServiceCallbacks
	{

		private void sendRequest(int i, Bundle bundle)
			throws RemoteException
		{
			Message message = Message.obtain();
		//    0    0:invokestatic    #33  <Method Message Message.obtain()>
		//    1    3:astore_3        
			message.what = i;
		//    2    4:aload_3         
		//    3    5:iload_1         
		//    4    6:putfield        #37  <Field int Message.what>
			message.arg1 = 1;
		//    5    9:aload_3         
		//    6   10:iconst_1        
		//    7   11:putfield        #40  <Field int Message.arg1>
			message.setData(bundle);
		//    8   14:aload_3         
		//    9   15:aload_2         
		//   10   16:invokevirtual   #44  <Method void Message.setData(Bundle)>
			mCallbacks.send(message);
		//   11   19:aload_0         
		//   12   20:getfield        #22  <Field Messenger mCallbacks>
		//   13   23:aload_3         
		//   14   24:invokevirtual   #50  <Method void Messenger.send(Message)>
		//   15   27:return          
		}

		public IBinder asBinder()
		{
			return mCallbacks.getBinder();
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field Messenger mCallbacks>
		//    2    4:invokevirtual   #56  <Method IBinder Messenger.getBinder()>
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
		//    4    7:new             #60  <Class Bundle>
		//    5   10:dup             
		//    6   11:invokespecial   #61  <Method void Bundle()>
		//    7   14:astore          4
			bundle1.putInt("extra_service_version", 1);
		//    8   16:aload           4
		//    9   18:ldc1            #63  <String "extra_service_version">
		//   10   20:iconst_1        
		//   11   21:invokevirtual   #67  <Method void Bundle.putInt(String, int)>
			bundle = new Bundle();
		//   12   24:new             #60  <Class Bundle>
		//   13   27:dup             
		//   14   28:invokespecial   #61  <Method void Bundle()>
		//   15   31:astore_3        
			bundle.putString("data_media_item_id", s);
		//   16   32:aload_3         
		//   17   33:ldc1            #69  <String "data_media_item_id">
		//   18   35:aload_1         
		//   19   36:invokevirtual   #73  <Method void Bundle.putString(String, String)>
			bundle.putParcelable("data_media_session_token", ((android.os.Parcelable) (token)));
		//   20   39:aload_3         
		//   21   40:ldc1            #75  <String "data_media_session_token">
		//   22   42:aload_2         
		//   23   43:invokevirtual   #79  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			bundle.putBundle("data_root_hints", bundle1);
		//   24   46:aload_3         
		//   25   47:ldc1            #81  <String "data_root_hints">
		//   26   49:aload           4
		//   27   51:invokevirtual   #85  <Method void Bundle.putBundle(String, Bundle)>
			sendRequest(1, bundle);
		//   28   54:aload_0         
		//   29   55:iconst_1        
		//   30   56:aload_3         
		//   31   57:invokespecial   #87  <Method void sendRequest(int, Bundle)>
		//   32   60:return          
		}

		public void onConnectFailed()
			throws RemoteException
		{
			sendRequest(2, ((Bundle) (null)));
		//    0    0:aload_0         
		//    1    1:iconst_2        
		//    2    2:aconst_null     
		//    3    3:invokespecial   #87  <Method void sendRequest(int, Bundle)>
		//    4    6:return          
		}

		public void onLoadChildren(String s, List list, Bundle bundle)
			throws RemoteException
		{
			Bundle bundle1 = new Bundle();
		//    0    0:new             #60  <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #61  <Method void Bundle()>
		//    3    7:astore          4
			bundle1.putString("data_media_item_id", s);
		//    4    9:aload           4
		//    5   11:ldc1            #69  <String "data_media_item_id">
		//    6   13:aload_1         
		//    7   14:invokevirtual   #73  <Method void Bundle.putString(String, String)>
			bundle1.putBundle("data_options", bundle);
		//    8   17:aload           4
		//    9   19:ldc1            #92  <String "data_options">
		//   10   21:aload_3         
		//   11   22:invokevirtual   #85  <Method void Bundle.putBundle(String, Bundle)>
			if(list != null)
		//*  12   25:aload_2         
		//*  13   26:ifnull          61
			{
				if(list instanceof ArrayList)
		//*  14   29:aload_2         
		//*  15   30:instanceof      #94  <Class ArrayList>
		//*  16   33:ifeq            44
					s = ((String) ((ArrayList)list));
		//   17   36:aload_2         
		//   18   37:checkcast       #94  <Class ArrayList>
		//   19   40:astore_1        
				else
		//*  20   41:goto            53
					s = ((String) (new ArrayList(((Collection) (list)))));
		//   21   44:new             #94  <Class ArrayList>
		//   22   47:dup             
		//   23   48:aload_2         
		//   24   49:invokespecial   #97  <Method void ArrayList(Collection)>
		//   25   52:astore_1        
				bundle1.putParcelableArrayList("data_media_item_list", ((ArrayList) (s)));
		//   26   53:aload           4
		//   27   55:ldc1            #99  <String "data_media_item_list">
		//   28   57:aload_1         
		//   29   58:invokevirtual   #103 <Method void Bundle.putParcelableArrayList(String, ArrayList)>
			}
			sendRequest(3, bundle1);
		//   30   61:aload_0         
		//   31   62:iconst_3        
		//   32   63:aload           4
		//   33   65:invokespecial   #87  <Method void sendRequest(int, Bundle)>
		//   34   68:return          
		}

		final Messenger mCallbacks;
		final MediaBrowserServiceCompat this$0;

		ServiceCallbacksCompat(Messenger messenger)
		{
			this$0 = MediaBrowserServiceCompat.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field MediaBrowserServiceCompat this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
			mCallbacks = messenger;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field Messenger mCallbacks>
		//    8   14:return          
		}
	}

	final class ServiceHandler extends Handler
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
		//*   5    9:tableswitch     1 8: default 56
		//		               1 59
		//		               2 100
		//		               3 123
		//		               4 164
		//		               5 199
		//		               6 237
		//		               7 266
		//		               8 289
		//*   6   56:goto            333
			case 1: // '\001'
				mServiceBinderImpl.connect(bundle.getString("data_package_name"), bundle.getInt("data_calling_uid"), bundle.getBundle("data_root_hints"), ((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))));
		//    7   59:aload_0         
		//    8   60:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//    9   63:aload_2         
		//   10   64:ldc1            #39  <String "data_package_name">
		//   11   66:invokevirtual   #45  <Method String Bundle.getString(String)>
		//   12   69:aload_2         
		//   13   70:ldc1            #47  <String "data_calling_uid">
		//   14   72:invokevirtual   #51  <Method int Bundle.getInt(String)>
		//   15   75:aload_2         
		//   16   76:ldc1            #53  <String "data_root_hints">
		//   17   78:invokevirtual   #57  <Method Bundle Bundle.getBundle(String)>
		//   18   81:new             #59  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//   19   84:dup             
		//   20   85:aload_0         
		//   21   86:getfield        #15  <Field MediaBrowserServiceCompat this$0>
		//   22   89:aload_1         
		//   23   90:getfield        #63  <Field Messenger Message.replyTo>
		//   24   93:invokespecial   #66  <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(MediaBrowserServiceCompat, Messenger)>
		//   25   96:invokevirtual   #70  <Method void MediaBrowserServiceCompat$ServiceBinderImpl.connect(String, int, Bundle, MediaBrowserServiceCompat$ServiceCallbacks)>
				return;
		//   26   99:return          

			case 2: // '\002'
				mServiceBinderImpl.disconnect(((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))));
		//   27  100:aload_0         
		//   28  101:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//   29  104:new             #59  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//   30  107:dup             
		//   31  108:aload_0         
		//   32  109:getfield        #15  <Field MediaBrowserServiceCompat this$0>
		//   33  112:aload_1         
		//   34  113:getfield        #63  <Field Messenger Message.replyTo>
		//   35  116:invokespecial   #66  <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(MediaBrowserServiceCompat, Messenger)>
		//   36  119:invokevirtual   #74  <Method void MediaBrowserServiceCompat$ServiceBinderImpl.disconnect(MediaBrowserServiceCompat$ServiceCallbacks)>
				return;
		//   37  122:return          

			case 3: // '\003'
				mServiceBinderImpl.addSubscription(bundle.getString("data_media_item_id"), BundleCompat.getBinder(bundle, "data_callback_token"), bundle.getBundle("data_options"), ((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))));
		//   38  123:aload_0         
		//   39  124:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//   40  127:aload_2         
		//   41  128:ldc1            #76  <String "data_media_item_id">
		//   42  130:invokevirtual   #45  <Method String Bundle.getString(String)>
		//   43  133:aload_2         
		//   44  134:ldc1            #78  <String "data_callback_token">
		//   45  136:invokestatic    #84  <Method IBinder BundleCompat.getBinder(Bundle, String)>
		//   46  139:aload_2         
		//   47  140:ldc1            #86  <String "data_options">
		//   48  142:invokevirtual   #57  <Method Bundle Bundle.getBundle(String)>
		//   49  145:new             #59  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//   50  148:dup             
		//   51  149:aload_0         
		//   52  150:getfield        #15  <Field MediaBrowserServiceCompat this$0>
		//   53  153:aload_1         
		//   54  154:getfield        #63  <Field Messenger Message.replyTo>
		//   55  157:invokespecial   #66  <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(MediaBrowserServiceCompat, Messenger)>
		//   56  160:invokevirtual   #90  <Method void MediaBrowserServiceCompat$ServiceBinderImpl.addSubscription(String, IBinder, Bundle, MediaBrowserServiceCompat$ServiceCallbacks)>
				return;
		//   57  163:return          

			case 4: // '\004'
				mServiceBinderImpl.removeSubscription(bundle.getString("data_media_item_id"), BundleCompat.getBinder(bundle, "data_callback_token"), ((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))));
		//   58  164:aload_0         
		//   59  165:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//   60  168:aload_2         
		//   61  169:ldc1            #76  <String "data_media_item_id">
		//   62  171:invokevirtual   #45  <Method String Bundle.getString(String)>
		//   63  174:aload_2         
		//   64  175:ldc1            #78  <String "data_callback_token">
		//   65  177:invokestatic    #84  <Method IBinder BundleCompat.getBinder(Bundle, String)>
		//   66  180:new             #59  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//   67  183:dup             
		//   68  184:aload_0         
		//   69  185:getfield        #15  <Field MediaBrowserServiceCompat this$0>
		//   70  188:aload_1         
		//   71  189:getfield        #63  <Field Messenger Message.replyTo>
		//   72  192:invokespecial   #66  <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(MediaBrowserServiceCompat, Messenger)>
		//   73  195:invokevirtual   #94  <Method void MediaBrowserServiceCompat$ServiceBinderImpl.removeSubscription(String, IBinder, MediaBrowserServiceCompat$ServiceCallbacks)>
				return;
		//   74  198:return          

			case 5: // '\005'
				mServiceBinderImpl.getMediaItem(bundle.getString("data_media_item_id"), (ResultReceiver)bundle.getParcelable("data_result_receiver"), ((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))));
		//   75  199:aload_0         
		//   76  200:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//   77  203:aload_2         
		//   78  204:ldc1            #76  <String "data_media_item_id">
		//   79  206:invokevirtual   #45  <Method String Bundle.getString(String)>
		//   80  209:aload_2         
		//   81  210:ldc1            #96  <String "data_result_receiver">
		//   82  212:invokevirtual   #100 <Method android.os.Parcelable Bundle.getParcelable(String)>
		//   83  215:checkcast       #102 <Class ResultReceiver>
		//   84  218:new             #59  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//   85  221:dup             
		//   86  222:aload_0         
		//   87  223:getfield        #15  <Field MediaBrowserServiceCompat this$0>
		//   88  226:aload_1         
		//   89  227:getfield        #63  <Field Messenger Message.replyTo>
		//   90  230:invokespecial   #66  <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(MediaBrowserServiceCompat, Messenger)>
		//   91  233:invokevirtual   #106 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.getMediaItem(String, ResultReceiver, MediaBrowserServiceCompat$ServiceCallbacks)>
				return;
		//   92  236:return          

			case 6: // '\006'
				mServiceBinderImpl.registerCallbacks(((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))), bundle.getBundle("data_root_hints"));
		//   93  237:aload_0         
		//   94  238:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//   95  241:new             #59  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//   96  244:dup             
		//   97  245:aload_0         
		//   98  246:getfield        #15  <Field MediaBrowserServiceCompat this$0>
		//   99  249:aload_1         
		//  100  250:getfield        #63  <Field Messenger Message.replyTo>
		//  101  253:invokespecial   #66  <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(MediaBrowserServiceCompat, Messenger)>
		//  102  256:aload_2         
		//  103  257:ldc1            #53  <String "data_root_hints">
		//  104  259:invokevirtual   #57  <Method Bundle Bundle.getBundle(String)>
		//  105  262:invokevirtual   #110 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.registerCallbacks(MediaBrowserServiceCompat$ServiceCallbacks, Bundle)>
				return;
		//  106  265:return          

			case 7: // '\007'
				mServiceBinderImpl.unregisterCallbacks(((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))));
		//  107  266:aload_0         
		//  108  267:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//  109  270:new             #59  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//  110  273:dup             
		//  111  274:aload_0         
		//  112  275:getfield        #15  <Field MediaBrowserServiceCompat this$0>
		//  113  278:aload_1         
		//  114  279:getfield        #63  <Field Messenger Message.replyTo>
		//  115  282:invokespecial   #66  <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(MediaBrowserServiceCompat, Messenger)>
		//  116  285:invokevirtual   #113 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.unregisterCallbacks(MediaBrowserServiceCompat$ServiceCallbacks)>
				return;
		//  117  288:return          

			case 8: // '\b'
				mServiceBinderImpl.search(bundle.getString("data_search_query"), bundle.getBundle("data_search_extras"), (ResultReceiver)bundle.getParcelable("data_result_receiver"), ((ServiceCallbacks) (new ServiceCallbacksCompat(message.replyTo))));
		//  118  289:aload_0         
		//  119  290:getfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl mServiceBinderImpl>
		//  120  293:aload_2         
		//  121  294:ldc1            #115 <String "data_search_query">
		//  122  296:invokevirtual   #45  <Method String Bundle.getString(String)>
		//  123  299:aload_2         
		//  124  300:ldc1            #117 <String "data_search_extras">
		//  125  302:invokevirtual   #57  <Method Bundle Bundle.getBundle(String)>
		//  126  305:aload_2         
		//  127  306:ldc1            #96  <String "data_result_receiver">
		//  128  308:invokevirtual   #100 <Method android.os.Parcelable Bundle.getParcelable(String)>
		//  129  311:checkcast       #102 <Class ResultReceiver>
		//  130  314:new             #59  <Class MediaBrowserServiceCompat$ServiceCallbacksCompat>
		//  131  317:dup             
		//  132  318:aload_0         
		//  133  319:getfield        #15  <Field MediaBrowserServiceCompat this$0>
		//  134  322:aload_1         
		//  135  323:getfield        #63  <Field Messenger Message.replyTo>
		//  136  326:invokespecial   #66  <Method void MediaBrowserServiceCompat$ServiceCallbacksCompat(MediaBrowserServiceCompat, Messenger)>
		//  137  329:invokevirtual   #121 <Method void MediaBrowserServiceCompat$ServiceBinderImpl.search(String, Bundle, ResultReceiver, MediaBrowserServiceCompat$ServiceCallbacks)>
				return;
		//  138  332:return          
			}
			Log.w("MBServiceCompat", (new StringBuilder()).append("Unhandled message: ").append(((Object) (message))).append("\n  Service version: ").append(1).append("\n  Client version: ").append(message.arg1).toString());
		//  139  333:ldc1            #123 <String "MBServiceCompat">
		//  140  335:new             #125 <Class StringBuilder>
		//  141  338:dup             
		//  142  339:invokespecial   #126 <Method void StringBuilder()>
		//  143  342:ldc1            #128 <String "Unhandled message: ">
		//  144  344:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
		//  145  347:aload_1         
		//  146  348:invokevirtual   #135 <Method StringBuilder StringBuilder.append(Object)>
		//  147  351:ldc1            #137 <String "\n  Service version: ">
		//  148  353:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
		//  149  356:iconst_1        
		//  150  357:invokevirtual   #140 <Method StringBuilder StringBuilder.append(int)>
		//  151  360:ldc1            #142 <String "\n  Client version: ">
		//  152  362:invokevirtual   #132 <Method StringBuilder StringBuilder.append(String)>
		//  153  365:aload_1         
		//  154  366:getfield        #145 <Field int Message.arg1>
		//  155  369:invokevirtual   #140 <Method StringBuilder StringBuilder.append(int)>
		//  156  372:invokevirtual   #149 <Method String StringBuilder.toString()>
		//  157  375:invokestatic    #155 <Method int Log.w(String, String)>
		//  158  378:pop             
		//  159  379:return          
		}

		public void postOrRun(Runnable runnable)
		{
			if(Thread.currentThread() == getLooper().getThread())
		//*   0    0:invokestatic    #163 <Method Thread Thread.currentThread()>
		//*   1    3:aload_0         
		//*   2    4:invokevirtual   #167 <Method Looper getLooper()>
		//*   3    7:invokevirtual   #172 <Method Thread Looper.getThread()>
		//*   4   10:if_acmpne       20
			{
				runnable.run();
		//    5   13:aload_1         
		//    6   14:invokeinterface #177 <Method void Runnable.run()>
				return;
		//    7   19:return          
			} else
			{
				post(runnable);
		//    8   20:aload_0         
		//    9   21:aload_1         
		//   10   22:invokevirtual   #181 <Method boolean post(Runnable)>
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
		//    4    8:ldc1            #185 <Class MediaBrowserCompat>
		//    5   10:invokevirtual   #191 <Method ClassLoader Class.getClassLoader()>
		//    6   13:invokevirtual   #195 <Method void Bundle.setClassLoader(ClassLoader)>
			bundle.putInt("data_calling_uid", Binder.getCallingUid());
		//    7   16:aload           4
		//    8   18:ldc1            #47  <String "data_calling_uid">
		//    9   20:invokestatic    #201 <Method int Binder.getCallingUid()>
		//   10   23:invokevirtual   #205 <Method void Bundle.putInt(String, int)>
			return super.sendMessageAtTime(message, l);
		//   11   26:aload_0         
		//   12   27:aload_1         
		//   13   28:lload_2         
		//   14   29:invokespecial   #207 <Method boolean Handler.sendMessageAtTime(Message, long)>
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
	//    1    1:invokespecial   #129 <Method void Service()>
	//    2    4:aload_0         
	//    3    5:new             #131 <Class ArrayMap>
	//    4    8:dup             
	//    5    9:invokespecial   #132 <Method void ArrayMap()>
	//    6   12:putfield        #134 <Field ArrayMap mConnections>
	//    7   15:aload_0         
	//    8   16:new             #73  <Class MediaBrowserServiceCompat$ServiceHandler>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #137 <Method void MediaBrowserServiceCompat$ServiceHandler(MediaBrowserServiceCompat)>
	//   12   24:putfield        #139 <Field MediaBrowserServiceCompat$ServiceHandler mHandler>
	//   13   27:return          
	}

	void addSubscription(String s, ConnectionRecord connectionrecord, IBinder ibinder, Bundle bundle)
	{
		List list = (List)connectionrecord.subscriptions.get(((Object) (s)));
	//    0    0:aload_2         
	//    1    1:getfield        #145 <Field HashMap MediaBrowserServiceCompat$ConnectionRecord.subscriptions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #151 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #153 <Class List>
	//    5   11:astore          6
		Object obj = ((Object) (list));
	//    6   13:aload           6
	//    7   15:astore          5
		if(list == null)
	//*   8   17:aload           6
	//*   9   19:ifnonnull       31
			obj = ((Object) (new ArrayList()));
	//   10   22:new             #155 <Class ArrayList>
	//   11   25:dup             
	//   12   26:invokespecial   #156 <Method void ArrayList()>
	//   13   29:astore          5
		for(Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext();)
	//*  14   31:aload           5
	//*  15   33:invokeinterface #160 <Method Iterator List.iterator()>
	//*  16   38:astore          6
	//*  17   40:aload           6
	//*  18   42:invokeinterface #166 <Method boolean Iterator.hasNext()>
	//*  19   47:ifeq            91
		{
			Pair pair = (Pair)iterator.next();
	//   20   50:aload           6
	//   21   52:invokeinterface #170 <Method Object Iterator.next()>
	//   22   57:checkcast       #172 <Class Pair>
	//   23   60:astore          7
			if(ibinder == pair.first && MediaBrowserCompatUtils.areSameOptions(bundle, (Bundle)pair.second))
	//*  24   62:aload_3         
	//*  25   63:aload           7
	//*  26   65:getfield        #176 <Field Object Pair.first>
	//*  27   68:if_acmpne       88
	//*  28   71:aload           4
	//*  29   73:aload           7
	//*  30   75:getfield        #179 <Field Object Pair.second>
	//*  31   78:checkcast       #181 <Class Bundle>
	//*  32   81:invokestatic    #187 <Method boolean MediaBrowserCompatUtils.areSameOptions(Bundle, Bundle)>
	//*  33   84:ifeq            88
				return;
	//   34   87:return          
		}

	//*  35   88:goto            40
		((List) (obj)).add(((Object) (new Pair(((Object) (ibinder)), ((Object) (bundle))))));
	//   36   91:aload           5
	//   37   93:new             #172 <Class Pair>
	//   38   96:dup             
	//   39   97:aload_3         
	//   40   98:aload           4
	//   41  100:invokespecial   #190 <Method void Pair(Object, Object)>
	//   42  103:invokeinterface #194 <Method boolean List.add(Object)>
	//   43  108:pop             
		connectionrecord.subscriptions.put(((Object) (s)), obj);
	//   44  109:aload_2         
	//   45  110:getfield        #145 <Field HashMap MediaBrowserServiceCompat$ConnectionRecord.subscriptions>
	//   46  113:aload_1         
	//   47  114:aload           5
	//   48  116:invokevirtual   #198 <Method Object HashMap.put(Object, Object)>
	//   49  119:pop             
		performLoadChildren(s, connectionrecord, bundle);
	//   50  120:aload_0         
	//   51  121:aload_1         
	//   52  122:aload_2         
	//   53  123:aload           4
	//   54  125:invokevirtual   #202 <Method void performLoadChildren(String, MediaBrowserServiceCompat$ConnectionRecord, Bundle)>
	//   55  128:return          
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
	//    5    7:ldc1            #206 <String "android.media.browse.extra.PAGE">
	//    6    9:iconst_m1       
	//    7   10:invokevirtual   #210 <Method int Bundle.getInt(String, int)>
	//    8   13:istore_3        
		int l = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
	//    9   14:aload_2         
	//   10   15:ldc1            #212 <String "android.media.browse.extra.PAGE_SIZE">
	//   11   17:iconst_m1       
	//   12   18:invokevirtual   #210 <Method int Bundle.getInt(String, int)>
	//   13   21:istore          6
		if(i == -1 && l == -1)
	//*  14   23:iload_3         
	//*  15   24:iconst_m1       
	//*  16   25:icmpne          36
	//*  17   28:iload           6
	//*  18   30:iconst_m1       
	//*  19   31:icmpne          36
			return list;
	//   20   34:aload_1         
	//   21   35:areturn         
		int k = l * i;
	//   22   36:iload           6
	//   23   38:iload_3         
	//   24   39:imul            
	//   25   40:istore          5
		int j = k + l;
	//   26   42:iload           5
	//   27   44:iload           6
	//   28   46:iadd            
	//   29   47:istore          4
		if(i < 0 || l < 1 || k >= list.size())
	//*  30   49:iload_3         
	//*  31   50:iflt            70
	//*  32   53:iload           6
	//*  33   55:iconst_1        
	//*  34   56:icmplt          70
	//*  35   59:iload           5
	//*  36   61:aload_1         
	//*  37   62:invokeinterface #216 <Method int List.size()>
	//*  38   67:icmplt          74
			return Collections.EMPTY_LIST;
	//   39   70:getstatic       #222 <Field List Collections.EMPTY_LIST>
	//   40   73:areturn         
		i = j;
	//   41   74:iload           4
	//   42   76:istore_3        
		if(j > list.size())
	//*  43   77:iload           4
	//*  44   79:aload_1         
	//*  45   80:invokeinterface #216 <Method int List.size()>
	//*  46   85:icmple          95
			i = list.size();
	//   47   88:aload_1         
	//   48   89:invokeinterface #216 <Method int List.size()>
	//   49   94:istore_3        
		return list.subList(k, i);
	//   50   95:aload_1         
	//   51   96:iload           5
	//   52   98:iload_3         
	//   53   99:invokeinterface #226 <Method List List.subList(int, int)>
	//   54  104:areturn         
	}

	public void dump(FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
	//    0    0:return          
	}

	public final Bundle getBrowserRootHints()
	{
		return mImpl.getBrowserRootHints();
	//    0    0:aload_0         
	//    1    1:getfield        #234 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
	//    2    4:invokeinterface #236 <Method Bundle MediaBrowserServiceCompat$MediaBrowserServiceImpl.getBrowserRootHints()>
	//    3    9:areturn         
	}

	public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken()
	{
		return mSession;
	//    0    0:aload_0         
	//    1    1:getfield        #241 <Field android.support.v4.media.session.MediaSessionCompat$Token mSession>
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
	//    5    7:invokevirtual   #247 <Method PackageManager getPackageManager()>
	//    6   10:iload_2         
	//    7   11:invokevirtual   #253 <Method String[] PackageManager.getPackagesForUid(int)>
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
	//*  21   32:invokevirtual   #258 <Method boolean String.equals(Object)>
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
	//    2    4:new             #263 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #265 <String "parentId cannot be null in notifyChildrenChanged">
	//    5   11:invokespecial   #267 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		} else
		{
			mImpl.notifyChildrenChanged(s, ((Bundle) (null)));
	//    7   15:aload_0         
	//    8   16:getfield        #234 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
	//    9   19:aload_1         
	//   10   20:aconst_null     
	//   11   21:invokeinterface #270 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImpl.notifyChildrenChanged(String, Bundle)>
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
	//    2    4:new             #263 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #265 <String "parentId cannot be null in notifyChildrenChanged">
	//    5   11:invokespecial   #267 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(bundle == null)
	//*   7   15:aload_2         
	//*   8   16:ifnonnull       30
		{
			throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
	//    9   19:new             #263 <Class IllegalArgumentException>
	//   10   22:dup             
	//   11   23:ldc2            #273 <String "options cannot be null in notifyChildrenChanged">
	//   12   26:invokespecial   #267 <Method void IllegalArgumentException(String)>
	//   13   29:athrow          
		} else
		{
			mImpl.notifyChildrenChanged(s, bundle);
	//   14   30:aload_0         
	//   15   31:getfield        #234 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
	//   16   34:aload_1         
	//   17   35:aload_2         
	//   18   36:invokeinterface #270 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImpl.notifyChildrenChanged(String, Bundle)>
			return;
	//   19   41:return          
		}
	}

	public IBinder onBind(Intent intent)
	{
		return mImpl.onBind(intent);
	//    0    0:aload_0         
	//    1    1:getfield        #234 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
	//    2    4:aload_1         
	//    3    5:invokeinterface #277 <Method IBinder MediaBrowserServiceCompat$MediaBrowserServiceImpl.onBind(Intent)>
	//    4   10:areturn         
	}

	public void onCreate()
	{
		super.onCreate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #280 <Method void Service.onCreate()>
		if(android.os.Build.VERSION.SDK_INT >= 26 || BuildCompat.isAtLeastO())
	//*   2    4:getstatic       #285 <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          26
	//*   4    9:icmpge          18
	//*   5   12:invokestatic    #290 <Method boolean BuildCompat.isAtLeastO()>
	//*   6   15:ifeq            33
			mImpl = ((MediaBrowserServiceImpl) (new MediaBrowserServiceImplApi24()));
	//    7   18:aload_0         
	//    8   19:new             #33  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplApi24>
	//    9   22:dup             
	//   10   23:aload_0         
	//   11   24:invokespecial   #291 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi24(MediaBrowserServiceCompat)>
	//   12   27:putfield        #234 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
		else
	//*  13   30:goto            91
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  14   33:getstatic       #285 <Field int android.os.Build$VERSION.SDK_INT>
	//*  15   36:bipush          23
	//*  16   38:icmplt          56
			mImpl = ((MediaBrowserServiceImpl) (new MediaBrowserServiceImplApi23()));
	//   17   41:aload_0         
	//   18   42:new             #28  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplApi23>
	//   19   45:dup             
	//   20   46:aload_0         
	//   21   47:invokespecial   #292 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi23(MediaBrowserServiceCompat)>
	//   22   50:putfield        #234 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
		else
	//*  23   53:goto            91
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  24   56:getstatic       #285 <Field int android.os.Build$VERSION.SDK_INT>
	//*  25   59:bipush          21
	//*  26   61:icmplt          79
			mImpl = ((MediaBrowserServiceImpl) (new MediaBrowserServiceImplApi21()));
	//   27   64:aload_0         
	//   28   65:new             #21  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21>
	//   29   68:dup             
	//   30   69:aload_0         
	//   31   70:invokespecial   #293 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi21(MediaBrowserServiceCompat)>
	//   32   73:putfield        #234 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
		else
	//*  33   76:goto            91
			mImpl = ((MediaBrowserServiceImpl) (new MediaBrowserServiceImplBase()));
	//   34   79:aload_0         
	//   35   80:new             #38  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplBase>
	//   36   83:dup             
	//   37   84:aload_0         
	//   38   85:invokespecial   #294 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplBase(MediaBrowserServiceCompat)>
	//   39   88:putfield        #234 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
		mImpl.onCreate();
	//   40   91:aload_0         
	//   41   92:getfield        #234 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
	//   42   95:invokeinterface #295 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImpl.onCreate()>
	//   43  100:return          
	}

	public abstract BrowserRoot onGetRoot(String s, int i, Bundle bundle);

	public abstract void onLoadChildren(String s, Result result);

	public void onLoadChildren(String s, Result result, Bundle bundle)
	{
		result.setFlags(1);
	//    0    0:aload_2         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #304 <Method void MediaBrowserServiceCompat$Result.setFlags(int)>
		onLoadChildren(s, result);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #306 <Method void onLoadChildren(String, MediaBrowserServiceCompat$Result)>
	//    7   11:return          
	}

	public void onLoadItem(String s, Result result)
	{
		result.setFlags(2);
	//    0    0:aload_2         
	//    1    1:iconst_2        
	//    2    2:invokevirtual   #304 <Method void MediaBrowserServiceCompat$Result.setFlags(int)>
		result.sendResult(((Object) (null)));
	//    3    5:aload_2         
	//    4    6:aconst_null     
	//    5    7:invokevirtual   #312 <Method void MediaBrowserServiceCompat$Result.sendResult(Object)>
	//    6   10:return          
	}

	public void onSearch(String s, Bundle bundle, Result result)
	{
		result.setFlags(4);
	//    0    0:aload_3         
	//    1    1:iconst_4        
	//    2    2:invokevirtual   #304 <Method void MediaBrowserServiceCompat$Result.setFlags(int)>
		result.sendResult(((Object) (null)));
	//    3    5:aload_3         
	//    4    6:aconst_null     
	//    5    7:invokevirtual   #312 <Method void MediaBrowserServiceCompat$Result.sendResult(Object)>
	//    6   10:return          
	}

	void performLoadChildren(final String final_obj, final ConnectionRecord connection, Bundle bundle)
	{
		Result result = new Result(bundle) {

			volatile void onResultSent(Object obj, int i)
			{
				onResultSent((List)obj, i);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #36  <Class List>
			//    3    5:iload_2         
			//    4    6:invokevirtual   #39  <Method void onResultSent(List, int)>
			//    5    9:return          
			}

			void onResultSent(List list, int i)
			{
				if(mConnections.get(((Object) (connection.callbacks.asBinder()))) != connection)
			//*   0    0:aload_0         
			//*   1    1:getfield        #22  <Field MediaBrowserServiceCompat this$0>
			//*   2    4:getfield        #45  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
			//*   3    7:aload_0         
			//*   4    8:getfield        #24  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
			//*   5   11:getfield        #51  <Field MediaBrowserServiceCompat$ServiceCallbacks MediaBrowserServiceCompat$ConnectionRecord.callbacks>
			//*   6   14:invokeinterface #57  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
			//*   7   19:invokevirtual   #63  <Method Object ArrayMap.get(Object)>
			//*   8   22:aload_0         
			//*   9   23:getfield        #24  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
			//*  10   26:if_acmpeq       79
				{
					if(MediaBrowserServiceCompat.DEBUG)
			//*  11   29:getstatic       #67  <Field boolean MediaBrowserServiceCompat.DEBUG>
			//*  12   32:ifeq            78
						Log.d("MBServiceCompat", (new StringBuilder()).append("Not sending onLoadChildren result for connection that has been disconnected. pkg=").append(connection.pkg).append(" id=").append(parentId).toString());
			//   13   35:ldc1            #69  <String "MBServiceCompat">
			//   14   37:new             #71  <Class StringBuilder>
			//   15   40:dup             
			//   16   41:invokespecial   #74  <Method void StringBuilder()>
			//   17   44:ldc1            #76  <String "Not sending onLoadChildren result for connection that has been disconnected. pkg=">
			//   18   46:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
			//   19   49:aload_0         
			//   20   50:getfield        #24  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
			//   21   53:getfield        #83  <Field String MediaBrowserServiceCompat$ConnectionRecord.pkg>
			//   22   56:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
			//   23   59:ldc1            #85  <String " id=">
			//   24   61:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
			//   25   64:aload_0         
			//   26   65:getfield        #26  <Field String val$parentId>
			//   27   68:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
			//   28   71:invokevirtual   #89  <Method String StringBuilder.toString()>
			//   29   74:invokestatic    #95  <Method int Log.d(String, String)>
			//   30   77:pop             
					return;
			//   31   78:return          
				}
				if((i & 1) != 0)
			//*  32   79:iload_2         
			//*  33   80:iconst_1        
			//*  34   81:iand            
			//*  35   82:ifeq            101
					list = applyOptions(list, options);
			//   36   85:aload_0         
			//   37   86:getfield        #22  <Field MediaBrowserServiceCompat this$0>
			//   38   89:aload_1         
			//   39   90:aload_0         
			//   40   91:getfield        #28  <Field Bundle val$options>
			//   41   94:invokevirtual   #99  <Method List MediaBrowserServiceCompat.applyOptions(List, Bundle)>
			//   42   97:astore_1        
			//*  43   98:goto            101
				try
				{
					connection.callbacks.onLoadChildren(parentId, list, options);
			//   44  101:aload_0         
			//   45  102:getfield        #24  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
			//   46  105:getfield        #51  <Field MediaBrowserServiceCompat$ServiceCallbacks MediaBrowserServiceCompat$ConnectionRecord.callbacks>
			//   47  108:aload_0         
			//   48  109:getfield        #26  <Field String val$parentId>
			//   49  112:aload_1         
			//   50  113:aload_0         
			//   51  114:getfield        #28  <Field Bundle val$options>
			//   52  117:invokeinterface #103 <Method void MediaBrowserServiceCompat$ServiceCallbacks.onLoadChildren(String, List, Bundle)>
					return;
			//   53  122:return          
				}
				// Misplaced declaration of an exception variable
				catch(List list)
			//*  54  123:astore_1        
				{
					Log.w("MBServiceCompat", (new StringBuilder()).append("Calling onLoadChildren() failed for id=").append(parentId).append(" package=").append(connection.pkg).toString());
			//   55  124:ldc1            #69  <String "MBServiceCompat">
			//   56  126:new             #71  <Class StringBuilder>
			//   57  129:dup             
			//   58  130:invokespecial   #74  <Method void StringBuilder()>
			//   59  133:ldc1            #105 <String "Calling onLoadChildren() failed for id=">
			//   60  135:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
			//   61  138:aload_0         
			//   62  139:getfield        #26  <Field String val$parentId>
			//   63  142:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
			//   64  145:ldc1            #107 <String " package=">
			//   65  147:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
			//   66  150:aload_0         
			//   67  151:getfield        #24  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
			//   68  154:getfield        #83  <Field String MediaBrowserServiceCompat$ConnectionRecord.pkg>
			//   69  157:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
			//   70  160:invokevirtual   #89  <Method String StringBuilder.toString()>
			//   71  163:invokestatic    #110 <Method int Log.w(String, String)>
			//   72  166:pop             
				}
			//   73  167:return          
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
	//    7    9:invokespecial   #319 <Method void MediaBrowserServiceCompat$1(MediaBrowserServiceCompat, Object, MediaBrowserServiceCompat$ConnectionRecord, String, Bundle)>
	//    8   12:astore          4
		mCurConnection = connection;
	//    9   14:aload_0         
	//   10   15:aload_2         
	//   11   16:putfield        #321 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		if(bundle == null)
	//*  12   19:aload_3         
	//*  13   20:ifnonnull       33
			onLoadChildren(final_obj, ((Result) (result)));
	//   14   23:aload_0         
	//   15   24:aload_1         
	//   16   25:aload           4
	//   17   27:invokevirtual   #306 <Method void onLoadChildren(String, MediaBrowserServiceCompat$Result)>
		else
	//*  18   30:goto            41
			onLoadChildren(final_obj, ((Result) (result)), bundle);
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:aload           4
	//   22   37:aload_3         
	//   23   38:invokevirtual   #323 <Method void onLoadChildren(String, MediaBrowserServiceCompat$Result, Bundle)>
		mCurConnection = null;
	//   24   41:aload_0         
	//   25   42:aconst_null     
	//   26   43:putfield        #321 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		if(!((Result) (result)).isDone())
	//*  27   46:aload           4
	//*  28   48:invokevirtual   #326 <Method boolean MediaBrowserServiceCompat$Result.isDone()>
	//*  29   51:ifne            95
			throw new IllegalStateException((new StringBuilder()).append("onLoadChildren must call detach() or sendResult() before returning for package=").append(connection.pkg).append(" id=").append(final_obj).toString());
	//   30   54:new             #328 <Class IllegalStateException>
	//   31   57:dup             
	//   32   58:new             #330 <Class StringBuilder>
	//   33   61:dup             
	//   34   62:invokespecial   #331 <Method void StringBuilder()>
	//   35   65:ldc2            #333 <String "onLoadChildren must call detach() or sendResult() before returning for package=">
	//   36   68:invokevirtual   #337 <Method StringBuilder StringBuilder.append(String)>
	//   37   71:aload_2         
	//   38   72:getfield        #340 <Field String MediaBrowserServiceCompat$ConnectionRecord.pkg>
	//   39   75:invokevirtual   #337 <Method StringBuilder StringBuilder.append(String)>
	//   40   78:ldc2            #342 <String " id=">
	//   41   81:invokevirtual   #337 <Method StringBuilder StringBuilder.append(String)>
	//   42   84:aload_1         
	//   43   85:invokevirtual   #337 <Method StringBuilder StringBuilder.append(String)>
	//   44   88:invokevirtual   #346 <Method String StringBuilder.toString()>
	//   45   91:invokespecial   #347 <Method void IllegalStateException(String)>
	//   46   94:athrow          
		else
			return;
	//   47   95:return          
	}

	void performLoadItem(final String final_obj, ConnectionRecord connectionrecord, ResultReceiver resultreceiver)
	{
		resultreceiver = ((ResultReceiver) (new Result(resultreceiver) {

			void onResultSent(MediaBrowserCompat.MediaItem mediaitem, int i)
			{
				if((i & 2) != 0)
			//*   0    0:iload_2         
			//*   1    1:iconst_2        
			//*   2    2:iand            
			//*   3    3:ifeq            16
				{
					receiver.send(-1, ((Bundle) (null)));
			//    4    6:aload_0         
			//    5    7:getfield        #20  <Field ResultReceiver val$receiver>
			//    6   10:iconst_m1       
			//    7   11:aconst_null     
			//    8   12:invokevirtual   #32  <Method void ResultReceiver.send(int, Bundle)>
					return;
			//    9   15:return          
				} else
				{
					Bundle bundle = new Bundle();
			//   10   16:new             #34  <Class Bundle>
			//   11   19:dup             
			//   12   20:invokespecial   #37  <Method void Bundle()>
			//   13   23:astore_3        
					bundle.putParcelable("media_item", ((android.os.Parcelable) (mediaitem)));
			//   14   24:aload_3         
			//   15   25:ldc1            #39  <String "media_item">
			//   16   27:aload_1         
			//   17   28:invokevirtual   #43  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
					receiver.send(0, bundle);
			//   18   31:aload_0         
			//   19   32:getfield        #20  <Field ResultReceiver val$receiver>
			//   20   35:iconst_0        
			//   21   36:aload_3         
			//   22   37:invokevirtual   #32  <Method void ResultReceiver.send(int, Bundle)>
					return;
			//   23   40:return          
				}
			}

			volatile void onResultSent(Object obj, int i)
			{
				onResultSent((MediaBrowserCompat.MediaItem)obj, i);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #46  <Class MediaBrowserCompat$MediaItem>
			//    3    5:iload_2         
			//    4    6:invokevirtual   #48  <Method void onResultSent(MediaBrowserCompat$MediaItem, int)>
			//    5    9:return          
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
	//    5    7:invokespecial   #352 <Method void MediaBrowserServiceCompat$2(MediaBrowserServiceCompat, Object, ResultReceiver)>
	//    6   10:astore_3        
		mCurConnection = connectionrecord;
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:putfield        #321 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		onLoadItem(final_obj, ((Result) (resultreceiver)));
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:aload_3         
	//   13   19:invokevirtual   #354 <Method void onLoadItem(String, MediaBrowserServiceCompat$Result)>
		mCurConnection = null;
	//   14   22:aload_0         
	//   15   23:aconst_null     
	//   16   24:putfield        #321 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		if(!((Result) (resultreceiver)).isDone())
	//*  17   27:aload_3         
	//*  18   28:invokevirtual   #326 <Method boolean MediaBrowserServiceCompat$Result.isDone()>
	//*  19   31:ifne            62
			throw new IllegalStateException((new StringBuilder()).append("onLoadItem must call detach() or sendResult() before returning for id=").append(final_obj).toString());
	//   20   34:new             #328 <Class IllegalStateException>
	//   21   37:dup             
	//   22   38:new             #330 <Class StringBuilder>
	//   23   41:dup             
	//   24   42:invokespecial   #331 <Method void StringBuilder()>
	//   25   45:ldc2            #356 <String "onLoadItem must call detach() or sendResult() before returning for id=">
	//   26   48:invokevirtual   #337 <Method StringBuilder StringBuilder.append(String)>
	//   27   51:aload_1         
	//   28   52:invokevirtual   #337 <Method StringBuilder StringBuilder.append(String)>
	//   29   55:invokevirtual   #346 <Method String StringBuilder.toString()>
	//   30   58:invokespecial   #347 <Method void IllegalStateException(String)>
	//   31   61:athrow          
		else
			return;
	//   32   62:return          
	}

	void performSearch(final String final_obj, Bundle bundle, ConnectionRecord connectionrecord, ResultReceiver resultreceiver)
	{
		resultreceiver = ((ResultReceiver) (new Result(resultreceiver) {

			volatile void onResultSent(Object obj, int i)
			{
				onResultSent((List)obj, i);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #28  <Class List>
			//    3    5:iload_2         
			//    4    6:invokevirtual   #31  <Method void onResultSent(List, int)>
			//    5    9:return          
			}

			void onResultSent(List list, int i)
			{
				if((i & 4) != 0 || list == null)
			//*   0    0:iload_2         
			//*   1    1:iconst_4        
			//*   2    2:iand            
			//*   3    3:ifne            10
			//*   4    6:aload_1         
			//*   5    7:ifnonnull       20
				{
					receiver.send(-1, ((Bundle) (null)));
			//    6   10:aload_0         
			//    7   11:getfield        #20  <Field ResultReceiver val$receiver>
			//    8   14:iconst_m1       
			//    9   15:aconst_null     
			//   10   16:invokevirtual   #37  <Method void ResultReceiver.send(int, Bundle)>
					return;
			//   11   19:return          
				} else
				{
					Bundle bundle1 = new Bundle();
			//   12   20:new             #39  <Class Bundle>
			//   13   23:dup             
			//   14   24:invokespecial   #42  <Method void Bundle()>
			//   15   27:astore_3        
					bundle1.putParcelableArray("search_results", (android.os.Parcelable[])list.toArray(((Object []) (new MediaBrowserCompat.MediaItem[0]))));
			//   16   28:aload_3         
			//   17   29:ldc1            #44  <String "search_results">
			//   18   31:aload_1         
			//   19   32:iconst_0        
			//   20   33:anewarray       MediaBrowserCompat.MediaItem[]
			//   21   36:invokeinterface #50  <Method Object[] List.toArray(Object[])>
			//   22   41:checkcast       #52  <Class android.os.Parcelable[]>
			//   23   44:invokevirtual   #56  <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
					receiver.send(0, bundle1);
			//   24   47:aload_0         
			//   25   48:getfield        #20  <Field ResultReceiver val$receiver>
			//   26   51:iconst_0        
			//   27   52:aload_3         
			//   28   53:invokevirtual   #37  <Method void ResultReceiver.send(int, Bundle)>
					return;
			//   29   56:return          
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
	//    5    8:invokespecial   #359 <Method void MediaBrowserServiceCompat$3(MediaBrowserServiceCompat, Object, ResultReceiver)>
	//    6   11:astore          4
		mCurConnection = connectionrecord;
	//    7   13:aload_0         
	//    8   14:aload_3         
	//    9   15:putfield        #321 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		onSearch(final_obj, bundle, ((Result) (resultreceiver)));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:aload           4
	//   14   23:invokevirtual   #361 <Method void onSearch(String, Bundle, MediaBrowserServiceCompat$Result)>
		mCurConnection = null;
	//   15   26:aload_0         
	//   16   27:aconst_null     
	//   17   28:putfield        #321 <Field MediaBrowserServiceCompat$ConnectionRecord mCurConnection>
		if(!((Result) (resultreceiver)).isDone())
	//*  18   31:aload           4
	//*  19   33:invokevirtual   #326 <Method boolean MediaBrowserServiceCompat$Result.isDone()>
	//*  20   36:ifne            67
			throw new IllegalStateException((new StringBuilder()).append("onSearch must call detach() or sendResult() before returning for query=").append(final_obj).toString());
	//   21   39:new             #328 <Class IllegalStateException>
	//   22   42:dup             
	//   23   43:new             #330 <Class StringBuilder>
	//   24   46:dup             
	//   25   47:invokespecial   #331 <Method void StringBuilder()>
	//   26   50:ldc2            #363 <String "onSearch must call detach() or sendResult() before returning for query=">
	//   27   53:invokevirtual   #337 <Method StringBuilder StringBuilder.append(String)>
	//   28   56:aload_1         
	//   29   57:invokevirtual   #337 <Method StringBuilder StringBuilder.append(String)>
	//   30   60:invokevirtual   #346 <Method String StringBuilder.toString()>
	//   31   63:invokespecial   #347 <Method void IllegalStateException(String)>
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
	//    3    5:getfield        #145 <Field HashMap MediaBrowserServiceCompat$ConnectionRecord.subscriptions>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #368 <Method Object HashMap.remove(Object)>
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
	//   16   26:getfield        #145 <Field HashMap MediaBrowserServiceCompat$ConnectionRecord.subscriptions>
	//   17   29:aload_1         
	//   18   30:invokevirtual   #151 <Method Object HashMap.get(Object)>
	//   19   33:checkcast       #153 <Class List>
	//   20   36:astore          6
		if(list != null)
	//*  21   38:aload           6
	//*  22   40:ifnull          119
		{
			Iterator iterator = list.iterator();
	//   23   43:aload           6
	//   24   45:invokeinterface #160 <Method Iterator List.iterator()>
	//   25   50:astore          7
			do
			{
				if(!iterator.hasNext())
					break;
	//   26   52:aload           7
	//   27   54:invokeinterface #166 <Method boolean Iterator.hasNext()>
	//   28   59:ifeq            92
				if(ibinder == ((Pair)iterator.next()).first)
	//*  29   62:aload_3         
	//*  30   63:aload           7
	//*  31   65:invokeinterface #170 <Method Object Iterator.next()>
	//*  32   70:checkcast       #172 <Class Pair>
	//*  33   73:getfield        #176 <Field Object Pair.first>
	//*  34   76:if_acmpne       52
				{
					flag = true;
	//   35   79:iconst_1        
	//   36   80:istore          4
					iterator.remove();
	//   37   82:aload           7
	//   38   84:invokeinterface #370 <Method void Iterator.remove()>
				}
			} while(true);
	//   39   89:goto            52
			flag1 = flag;
	//   40   92:iload           4
	//   41   94:istore          5
			if(list.size() == 0)
	//*  42   96:aload           6
	//*  43   98:invokeinterface #216 <Method int List.size()>
	//*  44  103:ifne            119
			{
				connectionrecord.subscriptions.remove(((Object) (s)));
	//   45  106:aload_2         
	//   46  107:getfield        #145 <Field HashMap MediaBrowserServiceCompat$ConnectionRecord.subscriptions>
	//   47  110:aload_1         
	//   48  111:invokevirtual   #368 <Method Object HashMap.remove(Object)>
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
	//    2    4:new             #263 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #374 <String "Session token may not be null.">
	//    5   11:invokespecial   #267 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(mSession != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #241 <Field android.support.v4.media.session.MediaSessionCompat$Token mSession>
	//*   9   19:ifnull          33
		{
			throw new IllegalStateException("The session token has already been set.");
	//   10   22:new             #328 <Class IllegalStateException>
	//   11   25:dup             
	//   12   26:ldc2            #376 <String "The session token has already been set.">
	//   13   29:invokespecial   #347 <Method void IllegalStateException(String)>
	//   14   32:athrow          
		} else
		{
			mSession = token;
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:putfield        #241 <Field android.support.v4.media.session.MediaSessionCompat$Token mSession>
			mImpl.setSessionToken(token);
	//   18   38:aload_0         
	//   19   39:getfield        #234 <Field MediaBrowserServiceCompat$MediaBrowserServiceImpl mImpl>
	//   20   42:aload_1         
	//   21   43:invokeinterface #378 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImpl.setSessionToken(android.support.v4.media.session.MediaSessionCompat$Token)>
			return;
	//   22   48:return          
		}
	}

	static final boolean DEBUG = Log.isLoggable("MBServiceCompat", 3);
	public static final String KEY_MEDIA_ITEM = "media_item";
	public static final String KEY_SEARCH_RESULTS = "search_results";
	static final int RESULT_ERROR = -1;
	static final int RESULT_FLAG_ON_LOAD_ITEM_NOT_IMPLEMENTED = 2;
	static final int RESULT_FLAG_ON_SEARCH_NOT_IMPLEMENTED = 4;
	static final int RESULT_FLAG_OPTION_NOT_HANDLED = 1;
	static final int RESULT_OK = 0;
	public static final String SERVICE_INTERFACE = "android.media.browse.MediaBrowserService";
	static final String TAG = "MBServiceCompat";
	final ArrayMap mConnections = new ArrayMap();
	ConnectionRecord mCurConnection;
	final ServiceHandler mHandler = new ServiceHandler();
	private MediaBrowserServiceImpl mImpl;
	android.support.v4.media.session.MediaSessionCompat.Token mSession;

	static 
	{
	//    0    0:ldc1            #104 <String "MBServiceCompat">
	//    1    2:iconst_3        
	//    2    3:invokestatic    #123 <Method boolean Log.isLoggable(String, int)>
	//    3    6:putstatic       #125 <Field boolean DEBUG>
	//*   4    9:return          
	}
}
