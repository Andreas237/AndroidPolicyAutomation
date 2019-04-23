// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;

import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.exoplayer:
//			CryptoInfo

public final class SampleHolder
{

	public SampleHolder(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #27  <Class CryptoInfo>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void CryptoInfo()>
	//    6   12:putfield        #30  <Field CryptoInfo cryptoInfo>
		bufferReplacementMode = i;
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:putfield        #32  <Field int bufferReplacementMode>
	//   10   20:return          
	}

	private ByteBuffer createReplacementBuffer(int i)
	{
		int j = bufferReplacementMode;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int bufferReplacementMode>
	//    2    4:istore_2        
		if(j == 1)
	//*   3    5:iload_2         
	//*   4    6:iconst_1        
	//*   5    7:icmpne          15
			return ByteBuffer.allocate(i);
	//    6   10:iload_1         
	//    7   11:invokestatic    #40  <Method ByteBuffer ByteBuffer.allocate(int)>
	//    8   14:areturn         
		if(j == 2)
	//*   9   15:iload_2         
	//*  10   16:iconst_2        
	//*  11   17:icmpne          25
			return ByteBuffer.allocateDirect(i);
	//   12   20:iload_1         
	//   13   21:invokestatic    #43  <Method ByteBuffer ByteBuffer.allocateDirect(int)>
	//   14   24:areturn         
		Object obj = ((Object) (data));
	//   15   25:aload_0         
	//   16   26:getfield        #45  <Field ByteBuffer data>
	//   17   29:astore_3        
		if(obj == null)
	//*  18   30:aload_3         
	//*  19   31:ifnonnull       39
			j = 0;
	//   20   34:iconst_0        
	//   21   35:istore_2        
		else
	//*  22   36:goto            44
			j = ((ByteBuffer) (obj)).capacity();
	//   23   39:aload_3         
	//   24   40:invokevirtual   #49  <Method int ByteBuffer.capacity()>
	//   25   43:istore_2        
		obj = ((Object) (new StringBuilder()));
	//   26   44:new             #51  <Class StringBuilder>
	//   27   47:dup             
	//   28   48:invokespecial   #52  <Method void StringBuilder()>
	//   29   51:astore_3        
		((StringBuilder) (obj)).append("Buffer too small (");
	//   30   52:aload_3         
	//   31   53:ldc1            #54  <String "Buffer too small (">
	//   32   55:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   33   58:pop             
		((StringBuilder) (obj)).append(j);
	//   34   59:aload_3         
	//   35   60:iload_2         
	//   36   61:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
	//   37   64:pop             
		((StringBuilder) (obj)).append(" < ");
	//   38   65:aload_3         
	//   39   66:ldc1            #63  <String " < ">
	//   40   68:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   41   71:pop             
		((StringBuilder) (obj)).append(i);
	//   42   72:aload_3         
	//   43   73:iload_1         
	//   44   74:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
	//   45   77:pop             
		((StringBuilder) (obj)).append(")");
	//   46   78:aload_3         
	//   47   79:ldc1            #65  <String ")">
	//   48   81:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   49   84:pop             
		throw new IllegalStateException(((StringBuilder) (obj)).toString());
	//   50   85:new             #67  <Class IllegalStateException>
	//   51   88:dup             
	//   52   89:aload_3         
	//   53   90:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   54   93:invokespecial   #74  <Method void IllegalStateException(String)>
	//   55   96:athrow          
	}

	public void clearData()
	{
		ByteBuffer bytebuffer = data;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field ByteBuffer data>
	//    2    4:astore_1        
		if(bytebuffer != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			bytebuffer.clear();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #79  <Method java.nio.Buffer ByteBuffer.clear()>
	//    7   13:pop             
	//    8   14:return          
	}

	public void ensureSpaceForWrite(int i)
		throws IllegalStateException
	{
		ByteBuffer bytebuffer = data;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field ByteBuffer data>
	//    2    4:astore          4
		if(bytebuffer == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       21
		{
			data = createReplacementBuffer(i);
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:invokespecial   #82  <Method ByteBuffer createReplacementBuffer(int)>
	//    9   17:putfield        #45  <Field ByteBuffer data>
			return;
	//   10   20:return          
		}
		int j = bytebuffer.capacity();
	//   11   21:aload           4
	//   12   23:invokevirtual   #49  <Method int ByteBuffer.capacity()>
	//   13   26:istore_2        
		int k = data.position();
	//   14   27:aload_0         
	//   15   28:getfield        #45  <Field ByteBuffer data>
	//   16   31:invokevirtual   #85  <Method int ByteBuffer.position()>
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
		bytebuffer = createReplacementBuffer(i);
	//   26   45:aload_0         
	//   27   46:iload_1         
	//   28   47:invokespecial   #82  <Method ByteBuffer createReplacementBuffer(int)>
	//   29   50:astore          4
		if(k > 0)
	//*  30   52:iload_3         
	//*  31   53:ifle            84
		{
			data.position(0);
	//   32   56:aload_0         
	//   33   57:getfield        #45  <Field ByteBuffer data>
	//   34   60:iconst_0        
	//   35   61:invokevirtual   #88  <Method java.nio.Buffer ByteBuffer.position(int)>
	//   36   64:pop             
			data.limit(k);
	//   37   65:aload_0         
	//   38   66:getfield        #45  <Field ByteBuffer data>
	//   39   69:iload_3         
	//   40   70:invokevirtual   #91  <Method java.nio.Buffer ByteBuffer.limit(int)>
	//   41   73:pop             
			bytebuffer.put(data);
	//   42   74:aload           4
	//   43   76:aload_0         
	//   44   77:getfield        #45  <Field ByteBuffer data>
	//   45   80:invokevirtual   #95  <Method ByteBuffer ByteBuffer.put(ByteBuffer)>
	//   46   83:pop             
		}
		data = bytebuffer;
	//   47   84:aload_0         
	//   48   85:aload           4
	//   49   87:putfield        #45  <Field ByteBuffer data>
	//   50   90:return          
	}

	public boolean isDecodeOnly()
	{
		return (flags & 0x8000000) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field int flags>
	//    2    4:ldc1            #101 <Int 0x8000000>
	//    3    6:iand            
	//    4    7:ifeq            12
	//    5   10:iconst_1        
	//    6   11:ireturn         
	//    7   12:iconst_0        
	//    8   13:ireturn         
	}

	public boolean isEncrypted()
	{
		return (flags & 2) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field int flags>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public boolean isSyncFrame()
	{
		return (flags & 1) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field int flags>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public static final int BUFFER_REPLACEMENT_MODE_DIRECT = 2;
	public static final int BUFFER_REPLACEMENT_MODE_DISABLED = 0;
	public static final int BUFFER_REPLACEMENT_MODE_NORMAL = 1;
	private final int bufferReplacementMode;
	public final CryptoInfo cryptoInfo = new CryptoInfo();
	public ByteBuffer data;
	public int flags;
	public int size;
	public long timeUs;
}
