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
		int l1 = zzog.size();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ArrayList zzog>
	//    2    4:invokevirtual   #67  <Method int ArrayList.size()>
	//    3    7:istore          11
		int i1 = 0;
	//    4    9:iconst_0        
	//    5   10:istore          7
		boolean flag1 = false;
	//    6   12:iconst_0        
	//    7   13:istore          10
		int j1 = -1;
	//    8   15:iconst_m1       
	//    9   16:istore          8
		int k1 = -1;
	//   10   18:iconst_m1       
	//   11   19:istore          9
		int i;
		int j;
		for(j = -1; i1 < l1; j = i)
	//*  12   21:iconst_m1       
	//*  13   22:istore          4
	//*  14   24:iload           7
	//*  15   26:iload           11
	//*  16   28:icmpge          217
		{
			boolean flag;
			int k;
			int l;
label0:
			{
				flag = flag1;
	//   17   31:iload           10
	//   18   33:istore_2        
				l = j1;
	//   19   34:iload           8
	//   20   36:istore          6
				k = k1;
	//   21   38:iload           9
	//   22   40:istore          5
				i = j;
	//   23   42:iload           4
	//   24   44:istore_3        
				if(zzoe.contains(((Object) (Integer.valueOf(i1)))))
					break label0;
	//   25   45:aload_0         
	//   26   46:getfield        #30  <Field HashSet zzoe>
	//   27   49:iload           7
	//   28   51:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//   29   54:invokevirtual   #77  <Method boolean HashSet.contains(Object)>
	//   30   57:ifne            194
				k1++;
	//   31   60:iload           9
	//   32   62:iconst_1        
	//   33   63:iadd            
	//   34   64:istore          9
				if(obj.equals(zzog.get(i1)))
	//*  35   66:aload_1         
	//*  36   67:aload_0         
	//*  37   68:getfield        #37  <Field ArrayList zzog>
	//*  38   71:iload           7
	//*  39   73:invokevirtual   #95  <Method Object ArrayList.get(int)>
	//*  40   76:invokevirtual   #113 <Method boolean Object.equals(Object)>
	//*  41   79:ifeq            146
				{
					zzoe.add(((Object) (Integer.valueOf(i1))));
	//   42   82:aload_0         
	//   43   83:getfield        #30  <Field HashSet zzoe>
	//   44   86:iload           7
	//   45   88:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//   46   91:invokevirtual   #114 <Method boolean HashSet.add(Object)>
	//   47   94:pop             
					i = j;
	//   48   95:iload           4
	//   49   97:istore_3        
					if(zzof.hasObservers())
	//*  50   98:aload_0         
	//*  51   99:getfield        #42  <Field DataBufferObserverSet zzof>
	//*  52  102:invokevirtual   #85  <Method boolean DataBufferObserverSet.hasObservers()>
	//*  53  105:ifeq            133
					{
						if(j1 < 0)
	//*  54  108:iload           8
	//*  55  110:ifge            128
						{
							l = k1;
	//   56  113:iload           9
	//   57  115:istore          6
							flag = true;
	//   58  117:iconst_1        
	//   59  118:istore_2        
							i = 1;
	//   60  119:iconst_1        
	//   61  120:istore_3        
							k = k1;
	//   62  121:iload           9
	//   63  123:istore          5
							break label0;
	//   64  125:goto            194
						}
						i = j + 1;
	//   65  128:iload           4
	//   66  130:iconst_1        
	//   67  131:iadd            
	//   68  132:istore_3        
					}
					flag = true;
	//   69  133:iconst_1        
	//   70  134:istore_2        
					l = j1;
	//   71  135:iload           8
	//   72  137:istore          6
					k = k1;
	//   73  139:iload           9
	//   74  141:istore          5
				} else
	//*  75  143:goto            194
				{
					flag = flag1;
	//   76  146:iload           10
	//   77  148:istore_2        
					l = j1;
	//   78  149:iload           8
	//   79  151:istore          6
					k = k1;
	//   80  153:iload           9
	//   81  155:istore          5
					i = j;
	//   82  157:iload           4
	//   83  159:istore_3        
					if(j1 >= 0)
	//*  84  160:iload           8
	//*  85  162:iflt            194
					{
						zzcl();
	//   86  165:aload_0         
	//   87  166:invokespecial   #45  <Method void zzcl()>
						zzof.onDataRangeRemoved(j1, j);
	//   88  169:aload_0         
	//   89  170:getfield        #42  <Field DataBufferObserverSet zzof>
	//   90  173:iload           8
	//   91  175:iload           4
	//   92  177:invokevirtual   #117 <Method void DataBufferObserverSet.onDataRangeRemoved(int, int)>
						k = k1 - j;
	//   93  180:iload           9
	//   94  182:iload           4
	//   95  184:isub            
	//   96  185:istore          5
						flag = false;
	//   97  187:iconst_0        
	//   98  188:istore_2        
						l = -1;
	//   99  189:iconst_m1       
	//  100  190:istore          6
						i = -1;
	//  101  192:iconst_m1       
	//  102  193:istore_3        
					}
				}
			}
			i1++;
	//  103  194:iload           7
	//  104  196:iconst_1        
	//  105  197:iadd            
	//  106  198:istore          7
			flag1 = flag;
	//  107  200:iload_2         
	//  108  201:istore          10
			j1 = l;
	//  109  203:iload           6
	//  110  205:istore          8
			k1 = k;
	//  111  207:iload           5
	//  112  209:istore          9
		}

	//  113  211:iload_3         
	//  114  212:istore          4
	//* 115  214:goto            24
		if(flag1)
	//* 116  217:iload           10
	//* 117  219:ifeq            226
			zzcl();
	//  118  222:aload_0         
	//  119  223:invokespecial   #45  <Method void zzcl()>
		if(j1 >= 0)
	//* 120  226:iload           8
	//* 121  228:iflt            242
			zzof.onDataRangeRemoved(j1, j);
	//  122  231:aload_0         
	//  123  232:getfield        #42  <Field DataBufferObserverSet zzof>
	//  124  235:iload           8
	//  125  237:iload           4
	//  126  239:invokevirtual   #117 <Method void DataBufferObserverSet.onDataRangeRemoved(int, int)>
	//  127  242:return          
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
	//*   1    1:iflt            27
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #133 <Method int AbstractDataBuffer.getCount()>
	//*   5    9:icmpge          27
		{
			return ((Integer)zzob.get(i)).intValue();
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field ArrayList zzob>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #95  <Method Object ArrayList.get(int)>
	//   10   20:checkcast       #69  <Class Integer>
	//   11   23:invokevirtual   #98  <Method int Integer.intValue()>
	//   12   26:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(53);
	//   13   27:new             #135 <Class StringBuilder>
	//   14   30:dup             
	//   15   31:bipush          53
	//   16   33:invokespecial   #137 <Method void StringBuilder(int)>
	//   17   36:astore_2        
			stringbuilder.append("Position ");
	//   18   37:aload_2         
	//   19   38:ldc1            #139 <String "Position ">
	//   20   40:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   21   43:pop             
			stringbuilder.append(i);
	//   22   44:aload_2         
	//   23   45:iload_1         
	//   24   46:invokevirtual   #146 <Method StringBuilder StringBuilder.append(int)>
	//   25   49:pop             
			stringbuilder.append(" is out of bounds for this buffer");
	//   26   50:aload_2         
	//   27   51:ldc1            #148 <String " is out of bounds for this buffer">
	//   28   53:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   29   56:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   30   57:new             #150 <Class IllegalArgumentException>
	//   31   60:dup             
	//   32   61:aload_2         
	//   33   62:invokevirtual   #154 <Method String StringBuilder.toString()>
	//   34   65:invokespecial   #157 <Method void IllegalArgumentException(String)>
	//   35   68:athrow          
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
		int k;
		int j1;
		int k1;
		boolean flag1;
		int l1;
		l1 = zzog.size();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ArrayList zzog>
	//    2    4:invokevirtual   #67  <Method int ArrayList.size()>
	//    3    7:istore          11
		j1 = 0;
	//    4    9:iconst_0        
	//    5   10:istore          8
		flag1 = false;
	//    6   12:iconst_0        
	//    7   13:istore          10
		k1 = -1;
	//    8   15:iconst_m1       
	//    9   16:istore          9
		i = 0;
	//   10   18:iconst_0        
	//   11   19:istore_2        
		k = -1;
	//   12   20:iconst_m1       
	//   13   21:istore          5
_L7:
		if(j1 >= l1) goto _L2; else goto _L1
	//   14   23:iload           8
	//   15   25:iload           11
	//   16   27:icmpge          249
_L1:
		if(zzoe.contains(((Object) (Integer.valueOf(j1))))) goto _L4; else goto _L3
	//   17   30:aload_0         
	//   18   31:getfield        #30  <Field HashSet zzoe>
	//   19   34:iload           8
	//   20   36:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//   21   39:invokevirtual   #77  <Method boolean HashSet.contains(Object)>
	//   22   42:ifne            100
_L3:
		boolean flag;
		int j;
		int l;
		int i1;
		i++;
	//   23   45:iload_2         
	//   24   46:iconst_1        
	//   25   47:iadd            
	//   26   48:istore_2        
		flag = flag1;
	//   27   49:iload           10
	//   28   51:istore_3        
		l = k1;
	//   29   52:iload           9
	//   30   54:istore          6
		i1 = i;
	//   31   56:iload_2         
	//   32   57:istore          7
		j = k;
	//   33   59:iload           5
	//   34   61:istore          4
		if(k1 < 0) goto _L6; else goto _L5
	//   35   63:iload           9
	//   36   65:iflt            226
_L5:
		zzcl();
	//   37   68:aload_0         
	//   38   69:invokespecial   #45  <Method void zzcl()>
		zzof.onDataRangeInserted(k1, k);
	//   39   72:aload_0         
	//   40   73:getfield        #42  <Field DataBufferObserverSet zzof>
	//   41   76:iload           9
	//   42   78:iload           5
	//   43   80:invokevirtual   #102 <Method void DataBufferObserverSet.onDataRangeInserted(int, int)>
		i1 = i + k;
	//   44   83:iload_2         
	//   45   84:iload           5
	//   46   86:iadd            
	//   47   87:istore          7
		flag = false;
	//   48   89:iconst_0        
	//   49   90:istore_3        
		l = -1;
	//   50   91:iconst_m1       
	//   51   92:istore          6
		j = -1;
	//   52   94:iconst_m1       
	//   53   95:istore          4
		break; /* Loop/switch isn't completed */
	//   54   97:goto            226
_L4:
		if(obj.equals(zzog.get(j1)))
	//*  55  100:aload_1         
	//*  56  101:aload_0         
	//*  57  102:getfield        #37  <Field ArrayList zzog>
	//*  58  105:iload           8
	//*  59  107:invokevirtual   #95  <Method Object ArrayList.get(int)>
	//*  60  110:invokevirtual   #113 <Method boolean Object.equals(Object)>
	//*  61  113:ifeq            180
		{
			zzoe.remove(((Object) (Integer.valueOf(j1))));
	//   62  116:aload_0         
	//   63  117:getfield        #30  <Field HashSet zzoe>
	//   64  120:iload           8
	//   65  122:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//   66  125:invokevirtual   #195 <Method boolean HashSet.remove(Object)>
	//   67  128:pop             
			j = k;
	//   68  129:iload           5
	//   69  131:istore          4
			if(zzof.hasObservers())
	//*  70  133:aload_0         
	//*  71  134:getfield        #42  <Field DataBufferObserverSet zzof>
	//*  72  137:invokevirtual   #85  <Method boolean DataBufferObserverSet.hasObservers()>
	//*  73  140:ifeq            168
			{
				if(k1 < 0)
	//*  74  143:iload           9
	//*  75  145:ifge            162
				{
					l = i;
	//   76  148:iload_2         
	//   77  149:istore          6
					flag = true;
	//   78  151:iconst_1        
	//   79  152:istore_3        
					j = 1;
	//   80  153:iconst_1        
	//   81  154:istore          4
					i1 = i;
	//   82  156:iload_2         
	//   83  157:istore          7
					break; /* Loop/switch isn't completed */
	//   84  159:goto            226
				}
				j = k + 1;
	//   85  162:iload           5
	//   86  164:iconst_1        
	//   87  165:iadd            
	//   88  166:istore          4
			}
			flag = true;
	//   89  168:iconst_1        
	//   90  169:istore_3        
			l = k1;
	//   91  170:iload           9
	//   92  172:istore          6
			i1 = i;
	//   93  174:iload_2         
	//   94  175:istore          7
			break; /* Loop/switch isn't completed */
	//   95  177:goto            226
		}
		flag = flag1;
	//   96  180:iload           10
	//   97  182:istore_3        
		l = k1;
	//   98  183:iload           9
	//   99  185:istore          6
		i1 = i;
	//  100  187:iload_2         
	//  101  188:istore          7
		j = k;
	//  102  190:iload           5
	//  103  192:istore          4
		if(!zzof.hasObservers())
			break; /* Loop/switch isn't completed */
	//  104  194:aload_0         
	//  105  195:getfield        #42  <Field DataBufferObserverSet zzof>
	//  106  198:invokevirtual   #85  <Method boolean DataBufferObserverSet.hasObservers()>
	//  107  201:ifeq            226
		flag = flag1;
	//  108  204:iload           10
	//  109  206:istore_3        
		l = k1;
	//  110  207:iload           9
	//  111  209:istore          6
		i1 = i;
	//  112  211:iload_2         
	//  113  212:istore          7
		j = k;
	//  114  214:iload           5
	//  115  216:istore          4
		if(k1 < 0) goto _L6; else goto _L5
	//  116  218:iload           9
	//  117  220:iflt            226
	//* 118  223:goto            68
_L6:
		j1++;
	//  119  226:iload           8
	//  120  228:iconst_1        
	//  121  229:iadd            
	//  122  230:istore          8
		flag1 = flag;
	//  123  232:iload_3         
	//  124  233:istore          10
		k1 = l;
	//  125  235:iload           6
	//  126  237:istore          9
		i = i1;
	//  127  239:iload           7
	//  128  241:istore_2        
		k = j;
	//  129  242:iload           4
	//  130  244:istore          5
		  goto _L7
	//* 131  246:goto            23
_L2:
		if(flag1)
	//* 132  249:iload           10
	//* 133  251:ifeq            258
			zzcl();
	//  134  254:aload_0         
	//  135  255:invokespecial   #45  <Method void zzcl()>
		if(k1 >= 0)
	//* 136  258:iload           9
	//* 137  260:iflt            274
			zzof.onDataRangeInserted(k1, k);
	//  138  263:aload_0         
	//  139  264:getfield        #42  <Field DataBufferObserverSet zzof>
	//  140  267:iload           9
	//  141  269:iload           5
	//  142  271:invokevirtual   #102 <Method void DataBufferObserverSet.onDataRangeInserted(int, int)>
		return;
	//  143  274:return          
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
