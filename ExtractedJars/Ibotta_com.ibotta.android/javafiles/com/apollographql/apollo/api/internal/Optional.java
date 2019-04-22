// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.api.internal;

import java.io.Serializable;

// Referenced classes of package com.apollographql.apollo.api.internal:
//			Absent, Present, Utils, Action, 
//			Function

public abstract class Optional
	implements Serializable
{

	Optional()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public static Optional absent()
	{
		return Absent.withType();
	//    0    0:invokestatic    #24  <Method Optional Absent.withType()>
	//    1    3:areturn         
	}

	public static Optional fromNullable(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return absent();
	//    2    4:invokestatic    #31  <Method Optional absent()>
	//    3    7:areturn         
		else
			return ((Optional) (new Present(obj)));
	//    4    8:new             #33  <Class Present>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #36  <Method void Present(Object)>
	//    8   16:areturn         
	}

	public static Optional of(Object obj)
	{
		return ((Optional) (new Present(Utils.checkNotNull(obj))));
	//    0    0:new             #33  <Class Present>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokestatic    #45  <Method Object Utils.checkNotNull(Object)>
	//    4    8:invokespecial   #36  <Method void Present(Object)>
	//    5   11:areturn         
	}

	public abstract Optional apply(Action action);

	public abstract Optional flatMap(Function function);

	public abstract Object get();

	public abstract boolean isPresent();

	public abstract Optional map(Function function);

	public abstract Object or(Object obj);

	public abstract Object orNull();

	private static final long serialVersionUID = 0L;
}
