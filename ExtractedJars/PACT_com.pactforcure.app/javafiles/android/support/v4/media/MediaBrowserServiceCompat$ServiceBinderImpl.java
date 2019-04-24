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

private class MediaBrowserServiceCompat$ServiceBinderImpl
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

	public void connect(final String pkg, final int uid, final Bundle rootHints, final MediaBrowserServiceCompat.ServiceCallbacks callbacks)
	{
		if(!isValidPackage(pkg, uid))
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field MediaBrowserServiceCompat this$0>
	//*   2    4:aload_1         
	//*   3    5:iload_2         
	//*   4    6:invokevirtual   #56  <Method boolean MediaBrowserServiceCompat.isValidPackage(String, int)>
	//*   5    9:ifne            48
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Package/uid mismatch: uid=").append(uid).append(" package=").append(pkg).toString());
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
			mHandler.postOrRun(new Runnable() {

				public void run()
				{
					Object obj;
					MediaBrowserServiceCompat.ConnectionRecord connectionrecord;
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
					connectionrecord = new MediaBrowserServiceCompat.ConnectionRecord();
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

	public void disconnect(final MediaBrowserServiceCompat.ServiceCallbacks callbacks)
	{
		mHandler.postOrRun(new Runnable() {

			public void run()
			{
				IBinder ibinder = callbacks.asBinder();
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
			//    2    4:invokeinterface #35  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
			//    3    9:astore_1        
				if((MediaBrowserServiceCompat.ConnectionRecord)mConnections.remove(((Object) (ibinder))) == null);
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

	public void getMediaItem(final String mediaId, final ResultReceiver receiver, final MediaBrowserServiceCompat.ServiceCallbacks callbacks)
	{
		if(TextUtils.isEmpty(((CharSequence) (mediaId))) || receiver == null)
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
				MediaBrowserServiceCompat.ConnectionRecord connectionrecord = new MediaBrowserServiceCompat.ConnectionRecord();
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

	public void search(final String query, final Bundle extras, final ResultReceiver receiver, final MediaBrowserServiceCompat.ServiceCallbacks callbacks)
	{
		if(TextUtils.isEmpty(((CharSequence) (query))) || receiver == null)
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

	public void sendCustomAction(final String action, final Bundle extras, final ResultReceiver receiver, final MediaBrowserServiceCompat.ServiceCallbacks callbacks)
	{
		if(TextUtils.isEmpty(((CharSequence) (action))) || receiver == null)
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
						performCustomAction(action, extras, ((MediaBrowserServiceCompat.ConnectionRecord) (obj)), receiver);
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

				final MediaBrowserServiceCompat.ServiceBinderImpl this$1;
				final String val$action;
				final MediaBrowserServiceCompat.ServiceCallbacks val$callbacks;
				final Bundle val$extras;
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
				action = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #32  <Field String val$action>
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

	MediaBrowserServiceCompat$ServiceBinderImpl()
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
