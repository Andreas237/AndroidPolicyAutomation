// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data.realm.implementation;

import com.github.mikephil.charting.data.BubbleEntry;
import com.github.mikephil.charting.data.realm.base.RealmBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet;
import com.github.mikephil.charting.utils.Utils;
import io.realm.*;
import java.util.Iterator;
import java.util.List;

public class RealmBubbleDataSet extends RealmBarLineScatterCandleBubbleDataSet
	implements IBubbleDataSet
{

	public RealmBubbleDataSet(RealmResults realmresults, String s, String s1)
	{
		super(realmresults, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #19  <Method void RealmBarLineScatterCandleBubbleDataSet(RealmResults, String)>
		mHighlightCircleWidth = 2.5F;
	//    4    6:aload_0         
	//    5    7:ldc1            #20  <Float 2.5F>
	//    6    9:putfield        #22  <Field float mHighlightCircleWidth>
		mSizeField = s1;
	//    7   12:aload_0         
	//    8   13:aload_3         
	//    9   14:putfield        #24  <Field String mSizeField>
		build(results);
	//   10   17:aload_0         
	//   11   18:aload_0         
	//   12   19:getfield        #28  <Field RealmResults results>
	//   13   22:invokevirtual   #32  <Method void build(RealmResults)>
		calcMinMax(0, results.size());
	//   14   25:aload_0         
	//   15   26:iconst_0        
	//   16   27:aload_0         
	//   17   28:getfield        #28  <Field RealmResults results>
	//   18   31:invokevirtual   #38  <Method int RealmResults.size()>
	//   19   34:invokevirtual   #42  <Method void calcMinMax(int, int)>
	//   20   37:return          
	}

	public RealmBubbleDataSet(RealmResults realmresults, String s, String s1, String s2)
	{
		super(realmresults, s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #48  <Method void RealmBarLineScatterCandleBubbleDataSet(RealmResults, String, String)>
		mHighlightCircleWidth = 2.5F;
	//    5    7:aload_0         
	//    6    8:ldc1            #20  <Float 2.5F>
	//    7   10:putfield        #22  <Field float mHighlightCircleWidth>
		mSizeField = s2;
	//    8   13:aload_0         
	//    9   14:aload           4
	//   10   16:putfield        #24  <Field String mSizeField>
		build(results);
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:getfield        #28  <Field RealmResults results>
	//   14   24:invokevirtual   #32  <Method void build(RealmResults)>
		calcMinMax(0, results.size());
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:aload_0         
	//   18   30:getfield        #28  <Field RealmResults results>
	//   19   33:invokevirtual   #38  <Method int RealmResults.size()>
	//   20   36:invokevirtual   #42  <Method void calcMinMax(int, int)>
	//   21   39:return          
	}

	private float largestSize(BubbleEntry bubbleentry)
	{
		return bubbleentry.getSize();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #57  <Method float BubbleEntry.getSize()>
	//    2    4:freturn         
	}

	private float xMax(BubbleEntry bubbleentry)
	{
		return (float)bubbleentry.getXIndex();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #61  <Method int BubbleEntry.getXIndex()>
	//    2    4:i2f             
	//    3    5:freturn         
	}

	private float xMin(BubbleEntry bubbleentry)
	{
		return (float)bubbleentry.getXIndex();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #61  <Method int BubbleEntry.getXIndex()>
	//    2    4:i2f             
	//    3    5:freturn         
	}

	private float yMax(BubbleEntry bubbleentry)
	{
		return bubbleentry.getVal();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #66  <Method float BubbleEntry.getVal()>
	//    2    4:freturn         
	}

	private float yMin(BubbleEntry bubbleentry)
	{
		return bubbleentry.getVal();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #66  <Method float BubbleEntry.getVal()>
	//    2    4:freturn         
	}

	public void build(RealmResults realmresults)
	{
		if(mIndexField == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field String mIndexField>
	//*   2    4:ifnonnull       81
		{
			int i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_2        
			for(realmresults = ((RealmResults) (realmresults.iterator())); ((Iterator) (realmresults)).hasNext();)
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #74  <Method Iterator RealmResults.iterator()>
	//*   7   13:astore_1        
	//*   8   14:aload_1         
	//*   9   15:invokeinterface #80  <Method boolean Iterator.hasNext()>
	//*  10   20:ifeq            156
			{
				DynamicRealmObject dynamicrealmobject = new DynamicRealmObject((RealmObject)((Iterator) (realmresults)).next());
	//   11   23:new             #82  <Class DynamicRealmObject>
	//   12   26:dup             
	//   13   27:aload_1         
	//   14   28:invokeinterface #86  <Method Object Iterator.next()>
	//   15   33:checkcast       #88  <Class RealmObject>
	//   16   36:invokespecial   #91  <Method void DynamicRealmObject(RealmObject)>
	//   17   39:astore_3        
				mValues.add(((Object) (new BubbleEntry(i, dynamicrealmobject.getFloat(mValuesField), dynamicrealmobject.getFloat(mSizeField)))));
	//   18   40:aload_0         
	//   19   41:getfield        #95  <Field List mValues>
	//   20   44:new             #53  <Class BubbleEntry>
	//   21   47:dup             
	//   22   48:iload_2         
	//   23   49:aload_3         
	//   24   50:aload_0         
	//   25   51:getfield        #98  <Field String mValuesField>
	//   26   54:invokevirtual   #102 <Method float DynamicRealmObject.getFloat(String)>
	//   27   57:aload_3         
	//   28   58:aload_0         
	//   29   59:getfield        #24  <Field String mSizeField>
	//   30   62:invokevirtual   #102 <Method float DynamicRealmObject.getFloat(String)>
	//   31   65:invokespecial   #105 <Method void BubbleEntry(int, float, float)>
	//   32   68:invokeinterface #111 <Method boolean List.add(Object)>
	//   33   73:pop             
				i++;
	//   34   74:iload_2         
	//   35   75:iconst_1        
	//   36   76:iadd            
	//   37   77:istore_2        
			}

		} else
	//*  38   78:goto            14
		{
			DynamicRealmObject dynamicrealmobject1;
			for(realmresults = ((RealmResults) (realmresults.iterator())); ((Iterator) (realmresults)).hasNext(); mValues.add(((Object) (new BubbleEntry(dynamicrealmobject1.getInt(mIndexField), dynamicrealmobject1.getFloat(mValuesField), dynamicrealmobject1.getFloat(mSizeField))))))
	//*  39   81:aload_1         
	//*  40   82:invokevirtual   #74  <Method Iterator RealmResults.iterator()>
	//*  41   85:astore_1        
	//*  42   86:aload_1         
	//*  43   87:invokeinterface #80  <Method boolean Iterator.hasNext()>
	//*  44   92:ifeq            156
				dynamicrealmobject1 = new DynamicRealmObject((RealmObject)((Iterator) (realmresults)).next());
	//   45   95:new             #82  <Class DynamicRealmObject>
	//   46   98:dup             
	//   47   99:aload_1         
	//   48  100:invokeinterface #86  <Method Object Iterator.next()>
	//   49  105:checkcast       #88  <Class RealmObject>
	//   50  108:invokespecial   #91  <Method void DynamicRealmObject(RealmObject)>
	//   51  111:astore_3        

	//   52  112:aload_0         
	//   53  113:getfield        #95  <Field List mValues>
	//   54  116:new             #53  <Class BubbleEntry>
	//   55  119:dup             
	//   56  120:aload_3         
	//   57  121:aload_0         
	//   58  122:getfield        #70  <Field String mIndexField>
	//   59  125:invokevirtual   #115 <Method int DynamicRealmObject.getInt(String)>
	//   60  128:aload_3         
	//   61  129:aload_0         
	//   62  130:getfield        #98  <Field String mValuesField>
	//   63  133:invokevirtual   #102 <Method float DynamicRealmObject.getFloat(String)>
	//   64  136:aload_3         
	//   65  137:aload_0         
	//   66  138:getfield        #24  <Field String mSizeField>
	//   67  141:invokevirtual   #102 <Method float DynamicRealmObject.getFloat(String)>
	//   68  144:invokespecial   #105 <Method void BubbleEntry(int, float, float)>
	//   69  147:invokeinterface #111 <Method boolean List.add(Object)>
	//   70  152:pop             
		}
	//*  71  153:goto            86
	//   72  156:return          
	}

	public void calcMinMax(int i, int j)
	{
		if(mValues != null && mValues.size() != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field List mValues>
	//*   2    4:ifnonnull       8
	//*   3    7:return          
	//*   4    8:aload_0         
	//*   5    9:getfield        #95  <Field List mValues>
	//*   6   12:invokeinterface #117 <Method int List.size()>
	//*   7   17:ifeq            7
		{
			if(j == 0 || j >= mValues.size())
	//*   8   20:iload_2         
	//*   9   21:ifeq            37
	//*  10   24:iload_2         
	//*  11   25:aload_0         
	//*  12   26:getfield        #95  <Field List mValues>
	//*  13   29:invokeinterface #117 <Method int List.size()>
	//*  14   34:icmplt          229
				j = mValues.size() - 1;
	//   15   37:aload_0         
	//   16   38:getfield        #95  <Field List mValues>
	//   17   41:invokeinterface #117 <Method int List.size()>
	//   18   46:iconst_1        
	//   19   47:isub            
	//   20   48:istore_2        
			mYMin = yMin((BubbleEntry)mValues.get(i));
	//   21   49:aload_0         
	//   22   50:aload_0         
	//   23   51:aload_0         
	//   24   52:getfield        #95  <Field List mValues>
	//   25   55:iload_1         
	//   26   56:invokeinterface #121 <Method Object List.get(int)>
	//   27   61:checkcast       #53  <Class BubbleEntry>
	//   28   64:invokespecial   #123 <Method float yMin(BubbleEntry)>
	//   29   67:putfield        #126 <Field float mYMin>
			mYMax = yMax((BubbleEntry)mValues.get(i));
	//   30   70:aload_0         
	//   31   71:aload_0         
	//   32   72:aload_0         
	//   33   73:getfield        #95  <Field List mValues>
	//   34   76:iload_1         
	//   35   77:invokeinterface #121 <Method Object List.get(int)>
	//   36   82:checkcast       #53  <Class BubbleEntry>
	//   37   85:invokespecial   #128 <Method float yMax(BubbleEntry)>
	//   38   88:putfield        #131 <Field float mYMax>
			while(i < j) 
	//*  39   91:iload_1         
	//*  40   92:iload_2         
	//*  41   93:icmpge          7
			{
				BubbleEntry bubbleentry = (BubbleEntry)mValues.get(i);
	//   42   96:aload_0         
	//   43   97:getfield        #95  <Field List mValues>
	//   44  100:iload_1         
	//   45  101:invokeinterface #121 <Method Object List.get(int)>
	//   46  106:checkcast       #53  <Class BubbleEntry>
	//   47  109:astore          5
				float f = yMin(bubbleentry);
	//   48  111:aload_0         
	//   49  112:aload           5
	//   50  114:invokespecial   #123 <Method float yMin(BubbleEntry)>
	//   51  117:fstore_3        
				float f1 = yMax(bubbleentry);
	//   52  118:aload_0         
	//   53  119:aload           5
	//   54  121:invokespecial   #128 <Method float yMax(BubbleEntry)>
	//   55  124:fstore          4
				if(f < mYMin)
	//*  56  126:fload_3         
	//*  57  127:aload_0         
	//*  58  128:getfield        #126 <Field float mYMin>
	//*  59  131:fcmpg           
	//*  60  132:ifge            140
					mYMin = f;
	//   61  135:aload_0         
	//   62  136:fload_3         
	//   63  137:putfield        #126 <Field float mYMin>
				if(f1 > mYMax)
	//*  64  140:fload           4
	//*  65  142:aload_0         
	//*  66  143:getfield        #131 <Field float mYMax>
	//*  67  146:fcmpl           
	//*  68  147:ifle            156
					mYMax = f1;
	//   69  150:aload_0         
	//   70  151:fload           4
	//   71  153:putfield        #131 <Field float mYMax>
				f = xMin(bubbleentry);
	//   72  156:aload_0         
	//   73  157:aload           5
	//   74  159:invokespecial   #133 <Method float xMin(BubbleEntry)>
	//   75  162:fstore_3        
				f1 = xMax(bubbleentry);
	//   76  163:aload_0         
	//   77  164:aload           5
	//   78  166:invokespecial   #135 <Method float xMax(BubbleEntry)>
	//   79  169:fstore          4
				if(f < mXMin)
	//*  80  171:fload_3         
	//*  81  172:aload_0         
	//*  82  173:getfield        #137 <Field float mXMin>
	//*  83  176:fcmpg           
	//*  84  177:ifge            185
					mXMin = f;
	//   85  180:aload_0         
	//   86  181:fload_3         
	//   87  182:putfield        #137 <Field float mXMin>
				if(f1 > mXMax)
	//*  88  185:fload           4
	//*  89  187:aload_0         
	//*  90  188:getfield        #139 <Field float mXMax>
	//*  91  191:fcmpl           
	//*  92  192:ifle            201
					mXMax = f1;
	//   93  195:aload_0         
	//   94  196:fload           4
	//   95  198:putfield        #139 <Field float mXMax>
				f = largestSize(bubbleentry);
	//   96  201:aload_0         
	//   97  202:aload           5
	//   98  204:invokespecial   #141 <Method float largestSize(BubbleEntry)>
	//   99  207:fstore_3        
				if(f > mMaxSize)
	//* 100  208:fload_3         
	//* 101  209:aload_0         
	//* 102  210:getfield        #143 <Field float mMaxSize>
	//* 103  213:fcmpl           
	//* 104  214:ifle            222
					mMaxSize = f;
	//  105  217:aload_0         
	//  106  218:fload_3         
	//  107  219:putfield        #143 <Field float mMaxSize>
				i++;
	//  108  222:iload_1         
	//  109  223:iconst_1        
	//  110  224:iadd            
	//  111  225:istore_1        
			}
		}
	//* 112  226:goto            91
	//* 113  229:goto            49
	}

	public float getHighlightCircleWidth()
	{
		return mHighlightCircleWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field float mHighlightCircleWidth>
	//    2    4:freturn         
	}

	public float getMaxSize()
	{
		return mMaxSize;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field float mMaxSize>
	//    2    4:freturn         
	}

	public String getSizeField()
	{
		return mSizeField;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String mSizeField>
	//    2    4:areturn         
	}

	public float getXMax()
	{
		return mXMax;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field float mXMax>
	//    2    4:freturn         
	}

	public float getXMin()
	{
		return mXMin;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field float mXMin>
	//    2    4:freturn         
	}

	public void setHighlightCircleWidth(float f)
	{
		mHighlightCircleWidth = Utils.convertDpToPixel(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #157 <Method float Utils.convertDpToPixel(float)>
	//    3    5:putfield        #22  <Field float mHighlightCircleWidth>
	//    4    8:return          
	}

	public void setSizeField(String s)
	{
		mSizeField = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field String mSizeField>
	//    3    5:return          
	}

	private float mHighlightCircleWidth;
	protected float mMaxSize;
	private String mSizeField;
	protected float mXMax;
	protected float mXMin;
}
