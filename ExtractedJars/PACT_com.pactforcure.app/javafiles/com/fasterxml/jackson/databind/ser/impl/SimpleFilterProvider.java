// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.ser.*;
import java.io.Serializable;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//			SimpleBeanPropertyFilter

public class SimpleFilterProvider extends FilterProvider
	implements Serializable
{

	public SimpleFilterProvider()
	{
		this(((Map) (new HashMap())));
	//    0    0:aload_0         
	//    1    1:new             #21  <Class HashMap>
	//    2    4:dup             
	//    3    5:invokespecial   #23  <Method void HashMap()>
	//    4    8:invokespecial   #26  <Method void SimpleFilterProvider(Map)>
	//    5   11:return          
	}

	public SimpleFilterProvider(Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void FilterProvider()>
		_cfgFailOnUnknownId = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #30  <Field boolean _cfgFailOnUnknownId>
		for(Iterator iterator = map.values().iterator(); iterator.hasNext();)
	//*   5    9:aload_1         
	//*   6   10:invokeinterface #36  <Method Collection Map.values()>
	//*   7   15:invokeinterface #42  <Method Iterator Collection.iterator()>
	//*   8   20:astore_2        
	//*   9   21:aload_2         
	//*  10   22:invokeinterface #48  <Method boolean Iterator.hasNext()>
	//*  11   27:ifeq            51
			if(!(iterator.next() instanceof PropertyFilter))
	//*  12   30:aload_2         
	//*  13   31:invokeinterface #52  <Method Object Iterator.next()>
	//*  14   36:instanceof      #54  <Class PropertyFilter>
	//*  15   39:ifne            21
			{
				_filtersById = _convert(map);
	//   16   42:aload_0         
	//   17   43:aload_1         
	//   18   44:invokestatic    #58  <Method Map _convert(Map)>
	//   19   47:putfield        #60  <Field Map _filtersById>
				return;
	//   20   50:return          
			}

		_filtersById = map;
	//   21   51:aload_0         
	//   22   52:aload_1         
	//   23   53:putfield        #60  <Field Map _filtersById>
	//   24   56:return          
	}

	private static final PropertyFilter _convert(BeanPropertyFilter beanpropertyfilter)
	{
		return SimpleBeanPropertyFilter.from(beanpropertyfilter);
	//    0    0:aload_0         
	//    1    1:invokestatic    #68  <Method PropertyFilter SimpleBeanPropertyFilter.from(BeanPropertyFilter)>
	//    2    4:areturn         
	}

	private static final Map _convert(Map map)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #21  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void HashMap()>
	//    3    7:astore_1        
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext();)
	//*   4    8:aload_0         
	//*   5    9:invokeinterface #72  <Method Set Map.entrySet()>
	//*   6   14:invokeinterface #75  <Method Iterator Set.iterator()>
	//*   7   19:astore_0        
	//*   8   20:aload_0         
	//*   9   21:invokeinterface #48  <Method boolean Iterator.hasNext()>
	//*  10   26:ifeq            137
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   11   29:aload_0         
	//   12   30:invokeinterface #52  <Method Object Iterator.next()>
	//   13   35:checkcast       #77  <Class java.util.Map$Entry>
	//   14   38:astore_2        
			Object obj = entry.getValue();
	//   15   39:aload_2         
	//   16   40:invokeinterface #80  <Method Object java.util.Map$Entry.getValue()>
	//   17   45:astore_3        
			if(obj instanceof PropertyFilter)
	//*  18   46:aload_3         
	//*  19   47:instanceof      #54  <Class PropertyFilter>
	//*  20   50:ifeq            71
				hashmap.put(entry.getKey(), ((Object) ((PropertyFilter)obj)));
	//   21   53:aload_1         
	//   22   54:aload_2         
	//   23   55:invokeinterface #83  <Method Object java.util.Map$Entry.getKey()>
	//   24   60:aload_3         
	//   25   61:checkcast       #54  <Class PropertyFilter>
	//   26   64:invokevirtual   #87  <Method Object HashMap.put(Object, Object)>
	//   27   67:pop             
			else
	//*  28   68:goto            20
			if(obj instanceof BeanPropertyFilter)
	//*  29   71:aload_3         
	//*  30   72:instanceof      #89  <Class BeanPropertyFilter>
	//*  31   75:ifeq            99
				hashmap.put(entry.getKey(), ((Object) (_convert((BeanPropertyFilter)obj))));
	//   32   78:aload_1         
	//   33   79:aload_2         
	//   34   80:invokeinterface #83  <Method Object java.util.Map$Entry.getKey()>
	//   35   85:aload_3         
	//   36   86:checkcast       #89  <Class BeanPropertyFilter>
	//   37   89:invokestatic    #91  <Method PropertyFilter _convert(BeanPropertyFilter)>
	//   38   92:invokevirtual   #87  <Method Object HashMap.put(Object, Object)>
	//   39   95:pop             
			else
	//*  40   96:goto            20
				throw new IllegalArgumentException((new StringBuilder()).append("Unrecognized filter type (").append(obj.getClass().getName()).append(")").toString());
	//   41   99:new             #93  <Class IllegalArgumentException>
	//   42  102:dup             
	//   43  103:new             #95  <Class StringBuilder>
	//   44  106:dup             
	//   45  107:invokespecial   #96  <Method void StringBuilder()>
	//   46  110:ldc1            #98  <String "Unrecognized filter type (">
	//   47  112:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   48  115:aload_3         
	//   49  116:invokevirtual   #108 <Method Class Object.getClass()>
	//   50  119:invokevirtual   #114 <Method String Class.getName()>
	//   51  122:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   52  125:ldc1            #116 <String ")">
	//   53  127:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   54  130:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   55  133:invokespecial   #122 <Method void IllegalArgumentException(String)>
	//   56  136:athrow          
		}

		return ((Map) (hashmap));
	//   57  137:aload_1         
	//   58  138:areturn         
	}

	public SimpleFilterProvider addFilter(String s, BeanPropertyFilter beanpropertyfilter)
	{
		_filtersById.put(((Object) (s)), ((Object) (_convert(beanpropertyfilter))));
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Map _filtersById>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #91  <Method PropertyFilter _convert(BeanPropertyFilter)>
	//    5    9:invokeinterface #127 <Method Object Map.put(Object, Object)>
	//    6   14:pop             
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public SimpleFilterProvider addFilter(String s, PropertyFilter propertyfilter)
	{
		_filtersById.put(((Object) (s)), ((Object) (propertyfilter)));
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Map _filtersById>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #127 <Method Object Map.put(Object, Object)>
	//    5   11:pop             
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public SimpleFilterProvider addFilter(String s, SimpleBeanPropertyFilter simplebeanpropertyfilter)
	{
		_filtersById.put(((Object) (s)), ((Object) (simplebeanpropertyfilter)));
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Map _filtersById>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #127 <Method Object Map.put(Object, Object)>
	//    5   11:pop             
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public BeanPropertyFilter findFilter(Object obj)
	{
		throw new UnsupportedOperationException("Access to deprecated filters not supported");
	//    0    0:new             #134 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #136 <String "Access to deprecated filters not supported">
	//    3    6:invokespecial   #137 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public PropertyFilter findPropertyFilter(Object obj, Object obj1)
	{
		PropertyFilter propertyfilter = (PropertyFilter)_filtersById.get(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Map _filtersById>
	//    2    4:aload_1         
	//    3    5:invokeinterface #143 <Method Object Map.get(Object)>
	//    4   10:checkcast       #54  <Class PropertyFilter>
	//    5   13:astore_3        
		obj1 = ((Object) (propertyfilter));
	//    6   14:aload_3         
	//    7   15:astore_2        
		if(propertyfilter == null)
	//*   8   16:aload_3         
	//*   9   17:ifnonnull       87
		{
			PropertyFilter propertyfilter1 = _defaultFilter;
	//   10   20:aload_0         
	//   11   21:getfield        #145 <Field PropertyFilter _defaultFilter>
	//   12   24:astore_3        
			obj1 = ((Object) (propertyfilter1));
	//   13   25:aload_3         
	//   14   26:astore_2        
			if(propertyfilter1 == null)
	//*  15   27:aload_3         
	//*  16   28:ifnonnull       87
			{
				obj1 = ((Object) (propertyfilter1));
	//   17   31:aload_3         
	//   18   32:astore_2        
				if(_cfgFailOnUnknownId)
	//*  19   33:aload_0         
	//*  20   34:getfield        #30  <Field boolean _cfgFailOnUnknownId>
	//*  21   37:ifeq            87
					throw new IllegalArgumentException((new StringBuilder()).append("No filter configured with id '").append(obj).append("' (type ").append(obj.getClass().getName()).append(")").toString());
	//   22   40:new             #93  <Class IllegalArgumentException>
	//   23   43:dup             
	//   24   44:new             #95  <Class StringBuilder>
	//   25   47:dup             
	//   26   48:invokespecial   #96  <Method void StringBuilder()>
	//   27   51:ldc1            #147 <String "No filter configured with id '">
	//   28   53:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   29   56:aload_1         
	//   30   57:invokevirtual   #150 <Method StringBuilder StringBuilder.append(Object)>
	//   31   60:ldc1            #152 <String "' (type ">
	//   32   62:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   33   65:aload_1         
	//   34   66:invokevirtual   #108 <Method Class Object.getClass()>
	//   35   69:invokevirtual   #114 <Method String Class.getName()>
	//   36   72:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   37   75:ldc1            #116 <String ")">
	//   38   77:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   39   80:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   40   83:invokespecial   #122 <Method void IllegalArgumentException(String)>
	//   41   86:athrow          
			}
		}
		return ((PropertyFilter) (obj1));
	//   42   87:aload_2         
	//   43   88:areturn         
	}

	public PropertyFilter getDefaultFilter()
	{
		return _defaultFilter;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field PropertyFilter _defaultFilter>
	//    2    4:areturn         
	}

	public PropertyFilter removeFilter(String s)
	{
		return (PropertyFilter)_filtersById.remove(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Map _filtersById>
	//    2    4:aload_1         
	//    3    5:invokeinterface #159 <Method Object Map.remove(Object)>
	//    4   10:checkcast       #54  <Class PropertyFilter>
	//    5   13:areturn         
	}

	public SimpleFilterProvider setDefaultFilter(BeanPropertyFilter beanpropertyfilter)
	{
		_defaultFilter = SimpleBeanPropertyFilter.from(beanpropertyfilter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #68  <Method PropertyFilter SimpleBeanPropertyFilter.from(BeanPropertyFilter)>
	//    3    5:putfield        #145 <Field PropertyFilter _defaultFilter>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public SimpleFilterProvider setDefaultFilter(PropertyFilter propertyfilter)
	{
		_defaultFilter = propertyfilter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #145 <Field PropertyFilter _defaultFilter>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SimpleFilterProvider setDefaultFilter(SimpleBeanPropertyFilter simplebeanpropertyfilter)
	{
		_defaultFilter = ((PropertyFilter) (simplebeanpropertyfilter));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #145 <Field PropertyFilter _defaultFilter>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SimpleFilterProvider setFailOnUnknownId(boolean flag)
	{
		_cfgFailOnUnknownId = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #30  <Field boolean _cfgFailOnUnknownId>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public boolean willFailOnUnknownId()
	{
		return _cfgFailOnUnknownId;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field boolean _cfgFailOnUnknownId>
	//    2    4:ireturn         
	}

	private static final long serialVersionUID = 1L;
	protected boolean _cfgFailOnUnknownId;
	protected PropertyFilter _defaultFilter;
	protected final Map _filtersById;
}
