// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.graphics;

import android.graphics.Color;
import android.support.v4.graphics.ColorUtils;
import android.util.TimingLogger;
import java.util.*;

final class ColorCutQuantizer
{
	private class Vbox
	{

		final boolean canSplit()
		{
			return getColorCount() > 1;
		//    0    0:aload_0         
		//    1    1:invokevirtual   #40  <Method int getColorCount()>
		//    2    4:iconst_1        
		//    3    5:icmple          10
		//    4    8:iconst_1        
		//    5    9:ireturn         
		//    6   10:iconst_0        
		//    7   11:ireturn         
		}

		final int findSplitPoint()
		{
			int i = getLongestColorDimension();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #44  <Method int getLongestColorDimension()>
		//    2    4:istore_1        
			int ai[] = mColors;
		//    3    5:aload_0         
		//    4    6:getfield        #23  <Field ColorCutQuantizer this$0>
		//    5    9:getfield        #48  <Field int[] ColorCutQuantizer.mColors>
		//    6   12:astore          4
			int ai1[] = mHistogram;
		//    7   14:aload_0         
		//    8   15:getfield        #23  <Field ColorCutQuantizer this$0>
		//    9   18:getfield        #51  <Field int[] ColorCutQuantizer.mHistogram>
		//   10   21:astore          5
			ColorCutQuantizer.modifySignificantOctet(ai, i, mLowerIndex, mUpperIndex);
		//   11   23:aload           4
		//   12   25:iload_1         
		//   13   26:aload_0         
		//   14   27:getfield        #28  <Field int mLowerIndex>
		//   15   30:aload_0         
		//   16   31:getfield        #30  <Field int mUpperIndex>
		//   17   34:invokestatic    #55  <Method void ColorCutQuantizer.modifySignificantOctet(int[], int, int, int)>
			Arrays.sort(ai, mLowerIndex, mUpperIndex + 1);
		//   18   37:aload           4
		//   19   39:aload_0         
		//   20   40:getfield        #28  <Field int mLowerIndex>
		//   21   43:aload_0         
		//   22   44:getfield        #30  <Field int mUpperIndex>
		//   23   47:iconst_1        
		//   24   48:iadd            
		//   25   49:invokestatic    #61  <Method void Arrays.sort(int[], int, int)>
			ColorCutQuantizer.modifySignificantOctet(ai, i, mLowerIndex, mUpperIndex);
		//   26   52:aload           4
		//   27   54:iload_1         
		//   28   55:aload_0         
		//   29   56:getfield        #28  <Field int mLowerIndex>
		//   30   59:aload_0         
		//   31   60:getfield        #30  <Field int mUpperIndex>
		//   32   63:invokestatic    #55  <Method void ColorCutQuantizer.modifySignificantOctet(int[], int, int, int)>
			int k = mPopulation / 2;
		//   33   66:aload_0         
		//   34   67:getfield        #63  <Field int mPopulation>
		//   35   70:iconst_2        
		//   36   71:idiv            
		//   37   72:istore_3        
			i = mLowerIndex;
		//   38   73:aload_0         
		//   39   74:getfield        #28  <Field int mLowerIndex>
		//   40   77:istore_1        
			int j = 0;
		//   41   78:iconst_0        
		//   42   79:istore_2        
			for(; i <= mUpperIndex; i++)
		//*  43   80:iload_1         
		//*  44   81:aload_0         
		//*  45   82:getfield        #30  <Field int mUpperIndex>
		//*  46   85:icmpgt          121
			{
				j += ai1[ai[i]];
		//   47   88:iload_2         
		//   48   89:aload           5
		//   49   91:aload           4
		//   50   93:iload_1         
		//   51   94:iaload          
		//   52   95:iaload          
		//   53   96:iadd            
		//   54   97:istore_2        
				if(j >= k)
		//*  55   98:iload_2         
		//*  56   99:iload_3         
		//*  57  100:icmplt          114
					return Math.min(mUpperIndex - 1, i);
		//   58  103:aload_0         
		//   59  104:getfield        #30  <Field int mUpperIndex>
		//   60  107:iconst_1        
		//   61  108:isub            
		//   62  109:iload_1         
		//   63  110:invokestatic    #69  <Method int Math.min(int, int)>
		//   64  113:ireturn         
			}

		//   65  114:iload_1         
		//   66  115:iconst_1        
		//   67  116:iadd            
		//   68  117:istore_1        
		//*  69  118:goto            80
			return mLowerIndex;
		//   70  121:aload_0         
		//   71  122:getfield        #28  <Field int mLowerIndex>
		//   72  125:ireturn         
		}

