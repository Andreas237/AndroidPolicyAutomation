// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//			BeanPropertyMap, PropertyValueBuffer, PropertyValue, ObjectIdReader

public final class PropertyBasedCreator
{
	static class CaseInsensitiveMap extends HashMap
	{

		public SettableBeanProperty get(Object obj)
		{
			return (SettableBeanProperty)super.get(((Object) (((String)obj).toLowerCase())));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #21  <Class String>
		//    3    5:invokevirtual   #25  <Method String String.toLowerCase()>
		//    4    8:invokespecial   #28  <Method Object HashMap.get(Object)>
		//    5   11:checkcast       #30  <Class SettableBeanProperty>
		//    6   14:areturn         
		}

		public volatile Object get(Object obj)
		{
			return ((Object) (get(obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #32  <Method SettableBeanProperty get(Object)>
		//    3    5:areturn         
		}

		public SettableBeanProperty put(String s, SettableBeanProperty settablebeanproperty)
		{
			return (SettableBeanProperty)super.put(((Object) (s.toLowerCase())), ((Object) (settablebeanproperty)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #25  <Method String String.toLowerCase()>
		//    3    5:aload_2         
		//    4    6:invokespecial   #37  <Method Object HashMap.put(Object, Object)>
		//    5    9:checkcast       #30  <Class SettableBeanProperty>
		//    6   12:areturn         
		}

		public volatile Object put(Object obj, Object obj1)
		{
			return ((Object) (put((String)obj, (SettableBeanProperty)obj1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #21  <Class String>
		//    3    5:aload_2         
		//    4    6:checkcast       #30  <Class SettableBeanProperty>
		//    5    9:invokevirtual   #39  <Method SettableBeanProperty put(String, SettableBeanProperty)>
		//    6   12:areturn         
		}

		private static final long serialVersionUID = 1L;

		CaseInsensitiveMap()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void HashMap()>
		//    2    4:return          
		}
	}


	protected PropertyBasedCreator(DeserializationContext deserializationcontext, ValueInstantiator valueinstantiator, SettableBeanProperty asettablebeanproperty[], boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		_valueInstantiator = valueinstantiator;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #23  <Field ValueInstantiator _valueInstantiator>
		if(flag)
	//*   5    9:iload           4
	//*   6   11:ifeq            28
			_propertyLookup = ((HashMap) (new CaseInsensitiveMap()));
	//    7   14:aload_0         
	//    8   15:new             #6   <Class PropertyBasedCreator$CaseInsensitiveMap>
	//    9   18:dup             
	//   10   19:invokespecial   #24  <Method void PropertyBasedCreator$CaseInsensitiveMap()>
	//   11   22:putfield        #26  <Field HashMap _propertyLookup>
		else
	//*  12   25:goto            39
			_propertyLookup = new HashMap();
	//   13   28:aload_0         
	//   14   29:new             #28  <Class HashMap>
	//   15   32:dup             
	//   16   33:invokespecial   #29  <Method void HashMap()>
	//   17   36:putfield        #26  <Field HashMap _propertyLookup>
		int k = asettablebeanproperty.length;
	//   18   39:aload_3         
	//   19   40:arraylength     
	//   20   41:istore          9
		_propertyCount = k;
	//   21   43:aload_0         
	//   22   44:iload           9
	//   23   46:putfield        #31  <Field int _propertyCount>
		_allProperties = new SettableBeanProperty[k];
	//   24   49:aload_0         
	//   25   50:iload           9
	//   26   52:anewarray       SettableBeanProperty[]
	//   27   55:putfield        #35  <Field SettableBeanProperty[] _allProperties>
		boolean flag2 = false;
	//   28   58:iconst_0        
	//   29   59:istore          8
		int j = ((int) (flag2));
	//   30   61:iload           8
	//   31   63:istore          7
		if(flag1)
	//*  32   65:iload           5
	//*  33   67:ifeq            179
		{
			deserializationcontext = ((DeserializationContext) (deserializationcontext.getConfig()));
	//   34   70:aload_1         
	//   35   71:invokevirtual   #41  <Method com.fasterxml.jackson.databind.DeserializationConfig DeserializationContext.getConfig()>
	//   36   74:astore_1        
			int l = asettablebeanproperty.length;
	//   37   75:aload_3         
	//   38   76:arraylength     
	//   39   77:istore          10
			int i = 0;
	//   40   79:iconst_0        
	//   41   80:istore          6
			do
			{
				j = ((int) (flag2));
	//   42   82:iload           8
	//   43   84:istore          7
				if(i >= l)
					break;
	//   44   86:iload           6
	//   45   88:iload           10
	//   46   90:icmpge          179
				valueinstantiator = ((ValueInstantiator) (asettablebeanproperty[i]));
	//   47   93:aload_3         
	//   48   94:iload           6
	//   49   96:aaload          
	//   50   97:astore_2        
				if(!((SettableBeanProperty) (valueinstantiator)).isIgnorable())
	//*  51   98:aload_2         
	//*  52   99:invokevirtual   #45  <Method boolean SettableBeanProperty.isIgnorable()>
	//*  53  102:ifne            170
				{
					Object obj = ((Object) (((SettableBeanProperty) (valueinstantiator)).findAliases(((com.fasterxml.jackson.databind.cfg.MapperConfig) (deserializationcontext)))));
	//   54  105:aload_2         
	//   55  106:aload_1         
	//   56  107:invokevirtual   #49  <Method List SettableBeanProperty.findAliases(com.fasterxml.jackson.databind.cfg.MapperConfig)>
	//   57  110:astore          11
					if(!((List) (obj)).isEmpty())
	//*  58  112:aload           11
	//*  59  114:invokeinterface #54  <Method boolean List.isEmpty()>
	//*  60  119:ifne            170
					{
						PropertyName propertyname;
						for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); _propertyLookup.put(((Object) (propertyname.getSimpleName())), ((Object) (valueinstantiator))))
	//*  61  122:aload           11
	//*  62  124:invokeinterface #58  <Method Iterator List.iterator()>
	//*  63  129:astore          11
	//*  64  131:aload           11
	//*  65  133:invokeinterface #63  <Method boolean Iterator.hasNext()>
	//*  66  138:ifeq            170
							propertyname = (PropertyName)((Iterator) (obj)).next();
	//   67  141:aload           11
	//   68  143:invokeinterface #67  <Method Object Iterator.next()>
	//   69  148:checkcast       #69  <Class PropertyName>
	//   70  151:astore          12

	//   71  153:aload_0         
	//   72  154:getfield        #26  <Field HashMap _propertyLookup>
	//   73  157:aload           12
	//   74  159:invokevirtual   #73  <Method String PropertyName.getSimpleName()>
	//   75  162:aload_2         
	//   76  163:invokevirtual   #77  <Method Object HashMap.put(Object, Object)>
	//   77  166:pop             
					}
				}
	//*  78  167:goto            131
				i++;
	//   79  170:iload           6
	//   80  172:iconst_1        
	//   81  173:iadd            
	//   82  174:istore          6
			} while(true);
	//   83  176:goto            82
		}
		for(; j < k; j++)
	//*  84  179:iload           7
	//*  85  181:iload           9
	//*  86  183:icmpge          228
		{
			deserializationcontext = ((DeserializationContext) (asettablebeanproperty[j]));
	//   87  186:aload_3         
	//   88  187:iload           7
	//   89  189:aaload          
	//   90  190:astore_1        
			_allProperties[j] = ((SettableBeanProperty) (deserializationcontext));
	//   91  191:aload_0         
	//   92  192:getfield        #35  <Field SettableBeanProperty[] _allProperties>
	//   93  195:iload           7
	//   94  197:aload_1         
	//   95  198:aastore         
			if(!((SettableBeanProperty) (deserializationcontext)).isIgnorable())
	//*  96  199:aload_1         
	//*  97  200:invokevirtual   #45  <Method boolean SettableBeanProperty.isIgnorable()>
	//*  98  203:ifne            219
				_propertyLookup.put(((Object) (((SettableBeanProperty) (deserializationcontext)).getName())), ((Object) (deserializationcontext)));
	//   99  206:aload_0         
	//  100  207:getfield        #26  <Field HashMap _propertyLookup>
	//  101  210:aload_1         
	//  102  211:invokevirtual   #80  <Method String SettableBeanProperty.getName()>
	//  103  214:aload_1         
	//  104  215:invokevirtual   #77  <Method Object HashMap.put(Object, Object)>
	//  105  218:pop             
		}

	//  106  219:iload           7
	//  107  221:iconst_1        
	//  108  222:iadd            
	//  109  223:istore          7
	//* 110  225:goto            179
	//  111  228:return          
	}

	public static PropertyBasedCreator construct(DeserializationContext deserializationcontext, ValueInstantiator valueinstantiator, SettableBeanProperty asettablebeanproperty[], BeanPropertyMap beanpropertymap)
		throws JsonMappingException
	{
		int j = asettablebeanproperty.length;
	//    0    0:aload_2         
	//    1    1:arraylength     
	//    2    2:istore          5
		SettableBeanProperty asettablebeanproperty1[] = new SettableBeanProperty[j];
	//    3    4:iload           5
	//    4    6:anewarray       SettableBeanProperty[]
	//    5    9:astore          8
		for(int i = 0; i < j; i++)
	//*   6   11:iconst_0        
	//*   7   12:istore          4
	//*   8   14:iload           4
	//*   9   16:iload           5
	//*  10   18:icmpge          73
		{
			SettableBeanProperty settablebeanproperty1 = asettablebeanproperty[i];
	//   11   21:aload_2         
	//   12   22:iload           4
	//   13   24:aaload          
	//   14   25:astore          7
			SettableBeanProperty settablebeanproperty = settablebeanproperty1;
	//   15   27:aload           7
	//   16   29:astore          6
			if(!settablebeanproperty1.hasValueDeserializer())
	//*  17   31:aload           7
	//*  18   33:invokevirtual   #88  <Method boolean SettableBeanProperty.hasValueDeserializer()>
	//*  19   36:ifne            57
				settablebeanproperty = settablebeanproperty1.withValueDeserializer(deserializationcontext.findContextualValueDeserializer(settablebeanproperty1.getType(), ((com.fasterxml.jackson.databind.BeanProperty) (settablebeanproperty1))));
	//   20   39:aload           7
	//   21   41:aload_0         
	//   22   42:aload           7
	//   23   44:invokevirtual   #92  <Method com.fasterxml.jackson.databind.JavaType SettableBeanProperty.getType()>
	//   24   47:aload           7
	//   25   49:invokevirtual   #96  <Method com.fasterxml.jackson.databind.JsonDeserializer DeserializationContext.findContextualValueDeserializer(com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanProperty)>
	//   26   52:invokevirtual   #100 <Method SettableBeanProperty SettableBeanProperty.withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)>
	//   27   55:astore          6
			asettablebeanproperty1[i] = settablebeanproperty;
	//   28   57:aload           8
	//   29   59:iload           4
	//   30   61:aload           6
	//   31   63:aastore         
		}

	//   32   64:iload           4
	//   33   66:iconst_1        
	//   34   67:iadd            
	//   35   68:istore          4
	//*  36   70:goto            14
		return new PropertyBasedCreator(deserializationcontext, valueinstantiator, asettablebeanproperty1, beanpropertymap.isCaseInsensitive(), beanpropertymap.hasAliases());
	//   37   73:new             #2   <Class PropertyBasedCreator>
	//   38   76:dup             
	//   39   77:aload_0         
	//   40   78:aload_1         
	//   41   79:aload           8
	//   42   81:aload_3         
	//   43   82:invokevirtual   #105 <Method boolean BeanPropertyMap.isCaseInsensitive()>
	//   44   85:aload_3         
	//   45   86:invokevirtual   #108 <Method boolean BeanPropertyMap.hasAliases()>
	//   46   89:invokespecial   #110 <Method void PropertyBasedCreator(DeserializationContext, ValueInstantiator, SettableBeanProperty[], boolean, boolean)>
	//   47   92:areturn         
	}

	public static PropertyBasedCreator construct(DeserializationContext deserializationcontext, ValueInstantiator valueinstantiator, SettableBeanProperty asettablebeanproperty[], boolean flag)
		throws JsonMappingException
	{
		int j = asettablebeanproperty.length;
	//    0    0:aload_2         
	//    1    1:arraylength     
	//    2    2:istore          5
		SettableBeanProperty asettablebeanproperty1[] = new SettableBeanProperty[j];
	//    3    4:iload           5
	//    4    6:anewarray       SettableBeanProperty[]
	//    5    9:astore          8
		for(int i = 0; i < j; i++)
	//*   6   11:iconst_0        
	//*   7   12:istore          4
	//*   8   14:iload           4
	//*   9   16:iload           5
	//*  10   18:icmpge          73
		{
			SettableBeanProperty settablebeanproperty1 = asettablebeanproperty[i];
	//   11   21:aload_2         
	//   12   22:iload           4
	//   13   24:aaload          
	//   14   25:astore          7
			SettableBeanProperty settablebeanproperty = settablebeanproperty1;
	//   15   27:aload           7
	//   16   29:astore          6
			if(!settablebeanproperty1.hasValueDeserializer())
	//*  17   31:aload           7
	//*  18   33:invokevirtual   #88  <Method boolean SettableBeanProperty.hasValueDeserializer()>
	//*  19   36:ifne            57
				settablebeanproperty = settablebeanproperty1.withValueDeserializer(deserializationcontext.findContextualValueDeserializer(settablebeanproperty1.getType(), ((com.fasterxml.jackson.databind.BeanProperty) (settablebeanproperty1))));
	//   20   39:aload           7
	//   21   41:aload_0         
	//   22   42:aload           7
	//   23   44:invokevirtual   #92  <Method com.fasterxml.jackson.databind.JavaType SettableBeanProperty.getType()>
	//   24   47:aload           7
	//   25   49:invokevirtual   #96  <Method com.fasterxml.jackson.databind.JsonDeserializer DeserializationContext.findContextualValueDeserializer(com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanProperty)>
	//   26   52:invokevirtual   #100 <Method SettableBeanProperty SettableBeanProperty.withValueDeserializer(com.fasterxml.jackson.databind.JsonDeserializer)>
	//   27   55:astore          6
			asettablebeanproperty1[i] = settablebeanproperty;
	//   28   57:aload           8
	//   29   59:iload           4
	//   30   61:aload           6
	//   31   63:aastore         
		}

	//   32   64:iload           4
	//   33   66:iconst_1        
	//   34   67:iadd            
	//   35   68:istore          4
	//*  36   70:goto            14
		return new PropertyBasedCreator(deserializationcontext, valueinstantiator, asettablebeanproperty1, flag, false);
	//   37   73:new             #2   <Class PropertyBasedCreator>
	//   38   76:dup             
	//   39   77:aload_0         
	//   40   78:aload_1         
	//   41   79:aload           8
	//   42   81:iload_3         
	//   43   82:iconst_0        
	//   44   83:invokespecial   #110 <Method void PropertyBasedCreator(DeserializationContext, ValueInstantiator, SettableBeanProperty[], boolean, boolean)>
	//   45   86:areturn         
	}

	public Object build(DeserializationContext deserializationcontext, PropertyValueBuffer propertyvaluebuffer)
		throws IOException
	{
		Object obj1 = _valueInstantiator.createFromObjectWith(deserializationcontext, _allProperties, propertyvaluebuffer);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ValueInstantiator _valueInstantiator>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #35  <Field SettableBeanProperty[] _allProperties>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #122 <Method Object ValueInstantiator.createFromObjectWith(DeserializationContext, SettableBeanProperty[], PropertyValueBuffer)>
	//    7   13:astore          4
		Object obj = obj1;
	//    8   15:aload           4
	//    9   17:astore_3        
		if(obj1 != null)
	//*  10   18:aload           4
	//*  11   20:ifnull          58
		{
			obj1 = propertyvaluebuffer.handleIdValue(deserializationcontext, obj1);
	//   12   23:aload_2         
	//   13   24:aload_1         
	//   14   25:aload           4
	//   15   27:invokevirtual   #128 <Method Object PropertyValueBuffer.handleIdValue(DeserializationContext, Object)>
	//   16   30:astore          4
			deserializationcontext = ((DeserializationContext) (propertyvaluebuffer.buffered()));
	//   17   32:aload_2         
	//   18   33:invokevirtual   #132 <Method PropertyValue PropertyValueBuffer.buffered()>
	//   19   36:astore_1        
			do
			{
				obj = obj1;
	//   20   37:aload           4
	//   21   39:astore_3        
				if(deserializationcontext == null)
					break;
	//   22   40:aload_1         
	//   23   41:ifnull          58
				((PropertyValue) (deserializationcontext)).assign(obj1);
	//   24   44:aload_1         
	//   25   45:aload           4
	//   26   47:invokevirtual   #138 <Method void PropertyValue.assign(Object)>
				deserializationcontext = ((DeserializationContext) (((PropertyValue) (deserializationcontext)).next));
	//   27   50:aload_1         
	//   28   51:getfield        #141 <Field PropertyValue PropertyValue.next>
	//   29   54:astore_1        
			} while(true);
	//   30   55:goto            37
		}
		return obj;
	//   31   58:aload_3         
	//   32   59:areturn         
	}

	public SettableBeanProperty findCreatorProperty(String s)
	{
		return (SettableBeanProperty)_propertyLookup.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field HashMap _propertyLookup>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #147 <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #33  <Class SettableBeanProperty>
	//    5   11:areturn         
	}

	public PropertyValueBuffer startBuilding(JsonParser jsonparser, DeserializationContext deserializationcontext, ObjectIdReader objectidreader)
	{
		return new PropertyValueBuffer(jsonparser, deserializationcontext, _propertyCount, objectidreader);
	//    0    0:new             #124 <Class PropertyValueBuffer>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_0         
	//    5    7:getfield        #31  <Field int _propertyCount>
	//    6   10:aload_3         
	//    7   11:invokespecial   #152 <Method void PropertyValueBuffer(JsonParser, DeserializationContext, int, ObjectIdReader)>
	//    8   14:areturn         
	}

	protected final SettableBeanProperty _allProperties[];
	protected final int _propertyCount;
	protected final HashMap _propertyLookup;
	protected final ValueInstantiator _valueInstantiator;
}
