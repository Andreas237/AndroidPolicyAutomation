// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import java.io.Serializable;

public abstract class NopAnnotationIntrospector extends AnnotationIntrospector
	implements Serializable
{

	public NopAnnotationIntrospector()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void AnnotationIntrospector()>
	//    2    4:return          
	}

	public Version version()
	{
		return Version.unknownVersion();
	//    0    0:invokestatic    #30  <Method Version Version.unknownVersion()>
	//    1    3:areturn         
	}

	public static final NopAnnotationIntrospector instance = new NopAnnotationIntrospector() {

		public Version version()
		{
			return PackageVersion.VERSION;
		//    0    0:getstatic       #21  <Field Version PackageVersion.VERSION>
		//    1    3:areturn         
		}

		private static final long serialVersionUID = 1L;

	}
;
	private static final long serialVersionUID = 1L;

	static 
	{
	//    0    0:new             #8   <Class NopAnnotationIntrospector$1>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void NopAnnotationIntrospector$1()>
	//    3    7:putstatic       #21  <Field NopAnnotationIntrospector instance>
	//*   4   10:return          
	}
}
