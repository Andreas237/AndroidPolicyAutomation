// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Arrays;

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//			PropertySerializerMap

private static final class PropertySerializerMap$Multi extends PropertySerializerMap
{

	public PropertySerializerMap newWith(Class class1, JsonSerializer jsonserializer)
	{
		int i = _entries.length;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field PropertySerializerMap$TypeAndSerializer[] _entries>
	//    2    4:arraylength     
	//    3    5:istore_3        
		if(i == 8)
	//*   4    6:iload_3         
	//*   5    7:bipush          8
	//*   6    9:icmpne          37
		{
			Object obj = ((Object) (this));
	//    7   12:aload_0         
	//    8   13:astore          4
			if(_resetWhenFull)
	//*   9   15:aload_0         
	//*  10   16:getfield        #24  <Field boolean _resetWhenFull>
	//*  11   19:ifeq            34
				obj = ((Object) (new (((PropertySerializerMap) (this)), class1, jsonserializer)));
	//   12   22:new             #26  <Class PropertySerializerMap$Single>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:aload_2         
	//   17   29:invokespecial   #29  <Method void PropertySerializerMap$Single(PropertySerializerMap, Class, JsonSerializer)>
	//   18   32:astore          4
			return ((PropertySerializerMap) (obj));
	//   19   34:aload           4
	//   20   36:areturn         
		} else
		{
			dSerializer adserializer[] = (dSerializer[])Arrays.copyOf(((Object []) (_entries)), i + 1);
	//   21   37:aload_0         
	//   22   38:getfield        #17  <Field PropertySerializerMap$TypeAndSerializer[] _entries>
	//   23   41:iload_3         
	//   24   42:iconst_1        
	//   25   43:iadd            
	//   26   44:invokestatic    #35  <Method Object[] Arrays.copyOf(Object[], int)>
	//   27   47:checkcast       #36  <Class PropertySerializerMap$TypeAndSerializer[]>
	//   28   50:astore          4
			adserializer[i] = new dSerializer(class1, jsonserializer);
	//   29   52:aload           4
	//   30   54:iload_3         
	//   31   55:new             #38  <Class PropertySerializerMap$TypeAndSerializer>
	//   32   58:dup             
	//   33   59:aload_1         
	//   34   60:aload_2         
	//   35   61:invokespecial   #41  <Method void PropertySerializerMap$TypeAndSerializer(Class, JsonSerializer)>
	//   36   64:aastore         
			return ((PropertySerializerMap) (new PropertySerializerMap$Multi(((PropertySerializerMap) (this)), adserializer)));
	//   37   65:new             #2   <Class PropertySerializerMap$Multi>
	//   38   68:dup             
	//   39   69:aload_0         
	//   40   70:aload           4
	//   41   72:invokespecial   #43  <Method void PropertySerializerMap$Multi(PropertySerializerMap, PropertySerializerMap$TypeAndSerializer[])>
	//   42   75:areturn         
		}
	}

	public JsonSerializer serializerFor(Class class1)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		for(int j = _entries.length; i < j; i++)
	//*   2    2:aload_0         
	//*   3    3:getfield        #17  <Field PropertySerializerMap$TypeAndSerializer[] _entries>
	//*   4    6:arraylength     
	//*   5    7:istore_3        
	//*   6    8:iload_2         
	//*   7    9:iload_3         
	//*   8   10:icmpge          43
		{
			dSerializer dserializer = _entries[i];
	//    9   13:aload_0         
	//   10   14:getfield        #17  <Field PropertySerializerMap$TypeAndSerializer[] _entries>
	//   11   17:iload_2         
	//   12   18:aaload          
	//   13   19:astore          4
			if(dserializer.type == class1)
	//*  14   21:aload           4
	//*  15   23:getfield        #51  <Field Class PropertySerializerMap$TypeAndSerializer.type>
	//*  16   26:aload_1         
	//*  17   27:if_acmpne       36
				return dserializer.serializer;
	//   18   30:aload           4
	//   19   32:getfield        #55  <Field JsonSerializer PropertySerializerMap$TypeAndSerializer.serializer>
	//   20   35:areturn         
		}

	//   21   36:iload_2         
	//   22   37:iconst_1        
	//   23   38:iadd            
	//   24   39:istore_2        
	//*  25   40:goto            8
		return null;
	//   26   43:aconst_null     
	//   27   44:areturn         
	}

	private static final int MAX_ENTRIES = 8;
	private final dSerializer _entries[];

	public PropertySerializerMap$Multi(PropertySerializerMap propertyserializermap, dSerializer adserializer[])
	{
		super(propertyserializermap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void PropertySerializerMap(PropertySerializerMap)>
		_entries = adserializer;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #17  <Field PropertySerializerMap$TypeAndSerializer[] _entries>
	//    6   10:return          
	}
}
