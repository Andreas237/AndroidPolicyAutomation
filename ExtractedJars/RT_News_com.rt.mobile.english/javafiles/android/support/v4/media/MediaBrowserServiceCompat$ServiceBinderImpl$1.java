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
		obj1.pkg = val$pkg;
	//   18   40:aload_2         
	//   19   41:aload_0         
	//   20   42:getfield        #32  <Field String val$pkg>
	//   21   45:putfield        #71  <Field String MediaBrowserServiceCompat$ConnectionRecord.pkg>
		obj1.rootHints = val$rootHints;
	//   22   48:aload_2         
	//   23   49:aload_0         
	//   24   50:getfield        #34  <Field Bundle val$rootHints>
	//   25   53:putfield        #74  <Field Bundle MediaBrowserServiceCompat$ConnectionRecord.rootHints>
		obj1.callbacks = val$callbacks;
	//   26   56:aload_2         
	//   27   57:aload_0         
	//   28   58:getfield        #30  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
	//   29   61:putfield        #77  <Field MediaBrowserServiceCompat$ServiceCallbacks MediaBrowserServiceCompat$ConnectionRecord.callbacks>
		obj1.root = onGetRoot(val$pkg, val$uid, val$rootHints);
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
			((StringBuilder) (obj)).append(val$pkg);
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
				val$callbacks.onConnectFailed();
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
	//* 153  316:astore_1        
	//* 154  317:goto            160
		// Misplaced declaration of an exception variable
		catch(RemoteException remoteexception1)
		{
			obj1 = ((Object) (new StringBuilder()));
			((StringBuilder) (obj1)).append("Calling onConnect() failed. Dropping client. pkg=");
			((StringBuilder) (obj1)).append(val$pkg);
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

	MediaBrowserServiceCompat$ServiceBinderImpl$1()
	{
		this$1 = final_servicebinderimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field MediaBrowserServiceCompat$ServiceBinderImpl this$1>
		val$callbacks = servicecallbacks;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #30  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
		val$pkg = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #32  <Field String val$pkg>
		val$rootHints = bundle;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #34  <Field Bundle val$rootHints>
		val$uid = I.this;
	//   12   21:aload_0         
	//   13   22:iload           5
	//   14   24:putfield        #36  <Field int val$uid>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #39  <Method void Object()>
	//   17   31:return          
	}
}