		final void fitBox()
		{
			int ai[] = mColors;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field ColorCutQuantizer this$0>
		//    2    4:getfield        #48  <Field int[] ColorCutQuantizer.mColors>
		//    3    7:astore          13
			int ai1[] = mHistogram;
		//    4    9:aload_0         
		//    5   10:getfield        #23  <Field ColorCutQuantizer this$0>
		//    6   13:getfield        #51  <Field int[] ColorCutQuantizer.mHistogram>
		//    7   16:astore          14
			int l = mLowerIndex;
		//    8   18:aload_0         
		//    9   19:getfield        #28  <Field int mLowerIndex>
		//   10   22:istore          4
			int l1 = 0x7fffffff;
		//   11   24:ldc1            #70  <Int 0x7fffffff>
		//   12   26:istore          8
			int i2 = 0x80000000;
		//   13   28:ldc1            #71  <Int 0x80000000>
		//   14   30:istore          9
			int j1 = 0;
		//   15   32:iconst_0        
		//   16   33:istore          6
			int k = 0x7fffffff;
		//   17   35:ldc1            #70  <Int 0x7fffffff>
		//   18   37:istore_3        
			int i = k;
		//   19   38:iload_3         
		//   20   39:istore_1        
			int i1 = 0x80000000;
		//   21   40:ldc1            #71  <Int 0x80000000>
		//   22   42:istore          5
			int j;
			int k2;
			for(j = i1; l <= mUpperIndex; j = k2)
		//*  23   44:iload           5
		//*  24   46:istore_2        
		//*  25   47:iload           4
		//*  26   49:aload_0         
		//*  27   50:getfield        #30  <Field int mUpperIndex>
		//*  28   53:icmpgt          209
			{
				int k1 = ai[l];
		//   29   56:aload           13
		//   30   58:iload           4
		//   31   60:iaload          
		//   32   61:istore          7
				int l2 = j1 + ai1[k1];
		//   33   63:iload           6
		//   34   65:aload           14
		//   35   67:iload           7
		//   36   69:iaload          
		//   37   70:iadd            
		//   38   71:istore          12
				int j2 = ColorCutQuantizer.quantizedRed(k1);
		//   39   73:iload           7
		//   40   75:invokestatic    #75  <Method int ColorCutQuantizer.quantizedRed(int)>
		//   41   78:istore          10
				k2 = ColorCutQuantizer.quantizedGreen(k1);
		//   42   80:iload           7
		//   43   82:invokestatic    #78  <Method int ColorCutQuantizer.quantizedGreen(int)>
		//   44   85:istore          11
				k1 = ColorCutQuantizer.quantizedBlue(k1);
		//   45   87:iload           7
		//   46   89:invokestatic    #81  <Method int ColorCutQuantizer.quantizedBlue(int)>
		//   47   92:istore          7
				j1 = i2;
		//   48   94:iload           9
		//   49   96:istore          6
				if(j2 > i2)
		//*  50   98:iload           10
		//*  51  100:iload           9
		//*  52  102:icmple          109
					j1 = j2;
		//   53  105:iload           10
		//   54  107:istore          6
				i2 = l1;
		//   55  109:iload           8
		//   56  111:istore          9
				if(j2 < l1)
		//*  57  113:iload           10
		//*  58  115:iload           8
		//*  59  117:icmpge          124
					i2 = j2;
		//   60  120:iload           10
		//   61  122:istore          9
				j2 = i1;
		//   62  124:iload           5
		//   63  126:istore          10
				if(k2 > i1)
		//*  64  128:iload           11
		//*  65  130:iload           5
		//*  66  132:icmple          139
					j2 = k2;
		//   67  135:iload           11
		//   68  137:istore          10
				i1 = k;
		//   69  139:iload_3         
		//   70  140:istore          5
				if(k2 < k)
		//*  71  142:iload           11
		//*  72  144:iload_3         
		//*  73  145:icmpge          152
					i1 = k2;
		//   74  148:iload           11
		//   75  150:istore          5
				k2 = j;
		//   76  152:iload_2         
		//   77  153:istore          11
				if(k1 > j)
		//*  78  155:iload           7
		//*  79  157:iload_2         
		//*  80  158:icmple          165
					k2 = k1;
		//   81  161:iload           7
		//   82  163:istore          11
				j = i;
		//   83  165:iload_1         
		//   84  166:istore_2        
				if(k1 < i)
		//*  85  167:iload           7
		//*  86  169:iload_1         
		//*  87  170:icmpge          176
					j = k1;
		//   88  173:iload           7
		//   89  175:istore_2        
				l++;
		//   90  176:iload           4
		//   91  178:iconst_1        
		//   92  179:iadd            
		//   93  180:istore          4
				l1 = i2;
		//   94  182:iload           9
		//   95  184:istore          8
				i2 = j1;
		//   96  186:iload           6
		//   97  188:istore          9
				j1 = l2;
		//   98  190:iload           12
		//   99  192:istore          6
				k = i1;
		//  100  194:iload           5
		//  101  196:istore_3        
				i1 = j2;
		//  102  197:iload           10
		//  103  199:istore          5
				i = j;
		//  104  201:iload_2         
		//  105  202:istore_1        
			}

		//  106  203:iload           11
		//  107  205:istore_2        
		//* 108  206:goto            47
			mMinRed = l1;
		//  109  209:aload_0         
		//  110  210:iload           8
		//  111  212:putfield        #83  <Field int mMinRed>
			mMaxRed = i2;
		//  112  215:aload_0         
		//  113  216:iload           9
		//  114  218:putfield        #85  <Field int mMaxRed>
			mMinGreen = k;
		//  115  221:aload_0         
		//  116  222:iload_3         
		//  117  223:putfield        #87  <Field int mMinGreen>
			mMaxGreen = i1;
		//  118  226:aload_0         
		//  119  227:iload           5
		//  120  229:putfield        #89  <Field int mMaxGreen>
			mMinBlue = i;
		//  121  232:aload_0         
		//  122  233:iload_1         
		//  123  234:putfield        #91  <Field int mMinBlue>
			mMaxBlue = j;
		//  124  237:aload_0         
		//  125  238:iload_2         
		//  126  239:putfield        #93  <Field int mMaxBlue>
			mPopulation = j1;
		//  127  242:aload_0         
		//  128  243:iload           6
		//  129  245:putfield        #63  <Field int mPopulation>
		//  130  248:return          
		}

