// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import java.util.*;

// Referenced classes of package com.bumptech.glide.load.model:
//			ModelLoaderRegistry

private static class ModelLoaderRegistry$ModelLoaderCache
{
	private static class Entry
	{

		final List loaders;

		public Entry(List list)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			loaders = list;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field List loaders>
		//    5    9:return          
		}
	}


	public void clear()
	{
		cachedModelLoaders.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Map cachedModelLoaders>
	//    2    4:invokeinterface #28  <Method void Map.clear()>
	//    3    9:return          
	}

	public List get(Class class1)
	{
		class1 = ((Class) ((Entry)cachedModelLoaders.get(((Object) (class1)))));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Map cachedModelLoaders>
	//    2    4:aload_1         
	//    3    5:invokeinterface #34  <Method Object Map.get(Object)>
	//    4   10:checkcast       #9   <Class ModelLoaderRegistry$ModelLoaderCache$Entry>
	//    5   13:astore_1        
		if(class1 == null)
	//*   6   14:aload_1         
	//*   7   15:ifnonnull       20
			return null;
	//    8   18:aconst_null     
	//    9   19:areturn         
		else
			return ((Entry) (class1)).loaders;
	//   10   20:aload_1         
	//   11   21:getfield        #38  <Field List ModelLoaderRegistry$ModelLoaderCache$Entry.loaders>
	//   12   24:areturn         
	}

	public void put(Class class1, List list)
	{
		if((Entry)cachedModelLoaders.put(((Object) (class1)), ((Object) (new Entry(list)))) == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field Map cachedModelLoaders>
	//*   2    4:aload_1         
	//*   3    5:new             #9   <Class ModelLoaderRegistry$ModelLoaderCache$Entry>
	//*   4    8:dup             
	//*   5    9:aload_2         
	//*   6   10:invokespecial   #46  <Method void ModelLoaderRegistry$ModelLoaderCache$Entry(List)>
	//*   7   13:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//*   8   18:checkcast       #9   <Class ModelLoaderRegistry$ModelLoaderCache$Entry>
	//*   9   21:ifnonnull       25
		{
			return;
	//   10   24:return          
		} else
		{
			list = ((List) (new StringBuilder()));
	//   11   25:new             #51  <Class StringBuilder>
	//   12   28:dup             
	//   13   29:invokespecial   #52  <Method void StringBuilder()>
	//   14   32:astore_2        
			((StringBuilder) (list)).append("Already cached loaders for model: ");
	//   15   33:aload_2         
	//   16   34:ldc1            #54  <String "Already cached loaders for model: ">
	//   17   36:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   18   39:pop             
			((StringBuilder) (list)).append(((Object) (class1)));
	//   19   40:aload_2         
	//   20   41:aload_1         
	//   21   42:invokevirtual   #61  <Method StringBuilder StringBuilder.append(Object)>
	//   22   45:pop             
			throw new IllegalStateException(((StringBuilder) (list)).toString());
	//   23   46:new             #63  <Class IllegalStateException>
	//   24   49:dup             
	//   25   50:aload_2         
	//   26   51:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   27   54:invokespecial   #70  <Method void IllegalStateException(String)>
	//   28   57:athrow          
		}
	}

	private final Map cachedModelLoaders = new HashMap();

	ModelLoaderRegistry$ModelLoaderCache()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #19  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void HashMap()>
	//    6   12:putfield        #22  <Field Map cachedModelLoaders>
	//    7   15:return          
	}
}
