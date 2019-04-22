// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//			BeanPropertyWriter, AnyGetterWriter, BeanSerializer

public class BeanSerializerBuilder
{

	public BeanSerializerBuilder(BeanDescription beandescription)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		_properties = Collections.emptyList();
	//    2    4:aload_0         
	//    3    5:invokestatic    #39  <Method List Collections.emptyList()>
	//    4    8:putfield        #41  <Field List _properties>
		_beanDesc = beandescription;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #43  <Field BeanDescription _beanDesc>
	//    8   16:return          
	}

	public JsonSerializer build()
	{
		List list = _properties;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List _properties>
	//    2    4:astore_3        
		BeanPropertyWriter abeanpropertywriter[];
		if(list != null && !list.isEmpty())
	//*   3    5:aload_3         
	//*   4    6:ifnull          94
	//*   5    9:aload_3         
	//*   6   10:invokeinterface #51  <Method boolean List.isEmpty()>
	//*   7   15:ifeq            21
	//*   8   18:goto            94
		{
			List list1 = _properties;
	//    9   21:aload_0         
	//   10   22:getfield        #41  <Field List _properties>
	//   11   25:astore_3        
			BeanPropertyWriter abeanpropertywriter1[] = (BeanPropertyWriter[])list1.toArray(((Object []) (new BeanPropertyWriter[list1.size()])));
	//   12   26:aload_3         
	//   13   27:aload_3         
	//   14   28:invokeinterface #55  <Method int List.size()>
	//   15   33:anewarray       BeanPropertyWriter[]
	//   16   36:invokeinterface #59  <Method Object[] List.toArray(Object[])>
	//   17   41:checkcast       #60  <Class BeanPropertyWriter[]>
	//   18   44:astore          4
			abeanpropertywriter = abeanpropertywriter1;
	//   19   46:aload           4
	//   20   48:astore_3        
			if(_config.isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS))
	//*  21   49:aload_0         
	//*  22   50:getfield        #62  <Field SerializationConfig _config>
	//*  23   53:getstatic       #68  <Field MapperFeature MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS>
	//*  24   56:invokevirtual   #74  <Method boolean SerializationConfig.isEnabled(MapperFeature)>
	//*  25   59:ifeq            114
			{
				int j = abeanpropertywriter1.length;
	//   26   62:aload           4
	//   27   64:arraylength     
	//   28   65:istore_2        
				int i = 0;
	//   29   66:iconst_0        
	//   30   67:istore_1        
				do
				{
					abeanpropertywriter = abeanpropertywriter1;
	//   31   68:aload           4
	//   32   70:astore_3        
					if(i >= j)
						break;
	//   33   71:iload_1         
	//   34   72:iload_2         
	//   35   73:icmpge          114
					abeanpropertywriter1[i].fixAccess(_config);
	//   36   76:aload           4
	//   37   78:iload_1         
	//   38   79:aaload          
	//   39   80:aload_0         
	//   40   81:getfield        #62  <Field SerializationConfig _config>
	//   41   84:invokevirtual   #78  <Method void BeanPropertyWriter.fixAccess(SerializationConfig)>
					i++;
	//   42   87:iload_1         
	//   43   88:iconst_1        
	//   44   89:iadd            
	//   45   90:istore_1        
				} while(true);
	//   46   91:goto            68
			}
		} else
		{
			if(_anyGetter == null && _objectIdWriter == null)
	//*  47   94:aload_0         
	//*  48   95:getfield        #80  <Field AnyGetterWriter _anyGetter>
	//*  49   98:ifnonnull       110
	//*  50  101:aload_0         
	//*  51  102:getfield        #82  <Field ObjectIdWriter _objectIdWriter>
	//*  52  105:ifnonnull       110
				return null;
	//   53  108:aconst_null     
	//   54  109:areturn         
			abeanpropertywriter = NO_PROPERTIES;
	//   55  110:getstatic       #28  <Field BeanPropertyWriter[] NO_PROPERTIES>
	//   56  113:astore_3        
		}
		BeanPropertyWriter abeanpropertywriter2[] = _filteredProperties;
	//   57  114:aload_0         
	//   58  115:getfield        #84  <Field BeanPropertyWriter[] _filteredProperties>
	//   59  118:astore          4
		if(abeanpropertywriter2 != null && abeanpropertywriter2.length != _properties.size())
	//*  60  120:aload           4
	//*  61  122:ifnull          186
	//*  62  125:aload           4
	//*  63  127:arraylength     
	//*  64  128:aload_0         
	//*  65  129:getfield        #41  <Field List _properties>
	//*  66  132:invokeinterface #55  <Method int List.size()>
	//*  67  137:icmpne          143
	//*  68  140:goto            186
			throw new IllegalStateException(String.format("Mismatch between `properties` size (%d), `filteredProperties` (%s): should have as many (or `null` for latter)", new Object[] {
				Integer.valueOf(_properties.size()), Integer.valueOf(_filteredProperties.length)
			}));
	//   69  143:new             #86  <Class IllegalStateException>
	//   70  146:dup             
	//   71  147:ldc1            #88  <String "Mismatch between `properties` size (%d), `filteredProperties` (%s): should have as many (or `null` for latter)">
	//   72  149:iconst_2        
	//   73  150:anewarray       Object[]
	//   74  153:dup             
	//   75  154:iconst_0        
	//   76  155:aload_0         
	//   77  156:getfield        #41  <Field List _properties>
	//   78  159:invokeinterface #55  <Method int List.size()>
	//   79  164:invokestatic    #94  <Method Integer Integer.valueOf(int)>
	//   80  167:aastore         
	//   81  168:dup             
	//   82  169:iconst_1        
	//   83  170:aload_0         
	//   84  171:getfield        #84  <Field BeanPropertyWriter[] _filteredProperties>
	//   85  174:arraylength     
	//   86  175:invokestatic    #94  <Method Integer Integer.valueOf(int)>
	//   87  178:aastore         
	//   88  179:invokestatic    #100 <Method String String.format(String, Object[])>
	//   89  182:invokespecial   #103 <Method void IllegalStateException(String)>
	//   90  185:athrow          
		AnyGetterWriter anygetterwriter = _anyGetter;
	//   91  186:aload_0         
	//   92  187:getfield        #80  <Field AnyGetterWriter _anyGetter>
	//   93  190:astore          4
		if(anygetterwriter != null)
	//*  94  192:aload           4
	//*  95  194:ifnull          206
			anygetterwriter.fixAccess(_config);
	//   96  197:aload           4
	//   97  199:aload_0         
	//   98  200:getfield        #62  <Field SerializationConfig _config>
	//   99  203:invokevirtual   #106 <Method void AnyGetterWriter.fixAccess(SerializationConfig)>
		if(_typeId != null && _config.isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS))
	//* 100  206:aload_0         
	//* 101  207:getfield        #108 <Field AnnotatedMember _typeId>
	//* 102  210:ifnull          243
	//* 103  213:aload_0         
	//* 104  214:getfield        #62  <Field SerializationConfig _config>
	//* 105  217:getstatic       #68  <Field MapperFeature MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS>
	//* 106  220:invokevirtual   #74  <Method boolean SerializationConfig.isEnabled(MapperFeature)>
	//* 107  223:ifeq            243
			_typeId.fixAccess(_config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
	//  108  226:aload_0         
	//  109  227:getfield        #108 <Field AnnotatedMember _typeId>
	//  110  230:aload_0         
	//  111  231:getfield        #62  <Field SerializationConfig _config>
	//  112  234:getstatic       #111 <Field MapperFeature MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS>
	//  113  237:invokevirtual   #74  <Method boolean SerializationConfig.isEnabled(MapperFeature)>
	//  114  240:invokevirtual   #116 <Method void AnnotatedMember.fixAccess(boolean)>
		return ((JsonSerializer) (new BeanSerializer(_beanDesc.getType(), this, abeanpropertywriter, _filteredProperties)));
	//  115  243:new             #118 <Class BeanSerializer>
	//  116  246:dup             
	//  117  247:aload_0         
	//  118  248:getfield        #43  <Field BeanDescription _beanDesc>
	//  119  251:invokevirtual   #124 <Method com.fasterxml.jackson.databind.JavaType BeanDescription.getType()>
	//  120  254:aload_0         
	//  121  255:aload_3         
	//  122  256:aload_0         
	//  123  257:getfield        #84  <Field BeanPropertyWriter[] _filteredProperties>
	//  124  260:invokespecial   #127 <Method void BeanSerializer(com.fasterxml.jackson.databind.JavaType, BeanSerializerBuilder, BeanPropertyWriter[], BeanPropertyWriter[])>
	//  125  263:areturn         
	}

	public BeanSerializer createDummy()
	{
		return BeanSerializer.createDummy(_beanDesc.getType());
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field BeanDescription _beanDesc>
	//    2    4:invokevirtual   #124 <Method com.fasterxml.jackson.databind.JavaType BeanDescription.getType()>
	//    3    7:invokestatic    #134 <Method BeanSerializer BeanSerializer.createDummy(com.fasterxml.jackson.databind.JavaType)>
	//    4   10:areturn         
	}

	public AnyGetterWriter getAnyGetter()
	{
		return _anyGetter;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field AnyGetterWriter _anyGetter>
	//    2    4:areturn         
	}

	public BeanDescription getBeanDescription()
	{
		return _beanDesc;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field BeanDescription _beanDesc>
	//    2    4:areturn         
	}

	public Object getFilterId()
	{
		return _filterId;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field Object _filterId>
	//    2    4:areturn         
	}

	public ObjectIdWriter getObjectIdWriter()
	{
		return _objectIdWriter;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field ObjectIdWriter _objectIdWriter>
	//    2    4:areturn         
	}

	public List getProperties()
	{
		return _properties;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List _properties>
	//    2    4:areturn         
	}

	public AnnotatedMember getTypeId()
	{
		return _typeId;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field AnnotatedMember _typeId>
	//    2    4:areturn         
	}

	public void setAnyGetter(AnyGetterWriter anygetterwriter)
	{
		_anyGetter = anygetterwriter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #80  <Field AnyGetterWriter _anyGetter>
	//    3    5:return          
	}

	protected void setConfig(SerializationConfig serializationconfig)
	{
		_config = serializationconfig;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field SerializationConfig _config>
	//    3    5:return          
	}

	public void setFilterId(Object obj)
	{
		_filterId = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #142 <Field Object _filterId>
	//    3    5:return          
	}

	public void setFilteredProperties(BeanPropertyWriter abeanpropertywriter[])
	{
		if(abeanpropertywriter != null && abeanpropertywriter.length != _properties.size())
	//*   0    0:aload_1         
	//*   1    1:ifnull          61
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:aload_0         
	//*   5    7:getfield        #41  <Field List _properties>
	//*   6   10:invokeinterface #55  <Method int List.size()>
	//*   7   15:icmpne          21
	//*   8   18:goto            61
		{
			throw new IllegalArgumentException(String.format("Trying to set %d filtered properties; must match length of non-filtered `properties` (%d)", new Object[] {
				Integer.valueOf(abeanpropertywriter.length), Integer.valueOf(_properties.size())
			}));
	//    9   21:new             #157 <Class IllegalArgumentException>
	//   10   24:dup             
	//   11   25:ldc1            #159 <String "Trying to set %d filtered properties; must match length of non-filtered `properties` (%d)">
	//   12   27:iconst_2        
	//   13   28:anewarray       Object[]
	//   14   31:dup             
	//   15   32:iconst_0        
	//   16   33:aload_1         
	//   17   34:arraylength     
	//   18   35:invokestatic    #94  <Method Integer Integer.valueOf(int)>
	//   19   38:aastore         
	//   20   39:dup             
	//   21   40:iconst_1        
	//   22   41:aload_0         
	//   23   42:getfield        #41  <Field List _properties>
	//   24   45:invokeinterface #55  <Method int List.size()>
	//   25   50:invokestatic    #94  <Method Integer Integer.valueOf(int)>
	//   26   53:aastore         
	//   27   54:invokestatic    #100 <Method String String.format(String, Object[])>
	//   28   57:invokespecial   #160 <Method void IllegalArgumentException(String)>
	//   29   60:athrow          
		} else
		{
			_filteredProperties = abeanpropertywriter;
	//   30   61:aload_0         
	//   31   62:aload_1         
	//   32   63:putfield        #84  <Field BeanPropertyWriter[] _filteredProperties>
			return;
	//   33   66:return          
		}
	}

	public void setObjectIdWriter(ObjectIdWriter objectidwriter)
	{
		_objectIdWriter = objectidwriter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #82  <Field ObjectIdWriter _objectIdWriter>
	//    3    5:return          
	}

	public void setProperties(List list)
	{
		_properties = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field List _properties>
	//    3    5:return          
	}

	public void setTypeId(AnnotatedMember annotatedmember)
	{
		if(_typeId == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #108 <Field AnnotatedMember _typeId>
	//*   2    4:ifnonnull       13
		{
			_typeId = annotatedmember;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #108 <Field AnnotatedMember _typeId>
			return;
	//    6   12:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    7   13:new             #169 <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #170 <Method void StringBuilder()>
	//   10   20:astore_2        
			stringbuilder.append("Multiple type ids specified with ");
	//   11   21:aload_2         
	//   12   22:ldc1            #172 <String "Multiple type ids specified with ">
	//   13   24:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
			stringbuilder.append(((Object) (_typeId)));
	//   15   28:aload_2         
	//   16   29:aload_0         
	//   17   30:getfield        #108 <Field AnnotatedMember _typeId>
	//   18   33:invokevirtual   #179 <Method StringBuilder StringBuilder.append(Object)>
	//   19   36:pop             
			stringbuilder.append(" and ");
	//   20   37:aload_2         
	//   21   38:ldc1            #181 <String " and ">
	//   22   40:invokevirtual   #176 <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
			stringbuilder.append(((Object) (annotatedmember)));
	//   24   44:aload_2         
	//   25   45:aload_1         
	//   26   46:invokevirtual   #179 <Method StringBuilder StringBuilder.append(Object)>
	//   27   49:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   28   50:new             #157 <Class IllegalArgumentException>
	//   29   53:dup             
	//   30   54:aload_2         
	//   31   55:invokevirtual   #185 <Method String StringBuilder.toString()>
	//   32   58:invokespecial   #160 <Method void IllegalArgumentException(String)>
	//   33   61:athrow          
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
