// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.getkeepsafe.relinker.elf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

// Referenced classes of package com.getkeepsafe.relinker.elf:
//			ElfParser

public class Program64Header extends Elf.ProgramHeader
{

	public Program64Header(ElfParser elfparser, Elf.Header header, long l)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Elf$ProgramHeader()>
		ByteBuffer bytebuffer = ByteBuffer.allocate(8);
	//    2    4:bipush          8
	//    3    6:invokestatic    #17  <Method ByteBuffer ByteBuffer.allocate(int)>
	//    4    9:astore          6
		ByteOrder byteorder;
		if(header.bigEndian)
	//*   5   11:aload_2         
	//*   6   12:getfield        #23  <Field boolean Elf$Header.bigEndian>
	//*   7   15:ifeq            26
			byteorder = ByteOrder.BIG_ENDIAN;
	//    8   18:getstatic       #29  <Field ByteOrder ByteOrder.BIG_ENDIAN>
	//    9   21:astore          5
		else
	//*  10   23:goto            31
			byteorder = ByteOrder.LITTLE_ENDIAN;
	//   11   26:getstatic       #32  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//   12   29:astore          5
		bytebuffer.order(byteorder);
	//   13   31:aload           6
	//   14   33:aload           5
	//   15   35:invokevirtual   #36  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   16   38:pop             
		l = header.phoff + l * (long)header.phentsize;
	//   17   39:aload_2         
	//   18   40:getfield        #40  <Field long Elf$Header.phoff>
	//   19   43:lload_3         
	//   20   44:aload_2         
	//   21   45:getfield        #44  <Field int Elf$Header.phentsize>
	//   22   48:i2l             
	//   23   49:lmul            
	//   24   50:ladd            
	//   25   51:lstore_3        
		type = elfparser.readWord(bytebuffer, l);
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:aload           6
	//   29   56:lload_3         
	//   30   57:invokevirtual   #50  <Method long ElfParser.readWord(ByteBuffer, long)>
	//   31   60:putfield        #53  <Field long type>
		offset = elfparser.readLong(bytebuffer, l + 8L);
	//   32   63:aload_0         
	//   33   64:aload_1         
	//   34   65:aload           6
	//   35   67:lload_3         
	//   36   68:ldc2w           #54  <Long 8L>
	//   37   71:ladd            
	//   38   72:invokevirtual   #58  <Method long ElfParser.readLong(ByteBuffer, long)>
	//   39   75:putfield        #61  <Field long offset>
		vaddr = elfparser.readLong(bytebuffer, l + 16L);
	//   40   78:aload_0         
	//   41   79:aload_1         
	//   42   80:aload           6
	//   43   82:lload_3         
	//   44   83:ldc2w           #62  <Long 16L>
	//   45   86:ladd            
	//   46   87:invokevirtual   #58  <Method long ElfParser.readLong(ByteBuffer, long)>
	//   47   90:putfield        #66  <Field long vaddr>
		memsz = elfparser.readLong(bytebuffer, l + 40L);
	//   48   93:aload_0         
	//   49   94:aload_1         
	//   50   95:aload           6
	//   51   97:lload_3         
	//   52   98:ldc2w           #67  <Long 40L>
	//   53  101:ladd            
	//   54  102:invokevirtual   #58  <Method long ElfParser.readLong(ByteBuffer, long)>
	//   55  105:putfield        #71  <Field long memsz>
	//   56  108:return          
	}
}
