// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver;


// Referenced classes of package android.support.constraint.solver:
//			LinearSystem, SolverVariable

static interface LinearSystem$Row
{

	public abstract void addError(SolverVariable solvervariable);

	public abstract void clear();

	public abstract SolverVariable getKey();

	public abstract SolverVariable getPivotCandidate(LinearSystem linearsystem, boolean aflag[]);

	public abstract void initFromRow(LinearSystem$Row linearsystem$row);

	public abstract boolean isEmpty();
}
