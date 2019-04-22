// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.util;

import java.lang.reflect.Array;
import java.util.*;

// Referenced classes of package android.support.v4.util:
//			ContainerHelpers

abstract class MapCollections
{
	final class ArrayIterator
		implements Iterator
	{

		public boolean hasNext()
		{
			return mIndex < mSize;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field int mIndex>
		//    2    4:aload_0         
		//    3    5:getfield        #35  <Field int mSize>
		//    4    8:icmpge          13
		//    5   11:iconst_1        
		//    6   12:ireturn         
		//    7   13:iconst_0        
		//    8   14:ireturn         
		}

		public Object next()
		{
			if(hasNext())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #44  <Method boolean hasNext()>
		//*   2    4:ifeq            40
			{
				Object obj = colGetEntry(mIndex, mOffset);
		//    3    7:aload_0         
		//    4    8:getfield        #22  <Field MapCollections this$0>
		//    5   11:aload_0         
		//    6   12:getfield        #40  <Field int mIndex>
		//    7   15:aload_0         
		//    8   16:getfield        #29  <Field int mOffset>
		//    9   19:invokevirtual   #48  <Method Object MapCollections.colGetEntry(int, int)>
		//   10   22:astore_1        
				mIndex = mIndex + 1;
		//   11   23:aload_0         
		//   12   24:aload_0         
		//   13   25:getfield        #40  <Field int mIndex>
		//   14   28:iconst_1        
		//   15   29:iadd            
		//   16   30:putfield        #40  <Field int mIndex>
				mCanRemove = true;
		//   17   33:aload_0         
		//   18   34:iconst_1        
		//   19   35:putfield        #27  <Field boolean mCanRemove>
				return obj;
		//   20   38:aload_1         
		//   21   39:areturn         
			} else
			{
				throw new NoSuchElementException();
		//   22   40:new             #50  <Class NoSuchElementException>
		//   23   43:dup             
		//   24   44:invokespecial   #51  <Method void NoSuchElementException()>
		//   25   47:athrow          
			}
		}

		public void remove()
		{
			if(mCanRemove)
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field boolean mCanRemove>
		//*   2    4:ifeq            44
			{
				mIndex = mIndex - 1;
		//    3    7:aload_0         
		//    4    8:aload_0         
		//    5    9:getfield        #40  <Field int mIndex>
		//    6   12:iconst_1        
		//    7   13:isub            
		//    8   14:putfield        #40  <Field int mIndex>
				mSize = mSize - 1;
		//    9   17:aload_0         
		//   10   18:aload_0         
		//   11   19:getfield        #35  <Field int mSize>
		//   12   22:iconst_1        
		//   13   23:isub            
		//   14   24:putfield        #35  <Field int mSize>
				mCanRemove = false;
		//   15   27:aload_0         
		//   16   28:iconst_0        
		//   17   29:putfield        #27  <Field boolean mCanRemove>
				colRemoveAt(mIndex);
		//   18   32:aload_0         
		//   19   33:getfield        #22  <Field MapCollections this$0>
		//   20   36:aload_0         
		//   21   37:getfield        #40  <Field int mIndex>
		//   22   40:invokevirtual   #58  <Method void MapCollections.colRemoveAt(int)>
				return;
		//   23   43:return          
			} else
			{
				throw new IllegalStateException();
		//   24   44:new             #60  <Class IllegalStateException>
		//   25   47:dup             
		//   26   48:invokespecial   #61  <Method void IllegalStateException()>
		//   27   51:athrow          
			}
		}

		boolean mCanRemove;
		int mIndex;
		final int mOffset;
		int mSize;
		final MapCollections this$0;

		ArrayIterator(int i)
		{
			this$0 = MapCollections.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #22  <Field MapCollections this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #25  <Method void Object()>
			mCanRemove = false;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #27  <Field boolean mCanRemove>
			mOffset = i;
		//    8   14:aload_0         
		//    9   15:iload_2         
		//   10   16:putfield        #29  <Field int mOffset>
			mSize = colGetSize();
		//   11   19:aload_0         
		//   12   20:aload_1         
		//   13   21:invokevirtual   #33  <Method int MapCollections.colGetSize()>
		//   14   24:putfield        #35  <Field int mSize>
		//   15   27:return          
		}
	}

