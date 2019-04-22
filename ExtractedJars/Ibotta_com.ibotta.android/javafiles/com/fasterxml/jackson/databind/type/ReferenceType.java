// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.databind.JavaType;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//			SimpleType, TypeBindings

public class ReferenceType extends SimpleType
{

	protected ReferenceType(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[], JavaType javatype1, JavaType javatype2, Object obj, 
			Object obj1, boolean flag)
	{
		super(class1, typebindings, javatype, ajavatype, javatype1.hashCode(), obj, obj1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokevirtual   #19  <Method int JavaType.hashCode()>
	//    7   11:aload           7
	//    8   13:aload           8
	//    9   15:iload           9
	//   10   17:invokespecial   #22  <Method void SimpleType(Class, TypeBindings, JavaType, JavaType[], int, Object, Object, boolean)>
		_referencedType = javatype1;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #24  <Field JavaType _referencedType>
		if(javatype2 == null)
	//*  14   26:aload           6
	//*  15   28:ifnonnull       36
			class1 = ((Class) (this));
	//   16   31:aload_0         
	//   17   32:astore_1        
		else
	//*  18   33:goto            39
			class1 = ((Class) (javatype2));
	//   19   36:aload           6
	//   20   38:astore_1        
		_anchorType = ((JavaType) (class1));
	//   21   39:aload_0         
	//   22   40:aload_1         
	//   23   41:putfield        #26  <Field JavaType _anchorType>
	//   24   44:return          
	}

	public static ReferenceType construct(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[], JavaType javatype1)
	{
		return new ReferenceType(class1, typebindings, javatype, ajavatype, javatype1, ((JavaType) (null)), ((Object) (null)), ((Object) (null)), false);
	//    0    0:new             #2   <Class ReferenceType>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:aconst_null     
	//    8   11:aconst_null     
	//    9   12:aconst_null     
	//   10   13:iconst_0        
	//   11   14:invokespecial   #33  <Method void ReferenceType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   12   17:areturn         
	}

	protected String buildCanonicalName()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #38  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(_class.getName());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #45  <Field Class _class>
	//    7   13:invokevirtual   #50  <Method String Class.getName()>
	//    8   16:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append('<');
	//   10   20:aload_1         
	//   11   21:bipush          60
	//   12   23:invokevirtual   #57  <Method StringBuilder StringBuilder.append(char)>
	//   13   26:pop             
		stringbuilder.append(_referencedType.toCanonical());
	//   14   27:aload_1         
	//   15   28:aload_0         
	//   16   29:getfield        #24  <Field JavaType _referencedType>
	//   17   32:invokevirtual   #60  <Method String JavaType.toCanonical()>
	//   18   35:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
		return stringbuilder.toString();
	//   20   39:aload_1         
	//   21   40:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   22   43:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(obj.getClass() != ((Object)this).getClass())
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #71  <Method Class Object.getClass()>
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #71  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		obj = ((Object) ((ReferenceType)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class ReferenceType>
	//   18   30:astore_1        
		if(((ReferenceType) (obj))._class != _class)
	//*  19   31:aload_1         
	//*  20   32:getfield        #45  <Field Class _class>
	//*  21   35:aload_0         
	//*  22   36:getfield        #45  <Field Class _class>
	//*  23   39:if_acmpeq       44
			return false;
	//   24   42:iconst_0        
	//   25   43:ireturn         
		else
			return _referencedType.equals(((Object) (((ReferenceType) (obj))._referencedType)));
	//   26   44:aload_0         
	//   27   45:getfield        #24  <Field JavaType _referencedType>
	//   28   48:aload_1         
	//   29   49:getfield        #24  <Field JavaType _referencedType>
	//   30   52:invokevirtual   #73  <Method boolean JavaType.equals(Object)>
	//   31   55:ireturn         
	}

	public JavaType getContentType()
	{
		return _referencedType;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field JavaType _referencedType>
	//    2    4:areturn         
	}

	public StringBuilder getGenericSignature(StringBuilder stringbuilder)
	{
		_classSignature(_class, stringbuilder, false);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Class _class>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:invokestatic    #81  <Method StringBuilder _classSignature(Class, StringBuilder, boolean)>
	//    5    9:pop             
		stringbuilder.append('<');
	//    6   10:aload_1         
	//    7   11:bipush          60
	//    8   13:invokevirtual   #57  <Method StringBuilder StringBuilder.append(char)>
	//    9   16:pop             
		stringbuilder = _referencedType.getGenericSignature(stringbuilder);
	//   10   17:aload_0         
	//   11   18:getfield        #24  <Field JavaType _referencedType>
	//   12   21:aload_1         
	//   13   22:invokevirtual   #83  <Method StringBuilder JavaType.getGenericSignature(StringBuilder)>
	//   14   25:astore_1        
		stringbuilder.append(">;");
	//   15   26:aload_1         
	//   16   27:ldc1            #85  <String ">;">
	//   17   29:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   18   32:pop             
		return stringbuilder;
	//   19   33:aload_1         
	//   20   34:areturn         
	}

