// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.internal.Asserts;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.data:
//			AbstractDataBuffer, ObjectExclusionFilterable, DataBufferObserverSet, DataBufferObserver

public final class ObjectDataBuffer extends AbstractDataBuffer
	implements DataBufferObserver.Observable, ObjectExclusionFilterable
{

	public ObjectDataBuffer()
	{
		super(((DataHolder) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #24  <Method void AbstractDataBuffer(DataHolder)>
		zzoe = new HashSet();
	//    3    5:aload_0         
	//    4    6:new             #26  <Class HashSet>
	//    5    9:dup             
	//    6   10:invokespecial   #28  <Method void HashSet()>
	//    7   13:putfield        #30  <Field HashSet zzoe>
		zzob = new ArrayList();
	//    8   16:aload_0         
	//    9   17:new             #32  <Class ArrayList>
	//   10   20:dup             
	//   11   21:invokespecial   #33  <Method void ArrayList()>
	//   12   24:putfield        #35  <Field ArrayList zzob>
		zzog = new ArrayList();
	//   13   27:aload_0         
	//   14   28:new             #32  <Class ArrayList>
	//   15   31:dup             
	//   16   32:invokespecial   #33  <Method void ArrayList()>
	//   17   35:putfield        #37  <Field ArrayList zzog>
		zzof = new DataBufferObserverSet();
	//   18   38:aload_0         
	//   19   39:new             #39  <Class DataBufferObserverSet>
	//   20   42:dup             
	//   21   43:invokespecial   #40  <Method void DataBufferObserverSet()>
	//   22   46:putfield        #42  <Field DataBufferObserverSet zzof>
		zzcl();
	//   23   49:aload_0         
	//   24   50:invokespecial   #45  <Method void zzcl()>
	//   25   53:return          
	}

	public ObjectDataBuffer(ArrayList arraylist)
	{
		super(((DataHolder) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #24  <Method void AbstractDataBuffer(DataHolder)>
		zzoe = new HashSet();
	//    3    5:aload_0         
	//    4    6:new             #26  <Class HashSet>
	//    5    9:dup             
	//    6   10:invokespecial   #28  <Method void HashSet()>
	//    7   13:putfield        #30  <Field HashSet zzoe>
		zzob = new ArrayList();
	//    8   16:aload_0         
	//    9   17:new             #32  <Class ArrayList>
	//   10   20:dup             
	//   11   21:invokespecial   #33  <Method void ArrayList()>
	//   12   24:putfield        #35  <Field ArrayList zzob>
		zzog = arraylist;
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:putfield        #37  <Field ArrayList zzog>
		zzof = new DataBufferObserverSet();
	//   16   32:aload_0         
	//   17   33:new             #39  <Class DataBufferObserverSet>
	//   18   36:dup             
	//   19   37:invokespecial   #40  <Method void DataBufferObserverSet()>
	//   20   40:putfield        #42  <Field DataBufferObserverSet zzof>
		zzcl();
	//   21   43:aload_0         
	//   22   44:invokespecial   #45  <Method void zzcl()>
	//   23   47:return          
	}

	public transient ObjectDataBuffer(Object aobj[])
	{
		super(((DataHolder) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #24  <Method void AbstractDataBuffer(DataHolder)>
		zzoe = new HashSet();
	//    3    5:aload_0         
	//    4    6:new             #26  <Class HashSet>
	//    5    9:dup             
	//    6   10:invokespecial   #28  <Method void HashSet()>
	//    7   13:putfield        #30  <Field HashSet zzoe>
		zzob = new ArrayList();
	//    8   16:aload_0         
	//    9   17:new             #32  <Class ArrayList>
	//   10   20:dup             
	//   11   21:invokespecial   #33  <Method void ArrayList()>
	//   12   24:putfield        #35  <Field ArrayList zzob>
		zzog = new ArrayList(((java.util.Collection) (Arrays.asList(aobj))));
	//   13   27:aload_0         
	//   14   28:new             #32  <Class ArrayList>
	//   15   31:dup             
	//   16   32:aload_1         
	//   17   33:invokestatic    #56  <Method java.util.List Arrays.asList(Object[])>
	//   18   36:invokespecial   #59  <Method void ArrayList(java.util.Collection)>
	//   19   39:putfield        #37  <Field ArrayList zzog>
		zzof = new DataBufferObserverSet();
	//   20   42:aload_0         
	//   21   43:new             #39  <Class DataBufferObserverSet>
	//   22   46:dup             
	//   23   47:invokespecial   #40  <Method void DataBufferObserverSet()>
	//   24   50:putfield        #42  <Field DataBufferObserverSet zzof>
		zzcl();
	//   25   53:aload_0         
	//   26   54:invokespecial   #45  <Method void zzcl()>
	//   27   57:return          
	}

	private final void zzcl()
	{
		zzob.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ArrayList zzob>
	//    2    4:invokevirtual   #63  <Method void ArrayList.clear()>
		int j = zzog.size();
	//    3    7:aload_0         
	//    4    8:getfield        #37  <Field ArrayList zzog>
	//    5   11:invokevirtual   #67  <Method int ArrayList.size()>
	//    6   14:istore_2        
		for(int i = 0; i < j; i++)
	//*   7   15:iconst_0        
	//*   8   16:istore_1        
	//*   9   17:iload_1         
	//*  10   18:iload_2         
	//*  11   19:icmpge          55
			if(!zzoe.contains(((Object) (Integer.valueOf(i)))))
	//*  12   22:aload_0         
	//*  13   23:getfield        #30  <Field HashSet zzoe>
	//*  14   26:iload_1         
	//*  15   27:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//*  16   30:invokevirtual   #77  <Method boolean HashSet.contains(Object)>
	//*  17   33:ifne            48
				zzob.add(((Object) (Integer.valueOf(i))));
	//   18   36:aload_0         
	//   19   37:getfield        #35  <Field ArrayList zzob>
	//   20   40:iload_1         
	//   21   41:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//   22   44:invokevirtual   #80  <Method boolean ArrayList.add(Object)>
	//   23   47:pop             

	//   24   48:iload_1         
	//   25   49:iconst_1        
	//   26   50:iadd            
	//   27   51:istore_1        
	//*  28   52:goto            17
	//   29   55:return          
	}

	public final void add(Object obj)
	{
		int i = zzog.size();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ArrayList zzog>
	//    2    4:invokevirtual   #67  <Method int ArrayList.size()>
	//    3    7:istore_2        
		zzog.add(obj);
	//    4    8:aload_0         
	//    5    9:getfield        #37  <Field ArrayList zzog>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #80  <Method boolean ArrayList.add(Object)>
	//    8   16:pop             
		zzcl();
	//    9   17:aload_0         
	//   10   18:invokespecial   #45  <Method void zzcl()>
		if(zzof.hasObservers())
	//*  11   21:aload_0         
	//*  12   22:getfield        #42  <Field DataBufferObserverSet zzof>
	//*  13   25:invokevirtual   #85  <Method boolean DataBufferObserverSet.hasObservers()>
	//*  14   28:ifeq            121
		{
			Asserts.checkState(zzoe.contains(((Object) (Integer.valueOf(i)))) ^ true);
	//   15   31:aload_0         
	//   16   32:getfield        #30  <Field HashSet zzoe>
	//   17   35:iload_2         
	//   18   36:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//   19   39:invokevirtual   #77  <Method boolean HashSet.contains(Object)>
	//   20   42:iconst_1        
	//   21   43:ixor            
	//   22   44:invokestatic    #91  <Method void Asserts.checkState(boolean)>
			int j = zzob.size();
	//   23   47:aload_0         
	//   24   48:getfield        #35  <Field ArrayList zzob>
	//   25   51:invokevirtual   #67  <Method int ArrayList.size()>
	//   26   54:istore_3        
			boolean flag1 = false;
	//   27   55:iconst_0        
	//   28   56:istore          5
			boolean flag;
			if(j > 0)
	//*  29   58:iload_3         
	//*  30   59:ifle            68
				flag = true;
	//   31   62:iconst_1        
	//   32   63:istore          4
			else
	//*  33   65:goto            71
				flag = false;
	//   34   68:iconst_0        
	//   35   69:istore          4
			Asserts.checkState(flag);
	//   36   71:iload           4
	//   37   73:invokestatic    #91  <Method void Asserts.checkState(boolean)>
			obj = ((Object) (zzob));
	//   38   76:aload_0         
	//   39   77:getfield        #35  <Field ArrayList zzob>
	//   40   80:astore_1        
			j--;
	//   41   81:iload_3         
	//   42   82:iconst_1        
	//   43   83:isub            
	//   44   84:istore_3        
			flag = flag1;
	//   45   85:iload           5
	//   46   87:istore          4
			if(((Integer)((ArrayList) (obj)).get(j)).intValue() == i)
	//*  47   89:aload_1         
	//*  48   90:iload_3         
	//*  49   91:invokevirtual   #95  <Method Object ArrayList.get(int)>
	//*  50   94:checkcast       #69  <Class Integer>
	//*  51   97:invokevirtual   #98  <Method int Integer.intValue()>
	//*  52  100:iload_2         
	//*  53  101:icmpne          107
				flag = true;
	//   54  104:iconst_1        
	//   55  105:istore          4
			Asserts.checkState(flag);
	//   56  107:iload           4
	//   57  109:invokestatic    #91  <Method void Asserts.checkState(boolean)>
			zzof.onDataRangeInserted(j, 1);
	//   58  112:aload_0         
	//   59  113:getfield        #42  <Field DataBufferObserverSet zzof>
	//   60  116:iload_3         
	//   61  117:iconst_1        
	//   62  118:invokevirtual   #102 <Method void DataBufferObserverSet.onDataRangeInserted(int, int)>
		}
	//   63  121:return          
	}

	public final void addObserver(DataBufferObserver databufferobserver)
	{
		zzof.addObserver(databufferobserver);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field DataBufferObserverSet zzof>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #107 <Method void DataBufferObserverSet.addObserver(DataBufferObserver)>
	//    4    8:return          
	}

	public final void filterOut(Object obj)
	{
		int j2 = zzog.size();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ArrayList zzog>
	//    2    4:invokevirtual   #67  <Method int ArrayList.size()>
	//    3    7:istore          11
		int j1 = 0;
	//    4    9:iconst_0        
	//    5   10:istore          7
		int i2 = j1;
	//    6   12:iload           7
	//    7   14:istore          10
		int l1 = -1;
	//    8   16:iconst_m1       
	//    9   17:istore          9
		byte byte0 = ((byte) (l1));
	//   10   19:iload           9
	//   11   21:istore_2        
		int k = ((int) (byte0));
	//   12   22:iload_2         
	//   13   23:istore          4
		int k1 = ((int) (byte0));
	//   14   25:iload_2         
	//   15   26:istore          8
		while(j1 < j2) 
	//*  16   28:iload           7
	//*  17   30:iload           11
	//*  18   32:icmpge          222
		{
			int i;
			int j;
			int l;
			int i1;
label0:
			{
				i = i2;
	//   19   35:iload           10
	//   20   37:istore_2        
				l = l1;
	//   21   38:iload           9
	//   22   40:istore          5
				i1 = k1;
	//   23   42:iload           8
	//   24   44:istore          6
				j = k;
	//   25   46:iload           4
	//   26   48:istore_3        
				if(zzoe.contains(((Object) (Integer.valueOf(j1)))))
					break label0;
	//   27   49:aload_0         
	//   28   50:getfield        #30  <Field HashSet zzoe>
	//   29   53:iload           7
	//   30   55:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//   31   58:invokevirtual   #77  <Method boolean HashSet.contains(Object)>
	//   32   61:ifne            199
				l1++;
	//   33   64:iload           9
	//   34   66:iconst_1        
	//   35   67:iadd            
	//   36   68:istore          9
				if(obj.equals(zzog.get(j1)))
	//*  37   70:aload_1         
	//*  38   71:aload_0         
	//*  39   72:getfield        #37  <Field ArrayList zzog>
	//*  40   75:iload           7
	//*  41   77:invokevirtual   #95  <Method Object ArrayList.get(int)>
	//*  42   80:invokevirtual   #113 <Method boolean Object.equals(Object)>
	//*  43   83:ifeq            150
				{
					zzoe.add(((Object) (Integer.valueOf(j1))));
	//   44   86:aload_0         
	//   45   87:getfield        #30  <Field HashSet zzoe>
	//   46   90:iload           7
	//   47   92:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//   48   95:invokevirtual   #114 <Method boolean HashSet.add(Object)>
	//   49   98:pop             
					j = k;
	//   50   99:iload           4
	//   51  101:istore_3        
					if(zzof.hasObservers())
	//*  52  102:aload_0         
	//*  53  103:getfield        #42  <Field DataBufferObserverSet zzof>
	//*  54  106:invokevirtual   #85  <Method boolean DataBufferObserverSet.hasObservers()>
	//*  55  109:ifeq            137
					{
						if(k1 < 0)
	//*  56  112:iload           8
	//*  57  114:ifge            132
						{
							i1 = l1;
	//   58  117:iload           9
	//   59  119:istore          6
							i = 1;
	//   60  121:iconst_1        
	//   61  122:istore_2        
							j = i;
	//   62  123:iload_2         
	//   63  124:istore_3        
							l = l1;
	//   64  125:iload           9
	//   65  127:istore          5
							break label0;
	//   66  129:goto            199
						}
						j = k + 1;
	//   67  132:iload           4
	//   68  134:iconst_1        
	//   69  135:iadd            
	//   70  136:istore_3        
					}
					i = 1;
	//   71  137:iconst_1        
	//   72  138:istore_2        
					l = l1;
	//   73  139:iload           9
	//   74  141:istore          5
					i1 = k1;
	//   75  143:iload           8
	//   76  145:istore          6
				} else
	//*  77  147:goto            199
				{
					i = i2;
	//   78  150:iload           10
	//   79  152:istore_2        
					l = l1;
	//   80  153:iload           9
	//   81  155:istore          5
					i1 = k1;
	//   82  157:iload           8
	//   83  159:istore          6
					j = k;
	//   84  161:iload           4
	//   85  163:istore_3        
					if(k1 >= 0)
	//*  86  164:iload           8
	//*  87  166:iflt            199
					{
						zzcl();
	//   88  169:aload_0         
	//   89  170:invokespecial   #45  <Method void zzcl()>
						zzof.onDataRangeRemoved(k1, k);
	//   90  173:aload_0         
	//   91  174:getfield        #42  <Field DataBufferObserverSet zzof>
	//   92  177:iload           8
	//   93  179:iload           4
	//   94  181:invokevirtual   #117 <Method void DataBufferObserverSet.onDataRangeRemoved(int, int)>
						l = l1 - k;
	//   95  184:iload           9
	//   96  186:iload           4
	//   97  188:isub            
	//   98  189:istore          5
						i = 0;
	//   99  191:iconst_0        
	//  100  192:istore_2        
						i1 = -1;
	//  101  193:iconst_m1       
	//  102  194:istore          6
						j = i1;
	//  103  196:iload           6
	//  104  198:istore_3        
					}
				}
			}
			j1++;
	//  105  199:iload           7
	//  106  201:iconst_1        
	//  107  202:iadd            
	//  108  203:istore          7
			i2 = i;
	//  109  205:iload_2         
	//  110  206:istore          10
			l1 = l;
	//  111  208:iload           5
	//  112  210:istore          9
			k1 = i1;
	//  113  212:iload           6
	//  114  214:istore          8
			k = j;
	//  115  216:iload_3         
	//  116  217:istore          4
		}
	//* 117  219:goto            28
		if(i2 != 0)
	//* 118  222:iload           10
	//* 119  224:ifeq            231
			zzcl();
	//  120  227:aload_0         
	//  121  228:invokespecial   #45  <Method void zzcl()>
		if(k1 >= 0)
	//* 122  231:iload           8
	//* 123  233:iflt            247
			zzof.onDataRangeRemoved(k1, k);
	//  124  236:aload_0         
	//  125  237:getfield        #42  <Field DataBufferObserverSet zzof>
	//  126  240:iload           8
	//  127  242:iload           4
	//  128  244:invokevirtual   #117 <Method void DataBufferObserverSet.onDataRangeRemoved(int, int)>
	//  129  247:return          
	}

	public final void filterOutRaw(int i)
	{
		int j;
label0:
		{
			boolean flag = zzoe.add(((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field HashSet zzoe>
	//    2    4:iload_1         
	//    3    5:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//    4    8:invokevirtual   #114 <Method boolean HashSet.add(Object)>
	//    5   11:istore          4
			if(zzof.hasObservers() && flag)
	//*   6   13:aload_0         
	//*   7   14:getfield        #42  <Field DataBufferObserverSet zzof>
	//*   8   17:invokevirtual   #85  <Method boolean DataBufferObserverSet.hasObservers()>
	//*   9   20:ifeq            71
	//*  10   23:iload           4
	//*  11   25:ifeq            71
			{
				j = 0;
	//   12   28:iconst_0        
	//   13   29:istore_2        
				for(int k = zzob.size(); j < k; j++)
	//*  14   30:aload_0         
	//*  15   31:getfield        #35  <Field ArrayList zzob>
	//*  16   34:invokevirtual   #67  <Method int ArrayList.size()>
	//*  17   37:istore_3        
	//*  18   38:iload_2         
	//*  19   39:iload_3         
	//*  20   40:icmpge          71
					if(((Integer)zzob.get(j)).intValue() == i)
	//*  21   43:aload_0         
	//*  22   44:getfield        #35  <Field ArrayList zzob>
	//*  23   47:iload_2         
	//*  24   48:invokevirtual   #95  <Method Object ArrayList.get(int)>
	//*  25   51:checkcast       #69  <Class Integer>
	//*  26   54:invokevirtual   #98  <Method int Integer.intValue()>
	//*  27   57:iload_1         
	//*  28   58:icmpne          64
						break label0;
	//   29   61:goto            73

	//   30   64:iload_2         
	//   31   65:iconst_1        
	//   32   66:iadd            
	//   33   67:istore_2        
			}
	//*  34   68:goto            38
			j = -1;
	//   35   71:iconst_m1       
	//   36   72:istore_2        
		}
		zzcl();
	//   37   73:aload_0         
	//   38   74:invokespecial   #45  <Method void zzcl()>
		if(j >= 0)
	//*  39   77:iload_2         
	//*  40   78:iflt            90
			zzof.onDataRangeRemoved(j, 1);
	//   41   81:aload_0         
	//   42   82:getfield        #42  <Field DataBufferObserverSet zzof>
	//   43   85:iload_2         
	//   44   86:iconst_1        
	//   45   87:invokevirtual   #117 <Method void DataBufferObserverSet.onDataRangeRemoved(int, int)>
	//   46   90:return          
	}

	public final Object get(int i)
	{
		return zzog.get(getRawPosition(i));
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ArrayList zzog>
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #123 <Method int getRawPosition(int)>
	//    5    9:invokevirtual   #95  <Method Object ArrayList.get(int)>
	//    6   12:areturn         
	}

	public final int getCount()
	{
		return zzog.size() - zzoe.size();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ArrayList zzog>
	//    2    4:invokevirtual   #67  <Method int ArrayList.size()>
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field HashSet zzoe>
	//    5   11:invokevirtual   #126 <Method int HashSet.size()>
	//    6   14:isub            
	//    7   15:ireturn         
	}

	public final Bundle getMetadata()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final int getPositionFromRawPosition(int i)
	{
		int k = -1;
	//    0    0:iconst_m1       
	//    1    1:istore_3        
		for(int j = 0; j <= i;)
	//*   2    2:iconst_0        
	//*   3    3:istore_2        
	//*   4    4:iload_2         
	//*   5    5:iload_1         
	//*   6    6:icmpgt          41
		{
			int l = k;
	//    7    9:iload_3         
	//    8   10:istore          4
			if(!zzoe.contains(((Object) (Integer.valueOf(j)))))
	//*   9   12:aload_0         
	//*  10   13:getfield        #30  <Field HashSet zzoe>
	//*  11   16:iload_2         
	//*  12   17:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//*  13   20:invokevirtual   #77  <Method boolean HashSet.contains(Object)>
	//*  14   23:ifne            31
				l = k + 1;
	//   15   26:iload_3         
	//   16   27:iconst_1        
	//   17   28:iadd            
	//   18   29:istore          4
			j++;
	//   19   31:iload_2         
	//   20   32:iconst_1        
	//   21   33:iadd            
	//   22   34:istore_2        
			k = l;
	//   23   35:iload           4
	//   24   37:istore_3        
		}

	//*  25   38:goto            4
		return k;
	//   26   41:iload_3         
	//   27   42:ireturn         
	}

	public final Object getRaw(int i)
	{
		return zzog.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ArrayList zzog>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #95  <Method Object ArrayList.get(int)>
	//    4    8:areturn         
	}

	public final int getRawCount()
	{
		return zzog.size();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ArrayList zzog>
	//    2    4:invokevirtual   #67  <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public final int getRawPosition(int i)
	{
		if(i >= 0 && i < ((AbstractDataBuffer)this).getCount())
	//*   0    0:iload_1         
	//*   1    1:iflt            30
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #133 <Method int AbstractDataBuffer.getCount()>
	//*   5    9:icmplt          15
	//*   6   12:goto            30
		{
			return ((Integer)zzob.get(i)).intValue();
	//    7   15:aload_0         
	//    8   16:getfield        #35  <Field ArrayList zzob>
	//    9   19:iload_1         
	//   10   20:invokevirtual   #95  <Method Object ArrayList.get(int)>
	//   11   23:checkcast       #69  <Class Integer>
	//   12   26:invokevirtual   #98  <Method int Integer.intValue()>
	//   13   29:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(53);
	//   14   30:new             #135 <Class StringBuilder>
	//   15   33:dup             
	//   16   34:bipush          53
	//   17   36:invokespecial   #137 <Method void StringBuilder(int)>
	//   18   39:astore_2        
			stringbuilder.append("Position ");
	//   19   40:aload_2         
	//   20   41:ldc1            #139 <String "Position ">
	//   21   43:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   22   46:pop             
			stringbuilder.append(i);
	//   23   47:aload_2         
	//   24   48:iload_1         
	//   25   49:invokevirtual   #146 <Method StringBuilder StringBuilder.append(int)>
	//   26   52:pop             
			stringbuilder.append(" is out of bounds for this buffer");
	//   27   53:aload_2         
	//   28   54:ldc1            #148 <String " is out of bounds for this buffer">
	//   29   56:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   30   59:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   31   60:new             #150 <Class IllegalArgumentException>
	//   32   63:dup             
	//   33   64:aload_2         
	//   34   65:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   35   68:invokespecial   #157 <Method void IllegalArgumentException(String)>
	//   36   71:athrow          
		}
	}

	public final void insertRaw(int i, Object obj)
	{
		zzog.add(i, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ArrayList zzog>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #161 <Method void ArrayList.add(int, Object)>
		obj = ((Object) (new HashSet(zzoe.size())));
	//    5    9:new             #26  <Class HashSet>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field HashSet zzoe>
	//    9   17:invokevirtual   #126 <Method int HashSet.size()>
	//   10   20:invokespecial   #162 <Method void HashSet(int)>
	//   11   23:astore_2        
		Iterator iterator = zzoe.iterator();
	//   12   24:aload_0         
	//   13   25:getfield        #30  <Field HashSet zzoe>
	//   14   28:invokevirtual   #166 <Method Iterator HashSet.iterator()>
	//   15   31:astore          4
		int j = i;
	//   16   33:iload_1         
	//   17   34:istore_3        
		while(iterator.hasNext()) 
	//*  18   35:aload           4
	//*  19   37:invokeinterface #171 <Method boolean Iterator.hasNext()>
	//*  20   42:ifeq            98
		{
			Integer integer1 = (Integer)iterator.next();
	//   21   45:aload           4
	//   22   47:invokeinterface #175 <Method Object Iterator.next()>
	//   23   52:checkcast       #69  <Class Integer>
	//   24   55:astore          5
			if(integer1.intValue() < i)
	//*  25   57:aload           5
	//*  26   59:invokevirtual   #98  <Method int Integer.intValue()>
	//*  27   62:iload_1         
	//*  28   63:icmpge          73
			{
				j--;
	//   29   66:iload_3         
	//   30   67:iconst_1        
	//   31   68:isub            
	//   32   69:istore_3        
			} else
	//*  33   70:goto            35
			{
				((HashSet) (obj)).add(((Object) (Integer.valueOf(integer1.intValue() + 1))));
	//   34   73:aload_2         
	//   35   74:aload           5
	//   36   76:invokevirtual   #98  <Method int Integer.intValue()>
	//   37   79:iconst_1        
	//   38   80:iadd            
	//   39   81:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//   40   84:invokevirtual   #114 <Method boolean HashSet.add(Object)>
	//   41   87:pop             
				iterator.remove();
	//   42   88:aload           4
	//   43   90:invokeinterface #178 <Method void Iterator.remove()>
			}
		}
	//*  44   95:goto            35
		Integer integer;
		for(obj = ((Object) (((HashSet) (obj)).iterator())); ((Iterator) (obj)).hasNext(); zzoe.add(((Object) (integer))))
	//*  45   98:aload_2         
	//*  46   99:invokevirtual   #166 <Method Iterator HashSet.iterator()>
	//*  47  102:astore_2        
	//*  48  103:aload_2         
	//*  49  104:invokeinterface #171 <Method boolean Iterator.hasNext()>
	//*  50  109:ifeq            136
			integer = (Integer)((Iterator) (obj)).next();
	//   51  112:aload_2         
	//   52  113:invokeinterface #175 <Method Object Iterator.next()>
	//   53  118:checkcast       #69  <Class Integer>
	//   54  121:astore          4

	//   55  123:aload_0         
	//   56  124:getfield        #30  <Field HashSet zzoe>
	//   57  127:aload           4
	//   58  129:invokevirtual   #114 <Method boolean HashSet.add(Object)>
	//   59  132:pop             
	//*  60  133:goto            103
		zzcl();
	//   61  136:aload_0         
	//   62  137:invokespecial   #45  <Method void zzcl()>
		if(zzof.hasObservers())
	//*  63  140:aload_0         
	//*  64  141:getfield        #42  <Field DataBufferObserverSet zzof>
	//*  65  144:invokevirtual   #85  <Method boolean DataBufferObserverSet.hasObservers()>
	//*  66  147:ifeq            159
			zzof.onDataRangeInserted(j, 1);
	//   67  150:aload_0         
	//   68  151:getfield        #42  <Field DataBufferObserverSet zzof>
	//   69  154:iload_3         
	//   70  155:iconst_1        
	//   71  156:invokevirtual   #102 <Method void DataBufferObserverSet.onDataRangeInserted(int, int)>
	//   72  159:return          
	}

	public final boolean isRawPositionFiltered(int i)
	{
		return zzoe.contains(((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field HashSet zzoe>
	//    2    4:iload_1         
	//    3    5:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//    4    8:invokevirtual   #77  <Method boolean HashSet.contains(Object)>
	//    5   11:ireturn         
	}

	public final void notifyChanged(Object obj)
	{
		if(!zzof.hasObservers())
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field DataBufferObserverSet zzof>
	//*   2    4:invokevirtual   #85  <Method boolean DataBufferObserverSet.hasObservers()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		int i = 0;
	//    5   11:iconst_0        
	//    6   12:istore_2        
		for(int j = zzob.size(); i < j; i++)
	//*   7   13:aload_0         
	//*   8   14:getfield        #35  <Field ArrayList zzob>
	//*   9   17:invokevirtual   #67  <Method int ArrayList.size()>
	//*  10   20:istore_3        
	//*  11   21:iload_2         
	//*  12   22:iload_3         
	//*  13   23:icmpge          70
			if(obj.equals(zzog.get(((Integer)zzob.get(i)).intValue())))
	//*  14   26:aload_1         
	//*  15   27:aload_0         
	//*  16   28:getfield        #37  <Field ArrayList zzog>
	//*  17   31:aload_0         
	//*  18   32:getfield        #35  <Field ArrayList zzob>
	//*  19   35:iload_2         
	//*  20   36:invokevirtual   #95  <Method Object ArrayList.get(int)>
	//*  21   39:checkcast       #69  <Class Integer>
	//*  22   42:invokevirtual   #98  <Method int Integer.intValue()>
	//*  23   45:invokevirtual   #95  <Method Object ArrayList.get(int)>
	//*  24   48:invokevirtual   #113 <Method boolean Object.equals(Object)>
	//*  25   51:ifeq            63
				zzof.onDataRangeChanged(i, 1);
	//   26   54:aload_0         
	//   27   55:getfield        #42  <Field DataBufferObserverSet zzof>
	//   28   58:iload_2         
	//   29   59:iconst_1        
	//   30   60:invokevirtual   #185 <Method void DataBufferObserverSet.onDataRangeChanged(int, int)>

	//   31   63:iload_2         
	//   32   64:iconst_1        
	//   33   65:iadd            
	//   34   66:istore_2        
	//*  35   67:goto            21
	//   36   70:return          
	}

	public final void release()
	{
		zzof.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field DataBufferObserverSet zzof>
	//    2    4:invokevirtual   #187 <Method void DataBufferObserverSet.clear()>
	//    3    7:return          
	}

	public final void removeObserver(DataBufferObserver databufferobserver)
	{
		zzof.removeObserver(databufferobserver);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field DataBufferObserverSet zzof>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #190 <Method void DataBufferObserverSet.removeObserver(DataBufferObserver)>
	//    4    8:return          
	}

	public final void removeRaw(int i)
	{
		zzog.remove(i);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ArrayList zzog>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #193 <Method Object ArrayList.remove(int)>
	//    4    8:pop             
		boolean flag = zzoe.remove(((Object) (Integer.valueOf(i))));
	//    5    9:aload_0         
	//    6   10:getfield        #30  <Field HashSet zzoe>
	//    7   13:iload_1         
	//    8   14:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//    9   17:invokevirtual   #195 <Method boolean HashSet.remove(Object)>
	//   10   20:istore_3        
		Object obj = ((Object) (new HashSet(zzoe.size())));
	//   11   21:new             #26  <Class HashSet>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:getfield        #30  <Field HashSet zzoe>
	//   15   29:invokevirtual   #126 <Method int HashSet.size()>
	//   16   32:invokespecial   #162 <Method void HashSet(int)>
	//   17   35:astore          4
		Iterator iterator = zzoe.iterator();
	//   18   37:aload_0         
	//   19   38:getfield        #30  <Field HashSet zzoe>
	//   20   41:invokevirtual   #166 <Method Iterator HashSet.iterator()>
	//   21   44:astore          5
		int j = i;
	//   22   46:iload_1         
	//   23   47:istore_2        
		while(iterator.hasNext()) 
	//*  24   48:aload           5
	//*  25   50:invokeinterface #171 <Method boolean Iterator.hasNext()>
	//*  26   55:ifeq            112
		{
			Integer integer1 = (Integer)iterator.next();
	//   27   58:aload           5
	//   28   60:invokeinterface #175 <Method Object Iterator.next()>
	//   29   65:checkcast       #69  <Class Integer>
	//   30   68:astore          6
			if(integer1.intValue() < i)
	//*  31   70:aload           6
	//*  32   72:invokevirtual   #98  <Method int Integer.intValue()>
	//*  33   75:iload_1         
	//*  34   76:icmpge          86
			{
				j--;
	//   35   79:iload_2         
	//   36   80:iconst_1        
	//   37   81:isub            
	//   38   82:istore_2        
			} else
	//*  39   83:goto            48
			{
				iterator.remove();
	//   40   86:aload           5
	//   41   88:invokeinterface #178 <Method void Iterator.remove()>
				((HashSet) (obj)).add(((Object) (Integer.valueOf(integer1.intValue() - 1))));
	//   42   93:aload           4
	//   43   95:aload           6
	//   44   97:invokevirtual   #98  <Method int Integer.intValue()>
	//   45  100:iconst_1        
	//   46  101:isub            
	//   47  102:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//   48  105:invokevirtual   #114 <Method boolean HashSet.add(Object)>
	//   49  108:pop             
			}
		}
	//*  50  109:goto            48
		Integer integer;
		for(obj = ((Object) (((HashSet) (obj)).iterator())); ((Iterator) (obj)).hasNext(); zzoe.add(((Object) (integer))))
	//*  51  112:aload           4
	//*  52  114:invokevirtual   #166 <Method Iterator HashSet.iterator()>
	//*  53  117:astore          4
	//*  54  119:aload           4
	//*  55  121:invokeinterface #171 <Method boolean Iterator.hasNext()>
	//*  56  126:ifeq            154
			integer = (Integer)((Iterator) (obj)).next();
	//   57  129:aload           4
	//   58  131:invokeinterface #175 <Method Object Iterator.next()>
	//   59  136:checkcast       #69  <Class Integer>
	//   60  139:astore          5

	//   61  141:aload_0         
	//   62  142:getfield        #30  <Field HashSet zzoe>
	//   63  145:aload           5
	//   64  147:invokevirtual   #114 <Method boolean HashSet.add(Object)>
	//   65  150:pop             
	//*  66  151:goto            119
		zzcl();
	//   67  154:aload_0         
	//   68  155:invokespecial   #45  <Method void zzcl()>
		if(!flag && zzof.hasObservers())
	//*  69  158:iload_3         
	//*  70  159:ifne            181
	//*  71  162:aload_0         
	//*  72  163:getfield        #42  <Field DataBufferObserverSet zzof>
	//*  73  166:invokevirtual   #85  <Method boolean DataBufferObserverSet.hasObservers()>
	//*  74  169:ifeq            181
			zzof.onDataRangeRemoved(j, 1);
	//   75  172:aload_0         
	//   76  173:getfield        #42  <Field DataBufferObserverSet zzof>
	//   77  176:iload_2         
	//   78  177:iconst_1        
	//   79  178:invokevirtual   #117 <Method void DataBufferObserverSet.onDataRangeRemoved(int, int)>
	//   80  181:return          
	}

	public final boolean setRaw(int i, Object obj)
	{
		zzog.set(i, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ArrayList zzog>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #201 <Method Object ArrayList.set(int, Object)>
	//    5    9:pop             
		boolean flag = zzoe.contains(((Object) (Integer.valueOf(i)))) ^ true;
	//    6   10:aload_0         
	//    7   11:getfield        #30  <Field HashSet zzoe>
	//    8   14:iload_1         
	//    9   15:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//   10   18:invokevirtual   #77  <Method boolean HashSet.contains(Object)>
	//   11   21:iconst_1        
	//   12   22:ixor            
	//   13   23:istore          5
		if(flag && zzof.hasObservers())
	//*  14   25:iload           5
	//*  15   27:ifeq            94
	//*  16   30:aload_0         
	//*  17   31:getfield        #42  <Field DataBufferObserverSet zzof>
	//*  18   34:invokevirtual   #85  <Method boolean DataBufferObserverSet.hasObservers()>
	//*  19   37:ifeq            94
		{
			int j = 0;
	//   20   40:iconst_0        
	//   21   41:istore_3        
			for(int k = zzob.size(); j < k; j++)
	//*  22   42:aload_0         
	//*  23   43:getfield        #35  <Field ArrayList zzob>
	//*  24   46:invokevirtual   #67  <Method int ArrayList.size()>
	//*  25   49:istore          4
	//*  26   51:iload_3         
	//*  27   52:iload           4
	//*  28   54:icmpge          94
				if(((Integer)zzob.get(j)).intValue() == i)
	//*  29   57:aload_0         
	//*  30   58:getfield        #35  <Field ArrayList zzob>
	//*  31   61:iload_3         
	//*  32   62:invokevirtual   #95  <Method Object ArrayList.get(int)>
	//*  33   65:checkcast       #69  <Class Integer>
	//*  34   68:invokevirtual   #98  <Method int Integer.intValue()>
	//*  35   71:iload_1         
	//*  36   72:icmpne          87
				{
					zzof.onDataRangeChanged(j, 1);
	//   37   75:aload_0         
	//   38   76:getfield        #42  <Field DataBufferObserverSet zzof>
	//   39   79:iload_3         
	//   40   80:iconst_1        
	//   41   81:invokevirtual   #185 <Method void DataBufferObserverSet.onDataRangeChanged(int, int)>
					return flag;
	//   42   84:iload           5
	//   43   86:ireturn         
				}

	//   44   87:iload_3         
	//   45   88:iconst_1        
	//   46   89:iadd            
	//   47   90:istore_3        
		}
	//*  48   91:goto            51
		return flag;
	//   49   94:iload           5
	//   50   96:ireturn         
	}

	public final void unfilter(Object obj)
	{
		int i;
		int i1;
		int l1;
		int i2;
		int j2;
		int k2;
		k2 = zzog.size();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ArrayList zzog>
	//    2    4:invokevirtual   #67  <Method int ArrayList.size()>
	//    3    7:istore          11
		l1 = 0;
	//    4    9:iconst_0        
	//    5   10:istore          8
		int j = l1;
	//    6   12:iload           8
	//    7   14:istore_3        
		i = j;
	//    8   15:iload_3         
	//    9   16:istore_2        
		i2 = -1;
	//   10   17:iconst_m1       
	//   11   18:istore          9
		i1 = i2;
	//   12   20:iload           9
	//   13   22:istore          5
		j2 = j;
	//   14   24:iload_3         
	//   15   25:istore          10
_L7:
		if(l1 >= k2) goto _L2; else goto _L1
	//   16   27:iload           8
	//   17   29:iload           11
	//   18   31:icmpge          254
_L1:
		if(zzoe.contains(((Object) (Integer.valueOf(l1))))) goto _L4; else goto _L3
	//   19   34:aload_0         
	//   20   35:getfield        #30  <Field HashSet zzoe>
	//   21   38:iload           8
	//   22   40:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//   23   43:invokevirtual   #77  <Method boolean HashSet.contains(Object)>
	//   24   46:ifne            105
_L3:
		int k;
		int l;
		int j1;
		int k1;
		i++;
	//   25   49:iload_2         
	//   26   50:iconst_1        
	//   27   51:iadd            
	//   28   52:istore_2        
		k = j2;
	//   29   53:iload           10
	//   30   55:istore_3        
		j1 = i;
	//   31   56:iload_2         
	//   32   57:istore          6
		k1 = i2;
	//   33   59:iload           9
	//   34   61:istore          7
		l = i1;
	//   35   63:iload           5
	//   36   65:istore          4
		if(i2 < 0) goto _L6; else goto _L5
	//   37   67:iload           9
	//   38   69:iflt            231
_L5:
		zzcl();
	//   39   72:aload_0         
	//   40   73:invokespecial   #45  <Method void zzcl()>
		zzof.onDataRangeInserted(i2, i1);
	//   41   76:aload_0         
	//   42   77:getfield        #42  <Field DataBufferObserverSet zzof>
	//   43   80:iload           9
	//   44   82:iload           5
	//   45   84:invokevirtual   #102 <Method void DataBufferObserverSet.onDataRangeInserted(int, int)>
		j1 = i + i1;
	//   46   87:iload_2         
	//   47   88:iload           5
	//   48   90:iadd            
	//   49   91:istore          6
		k = 0;
	//   50   93:iconst_0        
	//   51   94:istore_3        
		k1 = -1;
	//   52   95:iconst_m1       
	//   53   96:istore          7
		l = k1;
	//   54   98:iload           7
	//   55  100:istore          4
		break; /* Loop/switch isn't completed */
	//   56  102:goto            231
_L4:
		if(obj.equals(zzog.get(l1)))
	//*  57  105:aload_1         
	//*  58  106:aload_0         
	//*  59  107:getfield        #37  <Field ArrayList zzog>
	//*  60  110:iload           8
	//*  61  112:invokevirtual   #95  <Method Object ArrayList.get(int)>
	//*  62  115:invokevirtual   #113 <Method boolean Object.equals(Object)>
	//*  63  118:ifeq            185
		{
			zzoe.remove(((Object) (Integer.valueOf(l1))));
	//   64  121:aload_0         
	//   65  122:getfield        #30  <Field HashSet zzoe>
	//   66  125:iload           8
	//   67  127:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//   68  130:invokevirtual   #195 <Method boolean HashSet.remove(Object)>
	//   69  133:pop             
			l = i1;
	//   70  134:iload           5
	//   71  136:istore          4
			if(zzof.hasObservers())
	//*  72  138:aload_0         
	//*  73  139:getfield        #42  <Field DataBufferObserverSet zzof>
	//*  74  142:invokevirtual   #85  <Method boolean DataBufferObserverSet.hasObservers()>
	//*  75  145:ifeq            173
			{
				if(i2 < 0)
	//*  76  148:iload           9
	//*  77  150:ifge            167
				{
					k1 = i;
	//   78  153:iload_2         
	//   79  154:istore          7
					k = 1;
	//   80  156:iconst_1        
	//   81  157:istore_3        
					l = k;
	//   82  158:iload_3         
	//   83  159:istore          4
					j1 = i;
	//   84  161:iload_2         
	//   85  162:istore          6
					break; /* Loop/switch isn't completed */
	//   86  164:goto            231
				}
				l = i1 + 1;
	//   87  167:iload           5
	//   88  169:iconst_1        
	//   89  170:iadd            
	//   90  171:istore          4
			}
			k = 1;
	//   91  173:iconst_1        
	//   92  174:istore_3        
			j1 = i;
	//   93  175:iload_2         
	//   94  176:istore          6
			k1 = i2;
	//   95  178:iload           9
	//   96  180:istore          7
			break; /* Loop/switch isn't completed */
	//   97  182:goto            231
		}
		k = j2;
	//   98  185:iload           10
	//   99  187:istore_3        
		j1 = i;
	//  100  188:iload_2         
	//  101  189:istore          6
		k1 = i2;
	//  102  191:iload           9
	//  103  193:istore          7
		l = i1;
	//  104  195:iload           5
	//  105  197:istore          4
		if(!zzof.hasObservers())
			break; /* Loop/switch isn't completed */
	//  106  199:aload_0         
	//  107  200:getfield        #42  <Field DataBufferObserverSet zzof>
	//  108  203:invokevirtual   #85  <Method boolean DataBufferObserverSet.hasObservers()>
	//  109  206:ifeq            231
		k = j2;
	//  110  209:iload           10
	//  111  211:istore_3        
		j1 = i;
	//  112  212:iload_2         
	//  113  213:istore          6
		k1 = i2;
	//  114  215:iload           9
	//  115  217:istore          7
		l = i1;
	//  116  219:iload           5
	//  117  221:istore          4
		if(i2 < 0) goto _L6; else goto _L5
	//  118  223:iload           9
	//  119  225:iflt            231
	//* 120  228:goto            72
_L6:
		l1++;
	//  121  231:iload           8
	//  122  233:iconst_1        
	//  123  234:iadd            
	//  124  235:istore          8
		j2 = k;
	//  125  237:iload_3         
	//  126  238:istore          10
		i = j1;
	//  127  240:iload           6
	//  128  242:istore_2        
		i2 = k1;
	//  129  243:iload           7
	//  130  245:istore          9
		i1 = l;
	//  131  247:iload           4
	//  132  249:istore          5
		  goto _L7
	//* 133  251:goto            27
_L2:
		if(j2 != 0)
	//* 134  254:iload           10
	//* 135  256:ifeq            263
			zzcl();
	//  136  259:aload_0         
	//  137  260:invokespecial   #45  <Method void zzcl()>
		if(i2 >= 0)
	//* 138  263:iload           9
	//* 139  265:iflt            279
			zzof.onDataRangeInserted(i2, i1);
	//  140  268:aload_0         
	//  141  269:getfield        #42  <Field DataBufferObserverSet zzof>
	//  142  272:iload           9
	//  143  274:iload           5
	//  144  276:invokevirtual   #102 <Method void DataBufferObserverSet.onDataRangeInserted(int, int)>
		return;
	//  145  279:return          
	}

	public final void unfilterRaw(int i)
	{
		boolean flag = zzoe.remove(((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field HashSet zzoe>
	//    2    4:iload_1         
	//    3    5:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//    4    8:invokevirtual   #195 <Method boolean HashSet.remove(Object)>
	//    5   11:istore          6
		zzcl();
	//    6   13:aload_0         
	//    7   14:invokespecial   #45  <Method void zzcl()>
		if(zzof.hasObservers())
	//*   8   17:aload_0         
	//*   9   18:getfield        #42  <Field DataBufferObserverSet zzof>
	//*  10   21:invokevirtual   #85  <Method boolean DataBufferObserverSet.hasObservers()>
	//*  11   24:ifeq            99
		{
			if(!flag)
	//*  12   27:iload           6
	//*  13   29:ifne            33
				return;
	//   14   32:return          
			byte byte0 = -1;
	//   15   33:iconst_m1       
	//   16   34:istore          4
			int j = 0;
	//   17   36:iconst_0        
	//   18   37:istore_2        
			int l = zzob.size();
	//   19   38:aload_0         
	//   20   39:getfield        #35  <Field ArrayList zzob>
	//   21   42:invokevirtual   #67  <Method int ArrayList.size()>
	//   22   45:istore          5
			int k;
			do
			{
				k = ((int) (byte0));
	//   23   47:iload           4
	//   24   49:istore_3        
				if(j >= l)
					break;
	//   25   50:iload_2         
	//   26   51:iload           5
	//   27   53:icmpge          86
				if(((Integer)zzob.get(j)).intValue() == i)
	//*  28   56:aload_0         
	//*  29   57:getfield        #35  <Field ArrayList zzob>
	//*  30   60:iload_2         
	//*  31   61:invokevirtual   #95  <Method Object ArrayList.get(int)>
	//*  32   64:checkcast       #69  <Class Integer>
	//*  33   67:invokevirtual   #98  <Method int Integer.intValue()>
	//*  34   70:iload_1         
	//*  35   71:icmpne          79
				{
					k = j;
	//   36   74:iload_2         
	//   37   75:istore_3        
					break;
	//   38   76:goto            86
				}
				j++;
	//   39   79:iload_2         
	//   40   80:iconst_1        
	//   41   81:iadd            
	//   42   82:istore_2        
			} while(true);
	//   43   83:goto            47
			if(k >= 0)
	//*  44   86:iload_3         
	//*  45   87:iflt            99
				zzof.onDataRangeInserted(k, 1);
	//   46   90:aload_0         
	//   47   91:getfield        #42  <Field DataBufferObserverSet zzof>
	//   48   94:iload_3         
	//   49   95:iconst_1        
	//   50   96:invokevirtual   #102 <Method void DataBufferObserverSet.onDataRangeInserted(int, int)>
		}
	//   51   99:return          
	}

	private final ArrayList zzob;
	private final HashSet zzoe;
	private DataBufferObserverSet zzof;
	private final ArrayList zzog;
}
