// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver;

import java.util.Arrays;

// Referenced classes of package android.support.constraint.solver:
//			ArrayRow, ArrayLinkedVariables

public class SolverVariable
{
	public static final class Type extends Enum
	{

		public static Type valueOf(String s)
		{
			return (Type)Enum.valueOf(android/support/constraint/solver/SolverVariable$Type, s);
		//    0    0:ldc1            #2   <Class SolverVariable$Type>
		//    1    2:aload_0         
		//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class SolverVariable$Type>
		//    4    9:areturn         
		}

		public static Type[] values()
		{
			return (Type[])((Type []) ($VALUES)).clone();
		//    0    0:getstatic       #39  <Field SolverVariable$Type[] $VALUES>
		//    1    3:invokevirtual   #54  <Method Object _5B_Landroid.support.constraint.solver.SolverVariable$Type_3B_.clone()>
		//    2    6:checkcast       #50  <Class SolverVariable$Type[]>
		//    3    9:areturn         
		}

		private static final Type $VALUES[];
		public static final Type CONSTANT;
		public static final Type ERROR;
		public static final Type SLACK;
		public static final Type UNKNOWN;
		public static final Type UNRESTRICTED;

		static 
		{
			UNRESTRICTED = new Type("UNRESTRICTED", 0);
		//    0    0:new             #2   <Class SolverVariable$Type>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "UNRESTRICTED">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #23  <Method void SolverVariable$Type(String, int)>
		//    5   10:putstatic       #25  <Field SolverVariable$Type UNRESTRICTED>
			CONSTANT = new Type("CONSTANT", 1);
		//    6   13:new             #2   <Class SolverVariable$Type>
		//    7   16:dup             
		//    8   17:ldc1            #26  <String "CONSTANT">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #23  <Method void SolverVariable$Type(String, int)>
		//   11   23:putstatic       #28  <Field SolverVariable$Type CONSTANT>
			SLACK = new Type("SLACK", 2);
		//   12   26:new             #2   <Class SolverVariable$Type>
		//   13   29:dup             
		//   14   30:ldc1            #29  <String "SLACK">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #23  <Method void SolverVariable$Type(String, int)>
		//   17   36:putstatic       #31  <Field SolverVariable$Type SLACK>
			ERROR = new Type("ERROR", 3);
		//   18   39:new             #2   <Class SolverVariable$Type>
		//   19   42:dup             
		//   20   43:ldc1            #32  <String "ERROR">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #23  <Method void SolverVariable$Type(String, int)>
		//   23   49:putstatic       #34  <Field SolverVariable$Type ERROR>
			UNKNOWN = new Type("UNKNOWN", 4);
		//   24   52:new             #2   <Class SolverVariable$Type>
		//   25   55:dup             
		//   26   56:ldc1            #35  <String "UNKNOWN">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #23  <Method void SolverVariable$Type(String, int)>
		//   29   62:putstatic       #37  <Field SolverVariable$Type UNKNOWN>
			$VALUES = (new Type[] {
				UNRESTRICTED, CONSTANT, SLACK, ERROR, UNKNOWN
			});
		//   30   65:iconst_5        
		//   31   66:anewarray       Type[]
		//   32   69:dup             
		//   33   70:iconst_0        
		//   34   71:getstatic       #25  <Field SolverVariable$Type UNRESTRICTED>
		//   35   74:aastore         
		//   36   75:dup             
		//   37   76:iconst_1        
		//   38   77:getstatic       #28  <Field SolverVariable$Type CONSTANT>
		//   39   80:aastore         
		//   40   81:dup             
		//   41   82:iconst_2        
		//   42   83:getstatic       #31  <Field SolverVariable$Type SLACK>
		//   43   86:aastore         
		//   44   87:dup             
		//   45   88:iconst_3        
		//   46   89:getstatic       #34  <Field SolverVariable$Type ERROR>
		//   47   92:aastore         
		//   48   93:dup             
		//   49   94:iconst_4        
		//   50   95:getstatic       #37  <Field SolverVariable$Type UNKNOWN>
		//   51   98:aastore         
		//   52   99:putstatic       #39  <Field SolverVariable$Type[] $VALUES>
		//*  53  102:return          
		}

