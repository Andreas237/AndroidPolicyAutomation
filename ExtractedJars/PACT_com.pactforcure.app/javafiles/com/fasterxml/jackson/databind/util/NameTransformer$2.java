// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;


// Referenced classes of package com.fasterxml.jackson.databind.util:
//			NameTransformer

static final class NameTransformer$2 extends NameTransformer
{

	public String reverse(String s)
	{
		if(s.startsWith(val$prefix))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #13  <Field String val$prefix>
	//*   3    5:invokevirtual   #25  <Method boolean String.startsWith(String)>
	//*   4    8:ifeq            23
			return s.substring(val$prefix.length());
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #13  <Field String val$prefix>
	//    8   16:invokevirtual   #29  <Method int String.length()>
	//    9   19:invokevirtual   #33  <Method String String.substring(int)>
	//   10   22:areturn         
		else
			return null;
	//   11   23:aconst_null     
	//   12   24:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("[PrefixTransformer('").append(val$prefix).append("')]").toString();
	//    0    0:new             #37  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void StringBuilder()>
	//    3    7:ldc1            #40  <String "[PrefixTransformer('">
	//    4    9:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #13  <Field String val$prefix>
	//    7   16:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #46  <String "')]">
	//    9   21:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   11   27:areturn         
	}

	public String transform(String s)
	{
		return (new StringBuilder()).append(val$prefix).append(s).toString();
	//    0    0:new             #37  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field String val$prefix>
	//    5   11:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//    8   18:invokevirtual   #48  <Method String StringBuilder.toString()>
	//    9   21:areturn         
	}

	final String val$prefix;

	NameTransformer$2(String s)
	{
		val$prefix = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field String val$prefix>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void NameTransformer()>
	//    5    9:return          
	}
}
