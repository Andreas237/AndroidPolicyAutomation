// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.ComponentName;
import android.os.*;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat

class MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$1
	implements Runnable
{

	public void run()
	{
		RemoteException remoteexception;
		if(MediaBrowserCompat.DEBUG)
	//*   0    0:getstatic       #42  <Field boolean MediaBrowserCompat.DEBUG>
	//*   1    3:ifeq            66
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #44  <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #45  <Method void StringBuilder()>
	//    5   13:astore_1        
			stringbuilder.append("MediaServiceConnection.onServiceConnected name=");
	//    6   14:aload_1         
	//    7   15:ldc1            #47  <String "MediaServiceConnection.onServiceConnected name=">
	//    8   17:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
			stringbuilder.append(((Object) (val$name)));
	//   10   21:aload_1         
	//   11   22:aload_0         
	//   12   23:getfield        #29  <Field ComponentName val$name>
	//   13   26:invokevirtual   #54  <Method StringBuilder StringBuilder.append(Object)>
	//   14   29:pop             
			stringbuilder.append(" binder=");
	//   15   30:aload_1         
	//   16   31:ldc1            #56  <String " binder=">
	//   17   33:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
			stringbuilder.append(((Object) (val$binder)));
	//   19   37:aload_1         
	//   20   38:aload_0         
	//   21   39:getfield        #31  <Field IBinder val$binder>
	//   22   42:invokevirtual   #54  <Method StringBuilder StringBuilder.append(Object)>
	//   23   45:pop             
			Log.d("MediaBrowserCompat", stringbuilder.toString());
	//   24   46:ldc1            #58  <String "MediaBrowserCompat">
	//   25   48:aload_1         
	//   26   49:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   27   52:invokestatic    #68  <Method int Log.d(String, String)>
	//   28   55:pop             
			dump();
	//   29   56:aload_0         
	//   30   57:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
	//   31   60:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
	//   32   63:invokevirtual   #75  <Method void MediaBrowserCompat$MediaBrowserImplBase.dump()>
		}
		if(!isCurrent("onServiceConnected"))
	//*  33   66:aload_0         
	//*  34   67:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
	//*  35   70:ldc1            #76  <String "onServiceConnected">
	//*  36   72:invokevirtual   #80  <Method boolean MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.isCurrent(String)>
	//*  37   75:ifne            79
			return;
	//   38   78:return          
		mServiceBinderWrapper = new MediaBrowserCompat.ServiceBinderWrapper(val$binder, mRootHints);
	//   39   79:aload_0         
	//   40   80:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
	//   41   83:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
	//   42   86:new             #82  <Class MediaBrowserCompat$ServiceBinderWrapper>
	//   43   89:dup             
	//   44   90:aload_0         
	//   45   91:getfield        #31  <Field IBinder val$binder>
	//   46   94:aload_0         
	//   47   95:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
	//   48   98:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
	//   49  101:getfield        #86  <Field android.os.Bundle MediaBrowserCompat$MediaBrowserImplBase.mRootHints>
	//   50  104:invokespecial   #89  <Method void MediaBrowserCompat$ServiceBinderWrapper(IBinder, android.os.Bundle)>
	//   51  107:putfield        #93  <Field MediaBrowserCompat$ServiceBinderWrapper MediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper>
		mCallbacksMessenger = new Messenger(((android.os.Handler) (mHandler)));
	//   52  110:aload_0         
	//   53  111:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
	//   54  114:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
	//   55  117:new             #95  <Class Messenger>
	//   56  120:dup             
	//   57  121:aload_0         
	//   58  122:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
	//   59  125:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
	//   60  128:getfield        #99  <Field MediaBrowserCompat$CallbackHandler MediaBrowserCompat$MediaBrowserImplBase.mHandler>
	//   61  131:invokespecial   #102 <Method void Messenger(android.os.Handler)>
	//   62  134:putfield        #106 <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
		mHandler.setCallbacksMessenger(mCallbacksMessenger);
	//   63  137:aload_0         
	//   64  138:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
	//   65  141:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
	//   66  144:getfield        #99  <Field MediaBrowserCompat$CallbackHandler MediaBrowserCompat$MediaBrowserImplBase.mHandler>
	//   67  147:aload_0         
	//   68  148:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
	//   69  151:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
	//   70  154:getfield        #106 <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
	//   71  157:invokevirtual   #112 <Method void MediaBrowserCompat$CallbackHandler.setCallbacksMessenger(Messenger)>
		mState = 2;
	//   72  160:aload_0         
	//   73  161:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
	//   74  164:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
	//   75  167:iconst_2        
	//   76  168:putfield        #116 <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
		StringBuilder stringbuilder1;
		try
		{
			if(MediaBrowserCompat.DEBUG)
	//*  77  171:getstatic       #42  <Field boolean MediaBrowserCompat.DEBUG>
	//*  78  174:ifeq            195
			{
				Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
	//   79  177:ldc1            #58  <String "MediaBrowserCompat">
	//   80  179:ldc1            #118 <String "ServiceCallbacks.onConnect...">
	//   81  181:invokestatic    #68  <Method int Log.d(String, String)>
	//   82  184:pop             
				dump();
	//   83  185:aload_0         
	//   84  186:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
	//   85  189:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
	//   86  192:invokevirtual   #75  <Method void MediaBrowserCompat$MediaBrowserImplBase.dump()>
			}
			mServiceBinderWrapper.connect(mContext, mCallbacksMessenger);
	//   87  195:aload_0         
	//   88  196:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
	//   89  199:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
	//   90  202:getfield        #93  <Field MediaBrowserCompat$ServiceBinderWrapper MediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper>
	//   91  205:aload_0         
	//   92  206:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
	//   93  209:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
	//   94  212:getfield        #122 <Field android.content.Context MediaBrowserCompat$MediaBrowserImplBase.mContext>
	//   95  215:aload_0         
	//   96  216:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
	//   97  219:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
	//   98  222:getfield        #106 <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
	//   99  225:invokevirtual   #126 <Method void MediaBrowserCompat$ServiceBinderWrapper.connect(android.content.Context, Messenger)>
			return;
	//  100  228:return          
		}
	//* 101  229:new             #44  <Class StringBuilder>
	//* 102  232:dup             
	//* 103  233:invokespecial   #45  <Method void StringBuilder()>
	//* 104  236:astore_1        
	//* 105  237:aload_1         
	//* 106  238:ldc1            #128 <String "RemoteException during connect for ">
	//* 107  240:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//* 108  243:pop             
	//* 109  244:aload_1         
	//* 110  245:aload_0         
	//* 111  246:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
	//* 112  249:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
	//* 113  252:getfield        #131 <Field ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
	//* 114  255:invokevirtual   #54  <Method StringBuilder StringBuilder.append(Object)>
	//* 115  258:pop             
	//* 116  259:ldc1            #58  <String "MediaBrowserCompat">
	//* 117  261:aload_1         
	//* 118  262:invokevirtual   #62  <Method String StringBuilder.toString()>
	//* 119  265:invokestatic    #134 <Method int Log.w(String, String)>
	//* 120  268:pop             
	//* 121  269:getstatic       #42  <Field boolean MediaBrowserCompat.DEBUG>
	//* 122  272:ifeq            293
	//* 123  275:ldc1            #58  <String "MediaBrowserCompat">
	//* 124  277:ldc1            #118 <String "ServiceCallbacks.onConnect...">
	//* 125  279:invokestatic    #68  <Method int Log.d(String, String)>
	//* 126  282:pop             
	//* 127  283:aload_0         
	//* 128  284:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
	//* 129  287:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
	//* 130  290:invokevirtual   #75  <Method void MediaBrowserCompat$MediaBrowserImplBase.dump()>
	//* 131  293:return          
		// Misplaced declaration of an exception variable
		catch(RemoteException remoteexception)
		{
			stringbuilder1 = new StringBuilder();
		}
		stringbuilder1.append("RemoteException during connect for ");
		stringbuilder1.append(((Object) (mServiceComponent)));
		Log.w("MediaBrowserCompat", stringbuilder1.toString());
		if(MediaBrowserCompat.DEBUG)
		{
			Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
			dump();
		}
	//* 132  294:astore_1        
	//* 133  295:goto            229
	}

	final MediaBrowserCompat.MediaBrowserImplBase.MediaServiceConnection this$1;
	final IBinder val$binder;
	final ComponentName val$name;

	MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$1()
	{
		this$1 = final_mediaserviceconnection;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
		val$name = componentname;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #29  <Field ComponentName val$name>
		val$binder = IBinder.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #31  <Field IBinder val$binder>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #34  <Method void Object()>
	//   11   19:return          
	}
}
