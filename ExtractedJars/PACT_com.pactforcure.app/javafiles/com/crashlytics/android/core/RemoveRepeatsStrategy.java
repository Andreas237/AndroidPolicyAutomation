// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.crashlytics.android.core:
//			StackTraceTrimmingStrategy

class RemoveRepeatsStrategy
	implements StackTraceTrimmingStrategy
{

	public RemoveRepeatsStrategy()
	{
		this(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #13  <Method void RemoveRepeatsStrategy(int)>
	//    3    5:return          
	}

	public RemoveRepeatsStrategy(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		maxRepetitions = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #18  <Field int maxRepetitions>
	//    5    9:return          
	}

	private static boolean isRepeatingSequence(StackTraceElement astacktraceelement[], int i, int j)
	{
		int l = j - i;
	//    0    0:iload_2         
	//    1    1:iload_1         
	//    2    2:isub            
	//    3    3:istore          4
		if(j + l <= astacktraceelement.length) goto _L2; else goto _L1
	//    4    5:iload_2         
	//    5    6:iload           4
	//    6    8:iadd            
	//    7    9:aload_0         
	//    8   10:arraylength     
	//    9   11:icmple          16
_L1:
		return false;
	//   10   14:iconst_0        
	//   11   15:ireturn         
_L2:
		int k = 0;
	//   12   16:iconst_0        
	//   13   17:istore_3        
label0:
		do
		{
label1:
			{
				if(k >= l)
					break label1;
	//   14   18:iload_3         
	//   15   19:iload           4
	//   16   21:icmpge          47
				if(!astacktraceelement[i + k].equals(((Object) (astacktraceelement[j + k]))))
					break label0;
	//   17   24:aload_0         
	//   18   25:iload_1         
	//   19   26:iload_3         
	//   20   27:iadd            
	//   21   28:aaload          
	//   22   29:aload_0         
	//   23   30:iload_2         
	//   24   31:iload_3         
	//   25   32:iadd            
	//   26   33:aaload          
	//   27   34:invokevirtual   #26  <Method boolean StackTraceElement.equals(Object)>
	//   28   37:ifeq            14
				k++;
	//   29   40:iload_3         
	//   30   41:iconst_1        
	//   31   42:iadd            
	//   32   43:istore_3        
			}
		} while(true);
	//   33   44:goto            18
		if(true) goto _L1; else goto _L3
_L3:
		return true;
	//   34   47:iconst_1        
	//   35   48:ireturn         
	}

	private static StackTraceElement[] trimRepeats(StackTraceElement astacktraceelement[], int i)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #30  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void HashMap()>
	//    3    7:astore          9
		StackTraceElement astacktraceelement1[] = new StackTraceElement[astacktraceelement.length];
	//    4    9:aload_0         
	//    5   10:arraylength     
	//    6   11:anewarray       StackTraceElement[]
	//    7   14:astore          8
		int i1 = 0;
	//    8   16:iconst_0        
	//    9   17:istore          5
		int l = 1;
	//   10   19:iconst_1        
	//   11   20:istore          4
		int j = 0;
	//   12   22:iconst_0        
	//   13   23:istore_2        
		while(j < astacktraceelement.length) 
	//*  14   24:iload_2         
	//*  15   25:aload_0         
	//*  16   26:arraylength     
	//*  17   27:icmpge          171
		{
			StackTraceElement stacktraceelement = astacktraceelement[j];
	//   18   30:aload_0         
	//   19   31:iload_2         
	//   20   32:aaload          
	//   21   33:astore          10
			Integer integer = (Integer)((Map) (hashmap)).get(((Object) (stacktraceelement)));
	//   22   35:aload           9
	//   23   37:aload           10
	//   24   39:invokeinterface #37  <Method Object Map.get(Object)>
	//   25   44:checkcast       #39  <Class Integer>
	//   26   47:astore          11
			int k;
			if(integer == null || !isRepeatingSequence(astacktraceelement, integer.intValue(), j))
	//*  27   49:aload           11
	//*  28   51:ifnull          67
	//*  29   54:aload_0         
	//*  30   55:aload           11
	//*  31   57:invokevirtual   #43  <Method int Integer.intValue()>
	//*  32   60:iload_2         
	//*  33   61:invokestatic    #45  <Method boolean isRepeatingSequence(StackTraceElement[], int, int)>
	//*  34   64:ifne            111
			{
				l = 1;
	//   35   67:iconst_1        
	//   36   68:istore          4
				astacktraceelement1[i1] = astacktraceelement[j];
	//   37   70:aload           8
	//   38   72:iload           5
	//   39   74:aload_0         
	//   40   75:iload_2         
	//   41   76:aaload          
	//   42   77:aastore         
				k = i1 + 1;
	//   43   78:iload           5
	//   44   80:iconst_1        
	//   45   81:iadd            
	//   46   82:istore_3        
				i1 = j;
	//   47   83:iload_2         
	//   48   84:istore          5
			} else
	//*  49   86:aload           9
	//*  50   88:aload           10
	//*  51   90:iload_2         
	//*  52   91:invokestatic    #49  <Method Integer Integer.valueOf(int)>
	//*  53   94:invokeinterface #53  <Method Object Map.put(Object, Object)>
	//*  54   99:pop             
	//*  55  100:iload           5
	//*  56  102:iconst_1        
	//*  57  103:iadd            
	//*  58  104:istore_2        
	//*  59  105:iload_3         
	//*  60  106:istore          5
	//*  61  108:goto            24
			{
				int k1 = j - integer.intValue();
	//   62  111:iload_2         
	//   63  112:aload           11
	//   64  114:invokevirtual   #43  <Method int Integer.intValue()>
	//   65  117:isub            
	//   66  118:istore          7
				int j1 = l;
	//   67  120:iload           4
	//   68  122:istore          6
				k = i1;
	//   69  124:iload           5
	//   70  126:istore_3        
				if(l < i)
	//*  71  127:iload           4
	//*  72  129:iload_1         
	//*  73  130:icmpge          156
				{
					System.arraycopy(((Object) (astacktraceelement)), j, ((Object) (astacktraceelement1)), i1, k1);
	//   74  133:aload_0         
	//   75  134:iload_2         
	//   76  135:aload           8
	//   77  137:iload           5
	//   78  139:iload           7
	//   79  141:invokestatic    #59  <Method void System.arraycopy(Object, int, Object, int, int)>
					k = i1 + k1;
	//   80  144:iload           5
	//   81  146:iload           7
	//   82  148:iadd            
	//   83  149:istore_3        
					j1 = l + 1;
	//   84  150:iload           4
	//   85  152:iconst_1        
	//   86  153:iadd            
	//   87  154:istore          6
				}
				i1 = j + (k1 - 1);
	//   88  156:iload_2         
	//   89  157:iload           7
	//   90  159:iconst_1        
	//   91  160:isub            
	//   92  161:iadd            
	//   93  162:istore          5
				l = j1;
	//   94  164:iload           6
	//   95  166:istore          4
			}
			((Map) (hashmap)).put(((Object) (stacktraceelement)), ((Object) (Integer.valueOf(j))));
			j = i1 + 1;
			i1 = k;
		}
	//*  96  168:goto            86
		astacktraceelement = new StackTraceElement[i1];
	//   97  171:iload           5
	//   98  173:anewarray       StackTraceElement[]
	//   99  176:astore_0        
		System.arraycopy(((Object) (astacktraceelement1)), 0, ((Object) (astacktraceelement)), 0, astacktraceelement.length);
	//  100  177:aload           8
	//  101  179:iconst_0        
	//  102  180:aload_0         
	//  103  181:iconst_0        
	//  104  182:aload_0         
	//  105  183:arraylength     
	//  106  184:invokestatic    #59  <Method void System.arraycopy(Object, int, Object, int, int)>
		return astacktraceelement;
	//  107  187:aload_0         
	//  108  188:areturn         
	}

	public StackTraceElement[] getTrimmedStackTrace(StackTraceElement astacktraceelement[])
	{
		StackTraceElement astacktraceelement1[] = trimRepeats(astacktraceelement, maxRepetitions);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #18  <Field int maxRepetitions>
	//    3    5:invokestatic    #63  <Method StackTraceElement[] trimRepeats(StackTraceElement[], int)>
	//    4    8:astore_2        
		if(astacktraceelement1.length < astacktraceelement.length)
	//*   5    9:aload_2         
	//*   6   10:arraylength     
	//*   7   11:aload_1         
	//*   8   12:arraylength     
	//*   9   13:icmpge          18
			return astacktraceelement1;
	//   10   16:aload_2         
	//   11   17:areturn         
		else
			return astacktraceelement;
	//   12   18:aload_1         
	//   13   19:areturn         
	}

	private final int maxRepetitions;
}
