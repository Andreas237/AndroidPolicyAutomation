// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor;


// Referenced classes of package com.google.android.exoplayer2.extractor:
//			SeekMap, SeekPoint

public static final class SeekMap$Unseekable
	implements SeekMap
{

	public long getDurationUs()
	{
		return durationUs;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field long durationUs>
	//    2    4:lreturn         
	}

	public SeekMap$SeekPoints getSeekPoints(long l)
	{
		return startSeekPoints;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field SeekMap$SeekPoints startSeekPoints>
	//    2    4:areturn         
	}

	public boolean isSeekable()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private final long durationUs;
	private final SeekMap$SeekPoints startSeekPoints;

	public SeekMap$Unseekable(long l)
	{
		this(l, 0L);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:lconst_0        
	//    3    3:invokespecial   #16  <Method void SeekMap$Unseekable(long, long)>
	//    4    6:return          
	}

	public SeekMap$Unseekable(long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		durationUs = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #22  <Field long durationUs>
		SeekPoint seekpoint;
		if(l1 == 0L)
	//*   5    9:lload_3         
	//*   6   10:lconst_0        
	//*   7   11:lcmp            
	//*   8   12:ifne            23
			seekpoint = SeekPoint.START;
	//    9   15:getstatic       #28  <Field SeekPoint SeekPoint.START>
	//   10   18:astore          5
		else
	//*  11   20:goto            34
			seekpoint = new SeekPoint(0L, l1);
	//   12   23:new             #24  <Class SeekPoint>
	//   13   26:dup             
	//   14   27:lconst_0        
	//   15   28:lload_3         
	//   16   29:invokespecial   #29  <Method void SeekPoint(long, long)>
	//   17   32:astore          5
		startSeekPoints = new SeekMap$SeekPoints(seekpoint);
	//   18   34:aload_0         
	//   19   35:new             #31  <Class SeekMap$SeekPoints>
	//   20   38:dup             
	//   21   39:aload           5
	//   22   41:invokespecial   #34  <Method void SeekMap$SeekPoints(SeekPoint)>
	//   23   44:putfield        #36  <Field SeekMap$SeekPoints startSeekPoints>
	//   24   47:return          
	}
}
