// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.getkeepsafe.relinker.elf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

// Referenced classes of package com.getkeepsafe.relinker.elf:
//			ElfParser, Dynamic32Structure, Program32Header, Section32Header

public class Elf32Header extends Elf.Header
{

	public Elf32Header(boolean flag, ElfParser elfparser)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Elf$Header()>
		bigEndian = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #17  <Field boolean bigEndian>
		parser = elfparser;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field ElfParser parser>
		ByteBuffer bytebuffer = ByteBuffer.allocate(4);
	//    8   14:iconst_4        
	//    9   15:invokestatic    #25  <Method ByteBuffer ByteBuffer.allocate(int)>
	//   10   18:astore          4
		ByteOrder byteorder;
		if(flag)
	//*  11   20:iload_1         
	//*  12   21:ifeq            31
			byteorder = ByteOrder.BIG_ENDIAN;
	//   13   24:getstatic       #31  <Field ByteOrder ByteOrder.BIG_ENDIAN>
	//   14   27:astore_3        
		else
	//*  15   28:goto            35
			byteorder = ByteOrder.LITTLE_ENDIAN;
	//   16   31:getstatic       #34  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//   17   34:astore_3        
		bytebuffer.order(byteorder);
	//   18   35:aload           4
	//   19   37:aload_3         
	//   20   38:invokevirtual   #38  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   21   41:pop             
		type = elfparser.readHalf(bytebuffer, 16L);
	//   22   42:aload_0         
	//   23   43:aload_2         
	//   24   44:aload           4
	//   25   46:ldc2w           #39  <Long 16L>
	//   26   49:invokevirtual   #46  <Method int ElfParser.readHalf(ByteBuffer, long)>
	//   27   52:putfield        #50  <Field int type>
		phoff = elfparser.readWord(bytebuffer, 28L);
	//   28   55:aload_0         
	//   29   56:aload_2         
	//   30   57:aload           4
	//   31   59:ldc2w           #51  <Long 28L>
	//   32   62:invokevirtual   #56  <Method long ElfParser.readWord(ByteBuffer, long)>
	//   33   65:putfield        #60  <Field long phoff>
		shoff = elfparser.readWord(bytebuffer, 32L);
	//   34   68:aload_0         
	//   35   69:aload_2         
	//   36   70:aload           4
	//   37   72:ldc2w           #61  <Long 32L>
	//   38   75:invokevirtual   #56  <Method long ElfParser.readWord(ByteBuffer, long)>
	//   39   78:putfield        #65  <Field long shoff>
		phentsize = elfparser.readHalf(bytebuffer, 42L);
	//   40   81:aload_0         
	//   41   82:aload_2         
	//   42   83:aload           4
	//   43   85:ldc2w           #66  <Long 42L>
	//   44   88:invokevirtual   #46  <Method int ElfParser.readHalf(ByteBuffer, long)>
	//   45   91:putfield        #70  <Field int phentsize>
		phnum = elfparser.readHalf(bytebuffer, 44L);
	//   46   94:aload_0         
	//   47   95:aload_2         
	//   48   96:aload           4
	//   49   98:ldc2w           #71  <Long 44L>
	//   50  101:invokevirtual   #46  <Method int ElfParser.readHalf(ByteBuffer, long)>
	//   51  104:putfield        #75  <Field int phnum>
		shentsize = elfparser.readHalf(bytebuffer, 46L);
	//   52  107:aload_0         
	//   53  108:aload_2         
	//   54  109:aload           4
	//   55  111:ldc2w           #76  <Long 46L>
	//   56  114:invokevirtual   #46  <Method int ElfParser.readHalf(ByteBuffer, long)>
	//   57  117:putfield        #80  <Field int shentsize>
		shnum = elfparser.readHalf(bytebuffer, 48L);
	//   58  120:aload_0         
	//   59  121:aload_2         
	//   60  122:aload           4
	//   61  124:ldc2w           #81  <Long 48L>
	//   62  127:invokevirtual   #46  <Method int ElfParser.readHalf(ByteBuffer, long)>
	//   63  130:putfield        #85  <Field int shnum>
		shstrndx = elfparser.readHalf(bytebuffer, 50L);
	//   64  133:aload_0         
	//   65  134:aload_2         
	//   66  135:aload           4
	//   67  137:ldc2w           #86  <Long 50L>
	//   68  140:invokevirtual   #46  <Method int ElfParser.readHalf(ByteBuffer, long)>
	//   69  143:putfield        #90  <Field int shstrndx>
	//   70  146:return          
	}

	public Elf.DynamicStructure getDynamicStructure(long l, int i)
		throws IOException
	{
		return ((Elf.DynamicStructure) (new Dynamic32Structure(parser, ((Elf.Header) (this)), l, i)));
	//    0    0:new             #96  <Class Dynamic32Structure>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field ElfParser parser>
	//    4    8:aload_0         
	//    5    9:lload_1         
	//    6   10:iload_3         
	//    7   11:invokespecial   #99  <Method void Dynamic32Structure(ElfParser, Elf$Header, long, int)>
	//    8   14:areturn         
	}

	public Elf.ProgramHeader getProgramHeader(long l)
		throws IOException
	{
		return ((Elf.ProgramHeader) (new Program32Header(parser, ((Elf.Header) (this)), l)));
	//    0    0:new             #103 <Class Program32Header>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field ElfParser parser>
	//    4    8:aload_0         
	//    5    9:lload_1         
	//    6   10:invokespecial   #106 <Method void Program32Header(ElfParser, Elf$Header, long)>
	//    7   13:areturn         
	}

	public Elf.SectionHeader getSectionHeader(int i)
		throws IOException
	{
		return ((Elf.SectionHeader) (new Section32Header(parser, ((Elf.Header) (this)), i)));
	//    0    0:new             #110 <Class Section32Header>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field ElfParser parser>
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokespecial   #113 <Method void Section32Header(ElfParser, Elf$Header, int)>
	//    7   13:areturn         
	}

	private final ElfParser parser;
}
