// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;


// Referenced classes of package com.fasterxml.jackson.databind.util:
//			NameTransformer

static final class NameTransformer$1 extends NameTransformer
{

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #24  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("[PreAndSuffixTransformer('");
	//    4    8:aload_1         
	//    5    9:ldc1            #27  <String "[PreAndSuffixTransformer('">
	//    6   11:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(val$prefix);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #14  <Field String val$prefix>
	//   11   20:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append("','");
	//   13   24:aload_1         
	//   14   25:ldc1            #33  <String "','">
	//   15   27:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(val$suffix);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #16  <Field String val$suffix>
	//   20   36:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append("')]");
	//   22   40:aload_1         
	//   23   41:ldc1            #35  <String "')]">
	//   24   43:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		return stringbuilder.toString();
	//   26   47:aload_1         
	//   27   48:invokevirtual   #37  <Method String StringBuilder.toString()>
	//   28   51:areturn         
	}

	public String transform(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #24  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append(val$prefix);
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #14  <Field String val$prefix>
	//    7   13:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(s);
	//    9   17:aload_2         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   12   22:pop             
		stringbuilder.append(val$suffix);
	//   13   23:aload_2         
	//   14   24:aload_0         
	//   15   25:getfield        #16  <Field String val$suffix>
	//   16   28:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   17   31:pop             
		return stringbuilder.toString();
	//   18   32:aload_2         
	//   19   33:invokevirtual   #37  <Method String StringBuilder.toString()>
	//   20   36:areturn         
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
