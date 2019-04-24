// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.spi;

import ch.qos.logback.core.filter.Filter;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package ch.qos.logback.core.spi:
//			FilterAttachable, FilterReply

public final class FilterAttachableImpl
	implements FilterAttachable
{

	public FilterAttachableImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		filterList = new CopyOnWriteArrayList();
	//    2    4:aload_0         
	//    3    5:new             #16  <Class CopyOnWriteArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void CopyOnWriteArrayList()>
	//    6   12:putfield        #19  <Field CopyOnWriteArrayList filterList>
	//    7   15:return          
	}

	public void addFilter(Filter filter)
	{
		filterList.add(((Object) (filter)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field CopyOnWriteArrayList filterList>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #26  <Method boolean CopyOnWriteArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void clearAllFilters()
	{
		filterList.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field CopyOnWriteArrayList filterList>
	//    2    4:invokevirtual   #32  <Method void CopyOnWriteArrayList.clear()>
	//    3    7:return          
	}

	public List getCopyOfAttachedFiltersList()
	{
		return ((List) (new ArrayList(((java.util.Collection) (filterList)))));
	//    0    0:new             #36  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field CopyOnWriteArrayList filterList>
	//    4    8:invokespecial   #39  <Method void ArrayList(java.util.Collection)>
	//    5   11:areturn         
	}

	public FilterReply getFilterChainDecision(Object obj)
	{
		for(Iterator iterator = filterList.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field CopyOnWriteArrayList filterList>
	//*   2    4:invokevirtual   #46  <Method Iterator CopyOnWriteArrayList.iterator()>
	//*   3    7:astore_2        
	//*   4    8:aload_2         
	//*   5    9:invokeinterface #52  <Method boolean Iterator.hasNext()>
	//*   6   14:ifeq            47
		{
			FilterReply filterreply = ((Filter)iterator.next()).decide(obj);
	//    7   17:aload_2         
	//    8   18:invokeinterface #56  <Method Object Iterator.next()>
	//    9   23:checkcast       #58  <Class Filter>
	//   10   26:aload_1         
	//   11   27:invokevirtual   #61  <Method FilterReply Filter.decide(Object)>
	//   12   30:astore_3        
			if(filterreply == FilterReply.DENY || filterreply == FilterReply.ACCEPT)
	//*  13   31:aload_3         
	//*  14   32:getstatic       #67  <Field FilterReply FilterReply.DENY>
	//*  15   35:if_acmpeq       45
	//*  16   38:aload_3         
	//*  17   39:getstatic       #70  <Field FilterReply FilterReply.ACCEPT>
	//*  18   42:if_acmpne       8
				return filterreply;
	//   19   45:aload_3         
	//   20   46:areturn         
		}

		return FilterReply.NEUTRAL;
	//   21   47:getstatic       #73  <Field FilterReply FilterReply.NEUTRAL>
	//   22   50:areturn         
	}

	CopyOnWriteArrayList filterList;
}
