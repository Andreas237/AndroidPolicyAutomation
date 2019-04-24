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
		Object obj;
		MediaBrowserServiceCompat.ConnectionRecord connectionrecord;
		obj = ((Object) (val$callbacks.asBinder()));
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
		connectionrecord = new MediaBrowserServiceCompat.ConnectionRecord();
	//   11   25:new             #65  <Class MediaBrowserServiceCompat$ConnectionRecord>
	//   12   28:dup             
	//   13   29:invokespecial   #66  <Method void MediaBrowserServiceCompat$ConnectionRecord()>
	//   14   32:astore_2        
		connectionrecord.pkg = val$pkg;
	//   15   33:aload_2         
	//   16   34:aload_0         
	//   17   35:getfield        #32  <Field String val$pkg>
	//   18   38:putfield        #69  <Field String MediaBrowserServiceCompat$ConnectionRecord.pkg>
		connectionrecord.rootHints = val$rootHints;
	//   19   41:aload_2         
	//   20   42:aload_0         
	//   21   43:getfield        #34  <Field Bundle val$rootHints>
	//   22   46:putfield        #72  <Field Bundle MediaBrowserServiceCompat$ConnectionRecord.rootHints>
		connectionrecord.callbacks = val$callbacks;
	//   23   49:aload_2         
	//   24   50:aload_0         
	//   25   51:getfield        #30  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
	//   26   54:putfield        #75  <Field MediaBrowserServiceCompat$ServiceCallbacks MediaBrowserServiceCompat$ConnectionRecord.callbacks>
		connectionrecord.root = onGetRoot(val$pkg, val$uid, val$rootHints);
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
		Log.i("MBServiceCompat", (new StringBuilder()).append("No root for client ").append(val$pkg).append(" from service ").append(((Object)this).getClass().getName()).toString());
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
		val$callbacks.onConnectFailed();
	//   60  133:aload_0         
	//   61  134:getfield        #30  <Field MediaBrowserServiceCompat$ServiceCallbacks val$callbacks>
	//   62  137:invokeinterface #118 <Method void MediaBrowserServiceCompat$ServiceCallbacks.onConnectFailed()>
_L1:
		return;
	//   63  142:return          
		obj;
	//   64  143:astore_1        
		Log.w("MBServiceCompat", (new StringBuilder()).append("Calling onConnectFailed() failed. Ignoring. pkg=").append(val$pkg).toString());
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
				val$callbacks.onConnect(connectionrecord.root.getRootId(), mSession, connectionrecord.root.getExtras());
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
			Log.w("MBServiceCompat", (new StringBuilder()).append("Calling onConnect() failed. Dropping client. pkg=").append(val$pkg).toString());
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
