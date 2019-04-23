// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.graphics;

import android.graphics.Color;
import android.support.v4.graphics.a;
import android.util.TimingLogger;
import java.util.*;

final class ColorCutQuantizer
{

	ColorCutQuantizer(int ai[], int i, Palette.Filter afilter[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:newarray        float[]
	//    5    8:putfield        #49  <Field float[] mTempHsl>
	//    6   11:aload_0         
	//    7   12:aconst_null     
	//    8   13:putfield        #51  <Field TimingLogger mTimingLogger>
		mFilters = afilter;
	//    9   16:aload_0         
	//   10   17:aload_3         
	//   11   18:putfield        #53  <Field Palette$Filter[] mFilters>
		afilter = ((Palette.Filter []) (new int[32768]));
	//   12   21:ldc1            #54  <Int 32768>
	//   13   23:newarray        int[]
	//   14   25:astore_3        
		mHistogram = ((int []) (afilter));
	//   15   26:aload_0         
	//   16   27:aload_3         
	//   17   28:putfield        #56  <Field int[] mHistogram>
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
	//   29   48:invokestatic    #60  <Method int quantizeFromRgb888(int)>
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
		for(k = 0; j1 < afilter.length; k = l1)
	//*  50   81:iconst_0        
	//*  51   82:istore          4
	//*  52   84:iload           5
	//*  53   86:aload_3         
	//*  54   87:arraylength     
	//*  55   88:icmpge          142
		{
			if(afilter[j1] > 0 && shouldIgnoreColor(j1))
	//*  56   91:aload_3         
	//*  57   92:iload           5
	//*  58   94:iaload          
	//*  59   95:ifle            112
	//*  60   98:aload_0         
	//*  61   99:iload           5
	//*  62  101:invokespecial   #64  <Method boolean shouldIgnoreColor(int)>
	//*  63  104:ifeq            112
				afilter[j1] = 0;
	//   64  107:aload_3         
	//   65  108:iload           5
	//   66  110:iconst_0        
	//   67  111:iastore         
			l1 = k;
	//   68  112:iload           4
	//   69  114:istore          6
			if(afilter[j1] > 0)
	//*  70  116:aload_3         
	//*  71  117:iload           5
	//*  72  119:iaload          
	//*  73  120:ifle            129
				l1 = k + 1;
	//   74  123:iload           4
	//   75  125:iconst_1        
	//   76  126:iadd            
	//   77  127:istore          6
			j1++;
	//   78  129:iload           5
	//   79  131:iconst_1        
	//   80  132:iadd            
	//   81  133:istore          5
		}

	//   82  135:iload           6
	//   83  137:istore          4
	//*  84  139:goto            84
		ai = new int[k];
	//   85  142:iload           4
	//   86  144:newarray        int[]
	//   87  146:astore_1        
		mColors = ai;
	//   88  147:aload_0         
	//   89  148:aload_1         
	//   90  149:putfield        #66  <Field int[] mColors>
		j1 = 0;
	//   91  152:iconst_0        
	//   92  153:istore          5
		int j2;
		for(int i2 = 0; j1 < afilter.length; i2 = j2)
	//*  93  155:iconst_0        
	//*  94  156:istore          6
	//*  95  158:iload           5
	//*  96  160:aload_3         
	//*  97  161:arraylength     
	//*  98  162:icmpge          201
		{
			j2 = i2;
	//   99  165:iload           6
	//  100  167:istore          7
			if(afilter[j1] > 0)
	//* 101  169:aload_3         
	//* 102  170:iload           5
	//* 103  172:iaload          
	//* 104  173:ifle            188
			{
				ai[i2] = j1;
	//  105  176:aload_1         
	//  106  177:iload           6
	//  107  179:iload           5
	//  108  181:iastore         
				j2 = i2 + 1;
	//  109  182:iload           6
	//  110  184:iconst_1        
	//  111  185:iadd            
	//  112  186:istore          7
			}
			j1++;
	//  113  188:iload           5
	//  114  190:iconst_1        
	//  115  191:iadd            
	//  116  192:istore          5
		}

	//  117  194:iload           7
	//  118  196:istore          6
	//* 119  198:goto            158
		if(k <= i)
	//* 120  201:iload           4
	//* 121  203:iload_2         
	//* 122  204:icmpgt          269
		{
			mQuantizedColors = ((List) (new ArrayList()));
	//  123  207:aload_0         
	//  124  208:new             #68  <Class ArrayList>
	//  125  211:dup             
	//  126  212:invokespecial   #69  <Method void ArrayList()>
	//  127  215:putfield        #71  <Field List mQuantizedColors>
			int l = ai.length;
	//  128  218:aload_1         
	//  129  219:arraylength     
	//  130  220:istore          4
			for(i = ((int) (flag)); i < l; i++)
	//* 131  222:iload           8
	//* 132  224:istore_2        
	//* 133  225:iload_2         
	//* 134  226:iload           4
	//* 135  228:icmpge          278
			{
				int k1 = ai[i];
	//  136  231:aload_1         
	//  137  232:iload_2         
	//  138  233:iaload          
	//  139  234:istore          5
				mQuantizedColors.add(((Object) (new Palette.Swatch(approximateToRgb888(k1), ((int) (afilter[k1]))))));
	//  140  236:aload_0         
	//  141  237:getfield        #71  <Field List mQuantizedColors>
	//  142  240:new             #73  <Class Palette$Swatch>
	//  143  243:dup             
	//  144  244:iload           5
	//  145  246:invokestatic    #76  <Method int approximateToRgb888(int)>
	//  146  249:aload_3         
	//  147  250:iload           5
	//  148  252:iaload          
	//  149  253:invokespecial   #79  <Method void Palette$Swatch(int, int)>
	//  150  256:invokeinterface #85  <Method boolean List.add(Object)>
	//  151  261:pop             
			}

	//  152  262:iload_2         
	//  153  263:iconst_1        
	//  154  264:iadd            
	//  155  265:istore_2        
		} else
	//* 156  266:goto            225
		{
			mQuantizedColors = quantizePixels(i);
	//  157  269:aload_0         
	//  158  270:aload_0         
	//  159  271:iload_2         
	//  160  272:invokespecial   #89  <Method List quantizePixels(int)>
	//  161  275:putfield        #71  <Field List mQuantizedColors>
		}
	//  162  278:return          
	}

	private static int approximateToRgb888(int i)
	{
		return approximateToRgb888(quantizedRed(i), quantizedGreen(i), quantizedBlue(i));
	//    0    0:iload_0         
	//    1    1:invokestatic    #92  <Method int quantizedRed(int)>
	//    2    4:iload_0         
	//    3    5:invokestatic    #95  <Method int quantizedGreen(int)>
	//    4    8:iload_0         
	//    5    9:invokestatic    #98  <Method int quantizedBlue(int)>
	//    6   12:invokestatic    #101 <Method int approximateToRgb888(int, int, int)>
	//    7   15:ireturn         
	}

	static int approximateToRgb888(int i, int j, int k)
	{
		return Color.rgb(modifyWordWidth(i, 5, 8), modifyWordWidth(j, 5, 8), modifyWordWidth(k, 5, 8));
	//    0    0:iload_0         
	//    1    1:iconst_5        
	//    2    2:bipush          8
	//    3    4:invokestatic    #104 <Method int modifyWordWidth(int, int, int)>
	//    4    7:iload_1         
	//    5    8:iconst_5        
	//    6    9:bipush          8
	//    7   11:invokestatic    #104 <Method int modifyWordWidth(int, int, int)>
	//    8   14:iload_2         
	//    9   15:iconst_5        
	//   10   16:bipush          8
	//   11   18:invokestatic    #104 <Method int modifyWordWidth(int, int, int)>
	//   12   21:invokestatic    #109 <Method int Color.rgb(int, int, int)>
	//   13   24:ireturn         
	}

	private List generateAverageColors(Collection collection)
	{
		ArrayList arraylist = new ArrayList(collection.size());
	//    0    0:new             #68  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokeinterface #117 <Method int Collection.size()>
	//    4   10:invokespecial   #120 <Method void ArrayList(int)>
	//    5   13:astore_2        
		collection = ((Collection) (collection.iterator()));
	//    6   14:aload_1         
	//    7   15:invokeinterface #124 <Method Iterator Collection.iterator()>
	//    8   20:astore_1        
		do
		{
			if(!((Iterator) (collection)).hasNext())
				break;
	//    9   21:aload_1         
	//   10   22:invokeinterface #130 <Method boolean Iterator.hasNext()>
	//   11   27:ifeq            60
			Palette.Swatch swatch = ((Vbox)((Iterator) (collection)).next()).getAverageColor();
	//   12   30:aload_1         
	//   13   31:invokeinterface #134 <Method Object Iterator.next()>
	//   14   36:checkcast       #136 <Class ColorCutQuantizer$Vbox>
	//   15   39:invokevirtual   #140 <Method Palette$Swatch ColorCutQuantizer$Vbox.getAverageColor()>
	//   16   42:astore_3        
			if(!shouldIgnoreColor(swatch))
	//*  17   43:aload_0         
	//*  18   44:aload_3         
	//*  19   45:invokespecial   #143 <Method boolean shouldIgnoreColor(Palette$Swatch)>
	//*  20   48:ifne            21
				arraylist.add(((Object) (swatch)));
	//   21   51:aload_2         
	//   22   52:aload_3         
	//   23   53:invokevirtual   #144 <Method boolean ArrayList.add(Object)>
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
	//   13   45:invokestatic    #98  <Method int quantizedBlue(int)>
	//   14   48:istore_2        
				int j1 = quantizedGreen(i);
	//   15   49:iload_1         
	//   16   50:invokestatic    #95  <Method int quantizedGreen(int)>
	//   17   53:istore          5
				ai[l] = quantizedRed(i) | (j << 10 | j1 << 5);
	//   18   55:aload_0         
	//   19   56:iload           4
	//   20   58:iload_1         
	//   21   59:invokestatic    #92  <Method int quantizedRed(int)>
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
	//   44   92:invokestatic    #95  <Method int quantizedGreen(int)>
	//   45   95:istore          4
				int k1 = quantizedRed(i);
	//   46   97:iload_1         
	//   47   98:invokestatic    #92  <Method int quantizedRed(int)>
	//   48  101:istore          5
				ai[j] = quantizedBlue(i) | (i1 << 10 | k1 << 5);
	//   49  103:aload_0         
	//   50  104:iload_2         
	//   51  105:iload_1         
	//   52  106:invokestatic    #98  <Method int quantizedBlue(int)>
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
	//    1    1:invokestatic    #149 <Method int Color.red(int)>
	//    2    4:bipush          8
	//    3    6:iconst_5        
	//    4    7:invokestatic    #104 <Method int modifyWordWidth(int, int, int)>
	//    5   10:istore_1        
		int k = modifyWordWidth(Color.green(i), 8, 5);
	//    6   11:iload_0         
	//    7   12:invokestatic    #152 <Method int Color.green(int)>
	//    8   15:bipush          8
	//    9   17:iconst_5        
	//   10   18:invokestatic    #104 <Method int modifyWordWidth(int, int, int)>
	//   11   21:istore_2        
		return modifyWordWidth(Color.blue(i), 8, 5) | (j << 10 | k << 5);
	//   12   22:iload_0         
	//   13   23:invokestatic    #155 <Method int Color.blue(int)>
	//   14   26:bipush          8
	//   15   28:iconst_5        
	//   16   29:invokestatic    #104 <Method int modifyWordWidth(int, int, int)>
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
	//    0    0:new             #157 <Class PriorityQueue>
	//    1    3:dup             
	//    2    4:iload_1         
	//    3    5:getstatic       #44  <Field Comparator VBOX_COMPARATOR_VOLUME>
	//    4    8:invokespecial   #160 <Method void PriorityQueue(int, Comparator)>
	//    5   11:astore_2        
		priorityqueue.offer(((Object) (new Vbox(0, mColors.length - 1))));
	//    6   12:aload_2         
	//    7   13:new             #136 <Class ColorCutQuantizer$Vbox>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:aload_0         
	//   12   20:getfield        #66  <Field int[] mColors>
	//   13   23:arraylength     
	//   14   24:iconst_1        
	//   15   25:isub            
	//   16   26:invokespecial   #163 <Method void ColorCutQuantizer$Vbox(ColorCutQuantizer, int, int)>
	//   17   29:invokevirtual   #166 <Method boolean PriorityQueue.offer(Object)>
	//   18   32:pop             
		splitBoxes(priorityqueue, i);
	//   19   33:aload_0         
	//   20   34:aload_2         
	//   21   35:iload_1         
	//   22   36:invokespecial   #170 <Method void splitBoxes(PriorityQueue, int)>
		return generateAverageColors(((Collection) (priorityqueue)));
	//   23   39:aload_0         
	//   24   40:aload_2         
	//   25   41:invokespecial   #172 <Method List generateAverageColors(Collection)>
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
	//    1    1:invokestatic    #76  <Method int approximateToRgb888(int)>
	//    2    4:istore_1        
		a.a(i, mTempHsl);
	//    3    5:iload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #49  <Field float[] mTempHsl>
	//    6   10:invokestatic    #178 <Method void a.a(int, float[])>
		return shouldIgnoreColor(i, mTempHsl);
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #49  <Field float[] mTempHsl>
	//   11   19:invokespecial   #181 <Method boolean shouldIgnoreColor(int, float[])>
	//   12   22:ireturn         
	}

	private boolean shouldIgnoreColor(int i, float af[])
	{
		Palette.Filter afilter[] = mFilters;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Palette$Filter[] mFilters>
	//    2    4:astore          5
		if(afilter != null && afilter.length > 0)
	//*   3    6:aload           5
	//*   4    8:ifnull          55
	//*   5   11:aload           5
	//*   6   13:arraylength     
	//*   7   14:ifle            55
		{
			int k = afilter.length;
	//    8   17:aload           5
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
	//*  17   31:getfield        #53  <Field Palette$Filter[] mFilters>
	//*  18   34:iload_3         
	//*  19   35:aaload          
	//*  20   36:iload_1         
	//*  21   37:aload_2         
	//*  22   38:invokeinterface #186 <Method boolean Palette$Filter.isAllowed(int, float[])>
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
	//    2    2:invokevirtual   #189 <Method int Palette$Swatch.getRgb()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #193 <Method float[] Palette$Swatch.getHsl()>
	//    5    9:invokespecial   #181 <Method boolean shouldIgnoreColor(int, float[])>
	//    6   12:ireturn         
	}

	private void splitBoxes(PriorityQueue priorityqueue, int i)
	{
		while(priorityqueue.size() < i) 
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #194 <Method int PriorityQueue.size()>
	//*   2    4:iload_2         
	//*   3    5:icmpge          46
		{
			Vbox vbox = (Vbox)priorityqueue.poll();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #197 <Method Object PriorityQueue.poll()>
	//    6   12:checkcast       #136 <Class ColorCutQuantizer$Vbox>
	//    7   15:astore_3        
			if(vbox != null && vbox.canSplit())
	//*   8   16:aload_3         
	//*   9   17:ifnull          45
	//*  10   20:aload_3         
	//*  11   21:invokevirtual   #200 <Method boolean ColorCutQuantizer$Vbox.canSplit()>
	//*  12   24:ifeq            45
			{
				priorityqueue.offer(((Object) (vbox.splitBox())));
	//   13   27:aload_1         
	//   14   28:aload_3         
	//   15   29:invokevirtual   #204 <Method ColorCutQuantizer$Vbox ColorCutQuantizer$Vbox.splitBox()>
	//   16   32:invokevirtual   #166 <Method boolean PriorityQueue.offer(Object)>
	//   17   35:pop             
				priorityqueue.offer(((Object) (vbox)));
	//   18   36:aload_1         
	//   19   37:aload_3         
	//   20   38:invokevirtual   #166 <Method boolean PriorityQueue.offer(Object)>
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
	//    1    1:getfield        #71  <Field List mQuantizedColors>
	//    2    4:areturn         
	}

	static final int COMPONENT_BLUE = -1;
	static final int COMPONENT_GREEN = -2;
	static final int COMPONENT_RED = -3;
	private static final String LOG_TAG = "ColorCutQuantizer";
	private static final boolean LOG_TIMINGS = false;
	private static final int QUANTIZE_WORD_MASK = 31;
	private static final int QUANTIZE_WORD_WIDTH = 5;
	private static final Comparator VBOX_COMPARATOR_VOLUME = new _cls1();
	final int mColors[];
	final Palette.Filter mFilters[];
	final int mHistogram[];
	final List mQuantizedColors;
	private final float mTempHsl[] = new float[3];
	final TimingLogger mTimingLogger = null;

	static 
	{
	//    0    0:new             #39  <Class ColorCutQuantizer$1>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void ColorCutQuantizer$1()>
	//    3    7:putstatic       #44  <Field Comparator VBOX_COMPARATOR_VOLUME>
	//*   4   10:return          
	}

	private class Vbox
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

		final Vbox splitBox()
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
				Vbox vbox = new Vbox(i + 1, mUpperIndex);
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
				return vbox;
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

		Vbox(int i, int j)
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


	private class _cls1
		implements Comparator
	{

		public int compare(Vbox vbox, Vbox vbox1)
		{
			return vbox1.getVolume() - vbox.getVolume();
		//    0    0:aload_2         
		//    1    1:invokevirtual   #19  <Method int ColorCutQuantizer$Vbox.getVolume()>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #19  <Method int ColorCutQuantizer$Vbox.getVolume()>
		//    4    8:isub            
		//    5    9:ireturn         
		}

		public volatile int compare(Object obj, Object obj1)
		{
			return compare((Vbox)obj, (Vbox)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #15  <Class ColorCutQuantizer$Vbox>
		//    3    5:aload_2         
		//    4    6:checkcast       #15  <Class ColorCutQuantizer$Vbox>
		//    5    9:invokevirtual   #22  <Method int compare(ColorCutQuantizer$Vbox, ColorCutQuantizer$Vbox)>
		//    6   12:ireturn         
		}

		_cls1()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #10  <Method void Object()>
		//    2    4:return          
		}
	}

}
