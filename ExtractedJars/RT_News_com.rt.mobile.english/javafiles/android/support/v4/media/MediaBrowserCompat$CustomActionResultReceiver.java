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
	//	               -1 138
	//	               0 121
	//	               1 104
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//    6   36:new             #29  <Class StringBuilder>
	//    7   39:dup             
	//    8   40:invokespecial   #32  <Method void StringBuilder()>
	//    9   43:astore_3        
			stringbuilder.append("Unknown result code: ");
	//   10   44:aload_3         
	//   11   45:ldc1            #34  <String "Unknown result code: ">
	//   12   47:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   13   50:pop             
			stringbuilder.append(i);
	//   14   51:aload_3         
	//   15   52:iload_1         
	//   16   53:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//   17   56:pop             
			stringbuilder.append(" (extras=");
	//   18   57:aload_3         
	//   19   58:ldc1            #43  <String " (extras=">
	//   20   60:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   21   63:pop             
			stringbuilder.append(((Object) (mExtras)));
	//   22   64:aload_3         
	//   23   65:aload_0         
	//   24   66:getfield        #22  <Field Bundle mExtras>
	//   25   69:invokevirtual   #46  <Method StringBuilder StringBuilder.append(Object)>
	//   26   72:pop             
			stringbuilder.append(", resultData=");
	//   27   73:aload_3         
	//   28   74:ldc1            #48  <String ", resultData=">
	//   29   76:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   30   79:pop             
			stringbuilder.append(((Object) (bundle)));
	//   31   80:aload_3         
	//   32   81:aload_2         
	//   33   82:invokevirtual   #46  <Method StringBuilder StringBuilder.append(Object)>
	//   34   85:pop             
			stringbuilder.append(")");
	//   35   86:aload_3         
	//   36   87:ldc1            #50  <String ")">
	//   37   89:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   38   92:pop             
			Log.w("MediaBrowserCompat", stringbuilder.toString());
	//   39   93:ldc1            #52  <String "MediaBrowserCompat">
	//   40   95:aload_3         
	//   41   96:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   42   99:invokestatic    #62  <Method int Log.w(String, String)>
	//   43  102:pop             
			return;
	//   44  103:return          

		case 1: // '\001'
			mCallback.onProgressUpdate(mAction, mExtras, bundle);
	//   45  104:aload_0         
	//   46  105:getfield        #24  <Field MediaBrowserCompat$CustomActionCallback mCallback>
	//   47  108:aload_0         
	//   48  109:getfield        #20  <Field String mAction>
	//   49  112:aload_0         
	//   50  113:getfield        #22  <Field Bundle mExtras>
	//   51  116:aload_2         
	//   52  117:invokevirtual   #68  <Method void MediaBrowserCompat$CustomActionCallback.onProgressUpdate(String, Bundle, Bundle)>
			return;
	//   53  120:return          

		case 0: // '\0'
			mCallback.onResult(mAction, mExtras, bundle);
	//   54  121:aload_0         
	//   55  122:getfield        #24  <Field MediaBrowserCompat$CustomActionCallback mCallback>
	//   56  125:aload_0         
	//   57  126:getfield        #20  <Field String mAction>
	//   58  129:aload_0         
	//   59  130:getfield        #22  <Field Bundle mExtras>
	//   60  133:aload_2         
	//   61  134:invokevirtual   #71  <Method void MediaBrowserCompat$CustomActionCallback.onResult(String, Bundle, Bundle)>
			return;
	//   62  137:return          

		case -1: 
			mCallback.onError(mAction, mExtras, bundle);
	//   63  138:aload_0         
	//   64  139:getfield        #24  <Field MediaBrowserCompat$CustomActionCallback mCallback>
	//   65  142:aload_0         
	//   66  143:getfield        #20  <Field String mAction>
	//   67  146:aload_0         
	//   68  147:getfield        #22  <Field Bundle mExtras>
	//   69  150:aload_2         
	//   70  151:invokevirtual   #74  <Method void MediaBrowserCompat$CustomActionCallback.onError(String, Bundle, Bundle)>
			return;
	//   71  154:return          
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
