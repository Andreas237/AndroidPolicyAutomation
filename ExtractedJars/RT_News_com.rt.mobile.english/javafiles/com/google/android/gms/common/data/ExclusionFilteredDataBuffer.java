// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import android.text.TextUtils;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.data:
//			FilteredDataBuffer, ExclusionFilterable, DataBufferObserverSet, AbstractDataBuffer, 
//			EntityBuffer, DataHolder, DataBuffer, DataBufferObserver

public final class ExclusionFilteredDataBuffer extends FilteredDataBuffer
	implements DataBufferObserver.Observable, ExclusionFilterable
{

	public ExclusionFilteredDataBuffer(AbstractDataBuffer abstractdatabuffer, String s)
	{
		super(((DataBuffer) (abstractdatabuffer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void FilteredDataBuffer(DataBuffer)>
	//    3    5:aload_0         
	//    4    6:new             #27  <Class HashSet>
	//    5    9:dup             
	//    6   10:invokespecial   #30  <Method void HashSet()>
	//    7   13:putfield        #32  <Field HashSet zzoe>
		zzoc = abstractdatabuffer;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #34  <Field AbstractDataBuffer zzoc>
		zzod = s;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #36  <Field String zzod>
		zzof = new DataBufferObserverSet();
	//   14   26:aload_0         
	//   15   27:new             #38  <Class DataBufferObserverSet>
	//   16   30:dup             
	//   17   31:invokespecial   #39  <Method void DataBufferObserverSet()>
	//   18   34:putfield        #41  <Field DataBufferObserverSet zzof>
	//   19   37:return          
	}

	private final ArrayList zza(String s, ArrayList arraylist)
	{
		ArrayList arraylist1 = new ArrayList();
	//    0    0:new             #48  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #49  <Method void ArrayList()>
	//    3    7:astore          9
		if(arraylist != null)
	//*   4    9:aload_2         
	//*   5   10:ifnull          17
			arraylist.clear();
	//    6   13:aload_2         
	//    7   14:invokevirtual   #52  <Method void ArrayList.clear()>
		DataHolder dataholder = zzoc.mDataHolder;
	//    8   17:aload_0         
	//    9   18:getfield        #34  <Field AbstractDataBuffer zzoc>
	//   10   21:getfield        #58  <Field DataHolder AbstractDataBuffer.mDataHolder>
	//   11   24:astore          10
		String s1 = zzod;
	//   12   26:aload_0         
	//   13   27:getfield        #36  <Field String zzod>
	//   14   30:astore          11
		boolean flag = zzoc instanceof EntityBuffer;
	//   15   32:aload_0         
	//   16   33:getfield        #34  <Field AbstractDataBuffer zzoc>
	//   17   36:instanceof      #60  <Class EntityBuffer>
	//   18   39:istore          8
		int i1 = zzoc.getCount();
	//   19   41:aload_0         
	//   20   42:getfield        #34  <Field AbstractDataBuffer zzoc>
	//   21   45:invokevirtual   #64  <Method int AbstractDataBuffer.getCount()>
	//   22   48:istore          7
		int k = 0;
	//   23   50:iconst_0        
	//   24   51:istore          5
		int j;
		for(int i = 0; k < i1; i = j)
	//*  25   53:iconst_0        
	//*  26   54:istore_3        
	//*  27   55:iload           5
	//*  28   57:iload           7
	//*  29   59:icmpge          212
		{
			if(flag)
	//*  30   62:iload           8
	//*  31   64:ifeq            84
				j = ((EntityBuffer)zzoc).zzi(k);
	//   32   67:aload_0         
	//   33   68:getfield        #34  <Field AbstractDataBuffer zzoc>
	//   34   71:checkcast       #60  <Class EntityBuffer>
	//   35   74:iload           5
	//   36   76:invokevirtual   #68  <Method int EntityBuffer.zzi(int)>
	//   37   79:istore          4
			else
	//*  38   81:goto            88
				j = k;
	//   39   84:iload           5
	//   40   86:istore          4
			String s2 = dataholder.getString(s1, j, dataholder.getWindowIndex(j));
	//   41   88:aload           10
	//   42   90:aload           11
	//   43   92:iload           4
	//   44   94:aload           10
	//   45   96:iload           4
	//   46   98:invokevirtual   #73  <Method int DataHolder.getWindowIndex(int)>
	//   47  101:invokevirtual   #77  <Method String DataHolder.getString(String, int, int)>
	//   48  104:astore          12
			int l;
			if(arraylist != null)
	//*  49  106:aload_2         
	//*  50  107:ifnull          152
			{
				if(zzoe.contains(((Object) (Integer.valueOf(k)))))
	//*  51  110:aload_0         
	//*  52  111:getfield        #32  <Field HashSet zzoe>
	//*  53  114:iload           5
	//*  54  116:invokestatic    #83  <Method Integer Integer.valueOf(int)>
	//*  55  119:invokevirtual   #87  <Method boolean HashSet.contains(Object)>
	//*  56  122:ifeq            141
				{
					j = -i;
	//   57  125:iload_3         
	//   58  126:ineg            
	//   59  127:istore          4
					l = j - 1;
	//   60  129:iload           4
	//   61  131:iconst_1        
	//   62  132:isub            
	//   63  133:istore          6
					j = i;
	//   64  135:iload_3         
	//   65  136:istore          4
				} else
	//*  66  138:goto            158
				{
					j = i + 1;
	//   67  141:iload_3         
	//   68  142:iconst_1        
	//   69  143:iadd            
	//   70  144:istore          4
					l = i;
	//   71  146:iload_3         
	//   72  147:istore          6
				}
			} else
	//*  73  149:goto            158
			{
				j = i;
	//   74  152:iload_3         
	//   75  153:istore          4
				l = i;
	//   76  155:iload_3         
	//   77  156:istore          6
			}
			if(!TextUtils.isEmpty(((CharSequence) (s2))) && s2.equals(((Object) (s))))
	//*  78  158:aload           12
	//*  79  160:invokestatic    #93  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  80  163:ifne            200
	//*  81  166:aload           12
	//*  82  168:aload_1         
	//*  83  169:invokevirtual   #98  <Method boolean String.equals(Object)>
	//*  84  172:ifeq            200
			{
				arraylist1.add(((Object) (Integer.valueOf(k))));
	//   85  175:aload           9
	//   86  177:iload           5
	//   87  179:invokestatic    #83  <Method Integer Integer.valueOf(int)>
	//   88  182:invokevirtual   #101 <Method boolean ArrayList.add(Object)>
	//   89  185:pop             
				if(arraylist != null)
	//*  90  186:aload_2         
	//*  91  187:ifnull          200
					arraylist.add(((Object) (Integer.valueOf(l))));
	//   92  190:aload_2         
	//   93  191:iload           6
	//   94  193:invokestatic    #83  <Method Integer Integer.valueOf(int)>
	//   95  196:invokevirtual   #101 <Method boolean ArrayList.add(Object)>
	//   96  199:pop             
			}
			k++;
	//   97  200:iload           5
	//   98  202:iconst_1        
	//   99  203:iadd            
	//  100  204:istore          5
		}

	//  101  206:iload           4
	//  102  208:istore_3        
	//* 103  209:goto            55
		return arraylist1;
	//  104  212:aload           9
	//  105  214:areturn         
	}

	public final void addObserver(DataBufferObserver databufferobserver)
	{
		zzof.addObserver(databufferobserver);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field DataBufferObserverSet zzof>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #106 <Method void DataBufferObserverSet.addObserver(DataBufferObserver)>
	//    4    8:return          
	}

	public final void clearFilters()
	{
		if(!zzof.hasObservers())
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field DataBufferObserverSet zzof>
	//*   2    4:invokevirtual   #111 <Method boolean DataBufferObserverSet.hasObservers()>
	//*   3    7:ifne            18
		{
			zzoe.clear();
	//    4   10:aload_0         
	//    5   11:getfield        #32  <Field HashSet zzoe>
	//    6   14:invokevirtual   #112 <Method void HashSet.clear()>
			return;
	//    7   17:return          
		}
		int i1 = zzoe.size();
	//    8   18:aload_0         
	//    9   19:getfield        #32  <Field HashSet zzoe>
	//   10   22:invokevirtual   #115 <Method int HashSet.size()>
	//   11   25:istore          5
		Integer ainteger[] = new Integer[i1];
	//   12   27:iload           5
	//   13   29:anewarray       Integer[]
	//   14   32:astore          6
		ainteger = (Integer[])zzoe.toArray(((Object []) (ainteger)));
	//   15   34:aload_0         
	//   16   35:getfield        #32  <Field HashSet zzoe>
	//   17   38:aload           6
	//   18   40:invokevirtual   #119 <Method Object[] HashSet.toArray(Object[])>
	//   19   43:checkcast       #121 <Class Integer[]>
	//   20   46:astore          6
		Arrays.sort(((Object []) (ainteger)));
	//   21   48:aload           6
	//   22   50:invokestatic    #127 <Method void Arrays.sort(Object[])>
		int j = 0;
	//   23   53:iconst_0        
	//   24   54:istore_2        
		int i = 0;
	//   25   55:iconst_0        
	//   26   56:istore_1        
		int k = i;
	//   27   57:iload_1         
	//   28   58:istore_3        
		for(; j < i1; j++)
	//*  29   59:iload_2         
	//*  30   60:iload           5
	//*  31   62:icmpge          133
		{
			int l = ainteger[j].intValue();
	//   32   65:aload           6
	//   33   67:iload_2         
	//   34   68:aaload          
	//   35   69:invokevirtual   #130 <Method int Integer.intValue()>
	//   36   72:istore          4
			zzoe.remove(((Object) (Integer.valueOf(l))));
	//   37   74:aload_0         
	//   38   75:getfield        #32  <Field HashSet zzoe>
	//   39   78:iload           4
	//   40   80:invokestatic    #83  <Method Integer Integer.valueOf(int)>
	//   41   83:invokevirtual   #133 <Method boolean HashSet.remove(Object)>
	//   42   86:pop             
			if(i != 0)
	//*  43   87:iload_1         
	//*  44   88:ifne            99
	//*  45   91:iload           4
	//*  46   93:istore_3        
	//*  47   94:iconst_1        
	//*  48   95:istore_1        
	//*  49   96:goto            126
			{
				if(l == k + i)
	//*  50   99:iload           4
	//*  51  101:iload_3         
	//*  52  102:iload_1         
	//*  53  103:iadd            
	//*  54  104:icmpne          114
				{
					i++;
	//   55  107:iload_1         
	//   56  108:iconst_1        
	//   57  109:iadd            
	//   58  110:istore_1        
					continue;
	//   59  111:goto            126
				}
				zzof.onDataRangeRemoved(k, i);
	//   60  114:aload_0         
	//   61  115:getfield        #41  <Field DataBufferObserverSet zzof>
	//   62  118:iload_3         
	//   63  119:iload_1         
	//   64  120:invokevirtual   #137 <Method void DataBufferObserverSet.onDataRangeRemoved(int, int)>
			}
			k = l;
			i = 1;
		}

	//   65  123:goto            91
	//   66  126:iload_2         
	//   67  127:iconst_1        
	//   68  128:iadd            
	//   69  129:istore_2        
	//*  70  130:goto            59
		if(i > 0)
	//*  71  133:iload_1         
	//*  72  134:ifle            146
			zzof.onDataRangeRemoved(k, i);
	//   73  137:aload_0         
	//   74  138:getfield        #41  <Field DataBufferObserverSet zzof>
	//   75  141:iload_3         
	//   76  142:iload_1         
	//   77  143:invokevirtual   #137 <Method void DataBufferObserverSet.onDataRangeRemoved(int, int)>
	//   78  146:return          
	}

	public final int computeRealPosition(int i)
	{
		if(zzoe.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field HashSet zzoe>
	//*   2    4:invokevirtual   #140 <Method boolean HashSet.isEmpty()>
	//*   3    7:ifeq            12
			return i;
	//    4   10:iload_1         
	//    5   11:ireturn         
		if(i >= 0 && i < getCount())
	//*   6   12:iload_1         
	//*   7   13:iflt            89
	//*   8   16:iload_1         
	//*   9   17:aload_0         
	//*  10   18:invokevirtual   #141 <Method int getCount()>
	//*  11   21:icmplt          27
	//*  12   24:goto            89
		{
			int i1 = mDataBuffer.getCount();
	//   13   27:aload_0         
	//   14   28:getfield        #145 <Field DataBuffer mDataBuffer>
	//   15   31:invokeinterface #148 <Method int DataBuffer.getCount()>
	//   16   36:istore          5
			int j = 0;
	//   17   38:iconst_0        
	//   18   39:istore_2        
			int l;
			for(int k = 0; j < i1; k = l)
	//*  19   40:iconst_0        
	//*  20   41:istore_3        
	//*  21   42:iload_2         
	//*  22   43:iload           5
	//*  23   45:icmpge          87
			{
				l = k;
	//   24   48:iload_3         
	//   25   49:istore          4
				if(!zzoe.contains(((Object) (Integer.valueOf(j)))))
	//*  26   51:aload_0         
	//*  27   52:getfield        #32  <Field HashSet zzoe>
	//*  28   55:iload_2         
	//*  29   56:invokestatic    #83  <Method Integer Integer.valueOf(int)>
	//*  30   59:invokevirtual   #87  <Method boolean HashSet.contains(Object)>
	//*  31   62:ifne            77
				{
					if(k == i)
	//*  32   65:iload_3         
	//*  33   66:iload_1         
	//*  34   67:icmpne          72
						return j;
	//   35   70:iload_2         
	//   36   71:ireturn         
					l = k + 1;
	//   37   72:iload_3         
	//   38   73:iconst_1        
	//   39   74:iadd            
	//   40   75:istore          4
				}
				j++;
	//   41   77:iload_2         
	//   42   78:iconst_1        
	//   43   79:iadd            
	//   44   80:istore_2        
			}

	//   45   81:iload           4
	//   46   83:istore_3        
	//*  47   84:goto            42
			return -1;
	//   48   87:iconst_m1       
	//   49   88:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(53);
	//   50   89:new             #150 <Class StringBuilder>
	//   51   92:dup             
	//   52   93:bipush          53
	//   53   95:invokespecial   #153 <Method void StringBuilder(int)>
	//   54   98:astore          6
			stringbuilder.append("Position ");
	//   55  100:aload           6
	//   56  102:ldc1            #155 <String "Position ">
	//   57  104:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   58  107:pop             
			stringbuilder.append(i);
	//   59  108:aload           6
	//   60  110:iload_1         
	//   61  111:invokevirtual   #162 <Method StringBuilder StringBuilder.append(int)>
	//   62  114:pop             
			stringbuilder.append(" is out of bounds for this buffer");
	//   63  115:aload           6
	//   64  117:ldc1            #164 <String " is out of bounds for this buffer">
	//   65  119:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   66  122:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   67  123:new             #166 <Class IllegalArgumentException>
	//   68  126:dup             
	//   69  127:aload           6
	//   70  129:invokevirtual   #170 <Method String StringBuilder.toString()>
	//   71  132:invokespecial   #173 <Method void IllegalArgumentException(String)>
	//   72  135:athrow          
		}
	}

	public final void filterOut(String s)
	{
		int k;
		int l;
		int i1;
		ArrayList arraylist;
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #93  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		arraylist = null;
	//    4    8:aconst_null     
	//    5    9:astore          9
		if(zzof.hasObservers())
	//*   6   11:aload_0         
	//*   7   12:getfield        #41  <Field DataBufferObserverSet zzof>
	//*   8   15:invokevirtual   #111 <Method boolean DataBufferObserverSet.hasObservers()>
	//*   9   18:ifeq            30
			arraylist = new ArrayList();
	//   10   21:new             #48  <Class ArrayList>
	//   11   24:dup             
	//   12   25:invokespecial   #49  <Method void ArrayList()>
	//   13   28:astore          9
		s = ((String) (zza(s, arraylist)));
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:aload           9
	//   17   34:invokespecial   #176 <Method ArrayList zza(String, ArrayList)>
	//   18   37:astore_1        
		if(!zzof.hasObservers())
			break MISSING_BLOCK_LABEL_214;
	//   19   38:aload_0         
	//   20   39:getfield        #41  <Field DataBufferObserverSet zzof>
	//   21   42:invokevirtual   #111 <Method boolean DataBufferObserverSet.hasObservers()>
	//   22   45:ifeq            214
		k = ((ArrayList) (s)).size() - 1;
	//   23   48:aload_1         
	//   24   49:invokevirtual   #177 <Method int ArrayList.size()>
	//   25   52:iconst_1        
	//   26   53:isub            
	//   27   54:istore          4
		l = 0;
	//   28   56:iconst_0        
	//   29   57:istore          5
		i1 = l;
	//   30   59:iload           5
	//   31   61:istore          6
_L7:
		if(k < 0) goto _L2; else goto _L1
	//   32   63:iload           4
	//   33   65:iflt            197
_L1:
		int i;
		int j;
		boolean flag;
		int j1;
		j1 = ((Integer)arraylist.get(k)).intValue();
	//   34   68:aload           9
	//   35   70:iload           4
	//   36   72:invokevirtual   #181 <Method Object ArrayList.get(int)>
	//   37   75:checkcast       #79  <Class Integer>
	//   38   78:invokevirtual   #130 <Method int Integer.intValue()>
	//   39   81:istore          8
		if(j1 < 0)
	//*  40   83:iload           8
	//*  41   85:ifge            94
			flag = true;
	//   42   88:iconst_1        
	//   43   89:istore          7
		else
	//*  44   91:goto            97
			flag = false;
	//   45   94:iconst_0        
	//   46   95:istore          7
		i = l;
	//   47   97:iload           5
	//   48   99:istore_2        
		j = i1;
	//   49  100:iload           6
	//   50  102:istore_3        
		if(flag) goto _L4; else goto _L3
	//   51  103:iload           7
	//   52  105:ifne            182
_L3:
		i = ((Integer)((ArrayList) (s)).get(k)).intValue();
	//   53  108:aload_1         
	//   54  109:iload           4
	//   55  111:invokevirtual   #181 <Method Object ArrayList.get(int)>
	//   56  114:checkcast       #79  <Class Integer>
	//   57  117:invokevirtual   #130 <Method int Integer.intValue()>
	//   58  120:istore_2        
		zzoe.add(((Object) (Integer.valueOf(i))));
	//   59  121:aload_0         
	//   60  122:getfield        #32  <Field HashSet zzoe>
	//   61  125:iload_2         
	//   62  126:invokestatic    #83  <Method Integer Integer.valueOf(int)>
	//   63  129:invokevirtual   #182 <Method boolean HashSet.add(Object)>
	//   64  132:pop             
		if(l != 0) goto _L6; else goto _L5
	//   65  133:iload           5
	//   66  135:ifne            146
_L5:
		i = 1;
	//   67  138:iconst_1        
	//   68  139:istore_2        
		j = j1;
	//   69  140:iload           8
	//   70  142:istore_3        
		break; /* Loop/switch isn't completed */
	//   71  143:goto            182
_L6:
		if(j1 == i1 - 1)
	//*  72  146:iload           8
	//*  73  148:iload           6
	//*  74  150:iconst_1        
	//*  75  151:isub            
	//*  76  152:icmpne          168
		{
			j = i1 - 1;
	//   77  155:iload           6
	//   78  157:iconst_1        
	//   79  158:isub            
	//   80  159:istore_3        
			i = l + 1;
	//   81  160:iload           5
	//   82  162:iconst_1        
	//   83  163:iadd            
	//   84  164:istore_2        
			break; /* Loop/switch isn't completed */
	//   85  165:goto            182
		}
		zzof.onDataRangeRemoved(i1, l);
	//   86  168:aload_0         
	//   87  169:getfield        #41  <Field DataBufferObserverSet zzof>
	//   88  172:iload           6
	//   89  174:iload           5
	//   90  176:invokevirtual   #137 <Method void DataBufferObserverSet.onDataRangeRemoved(int, int)>
		if(true) goto _L5; else goto _L4
	//   91  179:goto            138
_L4:
		k--;
	//   92  182:iload           4
	//   93  184:iconst_1        
	//   94  185:isub            
	//   95  186:istore          4
		l = i;
	//   96  188:iload_2         
	//   97  189:istore          5
		i1 = j;
	//   98  191:iload_3         
	//   99  192:istore          6
		  goto _L7
	//* 100  194:goto            63
_L2:
		if(l > 0)
	//* 101  197:iload           5
	//* 102  199:ifle            213
			zzof.onDataRangeRemoved(i1, l);
	//  103  202:aload_0         
	//  104  203:getfield        #41  <Field DataBufferObserverSet zzof>
	//  105  206:iload           6
	//  106  208:iload           5
	//  107  210:invokevirtual   #137 <Method void DataBufferObserverSet.onDataRangeRemoved(int, int)>
		return;
	//  108  213:return          
		zzoe.addAll(((java.util.Collection) (s)));
	//  109  214:aload_0         
	//  110  215:getfield        #32  <Field HashSet zzoe>
	//  111  218:aload_1         
	//  112  219:invokevirtual   #186 <Method boolean HashSet.addAll(java.util.Collection)>
	//  113  222:pop             
		return;
	//  114  223:return          
	}

	public final int getCount()
	{
		return mDataBuffer.getCount() - zzoe.size();
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field DataBuffer mDataBuffer>
	//    2    4:invokeinterface #148 <Method int DataBuffer.getCount()>
	//    3    9:aload_0         
	//    4   10:getfield        #32  <Field HashSet zzoe>
	//    5   13:invokevirtual   #115 <Method int HashSet.size()>
	//    6   16:isub            
	//    7   17:ireturn         
	}

	public final void release()
	{
		super.release();
	//    0    0:aload_0         
	//    1    1:invokespecial   #189 <Method void FilteredDataBuffer.release()>
		zzof.clear();
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field DataBufferObserverSet zzof>
	//    4    8:invokevirtual   #190 <Method void DataBufferObserverSet.clear()>
	//    5   11:return          
	}

	public final void removeObserver(DataBufferObserver databufferobserver)
	{
		zzof.removeObserver(databufferobserver);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field DataBufferObserverSet zzof>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #193 <Method void DataBufferObserverSet.removeObserver(DataBufferObserver)>
	//    4    8:return          
	}

	public final void unfilter(String s)
	{
		int j;
		int k;
		int l;
		ArrayList arraylist;
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #93  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		arraylist = null;
	//    4    8:aconst_null     
	//    5    9:astore          9
		if(zzof.hasObservers())
	//*   6   11:aload_0         
	//*   7   12:getfield        #41  <Field DataBufferObserverSet zzof>
	//*   8   15:invokevirtual   #111 <Method boolean DataBufferObserverSet.hasObservers()>
	//*   9   18:ifeq            30
			arraylist = new ArrayList();
	//   10   21:new             #48  <Class ArrayList>
	//   11   24:dup             
	//   12   25:invokespecial   #49  <Method void ArrayList()>
	//   13   28:astore          9
		s = ((String) (zza(s, arraylist)));
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:aload           9
	//   17   34:invokespecial   #176 <Method ArrayList zza(String, ArrayList)>
	//   18   37:astore_1        
		if(!zzof.hasObservers())
			break MISSING_BLOCK_LABEL_211;
	//   19   38:aload_0         
	//   20   39:getfield        #41  <Field DataBufferObserverSet zzof>
	//   21   42:invokevirtual   #111 <Method boolean DataBufferObserverSet.hasObservers()>
	//   22   45:ifeq            211
		j = ((ArrayList) (s)).size() - 1;
	//   23   48:aload_1         
	//   24   49:invokevirtual   #177 <Method int ArrayList.size()>
	//   25   52:iconst_1        
	//   26   53:isub            
	//   27   54:istore_3        
		l = 0;
	//   28   55:iconst_0        
	//   29   56:istore          5
		k = l;
	//   30   58:iload           5
	//   31   60:istore          4
_L7:
		if(j < 0) goto _L2; else goto _L1
	//   32   62:iload_3         
	//   33   63:iflt            194
_L1:
		int i;
		int i1;
		boolean flag;
		int j1;
		j1 = ((Integer)arraylist.get(j)).intValue();
	//   34   66:aload           9
	//   35   68:iload_3         
	//   36   69:invokevirtual   #181 <Method Object ArrayList.get(int)>
	//   37   72:checkcast       #79  <Class Integer>
	//   38   75:invokevirtual   #130 <Method int Integer.intValue()>
	//   39   78:istore          8
		if(j1 < 0)
	//*  40   80:iload           8
	//*  41   82:ifge            91
			flag = true;
	//   42   85:iconst_1        
	//   43   86:istore          7
		else
	//*  44   88:goto            94
			flag = false;
	//   45   91:iconst_0        
	//   46   92:istore          7
		i = l;
	//   47   94:iload           5
	//   48   96:istore_2        
		i1 = k;
	//   49   97:iload           4
	//   50   99:istore          6
		if(!flag) goto _L4; else goto _L3
	//   51  101:iload           7
	//   52  103:ifeq            180
_L3:
		i = ((Integer)((ArrayList) (s)).get(j)).intValue();
	//   53  106:aload_1         
	//   54  107:iload_3         
	//   55  108:invokevirtual   #181 <Method Object ArrayList.get(int)>
	//   56  111:checkcast       #79  <Class Integer>
	//   57  114:invokevirtual   #130 <Method int Integer.intValue()>
	//   58  117:istore_2        
		zzoe.remove(((Object) (Integer.valueOf(i))));
	//   59  118:aload_0         
	//   60  119:getfield        #32  <Field HashSet zzoe>
	//   61  122:iload_2         
	//   62  123:invokestatic    #83  <Method Integer Integer.valueOf(int)>
	//   63  126:invokevirtual   #133 <Method boolean HashSet.remove(Object)>
	//   64  129:pop             
		i1 = -j1 - 1;
	//   65  130:iload           8
	//   66  132:ineg            
	//   67  133:iconst_1        
	//   68  134:isub            
	//   69  135:istore          6
		if(l != 0) goto _L6; else goto _L5
	//   70  137:iload           5
	//   71  139:ifne            147
_L5:
		i = 1;
	//   72  142:iconst_1        
	//   73  143:istore_2        
		break; /* Loop/switch isn't completed */
	//   74  144:goto            180
_L6:
		if(i1 == k)
	//*  75  147:iload           6
	//*  76  149:iload           4
	//*  77  151:icmpne          166
		{
			i = l + 1;
	//   78  154:iload           5
	//   79  156:iconst_1        
	//   80  157:iadd            
	//   81  158:istore_2        
			i1 = k;
	//   82  159:iload           4
	//   83  161:istore          6
			break; /* Loop/switch isn't completed */
	//   84  163:goto            180
		}
		zzof.onDataRangeInserted(k, l);
	//   85  166:aload_0         
	//   86  167:getfield        #41  <Field DataBufferObserverSet zzof>
	//   87  170:iload           4
	//   88  172:iload           5
	//   89  174:invokevirtual   #197 <Method void DataBufferObserverSet.onDataRangeInserted(int, int)>
		if(true) goto _L5; else goto _L4
	//   90  177:goto            142
_L4:
		j--;
	//   91  180:iload_3         
	//   92  181:iconst_1        
	//   93  182:isub            
	//   94  183:istore_3        
		l = i;
	//   95  184:iload_2         
	//   96  185:istore          5
		k = i1;
	//   97  187:iload           6
	//   98  189:istore          4
		  goto _L7
	//*  99  191:goto            62
_L2:
		if(l > 0)
	//* 100  194:iload           5
	//* 101  196:ifle            210
			zzof.onDataRangeInserted(k, l);
	//  102  199:aload_0         
	//  103  200:getfield        #41  <Field DataBufferObserverSet zzof>
	//  104  203:iload           4
	//  105  205:iload           5
	//  106  207:invokevirtual   #197 <Method void DataBufferObserverSet.onDataRangeInserted(int, int)>
		return;
	//  107  210:return          
		zzoe.removeAll(((java.util.Collection) (s)));
	//  108  211:aload_0         
	//  109  212:getfield        #32  <Field HashSet zzoe>
	//  110  215:aload_1         
	//  111  216:invokevirtual   #200 <Method boolean HashSet.removeAll(java.util.Collection)>
	//  112  219:pop             
		return;
	//  113  220:return          
	}

	private AbstractDataBuffer zzoc;
	private final String zzod;
	private final HashSet zzoe = new HashSet();
	private DataBufferObserverSet zzof;
}
