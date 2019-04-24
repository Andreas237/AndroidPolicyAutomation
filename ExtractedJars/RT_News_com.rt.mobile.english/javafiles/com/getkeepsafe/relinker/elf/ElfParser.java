// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.getkeepsafe.relinker.elf;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.*;

// Referenced classes of package com.getkeepsafe.relinker.elf:
//			Elf, Elf32Header, Elf64Header

public class ElfParser
	implements Closeable, Elf
{

	public ElfParser(File file)
		throws FileNotFoundException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:ldc1            #20  <Int 0x464c457f>
	//    4    7:putfield        #22  <Field int MAGIC>
		if(file != null && file.exists())
	//*   5   10:aload_1         
	//*   6   11:ifnull          40
	//*   7   14:aload_1         
	//*   8   15:invokevirtual   #28  <Method boolean File.exists()>
	//*   9   18:ifne            24
	//*  10   21:goto            40
		{
			channel = (new FileInputStream(file)).getChannel();
	//   11   24:aload_0         
	//   12   25:new             #30  <Class FileInputStream>
	//   13   28:dup             
	//   14   29:aload_1         
	//   15   30:invokespecial   #32  <Method void FileInputStream(File)>
	//   16   33:invokevirtual   #36  <Method FileChannel FileInputStream.getChannel()>
	//   17   36:putfield        #38  <Field FileChannel channel>
			return;
	//   18   39:return          
		} else
		{
			throw new IllegalArgumentException("File is null or does not exist");
	//   19   40:new             #40  <Class IllegalArgumentException>
	//   20   43:dup             
	//   21   44:ldc1            #42  <String "File is null or does not exist">
	//   22   46:invokespecial   #45  <Method void IllegalArgumentException(String)>
	//   23   49:athrow          
		}
	}

	private long offsetFromVma(Elf.Header header, long l, long l1)
		throws IOException
	{
		for(long l2 = 0L; l2 < l; l2++)
	//*   0    0:lconst_0        
	//*   1    1:lstore          6
	//*   2    3:lload           6
	//*   3    5:lload_2         
	//*   4    6:lcmp            
	//*   5    7:ifge            80
		{
			Elf.ProgramHeader programheader = header.getProgramHeader(l2);
	//    6   10:aload_1         
	//    7   11:lload           6
	//    8   13:invokevirtual   #57  <Method Elf$ProgramHeader Elf$Header.getProgramHeader(long)>
	//    9   16:astore          8
			if(programheader.type == 1L && programheader.vaddr <= l1 && l1 <= programheader.vaddr + programheader.memsz)
	//*  10   18:aload           8
	//*  11   20:getfield        #63  <Field long Elf$ProgramHeader.type>
	//*  12   23:lconst_1        
	//*  13   24:lcmp            
	//*  14   25:ifne            71
	//*  15   28:aload           8
	//*  16   30:getfield        #66  <Field long Elf$ProgramHeader.vaddr>
	//*  17   33:lload           4
	//*  18   35:lcmp            
	//*  19   36:ifgt            71
	//*  20   39:lload           4
	//*  21   41:aload           8
	//*  22   43:getfield        #66  <Field long Elf$ProgramHeader.vaddr>
	//*  23   46:aload           8
	//*  24   48:getfield        #69  <Field long Elf$ProgramHeader.memsz>
	//*  25   51:ladd            
	//*  26   52:lcmp            
	//*  27   53:ifgt            71
				return (l1 - programheader.vaddr) + programheader.offset;
	//   28   56:lload           4
	//   29   58:aload           8
	//   30   60:getfield        #66  <Field long Elf$ProgramHeader.vaddr>
	//   31   63:lsub            
	//   32   64:aload           8
	//   33   66:getfield        #72  <Field long Elf$ProgramHeader.offset>
	//   34   69:ladd            
	//   35   70:lreturn         
		}

	//   36   71:lload           6
	//   37   73:lconst_1        
	//   38   74:ladd            
	//   39   75:lstore          6
	//*  40   77:goto            3
		throw new IllegalStateException("Could not map vma to file offset!");
	//   41   80:new             #74  <Class IllegalStateException>
	//   42   83:dup             
	//   43   84:ldc1            #76  <String "Could not map vma to file offset!">
	//   44   86:invokespecial   #77  <Method void IllegalStateException(String)>
	//   45   89:athrow          
	}

	public void close()
		throws IOException
	{
		channel.close();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field FileChannel channel>
	//    2    4:invokevirtual   #82  <Method void FileChannel.close()>
	//    3    7:return          
	}

	public Elf.Header parseHeader()
		throws IOException
	{
		channel.position(0L);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field FileChannel channel>
	//    2    4:lconst_0        
	//    3    5:invokevirtual   #88  <Method FileChannel FileChannel.position(long)>
	//    4    8:pop             
		ByteBuffer bytebuffer = ByteBuffer.allocate(8);
	//    5    9:bipush          8
	//    6   11:invokestatic    #94  <Method ByteBuffer ByteBuffer.allocate(int)>
	//    7   14:astore_3        
		bytebuffer.order(ByteOrder.LITTLE_ENDIAN);
	//    8   15:aload_3         
	//    9   16:getstatic       #100 <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//   10   19:invokevirtual   #104 <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   11   22:pop             
		if(readWord(bytebuffer, 0L) != 0x464c457fL)
	//*  12   23:aload_0         
	//*  13   24:aload_3         
	//*  14   25:lconst_0        
	//*  15   26:invokevirtual   #108 <Method long readWord(ByteBuffer, long)>
	//*  16   29:ldc2w           #109 <Long 0x464c457fL>
	//*  17   32:lcmp            
	//*  18   33:ifeq            46
			throw new IllegalArgumentException("Invalid ELF Magic!");
	//   19   36:new             #40  <Class IllegalArgumentException>
	//   20   39:dup             
	//   21   40:ldc1            #112 <String "Invalid ELF Magic!">
	//   22   42:invokespecial   #45  <Method void IllegalArgumentException(String)>
	//   23   45:athrow          
		short word0 = readByte(bytebuffer, 4L);
	//   24   46:aload_0         
	//   25   47:aload_3         
	//   26   48:ldc2w           #113 <Long 4L>
	//   27   51:invokevirtual   #118 <Method short readByte(ByteBuffer, long)>
	//   28   54:istore_1        
		boolean flag;
		if(readByte(bytebuffer, 5L) == 2)
	//*  29   55:aload_0         
	//*  30   56:aload_3         
	//*  31   57:ldc2w           #119 <Long 5L>
	//*  32   60:invokevirtual   #118 <Method short readByte(ByteBuffer, long)>
	//*  33   63:iconst_2        
	//*  34   64:icmpne          72
			flag = true;
	//   35   67:iconst_1        
	//   36   68:istore_2        
		else
	//*  37   69:goto            74
			flag = false;
	//   38   72:iconst_0        
	//   39   73:istore_2        
		if(word0 == 1)
	//*  40   74:iload_1         
	//*  41   75:iconst_1        
	//*  42   76:icmpne          89
			return ((Elf.Header) (new Elf32Header(flag, this)));
	//   43   79:new             #122 <Class Elf32Header>
	//   44   82:dup             
	//   45   83:iload_2         
	//   46   84:aload_0         
	//   47   85:invokespecial   #125 <Method void Elf32Header(boolean, ElfParser)>
	//   48   88:areturn         
		if(word0 == 2)
	//*  49   89:iload_1         
	//*  50   90:iconst_2        
	//*  51   91:icmpne          104
			return ((Elf.Header) (new Elf64Header(flag, this)));
	//   52   94:new             #127 <Class Elf64Header>
	//   53   97:dup             
	//   54   98:iload_2         
	//   55   99:aload_0         
	//   56  100:invokespecial   #128 <Method void Elf64Header(boolean, ElfParser)>
	//   57  103:areturn         
		else
			throw new IllegalStateException("Invalid class type!");
	//   58  104:new             #74  <Class IllegalStateException>
	//   59  107:dup             
	//   60  108:ldc1            #130 <String "Invalid class type!">
	//   61  110:invokespecial   #77  <Method void IllegalStateException(String)>
	//   62  113:athrow          
	}

	public List parseNeededDependencies()
		throws IOException
	{
		int i;
		long l;
		long l1;
		ArrayList arraylist;
		ByteBuffer bytebuffer;
		Elf.Header header;
label0:
		{
			channel.position(0L);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field FileChannel channel>
	//    2    4:lconst_0        
	//    3    5:invokevirtual   #88  <Method FileChannel FileChannel.position(long)>
	//    4    8:pop             
			arraylist = new ArrayList();
	//    5    9:new             #134 <Class ArrayList>
	//    6   12:dup             
	//    7   13:invokespecial   #135 <Method void ArrayList()>
	//    8   16:astore          9
			header = parseHeader();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #137 <Method Elf$Header parseHeader()>
	//   11   22:astore          11
			bytebuffer = ByteBuffer.allocate(8);
	//   12   24:bipush          8
	//   13   26:invokestatic    #94  <Method ByteBuffer ByteBuffer.allocate(int)>
	//   14   29:astore          10
			ByteOrder byteorder;
			if(header.bigEndian)
	//*  15   31:aload           11
	//*  16   33:getfield        #141 <Field boolean Elf$Header.bigEndian>
	//*  17   36:ifeq            47
				byteorder = ByteOrder.BIG_ENDIAN;
	//   18   39:getstatic       #144 <Field ByteOrder ByteOrder.BIG_ENDIAN>
	//   19   42:astore          8
			else
	//*  20   44:goto            52
				byteorder = ByteOrder.LITTLE_ENDIAN;
	//   21   47:getstatic       #100 <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//   22   50:astore          8
			bytebuffer.order(byteorder);
	//   23   52:aload           10
	//   24   54:aload           8
	//   25   56:invokevirtual   #104 <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   26   59:pop             
			l1 = header.phnum;
	//   27   60:aload           11
	//   28   62:getfield        #147 <Field int Elf$Header.phnum>
	//   29   65:i2l             
	//   30   66:lstore          4
			i = 0;
	//   31   68:iconst_0        
	//   32   69:istore_1        
			l = l1;
	//   33   70:lload           4
	//   34   72:lstore_2        
			if(l1 == 65535L)
	//*  35   73:lload           4
	//*  36   75:ldc2w           #148 <Long 65535L>
	//*  37   78:lcmp            
	//*  38   79:ifne            92
				l = header.getSectionHeader(0).info;
	//   39   82:aload           11
	//   40   84:iconst_0        
	//   41   85:invokevirtual   #153 <Method Elf$SectionHeader Elf$Header.getSectionHeader(int)>
	//   42   88:getfield        #158 <Field long Elf$SectionHeader.info>
	//   43   91:lstore_2        
			l1 = 0L;
	//   44   92:lconst_0        
	//   45   93:lstore          4
			do
			{
				if(l1 >= l)
					break;
	//   46   95:lload           4
	//   47   97:lload_2         
	//   48   98:lcmp            
	//   49   99:ifge            142
				Elf.ProgramHeader programheader = header.getProgramHeader(l1);
	//   50  102:aload           11
	//   51  104:lload           4
	//   52  106:invokevirtual   #57  <Method Elf$ProgramHeader Elf$Header.getProgramHeader(long)>
	//   53  109:astore          8
				if(programheader.type == 2L)
	//*  54  111:aload           8
	//*  55  113:getfield        #63  <Field long Elf$ProgramHeader.type>
	//*  56  116:ldc2w           #159 <Long 2L>
	//*  57  119:lcmp            
	//*  58  120:ifne            133
				{
					l1 = programheader.offset;
	//   59  123:aload           8
	//   60  125:getfield        #72  <Field long Elf$ProgramHeader.offset>
	//   61  128:lstore          4
					break label0;
	//   62  130:goto            145
				}
				l1++;
	//   63  133:lload           4
	//   64  135:lconst_1        
	//   65  136:ladd            
	//   66  137:lstore          4
			} while(true);
	//   67  139:goto            95
			l1 = 0L;
	//   68  142:lconst_0        
	//   69  143:lstore          4
		}
		if(l1 == 0L)
	//*  70  145:lload           4
	//*  71  147:lconst_0        
	//*  72  148:lcmp            
	//*  73  149:ifne            158
			return Collections.unmodifiableList(((List) (arraylist)));
	//   74  152:aload           9
	//   75  154:invokestatic    #166 <Method List Collections.unmodifiableList(List)>
	//   76  157:areturn         
		Object obj = ((Object) (new ArrayList()));
	//   77  158:new             #134 <Class ArrayList>
	//   78  161:dup             
	//   79  162:invokespecial   #135 <Method void ArrayList()>
	//   80  165:astore          8
		long l2 = 0L;
	//   81  167:lconst_0        
	//   82  168:lstore          6
		Elf.DynamicStructure dynamicstructure;
		do
		{
			dynamicstructure = header.getDynamicStructure(l1, i);
	//   83  170:aload           11
	//   84  172:lload           4
	//   85  174:iload_1         
	//   86  175:invokevirtual   #170 <Method Elf$DynamicStructure Elf$Header.getDynamicStructure(long, int)>
	//   87  178:astore          12
			if(dynamicstructure.tag == 1L)
	//*  88  180:aload           12
	//*  89  182:getfield        #175 <Field long Elf$DynamicStructure.tag>
	//*  90  185:lconst_1        
	//*  91  186:lcmp            
	//*  92  187:ifne            209
				((List) (obj)).add(((Object) (Long.valueOf(dynamicstructure.val))));
	//   93  190:aload           8
	//   94  192:aload           12
	//   95  194:getfield        #178 <Field long Elf$DynamicStructure.val>
	//   96  197:invokestatic    #184 <Method Long Long.valueOf(long)>
	//   97  200:invokeinterface #190 <Method boolean List.add(Object)>
	//   98  205:pop             
			else
	//*  99  206:goto            228
			if(dynamicstructure.tag == 5L)
	//* 100  209:aload           12
	//* 101  211:getfield        #175 <Field long Elf$DynamicStructure.tag>
	//* 102  214:ldc2w           #119 <Long 5L>
	//* 103  217:lcmp            
	//* 104  218:ifne            228
				l2 = dynamicstructure.val;
	//  105  221:aload           12
	//  106  223:getfield        #178 <Field long Elf$DynamicStructure.val>
	//  107  226:lstore          6
			i++;
	//  108  228:iload_1         
	//  109  229:iconst_1        
	//  110  230:iadd            
	//  111  231:istore_1        
		} while(dynamicstructure.tag != 0L);
	//  112  232:aload           12
	//  113  234:getfield        #175 <Field long Elf$DynamicStructure.tag>
	//  114  237:lconst_0        
	//  115  238:lcmp            
	//  116  239:ifne            323
		if(l2 == 0L)
	//* 117  242:lload           6
	//* 118  244:lconst_0        
	//* 119  245:lcmp            
	//* 120  246:ifne            259
			throw new IllegalStateException("String table offset not found!");
	//  121  249:new             #74  <Class IllegalStateException>
	//  122  252:dup             
	//  123  253:ldc1            #192 <String "String table offset not found!">
	//  124  255:invokespecial   #77  <Method void IllegalStateException(String)>
	//  125  258:athrow          
		l = offsetFromVma(header, l, l2);
	//  126  259:aload_0         
	//  127  260:aload           11
	//  128  262:lload_2         
	//  129  263:lload           6
	//  130  265:invokespecial   #194 <Method long offsetFromVma(Elf$Header, long, long)>
	//  131  268:lstore_2        
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((List) (arraylist)).add(((Object) (readString(bytebuffer, l + ((Long)((Iterator) (obj)).next()).longValue())))));
	//  132  269:aload           8
	//  133  271:invokeinterface #198 <Method Iterator List.iterator()>
	//  134  276:astore          8
	//  135  278:aload           8
	//  136  280:invokeinterface #203 <Method boolean Iterator.hasNext()>
	//  137  285:ifeq            320
	//  138  288:aload           9
	//  139  290:aload_0         
	//  140  291:aload           10
	//  141  293:lload_2         
	//  142  294:aload           8
	//  143  296:invokeinterface #207 <Method Object Iterator.next()>
	//  144  301:checkcast       #180 <Class Long>
	//  145  304:invokevirtual   #211 <Method long Long.longValue()>
	//  146  307:ladd            
	//  147  308:invokevirtual   #215 <Method String readString(ByteBuffer, long)>
	//  148  311:invokeinterface #190 <Method boolean List.add(Object)>
	//  149  316:pop             
	//* 150  317:goto            278
		return ((List) (arraylist));
	//  151  320:aload           9
	//  152  322:areturn         
	//* 153  323:goto            170
	}

	protected void read(ByteBuffer bytebuffer, long l, int i)
		throws IOException
	{
		bytebuffer.position(0);
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #222 <Method java.nio.Buffer ByteBuffer.position(int)>
	//    3    5:pop             
		bytebuffer.limit(i);
	//    4    6:aload_1         
	//    5    7:iload           4
	//    6    9:invokevirtual   #225 <Method java.nio.Buffer ByteBuffer.limit(int)>
	//    7   12:pop             
		int j;
		for(long l1 = 0L; l1 < (long)i; l1 += j)
	//*   8   13:lconst_0        
	//*   9   14:lstore          6
	//*  10   16:lload           6
	//*  11   18:iload           4
	//*  12   20:i2l             
	//*  13   21:lcmp            
	//*  14   22:ifge            64
		{
			j = channel.read(bytebuffer, l + l1);
	//   15   25:aload_0         
	//   16   26:getfield        #38  <Field FileChannel channel>
	//   17   29:aload_1         
	//   18   30:lload_2         
	//   19   31:lload           6
	//   20   33:ladd            
	//   21   34:invokevirtual   #228 <Method int FileChannel.read(ByteBuffer, long)>
	//   22   37:istore          5
			if(j == -1)
	//*  23   39:iload           5
	//*  24   41:iconst_m1       
	//*  25   42:icmpne          53
				throw new EOFException();
	//   26   45:new             #230 <Class EOFException>
	//   27   48:dup             
	//   28   49:invokespecial   #231 <Method void EOFException()>
	//   29   52:athrow          
		}

	//   30   53:lload           6
	//   31   55:iload           5
	//   32   57:i2l             
	//   33   58:ladd            
	//   34   59:lstore          6
	//*  35   61:goto            16
		bytebuffer.position(0);
	//   36   64:aload_1         
	//   37   65:iconst_0        
	//   38   66:invokevirtual   #222 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   39   69:pop             
	//   40   70:return          
	}

	protected short readByte(ByteBuffer bytebuffer, long l)
		throws IOException
	{
		read(bytebuffer, l, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:iconst_1        
	//    4    4:invokevirtual   #233 <Method void read(ByteBuffer, long, int)>
		return (short)(bytebuffer.get() & 0xff);
	//    5    7:aload_1         
	//    6    8:invokevirtual   #237 <Method byte ByteBuffer.get()>
	//    7   11:sipush          255
	//    8   14:iand            
	//    9   15:int2short       
	//   10   16:ireturn         
	}

	protected int readHalf(ByteBuffer bytebuffer, long l)
		throws IOException
	{
		read(bytebuffer, l, 2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:iconst_2        
	//    4    4:invokevirtual   #233 <Method void read(ByteBuffer, long, int)>
		return bytebuffer.getShort() & 0xffff;
	//    5    7:aload_1         
	//    6    8:invokevirtual   #242 <Method short ByteBuffer.getShort()>
	//    7   11:ldc1            #243 <Int 65535>
	//    8   13:iand            
	//    9   14:ireturn         
	}

	protected long readLong(ByteBuffer bytebuffer, long l)
		throws IOException
	{
		read(bytebuffer, l, 8);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:bipush          8
	//    4    5:invokevirtual   #233 <Method void read(ByteBuffer, long, int)>
		return bytebuffer.getLong();
	//    5    8:aload_1         
	//    6    9:invokevirtual   #247 <Method long ByteBuffer.getLong()>
	//    7   12:lreturn         
	}

	protected String readString(ByteBuffer bytebuffer, long l)
		throws IOException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #249 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #250 <Method void StringBuilder()>
	//    3    7:astore          5
		do
		{
			short word0 = readByte(bytebuffer, l);
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:lload_2         
	//    7   12:invokevirtual   #118 <Method short readByte(ByteBuffer, long)>
	//    8   15:istore          4
			if(word0 != 0)
	//*   9   17:iload           4
	//*  10   19:ifeq            38
			{
				stringbuilder.append((char)word0);
	//   11   22:aload           5
	//   12   24:iload           4
	//   13   26:int2char        
	//   14   27:invokevirtual   #254 <Method StringBuilder StringBuilder.append(char)>
	//   15   30:pop             
				l++;
	//   16   31:lload_2         
	//   17   32:lconst_1        
	//   18   33:ladd            
	//   19   34:lstore_2        
			} else
	//*  20   35:goto            9
			{
				return stringbuilder.toString();
	//   21   38:aload           5
	//   22   40:invokevirtual   #258 <Method String StringBuilder.toString()>
	//   23   43:areturn         
			}
		} while(true);
	}

	protected long readWord(ByteBuffer bytebuffer, long l)
		throws IOException
	{
		read(bytebuffer, l, 4);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:iconst_4        
	//    4    4:invokevirtual   #233 <Method void read(ByteBuffer, long, int)>
		return (long)bytebuffer.getInt() & 0xffffffffL;
	//    5    7:aload_1         
	//    6    8:invokevirtual   #262 <Method int ByteBuffer.getInt()>
	//    7   11:i2l             
	//    8   12:ldc2w           #263 <Long 0xffffffffL>
	//    9   15:land            
	//   10   16:lreturn         
	}

	private final int MAGIC = 0x464c457f;
	private final FileChannel channel;
}
