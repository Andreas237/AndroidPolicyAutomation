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
label0:
			{
				if(i != -1)
	//*  25   45:iload_2         
	//*  26   46:iconst_m1       
	//*  27   47:icmpeq          69
				{
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
					if(l != 0L)
						break label0;
	//   38   63:lload_3         
	//   39   64:lconst_0        
	//   40   65:lcmp            
	//   41   66:ifne            75
				}
				return crc32.getValue();
	//   42   69:aload           5
	//   43   71:invokevirtual   #59  <Method long CRC32.getValue()>
	//   44   74:lreturn         
			}
			i = randomaccessfile.read(((byte []) (centraldirectory)), 0, (int)Math.min(16384L, l));
	//   45   75:aload_0         
	//   46   76:aload_1         
	//   47   77:iconst_0        
	//   48   78:ldc2w           #40  <Long 16384L>
	//   49   81:lload_3         
	//   50   82:invokestatic    #47  <Method long Math.min(long, long)>
	//   51   85:l2i             
	//   52   86:invokevirtual   #51  <Method int RandomAccessFile.read(byte[], int, int)>
	//   53   89:istore_2        
		} while(true);
	//   54   90:goto            45
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
		if(l1 < 0L)
	//*   5   10:lload           4
	//*   6   12:lconst_0        
	//*   7   13:lcmp            
	//*   8   14:ifge            47
			throw new ZipException((new StringBuilder()).append("File too short to be a zip file: ").append(randomaccessfile.length()).toString());
	//    9   17:new             #64  <Class ZipException>
	//   10   20:dup             
	//   11   21:new             #71  <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #72  <Method void StringBuilder()>
	//   14   28:ldc1            #74  <String "File too short to be a zip file: ">
	//   15   30:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:aload_0         
	//   17   34:invokevirtual   #67  <Method long RandomAccessFile.length()>
	//   18   37:invokevirtual   #81  <Method StringBuilder StringBuilder.append(long)>
	//   19   40:invokevirtual   #85  <Method String StringBuilder.toString()>
	//   20   43:invokespecial   #88  <Method void ZipException(String)>
	//   21   46:athrow          
		long l2 = l1 - 0x10000L;
	//   22   47:lload           4
	//   23   49:ldc2w           #89  <Long 0x10000L>
	//   24   52:lsub            
	//   25   53:lstore          6
		long l = l2;
	//   26   55:lload           6
	//   27   57:lstore_2        
		if(l2 < 0L)
	//*  28   58:lload           6
	//*  29   60:lconst_0        
	//*  30   61:lcmp            
	//*  31   62:ifge            67
			l = 0L;
	//   32   65:lconst_0        
	//   33   66:lstore_2        
		int i = Integer.reverseBytes(0x6054b50);
	//   34   67:ldc1            #14  <Int 0x6054b50>
	//   35   69:invokestatic    #96  <Method int Integer.reverseBytes(int)>
	//   36   72:istore_1        
		do
		{
			randomaccessfile.seek(l1);
	//   37   73:aload_0         
	//   38   74:lload           4
	//   39   76:invokevirtual   #39  <Method void RandomAccessFile.seek(long)>
			if(randomaccessfile.readInt() == i)
	//*  40   79:aload_0         
	//*  41   80:invokevirtual   #100 <Method int RandomAccessFile.readInt()>
	//*  42   83:iload_1         
	//*  43   84:icmpne          157
			{
				randomaccessfile.skipBytes(2);
	//   44   87:aload_0         
	//   45   88:iconst_2        
	//   46   89:invokevirtual   #103 <Method int RandomAccessFile.skipBytes(int)>
	//   47   92:pop             
				randomaccessfile.skipBytes(2);
	//   48   93:aload_0         
	//   49   94:iconst_2        
	//   50   95:invokevirtual   #103 <Method int RandomAccessFile.skipBytes(int)>
	//   51   98:pop             
				randomaccessfile.skipBytes(2);
	//   52   99:aload_0         
	//   53  100:iconst_2        
	//   54  101:invokevirtual   #103 <Method int RandomAccessFile.skipBytes(int)>
	//   55  104:pop             
				randomaccessfile.skipBytes(2);
	//   56  105:aload_0         
	//   57  106:iconst_2        
	//   58  107:invokevirtual   #103 <Method int RandomAccessFile.skipBytes(int)>
	//   59  110:pop             
				CentralDirectory centraldirectory = new CentralDirectory();
	//   60  111:new             #6   <Class ZipUtil$CentralDirectory>
	//   61  114:dup             
	//   62  115:invokespecial   #104 <Method void ZipUtil$CentralDirectory()>
	//   63  118:astore          8
				centraldirectory.size = (long)Integer.reverseBytes(randomaccessfile.readInt()) & 0xffffffffL;
	//   64  120:aload           8
	//   65  122:aload_0         
	//   66  123:invokevirtual   #100 <Method int RandomAccessFile.readInt()>
	//   67  126:invokestatic    #96  <Method int Integer.reverseBytes(int)>
	//   68  129:i2l             
	//   69  130:ldc2w           #105 <Long 0xffffffffL>
	//   70  133:land            
	//   71  134:putfield        #30  <Field long ZipUtil$CentralDirectory.size>
				centraldirectory.offset = (long)Integer.reverseBytes(randomaccessfile.readInt()) & 0xffffffffL;
	//   72  137:aload           8
	//   73  139:aload_0         
	//   74  140:invokevirtual   #100 <Method int RandomAccessFile.readInt()>
	//   75  143:invokestatic    #96  <Method int Integer.reverseBytes(int)>
	//   76  146:i2l             
	//   77  147:ldc2w           #105 <Long 0xffffffffL>
	//   78  150:land            
	//   79  151:putfield        #33  <Field long ZipUtil$CentralDirectory.offset>
				return centraldirectory;
	//   80  154:aload           8
	//   81  156:areturn         
			}
			l2 = l1 - 1L;
	//   82  157:lload           4
	//   83  159:lconst_1        
	//   84  160:lsub            
	//   85  161:lstore          6
			l1 = l2;
	//   86  163:lload           6
	//   87  165:lstore          4
		} while(l2 >= l);
	//   88  167:lload           6
	//   89  169:lload_2         
	//   90  170:lcmp            
	//   91  171:ifge            73
		throw new ZipException("End Of Central Directory signature not found");
	//   92  174:new             #64  <Class ZipException>
	//   93  177:dup             
	//   94  178:ldc1            #108 <String "End Of Central Directory signature not found">
	//   95  180:invokespecial   #88  <Method void ZipException(String)>
	//   96  183:athrow          
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
