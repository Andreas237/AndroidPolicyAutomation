// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bex, bey

public final class bfc extends bex
{

	public bfc(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void bex()>
	//    2    4:aload_0         
	//    3    5:new             #19  <Class bey>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void bey()>
	//    6   12:putfield        #22  <Field bey a>
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #24  <Field int d>
	//   10   20:return          
	}

	private final ByteBuffer e(int i)
	{
		Object obj = ((Object) (b));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ByteBuffer b>
	//    2    4:astore_3        
		int j;
		if(obj == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       14
			j = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		else
	//*   7   11:goto            19
			j = ((ByteBuffer) (obj)).capacity();
	//    8   14:aload_3         
	//    9   15:invokevirtual   #35  <Method int ByteBuffer.capacity()>
	//   10   18:istore_2        
		obj = ((Object) (new StringBuilder(44)));
	//   11   19:new             #37  <Class StringBuilder>
	//   12   22:dup             
	//   13   23:bipush          44
	//   14   25:invokespecial   #39  <Method void StringBuilder(int)>
	//   15   28:astore_3        
		((StringBuilder) (obj)).append("Buffer too small (");
	//   16   29:aload_3         
	//   17   30:ldc1            #41  <String "Buffer too small (">
	//   18   32:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   19   35:pop             
		((StringBuilder) (obj)).append(j);
	//   20   36:aload_3         
	//   21   37:iload_2         
	//   22   38:invokevirtual   #48  <Method StringBuilder StringBuilder.append(int)>
	//   23   41:pop             
		((StringBuilder) (obj)).append(" < ");
	//   24   42:aload_3         
	//   25   43:ldc1            #50  <String " < ">
	//   26   45:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   27   48:pop             
		((StringBuilder) (obj)).append(i);
	//   28   49:aload_3         
	//   29   50:iload_1         
	//   30   51:invokevirtual   #48  <Method StringBuilder StringBuilder.append(int)>
	//   31   54:pop             
		((StringBuilder) (obj)).append(")");
	//   32   55:aload_3         
	//   33   56:ldc1            #52  <String ")">
	//   34   58:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
	//   35   61:pop             
		throw new IllegalStateException(((StringBuilder) (obj)).toString());
	//   36   62:new             #54  <Class IllegalStateException>
	//   37   65:dup             
	//   38   66:aload_3         
	//   39   67:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   40   70:invokespecial   #61  <Method void IllegalStateException(String)>
	//   41   73:athrow          
	}

	public final void a()
	{
		super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method void bex.a()>
		ByteBuffer bytebuffer = b;
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field ByteBuffer b>
	//    4    8:astore_1        
		if(bytebuffer != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          18
			bytebuffer.clear();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #67  <Method java.nio.Buffer ByteBuffer.clear()>
	//    9   17:pop             
	//   10   18:return          
	}

	public final void d(int i)
	{
		ByteBuffer bytebuffer = b;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ByteBuffer b>
	//    2    4:astore          4
		if(bytebuffer == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       21
		{
			b = e(i);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:invokespecial   #69  <Method ByteBuffer e(int)>
	//    9   17:putfield        #29  <Field ByteBuffer b>
			return;
	//   10   20:return          
		}
		int j = bytebuffer.capacity();
	//   11   21:aload           4
	//   12   23:invokevirtual   #35  <Method int ByteBuffer.capacity()>
	//   13   26:istore_2        
		int k = b.position();
	//   14   27:aload_0         
	//   15   28:getfield        #29  <Field ByteBuffer b>
	//   16   31:invokevirtual   #72  <Method int ByteBuffer.position()>
	//   17   34:istore_3        
		i += k;
	//   18   35:iload_1         
	//   19   36:iload_3         
	//   20   37:iadd            
	//   21   38:istore_1        
		if(j >= i)
	//*  22   39:iload_2         
	//*  23   40:iload_1         
	//*  24   41:icmplt          45
			return;
	//   25   44:return          
		bytebuffer = e(i);
	//   26   45:aload_0         
	//   27   46:iload_1         
	//   28   47:invokespecial   #69  <Method ByteBuffer e(int)>
	//   29   50:astore          4
		if(k > 0)
	//*  30   52:iload_3         
	//*  31   53:ifle            84
		{
			b.position(0);
	//   32   56:aload_0         
	//   33   57:getfield        #29  <Field ByteBuffer b>
	//   34   60:iconst_0        
	//   35   61:invokevirtual   #75  <Method java.nio.Buffer ByteBuffer.position(int)>
	//   36   64:pop             
			b.limit(k);
	//   37   65:aload_0         
	//   38   66:getfield        #29  <Field ByteBuffer b>
	//   39   69:iload_3         
	//   40   70:invokevirtual   #78  <Method java.nio.Buffer ByteBuffer.limit(int)>
	//   41   73:pop             
			bytebuffer.put(b);
	//   42   74:aload           4
	//   43   76:aload_0         
	//   44   77:getfield        #29  <Field ByteBuffer b>
	//   45   80:invokevirtual   #82  <Method ByteBuffer ByteBuffer.put(ByteBuffer)>
	//   46   83:pop             
		}
		b = bytebuffer;
	//   47   84:aload_0         
	//   48   85:aload           4
	//   49   87:putfield        #29  <Field ByteBuffer b>
	//   50   90:return          
	}

	public final boolean e()
	{
		return ((bex)this).c(0x40000000);
	//    0    0:aload_0         
	//    1    1:ldc1            #84  <Int 0x40000000>
	//    2    3:invokevirtual   #87  <Method boolean bex.c(int)>
	//    3    6:ireturn         
	}

	public final bey a = new bey();
	public ByteBuffer b;
	public long c;
	private final int d = 0;
}
