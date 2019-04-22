// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;


class DigitsUserAgent
{

	DigitsUserAgent(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		digitsVersion = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field String digitsVersion>
		androidVersion = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #16  <Field String androidVersion>
	//    8   14:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #21  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Digits/");
	//    4    8:aload_1         
	//    5    9:ldc1            #24  <String "Digits/">
	//    6   11:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(digitsVersion);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #14  <Field String digitsVersion>
	//   11   20:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(" (Android ");
	//   13   24:aload_1         
	//   14   25:ldc1            #30  <String " (Android ">
	//   15   27:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(androidVersion);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #16  <Field String androidVersion>
	//   20   36:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append(")");
	//   22   40:aload_1         
	//   23   41:ldc1            #32  <String ")">
	//   24   43:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		return stringbuilder.toString();
	//   26   47:aload_1         
	//   27   48:invokevirtual   #34  <Method String StringBuilder.toString()>
	//   28   51:areturn         
	}

	private final String androidVersion;
	private final String digitsVersion;
}
