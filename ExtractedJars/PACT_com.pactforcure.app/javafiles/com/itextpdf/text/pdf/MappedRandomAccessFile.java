// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import java.io.*;
import java.lang.reflect.Method;
import java.nio.*;
import java.nio.channels.FileChannel;
import java.security.AccessController;
import java.security.PrivilegedAction;

public class MappedRandomAccessFile
{

	public MappedRandomAccessFile(String s, String s1)
		throws FileNotFoundException, IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		channel = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #27  <Field FileChannel channel>
		if(s1.equals("rw"))
	//*   5    9:aload_2         
	//*   6   10:ldc1            #29  <String "rw">
	//*   7   12:invokevirtual   #35  <Method boolean String.equals(Object)>
	//*   8   15:ifeq            38
		{
			init((new RandomAccessFile(s, s1)).getChannel(), java.nio.channels.FileChannel.MapMode.READ_WRITE);
	//    9   18:aload_0         
	//   10   19:new             #37  <Class RandomAccessFile>
	//   11   22:dup             
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:invokespecial   #39  <Method void RandomAccessFile(String, String)>
	//   15   28:invokevirtual   #43  <Method FileChannel RandomAccessFile.getChannel()>
	//   16   31:getstatic       #49  <Field java.nio.channels.FileChannel$MapMode java.nio.channels.FileChannel$MapMode.READ_WRITE>
	//   17   34:invokespecial   #53  <Method void init(FileChannel, java.nio.channels.FileChannel$MapMode)>
			return;
	//   18   37:return          
		} else
		{
			init((new FileInputStream(s)).getChannel(), java.nio.channels.FileChannel.MapMode.READ_ONLY);
	//   19   38:aload_0         
	//   20   39:new             #55  <Class FileInputStream>
	//   21   42:dup             
	//   22   43:aload_1         
	//   23   44:invokespecial   #58  <Method void FileInputStream(String)>
	//   24   47:invokevirtual   #59  <Method FileChannel FileInputStream.getChannel()>
	//   25   50:getstatic       #62  <Field java.nio.channels.FileChannel$MapMode java.nio.channels.FileChannel$MapMode.READ_ONLY>
	//   26   53:invokespecial   #53  <Method void init(FileChannel, java.nio.channels.FileChannel$MapMode)>
			return;
	//   27   56:return          
		}
	}

	public static boolean clean(ByteBuffer bytebuffer)
	{
		if(bytebuffer == null || !bytebuffer.isDirect())
	//*   0    0:aload_0         
	//*   1    1:ifnull          11
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #72  <Method boolean ByteBuffer.isDirect()>
	//*   4    8:ifne            13
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		else
			return ((Boolean)AccessController.doPrivileged(new PrivilegedAction(bytebuffer) {

				public Boolean run()
				{
					Boolean boolean1 = Boolean.FALSE;
				//    0    0:getstatic       #32  <Field Boolean Boolean.FALSE>
				//    1    3:astore_1        
					Object obj;
					try
					{
						obj = ((Object) (((Object) (buffer)).getClass().getMethod("cleaner", (Class[])null)));
				//    2    4:aload_0         
				//    3    5:getfield        #18  <Field ByteBuffer val$buffer>
				//    4    8:invokevirtual   #36  <Method Class Object.getClass()>
				//    5   11:ldc1            #38  <String "cleaner">
				//    6   13:aconst_null     
				//    7   14:checkcast       #40  <Class Class[]>
				//    8   17:invokevirtual   #46  <Method Method Class.getMethod(String, Class[])>
				//    9   20:astore_2        
						((Method) (obj)).setAccessible(true);
				//   10   21:aload_2         
				//   11   22:iconst_1        
				//   12   23:invokevirtual   #52  <Method void Method.setAccessible(boolean)>
						obj = ((Method) (obj)).invoke(((Object) (buffer)), (Object[])null);
				//   13   26:aload_2         
				//   14   27:aload_0         
				//   15   28:getfield        #18  <Field ByteBuffer val$buffer>
				//   16   31:aconst_null     
				//   17   32:checkcast       #54  <Class Object[]>
				//   18   35:invokevirtual   #58  <Method Object Method.invoke(Object, Object[])>
				//   19   38:astore_2        
						obj.getClass().getMethod("clean", (Class[])null).invoke(obj, (Object[])null);
				//   20   39:aload_2         
				//   21   40:invokevirtual   #36  <Method Class Object.getClass()>
				//   22   43:ldc1            #59  <String "clean">
				//   23   45:aconst_null     
				//   24   46:checkcast       #40  <Class Class[]>
				//   25   49:invokevirtual   #46  <Method Method Class.getMethod(String, Class[])>
				//   26   52:aload_2         
				//   27   53:aconst_null     
				//   28   54:checkcast       #54  <Class Object[]>
				//   29   57:invokevirtual   #58  <Method Object Method.invoke(Object, Object[])>
				//   30   60:pop             
						obj = ((Object) (Boolean.TRUE));
				//   31   61:getstatic       #62  <Field Boolean Boolean.TRUE>
				//   32   64:astore_2        
					}
				//*  33   65:aload_2         
				//*  34   66:areturn         
					catch(Exception exception)
				//*  35   67:astore_2        
					{
						return boolean1;
				//   36   68:aload_1         
				//   37   69:areturn         
					}
					return ((Boolean) (obj));
				}

				public volatile Object run()
				{
					return ((Object) (run()));
				//    0    0:aload_0         
				//    1    1:invokevirtual   #65  <Method Boolean run()>
				//    2    4:areturn         
				}

				final ByteBuffer val$buffer;

			
			{
				buffer = bytebuffer;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ByteBuffer val$buffer>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
			}
)).booleanValue();
	//    7   13:new             #6   <Class MappedRandomAccessFile$1>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokespecial   #75  <Method void MappedRandomAccessFile$1(ByteBuffer)>
	//   11   21:invokestatic    #81  <Method Object AccessController.doPrivileged(PrivilegedAction)>
	//   12   24:checkcast       #83  <Class Boolean>
	//   13   27:invokevirtual   #86  <Method boolean Boolean.booleanValue()>
	//   14   30:ireturn         
	}

	private void init(FileChannel filechannel, java.nio.channels.FileChannel.MapMode mapmode)
		throws IOException
	{
		channel = filechannel;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field FileChannel channel>
		size = filechannel.size();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #93  <Method long FileChannel.size()>
	//    6   10:putfield        #95  <Field long size>
		pos = 0L;
	//    7   13:aload_0         
	//    8   14:lconst_0        
	//    9   15:putfield        #97  <Field long pos>
		int j = (int)(size / 0x40000000L);
	//   10   18:aload_0         
	//   11   19:getfield        #95  <Field long size>
	//   12   22:ldc2w           #98  <Long 0x40000000L>
	//   13   25:ldiv            
	//   14   26:l2i             
	//   15   27:istore          4
		int i;
		long l;
		long l1;
		if(size % 0x40000000L == 0L)
	//*  16   29:aload_0         
	//*  17   30:getfield        #95  <Field long size>
	//*  18   33:ldc2w           #98  <Long 0x40000000L>
	//*  19   36:lrem            
	//*  20   37:lconst_0        
	//*  21   38:lcmp            
	//*  22   39:ifne            187
			i = 0;
	//   23   42:iconst_0        
	//   24   43:istore_3        
		else
	//*  25   44:iload           4
	//*  26   46:iload_3         
	//*  27   47:iadd            
	//*  28   48:istore          4
	//*  29   50:aload_0         
	//*  30   51:iload           4
	//*  31   53:anewarray       MappedByteBuffer[]
	//*  32   56:putfield        #103 <Field MappedByteBuffer[] mappedBuffers>
	//*  33   59:iconst_0        
	//*  34   60:istore_3        
	//*  35   61:lconst_0        
	//*  36   62:lstore          5
	//*  37   64:lload           5
	//*  38   66:aload_0         
	//*  39   67:getfield        #95  <Field long size>
	//*  40   70:lcmp            
	//*  41   71:ifge            129
	//*  42   74:aload_0         
	//*  43   75:getfield        #95  <Field long size>
	//*  44   78:lload           5
	//*  45   80:lsub            
	//*  46   81:ldc2w           #98  <Long 0x40000000L>
	//*  47   84:invokestatic    #109 <Method long Math.min(long, long)>
	//*  48   87:lstore          7
	//*  49   89:aload_0         
	//*  50   90:getfield        #103 <Field MappedByteBuffer[] mappedBuffers>
	//*  51   93:iload_3         
	//*  52   94:aload_1         
	//*  53   95:aload_2         
	//*  54   96:lload           5
	//*  55   98:lload           7
	//*  56  100:invokevirtual   #113 <Method MappedByteBuffer FileChannel.map(java.nio.channels.FileChannel$MapMode, long, long)>
	//*  57  103:aastore         
	//*  58  104:aload_0         
	//*  59  105:getfield        #103 <Field MappedByteBuffer[] mappedBuffers>
	//*  60  108:iload_3         
	//*  61  109:aaload          
	//*  62  110:invokevirtual   #117 <Method MappedByteBuffer MappedByteBuffer.load()>
	//*  63  113:pop             
	//*  64  114:iload_3         
	//*  65  115:iconst_1        
	//*  66  116:iadd            
	//*  67  117:istore_3        
	//*  68  118:lload           5
	//*  69  120:ldc2w           #98  <Long 0x40000000L>
	//*  70  123:ladd            
	//*  71  124:lstore          5
	//*  72  126:goto            64
	//*  73  129:iload_3         
	//*  74  130:iload           4
	//*  75  132:icmpeq          186
	//*  76  135:new             #119 <Class Error>
	//*  77  138:dup             
	//*  78  139:new             #121 <Class StringBuilder>
	//*  79  142:dup             
	//*  80  143:invokespecial   #122 <Method void StringBuilder()>
	//*  81  146:ldc1            #124 <String "Should never happen - ">
	//*  82  148:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//*  83  151:iload_3         
	//*  84  152:invokevirtual   #131 <Method StringBuilder StringBuilder.append(int)>
	//*  85  155:ldc1            #133 <String " != ">
	//*  86  157:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//*  87  160:iload           4
	//*  88  162:invokevirtual   #131 <Method StringBuilder StringBuilder.append(int)>
	//*  89  165:invokevirtual   #137 <Method String StringBuilder.toString()>
	//*  90  168:invokespecial   #138 <Method void Error(String)>
	//*  91  171:athrow          
	//*  92  172:astore_1        
	//*  93  173:aload_0         
	//*  94  174:invokevirtual   #141 <Method void close()>
	//*  95  177:aload_1         
	//*  96  178:athrow          
	//*  97  179:astore_1        
	//*  98  180:aload_0         
	//*  99  181:invokevirtual   #141 <Method void close()>
	//* 100  184:aload_1         
	//* 101  185:athrow          
	//* 102  186:return          
			i = 1;
	//  103  187:iconst_1        
	//  104  188:istore_3        
		j += i;
		mappedBuffers = new MappedByteBuffer[j];
		i = 0;
		l = 0L;
		if(l >= size)
			break; /* Loop/switch isn't completed */
		l1 = Math.min(size - l, 0x40000000L);
		mappedBuffers[i] = filechannel.map(mapmode, l, l1);
		mappedBuffers[i].load();
		i++;
		l += 0x40000000L;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_64;
_L1:
		if(i != j)
		{
			try
			{
				throw new Error((new StringBuilder()).append("Should never happen - ").append(i).append(" != ").append(j).toString());
			}
			// Misplaced declaration of an exception variable
			catch(FileChannel filechannel)
			{
				close();
				throw filechannel;
			}
			// Misplaced declaration of an exception variable
			catch(FileChannel filechannel)
			{
				close();
			}
			throw filechannel;
		} else
		{
			return;
		}
	//* 105  189:goto            44
	}

	public void close()
		throws IOException
	{
		for(int i = 0; i < mappedBuffers.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #103 <Field MappedByteBuffer[] mappedBuffers>
	//*   5    7:arraylength     
	//*   6    8:icmpge          44
			if(mappedBuffers[i] != null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #103 <Field MappedByteBuffer[] mappedBuffers>
	//*   9   15:iload_1         
	//*  10   16:aaload          
	//*  11   17:ifnull          37
			{
				clean(((ByteBuffer) (mappedBuffers[i])));
	//   12   20:aload_0         
	//   13   21:getfield        #103 <Field MappedByteBuffer[] mappedBuffers>
	//   14   24:iload_1         
	//   15   25:aaload          
	//   16   26:invokestatic    #143 <Method boolean clean(ByteBuffer)>
	//   17   29:pop             
				mappedBuffers[i] = null;
	//   18   30:aload_0         
	//   19   31:getfield        #103 <Field MappedByteBuffer[] mappedBuffers>
	//   20   34:iload_1         
	//   21   35:aconst_null     
	//   22   36:aastore         
			}

	//   23   37:iload_1         
	//   24   38:iconst_1        
	//   25   39:iadd            
	//   26   40:istore_1        
	//*  27   41:goto            2
		if(channel != null)
	//*  28   44:aload_0         
	//*  29   45:getfield        #27  <Field FileChannel channel>
	//*  30   48:ifnull          58
			channel.close();
	//   31   51:aload_0         
	//   32   52:getfield        #27  <Field FileChannel channel>
	//   33   55:invokevirtual   #144 <Method void FileChannel.close()>
		channel = null;
	//   34   58:aload_0         
	//   35   59:aconst_null     
	//   36   60:putfield        #27  <Field FileChannel channel>
	//   37   63:return          
	}

	protected void finalize()
		throws Throwable
	{
		close();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #141 <Method void close()>
		super.finalize();
	//    2    4:aload_0         
	//    3    5:invokespecial   #149 <Method void Object.finalize()>
	//    4    8:return          
	}

	public FileChannel getChannel()
	{
		return channel;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field FileChannel channel>
	//    2    4:areturn         
	}

	public long getFilePointer()
	{
		return pos;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field long pos>
	//    2    4:lreturn         
	}

	public long length()
	{
		return size;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field long size>
	//    2    4:lreturn         
	}

	public int read()
	{
		int i;
		int j;
		i = (int)(pos / 0x40000000L);
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field long pos>
	//    2    4:ldc2w           #98  <Long 0x40000000L>
	//    3    7:ldiv            
	//    4    8:l2i             
	//    5    9:istore_1        
		j = (int)(pos % 0x40000000L);
	//    6   10:aload_0         
	//    7   11:getfield        #97  <Field long pos>
	//    8   14:ldc2w           #98  <Long 0x40000000L>
	//    9   17:lrem            
	//   10   18:l2i             
	//   11   19:istore_2        
		if(i >= mappedBuffers.length)
	//*  12   20:iload_1         
	//*  13   21:aload_0         
	//*  14   22:getfield        #103 <Field MappedByteBuffer[] mappedBuffers>
	//*  15   25:arraylength     
	//*  16   26:icmplt          31
			return -1;
	//   17   29:iconst_m1       
	//   18   30:ireturn         
		if(j >= mappedBuffers[i].limit())
			break MISSING_BLOCK_LABEL_72;
	//   19   31:iload_2         
	//   20   32:aload_0         
	//   21   33:getfield        #103 <Field MappedByteBuffer[] mappedBuffers>
	//   22   36:iload_1         
	//   23   37:aaload          
	//   24   38:invokevirtual   #158 <Method int MappedByteBuffer.limit()>
	//   25   41:icmpge          72
		i = ((int) (mappedBuffers[i].get(j)));
	//   26   44:aload_0         
	//   27   45:getfield        #103 <Field MappedByteBuffer[] mappedBuffers>
	//   28   48:iload_1         
	//   29   49:aaload          
	//   30   50:iload_2         
	//   31   51:invokevirtual   #162 <Method byte MappedByteBuffer.get(int)>
	//   32   54:istore_1        
		pos = pos + 1L;
	//   33   55:aload_0         
	//   34   56:aload_0         
	//   35   57:getfield        #97  <Field long pos>
	//   36   60:lconst_1        
	//   37   61:ladd            
	//   38   62:putfield        #97  <Field long pos>
		return i & 0xff;
	//   39   65:iload_1         
	//   40   66:sipush          255
	//   41   69:iand            
	//   42   70:ireturn         
		BufferUnderflowException bufferunderflowexception;
		bufferunderflowexception;
	//   43   71:astore_3        
		return -1;
	//   44   72:iconst_m1       
	//   45   73:ireturn         
	}

	public int read(byte abyte0[], int i, int j)
	{
		int k;
		int l;
		int i1;
		k = (int)(pos / 0x40000000L);
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field long pos>
	//    2    4:ldc2w           #98  <Long 0x40000000L>
	//    3    7:ldiv            
	//    4    8:l2i             
	//    5    9:istore          4
		i1 = (int)(pos % 0x40000000L);
	//    6   11:aload_0         
	//    7   12:getfield        #97  <Field long pos>
	//    8   15:ldc2w           #98  <Long 0x40000000L>
	//    9   18:lrem            
	//   10   19:l2i             
	//   11   20:istore          6
		boolean flag = false;
	//   12   22:iconst_0        
	//   13   23:istore          7
		l = i;
	//   14   25:iload_2         
	//   15   26:istore          5
		i = ((int) (flag));
	//   16   28:iload           7
	//   17   30:istore_2        
_L5:
		if(i < j && k < mappedBuffers.length) goto _L2; else goto _L1
	//   18   31:iload_2         
	//   19   32:iload_3         
	//   20   33:icmpge          46
	//   21   36:iload           4
	//   22   38:aload_0         
	//   23   39:getfield        #103 <Field MappedByteBuffer[] mappedBuffers>
	//   24   42:arraylength     
	//   25   43:icmplt          56
_L1:
		MappedByteBuffer mappedbytebuffer;
		j = i;
	//   26   46:iload_2         
	//   27   47:istore_3        
		if(i == 0)
	//*  28   48:iload_2         
	//*  29   49:ifne            54
			j = -1;
	//   30   52:iconst_m1       
	//   31   53:istore_3        
		return j;
	//   32   54:iload_3         
	//   33   55:ireturn         
	//*  34   56:aload_0         
	//*  35   57:getfield        #103 <Field MappedByteBuffer[] mappedBuffers>
	//*  36   60:iload           4
	//*  37   62:aaload          
	//*  38   63:astore          8
_L2:
		if(i1 > (mappedbytebuffer = mappedBuffers[k]).limit()) goto _L1; else goto _L3
	//   39   65:iload           6
	//   40   67:aload           8
	//   41   69:invokevirtual   #158 <Method int MappedByteBuffer.limit()>
	//   42   72:icmpgt          46
_L3:
		mappedbytebuffer.position(i1);
	//   43   75:aload           8
	//   44   77:iload           6
	//   45   79:invokevirtual   #167 <Method java.nio.Buffer MappedByteBuffer.position(int)>
	//   46   82:pop             
		i1 = Math.min(j - i, mappedbytebuffer.remaining());
	//   47   83:iload_3         
	//   48   84:iload_2         
	//   49   85:isub            
	//   50   86:aload           8
	//   51   88:invokevirtual   #170 <Method int MappedByteBuffer.remaining()>
	//   52   91:invokestatic    #173 <Method int Math.min(int, int)>
	//   53   94:istore          6
		mappedbytebuffer.get(abyte0, l, i1);
	//   54   96:aload           8
	//   55   98:aload_1         
	//   56   99:iload           5
	//   57  101:iload           6
	//   58  103:invokevirtual   #176 <Method ByteBuffer MappedByteBuffer.get(byte[], int, int)>
	//   59  106:pop             
		l += i1;
	//   60  107:iload           5
	//   61  109:iload           6
	//   62  111:iadd            
	//   63  112:istore          5
		pos = pos + (long)i1;
	//   64  114:aload_0         
	//   65  115:aload_0         
	//   66  116:getfield        #97  <Field long pos>
	//   67  119:iload           6
	//   68  121:i2l             
	//   69  122:ladd            
	//   70  123:putfield        #97  <Field long pos>
		i += i1;
	//   71  126:iload_2         
	//   72  127:iload           6
	//   73  129:iadd            
	//   74  130:istore_2        
		k++;
	//   75  131:iload           4
	//   76  133:iconst_1        
	//   77  134:iadd            
	//   78  135:istore          4
		i1 = 0;
	//   79  137:iconst_0        
	//   80  138:istore          6
		if(true) goto _L5; else goto _L4
	//   81  140:goto            31
_L4:
	}

	public void seek(long l)
	{
		pos = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #97  <Field long pos>
	//    3    5:return          
	}

	private static final int BUFSIZE = 0x40000000;
	private FileChannel channel;
	private MappedByteBuffer mappedBuffers[];
	private long pos;
	private long size;
}
