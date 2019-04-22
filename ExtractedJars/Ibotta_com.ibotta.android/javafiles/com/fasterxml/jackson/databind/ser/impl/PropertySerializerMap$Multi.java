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
		dSerializer adserializer[] = _entries;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field PropertySerializerMap$TypeAndSerializer[] _entries>
	//    2    4:astore          4
		int i = adserializer.length;
	//    3    6:aload           4
	//    4    8:arraylength     
	//    5    9:istore_3        
		if(i == 8)
	//*   6   10:iload_3         
	//*   7   11:bipush          8
	//*   8   13:icmpne          36
		{
			if(_resetWhenFull)
	//*   9   16:aload_0         
	//*  10   17:getfield        #21  <Field boolean _resetWhenFull>
	//*  11   20:ifeq            34
				return ((PropertySerializerMap) (new (((PropertySerializerMap) (this)), class1, jsonserializer)));
	//   12   23:new             #23  <Class PropertySerializerMap$Single>
	//   13   26:dup             
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:aload_2         
	//   17   30:invokespecial   #26  <Method void PropertySerializerMap$Single(PropertySerializerMap, Class, JsonSerializer)>
	//   18   33:areturn         
			else
				return ((PropertySerializerMap) (this));
	//   19   34:aload_0         
	//   20   35:areturn         
		} else
		{
			adserializer = (dSerializer[])Arrays.copyOf(((Object []) (adserializer)), i + 1);
	//   21   36:aload           4
	//   22   38:iload_3         
	//   23   39:iconst_1        
	//   24   40:iadd            
	//   25   41:invokestatic    #32  <Method Object[] Arrays.copyOf(Object[], int)>
	//   26   44:checkcast       #33  <Class PropertySerializerMap$TypeAndSerializer[]>
	//   27   47:astore          4
			adserializer[i] = new dSerializer(class1, jsonserializer);
	//   28   49:aload           4
	//   29   51:iload_3         
	//   30   52:new             #35  <Class PropertySerializerMap$TypeAndSerializer>
	//   31   55:dup             
	//   32   56:aload_1         
	//   33   57:aload_2         
	//   34   58:invokespecial   #38  <Method void PropertySerializerMap$TypeAndSerializer(Class, JsonSerializer)>
	//   35   61:aastore         
			return ((PropertySerializerMap) (new PropertySerializerMap$Multi(((PropertySerializerMap) (this)), adserializer)));
	//   36   62:new             #2   <Class PropertySerializerMap$Multi>
	//   37   65:dup             
	//   38   66:aload_0         
	//   39   67:aload           4
	//   40   69:invokespecial   #40  <Method void PropertySerializerMap$Multi(PropertySerializerMap, PropertySerializerMap$TypeAndSerializer[])>
	//   41   72:areturn         
		}
	}

	public JsonSerializer serializerFor(Class class1)
	{
		int j = _entries.length;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field PropertySerializerMap$TypeAndSerializer[] _entries>
	//    2    4:arraylength     
	//    3    5:istore_3        
		for(int i = 0; i < j; i++)
	//*   4    6:iconst_0        
	//*   5    7:istore_2        
	//*   6    8:iload_2         
	//*   7    9:iload_3         
	//*   8   10:icmpge          43
		{
			dSerializer dserializer = _entries[i];
	//    9   13:aload_0         
	//   10   14:getfield        #14  <Field PropertySerializerMap$TypeAndSerializer[] _entries>
	//   11   17:iload_2         
	//   12   18:aaload          
	//   13   19:astore          4
			if(dserializer.type == class1)
	//*  14   21:aload           4
	//*  15   23:getfield        #48  <Field Class PropertySerializerMap$TypeAndSerializer.type>
	//*  16   26:aload_1         
	//*  17   27:if_acmpne       36
				return dserializer.serializer;
	//   18   30:aload           4
	//   19   32:getfield        #52  <Field JsonSerializer PropertySerializerMap$TypeAndSerializer.serializer>
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

	private final dSerializer _entries[];

	public PropertySerializerMap$Multi(PropertySerializerMap propertyserializermap, dSerializer adserializer[])
	{
		super(propertyserializermap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void PropertySerializerMap(PropertySerializerMap)>
		_entries = adserializer;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #14  <Field PropertySerializerMap$TypeAndSerializer[] _entries>
	//    6   10:return          
	}
}
