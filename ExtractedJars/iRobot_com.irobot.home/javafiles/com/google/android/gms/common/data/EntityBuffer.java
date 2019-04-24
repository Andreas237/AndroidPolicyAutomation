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
	//    2    2:invokespecial   #15  <Method void AbstractDataBuffer(DataHolder)>
		zamd = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #17  <Field boolean zamd>
	//    6   10:return          
	}

	private final void zacb()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(zamd) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #17  <Field boolean zamd>
	//    4    6:ifne            223
_L1:
		int k;
		k = mDataHolder.getCount();
	//    5    9:aload_0         
	//    6   10:getfield        #25  <Field DataHolder mDataHolder>
	//    7   13:invokevirtual   #31  <Method int DataHolder.getCount()>
	//    8   16:istore_2        
		zame = new ArrayList();
	//    9   17:aload_0         
	//   10   18:new             #33  <Class ArrayList>
	//   11   21:dup             
	//   12   22:invokespecial   #35  <Method void ArrayList()>
	//   13   25:putfield        #37  <Field ArrayList zame>
		if(k <= 0) goto _L4; else goto _L3
	//   14   28:iload_2         
	//   15   29:ifle            218
_L3:
		Object obj;
		String s1;
		zame.add(((Object) (Integer.valueOf(0))));
	//   16   32:aload_0         
	//   17   33:getfield        #37  <Field ArrayList zame>
	//   18   36:iconst_0        
	//   19   37:invokestatic    #43  <Method Integer Integer.valueOf(int)>
	//   20   40:invokevirtual   #47  <Method boolean ArrayList.add(Object)>
	//   21   43:pop             
		s1 = getPrimaryDataMarkerColumn();
	//   22   44:aload_0         
	//   23   45:invokevirtual   #51  <Method String getPrimaryDataMarkerColumn()>
	//   24   48:astore          7
		int i = mDataHolder.getWindowIndex(0);
	//   25   50:aload_0         
	//   26   51:getfield        #25  <Field DataHolder mDataHolder>
	//   27   54:iconst_0        
	//   28   55:invokevirtual   #55  <Method int DataHolder.getWindowIndex(int)>
	//   29   58:istore_1        
		obj = ((Object) (mDataHolder.getString(s1, 0, i)));
	//   30   59:aload_0         
	//   31   60:getfield        #25  <Field DataHolder mDataHolder>
	//   32   63:aload           7
	//   33   65:iconst_0        
	//   34   66:iload_1         
	//   35   67:invokevirtual   #59  <Method String DataHolder.getString(String, int, int)>
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
	//   43   80:getfield        #25  <Field DataHolder mDataHolder>
	//   44   83:iload_1         
	//   45   84:invokevirtual   #55  <Method int DataHolder.getWindowIndex(int)>
	//   46   87:istore_3        
		s = mDataHolder.getString(s1, j, l);
	//   47   88:aload_0         
	//   48   89:getfield        #25  <Field DataHolder mDataHolder>
	//   49   92:aload           7
	//   50   94:iload_1         
	//   51   95:iload_3         
	//   52   96:invokevirtual   #59  <Method String DataHolder.getString(String, int, int)>
	//   53   99:astore          6
		if(s != null)
			break MISSING_BLOCK_LABEL_185;
	//   54  101:aload           6
	//   55  103:ifnonnull       185
		obj = ((Object) (new StringBuilder(String.valueOf(((Object) (s1))).length() + 78)));
	//   56  106:new             #61  <Class StringBuilder>
	//   57  109:dup             
	//   58  110:aload           7
	//   59  112:invokestatic    #66  <Method String String.valueOf(Object)>
	//   60  115:invokevirtual   #69  <Method int String.length()>
	//   61  118:bipush          78
	//   62  120:iadd            
	//   63  121:invokespecial   #72  <Method void StringBuilder(int)>
	//   64  124:astore          4
		((StringBuilder) (obj)).append("Missing value for markerColumn: ");
	//   65  126:aload           4
	//   66  128:ldc1            #74  <String "Missing value for markerColumn: ">
	//   67  130:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   68  133:pop             
		((StringBuilder) (obj)).append(s1);
	//   69  134:aload           4
	//   70  136:aload           7
	//   71  138:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   72  141:pop             
		((StringBuilder) (obj)).append(", at row: ");
	//   73  142:aload           4
	//   74  144:ldc1            #80  <String ", at row: ">
	//   75  146:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   76  149:pop             
		((StringBuilder) (obj)).append(j);
	//   77  150:aload           4
	//   78  152:iload_1         
	//   79  153:invokevirtual   #83  <Method StringBuilder StringBuilder.append(int)>
	//   80  156:pop             
		((StringBuilder) (obj)).append(", for window: ");
	//   81  157:aload           4
	//   82  159:ldc1            #85  <String ", for window: ">
	//   83  161:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   84  164:pop             
		((StringBuilder) (obj)).append(l);
	//   85  165:aload           4
	//   86  167:iload_3         
	//   87  168:invokevirtual   #83  <Method StringBuilder StringBuilder.append(int)>
	//   88  171:pop             
		throw new NullPointerException(((StringBuilder) (obj)).toString());
	//   89  172:new             #87  <Class NullPointerException>
	//   90  175:dup             
	//   91  176:aload           4
	//   92  178:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   93  181:invokespecial   #93  <Method void NullPointerException(String)>
	//   94  184:athrow          
		Object obj1 = obj;
	//   95  185:aload           4
	//   96  187:astore          5
		if(s.equals(obj)) goto _L7; else goto _L6
	//   97  189:aload           6
	//   98  191:aload           4
	//   99  193:invokevirtual   #96  <Method boolean String.equals(Object)>
	//  100  196:ifne            233