	final class EntrySet
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
			if(!(obj instanceof java.util.Map.Entry))
		//*   0    0:aload_1         
		//*   1    1:instanceof      #24  <Class java.util.Map$Entry>
		//*   2    4:ifne            9
				return false;
		//    3    7:iconst_0        
		//    4    8:ireturn         
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
			if(i < 0)
		//*  14   28:iload_2         
		//*  15   29:ifge            34
				return false;
		//   16   32:iconst_0        
		//   17   33:ireturn         
			else
				return ContainerHelpers.equal(colGetEntry(i, 1), ((java.util.Map.Entry) (obj)).getValue());
		//   18   34:aload_0         
		//   19   35:getfield        #16  <Field MapCollections this$0>
		//   20   38:iload_2         
		//   21   39:iconst_1        
		//   22   40:invokevirtual   #78  <Method Object MapCollections.colGetEntry(int, int)>
		//   23   43:aload_1         
		//   24   44:invokeinterface #60  <Method Object java.util.Map$Entry.getValue()>
		//   25   49:invokestatic    #84  <Method boolean ContainerHelpers.equal(Object, Object)>
		//   26   52:ireturn         
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
			int i = colGetSize() - 1;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MapCollections this$0>
		//    2    4:invokevirtual   #38  <Method int MapCollections.colGetSize()>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:istore_1        
			int j = 0;
		//    6   10:iconst_0        
		//    7   11:istore_2        
			for(; i >= 0; i--)
		//*   8   12:iload_1         
		//*   9   13:iflt            86
			{
				Object obj = colGetEntry(i, 0);
		//   10   16:aload_0         
		//   11   17:getfield        #16  <Field MapCollections this$0>
		//   12   20:iload_1         
		//   13   21:iconst_0        
		//   14   22:invokevirtual   #78  <Method Object MapCollections.colGetEntry(int, int)>
		//   15   25:astore          5
				Object obj1 = colGetEntry(i, 1);
		//   16   27:aload_0         
		//   17   28:getfield        #16  <Field MapCollections this$0>
		//   18   31:iload_1         
		//   19   32:iconst_1        
		//   20   33:invokevirtual   #78  <Method Object MapCollections.colGetEntry(int, int)>
		//   21   36:astore          6
				int k;
				if(obj == null)
		//*  22   38:aload           5
		//*  23   40:ifnonnull       48
					k = 0;
		//   24   43:iconst_0        
		//   25   44:istore_3        
				else
		//*  26   45:goto            54
					k = obj.hashCode();
		//   27   48:aload           5
		//   28   50:invokevirtual   #96  <Method int Object.hashCode()>
		//   29   53:istore_3        
				int l;
				if(obj1 == null)
		//*  30   54:aload           6
		//*  31   56:ifnonnull       65
					l = 0;
		//   32   59:iconst_0        
		//   33   60:istore          4
				else
		//*  34   62:goto            72
					l = obj1.hashCode();
		//   35   65:aload           6
		//   36   67:invokevirtual   #96  <Method int Object.hashCode()>
		//   37   70:istore          4
				j += k ^ l;
		//   38   72:iload_2         
		//   39   73:iload_3         
		//   40   74:iload           4
		//   41   76:ixor            
		//   42   77:iadd            
		//   43   78:istore_2        
			}

		//   44   79:iload_1         
		//   45   80:iconst_1        
		//   46   81:isub            
		//   47   82:istore_1        
		//*  48   83:goto            12
			return j;
		//   49   86:iload_2         
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
			return ((Iterator) (new MapIterator()));
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

		EntrySet()
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

