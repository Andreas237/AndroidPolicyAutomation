// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.search;

import com.ibotta.api.model.base.Module;
import java9.util.function.Function;

public final class _2D_$$Lambda$jnINpZkQYaosRLNHuYhy_2D_hZSw1A
	implements Function
{

	public Function andThen(Function function)
	{
		return java9.util.function.Function._2D_CC.$default$andThen(((Function) (this)), function);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #25  <Method Function java9.util.function.Function$_2D_CC.$default$andThen(Function, Function)>
	//    3    5:areturn         
	}

	public final Object apply(Object obj)
	{
		return ((Object) (((Module)obj).getContent()));
	//    0    0:aload_1         
	//    1    1:checkcast       #31  <Class Module>
	//    2    4:invokevirtual   #35  <Method java.util.List Module.getContent()>
	//    3    7:areturn         
	}

	public Function compose(Function function)
	{
		return java9.util.function.Function._2D_CC.$default$compose(((Function) (this)), function);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #39  <Method Function java9.util.function.Function$_2D_CC.$default$compose(Function, Function)>
	//    3    5:areturn         
	}

	public static final _2D_$$Lambda$jnINpZkQYaosRLNHuYhy_2D_hZSw1A INSTANCE = new _2D_$$Lambda$jnINpZkQYaosRLNHuYhy_2D_hZSw1A();

	static 
	{
	//    0    0:new             #2   <Class _2D_$$Lambda$jnINpZkQYaosRLNHuYhy_2D_hZSw1A>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void _2D_$$Lambda$jnINpZkQYaosRLNHuYhy_2D_hZSw1A()>
	//    3    7:putstatic       #15  <Field _2D_$$Lambda$jnINpZkQYaosRLNHuYhy_2D_hZSw1A INSTANCE>
	//*   4   10:return          
	}

	private _2D_$$Lambda$jnINpZkQYaosRLNHuYhy_2D_hZSw1A()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}
}
