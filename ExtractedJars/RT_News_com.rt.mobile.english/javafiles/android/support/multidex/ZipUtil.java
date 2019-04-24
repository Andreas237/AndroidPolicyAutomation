// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.multidex;

import java.io.*;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

final class ZipUtil
{
	static class CentralDirectory
	{

		long offset;
		long size;

		CentralDirectory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}


	ZipUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	static long computeCrcOfCentralDir(RandomAccessFile randomaccessfile, CentralDirectory centraldirectory)
		throws IOException
	{
		CRC32 crc32 = new CRC32();
	//    0    0:new             #25  <Class CRC32>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void CRC32()>
	//    3    7:astore          5
		long l = centraldirectory.size;
	//    4    9:aload_1         
	//    5   10:getfield        #30  <Field long ZipUtil$CentralDirectory.size>
	//    6   13:lstore_3        
		randomaccessfile.seek(centraldirectory.offset);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:getfield        #33  <Field long ZipUtil$CentralDirectory.offset>
	//   10   19:invokevirtual   #39  <Method void RandomAccessFile.seek(long)>
		int i = (int)Math.min(16384L, l);
	//   11   22:ldc2w           #40  <Long 16384L>
	//   12   25:lload_3         
	//   13   26:invokestatic    #47  <Method long Math.min(long, long)>
	//   14   29:l2i             
	//   15   30:istore_2        
		centraldirectory = ((CentralDirectory) (new byte[16384]));
	//   16   31:sipush          16384
	//   17   34:newarray        byte[]
	//   18   36:astore_1        
		i = randomaccessfile.read(((byte []) (centraldirectory)), 0, i);
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:iconst_0        
	//   22   40:iload_2         
	//   23   41:invokevirtual   #51  <Method int RandomAccessFile.read(byte[], int, int)>
	//   24   44:istore_2        
		do
		{
			if(i == -1)
				break;
	//   25   45:iload_2         
	//   26   46:iconst_m1       
	//   27   47:icmpeq          90
			crc32.update(((byte []) (centraldirectory)), 0, i);
	//   28   50:aload           5
	//   29   52:aload_1         
	//   30   53:iconst_0        
	//   31   54:iload_2         
	//   32   55:invokevirtual   #55  <Method void CRC32.update(byte[], int, int)>
			l -= i;
	//   33   58:lload_3         
	//   34   59:iload_2         
	//   35   60:i2l             
	//   36   61:lsub            
	//   37   62:lstore_3        
			if(l == 0L)
	//*  38   63:lload_3         
	//*  39   64:lconst_0        
	//*  40   65:lcmp            
	//*  41   66:ifne            72
				break;
	//   42   69:goto            90
			i = randomaccessfile.read(((byte []) (centraldirectory)), 0, (int)Math.min(16384L, l));
	//   43   72:aload_0         
	//   44   73:aload_1         
	//   45   74:iconst_0        
	//   46   75:ldc2w           #40  <Long 16384L>
	//   47   78:lload_3         
	//   48   79:invokestatic    #47  <Method long Math.min(long, long)>
	//   49   82:l2i             
	//   50   83:invokevirtual   #51  <Method int RandomAccessFile.read(byte[], int, int)>
	//   51   86:istore_2        
		} while(true);
	//   52   87:goto            45
		return crc32.getValue();
	//   53   90:aload           5
	//   54   92:invokevirtual   #59  <Method long CRC32.getValue()>
	//   55   95:lreturn         
	}

