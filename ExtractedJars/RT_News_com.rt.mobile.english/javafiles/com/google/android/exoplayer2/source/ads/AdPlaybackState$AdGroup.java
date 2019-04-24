// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer2.source.ads:
//			AdPlaybackState

public static final class AdPlaybackState$AdGroup
{

	private static long[] copyDurationsUsWithSpaceForAdCount(long al[], int i)
	{
		int j = al.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_2        
		i = Math.max(i, j);
	//    3    3:iload_1         
	//    4    4:iload_2         
	//    5    5:invokestatic    #48  <Method int Math.max(int, int)>
	//    6    8:istore_1        
		al = Arrays.copyOf(al, i);
	//    7    9:aload_0         
	//    8   10:iload_1         
	//    9   11:invokestatic    #53  <Method long[] Arrays.copyOf(long[], int)>
	//   10   14:astore_0        
		Arrays.fill(al, j, i, 0x1L);
	//   11   15:aload_0         
	//   12   16:iload_2         
	//   13   17:iload_1         
	//   14   18:ldc2w           #54  <Long 0x1L>
	//   15   21:invokestatic    #59  <Method void Arrays.fill(long[], int, int, long)>
		return al;
	//   16   24:aload_0         
	//   17   25:areturn         
	}

	private static int[] copyStatesWithSpaceForAdCount(int ai[], int i)
	{
		int j = ai.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_2        
		i = Math.max(i, j);
	//    3    3:iload_1         
	//    4    4:iload_2         
	//    5    5:invokestatic    #48  <Method int Math.max(int, int)>
	//    6    8:istore_1        
		ai = Arrays.copyOf(ai, i);
	//    7    9:aload_0         
	//    8   10:iload_1         
	//    9   11:invokestatic    #64  <Method int[] Arrays.copyOf(int[], int)>
	//   10   14:astore_0        
		Arrays.fill(ai, j, i, 0);
	//   11   15:aload_0         
	//   12   16:iload_2         
	//   13   17:iload_1         
	//   14   18:iconst_0        
	//   15   19:invokestatic    #67  <Method void Arrays.fill(int[], int, int, int)>
		return ai;
	//   16   22:aload_0         
	//   17   23:areturn         
	}

	public int getFirstAdIndexToPlay()
	{
		return getNextAdIndexToPlay(-1);
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:invokevirtual   #73  <Method int getNextAdIndexToPlay(int)>
	//    3    5:ireturn         
	}

	public int getNextAdIndexToPlay(int i)
	{
		for(i++; i < states.length && states[i] != 0; i++)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:iadd            
	//*   3    3:istore_1        
	//*   4    4:iload_1         
	//*   5    5:aload_0         
	//*   6    6:getfield        #35  <Field int[] states>
	//*   7    9:arraylength     
	//*   8   10:icmpge          41
	//*   9   13:aload_0         
	//*  10   14:getfield        #35  <Field int[] states>
	//*  11   17:iload_1         
	//*  12   18:iaload          
	//*  13   19:ifeq            41
			if(states[i] == 1)
	//*  14   22:aload_0         
	//*  15   23:getfield        #35  <Field int[] states>
	//*  16   26:iload_1         
	//*  17   27:iaload          
	//*  18   28:iconst_1        
	//*  19   29:icmpne          34
				return i;
	//   20   32:iload_1         
	//   21   33:ireturn         

	//   22   34:iload_1         
	//   23   35:iconst_1        
	//   24   36:iadd            
	//   25   37:istore_1        
	//*  26   38:goto            4
		return i;
	//   27   41:iload_1         
	//   28   42:ireturn         
	}

	public boolean hasUnplayedAds()
	{
		return count == -1 || getFirstAdIndexToPlay() < count;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int count>
	//    2    4:iconst_m1       
	//    3    5:icmpeq          24
	//    4    8:aload_0         
	//    5    9:invokevirtual   #77  <Method int getFirstAdIndexToPlay()>
	//    6   12:aload_0         
	//    7   13:getfield        #33  <Field int count>
	//    8   16:icmpge          22
	//    9   19:goto            24
	//   10   22:iconst_0        
	//   11   23:ireturn         
	//   12   24:iconst_1        
	//   13   25:ireturn         
	}

