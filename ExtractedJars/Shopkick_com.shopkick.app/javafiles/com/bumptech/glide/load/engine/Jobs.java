// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import java.util.*;

// Referenced classes of package com.bumptech.glide.load.engine:
//			EngineJob

final class Jobs
{

	Jobs()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #14  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #15  <Method void HashMap()>
	//    6   12:putfield        #17  <Field Map jobs>
	//    7   15:aload_0         
	//    8   16:new             #14  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #15  <Method void HashMap()>
	//   11   23:putfield        #19  <Field Map onlyCacheJobs>
	//   12   26:return          
	}

	private Map getJobMap(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            9
			return onlyCacheJobs;
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field Map onlyCacheJobs>
	//    4    8:areturn         
		else
			return jobs;
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field Map jobs>
	//    7   13:areturn         
	}

	EngineJob get(Key key, boolean flag)
	{
		return (EngineJob)getJobMap(flag).get(((Object) (key)));
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokespecial   #28  <Method Map getJobMap(boolean)>
	//    3    5:aload_1         
	//    4    6:invokeinterface #33  <Method Object Map.get(Object)>
	//    5   11:checkcast       #35  <Class EngineJob>
	//    6   14:areturn         
	}

	Map getAll()
	{
		return Collections.unmodifiableMap(jobs);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Map jobs>
	//    2    4:invokestatic    #45  <Method Map Collections.unmodifiableMap(Map)>
	//    3    7:areturn         
	}

	void put(Key key, EngineJob enginejob)
	{
		getJobMap(enginejob.onlyRetrieveFromCache()).put(((Object) (key)), ((Object) (enginejob)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #53  <Method boolean EngineJob.onlyRetrieveFromCache()>
	//    3    5:invokespecial   #28  <Method Map getJobMap(boolean)>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #56  <Method Object Map.put(Object, Object)>
	//    7   15:pop             
	//    8   16:return          
	}

	void removeIfCurrent(Key key, EngineJob enginejob)
	{
		Map map = getJobMap(enginejob.onlyRetrieveFromCache());
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #53  <Method boolean EngineJob.onlyRetrieveFromCache()>
	//    3    5:invokespecial   #28  <Method Map getJobMap(boolean)>
	//    4    8:astore_3        
		if(((Object) (enginejob)).equals(map.get(((Object) (key)))))
	//*   5    9:aload_2         
	//*   6   10:aload_3         
	//*   7   11:aload_1         
	//*   8   12:invokeinterface #33  <Method Object Map.get(Object)>
	//*   9   17:invokevirtual   #62  <Method boolean Object.equals(Object)>
	//*  10   20:ifeq            31
			map.remove(((Object) (key)));
	//   11   23:aload_3         
	//   12   24:aload_1         
	//   13   25:invokeinterface #65  <Method Object Map.remove(Object)>
	//   14   30:pop             
	//   15   31:return          
	}

	private final Map jobs = new HashMap();
	private final Map onlyCacheJobs = new HashMap();
}
