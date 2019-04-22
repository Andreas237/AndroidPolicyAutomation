// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;


// Referenced classes of package com.fasterxml.jackson.databind.util:
//			NameTransformer

static final class NameTransformer$3 extends NameTransformer
{

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #21  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("[SuffixTransformer('");
	//    4    8:aload_1         
	//    5    9:ldc1            #24  <String "[SuffixTransformer('">
	//    6   11:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(val$suffix);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #13  <Field String val$suffix>
	//   11   20:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append("')]");
	//   13   24:aload_1         
	//   14   25:ldc1            #30  <String "')]">
	//   15   27:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		return stringbuilder.toString();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #32  <Method String StringBuilder.toString()>
	//   19   35:areturn         
	}

	public String transform(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #21  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append(s);
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
		stringbuilder.append(val$suffix);
	//    8   14:aload_2         
	//    9   15:aload_0         
	//   10   16:getfield        #13  <Field String val$suffix>
	//   11   19:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   12   22:pop             
		return stringbuilder.toString();
	//   13   23:aload_2         
	//   14   24:invokevirtual   #32  <Method String StringBuilder.toString()>
	//   15   27:areturn         
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
