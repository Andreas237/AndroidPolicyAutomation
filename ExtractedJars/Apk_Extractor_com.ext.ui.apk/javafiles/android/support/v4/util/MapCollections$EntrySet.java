// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.util;

import java.util.*;

// Referenced classes of package android.support.v4.util:
//			MapCollections, ContainerHelpers

final class MapCollections$EntrySet
	implements Set
{

	public volatile boolean add(Object obj)
	{
		return add((java.util.Map.Entry)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #24  <Class java.util.Map$Entry>
	//    3    5:invokevirtual   #27  <Method boolean add(java.util.Map$Entry)>
	//    4    8:ireturn         
	}

	public boolean add(java.util.Map.Entry entry)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #29  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public boolean addAll(Collection collection)
	{
		int i = colGetSize();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MapCollections this$0>
	//    2    4:invokevirtual   #38  <Method int MapCollections.colGetSize()>
	//    3    7:istore_2        
		java.util.Map.Entry entry;
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); colPut(entry.getKey(), entry.getValue()))
	//*   4    8:aload_1         
	//*   5    9:invokeinterface #44  <Method Iterator Collection.iterator()>
	//*   6   14:astore_1        
	//*   7   15:aload_1         
	//*   8   16:invokeinterface #50  <Method boolean Iterator.hasNext()>
	//*   9   21:ifeq            56
			entry = (java.util.Map.Entry)((Iterator) (collection)).next();
	//   10   24:aload_1         
	//   11   25:invokeinterface #54  <Method Object Iterator.next()>
	//   12   30:checkcast       #24  <Class java.util.Map$Entry>
	//   13   33:astore_3        

	//   14   34:aload_0         
	//   15   35:getfield        #16  <Field MapCollections this$0>
	//   16   38:aload_3         
	//   17   39:invokeinterface #57  <Method Object java.util.Map$Entry.getKey()>
	//   18   44:aload_3         
	//   19   45:invokeinterface #60  <Method Object java.util.Map$Entry.getValue()>
	//   20   50:invokevirtual   #64  <Method void MapCollections.colPut(Object, Object)>
	//*  21   53:goto            15
		return i != colGetSize();
	//   22   56:iload_2         
	//   23   57:aload_0         
	//   24   58:getfield        #16  <Field MapCollections this$0>
	//   25   61:invokevirtual   #38  <Method int MapCollections.colGetSize()>
	//   26   64:icmpeq          69
	//   27   67:iconst_1        
	//   28   68:ireturn         
	//   29   69:iconst_0        
	//   30   70:ireturn         
	}

	public void clear()
	{
		colClear();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MapCollections this$0>
	//    2    4:invokevirtual   #69  <Method void MapCollections.colClear()>
	//    3    7:return          
	}

	public boolean contains(Object obj)
	{
		if(obj instanceof java.util.Map.Entry)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #24  <Class java.util.Map$Entry>
	//*   2    4:ifne            9
	//*   3    7:iconst_0        
	//*   4    8:ireturn         
		{
			obj = ((Object) ((java.util.Map.Entry)obj));
	//    5    9:aload_1         
	//    6   10:checkcast       #24  <Class java.util.Map$Entry>
	//    7   13:astore_1        
			int i = colIndexOfKey(((java.util.Map.Entry) (obj)).getKey());
	//    8   14:aload_0         
	//    9   15:getfield        #16  <Field MapCollections this$0>
	//   10   18:aload_1         
	//   11   19:invokeinterface #57  <Method Object java.util.Map$Entry.getKey()>
	//   12   24:invokevirtual   #74  <Method int MapCollections.colIndexOfKey(Object)>
	//   13   27:istore_2        
			if(i >= 0)
	//*  14   28:iload_2         
	//*  15   29:iflt            7
				return ContainerHelpers.equal(colGetEntry(i, 1), ((java.util.Map.Entry) (obj)).getValue());
	//   16   32:aload_0         
	//   17   33:getfield        #16  <Field MapCollections this$0>
	//   18   36:iload_2         
	//   19   37:iconst_1        
	//   20   38:invokevirtual   #78  <Method Object MapCollections.colGetEntry(int, int)>
	//   21   41:aload_1         
	//   22   42:invokeinterface #60  <Method Object java.util.Map$Entry.getValue()>
	//   23   47:invokestatic    #84  <Method boolean ContainerHelpers.equal(Object, Object)>
	//   24   50:ireturn         
		}
		return false;
	}

	public boolean containsAll(Collection collection)
	{
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext();)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #44  <Method Iterator Collection.iterator()>
	//*   2    6:astore_1        
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #50  <Method boolean Iterator.hasNext()>
	//*   5   13:ifeq            31
			if(!contains(((Iterator) (collection)).next()))
	//*   6   16:aload_0         
	//*   7   17:aload_1         
	//*   8   18:invokeinterface #54  <Method Object Iterator.next()>
	//*   9   23:invokevirtual   #87  <Method boolean contains(Object)>
	//*  10   26:ifne            7
				return false;
	//   11   29:iconst_0        
	//   12   30:ireturn         

		return true;
	//   13   31:iconst_1        
	//   14   32:ireturn         
	}

	public boolean equals(Object obj)
	{
		return MapCollections.equalsSetHelper(((Set) (this)), obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #93  <Method boolean MapCollections.equalsSetHelper(Set, Object)>
	//    3    5:ireturn         
	}

	public int hashCode()
	{
		int j = colGetSize() - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MapCollections this$0>
	//    2    4:invokevirtual   #38  <Method int MapCollections.colGetSize()>
	//    3    7:iconst_1        
	//    4    8:isub            
	//    5    9:istore_2        
		int i = 0;
	//    6   10:iconst_0        
	//    7   11:istore_1        
		while(j >= 0) 
	//*   8   12:iload_2         
	//*   9   13:iflt            86
		{
			Object obj = colGetEntry(j, 0);
	//   10   16:aload_0         
	//   11   17:getfield        #16  <Field MapCollections this$0>
	//   12   20:iload_2         
	//   13   21:iconst_0        
	//   14   22:invokevirtual   #78  <Method Object MapCollections.colGetEntry(int, int)>
	//   15   25:astore          5
			Object obj1 = colGetEntry(j, 1);
	//   16   27:aload_0         
	//   17   28:getfield        #16  <Field MapCollections this$0>
	//   18   31:iload_2         
	//   19   32:iconst_1        
	//   20   33:invokevirtual   #78  <Method Object MapCollections.colGetEntry(int, int)>
	//   21   36:astore          6
			int k;
			int l;
			if(obj == null)
	//*  22   38:aload           5
	//*  23   40:ifnonnull       67
				k = 0;
	//   24   43:iconst_0        
	//   25   44:istore_3        
			else
	//*  26   45:aload           6
	//*  27   47:ifnonnull       76
	//*  28   50:iconst_0        
	//*  29   51:istore          4
	//*  30   53:iload_2         
	//*  31   54:iconst_1        
	//*  32   55:isub            
	//*  33   56:istore_2        
	//*  34   57:iload_1         
	//*  35   58:iload           4
	//*  36   60:iload_3         
	//*  37   61:ixor            
	//*  38   62:iadd            
	//*  39   63:istore_1        
	//*  40   64:goto            12
				k = obj.hashCode();
	//   41   67:aload           5
	//   42   69:invokevirtual   #96  <Method int Object.hashCode()>
	//   43   72:istore_3        
			if(obj1 == null)
				l = 0;
			else
	//*  44   73:goto            45
				l = obj1.hashCode();
	//   45   76:aload           6
	//   46   78:invokevirtual   #96  <Method int Object.hashCode()>
	//   47   81:istore          4
			j--;
			i += ((int) (l ^ k));
		}
	//*  48   83:goto            53
		return i;
	//   49   86:iload_1         
	//   50   87:ireturn         
	}

	public boolean isEmpty()
	{
		return colGetSize() == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MapCollections this$0>
	//    2    4:invokevirtual   #38  <Method int MapCollections.colGetSize()>
	//    3    7:ifne            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public Iterator iterator()
	{
		return ((Iterator) (new or(MapCollections.this)));
	//    0    0:new             #99  <Class MapCollections$MapIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field MapCollections this$0>
	//    4    8:invokespecial   #101 <Method void MapCollections$MapIterator(MapCollections)>
	//    5   11:areturn         
	}

	public boolean remove(Object obj)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #29  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public boolean removeAll(Collection collection)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #29  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public boolean retainAll(Collection collection)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #29  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public int size()
	{
		return colGetSize();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MapCollections this$0>
	//    2    4:invokevirtual   #38  <Method int MapCollections.colGetSize()>
	//    3    7:ireturn         
	}

	public Object[] toArray()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #29  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public Object[] toArray(Object aobj[])
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #29  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	final MapCollections this$0;

	MapCollections$EntrySet()
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
