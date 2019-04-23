// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ayo

public final class afg extends ayo
{

	public afg(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void ayo(String)>
	//    3    5:return          
	}

	public final void a(ByteBuffer bytebuffer)
	{
		b = bytebuffer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ByteBuffer b>
		bytebuffer.position(bytebuffer.position() + bytebuffer.remaining());
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #21  <Method int ByteBuffer.position()>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #24  <Method int ByteBuffer.remaining()>
	//    8   14:iadd            
	//    9   15:invokevirtual   #27  <Method java.nio.Buffer ByteBuffer.position(int)>
	//   10   18:pop             
	//   11   19:return          
	}

	private ByteBuffer b;
}
