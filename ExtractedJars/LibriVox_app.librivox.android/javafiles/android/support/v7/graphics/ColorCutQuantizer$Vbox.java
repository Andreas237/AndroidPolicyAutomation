// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.graphics;

import java.util.Arrays;

// Referenced classes of package android.support.v7.graphics:
//			ColorCutQuantizer

class ColorCutQuantizer$Vbox
{

	final boolean canSplit()
	{
		return getColorCount() > 1;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method int getColorCount()>
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
	//    1    1:invokevirtual   #41  <Method int getLongestColorDimension()>
	//    2    4:istore_1        
		int ai[] = mColors;
	//    3    5:aload_0         
	//    4    6:getfield        #20  <Field ColorCutQuantizer this$0>
	//    5    9:getfield        #47  <Field int[] ColorCutQuantizer.mColors>
	//    6   12:astore          5
		int ai1[] = mHistogram;
	//    7   14:aload_0         
	//    8   15:getfield        #20  <Field ColorCutQuantizer this$0>
	//    9   18:getfield        #50  <Field int[] ColorCutQuantizer.mHistogram>
	//   10   21:astore          6
		ColorCutQuantizer.modifySignificantOctet(ai, i, mLowerIndex, mUpperIndex);
	//   11   23:aload           5
	//   12   25:iload_1         
	//   13   26:aload_0         
	//   14   27:getfield        #25  <Field int mLowerIndex>
	//   15   30:aload_0         
	//   16   31:getfield        #27  <Field int mUpperIndex>
	//   17   34:invokestatic    #54  <Method void ColorCutQuantizer.modifySignificantOctet(int[], int, int, int)>
		Arrays.sort(ai, mLowerIndex, mUpperIndex + 1);
	//   18   37:aload           5
	//   19   39:aload_0         
	//   20   40:getfield        #25  <Field int mLowerIndex>
	//   21   43:aload_0         
	//   22   44:getfield        #27  <Field int mUpperIndex>
	//   23   47:iconst_1        
	//   24   48:iadd            
	//   25   49:invokestatic    #60  <Method void Arrays.sort(int[], int, int)>
		ColorCutQuantizer.modifySignificantOctet(ai, i, mLowerIndex, mUpperIndex);
	//   26   52:aload           5
	//   27   54:iload_1         
	//   28   55:aload_0         
	//   29   56:getfield        #25  <Field int mLowerIndex>
	//   30   59:aload_0         
	//   31   60:getfield        #27  <Field int mUpperIndex>
	//   32   63:invokestatic    #54  <Method void ColorCutQuantizer.modifySignificantOctet(int[], int, int, int)>
		int k = mPopulation / 2;
	//   33   66:aload_0         
	//   34   67:getfield        #62  <Field int mPopulation>
	//   35   70:iconst_2        
	//   36   71:idiv            
	//   37   72:istore_3        
		i = mLowerIndex;
	//   38   73:aload_0         
	//   39   74:getfield        #25  <Field int mLowerIndex>
	//   40   77:istore_1        
		int j = 0;
	//   41   78:iconst_0        
	//   42   79:istore_2        
		do
		{
			int l = mUpperIndex;
	//   43   80:aload_0         
	//   44   81:getfield        #27  <Field int mUpperIndex>
	//   45   84:istore          4
			if(i <= l)
	//*  46   86:iload_1         
	//*  47   87:iload           4
	//*  48   89:icmpgt          123
			{
				j += ai1[ai[i]];
	//   49   92:iload_2         
	//   50   93:aload           6
	//   51   95:aload           5
	//   52   97:iload_1         
	//   53   98:iaload          
	//   54   99:iaload          
	//   55  100:iadd            
	//   56  101:istore_2        
				if(j >= k)
	//*  57  102:iload_2         
	//*  58  103:iload_3         
	//*  59  104:icmplt          116
					return Math.min(l - 1, i);
	//   60  107:iload           4
	//   61  109:iconst_1        
	//   62  110:isub            
	//   63  111:iload_1         
	//   64  112:invokestatic    #68  <Method int Math.min(int, int)>
	//   65  115:ireturn         
				i++;
	//   66  116:iload_1         
	//   67  117:iconst_1        
	//   68  118:iadd            
	//   69  119:istore_1        
			} else
	//*  70  120:goto            80
			{
				return mLowerIndex;
	//   71  123:aload_0         
	//   72  124:getfield        #25  <Field int mLowerIndex>
	//   73  127:ireturn         
			}
		} while(true);
	}

