// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.*;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			AnnotatedMember, AnnotatedWithParams, TypeResolutionContext, AnnotationMap, 
//			Annotated

public final class AnnotatedParameter extends AnnotatedMember
{

	public AnnotatedParameter(AnnotatedWithParams annotatedwithparams, JavaType javatype, AnnotationMap annotationmap, int i)
	{
		TypeResolutionContext typeresolutioncontext;
		if(annotatedwithparams == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       31
			typeresolutioncontext = null;
	//    2    4:aconst_null     
	//    3    5:astore          5
		else
	//*   4    7:aload_0         
	//*   5    8:aload           5
	//*   6   10:aload_3         
	//*   7   11:invokespecial   #19  <Method void AnnotatedMember(TypeResolutionContext, AnnotationMap)>
	//*   8   14:aload_0         
	//*   9   15:aload_1         
	//*  10   16:putfield        #21  <Field AnnotatedWithParams _owner>
	//*  11   19:aload_0         
	//*  12   20:aload_2         
	//*  13   21:putfield        #23  <Field JavaType _type>
	//*  14   24:aload_0         
	//*  15   25:iload           4
	//*  16   27:putfield        #25  <Field int _index>
	//*  17   30:return          
			typeresolutioncontext = annotatedwithparams.getTypeContext();
	//   18   31:aload_1         
	//   19   32:invokevirtual   #31  <Method TypeResolutionContext AnnotatedWithParams.getTypeContext()>
	//   20   35:astore          5
		super(typeresolutioncontext, annotationmap);
		_owner = annotatedwithparams;
		_type = javatype;
		_index = i;
	//*  21   37:goto            7
	}

	public boolean equals(Object obj)
	{
		if(obj != this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
			if(obj == null || obj.getClass() != ((Object)this).getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          22
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #40  <Method Class Object.getClass()>
	//*   9   15:aload_0         
	//*  10   16:invokevirtual   #40  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((AnnotatedParameter)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class AnnotatedParameter>
	//   16   28:astore_1        
			if(!((AnnotatedParameter) (obj))._owner.equals(((Object) (_owner))) || ((AnnotatedParameter) (obj))._index != _index)
	//*  17   29:aload_1         
	//*  18   30:getfield        #21  <Field AnnotatedWithParams _owner>
	//*  19   33:aload_0         
	//*  20   34:getfield        #21  <Field AnnotatedWithParams _owner>
	//*  21   37:invokevirtual   #42  <Method boolean AnnotatedWithParams.equals(Object)>
	//*  22   40:ifeq            54
	//*  23   43:aload_1         
	//*  24   44:getfield        #25  <Field int _index>
	//*  25   47:aload_0         
	//*  26   48:getfield        #25  <Field int _index>
	//*  27   51:icmpeq          5
				return false;
	//   28   54:iconst_0        
	//   29   55:ireturn         
		}
		return true;
	}

	public AnnotatedElement getAnnotated()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Class getDeclaringClass()
	{
		return _owner.getDeclaringClass();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AnnotatedWithParams _owner>
	//    2    4:invokevirtual   #47  <Method Class AnnotatedWithParams.getDeclaringClass()>
	//    3    7:areturn         
	}

	public int getIndex()
	{
		return _index;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int _index>
	//    2    4:ireturn         
	}

	public Member getMember()
	{
		return _owner.getMember();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AnnotatedWithParams _owner>
	//    2    4:invokevirtual   #55  <Method Member AnnotatedWithParams.getMember()>
	//    3    7:areturn         
	}

	public int getModifiers()
	{
		return _owner.getModifiers();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AnnotatedWithParams _owner>
	//    2    4:invokevirtual   #58  <Method int AnnotatedWithParams.getModifiers()>
	//    3    7:ireturn         
	}

	public String getName()
	{
		return "";
	//    0    0:ldc1            #62  <String "">
	//    1    2:areturn         
	}

	public AnnotatedWithParams getOwner()
	{
		return _owner;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AnnotatedWithParams _owner>
	//    2    4:areturn         
	}

	public Type getParameterType()
	{
		return ((Type) (_type));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field JavaType _type>
	//    2    4:areturn         
	}

	public Class getRawType()
	{
		return _type.getRawClass();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field JavaType _type>
	//    2    4:invokevirtual   #72  <Method Class JavaType.getRawClass()>
	//    3    7:areturn         
	}

	public JavaType getType()
	{
		return _typeContext.resolveType(((Type) (_type)));
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field TypeResolutionContext _typeContext>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field JavaType _type>
	//    4    8:invokeinterface #84  <Method JavaType TypeResolutionContext.resolveType(Type)>
	//    5   13:areturn         
	}

	public Object getValue(Object obj)
		throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException((new StringBuilder()).append("Cannot call getValue() on constructor parameter of ").append(getDeclaringClass().getName()).toString());
	//    0    0:new             #88  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:new             #90  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #93  <Method void StringBuilder()>
	//    5   11:ldc1            #95  <String "Cannot call getValue() on constructor parameter of ">
	//    6   13:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_0         
	//    8   17:invokevirtual   #100 <Method Class getDeclaringClass()>
	//    9   20:invokevirtual   #104 <Method String Class.getName()>
	//   10   23:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   11   26:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   12   29:invokespecial   #110 <Method void UnsupportedOperationException(String)>
	//   13   32:athrow          
	}

	public int hashCode()
	{
		return _owner.hashCode() + _index;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AnnotatedWithParams _owner>
	//    2    4:invokevirtual   #114 <Method int AnnotatedWithParams.hashCode()>
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field int _index>
	//    5   11:iadd            
	//    6   12:ireturn         
	}

	public void setValue(Object obj, Object obj1)
		throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException((new StringBuilder()).append("Cannot call setValue() on constructor parameter of ").append(getDeclaringClass().getName()).toString());
	//    0    0:new             #88  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:new             #90  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #93  <Method void StringBuilder()>
	//    5   11:ldc1            #118 <String "Cannot call setValue() on constructor parameter of ">
	//    6   13:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_0         
	//    8   17:invokevirtual   #100 <Method Class getDeclaringClass()>
	//    9   20:invokevirtual   #104 <Method String Class.getName()>
	//   10   23:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   11   26:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   12   29:invokespecial   #110 <Method void UnsupportedOperationException(String)>
	//   13   32:athrow          
	}

