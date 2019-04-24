// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.internal;

import rx.functions.Func0;
import rx.functions.Func1;

public final class Functions
{
	private static final class Always
		implements Func1, Func0
	{

		public Object call()
		{
			return value;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field Object value>
		//    2    4:areturn         
		}

		public Object call(Object obj)
		{
			return value;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field Object value>
		//    2    4:areturn         
		}

		private final Object value;

		private Always(Object obj)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			value = obj;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field Object value>
		//    5    9:return          
		}

	}


	private Functions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		throw new AssertionError("No instances.");
	//    2    4:new             #41  <Class AssertionError>
	//    3    7:dup             
	//    4    8:ldc1            #43  <String "No instances.">
	//    5   10:invokespecial   #46  <Method void AssertionError(Object)>
	//    6   13:athrow          
	}

	private static final Always ALWAYS_TRUE;
	public static final Func0 FUNC0_ALWAYS_TRUE;
	public static final Func1 FUNC1_ALWAYS_TRUE;

	static 
	{
		ALWAYS_TRUE = new Always(((Object) (Boolean.valueOf(true))));
	//    0    0:new             #8   <Class Functions$Always>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:invokestatic    #26  <Method Boolean Boolean.valueOf(boolean)>
	//    4    8:aconst_null     
	//    5    9:invokespecial   #30  <Method void Functions$Always(Object, Functions$1)>
	//    6   12:putstatic       #32  <Field Functions$Always ALWAYS_TRUE>
		FUNC0_ALWAYS_TRUE = ((Func0) (ALWAYS_TRUE));
	//    7   15:getstatic       #32  <Field Functions$Always ALWAYS_TRUE>
	//    8   18:putstatic       #34  <Field Func0 FUNC0_ALWAYS_TRUE>
		FUNC1_ALWAYS_TRUE = ((Func1) (ALWAYS_TRUE));
	//    9   21:getstatic       #32  <Field Functions$Always ALWAYS_TRUE>
	//   10   24:putstatic       #36  <Field Func1 FUNC1_ALWAYS_TRUE>
	//*  11   27:return          
	}
}
