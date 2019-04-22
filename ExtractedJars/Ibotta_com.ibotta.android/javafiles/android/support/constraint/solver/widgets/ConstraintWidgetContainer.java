// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver.widgets;

import android.support.constraint.solver.LinearSystem;
import android.support.constraint.solver.Metrics;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package android.support.constraint.solver.widgets:
//			WidgetContainer, ChainHead, ConstraintWidget, Optimizer, 
//			Chain, Snapshot, ResolutionDimension, ConstraintAnchor, 
//			ResolutionAnchor

public class ConstraintWidgetContainer extends WidgetContainer
{

	public ConstraintWidgetContainer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void WidgetContainer()>
		mIsRtl = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #30  <Field boolean mIsRtl>
		mSystem = new LinearSystem();
	//    5    9:aload_0         
	//    6   10:new             #32  <Class LinearSystem>
	//    7   13:dup             
	//    8   14:invokespecial   #33  <Method void LinearSystem()>
	//    9   17:putfield        #35  <Field LinearSystem mSystem>
		mHorizontalChainsSize = 0;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #37  <Field int mHorizontalChainsSize>
		mVerticalChainsSize = 0;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #39  <Field int mVerticalChainsSize>
		mVerticalChainsArray = new ChainHead[4];
	//   16   30:aload_0         
	//   17   31:iconst_4        
	//   18   32:anewarray       ChainHead[]
	//   19   35:putfield        #43  <Field ChainHead[] mVerticalChainsArray>
		mHorizontalChainsArray = new ChainHead[4];
	//   20   38:aload_0         
	//   21   39:iconst_4        
	//   22   40:anewarray       ChainHead[]
	//   23   43:putfield        #45  <Field ChainHead[] mHorizontalChainsArray>
		mOptimizationLevel = 3;
	//   24   46:aload_0         
	//   25   47:iconst_3        
	//   26   48:putfield        #47  <Field int mOptimizationLevel>
		mWidthMeasuredTooSmall = false;
	//   27   51:aload_0         
	//   28   52:iconst_0        
	//   29   53:putfield        #49  <Field boolean mWidthMeasuredTooSmall>
		mHeightMeasuredTooSmall = false;
	//   30   56:aload_0         
	//   31   57:iconst_0        
	//   32   58:putfield        #51  <Field boolean mHeightMeasuredTooSmall>
		mDebugSolverPassCount = 0;
	//   33   61:aload_0         
	//   34   62:iconst_0        
	//   35   63:putfield        #53  <Field int mDebugSolverPassCount>
	//   36   66:return          
	}

	private void addHorizontalChain(ConstraintWidget constraintwidget)
	{
		int i = mHorizontalChainsSize;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int mHorizontalChainsSize>
	//    2    4:istore_2        
		ChainHead achainhead[] = mHorizontalChainsArray;
	//    3    5:aload_0         
	//    4    6:getfield        #45  <Field ChainHead[] mHorizontalChainsArray>
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
	//   18   24:invokestatic    #62  <Method Object[] Arrays.copyOf(Object[], int)>
	//   19   27:checkcast       #63  <Class ChainHead[]>
	//   20   30:putfield        #45  <Field ChainHead[] mHorizontalChainsArray>
		mHorizontalChainsArray[mHorizontalChainsSize] = new ChainHead(constraintwidget, 0, isRtl());
	//   21   33:aload_0         
	//   22   34:getfield        #45  <Field ChainHead[] mHorizontalChainsArray>
	//   23   37:aload_0         
	//   24   38:getfield        #37  <Field int mHorizontalChainsSize>
	//   25   41:new             #41  <Class ChainHead>
	//   26   44:dup             
	//   27   45:aload_1         
	//   28   46:iconst_0        
	//   29   47:aload_0         
	//   30   48:invokevirtual   #67  <Method boolean isRtl()>
	//   31   51:invokespecial   #70  <Method void ChainHead(ConstraintWidget, int, boolean)>
	//   32   54:aastore         
		mHorizontalChainsSize = mHorizontalChainsSize + 1;
	//   33   55:aload_0         
	//   34   56:aload_0         
	//   35   57:getfield        #37  <Field int mHorizontalChainsSize>
	//   36   60:iconst_1        
	//   37   61:iadd            
	//   38   62:putfield        #37  <Field int mHorizontalChainsSize>
	//   39   65:return          
	}

	private void addVerticalChain(ConstraintWidget constraintwidget)
	{
		int i = mVerticalChainsSize;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int mVerticalChainsSize>
	//    2    4:istore_2        
		ChainHead achainhead[] = mVerticalChainsArray;
	//    3    5:aload_0         
	//    4    6:getfield        #43  <Field ChainHead[] mVerticalChainsArray>
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
	//   18   24:invokestatic    #62  <Method Object[] Arrays.copyOf(Object[], int)>
	//   19   27:checkcast       #63  <Class ChainHead[]>
	//   20   30:putfield        #43  <Field ChainHead[] mVerticalChainsArray>
		mVerticalChainsArray[mVerticalChainsSize] = new ChainHead(constraintwidget, 1, isRtl());
	//   21   33:aload_0         
	//   22   34:getfield        #43  <Field ChainHead[] mVerticalChainsArray>
	//   23   37:aload_0         
	//   24   38:getfield        #39  <Field int mVerticalChainsSize>
	//   25   41:new             #41  <Class ChainHead>
	//   26   44:dup             
	//   27   45:aload_1         
	//   28   46:iconst_1        
	//   29   47:aload_0         
	//   30   48:invokevirtual   #67  <Method boolean isRtl()>
	//   31   51:invokespecial   #70  <Method void ChainHead(ConstraintWidget, int, boolean)>
	//   32   54:aastore         
		mVerticalChainsSize = mVerticalChainsSize + 1;
	//   33   55:aload_0         
	//   34   56:aload_0         
	//   35   57:getfield        #39  <Field int mVerticalChainsSize>
	//   36   60:iconst_1        
	//   37   61:iadd            
	//   38   62:putfield        #39  <Field int mVerticalChainsSize>
	//   39   65:return          
	}

	private void resetChains()
	{
		mHorizontalChainsSize = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #37  <Field int mHorizontalChainsSize>
		mVerticalChainsSize = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #39  <Field int mVerticalChainsSize>
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
	//    4    6:invokespecial   #76  <Method void addHorizontalChain(ConstraintWidget)>
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
	//   11   17:invokespecial   #78  <Method void addVerticalChain(ConstraintWidget)>
	//   12   20:return          
	}

	public boolean addChildrenToSolver(LinearSystem linearsystem)
	{
		addToSolver(linearsystem);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #84  <Method void addToSolver(LinearSystem)>
		int j = mChildren.size();
	//    3    5:aload_0         
	//    4    6:getfield        #88  <Field ArrayList mChildren>
	//    5    9:invokevirtual   #94  <Method int ArrayList.size()>
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
	//   13   21:getfield        #88  <Field ArrayList mChildren>
	//   14   24:iload_2         
	//   15   25:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//   16   28:checkcast       #100 <Class ConstraintWidget>
	//   17   31:astore          4
			if(constraintwidget instanceof ConstraintWidgetContainer)
	//*  18   33:aload           4
	//*  19   35:instanceof      #2   <Class ConstraintWidgetContainer>
	//*  20   38:ifeq            130
			{
				ConstraintWidget.DimensionBehaviour dimensionbehaviour = constraintwidget.mListDimensionBehaviors[0];
	//   21   41:aload           4
	//   22   43:getfield        #104 <Field ConstraintWidget$DimensionBehaviour[] ConstraintWidget.mListDimensionBehaviors>
	//   23   46:iconst_0        
	//   24   47:aaload          
	//   25   48:astore          5
				ConstraintWidget.DimensionBehaviour dimensionbehaviour1 = constraintwidget.mListDimensionBehaviors[1];
	//   26   50:aload           4
	//   27   52:getfield        #104 <Field ConstraintWidget$DimensionBehaviour[] ConstraintWidget.mListDimensionBehaviors>
	//   28   55:iconst_1        
	//   29   56:aaload          
	//   30   57:astore          6
				if(dimensionbehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)
	//*  31   59:aload           5
	//*  32   61:getstatic       #110 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//*  33   64:if_acmpne       75
					constraintwidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
	//   34   67:aload           4
	//   35   69:getstatic       #113 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.FIXED>
	//   36   72:invokevirtual   #117 <Method void ConstraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget$DimensionBehaviour)>
				if(dimensionbehaviour1 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)
	//*  37   75:aload           6
	//*  38   77:getstatic       #110 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//*  39   80:if_acmpne       91
					constraintwidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
	//   40   83:aload           4
	//   41   85:getstatic       #113 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.FIXED>
	//   42   88:invokevirtual   #120 <Method void ConstraintWidget.setVerticalDimensionBehaviour(ConstraintWidget$DimensionBehaviour)>
				constraintwidget.addToSolver(linearsystem);
	//   43   91:aload           4
	//   44   93:aload_1         
	//   45   94:invokevirtual   #121 <Method void ConstraintWidget.addToSolver(LinearSystem)>
				if(dimensionbehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)
	//*  46   97:aload           5
	//*  47   99:getstatic       #110 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//*  48  102:if_acmpne       112
					constraintwidget.setHorizontalDimensionBehaviour(dimensionbehaviour);
	//   49  105:aload           4
	//   50  107:aload           5
	//   51  109:invokevirtual   #117 <Method void ConstraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget$DimensionBehaviour)>
				if(dimensionbehaviour1 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)
	//*  52  112:aload           6
	//*  53  114:getstatic       #110 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//*  54  117:if_acmpne       143
					constraintwidget.setVerticalDimensionBehaviour(dimensionbehaviour1);
	//   55  120:aload           4
	//   56  122:aload           6
	//   57  124:invokevirtual   #120 <Method void ConstraintWidget.setVerticalDimensionBehaviour(ConstraintWidget$DimensionBehaviour)>
			} else
	//*  58  127:goto            143
			{
				Optimizer.checkMatchParent(this, linearsystem, constraintwidget);
	//   59  130:aload_0         
	//   60  131:aload_1         
	//   61  132:aload           4
	//   62  134:invokestatic    #127 <Method void Optimizer.checkMatchParent(ConstraintWidgetContainer, LinearSystem, ConstraintWidget)>
				constraintwidget.addToSolver(linearsystem);
	//   63  137:aload           4
	//   64  139:aload_1         
	//   65  140:invokevirtual   #121 <Method void ConstraintWidget.addToSolver(LinearSystem)>
			}
		}

	//   66  143:iload_2         
	//   67  144:iconst_1        
	//   68  145:iadd            
	//   69  146:istore_2        
	//*  70  147:goto            15
		if(mHorizontalChainsSize > 0)
	//*  71  150:aload_0         
	//*  72  151:getfield        #37  <Field int mHorizontalChainsSize>
	//*  73  154:ifle            163
			Chain.applyChainConstraints(this, linearsystem, 0);
	//   74  157:aload_0         
	//   75  158:aload_1         
	//   76  159:iconst_0        
	//   77  160:invokestatic    #133 <Method void Chain.applyChainConstraints(ConstraintWidgetContainer, LinearSystem, int)>
		if(mVerticalChainsSize > 0)
	//*  78  163:aload_0         
	//*  79  164:getfield        #39  <Field int mVerticalChainsSize>
	//*  80  167:ifle            176
			Chain.applyChainConstraints(this, linearsystem, 1);
	//   81  170:aload_0         
	//   82  171:aload_1         
	//   83  172:iconst_1        
	//   84  173:invokestatic    #133 <Method void Chain.applyChainConstraints(ConstraintWidgetContainer, LinearSystem, int)>
		return true;
	//   85  176:iconst_1        
	//   86  177:ireturn         
	}

	public void analyze(int i)
	{
		super.analyze(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #137 <Method void WidgetContainer.analyze(int)>
		int k = mChildren.size();
	//    3    5:aload_0         
	//    4    6:getfield        #88  <Field ArrayList mChildren>
	//    5    9:invokevirtual   #94  <Method int ArrayList.size()>
	//    6   12:istore_3        
		for(int j = 0; j < k; j++)
	//*   7   13:iconst_0        
	//*   8   14:istore_2        
	//*   9   15:iload_2         
	//*  10   16:iload_3         
	//*  11   17:icmpge          42
			((ConstraintWidget)mChildren.get(j)).analyze(i);
	//   12   20:aload_0         
	//   13   21:getfield        #88  <Field ArrayList mChildren>
	//   14   24:iload_2         
	//   15   25:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//   16   28:checkcast       #100 <Class ConstraintWidget>
	//   17   31:iload_1         
	//   18   32:invokevirtual   #138 <Method void ConstraintWidget.analyze(int)>

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
	//    1    1:getfield        #35  <Field LinearSystem mSystem>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #142 <Method void LinearSystem.fillMetrics(Metrics)>
	//    4    8:return          
	}

	public int getOptimizationLevel()
	{
		return mOptimizationLevel;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int mOptimizationLevel>
	//    2    4:ireturn         
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
	//    1    1:getfield        #51  <Field boolean mHeightMeasuredTooSmall>
	//    2    4:ireturn         
	}

	public boolean isRtl()
	{
		return mIsRtl;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field boolean mIsRtl>
	//    2    4:ireturn         
	}

	public boolean isWidthMeasuredTooSmall()
	{
		return mWidthMeasuredTooSmall;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field boolean mWidthMeasuredTooSmall>
	//    2    4:ireturn         
	}

	public void layout()
	{
		boolean flag;
		int j;
		int l1;
		int i2;
		int j2;
		int k2;
		int l2;
		boolean flag2;
		ConstraintWidget.DimensionBehaviour dimensionbehaviour;
		ConstraintWidget.DimensionBehaviour dimensionbehaviour1;
		l1 = mX;
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field int mX>
	//    2    4:istore          6
		i2 = mY;
	//    3    6:aload_0         
	//    4    7:getfield        #155 <Field int mY>
	//    5   10:istore          7
		j2 = Math.max(0, getWidth());
	//    6   12:iconst_0        
	//    7   13:aload_0         
	//    8   14:invokevirtual   #158 <Method int getWidth()>
	//    9   17:invokestatic    #164 <Method int Math.max(int, int)>
	//   10   20:istore          8
		k2 = Math.max(0, getHeight());
	//   11   22:iconst_0        
	//   12   23:aload_0         
	//   13   24:invokevirtual   #167 <Method int getHeight()>
	//   14   27:invokestatic    #164 <Method int Math.max(int, int)>
	//   15   30:istore          9
		mWidthMeasuredTooSmall = false;
	//   16   32:aload_0         
	//   17   33:iconst_0        
	//   18   34:putfield        #49  <Field boolean mWidthMeasuredTooSmall>
		mHeightMeasuredTooSmall = false;
	//   19   37:aload_0         
	//   20   38:iconst_0        
	//   21   39:putfield        #51  <Field boolean mHeightMeasuredTooSmall>
		if(mParent != null)
	//*  22   42:aload_0         
	//*  23   43:getfield        #171 <Field ConstraintWidget mParent>
	//*  24   46:ifnull          110
		{
			if(mSnapshot == null)
	//*  25   49:aload_0         
	//*  26   50:getfield        #173 <Field Snapshot mSnapshot>
	//*  27   53:ifnonnull       68
				mSnapshot = new Snapshot(((ConstraintWidget) (this)));
	//   28   56:aload_0         
	//   29   57:new             #175 <Class Snapshot>
	//   30   60:dup             
	//   31   61:aload_0         
	//   32   62:invokespecial   #177 <Method void Snapshot(ConstraintWidget)>
	//   33   65:putfield        #173 <Field Snapshot mSnapshot>
			mSnapshot.updateFrom(((ConstraintWidget) (this)));
	//   34   68:aload_0         
	//   35   69:getfield        #173 <Field Snapshot mSnapshot>
	//   36   72:aload_0         
	//   37   73:invokevirtual   #180 <Method void Snapshot.updateFrom(ConstraintWidget)>
			setX(mPaddingLeft);
	//   38   76:aload_0         
	//   39   77:aload_0         
	//   40   78:getfield        #182 <Field int mPaddingLeft>
	//   41   81:invokevirtual   #185 <Method void setX(int)>
			setY(mPaddingTop);
	//   42   84:aload_0         
	//   43   85:aload_0         
	//   44   86:getfield        #187 <Field int mPaddingTop>
	//   45   89:invokevirtual   #190 <Method void setY(int)>
			resetAnchors();
	//   46   92:aload_0         
	//   47   93:invokevirtual   #193 <Method void resetAnchors()>
			resetSolverVariables(mSystem.getCache());
	//   48   96:aload_0         
	//   49   97:aload_0         
	//   50   98:getfield        #35  <Field LinearSystem mSystem>
	//   51  101:invokevirtual   #197 <Method android.support.constraint.solver.Cache LinearSystem.getCache()>
	//   52  104:invokevirtual   #201 <Method void resetSolverVariables(android.support.constraint.solver.Cache)>
		} else
	//*  53  107:goto            120
		{
			mX = 0;
	//   54  110:aload_0         
	//   55  111:iconst_0        
	//   56  112:putfield        #152 <Field int mX>
			mY = 0;
	//   57  115:aload_0         
	//   58  116:iconst_0        
	//   59  117:putfield        #155 <Field int mY>
		}
		if(mOptimizationLevel != 0)
	//*  60  120:aload_0         
	//*  61  121:getfield        #47  <Field int mOptimizationLevel>
	//*  62  124:ifeq            155
		{
			if(!optimizeFor(8))
	//*  63  127:aload_0         
	//*  64  128:bipush          8
	//*  65  130:invokevirtual   #205 <Method boolean optimizeFor(int)>
	//*  66  133:ifne            140
				optimizeReset();
	//   67  136:aload_0         
	//   68  137:invokevirtual   #208 <Method void optimizeReset()>
			optimize();
	//   69  140:aload_0         
	//   70  141:invokevirtual   #211 <Method void optimize()>
			mSystem.graphOptimizer = true;
	//   71  144:aload_0         
	//   72  145:getfield        #35  <Field LinearSystem mSystem>
	//   73  148:iconst_1        
	//   74  149:putfield        #214 <Field boolean LinearSystem.graphOptimizer>
		} else
	//*  75  152:goto            163
		{
			mSystem.graphOptimizer = false;
	//   76  155:aload_0         
	//   77  156:getfield        #35  <Field LinearSystem mSystem>
	//   78  159:iconst_0        
	//   79  160:putfield        #214 <Field boolean LinearSystem.graphOptimizer>
		}
		dimensionbehaviour = mListDimensionBehaviors[1];
	//   80  163:aload_0         
	//   81  164:getfield        #215 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//   82  167:iconst_1        
	//   83  168:aaload          
	//   84  169:astore          13
		dimensionbehaviour1 = mListDimensionBehaviors[0];
	//   85  171:aload_0         
	//   86  172:getfield        #215 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//   87  175:iconst_0        
	//   88  176:aaload          
	//   89  177:astore          14
		resetChains();
	//   90  179:aload_0         
	//   91  180:invokespecial   #217 <Method void resetChains()>
		l2 = mChildren.size();
	//   92  183:aload_0         
	//   93  184:getfield        #88  <Field ArrayList mChildren>
	//   94  187:invokevirtual   #94  <Method int ArrayList.size()>
	//   95  190:istore          10
		for(int i = 0; i < l2; i++)
	//*  96  192:iconst_0        
	//*  97  193:istore_1        
	//*  98  194:iload_1         
	//*  99  195:iload           10
	//* 100  197:icmpge          236
		{
			ConstraintWidget constraintwidget = (ConstraintWidget)mChildren.get(i);
	//  101  200:aload_0         
	//  102  201:getfield        #88  <Field ArrayList mChildren>
	//  103  204:iload_1         
	//  104  205:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//  105  208:checkcast       #100 <Class ConstraintWidget>
	//  106  211:astore          15
			if(constraintwidget instanceof WidgetContainer)
	//* 107  213:aload           15
	//* 108  215:instanceof      #4   <Class WidgetContainer>
	//* 109  218:ifeq            229
				((WidgetContainer)constraintwidget).layout();
	//  110  221:aload           15
	//  111  223:checkcast       #4   <Class WidgetContainer>
	//  112  226:invokevirtual   #219 <Method void WidgetContainer.layout()>
		}

	//  113  229:iload_1         
	//  114  230:iconst_1        
	//  115  231:iadd            
	//  116  232:istore_1        
	//* 117  233:goto            194
		j = 0;
	//  118  236:iconst_0        
	//  119  237:istore_2        
		flag2 = true;
	//  120  238:iconst_1        
	//  121  239:istore          12
		flag = false;
	//  122  241:iconst_0        
	//  123  242:istore_1        
_L5:
		if(!flag2) goto _L2; else goto _L1
	//  124  243:iload           12
	//  125  245:ifeq            942
_L1:
		int k1;
		boolean flag1;
		k1 = j + 1;
	//  126  248:iload_2         
	//  127  249:iconst_1        
	//  128  250:iadd            
	//  129  251:istore          5
		flag1 = flag2;
	//  130  253:iload           12
	//  131  255:istore          11
		mSystem.reset();
	//  132  257:aload_0         
	//  133  258:getfield        #35  <Field LinearSystem mSystem>
	//  134  261:invokevirtual   #222 <Method void LinearSystem.reset()>
		flag1 = flag2;
	//  135  264:iload           12
	//  136  266:istore          11
		createObjectVariables(mSystem);
	//  137  268:aload_0         
	//  138  269:aload_0         
	//  139  270:getfield        #35  <Field LinearSystem mSystem>
	//  140  273:invokevirtual   #225 <Method void createObjectVariables(LinearSystem)>
		j = 0;
	//  141  276:iconst_0        
	//  142  277:istore_2        
_L4:
		if(j >= l2)
			break; /* Loop/switch isn't completed */
	//  143  278:iload_2         
	//  144  279:iload           10
	//  145  281:icmpge          313
		flag1 = flag2;
	//  146  284:iload           12
	//  147  286:istore          11
		((ConstraintWidget)mChildren.get(j)).createObjectVariables(mSystem);
	//  148  288:aload_0         
	//  149  289:getfield        #88  <Field ArrayList mChildren>
	//  150  292:iload_2         
	//  151  293:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//  152  296:checkcast       #100 <Class ConstraintWidget>
	//  153  299:aload_0         
	//  154  300:getfield        #35  <Field LinearSystem mSystem>
	//  155  303:invokevirtual   #226 <Method void ConstraintWidget.createObjectVariables(LinearSystem)>
		j++;
	//  156  306:iload_2         
	//  157  307:iconst_1        
	//  158  308:iadd            
	//  159  309:istore_2        
		if(true) goto _L4; else goto _L3
	//  160  310:goto            278
_L3:
		flag1 = flag2;
	//  161  313:iload           12
	//  162  315:istore          11
		flag2 = addChildrenToSolver(mSystem);
	//  163  317:aload_0         
	//  164  318:aload_0         
	//  165  319:getfield        #35  <Field LinearSystem mSystem>
	//  166  322:invokevirtual   #228 <Method boolean addChildrenToSolver(LinearSystem)>
	//  167  325:istore          12
		flag1 = flag2;
	//  168  327:iload           12
	//  169  329:istore          11
		if(!flag2)
			break MISSING_BLOCK_LABEL_401;
	//  170  331:iload           12
	//  171  333:ifeq            401
		flag1 = flag2;
	//  172  336:iload           12
	//  173  338:istore          11
		mSystem.minimize();
	//  174  340:aload_0         
	//  175  341:getfield        #35  <Field LinearSystem mSystem>
	//  176  344:invokevirtual   #231 <Method void LinearSystem.minimize()>
		flag1 = flag2;
	//  177  347:iload           12
	//  178  349:istore          11
		break MISSING_BLOCK_LABEL_401;
	//  179  351:goto            401
		Exception exception;
		exception;
	//  180  354:astore          15
		exception.printStackTrace();
	//  181  356:aload           15
	//  182  358:invokevirtual   #234 <Method void Exception.printStackTrace()>
		PrintStream printstream = System.out;
	//  183  361:getstatic       #240 <Field PrintStream System.out>
	//  184  364:astore          16
		StringBuilder stringbuilder = new StringBuilder();
	//  185  366:new             #242 <Class StringBuilder>
	//  186  369:dup             
	//  187  370:invokespecial   #243 <Method void StringBuilder()>
	//  188  373:astore          17
		stringbuilder.append("EXCEPTION : ");
	//  189  375:aload           17
	//  190  377:ldc1            #245 <String "EXCEPTION : ">
	//  191  379:invokevirtual   #249 <Method StringBuilder StringBuilder.append(String)>
	//  192  382:pop             
		stringbuilder.append(((Object) (exception)));
	//  193  383:aload           17
	//  194  385:aload           15
	//  195  387:invokevirtual   #252 <Method StringBuilder StringBuilder.append(Object)>
	//  196  390:pop             
		printstream.println(stringbuilder.toString());
	//  197  391:aload           16
	//  198  393:aload           17
	//  199  395:invokevirtual   #256 <Method String StringBuilder.toString()>
	//  200  398:invokevirtual   #262 <Method void PrintStream.println(String)>
		if(flag1)
	//* 201  401:iload           11
	//* 202  403:ifeq            420
		{
			updateChildrenFromSolver(mSystem, Optimizer.flags);
	//  203  406:aload_0         
	//  204  407:aload_0         
	//  205  408:getfield        #35  <Field LinearSystem mSystem>
	//  206  411:getstatic       #266 <Field boolean[] Optimizer.flags>
	//  207  414:invokevirtual   #270 <Method void updateChildrenFromSolver(LinearSystem, boolean[])>
		} else
	//* 208  417:goto            529
		{
			updateFromSolver(mSystem);
	//  209  420:aload_0         
	//  210  421:aload_0         
	//  211  422:getfield        #35  <Field LinearSystem mSystem>
	//  212  425:invokevirtual   #273 <Method void updateFromSolver(LinearSystem)>
			j = 0;
	//  213  428:iconst_0        
	//  214  429:istore_2        
			do
			{
				if(j >= l2)
					break;
	//  215  430:iload_2         
	//  216  431:iload           10
	//  217  433:icmpge          529
				ConstraintWidget constraintwidget1 = (ConstraintWidget)mChildren.get(j);
	//  218  436:aload_0         
	//  219  437:getfield        #88  <Field ArrayList mChildren>
	//  220  440:iload_2         
	//  221  441:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//  222  444:checkcast       #100 <Class ConstraintWidget>
	//  223  447:astore          15
				if(constraintwidget1.mListDimensionBehaviors[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintwidget1.getWidth() < constraintwidget1.getWrapWidth())
	//* 224  449:aload           15
	//* 225  451:getfield        #104 <Field ConstraintWidget$DimensionBehaviour[] ConstraintWidget.mListDimensionBehaviors>
	//* 226  454:iconst_0        
	//* 227  455:aaload          
	//* 228  456:getstatic       #276 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//* 229  459:if_acmpne       487
	//* 230  462:aload           15
	//* 231  464:invokevirtual   #277 <Method int ConstraintWidget.getWidth()>
	//* 232  467:aload           15
	//* 233  469:invokevirtual   #280 <Method int ConstraintWidget.getWrapWidth()>
	//* 234  472:icmpge          484
				{
					Optimizer.flags[2] = true;
	//  235  475:getstatic       #266 <Field boolean[] Optimizer.flags>
	//  236  478:iconst_2        
	//  237  479:iconst_1        
	//  238  480:bastore         
					break;
	//  239  481:goto            529
				}
	//* 240  484:goto            487
				if(constraintwidget1.mListDimensionBehaviors[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintwidget1.getHeight() < constraintwidget1.getWrapHeight())
	//* 241  487:aload           15
	//* 242  489:getfield        #104 <Field ConstraintWidget$DimensionBehaviour[] ConstraintWidget.mListDimensionBehaviors>
	//* 243  492:iconst_1        
	//* 244  493:aaload          
	//* 245  494:getstatic       #276 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//* 246  497:if_acmpne       522
	//* 247  500:aload           15
	//* 248  502:invokevirtual   #281 <Method int ConstraintWidget.getHeight()>
	//* 249  505:aload           15
	//* 250  507:invokevirtual   #284 <Method int ConstraintWidget.getWrapHeight()>
	//* 251  510:icmpge          522
				{
					Optimizer.flags[2] = true;
	//  252  513:getstatic       #266 <Field boolean[] Optimizer.flags>
	//  253  516:iconst_2        
	//  254  517:iconst_1        
	//  255  518:bastore         
					break;
	//  256  519:goto            529
				}
				j++;
	//  257  522:iload_2         
	//  258  523:iconst_1        
	//  259  524:iadd            
	//  260  525:istore_2        
			} while(true);
	//  261  526:goto            430
		}
		if(k1 < 8 && Optimizer.flags[2])
	//* 262  529:iload           5
	//* 263  531:bipush          8
	//* 264  533:icmpge          712
	//* 265  536:getstatic       #266 <Field boolean[] Optimizer.flags>
	//* 266  539:iconst_2        
	//* 267  540:baload          
	//* 268  541:ifeq            712
		{
			int l = 0;
	//  269  544:iconst_0        
	//  270  545:istore_3        
			int j1 = 0;
	//  271  546:iconst_0        
	//  272  547:istore          4
			j = 0;
	//  273  549:iconst_0        
	//  274  550:istore_2        
			for(; l < l2; l++)
	//* 275  551:iload_3         
	//* 276  552:iload           10
	//* 277  554:icmpge          611
			{
				ConstraintWidget constraintwidget2 = (ConstraintWidget)mChildren.get(l);
	//  278  557:aload_0         
	//  279  558:getfield        #88  <Field ArrayList mChildren>
	//  280  561:iload_3         
	//  281  562:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//  282  565:checkcast       #100 <Class ConstraintWidget>
	//  283  568:astore          15
				j1 = Math.max(j1, constraintwidget2.mX + constraintwidget2.getWidth());
	//  284  570:iload           4
	//  285  572:aload           15
	//  286  574:getfield        #285 <Field int ConstraintWidget.mX>
	//  287  577:aload           15
	//  288  579:invokevirtual   #277 <Method int ConstraintWidget.getWidth()>
	//  289  582:iadd            
	//  290  583:invokestatic    #164 <Method int Math.max(int, int)>
	//  291  586:istore          4
				j = Math.max(j, constraintwidget2.mY + constraintwidget2.getHeight());
	//  292  588:iload_2         
	//  293  589:aload           15
	//  294  591:getfield        #286 <Field int ConstraintWidget.mY>
	//  295  594:aload           15
	//  296  596:invokevirtual   #281 <Method int ConstraintWidget.getHeight()>
	//  297  599:iadd            
	//  298  600:invokestatic    #164 <Method int Math.max(int, int)>
	//  299  603:istore_2        
			}

	//  300  604:iload_3         
	//  301  605:iconst_1        
	//  302  606:iadd            
	//  303  607:istore_3        
	//* 304  608:goto            551
			l = Math.max(mMinWidth, j1);
	//  305  611:aload_0         
	//  306  612:getfield        #289 <Field int mMinWidth>
	//  307  615:iload           4
	//  308  617:invokestatic    #164 <Method int Math.max(int, int)>
	//  309  620:istore_3        
			j = Math.max(mMinHeight, j);
	//  310  621:aload_0         
	//  311  622:getfield        #292 <Field int mMinHeight>
	//  312  625:iload_2         
	//  313  626:invokestatic    #164 <Method int Math.max(int, int)>
	//  314  629:istore_2        
			if(dimensionbehaviour1 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && getWidth() < l)
	//* 315  630:aload           14
	//* 316  632:getstatic       #110 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//* 317  635:if_acmpne       668
	//* 318  638:aload_0         
	//* 319  639:invokevirtual   #158 <Method int getWidth()>
	//* 320  642:iload_3         
	//* 321  643:icmpge          668
			{
				setWidth(l);
	//  322  646:aload_0         
	//  323  647:iload_3         
	//  324  648:invokevirtual   #295 <Method void setWidth(int)>
				mListDimensionBehaviors[0] = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
	//  325  651:aload_0         
	//  326  652:getfield        #215 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//  327  655:iconst_0        
	//  328  656:getstatic       #110 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//  329  659:aastore         
				flag1 = true;
	//  330  660:iconst_1        
	//  331  661:istore          11
				flag = true;
	//  332  663:iconst_1        
	//  333  664:istore_1        
			} else
	//* 334  665:goto            671
			{
				flag1 = false;
	//  335  668:iconst_0        
	//  336  669:istore          11
			}
			if(dimensionbehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && getHeight() < j)
	//* 337  671:aload           13
	//* 338  673:getstatic       #110 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//* 339  676:if_acmpne       709
	//* 340  679:aload_0         
	//* 341  680:invokevirtual   #167 <Method int getHeight()>
	//* 342  683:iload_2         
	//* 343  684:icmpge          709
			{
				setHeight(j);
	//  344  687:aload_0         
	//  345  688:iload_2         
	//  346  689:invokevirtual   #298 <Method void setHeight(int)>
				mListDimensionBehaviors[1] = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
	//  347  692:aload_0         
	//  348  693:getfield        #215 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//  349  696:iconst_1        
	//  350  697:getstatic       #110 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//  351  700:aastore         
				flag1 = true;
	//  352  701:iconst_1        
	//  353  702:istore          11
				flag = true;
	//  354  704:iconst_1        
	//  355  705:istore_1        
			}
		} else
	//* 356  706:goto            715
	//* 357  709:goto            715
		{
			flag1 = false;
	//  358  712:iconst_0        
	//  359  713:istore          11
		}
		j = Math.max(mMinWidth, getWidth());
	//  360  715:aload_0         
	//  361  716:getfield        #289 <Field int mMinWidth>
	//  362  719:aload_0         
	//  363  720:invokevirtual   #158 <Method int getWidth()>
	//  364  723:invokestatic    #164 <Method int Math.max(int, int)>
	//  365  726:istore_2        
		if(j > getWidth())
	//* 366  727:iload_2         
	//* 367  728:aload_0         
	//* 368  729:invokevirtual   #158 <Method int getWidth()>
	//* 369  732:icmple          754
		{
			setWidth(j);
	//  370  735:aload_0         
	//  371  736:iload_2         
	//  372  737:invokevirtual   #295 <Method void setWidth(int)>
			mListDimensionBehaviors[0] = ConstraintWidget.DimensionBehaviour.FIXED;
	//  373  740:aload_0         
	//  374  741:getfield        #215 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//  375  744:iconst_0        
	//  376  745:getstatic       #113 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.FIXED>
	//  377  748:aastore         
			flag1 = true;
	//  378  749:iconst_1        
	//  379  750:istore          11
			flag = true;
	//  380  752:iconst_1        
	//  381  753:istore_1        
		}
		j = Math.max(mMinHeight, getHeight());
	//  382  754:aload_0         
	//  383  755:getfield        #292 <Field int mMinHeight>
	//  384  758:aload_0         
	//  385  759:invokevirtual   #167 <Method int getHeight()>
	//  386  762:invokestatic    #164 <Method int Math.max(int, int)>
	//  387  765:istore_2        
		if(j > getHeight())
	//* 388  766:iload_2         
	//* 389  767:aload_0         
	//* 390  768:invokevirtual   #167 <Method int getHeight()>
	//* 391  771:icmple          796
		{
			setHeight(j);
	//  392  774:aload_0         
	//  393  775:iload_2         
	//  394  776:invokevirtual   #298 <Method void setHeight(int)>
			mListDimensionBehaviors[1] = ConstraintWidget.DimensionBehaviour.FIXED;
	//  395  779:aload_0         
	//  396  780:getfield        #215 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//  397  783:iconst_1        
	//  398  784:getstatic       #113 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.FIXED>
	//  399  787:aastore         
			flag1 = true;
	//  400  788:iconst_1        
	//  401  789:istore          11
			flag = true;
	//  402  791:iconst_1        
	//  403  792:istore_1        
		}
	//* 404  793:goto            796
		if(!flag)
	//* 405  796:iload_1         
	//* 406  797:ifne            932
		{
			flag2 = flag1;
	//  407  800:iload           11
	//  408  802:istore          12
			j = ((int) (flag));
	//  409  804:iload_1         
	//  410  805:istore_2        
			if(mListDimensionBehaviors[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)
	//* 411  806:aload_0         
	//* 412  807:getfield        #215 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//* 413  810:iconst_0        
	//* 414  811:aaload          
	//* 415  812:getstatic       #110 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//* 416  815:if_acmpne       869
			{
				flag2 = flag1;
	//  417  818:iload           11
	//  418  820:istore          12
				j = ((int) (flag));
	//  419  822:iload_1         
	//  420  823:istore_2        
				if(j2 > 0)
	//* 421  824:iload           8
	//* 422  826:ifle            869
				{
					flag2 = flag1;
	//  423  829:iload           11
	//  424  831:istore          12
					j = ((int) (flag));
	//  425  833:iload_1         
	//  426  834:istore_2        
					if(getWidth() > j2)
	//* 427  835:aload_0         
	//* 428  836:invokevirtual   #158 <Method int getWidth()>
	//* 429  839:iload           8
	//* 430  841:icmple          869
					{
						mWidthMeasuredTooSmall = true;
	//  431  844:aload_0         
	//  432  845:iconst_1        
	//  433  846:putfield        #49  <Field boolean mWidthMeasuredTooSmall>
						mListDimensionBehaviors[0] = ConstraintWidget.DimensionBehaviour.FIXED;
	//  434  849:aload_0         
	//  435  850:getfield        #215 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//  436  853:iconst_0        
	//  437  854:getstatic       #113 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.FIXED>
	//  438  857:aastore         
						setWidth(j2);
	//  439  858:aload_0         
	//  440  859:iload           8
	//  441  861:invokevirtual   #295 <Method void setWidth(int)>
						flag2 = true;
	//  442  864:iconst_1        
	//  443  865:istore          12
						j = 1;
	//  444  867:iconst_1        
	//  445  868:istore_2        
					}
				}
			}
			if(mListDimensionBehaviors[1] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && k2 > 0 && getHeight() > k2)
	//* 446  869:aload_0         
	//* 447  870:getfield        #215 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//* 448  873:iconst_1        
	//* 449  874:aaload          
	//* 450  875:getstatic       #110 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//* 451  878:if_acmpne       923
	//* 452  881:iload           9
	//* 453  883:ifle            923
	//* 454  886:aload_0         
	//* 455  887:invokevirtual   #167 <Method int getHeight()>
	//* 456  890:iload           9
	//* 457  892:icmple          923
			{
				mHeightMeasuredTooSmall = true;
	//  458  895:aload_0         
	//  459  896:iconst_1        
	//  460  897:putfield        #51  <Field boolean mHeightMeasuredTooSmall>
				mListDimensionBehaviors[1] = ConstraintWidget.DimensionBehaviour.FIXED;
	//  461  900:aload_0         
	//  462  901:getfield        #215 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//  463  904:iconst_1        
	//  464  905:getstatic       #113 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.FIXED>
	//  465  908:aastore         
				setHeight(k2);
	//  466  909:aload_0         
	//  467  910:iload           9
	//  468  912:invokevirtual   #298 <Method void setHeight(int)>
				flag1 = true;
	//  469  915:iconst_1        
	//  470  916:istore          11
				flag = true;
	//  471  918:iconst_1        
	//  472  919:istore_1        
			} else
	//* 473  920:goto            932
			{
				flag1 = flag2;
	//  474  923:iload           12
	//  475  925:istore          11
				flag = ((boolean) (j));
	//  476  927:iload_2         
	//  477  928:istore_1        
			}
		}
	//* 478  929:goto            932
		j = k1;
	//  479  932:iload           5
	//  480  934:istore_2        
		flag2 = flag1;
	//  481  935:iload           11
	//  482  937:istore          12
		  goto _L5
	//* 483  939:goto            243
_L2:
		if(mParent != null)
	//* 484  942:aload_0         
	//* 485  943:getfield        #171 <Field ConstraintWidget mParent>
	//* 486  946:ifnull          1014
		{
			int k = Math.max(mMinWidth, getWidth());
	//  487  949:aload_0         
	//  488  950:getfield        #289 <Field int mMinWidth>
	//  489  953:aload_0         
	//  490  954:invokevirtual   #158 <Method int getWidth()>
	//  491  957:invokestatic    #164 <Method int Math.max(int, int)>
	//  492  960:istore_2        
			int i1 = Math.max(mMinHeight, getHeight());
	//  493  961:aload_0         
	//  494  962:getfield        #292 <Field int mMinHeight>
	//  495  965:aload_0         
	//  496  966:invokevirtual   #167 <Method int getHeight()>
	//  497  969:invokestatic    #164 <Method int Math.max(int, int)>
	//  498  972:istore_3        
			mSnapshot.applyTo(((ConstraintWidget) (this)));
	//  499  973:aload_0         
	//  500  974:getfield        #173 <Field Snapshot mSnapshot>
	//  501  977:aload_0         
	//  502  978:invokevirtual   #301 <Method void Snapshot.applyTo(ConstraintWidget)>
			setWidth(k + mPaddingLeft + mPaddingRight);
	//  503  981:aload_0         
	//  504  982:iload_2         
	//  505  983:aload_0         
	//  506  984:getfield        #182 <Field int mPaddingLeft>
	//  507  987:iadd            
	//  508  988:aload_0         
	//  509  989:getfield        #303 <Field int mPaddingRight>
	//  510  992:iadd            
	//  511  993:invokevirtual   #295 <Method void setWidth(int)>
			setHeight(i1 + mPaddingTop + mPaddingBottom);
	//  512  996:aload_0         
	//  513  997:iload_3         
	//  514  998:aload_0         
	//  515  999:getfield        #187 <Field int mPaddingTop>
	//  516 1002:iadd            
	//  517 1003:aload_0         
	//  518 1004:getfield        #305 <Field int mPaddingBottom>
	//  519 1007:iadd            
	//  520 1008:invokevirtual   #298 <Method void setHeight(int)>
		} else
	//* 521 1011:goto            1026
		{
			mX = l1;
	//  522 1014:aload_0         
	//  523 1015:iload           6
	//  524 1017:putfield        #152 <Field int mX>
			mY = i2;
	//  525 1020:aload_0         
	//  526 1021:iload           7
	//  527 1023:putfield        #155 <Field int mY>
		}
		if(flag)
	//* 528 1026:iload_1         
	//* 529 1027:ifeq            1046
		{
			mListDimensionBehaviors[0] = dimensionbehaviour1;
	//  530 1030:aload_0         
	//  531 1031:getfield        #215 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//  532 1034:iconst_0        
	//  533 1035:aload           14
	//  534 1037:aastore         
			mListDimensionBehaviors[1] = dimensionbehaviour;
	//  535 1038:aload_0         
	//  536 1039:getfield        #215 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//  537 1042:iconst_1        
	//  538 1043:aload           13
	//  539 1045:aastore         
		}
		resetSolverVariables(mSystem.getCache());
	//  540 1046:aload_0         
	//  541 1047:aload_0         
	//  542 1048:getfield        #35  <Field LinearSystem mSystem>
	//  543 1051:invokevirtual   #197 <Method android.support.constraint.solver.Cache LinearSystem.getCache()>
	//  544 1054:invokevirtual   #201 <Method void resetSolverVariables(android.support.constraint.solver.Cache)>
		if(this == getRootConstraintContainer())
	//* 545 1057:aload_0         
	//* 546 1058:aload_0         
	//* 547 1059:invokevirtual   #309 <Method ConstraintWidgetContainer getRootConstraintContainer()>
	//* 548 1062:if_acmpne       1069
			updateDrawPosition();
	//  549 1065:aload_0         
	//  550 1066:invokevirtual   #312 <Method void updateDrawPosition()>
		return;
	//  551 1069:return          
	}

	public void optimize()
	{
		if(!optimizeFor(8))
	//*   0    0:aload_0         
	//*   1    1:bipush          8
	//*   2    3:invokevirtual   #205 <Method boolean optimizeFor(int)>
	//*   3    6:ifne            17
			analyze(mOptimizationLevel);
	//    4    9:aload_0         
	//    5   10:aload_0         
	//    6   11:getfield        #47  <Field int mOptimizationLevel>
	//    7   14:invokevirtual   #313 <Method void analyze(int)>
		solveGraph();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #316 <Method void solveGraph()>
	//   10   21:return          
	}

	public boolean optimizeFor(int i)
	{
		return (mOptimizationLevel & i) == i;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int mOptimizationLevel>
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
	//*   1    1:getfield        #215 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//*   2    4:iconst_0        
	//*   3    5:aaload          
	//*   4    6:getstatic       #110 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//*   5    9:if_acmpeq       27
	//*   6   12:aload_0         
	//*   7   13:getfield        #322 <Field ResolutionDimension mResolutionWidth>
	//*   8   16:ifnull          27
			mResolutionWidth.resolve(i);
	//    9   19:aload_0         
	//   10   20:getfield        #322 <Field ResolutionDimension mResolutionWidth>
	//   11   23:iload_1         
	//   12   24:invokevirtual   #327 <Method void ResolutionDimension.resolve(int)>
		if(mListDimensionBehaviors[1] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && mResolutionHeight != null)
	//*  13   27:aload_0         
	//*  14   28:getfield        #215 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//*  15   31:iconst_1        
	//*  16   32:aaload          
	//*  17   33:getstatic       #110 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//*  18   36:if_acmpeq       54
	//*  19   39:aload_0         
	//*  20   40:getfield        #330 <Field ResolutionDimension mResolutionHeight>
	//*  21   43:ifnull          54
			mResolutionHeight.resolve(j);
	//   22   46:aload_0         
	//   23   47:getfield        #330 <Field ResolutionDimension mResolutionHeight>
	//   24   50:iload_2         
	//   25   51:invokevirtual   #327 <Method void ResolutionDimension.resolve(int)>
	//   26   54:return          
	}

	public void optimizeReset()
	{
		int j = mChildren.size();
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field ArrayList mChildren>
	//    2    4:invokevirtual   #94  <Method int ArrayList.size()>
	//    3    7:istore_2        
		resetResolutionNodes();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #333 <Method void resetResolutionNodes()>
		for(int i = 0; i < j; i++)
	//*   6   12:iconst_0        
	//*   7   13:istore_1        
	//*   8   14:iload_1         
	//*   9   15:iload_2         
	//*  10   16:icmpge          40
			((ConstraintWidget)mChildren.get(i)).resetResolutionNodes();
	//   11   19:aload_0         
	//   12   20:getfield        #88  <Field ArrayList mChildren>
	//   13   23:iload_1         
	//   14   24:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//   15   27:checkcast       #100 <Class ConstraintWidget>
	//   16   30:invokevirtual   #334 <Method void ConstraintWidget.resetResolutionNodes()>

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
	//    1    1:invokevirtual   #208 <Method void optimizeReset()>
		analyze(mOptimizationLevel);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #47  <Field int mOptimizationLevel>
	//    5    9:invokevirtual   #313 <Method void analyze(int)>
	//    6   12:return          
	}

	public void reset()
	{
		mSystem.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field LinearSystem mSystem>
	//    2    4:invokevirtual   #222 <Method void LinearSystem.reset()>
		mPaddingLeft = 0;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #182 <Field int mPaddingLeft>
		mPaddingRight = 0;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #303 <Field int mPaddingRight>
		mPaddingTop = 0;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:putfield        #187 <Field int mPaddingTop>
		mPaddingBottom = 0;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #305 <Field int mPaddingBottom>
		super.reset();
	//   15   27:aload_0         
	//   16   28:invokespecial   #336 <Method void WidgetContainer.reset()>
	//   17   31:return          
	}

	public void setOptimizationLevel(int i)
	{
		mOptimizationLevel = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #47  <Field int mOptimizationLevel>
	//    3    5:return          
	}

	public void setRtl(boolean flag)
	{
		mIsRtl = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #30  <Field boolean mIsRtl>
	//    3    5:return          
	}

	public void solveGraph()
	{
		ResolutionAnchor resolutionanchor = getAnchor(ConstraintAnchor.Type.LEFT).getResolutionNode();
	//    0    0:aload_0         
	//    1    1:getstatic       #345 <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//    2    4:invokevirtual   #349 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//    3    7:invokevirtual   #355 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//    4   10:astore_1        
		ResolutionAnchor resolutionanchor1 = getAnchor(ConstraintAnchor.Type.TOP).getResolutionNode();
	//    5   11:aload_0         
	//    6   12:getstatic       #358 <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//    7   15:invokevirtual   #349 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//    8   18:invokevirtual   #355 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//    9   21:astore_2        
		resolutionanchor.resolve(((ResolutionAnchor) (null)), 0.0F);
	//   10   22:aload_1         
	//   11   23:aconst_null     
	//   12   24:fconst_0        
	//   13   25:invokevirtual   #363 <Method void ResolutionAnchor.resolve(ResolutionAnchor, float)>
		resolutionanchor1.resolve(((ResolutionAnchor) (null)), 0.0F);
	//   14   28:aload_2         
	//   15   29:aconst_null     
	//   16   30:fconst_0        
	//   17   31:invokevirtual   #363 <Method void ResolutionAnchor.resolve(ResolutionAnchor, float)>
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
	//    6    6:invokevirtual   #273 <Method void updateFromSolver(LinearSystem)>
		int j = mChildren.size();
	//    7    9:aload_0         
	//    8   10:getfield        #88  <Field ArrayList mChildren>
	//    9   13:invokevirtual   #94  <Method int ArrayList.size()>
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
	//   17   27:getfield        #88  <Field ArrayList mChildren>
	//   18   30:iload_3         
	//   19   31:invokevirtual   #98  <Method Object ArrayList.get(int)>
	//   20   34:checkcast       #100 <Class ConstraintWidget>
	//   21   37:astore          5
			constraintwidget.updateFromSolver(linearsystem);
	//   22   39:aload           5
	//   23   41:aload_1         
	//   24   42:invokevirtual   #364 <Method void ConstraintWidget.updateFromSolver(LinearSystem)>
			if(constraintwidget.mListDimensionBehaviors[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintwidget.getWidth() < constraintwidget.getWrapWidth())
	//*  25   45:aload           5
	//*  26   47:getfield        #104 <Field ConstraintWidget$DimensionBehaviour[] ConstraintWidget.mListDimensionBehaviors>
	//*  27   50:iconst_0        
	//*  28   51:aaload          
	//*  29   52:getstatic       #276 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//*  30   55:if_acmpne       75
	//*  31   58:aload           5
	//*  32   60:invokevirtual   #277 <Method int ConstraintWidget.getWidth()>
	//*  33   63:aload           5
	//*  34   65:invokevirtual   #280 <Method int ConstraintWidget.getWrapWidth()>
	//*  35   68:icmpge          75
				aflag[2] = true;
	//   36   71:aload_2         
	//   37   72:iconst_2        
	//   38   73:iconst_1        
	//   39   74:bastore         
			if(constraintwidget.mListDimensionBehaviors[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintwidget.getHeight() < constraintwidget.getWrapHeight())
	//*  40   75:aload           5
	//*  41   77:getfield        #104 <Field ConstraintWidget$DimensionBehaviour[] ConstraintWidget.mListDimensionBehaviors>
	//*  42   80:iconst_1        
	//*  43   81:aaload          
	//*  44   82:getstatic       #276 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//*  45   85:if_acmpne       105
	//*  46   88:aload           5
	//*  47   90:invokevirtual   #281 <Method int ConstraintWidget.getHeight()>
	//*  48   93:aload           5
	//*  49   95:invokevirtual   #284 <Method int ConstraintWidget.getWrapHeight()>
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
