// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.getkeepsafe.relinker.elf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

// Referenced classes of package com.getkeepsafe.relinker.elf:
//			ElfParser

public class Dynamic64Structure extends Elf.DynamicStructure
{

	public Dynamic64Structure(ElfParser elfparser, Elf.Header header, long l, int i)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Elf$DynamicStructure()>
		ByteBuffer bytebuffer = ByteBuffer.allocate(4);
	//    2    4:iconst_4        
	//    3    5:invokestatic    #17  <Method ByteBuffer ByteBuffer.allocate(int)>
	//    4    8:astore          6
		if(header.bigEndian)
	//*   5   10:aload_2         
	//*   6   11:getfield        #23  <Field boolean Elf$Header.bigEndian>
	//*   7   14:ifeq            24
			header = ((Elf.Header) (ByteOrder.BIG_ENDIAN));
	//    8   17:getstatic       #29  <Field ByteOrder ByteOrder.BIG_ENDIAN>
	//    9   20:astore_2        
		else
	//*  10   21:goto            28
			header = ((Elf.Header) (ByteOrder.LITTLE_ENDIAN));
	//   11   24:getstatic       #32  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//   12   27:astore_2        
		bytebuffer.order(((ByteOrder) (header)));
	//   13   28:aload           6
	//   14   30:aload_2         
	//   15   31:invokevirtual   #36  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   16   34:pop             
		l += i * 16;
	//   17   35:lload_3         
	//   18   36:iload           5
	//   19   38:bipush          16
	//   20   40:imul            
	//   21   41:i2l             
	//   22   42:ladd            
	//   23   43:lstore_3        
		tag = elfparser.readLong(bytebuffer, l);
	//   24   44:aload_0         
	//   25   45:aload_1         
	//   26   46:aload           6
	//   27   48:lload_3         
	//   28   49:invokevirtual   #42  <Method long ElfParser.readLong(ByteBuffer, long)>
	//   29   52:putfield        #46  <Field long tag>
		val = elfparser.readLong(bytebuffer, l + 8L);
	//   30   55:aload_0         
	//   31   56:aload_1         
	//   32   57:aload           6
	//   33   59:lload_3         
	//   34   60:ldc2w           #47  <Long 8L>
	//   35   63:ladd            
	//   36   64:invokevirtual   #42  <Method long ElfParser.readLong(ByteBuffer, long)>
	//   37   67:putfield        #51  <Field long val>
	//   38   70:return          
	}
}