	static CentralDirectory findCentralDirectory(RandomAccessFile randomaccessfile)
		throws IOException, ZipException
	{
		long l1 = randomaccessfile.length() - 22L;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #67  <Method long RandomAccessFile.length()>
	//    2    4:ldc2w           #68  <Long 22L>
	//    3    7:lsub            
	//    4    8:lstore          4
		long l = 0L;
	//    5   10:lconst_0        
	//    6   11:lstore_2        
		if(l1 < 0L)
	//*   7   12:lload           4
	//*   8   14:lconst_0        
	//*   9   15:lcmp            
	//*  10   16:ifge            59
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   19:new             #71  <Class StringBuilder>
	//   12   22:dup             
	//   13   23:invokespecial   #72  <Method void StringBuilder()>
	//   14   26:astore          8
			stringbuilder.append("File too short to be a zip file: ");
	//   15   28:aload           8
	//   16   30:ldc1            #74  <String "File too short to be a zip file: ">
	//   17   32:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
			stringbuilder.append(randomaccessfile.length());
	//   19   36:aload           8
	//   20   38:aload_0         
	//   21   39:invokevirtual   #67  <Method long RandomAccessFile.length()>
	//   22   42:invokevirtual   #81  <Method StringBuilder StringBuilder.append(long)>
	//   23   45:pop             
			throw new ZipException(stringbuilder.toString());
	//   24   46:new             #64  <Class ZipException>
	//   25   49:dup             
	//   26   50:aload           8
	//   27   52:invokevirtual   #85  <Method String StringBuilder.toString()>
	//   28   55:invokespecial   #88  <Method void ZipException(String)>
	//   29   58:athrow          
		}
		long l2 = l1 - 0x10000L;
	//   30   59:lload           4
	//   31   61:ldc2w           #89  <Long 0x10000L>
	//   32   64:lsub            
	//   33   65:lstore          6
		if(l2 >= 0L)
	//*  34   67:lload           6
	//*  35   69:lconst_0        
	//*  36   70:lcmp            
	//*  37   71:ifge            77
	//*  38   74:goto            80
			l = l2;
	//   39   77:lload           6
	//   40   79:lstore_2        
		int i = Integer.reverseBytes(0x6054b50);
	//   41   80:ldc1            #14  <Int 0x6054b50>
	//   42   82:invokestatic    #96  <Method int Integer.reverseBytes(int)>
	//   43   85:istore_1        
		do
		{
			randomaccessfile.seek(l1);
	//   44   86:aload_0         
	//   45   87:lload           4
	//   46   89:invokevirtual   #39  <Method void RandomAccessFile.seek(long)>
			if(randomaccessfile.readInt() == i)
	//*  47   92:aload_0         
	//*  48   93:invokevirtual   #100 <Method int RandomAccessFile.readInt()>
	//*  49   96:iload_1         
	//*  50   97:icmpne          170
			{
				randomaccessfile.skipBytes(2);
	//   51  100:aload_0         
	//   52  101:iconst_2        
	//   53  102:invokevirtual   #103 <Method int RandomAccessFile.skipBytes(int)>
	//   54  105:pop             
				randomaccessfile.skipBytes(2);
	//   55  106:aload_0         
	//   56  107:iconst_2        
	//   57  108:invokevirtual   #103 <Method int RandomAccessFile.skipBytes(int)>
	//   58  111:pop             
				randomaccessfile.skipBytes(2);
	//   59  112:aload_0         
	//   60  113:iconst_2        
	//   61  114:invokevirtual   #103 <Method int RandomAccessFile.skipBytes(int)>
	//   62  117:pop             
				randomaccessfile.skipBytes(2);
	//   63  118:aload_0         
	//   64  119:iconst_2        
	//   65  120:invokevirtual   #103 <Method int RandomAccessFile.skipBytes(int)>
	//   66  123:pop             
				CentralDirectory centraldirectory = new CentralDirectory();
	//   67  124:new             #6   <Class ZipUtil$CentralDirectory>
	//   68  127:dup             
	//   69  128:invokespecial   #104 <Method void ZipUtil$CentralDirectory()>
	//   70  131:astore          8
				centraldirectory.size = (long)Integer.reverseBytes(randomaccessfile.readInt()) & 0xffffffffL;
	//   71  133:aload           8
	//   72  135:aload_0         
	//   73  136:invokevirtual   #100 <Method int RandomAccessFile.readInt()>
	//   74  139:invokestatic    #96  <Method int Integer.reverseBytes(int)>
	//   75  142:i2l             
	//   76  143:ldc2w           #105 <Long 0xffffffffL>
	//   77  146:land            
	//   78  147:putfield        #30  <Field long ZipUtil$CentralDirectory.size>
				centraldirectory.offset = (long)Integer.reverseBytes(randomaccessfile.readInt()) & 0xffffffffL;
	//   79  150:aload           8
	//   80  152:aload_0         
	//   81  153:invokevirtual   #100 <Method int RandomAccessFile.readInt()>
	//   82  156:invokestatic    #96  <Method int Integer.reverseBytes(int)>
	//   83  159:i2l             
	//   84  160:ldc2w           #105 <Long 0xffffffffL>
	//   85  163:land            
	//   86  164:putfield        #33  <Field long ZipUtil$CentralDirectory.offset>
				return centraldirectory;
	//   87  167:aload           8
	//   88  169:areturn         
			}
			l1--;
	//   89  170:lload           4
	//   90  172:lconst_1        
	//   91  173:lsub            
	//   92  174:lstore          4
		} while(l1 >= l);
	//   93  176:lload           4
	//   94  178:lload_2         
	//   95  179:lcmp            
	//   96  180:ifge            193
		throw new ZipException("End Of Central Directory signature not found");
	//   97  183:new             #64  <Class ZipException>
	//   98  186:dup             
	//   99  187:ldc1            #108 <String "End Of Central Directory signature not found">
	//  100  189:invokespecial   #88  <Method void ZipException(String)>
	//  101  192:athrow          
	//* 102  193:goto            86
	}

	static long getZipCrc(File file)
		throws IOException
	{
		file = ((File) (new RandomAccessFile(file, "r")));
	//    0    0:new             #35  <Class RandomAccessFile>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #112 <String "r">
	//    4    7:invokespecial   #115 <Method void RandomAccessFile(File, String)>
	//    5   10:astore_0        
		long l = computeCrcOfCentralDir(((RandomAccessFile) (file)), findCentralDirectory(((RandomAccessFile) (file))));
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:invokestatic    #117 <Method ZipUtil$CentralDirectory findCentralDirectory(RandomAccessFile)>
	//    9   16:invokestatic    #119 <Method long computeCrcOfCentralDir(RandomAccessFile, ZipUtil$CentralDirectory)>
	//   10   19:lstore_1        
		((RandomAccessFile) (file)).close();
	//   11   20:aload_0         
	//   12   21:invokevirtual   #122 <Method void RandomAccessFile.close()>
		return l;
	//   13   24:lload_1         
	//   14   25:lreturn         
		Exception exception;
		exception;
	//   15   26:astore_3        
		((RandomAccessFile) (file)).close();
	//   16   27:aload_0         
	//   17   28:invokevirtual   #122 <Method void RandomAccessFile.close()>
		throw exception;
	//   18   31:aload_3         
	//   19   32:athrow          
	}

	private static final int BUFFER_SIZE = 16384;
	private static final int ENDHDR = 22;
	private static final int ENDSIG = 0x6054b50;
}
