// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.getkeepsafe.relinker.elf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

// Referenced classes of package com.getkeepsafe.relinker.elf:
//			ElfParser

public class Section32Header extends Elf.SectionHeader
{

	public Section32Header(ElfParser elfparser, Elf.Header header, int i)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Elf$SectionHeader()>
		ByteBuffer bytebuffer = ByteBuffer.allocate(4);
	//    2    4:iconst_4        
	//    3    5:invokestatic    #17  <Method ByteBuffer ByteBuffer.allocate(int)>
	//    4    8:astore          5
		ByteOrder byteorder;
		if(header.bigEndian)
	//*   5   10:aload_2         
	//*   6   11:getfield        #23  <Field boolean Elf$Header.bigEndian>
	//*   7   14:ifeq            25
			byteorder = ByteOrder.BIG_ENDIAN;
	//    8   17:getstatic       #29  <Field ByteOrder ByteOrder.BIG_ENDIAN>
	//    9   20:astore          4
		else
	//*  10   22:goto            30
			byteorder = ByteOrder.LITTLE_ENDIAN;
	//   11   25:getstatic       #32  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//   12   28:astore          4
		bytebuffer.order(byteorder);
	//   13   30:aload           5
	//   14   32:aload           4
	//   15   34:invokevirtual   #36  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   16   37:pop             
		info = elfparser.readWord(bytebuffer, header.shoff + (long)(i * header.shentsize) + 28L);
	//   17   38:aload_0         
	//   18   39:aload_1         
	//   19   40:aload           5
	//   20   42:aload_2         
	//   21   43:getfield        #40  <Field long Elf$Header.shoff>
	//   22   46:iload_3         
	//   23   47:aload_2         
	//   24   48:getfield        #44  <Field int Elf$Header.shentsize>
	//   25   51:imul            
	//   26   52:i2l             
	//   27   53:ladd            
	//   28   54:ldc2w           #45  <Long 28L>
	//   29   57:ladd            
	//   30   58:invokevirtual   #52  <Method long ElfParser.readWord(ByteBuffer, long)>
	//   31   61:putfield        #55  <Field long info>
	//   32   64:return          
	}
}
