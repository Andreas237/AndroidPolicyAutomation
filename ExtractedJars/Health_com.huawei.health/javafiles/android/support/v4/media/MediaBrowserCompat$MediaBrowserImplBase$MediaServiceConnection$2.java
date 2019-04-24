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
	//*   1    3:ifeq            71
		{
			Log.d("MediaBrowserCompat", (new StringBuilder()).append("MediaServiceConnection.onServiceDisconnected name=").append(((Object) (val$name))).append(" this=").append(((Object) (this))).append(" mServiceConnection=").append(((Object) (mServiceConnection))).toString());
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
	//   44  103:putfield        #87  <Field android.os.Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
			mHandler.setCallbacksMessenger(((android.os.Messenger) (null)));
	//   45  106:aload_0         
	//   46  107:getfield        #25  <Field MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection this$1>
	//   47  110:getfield        #58  <Field MediaBrowserCompat$MediaBrowserImplBase MediaBrowserCompat$MediaBrowserImplBase$MediaServiceConnection.this$0>
	//   48  113:getfield        #91  <Field MediaBrowserCompat$CallbackHandler MediaBrowserCompat$MediaBrowserImplBase.mHandler>
	//   49  116:aconst_null     
	//   50  117:invokevirtual   #97  <Method void MediaBrowserCompat$CallbackHandler.setCallbacksMessenger(android.os.Messenger)>
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
