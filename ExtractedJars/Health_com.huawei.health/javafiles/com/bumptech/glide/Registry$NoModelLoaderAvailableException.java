// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;


// Referenced classes of package com.bumptech.glide:
//			Registry

public static class Registry$NoModelLoaderAvailableException extends Registry.MissingComponentException
{

	public Registry$NoModelLoaderAvailableException(Class class1, Class class2)
	{
		super((new StringBuilder()).append("Failed to find any ModelLoaders for model: ").append(((Object) (class1))).append(" and data: ").append(((Object) (class2))).toString());
	//    0    0:aload_0         
	//    1    1:new             #11  <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #14  <Method void StringBuilder()>
	//    4    8:ldc1            #16  <String "Failed to find any ModelLoaders for model: ">
	//    5   10:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//    6   13:aload_1         
	//    7   14:invokevirtual   #23  <Method StringBuilder StringBuilder.append(Object)>
	//    8   17:ldc1            #25  <String " and data: ">
	//    9   19:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   10   22:aload_2         
	//   11   23:invokevirtual   #23  <Method StringBuilder StringBuilder.append(Object)>
	//   12   26:invokevirtual   #29  <Method String StringBuilder.toString()>
	//   13   29:invokespecial   #32  <Method void Registry$MissingComponentException(String)>
	//   14   32:return          
	}

	public Registry$NoModelLoaderAvailableException(Object obj)
	{
		super((new StringBuilder()).append("Failed to find any ModelLoaders for model: ").append(obj).toString());
	//    0    0:aload_0         
	//    1    1:new             #11  <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #14  <Method void StringBuilder()>
	//    4    8:ldc1            #16  <String "Failed to find any ModelLoaders for model: ">
	//    5   10:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//    6   13:aload_1         
	//    7   14:invokevirtual   #23  <Method StringBuilder StringBuilder.append(Object)>
	//    8   17:invokevirtual   #29  <Method String StringBuilder.toString()>
	//    9   20:invokespecial   #32  <Method void Registry$MissingComponentException(String)>
	//   10   23:return          
	}
}
