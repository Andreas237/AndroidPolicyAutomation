// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.util.Annotations;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.*;

public final class ManagedReferenceProperty extends SettableBeanProperty
{

	public ManagedReferenceProperty(SettableBeanProperty settablebeanproperty, String s, SettableBeanProperty settablebeanproperty1, Annotations annotations, boolean flag)
	{
		super(settablebeanproperty.getFullName(), settablebeanproperty.getType(), settablebeanproperty.getWrapperName(), settablebeanproperty.getValueTypeDeserializer(), annotations, settablebeanproperty.getMetadata());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #21  <Method PropertyName SettableBeanProperty.getFullName()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #25  <Method com.fasterxml.jackson.databind.JavaType SettableBeanProperty.getType()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #28  <Method PropertyName SettableBeanProperty.getWrapperName()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #32  <Method com.fasterxml.jackson.databind.jsontype.TypeDeserializer SettableBeanProperty.getValueTypeDeserializer()>
	//    9   17:aload           4
	//   10   19:aload_1         
	//   11   20:invokevirtual   #36  <Method com.fasterxml.jackson.databind.PropertyMetadata SettableBeanProperty.getMetadata()>
	//   12   23:invokespecial   #39  <Method void SettableBeanProperty(PropertyName, com.fasterxml.jackson.databind.JavaType, PropertyName, com.fasterxml.jackson.databind.jsontype.TypeDeserializer, Annotations, com.fasterxml.jackson.databind.PropertyMetadata)>
		_referenceName = s;
	//   13   26:aload_0         
	//   14   27:aload_2         
	//   15   28:putfield        #41  <Field String _referenceName>
		_managedProperty = settablebeanproperty;
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:putfield        #43  <Field SettableBeanProperty _managedProperty>
		_backProperty = settablebeanproperty1;
	//   19   36:aload_0         
	//   20   37:aload_3         
	//   21   38:putfield        #45  <Field SettableBeanProperty _backProperty>
		_isContainer = flag;
	//   22   41:aload_0         
	//   23   42:iload           5
	//   24   44:putfield        #47  <Field boolean _isContainer>
	//   25   47:return          
	}

	protected ManagedReferenceProperty(ManagedReferenceProperty managedreferenceproperty, JsonDeserializer jsondeserializer)
	{
		super(((SettableBeanProperty) (managedreferenceproperty)), jsondeserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #52  <Method void SettableBeanProperty(SettableBeanProperty, JsonDeserializer)>
		_referenceName = managedreferenceproperty._referenceName;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #41  <Field String _referenceName>
	//    7   11:putfield        #41  <Field String _referenceName>
		_isContainer = managedreferenceproperty._isContainer;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #47  <Field boolean _isContainer>
	//   11   19:putfield        #47  <Field boolean _isContainer>
		_managedProperty = managedreferenceproperty._managedProperty;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:getfield        #43  <Field SettableBeanProperty _managedProperty>
	//   15   27:putfield        #43  <Field SettableBeanProperty _managedProperty>
		_backProperty = managedreferenceproperty._backProperty;
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:getfield        #45  <Field SettableBeanProperty _backProperty>
	//   19   35:putfield        #45  <Field SettableBeanProperty _backProperty>
	//   20   38:return          
	}

	protected ManagedReferenceProperty(ManagedReferenceProperty managedreferenceproperty, PropertyName propertyname)
	{
		super(((SettableBeanProperty) (managedreferenceproperty)), propertyname);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #58  <Method void SettableBeanProperty(SettableBeanProperty, PropertyName)>
		_referenceName = managedreferenceproperty._referenceName;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #41  <Field String _referenceName>
	//    7   11:putfield        #41  <Field String _referenceName>
		_isContainer = managedreferenceproperty._isContainer;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #47  <Field boolean _isContainer>
	//   11   19:putfield        #47  <Field boolean _isContainer>
		_managedProperty = managedreferenceproperty._managedProperty;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:getfield        #43  <Field SettableBeanProperty _managedProperty>
	//   15   27:putfield        #43  <Field SettableBeanProperty _managedProperty>
		_backProperty = managedreferenceproperty._backProperty;
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:getfield        #45  <Field SettableBeanProperty _backProperty>
	//   19   35:putfield        #45  <Field SettableBeanProperty _backProperty>
	//   20   38:return          
	}

	public void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		set(obj, _managedProperty.deserialize(jsonparser, deserializationcontext));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:aload_0         
	//    3    3:getfield        #43  <Field SettableBeanProperty _managedProperty>
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #66  <Method Object SettableBeanProperty.deserialize(JsonParser, DeserializationContext)>
	//    7   11:invokevirtual   #70  <Method void set(Object, Object)>
	//    8   14:return          
	}

