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
		String s1;
		zzob.add(((Object) (Integer.valueOf(0))));
	//   16   32:aload_0         
	//   17   33:getfield        #35  <Field ArrayList zzob>
	//   18   36:iconst_0        
	//   19   37:invokestatic    #41  <Method Integer Integer.valueOf(int)>
	//   20   40:invokevirtual   #45  <Method boolean ArrayList.add(Object)>
	//   21   43:pop             
		s1 = getPrimaryDataMarkerColumn();
	//   22   44:aload_0         
	//   23   45:invokevirtual   #49  <Method String getPrimaryDataMarkerColumn()>
	//   24   48:astore          7
		int i = mDataHolder.getWindowIndex(0);
	//   25   50:aload_0         
	//   26   51:getfield        #23  <Field DataHolder mDataHolder>
	//   27   54:iconst_0        
	//   28   55:invokevirtual   #53  <Method int DataHolder.getWindowIndex(int)>
	//   29   58:istore_1        
		obj = ((Object) (mDataHolder.getString(s1, 0, i)));
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
_L9:
		if(j >= k) goto _L4; else goto _L5
	//   39   74:iload_1         
	//   40   75:iload_2         
	//   41   76:icmpge          218
_L5:
		int l;
		String s;
		l = mDataHolder.getWindowIndex(j);
	//   42   79:aload_0         
	//   43   80:getfield        #23  <Field DataHolder mDataHolder>
	//   44   83:iload_1         
	//   45   84:invokevirtual   #53  <Method int DataHolder.getWindowIndex(int)>
	//   46   87:istore_3        
		s = mDataHolder.getString(s1, j, l);
	//   47   88:aload_0         
	//   48   89:getfield        #23  <Field DataHolder mDataHolder>
	//   49   92:aload           7
	//   50   94:iload_1         
	//   51   95:iload_3         
	//   52   96:invokevirtual   #57  <Method String DataHolder.getString(String, int, int)>
	//   53   99:astore          6
		if(s != null)
			break MISSING_BLOCK_LABEL_185;
	//   54  101:aload           6
	//   55  103:ifnonnull       185
		obj = ((Object) (new StringBuilder(78 + String.valueOf(((Object) (s1))).length())));
	//   56  106:new             #59  <Class StringBuilder>
	//   57  109:dup             
	//   58  110:bipush          78
	//   59  112:aload           7
	//   60  114:invokestatic    #64  <Method String String.valueOf(Object)>
	//   61  117:invokevirtual   #67  <Method int String.length()>
	//   62  120:iadd            
	//   63  121:invokespecial   #70  <Method void StringBuilder(int)>
	//   64  124:astore          4
		((StringBuilder) (obj)).append("Missing value for markerColumn: ");
	//   65  126:aload           4
	//   66  128:ldc1            #72  <String "Missing value for markerColumn: ">
	//   67  130:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   68  133:pop             
		((StringBuilder) (obj)).append(s1);
	//   69  134:aload           4
	//   70  136:aload           7
	//   71  138:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   72  141:pop             
		((StringBuilder) (obj)).append(", at row: ");
	//   73  142:aload           4
	//   74  144:ldc1            #78  <String ", at row: ">
	//   75  146:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   76  149:pop             
		((StringBuilder) (obj)).append(j);
	//   77  150:aload           4
	//   78  152:iload_1         
	//   79  153:invokevirtual   #81  <Method StringBuilder StringBuilder.append(int)>
	//   80  156:pop             
		((StringBuilder) (obj)).append(", for window: ");
	//   81  157:aload           4
	//   82  159:ldc1            #83  <String ", for window: ">
	//   83  161:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   84  164:pop             
		((StringBuilder) (obj)).append(l);
	//   85  165:aload           4
	//   86  167:iload_3         
	//   87  168:invokevirtual   #81  <Method StringBuilder StringBuilder.append(int)>
	//   88  171:pop             
		throw new NullPointerException(((StringBuilder) (obj)).toString());
	//   89  172:new             #85  <Class NullPointerException>
	//   90  175:dup             
	//   91  176:aload           4
	//   92  178:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   93  181:invokespecial   #91  <Method void NullPointerException(String)>
	//   94  184:athrow          
		Object obj1 = obj;
	//   95  185:aload           4
	//   96  187:astore          5
		if(s.equals(obj)) goto _L7; else goto _L6
	//   97  189:aload           6
	//   98  191:aload           4
	//   99  193:invokevirtual   #94  <Method boolean String.equals(Object)>
	//  100  196:ifne            233
_L6:
		zzob.add(((Object) (Integer.valueOf(j))));
	//  101  199:aload_0         
	//  102  200:getfield        #35  <Field ArrayList zzob>
	//  103  203:iload_1         
	//  104  204:invokestatic    #41  <Method Integer Integer.valueOf(int)>
	//  105  207:invokevirtual   #45  <Method boolean ArrayList.add(Object)>
	//  106  210:pop             
		obj1 = ((Object) (s));
	//  107  211:aload           6
	//  108  213:astore          5
		  goto _L7
	//* 109  215:goto            233
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
_L7:
		j++;
	//  121  233:iload_1         
	//  122  234:iconst_1        
	//  123  235:iadd            
	//  124  236:istore_1        
		obj = obj1;
	//  125  237:aload           5
	//  126  239:astore          4
		if(true) goto _L9; else goto _L8
	//  127  241:goto            74