		final Palette.Swatch getAverageColor()
		{
			int ai[] = mColors;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field ColorCutQuantizer this$0>
		//    2    4:getfield        #48  <Field int[] ColorCutQuantizer.mColors>
		//    3    7:astore          10
			int ai1[] = mHistogram;
		//    4    9:aload_0         
		//    5   10:getfield        #23  <Field ColorCutQuantizer this$0>
		//    6   13:getfield        #51  <Field int[] ColorCutQuantizer.mHistogram>
		//    7   16:astore          11
			int l = mLowerIndex;
		//    8   18:aload_0         
		//    9   19:getfield        #28  <Field int mLowerIndex>
		//   10   22:istore          6
			int i1 = 0;
		//   11   24:iconst_0        
		//   12   25:istore          7
			int k = 0;
		//   13   27:iconst_0        
		//   14   28:istore          5
			int i = k;
		//   15   30:iload           5
		//   16   32:istore_3        
			int j = i;
		//   17   33:iload_3         
		//   18   34:istore          4
			for(; l <= mUpperIndex; l++)
		//*  19   36:iload           6
		//*  20   38:aload_0         
		//*  21   39:getfield        #30  <Field int mUpperIndex>
		//*  22   42:icmpgt          112
			{
				int j1 = ai[l];
		//   23   45:aload           10
		//   24   47:iload           6
		//   25   49:iaload          
		//   26   50:istore          8
				int k1 = ai1[j1];
		//   27   52:aload           11
		//   28   54:iload           8
		//   29   56:iaload          
		//   30   57:istore          9
				i1 += k1;
		//   31   59:iload           7
		//   32   61:iload           9
		//   33   63:iadd            
		//   34   64:istore          7
				k += ColorCutQuantizer.quantizedRed(j1) * k1;
		//   35   66:iload           5
		//   36   68:iload           8
		//   37   70:invokestatic    #75  <Method int ColorCutQuantizer.quantizedRed(int)>
		//   38   73:iload           9
		//   39   75:imul            
		//   40   76:iadd            
		//   41   77:istore          5
				i += ColorCutQuantizer.quantizedGreen(j1) * k1;
		//   42   79:iload_3         
		//   43   80:iload           8
		//   44   82:invokestatic    #78  <Method int ColorCutQuantizer.quantizedGreen(int)>
		//   45   85:iload           9
		//   46   87:imul            
		//   47   88:iadd            
		//   48   89:istore_3        
				j += k1 * ColorCutQuantizer.quantizedBlue(j1);
		//   49   90:iload           4
		//   50   92:iload           9
		//   51   94:iload           8
		//   52   96:invokestatic    #81  <Method int ColorCutQuantizer.quantizedBlue(int)>
		//   53   99:imul            
		//   54  100:iadd            
		//   55  101:istore          4
			}

		//   56  103:iload           6
		//   57  105:iconst_1        
		//   58  106:iadd            
		//   59  107:istore          6
		//*  60  109:goto            36
			float f = k;
		//   61  112:iload           5
		//   62  114:i2f             
		//   63  115:fstore_1        
			float f1 = i1;
		//   64  116:iload           7
		//   65  118:i2f             
		//   66  119:fstore_2        
			return new Palette.Swatch(ColorCutQuantizer.approximateToRgb888(Math.round(f / f1), Math.round((float)i / f1), Math.round((float)j / f1)), i1);
		//   67  120:new             #97  <Class Palette$Swatch>
		//   68  123:dup             
		//   69  124:fload_1         
		//   70  125:fload_2         
		//   71  126:fdiv            
		//   72  127:invokestatic    #101 <Method int Math.round(float)>
		//   73  130:iload_3         
		//   74  131:i2f             
		//   75  132:fload_2         
		//   76  133:fdiv            
		//   77  134:invokestatic    #101 <Method int Math.round(float)>
		//   78  137:iload           4
		//   79  139:i2f             
		//   80  140:fload_2         
		//   81  141:fdiv            
		//   82  142:invokestatic    #101 <Method int Math.round(float)>
		//   83  145:invokestatic    #105 <Method int ColorCutQuantizer.approximateToRgb888(int, int, int)>
		//   84  148:iload           7
		//   85  150:invokespecial   #108 <Method void Palette$Swatch(int, int)>
		//   86  153:areturn         
		}

		final int getColorCount()
		{
			return (1 + mUpperIndex) - mLowerIndex;
		//    0    0:iconst_1        
		//    1    1:aload_0         
		//    2    2:getfield        #30  <Field int mUpperIndex>
		//    3    5:iadd            
		//    4    6:aload_0         
		//    5    7:getfield        #28  <Field int mLowerIndex>
		//    6   10:isub            
		//    7   11:ireturn         
		}

		final int getLongestColorDimension()
		{
			int i = mMaxRed - mMinRed;
		//    0    0:aload_0         
		//    1    1:getfield        #85  <Field int mMaxRed>
		//    2    4:aload_0         
		//    3    5:getfield        #83  <Field int mMinRed>
		//    4    8:isub            
		//    5    9:istore_1        
			int j = mMaxGreen - mMinGreen;
		//    6   10:aload_0         
		//    7   11:getfield        #89  <Field int mMaxGreen>
		//    8   14:aload_0         
		//    9   15:getfield        #87  <Field int mMinGreen>
		//   10   18:isub            
		//   11   19:istore_2        
			int k = mMaxBlue - mMinBlue;
		//   12   20:aload_0         
		//   13   21:getfield        #93  <Field int mMaxBlue>
		//   14   24:aload_0         
		//   15   25:getfield        #91  <Field int mMinBlue>
		//   16   28:isub            
		//   17   29:istore_3        
			if(i >= j && i >= k)
		//*  18   30:iload_1         
		//*  19   31:iload_2         
		//*  20   32:icmplt          43
		//*  21   35:iload_1         
		//*  22   36:iload_3         
		//*  23   37:icmplt          43
				return -3;
		//   24   40:bipush          -3
		//   25   42:ireturn         
			return j < i || j < k ? -1 : -2;
		//   26   43:iload_2         
		//   27   44:iload_1         
		//   28   45:icmplt          56
		//   29   48:iload_2         
		//   30   49:iload_3         
		//   31   50:icmplt          56
		//   32   53:bipush          -2
		//   33   55:ireturn         
		//   34   56:iconst_m1       
		//   35   57:ireturn         
		}

