// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.data:
//			BaseDataSet, Entry

public abstract class DataSet extends BaseDataSet
{
	public static final class Rounding extends Enum
	{

		public static Rounding valueOf(String s)
		{
			return (Rounding)Enum.valueOf(com/github/mikephil/charting/data/DataSet$Rounding, s);
		//    0    0:ldc1            #2   <Class DataSet$Rounding>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class DataSet$Rounding>
		//    4    9:areturn         
		}

		public static Rounding[] values()
		{
			return (Rounding[])((Rounding []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field DataSet$Rounding[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.github.mikephil.charting.data.DataSet$Rounding_3B_.clone()>
		//    2    6:checkcast       #42  <Class DataSet$Rounding[]>
		//    3    9:areturn         
		}

		private static final Rounding $VALUES[];
		public static final Rounding CLOSEST;
		public static final Rounding DOWN;
		public static final Rounding UP;

		static 
		{
			UP = new Rounding("UP", 0);
		//    0    0:new             #2   <Class DataSet$Rounding>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "UP">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void DataSet$Rounding(String, int)>
		//    5   10:putstatic       #23  <Field DataSet$Rounding UP>
			DOWN = new Rounding("DOWN", 1);
		//    6   13:new             #2   <Class DataSet$Rounding>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "DOWN">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void DataSet$Rounding(String, int)>
		//   11   23:putstatic       #26  <Field DataSet$Rounding DOWN>
			CLOSEST = new Rounding("CLOSEST", 2);
		//   12   26:new             #2   <Class DataSet$Rounding>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "CLOSEST">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void DataSet$Rounding(String, int)>
		//   17   36:putstatic       #29  <Field DataSet$Rounding CLOSEST>
			$VALUES = (new Rounding[] {
				UP, DOWN, CLOSEST
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       Rounding[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field DataSet$Rounding UP>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field DataSet$Rounding DOWN>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field DataSet$Rounding CLOSEST>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field DataSet$Rounding[] $VALUES>
		//*  33   64:return          
		}

		private Rounding(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public DataSet(List list, String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #19  <Method void BaseDataSet(String)>
		mYVals = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #21  <Field List mYVals>
		mYMax = 0.0F;
	//    6   10:aload_0         
	//    7   11:fconst_0        
	//    8   12:putfield        #23  <Field float mYMax>
		mYMin = 0.0F;
	//    9   15:aload_0         
	//   10   16:fconst_0        
	//   11   17:putfield        #25  <Field float mYMin>
		mYVals = list;
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:putfield        #21  <Field List mYVals>
		if(mYVals == null)
	//*  15   25:aload_0         
	//*  16   26:getfield        #21  <Field List mYVals>
	//*  17   29:ifnonnull       43
			mYVals = ((List) (new ArrayList()));
	//   18   32:aload_0         
	//   19   33:new             #27  <Class ArrayList>
	//   20   36:dup             
	//   21   37:invokespecial   #30  <Method void ArrayList()>
	//   22   40:putfield        #21  <Field List mYVals>
		calcMinMax(0, mYVals.size());
	//   23   43:aload_0         
	//   24   44:iconst_0        
	//   25   45:aload_0         
	//   26   46:getfield        #21  <Field List mYVals>
	//   27   49:invokeinterface #36  <Method int List.size()>
	//   28   54:invokevirtual   #40  <Method void calcMinMax(int, int)>
	//   29   57:return          
	}

	public boolean addEntry(Entry entry)
	{
		float f;
		Object obj;
		if(entry == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		f = entry.getVal();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #51  <Method float Entry.getVal()>
	//    6   10:fstore_2        
		List list = getYVals();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #55  <Method List getYVals()>
	//    9   15:astore          4
		obj = ((Object) (list));
	//   10   17:aload           4
	//   11   19:astore_3        
		if(list == null)
	//*  12   20:aload           4
	//*  13   22:ifnonnull       33
			obj = ((Object) (new ArrayList()));
	//   14   25:new             #27  <Class ArrayList>
	//   15   28:dup             
	//   16   29:invokespecial   #30  <Method void ArrayList()>
	//   17   32:astore_3        
		if(((List) (obj)).size() != 0) goto _L2; else goto _L1
	//   18   33:aload_3         
	//   19   34:invokeinterface #36  <Method int List.size()>
	//   20   39:ifne            62
_L1:
		mYMax = f;
	//   21   42:aload_0         
	//   22   43:fload_2         
	//   23   44:putfield        #23  <Field float mYMax>
		mYMin = f;
	//   24   47:aload_0         
	//   25   48:fload_2         
	//   26   49:putfield        #25  <Field float mYMin>
_L4:
		((List) (obj)).add(((Object) (entry)));
	//   27   52:aload_3         
	//   28   53:aload_1         
	//   29   54:invokeinterface #59  <Method boolean List.add(Object)>
	//   30   59:pop             
		return true;
	//   31   60:iconst_1        
	//   32   61:ireturn         
_L2:
		if(mYMax < f)
	//*  33   62:aload_0         
	//*  34   63:getfield        #23  <Field float mYMax>
	//*  35   66:fload_2         
	//*  36   67:fcmpg           
	//*  37   68:ifge            76
			mYMax = f;
	//   38   71:aload_0         
	//   39   72:fload_2         
	//   40   73:putfield        #23  <Field float mYMax>
		if(mYMin > f)
	//*  41   76:aload_0         
	//*  42   77:getfield        #25  <Field float mYMin>
	//*  43   80:fload_2         
	//*  44   81:fcmpl           
	//*  45   82:ifle            52
			mYMin = f;
	//   46   85:aload_0         
	//   47   86:fload_2         
	//   48   87:putfield        #25  <Field float mYMin>
		if(true) goto _L4; else goto _L3
	//   49   90:goto            52
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
	//    4    6:invokevirtual   #51  <Method float Entry.getVal()>
	//    5    9:fstore_2        
		if(mYVals == null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #21  <Field List mYVals>
	//*   8   14:ifnonnull       28
			mYVals = ((List) (new ArrayList()));
	//    9   17:aload_0         
	//   10   18:new             #27  <Class ArrayList>
	//   11   21:dup             
	//   12   22:invokespecial   #30  <Method void ArrayList()>
	//   13   25:putfield        #21  <Field List mYVals>
		if(mYVals.size() == 0)
	//*  14   28:aload_0         
	//*  15   29:getfield        #21  <Field List mYVals>
	//*  16   32:invokeinterface #36  <Method int List.size()>
	//*  17   37:ifne            119
		{
			mYMax = f;
	//   18   40:aload_0         
	//   19   41:fload_2         
	//   20   42:putfield        #23  <Field float mYMax>
			mYMin = f;
	//   21   45:aload_0         
	//   22   46:fload_2         
	//   23   47:putfield        #25  <Field float mYMin>
		} else
	//*  24   50:aload_0         
	//*  25   51:getfield        #21  <Field List mYVals>
	//*  26   54:invokeinterface #36  <Method int List.size()>
	//*  27   59:ifle            150
	//*  28   62:aload_0         
	//*  29   63:getfield        #21  <Field List mYVals>
	//*  30   66:aload_0         
	//*  31   67:getfield        #21  <Field List mYVals>
	//*  32   70:invokeinterface #36  <Method int List.size()>
	//*  33   75:iconst_1        
	//*  34   76:isub            
	//*  35   77:invokeinterface #66  <Method Object List.get(int)>
	//*  36   82:checkcast       #47  <Class Entry>
	//*  37   85:invokevirtual   #69  <Method int Entry.getXIndex()>
	//*  38   88:aload_1         
	//*  39   89:invokevirtual   #69  <Method int Entry.getXIndex()>
	//*  40   92:icmple          150
	//*  41   95:aload_0         
	//*  42   96:aload_1         
	//*  43   97:invokevirtual   #69  <Method int Entry.getXIndex()>
	//*  44  100:getstatic       #73  <Field DataSet$Rounding DataSet$Rounding.UP>
	//*  45  103:invokevirtual   #77  <Method int getEntryIndex(int, DataSet$Rounding)>
	//*  46  106:istore_3        
	//*  47  107:aload_0         
	//*  48  108:getfield        #21  <Field List mYVals>
	//*  49  111:iload_3         
	//*  50  112:aload_1         
	//*  51  113:invokeinterface #80  <Method void List.add(int, Object)>
	//*  52  118:return          
		{
			if(mYMax < f)
	//*  53  119:aload_0         
	//*  54  120:getfield        #23  <Field float mYMax>
	//*  55  123:fload_2         
	//*  56  124:fcmpg           
	//*  57  125:ifge            133
				mYMax = f;
	//   58  128:aload_0         
	//   59  129:fload_2         
	//   60  130:putfield        #23  <Field float mYMax>
			if(mYMin > f)
	//*  61  133:aload_0         
	//*  62  134:getfield        #25  <Field float mYMin>
	//*  63  137:fload_2         
	//*  64  138:fcmpl           
	//*  65  139:ifle            50
				mYMin = f;
	//   66  142:aload_0         
	//   67  143:fload_2         
	//   68  144:putfield        #25  <Field float mYMin>
		}
		if(mYVals.size() > 0 && ((Entry)mYVals.get(mYVals.size() - 1)).getXIndex() > entry.getXIndex())
		{
			int i = getEntryIndex(entry.getXIndex(), Rounding.UP);
			mYVals.add(i, ((Object) (entry)));
			return;
		} else
	//*  69  147:goto            50
		{
			mYVals.add(((Object) (entry)));
	//   70  150:aload_0         
	//   71  151:getfield        #21  <Field List mYVals>
	//   72  154:aload_1         
	//   73  155:invokeinterface #59  <Method boolean List.add(Object)>
	//   74  160:pop             
			return;
	//   75  161:return          
		}
	}

	public void calcMinMax(int i, int j)
	{
		int k;
		if(mYVals != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field List mYVals>
	//*   2    4:ifnonnull       8
	//*   3    7:return          
	//*   4    8:aload_0         
	//*   5    9:getfield        #21  <Field List mYVals>
	//*   6   12:invokeinterface #36  <Method int List.size()>
	//*   7   17:istore_3        
			if((k = mYVals.size()) != 0)
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
	//   20   36:ldc1            #82  <Float 3.402823E+38F>
	//   21   38:putfield        #25  <Field float mYMin>
				mYMax = -3.402823E+38F;
	//   22   41:aload_0         
	//   23   42:ldc1            #83  <Float -3.402823E+38F>
	//   24   44:putfield        #23  <Field float mYMax>
				for(; i <= j; i++)
	//*  25   47:iload_1         
	//*  26   48:iload_2         
	//*  27   49:icmpgt          137
				{
					Entry entry = (Entry)mYVals.get(i);
	//   28   52:aload_0         
	//   29   53:getfield        #21  <Field List mYVals>
	//   30   56:iload_1         
	//   31   57:invokeinterface #66  <Method Object List.get(int)>
	//   32   62:checkcast       #47  <Class Entry>
	//   33   65:astore          4
					if(entry == null || Float.isNaN(entry.getVal()))
						continue;
	//   34   67:aload           4
	//   35   69:ifnull          127
	//   36   72:aload           4
	//   37   74:invokevirtual   #51  <Method float Entry.getVal()>
	//   38   77:invokestatic    #89  <Method boolean Float.isNaN(float)>
	//   39   80:ifne            127
					if(entry.getVal() < mYMin)
	//*  40   83:aload           4
	//*  41   85:invokevirtual   #51  <Method float Entry.getVal()>
	//*  42   88:aload_0         
	//*  43   89:getfield        #25  <Field float mYMin>
	//*  44   92:fcmpg           
	//*  45   93:ifge            105
						mYMin = entry.getVal();
	//   46   96:aload_0         
	//   47   97:aload           4
	//   48   99:invokevirtual   #51  <Method float Entry.getVal()>
	//   49  102:putfield        #25  <Field float mYMin>
					if(entry.getVal() > mYMax)
	//*  50  105:aload           4
	//*  51  107:invokevirtual   #51  <Method float Entry.getVal()>
	//*  52  110:aload_0         
	//*  53  111:getfield        #23  <Field float mYMax>
	//*  54  114:fcmpl           
	//*  55  115:ifle            127
						mYMax = entry.getVal();
	//   56  118:aload_0         
	//   57  119:aload           4
	//   58  121:invokevirtual   #51  <Method float Entry.getVal()>
	//   59  124:putfield        #23  <Field float mYMax>
				}

	//   60  127:iload_1         
	//   61  128:iconst_1        
	//   62  129:iadd            
	//   63  130:istore_1        
	//*  64  131:goto            47
	//*  65  134:goto            35
				if(mYMin == 3.402823E+38F)
	//*  66  137:aload_0         
	//*  67  138:getfield        #25  <Field float mYMin>
	//*  68  141:ldc1            #82  <Float 3.402823E+38F>
	//*  69  143:fcmpl           
	//*  70  144:ifne            7
				{
					mYMin = 0.0F;
	//   71  147:aload_0         
	//   72  148:fconst_0        
	//   73  149:putfield        #25  <Field float mYMin>
					mYMax = 0.0F;
	//   74  152:aload_0         
	//   75  153:fconst_0        
	//   76  154:putfield        #23  <Field float mYMax>
					return;
	//   77  157:return          
				}
			}
	}

	public void clear()
	{
		mYVals.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field List mYVals>
	//    2    4:invokeinterface #92  <Method void List.clear()>
		notifyDataSetChanged();
	//    3    9:aload_0         
	//    4   10:invokevirtual   #95  <Method void notifyDataSetChanged()>
	//    5   13:return          
	}

	public abstract DataSet copy();

	public List getEntriesForXIndex(int i)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #27  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void ArrayList()>
	//    3    7:astore          9
		int k = 0;
	//    4    9:iconst_0        
	//    5   10:istore_3        
		for(int j = mYVals.size() - 1; k <= j;)
	//*   6   11:aload_0         
	//*   7   12:getfield        #21  <Field List mYVals>
	//*   8   15:invokeinterface #36  <Method int List.size()>
	//*   9   20:iconst_1        
	//*  10   21:isub            
	//*  11   22:istore_2        
	//*  12   23:iload_3         
	//*  13   24:iload_2         
	//*  14   25:icmpgt          219
		{
			int j1 = (j + k) / 2;
	//   15   28:iload_2         
	//   16   29:iload_3         
	//   17   30:iadd            
	//   18   31:iconst_2        
	//   19   32:idiv            
	//   20   33:istore          6
			Entry entry1 = (Entry)mYVals.get(j1);
	//   21   35:aload_0         
	//   22   36:getfield        #21  <Field List mYVals>
	//   23   39:iload           6
	//   24   41:invokeinterface #66  <Method Object List.get(int)>
	//   25   46:checkcast       #47  <Class Entry>
	//   26   49:astore          8
			Entry entry = entry1;
	//   27   51:aload           8
	//   28   53:astore          7
			int l = j;
	//   29   55:iload_2         
	//   30   56:istore          4
			int i1 = j1;
	//   31   58:iload           6
	//   32   60:istore          5
			if(i == entry1.getXIndex())
	//*  33   62:iload_1         
	//*  34   63:aload           8
	//*  35   65:invokevirtual   #69  <Method int Entry.getXIndex()>
	//*  36   68:icmpne          191
			{
				for(j = j1; j > 0 && ((Entry)mYVals.get(j - 1)).getXIndex() == i; j--);
	//   37   71:iload           6
	//   38   73:istore_2        
	//   39   74:iload_2         
	//   40   75:ifle            107
	//   41   78:aload_0         
	//   42   79:getfield        #21  <Field List mYVals>
	//   43   82:iload_2         
	//   44   83:iconst_1        
	//   45   84:isub            
	//   46   85:invokeinterface #66  <Method Object List.get(int)>
	//   47   90:checkcast       #47  <Class Entry>
	//   48   93:invokevirtual   #69  <Method int Entry.getXIndex()>
	//   49   96:iload_1         
	//   50   97:icmpne          107
	//   51  100:iload_2         
	//   52  101:iconst_1        
	//   53  102:isub            
	//   54  103:istore_2        
	//*  55  104:goto            74
				j1 = mYVals.size();
	//   56  107:aload_0         
	//   57  108:getfield        #21  <Field List mYVals>
	//   58  111:invokeinterface #36  <Method int List.size()>
	//   59  116:istore          6
				entry = entry1;
	//   60  118:aload           8
	//   61  120:astore          7
				do
				{
					l = j1;
	//   62  122:iload           6
	//   63  124:istore          4
					i1 = j;
	//   64  126:iload_2         
	//   65  127:istore          5
					if(j >= j1)
						break;
	//   66  129:iload_2         
	//   67  130:iload           6
	//   68  132:icmpge          191
					Entry entry2 = (Entry)mYVals.get(j);
	//   69  135:aload_0         
	//   70  136:getfield        #21  <Field List mYVals>
	//   71  139:iload_2         
	//   72  140:invokeinterface #66  <Method Object List.get(int)>
	//   73  145:checkcast       #47  <Class Entry>
	//   74  148:astore          8
					entry = entry2;
	//   75  150:aload           8
	//   76  152:astore          7
					l = j1;
	//   77  154:iload           6
	//   78  156:istore          4
					i1 = j;
	//   79  158:iload_2         
	//   80  159:istore          5
					if(entry2.getXIndex() != i)
						break;
	//   81  161:aload           8
	//   82  163:invokevirtual   #69  <Method int Entry.getXIndex()>
	//   83  166:iload_1         
	//   84  167:icmpne          191
					((List) (arraylist)).add(((Object) (entry2)));
	//   85  170:aload           9
	//   86  172:aload           8
	//   87  174:invokeinterface #59  <Method boolean List.add(Object)>
	//   88  179:pop             
					j++;
	//   89  180:iload_2         
	//   90  181:iconst_1        
	//   91  182:iadd            
	//   92  183:istore_2        
					entry = entry2;
	//   93  184:aload           8
	//   94  186:astore          7
				} while(true);
	//   95  188:goto            122
			}
			if(i > entry.getXIndex())
	//*  96  191:iload_1         
	//*  97  192:aload           7
	//*  98  194:invokevirtual   #69  <Method int Entry.getXIndex()>
	//*  99  197:icmple          211
			{
				k = i1 + 1;
	//  100  200:iload           5
	//  101  202:iconst_1        
	//  102  203:iadd            
	//  103  204:istore_3        
				j = l;
	//  104  205:iload           4
	//  105  207:istore_2        
			} else
	//* 106  208:goto            23
			{
				j = i1 - 1;
	//  107  211:iload           5
	//  108  213:iconst_1        
	//  109  214:isub            
	//  110  215:istore_2        
			}
		}

	//* 111  216:goto            23
		return ((List) (arraylist));
	//  112  219:aload           9
	//  113  221:areturn         
	}

	public int getEntryCount()
	{
		return mYVals.size();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field List mYVals>
	//    2    4:invokeinterface #36  <Method int List.size()>
	//    3    9:ireturn         
	}

	public Entry getEntryForIndex(int i)
	{
		return (Entry)mYVals.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field List mYVals>
	//    2    4:iload_1         
	//    3    5:invokeinterface #66  <Method Object List.get(int)>
	//    4   10:checkcast       #47  <Class Entry>
	//    5   13:areturn         
	}

	public Entry getEntryForXIndex(int i)
	{
		return getEntryForXIndex(i, Rounding.CLOSEST);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:getstatic       #108 <Field DataSet$Rounding DataSet$Rounding.CLOSEST>
	//    3    5:invokevirtual   #111 <Method Entry getEntryForXIndex(int, DataSet$Rounding)>
	//    4    8:areturn         
	}

	public Entry getEntryForXIndex(int i, Rounding rounding)
	{
		i = getEntryIndex(i, rounding);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #77  <Method int getEntryIndex(int, DataSet$Rounding)>
	//    4    6:istore_1        
		if(i > -1)
	//*   5    7:iload_1         
	//*   6    8:iconst_m1       
	//*   7    9:icmple          26
			return (Entry)mYVals.get(i);
	//    8   12:aload_0         
	//    9   13:getfield        #21  <Field List mYVals>
	//   10   16:iload_1         
	//   11   17:invokeinterface #66  <Method Object List.get(int)>
	//   12   22:checkcast       #47  <Class Entry>
	//   13   25:areturn         
		else
			return null;
	//   14   26:aconst_null     
	//   15   27:areturn         
	}

	public int getEntryIndex(int i, Rounding rounding)
	{
		int j;
		int k;
		int l;
		j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		l = mYVals.size() - 1;
	//    2    2:aload_0         
	//    3    3:getfield        #21  <Field List mYVals>
	//    4    6:invokeinterface #36  <Method int List.size()>
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
		if(i != ((Entry)mYVals.get(k)).getXIndex()) goto _L2; else goto _L1
	//   19   32:iload_1         
	//   20   33:aload_0         
	//   21   34:getfield        #21  <Field List mYVals>
	//   22   37:iload           4
	//   23   39:invokeinterface #66  <Method Object List.get(int)>
	//   24   44:checkcast       #47  <Class Entry>
	//   25   47:invokevirtual   #69  <Method int Entry.getXIndex()>
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
			if(((Entry)mYVals.get(j - 1)).getXIndex() != i)
				break;
	//   35   66:aload_0         
	//   36   67:getfield        #21  <Field List mYVals>
	//   37   70:iload_3         
	//   38   71:iconst_1        
	//   39   72:isub            
	//   40   73:invokeinterface #66  <Method Object List.get(int)>
	//   41   78:checkcast       #47  <Class Entry>
	//   42   81:invokevirtual   #69  <Method int Entry.getXIndex()>
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
		if(i > ((Entry)mYVals.get(k)).getXIndex())
	//*  50   95:iload_1         
	//*  51   96:aload_0         
	//*  52   97:getfield        #21  <Field List mYVals>
	//*  53  100:iload           4
	//*  54  102:invokeinterface #66  <Method Object List.get(int)>
	//*  55  107:checkcast       #47  <Class Entry>
	//*  56  110:invokevirtual   #69  <Method int Entry.getXIndex()>
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
		l = ((Entry)mYVals.get(k)).getXIndex();
	//   73  142:aload_0         
	//   74  143:getfield        #21  <Field List mYVals>
	//   75  146:iload           4
	//   76  148:invokeinterface #66  <Method Object List.get(int)>
	//   77  153:checkcast       #47  <Class Entry>
	//   78  156:invokevirtual   #69  <Method int Entry.getXIndex()>
	//   79  159:istore          5
		if(rounding != Rounding.UP) goto _L9; else goto _L8
	//   80  161:aload_2         
	//   81  162:getstatic       #73  <Field DataSet$Rounding DataSet$Rounding.UP>
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
			if(k < mYVals.size() - 1)
	//*  90  180:iload           4
	//*  91  182:aload_0         
	//*  92  183:getfield        #21  <Field List mYVals>
	//*  93  186:invokeinterface #36  <Method int List.size()>
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
		if(rounding == Rounding.DOWN)
	//* 107  210:aload_2         
	//* 108  211:getstatic       #115 <Field DataSet$Rounding DataSet$Rounding.DOWN>
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
		return mYVals.indexOf(((Object) (entry)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field List mYVals>
	//    2    4:aload_1         
	//    3    5:invokeinterface #120 <Method int List.indexOf(Object)>
	//    4   10:ireturn         
	}

	public float getYMax()
	{
		return mYMax;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field float mYMax>
	//    2    4:freturn         
	}

	public float getYMin()
	{
		return mYMin;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field float mYMin>
	//    2    4:freturn         
	}

	public float getYValForXIndex(int i)
	{
		Entry entry = getEntryForXIndex(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #126 <Method Entry getEntryForXIndex(int)>
	//    3    5:astore_2        
		if(entry != null && entry.getXIndex() == i)
	//*   4    6:aload_2         
	//*   5    7:ifnull          23
	//*   6   10:aload_2         
	//*   7   11:invokevirtual   #69  <Method int Entry.getXIndex()>
	//*   8   14:iload_1         
	//*   9   15:icmpne          23
			return entry.getVal();
	//   10   18:aload_2         
	//   11   19:invokevirtual   #51  <Method float Entry.getVal()>
	//   12   22:freturn         
		else
			return (0.0F / 0.0F);
	//   13   23:ldc1            #127 <Float (0.0F / 0.0F)>
	//   14   25:freturn         
	}

	public List getYVals()
	{
		return mYVals;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field List mYVals>
	//    2    4:areturn         
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
			if(mYVals == null)
	//*   6    8:aload_0         
	//*   7    9:getfield        #21  <Field List mYVals>
	//*   8   12:ifnonnull       17
				return false;
	//    9   15:iconst_0        
	//   10   16:ireturn         
			boolean flag1 = mYVals.remove(((Object) (entry)));
	//   11   17:aload_0         
	//   12   18:getfield        #21  <Field List mYVals>
	//   13   21:aload_1         
	//   14   22:invokeinterface #132 <Method boolean List.remove(Object)>
	//   15   27:istore_3        
			flag = flag1;
	//   16   28:iload_3         
	//   17   29:istore_2        
			if(flag1)
	//*  18   30:iload_3         
	//*  19   31:ifeq            6
			{
				calcMinMax(0, mYVals.size());
	//   20   34:aload_0         
	//   21   35:iconst_0        
	//   22   36:aload_0         
	//   23   37:getfield        #21  <Field List mYVals>
	//   24   40:invokeinterface #36  <Method int List.size()>
	//   25   45:invokevirtual   #40  <Method void calcMinMax(int, int)>
				return flag1;
	//   26   48:iload_3         
	//   27   49:ireturn         
			}
		}
		return flag;
	}

	public String toSimpleString()
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #136 <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #137 <Method void StringBuffer()>
	//    3    7:astore_2        
		StringBuilder stringbuilder = (new StringBuilder()).append("DataSet, label: ");
	//    4    8:new             #139 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #140 <Method void StringBuilder()>
	//    7   15:ldc1            #142 <String "DataSet, label: ">
	//    8   17:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//    9   20:astore_3        
		String s;
		if(getLabel() == null)
	//*  10   21:aload_0         
	//*  11   22:invokevirtual   #149 <Method String getLabel()>
	//*  12   25:ifnonnull       71
			s = "";
	//   13   28:ldc1            #151 <String "">
	//   14   30:astore_1        
		else
	//*  15   31:aload_2         
	//*  16   32:aload_3         
	//*  17   33:aload_1         
	//*  18   34:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//*  19   37:ldc1            #153 <String ", entries: ">
	//*  20   39:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//*  21   42:aload_0         
	//*  22   43:getfield        #21  <Field List mYVals>
	//*  23   46:invokeinterface #36  <Method int List.size()>
	//*  24   51:invokevirtual   #156 <Method StringBuilder StringBuilder.append(int)>
	//*  25   54:ldc1            #158 <String "\n">
	//*  26   56:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//*  27   59:invokevirtual   #161 <Method String StringBuilder.toString()>
	//*  28   62:invokevirtual   #164 <Method StringBuffer StringBuffer.append(String)>
	//*  29   65:pop             
	//*  30   66:aload_2         
	//*  31   67:invokevirtual   #165 <Method String StringBuffer.toString()>
	//*  32   70:areturn         
			s = getLabel();
	//   33   71:aload_0         
	//   34   72:invokevirtual   #149 <Method String getLabel()>
	//   35   75:astore_1        
		stringbuffer.append(stringbuilder.append(s).append(", entries: ").append(mYVals.size()).append("\n").toString());
		return stringbuffer.toString();
	//*  36   76:goto            31
	}

	public String toString()
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #136 <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #137 <Method void StringBuffer()>
	//    3    7:astore_2        
		stringbuffer.append(toSimpleString());
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #167 <Method String toSimpleString()>
	//    7   13:invokevirtual   #164 <Method StringBuffer StringBuffer.append(String)>
	//    8   16:pop             
		for(int i = 0; i < mYVals.size(); i++)
	//*   9   17:iconst_0        
	//*  10   18:istore_1        
	//*  11   19:iload_1         
	//*  12   20:aload_0         
	//*  13   21:getfield        #21  <Field List mYVals>
	//*  14   24:invokeinterface #36  <Method int List.size()>
	//*  15   29:icmpge          78
			stringbuffer.append((new StringBuilder()).append(((Entry)mYVals.get(i)).toString()).append(" ").toString());
	//   16   32:aload_2         
	//   17   33:new             #139 <Class StringBuilder>
	//   18   36:dup             
	//   19   37:invokespecial   #140 <Method void StringBuilder()>
	//   20   40:aload_0         
	//   21   41:getfield        #21  <Field List mYVals>
	//   22   44:iload_1         
	//   23   45:invokeinterface #66  <Method Object List.get(int)>
	//   24   50:checkcast       #47  <Class Entry>
	//   25   53:invokevirtual   #168 <Method String Entry.toString()>
	//   26   56:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   27   59:ldc1            #170 <String " ">
	//   28   61:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//   29   64:invokevirtual   #161 <Method String StringBuilder.toString()>
	//   30   67:invokevirtual   #164 <Method StringBuffer StringBuffer.append(String)>
	//   31   70:pop             

	//   32   71:iload_1         
	//   33   72:iconst_1        
	//   34   73:iadd            
	//   35   74:istore_1        
	//*  36   75:goto            19
		return stringbuffer.toString();
	//   37   78:aload_2         
	//   38   79:invokevirtual   #165 <Method String StringBuffer.toString()>
	//   39   82:areturn         
	}

	protected float mYMax;
	protected float mYMin;
	protected List mYVals;
}