_L8:
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
	//*   1    1:iflt            127
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
	//*  15   27:icmpne          58
				j = mDataHolder.getCount();
	//   16   30:aload_0         
	//   17   31:getfield        #23  <Field DataHolder mDataHolder>
	//   18   34:invokevirtual   #29  <Method int DataHolder.getCount()>
	//   19   37:istore_2        
			else
	//*  20   38:iload_2         
	//*  21   39:aload_0         
	//*  22   40:getfield        #35  <Field ArrayList zzob>
	//*  23   43:iload_1         
	//*  24   44:invokevirtual   #115 <Method Object ArrayList.get(int)>
	//*  25   47:checkcast       #37  <Class Integer>
	//*  26   50:invokevirtual   #118 <Method int Integer.intValue()>
	//*  27   53:isub            
	//*  28   54:istore_2        
	//*  29   55:goto            78
				j = ((Integer)zzob.get(i + 1)).intValue();
	//   30   58:aload_0         
	//   31   59:getfield        #35  <Field ArrayList zzob>
	//   32   62:iload_1         
	//   33   63:iconst_1        
	//   34   64:iadd            
	//   35   65:invokevirtual   #115 <Method Object ArrayList.get(int)>
	//   36   68:checkcast       #37  <Class Integer>
	//   37   71:invokevirtual   #118 <Method int Integer.intValue()>
	//   38   74:istore_2        
			j -= ((Integer)zzob.get(i)).intValue();
	//*  39   75:goto            38
			if(j == 1)
	//*  40   78:iload_2         
	//*  41   79:iconst_1        
	//*  42   80:icmpne          125
			{
				i = zzi(i);
	//   43   83:aload_0         
	//   44   84:iload_1         
	//   45   85:invokevirtual   #101 <Method int zzi(int)>
	//   46   88:istore_1        
				int k = mDataHolder.getWindowIndex(i);
	//   47   89:aload_0         
	//   48   90:getfield        #23  <Field DataHolder mDataHolder>
	//   49   93:iload_1         
	//   50   94:invokevirtual   #53  <Method int DataHolder.getWindowIndex(int)>
	//   51   97:istore_3        
				String s = getChildDataMarkerColumn();
	//   52   98:aload_0         
	//   53   99:invokevirtual   #121 <Method String getChildDataMarkerColumn()>
	//   54  102:astore          4
				if(s != null && mDataHolder.getString(s, i, k) == null)
	//*  55  104:aload           4
	//*  56  106:ifnull          125
	//*  57  109:aload_0         
	//*  58  110:getfield        #23  <Field DataHolder mDataHolder>
	//*  59  113:aload           4
	//*  60  115:iload_1         
	//*  61  116:iload_3         
	//*  62  117:invokevirtual   #57  <Method String DataHolder.getString(String, int, int)>
	//*  63  120:ifnonnull       125
					return 0;
	//   64  123:iconst_0        
	//   65  124:ireturn         
			}
			return j;
	//   66  125:iload_2         
	//   67  126:ireturn         
		} else
		{
			return 0;
	//   68  127:iconst_0        
	//   69  128:ireturn         
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
	//*   1    1:iflt            33
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #35  <Field ArrayList zzob>
	//*   5    9:invokevirtual   #113 <Method int ArrayList.size()>
	//*   6   12:icmplt          18
	//*   7   15:goto            33
		{
			return ((Integer)zzob.get(i)).intValue();
	//    8   18:aload_0         
	//    9   19:getfield        #35  <Field ArrayList zzob>
	//   10   22:iload_1         
	//   11   23:invokevirtual   #115 <Method Object ArrayList.get(int)>
	//   12   26:checkcast       #37  <Class Integer>
	//   13   29:invokevirtual   #118 <Method int Integer.intValue()>
	//   14   32:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(53);
	//   15   33:new             #59  <Class StringBuilder>
	//   16   36:dup             
	//   17   37:bipush          53
	//   18   39:invokespecial   #70  <Method void StringBuilder(int)>
	//   19   42:astore_2        
			stringbuilder.append("Position ");
	//   20   43:aload_2         
	//   21   44:ldc1            #123 <String "Position ">
	//   22   46:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   23   49:pop             
			stringbuilder.append(i);
	//   24   50:aload_2         
	//   25   51:iload_1         
	//   26   52:invokevirtual   #81  <Method StringBuilder StringBuilder.append(int)>
	//   27   55:pop             
			stringbuilder.append(" is out of bounds for this buffer");
	//   28   56:aload_2         
	//   29   57:ldc1            #125 <String " is out of bounds for this buffer">
	//   30   59:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   31   62:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   32   63:new             #127 <Class IllegalArgumentException>
	//   33   66:dup             
	//   34   67:aload_2         
	//   35   68:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   36   71:invokespecial   #128 <Method void IllegalArgumentException(String)>
	//   37   74:athrow          
		}
	}

	private boolean zzoa;
	private ArrayList zzob;
}
