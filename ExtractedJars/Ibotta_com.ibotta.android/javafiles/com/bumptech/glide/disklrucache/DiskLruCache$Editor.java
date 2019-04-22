// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.disklrucache;

import java.io.File;
import java.io.IOException;

// Referenced classes of package com.bumptech.glide.disklrucache:
//			DiskLruCache

public final class DiskLruCache$Editor
{

	public void abort()
		throws IOException
	{
		DiskLruCache.access$2100(DiskLruCache.this, this, false);
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
		DiskLruCache.access$2100(DiskLruCache.this, this, true);
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
				if(DiskLruCache.Entry.access$800(entry) != this)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #24  <Field DiskLruCache$Entry entry>
	//    7   11:invokestatic    #64  <Method DiskLruCache$Editor DiskLruCache$Entry.access$800(DiskLruCache$Entry)>
	//    8   14:aload_0         
	//    9   15:if_acmpne       72
				if(!DiskLruCache.Entry.access$700(entry))
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
				if(!DiskLruCache.access$2000(DiskLruCache.this).exists())
	//*  24   44:aload_0         
	//*  25   45:getfield        #19  <Field DiskLruCache this$0>
	//*  26   48:invokestatic    #71  <Method File DiskLruCache.access$2000(DiskLruCache)>
	//*  27   51:invokevirtual   #77  <Method boolean File.exists()>
	//*  28   54:ifne            68
					DiskLruCache.access$2000(DiskLruCache.this).mkdirs();
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
