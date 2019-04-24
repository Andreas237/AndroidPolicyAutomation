// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;

// Referenced classes of package com.google.android.exoplayer2.extractor.ogg:
//			DefaultOggSeeker, StreamReader

private class DefaultOggSeeker$OggSeekMap
	implements SeekMap
{

	public long getDurationUs()
	{
		return DefaultOggSeeker.access$200(DefaultOggSeeker.this).convertGranuleToTime(DefaultOggSeeker.access$400(DefaultOggSeeker.this));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field DefaultOggSeeker this$0>
	//    2    4:invokestatic    #28  <Method StreamReader DefaultOggSeeker.access$200(DefaultOggSeeker)>
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field DefaultOggSeeker this$0>
	//    5   11:invokestatic    #32  <Method long DefaultOggSeeker.access$400(DefaultOggSeeker)>
	//    6   14:invokevirtual   #38  <Method long StreamReader.convertGranuleToTime(long)>
	//    7   17:lreturn         
	}

	public com.google.android.exoplayer2.extractor.SeekMap.SeekPoints getSeekPoints(long l)
	{
		if(l == 0L)
	//*   0    0:lload_1         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifne            29
		{
			return new com.google.android.exoplayer2.extractor.SeekMap.SeekPoints(new SeekPoint(0L, DefaultOggSeeker.access$100(DefaultOggSeeker.this)));
	//    4    6:new             #42  <Class com.google.android.exoplayer2.extractor.SeekMap$SeekPoints>
	//    5    9:dup             
	//    6   10:new             #44  <Class SeekPoint>
	//    7   13:dup             
	//    8   14:lconst_0        
	//    9   15:aload_0         
	//   10   16:getfield        #15  <Field DefaultOggSeeker this$0>
	//   11   19:invokestatic    #47  <Method long DefaultOggSeeker.access$100(DefaultOggSeeker)>
	//   12   22:invokespecial   #50  <Method void SeekPoint(long, long)>
	//   13   25:invokespecial   #53  <Method void com.google.android.exoplayer2.extractor.SeekMap$SeekPoints(SeekPoint)>
	//   14   28:areturn         
		} else
		{
			long l1 = DefaultOggSeeker.access$200(DefaultOggSeeker.this).convertTimeToGranule(l);
	//   15   29:aload_0         
	//   16   30:getfield        #15  <Field DefaultOggSeeker this$0>
	//   17   33:invokestatic    #28  <Method StreamReader DefaultOggSeeker.access$200(DefaultOggSeeker)>
	//   18   36:lload_1         
	//   19   37:invokevirtual   #56  <Method long StreamReader.convertTimeToGranule(long)>
	//   20   40:lstore_3        
			return new com.google.android.exoplayer2.extractor.SeekMap.SeekPoints(new SeekPoint(l, DefaultOggSeeker.access$300(DefaultOggSeeker.this, DefaultOggSeeker.access$100(DefaultOggSeeker.this), l1, 30000L)));
	//   21   41:new             #42  <Class com.google.android.exoplayer2.extractor.SeekMap$SeekPoints>
	//   22   44:dup             
	//   23   45:new             #44  <Class SeekPoint>
	//   24   48:dup             
	//   25   49:lload_1         
	//   26   50:aload_0         
	//   27   51:getfield        #15  <Field DefaultOggSeeker this$0>
	//   28   54:aload_0         
	//   29   55:getfield        #15  <Field DefaultOggSeeker this$0>
	//   30   58:invokestatic    #47  <Method long DefaultOggSeeker.access$100(DefaultOggSeeker)>
	//   31   61:lload_3         
	//   32   62:ldc2w           #57  <Long 30000L>
	//   33   65:invokestatic    #62  <Method long DefaultOggSeeker.access$300(DefaultOggSeeker, long, long, long)>
	//   34   68:invokespecial   #50  <Method void SeekPoint(long, long)>
	//   35   71:invokespecial   #53  <Method void com.google.android.exoplayer2.extractor.SeekMap$SeekPoints(SeekPoint)>
	//   36   74:areturn         
		}
	}

	public boolean isSeekable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	final DefaultOggSeeker this$0;

	private DefaultOggSeeker$OggSeekMap()
	{
		this$0 = DefaultOggSeeker.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field DefaultOggSeeker this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	DefaultOggSeeker$OggSeekMap(DefaultOggSeeker._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void DefaultOggSeeker$OggSeekMap(DefaultOggSeeker)>
	//    3    5:return          
	}
}
