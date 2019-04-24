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
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag = flag1;
	//    2    2:iload_3         
	//    3    3:istore_2        
		if(((Object) (objectidgenerator)).getClass() == ((Object)this).getClass())
	//*   4    4:aload_1         
	//*   5    5:invokevirtual   #36  <Method Class Object.getClass()>
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #36  <Method Class Object.getClass()>
	//*   8   12:if_acmpne       48
		{
			objectidgenerator = ((ObjectIdGenerator) ((PropertyBasedObjectIdGenerator)objectidgenerator));
	//    9   15:aload_1         
	//   10   16:checkcast       #2   <Class PropertyBasedObjectIdGenerator>
	//   11   19:astore_1        
			flag = flag1;
	//   12   20:iload_3         
	//   13   21:istore_2        
			if(((PropertyBasedObjectIdGenerator) (objectidgenerator)).getScope() == _scope)
	//*  14   22:aload_1         
	//*  15   23:invokevirtual   #37  <Method Class getScope()>
	//*  16   26:aload_0         
	//*  17   27:getfield        #41  <Field Class _scope>
	//*  18   30:if_acmpne       48
			{
				flag = flag1;
	//   19   33:iload_3         
	//   20   34:istore_2        
				if(((PropertyBasedObjectIdGenerator) (objectidgenerator))._property == _property)
	//*  21   35:aload_1         
	//*  22   36:getfield        #27  <Field BeanPropertyWriter _property>
	//*  23   39:aload_0         
	//*  24   40:getfield        #27  <Field BeanPropertyWriter _property>
	//*  25   43:if_acmpne       48
					flag = true;
	//   26   46:iconst_1        
	//   27   47:istore_2        
			}
		}
		return flag;
	//   28   48:iload_2         
	//   29   49:ireturn         
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
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*   7   11:astore_1        
		{
			throw obj;
	//    8   12:aload_1         
	//    9   13:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  10   14:astore_1        
		{
			throw new IllegalStateException((new StringBuilder()).append("Problem accessing property '").append(_property.getName()).append("': ").append(((Exception) (obj)).getMessage()).toString(), ((Throwable) (obj)));
	//   11   15:new             #58  <Class IllegalStateException>
	//   12   18:dup             
	//   13   19:new             #60  <Class StringBuilder>
	//   14   22:dup             
	//   15   23:invokespecial   #63  <Method void StringBuilder()>
	//   16   26:ldc1            #65  <String "Problem accessing property '">
	//   17   28:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   18   31:aload_0         
	//   19   32:getfield        #27  <Field BeanPropertyWriter _property>
	//   20   35:invokevirtual   #73  <Method String BeanPropertyWriter.getName()>
	//   21   38:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   22   41:ldc1            #75  <String "': ">
	//   23   43:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   24   46:aload_1         
	//   25   47:invokevirtual   #78  <Method String Exception.getMessage()>
	//   26   50:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   27   53:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   28   56:aload_1         
	//   29   57:invokespecial   #84  <Method void IllegalStateException(String, Throwable)>
	//   30   60:athrow          
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
