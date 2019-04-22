// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			Annotated, AnnotationMap, TypeResolutionContext

public abstract class AnnotatedMember extends Annotated
	implements Serializable
{

	protected AnnotatedMember(AnnotatedMember annotatedmember)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Annotated()>
		_typeContext = annotatedmember._typeContext;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #21  <Field TypeResolutionContext _typeContext>
	//    5    9:putfield        #21  <Field TypeResolutionContext _typeContext>
		_annotations = annotatedmember._annotations;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #23  <Field AnnotationMap _annotations>
	//    9   17:putfield        #23  <Field AnnotationMap _annotations>
	//   10   20:return          
	}

	protected AnnotatedMember(TypeResolutionContext typeresolutioncontext, AnnotationMap annotationmap)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Annotated()>
		_typeContext = typeresolutioncontext;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field TypeResolutionContext _typeContext>
		_annotations = annotationmap;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field AnnotationMap _annotations>
	//    8   14:return          
	}

	public final void fixAccess(boolean flag)
	{
		Member member = getMember();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method Member getMember()>
	//    2    4:astore_2        
		if(member != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			ClassUtil.checkAndFixAccess(member, flag);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokestatic    #37  <Method void ClassUtil.checkAndFixAccess(Member, boolean)>
	//    8   14:return          
	}

	public AnnotationMap getAllAnnotations()
	{
		return _annotations;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AnnotationMap _annotations>
	//    2    4:areturn         
	}

	public final Annotation getAnnotation(Class class1)
	{
		AnnotationMap annotationmap = _annotations;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AnnotationMap _annotations>
	//    2    4:astore_2        
		if(annotationmap == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return annotationmap.get(class1);
	//    7   11:aload_2         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #46  <Method Annotation AnnotationMap.get(Class)>
	//   10   16:areturn         
	}

	public abstract Class getDeclaringClass();

	public String getFullName()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #54  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(getDeclaringClass().getName());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #57  <Method Class getDeclaringClass()>
	//    7   13:invokevirtual   #62  <Method String Class.getName()>
	//    8   16:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append("#");
	//   10   20:aload_1         
	//   11   21:ldc1            #68  <String "#">
	//   12   23:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(getName());
	//   14   27:aload_1         
	//   15   28:aload_0         
	//   16   29:invokevirtual   #69  <Method String getName()>
	//   17   32:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
		return stringbuilder.toString();
	//   19   36:aload_1         
	//   20   37:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   21   40:areturn         
	}

	public abstract Member getMember();

	public abstract Object getValue(Object obj)
		throws UnsupportedOperationException, IllegalArgumentException;

	public final boolean hasAnnotation(Class class1)
	{
		AnnotationMap annotationmap = _annotations;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AnnotationMap _annotations>
	//    2    4:astore_2        
		if(annotationmap == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return annotationmap.has(class1);
	//    7   11:aload_2         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #83  <Method boolean AnnotationMap.has(Class)>
	//   10   16:ireturn         
	}

	public boolean hasOneOf(Class aclass[])
	{
		AnnotationMap annotationmap = _annotations;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AnnotationMap _annotations>
	//    2    4:astore_2        
		if(annotationmap == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return annotationmap.hasOneOf(aclass);
	//    7   11:aload_2         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #88  <Method boolean AnnotationMap.hasOneOf(Class[])>
	//   10   16:ireturn         
	}

	public abstract void setValue(Object obj, Object obj1)
		throws UnsupportedOperationException, IllegalArgumentException;

	public abstract Annotated withAnnotations(AnnotationMap annotationmap);

	private static final long serialVersionUID = 1L;
	protected final transient AnnotationMap _annotations;
	protected final transient TypeResolutionContext _typeContext;
}
