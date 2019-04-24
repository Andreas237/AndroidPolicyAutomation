// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;


// Referenced classes of package com.google.gson.internal:
//			UnsafeAllocator

static final class UnsafeAllocator$4 extends UnsafeAllocator
{

	public Object newInstance(Class class1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #16  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Cannot allocate ");
	//    4    8:aload_2         
	//    5    9:ldc1            #19  <String "Cannot allocate ">
	//    6   11:invokevirtual   #23  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (class1)));
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #26  <Method StringBuilder StringBuilder.append(Object)>
	//   11   20:pop             
		throw new UnsupportedOperationException(stringbuilder.toString());
	//   12   21:new             #28  <Class UnsupportedOperationException>
	//   13   24:dup             
	//   14   25:aload_2         
	//   15   26:invokevirtual   #32  <Method String StringBuilder.toString()>
	//   16   29:invokespecial   #35  <Method void UnsupportedOperationException(String)>
	//   17   32:athrow          
	}

	UnsafeAllocator$4()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void UnsafeAllocator()>
	//    2    4:return          
	}
}
