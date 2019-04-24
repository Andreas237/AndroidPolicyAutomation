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
		throw new UnsupportedOperationException((new StringBuilder()).append("Cannot allocate ").append(((Object) (class1))).toString());
	//    0    0:new             #16  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:new             #18  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #19  <Method void StringBuilder()>
	//    5   11:ldc1            #21  <String "Cannot allocate ">
	//    6   13:invokevirtual   #25  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_1         
	//    8   17:invokevirtual   #28  <Method StringBuilder StringBuilder.append(Object)>
	//    9   20:invokevirtual   #32  <Method String StringBuilder.toString()>
	//   10   23:invokespecial   #35  <Method void UnsupportedOperationException(String)>
	//   11   26:athrow          
	}

	UnsafeAllocator$4()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void UnsafeAllocator()>
	//    2    4:return          
	}
}