		private Type(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public SolverVariable(Type type, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Object()>
		id = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #58  <Field int id>
		definitionId = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #60  <Field int definitionId>
		strength = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #62  <Field int strength>
		strengthVector = new float[7];
	//   11   19:aload_0         
	//   12   20:bipush          7
	//   13   22:newarray        float[]
	//   14   24:putfield        #64  <Field float[] strengthVector>
		mClientEquations = new ArrayRow[8];
	//   15   27:aload_0         
	//   16   28:bipush          8
	//   17   30:anewarray       ArrayRow[]
	//   18   33:putfield        #68  <Field ArrayRow[] mClientEquations>
		mClientEquationsCount = 0;
	//   19   36:aload_0         
	//   20   37:iconst_0        
	//   21   38:putfield        #70  <Field int mClientEquationsCount>
		usageInRowCount = 0;
	//   22   41:aload_0         
	//   23   42:iconst_0        
	//   24   43:putfield        #72  <Field int usageInRowCount>
		mType = type;
	//   25   46:aload_0         
	//   26   47:aload_1         
	//   27   48:putfield        #74  <Field SolverVariable$Type mType>
	//   28   51:return          
	}

	public SolverVariable(String s, Type type)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Object()>
		id = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #58  <Field int id>
		definitionId = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #60  <Field int definitionId>
		strength = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #62  <Field int strength>
		strengthVector = new float[7];
	//   11   19:aload_0         
	//   12   20:bipush          7
	//   13   22:newarray        float[]
	//   14   24:putfield        #64  <Field float[] strengthVector>
		mClientEquations = new ArrayRow[8];
	//   15   27:aload_0         
	//   16   28:bipush          8
	//   17   30:anewarray       ArrayRow[]
	//   18   33:putfield        #68  <Field ArrayRow[] mClientEquations>
		mClientEquationsCount = 0;
	//   19   36:aload_0         
	//   20   37:iconst_0        
	//   21   38:putfield        #70  <Field int mClientEquationsCount>
		usageInRowCount = 0;
	//   22   41:aload_0         
	//   23   42:iconst_0        
	//   24   43:putfield        #72  <Field int usageInRowCount>
		mName = s;
	//   25   46:aload_0         
	//   26   47:aload_1         
	//   27   48:putfield        #77  <Field String mName>
		mType = type;
	//   28   51:aload_0         
	//   29   52:aload_2         
	//   30   53:putfield        #74  <Field SolverVariable$Type mType>
	//   31   56:return          
	}

