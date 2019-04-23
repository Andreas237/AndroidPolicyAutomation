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
		String s2;
		zame.add(((Object) (Integer.valueOf(0))));
	//   16   32:aload_0         
	//   17   33:getfield        #37  <Field ArrayList zame>
	//   18   36:iconst_0        
	//   19   37:invokestatic    #43  <Method Integer Integer.valueOf(int)>
	//   20   40:invokevirtual   #47  <Method boolean ArrayList.add(Object)>
	//   21   43:pop             
		s2 = getPrimaryDataMarkerColumn();
	//   22   44:aload_0         
	//   23   45:invokevirtual   #51  <Method String getPrimaryDataMarkerColumn()>
	//   24   48:astore          7
		int i = mDataHolder.getWindowIndex(0);
	//   25   50:aload_0         
	//   26   51:getfield        #25  <Field DataHolder mDataHolder>
	//   27   54:iconst_0        
	//   28   55:invokevirtual   #55  <Method int DataHolder.getWindowIndex(int)>
	//   29   58:istore_1        
		obj = ((Object) (mDataHolder.getString(s2, 0, i)));
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
	//   43   80:getfield        #25  <Field DataHolder mDataHolder>
	//   44   83:iload_1         
	//   45   84:invokevirtual   #55  <Method int DataHolder.getWindowIndex(int)>
	//   46   87:istore_3        
		s1 = mDataHolder.getString(s2, j, l);
	//   47   88:aload_0         
	//   48   89:getfield        #25  <Field DataHolder mDataHolder>
	//   49   92:aload           7
	//   50   94:iload_1         
	//   51   95:iload_3         
	//   52   96:invokevirtual   #59  <Method String DataHolder.getString(String, int, int)>
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
	//   60  114:invokevirtual   #64  <Method boolean String.equals(Object)>
	//   61  117:ifne            233
_L8:
		zame.add(((Object) (Integer.valueOf(j))));
	//   62  120:aload_0         
	//   63  121:getfield        #37  <Field ArrayList zame>
	//   64  124:iload_1         
	//   65  125:invokestatic    #43  <Method Integer Integer.valueOf(int)>
	//   66  128:invokevirtual   #47  <Method boolean ArrayList.add(Object)>
	//   67  131:pop             
		s = s1;
	//   68  132:aload           6
	//   69  134:astore          5
		  goto _L9
	//*  70  136:goto            233
