// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.api.transform;


// Referenced classes of package com.pactforcure.app.api.transform:
//			ResponseFromServerValueTransformer

public class InnocuousResponseFromServerTransformer
	implements ResponseFromServerValueTransformer
{

	public InnocuousResponseFromServerTransformer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public String denormalize(String s)
	{
		return s;
	//    0    0:aload_1         
	//    1    1:areturn         
	}
}
