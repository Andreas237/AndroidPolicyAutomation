// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.util.Collection;

// Referenced classes of package com.fasterxml.jackson.databind.jsontype:
//			NamedType

public abstract class SubtypeResolver
{

	public SubtypeResolver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public abstract Collection collectAndResolveSubtypes(AnnotatedClass annotatedclass, MapperConfig mapperconfig, AnnotationIntrospector annotationintrospector);

	public abstract Collection collectAndResolveSubtypes(AnnotatedMember annotatedmember, MapperConfig mapperconfig, AnnotationIntrospector annotationintrospector, JavaType javatype);

	public Collection collectAndResolveSubtypesByClass(MapperConfig mapperconfig, AnnotatedClass annotatedclass)
	{
		return collectAndResolveSubtypes(annotatedclass, mapperconfig, mapperconfig.getAnnotationIntrospector());
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_1         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #21  <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//    5    7:invokevirtual   #23  <Method Collection collectAndResolveSubtypes(AnnotatedClass, MapperConfig, AnnotationIntrospector)>
	//    6   10:areturn         
	}

	public Collection collectAndResolveSubtypesByClass(MapperConfig mapperconfig, AnnotatedMember annotatedmember, JavaType javatype)
	{
		return collectAndResolveSubtypes(annotatedmember, mapperconfig, mapperconfig.getAnnotationIntrospector(), javatype);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_1         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #21  <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//    5    7:aload_3         
	//    6    8:invokevirtual   #28  <Method Collection collectAndResolveSubtypes(AnnotatedMember, MapperConfig, AnnotationIntrospector, JavaType)>
	//    7   11:areturn         
	}

	public Collection collectAndResolveSubtypesByTypeId(MapperConfig mapperconfig, AnnotatedClass annotatedclass)
	{
		return collectAndResolveSubtypes(annotatedclass, mapperconfig, mapperconfig.getAnnotationIntrospector());
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_1         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #21  <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//    5    7:invokevirtual   #23  <Method Collection collectAndResolveSubtypes(AnnotatedClass, MapperConfig, AnnotationIntrospector)>
	//    6   10:areturn         
	}

	public Collection collectAndResolveSubtypesByTypeId(MapperConfig mapperconfig, AnnotatedMember annotatedmember, JavaType javatype)
	{
		return collectAndResolveSubtypes(annotatedmember, mapperconfig, mapperconfig.getAnnotationIntrospector(), javatype);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_1         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #21  <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//    5    7:aload_3         
	//    6    8:invokevirtual   #28  <Method Collection collectAndResolveSubtypes(AnnotatedMember, MapperConfig, AnnotationIntrospector, JavaType)>
	//    7   11:areturn         
	}

	public transient abstract void registerSubtypes(NamedType anamedtype[]);

	public transient abstract void registerSubtypes(Class aclass[]);
}
