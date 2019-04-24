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

	public String reverse(String s)
	{
		String s1 = _t1.reverse(s);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field NameTransformer _t1>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #28  <Method String NameTransformer.reverse(String)>
	//    4    8:astore_2        
		s = s1;
	//    5    9:aload_2         
	//    6   10:astore_1        
		if(s1 != null)
	//*   7   11:aload_2         
	//*   8   12:ifnull          24
			s = _t2.reverse(s1);
	//    9   15:aload_0         
	//   10   16:getfield        #23  <Field NameTransformer _t2>
	//   11   19:aload_2         
	//   12   20:invokevirtual   #28  <Method String NameTransformer.reverse(String)>
	//   13   23:astore_1        
		return s;
	//   14   24:aload_1         
	//   15   25:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("[ChainedTransformer(").append(((Object) (_t1))).append(", ").append(((Object) (_t2))).append(")]").toString();
	//    0    0:new             #32  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void StringBuilder()>
	//    3    7:ldc1            #35  <String "[ChainedTransformer(">
	//    4    9:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #21  <Field NameTransformer _t1>
	//    7   16:invokevirtual   #42  <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:ldc1            #44  <String ", ">
	//    9   21:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #23  <Field NameTransformer _t2>
	//   12   28:invokevirtual   #42  <Method StringBuilder StringBuilder.append(Object)>
	//   13   31:ldc1            #46  <String ")]">
	//   14   33:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   16   39:areturn         
	}

	public String transform(String s)
	{
		return _t1.transform(_t2.transform(s));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field NameTransformer _t1>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field NameTransformer _t2>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #51  <Method String NameTransformer.transform(String)>
	//    6   12:invokevirtual   #51  <Method String NameTransformer.transform(String)>
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