_L6:
		zame.add(((Object) (Integer.valueOf(j))));
	//  101  199:aload_0         
	//  102  200:getfield        #37  <Field ArrayList zame>
	//  103  203:iload_1         
	//  104  204:invokestatic    #43  <Method Integer Integer.valueOf(int)>
	//  105  207:invokevirtual   #47  <Method boolean ArrayList.add(Object)>
	//  106  210:pop             
		obj1 = ((Object) (s));
	//  107  211:aload           6
	//  108  213:astore          5
		  goto _L7
	//* 109  215:goto            233
_L4:
		zamd = true;
	//  110  218:aload_0         
	//  111  219:iconst_1        
	//  112  220:putfield        #17  <Field boolean zamd>
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

	private final int zah(int i)
	{
		if(i >= 0 && i < zame.size())
	//*   0    0:iload_1         
	//*   1    1:iflt            33
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #37  <Field ArrayList zame>
	//*   5    9:invokevirtual   #100 <Method int ArrayList.size()>
	//*   6   12:icmplt          18
	//*   7   15:goto            33
		{
			return ((Integer)zame.get(i)).intValue();
	//    8   18:aload_0         
	//    9   19:getfield        #37  <Field ArrayList zame>
	//   10   22:iload_1         
	//   11   23:invokevirtual   #104 <Method Object ArrayList.get(int)>
	//   12   26:checkcast       #39  <Class Integer>
	//   13   29:invokevirtual   #107 <Method int Integer.intValue()>
	//   14   32:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(53);
	//   15   33:new             #61  <Class StringBuilder>
	//   16   36:dup             
	//   17   37:bipush          53
	//   18   39:invokespecial   #72  <Method void StringBuilder(int)>
	//   19   42:astore_2        
			stringbuilder.append("Position ");
	//   20   43:aload_2         
	//   21   44:ldc1            #109 <String "Position ">
	//   22   46:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   23   49:pop             
			stringbuilder.append(i);
	//   24   50:aload_2         
	//   25   51:iload_1         
	//   26   52:invokevirtual   #83  <Method StringBuilder StringBuilder.append(int)>
	//   27   55:pop             
			stringbuilder.append(" is out of bounds for this buffer");
	//   28   56:aload_2         
	//   29   57:ldc1            #111 <String " is out of bounds for this buffer">
	//   30   59:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   31   62:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   32   63:new             #113 <Class IllegalArgumentException>
	//   33   66:dup             
	//   34   67:aload_2         
	//   35   68:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   36   71:invokespecial   #114 <Method void IllegalArgumentException(String)>
	//   37   74:athrow          
		}
	}

	public final Object get(int i)
	{
		zacb();
	//    0    0:aload_0         
	//    1    1:invokespecial   #116 <Method void zacb()>
		int k = zah(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #118 <Method int zah(int)>
	//    5    9:istore          4
		boolean flag = false;
	//    6   11:iconst_0        
	//    7   12:istore_3        
		int j = ((int) (flag));
	//    8   13:iload_3         
	//    9   14:istore_2        
		if(i >= 0)
	//*  10   15:iload_1         
	//*  11   16:iflt            148
			if(i == zame.size())
	//*  12   19:iload_1         
	//*  13   20:aload_0         
	//*  14   21:getfield        #37  <Field ArrayList zame>
	//*  15   24:invokevirtual   #100 <Method int ArrayList.size()>
	//*  16   27:icmpne          35
			{
				j = ((int) (flag));
	//   17   30:iload_3         
	//   18   31:istore_2        
			} else
	//*  19   32:goto            148
			{
				if(i == zame.size() - 1)
	//*  20   35:iload_1         
	//*  21   36:aload_0         
	//*  22   37:getfield        #37  <Field ArrayList zame>
	//*  23   40:invokevirtual   #100 <Method int ArrayList.size()>
	//*  24   43:iconst_1        
	//*  25   44:isub            
	//*  26   45:icmpne          76
					j = mDataHolder.getCount();
	//   27   48:aload_0         
	//   28   49:getfield        #25  <Field DataHolder mDataHolder>
	//   29   52:invokevirtual   #31  <Method int DataHolder.getCount()>
	//   30   55:istore_2        
				else
	//*  31   56:iload_2         
	//*  32   57:aload_0         
	//*  33   58:getfield        #37  <Field ArrayList zame>
	//*  34   61:iload_1         
	//*  35   62:invokevirtual   #104 <Method Object ArrayList.get(int)>
	//*  36   65:checkcast       #39  <Class Integer>
	//*  37   68:invokevirtual   #107 <Method int Integer.intValue()>
	//*  38   71:isub            
	//*  39   72:istore_2        
	//*  40   73:goto            96
					j = ((Integer)zame.get(i + 1)).intValue();
	//   41   76:aload_0         
	//   42   77:getfield        #37  <Field ArrayList zame>
	//   43   80:iload_1         
	//   44   81:iconst_1        
	//   45   82:iadd            
	//   46   83:invokevirtual   #104 <Method Object ArrayList.get(int)>
	//   47   86:checkcast       #39  <Class Integer>
	//   48   89:invokevirtual   #107 <Method int Integer.intValue()>
	//   49   92:istore_2        
				j -= ((Integer)zame.get(i)).intValue();
	//*  50   93:goto            56
				if(j == 1)
	//*  51   96:iload_2         
	//*  52   97:iconst_1        
	//*  53   98:icmpne          148
				{
					i = zah(i);
	//   54  101:aload_0         
	//   55  102:iload_1         
	//   56  103:invokespecial   #118 <Method int zah(int)>
	//   57  106:istore_1        
					int l = mDataHolder.getWindowIndex(i);
	//   58  107:aload_0         
	//   59  108:getfield        #25  <Field DataHolder mDataHolder>
	//   60  111:iload_1         
	//   61  112:invokevirtual   #55  <Method int DataHolder.getWindowIndex(int)>
	//   62  115:istore          5
					String s = getChildDataMarkerColumn();
	//   63  117:aload_0         
	//   64  118:invokevirtual   #121 <Method String getChildDataMarkerColumn()>
	//   65  121:astore          6
					if(s != null && mDataHolder.getString(s, i, l) == null)
	//*  66  123:aload           6
	//*  67  125:ifnull          148
	//*  68  128:aload_0         
	//*  69  129:getfield        #25  <Field DataHolder mDataHolder>
	//*  70  132:aload           6
	//*  71  134:iload_1         
	//*  72  135:iload           5
	//*  73  137:invokevirtual   #59  <Method String DataHolder.getString(String, int, int)>
	//*  74  140:ifnonnull       148
						j = ((int) (flag));
	//   75  143:iload_3         
	//   76  144:istore_2        
				}
			}
	//*  77  145:goto            148
		return getEntry(k, j);
	//   78  148:aload_0         
	//   79  149:iload           4
	//   80  151:iload_2         
	//   81  152:invokevirtual   #125 <Method Object getEntry(int, int)>
	//   82  155:areturn         
	}

	protected String getChildDataMarkerColumn()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int getCount()
	{
		zacb();
	//    0    0:aload_0         
	//    1    1:invokespecial   #116 <Method void zacb()>
		return zame.size();
	//    2    4:aload_0         
	//    3    5:getfield        #37  <Field ArrayList zame>
	//    4    8:invokevirtual   #100 <Method int ArrayList.size()>
	//    5   11:ireturn         
	}

	protected abstract Object getEntry(int i, int j);

	protected abstract String getPrimaryDataMarkerColumn();

	private boolean zamd;
	private ArrayList zame;
}