	private static String getUniqueName(Type type, String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          31
		{
			type = ((Type) (new StringBuilder()));
	//    2    4:new             #81  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #82  <Method void StringBuilder()>
	//    5   11:astore_0        
			((StringBuilder) (type)).append(s);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//    9   17:pop             
			((StringBuilder) (type)).append(uniqueErrorId);
	//   10   18:aload_0         
	//   11   19:getstatic       #88  <Field int uniqueErrorId>
	//   12   22:invokevirtual   #91  <Method StringBuilder StringBuilder.append(int)>
	//   13   25:pop             
			return ((StringBuilder) (type)).toString();
	//   14   26:aload_0         
	//   15   27:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   16   30:areturn         
		}
		static class _cls1
		{

			static final int $SwitchMap$android$support$constraint$solver$SolverVariable$Type[];

			static 
			{
				$SwitchMap$android$support$constraint$solver$SolverVariable$Type = new int[Type.values().length];
			//    0    0:invokestatic    #18  <Method SolverVariable$Type[] SolverVariable$Type.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$SolverVariable$Type>
				try
				{
					$SwitchMap$android$support$constraint$solver$SolverVariable$Type[Type.UNRESTRICTED.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$SolverVariable$Type>
			//    5   12:getstatic       #24  <Field SolverVariable$Type SolverVariable$Type.UNRESTRICTED>
			//    6   15:invokevirtual   #28  <Method int SolverVariable$Type.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$SolverVariable$Type>
			//*  10   23:getstatic       #31  <Field SolverVariable$Type SolverVariable$Type.CONSTANT>
			//*  11   26:invokevirtual   #28  <Method int SolverVariable$Type.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$SolverVariable$Type>
			//*  15   34:getstatic       #34  <Field SolverVariable$Type SolverVariable$Type.SLACK>
			//*  16   37:invokevirtual   #28  <Method int SolverVariable$Type.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$SolverVariable$Type>
			//*  20   45:getstatic       #37  <Field SolverVariable$Type SolverVariable$Type.ERROR>
			//*  21   48:invokevirtual   #28  <Method int SolverVariable$Type.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$SolverVariable$Type>
			//*  25   56:getstatic       #40  <Field SolverVariable$Type SolverVariable$Type.UNKNOWN>
			//*  26   59:invokevirtual   #28  <Method int SolverVariable$Type.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   30   65:astore_0        
				try
				{
					$SwitchMap$android$support$constraint$solver$SolverVariable$Type[Type.CONSTANT.ordinal()] = 2;
				}
			//*  31   66:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   32   69:astore_0        
				try
				{
					$SwitchMap$android$support$constraint$solver$SolverVariable$Type[Type.SLACK.ordinal()] = 3;
				}
			//*  33   70:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   34   73:astore_0        
				try
				{
					$SwitchMap$android$support$constraint$solver$SolverVariable$Type[Type.ERROR.ordinal()] = 4;
				}
			//*  35   74:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   36   77:astore_0        
				try
				{
					$SwitchMap$android$support$constraint$solver$SolverVariable$Type[Type.UNKNOWN.ordinal()] = 5;
				}
			//*  37   78:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   38   81:astore_0        
			//*  39   82:return          
			}
		}

		switch(_cls1..SwitchMap.android.support.constraint.solver.SolverVariable.Type[type.ordinal()])
	//*  17   31:getstatic       #99  <Field int[] SolverVariable$1.$SwitchMap$android$support$constraint$solver$SolverVariable$Type>
	//*  18   34:aload_0         
	//*  19   35:invokevirtual   #103 <Method int SolverVariable$Type.ordinal()>
	//*  20   38:iaload          
		{
	//*  21   39:tableswitch     1 5: default 72
	//	               1 228
	//	               2 192
	//	               3 156
	//	               4 120
	//	               5 84
		default:
			throw new AssertionError(((Object) (type.name())));
	//   22   72:new             #105 <Class AssertionError>
	//   23   75:dup             
	//   24   76:aload_0         
	//   25   77:invokevirtual   #108 <Method String SolverVariable$Type.name()>
	//   26   80:invokespecial   #111 <Method void AssertionError(Object)>
	//   27   83:athrow          

		case 5: // '\005'
			type = ((Type) (new StringBuilder()));
	//   28   84:new             #81  <Class StringBuilder>
	//   29   87:dup             
	//   30   88:invokespecial   #82  <Method void StringBuilder()>
	//   31   91:astore_0        
			((StringBuilder) (type)).append("V");
	//   32   92:aload_0         
	//   33   93:ldc1            #113 <String "V">
	//   34   95:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   35   98:pop             
			int i = uniqueId + 1;
	//   36   99:getstatic       #115 <Field int uniqueId>
	//   37  102:iconst_1        
	//   38  103:iadd            
	//   39  104:istore_2        
			uniqueId = i;
	//   40  105:iload_2         
	//   41  106:putstatic       #115 <Field int uniqueId>
			((StringBuilder) (type)).append(i);
	//   42  109:aload_0         
	//   43  110:iload_2         
	//   44  111:invokevirtual   #91  <Method StringBuilder StringBuilder.append(int)>
	//   45  114:pop             
			return ((StringBuilder) (type)).toString();
	//   46  115:aload_0         
	//   47  116:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   48  119:areturn         

		case 4: // '\004'
			type = ((Type) (new StringBuilder()));
	//   49  120:new             #81  <Class StringBuilder>
	//   50  123:dup             
	//   51  124:invokespecial   #82  <Method void StringBuilder()>
	//   52  127:astore_0        
			((StringBuilder) (type)).append("e");
	//   53  128:aload_0         
	//   54  129:ldc1            #117 <String "e">
	//   55  131:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   56  134:pop             
			int j = uniqueErrorId + 1;
	//   57  135:getstatic       #88  <Field int uniqueErrorId>
	//   58  138:iconst_1        
	//   59  139:iadd            
	//   60  140:istore_2        
			uniqueErrorId = j;
	//   61  141:iload_2         
	//   62  142:putstatic       #88  <Field int uniqueErrorId>
			((StringBuilder) (type)).append(j);
	//   63  145:aload_0         
	//   64  146:iload_2         
	//   65  147:invokevirtual   #91  <Method StringBuilder StringBuilder.append(int)>
	//   66  150:pop             
			return ((StringBuilder) (type)).toString();
	//   67  151:aload_0         
	//   68  152:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   69  155:areturn         

		case 3: // '\003'
			type = ((Type) (new StringBuilder()));
	//   70  156:new             #81  <Class StringBuilder>
	//   71  159:dup             
	//   72  160:invokespecial   #82  <Method void StringBuilder()>
	//   73  163:astore_0        
			((StringBuilder) (type)).append("S");
	//   74  164:aload_0         
	//   75  165:ldc1            #119 <String "S">
	//   76  167:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   77  170:pop             
			int k = uniqueSlackId + 1;
	//   78  171:getstatic       #121 <Field int uniqueSlackId>
	//   79  174:iconst_1        
	//   80  175:iadd            
	//   81  176:istore_2        
			uniqueSlackId = k;
	//   82  177:iload_2         
	//   83  178:putstatic       #121 <Field int uniqueSlackId>
			((StringBuilder) (type)).append(k);
	//   84  181:aload_0         
	//   85  182:iload_2         
	//   86  183:invokevirtual   #91  <Method StringBuilder StringBuilder.append(int)>
	//   87  186:pop             
			return ((StringBuilder) (type)).toString();
	//   88  187:aload_0         
	//   89  188:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   90  191:areturn         

		case 2: // '\002'
			type = ((Type) (new StringBuilder()));
	//   91  192:new             #81  <Class StringBuilder>
	//   92  195:dup             
	//   93  196:invokespecial   #82  <Method void StringBuilder()>
	//   94  199:astore_0        
			((StringBuilder) (type)).append("C");
	//   95  200:aload_0         
	//   96  201:ldc1            #123 <String "C">
	//   97  203:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   98  206:pop             
			int l = uniqueConstantId + 1;
	//   99  207:getstatic       #125 <Field int uniqueConstantId>
	//  100  210:iconst_1        
	//  101  211:iadd            
	//  102  212:istore_2        
			uniqueConstantId = l;
	//  103  213:iload_2         
	//  104  214:putstatic       #125 <Field int uniqueConstantId>
			((StringBuilder) (type)).append(l);
	//  105  217:aload_0         
	//  106  218:iload_2         
	//  107  219:invokevirtual   #91  <Method StringBuilder StringBuilder.append(int)>
	//  108  222:pop             
			return ((StringBuilder) (type)).toString();
	//  109  223:aload_0         
	//  110  224:invokevirtual   #95  <Method String StringBuilder.toString()>
	//  111  227:areturn         

		case 1: // '\001'
			type = ((Type) (new StringBuilder()));
	//  112  228:new             #81  <Class StringBuilder>
	//  113  231:dup             
	//  114  232:invokespecial   #82  <Method void StringBuilder()>
	//  115  235:astore_0        
			((StringBuilder) (type)).append("U");
	//  116  236:aload_0         
	//  117  237:ldc1            #127 <String "U">
	//  118  239:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//  119  242:pop             
			int i1 = uniqueUnrestrictedId + 1;
	//  120  243:getstatic       #129 <Field int uniqueUnrestrictedId>
	//  121  246:iconst_1        
	//  122  247:iadd            
	//  123  248:istore_2        
			uniqueUnrestrictedId = i1;
	//  124  249:iload_2         
	//  125  250:putstatic       #129 <Field int uniqueUnrestrictedId>
			((StringBuilder) (type)).append(i1);
	//  126  253:aload_0         
	//  127  254:iload_2         
	//  128  255:invokevirtual   #91  <Method StringBuilder StringBuilder.append(int)>
	//  129  258:pop             
			return ((StringBuilder) (type)).toString();
	//  130  259:aload_0         
	//  131  260:invokevirtual   #95  <Method String StringBuilder.toString()>
	//  132  263:areturn         
		}
	}

	static void increaseErrorId()
	{
		uniqueErrorId++;
	//    0    0:getstatic       #88  <Field int uniqueErrorId>
	//    1    3:iconst_1        
	//    2    4:iadd            
	//    3    5:putstatic       #88  <Field int uniqueErrorId>
	//    4    8:return          
	}

	public final void addToRow(ArrayRow arrayrow)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int j;
		do
		{
			j = mClientEquationsCount;
	//    2    2:aload_0         
	//    3    3:getfield        #70  <Field int mClientEquationsCount>
	//    4    6:istore_3        
			if(i >= j)
				break;
	//    5    7:iload_2         
	//    6    8:iload_3         
	//    7    9:icmpge          30
			if(mClientEquations[i] == arrayrow)
	//*   8   12:aload_0         
	//*   9   13:getfield        #68  <Field ArrayRow[] mClientEquations>
	//*  10   16:iload_2         
	//*  11   17:aaload          
	//*  12   18:aload_1         
	//*  13   19:if_acmpne       23
				return;
	//   14   22:return          
			i++;
	//   15   23:iload_2         
	//   16   24:iconst_1        
	//   17   25:iadd            
	//   18   26:istore_2        
		} while(true);
	//   19   27:goto            2
		ArrayRow aarrayrow[] = mClientEquations;
	//   20   30:aload_0         
	//   21   31:getfield        #68  <Field ArrayRow[] mClientEquations>
	//   22   34:astore          4
		if(j >= aarrayrow.length)
	//*  23   36:iload_3         
	//*  24   37:aload           4
	//*  25   39:arraylength     
	//*  26   40:icmplt          60
			mClientEquations = (ArrayRow[])Arrays.copyOf(((Object []) (aarrayrow)), aarrayrow.length * 2);
	//   27   43:aload_0         
	//   28   44:aload           4
	//   29   46:aload           4
	//   30   48:arraylength     
	//   31   49:iconst_2        
	//   32   50:imul            
	//   33   51:invokestatic    #138 <Method Object[] Arrays.copyOf(Object[], int)>
	//   34   54:checkcast       #139 <Class ArrayRow[]>
	//   35   57:putfield        #68  <Field ArrayRow[] mClientEquations>
		aarrayrow = mClientEquations;
	//   36   60:aload_0         
	//   37   61:getfield        #68  <Field ArrayRow[] mClientEquations>
	//   38   64:astore          4
		i = mClientEquationsCount;
	//   39   66:aload_0         
	//   40   67:getfield        #70  <Field int mClientEquationsCount>
	//   41   70:istore_2        
		aarrayrow[i] = arrayrow;
	//   42   71:aload           4
	//   43   73:iload_2         
	//   44   74:aload_1         
	//   45   75:aastore         
		mClientEquationsCount = i + 1;
	//   46   76:aload_0         
	//   47   77:iload_2         
	//   48   78:iconst_1        
	//   49   79:iadd            
	//   50   80:putfield        #70  <Field int mClientEquationsCount>
	//   51   83:return          
	}

	void clearStrengths()
	{
		for(int i = 0; i < 7; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:bipush          7
	//*   4    5:icmpge          22
			strengthVector[i] = 0.0F;
	//    5    8:aload_0         
	//    6    9:getfield        #64  <Field float[] strengthVector>
	//    7   12:iload_1         
	//    8   13:fconst_0        
	//    9   14:fastore         

	//   10   15:iload_1         
	//   11   16:iconst_1        
	//   12   17:iadd            
	//   13   18:istore_1        
	//*  14   19:goto            2
	//   15   22:return          
	}

	public String getName()
	{
		return mName;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field String mName>
	//    2    4:areturn         
	}

	public final void removeFromRow(ArrayRow arrayrow)
	{
		int k = mClientEquationsCount;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field int mClientEquationsCount>
	//    2    4:istore          4
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		for(int i = 0; i < k; i++)
	//*   5    8:iconst_0        
	//*   6    9:istore_2        
	//*   7   10:iload_2         
	//*   8   11:iload           4
	//*   9   13:icmpge          81
			if(mClientEquations[i] == arrayrow)
	//*  10   16:aload_0         
	//*  11   17:getfield        #68  <Field ArrayRow[] mClientEquations>
	//*  12   20:iload_2         
	//*  13   21:aaload          
	//*  14   22:aload_1         
	//*  15   23:if_acmpne       74
			{
				for(; j < k - i - 1; j++)
	//*  16   26:iload_3         
	//*  17   27:iload           4
	//*  18   29:iload_2         
	//*  19   30:isub            
	//*  20   31:iconst_1        
	//*  21   32:isub            
	//*  22   33:icmpge          63
				{
					arrayrow = ((ArrayRow) (mClientEquations));
	//   23   36:aload_0         
	//   24   37:getfield        #68  <Field ArrayRow[] mClientEquations>
	//   25   40:astore_1        
					int l = i + j;
	//   26   41:iload_2         
	//   27   42:iload_3         
	//   28   43:iadd            
	//   29   44:istore          5
					arrayrow[l] = arrayrow[l + 1];
	//   30   46:aload_1         
	//   31   47:iload           5
	//   32   49:aload_1         
	//   33   50:iload           5
	//   34   52:iconst_1        
	//   35   53:iadd            
	//   36   54:aaload          
	//   37   55:aastore         
				}

	//   38   56:iload_3         
	//   39   57:iconst_1        
	//   40   58:iadd            
	//   41   59:istore_3        
	//*  42   60:goto            26
				mClientEquationsCount = mClientEquationsCount - 1;
	//   43   63:aload_0         
	//   44   64:aload_0         
	//   45   65:getfield        #70  <Field int mClientEquationsCount>
	//   46   68:iconst_1        
	//   47   69:isub            
	//   48   70:putfield        #70  <Field int mClientEquationsCount>
				return;
	//   49   73:return          
			}

	//   50   74:iload_2         
	//   51   75:iconst_1        
	//   52   76:iadd            
	//   53   77:istore_2        
	//*  54   78:goto            10
	//   55   81:return          
	}

	public void reset()
	{
		mName = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #77  <Field String mName>
		mType = Type.UNKNOWN;
	//    3    5:aload_0         
	//    4    6:getstatic       #146 <Field SolverVariable$Type SolverVariable$Type.UNKNOWN>
	//    5    9:putfield        #74  <Field SolverVariable$Type mType>
		strength = 0;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #62  <Field int strength>
		id = -1;
	//    9   17:aload_0         
	//   10   18:iconst_m1       
	//   11   19:putfield        #58  <Field int id>
		definitionId = -1;
	//   12   22:aload_0         
	//   13   23:iconst_m1       
	//   14   24:putfield        #60  <Field int definitionId>
		computedValue = 0.0F;
	//   15   27:aload_0         
	//   16   28:fconst_0        
	//   17   29:putfield        #148 <Field float computedValue>
		mClientEquationsCount = 0;
	//   18   32:aload_0         
	//   19   33:iconst_0        
	//   20   34:putfield        #70  <Field int mClientEquationsCount>
		usageInRowCount = 0;
	//   21   37:aload_0         
	//   22   38:iconst_0        
	//   23   39:putfield        #72  <Field int usageInRowCount>
	//   24   42:return          
	}

	public void setName(String s)
	{
		mName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #77  <Field String mName>
	//    3    5:return          
	}

	public void setType(Type type, String s)
	{
		mType = type;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #74  <Field SolverVariable$Type mType>
	//    3    5:return          
	}

	String strengthsToString()
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #81  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #82  <Method void StringBuilder()>
	//    3    7:astore          4
		((StringBuilder) (obj)).append(((Object) (this)));
	//    4    9:aload           4
	//    5   11:aload_0         
	//    6   12:invokevirtual   #155 <Method StringBuilder StringBuilder.append(Object)>
	//    7   15:pop             
		((StringBuilder) (obj)).append("[");
	//    8   16:aload           4
	//    9   18:ldc1            #157 <String "[">
	//   10   20:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   12   24:aload           4
	//   13   26:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   14   29:astore          4
		boolean flag = true;
	//   15   31:iconst_1        
	//   16   32:istore_3        
		int j = 0;
	//   17   33:iconst_0        
	//   18   34:istore_2        
		int i = j;
	//   19   35:iload_2         
	//   20   36:istore_1        
		for(; j < strengthVector.length; j++)
	//*  21   37:iload_2         
	//*  22   38:aload_0         
	//*  23   39:getfield        #64  <Field float[] strengthVector>
	//*  24   42:arraylength     
	//*  25   43:icmpge          211
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   26   46:new             #81  <Class StringBuilder>
	//   27   49:dup             
	//   28   50:invokespecial   #82  <Method void StringBuilder()>
	//   29   53:astore          5
			stringbuilder.append(((String) (obj)));
	//   30   55:aload           5
	//   31   57:aload           4
	//   32   59:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   33   62:pop             
			stringbuilder.append(strengthVector[j]);
	//   34   63:aload           5
	//   35   65:aload_0         
	//   36   66:getfield        #64  <Field float[] strengthVector>
	//   37   69:iload_2         
	//   38   70:faload          
	//   39   71:invokevirtual   #160 <Method StringBuilder StringBuilder.append(float)>
	//   40   74:pop             
			obj = ((Object) (stringbuilder.toString()));
	//   41   75:aload           5
	//   42   77:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   43   80:astore          4
			float af[] = strengthVector;
	//   44   82:aload_0         
	//   45   83:getfield        #64  <Field float[] strengthVector>
	//   46   86:astore          5
			if(af[j] > 0.0F)
	//*  47   88:aload           5
	//*  48   90:iload_2         
	//*  49   91:faload          
	//*  50   92:fconst_0        
	//*  51   93:fcmpl           
	//*  52   94:ifle            102
				i = 0;
	//   53   97:iconst_0        
	//   54   98:istore_1        
			else
	//*  55   99:goto            113
			if(af[j] < 0.0F)
	//*  56  102:aload           5
	//*  57  104:iload_2         
	//*  58  105:faload          
	//*  59  106:fconst_0        
	//*  60  107:fcmpg           
	//*  61  108:ifge            113
				i = 1;
	//   62  111:iconst_1        
	//   63  112:istore_1        
			if(strengthVector[j] != 0.0F)
	//*  64  113:aload_0         
	//*  65  114:getfield        #64  <Field float[] strengthVector>
	//*  66  117:iload_2         
	//*  67  118:faload          
	//*  68  119:fconst_0        
	//*  69  120:fcmpl           
	//*  70  121:ifeq            126
				flag = false;
	//   71  124:iconst_0        
	//   72  125:istore_3        
			if(j < strengthVector.length - 1)
	//*  73  126:iload_2         
	//*  74  127:aload_0         
	//*  75  128:getfield        #64  <Field float[] strengthVector>
	//*  76  131:arraylength     
	//*  77  132:iconst_1        
	//*  78  133:isub            
	//*  79  134:icmpge          172
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   80  137:new             #81  <Class StringBuilder>
	//   81  140:dup             
	//   82  141:invokespecial   #82  <Method void StringBuilder()>
	//   83  144:astore          5
				stringbuilder1.append(((String) (obj)));
	//   84  146:aload           5
	//   85  148:aload           4
	//   86  150:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   87  153:pop             
				stringbuilder1.append(", ");
	//   88  154:aload           5
	//   89  156:ldc1            #162 <String ", ">
	//   90  158:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   91  161:pop             
				obj = ((Object) (stringbuilder1.toString()));
	//   92  162:aload           5
	//   93  164:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   94  167:astore          4
			} else
	//*  95  169:goto            204
			{
				StringBuilder stringbuilder2 = new StringBuilder();
	//   96  172:new             #81  <Class StringBuilder>
	//   97  175:dup             
	//   98  176:invokespecial   #82  <Method void StringBuilder()>
	//   99  179:astore          5
				stringbuilder2.append(((String) (obj)));
	//  100  181:aload           5
	//  101  183:aload           4
	//  102  185:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//  103  188:pop             
				stringbuilder2.append("] ");
	//  104  189:aload           5
	//  105  191:ldc1            #164 <String "] ">
	//  106  193:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//  107  196:pop             
				obj = ((Object) (stringbuilder2.toString()));
	//  108  197:aload           5
	//  109  199:invokevirtual   #95  <Method String StringBuilder.toString()>
	//  110  202:astore          4
			}
		}

