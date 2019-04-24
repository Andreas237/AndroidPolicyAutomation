// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$1 extends sult
{

	volatile void onResultSent(Object obj)
	{
		onResultSent((List)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #35  <Class List>
	//    3    5:invokevirtual   #38  <Method void onResultSent(List)>
	//    4    8:return          
	}

	void onResultSent(List list)
	{
		if(mConnections.get(((Object) (val$connection.callbacks.asBinder()))) != val$connection)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field MediaBrowserServiceCompat this$0>
	//*   2    4:getfield        #44  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
	//*   3    7:aload_0         
	//*   4    8:getfield        #24  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
	//*   5   11:getfield        #50  <Field MediaBrowserServiceCompat$ServiceCallbacks MediaBrowserServiceCompat$ConnectionRecord.callbacks>
	//*   6   14:invokeinterface #56  <Method android.os.IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
	//*   7   19:invokevirtual   #62  <Method Object ArrayMap.get(Object)>
	//*   8   22:aload_0         
	//*   9   23:getfield        #24  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
	//*  10   26:if_acmpeq       79
		{
			if(MediaBrowserServiceCompat.DEBUG)
	//*  11   29:getstatic       #66  <Field boolean MediaBrowserServiceCompat.DEBUG>
	//*  12   32:ifeq            78
				Log.d("MBServiceCompat", (new StringBuilder()).append("Not sending onLoadChildren result for connection that has been disconnected. pkg=").append(val$connection.pkg).append(" id=").append(val$parentId).toString());
	//   13   35:ldc1            #68  <String "MBServiceCompat">
	//   14   37:new             #70  <Class StringBuilder>
	//   15   40:dup             
	//   16   41:invokespecial   #73  <Method void StringBuilder()>
	//   17   44:ldc1            #75  <String "Not sending onLoadChildren result for connection that has been disconnected. pkg=">
	//   18   46:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   19   49:aload_0         
	//   20   50:getfield        #24  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
	//   21   53:getfield        #82  <Field String MediaBrowserServiceCompat$ConnectionRecord.pkg>
	//   22   56:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   23   59:ldc1            #84  <String " id=">
	//   24   61:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   25   64:aload_0         
	//   26   65:getfield        #26  <Field String val$parentId>
	//   27   68:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   28   71:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   29   74:invokestatic    #94  <Method int Log.d(String, String)>
	//   30   77:pop             
			return;
	//   31   78:return          
		}
		List list1 = list;
	//   32   79:aload_1         
	//   33   80:astore_2        
		if((getFlags() & 1) != 0)
	//*  34   81:aload_0         
	//*  35   82:invokevirtual   #98  <Method int getFlags()>
	//*  36   85:iconst_1        
	//*  37   86:iand            
	//*  38   87:ifeq            103
			list1 = applyOptions(list, val$options);
	//   39   90:aload_0         
	//   40   91:getfield        #22  <Field MediaBrowserServiceCompat this$0>
	//   41   94:aload_1         
	//   42   95:aload_0         
	//   43   96:getfield        #28  <Field Bundle val$options>
	//   44   99:invokevirtual   #102 <Method List MediaBrowserServiceCompat.applyOptions(List, Bundle)>
	//   45  102:astore_2        
		try
		{
			val$connection.callbacks.onLoadChildren(val$parentId, list1, val$options);
	//   46  103:aload_0         
	//   47  104:getfield        #24  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
	//   48  107:getfield        #50  <Field MediaBrowserServiceCompat$ServiceCallbacks MediaBrowserServiceCompat$ConnectionRecord.callbacks>
	//   49  110:aload_0         
	//   50  111:getfield        #26  <Field String val$parentId>
	//   51  114:aload_2         
	//   52  115:aload_0         
	//   53  116:getfield        #28  <Field Bundle val$options>
	//   54  119:invokeinterface #106 <Method void MediaBrowserServiceCompat$ServiceCallbacks.onLoadChildren(String, List, Bundle)>
			return;
	//   55  124:return          
		}
		// Misplaced declaration of an exception variable
		catch(List list)
	//*  56  125:astore_1        
		{
			Log.w("MBServiceCompat", (new StringBuilder()).append("Calling onLoadChildren() failed for id=").append(val$parentId).append(" package=").append(val$connection.pkg).toString());
	//   57  126:ldc1            #68  <String "MBServiceCompat">
	//   58  128:new             #70  <Class StringBuilder>
	//   59  131:dup             
	//   60  132:invokespecial   #73  <Method void StringBuilder()>
	//   61  135:ldc1            #108 <String "Calling onLoadChildren() failed for id=">
	//   62  137:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   63  140:aload_0         
	//   64  141:getfield        #26  <Field String val$parentId>
	//   65  144:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   66  147:ldc1            #110 <String " package=">
	//   67  149:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   68  152:aload_0         
	//   69  153:getfield        #24  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
	//   70  156:getfield        #82  <Field String MediaBrowserServiceCompat$ConnectionRecord.pkg>
	//   71  159:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   72  162:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   73  165:invokestatic    #113 <Method int Log.w(String, String)>
	//   74  168:pop             
		}
	//   75  169:return          
	}

	final MediaBrowserServiceCompat this$0;
	final nnectionRecord val$connection;
	final Bundle val$options;
	final String val$parentId;

	MediaBrowserServiceCompat$1(Bundle bundle)
	{
		this$0 = final_mediabrowserservicecompat;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field MediaBrowserServiceCompat this$0>
		val$connection = nnectionrecord;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #24  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
		val$parentId = String.this;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #26  <Field String val$parentId>
		val$options = bundle;
	//    9   16:aload_0         
	//   10   17:aload           5
	//   11   19:putfield        #28  <Field Bundle val$options>
		super(final_obj);
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:invokespecial   #31  <Method void MediaBrowserServiceCompat$Result(Object)>
	//   15   27:return          
	}
}
