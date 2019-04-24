// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.os.ResultReceiver;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat

private static class MediaBrowserCompat$CustomActionResultReceiver extends ResultReceiver
{

	protected void onReceiveResult(int i, Bundle bundle)
	{
		if(mCallback == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field MediaBrowserCompat$CustomActionCallback mCallback>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		switch(i)
	//*   4    8:iload_1         
		{
	//*   5    9:tableswitch     -1 1: default 36
	//	               -1 122
	//	               0 105
	//	               1 88
		default:
			Log.w("MediaBrowserCompat", (new StringBuilder()).append("Unknown result code: ").append(i).append(" (extras=").append(((Object) (mExtras))).append(", resultData=").append(((Object) (bundle))).append(")").toString());
	//    6   36:ldc1            #29  <String "MediaBrowserCompat">
	//    7   38:new             #31  <Class StringBuilder>
	//    8   41:dup             
	//    9   42:invokespecial   #34  <Method void StringBuilder()>
	//   10   45:ldc1            #36  <String "Unknown result code: ">
	//   11   47:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   12   50:iload_1         
	//   13   51:invokevirtual   #43  <Method StringBuilder StringBuilder.append(int)>
	//   14   54:ldc1            #45  <String " (extras=">
	//   15   56:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   16   59:aload_0         
	//   17   60:getfield        #22  <Field Bundle mExtras>
	//   18   63:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
	//   19   66:ldc1            #50  <String ", resultData=">
	//   20   68:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   21   71:aload_2         
	//   22   72:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
	//   23   75:ldc1            #52  <String ")">
	//   24   77:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   25   80:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   26   83:invokestatic    #62  <Method int Log.w(String, String)>
	//   27   86:pop             
			return;
	//   28   87:return          

		case 1: // '\001'
			mCallback.onProgressUpdate(mAction, mExtras, bundle);
	//   29   88:aload_0         
	//   30   89:getfield        #24  <Field MediaBrowserCompat$CustomActionCallback mCallback>
	//   31   92:aload_0         
	//   32   93:getfield        #20  <Field String mAction>
	//   33   96:aload_0         
	//   34   97:getfield        #22  <Field Bundle mExtras>
	//   35  100:aload_2         
	//   36  101:invokevirtual   #68  <Method void MediaBrowserCompat$CustomActionCallback.onProgressUpdate(String, Bundle, Bundle)>
			return;
	//   37  104:return          

		case 0: // '\0'
			mCallback.onResult(mAction, mExtras, bundle);
	//   38  105:aload_0         
	//   39  106:getfield        #24  <Field MediaBrowserCompat$CustomActionCallback mCallback>
	//   40  109:aload_0         
	//   41  110:getfield        #20  <Field String mAction>
	//   42  113:aload_0         
	//   43  114:getfield        #22  <Field Bundle mExtras>
	//   44  117:aload_2         
	//   45  118:invokevirtual   #71  <Method void MediaBrowserCompat$CustomActionCallback.onResult(String, Bundle, Bundle)>
			return;
	//   46  121:return          

		case -1: 
			mCallback.onError(mAction, mExtras, bundle);
	//   47  122:aload_0         
	//   48  123:getfield        #24  <Field MediaBrowserCompat$CustomActionCallback mCallback>
	//   49  126:aload_0         
	//   50  127:getfield        #20  <Field String mAction>
	//   51  130:aload_0         
	//   52  131:getfield        #22  <Field Bundle mExtras>
	//   53  134:aload_2         
	//   54  135:invokevirtual   #74  <Method void MediaBrowserCompat$CustomActionCallback.onError(String, Bundle, Bundle)>
			return;
	//   55  138:return          
		}
	}

	private final String mAction;
	private final MediaBrowserCompat.CustomActionCallback mCallback;
	private final Bundle mExtras;

	MediaBrowserCompat$CustomActionResultReceiver(String s, Bundle bundle, MediaBrowserCompat.CustomActionCallback customactioncallback, Handler handler)
	{
		super(handler);
	//    0    0:aload_0         
	//    1    1:aload           4
	//    2    3:invokespecial   #18  <Method void ResultReceiver(Handler)>
		mAction = s;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #20  <Field String mAction>
		mExtras = bundle;
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:putfield        #22  <Field Bundle mExtras>
		mCallback = customactioncallback;
	//    9   16:aload_0         
	//   10   17:aload_3         
	//   11   18:putfield        #24  <Field MediaBrowserCompat$CustomActionCallback mCallback>
	//   12   21:return          
	}
}
