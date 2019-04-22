// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.disklrucache;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

// Referenced classes of package com.bumptech.glide.disklrucache:
//			StrictLineReader, Util

public final class DiskLruCache
	implements Closeable
{
	private static final class DiskLruCacheThreadFactory
		implements ThreadFactory
	{

		public Thread newThread(Runnable runnable)
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			runnable = ((Runnable) (new Thread(runnable, "glide-disk-lru-cache-thread")));
		//    2    2:new             #20  <Class Thread>
		//    3    5:dup             
		//    4    6:aload_1         
		//    5    7:ldc1            #22  <String "glide-disk-lru-cache-thread">
		//    6    9:invokespecial   #25  <Method void Thread(Runnable, String)>
		//    7   12:astore_1        
			((Thread) (runnable)).setPriority(1);
		//    8   13:aload_1         
		//    9   14:iconst_1        
		//   10   15:invokevirtual   #29  <Method void Thread.setPriority(int)>
			this;
		//   11   18:aload_0         
			JVM INSTR monitorexit ;
		//   12   19:monitorexit     
			return ((Thread) (runnable));
		//   13   20:aload_1         
		//   14   21:areturn         
			runnable;
		//   15   22:astore_1        
		//*  16   23:aload_0         
			throw runnable;
		//   17   24:monitorexit     
		//   18   25:aload_1         
		//   19   26:athrow          
		}

		private DiskLruCacheThreadFactory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	public final class Editor
	{

		public void abort()
			throws IOException
		{
			completeEdit(this, false);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field DiskLruCache this$0>
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:invokestatic    #51  <Method void DiskLruCache.access$2100(DiskLruCache, DiskLruCache$Editor, boolean)>
		//    5    9:return          
		}

		public void abortUnlessCommitted()
		{
			if(committed)
				break MISSING_BLOCK_LABEL_11;
		//    0    0:aload_0         
		//    1    1:getfield        #55  <Field boolean committed>
		//    2    4:ifne            11
			abort();
		//    3    7:aload_0         
		//    4    8:invokevirtual   #57  <Method void abort()>
			return;
		//    5   11:return          
			IOException ioexception;
			ioexception;
		//    6   12:astore_1        
		//    7   13:return          
		}

		public void commit()
			throws IOException
		{
			completeEdit(this, true);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field DiskLruCache this$0>
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:invokestatic    #51  <Method void DiskLruCache.access$2100(DiskLruCache, DiskLruCache$Editor, boolean)>
			committed = true;
		//    5    9:aload_0         
		//    6   10:iconst_1        
		//    7   11:putfield        #55  <Field boolean committed>
		//    8   14:return          
		}

		public File getFile(int i)
			throws IOException
		{
label0:
			{
				File file;
				synchronized(DiskLruCache.this)
		//*   0    0:aload_0         
		//*   1    1:getfield        #19  <Field DiskLruCache this$0>
		//*   2    4:astore_2        
		//*   3    5:aload_2         
		//*   4    6:monitorenter    
				{
					if(entry.currentEditor != this)
						break label0;
		//    5    7:aload_0         
		//    6    8:getfield        #24  <Field DiskLruCache$Entry entry>
		//    7   11:invokestatic    #64  <Method DiskLruCache$Editor DiskLruCache$Entry.access$800(DiskLruCache$Entry)>
		//    8   14:aload_0         
		//    9   15:if_acmpne       72
					if(!entry.readable)
		//*  10   18:aload_0         
		//*  11   19:getfield        #24  <Field DiskLruCache$Entry entry>
		//*  12   22:invokestatic    #30  <Method boolean DiskLruCache$Entry.access$700(DiskLruCache$Entry)>
		//*  13   25:ifne            35
						written[i] = true;
		//   14   28:aload_0         
		//   15   29:getfield        #36  <Field boolean[] written>
		//   16   32:iload_1         
		//   17   33:iconst_1        
		//   18   34:bastore         
					file = entry.getDirtyFile(i);
		//   19   35:aload_0         
		//   20   36:getfield        #24  <Field DiskLruCache$Entry entry>
		//   21   39:iload_1         
		//   22   40:invokevirtual   #67  <Method File DiskLruCache$Entry.getDirtyFile(int)>
		//   23   43:astore_3        
					if(!directory.exists())
		//*  24   44:aload_0         
		//*  25   45:getfield        #19  <Field DiskLruCache this$0>
		//*  26   48:invokestatic    #71  <Method File DiskLruCache.access$2000(DiskLruCache)>
		//*  27   51:invokevirtual   #77  <Method boolean File.exists()>
		//*  28   54:ifne            68
						directory.mkdirs();
		//   29   57:aload_0         
		//   30   58:getfield        #19  <Field DiskLruCache this$0>
		//   31   61:invokestatic    #71  <Method File DiskLruCache.access$2000(DiskLruCache)>
		//   32   64:invokevirtual   #80  <Method boolean File.mkdirs()>
		//   33   67:pop             
				}
		//   34   68:aload_2         
		//   35   69:monitorexit     
				return file;
		//   36   70:aload_3         
		//   37   71:areturn         
			}
			throw new IllegalStateException();
		//   38   72:new             #82  <Class IllegalStateException>
		//   39   75:dup             
		//   40   76:invokespecial   #83  <Method void IllegalStateException()>
		//   41   79:athrow          
			exception;
		//   42   80:astore_3        
			disklrucache;
		//   43   81:aload_2         
			JVM INSTR monitorexit ;
		//   44   82:monitorexit     
			throw exception;
		//   45   83:aload_3         
		//   46   84:athrow          
		}

		private boolean committed;
		private final Entry entry;
		final DiskLruCache this$0;
		private final boolean written[];


/*
		static Entry access$1500(Editor editor)
		{
			return editor.entry;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field DiskLruCache$Entry entry>
		//    2    4:areturn         
		}

*/


/*
		static boolean[] access$1600(Editor editor)
		{
			return editor.written;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field boolean[] written>
		//    2    4:areturn         
		}

*/

		private Editor(Entry entry1)
		{
			this$0 = DiskLruCache.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field DiskLruCache this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #22  <Method void Object()>
			entry = entry1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field DiskLruCache$Entry entry>
			if(entry1.readable)
		//*   8   14:aload_2         
		//*   9   15:invokestatic    #30  <Method boolean DiskLruCache$Entry.access$700(DiskLruCache$Entry)>
		//*  10   18:ifeq            26
				disklrucache = null;
		//   11   21:aconst_null     
		//   12   22:astore_1        
			else
		//*  13   23:goto            33
				disklrucache = ((DiskLruCache) (new boolean[valueCount]));
		//   14   26:aload_1         
		//   15   27:invokestatic    #34  <Method int DiskLruCache.access$1900(DiskLruCache)>
		//   16   30:newarray        boolean[]
		//   17   32:astore_1        
			written = ((boolean []) (DiskLruCache.this));
		//   18   33:aload_0         
		//   19   34:aload_1         
		//   20   35:putfield        #36  <Field boolean[] written>
		//   21   38:return          
		}

	}

	private final class Entry
	{

		private IOException invalidLengths(String as[])
			throws IOException
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #45  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #117 <Method void StringBuilder()>
		//    3    7:astore_2        
			stringbuilder.append("unexpected journal line: ");
		//    4    8:aload_2         
		//    5    9:ldc1            #119 <String "unexpected journal line: ">
		//    6   11:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(Arrays.toString(((Object []) (as))));
		//    8   15:aload_2         
		//    9   16:aload_1         
		//   10   17:invokestatic    #124 <Method String Arrays.toString(Object[])>
		//   11   20:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//   12   23:pop             
			throw new IOException(stringbuilder.toString());
		//   13   24:new             #109 <Class IOException>
		//   14   27:dup             
		//   15   28:aload_2         
		//   16   29:invokevirtual   #67  <Method String StringBuilder.toString()>
		//   17   32:invokespecial   #125 <Method void IOException(String)>
		//   18   35:athrow          
		}

		private void setLengths(String as[])
			throws IOException
		{
			NumberFormatException numberformatexception;
			if(as.length == valueCount)
		//*   0    0:aload_1         
		//*   1    1:arraylength     
		//*   2    2:aload_0         
		//*   3    3:getfield        #26  <Field DiskLruCache this$0>
		//*   4    6:invokestatic    #35  <Method int DiskLruCache.access$1900(DiskLruCache)>
		//*   5    9:icmpne          46
			{
				int i = 0;
		//    6   12:iconst_0        
		//    7   13:istore_2        
				do
				{
					try
					{
						if(i >= as.length)
							break;
		//    8   14:iload_2         
		//    9   15:aload_1         
		//   10   16:arraylength     
		//   11   17:icmpge          39
						lengths[i] = Long.parseLong(as[i]);
		//   12   20:aload_0         
		//   13   21:getfield        #37  <Field long[] lengths>
		//   14   24:iload_2         
		//   15   25:aload_1         
		//   16   26:iload_2         
		//   17   27:aaload          
		//   18   28:invokestatic    #133 <Method long Long.parseLong(String)>
		//   19   31:lastore         
					}
		//*  20   32:iload_2         
		//*  21   33:iconst_1        
		//*  22   34:iadd            
		//*  23   35:istore_2        
		//*  24   36:goto            14
		//*  25   39:return          
		//*  26   40:aload_0         
		//*  27   41:aload_1         
		//*  28   42:invokespecial   #135 <Method IOException invalidLengths(String[])>
		//*  29   45:athrow          
		//*  30   46:aload_0         
		//*  31   47:aload_1         
		//*  32   48:invokespecial   #135 <Method IOException invalidLengths(String[])>
		//*  33   51:athrow          
					// Misplaced declaration of an exception variable
					catch(NumberFormatException numberformatexception)
					{
						throw invalidLengths(as);
					}
					i++;
				} while(true);
				return;
			} else
			{
				throw invalidLengths(as);
			}
		//*  34   52:astore_3        
		//*  35   53:goto            40
		}

		public File getCleanFile(int i)
		{
			return cleanFiles[i];
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field File[] cleanFiles>
		//    2    4:iload_1         
		//    3    5:aaload          
		//    4    6:areturn         
		}

		public File getDirtyFile(int i)
		{
			return dirtyFiles[i];
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field File[] dirtyFiles>
		//    2    4:iload_1         
		//    3    5:aaload          
		//    4    6:areturn         
		}

		public String getLengths()
			throws IOException
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #45  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #117 <Method void StringBuilder()>
		//    3    7:astore          5
			long al[] = lengths;
		//    4    9:aload_0         
		//    5   10:getfield        #37  <Field long[] lengths>
		//    6   13:astore          6
			int j = al.length;
		//    7   15:aload           6
		//    8   17:arraylength     
		//    9   18:istore_2        
			for(int i = 0; i < j; i++)
		//*  10   19:iconst_0        
		//*  11   20:istore_1        
		//*  12   21:iload_1         
		//*  13   22:iload_2         
		//*  14   23:icmpge          53
			{
				long l = al[i];
		//   15   26:aload           6
		//   16   28:iload_1         
		//   17   29:laload          
		//   18   30:lstore_3        
				stringbuilder.append(' ');
		//   19   31:aload           5
		//   20   33:bipush          32
		//   21   35:invokevirtual   #52  <Method StringBuilder StringBuilder.append(char)>
		//   22   38:pop             
				stringbuilder.append(l);
		//   23   39:aload           5
		//   24   41:lload_3         
		//   25   42:invokevirtual   #142 <Method StringBuilder StringBuilder.append(long)>
		//   26   45:pop             
			}

		//   27   46:iload_1         
		//   28   47:iconst_1        
		//   29   48:iadd            
		//   30   49:istore_1        
		//*  31   50:goto            21
			return stringbuilder.toString();
		//   32   53:aload           5
		//   33   55:invokevirtual   #67  <Method String StringBuilder.toString()>
		//   34   58:areturn         
		}

		File cleanFiles[];
		private Editor currentEditor;
		File dirtyFiles[];
		private final String key;
		private final long lengths[];
		private boolean readable;
		private long sequenceNumber;
		final DiskLruCache this$0;


/*
		static long[] access$1100(Entry entry)
		{
			return entry.lengths;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field long[] lengths>
		//    2    4:areturn         
		}

*/


/*
		static String access$1200(Entry entry)
		{
			return entry.key;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field String key>
		//    2    4:areturn         
		}

*/


/*
		static long access$1300(Entry entry)
		{
			return entry.sequenceNumber;
		//    0    0:aload_0         
		//    1    1:getfield        #91  <Field long sequenceNumber>
		//    2    4:lreturn         
		}

*/


/*
		static long access$1302(Entry entry, long l)
		{
			entry.sequenceNumber = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #91  <Field long sequenceNumber>
			return l;
		//    3    5:lload_1         
		//    4    6:lreturn         
		}

*/


/*
		static boolean access$700(Entry entry)
		{
			return entry.readable;
		//    0    0:aload_0         
		//    1    1:getfield        #97  <Field boolean readable>
		//    2    4:ireturn         
		}

*/


/*
		static boolean access$702(Entry entry, boolean flag)
		{
			entry.readable = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #97  <Field boolean readable>
			return flag;
		//    3    5:iload_1         
		//    4    6:ireturn         
		}

*/