	final void fitBox()
	{
		int ai[] = mColors;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ColorCutQuantizer this$0>
	//    2    4:getfield        #47  <Field int[] ColorCutQuantizer.mColors>
	//    3    7:astore          13
		int ai1[] = mHistogram;
	//    4    9:aload_0         
	//    5   10:getfield        #20  <Field ColorCutQuantizer this$0>
	//    6   13:getfield        #50  <Field int[] ColorCutQuantizer.mHistogram>
	//    7   16:astore          14
		int k = mLowerIndex;
	//    8   18:aload_0         
	//    9   19:getfield        #25  <Field int mLowerIndex>
	//   10   22:istore_3        
		int l1 = 0x7fffffff;
	//   11   23:ldc1            #69  <Int 0x7fffffff>
	//   12   25:istore          8
		int i2 = 0x80000000;
	//   13   27:ldc1            #70  <Int 0x80000000>
	//   14   29:istore          9
		int l = 0x7fffffff;
	//   15   31:ldc1            #69  <Int 0x7fffffff>
	//   16   33:istore          4
		int i1 = 0x80000000;
	//   17   35:ldc1            #70  <Int 0x80000000>
	//   18   37:istore          5
		int i = 0x7fffffff;
	//   19   39:ldc1            #69  <Int 0x7fffffff>
	//   20   41:istore_1        
		int j = 0x80000000;
	//   21   42:ldc1            #70  <Int 0x80000000>
	//   22   44:istore_2        
		int j1;
		int l2;
		for(j1 = 0; k <= mUpperIndex; j1 = l2)
	//*  23   45:iconst_0        
	//*  24   46:istore          6
	//*  25   48:iload_3         
	//*  26   49:aload_0         
	//*  27   50:getfield        #27  <Field int mUpperIndex>
	//*  28   53:icmpgt          209
		{
			int k1 = ai[k];
	//   29   56:aload           13
	//   30   58:iload_3         
	//   31   59:iaload          
	//   32   60:istore          7
			l2 = j1 + ai1[k1];
	//   33   62:iload           6
	//   34   64:aload           14
	//   35   66:iload           7
	//   36   68:iaload          
	//   37   69:iadd            
	//   38   70:istore          12
			int j2 = ColorCutQuantizer.quantizedRed(k1);
	//   39   72:iload           7
	//   40   74:invokestatic    #74  <Method int ColorCutQuantizer.quantizedRed(int)>
	//   41   77:istore          10
			int k2 = ColorCutQuantizer.quantizedGreen(k1);
	//   42   79:iload           7
	//   43   81:invokestatic    #77  <Method int ColorCutQuantizer.quantizedGreen(int)>
	//   44   84:istore          11
			k1 = ColorCutQuantizer.quantizedBlue(k1);
	//   45   86:iload           7
	//   46   88:invokestatic    #80  <Method int ColorCutQuantizer.quantizedBlue(int)>
	//   47   91:istore          7
			j1 = i2;
	//   48   93:iload           9
	//   49   95:istore          6
			if(j2 > i2)
	//*  50   97:iload           10
	//*  51   99:iload           9
	//*  52  101:icmple          108
				j1 = j2;
	//   53  104:iload           10
	//   54  106:istore          6
			i2 = l1;
	//   55  108:iload           8
	//   56  110:istore          9
			if(j2 < l1)
	//*  57  112:iload           10
	//*  58  114:iload           8
	//*  59  116:icmpge          123
				i2 = j2;
	//   60  119:iload           10
	//   61  121:istore          9
			j2 = i1;
	//   62  123:iload           5
	//   63  125:istore          10
			if(k2 > i1)
	//*  64  127:iload           11
	//*  65  129:iload           5
	//*  66  131:icmple          138
				j2 = k2;
	//   67  134:iload           11
	//   68  136:istore          10
			i1 = l;
	//   69  138:iload           4
	//   70  140:istore          5
			if(k2 < l)
	//*  71  142:iload           11
	//*  72  144:iload           4
	//*  73  146:icmpge          153
				i1 = k2;
	//   74  149:iload           11
	//   75  151:istore          5
			k2 = j;
	//   76  153:iload_2         
	//   77  154:istore          11
			if(k1 > j)
	//*  78  156:iload           7
	//*  79  158:iload_2         
	//*  80  159:icmple          166
				k2 = k1;
	//   81  162:iload           7
	//   82  164:istore          11
			j = i;
	//   83  166:iload_1         
	//   84  167:istore_2        
			if(k1 < i)
	//*  85  168:iload           7
	//*  86  170:iload_1         
	//*  87  171:icmpge          177
				j = k1;
	//   88  174:iload           7
	//   89  176:istore_2        
			k++;
	//   90  177:iload_3         
	//   91  178:iconst_1        
	//   92  179:iadd            
	//   93  180:istore_3        
			l1 = i2;
	//   94  181:iload           9
	//   95  183:istore          8
			i2 = j1;
	//   96  185:iload           6
	//   97  187:istore          9
			l = i1;
	//   98  189:iload           5
	//   99  191:istore          4
			i1 = j2;
	//  100  193:iload           10
	//  101  195:istore          5
			i = j;
	//  102  197:iload_2         
	//  103  198:istore_1        
			j = k2;
	//  104  199:iload           11
	//  105  201:istore_2        
		}

	//  106  202:iload           12
	//  107  204:istore          6
	//* 108  206:goto            48
		mMinRed = l1;
	//  109  209:aload_0         
	//  110  210:iload           8
	//  111  212:putfield        #82  <Field int mMinRed>
		mMaxRed = i2;
	//  112  215:aload_0         
	//  113  216:iload           9
	//  114  218:putfield        #84  <Field int mMaxRed>
		mMinGreen = l;
	//  115  221:aload_0         
	//  116  222:iload           4
	//  117  224:putfield        #86  <Field int mMinGreen>
		mMaxGreen = i1;
	//  118  227:aload_0         
	//  119  228:iload           5
	//  120  230:putfield        #88  <Field int mMaxGreen>
		mMinBlue = i;
	//  121  233:aload_0         
	//  122  234:iload_1         
	//  123  235:putfield        #90  <Field int mMinBlue>
		mMaxBlue = j;
	//  124  238:aload_0         
	//  125  239:iload_2         
	//  126  240:putfield        #92  <Field int mMaxBlue>
		mPopulation = j1;
	//  127  243:aload_0         
	//  128  244:iload           6
	//  129  246:putfield        #62  <Field int mPopulation>
	//  130  249:return          
	}

