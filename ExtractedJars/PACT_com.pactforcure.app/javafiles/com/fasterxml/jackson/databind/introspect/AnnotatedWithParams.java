// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			AnnotatedMember, AnnotationMap, AnnotatedParameter, TypeResolutionContext

public abstract class AnnotatedWithParams extends AnnotatedMember
{

	protected AnnotatedWithParams(TypeResolutionContext typeresolutioncontext, AnnotationMap annotationmap, AnnotationMap aannotationmap[])
	{
		super(typeresolutioncontext, annotationmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #15  <Method void AnnotatedMember(TypeResolutionContext, AnnotationMap)>
		_paramAnnotations = aannotationmap;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #17  <Field AnnotationMap[] _paramAnnotations>
	//    7   11:return          
	}

	public final void addOrOverrideParam(int i, Annotation annotation)
	{
		AnnotationMap annotationmap1 = _paramAnnotations[i];
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field AnnotationMap[] _paramAnnotations>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:astore          4
		AnnotationMap annotationmap = annotationmap1;
	//    5    8:aload           4
	//    6   10:astore_3        
		if(annotationmap1 == null)
	//*   7   11:aload           4
	//*   8   13:ifnonnull       31
		{
			annotationmap = new AnnotationMap();
	//    9   16:new             #22  <Class AnnotationMap>
	//   10   19:dup             
	//   11   20:invokespecial   #25  <Method void AnnotationMap()>
	//   12   23:astore_3        
			_paramAnnotations[i] = annotationmap;
	//   13   24:aload_0         
	//   14   25:getfield        #17  <Field AnnotationMap[] _paramAnnotations>
	//   15   28:iload_1         
	//   16   29:aload_3         
	//   17   30:aastore         
		}
		annotationmap.add(annotation);
	//   18   31:aload_3         
	//   19   32:aload_2         
	//   20   33:invokevirtual   #29  <Method boolean AnnotationMap.add(Annotation)>
	//   21   36:pop             
	//   22   37:return          
	}

	public abstract Object call()
		throws Exception;

	public abstract Object call(Object aobj[])
		throws Exception;

	public abstract Object call1(Object obj)
		throws Exception;

	public final int getAnnotationCount()
	{
		return _annotations.size();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field AnnotationMap _annotations>
	//    2    4:invokevirtual   #45  <Method int AnnotationMap.size()>
	//    3    7:ireturn         
	}

	public final Type getGenericParameterType(int i)
	{
		return ((Type) (getRawParameterType(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #52  <Method Class getRawParameterType(int)>
	//    3    5:areturn         
	}

	public final AnnotatedParameter getParameter(int i)
	{
		return new AnnotatedParameter(this, getParameterType(i), getParameterAnnotations(i), i);
	//    0    0:new             #57  <Class AnnotatedParameter>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokevirtual   #61  <Method JavaType getParameterType(int)>
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:invokevirtual   #65  <Method AnnotationMap getParameterAnnotations(int)>
	//    9   15:iload_1         
	//   10   16:invokespecial   #68  <Method void AnnotatedParameter(AnnotatedWithParams, JavaType, AnnotationMap, int)>
	//   11   19:areturn         
	}

	public final AnnotationMap getParameterAnnotations(int i)
	{
		if(_paramAnnotations != null && i >= 0 && i < _paramAnnotations.length)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field AnnotationMap[] _paramAnnotations>
	//*   2    4:ifnull          27
	//*   3    7:iload_1         
	//*   4    8:iflt            27
	//*   5   11:iload_1         
	//*   6   12:aload_0         
	//*   7   13:getfield        #17  <Field AnnotationMap[] _paramAnnotations>
	//*   8   16:arraylength     
	//*   9   17:icmpge          27
			return _paramAnnotations[i];
	//   10   20:aload_0         
	//   11   21:getfield        #17  <Field AnnotationMap[] _paramAnnotations>
	//   12   24:iload_1         
	//   13   25:aaload          
	//   14   26:areturn         
		else
			return null;
	//   15   27:aconst_null     
	//   16   28:areturn         
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
	//    7    9:invokevirtual   #73  <Method AnnotatedParameter getParameter(int)>
	//    8   12:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final AnnotationMap _paramAnnotations[];
}
