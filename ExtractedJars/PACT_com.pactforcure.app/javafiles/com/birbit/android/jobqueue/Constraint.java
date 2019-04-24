// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import java.util.*;

// Referenced classes of package com.birbit.android.jobqueue:
//			TagConstraint

public class Constraint
{

	public Constraint()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #27  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void HashSet()>
	//    6   12:putfield        #30  <Field Set tags>
	//    7   15:aload_0         
	//    8   16:new             #32  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #33  <Method void ArrayList()>
	//   11   23:putfield        #35  <Field List excludeGroups>
	//   12   26:aload_0         
	//   13   27:new             #32  <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #33  <Method void ArrayList()>
	//   16   34:putfield        #37  <Field List excludeJobIds>
	//   17   37:return          
	}

	void clear()
	{
		maxNetworkType = 2;
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:putfield        #41  <Field int maxNetworkType>
		tagConstraint = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #43  <Field TagConstraint tagConstraint>
		tags.clear();
	//    6   10:aload_0         
	//    7   11:getfield        #30  <Field Set tags>
	//    8   14:invokeinterface #47  <Method void Set.clear()>
		excludeGroups.clear();
	//    9   19:aload_0         
	//   10   20:getfield        #35  <Field List excludeGroups>
	//   11   23:invokeinterface #50  <Method void List.clear()>
		excludeJobIds.clear();
	//   12   28:aload_0         
	//   13   29:getfield        #37  <Field List excludeJobIds>
	//   14   32:invokeinterface #50  <Method void List.clear()>
		excludeRunning = false;
	//   15   37:aload_0         
	//   16   38:iconst_0        
	//   17   39:putfield        #52  <Field boolean excludeRunning>
		timeLimit = null;
	//   18   42:aload_0         
	//   19   43:aconst_null     
	//   20   44:putfield        #54  <Field Long timeLimit>
		nowInNs = 0x0L;
	//   21   47:aload_0         
	//   22   48:ldc2w           #55  <Long 0x0L>
	//   23   51:putfield        #58  <Field long nowInNs>
	//   24   54:return          
	}

	public boolean excludeRunning()
	{
		return excludeRunning;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field boolean excludeRunning>
	//    2    4:ireturn         
	}

	public List getExcludeGroups()
	{
		return excludeGroups;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List excludeGroups>
	//    2    4:areturn         
	}

	public List getExcludeJobIds()
	{
		return excludeJobIds;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field List excludeJobIds>
	//    2    4:areturn         
	}

	public int getMaxNetworkType()
	{
		return maxNetworkType;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int maxNetworkType>
	//    2    4:ireturn         
	}

	public long getNowInNs()
	{
		return nowInNs;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field long nowInNs>
	//    2    4:lreturn         
	}

	public TagConstraint getTagConstraint()
	{
		return tagConstraint;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field TagConstraint tagConstraint>
	//    2    4:areturn         
	}

	public Set getTags()
	{
		return tags;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Set tags>
	//    2    4:areturn         
	}

	public Long getTimeLimit()
	{
		return timeLimit;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field Long timeLimit>
	//    2    4:areturn         
	}

	void setExcludeGroups(Collection collection)
	{
		excludeGroups.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List excludeGroups>
	//    2    4:invokeinterface #50  <Method void List.clear()>
		if(collection != null)
	//*   3    9:aload_1         
	//*   4   10:ifnull          24
			excludeGroups.addAll(collection);
	//    5   13:aload_0         
	//    6   14:getfield        #35  <Field List excludeGroups>
	//    7   17:aload_1         
	//    8   18:invokeinterface #81  <Method boolean List.addAll(Collection)>
	//    9   23:pop             
	//   10   24:return          
	}

	void setExcludeJobIds(Collection collection)
	{
		excludeJobIds.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field List excludeJobIds>
	//    2    4:invokeinterface #50  <Method void List.clear()>
		if(collection != null)
	//*   3    9:aload_1         
	//*   4   10:ifnull          24
			excludeJobIds.addAll(collection);
	//    5   13:aload_0         
	//    6   14:getfield        #37  <Field List excludeJobIds>
	//    7   17:aload_1         
	//    8   18:invokeinterface #81  <Method boolean List.addAll(Collection)>
	//    9   23:pop             
	//   10   24:return          
	}

	void setExcludeRunning(boolean flag)
	{
		excludeRunning = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #52  <Field boolean excludeRunning>
	//    3    5:return          
	}

	void setMaxNetworkType(int i)
	{
		maxNetworkType = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #41  <Field int maxNetworkType>
	//    3    5:return          
	}

	public void setNowInNs(long l)
	{
		nowInNs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #58  <Field long nowInNs>
	//    3    5:return          
	}

	void setTagConstraint(TagConstraint tagconstraint)
	{
		tagConstraint = tagconstraint;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field TagConstraint tagConstraint>
	//    3    5:return          
	}

	void setTags(String as[])
	{
		tags.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Set tags>
	//    2    4:invokeinterface #47  <Method void Set.clear()>
		if(as != null)
	//*   3    9:aload_1         
	//*   4   10:ifnull          22
			Collections.addAll(((Collection) (tags)), ((Object []) (as)));
	//    5   13:aload_0         
	//    6   14:getfield        #30  <Field Set tags>
	//    7   17:aload_1         
	//    8   18:invokestatic    #98  <Method boolean Collections.addAll(Collection, Object[])>
	//    9   21:pop             
	//   10   22:return          
	}

	void setTimeLimit(Long long1)
	{
		timeLimit = long1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field Long timeLimit>
	//    3    5:return          
	}

	private final List excludeGroups = new ArrayList();
	private final List excludeJobIds = new ArrayList();
	private boolean excludeRunning;
	private int maxNetworkType;
	private long nowInNs;
	private TagConstraint tagConstraint;
	private final Set tags = new HashSet();
	private Long timeLimit;
}
