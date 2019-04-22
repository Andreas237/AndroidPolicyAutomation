// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//			NameTransformer

public static class NameTransformer$Chained extends NameTransformer
	implements Serializable
{

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #28  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("[ChainedTransformer(");
	//    4    8:aload_1         
	//    5    9:ldc1            #31  <String "[ChainedTransformer(">
	//    6   11:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (_t1)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #21  <Field NameTransformer _t1>
	//   11   20:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append(", ");
	//   13   24:aload_1         
	//   14   25:ldc1            #40  <String ", ">
	//   15   27:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(((Object) (_t2)));
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #23  <Field NameTransformer _t2>
	//   20   36:invokevirtual   #38  <Method StringBuilder StringBuilder.append(Object)>
	//   21   39:pop             
		stringbuilder.append(")]");
	//   22   40:aload_1         
	//   23   41:ldc1            #42  <String ")]">
	//   24   43:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		return stringbuilder.toString();
	//   26   47:aload_1         
	//   27   48:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   28   51:areturn         
	}

	public String transform(String s)
	{
		return _t1.transform(_t2.transform(s));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field NameTransformer _t1>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field NameTransformer _t2>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #48  <Method String NameTransformer.transform(String)>
	//    6   12:invokevirtual   #48  <Method String NameTransformer.transform(String)>
	//    7   15:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final NameTransformer _t1;
	protected final NameTransformer _t2;

	public NameTransformer$Chained(NameTransformer nametransformer, NameTransformer nametransformer1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void NameTransformer()>
		_t1 = nametransformer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field NameTransformer _t1>
		_t2 = nametransformer1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field NameTransformer _t2>
	//    8   14:return          
	}
}
