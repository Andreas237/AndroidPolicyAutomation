// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.michaelrocks.callmemaybe;


// Referenced classes of package io.michaelrocks.callmemaybe:
//			FormatParameters

public static class FormatParameters$Builder
{

	public FormatParameters build()
	{
		return new FormatParameters(this);
	//    0    0:new             #6   <Class FormatParameters>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #19  <Method void FormatParameters(FormatParameters$Builder)>
	//    4    8:areturn         
	}

	public FormatParameters$Builder region(String s)
	{
		region = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field String region>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	String region;

	FormatParameters$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
