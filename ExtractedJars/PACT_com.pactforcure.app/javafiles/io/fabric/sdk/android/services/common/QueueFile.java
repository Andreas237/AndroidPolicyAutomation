// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.common;

import java.io.*;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QueueFile
	implements Closeable
{
	static class Element
	{

		public String toString()
		{
			return (new StringBuilder()).append(((Object)this).getClass().getSimpleName()).append("[").append("position = ").append(position).append(", length = ").append(length).append("]").toString();
		//    0    0:new             #33  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #34  <Method void StringBuilder()>
		//    3    7:aload_0         
		//    4    8:invokevirtual   #38  <Method Class Object.getClass()>
		//    5   11:invokevirtual   #43  <Method String Class.getSimpleName()>
		//    6   14:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//    7   17:ldc1            #49  <String "[">
		//    8   19:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//    9   22:ldc1            #51  <String "position = ">
		//   10   24:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//   11   27:aload_0         
		//   12   28:getfield        #27  <Field int position>
		//   13   31:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
		//   14   34:ldc1            #56  <String ", length = ">
		//   15   36:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//   16   39:aload_0         
		//   17   40:getfield        #29  <Field int length>
		//   18   43:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
		//   19   46:ldc1            #58  <String "]">
		//   20   48:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//   21   51:invokevirtual   #60  <Method String StringBuilder.toString()>
		//   22   54:areturn         
		}

		static final int HEADER_LENGTH = 4;
		static final Element NULL = new Element(0, 0);
		final int length;
		final int position;

		static 
		{
		//    0    0:new             #2   <Class QueueFile$Element>
		//    1    3:dup             
		//    2    4:iconst_0        
		//    3    5:iconst_0        
		//    4    6:invokespecial   #20  <Method void QueueFile$Element(int, int)>
		//    5    9:putstatic       #22  <Field QueueFile$Element NULL>
		//*   6   12:return          
		}

		Element(int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			position = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #27  <Field int position>
			length = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #29  <Field int length>
		//    8   14:return          
		}
	}

	private final class ElementInputStream extends InputStream
	{

		public int read()
			throws IOException
		{
			if(remaining == 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #33  <Field int remaining>
		//*   2    4:ifne            9
			{
				return -1;
		//    3    7:iconst_m1       
		//    4    8:ireturn         
			} else
			{
				raf.seek(position);
		//    5    9:aload_0         
		//    6   10:getfield        #16  <Field QueueFile this$0>
		//    7   13:invokestatic    #45  <Method RandomAccessFile QueueFile.access$400(QueueFile)>
		//    8   16:aload_0         
		//    9   17:getfield        #28  <Field int position>
		//   10   20:i2l             
		//   11   21:invokevirtual   #51  <Method void RandomAccessFile.seek(long)>
				int i = raf.read();
		//   12   24:aload_0         
		//   13   25:getfield        #16  <Field QueueFile this$0>
		//   14   28:invokestatic    #45  <Method RandomAccessFile QueueFile.access$400(QueueFile)>
		//   15   31:invokevirtual   #53  <Method int RandomAccessFile.read()>
		//   16   34:istore_1        
				position = wrapPosition(position + 1);
		//   17   35:aload_0         
		//   18   36:aload_0         
		//   19   37:getfield        #16  <Field QueueFile this$0>
		//   20   40:aload_0         
		//   21   41:getfield        #28  <Field int position>
		//   22   44:iconst_1        
		//   23   45:iadd            
		//   24   46:invokestatic    #27  <Method int QueueFile.access$100(QueueFile, int)>
		//   25   49:putfield        #28  <Field int position>
				remaining = remaining - 1;
		//   26   52:aload_0         
		//   27   53:aload_0         
		//   28   54:getfield        #33  <Field int remaining>
		//   29   57:iconst_1        
		//   30   58:isub            
		//   31   59:putfield        #33  <Field int remaining>
				return i;
		//   32   62:iload_1         
		//   33   63:ireturn         
			}
		}

		public int read(byte abyte0[], int i, int j)
			throws IOException
		{
			QueueFile.nonNull(((Object) (abyte0)), "buffer");
		//    0    0:aload_1         
		//    1    1:ldc1            #57  <String "buffer">
		//    2    3:invokestatic    #61  <Method Object QueueFile.access$200(Object, String)>
		//    3    6:pop             
			if((i | j) < 0 || j > abyte0.length - i)
		//*   4    7:iload_2         
		//*   5    8:iload_3         
		//*   6    9:ior             
		//*   7   10:iflt            21
		//*   8   13:iload_3         
		//*   9   14:aload_1         
		//*  10   15:arraylength     
		//*  11   16:iload_2         
		//*  12   17:isub            
		//*  13   18:icmple          29
				throw new ArrayIndexOutOfBoundsException();
		//   14   21:new             #63  <Class ArrayIndexOutOfBoundsException>
		//   15   24:dup             
		//   16   25:invokespecial   #64  <Method void ArrayIndexOutOfBoundsException()>
		//   17   28:athrow          
			if(remaining > 0)
		//*  18   29:aload_0         
		//*  19   30:getfield        #33  <Field int remaining>
		//*  20   33:ifle            100
			{
				int k = j;
		//   21   36:iload_3         
		//   22   37:istore          4
				if(j > remaining)
		//*  23   39:iload_3         
		//*  24   40:aload_0         
		//*  25   41:getfield        #33  <Field int remaining>
		//*  26   44:icmple          53
					k = remaining;
		//   27   47:aload_0         
		//   28   48:getfield        #33  <Field int remaining>
		//   29   51:istore          4
				ringRead(position, abyte0, i, k);
		//   30   53:aload_0         
		//   31   54:getfield        #16  <Field QueueFile this$0>
		//   32   57:aload_0         
		//   33   58:getfield        #28  <Field int position>
		//   34   61:aload_1         
		//   35   62:iload_2         
		//   36   63:iload           4
		//   37   65:invokestatic    #68  <Method void QueueFile.access$300(QueueFile, int, byte[], int, int)>
				position = wrapPosition(position + k);
		//   38   68:aload_0         
		//   39   69:aload_0         
		//   40   70:getfield        #16  <Field QueueFile this$0>
		//   41   73:aload_0         
		//   42   74:getfield        #28  <Field int position>
		//   43   77:iload           4
		//   44   79:iadd            
		//   45   80:invokestatic    #27  <Method int QueueFile.access$100(QueueFile, int)>
		//   46   83:putfield        #28  <Field int position>
				remaining = remaining - k;
		//   47   86:aload_0         
		//   48   87:aload_0         
		//   49   88:getfield        #33  <Field int remaining>
		//   50   91:iload           4
		//   51   93:isub            
		//   52   94:putfield        #33  <Field int remaining>
				return k;
		//   53   97:iload           4
		//   54   99:ireturn         
			} else
			{
				return -1;
		//   55  100:iconst_m1       
		//   56  101:ireturn         
			}
		}

		private int position;
		private int remaining;
		final QueueFile this$0;

		private ElementInputStream(Element element)
		{
			this$0 = QueueFile.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field QueueFile this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void InputStream()>
			position = wrapPosition(element.position + 4);
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:aload_2         
		//    8   12:getfield        #23  <Field int QueueFile$Element.position>
		//    9   15:iconst_4        
		//   10   16:iadd            
		//   11   17:invokestatic    #27  <Method int QueueFile.access$100(QueueFile, int)>
		//   12   20:putfield        #28  <Field int position>
			remaining = element.length;
		//   13   23:aload_0         
		//   14   24:aload_2         
		//   15   25:getfield        #31  <Field int QueueFile$Element.length>
		//   16   28:putfield        #33  <Field int remaining>
		//   17   31:return          
		}

	}

	public static interface ElementReader
	{

		public abstract void read(InputStream inputstream, int i)
			throws IOException;
	}


	public QueueFile(File file)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Object()>
		buffer = new byte[16];
	//    2    4:aload_0         
	//    3    5:bipush          16
	//    4    7:newarray        byte[]
	//    5    9:putfield        #58  <Field byte[] buffer>
		if(!file.exists())
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #64  <Method boolean File.exists()>
	//*   8   16:ifne            23
			initialize(file);
	//    9   19:aload_1         
	//   10   20:invokestatic    #67  <Method void initialize(File)>
		raf = open(file);
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokestatic    #71  <Method RandomAccessFile open(File)>
	//   14   28:putfield        #73  <Field RandomAccessFile raf>
		readHeader();
	//   15   31:aload_0         
	//   16   32:invokespecial   #76  <Method void readHeader()>
	//   17   35:return          
	}

	QueueFile(RandomAccessFile randomaccessfile)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Object()>
		buffer = new byte[16];
	//    2    4:aload_0         
	//    3    5:bipush          16
	//    4    7:newarray        byte[]
	//    5    9:putfield        #58  <Field byte[] buffer>
		raf = randomaccessfile;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #73  <Field RandomAccessFile raf>
		readHeader();
	//    9   17:aload_0         
	//   10   18:invokespecial   #76  <Method void readHeader()>
	//   11   21:return          
	}

	private void expandIfNecessary(int i)
		throws IOException
	{
		int i1 = i + 4;
	//    0    0:iload_1         
	//    1    1:iconst_4        
	//    2    2:iadd            
	//    3    3:istore          5
		i = remainingBytes();
	//    4    5:aload_0         
	//    5    6:invokespecial   #103 <Method int remainingBytes()>
	//    6    9:istore_1        
		if(i >= i1)
	//*   7   10:iload_1         
	//*   8   11:iload           5
	//*   9   13:icmplt          17
			return;
	//   10   16:return          
		int j = fileLength;
	//   11   17:aload_0         
	//   12   18:getfield        #105 <Field int fileLength>
	//   13   21:istore_2        
		int k;
		int l;
		do
		{
			l = i + j;
	//   14   22:iload_1         
	//   15   23:iload_2         
	//   16   24:iadd            
	//   17   25:istore          4
			k = j << 1;
	//   18   27:iload_2         
	//   19   28:iconst_1        
	//   20   29:ishl            
	//   21   30:istore_3        
			j = k;
	//   22   31:iload_3         
	//   23   32:istore_2        
			i = l;
	//   24   33:iload           4
	//   25   35:istore_1        
		} while(l < i1);
	//   26   36:iload           4
	//   27   38:iload           5
	//   28   40:icmplt          22
		setLength(k);
	//   29   43:aload_0         
	//   30   44:iload_3         
	//   31   45:invokespecial   #108 <Method void setLength(int)>
		i = wrapPosition(last.position + 4 + last.length);
	//   32   48:aload_0         
	//   33   49:aload_0         
	//   34   50:getfield        #110 <Field QueueFile$Element last>
	//   35   53:getfield        #113 <Field int QueueFile$Element.position>
	//   36   56:iconst_4        
	//   37   57:iadd            
	//   38   58:aload_0         
	//   39   59:getfield        #110 <Field QueueFile$Element last>
	//   40   62:getfield        #116 <Field int QueueFile$Element.length>
	//   41   65:iadd            
	//   42   66:invokespecial   #84  <Method int wrapPosition(int)>
	//   43   69:istore_1        
		if(i < first.position)
	//*  44   70:iload_1         
	//*  45   71:aload_0         
	//*  46   72:getfield        #118 <Field QueueFile$Element first>
	//*  47   75:getfield        #113 <Field int QueueFile$Element.position>
	//*  48   78:icmpge          133
		{
			FileChannel filechannel = raf.getChannel();
	//   49   81:aload_0         
	//   50   82:getfield        #73  <Field RandomAccessFile raf>
	//   51   85:invokevirtual   #124 <Method FileChannel RandomAccessFile.getChannel()>
	//   52   88:astore          6
			filechannel.position(fileLength);
	//   53   90:aload           6
	//   54   92:aload_0         
	//   55   93:getfield        #105 <Field int fileLength>
	//   56   96:i2l             
	//   57   97:invokevirtual   #129 <Method FileChannel FileChannel.position(long)>
	//   58  100:pop             
			i -= 4;
	//   59  101:iload_1         
	//   60  102:iconst_4        
	//   61  103:isub            
	//   62  104:istore_1        
			if(filechannel.transferTo(16L, i, ((java.nio.channels.WritableByteChannel) (filechannel))) != (long)i)
	//*  63  105:aload           6
	//*  64  107:ldc2w           #130 <Long 16L>
	//*  65  110:iload_1         
	//*  66  111:i2l             
	//*  67  112:aload           6
	//*  68  114:invokevirtual   #135 <Method long FileChannel.transferTo(long, long, java.nio.channels.WritableByteChannel)>
	//*  69  117:iload_1         
	//*  70  118:i2l             
	//*  71  119:lcmp            
	//*  72  120:ifeq            133
				throw new AssertionError("Copied insufficient number of bytes!");
	//   73  123:new             #137 <Class AssertionError>
	//   74  126:dup             
	//   75  127:ldc1            #139 <String "Copied insufficient number of bytes!">
	//   76  129:invokespecial   #142 <Method void AssertionError(Object)>
	//   77  132:athrow          
		}
		if(last.position < first.position)
	//*  78  133:aload_0         
	//*  79  134:getfield        #110 <Field QueueFile$Element last>
	//*  80  137:getfield        #113 <Field int QueueFile$Element.position>
	//*  81  140:aload_0         
	//*  82  141:getfield        #118 <Field QueueFile$Element first>
	//*  83  144:getfield        #113 <Field int QueueFile$Element.position>
	//*  84  147:icmpge          208
		{
			i = (fileLength + last.position) - 16;
	//   85  150:aload_0         
	//   86  151:getfield        #105 <Field int fileLength>
	//   87  154:aload_0         
	//   88  155:getfield        #110 <Field QueueFile$Element last>
	//   89  158:getfield        #113 <Field int QueueFile$Element.position>
	//   90  161:iadd            
	//   91  162:bipush          16
	//   92  164:isub            
	//   93  165:istore_1        
			writeHeader(k, elementCount, first.position, i);
	//   94  166:aload_0         
	//   95  167:iload_3         
	//   96  168:aload_0         
	//   97  169:getfield        #144 <Field int elementCount>
	//   98  172:aload_0         
	//   99  173:getfield        #118 <Field QueueFile$Element first>
	//  100  176:getfield        #113 <Field int QueueFile$Element.position>
	//  101  179:iload_1         
	//  102  180:invokespecial   #148 <Method void writeHeader(int, int, int, int)>
			last = new Element(i, last.length);
	//  103  183:aload_0         
	//  104  184:new             #10  <Class QueueFile$Element>
	//  105  187:dup             
	//  106  188:iload_1         
	//  107  189:aload_0         
	//  108  190:getfield        #110 <Field QueueFile$Element last>
	//  109  193:getfield        #116 <Field int QueueFile$Element.length>
	//  110  196:invokespecial   #151 <Method void QueueFile$Element(int, int)>
	//  111  199:putfield        #110 <Field QueueFile$Element last>
		} else
	//* 112  202:aload_0         
	//* 113  203:iload_3         
	//* 114  204:putfield        #105 <Field int fileLength>
	//* 115  207:return          
		{
			writeHeader(k, elementCount, first.position, last.position);
	//  116  208:aload_0         
	//  117  209:iload_3         
	//  118  210:aload_0         
	//  119  211:getfield        #144 <Field int elementCount>
	//  120  214:aload_0         
	//  121  215:getfield        #118 <Field QueueFile$Element first>
	//  122  218:getfield        #113 <Field int QueueFile$Element.position>
	//  123  221:aload_0         
	//  124  222:getfield        #110 <Field QueueFile$Element last>
	//  125  225:getfield        #113 <Field int QueueFile$Element.position>
	//  126  228:invokespecial   #148 <Method void writeHeader(int, int, int, int)>
		}
		fileLength = k;
	//* 127  231:goto            202
	}

	private static void initialize(File file)
		throws IOException
	{
		RandomAccessFile randomaccessfile;
		File file1;
		file1 = new File((new StringBuilder()).append(file.getPath()).append(".tmp").toString());
	//    0    0:new             #60  <Class File>
	//    1    3:dup             
	//    2    4:new             #153 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #154 <Method void StringBuilder()>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #157 <Method String File.getPath()>
	//    7   15:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:ldc1            #163 <String ".tmp">
	//    9   20:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//   10   23:invokevirtual   #166 <Method String StringBuilder.toString()>
	//   11   26:invokespecial   #169 <Method void File(String)>
	//   12   29:astore_2        
		randomaccessfile = open(file1);
	//   13   30:aload_2         
	//   14   31:invokestatic    #71  <Method RandomAccessFile open(File)>
	//   15   34:astore_1        
		randomaccessfile.setLength(4096L);
	//   16   35:aload_1         
	//   17   36:ldc2w           #170 <Long 4096L>
	//   18   39:invokevirtual   #174 <Method void RandomAccessFile.setLength(long)>
		randomaccessfile.seek(0L);
	//   19   42:aload_1         
	//   20   43:lconst_0        
	//   21   44:invokevirtual   #177 <Method void RandomAccessFile.seek(long)>
		byte abyte0[] = new byte[16];
	//   22   47:bipush          16
	//   23   49:newarray        byte[]
	//   24   51:astore_3        
		writeInts(abyte0, new int[] {
			4096, 0, 0, 0
		});
	//   25   52:aload_3         
	//   26   53:iconst_4        
	//   27   54:newarray        int[]
	//   28   56:dup             
	//   29   57:iconst_0        
	//   30   58:sipush          4096
	//   31   61:iastore         
	//   32   62:dup             
	//   33   63:iconst_1        
	//   34   64:iconst_0        
	//   35   65:iastore         
	//   36   66:dup             
	//   37   67:iconst_2        
	//   38   68:iconst_0        
	//   39   69:iastore         
	//   40   70:dup             
	//   41   71:iconst_3        
	//   42   72:iconst_0        
	//   43   73:iastore         
	//   44   74:invokestatic    #181 <Method void writeInts(byte[], int[])>
		randomaccessfile.write(abyte0);
	//   45   77:aload_1         
	//   46   78:aload_3         
	//   47   79:invokevirtual   #185 <Method void RandomAccessFile.write(byte[])>
		randomaccessfile.close();
	//   48   82:aload_1         
	//   49   83:invokevirtual   #188 <Method void RandomAccessFile.close()>
		if(!file1.renameTo(file))
	//*  50   86:aload_2         
	//*  51   87:aload_0         
	//*  52   88:invokevirtual   #192 <Method boolean File.renameTo(File)>
	//*  53   91:ifne            111
			throw new IOException("Rename failed!");
	//   54   94:new             #54  <Class IOException>
	//   55   97:dup             
	//   56   98:ldc1            #194 <String "Rename failed!">
	//   57  100:invokespecial   #195 <Method void IOException(String)>
	//   58  103:athrow          
		else
	//*  59  104:astore_0        
	//*  60  105:aload_1         
	//*  61  106:invokevirtual   #188 <Method void RandomAccessFile.close()>
	//*  62  109:aload_0         
	//*  63  110:athrow          
			return;
	//   64  111:return          
		file;
		randomaccessfile.close();
		throw file;
	}

	private static Object nonNull(Object obj, String s)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       13
			throw new NullPointerException(s);
	//    2    4:new             #197 <Class NullPointerException>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #198 <Method void NullPointerException(String)>
	//    6   12:athrow          
		else
			return obj;
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	private static RandomAccessFile open(File file)
		throws FileNotFoundException
	{
		return new RandomAccessFile(file, "rwd");
	//    0    0:new             #120 <Class RandomAccessFile>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #204 <String "rwd">
	//    4    7:invokespecial   #207 <Method void RandomAccessFile(File, String)>
	//    5   10:areturn         
	}

	private Element readElement(int i)
		throws IOException
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            8
		{
			return Element.NULL;
	//    2    4:getstatic       #212 <Field QueueFile$Element QueueFile$Element.NULL>
	//    3    7:areturn         
		} else
		{
			raf.seek(i);
	//    4    8:aload_0         
	//    5    9:getfield        #73  <Field RandomAccessFile raf>
	//    6   12:iload_1         
	//    7   13:i2l             
	//    8   14:invokevirtual   #177 <Method void RandomAccessFile.seek(long)>
			return new Element(i, raf.readInt());
	//    9   17:new             #10  <Class QueueFile$Element>
	//   10   20:dup             
	//   11   21:iload_1         
	//   12   22:aload_0         
	//   13   23:getfield        #73  <Field RandomAccessFile raf>
	//   14   26:invokevirtual   #215 <Method int RandomAccessFile.readInt()>
	//   15   29:invokespecial   #151 <Method void QueueFile$Element(int, int)>
	//   16   32:areturn         
		}
	}

	private void readHeader()
		throws IOException
	{
		raf.seek(0L);
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field RandomAccessFile raf>
	//    2    4:lconst_0        
	//    3    5:invokevirtual   #177 <Method void RandomAccessFile.seek(long)>
		raf.readFully(buffer);
	//    4    8:aload_0         
	//    5    9:getfield        #73  <Field RandomAccessFile raf>
	//    6   12:aload_0         
	//    7   13:getfield        #58  <Field byte[] buffer>
	//    8   16:invokevirtual   #218 <Method void RandomAccessFile.readFully(byte[])>
		fileLength = readInt(buffer, 0);
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #58  <Field byte[] buffer>
	//   12   24:iconst_0        
	//   13   25:invokestatic    #221 <Method int readInt(byte[], int)>
	//   14   28:putfield        #105 <Field int fileLength>
		if((long)fileLength > raf.length())
	//*  15   31:aload_0         
	//*  16   32:getfield        #105 <Field int fileLength>
	//*  17   35:i2l             
	//*  18   36:aload_0         
	//*  19   37:getfield        #73  <Field RandomAccessFile raf>
	//*  20   40:invokevirtual   #224 <Method long RandomAccessFile.length()>
	//*  21   43:lcmp            
	//*  22   44:ifle            92
		{
			throw new IOException((new StringBuilder()).append("File is truncated. Expected length: ").append(fileLength).append(", Actual length: ").append(raf.length()).toString());
	//   23   47:new             #54  <Class IOException>
	//   24   50:dup             
	//   25   51:new             #153 <Class StringBuilder>
	//   26   54:dup             
	//   27   55:invokespecial   #154 <Method void StringBuilder()>
	//   28   58:ldc1            #226 <String "File is truncated. Expected length: ">
	//   29   60:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//   30   63:aload_0         
	//   31   64:getfield        #105 <Field int fileLength>
	//   32   67:invokevirtual   #229 <Method StringBuilder StringBuilder.append(int)>
	//   33   70:ldc1            #231 <String ", Actual length: ">
	//   34   72:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//   35   75:aload_0         
	//   36   76:getfield        #73  <Field RandomAccessFile raf>
	//   37   79:invokevirtual   #224 <Method long RandomAccessFile.length()>
	//   38   82:invokevirtual   #234 <Method StringBuilder StringBuilder.append(long)>
	//   39   85:invokevirtual   #166 <Method String StringBuilder.toString()>
	//   40   88:invokespecial   #195 <Method void IOException(String)>
	//   41   91:athrow          
		} else
		{
			elementCount = readInt(buffer, 4);
	//   42   92:aload_0         
	//   43   93:aload_0         
	//   44   94:getfield        #58  <Field byte[] buffer>
	//   45   97:iconst_4        
	//   46   98:invokestatic    #221 <Method int readInt(byte[], int)>
	//   47  101:putfield        #144 <Field int elementCount>
			int i = readInt(buffer, 8);
	//   48  104:aload_0         
	//   49  105:getfield        #58  <Field byte[] buffer>
	//   50  108:bipush          8
	//   51  110:invokestatic    #221 <Method int readInt(byte[], int)>
	//   52  113:istore_1        
			int j = readInt(buffer, 12);
	//   53  114:aload_0         
	//   54  115:getfield        #58  <Field byte[] buffer>
	//   55  118:bipush          12
	//   56  120:invokestatic    #221 <Method int readInt(byte[], int)>
	//   57  123:istore_2        
			first = readElement(i);
	//   58  124:aload_0         
	//   59  125:aload_0         
	//   60  126:iload_1         
	//   61  127:invokespecial   #236 <Method QueueFile$Element readElement(int)>
	//   62  130:putfield        #118 <Field QueueFile$Element first>
			last = readElement(j);
	//   63  133:aload_0         
	//   64  134:aload_0         
	//   65  135:iload_2         
	//   66  136:invokespecial   #236 <Method QueueFile$Element readElement(int)>
	//   67  139:putfield        #110 <Field QueueFile$Element last>
			return;
	//   68  142:return          
		}
	}

	private static int readInt(byte abyte0[], int i)
	{
		return ((abyte0[i] & 0xff) << 24) + ((abyte0[i + 1] & 0xff) << 16) + ((abyte0[i + 2] & 0xff) << 8) + (abyte0[i + 3] & 0xff);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:baload          
	//    3    3:sipush          255
	//    4    6:iand            
	//    5    7:bipush          24
	//    6    9:ishl            
	//    7   10:aload_0         
	//    8   11:iload_1         
	//    9   12:iconst_1        
	//   10   13:iadd            
	//   11   14:baload          
	//   12   15:sipush          255
	//   13   18:iand            
	//   14   19:bipush          16
	//   15   21:ishl            
	//   16   22:iadd            
	//   17   23:aload_0         
	//   18   24:iload_1         
	//   19   25:iconst_2        
	//   20   26:iadd            
	//   21   27:baload          
	//   22   28:sipush          255
	//   23   31:iand            
	//   24   32:bipush          8
	//   25   34:ishl            
	//   26   35:iadd            
	//   27   36:aload_0         
	//   28   37:iload_1         
	//   29   38:iconst_3        
	//   30   39:iadd            
	//   31   40:baload          
	//   32   41:sipush          255
	//   33   44:iand            
	//   34   45:iadd            
	//   35   46:ireturn         
	}

	private int remainingBytes()
	{
		return fileLength - usedBytes();
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field int fileLength>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #239 <Method int usedBytes()>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	private void ringRead(int i, byte abyte0[], int j, int k)
		throws IOException
	{
		i = wrapPosition(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #84  <Method int wrapPosition(int)>
	//    3    5:istore_1        
		if(i + k <= fileLength)
	//*   4    6:iload_1         
	//*   5    7:iload           4
	//*   6    9:iadd            
	//*   7   10:aload_0         
	//*   8   11:getfield        #105 <Field int fileLength>
	//*   9   14:icmpgt          38
		{
			raf.seek(i);
	//   10   17:aload_0         
	//   11   18:getfield        #73  <Field RandomAccessFile raf>
	//   12   21:iload_1         
	//   13   22:i2l             
	//   14   23:invokevirtual   #177 <Method void RandomAccessFile.seek(long)>
			raf.readFully(abyte0, j, k);
	//   15   26:aload_0         
	//   16   27:getfield        #73  <Field RandomAccessFile raf>
	//   17   30:aload_2         
	//   18   31:iload_3         
	//   19   32:iload           4
	//   20   34:invokevirtual   #242 <Method void RandomAccessFile.readFully(byte[], int, int)>
			return;
	//   21   37:return          
		} else
		{
			int l = fileLength - i;
	//   22   38:aload_0         
	//   23   39:getfield        #105 <Field int fileLength>
	//   24   42:iload_1         
	//   25   43:isub            
	//   26   44:istore          5
			raf.seek(i);
	//   27   46:aload_0         
	//   28   47:getfield        #73  <Field RandomAccessFile raf>
	//   29   50:iload_1         
	//   30   51:i2l             
	//   31   52:invokevirtual   #177 <Method void RandomAccessFile.seek(long)>
			raf.readFully(abyte0, j, l);
	//   32   55:aload_0         
	//   33   56:getfield        #73  <Field RandomAccessFile raf>
	//   34   59:aload_2         
	//   35   60:iload_3         
	//   36   61:iload           5
	//   37   63:invokevirtual   #242 <Method void RandomAccessFile.readFully(byte[], int, int)>
			raf.seek(16L);
	//   38   66:aload_0         
	//   39   67:getfield        #73  <Field RandomAccessFile raf>
	//   40   70:ldc2w           #130 <Long 16L>
	//   41   73:invokevirtual   #177 <Method void RandomAccessFile.seek(long)>
			raf.readFully(abyte0, j + l, k - l);
	//   42   76:aload_0         
	//   43   77:getfield        #73  <Field RandomAccessFile raf>
	//   44   80:aload_2         
	//   45   81:iload_3         
	//   46   82:iload           5
	//   47   84:iadd            
	//   48   85:iload           4
	//   49   87:iload           5
	//   50   89:isub            
	//   51   90:invokevirtual   #242 <Method void RandomAccessFile.readFully(byte[], int, int)>
			return;
	//   52   93:return          
		}
	}

	private void ringWrite(int i, byte abyte0[], int j, int k)
		throws IOException
	{
		i = wrapPosition(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #84  <Method int wrapPosition(int)>
	//    3    5:istore_1        
		if(i + k <= fileLength)
	//*   4    6:iload_1         
	//*   5    7:iload           4
	//*   6    9:iadd            
	//*   7   10:aload_0         
	//*   8   11:getfield        #105 <Field int fileLength>
	//*   9   14:icmpgt          38
		{
			raf.seek(i);
	//   10   17:aload_0         
	//   11   18:getfield        #73  <Field RandomAccessFile raf>
	//   12   21:iload_1         
	//   13   22:i2l             
	//   14   23:invokevirtual   #177 <Method void RandomAccessFile.seek(long)>
			raf.write(abyte0, j, k);
	//   15   26:aload_0         
	//   16   27:getfield        #73  <Field RandomAccessFile raf>
	//   17   30:aload_2         
	//   18   31:iload_3         
	//   19   32:iload           4
	//   20   34:invokevirtual   #245 <Method void RandomAccessFile.write(byte[], int, int)>
			return;
	//   21   37:return          
		} else
		{
			int l = fileLength - i;
	//   22   38:aload_0         
	//   23   39:getfield        #105 <Field int fileLength>
	//   24   42:iload_1         
	//   25   43:isub            
	//   26   44:istore          5
			raf.seek(i);
	//   27   46:aload_0         
	//   28   47:getfield        #73  <Field RandomAccessFile raf>
	//   29   50:iload_1         
	//   30   51:i2l             
	//   31   52:invokevirtual   #177 <Method void RandomAccessFile.seek(long)>
			raf.write(abyte0, j, l);
	//   32   55:aload_0         
	//   33   56:getfield        #73  <Field RandomAccessFile raf>
	//   34   59:aload_2         
	//   35   60:iload_3         
	//   36   61:iload           5
	//   37   63:invokevirtual   #245 <Method void RandomAccessFile.write(byte[], int, int)>
			raf.seek(16L);
	//   38   66:aload_0         
	//   39   67:getfield        #73  <Field RandomAccessFile raf>
	//   40   70:ldc2w           #130 <Long 16L>
	//   41   73:invokevirtual   #177 <Method void RandomAccessFile.seek(long)>
			raf.write(abyte0, j + l, k - l);
	//   42   76:aload_0         
	//   43   77:getfield        #73  <Field RandomAccessFile raf>
	//   44   80:aload_2         
	//   45   81:iload_3         
	//   46   82:iload           5
	//   47   84:iadd            
	//   48   85:iload           4
	//   49   87:iload           5
	//   50   89:isub            
	//   51   90:invokevirtual   #245 <Method void RandomAccessFile.write(byte[], int, int)>
			return;
	//   52   93:return          
		}
	}

	private void setLength(int i)
		throws IOException
	{
		raf.setLength(i);
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field RandomAccessFile raf>
	//    2    4:iload_1         
	//    3    5:i2l             
	//    4    6:invokevirtual   #174 <Method void RandomAccessFile.setLength(long)>
		raf.getChannel().force(true);
	//    5    9:aload_0         
	//    6   10:getfield        #73  <Field RandomAccessFile raf>
	//    7   13:invokevirtual   #124 <Method FileChannel RandomAccessFile.getChannel()>
	//    8   16:iconst_1        
	//    9   17:invokevirtual   #249 <Method void FileChannel.force(boolean)>
	//   10   20:return          
	}

	private int wrapPosition(int i)
	{
		if(i < fileLength)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #105 <Field int fileLength>
	//*   3    5:icmpge          10
			return i;
	//    4    8:iload_1         
	//    5    9:ireturn         
		else
			return (i + 16) - fileLength;
	//    6   10:iload_1         
	//    7   11:bipush          16
	//    8   13:iadd            
	//    9   14:aload_0         
	//   10   15:getfield        #105 <Field int fileLength>
	//   11   18:isub            
	//   12   19:ireturn         
	}

	private void writeHeader(int i, int j, int k, int l)
		throws IOException
	{
		writeInts(buffer, new int[] {
			i, j, k, l
		});
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field byte[] buffer>
	//    2    4:iconst_4        
	//    3    5:newarray        int[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:iload_1         
	//    7   10:iastore         
	//    8   11:dup             
	//    9   12:iconst_1        
	//   10   13:iload_2         
	//   11   14:iastore         
	//   12   15:dup             
	//   13   16:iconst_2        
	//   14   17:iload_3         
	//   15   18:iastore         
	//   16   19:dup             
	//   17   20:iconst_3        
	//   18   21:iload           4
	//   19   23:iastore         
	//   20   24:invokestatic    #181 <Method void writeInts(byte[], int[])>
		raf.seek(0L);
	//   21   27:aload_0         
	//   22   28:getfield        #73  <Field RandomAccessFile raf>
	//   23   31:lconst_0        
	//   24   32:invokevirtual   #177 <Method void RandomAccessFile.seek(long)>
		raf.write(buffer);
	//   25   35:aload_0         
	//   26   36:getfield        #73  <Field RandomAccessFile raf>
	//   27   39:aload_0         
	//   28   40:getfield        #58  <Field byte[] buffer>
	//   29   43:invokevirtual   #185 <Method void RandomAccessFile.write(byte[])>
	//   30   46:return          
	}

	private static void writeInt(byte abyte0[], int i, int j)
	{
		abyte0[i] = (byte)(j >> 24);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:bipush          24
	//    4    5:ishr            
	//    5    6:int2byte        
	//    6    7:bastore         
		abyte0[i + 1] = (byte)(j >> 16);
	//    7    8:aload_0         
	//    8    9:iload_1         
	//    9   10:iconst_1        
	//   10   11:iadd            
	//   11   12:iload_2         
	//   12   13:bipush          16
	//   13   15:ishr            
	//   14   16:int2byte        
	//   15   17:bastore         
		abyte0[i + 2] = (byte)(j >> 8);
	//   16   18:aload_0         
	//   17   19:iload_1         
	//   18   20:iconst_2        
	//   19   21:iadd            
	//   20   22:iload_2         
	//   21   23:bipush          8
	//   22   25:ishr            
	//   23   26:int2byte        
	//   24   27:bastore         
		abyte0[i + 3] = (byte)j;
	//   25   28:aload_0         
	//   26   29:iload_1         
	//   27   30:iconst_3        
	//   28   31:iadd            
	//   29   32:iload_2         
	//   30   33:int2byte        
	//   31   34:bastore         
	//   32   35:return          
	}

	private static transient void writeInts(byte abyte0[], int ai[])
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int k = ai.length;
	//    2    2:aload_1         
	//    3    3:arraylength     
	//    4    4:istore          4
		for(int i = 0; i < k; i++)
	//*   5    6:iconst_0        
	//*   6    7:istore_2        
	//*   7    8:iload_2         
	//*   8    9:iload           4
	//*   9   11:icmpge          33
		{
			writeInt(abyte0, j, ai[i]);
	//   10   14:aload_0         
	//   11   15:iload_3         
	//   12   16:aload_1         
	//   13   17:iload_2         
	//   14   18:iaload          
	//   15   19:invokestatic    #252 <Method void writeInt(byte[], int, int)>
			j += 4;
	//   16   22:iload_3         
	//   17   23:iconst_4        
	//   18   24:iadd            
	//   19   25:istore_3        
		}

	//   20   26:iload_2         
	//   21   27:iconst_1        
	//   22   28:iadd            
	//   23   29:istore_2        
	//*  24   30:goto            8
	//   25   33:return          
	}

	public void add(byte abyte0[])
		throws IOException
	{
		add(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:invokevirtual   #255 <Method void add(byte[], int, int)>
	//    6    8:return          
	}

	public void add(byte abyte0[], int i, int j)
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		nonNull(((Object) (abyte0)), "buffer");
	//    2    2:aload_1         
	//    3    3:ldc2            #256 <String "buffer">
	//    4    6:invokestatic    #89  <Method Object nonNull(Object, String)>
	//    5    9:pop             
		if((i | j) < 0)
			break MISSING_BLOCK_LABEL_24;
	//    6   10:iload_2         
	//    7   11:iload_3         
	//    8   12:ior             
	//    9   13:iflt            24
		if(j <= abyte0.length - i)
			break MISSING_BLOCK_LABEL_37;
	//   10   16:iload_3         
	//   11   17:aload_1         
	//   12   18:arraylength     
	//   13   19:iload_2         
	//   14   20:isub            
	//   15   21:icmple          37
		throw new IndexOutOfBoundsException();
	//   16   24:new             #258 <Class IndexOutOfBoundsException>
	//   17   27:dup             
	//   18   28:invokespecial   #259 <Method void IndexOutOfBoundsException()>
	//   19   31:athrow          
		abyte0;
	//   20   32:astore_1        
		this;
	//   21   33:aload_0         
		JVM INSTR monitorexit ;
	//   22   34:monitorexit     
		throw abyte0;
	//   23   35:aload_1         
	//   24   36:athrow          
		boolean flag;
		expandIfNecessary(j);
	//   25   37:aload_0         
	//   26   38:iload_3         
	//   27   39:invokespecial   #261 <Method void expandIfNecessary(int)>
		flag = isEmpty();
	//   28   42:aload_0         
	//   29   43:invokevirtual   #264 <Method boolean isEmpty()>
	//   30   46:istore          5
		if(!flag) goto _L2; else goto _L1
	//   31   48:iload           5
	//   32   50:ifeq            170
_L1:
		int k = 16;
	//   33   53:bipush          16
	//   34   55:istore          4
_L3:
		Element element;
		element = new Element(k, j);
	//   35   57:new             #10  <Class QueueFile$Element>
	//   36   60:dup             
	//   37   61:iload           4
	//   38   63:iload_3         
	//   39   64:invokespecial   #151 <Method void QueueFile$Element(int, int)>
	//   40   67:astore          6
		writeInt(buffer, 0, j);
	//   41   69:aload_0         
	//   42   70:getfield        #58  <Field byte[] buffer>
	//   43   73:iconst_0        
	//   44   74:iload_3         
	//   45   75:invokestatic    #252 <Method void writeInt(byte[], int, int)>
		ringWrite(element.position, buffer, 0, 4);
	//   46   78:aload_0         
	//   47   79:aload           6
	//   48   81:getfield        #113 <Field int QueueFile$Element.position>
	//   49   84:aload_0         
	//   50   85:getfield        #58  <Field byte[] buffer>
	//   51   88:iconst_0        
	//   52   89:iconst_4        
	//   53   90:invokespecial   #266 <Method void ringWrite(int, byte[], int, int)>
		ringWrite(element.position + 4, abyte0, i, j);
	//   54   93:aload_0         
	//   55   94:aload           6
	//   56   96:getfield        #113 <Field int QueueFile$Element.position>
	//   57   99:iconst_4        
	//   58  100:iadd            
	//   59  101:aload_1         
	//   60  102:iload_2         
	//   61  103:iload_3         
	//   62  104:invokespecial   #266 <Method void ringWrite(int, byte[], int, int)>
		if(!flag)
			break MISSING_BLOCK_LABEL_196;
	//   63  107:iload           5
	//   64  109:ifeq            196
		i = element.position;
	//   65  112:aload           6
	//   66  114:getfield        #113 <Field int QueueFile$Element.position>
	//   67  117:istore_2        
_L4:
		writeHeader(fileLength, elementCount + 1, i, element.position);
	//   68  118:aload_0         
	//   69  119:aload_0         
	//   70  120:getfield        #105 <Field int fileLength>
	//   71  123:aload_0         
	//   72  124:getfield        #144 <Field int elementCount>
	//   73  127:iconst_1        
	//   74  128:iadd            
	//   75  129:iload_2         
	//   76  130:aload           6
	//   77  132:getfield        #113 <Field int QueueFile$Element.position>
	//   78  135:invokespecial   #148 <Method void writeHeader(int, int, int, int)>
		last = element;
	//   79  138:aload_0         
	//   80  139:aload           6
	//   81  141:putfield        #110 <Field QueueFile$Element last>
		elementCount = elementCount + 1;
	//   82  144:aload_0         
	//   83  145:aload_0         
	//   84  146:getfield        #144 <Field int elementCount>
	//   85  149:iconst_1        
	//   86  150:iadd            
	//   87  151:putfield        #144 <Field int elementCount>
		if(!flag)
			break MISSING_BLOCK_LABEL_167;
	//   88  154:iload           5
	//   89  156:ifeq            167
		first = last;
	//   90  159:aload_0         
	//   91  160:aload_0         
	//   92  161:getfield        #110 <Field QueueFile$Element last>
	//   93  164:putfield        #118 <Field QueueFile$Element first>
		this;
	//   94  167:aload_0         
		JVM INSTR monitorexit ;
	//   95  168:monitorexit     
		return;
	//   96  169:return          
_L2:
		k = wrapPosition(last.position + 4 + last.length);
	//   97  170:aload_0         
	//   98  171:aload_0         
	//   99  172:getfield        #110 <Field QueueFile$Element last>
	//  100  175:getfield        #113 <Field int QueueFile$Element.position>
	//  101  178:iconst_4        
	//  102  179:iadd            
	//  103  180:aload_0         
	//  104  181:getfield        #110 <Field QueueFile$Element last>
	//  105  184:getfield        #116 <Field int QueueFile$Element.length>
	//  106  187:iadd            
	//  107  188:invokespecial   #84  <Method int wrapPosition(int)>
	//  108  191:istore          4
		  goto _L3
	//* 109  193:goto            57
		i = first.position;
	//  110  196:aload_0         
	//  111  197:getfield        #118 <Field QueueFile$Element first>
	//  112  200:getfield        #113 <Field int QueueFile$Element.position>
	//  113  203:istore_2        
		  goto _L4
	//* 114  204:goto            118
	}

	public void clear()
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		writeHeader(4096, 0, 0, 0);
	//    2    2:aload_0         
	//    3    3:sipush          4096
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:iconst_0        
	//    7    9:invokespecial   #148 <Method void writeHeader(int, int, int, int)>
		elementCount = 0;
	//    8   12:aload_0         
	//    9   13:iconst_0        
	//   10   14:putfield        #144 <Field int elementCount>
		first = Element.NULL;
	//   11   17:aload_0         
	//   12   18:getstatic       #212 <Field QueueFile$Element QueueFile$Element.NULL>
	//   13   21:putfield        #118 <Field QueueFile$Element first>
		last = Element.NULL;
	//   14   24:aload_0         
	//   15   25:getstatic       #212 <Field QueueFile$Element QueueFile$Element.NULL>
	//   16   28:putfield        #110 <Field QueueFile$Element last>
		if(fileLength > 4096)
	//*  17   31:aload_0         
	//*  18   32:getfield        #105 <Field int fileLength>
	//*  19   35:sipush          4096
	//*  20   38:icmple          48
			setLength(4096);
	//   21   41:aload_0         
	//   22   42:sipush          4096
	//   23   45:invokespecial   #108 <Method void setLength(int)>
		fileLength = 4096;
	//   24   48:aload_0         
	//   25   49:sipush          4096
	//   26   52:putfield        #105 <Field int fileLength>
		this;
	//   27   55:aload_0         
		JVM INSTR monitorexit ;
	//   28   56:monitorexit     
		return;
	//   29   57:return          
		Exception exception;
		exception;
	//   30   58:astore_1        
	//*  31   59:aload_0         
		throw exception;
	//   32   60:monitorexit     
	//   33   61:aload_1         
	//   34   62:athrow          
	}

	public void close()
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		raf.close();
	//    2    2:aload_0         
	//    3    3:getfield        #73  <Field RandomAccessFile raf>
	//    4    6:invokevirtual   #188 <Method void RandomAccessFile.close()>
		this;
	//    5    9:aload_0         
		JVM INSTR monitorexit ;
	//    6   10:monitorexit     
		return;
	//    7   11:return          
		Exception exception;
		exception;
	//    8   12:astore_1        
	//*   9   13:aload_0         
		throw exception;
	//   10   14:monitorexit     
	//   11   15:aload_1         
	//   12   16:athrow          
	}

	public void forEach(ElementReader elementreader)
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int j = first.position;
	//    2    2:aload_0         
	//    3    3:getfield        #118 <Field QueueFile$Element first>
	//    4    6:getfield        #113 <Field int QueueFile$Element.position>
	//    5    9:istore_3        
		int i = 0;
	//    6   10:iconst_0        
	//    7   11:istore_2        
