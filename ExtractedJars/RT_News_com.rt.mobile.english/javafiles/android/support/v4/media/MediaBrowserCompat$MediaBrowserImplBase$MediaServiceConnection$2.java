// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.ComponentName;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat

class MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$2
	implements Runnable
{

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
			stringbuilder.append(((Object) (val$name)));
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
	//   58  117:putfield        #87  <Field android.os.Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
			mHandler.setCallbacksMessenger(((android.os.Messenger) (null)));
	//   59  120:aload_0         
	//   60  121:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
	//   61  124:getfield        #56  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
	//   62  127:getfield        #91  <Field MediaBrowserCompat$CallbackHandler MediaBrowserCompat$MediaBrowserImplBase.mHandler>
	//   63  130:aconst_null     
	//   64  131:invokevirtual   #97  <Method void MediaBrowserCompat$CallbackHandler.setCallbacksMessenger(android.os.Messenger)>
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

	MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection$2()
	{
		this$1 = final_mediaserviceconnection;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
		val$name = ComponentName.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #27  <Field ComponentName val$name>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #30  <Method void Object()>
	//    8   14:return          
	}
}
