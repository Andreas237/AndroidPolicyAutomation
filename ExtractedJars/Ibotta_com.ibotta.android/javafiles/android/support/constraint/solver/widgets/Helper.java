// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver.widgets;

import java.util.Arrays;

// Referenced classes of package android.support.constraint.solver.widgets:
//			ConstraintWidget

public class Helper extends ConstraintWidget
{

	public Helper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void ConstraintWidget()>
		mWidgets = new ConstraintWidget[4];
	//    2    4:aload_0         
	//    3    5:iconst_4        
	//    4    6:anewarray       ConstraintWidget[]
	//    5    9:putfield        #14  <Field ConstraintWidget[] mWidgets>
		mWidgetsCount = 0;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #16  <Field int mWidgetsCount>
	//    9   17:return          
	}

	public void add(ConstraintWidget constraintwidget)
	{
		int i = mWidgetsCount;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int mWidgetsCount>
	//    2    4:istore_2        
		ConstraintWidget aconstraintwidget[] = mWidgets;
	//    3    5:aload_0         
	//    4    6:getfield        #14  <Field ConstraintWidget[] mWidgets>
	//    5    9:astore_3        
		if(i + 1 > aconstraintwidget.length)
	//*   6   10:iload_2         
	//*   7   11:iconst_1        
	//*   8   12:iadd            
	//*   9   13:aload_3         
	//*  10   14:arraylength     
	//*  11   15:icmple          33
			mWidgets = (ConstraintWidget[])Arrays.copyOf(((Object []) (aconstraintwidget)), aconstraintwidget.length * 2);
	//   12   18:aload_0         
	//   13   19:aload_3         
	//   14   20:aload_3         
	//   15   21:arraylength     
	//   16   22:iconst_2        
	//   17   23:imul            
	//   18   24:invokestatic    #25  <Method Object[] Arrays.copyOf(Object[], int)>
	//   19   27:checkcast       #26  <Class ConstraintWidget[]>
	//   20   30:putfield        #14  <Field ConstraintWidget[] mWidgets>
		aconstraintwidget = mWidgets;
	//   21   33:aload_0         
	//   22   34:getfield        #14  <Field ConstraintWidget[] mWidgets>
	//   23   37:astore_3        
		i = mWidgetsCount;
	//   24   38:aload_0         
	//   25   39:getfield        #16  <Field int mWidgetsCount>
	//   26   42:istore_2        
		aconstraintwidget[i] = constraintwidget;
	//   27   43:aload_3         
	//   28   44:iload_2         
	//   29   45:aload_1         
	//   30   46:aastore         
		mWidgetsCount = i + 1;
	//   31   47:aload_0         
	//   32   48:iload_2         
	//   33   49:iconst_1        
	//   34   50:iadd            
	//   35   51:putfield        #16  <Field int mWidgetsCount>
	//   36   54:return          
	}

	public void removeAllIds()
	{
		mWidgetsCount = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #16  <Field int mWidgetsCount>
	//    3    5:return          
	}

	protected ConstraintWidget mWidgets[];
	protected int mWidgetsCount;
}
