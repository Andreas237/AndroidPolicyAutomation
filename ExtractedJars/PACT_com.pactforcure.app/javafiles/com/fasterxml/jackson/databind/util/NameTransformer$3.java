// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;


// Referenced classes of package com.fasterxml.jackson.databind.util:
//			NameTransformer

static final class NameTransformer$3 extends NameTransformer
{

	public String reverse(String s)
	{
		if(s.endsWith(val$suffix))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #13  <Field String val$suffix>
	//*   3    5:invokevirtual   #25  <Method boolean String.endsWith(String)>
	//*   4    8:ifeq            29
			return s.substring(0, s.length() - val$suffix.length());
	//    5   11:aload_1         
	//    6   12:iconst_0        
	//    7   13:aload_1         
	//    8   14:invokevirtual   #29  <Method int String.length()>
	//    9   17:aload_0         
	//   10   18:getfield        #13  <Field String val$suffix>
	//   11   21:invokevirtual   #29  <Method int String.length()>
	//   12   24:isub            
	//   13   25:invokevirtual   #33  <Method String String.substring(int, int)>
	//   14   28:areturn         
		else
			return null;
	//   15   29:aconst_null     
	//   16   30:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("[SuffixTransformer('").append(val$suffix).append("')]").toString();
	//    0    0:new             #37  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void StringBuilder()>
	//    3    7:ldc1            #40  <String "[SuffixTransformer('">
	//    4    9:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #13  <Field String val$suffix>
	//    7   16:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #46  <String "')]">
	//    9   21:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   11   27:areturn         
	}

	public String transform(String s)
	{
		return (new StringBuilder()).append(s).append(val$suffix).toString();
	//    0    0:new             #37  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void StringBuilder()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//    5   11:aload_0         
	//    6   12:getfield        #13  <Field String val$suffix>
	//    7   15:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//    8   18:invokevirtual   #48  <Method String StringBuilder.toString()>
	//    9   21:areturn         
	}

	final String val$suffix;

	NameTransformer$3(String s)
	{
		val$suffix = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field String val$suffix>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void NameTransformer()>
	//    5    9:return          
	}
}
