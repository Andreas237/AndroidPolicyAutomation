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

	public void notifyChildrenChanged(final String parentId, final Bundle options)
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
				mMessenger = new Messenger(((android.os.Handler) (mHandler)));
	//   16   31:aload_0         
	//   17   32:new             #116 <Class Messenger>
	//   18   35:dup             
	//   19   36:aload_0         
	//   20   37:getfield        #33  <Field MediaBrowserServiceCompat this$0>
	//   21   40:getfield        #81  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
	//   22   43:invokespecial   #119 <Method void Messenger(android.os.Handler)>
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
		s = ((String) (((MediaBrowserServiceCompat.BrowserRoot) (bundle)).getExtras()));
	//   82  176:aload_3         
	//   83  177:invokevirtual   #169 <Method Bundle MediaBrowserServiceCompat$BrowserRoot.getExtras()>
	//   84  180:astore_1        
_L4:
		return new MediaBrowserServiceCompatApi21.BrowserRoot(((MediaBrowserServiceCompat.BrowserRoot) (bundle)).getRootId(), ((Bundle) (s)));
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
		if(((MediaBrowserServiceCompat.BrowserRoot) (bundle)).getExtras() != null)
	//*  94  197:aload_3         
	//*  95  198:invokevirtual   #169 <Method Bundle MediaBrowserServiceCompat$BrowserRoot.getExtras()>
	//*  96  201:ifnull          181
		{
			((Bundle) (obj)).putAll(((MediaBrowserServiceCompat.BrowserRoot) (bundle)).getExtras());
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
	//    0    0:new             #17  <Class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$3>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #185 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$3(MediaBrowserServiceCompat$MediaBrowserServiceImplApi21, Object, MediaBrowserServiceCompatApi21$ResultWrapper)>
	//    6   10:astore_2        
		MediaBrowserServiceCompat.this.onLoadChildren(final_obj, ((MediaBrowserServiceCompat.Result) (resultwrapper)));
	//    7   11:aload_0         
	//    8   12:getfield        #33  <Field MediaBrowserServiceCompat this$0>
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokevirtual   #188 <Method void MediaBrowserServiceCompat.onLoadChildren(String, MediaBrowserServiceCompat$Result)>
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
