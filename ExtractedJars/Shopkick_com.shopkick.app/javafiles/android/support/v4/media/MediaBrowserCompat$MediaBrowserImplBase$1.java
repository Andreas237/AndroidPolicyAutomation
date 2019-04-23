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
		if(mState == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//*   2    4:getfield        #30  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		mState = 2;
	//    5   11:aload_0         
	//    6   12:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//    7   15:iconst_2        
	//    8   16:putfield        #30  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
		if(MediaBrowserCompat.DEBUG && mServiceConnection != null)
	//*   9   19:getstatic       #34  <Field boolean MediaBrowserCompat.DEBUG>
	//*  10   22:ifeq            77
	//*  11   25:aload_0         
	//*  12   26:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//*  13   29:getfield        #38  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
	//*  14   32:ifnonnull       38
	//*  15   35:goto            77
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   16   38:new             #40  <Class StringBuilder>
	//   17   41:dup             
	//   18   42:invokespecial   #41  <Method void StringBuilder()>
	//   19   45:astore_3        
			stringbuilder.append("mServiceConnection should be null. Instead it is ");
	//   20   46:aload_3         
	//   21   47:ldc1            #43  <String "mServiceConnection should be null. Instead it is ">
	//   22   49:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   23   52:pop             
			stringbuilder.append(((Object) (mServiceConnection)));
	//   24   53:aload_3         
	//   25   54:aload_0         
	//   26   55:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//   27   58:getfield        #38  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
	//   28   61:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
	//   29   64:pop             
			throw new RuntimeException(stringbuilder.toString());
	//   30   65:new             #52  <Class RuntimeException>
	//   31   68:dup             
	//   32   69:aload_3         
	//   33   70:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   34   73:invokespecial   #59  <Method void RuntimeException(String)>
	//   35   76:athrow          
		}
		if(mServiceBinderWrapper != null) goto _L2; else goto _L1
	//   36   77:aload_0         
	//   37   78:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//   38   81:getfield        #63  <Field MediaBrowserCompat$ServiceBinderWrapper MediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper>
	//   39   84:ifnonnull       285
_L1:
		if(mCallbacksMessenger != null) goto _L4; else goto _L3
	//   40   87:aload_0         
	//   41   88:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//   42   91:getfield        #67  <Field android.os.Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
	//   43   94:ifnonnull       246
_L3:
		boolean flag;
		Intent intent;
		intent = new Intent("android.media.browse.MediaBrowserService");
	//   44   97:new             #69  <Class Intent>
	//   45  100:dup             
	//   46  101:ldc1            #71  <String "android.media.browse.MediaBrowserService">
	//   47  103:invokespecial   #72  <Method void Intent(String)>
	//   48  106:astore_3        
		intent.setComponent(mServiceComponent);
	//   49  107:aload_3         
	//   50  108:aload_0         
	//   51  109:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//   52  112:getfield        #76  <Field android.content.ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
	//   53  115:invokevirtual   #80  <Method Intent Intent.setComponent(android.content.ComponentName)>
	//   54  118:pop             
		MediaBrowserCompat.MediaBrowserImplBase mediabrowserimplbase = MediaBrowserCompat.MediaBrowserImplBase.this;
	//   55  119:aload_0         
	//   56  120:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//   57  123:astore          4
		mediabrowserimplbase.mServiceConnection = new diaServiceConnection(mediabrowserimplbase);
	//   58  125:aload           4
	//   59  127:new             #82  <Class MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection>
	//   60  130:dup             
	//   61  131:aload           4
	//   62  133:invokespecial   #84  <Method void MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection(MediaBrowserCompat$MediaBrowserImplBase)>
	//   63  136:putfield        #38  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
		flag = false;
	//   64  139:iconst_0        
	//   65  140:istore_1        
		boolean flag1 = mContext.bindService(intent, ((android.content.ServiceConnection) (mServiceConnection)), 1);
	//   66  141:aload_0         
	//   67  142:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//   68  145:getfield        #88  <Field Context MediaBrowserCompat$MediaBrowserImplBase.mContext>
	//   69  148:aload_3         
	//   70  149:aload_0         
	//   71  150:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//   72  153:getfield        #38  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
	//   73  156:iconst_1        
	//   74  157:invokevirtual   #94  <Method boolean Context.bindService(Intent, android.content.ServiceConnection, int)>
	//   75  160:istore_2        
		flag = flag1;
	//   76  161:iload_2         
	//   77  162:istore_1        
		  goto _L5
	//*  78  163:goto            203
