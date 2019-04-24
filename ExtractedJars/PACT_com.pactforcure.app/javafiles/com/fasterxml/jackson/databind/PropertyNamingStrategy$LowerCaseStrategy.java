// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;


// Referenced classes of package com.fasterxml.jackson.databind:
//			PropertyNamingStrategy

public static class PropertyNamingStrategy$LowerCaseStrategy extends tegyBase
{

	public String translate(String s)
	{
		return s.toLowerCase();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #20  <Method String String.toLowerCase()>
	//    2    4:areturn         
	}

	public PropertyNamingStrategy$LowerCaseStrategy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void PropertyNamingStrategy$PropertyNamingStrategyBase()>
	//    2    4:return          
	}
}
