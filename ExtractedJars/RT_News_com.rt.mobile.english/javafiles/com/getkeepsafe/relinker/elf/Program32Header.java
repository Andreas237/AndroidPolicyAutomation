// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.getkeepsafe.relinker.elf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

// Referenced classes of package com.getkeepsafe.relinker.elf:
//			ElfParser

public class Program32Header extends Elf.ProgramHeader
{

	public Program32Header(ElfParser elfparser, Elf.Header header, long l)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Elf$ProgramHeader()>
		ByteBuffer bytebuffer = ByteBuffer.allocate(4);
	//    2    4:iconst_4        
	//    3    5:invokestatic    #17  <Method ByteBuffer ByteBuffer.allocate(int)>
	//    4    8:astore          6
		ByteOrder byteorder;
		if(header.bigEndian)
	//*   5   10:aload_2         
	//*   6   11:getfield        #23  <Field boolean Elf$Header.bigEndian>
	//*   7   14:ifeq            25
			byteorder = ByteOrder.BIG_ENDIAN;
	//    8   17:getstatic       #29  <Field ByteOrder ByteOrder.BIG_ENDIAN>
	//    9   20:astore          5
		else
	//*  10   22:goto            30
			byteorder = ByteOrder.LITTLE_ENDIAN;
	//   11   25:getstatic       #32  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//   12   28:astore          5
		bytebuffer.order(byteorder);
	//   13   30:aload           6
	//   14   32:aload           5
	//   15   34:invokevirtual   #36  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   16   37:pop             
		l = header.phoff + l * (long)header.phentsize;
	//   17   38:aload_2         
	//   18   39:getfield        #40  <Field long Elf$Header.phoff>
	//   19   42:lload_3         
	//   20   43:aload_2         
	//   21   44:getfield        #44  <Field int Elf$Header.phentsize>
	//   22   47:i2l             
	//   23   48:lmul            
	//   24   49:ladd            
	//   25   50:lstore_3        
		type = elfparser.readWord(bytebuffer, l);
	//   26   51:aload_0         
	//   27   52:aload_1         
	//   28   53:aload           6
	//   29   55:lload_3         
	//   30   56:invokevirtual   #50  <Method long ElfParser.readWord(ByteBuffer, long)>
	//   31   59:putfield        #53  <Field long type>
		offset = elfparser.readWord(bytebuffer, l + 4L);
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:aload           6
	//   35   66:lload_3         
	//   36   67:ldc2w           #54  <Long 4L>
	//   37   70:ladd            
	//   38   71:invokevirtual   #50  <Method long ElfParser.readWord(ByteBuffer, long)>
	//   39   74:putfield        #58  <Field long offset>
		vaddr = elfparser.readWord(bytebuffer, l + 8L);
	//   40   77:aload_0         
	//   41   78:aload_1         
	//   42   79:aload           6
	//   43   81:lload_3         
	//   44   82:ldc2w           #59  <Long 8L>
	//   45   85:ladd            
	//   46   86:invokevirtual   #50  <Method long ElfParser.readWord(ByteBuffer, long)>
	//   47   89:putfield        #63  <Field long vaddr>
		memsz = elfparser.readWord(bytebuffer, l + 20L);
	//   48   92:aload_0         
	//   49   93:aload_1         
	//   50   94:aload           6
	//   51   96:lload_3         
	//   52   97:ldc2w           #64  <Long 20L>
	//   53  100:ladd            
	//   54  101:invokevirtual   #50  <Method long ElfParser.readWord(ByteBuffer, long)>
	//   55  104:putfield        #68  <Field long memsz>
	//   56  107:return          
	}
}
