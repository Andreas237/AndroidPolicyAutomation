// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ayo, abc, aac

public abstract class ayq extends ayo
	implements abc
{

	protected ayq(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void ayo(String)>
	//    3    5:return          
	}

	protected final long b(ByteBuffer bytebuffer)
	{
		b = aac.a(bytebuffer.get());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #21  <Method byte ByteBuffer.get()>
	//    3    5:invokestatic    #27  <Method int aac.a(byte)>
	//    4    8:putfield        #29  <Field int b>
		c = (aac.b(bytebuffer) << 8) + 0 + aac.a(bytebuffer.get());
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokestatic    #32  <Method int aac.b(ByteBuffer)>
	//    8   16:bipush          8
	//    9   18:ishl            
	//   10   19:iconst_0        
	//   11   20:iadd            
	//   12   21:aload_1         
	//   13   22:invokevirtual   #21  <Method byte ByteBuffer.get()>
	//   14   25:invokestatic    #27  <Method int aac.a(byte)>
	//   15   28:iadd            
	//   16   29:putfield        #34  <Field int c>
		return 4L;
	//   17   32:ldc2w           #35  <Long 4L>
	//   18   35:lreturn         
	}

	public final int e()
	{
		if(!a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field boolean a>
	//*   2    4:ifne            11
			((ayo)this).d();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #45  <Method void ayo.d()>
		return b;
	//    5   11:aload_0         
	//    6   12:getfield        #29  <Field int b>
	//    7   15:ireturn         
	}

	private int b;
	private int c;
}
