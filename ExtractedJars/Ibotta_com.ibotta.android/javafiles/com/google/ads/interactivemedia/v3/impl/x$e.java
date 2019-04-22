// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;

import android.view.Surface;
import com.google.ads.interactivemedia.v3.a.a;

// Referenced classes of package com.google.ads.interactivemedia.v3.impl:
//			x

class x$e extends x$d
	implements com.google.ads.interactivemedia.v3.a.o$a
{

	public void a(int i, int j, int k, float f)
	{
		a a1 = x.c(b);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field x b>
	//    2    4:invokestatic    #24  <Method a x.c(x)>
	//    3    7:astore          5
		if(j == 0)
	//*   4    9:iload_2         
	//*   5   10:ifne            19
			f = 1.0F;
	//    6   13:fconst_1        
	//    7   14:fstore          4
		else
	//*   8   16:goto            29
			f = ((float)i * f) / (float)j;
	//    9   19:iload_1         
	//   10   20:i2f             
	//   11   21:fload           4
	//   12   23:fmul            
	//   13   24:iload_2         
	//   14   25:i2f             
	//   15   26:fdiv            
	//   16   27:fstore          4
		a1.a(f);
	//   17   29:aload           5
	//   18   31:fload           4
	//   19   33:invokevirtual   #29  <Method void a.a(float)>
	//   20   36:return          
	}

	public void a(int i, long l)
	{
	//    0    0:return          
	}

	public void a(Surface surface)
	{
	//    0    0:return          
	}

	final x b;

	x$e(x x1)
	{
		b = x1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field x b>
		super(x1);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #17  <Method void x$d(x)>
	//    6   10:return          
	}
}
