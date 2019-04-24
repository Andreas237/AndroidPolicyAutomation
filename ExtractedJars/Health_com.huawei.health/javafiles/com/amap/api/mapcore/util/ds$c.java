// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			dr, ds

public static class ds$c extends dr
{

	public int a;
	public int b;
	public int c;
	public int g;
	public int h;

	ds$c(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void dr()>
		if(!a(s))
	//*   2    4:aload_0         
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #20  <Method boolean a(String)>
	//*   5    9:ifne            13
		{
			return;
	//    6   12:return          
		} else
		{
			a = c("aMVP");
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:ldc1            #22  <String "aMVP">
	//   10   17:invokevirtual   #25  <Method int c(String)>
	//   11   20:putfield        #27  <Field int a>
			b = b("aVertex");
	//   12   23:aload_0         
	//   13   24:aload_0         
	//   14   25:ldc1            #29  <String "aVertex">
	//   15   27:invokevirtual   #31  <Method int b(String)>
	//   16   30:putfield        #33  <Field int b>
			c = b("aTextureCoord");
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:ldc1            #35  <String "aTextureCoord">
	//   20   37:invokevirtual   #31  <Method int b(String)>
	//   21   40:putfield        #37  <Field int c>
			g = c("aTransform");
	//   22   43:aload_0         
	//   23   44:aload_0         
	//   24   45:ldc1            #39  <String "aTransform">
	//   25   47:invokevirtual   #25  <Method int c(String)>
	//   26   50:putfield        #41  <Field int g>
			h = c("aColor");
	//   27   53:aload_0         
	//   28   54:aload_0         
	//   29   55:ldc1            #43  <String "aColor">
	//   30   57:invokevirtual   #25  <Method int c(String)>
	//   31   60:putfield        #45  <Field int h>
			return;
	//   32   63:return          
		}
	}
}