	public AdPlaybackState$AdGroup withAdCount(int i)
	{
		boolean flag;
		if(count == -1 && states.length <= i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field int count>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          22
	//*   4    8:aload_0         
	//*   5    9:getfield        #35  <Field int[] states>
	//*   6   12:arraylength     
	//*   7   13:iload_1         
	//*   8   14:icmpgt          22
			flag = true;
	//    9   17:iconst_1        
	//   10   18:istore_2        
		else
	//*  11   19:goto            24
			flag = false;
	//   12   22:iconst_0        
	//   13   23:istore_2        
		Assertions.checkArgument(flag);
	//   14   24:iload_2         
	//   15   25:invokestatic    #31  <Method void Assertions.checkArgument(boolean)>
		int ai[] = copyStatesWithSpaceForAdCount(states, i);
	//   16   28:aload_0         
	//   17   29:getfield        #35  <Field int[] states>
	//   18   32:iload_1         
	//   19   33:invokestatic    #81  <Method int[] copyStatesWithSpaceForAdCount(int[], int)>
	//   20   36:astore_3        
		long al[] = copyDurationsUsWithSpaceForAdCount(durationsUs, i);
	//   21   37:aload_0         
	//   22   38:getfield        #39  <Field long[] durationsUs>
	//   23   41:iload_1         
	//   24   42:invokestatic    #83  <Method long[] copyDurationsUsWithSpaceForAdCount(long[], int)>
	//   25   45:astore          4
		return new AdPlaybackState$AdGroup(i, ai, (Uri[])Arrays.copyOf(((Object []) (uris)), i), al);
	//   26   47:new             #2   <Class AdPlaybackState$AdGroup>
	//   27   50:dup             
	//   28   51:iload_1         
	//   29   52:aload_3         
	//   30   53:aload_0         
	//   31   54:getfield        #37  <Field Uri[] uris>
	//   32   57:iload_1         
	//   33   58:invokestatic    #86  <Method Object[] Arrays.copyOf(Object[], int)>
	//   34   61:checkcast       #87  <Class Uri[]>
	//   35   64:aload           4
	//   36   66:invokespecial   #22  <Method void AdPlaybackState$AdGroup(int, int[], Uri[], long[])>
	//   37   69:areturn         
	}

	public AdPlaybackState$AdGroup withAdDurationsUs(long al[])
	{
		boolean flag;
		if(count != -1 && al.length > uris.length)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field int count>
	//*   2    4:iconst_m1       
	//*   3    5:icmpeq          26
	//*   4    8:aload_1         
	//*   5    9:arraylength     
	//*   6   10:aload_0         
	//*   7   11:getfield        #37  <Field Uri[] uris>
	//*   8   14:arraylength     
	//*   9   15:icmpgt          21
	//*  10   18:goto            26
			flag = false;
	//   11   21:iconst_0        
	//   12   22:istore_2        
		else
	//*  13   23:goto            28
			flag = true;
	//   14   26:iconst_1        
	//   15   27:istore_2        
		Assertions.checkArgument(flag);
	//   16   28:iload_2         
	//   17   29:invokestatic    #31  <Method void Assertions.checkArgument(boolean)>
		long al1[] = al;
	//   18   32:aload_1         
	//   19   33:astore_3        
		if(al.length < uris.length)
	//*  20   34:aload_1         
	//*  21   35:arraylength     
	//*  22   36:aload_0         
	//*  23   37:getfield        #37  <Field Uri[] uris>
	//*  24   40:arraylength     
	//*  25   41:icmpge          54
			al1 = copyDurationsUsWithSpaceForAdCount(al, uris.length);
	//   26   44:aload_1         
	//   27   45:aload_0         
	//   28   46:getfield        #37  <Field Uri[] uris>
	//   29   49:arraylength     
	//   30   50:invokestatic    #83  <Method long[] copyDurationsUsWithSpaceForAdCount(long[], int)>
	//   31   53:astore_3        
		return new AdPlaybackState$AdGroup(count, states, uris, al1);
	//   32   54:new             #2   <Class AdPlaybackState$AdGroup>
	//   33   57:dup             
	//   34   58:aload_0         
	//   35   59:getfield        #33  <Field int count>
	//   36   62:aload_0         
	//   37   63:getfield        #35  <Field int[] states>
	//   38   66:aload_0         
	//   39   67:getfield        #37  <Field Uri[] uris>
	//   40   70:aload_3         
	//   41   71:invokespecial   #22  <Method void AdPlaybackState$AdGroup(int, int[], Uri[], long[])>
	//   42   74:areturn         
	}

	public AdPlaybackState$AdGroup withAdState(int i, int j)
	{
		boolean flag;
		int ai[];
label0:
		{
			int k = count;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int count>
	//    2    4:istore_3        
			boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore          5
			if(k != -1 && j >= count)
	//*   5    8:iload_3         
	//*   6    9:iconst_m1       
	//*   7   10:icmpeq          30
	//*   8   13:iload_2         
	//*   9   14:aload_0         
	//*  10   15:getfield        #33  <Field int count>
	//*  11   18:icmpge          24
	//*  12   21:goto            30
				flag = false;
	//   13   24:iconst_0        
	//   14   25:istore          4
			else
	//*  15   27:goto            33
				flag = true;
	//   16   30:iconst_1        
	//   17   31:istore          4
			Assertions.checkArgument(flag);
	//   18   33:iload           4
	//   19   35:invokestatic    #31  <Method void Assertions.checkArgument(boolean)>
			ai = copyStatesWithSpaceForAdCount(states, j + 1);
	//   20   38:aload_0         
	//   21   39:getfield        #35  <Field int[] states>
	//   22   42:iload_2         
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:invokestatic    #81  <Method int[] copyStatesWithSpaceForAdCount(int[], int)>
	//   26   48:astore          8
			if(ai[j] != 0 && ai[j] != 1)
	//*  27   50:aload           8
	//*  28   52:iload_2         
	//*  29   53:iaload          
	//*  30   54:ifeq            77
	//*  31   57:aload           8
	//*  32   59:iload_2         
	//*  33   60:iaload          
	//*  34   61:iconst_1        
	//*  35   62:icmpeq          77
			{
				flag = flag1;
	//   36   65:iload           5
	//   37   67:istore          4
				if(ai[j] != i)
					break label0;
	//   38   69:aload           8
	//   39   71:iload_2         
	//   40   72:iaload          
	//   41   73:iload_1         
	//   42   74:icmpne          80
			}
			flag = true;
	//   43   77:iconst_1        
	//   44   78:istore          4
		}
		Assertions.checkArgument(flag);
	//   45   80:iload           4
	//   46   82:invokestatic    #31  <Method void Assertions.checkArgument(boolean)>
		long al[];
		if(durationsUs.length == ai.length)
	//*  47   85:aload_0         
	//*  48   86:getfield        #39  <Field long[] durationsUs>
	//*  49   89:arraylength     
	//*  50   90:aload           8
	//*  51   92:arraylength     
	//*  52   93:icmpne          105
			al = durationsUs;
	//   53   96:aload_0         
	//   54   97:getfield        #39  <Field long[] durationsUs>
	//   55  100:astore          6
		else
	//*  56  102:goto            117
			al = copyDurationsUsWithSpaceForAdCount(durationsUs, ai.length);
	//   57  105:aload_0         
	//   58  106:getfield        #39  <Field long[] durationsUs>
	//   59  109:aload           8
	//   60  111:arraylength     
	//   61  112:invokestatic    #83  <Method long[] copyDurationsUsWithSpaceForAdCount(long[], int)>
	//   62  115:astore          6
		Uri auri[];
		if(uris.length == ai.length)
	//*  63  117:aload_0         
	//*  64  118:getfield        #37  <Field Uri[] uris>
	//*  65  121:arraylength     
	//*  66  122:aload           8
	//*  67  124:arraylength     
	//*  68  125:icmpne          137
			auri = uris;
	//   69  128:aload_0         
	//   70  129:getfield        #37  <Field Uri[] uris>
	//   71  132:astore          7
		else
	//*  72  134:goto            152
			auri = (Uri[])Arrays.copyOf(((Object []) (uris)), ai.length);
	//   73  137:aload_0         
	//   74  138:getfield        #37  <Field Uri[] uris>
	//   75  141:aload           8
	//   76  143:arraylength     
	//   77  144:invokestatic    #86  <Method Object[] Arrays.copyOf(Object[], int)>
	//   78  147:checkcast       #87  <Class Uri[]>
	//   79  150:astore          7
		ai[j] = i;
	//   80  152:aload           8
	//   81  154:iload_2         
	//   82  155:iload_1         
	//   83  156:iastore         
		return new AdPlaybackState$AdGroup(count, ai, auri, al);
	//   84  157:new             #2   <Class AdPlaybackState$AdGroup>
	//   85  160:dup             
	//   86  161:aload_0         
	//   87  162:getfield        #33  <Field int count>
	//   88  165:aload           8
	//   89  167:aload           7
	//   90  169:aload           6
	//   91  171:invokespecial   #22  <Method void AdPlaybackState$AdGroup(int, int[], Uri[], long[])>
	//   92  174:areturn         
	}

	public AdPlaybackState$AdGroup withAdUri(Uri uri, int i)
	{
		int j = count;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int count>
	//    2    4:istore_3        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore          5
		boolean flag;
		if(j != -1 && i >= count)
	//*   5    8:iload_3         
	//*   6    9:iconst_m1       
	//*   7   10:icmpeq          30
	//*   8   13:iload_2         
	//*   9   14:aload_0         
	//*  10   15:getfield        #33  <Field int count>
	//*  11   18:icmpge          24
	//*  12   21:goto            30
			flag = false;
	//   13   24:iconst_0        
	//   14   25:istore          4
		else
	//*  15   27:goto            33
			flag = true;
	//   16   30:iconst_1        
	//   17   31:istore          4
		Assertions.checkArgument(flag);
	//   18   33:iload           4
	//   19   35:invokestatic    #31  <Method void Assertions.checkArgument(boolean)>
		int ai[] = copyStatesWithSpaceForAdCount(states, i + 1);
	//   20   38:aload_0         
	//   21   39:getfield        #35  <Field int[] states>
	//   22   42:iload_2         
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:invokestatic    #81  <Method int[] copyStatesWithSpaceForAdCount(int[], int)>
	//   26   48:astore          7
		flag = flag1;
	//   27   50:iload           5
	//   28   52:istore          4
		if(ai[i] == 0)
	//*  29   54:aload           7
	//*  30   56:iload_2         
	//*  31   57:iaload          
	//*  32   58:ifne            64
			flag = true;
	//   33   61:iconst_1        
	//   34   62:istore          4
		Assertions.checkArgument(flag);
	//   35   64:iload           4
	//   36   66:invokestatic    #31  <Method void Assertions.checkArgument(boolean)>
		long al[];
		if(durationsUs.length == ai.length)
	//*  37   69:aload_0         
	//*  38   70:getfield        #39  <Field long[] durationsUs>
	//*  39   73:arraylength     
	//*  40   74:aload           7
	//*  41   76:arraylength     
	//*  42   77:icmpne          89
			al = durationsUs;
	//   43   80:aload_0         
	//   44   81:getfield        #39  <Field long[] durationsUs>
	//   45   84:astore          6
		else
	//*  46   86:goto            101
			al = copyDurationsUsWithSpaceForAdCount(durationsUs, ai.length);
	//   47   89:aload_0         
	//   48   90:getfield        #39  <Field long[] durationsUs>
	//   49   93:aload           7
	//   50   95:arraylength     
	//   51   96:invokestatic    #83  <Method long[] copyDurationsUsWithSpaceForAdCount(long[], int)>
	//   52   99:astore          6
		Uri auri[] = (Uri[])Arrays.copyOf(((Object []) (uris)), ai.length);
	//   53  101:aload_0         
	//   54  102:getfield        #37  <Field Uri[] uris>
	//   55  105:aload           7
	//   56  107:arraylength     
	//   57  108:invokestatic    #86  <Method Object[] Arrays.copyOf(Object[], int)>
	//   58  111:checkcast       #87  <Class Uri[]>
	//   59  114:astore          8
		auri[i] = uri;
	//   60  116:aload           8
	//   61  118:iload_2         
	//   62  119:aload_1         
	//   63  120:aastore         
		ai[i] = 1;
	//   64  121:aload           7
	//   65  123:iload_2         
	//   66  124:iconst_1        
	//   67  125:iastore         
		return new AdPlaybackState$AdGroup(count, ai, auri, al);
	//   68  126:new             #2   <Class AdPlaybackState$AdGroup>
	//   69  129:dup             
	//   70  130:aload_0         
	//   71  131:getfield        #33  <Field int count>
	//   72  134:aload           7
	//   73  136:aload           8
	//   74  138:aload           6
	//   75  140:invokespecial   #22  <Method void AdPlaybackState$AdGroup(int, int[], Uri[], long[])>
	//   76  143:areturn         
	}

	public AdPlaybackState$AdGroup withAllAdsSkipped()
	{
		int j = count;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int count>
	//    2    4:istore_2        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		if(j == -1)
	//*   5    7:iload_2         
	//*   6    8:iconst_m1       
	//*   7    9:icmpne          31
			return new AdPlaybackState$AdGroup(0, new int[0], new Uri[0], new long[0]);
	//    8   12:new             #2   <Class AdPlaybackState$AdGroup>
	//    9   15:dup             
	//   10   16:iconst_0        
	//   11   17:iconst_0        
	//   12   18:newarray        int[]
	//   13   20:iconst_0        
	//   14   21:anewarray       Uri[]
	//   15   24:iconst_0        
	//   16   25:newarray        long[]
	//   17   27:invokespecial   #22  <Method void AdPlaybackState$AdGroup(int, int[], Uri[], long[])>
	//   18   30:areturn         
		j = states.length;
	//   19   31:aload_0         
	//   20   32:getfield        #35  <Field int[] states>
	//   21   35:arraylength     
	//   22   36:istore_2        
		int ai[] = Arrays.copyOf(states, j);
	//   23   37:aload_0         
	//   24   38:getfield        #35  <Field int[] states>
	//   25   41:iload_2         
	//   26   42:invokestatic    #64  <Method int[] Arrays.copyOf(int[], int)>
	//   27   45:astore_3        
		for(; i < j; i++)
	//*  28   46:iload_1         
	//*  29   47:iload_2         
	//*  30   48:icmpge          75
			if(ai[i] == 1 || ai[i] == 0)
	//*  31   51:aload_3         
	//*  32   52:iload_1         
	//*  33   53:iaload          
	//*  34   54:iconst_1        
	//*  35   55:icmpeq          64
	//*  36   58:aload_3         
	//*  37   59:iload_1         
	//*  38   60:iaload          
	//*  39   61:ifne            68
				ai[i] = 2;
	//   40   64:aload_3         
	//   41   65:iload_1         
	//   42   66:iconst_2        
	//   43   67:iastore         

	//   44   68:iload_1         
	//   45   69:iconst_1        
	//   46   70:iadd            
	//   47   71:istore_1        
	//*  48   72:goto            46
		return new AdPlaybackState$AdGroup(j, ai, uris, durationsUs);
	//   49   75:new             #2   <Class AdPlaybackState$AdGroup>
	//   50   78:dup             
	//   51   79:iload_2         
	//   52   80:aload_3         
	//   53   81:aload_0         
	//   54   82:getfield        #37  <Field Uri[] uris>
	//   55   85:aload_0         
	//   56   86:getfield        #39  <Field long[] durationsUs>
	//   57   89:invokespecial   #22  <Method void AdPlaybackState$AdGroup(int, int[], Uri[], long[])>
	//   58   92:areturn         
	}

	public final int count;
	public final long durationsUs[];
	public final int states[];
	public final Uri uris[];

	public AdPlaybackState$AdGroup()
	{
		this(-1, new int[0], new Uri[0], new long[0]);
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:iconst_0        
	//    3    3:newarray        int[]
	//    4    5:iconst_0        
	//    5    6:anewarray       Uri[]
	//    6    9:iconst_0        
	//    7   10:newarray        long[]
	//    8   12:invokespecial   #22  <Method void AdPlaybackState$AdGroup(int, int[], Uri[], long[])>
	//    9   15:return          
	}

	private AdPlaybackState$AdGroup(int i, int ai[], Uri auri[], long al[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		boolean flag;
		if(ai.length == auri.length)
	//*   2    4:aload_2         
	//*   3    5:arraylength     
	//*   4    6:aload_3         
	//*   5    7:arraylength     
	//*   6    8:icmpne          17
			flag = true;
	//    7   11:iconst_1        
	//    8   12:istore          5
		else
	//*   9   14:goto            20
			flag = false;
	//   10   17:iconst_0        
	//   11   18:istore          5
		Assertions.checkArgument(flag);
	//   12   20:iload           5
	//   13   22:invokestatic    #31  <Method void Assertions.checkArgument(boolean)>
		count = i;
	//   14   25:aload_0         
	//   15   26:iload_1         
	//   16   27:putfield        #33  <Field int count>
		states = ai;
	//   17   30:aload_0         
	//   18   31:aload_2         
	//   19   32:putfield        #35  <Field int[] states>
		uris = auri;
	//   20   35:aload_0         
	//   21   36:aload_3         
	//   22   37:putfield        #37  <Field Uri[] uris>
		durationsUs = al;
	//   23   40:aload_0         
	//   24   41:aload           4
	//   25   43:putfield        #39  <Field long[] durationsUs>
	//   26   46:return          
	}
}
