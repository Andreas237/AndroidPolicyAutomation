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
	//*  10   26:if_acmpeq       89
		{
			if(MediaBrowserServiceCompat.DEBUG)
	//*  11   29:getstatic       #66  <Field boolean MediaBrowserServiceCompat.DEBUG>
	//*  12   32:ifeq            88
			{
				list = ((List) (new StringBuilder()));
	//   13   35:new             #68  <Class StringBuilder>
	//   14   38:dup             
	//   15   39:invokespecial   #71  <Method void StringBuilder()>
	//   16   42:astore_1        
				((StringBuilder) (list)).append("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
	//   17   43:aload_1         
	//   18   44:ldc1            #73  <String "Not sending onLoadChildren result for connection that has been disconnected. pkg=">
	//   19   46:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   20   49:pop             
				((StringBuilder) (list)).append(val$connection.pkg);
	//   21   50:aload_1         
	//   22   51:aload_0         
	//   23   52:getfield        #24  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
	//   24   55:getfield        #80  <Field String MediaBrowserServiceCompat$ConnectionRecord.pkg>
	//   25   58:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   26   61:pop             
				((StringBuilder) (list)).append(" id=");
	//   27   62:aload_1         
	//   28   63:ldc1            #82  <String " id=">
	//   29   65:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   30   68:pop             
				((StringBuilder) (list)).append(val$parentId);
	//   31   69:aload_1         
	//   32   70:aload_0         
	//   33   71:getfield        #26  <Field String val$parentId>
	//   34   74:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   35   77:pop             
				Log.d("MBServiceCompat", ((StringBuilder) (list)).toString());
	//   36   78:ldc1            #84  <String "MBServiceCompat">
	//   37   80:aload_1         
	//   38   81:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   39   84:invokestatic    #94  <Method int Log.d(String, String)>
	//   40   87:pop             
			}
			return;
	//   41   88:return          
		}
		List list1 = list;
	//   42   89:aload_1         
	//   43   90:astore_2        
		if((getFlags() & 1) != 0)
	//*  44   91:aload_0         
	//*  45   92:invokevirtual   #98  <Method int getFlags()>
	//*  46   95:iconst_1        
	//*  47   96:iand            
	//*  48   97:ifeq            113
			list1 = applyOptions(list, val$options);
	//   49  100:aload_0         
	//   50  101:getfield        #22  <Field MediaBrowserServiceCompat this$0>
	//   51  104:aload_1         
	//   52  105:aload_0         
	//   53  106:getfield        #28  <Field Bundle val$options>
	//   54  109:invokevirtual   #102 <Method List MediaBrowserServiceCompat.applyOptions(List, Bundle)>
	//   55  112:astore_2        
		try
		{
			val$connection.callbacks.onLoadChildren(val$parentId, list1, val$options);
	//   56  113:aload_0         
	//   57  114:getfield        #24  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
	//   58  117:getfield        #50  <Field MediaBrowserServiceCompat$ServiceCallbacks MediaBrowserServiceCompat$ConnectionRecord.callbacks>
	//   59  120:aload_0         
	//   60  121:getfield        #26  <Field String val$parentId>
	//   61  124:aload_2         
	//   62  125:aload_0         
	//   63  126:getfield        #28  <Field Bundle val$options>
	//   64  129:invokeinterface #106 <Method void MediaBrowserServiceCompat$ServiceCallbacks.onLoadChildren(String, List, Bundle)>
			return;
	//   65  134:return          
		}
	//*  66  135:new             #68  <Class StringBuilder>
	//*  67  138:dup             
	//*  68  139:invokespecial   #71  <Method void StringBuilder()>
	//*  69  142:astore_1        
	//*  70  143:aload_1         
	//*  71  144:ldc1            #108 <String "Calling onLoadChildren() failed for id=">
	//*  72  146:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//*  73  149:pop             
	//*  74  150:aload_1         
	//*  75  151:aload_0         
	//*  76  152:getfield        #26  <Field String val$parentId>
	//*  77  155:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//*  78  158:pop             
	//*  79  159:aload_1         
	//*  80  160:ldc1            #110 <String " package=">
	//*  81  162:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//*  82  165:pop             
	//*  83  166:aload_1         
	//*  84  167:aload_0         
	//*  85  168:getfield        #24  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
	//*  86  171:getfield        #80  <Field String MediaBrowserServiceCompat$ConnectionRecord.pkg>
	//*  87  174:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//*  88  177:pop             
	//*  89  178:ldc1            #84  <String "MBServiceCompat">
	//*  90  180:aload_1         
	//*  91  181:invokevirtual   #88  <Method String StringBuilder.toString()>
	//*  92  184:invokestatic    #113 <Method int Log.w(String, String)>
	//*  93  187:pop             
	//*  94  188:return          
		// Misplaced declaration of an exception variable
		catch(List list)
		{
			list = ((List) (new StringBuilder()));
		}
		((StringBuilder) (list)).append("Calling onLoadChildren() failed for id=");
		((StringBuilder) (list)).append(val$parentId);
		((StringBuilder) (list)).append(" package=");
		((StringBuilder) (list)).append(val$connection.pkg);
		Log.w("MBServiceCompat", ((StringBuilder) (list)).toString());
	//*  95  189:astore_1        
	//*  96  190:goto            135
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