_L7:
		obj = ((Object) (new StringBuilder(String.valueOf(((Object) (s2))).length() + 78)));
	//   71  139:new             #66  <Class StringBuilder>
	//   72  142:dup             
	//   73  143:aload           7
	//   74  145:invokestatic    #69  <Method String String.valueOf(Object)>
	//   75  148:invokevirtual   #72  <Method int String.length()>
	//   76  151:bipush          78
	//   77  153:iadd            
	//   78  154:invokespecial   #75  <Method void StringBuilder(int)>
	//   79  157:astore          4
		((StringBuilder) (obj)).append("Missing value for markerColumn: ");
	//   80  159:aload           4
	//   81  161:ldc1            #77  <String "Missing value for markerColumn: ">
	//   82  163:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   83  166:pop             
		((StringBuilder) (obj)).append(s2);
	//   84  167:aload           4
	//   85  169:aload           7
	//   86  171:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   87  174:pop             
		((StringBuilder) (obj)).append(", at row: ");
	//   88  175:aload           4
	//   89  177:ldc1            #83  <String ", at row: ">
	//   90  179:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   91  182:pop             
		((StringBuilder) (obj)).append(j);
	//   92  183:aload           4
	//   93  185:iload_1         
	//   94  186:invokevirtual   #86  <Method StringBuilder StringBuilder.append(int)>
	//   95  189:pop             
		((StringBuilder) (obj)).append(", for window: ");
	//   96  190:aload           4
	//   97  192:ldc1            #88  <String ", for window: ">
	//   98  194:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   99  197:pop             
		((StringBuilder) (obj)).append(l);
	//  100  198:aload           4
	//  101  200:iload_3         
	//  102  201:invokevirtual   #86  <Method StringBuilder StringBuilder.append(int)>
	//  103  204:pop             
		throw new NullPointerException(((StringBuilder) (obj)).toString());
	//  104  205:new             #90  <Class NullPointerException>
	//  105  208:dup             
	//  106  209:aload           4
	//  107  211:invokevirtual   #93  <Method String StringBuilder.toString()>
	//  108  214:invokespecial   #96  <Method void NullPointerException(String)>
	//  109  217:athrow          
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

	private final int zah(int i)
	{
		if(i >= 0 && i < zame.size())
	//*   0    0:iload_1         
	//*   1    1:iflt            30
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #37  <Field ArrayList zame>
	//*   5    9:invokevirtual   #100 <Method int ArrayList.size()>
	//*   6   12:icmpge          30
		{
			return ((Integer)zame.get(i)).intValue();
	//    7   15:aload_0         
	//    8   16:getfield        #37  <Field ArrayList zame>
	//    9   19:iload_1         
	//   10   20:invokevirtual   #104 <Method Object ArrayList.get(int)>
	//   11   23:checkcast       #39  <Class Integer>
	//   12   26:invokevirtual   #107 <Method int Integer.intValue()>
	//   13   29:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(53);
	//   14   30:new             #66  <Class StringBuilder>
	//   15   33:dup             
	//   16   34:bipush          53
	//   17   36:invokespecial   #75  <Method void StringBuilder(int)>
	//   18   39:astore_2        
			stringbuilder.append("Position ");
	//   19   40:aload_2         
	//   20   41:ldc1            #109 <String "Position ">
	//   21   43:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   22   46:pop             
			stringbuilder.append(i);
	//   23   47:aload_2         
	//   24   48:iload_1         
	//   25   49:invokevirtual   #86  <Method StringBuilder StringBuilder.append(int)>
	//   26   52:pop             
			stringbuilder.append(" is out of bounds for this buffer");
	//   27   53:aload_2         
	//   28   54:ldc1            #111 <String " is out of bounds for this buffer">
	//   29   56:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   30   59:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   31   60:new             #113 <Class IllegalArgumentException>
	//   32   63:dup             
	//   33   64:aload_2         
	//   34   65:invokevirtual   #93  <Method String StringBuilder.toString()>
	//   35   68:invokespecial   #114 <Method void IllegalArgumentException(String)>
	//   36   71:athrow          
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
	//*  11   16:iflt            158
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
	//*  19   32:goto            158
			{
				if(i == zame.size() - 1)
	//*  20   35:iload_1         
	//*  21   36:aload_0         
	//*  22   37:getfield        #37  <Field ArrayList zame>
	//*  23   40:invokevirtual   #100 <Method int ArrayList.size()>
	//*  24   43:iconst_1        
	//*  25   44:isub            
	//*  26   45:icmpne          74
					j = mDataHolder.getCount() - ((Integer)zame.get(i)).intValue();
	//   27   48:aload_0         
	//   28   49:getfield        #25  <Field DataHolder mDataHolder>
	//   29   52:invokevirtual   #31  <Method int DataHolder.getCount()>
	//   30   55:aload_0         
	//   31   56:getfield        #37  <Field ArrayList zame>
	//   32   59:iload_1         
	//   33   60:invokevirtual   #104 <Method Object ArrayList.get(int)>
	//   34   63:checkcast       #39  <Class Integer>
	//   35   66:invokevirtual   #107 <Method int Integer.intValue()>
	//   36   69:isub            
	//   37   70:istore_2        
				else
	//*  38   71:goto            106
					j = ((Integer)zame.get(i + 1)).intValue() - ((Integer)zame.get(i)).intValue();
	//   39   74:aload_0         
	//   40   75:getfield        #37  <Field ArrayList zame>
	//   41   78:iload_1         
	//   42   79:iconst_1        
	//   43   80:iadd            
	//   44   81:invokevirtual   #104 <Method Object ArrayList.get(int)>
	//   45   84:checkcast       #39  <Class Integer>
	//   46   87:invokevirtual   #107 <Method int Integer.intValue()>
	//   47   90:aload_0         
	//   48   91:getfield        #37  <Field ArrayList zame>
	//   49   94:iload_1         
	//   50   95:invokevirtual   #104 <Method Object ArrayList.get(int)>
	//   51   98:checkcast       #39  <Class Integer>
	//   52  101:invokevirtual   #107 <Method int Integer.intValue()>
	//   53  104:isub            
	//   54  105:istore_2        
				if(j == 1)
	//*  55  106:iload_2         
	//*  56  107:iconst_1        
	//*  57  108:icmpne          158
				{
					i = zah(i);
	//   58  111:aload_0         
	//   59  112:iload_1         
	//   60  113:invokespecial   #118 <Method int zah(int)>
	//   61  116:istore_1        
					int l = mDataHolder.getWindowIndex(i);
	//   62  117:aload_0         
	//   63  118:getfield        #25  <Field DataHolder mDataHolder>
	//   64  121:iload_1         
	//   65  122:invokevirtual   #55  <Method int DataHolder.getWindowIndex(int)>
	//   66  125:istore          5
					String s = getChildDataMarkerColumn();
	//   67  127:aload_0         
	//   68  128:invokevirtual   #121 <Method String getChildDataMarkerColumn()>
	//   69  131:astore          6
					if(s != null && mDataHolder.getString(s, i, l) == null)
	//*  70  133:aload           6
	//*  71  135:ifnull          158
	//*  72  138:aload_0         
	//*  73  139:getfield        #25  <Field DataHolder mDataHolder>
	//*  74  142:aload           6
	//*  75  144:iload_1         
	//*  76  145:iload           5
	//*  77  147:invokevirtual   #59  <Method String DataHolder.getString(String, int, int)>
	//*  78  150:ifnonnull       158
						j = ((int) (flag));
	//   79  153:iload_3         
	//   80  154:istore_2        
				}
			}
	//*  81  155:goto            158
		return getEntry(k, j);
	//   82  158:aload_0         
	//   83  159:iload           4
	//   84  161:iload_2         
	//   85  162:invokevirtual   #125 <Method Object getEntry(int, int)>
	//   86  165:areturn         
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