/*
		static Editor access$800(Entry entry)
		{
			return entry.currentEditor;
		//    0    0:aload_0         
		//    1    1:getfield        #103 <Field DiskLruCache$Editor currentEditor>
		//    2    4:areturn         
		}

*/


/*
		static Editor access$802(Entry entry, Editor editor)
		{
			entry.currentEditor = editor;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #103 <Field DiskLruCache$Editor currentEditor>
			return editor;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/


/*
		static void access$900(Entry entry, String as[])
			throws IOException
		{
			entry.setLengths(as);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #113 <Method void setLengths(String[])>
			return;
		//    3    5:return          
		}

*/

		private Entry(String s)
		{
			this$0 = DiskLruCache.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #26  <Field DiskLruCache this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #29  <Method void Object()>
			key = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #31  <Field String key>
			lengths = new long[valueCount];
		//    8   14:aload_0         
		//    9   15:aload_1         
		//   10   16:invokestatic    #35  <Method int DiskLruCache.access$1900(DiskLruCache)>
		//   11   19:newarray        long[]
		//   12   21:putfield        #37  <Field long[] lengths>
			cleanFiles = new File[valueCount];
		//   13   24:aload_0         
		//   14   25:aload_1         
		//   15   26:invokestatic    #35  <Method int DiskLruCache.access$1900(DiskLruCache)>
		//   16   29:anewarray       File[]
		//   17   32:putfield        #41  <Field File[] cleanFiles>
			dirtyFiles = new File[valueCount];
		//   18   35:aload_0         
		//   19   36:aload_1         
		//   20   37:invokestatic    #35  <Method int DiskLruCache.access$1900(DiskLruCache)>
		//   21   40:anewarray       File[]
		//   22   43:putfield        #43  <Field File[] dirtyFiles>
			s = ((String) (new StringBuilder(s)));
		//   23   46:new             #45  <Class StringBuilder>
		//   24   49:dup             
		//   25   50:aload_2         
		//   26   51:invokespecial   #48  <Method void StringBuilder(String)>
		//   27   54:astore_2        
			((StringBuilder) (s)).append('.');
		//   28   55:aload_2         
		//   29   56:bipush          46
		//   30   58:invokevirtual   #52  <Method StringBuilder StringBuilder.append(char)>
		//   31   61:pop             
			int j = ((StringBuilder) (s)).length();
		//   32   62:aload_2         
		//   33   63:invokevirtual   #56  <Method int StringBuilder.length()>
		//   34   66:istore          4
			for(int i = 0; i < valueCount; i++)
		//*  35   68:iconst_0        
		//*  36   69:istore_3        
		//*  37   70:iload_3         
		//*  38   71:aload_1         
		//*  39   72:invokestatic    #35  <Method int DiskLruCache.access$1900(DiskLruCache)>
		//*  40   75:icmpge          146
			{
				((StringBuilder) (s)).append(i);
		//   41   78:aload_2         
		//   42   79:iload_3         
		//   43   80:invokevirtual   #59  <Method StringBuilder StringBuilder.append(int)>
		//   44   83:pop             
				cleanFiles[i] = new File(directory, ((StringBuilder) (s)).toString());
		//   45   84:aload_0         
		//   46   85:getfield        #41  <Field File[] cleanFiles>
		//   47   88:iload_3         
		//   48   89:new             #39  <Class File>
		//   49   92:dup             
		//   50   93:aload_1         
		//   51   94:invokestatic    #63  <Method File DiskLruCache.access$2000(DiskLruCache)>
		//   52   97:aload_2         
		//   53   98:invokevirtual   #67  <Method String StringBuilder.toString()>
		//   54  101:invokespecial   #70  <Method void File(File, String)>
		//   55  104:aastore         
				((StringBuilder) (s)).append(".tmp");
		//   56  105:aload_2         
		//   57  106:ldc1            #72  <String ".tmp">
		//   58  108:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//   59  111:pop             
				dirtyFiles[i] = new File(directory, ((StringBuilder) (s)).toString());
		//   60  112:aload_0         
		//   61  113:getfield        #43  <Field File[] dirtyFiles>
		//   62  116:iload_3         
		//   63  117:new             #39  <Class File>
		//   64  120:dup             
		//   65  121:aload_1         
		//   66  122:invokestatic    #63  <Method File DiskLruCache.access$2000(DiskLruCache)>
		//   67  125:aload_2         
		//   68  126:invokevirtual   #67  <Method String StringBuilder.toString()>
		//   69  129:invokespecial   #70  <Method void File(File, String)>
		//   70  132:aastore         
				((StringBuilder) (s)).setLength(j);
		//   71  133:aload_2         
		//   72  134:iload           4
		//   73  136:invokevirtual   #79  <Method void StringBuilder.setLength(int)>
			}

		//   74  139:iload_3         
		//   75  140:iconst_1        
		//   76  141:iadd            
		//   77  142:istore_3        
		//*  78  143:goto            70
		//   79  146:return          
		}

	}

	public final class Value
	{

		public File getFile(int i)
		{
			return files[i];
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field File[] files>
		//    2    4:iload_1         
		//    3    5:aaload          
		//    4    6:areturn         
		}

		private final File files[];
		private final String key;
		private final long lengths[];
		private final long sequenceNumber;
		final DiskLruCache this$0;

		private Value(String s, long l, File afile[], long al[])
		{
			this$0 = DiskLruCache.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field DiskLruCache this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #24  <Method void Object()>
			key = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #26  <Field String key>
			sequenceNumber = l;
		//    8   14:aload_0         
		//    9   15:lload_3         
		//   10   16:putfield        #28  <Field long sequenceNumber>
			files = afile;
		//   11   19:aload_0         
		//   12   20:aload           5
		//   13   22:putfield        #30  <Field File[] files>
			lengths = al;
		//   14   25:aload_0         
		//   15   26:aload           6
		//   16   28:putfield        #32  <Field long[] lengths>
		//   17   31:return          
		}

		Value(String s, long l, File afile[], long al[], _cls1 _pcls1)
		{
			this(s, l, afile, al);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:lload_3         
		//    4    4:aload           5
		//    5    6:aload           6
		//    6    8:invokespecial   #36  <Method void DiskLruCache$Value(DiskLruCache, String, long, File[], long[])>
		//    7   11:return          
		}
	}


	private DiskLruCache(File file, int i, int j, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
		size = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #50  <Field long size>
	//    5    9:aload_0         
	//    6   10:new             #52  <Class LinkedHashMap>
	//    7   13:dup             
	//    8   14:iconst_0        
	//    9   15:ldc1            #53  <Float 0.75F>
	//   10   17:iconst_1        
	//   11   18:invokespecial   #56  <Method void LinkedHashMap(int, float, boolean)>
	//   12   21:putfield        #58  <Field LinkedHashMap lruEntries>
		nextSequenceNumber = 0L;
	//   13   24:aload_0         
	//   14   25:lconst_0        
	//   15   26:putfield        #60  <Field long nextSequenceNumber>
		executorService = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, ((java.util.concurrent.BlockingQueue) (new LinkedBlockingQueue())), ((ThreadFactory) (new DiskLruCacheThreadFactory())));
	//   16   29:aload_0         
	//   17   30:new             #62  <Class ThreadPoolExecutor>
	//   18   33:dup             
	//   19   34:iconst_0        
	//   20   35:iconst_1        
	//   21   36:ldc2w           #63  <Long 60L>
	//   22   39:getstatic       #70  <Field TimeUnit TimeUnit.SECONDS>
	//   23   42:new             #72  <Class LinkedBlockingQueue>
	//   24   45:dup             
	//   25   46:invokespecial   #73  <Method void LinkedBlockingQueue()>
	//   26   49:new             #10  <Class DiskLruCache$DiskLruCacheThreadFactory>
	//   27   52:dup             
	//   28   53:aconst_null     
	//   29   54:invokespecial   #76  <Method void DiskLruCache$DiskLruCacheThreadFactory(DiskLruCache$1)>
	//   30   57:invokespecial   #79  <Method void ThreadPoolExecutor(int, int, long, TimeUnit, java.util.concurrent.BlockingQueue, ThreadFactory)>
	//   31   60:putfield        #81  <Field ThreadPoolExecutor executorService>
	//   32   63:aload_0         
	//   33   64:new             #8   <Class DiskLruCache$1>
	//   34   67:dup             
	//   35   68:aload_0         
	//   36   69:invokespecial   #84  <Method void DiskLruCache$1(DiskLruCache)>
	//   37   72:putfield        #86  <Field Callable cleanupCallable>
		directory = file;
	//   38   75:aload_0         
	//   39   76:aload_1         
	//   40   77:putfield        #88  <Field File directory>
		appVersion = i;
	//   41   80:aload_0         
	//   42   81:iload_2         
	//   43   82:putfield        #90  <Field int appVersion>
		journalFile = new File(file, "journal");
	//   44   85:aload_0         
	//   45   86:new             #92  <Class File>
	//   46   89:dup             
	//   47   90:aload_1         
	//   48   91:ldc1            #94  <String "journal">
	//   49   93:invokespecial   #97  <Method void File(File, String)>
	//   50   96:putfield        #99  <Field File journalFile>
		journalFileTmp = new File(file, "journal.tmp");
	//   51   99:aload_0         
	//   52  100:new             #92  <Class File>
	//   53  103:dup             
	//   54  104:aload_1         
	//   55  105:ldc1            #101 <String "journal.tmp">
	//   56  107:invokespecial   #97  <Method void File(File, String)>
	//   57  110:putfield        #103 <Field File journalFileTmp>
		journalFileBackup = new File(file, "journal.bkp");
	//   58  113:aload_0         
	//   59  114:new             #92  <Class File>
	//   60  117:dup             
	//   61  118:aload_1         
	//   62  119:ldc1            #105 <String "journal.bkp">
	//   63  121:invokespecial   #97  <Method void File(File, String)>
	//   64  124:putfield        #107 <Field File journalFileBackup>
		valueCount = j;
	//   65  127:aload_0         
	//   66  128:iload_3         
	//   67  129:putfield        #109 <Field int valueCount>
		maxSize = l;
	//   68  132:aload_0         
	//   69  133:lload           4
	//   70  135:putfield        #111 <Field long maxSize>
	//   71  138:return          
	}

	private void checkNotClosed()
	{
		if(journalWriter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field Writer journalWriter>
	//*   2    4:ifnull          8
			return;
	//    3    7:return          
		else
			throw new IllegalStateException("cache is closed");
	//    4    8:new             #150 <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:ldc1            #152 <String "cache is closed">
	//    7   14:invokespecial   #155 <Method void IllegalStateException(String)>
	//    8   17:athrow          
	}

	private void completeEdit(Editor editor, boolean flag)
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Entry entry = editor.entry;
	//    2    2:aload_1         
	//    3    3:invokestatic    #159 <Method DiskLruCache$Entry DiskLruCache$Editor.access$1500(DiskLruCache$Editor)>
	//    4    6:astore          10
		if(entry.currentEditor != editor) goto _L2; else goto _L1
	//    5    8:aload           10
	//    6   10:invokestatic    #163 <Method DiskLruCache$Editor DiskLruCache$Entry.access$800(DiskLruCache$Entry)>
	//    7   13:aload_1         
	//    8   14:if_acmpne       437
_L1:
		int j;
		boolean flag1;
		flag1 = false;
	//    9   17:iconst_0        
	//   10   18:istore          5
		j = ((int) (flag1));
	//   11   20:iload           5
	//   12   22:istore          4
		if(!flag)
			break MISSING_BLOCK_LABEL_126;
	//   13   24:iload_2         
	//   14   25:ifeq            126
		j = ((int) (flag1));
	//   15   28:iload           5
	//   16   30:istore          4
		if(entry.readable)
			break MISSING_BLOCK_LABEL_126;
	//   17   32:aload           10
	//   18   34:invokestatic    #167 <Method boolean DiskLruCache$Entry.access$700(DiskLruCache$Entry)>
	//   19   37:ifne            126
		int i = 0;
	//   20   40:iconst_0        
	//   21   41:istore_3        
_L4:
		j = ((int) (flag1));
	//   22   42:iload           5
	//   23   44:istore          4
		if(i >= valueCount)
			break MISSING_BLOCK_LABEL_126;
	//   24   46:iload_3         
	//   25   47:aload_0         
	//   26   48:getfield        #109 <Field int valueCount>
	//   27   51:icmpge          126
		if(!editor.written[i])
			break; /* Loop/switch isn't completed */
	//   28   54:aload_1         
	//   29   55:invokestatic    #171 <Method boolean[] DiskLruCache$Editor.access$1600(DiskLruCache$Editor)>
	//   30   58:iload_3         
	//   31   59:baload          
	//   32   60:ifeq            89
		if(entry.getDirtyFile(i).exists())
			break MISSING_BLOCK_LABEL_82;
	//   33   63:aload           10
	//   34   65:iload_3         
	//   35   66:invokevirtual   #175 <Method File DiskLruCache$Entry.getDirtyFile(int)>
	//   36   69:invokevirtual   #178 <Method boolean File.exists()>
	//   37   72:ifne            82
		editor.abort();
	//   38   75:aload_1         
	//   39   76:invokevirtual   #181 <Method void DiskLruCache$Editor.abort()>
		this;
	//   40   79:aload_0         
		JVM INSTR monitorexit ;
	//   41   80:monitorexit     
		return;
	//   42   81:return          
		i++;
	//   43   82:iload_3         
	//   44   83:iconst_1        
	//   45   84:iadd            
	//   46   85:istore_3        
		if(true) goto _L4; else goto _L3
	//   47   86:goto            42
_L3:
		editor.abort();
	//   48   89:aload_1         
	//   49   90:invokevirtual   #181 <Method void DiskLruCache$Editor.abort()>
		editor = ((Editor) (new StringBuilder()));
	//   50   93:new             #183 <Class StringBuilder>
	//   51   96:dup             
	//   52   97:invokespecial   #184 <Method void StringBuilder()>
	//   53  100:astore_1        
		((StringBuilder) (editor)).append("Newly created entry didn't create value for index ");
	//   54  101:aload_1         
	//   55  102:ldc1            #186 <String "Newly created entry didn't create value for index ">
	//   56  104:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   57  107:pop             
		((StringBuilder) (editor)).append(i);
	//   58  108:aload_1         
	//   59  109:iload_3         
	//   60  110:invokevirtual   #193 <Method StringBuilder StringBuilder.append(int)>
	//   61  113:pop             
		throw new IllegalStateException(((StringBuilder) (editor)).toString());
	//   62  114:new             #150 <Class IllegalStateException>
	//   63  117:dup             
	//   64  118:aload_1         
	//   65  119:invokevirtual   #197 <Method String StringBuilder.toString()>
	//   66  122:invokespecial   #155 <Method void IllegalStateException(String)>
	//   67  125:athrow          
_L7:
		if(j >= valueCount) goto _L6; else goto _L5
	//   68  126:iload           4
	//   69  128:aload_0         
	//   70  129:getfield        #109 <Field int valueCount>
	//   71  132:icmpge          221
_L5:
		editor = ((Editor) (entry.getDirtyFile(j)));
	//   72  135:aload           10
	//   73  137:iload           4
	//   74  139:invokevirtual   #175 <Method File DiskLruCache$Entry.getDirtyFile(int)>
	//   75  142:astore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_214;
	//   76  143:iload_2         
	//   77  144:ifeq            214
		if(((File) (editor)).exists())
	//*  78  147:aload_1         
	//*  79  148:invokevirtual   #178 <Method boolean File.exists()>
	//*  80  151:ifeq            450
		{
			File file = entry.getCleanFile(j);
	//   81  154:aload           10
	//   82  156:iload           4
	//   83  158:invokevirtual   #200 <Method File DiskLruCache$Entry.getCleanFile(int)>
	//   84  161:astore          11
			((File) (editor)).renameTo(file);
	//   85  163:aload_1         
	//   86  164:aload           11
	//   87  166:invokevirtual   #204 <Method boolean File.renameTo(File)>
	//   88  169:pop             
			long l = entry.lengths[j];
	//   89  170:aload           10
	//   90  172:invokestatic    #208 <Method long[] DiskLruCache$Entry.access$1100(DiskLruCache$Entry)>
	//   91  175:iload           4
	//   92  177:laload          
	//   93  178:lstore          6
			long l2 = file.length();
	//   94  180:aload           11
	//   95  182:invokevirtual   #212 <Method long File.length()>
	//   96  185:lstore          8
			entry.lengths[j] = l2;
	//   97  187:aload           10
	//   98  189:invokestatic    #208 <Method long[] DiskLruCache$Entry.access$1100(DiskLruCache$Entry)>
	//   99  192:iload           4
	//  100  194:lload           8
	//  101  196:lastore         
			size = (size - l) + l2;
	//  102  197:aload_0         
	//  103  198:aload_0         
	//  104  199:getfield        #50  <Field long size>
	//  105  202:lload           6
	//  106  204:lsub            
	//  107  205:lload           8
	//  108  207:ladd            
	//  109  208:putfield        #50  <Field long size>
		}
		break MISSING_BLOCK_LABEL_450;
	//  110  211:goto            450
		deleteIfExists(((File) (editor)));
	//  111  214:aload_1         
	//  112  215:invokestatic    #216 <Method void deleteIfExists(File)>
		break MISSING_BLOCK_LABEL_450;
	//  113  218:goto            450
_L6:
		redundantOpCount = redundantOpCount + 1;
	//  114  221:aload_0         
	//  115  222:aload_0         
	//  116  223:getfield        #147 <Field int redundantOpCount>
	//  117  226:iconst_1        
	//  118  227:iadd            
	//  119  228:putfield        #147 <Field int redundantOpCount>
		entry.currentEditor = null;
	//  120  231:aload           10
	//  121  233:aconst_null     
	//  122  234:invokestatic    #220 <Method DiskLruCache$Editor DiskLruCache$Entry.access$802(DiskLruCache$Entry, DiskLruCache$Editor)>
	//  123  237:pop             
		if(!(entry.readable | flag))
			break MISSING_BLOCK_LABEL_340;
	//  124  238:aload           10
	//  125  240:invokestatic    #167 <Method boolean DiskLruCache$Entry.access$700(DiskLruCache$Entry)>
	//  126  243:iload_2         
	//  127  244:ior             
	//  128  245:ifeq            340
		entry.readable = true;
	//  129  248:aload           10
	//  130  250:iconst_1        
	//  131  251:invokestatic    #224 <Method boolean DiskLruCache$Entry.access$702(DiskLruCache$Entry, boolean)>
	//  132  254:pop             
		journalWriter.append("CLEAN");
	//  133  255:aload_0         
	//  134  256:getfield        #116 <Field Writer journalWriter>
	//  135  259:ldc1            #226 <String "CLEAN">
	//  136  261:invokevirtual   #231 <Method Writer Writer.append(CharSequence)>
	//  137  264:pop             
		journalWriter.append(' ');
	//  138  265:aload_0         
	//  139  266:getfield        #116 <Field Writer journalWriter>
	//  140  269:bipush          32
	//  141  271:invokevirtual   #234 <Method Writer Writer.append(char)>
	//  142  274:pop             
		journalWriter.append(((CharSequence) (entry.key)));
	//  143  275:aload_0         
	//  144  276:getfield        #116 <Field Writer journalWriter>
	//  145  279:aload           10
	//  146  281:invokestatic    #238 <Method String DiskLruCache$Entry.access$1200(DiskLruCache$Entry)>
	//  147  284:invokevirtual   #231 <Method Writer Writer.append(CharSequence)>
	//  148  287:pop             
		journalWriter.append(((CharSequence) (entry.getLengths())));
	//  149  288:aload_0         
	//  150  289:getfield        #116 <Field Writer journalWriter>
	//  151  292:aload           10
	//  152  294:invokevirtual   #241 <Method String DiskLruCache$Entry.getLengths()>
	//  153  297:invokevirtual   #231 <Method Writer Writer.append(CharSequence)>
	//  154  300:pop             
		journalWriter.append('\n');
	//  155  301:aload_0         
	//  156  302:getfield        #116 <Field Writer journalWriter>
	//  157  305:bipush          10
	//  158  307:invokevirtual   #234 <Method Writer Writer.append(char)>
	//  159  310:pop             
		if(!flag)
			break MISSING_BLOCK_LABEL_396;
	//  160  311:iload_2         
	//  161  312:ifeq            396
		long l1 = nextSequenceNumber;
	//  162  315:aload_0         
	//  163  316:getfield        #60  <Field long nextSequenceNumber>
	//  164  319:lstore          6
		nextSequenceNumber = 1L + l1;
	//  165  321:aload_0         
	//  166  322:lconst_1        
	//  167  323:lload           6
	//  168  325:ladd            
	//  169  326:putfield        #60  <Field long nextSequenceNumber>
		entry.sequenceNumber = l1;
	//  170  329:aload           10
	//  171  331:lload           6
	//  172  333:invokestatic    #245 <Method long DiskLruCache$Entry.access$1302(DiskLruCache$Entry, long)>
	//  173  336:pop2            
		break MISSING_BLOCK_LABEL_396;
	//  174  337:goto            396
		lruEntries.remove(((Object) (entry.key)));
	//  175  340:aload_0         
	//  176  341:getfield        #58  <Field LinkedHashMap lruEntries>
	//  177  344:aload           10
	//  178  346:invokestatic    #238 <Method String DiskLruCache$Entry.access$1200(DiskLruCache$Entry)>
	//  179  349:invokevirtual   #249 <Method Object LinkedHashMap.remove(Object)>
	//  180  352:pop             
		journalWriter.append("REMOVE");
	//  181  353:aload_0         
	//  182  354:getfield        #116 <Field Writer journalWriter>
	//  183  357:ldc1            #251 <String "REMOVE">
	//  184  359:invokevirtual   #231 <Method Writer Writer.append(CharSequence)>
	//  185  362:pop             
		journalWriter.append(' ');
	//  186  363:aload_0         
	//  187  364:getfield        #116 <Field Writer journalWriter>
	//  188  367:bipush          32
	//  189  369:invokevirtual   #234 <Method Writer Writer.append(char)>
	//  190  372:pop             
		journalWriter.append(((CharSequence) (entry.key)));
	//  191  373:aload_0         
	//  192  374:getfield        #116 <Field Writer journalWriter>
	//  193  377:aload           10
	//  194  379:invokestatic    #238 <Method String DiskLruCache$Entry.access$1200(DiskLruCache$Entry)>
	//  195  382:invokevirtual   #231 <Method Writer Writer.append(CharSequence)>
	//  196  385:pop             
		journalWriter.append('\n');
	//  197  386:aload_0         
	//  198  387:getfield        #116 <Field Writer journalWriter>
	//  199  390:bipush          10
	//  200  392:invokevirtual   #234 <Method Writer Writer.append(char)>
	//  201  395:pop             
		journalWriter.flush();
	//  202  396:aload_0         
	//  203  397:getfield        #116 <Field Writer journalWriter>
	//  204  400:invokevirtual   #254 <Method void Writer.flush()>
		if(size > maxSize || journalRebuildRequired())
	//* 205  403:aload_0         
	//* 206  404:getfield        #50  <Field long size>
	//* 207  407:aload_0         
	//* 208  408:getfield        #111 <Field long maxSize>
	//* 209  411:lcmp            
	//* 210  412:ifgt            422
	//* 211  415:aload_0         
	//* 212  416:invokespecial   #139 <Method boolean journalRebuildRequired()>
	//* 213  419:ifeq            434
			executorService.submit(cleanupCallable);
	//  214  422:aload_0         
	//  215  423:getfield        #81  <Field ThreadPoolExecutor executorService>
	//  216  426:aload_0         
	//  217  427:getfield        #86  <Field Callable cleanupCallable>
	//  218  430:invokevirtual   #258 <Method java.util.concurrent.Future ThreadPoolExecutor.submit(Callable)>
	//  219  433:pop             
		this;
	//  220  434:aload_0         
		JVM INSTR monitorexit ;
	//  221  435:monitorexit     
		return;
	//  222  436:return          
_L2:
		throw new IllegalStateException();
	//  223  437:new             #150 <Class IllegalStateException>
	//  224  440:dup             
	//  225  441:invokespecial   #259 <Method void IllegalStateException()>
	//  226  444:athrow          
		editor;
	//  227  445:astore_1        
		this;
	//  228  446:aload_0         
		JVM INSTR monitorexit ;
	//  229  447:monitorexit     
		throw editor;
	//  230  448:aload_1         
	//  231  449:athrow          
		j++;
	//  232  450:iload           4
	//  233  452:iconst_1        
	//  234  453:iadd            
	//  235  454:istore          4
		  goto _L7
	//* 236  456:goto            126
	}

	private static void deleteIfExists(File file)
		throws IOException
	{
		if(file.exists())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #178 <Method boolean File.exists()>
	//*   2    4:ifeq            23
		{
			if(file.delete())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #262 <Method boolean File.delete()>
	//*   5   11:ifeq            15
				return;
	//    6   14:return          
			else
				throw new IOException();
	//    7   15:new             #121 <Class IOException>
	//    8   18:dup             
	//    9   19:invokespecial   #263 <Method void IOException()>
	//   10   22:athrow          
		} else
		{
			return;
	//   11   23:return          
		}
	}

	private Editor edit(String s, long l)
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Entry entry;
		checkNotClosed();
	//    2    2:aload_0         
	//    3    3:invokespecial   #267 <Method void checkNotClosed()>
		entry = (Entry)lruEntries.get(((Object) (s)));
	//    4    6:aload_0         
	//    5    7:getfield        #58  <Field LinkedHashMap lruEntries>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #270 <Method Object LinkedHashMap.get(Object)>
	//    8   14:checkcast       #16  <Class DiskLruCache$Entry>
	//    9   17:astore          6
		if(l == -1L)
			break MISSING_BLOCK_LABEL_50;
	//   10   19:lload_2         
	//   11   20:ldc2w           #271 <Long -1L>
	//   12   23:lcmp            
	//   13   24:ifeq            50
		if(entry == null)
			break MISSING_BLOCK_LABEL_46;
	//   14   27:aload           6
	//   15   29:ifnull          46
		long l1 = entry.sequenceNumber;
	//   16   32:aload           6
	//   17   34:invokestatic    #276 <Method long DiskLruCache$Entry.access$1300(DiskLruCache$Entry)>
	//   18   37:lstore          4
		if(l1 == l)
			break MISSING_BLOCK_LABEL_50;
	//   19   39:lload           4
	//   20   41:lload_2         
	//   21   42:lcmp            
	//   22   43:ifeq            50
		this;
	//   23   46:aload_0         
		JVM INSTR monitorexit ;
	//   24   47:monitorexit     
		return null;
	//   25   48:aconst_null     
	//   26   49:areturn         
		if(entry != null)
			break MISSING_BLOCK_LABEL_81;
	//   27   50:aload           6
	//   28   52:ifnonnull       81
		entry = new Entry(s);
	//   29   55:new             #16  <Class DiskLruCache$Entry>
	//   30   58:dup             
	//   31   59:aload_0         
	//   32   60:aload_1         
	//   33   61:aconst_null     
	//   34   62:invokespecial   #279 <Method void DiskLruCache$Entry(DiskLruCache, String, DiskLruCache$1)>
	//   35   65:astore          6
		lruEntries.put(((Object) (s)), ((Object) (entry)));
	//   36   67:aload_0         
	//   37   68:getfield        #58  <Field LinkedHashMap lruEntries>
	//   38   71:aload_1         
	//   39   72:aload           6
	//   40   74:invokevirtual   #283 <Method Object LinkedHashMap.put(Object, Object)>
	//   41   77:pop             
		break MISSING_BLOCK_LABEL_97;
	//   42   78:goto            97
		Editor editor = entry.currentEditor;
	//   43   81:aload           6
	//   44   83:invokestatic    #163 <Method DiskLruCache$Editor DiskLruCache$Entry.access$800(DiskLruCache$Entry)>
	//   45   86:astore          7
		if(editor == null)
			break MISSING_BLOCK_LABEL_97;
	//   46   88:aload           7
	//   47   90:ifnull          97
		this;
	//   48   93:aload_0         
		JVM INSTR monitorexit ;
	//   49   94:monitorexit     
		return null;
	//   50   95:aconst_null     
	//   51   96:areturn         
		editor = new Editor(entry);
	//   52   97:new             #13  <Class DiskLruCache$Editor>
	//   53  100:dup             
	//   54  101:aload_0         
	//   55  102:aload           6
	//   56  104:aconst_null     
	//   57  105:invokespecial   #286 <Method void DiskLruCache$Editor(DiskLruCache, DiskLruCache$Entry, DiskLruCache$1)>
	//   58  108:astore          7
		entry.currentEditor = editor;
	//   59  110:aload           6
	//   60  112:aload           7
	//   61  114:invokestatic    #220 <Method DiskLruCache$Editor DiskLruCache$Entry.access$802(DiskLruCache$Entry, DiskLruCache$Editor)>
	//   62  117:pop             
		journalWriter.append("DIRTY");
	//   63  118:aload_0         
	//   64  119:getfield        #116 <Field Writer journalWriter>
	//   65  122:ldc2            #288 <String "DIRTY">
	//   66  125:invokevirtual   #231 <Method Writer Writer.append(CharSequence)>
	//   67  128:pop             
		journalWriter.append(' ');
	//   68  129:aload_0         
	//   69  130:getfield        #116 <Field Writer journalWriter>
	//   70  133:bipush          32
	//   71  135:invokevirtual   #234 <Method Writer Writer.append(char)>
	//   72  138:pop             
		journalWriter.append(((CharSequence) (s)));
	//   73  139:aload_0         
	//   74  140:getfield        #116 <Field Writer journalWriter>
	//   75  143:aload_1         
	//   76  144:invokevirtual   #231 <Method Writer Writer.append(CharSequence)>
	//   77  147:pop             
		journalWriter.append('\n');
	//   78  148:aload_0         
	//   79  149:getfield        #116 <Field Writer journalWriter>
	//   80  152:bipush          10
	//   81  154:invokevirtual   #234 <Method Writer Writer.append(char)>
	//   82  157:pop             
		journalWriter.flush();
	//   83  158:aload_0         
	//   84  159:getfield        #116 <Field Writer journalWriter>
	//   85  162:invokevirtual   #254 <Method void Writer.flush()>
		this;
	//   86  165:aload_0         
		JVM INSTR monitorexit ;
	//   87  166:monitorexit     
		return editor;
	//   88  167:aload           7
	//   89  169:areturn         
		s;
	//   90  170:astore_1        
	//*  91  171:aload_0         
		throw s;
	//   92  172:monitorexit     
	//   93  173:aload_1         
	//   94  174:athrow          
	}

	private boolean journalRebuildRequired()
	{
		int i = redundantOpCount;
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field int redundantOpCount>
	//    2    4:istore_1        
		return i >= 2000 && i >= lruEntries.size();
	//    3    5:iload_1         
	//    4    6:sipush          2000
	//    5    9:icmplt          25
	//    6   12:iload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #58  <Field LinkedHashMap lruEntries>
	//    9   17:invokevirtual   #291 <Method int LinkedHashMap.size()>
	//   10   20:icmplt          25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public static DiskLruCache open(File file, int i, int j, long l)
		throws IOException
	{
		Object obj;
		if(l <= 0L)
			break MISSING_BLOCK_LABEL_214;
	//    0    0:lload_3         
	//    1    1:lconst_0        
	//    2    2:lcmp            
	//    3    3:ifle            214
		if(j <= 0)
			break MISSING_BLOCK_LABEL_203;
	//    4    6:iload_2         
	//    5    7:ifle            203
		obj = ((Object) (new File(file, "journal.bkp")));
	//    6   10:new             #92  <Class File>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:ldc1            #105 <String "journal.bkp">
	//   10   17:invokespecial   #97  <Method void File(File, String)>
	//   11   20:astore          5
		if(((File) (obj)).exists())
	//*  12   22:aload           5
	//*  13   24:invokevirtual   #178 <Method boolean File.exists()>
	//*  14   27:ifeq            67
		{
			File file1 = new File(file, "journal");
	//   15   30:new             #92  <Class File>
	//   16   33:dup             
	//   17   34:aload_0         
	//   18   35:ldc1            #94  <String "journal">
	//   19   37:invokespecial   #97  <Method void File(File, String)>
	//   20   40:astore          6
			if(file1.exists())
	//*  21   42:aload           6
	//*  22   44:invokevirtual   #178 <Method boolean File.exists()>
	//*  23   47:ifeq            59
				((File) (obj)).delete();
	//   24   50:aload           5
	//   25   52:invokevirtual   #262 <Method boolean File.delete()>
	//   26   55:pop             
			else
	//*  27   56:goto            67
				renameTo(((File) (obj)), file1, false);
	//   28   59:aload           5
	//   29   61:aload           6
	//   30   63:iconst_0        
	//   31   64:invokestatic    #296 <Method void renameTo(File, File, boolean)>
		}
		obj = ((Object) (new DiskLruCache(file, i, j, l)));
	//   32   67:new             #2   <Class DiskLruCache>
	//   33   70:dup             
	//   34   71:aload_0         
	//   35   72:iload_1         
	//   36   73:iload_2         
	//   37   74:lload_3         
	//   38   75:invokespecial   #298 <Method void DiskLruCache(File, int, int, long)>
	//   39   78:astore          5
		if(!((DiskLruCache) (obj)).journalFile.exists())
			break MISSING_BLOCK_LABEL_180;
	//   40   80:aload           5
	//   41   82:getfield        #99  <Field File journalFile>
	//   42   85:invokevirtual   #178 <Method boolean File.exists()>
	//   43   88:ifeq            180
		((DiskLruCache) (obj)).readJournal();
	//   44   91:aload           5
	//   45   93:invokespecial   #301 <Method void readJournal()>
		((DiskLruCache) (obj)).processJournal();
	//   46   96:aload           5
	//   47   98:invokespecial   #304 <Method void processJournal()>
		return ((DiskLruCache) (obj));
	//   48  101:aload           5
	//   49  103:areturn         
		IOException ioexception;
		ioexception;
	//   50  104:astore          6
		PrintStream printstream = System.out;
	//   51  106:getstatic       #310 <Field PrintStream System.out>
	//   52  109:astore          7
		StringBuilder stringbuilder = new StringBuilder();
	//   53  111:new             #183 <Class StringBuilder>
	//   54  114:dup             
	//   55  115:invokespecial   #184 <Method void StringBuilder()>
	//   56  118:astore          8
		stringbuilder.append("DiskLruCache ");
	//   57  120:aload           8
	//   58  122:ldc2            #312 <String "DiskLruCache ">
	//   59  125:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   60  128:pop             
		stringbuilder.append(((Object) (file)));
	//   61  129:aload           8
	//   62  131:aload_0         
	//   63  132:invokevirtual   #315 <Method StringBuilder StringBuilder.append(Object)>
	//   64  135:pop             
		stringbuilder.append(" is corrupt: ");
	//   65  136:aload           8
	//   66  138:ldc2            #317 <String " is corrupt: ">
	//   67  141:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   68  144:pop             
		stringbuilder.append(ioexception.getMessage());
	//   69  145:aload           8
	//   70  147:aload           6
	//   71  149:invokevirtual   #320 <Method String IOException.getMessage()>
	//   72  152:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   73  155:pop             
		stringbuilder.append(", removing");
	//   74  156:aload           8
	//   75  158:ldc2            #322 <String ", removing">
	//   76  161:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   77  164:pop             
		printstream.println(stringbuilder.toString());
	//   78  165:aload           7
	//   79  167:aload           8
	//   80  169:invokevirtual   #197 <Method String StringBuilder.toString()>
	//   81  172:invokevirtual   #327 <Method void PrintStream.println(String)>
		((DiskLruCache) (obj)).delete();
	//   82  175:aload           5
	//   83  177:invokevirtual   #329 <Method void delete()>
		file.mkdirs();
	//   84  180:aload_0         
	//   85  181:invokevirtual   #332 <Method boolean File.mkdirs()>
	//   86  184:pop             
		file = ((File) (new DiskLruCache(file, i, j, l)));
	//   87  185:new             #2   <Class DiskLruCache>
	//   88  188:dup             
	//   89  189:aload_0         
	//   90  190:iload_1         
	//   91  191:iload_2         
	//   92  192:lload_3         
	//   93  193:invokespecial   #298 <Method void DiskLruCache(File, int, int, long)>
	//   94  196:astore_0        
		((DiskLruCache) (file)).rebuildJournal();
	//   95  197:aload_0         
	//   96  198:invokespecial   #143 <Method void rebuildJournal()>
		return ((DiskLruCache) (file));
	//   97  201:aload_0         
	//   98  202:areturn         
		throw new IllegalArgumentException("valueCount <= 0");
	//   99  203:new             #334 <Class IllegalArgumentException>
	//  100  206:dup             
	//  101  207:ldc2            #336 <String "valueCount <= 0">
	//  102  210:invokespecial   #337 <Method void IllegalArgumentException(String)>
	//  103  213:athrow          
		throw new IllegalArgumentException("maxSize <= 0");
	//  104  214:new             #334 <Class IllegalArgumentException>
	//  105  217:dup             
	//  106  218:ldc2            #339 <String "maxSize <= 0">
	//  107  221:invokespecial   #337 <Method void IllegalArgumentException(String)>
	//  108  224:athrow          
	}

	private void processJournal()
		throws IOException
	{
		deleteIfExists(journalFileTmp);
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field File journalFileTmp>
	//    2    4:invokestatic    #216 <Method void deleteIfExists(File)>
		for(Iterator iterator = lruEntries.values().iterator(); iterator.hasNext();)
	//*   3    7:aload_0         
	//*   4    8:getfield        #58  <Field LinkedHashMap lruEntries>
	//*   5   11:invokevirtual   #343 <Method Collection LinkedHashMap.values()>
	//*   6   14:invokeinterface #349 <Method Iterator Collection.iterator()>
	//*   7   19:astore_3        
	//*   8   20:aload_3         
	//*   9   21:invokeinterface #354 <Method boolean Iterator.hasNext()>
	//*  10   26:ifeq            138
		{
			Entry entry = (Entry)iterator.next();
	//   11   29:aload_3         
	//   12   30:invokeinterface #358 <Method Object Iterator.next()>
	//   13   35:checkcast       #16  <Class DiskLruCache$Entry>
	//   14   38:astore          4
			Editor editor = entry.currentEditor;
	//   15   40:aload           4
	//   16   42:invokestatic    #163 <Method DiskLruCache$Editor DiskLruCache$Entry.access$800(DiskLruCache$Entry)>
	//   17   45:astore          5
			boolean flag = false;
	//   18   47:iconst_0        
	//   19   48:istore_2        
			int i = 0;
	//   20   49:iconst_0        
	//   21   50:istore_1        
			if(editor == null)
	//*  22   51:aload           5
	//*  23   53:ifnonnull       87
			{
				while(i < valueCount) 
	//*  24   56:iload_1         
	//*  25   57:aload_0         
	//*  26   58:getfield        #109 <Field int valueCount>
	//*  27   61:icmpge          20
				{
					size = size + entry.lengths[i];
	//   28   64:aload_0         
	//   29   65:aload_0         
	//   30   66:getfield        #50  <Field long size>
	//   31   69:aload           4
	//   32   71:invokestatic    #208 <Method long[] DiskLruCache$Entry.access$1100(DiskLruCache$Entry)>
	//   33   74:iload_1         
	//   34   75:laload          
	//   35   76:ladd            
	//   36   77:putfield        #50  <Field long size>
					i++;
	//   37   80:iload_1         
	//   38   81:iconst_1        
	//   39   82:iadd            
	//   40   83:istore_1        
				}
			} else
	//*  41   84:goto            56
			{
				entry.currentEditor = null;
	//   42   87:aload           4
	//   43   89:aconst_null     
	//   44   90:invokestatic    #220 <Method DiskLruCache$Editor DiskLruCache$Entry.access$802(DiskLruCache$Entry, DiskLruCache$Editor)>
	//   45   93:pop             
				for(int j = ((int) (flag)); j < valueCount; j++)
	//*  46   94:iload_2         
	//*  47   95:istore_1        
	//*  48   96:iload_1         
	//*  49   97:aload_0         
	//*  50   98:getfield        #109 <Field int valueCount>
	//*  51  101:icmpge          129
				{
					deleteIfExists(entry.getCleanFile(j));
	//   52  104:aload           4
	//   53  106:iload_1         
	//   54  107:invokevirtual   #200 <Method File DiskLruCache$Entry.getCleanFile(int)>
	//   55  110:invokestatic    #216 <Method void deleteIfExists(File)>
					deleteIfExists(entry.getDirtyFile(j));
	//   56  113:aload           4
	//   57  115:iload_1         
	//   58  116:invokevirtual   #175 <Method File DiskLruCache$Entry.getDirtyFile(int)>
	//   59  119:invokestatic    #216 <Method void deleteIfExists(File)>
				}

	//   60  122:iload_1         
	//   61  123:iconst_1        
	//   62  124:iadd            
	//   63  125:istore_1        
	//*  64  126:goto            96
				iterator.remove();
	//   65  129:aload_3         
	//   66  130:invokeinterface #360 <Method void Iterator.remove()>
			}
		}

	//*  67  135:goto            20
	//   68  138:return          
	}

	private void readJournal()
		throws IOException
	{
		StrictLineReader strictlinereader = new StrictLineReader(((java.io.InputStream) (new FileInputStream(journalFile))), Util.US_ASCII);
	//    0    0:new             #364 <Class StrictLineReader>
	//    1    3:dup             
	//    2    4:new             #366 <Class FileInputStream>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #99  <Field File journalFile>
	//    6   12:invokespecial   #368 <Method void FileInputStream(File)>
	//    7   15:getstatic       #374 <Field java.nio.charset.Charset Util.US_ASCII>
	//    8   18:invokespecial   #377 <Method void StrictLineReader(java.io.InputStream, java.nio.charset.Charset)>
	//    9   21:astore_3        
		String s;
		String s1;
		String s2;
		String s3;
		String s4;
		s = strictlinereader.readLine();
	//   10   22:aload_3         
	//   11   23:invokevirtual   #380 <Method String StrictLineReader.readLine()>
	//   12   26:astore          4
		s1 = strictlinereader.readLine();
	//   13   28:aload_3         
	//   14   29:invokevirtual   #380 <Method String StrictLineReader.readLine()>
	//   15   32:astore          5
		s4 = strictlinereader.readLine();
	//   16   34:aload_3         
	//   17   35:invokevirtual   #380 <Method String StrictLineReader.readLine()>
	//   18   38:astore          8
		s2 = strictlinereader.readLine();
	//   19   40:aload_3         
	//   20   41:invokevirtual   #380 <Method String StrictLineReader.readLine()>
	//   21   44:astore          6
		s3 = strictlinereader.readLine();
	//   22   46:aload_3         
	//   23   47:invokevirtual   #380 <Method String StrictLineReader.readLine()>
	//   24   50:astore          7
		if(!"libcore.io.DiskLruCache".equals(((Object) (s))) || !"1".equals(((Object) (s1))) || !Integer.toString(appVersion).equals(((Object) (s4))) || !Integer.toString(valueCount).equals(((Object) (s2)))) goto _L2; else goto _L1
	//   25   52:ldc2            #382 <String "libcore.io.DiskLruCache">
	//   26   55:aload           4
	//   27   57:invokevirtual   #388 <Method boolean String.equals(Object)>
	//   28   60:ifeq            199
	//   29   63:ldc2            #390 <String "1">
	//   30   66:aload           5
	//   31   68:invokevirtual   #388 <Method boolean String.equals(Object)>
	//   32   71:ifeq            199
	//   33   74:aload_0         
	//   34   75:getfield        #90  <Field int appVersion>
	//   35   78:invokestatic    #395 <Method String Integer.toString(int)>
	//   36   81:aload           8
	//   37   83:invokevirtual   #388 <Method boolean String.equals(Object)>
	//   38   86:ifeq            199
	//   39   89:aload_0         
	//   40   90:getfield        #109 <Field int valueCount>
	//   41   93:invokestatic    #395 <Method String Integer.toString(int)>
	//   42   96:aload           6
	//   43   98:invokevirtual   #388 <Method boolean String.equals(Object)>
	//   44  101:ifeq            199
_L1:
		boolean flag = "".equals(((Object) (s3)));
	//   45  104:ldc2            #397 <String "">
	//   46  107:aload           7
	//   47  109:invokevirtual   #388 <Method boolean String.equals(Object)>
	//   48  112:istore_2        
		if(!flag) goto _L2; else goto _L3
	//   49  113:iload_2         
	//   50  114:ifeq            199
_L3:
		int i = 0;
	//   51  117:iconst_0        
	//   52  118:istore_1        
_L5:
		readJournalLine(strictlinereader.readLine());
	//   53  119:aload_0         
	//   54  120:aload_3         
	//   55  121:invokevirtual   #380 <Method String StrictLineReader.readLine()>
	//   56  124:invokespecial   #400 <Method void readJournalLine(String)>
		i++;
	//   57  127:iload_1         
	//   58  128:iconst_1        
	//   59  129:iadd            
	//   60  130:istore_1        
		if(true) goto _L5; else goto _L4
	//   61  131:goto            119
_L4:
		redundantOpCount = i - lruEntries.size();
	//   62  134:aload_0         
	//   63  135:iload_1         
	//   64  136:aload_0         
	//   65  137:getfield        #58  <Field LinkedHashMap lruEntries>
	//   66  140:invokevirtual   #291 <Method int LinkedHashMap.size()>
	//   67  143:isub            
	//   68  144:putfield        #147 <Field int redundantOpCount>
		if(strictlinereader.hasUnterminatedLine())
	//*  69  147:aload_3         
	//*  70  148:invokevirtual   #403 <Method boolean StrictLineReader.hasUnterminatedLine()>
	//*  71  151:ifeq            161
		{
			rebuildJournal();
	//   72  154:aload_0         
	//   73  155:invokespecial   #143 <Method void rebuildJournal()>
			break MISSING_BLOCK_LABEL_194;
	//   74  158:goto            194
		}
		journalWriter = ((Writer) (new BufferedWriter(((Writer) (new OutputStreamWriter(((java.io.OutputStream) (new FileOutputStream(journalFile, true))), Util.US_ASCII))))));
	//   75  161:aload_0         
	//   76  162:new             #405 <Class BufferedWriter>
	//   77  165:dup             
	//   78  166:new             #407 <Class OutputStreamWriter>
	//   79  169:dup             
	//   80  170:new             #409 <Class FileOutputStream>
	//   81  173:dup             
	//   82  174:aload_0         
	//   83  175:getfield        #99  <Field File journalFile>
	//   84  178:iconst_1        
	//   85  179:invokespecial   #412 <Method void FileOutputStream(File, boolean)>
	//   86  182:getstatic       #374 <Field java.nio.charset.Charset Util.US_ASCII>
	//   87  185:invokespecial   #415 <Method void OutputStreamWriter(java.io.OutputStream, java.nio.charset.Charset)>
	//   88  188:invokespecial   #418 <Method void BufferedWriter(Writer)>
	//   89  191:putfield        #116 <Field Writer journalWriter>
		Util.closeQuietly(((Closeable) (strictlinereader)));
	//   90  194:aload_3         
	//   91  195:invokestatic    #422 <Method void Util.closeQuietly(Closeable)>
		return;
	//   92  198:return          
_L2:
		StringBuilder stringbuilder = new StringBuilder();
	//   93  199:new             #183 <Class StringBuilder>
	//   94  202:dup             
	//   95  203:invokespecial   #184 <Method void StringBuilder()>
	//   96  206:astore          8
		stringbuilder.append("unexpected journal header: [");
	//   97  208:aload           8
	//   98  210:ldc2            #424 <String "unexpected journal header: [">
	//   99  213:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//  100  216:pop             
		stringbuilder.append(s);
	//  101  217:aload           8
	//  102  219:aload           4
	//  103  221:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//  104  224:pop             
		stringbuilder.append(", ");
	//  105  225:aload           8
	//  106  227:ldc2            #426 <String ", ">
	//  107  230:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//  108  233:pop             
		stringbuilder.append(s1);
	//  109  234:aload           8
	//  110  236:aload           5
	//  111  238:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//  112  241:pop             
		stringbuilder.append(", ");
	//  113  242:aload           8
	//  114  244:ldc2            #426 <String ", ">
	//  115  247:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//  116  250:pop             
		stringbuilder.append(s2);
	//  117  251:aload           8
	//  118  253:aload           6
	//  119  255:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//  120  258:pop             
		stringbuilder.append(", ");
	//  121  259:aload           8
	//  122  261:ldc2            #426 <String ", ">
	//  123  264:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//  124  267:pop             
		stringbuilder.append(s3);
	//  125  268:aload           8
	//  126  270:aload           7
	//  127  272:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//  128  275:pop             
		stringbuilder.append("]");
	//  129  276:aload           8
	//  130  278:ldc2            #428 <String "]">
	//  131  281:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//  132  284:pop             
		throw new IOException(stringbuilder.toString());
	//  133  285:new             #121 <Class IOException>
	//  134  288:dup             
	//  135  289:aload           8
	//  136  291:invokevirtual   #197 <Method String StringBuilder.toString()>
	//  137  294:invokespecial   #429 <Method void IOException(String)>
	//  138  297:athrow          
		Object obj;
		obj;
	//  139  298:astore          4
		Util.closeQuietly(((Closeable) (strictlinereader)));
	//  140  300:aload_3         
	//  141  301:invokestatic    #422 <Method void Util.closeQuietly(Closeable)>
		throw obj;
	//  142  304:aload           4
	//  143  306:athrow          
		obj;
	//  144  307:astore          4
		if(true) goto _L4; else goto _L6
	//  145  309:goto            134
_L6:
	}

	private void readJournalLine(String s)
		throws IOException
	{
		int i = s.indexOf(' ');
	//    0    0:aload_1         
	//    1    1:bipush          32
	//    2    3:invokevirtual   #433 <Method int String.indexOf(int)>
	//    3    6:istore_2        
		if(i != -1)
	//*   4    7:iload_2         
	//*   5    8:iconst_m1       
	//*   6    9:icmpeq          284
		{
			int j = i + 1;
	//    7   12:iload_2         
	//    8   13:iconst_1        
	//    9   14:iadd            
	//   10   15:istore_3        
			int k = s.indexOf(' ', j);
	//   11   16:aload_1         
	//   12   17:bipush          32
	//   13   19:iload_3         
	//   14   20:invokevirtual   #436 <Method int String.indexOf(int, int)>
	//   15   23:istore          4
			String s1;
			if(k == -1)
	//*  16   25:iload           4
	//*  17   27:iconst_m1       
	//*  18   28:icmpne          72
			{
				String s2 = s.substring(j);
	//   19   31:aload_1         
	//   20   32:iload_3         
	//   21   33:invokevirtual   #439 <Method String String.substring(int)>
	//   22   36:astore          6
				s1 = s2;
	//   23   38:aload           6
	//   24   40:astore          5
				if(i == 6)
	//*  25   42:iload_2         
	//*  26   43:bipush          6
	//*  27   45:icmpne          81
				{
					s1 = s2;
	//   28   48:aload           6
	//   29   50:astore          5
					if(s.startsWith("REMOVE"))
	//*  30   52:aload_1         
	//*  31   53:ldc1            #251 <String "REMOVE">
	//*  32   55:invokevirtual   #443 <Method boolean String.startsWith(String)>
	//*  33   58:ifeq            81
					{
						lruEntries.remove(((Object) (s2)));
	//   34   61:aload_0         
	//   35   62:getfield        #58  <Field LinkedHashMap lruEntries>
	//   36   65:aload           6
	//   37   67:invokevirtual   #249 <Method Object LinkedHashMap.remove(Object)>
	//   38   70:pop             
						return;
	//   39   71:return          
					}
				}
			} else
			{
				s1 = s.substring(j, k);
	//   40   72:aload_1         
	//   41   73:iload_3         
	//   42   74:iload           4
	//   43   76:invokevirtual   #446 <Method String String.substring(int, int)>
	//   44   79:astore          5
			}
			Entry entry1 = (Entry)lruEntries.get(((Object) (s1)));
	//   45   81:aload_0         
	//   46   82:getfield        #58  <Field LinkedHashMap lruEntries>
	//   47   85:aload           5
	//   48   87:invokevirtual   #270 <Method Object LinkedHashMap.get(Object)>
	//   49   90:checkcast       #16  <Class DiskLruCache$Entry>
	//   50   93:astore          7
			Entry entry = entry1;
	//   51   95:aload           7
	//   52   97:astore          6
			if(entry1 == null)
	//*  53   99:aload           7
	//*  54  101:ifnonnull       129
			{
				entry = new Entry(s1);
	//   55  104:new             #16  <Class DiskLruCache$Entry>
	//   56  107:dup             
	//   57  108:aload_0         
	//   58  109:aload           5
	//   59  111:aconst_null     
	//   60  112:invokespecial   #279 <Method void DiskLruCache$Entry(DiskLruCache, String, DiskLruCache$1)>
	//   61  115:astore          6
				lruEntries.put(((Object) (s1)), ((Object) (entry)));
	//   62  117:aload_0         
	//   63  118:getfield        #58  <Field LinkedHashMap lruEntries>
	//   64  121:aload           5
	//   65  123:aload           6
	//   66  125:invokevirtual   #283 <Method Object LinkedHashMap.put(Object, Object)>
	//   67  128:pop             
			}
			if(k != -1 && i == 5 && s.startsWith("CLEAN"))
	//*  68  129:iload           4
	//*  69  131:iconst_m1       
	//*  70  132:icmpeq          185
	//*  71  135:iload_2         
	//*  72  136:iconst_5        
	//*  73  137:icmpne          185
	//*  74  140:aload_1         
	//*  75  141:ldc1            #226 <String "CLEAN">
	//*  76  143:invokevirtual   #443 <Method boolean String.startsWith(String)>
	//*  77  146:ifeq            185
			{
				s = ((String) (s.substring(k + 1).split(" ")));
	//   78  149:aload_1         
	//   79  150:iload           4
	//   80  152:iconst_1        
	//   81  153:iadd            
	//   82  154:invokevirtual   #439 <Method String String.substring(int)>
	//   83  157:ldc2            #448 <String " ">
	//   84  160:invokevirtual   #452 <Method String[] String.split(String)>
	//   85  163:astore_1        
				entry.readable = true;
	//   86  164:aload           6
	//   87  166:iconst_1        
	//   88  167:invokestatic    #224 <Method boolean DiskLruCache$Entry.access$702(DiskLruCache$Entry, boolean)>
	//   89  170:pop             
				entry.currentEditor = null;
	//   90  171:aload           6
	//   91  173:aconst_null     
	//   92  174:invokestatic    #220 <Method DiskLruCache$Editor DiskLruCache$Entry.access$802(DiskLruCache$Entry, DiskLruCache$Editor)>
	//   93  177:pop             
				entry.setLengths(((String []) (s)));
	//   94  178:aload           6
	//   95  180:aload_1         
	//   96  181:invokestatic    #456 <Method void DiskLruCache$Entry.access$900(DiskLruCache$Entry, String[])>
				return;
	//   97  184:return          
			}
			if(k == -1 && i == 5 && s.startsWith("DIRTY"))
	//*  98  185:iload           4
	//*  99  187:iconst_m1       
	//* 100  188:icmpne          224
	//* 101  191:iload_2         
	//* 102  192:iconst_5        
	//* 103  193:icmpne          224
	//* 104  196:aload_1         
	//* 105  197:ldc2            #288 <String "DIRTY">
	//* 106  200:invokevirtual   #443 <Method boolean String.startsWith(String)>
	//* 107  203:ifeq            224
			{
				entry.currentEditor = new Editor(entry);
	//  108  206:aload           6
	//  109  208:new             #13  <Class DiskLruCache$Editor>
	//  110  211:dup             
	//  111  212:aload_0         
	//  112  213:aload           6
	//  113  215:aconst_null     
	//  114  216:invokespecial   #286 <Method void DiskLruCache$Editor(DiskLruCache, DiskLruCache$Entry, DiskLruCache$1)>
	//  115  219:invokestatic    #220 <Method DiskLruCache$Editor DiskLruCache$Entry.access$802(DiskLruCache$Entry, DiskLruCache$Editor)>
	//  116  222:pop             
				return;
	//  117  223:return          
			}
			if(k == -1 && i == 4 && s.startsWith("READ"))
	//* 118  224:iload           4
	//* 119  226:iconst_m1       
	//* 120  227:icmpne          246
	//* 121  230:iload_2         
	//* 122  231:iconst_4        
	//* 123  232:icmpne          246
	//* 124  235:aload_1         
	//* 125  236:ldc2            #458 <String "READ">
	//* 126  239:invokevirtual   #443 <Method boolean String.startsWith(String)>
	//* 127  242:ifeq            246
			{
				return;
	//  128  245:return          
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//  129  246:new             #183 <Class StringBuilder>
	//  130  249:dup             
	//  131  250:invokespecial   #184 <Method void StringBuilder()>
	//  132  253:astore          5
				stringbuilder.append("unexpected journal line: ");
	//  133  255:aload           5
	//  134  257:ldc2            #460 <String "unexpected journal line: ">
	//  135  260:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//  136  263:pop             
				stringbuilder.append(s);
	//  137  264:aload           5
	//  138  266:aload_1         
	//  139  267:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//  140  270:pop             
				throw new IOException(stringbuilder.toString());
	//  141  271:new             #121 <Class IOException>
	//  142  274:dup             
	//  143  275:aload           5
	//  144  277:invokevirtual   #197 <Method String StringBuilder.toString()>
	//  145  280:invokespecial   #429 <Method void IOException(String)>
	//  146  283:athrow          
			}
		} else
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//  147  284:new             #183 <Class StringBuilder>
	//  148  287:dup             
	//  149  288:invokespecial   #184 <Method void StringBuilder()>
	//  150  291:astore          5
			stringbuilder1.append("unexpected journal line: ");
	//  151  293:aload           5
	//  152  295:ldc2            #460 <String "unexpected journal line: ">
	//  153  298:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//  154  301:pop             
			stringbuilder1.append(s);
	//  155  302:aload           5
	//  156  304:aload_1         
	//  157  305:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//  158  308:pop             
			throw new IOException(stringbuilder1.toString());
	//  159  309:new             #121 <Class IOException>
	//  160  312:dup             
	//  161  313:aload           5
	//  162  315:invokevirtual   #197 <Method String StringBuilder.toString()>
	//  163  318:invokespecial   #429 <Method void IOException(String)>
	//  164  321:athrow          
		}
	}

	private void rebuildJournal()
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		BufferedWriter bufferedwriter;
		if(journalWriter != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #116 <Field Writer journalWriter>
	//*   4    6:ifnull          16
			journalWriter.close();
	//    5    9:aload_0         
	//    6   10:getfield        #116 <Field Writer journalWriter>
	//    7   13:invokevirtual   #463 <Method void Writer.close()>
		bufferedwriter = new BufferedWriter(((Writer) (new OutputStreamWriter(((java.io.OutputStream) (new FileOutputStream(journalFileTmp))), Util.US_ASCII))));
	//    8   16:new             #405 <Class BufferedWriter>
	//    9   19:dup             
	//   10   20:new             #407 <Class OutputStreamWriter>
	//   11   23:dup             
	//   12   24:new             #409 <Class FileOutputStream>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:getfield        #103 <Field File journalFileTmp>
	//   16   32:invokespecial   #464 <Method void FileOutputStream(File)>
	//   17   35:getstatic       #374 <Field java.nio.charset.Charset Util.US_ASCII>
	//   18   38:invokespecial   #415 <Method void OutputStreamWriter(java.io.OutputStream, java.nio.charset.Charset)>
	//   19   41:invokespecial   #418 <Method void BufferedWriter(Writer)>
	//   20   44:astore_1        
		Iterator iterator;
		((Writer) (bufferedwriter)).write("libcore.io.DiskLruCache");
	//   21   45:aload_1         
	//   22   46:ldc2            #382 <String "libcore.io.DiskLruCache">
	//   23   49:invokevirtual   #467 <Method void Writer.write(String)>
		((Writer) (bufferedwriter)).write("\n");
	//   24   52:aload_1         
	//   25   53:ldc2            #469 <String "\n">
	//   26   56:invokevirtual   #467 <Method void Writer.write(String)>
		((Writer) (bufferedwriter)).write("1");
	//   27   59:aload_1         
	//   28   60:ldc2            #390 <String "1">
	//   29   63:invokevirtual   #467 <Method void Writer.write(String)>
		((Writer) (bufferedwriter)).write("\n");
	//   30   66:aload_1         
	//   31   67:ldc2            #469 <String "\n">
	//   32   70:invokevirtual   #467 <Method void Writer.write(String)>
		((Writer) (bufferedwriter)).write(Integer.toString(appVersion));
	//   33   73:aload_1         
	//   34   74:aload_0         
	//   35   75:getfield        #90  <Field int appVersion>
	//   36   78:invokestatic    #395 <Method String Integer.toString(int)>
	//   37   81:invokevirtual   #467 <Method void Writer.write(String)>
		((Writer) (bufferedwriter)).write("\n");
	//   38   84:aload_1         
	//   39   85:ldc2            #469 <String "\n">
	//   40   88:invokevirtual   #467 <Method void Writer.write(String)>
		((Writer) (bufferedwriter)).write(Integer.toString(valueCount));
	//   41   91:aload_1         
	//   42   92:aload_0         
	//   43   93:getfield        #109 <Field int valueCount>
	//   44   96:invokestatic    #395 <Method String Integer.toString(int)>
	//   45   99:invokevirtual   #467 <Method void Writer.write(String)>
		((Writer) (bufferedwriter)).write("\n");
	//   46  102:aload_1         
	//   47  103:ldc2            #469 <String "\n">
	//   48  106:invokevirtual   #467 <Method void Writer.write(String)>
		((Writer) (bufferedwriter)).write("\n");
	//   49  109:aload_1         
	//   50  110:ldc2            #469 <String "\n">
	//   51  113:invokevirtual   #467 <Method void Writer.write(String)>
		iterator = lruEntries.values().iterator();
	//   52  116:aload_0         
	//   53  117:getfield        #58  <Field LinkedHashMap lruEntries>
	//   54  120:invokevirtual   #343 <Method Collection LinkedHashMap.values()>
	//   55  123:invokeinterface #349 <Method Iterator Collection.iterator()>
	//   56  128:astore_2        
_L1:
		Entry entry;
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_261;
	//   57  129:aload_2         
	//   58  130:invokeinterface #354 <Method boolean Iterator.hasNext()>
	//   59  135:ifeq            261
			entry = (Entry)iterator.next();
	//   60  138:aload_2         
	//   61  139:invokeinterface #358 <Method Object Iterator.next()>
	//   62  144:checkcast       #16  <Class DiskLruCache$Entry>
	//   63  147:astore_3        
			if(entry.currentEditor == null)
				break MISSING_BLOCK_LABEL_203;
	//   64  148:aload_3         
	//   65  149:invokestatic    #163 <Method DiskLruCache$Editor DiskLruCache$Entry.access$800(DiskLruCache$Entry)>
	//   66  152:ifnull          203
			StringBuilder stringbuilder = new StringBuilder();
	//   67  155:new             #183 <Class StringBuilder>
	//   68  158:dup             
	//   69  159:invokespecial   #184 <Method void StringBuilder()>
	//   70  162:astore          4
			stringbuilder.append("DIRTY ");
	//   71  164:aload           4
	//   72  166:ldc2            #471 <String "DIRTY ">
	//   73  169:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   74  172:pop             
			stringbuilder.append(entry.key);
	//   75  173:aload           4
	//   76  175:aload_3         
	//   77  176:invokestatic    #238 <Method String DiskLruCache$Entry.access$1200(DiskLruCache$Entry)>
	//   78  179:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   79  182:pop             
			stringbuilder.append('\n');
	//   80  183:aload           4
	//   81  185:bipush          10
	//   82  187:invokevirtual   #474 <Method StringBuilder StringBuilder.append(char)>
	//   83  190:pop             
			((Writer) (bufferedwriter)).write(stringbuilder.toString());
	//   84  191:aload_1         
	//   85  192:aload           4
	//   86  194:invokevirtual   #197 <Method String StringBuilder.toString()>
	//   87  197:invokevirtual   #467 <Method void Writer.write(String)>
		} while(true);
	//   88  200:goto            129
		StringBuilder stringbuilder1 = new StringBuilder();
	//   89  203:new             #183 <Class StringBuilder>
	//   90  206:dup             
	//   91  207:invokespecial   #184 <Method void StringBuilder()>
	//   92  210:astore          4
		stringbuilder1.append("CLEAN ");
	//   93  212:aload           4
	//   94  214:ldc2            #476 <String "CLEAN ">
	//   95  217:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   96  220:pop             
		stringbuilder1.append(entry.key);
	//   97  221:aload           4
	//   98  223:aload_3         
	//   99  224:invokestatic    #238 <Method String DiskLruCache$Entry.access$1200(DiskLruCache$Entry)>
	//  100  227:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//  101  230:pop             
		stringbuilder1.append(entry.getLengths());
	//  102  231:aload           4
	//  103  233:aload_3         
	//  104  234:invokevirtual   #241 <Method String DiskLruCache$Entry.getLengths()>
	//  105  237:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//  106  240:pop             
		stringbuilder1.append('\n');
	//  107  241:aload           4
	//  108  243:bipush          10
	//  109  245:invokevirtual   #474 <Method StringBuilder StringBuilder.append(char)>
	//  110  248:pop             
		((Writer) (bufferedwriter)).write(stringbuilder1.toString());
	//  111  249:aload_1         
	//  112  250:aload           4
	//  113  252:invokevirtual   #197 <Method String StringBuilder.toString()>
	//  114  255:invokevirtual   #467 <Method void Writer.write(String)>
		  goto _L1
	//* 115  258:goto            129
		((Writer) (bufferedwriter)).close();
	//  116  261:aload_1         
	//  117  262:invokevirtual   #463 <Method void Writer.close()>
		if(journalFile.exists())
	//* 118  265:aload_0         
	//* 119  266:getfield        #99  <Field File journalFile>
	//* 120  269:invokevirtual   #178 <Method boolean File.exists()>
	//* 121  272:ifeq            287
			renameTo(journalFile, journalFileBackup, true);
	//  122  275:aload_0         
	//  123  276:getfield        #99  <Field File journalFile>
	//  124  279:aload_0         
	//  125  280:getfield        #107 <Field File journalFileBackup>
	//  126  283:iconst_1        
	//  127  284:invokestatic    #296 <Method void renameTo(File, File, boolean)>
		renameTo(journalFileTmp, journalFile, false);
	//  128  287:aload_0         
	//  129  288:getfield        #103 <Field File journalFileTmp>
	//  130  291:aload_0         
	//  131  292:getfield        #99  <Field File journalFile>
	//  132  295:iconst_0        
	//  133  296:invokestatic    #296 <Method void renameTo(File, File, boolean)>
		journalFileBackup.delete();
	//  134  299:aload_0         
	//  135  300:getfield        #107 <Field File journalFileBackup>
	//  136  303:invokevirtual   #262 <Method boolean File.delete()>
	//  137  306:pop             
		journalWriter = ((Writer) (new BufferedWriter(((Writer) (new OutputStreamWriter(((java.io.OutputStream) (new FileOutputStream(journalFile, true))), Util.US_ASCII))))));
	//  138  307:aload_0         
	//  139  308:new             #405 <Class BufferedWriter>
	//  140  311:dup             
	//  141  312:new             #407 <Class OutputStreamWriter>
	//  142  315:dup             
	//  143  316:new             #409 <Class FileOutputStream>
	//  144  319:dup             
	//  145  320:aload_0         
	//  146  321:getfield        #99  <Field File journalFile>
	//  147  324:iconst_1        
	//  148  325:invokespecial   #412 <Method void FileOutputStream(File, boolean)>
	//  149  328:getstatic       #374 <Field java.nio.charset.Charset Util.US_ASCII>
	//  150  331:invokespecial   #415 <Method void OutputStreamWriter(java.io.OutputStream, java.nio.charset.Charset)>
	//  151  334:invokespecial   #418 <Method void BufferedWriter(Writer)>
	//  152  337:putfield        #116 <Field Writer journalWriter>
		this;
	//  153  340:aload_0         
		JVM INSTR monitorexit ;
	//  154  341:monitorexit     
		return;
	//  155  342:return          
		Exception exception1;
		exception1;
	//  156  343:astore_2        
		((Writer) (bufferedwriter)).close();
	//  157  344:aload_1         
	//  158  345:invokevirtual   #463 <Method void Writer.close()>
		throw exception1;
	//  159  348:aload_2         
	//  160  349:athrow          
		Exception exception;
		exception;
	//  161  350:astore_1        
		this;
	//  162  351:aload_0         
		JVM INSTR monitorexit ;
	//  163  352:monitorexit     
		throw exception;
	//  164  353:aload_1         
	//  165  354:athrow          
	}

	private static void renameTo(File file, File file1, boolean flag)
		throws IOException
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            8
			deleteIfExists(file1);
	//    2    4:aload_1         
	//    3    5:invokestatic    #216 <Method void deleteIfExists(File)>
		if(file.renameTo(file1))
	//*   4    8:aload_0         
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #204 <Method boolean File.renameTo(File)>
	//*   7   13:ifeq            17
			return;
	//    8   16:return          
		else
			throw new IOException();
	//    9   17:new             #121 <Class IOException>
	//   10   20:dup             
	//   11   21:invokespecial   #263 <Method void IOException()>
	//   12   24:athrow          
	}

	private void trimToSize()
		throws IOException
	{
		while(size > maxSize) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field long size>
	//*   2    4:aload_0         
	//*   3    5:getfield        #111 <Field long maxSize>
	//*   4    8:lcmp            
	//*   5    9:ifle            48
			remove((String)((java.util.Map.Entry)lruEntries.entrySet().iterator().next()).getKey());
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #58  <Field LinkedHashMap lruEntries>
	//    9   17:invokevirtual   #480 <Method Set LinkedHashMap.entrySet()>
	//   10   20:invokeinterface #483 <Method Iterator Set.iterator()>
	//   11   25:invokeinterface #358 <Method Object Iterator.next()>
	//   12   30:checkcast       #485 <Class java.util.Map$Entry>
	//   13   33:invokeinterface #488 <Method Object java.util.Map$Entry.getKey()>
	//   14   38:checkcast       #384 <Class String>
	//   15   41:invokevirtual   #490 <Method boolean remove(String)>
	//   16   44:pop             
	//*  17   45:goto            0
	//   18   48:return          
	}

	public void close()
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Writer writer = journalWriter;
	//    2    2:aload_0         
	//    3    3:getfield        #116 <Field Writer journalWriter>
	//    4    6:astore_1        
		if(writer != null)
			break MISSING_BLOCK_LABEL_14;
	//    5    7:aload_1         
	//    6    8:ifnonnull       14
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		Iterator iterator = (new ArrayList(lruEntries.values())).iterator();
	//   10   14:new             #492 <Class ArrayList>
	//   11   17:dup             
	//   12   18:aload_0         
	//   13   19:getfield        #58  <Field LinkedHashMap lruEntries>
	//   14   22:invokevirtual   #343 <Method Collection LinkedHashMap.values()>
	//   15   25:invokespecial   #495 <Method void ArrayList(Collection)>
	//   16   28:invokevirtual   #496 <Method Iterator ArrayList.iterator()>
	//   17   31:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//   18   32:aload_1         
	//   19   33:invokeinterface #354 <Method boolean Iterator.hasNext()>
	//   20   38:ifeq            68
			Entry entry = (Entry)iterator.next();
	//   21   41:aload_1         
	//   22   42:invokeinterface #358 <Method Object Iterator.next()>
	//   23   47:checkcast       #16  <Class DiskLruCache$Entry>
	//   24   50:astore_2        
			if(entry.currentEditor != null)
	//*  25   51:aload_2         
	//*  26   52:invokestatic    #163 <Method DiskLruCache$Editor DiskLruCache$Entry.access$800(DiskLruCache$Entry)>
	//*  27   55:ifnull          32
				entry.currentEditor.abort();
	//   28   58:aload_2         
	//   29   59:invokestatic    #163 <Method DiskLruCache$Editor DiskLruCache$Entry.access$800(DiskLruCache$Entry)>
	//   30   62:invokevirtual   #181 <Method void DiskLruCache$Editor.abort()>
		} while(true);
	//   31   65:goto            32
		trimToSize();
	//   32   68:aload_0         
	//   33   69:invokespecial   #124 <Method void trimToSize()>
		journalWriter.close();
	//   34   72:aload_0         
	//   35   73:getfield        #116 <Field Writer journalWriter>
	//   36   76:invokevirtual   #463 <Method void Writer.close()>
		journalWriter = null;
	//   37   79:aload_0         
	//   38   80:aconst_null     
	//   39   81:putfield        #116 <Field Writer journalWriter>
		this;
	//   40   84:aload_0         
		JVM INSTR monitorexit ;
	//   41   85:monitorexit     
		return;
	//   42   86:return          
		Exception exception;
		exception;
	//   43   87:astore_1        
	//*  44   88:aload_0         
		throw exception;
	//   45   89:monitorexit     
	//   46   90:aload_1         
	//   47   91:athrow          
	}

	public void delete()
		throws IOException
	{
		close();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #497 <Method void close()>
		Util.deleteContents(directory);
	//    2    4:aload_0         
	//    3    5:getfield        #88  <Field File directory>
	//    4    8:invokestatic    #500 <Method void Util.deleteContents(File)>
	//    5   11:return          
	}

	public Editor edit(String s)
		throws IOException
	{
		return edit(s, -1L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2w           #271 <Long -1L>
	//    3    5:invokespecial   #503 <Method DiskLruCache$Editor edit(String, long)>
	//    4    8:areturn         
	}

	public Value get(String s)
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Entry entry;
		checkNotClosed();
	//    2    2:aload_0         
	//    3    3:invokespecial   #267 <Method void checkNotClosed()>
		entry = (Entry)lruEntries.get(((Object) (s)));
	//    4    6:aload_0         
	//    5    7:getfield        #58  <Field LinkedHashMap lruEntries>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #270 <Method Object LinkedHashMap.get(Object)>
	//    8   14:checkcast       #16  <Class DiskLruCache$Entry>
	//    9   17:astore          5
		if(entry != null)
			break MISSING_BLOCK_LABEL_28;
	//   10   19:aload           5
	//   11   21:ifnonnull       28
		this;
	//   12   24:aload_0         
		JVM INSTR monitorexit ;
	//   13   25:monitorexit     
		return null;
	//   14   26:aconst_null     
	//   15   27:areturn         
		boolean flag = entry.readable;
	//   16   28:aload           5
	//   17   30:invokestatic    #167 <Method boolean DiskLruCache$Entry.access$700(DiskLruCache$Entry)>
	//   18   33:istore          4
		if(flag)
			break MISSING_BLOCK_LABEL_44;
	//   19   35:iload           4
	//   20   37:ifne            44
		this;
	//   21   40:aload_0         
		JVM INSTR monitorexit ;
	//   22   41:monitorexit     
		return null;
	//   23   42:aconst_null     
	//   24   43:areturn         
		int j;
		File afile[];
		afile = entry.cleanFiles;
	//   25   44:aload           5
	//   26   46:getfield        #508 <Field File[] DiskLruCache$Entry.cleanFiles>
	//   27   49:astore          6
		j = afile.length;
	//   28   51:aload           6
	//   29   53:arraylength     
	//   30   54:istore_3        
		int i = 0;
	//   31   55:iconst_0        
	//   32   56:istore_2        
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   33   57:iload_2         
	//   34   58:iload_3         
	//   35   59:icmpge          87
		flag = afile[i].exists();
	//   36   62:aload           6
	//   37   64:iload_2         
	//   38   65:aaload          
	//   39   66:invokevirtual   #178 <Method boolean File.exists()>
	//   40   69:istore          4
		if(flag)
			break MISSING_BLOCK_LABEL_80;
	//   41   71:iload           4
	//   42   73:ifne            80
		this;
	//   43   76:aload_0         
		JVM INSTR monitorexit ;
	//   44   77:monitorexit     
		return null;
	//   45   78:aconst_null     
	//   46   79:areturn         
		i++;
	//   47   80:iload_2         
	//   48   81:iconst_1        
	//   49   82:iadd            
	//   50   83:istore_2        
		if(true) goto _L2; else goto _L1
	//   51   84:goto            57
_L1:
		redundantOpCount = redundantOpCount + 1;
	//   52   87:aload_0         
	//   53   88:aload_0         
	//   54   89:getfield        #147 <Field int redundantOpCount>
	//   55   92:iconst_1        
	//   56   93:iadd            
	//   57   94:putfield        #147 <Field int redundantOpCount>
		journalWriter.append("READ");
	//   58   97:aload_0         
	//   59   98:getfield        #116 <Field Writer journalWriter>
	//   60  101:ldc2            #458 <String "READ">
	//   61  104:invokevirtual   #231 <Method Writer Writer.append(CharSequence)>
	//   62  107:pop             
		journalWriter.append(' ');
	//   63  108:aload_0         
	//   64  109:getfield        #116 <Field Writer journalWriter>
	//   65  112:bipush          32
	//   66  114:invokevirtual   #234 <Method Writer Writer.append(char)>
	//   67  117:pop             
		journalWriter.append(((CharSequence) (s)));
	//   68  118:aload_0         
	//   69  119:getfield        #116 <Field Writer journalWriter>
	//   70  122:aload_1         
	//   71  123:invokevirtual   #231 <Method Writer Writer.append(CharSequence)>
	//   72  126:pop             
		journalWriter.append('\n');
	//   73  127:aload_0         
	//   74  128:getfield        #116 <Field Writer journalWriter>
	//   75  131:bipush          10
	//   76  133:invokevirtual   #234 <Method Writer Writer.append(char)>
	//   77  136:pop             
		if(journalRebuildRequired())
	//*  78  137:aload_0         
	//*  79  138:invokespecial   #139 <Method boolean journalRebuildRequired()>
	//*  80  141:ifeq            156
			executorService.submit(cleanupCallable);
	//   81  144:aload_0         
	//   82  145:getfield        #81  <Field ThreadPoolExecutor executorService>
	//   83  148:aload_0         
	//   84  149:getfield        #86  <Field Callable cleanupCallable>
	//   85  152:invokevirtual   #258 <Method java.util.concurrent.Future ThreadPoolExecutor.submit(Callable)>
	//   86  155:pop             
		s = ((String) (new Value(s, entry.sequenceNumber, entry.cleanFiles, entry.lengths)));
	//   87  156:new             #19  <Class DiskLruCache$Value>
	//   88  159:dup             
	//   89  160:aload_0         
	//   90  161:aload_1         
	//   91  162:aload           5
	//   92  164:invokestatic    #276 <Method long DiskLruCache$Entry.access$1300(DiskLruCache$Entry)>
	//   93  167:aload           5
	//   94  169:getfield        #508 <Field File[] DiskLruCache$Entry.cleanFiles>
	//   95  172:aload           5
	//   96  174:invokestatic    #208 <Method long[] DiskLruCache$Entry.access$1100(DiskLruCache$Entry)>
	//   97  177:aconst_null     
	//   98  178:invokespecial   #511 <Method void DiskLruCache$Value(DiskLruCache, String, long, File[], long[], DiskLruCache$1)>
	//   99  181:astore_1        
		this;
	//  100  182:aload_0         
		JVM INSTR monitorexit ;
	//  101  183:monitorexit     
		return ((Value) (s));
	//  102  184:aload_1         
	//  103  185:areturn         
		s;
	//  104  186:astore_1        
	//* 105  187:aload_0         
		throw s;
	//  106  188:monitorexit     
	//  107  189:aload_1         
	//  108  190:athrow          
	}

	public boolean remove(String s)
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Entry entry;
		checkNotClosed();
	//    2    2:aload_0         
	//    3    3:invokespecial   #267 <Method void checkNotClosed()>
		entry = (Entry)lruEntries.get(((Object) (s)));
	//    4    6:aload_0         
	//    5    7:getfield        #58  <Field LinkedHashMap lruEntries>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #270 <Method Object LinkedHashMap.get(Object)>
	//    8   14:checkcast       #16  <Class DiskLruCache$Entry>
	//    9   17:astore          4
		int i;
		i = 0;
	//   10   19:iconst_0        
	//   11   20:istore_2        
		if(entry == null)
			break MISSING_BLOCK_LABEL_215;
	//   12   21:aload           4
	//   13   23:ifnull          215
		if(entry.currentEditor != null)
	//*  14   26:aload           4
	//*  15   28:invokestatic    #163 <Method DiskLruCache$Editor DiskLruCache$Entry.access$800(DiskLruCache$Entry)>
	//*  16   31:ifnull          37
			break MISSING_BLOCK_LABEL_215;
	//   17   34:goto            215
