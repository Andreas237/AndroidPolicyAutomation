// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash.manifest;


public final class UtcTimingElement
{

	public UtcTimingElement(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		schemeIdUri = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field String schemeIdUri>
		value = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #16  <Field String value>
	//    8   14:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #21  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(schemeIdUri);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #14  <Field String schemeIdUri>
	//    7   13:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(", ");
	//    9   17:aload_1         
	//   10   18:ldc1            #28  <String ", ">
	//   11   20:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(value);
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:getfield        #16  <Field String value>
	//   16   29:invokevirtual   #26  <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
		return stringbuilder.toString();
	//   18   33:aload_1         
	//   19   34:invokevirtual   #30  <Method String StringBuilder.toString()>
	//   20   37:areturn         
	}

	public final String schemeIdUri;
	public final String value;
}
