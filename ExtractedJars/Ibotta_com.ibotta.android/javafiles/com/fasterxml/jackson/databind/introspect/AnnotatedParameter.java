// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			AnnotatedMember, AnnotatedWithParams, TypeResolutionContext, AnnotationMap, 
//			Annotated

public final class AnnotatedParameter extends AnnotatedMember
{

	public AnnotatedParameter(AnnotatedWithParams annotatedwithparams, JavaType javatype, TypeResolutionContext typeresolutioncontext, AnnotationMap annotationmap, int i)
	{
		super(typeresolutioncontext, annotationmap);
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:aload           4
	//    3    4:invokespecial   #19  <Method void AnnotatedMember(TypeResolutionContext, AnnotationMap)>
		_owner = annotatedwithparams;
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:putfield        #21  <Field AnnotatedWithParams _owner>
		_type = javatype;
	//    7   12:aload_0         
	//    8   13:aload_2         
	//    9   14:putfield        #23  <Field JavaType _type>
		_index = i;
	//   10   17:aload_0         
	//   11   18:iload           5
	//   12   20:putfield        #25  <Field int _index>
	//   13   23:return          
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
		if(!ClassUtil.hasClass(obj, ((Object)this).getClass()))
	//*   5    7:aload_1         
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #34  <Method Class Object.getClass()>
	//*   8   12:invokestatic    #40  <Method boolean ClassUtil.hasClass(Object, Class)>
	//*   9   15:ifne            20
			return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
		obj = ((Object) ((AnnotatedParameter)obj));
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class AnnotatedParameter>
	//   14   24:astore_1        
		return ((AnnotatedParameter) (obj))._owner.equals(((Object) (_owner))) && ((AnnotatedParameter) (obj))._index == _index;
	//   15   25:aload_1         
	//   16   26:getfield        #21  <Field AnnotatedWithParams _owner>
	//   17   29:aload_0         
	//   18   30:getfield        #21  <Field AnnotatedWithParams _owner>
	//   19   33:invokevirtual   #44  <Method boolean AnnotatedWithParams.equals(Object)>
	//   20   36:ifeq            52
	//   21   39:aload_1         
	//   22   40:getfield        #25  <Field int _index>
	//   23   43:aload_0         
	//   24   44:getfield        #25  <Field int _index>
	//   25   47:icmpne          52
	//   26   50:iconst_1        
	//   27   51:ireturn         
	//   28   52:iconst_0        
	//   29   53:ireturn         
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
	//    2    4:invokevirtual   #49  <Method Class AnnotatedWithParams.getDeclaringClass()>
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
	//    2    4:invokevirtual   #57  <Method Member AnnotatedWithParams.getMember()>
	//    3    7:areturn         
	}

	public String getName()
	{
		return "";
	//    0    0:ldc1            #61  <String "">
	//    1    2:areturn         
	}

	public AnnotatedWithParams getOwner()
	{
		return _owner;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AnnotatedWithParams _owner>
	//    2    4:areturn         
	}

	public Class getRawType()
	{
		return _type.getRawClass();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field JavaType _type>
	//    2    4:invokevirtual   #69  <Method Class JavaType.getRawClass()>
	//    3    7:areturn         
	}

	public JavaType getType()
	{
		return _type;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field JavaType _type>
	//    2    4:areturn         
	}

	public Object getValue(Object obj)
		throws UnsupportedOperationException
	{
		obj = ((Object) (new StringBuilder()));
	//    0    0:new             #77  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #80  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (obj)).append("Cannot call getValue() on constructor parameter of ");
	//    4    8:aload_1         
	//    5    9:ldc1            #82  <String "Cannot call getValue() on constructor parameter of ">
	//    6   11:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (obj)).append(getDeclaringClass().getName());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #87  <Method Class getDeclaringClass()>
	//   11   20:invokevirtual   #91  <Method String Class.getName()>
	//   12   23:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		throw new UnsupportedOperationException(((StringBuilder) (obj)).toString());
	//   14   27:new             #75  <Class UnsupportedOperationException>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   18   35:invokespecial   #97  <Method void UnsupportedOperationException(String)>
	//   19   38:athrow          
	}

	public int hashCode()
	{
		return _owner.hashCode() + _index;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AnnotatedWithParams _owner>
	//    2    4:invokevirtual   #101 <Method int AnnotatedWithParams.hashCode()>
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field int _index>
	//    5   11:iadd            
	//    6   12:ireturn         
	}

	public void setValue(Object obj, Object obj1)
		throws UnsupportedOperationException
	{
		obj = ((Object) (new StringBuilder()));
	//    0    0:new             #77  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #80  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (obj)).append("Cannot call setValue() on constructor parameter of ");
	//    4    8:aload_1         
	//    5    9:ldc1            #105 <String "Cannot call setValue() on constructor parameter of ">
	//    6   11:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (obj)).append(getDeclaringClass().getName());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #87  <Method Class getDeclaringClass()>
	//   11   20:invokevirtual   #91  <Method String Class.getName()>
	//   12   23:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		throw new UnsupportedOperationException(((StringBuilder) (obj)).toString());
	//   14   27:new             #75  <Class UnsupportedOperationException>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   18   35:invokespecial   #97  <Method void UnsupportedOperationException(String)>
	//   19   38:athrow          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #77  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #80  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("[parameter #");
	//    4    8:aload_1         
	//    5    9:ldc1            #107 <String "[parameter #">
	//    6   11:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(getIndex());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #109 <Method int getIndex()>
	//   11   20:invokevirtual   #112 <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		stringbuilder.append(", annotations: ");
	//   13   24:aload_1         
	//   14   25:ldc1            #114 <String ", annotations: ">
	//   15   27:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(((Object) (_annotations)));
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #118 <Field AnnotationMap _annotations>
	//   20   36:invokevirtual   #121 <Method StringBuilder StringBuilder.append(Object)>
	//   21   39:pop             
		stringbuilder.append("]");
	//   22   40:aload_1         
	//   23   41:ldc1            #123 <String "]">
	//   24   43:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		return stringbuilder.toString();
	//   26   47:aload_1         
	//   27   48:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   28   51:areturn         
	}

	public volatile Annotated withAnnotations(AnnotationMap annotationmap)
	{
		return ((Annotated) (withAnnotations(annotationmap)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #128 <Method AnnotatedParameter withAnnotations(AnnotationMap)>
	//    3    5:areturn         
	}

	public AnnotatedParameter withAnnotations(AnnotationMap annotationmap)
	{
		if(annotationmap == _annotations)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #118 <Field AnnotationMap _annotations>
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
	//   11   19:invokevirtual   #132 <Method AnnotatedParameter AnnotatedWithParams.replaceParameterAnnotations(int, AnnotationMap)>
	//   12   22:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final int _index;
	protected final AnnotatedWithParams _owner;
	protected final JavaType _type;
}