	final Palette.Swatch getAverageColor()
	{
		int ai[] = mColors;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ColorCutQuantizer this$0>
	//    2    4:getfield        #47  <Field int[] ColorCutQuantizer.mColors>
	//    3    7:astore          10
		int ai1[] = mHistogram;
	//    4    9:aload_0         
	//    5   10:getfield        #20  <Field ColorCutQuantizer this$0>
	//    6   13:getfield        #50  <Field int[] ColorCutQuantizer.mHistogram>
	//    7   16:astore          11
		int k = mLowerIndex;
	//    8   18:aload_0         
	//    9   19:getfield        #25  <Field int mLowerIndex>
	//   10   22:istore          5
		int l = 0;
	//   11   24:iconst_0        
	//   12   25:istore          6
		int i1 = 0;
	//   13   27:iconst_0        
	//   14   28:istore          7
		int j = 0;
	//   15   30:iconst_0        
	//   16   31:istore          4
		int i = 0;
	//   17   33:iconst_0        
	//   18   34:istore_3        
		for(; k <= mUpperIndex; k++)
	//*  19   35:iload           5
	//*  20   37:aload_0         
	//*  21   38:getfield        #27  <Field int mUpperIndex>
	//*  22   41:icmpgt          111
		{
			int j1 = ai[k];
	//   23   44:aload           10
	//   24   46:iload           5
	//   25   48:iaload          
	//   26   49:istore          8
			int k1 = ai1[j1];
	//   27   51:aload           11
	//   28   53:iload           8
	//   29   55:iaload          
	//   30   56:istore          9
			i1 += k1;
	//   31   58:iload           7
	//   32   60:iload           9
	//   33   62:iadd            
	//   34   63:istore          7
			l += ColorCutQuantizer.quantizedRed(j1) * k1;
	//   35   65:iload           6
	//   36   67:iload           8
	//   37   69:invokestatic    #74  <Method int ColorCutQuantizer.quantizedRed(int)>
	//   38   72:iload           9
	//   39   74:imul            
	//   40   75:iadd            
	//   41   76:istore          6
			j += ColorCutQuantizer.quantizedGreen(j1) * k1;
	//   42   78:iload           4
	//   43   80:iload           8
	//   44   82:invokestatic    #77  <Method int ColorCutQuantizer.quantizedGreen(int)>
	//   45   85:iload           9
	//   46   87:imul            
	//   47   88:iadd            
	//   48   89:istore          4
			i += k1 * ColorCutQuantizer.quantizedBlue(j1);
	//   49   91:iload_3         
	//   50   92:iload           9
	//   51   94:iload           8
	//   52   96:invokestatic    #80  <Method int ColorCutQuantizer.quantizedBlue(int)>
	//   53   99:imul            
	//   54  100:iadd            
	//   55  101:istore_3        
		}

	//   56  102:iload           5
	//   57  104:iconst_1        
	//   58  105:iadd            
	//   59  106:istore          5
	//*  60  108:goto            35
		float f = l;
	//   61  111:iload           6
	//   62  113:i2f             
	//   63  114:fstore_1        
		float f1 = i1;
	//   64  115:iload           7
	//   65  117:i2f             
	//   66  118:fstore_2        
		return new Palette.Swatch(ColorCutQuantizer.approximateToRgb888(Math.round(f / f1), Math.round((float)j / f1), Math.round((float)i / f1)), i1);
	//   67  119:new             #96  <Class Palette$Swatch>
	//   68  122:dup             
	//   69  123:fload_1         
	//   70  124:fload_2         
	//   71  125:fdiv            
	//   72  126:invokestatic    #100 <Method int Math.round(float)>
	//   73  129:iload           4
	//   74  131:i2f             
	//   75  132:fload_2         
	//   76  133:fdiv            
	//   77  134:invokestatic    #100 <Method int Math.round(float)>
	//   78  137:iload_3         
	//   79  138:i2f             
	//   80  139:fload_2         
	//   81  140:fdiv            
	//   82  141:invokestatic    #100 <Method int Math.round(float)>
	//   83  144:invokestatic    #104 <Method int ColorCutQuantizer.approximateToRgb888(int, int, int)>
	//   84  147:iload           7
	//   85  149:invokespecial   #107 <Method void Palette$Swatch(int, int)>
	//   86  152:areturn         
	}

