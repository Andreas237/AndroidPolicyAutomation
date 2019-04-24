// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.util;

import java.util.Map;

// Referenced classes of package android.support.v4.util:
//			MapCollections, ArrayMap

class ArrayMap$1 extends MapCollections
{

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

	ArrayMap$1()
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
