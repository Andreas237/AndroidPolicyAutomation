// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserCompat

private static class MediaBrowserCompat$CustomActionResultReceiver extends ResultReceiver
{

	protected void onReceiveResult(int i, Bundle bundle)
	{
		Object obj = ((Object) (mCallback));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field MediaBrowserCompat$CustomActionCallback mCallback>
	//    2    4:astore_3        
		if(obj == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		switch(i)
	//*   6   10:iload_1         
		{
	//*   7   11:tableswitch     -1 1: default 36
	//	               -1 132
	//	               0 118
	//	               1 104
		default:
			obj = ((Object) (new StringBuilder()));
	//    8   36:new             #19  <Class StringBuilder>
	//    9   39:dup             
	//   10   40:invokespecial   #23  <Method void StringBuilder()>
	//   11   43:astore_3        
			((StringBuilder) (obj)).append("Unknown result code: ");
	//   12   44:aload_3         
	//   13   45:ldc1            #25  <String "Unknown result code: ">
	//   14   47:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   15   50:pop             
			((StringBuilder) (obj)).append(i);
	//   16   51:aload_3         
	//   17   52:iload_1         
	//   18   53:invokevirtual   #32  <Method StringBuilder StringBuilder.append(int)>
	//   19   56:pop             
			((StringBuilder) (obj)).append(" (extras=");
	//   20   57:aload_3         
	//   21   58:ldc1            #34  <String " (extras=">
	//   22   60:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   23   63:pop             
			((StringBuilder) (obj)).append(((Object) (mExtras)));
	//   24   64:aload_3         
	//   25   65:aload_0         
	//   26   66:getfield        #36  <Field Bundle mExtras>
	//   27   69:invokevirtual   #39  <Method StringBuilder StringBuilder.append(Object)>
	//   28   72:pop             
			((StringBuilder) (obj)).append(", resultData=");
	//   29   73:aload_3         
	//   30   74:ldc1            #41  <String ", resultData=">
	//   31   76:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   32   79:pop             
			((StringBuilder) (obj)).append(((Object) (bundle)));
	//   33   80:aload_3         
	//   34   81:aload_2         
	//   35   82:invokevirtual   #39  <Method StringBuilder StringBuilder.append(Object)>
	//   36   85:pop             
			((StringBuilder) (obj)).append(")");
	//   37   86:aload_3         
	//   38   87:ldc1            #43  <String ")">
	//   39   89:invokevirtual   #29  <Method StringBuilder StringBuilder.append(String)>
	//   40   92:pop             
			Log.w("MediaBrowserCompat", ((StringBuilder) (obj)).toString());
	//   41   93:ldc1            #45  <String "MediaBrowserCompat">
	//   42   95:aload_3         
	//   43   96:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   44   99:invokestatic    #55  <Method int Log.w(String, String)>
	//   45  102:pop             
			return;
	//   46  103:return          

		case 1: // '\001'
			((MediaBrowserCompat.CustomActionCallback) (obj)).onProgressUpdate(mAction, mExtras, bundle);
	//   47  104:aload_3         
	//   48  105:aload_0         
	//   49  106:getfield        #57  <Field String mAction>
	//   50  109:aload_0         
	//   51  110:getfield        #36  <Field Bundle mExtras>
	//   52  113:aload_2         
	//   53  114:invokevirtual   #63  <Method void MediaBrowserCompat$CustomActionCallback.onProgressUpdate(String, Bundle, Bundle)>
			return;
	//   54  117:return          

		case 0: // '\0'
			((MediaBrowserCompat.CustomActionCallback) (obj)).onResult(mAction, mExtras, bundle);
	//   55  118:aload_3         
	//   56  119:aload_0         
	//   57  120:getfield        #57  <Field String mAction>
	//   58  123:aload_0         
	//   59  124:getfield        #36  <Field Bundle mExtras>
	//   60  127:aload_2         
	//   61  128:invokevirtual   #66  <Method void MediaBrowserCompat$CustomActionCallback.onResult(String, Bundle, Bundle)>
			return;
	//   62  131:return          

		case -1: 
			((MediaBrowserCompat.CustomActionCallback) (obj)).onError(mAction, mExtras, bundle);
	//   63  132:aload_3         
	//   64  133:aload_0         
	//   65  134:getfield        #57  <Field String mAction>
	//   66  137:aload_0         
	//   67  138:getfield        #36  <Field Bundle mExtras>
	//   68  141:aload_2         
	//   69  142:invokevirtual   #69  <Method void MediaBrowserCompat$CustomActionCallback.onError(String, Bundle, Bundle)>
			return;
	//   70  145:return          
		}
	}

	private final String mAction;
	private final MediaBrowserCompat.CustomActionCallback mCallback;
	private final Bundle mExtras;
}
