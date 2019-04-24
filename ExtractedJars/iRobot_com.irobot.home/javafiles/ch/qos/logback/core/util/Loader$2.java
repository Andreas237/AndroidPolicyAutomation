// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.util;

import java.security.PrivilegedAction;

// Referenced classes of package ch.qos.logback.core.util:
//			Loader

static final class Loader$2
	implements PrivilegedAction
{

	public ClassLoader run()
	{
		return val$clazz.getClassLoader();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Class val$clazz>
	//    2    4:invokevirtual   #29  <Method ClassLoader Class.getClassLoader()>
	//    3    7:areturn         
	}

	public volatile Object run()
	{
		return ((Object) (run()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method ClassLoader run()>
	//    2    4:areturn         
	}

	final Class val$clazz;

	Loader$2(Class class1)
	{
		val$clazz = class1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Class val$clazz>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
