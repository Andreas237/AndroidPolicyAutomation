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
	class MediaServiceConnection
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
			if(mServiceConnection != this)
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		//*   2    4:getfield        #64  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
		//*   3    7:aload_0         
		//*   4    8:if_acmpeq       82
			{
				if(mState != 0)
		//*   5   11:aload_0         
		//*   6   12:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		//*   7   15:getfield        #68  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
		//*   8   18:ifeq            80
					Log.i("MediaBrowserCompat", (new StringBuilder()).append(s).append(" for ").append(((Object) (mServiceComponent))).append(" with mServiceConnection=").append(((Object) (mServiceConnection))).append(" this=").append(((Object) (this))).toString());
		//    9   21:ldc1            #70  <String "MediaBrowserCompat">
		//   10   23:new             #72  <Class StringBuilder>
		//   11   26:dup             
		//   12   27:invokespecial   #73  <Method void StringBuilder()>
		//   13   30:aload_1         
		//   14   31:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   15   34:ldc1            #79  <String " for ">
		//   16   36:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   17   39:aload_0         
		//   18   40:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		//   19   43:getfield        #83  <Field ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
		//   20   46:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
		//   21   49:ldc1            #88  <String " with mServiceConnection=">
		//   22   51:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   23   54:aload_0         
		//   24   55:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		//   25   58:getfield        #64  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
		//   26   61:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
		//   27   64:ldc1            #90  <String " this=">
		//   28   66:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   29   69:aload_0         
		//   30   70:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
		//   31   73:invokevirtual   #94  <Method String StringBuilder.toString()>
		//   32   76:invokestatic    #100 <Method int Log.i(String, String)>
		//   33   79:pop             
				return false;
		//   34   80:iconst_0        
		//   35   81:ireturn         
			} else
			{
				return true;
		//   36   82:iconst_1        
		//   37   83:ireturn         
			}
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
					if(!isCurrent("onServiceConnected"))
				//*  23   56:aload_0         
				//*  24   57:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//*  25   60:ldc1            #76  <String "onServiceConnected">
				//*  26   62:invokevirtual   #80  <Method boolean MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.isCurrent(String)>
				//*  27   65:ifne            69
						return;
				//   28   68:return          
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
						mState = 3;
				//   51  120:aload_0         
				//   52  121:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   53  124:getfield        #58  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   54  127:iconst_3        
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
	//*   1    1:tableswitch     0 3: default 32
	//	               0 35
	//	               1 38
	//	               2 41
	//	               3 44
	//*   2   32:goto            47
		case 0: // '\0'
			return "CONNECT_STATE_DISCONNECTED";
	//    3   35:ldc1            #109 <String "CONNECT_STATE_DISCONNECTED">
	//    4   37:areturn         

		case 1: // '\001'
			return "CONNECT_STATE_CONNECTING";
	//    5   38:ldc1            #110 <String "CONNECT_STATE_CONNECTING">
	//    6   40:areturn         

		case 2: // '\002'
			return "CONNECT_STATE_CONNECTED";
	//    7   41:ldc1            #111 <String "CONNECT_STATE_CONNECTED">
	//    8   43:areturn         

		case 3: // '\003'
			return "CONNECT_STATE_SUSPENDED";
	//    9   44:ldc1            #112 <String "CONNECT_STATE_SUSPENDED">
	//   10   46:areturn         
		}
		return (new StringBuilder()).append("UNKNOWN/").append(i).toString();
	//   11   47:new             #114 <Class StringBuilder>
	//   12   50:dup             
	//   13   51:invokespecial   #115 <Method void StringBuilder()>
	//   14   54:ldc1            #117 <String "UNKNOWN/">
	//   15   56:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   16   59:iload_0         
	//   17   60:invokevirtual   #124 <Method StringBuilder StringBuilder.append(int)>
	//   18   63:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   19   66:areturn         
	}

	private boolean isCurrent(Messenger messenger, String s)
	{
		if(mCallbacksMessenger != messenger)
	//*   0    0:aload_0         
	//*   1    1:getfield        #132 <Field Messenger mCallbacksMessenger>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       70
		{
			if(mState != 0)
	//*   4    8:aload_0         
	//*   5    9:getfield        #81  <Field int mState>
	//*   6   12:ifeq            68
				Log.i("MediaBrowserCompat", (new StringBuilder()).append(s).append(" for ").append(((Object) (mServiceComponent))).append(" with mCallbacksMessenger=").append(((Object) (mCallbacksMessenger))).append(" this=").append(((Object) (this))).toString());
	//    7   15:ldc1            #134 <String "MediaBrowserCompat">
	//    8   17:new             #114 <Class StringBuilder>
	//    9   20:dup             
	//   10   21:invokespecial   #115 <Method void StringBuilder()>
	//   11   24:aload_2         
	//   12   25:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   13   28:ldc1            #136 <String " for ">
	//   14   30:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   15   33:aload_0         
	//   16   34:getfield        #96  <Field ComponentName mServiceComponent>
	//   17   37:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
	//   18   40:ldc1            #141 <String " with mCallbacksMessenger=">
	//   19   42:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   20   45:aload_0         
	//   21   46:getfield        #132 <Field Messenger mCallbacksMessenger>
	//   22   49:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
	//   23   52:ldc1            #143 <String " this=">
	//   24   54:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   25   57:aload_0         
	//   26   58:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
	//   27   61:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   28   64:invokestatic    #149 <Method int Log.i(String, String)>
	//   29   67:pop             
			return false;
	//   30   68:iconst_0        
	//   31   69:ireturn         
		} else
		{
			return true;
	//   32   70:iconst_1        
	//   33   71:ireturn         
		}
	}

	public void connect()
	{
		boolean flag;
		final MediaServiceConnection thisConnection;
		Intent intent;
		if(mState != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field int mState>
	//*   2    4:ifeq            45
			throw new IllegalStateException((new StringBuilder()).append("connect() called while not disconnected (state=").append(getStateLabel(mState)).append(")").toString());
	//    3    7:new             #154 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:new             #114 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #115 <Method void StringBuilder()>
	//    8   18:ldc1            #156 <String "connect() called while not disconnected (state=">
	//    9   20:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   10   23:aload_0         
	//   11   24:getfield        #81  <Field int mState>
	//   12   27:invokestatic    #158 <Method String getStateLabel(int)>
	//   13   30:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   14   33:ldc1            #160 <String ")">
	//   15   35:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   16   38:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   17   41:invokespecial   #161 <Method void IllegalStateException(String)>
	//   18   44:athrow          
		if(MediaBrowserCompat.DEBUG && mServiceConnection != null)
	//*  19   45:getstatic       #165 <Field boolean MediaBrowserCompat.DEBUG>
	//*  20   48:ifeq            88
	//*  21   51:aload_0         
	//*  22   52:getfield        #167 <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mServiceConnection>
	//*  23   55:ifnull          88
			throw new RuntimeException((new StringBuilder()).append("mServiceConnection should be null. Instead it is ").append(((Object) (mServiceConnection))).toString());
	//   24   58:new             #169 <Class RuntimeException>
	//   25   61:dup             
	//   26   62:new             #114 <Class StringBuilder>
	//   27   65:dup             
	//   28   66:invokespecial   #115 <Method void StringBuilder()>
	//   29   69:ldc1            #171 <String "mServiceConnection should be null. Instead it is ">
	//   30   71:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   31   74:aload_0         
	//   32   75:getfield        #167 <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mServiceConnection>
	//   33   78:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
	//   34   81:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   35   84:invokespecial   #172 <Method void RuntimeException(String)>
	//   36   87:athrow          
		if(mServiceBinderWrapper != null)
	//*  37   88:aload_0         
	//*  38   89:getfield        #174 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//*  39   92:ifnull          125
			throw new RuntimeException((new StringBuilder()).append("mServiceBinderWrapper should be null. Instead it is ").append(((Object) (mServiceBinderWrapper))).toString());
	//   40   95:new             #169 <Class RuntimeException>
	//   41   98:dup             
	//   42   99:new             #114 <Class StringBuilder>
	//   43  102:dup             
	//   44  103:invokespecial   #115 <Method void StringBuilder()>
	//   45  106:ldc1            #176 <String "mServiceBinderWrapper should be null. Instead it is ">
	//   46  108:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   47  111:aload_0         
	//   48  112:getfield        #174 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   49  115:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
	//   50  118:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   51  121:invokespecial   #172 <Method void RuntimeException(String)>
	//   52  124:athrow          
		if(mCallbacksMessenger != null)
	//*  53  125:aload_0         
	//*  54  126:getfield        #132 <Field Messenger mCallbacksMessenger>
	//*  55  129:ifnull          162
			throw new RuntimeException((new StringBuilder()).append("mCallbacksMessenger should be null. Instead it is ").append(((Object) (mCallbacksMessenger))).toString());
	//   56  132:new             #169 <Class RuntimeException>
	//   57  135:dup             
	//   58  136:new             #114 <Class StringBuilder>
	//   59  139:dup             
	//   60  140:invokespecial   #115 <Method void StringBuilder()>
	//   61  143:ldc1            #178 <String "mCallbacksMessenger should be null. Instead it is ">
	//   62  145:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   63  148:aload_0         
	//   64  149:getfield        #132 <Field Messenger mCallbacksMessenger>
	//   65  152:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
	//   66  155:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   67  158:invokespecial   #172 <Method void RuntimeException(String)>
	//   68  161:athrow          
		mState = 1;
	//   69  162:aload_0         
	//   70  163:iconst_1        
	//   71  164:putfield        #81  <Field int mState>
		intent = new Intent("android.media.browse.MediaBrowserService");
	//   72  167:new             #180 <Class Intent>
	//   73  170:dup             
	//   74  171:ldc1            #182 <String "android.media.browse.MediaBrowserService">
	//   75  173:invokespecial   #183 <Method void Intent(String)>
	//   76  176:astore          4
		intent.setComponent(mServiceComponent);
	//   77  178:aload           4
	//   78  180:aload_0         
	//   79  181:getfield        #96  <Field ComponentName mServiceComponent>
	//   80  184:invokevirtual   #187 <Method Intent Intent.setComponent(ComponentName)>
	//   81  187:pop             
		thisConnection = new MediaServiceConnection();
	//   82  188:new             #23  <Class MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection>
	//   83  191:dup             
	//   84  192:aload_0         
	//   85  193:invokespecial   #190 <Method void MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection(MediaBrowserCompat$MediaBrowserImplBase)>
	//   86  196:astore_3        
		mServiceConnection = thisConnection;
	//   87  197:aload_0         
	//   88  198:aload_3         
	//   89  199:putfield        #167 <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mServiceConnection>
		flag = false;
	//   90  202:iconst_0        
	//   91  203:istore_1        
		boolean flag1 = mContext.bindService(intent, ((ServiceConnection) (mServiceConnection)), 1);
	//   92  204:aload_0         
	//   93  205:getfield        #94  <Field Context mContext>
	//   94  208:aload           4
	//   95  210:aload_0         
	//   96  211:getfield        #167 <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mServiceConnection>
	//   97  214:iconst_1        
	//   98  215:invokevirtual   #196 <Method boolean Context.bindService(Intent, ServiceConnection, int)>
	//   99  218:istore_2        
		flag = flag1;
	//  100  219:iload_2         
	//  101  220:istore_1        
		break MISSING_BLOCK_LABEL_254;
	//  102  221:goto            254
		Exception exception;
		exception;
	//  103  224:astore          4
		Log.e("MediaBrowserCompat", (new StringBuilder()).append("Failed binding to service ").append(((Object) (mServiceComponent))).toString());
	//  104  226:ldc1            #134 <String "MediaBrowserCompat">
	//  105  228:new             #114 <Class StringBuilder>
	//  106  231:dup             
	//  107  232:invokespecial   #115 <Method void StringBuilder()>
	//  108  235:ldc1            #198 <String "Failed binding to service ">
	//  109  237:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//  110  240:aload_0         
	//  111  241:getfield        #96  <Field ComponentName mServiceComponent>
	//  112  244:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
	//  113  247:invokevirtual   #128 <Method String StringBuilder.toString()>
	//  114  250:invokestatic    #201 <Method int Log.e(String, String)>
	//  115  253:pop             
		if(!flag)
	//* 116  254:iload_1         
	//* 117  255:ifne            275
			mHandler.post(new Runnable() {

				public void run()
				{
					if(thisConnection == mServiceConnection)
				//*   0    0:aload_0         
				//*   1    1:getfield        #24  <Field ServiceConnection val$thisConnection>
				//*   2    4:aload_0         
				//*   3    5:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				//*   4    8:getfield        #32  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
				//*   5   11:if_acmpne       31
					{
						forceCloseConnection();
				//    6   14:aload_0         
				//    7   15:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				//    8   18:invokevirtual   #35  <Method void MediaBrowserCompat$MediaBrowserImplBase.forceCloseConnection()>
						mCallback.onConnectionFailed();
				//    9   21:aload_0         
				//   10   22:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				//   11   25:getfield        #39  <Field MediaBrowserCompat$ConnectionCallback MediaBrowserCompat$MediaBrowserImplBase.mCallback>
				//   12   28:invokevirtual   #44  <Method void MediaBrowserCompat$ConnectionCallback.onConnectionFailed()>
					}
				//   13   31:return          
				}

				final MediaBrowserCompat.MediaBrowserImplBase this$0;
				final ServiceConnection val$thisConnection;

			
			{
				this$0 = MediaBrowserCompat.MediaBrowserImplBase.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				thisConnection = serviceconnection;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field ServiceConnection val$thisConnection>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//  118  258:aload_0         
	//  119  259:getfield        #74  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//  120  262:new             #13  <Class MediaBrowserCompat$MediaBrowserImplBase$1>
	//  121  265:dup             
	//  122  266:aload_0         
	//  123  267:aload_3         
	//  124  268:invokespecial   #204 <Method void MediaBrowserCompat$MediaBrowserImplBase$1(MediaBrowserCompat$MediaBrowserImplBase, ServiceConnection)>
	//  125  271:invokevirtual   #208 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//  126  274:pop             
		if(MediaBrowserCompat.DEBUG)
	//* 127  275:getstatic       #165 <Field boolean MediaBrowserCompat.DEBUG>
	//* 128  278:ifeq            293
		{
			Log.d("MediaBrowserCompat", "connect...");
	//  129  281:ldc1            #134 <String "MediaBrowserCompat">
	//  130  283:ldc1            #210 <String "connect...">
	//  131  285:invokestatic    #213 <Method int Log.d(String, String)>
	//  132  288:pop             
			dump();
	//  133  289:aload_0         
	//  134  290:invokevirtual   #216 <Method void dump()>
		}
		return;
	//  135  293:return          
	}

	public void disconnect()
	{
		if(mCallbacksMessenger != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #132 <Field Messenger mCallbacksMessenger>
	//*   2    4:ifnull          50
			try
			{
				mServiceBinderWrapper.disconnect(mCallbacksMessenger);
	//    3    7:aload_0         
	//    4    8:getfield        #174 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//    5   11:aload_0         
	//    6   12:getfield        #132 <Field Messenger mCallbacksMessenger>
	//    7   15:invokevirtual   #224 <Method void MediaBrowserCompat$ServiceBinderWrapper.disconnect(Messenger)>
			}
	//*   8   18:goto            50
			catch(RemoteException remoteexception)
	//*   9   21:astore_1        
			{
				Log.w("MediaBrowserCompat", (new StringBuilder()).append("RemoteException during connect for ").append(((Object) (mServiceComponent))).toString());
	//   10   22:ldc1            #134 <String "MediaBrowserCompat">
	//   11   24:new             #114 <Class StringBuilder>
	//   12   27:dup             
	//   13   28:invokespecial   #115 <Method void StringBuilder()>
	//   14   31:ldc1            #226 <String "RemoteException during connect for ">
	//   15   33:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   16   36:aload_0         
	//   17   37:getfield        #96  <Field ComponentName mServiceComponent>
	//   18   40:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
	//   19   43:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   20   46:invokestatic    #229 <Method int Log.w(String, String)>
	//   21   49:pop             
			}
		forceCloseConnection();
	//   22   50:aload_0         
	//   23   51:invokevirtual   #232 <Method void forceCloseConnection()>
		if(MediaBrowserCompat.DEBUG)
	//*  24   54:getstatic       #165 <Field boolean MediaBrowserCompat.DEBUG>
	//*  25   57:ifeq            72
		{
			Log.d("MediaBrowserCompat", "disconnect...");
	//   26   60:ldc1            #134 <String "MediaBrowserCompat">
	//   27   62:ldc1            #234 <String "disconnect...">
	//   28   64:invokestatic    #213 <Method int Log.d(String, String)>
	//   29   67:pop             
			dump();
	//   30   68:aload_0         
	//   31   69:invokevirtual   #216 <Method void dump()>
		}
	//   32   72:return          
	}

	void dump()
	{
		Log.d("MediaBrowserCompat", "MediaBrowserCompat...");
	//    0    0:ldc1            #134 <String "MediaBrowserCompat">
	//    1    2:ldc1            #236 <String "MediaBrowserCompat...">
	//    2    4:invokestatic    #213 <Method int Log.d(String, String)>
	//    3    7:pop             
		Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mServiceComponent=").append(((Object) (mServiceComponent))).toString());
	//    4    8:ldc1            #134 <String "MediaBrowserCompat">
	//    5   10:new             #114 <Class StringBuilder>
	//    6   13:dup             
	//    7   14:invokespecial   #115 <Method void StringBuilder()>
	//    8   17:ldc1            #238 <String "  mServiceComponent=">
	//    9   19:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:aload_0         
	//   11   23:getfield        #96  <Field ComponentName mServiceComponent>
	//   12   26:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
	//   13   29:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   14   32:invokestatic    #213 <Method int Log.d(String, String)>
	//   15   35:pop             
		Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mCallback=").append(((Object) (mCallback))).toString());
	//   16   36:ldc1            #134 <String "MediaBrowserCompat">
	//   17   38:new             #114 <Class StringBuilder>
	//   18   41:dup             
	//   19   42:invokespecial   #115 <Method void StringBuilder()>
	//   20   45:ldc1            #240 <String "  mCallback=">
	//   21   47:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   22   50:aload_0         
	//   23   51:getfield        #98  <Field MediaBrowserCompat$ConnectionCallback mCallback>
	//   24   54:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
	//   25   57:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   26   60:invokestatic    #213 <Method int Log.d(String, String)>
	//   27   63:pop             
		Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mRootHints=").append(((Object) (mRootHints))).toString());
	//   28   64:ldc1            #134 <String "MediaBrowserCompat">
	//   29   66:new             #114 <Class StringBuilder>
	//   30   69:dup             
	//   31   70:invokespecial   #115 <Method void StringBuilder()>
	//   32   73:ldc1            #242 <String "  mRootHints=">
	//   33   75:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   34   78:aload_0         
	//   35   79:getfield        #105 <Field Bundle mRootHints>
	//   36   82:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
	//   37   85:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   38   88:invokestatic    #213 <Method int Log.d(String, String)>
	//   39   91:pop             
		Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mState=").append(getStateLabel(mState)).toString());
	//   40   92:ldc1            #134 <String "MediaBrowserCompat">
	//   41   94:new             #114 <Class StringBuilder>
	//   42   97:dup             
	//   43   98:invokespecial   #115 <Method void StringBuilder()>
	//   44  101:ldc1            #244 <String "  mState=">
	//   45  103:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   46  106:aload_0         
	//   47  107:getfield        #81  <Field int mState>
	//   48  110:invokestatic    #158 <Method String getStateLabel(int)>
	//   49  113:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   50  116:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   51  119:invokestatic    #213 <Method int Log.d(String, String)>
	//   52  122:pop             
		Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mServiceConnection=").append(((Object) (mServiceConnection))).toString());
	//   53  123:ldc1            #134 <String "MediaBrowserCompat">
	//   54  125:new             #114 <Class StringBuilder>
	//   55  128:dup             
	//   56  129:invokespecial   #115 <Method void StringBuilder()>
	//   57  132:ldc1            #246 <String "  mServiceConnection=">
	//   58  134:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   59  137:aload_0         
	//   60  138:getfield        #167 <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mServiceConnection>
	//   61  141:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
	//   62  144:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   63  147:invokestatic    #213 <Method int Log.d(String, String)>
	//   64  150:pop             
		Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mServiceBinderWrapper=").append(((Object) (mServiceBinderWrapper))).toString());
	//   65  151:ldc1            #134 <String "MediaBrowserCompat">
	//   66  153:new             #114 <Class StringBuilder>
	//   67  156:dup             
	//   68  157:invokespecial   #115 <Method void StringBuilder()>
	//   69  160:ldc1            #248 <String "  mServiceBinderWrapper=">
	//   70  162:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   71  165:aload_0         
	//   72  166:getfield        #174 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   73  169:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
	//   74  172:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   75  175:invokestatic    #213 <Method int Log.d(String, String)>
	//   76  178:pop             
		Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mCallbacksMessenger=").append(((Object) (mCallbacksMessenger))).toString());
	//   77  179:ldc1            #134 <String "MediaBrowserCompat">
	//   78  181:new             #114 <Class StringBuilder>
	//   79  184:dup             
	//   80  185:invokespecial   #115 <Method void StringBuilder()>
	//   81  188:ldc1            #250 <String "  mCallbacksMessenger=">
	//   82  190:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   83  193:aload_0         
	//   84  194:getfield        #132 <Field Messenger mCallbacksMessenger>
	//   85  197:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
	//   86  200:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   87  203:invokestatic    #213 <Method int Log.d(String, String)>
	//   88  206:pop             
		Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mRootId=").append(mRootId).toString());
	//   89  207:ldc1            #134 <String "MediaBrowserCompat">
	//   90  209:new             #114 <Class StringBuilder>
	//   91  212:dup             
	//   92  213:invokespecial   #115 <Method void StringBuilder()>
	//   93  216:ldc1            #252 <String "  mRootId=">
	//   94  218:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   95  221:aload_0         
	//   96  222:getfield        #254 <Field String mRootId>
	//   97  225:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   98  228:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   99  231:invokestatic    #213 <Method int Log.d(String, String)>
	//  100  234:pop             
		Log.d("MediaBrowserCompat", (new StringBuilder()).append("  mMediaSessionToken=").append(((Object) (mMediaSessionToken))).toString());
	//  101  235:ldc1            #134 <String "MediaBrowserCompat">
	//  102  237:new             #114 <Class StringBuilder>
	//  103  240:dup             
	//  104  241:invokespecial   #115 <Method void StringBuilder()>
	//  105  244:ldc2            #256 <String "  mMediaSessionToken=">
	//  106  247:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//  107  250:aload_0         
	//  108  251:getfield        #258 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
	//  109  254:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
	//  110  257:invokevirtual   #128 <Method String StringBuilder.toString()>
	//  111  260:invokestatic    #213 <Method int Log.d(String, String)>
	//  112  263:pop             
	//  113  264:return          
	}

	void forceCloseConnection()
	{
		if(mServiceConnection != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #167 <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mServiceConnection>
	//*   2    4:ifnull          18
			mContext.unbindService(((ServiceConnection) (mServiceConnection)));
	//    3    7:aload_0         
	//    4    8:getfield        #94  <Field Context mContext>
	//    5   11:aload_0         
	//    6   12:getfield        #167 <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mServiceConnection>
	//    7   15:invokevirtual   #262 <Method void Context.unbindService(ServiceConnection)>
		mState = 0;
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:putfield        #81  <Field int mState>
		mServiceConnection = null;
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:putfield        #167 <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mServiceConnection>
		mServiceBinderWrapper = null;
	//   14   28:aload_0         
	//   15   29:aconst_null     
	//   16   30:putfield        #174 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		mCallbacksMessenger = null;
	//   17   33:aload_0         
	//   18   34:aconst_null     
	//   19   35:putfield        #132 <Field Messenger mCallbacksMessenger>
		mHandler.setCallbacksMessenger(((Messenger) (null)));
	//   20   38:aload_0         
	//   21   39:getfield        #74  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   22   42:aconst_null     
	//   23   43:invokevirtual   #265 <Method void MediaBrowserCompat$CallbackHandler.setCallbacksMessenger(Messenger)>
		mRootId = null;
	//   24   46:aload_0         
	//   25   47:aconst_null     
	//   26   48:putfield        #254 <Field String mRootId>
		mMediaSessionToken = null;
	//   27   51:aload_0         
	//   28   52:aconst_null     
	//   29   53:putfield        #258 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
	//   30   56:return          
	}

	public Bundle getExtras()
	{
		if(!isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #272 <Method boolean isConnected()>
	//*   2    4:ifne            46
			throw new IllegalStateException((new StringBuilder()).append("getExtras() called while not connected (state=").append(getStateLabel(mState)).append(")").toString());
	//    3    7:new             #154 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:new             #114 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #115 <Method void StringBuilder()>
	//    8   18:ldc2            #274 <String "getExtras() called while not connected (state=">
	//    9   21:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #81  <Field int mState>
	//   12   28:invokestatic    #158 <Method String getStateLabel(int)>
	//   13   31:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   14   34:ldc1            #160 <String ")">
	//   15   36:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   16   39:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   17   42:invokespecial   #161 <Method void IllegalStateException(String)>
	//   18   45:athrow          
		else
			return mExtras;
	//   19   46:aload_0         
	//   20   47:getfield        #276 <Field Bundle mExtras>
	//   21   50:areturn         
	}

	public void getItem(final String mediaId, final MediaBrowserCompat.ItemCallback cb)
	{
		if(TextUtils.isEmpty(((CharSequence) (mediaId))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #286 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            18
			throw new IllegalArgumentException("mediaId is empty");
	//    3    7:new             #83  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc2            #288 <String "mediaId is empty">
	//    6   14:invokespecial   #88  <Method void IllegalArgumentException(String)>
	//    7   17:athrow          
		if(cb == null)
	//*   8   18:aload_2         
	//*   9   19:ifnonnull       33
			throw new IllegalArgumentException("cb is null");
	//   10   22:new             #83  <Class IllegalArgumentException>
	//   11   25:dup             
	//   12   26:ldc2            #290 <String "cb is null">
	//   13   29:invokespecial   #88  <Method void IllegalArgumentException(String)>
	//   14   32:athrow          
		if(mState != 2)
	//*  15   33:aload_0         
	//*  16   34:getfield        #81  <Field int mState>
	//*  17   37:iconst_2        
	//*  18   38:icmpeq          69
		{
			Log.i("MediaBrowserCompat", "Not connected, unable to retrieve the MediaItem.");
	//   19   41:ldc1            #134 <String "MediaBrowserCompat">
	//   20   43:ldc2            #292 <String "Not connected, unable to retrieve the MediaItem.">
	//   21   46:invokestatic    #149 <Method int Log.i(String, String)>
	//   22   49:pop             
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
	//   23   50:aload_0         
	//   24   51:getfield        #74  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   25   54:new             #15  <Class MediaBrowserCompat$MediaBrowserImplBase$2>
	//   26   57:dup             
	//   27   58:aload_0         
	//   28   59:aload_2         
	//   29   60:aload_1         
	//   30   61:invokespecial   #295 <Method void MediaBrowserCompat$MediaBrowserImplBase$2(MediaBrowserCompat$MediaBrowserImplBase, MediaBrowserCompat$ItemCallback, String)>
	//   31   64:invokevirtual   #208 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   32   67:pop             
			return;
	//   33   68:return          
		}
		MediaBrowserCompat.ItemReceiver itemreceiver = new MediaBrowserCompat.ItemReceiver(mediaId, cb, ((android.os.Handler) (mHandler)));
	//   34   69:new             #297 <Class MediaBrowserCompat$ItemReceiver>
	//   35   72:dup             
	//   36   73:aload_1         
	//   37   74:aload_2         
	//   38   75:aload_0         
	//   39   76:getfield        #74  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   40   79:invokespecial   #300 <Method void MediaBrowserCompat$ItemReceiver(String, MediaBrowserCompat$ItemCallback, android.os.Handler)>
	//   41   82:astore_3        
		try
		{
			mServiceBinderWrapper.getMediaItem(mediaId, ((android.support.v4.os.ResultReceiver) (itemreceiver)), mCallbacksMessenger);
	//   42   83:aload_0         
	//   43   84:getfield        #174 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   44   87:aload_1         
	//   45   88:aload_3         
	//   46   89:aload_0         
	//   47   90:getfield        #132 <Field Messenger mCallbacksMessenger>
	//   48   93:invokevirtual   #304 <Method void MediaBrowserCompat$ServiceBinderWrapper.getMediaItem(String, android.support.v4.os.ResultReceiver, Messenger)>
			return;
	//   49   96:return          
		}
		catch(RemoteException remoteexception)
	//*  50   97:astore_3        
		{
			Log.i("MediaBrowserCompat", "Remote error getting media item.");
	//   51   98:ldc1            #134 <String "MediaBrowserCompat">
	//   52  100:ldc2            #306 <String "Remote error getting media item.">
	//   53  103:invokestatic    #149 <Method int Log.i(String, String)>
	//   54  106:pop             
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
	//   55  107:aload_0         
	//   56  108:getfield        #74  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   57  111:new             #17  <Class MediaBrowserCompat$MediaBrowserImplBase$3>
	//   58  114:dup             
	//   59  115:aload_0         
	//   60  116:aload_2         
	//   61  117:aload_1         
	//   62  118:invokespecial   #307 <Method void MediaBrowserCompat$MediaBrowserImplBase$3(MediaBrowserCompat$MediaBrowserImplBase, MediaBrowserCompat$ItemCallback, String)>
	//   63  121:invokevirtual   #208 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   64  124:pop             
	//   65  125:return          
	}

	public String getRoot()
	{
		if(!isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #272 <Method boolean isConnected()>
	//*   2    4:ifne            46
			throw new IllegalStateException((new StringBuilder()).append("getRoot() called while not connected(state=").append(getStateLabel(mState)).append(")").toString());
	//    3    7:new             #154 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:new             #114 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #115 <Method void StringBuilder()>
	//    8   18:ldc2            #311 <String "getRoot() called while not connected(state=">
	//    9   21:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #81  <Field int mState>
	//   12   28:invokestatic    #158 <Method String getStateLabel(int)>
	//   13   31:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   14   34:ldc1            #160 <String ")">
	//   15   36:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   16   39:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   17   42:invokespecial   #161 <Method void IllegalStateException(String)>
	//   18   45:athrow          
		else
			return mRootId;
	//   19   46:aload_0         
	//   20   47:getfield        #254 <Field String mRootId>
	//   21   50:areturn         
	}

	public ComponentName getServiceComponent()
	{
		if(!isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #272 <Method boolean isConnected()>
	//*   2    4:ifne            43
			throw new IllegalStateException((new StringBuilder()).append("getServiceComponent() called while not connected (state=").append(mState).append(")").toString());
	//    3    7:new             #154 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:new             #114 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #115 <Method void StringBuilder()>
	//    8   18:ldc2            #315 <String "getServiceComponent() called while not connected (state=">
	//    9   21:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #81  <Field int mState>
	//   12   28:invokevirtual   #124 <Method StringBuilder StringBuilder.append(int)>
	//   13   31:ldc1            #160 <String ")">
	//   14   33:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   15   36:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   16   39:invokespecial   #161 <Method void IllegalStateException(String)>
	//   17   42:athrow          
		else
			return mServiceComponent;
	//   18   43:aload_0         
	//   19   44:getfield        #96  <Field ComponentName mServiceComponent>
	//   20   47:areturn         
	}

	public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken()
	{
		if(!isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #272 <Method boolean isConnected()>
	//*   2    4:ifne            43
			throw new IllegalStateException((new StringBuilder()).append("getSessionToken() called while not connected(state=").append(mState).append(")").toString());
	//    3    7:new             #154 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:new             #114 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #115 <Method void StringBuilder()>
	//    8   18:ldc2            #319 <String "getSessionToken() called while not connected(state=">
	//    9   21:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #81  <Field int mState>
	//   12   28:invokevirtual   #124 <Method StringBuilder StringBuilder.append(int)>
	//   13   31:ldc1            #160 <String ")">
	//   14   33:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   15   36:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   16   39:invokespecial   #161 <Method void IllegalStateException(String)>
	//   17   42:athrow          
		else
			return mMediaSessionToken;
	//   18   43:aload_0         
	//   19   44:getfield        #258 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
	//   20   47:areturn         
	}

	public boolean isConnected()
	{
		return mState == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field int mState>
	//    2    4:iconst_2        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public void onConnectionFailed(Messenger messenger)
	{
		Log.e("MediaBrowserCompat", (new StringBuilder()).append("onConnectFailed for ").append(((Object) (mServiceComponent))).toString());
	//    0    0:ldc1            #134 <String "MediaBrowserCompat">
	//    1    2:new             #114 <Class StringBuilder>
	//    2    5:dup             
	//    3    6:invokespecial   #115 <Method void StringBuilder()>
	//    4    9:ldc2            #322 <String "onConnectFailed for ">
	//    5   12:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//    6   15:aload_0         
	//    7   16:getfield        #96  <Field ComponentName mServiceComponent>
	//    8   19:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
	//    9   22:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   10   25:invokestatic    #201 <Method int Log.e(String, String)>
	//   11   28:pop             
		if(!isCurrent(messenger, "onConnectFailed"))
	//*  12   29:aload_0         
	//*  13   30:aload_1         
	//*  14   31:ldc2            #324 <String "onConnectFailed">
	//*  15   34:invokespecial   #326 <Method boolean isCurrent(Messenger, String)>
	//*  16   37:ifne            41
			return;
	//   17   40:return          
		if(mState != 1)
	//*  18   41:aload_0         
	//*  19   42:getfield        #81  <Field int mState>
	//*  20   45:iconst_1        
	//*  21   46:icmpeq          88
		{
			Log.w("MediaBrowserCompat", (new StringBuilder()).append("onConnect from service while mState=").append(getStateLabel(mState)).append("... ignoring").toString());
	//   22   49:ldc1            #134 <String "MediaBrowserCompat">
	//   23   51:new             #114 <Class StringBuilder>
	//   24   54:dup             
	//   25   55:invokespecial   #115 <Method void StringBuilder()>
	//   26   58:ldc2            #328 <String "onConnect from service while mState=">
	//   27   61:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   28   64:aload_0         
	//   29   65:getfield        #81  <Field int mState>
	//   30   68:invokestatic    #158 <Method String getStateLabel(int)>
	//   31   71:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   32   74:ldc2            #330 <String "... ignoring">
	//   33   77:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   34   80:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   35   83:invokestatic    #229 <Method int Log.w(String, String)>
	//   36   86:pop             
			return;
	//   37   87:return          
		} else
		{
			forceCloseConnection();
	//   38   88:aload_0         
	//   39   89:invokevirtual   #232 <Method void forceCloseConnection()>
			mCallback.onConnectionFailed();
	//   40   92:aload_0         
	//   41   93:getfield        #98  <Field MediaBrowserCompat$ConnectionCallback mCallback>
	//   42   96:invokevirtual   #334 <Method void MediaBrowserCompat$ConnectionCallback.onConnectionFailed()>
			return;
	//   43   99:return          
		}
	}

	public void onLoadChildren(Messenger messenger, String s, List list, Bundle bundle)
	{
		if(!isCurrent(messenger, "onLoadChildren"))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:ldc2            #337 <String "onLoadChildren">
	//*   3    5:invokespecial   #326 <Method boolean isCurrent(Messenger, String)>
	//*   4    8:ifne            12
			return;
	//    5   11:return          
		if(MediaBrowserCompat.DEBUG)
	//*   6   12:getstatic       #165 <Field boolean MediaBrowserCompat.DEBUG>
	//*   7   15:ifeq            57
			Log.d("MediaBrowserCompat", (new StringBuilder()).append("onLoadChildren for ").append(((Object) (mServiceComponent))).append(" id=").append(s).toString());
	//    8   18:ldc1            #134 <String "MediaBrowserCompat">
	//    9   20:new             #114 <Class StringBuilder>
	//   10   23:dup             
	//   11   24:invokespecial   #115 <Method void StringBuilder()>
	//   12   27:ldc2            #339 <String "onLoadChildren for ">
	//   13   30:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   14   33:aload_0         
	//   15   34:getfield        #96  <Field ComponentName mServiceComponent>
	//   16   37:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
	//   17   40:ldc2            #341 <String " id=">
	//   18   43:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   19   46:aload_2         
	//   20   47:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   21   50:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   22   53:invokestatic    #213 <Method int Log.d(String, String)>
	//   23   56:pop             
		messenger = ((Messenger) ((MediaBrowserCompat.Subscription)mSubscriptions.get(((Object) (s)))));
	//   24   57:aload_0         
	//   25   58:getfield        #79  <Field ArrayMap mSubscriptions>
	//   26   61:aload_2         
	//   27   62:invokevirtual   #345 <Method Object ArrayMap.get(Object)>
	//   28   65:checkcast       #347 <Class MediaBrowserCompat$Subscription>
	//   29   68:astore_1        
		if(messenger == null)
	//*  30   69:aload_1         
	//*  31   70:ifnonnull       106
		{
			if(MediaBrowserCompat.DEBUG)
	//*  32   73:getstatic       #165 <Field boolean MediaBrowserCompat.DEBUG>
	//*  33   76:ifeq            105
				Log.d("MediaBrowserCompat", (new StringBuilder()).append("onLoadChildren for id that isn't subscribed id=").append(s).toString());
	//   34   79:ldc1            #134 <String "MediaBrowserCompat">
	//   35   81:new             #114 <Class StringBuilder>
	//   36   84:dup             
	//   37   85:invokespecial   #115 <Method void StringBuilder()>
	//   38   88:ldc2            #349 <String "onLoadChildren for id that isn't subscribed id=">
	//   39   91:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   40   94:aload_2         
	//   41   95:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   42   98:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   43  101:invokestatic    #213 <Method int Log.d(String, String)>
	//   44  104:pop             
			return;
	//   45  105:return          
		}
		messenger = ((Messenger) (((MediaBrowserCompat.Subscription) (messenger)).getCallback(bundle)));
	//   46  106:aload_1         
	//   47  107:aload           4
	//   48  109:invokevirtual   #353 <Method MediaBrowserCompat$SubscriptionCallback MediaBrowserCompat$Subscription.getCallback(Bundle)>
	//   49  112:astore_1        
		if(messenger != null)
	//*  50  113:aload_1         
	//*  51  114:ifnull          159
		{
			if(bundle == null)
	//*  52  117:aload           4
	//*  53  119:ifnonnull       139
				if(list == null)
	//*  54  122:aload_3         
	//*  55  123:ifnonnull       132
				{
					((MediaBrowserCompat$SubscriptionCallback) (messenger)).onError(s);
	//   56  126:aload_1         
	//   57  127:aload_2         
	//   58  128:invokevirtual   #358 <Method void MediaBrowserCompat$SubscriptionCallback.onError(String)>
					return;
	//   59  131:return          
				} else
				{
					((MediaBrowserCompat$SubscriptionCallback) (messenger)).onChildrenLoaded(s, list);
	//   60  132:aload_1         
	//   61  133:aload_2         
	//   62  134:aload_3         
	//   63  135:invokevirtual   #362 <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List)>
					return;
	//   64  138:return          
				}
			if(list == null)
	//*  65  139:aload_3         
	//*  66  140:ifnonnull       151
			{
				((MediaBrowserCompat$SubscriptionCallback) (messenger)).onError(s, bundle);
	//   67  143:aload_1         
	//   68  144:aload_2         
	//   69  145:aload           4
	//   70  147:invokevirtual   #365 <Method void MediaBrowserCompat$SubscriptionCallback.onError(String, Bundle)>
				return;
	//   71  150:return          
			}
			((MediaBrowserCompat$SubscriptionCallback) (messenger)).onChildrenLoaded(s, list, bundle);
	//   72  151:aload_1         
	//   73  152:aload_2         
	//   74  153:aload_3         
	//   75  154:aload           4
	//   76  156:invokevirtual   #368 <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List, Bundle)>
		}
	//   77  159:return          
	}

	public void onServiceConnected(Messenger messenger, String s, android.support.v4.media.session.MediaSessionCompat.Token token, Bundle bundle)
	{
		if(!isCurrent(messenger, "onConnect"))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:ldc2            #372 <String "onConnect">
	//*   3    5:invokespecial   #326 <Method boolean isCurrent(Messenger, String)>
	//*   4    8:ifne            12
			return;
	//    5   11:return          
		if(mState != 1)
	//*   6   12:aload_0         
	//*   7   13:getfield        #81  <Field int mState>
	//*   8   16:iconst_1        
	//*   9   17:icmpeq          59
		{
			Log.w("MediaBrowserCompat", (new StringBuilder()).append("onConnect from service while mState=").append(getStateLabel(mState)).append("... ignoring").toString());
	//   10   20:ldc1            #134 <String "MediaBrowserCompat">
	//   11   22:new             #114 <Class StringBuilder>
	//   12   25:dup             
	//   13   26:invokespecial   #115 <Method void StringBuilder()>
	//   14   29:ldc2            #328 <String "onConnect from service while mState=">
	//   15   32:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   16   35:aload_0         
	//   17   36:getfield        #81  <Field int mState>
	//   18   39:invokestatic    #158 <Method String getStateLabel(int)>
	//   19   42:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   20   45:ldc2            #330 <String "... ignoring">
	//   21   48:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   22   51:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   23   54:invokestatic    #229 <Method int Log.w(String, String)>
	//   24   57:pop             
			return;
	//   25   58:return          
		}
		mRootId = s;
	//   26   59:aload_0         
	//   27   60:aload_2         
	//   28   61:putfield        #254 <Field String mRootId>
		mMediaSessionToken = token;
	//   29   64:aload_0         
	//   30   65:aload_3         
	//   31   66:putfield        #258 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
		mExtras = bundle;
	//   32   69:aload_0         
	//   33   70:aload           4
	//   34   72:putfield        #276 <Field Bundle mExtras>
		mState = 2;
	//   35   75:aload_0         
	//   36   76:iconst_2        
	//   37   77:putfield        #81  <Field int mState>
		if(MediaBrowserCompat.DEBUG)
	//*  38   80:getstatic       #165 <Field boolean MediaBrowserCompat.DEBUG>
	//*  39   83:ifeq            99
		{
			Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
	//   40   86:ldc1            #134 <String "MediaBrowserCompat">
	//   41   88:ldc2            #374 <String "ServiceCallbacks.onConnect...">
	//   42   91:invokestatic    #213 <Method int Log.d(String, String)>
	//   43   94:pop             
			dump();
	//   44   95:aload_0         
	//   45   96:invokevirtual   #216 <Method void dump()>
		}
		mCallback.onConnected();
	//   46   99:aload_0         
	//   47  100:getfield        #98  <Field MediaBrowserCompat$ConnectionCallback mCallback>
	//   48  103:invokevirtual   #377 <Method void MediaBrowserCompat$ConnectionCallback.onConnected()>
		messenger = ((Messenger) (mSubscriptions.entrySet().iterator()));
	//   49  106:aload_0         
	//   50  107:getfield        #79  <Field ArrayMap mSubscriptions>
	//   51  110:invokevirtual   #381 <Method Set ArrayMap.entrySet()>
	//   52  113:invokeinterface #387 <Method Iterator Set.iterator()>
	//   53  118:astore_1        
_L2:
		if(!((Iterator) (messenger)).hasNext())
			break; /* Loop/switch isn't completed */
	//   54  119:aload_1         
	//   55  120:invokeinterface #392 <Method boolean Iterator.hasNext()>
	//   56  125:ifeq            236
		token = ((android.support.v4.media.session.MediaSessionCompat.Token) ((java.util.Map.Entry)((Iterator) (messenger)).next()));
	//   57  128:aload_1         
	//   58  129:invokeinterface #396 <Method Object Iterator.next()>
	//   59  134:checkcast       #398 <Class java.util.Map$Entry>
	//   60  137:astore_3        
		s = (String)((java.util.Map.Entry) (token)).getKey();
	//   61  138:aload_3         
	//   62  139:invokeinterface #401 <Method Object java.util.Map$Entry.getKey()>
	//   63  144:checkcast       #403 <Class String>
	//   64  147:astore_2        
		bundle = ((Bundle) ((MediaBrowserCompat.Subscription)((java.util.Map.Entry) (token)).getValue()));
	//   65  148:aload_3         
	//   66  149:invokeinterface #406 <Method Object java.util.Map$Entry.getValue()>
	//   67  154:checkcast       #347 <Class MediaBrowserCompat$Subscription>
	//   68  157:astore          4
		token = ((android.support.v4.media.session.MediaSessionCompat.Token) (((MediaBrowserCompat.Subscription) (bundle)).getCallbacks()));
	//   69  159:aload           4
	//   70  161:invokevirtual   #410 <Method List MediaBrowserCompat$Subscription.getCallbacks()>
	//   71  164:astore_3        
		bundle = ((Bundle) (((MediaBrowserCompat.Subscription) (bundle)).getOptionsList()));
	//   72  165:aload           4
	//   73  167:invokevirtual   #413 <Method List MediaBrowserCompat$Subscription.getOptionsList()>
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
	//   79  178:invokeinterface #419 <Method int List.size()>
	//   80  183:icmpge          233
				mServiceBinderWrapper.addSubscription(s, MediaBrowserCompat$SubscriptionCallback.access$000((MediaBrowserCompat$SubscriptionCallback)((List) (token)).get(i)), (Bundle)((List) (bundle)).get(i), mCallbacksMessenger);
	//   81  186:aload_0         
	//   82  187:getfield        #174 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   83  190:aload_2         
	//   84  191:aload_3         
	//   85  192:iload           5
	//   86  194:invokeinterface #422 <Method Object List.get(int)>
	//   87  199:checkcast       #355 <Class MediaBrowserCompat$SubscriptionCallback>
	//   88  202:invokestatic    #426 <Method IBinder MediaBrowserCompat$SubscriptionCallback.access$000(MediaBrowserCompat$SubscriptionCallback)>
	//   89  205:aload           4
	//   90  207:iload           5
	//   91  209:invokeinterface #422 <Method Object List.get(int)>
	//   92  214:checkcast       #100 <Class Bundle>
	//   93  217:aload_0         
	//   94  218:getfield        #132 <Field Messenger mCallbacksMessenger>
	//   95  221:invokevirtual   #430 <Method void MediaBrowserCompat$ServiceBinderWrapper.addSubscription(String, IBinder, Bundle, Messenger)>
			}
	//*  96  224:iload           5
	//*  97  226:iconst_1        
	//*  98  227:iadd            
	//*  99  228:istore          5
	//* 100  230:goto            175
	//* 101  233:goto            119
	//* 102  236:return          
			// Misplaced declaration of an exception variable
			catch(Messenger messenger)
	//* 103  237:astore_1        
			{
				Log.d("MediaBrowserCompat", "addSubscription failed with RemoteException.");
	//  104  238:ldc1            #134 <String "MediaBrowserCompat">
	//  105  240:ldc2            #432 <String "addSubscription failed with RemoteException.">
	//  106  243:invokestatic    #213 <Method int Log.d(String, String)>
	//  107  246:pop             
				return;
	//  108  247:return          
			}
			i++;
		} while(true);
		if(true) goto _L2; else goto _L1
_L1:
	}

	public void search(final String query, final Bundle extras, final MediaBrowserCompat.SearchCallback callback)
	{
		if(!isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #272 <Method boolean isConnected()>
	//*   2    4:ifne            36
		{
			Log.i("MediaBrowserCompat", "Not connected, unable to search.");
	//    3    7:ldc1            #134 <String "MediaBrowserCompat">
	//    4    9:ldc2            #436 <String "Not connected, unable to search.">
	//    5   12:invokestatic    #149 <Method int Log.i(String, String)>
	//    6   15:pop             
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
	//    7   16:aload_0         
	//    8   17:getfield        #74  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//    9   20:new             #19  <Class MediaBrowserCompat$MediaBrowserImplBase$4>
	//   10   23:dup             
	//   11   24:aload_0         
	//   12   25:aload_3         
	//   13   26:aload_1         
	//   14   27:aload_2         
	//   15   28:invokespecial   #439 <Method void MediaBrowserCompat$MediaBrowserImplBase$4(MediaBrowserCompat$MediaBrowserImplBase, MediaBrowserCompat$SearchCallback, String, Bundle)>
	//   16   31:invokevirtual   #208 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   17   34:pop             
			return;
	//   18   35:return          
		}
		MediaBrowserCompat$SearchResultReceiver mediabrowsercompat$searchresultreceiver = new MediaBrowserCompat$SearchResultReceiver(query, extras, callback, ((android.os.Handler) (mHandler)));
	//   19   36:new             #441 <Class MediaBrowserCompat$SearchResultReceiver>
	//   20   39:dup             
	//   21   40:aload_1         
	//   22   41:aload_2         
	//   23   42:aload_3         
	//   24   43:aload_0         
	//   25   44:getfield        #74  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   26   47:invokespecial   #444 <Method void MediaBrowserCompat$SearchResultReceiver(String, Bundle, MediaBrowserCompat$SearchCallback, android.os.Handler)>
	//   27   50:astore          4
		try
		{
			mServiceBinderWrapper.search(query, extras, ((android.support.v4.os.ResultReceiver) (mediabrowsercompat$searchresultreceiver)), mCallbacksMessenger);
	//   28   52:aload_0         
	//   29   53:getfield        #174 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   30   56:aload_1         
	//   31   57:aload_2         
	//   32   58:aload           4
	//   33   60:aload_0         
	//   34   61:getfield        #132 <Field Messenger mCallbacksMessenger>
	//   35   64:invokevirtual   #447 <Method void MediaBrowserCompat$ServiceBinderWrapper.search(String, Bundle, android.support.v4.os.ResultReceiver, Messenger)>
			return;
	//   36   67:return          
		}
		catch(RemoteException remoteexception)
	//*  37   68:astore          4
		{
			Log.i("MediaBrowserCompat", (new StringBuilder()).append("Remote error searching items with query: ").append(query).toString(), ((Throwable) (remoteexception)));
	//   38   70:ldc1            #134 <String "MediaBrowserCompat">
	//   39   72:new             #114 <Class StringBuilder>
	//   40   75:dup             
	//   41   76:invokespecial   #115 <Method void StringBuilder()>
	//   42   79:ldc2            #449 <String "Remote error searching items with query: ">
	//   43   82:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   44   85:aload_1         
	//   45   86:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   46   89:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   47   92:aload           4
	//   48   94:invokestatic    #452 <Method int Log.i(String, String, Throwable)>
	//   49   97:pop             
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
	//   50   98:aload_0         
	//   51   99:getfield        #74  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   52  102:new             #21  <Class MediaBrowserCompat$MediaBrowserImplBase$5>
	//   53  105:dup             
	//   54  106:aload_0         
	//   55  107:aload_3         
	//   56  108:aload_1         
	//   57  109:aload_2         
	//   58  110:invokespecial   #453 <Method void MediaBrowserCompat$MediaBrowserImplBase$5(MediaBrowserCompat$MediaBrowserImplBase, MediaBrowserCompat$SearchCallback, String, Bundle)>
	//   59  113:invokevirtual   #208 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   60  116:pop             
	//   61  117:return          
	}

	public void subscribe(String s, Bundle bundle, MediaBrowserCompat$SubscriptionCallback mediabrowsercompat$subscriptioncallback)
	{
		MediaBrowserCompat.Subscription subscription1 = (MediaBrowserCompat.Subscription)mSubscriptions.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field ArrayMap mSubscriptions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #345 <Method Object ArrayMap.get(Object)>
	//    4    8:checkcast       #347 <Class MediaBrowserCompat$Subscription>
	//    5   11:astore          5
		MediaBrowserCompat.Subscription subscription = subscription1;
	//    6   13:aload           5
	//    7   15:astore          4
		if(subscription1 == null)
	//*   8   17:aload           5
	//*   9   19:ifnonnull       42
		{
			subscription = new MediaBrowserCompat.Subscription();
	//   10   22:new             #347 <Class MediaBrowserCompat$Subscription>
	//   11   25:dup             
	//   12   26:invokespecial   #456 <Method void MediaBrowserCompat$Subscription()>
	//   13   29:astore          4
			mSubscriptions.put(((Object) (s)), ((Object) (subscription)));
	//   14   31:aload_0         
	//   15   32:getfield        #79  <Field ArrayMap mSubscriptions>
	//   16   35:aload_1         
	//   17   36:aload           4
	//   18   38:invokevirtual   #460 <Method Object ArrayMap.put(Object, Object)>
	//   19   41:pop             
		}
		if(bundle == null)
	//*  20   42:aload_2         
	//*  21   43:ifnonnull       51
			bundle = null;
	//   22   46:aconst_null     
	//   23   47:astore_2        
		else
	//*  24   48:goto            60
			bundle = new Bundle(bundle);
	//   25   51:new             #100 <Class Bundle>
	//   26   54:dup             
	//   27   55:aload_2         
	//   28   56:invokespecial   #103 <Method void Bundle(Bundle)>
	//   29   59:astore_2        
		subscription.putCallback(bundle, mediabrowsercompat$subscriptioncallback);
	//   30   60:aload           4
	//   31   62:aload_2         
	//   32   63:aload_3         
	//   33   64:invokevirtual   #464 <Method void MediaBrowserCompat$Subscription.putCallback(Bundle, MediaBrowserCompat$SubscriptionCallback)>
		if(mState == 2)
	//*  34   67:aload_0         
	//*  35   68:getfield        #81  <Field int mState>
	//*  36   71:iconst_2        
	//*  37   72:icmpne          120
			try
			{
				mServiceBinderWrapper.addSubscription(s, MediaBrowserCompat$SubscriptionCallback.access$000(mediabrowsercompat$subscriptioncallback), bundle, mCallbacksMessenger);
	//   38   75:aload_0         
	//   39   76:getfield        #174 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   40   79:aload_1         
	//   41   80:aload_3         
	//   42   81:invokestatic    #426 <Method IBinder MediaBrowserCompat$SubscriptionCallback.access$000(MediaBrowserCompat$SubscriptionCallback)>
	//   43   84:aload_2         
	//   44   85:aload_0         
	//   45   86:getfield        #132 <Field Messenger mCallbacksMessenger>
	//   46   89:invokevirtual   #430 <Method void MediaBrowserCompat$ServiceBinderWrapper.addSubscription(String, IBinder, Bundle, Messenger)>
				return;
	//   47   92:return          
			}
			// Misplaced declaration of an exception variable
			catch(Bundle bundle)
	//*  48   93:astore_2        
			{
				Log.d("MediaBrowserCompat", (new StringBuilder()).append("addSubscription failed with RemoteException parentId=").append(s).toString());
	//   49   94:ldc1            #134 <String "MediaBrowserCompat">
	//   50   96:new             #114 <Class StringBuilder>
	//   51   99:dup             
	//   52  100:invokespecial   #115 <Method void StringBuilder()>
	//   53  103:ldc2            #466 <String "addSubscription failed with RemoteException parentId=">
	//   54  106:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   55  109:aload_1         
	//   56  110:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   57  113:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   58  116:invokestatic    #213 <Method int Log.d(String, String)>
	//   59  119:pop             
			}
	//   60  120:return          
	}

	public void unsubscribe(String s, MediaBrowserCompat$SubscriptionCallback mediabrowsercompat$subscriptioncallback)
	{
		MediaBrowserCompat.Subscription subscription;
		subscription = (MediaBrowserCompat.Subscription)mSubscriptions.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field ArrayMap mSubscriptions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #345 <Method Object ArrayMap.get(Object)>
	//    4    8:checkcast       #347 <Class MediaBrowserCompat$Subscription>
	//    5   11:astore          4
		if(subscription == null)
	//*   6   13:aload           4
	//*   7   15:ifnonnull       19
			return;
	//    8   18:return          
		if(mediabrowsercompat$subscriptioncallback == null)
	//*   9   19:aload_2         
	//*  10   20:ifnonnull       47
		{
			int i;
			List list;
			List list1;
			try
			{
				if(mState == 2)
	//*  11   23:aload_0         
	//*  12   24:getfield        #81  <Field int mState>
	//*  13   27:iconst_2        
	//*  14   28:icmpne          136
					mServiceBinderWrapper.removeSubscription(s, ((IBinder) (null)), mCallbacksMessenger);
	//   15   31:aload_0         
	//   16   32:getfield        #174 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   17   35:aload_1         
	//   18   36:aconst_null     
	//   19   37:aload_0         
	//   20   38:getfield        #132 <Field Messenger mCallbacksMessenger>
	//   21   41:invokevirtual   #472 <Method void MediaBrowserCompat$ServiceBinderWrapper.removeSubscription(String, IBinder, Messenger)>
			}
	//*  22   44:goto            136
	//*  23   47:aload           4
	//*  24   49:invokevirtual   #410 <Method List MediaBrowserCompat$Subscription.getCallbacks()>
	//*  25   52:astore          5
	//*  26   54:aload           4
	//*  27   56:invokevirtual   #413 <Method List MediaBrowserCompat$Subscription.getOptionsList()>
	//*  28   59:astore          6
	//*  29   61:aload           5
	//*  30   63:invokeinterface #419 <Method int List.size()>
	//*  31   68:iconst_1        
	//*  32   69:isub            
	//*  33   70:istore_3        
	//*  34   71:iload_3         
	//*  35   72:iflt            136
	//*  36   75:aload           5
	//*  37   77:iload_3         
	//*  38   78:invokeinterface #422 <Method Object List.get(int)>
	//*  39   83:aload_2         
	//*  40   84:if_acmpne       129
	//*  41   87:aload_0         
	//*  42   88:getfield        #81  <Field int mState>
	//*  43   91:iconst_2        
	//*  44   92:icmpne          111
	//*  45   95:aload_0         
	//*  46   96:getfield        #174 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//*  47   99:aload_1         
	//*  48  100:aload_2         
	//*  49  101:invokestatic    #426 <Method IBinder MediaBrowserCompat$SubscriptionCallback.access$000(MediaBrowserCompat$SubscriptionCallback)>
	//*  50  104:aload_0         
	//*  51  105:getfield        #132 <Field Messenger mCallbacksMessenger>
	//*  52  108:invokevirtual   #472 <Method void MediaBrowserCompat$ServiceBinderWrapper.removeSubscription(String, IBinder, Messenger)>
	//*  53  111:aload           5
	//*  54  113:iload_3         
	//*  55  114:invokeinterface #475 <Method Object List.remove(int)>
	//*  56  119:pop             
	//*  57  120:aload           6
	//*  58  122:iload_3         
	//*  59  123:invokeinterface #475 <Method Object List.remove(int)>
	//*  60  128:pop             
	//*  61  129:iload_3         
	//*  62  130:iconst_1        
	//*  63  131:isub            
	//*  64  132:istore_3        
	//*  65  133:goto            71
	//*  66  136:goto            167
			catch(RemoteException remoteexception)
	//*  67  139:astore          5
			{
				Log.d("MediaBrowserCompat", (new StringBuilder()).append("removeSubscription failed with RemoteException parentId=").append(s).toString());
	//   68  141:ldc1            #134 <String "MediaBrowserCompat">
	//   69  143:new             #114 <Class StringBuilder>
	//   70  146:dup             
	//   71  147:invokespecial   #115 <Method void StringBuilder()>
	//   72  150:ldc2            #477 <String "removeSubscription failed with RemoteException parentId=">
	//   73  153:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   74  156:aload_1         
	//   75  157:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   76  160:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   77  163:invokestatic    #213 <Method int Log.d(String, String)>
	//   78  166:pop             
			}
			break MISSING_BLOCK_LABEL_167;
		}
		list = subscription.getCallbacks();
		list1 = subscription.getOptionsList();
		i = list.size() - 1;
_L3:
		if(i < 0) goto _L2; else goto _L1
_L1:
		if(list.get(i) != mediabrowsercompat$subscriptioncallback)
			continue; /* Loop/switch isn't completed */
		if(mState == 2)
			mServiceBinderWrapper.removeSubscription(s, MediaBrowserCompat$SubscriptionCallback.access$000(mediabrowsercompat$subscriptioncallback), mCallbacksMessenger);
		list.remove(i);
		list1.remove(i);
		i--;
		  goto _L3
_L2:
		if(subscription.isEmpty() || mediabrowsercompat$subscriptioncallback == null)
	//*  79  167:aload           4
	//*  80  169:invokevirtual   #479 <Method boolean MediaBrowserCompat$Subscription.isEmpty()>
	//*  81  172:ifne            179
	//*  82  175:aload_2         
	//*  83  176:ifnonnull       188
			mSubscriptions.remove(((Object) (s)));
	//   84  179:aload_0         
	//   85  180:getfield        #79  <Field ArrayMap mSubscriptions>
	//   86  183:aload_1         
	//   87  184:invokevirtual   #481 <Method Object ArrayMap.remove(Object)>
	//   88  187:pop             
		return;
	//   89  188:return          
	}

	private static final int CONNECT_STATE_CONNECTED = 2;
	static final int CONNECT_STATE_CONNECTING = 1;
	static final int CONNECT_STATE_DISCONNECTED = 0;
	static final int CONNECT_STATE_SUSPENDED = 3;
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
	//    1    1:invokespecial   #67  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #69  <Class MediaBrowserCompat$CallbackHandler>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #72  <Method void MediaBrowserCompat$CallbackHandler(MediaBrowserCompat$MediaBrowserServiceCallbackImpl)>
	//    7   13:putfield        #74  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//    8   16:aload_0         
	//    9   17:new             #76  <Class ArrayMap>
	//   10   20:dup             
	//   11   21:invokespecial   #77  <Method void ArrayMap()>
	//   12   24:putfield        #79  <Field ArrayMap mSubscriptions>
		mState = 0;
	//   13   27:aload_0         
	//   14   28:iconst_0        
	//   15   29:putfield        #81  <Field int mState>
		if(context == null)
	//*  16   32:aload_1         
	//*  17   33:ifnonnull       46
			throw new IllegalArgumentException("context must not be null");
	//   18   36:new             #83  <Class IllegalArgumentException>
	//   19   39:dup             
	//   20   40:ldc1            #85  <String "context must not be null">
	//   21   42:invokespecial   #88  <Method void IllegalArgumentException(String)>
	//   22   45:athrow          
		if(componentname == null)
	//*  23   46:aload_2         
	//*  24   47:ifnonnull       60
			throw new IllegalArgumentException("service component must not be null");
	//   25   50:new             #83  <Class IllegalArgumentException>
	//   26   53:dup             
	//   27   54:ldc1            #90  <String "service component must not be null">
	//   28   56:invokespecial   #88  <Method void IllegalArgumentException(String)>
	//   29   59:athrow          
		if(connectioncallback == null)
	//*  30   60:aload_3         
	//*  31   61:ifnonnull       74
			throw new IllegalArgumentException("connection callback must not be null");
	//   32   64:new             #83  <Class IllegalArgumentException>
	//   33   67:dup             
	//   34   68:ldc1            #92  <String "connection callback must not be null">
	//   35   70:invokespecial   #88  <Method void IllegalArgumentException(String)>
	//   36   73:athrow          
		mContext = context;
	//   37   74:aload_0         
	//   38   75:aload_1         
	//   39   76:putfield        #94  <Field Context mContext>
		mServiceComponent = componentname;
	//   40   79:aload_0         
	//   41   80:aload_2         
	//   42   81:putfield        #96  <Field ComponentName mServiceComponent>
		mCallback = connectioncallback;
	//   43   84:aload_0         
	//   44   85:aload_3         
	//   45   86:putfield        #98  <Field MediaBrowserCompat$ConnectionCallback mCallback>
		if(bundle == null)
	//*  46   89:aload           4
	//*  47   91:ifnonnull       99
			context = null;
	//   48   94:aconst_null     
	//   49   95:astore_1        
		else
	//*  50   96:goto            109
			context = ((Context) (new Bundle(bundle)));
	//   51   99:new             #100 <Class Bundle>
	//   52  102:dup             
	//   53  103:aload           4
	//   54  105:invokespecial   #103 <Method void Bundle(Bundle)>
	//   55  108:astore_1        
		mRootHints = ((Bundle) (context));
	//   56  109:aload_0         
	//   57  110:aload_1         
	//   58  111:putfield        #105 <Field Bundle mRootHints>
	//   59  114:return          
	}
}
