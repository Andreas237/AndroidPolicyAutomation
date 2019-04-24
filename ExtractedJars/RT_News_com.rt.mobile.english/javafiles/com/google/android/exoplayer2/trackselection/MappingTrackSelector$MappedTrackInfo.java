// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer2.trackselection:
//			MappingTrackSelector

public static final class MappingTrackSelector$MappedTrackInfo
{

	public int getAdaptiveSupport(int i, int j, boolean flag)
	{
		int j1 = rendererTrackGroups[i].get(j).length;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field TrackGroupArray[] rendererTrackGroups>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:iload_2         
	//    5    7:invokevirtual   #56  <Method TrackGroup TrackGroupArray.get(int)>
	//    6   10:getfield        #59  <Field int TrackGroup.length>
	//    7   13:istore          7
		int ai[] = new int[j1];
	//    8   15:iload           7
	//    9   17:newarray        int[]
	//   10   19:astore          9
		int k = 0;
	//   11   21:iconst_0        
	//   12   22:istore          4
		int l;
		int i1;
		for(l = 0; k < j1; l = i1)
	//*  13   24:iconst_0        
	//*  14   25:istore          5
	//*  15   27:iload           4
	//*  16   29:iload           7
	//*  17   31:icmpge          94
		{
label0:
			{
				int k1 = getTrackSupport(i, j, k);
	//   18   34:aload_0         
	//   19   35:iload_1         
	//   20   36:iload_2         
	//   21   37:iload           4
	//   22   39:invokevirtual   #63  <Method int getTrackSupport(int, int, int)>
	//   23   42:istore          8
				if(k1 != 4)
	//*  24   44:iload           8
	//*  25   46:iconst_4        
	//*  26   47:icmpeq          68
				{
					i1 = l;
	//   27   50:iload           5
	//   28   52:istore          6
					if(!flag)
						break label0;
	//   29   54:iload_3         
	//   30   55:ifeq            81
					i1 = l;
	//   31   58:iload           5
	//   32   60:istore          6
					if(k1 != 3)
						break label0;
	//   33   62:iload           8
	//   34   64:iconst_3        
	//   35   65:icmpne          81
				}
				ai[l] = k;
	//   36   68:aload           9
	//   37   70:iload           5
	//   38   72:iload           4
	//   39   74:iastore         
				i1 = l + 1;
	//   40   75:iload           5
	//   41   77:iconst_1        
	//   42   78:iadd            
	//   43   79:istore          6
			}
			k++;
	//   44   81:iload           4
	//   45   83:iconst_1        
	//   46   84:iadd            
	//   47   85:istore          4
		}

	//   48   87:iload           6
	//   49   89:istore          5
	//*  50   91:goto            27
		return getAdaptiveSupport(i, j, Arrays.copyOf(ai, l));
	//   51   94:aload_0         
	//   52   95:iload_1         
	//   53   96:iload_2         
	//   54   97:aload           9
	//   55   99:iload           5
	//   56  101:invokestatic    #69  <Method int[] Arrays.copyOf(int[], int)>
	//   57  104:invokevirtual   #72  <Method int getAdaptiveSupport(int, int, int[])>
	//   58  107:ireturn         
	}

