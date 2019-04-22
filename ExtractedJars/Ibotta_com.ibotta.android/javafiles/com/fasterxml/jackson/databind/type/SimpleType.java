// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//			TypeBase, TypeBindings

public class SimpleType extends TypeBase
{

	protected SimpleType(Class class1)
	{
		this(class1, TypeBindings.emptyBindings(), ((JavaType) (null)), ((JavaType []) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #16  <Method TypeBindings TypeBindings.emptyBindings()>
	//    3    5:aconst_null     
	//    4    6:aconst_null     
	//    5    7:invokespecial   #19  <Method void SimpleType(Class, TypeBindings, JavaType, JavaType[])>
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
	//    8    9:invokespecial   #25  <Method void SimpleType(Class, TypeBindings, JavaType, JavaType[], Object, Object, boolean)>
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
	//    9   14:invokespecial   #29  <Method void TypeBase(Class, TypeBindings, JavaType, JavaType[], int, Object, Object, boolean)>
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
	//    9   13:invokespecial   #29  <Method void TypeBase(Class, TypeBindings, JavaType, JavaType[], int, Object, Object, boolean)>
	//   10   16:return          
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
	//    9   11:invokespecial   #25  <Method void SimpleType(Class, TypeBindings, JavaType, JavaType[], Object, Object, boolean)>
	//   10   14:areturn         
	}

	protected String buildCanonicalName()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #38  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append(_class.getName());
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:getfield        #45  <Field Class _class>
	//    7   13:invokevirtual   #50  <Method String Class.getName()>
	//    8   16:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		int j = _bindings.size();
	//   10   20:aload_0         
	//   11   21:getfield        #58  <Field TypeBindings _bindings>
	//   12   24:invokevirtual   #62  <Method int TypeBindings.size()>
	//   13   27:istore_2        
		if(j > 0)
	//*  14   28:iload_2         
	//*  15   29:ifle            88
		{
			stringbuilder.append('<');
	//   16   32:aload_3         
	//   17   33:bipush          60
	//   18   35:invokevirtual   #65  <Method StringBuilder StringBuilder.append(char)>
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
	//   27   48:invokevirtual   #69  <Method JavaType containedType(int)>
	//   28   51:astore          4
				if(i > 0)
	//*  29   53:iload_1         
	//*  30   54:ifle            64
					stringbuilder.append(',');
	//   31   57:aload_3         
	//   32   58:bipush          44
	//   33   60:invokevirtual   #65  <Method StringBuilder StringBuilder.append(char)>
	//   34   63:pop             
				stringbuilder.append(javatype.toCanonical());
	//   35   64:aload_3         
	//   36   65:aload           4
	//   37   67:invokevirtual   #74  <Method String JavaType.toCanonical()>
	//   38   70:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
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
	//   47   84:invokevirtual   #65  <Method StringBuilder StringBuilder.append(char)>
	//   48   87:pop             
		}
		return stringbuilder.toString();
	//   49   88:aload_3         
	//   50   89:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   51   92:areturn         
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
	//*  10   14:invokevirtual   #85  <Method Class Object.getClass()>
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #85  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		obj = ((Object) ((SimpleType)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class SimpleType>
	//   18   30:astore_1        
		if(((SimpleType) (obj))._class != _class)
	//*  19   31:aload_1         
	//*  20   32:getfield        #45  <Field Class _class>
	//*  21   35:aload_0         
	//*  22   36:getfield        #45  <Field Class _class>
	//*  23   39:if_acmpeq       44
			return false;
	//   24   42:iconst_0        
	//   25   43:ireturn         
		else
			return _bindings.equals(((Object) (((SimpleType) (obj))._bindings)));
	//   26   44:aload_0         
	//   27   45:getfield        #58  <Field TypeBindings _bindings>
	//   28   48:aload_1         
	//   29   49:getfield        #58  <Field TypeBindings _bindings>
	//   30   52:invokevirtual   #87  <Method boolean TypeBindings.equals(Object)>
	//   31   55:ireturn         
	}

	public StringBuilder getGenericSignature(StringBuilder stringbuilder)
	{
		Object obj = ((Object) (_class));
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Class _class>
	//    2    4:astore          4
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_2        
		_classSignature(((Class) (obj)), stringbuilder, false);
	//    5    8:aload           4
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:invokestatic    #93  <Method StringBuilder _classSignature(Class, StringBuilder, boolean)>
	//    9   15:pop             
		int j = _bindings.size();
	//   10   16:aload_0         
	//   11   17:getfield        #58  <Field TypeBindings _bindings>
	//   12   20:invokevirtual   #62  <Method int TypeBindings.size()>
	//   13   23:istore_3        
		obj = ((Object) (stringbuilder));
	//   14   24:aload_1         
	//   15   25:astore          4
		if(j > 0)
	//*  16   27:iload_3         
	//*  17   28:ifle            70
		{
			stringbuilder.append('<');
	//   18   31:aload_1         
	//   19   32:bipush          60
	//   20   34:invokevirtual   #65  <Method StringBuilder StringBuilder.append(char)>
	//   21   37:pop             
			for(; i < j; i++)
	//*  22   38:iload_2         
	//*  23   39:iload_3         
	//*  24   40:icmpge          60
				stringbuilder = containedType(i).getGenericSignature(stringbuilder);
	//   25   43:aload_0         
	//   26   44:iload_2         
	//   27   45:invokevirtual   #69  <Method JavaType containedType(int)>
	//   28   48:aload_1         
	//   29   49:invokevirtual   #95  <Method StringBuilder JavaType.getGenericSignature(StringBuilder)>
	//   30   52:astore_1        

	//   31   53:iload_2         
	//   32   54:iconst_1        
	//   33   55:iadd            
	//   34   56:istore_2        
	//*  35   57:goto            38
			stringbuilder.append('>');
	//   36   60:aload_1         
	//   37   61:bipush          62
	//   38   63:invokevirtual   #65  <Method StringBuilder StringBuilder.append(char)>
	//   39   66:pop             
			obj = ((Object) (stringbuilder));
	//   40   67:aload_1         
	//   41   68:astore          4
		}
		((StringBuilder) (obj)).append(';');
	//   42   70:aload           4
	//   43   72:bipush          59
	//   44   74:invokevirtual   #65  <Method StringBuilder StringBuilder.append(char)>
	//   45   77:pop             
		return ((StringBuilder) (obj));
	//   46   78:aload           4
	//   47   80:areturn         
	}

	public boolean hasContentType()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
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
	//    0    0:new             #38  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          40
	//    3    6:invokespecial   #104 <Method void StringBuilder(int)>
	//    4    9:astore_1        
		stringbuilder.append("[simple type, class ");
	//    5   10:aload_1         
	//    6   11:ldc1            #106 <String "[simple type, class ">
	//    7   13:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(buildCanonicalName());
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #108 <Method String buildCanonicalName()>
	//   12   22:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
		stringbuilder.append(']');
	//   14   26:aload_1         
	//   15   27:bipush          93
	//   16   29:invokevirtual   #65  <Method StringBuilder StringBuilder.append(char)>
	//   17   32:pop             
		return stringbuilder.toString();
	//   18   33:aload_1         
	//   19   34:invokevirtual   #77  <Method String StringBuilder.toString()>
	//   20   37:areturn         
	}

