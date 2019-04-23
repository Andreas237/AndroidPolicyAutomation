// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ari

final class arj extends ari
{

	arj(ByteBuffer bytebuffer)
	{
		super(bytebuffer.array(), bytebuffer.arrayOffset() + bytebuffer.position(), bytebuffer.remaining());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #16  <Method byte[] ByteBuffer.array()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #20  <Method int ByteBuffer.arrayOffset()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #23  <Method int ByteBuffer.position()>
	//    7   13:iadd            
	//    8   14:aload_1         
	//    9   15:invokevirtual   #26  <Method int ByteBuffer.remaining()>
	//   10   18:invokespecial   #29  <Method void ari(byte[], int, int)>
		b = bytebuffer;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #31  <Field ByteBuffer b>
		c = bytebuffer.position();
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #23  <Method int ByteBuffer.position()>
	//   17   31:putfield        #33  <Field int c>
	//   18   34:return          
	}

	public final void a()
	{
		b.position(c + ((ari)this).e());
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ByteBuffer b>
	//    2    4:aload_0         
	//    3    5:getfield        #33  <Field int c>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #39  <Method int ari.e()>
	//    6   12:iadd            
	//    7   13:invokevirtual   #42  <Method java.nio.Buffer ByteBuffer.position(int)>
	//    8   16:pop             
	//    9   17:return          
	}

	private final ByteBuffer b;
	private int c;
}
