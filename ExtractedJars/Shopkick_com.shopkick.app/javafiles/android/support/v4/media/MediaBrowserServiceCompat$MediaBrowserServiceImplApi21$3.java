// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.util.ArrayMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package android.support.v4.media:
//			MediaBrowserServiceCompat

class MediaBrowserServiceCompat$MediaBrowserServiceImplApi21$3
	implements Runnable
{

	public void run()
	{
		Object obj;
		for(Iterator iterator = mConnections.keySet().iterator(); iterator.hasNext(); notifyChildrenChangedForCompatOnHandler(((MediaBrowserServiceCompat.ConnectionRecord) (obj)), val$parentId, val$options))
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
	//*   2    4:getfield        #37  <Field MediaBrowserServiceCompat MediaBrowserServiceCompat$MediaBrowserServiceImplApi21.this$0>
	//*   3    7:getfield        #41  <Field ArrayMap MediaBrowserServiceCompat.mConnections>
	//*   4   10:invokevirtual   #47  <Method Set ArrayMap.keySet()>
	//*   5   13:invokeinterface #53  <Method Iterator Set.iterator()>
	//*   6   18:astore_1        
	//*   7   19:aload_1         
	//*   8   20:invokeinterface #59  <Method boolean Iterator.hasNext()>
	//*   9   25:ifeq            75
		{
			obj = ((Object) ((IBinder)iterator.next()));
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
		}

	//   22   56:aload_0         
	//   23   57:getfield        #24  <Field MediaBrowserServiceCompat$MediaBrowserServiceImplApi21 this$1>
	//   24   60:aload_2         
	//   25   61:aload_0         
	//   26   62:getfield        #26  <Field String val$parentId>
	//   27   65:aload_0         
	//   28   66:getfield        #28  <Field Bundle val$options>
	//   29   69:invokevirtual   #75  <Method void MediaBrowserServiceCompat$MediaBrowserServiceImplApi21.notifyChildrenChangedForCompatOnHandler(MediaBrowserServiceCompat$ConnectionRecord, String, Bundle)>
	//*  30   72:goto            19
	//   31   75:return          
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
