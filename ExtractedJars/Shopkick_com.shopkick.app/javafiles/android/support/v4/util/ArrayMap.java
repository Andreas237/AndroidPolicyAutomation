// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.util;

import java.util.*;

// Referenced classes of package android.support.v4.util:
//			SimpleArrayMap, MapCollections

public class ArrayMap extends SimpleArrayMap
	implements Map
{

	public ArrayMap()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void SimpleArrayMap()>
	//    2    4:return          
	}

	public ArrayMap(int i)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #21  <Method void SimpleArrayMap(int)>
	//    3    5:return          
	}

	public ArrayMap(SimpleArrayMap simplearraymap)
	{
		super(simplearraymap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method void SimpleArrayMap(SimpleArrayMap)>
	//    3    5:return          
	}

	private MapCollections getCollection()
	{
		if(mCollections == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field MapCollections mCollections>
	//*   2    4:ifnonnull       19
			mCollections = ((MapCollections) (new MapCollections() {

				protected void colClear()
				{
					clear();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field ArrayMap this$0>
				//    2    4:invokevirtual   #24  <Method void ArrayMap.clear()>
				//    3    7:return          
				}

				protected Object colGetEntry(int i, int j)
				{
					return mArray[(i << 1) + j];
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field ArrayMap this$0>
				//    2    4:getfield        #30  <Field Object[] ArrayMap.mArray>
				//    3    7:iload_1         
				//    4    8:iconst_1        
				//    5    9:ishl            
				//    6   10:iload_2         
				//    7   11:iadd            
				//    8   12:aaload          
				//    9   13:areturn         
				}

				protected Map colGetMap()
				{
					return ((Map) (ArrayMap.this));
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field ArrayMap this$0>
				//    2    4:areturn         
				}

				protected int colGetSize()
				{
					return mSize;
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field ArrayMap this$0>
				//    2    4:getfield        #40  <Field int ArrayMap.mSize>
				//    3    7:ireturn         
				}

				protected int colIndexOfKey(Object obj)
				{
					return indexOfKey(obj);
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field ArrayMap this$0>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #45  <Method int ArrayMap.indexOfKey(Object)>
				//    4    8:ireturn         
				}

				protected int colIndexOfValue(Object obj)
				{
					return indexOfValue(obj);
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field ArrayMap this$0>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #49  <Method int ArrayMap.indexOfValue(Object)>
				//    4    8:ireturn         
				}

				protected void colPut(Object obj, Object obj1)
				{
					put(obj, obj1);
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field ArrayMap this$0>
				//    2    4:aload_1         
				//    3    5:aload_2         
				//    4    6:invokevirtual   #55  <Method Object ArrayMap.put(Object, Object)>
				//    5    9:pop             
				//    6   10:return          
				}

				protected void colRemoveAt(int i)
				{
					removeAt(i);
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field ArrayMap this$0>
				//    2    4:iload_1         
				//    3    5:invokevirtual   #62  <Method Object ArrayMap.removeAt(int)>
				//    4    8:pop             
				//    5    9:return          
				}

				protected Object colSetValue(int i, Object obj)
				{
					return setValueAt(i, obj);
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field ArrayMap this$0>
				//    2    4:iload_1         
				//    3    5:aload_2         
				//    4    6:invokevirtual   #67  <Method Object ArrayMap.setValueAt(int, Object)>
				//    5    9:areturn         
				}

				final ArrayMap this$0;

			
			{
				this$0 = ArrayMap.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field ArrayMap this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void MapCollections()>
			//    5    9:return          
			}
			}
));
	//    3    7:aload_0         
	//    4    8:new             #9   <Class ArrayMap$1>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #31  <Method void ArrayMap$1(ArrayMap)>
	//    8   16:putfield        #28  <Field MapCollections mCollections>
		return mCollections;
	//    9   19:aload_0         
	//   10   20:getfield        #28  <Field MapCollections mCollections>
	//   11   23:areturn         
	}

	public boolean containsAll(Collection collection)
	{
		return MapCollections.containsAllHelper(((Map) (this)), collection);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #42  <Method boolean MapCollections.containsAllHelper(Map, Collection)>
	//    3    5:ireturn         
	}

	public Set entrySet()
	{
		return getCollection().getEntrySet();
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method MapCollections getCollection()>
	//    2    4:invokevirtual   #51  <Method Set MapCollections.getEntrySet()>
	//    3    7:areturn         
	}

	public Set keySet()
	{
		return getCollection().getKeySet();
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method MapCollections getCollection()>
	//    2    4:invokevirtual   #56  <Method Set MapCollections.getKeySet()>
	//    3    7:areturn         
	}

	public void putAll(Map map)
	{
		ensureCapacity(mSize + map.size());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #63  <Field int mSize>
	//    3    5:aload_1         
	//    4    6:invokeinterface #67  <Method int Map.size()>
	//    5   11:iadd            
	//    6   12:invokevirtual   #70  <Method void ensureCapacity(int)>
		java.util.Map.Entry entry;
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); put(entry.getKey(), entry.getValue()))
	//*   7   15:aload_1         
	//*   8   16:invokeinterface #72  <Method Set Map.entrySet()>
	//*   9   21:invokeinterface #78  <Method Iterator Set.iterator()>
	//*  10   26:astore_1        
	//*  11   27:aload_1         
	//*  12   28:invokeinterface #84  <Method boolean Iterator.hasNext()>
	//*  13   33:ifeq            66
			entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   14   36:aload_1         
	//   15   37:invokeinterface #88  <Method Object Iterator.next()>
	//   16   42:checkcast       #90  <Class java.util.Map$Entry>
	//   17   45:astore_2        

	//   18   46:aload_0         
	//   19   47:aload_2         
	//   20   48:invokeinterface #93  <Method Object java.util.Map$Entry.getKey()>
	//   21   53:aload_2         
	//   22   54:invokeinterface #96  <Method Object java.util.Map$Entry.getValue()>
	//   23   59:invokevirtual   #100 <Method Object put(Object, Object)>
	//   24   62:pop             
	//*  25   63:goto            27
	//   26   66:return          
	}

	public boolean removeAll(Collection collection)
	{
		return MapCollections.removeAllHelper(((Map) (this)), collection);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #105 <Method boolean MapCollections.removeAllHelper(Map, Collection)>
	//    3    5:ireturn         
	}

	public boolean retainAll(Collection collection)
	{
		return MapCollections.retainAllHelper(((Map) (this)), collection);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #109 <Method boolean MapCollections.retainAllHelper(Map, Collection)>
	//    3    5:ireturn         
	}

	public Collection values()
	{
		return getCollection().getValues();
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method MapCollections getCollection()>
	//    2    4:invokevirtual   #114 <Method Collection MapCollections.getValues()>
	//    3    7:areturn         
	}

	MapCollections mCollections;
}
