// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat

class MediaBrowserCompat$MediaBrowserImplBase$1
	implements Runnable
{

	public void run()
	{
		if(mState != 0) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//    2    4:getfield        #30  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
	//    3    7:ifne            11
_L1:
		return;
	//    4   10:return          
_L2:
		boolean flag;
		Intent intent;
		mState = 2;
	//    5   11:aload_0         
	//    6   12:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//    7   15:iconst_2        
	//    8   16:putfield        #30  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
		if(MediaBrowserCompat.DEBUG && mServiceConnection != null)
	//*   9   19:getstatic       #34  <Field boolean MediaBrowserCompat.DEBUG>
	//*  10   22:ifeq            68
	//*  11   25:aload_0         
	//*  12   26:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//*  13   29:getfield        #38  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
	//*  14   32:ifnull          68
			throw new RuntimeException((new StringBuilder()).append("mServiceConnection should be null. Instead it is ").append(((Object) (mServiceConnection))).toString());
	//   15   35:new             #40  <Class RuntimeException>
	//   16   38:dup             
	//   17   39:new             #42  <Class StringBuilder>
	//   18   42:dup             
	//   19   43:invokespecial   #43  <Method void StringBuilder()>
	//   20   46:ldc1            #45  <String "mServiceConnection should be null. Instead it is ">
	//   21   48:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   22   51:aload_0         
	//   23   52:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//   24   55:getfield        #38  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
	//   25   58:invokevirtual   #52  <Method StringBuilder StringBuilder.append(Object)>
	//   26   61:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   27   64:invokespecial   #59  <Method void RuntimeException(String)>
	//   28   67:athrow          
		if(mServiceBinderWrapper != null)
	//*  29   68:aload_0         
	//*  30   69:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//*  31   72:getfield        #63  <Field MediaBrowserCompat$ServiceBinderWrapper MediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper>
	//*  32   75:ifnull          111
			throw new RuntimeException((new StringBuilder()).append("mServiceBinderWrapper should be null. Instead it is ").append(((Object) (mServiceBinderWrapper))).toString());
	//   33   78:new             #40  <Class RuntimeException>
	//   34   81:dup             
	//   35   82:new             #42  <Class StringBuilder>
	//   36   85:dup             
	//   37   86:invokespecial   #43  <Method void StringBuilder()>
	//   38   89:ldc1            #65  <String "mServiceBinderWrapper should be null. Instead it is ">
	//   39   91:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   40   94:aload_0         
	//   41   95:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//   42   98:getfield        #63  <Field MediaBrowserCompat$ServiceBinderWrapper MediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper>
	//   43  101:invokevirtual   #52  <Method StringBuilder StringBuilder.append(Object)>
	//   44  104:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   45  107:invokespecial   #59  <Method void RuntimeException(String)>
	//   46  110:athrow          
		if(mCallbacksMessenger != null)
	//*  47  111:aload_0         
	//*  48  112:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//*  49  115:getfield        #69  <Field android.os.Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
	//*  50  118:ifnull          154
			throw new RuntimeException((new StringBuilder()).append("mCallbacksMessenger should be null. Instead it is ").append(((Object) (mCallbacksMessenger))).toString());
	//   51  121:new             #40  <Class RuntimeException>
	//   52  124:dup             
	//   53  125:new             #42  <Class StringBuilder>
	//   54  128:dup             
	//   55  129:invokespecial   #43  <Method void StringBuilder()>
	//   56  132:ldc1            #71  <String "mCallbacksMessenger should be null. Instead it is ">
	//   57  134:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   58  137:aload_0         
	//   59  138:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//   60  141:getfield        #69  <Field android.os.Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
	//   61  144:invokevirtual   #52  <Method StringBuilder StringBuilder.append(Object)>
	//   62  147:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   63  150:invokespecial   #59  <Method void RuntimeException(String)>
	//   64  153:athrow          
		intent = new Intent("android.media.browse.MediaBrowserService");
	//   65  154:new             #73  <Class Intent>
	//   66  157:dup             
	//   67  158:ldc1            #75  <String "android.media.browse.MediaBrowserService">
	//   68  160:invokespecial   #76  <Method void Intent(String)>
	//   69  163:astore_3        
		intent.setComponent(mServiceComponent);
	//   70  164:aload_3         
	//   71  165:aload_0         
	//   72  166:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//   73  169:getfield        #80  <Field android.content.ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
	//   74  172:invokevirtual   #84  <Method Intent Intent.setComponent(android.content.ComponentName)>
	//   75  175:pop             
		mServiceConnection = new diaServiceConnection(MediaBrowserCompat.MediaBrowserImplBase.this);
	//   76  176:aload_0         
	//   77  177:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//   78  180:new             #86  <Class MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection>
	//   79  183:dup             
	//   80  184:aload_0         
	//   81  185:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//   82  188:invokespecial   #88  <Method void MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection(MediaBrowserCompat$MediaBrowserImplBase)>
	//   83  191:putfield        #38  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
		flag = false;
	//   84  194:iconst_0        
	//   85  195:istore_1        
		boolean flag1 = mContext.bindService(intent, ((android.content.ServiceConnection) (mServiceConnection)), 1);
	//   86  196:aload_0         
	//   87  197:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//   88  200:getfield        #92  <Field Context MediaBrowserCompat$MediaBrowserImplBase.mContext>
	//   89  203:aload_3         
	//   90  204:aload_0         
	//   91  205:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//   92  208:getfield        #38  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
	//   93  211:iconst_1        
	//   94  212:invokevirtual   #98  <Method boolean Context.bindService(Intent, android.content.ServiceConnection, int)>
	//   95  215:istore_2        
		flag = flag1;
	//   96  216:iload_2         
	//   97  217:istore_1        
_L4:
		if(!flag)
	//*  98  218:iload_1         
	//*  99  219:ifne            239
		{
			forceCloseConnection();
	//  100  222:aload_0         
	//  101  223:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//  102  226:invokevirtual   #101 <Method void MediaBrowserCompat$MediaBrowserImplBase.forceCloseConnection()>
			mCallback.onConnectionFailed();
	//  103  229:aload_0         
	//  104  230:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//  105  233:getfield        #105 <Field MediaBrowserCompat$ConnectionCallback MediaBrowserCompat$MediaBrowserImplBase.mCallback>
	//  106  236:invokevirtual   #110 <Method void MediaBrowserCompat$ConnectionCallback.onConnectionFailed()>
		}
		if(MediaBrowserCompat.DEBUG)
	//* 107  239:getstatic       #34  <Field boolean MediaBrowserCompat.DEBUG>
	//* 108  242:ifeq            10
		{
			Log.d("MediaBrowserCompat", "connect...");
	//  109  245:ldc1            #112 <String "MediaBrowserCompat">
	//  110  247:ldc1            #114 <String "connect...">
	//  111  249:invokestatic    #120 <Method int Log.d(String, String)>
	//  112  252:pop             
			dump();
	//  113  253:aload_0         
	//  114  254:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//  115  257:invokevirtual   #123 <Method void MediaBrowserCompat$MediaBrowserImplBase.dump()>
			return;
	//  116  260:return          
		}
		if(true) goto _L1; else goto _L3
_L3:
		Exception exception;
		exception;
	//  117  261:astore_3        
		Log.e("MediaBrowserCompat", (new StringBuilder()).append("Failed binding to service ").append(((Object) (mServiceComponent))).toString());
	//  118  262:ldc1            #112 <String "MediaBrowserCompat">
	//  119  264:new             #42  <Class StringBuilder>
	//  120  267:dup             
	//  121  268:invokespecial   #43  <Method void StringBuilder()>
	//  122  271:ldc1            #125 <String "Failed binding to service ">
	//  123  273:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//  124  276:aload_0         
	//  125  277:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//  126  280:getfield        #80  <Field android.content.ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
	//  127  283:invokevirtual   #52  <Method StringBuilder StringBuilder.append(Object)>
	//  128  286:invokevirtual   #56  <Method String StringBuilder.toString()>
	//  129  289:invokestatic    #128 <Method int Log.e(String, String)>
	//  130  292:pop             
		  goto _L4
	//* 131  293:goto            218
	}

	final MediaBrowserCompat.MediaBrowserImplBase this$0;

	MediaBrowserCompat$MediaBrowserImplBase$1()
	{
		this$0 = MediaBrowserCompat.MediaBrowserImplBase.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
	//    5    9:return          
	}
}
