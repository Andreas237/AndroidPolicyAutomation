// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.decoder.OutputBuffer;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.text:
//			Subtitle

public abstract class SubtitleOutputBuffer extends OutputBuffer
	implements Subtitle
{

	public SubtitleOutputBuffer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void OutputBuffer()>
	//    2    4:return          
	}

	public void clear()
	{
		super.clear();
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void OutputBuffer.clear()>
		subtitle = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #20  <Field Subtitle subtitle>
	//    5    9:return          
	}

	public List getCues(long l)
	{
		return subtitle.getCues(l - subsampleOffsetUs);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Subtitle subtitle>
	//    2    4:lload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field long subsampleOffsetUs>
	//    5    9:lsub            
	//    6   10:invokeinterface #26  <Method List Subtitle.getCues(long)>
	//    7   15:areturn         
	}

	public long getEventTime(int i)
	{
		return subtitle.getEventTime(i) + subsampleOffsetUs;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Subtitle subtitle>
	//    2    4:iload_1         
	//    3    5:invokeinterface #32  <Method long Subtitle.getEventTime(int)>
	//    4   10:aload_0         
	//    5   11:getfield        #24  <Field long subsampleOffsetUs>
	//    6   14:ladd            
	//    7   15:lreturn         
	}

	public int getEventTimeCount()
	{
		return subtitle.getEventTimeCount();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Subtitle subtitle>
	//    2    4:invokeinterface #36  <Method int Subtitle.getEventTimeCount()>
	//    3    9:ireturn         
	}

	public int getNextEventTimeIndex(long l)
	{
		return subtitle.getNextEventTimeIndex(l - subsampleOffsetUs);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Subtitle subtitle>
	//    2    4:lload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field long subsampleOffsetUs>
	//    5    9:lsub            
	//    6   10:invokeinterface #40  <Method int Subtitle.getNextEventTimeIndex(long)>
	//    7   15:ireturn         
	}

	public abstract void release();

	public void setContent(long l, Subtitle subtitle1, long l1)
	{
		timeUs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #46  <Field long timeUs>
		subtitle = subtitle1;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #20  <Field Subtitle subtitle>
		l = l1;
	//    6   10:lload           4
	//    7   12:lstore_1        
		if(l1 == 0xffffffffL)
	//*   8   13:lload           4
	//*   9   15:ldc2w           #47  <Long 0xffffffffL>
	//*  10   18:lcmp            
	//*  11   19:ifne            27
			l = timeUs;
	//   12   22:aload_0         
	//   13   23:getfield        #46  <Field long timeUs>
	//   14   26:lstore_1        
		subsampleOffsetUs = l;
	//   15   27:aload_0         
	//   16   28:lload_1         
	//   17   29:putfield        #24  <Field long subsampleOffsetUs>
	//   18   32:return          
	}

	private long subsampleOffsetUs;
	private Subtitle subtitle;
}
