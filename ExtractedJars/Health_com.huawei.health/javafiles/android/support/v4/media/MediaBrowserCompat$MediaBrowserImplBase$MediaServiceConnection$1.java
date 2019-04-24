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
		if(MediaBrowserCompat.DEBUG)
	//*   0    0:getstatic       #42  <Field boolean MediaBrowserCompat.DEBUG>
	//*   1    3:ifeq            56
		{
			Log.d("MediaBrowserCompat", (new StringBuilder()).append("MediaServiceConnection.onServiceConnected name=").append(((Object) (val$name))).append(" binder=").append(((Object) (val$binder))).toString());
	//    2    6:ldc1            #44  <String "MediaBrowserCompat">
	//    3    8:new             #46  <Class StringBuilder>
	//    4   11:dup             
	//    5   12:invokespecial   #47  <Method void StringBuilder()>
	//    6   15:ldc1            #49  <String "MediaServiceConnection.onServiceConnected name=">
	//    7   17:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//    8   20:aload_0         
	//    9   21:getfield        #29  <Field ComponentName val$name>
	//   10   24:invokevirtual   #56  <Method StringBuilder StringBuilder.append(Object)>
	//   11   27:ldc1            #58  <String " binder=">
	//   12   29:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   13   32:aload_0         
	//   14   33:getfield        #31  <Field IBinder val$binder>
	//   15   36:invokevirtual   #56  <Method StringBuilder StringBuilder.append(Object)>
	//   16   39:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   17   42:invokestatic    #68  <Method int Log.d(String, String)>
	//   18   45:pop             
			dump();
	//   19   46:aload_0         
	//   20   47:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
	//   21   50:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
	//   22   53:invokevirtual   #75  <Method void MediaBrowserCompat$MediaBrowserImplBase.dump()>
		}
		if(!isCurrent("onServiceConnected"))
	//*  23   56:aload_0         
	//*  24   57:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
	//*  25   60:ldc1            #76  <String "onServiceConnected">
	//*  26   62:invokevirtual   #80  <Method boolean MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.isCurrent(String)>
	//*  27   65:ifne            69
			return;
	//   28   68:return          
		mServiceBinderWrapper = new MediaBrowserCompat.ServiceBinderWrapper(val$binder, mRootHints);
	//   29   69:aload_0         
	//   30   70:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
	//   31   73:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
	//   32   76:new             #82  <Class MediaBrowserCompat$ServiceBinderWrapper>
	//   33   79:dup             
	//   34   80:aload_0         
	//   35   81:getfield        #31  <Field IBinder val$binder>
	//   36   84:aload_0         
	//   37   85:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
	//   38   88:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
	//   39   91:getfield        #86  <Field android.os.Bundle MediaBrowserCompat$MediaBrowserImplBase.mRootHints>
	//   40   94:invokespecial   #89  <Method void MediaBrowserCompat$ServiceBinderWrapper(IBinder, android.os.Bundle)>
	//   41   97:putfield        #93  <Field MediaBrowserCompat$ServiceBinderWrapper MediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper>
		mCallbacksMessenger = new Messenger(((android.os.Handler) (mHandler)));
	//   42  100:aload_0         
	//   43  101:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
	//   44  104:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
	//   45  107:new             #95  <Class Messenger>
	//   46  110:dup             
	//   47  111:aload_0         
	//   48  112:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
	//   49  115:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
	//   50  118:getfield        #99  <Field MediaBrowserCompat$CallbackHandler MediaBrowserCompat$MediaBrowserImplBase.mHandler>
	//   51  121:invokespecial   #102 <Method void Messenger(android.os.Handler)>
	//   52  124:putfield        #106 <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
		mHandler.setCallbacksMessenger(mCallbacksMessenger);
	//   53  127:aload_0         
	//   54  128:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
	//   55  131:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
	//   56  134:getfield        #99  <Field MediaBrowserCompat$CallbackHandler MediaBrowserCompat$MediaBrowserImplBase.mHandler>
	//   57  137:aload_0         
	//   58  138:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
	//   59  141:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
	//   60  144:getfield        #106 <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
	//   61  147:invokevirtual   #112 <Method void MediaBrowserCompat$CallbackHandler.setCallbacksMessenger(Messenger)>
		mState = 1;
	//   62  150:aload_0         
	//   63  151:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
	//   64  154:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
	//   65  157:iconst_1        
	//   66  158:putfield        #116 <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
		try
		{
			if(MediaBrowserCompat.DEBUG)
	//*  67  161:getstatic       #42  <Field boolean MediaBrowserCompat.DEBUG>
	//*  68  164:ifeq            185
			{
				Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
	//   69  167:ldc1            #44  <String "MediaBrowserCompat">
	//   70  169:ldc1            #118 <String "ServiceCallbacks.onConnect...">
	//   71  171:invokestatic    #68  <Method int Log.d(String, String)>
	//   72  174:pop             
				dump();
	//   73  175:aload_0         
	//   74  176:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
	//   75  179:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
	//   76  182:invokevirtual   #75  <Method void MediaBrowserCompat$MediaBrowserImplBase.dump()>
			}
			mServiceBinderWrapper.connect(mContext, mCallbacksMessenger);
	//   77  185:aload_0         
	//   78  186:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
	//   79  189:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
	//   80  192:getfield        #93  <Field MediaBrowserCompat$ServiceBinderWrapper MediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper>
	//   81  195:aload_0         
	//   82  196:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
	//   83  199:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
	//   84  202:getfield        #122 <Field android.content.Context MediaBrowserCompat$MediaBrowserImplBase.mContext>
	//   85  205:aload_0         
	//   86  206:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
	//   87  209:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
	//   88  212:getfield        #106 <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
	//   89  215:invokevirtual   #126 <Method void MediaBrowserCompat$ServiceBinderWrapper.connect(android.content.Context, Messenger)>
			return;
	//   90  218:return          
		}
		catch(RemoteException remoteexception)
	//*  91  219:astore_1        
		{
			Log.w("MediaBrowserCompat", (new StringBuilder()).append("RemoteException during connect for ").append(((Object) (mServiceComponent))).toString());
	//   92  220:ldc1            #44  <String "MediaBrowserCompat">
	//   93  222:new             #46  <Class StringBuilder>
	//   94  225:dup             
	//   95  226:invokespecial   #47  <Method void StringBuilder()>
	//   96  229:ldc1            #128 <String "RemoteException during connect for ">
	//   97  231:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   98  234:aload_0         
	//   99  235:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
	//  100  238:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
	//  101  241:getfield        #131 <Field ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
	//  102  244:invokevirtual   #56  <Method StringBuilder StringBuilder.append(Object)>
	//  103  247:invokevirtual   #62  <Method String StringBuilder.toString()>
	//  104  250:invokestatic    #134 <Method int Log.w(String, String)>
	//  105  253:pop             
		}
		if(MediaBrowserCompat.DEBUG)
	//* 106  254:getstatic       #42  <Field boolean MediaBrowserCompat.DEBUG>
	//* 107  257:ifeq            278
		{
			Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
	//  108  260:ldc1            #44  <String "MediaBrowserCompat">
	//  109  262:ldc1            #118 <String "ServiceCallbacks.onConnect...">
	//  110  264:invokestatic    #68  <Method int Log.d(String, String)>
	//  111  267:pop             
			dump();
	//  112  268:aload_0         
	//  113  269:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
	//  114  272:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
	//  115  275:invokevirtual   #75  <Method void MediaBrowserCompat$MediaBrowserImplBase.dump()>
		}
	//  116  278:return          
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
