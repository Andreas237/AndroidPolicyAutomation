// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package dagger;

import dagger.internal.FailoverLoader;
import dagger.internal.Loader;

public abstract class ObjectGraph
{

	ObjectGraph()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public static transient ObjectGraph create(Object aobj[])
	{
	/* block-local class not found */
	class DaggerObjectGraph {}

		return DaggerObjectGraph.access._mth000(((DaggerObjectGraph) (null)), ((Loader) (new FailoverLoader())), aobj);
	//    0    0:aconst_null     
	//    1    1:new             #19  <Class FailoverLoader>
	//    2    4:dup             
	//    3    5:invokespecial   #20  <Method void FailoverLoader()>
	//    4    8:aload_0         
	//    5    9:invokestatic    #24  <Method ObjectGraph ObjectGraph$DaggerObjectGraph.access$000(ObjectGraph$DaggerObjectGraph, Loader, Object[])>
	//    6   12:areturn         
	}

	static transient ObjectGraph createWith(Loader loader, Object aobj[])
	{
		return DaggerObjectGraph.access._mth000(((DaggerObjectGraph) (null)), loader, aobj);
	//    0    0:aconst_null     
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokestatic    #24  <Method ObjectGraph ObjectGraph$DaggerObjectGraph.access$000(ObjectGraph$DaggerObjectGraph, Loader, Object[])>
	//    4    6:areturn         
	}

	public abstract Object get(Class class1);

	public abstract Object inject(Object obj);

	public abstract void injectStatics();

	public transient abstract ObjectGraph plus(Object aobj[]);

	public abstract void validate();

	// Unreferenced inner class dagger/ObjectGraph$OverridesBindings
	/* block-local class not found */
	class OverridesBindings {}


	// Unreferenced inner class dagger/ObjectGraph$StandardBindings
	/* block-local class not found */
	class StandardBindings {}

}