_L2:
		if(i >= elementCount)
			break; /* Loop/switch isn't completed */
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #144 <Field int elementCount>
	//   11   17:icmpge          74
		Element element = readElement(j);
	//   12   20:aload_0         
	//   13   21:iload_3         
	//   14   22:invokespecial   #236 <Method QueueFile$Element readElement(int)>
	//   15   25:astore          4
		elementreader.read(((InputStream) (new ElementInputStream(element))), element.length);
	//   16   27:aload_1         
	//   17   28:new             #13  <Class QueueFile$ElementInputStream>
	//   18   31:dup             
	//   19   32:aload_0         
	//   20   33:aload           4
	//   21   35:aconst_null     
	//   22   36:invokespecial   #272 <Method void QueueFile$ElementInputStream(QueueFile, QueueFile$Element, QueueFile$1)>
	//   23   39:aload           4
	//   24   41:getfield        #116 <Field int QueueFile$Element.length>
	//   25   44:invokeinterface #276 <Method void QueueFile$ElementReader.read(InputStream, int)>
		j = wrapPosition(element.position + 4 + element.length);
	//   26   49:aload_0         
	//   27   50:aload           4
	//   28   52:getfield        #113 <Field int QueueFile$Element.position>
	//   29   55:iconst_4        
	//   30   56:iadd            
	//   31   57:aload           4
	//   32   59:getfield        #116 <Field int QueueFile$Element.length>
	//   33   62:iadd            
	//   34   63:invokespecial   #84  <Method int wrapPosition(int)>
	//   35   66:istore_3        
		i++;
	//   36   67:iload_2         
	//   37   68:iconst_1        
	//   38   69:iadd            
	//   39   70:istore_2        
		if(true) goto _L2; else goto _L1
	//   40   71:goto            12
	//*  41   74:aload_0         
