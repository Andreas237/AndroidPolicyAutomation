// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import java.util.TreeSet;

// Referenced classes of package com.google.gson.internal:
//			ObjectConstructor, ConstructorConstructor

class ConstructorConstructor$4
	implements ObjectConstructor
{

	public Object construct()
	{
		return ((Object) (new TreeSet()));
	//    0    0:new             #26  <Class TreeSet>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void TreeSet()>
	//    3    7:areturn         
	}

	final ConstructorConstructor this$0;

	ConstructorConstructor$4()
	{
		this$0 = ConstructorConstructor.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ConstructorConstructor this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