	public Object deserializeSetAndReturn(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		return setAndReturn(obj, deserialize(jsonparser, deserializationcontext));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:aload_2         
	//    5    5:invokevirtual   #74  <Method Object deserialize(JsonParser, DeserializationContext)>
	//    6    8:invokevirtual   #78  <Method Object setAndReturn(Object, Object)>
	//    7   11:areturn         
	}

	public Annotation getAnnotation(Class class1)
	{
		return _managedProperty.getAnnotation(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field SettableBeanProperty _managedProperty>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #82  <Method Annotation SettableBeanProperty.getAnnotation(Class)>
	//    4    8:areturn         
	}

	public AnnotatedMember getMember()
	{
		return _managedProperty.getMember();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field SettableBeanProperty _managedProperty>
	//    2    4:invokevirtual   #87  <Method AnnotatedMember SettableBeanProperty.getMember()>
	//    3    7:areturn         
	}

	public final void set(Object obj, Object obj1)
		throws IOException
	{
		setAndReturn(obj, obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #78  <Method Object setAndReturn(Object, Object)>
	//    4    6:pop             
	//    5    7:return          
	}

	public Object setAndReturn(Object obj, Object obj1)
		throws IOException
	{
		if(obj1 != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          242
			if(_isContainer)
	//*   2    4:aload_0         
	//*   3    5:getfield        #47  <Field boolean _isContainer>
	//*   4    8:ifeq            233
			{
				if(obj1 instanceof Object[])
	//*   5   11:aload_2         
	//*   6   12:instanceof      #89  <Class Object[]>
	//*   7   15:ifeq            68
				{
					Object aobj[] = (Object[])(Object[])obj1;
	//    8   18:aload_2         
	//    9   19:checkcast       #89  <Class Object[]>
	//   10   22:checkcast       #89  <Class Object[]>
	//   11   25:astore          5
					int j = aobj.length;
	//   12   27:aload           5
	//   13   29:arraylength     
	//   14   30:istore          4
					for(int i = 0; i < j; i++)
	//*  15   32:iconst_0        
	//*  16   33:istore_3        
	//*  17   34:iload_3         
	//*  18   35:iload           4
	//*  19   37:icmpge          242
					{
						Object obj2 = aobj[i];
	//   20   40:aload           5
	//   21   42:iload_3         
	//   22   43:aaload          
	//   23   44:astore          6
						if(obj2 != null)
	//*  24   46:aload           6
	//*  25   48:ifnull          61
							_backProperty.set(obj2, obj);
	//   26   51:aload_0         
	//   27   52:getfield        #45  <Field SettableBeanProperty _backProperty>
	//   28   55:aload           6
	//   29   57:aload_1         
	//   30   58:invokevirtual   #90  <Method void SettableBeanProperty.set(Object, Object)>
					}

	//   31   61:iload_3         
	//   32   62:iconst_1        
	//   33   63:iadd            
	//   34   64:istore_3        
				} else
	//*  35   65:goto            34
				if(obj1 instanceof Collection)
	//*  36   68:aload_2         
	//*  37   69:instanceof      #92  <Class Collection>
	//*  38   72:ifeq            123
				{
					Iterator iterator = ((Collection)obj1).iterator();
	//   39   75:aload_2         
	//   40   76:checkcast       #92  <Class Collection>
	//   41   79:invokeinterface #96  <Method Iterator Collection.iterator()>
	//   42   84:astore          5
					do
					{
						if(!iterator.hasNext())
							break;
	//   43   86:aload           5
	//   44   88:invokeinterface #102 <Method boolean Iterator.hasNext()>
	//   45   93:ifeq            242
						Object obj3 = iterator.next();
	//   46   96:aload           5
	//   47   98:invokeinterface #106 <Method Object Iterator.next()>
	//   48  103:astore          6
						if(obj3 != null)
	//*  49  105:aload           6
	//*  50  107:ifnull          86
							_backProperty.set(obj3, obj);
	//   51  110:aload_0         
	//   52  111:getfield        #45  <Field SettableBeanProperty _backProperty>
	//   53  114:aload           6
	//   54  116:aload_1         
	//   55  117:invokevirtual   #90  <Method void SettableBeanProperty.set(Object, Object)>
					} while(true);
	//   56  120:goto            86
				} else
				if(obj1 instanceof Map)
	//*  57  123:aload_2         
	//*  58  124:instanceof      #108 <Class Map>
	//*  59  127:ifeq            183
				{
					Iterator iterator1 = ((Map)obj1).values().iterator();
	//   60  130:aload_2         
	//   61  131:checkcast       #108 <Class Map>
	//   62  134:invokeinterface #112 <Method Collection Map.values()>
	//   63  139:invokeinterface #96  <Method Iterator Collection.iterator()>
	//   64  144:astore          5
					do
					{
						if(!iterator1.hasNext())
							break;
	//   65  146:aload           5
	//   66  148:invokeinterface #102 <Method boolean Iterator.hasNext()>
	//   67  153:ifeq            242
						Object obj4 = iterator1.next();
	//   68  156:aload           5
	//   69  158:invokeinterface #106 <Method Object Iterator.next()>
	//   70  163:astore          6
						if(obj4 != null)
	//*  71  165:aload           6
	//*  72  167:ifnull          146
							_backProperty.set(obj4, obj);
	//   73  170:aload_0         
	//   74  171:getfield        #45  <Field SettableBeanProperty _backProperty>
	//   75  174:aload           6
	//   76  176:aload_1         
	//   77  177:invokevirtual   #90  <Method void SettableBeanProperty.set(Object, Object)>
					} while(true);
	//   78  180:goto            146
				} else
				{
					throw new IllegalStateException((new StringBuilder()).append("Unsupported container type (").append(obj1.getClass().getName()).append(") when resolving reference '").append(_referenceName).append("'").toString());
	//   79  183:new             #114 <Class IllegalStateException>
	//   80  186:dup             
	//   81  187:new             #116 <Class StringBuilder>
	//   82  190:dup             
	//   83  191:invokespecial   #119 <Method void StringBuilder()>
	//   84  194:ldc1            #121 <String "Unsupported container type (">
	//   85  196:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   86  199:aload_2         
	//   87  200:invokevirtual   #131 <Method Class Object.getClass()>
	//   88  203:invokevirtual   #137 <Method String Class.getName()>
	//   89  206:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   90  209:ldc1            #139 <String ") when resolving reference '">
	//   91  211:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   92  214:aload_0         
	//   93  215:getfield        #41  <Field String _referenceName>
	//   94  218:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   95  221:ldc1            #141 <String "'">
	//   96  223:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   97  226:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   98  229:invokespecial   #147 <Method void IllegalStateException(String)>
	//   99  232:athrow          
				}
			} else
			{
				_backProperty.set(obj1, obj);
	//  100  233:aload_0         
	//  101  234:getfield        #45  <Field SettableBeanProperty _backProperty>
	//  102  237:aload_2         
	//  103  238:aload_1         
	//  104  239:invokevirtual   #90  <Method void SettableBeanProperty.set(Object, Object)>
			}
		return _managedProperty.setAndReturn(obj, obj1);
	//  105  242:aload_0         
	//  106  243:getfield        #43  <Field SettableBeanProperty _managedProperty>
	//  107  246:aload_1         
	//  108  247:aload_2         
	//  109  248:invokevirtual   #148 <Method Object SettableBeanProperty.setAndReturn(Object, Object)>
	//  110  251:areturn         
	}

	public volatile SettableBeanProperty withName(PropertyName propertyname)
	{
		return ((SettableBeanProperty) (withName(propertyname)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #153 <Method ManagedReferenceProperty withName(PropertyName)>
	//    3    5:areturn         
	}

	public ManagedReferenceProperty withName(PropertyName propertyname)
	{
		return new ManagedReferenceProperty(this, propertyname);
	//    0    0:new             #2   <Class ManagedReferenceProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #155 <Method void ManagedReferenceProperty(ManagedReferenceProperty, PropertyName)>
	//    5    9:areturn         
	}

	public volatile SettableBeanProperty withValueDeserializer(JsonDeserializer jsondeserializer)
	{
		return ((SettableBeanProperty) (withValueDeserializer(jsondeserializer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #160 <Method ManagedReferenceProperty withValueDeserializer(JsonDeserializer)>
	//    3    5:areturn         
	}

	public ManagedReferenceProperty withValueDeserializer(JsonDeserializer jsondeserializer)
	{
		return new ManagedReferenceProperty(this, jsondeserializer);
	//    0    0:new             #2   <Class ManagedReferenceProperty>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #162 <Method void ManagedReferenceProperty(ManagedReferenceProperty, JsonDeserializer)>
	//    5    9:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final SettableBeanProperty _backProperty;
	protected final boolean _isContainer;
	protected final SettableBeanProperty _managedProperty;
	protected final String _referenceName;
}
