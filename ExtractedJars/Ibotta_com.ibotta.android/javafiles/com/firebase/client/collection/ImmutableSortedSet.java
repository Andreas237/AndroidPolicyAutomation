// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.collection;

import java.util.*;

// Referenced classes of package com.firebase.client.collection:
//			ImmutableSortedMap

public class ImmutableSortedSet
	implements Iterable
{
	private static class WrappedEntryIterator
		implements Iterator
	{

		public boolean hasNext()
		{
			return iterator.hasNext();
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field Iterator iterator>
		//    2    4:invokeinterface #27  <Method boolean Iterator.hasNext()>
		//    3    9:ireturn         
		}

		public Object next()
		{
			return ((java.util.Map.Entry)iterator.next()).getKey();
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field Iterator iterator>
		//    2    4:invokeinterface #31  <Method Object Iterator.next()>
		//    3    9:checkcast       #33  <Class java.util.Map$Entry>
		//    4   12:invokeinterface #36  <Method Object java.util.Map$Entry.getKey()>
		//    5   17:areturn         
		}

		public void remove()
		{
			iterator.remove();
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field Iterator iterator>
		//    2    4:invokeinterface #40  <Method void Iterator.remove()>
		//    3    9:return          
		}

		final Iterator iterator;

		public WrappedEntryIterator(Iterator iterator1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			iterator = iterator1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field Iterator iterator>
		//    5    9:return          
		}
	}


	private ImmutableSortedSet(ImmutableSortedMap immutablesortedmap)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		map = immutablesortedmap;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field ImmutableSortedMap map>
	//    5    9:return          
	}

	public ImmutableSortedSet(List list, Comparator comparator)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		map = ImmutableSortedMap.Builder.buildFrom(list, Collections.emptyMap(), ImmutableSortedMap.Builder.identityTranslator(), comparator);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #30  <Method java.util.Map Collections.emptyMap()>
	//    5    9:invokestatic    #36  <Method ImmutableSortedMap$Builder$KeyTranslator ImmutableSortedMap$Builder.identityTranslator()>
	//    6   12:aload_2         
	//    7   13:invokestatic    #40  <Method ImmutableSortedMap ImmutableSortedMap$Builder.buildFrom(List, java.util.Map, ImmutableSortedMap$Builder$KeyTranslator, Comparator)>
	//    8   16:putfield        #20  <Field ImmutableSortedMap map>
	//    9   19:return          
	}

	public boolean contains(Object obj)
	{
		return map.containsKey(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ImmutableSortedMap map>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #48  <Method boolean ImmutableSortedMap.containsKey(Object)>
	//    4    8:ireturn         
	}

	public Object getMaxEntry()
	{
		return map.getMaxKey();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ImmutableSortedMap map>
	//    2    4:invokevirtual   #54  <Method Object ImmutableSortedMap.getMaxKey()>
	//    3    7:areturn         
	}

	public Object getMinEntry()
	{
		return map.getMinKey();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ImmutableSortedMap map>
	//    2    4:invokevirtual   #59  <Method Object ImmutableSortedMap.getMinKey()>
	//    3    7:areturn         
	}

	public Object getPredecessorEntry(Object obj)
	{
		return map.getPredecessorKey(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ImmutableSortedMap map>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #64  <Method Object ImmutableSortedMap.getPredecessorKey(Object)>
	//    4    8:areturn         
	}

	public ImmutableSortedSet insert(Object obj)
	{
		return new ImmutableSortedSet(map.insert(obj, ((Object) (null))));
	//    0    0:new             #2   <Class ImmutableSortedSet>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field ImmutableSortedMap map>
	//    4    8:aload_1         
	//    5    9:aconst_null     
	//    6   10:invokevirtual   #70  <Method ImmutableSortedMap ImmutableSortedMap.insert(Object, Object)>
	//    7   13:invokespecial   #72  <Method void ImmutableSortedSet(ImmutableSortedMap)>
	//    8   16:areturn         
	}

	public boolean isEmpty()
	{
		return map.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ImmutableSortedMap map>
	//    2    4:invokevirtual   #77  <Method boolean ImmutableSortedMap.isEmpty()>
	//    3    7:ireturn         
	}

	public Iterator iterator()
	{
		return ((Iterator) (new WrappedEntryIterator(map.iterator())));
	//    0    0:new             #9   <Class ImmutableSortedSet$WrappedEntryIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field ImmutableSortedMap map>
	//    4    8:invokevirtual   #81  <Method Iterator ImmutableSortedMap.iterator()>
	//    5   11:invokespecial   #84  <Method void ImmutableSortedSet$WrappedEntryIterator(Iterator)>
	//    6   14:areturn         
	}

	public Iterator iteratorFrom(Object obj)
	{
		return ((Iterator) (new WrappedEntryIterator(map.iteratorFrom(obj))));
	//    0    0:new             #9   <Class ImmutableSortedSet$WrappedEntryIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field ImmutableSortedMap map>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #89  <Method Iterator ImmutableSortedMap.iteratorFrom(Object)>
	//    6   12:invokespecial   #84  <Method void ImmutableSortedSet$WrappedEntryIterator(Iterator)>
	//    7   15:areturn         
	}

	public ImmutableSortedSet remove(Object obj)
	{
		obj = ((Object) (map.remove(obj)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ImmutableSortedMap map>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #94  <Method ImmutableSortedMap ImmutableSortedMap.remove(Object)>
	//    4    8:astore_1        
		if(obj == map)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #20  <Field ImmutableSortedMap map>
	//*   8   14:if_acmpne       19
			return this;
	//    9   17:aload_0         
	//   10   18:areturn         
		else
			return new ImmutableSortedSet(((ImmutableSortedMap) (obj)));
	//   11   19:new             #2   <Class ImmutableSortedSet>
	//   12   22:dup             
	//   13   23:aload_1         
	//   14   24:invokespecial   #72  <Method void ImmutableSortedSet(ImmutableSortedMap)>
	//   15   27:areturn         
	}

	public Iterator reverseIterator()
	{
		return ((Iterator) (new WrappedEntryIterator(map.reverseIterator())));
	//    0    0:new             #9   <Class ImmutableSortedSet$WrappedEntryIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field ImmutableSortedMap map>
	//    4    8:invokevirtual   #97  <Method Iterator ImmutableSortedMap.reverseIterator()>
	//    5   11:invokespecial   #84  <Method void ImmutableSortedSet$WrappedEntryIterator(Iterator)>
	//    6   14:areturn         
	}

	public Iterator reverseIteratorFrom(Object obj)
	{
		return ((Iterator) (new WrappedEntryIterator(map.reverseIteratorFrom(obj))));
	//    0    0:new             #9   <Class ImmutableSortedSet$WrappedEntryIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field ImmutableSortedMap map>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #100 <Method Iterator ImmutableSortedMap.reverseIteratorFrom(Object)>
	//    6   12:invokespecial   #84  <Method void ImmutableSortedSet$WrappedEntryIterator(Iterator)>
	//    7   15:areturn         
	}

	public int size()
	{
		return map.size();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ImmutableSortedMap map>
	//    2    4:invokevirtual   #104 <Method int ImmutableSortedMap.size()>
	//    3    7:ireturn         
	}

	private final ImmutableSortedMap map;
}
