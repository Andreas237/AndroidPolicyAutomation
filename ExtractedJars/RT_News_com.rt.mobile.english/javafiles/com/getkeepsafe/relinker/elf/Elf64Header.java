// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.getkeepsafe.relinker.elf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

// Referenced classes of package com.getkeepsafe.relinker.elf:
//			ElfParser, Dynamic64Structure, Program64Header, Section64Header

public class Elf64Header extends Elf.Header
{

	public Elf64Header(boolean flag, ElfParser elfparser)
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
		ByteBuffer bytebuffer = ByteBuffer.allocate(8);
	//    8   14:bipush          8
	//    9   16:invokestatic    #25  <Method ByteBuffer ByteBuffer.allocate(int)>
	//   10   19:astore          4
		ByteOrder byteorder;
		if(flag)
	//*  11   21:iload_1         
	//*  12   22:ifeq            32
			byteorder = ByteOrder.BIG_ENDIAN;
	//   13   25:getstatic       #31  <Field ByteOrder ByteOrder.BIG_ENDIAN>
	//   14   28:astore_3        
		else
	//*  15   29:goto            36
			byteorder = ByteOrder.LITTLE_ENDIAN;
	//   16   32:getstatic       #34  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//   17   35:astore_3        
		bytebuffer.order(byteorder);
	//   18   36:aload           4
	//   19   38:aload_3         
	//   20   39:invokevirtual   #38  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   21   42:pop             
		type = elfparser.readHalf(bytebuffer, 16L);
	//   22   43:aload_0         
	//   23   44:aload_2         
	//   24   45:aload           4
	//   25   47:ldc2w           #39  <Long 16L>
	//   26   50:invokevirtual   #46  <Method int ElfParser.readHalf(ByteBuffer, long)>
	//   27   53:putfield        #50  <Field int type>
		phoff = elfparser.readLong(bytebuffer, 32L);
	//   28   56:aload_0         
	//   29   57:aload_2         
	//   30   58:aload           4
	//   31   60:ldc2w           #51  <Long 32L>
	//   32   63:invokevirtual   #56  <Method long ElfParser.readLong(ByteBuffer, long)>
	//   33   66:putfield        #60  <Field long phoff>
		shoff = elfparser.readLong(bytebuffer, 40L);
	//   34   69:aload_0         
	//   35   70:aload_2         
	//   36   71:aload           4
	//   37   73:ldc2w           #61  <Long 40L>
	//   38   76:invokevirtual   #56  <Method long ElfParser.readLong(ByteBuffer, long)>
	//   39   79:putfield        #65  <Field long shoff>
		phentsize = elfparser.readHalf(bytebuffer, 54L);
	//   40   82:aload_0         
	//   41   83:aload_2         
	//   42   84:aload           4
	//   43   86:ldc2w           #66  <Long 54L>
	//   44   89:invokevirtual   #46  <Method int ElfParser.readHalf(ByteBuffer, long)>
	//   45   92:putfield        #70  <Field int phentsize>
		phnum = elfparser.readHalf(bytebuffer, 56L);
	//   46   95:aload_0         
	//   47   96:aload_2         
	//   48   97:aload           4
	//   49   99:ldc2w           #71  <Long 56L>
	//   50  102:invokevirtual   #46  <Method int ElfParser.readHalf(ByteBuffer, long)>
	//   51  105:putfield        #75  <Field int phnum>
		shentsize = elfparser.readHalf(bytebuffer, 58L);
	//   52  108:aload_0         
	//   53  109:aload_2         
	//   54  110:aload           4
	//   55  112:ldc2w           #76  <Long 58L>
	//   56  115:invokevirtual   #46  <Method int ElfParser.readHalf(ByteBuffer, long)>
	//   57  118:putfield        #80  <Field int shentsize>
		shnum = elfparser.readHalf(bytebuffer, 60L);
	//   58  121:aload_0         
	//   59  122:aload_2         
	//   60  123:aload           4
	//   61  125:ldc2w           #81  <Long 60L>
	//   62  128:invokevirtual   #46  <Method int ElfParser.readHalf(ByteBuffer, long)>
	//   63  131:putfield        #85  <Field int shnum>
		shstrndx = elfparser.readHalf(bytebuffer, 62L);
	//   64  134:aload_0         
	//   65  135:aload_2         
	//   66  136:aload           4
	//   67  138:ldc2w           #86  <Long 62L>
	//   68  141:invokevirtual   #46  <Method int ElfParser.readHalf(ByteBuffer, long)>
	//   69  144:putfield        #90  <Field int shstrndx>
	//   70  147:return          
	}

	public Elf.DynamicStructure getDynamicStructure(long l, int i)
		throws IOException
	{
		return ((Elf.DynamicStructure) (new Dynamic64Structure(parser, ((Elf.Header) (this)), l, i)));
	//    0    0:new             #96  <Class Dynamic64Structure>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field ElfParser parser>
	//    4    8:aload_0         
	//    5    9:lload_1         
	//    6   10:iload_3         
	//    7   11:invokespecial   #99  <Method void Dynamic64Structure(ElfParser, Elf$Header, long, int)>
	//    8   14:areturn         
	}

	public Elf.ProgramHeader getProgramHeader(long l)
		throws IOException
	{
		return ((Elf.ProgramHeader) (new Program64Header(parser, ((Elf.Header) (this)), l)));
	//    0    0:new             #103 <Class Program64Header>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field ElfParser parser>
	//    4    8:aload_0         
	//    5    9:lload_1         
	//    6   10:invokespecial   #106 <Method void Program64Header(ElfParser, Elf$Header, long)>
	//    7   13:areturn         
	}

	public Elf.SectionHeader getSectionHeader(int i)
		throws IOException
	{
		return ((Elf.SectionHeader) (new Section64Header(parser, ((Elf.Header) (this)), i)));
	//    0    0:new             #110 <Class Section64Header>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field ElfParser parser>
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokespecial   #113 <Method void Section64Header(ElfParser, Elf$Header, int)>
	//    7   13:areturn         
	}

	private final ElfParser parser;
}