		final int getVolume()
		{
			return ((mMaxRed - mMinRed) + 1) * ((mMaxGreen - mMinGreen) + 1) * ((mMaxBlue - mMinBlue) + 1);
		//    0    0:aload_0         
		//    1    1:getfield        #85  <Field int mMaxRed>
		//    2    4:aload_0         
		//    3    5:getfield        #83  <Field int mMinRed>
		//    4    8:isub            
		//    5    9:iconst_1        
		//    6   10:iadd            
		//    7   11:aload_0         
		//    8   12:getfield        #89  <Field int mMaxGreen>
		//    9   15:aload_0         
		//   10   16:getfield        #87  <Field int mMinGreen>
		//   11   19:isub            
		//   12   20:iconst_1        
		//   13   21:iadd            
		//   14   22:imul            
		//   15   23:aload_0         
		//   16   24:getfield        #93  <Field int mMaxBlue>
		//   17   27:aload_0         
		//   18   28:getfield        #91  <Field int mMinBlue>
		//   19   31:isub            
		//   20   32:iconst_1        
		//   21   33:iadd            
		//   22   34:imul            
		//   23   35:ireturn         
		}

		final Vbox splitBox()
		{
			if(!canSplit())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #113 <Method boolean canSplit()>
		//*   2    4:ifne            17
			{
				throw new IllegalStateException("Can not split a box with only 1 color");
		//    3    7:new             #115 <Class IllegalStateException>
		//    4   10:dup             
		//    5   11:ldc1            #117 <String "Can not split a box with only 1 color">
		//    6   13:invokespecial   #120 <Method void IllegalStateException(String)>
		//    7   16:athrow          
			} else
			{
				int i = findSplitPoint();
		//    8   17:aload_0         
		//    9   18:invokevirtual   #122 <Method int findSplitPoint()>
		//   10   21:istore_1        
				Vbox vbox = new Vbox(i + 1, mUpperIndex);
		//   11   22:new             #2   <Class ColorCutQuantizer$Vbox>
		//   12   25:dup             
		//   13   26:aload_0         
		//   14   27:getfield        #23  <Field ColorCutQuantizer this$0>
		//   15   30:iload_1         
		//   16   31:iconst_1        
		//   17   32:iadd            
		//   18   33:aload_0         
		//   19   34:getfield        #30  <Field int mUpperIndex>
		//   20   37:invokespecial   #124 <Method void ColorCutQuantizer$Vbox(ColorCutQuantizer, int, int)>
		//   21   40:astore_2        
				mUpperIndex = i;
		//   22   41:aload_0         
		//   23   42:iload_1         
		//   24   43:putfield        #30  <Field int mUpperIndex>
				fitBox();
		//   25   46:aload_0         
		//   26   47:invokevirtual   #33  <Method void fitBox()>
				return vbox;
		//   27   50:aload_2         
		//   28   51:areturn         
			}
		}

		private int mLowerIndex;
		private int mMaxBlue;
		private int mMaxGreen;
		private int mMaxRed;
		private int mMinBlue;
		private int mMinGreen;
		private int mMinRed;
		private int mPopulation;
		private int mUpperIndex;
		final ColorCutQuantizer this$0;

		Vbox(int i, int j)
		{
			this$0 = ColorCutQuantizer.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #23  <Field ColorCutQuantizer this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #26  <Method void Object()>
			mLowerIndex = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #28  <Field int mLowerIndex>
			mUpperIndex = j;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #30  <Field int mUpperIndex>
			fitBox();
		//   11   19:aload_0         
		//   12   20:invokevirtual   #33  <Method void fitBox()>
		//   13   23:return          
		}
	}


