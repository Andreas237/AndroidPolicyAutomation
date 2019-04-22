// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.common.data:
//			AbstractDataBuffer, DataHolder

public abstract class EntityBuffer extends AbstractDataBuffer
{

	protected EntityBuffer(DataHolder dataholder)
	{
		super(dataholder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void AbstractDataBuffer(DataHolder)>
		zzoa = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #16  <Field boolean zzoa>
	//    6   10:return          
	}

	private final void zzck()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(zzoa) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #16  <Field boolean zzoa>
	//    4    6:ifne            223
_L1:
		int k;
		k = mDataHolder.getCount();
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field DataHolder mDataHolder>
	//    7   13:invokevirtual   #29  <Method int DataHolder.getCount()>
	//    8   16:istore_2        
		zzob = new ArrayList();
	//    9   17:aload_0         
	//   10   18:new             #31  <Class ArrayList>
	//   11   21:dup             
	//   12   22:invokespecial   #33  <Method void ArrayList()>
	//   13   25:putfield        #35  <Field ArrayList zzob>
		if(k <= 0) goto _L4; else goto _L3
	//   14   28:iload_2         
	//   15   29:ifle            218
_L3:
		Object obj;
		String s2;
		zzob.add(((Object) (Integer.valueOf(0))));
	//   16   32:aload_0         
	//   17   33:getfield        #35  <Field ArrayList zzob>
	//   18   36:iconst_0        
	//   19   37:invokestatic    #41  <Method Integer Integer.valueOf(int)>
	//   20   40:invokevirtual   #45  <Method boolean ArrayList.add(Object)>
	//   21   43:pop             
		s2 = getPrimaryDataMarkerColumn();
	//   22   44:aload_0         
	//   23   45:invokevirtual   #49  <Method String getPrimaryDataMarkerColumn()>
	//   24   48:astore          7
		int i = mDataHolder.getWindowIndex(0);
	//   25   50:aload_0         
	//   26   51:getfield        #23  <Field DataHolder mDataHolder>
	//   27   54:iconst_0        
	//   28   55:invokevirtual   #53  <Method int DataHolder.getWindowIndex(int)>
	//   29   58:istore_1        
		obj = ((Object) (mDataHolder.getString(s2, 0, i)));
	//   30   59:aload_0         
	//   31   60:getfield        #23  <Field DataHolder mDataHolder>
	//   32   63:aload           7
	//   33   65:iconst_0        
	//   34   66:iload_1         
	//   35   67:invokevirtual   #57  <Method String DataHolder.getString(String, int, int)>
	//   36   70:astore          4
		int j = 1;
	//   37   72:iconst_1        
	//   38   73:istore_1        
_L11:
		if(j >= k) goto _L4; else goto _L5
	//   39   74:iload_1         
	//   40   75:iload_2         
	//   41   76:icmpge          218
_L5:
		int l;
		String s1;
		l = mDataHolder.getWindowIndex(j);
	//   42   79:aload_0         
	//   43   80:getfield        #23  <Field DataHolder mDataHolder>
	//   44   83:iload_1         
	//   45   84:invokevirtual   #53  <Method int DataHolder.getWindowIndex(int)>
	//   46   87:istore_3        
		s1 = mDataHolder.getString(s2, j, l);
	//   47   88:aload_0         
	//   48   89:getfield        #23  <Field DataHolder mDataHolder>
	//   49   92:aload           7
	//   50   94:iload_1         
	//   51   95:iload_3         
	//   52   96:invokevirtual   #57  <Method String DataHolder.getString(String, int, int)>
	//   53   99:astore          6
		if(s1 == null) goto _L7; else goto _L6
	//   54  101:aload           6
	//   55  103:ifnull          139
_L6:
		String s = ((String) (obj));
	//   56  106:aload           4
	//   57  108:astore          5
		if(s1.equals(obj)) goto _L9; else goto _L8
	//   58  110:aload           6
	//   59  112:aload           4
	//   60  114:invokevirtual   #62  <Method boolean String.equals(Object)>
	//   61  117:ifne            233
_L8:
		zzob.add(((Object) (Integer.valueOf(j))));
	//   62  120:aload_0         
	//   63  121:getfield        #35  <Field ArrayList zzob>
	//   64  124:iload_1         
	//   65  125:invokestatic    #41  <Method Integer Integer.valueOf(int)>
	//   66  128:invokevirtual   #45  <Method boolean ArrayList.add(Object)>
	//   67  131:pop             
		s = s1;
	//   68  132:aload           6
	//   69  134:astore          5
		  goto _L9
	//*  70  136:goto            233
_L7:
		obj = ((Object) (new StringBuilder(String.valueOf(((Object) (s2))).length() + 78)));
	//   71  139:new             #64  <Class StringBuilder>
	//   72  142:dup             
	//   73  143:aload           7
	//   74  145:invokestatic    #67  <Method String String.valueOf(Object)>
	//   75  148:invokevirtual   #70  <Method int String.length()>
	//   76  151:bipush          78
	//   77  153:iadd            
	//   78  154:invokespecial   #73  <Method void StringBuilder(int)>
	//   79  157:astore          4
		((StringBuilder) (obj)).append("Missing value for markerColumn: ");
	//   80  159:aload           4
	//   81  161:ldc1            #75  <String "Missing value for markerColumn: ">
	//   82  163:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   83  166:pop             
		((StringBuilder) (obj)).append(s2);
	//   84  167:aload           4
	//   85  169:aload           7
	//   86  171:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   87  174:pop             
		((StringBuilder) (obj)).append(", at row: ");
	//   88  175:aload           4
	//   89  177:ldc1            #81  <String ", at row: ">
	//   90  179:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   91  182:pop             
		((StringBuilder) (obj)).append(j);
	//   92  183:aload           4
	//   93  185:iload_1         
	//   94  186:invokevirtual   #84  <Method StringBuilder StringBuilder.append(int)>
	//   95  189:pop             
		((StringBuilder) (obj)).append(", for window: ");
	//   96  190:aload           4
	//   97  192:ldc1            #86  <String ", for window: ">
	//   98  194:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   99  197:pop             
		((StringBuilder) (obj)).append(l);
	//  100  198:aload           4
	//  101  200:iload_3         
	//  102  201:invokevirtual   #84  <Method StringBuilder StringBuilder.append(int)>
	//  103  204:pop             
		throw new NullPointerException(((StringBuilder) (obj)).toString());
	//  104  205:new             #88  <Class NullPointerException>
	//  105  208:dup             
	//  106  209:aload           4
	//  107  211:invokevirtual   #91  <Method String StringBuilder.toString()>
	//  108  214:invokespecial   #94  <Method void NullPointerException(String)>
	//  109  217:athrow          
_L4:
		zzoa = true;
	//  110  218:aload_0         
	//  111  219:iconst_1        
	//  112  220:putfield        #16  <Field boolean zzoa>
_L2:
		this;
	//  113  223:aload_0         
		JVM INSTR monitorexit ;
	//  114  224:monitorexit     
		return;
	//  115  225:return          
		obj;
	//  116  226:astore          4
		this;
	//  117  228:aload_0         
		JVM INSTR monitorexit ;
	//  118  229:monitorexit     
		throw obj;
	//  119  230:aload           4
	//  120  232:athrow          
_L9:
		j++;
	//  121  233:iload_1         
	//  122  234:iconst_1        
	//  123  235:iadd            
	//  124  236:istore_1        
		obj = ((Object) (s));
	//  125  237:aload           5
	//  126  239:astore          4
		if(true) goto _L11; else goto _L10
	//  127  241:goto            74
_L10:
	}

