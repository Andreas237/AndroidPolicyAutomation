// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.text.eia608;


// Referenced classes of package com.google.android.exoplayer.text.eia608:
//			ClosedCaption

final class ClosedCaptionList
	implements Comparable
{

	public ClosedCaptionList(long l, boolean flag, ClosedCaption aclosedcaption[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		timeUs = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #20  <Field long timeUs>
		decodeOnly = flag;
	//    5    9:aload_0         
	//    6   10:iload_3         
	//    7   11:putfield        #22  <Field boolean decodeOnly>
		captions = aclosedcaption;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #24  <Field ClosedCaption[] captions>
	//   11   20:return          
	}

	public int compareTo(ClosedCaptionList closedcaptionlist)
	{
		int i = timeUs - closedcaptionlist.timeUs != 0L;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field long timeUs>
	//    2    4:aload_1         
	//    3    5:getfield        #20  <Field long timeUs>
	//    4    8:lsub            
	//    5    9:lconst_0        
	//    6   10:lcmp            
	//    7   11:istore_2        
		if(i == 0)
	//*   8   12:iload_2         
	//*   9   13:ifne            18
			return 0;
	//   10   16:iconst_0        
	//   11   17:ireturn         
		return i <= 0 ? -1 : 1;
	//   12   18:iload_2         
	//   13   19:ifle            24
	//   14   22:iconst_1        
	//   15   23:ireturn         
	//   16   24:iconst_m1       
	//   17   25:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((ClosedCaptionList)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class ClosedCaptionList>
	//    3    5:invokevirtual   #30  <Method int compareTo(ClosedCaptionList)>
	//    4    8:ireturn         
	}

	public final ClosedCaption captions[];
	public final boolean decodeOnly;
	public final long timeUs;
}
