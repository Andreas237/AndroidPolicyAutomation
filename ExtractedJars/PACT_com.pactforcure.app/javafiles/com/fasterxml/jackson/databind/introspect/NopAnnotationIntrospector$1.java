// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.cfg.PackageVersion;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			NopAnnotationIntrospector

static final class NopAnnotationIntrospector$1 extends NopAnnotationIntrospector
{

	public Version version()
	{
		return PackageVersion.VERSION;
	//    0    0:getstatic       #21  <Field Version PackageVersion.VERSION>
	//    1    3:areturn         
	}

	private static final long serialVersionUID = 1L;

	NopAnnotationIntrospector$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void NopAnnotationIntrospector()>
	//    2    4:return          
	}
}
