// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//			NameTransformer

protected static final class NameTransformer$NopTransformer extends NameTransformer
	implements Serializable
{

	public String reverse(String s)
	{
		return s;
	//    0    0:aload_1         
	//    1    1:areturn         
	}

	public String transform(String s)
	{
		return s;
	//    0    0:aload_1         
	//    1    1:areturn         
	}

	private static final long serialVersionUID = 1L;

	protected NameTransformer$NopTransformer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void NameTransformer()>
	//    2    4:return          
	}
}
