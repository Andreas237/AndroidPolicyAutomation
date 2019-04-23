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

	public void connect(final String pkg, final int pid, final int uid, final Bundle rootHints, final MediaBrowserServiceCompat.ServiceCallbacks callbacks)
	{
		if(isValidPackage(pkg, uid))
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field MediaBrowserServiceCompat this$0>
	//*   2    4:aload_1         
	//*   3    5:iload_3         
	//*   4    6:invokevirtual   #56  <Method boolean MediaBrowserServiceCompat.isValidPackage(String, int)>
	//*   5    9:ifeq            38
		{
			mHandler.postOrRun(new Runnable() {

				public void run()
				{
					RemoteException remoteexception;
					RemoteException remoteexception1;
					Object obj = ((Object) (callbacks.asBinder()));
				//    0    0:aload_0         
				//    1    1:getfield        #31  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
				//    2    4:invokeinterface #52  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
				//    3    9:astore_1        
					mConnections.remove(obj);
				//    4   10:aload_0         
				//    5   11:getfield        #29  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				//    6   14:getfield        #56  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
				//    7   17:getfield        #60  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
				//    8   20:aload_1         
				//    9   21:invokevirtual   #66  <Method Object ArrayMap.remove(Object)>
				//   10   24:pop             
					Object obj1 = ((Object) (new MediaBrowserServiceCompat.ConnectionRecord(this$0, pkg, pid, uid, rootHints, callbacks)));
				//   11   25:new             #68  <Class MediaBrowserServiceCompat$ConnectionRecord>
				//   12   28:dup             
				//   13   29:aload_0         
				//   14   30:getfield        #29  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				//   15   33:getfield        #56  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
				//   16   36:aload_0         
				//   17   37:getfield        #33  <Field String val$pkg>
				//   18   40:aload_0         
				//   19   41:getfield        #35  <Field int val$pid>
				//   20   44:aload_0         
				//   21   45:getfield        #37  <Field int val$uid>
				//   22   48:aload_0         
				//   23   49:getfield        #39  <Field Bundle val$rootHints>
				//   24   52:aload_0         
				//   25   53:getfield        #31  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
				//   26   56:invokespecial   #71  <Method void MediaBrowserServiceCompat$ConnectionRecord(MediaBrowserServiceCompat, String, int, int, Bundle, MediaBrowserServiceCompat$ServiceCallbacks)>
				//   27   59:astore_2        
					mCurConnection = ((MediaBrowserServiceCompat.ConnectionRecord) (obj1));
				//   28   60:aload_0         
				//   29   61:getfield        #29  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				//   30   64:getfield        #56  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
				//   31   67:aload_2         
				//   32   68:putfield        #75  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
					obj1.root = onGetRoot(pkg, uid, rootHints);
				//   33   71:aload_2         
				//   34   72:aload_0         
				//   35   73:getfield        #29  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				//   36   76:getfield        #56  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
				//   37   79:aload_0         
				//   38   80:getfield        #33  <Field String val$pkg>
				//   39   83:aload_0         
				//   40   84:getfield        #37  <Field int val$uid>
				//   41   87:aload_0         
				//   42   88:getfield        #39  <Field Bundle val$rootHints>
				//   43   91:invokevirtual   #79  <Method MediaBrowserServiceCompat$BrowserRoot MediaBrowserServiceCompat.onGetRoot(String, int, Bundle)>
				//   44   94:putfield        #83  <Field MediaBrowserServiceCompat$BrowserRoot MediaBrowserServiceCompat$ConnectionRecord.root>
					mCurConnection = null;
				//   45   97:aload_0         
				//   46   98:getfield        #29  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				//   47  101:getfield        #56  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
				//   48  104:aconst_null     
				//   49  105:putfield        #75  <Field MediaBrowserServiceCompat$ConnectionRecord MediaBrowserServiceCompat.mCurConnection>
					if(((MediaBrowserServiceCompat.ConnectionRecord) (obj1)).root == null)
				//*  50  108:aload_2         
				//*  51  109:getfield        #83  <Field MediaBrowserServiceCompat$BrowserRoot MediaBrowserServiceCompat$ConnectionRecord.root>
				//*  52  112:ifnonnull       213
					{
						obj = ((Object) (new StringBuilder()));
				//   53  115:new             #85  <Class StringBuilder>
				//   54  118:dup             
				//   55  119:invokespecial   #86  <Method void StringBuilder()>
				//   56  122:astore_1        
						((StringBuilder) (obj)).append("No root for client ");
				//   57  123:aload_1         
				//   58  124:ldc1            #88  <String "No root for client ">
				//   59  126:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
				//   60  129:pop             
						((StringBuilder) (obj)).append(pkg);
				//   61  130:aload_1         
				//   62  131:aload_0         
				//   63  132:getfield        #33  <Field String val$pkg>
				//   64  135:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
				//   65  138:pop             
						((StringBuilder) (obj)).append(" from service ");
				//   66  139:aload_1         
				//   67  140:ldc1            #94  <String " from service ">
				//   68  142:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
				//   69  145:pop             
						((StringBuilder) (obj)).append(((Object)this).getClass().getName());
				//   70  146:aload_1         
				//   71  147:aload_0         
				//   72  148:invokevirtual   #98  <Method Class Object.getClass()>
				//   73  151:invokevirtual   #104 <Method String Class.getName()>
				//   74  154:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
				//   75  157:pop             
						Log.i("MBServiceCompat", ((StringBuilder) (obj)).toString());
				//   76  158:ldc1            #106 <String "MBServiceCompat">
				//   77  160:aload_1         
				//   78  161:invokevirtual   #109 <Method String StringBuilder.toString()>
				//   79  164:invokestatic    #115 <Method int Log.i(String, String)>
				//   80  167:pop             
						try
						{
							callbacks.onConnectFailed();
				//   81  168:aload_0         
				//   82  169:getfield        #31  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
				//   83  172:invokeinterface #118 <Method void MediaBrowserServiceCompat$ServiceCallbacks.onConnectFailed()>
							return;
				//   84  177:return          
						}
				//*  85  178:new             #85  <Class StringBuilder>
				//*  86  181:dup             
				//*  87  182:invokespecial   #86  <Method void StringBuilder()>
				//*  88  185:astore_1        
				//*  89  186:aload_1         
				//*  90  187:ldc1            #120 <String "Calling onConnectFailed() failed. Ignoring. pkg=">
				//*  91  189:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
				//*  92  192:pop             
				//*  93  193:aload_1         
				//*  94  194:aload_0         
				//*  95  195:getfield        #33  <Field String val$pkg>
				//*  96  198:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
				//*  97  201:pop             
				//*  98  202:ldc1            #106 <String "MBServiceCompat">
				//*  99  204:aload_1         
				//* 100  205:invokevirtual   #109 <Method String StringBuilder.toString()>
				//* 101  208:invokestatic    #123 <Method int Log.w(String, String)>
				//* 102  211:pop             
				//* 103  212:return          
				//* 104  213:aload_0         
				//* 105  214:getfield        #29  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				//* 106  217:getfield        #56  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
				//* 107  220:getfield        #60  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
				//* 108  223:aload_1         
				//* 109  224:aload_2         
				//* 110  225:invokevirtual   #127 <Method Object ArrayMap.put(Object, Object)>
				//* 111  228:pop             
				//* 112  229:aload_1         
				//* 113  230:aload_2         
				//* 114  231:iconst_0        
				//* 115  232:invokeinterface #133 <Method void IBinder.linkToDeath(android.os.IBinder$DeathRecipient, int)>
				//* 116  237:aload_0         
				//* 117  238:getfield        #29  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				//* 118  241:getfield        #56  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
				//* 119  244:getfield        #137 <Field android.support.v4.media.session.MediaSessionCompat$Token MediaBrowserServiceCompat.mSession>
				//* 120  247:ifnull          333
				//* 121  250:aload_0         
				//* 122  251:getfield        #31  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
				//* 123  254:aload_2         
				//* 124  255:getfield        #83  <Field MediaBrowserServiceCompat$BrowserRoot MediaBrowserServiceCompat$ConnectionRecord.root>
				//* 125  258:invokevirtual   #142 <Method String MediaBrowserServiceCompat$BrowserRoot.getRootId()>
				//* 126  261:aload_0         
				//* 127  262:getfield        #29  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				//* 128  265:getfield        #56  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
				//* 129  268:getfield        #137 <Field android.support.v4.media.session.MediaSessionCompat$Token MediaBrowserServiceCompat.mSession>
				//* 130  271:aload_2         
				//* 131  272:getfield        #83  <Field MediaBrowserServiceCompat$BrowserRoot MediaBrowserServiceCompat$ConnectionRecord.root>
				//* 132  275:invokevirtual   #146 <Method Bundle MediaBrowserServiceCompat$BrowserRoot.getExtras()>
				//* 133  278:invokeinterface #150 <Method void MediaBrowserServiceCompat$ServiceCallbacks.onConnect(String, android.support.v4.media.session.MediaSessionCompat$Token, Bundle)>
				//* 134  283:return          
				//* 135  284:new             #85  <Class StringBuilder>
				//* 136  287:dup             
				//* 137  288:invokespecial   #86  <Method void StringBuilder()>
				//* 138  291:astore_2        
				//* 139  292:aload_2         
				//* 140  293:ldc1            #152 <String "Calling onConnect() failed. Dropping client. pkg=">
				//* 141  295:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
				//* 142  298:pop             
				//* 143  299:aload_2         
				//* 144  300:aload_0         
				//* 145  301:getfield        #33  <Field String val$pkg>
				//* 146  304:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
				//* 147  307:pop             
				//* 148  308:ldc1            #106 <String "MBServiceCompat">
				//* 149  310:aload_2         
				//* 150  311:invokevirtual   #109 <Method String StringBuilder.toString()>
				//* 151  314:invokestatic    #123 <Method int Log.w(String, String)>
				//* 152  317:pop             
				//* 153  318:aload_0         
				//* 154  319:getfield        #29  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				//* 155  322:getfield        #56  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
				//* 156  325:getfield        #60  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
				//* 157  328:aload_1         
				//* 158  329:invokevirtual   #66  <Method Object ArrayMap.remove(Object)>
				//* 159  332:pop             
				//* 160  333:return          
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
				//* 161  334:astore_1        
				//* 162  335:goto            178
					// Misplaced declaration of an exception variable
					catch(RemoteException remoteexception1)
					{
						obj1 = ((Object) (new StringBuilder()));
						((StringBuilder) (obj1)).append("Calling onConnect() failed. Dropping client. pkg=");
						((StringBuilder) (obj1)).append(pkg);
						Log.w("MBServiceCompat", ((StringBuilder) (obj1)).toString());
						mConnections.remove(obj);
					}
				//* 163  338:astore_2        
				//* 164  339:goto            284
				}

				final MediaBrowserServiceCompat.ServiceBinderImpl this$1;
				final MediaBrowserServiceCompat.ServiceCallbacks val$callbacks;
				final int val$pid;
				final String val$pkg;
				final Bundle val$rootHints;
				final int val$uid;

			
			{
				this$1 = MediaBrowserServiceCompat.ServiceBinderImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #29  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				callbacks = servicecallbacks;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #31  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
				pkg = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #33  <Field String val$pkg>
				pid = i;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #35  <Field int val$pid>
				uid = j;
			//   12   21:aload_0         
			//   13   22:iload           5
			//   14   24:putfield        #37  <Field int val$uid>
				rootHints = bundle;
			//   15   27:aload_0         
			//   16   28:aload           6
			//   17   30:putfield        #39  <Field Bundle val$rootHints>
				super();
			//   18   33:aload_0         
			//   19   34:invokespecial   #42  <Method void Object()>
			//   20   37:return          
			}
			}
);
	//    6   12:aload_0         
	//    7   13:getfield        #31  <Field MediaBrowserServiceCompat this$0>
	//    8   16:getfield        #41  <Field MediaBrowserServiceCompat$ServiceHandler MediaBrowserServiceCompat.mHandler>
	//    9   19:new             #9   <Class MediaBrowserServiceCompat$ServiceBinderImpl$1>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:aload           5
	//   13   26:aload_1         
	//   14   27:iload_2         
	//   15   28:iload_3         
	//   16   29:aload           4
	//   17   31:invokespecial   #59  <Method void MediaBrowserServiceCompat$ServiceBinderImpl$1(MediaBrowserServiceCompat$ServiceBinderImpl, MediaBrowserServiceCompat$ServiceCallbacks, String, int, int, Bundle)>
	//   18   34:invokevirtual   #50  <Method void MediaBrowserServiceCompat$ServiceHandler.postOrRun(Runnable)>
			return;
	//   19   37:return          
		} else
		{
			rootHints = ((Bundle) (new StringBuilder()));
	//   20   38:new             #61  <Class StringBuilder>
	//   21   41:dup             
	//   22   42:invokespecial   #62  <Method void StringBuilder()>
	//   23   45:astore          4
			((StringBuilder) (rootHints)).append("Package/uid mismatch: uid=");
	//   24   47:aload           4
	//   25   49:ldc1            #64  <String "Package/uid mismatch: uid=">
	//   26   51:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   27   54:pop             
			((StringBuilder) (rootHints)).append(uid);
	//   28   55:aload           4
	//   29   57:iload_3         
	//   30   58:invokevirtual   #71  <Method StringBuilder StringBuilder.append(int)>
	//   31   61:pop             
			((StringBuilder) (rootHints)).append(" package=");
	//   32   62:aload           4
	//   33   64:ldc1            #73  <String " package=">
	//   34   66:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   35   69:pop             
			((StringBuilder) (rootHints)).append(pkg);
	//   36   70:aload           4
	//   37   72:aload_1         
	//   38   73:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   39   76:pop             
			throw new IllegalArgumentException(((StringBuilder) (rootHints)).toString());
	//   40   77:new             #75  <Class IllegalArgumentException>
	//   41   80:dup             
	//   42   81:aload           4
	//   43   83:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   44   86:invokespecial   #82  <Method void IllegalArgumentException(String)>
	//   45   89:athrow          
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

	public void registerCallbacks(final MediaBrowserServiceCompat.ServiceCallbacks callbacks, final String pkg, final int pid, final int uid, final Bundle rootHints)
	{
		mHandler.postOrRun(new Runnable() {

			public void run()
			{
				RemoteException remoteexception;
				IBinder ibinder = callbacks.asBinder();
			//    0    0:aload_0         
			//    1    1:getfield        #31  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
			//    2    4:invokeinterface #52  <Method IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
			//    3    9:astore_1        
				mConnections.remove(((Object) (ibinder)));
			//    4   10:aload_0         
			//    5   11:getfield        #29  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
			//    6   14:getfield        #56  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
			//    7   17:getfield        #60  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
			//    8   20:aload_1         
			//    9   21:invokevirtual   #66  <Method Object ArrayMap.remove(Object)>
			//   10   24:pop             
				MediaBrowserServiceCompat.ConnectionRecord connectionrecord = new MediaBrowserServiceCompat.ConnectionRecord(this$0, pkg, pid, uid, rootHints, callbacks);
			//   11   25:new             #68  <Class MediaBrowserServiceCompat$ConnectionRecord>
			//   12   28:dup             
			//   13   29:aload_0         
			//   14   30:getfield        #29  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
			//   15   33:getfield        #56  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
			//   16   36:aload_0         
			//   17   37:getfield        #33  <Field String val$pkg>
			//   18   40:aload_0         
			//   19   41:getfield        #35  <Field int val$pid>
			//   20   44:aload_0         
			//   21   45:getfield        #37  <Field int val$uid>
			//   22   48:aload_0         
			//   23   49:getfield        #39  <Field Bundle val$rootHints>
			//   24   52:aload_0         
			//   25   53:getfield        #31  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
			//   26   56:invokespecial   #71  <Method void MediaBrowserServiceCompat$ConnectionRecord(MediaBrowserServiceCompat, String, int, int, Bundle, MediaBrowserServiceCompat$ServiceCallbacks)>
			//   27   59:astore_2        
				mConnections.put(((Object) (ibinder)), ((Object) (connectionrecord)));
			//   28   60:aload_0         
			//   29   61:getfield        #29  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
			//   30   64:getfield        #56  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$ServiceBinderImpl.this$0>
			//   31   67:getfield        #60  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
			//   32   70:aload_1         
			//   33   71:aload_2         
			//   34   72:invokevirtual   #75  <Method Object ArrayMap.put(Object, Object)>
			//   35   75:pop             
				try
				{
					ibinder.linkToDeath(((android.os.IBinder.DeathRecipient) (connectionrecord)), 0);
			//   36   76:aload_1         
			//   37   77:aload_2         
			//   38   78:iconst_0        
			//   39   79:invokeinterface #81  <Method void IBinder.linkToDeath(android.os.IBinder$DeathRecipient, int)>
					return;
			//   40   84:return          
				}
			//*  41   85:ldc1            #83  <String "MBServiceCompat">
			//*  42   87:ldc1            #85  <String "IBinder is already dead.">
			//*  43   89:invokestatic    #91  <Method int Log.w(String, String)>
			//*  44   92:pop             
			//*  45   93:return          
				// Misplaced declaration of an exception variable
				catch(RemoteException remoteexception)
				{
					Log.w("MBServiceCompat", "IBinder is already dead.");
				}
			//*  46   94:astore_1        
			//*  47   95:goto            85
			}

			final MediaBrowserServiceCompat.ServiceBinderImpl this$1;
			final MediaBrowserServiceCompat.ServiceCallbacks val$callbacks;
			final int val$pid;
			final String val$pkg;
			final Bundle val$rootHints;
			final int val$uid;

			
			{
				this$1 = MediaBrowserServiceCompat.ServiceBinderImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #29  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
				callbacks = servicecallbacks;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #31  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
				pkg = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #33  <Field String val$pkg>
				pid = i;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #35  <Field int val$pid>
				uid = j;
			//   12   21:aload_0         
			//   13   22:iload           5
			//   14   24:putfield        #37  <Field int val$uid>
				rootHints = bundle;
			//   15   27:aload_0         
			//   16   28:aload           6
			//   17   30:putfield        #39  <Field Bundle val$rootHints>
				super();
			//   18   33:aload_0         
			//   19   34:invokespecial   #42  <Method void Object()>
			//   20   37:return          
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
	//    8   14:iload_3         
	//    9   15:iload           4
	//   10   17:aload           5
	//   11   19:invokespecial   #101 <Method void MediaBrowserServiceCompat$ServiceBinderImpl$6(MediaBrowserServiceCompat$ServiceBinderImpl, MediaBrowserServiceCompat$ServiceCallbacks, String, int, int, Bundle)>
	//   12   22:invokevirtual   #50  <Method void MediaBrowserServiceCompat$ServiceHandler.postOrRun(Runnable)>
	//   13   25:return          
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
	//    9   15:invokespecial   #106 <Method void MediaBrowserServiceCompat$ServiceBinderImpl$4(MediaBrowserServiceCompat$ServiceBinderImpl, MediaBrowserServiceCompat$ServiceCallbacks, String, IBinder)>
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
	//   16   29:invokespecial   #111 <Method void MediaBrowserServiceCompat$ServiceBinderImpl$8(MediaBrowserServiceCompat$ServiceBinderImpl, MediaBrowserServiceCompat$ServiceCallbacks, String, Bundle, ResultReceiver)>
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
	//   16   29:invokespecial   #113 <Method void MediaBrowserServiceCompat$ServiceBinderImpl$9(MediaBrowserServiceCompat$ServiceBinderImpl, MediaBrowserServiceCompat$ServiceCallbacks, String, Bundle, ResultReceiver)>
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
	//    7   13:invokespecial   #115 <Method void MediaBrowserServiceCompat$ServiceBinderImpl$7(MediaBrowserServiceCompat$ServiceBinderImpl, MediaBrowserServiceCompat$ServiceCallbacks)>
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