	public int getAdaptiveSupport(int i, int j, int ai[])
	{
		int i1 = 0;
	//    0    0:iconst_0        
	//    1    1:istore          6
		int k = 16;
	//    2    3:bipush          16
	//    3    5:istore          4
		String s = null;
	//    4    7:aconst_null     
	//    5    8:astore          9
		int l = 0;
	//    6   10:iconst_0        
	//    7   11:istore          5
		int j1 = l;
	//    8   13:iload           5
	//    9   15:istore          7
		while(i1 < ai.length) 
	//*  10   17:iload           6
	//*  11   19:aload_3         
	//*  12   20:arraylength     
	//*  13   21:icmpge          112
		{
			int k1 = ai[i1];
	//   14   24:aload_3         
	//   15   25:iload           6
	//   16   27:iaload          
	//   17   28:istore          8
			String s1 = rendererTrackGroups[i].get(j).getFormat(k1).sampleMimeType;
	//   18   30:aload_0         
	//   19   31:getfield        #37  <Field TrackGroupArray[] rendererTrackGroups>
	//   20   34:iload_1         
	//   21   35:aaload          
	//   22   36:iload_2         
	//   23   37:invokevirtual   #56  <Method TrackGroup TrackGroupArray.get(int)>
	//   24   40:iload           8
	//   25   42:invokevirtual   #76  <Method Format TrackGroup.getFormat(int)>
	//   26   45:getfield        #82  <Field String Format.sampleMimeType>
	//   27   48:astore          10
			if(l == 0)
	//*  28   50:iload           5
	//*  29   52:ifne            62
				s = s1;
	//   30   55:aload           10
	//   31   57:astore          9
			else
	//*  32   59:goto            76
				j1 = Util.areEqual(((Object) (s)), ((Object) (s1))) ^ true | j1;
	//   33   62:aload           9
	//   34   64:aload           10
	//   35   66:invokestatic    #88  <Method boolean Util.areEqual(Object, Object)>
	//   36   69:iconst_1        
	//   37   70:ixor            
	//   38   71:iload           7
	//   39   73:ior             
	//   40   74:istore          7
			k = Math.min(k, rendererFormatSupports[i][j][i1] & 0x18);
	//   41   76:iload           4
	//   42   78:aload_0         
	//   43   79:getfield        #39  <Field int[][][] rendererFormatSupports>
	//   44   82:iload_1         
	//   45   83:aaload          
	//   46   84:iload_2         
	//   47   85:aaload          
	//   48   86:iload           6
	//   49   88:iaload          
	//   50   89:bipush          24
	//   51   91:iand            
	//   52   92:invokestatic    #94  <Method int Math.min(int, int)>
	//   53   95:istore          4
			i1++;
	//   54   97:iload           6
	//   55   99:iconst_1        
	//   56  100:iadd            
	//   57  101:istore          6
			l++;
	//   58  103:iload           5
	//   59  105:iconst_1        
	//   60  106:iadd            
	//   61  107:istore          5
		}
	//*  62  109:goto            17
		j = k;
	//   63  112:iload           4
	//   64  114:istore_2        
		if(j1 != 0)
	//*  65  115:iload           7
	//*  66  117:ifeq            132
			j = Math.min(k, rendererMixedMimeTypeAdaptiveSupports[i]);
	//   67  120:iload           4
	//   68  122:aload_0         
	//   69  123:getfield        #41  <Field int[] rendererMixedMimeTypeAdaptiveSupports>
	//   70  126:iload_1         
	//   71  127:iaload          
	//   72  128:invokestatic    #94  <Method int Math.min(int, int)>
	//   73  131:istore_2        
		return j;
	//   74  132:iload_2         
	//   75  133:ireturn         
	}

	public int getRendererCount()
	{
		return rendererCount;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int rendererCount>
	//    2    4:ireturn         
	}

	public int getRendererSupport(int i)
	{
		int ai[][] = rendererFormatSupports[i];
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int[][][] rendererFormatSupports>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:astore          5
		int j = 0;
	//    5    8:iconst_0        
	//    6    9:istore_2        
		i = j;
	//    7   10:iload_2         
	//    8   11:istore_1        
		for(; j < ai.length; j++)
	//*   9   12:iload_2         
	//*  10   13:aload           5
	//*  11   15:arraylength     
	//*  12   16:icmpge          92
		{
			for(int k = 0; k < ai[j].length; k++)
	//*  13   19:iconst_0        
	//*  14   20:istore_3        
	//*  15   21:iload_3         
	//*  16   22:aload           5
	//*  17   24:iload_2         
	//*  18   25:aaload          
	//*  19   26:arraylength     
	//*  20   27:icmpge          85
			{
				byte byte0;
				switch(ai[j][k] & 7)
	//*  21   30:aload           5
	//*  22   32:iload_2         
	//*  23   33:aaload          
	//*  24   34:iload_3         
	//*  25   35:iaload          
	//*  26   36:bipush          7
	//*  27   38:iand            
				{
	//*  28   39:tableswitch     3 4: default 60
	//	               3 68
	//	               4 66
				default:
					byte0 = 1;
	//   29   60:iconst_1        
	//   30   61:istore          4
					break;

	//*  31   63:goto            71
				case 4: // '\004'
					return 3;
	//   32   66:iconst_3        
	//   33   67:ireturn         

				case 3: // '\003'
					byte0 = 2;
	//   34   68:iconst_2        
	//   35   69:istore          4
					break;
				}
				i = Math.max(i, ((int) (byte0)));
	//   36   71:iload_1         
	//   37   72:iload           4
	//   38   74:invokestatic    #101 <Method int Math.max(int, int)>
	//   39   77:istore_1        
			}

	//   40   78:iload_3         
	//   41   79:iconst_1        
	//   42   80:iadd            
	//   43   81:istore_3        
		}

	//   44   82:goto            21
	//   45   85:iload_2         
	//   46   86:iconst_1        
	//   47   87:iadd            
	//   48   88:istore_2        
	//*  49   89:goto            12
		return i;
	//   50   92:iload_1         
	//   51   93:ireturn         
	}

	public int getRendererType(int i)
	{
		return rendererTrackTypes[i];
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int[] rendererTrackTypes>
	//    2    4:iload_1         
	//    3    5:iaload          
	//    4    6:ireturn         
	}

