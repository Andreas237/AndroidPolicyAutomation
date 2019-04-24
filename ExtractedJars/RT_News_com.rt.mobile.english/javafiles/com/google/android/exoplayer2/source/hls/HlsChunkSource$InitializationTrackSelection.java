// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls;

import android.os.SystemClock;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.trackselection.BaseTrackSelection;

// Referenced classes of package com.google.android.exoplayer2.source.hls:
//			HlsChunkSource

private static final class HlsChunkSource$InitializationTrackSelection extends BaseTrackSelection
{

	public int getSelectedIndex()
	{
		return selectedIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int selectedIndex>
	//    2    4:ireturn         
	}

	public Object getSelectionData()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int getSelectionReason()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void updateSelectedTrack(long l, long l1, long l2)
	{
		l = SystemClock.elapsedRealtime();
	//    0    0:invokestatic    #39  <Method long SystemClock.elapsedRealtime()>
	//    1    3:lstore_1        
		if(!isBlacklisted(selectedIndex, l))
	//*   2    4:aload_0         
	//*   3    5:aload_0         
	//*   4    6:getfield        #25  <Field int selectedIndex>
	//*   5    9:lload_1         
	//*   6   10:invokevirtual   #43  <Method boolean isBlacklisted(int, long)>
	//*   7   13:ifne            17
			return;
	//    8   16:return          
		for(int i = length - 1; i >= 0; i--)
	//*   9   17:aload_0         
	//*  10   18:getfield        #46  <Field int length>
	//*  11   21:iconst_1        
	//*  12   22:isub            
	//*  13   23:istore          7
	//*  14   25:iload           7
	//*  15   27:iflt            56
			if(!isBlacklisted(i, l))
	//*  16   30:aload_0         
	//*  17   31:iload           7
	//*  18   33:lload_1         
	//*  19   34:invokevirtual   #43  <Method boolean isBlacklisted(int, long)>
	//*  20   37:ifne            47
			{
				selectedIndex = i;
	//   21   40:aload_0         
	//   22   41:iload           7
	//   23   43:putfield        #25  <Field int selectedIndex>
				return;
	//   24   46:return          
			}

	//   25   47:iload           7
	//   26   49:iconst_1        
	//   27   50:isub            
	//   28   51:istore          7
	//*  29   53:goto            25
		throw new IllegalStateException();
	//   30   56:new             #48  <Class IllegalStateException>
	//   31   59:dup             
	//   32   60:invokespecial   #51  <Method void IllegalStateException()>
	//   33   63:athrow          
	}

	private int selectedIndex;

	public HlsChunkSource$InitializationTrackSelection(TrackGroup trackgroup, int ai[])
	{
		super(trackgroup, ai);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #13  <Method void BaseTrackSelection(TrackGroup, int[])>
		selectedIndex = indexOf(trackgroup.getFormat(0));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:iconst_0        
	//    8   10:invokevirtual   #19  <Method com.google.android.exoplayer2.Format TrackGroup.getFormat(int)>
	//    9   13:invokevirtual   #23  <Method int indexOf(com.google.android.exoplayer2.Format)>
	//   10   16:putfield        #25  <Field int selectedIndex>
	//   11   19:return          
	}
}
