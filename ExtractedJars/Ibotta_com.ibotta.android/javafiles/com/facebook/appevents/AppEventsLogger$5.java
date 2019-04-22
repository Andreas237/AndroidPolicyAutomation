// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import com.facebook.internal.FetchedAppSettingsManager;
import java.util.*;

// Referenced classes of package com.facebook.appevents:
//			AppEventsLogger, AppEventQueue, AccessTokenAppIdPair

static final class AppEventsLogger$5
	implements Runnable
{

	public void run()
	{
		Object obj = ((Object) (new HashSet()));
	//    0    0:new             #18  <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void HashSet()>
	//    3    7:astore_1        
		for(Iterator iterator = AppEventQueue.getKeySet().iterator(); iterator.hasNext(); ((Set) (obj)).add(((Object) (((AccessTokenAppIdPair)iterator.next()).getApplicationId()))));
	//    4    8:invokestatic    #25  <Method Set AppEventQueue.getKeySet()>
	//    5   11:invokeinterface #31  <Method Iterator Set.iterator()>
	//    6   16:astore_2        
	//    7   17:aload_2         
	//    8   18:invokeinterface #37  <Method boolean Iterator.hasNext()>
	//    9   23:ifeq            48
	//   10   26:aload_1         
	//   11   27:aload_2         
	//   12   28:invokeinterface #41  <Method Object Iterator.next()>
	//   13   33:checkcast       #43  <Class AccessTokenAppIdPair>
	//   14   36:invokevirtual   #47  <Method String AccessTokenAppIdPair.getApplicationId()>
	//   15   39:invokeinterface #51  <Method boolean Set.add(Object)>
	//   16   44:pop             
	//*  17   45:goto            17
		for(obj = ((Object) (((Set) (obj)).iterator())); ((Iterator) (obj)).hasNext(); FetchedAppSettingsManager.queryAppSettings((String)((Iterator) (obj)).next(), true));
	//   18   48:aload_1         
	//   19   49:invokeinterface #31  <Method Iterator Set.iterator()>
	//   20   54:astore_1        
	//   21   55:aload_1         
	//   22   56:invokeinterface #37  <Method boolean Iterator.hasNext()>
	//   23   61:ifeq            81
	//   24   64:aload_1         
	//   25   65:invokeinterface #41  <Method Object Iterator.next()>
	//   26   70:checkcast       #53  <Class String>
	//   27   73:iconst_1        
	//   28   74:invokestatic    #59  <Method com.facebook.internal.FetchedAppSettings FetchedAppSettingsManager.queryAppSettings(String, boolean)>
	//   29   77:pop             
	//*  30   78:goto            55
	//   31   81:return          
	}

	AppEventsLogger$5()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
