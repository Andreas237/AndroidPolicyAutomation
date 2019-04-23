// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver;

import android.support.constraint.solver.widgets.ConstraintAnchor;
import android.support.constraint.solver.widgets.ConstraintWidget;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;

// Referenced classes of package android.support.constraint.solver:
//			SolverVariable, ArrayRow, Cache, GoalRow, 
//			ArrayLinkedVariables, Metrics

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
	//    1    1:invokespecial   #45  <Method void Object()>
		mVariablesID = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #47  <Field int mVariablesID>
		mVariables = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #49  <Field HashMap mVariables>
		TABLE_SIZE = 32;
	//    8   14:aload_0         
	//    9   15:bipush          32
	//   10   17:putfield        #51  <Field int TABLE_SIZE>
		int i = TABLE_SIZE;
	//   11   20:aload_0         
	//   12   21:getfield        #51  <Field int TABLE_SIZE>
	//   13   24:istore_1        
		mMaxColumns = i;
	//   14   25:aload_0         
	//   15   26:iload_1         
	//   16   27:putfield        #53  <Field int mMaxColumns>
		mRows = null;
	//   17   30:aload_0         
	//   18   31:aconst_null     
	//   19   32:putfield        #55  <Field ArrayRow[] mRows>
		graphOptimizer = false;
	//   20   35:aload_0         
	//   21   36:iconst_0        
	//   22   37:putfield        #57  <Field boolean graphOptimizer>
		mAlreadyTestedCandidates = new boolean[i];
	//   23   40:aload_0         
	//   24   41:iload_1         
	//   25   42:newarray        boolean[]
	//   26   44:putfield        #59  <Field boolean[] mAlreadyTestedCandidates>
		mNumColumns = 1;
	//   27   47:aload_0         
	//   28   48:iconst_1        
	//   29   49:putfield        #61  <Field int mNumColumns>
		mNumRows = 0;
	//   30   52:aload_0         
	//   31   53:iconst_0        
	//   32   54:putfield        #63  <Field int mNumRows>
		mMaxRows = i;
	//   33   57:aload_0         
	//   34   58:iload_1         
	//   35   59:putfield        #65  <Field int mMaxRows>
		mPoolVariables = new SolverVariable[POOL_SIZE];
	//   36   62:aload_0         
	//   37   63:getstatic       #67  <Field int POOL_SIZE>
	//   38   66:anewarray       SolverVariable[]
	//   39   69:putfield        #71  <Field SolverVariable[] mPoolVariables>
		mPoolVariablesCount = 0;
	//   40   72:aload_0         
	//   41   73:iconst_0        
	//   42   74:putfield        #73  <Field int mPoolVariablesCount>
		tempClientsCopy = new ArrayRow[i];
	//   43   77:aload_0         
	//   44   78:iload_1         
	//   45   79:anewarray       ArrayRow[]
	//   46   82:putfield        #77  <Field ArrayRow[] tempClientsCopy>
		mRows = new ArrayRow[i];
	//   47   85:aload_0         
	//   48   86:iload_1         
	//   49   87:anewarray       ArrayRow[]
	//   50   90:putfield        #55  <Field ArrayRow[] mRows>
		releaseRows();
	//   51   93:aload_0         
	//   52   94:invokespecial   #80  <Method void releaseRows()>
	//   53   97:aload_0         
	//   54   98:new             #82  <Class Cache>
	//   55  101:dup             
	//   56  102:invokespecial   #83  <Method void Cache()>
	//   57  105:putfield        #85  <Field Cache mCache>
		mGoal = ((Row) (new GoalRow(mCache)));
	//   58  108:aload_0         
	//   59  109:new             #87  <Class GoalRow>
	//   60  112:dup             
	//   61  113:aload_0         
	//   62  114:getfield        #85  <Field Cache mCache>
	//   63  117:invokespecial   #90  <Method void GoalRow(Cache)>
	//   64  120:putfield        #92  <Field LinearSystem$Row mGoal>
		mTempGoal = ((Row) (new ArrayRow(mCache)));
	//   65  123:aload_0         
	//   66  124:new             #75  <Class ArrayRow>
	//   67  127:dup             
	//   68  128:aload_0         
	//   69  129:getfield        #85  <Field Cache mCache>
	//   70  132:invokespecial   #93  <Method void ArrayRow(Cache)>
	//   71  135:putfield        #95  <Field LinearSystem$Row mTempGoal>
	//   72  138:return          
	}

	private SolverVariable acquireSolverVariable(SolverVariable.Type type, String s)
	{
		SolverVariable solvervariable = (SolverVariable)mCache.solverVariablePool.acquire();
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field Cache mCache>
	//    2    4:getfield        #101 <Field Pools$Pool Cache.solverVariablePool>
	//    3    7:invokeinterface #107 <Method Object Pools$Pool.acquire()>
	//    4   12:checkcast       #69  <Class SolverVariable>
	//    5   15:astore          5
		if(solvervariable == null)
	//*   6   17:aload           5
	//*   7   19:ifnonnull       46
		{
			solvervariable = new SolverVariable(type, s);
	//    8   22:new             #69  <Class SolverVariable>
	//    9   25:dup             
	//   10   26:aload_1         
	//   11   27:aload_2         
	//   12   28:invokespecial   #110 <Method void SolverVariable(SolverVariable$Type, String)>
	//   13   31:astore          5
			solvervariable.setType(type, s);
	//   14   33:aload           5
	//   15   35:aload_1         
	//   16   36:aload_2         
	//   17   37:invokevirtual   #113 <Method void SolverVariable.setType(SolverVariable$Type, String)>
			type = ((SolverVariable.Type) (solvervariable));
	//   18   40:aload           5
	//   19   42:astore_1        
		} else
	//*  20   43:goto            61
		{
			solvervariable.reset();
	//   21   46:aload           5
	//   22   48:invokevirtual   #116 <Method void SolverVariable.reset()>
			solvervariable.setType(type, s);
	//   23   51:aload           5
	//   24   53:aload_1         
	//   25   54:aload_2         
	//   26   55:invokevirtual   #113 <Method void SolverVariable.setType(SolverVariable$Type, String)>
			type = ((SolverVariable.Type) (solvervariable));
	//   27   58:aload           5
	//   28   60:astore_1        
		}
		int i = mPoolVariablesCount;
	//   29   61:aload_0         
	//   30   62:getfield        #73  <Field int mPoolVariablesCount>
	//   31   65:istore_3        
		int j = POOL_SIZE;
	//   32   66:getstatic       #67  <Field int POOL_SIZE>
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
	//   40   81:putstatic       #67  <Field int POOL_SIZE>
			mPoolVariables = (SolverVariable[])Arrays.copyOf(((Object []) (mPoolVariables)), POOL_SIZE);
	//   41   84:aload_0         
	//   42   85:aload_0         
	//   43   86:getfield        #71  <Field SolverVariable[] mPoolVariables>
	//   44   89:getstatic       #67  <Field int POOL_SIZE>
	//   45   92:invokestatic    #122 <Method Object[] Arrays.copyOf(Object[], int)>
	//   46   95:checkcast       #123 <Class SolverVariable[]>
	//   47   98:putfield        #71  <Field SolverVariable[] mPoolVariables>
		}
		s = ((String) (mPoolVariables));
	//   48  101:aload_0         
	//   49  102:getfield        #71  <Field SolverVariable[] mPoolVariables>
	//   50  105:astore_2        
		i = mPoolVariablesCount;
	//   51  106:aload_0         
	//   52  107:getfield        #73  <Field int mPoolVariablesCount>
	//   53  110:istore_3        
		mPoolVariablesCount = i + 1;
	//   54  111:aload_0         
	//   55  112:iload_3         
	//   56  113:iconst_1        
	//   57  114:iadd            
	//   58  115:putfield        #73  <Field int mPoolVariablesCount>
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
	//    3    3:invokevirtual   #128 <Method ArrayRow ArrayRow.addError(LinearSystem, int)>
	//    4    6:pop             
	//    5    7:return          
	}

	private final void addRow(ArrayRow arrayrow)
	{
		if(mRows[mNumRows] != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field ArrayRow[] mRows>
	//*   2    4:aload_0         
	//*   3    5:getfield        #63  <Field int mNumRows>
	//*   4    8:aaload          
	//*   5    9:ifnull          34
			mCache.arrayRowPool.release(((Object) (mRows[mNumRows])));
	//    6   12:aload_0         
	//    7   13:getfield        #85  <Field Cache mCache>
	//    8   16:getfield        #132 <Field Pools$Pool Cache.arrayRowPool>
	//    9   19:aload_0         
	//   10   20:getfield        #55  <Field ArrayRow[] mRows>
	//   11   23:aload_0         
	//   12   24:getfield        #63  <Field int mNumRows>
	//   13   27:aaload          
	//   14   28:invokeinterface #136 <Method boolean Pools$Pool.release(Object)>
	//   15   33:pop             
		mRows[mNumRows] = arrayrow;
	//   16   34:aload_0         
	//   17   35:getfield        #55  <Field ArrayRow[] mRows>
	//   18   38:aload_0         
	//   19   39:getfield        #63  <Field int mNumRows>
	//   20   42:aload_1         
	//   21   43:aastore         
		SolverVariable solvervariable = arrayrow.variable;
	//   22   44:aload_1         
	//   23   45:getfield        #140 <Field SolverVariable ArrayRow.variable>
	//   24   48:astore_3        
		int i = mNumRows;
	//   25   49:aload_0         
	//   26   50:getfield        #63  <Field int mNumRows>
	//   27   53:istore_2        
		solvervariable.definitionId = i;
	//   28   54:aload_3         
	//   29   55:iload_2         
	//   30   56:putfield        #143 <Field int SolverVariable.definitionId>
		mNumRows = i + 1;
	//   31   59:aload_0         
	//   32   60:iload_2         
	//   33   61:iconst_1        
	//   34   62:iadd            
	//   35   63:putfield        #63  <Field int mNumRows>
		arrayrow.variable.updateReferencesWithNewDefinition(arrayrow);
	//   36   66:aload_1         
	//   37   67:getfield        #140 <Field SolverVariable ArrayRow.variable>
	//   38   70:aload_1         
	//   39   71:invokevirtual   #146 <Method void SolverVariable.updateReferencesWithNewDefinition(ArrayRow)>
	//   40   74:return          
	}

	private void addSingleError(ArrayRow arrayrow, int i)
	{
		addSingleError(arrayrow, i, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #151 <Method void addSingleError(ArrayRow, int, int)>
	//    5    7:return          
	}

	private void computeValues()
	{
		for(int i = 0; i < mNumRows; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #63  <Field int mNumRows>
	//*   5    7:icmpge          35
		{
			ArrayRow arrayrow = mRows[i];
	//    6   10:aload_0         
	//    7   11:getfield        #55  <Field ArrayRow[] mRows>
	//    8   14:iload_1         
	//    9   15:aaload          
	//   10   16:astore_2        
			arrayrow.variable.computedValue = arrayrow.constantValue;
	//   11   17:aload_2         
	//   12   18:getfield        #140 <Field SolverVariable ArrayRow.variable>
	//   13   21:aload_2         
	//   14   22:getfield        #156 <Field float ArrayRow.constantValue>
	//   15   25:putfield        #159 <Field float SolverVariable.computedValue>
		}

	//   16   28:iload_1         
	//   17   29:iconst_1        
	//   18   30:iadd            
	//   19   31:istore_1        
	//*  20   32:goto            2
	//   21   35:return          
	}

	public static ArrayRow createRowCentering(LinearSystem linearsystem, SolverVariable solvervariable, SolverVariable solvervariable1, int i, float f, SolverVariable solvervariable2, SolverVariable solvervariable3, int j, 
			boolean flag)
	{
		ArrayRow arrayrow = linearsystem.createRow();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #165 <Method ArrayRow createRow()>
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
	//   11   19:invokevirtual   #168 <Method ArrayRow ArrayRow.createRowCentering(SolverVariable, SolverVariable, int, float, SolverVariable, SolverVariable, int)>
	//   12   22:pop             
		if(flag)
	//*  13   23:iload           8
	//*  14   25:ifeq            36
			arrayrow.addError(linearsystem, 4);
	//   15   28:aload           9
	//   16   30:aload_0         
	//   17   31:iconst_4        
	//   18   32:invokevirtual   #128 <Method ArrayRow ArrayRow.addError(LinearSystem, int)>
	//   19   35:pop             
		return arrayrow;
	//   20   36:aload           9
	//   21   38:areturn         
	}

	public static ArrayRow createRowDimensionPercent(LinearSystem linearsystem, SolverVariable solvervariable, SolverVariable solvervariable1, SolverVariable solvervariable2, float f, boolean flag)
	{
		ArrayRow arrayrow = linearsystem.createRow();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #165 <Method ArrayRow createRow()>
	//    2    4:astore          6
		if(flag)
	//*   3    6:iload           5
	//*   4    8:ifeq            17
			linearsystem.addError(arrayrow);
	//    5   11:aload_0         
	//    6   12:aload           6
	//    7   14:invokespecial   #172 <Method void addError(ArrayRow)>
		return arrayrow.createRowDimensionPercent(solvervariable, solvervariable1, solvervariable2, f);
	//    8   17:aload           6
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:fload           4
	//   13   24:invokevirtual   #175 <Method ArrayRow ArrayRow.createRowDimensionPercent(SolverVariable, SolverVariable, SolverVariable, float)>
	//   14   27:areturn         
	}

	public static ArrayRow createRowEquals(LinearSystem linearsystem, SolverVariable solvervariable, SolverVariable solvervariable1, int i, boolean flag)
	{
		ArrayRow arrayrow = linearsystem.createRow();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #165 <Method ArrayRow createRow()>
	//    2    4:astore          5
		arrayrow.createRowEquals(solvervariable, solvervariable1, i);
	//    3    6:aload           5
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:iload_3         
	//    7   11:invokevirtual   #180 <Method ArrayRow ArrayRow.createRowEquals(SolverVariable, SolverVariable, int)>
	//    8   14:pop             
		if(flag)
	//*   9   15:iload           4
	//*  10   17:ifeq            27
			linearsystem.addSingleError(arrayrow, 1);
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:iconst_1        
	//   14   24:invokespecial   #182 <Method void addSingleError(ArrayRow, int)>
		return arrayrow;
	//   15   27:aload           5
	//   16   29:areturn         
	}

	public static ArrayRow createRowGreaterThan(LinearSystem linearsystem, SolverVariable solvervariable, SolverVariable solvervariable1, int i, boolean flag)
	{
		SolverVariable solvervariable2 = linearsystem.createSlackVariable();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #187 <Method SolverVariable createSlackVariable()>
	//    2    4:astore          5
		ArrayRow arrayrow = linearsystem.createRow();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #165 <Method ArrayRow createRow()>
	//    5   10:astore          6
		arrayrow.createRowGreaterThan(solvervariable, solvervariable1, solvervariable2, i);
	//    6   12:aload           6
	//    7   14:aload_1         
	//    8   15:aload_2         
	//    9   16:aload           5
	//   10   18:iload_3         
	//   11   19:invokevirtual   #190 <Method ArrayRow ArrayRow.createRowGreaterThan(SolverVariable, SolverVariable, SolverVariable, int)>
	//   12   22:pop             
		if(flag)
	//*  13   23:iload           4
	//*  14   25:ifeq            48
			linearsystem.addSingleError(arrayrow, (int)(arrayrow.variables.get(solvervariable2) * -1F));
	//   15   28:aload_0         
	//   16   29:aload           6
	//   17   31:aload           6
	//   18   33:getfield        #194 <Field ArrayLinkedVariables ArrayRow.variables>
	//   19   36:aload           5
	//   20   38:invokevirtual   #200 <Method float ArrayLinkedVariables.get(SolverVariable)>
	//   21   41:ldc1            #201 <Float -1F>
	//   22   43:fmul            
	//   23   44:f2i             
	//   24   45:invokespecial   #182 <Method void addSingleError(ArrayRow, int)>
		return arrayrow;
	//   25   48:aload           6
	//   26   50:areturn         
	}

	public static ArrayRow createRowLowerThan(LinearSystem linearsystem, SolverVariable solvervariable, SolverVariable solvervariable1, int i, boolean flag)
	{
		SolverVariable solvervariable2 = linearsystem.createSlackVariable();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #187 <Method SolverVariable createSlackVariable()>
	//    2    4:astore          5
		ArrayRow arrayrow = linearsystem.createRow();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #165 <Method ArrayRow createRow()>
	//    5   10:astore          6
		arrayrow.createRowLowerThan(solvervariable, solvervariable1, solvervariable2, i);
	//    6   12:aload           6
	//    7   14:aload_1         
	//    8   15:aload_2         
	//    9   16:aload           5
	//   10   18:iload_3         
	//   11   19:invokevirtual   #204 <Method ArrayRow ArrayRow.createRowLowerThan(SolverVariable, SolverVariable, SolverVariable, int)>
	//   12   22:pop             
		if(flag)
	//*  13   23:iload           4
	//*  14   25:ifeq            48
			linearsystem.addSingleError(arrayrow, (int)(arrayrow.variables.get(solvervariable2) * -1F));
	//   15   28:aload_0         
	//   16   29:aload           6
	//   17   31:aload           6
	//   18   33:getfield        #194 <Field ArrayLinkedVariables ArrayRow.variables>
	//   19   36:aload           5
	//   20   38:invokevirtual   #200 <Method float ArrayLinkedVariables.get(SolverVariable)>
	//   21   41:ldc1            #201 <Float -1F>
	//   22   43:fmul            
	//   23   44:f2i             
	//   24   45:invokespecial   #182 <Method void addSingleError(ArrayRow, int)>
		return arrayrow;
	//   25   48:aload           6
	//   26   50:areturn         
	}

	private SolverVariable createVariable(String s, SolverVariable.Type type)
	{
		Metrics metrics = sMetrics;
	//    0    0:getstatic       #208 <Field Metrics sMetrics>
	//    1    3:astore_3        
		if(metrics != null)
	//*   2    4:aload_3         
	//*   3    5:ifnull          18
			metrics.variables = metrics.variables + 1L;
	//    4    8:aload_3         
	//    5    9:aload_3         
	//    6   10:getfield        #213 <Field long Metrics.variables>
	//    7   13:lconst_1        
	//    8   14:ladd            
	//    9   15:putfield        #213 <Field long Metrics.variables>
		if(mNumColumns + 1 >= mMaxColumns)
	//*  10   18:aload_0         
	//*  11   19:getfield        #61  <Field int mNumColumns>
	//*  12   22:iconst_1        
	//*  13   23:iadd            
	//*  14   24:aload_0         
	//*  15   25:getfield        #53  <Field int mMaxColumns>
	//*  16   28:icmplt          35
			increaseTableSize();
	//   17   31:aload_0         
	//   18   32:invokespecial   #216 <Method void increaseTableSize()>
		type = ((SolverVariable.Type) (acquireSolverVariable(type, ((String) (null)))));
	//   19   35:aload_0         
	//   20   36:aload_2         
	//   21   37:aconst_null     
	//   22   38:invokespecial   #218 <Method SolverVariable acquireSolverVariable(SolverVariable$Type, String)>
	//   23   41:astore_2        
		((SolverVariable) (type)).setName(s);
	//   24   42:aload_2         
	//   25   43:aload_1         
	//   26   44:invokevirtual   #222 <Method void SolverVariable.setName(String)>
		mVariablesID = mVariablesID + 1;
	//   27   47:aload_0         
	//   28   48:aload_0         
	//   29   49:getfield        #47  <Field int mVariablesID>
	//   30   52:iconst_1        
	//   31   53:iadd            
	//   32   54:putfield        #47  <Field int mVariablesID>
		mNumColumns = mNumColumns + 1;
	//   33   57:aload_0         
	//   34   58:aload_0         
	//   35   59:getfield        #61  <Field int mNumColumns>
	//   36   62:iconst_1        
	//   37   63:iadd            
	//   38   64:putfield        #61  <Field int mNumColumns>
		type.id = mVariablesID;
	//   39   67:aload_2         
	//   40   68:aload_0         
	//   41   69:getfield        #47  <Field int mVariablesID>
	//   42   72:putfield        #225 <Field int SolverVariable.id>
		if(mVariables == null)
	//*  43   75:aload_0         
	//*  44   76:getfield        #49  <Field HashMap mVariables>
	//*  45   79:ifnonnull       93
			mVariables = new HashMap();
	//   46   82:aload_0         
	//   47   83:new             #227 <Class HashMap>
	//   48   86:dup             
	//   49   87:invokespecial   #228 <Method void HashMap()>
	//   50   90:putfield        #49  <Field HashMap mVariables>
		mVariables.put(((Object) (s)), ((Object) (type)));
	//   51   93:aload_0         
	//   52   94:getfield        #49  <Field HashMap mVariables>
	//   53   97:aload_1         
	//   54   98:aload_2         
	//   55   99:invokevirtual   #232 <Method Object HashMap.put(Object, Object)>
	//   56  102:pop             
		mCache.mIndexedVariables[mVariablesID] = ((SolverVariable) (type));
	//   57  103:aload_0         
	//   58  104:getfield        #85  <Field Cache mCache>
	//   59  107:getfield        #235 <Field SolverVariable[] Cache.mIndexedVariables>
	//   60  110:aload_0         
	//   61  111:getfield        #47  <Field int mVariablesID>
	//   62  114:aload_2         
	//   63  115:aastore         
		return ((SolverVariable) (type));
	//   64  116:aload_2         
	//   65  117:areturn         
	}

	private void displayRows()
	{
		displaySolverVariables();
	//    0    0:aload_0         
	//    1    1:invokespecial   #239 <Method void displaySolverVariables()>
		String s = "";
	//    2    4:ldc1            #241 <String "">
	//    3    6:astore_2        
		for(int i = 0; i < mNumRows; i++)
	//*   4    7:iconst_0        
	//*   5    8:istore_1        
	//*   6    9:iload_1         
	//*   7   10:aload_0         
	//*   8   11:getfield        #63  <Field int mNumRows>
	//*   9   14:icmpge          81
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   17:new             #243 <Class StringBuilder>
	//   11   20:dup             
	//   12   21:invokespecial   #244 <Method void StringBuilder()>
	//   13   24:astore_3        
			stringbuilder.append(s);
	//   14   25:aload_3         
	//   15   26:aload_2         
	//   16   27:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   17   30:pop             
			stringbuilder.append(((Object) (mRows[i])));
	//   18   31:aload_3         
	//   19   32:aload_0         
	//   20   33:getfield        #55  <Field ArrayRow[] mRows>
	//   21   36:iload_1         
	//   22   37:aaload          
	//   23   38:invokevirtual   #251 <Method StringBuilder StringBuilder.append(Object)>
	//   24   41:pop             
			s = stringbuilder.toString();
	//   25   42:aload_3         
	//   26   43:invokevirtual   #255 <Method String StringBuilder.toString()>
	//   27   46:astore_2        
			stringbuilder = new StringBuilder();
	//   28   47:new             #243 <Class StringBuilder>
	//   29   50:dup             
	//   30   51:invokespecial   #244 <Method void StringBuilder()>
	//   31   54:astore_3        
			stringbuilder.append(s);
	//   32   55:aload_3         
	//   33   56:aload_2         
	//   34   57:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   35   60:pop             
			stringbuilder.append("\n");
	//   36   61:aload_3         
	//   37   62:ldc2            #257 <String "\n">
	//   38   65:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   39   68:pop             
			s = stringbuilder.toString();
	//   40   69:aload_3         
	//   41   70:invokevirtual   #255 <Method String StringBuilder.toString()>
	//   42   73:astore_2        
		}

	//   43   74:iload_1         
	//   44   75:iconst_1        
	//   45   76:iadd            
	//   46   77:istore_1        
	//*  47   78:goto            9
		StringBuilder stringbuilder1 = new StringBuilder();
	//   48   81:new             #243 <Class StringBuilder>
	//   49   84:dup             
	//   50   85:invokespecial   #244 <Method void StringBuilder()>
	//   51   88:astore_3        
		stringbuilder1.append(s);
	//   52   89:aload_3         
	//   53   90:aload_2         
	//   54   91:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   55   94:pop             
		stringbuilder1.append(((Object) (mGoal)));
	//   56   95:aload_3         
	//   57   96:aload_0         
	//   58   97:getfield        #92  <Field LinearSystem$Row mGoal>
	//   59  100:invokevirtual   #251 <Method StringBuilder StringBuilder.append(Object)>
	//   60  103:pop             
		stringbuilder1.append("\n");
	//   61  104:aload_3         
	//   62  105:ldc2            #257 <String "\n">
	//   63  108:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   64  111:pop             
		s = stringbuilder1.toString();
	//   65  112:aload_3         
	//   66  113:invokevirtual   #255 <Method String StringBuilder.toString()>
	//   67  116:astore_2        
		System.out.println(s);
	//   68  117:getstatic       #263 <Field PrintStream System.out>
	//   69  120:aload_2         
	//   70  121:invokevirtual   #268 <Method void PrintStream.println(String)>
	//   71  124:return          
	}

	private void displaySolverVariables()
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #243 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #244 <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (obj)).append("Display Rows (");
	//    4    8:aload_1         
	//    5    9:ldc2            #270 <String "Display Rows (">
	//    6   12:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append(mNumRows);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #63  <Field int mNumRows>
	//   11   21:invokevirtual   #273 <Method StringBuilder StringBuilder.append(int)>
	//   12   24:pop             
		((StringBuilder) (obj)).append("x");
	//   13   25:aload_1         
	//   14   26:ldc2            #275 <String "x">
	//   15   29:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		((StringBuilder) (obj)).append(mNumColumns);
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #61  <Field int mNumColumns>
	//   20   38:invokevirtual   #273 <Method StringBuilder StringBuilder.append(int)>
	//   21   41:pop             
		((StringBuilder) (obj)).append(")\n");
	//   22   42:aload_1         
	//   23   43:ldc2            #277 <String ")\n">
	//   24   46:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   25   49:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   26   50:aload_1         
	//   27   51:invokevirtual   #255 <Method String StringBuilder.toString()>
	//   28   54:astore_1        
		System.out.println(((String) (obj)));
	//   29   55:getstatic       #263 <Field PrintStream System.out>
	//   30   58:aload_1         
	//   31   59:invokevirtual   #268 <Method void PrintStream.println(String)>
	//   32   62:return          
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
	//    4    6:getfield        #63  <Field int mNumRows>
	//    5    9:icmpge          64
				if(mRows[i].variable.mType != SolverVariable.Type.UNRESTRICTED && mRows[i].constantValue < 0.0F)
	//*   6   12:aload_0         
	//*   7   13:getfield        #55  <Field ArrayRow[] mRows>
	//*   8   16:iload           5
	//*   9   18:aaload          
	//*  10   19:getfield        #140 <Field SolverVariable ArrayRow.variable>
	//*  11   22:getfield        #285 <Field SolverVariable$Type SolverVariable.mType>
	//*  12   25:getstatic       #290 <Field SolverVariable$Type SolverVariable$Type.UNRESTRICTED>
	//*  13   28:if_acmpne       34
	//*  14   31:goto            55
	//*  15   34:aload_0         
	//*  16   35:getfield        #55  <Field ArrayRow[] mRows>
	//*  17   38:iload           5
	//*  18   40:aaload          
	//*  19   41:getfield        #156 <Field float ArrayRow.constantValue>
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
	//*  34   69:ifeq            524
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
	//   42   84:ifne            527
				row = ((Row) (sMetrics));
	//   43   87:getstatic       #208 <Field Metrics sMetrics>
	//   44   90:astore_1        
				if(row != null)
	//*  45   91:aload_1         
	//*  46   92:ifnull          105
					row.bfs = ((Metrics) (row)).bfs + 1L;
	//   47   95:aload_1         
	//   48   96:aload_1         
	//   49   97:getfield        #293 <Field long Metrics.bfs>
	//   50  100:lconst_1        
	//   51  101:ladd            
	//   52  102:putfield        #293 <Field long Metrics.bfs>
				int i2 = j + 1;
	//   53  105:iload           5
	//   54  107:iconst_1        
	//   55  108:iadd            
	//   56  109:istore          14
				float f = 3.402823E+38F;
	//   57  111:ldc2            #294 <Float 3.402823E+38F>
	//   58  114:fstore_2        
				j = -1;
	//   59  115:iconst_m1       
	//   60  116:istore          5
				k = j;
	//   61  118:iload           5
	//   62  120:istore          6
				int i1 = 0;
	//   63  122:iconst_0        
	//   64  123:istore          9
				boolean flag1;
				for(int l = 0; i1 < mNumRows; l = ((int) (flag1)))
	//*  65  125:iconst_0        
	//*  66  126:istore          7
	//*  67  128:iload           9
	//*  68  130:aload_0         
	//*  69  131:getfield        #63  <Field int mNumRows>
	//*  70  134:icmpge          422
				{
					row = ((Row) (mRows[i1]));
	//   71  137:aload_0         
	//   72  138:getfield        #55  <Field ArrayRow[] mRows>
	//   73  141:iload           9
	//   74  143:aaload          
	//   75  144:astore_1        
					float f1;
					int k1;
					int l1;
					if(((ArrayRow) (row)).variable.mType == SolverVariable.Type.UNRESTRICTED)
	//*  76  145:aload_1         
	//*  77  146:getfield        #140 <Field SolverVariable ArrayRow.variable>
	//*  78  149:getfield        #285 <Field SolverVariable$Type SolverVariable.mType>
	//*  79  152:getstatic       #290 <Field SolverVariable$Type SolverVariable$Type.UNRESTRICTED>
	//*  80  155:if_acmpne       175
					{
						k1 = j;
	//   81  158:iload           5
	//   82  160:istore          11
						l1 = k;
	//   83  162:iload           6
	//   84  164:istore          12
						f1 = f;
	//   85  166:fload_2         
	//   86  167:fstore_3        
						flag1 = ((boolean) (l));
	//   87  168:iload           7
	//   88  170:istore          13
					} else
	//*  89  172:goto            399
					if(((ArrayRow) (row)).isSimpleDefinition)
	//*  90  175:aload_1         
	//*  91  176:getfield        #297 <Field boolean ArrayRow.isSimpleDefinition>
	//*  92  179:ifeq            199
					{
						k1 = j;
	//   93  182:iload           5
	//   94  184:istore          11
						l1 = k;
	//   95  186:iload           6
	//   96  188:istore          12
						f1 = f;
	//   97  190:fload_2         
	//   98  191:fstore_3        
						flag1 = ((boolean) (l));
	//   99  192:iload           7
	//  100  194:istore          13
					} else
	//* 101  196:goto            399
					{
						k1 = j;
	//  102  199:iload           5
	//  103  201:istore          11
						l1 = k;
	//  104  203:iload           6
	//  105  205:istore          12
						f1 = f;
	//  106  207:fload_2         
	//  107  208:fstore_3        
						flag1 = ((boolean) (l));
	//  108  209:iload           7
	//  109  211:istore          13
						if(((ArrayRow) (row)).constantValue < 0.0F)
	//* 110  213:aload_1         
	//* 111  214:getfield        #156 <Field float ArrayRow.constantValue>
	//* 112  217:fconst_0        
	//* 113  218:fcmpg           
	//* 114  219:ifge            399
						{
							int j1 = 1;
	//  115  222:iconst_1        
	//  116  223:istore          10
label1:
							do
							{
label2:
								{
									k1 = j;
	//  117  225:iload           5
	//  118  227:istore          11
									l1 = k;
	//  119  229:iload           6
	//  120  231:istore          12
									f1 = f;
	//  121  233:fload_2         
	//  122  234:fstore_3        
									flag1 = ((boolean) (l));
	//  123  235:iload           7
	//  124  237:istore          13
									if(j1 >= mNumColumns)
										break label1;
	//  125  239:iload           10
	//  126  241:aload_0         
	//  127  242:getfield        #61  <Field int mNumColumns>
	//  128  245:icmpge          399
									SolverVariable solvervariable = mCache.mIndexedVariables[j1];
	//  129  248:aload_0         
	//  130  249:getfield        #85  <Field Cache mCache>
	//  131  252:getfield        #235 <Field SolverVariable[] Cache.mIndexedVariables>
	//  132  255:iload           10
	//  133  257:aaload          
	//  134  258:astore          15
									float f2 = ((ArrayRow) (row)).variables.get(solvervariable);
	//  135  260:aload_1         
	//  136  261:getfield        #194 <Field ArrayLinkedVariables ArrayRow.variables>
	//  137  264:aload           15
	//  138  266:invokevirtual   #200 <Method float ArrayLinkedVariables.get(SolverVariable)>
	//  139  269:fstore          4
									if(f2 <= 0.0F)
	//* 140  271:fload           4
	//* 141  273:fconst_0        
	//* 142  274:fcmpg           
	//* 143  275:ifgt            281
										break label2;
	//  144  278:goto            390
									l1 = l;
	//  145  281:iload           7
	//  146  283:istore          12
									flag1 = false;
	//  147  285:iconst_0        
	//  148  286:istore          13
									l = k;
	//  149  288:iload           6
	//  150  290:istore          7
									k1 = j;
	//  151  292:iload           5
	//  152  294:istore          11
									j = ((int) (flag1));
	//  153  296:iload           13
	//  154  298:istore          5
									for(k = l1; j < 7; k = l1)
	//* 155  300:iload           12
	//* 156  302:istore          6
	//* 157  304:iload           5
	//* 158  306:bipush          7
	//* 159  308:icmpge          374
									{
label3:
										{
											f1 = solvervariable.strengthVector[j] / f2;
	//  160  311:aload           15
	//  161  313:getfield        #301 <Field float[] SolverVariable.strengthVector>
	//  162  316:iload           5
	//  163  318:faload          
	//  164  319:fload           4
	//  165  321:fdiv            
	//  166  322:fstore_3        
											if(f1 >= f || j != k)
	//* 167  323:fload_3         
	//* 168  324:fload_2         
	//* 169  325:fcmpg           
	//* 170  326:ifge            336
	//* 171  329:iload           5
	//* 172  331:iload           6
	//* 173  333:icmpeq          347
											{
												l1 = k;
	//  174  336:iload           6
	//  175  338:istore          12
												if(j <= k)
													break label3;
	//  176  340:iload           5
	//  177  342:iload           6
	//  178  344:icmple          361
											}
											l = j1;
	//  179  347:iload           10
	//  180  349:istore          7
											k1 = i1;
	//  181  351:iload           9
	//  182  353:istore          11
											f = f1;
	//  183  355:fload_3         
	//  184  356:fstore_2        
											l1 = j;
	//  185  357:iload           5
	//  186  359:istore          12
										}
										j++;
	//  187  361:iload           5
	//  188  363:iconst_1        
	//  189  364:iadd            
	//  190  365:istore          5
									}

	//  191  367:iload           12
	//  192  369:istore          6
	//* 193  371:goto            304
									j = l;
	//  194  374:iload           7
	//  195  376:istore          5
									l = k;
	//  196  378:iload           6
	//  197  380:istore          7
									k = j;
	//  198  382:iload           5
	//  199  384:istore          6
									j = k1;
	//  200  386:iload           11
	//  201  388:istore          5
								}
								j1++;
	//  202  390:iload           10
	//  203  392:iconst_1        
	//  204  393:iadd            
	//  205  394:istore          10
							} while(true);
	//  206  396:goto            225
						}
					}
					i1++;
	//  207  399:iload           9
	//  208  401:iconst_1        
	//  209  402:iadd            
	//  210  403:istore          9
					j = k1;
	//  211  405:iload           11
	//  212  407:istore          5
					k = l1;
	//  213  409:iload           12
	//  214  411:istore          6
					f = f1;
	//  215  413:fload_3         
	//  216  414:fstore_2        
				}

	//  217  415:iload           13
	//  218  417:istore          7
	//* 219  419:goto            128
				if(j != -1)
	//* 220  422:iload           5
	//* 221  424:iconst_m1       
	//* 222  425:icmpeq          500
				{
					row = ((Row) (mRows[j]));
	//  223  428:aload_0         
	//  224  429:getfield        #55  <Field ArrayRow[] mRows>
	//  225  432:iload           5
	//  226  434:aaload          
	//  227  435:astore_1        
					((ArrayRow) (row)).variable.definitionId = -1;
	//  228  436:aload_1         
	//  229  437:getfield        #140 <Field SolverVariable ArrayRow.variable>
	//  230  440:iconst_m1       
	//  231  441:putfield        #143 <Field int SolverVariable.definitionId>
					Metrics metrics = sMetrics;
	//  232  444:getstatic       #208 <Field Metrics sMetrics>
	//  233  447:astore          15
					if(metrics != null)
	//* 234  449:aload           15
	//* 235  451:ifnull          466
						metrics.pivots = metrics.pivots + 1L;
	//  236  454:aload           15
	//  237  456:aload           15
	//  238  458:getfield        #304 <Field long Metrics.pivots>
	//  239  461:lconst_1        
	//  240  462:ladd            
	//  241  463:putfield        #304 <Field long Metrics.pivots>
					((ArrayRow) (row)).pivot(mCache.mIndexedVariables[k]);
	//  242  466:aload_1         
	//  243  467:aload_0         
	//  244  468:getfield        #85  <Field Cache mCache>
	//  245  471:getfield        #235 <Field SolverVariable[] Cache.mIndexedVariables>
	//  246  474:iload           6
	//  247  476:aaload          
	//  248  477:invokevirtual   #308 <Method void ArrayRow.pivot(SolverVariable)>
					((ArrayRow) (row)).variable.definitionId = j;
	//  249  480:aload_1         
	//  250  481:getfield        #140 <Field SolverVariable ArrayRow.variable>
	//  251  484:iload           5
	//  252  486:putfield        #143 <Field int SolverVariable.definitionId>
					((ArrayRow) (row)).variable.updateReferencesWithNewDefinition(((ArrayRow) (row)));
	//  253  489:aload_1         
	//  254  490:getfield        #140 <Field SolverVariable ArrayRow.variable>
	//  255  493:aload_1         
	//  256  494:invokevirtual   #146 <Method void SolverVariable.updateReferencesWithNewDefinition(ArrayRow)>
				} else
	//* 257  497:goto            503
				{
					flag = true;
	//  258  500:iconst_1        
	//  259  501:istore          8
				}
				if(i2 > mNumColumns / 2)
	//* 260  503:iload           14
	//* 261  505:aload_0         
	//* 262  506:getfield        #61  <Field int mNumColumns>
	//* 263  509:iconst_2        
	//* 264  510:idiv            
	//* 265  511:icmple          517
					flag = true;
	//  266  514:iconst_1        
	//  267  515:istore          8
				j = i2;
	//  268  517:iload           14
	//  269  519:istore          5
			} while(true);
	//  270  521:goto            78
		} else
		{
			k = 0;
	//  271  524:iconst_0        
	//  272  525:istore          6
		}
		return k;
	//  273  527:iload           6
	//  274  529:ireturn         
	}

	private String getDisplaySize(int i)
	{
		i *= 4;
	//    0    0:iload_1         
	//    1    1:iconst_4        
	//    2    2:imul            
	//    3    3:istore_1        
		int j = i / 1024;
	//    4    4:iload_1         
	//    5    5:sipush          1024
	//    6    8:idiv            
	//    7    9:istore_2        
		int k = j / 1024;
	//    8   10:iload_2         
	//    9   11:sipush          1024
	//   10   14:idiv            
	//   11   15:istore_3        
		if(k > 0)
	//*  12   16:iload_3         
	//*  13   17:ifle            59
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   14   20:new             #243 <Class StringBuilder>
	//   15   23:dup             
	//   16   24:invokespecial   #244 <Method void StringBuilder()>
	//   17   27:astore          4
			stringbuilder.append("");
	//   18   29:aload           4
	//   19   31:ldc1            #241 <String "">
	//   20   33:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   21   36:pop             
			stringbuilder.append(k);
	//   22   37:aload           4
	//   23   39:iload_3         
	//   24   40:invokevirtual   #273 <Method StringBuilder StringBuilder.append(int)>
	//   25   43:pop             
			stringbuilder.append(" Mb");
	//   26   44:aload           4
	//   27   46:ldc2            #313 <String " Mb">
	//   28   49:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   29   52:pop             
			return stringbuilder.toString();
	//   30   53:aload           4
	//   31   55:invokevirtual   #255 <Method String StringBuilder.toString()>
	//   32   58:areturn         
		}
		if(j > 0)
	//*  33   59:iload_2         
	//*  34   60:ifle            102
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   35   63:new             #243 <Class StringBuilder>
	//   36   66:dup             
	//   37   67:invokespecial   #244 <Method void StringBuilder()>
	//   38   70:astore          4
			stringbuilder1.append("");
	//   39   72:aload           4
	//   40   74:ldc1            #241 <String "">
	//   41   76:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   42   79:pop             
			stringbuilder1.append(j);
	//   43   80:aload           4
	//   44   82:iload_2         
	//   45   83:invokevirtual   #273 <Method StringBuilder StringBuilder.append(int)>
	//   46   86:pop             
			stringbuilder1.append(" Kb");
	//   47   87:aload           4
	//   48   89:ldc2            #315 <String " Kb">
	//   49   92:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   50   95:pop             
			return stringbuilder1.toString();
	//   51   96:aload           4
	//   52   98:invokevirtual   #255 <Method String StringBuilder.toString()>
	//   53  101:areturn         
		} else
		{
			StringBuilder stringbuilder2 = new StringBuilder();
	//   54  102:new             #243 <Class StringBuilder>
	//   55  105:dup             
	//   56  106:invokespecial   #244 <Method void StringBuilder()>
	//   57  109:astore          4
			stringbuilder2.append("");
	//   58  111:aload           4
	//   59  113:ldc1            #241 <String "">
	//   60  115:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   61  118:pop             
			stringbuilder2.append(i);
	//   62  119:aload           4
	//   63  121:iload_1         
	//   64  122:invokevirtual   #273 <Method StringBuilder StringBuilder.append(int)>
	//   65  125:pop             
			stringbuilder2.append(" bytes");
	//   66  126:aload           4
	//   67  128:ldc2            #317 <String " bytes">
	//   68  131:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   69  134:pop             
			return stringbuilder2.toString();
	//   70  135:aload           4
	//   71  137:invokevirtual   #255 <Method String StringBuilder.toString()>
	//   72  140:areturn         
		}
	}

	private String getDisplayStrength(int i)
	{
		if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          9
			return "LOW";
	//    3    5:ldc2            #320 <String "LOW">
	//    4    8:areturn         
		if(i == 2)
	//*   5    9:iload_1         
	//*   6   10:iconst_2        
	//*   7   11:icmpne          18
			return "MEDIUM";
	//    8   14:ldc2            #322 <String "MEDIUM">
	//    9   17:areturn         
		if(i == 3)
	//*  10   18:iload_1         
	//*  11   19:iconst_3        
	//*  12   20:icmpne          27
			return "HIGH";
	//   13   23:ldc2            #324 <String "HIGH">
	//   14   26:areturn         
		if(i == 4)
	//*  15   27:iload_1         
	//*  16   28:iconst_4        
	//*  17   29:icmpne          36
			return "HIGHEST";
	//   18   32:ldc2            #326 <String "HIGHEST">
	//   19   35:areturn         
		if(i == 5)
	//*  20   36:iload_1         
	//*  21   37:iconst_5        
	//*  22   38:icmpne          45
			return "EQUALITY";
	//   23   41:ldc2            #328 <String "EQUALITY">
	//   24   44:areturn         
		if(i == 6)
	//*  25   45:iload_1         
	//*  26   46:bipush          6
	//*  27   48:icmpne          55
			return "FIXED";
	//   28   51:ldc2            #330 <String "FIXED">
	//   29   54:areturn         
		else
			return "NONE";
	//   30   55:ldc2            #332 <String "NONE">
	//   31   58:areturn         
	}

	public static Metrics getMetrics()
	{
		return sMetrics;
	//    0    0:getstatic       #208 <Field Metrics sMetrics>
	//    1    3:areturn         
	}

	private void increaseTableSize()
	{
		TABLE_SIZE = TABLE_SIZE * 2;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #51  <Field int TABLE_SIZE>
	//    3    5:iconst_2        
	//    4    6:imul            
	//    5    7:putfield        #51  <Field int TABLE_SIZE>
		mRows = (ArrayRow[])Arrays.copyOf(((Object []) (mRows)), TABLE_SIZE);
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #55  <Field ArrayRow[] mRows>
	//    9   15:aload_0         
	//   10   16:getfield        #51  <Field int TABLE_SIZE>
	//   11   19:invokestatic    #122 <Method Object[] Arrays.copyOf(Object[], int)>
	//   12   22:checkcast       #335 <Class ArrayRow[]>
	//   13   25:putfield        #55  <Field ArrayRow[] mRows>
		Object obj = ((Object) (mCache));
	//   14   28:aload_0         
	//   15   29:getfield        #85  <Field Cache mCache>
	//   16   32:astore_2        
		obj.mIndexedVariables = (SolverVariable[])Arrays.copyOf(((Object []) (((Cache) (obj)).mIndexedVariables)), TABLE_SIZE);
	//   17   33:aload_2         
	//   18   34:aload_2         
	//   19   35:getfield        #235 <Field SolverVariable[] Cache.mIndexedVariables>
	//   20   38:aload_0         
	//   21   39:getfield        #51  <Field int TABLE_SIZE>
	//   22   42:invokestatic    #122 <Method Object[] Arrays.copyOf(Object[], int)>
	//   23   45:checkcast       #123 <Class SolverVariable[]>
	//   24   48:putfield        #235 <Field SolverVariable[] Cache.mIndexedVariables>
		int i = TABLE_SIZE;
	//   25   51:aload_0         
	//   26   52:getfield        #51  <Field int TABLE_SIZE>
	//   27   55:istore_1        
		mAlreadyTestedCandidates = new boolean[i];
	//   28   56:aload_0         
	//   29   57:iload_1         
	//   30   58:newarray        boolean[]
	//   31   60:putfield        #59  <Field boolean[] mAlreadyTestedCandidates>
		mMaxColumns = i;
	//   32   63:aload_0         
	//   33   64:iload_1         
	//   34   65:putfield        #53  <Field int mMaxColumns>
		mMaxRows = i;
	//   35   68:aload_0         
	//   36   69:iload_1         
	//   37   70:putfield        #65  <Field int mMaxRows>
		obj = ((Object) (sMetrics));
	//   38   73:getstatic       #208 <Field Metrics sMetrics>
	//   39   76:astore_2        
		if(obj != null)
	//*  40   77:aload_2         
	//*  41   78:ifnull          123
		{
			obj.tableSizeIncrease = ((Metrics) (obj)).tableSizeIncrease + 1L;
	//   42   81:aload_2         
	//   43   82:aload_2         
	//   44   83:getfield        #338 <Field long Metrics.tableSizeIncrease>
	//   45   86:lconst_1        
	//   46   87:ladd            
	//   47   88:putfield        #338 <Field long Metrics.tableSizeIncrease>
			obj = ((Object) (sMetrics));
	//   48   91:getstatic       #208 <Field Metrics sMetrics>
	//   49   94:astore_2        
			obj.maxTableSize = Math.max(((Metrics) (obj)).maxTableSize, TABLE_SIZE);
	//   50   95:aload_2         
	//   51   96:aload_2         
	//   52   97:getfield        #341 <Field long Metrics.maxTableSize>
	//   53  100:aload_0         
	//   54  101:getfield        #51  <Field int TABLE_SIZE>
	//   55  104:i2l             
	//   56  105:invokestatic    #347 <Method long Math.max(long, long)>
	//   57  108:putfield        #341 <Field long Metrics.maxTableSize>
			obj = ((Object) (sMetrics));
	//   58  111:getstatic       #208 <Field Metrics sMetrics>
	//   59  114:astore_2        
			obj.lastTableSize = ((Metrics) (obj)).maxTableSize;
	//   60  115:aload_2         
	//   61  116:aload_2         
	//   62  117:getfield        #341 <Field long Metrics.maxTableSize>
	//   63  120:putfield        #350 <Field long Metrics.lastTableSize>
		}
	//   64  123:return          
	}

	private final int optimize(Row row, boolean flag)
	{
		Metrics metrics = sMetrics;
	//    0    0:getstatic       #208 <Field Metrics sMetrics>
	//    1    3:astore          11
		if(metrics != null)
	//*   2    5:aload           11
	//*   3    7:ifnull          22
			metrics.optimize = metrics.optimize + 1L;
	//    4   10:aload           11
	//    5   12:aload           11
	//    6   14:getfield        #354 <Field long Metrics.optimize>
	//    7   17:lconst_1        
	//    8   18:ladd            
	//    9   19:putfield        #354 <Field long Metrics.optimize>
		for(int i = 0; i < mNumColumns; i++)
	//*  10   22:iconst_0        
	//*  11   23:istore          6
	//*  12   25:iload           6
	//*  13   27:aload_0         
	//*  14   28:getfield        #61  <Field int mNumColumns>
	//*  15   31:icmpge          51
			mAlreadyTestedCandidates[i] = false;
	//   16   34:aload_0         
	//   17   35:getfield        #59  <Field boolean[] mAlreadyTestedCandidates>
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
		int j = ((int) (flag1));
	//   28   54:iload           6
	//   29   56:istore          7
		while(!flag1) 
	//*  30   58:iload           6
	//*  31   60:ifne            441
		{
			Object obj = ((Object) (sMetrics));
	//   32   63:getstatic       #208 <Field Metrics sMetrics>
	//   33   66:astore          11
			if(obj != null)
	//*  34   68:aload           11
	//*  35   70:ifnull          85
				obj.iterations = ((Metrics) (obj)).iterations + 1L;
	//   36   73:aload           11
	//   37   75:aload           11
	//   38   77:getfield        #357 <Field long Metrics.iterations>
	//   39   80:lconst_1        
	//   40   81:ladd            
	//   41   82:putfield        #357 <Field long Metrics.iterations>
			int i1 = j + 1;
	//   42   85:iload           7
	//   43   87:iconst_1        
	//   44   88:iadd            
	//   45   89:istore          10
			if(i1 >= mNumColumns * 2)
	//*  46   91:iload           10
	//*  47   93:aload_0         
	//*  48   94:getfield        #61  <Field int mNumColumns>
	//*  49   97:iconst_2        
	//*  50   98:imul            
	//*  51   99:icmplt          105
				return i1;
	//   52  102:iload           10
	//   53  104:ireturn         
			if(row.getKey() != null)
	//*  54  105:aload_1         
	//*  55  106:invokeinterface #360 <Method SolverVariable LinearSystem$Row.getKey()>
	//*  56  111:ifnull          129
				mAlreadyTestedCandidates[row.getKey().id] = true;
	//   57  114:aload_0         
	//   58  115:getfield        #59  <Field boolean[] mAlreadyTestedCandidates>
	//   59  118:aload_1         
	//   60  119:invokeinterface #360 <Method SolverVariable LinearSystem$Row.getKey()>
	//   61  124:getfield        #225 <Field int SolverVariable.id>
	//   62  127:iconst_1        
	//   63  128:bastore         
			obj = ((Object) (row.getPivotCandidate(this, mAlreadyTestedCandidates)));
	//   64  129:aload_1         
	//   65  130:aload_0         
	//   66  131:aload_0         
	//   67  132:getfield        #59  <Field boolean[] mAlreadyTestedCandidates>
	//   68  135:invokeinterface #364 <Method SolverVariable LinearSystem$Row.getPivotCandidate(LinearSystem, boolean[])>
	//   69  140:astore          11
			if(obj != null)
	//*  70  142:aload           11
	//*  71  144:ifnull          174
			{
				if(mAlreadyTestedCandidates[((SolverVariable) (obj)).id])
	//*  72  147:aload_0         
	//*  73  148:getfield        #59  <Field boolean[] mAlreadyTestedCandidates>
	//*  74  151:aload           11
	//*  75  153:getfield        #225 <Field int SolverVariable.id>
	//*  76  156:baload          
	//*  77  157:ifeq            163
					return i1;
	//   78  160:iload           10
	//   79  162:ireturn         
				mAlreadyTestedCandidates[((SolverVariable) (obj)).id] = true;
	//   80  163:aload_0         
	//   81  164:getfield        #59  <Field boolean[] mAlreadyTestedCandidates>
	//   82  167:aload           11
	//   83  169:getfield        #225 <Field int SolverVariable.id>
	//   84  172:iconst_1        
	//   85  173:bastore         
			}
			if(obj != null)
	//*  86  174:aload           11
	//*  87  176:ifnull          431
			{
				float f = 3.402823E+38F;
	//   88  179:ldc2            #294 <Float 3.402823E+38F>
	//   89  182:fstore_3        
				int k = -1;
	//   90  183:iconst_m1       
	//   91  184:istore          8
				for(j = 0; j < mNumRows;)
	//*  92  186:iconst_0        
	//*  93  187:istore          7
	//*  94  189:iload           7
	//*  95  191:aload_0         
	//*  96  192:getfield        #63  <Field int mNumRows>
	//*  97  195:icmpge          341
				{
					ArrayRow arrayrow = mRows[j];
	//   98  198:aload_0         
	//   99  199:getfield        #55  <Field ArrayRow[] mRows>
	//  100  202:iload           7
	//  101  204:aaload          
	//  102  205:astore          12
					float f1;
					int l;
					if(arrayrow.variable.mType == SolverVariable.Type.UNRESTRICTED)
	//* 103  207:aload           12
	//* 104  209:getfield        #140 <Field SolverVariable ArrayRow.variable>
	//* 105  212:getfield        #285 <Field SolverVariable$Type SolverVariable.mType>
	//* 106  215:getstatic       #290 <Field SolverVariable$Type SolverVariable$Type.UNRESTRICTED>
	//* 107  218:if_acmpne       231
					{
						l = k;
	//  108  221:iload           8
	//  109  223:istore          9
						f1 = f;
	//  110  225:fload_3         
	//  111  226:fstore          4
					} else
	//* 112  228:goto            325
					if(arrayrow.isSimpleDefinition)
	//* 113  231:aload           12
	//* 114  233:getfield        #297 <Field boolean ArrayRow.isSimpleDefinition>
	//* 115  236:ifeq            249
					{
						l = k;
	//  116  239:iload           8
	//  117  241:istore          9
						f1 = f;
	//  118  243:fload_3         
	//  119  244:fstore          4
					} else
	//* 120  246:goto            325
					{
						l = k;
	//  121  249:iload           8
	//  122  251:istore          9
						f1 = f;
	//  123  253:fload_3         
	//  124  254:fstore          4
						if(arrayrow.hasVariable(((SolverVariable) (obj))))
	//* 125  256:aload           12
	//* 126  258:aload           11
	//* 127  260:invokevirtual   #368 <Method boolean ArrayRow.hasVariable(SolverVariable)>
	//* 128  263:ifeq            325
						{
							float f2 = arrayrow.variables.get(((SolverVariable) (obj)));
	//  129  266:aload           12
	//  130  268:getfield        #194 <Field ArrayLinkedVariables ArrayRow.variables>
	//  131  271:aload           11
	//  132  273:invokevirtual   #200 <Method float ArrayLinkedVariables.get(SolverVariable)>
	//  133  276:fstore          5
							l = k;
	//  134  278:iload           8
	//  135  280:istore          9
							f1 = f;
	//  136  282:fload_3         
	//  137  283:fstore          4
							if(f2 < 0.0F)
	//* 138  285:fload           5
	//* 139  287:fconst_0        
	//* 140  288:fcmpg           
	//* 141  289:ifge            325
							{
								f2 = -arrayrow.constantValue / f2;
	//  142  292:aload           12
	//  143  294:getfield        #156 <Field float ArrayRow.constantValue>
	//  144  297:fneg            
	//  145  298:fload           5
	//  146  300:fdiv            
	//  147  301:fstore          5
								l = k;
	//  148  303:iload           8
	//  149  305:istore          9
								f1 = f;
	//  150  307:fload_3         
	//  151  308:fstore          4
								if(f2 < f)
	//* 152  310:fload           5
	//* 153  312:fload_3         
	//* 154  313:fcmpg           
	//* 155  314:ifge            325
								{
									l = j;
	//  156  317:iload           7
	//  157  319:istore          9
									f1 = f2;
	//  158  321:fload           5
	//  159  323:fstore          4
								}
							}
						}
					}
					j++;
	//  160  325:iload           7
	//  161  327:iconst_1        
	//  162  328:iadd            
	//  163  329:istore          7
					k = l;
	//  164  331:iload           9
	//  165  333:istore          8
					f = f1;
	//  166  335:fload           4
	//  167  337:fstore_3        
				}

	//* 168  338:goto            189
				if(k > -1)
	//* 169  341:iload           8
	//* 170  343:iconst_m1       
	//* 171  344:icmple          421
				{
					ArrayRow arrayrow1 = mRows[k];
	//  172  347:aload_0         
	//  173  348:getfield        #55  <Field ArrayRow[] mRows>
	//  174  351:iload           8
	//  175  353:aaload          
	//  176  354:astore          12
					arrayrow1.variable.definitionId = -1;
	//  177  356:aload           12
	//  178  358:getfield        #140 <Field SolverVariable ArrayRow.variable>
	//  179  361:iconst_m1       
	//  180  362:putfield        #143 <Field int SolverVariable.definitionId>
					Metrics metrics1 = sMetrics;
	//  181  365:getstatic       #208 <Field Metrics sMetrics>
	//  182  368:astore          13
					if(metrics1 != null)
	//* 183  370:aload           13
	//* 184  372:ifnull          387
						metrics1.pivots = metrics1.pivots + 1L;
	//  185  375:aload           13
	//  186  377:aload           13
	//  187  379:getfield        #304 <Field long Metrics.pivots>
	//  188  382:lconst_1        
	//  189  383:ladd            
	//  190  384:putfield        #304 <Field long Metrics.pivots>
					arrayrow1.pivot(((SolverVariable) (obj)));
	//  191  387:aload           12
	//  192  389:aload           11
	//  193  391:invokevirtual   #308 <Method void ArrayRow.pivot(SolverVariable)>
					arrayrow1.variable.definitionId = k;
	//  194  394:aload           12
	//  195  396:getfield        #140 <Field SolverVariable ArrayRow.variable>
	//  196  399:iload           8
	//  197  401:putfield        #143 <Field int SolverVariable.definitionId>
					arrayrow1.variable.updateReferencesWithNewDefinition(arrayrow1);
	//  198  404:aload           12
	//  199  406:getfield        #140 <Field SolverVariable ArrayRow.variable>
	//  200  409:aload           12
	//  201  411:invokevirtual   #146 <Method void SolverVariable.updateReferencesWithNewDefinition(ArrayRow)>
					j = i1;
	//  202  414:iload           10
	//  203  416:istore          7
				} else
	//* 204  418:goto            58
				{
					flag1 = true;
	//  205  421:iconst_1        
	//  206  422:istore          6
					j = i1;
	//  207  424:iload           10
	//  208  426:istore          7
				}
			} else
	//* 209  428:goto            58
			{
				flag1 = true;
	//  210  431:iconst_1        
	//  211  432:istore          6
				j = i1;
	//  212  434:iload           10
	//  213  436:istore          7
			}
		}
	//* 214  438:goto            58
		return j;
	//  215  441:iload           7
	//  216  443:ireturn         
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
	//    3    3:getfield        #55  <Field ArrayRow[] mRows>
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
	//   16   22:getfield        #85  <Field Cache mCache>
	//   17   25:getfield        #132 <Field Pools$Pool Cache.arrayRowPool>
	//   18   28:aload_2         
	//   19   29:invokeinterface #136 <Method boolean Pools$Pool.release(Object)>
	//   20   34:pop             
				mRows[i] = null;
	//   21   35:aload_0         
	//   22   36:getfield        #55  <Field ArrayRow[] mRows>
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
	//*   1    1:getfield        #63  <Field int mNumRows>
	//*   2    4:ifle            34
		{
			arrayrow.variables.updateFromSystem(arrayrow, mRows);
	//    3    7:aload_1         
	//    4    8:getfield        #194 <Field ArrayLinkedVariables ArrayRow.variables>
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #55  <Field ArrayRow[] mRows>
	//    8   16:invokevirtual   #373 <Method void ArrayLinkedVariables.updateFromSystem(ArrayRow, ArrayRow[])>
			if(arrayrow.variables.currentSize == 0)
	//*   9   19:aload_1         
	//*  10   20:getfield        #194 <Field ArrayLinkedVariables ArrayRow.variables>
	//*  11   23:getfield        #376 <Field int ArrayLinkedVariables.currentSize>
	//*  12   26:ifne            34
				arrayrow.isSimpleDefinition = true;
	//   13   29:aload_1         
	//   14   30:iconst_1        
	//   15   31:putfield        #297 <Field boolean ArrayRow.isSimpleDefinition>
		}
	//   16   34:return          
	}

	public void addCenterPoint(ConstraintWidget constraintwidget, ConstraintWidget constraintwidget1, float f, int i)
	{
		SolverVariable solvervariable = createObjectVariable(((Object) (constraintwidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor.Type.LEFT))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #384 <Field android.support.constraint.solver.widgets.ConstraintAnchor$Type android.support.constraint.solver.widgets.ConstraintAnchor$Type.LEFT>
	//    3    5:invokevirtual   #390 <Method ConstraintAnchor ConstraintWidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor$Type)>
	//    4    8:invokevirtual   #394 <Method SolverVariable createObjectVariable(Object)>
	//    5   11:astore          11
		SolverVariable solvervariable2 = createObjectVariable(((Object) (constraintwidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor.Type.TOP))));
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:getstatic       #397 <Field android.support.constraint.solver.widgets.ConstraintAnchor$Type android.support.constraint.solver.widgets.ConstraintAnchor$Type.TOP>
	//    9   18:invokevirtual   #390 <Method ConstraintAnchor ConstraintWidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor$Type)>
	//   10   21:invokevirtual   #394 <Method SolverVariable createObjectVariable(Object)>
	//   11   24:astore          13
		SolverVariable solvervariable1 = createObjectVariable(((Object) (constraintwidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor.Type.RIGHT))));
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:getstatic       #400 <Field android.support.constraint.solver.widgets.ConstraintAnchor$Type android.support.constraint.solver.widgets.ConstraintAnchor$Type.RIGHT>
	//   15   31:invokevirtual   #390 <Method ConstraintAnchor ConstraintWidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor$Type)>
	//   16   34:invokevirtual   #394 <Method SolverVariable createObjectVariable(Object)>
	//   17   37:astore          12
		SolverVariable solvervariable4 = createObjectVariable(((Object) (constraintwidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor.Type.BOTTOM))));
	//   18   39:aload_0         
	//   19   40:aload_1         
	//   20   41:getstatic       #403 <Field android.support.constraint.solver.widgets.ConstraintAnchor$Type android.support.constraint.solver.widgets.ConstraintAnchor$Type.BOTTOM>
	//   21   44:invokevirtual   #390 <Method ConstraintAnchor ConstraintWidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor$Type)>
	//   22   47:invokevirtual   #394 <Method SolverVariable createObjectVariable(Object)>
	//   23   50:astore          15
		constraintwidget = ((ConstraintWidget) (createObjectVariable(((Object) (constraintwidget1.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor.Type.LEFT))))));
	//   24   52:aload_0         
	//   25   53:aload_2         
	//   26   54:getstatic       #384 <Field android.support.constraint.solver.widgets.ConstraintAnchor$Type android.support.constraint.solver.widgets.ConstraintAnchor$Type.LEFT>
	//   27   57:invokevirtual   #390 <Method ConstraintAnchor ConstraintWidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor$Type)>
	//   28   60:invokevirtual   #394 <Method SolverVariable createObjectVariable(Object)>
	//   29   63:astore_1        
		SolverVariable solvervariable5 = createObjectVariable(((Object) (constraintwidget1.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor.Type.TOP))));
	//   30   64:aload_0         
	//   31   65:aload_2         
	//   32   66:getstatic       #397 <Field android.support.constraint.solver.widgets.ConstraintAnchor$Type android.support.constraint.solver.widgets.ConstraintAnchor$Type.TOP>
	//   33   69:invokevirtual   #390 <Method ConstraintAnchor ConstraintWidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor$Type)>
	//   34   72:invokevirtual   #394 <Method SolverVariable createObjectVariable(Object)>
	//   35   75:astore          16
		SolverVariable solvervariable3 = createObjectVariable(((Object) (constraintwidget1.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor.Type.RIGHT))));
	//   36   77:aload_0         
	//   37   78:aload_2         
	//   38   79:getstatic       #400 <Field android.support.constraint.solver.widgets.ConstraintAnchor$Type android.support.constraint.solver.widgets.ConstraintAnchor$Type.RIGHT>
	//   39   82:invokevirtual   #390 <Method ConstraintAnchor ConstraintWidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor$Type)>
	//   40   85:invokevirtual   #394 <Method SolverVariable createObjectVariable(Object)>
	//   41   88:astore          14
		constraintwidget1 = ((ConstraintWidget) (createObjectVariable(((Object) (constraintwidget1.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor.Type.BOTTOM))))));
	//   42   90:aload_0         
	//   43   91:aload_2         
	//   44   92:getstatic       #403 <Field android.support.constraint.solver.widgets.ConstraintAnchor$Type android.support.constraint.solver.widgets.ConstraintAnchor$Type.BOTTOM>
	//   45   95:invokevirtual   #390 <Method ConstraintAnchor ConstraintWidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor$Type)>
	//   46   98:invokevirtual   #394 <Method SolverVariable createObjectVariable(Object)>
	//   47  101:astore_2        
		ArrayRow arrayrow = createRow();
	//   48  102:aload_0         
	//   49  103:invokevirtual   #165 <Method ArrayRow createRow()>
	//   50  106:astore          17
		double d = f;
	//   51  108:fload_3         
	//   52  109:f2d             
	//   53  110:dstore          5
		double d1 = Math.sin(d);
	//   54  112:dload           5
	//   55  114:invokestatic    #407 <Method double Math.sin(double)>
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
	//   69  139:invokevirtual   #411 <Method ArrayRow ArrayRow.createRowWithAngle(SolverVariable, SolverVariable, SolverVariable, SolverVariable, float)>
	//   70  142:pop             
		addConstraint(arrayrow);
	//   71  143:aload_0         
	//   72  144:aload           17
	//   73  146:invokevirtual   #414 <Method void addConstraint(ArrayRow)>
		constraintwidget1 = ((ConstraintWidget) (createRow()));
	//   74  149:aload_0         
	//   75  150:invokevirtual   #165 <Method ArrayRow createRow()>
	//   76  153:astore_2        
		((ArrayRow) (constraintwidget1)).createRowWithAngle(solvervariable, solvervariable1, ((SolverVariable) (constraintwidget)), solvervariable3, (float)(Math.cos(d) * d2));
	//   77  154:aload_2         
	//   78  155:aload           11
	//   79  157:aload           12
	//   80  159:aload_1         
	//   81  160:aload           14
	//   82  162:dload           5
	//   83  164:invokestatic    #417 <Method double Math.cos(double)>
	//   84  167:dload           9
	//   85  169:dmul            
	//   86  170:d2f             
	//   87  171:invokevirtual   #411 <Method ArrayRow ArrayRow.createRowWithAngle(SolverVariable, SolverVariable, SolverVariable, SolverVariable, float)>
	//   88  174:pop             
		addConstraint(((ArrayRow) (constraintwidget1)));
	//   89  175:aload_0         
	//   90  176:aload_2         
	//   91  177:invokevirtual   #414 <Method void addConstraint(ArrayRow)>
	//   92  180:return          
	}

	public void addCentering(SolverVariable solvervariable, SolverVariable solvervariable1, int i, float f, SolverVariable solvervariable2, SolverVariable solvervariable3, int j, 
			int k)
	{
		ArrayRow arrayrow = createRow();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #165 <Method ArrayRow createRow()>
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
	//   11   19:invokevirtual   #168 <Method ArrayRow ArrayRow.createRowCentering(SolverVariable, SolverVariable, int, float, SolverVariable, SolverVariable, int)>
	//   12   22:pop             
		if(k != 6)
	//*  13   23:iload           8
	//*  14   25:bipush          6
	//*  15   27:icmpeq          39
			arrayrow.addError(this, k);
	//   16   30:aload           9
	//   17   32:aload_0         
	//   18   33:iload           8
	//   19   35:invokevirtual   #128 <Method ArrayRow ArrayRow.addError(LinearSystem, int)>
	//   20   38:pop             
		addConstraint(arrayrow);
	//   21   39:aload_0         
	//   22   40:aload           9
	//   23   42:invokevirtual   #414 <Method void addConstraint(ArrayRow)>
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
	//    3    5:getstatic       #208 <Field Metrics sMetrics>
	//    4    8:astore          4
		if(metrics != null)
	//*   5   10:aload           4
	//*   6   12:ifnull          51
		{
			metrics.constraints = metrics.constraints + 1L;
	//    7   15:aload           4
	//    8   17:aload           4
	//    9   19:getfield        #422 <Field long Metrics.constraints>
	//   10   22:lconst_1        
	//   11   23:ladd            
	//   12   24:putfield        #422 <Field long Metrics.constraints>
			if(arrayrow.isSimpleDefinition)
	//*  13   27:aload_1         
	//*  14   28:getfield        #297 <Field boolean ArrayRow.isSimpleDefinition>
	//*  15   31:ifeq            51
			{
				Metrics metrics1 = sMetrics;
	//   16   34:getstatic       #208 <Field Metrics sMetrics>
	//   17   37:astore          4
				metrics1.simpleconstraints = metrics1.simpleconstraints + 1L;
	//   18   39:aload           4
	//   19   41:aload           4
	//   20   43:getfield        #425 <Field long Metrics.simpleconstraints>
	//   21   46:lconst_1        
	//   22   47:ladd            
	//   23   48:putfield        #425 <Field long Metrics.simpleconstraints>
			}
		}
		if(mNumRows + 1 >= mMaxRows || mNumColumns + 1 >= mMaxColumns)
	//*  24   51:aload_0         
	//*  25   52:getfield        #63  <Field int mNumRows>
	//*  26   55:iconst_1        
	//*  27   56:iadd            
	//*  28   57:aload_0         
	//*  29   58:getfield        #65  <Field int mMaxRows>
	//*  30   61:icmpge          77
	//*  31   64:aload_0         
	//*  32   65:getfield        #61  <Field int mNumColumns>
	//*  33   68:iconst_1        
	//*  34   69:iadd            
	//*  35   70:aload_0         
	//*  36   71:getfield        #53  <Field int mMaxColumns>
	//*  37   74:icmplt          81
			increaseTableSize();
	//   38   77:aload_0         
	//   39   78:invokespecial   #216 <Method void increaseTableSize()>
		boolean flag = false;
	//   40   81:iconst_0        
	//   41   82:istore_2        
		boolean flag1 = false;
	//   42   83:iconst_0        
	//   43   84:istore_3        
		if(!arrayrow.isSimpleDefinition)
	//*  44   85:aload_1         
	//*  45   86:getfield        #297 <Field boolean ArrayRow.isSimpleDefinition>
	//*  46   89:ifne            250
		{
			updateRowFromVariables(arrayrow);
	//   47   92:aload_0         
	//   48   93:aload_1         
	//   49   94:invokespecial   #427 <Method void updateRowFromVariables(ArrayRow)>
			if(arrayrow.isEmpty())
	//*  50   97:aload_1         
	//*  51   98:invokevirtual   #431 <Method boolean ArrayRow.isEmpty()>
	//*  52  101:ifeq            105
				return;
	//   53  104:return          
			arrayrow.ensurePositiveConstant();
	//   54  105:aload_1         
	//   55  106:invokevirtual   #434 <Method void ArrayRow.ensurePositiveConstant()>
			flag = flag1;
	//   56  109:iload_3         
	//   57  110:istore_2        
			if(arrayrow.chooseSubject(this))
	//*  58  111:aload_1         
	//*  59  112:aload_0         
	//*  60  113:invokevirtual   #438 <Method boolean ArrayRow.chooseSubject(LinearSystem)>
	//*  61  116:ifeq            242
			{
				SolverVariable solvervariable = createExtraVariable();
	//   62  119:aload_0         
	//   63  120:invokevirtual   #441 <Method SolverVariable createExtraVariable()>
	//   64  123:astore          4
				arrayrow.variable = solvervariable;
	//   65  125:aload_1         
	//   66  126:aload           4
	//   67  128:putfield        #140 <Field SolverVariable ArrayRow.variable>
				addRow(arrayrow);
	//   68  131:aload_0         
	//   69  132:aload_1         
	//   70  133:invokespecial   #443 <Method void addRow(ArrayRow)>
				mTempGoal.initFromRow(((Row) (arrayrow)));
	//   71  136:aload_0         
	//   72  137:getfield        #95  <Field LinearSystem$Row mTempGoal>
	//   73  140:aload_1         
	//   74  141:invokeinterface #447 <Method void LinearSystem$Row.initFromRow(LinearSystem$Row)>
				optimize(mTempGoal, true);
	//   75  146:aload_0         
	//   76  147:aload_0         
	//   77  148:getfield        #95  <Field LinearSystem$Row mTempGoal>
	//   78  151:iconst_1        
	//   79  152:invokespecial   #449 <Method int optimize(LinearSystem$Row, boolean)>
	//   80  155:pop             
				if(solvervariable.definitionId == -1)
	//*  81  156:aload           4
	//*  82  158:getfield        #143 <Field int SolverVariable.definitionId>
	//*  83  161:iconst_m1       
	//*  84  162:icmpne          240
				{
					if(arrayrow.variable == solvervariable)
	//*  85  165:aload_1         
	//*  86  166:getfield        #140 <Field SolverVariable ArrayRow.variable>
	//*  87  169:aload           4
	//*  88  171:if_acmpne       215
					{
						solvervariable = arrayrow.pickPivot(solvervariable);
	//   89  174:aload_1         
	//   90  175:aload           4
	//   91  177:invokevirtual   #453 <Method SolverVariable ArrayRow.pickPivot(SolverVariable)>
	//   92  180:astore          4
						if(solvervariable != null)
	//*  93  182:aload           4
	//*  94  184:ifnull          215
						{
							Metrics metrics2 = sMetrics;
	//   95  187:getstatic       #208 <Field Metrics sMetrics>
	//   96  190:astore          5
							if(metrics2 != null)
	//*  97  192:aload           5
	//*  98  194:ifnull          209
								metrics2.pivots = metrics2.pivots + 1L;
	//   99  197:aload           5
	//  100  199:aload           5
	//  101  201:getfield        #304 <Field long Metrics.pivots>
	//  102  204:lconst_1        
	//  103  205:ladd            
	//  104  206:putfield        #304 <Field long Metrics.pivots>
							arrayrow.pivot(solvervariable);
	//  105  209:aload_1         
	//  106  210:aload           4
	//  107  212:invokevirtual   #308 <Method void ArrayRow.pivot(SolverVariable)>
						}
					}
					if(!arrayrow.isSimpleDefinition)
	//* 108  215:aload_1         
	//* 109  216:getfield        #297 <Field boolean ArrayRow.isSimpleDefinition>
	//* 110  219:ifne            230
						arrayrow.variable.updateReferencesWithNewDefinition(arrayrow);
	//  111  222:aload_1         
	//  112  223:getfield        #140 <Field SolverVariable ArrayRow.variable>
	//  113  226:aload_1         
	//  114  227:invokevirtual   #146 <Method void SolverVariable.updateReferencesWithNewDefinition(ArrayRow)>
					mNumRows = mNumRows - 1;
	//  115  230:aload_0         
	//  116  231:aload_0         
	//  117  232:getfield        #63  <Field int mNumRows>
	//  118  235:iconst_1        
	//  119  236:isub            
	//  120  237:putfield        #63  <Field int mNumRows>
				}
				flag = true;
	//  121  240:iconst_1        
	//  122  241:istore_2        
			}
			if(!arrayrow.hasKeyVariable())
	//* 123  242:aload_1         
	//* 124  243:invokevirtual   #456 <Method boolean ArrayRow.hasKeyVariable()>
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
	//  131  256:invokespecial   #443 <Method void addRow(ArrayRow)>
	//  132  259:return          
	}

	public ArrayRow addEquality(SolverVariable solvervariable, SolverVariable solvervariable1, int i, int j)
	{
		ArrayRow arrayrow = createRow();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #165 <Method ArrayRow createRow()>
	//    2    4:astore          5
		arrayrow.createRowEquals(solvervariable, solvervariable1, i);
	//    3    6:aload           5
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:iload_3         
	//    7   11:invokevirtual   #180 <Method ArrayRow ArrayRow.createRowEquals(SolverVariable, SolverVariable, int)>
	//    8   14:pop             
		if(j != 6)
	//*   9   15:iload           4
	//*  10   17:bipush          6
	//*  11   19:icmpeq          31
			arrayrow.addError(this, j);
	//   12   22:aload           5
	//   13   24:aload_0         
	//   14   25:iload           4
	//   15   27:invokevirtual   #128 <Method ArrayRow ArrayRow.addError(LinearSystem, int)>
	//   16   30:pop             
		addConstraint(arrayrow);
	//   17   31:aload_0         
	//   18   32:aload           5
	//   19   34:invokevirtual   #414 <Method void addConstraint(ArrayRow)>
		return arrayrow;
	//   20   37:aload           5
	//   21   39:areturn         
	}

	public void addEquality(SolverVariable solvervariable, int i)
	{
		int j = solvervariable.definitionId;
	//    0    0:aload_1         
	//    1    1:getfield        #143 <Field int SolverVariable.definitionId>
	//    2    4:istore_3        
		if(solvervariable.definitionId != -1)
	//*   3    5:aload_1         
	//*   4    6:getfield        #143 <Field int SolverVariable.definitionId>
	//*   5    9:iconst_m1       
	//*   6   10:icmpeq          83
		{
			ArrayRow arrayrow = mRows[j];
	//    7   13:aload_0         
	//    8   14:getfield        #55  <Field ArrayRow[] mRows>
	//    9   17:iload_3         
	//   10   18:aaload          
	//   11   19:astore          4
			if(arrayrow.isSimpleDefinition)
	//*  12   21:aload           4
	//*  13   23:getfield        #297 <Field boolean ArrayRow.isSimpleDefinition>
	//*  14   26:ifeq            37
			{
				arrayrow.constantValue = i;
	//   15   29:aload           4
	//   16   31:iload_2         
	//   17   32:i2f             
	//   18   33:putfield        #156 <Field float ArrayRow.constantValue>
				return;
	//   19   36:return          
			}
			if(arrayrow.variables.currentSize == 0)
	//*  20   37:aload           4
	//*  21   39:getfield        #194 <Field ArrayLinkedVariables ArrayRow.variables>
	//*  22   42:getfield        #376 <Field int ArrayLinkedVariables.currentSize>
	//*  23   45:ifne            62
			{
				arrayrow.isSimpleDefinition = true;
	//   24   48:aload           4
	//   25   50:iconst_1        
	//   26   51:putfield        #297 <Field boolean ArrayRow.isSimpleDefinition>
				arrayrow.constantValue = i;
	//   27   54:aload           4
	//   28   56:iload_2         
	//   29   57:i2f             
	//   30   58:putfield        #156 <Field float ArrayRow.constantValue>
				return;
	//   31   61:return          
			} else
			{
				ArrayRow arrayrow1 = createRow();
	//   32   62:aload_0         
	//   33   63:invokevirtual   #165 <Method ArrayRow createRow()>
	//   34   66:astore          4
				arrayrow1.createRowEquals(solvervariable, i);
	//   35   68:aload           4
	//   36   70:aload_1         
	//   37   71:iload_2         
	//   38   72:invokevirtual   #462 <Method ArrayRow ArrayRow.createRowEquals(SolverVariable, int)>
	//   39   75:pop             
				addConstraint(arrayrow1);
	//   40   76:aload_0         
	//   41   77:aload           4
	//   42   79:invokevirtual   #414 <Method void addConstraint(ArrayRow)>
				return;
	//   43   82:return          
			}
		} else
		{
			ArrayRow arrayrow2 = createRow();
	//   44   83:aload_0         
	//   45   84:invokevirtual   #165 <Method ArrayRow createRow()>
	//   46   87:astore          4
			arrayrow2.createRowDefinition(solvervariable, i);
	//   47   89:aload           4
	//   48   91:aload_1         
	//   49   92:iload_2         
	//   50   93:invokevirtual   #465 <Method ArrayRow ArrayRow.createRowDefinition(SolverVariable, int)>
	//   51   96:pop             
			addConstraint(arrayrow2);
	//   52   97:aload_0         
	//   53   98:aload           4
	//   54  100:invokevirtual   #414 <Method void addConstraint(ArrayRow)>
			return;
	//   55  103:return          
		}
	}

	public void addEquality(SolverVariable solvervariable, int i, int j)
	{
		int k = solvervariable.definitionId;
	//    0    0:aload_1         
	//    1    1:getfield        #143 <Field int SolverVariable.definitionId>
	//    2    4:istore          4
		if(solvervariable.definitionId != -1)
	//*   3    6:aload_1         
	//*   4    7:getfield        #143 <Field int SolverVariable.definitionId>
	//*   5   10:iconst_m1       
	//*   6   11:icmpeq          68
		{
			ArrayRow arrayrow = mRows[k];
	//    7   14:aload_0         
	//    8   15:getfield        #55  <Field ArrayRow[] mRows>
	//    9   18:iload           4
	//   10   20:aaload          
	//   11   21:astore          5
			if(arrayrow.isSimpleDefinition)
	//*  12   23:aload           5
	//*  13   25:getfield        #297 <Field boolean ArrayRow.isSimpleDefinition>
	//*  14   28:ifeq            39
			{
				arrayrow.constantValue = i;
	//   15   31:aload           5
	//   16   33:iload_2         
	//   17   34:i2f             
	//   18   35:putfield        #156 <Field float ArrayRow.constantValue>
				return;
	//   19   38:return          
			} else
			{
				ArrayRow arrayrow1 = createRow();
	//   20   39:aload_0         
	//   21   40:invokevirtual   #165 <Method ArrayRow createRow()>
	//   22   43:astore          5
				arrayrow1.createRowEquals(solvervariable, i);
	//   23   45:aload           5
	//   24   47:aload_1         
	//   25   48:iload_2         
	//   26   49:invokevirtual   #462 <Method ArrayRow ArrayRow.createRowEquals(SolverVariable, int)>
	//   27   52:pop             
				arrayrow1.addError(this, j);
	//   28   53:aload           5
	//   29   55:aload_0         
	//   30   56:iload_3         
	//   31   57:invokevirtual   #128 <Method ArrayRow ArrayRow.addError(LinearSystem, int)>
	//   32   60:pop             
				addConstraint(arrayrow1);
	//   33   61:aload_0         
	//   34   62:aload           5
	//   35   64:invokevirtual   #414 <Method void addConstraint(ArrayRow)>
				return;
	//   36   67:return          
			}
		} else
		{
			ArrayRow arrayrow2 = createRow();
	//   37   68:aload_0         
	//   38   69:invokevirtual   #165 <Method ArrayRow createRow()>
	//   39   72:astore          5
			arrayrow2.createRowDefinition(solvervariable, i);
	//   40   74:aload           5
	//   41   76:aload_1         
	//   42   77:iload_2         
	//   43   78:invokevirtual   #465 <Method ArrayRow ArrayRow.createRowDefinition(SolverVariable, int)>
	//   44   81:pop             
			arrayrow2.addError(this, j);
	//   45   82:aload           5
	//   46   84:aload_0         
	//   47   85:iload_3         
	//   48   86:invokevirtual   #128 <Method ArrayRow ArrayRow.addError(LinearSystem, int)>
	//   49   89:pop             
			addConstraint(arrayrow2);
	//   50   90:aload_0         
	//   51   91:aload           5
	//   52   93:invokevirtual   #414 <Method void addConstraint(ArrayRow)>
			return;
	//   53   96:return          
		}
	}

	public void addGreaterBarrier(SolverVariable solvervariable, SolverVariable solvervariable1, boolean flag)
	{
		ArrayRow arrayrow = createRow();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #165 <Method ArrayRow createRow()>
	//    2    4:astore          4
		SolverVariable solvervariable2 = createSlackVariable();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #187 <Method SolverVariable createSlackVariable()>
	//    5   10:astore          5
		solvervariable2.strength = 0;
	//    6   12:aload           5
	//    7   14:iconst_0        
	//    8   15:putfield        #471 <Field int SolverVariable.strength>
		arrayrow.createRowGreaterThan(solvervariable, solvervariable1, solvervariable2, 0);
	//    9   18:aload           4
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:aload           5
	//   13   24:iconst_0        
	//   14   25:invokevirtual   #190 <Method ArrayRow ArrayRow.createRowGreaterThan(SolverVariable, SolverVariable, SolverVariable, int)>
	//   15   28:pop             
		if(flag)
	//*  16   29:iload_3         
	//*  17   30:ifeq            54
			addSingleError(arrayrow, (int)(arrayrow.variables.get(solvervariable2) * -1F), 1);
	//   18   33:aload_0         
	//   19   34:aload           4
	//   20   36:aload           4
	//   21   38:getfield        #194 <Field ArrayLinkedVariables ArrayRow.variables>
	//   22   41:aload           5
	//   23   43:invokevirtual   #200 <Method float ArrayLinkedVariables.get(SolverVariable)>
	//   24   46:ldc1            #201 <Float -1F>
	//   25   48:fmul            
	//   26   49:f2i             
	//   27   50:iconst_1        
	//   28   51:invokevirtual   #151 <Method void addSingleError(ArrayRow, int, int)>
		addConstraint(arrayrow);
	//   29   54:aload_0         
	//   30   55:aload           4
	//   31   57:invokevirtual   #414 <Method void addConstraint(ArrayRow)>
	//   32   60:return          
	}

	public void addGreaterThan(SolverVariable solvervariable, int i)
	{
		ArrayRow arrayrow = createRow();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #165 <Method ArrayRow createRow()>
	//    2    4:astore_3        
		SolverVariable solvervariable1 = createSlackVariable();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #187 <Method SolverVariable createSlackVariable()>
	//    5    9:astore          4
		solvervariable1.strength = 0;
	//    6   11:aload           4
	//    7   13:iconst_0        
	//    8   14:putfield        #471 <Field int SolverVariable.strength>
		arrayrow.createRowGreaterThan(solvervariable, i, solvervariable1);
	//    9   17:aload_3         
	//   10   18:aload_1         
	//   11   19:iload_2         
	//   12   20:aload           4
	//   13   22:invokevirtual   #475 <Method ArrayRow ArrayRow.createRowGreaterThan(SolverVariable, int, SolverVariable)>
	//   14   25:pop             
		addConstraint(arrayrow);
	//   15   26:aload_0         
	//   16   27:aload_3         
	//   17   28:invokevirtual   #414 <Method void addConstraint(ArrayRow)>
	//   18   31:return          
	}

	public void addGreaterThan(SolverVariable solvervariable, SolverVariable solvervariable1, int i, int j)
	{
		ArrayRow arrayrow = createRow();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #165 <Method ArrayRow createRow()>
	//    2    4:astore          5
		SolverVariable solvervariable2 = createSlackVariable();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #187 <Method SolverVariable createSlackVariable()>
	//    5   10:astore          6
		solvervariable2.strength = 0;
	//    6   12:aload           6
	//    7   14:iconst_0        
	//    8   15:putfield        #471 <Field int SolverVariable.strength>
		arrayrow.createRowGreaterThan(solvervariable, solvervariable1, solvervariable2, i);
	//    9   18:aload           5
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:aload           6
	//   13   24:iload_3         
	//   14   25:invokevirtual   #190 <Method ArrayRow ArrayRow.createRowGreaterThan(SolverVariable, SolverVariable, SolverVariable, int)>
	//   15   28:pop             
		if(j != 6)
	//*  16   29:iload           4
	//*  17   31:bipush          6
	//*  18   33:icmpeq          58
			addSingleError(arrayrow, (int)(arrayrow.variables.get(solvervariable2) * -1F), j);
	//   19   36:aload_0         
	//   20   37:aload           5
	//   21   39:aload           5
	//   22   41:getfield        #194 <Field ArrayLinkedVariables ArrayRow.variables>
	//   23   44:aload           6
	//   24   46:invokevirtual   #200 <Method float ArrayLinkedVariables.get(SolverVariable)>
	//   25   49:ldc1            #201 <Float -1F>
	//   26   51:fmul            
	//   27   52:f2i             
	//   28   53:iload           4
	//   29   55:invokevirtual   #151 <Method void addSingleError(ArrayRow, int, int)>
		addConstraint(arrayrow);
	//   30   58:aload_0         
	//   31   59:aload           5
	//   32   61:invokevirtual   #414 <Method void addConstraint(ArrayRow)>
	//   33   64:return          
	}

	public void addLowerBarrier(SolverVariable solvervariable, SolverVariable solvervariable1, boolean flag)
	{
		ArrayRow arrayrow = createRow();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #165 <Method ArrayRow createRow()>
	//    2    4:astore          4
		SolverVariable solvervariable2 = createSlackVariable();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #187 <Method SolverVariable createSlackVariable()>
	//    5   10:astore          5
		solvervariable2.strength = 0;
	//    6   12:aload           5
	//    7   14:iconst_0        
	//    8   15:putfield        #471 <Field int SolverVariable.strength>
		arrayrow.createRowLowerThan(solvervariable, solvervariable1, solvervariable2, 0);
	//    9   18:aload           4
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:aload           5
	//   13   24:iconst_0        
	//   14   25:invokevirtual   #204 <Method ArrayRow ArrayRow.createRowLowerThan(SolverVariable, SolverVariable, SolverVariable, int)>
	//   15   28:pop             
		if(flag)
	//*  16   29:iload_3         
	//*  17   30:ifeq            54
			addSingleError(arrayrow, (int)(arrayrow.variables.get(solvervariable2) * -1F), 1);
	//   18   33:aload_0         
	//   19   34:aload           4
	//   20   36:aload           4
	//   21   38:getfield        #194 <Field ArrayLinkedVariables ArrayRow.variables>
	//   22   41:aload           5
	//   23   43:invokevirtual   #200 <Method float ArrayLinkedVariables.get(SolverVariable)>
	//   24   46:ldc1            #201 <Float -1F>
	//   25   48:fmul            
	//   26   49:f2i             
	//   27   50:iconst_1        
	//   28   51:invokevirtual   #151 <Method void addSingleError(ArrayRow, int, int)>
		addConstraint(arrayrow);
	//   29   54:aload_0         
	//   30   55:aload           4
	//   31   57:invokevirtual   #414 <Method void addConstraint(ArrayRow)>
	//   32   60:return          
	}

	public void addLowerThan(SolverVariable solvervariable, SolverVariable solvervariable1, int i, int j)
	{
		ArrayRow arrayrow = createRow();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #165 <Method ArrayRow createRow()>
	//    2    4:astore          5
		SolverVariable solvervariable2 = createSlackVariable();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #187 <Method SolverVariable createSlackVariable()>
	//    5   10:astore          6
		solvervariable2.strength = 0;
	//    6   12:aload           6
	//    7   14:iconst_0        
	//    8   15:putfield        #471 <Field int SolverVariable.strength>
		arrayrow.createRowLowerThan(solvervariable, solvervariable1, solvervariable2, i);
	//    9   18:aload           5
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:aload           6
	//   13   24:iload_3         
	//   14   25:invokevirtual   #204 <Method ArrayRow ArrayRow.createRowLowerThan(SolverVariable, SolverVariable, SolverVariable, int)>
	//   15   28:pop             
		if(j != 6)
	//*  16   29:iload           4
	//*  17   31:bipush          6
	//*  18   33:icmpeq          58
			addSingleError(arrayrow, (int)(arrayrow.variables.get(solvervariable2) * -1F), j);
	//   19   36:aload_0         
	//   20   37:aload           5
	//   21   39:aload           5
	//   22   41:getfield        #194 <Field ArrayLinkedVariables ArrayRow.variables>
	//   23   44:aload           6
	//   24   46:invokevirtual   #200 <Method float ArrayLinkedVariables.get(SolverVariable)>
	//   25   49:ldc1            #201 <Float -1F>
	//   26   51:fmul            
	//   27   52:f2i             
	//   28   53:iload           4
	//   29   55:invokevirtual   #151 <Method void addSingleError(ArrayRow, int, int)>
		addConstraint(arrayrow);
	//   30   58:aload_0         
	//   31   59:aload           5
	//   32   61:invokevirtual   #414 <Method void addConstraint(ArrayRow)>
	//   33   64:return          
	}

	public void addRatio(SolverVariable solvervariable, SolverVariable solvervariable1, SolverVariable solvervariable2, SolverVariable solvervariable3, float f, int i)
	{
		ArrayRow arrayrow = createRow();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #165 <Method ArrayRow createRow()>
	//    2    4:astore          7
		arrayrow.createRowDimensionRatio(solvervariable, solvervariable1, solvervariable2, solvervariable3, f);
	//    3    6:aload           7
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aload           4
	//    8   13:fload           5
	//    9   15:invokevirtual   #483 <Method ArrayRow ArrayRow.createRowDimensionRatio(SolverVariable, SolverVariable, SolverVariable, SolverVariable, float)>
	//   10   18:pop             
		if(i != 6)
	//*  11   19:iload           6
	//*  12   21:bipush          6
	//*  13   23:icmpeq          35
			arrayrow.addError(this, i);
	//   14   26:aload           7
	//   15   28:aload_0         
	//   16   29:iload           6
	//   17   31:invokevirtual   #128 <Method ArrayRow ArrayRow.addError(LinearSystem, int)>
	//   18   34:pop             
		addConstraint(arrayrow);
	//   19   35:aload_0         
	//   20   36:aload           7
	//   21   38:invokevirtual   #414 <Method void addConstraint(ArrayRow)>
	//   22   41:return          
	}

	void addSingleError(ArrayRow arrayrow, int i, int j)
	{
		arrayrow.addSingleError(createErrorVariable(j, ((String) (null))), i);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:iload_3         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #487 <Method SolverVariable createErrorVariable(int, String)>
	//    5    7:iload_2         
	//    6    8:invokevirtual   #489 <Method ArrayRow ArrayRow.addSingleError(SolverVariable, int)>
	//    7   11:pop             
	//    8   12:return          
	}

	public SolverVariable createErrorVariable(int i, String s)
	{
		Metrics metrics = sMetrics;
	//    0    0:getstatic       #208 <Field Metrics sMetrics>
	//    1    3:astore_3        
		if(metrics != null)
	//*   2    4:aload_3         
	//*   3    5:ifnull          18
			metrics.errors = metrics.errors + 1L;
	//    4    8:aload_3         
	//    5    9:aload_3         
	//    6   10:getfield        #492 <Field long Metrics.errors>
	//    7   13:lconst_1        
	//    8   14:ladd            
	//    9   15:putfield        #492 <Field long Metrics.errors>
		if(mNumColumns + 1 >= mMaxColumns)
	//*  10   18:aload_0         
	//*  11   19:getfield        #61  <Field int mNumColumns>
	//*  12   22:iconst_1        
	//*  13   23:iadd            
	//*  14   24:aload_0         
	//*  15   25:getfield        #53  <Field int mMaxColumns>
	//*  16   28:icmplt          35
			increaseTableSize();
	//   17   31:aload_0         
	//   18   32:invokespecial   #216 <Method void increaseTableSize()>
		s = ((String) (acquireSolverVariable(SolverVariable.Type.ERROR, s)));
	//   19   35:aload_0         
	//   20   36:getstatic       #495 <Field SolverVariable$Type SolverVariable$Type.ERROR>
	//   21   39:aload_2         
	//   22   40:invokespecial   #218 <Method SolverVariable acquireSolverVariable(SolverVariable$Type, String)>
	//   23   43:astore_2        
		mVariablesID = mVariablesID + 1;
	//   24   44:aload_0         
	//   25   45:aload_0         
	//   26   46:getfield        #47  <Field int mVariablesID>
	//   27   49:iconst_1        
	//   28   50:iadd            
	//   29   51:putfield        #47  <Field int mVariablesID>
		mNumColumns = mNumColumns + 1;
	//   30   54:aload_0         
	//   31   55:aload_0         
	//   32   56:getfield        #61  <Field int mNumColumns>
	//   33   59:iconst_1        
	//   34   60:iadd            
	//   35   61:putfield        #61  <Field int mNumColumns>
		s.id = mVariablesID;
	//   36   64:aload_2         
	//   37   65:aload_0         
	//   38   66:getfield        #47  <Field int mVariablesID>
	//   39   69:putfield        #225 <Field int SolverVariable.id>
		s.strength = i;
	//   40   72:aload_2         
	//   41   73:iload_1         
	//   42   74:putfield        #471 <Field int SolverVariable.strength>
		mCache.mIndexedVariables[mVariablesID] = ((SolverVariable) (s));
	//   43   77:aload_0         
	//   44   78:getfield        #85  <Field Cache mCache>
	//   45   81:getfield        #235 <Field SolverVariable[] Cache.mIndexedVariables>
	//   46   84:aload_0         
	//   47   85:getfield        #47  <Field int mVariablesID>
	//   48   88:aload_2         
	//   49   89:aastore         
		mGoal.addError(((SolverVariable) (s)));
	//   50   90:aload_0         
	//   51   91:getfield        #92  <Field LinearSystem$Row mGoal>
	//   52   94:aload_2         
	//   53   95:invokeinterface #497 <Method void LinearSystem$Row.addError(SolverVariable)>
		return ((SolverVariable) (s));
	//   54  100:aload_2         
	//   55  101:areturn         
	}

	public SolverVariable createExtraVariable()
	{
		Object obj = ((Object) (sMetrics));
	//    0    0:getstatic       #208 <Field Metrics sMetrics>
	//    1    3:astore_1        
		if(obj != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          18
			obj.extravariables = ((Metrics) (obj)).extravariables + 1L;
	//    4    8:aload_1         
	//    5    9:aload_1         
	//    6   10:getfield        #500 <Field long Metrics.extravariables>
	//    7   13:lconst_1        
	//    8   14:ladd            
	//    9   15:putfield        #500 <Field long Metrics.extravariables>
		if(mNumColumns + 1 >= mMaxColumns)
	//*  10   18:aload_0         
	//*  11   19:getfield        #61  <Field int mNumColumns>
	//*  12   22:iconst_1        
	//*  13   23:iadd            
	//*  14   24:aload_0         
	//*  15   25:getfield        #53  <Field int mMaxColumns>
	//*  16   28:icmplt          35
			increaseTableSize();
	//   17   31:aload_0         
	//   18   32:invokespecial   #216 <Method void increaseTableSize()>
		obj = ((Object) (acquireSolverVariable(SolverVariable.Type.SLACK, ((String) (null)))));
	//   19   35:aload_0         
	//   20   36:getstatic       #503 <Field SolverVariable$Type SolverVariable$Type.SLACK>
	//   21   39:aconst_null     
	//   22   40:invokespecial   #218 <Method SolverVariable acquireSolverVariable(SolverVariable$Type, String)>
	//   23   43:astore_1        
		mVariablesID = mVariablesID + 1;
	//   24   44:aload_0         
	//   25   45:aload_0         
	//   26   46:getfield        #47  <Field int mVariablesID>
	//   27   49:iconst_1        
	//   28   50:iadd            
	//   29   51:putfield        #47  <Field int mVariablesID>
		mNumColumns = mNumColumns + 1;
	//   30   54:aload_0         
	//   31   55:aload_0         
	//   32   56:getfield        #61  <Field int mNumColumns>
	//   33   59:iconst_1        
	//   34   60:iadd            
	//   35   61:putfield        #61  <Field int mNumColumns>
		obj.id = mVariablesID;
	//   36   64:aload_1         
	//   37   65:aload_0         
	//   38   66:getfield        #47  <Field int mVariablesID>
	//   39   69:putfield        #225 <Field int SolverVariable.id>
		mCache.mIndexedVariables[mVariablesID] = ((SolverVariable) (obj));
	//   40   72:aload_0         
	//   41   73:getfield        #85  <Field Cache mCache>
	//   42   76:getfield        #235 <Field SolverVariable[] Cache.mIndexedVariables>
	//   43   79:aload_0         
	//   44   80:getfield        #47  <Field int mVariablesID>
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
	//*   7    9:getfield        #61  <Field int mNumColumns>
	//*   8   12:iconst_1        
	//*   9   13:iadd            
	//*  10   14:aload_0         
	//*  11   15:getfield        #53  <Field int mMaxColumns>
	//*  12   18:icmplt          25
				increaseTableSize();
	//   13   21:aload_0         
	//   14   22:invokespecial   #216 <Method void increaseTableSize()>
			if(!(obj instanceof ConstraintAnchor))
				break label0;
	//   15   25:aload_1         
	//   16   26:instanceof      #505 <Class ConstraintAnchor>
	//   17   29:ifeq            159
			ConstraintAnchor constraintanchor = (ConstraintAnchor)obj;
	//   18   32:aload_1         
	//   19   33:checkcast       #505 <Class ConstraintAnchor>
	//   20   36:astore_3        
			obj1 = ((Object) (constraintanchor.getSolverVariable()));
	//   21   37:aload_3         
	//   22   38:invokevirtual   #508 <Method SolverVariable ConstraintAnchor.getSolverVariable()>
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
	//   30   50:getfield        #85  <Field Cache mCache>
	//   31   53:invokevirtual   #511 <Method void ConstraintAnchor.resetSolverVariable(Cache)>
				obj = ((Object) (constraintanchor.getSolverVariable()));
	//   32   56:aload_3         
	//   33   57:invokevirtual   #508 <Method SolverVariable ConstraintAnchor.getSolverVariable()>
	//   34   60:astore_1        
			}
			if(((SolverVariable) (obj)).id != -1 && ((SolverVariable) (obj)).id <= mVariablesID)
	//*  35   61:aload_1         
	//*  36   62:getfield        #225 <Field int SolverVariable.id>
	//*  37   65:iconst_m1       
	//*  38   66:icmpeq          97
	//*  39   69:aload_1         
	//*  40   70:getfield        #225 <Field int SolverVariable.id>
	//*  41   73:aload_0         
	//*  42   74:getfield        #47  <Field int mVariablesID>
	//*  43   77:icmpgt          97
			{
				obj1 = obj;
	//   44   80:aload_1         
	//   45   81:astore_2        
				if(mCache.mIndexedVariables[((SolverVariable) (obj)).id] != null)
					break label0;
	//   46   82:aload_0         
	//   47   83:getfield        #85  <Field Cache mCache>
	//   48   86:getfield        #235 <Field SolverVariable[] Cache.mIndexedVariables>
	//   49   89:aload_1         
	//   50   90:getfield        #225 <Field int SolverVariable.id>
	//   51   93:aaload          
	//   52   94:ifnonnull       159
			}
			if(((SolverVariable) (obj)).id != -1)
	//*  53   97:aload_1         
	//*  54   98:getfield        #225 <Field int SolverVariable.id>
	//*  55  101:iconst_m1       
	//*  56  102:icmpeq          109
				((SolverVariable) (obj)).reset();
	//   57  105:aload_1         
	//   58  106:invokevirtual   #116 <Method void SolverVariable.reset()>
			mVariablesID = mVariablesID + 1;
	//   59  109:aload_0         
	//   60  110:aload_0         
	//   61  111:getfield        #47  <Field int mVariablesID>
	//   62  114:iconst_1        
	//   63  115:iadd            
	//   64  116:putfield        #47  <Field int mVariablesID>
			mNumColumns = mNumColumns + 1;
	//   65  119:aload_0         
	//   66  120:aload_0         
	//   67  121:getfield        #61  <Field int mNumColumns>
	//   68  124:iconst_1        
	//   69  125:iadd            
	//   70  126:putfield        #61  <Field int mNumColumns>
			obj.id = mVariablesID;
	//   71  129:aload_1         
	//   72  130:aload_0         
	//   73  131:getfield        #47  <Field int mVariablesID>
	//   74  134:putfield        #225 <Field int SolverVariable.id>
			obj.mType = SolverVariable.Type.UNRESTRICTED;
	//   75  137:aload_1         
	//   76  138:getstatic       #290 <Field SolverVariable$Type SolverVariable$Type.UNRESTRICTED>
	//   77  141:putfield        #285 <Field SolverVariable$Type SolverVariable.mType>
			mCache.mIndexedVariables[mVariablesID] = ((SolverVariable) (obj));
	//   78  144:aload_0         
	//   79  145:getfield        #85  <Field Cache mCache>
	//   80  148:getfield        #235 <Field SolverVariable[] Cache.mIndexedVariables>
	//   81  151:aload_0         
	//   82  152:getfield        #47  <Field int mVariablesID>
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
	//    1    1:getfield        #85  <Field Cache mCache>
	//    2    4:getfield        #132 <Field Pools$Pool Cache.arrayRowPool>
	//    3    7:invokeinterface #107 <Method Object Pools$Pool.acquire()>
	//    4   12:checkcast       #75  <Class ArrayRow>
	//    5   15:astore_1        
		if(arrayrow == null)
	//*   6   16:aload_1         
	//*   7   17:ifnonnull       35
			arrayrow = new ArrayRow(mCache);
	//    8   20:new             #75  <Class ArrayRow>
	//    9   23:dup             
	//   10   24:aload_0         
	//   11   25:getfield        #85  <Field Cache mCache>
	//   12   28:invokespecial   #93  <Method void ArrayRow(Cache)>
	//   13   31:astore_1        
		else
	//*  14   32:goto            39
			arrayrow.reset();
	//   15   35:aload_1         
	//   16   36:invokevirtual   #512 <Method void ArrayRow.reset()>
		SolverVariable.increaseErrorId();
	//   17   39:invokestatic    #515 <Method void SolverVariable.increaseErrorId()>
		return arrayrow;
	//   18   42:aload_1         
	//   19   43:areturn         
	}

	public SolverVariable createSlackVariable()
	{
		Object obj = ((Object) (sMetrics));
	//    0    0:getstatic       #208 <Field Metrics sMetrics>
	//    1    3:astore_1        
		if(obj != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          18
			obj.slackvariables = ((Metrics) (obj)).slackvariables + 1L;
	//    4    8:aload_1         
	//    5    9:aload_1         
	//    6   10:getfield        #518 <Field long Metrics.slackvariables>
	//    7   13:lconst_1        
	//    8   14:ladd            
	//    9   15:putfield        #518 <Field long Metrics.slackvariables>
		if(mNumColumns + 1 >= mMaxColumns)
	//*  10   18:aload_0         
	//*  11   19:getfield        #61  <Field int mNumColumns>
	//*  12   22:iconst_1        
	//*  13   23:iadd            
	//*  14   24:aload_0         
	//*  15   25:getfield        #53  <Field int mMaxColumns>
	//*  16   28:icmplt          35
			increaseTableSize();
	//   17   31:aload_0         
	//   18   32:invokespecial   #216 <Method void increaseTableSize()>
		obj = ((Object) (acquireSolverVariable(SolverVariable.Type.SLACK, ((String) (null)))));
	//   19   35:aload_0         
	//   20   36:getstatic       #503 <Field SolverVariable$Type SolverVariable$Type.SLACK>
	//   21   39:aconst_null     
	//   22   40:invokespecial   #218 <Method SolverVariable acquireSolverVariable(SolverVariable$Type, String)>
	//   23   43:astore_1        
		mVariablesID = mVariablesID + 1;
	//   24   44:aload_0         
	//   25   45:aload_0         
	//   26   46:getfield        #47  <Field int mVariablesID>
	//   27   49:iconst_1        
	//   28   50:iadd            
	//   29   51:putfield        #47  <Field int mVariablesID>
		mNumColumns = mNumColumns + 1;
	//   30   54:aload_0         
	//   31   55:aload_0         
	//   32   56:getfield        #61  <Field int mNumColumns>
	//   33   59:iconst_1        
	//   34   60:iadd            
	//   35   61:putfield        #61  <Field int mNumColumns>
		obj.id = mVariablesID;
	//   36   64:aload_1         
	//   37   65:aload_0         
	//   38   66:getfield        #47  <Field int mVariablesID>
	//   39   69:putfield        #225 <Field int SolverVariable.id>
		mCache.mIndexedVariables[mVariablesID] = ((SolverVariable) (obj));
	//   40   72:aload_0         
	//   41   73:getfield        #85  <Field Cache mCache>
	//   42   76:getfield        #235 <Field SolverVariable[] Cache.mIndexedVariables>
	//   43   79:aload_0         
	//   44   80:getfield        #47  <Field int mVariablesID>
	//   45   83:aload_1         
	//   46   84:aastore         
		return ((SolverVariable) (obj));
	//   47   85:aload_1         
	//   48   86:areturn         
	}

	void displayReadableRows()
	{
		displaySolverVariables();
	//    0    0:aload_0         
	//    1    1:invokespecial   #239 <Method void displaySolverVariables()>
		String s = " #  ";
	//    2    4:ldc2            #521 <String " #  ">
	//    3    7:astore_2        
		for(int i = 0; i < mNumRows; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:getfield        #63  <Field int mNumRows>
	//*   9   15:icmpge          85
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   18:new             #243 <Class StringBuilder>
	//   11   21:dup             
	//   12   22:invokespecial   #244 <Method void StringBuilder()>
	//   13   25:astore_3        
			stringbuilder.append(s);
	//   14   26:aload_3         
	//   15   27:aload_2         
	//   16   28:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   17   31:pop             
			stringbuilder.append(mRows[i].toReadableString());
	//   18   32:aload_3         
	//   19   33:aload_0         
	//   20   34:getfield        #55  <Field ArrayRow[] mRows>
	//   21   37:iload_1         
	//   22   38:aaload          
	//   23   39:invokevirtual   #524 <Method String ArrayRow.toReadableString()>
	//   24   42:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   25   45:pop             
			s = stringbuilder.toString();
	//   26   46:aload_3         
	//   27   47:invokevirtual   #255 <Method String StringBuilder.toString()>
	//   28   50:astore_2        
			stringbuilder = new StringBuilder();
	//   29   51:new             #243 <Class StringBuilder>
	//   30   54:dup             
	//   31   55:invokespecial   #244 <Method void StringBuilder()>
	//   32   58:astore_3        
			stringbuilder.append(s);
	//   33   59:aload_3         
	//   34   60:aload_2         
	//   35   61:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   36   64:pop             
			stringbuilder.append("\n #  ");
	//   37   65:aload_3         
	//   38   66:ldc2            #526 <String "\n #  ">
	//   39   69:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   40   72:pop             
			s = stringbuilder.toString();
	//   41   73:aload_3         
	//   42   74:invokevirtual   #255 <Method String StringBuilder.toString()>
	//   43   77:astore_2        
		}

	//   44   78:iload_1         
	//   45   79:iconst_1        
	//   46   80:iadd            
	//   47   81:istore_1        
	//*  48   82:goto            10
		Object obj = ((Object) (s));
	//   49   85:aload_2         
	//   50   86:astore_3        
		if(mGoal != null)
	//*  51   87:aload_0         
	//*  52   88:getfield        #92  <Field LinearSystem$Row mGoal>
	//*  53   91:ifnull          130
		{
			obj = ((Object) (new StringBuilder()));
	//   54   94:new             #243 <Class StringBuilder>
	//   55   97:dup             
	//   56   98:invokespecial   #244 <Method void StringBuilder()>
	//   57  101:astore_3        
			((StringBuilder) (obj)).append(s);
	//   58  102:aload_3         
	//   59  103:aload_2         
	//   60  104:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   61  107:pop             
			((StringBuilder) (obj)).append(((Object) (mGoal)));
	//   62  108:aload_3         
	//   63  109:aload_0         
	//   64  110:getfield        #92  <Field LinearSystem$Row mGoal>
	//   65  113:invokevirtual   #251 <Method StringBuilder StringBuilder.append(Object)>
	//   66  116:pop             
			((StringBuilder) (obj)).append("\n");
	//   67  117:aload_3         
	//   68  118:ldc2            #257 <String "\n">
	//   69  121:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   70  124:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   71  125:aload_3         
	//   72  126:invokevirtual   #255 <Method String StringBuilder.toString()>
	//   73  129:astore_3        
		}
		System.out.println(((String) (obj)));
	//   74  130:getstatic       #263 <Field PrintStream System.out>
	//   75  133:aload_3         
	//   76  134:invokevirtual   #268 <Method void PrintStream.println(String)>
	//   77  137:return          
	}

	void displaySystemInformations()
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int i;
		int k;
		for(i = j; j < TABLE_SIZE; i = k)
	//*   2    2:iload_2         
	//*   3    3:istore_1        
	//*   4    4:iload_2         
	//*   5    5:aload_0         
	//*   6    6:getfield        #51  <Field int TABLE_SIZE>
	//*   7    9:icmpge          46
		{
			ArrayRow aarrayrow[] = mRows;
	//    8   12:aload_0         
	//    9   13:getfield        #55  <Field ArrayRow[] mRows>
	//   10   16:astore          5
			k = i;
	//   11   18:iload_1         
	//   12   19:istore_3        
			if(aarrayrow[j] != null)
	//*  13   20:aload           5
	//*  14   22:iload_2         
	//*  15   23:aaload          
	//*  16   24:ifnull          37
				k = i + aarrayrow[j].sizeInBytes();
	//   17   27:iload_1         
	//   18   28:aload           5
	//   19   30:iload_2         
	//   20   31:aaload          
	//   21   32:invokevirtual   #531 <Method int ArrayRow.sizeInBytes()>
	//   22   35:iadd            
	//   23   36:istore_3        
			j++;
	//   24   37:iload_2         
	//   25   38:iconst_1        
	//   26   39:iadd            
	//   27   40:istore_2        
		}

	//   28   41:iload_3         
	//   29   42:istore_1        
	//*  30   43:goto            4
		int l = 0;
	//   31   46:iconst_0        
	//   32   47:istore_3        
		int i1;
		for(j = l; l < mNumRows; j = i1)
	//*  33   48:iload_3         
	//*  34   49:istore_2        
	//*  35   50:iload_3         
	//*  36   51:aload_0         
	//*  37   52:getfield        #63  <Field int mNumRows>
	//*  38   55:icmpge          95
		{
			ArrayRow aarrayrow1[] = mRows;
	//   39   58:aload_0         
	//   40   59:getfield        #55  <Field ArrayRow[] mRows>
	//   41   62:astore          5
			i1 = j;
	//   42   64:iload_2         
	//   43   65:istore          4
			if(aarrayrow1[l] != null)
	//*  44   67:aload           5
	//*  45   69:iload_3         
	//*  46   70:aaload          
	//*  47   71:ifnull          85
				i1 = j + aarrayrow1[l].sizeInBytes();
	//   48   74:iload_2         
	//   49   75:aload           5
	//   50   77:iload_3         
	//   51   78:aaload          
	//   52   79:invokevirtual   #531 <Method int ArrayRow.sizeInBytes()>
	//   53   82:iadd            
	//   54   83:istore          4
			l++;
	//   55   85:iload_3         
	//   56   86:iconst_1        
	//   57   87:iadd            
	//   58   88:istore_3        
		}

	//   59   89:iload           4
	//   60   91:istore_2        
	//*  61   92:goto            50
		PrintStream printstream = System.out;
	//   62   95:getstatic       #263 <Field PrintStream System.out>
	//   63   98:astore          5
		StringBuilder stringbuilder = new StringBuilder();
	//   64  100:new             #243 <Class StringBuilder>
	//   65  103:dup             
	//   66  104:invokespecial   #244 <Method void StringBuilder()>
	//   67  107:astore          6
		stringbuilder.append("Linear System -> Table size: ");
	//   68  109:aload           6
	//   69  111:ldc2            #533 <String "Linear System -> Table size: ">
	//   70  114:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   71  117:pop             
		stringbuilder.append(TABLE_SIZE);
	//   72  118:aload           6
	//   73  120:aload_0         
	//   74  121:getfield        #51  <Field int TABLE_SIZE>
	//   75  124:invokevirtual   #273 <Method StringBuilder StringBuilder.append(int)>
	//   76  127:pop             
		stringbuilder.append(" (");
	//   77  128:aload           6
	//   78  130:ldc2            #535 <String " (">
	//   79  133:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   80  136:pop             
		l = TABLE_SIZE;
	//   81  137:aload_0         
	//   82  138:getfield        #51  <Field int TABLE_SIZE>
	//   83  141:istore_3        
		stringbuilder.append(getDisplaySize(l * l));
	//   84  142:aload           6
	//   85  144:aload_0         
	//   86  145:iload_3         
	//   87  146:iload_3         
	//   88  147:imul            
	//   89  148:invokespecial   #537 <Method String getDisplaySize(int)>
	//   90  151:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   91  154:pop             
		stringbuilder.append(") -- row sizes: ");
	//   92  155:aload           6
	//   93  157:ldc2            #539 <String ") -- row sizes: ">
	//   94  160:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   95  163:pop             
		stringbuilder.append(getDisplaySize(i));
	//   96  164:aload           6
	//   97  166:aload_0         
	//   98  167:iload_1         
	//   99  168:invokespecial   #537 <Method String getDisplaySize(int)>
	//  100  171:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//  101  174:pop             
		stringbuilder.append(", actual size: ");
	//  102  175:aload           6
	//  103  177:ldc2            #541 <String ", actual size: ">
	//  104  180:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//  105  183:pop             
		stringbuilder.append(getDisplaySize(j));
	//  106  184:aload           6
	//  107  186:aload_0         
	//  108  187:iload_2         
	//  109  188:invokespecial   #537 <Method String getDisplaySize(int)>
	//  110  191:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//  111  194:pop             
		stringbuilder.append(" rows: ");
	//  112  195:aload           6
	//  113  197:ldc2            #543 <String " rows: ">
	//  114  200:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//  115  203:pop             
		stringbuilder.append(mNumRows);
	//  116  204:aload           6
	//  117  206:aload_0         
	//  118  207:getfield        #63  <Field int mNumRows>
	//  119  210:invokevirtual   #273 <Method StringBuilder StringBuilder.append(int)>
	//  120  213:pop             
		stringbuilder.append("/");
	//  121  214:aload           6
	//  122  216:ldc2            #545 <String "/">
	//  123  219:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//  124  222:pop             
		stringbuilder.append(mMaxRows);
	//  125  223:aload           6
	//  126  225:aload_0         
	//  127  226:getfield        #65  <Field int mMaxRows>
	//  128  229:invokevirtual   #273 <Method StringBuilder StringBuilder.append(int)>
	//  129  232:pop             
		stringbuilder.append(" cols: ");
	//  130  233:aload           6
	//  131  235:ldc2            #547 <String " cols: ">
	//  132  238:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//  133  241:pop             
		stringbuilder.append(mNumColumns);
	//  134  242:aload           6
	//  135  244:aload_0         
	//  136  245:getfield        #61  <Field int mNumColumns>
	//  137  248:invokevirtual   #273 <Method StringBuilder StringBuilder.append(int)>
	//  138  251:pop             
		stringbuilder.append("/");
	//  139  252:aload           6
	//  140  254:ldc2            #545 <String "/">
	//  141  257:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//  142  260:pop             
		stringbuilder.append(mMaxColumns);
	//  143  261:aload           6
	//  144  263:aload_0         
	//  145  264:getfield        #53  <Field int mMaxColumns>
	//  146  267:invokevirtual   #273 <Method StringBuilder StringBuilder.append(int)>
	//  147  270:pop             
		stringbuilder.append(" ");
	//  148  271:aload           6
	//  149  273:ldc2            #549 <String " ">
	//  150  276:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//  151  279:pop             
		stringbuilder.append(0);
	//  152  280:aload           6
	//  153  282:iconst_0        
	//  154  283:invokevirtual   #273 <Method StringBuilder StringBuilder.append(int)>
	//  155  286:pop             
		stringbuilder.append(" occupied cells, ");
	//  156  287:aload           6
	//  157  289:ldc2            #551 <String " occupied cells, ">
	//  158  292:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//  159  295:pop             
		stringbuilder.append(getDisplaySize(0));
	//  160  296:aload           6
	//  161  298:aload_0         
	//  162  299:iconst_0        
	//  163  300:invokespecial   #537 <Method String getDisplaySize(int)>
	//  164  303:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//  165  306:pop             
		printstream.println(stringbuilder.toString());
	//  166  307:aload           5
	//  167  309:aload           6
	//  168  311:invokevirtual   #255 <Method String StringBuilder.toString()>
	//  169  314:invokevirtual   #268 <Method void PrintStream.println(String)>
	//  170  317:return          
	}

	public void displayVariablesReadableRows()
	{
		displaySolverVariables();
	//    0    0:aload_0         
	//    1    1:invokespecial   #239 <Method void displaySolverVariables()>
		Object obj = "";
	//    2    4:ldc1            #241 <String "">
	//    3    6:astore_2        
		for(int i = 0; i < mNumRows;)
	//*   4    7:iconst_0        
	//*   5    8:istore_1        
	//*   6    9:iload_1         
	//*   7   10:aload_0         
	//*   8   11:getfield        #63  <Field int mNumRows>
	//*   9   14:icmpge          106
		{
			Object obj1 = obj;
	//   10   17:aload_2         
	//   11   18:astore_3        
			if(mRows[i].variable.mType == SolverVariable.Type.UNRESTRICTED)
	//*  12   19:aload_0         
	//*  13   20:getfield        #55  <Field ArrayRow[] mRows>
	//*  14   23:iload_1         
	//*  15   24:aaload          
	//*  16   25:getfield        #140 <Field SolverVariable ArrayRow.variable>
	//*  17   28:getfield        #285 <Field SolverVariable$Type SolverVariable.mType>
	//*  18   31:getstatic       #290 <Field SolverVariable$Type SolverVariable$Type.UNRESTRICTED>
	//*  19   34:if_acmpne       97
			{
				obj1 = ((Object) (new StringBuilder()));
	//   20   37:new             #243 <Class StringBuilder>
	//   21   40:dup             
	//   22   41:invokespecial   #244 <Method void StringBuilder()>
	//   23   44:astore_3        
				((StringBuilder) (obj1)).append(((String) (obj)));
	//   24   45:aload_3         
	//   25   46:aload_2         
	//   26   47:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   27   50:pop             
				((StringBuilder) (obj1)).append(mRows[i].toReadableString());
	//   28   51:aload_3         
	//   29   52:aload_0         
	//   30   53:getfield        #55  <Field ArrayRow[] mRows>
	//   31   56:iload_1         
	//   32   57:aaload          
	//   33   58:invokevirtual   #524 <Method String ArrayRow.toReadableString()>
	//   34   61:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   35   64:pop             
				obj = ((Object) (((StringBuilder) (obj1)).toString()));
	//   36   65:aload_3         
	//   37   66:invokevirtual   #255 <Method String StringBuilder.toString()>
	//   38   69:astore_2        
				obj1 = ((Object) (new StringBuilder()));
	//   39   70:new             #243 <Class StringBuilder>
	//   40   73:dup             
	//   41   74:invokespecial   #244 <Method void StringBuilder()>
	//   42   77:astore_3        
				((StringBuilder) (obj1)).append(((String) (obj)));
	//   43   78:aload_3         
	//   44   79:aload_2         
	//   45   80:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   46   83:pop             
				((StringBuilder) (obj1)).append("\n");
	//   47   84:aload_3         
	//   48   85:ldc2            #257 <String "\n">
	//   49   88:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   50   91:pop             
				obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//   51   92:aload_3         
	//   52   93:invokevirtual   #255 <Method String StringBuilder.toString()>
	//   53   96:astore_3        
			}
			i++;
	//   54   97:iload_1         
	//   55   98:iconst_1        
	//   56   99:iadd            
	//   57  100:istore_1        
			obj = obj1;
	//   58  101:aload_3         
	//   59  102:astore_2        
		}

	//*  60  103:goto            9
		StringBuilder stringbuilder = new StringBuilder();
	//   61  106:new             #243 <Class StringBuilder>
	//   62  109:dup             
	//   63  110:invokespecial   #244 <Method void StringBuilder()>
	//   64  113:astore_3        
		stringbuilder.append(((String) (obj)));
	//   65  114:aload_3         
	//   66  115:aload_2         
	//   67  116:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   68  119:pop             
		stringbuilder.append(((Object) (mGoal)));
	//   69  120:aload_3         
	//   70  121:aload_0         
	//   71  122:getfield        #92  <Field LinearSystem$Row mGoal>
	//   72  125:invokevirtual   #251 <Method StringBuilder StringBuilder.append(Object)>
	//   73  128:pop             
		stringbuilder.append("\n");
	//   74  129:aload_3         
	//   75  130:ldc2            #257 <String "\n">
	//   76  133:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   77  136:pop             
		obj = ((Object) (stringbuilder.toString()));
	//   78  137:aload_3         
	//   79  138:invokevirtual   #255 <Method String StringBuilder.toString()>
	//   80  141:astore_2        
		System.out.println(((String) (obj)));
	//   81  142:getstatic       #263 <Field PrintStream System.out>
	//   82  145:aload_2         
	//   83  146:invokevirtual   #268 <Method void PrintStream.println(String)>
	//   84  149:return          
	}

	public void fillMetrics(Metrics metrics)
	{
		sMetrics = metrics;
	//    0    0:aload_1         
	//    1    1:putstatic       #208 <Field Metrics sMetrics>
	//    2    4:return          
	}

	public Cache getCache()
	{
		return mCache;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field Cache mCache>
	//    2    4:areturn         
	}

	Row getGoal()
	{
		return mGoal;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field LinearSystem$Row mGoal>
	//    2    4:areturn         
	}

	public int getMemoryUsed()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		int j;
		int k;
		for(j = 0; i < mNumRows; j = k)
	//*   2    2:iconst_0        
	//*   3    3:istore_2        
	//*   4    4:iload_1         
	//*   5    5:aload_0         
	//*   6    6:getfield        #63  <Field int mNumRows>
	//*   7    9:icmpge          46
		{
			ArrayRow aarrayrow[] = mRows;
	//    8   12:aload_0         
	//    9   13:getfield        #55  <Field ArrayRow[] mRows>
	//   10   16:astore          4
			k = j;
	//   11   18:iload_2         
	//   12   19:istore_3        
			if(aarrayrow[i] != null)
	//*  13   20:aload           4
	//*  14   22:iload_1         
	//*  15   23:aaload          
	//*  16   24:ifnull          37
				k = j + aarrayrow[i].sizeInBytes();
	//   17   27:iload_2         
	//   18   28:aload           4
	//   19   30:iload_1         
	//   20   31:aaload          
	//   21   32:invokevirtual   #531 <Method int ArrayRow.sizeInBytes()>
	//   22   35:iadd            
	//   23   36:istore_3        
			i++;
	//   24   37:iload_1         
	//   25   38:iconst_1        
	//   26   39:iadd            
	//   27   40:istore_1        
		}

	//   28   41:iload_3         
	//   29   42:istore_2        
	//*  30   43:goto            4
		return j;
	//   31   46:iload_2         
	//   32   47:ireturn         
	}

	public int getNumEquations()
	{
		return mNumRows;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field int mNumRows>
	//    2    4:ireturn         
	}

	public int getNumVariables()
	{
		return mVariablesID;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int mVariablesID>
	//    2    4:ireturn         
	}

	public int getObjectVariableValue(Object obj)
	{
		obj = ((Object) (((ConstraintAnchor)obj).getSolverVariable()));
	//    0    0:aload_1         
	//    1    1:checkcast       #505 <Class ConstraintAnchor>
	//    2    4:invokevirtual   #508 <Method SolverVariable ConstraintAnchor.getSolverVariable()>
	//    3    7:astore_1        
		if(obj != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          22
			return (int)(((SolverVariable) (obj)).computedValue + 0.5F);
	//    6   12:aload_1         
	//    7   13:getfield        #159 <Field float SolverVariable.computedValue>
	//    8   16:ldc2            #564 <Float 0.5F>
	//    9   19:fadd            
	//   10   20:f2i             
	//   11   21:ireturn         
		else
			return 0;
	//   12   22:iconst_0        
	//   13   23:ireturn         
	}

	ArrayRow getRow(int i)
	{
		return mRows[i];
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field ArrayRow[] mRows>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:areturn         
	}

	float getValueFor(String s)
	{
		s = ((String) (getVariable(s, SolverVariable.Type.UNRESTRICTED)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #290 <Field SolverVariable$Type SolverVariable$Type.UNRESTRICTED>
	//    3    5:invokevirtual   #571 <Method SolverVariable getVariable(String, SolverVariable$Type)>
	//    4    8:astore_1        
		if(s == null)
	//*   5    9:aload_1         
	//*   6   10:ifnonnull       15
			return 0.0F;
	//    7   13:fconst_0        
	//    8   14:freturn         
		else
			return ((SolverVariable) (s)).computedValue;
	//    9   15:aload_1         
	//   10   16:getfield        #159 <Field float SolverVariable.computedValue>
	//   11   19:freturn         
	}

	SolverVariable getVariable(String s, SolverVariable.Type type)
	{
		if(mVariables == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field HashMap mVariables>
	//*   2    4:ifnonnull       18
			mVariables = new HashMap();
	//    3    7:aload_0         
	//    4    8:new             #227 <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #228 <Method void HashMap()>
	//    7   15:putfield        #49  <Field HashMap mVariables>
		SolverVariable solvervariable1 = (SolverVariable)mVariables.get(((Object) (s)));
	//    8   18:aload_0         
	//    9   19:getfield        #49  <Field HashMap mVariables>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #574 <Method Object HashMap.get(Object)>
	//   12   26:checkcast       #69  <Class SolverVariable>
	//   13   29:astore          4
		SolverVariable solvervariable = solvervariable1;
	//   14   31:aload           4
	//   15   33:astore_3        
		if(solvervariable1 == null)
	//*  16   34:aload           4
	//*  17   36:ifnonnull       46
			solvervariable = createVariable(s, type);
	//   18   39:aload_0         
	//   19   40:aload_1         
	//   20   41:aload_2         
	//   21   42:invokespecial   #576 <Method SolverVariable createVariable(String, SolverVariable$Type)>
	//   22   45:astore_3        
		return solvervariable;
	//   23   46:aload_3         
	//   24   47:areturn         
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
	//    0    0:getstatic       #208 <Field Metrics sMetrics>
	//    1    3:astore_3        
				if(metrics != null)
	//*   2    4:aload_3         
	//*   3    5:ifnull          18
					metrics.minimize = metrics.minimize + 1L;
	//    4    8:aload_3         
	//    5    9:aload_3         
	//    6   10:getfield        #579 <Field long Metrics.minimize>
	//    7   13:lconst_1        
	//    8   14:ladd            
	//    9   15:putfield        #579 <Field long Metrics.minimize>
				if(!graphOptimizer)
					break label0;
	//   10   18:aload_0         
	//   11   19:getfield        #57  <Field boolean graphOptimizer>
	//   12   22:ifeq            117
				metrics = sMetrics;
	//   13   25:getstatic       #208 <Field Metrics sMetrics>
	//   14   28:astore_3        
				if(metrics != null)
	//*  15   29:aload_3         
	//*  16   30:ifnull          43
					metrics.graphOptimizer = metrics.graphOptimizer + 1L;
	//   17   33:aload_3         
	//   18   34:aload_3         
	//   19   35:getfield        #581 <Field long Metrics.graphOptimizer>
	//   20   38:lconst_1        
	//   21   39:ladd            
	//   22   40:putfield        #581 <Field long Metrics.graphOptimizer>
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
	//   29   49:getfield        #63  <Field int mNumRows>
	//   30   52:icmpge          79
					if(!mRows[i].isSimpleDefinition)
	//*  31   55:aload_0         
	//*  32   56:getfield        #55  <Field ArrayRow[] mRows>
	//*  33   59:iload_1         
	//*  34   60:aaload          
	//*  35   61:getfield        #297 <Field boolean ArrayRow.isSimpleDefinition>
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
	//   51   87:getfield        #92  <Field LinearSystem$Row mGoal>
	//   52   90:invokevirtual   #584 <Method void minimizeGoal(LinearSystem$Row)>
				return;
	//   53   93:return          
			}
			Metrics metrics1 = sMetrics;
	//   54   94:getstatic       #208 <Field Metrics sMetrics>
	//   55   97:astore_3        
			if(metrics1 != null)
	//*  56   98:aload_3         
	//*  57   99:ifnull          112
				metrics1.fullySolved = metrics1.fullySolved + 1L;
	//   58  102:aload_3         
	//   59  103:aload_3         
	//   60  104:getfield        #587 <Field long Metrics.fullySolved>
	//   61  107:lconst_1        
	//   62  108:ladd            
	//   63  109:putfield        #587 <Field long Metrics.fullySolved>
			computeValues();
	//   64  112:aload_0         
	//   65  113:invokespecial   #589 <Method void computeValues()>
			return;
	//   66  116:return          
		}
		minimizeGoal(mGoal);
	//   67  117:aload_0         
	//   68  118:aload_0         
	//   69  119:getfield        #92  <Field LinearSystem$Row mGoal>
	//   70  122:invokevirtual   #584 <Method void minimizeGoal(LinearSystem$Row)>
	//   71  125:return          
	}

	void minimizeGoal(Row row)
		throws Exception
	{
		Metrics metrics = sMetrics;
	//    0    0:getstatic       #208 <Field Metrics sMetrics>
	//    1    3:astore_2        
		if(metrics != null)
	//*   2    4:aload_2         
	//*   3    5:ifnull          58
		{
			metrics.minimizeGoal = metrics.minimizeGoal + 1L;
	//    4    8:aload_2         
	//    5    9:aload_2         
	//    6   10:getfield        #591 <Field long Metrics.minimizeGoal>
	//    7   13:lconst_1        
	//    8   14:ladd            
	//    9   15:putfield        #591 <Field long Metrics.minimizeGoal>
			metrics = sMetrics;
	//   10   18:getstatic       #208 <Field Metrics sMetrics>
	//   11   21:astore_2        
			metrics.maxVariables = Math.max(metrics.maxVariables, mNumColumns);
	//   12   22:aload_2         
	//   13   23:aload_2         
	//   14   24:getfield        #594 <Field long Metrics.maxVariables>
	//   15   27:aload_0         
	//   16   28:getfield        #61  <Field int mNumColumns>
	//   17   31:i2l             
	//   18   32:invokestatic    #347 <Method long Math.max(long, long)>
	//   19   35:putfield        #594 <Field long Metrics.maxVariables>
			metrics = sMetrics;
	//   20   38:getstatic       #208 <Field Metrics sMetrics>
	//   21   41:astore_2        
			metrics.maxRows = Math.max(metrics.maxRows, mNumRows);
	//   22   42:aload_2         
	//   23   43:aload_2         
	//   24   44:getfield        #597 <Field long Metrics.maxRows>
	//   25   47:aload_0         
	//   26   48:getfield        #63  <Field int mNumRows>
	//   27   51:i2l             
	//   28   52:invokestatic    #347 <Method long Math.max(long, long)>
	//   29   55:putfield        #597 <Field long Metrics.maxRows>
		}
		updateRowFromVariables((ArrayRow)row);
	//   30   58:aload_0         
	//   31   59:aload_1         
	//   32   60:checkcast       #75  <Class ArrayRow>
	//   33   63:invokespecial   #427 <Method void updateRowFromVariables(ArrayRow)>
		enforceBFS(row);
	//   34   66:aload_0         
	//   35   67:aload_1         
	//   36   68:invokespecial   #599 <Method int enforceBFS(LinearSystem$Row)>
	//   37   71:pop             
		optimize(row, false);
	//   38   72:aload_0         
	//   39   73:aload_1         
	//   40   74:iconst_0        
	//   41   75:invokespecial   #449 <Method int optimize(LinearSystem$Row, boolean)>
	//   42   78:pop             
		computeValues();
	//   43   79:aload_0         
	//   44   80:invokespecial   #589 <Method void computeValues()>
	//   45   83:return          
	}

	public void reset()
	{
		for(int i = 0; i < mCache.mIndexedVariables.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #85  <Field Cache mCache>
	//*   5    7:getfield        #235 <Field SolverVariable[] Cache.mIndexedVariables>
	//*   6   10:arraylength     
	//*   7   11:icmpge          39
		{
			SolverVariable solvervariable = mCache.mIndexedVariables[i];
	//    8   14:aload_0         
	//    9   15:getfield        #85  <Field Cache mCache>
	//   10   18:getfield        #235 <Field SolverVariable[] Cache.mIndexedVariables>
	//   11   21:iload_1         
	//   12   22:aaload          
	//   13   23:astore_2        
			if(solvervariable != null)
	//*  14   24:aload_2         
	//*  15   25:ifnull          32
				solvervariable.reset();
	//   16   28:aload_2         
	//   17   29:invokevirtual   #116 <Method void SolverVariable.reset()>
		}

	//   18   32:iload_1         
	//   19   33:iconst_1        
	//   20   34:iadd            
	//   21   35:istore_1        
	//*  22   36:goto            2
		mCache.solverVariablePool.releaseAll(((Object []) (mPoolVariables)), mPoolVariablesCount);
	//   23   39:aload_0         
	//   24   40:getfield        #85  <Field Cache mCache>
	//   25   43:getfield        #101 <Field Pools$Pool Cache.solverVariablePool>
	//   26   46:aload_0         
	//   27   47:getfield        #71  <Field SolverVariable[] mPoolVariables>
	//   28   50:aload_0         
	//   29   51:getfield        #73  <Field int mPoolVariablesCount>
	//   30   54:invokeinterface #603 <Method void Pools$Pool.releaseAll(Object[], int)>
		mPoolVariablesCount = 0;
	//   31   59:aload_0         
	//   32   60:iconst_0        
	//   33   61:putfield        #73  <Field int mPoolVariablesCount>
		Arrays.fill(((Object []) (mCache.mIndexedVariables)), ((Object) (null)));
	//   34   64:aload_0         
	//   35   65:getfield        #85  <Field Cache mCache>
	//   36   68:getfield        #235 <Field SolverVariable[] Cache.mIndexedVariables>
	//   37   71:aconst_null     
	//   38   72:invokestatic    #607 <Method void Arrays.fill(Object[], Object)>
		HashMap hashmap = mVariables;
	//   39   75:aload_0         
	//   40   76:getfield        #49  <Field HashMap mVariables>
	//   41   79:astore_2        
		if(hashmap != null)
	//*  42   80:aload_2         
	//*  43   81:ifnull          88
			hashmap.clear();
	//   44   84:aload_2         
	//   45   85:invokevirtual   #610 <Method void HashMap.clear()>
		mVariablesID = 0;
	//   46   88:aload_0         
	//   47   89:iconst_0        
	//   48   90:putfield        #47  <Field int mVariablesID>
		mGoal.clear();
	//   49   93:aload_0         
	//   50   94:getfield        #92  <Field LinearSystem$Row mGoal>
	//   51   97:invokeinterface #611 <Method void LinearSystem$Row.clear()>
		mNumColumns = 1;
	//   52  102:aload_0         
	//   53  103:iconst_1        
	//   54  104:putfield        #61  <Field int mNumColumns>
		for(int j = 0; j < mNumRows; j++)
	//*  55  107:iconst_0        
	//*  56  108:istore_1        
	//*  57  109:iload_1         
	//*  58  110:aload_0         
	//*  59  111:getfield        #63  <Field int mNumRows>
	//*  60  114:icmpge          134
			mRows[j].used = false;
	//   61  117:aload_0         
	//   62  118:getfield        #55  <Field ArrayRow[] mRows>
	//   63  121:iload_1         
	//   64  122:aaload          
	//   65  123:iconst_0        
	//   66  124:putfield        #614 <Field boolean ArrayRow.used>

	//   67  127:iload_1         
	//   68  128:iconst_1        
	//   69  129:iadd            
	//   70  130:istore_1        
	//*  71  131:goto            109
		releaseRows();
	//   72  134:aload_0         
	//   73  135:invokespecial   #80  <Method void releaseRows()>
		mNumRows = 0;
	//   74  138:aload_0         
	//   75  139:iconst_0        
	//   76  140:putfield        #63  <Field int mNumRows>
	//   77  143:return          
	}

	private static final boolean DEBUG = false;
	public static final boolean FULL_DEBUG = false;
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
