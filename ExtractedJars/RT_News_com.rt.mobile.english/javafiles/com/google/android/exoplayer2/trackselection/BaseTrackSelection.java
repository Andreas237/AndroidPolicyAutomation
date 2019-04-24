// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.trackselection;

import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.util.Assertions;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.trackselection:
//			TrackSelection

public abstract class BaseTrackSelection
	implements TrackSelection
{
	private static final class DecreasingBandwidthComparator
		implements Comparator
	{

		public int compare(Format format, Format format1)
		{
			return format1.bitrate - format.bitrate;
		//    0    0:aload_2         
		//    1    1:getfield        #25  <Field int Format.bitrate>
		//    2    4:aload_1         
		//    3    5:getfield        #25  <Field int Format.bitrate>
		//    4    8:isub            
		//    5    9:ireturn         
		}

		public volatile int compare(Object obj, Object obj1)
		{
			return compare((Format)obj, (Format)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #21  <Class Format>
		//    3    5:aload_2         
		//    4    6:checkcast       #21  <Class Format>
		//    5    9:invokevirtual   #28  <Method int compare(Format, Format)>
		//    6   12:ireturn         
		}

		private DecreasingBandwidthComparator()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}

	}


	public transient BaseTrackSelection(TrackGroup trackgroup, int ai[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		boolean flag = false;
	//    2    4:iconst_0        
	//    3    5:istore          4
		boolean flag1;
		if(ai.length > 0)
	//*   4    7:aload_2         
	//*   5    8:arraylength     
	//*   6    9:ifle            18
			flag1 = true;
	//    7   12:iconst_1        
	//    8   13:istore          5
		else
	//*   9   15:goto            21
			flag1 = false;
	//   10   18:iconst_0        
	//   11   19:istore          5
		Assertions.checkState(flag1);
	//   12   21:iload           5
	//   13   23:invokestatic    #33  <Method void Assertions.checkState(boolean)>
		group = (TrackGroup)Assertions.checkNotNull(((Object) (trackgroup)));
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokestatic    #37  <Method Object Assertions.checkNotNull(Object)>
	//   17   31:checkcast       #39  <Class TrackGroup>
	//   18   34:putfield        #41  <Field TrackGroup group>
		length = ai.length;
	//   19   37:aload_0         
	//   20   38:aload_2         
	//   21   39:arraylength     
	//   22   40:putfield        #43  <Field int length>
		formats = new Format[length];
	//   23   43:aload_0         
	//   24   44:aload_0         
	//   25   45:getfield        #43  <Field int length>
	//   26   48:anewarray       Format[]
	//   27   51:putfield        #47  <Field Format[] formats>
		for(int i = 0; i < ai.length; i++)
	//*  28   54:iconst_0        
	//*  29   55:istore_3        
	//*  30   56:iload_3         
	//*  31   57:aload_2         
	//*  32   58:arraylength     
	//*  33   59:icmpge          82
			formats[i] = trackgroup.getFormat(ai[i]);
	//   34   62:aload_0         
	//   35   63:getfield        #47  <Field Format[] formats>
	//   36   66:iload_3         
	//   37   67:aload_1         
	//   38   68:aload_2         
	//   39   69:iload_3         
	//   40   70:iaload          
	//   41   71:invokevirtual   #51  <Method Format TrackGroup.getFormat(int)>
	//   42   74:aastore         

	//   43   75:iload_3         
	//   44   76:iconst_1        
	//   45   77:iadd            
	//   46   78:istore_3        
	//*  47   79:goto            56
		Arrays.sort(((Object []) (formats)), ((Comparator) (new DecreasingBandwidthComparator())));
	//   48   82:aload_0         
	//   49   83:getfield        #47  <Field Format[] formats>
	//   50   86:new             #10  <Class BaseTrackSelection$DecreasingBandwidthComparator>
	//   51   89:dup             
	//   52   90:aconst_null     
	//   53   91:invokespecial   #54  <Method void BaseTrackSelection$DecreasingBandwidthComparator(BaseTrackSelection$1)>
	//   54   94:invokestatic    #60  <Method void Arrays.sort(Object[], Comparator)>
		tracks = new int[length];
	//   55   97:aload_0         
	//   56   98:aload_0         
	//   57   99:getfield        #43  <Field int length>
	//   58  102:newarray        int[]
	//   59  104:putfield        #62  <Field int[] tracks>
		for(int j = ((int) (flag)); j < length; j++)
	//*  60  107:iload           4
	//*  61  109:istore_3        
	//*  62  110:iload_3         
	//*  63  111:aload_0         
	//*  64  112:getfield        #43  <Field int length>
	//*  65  115:icmpge          141
			tracks[j] = trackgroup.indexOf(formats[j]);
	//   66  118:aload_0         
	//   67  119:getfield        #62  <Field int[] tracks>
	//   68  122:iload_3         
	//   69  123:aload_1         
	//   70  124:aload_0         
	//   71  125:getfield        #47  <Field Format[] formats>
	//   72  128:iload_3         
	//   73  129:aaload          
	//   74  130:invokevirtual   #66  <Method int TrackGroup.indexOf(Format)>
	//   75  133:iastore         

	//   76  134:iload_3         
	//   77  135:iconst_1        
	//   78  136:iadd            
	//   79  137:istore_3        
	//*  80  138:goto            110
		blacklistUntilTimes = new long[length];
	//   81  141:aload_0         
	//   82  142:aload_0         
	//   83  143:getfield        #43  <Field int length>
	//   84  146:newarray        long[]
	//   85  148:putfield        #68  <Field long[] blacklistUntilTimes>
	//   86  151:return          
	}

	public final boolean blacklist(int i, long l)
	{
		long l1 = SystemClock.elapsedRealtime();
	//    0    0:invokestatic    #77  <Method long SystemClock.elapsedRealtime()>
	//    1    3:lstore          5
		boolean flag = isBlacklisted(i, l1);
	//    2    5:aload_0         
	//    3    6:iload_1         
	//    4    7:lload           5
	//    5    9:invokevirtual   #80  <Method boolean isBlacklisted(int, long)>
	//    6   12:istore          7
		for(int j = 0; j < length && !flag; j++)
	//*   7   14:iconst_0        
	//*   8   15:istore          4
	//*   9   17:iload           4
	//*  10   19:aload_0         
	//*  11   20:getfield        #43  <Field int length>
	//*  12   23:icmpge          66
	//*  13   26:iload           7
	//*  14   28:ifne            66
			if(j != i && !isBlacklisted(j, l1))
	//*  15   31:iload           4
	//*  16   33:iload_1         
	//*  17   34:icmpeq          54
	//*  18   37:aload_0         
	//*  19   38:iload           4
	//*  20   40:lload           5
	//*  21   42:invokevirtual   #80  <Method boolean isBlacklisted(int, long)>
	//*  22   45:ifne            54
				flag = true;
	//   23   48:iconst_1        
	//   24   49:istore          7
			else
	//*  25   51:goto            57
				flag = false;
	//   26   54:iconst_0        
	//   27   55:istore          7

	//   28   57:iload           4
	//   29   59:iconst_1        
	//   30   60:iadd            
	//   31   61:istore          4
	//*  32   63:goto            17
		if(!flag)
	//*  33   66:iload           7
	//*  34   68:ifne            73
		{
			return false;
	//   35   71:iconst_0        
	//   36   72:ireturn         
		} else
		{
			blacklistUntilTimes[i] = Math.max(blacklistUntilTimes[i], l1 + l);
	//   37   73:aload_0         
	//   38   74:getfield        #68  <Field long[] blacklistUntilTimes>
	//   39   77:iload_1         
	//   40   78:aload_0         
	//   41   79:getfield        #68  <Field long[] blacklistUntilTimes>
	//   42   82:iload_1         
	//   43   83:laload          
	//   44   84:lload           5
	//   45   86:lload_2         
	//   46   87:ladd            
	//   47   88:invokestatic    #86  <Method long Math.max(long, long)>
	//   48   91:lastore         
			return true;
	//   49   92:iconst_1        
	//   50   93:ireturn         
		}
	}

	public void disable()
	{
	//    0    0:return          
	}

	public void enable()
	{
	//    0    0:return          
	}

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
	//*   8   12:invokevirtual   #95  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #95  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((BaseTrackSelection)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class BaseTrackSelection>
	//   16   28:astore_1        
			return group == ((BaseTrackSelection) (obj)).group && Arrays.equals(tracks, ((BaseTrackSelection) (obj)).tracks);
	//   17   29:aload_0         
	//   18   30:getfield        #41  <Field TrackGroup group>
	//   19   33:aload_1         
	//   20   34:getfield        #41  <Field TrackGroup group>
	//   21   37:if_acmpne       56
	//   22   40:aload_0         
	//   23   41:getfield        #62  <Field int[] tracks>
	//   24   44:aload_1         
	//   25   45:getfield        #62  <Field int[] tracks>
	//   26   48:invokestatic    #98  <Method boolean Arrays.equals(int[], int[])>
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

	public int evaluateQueueSize(long l, List list)
	{
		return list.size();
	//    0    0:aload_3         
	//    1    1:invokeinterface #107 <Method int List.size()>
	//    2    6:ireturn         
	}

	public final Format getFormat(int i)
	{
		return formats[i];
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Format[] formats>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:areturn         
	}

	public final int getIndexInTrackGroup(int i)
	{
		return tracks[i];
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int[] tracks>
	//    2    4:iload_1         
	//    3    5:iaload          
	//    4    6:ireturn         
	}

	public final Format getSelectedFormat()
	{
		return formats[getSelectedIndex()];
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Format[] formats>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #116 <Method int getSelectedIndex()>
	//    4    8:aaload          
	//    5    9:areturn         
	}

	public final int getSelectedIndexInTrackGroup()
	{
		return tracks[getSelectedIndex()];
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int[] tracks>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #116 <Method int getSelectedIndex()>
	//    4    8:iaload          
	//    5    9:ireturn         
	}

	public final TrackGroup getTrackGroup()
	{
		return group;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field TrackGroup group>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		if(hashCode == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field int hashCode>
	//*   2    4:ifne            29
			hashCode = 31 * System.identityHashCode(((Object) (group))) + Arrays.hashCode(tracks);
	//    3    7:aload_0         
	//    4    8:bipush          31
	//    5   10:aload_0         
	//    6   11:getfield        #41  <Field TrackGroup group>
	//    7   14:invokestatic    #127 <Method int System.identityHashCode(Object)>
	//    8   17:imul            
	//    9   18:aload_0         
	//   10   19:getfield        #62  <Field int[] tracks>
	//   11   22:invokestatic    #130 <Method int Arrays.hashCode(int[])>
	//   12   25:iadd            
	//   13   26:putfield        #121 <Field int hashCode>
		return hashCode;
	//   14   29:aload_0         
	//   15   30:getfield        #121 <Field int hashCode>
	//   16   33:ireturn         
	}

	public final int indexOf(int i)
	{
		for(int j = 0; j < length; j++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #43  <Field int length>
	//*   5    7:icmpge          29
			if(tracks[j] == i)
	//*   6   10:aload_0         
	//*   7   11:getfield        #62  <Field int[] tracks>
	//*   8   14:iload_2         
	//*   9   15:iaload          
	//*  10   16:iload_1         
	//*  11   17:icmpne          22
				return j;
	//   12   20:iload_2         
	//   13   21:ireturn         

	//   14   22:iload_2         
	//   15   23:iconst_1        
	//   16   24:iadd            
	//   17   25:istore_2        
	//*  18   26:goto            2
		return -1;
	//   19   29:iconst_m1       
	//   20   30:ireturn         
	}

	public final int indexOf(Format format)
	{
		for(int i = 0; i < length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #43  <Field int length>
	//*   5    7:icmpge          29
			if(formats[i] == format)
	//*   6   10:aload_0         
	//*   7   11:getfield        #47  <Field Format[] formats>
	//*   8   14:iload_2         
	//*   9   15:aaload          
	//*  10   16:aload_1         
	//*  11   17:if_acmpne       22
				return i;
	//   12   20:iload_2         
	//   13   21:ireturn         

	//   14   22:iload_2         
	//   15   23:iconst_1        
	//   16   24:iadd            
	//   17   25:istore_2        
	//*  18   26:goto            2
		return -1;
	//   19   29:iconst_m1       
	//   20   30:ireturn         
	}

	protected final boolean isBlacklisted(int i, long l)
	{
		return blacklistUntilTimes[i] > l;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field long[] blacklistUntilTimes>
	//    2    4:iload_1         
	//    3    5:laload          
	//    4    6:lload_2         
	//    5    7:lcmp            
	//    6    8:ifle            13
	//    7   11:iconst_1        
	//    8   12:ireturn         
	//    9   13:iconst_0        
	//   10   14:ireturn         
	}

	public final int length()
	{
		return tracks.length;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int[] tracks>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	public void onPlaybackSpeed(float f)
	{
	//    0    0:return          
	}

	private final long blacklistUntilTimes[];
	private final Format formats[];
	protected final TrackGroup group;
	private int hashCode;
	protected final int length;
	protected final int tracks[];
}