_L7:
		StringBuilder stringbuilder1 = new StringBuilder();
	//   79  166:new             #40  <Class StringBuilder>
	//   80  169:dup             
	//   81  170:invokespecial   #41  <Method void StringBuilder()>
	//   82  173:astore_3        
		stringbuilder1.append("Failed binding to service ");
	//   83  174:aload_3         
	//   84  175:ldc1            #96  <String "Failed binding to service ">
	//   85  177:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   86  180:pop             
		stringbuilder1.append(((Object) (mServiceComponent)));
	//   87  181:aload_3         
	//   88  182:aload_0         
	//   89  183:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//   90  186:getfield        #76  <Field android.content.ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
	//   91  189:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
	//   92  192:pop             
		Log.e("MediaBrowserCompat", stringbuilder1.toString());
	//   93  193:ldc1            #98  <String "MediaBrowserCompat">
	//   94  195:aload_3         
	//   95  196:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   96  199:invokestatic    #104 <Method int Log.e(String, String)>
	//   97  202:pop             
_L5:
		if(!flag)
	//*  98  203:iload_1         
	//*  99  204:ifne            224
		{
			forceCloseConnection();
	//  100  207:aload_0         
	//  101  208:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//  102  211:invokevirtual   #107 <Method void MediaBrowserCompat$MediaBrowserImplBase.forceCloseConnection()>
			mCallback.onConnectionFailed();
	//  103  214:aload_0         
	//  104  215:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//  105  218:getfield        #111 <Field MediaBrowserCompat$ConnectionCallback MediaBrowserCompat$MediaBrowserImplBase.mCallback>
	//  106  221:invokevirtual   #116 <Method void MediaBrowserCompat$ConnectionCallback.onConnectionFailed()>
		}
		if(MediaBrowserCompat.DEBUG)
	//* 107  224:getstatic       #34  <Field boolean MediaBrowserCompat.DEBUG>
	//* 108  227:ifeq            245
		{
			Log.d("MediaBrowserCompat", "connect...");
	//  109  230:ldc1            #98  <String "MediaBrowserCompat">
	//  110  232:ldc1            #118 <String "connect...">
	//  111  234:invokestatic    #121 <Method int Log.d(String, String)>
	//  112  237:pop             
			dump();
	//  113  238:aload_0         
	//  114  239:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//  115  242:invokevirtual   #124 <Method void MediaBrowserCompat$MediaBrowserImplBase.dump()>
		}
		return;
	//  116  245:return          
_L4:
		StringBuilder stringbuilder2 = new StringBuilder();
	//  117  246:new             #40  <Class StringBuilder>
	//  118  249:dup             
	//  119  250:invokespecial   #41  <Method void StringBuilder()>
	//  120  253:astore_3        
		stringbuilder2.append("mCallbacksMessenger should be null. Instead it is ");
	//  121  254:aload_3         
	//  122  255:ldc1            #126 <String "mCallbacksMessenger should be null. Instead it is ">
	//  123  257:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//  124  260:pop             
		stringbuilder2.append(((Object) (mCallbacksMessenger)));
	//  125  261:aload_3         
	//  126  262:aload_0         
	//  127  263:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//  128  266:getfield        #67  <Field android.os.Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
	//  129  269:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
	//  130  272:pop             
		throw new RuntimeException(stringbuilder2.toString());
	//  131  273:new             #52  <Class RuntimeException>
	//  132  276:dup             
	//  133  277:aload_3         
	//  134  278:invokevirtual   #56  <Method String StringBuilder.toString()>
	//  135  281:invokespecial   #59  <Method void RuntimeException(String)>
	//  136  284:athrow          
_L2:
		StringBuilder stringbuilder3 = new StringBuilder();
	//  137  285:new             #40  <Class StringBuilder>
	//  138  288:dup             
	//  139  289:invokespecial   #41  <Method void StringBuilder()>
	//  140  292:astore_3        
		stringbuilder3.append("mServiceBinderWrapper should be null. Instead it is ");
	//  141  293:aload_3         
	//  142  294:ldc1            #128 <String "mServiceBinderWrapper should be null. Instead it is ">
	//  143  296:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//  144  299:pop             
		stringbuilder3.append(((Object) (mServiceBinderWrapper)));
	//  145  300:aload_3         
	//  146  301:aload_0         
	//  147  302:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//  148  305:getfield        #63  <Field MediaBrowserCompat$ServiceBinderWrapper MediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper>
	//  149  308:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
	//  150  311:pop             
		throw new RuntimeException(stringbuilder3.toString());
	//  151  312:new             #52  <Class RuntimeException>
	//  152  315:dup             
	//  153  316:aload_3         
	//  154  317:invokevirtual   #56  <Method String StringBuilder.toString()>
	//  155  320:invokespecial   #59  <Method void RuntimeException(String)>
	//  156  323:athrow          
		Exception exception;
		exception;
	//  157  324:astore_3        
		if(true) goto _L7; else goto _L6
_L6:
	//* 158  325:goto            166
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
