// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.awt.geom.misc;


// Referenced classes of package com.itextpdf.awt.geom.misc:
//			RenderingHints

public static abstract class RenderingHints$Key
{

	public final boolean equals(Object obj)
	{
		return this == obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpne       7
	//    3    5:iconst_1        
	//    4    6:ireturn         
	//    5    7:iconst_0        
	//    6    8:ireturn         
	}

	public final int hashCode()
	{
		return System.identityHashCode(((Object) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #27  <Method int System.identityHashCode(Object)>
	//    2    4:ireturn         
	}

	protected final int intKey()
	{
		return key;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int key>
	//    2    4:ireturn         
	}

	public abstract boolean isCompatibleValue(Object obj);

	private final int key;

	protected RenderingHints$Key(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		key = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #16  <Field int key>
	//    5    9:return          
	}
}
