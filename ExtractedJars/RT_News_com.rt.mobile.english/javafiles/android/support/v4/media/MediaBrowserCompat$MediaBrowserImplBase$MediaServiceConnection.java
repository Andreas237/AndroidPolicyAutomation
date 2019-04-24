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

	public void onServiceConnected(final ComponentName name, final IBinder binder)
	{
		postOrRun(new Runnable() {

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
