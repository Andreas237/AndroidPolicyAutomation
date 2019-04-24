// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.awt.geom.misc;


// Referenced classes of package com.itextpdf.awt.geom.misc:
//			RenderingHints

private static class RenderingHints$KeyImpl extends RenderingHints.Key
{

	public boolean isCompatibleValue(Object obj)
	{
		while(!(obj instanceof ) || .access._mth000(()obj) != this) 
	//*   0    0:aload_1         
	//*   1    1:instanceof      #16  <Class RenderingHints$KeyValue>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
	//    5    9:aload_1         
	//    6   10:checkcast       #16  <Class RenderingHints$KeyValue>
	//    7   13:invokestatic    #20  <Method RenderingHints$Key RenderingHints$KeyValue.access$000(RenderingHints$KeyValue)>
	//    8   16:aload_0         
	//    9   17:if_acmpne       7
		return true;
	//   10   20:iconst_1        
	//   11   21:ireturn         
	}

	protected RenderingHints$KeyImpl(int i)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #11  <Method void RenderingHints$Key(int)>
	//    3    5:return          
	}
}
