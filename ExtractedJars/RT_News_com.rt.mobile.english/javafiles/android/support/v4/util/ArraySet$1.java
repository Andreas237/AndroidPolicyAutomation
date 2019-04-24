// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.util;

import java.util.Map;

// Referenced classes of package android.support.v4.util:
//			MapCollections, ArraySet

class ArraySet$1 extends MapCollections
{

	protected void colClear()
	{
		clear();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ArraySet this$0>
	//    2    4:invokevirtual   #24  <Method void ArraySet.clear()>
	//    3    7:return          
	}

	protected Object colGetEntry(int i, int j)
	{
		return ArraySet.access$100(ArraySet.this)[i];
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ArraySet this$0>
	//    2    4:invokestatic    #30  <Method Object[] ArraySet.access$100(ArraySet)>
	//    3    7:iload_1         
	//    4    8:aaload          
	//    5    9:areturn         
	}

	protected Map colGetMap()
	{
		throw new UnsupportedOperationException("not a map");
	//    0    0:new             #34  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #36  <String "not a map">
	//    3    6:invokespecial   #39  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	protected int colGetSize()
	{
		return ArraySet.access$000(ArraySet.this);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ArraySet this$0>
	//    2    4:invokestatic    #47  <Method int ArraySet.access$000(ArraySet)>
	//    3    7:ireturn         
	}

	protected int colIndexOfKey(Object obj)
	{
		return indexOf(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ArraySet this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #52  <Method int ArraySet.indexOf(Object)>
	//    4    8:ireturn         
	}

	protected int colIndexOfValue(Object obj)
	{
		return indexOf(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ArraySet this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #52  <Method int ArraySet.indexOf(Object)>
	//    4    8:ireturn         
	}

	protected void colPut(Object obj, Object obj1)
	{
		add(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ArraySet this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #59  <Method boolean ArraySet.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	protected void colRemoveAt(int i)
	{
		removeAt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ArraySet this$0>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #66  <Method Object ArraySet.removeAt(int)>
	//    4    8:pop             
	//    5    9:return          
	}

	protected Object colSetValue(int i, Object obj)
	{
		throw new UnsupportedOperationException("not a map");
	//    0    0:new             #34  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #36  <String "not a map">
	//    3    6:invokespecial   #39  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	final ArraySet this$0;

	ArraySet$1()
	{
		this$0 = ArraySet.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field ArraySet this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void MapCollections()>
	//    5    9:return          
	}
}
