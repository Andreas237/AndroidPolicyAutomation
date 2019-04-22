// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			AnnotatedMember, AnnotatedParameter, AnnotationMap, TypeResolutionContext

public abstract class AnnotatedWithParams extends AnnotatedMember
{

	protected AnnotatedWithParams(AnnotatedWithParams annotatedwithparams, AnnotationMap aannotationmap[])
	{
		super(((AnnotatedMember) (annotatedwithparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void AnnotatedMember(AnnotatedMember)>
		_paramAnnotations = aannotationmap;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #17  <Field AnnotationMap[] _paramAnnotations>
	//    6   10:return          
	}

	protected AnnotatedWithParams(TypeResolutionContext typeresolutioncontext, AnnotationMap annotationmap, AnnotationMap aannotationmap[])
	{
		super(typeresolutioncontext, annotationmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #22  <Method void AnnotatedMember(TypeResolutionContext, AnnotationMap)>
		_paramAnnotations = aannotationmap;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #17  <Field AnnotationMap[] _paramAnnotations>
	//    7   11:return          
	}

	public abstract Object call()
		throws Exception;

	public abstract Object call(Object aobj[])
		throws Exception;

	public abstract Object call1(Object obj)
		throws Exception;

	public final AnnotatedParameter getParameter(int i)
	{
		return new AnnotatedParameter(this, getParameterType(i), _typeContext, getParameterAnnotations(i), i);
	//    0    0:new             #33  <Class AnnotatedParameter>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokevirtual   #37  <Method JavaType getParameterType(int)>
	//    6   10:aload_0         
	//    7   11:getfield        #41  <Field TypeResolutionContext _typeContext>
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:invokevirtual   #45  <Method AnnotationMap getParameterAnnotations(int)>
	//   11   19:iload_1         
	//   12   20:invokespecial   #48  <Method void AnnotatedParameter(AnnotatedWithParams, JavaType, TypeResolutionContext, AnnotationMap, int)>
	//   13   23:areturn         
	}

	public final AnnotationMap getParameterAnnotations(int i)
	{
		AnnotationMap aannotationmap[] = _paramAnnotations;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field AnnotationMap[] _paramAnnotations>
	//    2    4:astore_2        
		if(aannotationmap != null && i >= 0 && i < aannotationmap.length)
	//*   3    5:aload_2         
	//*   4    6:ifnull          23
	//*   5    9:iload_1         
	//*   6   10:iflt            23
	//*   7   13:iload_1         
	//*   8   14:aload_2         
	//*   9   15:arraylength     
	//*  10   16:icmpge          23
			return aannotationmap[i];
	//   11   19:aload_2         
	//   12   20:iload_1         
	//   13   21:aaload          
	//   14   22:areturn         
		else
			return null;
	//   15   23:aconst_null     
	//   16   24:areturn         
	}

	public abstract int getParameterCount();

	public abstract JavaType getParameterType(int i);

	public abstract Class getRawParameterType(int i);

	protected AnnotatedParameter replaceParameterAnnotations(int i, AnnotationMap annotationmap)
	{
		_paramAnnotations[i] = annotationmap;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field AnnotationMap[] _paramAnnotations>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:aastore         
		return getParameter(i);
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:invokevirtual   #56  <Method AnnotatedParameter getParameter(int)>
	//    8   12:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final AnnotationMap _paramAnnotations[];
}
