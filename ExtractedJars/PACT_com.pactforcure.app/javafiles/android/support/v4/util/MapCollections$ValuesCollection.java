// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.util;

import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package android.support.v4.util:
//			MapCollections

final class MapCollections$ValuesCollection
	implements Collection
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
		return colIndexOfValue(obj) >= 0;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MapCollections this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #39  <Method int MapCollections.colIndexOfValue(Object)>
	//    4    8:iflt            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
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
	//*   9   23:invokevirtual   #56  <Method boolean contains(Object)>
	//*  10   26:ifne            7
				return false;
	//   11   29:iconst_0        
	//   12   30:ireturn         

		return true;
	//   13   31:iconst_1        
	//   14   32:ireturn         
	}

	public boolean isEmpty()
	{
		return colGetSize() == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MapCollections this$0>
	//    2    4:invokevirtual   #62  <Method int MapCollections.colGetSize()>
	//    3    7:ifne            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public Iterator iterator()
	{
		return ((Iterator) (new MapCollections.ArrayIterator(MapCollections.this, 1)));
	//    0    0:new             #64  <Class MapCollections$ArrayIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field MapCollections this$0>
	//    4    8:iconst_1        
	//    5    9:invokespecial   #67  <Method void MapCollections$ArrayIterator(MapCollections, int)>
	//    6   12:areturn         
	}

	public boolean remove(Object obj)
	{
		int i = colIndexOfValue(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MapCollections this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #39  <Method int MapCollections.colIndexOfValue(Object)>
	//    4    8:istore_2        
		if(i >= 0)
	//*   5    9:iload_2         
	//*   6   10:iflt            23
		{
			colRemoveAt(i);
	//    7   13:aload_0         
	//    8   14:getfield        #16  <Field MapCollections this$0>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #73  <Method void MapCollections.colRemoveAt(int)>
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
		int j = colGetSize();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MapCollections this$0>
	//    2    4:invokevirtual   #62  <Method int MapCollections.colGetSize()>
	//    3    7:istore_3        
		boolean flag = false;
	//    4    8:iconst_0        
	//    5    9:istore          6
		int k;
		for(int i = 0; i < j; j = k)
	//*   6   11:iconst_0        
	//*   7   12:istore_2        
	//*   8   13:iload_2         
	//*   9   14:iload_3         
	//*  10   15:icmpge          74
		{
			k = j;
	//   11   18:iload_3         
	//   12   19:istore          4
			int l = i;
	//   13   21:iload_2         
	//   14   22:istore          5
			if(collection.contains(colGetEntry(i, 1)))
	//*  15   24:aload_1         
	//*  16   25:aload_0         
	//*  17   26:getfield        #16  <Field MapCollections this$0>
	//*  18   29:iload_2         
	//*  19   30:iconst_1        
	//*  20   31:invokevirtual   #78  <Method Object MapCollections.colGetEntry(int, int)>
	//*  21   34:invokeinterface #79  <Method boolean Collection.contains(Object)>
	//*  22   39:ifeq            63
			{
				colRemoveAt(i);
	//   23   42:aload_0         
	//   24   43:getfield        #16  <Field MapCollections this$0>
	//   25   46:iload_2         
	//   26   47:invokevirtual   #73  <Method void MapCollections.colRemoveAt(int)>
				l = i - 1;
	//   27   50:iload_2         
	//   28   51:iconst_1        
	//   29   52:isub            
	//   30   53:istore          5
				k = j - 1;
	//   31   55:iload_3         
	//   32   56:iconst_1        
	//   33   57:isub            
	//   34   58:istore          4
				flag = true;
	//   35   60:iconst_1        
	//   36   61:istore          6
			}
			i = l + 1;
	//   37   63:iload           5
	//   38   65:iconst_1        
	//   39   66:iadd            
	//   40   67:istore_2        
		}

	//   41   68:iload           4
	//   42   70:istore_3        
	//*  43   71:goto            13
		return flag;
	//   44   74:iload           6
	//   45   76:ireturn         
	}

	public boolean retainAll(Collection collection)
	{
		int j = colGetSize();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MapCollections this$0>
	//    2    4:invokevirtual   #62  <Method int MapCollections.colGetSize()>
	//    3    7:istore_3        
		boolean flag = false;
	//    4    8:iconst_0        
	//    5    9:istore          6
		int k;
		for(int i = 0; i < j; j = k)
	//*   6   11:iconst_0        
	//*   7   12:istore_2        
	//*   8   13:iload_2         
	//*   9   14:iload_3         
	//*  10   15:icmpge          74
		{
			k = j;
	//   11   18:iload_3         
	//   12   19:istore          4
			int l = i;
	//   13   21:iload_2         
	//   14   22:istore          5
			if(!collection.contains(colGetEntry(i, 1)))
	//*  15   24:aload_1         
	//*  16   25:aload_0         
	//*  17   26:getfield        #16  <Field MapCollections this$0>
	//*  18   29:iload_2         
	//*  19   30:iconst_1        
	//*  20   31:invokevirtual   #78  <Method Object MapCollections.colGetEntry(int, int)>
	//*  21   34:invokeinterface #79  <Method boolean Collection.contains(Object)>
	//*  22   39:ifne            63
			{
				colRemoveAt(i);
	//   23   42:aload_0         
	//   24   43:getfield        #16  <Field MapCollections this$0>
	//   25   46:iload_2         
	//   26   47:invokevirtual   #73  <Method void MapCollections.colRemoveAt(int)>
				l = i - 1;
	//   27   50:iload_2         
	//   28   51:iconst_1        
	//   29   52:isub            
	//   30   53:istore          5
				k = j - 1;
	//   31   55:iload_3         
	//   32   56:iconst_1        
	//   33   57:isub            
	//   34   58:istore          4
				flag = true;
	//   35   60:iconst_1        
	//   36   61:istore          6
			}
			i = l + 1;
	//   37   63:iload           5
	//   38   65:iconst_1        
	//   39   66:iadd            
	//   40   67:istore_2        
		}

	//   41   68:iload           4
	//   42   70:istore_3        
	//*  43   71:goto            13
		return flag;
	//   44   74:iload           6
	//   45   76:ireturn         
	}

	public int size()
	{
		return colGetSize();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MapCollections this$0>
	//    2    4:invokevirtual   #62  <Method int MapCollections.colGetSize()>
	//    3    7:ireturn         
	}

	public Object[] toArray()
	{
		return toArrayHelper(1);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MapCollections this$0>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #87  <Method Object[] MapCollections.toArrayHelper(int)>
	//    4    8:areturn         
	}

	public Object[] toArray(Object aobj[])
	{
		return toArrayHelper(aobj, 1);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MapCollections this$0>
	//    2    4:aload_1         
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #91  <Method Object[] MapCollections.toArrayHelper(Object[], int)>
	//    5    9:areturn         
	}

	final MapCollections this$0;

	MapCollections$ValuesCollection()
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
