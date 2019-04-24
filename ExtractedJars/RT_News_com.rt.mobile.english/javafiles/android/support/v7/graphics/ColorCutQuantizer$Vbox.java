// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.graphics;

import java.util.Arrays;

// Referenced classes of package android.support.v7.graphics:
//			ColorCutQuantizer

private class ColorCutQuantizer$Vbox
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

	final ColorCutQuantizer$Vbox splitBox()
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
			ColorCutQuantizer$Vbox colorcutquantizer$vbox = new ColorCutQuantizer$Vbox(i + 1, mUpperIndex);
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
			return colorcutquantizer$vbox;
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

	ColorCutQuantizer$Vbox(int i, int j)
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
