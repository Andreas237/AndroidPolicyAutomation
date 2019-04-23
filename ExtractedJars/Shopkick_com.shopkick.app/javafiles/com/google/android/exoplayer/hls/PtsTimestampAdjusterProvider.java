// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.hls;

import android.util.SparseArray;
import com.google.android.exoplayer.extractor.ts.PtsTimestampAdjuster;

public final class PtsTimestampAdjusterProvider
{

	public PtsTimestampAdjusterProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #13  <Class SparseArray>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void SparseArray()>
	//    6   12:putfield        #16  <Field SparseArray ptsTimestampAdjusters>
	//    7   15:return          
	}

	public PtsTimestampAdjuster getAdjuster(boolean flag, int i, long l)
	{
		PtsTimestampAdjuster ptstimestampadjuster1 = (PtsTimestampAdjuster)ptsTimestampAdjusters.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SparseArray ptsTimestampAdjusters>
	//    2    4:iload_2         
	//    3    5:invokevirtual   #23  <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #25  <Class PtsTimestampAdjuster>
	//    5   11:astore          6
		PtsTimestampAdjuster ptstimestampadjuster = ptstimestampadjuster1;
	//    6   13:aload           6
	//    7   15:astore          5
		if(flag)
	//*   8   17:iload_1         
	//*   9   18:ifeq            50
		{
			ptstimestampadjuster = ptstimestampadjuster1;
	//   10   21:aload           6
	//   11   23:astore          5
			if(ptstimestampadjuster1 == null)
	//*  12   25:aload           6
	//*  13   27:ifnonnull       50
			{
				ptstimestampadjuster = new PtsTimestampAdjuster(l);
	//   14   30:new             #25  <Class PtsTimestampAdjuster>
	//   15   33:dup             
	//   16   34:lload_3         
	//   17   35:invokespecial   #28  <Method void PtsTimestampAdjuster(long)>
	//   18   38:astore          5
				ptsTimestampAdjusters.put(i, ((Object) (ptstimestampadjuster)));
	//   19   40:aload_0         
	//   20   41:getfield        #16  <Field SparseArray ptsTimestampAdjusters>
	//   21   44:iload_2         
	//   22   45:aload           5
	//   23   47:invokevirtual   #32  <Method void SparseArray.put(int, Object)>
			}
		}
		ptstimestampadjuster1 = ptstimestampadjuster;
	//   24   50:aload           5
	//   25   52:astore          6
		if(!flag)
	//*  26   54:iload_1         
	//*  27   55:ifne            77
		{
			if(ptstimestampadjuster != null && ptstimestampadjuster.isInitialized())
	//*  28   58:aload           5
	//*  29   60:ifnull          74
	//*  30   63:aload           5
	//*  31   65:invokevirtual   #36  <Method boolean PtsTimestampAdjuster.isInitialized()>
	//*  32   68:ifeq            74
				return ptstimestampadjuster;
	//   33   71:aload           5
	//   34   73:areturn         
			ptstimestampadjuster1 = null;
	//   35   74:aconst_null     
	//   36   75:astore          6
		}
		return ptstimestampadjuster1;
	//   37   77:aload           6
	//   38   79:areturn         
	}

	public void reset()
	{
		ptsTimestampAdjusters.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SparseArray ptsTimestampAdjusters>
	//    2    4:invokevirtual   #40  <Method void SparseArray.clear()>
	//    3    7:return          
	}

	private final SparseArray ptsTimestampAdjusters = new SparseArray();
}
