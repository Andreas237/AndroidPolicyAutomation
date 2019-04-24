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
		RemoteException remoteexception;
		StringBuilder stringbuilder;
		if(mCallbacksMessenger != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field MediaBrowserCompat$MediaBrowserImplBase this$0>
	//*   2    4:getfield        #30  <Field android.os.Messenger MediaBrowserCompat$MediaBrowserImplBase.mCallbacksMessenger>
	//*   3    7:ifnull          67
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
	//*  23   50:getfield        #52  <Field android.content.ComponentName MediaBrowserCompat$MediaBrowserImplBase.mServiceComponent>
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