_L2:
		File file;
		if(i >= valueCount)
			break; /* Loop/switch isn't completed */
	//   18   37:iload_2         
	//   19   38:aload_0         
	//   20   39:getfield        #109 <Field int valueCount>
	//   21   42:icmpge          134
		file = entry.getCleanFile(i);
	//   22   45:aload           4
	//   23   47:iload_2         
	//   24   48:invokevirtual   #200 <Method File DiskLruCache$Entry.getCleanFile(int)>
	//   25   51:astore_3        
		if(!file.exists() || file.delete())
	//*  26   52:aload_3         
	//*  27   53:invokevirtual   #178 <Method boolean File.exists()>
	//*  28   56:ifeq            103
	//*  29   59:aload_3         
	//*  30   60:invokevirtual   #262 <Method boolean File.delete()>
	//*  31   63:ifeq            69
			break MISSING_BLOCK_LABEL_103;
	//   32   66:goto            103
		s = ((String) (new StringBuilder()));
	//   33   69:new             #183 <Class StringBuilder>
	//   34   72:dup             
	//   35   73:invokespecial   #184 <Method void StringBuilder()>
	//   36   76:astore_1        
		((StringBuilder) (s)).append("failed to delete ");
	//   37   77:aload_1         
	//   38   78:ldc2            #513 <String "failed to delete ">
	//   39   81:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   40   84:pop             
		((StringBuilder) (s)).append(((Object) (file)));
	//   41   85:aload_1         
	//   42   86:aload_3         
	//   43   87:invokevirtual   #315 <Method StringBuilder StringBuilder.append(Object)>
	//   44   90:pop             
		throw new IOException(((StringBuilder) (s)).toString());
	//   45   91:new             #121 <Class IOException>
	//   46   94:dup             
	//   47   95:aload_1         
	//   48   96:invokevirtual   #197 <Method String StringBuilder.toString()>
	//   49   99:invokespecial   #429 <Method void IOException(String)>
	//   50  102:athrow          
		size = size - entry.lengths[i];
	//   51  103:aload_0         
	//   52  104:aload_0         
	//   53  105:getfield        #50  <Field long size>
	//   54  108:aload           4
	//   55  110:invokestatic    #208 <Method long[] DiskLruCache$Entry.access$1100(DiskLruCache$Entry)>
	//   56  113:iload_2         
	//   57  114:laload          
	//   58  115:lsub            
	//   59  116:putfield        #50  <Field long size>
		entry.lengths[i] = 0L;
	//   60  119:aload           4
	//   61  121:invokestatic    #208 <Method long[] DiskLruCache$Entry.access$1100(DiskLruCache$Entry)>
	//   62  124:iload_2         
	//   63  125:lconst_0        
	//   64  126:lastore         
		i++;
	//   65  127:iload_2         
	//   66  128:iconst_1        
	//   67  129:iadd            
	//   68  130:istore_2        
		if(true) goto _L2; else goto _L1
	//   69  131:goto            37
