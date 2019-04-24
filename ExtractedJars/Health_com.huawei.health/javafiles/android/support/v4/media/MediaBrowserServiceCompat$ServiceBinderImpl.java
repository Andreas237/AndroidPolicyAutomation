// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.*;
import android.support.v4.os.ResultReceiver;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$ServiceBinderImpl
{

	public void addSubscription(final String id, final IBinder token, final Bundle options, final MediaBrowserServiceCompat.ServiceCallbacks callbacks)
	{
		mHandler.postOrRun(new Runnable() {

			public void run()
			{
				Object obj = ((Object) (callbacks.asBinder()));
			//    0    0:aload_0         
			//    1    1:getfield        #30  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
			//    2    4:invokeinterface #47  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
			//    3    9:astore_1        
				obj = ((Object) ((MediaBrowserServiceCompat.ConnectionRecord)mConnections.get(obj)));
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
					addSubscription(id, ((MediaBrowserServiceCompat.ConnectionRecord) (obj)), token, options);
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

			final MediaBrowserServiceCompat.ServiceBinderImpl this$1;
			final MediaBrowserServiceCompat.ServiceCallbacks val$callbacks;
			final String val$id;
			final Bundle val$options;
			final IBinder val$token;

			
			{
				this$1 = MediaBrowserServiceCompat.ServiceBinderImpl.this;
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
				options = bundle;
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

	public void connect(final String pkg, final int uid, final Bundle rootHints, final MediaBrowserServiceCompat.ServiceCallbacks callbacks)
	{
		if(!isValidPackage(pkg, uid))
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field MediaBrowserServiceCompat this$0>
	//*   2    4:aload_1         
	//*   3    5:iload_2         
	//*   4    6:invokevirtual   #54  <Method boolean MediaBrowserServiceCompat.isValidPackage(String, int)>
	//*   5    9:ifne            48
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Package/uid mismatch: uid=").append(uid).append(" package=").append(pkg).toString());
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
			mHandler.postOrRun(new Runnable() {

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
					MediaBrowserServiceCompat.ConnectionRecord connectionrecord = new MediaBrowserServiceCompat.ConnectionRecord(this$0);
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

				final MediaBrowserServiceCompat.ServiceBinderImpl this$1;
				final MediaBrowserServiceCompat.ServiceCallbacks val$callbacks;
				final String val$pkg;
				final Bundle val$rootHints;
				final int val$uid;

			
			{
				this$1 = MediaBrowserServiceCompat.ServiceBinderImpl.this;
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
				uid = i;
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

	public void disconnect(final MediaBrowserServiceCompat.ServiceCallbacks callbacks)
	{
		mHandler.postOrRun(new Runnable() {

			public void run()
			{
				Object obj = ((Object) (callbacks.asBinder()));
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
			//    2    4:invokeinterface #35  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
			//    3    9:astore_1        
				obj = ((Object) ((MediaBrowserServiceCompat.ConnectionRecord)mConnections.remove(obj)));
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

			final MediaBrowserServiceCompat.ServiceBinderImpl this$1;
			final MediaBrowserServiceCompat.ServiceCallbacks val$callbacks;

			
			{
				this$1 = MediaBrowserServiceCompat.ServiceBinderImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				callbacks = servicecallbacks;
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

	public void getMediaItem(final String mediaId, final ResultReceiver receiver, final MediaBrowserServiceCompat.ServiceCallbacks callbacks)
	{
		if(TextUtils.isEmpty(((CharSequence) (mediaId))) || receiver == null)
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
			mHandler.postOrRun(new Runnable() {

				public void run()
				{
					Object obj = ((Object) (callbacks.asBinder()));
				//    0    0:aload_0         
				//    1    1:getfield        #28  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
				//    2    4:invokeinterface #43  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
				//    3    9:astore_1        
					obj = ((Object) ((MediaBrowserServiceCompat.ConnectionRecord)mConnections.get(obj)));
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
						performLoadItem(mediaId, ((MediaBrowserServiceCompat.ConnectionRecord) (obj)), receiver);
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

				final MediaBrowserServiceCompat.ServiceBinderImpl this$1;
				final MediaBrowserServiceCompat.ServiceCallbacks val$callbacks;
				final String val$mediaId;
				final ResultReceiver val$receiver;

			
			{
				this$1 = MediaBrowserServiceCompat.ServiceBinderImpl.this;
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
				receiver = resultreceiver;
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

	public void registerCallbacks(final MediaBrowserServiceCompat.ServiceCallbacks callbacks, final Bundle rootHints)
	{
		mHandler.postOrRun(new Runnable() {

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
				MediaBrowserServiceCompat.ConnectionRecord connectionrecord = new MediaBrowserServiceCompat.ConnectionRecord(this$0);
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

			final MediaBrowserServiceCompat.ServiceBinderImpl this$1;
			final MediaBrowserServiceCompat.ServiceCallbacks val$callbacks;
			final Bundle val$rootHints;

			
			{
				this$1 = MediaBrowserServiceCompat.ServiceBinderImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				callbacks = servicecallbacks;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
				rootHints = bundle;
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

	public void removeSubscription(final String id, final IBinder token, final MediaBrowserServiceCompat.ServiceCallbacks callbacks)
	{
		mHandler.postOrRun(new Runnable() {

			public void run()
			{
				Object obj = ((Object) (callbacks.asBinder()));
			//    0    0:aload_0         
			//    1    1:getfield        #28  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
			//    2    4:invokeinterface #43  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
			//    3    9:astore_1        
				obj = ((Object) ((MediaBrowserServiceCompat.ConnectionRecord)mConnections.get(obj)));
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
				if(!removeSubscription(id, ((MediaBrowserServiceCompat.ConnectionRecord) (obj)), token))
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

			final MediaBrowserServiceCompat.ServiceBinderImpl this$1;
			final MediaBrowserServiceCompat.ServiceCallbacks val$callbacks;
			final String val$id;
			final IBinder val$token;

			
			{
				this$1 = MediaBrowserServiceCompat.ServiceBinderImpl.this;
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
				token = ibinder;
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

	public void search(final String query, final Bundle extras, final ResultReceiver receiver, final MediaBrowserServiceCompat.ServiceCallbacks callbacks)
	{
		if(TextUtils.isEmpty(((CharSequence) (query))) || receiver == null)
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
			mHandler.postOrRun(new Runnable() {

				public void run()
				{
					Object obj = ((Object) (callbacks.asBinder()));
				//    0    0:aload_0         
				//    1    1:getfield        #30  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
				//    2    4:invokeinterface #47  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
				//    3    9:astore_1        
					obj = ((Object) ((MediaBrowserServiceCompat.ConnectionRecord)mConnections.get(obj)));
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
						performSearch(query, extras, ((MediaBrowserServiceCompat.ConnectionRecord) (obj)), receiver);
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

				final MediaBrowserServiceCompat.ServiceBinderImpl this$1;
				final MediaBrowserServiceCompat.ServiceCallbacks val$callbacks;
				final Bundle val$extras;
				final String val$query;
				final ResultReceiver val$receiver;

			
			{
				this$1 = MediaBrowserServiceCompat.ServiceBinderImpl.this;
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
				receiver = resultreceiver;
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

	public void unregisterCallbacks(final MediaBrowserServiceCompat.ServiceCallbacks callbacks)
	{
		mHandler.postOrRun(new Runnable() {

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

			final MediaBrowserServiceCompat.ServiceBinderImpl this$1;
			final MediaBrowserServiceCompat.ServiceCallbacks val$callbacks;

			
			{
				this$1 = MediaBrowserServiceCompat.ServiceBinderImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				callbacks = servicecallbacks;
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

	MediaBrowserServiceCompat$ServiceBinderImpl()
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