	public JavaType withContentType(JavaType javatype)
	{
		throw new IllegalArgumentException("Simple types have no content types; cannot call withContentType()");
	//    0    0:new             #112 <Class IllegalArgumentException>
	//    1    3:dup             
	//    2    4:ldc1            #114 <String "Simple types have no content types; cannot call withContentType()">
	//    3    6:invokespecial   #117 <Method void IllegalArgumentException(String)>
	//    4    9:athrow          
	}

	public JavaType withContentTypeHandler(Object obj)
	{
		throw new IllegalArgumentException("Simple types have no content types; cannot call withContenTypeHandler()");
	//    0    0:new             #112 <Class IllegalArgumentException>
	//    1    3:dup             
	//    2    4:ldc1            #121 <String "Simple types have no content types; cannot call withContenTypeHandler()">
	//    3    6:invokespecial   #117 <Method void IllegalArgumentException(String)>
	//    4    9:athrow          
	}

	public volatile JavaType withContentValueHandler(Object obj)
	{
		return ((JavaType) (withContentValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #125 <Method SimpleType withContentValueHandler(Object)>
	//    3    5:areturn         
	}

	public SimpleType withContentValueHandler(Object obj)
	{
		throw new IllegalArgumentException("Simple types have no content types; cannot call withContenValueHandler()");
	//    0    0:new             #112 <Class IllegalArgumentException>
	//    1    3:dup             
	//    2    4:ldc1            #127 <String "Simple types have no content types; cannot call withContenValueHandler()">
	//    3    6:invokespecial   #117 <Method void IllegalArgumentException(String)>
	//    4    9:athrow          
	}

	public volatile JavaType withStaticTyping()
	{
		return ((JavaType) (withStaticTyping()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #132 <Method SimpleType withStaticTyping()>
	//    2    4:areturn         
	}

	public SimpleType withStaticTyping()
	{
		if(_asStatic)
	//*   0    0:aload_0         
	//*   1    1:getfield        #136 <Field boolean _asStatic>
	//*   2    4:ifeq            9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		else
			return new SimpleType(_class, _bindings, _superClass, _superInterfaces, _valueHandler, _typeHandler, true);
	//    5    9:new             #2   <Class SimpleType>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #45  <Field Class _class>
	//    9   17:aload_0         
	//   10   18:getfield        #58  <Field TypeBindings _bindings>
	//   11   21:aload_0         
	//   12   22:getfield        #140 <Field JavaType _superClass>
	//   13   25:aload_0         
	//   14   26:getfield        #144 <Field JavaType[] _superInterfaces>
	//   15   29:aload_0         
	//   16   30:getfield        #148 <Field Object _valueHandler>
	//   17   33:aload_0         
	//   18   34:getfield        #151 <Field Object _typeHandler>
	//   19   37:iconst_1        
	//   20   38:invokespecial   #25  <Method void SimpleType(Class, TypeBindings, JavaType, JavaType[], Object, Object, boolean)>
	//   21   41:areturn         
	}

	public volatile JavaType withTypeHandler(Object obj)
	{
		return ((JavaType) (withTypeHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #154 <Method SimpleType withTypeHandler(Object)>
	//    3    5:areturn         
	}

	public SimpleType withTypeHandler(Object obj)
	{
		if(_typeHandler == obj)
	//*   0    0:aload_0         
	//*   1    1:getfield        #151 <Field Object _typeHandler>
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
	//    9   15:getfield        #45  <Field Class _class>
	//   10   18:aload_0         
	//   11   19:getfield        #58  <Field TypeBindings _bindings>
	//   12   22:aload_0         
	//   13   23:getfield        #140 <Field JavaType _superClass>
	//   14   26:aload_0         
	//   15   27:getfield        #144 <Field JavaType[] _superInterfaces>
	//   16   30:aload_0         
	//   17   31:getfield        #148 <Field Object _valueHandler>
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #136 <Field boolean _asStatic>
	//   21   39:invokespecial   #25  <Method void SimpleType(Class, TypeBindings, JavaType, JavaType[], Object, Object, boolean)>
	//   22   42:areturn         
	}

	public volatile JavaType withValueHandler(Object obj)
	{
		return ((JavaType) (withValueHandler(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #157 <Method SimpleType withValueHandler(Object)>
	//    3    5:areturn         
	}

	public SimpleType withValueHandler(Object obj)
	{
		if(obj == _valueHandler)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #148 <Field Object _valueHandler>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new SimpleType(_class, _bindings, _superClass, _superInterfaces, obj, _typeHandler, _asStatic);
	//    6   10:new             #2   <Class SimpleType>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #45  <Field Class _class>
	//   10   18:aload_0         
	//   11   19:getfield        #58  <Field TypeBindings _bindings>
	//   12   22:aload_0         
	//   13   23:getfield        #140 <Field JavaType _superClass>
	//   14   26:aload_0         
	//   15   27:getfield        #144 <Field JavaType[] _superInterfaces>
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:getfield        #151 <Field Object _typeHandler>
	//   19   35:aload_0         
	//   20   36:getfield        #136 <Field boolean _asStatic>
	//   21   39:invokespecial   #25  <Method void SimpleType(Class, TypeBindings, JavaType, JavaType[], Object, Object, boolean)>
	//   22   42:areturn         
	}

	private static final long serialVersionUID = 1L;
}
