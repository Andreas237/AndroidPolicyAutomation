// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver.widgets;

import android.support.constraint.solver.Cache;
import java.util.ArrayList;

// Referenced classes of package android.support.constraint.solver.widgets:
//			ConstraintWidget, ConstraintWidgetContainer

public class WidgetContainer extends ConstraintWidget
{

	public WidgetContainer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void ConstraintWidget()>
		mChildren = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #13  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void ArrayList()>
	//    6   12:putfield        #16  <Field ArrayList mChildren>
	//    7   15:return          
	}

	public void add(ConstraintWidget constraintwidget)
	{
		mChildren.add(((Object) (constraintwidget)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ArrayList mChildren>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #22  <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
		if(constraintwidget.getParent() != null)
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #26  <Method ConstraintWidget ConstraintWidget.getParent()>
	//*   7   13:ifnull          27
			((WidgetContainer)constraintwidget.getParent()).remove(constraintwidget);
	//    8   16:aload_1         
	//    9   17:invokevirtual   #26  <Method ConstraintWidget ConstraintWidget.getParent()>
	//   10   20:checkcast       #2   <Class WidgetContainer>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #29  <Method void remove(ConstraintWidget)>
		constraintwidget.setParent(((ConstraintWidget) (this)));
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:invokevirtual   #32  <Method void ConstraintWidget.setParent(ConstraintWidget)>
	//   16   32:return          
	}

	public ConstraintWidgetContainer getRootConstraintContainer()
	{
		ConstraintWidget constraintwidget = ((ConstraintWidget)this).getParent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method ConstraintWidget ConstraintWidget.getParent()>
	//    2    4:astore_1        
		ConstraintWidgetContainer constraintwidgetcontainer;
		if(this instanceof ConstraintWidgetContainer)
	//*   3    5:aload_0         
	//*   4    6:instanceof      #36  <Class ConstraintWidgetContainer>
	//*   5    9:ifeq            20
			constraintwidgetcontainer = (ConstraintWidgetContainer)this;
	//    6   12:aload_0         
	//    7   13:checkcast       #36  <Class ConstraintWidgetContainer>
	//    8   16:astore_2        
		else
	//*   9   17:goto            22
			constraintwidgetcontainer = null;
	//   10   20:aconst_null     
	//   11   21:astore_2        
		while(constraintwidget != null) 
	//*  12   22:aload_1         
	//*  13   23:ifnull          53
		{
			ConstraintWidget constraintwidget1 = constraintwidget.getParent();
	//   14   26:aload_1         
	//   15   27:invokevirtual   #26  <Method ConstraintWidget ConstraintWidget.getParent()>
	//   16   30:astore_3        
			if(constraintwidget instanceof ConstraintWidgetContainer)
	//*  17   31:aload_1         
	//*  18   32:instanceof      #36  <Class ConstraintWidgetContainer>
	//*  19   35:ifeq            48
			{
				constraintwidgetcontainer = (ConstraintWidgetContainer)constraintwidget;
	//   20   38:aload_1         
	//   21   39:checkcast       #36  <Class ConstraintWidgetContainer>
	//   22   42:astore_2        
				constraintwidget = constraintwidget1;
	//   23   43:aload_3         
	//   24   44:astore_1        
			} else
	//*  25   45:goto            22
			{
				constraintwidget = constraintwidget1;
	//   26   48:aload_3         
	//   27   49:astore_1        
			}
		}
	//*  28   50:goto            22
		return constraintwidgetcontainer;
	//   29   53:aload_2         
	//   30   54:areturn         
	}

	public void layout()
	{
		updateDrawPosition();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #40  <Method void updateDrawPosition()>
		ArrayList arraylist = mChildren;
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field ArrayList mChildren>
	//    4    8:astore_3        
		if(arraylist == null)
	//*   5    9:aload_3         
	//*   6   10:ifnonnull       14
			return;
	//    7   13:return          
		int j = arraylist.size();
	//    8   14:aload_3         
	//    9   15:invokevirtual   #44  <Method int ArrayList.size()>
	//   10   18:istore_2        
		for(int i = 0; i < j; i++)
	//*  11   19:iconst_0        
	//*  12   20:istore_1        
	//*  13   21:iload_1         
	//*  14   22:iload_2         
	//*  15   23:icmpge          59
		{
			ConstraintWidget constraintwidget = (ConstraintWidget)mChildren.get(i);
	//   16   26:aload_0         
	//   17   27:getfield        #16  <Field ArrayList mChildren>
	//   18   30:iload_1         
	//   19   31:invokevirtual   #48  <Method Object ArrayList.get(int)>
	//   20   34:checkcast       #4   <Class ConstraintWidget>
	//   21   37:astore_3        
			if(constraintwidget instanceof WidgetContainer)
	//*  22   38:aload_3         
	//*  23   39:instanceof      #2   <Class WidgetContainer>
	//*  24   42:ifeq            52
				((WidgetContainer)constraintwidget).layout();
	//   25   45:aload_3         
	//   26   46:checkcast       #2   <Class WidgetContainer>
	//   27   49:invokevirtual   #50  <Method void layout()>
		}

	//   28   52:iload_1         
	//   29   53:iconst_1        
	//   30   54:iadd            
	//   31   55:istore_1        
	//*  32   56:goto            21
	//   33   59:return          
	}

	public void remove(ConstraintWidget constraintwidget)
	{
		mChildren.remove(((Object) (constraintwidget)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ArrayList mChildren>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #52  <Method boolean ArrayList.remove(Object)>
	//    4    8:pop             
		constraintwidget.setParent(((ConstraintWidget) (null)));
	//    5    9:aload_1         
	//    6   10:aconst_null     
	//    7   11:invokevirtual   #32  <Method void ConstraintWidget.setParent(ConstraintWidget)>
	//    8   14:return          
	}

	public void removeAllChildren()
	{
		mChildren.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ArrayList mChildren>
	//    2    4:invokevirtual   #56  <Method void ArrayList.clear()>
	//    3    7:return          
	}

	public void reset()
	{
		mChildren.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ArrayList mChildren>
	//    2    4:invokevirtual   #56  <Method void ArrayList.clear()>
		super.reset();
	//    3    7:aload_0         
	//    4    8:invokespecial   #59  <Method void ConstraintWidget.reset()>
	//    5   11:return          
	}

	public void resetSolverVariables(Cache cache)
	{
		super.resetSolverVariables(cache);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #63  <Method void ConstraintWidget.resetSolverVariables(Cache)>
		int j = mChildren.size();
	//    3    5:aload_0         
	//    4    6:getfield        #16  <Field ArrayList mChildren>
	//    5    9:invokevirtual   #44  <Method int ArrayList.size()>
	//    6   12:istore_3        
		for(int i = 0; i < j; i++)
	//*   7   13:iconst_0        
	//*   8   14:istore_2        
	//*   9   15:iload_2         
	//*  10   16:iload_3         
	//*  11   17:icmpge          42
			((ConstraintWidget)mChildren.get(i)).resetSolverVariables(cache);
	//   12   20:aload_0         
	//   13   21:getfield        #16  <Field ArrayList mChildren>
	//   14   24:iload_2         
	//   15   25:invokevirtual   #48  <Method Object ArrayList.get(int)>
	//   16   28:checkcast       #4   <Class ConstraintWidget>
	//   17   31:aload_1         
	//   18   32:invokevirtual   #63  <Method void ConstraintWidget.resetSolverVariables(Cache)>

	//   19   35:iload_2         
	//   20   36:iconst_1        
	//   21   37:iadd            
	//   22   38:istore_2        
	//*  23   39:goto            15
	//   24   42:return          
	}

	public void setOffset(int i, int j)
	{
		super.setOffset(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #67  <Method void ConstraintWidget.setOffset(int, int)>
		j = mChildren.size();
	//    4    6:aload_0         
	//    5    7:getfield        #16  <Field ArrayList mChildren>
	//    6   10:invokevirtual   #44  <Method int ArrayList.size()>
	//    7   13:istore_2        
		for(i = 0; i < j; i++)
	//*   8   14:iconst_0        
	//*   9   15:istore_1        
	//*  10   16:iload_1         
	//*  11   17:iload_2         
	//*  12   18:icmpge          50
			((ConstraintWidget)mChildren.get(i)).setOffset(getRootX(), getRootY());
	//   13   21:aload_0         
	//   14   22:getfield        #16  <Field ArrayList mChildren>
	//   15   25:iload_1         
	//   16   26:invokevirtual   #48  <Method Object ArrayList.get(int)>
	//   17   29:checkcast       #4   <Class ConstraintWidget>
	//   18   32:aload_0         
	//   19   33:invokevirtual   #70  <Method int getRootX()>
	//   20   36:aload_0         
	//   21   37:invokevirtual   #73  <Method int getRootY()>
	//   22   40:invokevirtual   #67  <Method void ConstraintWidget.setOffset(int, int)>

	//   23   43:iload_1         
	//   24   44:iconst_1        
	//   25   45:iadd            
	//   26   46:istore_1        
	//*  27   47:goto            16
	//   28   50:return          
	}

	public void updateDrawPosition()
	{
		super.updateDrawPosition();
	//    0    0:aload_0         
	//    1    1:invokespecial   #74  <Method void ConstraintWidget.updateDrawPosition()>
		ArrayList arraylist = mChildren;
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field ArrayList mChildren>
	//    4    8:astore_3        
		if(arraylist == null)
	//*   5    9:aload_3         
	//*   6   10:ifnonnull       14
			return;
	//    7   13:return          
		int j = arraylist.size();
	//    8   14:aload_3         
	//    9   15:invokevirtual   #44  <Method int ArrayList.size()>
	//   10   18:istore_2        
		for(int i = 0; i < j; i++)
	//*  11   19:iconst_0        
	//*  12   20:istore_1        
	//*  13   21:iload_1         
	//*  14   22:iload_2         
	//*  15   23:icmpge          68
		{
			ConstraintWidget constraintwidget = (ConstraintWidget)mChildren.get(i);
	//   16   26:aload_0         
	//   17   27:getfield        #16  <Field ArrayList mChildren>
	//   18   30:iload_1         
	//   19   31:invokevirtual   #48  <Method Object ArrayList.get(int)>
	//   20   34:checkcast       #4   <Class ConstraintWidget>
	//   21   37:astore_3        
			constraintwidget.setOffset(getDrawX(), getDrawY());
	//   22   38:aload_3         
	//   23   39:aload_0         
	//   24   40:invokevirtual   #77  <Method int getDrawX()>
	//   25   43:aload_0         
	//   26   44:invokevirtual   #80  <Method int getDrawY()>
	//   27   47:invokevirtual   #67  <Method void ConstraintWidget.setOffset(int, int)>
			if(!(constraintwidget instanceof ConstraintWidgetContainer))
	//*  28   50:aload_3         
	//*  29   51:instanceof      #36  <Class ConstraintWidgetContainer>
	//*  30   54:ifne            61
				constraintwidget.updateDrawPosition();
	//   31   57:aload_3         
	//   32   58:invokevirtual   #74  <Method void ConstraintWidget.updateDrawPosition()>
		}

	//   33   61:iload_1         
	//   34   62:iconst_1        
	//   35   63:iadd            
	//   36   64:istore_1        
	//*  37   65:goto            21
	//   38   68:return          
	}

	protected ArrayList mChildren;
}
