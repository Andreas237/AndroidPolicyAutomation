// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;


// Referenced classes of package com.bumptech.glide:
//			Registry

public static class Registry$NoResultEncoderAvailableException extends Registry.MissingComponentException
{

	public Registry$NoResultEncoderAvailableException(Class class1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #12  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Failed to find result encoder for resource class: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #17  <String "Failed to find result encoder for resource class: ">
	//    6   11:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (class1)));
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #24  <Method StringBuilder StringBuilder.append(Object)>
	//   11   20:pop             
		stringbuilder.append(", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
	//   12   21:aload_2         
	//   13   22:ldc1            #26  <String ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.">
	//   14   24:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		super(stringbuilder.toString());
	//   16   28:aload_0         
	//   17   29:aload_2         
	//   18   30:invokevirtual   #30  <Method String StringBuilder.toString()>
	//   19   33:invokespecial   #33  <Method void Registry$MissingComponentException(String)>
	//   20   36:return          
	}
}
