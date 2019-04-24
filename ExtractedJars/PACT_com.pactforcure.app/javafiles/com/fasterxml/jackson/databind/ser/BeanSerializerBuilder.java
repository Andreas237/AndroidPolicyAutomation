// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//			BeanPropertyWriter, BeanSerializer, AnyGetterWriter

public class BeanSerializerBuilder
{

	public BeanSerializerBuilder(BeanDescription beandescription)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		_beanDesc = beandescription;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #35  <Field BeanDescription _beanDesc>
	//    5    9:return          
	}

	protected BeanSerializerBuilder(BeanSerializerBuilder beanserializerbuilder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		_beanDesc = beanserializerbuilder._beanDesc;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #35  <Field BeanDescription _beanDesc>
	//    5    9:putfield        #35  <Field BeanDescription _beanDesc>
		_properties = beanserializerbuilder._properties;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #38  <Field List _properties>
	//    9   17:putfield        #38  <Field List _properties>
		_filteredProperties = beanserializerbuilder._filteredProperties;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #40  <Field BeanPropertyWriter[] _filteredProperties>
	//   13   25:putfield        #40  <Field BeanPropertyWriter[] _filteredProperties>
		_anyGetter = beanserializerbuilder._anyGetter;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:getfield        #42  <Field AnyGetterWriter _anyGetter>
	//   17   33:putfield        #42  <Field AnyGetterWriter _anyGetter>
		_filterId = beanserializerbuilder._filterId;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:getfield        #44  <Field Object _filterId>
	//   21   41:putfield        #44  <Field Object _filterId>
	//   22   44:return          
	}

	public JsonSerializer build()
	{
		BeanPropertyWriter abeanpropertywriter[];
		if(_properties == null || _properties.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field List _properties>
	//*   2    4:ifnull          19
	//*   3    7:aload_0         
	//*   4    8:getfield        #38  <Field List _properties>
	//*   5   11:invokeinterface #52  <Method boolean List.isEmpty()>
	//*   6   16:ifeq            60
		{
			if(_anyGetter == null && _objectIdWriter == null)
	//*   7   19:aload_0         
	//*   8   20:getfield        #42  <Field AnyGetterWriter _anyGetter>
	//*   9   23:ifnonnull       35
	//*  10   26:aload_0         
	//*  11   27:getfield        #54  <Field ObjectIdWriter _objectIdWriter>
	//*  12   30:ifnonnull       35
				return null;
	//   13   33:aconst_null     
	//   14   34:areturn         
			abeanpropertywriter = NO_PROPERTIES;
	//   15   35:getstatic       #28  <Field BeanPropertyWriter[] NO_PROPERTIES>
	//   16   38:astore_1        
		} else
	//*  17   39:new             #56  <Class BeanSerializer>
	//*  18   42:dup             
	//*  19   43:aload_0         
	//*  20   44:getfield        #35  <Field BeanDescription _beanDesc>
	//*  21   47:invokevirtual   #62  <Method com.fasterxml.jackson.databind.JavaType BeanDescription.getType()>
	//*  22   50:aload_0         
	//*  23   51:aload_1         
	//*  24   52:aload_0         
	//*  25   53:getfield        #40  <Field BeanPropertyWriter[] _filteredProperties>
	//*  26   56:invokespecial   #65  <Method void BeanSerializer(com.fasterxml.jackson.databind.JavaType, BeanSerializerBuilder, BeanPropertyWriter[], BeanPropertyWriter[])>
	//*  27   59:areturn         
		{
			abeanpropertywriter = (BeanPropertyWriter[])_properties.toArray(((Object []) (new BeanPropertyWriter[_properties.size()])));
	//   28   60:aload_0         
	//   29   61:getfield        #38  <Field List _properties>
	//   30   64:aload_0         
	//   31   65:getfield        #38  <Field List _properties>
	//   32   68:invokeinterface #69  <Method int List.size()>
	//   33   73:anewarray       BeanPropertyWriter[]
	//   34   76:invokeinterface #73  <Method Object[] List.toArray(Object[])>
	//   35   81:checkcast       #74  <Class BeanPropertyWriter[]>
	//   36   84:astore_1        
		}
		return ((JsonSerializer) (new BeanSerializer(_beanDesc.getType(), this, abeanpropertywriter, _filteredProperties)));
	//*  37   85:goto            39
	}

	public BeanSerializer createDummy()
	{
		return BeanSerializer.createDummy(_beanDesc.getType());
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field BeanDescription _beanDesc>
	//    2    4:invokevirtual   #62  <Method com.fasterxml.jackson.databind.JavaType BeanDescription.getType()>
	//    3    7:invokestatic    #81  <Method BeanSerializer BeanSerializer.createDummy(com.fasterxml.jackson.databind.JavaType)>
	//    4   10:areturn         
	}

	public AnyGetterWriter getAnyGetter()
	{
		return _anyGetter;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field AnyGetterWriter _anyGetter>
	//    2    4:areturn         
	}

	public BeanDescription getBeanDescription()
	{
		return _beanDesc;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field BeanDescription _beanDesc>
	//    2    4:areturn         
	}

	public AnnotatedClass getClassInfo()
	{
		return _beanDesc.getClassInfo();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field BeanDescription _beanDesc>
	//    2    4:invokevirtual   #89  <Method AnnotatedClass BeanDescription.getClassInfo()>
	//    3    7:areturn         
	}

	public Object getFilterId()
	{
		return _filterId;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Object _filterId>
	//    2    4:areturn         
	}

	public BeanPropertyWriter[] getFilteredProperties()
	{
		return _filteredProperties;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field BeanPropertyWriter[] _filteredProperties>
	//    2    4:areturn         
	}

	public ObjectIdWriter getObjectIdWriter()
	{
		return _objectIdWriter;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field ObjectIdWriter _objectIdWriter>
	//    2    4:areturn         
	}

	public List getProperties()
	{
		return _properties;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field List _properties>
	//    2    4:areturn         
	}

	public AnnotatedMember getTypeId()
	{
		return _typeId;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field AnnotatedMember _typeId>
	//    2    4:areturn         
	}

	public boolean hasProperties()
	{
		return _properties != null && _properties.size() > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field List _properties>
	//    2    4:ifnull          21
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field List _properties>
	//    5   11:invokeinterface #69  <Method int List.size()>
	//    6   16:ifle            21
	//    7   19:iconst_1        
	//    8   20:ireturn         
	//    9   21:iconst_0        
	//   10   22:ireturn         
	}

	public void setAnyGetter(AnyGetterWriter anygetterwriter)
	{
		_anyGetter = anygetterwriter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #42  <Field AnyGetterWriter _anyGetter>
	//    3    5:return          
	}

	protected void setConfig(SerializationConfig serializationconfig)
	{
		_config = serializationconfig;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #109 <Field SerializationConfig _config>
	//    3    5:return          
	}

	public void setFilterId(Object obj)
	{
		_filterId = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #44  <Field Object _filterId>
	//    3    5:return          
	}

	public void setFilteredProperties(BeanPropertyWriter abeanpropertywriter[])
	{
		_filteredProperties = abeanpropertywriter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field BeanPropertyWriter[] _filteredProperties>
	//    3    5:return          
	}

	public void setObjectIdWriter(ObjectIdWriter objectidwriter)
	{
		_objectIdWriter = objectidwriter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field ObjectIdWriter _objectIdWriter>
	//    3    5:return          
	}

	public void setProperties(List list)
	{
		_properties = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #38  <Field List _properties>
	//    3    5:return          
	}

	public void setTypeId(AnnotatedMember annotatedmember)
	{
		if(_typeId != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field AnnotatedMember _typeId>
	//*   2    4:ifnull          46
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Multiple type ids specified with ").append(((Object) (_typeId))).append(" and ").append(((Object) (annotatedmember))).toString());
	//    3    7:new             #122 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:new             #124 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #125 <Method void StringBuilder()>
	//    8   18:ldc1            #127 <String "Multiple type ids specified with ">
	//    9   20:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   10   23:aload_0         
	//   11   24:getfield        #102 <Field AnnotatedMember _typeId>
	//   12   27:invokevirtual   #134 <Method StringBuilder StringBuilder.append(Object)>
	//   13   30:ldc1            #136 <String " and ">
	//   14   32:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:aload_1         
	//   16   36:invokevirtual   #134 <Method StringBuilder StringBuilder.append(Object)>
	//   17   39:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   18   42:invokespecial   #143 <Method void IllegalArgumentException(String)>
	//   19   45:athrow          
		} else
		{
			_typeId = annotatedmember;
	//   20   46:aload_0         
	//   21   47:aload_1         
	//   22   48:putfield        #102 <Field AnnotatedMember _typeId>
			return;
	//   23   51:return          
		}
	}

	private static final BeanPropertyWriter NO_PROPERTIES[] = new BeanPropertyWriter[0];
	protected AnyGetterWriter _anyGetter;
	protected final BeanDescription _beanDesc;
	protected SerializationConfig _config;
	protected Object _filterId;
	protected BeanPropertyWriter _filteredProperties[];
	protected ObjectIdWriter _objectIdWriter;
	protected List _properties;
	protected AnnotatedMember _typeId;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       BeanPropertyWriter[]
	//    2    4:putstatic       #28  <Field BeanPropertyWriter[] NO_PROPERTIES>
	//*   3    7:return          
	}
}
