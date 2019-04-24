// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import com.google.android.exoplayer2.util.Assertions;
import java.lang.annotation.Annotation;
import java.util.Arrays;

public final class AdPlaybackState
{
	public static final class AdGroup
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

		public AdGroup withAdCount(int i)
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
			return new AdGroup(i, ai, (Uri[])Arrays.copyOf(((Object []) (uris)), i), al);
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

		public AdGroup withAdDurationsUs(long al[])
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
			return new AdGroup(count, states, uris, al1);
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

		public AdGroup withAdState(int i, int j)
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
			return new AdGroup(count, ai, auri, al);
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

		public AdGroup withAdUri(Uri uri, int i)
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
			return new AdGroup(count, ai, auri, al);
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

		public AdGroup withAllAdsSkipped()
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
				return new AdGroup(0, new int[0], new Uri[0], new long[0]);
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
			return new AdGroup(j, ai, uris, durationsUs);
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

		public AdGroup()
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

		private AdGroup(int i, int ai[], Uri auri[], long al[])
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

	public static interface AdState
		extends Annotation
	{
	}


	public transient AdPlaybackState(long al[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		int i = 0;
	//    2    4:iconst_0        
	//    3    5:istore_2        
		int j = al.length;
	//    4    6:aload_1         
	//    5    7:arraylength     
	//    6    8:istore_3        
		adGroupCount = j;
	//    7    9:aload_0         
	//    8   10:iload_3         
	//    9   11:putfield        #44  <Field int adGroupCount>
		adGroupTimesUs = Arrays.copyOf(al, j);
	//   10   14:aload_0         
	//   11   15:aload_1         
	//   12   16:iload_3         
	//   13   17:invokestatic    #50  <Method long[] Arrays.copyOf(long[], int)>
	//   14   20:putfield        #52  <Field long[] adGroupTimesUs>
		adGroups = new AdGroup[j];
	//   15   23:aload_0         
	//   16   24:iload_3         
	//   17   25:anewarray       AdGroup[]
	//   18   28:putfield        #54  <Field AdPlaybackState$AdGroup[] adGroups>
		for(; i < j; i++)
	//*  19   31:iload_2         
	//*  20   32:iload_3         
	//*  21   33:icmpge          56
			adGroups[i] = new AdGroup();
	//   22   36:aload_0         
	//   23   37:getfield        #54  <Field AdPlaybackState$AdGroup[] adGroups>
	//   24   40:iload_2         
	//   25   41:new             #6   <Class AdPlaybackState$AdGroup>
	//   26   44:dup             
	//   27   45:invokespecial   #55  <Method void AdPlaybackState$AdGroup()>
	//   28   48:aastore         

	//   29   49:iload_2         
	//   30   50:iconst_1        
	//   31   51:iadd            
	//   32   52:istore_2        
	//*  33   53:goto            31
		adResumePositionUs = 0L;
	//   34   56:aload_0         
	//   35   57:lconst_0        
	//   36   58:putfield        #57  <Field long adResumePositionUs>
		contentDurationUs = 0x1L;
	//   37   61:aload_0         
	//   38   62:ldc2w           #58  <Long 0x1L>
	//   39   65:putfield        #61  <Field long contentDurationUs>
	//   40   68:return          
	}

	private AdPlaybackState(long al[], AdGroup aadgroup[], long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		adGroupCount = aadgroup.length;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:arraylength     
	//    5    7:putfield        #44  <Field int adGroupCount>
		adGroupTimesUs = al;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:putfield        #52  <Field long[] adGroupTimesUs>
		adGroups = aadgroup;
	//    9   15:aload_0         
	//   10   16:aload_2         
	//   11   17:putfield        #54  <Field AdPlaybackState$AdGroup[] adGroups>
		adResumePositionUs = l;
	//   12   20:aload_0         
	//   13   21:lload_3         
	//   14   22:putfield        #57  <Field long adResumePositionUs>
		contentDurationUs = l1;
	//   15   25:aload_0         
	//   16   26:lload           5
	//   17   28:putfield        #61  <Field long contentDurationUs>
	//   18   31:return          
	}

	public int getAdGroupIndexAfterPositionUs(long l)
	{
		int i;
		for(i = 0; i < adGroupTimesUs.length && adGroupTimesUs[i] != 0x0L && (l >= adGroupTimesUs[i] || !adGroups[i].hasUnplayedAds()); i++);
	//    0    0:iconst_0        
	//    1    1:istore_3        
	//    2    2:iload_3         
	//    3    3:aload_0         
	//    4    4:getfield        #52  <Field long[] adGroupTimesUs>
	//    5    7:arraylength     
	//    6    8:icmpge          54
	//    7   11:aload_0         
	//    8   12:getfield        #52  <Field long[] adGroupTimesUs>
	//    9   15:iload_3         
	//   10   16:laload          
	//   11   17:ldc2w           #65  <Long 0x0L>
	//   12   20:lcmp            
	//   13   21:ifeq            54
	//   14   24:lload_1         
	//   15   25:aload_0         
	//   16   26:getfield        #52  <Field long[] adGroupTimesUs>
	//   17   29:iload_3         
	//   18   30:laload          
	//   19   31:lcmp            
	//   20   32:ifge            47
	//   21   35:aload_0         
	//   22   36:getfield        #54  <Field AdPlaybackState$AdGroup[] adGroups>
	//   23   39:iload_3         
	//   24   40:aaload          
	//   25   41:invokevirtual   #70  <Method boolean AdPlaybackState$AdGroup.hasUnplayedAds()>
	//   26   44:ifne            54
	//   27   47:iload_3         
	//   28   48:iconst_1        
	//   29   49:iadd            
	//   30   50:istore_3        
	//*  31   51:goto            2
		if(i < adGroupTimesUs.length)
	//*  32   54:iload_3         
	//*  33   55:aload_0         
	//*  34   56:getfield        #52  <Field long[] adGroupTimesUs>
	//*  35   59:arraylength     
	//*  36   60:icmpge          65
			return i;
	//   37   63:iload_3         
	//   38   64:ireturn         
		else
			return -1;
	//   39   65:iconst_m1       
	//   40   66:ireturn         
	}

	public int getAdGroupIndexForPositionUs(long l)
	{
		int i;
		for(i = adGroupTimesUs.length - 1; i >= 0 && (adGroupTimesUs[i] == 0x0L || adGroupTimesUs[i] > l); i--);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field long[] adGroupTimesUs>
	//    2    4:arraylength     
	//    3    5:iconst_1        
	//    4    6:isub            
	//    5    7:istore_3        
	//    6    8:iload_3         
	//    7    9:iflt            43
	//    8   12:aload_0         
	//    9   13:getfield        #52  <Field long[] adGroupTimesUs>
	//   10   16:iload_3         
	//   11   17:laload          
	//   12   18:ldc2w           #65  <Long 0x0L>
	//   13   21:lcmp            
	//   14   22:ifeq            36
	//   15   25:aload_0         
	//   16   26:getfield        #52  <Field long[] adGroupTimesUs>
	//   17   29:iload_3         
	//   18   30:laload          
	//   19   31:lload_1         
	//   20   32:lcmp            
	//   21   33:ifle            43
	//   22   36:iload_3         
	//   23   37:iconst_1        
	//   24   38:isub            
	//   25   39:istore_3        
	//*  26   40:goto            8
		if(i >= 0 && adGroups[i].hasUnplayedAds())
	//*  27   43:iload_3         
	//*  28   44:iflt            61
	//*  29   47:aload_0         
	//*  30   48:getfield        #54  <Field AdPlaybackState$AdGroup[] adGroups>
	//*  31   51:iload_3         
	//*  32   52:aaload          
	//*  33   53:invokevirtual   #70  <Method boolean AdPlaybackState$AdGroup.hasUnplayedAds()>
	//*  34   56:ifeq            61
			return i;
	//   35   59:iload_3         
	//   36   60:ireturn         
		else
			return -1;
	//   37   61:iconst_m1       
	//   38   62:ireturn         
	}

	public AdPlaybackState withAdCount(int i, int j)
	{
		boolean flag;
		if(j > 0)
	//*   0    0:iload_2         
	//*   1    1:ifle            9
			flag = true;
	//    2    4:iconst_1        
	//    3    5:istore_3        
		else
	//*   4    6:goto            11
			flag = false;
	//    5    9:iconst_0        
	//    6   10:istore_3        
		Assertions.checkArgument(flag);
	//    7   11:iload_3         
	//    8   12:invokestatic    #80  <Method void Assertions.checkArgument(boolean)>
		if(adGroups[i].count == j)
	//*   9   15:aload_0         
	//*  10   16:getfield        #54  <Field AdPlaybackState$AdGroup[] adGroups>
	//*  11   19:iload_1         
	//*  12   20:aaload          
	//*  13   21:getfield        #83  <Field int AdPlaybackState$AdGroup.count>
	//*  14   24:iload_2         
	//*  15   25:icmpne          30
		{
			return this;
	//   16   28:aload_0         
	//   17   29:areturn         
		} else
		{
			AdGroup aadgroup[] = (AdGroup[])Arrays.copyOf(((Object []) (adGroups)), adGroups.length);
	//   18   30:aload_0         
	//   19   31:getfield        #54  <Field AdPlaybackState$AdGroup[] adGroups>
	//   20   34:aload_0         
	//   21   35:getfield        #54  <Field AdPlaybackState$AdGroup[] adGroups>
	//   22   38:arraylength     
	//   23   39:invokestatic    #86  <Method Object[] Arrays.copyOf(Object[], int)>
	//   24   42:checkcast       #87  <Class AdPlaybackState$AdGroup[]>
	//   25   45:astore          4
			aadgroup[i] = adGroups[i].withAdCount(j);
	//   26   47:aload           4
	//   27   49:iload_1         
	//   28   50:aload_0         
	//   29   51:getfield        #54  <Field AdPlaybackState$AdGroup[] adGroups>
	//   30   54:iload_1         
	//   31   55:aaload          
	//   32   56:iload_2         
	//   33   57:invokevirtual   #90  <Method AdPlaybackState$AdGroup AdPlaybackState$AdGroup.withAdCount(int)>
	//   34   60:aastore         
			return new AdPlaybackState(adGroupTimesUs, aadgroup, adResumePositionUs, contentDurationUs);
	//   35   61:new             #2   <Class AdPlaybackState>
	//   36   64:dup             
	//   37   65:aload_0         
	//   38   66:getfield        #52  <Field long[] adGroupTimesUs>
	//   39   69:aload           4
	//   40   71:aload_0         
	//   41   72:getfield        #57  <Field long adResumePositionUs>
	//   42   75:aload_0         
	//   43   76:getfield        #61  <Field long contentDurationUs>
	//   44   79:invokespecial   #92  <Method void AdPlaybackState(long[], AdPlaybackState$AdGroup[], long, long)>
	//   45   82:areturn         
		}
	}

	public AdPlaybackState withAdDurationsUs(long al[][])
	{
		AdGroup aadgroup[] = adGroups;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field AdPlaybackState$AdGroup[] adGroups>
	//    2    4:astore_3        
		AdGroup aadgroup1[] = adGroups;
	//    3    5:aload_0         
	//    4    6:getfield        #54  <Field AdPlaybackState$AdGroup[] adGroups>
	//    5    9:astore          4
		int i = 0;
	//    6   11:iconst_0        
	//    7   12:istore_2        
		aadgroup = (AdGroup[])Arrays.copyOf(((Object []) (aadgroup)), aadgroup1.length);
	//    8   13:aload_3         
	//    9   14:aload           4
	//   10   16:arraylength     
	//   11   17:invokestatic    #86  <Method Object[] Arrays.copyOf(Object[], int)>
	//   12   20:checkcast       #87  <Class AdPlaybackState$AdGroup[]>
	//   13   23:astore_3        
		for(; i < adGroupCount; i++)
	//*  14   24:iload_2         
	//*  15   25:aload_0         
	//*  16   26:getfield        #44  <Field int adGroupCount>
	//*  17   29:icmpge          51
			aadgroup[i] = aadgroup[i].withAdDurationsUs(al[i]);
	//   18   32:aload_3         
	//   19   33:iload_2         
	//   20   34:aload_3         
	//   21   35:iload_2         
	//   22   36:aaload          
	//   23   37:aload_1         
	//   24   38:iload_2         
	//   25   39:aaload          
	//   26   40:invokevirtual   #98  <Method AdPlaybackState$AdGroup AdPlaybackState$AdGroup.withAdDurationsUs(long[])>
	//   27   43:aastore         

	//   28   44:iload_2         
	//   29   45:iconst_1        
	//   30   46:iadd            
	//   31   47:istore_2        
	//*  32   48:goto            24
		return new AdPlaybackState(adGroupTimesUs, aadgroup, adResumePositionUs, contentDurationUs);
	//   33   51:new             #2   <Class AdPlaybackState>
	//   34   54:dup             
	//   35   55:aload_0         
	//   36   56:getfield        #52  <Field long[] adGroupTimesUs>
	//   37   59:aload_3         
	//   38   60:aload_0         
	//   39   61:getfield        #57  <Field long adResumePositionUs>
	//   40   64:aload_0         
	//   41   65:getfield        #61  <Field long contentDurationUs>
	//   42   68:invokespecial   #92  <Method void AdPlaybackState(long[], AdPlaybackState$AdGroup[], long, long)>
	//   43   71:areturn         
	}

	public AdPlaybackState withAdLoadError(int i, int j)
	{
		AdGroup aadgroup[] = (AdGroup[])Arrays.copyOf(((Object []) (adGroups)), adGroups.length);
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field AdPlaybackState$AdGroup[] adGroups>
	//    2    4:aload_0         
	//    3    5:getfield        #54  <Field AdPlaybackState$AdGroup[] adGroups>
	//    4    8:arraylength     
	//    5    9:invokestatic    #86  <Method Object[] Arrays.copyOf(Object[], int)>
	//    6   12:checkcast       #87  <Class AdPlaybackState$AdGroup[]>
	//    7   15:astore_3        
		aadgroup[i] = aadgroup[i].withAdState(4, j);
	//    8   16:aload_3         
	//    9   17:iload_1         
	//   10   18:aload_3         
	//   11   19:iload_1         
	//   12   20:aaload          
	//   13   21:iconst_4        
	//   14   22:iload_2         
	//   15   23:invokevirtual   #103 <Method AdPlaybackState$AdGroup AdPlaybackState$AdGroup.withAdState(int, int)>
	//   16   26:aastore         
		return new AdPlaybackState(adGroupTimesUs, aadgroup, adResumePositionUs, contentDurationUs);
	//   17   27:new             #2   <Class AdPlaybackState>
	//   18   30:dup             
	//   19   31:aload_0         
	//   20   32:getfield        #52  <Field long[] adGroupTimesUs>
	//   21   35:aload_3         
	//   22   36:aload_0         
	//   23   37:getfield        #57  <Field long adResumePositionUs>
	//   24   40:aload_0         
	//   25   41:getfield        #61  <Field long contentDurationUs>
	//   26   44:invokespecial   #92  <Method void AdPlaybackState(long[], AdPlaybackState$AdGroup[], long, long)>
	//   27   47:areturn         
	}

	public AdPlaybackState withAdResumePositionUs(long l)
	{
		if(adResumePositionUs == l)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field long adResumePositionUs>
	//*   2    4:lload_1         
	//*   3    5:lcmp            
	//*   4    6:ifne            11
			return this;
	//    5    9:aload_0         
	//    6   10:areturn         
		else
			return new AdPlaybackState(adGroupTimesUs, adGroups, l, contentDurationUs);
	//    7   11:new             #2   <Class AdPlaybackState>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:getfield        #52  <Field long[] adGroupTimesUs>
	//   11   19:aload_0         
	//   12   20:getfield        #54  <Field AdPlaybackState$AdGroup[] adGroups>
	//   13   23:lload_1         
	//   14   24:aload_0         
	//   15   25:getfield        #61  <Field long contentDurationUs>
	//   16   28:invokespecial   #92  <Method void AdPlaybackState(long[], AdPlaybackState$AdGroup[], long, long)>
	//   17   31:areturn         
	}

	public AdPlaybackState withAdUri(int i, int j, Uri uri)
	{
		AdGroup aadgroup[] = (AdGroup[])Arrays.copyOf(((Object []) (adGroups)), adGroups.length);
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field AdPlaybackState$AdGroup[] adGroups>
	//    2    4:aload_0         
	//    3    5:getfield        #54  <Field AdPlaybackState$AdGroup[] adGroups>
	//    4    8:arraylength     
	//    5    9:invokestatic    #86  <Method Object[] Arrays.copyOf(Object[], int)>
	//    6   12:checkcast       #87  <Class AdPlaybackState$AdGroup[]>
	//    7   15:astore          4
		aadgroup[i] = aadgroup[i].withAdUri(uri, j);
	//    8   17:aload           4
	//    9   19:iload_1         
	//   10   20:aload           4
	//   11   22:iload_1         
	//   12   23:aaload          
	//   13   24:aload_3         
	//   14   25:iload_2         
	//   15   26:invokevirtual   #110 <Method AdPlaybackState$AdGroup AdPlaybackState$AdGroup.withAdUri(Uri, int)>
	//   16   29:aastore         
		return new AdPlaybackState(adGroupTimesUs, aadgroup, adResumePositionUs, contentDurationUs);
	//   17   30:new             #2   <Class AdPlaybackState>
	//   18   33:dup             
	//   19   34:aload_0         
	//   20   35:getfield        #52  <Field long[] adGroupTimesUs>
	//   21   38:aload           4
	//   22   40:aload_0         
	//   23   41:getfield        #57  <Field long adResumePositionUs>
	//   24   44:aload_0         
	//   25   45:getfield        #61  <Field long contentDurationUs>
	//   26   48:invokespecial   #92  <Method void AdPlaybackState(long[], AdPlaybackState$AdGroup[], long, long)>
	//   27   51:areturn         
	}

	public AdPlaybackState withContentDurationUs(long l)
	{
		if(contentDurationUs == l)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field long contentDurationUs>
	//*   2    4:lload_1         
	//*   3    5:lcmp            
	//*   4    6:ifne            11
			return this;
	//    5    9:aload_0         
	//    6   10:areturn         
		else
			return new AdPlaybackState(adGroupTimesUs, adGroups, adResumePositionUs, l);
	//    7   11:new             #2   <Class AdPlaybackState>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:getfield        #52  <Field long[] adGroupTimesUs>
	//   11   19:aload_0         
	//   12   20:getfield        #54  <Field AdPlaybackState$AdGroup[] adGroups>
	//   13   23:aload_0         
	//   14   24:getfield        #57  <Field long adResumePositionUs>
	//   15   27:lload_1         
	//   16   28:invokespecial   #92  <Method void AdPlaybackState(long[], AdPlaybackState$AdGroup[], long, long)>
	//   17   31:areturn         
	}

	public AdPlaybackState withPlayedAd(int i, int j)
	{
		AdGroup aadgroup[] = (AdGroup[])Arrays.copyOf(((Object []) (adGroups)), adGroups.length);
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field AdPlaybackState$AdGroup[] adGroups>
	//    2    4:aload_0         
	//    3    5:getfield        #54  <Field AdPlaybackState$AdGroup[] adGroups>
	//    4    8:arraylength     
	//    5    9:invokestatic    #86  <Method Object[] Arrays.copyOf(Object[], int)>
	//    6   12:checkcast       #87  <Class AdPlaybackState$AdGroup[]>
	//    7   15:astore_3        
		aadgroup[i] = aadgroup[i].withAdState(3, j);
	//    8   16:aload_3         
	//    9   17:iload_1         
	//   10   18:aload_3         
	//   11   19:iload_1         
	//   12   20:aaload          
	//   13   21:iconst_3        
	//   14   22:iload_2         
	//   15   23:invokevirtual   #103 <Method AdPlaybackState$AdGroup AdPlaybackState$AdGroup.withAdState(int, int)>
	//   16   26:aastore         
		return new AdPlaybackState(adGroupTimesUs, aadgroup, adResumePositionUs, contentDurationUs);
	//   17   27:new             #2   <Class AdPlaybackState>
	//   18   30:dup             
	//   19   31:aload_0         
	//   20   32:getfield        #52  <Field long[] adGroupTimesUs>
	//   21   35:aload_3         
	//   22   36:aload_0         
	//   23   37:getfield        #57  <Field long adResumePositionUs>
	//   24   40:aload_0         
	//   25   41:getfield        #61  <Field long contentDurationUs>
	//   26   44:invokespecial   #92  <Method void AdPlaybackState(long[], AdPlaybackState$AdGroup[], long, long)>
	//   27   47:areturn         
	}

	public AdPlaybackState withSkippedAd(int i, int j)
	{
		AdGroup aadgroup[] = (AdGroup[])Arrays.copyOf(((Object []) (adGroups)), adGroups.length);
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field AdPlaybackState$AdGroup[] adGroups>
	//    2    4:aload_0         
	//    3    5:getfield        #54  <Field AdPlaybackState$AdGroup[] adGroups>
	//    4    8:arraylength     
	//    5    9:invokestatic    #86  <Method Object[] Arrays.copyOf(Object[], int)>
	//    6   12:checkcast       #87  <Class AdPlaybackState$AdGroup[]>
	//    7   15:astore_3        
		aadgroup[i] = aadgroup[i].withAdState(2, j);
	//    8   16:aload_3         
	//    9   17:iload_1         
	//   10   18:aload_3         
	//   11   19:iload_1         
	//   12   20:aaload          
	//   13   21:iconst_2        
	//   14   22:iload_2         
	//   15   23:invokevirtual   #103 <Method AdPlaybackState$AdGroup AdPlaybackState$AdGroup.withAdState(int, int)>
	//   16   26:aastore         
		return new AdPlaybackState(adGroupTimesUs, aadgroup, adResumePositionUs, contentDurationUs);
	//   17   27:new             #2   <Class AdPlaybackState>
	//   18   30:dup             
	//   19   31:aload_0         
	//   20   32:getfield        #52  <Field long[] adGroupTimesUs>
	//   21   35:aload_3         
	//   22   36:aload_0         
	//   23   37:getfield        #57  <Field long adResumePositionUs>
	//   24   40:aload_0         
	//   25   41:getfield        #61  <Field long contentDurationUs>
	//   26   44:invokespecial   #92  <Method void AdPlaybackState(long[], AdPlaybackState$AdGroup[], long, long)>
	//   27   47:areturn         
	}

	public AdPlaybackState withSkippedAdGroup(int i)
	{
		AdGroup aadgroup[] = (AdGroup[])Arrays.copyOf(((Object []) (adGroups)), adGroups.length);
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field AdPlaybackState$AdGroup[] adGroups>
	//    2    4:aload_0         
	//    3    5:getfield        #54  <Field AdPlaybackState$AdGroup[] adGroups>
	//    4    8:arraylength     
	//    5    9:invokestatic    #86  <Method Object[] Arrays.copyOf(Object[], int)>
	//    6   12:checkcast       #87  <Class AdPlaybackState$AdGroup[]>
	//    7   15:astore_2        
		aadgroup[i] = aadgroup[i].withAllAdsSkipped();
	//    8   16:aload_2         
	//    9   17:iload_1         
	//   10   18:aload_2         
	//   11   19:iload_1         
	//   12   20:aaload          
	//   13   21:invokevirtual   #119 <Method AdPlaybackState$AdGroup AdPlaybackState$AdGroup.withAllAdsSkipped()>
	//   14   24:aastore         
		return new AdPlaybackState(adGroupTimesUs, aadgroup, adResumePositionUs, contentDurationUs);
	//   15   25:new             #2   <Class AdPlaybackState>
	//   16   28:dup             
	//   17   29:aload_0         
	//   18   30:getfield        #52  <Field long[] adGroupTimesUs>
	//   19   33:aload_2         
	//   20   34:aload_0         
	//   21   35:getfield        #57  <Field long adResumePositionUs>
	//   22   38:aload_0         
	//   23   39:getfield        #61  <Field long contentDurationUs>
	//   24   42:invokespecial   #92  <Method void AdPlaybackState(long[], AdPlaybackState$AdGroup[], long, long)>
	//   25   45:areturn         
	}

	public static final int AD_STATE_AVAILABLE = 1;
	public static final int AD_STATE_ERROR = 4;
	public static final int AD_STATE_PLAYED = 3;
	public static final int AD_STATE_SKIPPED = 2;
	public static final int AD_STATE_UNAVAILABLE = 0;
	public static final AdPlaybackState NONE = new AdPlaybackState(new long[0]);
	public final int adGroupCount;
	public final long adGroupTimesUs[];
	public final AdGroup adGroups[];
	public final long adResumePositionUs;
	public final long contentDurationUs;

	static 
	{
	//    0    0:new             #2   <Class AdPlaybackState>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:newarray        long[]
	//    4    7:invokespecial   #37  <Method void AdPlaybackState(long[])>
	//    5   10:putstatic       #39  <Field AdPlaybackState NONE>
	//*   6   13:return          
	}
}
