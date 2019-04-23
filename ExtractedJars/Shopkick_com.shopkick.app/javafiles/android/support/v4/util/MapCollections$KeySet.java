// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.util;

import java.util.*;

// Referenced classes of package android.support.v4.util:
//			MapCollections

final class MapCollections$KeySet
	implements Set
{

	public boolean add(Object obj)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #24  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public boolean addAll(Collection collection)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #24  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public void clear()
	{
		colClear();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MapCollections this$0>
	//    2    4:invokevirtual   #34  <Method void MapCollections.colClear()>
	//    3    7:return          
	}

	public boolean contains(Object obj)
	{
		return colIndexOfKey(obj) >= 0;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MapCollections this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #39  <Method int MapCollections.colIndexOfKey(Object)>
	//    4    8:iflt            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public boolean containsAll(Collection collection)
	{
		return MapCollections.containsAllHelper(colGetMap(), collection);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MapCollections this$0>
	//    2    4:invokevirtual   #44  <Method java.util.Map MapCollections.colGetMap()>
	//    3    7:aload_1         
	//    4    8:invokestatic    #48  <Method boolean MapCollections.containsAllHelper(java.util.Map, Collection)>
	//    5   11:ireturn         
	}

	public boolean equals(Object obj)
	{
		return MapCollections.equalsSetHelper(((Set) (this)), obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #54  <Method boolean MapCollections.equalsSetHelper(Set, Object)>
	//    3    5:ireturn         
	}

	public int hashCode()
	{
		int i = colGetSize() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MapCollections this$0>
	//    2    4:invokevirtual   #59  <Method int MapCollections.colGetSize()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_1        
		int j = 0;
	//    6   10:iconst_0        
	//    7   11:istore_2        
		for(; i >= 0; i--)
	//*   8   12:iload_1         
	//*   9   13:iflt            54
		{
			Object obj = colGetEntry(i, 0);
	//   10   16:aload_0         
	//   11   17:getfield        #16  <Field MapCollections this$0>
	//   12   20:iload_1         
	//   13   21:iconst_0        
	//   14   22:invokevirtual   #63  <Method Object MapCollections.colGetEntry(int, int)>
	//   15   25:astore          4
			int k;
			if(obj == null)
	//*  16   27:aload           4
	//*  17   29:ifnonnull       37
				k = 0;
	//   18   32:iconst_0        
	//   19   33:istore_3        
			else
	//*  20   34:goto            43
				k = obj.hashCode();
	//   21   37:aload           4
	//   22   39:invokevirtual   #65  <Method int Object.hashCode()>
	//   23   42:istore_3        
			j += k;
	//   24   43:iload_2         
	//   25   44:iload_3         
	//   26   45:iadd            
	//   27   46:istore_2        
		}

	//   28   47:iload_1         
	//   29   48:iconst_1        
	//   30   49:isub            
	//   31   50:istore_1        
	//*  32   51:goto            12
		return j;
	//   33   54:iload_2         
	//   34   55:ireturn         
	}

	public boolean isEmpty()
	{
		return colGetSize() == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MapCollections this$0>
	//    2    4:invokevirtual   #59  <Method int MapCollections.colGetSize()>
	//    3    7:ifne            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public Iterator iterator()
	{
		return ((Iterator) (new erator(MapCollections.this, 0)));
	//    0    0:new             #71  <Class MapCollections$ArrayIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field MapCollections this$0>
	//    4    8:iconst_0        
	//    5    9:invokespecial   #74  <Method void MapCollections$ArrayIterator(MapCollections, int)>
	//    6   12:areturn         
	}

	public boolean remove(Object obj)
	{
		int i = colIndexOfKey(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MapCollections this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #39  <Method int MapCollections.colIndexOfKey(Object)>
	//    4    8:istore_2        
		if(i >= 0)
	//*   5    9:iload_2         
	//*   6   10:iflt            23
		{
			colRemoveAt(i);
	//    7   13:aload_0         
	//    8   14:getfield        #16  <Field MapCollections this$0>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #80  <Method void MapCollections.colRemoveAt(int)>
			return true;
	//   11   21:iconst_1        
	//   12   22:ireturn         
		} else
		{
			return false;
	//   13   23:iconst_0        
	//   14   24:ireturn         
		}
	}

	public boolean removeAll(Collection collection)
	{
		return MapCollections.removeAllHelper(colGetMap(), collection);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MapCollections this$0>
	//    2    4:invokevirtual   #44  <Method java.util.Map MapCollections.colGetMap()>
	//    3    7:aload_1         
	//    4    8:invokestatic    #84  <Method boolean MapCollections.removeAllHelper(java.util.Map, Collection)>
	//    5   11:ireturn         
	}

	public boolean retainAll(Collection collection)
	{
		return MapCollections.retainAllHelper(colGetMap(), collection);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MapCollections this$0>
	//    2    4:invokevirtual   #44  <Method java.util.Map MapCollections.colGetMap()>
	//    3    7:aload_1         
	//    4    8:invokestatic    #88  <Method boolean MapCollections.retainAllHelper(java.util.Map, Collection)>
	//    5   11:ireturn         
	}

	public int size()
	{
		return colGetSize();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MapCollections this$0>
	//    2    4:invokevirtual   #59  <Method int MapCollections.colGetSize()>
	//    3    7:ireturn         
	}

	public Object[] toArray()
	{
		return toArrayHelper(0);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MapCollections this$0>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #95  <Method Object[] MapCollections.toArrayHelper(int)>
	//    4    8:areturn         
	}

	public Object[] toArray(Object aobj[])
	{
		return toArrayHelper(aobj, 0);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MapCollections this$0>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #99  <Method Object[] MapCollections.toArrayHelper(Object[], int)>
	//    5    9:areturn         
	}

	final MapCollections this$0;

	MapCollections$KeySet()
	{
		this$0 = MapCollections.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field MapCollections this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
