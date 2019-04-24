// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data.realm.implementation;

import android.graphics.Color;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.realm.base.RealmBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import io.realm.*;
import java.util.Iterator;
import java.util.List;

public class RealmBarDataSet extends RealmBarLineScatterCandleBubbleDataSet
	implements IBarDataSet
{

	public RealmBarDataSet(RealmResults realmresults, String s, String s1)
	{
		super(realmresults, s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #21  <Method void RealmBarLineScatterCandleBubbleDataSet(RealmResults, String, String)>
		mBarSpace = 0.15F;
	//    5    7:aload_0         
	//    6    8:ldc1            #22  <Float 0.15F>
	//    7   10:putfield        #24  <Field float mBarSpace>
		mStackSize = 1;
	//    8   13:aload_0         
	//    9   14:iconst_1        
	//   10   15:putfield        #26  <Field int mStackSize>
		mBarShadowColor = Color.rgb(215, 215, 215);
	//   11   18:aload_0         
	//   12   19:sipush          215
	//   13   22:sipush          215
	//   14   25:sipush          215
	//   15   28:invokestatic    #32  <Method int Color.rgb(int, int, int)>
	//   16   31:putfield        #34  <Field int mBarShadowColor>
		mHighLightAlpha = 120;
	//   17   34:aload_0         
	//   18   35:bipush          120
	//   19   37:putfield        #36  <Field int mHighLightAlpha>
	//   20   40:aload_0         
	//   21   41:iconst_1        
	//   22   42:anewarray       String[]
	//   23   45:dup             
	//   24   46:iconst_0        
	//   25   47:ldc1            #40  <String "Stack">
	//   26   49:aastore         
	//   27   50:putfield        #42  <Field String[] mStackLabels>
		mHighLightColor = Color.rgb(0, 0, 0);
	//   28   53:aload_0         
	//   29   54:iconst_0        
	//   30   55:iconst_0        
	//   31   56:iconst_0        
	//   32   57:invokestatic    #32  <Method int Color.rgb(int, int, int)>
	//   33   60:putfield        #45  <Field int mHighLightColor>
		build(results);
	//   34   63:aload_0         
	//   35   64:aload_0         
	//   36   65:getfield        #49  <Field RealmResults results>
	//   37   68:invokevirtual   #53  <Method void build(RealmResults)>
		calcMinMax(0, realmresults.size());
	//   38   71:aload_0         
	//   39   72:iconst_0        
	//   40   73:aload_1         
	//   41   74:invokevirtual   #59  <Method int RealmResults.size()>
	//   42   77:invokevirtual   #63  <Method void calcMinMax(int, int)>
	//   43   80:return          
	}

	public RealmBarDataSet(RealmResults realmresults, String s, String s1, String s2)
	{
		super(realmresults, s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #21  <Method void RealmBarLineScatterCandleBubbleDataSet(RealmResults, String, String)>
		mBarSpace = 0.15F;
	//    5    7:aload_0         
	//    6    8:ldc1            #22  <Float 0.15F>
	//    7   10:putfield        #24  <Field float mBarSpace>
		mStackSize = 1;
	//    8   13:aload_0         
	//    9   14:iconst_1        
	//   10   15:putfield        #26  <Field int mStackSize>
		mBarShadowColor = Color.rgb(215, 215, 215);
	//   11   18:aload_0         
	//   12   19:sipush          215
	//   13   22:sipush          215
	//   14   25:sipush          215
	//   15   28:invokestatic    #32  <Method int Color.rgb(int, int, int)>
	//   16   31:putfield        #34  <Field int mBarShadowColor>
		mHighLightAlpha = 120;
	//   17   34:aload_0         
	//   18   35:bipush          120
	//   19   37:putfield        #36  <Field int mHighLightAlpha>
	//   20   40:aload_0         
	//   21   41:iconst_1        
	//   22   42:anewarray       String[]
	//   23   45:dup             
	//   24   46:iconst_0        
	//   25   47:ldc1            #40  <String "Stack">
	//   26   49:aastore         
	//   27   50:putfield        #42  <Field String[] mStackLabels>
		mStackValueFieldName = s2;
	//   28   53:aload_0         
	//   29   54:aload           4
	//   30   56:putfield        #69  <Field String mStackValueFieldName>
		mHighLightColor = Color.rgb(0, 0, 0);
	//   31   59:aload_0         
	//   32   60:iconst_0        
	//   33   61:iconst_0        
	//   34   62:iconst_0        
	//   35   63:invokestatic    #32  <Method int Color.rgb(int, int, int)>
	//   36   66:putfield        #45  <Field int mHighLightColor>
		build(results);
	//   37   69:aload_0         
	//   38   70:aload_0         
	//   39   71:getfield        #49  <Field RealmResults results>
	//   40   74:invokevirtual   #53  <Method void build(RealmResults)>
		calcMinMax(0, realmresults.size());
	//   41   77:aload_0         
	//   42   78:iconst_0        
	//   43   79:aload_1         
	//   44   80:invokevirtual   #59  <Method int RealmResults.size()>
	//   45   83:invokevirtual   #63  <Method void calcMinMax(int, int)>
	//   46   86:return          
	}

	private void calcStackSize()
	{
		for(int i = 0; i < mValues.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #76  <Field List mValues>
	//*   5    7:invokeinterface #79  <Method int List.size()>
	//*   6   12:icmpge          58
		{
			float af[] = ((BarEntry)mValues.get(i)).getVals();
	//    7   15:aload_0         
	//    8   16:getfield        #76  <Field List mValues>
	//    9   19:iload_1         
	//   10   20:invokeinterface #83  <Method Object List.get(int)>
	//   11   25:checkcast       #85  <Class BarEntry>
	//   12   28:invokevirtual   #89  <Method float[] BarEntry.getVals()>
	//   13   31:astore_2        
			if(af != null && af.length > mStackSize)
	//*  14   32:aload_2         
	//*  15   33:ifnull          51
	//*  16   36:aload_2         
	//*  17   37:arraylength     
	//*  18   38:aload_0         
	//*  19   39:getfield        #26  <Field int mStackSize>
	//*  20   42:icmple          51
				mStackSize = af.length;
	//   21   45:aload_0         
	//   22   46:aload_2         
	//   23   47:arraylength     
	//   24   48:putfield        #26  <Field int mStackSize>
		}

	//   25   51:iload_1         
	//   26   52:iconst_1        
	//   27   53:iadd            
	//   28   54:istore_1        
	//*  29   55:goto            2
	//   30   58:return          
	}

	public void build(RealmResults realmresults)
	{
		for(realmresults = ((RealmResults) (realmresults.iterator())); ((Iterator) (realmresults)).hasNext();)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #95  <Method Iterator RealmResults.iterator()>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:invokeinterface #101 <Method boolean Iterator.hasNext()>
	//*   5   11:ifeq            172
		{
			DynamicRealmObject dynamicrealmobject = new DynamicRealmObject((RealmObject)((Iterator) (realmresults)).next());
	//    6   14:new             #103 <Class DynamicRealmObject>
	//    7   17:dup             
	//    8   18:aload_1         
	//    9   19:invokeinterface #107 <Method Object Iterator.next()>
	//   10   24:checkcast       #109 <Class RealmObject>
	//   11   27:invokespecial   #112 <Method void DynamicRealmObject(RealmObject)>
	//   12   30:astore          4
			try
			{
				float f = dynamicrealmobject.getFloat(mValuesField);
	//   13   32:aload           4
	//   14   34:aload_0         
	//   15   35:getfield        #115 <Field String mValuesField>
	//   16   38:invokevirtual   #119 <Method float DynamicRealmObject.getFloat(String)>
	//   17   41:fstore_2        
				mValues.add(((Object) (new BarEntry(f, dynamicrealmobject.getInt(mIndexField)))));
	//   18   42:aload_0         
	//   19   43:getfield        #76  <Field List mValues>
	//   20   46:new             #85  <Class BarEntry>
	//   21   49:dup             
	//   22   50:fload_2         
	//   23   51:aload           4
	//   24   53:aload_0         
	//   25   54:getfield        #122 <Field String mIndexField>
	//   26   57:invokevirtual   #126 <Method int DynamicRealmObject.getInt(String)>
	//   27   60:invokespecial   #129 <Method void BarEntry(float, int)>
	//   28   63:invokeinterface #133 <Method boolean List.add(Object)>
	//   29   68:pop             
			}
	//*  30   69:goto            5
			catch(IllegalArgumentException illegalargumentexception)
	//*  31   72:astore          5
			{
				Object obj = ((Object) (dynamicrealmobject.getList(mValuesField)));
	//   32   74:aload           4
	//   33   76:aload_0         
	//   34   77:getfield        #115 <Field String mValuesField>
	//   35   80:invokevirtual   #137 <Method RealmList DynamicRealmObject.getList(String)>
	//   36   83:astore          6
				float af[] = new float[((RealmList) (obj)).size()];
	//   37   85:aload           6
	//   38   87:invokevirtual   #140 <Method int RealmList.size()>
	//   39   90:newarray        float[]
	//   40   92:astore          5
				int i = 0;
	//   41   94:iconst_0        
	//   42   95:istore_3        
				for(obj = ((Object) (((RealmList) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
	//*  43   96:aload           6
	//*  44   98:invokevirtual   #141 <Method Iterator RealmList.iterator()>
	//*  45  101:astore          6
	//*  46  103:aload           6
	//*  47  105:invokeinterface #101 <Method boolean Iterator.hasNext()>
	//*  48  110:ifeq            141
				{
					af[i] = ((DynamicRealmObject)((Iterator) (obj)).next()).getFloat(mStackValueFieldName);
	//   49  113:aload           5
	//   50  115:iload_3         
	//   51  116:aload           6
	//   52  118:invokeinterface #107 <Method Object Iterator.next()>
	//   53  123:checkcast       #103 <Class DynamicRealmObject>
	//   54  126:aload_0         
	//   55  127:getfield        #69  <Field String mStackValueFieldName>
	//   56  130:invokevirtual   #119 <Method float DynamicRealmObject.getFloat(String)>
	//   57  133:fastore         
					i++;
	//   58  134:iload_3         
	//   59  135:iconst_1        
	//   60  136:iadd            
	//   61  137:istore_3        
				}

	//*  62  138:goto            103
				mValues.add(((Object) (new BarEntry(af, dynamicrealmobject.getInt(mIndexField)))));
	//   63  141:aload_0         
	//   64  142:getfield        #76  <Field List mValues>
	//   65  145:new             #85  <Class BarEntry>
	//   66  148:dup             
	//   67  149:aload           5
	//   68  151:aload           4
	//   69  153:aload_0         
	//   70  154:getfield        #122 <Field String mIndexField>
	//   71  157:invokevirtual   #126 <Method int DynamicRealmObject.getInt(String)>
	//   72  160:invokespecial   #144 <Method void BarEntry(float[], int)>
	//   73  163:invokeinterface #133 <Method boolean List.add(Object)>
	//   74  168:pop             
			}
		}

	//*  75  169:goto            5
		calcStackSize();
	//   76  172:aload_0         
	//   77  173:invokespecial   #146 <Method void calcStackSize()>
	//   78  176:return          
	}

	public void calcMinMax(int i, int j)
	{
		if(mValues != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field List mValues>
	//    2    4:ifnonnull       8
_L1:
		int k;
		return;
	//    3    7:return          
	//*   4    8:aload_0         
	//*   5    9:getfield        #76  <Field List mValues>
	//*   6   12:invokeinterface #79  <Method int List.size()>
	//*   7   17:istore_3        
_L2:
		if((k = mValues.size()) == 0) goto _L1; else goto _L3
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
	//   20   36:ldc1            #148 <Float 3.402823E+38F>
	//   21   38:putfield        #151 <Field float mYMin>
		mYMax = -3.402823E+38F;
	//   22   41:aload_0         
	//   23   42:ldc1            #152 <Float -3.402823E+38F>
	//   24   44:putfield        #155 <Field float mYMax>
_L5:
		BarEntry barentry;
		if(i > j)
			continue; /* Loop/switch isn't completed */
	//   25   47:iload_1         
	//   26   48:iload_2         
	//   27   49:icmpgt          194
		barentry = (BarEntry)mValues.get(i);
	//   28   52:aload_0         
	//   29   53:getfield        #76  <Field List mValues>
	//   30   56:iload_1         
	//   31   57:invokeinterface #83  <Method Object List.get(int)>
	//   32   62:checkcast       #85  <Class BarEntry>
	//   33   65:astore          4
		if(barentry != null && !Float.isNaN(barentry.getVal()))
	//*  34   67:aload           4
	//*  35   69:ifnull          135
	//*  36   72:aload           4
	//*  37   74:invokevirtual   #159 <Method float BarEntry.getVal()>
	//*  38   77:invokestatic    #165 <Method boolean Float.isNaN(float)>
	//*  39   80:ifne            135
		{
			if(barentry.getVals() != null)
				break; /* Loop/switch isn't completed */
	//   40   83:aload           4
	//   41   85:invokevirtual   #89  <Method float[] BarEntry.getVals()>
	//   42   88:ifnonnull       145
			if(barentry.getVal() < mYMin)
	//*  43   91:aload           4
	//*  44   93:invokevirtual   #159 <Method float BarEntry.getVal()>
	//*  45   96:aload_0         
	//*  46   97:getfield        #151 <Field float mYMin>
	//*  47  100:fcmpg           
	//*  48  101:ifge            113
				mYMin = barentry.getVal();
	//   49  104:aload_0         
	//   50  105:aload           4
	//   51  107:invokevirtual   #159 <Method float BarEntry.getVal()>
	//   52  110:putfield        #151 <Field float mYMin>
			if(barentry.getVal() > mYMax)
	//*  53  113:aload           4
	//*  54  115:invokevirtual   #159 <Method float BarEntry.getVal()>
	//*  55  118:aload_0         
	//*  56  119:getfield        #155 <Field float mYMax>
	//*  57  122:fcmpl           
	//*  58  123:ifle            135
				mYMax = barentry.getVal();
	//   59  126:aload_0         
	//   60  127:aload           4
	//   61  129:invokevirtual   #159 <Method float BarEntry.getVal()>
	//   62  132:putfield        #155 <Field float mYMax>
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
	//*  70  147:invokevirtual   #168 <Method float BarEntry.getNegativeSum()>
	//*  71  150:fneg            
	//*  72  151:aload_0         
	//*  73  152:getfield        #151 <Field float mYMin>
	//*  74  155:fcmpg           
	//*  75  156:ifge            169
			mYMin = -barentry.getNegativeSum();
	//   76  159:aload_0         
	//   77  160:aload           4
	//   78  162:invokevirtual   #168 <Method float BarEntry.getNegativeSum()>
	//   79  165:fneg            
	//   80  166:putfield        #151 <Field float mYMin>
		if(barentry.getPositiveSum() > mYMax)
	//*  81  169:aload           4
	//*  82  171:invokevirtual   #171 <Method float BarEntry.getPositiveSum()>
	//*  83  174:aload_0         
	//*  84  175:getfield        #155 <Field float mYMax>
	//*  85  178:fcmpl           
	//*  86  179:ifle            135
			mYMax = barentry.getPositiveSum();
	//   87  182:aload_0         
	//   88  183:aload           4
	//   89  185:invokevirtual   #171 <Method float BarEntry.getPositiveSum()>
	//   90  188:putfield        #155 <Field float mYMax>
		  goto _L6
		if(true) goto _L5; else goto _L7
	//*  91  191:goto            135
_L7:
		if(mYMin != 3.402823E+38F) goto _L1; else goto _L8
	//   92  194:aload_0         
	//   93  195:getfield        #151 <Field float mYMin>
	//   94  198:ldc1            #148 <Float 3.402823E+38F>
	//   95  200:fcmpl           
	//   96  201:ifne            7
_L8:
		mYMin = 0.0F;
	//   97  204:aload_0         
	//   98  205:fconst_0        
	//   99  206:putfield        #151 <Field float mYMin>
		mYMax = 0.0F;
	//  100  209:aload_0         
	//  101  210:fconst_0        
	//  102  211:putfield        #155 <Field float mYMax>
		return;
	//  103  214:return          
	}

	public int getBarShadowColor()
	{
		return mBarShadowColor;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int mBarShadowColor>
	//    2    4:ireturn         
	}

	public float getBarSpace()
	{
		return mBarSpace;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field float mBarSpace>
	//    2    4:freturn         
	}

	public float getBarSpacePercent()
	{
		return mBarSpace * 100F;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field float mBarSpace>
	//    2    4:ldc1            #175 <Float 100F>
	//    3    6:fmul            
	//    4    7:freturn         
	}

	public int getHighLightAlpha()
	{
		return mHighLightAlpha;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int mHighLightAlpha>
	//    2    4:ireturn         
	}

	public String[] getStackLabels()
	{
		return mStackLabels;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String[] mStackLabels>
	//    2    4:areturn         
	}

	public int getStackSize()
	{
		return mStackSize;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int mStackSize>
	//    2    4:ireturn         
	}

	public boolean isStacked()
	{
		return mStackSize > 1;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int mStackSize>
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
	//    2    2:putfield        #34  <Field int mBarShadowColor>
	//    3    5:return          
	}

	public void setBarSpacePercent(float f)
	{
		mBarSpace = f / 100F;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:ldc1            #175 <Float 100F>
	//    3    4:fdiv            
	//    4    5:putfield        #24  <Field float mBarSpace>
	//    5    8:return          
	}

	public void setHighLightAlpha(int i)
	{
		mHighLightAlpha = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #36  <Field int mHighLightAlpha>
	//    3    5:return          
	}

	public void setStackLabels(String as[])
	{
		mStackLabels = as;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #42  <Field String[] mStackLabels>
	//    3    5:return          
	}

	private int mBarShadowColor;
	private float mBarSpace;
	private int mHighLightAlpha;
	private String mStackLabels[] = {
		"Stack"
	};
	private int mStackSize;
	private String mStackValueFieldName;
}
