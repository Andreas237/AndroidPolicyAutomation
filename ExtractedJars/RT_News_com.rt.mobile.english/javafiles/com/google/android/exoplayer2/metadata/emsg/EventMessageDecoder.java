// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.metadata.emsg;

import com.google.android.exoplayer2.metadata.*;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer2.metadata.emsg:
//			EventMessage

public final class EventMessageDecoder
	implements MetadataDecoder
{

	public EventMessageDecoder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public Metadata decode(MetadataInputBuffer metadatainputbuffer)
	{
		Object obj = ((Object) (metadatainputbuffer.data));
	//    0    0:aload_1         
	//    1    1:getfield        #19  <Field ByteBuffer MetadataInputBuffer.data>
	//    2    4:astore          7
		metadatainputbuffer = ((MetadataInputBuffer) (((ByteBuffer) (obj)).array()));
	//    3    6:aload           7
	//    4    8:invokevirtual   #25  <Method byte[] ByteBuffer.array()>
	//    5   11:astore_1        
		int i = ((ByteBuffer) (obj)).limit();
	//    6   12:aload           7
	//    7   14:invokevirtual   #29  <Method int ByteBuffer.limit()>
	//    8   17:istore_2        
		obj = ((Object) (new ParsableByteArray(((byte []) (metadatainputbuffer)), i)));
	//    9   18:new             #31  <Class ParsableByteArray>
	//   10   21:dup             
	//   11   22:aload_1         
	//   12   23:iload_2         
	//   13   24:invokespecial   #34  <Method void ParsableByteArray(byte[], int)>
	//   14   27:astore          7
		String s = ((ParsableByteArray) (obj)).readNullTerminatedString();
	//   15   29:aload           7
	//   16   31:invokevirtual   #38  <Method String ParsableByteArray.readNullTerminatedString()>
	//   17   34:astore          8
		String s1 = ((ParsableByteArray) (obj)).readNullTerminatedString();
	//   18   36:aload           7
	//   19   38:invokevirtual   #38  <Method String ParsableByteArray.readNullTerminatedString()>
	//   20   41:astore          9
		long l = ((ParsableByteArray) (obj)).readUnsignedInt();
	//   21   43:aload           7
	//   22   45:invokevirtual   #42  <Method long ParsableByteArray.readUnsignedInt()>
	//   23   48:lstore_3        
		long l1 = Util.scaleLargeTimestamp(((ParsableByteArray) (obj)).readUnsignedInt(), 0xf4240L, l);
	//   24   49:aload           7
	//   25   51:invokevirtual   #42  <Method long ParsableByteArray.readUnsignedInt()>
	//   26   54:ldc2w           #43  <Long 0xf4240L>
	//   27   57:lload_3         
	//   28   58:invokestatic    #50  <Method long Util.scaleLargeTimestamp(long, long, long)>
	//   29   61:lstore          5
		return new Metadata(new com.google.android.exoplayer2.metadata.Metadata.Entry[] {
			new EventMessage(s, s1, Util.scaleLargeTimestamp(((ParsableByteArray) (obj)).readUnsignedInt(), 1000L, l), ((ParsableByteArray) (obj)).readUnsignedInt(), Arrays.copyOfRange(((byte []) (metadatainputbuffer)), ((ParsableByteArray) (obj)).getPosition(), i), l1)
		});
	//   30   63:new             #52  <Class Metadata>
	//   31   66:dup             
	//   32   67:iconst_1        
	//   33   68:anewarray       com.google.android.exoplayer2.metadata.Metadata.Entry[]
	//   34   71:dup             
	//   35   72:iconst_0        
	//   36   73:new             #56  <Class EventMessage>
	//   37   76:dup             
	//   38   77:aload           8
	//   39   79:aload           9
	//   40   81:aload           7
	//   41   83:invokevirtual   #42  <Method long ParsableByteArray.readUnsignedInt()>
	//   42   86:ldc2w           #57  <Long 1000L>
	//   43   89:lload_3         
	//   44   90:invokestatic    #50  <Method long Util.scaleLargeTimestamp(long, long, long)>
	//   45   93:aload           7
	//   46   95:invokevirtual   #42  <Method long ParsableByteArray.readUnsignedInt()>
	//   47   98:aload_1         
	//   48   99:aload           7
	//   49  101:invokevirtual   #61  <Method int ParsableByteArray.getPosition()>
	//   50  104:iload_2         
	//   51  105:invokestatic    #67  <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   52  108:lload           5
	//   53  110:invokespecial   #70  <Method void EventMessage(String, String, long, long, byte[], long)>
	//   54  113:aastore         
	//   55  114:invokespecial   #73  <Method void Metadata(com.google.android.exoplayer2.metadata.Metadata$Entry[])>
	//   56  117:areturn         
	}
}
