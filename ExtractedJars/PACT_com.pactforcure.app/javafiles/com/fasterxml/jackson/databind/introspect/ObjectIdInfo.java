// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.fasterxml.jackson.databind.PropertyName;

public class ObjectIdInfo
{

	public ObjectIdInfo(PropertyName propertyname, Class class1, Class class2)
	{
		this(propertyname, class1, class2, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_0        
	//    5    5:invokespecial   #21  <Method void ObjectIdInfo(PropertyName, Class, Class, boolean)>
	//    6    8:return          
	}

	public ObjectIdInfo(PropertyName propertyname, Class class1, Class class2, Class class3)
	{
		this(propertyname, class1, class2, false, class3);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_0        
	//    5    5:aload           4
	//    6    7:invokespecial   #29  <Method void ObjectIdInfo(PropertyName, Class, Class, boolean, Class)>
	//    7   10:return          
	}

	protected ObjectIdInfo(PropertyName propertyname, Class class1, Class class2, boolean flag)
	{
		this(propertyname, class1, class2, flag, com/fasterxml/jackson/annotation/SimpleObjectIdResolver);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:ldc1            #32  <Class SimpleObjectIdResolver>
	//    6    8:invokespecial   #29  <Method void ObjectIdInfo(PropertyName, Class, Class, boolean, Class)>
	//    7   11:return          
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
	//   18   33:ldc1            #32  <Class SimpleObjectIdResolver>
	//   19   35:astore_1        
		_resolver = ((Class) (propertyname));
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:putfield        #46  <Field Class _resolver>
	//   23   41:return          
	}

	public ObjectIdInfo(String s, Class class1, Class class2)
	{
		this(new PropertyName(s), class1, class2, false);
	//    0    0:aload_0         
	//    1    1:new             #50  <Class PropertyName>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #53  <Method void PropertyName(String)>
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:iconst_0        
	//    8   12:invokespecial   #21  <Method void ObjectIdInfo(PropertyName, Class, Class, boolean)>
	//    9   15:return          
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
	//    1    1:getfield        #46  <Field Class _resolver>
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
		StringBuilder stringbuilder = (new StringBuilder()).append("ObjectIdInfo: propName=").append(((Object) (_propertyName))).append(", scope=");
	//    0    0:new             #69  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #70  <Method void StringBuilder()>
	//    3    7:ldc1            #72  <String "ObjectIdInfo: propName=">
	//    4    9:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #38  <Field PropertyName _propertyName>
	//    7   16:invokevirtual   #79  <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:ldc1            #81  <String ", scope=">
	//    9   21:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:astore_2        
		String s;
		if(_scope == null)
	//*  11   25:aload_0         
	//*  12   26:getfield        #40  <Field Class _scope>
	//*  13   29:ifnonnull       77
			s = "null";
	//   14   32:ldc1            #83  <String "null">
	//   15   34:astore_1        
		else
	//*  16   35:aload_2         
	//*  17   36:aload_1         
	//*  18   37:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//*  19   40:ldc1            #85  <String ", generatorType=">
	//*  20   42:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//*  21   45:astore_2        
	//*  22   46:aload_0         
	//*  23   47:getfield        #42  <Field Class _generator>
	//*  24   50:ifnonnull       88
	//*  25   53:ldc1            #83  <String "null">
	//*  26   55:astore_1        
	//*  27   56:aload_2         
	//*  28   57:aload_1         
	//*  29   58:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//*  30   61:ldc1            #87  <String ", alwaysAsId=">
	//*  31   63:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//*  32   66:aload_0         
	//*  33   67:getfield        #44  <Field boolean _alwaysAsId>
	//*  34   70:invokevirtual   #90  <Method StringBuilder StringBuilder.append(boolean)>
	//*  35   73:invokevirtual   #92  <Method String StringBuilder.toString()>
	//*  36   76:areturn         
			s = _scope.getName();
	//   37   77:aload_0         
	//   38   78:getfield        #40  <Field Class _scope>
	//   39   81:invokevirtual   #97  <Method String Class.getName()>
	//   40   84:astore_1        
		stringbuilder = stringbuilder.append(s).append(", generatorType=");
		if(_generator == null)
			s = "null";
		else
	//*  41   85:goto            35
			s = _generator.getName();
	//   42   88:aload_0         
	//   43   89:getfield        #42  <Field Class _generator>
	//   44   92:invokevirtual   #97  <Method String Class.getName()>
	//   45   95:astore_1        
		return stringbuilder.append(s).append(", alwaysAsId=").append(_alwaysAsId).toString();
	//*  46   96:goto            56
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
	//   16   28:getfield        #46  <Field Class _resolver>
	//   17   31:invokespecial   #29  <Method void ObjectIdInfo(PropertyName, Class, Class, boolean, Class)>
	//   18   34:areturn         
	}

	protected final boolean _alwaysAsId;
	protected final Class _generator;
	protected final PropertyName _propertyName;
	protected final Class _resolver;
	protected final Class _scope;
}