	final int getColorCount()
	{
		return (mUpperIndex + 1) - mLowerIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int mUpperIndex>
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:aload_0         
	//    5    7:getfield        #25  <Field int mLowerIndex>
	//    6   10:isub            
	//    7   11:ireturn         
	}

	final int getLongestColorDimension()
	{
		int i = mMaxRed - mMinRed;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field int mMaxRed>
	//    2    4:aload_0         
	//    3    5:getfield        #82  <Field int mMinRed>
	//    4    8:isub            
	//    5    9:istore_1        
		int j = mMaxGreen - mMinGreen;
	//    6   10:aload_0         
	//    7   11:getfield        #88  <Field int mMaxGreen>
	//    8   14:aload_0         
	//    9   15:getfield        #86  <Field int mMinGreen>
	//   10   18:isub            
	//   11   19:istore_2        
		int k = mMaxBlue - mMinBlue;
	//   12   20:aload_0         
	//   13   21:getfield        #92  <Field int mMaxBlue>
	//   14   24:aload_0         
	//   15   25:getfield        #90  <Field int mMinBlue>
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
	//    1    1:getfield        #84  <Field int mMaxRed>
	//    2    4:aload_0         
	//    3    5:getfield        #82  <Field int mMinRed>
	//    4    8:isub            
	//    5    9:iconst_1        
	//    6   10:iadd            
	//    7   11:aload_0         
	//    8   12:getfield        #88  <Field int mMaxGreen>
	//    9   15:aload_0         
	//   10   16:getfield        #86  <Field int mMinGreen>
	//   11   19:isub            
	//   12   20:iconst_1        
	//   13   21:iadd            
	//   14   22:imul            
	//   15   23:aload_0         
	//   16   24:getfield        #92  <Field int mMaxBlue>
	//   17   27:aload_0         
	//   18   28:getfield        #90  <Field int mMinBlue>
	//   19   31:isub            
	//   20   32:iconst_1        
	//   21   33:iadd            
	//   22   34:imul            
	//   23   35:ireturn         
	}

