// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.RemoteException;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat

class MediaBrowserCompat$MediaBrowserImplBase$2
	implements Runnable
{

	public void run()
	{
		int i;
		if(mCallbacksMessenger != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//*   2    4:getfield        #30  <Field android.os.Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
	//*   3    7:ifnull          27
			try
			{
				mServiceBinderWrapper.disconnect(mCallbacksMessenger);
	//    4   10:aload_0         
	//    5   11:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//    6   14:getfield        #34  <Field MediaBrowserCompat$ServiceBinderWrapper MediaBrowserCompat$MediaBrowserImplBase.mServiceBinderWrapper>
	//    7   17:aload_0         
	//    8   18:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//    9   21:getfield        #30  <Field android.os.Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
	//   10   24:invokevirtual   #39  <Method void MediaBrowserCompat$ServiceBinderWrapper.disconnect(android.os.Messenger)>
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
	//   43   95:getfield        #76  <Field android.content.ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
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

	MediaBrowserCompat$MediaBrowserImplBase$2()
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
