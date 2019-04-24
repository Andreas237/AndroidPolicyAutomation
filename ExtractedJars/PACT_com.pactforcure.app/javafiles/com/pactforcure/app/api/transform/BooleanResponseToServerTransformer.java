// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.api.transform;


// Referenced classes of package com.pactforcure.app.api.transform:
//			ResponseToServerValueTransformer

class BooleanResponseToServerTransformer
	implements ResponseToServerValueTransformer
{

	BooleanResponseToServerTransformer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public String normalize(String s)
	{
		if(s.contentEquals("1"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #15  <String "1">
	//*   2    3:invokevirtual   #21  <Method boolean String.contentEquals(CharSequence)>
	//*   3    6:ifeq            12
			return "yes";
	//    4    9:ldc1            #23  <String "yes">
	//    5   11:areturn         
		else
			return "no";
	//    6   12:ldc1            #25  <String "no">
	//    7   14:areturn         
	}
}
