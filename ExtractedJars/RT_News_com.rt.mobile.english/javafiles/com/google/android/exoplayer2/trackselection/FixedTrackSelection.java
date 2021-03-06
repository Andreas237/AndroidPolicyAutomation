// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.util.Assertions;

// Referenced classes of package com.google.android.exoplayer2.trackselection:
//			BaseTrackSelection, TrackSelection

public final class FixedTrackSelection extends BaseTrackSelection
{
	public static final class Factory
		implements TrackSelection.Factory
	{

		public transient FixedTrackSelection createTrackSelection(TrackGroup trackgroup, int ai[])
		{
			boolean flag = true;
		//    0    0:iconst_1        
		//    1    1:istore_3        
			if(ai.length != 1)
		//*   2    2:aload_2         
		//*   3    3:arraylength     
		//*   4    4:iconst_1        
		//*   5    5:icmpne          11
		//*   6    8:goto            13
				flag = false;
		//    7   11:iconst_0        
		//    8   12:istore_3        
			Assertions.checkArgument(flag);
		//    9   13:iload_3         
		//   10   14:invokestatic    #33  <Method void Assertions.checkArgument(boolean)>
			return new FixedTrackSelection(trackgroup, ai[0], reason, data);
		//   11   17:new             #8   <Class FixedTrackSelection>
		//   12   20:dup             
		//   13   21:aload_1         
		//   14   22:aload_2         
		//   15   23:iconst_0        
		//   16   24:iaload          
		//   17   25:aload_0         
		//   18   26:getfield        #20  <Field int reason>
		//   19   29:aload_0         
		//   20   30:getfield        #22  <Field Object data>
		//   21   33:invokespecial   #36  <Method void FixedTrackSelection(TrackGroup, int, int, Object)>
		//   22   36:areturn         
		}

		public volatile TrackSelection createTrackSelection(TrackGroup trackgroup, int ai[])
		{
			return ((TrackSelection) (createTrackSelection(trackgroup, ai)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #39  <Method FixedTrackSelection createTrackSelection(TrackGroup, int[])>
		//    4    6:areturn         
		}

		private final Object data;
		private final int reason;

		public Factory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			reason = 0;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #20  <Field int reason>
			data = null;
		//    5    9:aload_0         
		//    6   10:aconst_null     
		//    7   11:putfield        #22  <Field Object data>
		//    8   14:return          
		}

		public Factory(int i, Object obj)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			reason = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #20  <Field int reason>
			data = obj;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field Object data>
		//    8   14:return          
		}
	}


	public FixedTrackSelection(TrackGroup trackgroup, int i)
	{
		this(trackgroup, i, 0, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:aconst_null     
	//    5    5:invokespecial   #17  <Method void FixedTrackSelection(TrackGroup, int, int, Object)>
	//    6    8:return          
	}

	public FixedTrackSelection(TrackGroup trackgroup, int i, int j, Object obj)
	{
		super(trackgroup, new int[] {
			i
		});
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:newarray        int[]
	//    4    5:dup             
	//    5    6:iconst_0        
	//    6    7:iload_2         
	//    7    8:iastore         
	//    8    9:invokespecial   #21  <Method void BaseTrackSelection(TrackGroup, int[])>
		reason = j;
	//    9   12:aload_0         
	//   10   13:iload_3         
	//   11   14:putfield        #23  <Field int reason>
		data = obj;
	//   12   17:aload_0         
	//   13   18:aload           4
	//   14   20:putfield        #25  <Field Object data>
	//   15   23:return          
	}

	public int getSelectedIndex()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Object getSelectionData()
	{
		return data;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Object data>
	//    2    4:areturn         
	}

	public int getSelectionReason()
	{
		return reason;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int reason>
	//    2    4:ireturn         
	}

	public void updateSelectedTrack(long l, long l1, long l2)
	{
	//    0    0:return          
	}

	private final Object data;
	private final int reason;
}
