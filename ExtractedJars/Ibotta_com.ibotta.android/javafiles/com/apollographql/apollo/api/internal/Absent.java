// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.api.internal;


// Referenced classes of package com.apollographql.apollo.api.internal:
//			Optional, Utils, Action, Function

final class Absent extends Optional
{

	private Absent()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Optional()>
	//    2    4:return          
	}

	private Object readResolve()
	{
		return ((Object) (INSTANCE));
	//    0    0:getstatic       #19  <Field Absent INSTANCE>
	//    1    3:areturn         
	}

	static Optional withType()
	{
		return ((Optional) (INSTANCE));
	//    0    0:getstatic       #19  <Field Absent INSTANCE>
	//    1    3:areturn         
	}

	public Optional apply(Action action)
	{
		Utils.checkNotNull(((Object) (action)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #35  <Method Object Utils.checkNotNull(Object)>
	//    2    4:pop             
		return Optional.absent();
	//    3    5:invokestatic    #38  <Method Optional Optional.absent()>
	//    4    8:areturn         
	}

	public boolean equals(Object obj)
	{
		return obj == this;
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:if_acmpne       7
	//    3    5:iconst_1        
	//    4    6:ireturn         
	//    5    7:iconst_0        
	//    6    8:ireturn         
	}

	public Optional flatMap(Function function)
	{
		Utils.checkNotNull(((Object) (function)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #35  <Method Object Utils.checkNotNull(Object)>
	//    2    4:pop             
		return Optional.absent();
	//    3    5:invokestatic    #38  <Method Optional Optional.absent()>
	//    4    8:areturn         
	}

	public Object get()
	{
		throw new IllegalStateException("Optional.get() cannot be called on an absent value");
	//    0    0:new             #49  <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #51  <String "Optional.get() cannot be called on an absent value">
	//    3    6:invokespecial   #54  <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public int hashCode()
	{
		return 0x79a31aac;
	//    0    0:ldc1            #58  <Int 0x79a31aac>
	//    1    2:ireturn         
	}

	public boolean isPresent()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Optional map(Function function)
	{
		Utils.checkNotNull(((Object) (function)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #35  <Method Object Utils.checkNotNull(Object)>
	//    2    4:pop             
		return Optional.absent();
	//    3    5:invokestatic    #38  <Method Optional Optional.absent()>
	//    4    8:areturn         
	}

	public Object or(Object obj)
	{
		return Utils.checkNotNull(obj, "use Optional.orNull() instead of Optional.or(null)");
	//    0    0:aload_1         
	//    1    1:ldc1            #65  <String "use Optional.orNull() instead of Optional.or(null)">
	//    2    3:invokestatic    #68  <Method Object Utils.checkNotNull(Object, Object)>
	//    3    6:areturn         
	}

	public Object orNull()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String toString()
	{
		return "Optional.absent()";
	//    0    0:ldc1            #75  <String "Optional.absent()">
	//    1    2:areturn         
	}

	static final Absent INSTANCE = new Absent();
	private static final long serialVersionUID = 0L;

	static 
	{
	//    0    0:new             #2   <Class Absent>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void Absent()>
	//    3    7:putstatic       #19  <Field Absent INSTANCE>
	//*   4   10:return          
	}
}
