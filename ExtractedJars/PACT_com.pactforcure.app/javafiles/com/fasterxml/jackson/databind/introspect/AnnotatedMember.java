// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.util.Collections;

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

	public final boolean addIfNotPresent(Annotation annotation)
	{
		return _annotations.addIfNotPresent(annotation);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AnnotationMap _annotations>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #31  <Method boolean AnnotationMap.addIfNotPresent(Annotation)>
	//    4    8:ireturn         
	}

	public final boolean addOrOverride(Annotation annotation)
	{
		return _annotations.add(annotation);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AnnotationMap _annotations>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #35  <Method boolean AnnotationMap.add(Annotation)>
	//    4    8:ireturn         
	}

	public Iterable annotations()
	{
		if(_annotations == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field AnnotationMap _annotations>
	//*   2    4:ifnonnull       11
			return ((Iterable) (Collections.emptyList()));
	//    3    7:invokestatic    #43  <Method java.util.List Collections.emptyList()>
	//    4   10:areturn         
		else
			return _annotations.annotations();
	//    5   11:aload_0         
	//    6   12:getfield        #23  <Field AnnotationMap _annotations>
	//    7   15:invokevirtual   #45  <Method Iterable AnnotationMap.annotations()>
	//    8   18:areturn         
	}

	public final void fixAccess()
	{
		fixAccess(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #52  <Method void fixAccess(boolean)>
	//    3    5:return          
	}

	public final void fixAccess(boolean flag)
	{
		ClassUtil.checkAndFixAccess(getMember(), flag);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #57  <Method Member getMember()>
	//    2    4:iload_1         
	//    3    5:invokestatic    #63  <Method void ClassUtil.checkAndFixAccess(Member, boolean)>
	//    4    8:return          
	}

	protected AnnotationMap getAllAnnotations()
	{
		return _annotations;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AnnotationMap _annotations>
	//    2    4:areturn         
	}

	public final Annotation getAnnotation(Class class1)
	{
		if(_annotations == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field AnnotationMap _annotations>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return _annotations.get(class1);
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field AnnotationMap _annotations>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #70  <Method Annotation AnnotationMap.get(Class)>
	//    9   17:areturn         
	}

	public abstract Class getDeclaringClass();

	public abstract Member getMember();

	public TypeResolutionContext getTypeContext()
	{
		return _typeContext;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field TypeResolutionContext _typeContext>
	//    2    4:areturn         
	}

	public abstract Object getValue(Object obj)
		throws UnsupportedOperationException, IllegalArgumentException;

	public final boolean hasAnnotation(Class class1)
	{
		if(_annotations == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field AnnotationMap _annotations>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return _annotations.has(class1);
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field AnnotationMap _annotations>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #86  <Method boolean AnnotationMap.has(Class)>
	//    9   17:ireturn         
	}

	public boolean hasOneOf(Class aclass[])
	{
		if(_annotations == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field AnnotationMap _annotations>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return _annotations.hasOneOf(aclass);
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field AnnotationMap _annotations>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #91  <Method boolean AnnotationMap.hasOneOf(Class[])>
	//    9   17:ireturn         
	}

	public abstract void setValue(Object obj, Object obj1)
		throws UnsupportedOperationException, IllegalArgumentException;

	private static final long serialVersionUID = 1L;
	protected final transient AnnotationMap _annotations;
	protected final transient TypeResolutionContext _typeContext;
}