	public String toString()
	{
		return (new StringBuilder()).append("[parameter #").append(getIndex()).append(", annotations: ").append(((Object) (_annotations))).append("]").toString();
	//    0    0:new             #90  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:ldc1            #120 <String "[parameter #">
	//    4    9:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #122 <Method int getIndex()>
	//    7   16:invokevirtual   #125 <Method StringBuilder StringBuilder.append(int)>
	//    8   19:ldc1            #127 <String ", annotations: ">
	//    9   21:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #131 <Field AnnotationMap _annotations>
	//   12   28:invokevirtual   #134 <Method StringBuilder StringBuilder.append(Object)>
	//   13   31:ldc1            #136 <String "]">
	//   14   33:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   16   39:areturn         
	}

	public volatile Annotated withAnnotations(AnnotationMap annotationmap)
	{
		return ((Annotated) (withAnnotations(annotationmap)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #141 <Method AnnotatedParameter withAnnotations(AnnotationMap)>
	//    3    5:areturn         
	}

	public AnnotatedParameter withAnnotations(AnnotationMap annotationmap)
	{
		if(annotationmap == _annotations)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #131 <Field AnnotationMap _annotations>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return _owner.replaceParameterAnnotations(_index, annotationmap);
	//    6   10:aload_0         
	//    7   11:getfield        #21  <Field AnnotatedWithParams _owner>
	//    8   14:aload_0         
	//    9   15:getfield        #25  <Field int _index>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #145 <Method AnnotatedParameter AnnotatedWithParams.replaceParameterAnnotations(int, AnnotationMap)>
	//   12   22:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final int _index;
	protected final AnnotatedWithParams _owner;
	protected final JavaType _type;
}
