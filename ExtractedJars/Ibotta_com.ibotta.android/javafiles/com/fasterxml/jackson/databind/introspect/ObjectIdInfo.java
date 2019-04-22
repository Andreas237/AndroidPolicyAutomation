// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.util.ClassUtil;

public class ObjectIdInfo
{

	public ObjectIdInfo(PropertyName propertyname, Class class1, Class class2, Class class3)
	{
		this(propertyname, class1, class2, false, class3);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_0        
	//    5    5:aload           4
	//    6    7:invokespecial   #28  <Method void ObjectIdInfo(PropertyName, Class, Class, boolean, Class)>
	//    7   10:return          
	}

	protected ObjectIdInfo(PropertyName propertyname, Class class1, Class class2, boolean flag, Class class3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		_propertyName = propertyname;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #38  <Field PropertyName _propertyName>
		_scope = class1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #40  <Field Class _scope>
		_generator = class2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #42  <Field Class _generator>
		_alwaysAsId = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #44  <Field boolean _alwaysAsId>
		propertyname = ((PropertyName) (class3));
	//   14   25:aload           5
	//   15   27:astore_1        
		if(class3 == null)
	//*  16   28:aload           5
	//*  17   30:ifnonnull       36
			propertyname = com/fasterxml/jackson/annotation/SimpleObjectIdResolver;
	//   18   33:ldc1            #46  <Class SimpleObjectIdResolver>
	//   19   35:astore_1        
		_resolver = ((Class) (propertyname));
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:putfield        #48  <Field Class _resolver>
	//   23   41:return          
	}

	public static ObjectIdInfo empty()
	{
		return EMPTY;
	//    0    0:getstatic       #30  <Field ObjectIdInfo EMPTY>
	//    1    3:areturn         
	}

	public boolean getAlwaysAsId()
	{
		return _alwaysAsId;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field boolean _alwaysAsId>
	//    2    4:ireturn         
	}

	public Class getGeneratorType()
	{
		return _generator;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Class _generator>
	//    2    4:areturn         
	}

	public PropertyName getPropertyName()
	{
		return _propertyName;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field PropertyName _propertyName>
	//    2    4:areturn         
	}

	public Class getResolverType()
	{
		return _resolver;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Class _resolver>
	//    2    4:areturn         
	}

	public Class getScope()
	{
		return _scope;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Class _scope>
	//    2    4:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #66  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #67  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("ObjectIdInfo: propName=");
	//    4    8:aload_1         
	//    5    9:ldc1            #69  <String "ObjectIdInfo: propName=">
	//    6   11:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (_propertyName)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #38  <Field PropertyName _propertyName>
	//   11   20:invokevirtual   #76  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append(", scope=");
	//   13   24:aload_1         
	//   14   25:ldc1            #78  <String ", scope=">
	//   15   27:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(ClassUtil.nameOf(_scope));
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #40  <Field Class _scope>
	//   20   36:invokestatic    #84  <Method String ClassUtil.nameOf(Class)>
	//   21   39:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
		stringbuilder.append(", generatorType=");
	//   23   43:aload_1         
	//   24   44:ldc1            #86  <String ", generatorType=">
	//   25   46:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
		stringbuilder.append(ClassUtil.nameOf(_generator));
	//   27   50:aload_1         
	//   28   51:aload_0         
	//   29   52:getfield        #42  <Field Class _generator>
	//   30   55:invokestatic    #84  <Method String ClassUtil.nameOf(Class)>
	//   31   58:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   32   61:pop             
		stringbuilder.append(", alwaysAsId=");
	//   33   62:aload_1         
	//   34   63:ldc1            #88  <String ", alwaysAsId=">
	//   35   65:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   36   68:pop             
		stringbuilder.append(_alwaysAsId);
	//   37   69:aload_1         
	//   38   70:aload_0         
	//   39   71:getfield        #44  <Field boolean _alwaysAsId>
	//   40   74:invokevirtual   #91  <Method StringBuilder StringBuilder.append(boolean)>
	//   41   77:pop             
		return stringbuilder.toString();
	//   42   78:aload_1         
	//   43   79:invokevirtual   #93  <Method String StringBuilder.toString()>
	//   44   82:areturn         
	}

	public ObjectIdInfo withAlwaysAsId(boolean flag)
	{
		if(_alwaysAsId == flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field boolean _alwaysAsId>
	//*   2    4:iload_1         
	//*   3    5:icmpne          10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new ObjectIdInfo(_propertyName, _scope, _generator, flag, _resolver);
	//    6   10:new             #2   <Class ObjectIdInfo>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #38  <Field PropertyName _propertyName>
	//   10   18:aload_0         
	//   11   19:getfield        #40  <Field Class _scope>
	//   12   22:aload_0         
	//   13   23:getfield        #42  <Field Class _generator>
	//   14   26:iload_1         
	//   15   27:aload_0         
	//   16   28:getfield        #48  <Field Class _resolver>
	//   17   31:invokespecial   #28  <Method void ObjectIdInfo(PropertyName, Class, Class, boolean, Class)>
	//   18   34:areturn         
	}

	private static final ObjectIdInfo EMPTY;
	protected final boolean _alwaysAsId;
	protected final Class _generator;
	protected final PropertyName _propertyName;
	protected final Class _resolver;
	protected final Class _scope;

	static 
	{
		EMPTY = new ObjectIdInfo(PropertyName.NO_NAME, java/lang/Object, ((Class) (null)), false, ((Class) (null)));
	//    0    0:new             #2   <Class ObjectIdInfo>
	//    1    3:dup             
	//    2    4:getstatic       #24  <Field PropertyName PropertyName.NO_NAME>
	//    3    7:ldc1            #4   <Class Object>
	//    4    9:aconst_null     
	//    5   10:iconst_0        
	//    6   11:aconst_null     
	//    7   12:invokespecial   #28  <Method void ObjectIdInfo(PropertyName, Class, Class, boolean, Class)>
	//    8   15:putstatic       #30  <Field ObjectIdInfo EMPTY>
	//*   9   18:return          
	}
}
