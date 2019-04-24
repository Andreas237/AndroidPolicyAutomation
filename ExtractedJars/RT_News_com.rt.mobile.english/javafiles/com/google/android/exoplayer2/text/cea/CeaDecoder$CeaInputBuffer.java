// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.cea;

import com.google.android.exoplayer2.text.SubtitleInputBuffer;

// Referenced classes of package com.google.android.exoplayer2.text.cea:
//			CeaDecoder

private static final class CeaDecoder$CeaInputBuffer extends SubtitleInputBuffer
	implements Comparable
{

	public int compareTo(CeaDecoder$CeaInputBuffer ceadecoder$ceainputbuffer)
	{
		boolean flag = isEndOfStream();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #30  <Method boolean isEndOfStream()>
	//    2    4:istore_3        
		boolean flag1 = ceadecoder$ceainputbuffer.isEndOfStream();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #30  <Method boolean isEndOfStream()>
	//    5    9:istore          4
		byte byte0 = -1;
	//    6   11:iconst_m1       
	//    7   12:istore_2        
		if(flag != flag1)
	//*   8   13:iload_3         
	//*   9   14:iload           4
	//*  10   16:icmpeq          30
		{
			if(isEndOfStream())
	//*  11   19:aload_0         
	//*  12   20:invokevirtual   #30  <Method boolean isEndOfStream()>
	//*  13   23:ifeq            28
				byte0 = 1;
	//   14   26:iconst_1        
	//   15   27:istore_2        
			return ((int) (byte0));
	//   16   28:iload_2         
	//   17   29:ireturn         
		}
		long l1 = timeUs - ceadecoder$ceainputbuffer.timeUs;
	//   18   30:aload_0         
	//   19   31:getfield        #33  <Field long timeUs>
	//   20   34:aload_1         
	//   21   35:getfield        #33  <Field long timeUs>
	//   22   38:lsub            
	//   23   39:lstore          7
		long l = l1;
	//   24   41:lload           7
	//   25   43:lstore          5
		if(l1 == 0L)
	//*  26   45:lload           7
	//*  27   47:lconst_0        
	//*  28   48:lcmp            
	//*  29   49:ifne            72
		{
			l = queuedInputBufferCount - ceadecoder$ceainputbuffer.queuedInputBufferCount;
	//   30   52:aload_0         
	//   31   53:getfield        #23  <Field long queuedInputBufferCount>
	//   32   56:aload_1         
	//   33   57:getfield        #23  <Field long queuedInputBufferCount>
	//   34   60:lsub            
	//   35   61:lstore          5
			if(l == 0L)
	//*  36   63:lload           5
	//*  37   65:lconst_0        
	//*  38   66:lcmp            
	//*  39   67:ifne            72
				return 0;
	//   40   70:iconst_0        
	//   41   71:ireturn         
		}
		if(l > 0L)
	//*  42   72:lload           5
	//*  43   74:lconst_0        
	//*  44   75:lcmp            
	//*  45   76:ifle            81
			byte0 = 1;
	//   46   79:iconst_1        
	//   47   80:istore_2        
		return ((int) (byte0));
	//   48   81:iload_2         
	//   49   82:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((CeaDecoder$CeaInputBuffer)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class CeaDecoder$CeaInputBuffer>
	//    3    5:invokevirtual   #37  <Method int compareTo(CeaDecoder$CeaInputBuffer)>
	//    4    8:ireturn         
	}

	private long queuedInputBufferCount;


/*
	static long access$202(CeaDecoder$CeaInputBuffer ceadecoder$ceainputbuffer, long l)
	{
		ceadecoder$ceainputbuffer.queuedInputBufferCount = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #23  <Field long queuedInputBufferCount>
		return l;
	//    3    5:lload_1         
	//    4    6:lreturn         
	}

*/

	private CeaDecoder$CeaInputBuffer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void SubtitleInputBuffer()>
	//    2    4:return          
	}

	CeaDecoder$CeaInputBuffer(CeaDecoder._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void CeaDecoder$CeaInputBuffer()>
	//    2    4:return          
	}
}
