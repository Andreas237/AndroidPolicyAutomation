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
	//    2   36:new             #115 <Class StringBuilder>
	//    3   39:dup             
	//    4   40:invokespecial   #116 <Method void StringBuilder()>
	//    5   43:astore_1        
			stringbuilder.append("UNKNOWN/");
	//    6   44:aload_1         
	//    7   45:ldc1            #118 <String "UNKNOWN/">
	//    8   47:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//    9   50:pop             
			stringbuilder.append(i);
	//   10   51:aload_1         
	//   11   52:iload_0         
	//   12   53:invokevirtual   #125 <Method StringBuilder StringBuilder.append(int)>
	//   13   56:pop             
			return stringbuilder.toString();
	//   14   57:aload_1         
	//   15   58:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   16   61:areturn         

		case 4: // '\004'
			return "CONNECT_STATE_SUSPENDED";
	//   17   62:ldc1            #130 <String "CONNECT_STATE_SUSPENDED">
	//   18   64:areturn         

		case 3: // '\003'
			return "CONNECT_STATE_CONNECTED";
	//   19   65:ldc1            #131 <String "CONNECT_STATE_CONNECTED">
	//   20   67:areturn         

		case 2: // '\002'
			return "CONNECT_STATE_CONNECTING";
	//   21   68:ldc1            #132 <String "CONNECT_STATE_CONNECTING">
	//   22   70:areturn         

		case 1: // '\001'
			return "CONNECT_STATE_DISCONNECTED";
	//   23   71:ldc1            #133 <String "CONNECT_STATE_DISCONNECTED">
	//   24   73:areturn         

		case 0: // '\0'
			return "CONNECT_STATE_DISCONNECTING";
	//   25   74:ldc1            #134 <String "CONNECT_STATE_DISCONNECTING">
	//   26   76:areturn         
		}
	}

	private boolean isCurrent(Messenger messenger, String s)
	{
		if(mCallbacksMessenger == messenger)
	//*   0    0:aload_0         
	//*   1    1:getfield        #138 <Field Messenger mCallbacksMessenger>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       27
		{
			int i = mState;
	//    4    8:aload_0         
	//    5    9:getfield        #86  <Field int mState>
	//    6   12:istore_3        
			if(i != 0 && i != 1)
	//*   7   13:iload_3         
	//*   8   14:ifeq            27
	//*   9   17:iload_3         
	//*  10   18:iconst_1        
	//*  11   19:icmpne          25
	//*  12   22:goto            27
				return true;
	//   13   25:iconst_1        
	//   14   26:ireturn         
		}
		int j = mState;
	//   15   27:aload_0         
	//   16   28:getfield        #86  <Field int mState>
	//   17   31:istore_3        
		if(j != 0 && j != 1)
	//*  18   32:iload_3         
	//*  19   33:ifeq            110
	//*  20   36:iload_3         
	//*  21   37:iconst_1        
	//*  22   38:icmpeq          110
		{
			messenger = ((Messenger) (new StringBuilder()));
	//   23   41:new             #115 <Class StringBuilder>
	//   24   44:dup             
	//   25   45:invokespecial   #116 <Method void StringBuilder()>
	//   26   48:astore_1        
			((StringBuilder) (messenger)).append(s);
	//   27   49:aload_1         
	//   28   50:aload_2         
	//   29   51:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   30   54:pop             
			((StringBuilder) (messenger)).append(" for ");
	//   31   55:aload_1         
	//   32   56:ldc1            #140 <String " for ">
	//   33   58:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   34   61:pop             
			((StringBuilder) (messenger)).append(((Object) (mServiceComponent)));
	//   35   62:aload_1         
	//   36   63:aload_0         
	//   37   64:getfield        #90  <Field ComponentName mServiceComponent>
	//   38   67:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
	//   39   70:pop             
			((StringBuilder) (messenger)).append(" with mCallbacksMessenger=");
	//   40   71:aload_1         
	//   41   72:ldc1            #145 <String " with mCallbacksMessenger=">
	//   42   74:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   43   77:pop             
			((StringBuilder) (messenger)).append(((Object) (mCallbacksMessenger)));
	//   44   78:aload_1         
	//   45   79:aload_0         
	//   46   80:getfield        #138 <Field Messenger mCallbacksMessenger>
	//   47   83:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
	//   48   86:pop             
			((StringBuilder) (messenger)).append(" this=");
	//   49   87:aload_1         
	//   50   88:ldc1            #147 <String " this=">
	//   51   90:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   52   93:pop             
			((StringBuilder) (messenger)).append(((Object) (this)));
	//   53   94:aload_1         
	//   54   95:aload_0         
	//   55   96:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
	//   56   99:pop             
			Log.i("MediaBrowserCompat", ((StringBuilder) (messenger)).toString());
	//   57  100:ldc1            #149 <String "MediaBrowserCompat">
	//   58  102:aload_1         
	//   59  103:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   60  106:invokestatic    #155 <Method int Log.i(String, String)>
	//   61  109:pop             
		}
		return false;
	//   62  110:iconst_0        
	//   63  111:ireturn         
	}

	public void connect()
	{
		int i = mState;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field int mState>
	//    2    4:istore_1        
		if(i != 0 && i != 1)
	//*   3    5:iload_1         
	//*   4    6:ifeq            63
	//*   5    9:iload_1         
	//*   6   10:iconst_1        
	//*   7   11:icmpne          17
	//*   8   14:goto            63
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    9   17:new             #115 <Class StringBuilder>
	//   10   20:dup             
	//   11   21:invokespecial   #116 <Method void StringBuilder()>
	//   12   24:astore_2        
			stringbuilder.append("connect() called while neigther disconnecting nor disconnected (state=");
	//   13   25:aload_2         
	//   14   26:ldc1            #158 <String "connect() called while neigther disconnecting nor disconnected (state=">
	//   15   28:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
			stringbuilder.append(getStateLabel(mState));
	//   17   32:aload_2         
	//   18   33:aload_0         
	//   19   34:getfield        #86  <Field int mState>
	//   20   37:invokestatic    #160 <Method String getStateLabel(int)>
	//   21   40:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   22   43:pop             
			stringbuilder.append(")");
	//   23   44:aload_2         
	//   24   45:ldc1            #162 <String ")">
	//   25   47:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   26   50:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   27   51:new             #164 <Class IllegalStateException>
	//   28   54:dup             
	//   29   55:aload_2         
	//   30   56:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   31   59:invokespecial   #165 <Method void IllegalStateException(String)>
	//   32   62:athrow          
		} else
		{
			mState = 2;
	//   33   63:aload_0         
	//   34   64:iconst_2        
	//   35   65:putfield        #86  <Field int mState>
			mHandler.post(new Runnable() {

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
						StringBuilder stringbuilder1 = new StringBuilder();
				//   16   38:new             #40  <Class StringBuilder>
				//   17   41:dup             
				//   18   42:invokespecial   #41  <Method void StringBuilder()>
				//   19   45:astore_3        
						stringbuilder1.append("mServiceConnection should be null. Instead it is ");
				//   20   46:aload_3         
				//   21   47:ldc1            #43  <String "mServiceConnection should be null. Instead it is ">
				//   22   49:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
				//   23   52:pop             
						stringbuilder1.append(((Object) (mServiceConnection)));
				//   24   53:aload_3         
				//   25   54:aload_0         
				//   26   55:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				//   27   58:getfield        #38  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
				//   28   61:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
				//   29   64:pop             
						throw new RuntimeException(stringbuilder1.toString());
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
				//   42   91:getfield        #67  <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
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
				//   52  112:getfield        #76  <Field ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
				//   53  115:invokevirtual   #80  <Method Intent Intent.setComponent(ComponentName)>
				//   54  118:pop             
					MediaBrowserCompat.MediaBrowserImplBase mediabrowserimplbase = MediaBrowserCompat.MediaBrowserImplBase.this;
				//   55  119:aload_0         
				//   56  120:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				//   57  123:astore          4
					mediabrowserimplbase.mServiceConnection = ((MediaServiceConnection) (mediabrowserimplbase)). new MediaServiceConnection();
				//   58  125:aload           4
				//   59  127:new             #82  <Class MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection>
				//   60  130:dup             
				//   61  131:aload           4
				//   62  133:invokespecial   #84  <Method void MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection(MediaBrowserCompat$MediaBrowserImplBase)>
				//   63  136:putfield        #38  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
					flag = false;
				//   64  139:iconst_0        
				//   65  140:istore_1        
					boolean flag1 = mContext.bindService(intent, ((ServiceConnection) (mServiceConnection)), 1);
				//   66  141:aload_0         
				//   67  142:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				//   68  145:getfield        #88  <Field Context MediaBrowserCompat$MediaBrowserImplBase.mContext>
				//   69  148:aload_3         
				//   70  149:aload_0         
				//   71  150:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				//   72  153:getfield        #38  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection MediaBrowserCompat$MediaBrowserImplBase.mServiceConnection>
				//   73  156:iconst_1        
				//   74  157:invokevirtual   #94  <Method boolean Context.bindService(Intent, ServiceConnection, int)>
				//   75  160:istore_2        
					flag = flag1;
				//   76  161:iload_2         
				//   77  162:istore_1        
					  goto _L5
				//*  78  163:goto            203
_L7:
					StringBuilder stringbuilder2 = new StringBuilder();
				//   79  166:new             #40  <Class StringBuilder>
				//   80  169:dup             
				//   81  170:invokespecial   #41  <Method void StringBuilder()>
				//   82  173:astore_3        
					stringbuilder2.append("Failed binding to service ");
				//   83  174:aload_3         
				//   84  175:ldc1            #96  <String "Failed binding to service ">
				//   85  177:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
				//   86  180:pop             
					stringbuilder2.append(((Object) (mServiceComponent)));
				//   87  181:aload_3         
				//   88  182:aload_0         
				//   89  183:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				//   90  186:getfield        #76  <Field ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
				//   91  189:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
				//   92  192:pop             
					Log.e("MediaBrowserCompat", stringbuilder2.toString());
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
					StringBuilder stringbuilder3 = new StringBuilder();
				//  117  246:new             #40  <Class StringBuilder>
				//  118  249:dup             
				//  119  250:invokespecial   #41  <Method void StringBuilder()>
				//  120  253:astore_3        
					stringbuilder3.append("mCallbacksMessenger should be null. Instead it is ");
				//  121  254:aload_3         
				//  122  255:ldc1            #126 <String "mCallbacksMessenger should be null. Instead it is ">
				//  123  257:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
				//  124  260:pop             
					stringbuilder3.append(((Object) (mCallbacksMessenger)));
				//  125  261:aload_3         
				//  126  262:aload_0         
				//  127  263:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				//  128  266:getfield        #67  <Field Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
				//  129  269:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
				//  130  272:pop             
					throw new RuntimeException(stringbuilder3.toString());
				//  131  273:new             #52  <Class RuntimeException>
				//  132  276:dup             
				//  133  277:aload_3         
				//  134  278:invokevirtual   #56  <Method String StringBuilder.toString()>
				//  135  281:invokespecial   #59  <Method void RuntimeException(String)>
				//  136  284:athrow          
_L2:
					StringBuilder stringbuilder4 = new StringBuilder();
				//  137  285:new             #40  <Class StringBuilder>
				//  138  288:dup             
				//  139  289:invokespecial   #41  <Method void StringBuilder()>
				//  140  292:astore_3        
					stringbuilder4.append("mServiceBinderWrapper should be null. Instead it is ");
				//  141  293:aload_3         
				//  142  294:ldc1            #128 <String "mServiceBinderWrapper should be null. Instead it is ">
				//  143  296:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
				//  144  299:pop             
					stringbuilder4.append(((Object) (mServiceBinderWrapper)));
				//  145  300:aload_3         
				//  146  301:aload_0         
				//  147  302:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
				//  148  305:getfield        #63  <Field MediaBrowserCompat$ServiceBinderWrapper MediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper>
				//  149  308:invokevirtual   #50  <Method StringBuilder StringBuilder.append(Object)>
				//  150  311:pop             
					throw new RuntimeException(stringbuilder4.toString());
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
	//   36   68:aload_0         
	//   37   69:getfield        #79  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   38   72:new             #13  <Class MediaBrowserCompat$MediaBrowserImplBase$1>
	//   39   75:dup             
	//   40   76:aload_0         
	//   41   77:invokespecial   #168 <Method void MediaBrowserCompat$MediaBrowserImplBase$1(MediaBrowserCompat$MediaBrowserImplBase)>
	//   42   80:invokevirtual   #172 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   43   83:pop             
			return;
	//   44   84:return          
		}
	}

	public void disconnect()
	{
		mState = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #86  <Field int mState>
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
	//    4    6:getfield        #79  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//    5    9:new             #15  <Class MediaBrowserCompat$MediaBrowserImplBase$2>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokespecial   #174 <Method void MediaBrowserCompat$MediaBrowserImplBase$2(MediaBrowserCompat$MediaBrowserImplBase)>
	//    9   17:invokevirtual   #172 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   10   20:pop             
	//   11   21:return          
	}

	void dump()
	{
		Log.d("MediaBrowserCompat", "MediaBrowserCompat...");
	//    0    0:ldc1            #149 <String "MediaBrowserCompat">
	//    1    2:ldc1            #177 <String "MediaBrowserCompat...">
	//    2    4:invokestatic    #180 <Method int Log.d(String, String)>
	//    3    7:pop             
		StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #115 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #116 <Method void StringBuilder()>
	//    7   15:astore_1        
		stringbuilder.append("  mServiceComponent=");
	//    8   16:aload_1         
	//    9   17:ldc1            #182 <String "  mServiceComponent=">
	//   10   19:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		stringbuilder.append(((Object) (mServiceComponent)));
	//   12   23:aload_1         
	//   13   24:aload_0         
	//   14   25:getfield        #90  <Field ComponentName mServiceComponent>
	//   15   28:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
	//   16   31:pop             
		Log.d("MediaBrowserCompat", stringbuilder.toString());
	//   17   32:ldc1            #149 <String "MediaBrowserCompat">
	//   18   34:aload_1         
	//   19   35:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   20   38:invokestatic    #180 <Method int Log.d(String, String)>
	//   21   41:pop             
		stringbuilder = new StringBuilder();
	//   22   42:new             #115 <Class StringBuilder>
	//   23   45:dup             
	//   24   46:invokespecial   #116 <Method void StringBuilder()>
	//   25   49:astore_1        
		stringbuilder.append("  mCallback=");
	//   26   50:aload_1         
	//   27   51:ldc1            #184 <String "  mCallback=">
	//   28   53:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   29   56:pop             
		stringbuilder.append(((Object) (mCallback)));
	//   30   57:aload_1         
	//   31   58:aload_0         
	//   32   59:getfield        #92  <Field MediaBrowserCompat$ConnectionCallback mCallback>
	//   33   62:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
	//   34   65:pop             
		Log.d("MediaBrowserCompat", stringbuilder.toString());
	//   35   66:ldc1            #149 <String "MediaBrowserCompat">
	//   36   68:aload_1         
	//   37   69:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   38   72:invokestatic    #180 <Method int Log.d(String, String)>
	//   39   75:pop             
		stringbuilder = new StringBuilder();
	//   40   76:new             #115 <Class StringBuilder>
	//   41   79:dup             
	//   42   80:invokespecial   #116 <Method void StringBuilder()>
	//   43   83:astore_1        
		stringbuilder.append("  mRootHints=");
	//   44   84:aload_1         
	//   45   85:ldc1            #186 <String "  mRootHints=">
	//   46   87:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   47   90:pop             
		stringbuilder.append(((Object) (mRootHints)));
	//   48   91:aload_1         
	//   49   92:aload_0         
	//   50   93:getfield        #99  <Field Bundle mRootHints>
	//   51   96:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
	//   52   99:pop             
		Log.d("MediaBrowserCompat", stringbuilder.toString());
	//   53  100:ldc1            #149 <String "MediaBrowserCompat">
	//   54  102:aload_1         
	//   55  103:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   56  106:invokestatic    #180 <Method int Log.d(String, String)>
	//   57  109:pop             
		stringbuilder = new StringBuilder();
	//   58  110:new             #115 <Class StringBuilder>
	//   59  113:dup             
	//   60  114:invokespecial   #116 <Method void StringBuilder()>
	//   61  117:astore_1        
		stringbuilder.append("  mState=");
	//   62  118:aload_1         
	//   63  119:ldc1            #188 <String "  mState=">
	//   64  121:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   65  124:pop             
		stringbuilder.append(getStateLabel(mState));
	//   66  125:aload_1         
	//   67  126:aload_0         
	//   68  127:getfield        #86  <Field int mState>
	//   69  130:invokestatic    #160 <Method String getStateLabel(int)>
	//   70  133:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   71  136:pop             
		Log.d("MediaBrowserCompat", stringbuilder.toString());
	//   72  137:ldc1            #149 <String "MediaBrowserCompat">
	//   73  139:aload_1         
	//   74  140:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   75  143:invokestatic    #180 <Method int Log.d(String, String)>
	//   76  146:pop             
		stringbuilder = new StringBuilder();
	//   77  147:new             #115 <Class StringBuilder>
	//   78  150:dup             
	//   79  151:invokespecial   #116 <Method void StringBuilder()>
	//   80  154:astore_1        
		stringbuilder.append("  mServiceConnection=");
	//   81  155:aload_1         
	//   82  156:ldc1            #190 <String "  mServiceConnection=">
	//   83  158:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   84  161:pop             
		stringbuilder.append(((Object) (mServiceConnection)));
	//   85  162:aload_1         
	//   86  163:aload_0         
	//   87  164:getfield        #192 <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mServiceConnection>
	//   88  167:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
	//   89  170:pop             
		Log.d("MediaBrowserCompat", stringbuilder.toString());
	//   90  171:ldc1            #149 <String "MediaBrowserCompat">
	//   91  173:aload_1         
	//   92  174:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   93  177:invokestatic    #180 <Method int Log.d(String, String)>
	//   94  180:pop             
		stringbuilder = new StringBuilder();
	//   95  181:new             #115 <Class StringBuilder>
	//   96  184:dup             
	//   97  185:invokespecial   #116 <Method void StringBuilder()>
	//   98  188:astore_1        
		stringbuilder.append("  mServiceBinderWrapper=");
	//   99  189:aload_1         
	//  100  190:ldc1            #194 <String "  mServiceBinderWrapper=">
	//  101  192:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//  102  195:pop             
		stringbuilder.append(((Object) (mServiceBinderWrapper)));
	//  103  196:aload_1         
	//  104  197:aload_0         
	//  105  198:getfield        #196 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//  106  201:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
	//  107  204:pop             
		Log.d("MediaBrowserCompat", stringbuilder.toString());
	//  108  205:ldc1            #149 <String "MediaBrowserCompat">
	//  109  207:aload_1         
	//  110  208:invokevirtual   #129 <Method String StringBuilder.toString()>
	//  111  211:invokestatic    #180 <Method int Log.d(String, String)>
	//  112  214:pop             
		stringbuilder = new StringBuilder();
	//  113  215:new             #115 <Class StringBuilder>
	//  114  218:dup             
	//  115  219:invokespecial   #116 <Method void StringBuilder()>
	//  116  222:astore_1        
		stringbuilder.append("  mCallbacksMessenger=");
	//  117  223:aload_1         
	//  118  224:ldc1            #198 <String "  mCallbacksMessenger=">
	//  119  226:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//  120  229:pop             
		stringbuilder.append(((Object) (mCallbacksMessenger)));
	//  121  230:aload_1         
	//  122  231:aload_0         
	//  123  232:getfield        #138 <Field Messenger mCallbacksMessenger>
	//  124  235:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
	//  125  238:pop             
		Log.d("MediaBrowserCompat", stringbuilder.toString());
	//  126  239:ldc1            #149 <String "MediaBrowserCompat">
	//  127  241:aload_1         
	//  128  242:invokevirtual   #129 <Method String StringBuilder.toString()>
	//  129  245:invokestatic    #180 <Method int Log.d(String, String)>
	//  130  248:pop             
		stringbuilder = new StringBuilder();
	//  131  249:new             #115 <Class StringBuilder>
	//  132  252:dup             
	//  133  253:invokespecial   #116 <Method void StringBuilder()>
	//  134  256:astore_1        
		stringbuilder.append("  mRootId=");
	//  135  257:aload_1         
	//  136  258:ldc1            #200 <String "  mRootId=">
	//  137  260:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//  138  263:pop             
		stringbuilder.append(mRootId);
	//  139  264:aload_1         
	//  140  265:aload_0         
	//  141  266:getfield        #202 <Field String mRootId>
	//  142  269:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//  143  272:pop             
		Log.d("MediaBrowserCompat", stringbuilder.toString());
	//  144  273:ldc1            #149 <String "MediaBrowserCompat">
	//  145  275:aload_1         
	//  146  276:invokevirtual   #129 <Method String StringBuilder.toString()>
	//  147  279:invokestatic    #180 <Method int Log.d(String, String)>
	//  148  282:pop             
		stringbuilder = new StringBuilder();
	//  149  283:new             #115 <Class StringBuilder>
	//  150  286:dup             
	//  151  287:invokespecial   #116 <Method void StringBuilder()>
	//  152  290:astore_1        
		stringbuilder.append("  mMediaSessionToken=");
	//  153  291:aload_1         
	//  154  292:ldc1            #204 <String "  mMediaSessionToken=">
	//  155  294:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//  156  297:pop             
		stringbuilder.append(((Object) (mMediaSessionToken)));
	//  157  298:aload_1         
	//  158  299:aload_0         
	//  159  300:getfield        #206 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
	//  160  303:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
	//  161  306:pop             
		Log.d("MediaBrowserCompat", stringbuilder.toString());
	//  162  307:ldc1            #149 <String "MediaBrowserCompat">
	//  163  309:aload_1         
	//  164  310:invokevirtual   #129 <Method String StringBuilder.toString()>
	//  165  313:invokestatic    #180 <Method int Log.d(String, String)>
	//  166  316:pop             
	//  167  317:return          
	}

	void forceCloseConnection()
	{
		MediaServiceConnection mediaserviceconnection = mServiceConnection;
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mServiceConnection>
	//    2    4:astore_1        
		if(mediaserviceconnection != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          17
			mContext.unbindService(((ServiceConnection) (mediaserviceconnection)));
	//    5    9:aload_0         
	//    6   10:getfield        #88  <Field Context mContext>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #213 <Method void Context.unbindService(ServiceConnection)>
		mState = 1;
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:putfield        #86  <Field int mState>
		mServiceConnection = null;
	//   12   22:aload_0         
	//   13   23:aconst_null     
	//   14   24:putfield        #192 <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection mServiceConnection>
		mServiceBinderWrapper = null;
	//   15   27:aload_0         
	//   16   28:aconst_null     
	//   17   29:putfield        #196 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
		mCallbacksMessenger = null;
	//   18   32:aload_0         
	//   19   33:aconst_null     
	//   20   34:putfield        #138 <Field Messenger mCallbacksMessenger>
		mHandler.setCallbacksMessenger(((Messenger) (null)));
	//   21   37:aload_0         
	//   22   38:getfield        #79  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   23   41:aconst_null     
	//   24   42:invokevirtual   #217 <Method void MediaBrowserCompat$CallbackHandler.setCallbacksMessenger(Messenger)>
		mRootId = null;
	//   25   45:aload_0         
	//   26   46:aconst_null     
	//   27   47:putfield        #202 <Field String mRootId>
		mMediaSessionToken = null;
	//   28   50:aload_0         
	//   29   51:aconst_null     
	//   30   52:putfield        #206 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
	//   31   55:return          
	}

	public Bundle getExtras()
	{
		if(isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #224 <Method boolean isConnected()>
	//*   2    4:ifeq            12
		{
			return mExtras;
	//    3    7:aload_0         
	//    4    8:getfield        #226 <Field Bundle mExtras>
	//    5   11:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   12:new             #115 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #116 <Method void StringBuilder()>
	//    9   19:astore_1        
			stringbuilder.append("getExtras() called while not connected (state=");
	//   10   20:aload_1         
	//   11   21:ldc1            #228 <String "getExtras() called while not connected (state=">
	//   12   23:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
			stringbuilder.append(getStateLabel(mState));
	//   14   27:aload_1         
	//   15   28:aload_0         
	//   16   29:getfield        #86  <Field int mState>
	//   17   32:invokestatic    #160 <Method String getStateLabel(int)>
	//   18   35:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
			stringbuilder.append(")");
	//   20   39:aload_1         
	//   21   40:ldc1            #162 <String ")">
	//   22   42:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   24   46:new             #164 <Class IllegalStateException>
	//   25   49:dup             
	//   26   50:aload_1         
	//   27   51:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   28   54:invokespecial   #165 <Method void IllegalStateException(String)>
	//   29   57:athrow          
		}
	}

	public void getItem(final String mediaId, final MediaBrowserCompat.ItemCallback cb)
	{
		RemoteException remoteexception;
		if(!TextUtils.isEmpty(((CharSequence) (mediaId))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #240 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            135
		{
			if(cb != null)
	//*   3    7:aload_2         
	//*   4    8:ifnull          124
			{
				if(!isConnected())
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #224 <Method boolean isConnected()>
	//*   7   15:ifne            45
				{
					Log.i("MediaBrowserCompat", "Not connected, unable to retrieve the MediaItem.");
	//    8   18:ldc1            #149 <String "MediaBrowserCompat">
	//    9   20:ldc1            #242 <String "Not connected, unable to retrieve the MediaItem.">
	//   10   22:invokestatic    #155 <Method int Log.i(String, String)>
	//   11   25:pop             
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
	//   12   26:aload_0         
	//   13   27:getfield        #79  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   14   30:new             #17  <Class MediaBrowserCompat$MediaBrowserImplBase$3>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:aload_2         
	//   18   36:aload_1         
	//   19   37:invokespecial   #245 <Method void MediaBrowserCompat$MediaBrowserImplBase$3(MediaBrowserCompat$MediaBrowserImplBase, MediaBrowserCompat$ItemCallback, String)>
	//   20   40:invokevirtual   #172 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   21   43:pop             
					return;
	//   22   44:return          
				}
				Object obj = ((Object) (new MediaBrowserCompat.ItemReceiver(mediaId, cb, ((android.os.Handler) (mHandler)))));
	//   23   45:new             #247 <Class MediaBrowserCompat$ItemReceiver>
	//   24   48:dup             
	//   25   49:aload_1         
	//   26   50:aload_2         
	//   27   51:aload_0         
	//   28   52:getfield        #79  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   29   55:invokespecial   #250 <Method void MediaBrowserCompat$ItemReceiver(String, MediaBrowserCompat$ItemCallback, android.os.Handler)>
	//   30   58:astore_3        
				try
				{
					mServiceBinderWrapper.getMediaItem(mediaId, ((android.support.v4.os.ResultReceiver) (obj)), mCallbacksMessenger);
	//   31   59:aload_0         
	//   32   60:getfield        #196 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   33   63:aload_1         
	//   34   64:aload_3         
	//   35   65:aload_0         
	//   36   66:getfield        #138 <Field Messenger mCallbacksMessenger>
	//   37   69:invokevirtual   #256 <Method void MediaBrowserCompat$ServiceBinderWrapper.getMediaItem(String, android.support.v4.os.ResultReceiver, Messenger)>
					return;
	//   38   72:return          
				}
	//*  39   73:new             #115 <Class StringBuilder>
	//*  40   76:dup             
	//*  41   77:invokespecial   #116 <Method void StringBuilder()>
	//*  42   80:astore_3        
	//*  43   81:aload_3         
	//*  44   82:ldc2            #258 <String "Remote error getting media item: ">
	//*  45   85:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//*  46   88:pop             
	//*  47   89:aload_3         
	//*  48   90:aload_1         
	//*  49   91:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//*  50   94:pop             
	//*  51   95:ldc1            #149 <String "MediaBrowserCompat">
	//*  52   97:aload_3         
	//*  53   98:invokevirtual   #129 <Method String StringBuilder.toString()>
	//*  54  101:invokestatic    #155 <Method int Log.i(String, String)>
	//*  55  104:pop             
	//*  56  105:aload_0         
	//*  57  106:getfield        #79  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//*  58  109:new             #19  <Class MediaBrowserCompat$MediaBrowserImplBase$4>
	//*  59  112:dup             
	//*  60  113:aload_0         
	//*  61  114:aload_2         
	//*  62  115:aload_1         
	//*  63  116:invokespecial   #259 <Method void MediaBrowserCompat$MediaBrowserImplBase$4(MediaBrowserCompat$MediaBrowserImplBase, MediaBrowserCompat$ItemCallback, String)>
	//*  64  119:invokevirtual   #172 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//*  65  122:pop             
	//*  66  123:return          
	//*  67  124:new             #101 <Class IllegalArgumentException>
	//*  68  127:dup             
	//*  69  128:ldc2            #261 <String "cb is null">
	//*  70  131:invokespecial   #106 <Method void IllegalArgumentException(String)>
	//*  71  134:athrow          
	//*  72  135:new             #101 <Class IllegalArgumentException>
	//*  73  138:dup             
	//*  74  139:ldc2            #263 <String "mediaId is empty">
	//*  75  142:invokespecial   #106 <Method void IllegalArgumentException(String)>
	//*  76  145:athrow          
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
				return;
			} else
			{
				throw new IllegalArgumentException("cb is null");
			}
		} else
		{
			throw new IllegalArgumentException("mediaId is empty");
		}
	//*  77  146:astore_3        
	//*  78  147:goto            73
	}

	public Bundle getNotifyChildrenChangedOptions()
	{
		return mNotifyChildrenChangedOptions;
	//    0    0:aload_0         
	//    1    1:getfield        #267 <Field Bundle mNotifyChildrenChangedOptions>
	//    2    4:areturn         
	}

	public String getRoot()
	{
		if(isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #224 <Method boolean isConnected()>
	//*   2    4:ifeq            12
		{
			return mRootId;
	//    3    7:aload_0         
	//    4    8:getfield        #202 <Field String mRootId>
	//    5   11:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   12:new             #115 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #116 <Method void StringBuilder()>
	//    9   19:astore_1        
			stringbuilder.append("getRoot() called while not connected(state=");
	//   10   20:aload_1         
	//   11   21:ldc2            #270 <String "getRoot() called while not connected(state=">
	//   12   24:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
			stringbuilder.append(getStateLabel(mState));
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #86  <Field int mState>
	//   17   33:invokestatic    #160 <Method String getStateLabel(int)>
	//   18   36:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   19   39:pop             
			stringbuilder.append(")");
	//   20   40:aload_1         
	//   21   41:ldc1            #162 <String ")">
	//   22   43:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   23   46:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   24   47:new             #164 <Class IllegalStateException>
	//   25   50:dup             
	//   26   51:aload_1         
	//   27   52:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   28   55:invokespecial   #165 <Method void IllegalStateException(String)>
	//   29   58:athrow          
		}
	}

	public ComponentName getServiceComponent()
	{
		if(isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #224 <Method boolean isConnected()>
	//*   2    4:ifeq            12
		{
			return mServiceComponent;
	//    3    7:aload_0         
	//    4    8:getfield        #90  <Field ComponentName mServiceComponent>
	//    5   11:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   12:new             #115 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #116 <Method void StringBuilder()>
	//    9   19:astore_1        
			stringbuilder.append("getServiceComponent() called while not connected (state=");
	//   10   20:aload_1         
	//   11   21:ldc2            #274 <String "getServiceComponent() called while not connected (state=">
	//   12   24:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
			stringbuilder.append(mState);
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #86  <Field int mState>
	//   17   33:invokevirtual   #125 <Method StringBuilder StringBuilder.append(int)>
	//   18   36:pop             
			stringbuilder.append(")");
	//   19   37:aload_1         
	//   20   38:ldc1            #162 <String ")">
	//   21   40:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   22   43:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   23   44:new             #164 <Class IllegalStateException>
	//   24   47:dup             
	//   25   48:aload_1         
	//   26   49:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   27   52:invokespecial   #165 <Method void IllegalStateException(String)>
	//   28   55:athrow          
		}
	}

	public android.support.v4.media.session.MediaSessionCompat.Token getSessionToken()
	{
		if(isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #224 <Method boolean isConnected()>
	//*   2    4:ifeq            12
		{
			return mMediaSessionToken;
	//    3    7:aload_0         
	//    4    8:getfield        #206 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
	//    5   11:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   12:new             #115 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #116 <Method void StringBuilder()>
	//    9   19:astore_1        
			stringbuilder.append("getSessionToken() called while not connected(state=");
	//   10   20:aload_1         
	//   11   21:ldc2            #278 <String "getSessionToken() called while not connected(state=">
	//   12   24:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
			stringbuilder.append(mState);
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #86  <Field int mState>
	//   17   33:invokevirtual   #125 <Method StringBuilder StringBuilder.append(int)>
	//   18   36:pop             
			stringbuilder.append(")");
	//   19   37:aload_1         
	//   20   38:ldc1            #162 <String ")">
	//   21   40:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   22   43:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   23   44:new             #164 <Class IllegalStateException>
	//   24   47:dup             
	//   25   48:aload_1         
	//   26   49:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   27   52:invokespecial   #165 <Method void IllegalStateException(String)>
	//   28   55:athrow          
		}
	}

	public boolean isConnected()
	{
		return mState == 3;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field int mState>
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
	//    0    0:new             #115 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #116 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("onConnectFailed for ");
	//    4    8:aload_2         
	//    5    9:ldc2            #281 <String "onConnectFailed for ">
	//    6   12:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(((Object) (mServiceComponent)));
	//    8   16:aload_2         
	//    9   17:aload_0         
	//   10   18:getfield        #90  <Field ComponentName mServiceComponent>
	//   11   21:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
	//   12   24:pop             
		Log.e("MediaBrowserCompat", stringbuilder.toString());
	//   13   25:ldc1            #149 <String "MediaBrowserCompat">
	//   14   27:aload_2         
	//   15   28:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   16   31:invokestatic    #284 <Method int Log.e(String, String)>
	//   17   34:pop             
		if(!isCurrent(messenger, "onConnectFailed"))
	//*  18   35:aload_0         
	//*  19   36:aload_1         
	//*  20   37:ldc2            #286 <String "onConnectFailed">
	//*  21   40:invokespecial   #288 <Method boolean isCurrent(Messenger, String)>
	//*  22   43:ifne            47
			return;
	//   23   46:return          
		if(mState != 2)
	//*  24   47:aload_0         
	//*  25   48:getfield        #86  <Field int mState>
	//*  26   51:iconst_2        
	//*  27   52:icmpeq          102
		{
			messenger = ((Messenger) (new StringBuilder()));
	//   28   55:new             #115 <Class StringBuilder>
	//   29   58:dup             
	//   30   59:invokespecial   #116 <Method void StringBuilder()>
	//   31   62:astore_1        
			((StringBuilder) (messenger)).append("onConnect from service while mState=");
	//   32   63:aload_1         
	//   33   64:ldc2            #290 <String "onConnect from service while mState=">
	//   34   67:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   35   70:pop             
			((StringBuilder) (messenger)).append(getStateLabel(mState));
	//   36   71:aload_1         
	//   37   72:aload_0         
	//   38   73:getfield        #86  <Field int mState>
	//   39   76:invokestatic    #160 <Method String getStateLabel(int)>
	//   40   79:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   41   82:pop             
			((StringBuilder) (messenger)).append("... ignoring");
	//   42   83:aload_1         
	//   43   84:ldc2            #292 <String "... ignoring">
	//   44   87:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   45   90:pop             
			Log.w("MediaBrowserCompat", ((StringBuilder) (messenger)).toString());
	//   46   91:ldc1            #149 <String "MediaBrowserCompat">
	//   47   93:aload_1         
	//   48   94:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   49   97:invokestatic    #295 <Method int Log.w(String, String)>
	//   50  100:pop             
			return;
	//   51  101:return          
		} else
		{
			forceCloseConnection();
	//   52  102:aload_0         
	//   53  103:invokevirtual   #297 <Method void forceCloseConnection()>
			mCallback.onConnectionFailed();
	//   54  106:aload_0         
	//   55  107:getfield        #92  <Field MediaBrowserCompat$ConnectionCallback mCallback>
	//   56  110:invokevirtual   #301 <Method void MediaBrowserCompat$ConnectionCallback.onConnectionFailed()>
			return;
	//   57  113:return          
		}
	}

	public void onLoadChildren(Messenger messenger, String s, List list, Bundle bundle, Bundle bundle1)
	{
		if(!isCurrent(messenger, "onLoadChildren"))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:ldc2            #304 <String "onLoadChildren">
	//*   3    5:invokespecial   #288 <Method boolean isCurrent(Messenger, String)>
	//*   4    8:ifne            12
			return;
	//    5   11:return          
		if(MediaBrowserCompat.DEBUG)
	//*   6   12:getstatic       #308 <Field boolean MediaBrowserCompat.DEBUG>
	//*   7   15:ifeq            67
		{
			messenger = ((Messenger) (new StringBuilder()));
	//    8   18:new             #115 <Class StringBuilder>
	//    9   21:dup             
	//   10   22:invokespecial   #116 <Method void StringBuilder()>
	//   11   25:astore_1        
			((StringBuilder) (messenger)).append("onLoadChildren for ");
	//   12   26:aload_1         
	//   13   27:ldc2            #310 <String "onLoadChildren for ">
	//   14   30:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   15   33:pop             
			((StringBuilder) (messenger)).append(((Object) (mServiceComponent)));
	//   16   34:aload_1         
	//   17   35:aload_0         
	//   18   36:getfield        #90  <Field ComponentName mServiceComponent>
	//   19   39:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
	//   20   42:pop             
			((StringBuilder) (messenger)).append(" id=");
	//   21   43:aload_1         
	//   22   44:ldc2            #312 <String " id=">
	//   23   47:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   24   50:pop             
			((StringBuilder) (messenger)).append(s);
	//   25   51:aload_1         
	//   26   52:aload_2         
	//   27   53:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   28   56:pop             
			Log.d("MediaBrowserCompat", ((StringBuilder) (messenger)).toString());
	//   29   57:ldc1            #149 <String "MediaBrowserCompat">
	//   30   59:aload_1         
	//   31   60:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   32   63:invokestatic    #180 <Method int Log.d(String, String)>
	//   33   66:pop             
		}
		messenger = ((Messenger) ((MediaBrowserCompat.Subscription)mSubscriptions.get(((Object) (s)))));
	//   34   67:aload_0         
	//   35   68:getfield        #84  <Field ArrayMap mSubscriptions>
	//   36   71:aload_2         
	//   37   72:invokevirtual   #316 <Method Object ArrayMap.get(Object)>
	//   38   75:checkcast       #318 <Class MediaBrowserCompat$Subscription>
	//   39   78:astore_1        
		if(messenger == null)
	//*  40   79:aload_1         
	//*  41   80:ifnonnull       122
		{
			if(MediaBrowserCompat.DEBUG)
	//*  42   83:getstatic       #308 <Field boolean MediaBrowserCompat.DEBUG>
	//*  43   86:ifeq            121
			{
				messenger = ((Messenger) (new StringBuilder()));
	//   44   89:new             #115 <Class StringBuilder>
	//   45   92:dup             
	//   46   93:invokespecial   #116 <Method void StringBuilder()>
	//   47   96:astore_1        
				((StringBuilder) (messenger)).append("onLoadChildren for id that isn't subscribed id=");
	//   48   97:aload_1         
	//   49   98:ldc2            #320 <String "onLoadChildren for id that isn't subscribed id=">
	//   50  101:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   51  104:pop             
				((StringBuilder) (messenger)).append(s);
	//   52  105:aload_1         
	//   53  106:aload_2         
	//   54  107:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   55  110:pop             
				Log.d("MediaBrowserCompat", ((StringBuilder) (messenger)).toString());
	//   56  111:ldc1            #149 <String "MediaBrowserCompat">
	//   57  113:aload_1         
	//   58  114:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   59  117:invokestatic    #180 <Method int Log.d(String, String)>
	//   60  120:pop             
			}
			return;
	//   61  121:return          
		}
		messenger = ((Messenger) (((MediaBrowserCompat.Subscription) (messenger)).getCallback(bundle)));
	//   62  122:aload_1         
	//   63  123:aload           4
	//   64  125:invokevirtual   #324 <Method MediaBrowserCompat$SubscriptionCallback MediaBrowserCompat$Subscription.getCallback(Bundle)>
	//   65  128:astore_1        
		if(messenger != null)
	//*  66  129:aload_1         
	//*  67  130:ifnull          197
		{
			if(bundle == null)
	//*  68  133:aload           4
	//*  69  135:ifnonnull       166
				if(list == null)
	//*  70  138:aload_3         
	//*  71  139:ifnonnull       148
				{
					((MediaBrowserCompat$SubscriptionCallback) (messenger)).onError(s);
	//   72  142:aload_1         
	//   73  143:aload_2         
	//   74  144:invokevirtual   #329 <Method void MediaBrowserCompat$SubscriptionCallback.onError(String)>
					return;
	//   75  147:return          
				} else
				{
					mNotifyChildrenChangedOptions = bundle1;
	//   76  148:aload_0         
	//   77  149:aload           5
	//   78  151:putfield        #267 <Field Bundle mNotifyChildrenChangedOptions>
					((MediaBrowserCompat$SubscriptionCallback) (messenger)).onChildrenLoaded(s, list);
	//   79  154:aload_1         
	//   80  155:aload_2         
	//   81  156:aload_3         
	//   82  157:invokevirtual   #333 <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List)>
					mNotifyChildrenChangedOptions = null;
	//   83  160:aload_0         
	//   84  161:aconst_null     
	//   85  162:putfield        #267 <Field Bundle mNotifyChildrenChangedOptions>
					return;
	//   86  165:return          
				}
			if(list == null)
	//*  87  166:aload_3         
	//*  88  167:ifnonnull       178
			{
				((MediaBrowserCompat$SubscriptionCallback) (messenger)).onError(s, bundle);
	//   89  170:aload_1         
	//   90  171:aload_2         
	//   91  172:aload           4
	//   92  174:invokevirtual   #336 <Method void MediaBrowserCompat$SubscriptionCallback.onError(String, Bundle)>
				return;
	//   93  177:return          
			}
			mNotifyChildrenChangedOptions = bundle1;
	//   94  178:aload_0         
	//   95  179:aload           5
	//   96  181:putfield        #267 <Field Bundle mNotifyChildrenChangedOptions>
			((MediaBrowserCompat$SubscriptionCallback) (messenger)).onChildrenLoaded(s, list, bundle);
	//   97  184:aload_1         
	//   98  185:aload_2         
	//   99  186:aload_3         
	//  100  187:aload           4
	//  101  189:invokevirtual   #339 <Method void MediaBrowserCompat$SubscriptionCallback.onChildrenLoaded(String, List, Bundle)>
			mNotifyChildrenChangedOptions = null;
	//  102  192:aload_0         
	//  103  193:aconst_null     
	//  104  194:putfield        #267 <Field Bundle mNotifyChildrenChangedOptions>
		}
	//  105  197:return          
	}

	public void onServiceConnected(Messenger messenger, String s, android.support.v4.media.session.MediaSessionCompat.Token token, Bundle bundle)
	{
		if(!isCurrent(messenger, "onConnect"))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:ldc2            #343 <String "onConnect">
	//*   3    5:invokespecial   #288 <Method boolean isCurrent(Messenger, String)>
	//*   4    8:ifne            12
			return;
	//    5   11:return          
		if(mState != 2)
	//*   6   12:aload_0         
	//*   7   13:getfield        #86  <Field int mState>
	//*   8   16:iconst_2        
	//*   9   17:icmpeq          67
		{
			messenger = ((Messenger) (new StringBuilder()));
	//   10   20:new             #115 <Class StringBuilder>
	//   11   23:dup             
	//   12   24:invokespecial   #116 <Method void StringBuilder()>
	//   13   27:astore_1        
			((StringBuilder) (messenger)).append("onConnect from service while mState=");
	//   14   28:aload_1         
	//   15   29:ldc2            #290 <String "onConnect from service while mState=">
	//   16   32:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
			((StringBuilder) (messenger)).append(getStateLabel(mState));
	//   18   36:aload_1         
	//   19   37:aload_0         
	//   20   38:getfield        #86  <Field int mState>
	//   21   41:invokestatic    #160 <Method String getStateLabel(int)>
	//   22   44:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
			((StringBuilder) (messenger)).append("... ignoring");
	//   24   48:aload_1         
	//   25   49:ldc2            #292 <String "... ignoring">
	//   26   52:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   27   55:pop             
			Log.w("MediaBrowserCompat", ((StringBuilder) (messenger)).toString());
	//   28   56:ldc1            #149 <String "MediaBrowserCompat">
	//   29   58:aload_1         
	//   30   59:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   31   62:invokestatic    #295 <Method int Log.w(String, String)>
	//   32   65:pop             
			return;
	//   33   66:return          
		}
		mRootId = s;
	//   34   67:aload_0         
	//   35   68:aload_2         
	//   36   69:putfield        #202 <Field String mRootId>
		mMediaSessionToken = token;
	//   37   72:aload_0         
	//   38   73:aload_3         
	//   39   74:putfield        #206 <Field android.support.v4.media.session.MediaSessionCompat$Token mMediaSessionToken>
		mExtras = bundle;
	//   40   77:aload_0         
	//   41   78:aload           4
	//   42   80:putfield        #226 <Field Bundle mExtras>
		mState = 3;
	//   43   83:aload_0         
	//   44   84:iconst_3        
	//   45   85:putfield        #86  <Field int mState>
		if(MediaBrowserCompat.DEBUG)
	//*  46   88:getstatic       #308 <Field boolean MediaBrowserCompat.DEBUG>
	//*  47   91:ifeq            107
		{
			Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
	//   48   94:ldc1            #149 <String "MediaBrowserCompat">
	//   49   96:ldc2            #345 <String "ServiceCallbacks.onConnect...">
	//   50   99:invokestatic    #180 <Method int Log.d(String, String)>
	//   51  102:pop             
			dump();
	//   52  103:aload_0         
	//   53  104:invokevirtual   #347 <Method void dump()>
		}
		mCallback.onConnected();
	//   54  107:aload_0         
	//   55  108:getfield        #92  <Field MediaBrowserCompat$ConnectionCallback mCallback>
	//   56  111:invokevirtual   #350 <Method void MediaBrowserCompat$ConnectionCallback.onConnected()>
		messenger = ((Messenger) (mSubscriptions.entrySet().iterator()));
	//   57  114:aload_0         
	//   58  115:getfield        #84  <Field ArrayMap mSubscriptions>
	//   59  118:invokevirtual   #354 <Method Set ArrayMap.entrySet()>
	//   60  121:invokeinterface #360 <Method Iterator Set.iterator()>
	//   61  126:astore_1        
_L4:
		if(!((Iterator) (messenger)).hasNext())
			break; /* Loop/switch isn't completed */
	//   62  127:aload_1         
	//   63  128:invokeinterface #365 <Method boolean Iterator.hasNext()>
	//   64  133:ifeq            250
		token = ((android.support.v4.media.session.MediaSessionCompat.Token) ((java.util.Map.Entry)((Iterator) (messenger)).next()));
	//   65  136:aload_1         
	//   66  137:invokeinterface #369 <Method Object Iterator.next()>
	//   67  142:checkcast       #371 <Class java.util.Map$Entry>
	//   68  145:astore_3        
		s = (String)((java.util.Map.Entry) (token)).getKey();
	//   69  146:aload_3         
	//   70  147:invokeinterface #374 <Method Object java.util.Map$Entry.getKey()>
	//   71  152:checkcast       #376 <Class String>
	//   72  155:astore_2        
		bundle = ((Bundle) ((MediaBrowserCompat.Subscription)((java.util.Map.Entry) (token)).getValue()));
	//   73  156:aload_3         
	//   74  157:invokeinterface #379 <Method Object java.util.Map$Entry.getValue()>
	//   75  162:checkcast       #318 <Class MediaBrowserCompat$Subscription>
	//   76  165:astore          4
		token = ((android.support.v4.media.session.MediaSessionCompat.Token) (((MediaBrowserCompat.Subscription) (bundle)).getCallbacks()));
	//   77  167:aload           4
	//   78  169:invokevirtual   #383 <Method List MediaBrowserCompat$Subscription.getCallbacks()>
	//   79  172:astore_3        
		bundle = ((Bundle) (((MediaBrowserCompat.Subscription) (bundle)).getOptionsList()));
	//   80  173:aload           4
	//   81  175:invokevirtual   #386 <Method List MediaBrowserCompat$Subscription.getOptionsList()>
	//   82  178:astore          4
		int i = 0;
	//   83  180:iconst_0        
	//   84  181:istore          5
_L2:
		if(i >= ((List) (token)).size())
			break; /* Loop/switch isn't completed */
	//   85  183:iload           5
	//   86  185:aload_3         
	//   87  186:invokeinterface #392 <Method int List.size()>
	//   88  191:icmpge          127
		mServiceBinderWrapper.addSubscription(s, ((MediaBrowserCompat$SubscriptionCallback)((List) (token)).get(i)).mToken, (Bundle)((List) (bundle)).get(i), mCallbacksMessenger);
	//   89  194:aload_0         
	//   90  195:getfield        #196 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   91  198:aload_2         
	//   92  199:aload_3         
	//   93  200:iload           5
	//   94  202:invokeinterface #395 <Method Object List.get(int)>
	//   95  207:checkcast       #326 <Class MediaBrowserCompat$SubscriptionCallback>
	//   96  210:getfield        #399 <Field IBinder MediaBrowserCompat$SubscriptionCallback.mToken>
	//   97  213:aload           4
	//   98  215:iload           5
	//   99  217:invokeinterface #395 <Method Object List.get(int)>
	//  100  222:checkcast       #94  <Class Bundle>
	//  101  225:aload_0         
	//  102  226:getfield        #138 <Field Messenger mCallbacksMessenger>
	//  103  229:invokevirtual   #403 <Method void MediaBrowserCompat$ServiceBinderWrapper.addSubscription(String, IBinder, Bundle, Messenger)>
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
	//  109  241:ldc1            #149 <String "MediaBrowserCompat">
	//  110  243:ldc2            #405 <String "addSubscription failed with RemoteException.">
	//  111  246:invokestatic    #180 <Method int Log.d(String, String)>
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
		if(isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #224 <Method boolean isConnected()>
	//*   2    4:ifeq            99
		{
			MediaBrowserCompat$SearchResultReceiver mediabrowsercompat$searchresultreceiver = new MediaBrowserCompat$SearchResultReceiver(query, extras, callback, ((android.os.Handler) (mHandler)));
	//    3    7:new             #409 <Class MediaBrowserCompat$SearchResultReceiver>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:aload_0         
	//    9   15:getfield        #79  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   10   18:invokespecial   #412 <Method void MediaBrowserCompat$SearchResultReceiver(String, Bundle, MediaBrowserCompat$SearchCallback, android.os.Handler)>
	//   11   21:astore          4
			try
			{
				mServiceBinderWrapper.search(query, extras, ((android.support.v4.os.ResultReceiver) (mediabrowsercompat$searchresultreceiver)), mCallbacksMessenger);
	//   12   23:aload_0         
	//   13   24:getfield        #196 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   14   27:aload_1         
	//   15   28:aload_2         
	//   16   29:aload           4
	//   17   31:aload_0         
	//   18   32:getfield        #138 <Field Messenger mCallbacksMessenger>
	//   19   35:invokevirtual   #415 <Method void MediaBrowserCompat$ServiceBinderWrapper.search(String, Bundle, android.support.v4.os.ResultReceiver, Messenger)>
				return;
	//   20   38:return          
			}
			catch(RemoteException remoteexception)
	//*  21   39:astore          4
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   22   41:new             #115 <Class StringBuilder>
	//   23   44:dup             
	//   24   45:invokespecial   #116 <Method void StringBuilder()>
	//   25   48:astore          5
				stringbuilder.append("Remote error searching items with query: ");
	//   26   50:aload           5
	//   27   52:ldc2            #417 <String "Remote error searching items with query: ">
	//   28   55:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   29   58:pop             
				stringbuilder.append(query);
	//   30   59:aload           5
	//   31   61:aload_1         
	//   32   62:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   33   65:pop             
				Log.i("MediaBrowserCompat", stringbuilder.toString(), ((Throwable) (remoteexception)));
	//   34   66:ldc1            #149 <String "MediaBrowserCompat">
	//   35   68:aload           5
	//   36   70:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   37   73:aload           4
	//   38   75:invokestatic    #420 <Method int Log.i(String, String, Throwable)>
	//   39   78:pop             
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
	//   40   79:aload_0         
	//   41   80:getfield        #79  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   42   83:new             #21  <Class MediaBrowserCompat$MediaBrowserImplBase$5>
	//   43   86:dup             
	//   44   87:aload_0         
	//   45   88:aload_3         
	//   46   89:aload_1         
	//   47   90:aload_2         
	//   48   91:invokespecial   #423 <Method void MediaBrowserCompat$MediaBrowserImplBase$5(MediaBrowserCompat$MediaBrowserImplBase, MediaBrowserCompat$SearchCallback, String, Bundle)>
	//   49   94:invokevirtual   #172 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   50   97:pop             
				return;
	//   51   98:return          
			}
		} else
		{
			query = ((String) (new StringBuilder()));
	//   52   99:new             #115 <Class StringBuilder>
	//   53  102:dup             
	//   54  103:invokespecial   #116 <Method void StringBuilder()>
	//   55  106:astore_1        
			((StringBuilder) (query)).append("search() called while not connected (state=");
	//   56  107:aload_1         
	//   57  108:ldc2            #425 <String "search() called while not connected (state=">
	//   58  111:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   59  114:pop             
			((StringBuilder) (query)).append(getStateLabel(mState));
	//   60  115:aload_1         
	//   61  116:aload_0         
	//   62  117:getfield        #86  <Field int mState>
	//   63  120:invokestatic    #160 <Method String getStateLabel(int)>
	//   64  123:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   65  126:pop             
			((StringBuilder) (query)).append(")");
	//   66  127:aload_1         
	//   67  128:ldc1            #162 <String ")">
	//   68  130:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   69  133:pop             
			throw new IllegalStateException(((StringBuilder) (query)).toString());
	//   70  134:new             #164 <Class IllegalStateException>
	//   71  137:dup             
	//   72  138:aload_1         
	//   73  139:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   74  142:invokespecial   #165 <Method void IllegalStateException(String)>
	//   75  145:athrow          
		}
	}

	public void sendCustomAction(final String action, final Bundle extras, final MediaBrowserCompat$CustomActionCallback callback)
	{
		if(isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #224 <Method boolean isConnected()>
	//*   2    4:ifeq            119
		{
			eiver eiver = new eiver(action, extras, callback, ((android.os.Handler) (mHandler)));
	//    3    7:new             #429 <Class MediaBrowserCompat$CustomActionResultReceiver>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:aload_0         
	//    9   15:getfield        #79  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   10   18:invokespecial   #432 <Method void MediaBrowserCompat$CustomActionResultReceiver(String, Bundle, MediaBrowserCompat$CustomActionCallback, android.os.Handler)>
	//   11   21:astore          4
			try
			{
				mServiceBinderWrapper.sendCustomAction(action, extras, ((android.support.v4.os.ResultReceiver) (eiver)), mCallbacksMessenger);
	//   12   23:aload_0         
	//   13   24:getfield        #196 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   14   27:aload_1         
	//   15   28:aload_2         
	//   16   29:aload           4
	//   17   31:aload_0         
	//   18   32:getfield        #138 <Field Messenger mCallbacksMessenger>
	//   19   35:invokevirtual   #434 <Method void MediaBrowserCompat$ServiceBinderWrapper.sendCustomAction(String, Bundle, android.support.v4.os.ResultReceiver, Messenger)>
				return;
	//   20   38:return          
			}
			catch(RemoteException remoteexception)
	//*  21   39:astore          4
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   22   41:new             #115 <Class StringBuilder>
	//   23   44:dup             
	//   24   45:invokespecial   #116 <Method void StringBuilder()>
	//   25   48:astore          5
				stringbuilder.append("Remote error sending a custom action: action=");
	//   26   50:aload           5
	//   27   52:ldc2            #436 <String "Remote error sending a custom action: action=">
	//   28   55:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   29   58:pop             
				stringbuilder.append(action);
	//   30   59:aload           5
	//   31   61:aload_1         
	//   32   62:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   33   65:pop             
				stringbuilder.append(", extras=");
	//   34   66:aload           5
	//   35   68:ldc2            #438 <String ", extras=">
	//   36   71:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   37   74:pop             
				stringbuilder.append(((Object) (extras)));
	//   38   75:aload           5
	//   39   77:aload_2         
	//   40   78:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
	//   41   81:pop             
				Log.i("MediaBrowserCompat", stringbuilder.toString(), ((Throwable) (remoteexception)));
	//   42   82:ldc1            #149 <String "MediaBrowserCompat">
	//   43   84:aload           5
	//   44   86:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   45   89:aload           4
	//   46   91:invokestatic    #420 <Method int Log.i(String, String, Throwable)>
	//   47   94:pop             
			}
			if(callback != null)
	//*  48   95:aload_3         
	//*  49   96:ifnull          118
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
	//   50   99:aload_0         
	//   51  100:getfield        #79  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//   52  103:new             #23  <Class MediaBrowserCompat$MediaBrowserImplBase$6>
	//   53  106:dup             
	//   54  107:aload_0         
	//   55  108:aload_3         
	//   56  109:aload_1         
	//   57  110:aload_2         
	//   58  111:invokespecial   #441 <Method void MediaBrowserCompat$MediaBrowserImplBase$6(MediaBrowserCompat$MediaBrowserImplBase, MediaBrowserCompat$CustomActionCallback, String, Bundle)>
	//   59  114:invokevirtual   #172 <Method boolean MediaBrowserCompat$CallbackHandler.post(Runnable)>
	//   60  117:pop             
			return;
	//   61  118:return          
		} else
		{
			callback = ((MediaBrowserCompat$CustomActionCallback) (new StringBuilder()));
	//   62  119:new             #115 <Class StringBuilder>
	//   63  122:dup             
	//   64  123:invokespecial   #116 <Method void StringBuilder()>
	//   65  126:astore_3        
			((StringBuilder) (callback)).append("Cannot send a custom action (");
	//   66  127:aload_3         
	//   67  128:ldc2            #443 <String "Cannot send a custom action (">
	//   68  131:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   69  134:pop             
			((StringBuilder) (callback)).append(action);
	//   70  135:aload_3         
	//   71  136:aload_1         
	//   72  137:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   73  140:pop             
			((StringBuilder) (callback)).append(") with ");
	//   74  141:aload_3         
	//   75  142:ldc2            #445 <String ") with ">
	//   76  145:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   77  148:pop             
			((StringBuilder) (callback)).append("extras ");
	//   78  149:aload_3         
	//   79  150:ldc2            #447 <String "extras ">
	//   80  153:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   81  156:pop             
			((StringBuilder) (callback)).append(((Object) (extras)));
	//   82  157:aload_3         
	//   83  158:aload_2         
	//   84  159:invokevirtual   #143 <Method StringBuilder StringBuilder.append(Object)>
	//   85  162:pop             
			((StringBuilder) (callback)).append(" because the browser is not connected to the ");
	//   86  163:aload_3         
	//   87  164:ldc2            #449 <String " because the browser is not connected to the ">
	//   88  167:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   89  170:pop             
			((StringBuilder) (callback)).append("service.");
	//   90  171:aload_3         
	//   91  172:ldc2            #451 <String "service.">
	//   92  175:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   93  178:pop             
			throw new IllegalStateException(((StringBuilder) (callback)).toString());
	//   94  179:new             #164 <Class IllegalStateException>
	//   95  182:dup             
	//   96  183:aload_3         
	//   97  184:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   98  187:invokespecial   #165 <Method void IllegalStateException(String)>
	//   99  190:athrow          
		}
	}

	public void subscribe(String s, Bundle bundle, MediaBrowserCompat$SubscriptionCallback mediabrowsercompat$subscriptioncallback)
	{
		MediaBrowserCompat.Subscription subscription1 = (MediaBrowserCompat.Subscription)mSubscriptions.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field ArrayMap mSubscriptions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #316 <Method Object ArrayMap.get(Object)>
	//    4    8:checkcast       #318 <Class MediaBrowserCompat$Subscription>
	//    5   11:astore          5
		MediaBrowserCompat.Subscription subscription = subscription1;
	//    6   13:aload           5
	//    7   15:astore          4
		if(subscription1 == null)
	//*   8   17:aload           5
	//*   9   19:ifnonnull       42
		{
			subscription = new MediaBrowserCompat.Subscription();
	//   10   22:new             #318 <Class MediaBrowserCompat$Subscription>
	//   11   25:dup             
	//   12   26:invokespecial   #454 <Method void MediaBrowserCompat$Subscription()>
	//   13   29:astore          4
			mSubscriptions.put(((Object) (s)), ((Object) (subscription)));
	//   14   31:aload_0         
	//   15   32:getfield        #84  <Field ArrayMap mSubscriptions>
	//   16   35:aload_1         
	//   17   36:aload           4
	//   18   38:invokevirtual   #458 <Method Object ArrayMap.put(Object, Object)>
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
	//   25   51:new             #94  <Class Bundle>
	//   26   54:dup             
	//   27   55:aload_2         
	//   28   56:invokespecial   #97  <Method void Bundle(Bundle)>
	//   29   59:astore_2        
		subscription.putCallback(bundle, mediabrowsercompat$subscriptioncallback);
	//   30   60:aload           4
	//   31   62:aload_2         
	//   32   63:aload_3         
	//   33   64:invokevirtual   #462 <Method void MediaBrowserCompat$Subscription.putCallback(Bundle, MediaBrowserCompat$SubscriptionCallback)>
		if(isConnected())
	//*  34   67:aload_0         
	//*  35   68:invokevirtual   #224 <Method boolean isConnected()>
	//*  36   71:ifeq            124
		{
			try
			{
				mServiceBinderWrapper.addSubscription(s, mediabrowsercompat$subscriptioncallback.mToken, bundle, mCallbacksMessenger);
	//   37   74:aload_0         
	//   38   75:getfield        #196 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   39   78:aload_1         
	//   40   79:aload_3         
	//   41   80:getfield        #399 <Field IBinder MediaBrowserCompat$SubscriptionCallback.mToken>
	//   42   83:aload_2         
	//   43   84:aload_0         
	//   44   85:getfield        #138 <Field Messenger mCallbacksMessenger>
	//   45   88:invokevirtual   #403 <Method void MediaBrowserCompat$ServiceBinderWrapper.addSubscription(String, IBinder, Bundle, Messenger)>
				return;
	//   46   91:return          
			}
	//*  47   92:new             #115 <Class StringBuilder>
	//*  48   95:dup             
	//*  49   96:invokespecial   #116 <Method void StringBuilder()>
	//*  50   99:astore_2        
	//*  51  100:aload_2         
	//*  52  101:ldc2            #464 <String "addSubscription failed with RemoteException parentId=">
	//*  53  104:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//*  54  107:pop             
	//*  55  108:aload_2         
	//*  56  109:aload_1         
	//*  57  110:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//*  58  113:pop             
	//*  59  114:ldc1            #149 <String "MediaBrowserCompat">
	//*  60  116:aload_2         
	//*  61  117:invokevirtual   #129 <Method String StringBuilder.toString()>
	//*  62  120:invokestatic    #180 <Method int Log.d(String, String)>
	//*  63  123:pop             
	//*  64  124:return          
			// Misplaced declaration of an exception variable
			catch(Bundle bundle)
			{
				bundle = ((Bundle) (new StringBuilder()));
			}
			((StringBuilder) (bundle)).append("addSubscription failed with RemoteException parentId=");
			((StringBuilder) (bundle)).append(s);
			Log.d("MediaBrowserCompat", ((StringBuilder) (bundle)).toString());
		}
	//*  65  125:astore_2        
	//*  66  126:goto            92
	}

	public void unsubscribe(String s, MediaBrowserCompat$SubscriptionCallback mediabrowsercompat$subscriptioncallback)
	{
		MediaBrowserCompat.Subscription subscription;
		subscription = (MediaBrowserCompat.Subscription)mSubscriptions.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field ArrayMap mSubscriptions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #316 <Method Object ArrayMap.get(Object)>
	//    4    8:checkcast       #318 <Class MediaBrowserCompat$Subscription>
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
	//*  12   24:invokevirtual   #224 <Method boolean isConnected()>
	//*  13   27:ifeq            170
				mServiceBinderWrapper.removeSubscription(s, ((IBinder) (null)), mCallbacksMessenger);
	//   14   30:aload_0         
	//   15   31:getfield        #196 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//   16   34:aload_1         
	//   17   35:aconst_null     
	//   18   36:aload_0         
	//   19   37:getfield        #138 <Field Messenger mCallbacksMessenger>
	//   20   40:invokevirtual   #470 <Method void MediaBrowserCompat$ServiceBinderWrapper.removeSubscription(String, IBinder, Messenger)>
		}
	//*  21   43:goto            170
	//*  22   46:aload           4
	//*  23   48:invokevirtual   #383 <Method List MediaBrowserCompat$Subscription.getCallbacks()>
	//*  24   51:astore          5
	//*  25   53:aload           4
	//*  26   55:invokevirtual   #386 <Method List MediaBrowserCompat$Subscription.getOptionsList()>
	//*  27   58:astore          6
	//*  28   60:aload           5
	//*  29   62:invokeinterface #392 <Method int List.size()>
	//*  30   67:iconst_1        
	//*  31   68:isub            
	//*  32   69:istore_3        
	//*  33   70:iload_3         
	//*  34   71:iflt            170
	//*  35   74:aload           5
	//*  36   76:iload_3         
	//*  37   77:invokeinterface #395 <Method Object List.get(int)>
	//*  38   82:aload_2         
	//*  39   83:if_acmpne       127
	//*  40   86:aload_0         
	//*  41   87:invokevirtual   #224 <Method boolean isConnected()>
	//*  42   90:ifeq            109
	//*  43   93:aload_0         
	//*  44   94:getfield        #196 <Field MediaBrowserCompat$ServiceBinderWrapper mServiceBinderWrapper>
	//*  45   97:aload_1         
	//*  46   98:aload_2         
	//*  47   99:getfield        #399 <Field IBinder MediaBrowserCompat$SubscriptionCallback.mToken>
	//*  48  102:aload_0         
	//*  49  103:getfield        #138 <Field Messenger mCallbacksMessenger>
	//*  50  106:invokevirtual   #470 <Method void MediaBrowserCompat$ServiceBinderWrapper.removeSubscription(String, IBinder, Messenger)>
	//*  51  109:aload           5
	//*  52  111:iload_3         
	//*  53  112:invokeinterface #473 <Method Object List.remove(int)>
	//*  54  117:pop             
	//*  55  118:aload           6
	//*  56  120:iload_3         
	//*  57  121:invokeinterface #473 <Method Object List.remove(int)>
	//*  58  126:pop             
	//*  59  127:iload_3         
	//*  60  128:iconst_1        
	//*  61  129:isub            
	//*  62  130:istore_3        
	//*  63  131:goto            70
	//*  64  134:new             #115 <Class StringBuilder>
	//*  65  137:dup             
	//*  66  138:invokespecial   #116 <Method void StringBuilder()>
	//*  67  141:astore          5
	//*  68  143:aload           5
	//*  69  145:ldc2            #475 <String "removeSubscription failed with RemoteException parentId=">
	//*  70  148:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//*  71  151:pop             
	//*  72  152:aload           5
	//*  73  154:aload_1         
	//*  74  155:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//*  75  158:pop             
	//*  76  159:ldc1            #149 <String "MediaBrowserCompat">
	//*  77  161:aload           5
	//*  78  163:invokevirtual   #129 <Method String StringBuilder.toString()>
	//*  79  166:invokestatic    #180 <Method int Log.d(String, String)>
	//*  80  169:pop             
	//*  81  170:aload           4
	//*  82  172:invokevirtual   #477 <Method boolean MediaBrowserCompat$Subscription.isEmpty()>
	//*  83  175:ifne            182
	//*  84  178:aload_2         
	//*  85  179:ifnonnull       191
	//*  86  182:aload_0         
	//*  87  183:getfield        #84  <Field ArrayMap mSubscriptions>
	//*  88  186:aload_1         
	//*  89  187:invokevirtual   #479 <Method Object ArrayMap.remove(Object)>
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
				mServiceBinderWrapper.removeSubscription(s, mediabrowsercompat$subscriptioncallback.mToken, mCallbacksMessenger);
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
	private Bundle mNotifyChildrenChangedOptions;
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
	//    1    1:invokespecial   #72  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #74  <Class MediaBrowserCompat$CallbackHandler>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #77  <Method void MediaBrowserCompat$CallbackHandler(MediaBrowserCompat$MediaBrowserServiceCallbackImpl)>
	//    7   13:putfield        #79  <Field MediaBrowserCompat$CallbackHandler mHandler>
	//    8   16:aload_0         
	//    9   17:new             #81  <Class ArrayMap>
	//   10   20:dup             
	//   11   21:invokespecial   #82  <Method void ArrayMap()>
	//   12   24:putfield        #84  <Field ArrayMap mSubscriptions>
		mState = 1;
	//   13   27:aload_0         
	//   14   28:iconst_1        
	//   15   29:putfield        #86  <Field int mState>
		if(context != null)
	//*  16   32:aload_1         
	//*  17   33:ifnull          105
		{
			if(componentname != null)
	//*  18   36:aload_2         
	//*  19   37:ifnull          95
			{
				if(connectioncallback != null)
	//*  20   40:aload_3         
	//*  21   41:ifnull          85
				{
					mContext = context;
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:putfield        #88  <Field Context mContext>
					mServiceComponent = componentname;
	//   25   49:aload_0         
	//   26   50:aload_2         
	//   27   51:putfield        #90  <Field ComponentName mServiceComponent>
					mCallback = connectioncallback;
	//   28   54:aload_0         
	//   29   55:aload_3         
	//   30   56:putfield        #92  <Field MediaBrowserCompat$ConnectionCallback mCallback>
					if(bundle == null)
	//*  31   59:aload           4
	//*  32   61:ifnonnull       69
						context = null;
	//   33   64:aconst_null     
	//   34   65:astore_1        
					else
	//*  35   66:goto            79
						context = ((Context) (new Bundle(bundle)));
	//   36   69:new             #94  <Class Bundle>
	//   37   72:dup             
	//   38   73:aload           4
	//   39   75:invokespecial   #97  <Method void Bundle(Bundle)>
	//   40   78:astore_1        
					mRootHints = ((Bundle) (context));
	//   41   79:aload_0         
	//   42   80:aload_1         
	//   43   81:putfield        #99  <Field Bundle mRootHints>
					return;
	//   44   84:return          
				} else
				{
					throw new IllegalArgumentException("connection callback must not be null");
	//   45   85:new             #101 <Class IllegalArgumentException>
	//   46   88:dup             
	//   47   89:ldc1            #103 <String "connection callback must not be null">
	//   48   91:invokespecial   #106 <Method void IllegalArgumentException(String)>
	//   49   94:athrow          
				}
			} else
			{
				throw new IllegalArgumentException("service component must not be null");
	//   50   95:new             #101 <Class IllegalArgumentException>
	//   51   98:dup             
	//   52   99:ldc1            #108 <String "service component must not be null">
	//   53  101:invokespecial   #106 <Method void IllegalArgumentException(String)>
	//   54  104:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("context must not be null");
	//   55  105:new             #101 <Class IllegalArgumentException>
	//   56  108:dup             
	//   57  109:ldc1            #110 <String "context must not be null">
	//   58  111:invokespecial   #106 <Method void IllegalArgumentException(String)>
	//   59  114:athrow          
		}
	}
}
