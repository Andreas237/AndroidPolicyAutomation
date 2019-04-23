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
	//    2    2:checkcast       #38  <Class List>
	//    3    5:invokevirtual   #41  <Method void onResultSent(List)>
	//    4    8:return          
	}

	void onResultSent(List list)
	{
		if(mConnections.get(((Object) (val$connection.callbacks.asBinder()))) != val$connection)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field MediaBrowserServiceCompat this$0>
	//*   2    4:getfield        #47  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
	//*   3    7:aload_0         
	//*   4    8:getfield        #25  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
	//*   5   11:getfield        #53  <Field MediaBrowserServiceCompat$ServiceCallbacks MediaBrowserServiceCompat$ConnectionRecord.callbacks>
	//*   6   14:invokeinterface #59  <Method android.os.IBinder MediaBrowserServiceCompat$ServiceCallbacks.asBinder()>
	//*   7   19:invokevirtual   #65  <Method Object ArrayMap.get(Object)>
	//*   8   22:aload_0         
	//*   9   23:getfield        #25  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
	//*  10   26:if_acmpeq       89
		{
			if(MediaBrowserServiceCompat.DEBUG)
	//*  11   29:getstatic       #69  <Field boolean MediaBrowserServiceCompat.DEBUG>
	//*  12   32:ifeq            88
			{
				list = ((List) (new StringBuilder()));
	//   13   35:new             #71  <Class StringBuilder>
	//   14   38:dup             
	//   15   39:invokespecial   #74  <Method void StringBuilder()>
	//   16   42:astore_1        
				((StringBuilder) (list)).append("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
	//   17   43:aload_1         
	//   18   44:ldc1            #76  <String "Not sending onLoadChildren result for connection that has been disconnected. pkg=">
	//   19   46:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   20   49:pop             
				((StringBuilder) (list)).append(val$connection.pkg);
	//   21   50:aload_1         
	//   22   51:aload_0         
	//   23   52:getfield        #25  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
	//   24   55:getfield        #83  <Field String MediaBrowserServiceCompat$ConnectionRecord.pkg>
	//   25   58:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   26   61:pop             
				((StringBuilder) (list)).append(" id=");
	//   27   62:aload_1         
	//   28   63:ldc1            #85  <String " id=">
	//   29   65:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   30   68:pop             
				((StringBuilder) (list)).append(val$parentId);
	//   31   69:aload_1         
	//   32   70:aload_0         
	//   33   71:getfield        #27  <Field String val$parentId>
	//   34   74:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   35   77:pop             
				Log.d("MBServiceCompat", ((StringBuilder) (list)).toString());
	//   36   78:ldc1            #87  <String "MBServiceCompat">
	//   37   80:aload_1         
	//   38   81:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   39   84:invokestatic    #97  <Method int Log.d(String, String)>
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
	//*  45   92:invokevirtual   #101 <Method int getFlags()>
	//*  46   95:iconst_1        
	//*  47   96:iand            
	//*  48   97:ifeq            113
			list1 = applyOptions(list, val$subscribeOptions);
	//   49  100:aload_0         
	//   50  101:getfield        #23  <Field MediaBrowserServiceCompat this$0>
	//   51  104:aload_1         
	//   52  105:aload_0         
	//   53  106:getfield        #29  <Field Bundle val$subscribeOptions>
	//   54  109:invokevirtual   #105 <Method List MediaBrowserServiceCompat.applyOptions(List, Bundle)>
	//   55  112:astore_2        
		try
		{
			val$connection.callbacks.onLoadChildren(val$parentId, list1, val$subscribeOptions, val$notifyChildrenChangedOptions);
	//   56  113:aload_0         
	//   57  114:getfield        #25  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
	//   58  117:getfield        #53  <Field MediaBrowserServiceCompat$ServiceCallbacks MediaBrowserServiceCompat$ConnectionRecord.callbacks>
	//   59  120:aload_0         
	//   60  121:getfield        #27  <Field String val$parentId>
	//   61  124:aload_2         
	//   62  125:aload_0         
	//   63  126:getfield        #29  <Field Bundle val$subscribeOptions>
	//   64  129:aload_0         
	//   65  130:getfield        #31  <Field Bundle val$notifyChildrenChangedOptions>
	//   66  133:invokeinterface #109 <Method void MediaBrowserServiceCompat$ServiceCallbacks.onLoadChildren(String, List, Bundle, Bundle)>
			return;
	//   67  138:return          
		}
	//*  68  139:new             #71  <Class StringBuilder>
	//*  69  142:dup             
	//*  70  143:invokespecial   #74  <Method void StringBuilder()>
	//*  71  146:astore_1        
	//*  72  147:aload_1         
	//*  73  148:ldc1            #111 <String "Calling onLoadChildren() failed for id=">
	//*  74  150:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//*  75  153:pop             
	//*  76  154:aload_1         
	//*  77  155:aload_0         
	//*  78  156:getfield        #27  <Field String val$parentId>
	//*  79  159:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//*  80  162:pop             
	//*  81  163:aload_1         
	//*  82  164:ldc1            #113 <String " package=">
	//*  83  166:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//*  84  169:pop             
	//*  85  170:aload_1         
	//*  86  171:aload_0         
	//*  87  172:getfield        #25  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
	//*  88  175:getfield        #83  <Field String MediaBrowserServiceCompat$ConnectionRecord.pkg>
	//*  89  178:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//*  90  181:pop             
	//*  91  182:ldc1            #87  <String "MBServiceCompat">
	//*  92  184:aload_1         
	//*  93  185:invokevirtual   #91  <Method String StringBuilder.toString()>
	//*  94  188:invokestatic    #116 <Method int Log.w(String, String)>
	//*  95  191:pop             
	//*  96  192:return          
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
	//*  97  193:astore_1        
	//*  98  194:goto            139
	}

	final MediaBrowserServiceCompat this$0;
	final nnectionRecord val$connection;
	final Bundle val$notifyChildrenChangedOptions;
	final String val$parentId;
	final Bundle val$subscribeOptions;

	MediaBrowserServiceCompat$1(Bundle bundle1)
	{
		this$0 = final_mediabrowserservicecompat;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field MediaBrowserServiceCompat this$0>
		val$connection = nnectionrecord;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #25  <Field MediaBrowserServiceCompat$ConnectionRecord val$connection>
		val$parentId = s;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #27  <Field String val$parentId>
		val$subscribeOptions = Bundle.this;
	//    9   16:aload_0         
	//   10   17:aload           5
	//   11   19:putfield        #29  <Field Bundle val$subscribeOptions>
		val$notifyChildrenChangedOptions = bundle1;
	//   12   22:aload_0         
	//   13   23:aload           6
	//   14   25:putfield        #31  <Field Bundle val$notifyChildrenChangedOptions>
		super(final_obj);
	//   15   28:aload_0         
	//   16   29:aload_2         
	//   17   30:invokespecial   #34  <Method void MediaBrowserServiceCompat$Result(Object)>
	//   18   33:return          
	}
}