_L1:
		return;
	//   42   75:monitorexit     
	//   43   76:return          
		elementreader;
	//   44   77:astore_1        
	//*  45   78:aload_0         
		throw elementreader;
	//   46   79:monitorexit     
	//   47   80:aload_1         
	//   48   81:athrow          
	}

	public boolean hasSpaceFor(int i, int j)
	{
		return usedBytes() + 4 + i <= j;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #239 <Method int usedBytes()>
	//    2    4:iconst_4        
	//    3    5:iadd            
	//    4    6:iload_1         
	//    5    7:iadd            
	//    6    8:iload_2         
	//    7    9:icmpgt          14
	//    8   12:iconst_1        
	//    9   13:ireturn         
	//   10   14:iconst_0        
	//   11   15:ireturn         
	}

	public boolean isEmpty()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = elementCount;
	//    2    2:aload_0         
	//    3    3:getfield        #144 <Field int elementCount>
	//    4    6:istore_1        
		boolean flag;
		if(i == 0)
	//*   5    7:iload_1         
	//*   6    8:ifne            17
			flag = true;
	//    7   11:iconst_1        
	//    8   12:istore_2        
		else
	//*   9   13:aload_0         
	//*  10   14:monitorexit     
	//*  11   15:iload_2         
	//*  12   16:ireturn         
			flag = false;
	//   13   17:iconst_0        
	//   14   18:istore_2        
		this;
		JVM INSTR monitorexit ;
		return flag;
	//*  15   19:goto            13
		Exception exception;
		exception;
	//   16   22:astore_3        
	//*  17   23:aload_0         
		throw exception;
	//   18   24:monitorexit     
	//   19   25:aload_3         
	//   20   26:athrow          
	}

	public void peek(ElementReader elementreader)
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(elementCount > 0)
	//*   2    2:aload_0         
	//*   3    3:getfield        #144 <Field int elementCount>
	//*   4    6:ifle            35
			elementreader.read(((InputStream) (new ElementInputStream(first))), first.length);
	//    5    9:aload_1         
	//    6   10:new             #13  <Class QueueFile$ElementInputStream>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #118 <Field QueueFile$Element first>
	//   11   19:aconst_null     
	//   12   20:invokespecial   #272 <Method void QueueFile$ElementInputStream(QueueFile, QueueFile$Element, QueueFile$1)>
	//   13   23:aload_0         
	//   14   24:getfield        #118 <Field QueueFile$Element first>
	//   15   27:getfield        #116 <Field int QueueFile$Element.length>
	//   16   30:invokeinterface #276 <Method void QueueFile$ElementReader.read(InputStream, int)>
		this;
	//   17   35:aload_0         
		JVM INSTR monitorexit ;
	//   18   36:monitorexit     
		return;
	//   19   37:return          
		elementreader;
	//   20   38:astore_1        
	//*  21   39:aload_0         
		throw elementreader;
	//   22   40:monitorexit     
	//   23   41:aload_1         
	//   24   42:athrow          
	}

	public byte[] peek()
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = isEmpty();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #264 <Method boolean isEmpty()>
	//    4    6:istore_2        
		if(!flag) goto _L2; else goto _L1
	//    5    7:iload_2         
	//    6    8:ifeq            17
