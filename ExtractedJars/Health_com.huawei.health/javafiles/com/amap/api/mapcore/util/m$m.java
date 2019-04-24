// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			m

class m$m extends m$b
{

	final m j;

	public m$m(m m1, boolean flag)
	{
		j = m1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field m j>
		byte byte0;
		if(flag)
	//*   3    5:iload_2         
	//*   4    6:ifeq            15
			byte0 = 16;
	//    5    9:bipush          16
	//    6   11:istore_3        
		else
	//*   7   12:goto            17
			byte0 = 0;
	//    8   15:iconst_0        
	//    9   16:istore_3        
		super(m1, 8, 8, 8, 0, ((int) (byte0)), 0);
	//   10   17:aload_0         
	//   11   18:aload_1         
	//   12   19:bipush          8
	//   13   21:bipush          8
	//   14   23:bipush          8
	//   15   25:iconst_0        
	//   16   26:iload_3         
	//   17   27:iconst_0        
	//   18   28:invokespecial   #16  <Method void m$b(m, int, int, int, int, int, int)>
	//   19   31:return          
	}
}
