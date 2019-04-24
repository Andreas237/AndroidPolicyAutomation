// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data.realm.base;

import com.github.mikephil.charting.data.BaseDataSet;
import com.github.mikephil.charting.data.Entry;
import io.realm.RealmResults;
import io.realm.Sort;
import java.util.ArrayList;
import java.util.List;

public abstract class RealmBaseDataSet extends BaseDataSet
{

	public RealmBaseDataSet(RealmResults realmresults, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void BaseDataSet()>
		mYMax = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #24  <Field float mYMax>
		mYMin = 0.0F;
	//    5    9:aload_0         
	//    6   10:fconst_0        
	//    7   11:putfield        #26  <Field float mYMin>
		results = realmresults;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #28  <Field RealmResults results>
		mValuesField = s;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:putfield        #30  <Field String mValuesField>
		mValues = ((List) (new ArrayList()));
	//   14   24:aload_0         
	//   15   25:new             #32  <Class ArrayList>
	//   16   28:dup             
	//   17   29:invokespecial   #33  <Method void ArrayList()>
	//   18   32:putfield        #35  <Field List mValues>
		if(mIndexField != null)
	//*  19   35:aload_0         
	//*  20   36:getfield        #37  <Field String mIndexField>
	//*  21   39:ifnull          56
			results.sort(mIndexField, Sort.ASCENDING);
	//   22   42:aload_0         
	//   23   43:getfield        #28  <Field RealmResults results>
	//   24   46:aload_0         
	//   25   47:getfield        #37  <Field String mIndexField>
	//   26   50:getstatic       #43  <Field Sort Sort.ASCENDING>
	//   27   53:invokevirtual   #49  <Method void RealmResults.sort(String, Sort)>
	//   28   56:return          
	}

	public RealmBaseDataSet(RealmResults realmresults, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void BaseDataSet()>
		mYMax = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #24  <Field float mYMax>
		mYMin = 0.0F;
	//    5    9:aload_0         
	//    6   10:fconst_0        
	//    7   11:putfield        #26  <Field float mYMin>
		results = realmresults;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #28  <Field RealmResults results>
		mValuesField = s;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:putfield        #30  <Field String mValuesField>
		mIndexField = s1;
	//   14   24:aload_0         
	//   15   25:aload_3         
	//   16   26:putfield        #37  <Field String mIndexField>
		mValues = ((List) (new ArrayList()));
	//   17   29:aload_0         
	//   18   30:new             #32  <Class ArrayList>
	//   19   33:dup             
	//   20   34:invokespecial   #33  <Method void ArrayList()>
	//   21   37:putfield        #35  <Field List mValues>
		if(mIndexField != null)
	//*  22   40:aload_0         
	//*  23   41:getfield        #37  <Field String mIndexField>
	//*  24   44:ifnull          61
			results.sort(mIndexField, Sort.ASCENDING);
	//   25   47:aload_0         
	//   26   48:getfield        #28  <Field RealmResults results>
	//   27   51:aload_0         
	//   28   52:getfield        #37  <Field String mIndexField>
	//   29   55:getstatic       #43  <Field Sort Sort.ASCENDING>
	//   30   58:invokevirtual   #49  <Method void RealmResults.sort(String, Sort)>
	//   31   61:return          
	}