_L1:
		redundantOpCount = redundantOpCount + 1;
	//   70  134:aload_0         
	//   71  135:aload_0         
	//   72  136:getfield        #147 <Field int redundantOpCount>
	//   73  139:iconst_1        
	//   74  140:iadd            
	//   75  141:putfield        #147 <Field int redundantOpCount>
		journalWriter.append("REMOVE");
	//   76  144:aload_0         
	//   77  145:getfield        #116 <Field Writer journalWriter>
	//   78  148:ldc1            #251 <String "REMOVE">
	//   79  150:invokevirtual   #231 <Method Writer Writer.append(CharSequence)>
	//   80  153:pop             
		journalWriter.append(' ');
	//   81  154:aload_0         
	//   82  155:getfield        #116 <Field Writer journalWriter>
	//   83  158:bipush          32
	//   84  160:invokevirtual   #234 <Method Writer Writer.append(char)>
	//   85  163:pop             
		journalWriter.append(((CharSequence) (s)));
	//   86  164:aload_0         
	//   87  165:getfield        #116 <Field Writer journalWriter>
	//   88  168:aload_1         
	//   89  169:invokevirtual   #231 <Method Writer Writer.append(CharSequence)>
	//   90  172:pop             
		journalWriter.append('\n');
	//   91  173:aload_0         
	//   92  174:getfield        #116 <Field Writer journalWriter>
	//   93  177:bipush          10
	//   94  179:invokevirtual   #234 <Method Writer Writer.append(char)>
	//   95  182:pop             
		lruEntries.remove(((Object) (s)));
	//   96  183:aload_0         
	//   97  184:getfield        #58  <Field LinkedHashMap lruEntries>
	//   98  187:aload_1         
	//   99  188:invokevirtual   #249 <Method Object LinkedHashMap.remove(Object)>
	//  100  191:pop             
		if(journalRebuildRequired())
	//* 101  192:aload_0         
	//* 102  193:invokespecial   #139 <Method boolean journalRebuildRequired()>
	//* 103  196:ifeq            211
			executorService.submit(cleanupCallable);
	//  104  199:aload_0         
	//  105  200:getfield        #81  <Field ThreadPoolExecutor executorService>
	//  106  203:aload_0         
	//  107  204:getfield        #86  <Field Callable cleanupCallable>
	//  108  207:invokevirtual   #258 <Method java.util.concurrent.Future ThreadPoolExecutor.submit(Callable)>
	//  109  210:pop             
		this;
	//  110  211:aload_0         
		JVM INSTR monitorexit ;
	//  111  212:monitorexit     
		return true;
	//  112  213:iconst_1        
	//  113  214:ireturn         
		this;
	//  114  215:aload_0         
		JVM INSTR monitorexit ;
	//  115  216:monitorexit     
		return false;
	//  116  217:iconst_0        
	//  117  218:ireturn         
		s;
	//  118  219:astore_1        
	//* 119  220:aload_0         
		throw s;
	//  120  221:monitorexit     
	//  121  222:aload_1         
	//  122  223:athrow          
	}

	private final int appVersion;
	private final Callable cleanupCallable = new Callable() {

		public volatile Object call()
			throws Exception
		{
			return ((Object) (call()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #26  <Method Void call()>
		//    2    4:areturn         
		}

		public Void call()
			throws Exception
		{
label0:
			{
				synchronized(DiskLruCache.this)
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field DiskLruCache this$0>
		//*   2    4:astore_1        
		//*   3    5:aload_1         
		//*   4    6:monitorenter    
				{
					if(journalWriter != null)
						break label0;
		//    5    7:aload_0         
		//    6    8:getfield        #15  <Field DiskLruCache this$0>
		//    7   11:invokestatic    #31  <Method Writer DiskLruCache.access$100(DiskLruCache)>
		//    8   14:ifnonnull       21
				}
		//    9   17:aload_1         
		//   10   18:monitorexit     
				return null;
		//   11   19:aconst_null     
		//   12   20:areturn         
			}
			trimToSize();
		//   13   21:aload_0         
		//   14   22:getfield        #15  <Field DiskLruCache this$0>
		//   15   25:invokestatic    #34  <Method void DiskLruCache.access$200(DiskLruCache)>
			if(journalRebuildRequired())
		//*  16   28:aload_0         
		//*  17   29:getfield        #15  <Field DiskLruCache this$0>
		//*  18   32:invokestatic    #38  <Method boolean DiskLruCache.access$300(DiskLruCache)>
		//*  19   35:ifeq            54
			{
				rebuildJournal();
		//   20   38:aload_0         
		//   21   39:getfield        #15  <Field DiskLruCache this$0>
		//   22   42:invokestatic    #41  <Method void DiskLruCache.access$400(DiskLruCache)>
				redundantOpCount = 0;
		//   23   45:aload_0         
		//   24   46:getfield        #15  <Field DiskLruCache this$0>
		//   25   49:iconst_0        
		//   26   50:invokestatic    #45  <Method int DiskLruCache.access$502(DiskLruCache, int)>
		//   27   53:pop             
			}
			disklrucache;
		//   28   54:aload_1         
			JVM INSTR monitorexit ;
		//   29   55:monitorexit     
			return null;
		//   30   56:aconst_null     
		//   31   57:areturn         
			exception;
		//   32   58:astore_2        
			disklrucache;
		//   33   59:aload_1         
			JVM INSTR monitorexit ;
		//   34   60:monitorexit     
			throw exception;
		//   35   61:aload_2         
		//   36   62:athrow          
		}

		final DiskLruCache this$0;

			
			{
				this$0 = DiskLruCache.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field DiskLruCache this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private final File directory;
	final ThreadPoolExecutor executorService;
	private final File journalFile;
	private final File journalFileBackup;
	private final File journalFileTmp;
	private Writer journalWriter;
	private final LinkedHashMap lruEntries = new LinkedHashMap(0, 0.75F, true);
	private long maxSize;
	private long nextSequenceNumber;
	private int redundantOpCount;
	private long size;
	private final int valueCount;


/*
	static Writer access$100(DiskLruCache disklrucache)
	{
		return disklrucache.journalWriter;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field Writer journalWriter>
	//    2    4:areturn         
	}

*/


/*
	static int access$1900(DiskLruCache disklrucache)
	{
		return disklrucache.valueCount;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field int valueCount>
	//    2    4:ireturn         
	}

*/


/*
	static void access$200(DiskLruCache disklrucache)
		throws IOException
	{
		disklrucache.trimToSize();
	//    0    0:aload_0         
	//    1    1:invokespecial   #124 <Method void trimToSize()>
		return;
	//    2    4:return          
	}

*/


/*
	static File access$2000(DiskLruCache disklrucache)
	{
		return disklrucache.directory;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field File directory>
	//    2    4:areturn         
	}

*/


/*
	static void access$2100(DiskLruCache disklrucache, Editor editor, boolean flag)
		throws IOException
	{
		disklrucache.completeEdit(editor, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #133 <Method void completeEdit(DiskLruCache$Editor, boolean)>
		return;
	//    4    6:return          
	}

*/


/*
	static boolean access$300(DiskLruCache disklrucache)
	{
		return disklrucache.journalRebuildRequired();
	//    0    0:aload_0         
	//    1    1:invokespecial   #139 <Method boolean journalRebuildRequired()>
	//    2    4:ireturn         
	}

*/


/*
	static void access$400(DiskLruCache disklrucache)
		throws IOException
	{
		disklrucache.rebuildJournal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #143 <Method void rebuildJournal()>
		return;
	//    2    4:return          
	}

*/


/*
	static int access$502(DiskLruCache disklrucache, int i)
	{
		disklrucache.redundantOpCount = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #147 <Field int redundantOpCount>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/
}
