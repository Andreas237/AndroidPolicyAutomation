// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import java.nio.*;

// Referenced classes of package com.amap.api.mapcore.util:
//			fl, es

static final class es$a extends fl
{

	void a(int i)
	{
		int j = i;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(i < 32768)
	//*   2    2:iload_1         
	//*   3    3:ldc1            #24  <Int 32768>
	//*   4    5:icmpge          11
			j = 32768;
	//    5    8:ldc1            #24  <Int 32768>
	//    6   10:istore_2        
		a = ByteBuffer.allocateDirect(j).order(ByteOrder.nativeOrder());
	//    7   11:aload_0         
	//    8   12:iload_2         
	//    9   13:invokestatic    #30  <Method ByteBuffer ByteBuffer.allocateDirect(int)>
	//   10   16:invokestatic    #36  <Method ByteOrder ByteOrder.nativeOrder()>
	//   11   19:invokevirtual   #40  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   12   22:putfield        #42  <Field ByteBuffer a>
		e = j;
	//   13   25:aload_0         
	//   14   26:iload_2         
	//   15   27:putfield        #44  <Field int e>
		b = null;
	//   16   30:aload_0         
	//   17   31:aconst_null     
	//   18   32:putfield        #46  <Field ShortBuffer b>
		d = null;
	//   19   35:aload_0         
	//   20   36:aconst_null     
	//   21   37:putfield        #48  <Field IntBuffer d>
		c = null;
	//   22   40:aload_0         
	//   23   41:aconst_null     
	//   24   42:putfield        #50  <Field FloatBuffer c>
	//   25   45:return          
	}

	ByteBuffer a;
	ShortBuffer b;
	FloatBuffer c;
	IntBuffer d;
	int e;

	es$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void fl()>
	//    2    4:return          
	}
}
