// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import java.util.List;

public final class ae
{

	public ae(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		a = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field List a>
	//    5    9:return          
	}

	public List a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field List a>
	//    2    4:areturn         
	}

	private final List a;
}
