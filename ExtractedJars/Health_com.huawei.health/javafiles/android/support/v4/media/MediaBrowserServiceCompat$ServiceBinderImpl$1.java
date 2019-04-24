// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.util.ArrayMap;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$ServiceBinderImpl$1
	implements Runnable
{

	public void run()
	{
		Object obj = ((Object) (val$callbacks.asBinder()));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
	//    2    4:invokeinterface #49  <Method android.os.IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
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
		connectionrecord.pkg = val$pkg;
	//   18   40:aload_2         
	//   19   41:aload_0         
	//   20   42:getfield        #32  <Field String val$pkg>
	//   21   45:putfield        #71  <Field String MediaBrowserServiceCompat$ConnectionRecord.pkg>
		connectionrecord.rootHints = val$rootHints;
	//   22   48:aload_2         
	//   23   49:aload_0         
	//   24   50:getfield        #34  <Field Bundle val$rootHints>
	//   25   53:putfield        #74  <Field Bundle MediaBrowserServiceCompat$ConnectionRecord.rootHints>
		connectionrecord.callbacks = val$callbacks;
	//   26   56:aload_2         
	//   27   57:aload_0         
	//   28   58:getfield        #30  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
	//   29   61:putfield        #77  <Field MediaBrowserServiceCompat$ServiceCallbacks MediaBrowserServiceCompat$ConnectionRecord.callbacks>
		connectionrecord.root = onGetRoot(val$pkg, val$uid, val$rootHints);
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
			Log.i("MBServiceCompat", (new StringBuilder()).append("No root for client ").append(val$pkg).append(" from service ").append(((Object)this).getClass().getName()).toString());
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
				val$callbacks.onConnectFailed();
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
				Log.w("MBServiceCompat", (new StringBuilder()).append("Calling onConnectFailed() failed. Ignoring. pkg=").append(val$pkg).toString());
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
				val$callbacks.onConnect(connectionrecord.root.getRootId(), mSession, connectionrecord.root.getExtras());
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
			Log.w("MBServiceCompat", (new StringBuilder()).append("Calling onConnect() failed. Dropping client. pkg=").append(val$pkg).toString());
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
