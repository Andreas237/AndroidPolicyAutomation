// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import com.facebook.internal.Utility;
import java.util.*;

// Referenced classes of package com.facebook.appevents:
//			AppEventsLogger

static final class AppEventsLogger$4
	implements Runnable
{

	public void run()
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #18  <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void HashSet()>
	//    3    7:astore_2        
		Object obj = AppEventsLogger.access$400();
	//    4    8:invokestatic    #23  <Method Object AppEventsLogger.access$400()>
	//    5   11:astore_1        
		obj;
	//    6   12:aload_1         
		JVM INSTR monitorenter ;
	//    7   13:monitorenter    
		for(Iterator iterator = AppEventsLogger.access$500().keySet().iterator(); iterator.hasNext(); ((Set) (hashset)).add(((Object) (((cessTokenAppIdPair)iterator.next()).getApplicationId()))));
	//    8   14:invokestatic    #27  <Method Map AppEventsLogger.access$500()>
	//    9   17:invokeinterface #33  <Method Set Map.keySet()>
	//   10   22:invokeinterface #39  <Method Iterator Set.iterator()>
	//   11   27:astore_3        
	//   12   28:aload_3         
	//   13   29:invokeinterface #45  <Method boolean Iterator.hasNext()>
	//   14   34:ifeq            59
	//   15   37:aload_2         
	//   16   38:aload_3         
	//   17   39:invokeinterface #48  <Method Object Iterator.next()>
	//   18   44:checkcast       #50  <Class AppEventsLogger$AccessTokenAppIdPair>
	//   19   47:invokevirtual   #54  <Method String AppEventsLogger$AccessTokenAppIdPair.getApplicationId()>
	//   20   50:invokeinterface #58  <Method boolean Set.add(Object)>
	//   21   55:pop             
	//*  22   56:goto            28
		obj;
	//   23   59:aload_1         
		JVM INSTR monitorexit ;
	//   24   60:monitorexit     
		for(obj = ((Object) (((Set) (hashset)).iterator())); ((Iterator) (obj)).hasNext(); Utility.queryAppSettings((String)((Iterator) (obj)).next(), true));
	//   25   61:aload_2         
	//   26   62:invokeinterface #39  <Method Iterator Set.iterator()>
	//   27   67:astore_1        
	//   28   68:aload_1         
	//   29   69:invokeinterface #45  <Method boolean Iterator.hasNext()>
	//   30   74:ifeq            94
	//   31   77:aload_1         
	//   32   78:invokeinterface #48  <Method Object Iterator.next()>
	//   33   83:checkcast       #60  <Class String>
	//   34   86:iconst_1        
	//   35   87:invokestatic    #66  <Method com.facebook.internal.Utility$FetchedAppSettings Utility.queryAppSettings(String, boolean)>
	//   36   90:pop             
	//*  37   91:goto            68
		return;
	//   38   94:return          
		Exception exception;
		exception;
	//   39   95:astore_2        
		obj;
	//   40   96:aload_1         
		JVM INSTR monitorexit ;
	//   41   97:monitorexit     
		throw exception;
	//   42   98:aload_2         
	//   43   99:athrow          
	}

	AppEventsLogger$4()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
