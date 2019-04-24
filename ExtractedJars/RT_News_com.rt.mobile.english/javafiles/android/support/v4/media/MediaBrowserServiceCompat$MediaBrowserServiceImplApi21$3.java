// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.util.ArrayMap;
import android.support.v4.util.Pair;
import java.util.*;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat, MediaBrowserCompatUtils

class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$3
	implements Runnable
{

	public void run()
	{
		for(Iterator iterator = mConnections.keySet().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
	//*   2    4:getfield        #37  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$MediaBrowserServiceImplApi21.this$0>
	//*   3    7:getfield        #41  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
	//*   4   10:invokevirtual   #47  <Method Set ArrayMap.keySet()>
	//*   5   13:invokeinterface #53  <Method Iterator Set.iterator()>
	//*   6   18:astore_1        
	//*   7   19:aload_1         
	//*   8   20:invokeinterface #59  <Method boolean Iterator.hasNext()>
	//*   9   25:ifeq            146
		{
			Object obj = ((Object) ((IBinder)iterator.next()));
	//   10   28:aload_1         
	//   11   29:invokeinterface #63  <Method Object Iterator.next()>
	//   12   34:checkcast       #65  <Class IBinder>
	//   13   37:astore_2        
			obj = ((Object) ((MediaBrowserServiceCompat.ConnectionRecord)mConnections.get(obj)));
	//   14   38:aload_0         
	//   15   39:getfield        #24  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
	//   16   42:getfield        #37  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$MediaBrowserServiceImplApi21.this$0>
	//   17   45:getfield        #41  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
	//   18   48:aload_2         
	//   19   49:invokevirtual   #69  <Method Object ArrayMap.get(Object)>
	//   20   52:checkcast       #71  <Class MediaBrowserServiceCompat$ConnectionRecord>
	//   21   55:astore_2        
			Object obj1 = ((Object) ((List)((MediaBrowserServiceCompat.ConnectionRecord) (obj)).subscriptions.get(((Object) (val$parentId)))));
	//   22   56:aload_2         
	//   23   57:getfield        #75  <Field HashMap MediaBrowserServiceCompat$ConnectionRecord.subscriptions>
	//   24   60:aload_0         
	//   25   61:getfield        #26  <Field String val$parentId>
	//   26   64:invokevirtual   #78  <Method Object HashMap.get(Object)>
	//   27   67:checkcast       #80  <Class List>
	//   28   70:astore_3        
			if(obj1 != null)
	//*  29   71:aload_3         
	//*  30   72:ifnull          19
			{
				obj1 = ((Object) (((List) (obj1)).iterator()));
	//   31   75:aload_3         
	//   32   76:invokeinterface #81  <Method Iterator List.iterator()>
	//   33   81:astore_3        
				while(((Iterator) (obj1)).hasNext()) 
	//*  34   82:aload_3         
	//*  35   83:invokeinterface #59  <Method boolean Iterator.hasNext()>
	//*  36   88:ifeq            19
				{
					Pair pair = (Pair)((Iterator) (obj1)).next();
	//   37   91:aload_3         
	//   38   92:invokeinterface #63  <Method Object Iterator.next()>
	//   39   97:checkcast       #83  <Class Pair>
	//   40  100:astore          4
					if(MediaBrowserCompatUtils.hasDuplicatedItems(val$options, (Bundle)pair.second))
	//*  41  102:aload_0         
	//*  42  103:getfield        #28  <Field Bundle val$options>
	//*  43  106:aload           4
	//*  44  108:getfield        #87  <Field Object Pair.second>
	//*  45  111:checkcast       #89  <Class Bundle>
	//*  46  114:invokestatic    #95  <Method boolean MediaBrowserCompatUtils.hasDuplicatedItems(Bundle, Bundle)>
	//*  47  117:ifeq            82
						performLoadChildren(val$parentId, ((MediaBrowserServiceCompat.ConnectionRecord) (obj)), (Bundle)pair.second);
	//   48  120:aload_0         
	//   49  121:getfield        #24  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
	//   50  124:getfield        #37  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$MediaBrowserServiceImplApi21.this$0>
	//   51  127:aload_0         
	//   52  128:getfield        #26  <Field String val$parentId>
	//   53  131:aload_2         
	//   54  132:aload           4
	//   55  134:getfield        #87  <Field Object Pair.second>
	//   56  137:checkcast       #89  <Class Bundle>
	//   57  140:invokevirtual   #99  <Method void MediaBrowserServiceCompat.performLoadChildren(String, MediaBrowserServiceCompat$ConnectionRecord, Bundle)>
				}
			}
		}

	//*  58  143:goto            82
	//   59  146:return          
	}

	final MediaBrowserServiceCompat.MediaBrowserServiceImplApi21 this$1;
	final Bundle val$options;
	final String val$parentId;

	MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$3()
	{
		this$1 = final_mediabrowserserviceimplapi21;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
		val$parentId = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field String val$parentId>
		val$options = Bundle.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field Bundle val$options>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #31  <Method void Object()>
	//   11   19:return          
	}
}
