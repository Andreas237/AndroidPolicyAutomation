// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data.realm.implementation;

import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.realm.base.RealmLineScatterCandleRadarDataSet;
import com.github.mikephil.charting.interfaces.datasets.ICandleDataSet;
import com.github.mikephil.charting.utils.Utils;
import io.realm.*;
import java.util.Iterator;
import java.util.List;

public class RealmCandleDataSet extends RealmLineScatterCandleRadarDataSet
	implements ICandleDataSet
{

	public RealmCandleDataSet(RealmResults realmresults, String s, String s1, String s2, String s3)
	{
		super(realmresults, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #31  <Method void RealmLineScatterCandleRadarDataSet(RealmResults, String)>
		mShadowWidth = 3F;
	//    4    6:aload_0         
	//    5    7:ldc1            #32  <Float 3F>
	//    6    9:putfield        #34  <Field float mShadowWidth>
		mShowCandleBar = true;
	//    7   12:aload_0         
	//    8   13:iconst_1        
	//    9   14:putfield        #36  <Field boolean mShowCandleBar>
		mBarSpace = 0.1F;
	//   10   17:aload_0         
	//   11   18:ldc1            #37  <Float 0.1F>
	//   12   20:putfield        #39  <Field float mBarSpace>
		mShadowColorSameAsCandle = false;
	//   13   23:aload_0         
	//   14   24:iconst_0        
	//   15   25:putfield        #41  <Field boolean mShadowColorSameAsCandle>
		mIncreasingPaintStyle = android.graphics.Paint.Style.STROKE;
	//   16   28:aload_0         
	//   17   29:getstatic       #46  <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   18   32:putfield        #48  <Field android.graphics.Paint$Style mIncreasingPaintStyle>
		mDecreasingPaintStyle = android.graphics.Paint.Style.FILL;
	//   19   35:aload_0         
	//   20   36:getstatic       #51  <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   21   39:putfield        #53  <Field android.graphics.Paint$Style mDecreasingPaintStyle>
		mNeutralColor = -1;
	//   22   42:aload_0         
	//   23   43:iconst_m1       
	//   24   44:putfield        #55  <Field int mNeutralColor>
		mIncreasingColor = -1;
	//   25   47:aload_0         
	//   26   48:iconst_m1       
	//   27   49:putfield        #57  <Field int mIncreasingColor>
		mDecreasingColor = -1;
	//   28   52:aload_0         
	//   29   53:iconst_m1       
	//   30   54:putfield        #59  <Field int mDecreasingColor>
		mShadowColor = -1;
	//   31   57:aload_0         
	//   32   58:iconst_m1       
	//   33   59:putfield        #61  <Field int mShadowColor>
		mHighField = s;
	//   34   62:aload_0         
	//   35   63:aload_2         
	//   36   64:putfield        #63  <Field String mHighField>
		mLowField = s1;
	//   37   67:aload_0         
	//   38   68:aload_3         
	//   39   69:putfield        #65  <Field String mLowField>
		mOpenField = s2;
	//   40   72:aload_0         
	//   41   73:aload           4
	//   42   75:putfield        #67  <Field String mOpenField>
		mCloseField = s3;
	//   43   78:aload_0         
	//   44   79:aload           5
	//   45   81:putfield        #69  <Field String mCloseField>
		build(results);
	//   46   84:aload_0         
	//   47   85:aload_0         
	//   48   86:getfield        #73  <Field RealmResults results>
	//   49   89:invokevirtual   #77  <Method void build(RealmResults)>
		calcMinMax(0, results.size());
	//   50   92:aload_0         
	//   51   93:iconst_0        
	//   52   94:aload_0         
	//   53   95:getfield        #73  <Field RealmResults results>
	//   54   98:invokevirtual   #83  <Method int RealmResults.size()>
	//   55  101:invokevirtual   #87  <Method void calcMinMax(int, int)>
	//   56  104:return          
	}

	public RealmCandleDataSet(RealmResults realmresults, String s, String s1, String s2, String s3, String s4)
	{
		super(realmresults, ((String) (null)), s4);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload           6
	//    4    5:invokespecial   #94  <Method void RealmLineScatterCandleRadarDataSet(RealmResults, String, String)>
		mShadowWidth = 3F;
	//    5    8:aload_0         
	//    6    9:ldc1            #32  <Float 3F>
	//    7   11:putfield        #34  <Field float mShadowWidth>
		mShowCandleBar = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #36  <Field boolean mShowCandleBar>
		mBarSpace = 0.1F;
	//   11   19:aload_0         
	//   12   20:ldc1            #37  <Float 0.1F>
	//   13   22:putfield        #39  <Field float mBarSpace>
		mShadowColorSameAsCandle = false;
	//   14   25:aload_0         
	//   15   26:iconst_0        
	//   16   27:putfield        #41  <Field boolean mShadowColorSameAsCandle>
		mIncreasingPaintStyle = android.graphics.Paint.Style.STROKE;
	//   17   30:aload_0         
	//   18   31:getstatic       #46  <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   19   34:putfield        #48  <Field android.graphics.Paint$Style mIncreasingPaintStyle>
		mDecreasingPaintStyle = android.graphics.Paint.Style.FILL;
	//   20   37:aload_0         
	//   21   38:getstatic       #51  <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   22   41:putfield        #53  <Field android.graphics.Paint$Style mDecreasingPaintStyle>
		mNeutralColor = -1;
	//   23   44:aload_0         
	//   24   45:iconst_m1       
	//   25   46:putfield        #55  <Field int mNeutralColor>
		mIncreasingColor = -1;
	//   26   49:aload_0         
	//   27   50:iconst_m1       
	//   28   51:putfield        #57  <Field int mIncreasingColor>
		mDecreasingColor = -1;
	//   29   54:aload_0         
	//   30   55:iconst_m1       
	//   31   56:putfield        #59  <Field int mDecreasingColor>
		mShadowColor = -1;
	//   32   59:aload_0         
	//   33   60:iconst_m1       
	//   34   61:putfield        #61  <Field int mShadowColor>
		mHighField = s;
	//   35   64:aload_0         
	//   36   65:aload_2         
	//   37   66:putfield        #63  <Field String mHighField>
		mLowField = s1;
	//   38   69:aload_0         
	//   39   70:aload_3         
	//   40   71:putfield        #65  <Field String mLowField>
		mOpenField = s2;
	//   41   74:aload_0         
	//   42   75:aload           4
	//   43   77:putfield        #67  <Field String mOpenField>
		mCloseField = s3;
	//   44   80:aload_0         
	//   45   81:aload           5
	//   46   83:putfield        #69  <Field String mCloseField>
		build(results);
	//   47   86:aload_0         
	//   48   87:aload_0         
	//   49   88:getfield        #73  <Field RealmResults results>
	//   50   91:invokevirtual   #77  <Method void build(RealmResults)>
		calcMinMax(0, results.size());
	//   51   94:aload_0         
	//   52   95:iconst_0        
	//   53   96:aload_0         
	//   54   97:getfield        #73  <Field RealmResults results>
	//   55  100:invokevirtual   #83  <Method int RealmResults.size()>
	//   56  103:invokevirtual   #87  <Method void calcMinMax(int, int)>
	//   57  106:return          
	}

	public void build(RealmResults realmresults)
	{
		if(mIndexField == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field String mIndexField>
	//*   2    4:ifnonnull       97
		{
			int i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_2        
			for(realmresults = ((RealmResults) (realmresults.iterator())); ((Iterator) (realmresults)).hasNext();)
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #102 <Method Iterator RealmResults.iterator()>
	//*   7   13:astore_1        
	//*   8   14:aload_1         
	//*   9   15:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//*  10   20:ifeq            188
			{
				DynamicRealmObject dynamicrealmobject = new DynamicRealmObject((RealmObject)((Iterator) (realmresults)).next());
	//   11   23:new             #110 <Class DynamicRealmObject>
	//   12   26:dup             
	//   13   27:aload_1         
	//   14   28:invokeinterface #114 <Method Object Iterator.next()>
	//   15   33:checkcast       #116 <Class RealmObject>
	//   16   36:invokespecial   #119 <Method void DynamicRealmObject(RealmObject)>
	//   17   39:astore_3        
				mValues.add(((Object) (new CandleEntry(i, dynamicrealmobject.getFloat(mHighField), dynamicrealmobject.getFloat(mLowField), dynamicrealmobject.getFloat(mOpenField), dynamicrealmobject.getFloat(mCloseField)))));
	//   18   40:aload_0         
	//   19   41:getfield        #123 <Field List mValues>
	//   20   44:new             #125 <Class CandleEntry>
	//   21   47:dup             
	//   22   48:iload_2         
	//   23   49:aload_3         
	//   24   50:aload_0         
	//   25   51:getfield        #63  <Field String mHighField>
	//   26   54:invokevirtual   #129 <Method float DynamicRealmObject.getFloat(String)>
	//   27   57:aload_3         
	//   28   58:aload_0         
	//   29   59:getfield        #65  <Field String mLowField>
	//   30   62:invokevirtual   #129 <Method float DynamicRealmObject.getFloat(String)>
	//   31   65:aload_3         
	//   32   66:aload_0         
	//   33   67:getfield        #67  <Field String mOpenField>
	//   34   70:invokevirtual   #129 <Method float DynamicRealmObject.getFloat(String)>
	//   35   73:aload_3         
	//   36   74:aload_0         
	//   37   75:getfield        #69  <Field String mCloseField>
	//   38   78:invokevirtual   #129 <Method float DynamicRealmObject.getFloat(String)>
	//   39   81:invokespecial   #132 <Method void CandleEntry(int, float, float, float, float)>
	//   40   84:invokeinterface #138 <Method boolean List.add(Object)>
	//   41   89:pop             
				i++;
	//   42   90:iload_2         
	//   43   91:iconst_1        
	//   44   92:iadd            
	//   45   93:istore_2        
			}

		} else
	//*  46   94:goto            14
		{
			DynamicRealmObject dynamicrealmobject1;
			for(realmresults = ((RealmResults) (realmresults.iterator())); ((Iterator) (realmresults)).hasNext(); mValues.add(((Object) (new CandleEntry(dynamicrealmobject1.getInt(mIndexField), dynamicrealmobject1.getFloat(mHighField), dynamicrealmobject1.getFloat(mLowField), dynamicrealmobject1.getFloat(mOpenField), dynamicrealmobject1.getFloat(mCloseField))))))
	//*  47   97:aload_1         
	//*  48   98:invokevirtual   #102 <Method Iterator RealmResults.iterator()>
	//*  49  101:astore_1        
	//*  50  102:aload_1         
	//*  51  103:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//*  52  108:ifeq            188
				dynamicrealmobject1 = new DynamicRealmObject((RealmObject)((Iterator) (realmresults)).next());
	//   53  111:new             #110 <Class DynamicRealmObject>
	//   54  114:dup             
	//   55  115:aload_1         
	//   56  116:invokeinterface #114 <Method Object Iterator.next()>
	//   57  121:checkcast       #116 <Class RealmObject>
	//   58  124:invokespecial   #119 <Method void DynamicRealmObject(RealmObject)>
	//   59  127:astore_3        

	//   60  128:aload_0         
	//   61  129:getfield        #123 <Field List mValues>
	//   62  132:new             #125 <Class CandleEntry>
	//   63  135:dup             
	//   64  136:aload_3         
	//   65  137:aload_0         
	//   66  138:getfield        #98  <Field String mIndexField>
	//   67  141:invokevirtual   #142 <Method int DynamicRealmObject.getInt(String)>
	//   68  144:aload_3         
	//   69  145:aload_0         
	//   70  146:getfield        #63  <Field String mHighField>
	//   71  149:invokevirtual   #129 <Method float DynamicRealmObject.getFloat(String)>
	//   72  152:aload_3         
	//   73  153:aload_0         
	//   74  154:getfield        #65  <Field String mLowField>
	//   75  157:invokevirtual   #129 <Method float DynamicRealmObject.getFloat(String)>
	//   76  160:aload_3         
	//   77  161:aload_0         
	//   78  162:getfield        #67  <Field String mOpenField>
	//   79  165:invokevirtual   #129 <Method float DynamicRealmObject.getFloat(String)>
	//   80  168:aload_3         
	//   81  169:aload_0         
	//   82  170:getfield        #69  <Field String mCloseField>
	//   83  173:invokevirtual   #129 <Method float DynamicRealmObject.getFloat(String)>
	//   84  176:invokespecial   #132 <Method void CandleEntry(int, float, float, float, float)>
	//   85  179:invokeinterface #138 <Method boolean List.add(Object)>
	//   86  184:pop             
		}
	//*  87  185:goto            102
	//   88  188:return          
	}

	public void calcMinMax(int i, int j)
	{
		if(mValues != null && mValues.size() != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #123 <Field List mValues>
	//*   2    4:ifnonnull       8
	//*   3    7:return          
	//*   4    8:aload_0         
	//*   5    9:getfield        #123 <Field List mValues>
	//*   6   12:invokeinterface #144 <Method int List.size()>
	//*   7   17:ifeq            7
		{
			if(j == 0 || j >= mValues.size())
	//*   8   20:iload_2         
	//*   9   21:ifeq            37
	//*  10   24:iload_2         
	//*  11   25:aload_0         
	//*  12   26:getfield        #123 <Field List mValues>
	//*  13   29:invokeinterface #144 <Method int List.size()>
	//*  14   34:icmplt          127
				j = mValues.size() - 1;
	//   15   37:aload_0         
	//   16   38:getfield        #123 <Field List mValues>
	//   17   41:invokeinterface #144 <Method int List.size()>
	//   18   46:iconst_1        
	//   19   47:isub            
	//   20   48:istore_2        
			mYMin = 3.402823E+38F;
	//   21   49:aload_0         
	//   22   50:ldc1            #145 <Float 3.402823E+38F>
	//   23   52:putfield        #148 <Field float mYMin>
			mYMax = -3.402823E+38F;
	//   24   55:aload_0         
	//   25   56:ldc1            #149 <Float -3.402823E+38F>
	//   26   58:putfield        #152 <Field float mYMax>
			while(i <= j) 
	//*  27   61:iload_1         
	//*  28   62:iload_2         
	//*  29   63:icmpgt          7
			{
				CandleEntry candleentry = (CandleEntry)mValues.get(i);
	//   30   66:aload_0         
	//   31   67:getfield        #123 <Field List mValues>
	//   32   70:iload_1         
	//   33   71:invokeinterface #156 <Method Object List.get(int)>
	//   34   76:checkcast       #125 <Class CandleEntry>
	//   35   79:astore_3        
				if(candleentry.getLow() < mYMin)
	//*  36   80:aload_3         
	//*  37   81:invokevirtual   #160 <Method float CandleEntry.getLow()>
	//*  38   84:aload_0         
	//*  39   85:getfield        #148 <Field float mYMin>
	//*  40   88:fcmpg           
	//*  41   89:ifge            100
					mYMin = candleentry.getLow();
	//   42   92:aload_0         
	//   43   93:aload_3         
	//   44   94:invokevirtual   #160 <Method float CandleEntry.getLow()>
	//   45   97:putfield        #148 <Field float mYMin>
				if(candleentry.getHigh() > mYMax)
	//*  46  100:aload_3         
	//*  47  101:invokevirtual   #163 <Method float CandleEntry.getHigh()>
	//*  48  104:aload_0         
	//*  49  105:getfield        #152 <Field float mYMax>
	//*  50  108:fcmpl           
	//*  51  109:ifle            120
					mYMax = candleentry.getHigh();
	//   52  112:aload_0         
	//   53  113:aload_3         
	//   54  114:invokevirtual   #163 <Method float CandleEntry.getHigh()>
	//   55  117:putfield        #152 <Field float mYMax>
				i++;
	//   56  120:iload_1         
	//   57  121:iconst_1        
	//   58  122:iadd            
	//   59  123:istore_1        
			}
		}
	//*  60  124:goto            61
	//*  61  127:goto            49
	}

	public float getBarSpace()
	{
		return mBarSpace;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field float mBarSpace>
	//    2    4:freturn         
	}

	public int getDecreasingColor()
	{
		return mDecreasingColor;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field int mDecreasingColor>
	//    2    4:ireturn         
	}

	public android.graphics.Paint.Style getDecreasingPaintStyle()
	{
		return mDecreasingPaintStyle;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field android.graphics.Paint$Style mDecreasingPaintStyle>
	//    2    4:areturn         
	}

	public int getIncreasingColor()
	{
		return mIncreasingColor;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field int mIncreasingColor>
	//    2    4:ireturn         
	}

	public android.graphics.Paint.Style getIncreasingPaintStyle()
	{
		return mIncreasingPaintStyle;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field android.graphics.Paint$Style mIncreasingPaintStyle>
	//    2    4:areturn         
	}

	public int getNeutralColor()
	{
		return mNeutralColor;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int mNeutralColor>
	//    2    4:ireturn         
	}

	public int getShadowColor()
	{
		return mShadowColor;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int mShadowColor>
	//    2    4:ireturn         
	}

	public boolean getShadowColorSameAsCandle()
	{
		return mShadowColorSameAsCandle;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field boolean mShadowColorSameAsCandle>
	//    2    4:ireturn         
	}

	public float getShadowWidth()
	{
		return mShadowWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field float mShadowWidth>
	//    2    4:freturn         
	}

	public boolean getShowCandleBar()
	{
		return mShowCandleBar;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean mShowCandleBar>
	//    2    4:ireturn         
	}

	public void setBarSpace(float f)
	{
		float f1 = f;
	//    0    0:fload_1         
	//    1    1:fstore_2        
		if(f < 0.0F)
	//*   2    2:fload_1         
	//*   3    3:fconst_0        
	//*   4    4:fcmpg           
	//*   5    5:ifge            10
			f1 = 0.0F;
	//    6    8:fconst_0        
	//    7    9:fstore_2        
		f = f1;
	//    8   10:fload_2         
	//    9   11:fstore_1        
		if(f1 > 0.45F)
	//*  10   12:fload_2         
	//*  11   13:ldc1            #177 <Float 0.45F>
	//*  12   15:fcmpl           
	//*  13   16:ifle            22
			f = 0.45F;
	//   14   19:ldc1            #177 <Float 0.45F>
	//   15   21:fstore_1        
		mBarSpace = f;
	//   16   22:aload_0         
	//   17   23:fload_1         
	//   18   24:putfield        #39  <Field float mBarSpace>
	//   19   27:return          
	}

	public void setDecreasingColor(int i)
	{
		mDecreasingColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #59  <Field int mDecreasingColor>
	//    3    5:return          
	}

	public void setDecreasingPaintStyle(android.graphics.Paint.Style style)
	{
		mDecreasingPaintStyle = style;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #53  <Field android.graphics.Paint$Style mDecreasingPaintStyle>
	//    3    5:return          
	}

	public void setIncreasingColor(int i)
	{
		mIncreasingColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #57  <Field int mIncreasingColor>
	//    3    5:return          
	}

	public void setIncreasingPaintStyle(android.graphics.Paint.Style style)
	{
		mIncreasingPaintStyle = style;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #48  <Field android.graphics.Paint$Style mIncreasingPaintStyle>
	//    3    5:return          
	}

	public void setNeutralColor(int i)
	{
		mNeutralColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #55  <Field int mNeutralColor>
	//    3    5:return          
	}

	public void setShadowColor(int i)
	{
		mShadowColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #61  <Field int mShadowColor>
	//    3    5:return          
	}

	public void setShadowColorSameAsCandle(boolean flag)
	{
		mShadowColorSameAsCandle = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #41  <Field boolean mShadowColorSameAsCandle>
	//    3    5:return          
	}

	public void setShadowWidth(float f)
	{
		mShadowWidth = Utils.convertDpToPixel(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #194 <Method float Utils.convertDpToPixel(float)>
	//    3    5:putfield        #34  <Field float mShadowWidth>
	//    4    8:return          
	}

	public void setShadowWidth(boolean flag)
	{
		mShowCandleBar = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #36  <Field boolean mShowCandleBar>
	//    3    5:return          
	}

	private float mBarSpace;
	private String mCloseField;
	protected int mDecreasingColor;
	protected android.graphics.Paint.Style mDecreasingPaintStyle;
	private String mHighField;
	protected int mIncreasingColor;
	protected android.graphics.Paint.Style mIncreasingPaintStyle;
	private String mLowField;
	protected int mNeutralColor;
	private String mOpenField;
	protected int mShadowColor;
	private boolean mShadowColorSameAsCandle;
	private float mShadowWidth;
	private boolean mShowCandleBar;
}
