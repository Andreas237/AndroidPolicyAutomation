// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.databind.JavaType;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//			SimpleType, TypeBindings, TypeBase

public class ReferenceType extends SimpleType
{

	protected ReferenceType(TypeBase typebase, JavaType javatype)
	{
		super(typebase);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void SimpleType(TypeBase)>
		_referencedType = javatype;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #17  <Field JavaType _referencedType>
	//    6   10:return          
	}

	protected ReferenceType(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[], JavaType javatype1, Object obj, Object obj1, 
			boolean flag)
	{
		super(class1, typebindings, javatype, ajavatype, javatype1.hashCode(), obj, obj1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokevirtual   #25  <Method int JavaType.hashCode()>
	//    7   11:aload           6
	//    8   13:aload           7
	//    9   15:iload           8
	//   10   17:invokespecial   #28  <Method void SimpleType(Class, TypeBindings, JavaType, JavaType[], int, Object, Object, boolean)>
		_referencedType = javatype1;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #17  <Field JavaType _referencedType>
	//   14   26:return          
	}

	public static ReferenceType construct(Class class1, JavaType javatype)
	{
		return new ReferenceType(class1, TypeBindings.emptyBindings(), ((JavaType) (null)), ((JavaType []) (null)), javatype, ((Object) (null)), ((Object) (null)), false);
	//    0    0:new             #2   <Class ReferenceType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokestatic    #39  <Method TypeBindings TypeBindings.emptyBindings()>
	//    4    8:aconst_null     
	//    5    9:aconst_null     
	//    6   10:aload_1         
	//    7   11:aconst_null     
	//    8   12:aconst_null     
	//    9   13:iconst_0        
	//   10   14:invokespecial   #41  <Method void ReferenceType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   11   17:areturn         
	}

	public static ReferenceType construct(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[], JavaType javatype1)
	{
		return new ReferenceType(class1, typebindings, javatype, ajavatype, javatype1, ((Object) (null)), ((Object) (null)), false);
	//    0    0:new             #2   <Class ReferenceType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:aconst_null     
	//    8   11:aconst_null     
	//    9   12:iconst_0        
	//   10   13:invokespecial   #41  <Method void ReferenceType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   11   16:areturn         
	}

	public static ReferenceType upgradeFrom(JavaType javatype, JavaType javatype1)
	{
		if(javatype1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("Missing referencedType");
	//    2    4:new             #49  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #51  <String "Missing referencedType">
	//    5   10:invokespecial   #54  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		if(javatype instanceof TypeBase)
	//*   7   14:aload_0         
	//*   8   15:instanceof      #56  <Class TypeBase>
	//*   9   18:ifeq            34
			return new ReferenceType((TypeBase)javatype, javatype1);
	//   10   21:new             #2   <Class ReferenceType>
	//   11   24:dup             
	//   12   25:aload_0         
	//   13   26:checkcast       #56  <Class TypeBase>
	//   14   29:aload_1         
	//   15   30:invokespecial   #58  <Method void ReferenceType(TypeBase, JavaType)>
	//   16   33:areturn         
		else
			throw new IllegalArgumentException((new StringBuilder()).append("Can not upgrade from an instance of ").append(((Object) (((Object) (javatype)).getClass()))).toString());
	//   17   34:new             #49  <Class IllegalArgumentException>
	//   18   37:dup             
	//   19   38:new             #60  <Class StringBuilder>
	//   20   41:dup             
	//   21   42:invokespecial   #63  <Method void StringBuilder()>
	//   22   45:ldc1            #65  <String "Can not upgrade from an instance of ">
	//   23   47:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   24   50:aload_0         
	//   25   51:invokevirtual   #75  <Method Class Object.getClass()>
	//   26   54:invokevirtual   #78  <Method StringBuilder StringBuilder.append(Object)>
	//   27   57:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   28   60:invokespecial   #54  <Method void IllegalArgumentException(String)>
	//   29   63:athrow          
	}

	protected JavaType _narrow(Class class1)
	{
		return ((JavaType) (new ReferenceType(class1, _bindings, _superClass, _superInterfaces, _referencedType, _valueHandler, _typeHandler, _asStatic)));
	//    0    0:new             #2   <Class ReferenceType>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #88  <Field TypeBindings _bindings>
	//    5    9:aload_0         
	//    6   10:getfield        #91  <Field JavaType _superClass>
	//    7   13:aload_0         
	//    8   14:getfield        #95  <Field JavaType[] _superInterfaces>
	//    9   17:aload_0         
	//   10   18:getfield        #17  <Field JavaType _referencedType>
	//   11   21:aload_0         
	//   12   22:getfield        #99  <Field Object _valueHandler>
	//   13   25:aload_0         
	//   14   26:getfield        #102 <Field Object _typeHandler>
	//   15   29:aload_0         
	//   16   30:getfield        #106 <Field boolean _asStatic>
	//   17   33:invokespecial   #41  <Method void ReferenceType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   18   36:areturn         
	}

	protected String buildCanonicalName()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #60  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #63  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(_class.getName());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #112 <Field Class _class>
	//    7   13:invokevirtual   #117 <Method String Class.getName()>
	//    8   16:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append('<');
	//   10   20:aload_1         
	//   11   21:bipush          60
	//   12   23:invokevirtual   #120 <Method StringBuilder StringBuilder.append(char)>
	//   13   26:pop             
		stringbuilder.append(_referencedType.toCanonical());
	//   14   27:aload_1         
	//   15   28:aload_0         
	//   16   29:getfield        #17  <Field JavaType _referencedType>
	//   17   32:invokevirtual   #123 <Method String JavaType.toCanonical()>
	//   18   35:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
		return stringbuilder.toString();
	//   20   39:aload_1         
	//   21   40:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   22   43:areturn         
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
	//*  16   20:invokevirtual   #75  <Method Class Object.getClass()>
	//*  17   23:aload_0         
	//*  18   24:invokevirtual   #75  <Method Class Object.getClass()>
	//*  19   27:if_acmpne       9
				{
					obj = ((Object) ((ReferenceType)obj));
	//   20   30:aload_1         
	//   21   31:checkcast       #2   <Class ReferenceType>
	//   22   34:astore_1        
					flag = flag1;
	//   23   35:iload_3         
	//   24   36:istore_2        
					if(((ReferenceType) (obj))._class == _class)
	//*  25   37:aload_1         
	//*  26   38:getfield        #112 <Field Class _class>
	//*  27   41:aload_0         
	//*  28   42:getfield        #112 <Field Class _class>
	//*  29   45:if_acmpne       9
						return _referencedType.equals(((Object) (((ReferenceType) (obj))._referencedType)));
	//   30   48:aload_0         
	//   31   49:getfield        #17  <Field JavaType _referencedType>
	//   32   52:aload_1         
	//   33   53:getfield        #17  <Field JavaType _referencedType>
	//   34   56:invokevirtual   #127 <Method boolean JavaType.equals(Object)>
	//   35   59:ireturn         
				}
			}
		}
		return flag;
	}

	public volatile ResolvedType getContentType()
	{
		return ((ResolvedType) (getContentType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #132 <Method JavaType getContentType()>
	//    2    4:areturn         
	}

	public JavaType getContentType()
	{
		return _referencedType;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field JavaType _referencedType>
	//    2    4:areturn         
	}

	public StringBuilder getErasedSignature(StringBuilder stringbuilder)
	{
		return _classSignature(_class, stringbuilder, true);
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field Class _class>
	//    2    4:aload_1         
	//    3    5:iconst_1        
	//    4    6:invokestatic    #138 <Method StringBuilder _classSignature(Class, StringBuilder, boolean)>
	//    5    9:areturn         
	}

	public StringBuilder getGenericSignature(StringBuilder stringbuilder)
	{
		_classSignature(_class, stringbuilder, false);
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field Class _class>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:invokestatic    #138 <Method StringBuilder _classSignature(Class, StringBuilder, boolean)>
	//    5    9:pop             
		stringbuilder.append('<');
	//    6   10:aload_1         
	//    7   11:bipush          60
	//    8   13:invokevirtual   #120 <Method StringBuilder StringBuilder.append(char)>
	//    9   16:pop             
		stringbuilder = _referencedType.getGenericSignature(stringbuilder);
	//   10   17:aload_0         
	//   11   18:getfield        #17  <Field JavaType _referencedType>
	//   12   21:aload_1         
	//   13   22:invokevirtual   #141 <Method StringBuilder JavaType.getGenericSignature(StringBuilder)>
	//   14   25:astore_1        
		stringbuilder.append(';');
	//   15   26:aload_1         
	//   16   27:bipush          59
	//   17   29:invokevirtual   #120 <Method StringBuilder StringBuilder.append(char)>
	//   18   32:pop             
		return stringbuilder;
	//   19   33:aload_1         
	//   20   34:areturn         
	}

	public volatile ResolvedType getReferencedType()
	{
		return ((ResolvedType) (getReferencedType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #144 <Method JavaType getReferencedType()>
	//    2    4:areturn         
	}

	public JavaType getReferencedType()
	{
		return _referencedType;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field JavaType _referencedType>
	//    2    4:areturn         
	}

	public boolean isReferenceType()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public JavaType refine(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[])
	{
		return ((JavaType) (new ReferenceType(class1, _bindings, javatype, ajavatype, _referencedType, _valueHandler, _typeHandler, _asStatic)));
	//    0    0:new             #2   <Class ReferenceType>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #88  <Field TypeBindings _bindings>
	//    5    9:aload_3         
	//    6   10:aload           4
	//    7   12:aload_0         
	//    8   13:getfield        #17  <Field JavaType _referencedType>
	//    9   16:aload_0         
	//   10   17:getfield        #99  <Field Object _valueHandler>
	//   11   20:aload_0         
	//   12   21:getfield        #102 <Field Object _typeHandler>
	//   13   24:aload_0         
	//   14   25:getfield        #106 <Field boolean _asStatic>
	//   15   28:invokespecial   #41  <Method void ReferenceType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   16   31:areturn         
	}

	public String toString()
	{
		return (new StringBuilder(40)).append("[reference type, class ").append(buildCanonicalName()).append('<').append(((Object) (_referencedType))).append('>').append(']').toString();
	//    0    0:new             #60  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          40
	//    3    6:invokespecial   #152 <Method void StringBuilder(int)>
	//    4    9:ldc1            #154 <String "[reference type, class ">
	//    5   11:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #156 <Method String buildCanonicalName()>
	//    8   18:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:bipush          60
	//   10   23:invokevirtual   #120 <Method StringBuilder StringBuilder.append(char)>
	//   11   26:aload_0         
	//   12   27:getfield        #17  <Field JavaType _referencedType>
	//   13   30:invokevirtual   #78  <Method StringBuilder StringBuilder.append(Object)>
	//   14   33:bipush          62
	//   15   35:invokevirtual   #120 <Method StringBuilder StringBuilder.append(char)>
	//   16   38:bipush          93
	//   17   40:invokevirtual   #120 <Method StringBuilder StringBuilder.append(char)>
	//   18   43:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   19   46:areturn         
	}

	public JavaType withContentType(JavaType javatype)
	{
		if(_referencedType == javatype)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field JavaType _referencedType>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return ((JavaType) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return ((JavaType) (new ReferenceType(_class, _bindings, _superClass, _superInterfaces, javatype, _valueHandler, _typeHandler, _asStatic)));
	//    6   10:new             #2   <Class ReferenceType>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #112 <Field Class _class>
	//   10   18:aload_0         
	//   11   19:getfield        #88  <Field TypeBindings _bindings>
	//   12   22:aload_0         
	//   13   23:getfield        #91  <Field JavaType _superClass>
	//   14   26:aload_0         
	//   15   27:getfield        #95  <Field JavaType[] _superInterfaces>
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:getfield        #99  <Field Object _valueHandler>
	//   19   35:aload_0         
	//   20   36:getfield        #102 <Field Object _typeHandler>
	//   21   39:aload_0         
	//   22   40:getfield        #106 <Field boolean _asStatic>
	//   23   43:invokespecial   #41  <Method void ReferenceType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   24   46:areturn         
	}

	public volatile JavaType withContentTypeHandler(Object obj)
	{
		return ((JavaType) (withContentTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #163 <Method ReferenceType withContentTypeHandler(Object)>
	//    3    5:areturn         
	}

	public ReferenceType withContentTypeHandler(Object obj)
	{
		if(obj == _referencedType.getTypeHandler())
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #17  <Field JavaType _referencedType>
	//*   3    5:invokevirtual   #167 <Method Object JavaType.getTypeHandler()>
	//*   4    8:if_acmpne       13
			return this;
	//    5   11:aload_0         
	//    6   12:areturn         
		else
			return new ReferenceType(_class, _bindings, _superClass, _superInterfaces, _referencedType.withTypeHandler(obj), _valueHandler, _typeHandler, _asStatic);
	//    7   13:new             #2   <Class ReferenceType>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #112 <Field Class _class>
	//   11   21:aload_0         
	//   12   22:getfield        #88  <Field TypeBindings _bindings>
	//   13   25:aload_0         
	//   14   26:getfield        #91  <Field JavaType _superClass>
	//   15   29:aload_0         
	//   16   30:getfield        #95  <Field JavaType[] _superInterfaces>
	//   17   33:aload_0         
	//   18   34:getfield        #17  <Field JavaType _referencedType>
	//   19   37:aload_1         
	//   20   38:invokevirtual   #170 <Method JavaType JavaType.withTypeHandler(Object)>
	//   21   41:aload_0         
	//   22   42:getfield        #99  <Field Object _valueHandler>
	//   23   45:aload_0         
	//   24   46:getfield        #102 <Field Object _typeHandler>
	//   25   49:aload_0         
	//   26   50:getfield        #106 <Field boolean _asStatic>
	//   27   53:invokespecial   #41  <Method void ReferenceType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   28   56:areturn         
	}

	public volatile JavaType withContentValueHandler(Object obj)
	{
		return ((JavaType) (withContentValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #173 <Method ReferenceType withContentValueHandler(Object)>
	//    3    5:areturn         
	}

	public ReferenceType withContentValueHandler(Object obj)
	{
		if(obj == _referencedType.getValueHandler())
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #17  <Field JavaType _referencedType>
	//*   3    5:invokevirtual   #176 <Method Object JavaType.getValueHandler()>
	//*   4    8:if_acmpne       13
			return this;
	//    5   11:aload_0         
	//    6   12:areturn         
		else
			return new ReferenceType(_class, _bindings, _superClass, _superInterfaces, _referencedType.withValueHandler(obj), _valueHandler, _typeHandler, _asStatic);
	//    7   13:new             #2   <Class ReferenceType>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #112 <Field Class _class>
	//   11   21:aload_0         
	//   12   22:getfield        #88  <Field TypeBindings _bindings>
	//   13   25:aload_0         
	//   14   26:getfield        #91  <Field JavaType _superClass>
	//   15   29:aload_0         
	//   16   30:getfield        #95  <Field JavaType[] _superInterfaces>
	//   17   33:aload_0         
	//   18   34:getfield        #17  <Field JavaType _referencedType>
	//   19   37:aload_1         
	//   20   38:invokevirtual   #179 <Method JavaType JavaType.withValueHandler(Object)>
	//   21   41:aload_0         
	//   22   42:getfield        #99  <Field Object _valueHandler>
	//   23   45:aload_0         
	//   24   46:getfield        #102 <Field Object _typeHandler>
	//   25   49:aload_0         
	//   26   50:getfield        #106 <Field boolean _asStatic>
	//   27   53:invokespecial   #41  <Method void ReferenceType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   28   56:areturn         
	}

	public volatile SimpleType withContentValueHandler(Object obj)
	{
		return ((SimpleType) (withContentValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #173 <Method ReferenceType withContentValueHandler(Object)>
	//    3    5:areturn         
	}

	public volatile JavaType withStaticTyping()
	{
		return ((JavaType) (withStaticTyping()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #184 <Method ReferenceType withStaticTyping()>
	//    2    4:areturn         
	}

	public ReferenceType withStaticTyping()
	{
		if(_asStatic)
	//*   0    0:aload_0         
	//*   1    1:getfield        #106 <Field boolean _asStatic>
	//*   2    4:ifeq            9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		else
			return new ReferenceType(_class, _bindings, _superClass, _superInterfaces, _referencedType.withStaticTyping(), _valueHandler, _typeHandler, true);
	//    5    9:new             #2   <Class ReferenceType>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #112 <Field Class _class>
	//    9   17:aload_0         
	//   10   18:getfield        #88  <Field TypeBindings _bindings>
	//   11   21:aload_0         
	//   12   22:getfield        #91  <Field JavaType _superClass>
	//   13   25:aload_0         
	//   14   26:getfield        #95  <Field JavaType[] _superInterfaces>
	//   15   29:aload_0         
	//   16   30:getfield        #17  <Field JavaType _referencedType>
	//   17   33:invokevirtual   #186 <Method JavaType JavaType.withStaticTyping()>
	//   18   36:aload_0         
	//   19   37:getfield        #99  <Field Object _valueHandler>
	//   20   40:aload_0         
	//   21   41:getfield        #102 <Field Object _typeHandler>
	//   22   44:iconst_1        
	//   23   45:invokespecial   #41  <Method void ReferenceType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   24   48:areturn         
	}

	public volatile SimpleType withStaticTyping()
	{
		return ((SimpleType) (withStaticTyping()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #184 <Method ReferenceType withStaticTyping()>
	//    2    4:areturn         
	}

	public volatile JavaType withTypeHandler(Object obj)
	{
		return ((JavaType) (withTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #189 <Method ReferenceType withTypeHandler(Object)>
	//    3    5:areturn         
	}

	public ReferenceType withTypeHandler(Object obj)
	{
		if(obj == _typeHandler)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #102 <Field Object _typeHandler>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new ReferenceType(_class, _bindings, _superClass, _superInterfaces, _referencedType, _valueHandler, obj, _asStatic);
	//    6   10:new             #2   <Class ReferenceType>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #112 <Field Class _class>
	//   10   18:aload_0         
	//   11   19:getfield        #88  <Field TypeBindings _bindings>
	//   12   22:aload_0         
	//   13   23:getfield        #91  <Field JavaType _superClass>
	//   14   26:aload_0         
	//   15   27:getfield        #95  <Field JavaType[] _superInterfaces>
	//   16   30:aload_0         
	//   17   31:getfield        #17  <Field JavaType _referencedType>
	//   18   34:aload_0         
	//   19   35:getfield        #99  <Field Object _valueHandler>
	//   20   38:aload_1         
	//   21   39:aload_0         
	//   22   40:getfield        #106 <Field boolean _asStatic>
	//   23   43:invokespecial   #41  <Method void ReferenceType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   24   46:areturn         
	}

	public volatile SimpleType withTypeHandler(Object obj)
	{
		return ((SimpleType) (withTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #189 <Method ReferenceType withTypeHandler(Object)>
	//    3    5:areturn         
	}

	public volatile JavaType withValueHandler(Object obj)
	{
		return ((JavaType) (withValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #191 <Method ReferenceType withValueHandler(Object)>
	//    3    5:areturn         
	}

	public ReferenceType withValueHandler(Object obj)
	{
		if(obj == _valueHandler)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #99  <Field Object _valueHandler>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new ReferenceType(_class, _bindings, _superClass, _superInterfaces, _referencedType, obj, _typeHandler, _asStatic);
	//    6   10:new             #2   <Class ReferenceType>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #112 <Field Class _class>
	//   10   18:aload_0         
	//   11   19:getfield        #88  <Field TypeBindings _bindings>
	//   12   22:aload_0         
	//   13   23:getfield        #91  <Field JavaType _superClass>
	//   14   26:aload_0         
	//   15   27:getfield        #95  <Field JavaType[] _superInterfaces>
	//   16   30:aload_0         
	//   17   31:getfield        #17  <Field JavaType _referencedType>
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #102 <Field Object _typeHandler>
	//   21   39:aload_0         
	//   22   40:getfield        #106 <Field boolean _asStatic>
	//   23   43:invokespecial   #41  <Method void ReferenceType(Class, TypeBindings, JavaType, JavaType[], JavaType, Object, Object, boolean)>
	//   24   46:areturn         
	}

	public volatile SimpleType withValueHandler(Object obj)
	{
		return ((SimpleType) (withValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #191 <Method ReferenceType withValueHandler(Object)>
	//    3    5:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final JavaType _referencedType;
}
