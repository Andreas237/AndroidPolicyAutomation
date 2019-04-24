// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.*;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat

private class MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection
	implements ServiceConnection
{

	private void postOrRun(Runnable runnable)
	{
		if(Thread.currentThread() == mHandler.getLooper().getThread())
	//*   0    0:invokestatic    #34  <Method Thread Thread.currentThread()>
	//*   1    3:aload_0         
	//*   2    4:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//*   3    7:getfield        #38  <Field MediaBrowserCompat$CallbackHandler MediaBrowserCompat$MediaBrowserImplBase.mHandler>
	//*   4   10:invokevirtual   #44  <Method Looper MediaBrowserCompat$CallbackHandler.getLooper()>
	//*   5   13:invokevirtual   #49  <Method Thread Looper.getThread()>
	//*   6   16:if_acmpne       26
		{
			runnable.run();
	//    7   19:aload_1         
	//    8   20:invokeinterface #54  <Method void Runnable.run()>
			return;
	//    9   25:return          
		} else
		{
			mHandler.post(runnable);
	//   10   26:aload_0         
	//   11   27:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//   12   30:getfield        #38  <Field MediaBrowserCompat$CallbackHandler MediaBrowserCompat$MediaBrowserImplBase.mHandler>
	//   13   33:aload_1         
	//   14   34:invokevirtual   #58  <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   15   37:pop             
			return;
	//   16   38:return          
		}
	}

	boolean isCurrent(String s)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		if(mServiceConnection != this || mState == 0 || mState == 1)
	//*   2    2:aload_0         
	//*   3    3:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//*   4    6:getfield        #64  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
	//*   5    9:aload_0         
	//*   6   10:if_acmpne       34
	//*   7   13:aload_0         
	//*   8   14:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//*   9   17:getfield        #68  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
	//*  10   20:ifeq            34
	//*  11   23:aload_0         
	//*  12   24:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//*  13   27:getfield        #68  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
	//*  14   30:iconst_1        
	//*  15   31:icmpne          116
		{
			if(mState != 0 && mState != 1)
	//*  16   34:aload_0         
	//*  17   35:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//*  18   38:getfield        #68  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
	//*  19   41:ifeq            114
	//*  20   44:aload_0         
	//*  21   45:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//*  22   48:getfield        #68  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
	//*  23   51:iconst_1        
	//*  24   52:icmpeq          114
				Log.i("MediaBrowserCompat", (new StringBuilder()).append(s).append(" for ").append(((Object) (mServiceComponent))).append(" with mServiceConnection=").append(((Object) (mServiceConnection))).append(" this=").append(((Object) (this))).toString());
	//   25   55:ldc1            #70  <String "MediaBrowserCompat">
	//   26   57:new             #72  <Class StringBuilder>
	//   27   60:dup             
	//   28   61:invokespecial   #73  <Method void StringBuilder()>
	//   29   64:aload_1         
	//   30   65:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   31   68:ldc1            #79  <String " for ">
	//   32   70:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   33   73:aload_0         
	//   34   74:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//   35   77:getfield        #83  <Field ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
	//   36   80:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
	//   37   83:ldc1            #88  <String " with mServiceConnection=">
	//   38   85:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   39   88:aload_0         
	//   40   89:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//   41   92:getfield        #64  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
	//   42   95:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
	//   43   98:ldc1            #90  <String " this=">
	//   44  100:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   45  103:aload_0         
	//   46  104:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
	//   47  107:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   48  110:invokestatic    #100 <Method int Log.i(String, String)>
	//   49  113:pop             
			flag = false;
	//   50  114:iconst_0        
	//   51  115:istore_2        
		}
		return flag;
	//   52  116:iload_2         
	//   53  117:ireturn         
	}

	public void onServiceConnected(final ComponentName name, final IBinder binder)
	{
		postOrRun(new Runnable() {

			public void run()
			{
				if(MediaBrowserCompat.DEBUG)
			//*   0    0:getstatic       #42  <Field boolean MediaBrowserCompat.DEBUG>
			//*   1    3:ifeq            56
				{
					Log.d("MediaBrowserCompat", (new StringBuilder()).append("MediaServiceConnection.onServiceConnected name=").append(((Object) (name))).append(" binder=").append(((Object) (binder))).toString());
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
				if(isCurrent("onServiceConnected"))
			//*  23   56:aload_0         
			//*  24   57:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
			//*  25   60:ldc1            #76  <String "onServiceConnected">
			//*  26   62:invokevirtual   #80  <Method boolean MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.isCurrent(String)>
			//*  27   65:ifne            69
			//*  28   68:return          
				{
					mServiceBinderWrapper = new MediaBrowserCompat.ServiceBinderWrapper(binder, mRootHints);
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
					mState = 2;
			//   62  150:aload_0         
			//   63  151:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
			//   64  154:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
			//   65  157:iconst_2        
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
			//* 107  257:ifeq            68
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
						return;
			//  116  278:return          
					}
				}
			}

			final MediaBrowserCompat.MediaBrowserImplBase.MediaServiceConnection this$1;
			final IBinder val$binder;
			final ComponentName val$name;

			
			{
				this$1 = MediaBrowserCompat.MediaBrowserImplBase.MediaServiceConnection.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				name = componentname;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #29  <Field ComponentName val$name>
				binder = ibinder;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #31  <Field IBinder val$binder>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #34  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #14  <Class MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$1>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokespecial   #105 <Method void MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$1(MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection, ComponentName, IBinder)>
	//    7   11:invokespecial   #107 <Method void postOrRun(Runnable)>
	//    8   14:return          
	}

	public void onServiceDisconnected(final ComponentName name)
	{
		postOrRun(new Runnable() {

			public void run()
			{
				if(MediaBrowserCompat.DEBUG)
			//*   0    0:getstatic       #36  <Field boolean MediaBrowserCompat.DEBUG>
			//*   1    3:ifeq            71
				{
					Log.d("MediaBrowserCompat", (new StringBuilder()).append("MediaServiceConnection.onServiceDisconnected name=").append(((Object) (name))).append(" this=").append(((Object) (this))).append(" mServiceConnection=").append(((Object) (mServiceConnection))).toString());
			//    2    6:ldc1            #38  <String "MediaBrowserCompat">
			//    3    8:new             #40  <Class StringBuilder>
			//    4   11:dup             
			//    5   12:invokespecial   #41  <Method void StringBuilder()>
			//    6   15:ldc1            #43  <String "MediaServiceConnection.onServiceDisconnected name=">
			//    7   17:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
			//    8   20:aload_0         
			//    9   21:getfield        #27  <Field ComponentName val$name>
			//   10   24:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
			//   11   27:ldc1            #52  <String " this=">
			//   12   29:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
			//   13   32:aload_0         
			//   14   33:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
			//   15   36:ldc1            #54  <String " mServiceConnection=">
			//   16   38:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
			//   17   41:aload_0         
			//   18   42:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
			//   19   45:getfield        #58  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
			//   20   48:getfield        #61  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
			//   21   51:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
			//   22   54:invokevirtual   #65  <Method String StringBuilder.toString()>
			//   23   57:invokestatic    #71  <Method int Log.d(String, String)>
			//   24   60:pop             
					dump();
			//   25   61:aload_0         
			//   26   62:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
			//   27   65:getfield        #58  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
			//   28   68:invokevirtual   #74  <Method void MediaBrowserCompat$MediaBrowserImplBase.dump()>
				}
				if(!isCurrent("onServiceDisconnected"))
			//*  29   71:aload_0         
			//*  30   72:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
			//*  31   75:ldc1            #75  <String "onServiceDisconnected">
			//*  32   77:invokevirtual   #79  <Method boolean MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.isCurrent(String)>
			//*  33   80:ifne            84
				{
					return;
			//   34   83:return          
				} else
				{
					mServiceBinderWrapper = null;
			//   35   84:aload_0         
			//   36   85:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
			//   37   88:getfield        #58  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
			//   38   91:aconst_null     
			//   39   92:putfield        #83  <Field MediaBrowserCompat$ServiceBinderWrapper MediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper>
					mCallbacksMessenger = null;
			//   40   95:aload_0         
			//   41   96:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
			//   42   99:getfield        #58  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
			//   43  102:aconst_null     
			//   44  103:putfield        #87  <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
					mHandler.setCallbacksMessenger(((Messenger) (null)));
			//   45  106:aload_0         
			//   46  107:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
			//   47  110:getfield        #58  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
			//   48  113:getfield        #91  <Field MediaBrowserCompat$CallbackHandler MediaBrowserCompat$MediaBrowserImplBase.mHandler>
			//   49  116:aconst_null     
			//   50  117:invokevirtual   #97  <Method void MediaBrowserCompat$CallbackHandler.setCallbacksMessenger(Messenger)>
					mState = 4;
			//   51  120:aload_0         
			//   52  121:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
			//   53  124:getfield        #58  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
			//   54  127:iconst_4        
			//   55  128:putfield        #101 <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
					mCallback.onConnectionSuspended();
			//   56  131:aload_0         
			//   57  132:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
			//   58  135:getfield        #58  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
			//   59  138:getfield        #105 <Field MediaBrowserCompat$ConnectionCallback MediaBrowserCompat$MediaBrowserImplBase.mCallback>
			//   60  141:invokevirtual   #110 <Method void MediaBrowserCompat$ConnectionCallback.onConnectionSuspended()>
					return;
			//   61  144:return          
				}
			}

			final MediaBrowserCompat.MediaBrowserImplBase.MediaServiceConnection this$1;
			final ComponentName val$name;

			
			{
				this$1 = MediaBrowserCompat.MediaBrowserImplBase.MediaServiceConnection.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				name = componentname;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #27  <Field ComponentName val$name>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #30  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #16  <Class MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$2>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #112 <Method void MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$2(MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection, ComponentName)>
	//    6   10:invokespecial   #107 <Method void postOrRun(Runnable)>
	//    7   13:return          
	}

	final MediaBrowserCompat.MediaBrowserImplBase this$0;

	MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection()
	{
		this$0 = MediaBrowserCompat.MediaBrowserImplBase.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #25  <Method void Object()>
	//    5    9:return          
	}
}