	ColorCutQuantizer(int ai[], int i, Palette.Filter afilter[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:newarray        float[]
	//    5    8:putfield        #54  <Field float[] mTempHsl>
	//    6   11:aload_0         
	//    7   12:aconst_null     
	//    8   13:putfield        #56  <Field TimingLogger mTimingLogger>
		mFilters = afilter;
	//    9   16:aload_0         
	//   10   17:aload_3         
	//   11   18:putfield        #58  <Field Palette$Filter[] mFilters>
		afilter = ((Palette.Filter []) (new int[32768]));
	//   12   21:ldc1            #59  <Int 32768>
	//   13   23:newarray        int[]
	//   14   25:astore_3        
		mHistogram = ((int []) (afilter));
	//   15   26:aload_0         
	//   16   27:aload_3         
	//   17   28:putfield        #61  <Field int[] mHistogram>
		boolean flag = false;
	//   18   31:iconst_0        
	//   19   32:istore          8
		for(int j = 0; j < ai.length; j++)
	//*  20   34:iconst_0        
	//*  21   35:istore          4
	//*  22   37:iload           4
	//*  23   39:aload_1         
	//*  24   40:arraylength     
	//*  25   41:icmpge          78
		{
			int i1 = quantizeFromRgb888(ai[j]);
	//   26   44:aload_1         
	//   27   45:iload           4
	//   28   47:iaload          
	//   29   48:invokestatic    #65  <Method int quantizeFromRgb888(int)>
	//   30   51:istore          5
			ai[j] = i1;
	//   31   53:aload_1         
	//   32   54:iload           4
	//   33   56:iload           5
	//   34   58:iastore         
			afilter[i1] = ((Palette.Filter) (afilter[i1] + 1));
	//   35   59:aload_3         
	//   36   60:iload           5
	//   37   62:aload_3         
	//   38   63:iload           5
	//   39   65:iaload          
	//   40   66:iconst_1        
	//   41   67:iadd            
	//   42   68:iastore         
		}

	//   43   69:iload           4
	//   44   71:iconst_1        
	//   45   72:iadd            
	//   46   73:istore          4
	//*  47   75:goto            37
		int j1 = 0;
	//   48   78:iconst_0        
	//   49   79:istore          5
		int k;
		int l1;
		for(k = j1; j1 < afilter.length; k = l1)
	//*  50   81:iload           5
	//*  51   83:istore          4
	//*  52   85:iload           5
	//*  53   87:aload_3         
	//*  54   88:arraylength     
	//*  55   89:icmpge          143
		{
			if(afilter[j1] > 0 && shouldIgnoreColor(j1))
	//*  56   92:aload_3         
	//*  57   93:iload           5
	//*  58   95:iaload          
	//*  59   96:ifle            113
	//*  60   99:aload_0         
	//*  61  100:iload           5
	//*  62  102:invokespecial   #69  <Method boolean shouldIgnoreColor(int)>
	//*  63  105:ifeq            113
				afilter[j1] = 0;
	//   64  108:aload_3         
	//   65  109:iload           5
	//   66  111:iconst_0        
	//   67  112:iastore         
			l1 = k;
	//   68  113:iload           4
	//   69  115:istore          6
			if(afilter[j1] > 0)
	//*  70  117:aload_3         
	//*  71  118:iload           5
	//*  72  120:iaload          
	//*  73  121:ifle            130
				l1 = k + 1;
	//   74  124:iload           4
	//   75  126:iconst_1        
	//   76  127:iadd            
	//   77  128:istore          6
			j1++;
	//   78  130:iload           5
	//   79  132:iconst_1        
	//   80  133:iadd            
	//   81  134:istore          5
		}

	//   82  136:iload           6
	//   83  138:istore          4
	//*  84  140:goto            85
		ai = new int[k];
	//   85  143:iload           4
	//   86  145:newarray        int[]
	//   87  147:astore_1        
		mColors = ai;
	//   88  148:aload_0         
	//   89  149:aload_1         
	//   90  150:putfield        #71  <Field int[] mColors>
		j1 = 0;
	//   91  153:iconst_0        
	//   92  154:istore          5
		int j2;
		for(int i2 = j1; j1 < afilter.length; i2 = j2)
	//*  93  156:iload           5
	//*  94  158:istore          6
	//*  95  160:iload           5
	//*  96  162:aload_3         
	//*  97  163:arraylength     
	//*  98  164:icmpge          203
		{
			j2 = i2;
	//   99  167:iload           6
	//  100  169:istore          7
			if(afilter[j1] > 0)
	//* 101  171:aload_3         
	//* 102  172:iload           5
	//* 103  174:iaload          
	//* 104  175:ifle            190
			{
				ai[i2] = j1;
	//  105  178:aload_1         
	//  106  179:iload           6
	//  107  181:iload           5
	//  108  183:iastore         
				j2 = i2 + 1;
	//  109  184:iload           6
	//  110  186:iconst_1        
	//  111  187:iadd            
	//  112  188:istore          7
			}
			j1++;
	//  113  190:iload           5
	//  114  192:iconst_1        
	//  115  193:iadd            
	//  116  194:istore          5
		}

	//  117  196:iload           7
	//  118  198:istore          6
	//* 119  200:goto            160
		if(k <= i)
	//* 120  203:iload           4
	//* 121  205:iload_2         
	//* 122  206:icmpgt          271
		{
			mQuantizedColors = ((List) (new ArrayList()));
	//  123  209:aload_0         
	//  124  210:new             #73  <Class ArrayList>
	//  125  213:dup             
	//  126  214:invokespecial   #74  <Method void ArrayList()>
	//  127  217:putfield        #76  <Field List mQuantizedColors>
			int l = ai.length;
	//  128  220:aload_1         
	//  129  221:arraylength     
	//  130  222:istore          4
			for(i = ((int) (flag)); i < l; i++)
	//* 131  224:iload           8
	//* 132  226:istore_2        
	//* 133  227:iload_2         
	//* 134  228:iload           4
	//* 135  230:icmpge          280
			{
				int k1 = ai[i];
	//  136  233:aload_1         
	//  137  234:iload_2         
	//  138  235:iaload          
	//  139  236:istore          5
				mQuantizedColors.add(((Object) (new Palette.Swatch(approximateToRgb888(k1), ((int) (afilter[k1]))))));
	//  140  238:aload_0         
	//  141  239:getfield        #76  <Field List mQuantizedColors>
	//  142  242:new             #78  <Class Palette$Swatch>
	//  143  245:dup             
	//  144  246:iload           5
	//  145  248:invokestatic    #81  <Method int approximateToRgb888(int)>
	//  146  251:aload_3         
	//  147  252:iload           5
	//  148  254:iaload          
	//  149  255:invokespecial   #84  <Method void Palette$Swatch(int, int)>
	//  150  258:invokeinterface #90  <Method boolean List.add(Object)>
	//  151  263:pop             
			}

	//  152  264:iload_2         
	//  153  265:iconst_1        
	//  154  266:iadd            
	//  155  267:istore_2        
		} else
	//* 156  268:goto            227
		{
			mQuantizedColors = quantizePixels(i);
	//  157  271:aload_0         
	//  158  272:aload_0         
	//  159  273:iload_2         
	//  160  274:invokespecial   #94  <Method List quantizePixels(int)>
	//  161  277:putfield        #76  <Field List mQuantizedColors>
		}
	//  162  280:return          
	}

	private static int approximateToRgb888(int i)
	{
		return approximateToRgb888(quantizedRed(i), quantizedGreen(i), quantizedBlue(i));
	//    0    0:iload_0         
	//    1    1:invokestatic    #97  <Method int quantizedRed(int)>
	//    2    4:iload_0         
	//    3    5:invokestatic    #100 <Method int quantizedGreen(int)>
	//    4    8:iload_0         
	//    5    9:invokestatic    #103 <Method int quantizedBlue(int)>
	//    6   12:invokestatic    #106 <Method int approximateToRgb888(int, int, int)>
	//    7   15:ireturn         
	}

	static int approximateToRgb888(int i, int j, int k)
	{
		return Color.rgb(modifyWordWidth(i, 5, 8), modifyWordWidth(j, 5, 8), modifyWordWidth(k, 5, 8));
	//    0    0:iload_0         
	//    1    1:iconst_5        
	//    2    2:bipush          8
	//    3    4:invokestatic    #109 <Method int modifyWordWidth(int, int, int)>
	//    4    7:iload_1         
	//    5    8:iconst_5        
	//    6    9:bipush          8
	//    7   11:invokestatic    #109 <Method int modifyWordWidth(int, int, int)>
	//    8   14:iload_2         
	//    9   15:iconst_5        
	//   10   16:bipush          8
	//   11   18:invokestatic    #109 <Method int modifyWordWidth(int, int, int)>
	//   12   21:invokestatic    #114 <Method int Color.rgb(int, int, int)>
	//   13   24:ireturn         
	}

	private List generateAverageColors(Collection collection)
	{
		ArrayList arraylist = new ArrayList(collection.size());
	//    0    0:new             #73  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokeinterface #122 <Method int Collection.size()>
	//    4   10:invokespecial   #125 <Method void ArrayList(int)>
	//    5   13:astore_2        
		collection = ((Collection) (collection.iterator()));
	//    6   14:aload_1         
	//    7   15:invokeinterface #129 <Method Iterator Collection.iterator()>
	//    8   20:astore_1        
		do
		{
			if(!((Iterator) (collection)).hasNext())
				break;
	//    9   21:aload_1         
	//   10   22:invokeinterface #135 <Method boolean Iterator.hasNext()>
	//   11   27:ifeq            60
			Palette.Swatch swatch = ((Vbox)((Iterator) (collection)).next()).getAverageColor();
	//   12   30:aload_1         
	//   13   31:invokeinterface #139 <Method Object Iterator.next()>
	//   14   36:checkcast       #8   <Class ColorCutQuantizer$Vbox>
	//   15   39:invokevirtual   #143 <Method Palette$Swatch ColorCutQuantizer$Vbox.getAverageColor()>
	//   16   42:astore_3        
			if(!shouldIgnoreColor(swatch))
	//*  17   43:aload_0         
	//*  18   44:aload_3         
	//*  19   45:invokespecial   #146 <Method boolean shouldIgnoreColor(Palette$Swatch)>
	//*  20   48:ifne            21
				arraylist.add(((Object) (swatch)));
	//   21   51:aload_2         
	//   22   52:aload_3         
	//   23   53:invokevirtual   #147 <Method boolean ArrayList.add(Object)>
	//   24   56:pop             
		} while(true);
	//   25   57:goto            21
		return ((List) (arraylist));
	//   26   60:aload_2         
	//   27   61:areturn         
	}

	static void modifySignificantOctet(int ai[], int i, int j, int k)
	{
		int l = j;
	//    0    0:iload_2         
	//    1    1:istore          4
		switch(i)
	//*   2    3:iload_1         
		{
	//*   3    4:tableswitch     -3 -1: default 32
	//	               -3 128
	//	               -2 82
	//	               -1 33
		default:
			return;
	//    4   32:return          

		case -3: 
			break;

		case -1: 
			for(; l <= k; l++)
	//*   5   33:iload           4
	//*   6   35:iload_3         
	//*   7   36:icmpgt          128
			{
				i = ai[l];
	//    8   39:aload_0         
	//    9   40:iload           4
	//   10   42:iaload          
	//   11   43:istore_1        
				j = quantizedBlue(i);
	//   12   44:iload_1         
	//   13   45:invokestatic    #103 <Method int quantizedBlue(int)>
	//   14   48:istore_2        
				int j1 = quantizedGreen(i);
	//   15   49:iload_1         
	//   16   50:invokestatic    #100 <Method int quantizedGreen(int)>
	//   17   53:istore          5
				ai[l] = quantizedRed(i) | (j << 10 | j1 << 5);
	//   18   55:aload_0         
	//   19   56:iload           4
	//   20   58:iload_1         
	//   21   59:invokestatic    #97  <Method int quantizedRed(int)>
	//   22   62:iload_2         
	//   23   63:bipush          10
	//   24   65:ishl            
	//   25   66:iload           5
	//   26   68:iconst_5        
	//   27   69:ishl            
	//   28   70:ior             
	//   29   71:ior             
	//   30   72:iastore         
			}

	//   31   73:iload           4
	//   32   75:iconst_1        
	//   33   76:iadd            
	//   34   77:istore          4
			break;
	//   35   79:goto            33

		case -2: 
			for(; j <= k; j++)
	//*  36   82:iload_2         
	//*  37   83:iload_3         
	//*  38   84:icmpgt          128
			{
				i = ai[j];
	//   39   87:aload_0         
	//   40   88:iload_2         
	//   41   89:iaload          
	//   42   90:istore_1        
				int i1 = quantizedGreen(i);
	//   43   91:iload_1         
	//   44   92:invokestatic    #100 <Method int quantizedGreen(int)>
	//   45   95:istore          4
				int k1 = quantizedRed(i);
	//   46   97:iload_1         
	//   47   98:invokestatic    #97  <Method int quantizedRed(int)>
	//   48  101:istore          5
				ai[j] = quantizedBlue(i) | (i1 << 10 | k1 << 5);
	//   49  103:aload_0         
	//   50  104:iload_2         
	//   51  105:iload_1         
	//   52  106:invokestatic    #103 <Method int quantizedBlue(int)>
	//   53  109:iload           4
	//   54  111:bipush          10
	//   55  113:ishl            
	//   56  114:iload           5
	//   57  116:iconst_5        
	//   58  117:ishl            
	//   59  118:ior             
	//   60  119:ior             
	//   61  120:iastore         
			}

	//   62  121:iload_2         
	//   63  122:iconst_1        
	//   64  123:iadd            
	//   65  124:istore_2        
			break;
		}
	//*  66  125:goto            82
	//   67  128:return          
	}

	private static int modifyWordWidth(int i, int j, int k)
	{
		if(k > j)
	//*   0    0:iload_2         
	//*   1    1:iload_1         
	//*   2    2:icmple          14
			i <<= k - j;
	//    3    5:iload_0         
	//    4    6:iload_2         
	//    5    7:iload_1         
	//    6    8:isub            
	//    7    9:ishl            
	//    8   10:istore_0        
		else
	//*   9   11:goto            20
			i >>= j - k;
	//   10   14:iload_0         
	//   11   15:iload_1         
	//   12   16:iload_2         
	//   13   17:isub            
	//   14   18:ishr            
	//   15   19:istore_0        
		return i & (1 << k) - 1;
	//   16   20:iload_0         
	//   17   21:iconst_1        
	//   18   22:iload_2         
	//   19   23:ishl            
	//   20   24:iconst_1        
	//   21   25:isub            
	//   22   26:iand            
	//   23   27:ireturn         
	}

	private static int quantizeFromRgb888(int i)
	{
		int j = modifyWordWidth(Color.red(i), 8, 5);
	//    0    0:iload_0         
	//    1    1:invokestatic    #154 <Method int Color.red(int)>
	//    2    4:bipush          8
	//    3    6:iconst_5        
	//    4    7:invokestatic    #109 <Method int modifyWordWidth(int, int, int)>
	//    5   10:istore_1        
		int k = modifyWordWidth(Color.green(i), 8, 5);
	//    6   11:iload_0         
	//    7   12:invokestatic    #157 <Method int Color.green(int)>
	//    8   15:bipush          8
	//    9   17:iconst_5        
	//   10   18:invokestatic    #109 <Method int modifyWordWidth(int, int, int)>
	//   11   21:istore_2        
		return modifyWordWidth(Color.blue(i), 8, 5) | (j << 10 | k << 5);
	//   12   22:iload_0         
	//   13   23:invokestatic    #160 <Method int Color.blue(int)>
	//   14   26:bipush          8
	//   15   28:iconst_5        
	//   16   29:invokestatic    #109 <Method int modifyWordWidth(int, int, int)>
	//   17   32:iload_1         
	//   18   33:bipush          10
	//   19   35:ishl            
	//   20   36:iload_2         
	//   21   37:iconst_5        
	//   22   38:ishl            
	//   23   39:ior             
	//   24   40:ior             
	//   25   41:ireturn         
	}

	private List quantizePixels(int i)
	{
		PriorityQueue priorityqueue = new PriorityQueue(i, VBOX_COMPARATOR_VOLUME);
	//    0    0:new             #162 <Class PriorityQueue>
	//    1    3:dup             
	//    2    4:iload_1         
	//    3    5:getstatic       #49  <Field Comparator VBOX_COMPARATOR_VOLUME>
	//    4    8:invokespecial   #165 <Method void PriorityQueue(int, Comparator)>
	//    5   11:astore_2        
		priorityqueue.offer(((Object) (new Vbox(0, mColors.length - 1))));
	//    6   12:aload_2         
	//    7   13:new             #8   <Class ColorCutQuantizer$Vbox>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:aload_0         
	//   12   20:getfield        #71  <Field int[] mColors>
	//   13   23:arraylength     
	//   14   24:iconst_1        
	//   15   25:isub            
	//   16   26:invokespecial   #168 <Method void ColorCutQuantizer$Vbox(ColorCutQuantizer, int, int)>
	//   17   29:invokevirtual   #171 <Method boolean PriorityQueue.offer(Object)>
	//   18   32:pop             
		splitBoxes(priorityqueue, i);
	//   19   33:aload_0         
	//   20   34:aload_2         
	//   21   35:iload_1         
	//   22   36:invokespecial   #175 <Method void splitBoxes(PriorityQueue, int)>
		return generateAverageColors(((Collection) (priorityqueue)));
	//   23   39:aload_0         
	//   24   40:aload_2         
	//   25   41:invokespecial   #177 <Method List generateAverageColors(Collection)>
	//   26   44:areturn         
	}

	static int quantizedBlue(int i)
	{
		return i & 0x1f;
	//    0    0:iload_0         
	//    1    1:bipush          31
	//    2    3:iand            
	//    3    4:ireturn         
	}

	static int quantizedGreen(int i)
	{
		return i >> 5 & 0x1f;
	//    0    0:iload_0         
	//    1    1:iconst_5        
	//    2    2:ishr            
	//    3    3:bipush          31
	//    4    5:iand            
	//    5    6:ireturn         
	}

	static int quantizedRed(int i)
	{
		return i >> 10 & 0x1f;
	//    0    0:iload_0         
	//    1    1:bipush          10
	//    2    3:ishr            
	//    3    4:bipush          31
	//    4    6:iand            
	//    5    7:ireturn         
	}

	private boolean shouldIgnoreColor(int i)
	{
		i = approximateToRgb888(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #81  <Method int approximateToRgb888(int)>
	//    2    4:istore_1        
		ColorUtils.colorToHSL(i, mTempHsl);
	//    3    5:iload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #54  <Field float[] mTempHsl>
	//    6   10:invokestatic    #184 <Method void ColorUtils.colorToHSL(int, float[])>
		return shouldIgnoreColor(i, mTempHsl);
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #54  <Field float[] mTempHsl>
	//   11   19:invokespecial   #187 <Method boolean shouldIgnoreColor(int, float[])>
	//   12   22:ireturn         
	}

	private boolean shouldIgnoreColor(int i, float af[])
	{
		if(mFilters != null && mFilters.length > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field Palette$Filter[] mFilters>
	//*   2    4:ifnull          55
	//*   3    7:aload_0         
	//*   4    8:getfield        #58  <Field Palette$Filter[] mFilters>
	//*   5   11:arraylength     
	//*   6   12:ifle            55
		{
			int k = mFilters.length;
	//    7   15:aload_0         
	//    8   16:getfield        #58  <Field Palette$Filter[] mFilters>
	//    9   19:arraylength     
	//   10   20:istore          4
			for(int j = 0; j < k; j++)
	//*  11   22:iconst_0        
	//*  12   23:istore_3        
	//*  13   24:iload_3         
	//*  14   25:iload           4
	//*  15   27:icmpge          55
				if(!mFilters[j].isAllowed(i, af))
	//*  16   30:aload_0         
	//*  17   31:getfield        #58  <Field Palette$Filter[] mFilters>
	//*  18   34:iload_3         
	//*  19   35:aaload          
	//*  20   36:iload_1         
	//*  21   37:aload_2         
	//*  22   38:invokeinterface #192 <Method boolean Palette$Filter.isAllowed(int, float[])>
	//*  23   43:ifne            48
					return true;
	//   24   46:iconst_1        
	//   25   47:ireturn         

	//   26   48:iload_3         
	//   27   49:iconst_1        
	//   28   50:iadd            
	//   29   51:istore_3        
		}
	//*  30   52:goto            24
		return false;
	//   31   55:iconst_0        
	//   32   56:ireturn         
	}

	private boolean shouldIgnoreColor(Palette.Swatch swatch)
	{
		return shouldIgnoreColor(swatch.getRgb(), swatch.getHsl());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #195 <Method int Palette$Swatch.getRgb()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #199 <Method float[] Palette$Swatch.getHsl()>
	//    5    9:invokespecial   #187 <Method boolean shouldIgnoreColor(int, float[])>
	//    6   12:ireturn         
	}

	private void splitBoxes(PriorityQueue priorityqueue, int i)
	{
		while(priorityqueue.size() < i) 
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #200 <Method int PriorityQueue.size()>
	//*   2    4:iload_2         
	//*   3    5:icmpge          46
		{
			Vbox vbox = (Vbox)priorityqueue.poll();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #203 <Method Object PriorityQueue.poll()>
	//    6   12:checkcast       #8   <Class ColorCutQuantizer$Vbox>
	//    7   15:astore_3        
			if(vbox != null && vbox.canSplit())
	//*   8   16:aload_3         
	//*   9   17:ifnull          45
	//*  10   20:aload_3         
	//*  11   21:invokevirtual   #206 <Method boolean ColorCutQuantizer$Vbox.canSplit()>
	//*  12   24:ifeq            45
			{
				priorityqueue.offer(((Object) (vbox.splitBox())));
	//   13   27:aload_1         
	//   14   28:aload_3         
	//   15   29:invokevirtual   #210 <Method ColorCutQuantizer$Vbox ColorCutQuantizer$Vbox.splitBox()>
	//   16   32:invokevirtual   #171 <Method boolean PriorityQueue.offer(Object)>
	//   17   35:pop             
				priorityqueue.offer(((Object) (vbox)));
	//   18   36:aload_1         
	//   19   37:aload_3         
	//   20   38:invokevirtual   #171 <Method boolean PriorityQueue.offer(Object)>
	//   21   41:pop             
			} else
	//*  22   42:goto            0
			{
				return;
	//   23   45:return          
			}
		}
	//   24   46:return          
	}

	List getQuantizedColors()
	{
		return mQuantizedColors;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field List mQuantizedColors>
	//    2    4:areturn         
	}

	static final int COMPONENT_BLUE = -1;
	static final int COMPONENT_GREEN = -2;
	static final int COMPONENT_RED = -3;
	private static final String LOG_TAG = "ColorCutQuantizer";
	private static final boolean LOG_TIMINGS = false;
	private static final int QUANTIZE_WORD_MASK = 31;
	private static final int QUANTIZE_WORD_WIDTH = 5;
	private static final Comparator VBOX_COMPARATOR_VOLUME = new Comparator() {

		public int compare(Vbox vbox, Vbox vbox1)
		{
			return vbox1.getVolume() - vbox.getVolume();
		//    0    0:aload_2         
		//    1    1:invokevirtual   #22  <Method int ColorCutQuantizer$Vbox.getVolume()>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #22  <Method int ColorCutQuantizer$Vbox.getVolume()>
		//    4    8:isub            
		//    5    9:ireturn         
		}

		public volatile int compare(Object obj, Object obj1)
		{
			return compare((Vbox)obj, (Vbox)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #18  <Class ColorCutQuantizer$Vbox>
		//    3    5:aload_2         
		//    4    6:checkcast       #18  <Class ColorCutQuantizer$Vbox>
		//    5    9:invokevirtual   #25  <Method int compare(ColorCutQuantizer$Vbox, ColorCutQuantizer$Vbox)>
		//    6   12:ireturn         
		}

	}
;
	final int mColors[];
	final Palette.Filter mFilters[];
	final int mHistogram[];
	final List mQuantizedColors;
	private final float mTempHsl[] = new float[3];
	final TimingLogger mTimingLogger = null;

	static 
	{
	//    0    0:new             #6   <Class ColorCutQuantizer$1>
	//    1    3:dup             
	//    2    4:invokespecial   #47  <Method void ColorCutQuantizer$1()>
	//    3    7:putstatic       #49  <Field Comparator VBOX_COMPARATOR_VOLUME>
	//*   4   10:return          
	}
}
