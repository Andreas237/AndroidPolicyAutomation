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
		if((getFlags() & 1) != 0)
	//*  32   79:aload_0         
	//*  33   80:invokevirtual   #98  <Method int getFlags()>
	//*  34   83:iconst_1        
	//*  35   84:iand            
	//*  36   85:ifeq            168
			list = applyOptions(list, val$options);
	//   37   88:aload_0         
	//   38   89:getfield        #22  <Field MediaBrowserServiceCompat this$0>
	//   39   92:aload_1         
	//   40   93:aload_0         
	//   41   94:getfield        #28  <Field Bundle val$options>
	//   42   97:invokevirtual   #102 <Method List MediaBrowserServiceCompat.applyOptions(List, Bundle)>
	//   43  100:astore_1        
		try
		{
			val$connection.callbacks.onLoadChildren(val$parentId, list, val$options);
	//   44  101:aload_0         
	//   45  102:getfield        #24  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
	//   46  105:getfield        #50  <Field MediaBrowserServiceCompat$ServiceCallbacks MediaBrowserServiceCompat$ConnectionRecord.callbacks>
	//   47  108:aload_0         
	//   48  109:getfield        #26  <Field String val$parentId>
	//   49  112:aload_1         
	//   50  113:aload_0         
	//   51  114:getfield        #28  <Field Bundle val$options>
	//   52  117:invokeinterface #106 <Method void MediaBrowserServiceCompat$ServiceCallbacks.onLoadChildren(String, List, Bundle)>
			return;
	//   53  122:return          
		}
		// Misplaced declaration of an exception variable
		catch(List list)
	//*  54  123:astore_1        
		{
			Log.w("MBServiceCompat", (new StringBuilder()).append("Calling onLoadChildren() failed for id=").append(val$parentId).append(" package=").append(val$connection.pkg).toString());
	//   55  124:ldc1            #68  <String "MBServiceCompat">
	//   56  126:new             #70  <Class StringBuilder>
	//   57  129:dup             
	//   58  130:invokespecial   #73  <Method void StringBuilder()>
	//   59  133:ldc1            #108 <String "Calling onLoadChildren() failed for id=">
	//   60  135:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   61  138:aload_0         
	//   62  139:getfield        #26  <Field String val$parentId>
	//   63  142:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   64  145:ldc1            #110 <String " package=">
	//   65  147:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   66  150:aload_0         
	//   67  151:getfield        #24  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
	//   68  154:getfield        #82  <Field String MediaBrowserServiceCompat$ConnectionRecord.pkg>
	//   69  157:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   70  160:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   71  163:invokestatic    #113 <Method int Log.w(String, String)>
	//   72  166:pop             
		}
	//   73  167:return          
	//*  74  168:goto            101
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
