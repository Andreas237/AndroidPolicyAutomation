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
//			MediaBrowserServiceCompat, MediaBrowserServiceCompatApi21, MediaBrowserCompatUtils

class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21
	implements MediaBrowserServiceCompat.MediaBrowserServiceImpl, MediaBrowserServiceCompatApi21.ServiceCompatProxy
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

	void notifyChildrenChangedForCompat(final String parentId, final Bundle options)
	{
		mHandler.post(new Runnable() {

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
					obj = ((Object) ((MediaBrowserServiceCompat.ConnectionRecord)mConnections.get(obj)));
			//   14   38:aload_0         
			//   15   39:getfield        #24  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
			//   16   42:getfield        #37  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$MediaBrowserServiceImplApi21.this$0>
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
			mMessenger = new Messenger(((android.os.Handler) (mHandler)));
	//   10   20:aload_0         
	//   11   21:new             #122 <Class Messenger>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:getfield        #33  <Field MediaBrowserServiceCompat this$0>
	//   15   29:getfield        #80  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
	//   16   32:invokespecial   #125 <Method void Messenger(android.os.Handler)>
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
			s = ((String) (((MediaBrowserServiceCompat.BrowserRoot) (bundle)).getExtras()));
	//   79  171:aload_3         
	//   80  172:invokevirtual   #175 <Method Bundle MediaBrowserServiceCompat$BrowserRoot.getExtras()>
	//   81  175:astore_1        
		} else
	//*  82  176:goto            201
		{
			s = ((String) (obj));
	//   83  179:aload           4
	//   84  181:astore_1        
			if(((MediaBrowserServiceCompat.BrowserRoot) (bundle)).getExtras() != null)
	//*  85  182:aload_3         
	//*  86  183:invokevirtual   #175 <Method Bundle MediaBrowserServiceCompat$BrowserRoot.getExtras()>
	//*  87  186:ifnull          201
			{
				((Bundle) (obj)).putAll(((MediaBrowserServiceCompat.BrowserRoot) (bundle)).getExtras());
	//   88  189:aload           4
	//   89  191:aload_3         
	//   90  192:invokevirtual   #175 <Method Bundle MediaBrowserServiceCompat$BrowserRoot.getExtras()>
	//   91  195:invokevirtual   #178 <Method void Bundle.putAll(Bundle)>
				s = ((String) (obj));
	//   92  198:aload           4
	//   93  200:astore_1        
			}
		}
		return new MediaBrowserServiceCompatApi21.BrowserRoot(((MediaBrowserServiceCompat.BrowserRoot) (bundle)).getRootId(), ((Bundle) (s)));
	//   94  201:new             #180 <Class MediaBrowserServiceCompatApi21$BrowserRoot>
	//   95  204:dup             
	//   96  205:aload_3         
	//   97  206:invokevirtual   #184 <Method String MediaBrowserServiceCompat$BrowserRoot.getRootId()>
	//   98  209:aload_1         
	//   99  210:invokespecial   #186 <Method void MediaBrowserServiceCompatApi21$BrowserRoot(String, Bundle)>
	//  100  213:areturn         
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
	//    5    7:invokespecial   #191 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$2(MediaBrowserServiceCompat$MediaBrowserServiceImplApi21, Object, MediaBrowserServiceCompatApi21$ResultWrapper)>
	//    6   10:astore_2        
		MediaBrowserServiceCompat.this.onLoadChildren(final_obj, ((MediaBrowserServiceCompat.Result) (resultwrapper)));
	//    7   11:aload_0         
	//    8   12:getfield        #33  <Field MediaBrowserServiceCompat this$0>
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokevirtual   #194 <Method void MediaBrowserServiceCompat.onLoadChildren(String, MediaBrowserServiceCompat$Result)>
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

	MediaBrowserServiceCompat$MediaBrowserServiceImplApi21()
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