	public int getTrackFormatSupport(int i, int j, int k)
	{
		return getTrackSupport(i, j, k);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #63  <Method int getTrackSupport(int, int, int)>
	//    5    7:ireturn         
	}

	public TrackGroupArray getTrackGroups(int i)
	{
		return rendererTrackGroups[i];
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field TrackGroupArray[] rendererTrackGroups>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:areturn         
	}

	public int getTrackSupport(int i, int j, int k)
	{
		return rendererFormatSupports[i][j][k] & 7;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int[][][] rendererFormatSupports>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:iload_2         
	//    5    7:aaload          
	//    6    8:iload_3         
	//    7    9:iaload          
	//    8   10:bipush          7
	//    9   12:iand            
	//   10   13:ireturn         
	}

	public int getTrackTypeRendererSupport(int i)
	{
		return getTypeSupport(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #110 <Method int getTypeSupport(int)>
	//    3    5:ireturn         
	}

	public int getTypeSupport(int i)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int k;
		int l;
		for(k = 0; j < rendererCount; k = l)
	//*   2    2:iconst_0        
	//*   3    3:istore_3        
	//*   4    4:iload_2         
	//*   5    5:aload_0         
	//*   6    6:getfield        #45  <Field int rendererCount>
	//*   7    9:icmpge          46
		{
			l = k;
	//    8   12:iload_3         
	//    9   13:istore          4
			if(rendererTrackTypes[j] == i)
	//*  10   15:aload_0         
	//*  11   16:getfield        #35  <Field int[] rendererTrackTypes>
	//*  12   19:iload_2         
	//*  13   20:iaload          
	//*  14   21:iload_1         
	//*  15   22:icmpne          36
				l = Math.max(k, getRendererSupport(j));
	//   16   25:iload_3         
	//   17   26:aload_0         
	//   18   27:iload_2         
	//   19   28:invokevirtual   #112 <Method int getRendererSupport(int)>
	//   20   31:invokestatic    #101 <Method int Math.max(int, int)>
	//   21   34:istore          4
			j++;
	//   22   36:iload_2         
	//   23   37:iconst_1        
	//   24   38:iadd            
	//   25   39:istore_2        
		}

	//   26   40:iload           4
	//   27   42:istore_3        
	//*  28   43:goto            4
		return k;
	//   29   46:iload_3         
	//   30   47:ireturn         
	}

	public TrackGroupArray getUnassociatedTrackGroups()
	{
		return getUnmappedTrackGroups();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #117 <Method TrackGroupArray getUnmappedTrackGroups()>
	//    2    4:areturn         
	}

	public TrackGroupArray getUnmappedTrackGroups()
	{
		return unmappedTrackGroups;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field TrackGroupArray unmappedTrackGroups>
	//    2    4:areturn         
	}

	public static final int RENDERER_SUPPORT_EXCEEDS_CAPABILITIES_TRACKS = 2;
	public static final int RENDERER_SUPPORT_NO_TRACKS = 0;
	public static final int RENDERER_SUPPORT_PLAYABLE_TRACKS = 3;
	public static final int RENDERER_SUPPORT_UNSUPPORTED_TRACKS = 1;
	public final int length;
	private final int rendererCount;
	private final int rendererFormatSupports[][][];
	private final int rendererMixedMimeTypeAdaptiveSupports[];
	private final TrackGroupArray rendererTrackGroups[];
	private final int rendererTrackTypes[];
	private final TrackGroupArray unmappedTrackGroups;

	MappingTrackSelector$MappedTrackInfo(int ai[], TrackGroupArray atrackgrouparray[], int ai1[], int ai2[][][], TrackGroupArray trackgrouparray)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		rendererTrackTypes = ai;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #35  <Field int[] rendererTrackTypes>
		rendererTrackGroups = atrackgrouparray;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #37  <Field TrackGroupArray[] rendererTrackGroups>
		rendererFormatSupports = ai2;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #39  <Field int[][][] rendererFormatSupports>
		rendererMixedMimeTypeAdaptiveSupports = ai1;
	//   11   20:aload_0         
	//   12   21:aload_3         
	//   13   22:putfield        #41  <Field int[] rendererMixedMimeTypeAdaptiveSupports>
		unmappedTrackGroups = trackgrouparray;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #43  <Field TrackGroupArray unmappedTrackGroups>
		rendererCount = ai.length;
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:arraylength     
	//   20   34:putfield        #45  <Field int rendererCount>
		length = rendererCount;
	//   21   37:aload_0         
	//   22   38:aload_0         
	//   23   39:getfield        #45  <Field int rendererCount>
	//   24   42:putfield        #47  <Field int length>
	//   25   45:return          
	}
}
