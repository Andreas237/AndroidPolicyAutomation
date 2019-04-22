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
label0:
		{
			Map map = _items;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Map _items>
	//    2    4:astore_3        
			if(map == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       23
				_items = ((Map) (new HashMap()));
	//    5    9:aload_0         
	//    6   10:new             #20  <Class HashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #21  <Method void HashMap()>
	//    9   17:putfield        #18  <Field Map _items>
			else
	//*  10   20:goto            33
			if(map.containsKey(((Object) (idkey))))
				break label0;
	//   11   23:aload_3         
	//   12   24:aload_1         
	//   13   25:invokeinterface #27  <Method boolean Map.containsKey(Object)>
	//   14   30:ifne            46
			_items.put(((Object) (idkey)), obj);
	//   15   33:aload_0         
	//   16   34:getfield        #18  <Field Map _items>
	//   17   37:aload_1         
	//   18   38:aload_2         
	//   19   39:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   20   44:pop             
			return;
	//   21   45:return          
		}
		obj = ((Object) (new StringBuilder()));
	//   22   46:new             #33  <Class StringBuilder>
	//   23   49:dup             
	//   24   50:invokespecial   #34  <Method void StringBuilder()>
	//   25   53:astore_2        
		((StringBuilder) (obj)).append("Already had POJO for id (");
	//   26   54:aload_2         
	//   27   55:ldc1            #36  <String "Already had POJO for id (">
	//   28   57:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   29   60:pop             
		((StringBuilder) (obj)).append(idkey.key.getClass().getName());
	//   30   61:aload_2         
	//   31   62:aload_1         
	//   32   63:getfield        #46  <Field Object ObjectIdGenerator$IdKey.key>
	//   33   66:invokevirtual   #50  <Method Class Object.getClass()>
	//   34   69:invokevirtual   #56  <Method String Class.getName()>
	//   35   72:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   36   75:pop             
		((StringBuilder) (obj)).append(") [");
	//   37   76:aload_2         
	//   38   77:ldc1            #58  <String ") [">
	//   39   79:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   40   82:pop             
		((StringBuilder) (obj)).append(((Object) (idkey)));
	//   41   83:aload_2         
	//   42   84:aload_1         
	//   43   85:invokevirtual   #61  <Method StringBuilder StringBuilder.append(Object)>
	//   44   88:pop             
		((StringBuilder) (obj)).append("]");
	//   45   89:aload_2         
	//   46   90:ldc1            #63  <String "]">
	//   47   92:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   48   95:pop             
		throw new IllegalStateException(((StringBuilder) (obj)).toString());
	//   49   96:new             #65  <Class IllegalStateException>
	//   50   99:dup             
	//   51  100:aload_2         
	//   52  101:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   53  104:invokespecial   #71  <Method void IllegalStateException(String)>
	//   54  107:athrow          
	}

	public boolean canUseFor(ObjectIdResolver objectidresolver)
	{
		return ((Object) (objectidresolver)).getClass() == ((Object)this).getClass();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #50  <Method Class Object.getClass()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #50  <Method Class Object.getClass()>
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
		Map map = _items;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Map _items>
	//    2    4:astore_2        
		if(map == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
			return ((Object) (null));
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return map.get(((Object) (idkey)));
	//    7   11:aload_2         
	//    8   12:aload_1         
	//    9   13:invokeinterface #82  <Method Object Map.get(Object)>
	//   10   18:areturn         
	}

	protected Map _items;
}
