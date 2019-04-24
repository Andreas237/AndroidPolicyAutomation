// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.util.Collection;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//			TypeBase, TypeBindings, TypeFactory

public class SimpleType extends TypeBase
{

	protected SimpleType(TypeBase typebase)
	{
		super(typebase);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void TypeBase(TypeBase)>
	//    3    5:return          
	}

	protected SimpleType(Class class1)
	{
		this(class1, TypeBindings.emptyBindings(), ((JavaType) (null)), ((JavaType []) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #20  <Method TypeBindings TypeBindings.emptyBindings()>
	//    3    5:aconst_null     
	//    4    6:aconst_null     
	//    5    7:invokespecial   #23  <Method void SimpleType(Class, TypeBindings, JavaType, JavaType[])>
	//    6   10:return          
	}

	protected SimpleType(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[])
	{
		this(class1, typebindings, javatype, ajavatype, ((Object) (null)), ((Object) (null)), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aconst_null     
	//    6    7:aconst_null     
	//    7    8:iconst_0        
	//    8    9:invokespecial   #28  <Method void SimpleType(Class, TypeBindings, JavaType, JavaType[], Object, Object, boolean)>
	//    9   12:return          
	}

	protected SimpleType(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[], int i, Object obj, Object obj1, 
			boolean flag)
	{
		super(class1, typebindings, javatype, ajavatype, i, obj, obj1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:aload           6
	//    7   10:aload           7
	//    8   12:iload           8
	//    9   14:invokespecial   #32  <Method void TypeBase(Class, TypeBindings, JavaType, JavaType[], int, Object, Object, boolean)>
	//   10   17:return          
	}

	protected SimpleType(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[], Object obj, Object obj1, boolean flag)
	{
		super(class1, typebindings, javatype, ajavatype, 0, obj, obj1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iconst_0        
	//    6    7:aload           5
	//    7    9:aload           6
	//    8   11:iload           7
	//    9   13:invokespecial   #32  <Method void TypeBase(Class, TypeBindings, JavaType, JavaType[], int, Object, Object, boolean)>
	//   10   16:return          
	}

	private static JavaType _buildSuperClass(Class class1, TypeBindings typebindings)
	{
		if(class1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		if(class1 == java/lang/Object)
	//*   4    6:aload_0         
	//*   5    7:ldc1            #38  <Class Object>
	//*   6    9:if_acmpne       16
			return TypeFactory.unknownType();
	//    7   12:invokestatic    #44  <Method JavaType TypeFactory.unknownType()>
	//    8   15:areturn         
		else
			return ((JavaType) (new SimpleType(class1, typebindings, _buildSuperClass(class1.getSuperclass(), typebindings), ((JavaType []) (null)), ((Object) (null)), ((Object) (null)), false)));
	//    9   16:new             #2   <Class SimpleType>
	//   10   19:dup             
	//   11   20:aload_0         
	//   12   21:aload_1         
	//   13   22:aload_0         
	//   14   23:invokevirtual   #50  <Method Class Class.getSuperclass()>
	//   15   26:aload_1         
	//   16   27:invokestatic    #52  <Method JavaType _buildSuperClass(Class, TypeBindings)>
	//   17   30:aconst_null     
	//   18   31:aconst_null     
	//   19   32:aconst_null     
	//   20   33:iconst_0        
	//   21   34:invokespecial   #28  <Method void SimpleType(Class, TypeBindings, JavaType, JavaType[], Object, Object, boolean)>
	//   22   37:areturn         
	}

	public static SimpleType construct(Class class1)
	{
		if(((Class) (java/util/Map)).isAssignableFrom(class1))
	//*   0    0:ldc1            #58  <Class Map>
	//*   1    2:aload_0         
	//*   2    3:invokevirtual   #62  <Method boolean Class.isAssignableFrom(Class)>
	//*   3    6:ifeq            44
			throw new IllegalArgumentException((new StringBuilder()).append("Can not construct SimpleType for a Map (class: ").append(class1.getName()).append(")").toString());
	//    4    9:new             #64  <Class IllegalArgumentException>
	//    5   12:dup             
	//    6   13:new             #66  <Class StringBuilder>
	//    7   16:dup             
	//    8   17:invokespecial   #69  <Method void StringBuilder()>
	//    9   20:ldc1            #71  <String "Can not construct SimpleType for a Map (class: ">
	//   10   22:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_0         
	//   12   26:invokevirtual   #79  <Method String Class.getName()>
	//   13   29:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   14   32:ldc1            #81  <String ")">
	//   15   34:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   16   37:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   17   40:invokespecial   #87  <Method void IllegalArgumentException(String)>
	//   18   43:athrow          
		if(((Class) (java/util/Collection)).isAssignableFrom(class1))
	//*  19   44:ldc1            #89  <Class Collection>
	//*  20   46:aload_0         
	//*  21   47:invokevirtual   #62  <Method boolean Class.isAssignableFrom(Class)>
	//*  22   50:ifeq            88
			throw new IllegalArgumentException((new StringBuilder()).append("Can not construct SimpleType for a Collection (class: ").append(class1.getName()).append(")").toString());
	//   23   53:new             #64  <Class IllegalArgumentException>
	//   24   56:dup             
	//   25   57:new             #66  <Class StringBuilder>
	//   26   60:dup             
	//   27   61:invokespecial   #69  <Method void StringBuilder()>
	//   28   64:ldc1            #91  <String "Can not construct SimpleType for a Collection (class: ">
	//   29   66:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   30   69:aload_0         
	//   31   70:invokevirtual   #79  <Method String Class.getName()>
	//   32   73:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   33   76:ldc1            #81  <String ")">
	//   34   78:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   35   81:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   36   84:invokespecial   #87  <Method void IllegalArgumentException(String)>
	//   37   87:athrow          
		if(class1.isArray())
	//*  38   88:aload_0         
	//*  39   89:invokevirtual   #95  <Method boolean Class.isArray()>
	//*  40   92:ifeq            130
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Can not construct SimpleType for an array (class: ").append(class1.getName()).append(")").toString());
	//   41   95:new             #64  <Class IllegalArgumentException>
	//   42   98:dup             
	//   43   99:new             #66  <Class StringBuilder>
	//   44  102:dup             
	//   45  103:invokespecial   #69  <Method void StringBuilder()>
	//   46  106:ldc1            #97  <String "Can not construct SimpleType for an array (class: ">
	//   47  108:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   48  111:aload_0         
	//   49  112:invokevirtual   #79  <Method String Class.getName()>
	//   50  115:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   51  118:ldc1            #81  <String ")">
	//   52  120:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   53  123:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   54  126:invokespecial   #87  <Method void IllegalArgumentException(String)>
	//   55  129:athrow          
		} else
		{
			TypeBindings typebindings = TypeBindings.emptyBindings();
	//   56  130:invokestatic    #20  <Method TypeBindings TypeBindings.emptyBindings()>
	//   57  133:astore_1        
			return new SimpleType(class1, typebindings, _buildSuperClass(class1.getSuperclass(), typebindings), ((JavaType []) (null)), ((Object) (null)), ((Object) (null)), false);
	//   58  134:new             #2   <Class SimpleType>
	//   59  137:dup             
	//   60  138:aload_0         
	//   61  139:aload_1         
	//   62  140:aload_0         
	//   63  141:invokevirtual   #50  <Method Class Class.getSuperclass()>
	//   64  144:aload_1         
	//   65  145:invokestatic    #52  <Method JavaType _buildSuperClass(Class, TypeBindings)>
	//   66  148:aconst_null     
	//   67  149:aconst_null     
	//   68  150:aconst_null     
	//   69  151:iconst_0        
	//   70  152:invokespecial   #28  <Method void SimpleType(Class, TypeBindings, JavaType, JavaType[], Object, Object, boolean)>
	//   71  155:areturn         
		}
	}

	public static SimpleType constructUnsafe(Class class1)
	{
		return new SimpleType(class1, ((TypeBindings) (null)), ((JavaType) (null)), ((JavaType []) (null)), ((Object) (null)), ((Object) (null)), false);
	//    0    0:new             #2   <Class SimpleType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:aconst_null     
	//    5    7:aconst_null     
	//    6    8:aconst_null     
	//    7    9:aconst_null     
	//    8   10:iconst_0        
	//    9   11:invokespecial   #28  <Method void SimpleType(Class, TypeBindings, JavaType, JavaType[], Object, Object, boolean)>
	//   10   14:areturn         
	}

	protected JavaType _narrow(Class class1)
	{
		if(_class == class1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #106 <Field Class _class>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return ((JavaType) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return ((JavaType) (new SimpleType(class1, _bindings, ((JavaType) (this)), _superInterfaces, _valueHandler, _typeHandler, _asStatic)));
	//    6   10:new             #2   <Class SimpleType>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #110 <Field TypeBindings _bindings>
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:getfield        #114 <Field JavaType[] _superInterfaces>
	//   14   24:aload_0         
	//   15   25:getfield        #118 <Field Object _valueHandler>
	//   16   28:aload_0         
	//   17   29:getfield        #121 <Field Object _typeHandler>
	//   18   32:aload_0         
	//   19   33:getfield        #125 <Field boolean _asStatic>
	//   20   36:invokespecial   #28  <Method void SimpleType(Class, TypeBindings, JavaType, JavaType[], Object, Object, boolean)>
	//   21   39:areturn         
	}

	protected String buildCanonicalName()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #66  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append(_class.getName());
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:getfield        #106 <Field Class _class>
	//    7   13:invokevirtual   #79  <Method String Class.getName()>
	//    8   16:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		int j = _bindings.size();
	//   10   20:aload_0         
	//   11   21:getfield        #110 <Field TypeBindings _bindings>
	//   12   24:invokevirtual   #131 <Method int TypeBindings.size()>
	//   13   27:istore_2        
		if(j > 0)
	//*  14   28:iload_2         
	//*  15   29:ifle            88
		{
			stringbuilder.append('<');
	//   16   32:aload_3         
	//   17   33:bipush          60
	//   18   35:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
	//   19   38:pop             
			for(int i = 0; i < j; i++)
	//*  20   39:iconst_0        
	//*  21   40:istore_1        
	//*  22   41:iload_1         
	//*  23   42:iload_2         
	//*  24   43:icmpge          81
			{
				JavaType javatype = containedType(i);
	//   25   46:aload_0         
	//   26   47:iload_1         
	//   27   48:invokevirtual   #138 <Method JavaType containedType(int)>
	//   28   51:astore          4
				if(i > 0)
	//*  29   53:iload_1         
	//*  30   54:ifle            64
					stringbuilder.append(',');
	//   31   57:aload_3         
	//   32   58:bipush          44
	//   33   60:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
	//   34   63:pop             
				stringbuilder.append(javatype.toCanonical());
	//   35   64:aload_3         
	//   36   65:aload           4
	//   37   67:invokevirtual   #143 <Method String JavaType.toCanonical()>
	//   38   70:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   39   73:pop             
			}

	//   40   74:iload_1         
	//   41   75:iconst_1        
	//   42   76:iadd            
	//   43   77:istore_1        
	//*  44   78:goto            41
			stringbuilder.append('>');
	//   45   81:aload_3         
	//   46   82:bipush          62
	//   47   84:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
	//   48   87:pop             
		}
		return stringbuilder.toString();
	//   49   88:aload_3         
	//   50   89:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   51   92:areturn         
	}

	public boolean equals(Object obj)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag;
		if(obj == this)
	//*   2    2:aload_1         
	//*   3    3:aload_0         
	//*   4    4:if_acmpne       11
		{
			flag = true;
	//    5    7:iconst_1        
	//    6    8:istore_2        
		} else
	//*   7    9:iload_2         
	//*   8   10:ireturn         
		{
			flag = flag1;
	//    9   11:iload_3         
	//   10   12:istore_2        
			if(obj != null)
	//*  11   13:aload_1         
	//*  12   14:ifnull          9
			{
				flag = flag1;
	//   13   17:iload_3         
	//   14   18:istore_2        
				if(obj.getClass() == ((Object)this).getClass())
	//*  15   19:aload_1         
	//*  16   20:invokevirtual   #148 <Method Class Object.getClass()>
	//*  17   23:aload_0         
	//*  18   24:invokevirtual   #148 <Method Class Object.getClass()>
	//*  19   27:if_acmpne       9
				{
					obj = ((Object) ((SimpleType)obj));
	//   20   30:aload_1         
	//   21   31:checkcast       #2   <Class SimpleType>
	//   22   34:astore_1        
					flag = flag1;
	//   23   35:iload_3         
	//   24   36:istore_2        
					if(((SimpleType) (obj))._class == _class)
	//*  25   37:aload_1         
	//*  26   38:getfield        #106 <Field Class _class>
	//*  27   41:aload_0         
	//*  28   42:getfield        #106 <Field Class _class>
	//*  29   45:if_acmpne       9
						return _bindings.equals(((Object) (((SimpleType) (obj))._bindings)));
	//   30   48:aload_0         
	//   31   49:getfield        #110 <Field TypeBindings _bindings>
	//   32   52:aload_1         
	//   33   53:getfield        #110 <Field TypeBindings _bindings>
	//   34   56:invokevirtual   #150 <Method boolean TypeBindings.equals(Object)>
	//   35   59:ireturn         
				}
			}
		}
		return flag;
	}

	public StringBuilder getErasedSignature(StringBuilder stringbuilder)
	{
		return _classSignature(_class, stringbuilder, true);
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field Class _class>
	//    2    4:aload_1         
	//    3    5:iconst_1        
	//    4    6:invokestatic    #156 <Method StringBuilder _classSignature(Class, StringBuilder, boolean)>
	//    5    9:areturn         
	}

	public StringBuilder getGenericSignature(StringBuilder stringbuilder)
	{
		_classSignature(_class, stringbuilder, false);
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field Class _class>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:invokestatic    #156 <Method StringBuilder _classSignature(Class, StringBuilder, boolean)>
	//    5    9:pop             
		int j = _bindings.size();
	//    6   10:aload_0         
	//    7   11:getfield        #110 <Field TypeBindings _bindings>
	//    8   14:invokevirtual   #131 <Method int TypeBindings.size()>
	//    9   17:istore_3        
		StringBuilder stringbuilder1 = stringbuilder;
	//   10   18:aload_1         
	//   11   19:astore          4
		if(j > 0)
	//*  12   21:iload_3         
	//*  13   22:ifle            66
		{
			stringbuilder.append('<');
	//   14   25:aload_1         
	//   15   26:bipush          60
	//   16   28:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
	//   17   31:pop             
			for(int i = 0; i < j; i++)
	//*  18   32:iconst_0        
	//*  19   33:istore_2        
	//*  20   34:iload_2         
	//*  21   35:iload_3         
	//*  22   36:icmpge          56
				stringbuilder = containedType(i).getGenericSignature(stringbuilder);
	//   23   39:aload_0         
	//   24   40:iload_2         
	//   25   41:invokevirtual   #138 <Method JavaType containedType(int)>
	//   26   44:aload_1         
	//   27   45:invokevirtual   #159 <Method StringBuilder JavaType.getGenericSignature(StringBuilder)>
	//   28   48:astore_1        

	//   29   49:iload_2         
	//   30   50:iconst_1        
	//   31   51:iadd            
	//   32   52:istore_2        
	//*  33   53:goto            34
			stringbuilder.append('>');
	//   34   56:aload_1         
	//   35   57:bipush          62
	//   36   59:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
	//   37   62:pop             
			stringbuilder1 = stringbuilder;
	//   38   63:aload_1         
	//   39   64:astore          4
		}
		stringbuilder1.append(';');
	//   40   66:aload           4
	//   41   68:bipush          59
	//   42   70:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
	//   43   73:pop             
		return stringbuilder1;
	//   44   74:aload           4
	//   45   76:areturn         
	}

	public boolean isContainerType()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public JavaType refine(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[])
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(40);
	//    0    0:new             #66  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          40
	//    3    6:invokespecial   #166 <Method void StringBuilder(int)>
	//    4    9:astore_1        
		stringbuilder.append("[simple type, class ").append(buildCanonicalName()).append(']');
	//    5   10:aload_1         
	//    6   11:ldc1            #168 <String "[simple type, class ">
	//    7   13:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #170 <Method String buildCanonicalName()>
	//   10   20:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
	//   11   23:bipush          93
	//   12   25:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
	//   13   28:pop             
		return stringbuilder.toString();
	//   14   29:aload_1         
	//   15   30:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   16   33:areturn         
	}

	public JavaType withContentType(JavaType javatype)
	{
		throw new IllegalArgumentException("Simple types have no content types; can not call withContentType()");
	//    0    0:new             #64  <Class IllegalArgumentException>
	//    1    3:dup             
	//    2    4:ldc1            #174 <String "Simple types have no content types; can not call withContentType()">
	//    3    6:invokespecial   #87  <Method void IllegalArgumentException(String)>
	//    4    9:athrow          
	}

	public JavaType withContentTypeHandler(Object obj)
	{
		throw new IllegalArgumentException("Simple types have no content types; can not call withContenTypeHandler()");
	//    0    0:new             #64  <Class IllegalArgumentException>
	//    1    3:dup             
	//    2    4:ldc1            #178 <String "Simple types have no content types; can not call withContenTypeHandler()">
	//    3    6:invokespecial   #87  <Method void IllegalArgumentException(String)>
	//    4    9:athrow          
	}

	public volatile JavaType withContentValueHandler(Object obj)
	{
		return ((JavaType) (withContentValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #182 <Method SimpleType withContentValueHandler(Object)>
	//    3    5:areturn         
	}

	public SimpleType withContentValueHandler(Object obj)
	{
		throw new IllegalArgumentException("Simple types have no content types; can not call withContenValueHandler()");
	//    0    0:new             #64  <Class IllegalArgumentException>
	//    1    3:dup             
	//    2    4:ldc1            #184 <String "Simple types have no content types; can not call withContenValueHandler()">
	//    3    6:invokespecial   #87  <Method void IllegalArgumentException(String)>
	//    4    9:athrow          
	}

	public volatile JavaType withStaticTyping()
	{
		return ((JavaType) (withStaticTyping()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #188 <Method SimpleType withStaticTyping()>
	//    2    4:areturn         
	}

	public SimpleType withStaticTyping()
	{
		if(_asStatic)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean _asStatic>
	//*   2    4:ifeq            9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		else
			return new SimpleType(_class, _bindings, _superClass, _superInterfaces, _valueHandler, _typeHandler, true);
	//    5    9:new             #2   <Class SimpleType>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #106 <Field Class _class>
	//    9   17:aload_0         
	//   10   18:getfield        #110 <Field TypeBindings _bindings>
	//   11   21:aload_0         
	//   12   22:getfield        #192 <Field JavaType _superClass>
	//   13   25:aload_0         
	//   14   26:getfield        #114 <Field JavaType[] _superInterfaces>
	//   15   29:aload_0         
	//   16   30:getfield        #118 <Field Object _valueHandler>
	//   17   33:aload_0         
	//   18   34:getfield        #121 <Field Object _typeHandler>
	//   19   37:iconst_1        
	//   20   38:invokespecial   #28  <Method void SimpleType(Class, TypeBindings, JavaType, JavaType[], Object, Object, boolean)>
	//   21   41:areturn         
	}

	public volatile JavaType withTypeHandler(Object obj)
	{
		return ((JavaType) (withTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #195 <Method SimpleType withTypeHandler(Object)>
	//    3    5:areturn         
	}

	public SimpleType withTypeHandler(Object obj)
	{
		if(_typeHandler == obj)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field Object _typeHandler>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new SimpleType(_class, _bindings, _superClass, _superInterfaces, _valueHandler, obj, _asStatic);
	//    6   10:new             #2   <Class SimpleType>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #106 <Field Class _class>
	//   10   18:aload_0         
	//   11   19:getfield        #110 <Field TypeBindings _bindings>
	//   12   22:aload_0         
	//   13   23:getfield        #192 <Field JavaType _superClass>
	//   14   26:aload_0         
	//   15   27:getfield        #114 <Field JavaType[] _superInterfaces>
	//   16   30:aload_0         
	//   17   31:getfield        #118 <Field Object _valueHandler>
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #125 <Field boolean _asStatic>
	//   21   39:invokespecial   #28  <Method void SimpleType(Class, TypeBindings, JavaType, JavaType[], Object, Object, boolean)>
	//   22   42:areturn         
	}

	public volatile JavaType withValueHandler(Object obj)
	{
		return ((JavaType) (withValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #198 <Method SimpleType withValueHandler(Object)>
	//    3    5:areturn         
	}

	public SimpleType withValueHandler(Object obj)
	{
		if(obj == _valueHandler)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #118 <Field Object _valueHandler>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new SimpleType(_class, _bindings, _superClass, _superInterfaces, obj, _typeHandler, _asStatic);
	//    6   10:new             #2   <Class SimpleType>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #106 <Field Class _class>
	//   10   18:aload_0         
	//   11   19:getfield        #110 <Field TypeBindings _bindings>
	//   12   22:aload_0         
	//   13   23:getfield        #192 <Field JavaType _superClass>
	//   14   26:aload_0         
	//   15   27:getfield        #114 <Field JavaType[] _superInterfaces>
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:getfield        #121 <Field Object _typeHandler>
	//   19   35:aload_0         
	//   20   36:getfield        #125 <Field boolean _asStatic>
	//   21   39:invokespecial   #28  <Method void SimpleType(Class, TypeBindings, JavaType, JavaType[], Object, Object, boolean)>
	//   22   42:areturn         
	}

	private static final long serialVersionUID = 1L;
}