	public final Object get(int i)
	{
		zzck();
	//    0    0:aload_0         
	//    1    1:invokespecial   #98  <Method void zzck()>
		return getEntry(zzi(i), getChildCount(i));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokevirtual   #101 <Method int zzi(int)>
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:invokevirtual   #104 <Method int getChildCount(int)>
	//    9   15:invokevirtual   #108 <Method Object getEntry(int, int)>
	//   10   18:areturn         
	}

	protected int getChildCount(int i)
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            124
		{
			if(i == zzob.size())
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #35  <Field ArrayList zzob>
	//*   5    9:invokevirtual   #113 <Method int ArrayList.size()>
	//*   6   12:icmpne          17
				return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
			int j;
			if(i == zzob.size() - 1)
	//*   9   17:iload_1         
	//*  10   18:aload_0         
	//*  11   19:getfield        #35  <Field ArrayList zzob>
	//*  12   22:invokevirtual   #113 <Method int ArrayList.size()>
	//*  13   25:iconst_1        
	//*  14   26:isub            
	//*  15   27:icmpne          41
				j = mDataHolder.getCount();
	//   16   30:aload_0         
	//   17   31:getfield        #23  <Field DataHolder mDataHolder>
	//   18   34:invokevirtual   #29  <Method int DataHolder.getCount()>
	//   19   37:istore_2        
			else
	//*  20   38:goto            58
				j = ((Integer)zzob.get(i + 1)).intValue();
	//   21   41:aload_0         
	//   22   42:getfield        #35  <Field ArrayList zzob>
	//   23   45:iload_1         
	//   24   46:iconst_1        
	//   25   47:iadd            
	//   26   48:invokevirtual   #115 <Method Object ArrayList.get(int)>
	//   27   51:checkcast       #37  <Class Integer>
	//   28   54:invokevirtual   #118 <Method int Integer.intValue()>
	//   29   57:istore_2        
			j -= ((Integer)zzob.get(i)).intValue();
	//   30   58:iload_2         
	//   31   59:aload_0         
	//   32   60:getfield        #35  <Field ArrayList zzob>
	//   33   63:iload_1         
	//   34   64:invokevirtual   #115 <Method Object ArrayList.get(int)>
	//   35   67:checkcast       #37  <Class Integer>
	//   36   70:invokevirtual   #118 <Method int Integer.intValue()>
	//   37   73:isub            
	//   38   74:istore_2        
			if(j == 1)
	//*  39   75:iload_2         
	//*  40   76:iconst_1        
	//*  41   77:icmpne          122
			{
				i = zzi(i);
	//   42   80:aload_0         
	//   43   81:iload_1         
	//   44   82:invokevirtual   #101 <Method int zzi(int)>
	//   45   85:istore_1        
				int k = mDataHolder.getWindowIndex(i);
	//   46   86:aload_0         
	//   47   87:getfield        #23  <Field DataHolder mDataHolder>
	//   48   90:iload_1         
	//   49   91:invokevirtual   #53  <Method int DataHolder.getWindowIndex(int)>
	//   50   94:istore_3        
				String s = getChildDataMarkerColumn();
	//   51   95:aload_0         
	//   52   96:invokevirtual   #121 <Method String getChildDataMarkerColumn()>
	//   53   99:astore          4
				if(s != null && mDataHolder.getString(s, i, k) == null)
	//*  54  101:aload           4
	//*  55  103:ifnull          122
	//*  56  106:aload_0         
	//*  57  107:getfield        #23  <Field DataHolder mDataHolder>
	//*  58  110:aload           4
	//*  59  112:iload_1         
	//*  60  113:iload_3         
	//*  61  114:invokevirtual   #57  <Method String DataHolder.getString(String, int, int)>
	//*  62  117:ifnonnull       122
					return 0;
	//   63  120:iconst_0        
	//   64  121:ireturn         
			}
			return j;
	//   65  122:iload_2         
	//   66  123:ireturn         
		} else
		{
			return 0;
	//   67  124:iconst_0        
	//   68  125:ireturn         
		}
	}

	protected String getChildDataMarkerColumn()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int getCount()
	{
		zzck();
	//    0    0:aload_0         
	//    1    1:invokespecial   #98  <Method void zzck()>
		return zzob.size();
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field ArrayList zzob>
	//    4    8:invokevirtual   #113 <Method int ArrayList.size()>
	//    5   11:ireturn         
	}

	protected abstract Object getEntry(int i, int j);

	protected abstract String getPrimaryDataMarkerColumn();

	final int zzi(int i)
	{
		if(i >= 0 && i < zzob.size())
	//*   0    0:iload_1         
	//*   1    1:iflt            30
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #35  <Field ArrayList zzob>
	//*   5    9:invokevirtual   #113 <Method int ArrayList.size()>
	//*   6   12:icmpge          30
		{
			return ((Integer)zzob.get(i)).intValue();
	//    7   15:aload_0         
	//    8   16:getfield        #35  <Field ArrayList zzob>
	//    9   19:iload_1         
	//   10   20:invokevirtual   #115 <Method Object ArrayList.get(int)>
	//   11   23:checkcast       #37  <Class Integer>
	//   12   26:invokevirtual   #118 <Method int Integer.intValue()>
	//   13   29:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(53);
	//   14   30:new             #64  <Class StringBuilder>
	//   15   33:dup             
	//   16   34:bipush          53
	//   17   36:invokespecial   #73  <Method void StringBuilder(int)>
	//   18   39:astore_2        
			stringbuilder.append("Position ");
	//   19   40:aload_2         
	//   20   41:ldc1            #123 <String "Position ">
	//   21   43:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   22   46:pop             
			stringbuilder.append(i);
	//   23   47:aload_2         
	//   24   48:iload_1         
	//   25   49:invokevirtual   #84  <Method StringBuilder StringBuilder.append(int)>
	//   26   52:pop             
			stringbuilder.append(" is out of bounds for this buffer");
	//   27   53:aload_2         
	//   28   54:ldc1            #125 <String " is out of bounds for this buffer">
	//   29   56:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   30   59:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   31   60:new             #127 <Class IllegalArgumentException>
	//   32   63:dup             
	//   33   64:aload_2         
	//   34   65:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   35   68:invokespecial   #128 <Method void IllegalArgumentException(String)>
	//   36   71:athrow          
		}
	}

	private boolean zzoa;
	private ArrayList zzob;
}