	//  111  204:iload_2         
	//  112  205:iconst_1        
	//  113  206:iadd            
	//  114  207:istore_2        
	//* 115  208:goto            37
		Object obj1 = obj;
	//  116  211:aload           4
	//  117  213:astore          5
		if(i != 0)
	//* 118  215:iload_1         
	//* 119  216:ifeq            251
		{
			obj1 = ((Object) (new StringBuilder()));
	//  120  219:new             #81  <Class StringBuilder>
	//  121  222:dup             
	//  122  223:invokespecial   #82  <Method void StringBuilder()>
	//  123  226:astore          5
			((StringBuilder) (obj1)).append(((String) (obj)));
	//  124  228:aload           5
	//  125  230:aload           4
	//  126  232:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//  127  235:pop             
			((StringBuilder) (obj1)).append(" (-)");
	//  128  236:aload           5
	//  129  238:ldc1            #166 <String " (-)">
	//  130  240:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//  131  243:pop             
			obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//  132  244:aload           5
	//  133  246:invokevirtual   #95  <Method String StringBuilder.toString()>
	//  134  249:astore          5
		}
		obj = obj1;
	//  135  251:aload           5
	//  136  253:astore          4
		if(flag)
	//* 137  255:iload_3         
	//* 138  256:ifeq            291
		{
			obj = ((Object) (new StringBuilder()));
	//  139  259:new             #81  <Class StringBuilder>
	//  140  262:dup             
	//  141  263:invokespecial   #82  <Method void StringBuilder()>
	//  142  266:astore          4
			((StringBuilder) (obj)).append(((String) (obj1)));
	//  143  268:aload           4
	//  144  270:aload           5
	//  145  272:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//  146  275:pop             
			((StringBuilder) (obj)).append(" (*)");
	//  147  276:aload           4
	//  148  278:ldc1            #168 <String " (*)">
	//  149  280:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//  150  283:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//  151  284:aload           4
	//  152  286:invokevirtual   #95  <Method String StringBuilder.toString()>
	//  153  289:astore          4
		}
		return ((String) (obj));
	//  154  291:aload           4
	//  155  293:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #81  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #82  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("");
	//    4    8:aload_1         
	//    5    9:ldc1            #170 <String "">
	//    6   11:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(mName);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #77  <Field String mName>
	//   11   20:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		return stringbuilder.toString();
	//   13   24:aload_1         
	//   14   25:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   15   28:areturn         
	}