_L1:
		byte abyte0[] = null;
	//    7   11:aconst_null     
	//    8   12:astore_3        
_L4:
		this;
	//    9   13:aload_0         
		JVM INSTR monitorexit ;
	//   10   14:monitorexit     
		return abyte0;
	//   11   15:aload_3         
	//   12   16:areturn         
_L2:
		int i = first.length;
	//   13   17:aload_0         
	//   14   18:getfield        #118 <Field QueueFile$Element first>
	//   15   21:getfield        #116 <Field int QueueFile$Element.length>
	//   16   24:istore_1        
		abyte0 = new byte[i];
	//   17   25:iload_1         
	//   18   26:newarray        byte[]
	//   19   28:astore_3        
		ringRead(first.position + 4, abyte0, 0, i);
	//   20   29:aload_0         
	//   21   30:aload_0         
	//   22   31:getfield        #118 <Field QueueFile$Element first>
	//   23   34:getfield        #113 <Field int QueueFile$Element.position>
	//   24   37:iconst_4        
	//   25   38:iadd            
	//   26   39:aload_3         
	//   27   40:iconst_0        
	//   28   41:iload_1         
	//   29   42:invokespecial   #95  <Method void ringRead(int, byte[], int, int)>
		if(true) goto _L4; else goto _L3
	//   30   45:goto            13
