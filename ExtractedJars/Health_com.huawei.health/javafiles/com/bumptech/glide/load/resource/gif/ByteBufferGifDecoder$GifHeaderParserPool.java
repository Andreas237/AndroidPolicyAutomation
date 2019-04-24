// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.gif;

import com.bumptech.glide.gifdecoder.GifHeaderParser;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.util.Queue;

// Referenced classes of package com.bumptech.glide.load.resource.gif:
//			ByteBufferGifDecoder

static class ByteBufferGifDecoder$GifHeaderParserPool
{

	public GifHeaderParser obtain(ByteBuffer bytebuffer)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		GifHeaderParser gifheaderparser1 = (GifHeaderParser)pool.poll();
	//    2    2:aload_0         
	//    3    3:getfield        #22  <Field Queue pool>
	//    4    6:invokeinterface #31  <Method Object Queue.poll()>
	//    5   11:checkcast       #33  <Class GifHeaderParser>
	//    6   14:astore_3        
		GifHeaderParser gifheaderparser;
		gifheaderparser = gifheaderparser1;
	//    7   15:aload_3         
	//    8   16:astore_2        
		if(gifheaderparser1 != null)
			break MISSING_BLOCK_LABEL_29;
	//    9   17:aload_3         
	//   10   18:ifnonnull       29
		gifheaderparser = new GifHeaderParser();
	//   11   21:new             #33  <Class GifHeaderParser>
	//   12   24:dup             
	//   13   25:invokespecial   #34  <Method void GifHeaderParser()>
	//   14   28:astore_2        
		bytebuffer = ((ByteBuffer) (gifheaderparser.setData(bytebuffer)));
	//   15   29:aload_2         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #37  <Method GifHeaderParser GifHeaderParser.setData(ByteBuffer)>
	//   18   34:astore_1        
		this;
	//   19   35:aload_0         
		JVM INSTR monitorexit ;
	//   20   36:monitorexit     
		return ((GifHeaderParser) (bytebuffer));
	//   21   37:aload_1         
	//   22   38:areturn         
		bytebuffer;
	//   23   39:astore_1        
	//*  24   40:aload_0         
		throw bytebuffer;
	//   25   41:monitorexit     
	//   26   42:aload_1         
	//   27   43:athrow          
	}

	public void release(GifHeaderParser gifheaderparser)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		gifheaderparser.clear();
	//    2    2:aload_1         
	//    3    3:invokevirtual   #42  <Method void GifHeaderParser.clear()>
		pool.offer(((Object) (gifheaderparser)));
	//    4    6:aload_0         
	//    5    7:getfield        #22  <Field Queue pool>
	//    6   10:aload_1         
	//    7   11:invokeinterface #46  <Method boolean Queue.offer(Object)>
	//    8   16:pop             
		this;
	//    9   17:aload_0         
		JVM INSTR monitorexit ;
	//   10   18:monitorexit     
		return;
	//   11   19:return          
		gifheaderparser;
	//   12   20:astore_1        
	//*  13   21:aload_0         
		throw gifheaderparser;
	//   14   22:monitorexit     
	//   15   23:aload_1         
	//   16   24:athrow          
	}

	private final Queue pool = Util.createQueue(0);

	ByteBufferGifDecoder$GifHeaderParserPool()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokestatic    #20  <Method Queue Util.createQueue(int)>
	//    5    9:putfield        #22  <Field Queue pool>
	//    6   12:return          
	}
}
