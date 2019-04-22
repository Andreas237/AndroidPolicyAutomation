// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver;

import android.support.constraint.solver.widgets.ConstraintAnchor;
import android.support.constraint.solver.widgets.ConstraintWidget;
import java.util.Arrays;
import java.util.HashMap;

// Referenced classes of package android.support.constraint.solver:
//			SolverVariable, ArrayRow, Cache, GoalRow, 
//			Metrics, ArrayLinkedVariables

public class LinearSystem
{
	static interface Row
	{

		public abstract void addError(SolverVariable solvervariable);

		public abstract void clear();

		public abstract SolverVariable getKey();

		public abstract SolverVariable getPivotCandidate(LinearSystem linearsystem, boolean aflag[]);

		public abstract void initFromRow(Row row);

		public abstract boolean isEmpty();
	}


	public LinearSystem()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		mVariablesID = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #44  <Field int mVariablesID>
		mVariables = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #46  <Field HashMap mVariables>
		TABLE_SIZE = 32;
	//    8   14:aload_0         
	//    9   15:bipush          32
	//   10   17:putfield        #48  <Field int TABLE_SIZE>
		int i = TABLE_SIZE;
	//   11   20:aload_0         
	//   12   21:getfield        #48  <Field int TABLE_SIZE>
	//   13   24:istore_1        
		mMaxColumns = i;
	//   14   25:aload_0         
	//   15   26:iload_1         
	//   16   27:putfield        #50  <Field int mMaxColumns>
		mRows = null;
	//   17   30:aload_0         
	//   18   31:aconst_null     
	//   19   32:putfield        #52  <Field ArrayRow[] mRows>
		graphOptimizer = false;
	//   20   35:aload_0         
	//   21   36:iconst_0        
	//   22   37:putfield        #54  <Field boolean graphOptimizer>
		mAlreadyTestedCandidates = new boolean[i];
	//   23   40:aload_0         
	//   24   41:iload_1         
	//   25   42:newarray        boolean[]
	//   26   44:putfield        #56  <Field boolean[] mAlreadyTestedCandidates>
		mNumColumns = 1;
	//   27   47:aload_0         
	//   28   48:iconst_1        
	//   29   49:putfield        #58  <Field int mNumColumns>
		mNumRows = 0;
	//   30   52:aload_0         
	//   31   53:iconst_0        
	//   32   54:putfield        #60  <Field int mNumRows>
		mMaxRows = i;
	//   33   57:aload_0         
	//   34   58:iload_1         
	//   35   59:putfield        #62  <Field int mMaxRows>
		mPoolVariables = new SolverVariable[POOL_SIZE];
	//   36   62:aload_0         
	//   37   63:getstatic       #64  <Field int POOL_SIZE>
	//   38   66:anewarray       SolverVariable[]
	//   39   69:putfield        #68  <Field SolverVariable[] mPoolVariables>
		mPoolVariablesCount = 0;
	//   40   72:aload_0         
	//   41   73:iconst_0        
	//   42   74:putfield        #70  <Field int mPoolVariablesCount>
		tempClientsCopy = new ArrayRow[i];
	//   43   77:aload_0         
	//   44   78:iload_1         
	//   45   79:anewarray       ArrayRow[]
	//   46   82:putfield        #74  <Field ArrayRow[] tempClientsCopy>
		mRows = new ArrayRow[i];
	//   47   85:aload_0         
	//   48   86:iload_1         
	//   49   87:anewarray       ArrayRow[]
	//   50   90:putfield        #52  <Field ArrayRow[] mRows>
		releaseRows();
	//   51   93:aload_0         
	//   52   94:invokespecial   #77  <Method void releaseRows()>
	//   53   97:aload_0         
	//   54   98:new             #79  <Class Cache>
	//   55  101:dup             
	//   56  102:invokespecial   #80  <Method void Cache()>
	//   57  105:putfield        #82  <Field Cache mCache>
		mGoal = ((Row) (new GoalRow(mCache)));
	//   58  108:aload_0         
	//   59  109:new             #84  <Class GoalRow>
	//   60  112:dup             
	//   61  113:aload_0         
	//   62  114:getfield        #82  <Field Cache mCache>
	//   63  117:invokespecial   #87  <Method void GoalRow(Cache)>
	//   64  120:putfield        #89  <Field LinearSystem$Row mGoal>
		mTempGoal = ((Row) (new ArrayRow(mCache)));
	//   65  123:aload_0         
	//   66  124:new             #72  <Class ArrayRow>
	//   67  127:dup             
	//   68  128:aload_0         
	//   69  129:getfield        #82  <Field Cache mCache>
	//   70  132:invokespecial   #90  <Method void ArrayRow(Cache)>
	//   71  135:putfield        #92  <Field LinearSystem$Row mTempGoal>
	//   72  138:return          
	}

	private SolverVariable acquireSolverVariable(SolverVariable.Type type, String s)
	{
		SolverVariable solvervariable = (SolverVariable)mCache.solverVariablePool.acquire();
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field Cache mCache>
	//    2    4:getfield        #98  <Field Pools$Pool Cache.solverVariablePool>
	//    3    7:invokeinterface #104 <Method Object Pools$Pool.acquire()>
	//    4   12:checkcast       #66  <Class SolverVariable>
	//    5   15:astore          5
		if(solvervariable == null)
	//*   6   17:aload           5
	//*   7   19:ifnonnull       46
		{
			solvervariable = new SolverVariable(type, s);
	//    8   22:new             #66  <Class SolverVariable>
	//    9   25:dup             
	//   10   26:aload_1         
	//   11   27:aload_2         
	//   12   28:invokespecial   #107 <Method void SolverVariable(SolverVariable$Type, String)>
	//   13   31:astore          5
			solvervariable.setType(type, s);
	//   14   33:aload           5
	//   15   35:aload_1         
	//   16   36:aload_2         
	//   17   37:invokevirtual   #110 <Method void SolverVariable.setType(SolverVariable$Type, String)>
			type = ((SolverVariable.Type) (solvervariable));
	//   18   40:aload           5
	//   19   42:astore_1        
		} else
	//*  20   43:goto            61
		{
			solvervariable.reset();
	//   21   46:aload           5
	//   22   48:invokevirtual   #113 <Method void SolverVariable.reset()>
			solvervariable.setType(type, s);
	//   23   51:aload           5
	//   24   53:aload_1         
	//   25   54:aload_2         
	//   26   55:invokevirtual   #110 <Method void SolverVariable.setType(SolverVariable$Type, String)>
			type = ((SolverVariable.Type) (solvervariable));
	//   27   58:aload           5
	//   28   60:astore_1        
		}
		int i = mPoolVariablesCount;
	//   29   61:aload_0         
	//   30   62:getfield        #70  <Field int mPoolVariablesCount>
	//   31   65:istore_3        
		int j = POOL_SIZE;
	//   32   66:getstatic       #64  <Field int POOL_SIZE>
	//   33   69:istore          4
		if(i >= j)
	//*  34   71:iload_3         
	//*  35   72:iload           4
	//*  36   74:icmplt          101
		{
			POOL_SIZE = j * 2;
	//   37   77:iload           4
	//   38   79:iconst_2        
	//   39   80:imul            
	//   40   81:putstatic       #64  <Field int POOL_SIZE>
			mPoolVariables = (SolverVariable[])Arrays.copyOf(((Object []) (mPoolVariables)), POOL_SIZE);
	//   41   84:aload_0         
	//   42   85:aload_0         
	//   43   86:getfield        #68  <Field SolverVariable[] mPoolVariables>
	//   44   89:getstatic       #64  <Field int POOL_SIZE>
	//   45   92:invokestatic    #119 <Method Object[] Arrays.copyOf(Object[], int)>
	//   46   95:checkcast       #120 <Class SolverVariable[]>
	//   47   98:putfield        #68  <Field SolverVariable[] mPoolVariables>
		}
		s = ((String) (mPoolVariables));
	//   48  101:aload_0         
	//   49  102:getfield        #68  <Field SolverVariable[] mPoolVariables>
	//   50  105:astore_2        
		i = mPoolVariablesCount;
	//   51  106:aload_0         
	//   52  107:getfield        #70  <Field int mPoolVariablesCount>
	//   53  110:istore_3        
		mPoolVariablesCount = i + 1;
	//   54  111:aload_0         
	//   55  112:iload_3         
	//   56  113:iconst_1        
	//   57  114:iadd            
	//   58  115:putfield        #70  <Field int mPoolVariablesCount>
		s[i] = ((/*<invalid signature>*/java.lang.Object) (type));
	//   59  118:aload_2         
	//   60  119:iload_3         
	//   61  120:aload_1         
	//   62  121:aastore         
		return ((SolverVariable) (type));
	//   63  122:aload_1         
	//   64  123:areturn         
	}

	private void addError(ArrayRow arrayrow)
	{
		arrayrow.addError(this, 0);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #125 <Method ArrayRow ArrayRow.addError(LinearSystem, int)>
	//    4    6:pop             
	//    5    7:return          
	}

	private final void addRow(ArrayRow arrayrow)
	{
		if(mRows[mNumRows] != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field ArrayRow[] mRows>
	//*   2    4:aload_0         
	//*   3    5:getfield        #60  <Field int mNumRows>
	//*   4    8:aaload          
	//*   5    9:ifnull          34
			mCache.arrayRowPool.release(((Object) (mRows[mNumRows])));
	//    6   12:aload_0         
	//    7   13:getfield        #82  <Field Cache mCache>
	//    8   16:getfield        #129 <Field Pools$Pool Cache.arrayRowPool>
	//    9   19:aload_0         
	//   10   20:getfield        #52  <Field ArrayRow[] mRows>
	//   11   23:aload_0         
	//   12   24:getfield        #60  <Field int mNumRows>
	//   13   27:aaload          
	//   14   28:invokeinterface #133 <Method boolean Pools$Pool.release(Object)>
	//   15   33:pop             
		mRows[mNumRows] = arrayrow;
	//   16   34:aload_0         
	//   17   35:getfield        #52  <Field ArrayRow[] mRows>
	//   18   38:aload_0         
	//   19   39:getfield        #60  <Field int mNumRows>
	//   20   42:aload_1         
	//   21   43:aastore         
		SolverVariable solvervariable = arrayrow.variable;
	//   22   44:aload_1         
	//   23   45:getfield        #137 <Field SolverVariable ArrayRow.variable>
	//   24   48:astore_3        
		int i = mNumRows;
	//   25   49:aload_0         
	//   26   50:getfield        #60  <Field int mNumRows>
	//   27   53:istore_2        
		solvervariable.definitionId = i;
	//   28   54:aload_3         
	//   29   55:iload_2         
	//   30   56:putfield        #140 <Field int SolverVariable.definitionId>
		mNumRows = i + 1;
	//   31   59:aload_0         
	//   32   60:iload_2         
	//   33   61:iconst_1        
	//   34   62:iadd            
	//   35   63:putfield        #60  <Field int mNumRows>
		arrayrow.variable.updateReferencesWithNewDefinition(arrayrow);
	//   36   66:aload_1         
	//   37   67:getfield        #137 <Field SolverVariable ArrayRow.variable>
	//   38   70:aload_1         
	//   39   71:invokevirtual   #143 <Method void SolverVariable.updateReferencesWithNewDefinition(ArrayRow)>
	//   40   74:return          
	}

	private void computeValues()
	{
		for(int i = 0; i < mNumRows; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #60  <Field int mNumRows>
	//*   5    7:icmpge          35
		{
			ArrayRow arrayrow = mRows[i];
	//    6   10:aload_0         
	//    7   11:getfield        #52  <Field ArrayRow[] mRows>
	//    8   14:iload_1         
	//    9   15:aaload          
	//   10   16:astore_2        
			arrayrow.variable.computedValue = arrayrow.constantValue;
	//   11   17:aload_2         
	//   12   18:getfield        #137 <Field SolverVariable ArrayRow.variable>
	//   13   21:aload_2         
	//   14   22:getfield        #148 <Field float ArrayRow.constantValue>
	//   15   25:putfield        #151 <Field float SolverVariable.computedValue>
		}

	//   16   28:iload_1         
	//   17   29:iconst_1        
	//   18   30:iadd            
	//   19   31:istore_1        
	//*  20   32:goto            2
	//   21   35:return          
	}

	public static ArrayRow createRowDimensionPercent(LinearSystem linearsystem, SolverVariable solvervariable, SolverVariable solvervariable1, SolverVariable solvervariable2, float f, boolean flag)
	{
		ArrayRow arrayrow = linearsystem.createRow();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #157 <Method ArrayRow createRow()>
	//    2    4:astore          6
		if(flag)
	//*   3    6:iload           5
	//*   4    8:ifeq            17
			linearsystem.addError(arrayrow);
	//    5   11:aload_0         
	//    6   12:aload           6
	//    7   14:invokespecial   #159 <Method void addError(ArrayRow)>
		return arrayrow.createRowDimensionPercent(solvervariable, solvervariable1, solvervariable2, f);
	//    8   17:aload           6
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:fload           4
	//   13   24:invokevirtual   #162 <Method ArrayRow ArrayRow.createRowDimensionPercent(SolverVariable, SolverVariable, SolverVariable, float)>
	//   14   27:areturn         
	}

	private int enforceBFS(Row row)
		throws Exception
	{
		int i;
label0:
		{
			i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          5
			do
			{
				if(i >= mNumRows)
					break;
	//    2    3:iload           5
	//    3    5:aload_0         
	//    4    6:getfield        #60  <Field int mNumRows>
	//    5    9:icmpge          64
				if(mRows[i].variable.mType != SolverVariable.Type.UNRESTRICTED && mRows[i].constantValue < 0.0F)
	//*   6   12:aload_0         
	//*   7   13:getfield        #52  <Field ArrayRow[] mRows>
	//*   8   16:iload           5
	//*   9   18:aaload          
	//*  10   19:getfield        #137 <Field SolverVariable ArrayRow.variable>
	//*  11   22:getfield        #170 <Field SolverVariable$Type SolverVariable.mType>
	//*  12   25:getstatic       #175 <Field SolverVariable$Type SolverVariable$Type.UNRESTRICTED>
	//*  13   28:if_acmpne       34
	//*  14   31:goto            55
	//*  15   34:aload_0         
	//*  16   35:getfield        #52  <Field ArrayRow[] mRows>
	//*  17   38:iload           5
	//*  18   40:aaload          
	//*  19   41:getfield        #148 <Field float ArrayRow.constantValue>
	//*  20   44:fconst_0        
	//*  21   45:fcmpg           
	//*  22   46:ifge            55
				{
					i = 1;
	//   23   49:iconst_1        
	//   24   50:istore          5
					break label0;
	//   25   52:goto            67
				}
				i++;
	//   26   55:iload           5
	//   27   57:iconst_1        
	//   28   58:iadd            
	//   29   59:istore          5
			} while(true);
	//   30   61:goto            3
			i = 0;
	//   31   64:iconst_0        
	//   32   65:istore          5
		}
		int k;
		if(i != 0)
	//*  33   67:iload           5
	//*  34   69:ifeq            522
		{
			boolean flag = false;
	//   35   72:iconst_0        
	//   36   73:istore          8
			int j = 0;
	//   37   75:iconst_0        
	//   38   76:istore          5
			do
			{
				k = j;
	//   39   78:iload           5
	//   40   80:istore          6
				if(flag)
					break;
	//   41   82:iload           8
	//   42   84:ifne            525
				row = ((Row) (sMetrics));
	//   43   87:getstatic       #177 <Field Metrics sMetrics>
	//   44   90:astore_1        
				if(row != null)
	//*  45   91:aload_1         
	//*  46   92:ifnull          105
					row.bfs = ((Metrics) (row)).bfs + 1L;
	//   47   95:aload_1         
	//   48   96:aload_1         
	//   49   97:getfield        #183 <Field long Metrics.bfs>
	//   50  100:lconst_1        
	//   51  101:ladd            
	//   52  102:putfield        #183 <Field long Metrics.bfs>
				int i2 = j + 1;
	//   53  105:iload           5
	//   54  107:iconst_1        
	//   55  108:iadd            
	//   56  109:istore          14
				int i1 = 0;
	//   57  111:iconst_0        
	//   58  112:istore          9
				j = -1;
	//   59  114:iconst_m1       
	//   60  115:istore          5
				k = -1;
	//   61  117:iconst_m1       
	//   62  118:istore          6
				float f = 3.402823E+38F;
	//   63  120:ldc1            #184 <Float 3.402823E+38F>
	//   64  122:fstore_2        
				boolean flag1;
				for(int l = 0; i1 < mNumRows; l = ((int) (flag1)))
	//*  65  123:iconst_0        
	//*  66  124:istore          7
	//*  67  126:iload           9
	//*  68  128:aload_0         
	//*  69  129:getfield        #60  <Field int mNumRows>
	//*  70  132:icmpge          420
				{
					row = ((Row) (mRows[i1]));
	//   71  135:aload_0         
	//   72  136:getfield        #52  <Field ArrayRow[] mRows>
	//   73  139:iload           9
	//   74  141:aaload          
	//   75  142:astore_1        
					float f1;
					int k1;
					int l1;
					if(((ArrayRow) (row)).variable.mType == SolverVariable.Type.UNRESTRICTED)
	//*  76  143:aload_1         
	//*  77  144:getfield        #137 <Field SolverVariable ArrayRow.variable>
	//*  78  147:getfield        #170 <Field SolverVariable$Type SolverVariable.mType>
	//*  79  150:getstatic       #175 <Field SolverVariable$Type SolverVariable$Type.UNRESTRICTED>
	//*  80  153:if_acmpne       173
					{
						k1 = j;
	//   81  156:iload           5
	//   82  158:istore          11
						l1 = k;
	//   83  160:iload           6
	//   84  162:istore          12
						f1 = f;
	//   85  164:fload_2         
	//   86  165:fstore_3        
						flag1 = ((boolean) (l));
	//   87  166:iload           7
	//   88  168:istore          13
					} else
	//*  89  170:goto            397
					if(((ArrayRow) (row)).isSimpleDefinition)
	//*  90  173:aload_1         
	//*  91  174:getfield        #187 <Field boolean ArrayRow.isSimpleDefinition>
	//*  92  177:ifeq            197
					{
						k1 = j;
	//   93  180:iload           5
	//   94  182:istore          11
						l1 = k;
	//   95  184:iload           6
	//   96  186:istore          12
						f1 = f;
	//   97  188:fload_2         
	//   98  189:fstore_3        
						flag1 = ((boolean) (l));
	//   99  190:iload           7
	//  100  192:istore          13
					} else
	//* 101  194:goto            397
					{
						k1 = j;
	//  102  197:iload           5
	//  103  199:istore          11
						l1 = k;
	//  104  201:iload           6
	//  105  203:istore          12
						f1 = f;
	//  106  205:fload_2         
	//  107  206:fstore_3        
						flag1 = ((boolean) (l));
	//  108  207:iload           7
	//  109  209:istore          13
						if(((ArrayRow) (row)).constantValue < 0.0F)
	//* 110  211:aload_1         
	//* 111  212:getfield        #148 <Field float ArrayRow.constantValue>
	//* 112  215:fconst_0        
	//* 113  216:fcmpg           
	//* 114  217:ifge            397
						{
							int j1 = 1;
	//  115  220:iconst_1        
	//  116  221:istore          10
label1:
							do
							{
label2:
								{
									k1 = j;
	//  117  223:iload           5
	//  118  225:istore          11
									l1 = k;
	//  119  227:iload           6
	//  120  229:istore          12
									f1 = f;
	//  121  231:fload_2         
	//  122  232:fstore_3        
									flag1 = ((boolean) (l));
	//  123  233:iload           7
	//  124  235:istore          13
									if(j1 >= mNumColumns)
										break label1;
	//  125  237:iload           10
	//  126  239:aload_0         
	//  127  240:getfield        #58  <Field int mNumColumns>
	//  128  243:icmpge          397
									SolverVariable solvervariable = mCache.mIndexedVariables[j1];
	//  129  246:aload_0         
	//  130  247:getfield        #82  <Field Cache mCache>
	//  131  250:getfield        #190 <Field SolverVariable[] Cache.mIndexedVariables>
	//  132  253:iload           10
	//  133  255:aaload          
	//  134  256:astore          15
									float f2 = ((ArrayRow) (row)).variables.get(solvervariable);
	//  135  258:aload_1         
	//  136  259:getfield        #194 <Field ArrayLinkedVariables ArrayRow.variables>
	//  137  262:aload           15
	//  138  264:invokevirtual   #200 <Method float ArrayLinkedVariables.get(SolverVariable)>
	//  139  267:fstore          4
									if(f2 <= 0.0F)
	//* 140  269:fload           4
	//* 141  271:fconst_0        
	//* 142  272:fcmpg           
	//* 143  273:ifgt            279
										break label2;
	//  144  276:goto            388
									l1 = l;
	//  145  279:iload           7
	//  146  281:istore          12
									flag1 = false;
	//  147  283:iconst_0        
	//  148  284:istore          13
									l = k;
	//  149  286:iload           6
	//  150  288:istore          7
									k1 = j;
	//  151  290:iload           5
	//  152  292:istore          11
									j = ((int) (flag1));
	//  153  294:iload           13
	//  154  296:istore          5
									for(k = l1; j < 7; k = l1)
	//* 155  298:iload           12
	//* 156  300:istore          6
	//* 157  302:iload           5
	//* 158  304:bipush          7
	//* 159  306:icmpge          372
									{
label3:
										{
											f1 = solvervariable.strengthVector[j] / f2;
	//  160  309:aload           15
	//  161  311:getfield        #204 <Field float[] SolverVariable.strengthVector>
	//  162  314:iload           5
	//  163  316:faload          
	//  164  317:fload           4
	//  165  319:fdiv            
	//  166  320:fstore_3        
											if(f1 >= f || j != k)
	//* 167  321:fload_3         
	//* 168  322:fload_2         
	//* 169  323:fcmpg           
	//* 170  324:ifge            334
	//* 171  327:iload           5
	//* 172  329:iload           6
	//* 173  331:icmpeq          345
											{
												l1 = k;
	//  174  334:iload           6
	//  175  336:istore          12
												if(j <= k)
													break label3;
	//  176  338:iload           5
	//  177  340:iload           6
	//  178  342:icmple          359
											}
											l = j1;
	//  179  345:iload           10
	//  180  347:istore          7
											k1 = i1;
	//  181  349:iload           9
	//  182  351:istore          11
											f = f1;
	//  183  353:fload_3         
	//  184  354:fstore_2        
											l1 = j;
	//  185  355:iload           5
	//  186  357:istore          12
										}
										j++;
	//  187  359:iload           5
	//  188  361:iconst_1        
	//  189  362:iadd            
	//  190  363:istore          5
									}

	//  191  365:iload           12
	//  192  367:istore          6
	//* 193  369:goto            302
									j = l;
	//  194  372:iload           7
	//  195  374:istore          5
									l = k;
	//  196  376:iload           6
	//  197  378:istore          7
									k = j;
	//  198  380:iload           5
	//  199  382:istore          6
									j = k1;
	//  200  384:iload           11
	//  201  386:istore          5
								}
								j1++;
	//  202  388:iload           10
	//  203  390:iconst_1        
	//  204  391:iadd            
	//  205  392:istore          10
							} while(true);
	//  206  394:goto            223
						}
					}
					i1++;
	//  207  397:iload           9
	//  208  399:iconst_1        
	//  209  400:iadd            
	//  210  401:istore          9
					j = k1;
	//  211  403:iload           11
	//  212  405:istore          5
					k = l1;
	//  213  407:iload           12
	//  214  409:istore          6
					f = f1;
	//  215  411:fload_3         
	//  216  412:fstore_2        
				}

	//  217  413:iload           13
	//  218  415:istore          7
	//* 219  417:goto            126
				if(j != -1)
	//* 220  420:iload           5
	//* 221  422:iconst_m1       
	//* 222  423:icmpeq          498
				{
					row = ((Row) (mRows[j]));
	//  223  426:aload_0         
	//  224  427:getfield        #52  <Field ArrayRow[] mRows>
	//  225  430:iload           5
	//  226  432:aaload          
	//  227  433:astore_1        
					((ArrayRow) (row)).variable.definitionId = -1;
	//  228  434:aload_1         
	//  229  435:getfield        #137 <Field SolverVariable ArrayRow.variable>
	//  230  438:iconst_m1       
	//  231  439:putfield        #140 <Field int SolverVariable.definitionId>
					Metrics metrics = sMetrics;
	//  232  442:getstatic       #177 <Field Metrics sMetrics>
	//  233  445:astore          15
					if(metrics != null)
	//* 234  447:aload           15
	//* 235  449:ifnull          464
						metrics.pivots = metrics.pivots + 1L;
	//  236  452:aload           15
	//  237  454:aload           15
	//  238  456:getfield        #207 <Field long Metrics.pivots>
	//  239  459:lconst_1        
	//  240  460:ladd            
	//  241  461:putfield        #207 <Field long Metrics.pivots>
					((ArrayRow) (row)).pivot(mCache.mIndexedVariables[k]);
	//  242  464:aload_1         
	//  243  465:aload_0         
	//  244  466:getfield        #82  <Field Cache mCache>
	//  245  469:getfield        #190 <Field SolverVariable[] Cache.mIndexedVariables>
	//  246  472:iload           6
	//  247  474:aaload          
	//  248  475:invokevirtual   #211 <Method void ArrayRow.pivot(SolverVariable)>
					((ArrayRow) (row)).variable.definitionId = j;
	//  249  478:aload_1         
	//  250  479:getfield        #137 <Field SolverVariable ArrayRow.variable>
	//  251  482:iload           5
	//  252  484:putfield        #140 <Field int SolverVariable.definitionId>
					((ArrayRow) (row)).variable.updateReferencesWithNewDefinition(((ArrayRow) (row)));
	//  253  487:aload_1         
	//  254  488:getfield        #137 <Field SolverVariable ArrayRow.variable>
	//  255  491:aload_1         
	//  256  492:invokevirtual   #143 <Method void SolverVariable.updateReferencesWithNewDefinition(ArrayRow)>
				} else
	//* 257  495:goto            501
				{
					flag = true;
	//  258  498:iconst_1        
	//  259  499:istore          8
				}
				if(i2 > mNumColumns / 2)
	//* 260  501:iload           14
	//* 261  503:aload_0         
	//* 262  504:getfield        #58  <Field int mNumColumns>
	//* 263  507:iconst_2        
	//* 264  508:idiv            
	//* 265  509:icmple          515
					flag = true;
	//  266  512:iconst_1        
	//  267  513:istore          8
				j = i2;
	//  268  515:iload           14
	//  269  517:istore          5
			} while(true);
	//  270  519:goto            78
		} else
		{
			k = 0;
	//  271  522:iconst_0        
	//  272  523:istore          6
		}
		return k;
	//  273  525:iload           6
	//  274  527:ireturn         
	}

	public static Metrics getMetrics()
	{
		return sMetrics;
	//    0    0:getstatic       #177 <Field Metrics sMetrics>
	//    1    3:areturn         
	}

	private void increaseTableSize()
	{
		TABLE_SIZE = TABLE_SIZE * 2;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #48  <Field int TABLE_SIZE>
	//    3    5:iconst_2        
	//    4    6:imul            
	//    5    7:putfield        #48  <Field int TABLE_SIZE>
		mRows = (ArrayRow[])Arrays.copyOf(((Object []) (mRows)), TABLE_SIZE);
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #52  <Field ArrayRow[] mRows>
	//    9   15:aload_0         
	//   10   16:getfield        #48  <Field int TABLE_SIZE>
	//   11   19:invokestatic    #119 <Method Object[] Arrays.copyOf(Object[], int)>
	//   12   22:checkcast       #216 <Class ArrayRow[]>
	//   13   25:putfield        #52  <Field ArrayRow[] mRows>
		Object obj = ((Object) (mCache));
	//   14   28:aload_0         
	//   15   29:getfield        #82  <Field Cache mCache>
	//   16   32:astore_2        
		obj.mIndexedVariables = (SolverVariable[])Arrays.copyOf(((Object []) (((Cache) (obj)).mIndexedVariables)), TABLE_SIZE);
	//   17   33:aload_2         
	//   18   34:aload_2         
	//   19   35:getfield        #190 <Field SolverVariable[] Cache.mIndexedVariables>
	//   20   38:aload_0         
	//   21   39:getfield        #48  <Field int TABLE_SIZE>
	//   22   42:invokestatic    #119 <Method Object[] Arrays.copyOf(Object[], int)>
	//   23   45:checkcast       #120 <Class SolverVariable[]>
	//   24   48:putfield        #190 <Field SolverVariable[] Cache.mIndexedVariables>
		int i = TABLE_SIZE;
	//   25   51:aload_0         
	//   26   52:getfield        #48  <Field int TABLE_SIZE>
	//   27   55:istore_1        
		mAlreadyTestedCandidates = new boolean[i];
	//   28   56:aload_0         
	//   29   57:iload_1         
	//   30   58:newarray        boolean[]
	//   31   60:putfield        #56  <Field boolean[] mAlreadyTestedCandidates>
		mMaxColumns = i;
	//   32   63:aload_0         
	//   33   64:iload_1         
	//   34   65:putfield        #50  <Field int mMaxColumns>
		mMaxRows = i;
	//   35   68:aload_0         
	//   36   69:iload_1         
	//   37   70:putfield        #62  <Field int mMaxRows>
		obj = ((Object) (sMetrics));
	//   38   73:getstatic       #177 <Field Metrics sMetrics>
	//   39   76:astore_2        
		if(obj != null)
	//*  40   77:aload_2         
	//*  41   78:ifnull          123
		{
			obj.tableSizeIncrease = ((Metrics) (obj)).tableSizeIncrease + 1L;
	//   42   81:aload_2         
	//   43   82:aload_2         
	//   44   83:getfield        #219 <Field long Metrics.tableSizeIncrease>
	//   45   86:lconst_1        
	//   46   87:ladd            
	//   47   88:putfield        #219 <Field long Metrics.tableSizeIncrease>
			obj = ((Object) (sMetrics));
	//   48   91:getstatic       #177 <Field Metrics sMetrics>
	//   49   94:astore_2        
			obj.maxTableSize = Math.max(((Metrics) (obj)).maxTableSize, TABLE_SIZE);
	//   50   95:aload_2         
	//   51   96:aload_2         
	//   52   97:getfield        #222 <Field long Metrics.maxTableSize>
	//   53  100:aload_0         
	//   54  101:getfield        #48  <Field int TABLE_SIZE>
	//   55  104:i2l             
	//   56  105:invokestatic    #228 <Method long Math.max(long, long)>
	//   57  108:putfield        #222 <Field long Metrics.maxTableSize>
			obj = ((Object) (sMetrics));
	//   58  111:getstatic       #177 <Field Metrics sMetrics>
	//   59  114:astore_2        
			obj.lastTableSize = ((Metrics) (obj)).maxTableSize;
	//   60  115:aload_2         
	//   61  116:aload_2         
	//   62  117:getfield        #222 <Field long Metrics.maxTableSize>
	//   63  120:putfield        #231 <Field long Metrics.lastTableSize>
		}
	//   64  123:return          
	}

	private final int optimize(Row row, boolean flag)
	{
		Metrics metrics = sMetrics;
	//    0    0:getstatic       #177 <Field Metrics sMetrics>
	//    1    3:astore          11
		if(metrics != null)
	//*   2    5:aload           11
	//*   3    7:ifnull          22
			metrics.optimize = metrics.optimize + 1L;
	//    4   10:aload           11
	//    5   12:aload           11
	//    6   14:getfield        #235 <Field long Metrics.optimize>
	//    7   17:lconst_1        
	//    8   18:ladd            
	//    9   19:putfield        #235 <Field long Metrics.optimize>
		for(int i = 0; i < mNumColumns; i++)
	//*  10   22:iconst_0        
	//*  11   23:istore          6
	//*  12   25:iload           6
	//*  13   27:aload_0         
	//*  14   28:getfield        #58  <Field int mNumColumns>
	//*  15   31:icmpge          51
			mAlreadyTestedCandidates[i] = false;
	//   16   34:aload_0         
	//   17   35:getfield        #56  <Field boolean[] mAlreadyTestedCandidates>
	//   18   38:iload           6
	//   19   40:iconst_0        
	//   20   41:bastore         

	//   21   42:iload           6
	//   22   44:iconst_1        
	//   23   45:iadd            
	//   24   46:istore          6
	//*  25   48:goto            25
		boolean flag1 = false;
	//   26   51:iconst_0        
	//   27   52:istore          6
		int j = 0;
	//   28   54:iconst_0        
	//   29   55:istore          7
		while(!flag1) 
	//*  30   57:iload           6
	//*  31   59:ifne            439
		{
			Object obj = ((Object) (sMetrics));
	//   32   62:getstatic       #177 <Field Metrics sMetrics>
	//   33   65:astore          11
			if(obj != null)
	//*  34   67:aload           11
	//*  35   69:ifnull          84
				obj.iterations = ((Metrics) (obj)).iterations + 1L;
	//   36   72:aload           11
	//   37   74:aload           11
	//   38   76:getfield        #238 <Field long Metrics.iterations>
	//   39   79:lconst_1        
	//   40   80:ladd            
	//   41   81:putfield        #238 <Field long Metrics.iterations>
			int i1 = j + 1;
	//   42   84:iload           7
	//   43   86:iconst_1        
	//   44   87:iadd            
	//   45   88:istore          10
			if(i1 >= mNumColumns * 2)
	//*  46   90:iload           10
	//*  47   92:aload_0         
	//*  48   93:getfield        #58  <Field int mNumColumns>
	//*  49   96:iconst_2        
	//*  50   97:imul            
	//*  51   98:icmplt          104
				return i1;
	//   52  101:iload           10
	//   53  103:ireturn         
			if(row.getKey() != null)
	//*  54  104:aload_1         
	//*  55  105:invokeinterface #242 <Method SolverVariable LinearSystem$Row.getKey()>
	//*  56  110:ifnull          128
				mAlreadyTestedCandidates[row.getKey().id] = true;
	//   57  113:aload_0         
	//   58  114:getfield        #56  <Field boolean[] mAlreadyTestedCandidates>
	//   59  117:aload_1         
	//   60  118:invokeinterface #242 <Method SolverVariable LinearSystem$Row.getKey()>
	//   61  123:getfield        #245 <Field int SolverVariable.id>
	//   62  126:iconst_1        
	//   63  127:bastore         
			obj = ((Object) (row.getPivotCandidate(this, mAlreadyTestedCandidates)));
	//   64  128:aload_1         
	//   65  129:aload_0         
	//   66  130:aload_0         
	//   67  131:getfield        #56  <Field boolean[] mAlreadyTestedCandidates>
	//   68  134:invokeinterface #249 <Method SolverVariable LinearSystem$Row.getPivotCandidate(LinearSystem, boolean[])>
	//   69  139:astore          11
			if(obj != null)
	//*  70  141:aload           11
	//*  71  143:ifnull          173
			{
				if(mAlreadyTestedCandidates[((SolverVariable) (obj)).id])
	//*  72  146:aload_0         
	//*  73  147:getfield        #56  <Field boolean[] mAlreadyTestedCandidates>
	//*  74  150:aload           11
	//*  75  152:getfield        #245 <Field int SolverVariable.id>
	//*  76  155:baload          
	//*  77  156:ifeq            162
					return i1;
	//   78  159:iload           10
	//   79  161:ireturn         
				mAlreadyTestedCandidates[((SolverVariable) (obj)).id] = true;
	//   80  162:aload_0         
	//   81  163:getfield        #56  <Field boolean[] mAlreadyTestedCandidates>
	//   82  166:aload           11
	//   83  168:getfield        #245 <Field int SolverVariable.id>
	//   84  171:iconst_1        
	//   85  172:bastore         
			}
			if(obj != null)
	//*  86  173:aload           11
	//*  87  175:ifnull          429
			{
				j = 0;
	//   88  178:iconst_0        
	//   89  179:istore          7
				int k = -1;
	//   90  181:iconst_m1       
	//   91  182:istore          8
				float f1;
				for(float f = 3.402823E+38F; j < mNumRows; f = f1)
	//*  92  184:ldc1            #184 <Float 3.402823E+38F>
	//*  93  186:fstore_3        
	//*  94  187:iload           7
	//*  95  189:aload_0         
	//*  96  190:getfield        #60  <Field int mNumRows>
	//*  97  193:icmpge          339
				{
					ArrayRow arrayrow = mRows[j];
	//   98  196:aload_0         
	//   99  197:getfield        #52  <Field ArrayRow[] mRows>
	//  100  200:iload           7
	//  101  202:aaload          
	//  102  203:astore          12
					int l;
					if(arrayrow.variable.mType == SolverVariable.Type.UNRESTRICTED)
	//* 103  205:aload           12
	//* 104  207:getfield        #137 <Field SolverVariable ArrayRow.variable>
	//* 105  210:getfield        #170 <Field SolverVariable$Type SolverVariable.mType>
	//* 106  213:getstatic       #175 <Field SolverVariable$Type SolverVariable$Type.UNRESTRICTED>
	//* 107  216:if_acmpne       229
					{
						l = k;
	//  108  219:iload           8
	//  109  221:istore          9
						f1 = f;
	//  110  223:fload_3         
	//  111  224:fstore          4
					} else
	//* 112  226:goto            323
					if(arrayrow.isSimpleDefinition)
	//* 113  229:aload           12
	//* 114  231:getfield        #187 <Field boolean ArrayRow.isSimpleDefinition>
	//* 115  234:ifeq            247
					{
						l = k;
	//  116  237:iload           8
	//  117  239:istore          9
						f1 = f;
	//  118  241:fload_3         
	//  119  242:fstore          4
					} else
	//* 120  244:goto            323
					{
						l = k;
	//  121  247:iload           8
	//  122  249:istore          9
						f1 = f;
	//  123  251:fload_3         
	//  124  252:fstore          4
						if(arrayrow.hasVariable(((SolverVariable) (obj))))
	//* 125  254:aload           12
	//* 126  256:aload           11
	//* 127  258:invokevirtual   #253 <Method boolean ArrayRow.hasVariable(SolverVariable)>
	//* 128  261:ifeq            323
						{
							float f2 = arrayrow.variables.get(((SolverVariable) (obj)));
	//  129  264:aload           12
	//  130  266:getfield        #194 <Field ArrayLinkedVariables ArrayRow.variables>
	//  131  269:aload           11
	//  132  271:invokevirtual   #200 <Method float ArrayLinkedVariables.get(SolverVariable)>
	//  133  274:fstore          5
							l = k;
	//  134  276:iload           8
	//  135  278:istore          9
							f1 = f;
	//  136  280:fload_3         
	//  137  281:fstore          4
							if(f2 < 0.0F)
	//* 138  283:fload           5
	//* 139  285:fconst_0        
	//* 140  286:fcmpg           
	//* 141  287:ifge            323
							{
								f2 = -arrayrow.constantValue / f2;
	//  142  290:aload           12
	//  143  292:getfield        #148 <Field float ArrayRow.constantValue>
	//  144  295:fneg            
	//  145  296:fload           5
	//  146  298:fdiv            
	//  147  299:fstore          5
								l = k;
	//  148  301:iload           8
	//  149  303:istore          9
								f1 = f;
	//  150  305:fload_3         
	//  151  306:fstore          4
								if(f2 < f)
	//* 152  308:fload           5
	//* 153  310:fload_3         
	//* 154  311:fcmpg           
	//* 155  312:ifge            323
								{
									l = j;
	//  156  315:iload           7
	//  157  317:istore          9
									f1 = f2;
	//  158  319:fload           5
	//  159  321:fstore          4
								}
							}
						}
					}
					j++;
	//  160  323:iload           7
	//  161  325:iconst_1        
	//  162  326:iadd            
	//  163  327:istore          7
					k = l;
	//  164  329:iload           9
	//  165  331:istore          8
				}

	//  166  333:fload           4
	//  167  335:fstore_3        
	//* 168  336:goto            187
				if(k > -1)
	//* 169  339:iload           8
	//* 170  341:iconst_m1       
	//* 171  342:icmple          419
				{
					ArrayRow arrayrow1 = mRows[k];
	//  172  345:aload_0         
	//  173  346:getfield        #52  <Field ArrayRow[] mRows>
	//  174  349:iload           8
	//  175  351:aaload          
	//  176  352:astore          12
					arrayrow1.variable.definitionId = -1;
	//  177  354:aload           12
	//  178  356:getfield        #137 <Field SolverVariable ArrayRow.variable>
	//  179  359:iconst_m1       
	//  180  360:putfield        #140 <Field int SolverVariable.definitionId>
					Metrics metrics1 = sMetrics;
	//  181  363:getstatic       #177 <Field Metrics sMetrics>
	//  182  366:astore          13
					if(metrics1 != null)
	//* 183  368:aload           13
	//* 184  370:ifnull          385
						metrics1.pivots = metrics1.pivots + 1L;
	//  185  373:aload           13
	//  186  375:aload           13
	//  187  377:getfield        #207 <Field long Metrics.pivots>
	//  188  380:lconst_1        
	//  189  381:ladd            
	//  190  382:putfield        #207 <Field long Metrics.pivots>
					arrayrow1.pivot(((SolverVariable) (obj)));
	//  191  385:aload           12
	//  192  387:aload           11
	//  193  389:invokevirtual   #211 <Method void ArrayRow.pivot(SolverVariable)>
					arrayrow1.variable.definitionId = k;
	//  194  392:aload           12
	//  195  394:getfield        #137 <Field SolverVariable ArrayRow.variable>
	//  196  397:iload           8
	//  197  399:putfield        #140 <Field int SolverVariable.definitionId>
					arrayrow1.variable.updateReferencesWithNewDefinition(arrayrow1);
	//  198  402:aload           12
	//  199  404:getfield        #137 <Field SolverVariable ArrayRow.variable>
	//  200  407:aload           12
	//  201  409:invokevirtual   #143 <Method void SolverVariable.updateReferencesWithNewDefinition(ArrayRow)>
					j = i1;
	//  202  412:iload           10
	//  203  414:istore          7
				} else
	//* 204  416:goto            57
				{
					flag1 = true;
	//  205  419:iconst_1        
	//  206  420:istore          6
					j = i1;
	//  207  422:iload           10
	//  208  424:istore          7
				}
			} else
	//* 209  426:goto            57
			{
				flag1 = true;
	//  210  429:iconst_1        
	//  211  430:istore          6
				j = i1;
	//  212  432:iload           10
	//  213  434:istore          7
			}
		}
	//* 214  436:goto            57
		return j;
	//  215  439:iload           7
	//  216  441:ireturn         
	}

	private void releaseRows()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		do
		{
			ArrayRow aarrayrow[] = mRows;
	//    2    2:aload_0         
	//    3    3:getfield        #52  <Field ArrayRow[] mRows>
	//    4    6:astore_2        
			if(i < aarrayrow.length)
	//*   5    7:iload_1         
	//*   6    8:aload_2         
	//*   7    9:arraylength     
	//*   8   10:icmpge          49
			{
				ArrayRow arrayrow = aarrayrow[i];
	//    9   13:aload_2         
	//   10   14:iload_1         
	//   11   15:aaload          
	//   12   16:astore_2        
				if(arrayrow != null)
	//*  13   17:aload_2         
	//*  14   18:ifnull          35
					mCache.arrayRowPool.release(((Object) (arrayrow)));
	//   15   21:aload_0         
	//   16   22:getfield        #82  <Field Cache mCache>
	//   17   25:getfield        #129 <Field Pools$Pool Cache.arrayRowPool>
	//   18   28:aload_2         
	//   19   29:invokeinterface #133 <Method boolean Pools$Pool.release(Object)>
	//   20   34:pop             
				mRows[i] = null;
	//   21   35:aload_0         
	//   22   36:getfield        #52  <Field ArrayRow[] mRows>
	//   23   39:iload_1         
	//   24   40:aconst_null     
	//   25   41:aastore         
				i++;
	//   26   42:iload_1         
	//   27   43:iconst_1        
	//   28   44:iadd            
	//   29   45:istore_1        
			} else
	//*  30   46:goto            2
			{
				return;
	//   31   49:return          
			}
		} while(true);
	}

	private final void updateRowFromVariables(ArrayRow arrayrow)
	{
		if(mNumRows > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field int mNumRows>
	//*   2    4:ifle            34
		{
			arrayrow.variables.updateFromSystem(arrayrow, mRows);
	//    3    7:aload_1         
	//    4    8:getfield        #194 <Field ArrayLinkedVariables ArrayRow.variables>
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #52  <Field ArrayRow[] mRows>
	//    8   16:invokevirtual   #258 <Method void ArrayLinkedVariables.updateFromSystem(ArrayRow, ArrayRow[])>
			if(arrayrow.variables.currentSize == 0)
	//*   9   19:aload_1         
	//*  10   20:getfield        #194 <Field ArrayLinkedVariables ArrayRow.variables>
	//*  11   23:getfield        #261 <Field int ArrayLinkedVariables.currentSize>
	//*  12   26:ifne            34
				arrayrow.isSimpleDefinition = true;
	//   13   29:aload_1         
	//   14   30:iconst_1        
	//   15   31:putfield        #187 <Field boolean ArrayRow.isSimpleDefinition>
		}
	//   16   34:return          
	}

	public void addCenterPoint(ConstraintWidget constraintwidget, ConstraintWidget constraintwidget1, float f, int i)
	{
		SolverVariable solvervariable = createObjectVariable(((Object) (constraintwidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor.Type.LEFT))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #269 <Field android.support.constraint.solver.widgets.ConstraintAnchor$Type android.support.constraint.solver.widgets.ConstraintAnchor$Type.LEFT>
	//    3    5:invokevirtual   #275 <Method ConstraintAnchor ConstraintWidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor$Type)>
	//    4    8:invokevirtual   #279 <Method SolverVariable createObjectVariable(Object)>
	//    5   11:astore          11
		SolverVariable solvervariable2 = createObjectVariable(((Object) (constraintwidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor.Type.TOP))));
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:getstatic       #282 <Field android.support.constraint.solver.widgets.ConstraintAnchor$Type android.support.constraint.solver.widgets.ConstraintAnchor$Type.TOP>
	//    9   18:invokevirtual   #275 <Method ConstraintAnchor ConstraintWidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor$Type)>
	//   10   21:invokevirtual   #279 <Method SolverVariable createObjectVariable(Object)>
	//   11   24:astore          13
		SolverVariable solvervariable1 = createObjectVariable(((Object) (constraintwidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor.Type.RIGHT))));
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:getstatic       #285 <Field android.support.constraint.solver.widgets.ConstraintAnchor$Type android.support.constraint.solver.widgets.ConstraintAnchor$Type.RIGHT>
	//   15   31:invokevirtual   #275 <Method ConstraintAnchor ConstraintWidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor$Type)>
	//   16   34:invokevirtual   #279 <Method SolverVariable createObjectVariable(Object)>
	//   17   37:astore          12
		SolverVariable solvervariable4 = createObjectVariable(((Object) (constraintwidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor.Type.BOTTOM))));
	//   18   39:aload_0         
	//   19   40:aload_1         
	//   20   41:getstatic       #288 <Field android.support.constraint.solver.widgets.ConstraintAnchor$Type android.support.constraint.solver.widgets.ConstraintAnchor$Type.BOTTOM>
	//   21   44:invokevirtual   #275 <Method ConstraintAnchor ConstraintWidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor$Type)>
	//   22   47:invokevirtual   #279 <Method SolverVariable createObjectVariable(Object)>
	//   23   50:astore          15
		constraintwidget = ((ConstraintWidget) (createObjectVariable(((Object) (constraintwidget1.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor.Type.LEFT))))));
	//   24   52:aload_0         
	//   25   53:aload_2         
	//   26   54:getstatic       #269 <Field android.support.constraint.solver.widgets.ConstraintAnchor$Type android.support.constraint.solver.widgets.ConstraintAnchor$Type.LEFT>
	//   27   57:invokevirtual   #275 <Method ConstraintAnchor ConstraintWidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor$Type)>
	//   28   60:invokevirtual   #279 <Method SolverVariable createObjectVariable(Object)>
	//   29   63:astore_1        
		SolverVariable solvervariable5 = createObjectVariable(((Object) (constraintwidget1.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor.Type.TOP))));
	//   30   64:aload_0         
	//   31   65:aload_2         
	//   32   66:getstatic       #282 <Field android.support.constraint.solver.widgets.ConstraintAnchor$Type android.support.constraint.solver.widgets.ConstraintAnchor$Type.TOP>
	//   33   69:invokevirtual   #275 <Method ConstraintAnchor ConstraintWidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor$Type)>
	//   34   72:invokevirtual   #279 <Method SolverVariable createObjectVariable(Object)>
	//   35   75:astore          16
		SolverVariable solvervariable3 = createObjectVariable(((Object) (constraintwidget1.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor.Type.RIGHT))));
	//   36   77:aload_0         
	//   37   78:aload_2         
	//   38   79:getstatic       #285 <Field android.support.constraint.solver.widgets.ConstraintAnchor$Type android.support.constraint.solver.widgets.ConstraintAnchor$Type.RIGHT>
	//   39   82:invokevirtual   #275 <Method ConstraintAnchor ConstraintWidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor$Type)>
	//   40   85:invokevirtual   #279 <Method SolverVariable createObjectVariable(Object)>
	//   41   88:astore          14
		constraintwidget1 = ((ConstraintWidget) (createObjectVariable(((Object) (constraintwidget1.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor.Type.BOTTOM))))));
	//   42   90:aload_0         
	//   43   91:aload_2         
	//   44   92:getstatic       #288 <Field android.support.constraint.solver.widgets.ConstraintAnchor$Type android.support.constraint.solver.widgets.ConstraintAnchor$Type.BOTTOM>
	//   45   95:invokevirtual   #275 <Method ConstraintAnchor ConstraintWidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor$Type)>
	//   46   98:invokevirtual   #279 <Method SolverVariable createObjectVariable(Object)>
	//   47  101:astore_2        
		ArrayRow arrayrow = createRow();
	//   48  102:aload_0         
	//   49  103:invokevirtual   #157 <Method ArrayRow createRow()>
	//   50  106:astore          17
		double d = f;
	//   51  108:fload_3         
	//   52  109:f2d             
	//   53  110:dstore          5
		double d1 = Math.sin(d);
	//   54  112:dload           5
	//   55  114:invokestatic    #292 <Method double Math.sin(double)>
	//   56  117:dstore          7
		double d2 = i;
	//   57  119:iload           4
	//   58  121:i2d             
	//   59  122:dstore          9
		arrayrow.createRowWithAngle(solvervariable2, solvervariable4, solvervariable5, ((SolverVariable) (constraintwidget1)), (float)(d1 * d2));
	//   60  124:aload           17
	//   61  126:aload           13
	//   62  128:aload           15
	//   63  130:aload           16
	//   64  132:aload_2         
	//   65  133:dload           7
	//   66  135:dload           9
	//   67  137:dmul            
	//   68  138:d2f             
	//   69  139:invokevirtual   #296 <Method ArrayRow ArrayRow.createRowWithAngle(SolverVariable, SolverVariable, SolverVariable, SolverVariable, float)>
	//   70  142:pop             
		addConstraint(arrayrow);
	//   71  143:aload_0         
	//   72  144:aload           17
	//   73  146:invokevirtual   #299 <Method void addConstraint(ArrayRow)>
		constraintwidget1 = ((ConstraintWidget) (createRow()));
	//   74  149:aload_0         
	//   75  150:invokevirtual   #157 <Method ArrayRow createRow()>
	//   76  153:astore_2        
		((ArrayRow) (constraintwidget1)).createRowWithAngle(solvervariable, solvervariable1, ((SolverVariable) (constraintwidget)), solvervariable3, (float)(Math.cos(d) * d2));
	//   77  154:aload_2         
	//   78  155:aload           11
	//   79  157:aload           12
	//   80  159:aload_1         
	//   81  160:aload           14
	//   82  162:dload           5
	//   83  164:invokestatic    #302 <Method double Math.cos(double)>
	//   84  167:dload           9
	//   85  169:dmul            
	//   86  170:d2f             
	//   87  171:invokevirtual   #296 <Method ArrayRow ArrayRow.createRowWithAngle(SolverVariable, SolverVariable, SolverVariable, SolverVariable, float)>
	//   88  174:pop             
		addConstraint(((ArrayRow) (constraintwidget1)));
	//   89  175:aload_0         
	//   90  176:aload_2         
	//   91  177:invokevirtual   #299 <Method void addConstraint(ArrayRow)>
	//   92  180:return          
	}

	public void addCentering(SolverVariable solvervariable, SolverVariable solvervariable1, int i, float f, SolverVariable solvervariable2, SolverVariable solvervariable3, int j, 
			int k)
	{
		ArrayRow arrayrow = createRow();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #157 <Method ArrayRow createRow()>
	//    2    4:astore          9
		arrayrow.createRowCentering(solvervariable, solvervariable1, i, f, solvervariable2, solvervariable3, j);
	//    3    6:aload           9
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:iload_3         
	//    7   11:fload           4
	//    8   13:aload           5
	//    9   15:aload           6
	//   10   17:iload           7
	//   11   19:invokevirtual   #308 <Method ArrayRow ArrayRow.createRowCentering(SolverVariable, SolverVariable, int, float, SolverVariable, SolverVariable, int)>
	//   12   22:pop             
		if(k != 6)
	//*  13   23:iload           8
	//*  14   25:bipush          6
	//*  15   27:icmpeq          39
			arrayrow.addError(this, k);
	//   16   30:aload           9
	//   17   32:aload_0         
	//   18   33:iload           8
	//   19   35:invokevirtual   #125 <Method ArrayRow ArrayRow.addError(LinearSystem, int)>
	//   20   38:pop             
		addConstraint(arrayrow);
	//   21   39:aload_0         
	//   22   40:aload           9
	//   23   42:invokevirtual   #299 <Method void addConstraint(ArrayRow)>
	//   24   45:return          
	}

	public void addConstraint(ArrayRow arrayrow)
	{
		if(arrayrow == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		Metrics metrics = sMetrics;
	//    3    5:getstatic       #177 <Field Metrics sMetrics>
	//    4    8:astore          4
		if(metrics != null)
	//*   5   10:aload           4
	//*   6   12:ifnull          51
		{
			metrics.constraints = metrics.constraints + 1L;
	//    7   15:aload           4
	//    8   17:aload           4
	//    9   19:getfield        #311 <Field long Metrics.constraints>
	//   10   22:lconst_1        
	//   11   23:ladd            
	//   12   24:putfield        #311 <Field long Metrics.constraints>
			if(arrayrow.isSimpleDefinition)
	//*  13   27:aload_1         
	//*  14   28:getfield        #187 <Field boolean ArrayRow.isSimpleDefinition>
	//*  15   31:ifeq            51
			{
				Metrics metrics1 = sMetrics;
	//   16   34:getstatic       #177 <Field Metrics sMetrics>
	//   17   37:astore          4
				metrics1.simpleconstraints = metrics1.simpleconstraints + 1L;
	//   18   39:aload           4
	//   19   41:aload           4
	//   20   43:getfield        #314 <Field long Metrics.simpleconstraints>
	//   21   46:lconst_1        
	//   22   47:ladd            
	//   23   48:putfield        #314 <Field long Metrics.simpleconstraints>
			}
		}
		if(mNumRows + 1 >= mMaxRows || mNumColumns + 1 >= mMaxColumns)
	//*  24   51:aload_0         
	//*  25   52:getfield        #60  <Field int mNumRows>
	//*  26   55:iconst_1        
	//*  27   56:iadd            
	//*  28   57:aload_0         
	//*  29   58:getfield        #62  <Field int mMaxRows>
	//*  30   61:icmpge          77
	//*  31   64:aload_0         
	//*  32   65:getfield        #58  <Field int mNumColumns>
	//*  33   68:iconst_1        
	//*  34   69:iadd            
	//*  35   70:aload_0         
	//*  36   71:getfield        #50  <Field int mMaxColumns>
	//*  37   74:icmplt          81
			increaseTableSize();
	//   38   77:aload_0         
	//   39   78:invokespecial   #316 <Method void increaseTableSize()>
		boolean flag = false;
	//   40   81:iconst_0        
	//   41   82:istore_2        
		boolean flag1 = false;
	//   42   83:iconst_0        
	//   43   84:istore_3        
		if(!arrayrow.isSimpleDefinition)
	//*  44   85:aload_1         
	//*  45   86:getfield        #187 <Field boolean ArrayRow.isSimpleDefinition>
	//*  46   89:ifne            250
		{
			updateRowFromVariables(arrayrow);
	//   47   92:aload_0         
	//   48   93:aload_1         
	//   49   94:invokespecial   #318 <Method void updateRowFromVariables(ArrayRow)>
			if(arrayrow.isEmpty())
	//*  50   97:aload_1         
	//*  51   98:invokevirtual   #322 <Method boolean ArrayRow.isEmpty()>
	//*  52  101:ifeq            105
				return;
	//   53  104:return          
			arrayrow.ensurePositiveConstant();
	//   54  105:aload_1         
	//   55  106:invokevirtual   #325 <Method void ArrayRow.ensurePositiveConstant()>
			flag = flag1;
	//   56  109:iload_3         
	//   57  110:istore_2        
			if(arrayrow.chooseSubject(this))
	//*  58  111:aload_1         
	//*  59  112:aload_0         
	//*  60  113:invokevirtual   #329 <Method boolean ArrayRow.chooseSubject(LinearSystem)>
	//*  61  116:ifeq            242
			{
				SolverVariable solvervariable = createExtraVariable();
	//   62  119:aload_0         
	//   63  120:invokevirtual   #332 <Method SolverVariable createExtraVariable()>
	//   64  123:astore          4
				arrayrow.variable = solvervariable;
	//   65  125:aload_1         
	//   66  126:aload           4
	//   67  128:putfield        #137 <Field SolverVariable ArrayRow.variable>
				addRow(arrayrow);
	//   68  131:aload_0         
	//   69  132:aload_1         
	//   70  133:invokespecial   #334 <Method void addRow(ArrayRow)>
				mTempGoal.initFromRow(((Row) (arrayrow)));
	//   71  136:aload_0         
	//   72  137:getfield        #92  <Field LinearSystem$Row mTempGoal>
	//   73  140:aload_1         
	//   74  141:invokeinterface #338 <Method void LinearSystem$Row.initFromRow(LinearSystem$Row)>
				optimize(mTempGoal, true);
	//   75  146:aload_0         
	//   76  147:aload_0         
	//   77  148:getfield        #92  <Field LinearSystem$Row mTempGoal>
	//   78  151:iconst_1        
	//   79  152:invokespecial   #340 <Method int optimize(LinearSystem$Row, boolean)>
	//   80  155:pop             
				if(solvervariable.definitionId == -1)
	//*  81  156:aload           4
	//*  82  158:getfield        #140 <Field int SolverVariable.definitionId>
	//*  83  161:iconst_m1       
	//*  84  162:icmpne          240
				{
					if(arrayrow.variable == solvervariable)
	//*  85  165:aload_1         
	//*  86  166:getfield        #137 <Field SolverVariable ArrayRow.variable>
	//*  87  169:aload           4
	//*  88  171:if_acmpne       215
					{
						solvervariable = arrayrow.pickPivot(solvervariable);
	//   89  174:aload_1         
	//   90  175:aload           4
	//   91  177:invokevirtual   #344 <Method SolverVariable ArrayRow.pickPivot(SolverVariable)>
	//   92  180:astore          4
						if(solvervariable != null)
	//*  93  182:aload           4
	//*  94  184:ifnull          215
						{
							Metrics metrics2 = sMetrics;
	//   95  187:getstatic       #177 <Field Metrics sMetrics>
	//   96  190:astore          5
							if(metrics2 != null)
	//*  97  192:aload           5
	//*  98  194:ifnull          209
								metrics2.pivots = metrics2.pivots + 1L;
	//   99  197:aload           5
	//  100  199:aload           5
	//  101  201:getfield        #207 <Field long Metrics.pivots>
	//  102  204:lconst_1        
	//  103  205:ladd            
	//  104  206:putfield        #207 <Field long Metrics.pivots>
							arrayrow.pivot(solvervariable);
	//  105  209:aload_1         
	//  106  210:aload           4
	//  107  212:invokevirtual   #211 <Method void ArrayRow.pivot(SolverVariable)>
						}
					}
					if(!arrayrow.isSimpleDefinition)
	//* 108  215:aload_1         
	//* 109  216:getfield        #187 <Field boolean ArrayRow.isSimpleDefinition>
	//* 110  219:ifne            230
						arrayrow.variable.updateReferencesWithNewDefinition(arrayrow);
	//  111  222:aload_1         
	//  112  223:getfield        #137 <Field SolverVariable ArrayRow.variable>
	//  113  226:aload_1         
	//  114  227:invokevirtual   #143 <Method void SolverVariable.updateReferencesWithNewDefinition(ArrayRow)>
					mNumRows = mNumRows - 1;
	//  115  230:aload_0         
	//  116  231:aload_0         
	//  117  232:getfield        #60  <Field int mNumRows>
	//  118  235:iconst_1        
	//  119  236:isub            
	//  120  237:putfield        #60  <Field int mNumRows>
				}
				flag = true;
	//  121  240:iconst_1        
	//  122  241:istore_2        
			}
			if(!arrayrow.hasKeyVariable())
	//* 123  242:aload_1         
	//* 124  243:invokevirtual   #347 <Method boolean ArrayRow.hasKeyVariable()>
	//* 125  246:ifne            250
				return;
	//  126  249:return          
		}
		if(!flag)
	//* 127  250:iload_2         
	//* 128  251:ifne            259
			addRow(arrayrow);
	//  129  254:aload_0         
	//  130  255:aload_1         
	//  131  256:invokespecial   #334 <Method void addRow(ArrayRow)>
	//  132  259:return          
	}

	public ArrayRow addEquality(SolverVariable solvervariable, SolverVariable solvervariable1, int i, int j)
	{
		ArrayRow arrayrow = createRow();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #157 <Method ArrayRow createRow()>
	//    2    4:astore          5
		arrayrow.createRowEquals(solvervariable, solvervariable1, i);
	//    3    6:aload           5
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:iload_3         
	//    7   11:invokevirtual   #353 <Method ArrayRow ArrayRow.createRowEquals(SolverVariable, SolverVariable, int)>
	//    8   14:pop             
		if(j != 6)
	//*   9   15:iload           4
	//*  10   17:bipush          6
	//*  11   19:icmpeq          31
			arrayrow.addError(this, j);
	//   12   22:aload           5
	//   13   24:aload_0         
	//   14   25:iload           4
	//   15   27:invokevirtual   #125 <Method ArrayRow ArrayRow.addError(LinearSystem, int)>
	//   16   30:pop             
		addConstraint(arrayrow);
	//   17   31:aload_0         
	//   18   32:aload           5
	//   19   34:invokevirtual   #299 <Method void addConstraint(ArrayRow)>
		return arrayrow;
	//   20   37:aload           5
	//   21   39:areturn         
	}

	public void addEquality(SolverVariable solvervariable, int i)
	{
		int j = solvervariable.definitionId;
	//    0    0:aload_1         
	//    1    1:getfield        #140 <Field int SolverVariable.definitionId>
	//    2    4:istore_3        
		if(solvervariable.definitionId != -1)
	//*   3    5:aload_1         
	//*   4    6:getfield        #140 <Field int SolverVariable.definitionId>
	//*   5    9:iconst_m1       
	//*   6   10:icmpeq          83
		{
			ArrayRow arrayrow = mRows[j];
	//    7   13:aload_0         
	//    8   14:getfield        #52  <Field ArrayRow[] mRows>
	//    9   17:iload_3         
	//   10   18:aaload          
	//   11   19:astore          4
			if(arrayrow.isSimpleDefinition)
	//*  12   21:aload           4
	//*  13   23:getfield        #187 <Field boolean ArrayRow.isSimpleDefinition>
	//*  14   26:ifeq            37
			{
				arrayrow.constantValue = i;
	//   15   29:aload           4
	//   16   31:iload_2         
	//   17   32:i2f             
	//   18   33:putfield        #148 <Field float ArrayRow.constantValue>
				return;
	//   19   36:return          
			}
			if(arrayrow.variables.currentSize == 0)
	//*  20   37:aload           4
	//*  21   39:getfield        #194 <Field ArrayLinkedVariables ArrayRow.variables>
	//*  22   42:getfield        #261 <Field int ArrayLinkedVariables.currentSize>
	//*  23   45:ifne            62
			{
				arrayrow.isSimpleDefinition = true;
	//   24   48:aload           4
	//   25   50:iconst_1        
	//   26   51:putfield        #187 <Field boolean ArrayRow.isSimpleDefinition>
				arrayrow.constantValue = i;
	//   27   54:aload           4
	//   28   56:iload_2         
	//   29   57:i2f             
	//   30   58:putfield        #148 <Field float ArrayRow.constantValue>
				return;
	//   31   61:return          
			} else
			{
				ArrayRow arrayrow1 = createRow();
	//   32   62:aload_0         
	//   33   63:invokevirtual   #157 <Method ArrayRow createRow()>
	//   34   66:astore          4
				arrayrow1.createRowEquals(solvervariable, i);
	//   35   68:aload           4
	//   36   70:aload_1         
	//   37   71:iload_2         
	//   38   72:invokevirtual   #357 <Method ArrayRow ArrayRow.createRowEquals(SolverVariable, int)>
	//   39   75:pop             
				addConstraint(arrayrow1);
	//   40   76:aload_0         
	//   41   77:aload           4
	//   42   79:invokevirtual   #299 <Method void addConstraint(ArrayRow)>
				return;
	//   43   82:return          
			}
		} else
		{
			ArrayRow arrayrow2 = createRow();
	//   44   83:aload_0         
	//   45   84:invokevirtual   #157 <Method ArrayRow createRow()>
	//   46   87:astore          4
			arrayrow2.createRowDefinition(solvervariable, i);
	//   47   89:aload           4
	//   48   91:aload_1         
	//   49   92:iload_2         
	//   50   93:invokevirtual   #360 <Method ArrayRow ArrayRow.createRowDefinition(SolverVariable, int)>
	//   51   96:pop             
			addConstraint(arrayrow2);
	//   52   97:aload_0         
	//   53   98:aload           4
	//   54  100:invokevirtual   #299 <Method void addConstraint(ArrayRow)>
			return;
	//   55  103:return          
		}
	}

	public void addGreaterBarrier(SolverVariable solvervariable, SolverVariable solvervariable1, boolean flag)
	{
		ArrayRow arrayrow = createRow();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #157 <Method ArrayRow createRow()>
	//    2    4:astore          4
		SolverVariable solvervariable2 = createSlackVariable();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #365 <Method SolverVariable createSlackVariable()>
	//    5   10:astore          5
		solvervariable2.strength = 0;
	//    6   12:aload           5
	//    7   14:iconst_0        
	//    8   15:putfield        #368 <Field int SolverVariable.strength>
		arrayrow.createRowGreaterThan(solvervariable, solvervariable1, solvervariable2, 0);
	//    9   18:aload           4
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:aload           5
	//   13   24:iconst_0        
	//   14   25:invokevirtual   #372 <Method ArrayRow ArrayRow.createRowGreaterThan(SolverVariable, SolverVariable, SolverVariable, int)>
	//   15   28:pop             
		if(flag)
	//*  16   29:iload_3         
	//*  17   30:ifeq            55
			addSingleError(arrayrow, (int)(arrayrow.variables.get(solvervariable2) * -1F), 1);
	//   18   33:aload_0         
	//   19   34:aload           4
	//   20   36:aload           4
	//   21   38:getfield        #194 <Field ArrayLinkedVariables ArrayRow.variables>
	//   22   41:aload           5
	//   23   43:invokevirtual   #200 <Method float ArrayLinkedVariables.get(SolverVariable)>
	//   24   46:ldc2            #373 <Float -1F>
	//   25   49:fmul            
	//   26   50:f2i             
	//   27   51:iconst_1        
	//   28   52:invokevirtual   #377 <Method void addSingleError(ArrayRow, int, int)>
		addConstraint(arrayrow);
	//   29   55:aload_0         
	//   30   56:aload           4
	//   31   58:invokevirtual   #299 <Method void addConstraint(ArrayRow)>
	//   32   61:return          
	}

	public void addGreaterThan(SolverVariable solvervariable, SolverVariable solvervariable1, int i, int j)
	{
		ArrayRow arrayrow = createRow();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #157 <Method ArrayRow createRow()>
	//    2    4:astore          5
		SolverVariable solvervariable2 = createSlackVariable();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #365 <Method SolverVariable createSlackVariable()>
	//    5   10:astore          6
		solvervariable2.strength = 0;
	//    6   12:aload           6
	//    7   14:iconst_0        
	//    8   15:putfield        #368 <Field int SolverVariable.strength>
		arrayrow.createRowGreaterThan(solvervariable, solvervariable1, solvervariable2, i);
	//    9   18:aload           5
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:aload           6
	//   13   24:iload_3         
	//   14   25:invokevirtual   #372 <Method ArrayRow ArrayRow.createRowGreaterThan(SolverVariable, SolverVariable, SolverVariable, int)>
	//   15   28:pop             
		if(j != 6)
	//*  16   29:iload           4
	//*  17   31:bipush          6
	//*  18   33:icmpeq          59
			addSingleError(arrayrow, (int)(arrayrow.variables.get(solvervariable2) * -1F), j);
	//   19   36:aload_0         
	//   20   37:aload           5
	//   21   39:aload           5
	//   22   41:getfield        #194 <Field ArrayLinkedVariables ArrayRow.variables>
	//   23   44:aload           6
	//   24   46:invokevirtual   #200 <Method float ArrayLinkedVariables.get(SolverVariable)>
	//   25   49:ldc2            #373 <Float -1F>
	//   26   52:fmul            
	//   27   53:f2i             
	//   28   54:iload           4
	//   29   56:invokevirtual   #377 <Method void addSingleError(ArrayRow, int, int)>
		addConstraint(arrayrow);
	//   30   59:aload_0         
	//   31   60:aload           5
	//   32   62:invokevirtual   #299 <Method void addConstraint(ArrayRow)>
	//   33   65:return          
	}

	public void addLowerBarrier(SolverVariable solvervariable, SolverVariable solvervariable1, boolean flag)
	{
		ArrayRow arrayrow = createRow();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #157 <Method ArrayRow createRow()>
	//    2    4:astore          4
		SolverVariable solvervariable2 = createSlackVariable();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #365 <Method SolverVariable createSlackVariable()>
	//    5   10:astore          5
		solvervariable2.strength = 0;
	//    6   12:aload           5
	//    7   14:iconst_0        
	//    8   15:putfield        #368 <Field int SolverVariable.strength>
		arrayrow.createRowLowerThan(solvervariable, solvervariable1, solvervariable2, 0);
	//    9   18:aload           4
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:aload           5
	//   13   24:iconst_0        
	//   14   25:invokevirtual   #383 <Method ArrayRow ArrayRow.createRowLowerThan(SolverVariable, SolverVariable, SolverVariable, int)>
	//   15   28:pop             
		if(flag)
	//*  16   29:iload_3         
	//*  17   30:ifeq            55
			addSingleError(arrayrow, (int)(arrayrow.variables.get(solvervariable2) * -1F), 1);
	//   18   33:aload_0         
	//   19   34:aload           4
	//   20   36:aload           4
	//   21   38:getfield        #194 <Field ArrayLinkedVariables ArrayRow.variables>
	//   22   41:aload           5
	//   23   43:invokevirtual   #200 <Method float ArrayLinkedVariables.get(SolverVariable)>
	//   24   46:ldc2            #373 <Float -1F>
	//   25   49:fmul            
	//   26   50:f2i             
	//   27   51:iconst_1        
	//   28   52:invokevirtual   #377 <Method void addSingleError(ArrayRow, int, int)>
		addConstraint(arrayrow);
	//   29   55:aload_0         
	//   30   56:aload           4
	//   31   58:invokevirtual   #299 <Method void addConstraint(ArrayRow)>
	//   32   61:return          
	}

	public void addLowerThan(SolverVariable solvervariable, SolverVariable solvervariable1, int i, int j)
	{
		ArrayRow arrayrow = createRow();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #157 <Method ArrayRow createRow()>
	//    2    4:astore          5
		SolverVariable solvervariable2 = createSlackVariable();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #365 <Method SolverVariable createSlackVariable()>
	//    5   10:astore          6
		solvervariable2.strength = 0;
	//    6   12:aload           6
	//    7   14:iconst_0        
	//    8   15:putfield        #368 <Field int SolverVariable.strength>
		arrayrow.createRowLowerThan(solvervariable, solvervariable1, solvervariable2, i);
	//    9   18:aload           5
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:aload           6
	//   13   24:iload_3         
	//   14   25:invokevirtual   #383 <Method ArrayRow ArrayRow.createRowLowerThan(SolverVariable, SolverVariable, SolverVariable, int)>
	//   15   28:pop             
		if(j != 6)
	//*  16   29:iload           4
	//*  17   31:bipush          6
	//*  18   33:icmpeq          59
			addSingleError(arrayrow, (int)(arrayrow.variables.get(solvervariable2) * -1F), j);
	//   19   36:aload_0         
	//   20   37:aload           5
	//   21   39:aload           5
	//   22   41:getfield        #194 <Field ArrayLinkedVariables ArrayRow.variables>
	//   23   44:aload           6
	//   24   46:invokevirtual   #200 <Method float ArrayLinkedVariables.get(SolverVariable)>
	//   25   49:ldc2            #373 <Float -1F>
	//   26   52:fmul            
	//   27   53:f2i             
	//   28   54:iload           4
	//   29   56:invokevirtual   #377 <Method void addSingleError(ArrayRow, int, int)>
		addConstraint(arrayrow);
	//   30   59:aload_0         
	//   31   60:aload           5
	//   32   62:invokevirtual   #299 <Method void addConstraint(ArrayRow)>
	//   33   65:return          
	}

	public void addRatio(SolverVariable solvervariable, SolverVariable solvervariable1, SolverVariable solvervariable2, SolverVariable solvervariable3, float f, int i)
	{
		ArrayRow arrayrow = createRow();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #157 <Method ArrayRow createRow()>
	//    2    4:astore          7
		arrayrow.createRowDimensionRatio(solvervariable, solvervariable1, solvervariable2, solvervariable3, f);
	//    3    6:aload           7
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aload           4
	//    8   13:fload           5
	//    9   15:invokevirtual   #389 <Method ArrayRow ArrayRow.createRowDimensionRatio(SolverVariable, SolverVariable, SolverVariable, SolverVariable, float)>
	//   10   18:pop             
		if(i != 6)
	//*  11   19:iload           6
	//*  12   21:bipush          6
	//*  13   23:icmpeq          35
			arrayrow.addError(this, i);
	//   14   26:aload           7
	//   15   28:aload_0         
	//   16   29:iload           6
	//   17   31:invokevirtual   #125 <Method ArrayRow ArrayRow.addError(LinearSystem, int)>
	//   18   34:pop             
		addConstraint(arrayrow);
	//   19   35:aload_0         
	//   20   36:aload           7
	//   21   38:invokevirtual   #299 <Method void addConstraint(ArrayRow)>
	//   22   41:return          
	}

	void addSingleError(ArrayRow arrayrow, int i, int j)
	{
		arrayrow.addSingleError(createErrorVariable(j, ((String) (null))), i);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:iload_3         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #393 <Method SolverVariable createErrorVariable(int, String)>
	//    5    7:iload_2         
	//    6    8:invokevirtual   #395 <Method ArrayRow ArrayRow.addSingleError(SolverVariable, int)>
	//    7   11:pop             
	//    8   12:return          
	}

	public SolverVariable createErrorVariable(int i, String s)
	{
		Metrics metrics = sMetrics;
	//    0    0:getstatic       #177 <Field Metrics sMetrics>
	//    1    3:astore_3        
		if(metrics != null)
	//*   2    4:aload_3         
	//*   3    5:ifnull          18
			metrics.errors = metrics.errors + 1L;
	//    4    8:aload_3         
	//    5    9:aload_3         
	//    6   10:getfield        #398 <Field long Metrics.errors>
	//    7   13:lconst_1        
	//    8   14:ladd            
	//    9   15:putfield        #398 <Field long Metrics.errors>
		if(mNumColumns + 1 >= mMaxColumns)
	//*  10   18:aload_0         
	//*  11   19:getfield        #58  <Field int mNumColumns>
	//*  12   22:iconst_1        
	//*  13   23:iadd            
	//*  14   24:aload_0         
	//*  15   25:getfield        #50  <Field int mMaxColumns>
	//*  16   28:icmplt          35
			increaseTableSize();
	//   17   31:aload_0         
	//   18   32:invokespecial   #316 <Method void increaseTableSize()>
		s = ((String) (acquireSolverVariable(SolverVariable.Type.ERROR, s)));
	//   19   35:aload_0         
	//   20   36:getstatic       #401 <Field SolverVariable$Type SolverVariable$Type.ERROR>
	//   21   39:aload_2         
	//   22   40:invokespecial   #403 <Method SolverVariable acquireSolverVariable(SolverVariable$Type, String)>
	//   23   43:astore_2        
		mVariablesID = mVariablesID + 1;
	//   24   44:aload_0         
	//   25   45:aload_0         
	//   26   46:getfield        #44  <Field int mVariablesID>
	//   27   49:iconst_1        
	//   28   50:iadd            
	//   29   51:putfield        #44  <Field int mVariablesID>
		mNumColumns = mNumColumns + 1;
	//   30   54:aload_0         
	//   31   55:aload_0         
	//   32   56:getfield        #58  <Field int mNumColumns>
	//   33   59:iconst_1        
	//   34   60:iadd            
	//   35   61:putfield        #58  <Field int mNumColumns>
		s.id = mVariablesID;
	//   36   64:aload_2         
	//   37   65:aload_0         
	//   38   66:getfield        #44  <Field int mVariablesID>
	//   39   69:putfield        #245 <Field int SolverVariable.id>
		s.strength = i;
	//   40   72:aload_2         
	//   41   73:iload_1         
	//   42   74:putfield        #368 <Field int SolverVariable.strength>
		mCache.mIndexedVariables[mVariablesID] = ((SolverVariable) (s));
	//   43   77:aload_0         
	//   44   78:getfield        #82  <Field Cache mCache>
	//   45   81:getfield        #190 <Field SolverVariable[] Cache.mIndexedVariables>
	//   46   84:aload_0         
	//   47   85:getfield        #44  <Field int mVariablesID>
	//   48   88:aload_2         
	//   49   89:aastore         
		mGoal.addError(((SolverVariable) (s)));
	//   50   90:aload_0         
	//   51   91:getfield        #89  <Field LinearSystem$Row mGoal>
	//   52   94:aload_2         
	//   53   95:invokeinterface #405 <Method void LinearSystem$Row.addError(SolverVariable)>
		return ((SolverVariable) (s));
	//   54  100:aload_2         
	//   55  101:areturn         
	}

	public SolverVariable createExtraVariable()
	{
		Object obj = ((Object) (sMetrics));
	//    0    0:getstatic       #177 <Field Metrics sMetrics>
	//    1    3:astore_1        
		if(obj != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          18
			obj.extravariables = ((Metrics) (obj)).extravariables + 1L;
	//    4    8:aload_1         
	//    5    9:aload_1         
	//    6   10:getfield        #408 <Field long Metrics.extravariables>
	//    7   13:lconst_1        
	//    8   14:ladd            
	//    9   15:putfield        #408 <Field long Metrics.extravariables>
		if(mNumColumns + 1 >= mMaxColumns)
	//*  10   18:aload_0         
	//*  11   19:getfield        #58  <Field int mNumColumns>
	//*  12   22:iconst_1        
	//*  13   23:iadd            
	//*  14   24:aload_0         
	//*  15   25:getfield        #50  <Field int mMaxColumns>
	//*  16   28:icmplt          35
			increaseTableSize();
	//   17   31:aload_0         
	//   18   32:invokespecial   #316 <Method void increaseTableSize()>
		obj = ((Object) (acquireSolverVariable(SolverVariable.Type.SLACK, ((String) (null)))));
	//   19   35:aload_0         
	//   20   36:getstatic       #411 <Field SolverVariable$Type SolverVariable$Type.SLACK>
	//   21   39:aconst_null     
	//   22   40:invokespecial   #403 <Method SolverVariable acquireSolverVariable(SolverVariable$Type, String)>
	//   23   43:astore_1        
		mVariablesID = mVariablesID + 1;
	//   24   44:aload_0         
	//   25   45:aload_0         
	//   26   46:getfield        #44  <Field int mVariablesID>
	//   27   49:iconst_1        
	//   28   50:iadd            
	//   29   51:putfield        #44  <Field int mVariablesID>
		mNumColumns = mNumColumns + 1;
	//   30   54:aload_0         
	//   31   55:aload_0         
	//   32   56:getfield        #58  <Field int mNumColumns>
	//   33   59:iconst_1        
	//   34   60:iadd            
	//   35   61:putfield        #58  <Field int mNumColumns>
		obj.id = mVariablesID;
	//   36   64:aload_1         
	//   37   65:aload_0         
	//   38   66:getfield        #44  <Field int mVariablesID>
	//   39   69:putfield        #245 <Field int SolverVariable.id>
		mCache.mIndexedVariables[mVariablesID] = ((SolverVariable) (obj));
	//   40   72:aload_0         
	//   41   73:getfield        #82  <Field Cache mCache>
	//   42   76:getfield        #190 <Field SolverVariable[] Cache.mIndexedVariables>
	//   43   79:aload_0         
	//   44   80:getfield        #44  <Field int mVariablesID>
	//   45   83:aload_1         
	//   46   84:aastore         
		return ((SolverVariable) (obj));
	//   47   85:aload_1         
	//   48   86:areturn         
	}

	public SolverVariable createObjectVariable(Object obj)
	{
		Object obj1;
label0:
		{
			obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
			if(obj == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       8
				return null;
	//    4    6:aconst_null     
	//    5    7:areturn         
			if(mNumColumns + 1 >= mMaxColumns)
	//*   6    8:aload_0         
	//*   7    9:getfield        #58  <Field int mNumColumns>
	//*   8   12:iconst_1        
	//*   9   13:iadd            
	//*  10   14:aload_0         
	//*  11   15:getfield        #50  <Field int mMaxColumns>
	//*  12   18:icmplt          25
				increaseTableSize();
	//   13   21:aload_0         
	//   14   22:invokespecial   #316 <Method void increaseTableSize()>
			if(!(obj instanceof ConstraintAnchor))
				break label0;
	//   15   25:aload_1         
	//   16   26:instanceof      #413 <Class ConstraintAnchor>
	//   17   29:ifeq            159
			ConstraintAnchor constraintanchor = (ConstraintAnchor)obj;
	//   18   32:aload_1         
	//   19   33:checkcast       #413 <Class ConstraintAnchor>
	//   20   36:astore_3        
			obj1 = ((Object) (constraintanchor.getSolverVariable()));
	//   21   37:aload_3         
	//   22   38:invokevirtual   #416 <Method SolverVariable ConstraintAnchor.getSolverVariable()>
	//   23   41:astore_2        
			obj = obj1;
	//   24   42:aload_2         
	//   25   43:astore_1        
			if(obj1 == null)
	//*  26   44:aload_2         
	//*  27   45:ifnonnull       61
			{
				constraintanchor.resetSolverVariable(mCache);
	//   28   48:aload_3         
	//   29   49:aload_0         
	//   30   50:getfield        #82  <Field Cache mCache>
	//   31   53:invokevirtual   #419 <Method void ConstraintAnchor.resetSolverVariable(Cache)>
				obj = ((Object) (constraintanchor.getSolverVariable()));
	//   32   56:aload_3         
	//   33   57:invokevirtual   #416 <Method SolverVariable ConstraintAnchor.getSolverVariable()>
	//   34   60:astore_1        
			}
			if(((SolverVariable) (obj)).id != -1 && ((SolverVariable) (obj)).id <= mVariablesID)
	//*  35   61:aload_1         
	//*  36   62:getfield        #245 <Field int SolverVariable.id>
	//*  37   65:iconst_m1       
	//*  38   66:icmpeq          97
	//*  39   69:aload_1         
	//*  40   70:getfield        #245 <Field int SolverVariable.id>
	//*  41   73:aload_0         
	//*  42   74:getfield        #44  <Field int mVariablesID>
	//*  43   77:icmpgt          97
			{
				obj1 = obj;
	//   44   80:aload_1         
	//   45   81:astore_2        
				if(mCache.mIndexedVariables[((SolverVariable) (obj)).id] != null)
					break label0;
	//   46   82:aload_0         
	//   47   83:getfield        #82  <Field Cache mCache>
	//   48   86:getfield        #190 <Field SolverVariable[] Cache.mIndexedVariables>
	//   49   89:aload_1         
	//   50   90:getfield        #245 <Field int SolverVariable.id>
	//   51   93:aaload          
	//   52   94:ifnonnull       159
			}
			if(((SolverVariable) (obj)).id != -1)
	//*  53   97:aload_1         
	//*  54   98:getfield        #245 <Field int SolverVariable.id>
	//*  55  101:iconst_m1       
	//*  56  102:icmpeq          109
				((SolverVariable) (obj)).reset();
	//   57  105:aload_1         
	//   58  106:invokevirtual   #113 <Method void SolverVariable.reset()>
			mVariablesID = mVariablesID + 1;
	//   59  109:aload_0         
	//   60  110:aload_0         
	//   61  111:getfield        #44  <Field int mVariablesID>
	//   62  114:iconst_1        
	//   63  115:iadd            
	//   64  116:putfield        #44  <Field int mVariablesID>
			mNumColumns = mNumColumns + 1;
	//   65  119:aload_0         
	//   66  120:aload_0         
	//   67  121:getfield        #58  <Field int mNumColumns>
	//   68  124:iconst_1        
	//   69  125:iadd            
	//   70  126:putfield        #58  <Field int mNumColumns>
			obj.id = mVariablesID;
	//   71  129:aload_1         
	//   72  130:aload_0         
	//   73  131:getfield        #44  <Field int mVariablesID>
	//   74  134:putfield        #245 <Field int SolverVariable.id>
			obj.mType = SolverVariable.Type.UNRESTRICTED;
	//   75  137:aload_1         
	//   76  138:getstatic       #175 <Field SolverVariable$Type SolverVariable$Type.UNRESTRICTED>
	//   77  141:putfield        #170 <Field SolverVariable$Type SolverVariable.mType>
			mCache.mIndexedVariables[mVariablesID] = ((SolverVariable) (obj));
	//   78  144:aload_0         
	//   79  145:getfield        #82  <Field Cache mCache>
	//   80  148:getfield        #190 <Field SolverVariable[] Cache.mIndexedVariables>
	//   81  151:aload_0         
	//   82  152:getfield        #44  <Field int mVariablesID>
	//   83  155:aload_1         
	//   84  156:aastore         
			obj1 = obj;
	//   85  157:aload_1         
	//   86  158:astore_2        
		}
		return ((SolverVariable) (obj1));
	//   87  159:aload_2         
	//   88  160:areturn         
	}

	public ArrayRow createRow()
	{
		ArrayRow arrayrow = (ArrayRow)mCache.arrayRowPool.acquire();
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field Cache mCache>
	//    2    4:getfield        #129 <Field Pools$Pool Cache.arrayRowPool>
	//    3    7:invokeinterface #104 <Method Object Pools$Pool.acquire()>
	//    4   12:checkcast       #72  <Class ArrayRow>
	//    5   15:astore_1        
		if(arrayrow == null)
	//*   6   16:aload_1         
	//*   7   17:ifnonnull       35
			arrayrow = new ArrayRow(mCache);
	//    8   20:new             #72  <Class ArrayRow>
	//    9   23:dup             
	//   10   24:aload_0         
	//   11   25:getfield        #82  <Field Cache mCache>
	//   12   28:invokespecial   #90  <Method void ArrayRow(Cache)>
	//   13   31:astore_1        
		else
	//*  14   32:goto            39
			arrayrow.reset();
	//   15   35:aload_1         
	//   16   36:invokevirtual   #420 <Method void ArrayRow.reset()>
		SolverVariable.increaseErrorId();
	//   17   39:invokestatic    #423 <Method void SolverVariable.increaseErrorId()>
		return arrayrow;
	//   18   42:aload_1         
	//   19   43:areturn         
	}

	public SolverVariable createSlackVariable()
	{
		Object obj = ((Object) (sMetrics));
	//    0    0:getstatic       #177 <Field Metrics sMetrics>
	//    1    3:astore_1        
		if(obj != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          18
			obj.slackvariables = ((Metrics) (obj)).slackvariables + 1L;
	//    4    8:aload_1         
	//    5    9:aload_1         
	//    6   10:getfield        #426 <Field long Metrics.slackvariables>
	//    7   13:lconst_1        
	//    8   14:ladd            
	//    9   15:putfield        #426 <Field long Metrics.slackvariables>
		if(mNumColumns + 1 >= mMaxColumns)
	//*  10   18:aload_0         
	//*  11   19:getfield        #58  <Field int mNumColumns>
	//*  12   22:iconst_1        
	//*  13   23:iadd            
	//*  14   24:aload_0         
	//*  15   25:getfield        #50  <Field int mMaxColumns>
	//*  16   28:icmplt          35
			increaseTableSize();
	//   17   31:aload_0         
	//   18   32:invokespecial   #316 <Method void increaseTableSize()>
		obj = ((Object) (acquireSolverVariable(SolverVariable.Type.SLACK, ((String) (null)))));
	//   19   35:aload_0         
	//   20   36:getstatic       #411 <Field SolverVariable$Type SolverVariable$Type.SLACK>
	//   21   39:aconst_null     
	//   22   40:invokespecial   #403 <Method SolverVariable acquireSolverVariable(SolverVariable$Type, String)>
	//   23   43:astore_1        
		mVariablesID = mVariablesID + 1;
	//   24   44:aload_0         
	//   25   45:aload_0         
	//   26   46:getfield        #44  <Field int mVariablesID>
	//   27   49:iconst_1        
	//   28   50:iadd            
	//   29   51:putfield        #44  <Field int mVariablesID>
		mNumColumns = mNumColumns + 1;
	//   30   54:aload_0         
	//   31   55:aload_0         
	//   32   56:getfield        #58  <Field int mNumColumns>
	//   33   59:iconst_1        
	//   34   60:iadd            
	//   35   61:putfield        #58  <Field int mNumColumns>
		obj.id = mVariablesID;
	//   36   64:aload_1         
	//   37   65:aload_0         
	//   38   66:getfield        #44  <Field int mVariablesID>
	//   39   69:putfield        #245 <Field int SolverVariable.id>
		mCache.mIndexedVariables[mVariablesID] = ((SolverVariable) (obj));
	//   40   72:aload_0         
	//   41   73:getfield        #82  <Field Cache mCache>
	//   42   76:getfield        #190 <Field SolverVariable[] Cache.mIndexedVariables>
	//   43   79:aload_0         
	//   44   80:getfield        #44  <Field int mVariablesID>
	//   45   83:aload_1         
	//   46   84:aastore         
		return ((SolverVariable) (obj));
	//   47   85:aload_1         
	//   48   86:areturn         
	}

	public void fillMetrics(Metrics metrics)
	{
		sMetrics = metrics;
	//    0    0:aload_1         
	//    1    1:putstatic       #177 <Field Metrics sMetrics>
	//    2    4:return          
	}

	public Cache getCache()
	{
		return mCache;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field Cache mCache>
	//    2    4:areturn         
	}

	public int getObjectVariableValue(Object obj)
	{
		obj = ((Object) (((ConstraintAnchor)obj).getSolverVariable()));
	//    0    0:aload_1         
	//    1    1:checkcast       #413 <Class ConstraintAnchor>
	//    2    4:invokevirtual   #416 <Method SolverVariable ConstraintAnchor.getSolverVariable()>
	//    3    7:astore_1        
		if(obj != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          22
			return (int)(((SolverVariable) (obj)).computedValue + 0.5F);
	//    6   12:aload_1         
	//    7   13:getfield        #151 <Field float SolverVariable.computedValue>
	//    8   16:ldc2            #433 <Float 0.5F>
	//    9   19:fadd            
	//   10   20:f2i             
	//   11   21:ireturn         
		else
			return 0;
	//   12   22:iconst_0        
	//   13   23:ireturn         
	}

	public void minimize()
		throws Exception
	{
label0:
		{
			int i;
label1:
			{
				Metrics metrics = sMetrics;
	//    0    0:getstatic       #177 <Field Metrics sMetrics>
	//    1    3:astore_3        
				if(metrics != null)
	//*   2    4:aload_3         
	//*   3    5:ifnull          18
					metrics.minimize = metrics.minimize + 1L;
	//    4    8:aload_3         
	//    5    9:aload_3         
	//    6   10:getfield        #436 <Field long Metrics.minimize>
	//    7   13:lconst_1        
	//    8   14:ladd            
	//    9   15:putfield        #436 <Field long Metrics.minimize>
				if(!graphOptimizer)
					break label0;
	//   10   18:aload_0         
	//   11   19:getfield        #54  <Field boolean graphOptimizer>
	//   12   22:ifeq            117
				metrics = sMetrics;
	//   13   25:getstatic       #177 <Field Metrics sMetrics>
	//   14   28:astore_3        
				if(metrics != null)
	//*  15   29:aload_3         
	//*  16   30:ifnull          43
					metrics.graphOptimizer = metrics.graphOptimizer + 1L;
	//   17   33:aload_3         
	//   18   34:aload_3         
	//   19   35:getfield        #438 <Field long Metrics.graphOptimizer>
	//   20   38:lconst_1        
	//   21   39:ladd            
	//   22   40:putfield        #438 <Field long Metrics.graphOptimizer>
				boolean flag = false;
	//   23   43:iconst_0        
	//   24   44:istore_2        
				i = 0;
	//   25   45:iconst_0        
	//   26   46:istore_1        
				do
				{
					if(i >= mNumRows)
						break;
	//   27   47:iload_1         
	//   28   48:aload_0         
	//   29   49:getfield        #60  <Field int mNumRows>
	//   30   52:icmpge          79
					if(!mRows[i].isSimpleDefinition)
	//*  31   55:aload_0         
	//*  32   56:getfield        #52  <Field ArrayRow[] mRows>
	//*  33   59:iload_1         
	//*  34   60:aaload          
	//*  35   61:getfield        #187 <Field boolean ArrayRow.isSimpleDefinition>
	//*  36   64:ifne            72
					{
						i = ((int) (flag));
	//   37   67:iload_2         
	//   38   68:istore_1        
						break label1;
	//   39   69:goto            81
					}
					i++;
	//   40   72:iload_1         
	//   41   73:iconst_1        
	//   42   74:iadd            
	//   43   75:istore_1        
				} while(true);
	//   44   76:goto            47
				i = 1;
	//   45   79:iconst_1        
	//   46   80:istore_1        
			}
			if(i == 0)
	//*  47   81:iload_1         
	//*  48   82:ifne            94
			{
				minimizeGoal(mGoal);
	//   49   85:aload_0         
	//   50   86:aload_0         
	//   51   87:getfield        #89  <Field LinearSystem$Row mGoal>
	//   52   90:invokevirtual   #441 <Method void minimizeGoal(LinearSystem$Row)>
				return;
	//   53   93:return          
			}
			Metrics metrics1 = sMetrics;
	//   54   94:getstatic       #177 <Field Metrics sMetrics>
	//   55   97:astore_3        
			if(metrics1 != null)
	//*  56   98:aload_3         
	//*  57   99:ifnull          112
				metrics1.fullySolved = metrics1.fullySolved + 1L;
	//   58  102:aload_3         
	//   59  103:aload_3         
	//   60  104:getfield        #444 <Field long Metrics.fullySolved>
	//   61  107:lconst_1        
	//   62  108:ladd            
	//   63  109:putfield        #444 <Field long Metrics.fullySolved>
			computeValues();
	//   64  112:aload_0         
	//   65  113:invokespecial   #446 <Method void computeValues()>
			return;
	//   66  116:return          
		}
		minimizeGoal(mGoal);
	//   67  117:aload_0         
	//   68  118:aload_0         
	//   69  119:getfield        #89  <Field LinearSystem$Row mGoal>
	//   70  122:invokevirtual   #441 <Method void minimizeGoal(LinearSystem$Row)>
	//   71  125:return          
	}

	void minimizeGoal(Row row)
		throws Exception
	{
		Metrics metrics = sMetrics;
	//    0    0:getstatic       #177 <Field Metrics sMetrics>
	//    1    3:astore_2        
		if(metrics != null)
	//*   2    4:aload_2         
	//*   3    5:ifnull          58
		{
			metrics.minimizeGoal = metrics.minimizeGoal + 1L;
	//    4    8:aload_2         
	//    5    9:aload_2         
	//    6   10:getfield        #448 <Field long Metrics.minimizeGoal>
	//    7   13:lconst_1        
	//    8   14:ladd            
	//    9   15:putfield        #448 <Field long Metrics.minimizeGoal>
			metrics = sMetrics;
	//   10   18:getstatic       #177 <Field Metrics sMetrics>
	//   11   21:astore_2        
			metrics.maxVariables = Math.max(metrics.maxVariables, mNumColumns);
	//   12   22:aload_2         
	//   13   23:aload_2         
	//   14   24:getfield        #451 <Field long Metrics.maxVariables>
	//   15   27:aload_0         
	//   16   28:getfield        #58  <Field int mNumColumns>
	//   17   31:i2l             
	//   18   32:invokestatic    #228 <Method long Math.max(long, long)>
	//   19   35:putfield        #451 <Field long Metrics.maxVariables>
			metrics = sMetrics;
	//   20   38:getstatic       #177 <Field Metrics sMetrics>
	//   21   41:astore_2        
			metrics.maxRows = Math.max(metrics.maxRows, mNumRows);
	//   22   42:aload_2         
	//   23   43:aload_2         
	//   24   44:getfield        #454 <Field long Metrics.maxRows>
	//   25   47:aload_0         
	//   26   48:getfield        #60  <Field int mNumRows>
	//   27   51:i2l             
	//   28   52:invokestatic    #228 <Method long Math.max(long, long)>
	//   29   55:putfield        #454 <Field long Metrics.maxRows>
		}
		updateRowFromVariables((ArrayRow)row);
	//   30   58:aload_0         
	//   31   59:aload_1         
	//   32   60:checkcast       #72  <Class ArrayRow>
	//   33   63:invokespecial   #318 <Method void updateRowFromVariables(ArrayRow)>
		enforceBFS(row);
	//   34   66:aload_0         
	//   35   67:aload_1         
	//   36   68:invokespecial   #456 <Method int enforceBFS(LinearSystem$Row)>
	//   37   71:pop             
		optimize(row, false);
	//   38   72:aload_0         
	//   39   73:aload_1         
	//   40   74:iconst_0        
	//   41   75:invokespecial   #340 <Method int optimize(LinearSystem$Row, boolean)>
	//   42   78:pop             
		computeValues();
	//   43   79:aload_0         
	//   44   80:invokespecial   #446 <Method void computeValues()>
	//   45   83:return          
	}

	public void reset()
	{
		for(int i = 0; i < mCache.mIndexedVariables.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #82  <Field Cache mCache>
	//*   5    7:getfield        #190 <Field SolverVariable[] Cache.mIndexedVariables>
	//*   6   10:arraylength     
	//*   7   11:icmpge          39
		{
			SolverVariable solvervariable = mCache.mIndexedVariables[i];
	//    8   14:aload_0         
	//    9   15:getfield        #82  <Field Cache mCache>
	//   10   18:getfield        #190 <Field SolverVariable[] Cache.mIndexedVariables>
	//   11   21:iload_1         
	//   12   22:aaload          
	//   13   23:astore_2        
			if(solvervariable != null)
	//*  14   24:aload_2         
	//*  15   25:ifnull          32
				solvervariable.reset();
	//   16   28:aload_2         
	//   17   29:invokevirtual   #113 <Method void SolverVariable.reset()>
		}

	//   18   32:iload_1         
	//   19   33:iconst_1        
	//   20   34:iadd            
	//   21   35:istore_1        
	//*  22   36:goto            2
		mCache.solverVariablePool.releaseAll(((Object []) (mPoolVariables)), mPoolVariablesCount);
	//   23   39:aload_0         
	//   24   40:getfield        #82  <Field Cache mCache>
	//   25   43:getfield        #98  <Field Pools$Pool Cache.solverVariablePool>
	//   26   46:aload_0         
	//   27   47:getfield        #68  <Field SolverVariable[] mPoolVariables>
	//   28   50:aload_0         
	//   29   51:getfield        #70  <Field int mPoolVariablesCount>
	//   30   54:invokeinterface #460 <Method void Pools$Pool.releaseAll(Object[], int)>
		mPoolVariablesCount = 0;
	//   31   59:aload_0         
	//   32   60:iconst_0        
	//   33   61:putfield        #70  <Field int mPoolVariablesCount>
		Arrays.fill(((Object []) (mCache.mIndexedVariables)), ((Object) (null)));
	//   34   64:aload_0         
	//   35   65:getfield        #82  <Field Cache mCache>
	//   36   68:getfield        #190 <Field SolverVariable[] Cache.mIndexedVariables>
	//   37   71:aconst_null     
	//   38   72:invokestatic    #464 <Method void Arrays.fill(Object[], Object)>
		HashMap hashmap = mVariables;
	//   39   75:aload_0         
	//   40   76:getfield        #46  <Field HashMap mVariables>
	//   41   79:astore_2        
		if(hashmap != null)
	//*  42   80:aload_2         
	//*  43   81:ifnull          88
			hashmap.clear();
	//   44   84:aload_2         
	//   45   85:invokevirtual   #469 <Method void HashMap.clear()>
		mVariablesID = 0;
	//   46   88:aload_0         
	//   47   89:iconst_0        
	//   48   90:putfield        #44  <Field int mVariablesID>
		mGoal.clear();
	//   49   93:aload_0         
	//   50   94:getfield        #89  <Field LinearSystem$Row mGoal>
	//   51   97:invokeinterface #470 <Method void LinearSystem$Row.clear()>
		mNumColumns = 1;
	//   52  102:aload_0         
	//   53  103:iconst_1        
	//   54  104:putfield        #58  <Field int mNumColumns>
		for(int j = 0; j < mNumRows; j++)
	//*  55  107:iconst_0        
	//*  56  108:istore_1        
	//*  57  109:iload_1         
	//*  58  110:aload_0         
	//*  59  111:getfield        #60  <Field int mNumRows>
	//*  60  114:icmpge          134
			mRows[j].used = false;
	//   61  117:aload_0         
	//   62  118:getfield        #52  <Field ArrayRow[] mRows>
	//   63  121:iload_1         
	//   64  122:aaload          
	//   65  123:iconst_0        
	//   66  124:putfield        #473 <Field boolean ArrayRow.used>

	//   67  127:iload_1         
	//   68  128:iconst_1        
	//   69  129:iadd            
	//   70  130:istore_1        
	//*  71  131:goto            109
		releaseRows();
	//   72  134:aload_0         
	//   73  135:invokespecial   #77  <Method void releaseRows()>
		mNumRows = 0;
	//   74  138:aload_0         
	//   75  139:iconst_0        
	//   76  140:putfield        #60  <Field int mNumRows>
	//   77  143:return          
	}

	private static int POOL_SIZE = 1000;
	public static Metrics sMetrics;
	private int TABLE_SIZE;
	public boolean graphOptimizer;
	private boolean mAlreadyTestedCandidates[];
	final Cache mCache = new Cache();
	private Row mGoal;
	private int mMaxColumns;
	private int mMaxRows;
	int mNumColumns;
	int mNumRows;
	private SolverVariable mPoolVariables[];
	private int mPoolVariablesCount;
	ArrayRow mRows[];
	private final Row mTempGoal;
	private HashMap mVariables;
	int mVariablesID;
	private ArrayRow tempClientsCopy[];

	static 
	{
	//    0    0:return          
	}
}
