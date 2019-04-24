// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind:
//			InjectableValues, BeanProperty, DeserializationContext

public static class InjectableValues$Std extends InjectableValues
	implements Serializable
{

	public InjectableValues$Std addValue(Class class1, Object obj)
	{
		_values.put(((Object) (class1.getName())), obj);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Map _values>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #37  <Method String Class.getName()>
	//    4    8:aload_2         
	//    5    9:invokeinterface #43  <Method Object Map.put(Object, Object)>
	//    6   14:pop             
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public InjectableValues$Std addValue(String s, Object obj)
	{
		_values.put(((Object) (s)), obj);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Map _values>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #43  <Method Object Map.put(Object, Object)>
	//    5   11:pop             
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public Object findInjectableValue(Object obj, DeserializationContext deserializationcontext, BeanProperty beanproperty, Object obj1)
	{
		if(!(obj instanceof String))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #49  <Class String>
	//*   2    4:ifne            57
		{
			if(obj == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       46
				obj = "[null]";
	//    5   11:ldc1            #51  <String "[null]">
	//    6   13:astore_1        
			else
	//*   7   14:new             #53  <Class IllegalArgumentException>
	//*   8   17:dup             
	//*   9   18:new             #55  <Class StringBuilder>
	//*  10   21:dup             
	//*  11   22:invokespecial   #56  <Method void StringBuilder()>
	//*  12   25:ldc1            #58  <String "Unrecognized inject value id type (">
	//*  13   27:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//*  14   30:aload_1         
	//*  15   31:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//*  16   34:ldc1            #64  <String "), expecting String">
	//*  17   36:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//*  18   39:invokevirtual   #67  <Method String StringBuilder.toString()>
	//*  19   42:invokespecial   #70  <Method void IllegalArgumentException(String)>
	//*  20   45:athrow          
				obj = ((Object) (obj.getClass().getName()));
	//   21   46:aload_1         
	//   22   47:invokevirtual   #76  <Method Class Object.getClass()>
	//   23   50:invokevirtual   #37  <Method String Class.getName()>
	//   24   53:astore_1        
			throw new IllegalArgumentException((new StringBuilder()).append("Unrecognized inject value id type (").append(((String) (obj))).append("), expecting String").toString());
		}
	//*  25   54:goto            14
		obj = ((Object) ((String)obj));
	//   26   57:aload_1         
	//   27   58:checkcast       #49  <Class String>
	//   28   61:astore_1        
		deserializationcontext = ((DeserializationContext) (_values.get(obj)));
	//   29   62:aload_0         
	//   30   63:getfield        #27  <Field Map _values>
	//   31   66:aload_1         
	//   32   67:invokeinterface #80  <Method Object Map.get(Object)>
	//   33   72:astore_2        
		if(deserializationcontext == null && !_values.containsKey(obj))
	//*  34   73:aload_2         
	//*  35   74:ifnonnull       136
	//*  36   77:aload_0         
	//*  37   78:getfield        #27  <Field Map _values>
	//*  38   81:aload_1         
	//*  39   82:invokeinterface #84  <Method boolean Map.containsKey(Object)>
	//*  40   87:ifne            136
			throw new IllegalArgumentException((new StringBuilder()).append("No injectable id with value '").append(((String) (obj))).append("' found (for property '").append(beanproperty.getName()).append("')").toString());
	//   41   90:new             #53  <Class IllegalArgumentException>
	//   42   93:dup             
	//   43   94:new             #55  <Class StringBuilder>
	//   44   97:dup             
	//   45   98:invokespecial   #56  <Method void StringBuilder()>
	//   46  101:ldc1            #86  <String "No injectable id with value '">
	//   47  103:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   48  106:aload_1         
	//   49  107:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   50  110:ldc1            #88  <String "' found (for property '">
	//   51  112:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   52  115:aload_3         
	//   53  116:invokeinterface #91  <Method String BeanProperty.getName()>
	//   54  121:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   55  124:ldc1            #93  <String "')">
	//   56  126:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   57  129:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   58  132:invokespecial   #70  <Method void IllegalArgumentException(String)>
	//   59  135:athrow          
		else
			return ((Object) (deserializationcontext));
	//   60  136:aload_2         
	//   61  137:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final Map _values;

	public InjectableValues$Std()
	{
		this(((Map) (new HashMap())));
	//    0    0:aload_0         
	//    1    1:new             #18  <Class HashMap>
	//    2    4:dup             
	//    3    5:invokespecial   #20  <Method void HashMap()>
	//    4    8:invokespecial   #23  <Method void InjectableValues$Std(Map)>
	//    5   11:return          
	}

	public InjectableValues$Std(Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void InjectableValues()>
		_values = map;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field Map _values>
	//    5    9:return          
	}
}
