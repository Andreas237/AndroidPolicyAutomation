// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JsonSerializer;

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//			PropertySerializerMap

private static final class PropertySerializerMap$Double extends PropertySerializerMap
{

	public PropertySerializerMap newWith(Class class1, JsonSerializer jsonserializer)
	{
		return ((PropertySerializerMap) (new PropertySerializerMap.Multi(((PropertySerializerMap) (this)), new Serializer[] {
			new Serializer(_type1, _serializer1), new Serializer(_type2, _serializer2), new Serializer(class1, jsonserializer)
		})));
	//    0    0:new             #33  <Class PropertySerializerMap$Multi>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:anewarray       Serializer[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:new             #35  <Class PropertySerializerMap$TypeAndSerializer>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:getfield        #20  <Field Class _type1>
	//   11   19:aload_0         
	//   12   20:getfield        #22  <Field JsonSerializer _serializer1>
	//   13   23:invokespecial   #38  <Method void PropertySerializerMap$TypeAndSerializer(Class, JsonSerializer)>
	//   14   26:aastore         
	//   15   27:dup             
	//   16   28:iconst_1        
	//   17   29:new             #35  <Class PropertySerializerMap$TypeAndSerializer>
	//   18   32:dup             
	//   19   33:aload_0         
	//   20   34:getfield        #24  <Field Class _type2>
	//   21   37:aload_0         
	//   22   38:getfield        #26  <Field JsonSerializer _serializer2>
	//   23   41:invokespecial   #38  <Method void PropertySerializerMap$TypeAndSerializer(Class, JsonSerializer)>
	//   24   44:aastore         
	//   25   45:dup             
	//   26   46:iconst_2        
	//   27   47:new             #35  <Class PropertySerializerMap$TypeAndSerializer>
	//   28   50:dup             
	//   29   51:aload_1         
	//   30   52:aload_2         
	//   31   53:invokespecial   #38  <Method void PropertySerializerMap$TypeAndSerializer(Class, JsonSerializer)>
	//   32   56:aastore         
	//   33   57:invokespecial   #41  <Method void PropertySerializerMap$Multi(PropertySerializerMap, PropertySerializerMap$TypeAndSerializer[])>
	//   34   60:areturn         
	}

	public JsonSerializer serializerFor(Class class1)
	{
		if(class1 == _type1)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #20  <Field Class _type1>
	//*   3    5:if_acmpne       13
			return _serializer1;
	//    4    8:aload_0         
	//    5    9:getfield        #22  <Field JsonSerializer _serializer1>
	//    6   12:areturn         
		if(class1 == _type2)
	//*   7   13:aload_1         
	//*   8   14:aload_0         
	//*   9   15:getfield        #24  <Field Class _type2>
	//*  10   18:if_acmpne       26
			return _serializer2;
	//   11   21:aload_0         
	//   12   22:getfield        #26  <Field JsonSerializer _serializer2>
	//   13   25:areturn         
		else
			return null;
	//   14   26:aconst_null     
	//   15   27:areturn         
	}

	private final JsonSerializer _serializer1;
	private final JsonSerializer _serializer2;
	private final Class _type1;
	private final Class _type2;

	public PropertySerializerMap$Double(PropertySerializerMap propertyserializermap, Class class1, JsonSerializer jsonserializer, Class class2, JsonSerializer jsonserializer1)
	{
		super(propertyserializermap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void PropertySerializerMap(PropertySerializerMap)>
		_type1 = class1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field Class _type1>
		_serializer1 = jsonserializer;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #22  <Field JsonSerializer _serializer1>
		_type2 = class2;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #24  <Field Class _type2>
		_serializer2 = jsonserializer1;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #26  <Field JsonSerializer _serializer2>
	//   15   27:return          
	}
}
