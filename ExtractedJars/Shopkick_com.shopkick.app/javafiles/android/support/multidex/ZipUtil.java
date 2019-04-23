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
		if(l1 >= 0L)
	//*   7   12:lload           4
	//*   8   14:lconst_0        
	//*   9   15:lcmp            
	//*  10   16:iflt            156
		{
			long l2 = l1 - 0x10000L;
	//   11   19:lload           4
	//   12   21:ldc2w           #70  <Long 0x10000L>
	//   13   24:lsub            
	//   14   25:lstore          6
			if(l2 >= 0L)
	//*  15   27:lload           6
	//*  16   29:lconst_0        
	//*  17   30:lcmp            
	//*  18   31:ifge            37
	//*  19   34:goto            40
				l = l2;
	//   20   37:lload           6
	//   21   39:lstore_2        
			int i = Integer.reverseBytes(0x6054b50);
	//   22   40:ldc1            #14  <Int 0x6054b50>
	//   23   42:invokestatic    #77  <Method int Integer.reverseBytes(int)>
	//   24   45:istore_1        
			do
			{
				randomaccessfile.seek(l1);
	//   25   46:aload_0         
	//   26   47:lload           4
	//   27   49:invokevirtual   #39  <Method void RandomAccessFile.seek(long)>
				if(randomaccessfile.readInt() == i)
	//*  28   52:aload_0         
	//*  29   53:invokevirtual   #81  <Method int RandomAccessFile.readInt()>
	//*  30   56:iload_1         
	//*  31   57:icmpne          130
				{
					randomaccessfile.skipBytes(2);
	//   32   60:aload_0         
	//   33   61:iconst_2        
	//   34   62:invokevirtual   #84  <Method int RandomAccessFile.skipBytes(int)>
	//   35   65:pop             
					randomaccessfile.skipBytes(2);
	//   36   66:aload_0         
	//   37   67:iconst_2        
	//   38   68:invokevirtual   #84  <Method int RandomAccessFile.skipBytes(int)>
	//   39   71:pop             
					randomaccessfile.skipBytes(2);
	//   40   72:aload_0         
	//   41   73:iconst_2        
	//   42   74:invokevirtual   #84  <Method int RandomAccessFile.skipBytes(int)>
	//   43   77:pop             
					randomaccessfile.skipBytes(2);
	//   44   78:aload_0         
	//   45   79:iconst_2        
	//   46   80:invokevirtual   #84  <Method int RandomAccessFile.skipBytes(int)>
	//   47   83:pop             
					CentralDirectory centraldirectory = new CentralDirectory();
	//   48   84:new             #6   <Class ZipUtil$CentralDirectory>
	//   49   87:dup             
	//   50   88:invokespecial   #85  <Method void ZipUtil$CentralDirectory()>
	//   51   91:astore          8
					centraldirectory.size = (long)Integer.reverseBytes(randomaccessfile.readInt()) & 0xffffffffL;
	//   52   93:aload           8
	//   53   95:aload_0         
	//   54   96:invokevirtual   #81  <Method int RandomAccessFile.readInt()>
	//   55   99:invokestatic    #77  <Method int Integer.reverseBytes(int)>
	//   56  102:i2l             
	//   57  103:ldc2w           #86  <Long 0xffffffffL>
	//   58  106:land            
	//   59  107:putfield        #30  <Field long ZipUtil$CentralDirectory.size>
					centraldirectory.offset = (long)Integer.reverseBytes(randomaccessfile.readInt()) & 0xffffffffL;
	//   60  110:aload           8
	//   61  112:aload_0         
	//   62  113:invokevirtual   #81  <Method int RandomAccessFile.readInt()>
	//   63  116:invokestatic    #77  <Method int Integer.reverseBytes(int)>
	//   64  119:i2l             
	//   65  120:ldc2w           #86  <Long 0xffffffffL>
	//   66  123:land            
	//   67  124:putfield        #33  <Field long ZipUtil$CentralDirectory.offset>
					return centraldirectory;
	//   68  127:aload           8
	//   69  129:areturn         
				}
				l1--;
	//   70  130:lload           4
	//   71  132:lconst_1        
	//   72  133:lsub            
	//   73  134:lstore          4
			} while(l1 >= l);
	//   74  136:lload           4
	//   75  138:lload_2         
	//   76  139:lcmp            
	//   77  140:iflt            146
	//*  78  143:goto            46
			throw new ZipException("End Of Central Directory signature not found");
	//   79  146:new             #64  <Class ZipException>
	//   80  149:dup             
	//   81  150:ldc1            #89  <String "End Of Central Directory signature not found">
	//   82  152:invokespecial   #92  <Method void ZipException(String)>
	//   83  155:athrow          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   84  156:new             #94  <Class StringBuilder>
	//   85  159:dup             
	//   86  160:invokespecial   #95  <Method void StringBuilder()>
	//   87  163:astore          8
			stringbuilder.append("File too short to be a zip file: ");
	//   88  165:aload           8
	//   89  167:ldc1            #97  <String "File too short to be a zip file: ">
	//   90  169:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   91  172:pop             
			stringbuilder.append(randomaccessfile.length());
	//   92  173:aload           8
	//   93  175:aload_0         
	//   94  176:invokevirtual   #67  <Method long RandomAccessFile.length()>
	//   95  179:invokevirtual   #104 <Method StringBuilder StringBuilder.append(long)>
	//   96  182:pop             
			throw new ZipException(stringbuilder.toString());
	//   97  183:new             #64  <Class ZipException>
	//   98  186:dup             
	//   99  187:aload           8
	//  100  189:invokevirtual   #108 <Method String StringBuilder.toString()>
	//  101  192:invokespecial   #92  <Method void ZipException(String)>
	//  102  195:athrow          
		}
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
