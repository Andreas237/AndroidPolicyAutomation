// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.Intent;
import android.os.*;
import android.support.v4.app.BundleCompat;
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

	public void notifyChildrenChanged(final String parentId, final Bundle options)
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
				//*   9   25:ifeq            149
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
				//*  59  146:goto            19
				//   60  149:return          
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
				mMessenger = new Messenger(((android.os.Handler) (mHandler)));
	//   16   31:aload_0         
	//   17   32:new             #103 <Class Messenger>
	//   18   35:dup             
	//   19   36:aload_0         
	//   20   37:getfield        #25  <Field MediaBrowserServiceCompat this$0>
	//   21   40:getfield        #68  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
	//   22   43:invokespecial   #106 <Method void Messenger(android.os.Handler)>
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
			s = ((String) (((MediaBrowserServiceCompat.BrowserRoot) (bundle)).getExtras()));
	//   51  102:aload_3         
	//   52  103:invokevirtual   #133 <Method Bundle MediaBrowserServiceCompat$BrowserRoot.getExtras()>
	//   53  106:astore_1        
		} else
	//*  54  107:goto            132
		{
			s = ((String) (bundle1));
	//   55  110:aload           4
	//   56  112:astore_1        
			if(((MediaBrowserServiceCompat.BrowserRoot) (bundle)).getExtras() != null)
	//*  57  113:aload_3         
	//*  58  114:invokevirtual   #133 <Method Bundle MediaBrowserServiceCompat$BrowserRoot.getExtras()>
	//*  59  117:ifnull          132
			{
				bundle1.putAll(((MediaBrowserServiceCompat.BrowserRoot) (bundle)).getExtras());
	//   60  120:aload           4
	//   61  122:aload_3         
	//   62  123:invokevirtual   #133 <Method Bundle MediaBrowserServiceCompat$BrowserRoot.getExtras()>
	//   63  126:invokevirtual   #136 <Method void Bundle.putAll(Bundle)>
				s = ((String) (bundle1));
	//   64  129:aload           4
	//   65  131:astore_1        
			}
		}
		return new MediaBrowserServiceCompatApi21.BrowserRoot(((MediaBrowserServiceCompat.BrowserRoot) (bundle)).getRootId(), ((Bundle) (s)));
	//   66  132:new             #138 <Class MediaBrowserServiceCompatApi21$BrowserRoot>
	//   67  135:dup             
	//   68  136:aload_3         
	//   69  137:invokevirtual   #142 <Method String MediaBrowserServiceCompat$BrowserRoot.getRootId()>
	//   70  140:aload_1         
	//   71  141:invokespecial   #144 <Method void MediaBrowserServiceCompatApi21$BrowserRoot(String, Bundle)>
	//   72  144:areturn         
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
	//    5    7:invokespecial   #149 <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$2(MediaBrowserServiceCompat$MediaBrowserServiceImplApi21, Object, MediaBrowserServiceCompatApi21$ResultWrapper)>
	//    6   10:astore_2        
		MediaBrowserServiceCompat.this.onLoadChildren(final_obj, ((MediaBrowserServiceCompat.Result) (resultwrapper)));
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

	MediaBrowserServiceCompat$MediaBrowserServiceImplApi21()
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