	public final void updateReferencesWithNewDefinition(ArrayRow arrayrow)
	{
		int j = mClientEquationsCount;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field int mClientEquationsCount>
	//    2    4:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          39
			mClientEquations[i].variables.updateFromRow(mClientEquations[i], arrayrow, false);
	//    8   12:aload_0         
	//    9   13:getfield        #68  <Field ArrayRow[] mClientEquations>
	//   10   16:iload_2         
	//   11   17:aaload          
	//   12   18:getfield        #175 <Field ArrayLinkedVariables ArrayRow.variables>
	//   13   21:aload_0         
	//   14   22:getfield        #68  <Field ArrayRow[] mClientEquations>
	//   15   25:iload_2         
	//   16   26:aaload          
	//   17   27:aload_1         
	//   18   28:iconst_0        
	//   19   29:invokevirtual   #181 <Method void ArrayLinkedVariables.updateFromRow(ArrayRow, ArrayRow, boolean)>

	//   20   32:iload_2         
	//   21   33:iconst_1        
	//   22   34:iadd            
	//   23   35:istore_2        
	//*  24   36:goto            7
		mClientEquationsCount = 0;
	//   25   39:aload_0         
	//   26   40:iconst_0        
	//   27   41:putfield        #70  <Field int mClientEquationsCount>
	//   28   44:return          
	}

	private static final boolean INTERNAL_DEBUG = false;
	static final int MAX_STRENGTH = 7;
	public static final int STRENGTH_BARRIER = 7;
	public static final int STRENGTH_EQUALITY = 5;
	public static final int STRENGTH_FIXED = 6;
	public static final int STRENGTH_HIGH = 3;
	public static final int STRENGTH_HIGHEST = 4;
	public static final int STRENGTH_LOW = 1;
	public static final int STRENGTH_MEDIUM = 2;
	public static final int STRENGTH_NONE = 0;
	private static int uniqueConstantId = 1;
	private static int uniqueErrorId = 1;
	private static int uniqueId = 1;
	private static int uniqueSlackId = 1;
	private static int uniqueUnrestrictedId = 1;
	public float computedValue;
	int definitionId;
	public int id;
	ArrayRow mClientEquations[];
	int mClientEquationsCount;
	private String mName;
	Type mType;
	public int strength;
	float strengthVector[];
	public int usageInRowCount;

	static 
	{
	//    0    0:return          
	}
}