	public volatile ResolvedType getReferencedType()
	{
		return ((ResolvedType) (getReferencedType()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #89  <Method JavaType getReferencedType()>
	//    2    4:areturn         
	}

	public JavaType getReferencedType()
	{
		return _referencedType;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field JavaType _referencedType>
	//    2    4:areturn         
	}

	public boolean hasContentType()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isReferenceType()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public JavaType refine(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[])
	{
		return ((JavaType) (new ReferenceType(class1, _bindings, javatype, ajavatype, _referencedType, _anchorType, _valueHandler, _typeHandler, _asStatic)));
	//    0    0:new             #2   <Class ReferenceType>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #98  <Field TypeBindings _bindings>
	//    5    9:aload_3         
	//    6   10:aload           4
	//    7   12:aload_0         
	//    8   13:getfield        #24  <Field JavaType _referencedType>
	//    9   16:aload_0         
	//   10   17:getfield        #26  <Field JavaType _anchorType>
	//   11   20:aload_0         
	//   12   21:getfield        #102 <Field Object _valueHandler>
	//   13   24:aload_0         
	//   14   25:getfield        #105 <Field Object _typeHandler>
	//   15   28:aload_0         
	//   16   29:getfield        #109 <Field boolean _asStatic>
	//   17   32:invokespecial   #33  <Method void ReferenceType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   18   35:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(40);
	//    0    0:new             #38  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          40
	//    3    6:invokespecial   #113 <Method void StringBuilder(int)>
	//    4    9:astore_1        
		stringbuilder.append("[reference type, class ");
	//    5   10:aload_1         
	//    6   11:ldc1            #115 <String "[reference type, class ">
	//    7   13:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(buildCanonicalName());
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #117 <Method String buildCanonicalName()>
	//   12   22:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
		stringbuilder.append('<');
	//   14   26:aload_1         
	//   15   27:bipush          60
	//   16   29:invokevirtual   #57  <Method StringBuilder StringBuilder.append(char)>
	//   17   32:pop             
		stringbuilder.append(((Object) (_referencedType)));
	//   18   33:aload_1         
	//   19   34:aload_0         
	//   20   35:getfield        #24  <Field JavaType _referencedType>
	//   21   38:invokevirtual   #120 <Method StringBuilder StringBuilder.append(Object)>
	//   22   41:pop             
		stringbuilder.append('>');
	//   23   42:aload_1         
	//   24   43:bipush          62
	//   25   45:invokevirtual   #57  <Method StringBuilder StringBuilder.append(char)>
	//   26   48:pop             
		stringbuilder.append(']');
	//   27   49:aload_1         
	//   28   50:bipush          93
	//   29   52:invokevirtual   #57  <Method StringBuilder StringBuilder.append(char)>
	//   30   55:pop             
		return stringbuilder.toString();
	//   31   56:aload_1         
	//   32   57:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   33   60:areturn         
	}

	public JavaType withContentType(JavaType javatype)
	{
		if(_referencedType == javatype)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field JavaType _referencedType>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return ((JavaType) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return ((JavaType) (new ReferenceType(_class, _bindings, _superClass, _superInterfaces, javatype, _anchorType, _valueHandler, _typeHandler, _asStatic)));
	//    6   10:new             #2   <Class ReferenceType>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #45  <Field Class _class>
	//   10   18:aload_0         
	//   11   19:getfield        #98  <Field TypeBindings _bindings>
	//   12   22:aload_0         
	//   13   23:getfield        #125 <Field JavaType _superClass>
	//   14   26:aload_0         
	//   15   27:getfield        #129 <Field JavaType[] _superInterfaces>
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:getfield        #26  <Field JavaType _anchorType>
	//   19   35:aload_0         
	//   20   36:getfield        #102 <Field Object _valueHandler>
	//   21   39:aload_0         
	//   22   40:getfield        #105 <Field Object _typeHandler>
	//   23   43:aload_0         
	//   24   44:getfield        #109 <Field boolean _asStatic>
	//   25   47:invokespecial   #33  <Method void ReferenceType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   26   50:areturn         
	}

	public volatile JavaType withContentTypeHandler(Object obj)
	{
		return ((JavaType) (withContentTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #134 <Method ReferenceType withContentTypeHandler(Object)>
	//    3    5:areturn         
	}

	public ReferenceType withContentTypeHandler(Object obj)
	{
		if(obj == _referencedType.getTypeHandler())
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #24  <Field JavaType _referencedType>
	//*   3    5:invokevirtual   #138 <Method Object JavaType.getTypeHandler()>
	//*   4    8:if_acmpne       13
			return this;
	//    5   11:aload_0         
	//    6   12:areturn         
		else
			return new ReferenceType(_class, _bindings, _superClass, _superInterfaces, _referencedType.withTypeHandler(obj), _anchorType, _valueHandler, _typeHandler, _asStatic);
	//    7   13:new             #2   <Class ReferenceType>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #45  <Field Class _class>
	//   11   21:aload_0         
	//   12   22:getfield        #98  <Field TypeBindings _bindings>
	//   13   25:aload_0         
	//   14   26:getfield        #125 <Field JavaType _superClass>
	//   15   29:aload_0         
	//   16   30:getfield        #129 <Field JavaType[] _superInterfaces>
	//   17   33:aload_0         
	//   18   34:getfield        #24  <Field JavaType _referencedType>
	//   19   37:aload_1         
	//   20   38:invokevirtual   #141 <Method JavaType JavaType.withTypeHandler(Object)>
	//   21   41:aload_0         
	//   22   42:getfield        #26  <Field JavaType _anchorType>
	//   23   45:aload_0         
	//   24   46:getfield        #102 <Field Object _valueHandler>
	//   25   49:aload_0         
	//   26   50:getfield        #105 <Field Object _typeHandler>
	//   27   53:aload_0         
	//   28   54:getfield        #109 <Field boolean _asStatic>
	//   29   57:invokespecial   #33  <Method void ReferenceType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   30   60:areturn         
	}

	public volatile JavaType withContentValueHandler(Object obj)
	{
		return ((JavaType) (withContentValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #144 <Method ReferenceType withContentValueHandler(Object)>
	//    3    5:areturn         
	}

	public ReferenceType withContentValueHandler(Object obj)
	{
		if(obj == _referencedType.getValueHandler())
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #24  <Field JavaType _referencedType>
	//*   3    5:invokevirtual   #147 <Method Object JavaType.getValueHandler()>
	//*   4    8:if_acmpne       13
		{
			return this;
	//    5   11:aload_0         
	//    6   12:areturn         
		} else
		{
			obj = ((Object) (_referencedType.withValueHandler(obj)));
	//    7   13:aload_0         
	//    8   14:getfield        #24  <Field JavaType _referencedType>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #150 <Method JavaType JavaType.withValueHandler(Object)>
	//   11   21:astore_1        
			return new ReferenceType(_class, _bindings, _superClass, _superInterfaces, ((JavaType) (obj)), _anchorType, _valueHandler, _typeHandler, _asStatic);
	//   12   22:new             #2   <Class ReferenceType>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:getfield        #45  <Field Class _class>
	//   16   30:aload_0         
	//   17   31:getfield        #98  <Field TypeBindings _bindings>
	//   18   34:aload_0         
	//   19   35:getfield        #125 <Field JavaType _superClass>
	//   20   38:aload_0         
	//   21   39:getfield        #129 <Field JavaType[] _superInterfaces>
	//   22   42:aload_1         
	//   23   43:aload_0         
	//   24   44:getfield        #26  <Field JavaType _anchorType>
	//   25   47:aload_0         
	//   26   48:getfield        #102 <Field Object _valueHandler>
	//   27   51:aload_0         
	//   28   52:getfield        #105 <Field Object _typeHandler>
	//   29   55:aload_0         
	//   30   56:getfield        #109 <Field boolean _asStatic>
	//   31   59:invokespecial   #33  <Method void ReferenceType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   32   62:areturn         
		}
	}

	public volatile SimpleType withContentValueHandler(Object obj)
	{
		return ((SimpleType) (withContentValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #144 <Method ReferenceType withContentValueHandler(Object)>
	//    3    5:areturn         
	}

	public volatile JavaType withStaticTyping()
	{
		return ((JavaType) (withStaticTyping()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #155 <Method ReferenceType withStaticTyping()>
	//    2    4:areturn         
	}

	public ReferenceType withStaticTyping()
	{
		if(_asStatic)
	//*   0    0:aload_0         
	//*   1    1:getfield        #109 <Field boolean _asStatic>
	//*   2    4:ifeq            9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		else
			return new ReferenceType(_class, _bindings, _superClass, _superInterfaces, _referencedType.withStaticTyping(), _anchorType, _valueHandler, _typeHandler, true);
	//    5    9:new             #2   <Class ReferenceType>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #45  <Field Class _class>
	//    9   17:aload_0         
	//   10   18:getfield        #98  <Field TypeBindings _bindings>
	//   11   21:aload_0         
	//   12   22:getfield        #125 <Field JavaType _superClass>
	//   13   25:aload_0         
	//   14   26:getfield        #129 <Field JavaType[] _superInterfaces>
	//   15   29:aload_0         
	//   16   30:getfield        #24  <Field JavaType _referencedType>
	//   17   33:invokevirtual   #157 <Method JavaType JavaType.withStaticTyping()>
	//   18   36:aload_0         
	//   19   37:getfield        #26  <Field JavaType _anchorType>
	//   20   40:aload_0         
	//   21   41:getfield        #102 <Field Object _valueHandler>
	//   22   44:aload_0         
	//   23   45:getfield        #105 <Field Object _typeHandler>
	//   24   48:iconst_1        
	//   25   49:invokespecial   #33  <Method void ReferenceType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   26   52:areturn         
	}

	public volatile SimpleType withStaticTyping()
	{
		return ((SimpleType) (withStaticTyping()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #155 <Method ReferenceType withStaticTyping()>
	//    2    4:areturn         
	}

	public volatile JavaType withTypeHandler(Object obj)
	{
		return ((JavaType) (withTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #160 <Method ReferenceType withTypeHandler(Object)>
	//    3    5:areturn         
	}

	public ReferenceType withTypeHandler(Object obj)
	{
		if(obj == _typeHandler)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #105 <Field Object _typeHandler>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new ReferenceType(_class, _bindings, _superClass, _superInterfaces, _referencedType, _anchorType, _valueHandler, obj, _asStatic);
	//    6   10:new             #2   <Class ReferenceType>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #45  <Field Class _class>
	//   10   18:aload_0         
	//   11   19:getfield        #98  <Field TypeBindings _bindings>
	//   12   22:aload_0         
	//   13   23:getfield        #125 <Field JavaType _superClass>
	//   14   26:aload_0         
	//   15   27:getfield        #129 <Field JavaType[] _superInterfaces>
	//   16   30:aload_0         
	//   17   31:getfield        #24  <Field JavaType _referencedType>
	//   18   34:aload_0         
	//   19   35:getfield        #26  <Field JavaType _anchorType>
	//   20   38:aload_0         
	//   21   39:getfield        #102 <Field Object _valueHandler>
	//   22   42:aload_1         
	//   23   43:aload_0         
	//   24   44:getfield        #109 <Field boolean _asStatic>
	//   25   47:invokespecial   #33  <Method void ReferenceType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   26   50:areturn         
	}

	public volatile SimpleType withTypeHandler(Object obj)
	{
		return ((SimpleType) (withTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #160 <Method ReferenceType withTypeHandler(Object)>
	//    3    5:areturn         
	}

	public volatile JavaType withValueHandler(Object obj)
	{
		return ((JavaType) (withValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #162 <Method ReferenceType withValueHandler(Object)>
	//    3    5:areturn         
	}

	public ReferenceType withValueHandler(Object obj)
	{
		if(obj == _valueHandler)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #102 <Field Object _valueHandler>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new ReferenceType(_class, _bindings, _superClass, _superInterfaces, _referencedType, _anchorType, obj, _typeHandler, _asStatic);
	//    6   10:new             #2   <Class ReferenceType>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #45  <Field Class _class>
	//   10   18:aload_0         
	//   11   19:getfield        #98  <Field TypeBindings _bindings>
	//   12   22:aload_0         
	//   13   23:getfield        #125 <Field JavaType _superClass>
	//   14   26:aload_0         
	//   15   27:getfield        #129 <Field JavaType[] _superInterfaces>
	//   16   30:aload_0         
	//   17   31:getfield        #24  <Field JavaType _referencedType>
	//   18   34:aload_0         
	//   19   35:getfield        #26  <Field JavaType _anchorType>
	//   20   38:aload_1         
	//   21   39:aload_0         
	//   22   40:getfield        #105 <Field Object _typeHandler>
	//   23   43:aload_0         
	//   24   44:getfield        #109 <Field boolean _asStatic>
	//   25   47:invokespecial   #33  <Method void ReferenceType(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType, Object, Object, boolean)>
	//   26   50:areturn         
	}

	public volatile SimpleType withValueHandler(Object obj)
	{
		return ((SimpleType) (withValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #162 <Method ReferenceType withValueHandler(Object)>
	//    3    5:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final JavaType _anchorType;
	protected final JavaType _referencedType;
}
