// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.annotation;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.annotation:
//			ObjectIdResolver

public class SimpleObjectIdResolver
	implements ObjectIdResolver
{

	public SimpleObjectIdResolver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public void bindItem(ObjectIdGenerator.IdKey idkey, Object obj)
	{
		if(_items == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Map _items>
	//*   2    4:ifnonnull       31
			_items = ((Map) (new HashMap()));
	//    3    7:aload_0         
	//    4    8:new             #20  <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #21  <Method void HashMap()>
	//    7   15:putfield        #18  <Field Map _items>
		else
	//*   8   18:aload_0         
	//*   9   19:getfield        #18  <Field Map _items>
	//*  10   22:aload_1         
	//*  11   23:aload_2         
	//*  12   24:invokeinterface #27  <Method Object Map.put(Object, Object)>
	//*  13   29:pop             
	//*  14   30:return          
		if(_items.containsKey(((Object) (idkey))))
	//*  15   31:aload_0         
	//*  16   32:getfield        #18  <Field Map _items>
	//*  17   35:aload_1         
	//*  18   36:invokeinterface #31  <Method boolean Map.containsKey(Object)>
	//*  19   41:ifeq            18
			throw new IllegalStateException((new StringBuilder()).append("Already had POJO for id (").append(idkey.key.getClass().getName()).append(") [").append(((Object) (idkey))).append("]").toString());
	//   20   44:new             #33  <Class IllegalStateException>
	//   21   47:dup             
	//   22   48:new             #35  <Class StringBuilder>
	//   23   51:dup             
	//   24   52:invokespecial   #36  <Method void StringBuilder()>
	//   25   55:ldc1            #38  <String "Already had POJO for id (">
	//   26   57:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   27   60:aload_1         
	//   28   61:getfield        #48  <Field Object ObjectIdGenerator$IdKey.key>
	//   29   64:invokevirtual   #52  <Method Class Object.getClass()>
	//   30   67:invokevirtual   #58  <Method String Class.getName()>
	//   31   70:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   32   73:ldc1            #60  <String ") [">
	//   33   75:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   34   78:aload_1         
	//   35   79:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
	//   36   82:ldc1            #65  <String "]">
	//   37   84:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   38   87:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   39   90:invokespecial   #71  <Method void IllegalStateException(String)>
	//   40   93:athrow          
		_items.put(((Object) (idkey)), obj);
	}

	public boolean canUseFor(ObjectIdResolver objectidresolver)
	{
		return ((Object) (objectidresolver)).getClass() == ((Object)this).getClass();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #52  <Method Class Object.getClass()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #52  <Method Class Object.getClass()>
	//    4    8:if_acmpne       13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public ObjectIdResolver newForDeserialization(Object obj)
	{
		return ((ObjectIdResolver) (new SimpleObjectIdResolver()));
	//    0    0:new             #2   <Class SimpleObjectIdResolver>
	//    1    3:dup             
	//    2    4:invokespecial   #76  <Method void SimpleObjectIdResolver()>
	//    3    7:areturn         
	}

	public Object resolveId(ObjectIdGenerator.IdKey idkey)
	{
		if(_items == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Map _items>
	//*   2    4:ifnonnull       9
			return ((Object) (null));
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return _items.get(((Object) (idkey)));
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field Map _items>
	//    7   13:aload_1         
	//    8   14:invokeinterface #82  <Method Object Map.get(Object)>
	//    9   19:areturn         
	}

	protected Map _items;
}
