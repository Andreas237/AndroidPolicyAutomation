// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;


// Referenced classes of package com.fasterxml.jackson.databind.util:
//			NameTransformer

static final class NameTransformer$1 extends NameTransformer
{

	public String reverse(String s)
	{
		if(s.startsWith(val$prefix))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #14  <Field String val$prefix>
	//*   3    5:invokevirtual   #28  <Method boolean String.startsWith(String)>
	//*   4    8:ifeq            52
		{
			s = s.substring(val$prefix.length());
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #14  <Field String val$prefix>
	//    8   16:invokevirtual   #32  <Method int String.length()>
	//    9   19:invokevirtual   #36  <Method String String.substring(int)>
	//   10   22:astore_1        
			if(s.endsWith(val$suffix))
	//*  11   23:aload_1         
	//*  12   24:aload_0         
	//*  13   25:getfield        #16  <Field String val$suffix>
	//*  14   28:invokevirtual   #39  <Method boolean String.endsWith(String)>
	//*  15   31:ifeq            52
				return s.substring(0, s.length() - val$suffix.length());
	//   16   34:aload_1         
	//   17   35:iconst_0        
	//   18   36:aload_1         
	//   19   37:invokevirtual   #32  <Method int String.length()>
	//   20   40:aload_0         
	//   21   41:getfield        #16  <Field String val$suffix>
	//   22   44:invokevirtual   #32  <Method int String.length()>
	//   23   47:isub            
	//   24   48:invokevirtual   #42  <Method String String.substring(int, int)>
	//   25   51:areturn         
		}
		return null;
	//   26   52:aconst_null     
	//   27   53:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("[PreAndSuffixTransformer('").append(val$prefix).append("','").append(val$suffix).append("')]").toString();
	//    0    0:new             #46  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #47  <Method void StringBuilder()>
	//    3    7:ldc1            #49  <String "[PreAndSuffixTransformer('">
	//    4    9:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #14  <Field String val$prefix>
	//    7   16:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #55  <String "','">
	//    9   21:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #16  <Field String val$suffix>
	//   12   28:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   13   31:ldc1            #57  <String "')]">
	//   14   33:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   16   39:areturn         
	}

	public String transform(String s)
	{
		return (new StringBuilder()).append(val$prefix).append(s).append(val$suffix).toString();
	//    0    0:new             #46  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #47  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:getfield        #14  <Field String val$prefix>
	//    5   11:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//    8   18:aload_0         
	//    9   19:getfield        #16  <Field String val$suffix>
	//   10   22:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   12   28:areturn         
	}

	final String val$prefix;
	final String val$suffix;

	NameTransformer$1(String s, String s1)
	{
		val$prefix = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field String val$prefix>
		val$suffix = s1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field String val$suffix>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void NameTransformer()>
	//    8   14:return          
	}
}
