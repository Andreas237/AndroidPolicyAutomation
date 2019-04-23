// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ayu

final class aeh
	implements ayu
{

	aeh(ByteBuffer bytebuffer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		a = bytebuffer.duplicate();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #20  <Method ByteBuffer ByteBuffer.duplicate()>
	//    5    9:putfield        #22  <Field ByteBuffer a>
	//    6   12:return          
	}

	public final int a(ByteBuffer bytebuffer)
	{
		if(a.remaining() == 0 && bytebuffer.remaining() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field ByteBuffer a>
	//*   2    4:invokevirtual   #28  <Method int ByteBuffer.remaining()>
	//*   3    7:ifne            19
	//*   4   10:aload_1         
	//*   5   11:invokevirtual   #28  <Method int ByteBuffer.remaining()>
	//*   6   14:ifle            19
		{
			return -1;
	//    7   17:iconst_m1       
	//    8   18:ireturn         
		} else
		{
			int i = Math.min(bytebuffer.remaining(), a.remaining());
	//    9   19:aload_1         
	//   10   20:invokevirtual   #28  <Method int ByteBuffer.remaining()>
	//   11   23:aload_0         
	//   12   24:getfield        #22  <Field ByteBuffer a>
	//   13   27:invokevirtual   #28  <Method int ByteBuffer.remaining()>
	//   14   30:invokestatic    #34  <Method int Math.min(int, int)>
	//   15   33:istore_2        
			byte abyte0[] = new byte[i];
	//   16   34:iload_2         
	//   17   35:newarray        byte[]
	//   18   37:astore_3        
			a.get(abyte0);
	//   19   38:aload_0         
	//   20   39:getfield        #22  <Field ByteBuffer a>
	//   21   42:aload_3         
	//   22   43:invokevirtual   #38  <Method ByteBuffer ByteBuffer.get(byte[])>
	//   23   46:pop             
			bytebuffer.put(abyte0);
	//   24   47:aload_1         
	//   25   48:aload_3         
	//   26   49:invokevirtual   #41  <Method ByteBuffer ByteBuffer.put(byte[])>
	//   27   52:pop             
			return i;
	//   28   53:iload_2         
	//   29   54:ireturn         
		}
	}

	public final long a()
	{
		return (long)a.limit();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field ByteBuffer a>
	//    2    4:invokevirtual   #45  <Method int ByteBuffer.limit()>
	//    3    7:i2l             
	//    4    8:lreturn         
	}

	public final ByteBuffer a(long l, long l1)
	{
		int i = a.position();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field ByteBuffer a>
	//    2    4:invokevirtual   #49  <Method int ByteBuffer.position()>
	//    3    7:istore          5
		a.position((int)l);
	//    4    9:aload_0         
	//    5   10:getfield        #22  <Field ByteBuffer a>
	//    6   13:lload_1         
	//    7   14:l2i             
	//    8   15:invokevirtual   #52  <Method java.nio.Buffer ByteBuffer.position(int)>
	//    9   18:pop             
		ByteBuffer bytebuffer = a.slice();
	//   10   19:aload_0         
	//   11   20:getfield        #22  <Field ByteBuffer a>
	//   12   23:invokevirtual   #55  <Method ByteBuffer ByteBuffer.slice()>
	//   13   26:astore          6
		bytebuffer.limit((int)l1);
	//   14   28:aload           6
	//   15   30:lload_3         
	//   16   31:l2i             
	//   17   32:invokevirtual   #57  <Method java.nio.Buffer ByteBuffer.limit(int)>
	//   18   35:pop             
		a.position(i);
	//   19   36:aload_0         
	//   20   37:getfield        #22  <Field ByteBuffer a>
	//   21   40:iload           5
	//   22   42:invokevirtual   #52  <Method java.nio.Buffer ByteBuffer.position(int)>
	//   23   45:pop             
		return bytebuffer;
	//   24   46:aload           6
	//   25   48:areturn         
	}

	public final void a(long l)
	{
		a.position((int)l);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field ByteBuffer a>
	//    2    4:lload_1         
	//    3    5:l2i             
	//    4    6:invokevirtual   #52  <Method java.nio.Buffer ByteBuffer.position(int)>
	//    5    9:pop             
	//    6   10:return          
	}

	public final long b()
	{
		return (long)a.position();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field ByteBuffer a>
	//    2    4:invokevirtual   #49  <Method int ByteBuffer.position()>
	//    3    7:i2l             
	//    4    8:lreturn         
	}

	public final void close()
	{
	//    0    0:return          
	}

	private final ByteBuffer a;
}
