// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver;


// Referenced classes of package android.support.constraint.solver:
//			ArrayRow, SolverVariable, Cache

public class GoalRow extends ArrayRow
{

	public GoalRow(Cache cache)
	{
		super(cache);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void ArrayRow(Cache)>
	//    3    5:return          
	}

	public void addError(SolverVariable solvervariable)
	{
		super.addError(solvervariable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void ArrayRow.addError(SolverVariable)>
		solvervariable.usageInRowCount = solvervariable.usageInRowCount - 1;
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:getfield        #19  <Field int SolverVariable.usageInRowCount>
	//    6   10:iconst_1        
	//    7   11:isub            
	//    8   12:putfield        #19  <Field int SolverVariable.usageInRowCount>
	//    9   15:return          
	}
}