	final ColorCutQuantizer$Vbox splitBox()
	{
		if(canSplit())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #112 <Method boolean canSplit()>
	//*   2    4:ifeq            42
		{
			int i = findSplitPoint();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #114 <Method int findSplitPoint()>
	//    5   11:istore_1        
			ColorCutQuantizer$Vbox colorcutquantizer$vbox = new ColorCutQuantizer$Vbox(i + 1, mUpperIndex);
	//    6   12:new             #2   <Class ColorCutQuantizer$Vbox>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:getfield        #20  <Field ColorCutQuantizer this$0>
	//   10   20:iload_1         
	//   11   21:iconst_1        
	//   12   22:iadd            
	//   13   23:aload_0         
	//   14   24:getfield        #27  <Field int mUpperIndex>
	//   15   27:invokespecial   #116 <Method void ColorCutQuantizer$Vbox(ColorCutQuantizer, int, int)>
	//   16   30:astore_2        
			mUpperIndex = i;
	//   17   31:aload_0         
	//   18   32:iload_1         
	//   19   33:putfield        #27  <Field int mUpperIndex>
			fitBox();
	//   20   36:aload_0         
	//   21   37:invokevirtual   #30  <Method void fitBox()>
			return colorcutquantizer$vbox;
	//   22   40:aload_2         
	//   23   41:areturn         
		} else
		{
			throw new IllegalStateException("Can not split a box with only 1 color");
	//   24   42:new             #118 <Class IllegalStateException>
	//   25   45:dup             
	//   26   46:ldc1            #120 <String "Can not split a box with only 1 color">
	//   27   48:invokespecial   #123 <Method void IllegalStateException(String)>
	//   28   51:athrow          
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
	//    2    2:putfield        #20  <Field ColorCutQuantizer this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
		mLowerIndex = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #25  <Field int mLowerIndex>
		mUpperIndex = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #27  <Field int mUpperIndex>
		fitBox();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #30  <Method void fitBox()>
	//   13   23:return          
	}
}
