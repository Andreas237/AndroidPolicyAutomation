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
					addSubscription(id, ((MediaBrowserServiceCompat.ConnectionRecord) (obj)), token, options);
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
			((StringBuilder) (rootHints)).append(uid);
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
			mHandler.postOrRun(new Runnable() {

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
					Object obj1 = ((Object) (new MediaBrowserServiceCompat.ConnectionRecord(this$0)));
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
					if(((MediaBrowserServiceCompat.ConnectionRecord) (obj1)).root == null)
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
							callbacks.onConnect(((MediaBrowserServiceCompat.ConnectionRecord) (obj1)).root.getRootId(), mSession, ((MediaBrowserServiceCompat.ConnectionRecord) (obj1)).root.getExtras());
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
				if(obj != null)
			//*  12   28:aload_1         
			//*  13   29:ifnull          49
					((MediaBrowserServiceCompat.ConnectionRecord) (obj)).callbacks.asBinder().unlinkToDeath(((android.os.IBinder.DeathRecipient) (obj)), 0);
			//   14   32:aload_1         
			//   15   33:getfield        #54  <Field MediaBrowserServiceCompat$ServiceCallbacks MediaBrowserServiceCompat$ConnectionRecord.callbacks>
			//   16   36:invokeinterface #35  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
			//   17   41:aload_1         
			//   18   42:iconst_0        
			//   19   43:invokeinterface #60  <Method boolean IBinder.unlinkToDeath(android.os.IBinder$DeathRecipient, int)>
			//   20   48:pop             
			//   21   49:return          
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
		if(!TextUtils.isEmpty(((CharSequence) (mediaId))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #95  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            34
		{
			if(receiver == null)
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
							performLoadItem(mediaId, ((MediaBrowserServiceCompat.ConnectionRecord) (obj)), receiver);
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
		} else
		{
			return;
	//   18   34:return          
		}
	}

	public void registerCallbacks(final MediaBrowserServiceCompat.ServiceCallbacks callbacks, final Bundle rootHints)
	{
		mHandler.postOrRun(new Runnable() {

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
				MediaBrowserServiceCompat.ConnectionRecord connectionrecord = new MediaBrowserServiceCompat.ConnectionRecord(this$0);
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
				if(!removeSubscription(id, ((MediaBrowserServiceCompat.ConnectionRecord) (obj)), token))
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
		if(!TextUtils.isEmpty(((CharSequence) (query))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #95  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            36
		{
			if(receiver == null)
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
							performSearch(query, extras, ((MediaBrowserServiceCompat.ConnectionRecord) (obj)), receiver);
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
		} else
		{
			return;
	//   19   36:return          
		}
	}

	public void sendCustomAction(final String action, final Bundle extras, final ResultReceiver receiver, final MediaBrowserServiceCompat.ServiceCallbacks callbacks)
	{
		if(!TextUtils.isEmpty(((CharSequence) (action))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #95  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            36
		{
			if(receiver == null)
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
							performCustomAction(action, extras, ((MediaBrowserServiceCompat.ConnectionRecord) (obj)), receiver);
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
		} else
		{
			return;
	//   19   36:return          
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
				MediaBrowserServiceCompat.ConnectionRecord connectionrecord = (MediaBrowserServiceCompat.ConnectionRecord)mConnections.remove(((Object) (ibinder)));
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
