// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.io;

import java.io.IOException;

// Referenced classes of package com.itextpdf.text.io:
//			RandomAccessSource

class GroupedRandomAccessSource
	implements RandomAccessSource
{
	private static class SourceEntry
	{

		public long offsetN(long l)
		{
			return l - firstByte;
		//    0    0:lload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #25  <Field long firstByte>
		//    3    5:lsub            
		//    4    6:lreturn         
		}

		final long firstByte;
		final int index;
		final long lastByte;
		final RandomAccessSource source;

		public SourceEntry(int i, RandomAccessSource randomaccesssource, long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			index = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #21  <Field int index>
			source = randomaccesssource;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field RandomAccessSource source>
			firstByte = l;
		//    8   14:aload_0         
		//    9   15:lload_3         
		//   10   16:putfield        #25  <Field long firstByte>
			lastByte = (randomaccesssource.length() + l) - 1L;
		//   11   19:aload_0         
		//   12   20:aload_2         
		//   13   21:invokeinterface #31  <Method long RandomAccessSource.length()>
		//   14   26:lload_3         
		//   15   27:ladd            
		//   16   28:lconst_1        
		//   17   29:lsub            
		//   18   30:putfield        #33  <Field long lastByte>
		//   19   33:return          
		}
	}


	public GroupedRandomAccessSource(RandomAccessSource arandomaccesssource[])
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		sources = new SourceEntry[arandomaccesssource.length];
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:arraylength     
	//    5    7:anewarray       SourceEntry[]
	//    6   10:putfield        #24  <Field GroupedRandomAccessSource$SourceEntry[] sources>
		long l = 0L;
	//    7   13:lconst_0        
	//    8   14:lstore_3        
		for(int i = 0; i < arandomaccesssource.length; i++)
	//*   9   15:iconst_0        
	//*  10   16:istore_2        
	//*  11   17:iload_2         
	//*  12   18:aload_1         
	//*  13   19:arraylength     
	//*  14   20:icmpge          59
		{
			sources[i] = new SourceEntry(i, arandomaccesssource[i], l);
	//   15   23:aload_0         
	//   16   24:getfield        #24  <Field GroupedRandomAccessSource$SourceEntry[] sources>
	//   17   27:iload_2         
	//   18   28:new             #8   <Class GroupedRandomAccessSource$SourceEntry>
	//   19   31:dup             
	//   20   32:iload_2         
	//   21   33:aload_1         
	//   22   34:iload_2         
	//   23   35:aaload          
	//   24   36:lload_3         
	//   25   37:invokespecial   #27  <Method void GroupedRandomAccessSource$SourceEntry(int, RandomAccessSource, long)>
	//   26   40:aastore         
			l += arandomaccesssource[i].length();
	//   27   41:lload_3         
	//   28   42:aload_1         
	//   29   43:iload_2         
	//   30   44:aaload          
	//   31   45:invokeinterface #31  <Method long RandomAccessSource.length()>
	//   32   50:ladd            
	//   33   51:lstore_3        
		}

	//   34   52:iload_2         
	//   35   53:iconst_1        
	//   36   54:iadd            
	//   37   55:istore_2        
	//*  38   56:goto            17
		size = l;
	//   39   59:aload_0         
	//   40   60:lload_3         
	//   41   61:putfield        #33  <Field long size>
		currentSourceEntry = sources[arandomaccesssource.length - 1];
	//   42   64:aload_0         
	//   43   65:aload_0         
	//   44   66:getfield        #24  <Field GroupedRandomAccessSource$SourceEntry[] sources>
	//   45   69:aload_1         
	//   46   70:arraylength     
	//   47   71:iconst_1        
	//   48   72:isub            
	//   49   73:aaload          
	//   50   74:putfield        #35  <Field GroupedRandomAccessSource$SourceEntry currentSourceEntry>
		sourceInUse(currentSourceEntry.source);
	//   51   77:aload_0         
	//   52   78:aload_0         
	//   53   79:getfield        #35  <Field GroupedRandomAccessSource$SourceEntry currentSourceEntry>
	//   54   82:getfield        #39  <Field RandomAccessSource GroupedRandomAccessSource$SourceEntry.source>
	//   55   85:invokevirtual   #43  <Method void sourceInUse(RandomAccessSource)>
	//   56   88:return          
	}

	private SourceEntry getSourceEntryForOffset(long l)
		throws IOException
	{
		if(l < size)
	//*   0    0:lload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #33  <Field long size>
	//*   3    5:lcmp            
	//*   4    6:iflt            11
	//*   5    9:aconst_null     
	//*   6   10:areturn         
		{
			if(l >= currentSourceEntry.firstByte && l <= currentSourceEntry.lastByte)
	//*   7   11:lload_1         
	//*   8   12:aload_0         
	//*   9   13:getfield        #35  <Field GroupedRandomAccessSource$SourceEntry currentSourceEntry>
	//*  10   16:getfield        #50  <Field long GroupedRandomAccessSource$SourceEntry.firstByte>
	//*  11   19:lcmp            
	//*  12   20:iflt            40
	//*  13   23:lload_1         
	//*  14   24:aload_0         
	//*  15   25:getfield        #35  <Field GroupedRandomAccessSource$SourceEntry currentSourceEntry>
	//*  16   28:getfield        #53  <Field long GroupedRandomAccessSource$SourceEntry.lastByte>
	//*  17   31:lcmp            
	//*  18   32:ifgt            40
				return currentSourceEntry;
	//   19   35:aload_0         
	//   20   36:getfield        #35  <Field GroupedRandomAccessSource$SourceEntry currentSourceEntry>
	//   21   39:areturn         
			sourceReleased(currentSourceEntry.source);
	//   22   40:aload_0         
	//   23   41:aload_0         
	//   24   42:getfield        #35  <Field GroupedRandomAccessSource$SourceEntry currentSourceEntry>
	//   25   45:getfield        #39  <Field RandomAccessSource GroupedRandomAccessSource$SourceEntry.source>
	//   26   48:invokevirtual   #56  <Method void sourceReleased(RandomAccessSource)>
			int i = getStartingSourceIndex(l);
	//   27   51:aload_0         
	//   28   52:lload_1         
	//   29   53:invokevirtual   #60  <Method int getStartingSourceIndex(long)>
	//   30   56:istore_3        
			while(i < sources.length) 
	//*  31   57:iload_3         
	//*  32   58:aload_0         
	//*  33   59:getfield        #24  <Field GroupedRandomAccessSource$SourceEntry[] sources>
	//*  34   62:arraylength     
	//*  35   63:icmpge          9
			{
				if(l >= sources[i].firstByte && l <= sources[i].lastByte)
	//*  36   66:lload_1         
	//*  37   67:aload_0         
	//*  38   68:getfield        #24  <Field GroupedRandomAccessSource$SourceEntry[] sources>
	//*  39   71:iload_3         
	//*  40   72:aaload          
	//*  41   73:getfield        #50  <Field long GroupedRandomAccessSource$SourceEntry.firstByte>
	//*  42   76:lcmp            
	//*  43   77:iflt            120
	//*  44   80:lload_1         
	//*  45   81:aload_0         
	//*  46   82:getfield        #24  <Field GroupedRandomAccessSource$SourceEntry[] sources>
	//*  47   85:iload_3         
	//*  48   86:aaload          
	//*  49   87:getfield        #53  <Field long GroupedRandomAccessSource$SourceEntry.lastByte>
	//*  50   90:lcmp            
	//*  51   91:ifgt            120
				{
					currentSourceEntry = sources[i];
	//   52   94:aload_0         
	//   53   95:aload_0         
	//   54   96:getfield        #24  <Field GroupedRandomAccessSource$SourceEntry[] sources>
	//   55   99:iload_3         
	//   56  100:aaload          
	//   57  101:putfield        #35  <Field GroupedRandomAccessSource$SourceEntry currentSourceEntry>
					sourceInUse(currentSourceEntry.source);
	//   58  104:aload_0         
	//   59  105:aload_0         
	//   60  106:getfield        #35  <Field GroupedRandomAccessSource$SourceEntry currentSourceEntry>
	//   61  109:getfield        #39  <Field RandomAccessSource GroupedRandomAccessSource$SourceEntry.source>
	//   62  112:invokevirtual   #43  <Method void sourceInUse(RandomAccessSource)>
					return currentSourceEntry;
	//   63  115:aload_0         
	//   64  116:getfield        #35  <Field GroupedRandomAccessSource$SourceEntry currentSourceEntry>
	//   65  119:areturn         
				}
				i++;
	//   66  120:iload_3         
	//   67  121:iconst_1        
	//   68  122:iadd            
	//   69  123:istore_3        
			}
		}
		return null;
	//*  70  124:goto            57
	}

	public void close()
		throws IOException
	{
		SourceEntry asourceentry[] = sources;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field GroupedRandomAccessSource$SourceEntry[] sources>
	//    2    4:astore_3        
		int j = asourceentry.length;
	//    3    5:aload_3         
	//    4    6:arraylength     
	//    5    7:istore_2        
		for(int i = 0; i < j; i++)
	//*   6    8:iconst_0        
	//*   7    9:istore_1        
	//*   8   10:iload_1         
	//*   9   11:iload_2         
	//*  10   12:icmpge          33
			asourceentry[i].source.close();
	//   11   15:aload_3         
	//   12   16:iload_1         
	//   13   17:aaload          
	//   14   18:getfield        #39  <Field RandomAccessSource GroupedRandomAccessSource$SourceEntry.source>
	//   15   21:invokeinterface #63  <Method void RandomAccessSource.close()>

	//   16   26:iload_1         
	//   17   27:iconst_1        
	//   18   28:iadd            
	//   19   29:istore_1        
	//*  20   30:goto            10
	//   21   33:return          
	}

	public int get(long l)
		throws IOException
	{
		SourceEntry sourceentry = getSourceEntryForOffset(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #66  <Method GroupedRandomAccessSource$SourceEntry getSourceEntryForOffset(long)>
	//    3    5:astore_3        
		if(sourceentry == null)
	//*   4    6:aload_3         
	//*   5    7:ifnonnull       12
			return -1;
	//    6   10:iconst_m1       
	//    7   11:ireturn         
		else
			return sourceentry.source.get(sourceentry.offsetN(l));
	//    8   12:aload_3         
	//    9   13:getfield        #39  <Field RandomAccessSource GroupedRandomAccessSource$SourceEntry.source>
	//   10   16:aload_3         
	//   11   17:lload_1         
	//   12   18:invokevirtual   #70  <Method long GroupedRandomAccessSource$SourceEntry.offsetN(long)>
	//   13   21:invokeinterface #72  <Method int RandomAccessSource.get(long)>
	//   14   26:ireturn         
	}

	public int get(long l, byte abyte0[], int i, int j)
		throws IOException
	{
		int k;
		long l1;
		SourceEntry sourceentry;
		sourceentry = getSourceEntryForOffset(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #66  <Method GroupedRandomAccessSource$SourceEntry getSourceEntryForOffset(long)>
	//    3    5:astore          12
		if(sourceentry == null)
	//*   4    7:aload           12
	//*   5    9:ifnonnull       14
			return -1;
	//    6   12:iconst_m1       
	//    7   13:ireturn         
		long l2 = sourceentry.offsetN(l);
	//    8   14:aload           12
	//    9   16:lload_1         
	//   10   17:invokevirtual   #70  <Method long GroupedRandomAccessSource$SourceEntry.offsetN(long)>
	//   11   20:lstore          10
		int i1 = j;
	//   12   22:iload           5
	//   13   24:istore          7
		k = i;
	//   14   26:iload           4
	//   15   28:istore          6
		l1 = l;
	//   16   30:lload_1         
	//   17   31:lstore          8
		i = i1;
	//   18   33:iload           7
	//   19   35:istore          4
		l = l2;
	//   20   37:lload           10
	//   21   39:lstore_1        
		break MISSING_BLOCK_LABEL_40;
		while(j1 == -1) 
		{
			do
	//*  22   40:iload           4
	//*  23   42:ifle            50
	//*  24   45:aload           12
	//*  25   47:ifnonnull       63
			{
				int j1;
				if(i == j)
	//*  26   50:iload           4
	//*  27   52:iload           5
	//*  28   54:icmpne          137
					i = -1;
	//   29   57:iconst_m1       
	//   30   58:istore          4
				else
	//*  31   60:iload           4
	//*  32   62:ireturn         
	//*  33   63:lload_1         
	//*  34   64:aload           12
	//*  35   66:getfield        #39  <Field RandomAccessSource GroupedRandomAccessSource$SourceEntry.source>
	//*  36   69:invokeinterface #31  <Method long RandomAccessSource.length()>
	//*  37   74:lcmp            
	//*  38   75:ifgt            50
	//*  39   78:aload           12
	//*  40   80:getfield        #39  <Field RandomAccessSource GroupedRandomAccessSource$SourceEntry.source>
	//*  41   83:lload_1         
	//*  42   84:aload_3         
	//*  43   85:iload           6
	//*  44   87:iload           4
	//*  45   89:invokeinterface #75  <Method int RandomAccessSource.get(long, byte[], int, int)>
	//*  46   94:istore          7
	//*  47   96:iload           7
	//*  48   98:iconst_m1       
	//*  49   99:icmpeq          50
	//*  50  102:iload           6
	//*  51  104:iload           7
	//*  52  106:iadd            
	//*  53  107:istore          6
	//*  54  109:lload           8
	//*  55  111:iload           7
	//*  56  113:i2l             
	//*  57  114:ladd            
	//*  58  115:lstore          8
	//*  59  117:iload           4
	//*  60  119:iload           7
	//*  61  121:isub            
	//*  62  122:istore          4
	//*  63  124:lconst_0        
	//*  64  125:lstore_1        
	//*  65  126:aload_0         
	//*  66  127:lload           8
	//*  67  129:invokespecial   #66  <Method GroupedRandomAccessSource$SourceEntry getSourceEntryForOffset(long)>
	//*  68  132:astore          12
	//*  69  134:goto            40
					i = j - i;
	//   70  137:iload           5
	//   71  139:iload           4
	//   72  141:isub            
	//   73  142:istore          4
				return i;
			} while(i <= 0 || sourceentry == null || l > sourceentry.source.length());
			j1 = sourceentry.source.get(l, abyte0, k, i);
		}
		k += j1;
		l1 += j1;
		i -= j1;
		l = 0L;
		sourceentry = getSourceEntryForOffset(l1);
		if(false)
			;
		else
			break MISSING_BLOCK_LABEL_40;
	//*  74  144:goto            60
	}

	protected int getStartingSourceIndex(long l)
	{
		if(l >= currentSourceEntry.firstByte)
	//*   0    0:lload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #35  <Field GroupedRandomAccessSource$SourceEntry currentSourceEntry>
	//*   3    5:getfield        #50  <Field long GroupedRandomAccessSource$SourceEntry.firstByte>
	//*   4    8:lcmp            
	//*   5    9:iflt            20
			return currentSourceEntry.index;
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field GroupedRandomAccessSource$SourceEntry currentSourceEntry>
	//    8   16:getfield        #79  <Field int GroupedRandomAccessSource$SourceEntry.index>
	//    9   19:ireturn         
		else
			return 0;
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public long length()
	{
		return size;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field long size>
	//    2    4:lreturn         
	}

	protected void sourceInUse(RandomAccessSource randomaccesssource)
		throws IOException
	{
	//    0    0:return          
	}

	protected void sourceReleased(RandomAccessSource randomaccesssource)
		throws IOException
	{
	//    0    0:return          
	}

	private SourceEntry currentSourceEntry;
	private final long size;
	private final SourceEntry sources[];
}
