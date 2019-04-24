// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.*;
import android.os.*;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Log;
import java.util.*;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat

static class MediaBrowserCompat$MediaBrowserImplBase
	implements MediaBrowserCompat.MediaBrowserImpl, llbackImpl
{
	private class MediaServiceConnection
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

		public void onServiceConnected(final ComponentName name, IBinder ibinder)
		{
			postOrRun(((_cls1) (ibinder)). new Runnable() {

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
				//   39   91:getfield        #86  <Field Bundle MediaBrowserCompat$MediaBrowserImplBase.mRootHints>
				//   40   94:invokespecial   #89  <Method void MediaBrowserCompat$ServiceBinderWrapper(IBinder, Bundle)>
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
				//   84  202:getfield        #122 <Field Context MediaBrowserCompat$MediaBrowserImplBase.mContext>
				//   85  205:aload_0         
				//   86  206:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   87  209:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   88  212:getfield        #106 <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
				//   89  215:invokevirtual   #126 <Method void MediaBrowserCompat$ServiceBinderWrapper.connect(Context, Messenger)>
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

				final MediaServiceConnection this$1;
				final IBinder val$binder;
				final ComponentName val$name;

			
			{
				this$1 = final_mediaserviceconnection;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				name = componentname;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #29  <Field ComponentName val$name>
				binder = IBinder.this;
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

		public void onServiceDisconnected(ComponentName componentname)
		{
			postOrRun(((_cls2) (componentname)). new Runnable() {

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

				final MediaServiceConnection this$1;
				final ComponentName val$name;

			
			{
				this$1 = final_mediaserviceconnection;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				name = ComponentName.this;
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

		MediaServiceConnection()
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


	private static String getStateLabel(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     0 4: default 36
	//	               0 56
	//	               1 59
	//	               2 62
	//	               3 65
	//	               4 68
		default:
			return (new StringBuilder()).append("UNKNOWN/").append(i).toString();
	//    2   36:new             #114 <Class StringBuilder>
	//    3   39:dup             
	//    4   40:invokespecial   #115 <Method void StringBuilder()>
	//    5   43:ldc1            #117 <String "UNKNOWN/">
	//    6   45:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//    7   48:iload_0         
	//    8   49:invokevirtual   #124 <Method StringBuilder StringBuilder.append(int)>
	//    9   52:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   10   55:areturn         

		case 0: // '\0'
			return "CONNECT_STATE_DISCONNECTING";
	//   11   56:ldc1            #129 <String "CONNECT_STATE_DISCONNECTING">
	//   12   58:areturn         

		case 1: // '\001'
			return "CONNECT_STATE_DISCONNECTED";
	//   13   59:ldc1            #130 <String "CONNECT_STATE_DISCONNECTED">
	//   14   61:areturn         

		case 2: // '\002'
			return "CONNECT_STATE_CONNECTING";
	//   15   62:ldc1            #131 <String "CONNECT_STATE_CONNECTING">
	//   16   64:areturn         

		case 3: // '\003'
			return "CONNECT_STATE_CONNECTED";
	//   17   65:ldc1            #132 <String "CONNECT_STATE_CONNECTED">
	//   18   67:areturn         

		case 4: // '\004'
			return "CONNECT_STATE_SUSPENDED";
	//   19   68:ldc1            #133 <String "CONNECT_STATE_SUSPENDED">
	//   20   70:areturn         
		}
	}

	private boolean isCurrent(Messenger messenger, String s)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		if(mCallbacksMessenger != messenger || mState == 0 || mState == 1)
	//*   2    2:aload_0         
	//*   3    3:getfield        #137 <Field Messenger mCallbacksMessenger>
	//*   4    6:aload_1         
	//*   5    7:if_acmpne       25
	//*   6   10:aload_0         
	//*   7   11:getfield        #85  <Field int mState>
	//*   8   14:ifeq            25
	//*   9   17:aload_0         
	//*  10   18:getfield        #85  <Field int mState>
	//*  11   21:iconst_1        
	//*  12   22:icmpne          95
		{
			if(mState != 0 && mState != 1)
	//*  13   25:aload_0         
	//*  14   26:getfield        #85  <Field int mState>
	//*  15   29:ifeq            93
	//*  16   32:aload_0         
	//*  17   33:getfield        #85  <Field int mState>
	//*  18   36:iconst_1        
	//*  19   37:icmpeq          93
				Log.i("MediaBrowserCompat", (new StringBuilder()).append(s).append(" for ").append(((Object) (mServiceComponent))).append(" with mCallbacksMessenger=").append(((Object) (mCallbacksMessenger))).append(" this=").append(((Object) (this))).toString());
	//   20   40:ldc1            #139 <String "MediaBrowserCompat">
	//   21   42:new             #114 <Class StringBuilder>
	//   22   45:dup             
	//   23   46:invokespecial   #115 <Method void StringBuilder()>
	//   24   49:aload_2         
	//   25   50:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   26   53:ldc1            #141 <String " for ">
	//   27   55:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   28   58:aload_0         
	//   29   59:getfield        #100 <Field ComponentName mServiceComponent>
	//   30   62:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
	//   31   65:ldc1            #146 <String " with mCallbacksMessenger=">
	//   32   67:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   33   70:aload_0         
	//   34   71:getfield        #137 <Field Messenger mCallbacksMessenger>
	//   35   74:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
	//   36   77:ldc1            #148 <String " this=">
	//   37   79:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   38   82:aload_0         
	//   39   83:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
	//   40   86:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   41   89:invokestatic    #154 <Method int Log.i(String, String)>
	//   42   92:pop             
			flag = false;
	//   43   93:iconst_0        
	//   44   94:istore_3        
		}
		return flag;
	//   45   95:iload_3         
	//   46   96:ireturn         
	}

	public void connect()
	{
		if(mState != 0 && mState != 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field int mState>
	//*   2    4:ifeq            53
	//*   3    7:aload_0         
	//*   4    8:getfield        #85  <Field int mState>
	//*   5   11:iconst_1        
	//*   6   12:icmpeq          53
		{
			throw new IllegalStateException((new StringBuilder()).append("connect() called while neigther disconnecting nor disconnected (state=").append(getStateLabel(mState)).append(")").toString());
	//    7   15:new             #157 <Class IllegalStateException>
	//    8   18:dup             
	//    9   19:new             #114 <Class StringBuilder>
	//   10   22:dup             
	//   11   23:invokespecial   #115 <Method void StringBuilder()>
	//   12   26:ldc1            #159 <String "connect() called while neigther disconnecting nor disconnected (state=">
	//   13   28:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   14   31:aload_0         
	//   15   32:getfield        #85  <Field int mState>
	//   16   35:invokestatic    #161 <Method String getStateLabel(int)>
	//   17   38:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   18   41:ldc1            #163 <String ")">
	//   19   43:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   20   46:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   21   49:invokespecial   #164 <Method void IllegalStateException(String)>
	//   22   52:athrow          
		} else
		{
			mState = 2;
	//   23   53:aload_0         
	//   24   54:iconst_2        
	//   25   55:putfield        #85  <Field int mState>
			mHandler.post(new Runnable() {

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
				//*  49  115:getfield        #69  <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
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
				//   60  141:getfield        #69  <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
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
				//   73  169:getfield        #80  <Field ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
				//   74  172:invokevirtual   #84  <Method Intent Intent.setComponent(ComponentName)>
				//   75  175:pop             
					mServiceConnection = new MediaServiceConnection();
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
					boolean flag1 = mContext.bindService(intent, ((ServiceConnection) (mServiceConnection)), 1);
				//   86  196:aload_0         
				//   87  197:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				//   88  200:getfield        #92  <Field Context MediaBrowserCompat$MediaBrowserImplBase.mContext>
				//   89  203:aload_3         
				//   90  204:aload_0         
				//   91  205:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				//   92  208:getfield        #38  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
				//   93  211:iconst_1        
				//   94  212:invokevirtual   #98  <Method boolean Context.bindService(Intent, ServiceConnection, int)>
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
				//  126  280:getfield        #80  <Field ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
				//  127  283:invokevirtual   #52  <Method StringBuilder StringBuilder.append(Object)>
				//  128  286:invokevirtual   #56  <Method String StringBuilder.toString()>
				//  129  289:invokestatic    #128 <Method int Log.e(String, String)>
				//  130  292:pop             
					  goto _L4
				//* 131  293:goto            218
				}

				final MediaBrowserCompat.MediaBrowserImplBase this$0;

			
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
);
	//   26   58:aload_0         
	//   27   59:getfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   28   62:new             #13  <Class MediaBrowserCompat$MediaBrowserImplBase$1>
	//   29   65:dup             
	//   30   66:aload_0         
	//   31   67:invokespecial   #167 <Method void MediaBrowserCompat$MediaBrowserImplBase$1(MediaBrowserCompat$MediaBrowserImplBase)>
	//   32   70:invokevirtual   #171 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   33   73:pop             
			return;
	//   34   74:return          
		}
	}

	public void disconnect()
	{
		mState = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #85  <Field int mState>
		mHandler.post(new Runnable() {

			public void run()
			{
				int i;
				if(mCallbacksMessenger != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
			//*   2    4:getfield        #30  <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
			//*   3    7:ifnull          27
					try
					{
						mServiceBinderWrapper.disconnect(mCallbacksMessenger);
			//    4   10:aload_0         
			//    5   11:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
			//    6   14:getfield        #34  <Field MediaBrowserCompat$ServiceBinderWrapper MediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper>
			//    7   17:aload_0         
			//    8   18:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
			//    9   21:getfield        #30  <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
			//   10   24:invokevirtual   #39  <Method void MediaBrowserCompat$ServiceBinderWrapper.disconnect(Messenger)>
					}
			//*  11   27:aload_0         
			//*  12   28:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
			//*  13   31:getfield        #43  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
			//*  14   34:istore_1        
			//*  15   35:aload_0         
			//*  16   36:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
			//*  17   39:invokevirtual   #46  <Method void MediaBrowserCompat$MediaBrowserImplBase.forceCloseConnection()>
			//*  18   42:iload_1         
			//*  19   43:ifeq            54
			//*  20   46:aload_0         
			//*  21   47:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
			//*  22   50:iload_1         
			//*  23   51:putfield        #43  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
			//*  24   54:getstatic       #50  <Field boolean MediaBrowserCompat.DEBUG>
			//*  25   57:ifeq            75
			//*  26   60:ldc1            #52  <String "MediaBrowserCompat">
			//*  27   62:ldc1            #54  <String "disconnect...">
			//*  28   64:invokestatic    #60  <Method int Log.d(String, String)>
			//*  29   67:pop             
			//*  30   68:aload_0         
			//*  31   69:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
			//*  32   72:invokevirtual   #63  <Method void MediaBrowserCompat$MediaBrowserImplBase.dump()>
			//*  33   75:return          
					catch(RemoteException remoteexception)
			//*  34   76:astore_2        
					{
						Log.w("MediaBrowserCompat", (new StringBuilder()).append("RemoteException during connect for ").append(((Object) (mServiceComponent))).toString());
			//   35   77:ldc1            #52  <String "MediaBrowserCompat">
			//   36   79:new             #65  <Class StringBuilder>
			//   37   82:dup             
			//   38   83:invokespecial   #66  <Method void StringBuilder()>
			//   39   86:ldc1            #68  <String "RemoteException during connect for ">
			//   40   88:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
			//   41   91:aload_0         
			//   42   92:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
			//   43   95:getfield        #76  <Field ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
			//   44   98:invokevirtual   #79  <Method StringBuilder StringBuilder.append(Object)>
			//   45  101:invokevirtual   #83  <Method String StringBuilder.toString()>
			//   46  104:invokestatic    #86  <Method int Log.w(String, String)>
			//   47  107:pop             
					}
				i = mState;
				forceCloseConnection();
				if(i != 0)
					mState = i;
				if(MediaBrowserCompat.DEBUG)
				{
					Log.d("MediaBrowserCompat", "disconnect...");
					dump();
				}
			//*  48  108:goto            27
			}

			final MediaBrowserCompat.MediaBrowserImplBase this$0;

			
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
);
	//    3    5:aload_0         
	//    4    6:getfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//    5    9:new             #15  <Class MediaBrowserCompat$MediaBrowserImplBase$2>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokespecial   #173 <Method void MediaBrowserCompat$MediaBrowserImplBase$2(MediaBrowserCompat$MediaBrowserImplBase)>
	//    9   17:invokevirtual   #171 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   10   20:pop             
	//   11   21:return          
	}

	void dump()
	{
		Log.d("MediaBrowserCompat", "MediaBrowserCompat...");
	//    0    0:ldc1            #139 <String "MediaBrowserCompat">
	//    1    2:ldc1            #176 <String "MediaBrowserCompat...">
	//    2    4:invokestatic    #179 <Method int Log.d(String, String)>
	//    3    7:pop             
		Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mServiceComponent=").append(((Object) (mServiceComponent))).toString());
	//    4    8:ldc1            #139 <String "MediaBrowserCompat">
	//    5   10:new             #114 <Class StringBuilder>
	//    6   13:dup             
	//    7   14:invokespecial   #115 <Method void StringBuilder()>
	//    8   17:ldc1            #181 <String "  mServiceComponent=">
	//    9   19:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:aload_0         
	//   11   23:getfield        #100 <Field ComponentName mServiceComponent>
	//   12   26:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
	//   13   29:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   14   32:invokestatic    #179 <Method int Log.d(String, String)>
	//   15   35:pop             
		Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mCallback=").append(((Object) (mCallback))).toString());
	//   16   36:ldc1            #139 <String "MediaBrowserCompat">
	//   17   38:new             #114 <Class StringBuilder>
	//   18   41:dup             
	//   19   42:invokespecial   #115 <Method void StringBuilder()>
	//   20   45:ldc1            #183 <String "  mCallback=">
	//   21   47:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   22   50:aload_0         
	//   23   51:getfield        #102 <Field MediaBrowserCompat$ConnectionCallback mCallback>
	//   24   54:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
	//   25   57:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   26   60:invokestatic    #179 <Method int Log.d(String, String)>
	//   27   63:pop             
		Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mRootHints=").append(((Object) (mRootHints))).toString());
	//   28   64:ldc1            #139 <String "MediaBrowserCompat">
	//   29   66:new             #114 <Class StringBuilder>
	//   30   69:dup             
	//   31   70:invokespecial   #115 <Method void StringBuilder()>
	//   32   73:ldc1            #185 <String "  mRootHints=">
	//   33   75:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   34   78:aload_0         
	//   35   79:getfield        #104 <Field Bundle mRootHints>
	//   36   82:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
	//   37   85:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   38   88:invokestatic    #179 <Method int Log.d(String, String)>
	//   39   91:pop             
		Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mState=").append(getStateLabel(mState)).toString());
	//   40   92:ldc1            #139 <String "MediaBrowserCompat">
	//   41   94:new             #114 <Class StringBuilder>
	//   42   97:dup             
	//   43   98:invokespecial   #115 <Method void StringBuilder()>
	//   44  101:ldc1            #187 <String "  mState=">
	//   45  103:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   46  106:aload_0         
	//   47  107:getfield        #85  <Field int mState>
	//   48  110:invokestatic    #161 <Method String getStateLabel(int)>
	//   49  113:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   50  116:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   51  119:invokestatic    #179 <Method int Log.d(String, String)>
	//   52  122:pop             
		Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mServiceConnection=").append(((Object) (mServiceConnection))).toString());
	//   53  123:ldc1            #139 <String "MediaBrowserCompat">
	//   54  125:new             #114 <Class StringBuilder>
	//   55  128:dup             
	//   56  129:invokespecial   #115 <Method void StringBuilder()>
	//   57  132:ldc1            #189 <String "  mServiceConnection=">
	//   58  134:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   59  137:aload_0         
	//   60  138:getfield        #191 <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mServiceConnection>
	//   61  141:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
	//   62  144:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   63  147:invokestatic    #179 <Method int Log.d(String, String)>
	//   64  150:pop             
		Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mServiceBinderWrapper=").append(((Object) (mServiceBinderWrapper))).toString());
	//   65  151:ldc1            #139 <String "MediaBrowserCompat">
	//   66  153:new             #114 <Class StringBuilder>
	//   67  156:dup             
	//   68  157:invokespecial   #115 <Method void StringBuilder()>
	//   69  160:ldc1            #193 <String "  mServiceBinderWrapper=">
	//   70  162:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   71  165:aload_0         
	//   72  166:getfield        #195 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   73  169:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
	//   74  172:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   75  175:invokestatic    #179 <Method int Log.d(String, String)>
	//   76  178:pop             
		Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mCallbacksMessenger=").append(((Object) (mCallbacksMessenger))).toString());
	//   77  179:ldc1            #139 <String "MediaBrowserCompat">
	//   78  181:new             #114 <Class StringBuilder>
	//   79  184:dup             
	//   80  185:invokespecial   #115 <Method void StringBuilder()>
	//   81  188:ldc1            #197 <String "  mCallbacksMessenger=">
	//   82  190:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   83  193:aload_0         
	//   84  194:getfield        #137 <Field Messenger mCallbacksMessenger>
	//   85  197:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
	//   86  200:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   87  203:invokestatic    #179 <Method int Log.d(String, String)>
	//   88  206:pop             
		Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mRootId=").append(mRootId).toString());
	//   89  207:ldc1            #139 <String "MediaBrowserCompat">
	//   90  209:new             #114 <Class StringBuilder>
	//   91  212:dup             
	//   92  213:invokespecial   #115 <Method void StringBuilder()>
	//   93  216:ldc1            #199 <String "  mRootId=">
	//   94  218:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   95  221:aload_0         
	//   96  222:getfield        #201 <Field String mRootId>
	//   97  225:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   98  228:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   99  231:invokestatic    #179 <Method int Log.d(String, String)>
	//  100  234:pop             
		Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mMediaSessionToken=").append(((Object) (mMediaSessionToken))).toString());
	//  101  235:ldc1            #139 <String "MediaBrowserCompat">
	//  102  237:new             #114 <Class StringBuilder>
	//  103  240:dup             
	//  104  241:invokespecial   #115 <Method void StringBuilder()>
	//  105  244:ldc1            #203 <String "  mMediaSessionToken=">
	//  106  246:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//  107  249:aload_0         
	//  108  250:getfield        #205 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
	//  109  253:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
	//  110  256:invokevirtual   #128 <Method String StringBuilder.toString()>
	//  111  259:invokestatic    #179 <Method int Log.d(String, String)>
	//  112  262:pop             
	//  113  263:return          
	}

	void forceCloseConnection()
	{
		if(mServiceConnection != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #191 <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mServiceConnection>
	//*   2    4:ifnull          18
			mContext.unbindService(((ServiceConnection) (mServiceConnection)));
	//    3    7:aload_0         
	//    4    8:getfield        #98  <Field Context mContext>
	//    5   11:aload_0         
	//    6   12:getfield        #191 <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mServiceConnection>
	//    7   15:invokevirtual   #212 <Method void Context.unbindService(ServiceConnection)>
		mState = 1;
	//    8   18:aload_0         
	//    9   19:iconst_1        
	//   10   20:putfield        #85  <Field int mState>
		mServiceConnection = null;
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:putfield        #191 <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mServiceConnection>
		mServiceBinderWrapper = null;
	//   14   28:aload_0         
	//   15   29:aconst_null     
	//   16   30:putfield        #195 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		mCallbacksMessenger = null;
	//   17   33:aload_0         
	//   18   34:aconst_null     
	//   19   35:putfield        #137 <Field Messenger mCallbacksMessenger>
		mHandler.setCallbacksMessenger(((Messenger) (null)));
	//   20   38:aload_0         
	//   21   39:getfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   22   42:aconst_null     
	//   23   43:invokevirtual   #216 <Method void MediaBrowserCompat$CallbackHandler.setCallbacksMessenger(Messenger)>
		mRootId = null;
	//   24   46:aload_0         
	//   25   47:aconst_null     
	//   26   48:putfield        #201 <Field String mRootId>
		mMediaSessionToken = null;
	//   27   51:aload_0         
	//   28   52:aconst_null     
	//   29   53:putfield        #205 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
	//   30   56:return          
	}

	public Bundle getExtras()
	{
		if(!isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #223 <Method boolean isConnected()>
	//*   2    4:ifne            45
			throw new IllegalStateException((new StringBuilder()).append("getExtras() called while not connected (state=").append(getStateLabel(mState)).append(")").toString());
	//    3    7:new             #157 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:new             #114 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #115 <Method void StringBuilder()>
	//    8   18:ldc1            #225 <String "getExtras() called while not connected (state=">
	//    9   20:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   10   23:aload_0         
	//   11   24:getfield        #85  <Field int mState>
	//   12   27:invokestatic    #161 <Method String getStateLabel(int)>
	//   13   30:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   14   33:ldc1            #163 <String ")">
	//   15   35:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   16   38:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   17   41:invokespecial   #164 <Method void IllegalStateException(String)>
	//   18   44:athrow          
		else
			return mExtras;
	//   19   45:aload_0         
	//   20   46:getfield        #227 <Field Bundle mExtras>
	//   21   49:areturn         
	}

	public void getItem(final String mediaId, final MediaBrowserCompat.ItemCallback cb)
	{
		if(TextUtils.isEmpty(((CharSequence) (mediaId))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #239 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            17
			throw new IllegalArgumentException("mediaId is empty");
	//    3    7:new             #87  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #241 <String "mediaId is empty">
	//    6   13:invokespecial   #92  <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		if(cb == null)
	//*   8   17:aload_2         
	//*   9   18:ifnonnull       31
			throw new IllegalArgumentException("cb is null");
	//   10   21:new             #87  <Class IllegalArgumentException>
	//   11   24:dup             
	//   12   25:ldc1            #243 <String "cb is null">
	//   13   27:invokespecial   #92  <Method void IllegalArgumentException(String)>
	//   14   30:athrow          
		if(!isConnected())
	//*  15   31:aload_0         
	//*  16   32:invokevirtual   #223 <Method boolean isConnected()>
	//*  17   35:ifne            65
		{
			Log.i("MediaBrowserCompat", "Not connected, unable to retrieve the MediaItem.");
	//   18   38:ldc1            #139 <String "MediaBrowserCompat">
	//   19   40:ldc1            #245 <String "Not connected, unable to retrieve the MediaItem.">
	//   20   42:invokestatic    #154 <Method int Log.i(String, String)>
	//   21   45:pop             
			mHandler.post(new Runnable() {

				public void run()
				{
					cb.onError(mediaId);
				//    0    0:aload_0         
				//    1    1:getfield        #26  <Field MediaBrowserCompat$ItemCallback val$cb>
				//    2    4:aload_0         
				//    3    5:getfield        #28  <Field String val$mediaId>
				//    4    8:invokevirtual   #39  <Method void MediaBrowserCompat$ItemCallback.onError(String)>
				//    5   11:return          
				}

				final MediaBrowserCompat.MediaBrowserImplBase this$0;
				final MediaBrowserCompat.ItemCallback val$cb;
				final String val$mediaId;

			
			{
				this$0 = MediaBrowserCompat.MediaBrowserImplBase.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				cb = itemcallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field MediaBrowserCompat$ItemCallback val$cb>
				mediaId = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field String val$mediaId>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #31  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//   22   46:aload_0         
	//   23   47:getfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   24   50:new             #17  <Class MediaBrowserCompat$MediaBrowserImplBase$3>
	//   25   53:dup             
	//   26   54:aload_0         
	//   27   55:aload_2         
	//   28   56:aload_1         
	//   29   57:invokespecial   #248 <Method void MediaBrowserCompat$MediaBrowserImplBase$3(MediaBrowserCompat$MediaBrowserImplBase, MediaBrowserCompat$ItemCallback, String)>
	//   30   60:invokevirtual   #171 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   31   63:pop             
			return;
	//   32   64:return          
		}
		MediaBrowserCompat.ItemReceiver itemreceiver = new MediaBrowserCompat.ItemReceiver(mediaId, cb, ((android.os.Handler) (mHandler)));
	//   33   65:new             #250 <Class MediaBrowserCompat$ItemReceiver>
	//   34   68:dup             
	//   35   69:aload_1         
	//   36   70:aload_2         
	//   37   71:aload_0         
	//   38   72:getfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   39   75:invokespecial   #253 <Method void MediaBrowserCompat$ItemReceiver(String, MediaBrowserCompat$ItemCallback, android.os.Handler)>
	//   40   78:astore_3        
		try
		{
			mServiceBinderWrapper.getMediaItem(mediaId, ((android.support.v4.os.ResultReceiver) (itemreceiver)), mCallbacksMessenger);
	//   41   79:aload_0         
	//   42   80:getfield        #195 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   43   83:aload_1         
	//   44   84:aload_3         
	//   45   85:aload_0         
	//   46   86:getfield        #137 <Field Messenger mCallbacksMessenger>
	//   47   89:invokevirtual   #259 <Method void MediaBrowserCompat$ServiceBinderWrapper.getMediaItem(String, android.support.v4.os.ResultReceiver, Messenger)>
			return;
	//   48   92:return          
		}
		catch(RemoteException remoteexception)
	//*  49   93:astore_3        
		{
			Log.i("MediaBrowserCompat", (new StringBuilder()).append("Remote error getting media item: ").append(mediaId).toString());
	//   50   94:ldc1            #139 <String "MediaBrowserCompat">
	//   51   96:new             #114 <Class StringBuilder>
	//   52   99:dup             
	//   53  100:invokespecial   #115 <Method void StringBuilder()>
	//   54  103:ldc2            #261 <String "Remote error getting media item: ">
	//   55  106:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   56  109:aload_1         
	//   57  110:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   58  113:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   59  116:invokestatic    #154 <Method int Log.i(String, String)>
	//   60  119:pop             
		}
		mHandler.post(new Runnable() {

			public void run()
			{
				cb.onError(mediaId);
			//    0    0:aload_0         
			//    1    1:getfield        #26  <Field MediaBrowserCompat$ItemCallback val$cb>
			//    2    4:aload_0         
			//    3    5:getfield        #28  <Field String val$mediaId>
			//    4    8:invokevirtual   #39  <Method void MediaBrowserCompat$ItemCallback.onError(String)>
			//    5   11:return          
			}

			final MediaBrowserCompat.MediaBrowserImplBase this$0;
			final MediaBrowserCompat.ItemCallback val$cb;
			final String val$mediaId;

			
			{
				this$0 = MediaBrowserCompat.MediaBrowserImplBase.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				cb = itemcallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field MediaBrowserCompat$ItemCallback val$cb>
				mediaId = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field String val$mediaId>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #31  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//   61  120:aload_0         
	//   62  121:getfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   63  124:new             #19  <Class MediaBrowserCompat$MediaBrowserImplBase$4>
	//   64  127:dup             
	//   65  128:aload_0         
	//   66  129:aload_2         
	//   67  130:aload_1         
	//   68  131:invokespecial   #262 <Method void MediaBrowserCompat$MediaBrowserImplBase$4(MediaBrowserCompat$MediaBrowserImplBase, MediaBrowserCompat$ItemCallback, String)>
	//   69  134:invokevirtual   #171 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   70  137:pop             
	//   71  138:return          
	}

	public String getRoot()
	{
		if(!isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #223 <Method boolean isConnected()>
	//*   2    4:ifne            46
			throw new IllegalStateException((new StringBuilder()).append("getRoot() called while not connected(state=").append(getStateLabel(mState)).append(")").toString());
	//    3    7:new             #157 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:new             #114 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #115 <Method void StringBuilder()>
	//    8   18:ldc2            #266 <String "getRoot() called while not connected(state=">
	//    9   21:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #85  <Field int mState>
	//   12   28:invokestatic    #161 <Method String getStateLabel(int)>
	//   13   31:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   14   34:ldc1            #163 <String ")">
	//   15   36:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   16   39:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   17   42:invokespecial   #164 <Method void IllegalStateException(String)>
	//   18   45:athrow          
		else
			return mRootId;
	//   19   46:aload_0         
	//   20   47:getfield        #201 <Field String mRootId>
	//   21   50:areturn         
	}

	public ComponentName getServiceComponent()
	{
		if(!isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #223 <Method boolean isConnected()>
	//*   2    4:ifne            43
			throw new IllegalStateException((new StringBuilder()).append("getServiceComponent() called while not connected (state=").append(mState).append(")").toString());
	//    3    7:new             #157 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:new             #114 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #115 <Method void StringBuilder()>
	//    8   18:ldc2            #270 <String "getServiceComponent() called while not connected (state=">
	//    9   21:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #85  <Field int mState>
	//   12   28:invokevirtual   #124 <Method StringBuilder StringBuilder.append(int)>
	//   13   31:ldc1            #163 <String ")">
	//   14   33:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   15   36:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   16   39:invokespecial   #164 <Method void IllegalStateException(String)>
	//   17   42:athrow          
		else
			return mServiceComponent;
	//   18   43:aload_0         
	//   19   44:getfield        #100 <Field ComponentName mServiceComponent>
	//   20   47:areturn         
	}

	public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken()
	{
		if(!isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #223 <Method boolean isConnected()>
	//*   2    4:ifne            43
			throw new IllegalStateException((new StringBuilder()).append("getSessionToken() called while not connected(state=").append(mState).append(")").toString());
	//    3    7:new             #157 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:new             #114 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #115 <Method void StringBuilder()>
	//    8   18:ldc2            #274 <String "getSessionToken() called while not connected(state=">
	//    9   21:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #85  <Field int mState>
	//   12   28:invokevirtual   #124 <Method StringBuilder StringBuilder.append(int)>
	//   13   31:ldc1            #163 <String ")">
	//   14   33:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   15   36:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   16   39:invokespecial   #164 <Method void IllegalStateException(String)>
	//   17   42:athrow          
		else
			return mMediaSessionToken;
	//   18   43:aload_0         
	//   19   44:getfield        #205 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
	//   20   47:areturn         
	}

	public boolean isConnected()
	{
		return mState == 3;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field int mState>
	//    2    4:iconst_3        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public void onConnectionFailed(Messenger messenger)
	{
		Log.e("MediaBrowserCompat", (new StringBuilder()).append("onConnectFailed for ").append(((Object) (mServiceComponent))).toString());
	//    0    0:ldc1            #139 <String "MediaBrowserCompat">
	//    1    2:new             #114 <Class StringBuilder>
	//    2    5:dup             
	//    3    6:invokespecial   #115 <Method void StringBuilder()>
	//    4    9:ldc2            #277 <String "onConnectFailed for ">
	//    5   12:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//    6   15:aload_0         
	//    7   16:getfield        #100 <Field ComponentName mServiceComponent>
	//    8   19:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
	//    9   22:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   10   25:invokestatic    #280 <Method int Log.e(String, String)>
	//   11   28:pop             
		if(!isCurrent(messenger, "onConnectFailed"))
	//*  12   29:aload_0         
	//*  13   30:aload_1         
	//*  14   31:ldc2            #282 <String "onConnectFailed">
	//*  15   34:invokespecial   #284 <Method boolean isCurrent(Messenger, String)>
	//*  16   37:ifne            41
			return;
	//   17   40:return          
		if(mState != 2)
	//*  18   41:aload_0         
	//*  19   42:getfield        #85  <Field int mState>
	//*  20   45:iconst_2        
	//*  21   46:icmpeq          88
		{
			Log.w("MediaBrowserCompat", (new StringBuilder()).append("onConnect from service while mState=").append(getStateLabel(mState)).append("... ignoring").toString());
	//   22   49:ldc1            #139 <String "MediaBrowserCompat">
	//   23   51:new             #114 <Class StringBuilder>
	//   24   54:dup             
	//   25   55:invokespecial   #115 <Method void StringBuilder()>
	//   26   58:ldc2            #286 <String "onConnect from service while mState=">
	//   27   61:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   28   64:aload_0         
	//   29   65:getfield        #85  <Field int mState>
	//   30   68:invokestatic    #161 <Method String getStateLabel(int)>
	//   31   71:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   32   74:ldc2            #288 <String "... ignoring">
	//   33   77:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   34   80:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   35   83:invokestatic    #291 <Method int Log.w(String, String)>
	//   36   86:pop             
			return;
	//   37   87:return          
		} else
		{
			forceCloseConnection();
	//   38   88:aload_0         
	//   39   89:invokevirtual   #293 <Method void forceCloseConnection()>
			mCallback.onConnectionFailed();
	//   40   92:aload_0         
	//   41   93:getfield        #102 <Field MediaBrowserCompat$ConnectionCallback mCallback>
	//   42   96:invokevirtual   #297 <Method void MediaBrowserCompat$ConnectionCallback.onConnectionFailed()>
			return;
	//   43   99:return          
		}
	}

	public void onLoadChildren(Messenger messenger, String s, List list, Bundle bundle)
	{
		if(isCurrent(messenger, "onLoadChildren")) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #300 <String "onLoadChildren">
	//    3    5:invokespecial   #284 <Method boolean isCurrent(Messenger, String)>
	//    4    8:ifne            12
_L1:
		return;
	//    5   11:return          
_L2:
		if(MediaBrowserCompat.DEBUG)
	//*   6   12:getstatic       #304 <Field boolean MediaBrowserCompat.DEBUG>
	//*   7   15:ifeq            57
			Log.d("MediaBrowserCompat", (new StringBuilder()).append("onLoadChildren for ").append(((Object) (mServiceComponent))).append(" id=").append(s).toString());
	//    8   18:ldc1            #139 <String "MediaBrowserCompat">
	//    9   20:new             #114 <Class StringBuilder>
	//   10   23:dup             
	//   11   24:invokespecial   #115 <Method void StringBuilder()>
	//   12   27:ldc2            #306 <String "onLoadChildren for ">
	//   13   30:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   14   33:aload_0         
	//   15   34:getfield        #100 <Field ComponentName mServiceComponent>
	//   16   37:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
	//   17   40:ldc2            #308 <String " id=">
	//   18   43:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   19   46:aload_2         
	//   20   47:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   21   50:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   22   53:invokestatic    #179 <Method int Log.d(String, String)>
	//   23   56:pop             
		messenger = ((Messenger) ((MediaBrowserCompat.Subscription)mSubscriptions.get(((Object) (s)))));
	//   24   57:aload_0         
	//   25   58:getfield        #83  <Field ArrayMap mSubscriptions>
	//   26   61:aload_2         
	//   27   62:invokevirtual   #312 <Method Object ArrayMap.get(Object)>
	//   28   65:checkcast       #314 <Class MediaBrowserCompat$Subscription>
	//   29   68:astore_1        
		if(messenger != null)
			break; /* Loop/switch isn't completed */
	//   30   69:aload_1         
	//   31   70:ifnonnull       106
		if(MediaBrowserCompat.DEBUG)
	//*  32   73:getstatic       #304 <Field boolean MediaBrowserCompat.DEBUG>
	//*  33   76:ifeq            11
		{
			Log.d("MediaBrowserCompat", (new StringBuilder()).append("onLoadChildren for id that isn't subscribed id=").append(s).toString());
	//   34   79:ldc1            #139 <String "MediaBrowserCompat">
	//   35   81:new             #114 <Class StringBuilder>
	//   36   84:dup             
	//   37   85:invokespecial   #115 <Method void StringBuilder()>
	//   38   88:ldc2            #316 <String "onLoadChildren for id that isn't subscribed id=">
	//   39   91:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   40   94:aload_2         
	//   41   95:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   42   98:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   43  101:invokestatic    #179 <Method int Log.d(String, String)>
	//   44  104:pop             
			return;
	//   45  105:return          
		}
		if(true) goto _L1; else goto _L3
_L3:
		messenger = ((Messenger) (((MediaBrowserCompat.Subscription) (messenger)).getCallback(mContext, bundle)));
	//   46  106:aload_1         
	//   47  107:aload_0         
	//   48  108:getfield        #98  <Field Context mContext>
	//   49  111:aload           4
	//   50  113:invokevirtual   #320 <Method MediaBrowserCompat$SubscriptionCallback MediaBrowserCompat$Subscription.getCallback(Context, Bundle)>
	//   51  116:astore_1        
		if(messenger != null)
	//*  52  117:aload_1         
	//*  53  118:ifnull          11
		{
			if(bundle == null)
	//*  54  121:aload           4
	//*  55  123:ifnonnull       143
				if(list == null)
	//*  56  126:aload_3         
	//*  57  127:ifnonnull       136
				{
					((MediaBrowserCompat$SubscriptionCallback) (messenger)).onError(s);
	//   58  130:aload_1         
	//   59  131:aload_2         
	//   60  132:invokevirtual   #325 <Method void MediaBrowserCompat$SubscriptionCallback.onError(String)>
					return;
	//   61  135:return          
				} else
				{
					((MediaBrowserCompat$SubscriptionCallback) (messenger)).onChildrenLoaded(s, list);
	//   62  136:aload_1         
	//   63  137:aload_2         
	//   64  138:aload_3         
	//   65  139:invokevirtual   #329 <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List)>
					return;
	//   66  142:return          
				}
			if(list == null)
	//*  67  143:aload_3         
	//*  68  144:ifnonnull       155
			{
				((MediaBrowserCompat$SubscriptionCallback) (messenger)).onError(s, bundle);
	//   69  147:aload_1         
	//   70  148:aload_2         
	//   71  149:aload           4
	//   72  151:invokevirtual   #332 <Method void MediaBrowserCompat$SubscriptionCallback.onError(String, Bundle)>
				return;
	//   73  154:return          
			} else
			{
				((MediaBrowserCompat$SubscriptionCallback) (messenger)).onChildrenLoaded(s, list, bundle);
	//   74  155:aload_1         
	//   75  156:aload_2         
	//   76  157:aload_3         
	//   77  158:aload           4
	//   78  160:invokevirtual   #335 <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List, Bundle)>
				return;
	//   79  163:return          
			}
		}
		if(true) goto _L1; else goto _L4
_L4:
	}

	public void onServiceConnected(Messenger messenger, String s, android.support.v4.media.session.MediaSessionCompat.Token token, Bundle bundle)
	{
		if(isCurrent(messenger, "onConnect")) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #339 <String "onConnect">
	//    3    5:invokespecial   #284 <Method boolean isCurrent(Messenger, String)>
	//    4    8:ifne            12
_L1:
		return;
	//    5   11:return          
_L2:
		if(mState != 2)
	//*   6   12:aload_0         
	//*   7   13:getfield        #85  <Field int mState>
	//*   8   16:iconst_2        
	//*   9   17:icmpeq          59
		{
			Log.w("MediaBrowserCompat", (new StringBuilder()).append("onConnect from service while mState=").append(getStateLabel(mState)).append("... ignoring").toString());
	//   10   20:ldc1            #139 <String "MediaBrowserCompat">
	//   11   22:new             #114 <Class StringBuilder>
	//   12   25:dup             
	//   13   26:invokespecial   #115 <Method void StringBuilder()>
	//   14   29:ldc2            #286 <String "onConnect from service while mState=">
	//   15   32:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   16   35:aload_0         
	//   17   36:getfield        #85  <Field int mState>
	//   18   39:invokestatic    #161 <Method String getStateLabel(int)>
	//   19   42:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   20   45:ldc2            #288 <String "... ignoring">
	//   21   48:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   22   51:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   23   54:invokestatic    #291 <Method int Log.w(String, String)>
	//   24   57:pop             
			return;
	//   25   58:return          
		}
		mRootId = s;
	//   26   59:aload_0         
	//   27   60:aload_2         
	//   28   61:putfield        #201 <Field String mRootId>
		mMediaSessionToken = token;
	//   29   64:aload_0         
	//   30   65:aload_3         
	//   31   66:putfield        #205 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
		mExtras = bundle;
	//   32   69:aload_0         
	//   33   70:aload           4
	//   34   72:putfield        #227 <Field Bundle mExtras>
		mState = 3;
	//   35   75:aload_0         
	//   36   76:iconst_3        
	//   37   77:putfield        #85  <Field int mState>
		if(MediaBrowserCompat.DEBUG)
	//*  38   80:getstatic       #304 <Field boolean MediaBrowserCompat.DEBUG>
	//*  39   83:ifeq            99
		{
			Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
	//   40   86:ldc1            #139 <String "MediaBrowserCompat">
	//   41   88:ldc2            #341 <String "ServiceCallbacks.onConnect...">
	//   42   91:invokestatic    #179 <Method int Log.d(String, String)>
	//   43   94:pop             
			dump();
	//   44   95:aload_0         
	//   45   96:invokevirtual   #343 <Method void dump()>
		}
		mCallback.onConnected();
	//   46   99:aload_0         
	//   47  100:getfield        #102 <Field MediaBrowserCompat$ConnectionCallback mCallback>
	//   48  103:invokevirtual   #346 <Method void MediaBrowserCompat$ConnectionCallback.onConnected()>
		messenger = ((Messenger) (mSubscriptions.entrySet().iterator()));
	//   49  106:aload_0         
	//   50  107:getfield        #83  <Field ArrayMap mSubscriptions>
	//   51  110:invokevirtual   #350 <Method Set ArrayMap.entrySet()>
	//   52  113:invokeinterface #356 <Method Iterator Set.iterator()>
	//   53  118:astore_1        
_L4:
		if(!((Iterator) (messenger)).hasNext())
			continue; /* Loop/switch isn't completed */
	//   54  119:aload_1         
	//   55  120:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//   56  125:ifeq            11
		token = ((android.support.v4.media.session.MediaSessionCompat.Token) ((java.util.Map.Entry)((Iterator) (messenger)).next()));
	//   57  128:aload_1         
	//   58  129:invokeinterface #365 <Method Object Iterator.next()>
	//   59  134:checkcast       #367 <Class java.util.Map$Entry>
	//   60  137:astore_3        
		s = (String)((java.util.Map.Entry) (token)).getKey();
	//   61  138:aload_3         
	//   62  139:invokeinterface #370 <Method Object java.util.Map$Entry.getKey()>
	//   63  144:checkcast       #372 <Class String>
	//   64  147:astore_2        
		bundle = ((Bundle) ((MediaBrowserCompat.Subscription)((java.util.Map.Entry) (token)).getValue()));
	//   65  148:aload_3         
	//   66  149:invokeinterface #375 <Method Object java.util.Map$Entry.getValue()>
	//   67  154:checkcast       #314 <Class MediaBrowserCompat$Subscription>
	//   68  157:astore          4
		token = ((android.support.v4.media.session.MediaSessionCompat.Token) (((MediaBrowserCompat.Subscription) (bundle)).getCallbacks()));
	//   69  159:aload           4
	//   70  161:invokevirtual   #379 <Method List MediaBrowserCompat$Subscription.getCallbacks()>
	//   71  164:astore_3        
		bundle = ((Bundle) (((MediaBrowserCompat.Subscription) (bundle)).getOptionsList()));
	//   72  165:aload           4
	//   73  167:invokevirtual   #382 <Method List MediaBrowserCompat$Subscription.getOptionsList()>
	//   74  170:astore          4
		int i = 0;
	//   75  172:iconst_0        
	//   76  173:istore          5
		do
		{
			try
			{
				if(i >= ((List) (token)).size())
					break;
	//   77  175:iload           5
	//   78  177:aload_3         
	//   79  178:invokeinterface #388 <Method int List.size()>
	//   80  183:icmpge          119
				mServiceBinderWrapper.addSubscription(s, MediaBrowserCompat$SubscriptionCallback.access$000((MediaBrowserCompat$SubscriptionCallback)((List) (token)).get(i)), (Bundle)((List) (bundle)).get(i), mCallbacksMessenger);
	//   81  186:aload_0         
	//   82  187:getfield        #195 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   83  190:aload_2         
	//   84  191:aload_3         
	//   85  192:iload           5
	//   86  194:invokeinterface #391 <Method Object List.get(int)>
	//   87  199:checkcast       #322 <Class MediaBrowserCompat$SubscriptionCallback>
	//   88  202:invokestatic    #395 <Method IBinder MediaBrowserCompat$SubscriptionCallback.access$000(MediaBrowserCompat$SubscriptionCallback)>
	//   89  205:aload           4
	//   90  207:iload           5
	//   91  209:invokeinterface #391 <Method Object List.get(int)>
	//   92  214:checkcast       #106 <Class Bundle>
	//   93  217:aload_0         
	//   94  218:getfield        #137 <Field Messenger mCallbacksMessenger>
	//   95  221:invokevirtual   #399 <Method void MediaBrowserCompat$ServiceBinderWrapper.addSubscription(String, IBinder, Bundle, Messenger)>
			}
	//*  96  224:iload           5
	//*  97  226:iconst_1        
	//*  98  227:iadd            
	//*  99  228:istore          5
	//* 100  230:goto            175
			// Misplaced declaration of an exception variable
			catch(Messenger messenger)
	//* 101  233:astore_1        
			{
				Log.d("MediaBrowserCompat", "addSubscription failed with RemoteException.");
	//  102  234:ldc1            #139 <String "MediaBrowserCompat">
	//  103  236:ldc2            #401 <String "addSubscription failed with RemoteException.">
	//  104  239:invokestatic    #179 <Method int Log.d(String, String)>
	//  105  242:pop             
				return;
	//  106  243:return          
			}
			i++;
		} while(true);
		if(true) goto _L4; else goto _L3
_L3:
		if(true) goto _L1; else goto _L5
_L5:
	}

	public void search(final String query, final Bundle extras, final MediaBrowserCompat.SearchCallback callback)
	{
		if(!isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #223 <Method boolean isConnected()>
	//*   2    4:ifne            46
			throw new IllegalStateException((new StringBuilder()).append("search() called while not connected (state=").append(getStateLabel(mState)).append(")").toString());
	//    3    7:new             #157 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:new             #114 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #115 <Method void StringBuilder()>
	//    8   18:ldc2            #405 <String "search() called while not connected (state=">
	//    9   21:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #85  <Field int mState>
	//   12   28:invokestatic    #161 <Method String getStateLabel(int)>
	//   13   31:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   14   34:ldc1            #163 <String ")">
	//   15   36:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   16   39:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   17   42:invokespecial   #164 <Method void IllegalStateException(String)>
	//   18   45:athrow          
		MediaBrowserCompat$SearchResultReceiver mediabrowsercompat$searchresultreceiver = new MediaBrowserCompat$SearchResultReceiver(query, extras, callback, ((android.os.Handler) (mHandler)));
	//   19   46:new             #407 <Class MediaBrowserCompat$SearchResultReceiver>
	//   20   49:dup             
	//   21   50:aload_1         
	//   22   51:aload_2         
	//   23   52:aload_3         
	//   24   53:aload_0         
	//   25   54:getfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   26   57:invokespecial   #410 <Method void MediaBrowserCompat$SearchResultReceiver(String, Bundle, MediaBrowserCompat$SearchCallback, android.os.Handler)>
	//   27   60:astore          4
		try
		{
			mServiceBinderWrapper.search(query, extras, ((android.support.v4.os.ResultReceiver) (mediabrowsercompat$searchresultreceiver)), mCallbacksMessenger);
	//   28   62:aload_0         
	//   29   63:getfield        #195 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   30   66:aload_1         
	//   31   67:aload_2         
	//   32   68:aload           4
	//   33   70:aload_0         
	//   34   71:getfield        #137 <Field Messenger mCallbacksMessenger>
	//   35   74:invokevirtual   #413 <Method void MediaBrowserCompat$ServiceBinderWrapper.search(String, Bundle, android.support.v4.os.ResultReceiver, Messenger)>
			return;
	//   36   77:return          
		}
		catch(RemoteException remoteexception)
	//*  37   78:astore          4
		{
			Log.i("MediaBrowserCompat", (new StringBuilder()).append("Remote error searching items with query: ").append(query).toString(), ((Throwable) (remoteexception)));
	//   38   80:ldc1            #139 <String "MediaBrowserCompat">
	//   39   82:new             #114 <Class StringBuilder>
	//   40   85:dup             
	//   41   86:invokespecial   #115 <Method void StringBuilder()>
	//   42   89:ldc2            #415 <String "Remote error searching items with query: ">
	//   43   92:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   44   95:aload_1         
	//   45   96:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   46   99:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   47  102:aload           4
	//   48  104:invokestatic    #418 <Method int Log.i(String, String, Throwable)>
	//   49  107:pop             
		}
		mHandler.post(new Runnable() {

			public void run()
			{
				callback.onError(query, extras);
			//    0    0:aload_0         
			//    1    1:getfield        #28  <Field MediaBrowserCompat$SearchCallback val$callback>
			//    2    4:aload_0         
			//    3    5:getfield        #30  <Field String val$query>
			//    4    8:aload_0         
			//    5    9:getfield        #32  <Field Bundle val$extras>
			//    6   12:invokevirtual   #43  <Method void MediaBrowserCompat$SearchCallback.onError(String, Bundle)>
			//    7   15:return          
			}

			final MediaBrowserCompat.MediaBrowserImplBase this$0;
			final MediaBrowserCompat.SearchCallback val$callback;
			final Bundle val$extras;
			final String val$query;

			
			{
				this$0 = MediaBrowserCompat.MediaBrowserImplBase.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				callback = searchcallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field MediaBrowserCompat$SearchCallback val$callback>
				query = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field String val$query>
				extras = bundle;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #32  <Field Bundle val$extras>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #35  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//   50  108:aload_0         
	//   51  109:getfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   52  112:new             #21  <Class MediaBrowserCompat$MediaBrowserImplBase$5>
	//   53  115:dup             
	//   54  116:aload_0         
	//   55  117:aload_3         
	//   56  118:aload_1         
	//   57  119:aload_2         
	//   58  120:invokespecial   #421 <Method void MediaBrowserCompat$MediaBrowserImplBase$5(MediaBrowserCompat$MediaBrowserImplBase, MediaBrowserCompat$SearchCallback, String, Bundle)>
	//   59  123:invokevirtual   #171 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   60  126:pop             
	//   61  127:return          
	}

	public void sendCustomAction(final String action, final Bundle extras, final MediaBrowserCompat$CustomActionCallback callback)
	{
		eiver eiver;
		if(!isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #223 <Method boolean isConnected()>
	//*   2    4:ifne            63
			throw new IllegalStateException((new StringBuilder()).append("Cannot send a custom action (").append(action).append(") with ").append("extras ").append(((Object) (extras))).append(" because the browser is not connected to the ").append("service.").toString());
	//    3    7:new             #157 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:new             #114 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #115 <Method void StringBuilder()>
	//    8   18:ldc2            #425 <String "Cannot send a custom action (">
	//    9   21:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_1         
	//   11   25:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   12   28:ldc2            #427 <String ") with ">
	//   13   31:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   14   34:ldc2            #429 <String "extras ">
	//   15   37:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   16   40:aload_2         
	//   17   41:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
	//   18   44:ldc2            #431 <String " because the browser is not connected to the ">
	//   19   47:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   20   50:ldc2            #433 <String "service.">
	//   21   53:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   22   56:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   23   59:invokespecial   #164 <Method void IllegalStateException(String)>
	//   24   62:athrow          
		eiver = new eiver(action, extras, callback, ((android.os.Handler) (mHandler)));
	//   25   63:new             #435 <Class MediaBrowserCompat$CustomActionResultReceiver>
	//   26   66:dup             
	//   27   67:aload_1         
	//   28   68:aload_2         
	//   29   69:aload_3         
	//   30   70:aload_0         
	//   31   71:getfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   32   74:invokespecial   #438 <Method void MediaBrowserCompat$CustomActionResultReceiver(String, Bundle, MediaBrowserCompat$CustomActionCallback, android.os.Handler)>
	//   33   77:astore          4
		mServiceBinderWrapper.sendCustomAction(action, extras, ((android.support.v4.os.ResultReceiver) (eiver)), mCallbacksMessenger);
	//   34   79:aload_0         
	//   35   80:getfield        #195 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   36   83:aload_1         
	//   37   84:aload_2         
	//   38   85:aload           4
	//   39   87:aload_0         
	//   40   88:getfield        #137 <Field Messenger mCallbacksMessenger>
	//   41   91:invokevirtual   #440 <Method void MediaBrowserCompat$ServiceBinderWrapper.sendCustomAction(String, Bundle, android.support.v4.os.ResultReceiver, Messenger)>
_L1:
		return;
	//   42   94:return          
		RemoteException remoteexception;
		remoteexception;
	//   43   95:astore          4
		Log.i("MediaBrowserCompat", (new StringBuilder()).append("Remote error sending a custom action: action=").append(action).append(", extras=").append(((Object) (extras))).toString(), ((Throwable) (remoteexception)));
	//   44   97:ldc1            #139 <String "MediaBrowserCompat">
	//   45   99:new             #114 <Class StringBuilder>
	//   46  102:dup             
	//   47  103:invokespecial   #115 <Method void StringBuilder()>
	//   48  106:ldc2            #442 <String "Remote error sending a custom action: action=">
	//   49  109:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   50  112:aload_1         
	//   51  113:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   52  116:ldc2            #444 <String ", extras=">
	//   53  119:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   54  122:aload_2         
	//   55  123:invokevirtual   #144 <Method StringBuilder StringBuilder.append(Object)>
	//   56  126:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   57  129:aload           4
	//   58  131:invokestatic    #418 <Method int Log.i(String, String, Throwable)>
	//   59  134:pop             
		if(callback != null)
	//*  60  135:aload_3         
	//*  61  136:ifnull          94
		{
			mHandler.post(new Runnable() {

				public void run()
				{
					callback.onError(action, extras, ((Bundle) (null)));
				//    0    0:aload_0         
				//    1    1:getfield        #28  <Field MediaBrowserCompat$CustomActionCallback val$callback>
				//    2    4:aload_0         
				//    3    5:getfield        #30  <Field String val$action>
				//    4    8:aload_0         
				//    5    9:getfield        #32  <Field Bundle val$extras>
				//    6   12:aconst_null     
				//    7   13:invokevirtual   #43  <Method void MediaBrowserCompat$CustomActionCallback.onError(String, Bundle, Bundle)>
				//    8   16:return          
				}

				final MediaBrowserCompat.MediaBrowserImplBase this$0;
				final String val$action;
				final MediaBrowserCompat.CustomActionCallback val$callback;
				final Bundle val$extras;

			
			{
				this$0 = MediaBrowserCompat.MediaBrowserImplBase.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				callback = customactioncallback;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field MediaBrowserCompat$CustomActionCallback val$callback>
				action = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field String val$action>
				extras = bundle;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #32  <Field Bundle val$extras>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #35  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//   62  139:aload_0         
	//   63  140:getfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   64  143:new             #23  <Class MediaBrowserCompat$MediaBrowserImplBase$6>
	//   65  146:dup             
	//   66  147:aload_0         
	//   67  148:aload_3         
	//   68  149:aload_1         
	//   69  150:aload_2         
	//   70  151:invokespecial   #447 <Method void MediaBrowserCompat$MediaBrowserImplBase$6(MediaBrowserCompat$MediaBrowserImplBase, MediaBrowserCompat$CustomActionCallback, String, Bundle)>
	//   71  154:invokevirtual   #171 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   72  157:pop             
			return;
	//   73  158:return          
		}
		  goto _L1
	}

	public void subscribe(String s, Bundle bundle, MediaBrowserCompat$SubscriptionCallback mediabrowsercompat$subscriptioncallback)
	{
		MediaBrowserCompat.Subscription subscription = (MediaBrowserCompat.Subscription)mSubscriptions.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field ArrayMap mSubscriptions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #312 <Method Object ArrayMap.get(Object)>
	//    4    8:checkcast       #314 <Class MediaBrowserCompat$Subscription>
	//    5   11:astore          4
		if(subscription == null)
	//*   6   13:aload           4
	//*   7   15:ifnonnull       120
		{
			subscription = new MediaBrowserCompat.Subscription();
	//    8   18:new             #314 <Class MediaBrowserCompat$Subscription>
	//    9   21:dup             
	//   10   22:invokespecial   #450 <Method void MediaBrowserCompat$Subscription()>
	//   11   25:astore          4
			mSubscriptions.put(((Object) (s)), ((Object) (subscription)));
	//   12   27:aload_0         
	//   13   28:getfield        #83  <Field ArrayMap mSubscriptions>
	//   14   31:aload_1         
	//   15   32:aload           4
	//   16   34:invokevirtual   #454 <Method Object ArrayMap.put(Object, Object)>
	//   17   37:pop             
		}
		if(bundle == null)
	//*  18   38:aload_2         
	//*  19   39:ifnonnull       80
			bundle = null;
	//   20   42:aconst_null     
	//   21   43:astore_2        
		else
	//*  22   44:aload           4
	//*  23   46:aload_0         
	//*  24   47:getfield        #98  <Field Context mContext>
	//*  25   50:aload_2         
	//*  26   51:aload_3         
	//*  27   52:invokevirtual   #458 <Method void MediaBrowserCompat$Subscription.putCallback(Context, Bundle, MediaBrowserCompat$SubscriptionCallback)>
	//*  28   55:aload_0         
	//*  29   56:invokevirtual   #223 <Method boolean isConnected()>
	//*  30   59:ifeq            79
	//*  31   62:aload_0         
	//*  32   63:getfield        #195 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//*  33   66:aload_1         
	//*  34   67:aload_3         
	//*  35   68:invokestatic    #395 <Method IBinder MediaBrowserCompat$SubscriptionCallback.access$000(MediaBrowserCompat$SubscriptionCallback)>
	//*  36   71:aload_2         
	//*  37   72:aload_0         
	//*  38   73:getfield        #137 <Field Messenger mCallbacksMessenger>
	//*  39   76:invokevirtual   #399 <Method void MediaBrowserCompat$ServiceBinderWrapper.addSubscription(String, IBinder, Bundle, Messenger)>
	//*  40   79:return          
			bundle = new Bundle(bundle);
	//   41   80:new             #106 <Class Bundle>
	//   42   83:dup             
	//   43   84:aload_2         
	//   44   85:invokespecial   #109 <Method void Bundle(Bundle)>
	//   45   88:astore_2        
		subscription.putCallback(mContext, bundle, mediabrowsercompat$subscriptioncallback);
		if(!isConnected())
			break MISSING_BLOCK_LABEL_79;
		mServiceBinderWrapper.addSubscription(s, MediaBrowserCompat$SubscriptionCallback.access$000(mediabrowsercompat$subscriptioncallback), bundle, mCallbacksMessenger);
		return;
	//*  46   89:goto            44
		bundle;
	//   47   92:astore_2        
		Log.d("MediaBrowserCompat", (new StringBuilder()).append("addSubscription failed with RemoteException parentId=").append(s).toString());
	//   48   93:ldc1            #139 <String "MediaBrowserCompat">
	//   49   95:new             #114 <Class StringBuilder>
	//   50   98:dup             
	//   51   99:invokespecial   #115 <Method void StringBuilder()>
	//   52  102:ldc2            #460 <String "addSubscription failed with RemoteException parentId=">
	//   53  105:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   54  108:aload_1         
	//   55  109:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   56  112:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   57  115:invokestatic    #179 <Method int Log.d(String, String)>
	//   58  118:pop             
		return;
	//   59  119:return          
	//*  60  120:goto            38
	}

	public void unsubscribe(String s, MediaBrowserCompat$SubscriptionCallback mediabrowsercompat$subscriptioncallback)
	{
		MediaBrowserCompat.Subscription subscription = (MediaBrowserCompat.Subscription)mSubscriptions.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field ArrayMap mSubscriptions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #312 <Method Object ArrayMap.get(Object)>
	//    4    8:checkcast       #314 <Class MediaBrowserCompat$Subscription>
	//    5   11:astore          4
		if(subscription != null) goto _L2; else goto _L1
	//    6   13:aload           4
	//    7   15:ifnonnull       19
_L1:
		return;
	//    8   18:return          
_L2:
		if(mediabrowsercompat$subscriptioncallback != null) goto _L4; else goto _L3
	//    9   19:aload_2         
	//   10   20:ifnonnull       65
_L3:
		int i;
		List list;
		List list1;
		try
		{
			if(isConnected())
	//*  11   23:aload_0         
	//*  12   24:invokevirtual   #223 <Method boolean isConnected()>
	//*  13   27:ifeq            43
				mServiceBinderWrapper.removeSubscription(s, ((IBinder) (null)), mCallbacksMessenger);
	//   14   30:aload_0         
	//   15   31:getfield        #195 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   16   34:aload_1         
	//   17   35:aconst_null     
	//   18   36:aload_0         
	//   19   37:getfield        #137 <Field Messenger mCallbacksMessenger>
	//   20   40:invokevirtual   #466 <Method void MediaBrowserCompat$ServiceBinderWrapper.removeSubscription(String, IBinder, Messenger)>
		}
	//*  21   43:aload           4
	//*  22   45:invokevirtual   #468 <Method boolean MediaBrowserCompat$Subscription.isEmpty()>
	//*  23   48:ifne            55
	//*  24   51:aload_2         
	//*  25   52:ifnonnull       18
	//*  26   55:aload_0         
	//*  27   56:getfield        #83  <Field ArrayMap mSubscriptions>
	//*  28   59:aload_1         
	//*  29   60:invokevirtual   #471 <Method Object ArrayMap.remove(Object)>
	//*  30   63:pop             
	//*  31   64:return          
	//*  32   65:aload           4
	//*  33   67:invokevirtual   #379 <Method List MediaBrowserCompat$Subscription.getCallbacks()>
	//*  34   70:astore          5
	//*  35   72:aload           4
	//*  36   74:invokevirtual   #382 <Method List MediaBrowserCompat$Subscription.getOptionsList()>
	//*  37   77:astore          6
	//*  38   79:aload           5
	//*  39   81:invokeinterface #388 <Method int List.size()>
	//*  40   86:iconst_1        
	//*  41   87:isub            
	//*  42   88:istore_3        
	//*  43   89:iload_3         
	//*  44   90:iflt            43
	//*  45   93:aload           5
	//*  46   95:iload_3         
	//*  47   96:invokeinterface #391 <Method Object List.get(int)>
	//*  48  101:aload_2         
	//*  49  102:if_acmpne       146
	//*  50  105:aload_0         
	//*  51  106:invokevirtual   #223 <Method boolean isConnected()>
	//*  52  109:ifeq            128
	//*  53  112:aload_0         
	//*  54  113:getfield        #195 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//*  55  116:aload_1         
	//*  56  117:aload_2         
	//*  57  118:invokestatic    #395 <Method IBinder MediaBrowserCompat$SubscriptionCallback.access$000(MediaBrowserCompat$SubscriptionCallback)>
	//*  58  121:aload_0         
	//*  59  122:getfield        #137 <Field Messenger mCallbacksMessenger>
	//*  60  125:invokevirtual   #466 <Method void MediaBrowserCompat$ServiceBinderWrapper.removeSubscription(String, IBinder, Messenger)>
	//*  61  128:aload           5
	//*  62  130:iload_3         
	//*  63  131:invokeinterface #473 <Method Object List.remove(int)>
	//*  64  136:pop             
	//*  65  137:aload           6
	//*  66  139:iload_3         
	//*  67  140:invokeinterface #473 <Method Object List.remove(int)>
	//*  68  145:pop             
	//*  69  146:iload_3         
	//*  70  147:iconst_1        
	//*  71  148:isub            
	//*  72  149:istore_3        
	//*  73  150:goto            89
		catch(RemoteException remoteexception)
	//*  74  153:astore          5
		{
			Log.d("MediaBrowserCompat", (new StringBuilder()).append("removeSubscription failed with RemoteException parentId=").append(s).toString());
	//   75  155:ldc1            #139 <String "MediaBrowserCompat">
	//   76  157:new             #114 <Class StringBuilder>
	//   77  160:dup             
	//   78  161:invokespecial   #115 <Method void StringBuilder()>
	//   79  164:ldc2            #475 <String "removeSubscription failed with RemoteException parentId=">
	//   80  167:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   81  170:aload_1         
	//   82  171:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   83  174:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   84  177:invokestatic    #179 <Method int Log.d(String, String)>
	//   85  180:pop             
		}
		if(subscription.isEmpty() || mediabrowsercompat$subscriptioncallback == null)
		{
			mSubscriptions.remove(((Object) (s)));
			return;
		}
		  goto _L5
_L4:
		list = subscription.getCallbacks();
		list1 = subscription.getOptionsList();
		i = list.size() - 1;
_L8:
		if(i < 0) goto _L7; else goto _L6
_L6:
		if(list.get(i) == mediabrowsercompat$subscriptioncallback)
		{
			if(isConnected())
				mServiceBinderWrapper.removeSubscription(s, MediaBrowserCompat$SubscriptionCallback.access$000(mediabrowsercompat$subscriptioncallback), mCallbacksMessenger);
			list.remove(i);
			list1.remove(i);
		}
		i--;
		if(true) goto _L8; else goto _L7
_L7:
		if(false)
			break MISSING_BLOCK_LABEL_149;
		else
			break MISSING_BLOCK_LABEL_43;
_L5:
		if(true) goto _L1; else goto _L9
_L9:
	//*  86  181:goto            43
	}

	static final int CONNECT_STATE_CONNECTED = 3;
	static final int CONNECT_STATE_CONNECTING = 2;
	static final int CONNECT_STATE_DISCONNECTED = 1;
	static final int CONNECT_STATE_DISCONNECTING = 0;
	static final int CONNECT_STATE_SUSPENDED = 4;
	final MediaBrowserCompat.ConnectionCallback mCallback;
	Messenger mCallbacksMessenger;
	final Context mContext;
	private Bundle mExtras;
	final MediaBrowserCompat.CallbackHandler mHandler = new MediaBrowserCompat.CallbackHandler(((llbackImpl) (this)));
	private android.support.v4.media.session.MediaSessionCompat.Token mMediaSessionToken;
	final Bundle mRootHints;
	private String mRootId;
	MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper;
	final ComponentName mServiceComponent;
	MediaServiceConnection mServiceConnection;
	int mState;
	private final ArrayMap mSubscriptions = new ArrayMap();

	public MediaBrowserCompat$MediaBrowserImplBase(Context context, ComponentName componentname, MediaBrowserCompat.ConnectionCallback connectioncallback, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #73  <Class MediaBrowserCompat$CallbackHandler>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #76  <Method void MediaBrowserCompat$CallbackHandler(MediaBrowserCompat$MediaBrowserServiceCallbackImpl)>
	//    7   13:putfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//    8   16:aload_0         
	//    9   17:new             #80  <Class ArrayMap>
	//   10   20:dup             
	//   11   21:invokespecial   #81  <Method void ArrayMap()>
	//   12   24:putfield        #83  <Field ArrayMap mSubscriptions>
		mState = 1;
	//   13   27:aload_0         
	//   14   28:iconst_1        
	//   15   29:putfield        #85  <Field int mState>
		if(context == null)
	//*  16   32:aload_1         
	//*  17   33:ifnonnull       46
			throw new IllegalArgumentException("context must not be null");
	//   18   36:new             #87  <Class IllegalArgumentException>
	//   19   39:dup             
	//   20   40:ldc1            #89  <String "context must not be null">
	//   21   42:invokespecial   #92  <Method void IllegalArgumentException(String)>
	//   22   45:athrow          
		if(componentname == null)
	//*  23   46:aload_2         
	//*  24   47:ifnonnull       60
			throw new IllegalArgumentException("service component must not be null");
	//   25   50:new             #87  <Class IllegalArgumentException>
	//   26   53:dup             
	//   27   54:ldc1            #94  <String "service component must not be null">
	//   28   56:invokespecial   #92  <Method void IllegalArgumentException(String)>
	//   29   59:athrow          
		if(connectioncallback == null)
	//*  30   60:aload_3         
	//*  31   61:ifnonnull       74
			throw new IllegalArgumentException("connection callback must not be null");
	//   32   64:new             #87  <Class IllegalArgumentException>
	//   33   67:dup             
	//   34   68:ldc1            #96  <String "connection callback must not be null">
	//   35   70:invokespecial   #92  <Method void IllegalArgumentException(String)>
	//   36   73:athrow          
		mContext = context;
	//   37   74:aload_0         
	//   38   75:aload_1         
	//   39   76:putfield        #98  <Field Context mContext>
		mServiceComponent = componentname;
	//   40   79:aload_0         
	//   41   80:aload_2         
	//   42   81:putfield        #100 <Field ComponentName mServiceComponent>
		mCallback = connectioncallback;
	//   43   84:aload_0         
	//   44   85:aload_3         
	//   45   86:putfield        #102 <Field MediaBrowserCompat$ConnectionCallback mCallback>
		if(bundle == null)
	//*  46   89:aload           4
	//*  47   91:ifnonnull       102
			context = null;
	//   48   94:aconst_null     
	//   49   95:astore_1        
		else
	//*  50   96:aload_0         
	//*  51   97:aload_1         
	//*  52   98:putfield        #104 <Field Bundle mRootHints>
	//*  53  101:return          
			context = ((Context) (new Bundle(bundle)));
	//   54  102:new             #106 <Class Bundle>
	//   55  105:dup             
	//   56  106:aload           4
	//   57  108:invokespecial   #109 <Method void Bundle(Bundle)>
	//   58  111:astore_1        
		mRootHints = ((Bundle) (context));
	//*  59  112:goto            96
	}
}
