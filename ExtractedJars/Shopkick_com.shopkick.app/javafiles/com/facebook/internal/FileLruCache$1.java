// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import java.io.File;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.facebook.internal:
//			FileLruCache

class FileLruCache$1
	implements reamCloseCallback
{

	public void onClose()
	{
		if(val$bufferFileCreateTime < FileLruCache.access$000(FileLruCache.this).get())
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field long val$bufferFileCreateTime>
	//*   2    4:aload_0         
	//*   3    5:getfield        #23  <Field FileLruCache this$0>
	//*   4    8:invokestatic    #38  <Method AtomicLong FileLruCache.access$000(FileLruCache)>
	//*   5   11:invokevirtual   #44  <Method long AtomicLong.get()>
	//*   6   14:lcmp            
	//*   7   15:ifge            27
		{
			val$buffer.delete();
	//    8   18:aload_0         
	//    9   19:getfield        #27  <Field File val$buffer>
	//   10   22:invokevirtual   #50  <Method boolean File.delete()>
	//   11   25:pop             
			return;
	//   12   26:return          
		} else
		{
			FileLruCache.access$100(FileLruCache.this, val$key, val$buffer);
	//   13   27:aload_0         
	//   14   28:getfield        #23  <Field FileLruCache this$0>
	//   15   31:aload_0         
	//   16   32:getfield        #29  <Field String val$key>
	//   17   35:aload_0         
	//   18   36:getfield        #27  <Field File val$buffer>
	//   19   39:invokestatic    #54  <Method void FileLruCache.access$100(FileLruCache, String, File)>
			return;
	//   20   42:return          
		}
	}

	final FileLruCache this$0;
	final File val$buffer;
	final long val$bufferFileCreateTime;
	final String val$key;

	FileLruCache$1()
	{
		this$0 = final_filelrucache;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field FileLruCache this$0>
		val$bufferFileCreateTime = l;
	//    3    5:aload_0         
	//    4    6:lload_2         
	//    5    7:putfield        #25  <Field long val$bufferFileCreateTime>
		val$buffer = file;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #27  <Field File val$buffer>
		val$key = String.this;
	//    9   16:aload_0         
	//   10   17:aload           5
	//   11   19:putfield        #29  <Field String val$key>
		super();
	//   12   22:aload_0         
	//   13   23:invokespecial   #32  <Method void Object()>
	//   14   26:return          
	}
}
