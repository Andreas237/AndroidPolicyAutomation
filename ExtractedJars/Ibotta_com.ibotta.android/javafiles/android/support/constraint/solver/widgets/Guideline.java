// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver.widgets;

import android.support.constraint.solver.LinearSystem;
import java.util.ArrayList;

// Referenced classes of package android.support.constraint.solver.widgets:
//			ConstraintWidget, Rectangle, ConstraintWidgetContainer, ConstraintAnchor, 
//			ResolutionAnchor

public class Guideline extends ConstraintWidget
{

	public Guideline()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void ConstraintWidget()>
		mRelativePercent = -1F;
	//    2    4:aload_0         
	//    3    5:ldc1            #25  <Float -1F>
	//    4    7:putfield        #27  <Field float mRelativePercent>
		mRelativeBegin = -1;
	//    5   10:aload_0         
	//    6   11:iconst_m1       
	//    7   12:putfield        #29  <Field int mRelativeBegin>
		mRelativeEnd = -1;
	//    8   15:aload_0         
	//    9   16:iconst_m1       
	//   10   17:putfield        #31  <Field int mRelativeEnd>
		mAnchor = mTop;
	//   11   20:aload_0         
	//   12   21:aload_0         
	//   13   22:getfield        #34  <Field ConstraintAnchor mTop>
	//   14   25:putfield        #36  <Field ConstraintAnchor mAnchor>
		int i = 0;
	//   15   28:iconst_0        
	//   16   29:istore_1        
		mOrientation = 0;
	//   17   30:aload_0         
	//   18   31:iconst_0        
	//   19   32:putfield        #38  <Field int mOrientation>
		mIsPositionRelaxed = false;
	//   20   35:aload_0         
	//   21   36:iconst_0        
	//   22   37:putfield        #40  <Field boolean mIsPositionRelaxed>
		mMinimumPosition = 0;
	//   23   40:aload_0         
	//   24   41:iconst_0        
	//   25   42:putfield        #42  <Field int mMinimumPosition>
		mHead = new Rectangle();
	//   26   45:aload_0         
	//   27   46:new             #44  <Class Rectangle>
	//   28   49:dup             
	//   29   50:invokespecial   #45  <Method void Rectangle()>
	//   30   53:putfield        #47  <Field Rectangle mHead>
		mHeadSize = 8;
	//   31   56:aload_0         
	//   32   57:bipush          8
	//   33   59:putfield        #49  <Field int mHeadSize>
		mAnchors.clear();
	//   34   62:aload_0         
	//   35   63:getfield        #53  <Field ArrayList mAnchors>
	//   36   66:invokevirtual   #58  <Method void ArrayList.clear()>
		mAnchors.add(((Object) (mAnchor)));
	//   37   69:aload_0         
	//   38   70:getfield        #53  <Field ArrayList mAnchors>
	//   39   73:aload_0         
	//   40   74:getfield        #36  <Field ConstraintAnchor mAnchor>
	//   41   77:invokevirtual   #62  <Method boolean ArrayList.add(Object)>
	//   42   80:pop             
		for(int j = mListAnchors.length; i < j; i++)
	//*  43   81:aload_0         
	//*  44   82:getfield        #66  <Field ConstraintAnchor[] mListAnchors>
	//*  45   85:arraylength     
	//*  46   86:istore_2        
	//*  47   87:iload_1         
	//*  48   88:iload_2         
	//*  49   89:icmpge          109
			mListAnchors[i] = mAnchor;
	//   50   92:aload_0         
	//   51   93:getfield        #66  <Field ConstraintAnchor[] mListAnchors>
	//   52   96:iload_1         
	//   53   97:aload_0         
	//   54   98:getfield        #36  <Field ConstraintAnchor mAnchor>
	//   55  101:aastore         

