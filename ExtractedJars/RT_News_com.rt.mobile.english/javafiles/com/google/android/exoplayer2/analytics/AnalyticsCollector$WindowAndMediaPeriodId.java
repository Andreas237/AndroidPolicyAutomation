// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.analytics;


// Referenced classes of package com.google.android.exoplayer2.analytics:
//			AnalyticsCollector

private static final class AnalyticsCollector$WindowAndMediaPeriodId
{

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          58
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #28  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #28  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((AnalyticsCollector$WindowAndMediaPeriodId)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class AnalyticsCollector$WindowAndMediaPeriodId>
	//   16   28:astore_1        
			return windowIndex == ((AnalyticsCollector$WindowAndMediaPeriodId) (obj)).windowIndex && mediaPeriodId.equals(((Object) (((AnalyticsCollector$WindowAndMediaPeriodId) (obj)).mediaPeriodId)));
	//   17   29:aload_0         
	//   18   30:getfield        #18  <Field int windowIndex>
	//   19   33:aload_1         
	//   20   34:getfield        #18  <Field int windowIndex>
	//   21   37:icmpne          56
	//   22   40:aload_0         
	//   23   41:getfield        #20  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId mediaPeriodId>
	//   24   44:aload_1         
	//   25   45:getfield        #20  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId mediaPeriodId>
	//   26   48:invokevirtual   #32  <Method boolean com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.equals(Object)>
	//   27   51:ifeq            56
	//   28   54:iconst_1        
	//   29   55:ireturn         
	//   30   56:iconst_0        
	//   31   57:ireturn         
		} else
		{
			return false;
	//   32   58:iconst_0        
	//   33   59:ireturn         
		}
	}

	public int hashCode()
	{
		return 31 * windowIndex + mediaPeriodId.hashCode();
	//    0    0:bipush          31
	//    1    2:aload_0         
	//    2    3:getfield        #18  <Field int windowIndex>
	//    3    6:imul            
	//    4    7:aload_0         
	//    5    8:getfield        #20  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId mediaPeriodId>
	//    6   11:invokevirtual   #37  <Method int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.hashCode()>
	//    7   14:iadd            
	//    8   15:ireturn         
	}

	public final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId;
	public final int windowIndex;

	public AnalyticsCollector$WindowAndMediaPeriodId(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		windowIndex = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #18  <Field int windowIndex>
		mediaPeriodId = mediaperiodid;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId mediaPeriodId>
	//    8   14:return          
	}
}
