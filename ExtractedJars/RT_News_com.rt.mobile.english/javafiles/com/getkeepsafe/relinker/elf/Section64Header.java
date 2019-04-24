// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.getkeepsafe.relinker.elf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

// Referenced classes of package com.getkeepsafe.relinker.elf:
//			ElfParser

public class Section64Header extends Elf.SectionHeader
{

	public Section64Header(ElfParser elfparser, Elf.Header header, int i)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Elf$SectionHeader()>
		ByteBuffer bytebuffer = ByteBuffer.allocate(8);
	//    2    4:bipush          8
	//    3    6:invokestatic    #17  <Method ByteBuffer ByteBuffer.allocate(int)>
	//    4    9:astore          5
		ByteOrder byteorder;
		if(header.bigEndian)
	//*   5   11:aload_2         
	//*   6   12:getfield        #23  <Field boolean Elf$Header.bigEndian>
	//*   7   15:ifeq            26
			byteorder = ByteOrder.BIG_ENDIAN;
	//    8   18:getstatic       #29  <Field ByteOrder ByteOrder.BIG_ENDIAN>
	//    9   21:astore          4
		else
	//*  10   23:goto            31
			byteorder = ByteOrder.LITTLE_ENDIAN;
	//   11   26:getstatic       #32  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//   12   29:astore          4
		bytebuffer.order(byteorder);
	//   13   31:aload           5
	//   14   33:aload           4
	//   15   35:invokevirtual   #36  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   16   38:pop             
		info = elfparser.readWord(bytebuffer, header.shoff + (long)(i * header.shentsize) + 44L);
	//   17   39:aload_0         
	//   18   40:aload_1         
	//   19   41:aload           5
	//   20   43:aload_2         
	//   21   44:getfield        #40  <Field long Elf$Header.shoff>
	//   22   47:iload_3         
	//   23   48:aload_2         
	//   24   49:getfield        #44  <Field int Elf$Header.shentsize>
	//   25   52:imul            
	//   26   53:i2l             
	//   27   54:ladd            
	//   28   55:ldc2w           #45  <Long 44L>
	//   29   58:ladd            
	//   30   59:invokevirtual   #52  <Method long ElfParser.readWord(ByteBuffer, long)>
	//   31   62:putfield        #55  <Field long info>
	//   32   65:return          
	}
}