	//   56  102:iload_1         
	//   57  103:iconst_1        
	//   58  104:iadd            
	//   59  105:istore_1        
	//*  60  106:goto            87
	//   61  109:return          
	}

	public void addToSolver(LinearSystem linearsystem)
	{
		ConstraintWidgetContainer constraintwidgetcontainer = (ConstraintWidgetContainer)getParent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #73  <Method ConstraintWidget getParent()>
	//    2    4:checkcast       #75  <Class ConstraintWidgetContainer>
	//    3    7:astore          5
		if(constraintwidgetcontainer == null)
	//*   4    9:aload           5
	//*   5   11:ifnonnull       15
			return;
	//    6   14:return          
		ConstraintAnchor constraintanchor = constraintwidgetcontainer.getAnchor(ConstraintAnchor.Type.LEFT);
	//    7   15:aload           5
	//    8   17:getstatic       #81  <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//    9   20:invokevirtual   #85  <Method ConstraintAnchor ConstraintWidgetContainer.getAnchor(ConstraintAnchor$Type)>
	//   10   23:astore_3        
		Object obj = ((Object) (constraintwidgetcontainer.getAnchor(ConstraintAnchor.Type.RIGHT)));
	//   11   24:aload           5
	//   12   26:getstatic       #88  <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//   13   29:invokevirtual   #85  <Method ConstraintAnchor ConstraintWidgetContainer.getAnchor(ConstraintAnchor$Type)>
	//   14   32:astore          4
		boolean flag;
		if(mParent != null && mParent.mListDimensionBehaviors[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)
	//*  15   34:aload_0         
	//*  16   35:getfield        #92  <Field ConstraintWidget mParent>
	//*  17   38:ifnull          61
	//*  18   41:aload_0         
	//*  19   42:getfield        #92  <Field ConstraintWidget mParent>
	//*  20   45:getfield        #96  <Field ConstraintWidget$DimensionBehaviour[] ConstraintWidget.mListDimensionBehaviors>
	//*  21   48:iconst_0        
	//*  22   49:aaload          
	//*  23   50:getstatic       #102 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//*  24   53:if_acmpne       61
			flag = true;
	//   25   56:iconst_1        
	//   26   57:istore_2        
		else
	//*  27   58:goto            63
			flag = false;
	//   28   61:iconst_0        
	//   29   62:istore_2        
		if(mOrientation == 0)
	//*  30   63:aload_0         
	//*  31   64:getfield        #38  <Field int mOrientation>
	//*  32   67:ifne            118
		{
			constraintanchor = constraintwidgetcontainer.getAnchor(ConstraintAnchor.Type.TOP);
	//   33   70:aload           5
	//   34   72:getstatic       #105 <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//   35   75:invokevirtual   #85  <Method ConstraintAnchor ConstraintWidgetContainer.getAnchor(ConstraintAnchor$Type)>
	//   36   78:astore_3        
			obj = ((Object) (constraintwidgetcontainer.getAnchor(ConstraintAnchor.Type.BOTTOM)));
	//   37   79:aload           5
	//   38   81:getstatic       #108 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
	//   39   84:invokevirtual   #85  <Method ConstraintAnchor ConstraintWidgetContainer.getAnchor(ConstraintAnchor$Type)>
	//   40   87:astore          4
			if(mParent != null && mParent.mListDimensionBehaviors[1] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)
	//*  41   89:aload_0         
	//*  42   90:getfield        #92  <Field ConstraintWidget mParent>
	//*  43   93:ifnull          116
	//*  44   96:aload_0         
	//*  45   97:getfield        #92  <Field ConstraintWidget mParent>
	//*  46  100:getfield        #96  <Field ConstraintWidget$DimensionBehaviour[] ConstraintWidget.mListDimensionBehaviors>
	//*  47  103:iconst_1        
	//*  48  104:aaload          
	//*  49  105:getstatic       #102 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//*  50  108:if_acmpne       116
				flag = true;
	//   51  111:iconst_1        
	//   52  112:istore_2        
			else
	//*  53  113:goto            118
				flag = false;
	//   54  116:iconst_0        
	//   55  117:istore_2        
		}
		if(mRelativeBegin != -1)
	//*  56  118:aload_0         
	//*  57  119:getfield        #29  <Field int mRelativeBegin>
	//*  58  122:iconst_m1       
	//*  59  123:icmpeq          173
		{
			android.support.constraint.solver.SolverVariable solvervariable = linearsystem.createObjectVariable(((Object) (mAnchor)));
	//   60  126:aload_1         
	//   61  127:aload_0         
	//   62  128:getfield        #36  <Field ConstraintAnchor mAnchor>
	//   63  131:invokevirtual   #114 <Method android.support.constraint.solver.SolverVariable LinearSystem.createObjectVariable(Object)>
	//   64  134:astore          5
			linearsystem.addEquality(solvervariable, linearsystem.createObjectVariable(((Object) (constraintanchor))), mRelativeBegin, 6);
	//   65  136:aload_1         
	//   66  137:aload           5
	//   67  139:aload_1         
	//   68  140:aload_3         
	//   69  141:invokevirtual   #114 <Method android.support.constraint.solver.SolverVariable LinearSystem.createObjectVariable(Object)>
	//   70  144:aload_0         
	//   71  145:getfield        #29  <Field int mRelativeBegin>
	//   72  148:bipush          6
	//   73  150:invokevirtual   #118 <Method android.support.constraint.solver.ArrayRow LinearSystem.addEquality(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
	//   74  153:pop             
			if(flag)
	//*  75  154:iload_2         
	//*  76  155:ifeq            288
			{
				linearsystem.addGreaterThan(linearsystem.createObjectVariable(obj), solvervariable, 0, 5);
	//   77  158:aload_1         
	//   78  159:aload_1         
	//   79  160:aload           4
	//   80  162:invokevirtual   #114 <Method android.support.constraint.solver.SolverVariable LinearSystem.createObjectVariable(Object)>
	//   81  165:aload           5
	//   82  167:iconst_0        
	//   83  168:iconst_5        
	//   84  169:invokevirtual   #122 <Method void LinearSystem.addGreaterThan(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
				return;
	//   85  172:return          
			}
		} else
		if(mRelativeEnd != -1)
	//*  86  173:aload_0         
	//*  87  174:getfield        #31  <Field int mRelativeEnd>
	//*  88  177:iconst_m1       
	//*  89  178:icmpeq          243
		{
			android.support.constraint.solver.SolverVariable solvervariable1 = linearsystem.createObjectVariable(((Object) (mAnchor)));
	//   90  181:aload_1         
	//   91  182:aload_0         
	//   92  183:getfield        #36  <Field ConstraintAnchor mAnchor>
	//   93  186:invokevirtual   #114 <Method android.support.constraint.solver.SolverVariable LinearSystem.createObjectVariable(Object)>
	//   94  189:astore          5
			obj = ((Object) (linearsystem.createObjectVariable(obj)));
	//   95  191:aload_1         
	//   96  192:aload           4
	//   97  194:invokevirtual   #114 <Method android.support.constraint.solver.SolverVariable LinearSystem.createObjectVariable(Object)>
	//   98  197:astore          4
			linearsystem.addEquality(solvervariable1, ((android.support.constraint.solver.SolverVariable) (obj)), -mRelativeEnd, 6);
	//   99  199:aload_1         
	//  100  200:aload           5
	//  101  202:aload           4
	//  102  204:aload_0         
	//  103  205:getfield        #31  <Field int mRelativeEnd>
	//  104  208:ineg            
	//  105  209:bipush          6
	//  106  211:invokevirtual   #118 <Method android.support.constraint.solver.ArrayRow LinearSystem.addEquality(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
	//  107  214:pop             
			if(flag)
	//* 108  215:iload_2         
	//* 109  216:ifeq            288
			{
				linearsystem.addGreaterThan(solvervariable1, linearsystem.createObjectVariable(((Object) (constraintanchor))), 0, 5);
	//  110  219:aload_1         
	//  111  220:aload           5
	//  112  222:aload_1         
	//  113  223:aload_3         
	//  114  224:invokevirtual   #114 <Method android.support.constraint.solver.SolverVariable LinearSystem.createObjectVariable(Object)>
	//  115  227:iconst_0        
	//  116  228:iconst_5        
	//  117  229:invokevirtual   #122 <Method void LinearSystem.addGreaterThan(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
				linearsystem.addGreaterThan(((android.support.constraint.solver.SolverVariable) (obj)), solvervariable1, 0, 5);
	//  118  232:aload_1         
	//  119  233:aload           4
	//  120  235:aload           5
	//  121  237:iconst_0        
	//  122  238:iconst_5        
	//  123  239:invokevirtual   #122 <Method void LinearSystem.addGreaterThan(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
				return;
	//  124  242:return          
			}
		} else
		if(mRelativePercent != -1F)
	//* 125  243:aload_0         
	//* 126  244:getfield        #27  <Field float mRelativePercent>
	//* 127  247:ldc1            #25  <Float -1F>
	//* 128  249:fcmpl           
	//* 129  250:ifeq            288
			linearsystem.addConstraint(LinearSystem.createRowDimensionPercent(linearsystem, linearsystem.createObjectVariable(((Object) (mAnchor))), linearsystem.createObjectVariable(((Object) (constraintanchor))), linearsystem.createObjectVariable(obj), mRelativePercent, mIsPositionRelaxed));
	//  130  253:aload_1         
	//  131  254:aload_1         
	//  132  255:aload_1         
	//  133  256:aload_0         
	//  134  257:getfield        #36  <Field ConstraintAnchor mAnchor>
	//  135  260:invokevirtual   #114 <Method android.support.constraint.solver.SolverVariable LinearSystem.createObjectVariable(Object)>
	//  136  263:aload_1         
	//  137  264:aload_3         
	//  138  265:invokevirtual   #114 <Method android.support.constraint.solver.SolverVariable LinearSystem.createObjectVariable(Object)>
	//  139  268:aload_1         
	//  140  269:aload           4
	//  141  271:invokevirtual   #114 <Method android.support.constraint.solver.SolverVariable LinearSystem.createObjectVariable(Object)>
	//  142  274:aload_0         
	//  143  275:getfield        #27  <Field float mRelativePercent>
	//  144  278:aload_0         
	//  145  279:getfield        #40  <Field boolean mIsPositionRelaxed>
	//  146  282:invokestatic    #126 <Method android.support.constraint.solver.ArrayRow LinearSystem.createRowDimensionPercent(LinearSystem, android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, float, boolean)>
	//  147  285:invokevirtual   #130 <Method void LinearSystem.addConstraint(android.support.constraint.solver.ArrayRow)>
	//  148  288:return          
	}

	public boolean allowedInBarrier()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void analyze(int i)
	{
		ConstraintWidget constraintwidget = getParent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #73  <Method ConstraintWidget getParent()>
	//    2    4:astore_2        
		if(constraintwidget == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		if(getOrientation() == 1)
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #138 <Method int getOrientation()>
	//*   8   14:iconst_1        
	//*   9   15:icmpne          235
		{
			mTop.getResolutionNode().dependsOn(1, constraintwidget.mTop.getResolutionNode(), 0);
	//   10   18:aload_0         
	//   11   19:getfield        #34  <Field ConstraintAnchor mTop>
	//   12   22:invokevirtual   #144 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   13   25:iconst_1        
	//   14   26:aload_2         
	//   15   27:getfield        #145 <Field ConstraintAnchor ConstraintWidget.mTop>
	//   16   30:invokevirtual   #144 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   17   33:iconst_0        
	//   18   34:invokevirtual   #151 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
			mBottom.getResolutionNode().dependsOn(1, constraintwidget.mTop.getResolutionNode(), 0);
	//   19   37:aload_0         
	//   20   38:getfield        #154 <Field ConstraintAnchor mBottom>
	//   21   41:invokevirtual   #144 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   22   44:iconst_1        
	//   23   45:aload_2         
	//   24   46:getfield        #145 <Field ConstraintAnchor ConstraintWidget.mTop>
	//   25   49:invokevirtual   #144 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   26   52:iconst_0        
	//   27   53:invokevirtual   #151 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
			if(mRelativeBegin != -1)
	//*  28   56:aload_0         
	//*  29   57:getfield        #29  <Field int mRelativeBegin>
	//*  30   60:iconst_m1       
	//*  31   61:icmpeq          109
			{
				mLeft.getResolutionNode().dependsOn(1, constraintwidget.mLeft.getResolutionNode(), mRelativeBegin);
	//   32   64:aload_0         
	//   33   65:getfield        #157 <Field ConstraintAnchor mLeft>
	//   34   68:invokevirtual   #144 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   35   71:iconst_1        
	//   36   72:aload_2         
	//   37   73:getfield        #158 <Field ConstraintAnchor ConstraintWidget.mLeft>
	//   38   76:invokevirtual   #144 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   39   79:aload_0         
	//   40   80:getfield        #29  <Field int mRelativeBegin>
	//   41   83:invokevirtual   #151 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
				mRight.getResolutionNode().dependsOn(1, constraintwidget.mLeft.getResolutionNode(), mRelativeBegin);
	//   42   86:aload_0         
	//   43   87:getfield        #161 <Field ConstraintAnchor mRight>
	//   44   90:invokevirtual   #144 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   45   93:iconst_1        
	//   46   94:aload_2         
	//   47   95:getfield        #158 <Field ConstraintAnchor ConstraintWidget.mLeft>
	//   48   98:invokevirtual   #144 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   49  101:aload_0         
	//   50  102:getfield        #29  <Field int mRelativeBegin>
	//   51  105:invokevirtual   #151 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
				return;
	//   52  108:return          
			}
			if(mRelativeEnd != -1)
	//*  53  109:aload_0         
	//*  54  110:getfield        #31  <Field int mRelativeEnd>
	//*  55  113:iconst_m1       
	//*  56  114:icmpeq          164
			{
				mLeft.getResolutionNode().dependsOn(1, constraintwidget.mRight.getResolutionNode(), -mRelativeEnd);
	//   57  117:aload_0         
	//   58  118:getfield        #157 <Field ConstraintAnchor mLeft>
	//   59  121:invokevirtual   #144 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   60  124:iconst_1        
	//   61  125:aload_2         
	//   62  126:getfield        #162 <Field ConstraintAnchor ConstraintWidget.mRight>
	//   63  129:invokevirtual   #144 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   64  132:aload_0         
	//   65  133:getfield        #31  <Field int mRelativeEnd>
	//   66  136:ineg            
	//   67  137:invokevirtual   #151 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
				mRight.getResolutionNode().dependsOn(1, constraintwidget.mRight.getResolutionNode(), -mRelativeEnd);
	//   68  140:aload_0         
	//   69  141:getfield        #161 <Field ConstraintAnchor mRight>
	//   70  144:invokevirtual   #144 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   71  147:iconst_1        
	//   72  148:aload_2         
	//   73  149:getfield        #162 <Field ConstraintAnchor ConstraintWidget.mRight>
	//   74  152:invokevirtual   #144 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   75  155:aload_0         
	//   76  156:getfield        #31  <Field int mRelativeEnd>
	//   77  159:ineg            
	//   78  160:invokevirtual   #151 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
				return;
	//   79  163:return          
			}
			if(mRelativePercent != -1F && constraintwidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED)
	//*  80  164:aload_0         
	//*  81  165:getfield        #27  <Field float mRelativePercent>
	//*  82  168:ldc1            #25  <Float -1F>
	//*  83  170:fcmpl           
	//*  84  171:ifeq            451
	//*  85  174:aload_2         
	//*  86  175:invokevirtual   #166 <Method ConstraintWidget$DimensionBehaviour ConstraintWidget.getHorizontalDimensionBehaviour()>
	//*  87  178:getstatic       #169 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.FIXED>
	//*  88  181:if_acmpne       451
			{
				i = (int)((float)constraintwidget.mWidth * mRelativePercent);
	//   89  184:aload_2         
	//   90  185:getfield        #172 <Field int ConstraintWidget.mWidth>
	//   91  188:i2f             
	//   92  189:aload_0         
	//   93  190:getfield        #27  <Field float mRelativePercent>
	//   94  193:fmul            
	//   95  194:f2i             
	//   96  195:istore_1        
				mLeft.getResolutionNode().dependsOn(1, constraintwidget.mLeft.getResolutionNode(), i);
	//   97  196:aload_0         
	//   98  197:getfield        #157 <Field ConstraintAnchor mLeft>
	//   99  200:invokevirtual   #144 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  100  203:iconst_1        
	//  101  204:aload_2         
	//  102  205:getfield        #158 <Field ConstraintAnchor ConstraintWidget.mLeft>
	//  103  208:invokevirtual   #144 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  104  211:iload_1         
	//  105  212:invokevirtual   #151 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
				mRight.getResolutionNode().dependsOn(1, constraintwidget.mLeft.getResolutionNode(), i);
	//  106  215:aload_0         
	//  107  216:getfield        #161 <Field ConstraintAnchor mRight>
	//  108  219:invokevirtual   #144 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  109  222:iconst_1        
	//  110  223:aload_2         
	//  111  224:getfield        #158 <Field ConstraintAnchor ConstraintWidget.mLeft>
	//  112  227:invokevirtual   #144 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  113  230:iload_1         
	//  114  231:invokevirtual   #151 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
				return;
	//  115  234:return          
			}
		} else
		{
			mLeft.getResolutionNode().dependsOn(1, constraintwidget.mLeft.getResolutionNode(), 0);
	//  116  235:aload_0         
	//  117  236:getfield        #157 <Field ConstraintAnchor mLeft>
	//  118  239:invokevirtual   #144 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  119  242:iconst_1        
	//  120  243:aload_2         
	//  121  244:getfield        #158 <Field ConstraintAnchor ConstraintWidget.mLeft>
	//  122  247:invokevirtual   #144 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  123  250:iconst_0        
	//  124  251:invokevirtual   #151 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
			mRight.getResolutionNode().dependsOn(1, constraintwidget.mLeft.getResolutionNode(), 0);
	//  125  254:aload_0         
	//  126  255:getfield        #161 <Field ConstraintAnchor mRight>
	//  127  258:invokevirtual   #144 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  128  261:iconst_1        
	//  129  262:aload_2         
	//  130  263:getfield        #158 <Field ConstraintAnchor ConstraintWidget.mLeft>
	//  131  266:invokevirtual   #144 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  132  269:iconst_0        
	//  133  270:invokevirtual   #151 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
			if(mRelativeBegin != -1)
	//* 134  273:aload_0         
	//* 135  274:getfield        #29  <Field int mRelativeBegin>
	//* 136  277:iconst_m1       
	//* 137  278:icmpeq          326
			{
				mTop.getResolutionNode().dependsOn(1, constraintwidget.mTop.getResolutionNode(), mRelativeBegin);
	//  138  281:aload_0         
	//  139  282:getfield        #34  <Field ConstraintAnchor mTop>
	//  140  285:invokevirtual   #144 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  141  288:iconst_1        
	//  142  289:aload_2         
	//  143  290:getfield        #145 <Field ConstraintAnchor ConstraintWidget.mTop>
	//  144  293:invokevirtual   #144 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  145  296:aload_0         
	//  146  297:getfield        #29  <Field int mRelativeBegin>
	//  147  300:invokevirtual   #151 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
				mBottom.getResolutionNode().dependsOn(1, constraintwidget.mTop.getResolutionNode(), mRelativeBegin);
	//  148  303:aload_0         
	//  149  304:getfield        #154 <Field ConstraintAnchor mBottom>
	//  150  307:invokevirtual   #144 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  151  310:iconst_1        
	//  152  311:aload_2         
	//  153  312:getfield        #145 <Field ConstraintAnchor ConstraintWidget.mTop>
	//  154  315:invokevirtual   #144 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  155  318:aload_0         
	//  156  319:getfield        #29  <Field int mRelativeBegin>
	//  157  322:invokevirtual   #151 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
				return;
	//  158  325:return          
			}
			if(mRelativeEnd != -1)
	//* 159  326:aload_0         
	//* 160  327:getfield        #31  <Field int mRelativeEnd>
	//* 161  330:iconst_m1       
	//* 162  331:icmpeq          381
			{
				mTop.getResolutionNode().dependsOn(1, constraintwidget.mBottom.getResolutionNode(), -mRelativeEnd);
	//  163  334:aload_0         
	//  164  335:getfield        #34  <Field ConstraintAnchor mTop>
	//  165  338:invokevirtual   #144 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  166  341:iconst_1        
	//  167  342:aload_2         
	//  168  343:getfield        #173 <Field ConstraintAnchor ConstraintWidget.mBottom>
	//  169  346:invokevirtual   #144 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  170  349:aload_0         
	//  171  350:getfield        #31  <Field int mRelativeEnd>
	//  172  353:ineg            
	//  173  354:invokevirtual   #151 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
				mBottom.getResolutionNode().dependsOn(1, constraintwidget.mBottom.getResolutionNode(), -mRelativeEnd);
	//  174  357:aload_0         
	//  175  358:getfield        #154 <Field ConstraintAnchor mBottom>
	//  176  361:invokevirtual   #144 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  177  364:iconst_1        
	//  178  365:aload_2         
	//  179  366:getfield        #173 <Field ConstraintAnchor ConstraintWidget.mBottom>
	//  180  369:invokevirtual   #144 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  181  372:aload_0         
	//  182  373:getfield        #31  <Field int mRelativeEnd>
	//  183  376:ineg            
	//  184  377:invokevirtual   #151 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
				return;
	//  185  380:return          
			}
			if(mRelativePercent != -1F && constraintwidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED)
	//* 186  381:aload_0         
	//* 187  382:getfield        #27  <Field float mRelativePercent>
	//* 188  385:ldc1            #25  <Float -1F>
	//* 189  387:fcmpl           
	//* 190  388:ifeq            451
	//* 191  391:aload_2         
	//* 192  392:invokevirtual   #176 <Method ConstraintWidget$DimensionBehaviour ConstraintWidget.getVerticalDimensionBehaviour()>
	//* 193  395:getstatic       #169 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.FIXED>
	//* 194  398:if_acmpne       451
			{
				i = (int)((float)constraintwidget.mHeight * mRelativePercent);
	//  195  401:aload_2         
	//  196  402:getfield        #179 <Field int ConstraintWidget.mHeight>
	//  197  405:i2f             
	//  198  406:aload_0         
	//  199  407:getfield        #27  <Field float mRelativePercent>
	//  200  410:fmul            
	//  201  411:f2i             
	//  202  412:istore_1        
				mTop.getResolutionNode().dependsOn(1, constraintwidget.mTop.getResolutionNode(), i);
	//  203  413:aload_0         
	//  204  414:getfield        #34  <Field ConstraintAnchor mTop>
	//  205  417:invokevirtual   #144 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  206  420:iconst_1        
	//  207  421:aload_2         
	//  208  422:getfield        #145 <Field ConstraintAnchor ConstraintWidget.mTop>
	//  209  425:invokevirtual   #144 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  210  428:iload_1         
	//  211  429:invokevirtual   #151 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
				mBottom.getResolutionNode().dependsOn(1, constraintwidget.mTop.getResolutionNode(), i);
	//  212  432:aload_0         
	//  213  433:getfield        #154 <Field ConstraintAnchor mBottom>
	//  214  436:invokevirtual   #144 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  215  439:iconst_1        
	//  216  440:aload_2         
	//  217  441:getfield        #145 <Field ConstraintAnchor ConstraintWidget.mTop>
	//  218  444:invokevirtual   #144 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  219  447:iload_1         
	//  220  448:invokevirtual   #151 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
			}
		}
	//  221  451:return          
	}

	public ConstraintAnchor getAnchor(ConstraintAnchor.Type type)
	{
		static class _cls1
		{

			static final int $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[];

			static 
			{
				$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type = new int[ConstraintAnchor.Type.values().length];
			//    0    0:invokestatic    #18  <Method ConstraintAnchor$Type[] ConstraintAnchor$Type.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
				try
				{
					$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
			//    5   12:getstatic       #24  <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
			//    6   15:invokevirtual   #28  <Method int ConstraintAnchor$Type.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
			//*  10   23:getstatic       #31  <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
			//*  11   26:invokevirtual   #28  <Method int ConstraintAnchor$Type.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
			//*  15   34:getstatic       #34  <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
			//*  16   37:invokevirtual   #28  <Method int ConstraintAnchor$Type.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
			//*  20   45:getstatic       #37  <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
			//*  21   48:invokevirtual   #28  <Method int ConstraintAnchor$Type.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
			//*  25   56:getstatic       #40  <Field ConstraintAnchor$Type ConstraintAnchor$Type.BASELINE>
			//*  26   59:invokevirtual   #28  <Method int ConstraintAnchor$Type.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:getstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
			//*  30   67:getstatic       #43  <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER>
			//*  31   70:invokevirtual   #28  <Method int ConstraintAnchor$Type.ordinal()>
			//*  32   73:bipush          6
			//*  33   75:iastore         
			//*  34   76:getstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
			//*  35   79:getstatic       #46  <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_X>
			//*  36   82:invokevirtual   #28  <Method int ConstraintAnchor$Type.ordinal()>
			//*  37   85:bipush          7
			//*  38   87:iastore         
			//*  39   88:getstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
			//*  40   91:getstatic       #49  <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_Y>
			//*  41   94:invokevirtual   #28  <Method int ConstraintAnchor$Type.ordinal()>
			//*  42   97:bipush          8
			//*  43   99:iastore         
			//*  44  100:getstatic       #20  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
			//*  45  103:getstatic       #52  <Field ConstraintAnchor$Type ConstraintAnchor$Type.NONE>
			//*  46  106:invokevirtual   #28  <Method int ConstraintAnchor$Type.ordinal()>
			//*  47  109:bipush          9
			//*  48  111:iastore         
			//*  49  112:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   50  113:astore_0        
				try
				{
					$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
				}
			//*  51  114:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   52  117:astore_0        
				try
				{
					$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.TOP.ordinal()] = 3;
				}
			//*  53  118:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   54  121:astore_0        
				try
				{
					$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
				}
			//*  55  122:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   56  125:astore_0        
				try
				{
					$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
				}
			//*  57  126:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   58  129:astore_0        
				try
				{
					$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
				}
			//*  59  130:goto            64
				catch(NoSuchFieldError nosuchfielderror5) { }
			//   60  133:astore_0        
				try
				{
					$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
				}
			//*  61  134:goto            76
				catch(NoSuchFieldError nosuchfielderror6) { }
			//   62  137:astore_0        
				try
				{
					$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
				}
			//*  63  138:goto            88
				catch(NoSuchFieldError nosuchfielderror7) { }
			//   64  141:astore_0        
				try
				{
					$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.NONE.ordinal()] = 9;
				}
			//*  65  142:goto            100
				catch(NoSuchFieldError nosuchfielderror8) { }
			//   66  145:astore_0        
			//*  67  146:return          
			}
		}

		switch(_cls1..SwitchMap.android.support.constraint.solver.widgets.ConstraintAnchor.Type[type.ordinal()])
	//*   0    0:getstatic       #183 <Field int[] Guideline$1.$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #186 <Method int ConstraintAnchor$Type.ordinal()>
	//*   3    7:iaload          
		{
		default:
			break;

	//*   4    8:tableswitch     1 9: default 60
	//	               1 77
	//	               2 77
	//	               3 65
	//	               4 65
	//	               5 63
	//	               6 63
	//	               7 63
	//	               8 63
	//	               9 63
	//*   5   60:goto            90
		case 5: // '\005'
		case 6: // '\006'
		case 7: // '\007'
		case 8: // '\b'
		case 9: // '\t'
			return null;
	//    6   63:aconst_null     
	//    7   64:areturn         

		case 3: // '\003'
		case 4: // '\004'
			if(mOrientation == 0)
	//*   8   65:aload_0         
	//*   9   66:getfield        #38  <Field int mOrientation>
	//*  10   69:ifne            90
				return mAnchor;
	//   11   72:aload_0         
	//   12   73:getfield        #36  <Field ConstraintAnchor mAnchor>
	//   13   76:areturn         
			break;

		case 1: // '\001'
		case 2: // '\002'
			if(mOrientation == 1)
	//*  14   77:aload_0         
	//*  15   78:getfield        #38  <Field int mOrientation>
	//*  16   81:iconst_1        
	//*  17   82:icmpne          90
				return mAnchor;
	//   18   85:aload_0         
	//   19   86:getfield        #36  <Field ConstraintAnchor mAnchor>
	//   20   89:areturn         
			break;
		}
		throw new AssertionError(((Object) (type.name())));
	//   21   90:new             #188 <Class AssertionError>
	//   22   93:dup             
	//   23   94:aload_1         
	//   24   95:invokevirtual   #192 <Method String ConstraintAnchor$Type.name()>
	//   25   98:invokespecial   #195 <Method void AssertionError(Object)>
	//   26  101:athrow          
	}

	public ArrayList getAnchors()
	{
		return mAnchors;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ArrayList mAnchors>
	//    2    4:areturn         
	}

	public int getOrientation()
	{
		return mOrientation;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int mOrientation>
	//    2    4:ireturn         
	}

	public void setGuideBegin(int i)
	{
		if(i > -1)
	//*   0    0:iload_1         
	//*   1    1:iconst_m1       
	//*   2    2:icmple          21
		{
			mRelativePercent = -1F;
	//    3    5:aload_0         
	//    4    6:ldc1            #25  <Float -1F>
	//    5    8:putfield        #27  <Field float mRelativePercent>
			mRelativeBegin = i;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:putfield        #29  <Field int mRelativeBegin>
			mRelativeEnd = -1;
	//    9   16:aload_0         
	//   10   17:iconst_m1       
	//   11   18:putfield        #31  <Field int mRelativeEnd>
		}
	//   12   21:return          
	}

	public void setGuideEnd(int i)
	{
		if(i > -1)
	//*   0    0:iload_1         
	//*   1    1:iconst_m1       
	//*   2    2:icmple          21
		{
			mRelativePercent = -1F;
	//    3    5:aload_0         
	//    4    6:ldc1            #25  <Float -1F>
	//    5    8:putfield        #27  <Field float mRelativePercent>
			mRelativeBegin = -1;
	//    6   11:aload_0         
	//    7   12:iconst_m1       
	//    8   13:putfield        #29  <Field int mRelativeBegin>
			mRelativeEnd = i;
	//    9   16:aload_0         
	//   10   17:iload_1         
	//   11   18:putfield        #31  <Field int mRelativeEnd>
		}
	//   12   21:return          
	}

	public void setGuidePercent(float f)
	{
		if(f > -1F)
	//*   0    0:fload_1         
	//*   1    1:ldc1            #25  <Float -1F>
	//*   2    3:fcmpl           
	//*   3    4:ifle            22
		{
			mRelativePercent = f;
	//    4    7:aload_0         
	//    5    8:fload_1         
	//    6    9:putfield        #27  <Field float mRelativePercent>
			mRelativeBegin = -1;
	//    7   12:aload_0         
	//    8   13:iconst_m1       
	//    9   14:putfield        #29  <Field int mRelativeBegin>
			mRelativeEnd = -1;
	//   10   17:aload_0         
	//   11   18:iconst_m1       
	//   12   19:putfield        #31  <Field int mRelativeEnd>
		}
	//   13   22:return          
	}

	public void setOrientation(int i)
	{
		if(mOrientation == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field int mOrientation>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		mOrientation = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #38  <Field int mOrientation>
		mAnchors.clear();
	//    8   14:aload_0         
	//    9   15:getfield        #53  <Field ArrayList mAnchors>
	//   10   18:invokevirtual   #58  <Method void ArrayList.clear()>
		if(mOrientation == 1)
	//*  11   21:aload_0         
	//*  12   22:getfield        #38  <Field int mOrientation>
	//*  13   25:iconst_1        
	//*  14   26:icmpne          40
			mAnchor = mLeft;
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #157 <Field ConstraintAnchor mLeft>
	//   18   34:putfield        #36  <Field ConstraintAnchor mAnchor>
		else
	//*  19   37:goto            48
			mAnchor = mTop;
	//   20   40:aload_0         
	//   21   41:aload_0         
	//   22   42:getfield        #34  <Field ConstraintAnchor mTop>
	//   23   45:putfield        #36  <Field ConstraintAnchor mAnchor>
		mAnchors.add(((Object) (mAnchor)));
	//   24   48:aload_0         
	//   25   49:getfield        #53  <Field ArrayList mAnchors>
	//   26   52:aload_0         
	//   27   53:getfield        #36  <Field ConstraintAnchor mAnchor>
	//   28   56:invokevirtual   #62  <Method boolean ArrayList.add(Object)>
	//   29   59:pop             
		int j = mListAnchors.length;
	//   30   60:aload_0         
	//   31   61:getfield        #66  <Field ConstraintAnchor[] mListAnchors>
	//   32   64:arraylength     
	//   33   65:istore_2        
		for(i = 0; i < j; i++)
	//*  34   66:iconst_0        
	//*  35   67:istore_1        
	//*  36   68:iload_1         
	//*  37   69:iload_2         
	//*  38   70:icmpge          90
			mListAnchors[i] = mAnchor;
	//   39   73:aload_0         
	//   40   74:getfield        #66  <Field ConstraintAnchor[] mListAnchors>
	//   41   77:iload_1         
	//   42   78:aload_0         
	//   43   79:getfield        #36  <Field ConstraintAnchor mAnchor>
	//   44   82:aastore         

	//   45   83:iload_1         
	//   46   84:iconst_1        
	//   47   85:iadd            
	//   48   86:istore_1        
	//*  49   87:goto            68
	//   50   90:return          
	}

	public void updateFromSolver(LinearSystem linearsystem)
	{
		if(getParent() == null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #73  <Method ConstraintWidget getParent()>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		int i = linearsystem.getObjectVariableValue(((Object) (mAnchor)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #36  <Field ConstraintAnchor mAnchor>
	//    7   13:invokevirtual   #209 <Method int LinearSystem.getObjectVariableValue(Object)>
	//    8   16:istore_2        
		if(mOrientation == 1)
	//*   9   17:aload_0         
	//*  10   18:getfield        #38  <Field int mOrientation>
	//*  11   21:iconst_1        
	//*  12   22:icmpne          52
		{
			setX(i);
	//   13   25:aload_0         
	//   14   26:iload_2         
	//   15   27:invokevirtual   #212 <Method void setX(int)>
			setY(0);
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:invokevirtual   #215 <Method void setY(int)>
			setHeight(getParent().getHeight());
	//   19   35:aload_0         
	//   20   36:aload_0         
	//   21   37:invokevirtual   #73  <Method ConstraintWidget getParent()>
	//   22   40:invokevirtual   #218 <Method int ConstraintWidget.getHeight()>
	//   23   43:invokevirtual   #221 <Method void setHeight(int)>
			setWidth(0);
	//   24   46:aload_0         
	//   25   47:iconst_0        
	//   26   48:invokevirtual   #224 <Method void setWidth(int)>
			return;
	//   27   51:return          
		} else
		{
			setX(0);
	//   28   52:aload_0         
	//   29   53:iconst_0        
	//   30   54:invokevirtual   #212 <Method void setX(int)>
			setY(i);
	//   31   57:aload_0         
	//   32   58:iload_2         
	//   33   59:invokevirtual   #215 <Method void setY(int)>
			setWidth(getParent().getWidth());
	//   34   62:aload_0         
	//   35   63:aload_0         
	//   36   64:invokevirtual   #73  <Method ConstraintWidget getParent()>
	//   37   67:invokevirtual   #227 <Method int ConstraintWidget.getWidth()>
	//   38   70:invokevirtual   #224 <Method void setWidth(int)>
			setHeight(0);
	//   39   73:aload_0         
	//   40   74:iconst_0        
	//   41   75:invokevirtual   #221 <Method void setHeight(int)>
			return;
	//   42   78:return          
		}
	}

	private ConstraintAnchor mAnchor;
	private Rectangle mHead;
	private int mHeadSize;
	private boolean mIsPositionRelaxed;
	private int mMinimumPosition;
	private int mOrientation;
	protected int mRelativeBegin;
	protected int mRelativeEnd;
	protected float mRelativePercent;
}
