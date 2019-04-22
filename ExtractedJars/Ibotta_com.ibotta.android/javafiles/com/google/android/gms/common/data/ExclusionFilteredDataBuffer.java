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
		AbstractDataBuffer abstractdatabuffer = zzoc;
	//   15   32:aload_0         
	//   16   33:getfield        #34  <Field AbstractDataBuffer zzoc>
	//   17   36:astore          12
		boolean flag = abstractdatabuffer instanceof EntityBuffer;
	//   18   38:aload           12
	//   19   40:instanceof      #60  <Class EntityBuffer>
	//   20   43:istore          8
		int i1 = abstractdatabuffer.getCount();
	//   21   45:aload           12
	//   22   47:invokevirtual   #64  <Method int AbstractDataBuffer.getCount()>
	//   23   50:istore          7
		int k = 0;
	//   24   52:iconst_0        
	//   25   53:istore          5
		int j;
		for(int i = 0; k < i1; i = j)
	//*  26   55:iconst_0        
	//*  27   56:istore_3        
	//*  28   57:iload           5
	//*  29   59:iload           7
	//*  30   61:icmpge          214
		{
			if(flag)
	//*  31   64:iload           8
	//*  32   66:ifeq            86
				j = ((EntityBuffer)zzoc).zzi(k);
	//   33   69:aload_0         
	//   34   70:getfield        #34  <Field AbstractDataBuffer zzoc>
	//   35   73:checkcast       #60  <Class EntityBuffer>
	//   36   76:iload           5
	//   37   78:invokevirtual   #68  <Method int EntityBuffer.zzi(int)>
	//   38   81:istore          4
			else
	//*  39   83:goto            90
				j = k;
	//   40   86:iload           5
	//   41   88:istore          4
			String s2 = dataholder.getString(s1, j, dataholder.getWindowIndex(j));
	//   42   90:aload           10
	//   43   92:aload           11
	//   44   94:iload           4
	//   45   96:aload           10
	//   46   98:iload           4
	//   47  100:invokevirtual   #73  <Method int DataHolder.getWindowIndex(int)>
	//   48  103:invokevirtual   #77  <Method String DataHolder.getString(String, int, int)>
	//   49  106:astore          12
			int l;
			if(arraylist != null)
	//*  50  108:aload_2         
	//*  51  109:ifnull          154
			{
				if(zzoe.contains(((Object) (Integer.valueOf(k)))))
	//*  52  112:aload_0         
	//*  53  113:getfield        #32  <Field HashSet zzoe>
	//*  54  116:iload           5
	//*  55  118:invokestatic    #83  <Method Integer Integer.valueOf(int)>
	//*  56  121:invokevirtual   #87  <Method boolean HashSet.contains(Object)>
	//*  57  124:ifeq            143
				{
					j = -i;
	//   58  127:iload_3         
	//   59  128:ineg            
	//   60  129:istore          4
					l = j - 1;
	//   61  131:iload           4
	//   62  133:iconst_1        
	//   63  134:isub            
	//   64  135:istore          6
					j = i;
	//   65  137:iload_3         
	//   66  138:istore          4
				} else
	//*  67  140:goto            160
				{
					j = i + 1;
	//   68  143:iload_3         
	//   69  144:iconst_1        
	//   70  145:iadd            
	//   71  146:istore          4
					l = i;
	//   72  148:iload_3         
	//   73  149:istore          6
				}
			} else
	//*  74  151:goto            160
			{
				j = i;
	//   75  154:iload_3         
	//   76  155:istore          4
				l = i;
	//   77  157:iload_3         
	//   78  158:istore          6
			}
			if(!TextUtils.isEmpty(((CharSequence) (s2))) && s2.equals(((Object) (s))))
	//*  79  160:aload           12
	//*  80  162:invokestatic    #93  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  81  165:ifne            202
	//*  82  168:aload           12
	//*  83  170:aload_1         
	//*  84  171:invokevirtual   #98  <Method boolean String.equals(Object)>
	//*  85  174:ifeq            202
			{
				arraylist1.add(((Object) (Integer.valueOf(k))));
	//   86  177:aload           9
	//   87  179:iload           5
	//   88  181:invokestatic    #83  <Method Integer Integer.valueOf(int)>
	//   89  184:invokevirtual   #101 <Method boolean ArrayList.add(Object)>
	//   90  187:pop             
				if(arraylist != null)
	//*  91  188:aload_2         
	//*  92  189:ifnull          202
					arraylist.add(((Object) (Integer.valueOf(l))));
	//   93  192:aload_2         
	//   94  193:iload           6
	//   95  195:invokestatic    #83  <Method Integer Integer.valueOf(int)>
	//   96  198:invokevirtual   #101 <Method boolean ArrayList.add(Object)>
	//   97  201:pop             
			}
			k++;
	//   98  202:iload           5
	//   99  204:iconst_1        
	//  100  205:iadd            
	//  101  206:istore          5
		}

	//  102  208:iload           4
	//  103  210:istore_3        
	//* 104  211:goto            57
		return arraylist1;
	//  105  214:aload           9
	//  106  216:areturn         
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
		int k = 0;
	//   27   57:iconst_0        
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
	//*   7   13:iflt            86
	//*   8   16:iload_1         
	//*   9   17:aload_0         
	//*  10   18:invokevirtual   #141 <Method int getCount()>
	//*  11   21:icmpge          86
		{
			int i1 = mDataBuffer.getCount();
	//   12   24:aload_0         
	//   13   25:getfield        #145 <Field DataBuffer mDataBuffer>
	//   14   28:invokeinterface #148 <Method int DataBuffer.getCount()>
	//   15   33:istore          5
			int j = 0;
	//   16   35:iconst_0        
	//   17   36:istore_2        
			int l;
			for(int k = 0; j < i1; k = l)
	//*  18   37:iconst_0        
	//*  19   38:istore_3        
	//*  20   39:iload_2         
	//*  21   40:iload           5
	//*  22   42:icmpge          84
			{
				l = k;
	//   23   45:iload_3         
	//   24   46:istore          4
				if(!zzoe.contains(((Object) (Integer.valueOf(j)))))
	//*  25   48:aload_0         
	//*  26   49:getfield        #32  <Field HashSet zzoe>
	//*  27   52:iload_2         
	//*  28   53:invokestatic    #83  <Method Integer Integer.valueOf(int)>
	//*  29   56:invokevirtual   #87  <Method boolean HashSet.contains(Object)>
	//*  30   59:ifne            74
				{
					if(k == i)
	//*  31   62:iload_3         
	//*  32   63:iload_1         
	//*  33   64:icmpne          69
						return j;
	//   34   67:iload_2         
	//   35   68:ireturn         
					l = k + 1;
	//   36   69:iload_3         
	//   37   70:iconst_1        
	//   38   71:iadd            
	//   39   72:istore          4
				}
				j++;
	//   40   74:iload_2         
	//   41   75:iconst_1        
	//   42   76:iadd            
	//   43   77:istore_2        
			}

	//   44   78:iload           4
	//   45   80:istore_3        
	//*  46   81:goto            39
			return -1;
	//   47   84:iconst_m1       
	//   48   85:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(53);
	//   49   86:new             #150 <Class StringBuilder>
	//   50   89:dup             
	//   51   90:bipush          53
	//   52   92:invokespecial   #153 <Method void StringBuilder(int)>
	//   53   95:astore          6
			stringbuilder.append("Position ");
	//   54   97:aload           6
	//   55   99:ldc1            #155 <String "Position ">
	//   56  101:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   57  104:pop             
			stringbuilder.append(i);
	//   58  105:aload           6
	//   59  107:iload_1         
	//   60  108:invokevirtual   #162 <Method StringBuilder StringBuilder.append(int)>
	//   61  111:pop             
			stringbuilder.append(" is out of bounds for this buffer");
	//   62  112:aload           6
	//   63  114:ldc1            #164 <String " is out of bounds for this buffer">
	//   64  116:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   65  119:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   66  120:new             #166 <Class IllegalArgumentException>
	//   67  123:dup             
	//   68  124:aload           6
	//   69  126:invokevirtual   #170 <Method String StringBuilder.toString()>
	//   70  129:invokespecial   #173 <Method void IllegalArgumentException(String)>
	//   71  132:athrow          
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
			break MISSING_BLOCK_LABEL_213;
	//   19   38:aload_0         
	//   20   39:getfield        #41  <Field DataBufferObserverSet zzof>
	//   21   42:invokevirtual   #111 <Method boolean DataBufferObserverSet.hasObservers()>
	//   22   45:ifeq            213
		k = ((ArrayList) (s)).size() - 1;
	//   23   48:aload_1         
	//   24   49:invokevirtual   #177 <Method int ArrayList.size()>
	//   25   52:iconst_1        
	//   26   53:isub            
	//   27   54:istore          4
		l = 0;
	//   28   56:iconst_0        
	//   29   57:istore          5
		i1 = 0;
	//   30   59:iconst_0        
	//   31   60:istore          6
_L7:
		if(k < 0) goto _L2; else goto _L1
	//   32   62:iload           4
	//   33   64:iflt            196
_L1:
		int i;
		int j;
		boolean flag;
		int j1;
		j1 = ((Integer)arraylist.get(k)).intValue();
	//   34   67:aload           9
	//   35   69:iload           4
	//   36   71:invokevirtual   #181 <Method Object ArrayList.get(int)>
	//   37   74:checkcast       #79  <Class Integer>
	//   38   77:invokevirtual   #130 <Method int Integer.intValue()>
	//   39   80:istore          8
		if(j1 < 0)
	//*  40   82:iload           8
	//*  41   84:ifge            93
			flag = true;
	//   42   87:iconst_1        
	//   43   88:istore          7
		else
	//*  44   90:goto            96
			flag = false;
	//   45   93:iconst_0        
	//   46   94:istore          7
		i = l;
	//   47   96:iload           5
	//   48   98:istore_2        
		j = i1;
	//   49   99:iload           6
	//   50  101:istore_3        
		if(flag) goto _L4; else goto _L3
	//   51  102:iload           7
	//   52  104:ifne            181
_L3:
		i = ((Integer)((ArrayList) (s)).get(k)).intValue();
	//   53  107:aload_1         
	//   54  108:iload           4
	//   55  110:invokevirtual   #181 <Method Object ArrayList.get(int)>
	//   56  113:checkcast       #79  <Class Integer>
	//   57  116:invokevirtual   #130 <Method int Integer.intValue()>
	//   58  119:istore_2        
		zzoe.add(((Object) (Integer.valueOf(i))));
	//   59  120:aload_0         
	//   60  121:getfield        #32  <Field HashSet zzoe>
	//   61  124:iload_2         
	//   62  125:invokestatic    #83  <Method Integer Integer.valueOf(int)>
	//   63  128:invokevirtual   #182 <Method boolean HashSet.add(Object)>
	//   64  131:pop             
		if(l != 0) goto _L6; else goto _L5
	//   65  132:iload           5
	//   66  134:ifne            145
_L5:
		j = j1;
	//   67  137:iload           8
	//   68  139:istore_3        
		i = 1;
	//   69  140:iconst_1        
	//   70  141:istore_2        
		break; /* Loop/switch isn't completed */
	//   71  142:goto            181
_L6:
		if(j1 == i1 - 1)
	//*  72  145:iload           8
	//*  73  147:iload           6
	//*  74  149:iconst_1        
	//*  75  150:isub            
	//*  76  151:icmpne          167
		{
			j = i1 - 1;
	//   77  154:iload           6
	//   78  156:iconst_1        
	//   79  157:isub            
	//   80  158:istore_3        
			i = l + 1;
	//   81  159:iload           5
	//   82  161:iconst_1        
	//   83  162:iadd            
	//   84  163:istore_2        
			break; /* Loop/switch isn't completed */
	//   85  164:goto            181
		}
		zzof.onDataRangeRemoved(i1, l);
	//   86  167:aload_0         
	//   87  168:getfield        #41  <Field DataBufferObserverSet zzof>
	//   88  171:iload           6
	//   89  173:iload           5
	//   90  175:invokevirtual   #137 <Method void DataBufferObserverSet.onDataRangeRemoved(int, int)>
		if(true) goto _L5; else goto _L4
	//   91  178:goto            137
_L4:
		k--;
	//   92  181:iload           4
	//   93  183:iconst_1        
	//   94  184:isub            
	//   95  185:istore          4
		l = i;
	//   96  187:iload_2         
	//   97  188:istore          5
		i1 = j;
	//   98  190:iload_3         
	//   99  191:istore          6
		  goto _L7
	//* 100  193:goto            62
_L2:
		if(l > 0)
	//* 101  196:iload           5
	//* 102  198:ifle            212
			zzof.onDataRangeRemoved(i1, l);
	//  103  201:aload_0         
	//  104  202:getfield        #41  <Field DataBufferObserverSet zzof>
	//  105  205:iload           6
	//  106  207:iload           5
	//  107  209:invokevirtual   #137 <Method void DataBufferObserverSet.onDataRangeRemoved(int, int)>
		return;
	//  108  212:return          
		zzoe.addAll(((java.util.Collection) (s)));
	//  109  213:aload_0         
	//  110  214:getfield        #32  <Field HashSet zzoe>
	//  111  217:aload_1         
	//  112  218:invokevirtual   #186 <Method boolean HashSet.addAll(java.util.Collection)>
	//  113  221:pop             
		return;
	//  114  222:return          
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
			break MISSING_BLOCK_LABEL_210;
	//   19   38:aload_0         
	//   20   39:getfield        #41  <Field DataBufferObserverSet zzof>
	//   21   42:invokevirtual   #111 <Method boolean DataBufferObserverSet.hasObservers()>
	//   22   45:ifeq            210
		j = ((ArrayList) (s)).size() - 1;
	//   23   48:aload_1         
	//   24   49:invokevirtual   #177 <Method int ArrayList.size()>
	//   25   52:iconst_1        
	//   26   53:isub            
	//   27   54:istore_3        
		l = 0;
	//   28   55:iconst_0        
	//   29   56:istore          5
		k = 0;
	//   30   58:iconst_0        
	//   31   59:istore          4
_L7:
		if(j < 0) goto _L2; else goto _L1
	//   32   61:iload_3         
	//   33   62:iflt            193
_L1:
		int i;
		int i1;
		boolean flag;
		int j1;
		j1 = ((Integer)arraylist.get(j)).intValue();
	//   34   65:aload           9
	//   35   67:iload_3         
	//   36   68:invokevirtual   #181 <Method Object ArrayList.get(int)>
	//   37   71:checkcast       #79  <Class Integer>
	//   38   74:invokevirtual   #130 <Method int Integer.intValue()>
	//   39   77:istore          8
		if(j1 < 0)
	//*  40   79:iload           8
	//*  41   81:ifge            90
			flag = true;
	//   42   84:iconst_1        
	//   43   85:istore          7
		else
	//*  44   87:goto            93
			flag = false;
	//   45   90:iconst_0        
	//   46   91:istore          7
		i = l;
	//   47   93:iload           5
	//   48   95:istore_2        
		i1 = k;
	//   49   96:iload           4
	//   50   98:istore          6
		if(!flag) goto _L4; else goto _L3
	//   51  100:iload           7
	//   52  102:ifeq            179
_L3:
		i = ((Integer)((ArrayList) (s)).get(j)).intValue();
	//   53  105:aload_1         
	//   54  106:iload_3         
	//   55  107:invokevirtual   #181 <Method Object ArrayList.get(int)>
	//   56  110:checkcast       #79  <Class Integer>
	//   57  113:invokevirtual   #130 <Method int Integer.intValue()>
	//   58  116:istore_2        
		zzoe.remove(((Object) (Integer.valueOf(i))));
	//   59  117:aload_0         
	//   60  118:getfield        #32  <Field HashSet zzoe>
	//   61  121:iload_2         
	//   62  122:invokestatic    #83  <Method Integer Integer.valueOf(int)>
	//   63  125:invokevirtual   #133 <Method boolean HashSet.remove(Object)>
	//   64  128:pop             
		i1 = -j1 - 1;
	//   65  129:iload           8
	//   66  131:ineg            
	//   67  132:iconst_1        
	//   68  133:isub            
	//   69  134:istore          6
		if(l != 0) goto _L6; else goto _L5
	//   70  136:iload           5
	//   71  138:ifne            146
_L5:
		i = 1;
	//   72  141:iconst_1        
	//   73  142:istore_2        
		break; /* Loop/switch isn't completed */
	//   74  143:goto            179
_L6:
		if(i1 == k)
	//*  75  146:iload           6
	//*  76  148:iload           4
	//*  77  150:icmpne          165
		{
			i = l + 1;
	//   78  153:iload           5
	//   79  155:iconst_1        
	//   80  156:iadd            
	//   81  157:istore_2        
			i1 = k;
	//   82  158:iload           4
	//   83  160:istore          6
			break; /* Loop/switch isn't completed */
	//   84  162:goto            179
		}
		zzof.onDataRangeInserted(k, l);
	//   85  165:aload_0         
	//   86  166:getfield        #41  <Field DataBufferObserverSet zzof>
	//   87  169:iload           4
	//   88  171:iload           5
	//   89  173:invokevirtual   #197 <Method void DataBufferObserverSet.onDataRangeInserted(int, int)>
		if(true) goto _L5; else goto _L4
	//   90  176:goto            141
_L4:
		j--;
	//   91  179:iload_3         
	//   92  180:iconst_1        
	//   93  181:isub            
	//   94  182:istore_3        
		l = i;
	//   95  183:iload_2         
	//   96  184:istore          5
		k = i1;
	//   97  186:iload           6
	//   98  188:istore          4
		  goto _L7
	//*  99  190:goto            61
_L2:
		if(l > 0)
	//* 100  193:iload           5
	//* 101  195:ifle            209
			zzof.onDataRangeInserted(k, l);
	//  102  198:aload_0         
	//  103  199:getfield        #41  <Field DataBufferObserverSet zzof>
	//  104  202:iload           4
	//  105  204:iload           5
	//  106  206:invokevirtual   #197 <Method void DataBufferObserverSet.onDataRangeInserted(int, int)>
		return;
	//  107  209:return          
		zzoe.removeAll(((java.util.Collection) (s)));
	//  108  210:aload_0         
	//  109  211:getfield        #32  <Field HashSet zzoe>
	//  110  214:aload_1         
	//  111  215:invokevirtual   #200 <Method boolean HashSet.removeAll(java.util.Collection)>
	//  112  218:pop             
		return;
	//  113  219:return          
	}

	private AbstractDataBuffer zzoc;
	private final String zzod;
	private final HashSet zzoe = new HashSet();
	private DataBufferObserverSet zzof;
}
