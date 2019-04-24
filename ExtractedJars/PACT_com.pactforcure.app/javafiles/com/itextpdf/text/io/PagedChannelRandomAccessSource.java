// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.io;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.itextpdf.text.io:
//			GroupedRandomAccessSource, RandomAccessSource, MappedChannelRandomAccessSource

class PagedChannelRandomAccessSource extends GroupedRandomAccessSource
	implements RandomAccessSource
{
	private static class MRU
	{

		public Object enqueue(Object obj)
		{
			if(queue.size() <= 0 || queue.getFirst() != obj)
		//*   0    0:aload_0         
		//*   1    1:getfield        #23  <Field LinkedList queue>
		//*   2    4:invokevirtual   #32  <Method int LinkedList.size()>
		//*   3    7:ifle            23
		//*   4   10:aload_0         
		//*   5   11:getfield        #23  <Field LinkedList queue>
		//*   6   14:invokevirtual   #36  <Method Object LinkedList.getFirst()>
		//*   7   17:aload_1         
		//*   8   18:if_acmpne       23
		//*   9   21:aconst_null     
		//*  10   22:areturn         
			{
				for(Iterator iterator = queue.iterator(); iterator.hasNext();)
		//*  11   23:aload_0         
		//*  12   24:getfield        #23  <Field LinkedList queue>
		//*  13   27:invokevirtual   #40  <Method Iterator LinkedList.iterator()>
		//*  14   30:astore_2        
		//*  15   31:aload_2         
		//*  16   32:invokeinterface #46  <Method boolean Iterator.hasNext()>
		//*  17   37:ifeq            66
					if(obj == iterator.next())
		//*  18   40:aload_1         
		//*  19   41:aload_2         
		//*  20   42:invokeinterface #49  <Method Object Iterator.next()>
		//*  21   47:if_acmpne       31
					{
						iterator.remove();
		//   22   50:aload_2         
		//   23   51:invokeinterface #52  <Method void Iterator.remove()>
						queue.addFirst(obj);
		//   24   56:aload_0         
		//   25   57:getfield        #23  <Field LinkedList queue>
		//   26   60:aload_1         
		//   27   61:invokevirtual   #56  <Method void LinkedList.addFirst(Object)>
						return ((Object) (null));
		//   28   64:aconst_null     
		//   29   65:areturn         
					}

				queue.addFirst(obj);
		//   30   66:aload_0         
		//   31   67:getfield        #23  <Field LinkedList queue>
		//   32   70:aload_1         
		//   33   71:invokevirtual   #56  <Method void LinkedList.addFirst(Object)>
				if(queue.size() > limit)
		//*  34   74:aload_0         
		//*  35   75:getfield        #23  <Field LinkedList queue>
		//*  36   78:invokevirtual   #32  <Method int LinkedList.size()>
		//*  37   81:aload_0         
		//*  38   82:getfield        #25  <Field int limit>
		//*  39   85:icmple          21
					return queue.removeLast();
		//   40   88:aload_0         
		//   41   89:getfield        #23  <Field LinkedList queue>
		//   42   92:invokevirtual   #59  <Method Object LinkedList.removeLast()>
		//   43   95:areturn         
			}
			return ((Object) (null));
		}

		private final int limit;
		private LinkedList queue;

		public MRU(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			queue = new LinkedList();
		//    2    4:aload_0         
		//    3    5:new             #20  <Class LinkedList>
		//    4    8:dup             
		//    5    9:invokespecial   #21  <Method void LinkedList()>
		//    6   12:putfield        #23  <Field LinkedList queue>
			limit = i;
		//    7   15:aload_0         
		//    8   16:iload_1         
		//    9   17:putfield        #25  <Field int limit>
		//   10   20:return          
		}
	}


	public PagedChannelRandomAccessSource(FileChannel filechannel)
		throws IOException
	{
		this(filechannel, 0x4000000, 16);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #14  <Int 0x4000000>
	//    3    4:bipush          16
	//    4    6:invokespecial   #27  <Method void PagedChannelRandomAccessSource(FileChannel, int, int)>
	//    5    9:return          
	}

	public PagedChannelRandomAccessSource(FileChannel filechannel, int i, int j)
		throws IOException
	{
		super(buildSources(filechannel, i / j));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:idiv            
	//    5    5:invokestatic    #33  <Method RandomAccessSource[] buildSources(FileChannel, int)>
	//    6    8:invokespecial   #36  <Method void GroupedRandomAccessSource(RandomAccessSource[])>
		channel = filechannel;
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:putfield        #38  <Field FileChannel channel>
		bufferSize = i / j;
	//   10   16:aload_0         
	//   11   17:iload_2         
	//   12   18:iload_3         
	//   13   19:idiv            
	//   14   20:putfield        #40  <Field int bufferSize>
		mru = new MRU(j);
	//   15   23:aload_0         
	//   16   24:new             #8   <Class PagedChannelRandomAccessSource$MRU>
	//   17   27:dup             
	//   18   28:iload_3         
	//   19   29:invokespecial   #43  <Method void PagedChannelRandomAccessSource$MRU(int)>
	//   20   32:putfield        #45  <Field PagedChannelRandomAccessSource$MRU mru>
	//   21   35:return          
	}

	private static RandomAccessSource[] buildSources(FileChannel filechannel, int i)
		throws IOException
	{
		long l = filechannel.size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #51  <Method long FileChannel.size()>
	//    2    4:lstore          4
		if(l <= 0L)
	//*   3    6:lload           4
	//*   4    8:lconst_0        
	//*   5    9:lcmp            
	//*   6   10:ifgt            23
			throw new IOException("File size must be greater than zero");
	//    7   13:new             #24  <Class IOException>
	//    8   16:dup             
	//    9   17:ldc1            #53  <String "File size must be greater than zero">
	//   10   19:invokespecial   #56  <Method void IOException(String)>
	//   11   22:athrow          
		int k = (int)(l / (long)i);
	//   12   23:lload           4
	//   13   25:iload_1         
	//   14   26:i2l             
	//   15   27:ldiv            
	//   16   28:l2i             
	//   17   29:istore_3        
		int j;
		MappedChannelRandomAccessSource amappedchannelrandomaccesssource[];
		if(l % (long)i == 0L)
	//*  18   30:lload           4
	//*  19   32:iload_1         
	//*  20   33:i2l             
	//*  21   34:lrem            
	//*  22   35:lconst_0        
	//*  23   36:lcmp            
	//*  24   37:ifne            97
			j = 0;
	//   25   40:iconst_0        
	//   26   41:istore_2        
		else
	//*  27   42:iload_3         
	//*  28   43:iload_2         
	//*  29   44:iadd            
	//*  30   45:istore_3        
	//*  31   46:iload_3         
	//*  32   47:anewarray       MappedChannelRandomAccessSource[]
	//*  33   50:astore          8
	//*  34   52:iconst_0        
	//*  35   53:istore_2        
	//*  36   54:iload_2         
	//*  37   55:iload_3         
	//*  38   56:icmpge          102
	//*  39   59:iload_2         
	//*  40   60:i2l             
	//*  41   61:iload_1         
	//*  42   62:i2l             
	//*  43   63:lmul            
	//*  44   64:lstore          6
	//*  45   66:aload           8
	//*  46   68:iload_2         
	//*  47   69:new             #58  <Class MappedChannelRandomAccessSource>
	//*  48   72:dup             
	//*  49   73:aload_0         
	//*  50   74:lload           6
	//*  51   76:lload           4
	//*  52   78:lload           6
	//*  53   80:lsub            
	//*  54   81:iload_1         
	//*  55   82:i2l             
	//*  56   83:invokestatic    #64  <Method long Math.min(long, long)>
	//*  57   86:invokespecial   #67  <Method void MappedChannelRandomAccessSource(FileChannel, long, long)>
	//*  58   89:aastore         
	//*  59   90:iload_2         
	//*  60   91:iconst_1        
	//*  61   92:iadd            
	//*  62   93:istore_2        
	//*  63   94:goto            54
			j = 1;
	//   64   97:iconst_1        
	//   65   98:istore_2        
		k += j;
		amappedchannelrandomaccesssource = new MappedChannelRandomAccessSource[k];
		for(j = 0; j < k; j++)
		{
			long l1 = (long)j * (long)i;
			amappedchannelrandomaccesssource[j] = new MappedChannelRandomAccessSource(filechannel, l1, Math.min(l - l1, i));
		}

	//*  66   99:goto            42
		return ((RandomAccessSource []) (amappedchannelrandomaccesssource));
	//   67  102:aload           8
	//   68  104:areturn         
	}

	public void close()
		throws IOException
	{
		super.close();
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method void GroupedRandomAccessSource.close()>
		channel.close();
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field FileChannel channel>
	//    4    8:invokevirtual   #72  <Method void FileChannel.close()>
	//    5   11:return          
	}

	protected int getStartingSourceIndex(long l)
	{
		return (int)(l / (long)bufferSize);
	//    0    0:lload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field int bufferSize>
	//    3    5:i2l             
	//    4    6:ldiv            
	//    5    7:l2i             
	//    6    8:ireturn         
	}

	protected void sourceInUse(RandomAccessSource randomaccesssource)
		throws IOException
	{
		((MappedChannelRandomAccessSource)randomaccesssource).open();
	//    0    0:aload_1         
	//    1    1:checkcast       #58  <Class MappedChannelRandomAccessSource>
	//    2    4:invokevirtual   #79  <Method void MappedChannelRandomAccessSource.open()>
	//    3    7:return          
	}

	protected void sourceReleased(RandomAccessSource randomaccesssource)
		throws IOException
	{
		randomaccesssource = (RandomAccessSource)mru.enqueue(((Object) (randomaccesssource)));
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field PagedChannelRandomAccessSource$MRU mru>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #84  <Method Object PagedChannelRandomAccessSource$MRU.enqueue(Object)>
	//    4    8:checkcast       #6   <Class RandomAccessSource>
	//    5   11:astore_1        
		if(randomaccesssource != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          22
			randomaccesssource.close();
	//    8   16:aload_1         
	//    9   17:invokeinterface #85  <Method void RandomAccessSource.close()>
	//   10   22:return          
	}

	public static final int DEFAULT_MAX_OPEN_BUFFERS = 16;
	public static final int DEFAULT_TOTAL_BUFSIZE = 0x4000000;
	private final int bufferSize;
	private final FileChannel channel;
	private final MRU mru;
}
