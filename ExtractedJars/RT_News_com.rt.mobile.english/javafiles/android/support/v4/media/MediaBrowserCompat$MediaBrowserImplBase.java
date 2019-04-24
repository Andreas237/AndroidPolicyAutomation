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
			if(mServiceConnection == this && mState != 0 && mState != 1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		//*   2    4:getfield        #64  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
		//*   3    7:aload_0         
		//*   4    8:if_acmpne       37
		//*   5   11:aload_0         
		//*   6   12:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		//*   7   15:getfield        #68  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
		//*   8   18:ifeq            37
		//*   9   21:aload_0         
		//*  10   22:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		//*  11   25:getfield        #68  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
		//*  12   28:iconst_1        
		//*  13   29:icmpne          35
		//*  14   32:goto            37
				return true;
		//   15   35:iconst_1        
		//   16   36:ireturn         
			if(mState != 0 && mState != 1)
		//*  17   37:aload_0         
		//*  18   38:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		//*  19   41:getfield        #68  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
		//*  20   44:ifeq            133
		//*  21   47:aload_0         
		//*  22   48:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		//*  23   51:getfield        #68  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
		//*  24   54:iconst_1        
		//*  25   55:icmpeq          133
			{
				StringBuilder stringbuilder = new StringBuilder();
		//   26   58:new             #70  <Class StringBuilder>
		//   27   61:dup             
		//   28   62:invokespecial   #71  <Method void StringBuilder()>
		//   29   65:astore_2        
				stringbuilder.append(s);
		//   30   66:aload_2         
		//   31   67:aload_1         
		//   32   68:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//   33   71:pop             
				stringbuilder.append(" for ");
		//   34   72:aload_2         
		//   35   73:ldc1            #77  <String " for ">
		//   36   75:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//   37   78:pop             
				stringbuilder.append(((Object) (mServiceComponent)));
		//   38   79:aload_2         
		//   39   80:aload_0         
		//   40   81:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		//   41   84:getfield        #81  <Field ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
		//   42   87:invokevirtual   #84  <Method StringBuilder StringBuilder.append(Object)>
		//   43   90:pop             
				stringbuilder.append(" with mServiceConnection=");
		//   44   91:aload_2         
		//   45   92:ldc1            #86  <String " with mServiceConnection=">
		//   46   94:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//   47   97:pop             
				stringbuilder.append(((Object) (mServiceConnection)));
		//   48   98:aload_2         
		//   49   99:aload_0         
		//   50  100:getfield        #22  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
		//   51  103:getfield        #64  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
		//   52  106:invokevirtual   #84  <Method StringBuilder StringBuilder.append(Object)>
		//   53  109:pop             
				stringbuilder.append(" this=");
		//   54  110:aload_2         
		//   55  111:ldc1            #88  <String " this=">
		//   56  113:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//   57  116:pop             
				stringbuilder.append(((Object) (this)));
		//   58  117:aload_2         
		//   59  118:aload_0         
		//   60  119:invokevirtual   #84  <Method StringBuilder StringBuilder.append(Object)>
		//   61  122:pop             
				Log.i("MediaBrowserCompat", stringbuilder.toString());
		//   62  123:ldc1            #90  <String "MediaBrowserCompat">
		//   63  125:aload_2         
		//   64  126:invokevirtual   #94  <Method String StringBuilder.toString()>
		//   65  129:invokestatic    #100 <Method int Log.i(String, String)>
		//   66  132:pop             
			}
			return false;
		//   67  133:iconst_0        
		//   68  134:ireturn         
		}

		public void onServiceConnected(final ComponentName name, IBinder ibinder)
		{
			postOrRun(((_cls1) (ibinder)). new Runnable() {

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
						stringbuilder.append(((Object) (name)));
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
						stringbuilder.append(((Object) (binder)));
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
					mServiceBinderWrapper = new MediaBrowserCompat.ServiceBinderWrapper(binder, mRootHints);
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
				//   49  101:getfield        #86  <Field Bundle MediaBrowserCompat$MediaBrowserImplBase.mRootHints>
				//   50  104:invokespecial   #89  <Method void MediaBrowserCompat$ServiceBinderWrapper(IBinder, Bundle)>
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
				//   94  212:getfield        #122 <Field Context MediaBrowserCompat$MediaBrowserImplBase.mContext>
				//   95  215:aload_0         
				//   96  216:getfield        #27  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   97  219:getfield        #72  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   98  222:getfield        #106 <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
				//   99  225:invokevirtual   #126 <Method void MediaBrowserCompat$ServiceBinderWrapper.connect(Context, Messenger)>
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
				//*   1    3:ifeq            85
					{
						StringBuilder stringbuilder = new StringBuilder();
				//    2    6:new             #38  <Class StringBuilder>
				//    3    9:dup             
				//    4   10:invokespecial   #39  <Method void StringBuilder()>
				//    5   13:astore_1        
						stringbuilder.append("MediaServiceConnection.onServiceDisconnected name=");
				//    6   14:aload_1         
				//    7   15:ldc1            #41  <String "MediaServiceConnection.onServiceDisconnected name=">
				//    8   17:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
				//    9   20:pop             
						stringbuilder.append(((Object) (name)));
				//   10   21:aload_1         
				//   11   22:aload_0         
				//   12   23:getfield        #27  <Field ComponentName val$name>
				//   13   26:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
				//   14   29:pop             
						stringbuilder.append(" this=");
				//   15   30:aload_1         
				//   16   31:ldc1            #50  <String " this=">
				//   17   33:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
				//   18   36:pop             
						stringbuilder.append(((Object) (this)));
				//   19   37:aload_1         
				//   20   38:aload_0         
				//   21   39:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
				//   22   42:pop             
						stringbuilder.append(" mServiceConnection=");
				//   23   43:aload_1         
				//   24   44:ldc1            #52  <String " mServiceConnection=">
				//   25   46:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
				//   26   49:pop             
						stringbuilder.append(((Object) (mServiceConnection)));
				//   27   50:aload_1         
				//   28   51:aload_0         
				//   29   52:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   30   55:getfield        #56  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   31   58:getfield        #59  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
				//   32   61:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
				//   33   64:pop             
						Log.d("MediaBrowserCompat", stringbuilder.toString());
				//   34   65:ldc1            #61  <String "MediaBrowserCompat">
				//   35   67:aload_1         
				//   36   68:invokevirtual   #65  <Method String StringBuilder.toString()>
				//   37   71:invokestatic    #71  <Method int Log.d(String, String)>
				//   38   74:pop             
						dump();
				//   39   75:aload_0         
				//   40   76:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   41   79:getfield        #56  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   42   82:invokevirtual   #74  <Method void MediaBrowserCompat$MediaBrowserImplBase.dump()>
					}
					if(!isCurrent("onServiceDisconnected"))
				//*  43   85:aload_0         
				//*  44   86:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//*  45   89:ldc1            #75  <String "onServiceDisconnected">
				//*  46   91:invokevirtual   #79  <Method boolean MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.isCurrent(String)>
				//*  47   94:ifne            98
					{
						return;
				//   48   97:return          
					} else
					{
						mServiceBinderWrapper = null;
				//   49   98:aload_0         
				//   50   99:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   51  102:getfield        #56  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   52  105:aconst_null     
				//   53  106:putfield        #83  <Field MediaBrowserCompat$ServiceBinderWrapper MediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper>
						mCallbacksMessenger = null;
				//   54  109:aload_0         
				//   55  110:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   56  113:getfield        #56  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   57  116:aconst_null     
				//   58  117:putfield        #87  <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
						mHandler.setCallbacksMessenger(((Messenger) (null)));
				//   59  120:aload_0         
				//   60  121:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   61  124:getfield        #56  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   62  127:getfield        #91  <Field MediaBrowserCompat$CallbackHandler MediaBrowserCompat$MediaBrowserImplBase.mHandler>
				//   63  130:aconst_null     
				//   64  131:invokevirtual   #97  <Method void MediaBrowserCompat$CallbackHandler.setCallbacksMessenger(Messenger)>
						mState = 4;
				//   65  134:aload_0         
				//   66  135:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   67  138:getfield        #56  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   68  141:iconst_4        
				//   69  142:putfield        #101 <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
						mCallback.onConnectionSuspended();
				//   70  145:aload_0         
				//   71  146:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
				//   72  149:getfield        #56  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
				//   73  152:getfield        #105 <Field MediaBrowserCompat$ConnectionCallback MediaBrowserCompat$MediaBrowserImplBase.mCallback>
				//   74  155:invokevirtual   #110 <Method void MediaBrowserCompat$ConnectionCallback.onConnectionSuspended()>
						return;
				//   75  158:return          
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
	//	               0 74
	//	               1 71
	//	               2 68
	//	               3 65
	//	               4 62
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    2   36:new             #114 <Class StringBuilder>
	//    3   39:dup             
	//    4   40:invokespecial   #115 <Method void StringBuilder()>
	//    5   43:astore_1        
			stringbuilder.append("UNKNOWN/");
	//    6   44:aload_1         
	//    7   45:ldc1            #117 <String "UNKNOWN/">
	//    8   47:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//    9   50:pop             
			stringbuilder.append(i);
	//   10   51:aload_1         
	//   11   52:iload_0         
	//   12   53:invokevirtual   #124 <Method StringBuilder StringBuilder.append(int)>
	//   13   56:pop             
			return stringbuilder.toString();
	//   14   57:aload_1         
	//   15   58:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   16   61:areturn         

		case 4: // '\004'
			return "CONNECT_STATE_SUSPENDED";
	//   17   62:ldc1            #129 <String "CONNECT_STATE_SUSPENDED">
	//   18   64:areturn         

		case 3: // '\003'
			return "CONNECT_STATE_CONNECTED";
	//   19   65:ldc1            #130 <String "CONNECT_STATE_CONNECTED">
	//   20   67:areturn         

		case 2: // '\002'
			return "CONNECT_STATE_CONNECTING";
	//   21   68:ldc1            #131 <String "CONNECT_STATE_CONNECTING">
	//   22   70:areturn         

		case 1: // '\001'
			return "CONNECT_STATE_DISCONNECTED";
	//   23   71:ldc1            #132 <String "CONNECT_STATE_DISCONNECTED">
	//   24   73:areturn         

		case 0: // '\0'
			return "CONNECT_STATE_DISCONNECTING";
	//   25   74:ldc1            #133 <String "CONNECT_STATE_DISCONNECTING">
	//   26   76:areturn         
		}
	}

	private boolean isCurrent(Messenger messenger, String s)
	{
		if(mCallbacksMessenger == messenger && mState != 0 && mState != 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field Messenger mCallbacksMessenger>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       28
	//*   4    8:aload_0         
	//*   5    9:getfield        #85  <Field int mState>
	//*   6   12:ifeq            28
	//*   7   15:aload_0         
	//*   8   16:getfield        #85  <Field int mState>
	//*   9   19:iconst_1        
	//*  10   20:icmpne          26
	//*  11   23:goto            28
			return true;
	//   12   26:iconst_1        
	//   13   27:ireturn         
		if(mState != 0 && mState != 1)
	//*  14   28:aload_0         
	//*  15   29:getfield        #85  <Field int mState>
	//*  16   32:ifeq            112
	//*  17   35:aload_0         
	//*  18   36:getfield        #85  <Field int mState>
	//*  19   39:iconst_1        
	//*  20   40:icmpeq          112
		{
			messenger = ((Messenger) (new StringBuilder()));
	//   21   43:new             #114 <Class StringBuilder>
	//   22   46:dup             
	//   23   47:invokespecial   #115 <Method void StringBuilder()>
	//   24   50:astore_1        
			((StringBuilder) (messenger)).append(s);
	//   25   51:aload_1         
	//   26   52:aload_2         
	//   27   53:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   28   56:pop             
			((StringBuilder) (messenger)).append(" for ");
	//   29   57:aload_1         
	//   30   58:ldc1            #139 <String " for ">
	//   31   60:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   32   63:pop             
			((StringBuilder) (messenger)).append(((Object) (mServiceComponent)));
	//   33   64:aload_1         
	//   34   65:aload_0         
	//   35   66:getfield        #100 <Field ComponentName mServiceComponent>
	//   36   69:invokevirtual   #142 <Method StringBuilder StringBuilder.append(Object)>
	//   37   72:pop             
			((StringBuilder) (messenger)).append(" with mCallbacksMessenger=");
	//   38   73:aload_1         
	//   39   74:ldc1            #144 <String " with mCallbacksMessenger=">
	//   40   76:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   41   79:pop             
			((StringBuilder) (messenger)).append(((Object) (mCallbacksMessenger)));
	//   42   80:aload_1         
	//   43   81:aload_0         
	//   44   82:getfield        #137 <Field Messenger mCallbacksMessenger>
	//   45   85:invokevirtual   #142 <Method StringBuilder StringBuilder.append(Object)>
	//   46   88:pop             
			((StringBuilder) (messenger)).append(" this=");
	//   47   89:aload_1         
	//   48   90:ldc1            #146 <String " this=">
	//   49   92:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   50   95:pop             
			((StringBuilder) (messenger)).append(((Object) (this)));
	//   51   96:aload_1         
	//   52   97:aload_0         
	//   53   98:invokevirtual   #142 <Method StringBuilder StringBuilder.append(Object)>
	//   54  101:pop             
			Log.i("MediaBrowserCompat", ((StringBuilder) (messenger)).toString());
	//   55  102:ldc1            #148 <String "MediaBrowserCompat">
	//   56  104:aload_1         
	//   57  105:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   58  108:invokestatic    #154 <Method int Log.i(String, String)>
	//   59  111:pop             
		}
		return false;
	//   60  112:iconst_0        
	//   61  113:ireturn         
	}

	public void connect()
	{
		if(mState != 0 && mState != 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field int mState>
	//*   2    4:ifeq            61
	//*   3    7:aload_0         
	//*   4    8:getfield        #85  <Field int mState>
	//*   5   11:iconst_1        
	//*   6   12:icmpeq          61
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    7   15:new             #114 <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #115 <Method void StringBuilder()>
	//   10   22:astore_1        
			stringbuilder.append("connect() called while neigther disconnecting nor disconnected (state=");
	//   11   23:aload_1         
	//   12   24:ldc1            #157 <String "connect() called while neigther disconnecting nor disconnected (state=">
	//   13   26:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
			stringbuilder.append(getStateLabel(mState));
	//   15   30:aload_1         
	//   16   31:aload_0         
	//   17   32:getfield        #85  <Field int mState>
	//   18   35:invokestatic    #159 <Method String getStateLabel(int)>
	//   19   38:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   20   41:pop             
			stringbuilder.append(")");
	//   21   42:aload_1         
	//   22   43:ldc1            #161 <String ")">
	//   23   45:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   24   48:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   25   49:new             #163 <Class IllegalStateException>
	//   26   52:dup             
	//   27   53:aload_1         
	//   28   54:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   29   57:invokespecial   #164 <Method void IllegalStateException(String)>
	//   30   60:athrow          
		} else
		{
			mState = 2;
	//   31   61:aload_0         
	//   32   62:iconst_2        
	//   33   63:putfield        #85  <Field int mState>
			mHandler.post(new Runnable() {

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
						StringBuilder stringbuilder1 = new StringBuilder();
				//   15   35:new             #40  <Class StringBuilder>
				//   16   38:dup             
				//   17   39:invokespecial   #41  <Method void StringBuilder()>
				//   18   42:astore_2        
						stringbuilder1.append("mServiceConnection should be null. Instead it is ");
				//   19   43:aload_2         
				//   20   44:ldc1            #43  <String "mServiceConnection should be null. Instead it is ">
				//   21   46:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
				//   22   49:pop             
						stringbuilder1.append(((Object) (mServiceConnection)));
				//   23   50:aload_2         
				//   24   51:aload_0         
				//   25   52:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				//   26   55:getfield        #38  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
				//   27   58:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
				//   28   61:pop             
						throw new RuntimeException(stringbuilder1.toString());
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
						StringBuilder stringbuilder2 = new StringBuilder();
				//   39   84:new             #40  <Class StringBuilder>
				//   40   87:dup             
				//   41   88:invokespecial   #41  <Method void StringBuilder()>
				//   42   91:astore_2        
						stringbuilder2.append("mServiceBinderWrapper should be null. Instead it is ");
				//   43   92:aload_2         
				//   44   93:ldc1            #65  <String "mServiceBinderWrapper should be null. Instead it is ">
				//   45   95:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
				//   46   98:pop             
						stringbuilder2.append(((Object) (mServiceBinderWrapper)));
				//   47   99:aload_2         
				//   48  100:aload_0         
				//   49  101:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				//   50  104:getfield        #63  <Field MediaBrowserCompat$ServiceBinderWrapper MediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper>
				//   51  107:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
				//   52  110:pop             
						throw new RuntimeException(stringbuilder2.toString());
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
				//*  61  127:getfield        #69  <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
				//*  62  130:ifnull          172
					{
						StringBuilder stringbuilder3 = new StringBuilder();
				//   63  133:new             #40  <Class StringBuilder>
				//   64  136:dup             
				//   65  137:invokespecial   #41  <Method void StringBuilder()>
				//   66  140:astore_2        
						stringbuilder3.append("mCallbacksMessenger should be null. Instead it is ");
				//   67  141:aload_2         
				//   68  142:ldc1            #71  <String "mCallbacksMessenger should be null. Instead it is ">
				//   69  144:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
				//   70  147:pop             
						stringbuilder3.append(((Object) (mCallbacksMessenger)));
				//   71  148:aload_2         
				//   72  149:aload_0         
				//   73  150:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				//   74  153:getfield        #69  <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
				//   75  156:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
				//   76  159:pop             
						throw new RuntimeException(stringbuilder3.toString());
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
				//   91  187:getfield        #80  <Field ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
				//   92  190:invokevirtual   #84  <Method Intent Intent.setComponent(ComponentName)>
				//   93  193:pop             
					mServiceConnection = new MediaServiceConnection();
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
						flag = mContext.bindService(((Intent) (obj)), ((ServiceConnection) (mServiceConnection)), 1);
				//  102  212:aload_0         
				//  103  213:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				//  104  216:getfield        #92  <Field Context MediaBrowserCompat$MediaBrowserImplBase.mContext>
				//  105  219:aload_2         
				//  106  220:aload_0         
				//  107  221:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				//  108  224:getfield        #38  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
				//  109  227:iconst_1        
				//  110  228:invokevirtual   #98  <Method boolean Context.bindService(Intent, ServiceConnection, int)>
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
				//* 124  255:getfield        #80  <Field ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
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
	//   34   66:aload_0         
	//   35   67:getfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   36   70:new             #13  <Class MediaBrowserCompat$MediaBrowserImplBase$1>
	//   37   73:dup             
	//   38   74:aload_0         
	//   39   75:invokespecial   #167 <Method void MediaBrowserCompat$MediaBrowserImplBase$1(MediaBrowserCompat$MediaBrowserImplBase)>
	//   40   78:invokevirtual   #171 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   41   81:pop             
			return;
	//   42   82:return          
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
				RemoteException remoteexception;
				StringBuilder stringbuilder;
				if(mCallbacksMessenger != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
			//*   2    4:getfield        #30  <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
			//*   3    7:ifnull          67
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
			//*  11   27:goto            67
			//*  12   30:new             #41  <Class StringBuilder>
			//*  13   33:dup             
			//*  14   34:invokespecial   #42  <Method void StringBuilder()>
			//*  15   37:astore_2        
			//*  16   38:aload_2         
			//*  17   39:ldc1            #44  <String "RemoteException during connect for ">
			//*  18   41:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
			//*  19   44:pop             
			//*  20   45:aload_2         
			//*  21   46:aload_0         
			//*  22   47:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
			//*  23   50:getfield        #52  <Field ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
			//*  24   53:invokevirtual   #55  <Method StringBuilder StringBuilder.append(Object)>
			//*  25   56:pop             
			//*  26   57:ldc1            #57  <String "MediaBrowserCompat">
			//*  27   59:aload_2         
			//*  28   60:invokevirtual   #61  <Method String StringBuilder.toString()>
			//*  29   63:invokestatic    #67  <Method int Log.w(String, String)>
			//*  30   66:pop             
			//*  31   67:aload_0         
			//*  32   68:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
			//*  33   71:getfield        #71  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
			//*  34   74:istore_1        
			//*  35   75:aload_0         
			//*  36   76:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
			//*  37   79:invokevirtual   #74  <Method void MediaBrowserCompat$MediaBrowserImplBase.forceCloseConnection()>
			//*  38   82:iload_1         
			//*  39   83:ifeq            94
			//*  40   86:aload_0         
			//*  41   87:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
			//*  42   90:iload_1         
			//*  43   91:putfield        #71  <Field int MediaBrowserCompat$MediaBrowserImplBase.mState>
			//*  44   94:getstatic       #78  <Field boolean MediaBrowserCompat.DEBUG>
			//*  45   97:ifeq            115
			//*  46  100:ldc1            #57  <String "MediaBrowserCompat">
			//*  47  102:ldc1            #80  <String "disconnect...">
			//*  48  104:invokestatic    #83  <Method int Log.d(String, String)>
			//*  49  107:pop             
			//*  50  108:aload_0         
			//*  51  109:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
			//*  52  112:invokevirtual   #86  <Method void MediaBrowserCompat$MediaBrowserImplBase.dump()>
			//*  53  115:return          
					// Misplaced declaration of an exception variable
					catch(RemoteException remoteexception)
					{
						stringbuilder = new StringBuilder();
						stringbuilder.append("RemoteException during connect for ");
						stringbuilder.append(((Object) (mServiceComponent)));
						Log.w("MediaBrowserCompat", stringbuilder.toString());
					}
				int i = mState;
				forceCloseConnection();
				if(i != 0)
					mState = i;
				if(MediaBrowserCompat.DEBUG)
				{
					Log.d("MediaBrowserCompat", "disconnect...");
					dump();
				}
			//*  54  116:astore_2        
			//*  55  117:goto            30
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
	//    0    0:ldc1            #148 <String "MediaBrowserCompat">
	//    1    2:ldc1            #176 <String "MediaBrowserCompat...">
	//    2    4:invokestatic    #179 <Method int Log.d(String, String)>
	//    3    7:pop             
		StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #114 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #115 <Method void StringBuilder()>
	//    7   15:astore_1        
		stringbuilder.append("  mServiceComponent=");
	//    8   16:aload_1         
	//    9   17:ldc1            #181 <String "  mServiceComponent=">
	//   10   19:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		stringbuilder.append(((Object) (mServiceComponent)));
	//   12   23:aload_1         
	//   13   24:aload_0         
	//   14   25:getfield        #100 <Field ComponentName mServiceComponent>
	//   15   28:invokevirtual   #142 <Method StringBuilder StringBuilder.append(Object)>
	//   16   31:pop             
		Log.d("MediaBrowserCompat", stringbuilder.toString());
	//   17   32:ldc1            #148 <String "MediaBrowserCompat">
	//   18   34:aload_1         
	//   19   35:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   20   38:invokestatic    #179 <Method int Log.d(String, String)>
	//   21   41:pop             
		stringbuilder = new StringBuilder();
	//   22   42:new             #114 <Class StringBuilder>
	//   23   45:dup             
	//   24   46:invokespecial   #115 <Method void StringBuilder()>
	//   25   49:astore_1        
		stringbuilder.append("  mCallback=");
	//   26   50:aload_1         
	//   27   51:ldc1            #183 <String "  mCallback=">
	//   28   53:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   29   56:pop             
		stringbuilder.append(((Object) (mCallback)));
	//   30   57:aload_1         
	//   31   58:aload_0         
	//   32   59:getfield        #102 <Field MediaBrowserCompat$ConnectionCallback mCallback>
	//   33   62:invokevirtual   #142 <Method StringBuilder StringBuilder.append(Object)>
	//   34   65:pop             
		Log.d("MediaBrowserCompat", stringbuilder.toString());
	//   35   66:ldc1            #148 <String "MediaBrowserCompat">
	//   36   68:aload_1         
	//   37   69:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   38   72:invokestatic    #179 <Method int Log.d(String, String)>
	//   39   75:pop             
		stringbuilder = new StringBuilder();
	//   40   76:new             #114 <Class StringBuilder>
	//   41   79:dup             
	//   42   80:invokespecial   #115 <Method void StringBuilder()>
	//   43   83:astore_1        
		stringbuilder.append("  mRootHints=");
	//   44   84:aload_1         
	//   45   85:ldc1            #185 <String "  mRootHints=">
	//   46   87:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   47   90:pop             
		stringbuilder.append(((Object) (mRootHints)));
	//   48   91:aload_1         
	//   49   92:aload_0         
	//   50   93:getfield        #109 <Field Bundle mRootHints>
	//   51   96:invokevirtual   #142 <Method StringBuilder StringBuilder.append(Object)>
	//   52   99:pop             
		Log.d("MediaBrowserCompat", stringbuilder.toString());
	//   53  100:ldc1            #148 <String "MediaBrowserCompat">
	//   54  102:aload_1         
	//   55  103:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   56  106:invokestatic    #179 <Method int Log.d(String, String)>
	//   57  109:pop             
		stringbuilder = new StringBuilder();
	//   58  110:new             #114 <Class StringBuilder>
	//   59  113:dup             
	//   60  114:invokespecial   #115 <Method void StringBuilder()>
	//   61  117:astore_1        
		stringbuilder.append("  mState=");
	//   62  118:aload_1         
	//   63  119:ldc1            #187 <String "  mState=">
	//   64  121:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   65  124:pop             
		stringbuilder.append(getStateLabel(mState));
	//   66  125:aload_1         
	//   67  126:aload_0         
	//   68  127:getfield        #85  <Field int mState>
	//   69  130:invokestatic    #159 <Method String getStateLabel(int)>
	//   70  133:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   71  136:pop             
		Log.d("MediaBrowserCompat", stringbuilder.toString());
	//   72  137:ldc1            #148 <String "MediaBrowserCompat">
	//   73  139:aload_1         
	//   74  140:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   75  143:invokestatic    #179 <Method int Log.d(String, String)>
	//   76  146:pop             
		stringbuilder = new StringBuilder();
	//   77  147:new             #114 <Class StringBuilder>
	//   78  150:dup             
	//   79  151:invokespecial   #115 <Method void StringBuilder()>
	//   80  154:astore_1        
		stringbuilder.append("  mServiceConnection=");
	//   81  155:aload_1         
	//   82  156:ldc1            #189 <String "  mServiceConnection=">
	//   83  158:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   84  161:pop             
		stringbuilder.append(((Object) (mServiceConnection)));
	//   85  162:aload_1         
	//   86  163:aload_0         
	//   87  164:getfield        #191 <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mServiceConnection>
	//   88  167:invokevirtual   #142 <Method StringBuilder StringBuilder.append(Object)>
	//   89  170:pop             
		Log.d("MediaBrowserCompat", stringbuilder.toString());
	//   90  171:ldc1            #148 <String "MediaBrowserCompat">
	//   91  173:aload_1         
	//   92  174:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   93  177:invokestatic    #179 <Method int Log.d(String, String)>
	//   94  180:pop             
		stringbuilder = new StringBuilder();
	//   95  181:new             #114 <Class StringBuilder>
	//   96  184:dup             
	//   97  185:invokespecial   #115 <Method void StringBuilder()>
	//   98  188:astore_1        
		stringbuilder.append("  mServiceBinderWrapper=");
	//   99  189:aload_1         
	//  100  190:ldc1            #193 <String "  mServiceBinderWrapper=">
	//  101  192:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//  102  195:pop             
		stringbuilder.append(((Object) (mServiceBinderWrapper)));
	//  103  196:aload_1         
	//  104  197:aload_0         
	//  105  198:getfield        #195 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//  106  201:invokevirtual   #142 <Method StringBuilder StringBuilder.append(Object)>
	//  107  204:pop             
		Log.d("MediaBrowserCompat", stringbuilder.toString());
	//  108  205:ldc1            #148 <String "MediaBrowserCompat">
	//  109  207:aload_1         
	//  110  208:invokevirtual   #128 <Method String StringBuilder.toString()>
	//  111  211:invokestatic    #179 <Method int Log.d(String, String)>
	//  112  214:pop             
		stringbuilder = new StringBuilder();
	//  113  215:new             #114 <Class StringBuilder>
	//  114  218:dup             
	//  115  219:invokespecial   #115 <Method void StringBuilder()>
	//  116  222:astore_1        
		stringbuilder.append("  mCallbacksMessenger=");
	//  117  223:aload_1         
	//  118  224:ldc1            #197 <String "  mCallbacksMessenger=">
	//  119  226:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//  120  229:pop             
		stringbuilder.append(((Object) (mCallbacksMessenger)));
	//  121  230:aload_1         
	//  122  231:aload_0         
	//  123  232:getfield        #137 <Field Messenger mCallbacksMessenger>
	//  124  235:invokevirtual   #142 <Method StringBuilder StringBuilder.append(Object)>
	//  125  238:pop             
		Log.d("MediaBrowserCompat", stringbuilder.toString());
	//  126  239:ldc1            #148 <String "MediaBrowserCompat">
	//  127  241:aload_1         
	//  128  242:invokevirtual   #128 <Method String StringBuilder.toString()>
	//  129  245:invokestatic    #179 <Method int Log.d(String, String)>
	//  130  248:pop             
		stringbuilder = new StringBuilder();
	//  131  249:new             #114 <Class StringBuilder>
	//  132  252:dup             
	//  133  253:invokespecial   #115 <Method void StringBuilder()>
	//  134  256:astore_1        
		stringbuilder.append("  mRootId=");
	//  135  257:aload_1         
	//  136  258:ldc1            #199 <String "  mRootId=">
	//  137  260:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//  138  263:pop             
		stringbuilder.append(mRootId);
	//  139  264:aload_1         
	//  140  265:aload_0         
	//  141  266:getfield        #201 <Field String mRootId>
	//  142  269:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//  143  272:pop             
		Log.d("MediaBrowserCompat", stringbuilder.toString());
	//  144  273:ldc1            #148 <String "MediaBrowserCompat">
	//  145  275:aload_1         
	//  146  276:invokevirtual   #128 <Method String StringBuilder.toString()>
	//  147  279:invokestatic    #179 <Method int Log.d(String, String)>
	//  148  282:pop             
		stringbuilder = new StringBuilder();
	//  149  283:new             #114 <Class StringBuilder>
	//  150  286:dup             
	//  151  287:invokespecial   #115 <Method void StringBuilder()>
	//  152  290:astore_1        
		stringbuilder.append("  mMediaSessionToken=");
	//  153  291:aload_1         
	//  154  292:ldc1            #203 <String "  mMediaSessionToken=">
	//  155  294:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//  156  297:pop             
		stringbuilder.append(((Object) (mMediaSessionToken)));
	//  157  298:aload_1         
	//  158  299:aload_0         
	//  159  300:getfield        #205 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
	//  160  303:invokevirtual   #142 <Method StringBuilder StringBuilder.append(Object)>
	//  161  306:pop             
		Log.d("MediaBrowserCompat", stringbuilder.toString());
	//  162  307:ldc1            #148 <String "MediaBrowserCompat">
	//  163  309:aload_1         
	//  164  310:invokevirtual   #128 <Method String StringBuilder.toString()>
	//  165  313:invokestatic    #179 <Method int Log.d(String, String)>
	//  166  316:pop             
	//  167  317:return          
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
	//*   2    4:ifne            53
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    7:new             #114 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #115 <Method void StringBuilder()>
	//    6   14:astore_1        
			stringbuilder.append("getExtras() called while not connected (state=");
	//    7   15:aload_1         
	//    8   16:ldc1            #225 <String "getExtras() called while not connected (state=">
	//    9   18:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
			stringbuilder.append(getStateLabel(mState));
	//   11   22:aload_1         
	//   12   23:aload_0         
	//   13   24:getfield        #85  <Field int mState>
	//   14   27:invokestatic    #159 <Method String getStateLabel(int)>
	//   15   30:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
			stringbuilder.append(")");
	//   17   34:aload_1         
	//   18   35:ldc1            #161 <String ")">
	//   19   37:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   20   40:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   21   41:new             #163 <Class IllegalStateException>
	//   22   44:dup             
	//   23   45:aload_1         
	//   24   46:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   25   49:invokespecial   #164 <Method void IllegalStateException(String)>
	//   26   52:athrow          
		} else
		{
			return mExtras;
	//   27   53:aload_0         
	//   28   54:getfield        #227 <Field Bundle mExtras>
	//   29   57:areturn         
		}
	}

	public void getItem(final String mediaId, final MediaBrowserCompat.ItemCallback cb)
	{
		RemoteException remoteexception;
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
	//   18   38:ldc1            #148 <String "MediaBrowserCompat">
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
		Object obj = ((Object) (new MediaBrowserCompat.ItemReceiver(mediaId, cb, ((android.os.Handler) (mHandler)))));
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
			mServiceBinderWrapper.getMediaItem(mediaId, ((android.support.v4.os.ResultReceiver) (obj)), mCallbacksMessenger);
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
	//*  49   93:new             #114 <Class StringBuilder>
	//*  50   96:dup             
	//*  51   97:invokespecial   #115 <Method void StringBuilder()>
	//*  52  100:astore_3        
	//*  53  101:aload_3         
	//*  54  102:ldc2            #261 <String "Remote error getting media item: ">
	//*  55  105:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//*  56  108:pop             
	//*  57  109:aload_3         
	//*  58  110:aload_1         
	//*  59  111:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//*  60  114:pop             
	//*  61  115:ldc1            #148 <String "MediaBrowserCompat">
	//*  62  117:aload_3         
	//*  63  118:invokevirtual   #128 <Method String StringBuilder.toString()>
	//*  64  121:invokestatic    #154 <Method int Log.i(String, String)>
	//*  65  124:pop             
	//*  66  125:aload_0         
	//*  67  126:getfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//*  68  129:new             #19  <Class MediaBrowserCompat$MediaBrowserImplBase$4>
	//*  69  132:dup             
	//*  70  133:aload_0         
	//*  71  134:aload_2         
	//*  72  135:aload_1         
	//*  73  136:invokespecial   #262 <Method void MediaBrowserCompat$MediaBrowserImplBase$4(MediaBrowserCompat$MediaBrowserImplBase, MediaBrowserCompat$ItemCallback, String)>
	//*  74  139:invokevirtual   #171 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//*  75  142:pop             
	//*  76  143:return          
		// Misplaced declaration of an exception variable
		catch(RemoteException remoteexception)
		{
			obj = ((Object) (new StringBuilder()));
		}
		((StringBuilder) (obj)).append("Remote error getting media item: ");
		((StringBuilder) (obj)).append(mediaId);
		Log.i("MediaBrowserCompat", ((StringBuilder) (obj)).toString());
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
	//*  77  144:astore_3        
	//*  78  145:goto            93
	}

	public String getRoot()
	{
		if(!isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #223 <Method boolean isConnected()>
	//*   2    4:ifne            54
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    7:new             #114 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #115 <Method void StringBuilder()>
	//    6   14:astore_1        
			stringbuilder.append("getRoot() called while not connected(state=");
	//    7   15:aload_1         
	//    8   16:ldc2            #266 <String "getRoot() called while not connected(state=">
	//    9   19:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:pop             
			stringbuilder.append(getStateLabel(mState));
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:getfield        #85  <Field int mState>
	//   14   28:invokestatic    #159 <Method String getStateLabel(int)>
	//   15   31:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   16   34:pop             
			stringbuilder.append(")");
	//   17   35:aload_1         
	//   18   36:ldc1            #161 <String ")">
	//   19   38:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   20   41:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   21   42:new             #163 <Class IllegalStateException>
	//   22   45:dup             
	//   23   46:aload_1         
	//   24   47:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   25   50:invokespecial   #164 <Method void IllegalStateException(String)>
	//   26   53:athrow          
		} else
		{
			return mRootId;
	//   27   54:aload_0         
	//   28   55:getfield        #201 <Field String mRootId>
	//   29   58:areturn         
		}
	}

	public ComponentName getServiceComponent()
	{
		if(!isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #223 <Method boolean isConnected()>
	//*   2    4:ifne            51
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    7:new             #114 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #115 <Method void StringBuilder()>
	//    6   14:astore_1        
			stringbuilder.append("getServiceComponent() called while not connected (state=");
	//    7   15:aload_1         
	//    8   16:ldc2            #270 <String "getServiceComponent() called while not connected (state=">
	//    9   19:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:pop             
			stringbuilder.append(mState);
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:getfield        #85  <Field int mState>
	//   14   28:invokevirtual   #124 <Method StringBuilder StringBuilder.append(int)>
	//   15   31:pop             
			stringbuilder.append(")");
	//   16   32:aload_1         
	//   17   33:ldc1            #161 <String ")">
	//   18   35:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   20   39:new             #163 <Class IllegalStateException>
	//   21   42:dup             
	//   22   43:aload_1         
	//   23   44:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   24   47:invokespecial   #164 <Method void IllegalStateException(String)>
	//   25   50:athrow          
		} else
		{
			return mServiceComponent;
	//   26   51:aload_0         
	//   27   52:getfield        #100 <Field ComponentName mServiceComponent>
	//   28   55:areturn         
		}
	}

	public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken()
	{
		if(!isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #223 <Method boolean isConnected()>
	//*   2    4:ifne            51
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    7:new             #114 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #115 <Method void StringBuilder()>
	//    6   14:astore_1        
			stringbuilder.append("getSessionToken() called while not connected(state=");
	//    7   15:aload_1         
	//    8   16:ldc2            #274 <String "getSessionToken() called while not connected(state=">
	//    9   19:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:pop             
			stringbuilder.append(mState);
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:getfield        #85  <Field int mState>
	//   14   28:invokevirtual   #124 <Method StringBuilder StringBuilder.append(int)>
	//   15   31:pop             
			stringbuilder.append(")");
	//   16   32:aload_1         
	//   17   33:ldc1            #161 <String ")">
	//   18   35:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   20   39:new             #163 <Class IllegalStateException>
	//   21   42:dup             
	//   22   43:aload_1         
	//   23   44:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   24   47:invokespecial   #164 <Method void IllegalStateException(String)>
	//   25   50:athrow          
		} else
		{
			return mMediaSessionToken;
	//   26   51:aload_0         
	//   27   52:getfield        #205 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
	//   28   55:areturn         
		}
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
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #114 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #115 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("onConnectFailed for ");
	//    4    8:aload_2         
	//    5    9:ldc2            #277 <String "onConnectFailed for ">
	//    6   12:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(((Object) (mServiceComponent)));
	//    8   16:aload_2         
	//    9   17:aload_0         
	//   10   18:getfield        #100 <Field ComponentName mServiceComponent>
	//   11   21:invokevirtual   #142 <Method StringBuilder StringBuilder.append(Object)>
	//   12   24:pop             
		Log.e("MediaBrowserCompat", stringbuilder.toString());
	//   13   25:ldc1            #148 <String "MediaBrowserCompat">
	//   14   27:aload_2         
	//   15   28:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   16   31:invokestatic    #280 <Method int Log.e(String, String)>
	//   17   34:pop             
		if(!isCurrent(messenger, "onConnectFailed"))
	//*  18   35:aload_0         
	//*  19   36:aload_1         
	//*  20   37:ldc2            #282 <String "onConnectFailed">
	//*  21   40:invokespecial   #284 <Method boolean isCurrent(Messenger, String)>
	//*  22   43:ifne            47
			return;
	//   23   46:return          
		if(mState != 2)
	//*  24   47:aload_0         
	//*  25   48:getfield        #85  <Field int mState>
	//*  26   51:iconst_2        
	//*  27   52:icmpeq          102
		{
			messenger = ((Messenger) (new StringBuilder()));
	//   28   55:new             #114 <Class StringBuilder>
	//   29   58:dup             
	//   30   59:invokespecial   #115 <Method void StringBuilder()>
	//   31   62:astore_1        
			((StringBuilder) (messenger)).append("onConnect from service while mState=");
	//   32   63:aload_1         
	//   33   64:ldc2            #286 <String "onConnect from service while mState=">
	//   34   67:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   35   70:pop             
			((StringBuilder) (messenger)).append(getStateLabel(mState));
	//   36   71:aload_1         
	//   37   72:aload_0         
	//   38   73:getfield        #85  <Field int mState>
	//   39   76:invokestatic    #159 <Method String getStateLabel(int)>
	//   40   79:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   41   82:pop             
			((StringBuilder) (messenger)).append("... ignoring");
	//   42   83:aload_1         
	//   43   84:ldc2            #288 <String "... ignoring">
	//   44   87:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   45   90:pop             
			Log.w("MediaBrowserCompat", ((StringBuilder) (messenger)).toString());
	//   46   91:ldc1            #148 <String "MediaBrowserCompat">
	//   47   93:aload_1         
	//   48   94:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   49   97:invokestatic    #291 <Method int Log.w(String, String)>
	//   50  100:pop             
			return;
	//   51  101:return          
		} else
		{
			forceCloseConnection();
	//   52  102:aload_0         
	//   53  103:invokevirtual   #293 <Method void forceCloseConnection()>
			mCallback.onConnectionFailed();
	//   54  106:aload_0         
	//   55  107:getfield        #102 <Field MediaBrowserCompat$ConnectionCallback mCallback>
	//   56  110:invokevirtual   #297 <Method void MediaBrowserCompat$ConnectionCallback.onConnectionFailed()>
			return;
	//   57  113:return          
		}
	}

	public void onLoadChildren(Messenger messenger, String s, List list, Bundle bundle)
	{
		if(!isCurrent(messenger, "onLoadChildren"))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:ldc2            #300 <String "onLoadChildren">
	//*   3    5:invokespecial   #284 <Method boolean isCurrent(Messenger, String)>
	//*   4    8:ifne            12
			return;
	//    5   11:return          
		if(MediaBrowserCompat.DEBUG)
	//*   6   12:getstatic       #304 <Field boolean MediaBrowserCompat.DEBUG>
	//*   7   15:ifeq            67
		{
			messenger = ((Messenger) (new StringBuilder()));
	//    8   18:new             #114 <Class StringBuilder>
	//    9   21:dup             
	//   10   22:invokespecial   #115 <Method void StringBuilder()>
	//   11   25:astore_1        
			((StringBuilder) (messenger)).append("onLoadChildren for ");
	//   12   26:aload_1         
	//   13   27:ldc2            #306 <String "onLoadChildren for ">
	//   14   30:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   15   33:pop             
			((StringBuilder) (messenger)).append(((Object) (mServiceComponent)));
	//   16   34:aload_1         
	//   17   35:aload_0         
	//   18   36:getfield        #100 <Field ComponentName mServiceComponent>
	//   19   39:invokevirtual   #142 <Method StringBuilder StringBuilder.append(Object)>
	//   20   42:pop             
			((StringBuilder) (messenger)).append(" id=");
	//   21   43:aload_1         
	//   22   44:ldc2            #308 <String " id=">
	//   23   47:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   24   50:pop             
			((StringBuilder) (messenger)).append(s);
	//   25   51:aload_1         
	//   26   52:aload_2         
	//   27   53:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   28   56:pop             
			Log.d("MediaBrowserCompat", ((StringBuilder) (messenger)).toString());
	//   29   57:ldc1            #148 <String "MediaBrowserCompat">
	//   30   59:aload_1         
	//   31   60:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   32   63:invokestatic    #179 <Method int Log.d(String, String)>
	//   33   66:pop             
		}
		messenger = ((Messenger) ((MediaBrowserCompat.Subscription)mSubscriptions.get(((Object) (s)))));
	//   34   67:aload_0         
	//   35   68:getfield        #83  <Field ArrayMap mSubscriptions>
	//   36   71:aload_2         
	//   37   72:invokevirtual   #312 <Method Object ArrayMap.get(Object)>
	//   38   75:checkcast       #314 <Class MediaBrowserCompat$Subscription>
	//   39   78:astore_1        
		if(messenger == null)
	//*  40   79:aload_1         
	//*  41   80:ifnonnull       122
		{
			if(MediaBrowserCompat.DEBUG)
	//*  42   83:getstatic       #304 <Field boolean MediaBrowserCompat.DEBUG>
	//*  43   86:ifeq            121
			{
				messenger = ((Messenger) (new StringBuilder()));
	//   44   89:new             #114 <Class StringBuilder>
	//   45   92:dup             
	//   46   93:invokespecial   #115 <Method void StringBuilder()>
	//   47   96:astore_1        
				((StringBuilder) (messenger)).append("onLoadChildren for id that isn't subscribed id=");
	//   48   97:aload_1         
	//   49   98:ldc2            #316 <String "onLoadChildren for id that isn't subscribed id=">
	//   50  101:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   51  104:pop             
				((StringBuilder) (messenger)).append(s);
	//   52  105:aload_1         
	//   53  106:aload_2         
	//   54  107:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   55  110:pop             
				Log.d("MediaBrowserCompat", ((StringBuilder) (messenger)).toString());
	//   56  111:ldc1            #148 <String "MediaBrowserCompat">
	//   57  113:aload_1         
	//   58  114:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   59  117:invokestatic    #179 <Method int Log.d(String, String)>
	//   60  120:pop             
			}
			return;
	//   61  121:return          
		}
		messenger = ((Messenger) (((MediaBrowserCompat.Subscription) (messenger)).getCallback(mContext, bundle)));
	//   62  122:aload_1         
	//   63  123:aload_0         
	//   64  124:getfield        #98  <Field Context mContext>
	//   65  127:aload           4
	//   66  129:invokevirtual   #320 <Method MediaBrowserCompat$SubscriptionCallback MediaBrowserCompat$Subscription.getCallback(Context, Bundle)>
	//   67  132:astore_1        
		if(messenger != null)
	//*  68  133:aload_1         
	//*  69  134:ifnull          179
		{
			if(bundle == null)
	//*  70  137:aload           4
	//*  71  139:ifnonnull       159
				if(list == null)
	//*  72  142:aload_3         
	//*  73  143:ifnonnull       152
				{
					((MediaBrowserCompat$SubscriptionCallback) (messenger)).onError(s);
	//   74  146:aload_1         
	//   75  147:aload_2         
	//   76  148:invokevirtual   #325 <Method void MediaBrowserCompat$SubscriptionCallback.onError(String)>
					return;
	//   77  151:return          
				} else
				{
					((MediaBrowserCompat$SubscriptionCallback) (messenger)).onChildrenLoaded(s, list);
	//   78  152:aload_1         
	//   79  153:aload_2         
	//   80  154:aload_3         
	//   81  155:invokevirtual   #329 <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List)>
					return;
	//   82  158:return          
				}
			if(list == null)
	//*  83  159:aload_3         
	//*  84  160:ifnonnull       171
			{
				((MediaBrowserCompat$SubscriptionCallback) (messenger)).onError(s, bundle);
	//   85  163:aload_1         
	//   86  164:aload_2         
	//   87  165:aload           4
	//   88  167:invokevirtual   #332 <Method void MediaBrowserCompat$SubscriptionCallback.onError(String, Bundle)>
				return;
	//   89  170:return          
			}
			((MediaBrowserCompat$SubscriptionCallback) (messenger)).onChildrenLoaded(s, list, bundle);
	//   90  171:aload_1         
	//   91  172:aload_2         
	//   92  173:aload_3         
	//   93  174:aload           4
	//   94  176:invokevirtual   #335 <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List, Bundle)>
		}
	//   95  179:return          
	}

	public void onServiceConnected(Messenger messenger, String s, android.support.v4.media.session.MediaSessionCompat.Token token, Bundle bundle)
	{
		if(!isCurrent(messenger, "onConnect"))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:ldc2            #339 <String "onConnect">
	//*   3    5:invokespecial   #284 <Method boolean isCurrent(Messenger, String)>
	//*   4    8:ifne            12
			return;
	//    5   11:return          
		if(mState != 2)
	//*   6   12:aload_0         
	//*   7   13:getfield        #85  <Field int mState>
	//*   8   16:iconst_2        
	//*   9   17:icmpeq          67
		{
			messenger = ((Messenger) (new StringBuilder()));
	//   10   20:new             #114 <Class StringBuilder>
	//   11   23:dup             
	//   12   24:invokespecial   #115 <Method void StringBuilder()>
	//   13   27:astore_1        
			((StringBuilder) (messenger)).append("onConnect from service while mState=");
	//   14   28:aload_1         
	//   15   29:ldc2            #286 <String "onConnect from service while mState=">
	//   16   32:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
			((StringBuilder) (messenger)).append(getStateLabel(mState));
	//   18   36:aload_1         
	//   19   37:aload_0         
	//   20   38:getfield        #85  <Field int mState>
	//   21   41:invokestatic    #159 <Method String getStateLabel(int)>
	//   22   44:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
			((StringBuilder) (messenger)).append("... ignoring");
	//   24   48:aload_1         
	//   25   49:ldc2            #288 <String "... ignoring">
	//   26   52:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   27   55:pop             
			Log.w("MediaBrowserCompat", ((StringBuilder) (messenger)).toString());
	//   28   56:ldc1            #148 <String "MediaBrowserCompat">
	//   29   58:aload_1         
	//   30   59:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   31   62:invokestatic    #291 <Method int Log.w(String, String)>
	//   32   65:pop             
			return;
	//   33   66:return          
		}
		mRootId = s;
	//   34   67:aload_0         
	//   35   68:aload_2         
	//   36   69:putfield        #201 <Field String mRootId>
		mMediaSessionToken = token;
	//   37   72:aload_0         
	//   38   73:aload_3         
	//   39   74:putfield        #205 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
		mExtras = bundle;
	//   40   77:aload_0         
	//   41   78:aload           4
	//   42   80:putfield        #227 <Field Bundle mExtras>
		mState = 3;
	//   43   83:aload_0         
	//   44   84:iconst_3        
	//   45   85:putfield        #85  <Field int mState>
		if(MediaBrowserCompat.DEBUG)
	//*  46   88:getstatic       #304 <Field boolean MediaBrowserCompat.DEBUG>
	//*  47   91:ifeq            107
		{
			Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
	//   48   94:ldc1            #148 <String "MediaBrowserCompat">
	//   49   96:ldc2            #341 <String "ServiceCallbacks.onConnect...">
	//   50   99:invokestatic    #179 <Method int Log.d(String, String)>
	//   51  102:pop             
			dump();
	//   52  103:aload_0         
	//   53  104:invokevirtual   #343 <Method void dump()>
		}
		mCallback.onConnected();
	//   54  107:aload_0         
	//   55  108:getfield        #102 <Field MediaBrowserCompat$ConnectionCallback mCallback>
	//   56  111:invokevirtual   #346 <Method void MediaBrowserCompat$ConnectionCallback.onConnected()>
		messenger = ((Messenger) (mSubscriptions.entrySet().iterator()));
	//   57  114:aload_0         
	//   58  115:getfield        #83  <Field ArrayMap mSubscriptions>
	//   59  118:invokevirtual   #350 <Method Set ArrayMap.entrySet()>
	//   60  121:invokeinterface #356 <Method Iterator Set.iterator()>
	//   61  126:astore_1        
_L4:
		if(!((Iterator) (messenger)).hasNext())
			break; /* Loop/switch isn't completed */
	//   62  127:aload_1         
	//   63  128:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//   64  133:ifeq            250
		token = ((android.support.v4.media.session.MediaSessionCompat.Token) ((java.util.Map.Entry)((Iterator) (messenger)).next()));
	//   65  136:aload_1         
	//   66  137:invokeinterface #365 <Method Object Iterator.next()>
	//   67  142:checkcast       #367 <Class java.util.Map$Entry>
	//   68  145:astore_3        
		s = (String)((java.util.Map.Entry) (token)).getKey();
	//   69  146:aload_3         
	//   70  147:invokeinterface #370 <Method Object java.util.Map$Entry.getKey()>
	//   71  152:checkcast       #372 <Class String>
	//   72  155:astore_2        
		bundle = ((Bundle) ((MediaBrowserCompat.Subscription)((java.util.Map.Entry) (token)).getValue()));
	//   73  156:aload_3         
	//   74  157:invokeinterface #375 <Method Object java.util.Map$Entry.getValue()>
	//   75  162:checkcast       #314 <Class MediaBrowserCompat$Subscription>
	//   76  165:astore          4
		token = ((android.support.v4.media.session.MediaSessionCompat.Token) (((MediaBrowserCompat.Subscription) (bundle)).getCallbacks()));
	//   77  167:aload           4
	//   78  169:invokevirtual   #379 <Method List MediaBrowserCompat$Subscription.getCallbacks()>
	//   79  172:astore_3        
		bundle = ((Bundle) (((MediaBrowserCompat.Subscription) (bundle)).getOptionsList()));
	//   80  173:aload           4
	//   81  175:invokevirtual   #382 <Method List MediaBrowserCompat$Subscription.getOptionsList()>
	//   82  178:astore          4
		int i = 0;
	//   83  180:iconst_0        
	//   84  181:istore          5
_L2:
		if(i >= ((List) (token)).size())
			break; /* Loop/switch isn't completed */
	//   85  183:iload           5
	//   86  185:aload_3         
	//   87  186:invokeinterface #388 <Method int List.size()>
	//   88  191:icmpge          127
		mServiceBinderWrapper.addSubscription(s, MediaBrowserCompat$SubscriptionCallback.access$000((MediaBrowserCompat$SubscriptionCallback)((List) (token)).get(i)), (Bundle)((List) (bundle)).get(i), mCallbacksMessenger);
	//   89  194:aload_0         
	//   90  195:getfield        #195 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   91  198:aload_2         
	//   92  199:aload_3         
	//   93  200:iload           5
	//   94  202:invokeinterface #391 <Method Object List.get(int)>
	//   95  207:checkcast       #322 <Class MediaBrowserCompat$SubscriptionCallback>
	//   96  210:invokestatic    #395 <Method IBinder MediaBrowserCompat$SubscriptionCallback.access$000(MediaBrowserCompat$SubscriptionCallback)>
	//   97  213:aload           4
	//   98  215:iload           5
	//   99  217:invokeinterface #391 <Method Object List.get(int)>
	//  100  222:checkcast       #104 <Class Bundle>
	//  101  225:aload_0         
	//  102  226:getfield        #137 <Field Messenger mCallbacksMessenger>
	//  103  229:invokevirtual   #399 <Method void MediaBrowserCompat$ServiceBinderWrapper.addSubscription(String, IBinder, Bundle, Messenger)>
		i++;
	//  104  232:iload           5
	//  105  234:iconst_1        
	//  106  235:iadd            
	//  107  236:istore          5
		if(true) goto _L2; else goto _L1
	//  108  238:goto            183
_L1:
		if(true) goto _L4; else goto _L3
_L6:
		Log.d("MediaBrowserCompat", "addSubscription failed with RemoteException.");
	//  109  241:ldc1            #148 <String "MediaBrowserCompat">
	//  110  243:ldc2            #401 <String "addSubscription failed with RemoteException.">
	//  111  246:invokestatic    #179 <Method int Log.d(String, String)>
	//  112  249:pop             
_L3:
		return;
	//  113  250:return          
		messenger;
	//  114  251:astore_1        
		if(true) goto _L6; else goto _L5
_L5:
	//* 115  252:goto            241
	}

	public void search(final String query, final Bundle extras, final MediaBrowserCompat.SearchCallback callback)
	{
		if(!isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #223 <Method boolean isConnected()>
	//*   2    4:ifne            54
		{
			query = ((String) (new StringBuilder()));
	//    3    7:new             #114 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #115 <Method void StringBuilder()>
	//    6   14:astore_1        
			((StringBuilder) (query)).append("search() called while not connected (state=");
	//    7   15:aload_1         
	//    8   16:ldc2            #405 <String "search() called while not connected (state=">
	//    9   19:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:pop             
			((StringBuilder) (query)).append(getStateLabel(mState));
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:getfield        #85  <Field int mState>
	//   14   28:invokestatic    #159 <Method String getStateLabel(int)>
	//   15   31:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   16   34:pop             
			((StringBuilder) (query)).append(")");
	//   17   35:aload_1         
	//   18   36:ldc1            #161 <String ")">
	//   19   38:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   20   41:pop             
			throw new IllegalStateException(((StringBuilder) (query)).toString());
	//   21   42:new             #163 <Class IllegalStateException>
	//   22   45:dup             
	//   23   46:aload_1         
	//   24   47:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   25   50:invokespecial   #164 <Method void IllegalStateException(String)>
	//   26   53:athrow          
		}
		MediaBrowserCompat$SearchResultReceiver mediabrowsercompat$searchresultreceiver = new MediaBrowserCompat$SearchResultReceiver(query, extras, callback, ((android.os.Handler) (mHandler)));
	//   27   54:new             #407 <Class MediaBrowserCompat$SearchResultReceiver>
	//   28   57:dup             
	//   29   58:aload_1         
	//   30   59:aload_2         
	//   31   60:aload_3         
	//   32   61:aload_0         
	//   33   62:getfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   34   65:invokespecial   #410 <Method void MediaBrowserCompat$SearchResultReceiver(String, Bundle, MediaBrowserCompat$SearchCallback, android.os.Handler)>
	//   35   68:astore          4
		try
		{
			mServiceBinderWrapper.search(query, extras, ((android.support.v4.os.ResultReceiver) (mediabrowsercompat$searchresultreceiver)), mCallbacksMessenger);
	//   36   70:aload_0         
	//   37   71:getfield        #195 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   38   74:aload_1         
	//   39   75:aload_2         
	//   40   76:aload           4
	//   41   78:aload_0         
	//   42   79:getfield        #137 <Field Messenger mCallbacksMessenger>
	//   43   82:invokevirtual   #413 <Method void MediaBrowserCompat$ServiceBinderWrapper.search(String, Bundle, android.support.v4.os.ResultReceiver, Messenger)>
			return;
	//   44   85:return          
		}
		catch(RemoteException remoteexception)
	//*  45   86:astore          4
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   46   88:new             #114 <Class StringBuilder>
	//   47   91:dup             
	//   48   92:invokespecial   #115 <Method void StringBuilder()>
	//   49   95:astore          5
			stringbuilder.append("Remote error searching items with query: ");
	//   50   97:aload           5
	//   51   99:ldc2            #415 <String "Remote error searching items with query: ">
	//   52  102:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   53  105:pop             
			stringbuilder.append(query);
	//   54  106:aload           5
	//   55  108:aload_1         
	//   56  109:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   57  112:pop             
			Log.i("MediaBrowserCompat", stringbuilder.toString(), ((Throwable) (remoteexception)));
	//   58  113:ldc1            #148 <String "MediaBrowserCompat">
	//   59  115:aload           5
	//   60  117:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   61  120:aload           4
	//   62  122:invokestatic    #418 <Method int Log.i(String, String, Throwable)>
	//   63  125:pop             
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
	//   64  126:aload_0         
	//   65  127:getfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   66  130:new             #21  <Class MediaBrowserCompat$MediaBrowserImplBase$5>
	//   67  133:dup             
	//   68  134:aload_0         
	//   69  135:aload_3         
	//   70  136:aload_1         
	//   71  137:aload_2         
	//   72  138:invokespecial   #421 <Method void MediaBrowserCompat$MediaBrowserImplBase$5(MediaBrowserCompat$MediaBrowserImplBase, MediaBrowserCompat$SearchCallback, String, Bundle)>
	//   73  141:invokevirtual   #171 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   74  144:pop             
			return;
	//   75  145:return          
		}
	}

	public void sendCustomAction(final String action, final Bundle extras, final MediaBrowserCompat$CustomActionCallback callback)
	{
		if(!isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #223 <Method boolean isConnected()>
	//*   2    4:ifne            79
		{
			callback = ((MediaBrowserCompat$CustomActionCallback) (new StringBuilder()));
	//    3    7:new             #114 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #115 <Method void StringBuilder()>
	//    6   14:astore_3        
			((StringBuilder) (callback)).append("Cannot send a custom action (");
	//    7   15:aload_3         
	//    8   16:ldc2            #425 <String "Cannot send a custom action (">
	//    9   19:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:pop             
			((StringBuilder) (callback)).append(action);
	//   11   23:aload_3         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
			((StringBuilder) (callback)).append(") with ");
	//   15   29:aload_3         
	//   16   30:ldc2            #427 <String ") with ">
	//   17   33:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
			((StringBuilder) (callback)).append("extras ");
	//   19   37:aload_3         
	//   20   38:ldc2            #429 <String "extras ">
	//   21   41:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
			((StringBuilder) (callback)).append(((Object) (extras)));
	//   23   45:aload_3         
	//   24   46:aload_2         
	//   25   47:invokevirtual   #142 <Method StringBuilder StringBuilder.append(Object)>
	//   26   50:pop             
			((StringBuilder) (callback)).append(" because the browser is not connected to the ");
	//   27   51:aload_3         
	//   28   52:ldc2            #431 <String " because the browser is not connected to the ">
	//   29   55:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   30   58:pop             
			((StringBuilder) (callback)).append("service.");
	//   31   59:aload_3         
	//   32   60:ldc2            #433 <String "service.">
	//   33   63:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   34   66:pop             
			throw new IllegalStateException(((StringBuilder) (callback)).toString());
	//   35   67:new             #163 <Class IllegalStateException>
	//   36   70:dup             
	//   37   71:aload_3         
	//   38   72:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   39   75:invokespecial   #164 <Method void IllegalStateException(String)>
	//   40   78:athrow          
		}
		eiver eiver = new eiver(action, extras, callback, ((android.os.Handler) (mHandler)));
	//   41   79:new             #435 <Class MediaBrowserCompat$CustomActionResultReceiver>
	//   42   82:dup             
	//   43   83:aload_1         
	//   44   84:aload_2         
	//   45   85:aload_3         
	//   46   86:aload_0         
	//   47   87:getfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   48   90:invokespecial   #438 <Method void MediaBrowserCompat$CustomActionResultReceiver(String, Bundle, MediaBrowserCompat$CustomActionCallback, android.os.Handler)>
	//   49   93:astore          4
		try
		{
			mServiceBinderWrapper.sendCustomAction(action, extras, ((android.support.v4.os.ResultReceiver) (eiver)), mCallbacksMessenger);
	//   50   95:aload_0         
	//   51   96:getfield        #195 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   52   99:aload_1         
	//   53  100:aload_2         
	//   54  101:aload           4
	//   55  103:aload_0         
	//   56  104:getfield        #137 <Field Messenger mCallbacksMessenger>
	//   57  107:invokevirtual   #440 <Method void MediaBrowserCompat$ServiceBinderWrapper.sendCustomAction(String, Bundle, android.support.v4.os.ResultReceiver, Messenger)>
			return;
	//   58  110:return          
		}
		catch(RemoteException remoteexception)
	//*  59  111:astore          4
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   60  113:new             #114 <Class StringBuilder>
	//   61  116:dup             
	//   62  117:invokespecial   #115 <Method void StringBuilder()>
	//   63  120:astore          5
			stringbuilder.append("Remote error sending a custom action: action=");
	//   64  122:aload           5
	//   65  124:ldc2            #442 <String "Remote error sending a custom action: action=">
	//   66  127:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   67  130:pop             
			stringbuilder.append(action);
	//   68  131:aload           5
	//   69  133:aload_1         
	//   70  134:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   71  137:pop             
			stringbuilder.append(", extras=");
	//   72  138:aload           5
	//   73  140:ldc2            #444 <String ", extras=">
	//   74  143:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   75  146:pop             
			stringbuilder.append(((Object) (extras)));
	//   76  147:aload           5
	//   77  149:aload_2         
	//   78  150:invokevirtual   #142 <Method StringBuilder StringBuilder.append(Object)>
	//   79  153:pop             
			Log.i("MediaBrowserCompat", stringbuilder.toString(), ((Throwable) (remoteexception)));
	//   80  154:ldc1            #148 <String "MediaBrowserCompat">
	//   81  156:aload           5
	//   82  158:invokevirtual   #128 <Method String StringBuilder.toString()>
	//   83  161:aload           4
	//   84  163:invokestatic    #418 <Method int Log.i(String, String, Throwable)>
	//   85  166:pop             
		}
		if(callback != null)
	//*  86  167:aload_3         
	//*  87  168:ifnull          190
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
	//   88  171:aload_0         
	//   89  172:getfield        #78  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   90  175:new             #23  <Class MediaBrowserCompat$MediaBrowserImplBase$6>
	//   91  178:dup             
	//   92  179:aload_0         
	//   93  180:aload_3         
	//   94  181:aload_1         
	//   95  182:aload_2         
	//   96  183:invokespecial   #447 <Method void MediaBrowserCompat$MediaBrowserImplBase$6(MediaBrowserCompat$MediaBrowserImplBase, MediaBrowserCompat$CustomActionCallback, String, Bundle)>
	//   97  186:invokevirtual   #171 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   98  189:pop             
	//   99  190:return          
	}

	public void subscribe(String s, Bundle bundle, MediaBrowserCompat$SubscriptionCallback mediabrowsercompat$subscriptioncallback)
	{
		MediaBrowserCompat.Subscription subscription1 = (MediaBrowserCompat.Subscription)mSubscriptions.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field ArrayMap mSubscriptions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #312 <Method Object ArrayMap.get(Object)>
	//    4    8:checkcast       #314 <Class MediaBrowserCompat$Subscription>
	//    5   11:astore          5
		MediaBrowserCompat.Subscription subscription = subscription1;
	//    6   13:aload           5
	//    7   15:astore          4
		if(subscription1 == null)
	//*   8   17:aload           5
	//*   9   19:ifnonnull       42
		{
			subscription = new MediaBrowserCompat.Subscription();
	//   10   22:new             #314 <Class MediaBrowserCompat$Subscription>
	//   11   25:dup             
	//   12   26:invokespecial   #450 <Method void MediaBrowserCompat$Subscription()>
	//   13   29:astore          4
			mSubscriptions.put(((Object) (s)), ((Object) (subscription)));
	//   14   31:aload_0         
	//   15   32:getfield        #83  <Field ArrayMap mSubscriptions>
	//   16   35:aload_1         
	//   17   36:aload           4
	//   18   38:invokevirtual   #454 <Method Object ArrayMap.put(Object, Object)>
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
	//   25   51:new             #104 <Class Bundle>
	//   26   54:dup             
	//   27   55:aload_2         
	//   28   56:invokespecial   #107 <Method void Bundle(Bundle)>
	//   29   59:astore_2        
		subscription.putCallback(mContext, bundle, mediabrowsercompat$subscriptioncallback);
	//   30   60:aload           4
	//   31   62:aload_0         
	//   32   63:getfield        #98  <Field Context mContext>
	//   33   66:aload_2         
	//   34   67:aload_3         
	//   35   68:invokevirtual   #458 <Method void MediaBrowserCompat$Subscription.putCallback(Context, Bundle, MediaBrowserCompat$SubscriptionCallback)>
		if(isConnected())
	//*  36   71:aload_0         
	//*  37   72:invokevirtual   #223 <Method boolean isConnected()>
	//*  38   75:ifeq            128
		{
			try
			{
				mServiceBinderWrapper.addSubscription(s, MediaBrowserCompat$SubscriptionCallback.access$000(mediabrowsercompat$subscriptioncallback), bundle, mCallbacksMessenger);
	//   39   78:aload_0         
	//   40   79:getfield        #195 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   41   82:aload_1         
	//   42   83:aload_3         
	//   43   84:invokestatic    #395 <Method IBinder MediaBrowserCompat$SubscriptionCallback.access$000(MediaBrowserCompat$SubscriptionCallback)>
	//   44   87:aload_2         
	//   45   88:aload_0         
	//   46   89:getfield        #137 <Field Messenger mCallbacksMessenger>
	//   47   92:invokevirtual   #399 <Method void MediaBrowserCompat$ServiceBinderWrapper.addSubscription(String, IBinder, Bundle, Messenger)>
				return;
	//   48   95:return          
			}
	//*  49   96:new             #114 <Class StringBuilder>
	//*  50   99:dup             
	//*  51  100:invokespecial   #115 <Method void StringBuilder()>
	//*  52  103:astore_2        
	//*  53  104:aload_2         
	//*  54  105:ldc2            #460 <String "addSubscription failed with RemoteException parentId=">
	//*  55  108:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//*  56  111:pop             
	//*  57  112:aload_2         
	//*  58  113:aload_1         
	//*  59  114:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//*  60  117:pop             
	//*  61  118:ldc1            #148 <String "MediaBrowserCompat">
	//*  62  120:aload_2         
	//*  63  121:invokevirtual   #128 <Method String StringBuilder.toString()>
	//*  64  124:invokestatic    #179 <Method int Log.d(String, String)>
	//*  65  127:pop             
	//*  66  128:return          
			// Misplaced declaration of an exception variable
			catch(Bundle bundle)
			{
				bundle = ((Bundle) (new StringBuilder()));
			}
			((StringBuilder) (bundle)).append("addSubscription failed with RemoteException parentId=");
			((StringBuilder) (bundle)).append(s);
			Log.d("MediaBrowserCompat", ((StringBuilder) (bundle)).toString());
		}
	//*  67  129:astore_2        
	//*  68  130:goto            96
	}

	public void unsubscribe(String s, MediaBrowserCompat$SubscriptionCallback mediabrowsercompat$subscriptioncallback)
	{
		MediaBrowserCompat.Subscription subscription;
		subscription = (MediaBrowserCompat.Subscription)mSubscriptions.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field ArrayMap mSubscriptions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #312 <Method Object ArrayMap.get(Object)>
	//    4    8:checkcast       #314 <Class MediaBrowserCompat$Subscription>
	//    5   11:astore          4
		if(subscription == null)
	//*   6   13:aload           4
	//*   7   15:ifnonnull       19
			return;
	//    8   18:return          
		if(mediabrowsercompat$subscriptioncallback != null) goto _L2; else goto _L1
	//    9   19:aload_2         
	//   10   20:ifnonnull       46
_L1:
		int i;
		Object obj;
		List list;
		try
		{
			if(isConnected())
	//*  11   23:aload_0         
	//*  12   24:invokevirtual   #223 <Method boolean isConnected()>
	//*  13   27:ifeq            170
				mServiceBinderWrapper.removeSubscription(s, ((IBinder) (null)), mCallbacksMessenger);
	//   14   30:aload_0         
	//   15   31:getfield        #195 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   16   34:aload_1         
	//   17   35:aconst_null     
	//   18   36:aload_0         
	//   19   37:getfield        #137 <Field Messenger mCallbacksMessenger>
	//   20   40:invokevirtual   #466 <Method void MediaBrowserCompat$ServiceBinderWrapper.removeSubscription(String, IBinder, Messenger)>
		}
	//*  21   43:goto            170
	//*  22   46:aload           4
	//*  23   48:invokevirtual   #379 <Method List MediaBrowserCompat$Subscription.getCallbacks()>
	//*  24   51:astore          5
	//*  25   53:aload           4
	//*  26   55:invokevirtual   #382 <Method List MediaBrowserCompat$Subscription.getOptionsList()>
	//*  27   58:astore          6
	//*  28   60:aload           5
	//*  29   62:invokeinterface #388 <Method int List.size()>
	//*  30   67:iconst_1        
	//*  31   68:isub            
	//*  32   69:istore_3        
	//*  33   70:iload_3         
	//*  34   71:iflt            170
	//*  35   74:aload           5
	//*  36   76:iload_3         
	//*  37   77:invokeinterface #391 <Method Object List.get(int)>
	//*  38   82:aload_2         
	//*  39   83:if_acmpne       127
	//*  40   86:aload_0         
	//*  41   87:invokevirtual   #223 <Method boolean isConnected()>
	//*  42   90:ifeq            109
	//*  43   93:aload_0         
	//*  44   94:getfield        #195 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//*  45   97:aload_1         
	//*  46   98:aload_2         
	//*  47   99:invokestatic    #395 <Method IBinder MediaBrowserCompat$SubscriptionCallback.access$000(MediaBrowserCompat$SubscriptionCallback)>
	//*  48  102:aload_0         
	//*  49  103:getfield        #137 <Field Messenger mCallbacksMessenger>
	//*  50  106:invokevirtual   #466 <Method void MediaBrowserCompat$ServiceBinderWrapper.removeSubscription(String, IBinder, Messenger)>
	//*  51  109:aload           5
	//*  52  111:iload_3         
	//*  53  112:invokeinterface #469 <Method Object List.remove(int)>
	//*  54  117:pop             
	//*  55  118:aload           6
	//*  56  120:iload_3         
	//*  57  121:invokeinterface #469 <Method Object List.remove(int)>
	//*  58  126:pop             
	//*  59  127:iload_3         
	//*  60  128:iconst_1        
	//*  61  129:isub            
	//*  62  130:istore_3        
	//*  63  131:goto            70
	//*  64  134:new             #114 <Class StringBuilder>
	//*  65  137:dup             
	//*  66  138:invokespecial   #115 <Method void StringBuilder()>
	//*  67  141:astore          5
	//*  68  143:aload           5
	//*  69  145:ldc2            #471 <String "removeSubscription failed with RemoteException parentId=">
	//*  70  148:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//*  71  151:pop             
	//*  72  152:aload           5
	//*  73  154:aload_1         
	//*  74  155:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//*  75  158:pop             
	//*  76  159:ldc1            #148 <String "MediaBrowserCompat">
	//*  77  161:aload           5
	//*  78  163:invokevirtual   #128 <Method String StringBuilder.toString()>
	//*  79  166:invokestatic    #179 <Method int Log.d(String, String)>
	//*  80  169:pop             
	//*  81  170:aload           4
	//*  82  172:invokevirtual   #473 <Method boolean MediaBrowserCompat$Subscription.isEmpty()>
	//*  83  175:ifne            182
	//*  84  178:aload_2         
	//*  85  179:ifnonnull       191
	//*  86  182:aload_0         
	//*  87  183:getfield        #83  <Field ArrayMap mSubscriptions>
	//*  88  186:aload_1         
	//*  89  187:invokevirtual   #475 <Method Object ArrayMap.remove(Object)>
	//*  90  190:pop             
	//*  91  191:return          
		// Misplaced declaration of an exception variable
		catch(RemoteException remoteexception)
		{
			obj = ((Object) (new StringBuilder()));
			((StringBuilder) (obj)).append("removeSubscription failed with RemoteException parentId=");
			((StringBuilder) (obj)).append(s);
			Log.d("MediaBrowserCompat", ((StringBuilder) (obj)).toString());
		}
		  goto _L3
_L2:
		obj = ((Object) (subscription.getCallbacks()));
		list = subscription.getOptionsList();
		i = ((List) (obj)).size() - 1;
_L4:
		if(i < 0)
			break; /* Loop/switch isn't completed */
		if(((List) (obj)).get(i) == mediabrowsercompat$subscriptioncallback)
		{
			if(isConnected())
				mServiceBinderWrapper.removeSubscription(s, MediaBrowserCompat$SubscriptionCallback.access$000(mediabrowsercompat$subscriptioncallback), mCallbacksMessenger);
			((List) (obj)).remove(i);
			list.remove(i);
		}
		i--;
		if(true) goto _L4; else goto _L3
_L3:
		RemoteException remoteexception;
		if(subscription.isEmpty() || mediabrowsercompat$subscriptioncallback == null)
			mSubscriptions.remove(((Object) (s)));
		return;
	//*  92  192:astore          5
	//*  93  194:goto            134
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
	//*  47   91:ifnonnull       99
			context = null;
	//   48   94:aconst_null     
	//   49   95:astore_1        
		else
	//*  50   96:goto            109
			context = ((Context) (new Bundle(bundle)));
	//   51   99:new             #104 <Class Bundle>
	//   52  102:dup             
	//   53  103:aload           4
	//   54  105:invokespecial   #107 <Method void Bundle(Bundle)>
	//   55  108:astore_1        
		mRootHints = ((Bundle) (context));
	//   56  109:aload_0         
	//   57  110:aload_1         
	//   58  111:putfield        #109 <Field Bundle mRootHints>
	//   59  114:return          
	}
}
