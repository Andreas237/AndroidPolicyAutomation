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
		Exception exception;
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
	//*  10   22:ifeq            74
	//*  11   25:aload_0         
	//*  12   26:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//*  13   29:getfield        #38  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
	//*  14   32:ifnull          74
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   15   35:new             #40  <Class StringBuilder>
	//   16   38:dup             
	//   17   39:invokespecial   #41  <Method void StringBuilder()>
	//   18   42:astore_2        
			stringbuilder.append("mServiceConnection should be null. Instead it is ");
	//   19   43:aload_2         
	//   20   44:ldc1            #43  <String "mServiceConnection should be null. Instead it is ">
	//   21   46:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   22   49:pop             
			stringbuilder.append(((Object) (mServiceConnection)));
	//   23   50:aload_2         
	//   24   51:aload_0         
	//   25   52:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//   26   55:getfield        #38  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
	//   27   58:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
	//   28   61:pop             
			throw new RuntimeException(stringbuilder.toString());
	//   29   62:new             #52  <Class RuntimeException>
	//   30   65:dup             
	//   31   66:aload_2         
	//   32   67:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   33   70:invokespecial   #59  <Method void RuntimeException(String)>
	//   34   73:athrow          
		}
		if(mServiceBinderWrapper != null)
	//*  35   74:aload_0         
	//*  36   75:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//*  37   78:getfield        #63  <Field MediaBrowserCompat$ServiceBinderWrapper MediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper>
	//*  38   81:ifnull          123
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   39   84:new             #40  <Class StringBuilder>
	//   40   87:dup             
	//   41   88:invokespecial   #41  <Method void StringBuilder()>
	//   42   91:astore_2        
			stringbuilder1.append("mServiceBinderWrapper should be null. Instead it is ");
	//   43   92:aload_2         
	//   44   93:ldc1            #65  <String "mServiceBinderWrapper should be null. Instead it is ">
	//   45   95:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   46   98:pop             
			stringbuilder1.append(((Object) (mServiceBinderWrapper)));
	//   47   99:aload_2         
	//   48  100:aload_0         
	//   49  101:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//   50  104:getfield        #63  <Field MediaBrowserCompat$ServiceBinderWrapper MediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper>
	//   51  107:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
	//   52  110:pop             
			throw new RuntimeException(stringbuilder1.toString());
	//   53  111:new             #52  <Class RuntimeException>
	//   54  114:dup             
	//   55  115:aload_2         
	//   56  116:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   57  119:invokespecial   #59  <Method void RuntimeException(String)>
	//   58  122:athrow          
		}
		if(mCallbacksMessenger != null)
	//*  59  123:aload_0         
	//*  60  124:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//*  61  127:getfield        #69  <Field android.os.Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
	//*  62  130:ifnull          172
		{
			StringBuilder stringbuilder2 = new StringBuilder();
	//   63  133:new             #40  <Class StringBuilder>
	//   64  136:dup             
	//   65  137:invokespecial   #41  <Method void StringBuilder()>
	//   66  140:astore_2        
			stringbuilder2.append("mCallbacksMessenger should be null. Instead it is ");
	//   67  141:aload_2         
	//   68  142:ldc1            #71  <String "mCallbacksMessenger should be null. Instead it is ">
	//   69  144:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   70  147:pop             
			stringbuilder2.append(((Object) (mCallbacksMessenger)));
	//   71  148:aload_2         
	//   72  149:aload_0         
	//   73  150:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//   74  153:getfield        #69  <Field android.os.Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
	//   75  156:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
	//   76  159:pop             
			throw new RuntimeException(stringbuilder2.toString());
	//   77  160:new             #52  <Class RuntimeException>
	//   78  163:dup             
	//   79  164:aload_2         
	//   80  165:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   81  168:invokespecial   #59  <Method void RuntimeException(String)>
	//   82  171:athrow          
		}
		Object obj = ((Object) (new Intent("android.media.browse.MediaBrowserService")));
	//   83  172:new             #73  <Class Intent>
	//   84  175:dup             
	//   85  176:ldc1            #75  <String "android.media.browse.MediaBrowserService">
	//   86  178:invokespecial   #76  <Method void Intent(String)>
	//   87  181:astore_2        
		((Intent) (obj)).setComponent(mServiceComponent);
	//   88  182:aload_2         
	//   89  183:aload_0         
	//   90  184:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//   91  187:getfield        #80  <Field android.content.ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
	//   92  190:invokevirtual   #84  <Method Intent Intent.setComponent(android.content.ComponentName)>
	//   93  193:pop             
		mServiceConnection = new diaServiceConnection(MediaBrowserCompat.MediaBrowserImplBase.this);
	//   94  194:aload_0         
	//   95  195:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//   96  198:new             #86  <Class MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection>
	//   97  201:dup             
	//   98  202:aload_0         
	//   99  203:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//  100  206:invokespecial   #88  <Method void MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection(MediaBrowserCompat$MediaBrowserImplBase)>
	//  101  209:putfield        #38  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
		boolean flag;
		try
		{
			flag = mContext.bindService(((Intent) (obj)), ((android.content.ServiceConnection) (mServiceConnection)), 1);
	//  102  212:aload_0         
	//  103  213:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//  104  216:getfield        #92  <Field Context MediaBrowserCompat$MediaBrowserImplBase.mContext>
	//  105  219:aload_2         
	//  106  220:aload_0         
	//  107  221:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//  108  224:getfield        #38  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
	//  109  227:iconst_1        
	//  110  228:invokevirtual   #98  <Method boolean Context.bindService(Intent, android.content.ServiceConnection, int)>
	//  111  231:istore_1        
		}
	//* 112  232:goto            274
	//* 113  235:new             #40  <Class StringBuilder>
	//* 114  238:dup             
	//* 115  239:invokespecial   #41  <Method void StringBuilder()>
	//* 116  242:astore_2        
	//* 117  243:aload_2         
	//* 118  244:ldc1            #100 <String "Failed binding to service ">
	//* 119  246:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//* 120  249:pop             
	//* 121  250:aload_2         
	//* 122  251:aload_0         
	//* 123  252:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//* 124  255:getfield        #80  <Field android.content.ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
	//* 125  258:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
	//* 126  261:pop             
	//* 127  262:ldc1            #102 <String "MediaBrowserCompat">
	//* 128  264:aload_2         
	//* 129  265:invokevirtual   #56  <Method String StringBuilder.toString()>
	//* 130  268:invokestatic    #108 <Method int Log.e(String, String)>
	//* 131  271:pop             
	//* 132  272:iconst_0        
	//* 133  273:istore_1        
	//* 134  274:iload_1         
	//* 135  275:ifne            295
	//* 136  278:aload_0         
	//* 137  279:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//* 138  282:invokevirtual   #111 <Method void MediaBrowserCompat$MediaBrowserImplBase.forceCloseConnection()>
	//* 139  285:aload_0         
	//* 140  286:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//* 141  289:getfield        #115 <Field MediaBrowserCompat$ConnectionCallback MediaBrowserCompat$MediaBrowserImplBase.mCallback>
	//* 142  292:invokevirtual   #120 <Method void MediaBrowserCompat$ConnectionCallback.onConnectionFailed()>
	//* 143  295:getstatic       #34  <Field boolean MediaBrowserCompat.DEBUG>
	//* 144  298:ifeq            316
	//* 145  301:ldc1            #102 <String "MediaBrowserCompat">
	//* 146  303:ldc1            #122 <String "connect...">
	//* 147  305:invokestatic    #125 <Method int Log.d(String, String)>
	//* 148  308:pop             
	//* 149  309:aload_0         
	//* 150  310:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//* 151  313:invokevirtual   #128 <Method void MediaBrowserCompat$MediaBrowserImplBase.dump()>
	//* 152  316:return          
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			obj = ((Object) (new StringBuilder()));
			((StringBuilder) (obj)).append("Failed binding to service ");
			((StringBuilder) (obj)).append(((Object) (mServiceComponent)));
			Log.e("MediaBrowserCompat", ((StringBuilder) (obj)).toString());
			flag = false;
		}
		if(!flag)
		{
			forceCloseConnection();
			mCallback.onConnectionFailed();
		}
		if(MediaBrowserCompat.DEBUG)
		{
			Log.d("MediaBrowserCompat", "connect...");
			dump();
		}
	//* 153  317:astore_2        
	//* 154  318:goto            235
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