	final class KeySet
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
		//    2    4:invokevirtual   #44  <Method Map MapCollections.colGetMap()>
		//    3    7:aload_1         
		//    4    8:invokestatic    #48  <Method boolean MapCollections.containsAllHelper(Map, Collection)>
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
			return ((Iterator) (new ArrayIterator(0)));
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
		//    2    4:invokevirtual   #44  <Method Map MapCollections.colGetMap()>
		//    3    7:aload_1         
		//    4    8:invokestatic    #84  <Method boolean MapCollections.removeAllHelper(Map, Collection)>
		//    5   11:ireturn         
		}

		public boolean retainAll(Collection collection)
		{
			return MapCollections.retainAllHelper(colGetMap(), collection);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field MapCollections this$0>
		//    2    4:invokevirtual   #44  <Method Map MapCollections.colGetMap()>
		//    3    7:aload_1         
		//    4    8:invokestatic    #88  <Method boolean MapCollections.retainAllHelper(Map, Collection)>
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

		KeySet()
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

	final class MapIterator
		implements Iterator, java.util.Map.Entry
	{

		public boolean equals(Object obj)
		{
			if(mEntryValid)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field boolean mEntryValid>
		//*   2    4:ifeq            81
			{
				boolean flag = obj instanceof java.util.Map.Entry;
		//    3    7:aload_1         
		//    4    8:instanceof      #9   <Class java.util.Map$Entry>
		//    5   11:istore_2        
				boolean flag1 = false;
		//    6   12:iconst_0        
		//    7   13:istore_3        
				if(!flag)
		//*   8   14:iload_2         
		//*   9   15:ifne            20
					return false;
		//   10   18:iconst_0        
		//   11   19:ireturn         
				obj = ((Object) ((java.util.Map.Entry)obj));
		//   12   20:aload_1         
		//   13   21:checkcast       #9   <Class java.util.Map$Entry>
		//   14   24:astore_1        
				flag = flag1;
		//   15   25:iload_3         
		//   16   26:istore_2        
				if(ContainerHelpers.equal(((java.util.Map.Entry) (obj)).getKey(), colGetEntry(mIndex, 0)))
		//*  17   27:aload_1         
		//*  18   28:invokeinterface #43  <Method Object java.util.Map$Entry.getKey()>
		//*  19   33:aload_0         
		//*  20   34:getfield        #23  <Field MapCollections this$0>
		//*  21   37:aload_0         
		//*  22   38:getfield        #36  <Field int mIndex>
		//*  23   41:iconst_0        
		//*  24   42:invokevirtual   #47  <Method Object MapCollections.colGetEntry(int, int)>
		//*  25   45:invokestatic    #53  <Method boolean ContainerHelpers.equal(Object, Object)>
		//*  26   48:ifeq            79
				{
					flag = flag1;
		//   27   51:iload_3         
		//   28   52:istore_2        
					if(ContainerHelpers.equal(((java.util.Map.Entry) (obj)).getValue(), colGetEntry(mIndex, 1)))
		//*  29   53:aload_1         
		//*  30   54:invokeinterface #56  <Method Object java.util.Map$Entry.getValue()>
		//*  31   59:aload_0         
		//*  32   60:getfield        #23  <Field MapCollections this$0>
		//*  33   63:aload_0         
		//*  34   64:getfield        #36  <Field int mIndex>
		//*  35   67:iconst_1        
		//*  36   68:invokevirtual   #47  <Method Object MapCollections.colGetEntry(int, int)>
		//*  37   71:invokestatic    #53  <Method boolean ContainerHelpers.equal(Object, Object)>
		//*  38   74:ifeq            79
						flag = true;
		//   39   77:iconst_1        
		//   40   78:istore_2        
				}
				return flag;
		//   41   79:iload_2         
		//   42   80:ireturn         
			} else
			{
				throw new IllegalStateException("This container does not support retaining Map.Entry objects");
		//   43   81:new             #58  <Class IllegalStateException>
		//   44   84:dup             
		//   45   85:ldc1            #60  <String "This container does not support retaining Map.Entry objects">
		//   46   87:invokespecial   #63  <Method void IllegalStateException(String)>
		//   47   90:athrow          
			}
		}

		public Object getKey()
		{
			if(mEntryValid)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field boolean mEntryValid>
		//*   2    4:ifeq            20
				return colGetEntry(mIndex, 0);
		//    3    7:aload_0         
		//    4    8:getfield        #23  <Field MapCollections this$0>
		//    5   11:aload_0         
		//    6   12:getfield        #36  <Field int mIndex>
		//    7   15:iconst_0        
		//    8   16:invokevirtual   #47  <Method Object MapCollections.colGetEntry(int, int)>
		//    9   19:areturn         
			else
				throw new IllegalStateException("This container does not support retaining Map.Entry objects");
		//   10   20:new             #58  <Class IllegalStateException>
		//   11   23:dup             
		//   12   24:ldc1            #60  <String "This container does not support retaining Map.Entry objects">
		//   13   26:invokespecial   #63  <Method void IllegalStateException(String)>
		//   14   29:athrow          
		}

		public Object getValue()
		{
			if(mEntryValid)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field boolean mEntryValid>
		//*   2    4:ifeq            20
				return colGetEntry(mIndex, 1);
		//    3    7:aload_0         
		//    4    8:getfield        #23  <Field MapCollections this$0>
		//    5   11:aload_0         
		//    6   12:getfield        #36  <Field int mIndex>
		//    7   15:iconst_1        
		//    8   16:invokevirtual   #47  <Method Object MapCollections.colGetEntry(int, int)>
		//    9   19:areturn         
			else
				throw new IllegalStateException("This container does not support retaining Map.Entry objects");
		//   10   20:new             #58  <Class IllegalStateException>
		//   11   23:dup             
		//   12   24:ldc1            #60  <String "This container does not support retaining Map.Entry objects">
		//   13   26:invokespecial   #63  <Method void IllegalStateException(String)>
		//   14   29:athrow          
		}

		public boolean hasNext()
		{
			return mIndex < mEnd;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field int mIndex>
		//    2    4:aload_0         
		//    3    5:getfield        #34  <Field int mEnd>
		//    4    8:icmpge          13
		//    5   11:iconst_1        
		//    6   12:ireturn         
		//    7   13:iconst_0        
		//    8   14:ireturn         
		}

		public int hashCode()
		{
			if(mEntryValid)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field boolean mEntryValid>
		//*   2    4:ifeq            72
			{
				Object obj = ((Object) (MapCollections.this));
		//    3    7:aload_0         
		//    4    8:getfield        #23  <Field MapCollections this$0>
		//    5   11:astore_3        
				int i = mIndex;
		//    6   12:aload_0         
		//    7   13:getfield        #36  <Field int mIndex>
		//    8   16:istore_1        
				int j = 0;
		//    9   17:iconst_0        
		//   10   18:istore_2        
				obj = ((MapCollections) (obj)).colGetEntry(i, 0);
		//   11   19:aload_3         
		//   12   20:iload_1         
		//   13   21:iconst_0        
		//   14   22:invokevirtual   #47  <Method Object MapCollections.colGetEntry(int, int)>
		//   15   25:astore_3        
				Object obj1 = colGetEntry(mIndex, 1);
		//   16   26:aload_0         
		//   17   27:getfield        #23  <Field MapCollections this$0>
		//   18   30:aload_0         
		//   19   31:getfield        #36  <Field int mIndex>
		//   20   34:iconst_1        
		//   21   35:invokevirtual   #47  <Method Object MapCollections.colGetEntry(int, int)>
		//   22   38:astore          4
				if(obj == null)
		//*  23   40:aload_3         
		//*  24   41:ifnonnull       49
					i = 0;
		//   25   44:iconst_0        
		//   26   45:istore_1        
				else
		//*  27   46:goto            54
					i = obj.hashCode();
		//   28   49:aload_3         
		//   29   50:invokevirtual   #71  <Method int Object.hashCode()>
		//   30   53:istore_1        
				if(obj1 != null)
		//*  31   54:aload           4
		//*  32   56:ifnonnull       62
		//*  33   59:goto            68
					j = obj1.hashCode();
		//   34   62:aload           4
		//   35   64:invokevirtual   #71  <Method int Object.hashCode()>
		//   36   67:istore_2        
				return i ^ j;
		//   37   68:iload_1         
		//   38   69:iload_2         
		//   39   70:ixor            
		//   40   71:ireturn         
			} else
			{
				throw new IllegalStateException("This container does not support retaining Map.Entry objects");
		//   41   72:new             #58  <Class IllegalStateException>
		//   42   75:dup             
		//   43   76:ldc1            #60  <String "This container does not support retaining Map.Entry objects">
		//   44   78:invokespecial   #63  <Method void IllegalStateException(String)>
		//   45   81:athrow          
			}
		}

		public volatile Object next()
		{
			return ((Object) (next()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #75  <Method java.util.Map$Entry next()>
		//    2    4:areturn         
		}

		public java.util.Map.Entry next()
		{
			if(hasNext())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #77  <Method boolean hasNext()>
		//*   2    4:ifeq            24
			{
				mIndex = mIndex + 1;
		//    3    7:aload_0         
		//    4    8:aload_0         
		//    5    9:getfield        #36  <Field int mIndex>
		//    6   12:iconst_1        
		//    7   13:iadd            
		//    8   14:putfield        #36  <Field int mIndex>
				mEntryValid = true;
		//    9   17:aload_0         
		//   10   18:iconst_1        
		//   11   19:putfield        #28  <Field boolean mEntryValid>
				return ((java.util.Map.Entry) (this));
		//   12   22:aload_0         
		//   13   23:areturn         
			} else
			{
				throw new NoSuchElementException();
		//   14   24:new             #79  <Class NoSuchElementException>
		//   15   27:dup             
		//   16   28:invokespecial   #80  <Method void NoSuchElementException()>
		//   17   31:athrow          
			}
		}

		public void remove()
		{
			if(mEntryValid)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field boolean mEntryValid>
		//*   2    4:ifeq            44
			{
				colRemoveAt(mIndex);
		//    3    7:aload_0         
		//    4    8:getfield        #23  <Field MapCollections this$0>
		//    5   11:aload_0         
		//    6   12:getfield        #36  <Field int mIndex>
		//    7   15:invokevirtual   #86  <Method void MapCollections.colRemoveAt(int)>
				mIndex = mIndex - 1;
		//    8   18:aload_0         
		//    9   19:aload_0         
		//   10   20:getfield        #36  <Field int mIndex>
		//   11   23:iconst_1        
		//   12   24:isub            
		//   13   25:putfield        #36  <Field int mIndex>
				mEnd = mEnd - 1;
		//   14   28:aload_0         
		//   15   29:aload_0         
		//   16   30:getfield        #34  <Field int mEnd>
		//   17   33:iconst_1        
		//   18   34:isub            
		//   19   35:putfield        #34  <Field int mEnd>
				mEntryValid = false;
		//   20   38:aload_0         
		//   21   39:iconst_0        
		//   22   40:putfield        #28  <Field boolean mEntryValid>
				return;
		//   23   43:return          
			} else
			{
				throw new IllegalStateException();
		//   24   44:new             #58  <Class IllegalStateException>
		//   25   47:dup             
		//   26   48:invokespecial   #87  <Method void IllegalStateException()>
		//   27   51:athrow          
			}
		}

		public Object setValue(Object obj)
		{
			if(mEntryValid)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field boolean mEntryValid>
		//*   2    4:ifeq            20
				return colSetValue(mIndex, obj);
		//    3    7:aload_0         
		//    4    8:getfield        #23  <Field MapCollections this$0>
		//    5   11:aload_0         
		//    6   12:getfield        #36  <Field int mIndex>
		//    7   15:aload_1         
		//    8   16:invokevirtual   #93  <Method Object MapCollections.colSetValue(int, Object)>
		//    9   19:areturn         
			else
				throw new IllegalStateException("This container does not support retaining Map.Entry objects");
		//   10   20:new             #58  <Class IllegalStateException>
		//   11   23:dup             
		//   12   24:ldc1            #60  <String "This container does not support retaining Map.Entry objects">
		//   13   26:invokespecial   #63  <Method void IllegalStateException(String)>
		//   14   29:athrow          
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #98  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #99  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append(getKey());
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:invokevirtual   #100 <Method Object getKey()>
		//    7   13:invokevirtual   #104 <Method StringBuilder StringBuilder.append(Object)>
		//    8   16:pop             
			stringbuilder.append("=");
		//    9   17:aload_1         
		//   10   18:ldc1            #106 <String "=">
		//   11   20:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
		//   12   23:pop             
			stringbuilder.append(getValue());
		//   13   24:aload_1         
		//   14   25:aload_0         
		//   15   26:invokevirtual   #110 <Method Object getValue()>
		//   16   29:invokevirtual   #104 <Method StringBuilder StringBuilder.append(Object)>
		//   17   32:pop             
			return stringbuilder.toString();
		//   18   33:aload_1         
		//   19   34:invokevirtual   #112 <Method String StringBuilder.toString()>
		//   20   37:areturn         
		}

		int mEnd;
		boolean mEntryValid;
		int mIndex;
		final MapCollections this$0;

		MapIterator()
		{
			this$0 = MapCollections.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #23  <Field MapCollections this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #26  <Method void Object()>
			mEntryValid = false;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #28  <Field boolean mEntryValid>
			mEnd = colGetSize() - 1;
		//    8   14:aload_0         
		//    9   15:aload_1         
		//   10   16:invokevirtual   #32  <Method int MapCollections.colGetSize()>
		//   11   19:iconst_1        
		//   12   20:isub            
		//   13   21:putfield        #34  <Field int mEnd>
			mIndex = -1;
		//   14   24:aload_0         
		//   15   25:iconst_m1       
		//   16   26:putfield        #36  <Field int mIndex>
		//   17   29:return          
		}
	}

	final class ValuesCollection
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
			return ((Iterator) (new ArrayIterator(1)));
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
			int i = 0;
		//    4    8:iconst_0        
		//    5    9:istore_2        
			boolean flag = false;
		//    6   10:iconst_0        
		//    7   11:istore          6
			int k;
			for(; i < j; j = k)
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
			int i = 0;
		//    4    8:iconst_0        
		//    5    9:istore_2        
			boolean flag = false;
		//    6   10:iconst_0        
		//    7   11:istore          6
			int k;
			for(; i < j; j = k)
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

		ValuesCollection()
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


	MapCollections()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
	//    2    4:return          
	}

	public static boolean containsAllHelper(Map map, Collection collection)
	{
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext();)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #43  <Method Iterator Collection.iterator()>
	//*   2    6:astore_1        
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #49  <Method boolean Iterator.hasNext()>
	//*   5   13:ifeq            33
			if(!map.containsKey(((Iterator) (collection)).next()))
	//*   6   16:aload_0         
	//*   7   17:aload_1         
	//*   8   18:invokeinterface #53  <Method Object Iterator.next()>
	//*   9   23:invokeinterface #59  <Method boolean Map.containsKey(Object)>
	//*  10   28:ifne            7
				return false;
	//   11   31:iconst_0        
	//   12   32:ireturn         

		return true;
	//   13   33:iconst_1        
	//   14   34:ireturn         
	}

	public static boolean equalsSetHelper(Set set, Object obj)
	{
label0:
		{
label1:
			{
				if(set == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
					return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
				if(!(obj instanceof Set))
					break label0;
	//    5    7:aload_1         
	//    6    8:instanceof      #69  <Class Set>
	//    7   11:ifeq            50
				obj = ((Object) ((Set)obj));
	//    8   14:aload_1         
	//    9   15:checkcast       #69  <Class Set>
	//   10   18:astore_1        
				boolean flag;
				try
				{
					if(set.size() != ((Set) (obj)).size())
						break label1;
	//   11   19:aload_0         
	//   12   20:invokeinterface #73  <Method int Set.size()>
	//   13   25:aload_1         
	//   14   26:invokeinterface #73  <Method int Set.size()>
	//   15   31:icmpne          48
					flag = set.containsAll(((Collection) (obj)));
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:invokeinterface #77  <Method boolean Set.containsAll(Collection)>
	//   19   41:istore_2        
				}
	//*  20   42:iload_2         
	//*  21   43:ifeq            48
	//*  22   46:iconst_1        
	//*  23   47:ireturn         
	//*  24   48:iconst_0        
	//*  25   49:ireturn         
	//*  26   50:iconst_0        
	//*  27   51:ireturn         
				// Misplaced declaration of an exception variable
				catch(Set set)
	//*  28   52:astore_0        
				{
					return false;
	//   29   53:iconst_0        
	//   30   54:ireturn         
				}
				// Misplaced declaration of an exception variable
				catch(Set set)
	//*  31   55:astore_0        
				{
					return false;
	//   32   56:iconst_0        
	//   33   57:ireturn         
				}
				if(flag)
					return true;
			}
			return false;
		}
		return false;
	}

	public static boolean removeAllHelper(Map map, Collection collection)
	{
		int i = map.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #80  <Method int Map.size()>
	//    2    6:istore_2        
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); map.remove(((Iterator) (collection)).next()));
	//    3    7:aload_1         
	//    4    8:invokeinterface #43  <Method Iterator Collection.iterator()>
	//    5   13:astore_1        
	//    6   14:aload_1         
	//    7   15:invokeinterface #49  <Method boolean Iterator.hasNext()>
	//    8   20:ifeq            39
	//    9   23:aload_0         
	//   10   24:aload_1         
	//   11   25:invokeinterface #53  <Method Object Iterator.next()>
	//   12   30:invokeinterface #84  <Method Object Map.remove(Object)>
	//   13   35:pop             
	//*  14   36:goto            14
		return i != map.size();
	//   15   39:iload_2         
	//   16   40:aload_0         
	//   17   41:invokeinterface #80  <Method int Map.size()>
	//   18   46:icmpeq          51
	//   19   49:iconst_1        
	//   20   50:ireturn         
	//   21   51:iconst_0        
	//   22   52:ireturn         
	}

	public static boolean retainAllHelper(Map map, Collection collection)
	{
		int i = map.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #80  <Method int Map.size()>
	//    2    6:istore_2        
		Iterator iterator = map.keySet().iterator();
	//    3    7:aload_0         
	//    4    8:invokeinterface #89  <Method Set Map.keySet()>
	//    5   13:invokeinterface #90  <Method Iterator Set.iterator()>
	//    6   18:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//    7   19:aload_3         
	//    8   20:invokeinterface #49  <Method boolean Iterator.hasNext()>
	//    9   25:ifeq            52
			if(!collection.contains(iterator.next()))
	//*  10   28:aload_1         
	//*  11   29:aload_3         
	//*  12   30:invokeinterface #53  <Method Object Iterator.next()>
	//*  13   35:invokeinterface #93  <Method boolean Collection.contains(Object)>
	//*  14   40:ifne            19
				iterator.remove();
	//   15   43:aload_3         
	//   16   44:invokeinterface #95  <Method void Iterator.remove()>
		} while(true);
	//   17   49:goto            19
		return i != map.size();
	//   18   52:iload_2         
	//   19   53:aload_0         
	//   20   54:invokeinterface #80  <Method int Map.size()>
	//   21   59:icmpeq          64
	//   22   62:iconst_1        
	//   23   63:ireturn         
	//   24   64:iconst_0        
	//   25   65:ireturn         
	}

	protected abstract void colClear();

	protected abstract Object colGetEntry(int i, int j);

	protected abstract Map colGetMap();

	protected abstract int colGetSize();

	protected abstract int colIndexOfKey(Object obj);

	protected abstract int colIndexOfValue(Object obj);

	protected abstract void colPut(Object obj, Object obj1);

	protected abstract void colRemoveAt(int i);

	protected abstract Object colSetValue(int i, Object obj);

	public Set getEntrySet()
	{
		if(mEntrySet == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #113 <Field MapCollections$EntrySet mEntrySet>
	//*   2    4:ifnonnull       19
			mEntrySet = new EntrySet();
	//    3    7:aload_0         
	//    4    8:new             #10  <Class MapCollections$EntrySet>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #116 <Method void MapCollections$EntrySet(MapCollections)>
	//    8   16:putfield        #113 <Field MapCollections$EntrySet mEntrySet>
		return ((Set) (mEntrySet));
	//    9   19:aload_0         
	//   10   20:getfield        #113 <Field MapCollections$EntrySet mEntrySet>
	//   11   23:areturn         
	}

	public Set getKeySet()
	{
		if(mKeySet == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field MapCollections$KeySet mKeySet>
	//*   2    4:ifnonnull       19
			mKeySet = new KeySet();
	//    3    7:aload_0         
	//    4    8:new             #13  <Class MapCollections$KeySet>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #121 <Method void MapCollections$KeySet(MapCollections)>
	//    8   16:putfield        #120 <Field MapCollections$KeySet mKeySet>
		return ((Set) (mKeySet));
	//    9   19:aload_0         
	//   10   20:getfield        #120 <Field MapCollections$KeySet mKeySet>
	//   11   23:areturn         
	}

	public Collection getValues()
	{
		if(mValues == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #126 <Field MapCollections$ValuesCollection mValues>
	//*   2    4:ifnonnull       19
			mValues = new ValuesCollection();
	//    3    7:aload_0         
	//    4    8:new             #19  <Class MapCollections$ValuesCollection>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #127 <Method void MapCollections$ValuesCollection(MapCollections)>
	//    8   16:putfield        #126 <Field MapCollections$ValuesCollection mValues>
		return ((Collection) (mValues));
	//    9   19:aload_0         
	//   10   20:getfield        #126 <Field MapCollections$ValuesCollection mValues>
	//   11   23:areturn         
	}

	public Object[] toArrayHelper(int i)
	{
		int k = colGetSize();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #132 <Method int colGetSize()>
	//    2    4:istore_3        
		Object aobj[] = new Object[k];
	//    3    5:iload_3         
	//    4    6:anewarray       Object[]
	//    5    9:astore          4
		for(int j = 0; j < k; j++)
	//*   6   11:iconst_0        
	//*   7   12:istore_2        
	//*   8   13:iload_2         
	//*   9   14:iload_3         
	//*  10   15:icmpge          35
			aobj[j] = colGetEntry(j, i);
	//   11   18:aload           4
	//   12   20:iload_2         
	//   13   21:aload_0         
	//   14   22:iload_2         
	//   15   23:iload_1         
	//   16   24:invokevirtual   #134 <Method Object colGetEntry(int, int)>
	//   17   27:aastore         

	//   18   28:iload_2         
	//   19   29:iconst_1        
	//   20   30:iadd            
	//   21   31:istore_2        
	//*  22   32:goto            13
		return aobj;
	//   23   35:aload           4
	//   24   37:areturn         
	}

	public Object[] toArrayHelper(Object aobj[], int i)
	{
		int k = colGetSize();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #132 <Method int colGetSize()>
	//    2    4:istore          4
		Object aobj1[] = aobj;
	//    3    6:aload_1         
	//    4    7:astore          5
		if(aobj.length < k)
	//*   5    9:aload_1         
	//*   6   10:arraylength     
	//*   7   11:iload           4
	//*   8   13:icmpge          33
			aobj1 = (Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), k);
	//    9   16:aload_1         
	//   10   17:invokevirtual   #139 <Method Class Object.getClass()>
	//   11   20:invokevirtual   #144 <Method Class Class.getComponentType()>
	//   12   23:iload           4
	//   13   25:invokestatic    #150 <Method Object Array.newInstance(Class, int)>
	//   14   28:checkcast       #152 <Class Object[]>
	//   15   31:astore          5
		for(int j = 0; j < k; j++)
	//*  16   33:iconst_0        
	//*  17   34:istore_3        
	//*  18   35:iload_3         
	//*  19   36:iload           4
	//*  20   38:icmpge          58
			aobj1[j] = colGetEntry(j, i);
	//   21   41:aload           5
	//   22   43:iload_3         
	//   23   44:aload_0         
	//   24   45:iload_3         
	//   25   46:iload_2         
	//   26   47:invokevirtual   #134 <Method Object colGetEntry(int, int)>
	//   27   50:aastore         

	//   28   51:iload_3         
	//   29   52:iconst_1        
	//   30   53:iadd            
	//   31   54:istore_3        
	//*  32   55:goto            35
		if(aobj1.length > k)
	//*  33   58:aload           5
	//*  34   60:arraylength     
	//*  35   61:iload           4
	//*  36   63:icmple          72
			aobj1[k] = null;
	//   37   66:aload           5
	//   38   68:iload           4
	//   39   70:aconst_null     
	//   40   71:aastore         
		return aobj1;
	//   41   72:aload           5
	//   42   74:areturn         
	}

	EntrySet mEntrySet;
	KeySet mKeySet;
	ValuesCollection mValues;
}
