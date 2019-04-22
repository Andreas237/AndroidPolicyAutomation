// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;

public class PropertyBasedObjectIdGenerator extends com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator
{

	public PropertyBasedObjectIdGenerator(ObjectIdInfo objectidinfo, BeanPropertyWriter beanpropertywriter)
	{
		this(objectidinfo.getScope(), beanpropertywriter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #18  <Method Class ObjectIdInfo.getScope()>
	//    3    5:aload_2         
	//    4    6:invokespecial   #21  <Method void PropertyBasedObjectIdGenerator(Class, BeanPropertyWriter)>
	//    5    9:return          
	}

	protected PropertyBasedObjectIdGenerator(Class class1, BeanPropertyWriter beanpropertywriter)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator(Class)>
		_property = beanpropertywriter;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #27  <Field BeanPropertyWriter _property>
	//    6   10:return          
	}

	public boolean canUseFor(ObjectIdGenerator objectidgenerator)
	{
		Class class1 = ((Object) (objectidgenerator)).getClass();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #36  <Method Class Object.getClass()>
	//    2    4:astore_3        
		Class class2 = ((Object)this).getClass();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #36  <Method Class Object.getClass()>
	//    5    9:astore          4
		boolean flag = false;
	//    6   11:iconst_0        
	//    7   12:istore_2        
		if(class1 == class2)
	//*   8   13:aload_3         
	//*   9   14:aload           4
	//*  10   16:if_acmpne       50
		{
			objectidgenerator = ((ObjectIdGenerator) ((PropertyBasedObjectIdGenerator)objectidgenerator));
	//   11   19:aload_1         
	//   12   20:checkcast       #2   <Class PropertyBasedObjectIdGenerator>
	//   13   23:astore_1        
			if(((PropertyBasedObjectIdGenerator) (objectidgenerator)).getScope() == _scope)
	//*  14   24:aload_1         
	//*  15   25:invokevirtual   #37  <Method Class getScope()>
	//*  16   28:aload_0         
	//*  17   29:getfield        #41  <Field Class _scope>
	//*  18   32:if_acmpne       50
			{
				if(((PropertyBasedObjectIdGenerator) (objectidgenerator))._property == _property)
	//*  19   35:aload_1         
	//*  20   36:getfield        #27  <Field BeanPropertyWriter _property>
	//*  21   39:aload_0         
	//*  22   40:getfield        #27  <Field BeanPropertyWriter _property>
	//*  23   43:if_acmpne       48
					flag = true;
	//   24   46:iconst_1        
	//   25   47:istore_2        
				return flag;
	//   26   48:iload_2         
	//   27   49:ireturn         
			}
		}
		return false;
	//   28   50:iconst_0        
	//   29   51:ireturn         
	}

	public ObjectIdGenerator forScope(Class class1)
	{
		if(class1 == _scope)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #41  <Field Class _scope>
	//*   3    5:if_acmpne       10
			return ((ObjectIdGenerator) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return ((ObjectIdGenerator) (new PropertyBasedObjectIdGenerator(class1, _property)));
	//    6   10:new             #2   <Class PropertyBasedObjectIdGenerator>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #27  <Field BeanPropertyWriter _property>
	//   11   19:invokespecial   #21  <Method void PropertyBasedObjectIdGenerator(Class, BeanPropertyWriter)>
	//   12   22:areturn         
	}

	public Object generateId(Object obj)
	{
		try
		{
			obj = _property.get(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field BeanPropertyWriter _property>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #56  <Method Object BeanPropertyWriter.get(Object)>
	//    4    8:astore_1        
		}
	//*   5    9:aload_1         
	//*   6   10:areturn         
	//*   7   11:astore_1        
	//*   8   12:new             #58  <Class StringBuilder>
	//*   9   15:dup             
	//*  10   16:invokespecial   #61  <Method void StringBuilder()>
	//*  11   19:astore_2        
	//*  12   20:aload_2         
	//*  13   21:ldc1            #63  <String "Problem accessing property '">
	//*  14   23:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//*  15   26:pop             
	//*  16   27:aload_2         
	//*  17   28:aload_0         
	//*  18   29:getfield        #27  <Field BeanPropertyWriter _property>
	//*  19   32:invokevirtual   #71  <Method String BeanPropertyWriter.getName()>
	//*  20   35:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//*  21   38:pop             
	//*  22   39:aload_2         
	//*  23   40:ldc1            #73  <String "': ">
	//*  24   42:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//*  25   45:pop             
	//*  26   46:aload_2         
	//*  27   47:aload_1         
	//*  28   48:invokevirtual   #76  <Method String Exception.getMessage()>
	//*  29   51:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//*  30   54:pop             
	//*  31   55:new             #78  <Class IllegalStateException>
	//*  32   58:dup             
	//*  33   59:aload_2         
	//*  34   60:invokevirtual   #81  <Method String StringBuilder.toString()>
	//*  35   63:aload_1         
	//*  36   64:invokespecial   #84  <Method void IllegalStateException(String, Throwable)>
	//*  37   67:athrow          
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  38   68:astore_1        
		{
			throw obj;
	//   39   69:aload_1         
	//   40   70:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			StringBuilder stringbuilder = new StringBuilder();
			stringbuilder.append("Problem accessing property '");
			stringbuilder.append(_property.getName());
			stringbuilder.append("': ");
			stringbuilder.append(((Exception) (obj)).getMessage());
			throw new IllegalStateException(stringbuilder.toString(), ((Throwable) (obj)));
		}
		return obj;
	}

	public com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey key(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return new com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey(((Object)this).getClass(), _scope, obj);
	//    4    6:new             #88  <Class com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokevirtual   #36  <Method Class Object.getClass()>
	//    8   14:aload_0         
	//    9   15:getfield        #41  <Field Class _scope>
	//   10   18:aload_1         
	//   11   19:invokespecial   #91  <Method void com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey(Class, Class, Object)>
	//   12   22:areturn         
	}

	public ObjectIdGenerator newForSerialization(Object obj)
	{
		return ((ObjectIdGenerator) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final BeanPropertyWriter _property;
}
