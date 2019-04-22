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
		if(j + l > astacktraceelement.length)
	//*   4    5:iload_2         
	//*   5    6:iload           4
	//*   6    8:iadd            
	//*   7    9:aload_0         
	//*   8   10:arraylength     
	//*   9   11:icmple          16
			return false;
	//   10   14:iconst_0        
	//   11   15:ireturn         
		for(int k = 0; k < l; k++)
	//*  12   16:iconst_0        
	//*  13   17:istore_3        
	//*  14   18:iload_3         
	//*  15   19:iload           4
	//*  16   21:icmpge          49
			if(!astacktraceelement[i + k].equals(((Object) (astacktraceelement[j + k]))))
	//*  17   24:aload_0         
	//*  18   25:iload_1         
	//*  19   26:iload_3         
	//*  20   27:iadd            
	//*  21   28:aaload          
	//*  22   29:aload_0         
	//*  23   30:iload_2         
	//*  24   31:iload_3         
	//*  25   32:iadd            
	//*  26   33:aaload          
	//*  27   34:invokevirtual   #26  <Method boolean StackTraceElement.equals(Object)>
	//*  28   37:ifne            42
				return false;
	//   29   40:iconst_0        
	//   30   41:ireturn         

	//   31   42:iload_3         
	//   32   43:iconst_1        
	//   33   44:iadd            
	//   34   45:istore_3        
	//*  35   46:goto            18
		return true;
	//   36   49:iconst_1        
	//   37   50:ireturn         
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
		int j = 0;
	//    8   16:iconst_0        
	//    9   17:istore_2        
		int i1 = 0;
	//   10   18:iconst_0        
	//   11   19:istore          5
		int k = 1;
	//   12   21:iconst_1        
	//   13   22:istore_3        
		int l;
		for(; j < astacktraceelement.length; j = l + 1)
	//*  14   23:iload_2         
	//*  15   24:aload_0         
	//*  16   25:arraylength     
	//*  17   26:icmpge          176
		{
			StackTraceElement stacktraceelement = astacktraceelement[j];
	//   18   29:aload_0         
	//   19   30:iload_2         
	//   20   31:aaload          
	//   21   32:astore          10
			Integer integer = (Integer)((Map) (hashmap)).get(((Object) (stacktraceelement)));
	//   22   34:aload           9
	//   23   36:aload           10
	//   24   38:invokeinterface #37  <Method Object Map.get(Object)>
	//   25   43:checkcast       #39  <Class Integer>
	//   26   46:astore          11
			if(integer != null && isRepeatingSequence(astacktraceelement, integer.intValue(), j))
	//*  27   48:aload           11
	//*  28   50:ifnull          135
	//*  29   53:aload_0         
	//*  30   54:aload           11
	//*  31   56:invokevirtual   #43  <Method int Integer.intValue()>
	//*  32   59:iload_2         
	//*  33   60:invokestatic    #45  <Method boolean isRepeatingSequence(StackTraceElement[], int, int)>
	//*  34   63:ifne            69
	//*  35   66:goto            135
			{
				int k1 = j - integer.intValue();
	//   36   69:iload_2         
	//   37   70:aload           11
	//   38   72:invokevirtual   #43  <Method int Integer.intValue()>
	//   39   75:isub            
	//   40   76:istore          7
				int j1 = i1;
	//   41   78:iload           5
	//   42   80:istore          6
				l = k;
	//   43   82:iload_3         
	//   44   83:istore          4
				if(k < i)
	//*  45   85:iload_3         
	//*  46   86:iload_1         
	//*  47   87:icmpge          113
				{
					System.arraycopy(((Object) (astacktraceelement)), j, ((Object) (astacktraceelement1)), i1, k1);
	//   48   90:aload_0         
	//   49   91:iload_2         
	//   50   92:aload           8
	//   51   94:iload           5
	//   52   96:iload           7
	//   53   98:invokestatic    #51  <Method void System.arraycopy(Object, int, Object, int, int)>
					j1 = i1 + k1;
	//   54  101:iload           5
	//   55  103:iload           7
	//   56  105:iadd            
	//   57  106:istore          6
					l = k + 1;
	//   58  108:iload_3         
	//   59  109:iconst_1        
	//   60  110:iadd            
	//   61  111:istore          4
				}
				k1 = (k1 - 1) + j;
	//   62  113:iload           7
	//   63  115:iconst_1        
	//   64  116:isub            
	//   65  117:iload_2         
	//   66  118:iadd            
	//   67  119:istore          7
				i1 = j1;
	//   68  121:iload           6
	//   69  123:istore          5
				k = l;
	//   70  125:iload           4
	//   71  127:istore_3        
				l = k1;
	//   72  128:iload           7
	//   73  130:istore          4
			} else
	//*  74  132:goto            154
			{
				astacktraceelement1[i1] = astacktraceelement[j];
	//   75  135:aload           8
	//   76  137:iload           5
	//   77  139:aload_0         
	//   78  140:iload_2         
	//   79  141:aaload          
	//   80  142:aastore         
				i1++;
	//   81  143:iload           5
	//   82  145:iconst_1        
	//   83  146:iadd            
	//   84  147:istore          5
				l = j;
	//   85  149:iload_2         
	//   86  150:istore          4
				k = 1;
	//   87  152:iconst_1        
	//   88  153:istore_3        
			}
			((Map) (hashmap)).put(((Object) (stacktraceelement)), ((Object) (Integer.valueOf(j))));
	//   89  154:aload           9
	//   90  156:aload           10
	//   91  158:iload_2         
	//   92  159:invokestatic    #55  <Method Integer Integer.valueOf(int)>
	//   93  162:invokeinterface #59  <Method Object Map.put(Object, Object)>
	//   94  167:pop             
		}

	//   95  168:iload           4
	//   96  170:iconst_1        
	//   97  171:iadd            
	//   98  172:istore_2        
	//*  99  173:goto            23
		astacktraceelement = new StackTraceElement[i1];
	//  100  176:iload           5
	//  101  178:anewarray       StackTraceElement[]
	//  102  181:astore_0        
		System.arraycopy(((Object) (astacktraceelement1)), 0, ((Object) (astacktraceelement)), 0, astacktraceelement.length);
	//  103  182:aload           8
	//  104  184:iconst_0        
	//  105  185:aload_0         
	//  106  186:iconst_0        
	//  107  187:aload_0         
	//  108  188:arraylength     
	//  109  189:invokestatic    #51  <Method void System.arraycopy(Object, int, Object, int, int)>
		return astacktraceelement;
	//  110  192:aload_0         
	//  111  193:areturn         
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
