// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.decoder;

import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.exoplayer2.decoder:
//			Buffer, CryptoInfo

public class DecoderInputBuffer extends Buffer
{
	public static interface BufferReplacementMode
		extends Annotation
	{
	}


	public DecoderInputBuffer(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Buffer()>
	//    2    4:aload_0         
	//    3    5:new             #28  <Class CryptoInfo>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void CryptoInfo()>
	//    6   12:putfield        #31  <Field CryptoInfo cryptoInfo>
		bufferReplacementMode = i;
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:putfield        #33  <Field int bufferReplacementMode>
	//   10   20:return          
	}

	private ByteBuffer createReplacementByteBuffer(int i)
	{
		if(bufferReplacementMode == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field int bufferReplacementMode>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          13
			return ByteBuffer.allocate(i);
	//    4    8:iload_1         
	//    5    9:invokestatic    #41  <Method ByteBuffer ByteBuffer.allocate(int)>
	//    6   12:areturn         
		if(bufferReplacementMode == 2)
	//*   7   13:aload_0         
	//*   8   14:getfield        #33  <Field int bufferReplacementMode>
	//*   9   17:iconst_2        
	//*  10   18:icmpne          26
			return ByteBuffer.allocateDirect(i);
	//   11   21:iload_1         
	//   12   22:invokestatic    #44  <Method ByteBuffer ByteBuffer.allocateDirect(int)>
	//   13   25:areturn         
		int j;
		if(data == null)
	//*  14   26:aload_0         
	//*  15   27:getfield        #46  <Field ByteBuffer data>
	//*  16   30:ifnonnull       38
			j = 0;
	//   17   33:iconst_0        
	//   18   34:istore_2        
		else
	//*  19   35:goto            46
			j = data.capacity();
	//   20   38:aload_0         
	//   21   39:getfield        #46  <Field ByteBuffer data>
	//   22   42:invokevirtual   #50  <Method int ByteBuffer.capacity()>
	//   23   45:istore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   24   46:new             #52  <Class StringBuilder>
	//   25   49:dup             
	//   26   50:invokespecial   #53  <Method void StringBuilder()>
	//   27   53:astore_3        
		stringbuilder.append("Buffer too small (");
	//   28   54:aload_3         
	//   29   55:ldc1            #55  <String "Buffer too small (">
	//   30   57:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   31   60:pop             
		stringbuilder.append(j);
	//   32   61:aload_3         
	//   33   62:iload_2         
	//   34   63:invokevirtual   #62  <Method StringBuilder StringBuilder.append(int)>
	//   35   66:pop             
		stringbuilder.append(" < ");
	//   36   67:aload_3         
	//   37   68:ldc1            #64  <String " < ">
	//   38   70:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   39   73:pop             
		stringbuilder.append(i);
	//   40   74:aload_3         
	//   41   75:iload_1         
	//   42   76:invokevirtual   #62  <Method StringBuilder StringBuilder.append(int)>
	//   43   79:pop             
		stringbuilder.append(")");
	//   44   80:aload_3         
	//   45   81:ldc1            #66  <String ")">
	//   46   83:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   47   86:pop             
		throw new IllegalStateException(stringbuilder.toString());
	//   48   87:new             #68  <Class IllegalStateException>
	//   49   90:dup             
	//   50   91:aload_3         
	//   51   92:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   52   95:invokespecial   #75  <Method void IllegalStateException(String)>
	//   53   98:athrow          
	}

	public static DecoderInputBuffer newFlagsOnlyInstance()
	{
		return new DecoderInputBuffer(0);
	//    0    0:new             #2   <Class DecoderInputBuffer>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #79  <Method void DecoderInputBuffer(int)>
	//    4    8:areturn         
	}

	public void clear()
	{
		super.clear();
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method void Buffer.clear()>
		if(data != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #46  <Field ByteBuffer data>
	//*   4    8:ifnull          19
			data.clear();
	//    5   11:aload_0         
	//    6   12:getfield        #46  <Field ByteBuffer data>
	//    7   15:invokevirtual   #85  <Method java.nio.Buffer ByteBuffer.clear()>
	//    8   18:pop             
	//    9   19:return          
	}

	public void ensureSpaceForWrite(int i)
		throws IllegalStateException
	{
		if(data == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field ByteBuffer data>
	//*   2    4:ifnonnull       17
		{
			data = createReplacementByteBuffer(i);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokespecial   #88  <Method ByteBuffer createReplacementByteBuffer(int)>
	//    7   13:putfield        #46  <Field ByteBuffer data>
			return;
	//    8   16:return          
		}
		int j = data.capacity();
	//    9   17:aload_0         
	//   10   18:getfield        #46  <Field ByteBuffer data>
	//   11   21:invokevirtual   #50  <Method int ByteBuffer.capacity()>
	//   12   24:istore_2        
		int k = data.position();
	//   13   25:aload_0         
	//   14   26:getfield        #46  <Field ByteBuffer data>
	//   15   29:invokevirtual   #91  <Method int ByteBuffer.position()>
	//   16   32:istore_3        
		i += k;
	//   17   33:iload_1         
	//   18   34:iload_3         
	//   19   35:iadd            
	//   20   36:istore_1        
		if(j >= i)
	//*  21   37:iload_2         
	//*  22   38:iload_1         
	//*  23   39:icmplt          43
			return;
	//   24   42:return          
		ByteBuffer bytebuffer = createReplacementByteBuffer(i);
	//   25   43:aload_0         
	//   26   44:iload_1         
	//   27   45:invokespecial   #88  <Method ByteBuffer createReplacementByteBuffer(int)>
	//   28   48:astore          4
		if(k > 0)
	//*  29   50:iload_3         
	//*  30   51:ifle            82
		{
			data.position(0);
	//   31   54:aload_0         
	//   32   55:getfield        #46  <Field ByteBuffer data>
	//   33   58:iconst_0        
	//   34   59:invokevirtual   #94  <Method java.nio.Buffer ByteBuffer.position(int)>
	//   35   62:pop             
			data.limit(k);
	//   36   63:aload_0         
	//   37   64:getfield        #46  <Field ByteBuffer data>
	//   38   67:iload_3         
	//   39   68:invokevirtual   #97  <Method java.nio.Buffer ByteBuffer.limit(int)>
	//   40   71:pop             
			bytebuffer.put(data);
	//   41   72:aload           4
	//   42   74:aload_0         
	//   43   75:getfield        #46  <Field ByteBuffer data>
	//   44   78:invokevirtual   #101 <Method ByteBuffer ByteBuffer.put(ByteBuffer)>
	//   45   81:pop             
		}
		data = bytebuffer;
	//   46   82:aload_0         
	//   47   83:aload           4
	//   48   85:putfield        #46  <Field ByteBuffer data>
	//   49   88:return          
	}

	public final void flip()
	{
		data.flip();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field ByteBuffer data>
	//    2    4:invokevirtual   #105 <Method java.nio.Buffer ByteBuffer.flip()>
	//    3    7:pop             
	//    4    8:return          
	}

	public final boolean isEncrypted()
	{
		return getFlag(0x40000000);
	//    0    0:aload_0         
	//    1    1:ldc1            #108 <Int 0x40000000>
	//    2    3:invokevirtual   #112 <Method boolean getFlag(int)>
	//    3    6:ireturn         
	}

	public final boolean isFlagsOnly()
	{
		return data == null && bufferReplacementMode == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field ByteBuffer data>
	//    2    4:ifnonnull       16
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field int bufferReplacementMode>
	//    5   11:ifne            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public static final int BUFFER_REPLACEMENT_MODE_DIRECT = 2;
	public static final int BUFFER_REPLACEMENT_MODE_DISABLED = 0;
	public static final int BUFFER_REPLACEMENT_MODE_NORMAL = 1;
	private final int bufferReplacementMode;
	public final CryptoInfo cryptoInfo = new CryptoInfo();
	public ByteBuffer data;
	public long timeUs;
}
