// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.*;
import android.support.v4.util.ArrayMap;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$ServiceBinderImpl$1
	implements Runnable
{

	public void run()
	{
		RemoteException remoteexception;
		RemoteException remoteexception1;
		Object obj = ((Object) (val$callbacks.asBinder()));
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
		Object obj1 = ((Object) (new MediaBrowserServiceCompat.ConnectionRecord(this$0, val$pkg, val$pid, val$uid, val$rootHints, val$callbacks)));
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
		obj1.root = onGetRoot(val$pkg, val$uid, val$rootHints);
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
			((StringBuilder) (obj)).append(val$pkg);
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
				val$callbacks.onConnectFailed();
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
			((StringBuilder) (obj)).append(val$pkg);
			Log.w("MBServiceCompat", ((StringBuilder) (obj)).toString());
			return;
		}
		try
		{
			mConnections.put(obj, obj1);
			((IBinder) (obj)).linkToDeath(((android.os.IBinder.DeathRecipient) (obj1)), 0);
			if(mSession != null)
			{
				val$callbacks.onConnect(((MediaBrowserServiceCompat.ConnectionRecord) (obj1)).root.getRootId(), mSession, ((MediaBrowserServiceCompat.ConnectionRecord) (obj1)).root.getExtras());
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
			((StringBuilder) (obj1)).append(val$pkg);
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

	MediaBrowserServiceCompat$ServiceBinderImpl$1()
	{
		this$1 = final_servicebinderimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
		val$callbacks = servicecallbacks;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #31  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
		val$pkg = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #33  <Field String val$pkg>
		val$pid = i;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #35  <Field int val$pid>
		val$uid = j;
	//   12   21:aload_0         
	//   13   22:iload           5
	//   14   24:putfield        #37  <Field int val$uid>
		val$rootHints = Bundle.this;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #39  <Field Bundle val$rootHints>
		super();
	//   18   33:aload_0         
	//   19   34:invokespecial   #42  <Method void Object()>
	//   20   37:return          
	}
}
