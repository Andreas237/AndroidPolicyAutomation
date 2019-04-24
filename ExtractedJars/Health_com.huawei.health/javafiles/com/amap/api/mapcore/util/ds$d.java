// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			dr, ds, em

public static class ds$d extends dr
{

	public int a;
	public int b;
	public int c;
	public int g;
	public int h;

	ds$d(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void dr()>
		if(!a(s))
	//*   2    4:aload_0         
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #21  <Method boolean a(String)>
	//*   5    9:ifne            13
		{
			return;
	//    6   12:return          
		} else
		{
			a = c("aMVP");
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:ldc1            #23  <String "aMVP">
	//   10   17:invokevirtual   #26  <Method int c(String)>
	//   11   20:putfield        #28  <Field int a>
			em.a("getUniform");
	//   12   23:ldc1            #30  <String "getUniform">
	//   13   25:invokestatic    #34  <Method void em.a(String)>
			h = c("aMapBearing");
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:ldc1            #36  <String "aMapBearing">
	//   17   32:invokevirtual   #26  <Method int c(String)>
	//   18   35:putfield        #38  <Field int h>
			b = b("aVertex");
	//   19   38:aload_0         
	//   20   39:aload_0         
	//   21   40:ldc1            #40  <String "aVertex">
	//   22   42:invokevirtual   #42  <Method int b(String)>
	//   23   45:putfield        #44  <Field int b>
			c = b("aTextureCoord");
	//   24   48:aload_0         
	//   25   49:aload_0         
	//   26   50:ldc1            #46  <String "aTextureCoord">
	//   27   52:invokevirtual   #42  <Method int b(String)>
	//   28   55:putfield        #48  <Field int c>
			g = b("aBearingTiltAlpha");
	//   29   58:aload_0         
	//   30   59:aload_0         
	//   31   60:ldc1            #50  <String "aBearingTiltAlpha">
	//   32   62:invokevirtual   #42  <Method int b(String)>
	//   33   65:putfield        #52  <Field int g>
			return;
	//   34   68:return          
		}
	}
}