	public boolean addEntry(Entry entry)
	{
		float f;
		if(entry == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		f = entry.getVal();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #62  <Method float Entry.getVal()>
	//    6   10:fstore_2        
		if(mValues == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #35  <Field List mValues>
	//*   9   15:ifnonnull       29
			mValues = ((List) (new ArrayList()));
	//   10   18:aload_0         
	//   11   19:new             #32  <Class ArrayList>
	//   12   22:dup             
	//   13   23:invokespecial   #33  <Method void ArrayList()>
	//   14   26:putfield        #35  <Field List mValues>
		if(mValues.size() != 0) goto _L2; else goto _L1
	//   15   29:aload_0         
	//   16   30:getfield        #35  <Field List mValues>
	//   17   33:invokeinterface #68  <Method int List.size()>
	//   18   38:ifne            64
_L1:
		mYMax = f;
	//   19   41:aload_0         
	//   20   42:fload_2         
	//   21   43:putfield        #24  <Field float mYMax>
		mYMin = f;
	//   22   46:aload_0         
	//   23   47:fload_2         
	//   24   48:putfield        #26  <Field float mYMin>
_L4:
		mValues.add(((Object) (entry)));
	//   25   51:aload_0         
	//   26   52:getfield        #35  <Field List mValues>
	//   27   55:aload_1         
	//   28   56:invokeinterface #72  <Method boolean List.add(Object)>
	//   29   61:pop             
		return true;
	//   30   62:iconst_1        
	//   31   63:ireturn         
_L2:
		if(mYMax < f)
	//*  32   64:aload_0         
	//*  33   65:getfield        #24  <Field float mYMax>
	//*  34   68:fload_2         
	//*  35   69:fcmpg           
	//*  36   70:ifge            78
			mYMax = f;
	//   37   73:aload_0         
	//   38   74:fload_2         
	//   39   75:putfield        #24  <Field float mYMax>
		if(mYMin > f)
	//*  40   78:aload_0         
	//*  41   79:getfield        #26  <Field float mYMin>
	//*  42   82:fload_2         
	//*  43   83:fcmpl           
	//*  44   84:ifle            51
			mYMin = f;
	//   45   87:aload_0         
	//   46   88:fload_2         
	//   47   89:putfield        #26  <Field float mYMin>
		if(true) goto _L4; else goto _L3
	//   48   92:goto            51
_L3:
	}

	public void addEntryOrdered(Entry entry)
	{
		if(entry == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		float f = entry.getVal();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #62  <Method float Entry.getVal()>
	//    5    9:fstore_2        
		if(mValues == null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #35  <Field List mValues>
	//*   8   14:ifnonnull       28
			mValues = ((List) (new ArrayList()));
	//    9   17:aload_0         
	//   10   18:new             #32  <Class ArrayList>
	//   11   21:dup             
	//   12   22:invokespecial   #33  <Method void ArrayList()>
	//   13   25:putfield        #35  <Field List mValues>
		if(mValues.size() == 0)
	//*  14   28:aload_0         
	//*  15   29:getfield        #35  <Field List mValues>
	//*  16   32:invokeinterface #68  <Method int List.size()>
	//*  17   37:ifne            119
		{
			mYMax = f;
	//   18   40:aload_0         
	//   19   41:fload_2         
	//   20   42:putfield        #24  <Field float mYMax>
			mYMin = f;
	//   21   45:aload_0         
	//   22   46:fload_2         
	//   23   47:putfield        #26  <Field float mYMin>
		} else
	//*  24   50:aload_0         
	//*  25   51:getfield        #35  <Field List mValues>
	//*  26   54:invokeinterface #68  <Method int List.size()>
	//*  27   59:ifle            150
	//*  28   62:aload_0         
	//*  29   63:getfield        #35  <Field List mValues>
	//*  30   66:aload_0         
	//*  31   67:getfield        #35  <Field List mValues>
	//*  32   70:invokeinterface #68  <Method int List.size()>
	//*  33   75:iconst_1        
	//*  34   76:isub            
	//*  35   77:invokeinterface #79  <Method Object List.get(int)>
	//*  36   82:checkcast       #58  <Class Entry>
	//*  37   85:invokevirtual   #82  <Method int Entry.getXIndex()>
	//*  38   88:aload_1         
	//*  39   89:invokevirtual   #82  <Method int Entry.getXIndex()>
	//*  40   92:icmple          150
	//*  41   95:aload_0         
	//*  42   96:aload_1         
	//*  43   97:invokevirtual   #82  <Method int Entry.getXIndex()>
	//*  44  100:getstatic       #88  <Field com.github.mikephil.charting.data.DataSet$Rounding com.github.mikephil.charting.data.DataSet$Rounding.UP>
	//*  45  103:invokevirtual   #92  <Method int getEntryIndex(int, com.github.mikephil.charting.data.DataSet$Rounding)>
	//*  46  106:istore_3        
	//*  47  107:aload_0         
	//*  48  108:getfield        #35  <Field List mValues>
	//*  49  111:iload_3         
	//*  50  112:aload_1         
	//*  51  113:invokeinterface #95  <Method void List.add(int, Object)>
	//*  52  118:return          
		{
			if(mYMax < f)
	//*  53  119:aload_0         
	//*  54  120:getfield        #24  <Field float mYMax>
	//*  55  123:fload_2         
	//*  56  124:fcmpg           
	//*  57  125:ifge            133
				mYMax = f;
	//   58  128:aload_0         
	//   59  129:fload_2         
	//   60  130:putfield        #24  <Field float mYMax>
			if(mYMin > f)
	//*  61  133:aload_0         
	//*  62  134:getfield        #26  <Field float mYMin>
	//*  63  137:fload_2         
	//*  64  138:fcmpl           
	//*  65  139:ifle            50
				mYMin = f;
	//   66  142:aload_0         
	//   67  143:fload_2         
	//   68  144:putfield        #26  <Field float mYMin>
		}
		if(mValues.size() > 0 && ((Entry)mValues.get(mValues.size() - 1)).getXIndex() > entry.getXIndex())
		{
			int i = getEntryIndex(entry.getXIndex(), com.github.mikephil.charting.data.DataSet.Rounding.UP);
			mValues.add(i, ((Object) (entry)));
			return;
		} else
	//*  69  147:goto            50
		{
			mValues.add(((Object) (entry)));
	//   70  150:aload_0         
	//   71  151:getfield        #35  <Field List mValues>
	//   72  154:aload_1         
	//   73  155:invokeinterface #72  <Method boolean List.add(Object)>
	//   74  160:pop             
			return;
	//   75  161:return          
		}
	}

	public abstract void build(RealmResults realmresults);

	public void calcMinMax(int i, int j)
	{
		int k;
		if(mValues != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field List mValues>
	//*   2    4:ifnonnull       8
	//*   3    7:return          
	//*   4    8:aload_0         
	//*   5    9:getfield        #35  <Field List mValues>
	//*   6   12:invokeinterface #68  <Method int List.size()>
	//*   7   17:istore_3        
			if((k = mValues.size()) != 0)
	//*   8   18:iload_3         
	//*   9   19:ifeq            7
			{
				if(j == 0 || j >= k)
	//*  10   22:iload_2         
	//*  11   23:ifeq            31
	//*  12   26:iload_2         
	//*  13   27:iload_3         
	//*  14   28:icmplt          134
					j = k - 1;
	//   15   31:iload_3         
	//   16   32:iconst_1        
	//   17   33:isub            
	//   18   34:istore_2        
				mYMin = 3.402823E+38F;
	//   19   35:aload_0         
	//   20   36:ldc1            #101 <Float 3.402823E+38F>
	//   21   38:putfield        #26  <Field float mYMin>
				mYMax = -3.402823E+38F;
	//   22   41:aload_0         
	//   23   42:ldc1            #102 <Float -3.402823E+38F>
	//   24   44:putfield        #24  <Field float mYMax>
				for(; i <= j; i++)
	//*  25   47:iload_1         
	//*  26   48:iload_2         
	//*  27   49:icmpgt          137
				{
					Entry entry = (Entry)mValues.get(i);
	//   28   52:aload_0         
	//   29   53:getfield        #35  <Field List mValues>
	//   30   56:iload_1         
	//   31   57:invokeinterface #79  <Method Object List.get(int)>
	//   32   62:checkcast       #58  <Class Entry>
	//   33   65:astore          4
					if(entry == null || Float.isNaN(entry.getVal()))
						continue;
	//   34   67:aload           4
	//   35   69:ifnull          127
	//   36   72:aload           4
	//   37   74:invokevirtual   #62  <Method float Entry.getVal()>
	//   38   77:invokestatic    #108 <Method boolean Float.isNaN(float)>
	//   39   80:ifne            127
					if(entry.getVal() < mYMin)
	//*  40   83:aload           4
	//*  41   85:invokevirtual   #62  <Method float Entry.getVal()>
	//*  42   88:aload_0         
	//*  43   89:getfield        #26  <Field float mYMin>
	//*  44   92:fcmpg           
	//*  45   93:ifge            105
						mYMin = entry.getVal();
	//   46   96:aload_0         
	//   47   97:aload           4
	//   48   99:invokevirtual   #62  <Method float Entry.getVal()>
	//   49  102:putfield        #26  <Field float mYMin>
					if(entry.getVal() > mYMax)
	//*  50  105:aload           4
	//*  51  107:invokevirtual   #62  <Method float Entry.getVal()>
	//*  52  110:aload_0         
	//*  53  111:getfield        #24  <Field float mYMax>
	//*  54  114:fcmpl           
	//*  55  115:ifle            127
						mYMax = entry.getVal();
	//   56  118:aload_0         
	//   57  119:aload           4
	//   58  121:invokevirtual   #62  <Method float Entry.getVal()>
	//   59  124:putfield        #24  <Field float mYMax>
				}

	//   60  127:iload_1         
	//   61  128:iconst_1        
	//   62  129:iadd            
	//   63  130:istore_1        
	//*  64  131:goto            47
	//*  65  134:goto            35
				if(mYMin == 3.402823E+38F)
	//*  66  137:aload_0         
	//*  67  138:getfield        #26  <Field float mYMin>
	//*  68  141:ldc1            #101 <Float 3.402823E+38F>
	//*  69  143:fcmpl           
	//*  70  144:ifne            7
				{
					mYMin = 0.0F;
	//   71  147:aload_0         
	//   72  148:fconst_0        
	//   73  149:putfield        #26  <Field float mYMin>
					mYMax = 0.0F;
	//   74  152:aload_0         
	//   75  153:fconst_0        
	//   76  154:putfield        #24  <Field float mYMax>
					return;
	//   77  157:return          
				}
			}
	}

	public void clear()
	{
		mValues.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List mValues>
	//    2    4:invokeinterface #111 <Method void List.clear()>
		notifyDataSetChanged();
	//    3    9:aload_0         
	//    4   10:invokevirtual   #114 <Method void notifyDataSetChanged()>
	//    5   13:return          
	}

	public int getEntryCount()
	{
		return mValues.size();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List mValues>
	//    2    4:invokeinterface #68  <Method int List.size()>
	//    3    9:ireturn         
	}

	public Entry getEntryForIndex(int i)
	{
		return (Entry)mValues.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List mValues>
	//    2    4:iload_1         
	//    3    5:invokeinterface #79  <Method Object List.get(int)>
	//    4   10:checkcast       #58  <Class Entry>
	//    5   13:areturn         
	}

	public Entry getEntryForXIndex(int i)
	{
		return getEntryForXIndex(i, com.github.mikephil.charting.data.DataSet.Rounding.CLOSEST);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:getstatic       #122 <Field com.github.mikephil.charting.data.DataSet$Rounding com.github.mikephil.charting.data.DataSet$Rounding.CLOSEST>
	//    3    5:invokevirtual   #125 <Method Entry getEntryForXIndex(int, com.github.mikephil.charting.data.DataSet$Rounding)>
	//    4    8:areturn         
	}

	public Entry getEntryForXIndex(int i, com.github.mikephil.charting.data.DataSet.Rounding rounding)
	{
		i = getEntryIndex(i, rounding);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #92  <Method int getEntryIndex(int, com.github.mikephil.charting.data.DataSet$Rounding)>
	//    4    6:istore_1        
		if(i > -1)
	//*   5    7:iload_1         
	//*   6    8:iconst_m1       
	//*   7    9:icmple          26
			return (Entry)mValues.get(i);
	//    8   12:aload_0         
	//    9   13:getfield        #35  <Field List mValues>
	//   10   16:iload_1         
	//   11   17:invokeinterface #79  <Method Object List.get(int)>
	//   12   22:checkcast       #58  <Class Entry>
	//   13   25:areturn         
		else
			return null;
	//   14   26:aconst_null     
	//   15   27:areturn         
	}

	public int getEntryIndex(int i, com.github.mikephil.charting.data.DataSet.Rounding rounding)
	{
		int j;
		int k;
		int l;
		j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		l = mValues.size() - 1;
	//    2    2:aload_0         
	//    3    3:getfield        #35  <Field List mValues>
	//    4    6:invokeinterface #68  <Method int List.size()>
	//    5   11:iconst_1        
	//    6   12:isub            
	//    7   13:istore          5
		k = -1;
	//    8   15:iconst_m1       
	//    9   16:istore          4
_L5:
		if(j > l)
			break; /* Loop/switch isn't completed */
	//   10   18:iload_3         
	//   11   19:iload           5
	//   12   21:icmpgt          133
		k = (l + j) / 2;
	//   13   24:iload           5
	//   14   26:iload_3         
	//   15   27:iadd            
	//   16   28:iconst_2        
	//   17   29:idiv            
	//   18   30:istore          4
		if(i != ((Entry)mValues.get(k)).getXIndex()) goto _L2; else goto _L1
	//   19   32:iload_1         
	//   20   33:aload_0         
	//   21   34:getfield        #35  <Field List mValues>
	//   22   37:iload           4
	//   23   39:invokeinterface #79  <Method Object List.get(int)>
	//   24   44:checkcast       #58  <Class Entry>
	//   25   47:invokevirtual   #82  <Method int Entry.getXIndex()>
	//   26   50:icmpne          95
_L1:
		j = k;
	//   27   53:iload           4
	//   28   55:istore_3        
		do
		{
			k = j;
	//   29   56:iload_3         
	//   30   57:istore          4
			if(j <= 0)
				break;
	//   31   59:iload_3         
	//   32   60:ifle            204
			k = j;
	//   33   63:iload_3         
	//   34   64:istore          4
			if(((Entry)mValues.get(j - 1)).getXIndex() != i)
				break;
	//   35   66:aload_0         
	//   36   67:getfield        #35  <Field List mValues>
	//   37   70:iload_3         
	//   38   71:iconst_1        
	//   39   72:isub            
	//   40   73:invokeinterface #79  <Method Object List.get(int)>
	//   41   78:checkcast       #58  <Class Entry>
	//   42   81:invokevirtual   #82  <Method int Entry.getXIndex()>
	//   43   84:iload_1         
	//   44   85:icmpne          204
			j--;
	//   45   88:iload_3         
	//   46   89:iconst_1        
	//   47   90:isub            
	//   48   91:istore_3        
		} while(true);
	//   49   92:goto            56
		  goto _L3
_L2:
		if(i > ((Entry)mValues.get(k)).getXIndex())
	//*  50   95:iload_1         
	//*  51   96:aload_0         
	//*  52   97:getfield        #35  <Field List mValues>
	//*  53  100:iload           4
	//*  54  102:invokeinterface #79  <Method Object List.get(int)>
	//*  55  107:checkcast       #58  <Class Entry>
	//*  56  110:invokevirtual   #82  <Method int Entry.getXIndex()>
	//*  57  113:icmple          124
			j = k + 1;
	//   58  116:iload           4
	//   59  118:iconst_1        
	//   60  119:iadd            
	//   61  120:istore_3        
		else
	//*  62  121:goto            18
			l = k - 1;
	//   63  124:iload           4
	//   64  126:iconst_1        
	//   65  127:isub            
	//   66  128:istore          5
		if(true) goto _L5; else goto _L4
	//   67  130:goto            121
_L4:
		j = k;
	//   68  133:iload           4
	//   69  135:istore_3        
		if(k == -1) goto _L7; else goto _L6
	//   70  136:iload           4
	//   71  138:iconst_m1       
	//   72  139:icmpeq          201
_L6:
		l = ((Entry)mValues.get(k)).getXIndex();
	//   73  142:aload_0         
	//   74  143:getfield        #35  <Field List mValues>
	//   75  146:iload           4
	//   76  148:invokeinterface #79  <Method Object List.get(int)>
	//   77  153:checkcast       #58  <Class Entry>
	//   78  156:invokevirtual   #82  <Method int Entry.getXIndex()>
	//   79  159:istore          5
		if(rounding != com.github.mikephil.charting.data.DataSet.Rounding.UP) goto _L9; else goto _L8
	//   80  161:aload_2         
	//   81  162:getstatic       #88  <Field com.github.mikephil.charting.data.DataSet$Rounding com.github.mikephil.charting.data.DataSet$Rounding.UP>
	//   82  165:if_acmpne       207
_L8:
		j = k;
	//   83  168:iload           4
	//   84  170:istore_3        
		if(l < i)
	//*  85  171:iload           5
	//*  86  173:iload_1         
	//*  87  174:icmpge          201
		{
			j = k;
	//   88  177:iload           4
	//   89  179:istore_3        
			if(k < mValues.size() - 1)
	//*  90  180:iload           4
	//*  91  182:aload_0         
	//*  92  183:getfield        #35  <Field List mValues>
	//*  93  186:invokeinterface #68  <Method int List.size()>
	//*  94  191:iconst_1        
	//*  95  192:isub            
	//*  96  193:icmpge          201
				j = k + 1;
	//   97  196:iload           4
	//   98  198:iconst_1        
	//   99  199:iadd            
	//  100  200:istore_3        
		}
_L7:
		k = j;
	//  101  201:iload_3         
	//  102  202:istore          4
_L3:
		return k;
	//  103  204:iload           4
	//  104  206:ireturn         
_L9:
		j = k;
	//  105  207:iload           4
	//  106  209:istore_3        
		if(rounding == com.github.mikephil.charting.data.DataSet.Rounding.DOWN)
	//* 107  210:aload_2         
	//* 108  211:getstatic       #129 <Field com.github.mikephil.charting.data.DataSet$Rounding com.github.mikephil.charting.data.DataSet$Rounding.DOWN>
	//* 109  214:if_acmpne       201
		{
			j = k;
	//  110  217:iload           4
	//  111  219:istore_3        
			if(l > i)
	//* 112  220:iload           5
	//* 113  222:iload_1         
	//* 114  223:icmple          201
			{
				j = k;
	//  115  226:iload           4
	//  116  228:istore_3        
				if(k > 0)
	//* 117  229:iload           4
	//* 118  231:ifle            201
					j = k - 1;
	//  119  234:iload           4
	//  120  236:iconst_1        
	//  121  237:isub            
	//  122  238:istore_3        
			}
		}
		if(true) goto _L7; else goto _L10
	//  123  239:goto            201
_L10:
	}

	public int getEntryIndex(Entry entry)
	{
		return mValues.indexOf(((Object) (entry)));
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List mValues>
	//    2    4:aload_1         
	//    3    5:invokeinterface #134 <Method int List.indexOf(Object)>
	//    4   10:ireturn         
	}

	public String getIndexField()
	{
		return mIndexField;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String mIndexField>
	//    2    4:areturn         
	}

	public RealmResults getResults()
	{
		return results;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field RealmResults results>
	//    2    4:areturn         
	}

	public List getValues()
	{
		return mValues;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field List mValues>
	//    2    4:areturn         
	}

	public String getValuesField()
	{
		return mValuesField;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String mValuesField>
	//    2    4:areturn         
	}

	public float getYMax()
	{
		return mYMax;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field float mYMax>
	//    2    4:freturn         
	}

	public float getYMin()
	{
		return mYMin;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field float mYMin>
	//    2    4:freturn         
	}

	public float getYValForXIndex(int i)
	{
		Entry entry = getEntryForXIndex(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #150 <Method Entry getEntryForXIndex(int)>
	//    3    5:astore_2        
		if(entry != null && entry.getXIndex() == i)
	//*   4    6:aload_2         
	//*   5    7:ifnull          23
	//*   6   10:aload_2         
	//*   7   11:invokevirtual   #82  <Method int Entry.getXIndex()>
	//*   8   14:iload_1         
	//*   9   15:icmpne          23
			return entry.getVal();
	//   10   18:aload_2         
	//   11   19:invokevirtual   #62  <Method float Entry.getVal()>
	//   12   22:freturn         
		else
			return (0.0F / 0.0F);
	//   13   23:ldc1            #151 <Float (0.0F / 0.0F)>
	//   14   25:freturn         
	}

	public boolean removeEntry(Entry entry)
	{
		boolean flag;
		if(entry == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       8
		{
			flag = false;
	//    2    4:iconst_0        
	//    3    5:istore_2        
		} else
	//*   4    6:iload_2         
	//*   5    7:ireturn         
		{
			if(mValues == null)
	//*   6    8:aload_0         
	//*   7    9:getfield        #35  <Field List mValues>
	//*   8   12:ifnonnull       17
				return false;
	//    9   15:iconst_0        
	//   10   16:ireturn         
			boolean flag1 = mValues.remove(((Object) (entry)));
	//   11   17:aload_0         
	//   12   18:getfield        #35  <Field List mValues>
	//   13   21:aload_1         
	//   14   22:invokeinterface #155 <Method boolean List.remove(Object)>
	//   15   27:istore_3        
			flag = flag1;
	//   16   28:iload_3         
	//   17   29:istore_2        
			if(flag1)
	//*  18   30:iload_3         
	//*  19   31:ifeq            6
			{
				calcMinMax(0, mValues.size());
	//   20   34:aload_0         
	//   21   35:iconst_0        
	//   22   36:aload_0         
	//   23   37:getfield        #35  <Field List mValues>
	//   24   40:invokeinterface #68  <Method int List.size()>
	//   25   45:invokevirtual   #157 <Method void calcMinMax(int, int)>
				return flag1;
	//   26   48:iload_3         
	//   27   49:ireturn         
			}
		}
		return flag;
	}

	public void setIndexField(String s)
	{
		mIndexField = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field String mIndexField>
	//    3    5:return          
	}

	public void setValuesField(String s)
	{
		mValuesField = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field String mValuesField>
	//    3    5:return          
	}

	protected String mIndexField;
	protected List mValues;
	protected String mValuesField;
	protected float mYMax;
	protected float mYMin;
	protected RealmResults results;
}