_L3:
		Exception exception;
		exception;
	//   31   48:astore_3        
	//*  32   49:aload_0         
		throw exception;
	//   33   50:monitorexit     
	//   34   51:aload_3         
	//   35   52:athrow          
	}

	public void remove()
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(isEmpty())
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #264 <Method boolean isEmpty()>
	//*   4    6:ifeq            22
			throw new NoSuchElementException();
	//    5    9:new             #283 <Class NoSuchElementException>
	//    6   12:dup             
	//    7   13:invokespecial   #284 <Method void NoSuchElementException()>
	//    8   16:athrow          
		break MISSING_BLOCK_LABEL_22;
		Exception exception;
		exception;
	//    9   17:astore_3        
		this;
	//   10   18:aload_0         
		JVM INSTR monitorexit ;
	//   11   19:monitorexit     
		throw exception;
	//   12   20:aload_3         
	//   13   21:athrow          
		if(elementCount != 1)
			break MISSING_BLOCK_LABEL_37;
	//   14   22:aload_0         
	//   15   23:getfield        #144 <Field int elementCount>
	//   16   26:iconst_1        
	//   17   27:icmpne          37
		clear();
	//   18   30:aload_0         
	//   19   31:invokevirtual   #286 <Method void clear()>
_L1:
		this;
	//   20   34:aload_0         
		JVM INSTR monitorexit ;
	//   21   35:monitorexit     
		return;
	//   22   36:return          
		int i = wrapPosition(first.position + 4 + first.length);
	//   23   37:aload_0         
	//   24   38:aload_0         
	//   25   39:getfield        #118 <Field QueueFile$Element first>
	//   26   42:getfield        #113 <Field int QueueFile$Element.position>
	//   27   45:iconst_4        
	//   28   46:iadd            
	//   29   47:aload_0         
	//   30   48:getfield        #118 <Field QueueFile$Element first>
	//   31   51:getfield        #116 <Field int QueueFile$Element.length>
	//   32   54:iadd            
	//   33   55:invokespecial   #84  <Method int wrapPosition(int)>
	//   34   58:istore_1        
		ringRead(i, buffer, 0, 4);
	//   35   59:aload_0         
	//   36   60:iload_1         
	//   37   61:aload_0         
	//   38   62:getfield        #58  <Field byte[] buffer>
	//   39   65:iconst_0        
	//   40   66:iconst_4        
	//   41   67:invokespecial   #95  <Method void ringRead(int, byte[], int, int)>
		int j = readInt(buffer, 0);
	//   42   70:aload_0         
	//   43   71:getfield        #58  <Field byte[] buffer>
	//   44   74:iconst_0        
	//   45   75:invokestatic    #221 <Method int readInt(byte[], int)>
	//   46   78:istore_2        
		writeHeader(fileLength, elementCount - 1, i, last.position);
	//   47   79:aload_0         
	//   48   80:aload_0         
	//   49   81:getfield        #105 <Field int fileLength>
	//   50   84:aload_0         
	//   51   85:getfield        #144 <Field int elementCount>
	//   52   88:iconst_1        
	//   53   89:isub            
	//   54   90:iload_1         
	//   55   91:aload_0         
	//   56   92:getfield        #110 <Field QueueFile$Element last>
	//   57   95:getfield        #113 <Field int QueueFile$Element.position>
	//   58   98:invokespecial   #148 <Method void writeHeader(int, int, int, int)>
		elementCount = elementCount - 1;
	//   59  101:aload_0         
	//   60  102:aload_0         
	//   61  103:getfield        #144 <Field int elementCount>
	//   62  106:iconst_1        
	//   63  107:isub            
	//   64  108:putfield        #144 <Field int elementCount>
		first = new Element(i, j);
	//   65  111:aload_0         
	//   66  112:new             #10  <Class QueueFile$Element>
	//   67  115:dup             
	//   68  116:iload_1         
	//   69  117:iload_2         
	//   70  118:invokespecial   #151 <Method void QueueFile$Element(int, int)>
	//   71  121:putfield        #118 <Field QueueFile$Element first>
		  goto _L1
	//*  72  124:goto            34
	}

	public int size()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = elementCount;
	//    2    2:aload_0         
	//    3    3:getfield        #144 <Field int elementCount>
	//    4    6:istore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return i;
	//    7    9:iload_1         
	//    8   10:ireturn         
		Exception exception;
		exception;
	//    9   11:astore_2        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_2         
	//   13   15:athrow          
	}

	public String toString()
	{
		final StringBuilder builder = new StringBuilder();
	//    0    0:new             #153 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #154 <Method void StringBuilder()>
	//    3    7:astore_1        
		builder.append(((Object)this).getClass().getSimpleName()).append('[');
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #291 <Method Class Object.getClass()>
	//    7   13:invokevirtual   #294 <Method String Class.getSimpleName()>
	//    8   16:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:bipush          91
	//   10   21:invokevirtual   #297 <Method StringBuilder StringBuilder.append(char)>
	//   11   24:pop             
		builder.append("fileLength=").append(fileLength);
	//   12   25:aload_1         
	//   13   26:ldc2            #299 <String "fileLength=">
	//   14   29:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//   15   32:aload_0         
	//   16   33:getfield        #105 <Field int fileLength>
	//   17   36:invokevirtual   #229 <Method StringBuilder StringBuilder.append(int)>
	//   18   39:pop             
		builder.append(", size=").append(elementCount);
	//   19   40:aload_1         
	//   20   41:ldc2            #301 <String ", size=">
	//   21   44:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//   22   47:aload_0         
	//   23   48:getfield        #144 <Field int elementCount>
	//   24   51:invokevirtual   #229 <Method StringBuilder StringBuilder.append(int)>
	//   25   54:pop             
		builder.append(", first=").append(((Object) (first)));
	//   26   55:aload_1         
	//   27   56:ldc2            #303 <String ", first=">
	//   28   59:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//   29   62:aload_0         
	//   30   63:getfield        #118 <Field QueueFile$Element first>
	//   31   66:invokevirtual   #306 <Method StringBuilder StringBuilder.append(Object)>
	//   32   69:pop             
		builder.append(", last=").append(((Object) (last)));
	//   33   70:aload_1         
	//   34   71:ldc2            #308 <String ", last=">
	//   35   74:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//   36   77:aload_0         
	//   37   78:getfield        #110 <Field QueueFile$Element last>
	//   38   81:invokevirtual   #306 <Method StringBuilder StringBuilder.append(Object)>
	//   39   84:pop             
		builder.append(", element lengths=[");
	//   40   85:aload_1         
	//   41   86:ldc2            #310 <String ", element lengths=[">
	//   42   89:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//   43   92:pop             
		try
		{
			forEach(new ElementReader() {

				public void read(InputStream inputstream, int i)
					throws IOException
				{
					if(first)
				//*   0    0:aload_0         
				//*   1    1:getfield        #28  <Field boolean first>
				//*   2    4:ifeq            22
						first = false;
				//    3    7:aload_0         
				//    4    8:iconst_0        
				//    5    9:putfield        #28  <Field boolean first>
					else
				//*   6   12:aload_0         
				//*   7   13:getfield        #23  <Field StringBuilder val$builder>
				//*   8   16:iload_2         
				//*   9   17:invokevirtual   #39  <Method StringBuilder StringBuilder.append(int)>
				//*  10   20:pop             
				//*  11   21:return          
						builder.append(", ");
				//   12   22:aload_0         
				//   13   23:getfield        #23  <Field StringBuilder val$builder>
				//   14   26:ldc1            #41  <String ", ">
				//   15   28:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
				//   16   31:pop             
					builder.append(i);
				//*  17   32:goto            12
				}

				boolean first;
				final QueueFile this$0;
				final StringBuilder val$builder;

			
			{
				this$0 = QueueFile.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field QueueFile this$0>
				builder = stringbuilder;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field StringBuilder val$builder>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
				first = true;
			//    8   14:aload_0         
			//    9   15:iconst_1        
			//   10   16:putfield        #28  <Field boolean first>
			//   11   19:return          
			}
			}
);
	//   44   93:aload_0         
	//   45   94:new             #8   <Class QueueFile$1>
	//   46   97:dup             
	//   47   98:aload_0         
	//   48   99:aload_1         
	//   49  100:invokespecial   #313 <Method void QueueFile$1(QueueFile, StringBuilder)>
	//   50  103:invokevirtual   #315 <Method void forEach(QueueFile$ElementReader)>
		}
	//*  51  106:aload_1         
	//*  52  107:ldc2            #317 <String "]]">
	//*  53  110:invokevirtual   #161 <Method StringBuilder StringBuilder.append(String)>
	//*  54  113:pop             
	//*  55  114:aload_1         
	//*  56  115:invokevirtual   #166 <Method String StringBuilder.toString()>
	//*  57  118:areturn         
		catch(IOException ioexception)
	//*  58  119:astore_2        
		{
			LOGGER.log(Level.WARNING, "read error", ((Throwable) (ioexception)));
	//   59  120:getstatic       #49  <Field Logger LOGGER>
	//   60  123:getstatic       #323 <Field Level Level.WARNING>
	//   61  126:ldc2            #325 <String "read error">
	//   62  129:aload_2         
	//   63  130:invokevirtual   #329 <Method void Logger.log(Level, String, Throwable)>
		}
		builder.append("]]");
		return builder.toString();
	//*  64  133:goto            106
	}

	public int usedBytes()
	{
		if(elementCount == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #144 <Field int elementCount>
	//*   2    4:ifne            10
			return 16;
	//    3    7:bipush          16
	//    4    9:ireturn         
		if(last.position >= first.position)
	//*   5   10:aload_0         
	//*   6   11:getfield        #110 <Field QueueFile$Element last>
	//*   7   14:getfield        #113 <Field int QueueFile$Element.position>
	//*   8   17:aload_0         
	//*   9   18:getfield        #118 <Field QueueFile$Element first>
	//*  10   21:getfield        #113 <Field int QueueFile$Element.position>
	//*  11   24:icmplt          56
			return (last.position - first.position) + 4 + last.length + 16;
	//   12   27:aload_0         
	//   13   28:getfield        #110 <Field QueueFile$Element last>
	//   14   31:getfield        #113 <Field int QueueFile$Element.position>
	//   15   34:aload_0         
	//   16   35:getfield        #118 <Field QueueFile$Element first>
	//   17   38:getfield        #113 <Field int QueueFile$Element.position>
	//   18   41:isub            
	//   19   42:iconst_4        
	//   20   43:iadd            
	//   21   44:aload_0         
	//   22   45:getfield        #110 <Field QueueFile$Element last>
	//   23   48:getfield        #116 <Field int QueueFile$Element.length>
	//   24   51:iadd            
	//   25   52:bipush          16
	//   26   54:iadd            
	//   27   55:ireturn         
		else
			return (last.position + 4 + last.length + fileLength) - first.position;
	//   28   56:aload_0         
	//   29   57:getfield        #110 <Field QueueFile$Element last>
	//   30   60:getfield        #113 <Field int QueueFile$Element.position>
	//   31   63:iconst_4        
	//   32   64:iadd            
	//   33   65:aload_0         
	//   34   66:getfield        #110 <Field QueueFile$Element last>
	//   35   69:getfield        #116 <Field int QueueFile$Element.length>
	//   36   72:iadd            
	//   37   73:aload_0         
	//   38   74:getfield        #105 <Field int fileLength>
	//   39   77:iadd            
	//   40   78:aload_0         
	//   41   79:getfield        #118 <Field QueueFile$Element first>
	//   42   82:getfield        #113 <Field int QueueFile$Element.position>
	//   43   85:isub            
	//   44   86:ireturn         
	}

	static final int HEADER_LENGTH = 16;
	private static final int INITIAL_LENGTH = 4096;
	private static final Logger LOGGER = Logger.getLogger(((Class) (io/fabric/sdk/android/services/common/QueueFile)).getName());
	private final byte buffer[];
	private int elementCount;
	int fileLength;
	private Element first;
	private Element last;
	private final RandomAccessFile raf;

	static 
	{
	//    0    0:ldc1            #2   <Class QueueFile>
	//    1    2:invokevirtual   #41  <Method String Class.getName()>
	//    2    5:invokestatic    #47  <Method Logger Logger.getLogger(String)>
	//    3    8:putstatic       #49  <Field Logger LOGGER>
	//*   4   11:return          
	}


/*
	static int access$100(QueueFile queuefile, int i)
	{
		return queuefile.wrapPosition(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #84  <Method int wrapPosition(int)>
	//    3    5:ireturn         
	}

*/


/*
	static Object access$200(Object obj, String s)
	{
		return nonNull(obj, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #89  <Method Object nonNull(Object, String)>
	//    3    5:areturn         
	}

*/


/*
	static void access$300(QueueFile queuefile, int i, byte abyte0[], int j, int k)
		throws IOException
	{
		queuefile.ringRead(i, abyte0, j, k);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #95  <Method void ringRead(int, byte[], int, int)>
		return;
	//    6    9:return          
	}

*/


/*
	static RandomAccessFile access$400(QueueFile queuefile)
	{
		return queuefile.raf;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field RandomAccessFile raf>
	//    2    4:areturn         
	}

*/
}
