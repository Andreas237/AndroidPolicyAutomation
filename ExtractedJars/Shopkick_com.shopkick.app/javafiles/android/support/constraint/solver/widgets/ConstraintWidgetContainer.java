// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver.widgets;

import android.support.constraint.solver.LinearSystem;
import android.support.constraint.solver.Metrics;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package android.support.constraint.solver.widgets:
//			WidgetContainer, ChainHead, ConstraintWidget, Optimizer, 
//			Chain, Guideline, ResolutionDimension, ConstraintAnchor, 
//			ResolutionAnchor, Snapshot

public class ConstraintWidgetContainer extends WidgetContainer
{

	public ConstraintWidgetContainer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void WidgetContainer()>
		mIsRtl = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #38  <Field boolean mIsRtl>
		mSystem = new LinearSystem();
	//    5    9:aload_0         
	//    6   10:new             #40  <Class LinearSystem>
	//    7   13:dup             
	//    8   14:invokespecial   #41  <Method void LinearSystem()>
	//    9   17:putfield        #43  <Field LinearSystem mSystem>
		mHorizontalChainsSize = 0;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #45  <Field int mHorizontalChainsSize>
		mVerticalChainsSize = 0;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #47  <Field int mVerticalChainsSize>
		mVerticalChainsArray = new ChainHead[4];
	//   16   30:aload_0         
	//   17   31:iconst_4        
	//   18   32:anewarray       ChainHead[]
	//   19   35:putfield        #51  <Field ChainHead[] mVerticalChainsArray>
		mHorizontalChainsArray = new ChainHead[4];
	//   20   38:aload_0         
	//   21   39:iconst_4        
	//   22   40:anewarray       ChainHead[]
	//   23   43:putfield        #53  <Field ChainHead[] mHorizontalChainsArray>
		mOptimizationLevel = 3;
	//   24   46:aload_0         
	//   25   47:iconst_3        
	//   26   48:putfield        #55  <Field int mOptimizationLevel>
		mWidthMeasuredTooSmall = false;
	//   27   51:aload_0         
	//   28   52:iconst_0        
	//   29   53:putfield        #57  <Field boolean mWidthMeasuredTooSmall>
		mHeightMeasuredTooSmall = false;
	//   30   56:aload_0         
	//   31   57:iconst_0        
	//   32   58:putfield        #59  <Field boolean mHeightMeasuredTooSmall>
		mDebugSolverPassCount = 0;
	//   33   61:aload_0         
	//   34   62:iconst_0        
	//   35   63:putfield        #61  <Field int mDebugSolverPassCount>
	//   36   66:return          
	}

	public ConstraintWidgetContainer(int i, int j)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #65  <Method void WidgetContainer(int, int)>
		mIsRtl = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #38  <Field boolean mIsRtl>
		mSystem = new LinearSystem();
	//    7   11:aload_0         
	//    8   12:new             #40  <Class LinearSystem>
	//    9   15:dup             
	//   10   16:invokespecial   #41  <Method void LinearSystem()>
	//   11   19:putfield        #43  <Field LinearSystem mSystem>
		mHorizontalChainsSize = 0;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #45  <Field int mHorizontalChainsSize>
		mVerticalChainsSize = 0;
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:putfield        #47  <Field int mVerticalChainsSize>
		mVerticalChainsArray = new ChainHead[4];
	//   18   32:aload_0         
	//   19   33:iconst_4        
	//   20   34:anewarray       ChainHead[]
	//   21   37:putfield        #51  <Field ChainHead[] mVerticalChainsArray>
		mHorizontalChainsArray = new ChainHead[4];
	//   22   40:aload_0         
	//   23   41:iconst_4        
	//   24   42:anewarray       ChainHead[]
	//   25   45:putfield        #53  <Field ChainHead[] mHorizontalChainsArray>
		mOptimizationLevel = 3;
	//   26   48:aload_0         
	//   27   49:iconst_3        
	//   28   50:putfield        #55  <Field int mOptimizationLevel>
		mWidthMeasuredTooSmall = false;
	//   29   53:aload_0         
	//   30   54:iconst_0        
	//   31   55:putfield        #57  <Field boolean mWidthMeasuredTooSmall>
		mHeightMeasuredTooSmall = false;
	//   32   58:aload_0         
	//   33   59:iconst_0        
	//   34   60:putfield        #59  <Field boolean mHeightMeasuredTooSmall>
		mDebugSolverPassCount = 0;
	//   35   63:aload_0         
	//   36   64:iconst_0        
	//   37   65:putfield        #61  <Field int mDebugSolverPassCount>
	//   38   68:return          
	}

	public ConstraintWidgetContainer(int i, int j, int k, int l)
	{
		super(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #68  <Method void WidgetContainer(int, int, int, int)>
		mIsRtl = false;
	//    6    9:aload_0         
	//    7   10:iconst_0        
	//    8   11:putfield        #38  <Field boolean mIsRtl>
		mSystem = new LinearSystem();
	//    9   14:aload_0         
	//   10   15:new             #40  <Class LinearSystem>
	//   11   18:dup             
	//   12   19:invokespecial   #41  <Method void LinearSystem()>
	//   13   22:putfield        #43  <Field LinearSystem mSystem>
		mHorizontalChainsSize = 0;
	//   14   25:aload_0         
	//   15   26:iconst_0        
	//   16   27:putfield        #45  <Field int mHorizontalChainsSize>
		mVerticalChainsSize = 0;
	//   17   30:aload_0         
	//   18   31:iconst_0        
	//   19   32:putfield        #47  <Field int mVerticalChainsSize>
		mVerticalChainsArray = new ChainHead[4];
	//   20   35:aload_0         
	//   21   36:iconst_4        
	//   22   37:anewarray       ChainHead[]
	//   23   40:putfield        #51  <Field ChainHead[] mVerticalChainsArray>
		mHorizontalChainsArray = new ChainHead[4];
	//   24   43:aload_0         
	//   25   44:iconst_4        
	//   26   45:anewarray       ChainHead[]
	//   27   48:putfield        #53  <Field ChainHead[] mHorizontalChainsArray>
		mOptimizationLevel = 3;
	//   28   51:aload_0         
	//   29   52:iconst_3        
	//   30   53:putfield        #55  <Field int mOptimizationLevel>
		mWidthMeasuredTooSmall = false;
	//   31   56:aload_0         
	//   32   57:iconst_0        
	//   33   58:putfield        #57  <Field boolean mWidthMeasuredTooSmall>
		mHeightMeasuredTooSmall = false;
	//   34   61:aload_0         
	//   35   62:iconst_0        
	//   36   63:putfield        #59  <Field boolean mHeightMeasuredTooSmall>
		mDebugSolverPassCount = 0;
	//   37   66:aload_0         
	//   38   67:iconst_0        
	//   39   68:putfield        #61  <Field int mDebugSolverPassCount>
	//   40   71:return          
	}

	private void addHorizontalChain(ConstraintWidget constraintwidget)
	{
		int i = mHorizontalChainsSize;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int mHorizontalChainsSize>
	//    2    4:istore_2        
		ChainHead achainhead[] = mHorizontalChainsArray;
	//    3    5:aload_0         
	//    4    6:getfield        #53  <Field ChainHead[] mHorizontalChainsArray>
	//    5    9:astore_3        
		if(i + 1 >= achainhead.length)
	//*   6   10:iload_2         
	//*   7   11:iconst_1        
	//*   8   12:iadd            
	//*   9   13:aload_3         
	//*  10   14:arraylength     
	//*  11   15:icmplt          33
			mHorizontalChainsArray = (ChainHead[])Arrays.copyOf(((Object []) (achainhead)), achainhead.length * 2);
	//   12   18:aload_0         
	//   13   19:aload_3         
	//   14   20:aload_3         
	//   15   21:arraylength     
	//   16   22:iconst_2        
	//   17   23:imul            
	//   18   24:invokestatic    #76  <Method Object[] Arrays.copyOf(Object[], int)>
	//   19   27:checkcast       #77  <Class ChainHead[]>
	//   20   30:putfield        #53  <Field ChainHead[] mHorizontalChainsArray>
		mHorizontalChainsArray[mHorizontalChainsSize] = new ChainHead(constraintwidget, 0, isRtl());
	//   21   33:aload_0         
	//   22   34:getfield        #53  <Field ChainHead[] mHorizontalChainsArray>
	//   23   37:aload_0         
	//   24   38:getfield        #45  <Field int mHorizontalChainsSize>
	//   25   41:new             #49  <Class ChainHead>
	//   26   44:dup             
	//   27   45:aload_1         
	//   28   46:iconst_0        
	//   29   47:aload_0         
	//   30   48:invokevirtual   #81  <Method boolean isRtl()>
	//   31   51:invokespecial   #84  <Method void ChainHead(ConstraintWidget, int, boolean)>
	//   32   54:aastore         
		mHorizontalChainsSize = mHorizontalChainsSize + 1;
	//   33   55:aload_0         
	//   34   56:aload_0         
	//   35   57:getfield        #45  <Field int mHorizontalChainsSize>
	//   36   60:iconst_1        
	//   37   61:iadd            
	//   38   62:putfield        #45  <Field int mHorizontalChainsSize>
	//   39   65:return          
	}

	private void addVerticalChain(ConstraintWidget constraintwidget)
	{
		int i = mVerticalChainsSize;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int mVerticalChainsSize>
	//    2    4:istore_2        
		ChainHead achainhead[] = mVerticalChainsArray;
	//    3    5:aload_0         
	//    4    6:getfield        #51  <Field ChainHead[] mVerticalChainsArray>
	//    5    9:astore_3        
		if(i + 1 >= achainhead.length)
	//*   6   10:iload_2         
	//*   7   11:iconst_1        
	//*   8   12:iadd            
	//*   9   13:aload_3         
	//*  10   14:arraylength     
	//*  11   15:icmplt          33
			mVerticalChainsArray = (ChainHead[])Arrays.copyOf(((Object []) (achainhead)), achainhead.length * 2);
	//   12   18:aload_0         
	//   13   19:aload_3         
	//   14   20:aload_3         
	//   15   21:arraylength     
	//   16   22:iconst_2        
	//   17   23:imul            
	//   18   24:invokestatic    #76  <Method Object[] Arrays.copyOf(Object[], int)>
	//   19   27:checkcast       #77  <Class ChainHead[]>
	//   20   30:putfield        #51  <Field ChainHead[] mVerticalChainsArray>
		mVerticalChainsArray[mVerticalChainsSize] = new ChainHead(constraintwidget, 1, isRtl());
	//   21   33:aload_0         
	//   22   34:getfield        #51  <Field ChainHead[] mVerticalChainsArray>
	//   23   37:aload_0         
	//   24   38:getfield        #47  <Field int mVerticalChainsSize>
	//   25   41:new             #49  <Class ChainHead>
	//   26   44:dup             
	//   27   45:aload_1         
	//   28   46:iconst_1        
	//   29   47:aload_0         
	//   30   48:invokevirtual   #81  <Method boolean isRtl()>
	//   31   51:invokespecial   #84  <Method void ChainHead(ConstraintWidget, int, boolean)>
	//   32   54:aastore         
		mVerticalChainsSize = mVerticalChainsSize + 1;
	//   33   55:aload_0         
	//   34   56:aload_0         
	//   35   57:getfield        #47  <Field int mVerticalChainsSize>
	//   36   60:iconst_1        
	//   37   61:iadd            
	//   38   62:putfield        #47  <Field int mVerticalChainsSize>
	//   39   65:return          
	}

	private void resetChains()
	{
		mHorizontalChainsSize = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #45  <Field int mHorizontalChainsSize>
		mVerticalChainsSize = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #47  <Field int mVerticalChainsSize>
	//    6   10:return          
	}

	void addChain(ConstraintWidget constraintwidget, int i)
	{
		if(i == 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            10
		{
			addHorizontalChain(constraintwidget);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #90  <Method void addHorizontalChain(ConstraintWidget)>
			return;
	//    5    9:return          
		}
		if(i == 1)
	//*   6   10:iload_2         
	//*   7   11:iconst_1        
	//*   8   12:icmpne          20
			addVerticalChain(constraintwidget);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokespecial   #92  <Method void addVerticalChain(ConstraintWidget)>
	//   12   20:return          
	}

	public boolean addChildrenToSolver(LinearSystem linearsystem)
	{
		addToSolver(linearsystem);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #98  <Method void addToSolver(LinearSystem)>
		int j = mChildren.size();
	//    3    5:aload_0         
	//    4    6:getfield        #102 <Field ArrayList mChildren>
	//    5    9:invokevirtual   #108 <Method int ArrayList.size()>
	//    6   12:istore_3        
		for(int i = 0; i < j; i++)
	//*   7   13:iconst_0        
	//*   8   14:istore_2        
	//*   9   15:iload_2         
	//*  10   16:iload_3         
	//*  11   17:icmpge          150
		{
			ConstraintWidget constraintwidget = (ConstraintWidget)mChildren.get(i);
	//   12   20:aload_0         
	//   13   21:getfield        #102 <Field ArrayList mChildren>
	//   14   24:iload_2         
	//   15   25:invokevirtual   #112 <Method Object ArrayList.get(int)>
	//   16   28:checkcast       #114 <Class ConstraintWidget>
	//   17   31:astore          4
			if(constraintwidget instanceof ConstraintWidgetContainer)
	//*  18   33:aload           4
	//*  19   35:instanceof      #2   <Class ConstraintWidgetContainer>
	//*  20   38:ifeq            130
			{
				ConstraintWidget.DimensionBehaviour dimensionbehaviour = constraintwidget.mListDimensionBehaviors[0];
	//   21   41:aload           4
	//   22   43:getfield        #118 <Field ConstraintWidget$DimensionBehaviour[] ConstraintWidget.mListDimensionBehaviors>
	//   23   46:iconst_0        
	//   24   47:aaload          
	//   25   48:astore          5
				ConstraintWidget.DimensionBehaviour dimensionbehaviour1 = constraintwidget.mListDimensionBehaviors[1];
	//   26   50:aload           4
	//   27   52:getfield        #118 <Field ConstraintWidget$DimensionBehaviour[] ConstraintWidget.mListDimensionBehaviors>
	//   28   55:iconst_1        
	//   29   56:aaload          
	//   30   57:astore          6
				if(dimensionbehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)
	//*  31   59:aload           5
	//*  32   61:getstatic       #124 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//*  33   64:if_acmpne       75
					constraintwidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
	//   34   67:aload           4
	//   35   69:getstatic       #127 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.FIXED>
	//   36   72:invokevirtual   #131 <Method void ConstraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget$DimensionBehaviour)>
				if(dimensionbehaviour1 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)
	//*  37   75:aload           6
	//*  38   77:getstatic       #124 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//*  39   80:if_acmpne       91
					constraintwidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
	//   40   83:aload           4
	//   41   85:getstatic       #127 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.FIXED>
	//   42   88:invokevirtual   #134 <Method void ConstraintWidget.setVerticalDimensionBehaviour(ConstraintWidget$DimensionBehaviour)>
				constraintwidget.addToSolver(linearsystem);
	//   43   91:aload           4
	//   44   93:aload_1         
	//   45   94:invokevirtual   #135 <Method void ConstraintWidget.addToSolver(LinearSystem)>
				if(dimensionbehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)
	//*  46   97:aload           5
	//*  47   99:getstatic       #124 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//*  48  102:if_acmpne       112
					constraintwidget.setHorizontalDimensionBehaviour(dimensionbehaviour);
	//   49  105:aload           4
	//   50  107:aload           5
	//   51  109:invokevirtual   #131 <Method void ConstraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget$DimensionBehaviour)>
				if(dimensionbehaviour1 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)
	//*  52  112:aload           6
	//*  53  114:getstatic       #124 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//*  54  117:if_acmpne       143
					constraintwidget.setVerticalDimensionBehaviour(dimensionbehaviour1);
	//   55  120:aload           4
	//   56  122:aload           6
	//   57  124:invokevirtual   #134 <Method void ConstraintWidget.setVerticalDimensionBehaviour(ConstraintWidget$DimensionBehaviour)>
			} else
	//*  58  127:goto            143
			{
				Optimizer.checkMatchParent(this, linearsystem, constraintwidget);
	//   59  130:aload_0         
	//   60  131:aload_1         
	//   61  132:aload           4
	//   62  134:invokestatic    #141 <Method void Optimizer.checkMatchParent(ConstraintWidgetContainer, LinearSystem, ConstraintWidget)>
				constraintwidget.addToSolver(linearsystem);
	//   63  137:aload           4
	//   64  139:aload_1         
	//   65  140:invokevirtual   #135 <Method void ConstraintWidget.addToSolver(LinearSystem)>
			}
		}

	//   66  143:iload_2         
	//   67  144:iconst_1        
	//   68  145:iadd            
	//   69  146:istore_2        
	//*  70  147:goto            15
		if(mHorizontalChainsSize > 0)
	//*  71  150:aload_0         
	//*  72  151:getfield        #45  <Field int mHorizontalChainsSize>
	//*  73  154:ifle            163
			Chain.applyChainConstraints(this, linearsystem, 0);
	//   74  157:aload_0         
	//   75  158:aload_1         
	//   76  159:iconst_0        
	//   77  160:invokestatic    #147 <Method void Chain.applyChainConstraints(ConstraintWidgetContainer, LinearSystem, int)>
		if(mVerticalChainsSize > 0)
	//*  78  163:aload_0         
	//*  79  164:getfield        #47  <Field int mVerticalChainsSize>
	//*  80  167:ifle            176
			Chain.applyChainConstraints(this, linearsystem, 1);
	//   81  170:aload_0         
	//   82  171:aload_1         
	//   83  172:iconst_1        
	//   84  173:invokestatic    #147 <Method void Chain.applyChainConstraints(ConstraintWidgetContainer, LinearSystem, int)>
		return true;
	//   85  176:iconst_1        
	//   86  177:ireturn         
	}

	public void analyze(int i)
	{
		super.analyze(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #151 <Method void WidgetContainer.analyze(int)>
		int k = mChildren.size();
	//    3    5:aload_0         
	//    4    6:getfield        #102 <Field ArrayList mChildren>
	//    5    9:invokevirtual   #108 <Method int ArrayList.size()>
	//    6   12:istore_3        
		for(int j = 0; j < k; j++)
	//*   7   13:iconst_0        
	//*   8   14:istore_2        
	//*   9   15:iload_2         
	//*  10   16:iload_3         
	//*  11   17:icmpge          42
			((ConstraintWidget)mChildren.get(j)).analyze(i);
	//   12   20:aload_0         
	//   13   21:getfield        #102 <Field ArrayList mChildren>
	//   14   24:iload_2         
	//   15   25:invokevirtual   #112 <Method Object ArrayList.get(int)>
	//   16   28:checkcast       #114 <Class ConstraintWidget>
	//   17   31:iload_1         
	//   18   32:invokevirtual   #152 <Method void ConstraintWidget.analyze(int)>

	//   19   35:iload_2         
	//   20   36:iconst_1        
	//   21   37:iadd            
	//   22   38:istore_2        
	//*  23   39:goto            15
	//   24   42:return          
	}

	public void fillMetrics(Metrics metrics)
	{
		mSystem.fillMetrics(metrics);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field LinearSystem mSystem>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #156 <Method void LinearSystem.fillMetrics(Metrics)>
	//    4    8:return          
	}

	public ArrayList getHorizontalGuidelines()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #104 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #159 <Method void ArrayList()>
	//    3    7:astore_3        
		int j = mChildren.size();
	//    4    8:aload_0         
	//    5    9:getfield        #102 <Field ArrayList mChildren>
	//    6   12:invokevirtual   #108 <Method int ArrayList.size()>
	//    7   15:istore_2        
		for(int i = 0; i < j; i++)
	//*   8   16:iconst_0        
	//*   9   17:istore_1        
	//*  10   18:iload_1         
	//*  11   19:iload_2         
	//*  12   20:icmpge          73
		{
			Object obj = ((Object) ((ConstraintWidget)mChildren.get(i)));
	//   13   23:aload_0         
	//   14   24:getfield        #102 <Field ArrayList mChildren>
	//   15   27:iload_1         
	//   16   28:invokevirtual   #112 <Method Object ArrayList.get(int)>
	//   17   31:checkcast       #114 <Class ConstraintWidget>
	//   18   34:astore          4
			if(!(obj instanceof Guideline))
				continue;
	//   19   36:aload           4
	//   20   38:instanceof      #161 <Class Guideline>
	//   21   41:ifeq            66
			obj = ((Object) ((Guideline)obj));
	//   22   44:aload           4
	//   23   46:checkcast       #161 <Class Guideline>
	//   24   49:astore          4
			if(((Guideline) (obj)).getOrientation() == 0)
	//*  25   51:aload           4
	//*  26   53:invokevirtual   #164 <Method int Guideline.getOrientation()>
	//*  27   56:ifne            66
				arraylist.add(obj);
	//   28   59:aload_3         
	//   29   60:aload           4
	//   30   62:invokevirtual   #168 <Method boolean ArrayList.add(Object)>
	//   31   65:pop             
		}

	//   32   66:iload_1         
	//   33   67:iconst_1        
	//   34   68:iadd            
	//   35   69:istore_1        
	//*  36   70:goto            18
		return arraylist;
	//   37   73:aload_3         
	//   38   74:areturn         
	}

	public int getOptimizationLevel()
	{
		return mOptimizationLevel;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int mOptimizationLevel>
	//    2    4:ireturn         
	}

	public LinearSystem getSystem()
	{
		return mSystem;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field LinearSystem mSystem>
	//    2    4:areturn         
	}

	public String getType()
	{
		return "ConstraintLayout";
	//    0    0:ldc1            #177 <String "ConstraintLayout">
	//    1    2:areturn         
	}

	public ArrayList getVerticalGuidelines()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #104 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #159 <Method void ArrayList()>
	//    3    7:astore_3        
		int j = mChildren.size();
	//    4    8:aload_0         
	//    5    9:getfield        #102 <Field ArrayList mChildren>
	//    6   12:invokevirtual   #108 <Method int ArrayList.size()>
	//    7   15:istore_2        
		for(int i = 0; i < j; i++)
	//*   8   16:iconst_0        
	//*   9   17:istore_1        
	//*  10   18:iload_1         
	//*  11   19:iload_2         
	//*  12   20:icmpge          74
		{
			Object obj = ((Object) ((ConstraintWidget)mChildren.get(i)));
	//   13   23:aload_0         
	//   14   24:getfield        #102 <Field ArrayList mChildren>
	//   15   27:iload_1         
	//   16   28:invokevirtual   #112 <Method Object ArrayList.get(int)>
	//   17   31:checkcast       #114 <Class ConstraintWidget>
	//   18   34:astore          4
			if(!(obj instanceof Guideline))
				continue;
	//   19   36:aload           4
	//   20   38:instanceof      #161 <Class Guideline>
	//   21   41:ifeq            67
			obj = ((Object) ((Guideline)obj));
	//   22   44:aload           4
	//   23   46:checkcast       #161 <Class Guideline>
	//   24   49:astore          4
			if(((Guideline) (obj)).getOrientation() == 1)
	//*  25   51:aload           4
	//*  26   53:invokevirtual   #164 <Method int Guideline.getOrientation()>
	//*  27   56:iconst_1        
	//*  28   57:icmpne          67
				arraylist.add(obj);
	//   29   60:aload_3         
	//   30   61:aload           4
	//   31   63:invokevirtual   #168 <Method boolean ArrayList.add(Object)>
	//   32   66:pop             
		}

	//   33   67:iload_1         
	//   34   68:iconst_1        
	//   35   69:iadd            
	//   36   70:istore_1        
	//*  37   71:goto            18
		return arraylist;
	//   38   74:aload_3         
	//   39   75:areturn         
	}

	public boolean handlesInternalConstraints()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isHeightMeasuredTooSmall()
	{
		return mHeightMeasuredTooSmall;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field boolean mHeightMeasuredTooSmall>
	//    2    4:ireturn         
	}

	public boolean isRtl()
	{
		return mIsRtl;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field boolean mIsRtl>
	//    2    4:ireturn         
	}

	public boolean isWidthMeasuredTooSmall()
	{
		return mWidthMeasuredTooSmall;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field boolean mWidthMeasuredTooSmall>
	//    2    4:ireturn         
	}

	public void layout()
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #184 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #186 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #191 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public void optimize()
	{
		if(!optimizeFor(8))
	//*   0    0:aload_0         
	//*   1    1:bipush          8
	//*   2    3:invokevirtual   #196 <Method boolean optimizeFor(int)>
	//*   3    6:ifne            17
			analyze(mOptimizationLevel);
	//    4    9:aload_0         
	//    5   10:aload_0         
	//    6   11:getfield        #55  <Field int mOptimizationLevel>
	//    7   14:invokevirtual   #197 <Method void analyze(int)>
		solveGraph();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #200 <Method void solveGraph()>
	//   10   21:return          
	}

	public boolean optimizeFor(int i)
	{
		return (mOptimizationLevel & i) == i;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int mOptimizationLevel>
	//    2    4:iload_1         
	//    3    5:iand            
	//    4    6:iload_1         
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public void optimizeForDimensions(int i, int j)
	{
		if(mListDimensionBehaviors[0] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && mResolutionWidth != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #202 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//*   2    4:iconst_0        
	//*   3    5:aaload          
	//*   4    6:getstatic       #124 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//*   5    9:if_acmpeq       27
	//*   6   12:aload_0         
	//*   7   13:getfield        #206 <Field ResolutionDimension mResolutionWidth>
	//*   8   16:ifnull          27
			mResolutionWidth.resolve(i);
	//    9   19:aload_0         
	//   10   20:getfield        #206 <Field ResolutionDimension mResolutionWidth>
	//   11   23:iload_1         
	//   12   24:invokevirtual   #211 <Method void ResolutionDimension.resolve(int)>
		if(mListDimensionBehaviors[1] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && mResolutionHeight != null)
	//*  13   27:aload_0         
	//*  14   28:getfield        #202 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//*  15   31:iconst_1        
	//*  16   32:aaload          
	//*  17   33:getstatic       #124 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//*  18   36:if_acmpeq       54
	//*  19   39:aload_0         
	//*  20   40:getfield        #214 <Field ResolutionDimension mResolutionHeight>
	//*  21   43:ifnull          54
			mResolutionHeight.resolve(j);
	//   22   46:aload_0         
	//   23   47:getfield        #214 <Field ResolutionDimension mResolutionHeight>
	//   24   50:iload_2         
	//   25   51:invokevirtual   #211 <Method void ResolutionDimension.resolve(int)>
	//   26   54:return          
	}

	public void optimizeReset()
	{
		int j = mChildren.size();
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field ArrayList mChildren>
	//    2    4:invokevirtual   #108 <Method int ArrayList.size()>
	//    3    7:istore_2        
		resetResolutionNodes();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #218 <Method void resetResolutionNodes()>
		for(int i = 0; i < j; i++)
	//*   6   12:iconst_0        
	//*   7   13:istore_1        
	//*   8   14:iload_1         
	//*   9   15:iload_2         
	//*  10   16:icmpge          40
			((ConstraintWidget)mChildren.get(i)).resetResolutionNodes();
	//   11   19:aload_0         
	//   12   20:getfield        #102 <Field ArrayList mChildren>
	//   13   23:iload_1         
	//   14   24:invokevirtual   #112 <Method Object ArrayList.get(int)>
	//   15   27:checkcast       #114 <Class ConstraintWidget>
	//   16   30:invokevirtual   #219 <Method void ConstraintWidget.resetResolutionNodes()>

	//   17   33:iload_1         
	//   18   34:iconst_1        
	//   19   35:iadd            
	//   20   36:istore_1        
	//*  21   37:goto            14
	//   22   40:return          
	}

	public void preOptimize()
	{
		optimizeReset();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #222 <Method void optimizeReset()>
		analyze(mOptimizationLevel);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #55  <Field int mOptimizationLevel>
	//    5    9:invokevirtual   #197 <Method void analyze(int)>
	//    6   12:return          
	}

	public void reset()
	{
		mSystem.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field LinearSystem mSystem>
	//    2    4:invokevirtual   #225 <Method void LinearSystem.reset()>
		mPaddingLeft = 0;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #227 <Field int mPaddingLeft>
		mPaddingRight = 0;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #229 <Field int mPaddingRight>
		mPaddingTop = 0;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:putfield        #231 <Field int mPaddingTop>
		mPaddingBottom = 0;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #233 <Field int mPaddingBottom>
		super.reset();
	//   15   27:aload_0         
	//   16   28:invokespecial   #234 <Method void WidgetContainer.reset()>
	//   17   31:return          
	}

	public void resetGraph()
	{
		ResolutionAnchor resolutionanchor = getAnchor(ConstraintAnchor.Type.LEFT).getResolutionNode();
	//    0    0:aload_0         
	//    1    1:getstatic       #241 <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//    2    4:invokevirtual   #245 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//    3    7:invokevirtual   #251 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//    4   10:astore_1        
		ResolutionAnchor resolutionanchor1 = getAnchor(ConstraintAnchor.Type.TOP).getResolutionNode();
	//    5   11:aload_0         
	//    6   12:getstatic       #254 <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//    7   15:invokevirtual   #245 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//    8   18:invokevirtual   #251 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//    9   21:astore_2        
		resolutionanchor.invalidateAnchors();
	//   10   22:aload_1         
	//   11   23:invokevirtual   #259 <Method void ResolutionAnchor.invalidateAnchors()>
		resolutionanchor1.invalidateAnchors();
	//   12   26:aload_2         
	//   13   27:invokevirtual   #259 <Method void ResolutionAnchor.invalidateAnchors()>
		resolutionanchor.resolve(((ResolutionAnchor) (null)), 0.0F);
	//   14   30:aload_1         
	//   15   31:aconst_null     
	//   16   32:fconst_0        
	//   17   33:invokevirtual   #262 <Method void ResolutionAnchor.resolve(ResolutionAnchor, float)>
		resolutionanchor1.resolve(((ResolutionAnchor) (null)), 0.0F);
	//   18   36:aload_2         
	//   19   37:aconst_null     
	//   20   38:fconst_0        
	//   21   39:invokevirtual   #262 <Method void ResolutionAnchor.resolve(ResolutionAnchor, float)>
	//   22   42:return          
	}

	public void setOptimizationLevel(int i)
	{
		mOptimizationLevel = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #55  <Field int mOptimizationLevel>
	//    3    5:return          
	}

	public void setPadding(int i, int j, int k, int l)
	{
		mPaddingLeft = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #227 <Field int mPaddingLeft>
		mPaddingTop = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #231 <Field int mPaddingTop>
		mPaddingRight = k;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #229 <Field int mPaddingRight>
		mPaddingBottom = l;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #233 <Field int mPaddingBottom>
	//   12   21:return          
	}

	public void setRtl(boolean flag)
	{
		mIsRtl = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #38  <Field boolean mIsRtl>
	//    3    5:return          
	}

	public void solveGraph()
	{
		ResolutionAnchor resolutionanchor = getAnchor(ConstraintAnchor.Type.LEFT).getResolutionNode();
	//    0    0:aload_0         
	//    1    1:getstatic       #241 <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//    2    4:invokevirtual   #245 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//    3    7:invokevirtual   #251 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//    4   10:astore_1        
		ResolutionAnchor resolutionanchor1 = getAnchor(ConstraintAnchor.Type.TOP).getResolutionNode();
	//    5   11:aload_0         
	//    6   12:getstatic       #254 <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//    7   15:invokevirtual   #245 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//    8   18:invokevirtual   #251 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//    9   21:astore_2        
		resolutionanchor.resolve(((ResolutionAnchor) (null)), 0.0F);
	//   10   22:aload_1         
	//   11   23:aconst_null     
	//   12   24:fconst_0        
	//   13   25:invokevirtual   #262 <Method void ResolutionAnchor.resolve(ResolutionAnchor, float)>
		resolutionanchor1.resolve(((ResolutionAnchor) (null)), 0.0F);
	//   14   28:aload_2         
	//   15   29:aconst_null     
	//   16   30:fconst_0        
	//   17   31:invokevirtual   #262 <Method void ResolutionAnchor.resolve(ResolutionAnchor, float)>
	//   18   34:return          
	}

	public void updateChildrenFromSolver(LinearSystem linearsystem, boolean aflag[])
	{
		aflag[2] = false;
	//    0    0:aload_2         
	//    1    1:iconst_2        
	//    2    2:iconst_0        
	//    3    3:bastore         
		updateFromSolver(linearsystem);
	//    4    4:aload_0         
	//    5    5:aload_1         
	//    6    6:invokevirtual   #271 <Method void updateFromSolver(LinearSystem)>
		int j = mChildren.size();
	//    7    9:aload_0         
	//    8   10:getfield        #102 <Field ArrayList mChildren>
	//    9   13:invokevirtual   #108 <Method int ArrayList.size()>
	//   10   16:istore          4
		for(int i = 0; i < j; i++)
	//*  11   18:iconst_0        
	//*  12   19:istore_3        
	//*  13   20:iload_3         
	//*  14   21:iload           4
	//*  15   23:icmpge          112
		{
			ConstraintWidget constraintwidget = (ConstraintWidget)mChildren.get(i);
	//   16   26:aload_0         
	//   17   27:getfield        #102 <Field ArrayList mChildren>
	//   18   30:iload_3         
	//   19   31:invokevirtual   #112 <Method Object ArrayList.get(int)>
	//   20   34:checkcast       #114 <Class ConstraintWidget>
	//   21   37:astore          5
			constraintwidget.updateFromSolver(linearsystem);
	//   22   39:aload           5
	//   23   41:aload_1         
	//   24   42:invokevirtual   #272 <Method void ConstraintWidget.updateFromSolver(LinearSystem)>
			if(constraintwidget.mListDimensionBehaviors[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintwidget.getWidth() < constraintwidget.getWrapWidth())
	//*  25   45:aload           5
	//*  26   47:getfield        #118 <Field ConstraintWidget$DimensionBehaviour[] ConstraintWidget.mListDimensionBehaviors>
	//*  27   50:iconst_0        
	//*  28   51:aaload          
	//*  29   52:getstatic       #275 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//*  30   55:if_acmpne       75
	//*  31   58:aload           5
	//*  32   60:invokevirtual   #278 <Method int ConstraintWidget.getWidth()>
	//*  33   63:aload           5
	//*  34   65:invokevirtual   #281 <Method int ConstraintWidget.getWrapWidth()>
	//*  35   68:icmpge          75
				aflag[2] = true;
	//   36   71:aload_2         
	//   37   72:iconst_2        
	//   38   73:iconst_1        
	//   39   74:bastore         
			if(constraintwidget.mListDimensionBehaviors[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintwidget.getHeight() < constraintwidget.getWrapHeight())
	//*  40   75:aload           5
	//*  41   77:getfield        #118 <Field ConstraintWidget$DimensionBehaviour[] ConstraintWidget.mListDimensionBehaviors>
	//*  42   80:iconst_1        
	//*  43   81:aaload          
	//*  44   82:getstatic       #275 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//*  45   85:if_acmpne       105
	//*  46   88:aload           5
	//*  47   90:invokevirtual   #284 <Method int ConstraintWidget.getHeight()>
	//*  48   93:aload           5
	//*  49   95:invokevirtual   #287 <Method int ConstraintWidget.getWrapHeight()>
	//*  50   98:icmpge          105
				aflag[2] = true;
	//   51  101:aload_2         
	//   52  102:iconst_2        
	//   53  103:iconst_1        
	//   54  104:bastore         
		}

	//   55  105:iload_3         
	//   56  106:iconst_1        
	//   57  107:iadd            
	//   58  108:istore_3        
	//*  59  109:goto            20
	//   60  112:return          
	}

	private static final boolean DEBUG = false;
	static final boolean DEBUG_GRAPH = false;
	private static final boolean DEBUG_LAYOUT = false;
	private static final int MAX_ITERATIONS = 8;
	private static final boolean USE_SNAPSHOT = true;
	int mDebugSolverPassCount;
	private boolean mHeightMeasuredTooSmall;
	ChainHead mHorizontalChainsArray[];
	int mHorizontalChainsSize;
	private boolean mIsRtl;
	private int mOptimizationLevel;
	int mPaddingBottom;
	int mPaddingLeft;
	int mPaddingRight;
	int mPaddingTop;
	private Snapshot mSnapshot;
	protected LinearSystem mSystem;
	ChainHead mVerticalChainsArray[];
	int mVerticalChainsSize;
	private boolean mWidthMeasuredTooSmall;
}
