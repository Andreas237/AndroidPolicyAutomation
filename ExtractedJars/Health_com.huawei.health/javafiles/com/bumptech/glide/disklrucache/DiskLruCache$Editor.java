// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.disklrucache;

import java.io.*;

// Referenced classes of package com.bumptech.glide.disklrucache:
//			DiskLruCache, Util

public final class DiskLruCache$Editor
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
		if(DiskLruCache.Entry.access$800(entry) != this)
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
		flag = DiskLruCache.Entry.access$700(entry);
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
		DiskLruCache.access$2100(DiskLruCache.this, this, false);
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
		DiskLruCache.access$2100(DiskLruCache.this, this, true);
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
		if(DiskLruCache.Entry.access$800(entry) != this)
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
		if(!DiskLruCache.Entry.access$700(entry))
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
		if(!DiskLruCache.access$2000(DiskLruCache.this).exists())
	//*  28   52:aload_0         
	//*  29   53:getfield        #19  <Field DiskLruCache this$0>
	//*  30   56:invokestatic    #86  <Method File DiskLruCache.access$2000(DiskLruCache)>
	//*  31   59:invokevirtual   #92  <Method boolean File.exists()>
	//*  32   62:ifne            76
			DiskLruCache.access$2000(DiskLruCache.this).mkdirs();
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
			return DiskLruCache.access$1800(inputstream);
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
		Util.closeQuietly(((java.io.Closeable) (outputstreamwriter1)));
	//   18   35:aload           4
	//   19   37:invokestatic    #131 <Method void Util.closeQuietly(java.io.Closeable)>
		return;
	//   20   40:return          
		s;
	//   21   41:astore_2        
		Util.closeQuietly(((java.io.Closeable) (outputstreamwriter)));
	//   22   42:aload_3         
	//   23   43:invokestatic    #131 <Method void Util.closeQuietly(java.io.Closeable)>
		throw s;
	//   24   46:aload_2         
	//   25   47:athrow          
	}

	private boolean committed;
	private final DiskLruCache.Entry entry;
	final DiskLruCache this$0;
	private final boolean written[];


/*
	static DiskLruCache.Entry access$1500(DiskLruCache$Editor disklrucache$editor)
	{
		return disklrucache$editor.entry;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field DiskLruCache$Entry entry>
	//    2    4:areturn         
	}

*/


/*
	static boolean[] access$1600(DiskLruCache$Editor disklrucache$editor)
	{
		return disklrucache$editor.written;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean[] written>
	//    2    4:areturn         
	}

*/

	private DiskLruCache$Editor(DiskLruCache.Entry entry1)
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
		if(DiskLruCache.Entry.access$700(entry1))
	//*   8   14:aload_2         
	//*   9   15:invokestatic    #30  <Method boolean DiskLruCache$Entry.access$700(DiskLruCache$Entry)>
	//*  10   18:ifeq            26
			disklrucache = null;
	//   11   21:aconst_null     
	//   12   22:astore_1        
		else
	//*  13   23:goto            33
			disklrucache = ((DiskLruCache) (new boolean[DiskLruCache.access$1900(DiskLruCache.this)]));
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

	DiskLruCache$Editor(DiskLruCache.Entry entry1, DiskLruCache._cls1 _pcls1)
	{
		this(entry1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #40  <Method void DiskLruCache$Editor(DiskLruCache, DiskLruCache$Entry)>
	//    4    6:return          
	}
}
