// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//			PropertyValueBuffer, PropertyValue, ObjectIdReader

public final class PropertyBasedCreator
{

	protected PropertyBasedCreator(ValueInstantiator valueinstantiator, SettableBeanProperty asettablebeanproperty[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		_valueInstantiator = valueinstantiator;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field ValueInstantiator _valueInstantiator>
	//    5    9:aload_0         
	//    6   10:new             #22  <Class HashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #23  <Method void HashMap()>
	//    9   17:putfield        #25  <Field HashMap _propertyLookup>
		int j = asettablebeanproperty.length;
	//   10   20:aload_2         
	//   11   21:arraylength     
	//   12   22:istore          4
		_propertyCount = j;
	//   13   24:aload_0         
	//   14   25:iload           4
	//   15   27:putfield        #27  <Field int _propertyCount>
		_allProperties = new SettableBeanProperty[j];
	//   16   30:aload_0         
	//   17   31:iload           4
	//   18   33:anewarray       SettableBeanProperty[]
	//   19   36:putfield        #31  <Field SettableBeanProperty[] _allProperties>
		for(int i = 0; i < j; i++)
	//*  20   39:iconst_0        
	//*  21   40:istore_3        
	//*  22   41:iload_3         
	//*  23   42:iload           4
	//*  24   44:icmpge          78
		{
			valueinstantiator = ((ValueInstantiator) (asettablebeanproperty[i]));
	//   25   47:aload_2         
	//   26   48:iload_3         
	//   27   49:aaload          
	//   28   50:astore_1        
			_allProperties[i] = ((SettableBeanProperty) (valueinstantiator));
	//   29   51:aload_0         
	//   30   52:getfield        #31  <Field SettableBeanProperty[] _allProperties>
	//   31   55:iload_3         
	//   32   56:aload_1         
	//   33   57:aastore         
			_propertyLookup.put(((Object) (((SettableBeanProperty) (valueinstantiator)).getName())), ((Object) (valueinstantiator)));
	//   34   58:aload_0         
	//   35   59:getfield        #25  <Field HashMap _propertyLookup>
	//   36   62:aload_1         
	//   37   63:invokevirtual   #35  <Method String SettableBeanProperty.getName()>
	//   38   66:aload_1         
	//   39   67:invokevirtual   #39  <Method Object HashMap.put(Object, Object)>
	//   40   70:pop             
		}

	//   41   71:iload_3         
	//   42   72:iconst_1        
	//   43   73:iadd            
	//   44   74:istore_3        
	//*  45   75:goto            41
	//   46   78:return          
	}

	public static PropertyBasedCreator construct(DeserializationContext deserializationcontext, ValueInstantiator valueinstantiator, SettableBeanProperty asettablebeanproperty[])
		throws JsonMappingException
	{
		int j = asettablebeanproperty.length;
	//    0    0:aload_2         
	//    1    1:arraylength     
	//    2    2:istore          4
		SettableBeanProperty asettablebeanproperty1[] = new SettableBeanProperty[j];
	//    3    4:iload           4
	//    4    6:anewarray       SettableBeanProperty[]
	//    5    9:astore          7
		for(int i = 0; i < j; i++)
	//*   6   11:iconst_0        
	//*   7   12:istore_3        
	//*   8   13:iload_3         
	//*   9   14:iload           4
	//*  10   16:icmpge          67
		{
			SettableBeanProperty settablebeanproperty1 = asettablebeanproperty[i];
	//   11   19:aload_2         
	//   12   20:iload_3         
	//   13   21:aaload          
	//   14   22:astore          6
			SettableBeanProperty settablebeanproperty = settablebeanproperty1;
	//   15   24:aload           6
	//   16   26:astore          5
			if(!settablebeanproperty1.hasValueDeserializer())
	//*  17   28:aload           6
	//*  18   30:invokevirtual   #48  <Method boolean SettableBeanProperty.hasValueDeserializer()>
	//*  19   33:ifne            54
				settablebeanproperty = settablebeanproperty1.withValueDeserializer(deserializationcontext.findContextualValueDeserializer(settablebeanproperty1.getType(), ((com.fasterxml.jackson.databind.BeanProperty) (settablebeanproperty1))));
	//   20   36:aload           6
	//   21   38:aload_0         
	//   22   39:aload           6
	//   23   41:invokevirtual   #52  <Method com.fasterxml.jackson.databind.JavaType SettableBeanProperty.getType()>
	//   24   44:aload           6
	//   25   46:invokevirtual   #58  <Method com.fasterxml.jackson.databind.JsonDeserializer DeserializationContext.findContextualValueDeserializer(com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanProperty)>
	//   26   49:invokevirtual   #62  <Method SettableBeanProperty SettableBeanProperty.withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)>
	//   27   52:astore          5
			asettablebeanproperty1[i] = settablebeanproperty;
	//   28   54:aload           7
	//   29   56:iload_3         
	//   30   57:aload           5
	//   31   59:aastore         
		}

	//   32   60:iload_3         
	//   33   61:iconst_1        
	//   34   62:iadd            
	//   35   63:istore_3        
	//*  36   64:goto            13
		return new PropertyBasedCreator(valueinstantiator, asettablebeanproperty1);
	//   37   67:new             #2   <Class PropertyBasedCreator>
	//   38   70:dup             
	//   39   71:aload_1         
	//   40   72:aload           7
	//   41   74:invokespecial   #64  <Method void PropertyBasedCreator(ValueInstantiator, SettableBeanProperty[])>
	//   42   77:areturn         
	}

	public Object build(DeserializationContext deserializationcontext, PropertyValueBuffer propertyvaluebuffer)
		throws IOException
	{
		Object obj1 = _valueInstantiator.createFromObjectWith(deserializationcontext, propertyvaluebuffer.getParameters(_allProperties));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ValueInstantiator _valueInstantiator>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_0         
	//    5    7:getfield        #31  <Field SettableBeanProperty[] _allProperties>
	//    6   10:invokevirtual   #75  <Method Object[] PropertyValueBuffer.getParameters(SettableBeanProperty[])>
	//    7   13:invokevirtual   #81  <Method Object ValueInstantiator.createFromObjectWith(DeserializationContext, Object[])>
	//    8   16:astore          4
		Object obj = obj1;
	//    9   18:aload           4
	//   10   20:astore_3        
		if(obj1 != null)
	//*  11   21:aload           4
	//*  12   23:ifnull          61
		{
			obj1 = propertyvaluebuffer.handleIdValue(deserializationcontext, obj1);
	//   13   26:aload_2         
	//   14   27:aload_1         
	//   15   28:aload           4
	//   16   30:invokevirtual   #85  <Method Object PropertyValueBuffer.handleIdValue(DeserializationContext, Object)>
	//   17   33:astore          4
			deserializationcontext = ((DeserializationContext) (propertyvaluebuffer.buffered()));
	//   18   35:aload_2         
	//   19   36:invokevirtual   #89  <Method PropertyValue PropertyValueBuffer.buffered()>
	//   20   39:astore_1        
			do
			{
				obj = obj1;
	//   21   40:aload           4
	//   22   42:astore_3        
				if(deserializationcontext == null)
					break;
	//   23   43:aload_1         
	//   24   44:ifnull          61
				((PropertyValue) (deserializationcontext)).assign(obj1);
	//   25   47:aload_1         
	//   26   48:aload           4
	//   27   50:invokevirtual   #95  <Method void PropertyValue.assign(Object)>
				deserializationcontext = ((DeserializationContext) (((PropertyValue) (deserializationcontext)).next));
	//   28   53:aload_1         
	//   29   54:getfield        #99  <Field PropertyValue PropertyValue.next>
	//   30   57:astore_1        
			} while(true);
	//   31   58:goto            40
		}
		return obj;
	//   32   61:aload_3         
	//   33   62:areturn         
	}

	public SettableBeanProperty findCreatorProperty(int i)
	{
		for(Iterator iterator = _propertyLookup.values().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field HashMap _propertyLookup>
	//*   2    4:invokevirtual   #105 <Method Collection HashMap.values()>
	//*   3    7:invokeinterface #111 <Method Iterator Collection.iterator()>
	//*   4   12:astore_2        
	//*   5   13:aload_2         
	//*   6   14:invokeinterface #116 <Method boolean Iterator.hasNext()>
	//*   7   19:ifeq            42
		{
			SettableBeanProperty settablebeanproperty = (SettableBeanProperty)iterator.next();
	//    8   22:aload_2         
	//    9   23:invokeinterface #119 <Method Object Iterator.next()>
	//   10   28:checkcast       #29  <Class SettableBeanProperty>
	//   11   31:astore_3        
			if(settablebeanproperty.getPropertyIndex() == i)
	//*  12   32:aload_3         
	//*  13   33:invokevirtual   #123 <Method int SettableBeanProperty.getPropertyIndex()>
	//*  14   36:iload_1         
	//*  15   37:icmpne          13
				return settablebeanproperty;
	//   16   40:aload_3         
	//   17   41:areturn         
		}

		return null;
	//   18   42:aconst_null     
	//   19   43:areturn         
	}

	public SettableBeanProperty findCreatorProperty(String s)
	{
		return (SettableBeanProperty)_propertyLookup.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field HashMap _propertyLookup>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #128 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #29  <Class SettableBeanProperty>
	//    5   11:areturn         
	}

	public Collection properties()
	{
		return _propertyLookup.values();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field HashMap _propertyLookup>
	//    2    4:invokevirtual   #105 <Method Collection HashMap.values()>
	//    3    7:areturn         
	}

	public PropertyValueBuffer startBuilding(JsonParser jsonparser, DeserializationContext deserializationcontext, ObjectIdReader objectidreader)
	{
		return new PropertyValueBuffer(jsonparser, deserializationcontext, _propertyCount, objectidreader);
	//    0    0:new             #71  <Class PropertyValueBuffer>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_0         
	//    5    7:getfield        #27  <Field int _propertyCount>
	//    6   10:aload_3         
	//    7   11:invokespecial   #136 <Method void PropertyValueBuffer(JsonParser, DeserializationContext, int, ObjectIdReader)>
	//    8   14:areturn         
	}

	protected final SettableBeanProperty _allProperties[];
	protected final int _propertyCount;
	protected final HashMap _propertyLookup = new HashMap();
	protected final ValueInstantiator _valueInstantiator;
}
