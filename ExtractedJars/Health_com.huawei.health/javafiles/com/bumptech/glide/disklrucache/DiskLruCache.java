// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.disklrucache;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

// Referenced classes of package com.bumptech.glide.disklrucache:
//			Util, StrictLineReader

public final class DiskLruCache
	implements Closeable
{
	static final class DiskLruCacheThreadFactory
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

		private InputStream newInputStream(int i)
			throws IOException
		{
			DiskLruCache disklrucache = DiskLruCache.this;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field DiskLruCache this$0>
		//    2    4:astore_3        
			disklrucache;
		//    3    5:aload_3         
			JVM INSTR monitorenter ;
		//    4    6:monitorenter    
			boolean flag;
			if(entry.currentEditor != this)
		//*   5    7:aload_0         
		//*   6    8:getfield        #24  <Field DiskLruCache$Entry entry>
		//*   7   11:invokestatic    #54  <Method DiskLruCache$Editor DiskLruCache$Entry.access$800(DiskLruCache$Entry)>
		//*   8   14:aload_0         
		//*   9   15:if_acmpeq       26
				throw new IllegalStateException();
		//   10   18:new             #56  <Class IllegalStateException>
		//   11   21:dup             
		//   12   22:invokespecial   #57  <Method void IllegalStateException()>
		//   13   25:athrow          
			flag = entry.readable;
		//   14   26:aload_0         
		//   15   27:getfield        #24  <Field DiskLruCache$Entry entry>
		//   16   30:invokestatic    #30  <Method boolean DiskLruCache$Entry.access$700(DiskLruCache$Entry)>
		//   17   33:istore_2        
			if(flag)
				break MISSING_BLOCK_LABEL_42;
		//   18   34:iload_2         
		//   19   35:ifne            42
			disklrucache;
		//   20   38:aload_3         
			JVM INSTR monitorexit ;
		//   21   39:monitorexit     
			return null;
		//   22   40:aconst_null     
		//   23   41:areturn         
			FileInputStream fileinputstream;
			try
			{
				fileinputstream = new FileInputStream(entry.getCleanFile(i));
		//   24   42:new             #59  <Class FileInputStream>
		//   25   45:dup             
		//   26   46:aload_0         
		//   27   47:getfield        #24  <Field DiskLruCache$Entry entry>
		//   28   50:iload_1         
		//   29   51:invokevirtual   #63  <Method File DiskLruCache$Entry.getCleanFile(int)>
		//   30   54:invokespecial   #66  <Method void FileInputStream(File)>
		//   31   57:astore          4
			}
		//*  32   59:aload_3         
		//*  33   60:monitorexit     
		//*  34   61:aload           4
		//*  35   63:areturn         
			catch(FileNotFoundException filenotfoundexception)
		//*  36   64:astore          4
		//*  37   66:aload_3         
			{
				return null;
		//   38   67:monitorexit     
		//   39   68:aconst_null     
		//   40   69:areturn         
			}
			disklrucache;
			JVM INSTR monitorexit ;
			return ((InputStream) (fileinputstream));
			Exception exception;
			exception;
		//   41   70:astore          4
		//*  42   72:aload_3         
			throw exception;
		//   43   73:monitorexit     
		//   44   74:aload           4
		//   45   76:athrow          
		}

		public void abort()
			throws IOException
		{
			completeEdit(this, false);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field DiskLruCache this$0>
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:invokestatic    #72  <Method void DiskLruCache.access$2100(DiskLruCache, DiskLruCache$Editor, boolean)>
		//    5    9:return          
		}

		public void abortUnlessCommitted()
		{
			if(!committed)
		//*   0    0:aload_0         
		//*   1    1:getfield        #75  <Field boolean committed>
		//*   2    4:ifne            13
				try
				{
					abort();
		//    3    7:aload_0         
		//    4    8:invokevirtual   #77  <Method void abort()>
					return;
		//    5   11:return          
				}
				catch(IOException ioexception) { }
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
		//    4    6:invokestatic    #72  <Method void DiskLruCache.access$2100(DiskLruCache, DiskLruCache$Editor, boolean)>
			committed = true;
		//    5    9:aload_0         
		//    6   10:iconst_1        
		//    7   11:putfield        #75  <Field boolean committed>
		//    8   14:return          
		}

		public File getFile(int i)
			throws IOException
		{
			DiskLruCache disklrucache = DiskLruCache.this;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field DiskLruCache this$0>
		//    2    4:astore_2        
			disklrucache;
		//    3    5:aload_2         
			JVM INSTR monitorenter ;
		//    4    6:monitorenter    
			File file;
			if(entry.currentEditor != this)
		//*   5    7:aload_0         
		//*   6    8:getfield        #24  <Field DiskLruCache$Entry entry>
		//*   7   11:invokestatic    #54  <Method DiskLruCache$Editor DiskLruCache$Entry.access$800(DiskLruCache$Entry)>
		//*   8   14:aload_0         
		//*   9   15:if_acmpeq       26
				throw new IllegalStateException();
		//   10   18:new             #56  <Class IllegalStateException>
		//   11   21:dup             
		//   12   22:invokespecial   #57  <Method void IllegalStateException()>
		//   13   25:athrow          
			if(!entry.readable)
		//*  14   26:aload_0         
		//*  15   27:getfield        #24  <Field DiskLruCache$Entry entry>
		//*  16   30:invokestatic    #30  <Method boolean DiskLruCache$Entry.access$700(DiskLruCache$Entry)>
		//*  17   33:ifne            43
				written[i] = true;
		//   18   36:aload_0         
		//   19   37:getfield        #36  <Field boolean[] written>
		//   20   40:iload_1         
		//   21   41:iconst_1        
		//   22   42:bastore         
			file = entry.getDirtyFile(i);
		//   23   43:aload_0         
		//   24   44:getfield        #24  <Field DiskLruCache$Entry entry>
		//   25   47:iload_1         
		//   26   48:invokevirtual   #82  <Method File DiskLruCache$Entry.getDirtyFile(int)>
		//   27   51:astore_3        
			if(!directory.exists())
		//*  28   52:aload_0         
		//*  29   53:getfield        #19  <Field DiskLruCache this$0>
		//*  30   56:invokestatic    #86  <Method File DiskLruCache.access$2000(DiskLruCache)>
		//*  31   59:invokevirtual   #92  <Method boolean File.exists()>
		//*  32   62:ifne            76
				directory.mkdirs();
		//   33   65:aload_0         
		//   34   66:getfield        #19  <Field DiskLruCache this$0>
		//   35   69:invokestatic    #86  <Method File DiskLruCache.access$2000(DiskLruCache)>
		//   36   72:invokevirtual   #95  <Method boolean File.mkdirs()>
		//   37   75:pop             
			disklrucache;
		//   38   76:aload_2         
			JVM INSTR monitorexit ;
		//   39   77:monitorexit     
			return file;
		//   40   78:aload_3         
		//   41   79:areturn         
			Exception exception;
			exception;
		//   42   80:astore_3        
		//*  43   81:aload_2         
			throw exception;
		//   44   82:monitorexit     
		//   45   83:aload_3         
		//   46   84:athrow          
		}

		public String getString(int i)
			throws IOException
		{
			InputStream inputstream = newInputStream(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #99  <Method InputStream newInputStream(int)>
		//    3    5:astore_2        
			if(inputstream != null)
		//*   4    6:aload_2         
		//*   5    7:ifnull          15
				return DiskLruCache.inputStreamToString(inputstream);
		//    6   10:aload_2         
		//    7   11:invokestatic    #103 <Method String DiskLruCache.access$1800(InputStream)>
		//    8   14:areturn         
			else
				return null;
		//    9   15:aconst_null     
		//   10   16:areturn         
		}

		public void set(int i, String s)
			throws IOException
		{
			OutputStreamWriter outputstreamwriter = null;
		//    0    0:aconst_null     
		//    1    1:astore_3        
			OutputStreamWriter outputstreamwriter1 = new OutputStreamWriter(((java.io.OutputStream) (new FileOutputStream(getFile(i)))), Util.UTF_8);
		//    2    2:new             #107 <Class OutputStreamWriter>
		//    3    5:dup             
		//    4    6:new             #109 <Class FileOutputStream>
		//    5    9:dup             
		//    6   10:aload_0         
		//    7   11:iload_1         
		//    8   12:invokevirtual   #111 <Method File getFile(int)>
		//    9   15:invokespecial   #112 <Method void FileOutputStream(File)>
		//   10   18:getstatic       #118 <Field java.nio.charset.Charset Util.UTF_8>
		//   11   21:invokespecial   #121 <Method void OutputStreamWriter(java.io.OutputStream, java.nio.charset.Charset)>
		//   12   24:astore          4
			outputstreamwriter = outputstreamwriter1;
		//   13   26:aload           4
		//   14   28:astore_3        
			((Writer) (outputstreamwriter1)).write(s);
		//   15   29:aload           4
		//   16   31:aload_2         
		//   17   32:invokevirtual   #127 <Method void Writer.write(String)>
			Util.closeQuietly(((Closeable) (outputstreamwriter1)));
		//   18   35:aload           4
		//   19   37:invokestatic    #131 <Method void Util.closeQuietly(Closeable)>
			return;
		//   20   40:return          
			s;
		//   21   41:astore_2        
			Util.closeQuietly(((Closeable) (outputstreamwriter)));
		//   22   42:aload_3         
		//   23   43:invokestatic    #131 <Method void Util.closeQuietly(Closeable)>
			throw s;
		//   24   46:aload_2         
		//   25   47:athrow          
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

	final class Entry
	{

		private IOException invalidLengths(String as[])
			throws IOException
		{
			throw new IOException((new StringBuilder()).append("unexpected journal line: ").append(Arrays.toString(((Object []) (as)))).toString());
		//    0    0:new             #109 <Class IOException>
		//    1    3:dup             
		//    2    4:new             #45  <Class StringBuilder>
		//    3    7:dup             
		//    4    8:invokespecial   #117 <Method void StringBuilder()>
		//    5   11:ldc1            #119 <String "unexpected journal line: ">
		//    6   13:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//    7   16:aload_1         
		//    8   17:invokestatic    #124 <Method String Arrays.toString(Object[])>
		//    9   20:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//   10   23:invokevirtual   #67  <Method String StringBuilder.toString()>
		//   11   26:invokespecial   #125 <Method void IOException(String)>
		//   12   29:athrow          
		}

		private void setLengths(String as[])
			throws IOException
		{
			if(as.length != valueCount)
		//*   0    0:aload_1         
		//*   1    1:arraylength     
		//*   2    2:aload_0         
		//*   3    3:getfield        #26  <Field DiskLruCache this$0>
		//*   4    6:invokestatic    #35  <Method int DiskLruCache.access$1900(DiskLruCache)>
		//*   5    9:icmpeq          18
				throw invalidLengths(as);
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:invokespecial   #129 <Method IOException invalidLengths(String[])>
		//    9   17:athrow          
			int i = 0;
		//   10   18:iconst_0        
		//   11   19:istore_2        
			do
			{
				try
				{
					if(i >= as.length)
						break;
		//   12   20:iload_2         
		//   13   21:aload_1         
		//   14   22:arraylength     
		//   15   23:icmpge          45
					lengths[i] = Long.parseLong(as[i]);
		//   16   26:aload_0         
		//   17   27:getfield        #37  <Field long[] lengths>
		//   18   30:iload_2         
		//   19   31:aload_1         
		//   20   32:iload_2         
		//   21   33:aaload          
		//   22   34:invokestatic    #135 <Method long Long.parseLong(String)>
		//   23   37:lastore         
				}
		//*  24   38:iload_2         
		//*  25   39:iconst_1        
		//*  26   40:iadd            
		//*  27   41:istore_2        
		//*  28   42:goto            20
		//*  29   45:return          
				catch(NumberFormatException numberformatexception)
		//*  30   46:astore_3        
				{
					throw invalidLengths(as);
		//   31   47:aload_0         
		//   32   48:aload_1         
		//   33   49:invokespecial   #129 <Method IOException invalidLengths(String[])>
		//   34   52:athrow          
				}
				i++;
			} while(true);
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
		//*  14   23:icmpge          50
			{
				long l = al[i];
		//   15   26:aload           6
		//   16   28:iload_1         
		//   17   29:laload          
		//   18   30:lstore_3        
				stringbuilder.append(' ').append(l);
		//   19   31:aload           5
		//   20   33:bipush          32
		//   21   35:invokevirtual   #52  <Method StringBuilder StringBuilder.append(char)>
		//   22   38:lload_3         
		//   23   39:invokevirtual   #142 <Method StringBuilder StringBuilder.append(long)>
		//   24   42:pop             
			}

		//   25   43:iload_1         
		//   26   44:iconst_1        
		//   27   45:iadd            
		//   28   46:istore_1        
		//*  29   47:goto            21
			return stringbuilder.toString();
		//   30   50:aload           5
		//   31   52:invokevirtual   #67  <Method String StringBuilder.toString()>
		//   32   55:areturn         
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
			s = ((String) ((new StringBuilder(s)).append('.')));
		//   23   46:new             #45  <Class StringBuilder>
		//   24   49:dup             
		//   25   50:aload_2         
		//   26   51:invokespecial   #48  <Method void StringBuilder(String)>
		//   27   54:bipush          46
		//   28   56:invokevirtual   #52  <Method StringBuilder StringBuilder.append(char)>
		//   29   59:astore_2        
			int j = ((StringBuilder) (s)).length();
		//   30   60:aload_2         
		//   31   61:invokevirtual   #56  <Method int StringBuilder.length()>
		//   32   64:istore          4
			for(int i = 0; i < valueCount; i++)
		//*  33   66:iconst_0        
		//*  34   67:istore_3        
		//*  35   68:iload_3         
		//*  36   69:aload_1         
		//*  37   70:invokestatic    #35  <Method int DiskLruCache.access$1900(DiskLruCache)>
		//*  38   73:icmpge          144
			{
				((StringBuilder) (s)).append(i);
		//   39   76:aload_2         
		//   40   77:iload_3         
		//   41   78:invokevirtual   #59  <Method StringBuilder StringBuilder.append(int)>
		//   42   81:pop             
				cleanFiles[i] = new File(directory, ((StringBuilder) (s)).toString());
		//   43   82:aload_0         
		//   44   83:getfield        #41  <Field File[] cleanFiles>
		//   45   86:iload_3         
		//   46   87:new             #39  <Class File>
		//   47   90:dup             
		//   48   91:aload_1         
		//   49   92:invokestatic    #63  <Method File DiskLruCache.access$2000(DiskLruCache)>
		//   50   95:aload_2         
		//   51   96:invokevirtual   #67  <Method String StringBuilder.toString()>
		//   52   99:invokespecial   #70  <Method void File(File, String)>
		//   53  102:aastore         
				((StringBuilder) (s)).append(".tmp");
		//   54  103:aload_2         
		//   55  104:ldc1            #72  <String ".tmp">
		//   56  106:invokevirtual   #75  <Method StringBuilder StringBuilder.append(String)>
		//   57  109:pop             
				dirtyFiles[i] = new File(directory, ((StringBuilder) (s)).toString());
		//   58  110:aload_0         
		//   59  111:getfield        #43  <Field File[] dirtyFiles>
		//   60  114:iload_3         
		//   61  115:new             #39  <Class File>
		//   62  118:dup             
		//   63  119:aload_1         
		//   64  120:invokestatic    #63  <Method File DiskLruCache.access$2000(DiskLruCache)>
		//   65  123:aload_2         
		//   66  124:invokevirtual   #67  <Method String StringBuilder.toString()>
		//   67  127:invokespecial   #70  <Method void File(File, String)>
		//   68  130:aastore         
				((StringBuilder) (s)).setLength(j);
		//   69  131:aload_2         
		//   70  132:iload           4
		//   71  134:invokevirtual   #79  <Method void StringBuilder.setLength(int)>
			}

		//   72  137:iload_3         
		//   73  138:iconst_1        
		//   74  139:iadd            
		//   75  140:istore_3        
		//*  76  141:goto            68
		//   77  144:return          
		}

	}

	public final class Value
	{

		public Editor edit()
			throws IOException
		{
			return DiskLruCache.this.edit(key, sequenceNumber);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field DiskLruCache this$0>
		//    2    4:aload_0         
		//    3    5:getfield        #26  <Field String key>
		//    4    8:aload_0         
		//    5    9:getfield        #28  <Field long sequenceNumber>
		//    6   12:invokestatic    #44  <Method DiskLruCache$Editor DiskLruCache.access$1700(DiskLruCache, String, long)>
		//    7   15:areturn         
		}

		public File getFile(int i)
		{
			return files[i];
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field File[] files>
		//    2    4:iload_1         
		//    3    5:aaload          
		//    4    6:areturn         
		}

		public long getLength(int i)
		{
			return lengths[i];
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field long[] lengths>
		//    2    4:iload_1         
		//    3    5:laload          
		//    4    6:lreturn         
		}

		public String getString(int i)
			throws IOException
		{
			return DiskLruCache.inputStreamToString(((InputStream) (new FileInputStream(files[i]))));
		//    0    0:new             #53  <Class FileInputStream>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #30  <Field File[] files>
		//    4    8:iload_1         
		//    5    9:aaload          
		//    6   10:invokespecial   #56  <Method void FileInputStream(File)>
		//    7   13:invokestatic    #60  <Method String DiskLruCache.access$1800(InputStream)>
		//    8   16:areturn         
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
	//    1    1:invokespecial   #75  <Method void Object()>
		size = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #77  <Field long size>
	//    5    9:aload_0         
	//    6   10:new             #79  <Class LinkedHashMap>
	//    7   13:dup             
	//    8   14:iconst_0        
	//    9   15:ldc1            #80  <Float 0.75F>
	//   10   17:iconst_1        
	//   11   18:invokespecial   #83  <Method void LinkedHashMap(int, float, boolean)>
	//   12   21:putfield        #85  <Field LinkedHashMap lruEntries>
		nextSequenceNumber = 0L;
	//   13   24:aload_0         
	//   14   25:lconst_0        
	//   15   26:putfield        #87  <Field long nextSequenceNumber>
		executorService = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, ((java.util.concurrent.BlockingQueue) (new LinkedBlockingQueue())), ((ThreadFactory) (new DiskLruCacheThreadFactory())));
	//   16   29:aload_0         
	//   17   30:new             #89  <Class ThreadPoolExecutor>
	//   18   33:dup             
	//   19   34:iconst_0        
	//   20   35:iconst_1        
	//   21   36:ldc2w           #90  <Long 60L>
	//   22   39:getstatic       #97  <Field TimeUnit TimeUnit.SECONDS>
	//   23   42:new             #99  <Class LinkedBlockingQueue>
	//   24   45:dup             
	//   25   46:invokespecial   #100 <Method void LinkedBlockingQueue()>
	//   26   49:new             #10  <Class DiskLruCache$DiskLruCacheThreadFactory>
	//   27   52:dup             
	//   28   53:aconst_null     
	//   29   54:invokespecial   #103 <Method void DiskLruCache$DiskLruCacheThreadFactory(DiskLruCache$1)>
	//   30   57:invokespecial   #106 <Method void ThreadPoolExecutor(int, int, long, TimeUnit, java.util.concurrent.BlockingQueue, ThreadFactory)>
	//   31   60:putfield        #108 <Field ThreadPoolExecutor executorService>
	//   32   63:aload_0         
	//   33   64:new             #8   <Class DiskLruCache$1>
	//   34   67:dup             
	//   35   68:aload_0         
	//   36   69:invokespecial   #111 <Method void DiskLruCache$1(DiskLruCache)>
	//   37   72:putfield        #113 <Field Callable cleanupCallable>
		directory = file;
	//   38   75:aload_0         
	//   39   76:aload_1         
	//   40   77:putfield        #115 <Field File directory>
		appVersion = i;
	//   41   80:aload_0         
	//   42   81:iload_2         
	//   43   82:putfield        #117 <Field int appVersion>
		journalFile = new File(file, "journal");
	//   44   85:aload_0         
	//   45   86:new             #119 <Class File>
	//   46   89:dup             
	//   47   90:aload_1         
	//   48   91:ldc1            #32  <String "journal">
	//   49   93:invokespecial   #122 <Method void File(File, String)>
	//   50   96:putfield        #124 <Field File journalFile>
		journalFileTmp = new File(file, "journal.tmp");
	//   51   99:aload_0         
	//   52  100:new             #119 <Class File>
	//   53  103:dup             
	//   54  104:aload_1         
	//   55  105:ldc1            #38  <String "journal.tmp">
	//   56  107:invokespecial   #122 <Method void File(File, String)>
	//   57  110:putfield        #126 <Field File journalFileTmp>
		journalFileBackup = new File(file, "journal.bkp");
	//   58  113:aload_0         
	//   59  114:new             #119 <Class File>
	//   60  117:dup             
	//   61  118:aload_1         
	//   62  119:ldc1            #35  <String "journal.bkp">
	//   63  121:invokespecial   #122 <Method void File(File, String)>
	//   64  124:putfield        #128 <Field File journalFileBackup>
		valueCount = j;
	//   65  127:aload_0         
	//   66  128:iload_3         
	//   67  129:putfield        #130 <Field int valueCount>
		maxSize = l;
	//   68  132:aload_0         
	//   69  133:lload           4
	//   70  135:putfield        #132 <Field long maxSize>
	//   71  138:return          
	}

	private void checkNotClosed()
	{
		if(journalWriter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field Writer journalWriter>
	//*   2    4:ifnonnull       17
			throw new IllegalStateException("cache is closed");
	//    3    7:new             #182 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #184 <String "cache is closed">
	//    6   13:invokespecial   #187 <Method void IllegalStateException(String)>
	//    7   16:athrow          
		else
			return;
	//    8   17:return          
	}

	private void completeEdit(Editor editor, boolean flag)
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Entry entry;
		entry = editor.entry;
	//    2    2:aload_1         
	//    3    3:invokestatic    #191 <Method DiskLruCache$Entry DiskLruCache$Editor.access$1500(DiskLruCache$Editor)>
	//    4    6:astore          8
		if(entry.currentEditor != editor)
	//*   5    8:aload           8
	//*   6   10:invokestatic    #195 <Method DiskLruCache$Editor DiskLruCache$Entry.access$800(DiskLruCache$Entry)>
	//*   7   13:aload_1         
	//*   8   14:if_acmpeq       25
			throw new IllegalStateException();
	//    9   17:new             #182 <Class IllegalStateException>
	//   10   20:dup             
	//   11   21:invokespecial   #196 <Method void IllegalStateException()>
	//   12   24:athrow          
		if(!flag)
			break MISSING_BLOCK_LABEL_424;
	//   13   25:iload_2         
	//   14   26:ifeq            424
		if(entry.readable)
			break MISSING_BLOCK_LABEL_424;
	//   15   29:aload           8
	//   16   31:invokestatic    #200 <Method boolean DiskLruCache$Entry.access$700(DiskLruCache$Entry)>
	//   17   34:ifne            424
		int i = 0;
	//   18   37:iconst_0        
	//   19   38:istore_3        
_L3:
		if(i >= valueCount)
			break MISSING_BLOCK_LABEL_424;
	//   20   39:iload_3         
	//   21   40:aload_0         
	//   22   41:getfield        #130 <Field int valueCount>
	//   23   44:icmpge          424
		if(!editor.written[i])
	//*  24   47:aload_1         
	//*  25   48:invokestatic    #204 <Method boolean[] DiskLruCache$Editor.access$1600(DiskLruCache$Editor)>
	//*  26   51:iload_3         
	//*  27   52:baload          
	//*  28   53:ifne            87
		{
			editor.abort();
	//   29   56:aload_1         
	//   30   57:invokevirtual   #207 <Method void DiskLruCache$Editor.abort()>
			throw new IllegalStateException((new StringBuilder()).append("Newly created entry didn't create value for index ").append(i).toString());
	//   31   60:new             #182 <Class IllegalStateException>
	//   32   63:dup             
	//   33   64:new             #209 <Class StringBuilder>
	//   34   67:dup             
	//   35   68:invokespecial   #210 <Method void StringBuilder()>
	//   36   71:ldc1            #212 <String "Newly created entry didn't create value for index ">
	//   37   73:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   38   76:iload_3         
	//   39   77:invokevirtual   #219 <Method StringBuilder StringBuilder.append(int)>
	//   40   80:invokevirtual   #223 <Method String StringBuilder.toString()>
	//   41   83:invokespecial   #187 <Method void IllegalStateException(String)>
	//   42   86:athrow          
		}
		if(entry.getDirtyFile(i).exists()) goto _L2; else goto _L1
	//   43   87:aload           8
	//   44   89:iload_3         
	//   45   90:invokevirtual   #227 <Method File DiskLruCache$Entry.getDirtyFile(int)>
	//   46   93:invokevirtual   #230 <Method boolean File.exists()>
	//   47   96:ifne            417
_L1:
		editor.abort();
	//   48   99:aload_1         
	//   49  100:invokevirtual   #207 <Method void DiskLruCache$Editor.abort()>
		this;
	//   50  103:aload_0         
		JVM INSTR monitorexit ;
	//   51  104:monitorexit     
		return;
	//   52  105:return          
_L4:
		long l;
		long l1;
		File file;
		for(; i >= valueCount; i++)
			break MISSING_BLOCK_LABEL_196;

	//   53  106:iload_3         
	//   54  107:aload_0         
	//   55  108:getfield        #130 <Field int valueCount>
	//   56  111:icmpge          196
	//   57  114:aload           8
	//   58  116:iload_3         
	//   59  117:invokevirtual   #227 <Method File DiskLruCache$Entry.getDirtyFile(int)>
	//   60  120:astore_1        
	//   61  121:iload_2         
	//   62  122:ifeq            189
	//   63  125:aload_1         
	//   64  126:invokevirtual   #230 <Method boolean File.exists()>
	//   65  129:ifeq            429
	//   66  132:aload           8
	//   67  134:iload_3         
	//   68  135:invokevirtual   #233 <Method File DiskLruCache$Entry.getCleanFile(int)>
	//   69  138:astore          9
	//   70  140:aload_1         
	//   71  141:aload           9
	//   72  143:invokevirtual   #237 <Method boolean File.renameTo(File)>
	//   73  146:pop             
	//   74  147:aload           8
	//   75  149:invokestatic    #241 <Method long[] DiskLruCache$Entry.access$1100(DiskLruCache$Entry)>
	//   76  152:iload_3         
	//   77  153:laload          
	//   78  154:lstore          4
	//   79  156:aload           9
	//   80  158:invokevirtual   #245 <Method long File.length()>
	//   81  161:lstore          6
	//   82  163:aload           8
	//   83  165:invokestatic    #241 <Method long[] DiskLruCache$Entry.access$1100(DiskLruCache$Entry)>
	//   84  168:iload_3         
	//   85  169:lload           6
	//   86  171:lastore         
	//   87  172:aload_0         
	//   88  173:aload_0         
	//   89  174:getfield        #77  <Field long size>
	//   90  177:lload           4
	//   91  179:lsub            
	//   92  180:lload           6
	//   93  182:ladd            
	//   94  183:putfield        #77  <Field long size>
	//   95  186:goto            429
	//   96  189:aload_1         
	//   97  190:invokestatic    #249 <Method void deleteIfExists(File)>
	//   98  193:goto            429
	//   99  196:aload_0         
	//  100  197:aload_0         
	//  101  198:getfield        #179 <Field int redundantOpCount>
	//  102  201:iconst_1        
	//  103  202:iadd            
	//  104  203:putfield        #179 <Field int redundantOpCount>
	//  105  206:aload           8
	//  106  208:aconst_null     
	//  107  209:invokestatic    #253 <Method DiskLruCache$Editor DiskLruCache$Entry.access$802(DiskLruCache$Entry, DiskLruCache$Editor)>
	//  108  212:pop             
	//  109  213:aload           8
	//  110  215:invokestatic    #200 <Method boolean DiskLruCache$Entry.access$700(DiskLruCache$Entry)>
	//  111  218:iload_2         
	//  112  219:ior             
	//  113  220:ifeq            315
	//  114  223:aload           8
	//  115  225:iconst_1        
	//  116  226:invokestatic    #257 <Method boolean DiskLruCache$Entry.access$702(DiskLruCache$Entry, boolean)>
	//  117  229:pop             
	//  118  230:aload_0         
	//  119  231:getfield        #137 <Field Writer journalWriter>
	//  120  234:ldc1            #27  <String "CLEAN">
	//  121  236:invokevirtual   #262 <Method Writer Writer.append(CharSequence)>
	//  122  239:pop             
	//  123  240:aload_0         
	//  124  241:getfield        #137 <Field Writer journalWriter>
	//  125  244:bipush          32
	//  126  246:invokevirtual   #265 <Method Writer Writer.append(char)>
	//  127  249:pop             
	//  128  250:aload_0         
	//  129  251:getfield        #137 <Field Writer journalWriter>
	//  130  254:aload           8
	//  131  256:invokestatic    #269 <Method String DiskLruCache$Entry.access$1200(DiskLruCache$Entry)>
	//  132  259:invokevirtual   #262 <Method Writer Writer.append(CharSequence)>
	//  133  262:pop             
	//  134  263:aload_0         
	//  135  264:getfield        #137 <Field Writer journalWriter>
	//  136  267:aload           8
	//  137  269:invokevirtual   #272 <Method String DiskLruCache$Entry.getLengths()>
	//  138  272:invokevirtual   #262 <Method Writer Writer.append(CharSequence)>
	//  139  275:pop             
	//  140  276:aload_0         
	//  141  277:getfield        #137 <Field Writer journalWriter>
	//  142  280:bipush          10
	//  143  282:invokevirtual   #265 <Method Writer Writer.append(char)>
	//  144  285:pop             
	//  145  286:iload_2         
	//  146  287:ifeq            371
	//  147  290:aload_0         
	//  148  291:getfield        #87  <Field long nextSequenceNumber>
	//  149  294:lstore          4
	//  150  296:aload_0         
	//  151  297:lconst_1        
	//  152  298:lload           4
	//  153  300:ladd            
	//  154  301:putfield        #87  <Field long nextSequenceNumber>
	//  155  304:aload           8
	//  156  306:lload           4
	//  157  308:invokestatic    #276 <Method long DiskLruCache$Entry.access$1302(DiskLruCache$Entry, long)>
	//  158  311:pop2            
	//  159  312:goto            371
	//  160  315:aload_0         
	//  161  316:getfield        #85  <Field LinkedHashMap lruEntries>
	//  162  319:aload           8
	//  163  321:invokestatic    #269 <Method String DiskLruCache$Entry.access$1200(DiskLruCache$Entry)>
	//  164  324:invokevirtual   #280 <Method Object LinkedHashMap.remove(Object)>
	//  165  327:pop             
	//  166  328:aload_0         
	//  167  329:getfield        #137 <Field Writer journalWriter>
	//  168  332:ldc1            #45  <String "REMOVE">
	//  169  334:invokevirtual   #262 <Method Writer Writer.append(CharSequence)>
	//  170  337:pop             
	//  171  338:aload_0         
	//  172  339:getfield        #137 <Field Writer journalWriter>
	//  173  342:bipush          32
	//  174  344:invokevirtual   #265 <Method Writer Writer.append(char)>
	//  175  347:pop             
	//  176  348:aload_0         
	//  177  349:getfield        #137 <Field Writer journalWriter>
	//  178  352:aload           8
	//  179  354:invokestatic    #269 <Method String DiskLruCache$Entry.access$1200(DiskLruCache$Entry)>
	//  180  357:invokevirtual   #262 <Method Writer Writer.append(CharSequence)>
	//  181  360:pop             
	//  182  361:aload_0         
	//  183  362:getfield        #137 <Field Writer journalWriter>
	//  184  365:bipush          10
	//  185  367:invokevirtual   #265 <Method Writer Writer.append(char)>
	//  186  370:pop             
	//  187  371:aload_0         
	//  188  372:getfield        #137 <Field Writer journalWriter>
	//  189  375:invokevirtual   #283 <Method void Writer.flush()>
	//  190  378:aload_0         
	//  191  379:getfield        #77  <Field long size>
	//  192  382:aload_0         
	//  193  383:getfield        #132 <Field long maxSize>
	//  194  386:lcmp            
	//  195  387:ifgt            397
	//  196  390:aload_0         
	//  197  391:invokespecial   #171 <Method boolean journalRebuildRequired()>
	//  198  394:ifeq            409
	//  199  397:aload_0         
	//  200  398:getfield        #108 <Field ThreadPoolExecutor executorService>
	//  201  401:aload_0         
	//  202  402:getfield        #113 <Field Callable cleanupCallable>
	//  203  405:invokevirtual   #287 <Method java.util.concurrent.Future ThreadPoolExecutor.submit(Callable)>
	//  204  408:pop             
	//  205  409:aload_0         
	//  206  410:monitorexit     
	//  207  411:return          
	//  208  412:astore_1        
	//  209  413:aload_0         
	//  210  414:monitorexit     
	//  211  415:aload_1         
	//  212  416:athrow          
	//  213  417:iload_3         
	//  214  418:iconst_1        
	//  215  419:iadd            
	//  216  420:istore_3        
	//  217  421:goto            39
	//  218  424:iconst_0        
	//  219  425:istore_3        
	//  220  426:goto            106
	//  221  429:iload_3         
	//  222  430:iconst_1        
	//  223  431:iadd            
	//  224  432:istore_3        
		editor = ((Editor) (entry.getDirtyFile(i)));
		if(!flag)
			break MISSING_BLOCK_LABEL_189;
		if(((File) (editor)).exists())
		{
			file = entry.getCleanFile(i);
			((File) (editor)).renameTo(file);
			l = entry.lengths[i];
			l1 = file.length();
			entry.lengths[i] = l1;
			size = (size - l) + l1;
		}
		break MISSING_BLOCK_LABEL_429;
		deleteIfExists(((File) (editor)));
		break MISSING_BLOCK_LABEL_429;
		redundantOpCount = redundantOpCount + 1;
		entry.currentEditor = null;
		if(!(entry.readable | flag))
			break MISSING_BLOCK_LABEL_315;
		entry.readable = true;
		journalWriter.append("CLEAN");
		journalWriter.append(' ');
		journalWriter.append(((CharSequence) (entry.key)));
		journalWriter.append(((CharSequence) (entry.getLengths())));
		journalWriter.append('\n');
		if(!flag)
			break MISSING_BLOCK_LABEL_371;
		l = nextSequenceNumber;
		nextSequenceNumber = 1L + l;
		entry.sequenceNumber = l;
		break MISSING_BLOCK_LABEL_371;
		lruEntries.remove(((Object) (entry.key)));
		journalWriter.append("REMOVE");
		journalWriter.append(' ');
		journalWriter.append(((CharSequence) (entry.key)));
		journalWriter.append('\n');
		journalWriter.flush();
		if(size > maxSize || journalRebuildRequired())
			executorService.submit(cleanupCallable);
		this;
		JVM INSTR monitorexit ;
		return;
		editor;
		throw editor;
_L2:
		i++;
		  goto _L3
		i = 0;
		  goto _L4
	//* 225  433:goto            106
	}

	private static void deleteIfExists(File file)
		throws IOException
	{
		if(file.exists() && !file.delete())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #230 <Method boolean File.exists()>
	//*   2    4:ifeq            22
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #290 <Method boolean File.delete()>
	//*   5   11:ifne            22
			throw new IOException();
	//    6   14:new             #141 <Class IOException>
	//    7   17:dup             
	//    8   18:invokespecial   #291 <Method void IOException()>
	//    9   21:athrow          
		else
			return;
	//   10   22:return          
	}

	private Editor edit(String s, long l)
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Object obj;
		checkNotClosed();
	//    2    2:aload_0         
	//    3    3:invokespecial   #293 <Method void checkNotClosed()>
		obj = ((Object) ((Entry)lruEntries.get(((Object) (s)))));
	//    4    6:aload_0         
	//    5    7:getfield        #85  <Field LinkedHashMap lruEntries>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #296 <Method Object LinkedHashMap.get(Object)>
	//    8   14:checkcast       #16  <Class DiskLruCache$Entry>
	//    9   17:astore          5
		if(l == -1L)
			break MISSING_BLOCK_LABEL_46;
	//   10   19:lload_2         
	//   11   20:ldc2w           #23  <Long -1L>
	//   12   23:lcmp            
	//   13   24:ifeq            46
		if(obj == null)
			break MISSING_BLOCK_LABEL_42;
	//   14   27:aload           5
	//   15   29:ifnull          42
		if(((Entry) (obj)).sequenceNumber == l)
			break MISSING_BLOCK_LABEL_46;
	//   16   32:aload           5
	//   17   34:invokestatic    #300 <Method long DiskLruCache$Entry.access$1300(DiskLruCache$Entry)>
	//   18   37:lload_2         
	//   19   38:lcmp            
	//   20   39:ifeq            46
		this;
	//   21   42:aload_0         
		JVM INSTR monitorexit ;
	//   22   43:monitorexit     
		return null;
	//   23   44:aconst_null     
	//   24   45:areturn         
		if(obj != null)
			break MISSING_BLOCK_LABEL_77;
	//   25   46:aload           5
	//   26   48:ifnonnull       77
		Entry entry;
		entry = new Entry(s);
	//   27   51:new             #16  <Class DiskLruCache$Entry>
	//   28   54:dup             
	//   29   55:aload_0         
	//   30   56:aload_1         
	//   31   57:aconst_null     
	//   32   58:invokespecial   #303 <Method void DiskLruCache$Entry(DiskLruCache, String, DiskLruCache$1)>
	//   33   61:astore          4
		lruEntries.put(((Object) (s)), ((Object) (entry)));
	//   34   63:aload_0         
	//   35   64:getfield        #85  <Field LinkedHashMap lruEntries>
	//   36   67:aload_1         
	//   37   68:aload           4
	//   38   70:invokevirtual   #307 <Method Object LinkedHashMap.put(Object, Object)>
	//   39   73:pop             
		break MISSING_BLOCK_LABEL_93;
	//   40   74:goto            93
		entry = ((Entry) (obj));
	//   41   77:aload           5
	//   42   79:astore          4
		if(((Entry) (obj)).currentEditor == null)
			break MISSING_BLOCK_LABEL_93;
	//   43   81:aload           5
	//   44   83:invokestatic    #195 <Method DiskLruCache$Editor DiskLruCache$Entry.access$800(DiskLruCache$Entry)>
	//   45   86:ifnull          93
		this;
	//   46   89:aload_0         
		JVM INSTR monitorexit ;
	//   47   90:monitorexit     
		return null;
	//   48   91:aconst_null     
	//   49   92:areturn         
		obj = ((Object) (new Editor(entry)));
	//   50   93:new             #13  <Class DiskLruCache$Editor>
	//   51   96:dup             
	//   52   97:aload_0         
	//   53   98:aload           4
	//   54  100:aconst_null     
	//   55  101:invokespecial   #310 <Method void DiskLruCache$Editor(DiskLruCache, DiskLruCache$Entry, DiskLruCache$1)>
	//   56  104:astore          5
		entry.currentEditor = ((Editor) (obj));
	//   57  106:aload           4
	//   58  108:aload           5
	//   59  110:invokestatic    #253 <Method DiskLruCache$Editor DiskLruCache$Entry.access$802(DiskLruCache$Entry, DiskLruCache$Editor)>
	//   60  113:pop             
		journalWriter.append("DIRTY");
	//   61  114:aload_0         
	//   62  115:getfield        #137 <Field Writer journalWriter>
	//   63  118:ldc1            #29  <String "DIRTY">
	//   64  120:invokevirtual   #262 <Method Writer Writer.append(CharSequence)>
	//   65  123:pop             
		journalWriter.append(' ');
	//   66  124:aload_0         
	//   67  125:getfield        #137 <Field Writer journalWriter>
	//   68  128:bipush          32
	//   69  130:invokevirtual   #265 <Method Writer Writer.append(char)>
	//   70  133:pop             
		journalWriter.append(((CharSequence) (s)));
	//   71  134:aload_0         
	//   72  135:getfield        #137 <Field Writer journalWriter>
	//   73  138:aload_1         
	//   74  139:invokevirtual   #262 <Method Writer Writer.append(CharSequence)>
	//   75  142:pop             
		journalWriter.append('\n');
	//   76  143:aload_0         
	//   77  144:getfield        #137 <Field Writer journalWriter>
	//   78  147:bipush          10
	//   79  149:invokevirtual   #265 <Method Writer Writer.append(char)>
	//   80  152:pop             
		journalWriter.flush();
	//   81  153:aload_0         
	//   82  154:getfield        #137 <Field Writer journalWriter>
	//   83  157:invokevirtual   #283 <Method void Writer.flush()>
		this;
	//   84  160:aload_0         
		JVM INSTR monitorexit ;
	//   85  161:monitorexit     
		return ((Editor) (obj));
	//   86  162:aload           5
	//   87  164:areturn         
		s;
	//   88  165:astore_1        
	//*  89  166:aload_0         
		throw s;
	//   90  167:monitorexit     
	//   91  168:aload_1         
	//   92  169:athrow          
	}

	private static String inputStreamToString(InputStream inputstream)
		throws IOException
	{
		return Util.readFully(((java.io.Reader) (new InputStreamReader(inputstream, Util.UTF_8))));
	//    0    0:new             #312 <Class InputStreamReader>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getstatic       #318 <Field java.nio.charset.Charset Util.UTF_8>
	//    4    8:invokespecial   #321 <Method void InputStreamReader(InputStream, java.nio.charset.Charset)>
	//    5   11:invokestatic    #325 <Method String Util.readFully(java.io.Reader)>
	//    6   14:areturn         
	}

	private boolean journalRebuildRequired()
	{
		return redundantOpCount >= 2000 && redundantOpCount >= lruEntries.size();
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field int redundantOpCount>
	//    2    4:sipush          2000
	//    3    7:icmplt          26
	//    4   10:aload_0         
	//    5   11:getfield        #179 <Field int redundantOpCount>
	//    6   14:aload_0         
	//    7   15:getfield        #85  <Field LinkedHashMap lruEntries>
	//    8   18:invokevirtual   #328 <Method int LinkedHashMap.size()>
	//    9   21:icmplt          26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public static DiskLruCache open(File file, int i, int j, long l)
		throws IOException
	{
		Object obj;
		if(l <= 0L)
	//*   0    0:lload_3         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifgt            17
			throw new IllegalArgumentException("maxSize <= 0");
	//    4    6:new             #332 <Class IllegalArgumentException>
	//    5    9:dup             
	//    6   10:ldc2            #334 <String "maxSize <= 0">
	//    7   13:invokespecial   #335 <Method void IllegalArgumentException(String)>
	//    8   16:athrow          
		if(j <= 0)
	//*   9   17:iload_2         
	//*  10   18:ifgt            32
			throw new IllegalArgumentException("valueCount <= 0");
	//   11   21:new             #332 <Class IllegalArgumentException>
	//   12   24:dup             
	//   13   25:ldc2            #337 <String "valueCount <= 0">
	//   14   28:invokespecial   #335 <Method void IllegalArgumentException(String)>
	//   15   31:athrow          
		obj = ((Object) (new File(file, "journal.bkp")));
	//   16   32:new             #119 <Class File>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:ldc1            #35  <String "journal.bkp">
	//   20   39:invokespecial   #122 <Method void File(File, String)>
	//   21   42:astore          5
		if(((File) (obj)).exists())
	//*  22   44:aload           5
	//*  23   46:invokevirtual   #230 <Method boolean File.exists()>
	//*  24   49:ifeq            89
		{
			File file1 = new File(file, "journal");
	//   25   52:new             #119 <Class File>
	//   26   55:dup             
	//   27   56:aload_0         
	//   28   57:ldc1            #32  <String "journal">
	//   29   59:invokespecial   #122 <Method void File(File, String)>
	//   30   62:astore          6
			if(file1.exists())
	//*  31   64:aload           6
	//*  32   66:invokevirtual   #230 <Method boolean File.exists()>
	//*  33   69:ifeq            81
				((File) (obj)).delete();
	//   34   72:aload           5
	//   35   74:invokevirtual   #290 <Method boolean File.delete()>
	//   36   77:pop             
			else
	//*  37   78:goto            89
				renameTo(((File) (obj)), file1, false);
	//   38   81:aload           5
	//   39   83:aload           6
	//   40   85:iconst_0        
	//   41   86:invokestatic    #340 <Method void renameTo(File, File, boolean)>
		}
		obj = ((Object) (new DiskLruCache(file, i, j, l)));
	//   42   89:new             #2   <Class DiskLruCache>
	//   43   92:dup             
	//   44   93:aload_0         
	//   45   94:iload_1         
	//   46   95:iload_2         
	//   47   96:lload_3         
	//   48   97:invokespecial   #342 <Method void DiskLruCache(File, int, int, long)>
	//   49  100:astore          5
		if(!((DiskLruCache) (obj)).journalFile.exists())
			break MISSING_BLOCK_LABEL_179;
	//   50  102:aload           5
	//   51  104:getfield        #124 <Field File journalFile>
	//   52  107:invokevirtual   #230 <Method boolean File.exists()>
	//   53  110:ifeq            179
		((DiskLruCache) (obj)).readJournal();
	//   54  113:aload           5
	//   55  115:invokespecial   #345 <Method void readJournal()>
		((DiskLruCache) (obj)).processJournal();
	//   56  118:aload           5
	//   57  120:invokespecial   #348 <Method void processJournal()>
		return ((DiskLruCache) (obj));
	//   58  123:aload           5
	//   59  125:areturn         
		IOException ioexception;
		ioexception;
	//   60  126:astore          6
		System.out.println((new StringBuilder()).append("DiskLruCache ").append(((Object) (file))).append(" is corrupt: ").append(ioexception.getMessage()).append(", removing").toString());
	//   61  128:getstatic       #354 <Field PrintStream System.out>
	//   62  131:new             #209 <Class StringBuilder>
	//   63  134:dup             
	//   64  135:invokespecial   #210 <Method void StringBuilder()>
	//   65  138:ldc2            #356 <String "DiskLruCache ">
	//   66  141:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   67  144:aload_0         
	//   68  145:invokevirtual   #359 <Method StringBuilder StringBuilder.append(Object)>
	//   69  148:ldc2            #361 <String " is corrupt: ">
	//   70  151:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   71  154:aload           6
	//   72  156:invokevirtual   #364 <Method String IOException.getMessage()>
	//   73  159:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   74  162:ldc2            #366 <String ", removing">
	//   75  165:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   76  168:invokevirtual   #223 <Method String StringBuilder.toString()>
	//   77  171:invokevirtual   #371 <Method void PrintStream.println(String)>
		((DiskLruCache) (obj)).delete();
	//   78  174:aload           5
	//   79  176:invokevirtual   #373 <Method void delete()>
		file.mkdirs();
	//   80  179:aload_0         
	//   81  180:invokevirtual   #376 <Method boolean File.mkdirs()>
	//   82  183:pop             
		file = ((File) (new DiskLruCache(file, i, j, l)));
	//   83  184:new             #2   <Class DiskLruCache>
	//   84  187:dup             
	//   85  188:aload_0         
	//   86  189:iload_1         
	//   87  190:iload_2         
	//   88  191:lload_3         
	//   89  192:invokespecial   #342 <Method void DiskLruCache(File, int, int, long)>
	//   90  195:astore_0        
		((DiskLruCache) (file)).rebuildJournal();
	//   91  196:aload_0         
	//   92  197:invokespecial   #175 <Method void rebuildJournal()>
		return ((DiskLruCache) (file));
	//   93  200:aload_0         
	//   94  201:areturn         
	}

	private void processJournal()
		throws IOException
	{
		deleteIfExists(journalFileTmp);
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field File journalFileTmp>
	//    2    4:invokestatic    #249 <Method void deleteIfExists(File)>
		for(Iterator iterator = lruEntries.values().iterator(); iterator.hasNext();)
	//*   3    7:aload_0         
	//*   4    8:getfield        #85  <Field LinkedHashMap lruEntries>
	//*   5   11:invokevirtual   #380 <Method Collection LinkedHashMap.values()>
	//*   6   14:invokeinterface #386 <Method Iterator Collection.iterator()>
	//*   7   19:astore_2        
	//*   8   20:aload_2         
	//*   9   21:invokeinterface #391 <Method boolean Iterator.hasNext()>
	//*  10   26:ifeq            129
		{
			Entry entry = (Entry)iterator.next();
	//   11   29:aload_2         
	//   12   30:invokeinterface #395 <Method Object Iterator.next()>
	//   13   35:checkcast       #16  <Class DiskLruCache$Entry>
	//   14   38:astore_3        
			if(entry.currentEditor == null)
	//*  15   39:aload_3         
	//*  16   40:invokestatic    #195 <Method DiskLruCache$Editor DiskLruCache$Entry.access$800(DiskLruCache$Entry)>
	//*  17   43:ifnonnull       81
			{
				int i = 0;
	//   18   46:iconst_0        
	//   19   47:istore_1        
				while(i < valueCount) 
	//*  20   48:iload_1         
	//*  21   49:aload_0         
	//*  22   50:getfield        #130 <Field int valueCount>
	//*  23   53:icmpge          78
				{
					size = size + entry.lengths[i];
	//   24   56:aload_0         
	//   25   57:aload_0         
	//   26   58:getfield        #77  <Field long size>
	//   27   61:aload_3         
	//   28   62:invokestatic    #241 <Method long[] DiskLruCache$Entry.access$1100(DiskLruCache$Entry)>
	//   29   65:iload_1         
	//   30   66:laload          
	//   31   67:ladd            
	//   32   68:putfield        #77  <Field long size>
					i++;
	//   33   71:iload_1         
	//   34   72:iconst_1        
	//   35   73:iadd            
	//   36   74:istore_1        
				}
			} else
	//*  37   75:goto            48
	//*  38   78:goto            126
			{
				entry.currentEditor = null;
	//   39   81:aload_3         
	//   40   82:aconst_null     
	//   41   83:invokestatic    #253 <Method DiskLruCache$Editor DiskLruCache$Entry.access$802(DiskLruCache$Entry, DiskLruCache$Editor)>
	//   42   86:pop             
				for(int j = 0; j < valueCount; j++)
	//*  43   87:iconst_0        
	//*  44   88:istore_1        
	//*  45   89:iload_1         
	//*  46   90:aload_0         
	//*  47   91:getfield        #130 <Field int valueCount>
	//*  48   94:icmpge          120
				{
					deleteIfExists(entry.getCleanFile(j));
	//   49   97:aload_3         
	//   50   98:iload_1         
	//   51   99:invokevirtual   #233 <Method File DiskLruCache$Entry.getCleanFile(int)>
	//   52  102:invokestatic    #249 <Method void deleteIfExists(File)>
					deleteIfExists(entry.getDirtyFile(j));
	//   53  105:aload_3         
	//   54  106:iload_1         
	//   55  107:invokevirtual   #227 <Method File DiskLruCache$Entry.getDirtyFile(int)>
	//   56  110:invokestatic    #249 <Method void deleteIfExists(File)>
				}

	//   57  113:iload_1         
	//   58  114:iconst_1        
	//   59  115:iadd            
	//   60  116:istore_1        
	//*  61  117:goto            89
				iterator.remove();
	//   62  120:aload_2         
	//   63  121:invokeinterface #397 <Method void Iterator.remove()>
			}
		}

	//*  64  126:goto            20
	//   65  129:return          
	}

	private void readJournal()
		throws IOException
	{
		StrictLineReader strictlinereader = new StrictLineReader(((InputStream) (new FileInputStream(journalFile))), Util.US_ASCII);
	//    0    0:new             #401 <Class StrictLineReader>
	//    1    3:dup             
	//    2    4:new             #403 <Class FileInputStream>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #124 <Field File journalFile>
	//    6   12:invokespecial   #405 <Method void FileInputStream(File)>
	//    7   15:getstatic       #408 <Field java.nio.charset.Charset Util.US_ASCII>
	//    8   18:invokespecial   #409 <Method void StrictLineReader(InputStream, java.nio.charset.Charset)>
	//    9   21:astore_2        
		String s = strictlinereader.readLine();
	//   10   22:aload_2         
	//   11   23:invokevirtual   #412 <Method String StrictLineReader.readLine()>
	//   12   26:astore_3        
		String s1 = strictlinereader.readLine();
	//   13   27:aload_2         
	//   14   28:invokevirtual   #412 <Method String StrictLineReader.readLine()>
	//   15   31:astore          4
		String s2 = strictlinereader.readLine();
	//   16   33:aload_2         
	//   17   34:invokevirtual   #412 <Method String StrictLineReader.readLine()>
	//   18   37:astore          5
		String s3 = strictlinereader.readLine();
	//   19   39:aload_2         
	//   20   40:invokevirtual   #412 <Method String StrictLineReader.readLine()>
	//   21   43:astore          6
		String s4 = strictlinereader.readLine();
	//   22   45:aload_2         
	//   23   46:invokevirtual   #412 <Method String StrictLineReader.readLine()>
	//   24   49:astore          7
		if(!"libcore.io.DiskLruCache".equals(((Object) (s))) || !"1".equals(((Object) (s1))) || !Integer.toString(appVersion).equals(((Object) (s2))) || !Integer.toString(valueCount).equals(((Object) (s3))) || !"".equals(((Object) (s4))))
	//*  25   51:ldc1            #41  <String "libcore.io.DiskLruCache">
	//*  26   53:aload_3         
	//*  27   54:invokevirtual   #418 <Method boolean String.equals(Object)>
	//*  28   57:ifeq            111
	//*  29   60:ldc1            #48  <String "1">
	//*  30   62:aload           4
	//*  31   64:invokevirtual   #418 <Method boolean String.equals(Object)>
	//*  32   67:ifeq            111
	//*  33   70:aload_0         
	//*  34   71:getfield        #117 <Field int appVersion>
	//*  35   74:invokestatic    #423 <Method String Integer.toString(int)>
	//*  36   77:aload           5
	//*  37   79:invokevirtual   #418 <Method boolean String.equals(Object)>
	//*  38   82:ifeq            111
	//*  39   85:aload_0         
	//*  40   86:getfield        #130 <Field int valueCount>
	//*  41   89:invokestatic    #423 <Method String Integer.toString(int)>
	//*  42   92:aload           6
	//*  43   94:invokevirtual   #418 <Method boolean String.equals(Object)>
	//*  44   97:ifeq            111
	//*  45  100:ldc2            #425 <String "">
	//*  46  103:aload           7
	//*  47  105:invokevirtual   #418 <Method boolean String.equals(Object)>
	//*  48  108:ifne            178
			throw new IOException((new StringBuilder()).append("unexpected journal header: [").append(s).append(", ").append(s1).append(", ").append(s3).append(", ").append(s4).append("]").toString());
	//   49  111:new             #141 <Class IOException>
	//   50  114:dup             
	//   51  115:new             #209 <Class StringBuilder>
	//   52  118:dup             
	//   53  119:invokespecial   #210 <Method void StringBuilder()>
	//   54  122:ldc2            #427 <String "unexpected journal header: [">
	//   55  125:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   56  128:aload_3         
	//   57  129:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   58  132:ldc2            #429 <String ", ">
	//   59  135:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   60  138:aload           4
	//   61  140:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   62  143:ldc2            #429 <String ", ">
	//   63  146:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   64  149:aload           6
	//   65  151:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   66  154:ldc2            #429 <String ", ">
	//   67  157:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   68  160:aload           7
	//   69  162:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   70  165:ldc2            #431 <String "]">
	//   71  168:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   72  171:invokevirtual   #223 <Method String StringBuilder.toString()>
	//   73  174:invokespecial   #432 <Method void IOException(String)>
	//   74  177:athrow          
		int i = 0;
	//   75  178:iconst_0        
	//   76  179:istore_1        
_L2:
		readJournalLine(strictlinereader.readLine());
	//   77  180:aload_0         
	//   78  181:aload_2         
	//   79  182:invokevirtual   #412 <Method String StrictLineReader.readLine()>
	//   80  185:invokespecial   #435 <Method void readJournalLine(String)>
		i++;
	//   81  188:iload_1         
	//   82  189:iconst_1        
	//   83  190:iadd            
	//   84  191:istore_1        
		if(true) goto _L2; else goto _L1
	//   85  192:goto            180
_L1:
		Object obj;
		obj;
	//   86  195:astore_3        
		redundantOpCount = i - lruEntries.size();
	//   87  196:aload_0         
	//   88  197:iload_1         
	//   89  198:aload_0         
	//   90  199:getfield        #85  <Field LinkedHashMap lruEntries>
	//   91  202:invokevirtual   #328 <Method int LinkedHashMap.size()>
	//   92  205:isub            
	//   93  206:putfield        #179 <Field int redundantOpCount>
		if(strictlinereader.hasUnterminatedLine())
	//*  94  209:aload_2         
	//*  95  210:invokevirtual   #438 <Method boolean StrictLineReader.hasUnterminatedLine()>
	//*  96  213:ifeq            223
		{
			rebuildJournal();
	//   97  216:aload_0         
	//   98  217:invokespecial   #175 <Method void rebuildJournal()>
			break MISSING_BLOCK_LABEL_256;
	//   99  220:goto            256
		}
		journalWriter = ((Writer) (new BufferedWriter(((Writer) (new OutputStreamWriter(((java.io.OutputStream) (new FileOutputStream(journalFile, true))), Util.US_ASCII))))));
	//  100  223:aload_0         
	//  101  224:new             #440 <Class BufferedWriter>
	//  102  227:dup             
	//  103  228:new             #442 <Class OutputStreamWriter>
	//  104  231:dup             
	//  105  232:new             #444 <Class FileOutputStream>
	//  106  235:dup             
	//  107  236:aload_0         
	//  108  237:getfield        #124 <Field File journalFile>
	//  109  240:iconst_1        
	//  110  241:invokespecial   #447 <Method void FileOutputStream(File, boolean)>
	//  111  244:getstatic       #408 <Field java.nio.charset.Charset Util.US_ASCII>
	//  112  247:invokespecial   #450 <Method void OutputStreamWriter(java.io.OutputStream, java.nio.charset.Charset)>
	//  113  250:invokespecial   #453 <Method void BufferedWriter(Writer)>
	//  114  253:putfield        #137 <Field Writer journalWriter>
		Util.closeQuietly(((Closeable) (strictlinereader)));
	//  115  256:aload_2         
	//  116  257:invokestatic    #457 <Method void Util.closeQuietly(Closeable)>
		return;
	//  117  260:return          
		obj;
	//  118  261:astore_3        
		Util.closeQuietly(((Closeable) (strictlinereader)));
	//  119  262:aload_2         
	//  120  263:invokestatic    #457 <Method void Util.closeQuietly(Closeable)>
		throw obj;
	//  121  266:aload_3         
	//  122  267:athrow          
	}

	private void readJournalLine(String s)
		throws IOException
	{
		int i = s.indexOf(' ');
	//    0    0:aload_1         
	//    1    1:bipush          32
	//    2    3:invokevirtual   #461 <Method int String.indexOf(int)>
	//    3    6:istore_2        
		if(i == -1)
	//*   4    7:iload_2         
	//*   5    8:iconst_m1       
	//*   6    9:icmpne          40
			throw new IOException((new StringBuilder()).append("unexpected journal line: ").append(s).toString());
	//    7   12:new             #141 <Class IOException>
	//    8   15:dup             
	//    9   16:new             #209 <Class StringBuilder>
	//   10   19:dup             
	//   11   20:invokespecial   #210 <Method void StringBuilder()>
	//   12   23:ldc2            #463 <String "unexpected journal line: ">
	//   13   26:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   14   29:aload_1         
	//   15   30:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   16   33:invokevirtual   #223 <Method String StringBuilder.toString()>
	//   17   36:invokespecial   #432 <Method void IOException(String)>
	//   18   39:athrow          
		int j = i + 1;
	//   19   40:iload_2         
	//   20   41:iconst_1        
	//   21   42:iadd            
	//   22   43:istore_3        
		int k = s.indexOf(' ', j);
	//   23   44:aload_1         
	//   24   45:bipush          32
	//   25   47:iload_3         
	//   26   48:invokevirtual   #466 <Method int String.indexOf(int, int)>
	//   27   51:istore          4
		String s1;
		if(k == -1)
	//*  28   53:iload           4
	//*  29   55:iconst_m1       
	//*  30   56:icmpne          103
		{
			String s2 = s.substring(j);
	//   31   59:aload_1         
	//   32   60:iload_3         
	//   33   61:invokevirtual   #469 <Method String String.substring(int)>
	//   34   64:astore          6
			s1 = s2;
	//   35   66:aload           6
	//   36   68:astore          5
			if(i == "REMOVE".length())
	//*  37   70:iload_2         
	//*  38   71:ldc1            #45  <String "REMOVE">
	//*  39   73:invokevirtual   #471 <Method int String.length()>
	//*  40   76:icmpne          112
			{
				s1 = s2;
	//   41   79:aload           6
	//   42   81:astore          5
				if(s.startsWith("REMOVE"))
	//*  43   83:aload_1         
	//*  44   84:ldc1            #45  <String "REMOVE">
	//*  45   86:invokevirtual   #475 <Method boolean String.startsWith(String)>
	//*  46   89:ifeq            112
				{
					lruEntries.remove(((Object) (s2)));
	//   47   92:aload_0         
	//   48   93:getfield        #85  <Field LinkedHashMap lruEntries>
	//   49   96:aload           6
	//   50   98:invokevirtual   #280 <Method Object LinkedHashMap.remove(Object)>
	//   51  101:pop             
					return;
	//   52  102:return          
				}
			}
		} else
		{
			s1 = s.substring(j, k);
	//   53  103:aload_1         
	//   54  104:iload_3         
	//   55  105:iload           4
	//   56  107:invokevirtual   #478 <Method String String.substring(int, int)>
	//   57  110:astore          5
		}
		Entry entry1 = (Entry)lruEntries.get(((Object) (s1)));
	//   58  112:aload_0         
	//   59  113:getfield        #85  <Field LinkedHashMap lruEntries>
	//   60  116:aload           5
	//   61  118:invokevirtual   #296 <Method Object LinkedHashMap.get(Object)>
	//   62  121:checkcast       #16  <Class DiskLruCache$Entry>
	//   63  124:astore          7
		Entry entry = entry1;
	//   64  126:aload           7
	//   65  128:astore          6
		if(entry1 == null)
	//*  66  130:aload           7
	//*  67  132:ifnonnull       160
		{
			entry = new Entry(s1);
	//   68  135:new             #16  <Class DiskLruCache$Entry>
	//   69  138:dup             
	//   70  139:aload_0         
	//   71  140:aload           5
	//   72  142:aconst_null     
	//   73  143:invokespecial   #303 <Method void DiskLruCache$Entry(DiskLruCache, String, DiskLruCache$1)>
	//   74  146:astore          6
			lruEntries.put(((Object) (s1)), ((Object) (entry)));
	//   75  148:aload_0         
	//   76  149:getfield        #85  <Field LinkedHashMap lruEntries>
	//   77  152:aload           5
	//   78  154:aload           6
	//   79  156:invokevirtual   #307 <Method Object LinkedHashMap.put(Object, Object)>
	//   80  159:pop             
		}
		if(k != -1 && i == "CLEAN".length() && s.startsWith("CLEAN"))
	//*  81  160:iload           4
	//*  82  162:iconst_m1       
	//*  83  163:icmpeq          220
	//*  84  166:iload_2         
	//*  85  167:ldc1            #27  <String "CLEAN">
	//*  86  169:invokevirtual   #471 <Method int String.length()>
	//*  87  172:icmpne          220
	//*  88  175:aload_1         
	//*  89  176:ldc1            #27  <String "CLEAN">
	//*  90  178:invokevirtual   #475 <Method boolean String.startsWith(String)>
	//*  91  181:ifeq            220
		{
			s = ((String) (s.substring(k + 1).split(" ")));
	//   92  184:aload_1         
	//   93  185:iload           4
	//   94  187:iconst_1        
	//   95  188:iadd            
	//   96  189:invokevirtual   #469 <Method String String.substring(int)>
	//   97  192:ldc2            #480 <String " ">
	//   98  195:invokevirtual   #484 <Method String[] String.split(String)>
	//   99  198:astore_1        
			entry.readable = true;
	//  100  199:aload           6
	//  101  201:iconst_1        
	//  102  202:invokestatic    #257 <Method boolean DiskLruCache$Entry.access$702(DiskLruCache$Entry, boolean)>
	//  103  205:pop             
			entry.currentEditor = null;
	//  104  206:aload           6
	//  105  208:aconst_null     
	//  106  209:invokestatic    #253 <Method DiskLruCache$Editor DiskLruCache$Entry.access$802(DiskLruCache$Entry, DiskLruCache$Editor)>
	//  107  212:pop             
			entry.setLengths(((String []) (s)));
	//  108  213:aload           6
	//  109  215:aload_1         
	//  110  216:invokestatic    #488 <Method void DiskLruCache$Entry.access$900(DiskLruCache$Entry, String[])>
			return;
	//  111  219:return          
		}
		if(k == -1 && i == "DIRTY".length() && s.startsWith("DIRTY"))
	//* 112  220:iload           4
	//* 113  222:iconst_m1       
	//* 114  223:icmpne          262
	//* 115  226:iload_2         
	//* 116  227:ldc1            #29  <String "DIRTY">
	//* 117  229:invokevirtual   #471 <Method int String.length()>
	//* 118  232:icmpne          262
	//* 119  235:aload_1         
	//* 120  236:ldc1            #29  <String "DIRTY">
	//* 121  238:invokevirtual   #475 <Method boolean String.startsWith(String)>
	//* 122  241:ifeq            262
		{
			entry.currentEditor = new Editor(entry);
	//  123  244:aload           6
	//  124  246:new             #13  <Class DiskLruCache$Editor>
	//  125  249:dup             
	//  126  250:aload_0         
	//  127  251:aload           6
	//  128  253:aconst_null     
	//  129  254:invokespecial   #310 <Method void DiskLruCache$Editor(DiskLruCache, DiskLruCache$Entry, DiskLruCache$1)>
	//  130  257:invokestatic    #253 <Method DiskLruCache$Editor DiskLruCache$Entry.access$802(DiskLruCache$Entry, DiskLruCache$Editor)>
	//  131  260:pop             
			return;
	//  132  261:return          
		}
		if(k == -1 && i == "READ".length() && s.startsWith("READ"))
	//* 133  262:iload           4
	//* 134  264:iconst_m1       
	//* 135  265:icmpne          287
	//* 136  268:iload_2         
	//* 137  269:ldc1            #43  <String "READ">
	//* 138  271:invokevirtual   #471 <Method int String.length()>
	//* 139  274:icmpne          287
	//* 140  277:aload_1         
	//* 141  278:ldc1            #43  <String "READ">
	//* 142  280:invokevirtual   #475 <Method boolean String.startsWith(String)>
	//* 143  283:ifeq            287
			return;
	//  144  286:return          
		else
			throw new IOException((new StringBuilder()).append("unexpected journal line: ").append(s).toString());
	//  145  287:new             #141 <Class IOException>
	//  146  290:dup             
	//  147  291:new             #209 <Class StringBuilder>
	//  148  294:dup             
	//  149  295:invokespecial   #210 <Method void StringBuilder()>
	//  150  298:ldc2            #463 <String "unexpected journal line: ">
	//  151  301:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//  152  304:aload_1         
	//  153  305:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//  154  308:invokevirtual   #223 <Method String StringBuilder.toString()>
	//  155  311:invokespecial   #432 <Method void IOException(String)>
	//  156  314:athrow          
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
	//*   3    3:getfield        #137 <Field Writer journalWriter>
	//*   4    6:ifnull          16
			journalWriter.close();
	//    5    9:aload_0         
	//    6   10:getfield        #137 <Field Writer journalWriter>
	//    7   13:invokevirtual   #491 <Method void Writer.close()>
		bufferedwriter = new BufferedWriter(((Writer) (new OutputStreamWriter(((java.io.OutputStream) (new FileOutputStream(journalFileTmp))), Util.US_ASCII))));
	//    8   16:new             #440 <Class BufferedWriter>
	//    9   19:dup             
	//   10   20:new             #442 <Class OutputStreamWriter>
	//   11   23:dup             
	//   12   24:new             #444 <Class FileOutputStream>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:getfield        #126 <Field File journalFileTmp>
	//   16   32:invokespecial   #492 <Method void FileOutputStream(File)>
	//   17   35:getstatic       #408 <Field java.nio.charset.Charset Util.US_ASCII>
	//   18   38:invokespecial   #450 <Method void OutputStreamWriter(java.io.OutputStream, java.nio.charset.Charset)>
	//   19   41:invokespecial   #453 <Method void BufferedWriter(Writer)>
	//   20   44:astore_1        
		Iterator iterator;
		((Writer) (bufferedwriter)).write("libcore.io.DiskLruCache");
	//   21   45:aload_1         
	//   22   46:ldc1            #41  <String "libcore.io.DiskLruCache">
	//   23   48:invokevirtual   #495 <Method void Writer.write(String)>
		((Writer) (bufferedwriter)).write("\n");
	//   24   51:aload_1         
	//   25   52:ldc2            #497 <String "\n">
	//   26   55:invokevirtual   #495 <Method void Writer.write(String)>
		((Writer) (bufferedwriter)).write("1");
	//   27   58:aload_1         
	//   28   59:ldc1            #48  <String "1">
	//   29   61:invokevirtual   #495 <Method void Writer.write(String)>
		((Writer) (bufferedwriter)).write("\n");
	//   30   64:aload_1         
	//   31   65:ldc2            #497 <String "\n">
	//   32   68:invokevirtual   #495 <Method void Writer.write(String)>
		((Writer) (bufferedwriter)).write(Integer.toString(appVersion));
	//   33   71:aload_1         
	//   34   72:aload_0         
	//   35   73:getfield        #117 <Field int appVersion>
	//   36   76:invokestatic    #423 <Method String Integer.toString(int)>
	//   37   79:invokevirtual   #495 <Method void Writer.write(String)>
		((Writer) (bufferedwriter)).write("\n");
	//   38   82:aload_1         
	//   39   83:ldc2            #497 <String "\n">
	//   40   86:invokevirtual   #495 <Method void Writer.write(String)>
		((Writer) (bufferedwriter)).write(Integer.toString(valueCount));
	//   41   89:aload_1         
	//   42   90:aload_0         
	//   43   91:getfield        #130 <Field int valueCount>
	//   44   94:invokestatic    #423 <Method String Integer.toString(int)>
	//   45   97:invokevirtual   #495 <Method void Writer.write(String)>
		((Writer) (bufferedwriter)).write("\n");
	//   46  100:aload_1         
	//   47  101:ldc2            #497 <String "\n">
	//   48  104:invokevirtual   #495 <Method void Writer.write(String)>
		((Writer) (bufferedwriter)).write("\n");
	//   49  107:aload_1         
	//   50  108:ldc2            #497 <String "\n">
	//   51  111:invokevirtual   #495 <Method void Writer.write(String)>
		iterator = lruEntries.values().iterator();
	//   52  114:aload_0         
	//   53  115:getfield        #85  <Field LinkedHashMap lruEntries>
	//   54  118:invokevirtual   #380 <Method Collection LinkedHashMap.values()>
	//   55  121:invokeinterface #386 <Method Iterator Collection.iterator()>
	//   56  126:astore_2        
_L2:
		Entry entry;
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_230;
	//   57  127:aload_2         
	//   58  128:invokeinterface #391 <Method boolean Iterator.hasNext()>
	//   59  133:ifeq            230
			entry = (Entry)iterator.next();
	//   60  136:aload_2         
	//   61  137:invokeinterface #395 <Method Object Iterator.next()>
	//   62  142:checkcast       #16  <Class DiskLruCache$Entry>
	//   63  145:astore_3        
			if(entry.currentEditor == null)
				break MISSING_BLOCK_LABEL_188;
	//   64  146:aload_3         
	//   65  147:invokestatic    #195 <Method DiskLruCache$Editor DiskLruCache$Entry.access$800(DiskLruCache$Entry)>
	//   66  150:ifnull          188
			((Writer) (bufferedwriter)).write((new StringBuilder()).append("DIRTY ").append(entry.key).append('\n').toString());
	//   67  153:aload_1         
	//   68  154:new             #209 <Class StringBuilder>
	//   69  157:dup             
	//   70  158:invokespecial   #210 <Method void StringBuilder()>
	//   71  161:ldc2            #499 <String "DIRTY ">
	//   72  164:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   73  167:aload_3         
	//   74  168:invokestatic    #269 <Method String DiskLruCache$Entry.access$1200(DiskLruCache$Entry)>
	//   75  171:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   76  174:bipush          10
	//   77  176:invokevirtual   #502 <Method StringBuilder StringBuilder.append(char)>
	//   78  179:invokevirtual   #223 <Method String StringBuilder.toString()>
	//   79  182:invokevirtual   #495 <Method void Writer.write(String)>
		} while(true);
	//   80  185:goto            227
		((Writer) (bufferedwriter)).write((new StringBuilder()).append("CLEAN ").append(entry.key).append(entry.getLengths()).append('\n').toString());
	//   81  188:aload_1         
	//   82  189:new             #209 <Class StringBuilder>
	//   83  192:dup             
	//   84  193:invokespecial   #210 <Method void StringBuilder()>
	//   85  196:ldc2            #504 <String "CLEAN ">
	//   86  199:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   87  202:aload_3         
	//   88  203:invokestatic    #269 <Method String DiskLruCache$Entry.access$1200(DiskLruCache$Entry)>
	//   89  206:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   90  209:aload_3         
	//   91  210:invokevirtual   #272 <Method String DiskLruCache$Entry.getLengths()>
	//   92  213:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   93  216:bipush          10
	//   94  218:invokevirtual   #502 <Method StringBuilder StringBuilder.append(char)>
	//   95  221:invokevirtual   #223 <Method String StringBuilder.toString()>
	//   96  224:invokevirtual   #495 <Method void Writer.write(String)>
		if(true) goto _L2; else goto _L1
	//   97  227:goto            127
_L1:
		((Writer) (bufferedwriter)).close();
	//   98  230:aload_1         
	//   99  231:invokevirtual   #491 <Method void Writer.close()>
		break MISSING_BLOCK_LABEL_244;
	//  100  234:goto            244
		Exception exception1;
		exception1;
	//  101  237:astore_2        
		((Writer) (bufferedwriter)).close();
	//  102  238:aload_1         
	//  103  239:invokevirtual   #491 <Method void Writer.close()>
		throw exception1;
	//  104  242:aload_2         
	//  105  243:athrow          
		if(journalFile.exists())
	//* 106  244:aload_0         
	//* 107  245:getfield        #124 <Field File journalFile>
	//* 108  248:invokevirtual   #230 <Method boolean File.exists()>
	//* 109  251:ifeq            266
			renameTo(journalFile, journalFileBackup, true);
	//  110  254:aload_0         
	//  111  255:getfield        #124 <Field File journalFile>
	//  112  258:aload_0         
	//  113  259:getfield        #128 <Field File journalFileBackup>
	//  114  262:iconst_1        
	//  115  263:invokestatic    #340 <Method void renameTo(File, File, boolean)>
		renameTo(journalFileTmp, journalFile, false);
	//  116  266:aload_0         
	//  117  267:getfield        #126 <Field File journalFileTmp>
	//  118  270:aload_0         
	//  119  271:getfield        #124 <Field File journalFile>
	//  120  274:iconst_0        
	//  121  275:invokestatic    #340 <Method void renameTo(File, File, boolean)>
		journalFileBackup.delete();
	//  122  278:aload_0         
	//  123  279:getfield        #128 <Field File journalFileBackup>
	//  124  282:invokevirtual   #290 <Method boolean File.delete()>
	//  125  285:pop             
		journalWriter = ((Writer) (new BufferedWriter(((Writer) (new OutputStreamWriter(((java.io.OutputStream) (new FileOutputStream(journalFile, true))), Util.US_ASCII))))));
	//  126  286:aload_0         
	//  127  287:new             #440 <Class BufferedWriter>
	//  128  290:dup             
	//  129  291:new             #442 <Class OutputStreamWriter>
	//  130  294:dup             
	//  131  295:new             #444 <Class FileOutputStream>
	//  132  298:dup             
	//  133  299:aload_0         
	//  134  300:getfield        #124 <Field File journalFile>
	//  135  303:iconst_1        
	//  136  304:invokespecial   #447 <Method void FileOutputStream(File, boolean)>
	//  137  307:getstatic       #408 <Field java.nio.charset.Charset Util.US_ASCII>
	//  138  310:invokespecial   #450 <Method void OutputStreamWriter(java.io.OutputStream, java.nio.charset.Charset)>
	//  139  313:invokespecial   #453 <Method void BufferedWriter(Writer)>
	//  140  316:putfield        #137 <Field Writer journalWriter>
		this;
	//  141  319:aload_0         
		JVM INSTR monitorexit ;
	//  142  320:monitorexit     
		return;
	//  143  321:return          
		Exception exception;
		exception;
	//  144  322:astore_1        
	//* 145  323:aload_0         
		throw exception;
	//  146  324:monitorexit     
	//  147  325:aload_1         
	//  148  326:athrow          
	}

	private static void renameTo(File file, File file1, boolean flag)
		throws IOException
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            8
			deleteIfExists(file1);
	//    2    4:aload_1         
	//    3    5:invokestatic    #249 <Method void deleteIfExists(File)>
		if(!file.renameTo(file1))
	//*   4    8:aload_0         
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #237 <Method boolean File.renameTo(File)>
	//*   7   13:ifne            24
			throw new IOException();
	//    8   16:new             #141 <Class IOException>
	//    9   19:dup             
	//   10   20:invokespecial   #291 <Method void IOException()>
	//   11   23:athrow          
		else
			return;
	//   12   24:return          
	}

	private void trimToSize()
		throws IOException
	{
		while(size > maxSize) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field long size>
	//*   2    4:aload_0         
	//*   3    5:getfield        #132 <Field long maxSize>
	//*   4    8:lcmp            
	//*   5    9:ifle            48
			remove((String)((java.util.Map.Entry)lruEntries.entrySet().iterator().next()).getKey());
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #85  <Field LinkedHashMap lruEntries>
	//    9   17:invokevirtual   #508 <Method Set LinkedHashMap.entrySet()>
	//   10   20:invokeinterface #511 <Method Iterator Set.iterator()>
	//   11   25:invokeinterface #395 <Method Object Iterator.next()>
	//   12   30:checkcast       #513 <Class java.util.Map$Entry>
	//   13   33:invokeinterface #516 <Method Object java.util.Map$Entry.getKey()>
	//   14   38:checkcast       #414 <Class String>
	//   15   41:invokevirtual   #518 <Method boolean remove(String)>
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
		if(journalWriter != null)
			break MISSING_BLOCK_LABEL_12;
	//    2    2:aload_0         
	//    3    3:getfield        #137 <Field Writer journalWriter>
	//    4    6:ifnonnull       12
		this;
	//    5    9:aload_0         
		JVM INSTR monitorexit ;
	//    6   10:monitorexit     
		return;
	//    7   11:return          
		Iterator iterator = (new ArrayList(lruEntries.values())).iterator();
	//    8   12:new             #520 <Class ArrayList>
	//    9   15:dup             
	//   10   16:aload_0         
	//   11   17:getfield        #85  <Field LinkedHashMap lruEntries>
	//   12   20:invokevirtual   #380 <Method Collection LinkedHashMap.values()>
	//   13   23:invokespecial   #523 <Method void ArrayList(Collection)>
	//   14   26:invokevirtual   #524 <Method Iterator ArrayList.iterator()>
	//   15   29:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//   16   30:aload_1         
	//   17   31:invokeinterface #391 <Method boolean Iterator.hasNext()>
	//   18   36:ifeq            66
			Entry entry = (Entry)iterator.next();
	//   19   39:aload_1         
	//   20   40:invokeinterface #395 <Method Object Iterator.next()>
	//   21   45:checkcast       #16  <Class DiskLruCache$Entry>
	//   22   48:astore_2        
			if(entry.currentEditor != null)
	//*  23   49:aload_2         
	//*  24   50:invokestatic    #195 <Method DiskLruCache$Editor DiskLruCache$Entry.access$800(DiskLruCache$Entry)>
	//*  25   53:ifnull          90
				entry.currentEditor.abort();
	//   26   56:aload_2         
	//   27   57:invokestatic    #195 <Method DiskLruCache$Editor DiskLruCache$Entry.access$800(DiskLruCache$Entry)>
	//   28   60:invokevirtual   #207 <Method void DiskLruCache$Editor.abort()>
		} while(true);
	//   29   63:goto            90
		trimToSize();
	//   30   66:aload_0         
	//   31   67:invokespecial   #157 <Method void trimToSize()>
		journalWriter.close();
	//   32   70:aload_0         
	//   33   71:getfield        #137 <Field Writer journalWriter>
	//   34   74:invokevirtual   #491 <Method void Writer.close()>
		journalWriter = null;
	//   35   77:aload_0         
	//   36   78:aconst_null     
	//   37   79:putfield        #137 <Field Writer journalWriter>
		this;
	//   38   82:aload_0         
		JVM INSTR monitorexit ;
	//   39   83:monitorexit     
		return;
	//   40   84:return          
		Exception exception;
		exception;
	//   41   85:astore_1        
	//*  42   86:aload_0         
		throw exception;
	//   43   87:monitorexit     
	//   44   88:aload_1         
	//   45   89:athrow          
	//*  46   90:goto            30
	}

	public void delete()
		throws IOException
	{
		close();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #525 <Method void close()>
		Util.deleteContents(directory);
	//    2    4:aload_0         
	//    3    5:getfield        #115 <Field File directory>
	//    4    8:invokestatic    #528 <Method void Util.deleteContents(File)>
	//    5   11:return          
	}

	public Editor edit(String s)
		throws IOException
	{
		return edit(s, -1L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2w           #23  <Long -1L>
	//    3    5:invokespecial   #145 <Method DiskLruCache$Editor edit(String, long)>
	//    4    8:areturn         
	}

	public void flush()
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		checkNotClosed();
	//    2    2:aload_0         
	//    3    3:invokespecial   #293 <Method void checkNotClosed()>
		trimToSize();
	//    4    6:aload_0         
	//    5    7:invokespecial   #157 <Method void trimToSize()>
		journalWriter.flush();
	//    6   10:aload_0         
	//    7   11:getfield        #137 <Field Writer journalWriter>
	//    8   14:invokevirtual   #283 <Method void Writer.flush()>
		this;
	//    9   17:aload_0         
		JVM INSTR monitorexit ;
	//   10   18:monitorexit     
		return;
	//   11   19:return          
		Exception exception;
		exception;
	//   12   20:astore_1        
	//*  13   21:aload_0         
		throw exception;
	//   14   22:monitorexit     
	//   15   23:aload_1         
	//   16   24:athrow          
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
	//    3    3:invokespecial   #293 <Method void checkNotClosed()>
		entry = (Entry)lruEntries.get(((Object) (s)));
	//    4    6:aload_0         
	//    5    7:getfield        #85  <Field LinkedHashMap lruEntries>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #296 <Method Object LinkedHashMap.get(Object)>
	//    8   14:checkcast       #16  <Class DiskLruCache$Entry>
	//    9   17:astore          4
		if(entry != null)
			break MISSING_BLOCK_LABEL_28;
	//   10   19:aload           4
	//   11   21:ifnonnull       28
		this;
	//   12   24:aload_0         
		JVM INSTR monitorexit ;
	//   13   25:monitorexit     
		return null;
	//   14   26:aconst_null     
	//   15   27:areturn         
		if(entry.readable)
			break MISSING_BLOCK_LABEL_40;
	//   16   28:aload           4
	//   17   30:invokestatic    #200 <Method boolean DiskLruCache$Entry.access$700(DiskLruCache$Entry)>
	//   18   33:ifne            40
		this;
	//   19   36:aload_0         
		JVM INSTR monitorexit ;
	//   20   37:monitorexit     
		return null;
	//   21   38:aconst_null     
	//   22   39:areturn         
		int j;
		File afile[];
		afile = entry.cleanFiles;
	//   23   40:aload           4
	//   24   42:getfield        #534 <Field File[] DiskLruCache$Entry.cleanFiles>
	//   25   45:astore          5
		j = afile.length;
	//   26   47:aload           5
	//   27   49:arraylength     
	//   28   50:istore_3        
		int i = 0;
	//   29   51:iconst_0        
	//   30   52:istore_2        
_L2:
		if(i >= j)
			break MISSING_BLOCK_LABEL_72;
	//   31   53:iload_2         
	//   32   54:iload_3         
	//   33   55:icmpge          72
		if(afile[i].exists())
			break MISSING_BLOCK_LABEL_175;
	//   34   58:aload           5
	//   35   60:iload_2         
	//   36   61:aaload          
	//   37   62:invokevirtual   #230 <Method boolean File.exists()>
	//   38   65:ifne            175
		this;
	//   39   68:aload_0         
		JVM INSTR monitorexit ;
	//   40   69:monitorexit     
		return null;
	//   41   70:aconst_null     
	//   42   71:areturn         
		redundantOpCount = redundantOpCount + 1;
	//   43   72:aload_0         
	//   44   73:aload_0         
	//   45   74:getfield        #179 <Field int redundantOpCount>
	//   46   77:iconst_1        
	//   47   78:iadd            
	//   48   79:putfield        #179 <Field int redundantOpCount>
		journalWriter.append("READ");
	//   49   82:aload_0         
	//   50   83:getfield        #137 <Field Writer journalWriter>
	//   51   86:ldc1            #43  <String "READ">
	//   52   88:invokevirtual   #262 <Method Writer Writer.append(CharSequence)>
	//   53   91:pop             
		journalWriter.append(' ');
	//   54   92:aload_0         
	//   55   93:getfield        #137 <Field Writer journalWriter>
	//   56   96:bipush          32
	//   57   98:invokevirtual   #265 <Method Writer Writer.append(char)>
	//   58  101:pop             
		journalWriter.append(((CharSequence) (s)));
	//   59  102:aload_0         
	//   60  103:getfield        #137 <Field Writer journalWriter>
	//   61  106:aload_1         
	//   62  107:invokevirtual   #262 <Method Writer Writer.append(CharSequence)>
	//   63  110:pop             
		journalWriter.append('\n');
	//   64  111:aload_0         
	//   65  112:getfield        #137 <Field Writer journalWriter>
	//   66  115:bipush          10
	//   67  117:invokevirtual   #265 <Method Writer Writer.append(char)>
	//   68  120:pop             
		if(journalRebuildRequired())
	//*  69  121:aload_0         
	//*  70  122:invokespecial   #171 <Method boolean journalRebuildRequired()>
	//*  71  125:ifeq            140
			executorService.submit(cleanupCallable);
	//   72  128:aload_0         
	//   73  129:getfield        #108 <Field ThreadPoolExecutor executorService>
	//   74  132:aload_0         
	//   75  133:getfield        #113 <Field Callable cleanupCallable>
	//   76  136:invokevirtual   #287 <Method java.util.concurrent.Future ThreadPoolExecutor.submit(Callable)>
	//   77  139:pop             
		s = ((String) (new Value(s, entry.sequenceNumber, entry.cleanFiles, entry.lengths)));
	//   78  140:new             #19  <Class DiskLruCache$Value>
	//   79  143:dup             
	//   80  144:aload_0         
	//   81  145:aload_1         
	//   82  146:aload           4
	//   83  148:invokestatic    #300 <Method long DiskLruCache$Entry.access$1300(DiskLruCache$Entry)>
	//   84  151:aload           4
	//   85  153:getfield        #534 <Field File[] DiskLruCache$Entry.cleanFiles>
	//   86  156:aload           4
	//   87  158:invokestatic    #241 <Method long[] DiskLruCache$Entry.access$1100(DiskLruCache$Entry)>
	//   88  161:aconst_null     
	//   89  162:invokespecial   #537 <Method void DiskLruCache$Value(DiskLruCache, String, long, File[], long[], DiskLruCache$1)>
	//   90  165:astore_1        
		this;
	//   91  166:aload_0         
		JVM INSTR monitorexit ;
	//   92  167:monitorexit     
		return ((Value) (s));
	//   93  168:aload_1         
	//   94  169:areturn         
		s;
	//   95  170:astore_1        
	//*  96  171:aload_0         
		throw s;
	//   97  172:monitorexit     
	//   98  173:aload_1         
	//   99  174:athrow          
		i++;
	//  100  175:iload_2         
	//  101  176:iconst_1        
	//  102  177:iadd            
	//  103  178:istore_2        
		if(true) goto _L2; else goto _L1
	//  104  179:goto            53
_L1:
	}

	public File getDirectory()
	{
		return directory;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field File directory>
	//    2    4:areturn         
	}

	public long getMaxSize()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		long l = maxSize;
	//    2    2:aload_0         
	//    3    3:getfield        #132 <Field long maxSize>
	//    4    6:lstore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return l;
	//    7    9:lload_1         
	//    8   10:lreturn         
		Exception exception;
		exception;
	//    9   11:astore_3        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_3         
	//   13   15:athrow          
	}

	public boolean isClosed()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Writer writer = journalWriter;
	//    2    2:aload_0         
	//    3    3:getfield        #137 <Field Writer journalWriter>
	//    4    6:astore_2        
		boolean flag;
		if(writer == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       16
			flag = true;
	//    7   11:iconst_1        
	//    8   12:istore_1        
		else
	//*   9   13:goto            18
			flag = false;
	//   10   16:iconst_0        
	//   11   17:istore_1        
		this;
	//   12   18:aload_0         
		JVM INSTR monitorexit ;
	//   13   19:monitorexit     
		return flag;
	//   14   20:iload_1         
	//   15   21:ireturn         
		Exception exception;
		exception;
	//   16   22:astore_2        
	//*  17   23:aload_0         
		throw exception;
	//   18   24:monitorexit     
	//   19   25:aload_2         
	//   20   26:athrow          
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
	//    3    3:invokespecial   #293 <Method void checkNotClosed()>
		entry = (Entry)lruEntries.get(((Object) (s)));
	//    4    6:aload_0         
	//    5    7:getfield        #85  <Field LinkedHashMap lruEntries>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #296 <Method Object LinkedHashMap.get(Object)>
	//    8   14:checkcast       #16  <Class DiskLruCache$Entry>
	//    9   17:astore_3        
		if(entry == null) goto _L2; else goto _L1
	//   10   18:aload_3         
	//   11   19:ifnull          29
_L1:
		if(entry.currentEditor == null) goto _L3; else goto _L2
	//   12   22:aload_3         
	//   13   23:invokestatic    #195 <Method DiskLruCache$Editor DiskLruCache$Entry.access$800(DiskLruCache$Entry)>
	//   14   26:ifnull          208
_L2:
		this;
	//   15   29:aload_0         
		JVM INSTR monitorexit ;
	//   16   30:monitorexit     
		return false;
	//   17   31:iconst_0        
	//   18   32:ireturn         
_L5:
		int i;
		if(i >= valueCount)
			break MISSING_BLOCK_LABEL_122;
	//   19   33:iload_2         
	//   20   34:aload_0         
	//   21   35:getfield        #130 <Field int valueCount>
	//   22   38:icmpge          122
		File file = entry.getCleanFile(i);
	//   23   41:aload_3         
	//   24   42:iload_2         
	//   25   43:invokevirtual   #233 <Method File DiskLruCache$Entry.getCleanFile(int)>
	//   26   46:astore          4
		if(file.exists() && !file.delete())
	//*  27   48:aload           4
	//*  28   50:invokevirtual   #230 <Method boolean File.exists()>
	//*  29   53:ifeq            93
	//*  30   56:aload           4
	//*  31   58:invokevirtual   #290 <Method boolean File.delete()>
	//*  32   61:ifne            93
			throw new IOException((new StringBuilder()).append("failed to delete ").append(((Object) (file))).toString());
	//   33   64:new             #141 <Class IOException>
	//   34   67:dup             
	//   35   68:new             #209 <Class StringBuilder>
	//   36   71:dup             
	//   37   72:invokespecial   #210 <Method void StringBuilder()>
	//   38   75:ldc2            #543 <String "failed to delete ">
	//   39   78:invokevirtual   #216 <Method StringBuilder StringBuilder.append(String)>
	//   40   81:aload           4
	//   41   83:invokevirtual   #359 <Method StringBuilder StringBuilder.append(Object)>
	//   42   86:invokevirtual   #223 <Method String StringBuilder.toString()>
	//   43   89:invokespecial   #432 <Method void IOException(String)>
	//   44   92:athrow          
		size = size - entry.lengths[i];
	//   45   93:aload_0         
	//   46   94:aload_0         
	//   47   95:getfield        #77  <Field long size>
	//   48   98:aload_3         
	//   49   99:invokestatic    #241 <Method long[] DiskLruCache$Entry.access$1100(DiskLruCache$Entry)>
	//   50  102:iload_2         
	//   51  103:laload          
	//   52  104:lsub            
	//   53  105:putfield        #77  <Field long size>
		entry.lengths[i] = 0L;
	//   54  108:aload_3         
	//   55  109:invokestatic    #241 <Method long[] DiskLruCache$Entry.access$1100(DiskLruCache$Entry)>
	//   56  112:iload_2         
	//   57  113:lconst_0        
	//   58  114:lastore         
		i++;
	//   59  115:iload_2         
	//   60  116:iconst_1        
	//   61  117:iadd            
	//   62  118:istore_2        
		continue; /* Loop/switch isn't completed */
	//   63  119:goto            33
		redundantOpCount = redundantOpCount + 1;
	//   64  122:aload_0         
	//   65  123:aload_0         
	//   66  124:getfield        #179 <Field int redundantOpCount>
	//   67  127:iconst_1        
	//   68  128:iadd            
	//   69  129:putfield        #179 <Field int redundantOpCount>
		journalWriter.append("REMOVE");
	//   70  132:aload_0         
	//   71  133:getfield        #137 <Field Writer journalWriter>
	//   72  136:ldc1            #45  <String "REMOVE">
	//   73  138:invokevirtual   #262 <Method Writer Writer.append(CharSequence)>
	//   74  141:pop             
		journalWriter.append(' ');
	//   75  142:aload_0         
	//   76  143:getfield        #137 <Field Writer journalWriter>
	//   77  146:bipush          32
	//   78  148:invokevirtual   #265 <Method Writer Writer.append(char)>
	//   79  151:pop             
		journalWriter.append(((CharSequence) (s)));
	//   80  152:aload_0         
	//   81  153:getfield        #137 <Field Writer journalWriter>
	//   82  156:aload_1         
	//   83  157:invokevirtual   #262 <Method Writer Writer.append(CharSequence)>
	//   84  160:pop             
		journalWriter.append('\n');
	//   85  161:aload_0         
	//   86  162:getfield        #137 <Field Writer journalWriter>
	//   87  165:bipush          10
	//   88  167:invokevirtual   #265 <Method Writer Writer.append(char)>
	//   89  170:pop             
		lruEntries.remove(((Object) (s)));
	//   90  171:aload_0         
	//   91  172:getfield        #85  <Field LinkedHashMap lruEntries>
	//   92  175:aload_1         
	//   93  176:invokevirtual   #280 <Method Object LinkedHashMap.remove(Object)>
	//   94  179:pop             
		if(journalRebuildRequired())
	//*  95  180:aload_0         
	//*  96  181:invokespecial   #171 <Method boolean journalRebuildRequired()>
	//*  97  184:ifeq            199
			executorService.submit(cleanupCallable);
	//   98  187:aload_0         
	//   99  188:getfield        #108 <Field ThreadPoolExecutor executorService>
	//  100  191:aload_0         
	//  101  192:getfield        #113 <Field Callable cleanupCallable>
	//  102  195:invokevirtual   #287 <Method java.util.concurrent.Future ThreadPoolExecutor.submit(Callable)>
	//  103  198:pop             
		this;
	//  104  199:aload_0         
		JVM INSTR monitorexit ;
	//  105  200:monitorexit     
		return true;
	//  106  201:iconst_1        
	//  107  202:ireturn         
		s;
	//  108  203:astore_1        
	//* 109  204:aload_0         
		throw s;
	//  110  205:monitorexit     
	//  111  206:aload_1         
	//  112  207:athrow          
_L3:
		i = 0;
	//  113  208:iconst_0        
	//  114  209:istore_2        
		if(true) goto _L5; else goto _L4
	//  115  210:goto            33
_L4:
	}

	public void setMaxSize(long l)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		maxSize = l;
	//    2    2:aload_0         
	//    3    3:lload_1         
	//    4    4:putfield        #132 <Field long maxSize>
		executorService.submit(cleanupCallable);
	//    5    7:aload_0         
	//    6    8:getfield        #108 <Field ThreadPoolExecutor executorService>
	//    7   11:aload_0         
	//    8   12:getfield        #113 <Field Callable cleanupCallable>
	//    9   15:invokevirtual   #287 <Method java.util.concurrent.Future ThreadPoolExecutor.submit(Callable)>
	//   10   18:pop             
		this;
	//   11   19:aload_0         
		JVM INSTR monitorexit ;
	//   12   20:monitorexit     
		return;
	//   13   21:return          
		Exception exception;
		exception;
	//   14   22:astore_3        
	//*  15   23:aload_0         
		throw exception;
	//   16   24:monitorexit     
	//   17   25:aload_3         
	//   18   26:athrow          
	}

	public long size()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		long l = size;
	//    2    2:aload_0         
	//    3    3:getfield        #77  <Field long size>
	//    4    6:lstore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return l;
	//    7    9:lload_1         
	//    8   10:lreturn         
		Exception exception;
		exception;
	//    9   11:astore_3        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_3         
	//   13   15:athrow          
	}

	static final long ANY_SEQUENCE_NUMBER = -1L;
	private static final String CLEAN = "CLEAN";
	private static final String DIRTY = "DIRTY";
	static final String JOURNAL_FILE = "journal";
	static final String JOURNAL_FILE_BACKUP = "journal.bkp";
	static final String JOURNAL_FILE_TEMP = "journal.tmp";
	static final String MAGIC = "libcore.io.DiskLruCache";
	private static final String READ = "READ";
	private static final String REMOVE = "REMOVE";
	static final String VERSION_1 = "1";
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
			DiskLruCache disklrucache = DiskLruCache.this;
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field DiskLruCache this$0>
		//    2    4:astore_1        
			disklrucache;
		//    3    5:aload_1         
			JVM INSTR monitorenter ;
		//    4    6:monitorenter    
			Writer writer = journalWriter;
		//    5    7:aload_0         
		//    6    8:getfield        #15  <Field DiskLruCache this$0>
		//    7   11:invokestatic    #31  <Method Writer DiskLruCache.access$100(DiskLruCache)>
		//    8   14:astore_2        
			if(writer != null)
				break MISSING_BLOCK_LABEL_23;
		//    9   15:aload_2         
		//   10   16:ifnonnull       23
			disklrucache;
		//   11   19:aload_1         
			JVM INSTR monitorexit ;
		//   12   20:monitorexit     
			return null;
		//   13   21:aconst_null     
		//   14   22:areturn         
			trimToSize();
		//   15   23:aload_0         
		//   16   24:getfield        #15  <Field DiskLruCache this$0>
		//   17   27:invokestatic    #34  <Method void DiskLruCache.access$200(DiskLruCache)>
			if(journalRebuildRequired())
		//*  18   30:aload_0         
		//*  19   31:getfield        #15  <Field DiskLruCache this$0>
		//*  20   34:invokestatic    #38  <Method boolean DiskLruCache.access$300(DiskLruCache)>
		//*  21   37:ifeq            56
			{
				rebuildJournal();
		//   22   40:aload_0         
		//   23   41:getfield        #15  <Field DiskLruCache this$0>
		//   24   44:invokestatic    #41  <Method void DiskLruCache.access$400(DiskLruCache)>
				redundantOpCount = 0;
		//   25   47:aload_0         
		//   26   48:getfield        #15  <Field DiskLruCache this$0>
		//   27   51:iconst_0        
		//   28   52:invokestatic    #45  <Method int DiskLruCache.access$502(DiskLruCache, int)>
		//   29   55:pop             
			}
			disklrucache;
		//   30   56:aload_1         
			JVM INSTR monitorexit ;
		//   31   57:monitorexit     
			  goto _L1
		//*  32   58:goto            66
			Exception exception;
			exception;
		//   33   61:astore_2        
		//*  34   62:aload_1         
			throw exception;
		//   35   63:monitorexit     
		//   36   64:aload_2         
		//   37   65:athrow          
