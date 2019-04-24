// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.trackselection;

import android.os.SystemClock;
import com.google.android.exoplayer2.source.TrackGroup;
import java.util.Random;

// Referenced classes of package com.google.android.exoplayer2.trackselection:
//			BaseTrackSelection, TrackSelection

public final class RandomTrackSelection extends BaseTrackSelection
{
	public static final class Factory
		implements TrackSelection.Factory
	{

		public transient RandomTrackSelection createTrackSelection(TrackGroup trackgroup, int ai[])
		{
			return new RandomTrackSelection(trackgroup, ai, random);
		//    0    0:new             #8   <Class RandomTrackSelection>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aload_0         
		//    5    7:getfield        #20  <Field Random random>
		//    6   10:invokespecial   #30  <Method void RandomTrackSelection(TrackGroup, int[], Random)>
		//    7   13:areturn         
		}

		public volatile TrackSelection createTrackSelection(TrackGroup trackgroup, int ai[])
		{
			return ((TrackSelection) (createTrackSelection(trackgroup, ai)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #33  <Method RandomTrackSelection createTrackSelection(TrackGroup, int[])>
		//    4    6:areturn         
		}

		private final Random random;

		public Factory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			random = new Random();
		//    2    4:aload_0         
		//    3    5:new             #17  <Class Random>
		//    4    8:dup             
		//    5    9:invokespecial   #18  <Method void Random()>
		//    6   12:putfield        #20  <Field Random random>
		//    7   15:return          
		}

		public Factory(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			random = new Random(i);
		//    2    4:aload_0         
		//    3    5:new             #17  <Class Random>
		//    4    8:dup             
		//    5    9:iload_1         
		//    6   10:i2l             
		//    7   11:invokespecial   #25  <Method void Random(long)>
		//    8   14:putfield        #20  <Field Random random>
		//    9   17:return          
		}
	}


	public transient RandomTrackSelection(TrackGroup trackgroup, int ai[])
	{
		super(trackgroup, ai);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #15  <Method void BaseTrackSelection(TrackGroup, int[])>
		random = new Random();
	//    4    6:aload_0         
	//    5    7:new             #17  <Class Random>
	//    6   10:dup             
	//    7   11:invokespecial   #20  <Method void Random()>
	//    8   14:putfield        #22  <Field Random random>
		selectedIndex = random.nextInt(length);
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #22  <Field Random random>
	//   12   22:aload_0         
	//   13   23:getfield        #25  <Field int length>
	//   14   26:invokevirtual   #29  <Method int Random.nextInt(int)>
	//   15   29:putfield        #31  <Field int selectedIndex>
	//   16   32:return          
	}

	public RandomTrackSelection(TrackGroup trackgroup, int ai[], long l)
	{
		this(trackgroup, ai, new Random(l));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #17  <Class Random>
	//    4    6:dup             
	//    5    7:lload_3         
	//    6    8:invokespecial   #36  <Method void Random(long)>
	//    7   11:invokespecial   #39  <Method void RandomTrackSelection(TrackGroup, int[], Random)>
	//    8   14:return          
	}

	public RandomTrackSelection(TrackGroup trackgroup, int ai[], Random random1)
	{
		super(trackgroup, ai);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #15  <Method void BaseTrackSelection(TrackGroup, int[])>
		random = random1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #22  <Field Random random>
		selectedIndex = random1.nextInt(length);
	//    7   11:aload_0         
	//    8   12:aload_3         
	//    9   13:aload_0         
	//   10   14:getfield        #25  <Field int length>
	//   11   17:invokevirtual   #29  <Method int Random.nextInt(int)>
	//   12   20:putfield        #31  <Field int selectedIndex>
	//   13   23:return          
	}

	public int getSelectedIndex()
	{
		return selectedIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int selectedIndex>
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
		return 3;
	//    0    0:iconst_3        
	//    1    1:ireturn         
	}

	public void updateSelectedTrack(long l, long l1, long l2)
	{
		l = SystemClock.elapsedRealtime();
	//    0    0:invokestatic    #54  <Method long SystemClock.elapsedRealtime()>
	//    1    3:lstore_1        
		boolean flag = false;
	//    2    4:iconst_0        
	//    3    5:istore          10
		int i = 0;
	//    4    7:iconst_0        
	//    5    8:istore          7
		int k;
		int j1;
		for(k = i; i < length; k = j1)
	//*   6   10:iload           7
	//*   7   12:istore          8
	//*   8   14:iload           7
	//*   9   16:aload_0         
	//*  10   17:getfield        #25  <Field int length>
	//*  11   20:icmpge          56
		{
			j1 = k;
	//   12   23:iload           8
	//   13   25:istore          9
			if(!isBlacklisted(i, l))
	//*  14   27:aload_0         
	//*  15   28:iload           7
	//*  16   30:lload_1         
	//*  17   31:invokevirtual   #58  <Method boolean isBlacklisted(int, long)>
	//*  18   34:ifne            43
				j1 = k + 1;
	//   19   37:iload           8
	//   20   39:iconst_1        
	//   21   40:iadd            
	//   22   41:istore          9
			i++;
	//   23   43:iload           7
	//   24   45:iconst_1        
	//   25   46:iadd            
	//   26   47:istore          7
		}

	//   27   49:iload           9
	//   28   51:istore          8
	//*  29   53:goto            14
		selectedIndex = random.nextInt(k);
	//   30   56:aload_0         
	//   31   57:aload_0         
	//   32   58:getfield        #22  <Field Random random>
	//   33   61:iload           8
	//   34   63:invokevirtual   #29  <Method int Random.nextInt(int)>
	//   35   66:putfield        #31  <Field int selectedIndex>
		if(k != length)
	//*  36   69:iload           8
	//*  37   71:aload_0         
	//*  38   72:getfield        #25  <Field int length>
	//*  39   75:icmpeq          143
		{
			int i1 = 0;
	//   40   78:iconst_0        
	//   41   79:istore          8
			for(int j = ((int) (flag)); j < length;)
	//*  42   81:iload           10
	//*  43   83:istore          7
	//*  44   85:iload           7
	//*  45   87:aload_0         
	//*  46   88:getfield        #25  <Field int length>
	//*  47   91:icmpge          143
			{
				int k1 = i1;
	//   48   94:iload           8
	//   49   96:istore          9
				if(!isBlacklisted(j, l))
	//*  50   98:aload_0         
	//*  51   99:iload           7
	//*  52  101:lload_1         
	//*  53  102:invokevirtual   #58  <Method boolean isBlacklisted(int, long)>
	//*  54  105:ifne            130
				{
					if(selectedIndex == i1)
	//*  55  108:aload_0         
	//*  56  109:getfield        #31  <Field int selectedIndex>
	//*  57  112:iload           8
	//*  58  114:icmpne          124
					{
						selectedIndex = j;
	//   59  117:aload_0         
	//   60  118:iload           7
	//   61  120:putfield        #31  <Field int selectedIndex>
						return;
	//   62  123:return          
					}
					k1 = i1 + 1;
	//   63  124:iload           8
	//   64  126:iconst_1        
	//   65  127:iadd            
	//   66  128:istore          9
				}
				j++;
	//   67  130:iload           7
	//   68  132:iconst_1        
	//   69  133:iadd            
	//   70  134:istore          7
				i1 = k1;
	//   71  136:iload           9
	//   72  138:istore          8
			}

		}
	//*  73  140:goto            85
	//   74  143:return          
	}

	private final Random random;
	private int selectedIndex;
}
