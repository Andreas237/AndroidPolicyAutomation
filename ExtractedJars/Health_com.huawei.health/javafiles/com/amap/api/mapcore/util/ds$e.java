// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			dr, ds

public static class ds$e extends dr
{

	public int a;
	public int b;
	public int c;

	ds$e(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void dr()>
		if(!a(s))
	//*   2    4:aload_0         
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #19  <Method boolean a(String)>
	//*   5    9:ifne            13
		{
			return;
	//    6   12:return          
		} else
		{
			a = c("aMVPMatrix");
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:ldc1            #21  <String "aMVPMatrix">
	//   10   17:invokevirtual   #24  <Method int c(String)>
	//   11   20:putfield        #26  <Field int a>
			c = c("aColor");
	//   12   23:aload_0         
	//   13   24:aload_0         
	//   14   25:ldc1            #28  <String "aColor">
	//   15   27:invokevirtual   #24  <Method int c(String)>
	//   16   30:putfield        #30  <Field int c>
			b = b("aVertex");
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:ldc1            #32  <String "aVertex">
	//   20   37:invokevirtual   #34  <Method int b(String)>
	//   21   40:putfield        #36  <Field int b>
			return;
	//   22   43:return          
		}
	}
}