_L1:
			return null;
		//   38   66:aconst_null     
		//   39   67:areturn         
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
	//    1    1:getfield        #137 <Field Writer journalWriter>
	//    2    4:areturn         
	}

*/


/*
	static Editor access$1700(DiskLruCache disklrucache, String s, long l)
		throws IOException
	{
		return disklrucache.edit(s, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokespecial   #145 <Method DiskLruCache$Editor edit(String, long)>
	//    4    6:areturn         
	}

*/


/*
	static String access$1800(InputStream inputstream)
		throws IOException
	{
		return inputStreamToString(inputstream);
	//    0    0:aload_0         
	//    1    1:invokestatic    #151 <Method String inputStreamToString(InputStream)>
	//    2    4:areturn         
	}

*/


/*
	static int access$1900(DiskLruCache disklrucache)
	{
		return disklrucache.valueCount;
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field int valueCount>
	//    2    4:ireturn         
	}

*/


/*
	static void access$200(DiskLruCache disklrucache)
		throws IOException
	{
		disklrucache.trimToSize();
	//    0    0:aload_0         
	//    1    1:invokespecial   #157 <Method void trimToSize()>
		return;
	//    2    4:return          
	}

*/


/*
	static File access$2000(DiskLruCache disklrucache)
	{
		return disklrucache.directory;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field File directory>
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
	//    3    3:invokespecial   #165 <Method void completeEdit(DiskLruCache$Editor, boolean)>
		return;
	//    4    6:return          
	}

*/


/*
	static boolean access$300(DiskLruCache disklrucache)
	{
		return disklrucache.journalRebuildRequired();
	//    0    0:aload_0         
	//    1    1:invokespecial   #171 <Method boolean journalRebuildRequired()>
	//    2    4:ireturn         
	}

*/


/*
	static void access$400(DiskLruCache disklrucache)
		throws IOException
	{
		disklrucache.rebuildJournal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #175 <Method void rebuildJournal()>
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
	//    2    2:putfield        #179 <Field int redundantOpCount>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/
}
