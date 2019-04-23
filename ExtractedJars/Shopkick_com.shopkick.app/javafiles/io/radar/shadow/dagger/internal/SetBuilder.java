// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.shadow.dagger.internal;

import java.util.*;

// Referenced classes of package io.radar.shadow.dagger.internal:
//			Preconditions

public final class SetBuilder
{

	private SetBuilder(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		contributions = ((List) (new ArrayList(i)));
	//    2    4:aload_0         
	//    3    5:new             #19  <Class ArrayList>
	//    4    8:dup             
	//    5    9:iload_1         
	//    6   10:invokespecial   #21  <Method void ArrayList(int)>
	//    7   13:putfield        #23  <Field List contributions>
	//    8   16:return          
	}

	public static SetBuilder newSetBuilder(int i)
	{
		return new SetBuilder(i);
	//    0    0:new             #2   <Class SetBuilder>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:invokespecial   #27  <Method void SetBuilder(int)>
	//    4    8:areturn         
	}

	public SetBuilder add(Object obj)
	{
		contributions.add(Preconditions.checkNotNull(obj, "Set contributions cannot be null"));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field List contributions>
	//    2    4:aload_1         
	//    3    5:ldc1            #9   <String "Set contributions cannot be null">
	//    4    7:invokestatic    #37  <Method Object Preconditions.checkNotNull(Object, String)>
	//    5   10:invokeinterface #42  <Method boolean List.add(Object)>
	//    6   15:pop             
		return this;
	//    7   16:aload_0         
	//    8   17:areturn         
	}

	public SetBuilder addAll(Collection collection)
	{
		for(Iterator iterator = collection.iterator(); iterator.hasNext(); Preconditions.checkNotNull(iterator.next(), "Set contributions cannot be null"));
	//    0    0:aload_1         
	//    1    1:invokeinterface #51  <Method Iterator Collection.iterator()>
	//    2    6:astore_2        
	//    3    7:aload_2         
	//    4    8:invokeinterface #57  <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            31
	//    6   16:aload_2         
	//    7   17:invokeinterface #61  <Method Object Iterator.next()>
	//    8   22:ldc1            #9   <String "Set contributions cannot be null">
	//    9   24:invokestatic    #37  <Method Object Preconditions.checkNotNull(Object, String)>
	//   10   27:pop             
	//*  11   28:goto            7
		contributions.addAll(collection);
	//   12   31:aload_0         
	//   13   32:getfield        #23  <Field List contributions>
	//   14   35:aload_1         
	//   15   36:invokeinterface #64  <Method boolean List.addAll(Collection)>
	//   16   41:pop             
		return this;
	//   17   42:aload_0         
	//   18   43:areturn         
	}

	public Set build()
	{
		switch(contributions.size())
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field List contributions>
	//*   2    4:invokeinterface #71  <Method int List.size()>
		{
	//*   3    9:tableswitch     0 1: default 32
	//	               0 61
	//	               1 47
		default:
			return Collections.unmodifiableSet(((Set) (new HashSet(((Collection) (contributions))))));
	//    4   32:new             #73  <Class HashSet>
	//    5   35:dup             
	//    6   36:aload_0         
	//    7   37:getfield        #23  <Field List contributions>
	//    8   40:invokespecial   #76  <Method void HashSet(Collection)>
	//    9   43:invokestatic    #82  <Method Set Collections.unmodifiableSet(Set)>
	//   10   46:areturn         

		case 1: // '\001'
			return Collections.singleton(contributions.get(0));
	//   11   47:aload_0         
	//   12   48:getfield        #23  <Field List contributions>
	//   13   51:iconst_0        
	//   14   52:invokeinterface #86  <Method Object List.get(int)>
	//   15   57:invokestatic    #90  <Method Set Collections.singleton(Object)>
	//   16   60:areturn         

		case 0: // '\0'
			return Collections.emptySet();
	//   17   61:invokestatic    #93  <Method Set Collections.emptySet()>
	//   18   64:areturn         
		}
	}

	private static final String SET_CONTRIBUTIONS_CANNOT_BE_NULL = "Set contributions cannot be null";
	private final List contributions;
}
