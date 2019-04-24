// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data;

import android.graphics.Color;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.data:
//			BarLineScatterCandleBubbleDataSet, BarEntry, DataSet

public class BarDataSet extends BarLineScatterCandleBubbleDataSet
	implements IBarDataSet
{

	public BarDataSet(List list, String s)
	{
		super(list, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #20  <Method void BarLineScatterCandleBubbleDataSet(List, String)>
		mBarSpace = 0.15F;
	//    4    6:aload_0         
	//    5    7:ldc1            #21  <Float 0.15F>
	//    6    9:putfield        #23  <Field float mBarSpace>
		mStackSize = 1;
	//    7   12:aload_0         
	//    8   13:iconst_1        
	//    9   14:putfield        #25  <Field int mStackSize>
		mBarShadowColor = Color.rgb(215, 215, 215);
	//   10   17:aload_0         
	//   11   18:sipush          215
	//   12   21:sipush          215
	//   13   24:sipush          215
	//   14   27:invokestatic    #31  <Method int Color.rgb(int, int, int)>
	//   15   30:putfield        #33  <Field int mBarShadowColor>
		mHighLightAlpha = 120;
	//   16   33:aload_0         
	//   17   34:bipush          120
	//   18   36:putfield        #35  <Field int mHighLightAlpha>
		mEntryCountStacks = 0;
	//   19   39:aload_0         
	//   20   40:iconst_0        
	//   21   41:putfield        #37  <Field int mEntryCountStacks>
	//   22   44:aload_0         
	//   23   45:iconst_1        
	//   24   46:anewarray       String[]
	//   25   49:dup             
	//   26   50:iconst_0        
	//   27   51:ldc1            #41  <String "Stack">
	//   28   53:aastore         
	//   29   54:putfield        #43  <Field String[] mStackLabels>
		mHighLightColor = Color.rgb(0, 0, 0);
	//   30   57:aload_0         
	//   31   58:iconst_0        
	//   32   59:iconst_0        
	//   33   60:iconst_0        
	//   34   61:invokestatic    #31  <Method int Color.rgb(int, int, int)>
	//   35   64:putfield        #46  <Field int mHighLightColor>
		calcStackSize(list);
	//   36   67:aload_0         
	//   37   68:aload_1         
	//   38   69:invokespecial   #50  <Method void calcStackSize(List)>
		calcEntryCountIncludingStacks(list);
	//   39   72:aload_0         
	//   40   73:aload_1         
	//   41   74:invokespecial   #53  <Method void calcEntryCountIncludingStacks(List)>
	//   42   77:return          
	}

	private void calcEntryCountIncludingStacks(List list)
	{
		mEntryCountStacks = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #37  <Field int mEntryCountStacks>
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		while(i < list.size()) 
	//*   5    7:iload_2         
	//*   6    8:aload_1         
	//*   7    9:invokeinterface #62  <Method int List.size()>
	//*   8   14:icmpge          66
		{
			float af[] = ((BarEntry)list.get(i)).getVals();
	//    9   17:aload_1         
	//   10   18:iload_2         
	//   11   19:invokeinterface #66  <Method Object List.get(int)>
	//   12   24:checkcast       #68  <Class BarEntry>
	//   13   27:invokevirtual   #72  <Method float[] BarEntry.getVals()>
	//   14   30:astore_3        
			if(af == null)
	//*  15   31:aload_3         
	//*  16   32:ifnonnull       52
				mEntryCountStacks = mEntryCountStacks + 1;
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:getfield        #37  <Field int mEntryCountStacks>
	//   20   40:iconst_1        
	//   21   41:iadd            
	//   22   42:putfield        #37  <Field int mEntryCountStacks>
			else
	//*  23   45:iload_2         
	//*  24   46:iconst_1        
	//*  25   47:iadd            
	//*  26   48:istore_2        
	//*  27   49:goto            7
				mEntryCountStacks = mEntryCountStacks + af.length;
	//   28   52:aload_0         
	//   29   53:aload_0         
	//   30   54:getfield        #37  <Field int mEntryCountStacks>
	//   31   57:aload_3         
	//   32   58:arraylength     
	//   33   59:iadd            
	//   34   60:putfield        #37  <Field int mEntryCountStacks>
			i++;
		}
	//*  35   63:goto            45
	//   36   66:return          
	}

	private void calcStackSize(List list)
	{
		for(int i = 0; i < list.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_1         
	//*   4    4:invokeinterface #62  <Method int List.size()>
	//*   5    9:icmpge          52
		{
			float af[] = ((BarEntry)list.get(i)).getVals();
	//    6   12:aload_1         
	//    7   13:iload_2         
	//    8   14:invokeinterface #66  <Method Object List.get(int)>
	//    9   19:checkcast       #68  <Class BarEntry>
	//   10   22:invokevirtual   #72  <Method float[] BarEntry.getVals()>
	//   11   25:astore_3        
			if(af != null && af.length > mStackSize)
	//*  12   26:aload_3         
	//*  13   27:ifnull          45
	//*  14   30:aload_3         
	//*  15   31:arraylength     
	//*  16   32:aload_0         
	//*  17   33:getfield        #25  <Field int mStackSize>
	//*  18   36:icmple          45
				mStackSize = af.length;
	//   19   39:aload_0         
	//   20   40:aload_3         
	//   21   41:arraylength     
	//   22   42:putfield        #25  <Field int mStackSize>
		}

	//   23   45:iload_2         
	//   24   46:iconst_1        
	//   25   47:iadd            
	//   26   48:istore_2        
	//*  27   49:goto            2
	//   28   52:return          
	}

	public void calcMinMax(int i, int j)
	{
		if(mYVals != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field List mYVals>
	//    2    4:ifnonnull       8
_L1:
		int k;
		return;
	//    3    7:return          
	//*   4    8:aload_0         
	//*   5    9:getfield        #79  <Field List mYVals>
	//*   6   12:invokeinterface #62  <Method int List.size()>
	//*   7   17:istore_3        
_L2:
		if((k = mYVals.size()) == 0) goto _L1; else goto _L3
	//    8   18:iload_3         
	//    9   19:ifeq            7
_L3:
		if(j == 0 || j >= k)
	//*  10   22:iload_2         
	//*  11   23:ifeq            31
	//*  12   26:iload_2         
	//*  13   27:iload_3         
	//*  14   28:icmplt          142
			j = k - 1;
	//   15   31:iload_3         
	//   16   32:iconst_1        
	//   17   33:isub            
	//   18   34:istore_2        
		mYMin = 3.402823E+38F;
	//   19   35:aload_0         
	//   20   36:ldc1            #80  <Float 3.402823E+38F>
	//   21   38:putfield        #83  <Field float mYMin>
		mYMax = -3.402823E+38F;
	//   22   41:aload_0         
	//   23   42:ldc1            #84  <Float -3.402823E+38F>
	//   24   44:putfield        #87  <Field float mYMax>
_L5:
		BarEntry barentry;
		if(i > j)
			continue; /* Loop/switch isn't completed */
	//   25   47:iload_1         
	//   26   48:iload_2         
	//   27   49:icmpgt          194
		barentry = (BarEntry)mYVals.get(i);
	//   28   52:aload_0         
	//   29   53:getfield        #79  <Field List mYVals>
	//   30   56:iload_1         
	//   31   57:invokeinterface #66  <Method Object List.get(int)>
	//   32   62:checkcast       #68  <Class BarEntry>
	//   33   65:astore          4
		if(barentry != null && !Float.isNaN(barentry.getVal()))
	//*  34   67:aload           4
	//*  35   69:ifnull          135
	//*  36   72:aload           4
	//*  37   74:invokevirtual   #91  <Method float BarEntry.getVal()>
	//*  38   77:invokestatic    #97  <Method boolean Float.isNaN(float)>
	//*  39   80:ifne            135
		{
			if(barentry.getVals() != null)
				break; /* Loop/switch isn't completed */
	//   40   83:aload           4
	//   41   85:invokevirtual   #72  <Method float[] BarEntry.getVals()>
	//   42   88:ifnonnull       145
			if(barentry.getVal() < mYMin)
	//*  43   91:aload           4
	//*  44   93:invokevirtual   #91  <Method float BarEntry.getVal()>
	//*  45   96:aload_0         
	//*  46   97:getfield        #83  <Field float mYMin>
	//*  47  100:fcmpg           
	//*  48  101:ifge            113
				mYMin = barentry.getVal();
	//   49  104:aload_0         
	//   50  105:aload           4
	//   51  107:invokevirtual   #91  <Method float BarEntry.getVal()>
	//   52  110:putfield        #83  <Field float mYMin>
			if(barentry.getVal() > mYMax)
	//*  53  113:aload           4
	//*  54  115:invokevirtual   #91  <Method float BarEntry.getVal()>
	//*  55  118:aload_0         
	//*  56  119:getfield        #87  <Field float mYMax>
	//*  57  122:fcmpl           
	//*  58  123:ifle            135
				mYMax = barentry.getVal();
	//   59  126:aload_0         
	//   60  127:aload           4
	//   61  129:invokevirtual   #91  <Method float BarEntry.getVal()>
	//   62  132:putfield        #87  <Field float mYMax>
		}
_L6:
		i++;
	//   63  135:iload_1         
	//   64  136:iconst_1        
	//   65  137:iadd            
	//   66  138:istore_1        
		if(true) goto _L5; else goto _L4
	//   67  139:goto            47
	//*  68  142:goto            35
_L4:
		if(-barentry.getNegativeSum() < mYMin)
	//*  69  145:aload           4
	//*  70  147:invokevirtual   #100 <Method float BarEntry.getNegativeSum()>
	//*  71  150:fneg            
	//*  72  151:aload_0         
	//*  73  152:getfield        #83  <Field float mYMin>
	//*  74  155:fcmpg           
	//*  75  156:ifge            169
			mYMin = -barentry.getNegativeSum();
	//   76  159:aload_0         
	//   77  160:aload           4
	//   78  162:invokevirtual   #100 <Method float BarEntry.getNegativeSum()>
	//   79  165:fneg            
	//   80  166:putfield        #83  <Field float mYMin>
		if(barentry.getPositiveSum() > mYMax)
	//*  81  169:aload           4
	//*  82  171:invokevirtual   #103 <Method float BarEntry.getPositiveSum()>
	//*  83  174:aload_0         
	//*  84  175:getfield        #87  <Field float mYMax>
	//*  85  178:fcmpl           
	//*  86  179:ifle            135
			mYMax = barentry.getPositiveSum();
	//   87  182:aload_0         
	//   88  183:aload           4
	//   89  185:invokevirtual   #103 <Method float BarEntry.getPositiveSum()>
	//   90  188:putfield        #87  <Field float mYMax>
		  goto _L6
		if(true) goto _L5; else goto _L7
	//*  91  191:goto            135
_L7:
		if(mYMin != 3.402823E+38F) goto _L1; else goto _L8
	//   92  194:aload_0         
	//   93  195:getfield        #83  <Field float mYMin>
	//   94  198:ldc1            #80  <Float 3.402823E+38F>
	//   95  200:fcmpl           
	//   96  201:ifne            7
_L8:
		mYMin = 0.0F;
	//   97  204:aload_0         
	//   98  205:fconst_0        
	//   99  206:putfield        #83  <Field float mYMin>
		mYMax = 0.0F;
	//  100  209:aload_0         
	//  101  210:fconst_0        
	//  102  211:putfield        #87  <Field float mYMax>
		return;
	//  103  214:return          
	}

	public DataSet copy()
	{
		Object obj = ((Object) (new ArrayList()));
	//    0    0:new             #107 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #110 <Method void ArrayList()>
	//    3    7:astore_2        
		for(int i = 0; i < mYVals.size(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:getfield        #79  <Field List mYVals>
	//*   9   15:invokeinterface #62  <Method int List.size()>
	//*  10   20:icmpge          53
			((List) (obj)).add(((Object) (((BarEntry)mYVals.get(i)).copy())));
	//   11   23:aload_2         
	//   12   24:aload_0         
	//   13   25:getfield        #79  <Field List mYVals>
	//   14   28:iload_1         
	//   15   29:invokeinterface #66  <Method Object List.get(int)>
	//   16   34:checkcast       #68  <Class BarEntry>
	//   17   37:invokevirtual   #113 <Method BarEntry BarEntry.copy()>
	//   18   40:invokeinterface #117 <Method boolean List.add(Object)>
	//   19   45:pop             

	//   20   46:iload_1         
	//   21   47:iconst_1        
	//   22   48:iadd            
	//   23   49:istore_1        
	//*  24   50:goto            10
		obj = ((Object) (new BarDataSet(((List) (obj)), getLabel())));
	//   25   53:new             #2   <Class BarDataSet>
	//   26   56:dup             
	//   27   57:aload_2         
	//   28   58:aload_0         
	//   29   59:invokevirtual   #121 <Method String getLabel()>
	//   30   62:invokespecial   #122 <Method void BarDataSet(List, String)>
	//   31   65:astore_2        
		obj.mColors = mColors;
	//   32   66:aload_2         
	//   33   67:aload_0         
	//   34   68:getfield        #125 <Field List mColors>
	//   35   71:putfield        #125 <Field List mColors>
		obj.mStackSize = mStackSize;
	//   36   74:aload_2         
	//   37   75:aload_0         
	//   38   76:getfield        #25  <Field int mStackSize>
	//   39   79:putfield        #25  <Field int mStackSize>
		obj.mBarSpace = mBarSpace;
	//   40   82:aload_2         
	//   41   83:aload_0         
	//   42   84:getfield        #23  <Field float mBarSpace>
	//   43   87:putfield        #23  <Field float mBarSpace>
		obj.mBarShadowColor = mBarShadowColor;
	//   44   90:aload_2         
	//   45   91:aload_0         
	//   46   92:getfield        #33  <Field int mBarShadowColor>
	//   47   95:putfield        #33  <Field int mBarShadowColor>
		obj.mStackLabels = mStackLabels;
	//   48   98:aload_2         
	//   49   99:aload_0         
	//   50  100:getfield        #43  <Field String[] mStackLabels>
	//   51  103:putfield        #43  <Field String[] mStackLabels>
		obj.mHighLightColor = mHighLightColor;
	//   52  106:aload_2         
	//   53  107:aload_0         
	//   54  108:getfield        #46  <Field int mHighLightColor>
	//   55  111:putfield        #46  <Field int mHighLightColor>
		obj.mHighLightAlpha = mHighLightAlpha;
	//   56  114:aload_2         
	//   57  115:aload_0         
	//   58  116:getfield        #35  <Field int mHighLightAlpha>
	//   59  119:putfield        #35  <Field int mHighLightAlpha>
		return ((DataSet) (obj));
	//   60  122:aload_2         
	//   61  123:areturn         
	}

	public int getBarShadowColor()
	{
		return mBarShadowColor;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int mBarShadowColor>
	//    2    4:ireturn         
	}

	public float getBarSpace()
	{
		return mBarSpace;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field float mBarSpace>
	//    2    4:freturn         
	}

	public float getBarSpacePercent()
	{
		return mBarSpace * 100F;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field float mBarSpace>
	//    2    4:ldc1            #130 <Float 100F>
	//    3    6:fmul            
	//    4    7:freturn         
	}

	public int getEntryCountStacks()
	{
		return mEntryCountStacks;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int mEntryCountStacks>
	//    2    4:ireturn         
	}

	public int getHighLightAlpha()
	{
		return mHighLightAlpha;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int mHighLightAlpha>
	//    2    4:ireturn         
	}

	public String[] getStackLabels()
	{
		return mStackLabels;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field String[] mStackLabels>
	//    2    4:areturn         
	}

	public int getStackSize()
	{
		return mStackSize;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int mStackSize>
	//    2    4:ireturn         
	}

	public boolean isStacked()
	{
		return mStackSize > 1;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int mStackSize>
	//    2    4:iconst_1        
	//    3    5:icmple          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public void setBarShadowColor(int i)
	{
		mBarShadowColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #33  <Field int mBarShadowColor>
	//    3    5:return          
	}

	public void setBarSpacePercent(float f)
	{
		mBarSpace = f / 100F;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:ldc1            #130 <Float 100F>
	//    3    4:fdiv            
	//    4    5:putfield        #23  <Field float mBarSpace>
	//    5    8:return          
	}

	public void setHighLightAlpha(int i)
	{
		mHighLightAlpha = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #35  <Field int mHighLightAlpha>
	//    3    5:return          
	}

	public void setStackLabels(String as[])
	{
		mStackLabels = as;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field String[] mStackLabels>
	//    3    5:return          
	}

	private int mBarShadowColor;
	private float mBarSpace;
	private int mEntryCountStacks;
	private int mHighLightAlpha;
	private String mStackLabels[] = {
		"Stack"
	};
	private int mStackSize;
}
