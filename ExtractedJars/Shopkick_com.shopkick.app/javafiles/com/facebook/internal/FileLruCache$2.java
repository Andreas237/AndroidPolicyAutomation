// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import java.io.File;

// Referenced classes of package com.facebook.internal:
//			FileLruCache

class FileLruCache$2
	implements Runnable
{

	public void run()
	{
		File afile[] = val$filesToDelete;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field File[] val$filesToDelete>
	//    2    4:astore_3        
		int j = afile.length;
	//    3    5:aload_3         
	//    4    6:arraylength     
	//    5    7:istore_2        
		for(int i = 0; i < j; i++)
	//*   6    8:iconst_0        
	//*   7    9:istore_1        
	//*   8   10:iload_1         
	//*   9   11:iload_2         
	//*  10   12:icmpge          29
			afile[i].delete();
	//   11   15:aload_3         
	//   12   16:iload_1         
	//   13   17:aaload          
	//   14   18:invokevirtual   #31  <Method boolean File.delete()>
	//   15   21:pop             

	//   16   22:iload_1         
	//   17   23:iconst_1        
	//   18   24:iadd            
	//   19   25:istore_1        
	//*  20   26:goto            10
	//   21   29:return          
	}

	final FileLruCache this$0;
	final File val$filesToDelete[];

	FileLruCache$2()
	{
		this$0 = final_filelrucache;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field FileLruCache this$0>
		val$filesToDelete = _5B_Ljava.io.File_3B_.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field File[] val$filesToDelete>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
