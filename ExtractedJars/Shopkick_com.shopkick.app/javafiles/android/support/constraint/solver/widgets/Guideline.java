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
	//    1    1:invokespecial   #34  <Method void ConstraintWidget()>
		mRelativePercent = -1F;
	//    2    4:aload_0         
	//    3    5:ldc1            #35  <Float -1F>
	//    4    7:putfield        #37  <Field float mRelativePercent>
		mRelativeBegin = -1;
	//    5   10:aload_0         
	//    6   11:iconst_m1       
	//    7   12:putfield        #39  <Field int mRelativeBegin>
		mRelativeEnd = -1;
	//    8   15:aload_0         
	//    9   16:iconst_m1       
	//   10   17:putfield        #41  <Field int mRelativeEnd>
		mAnchor = mTop;
	//   11   20:aload_0         
	//   12   21:aload_0         
	//   13   22:getfield        #44  <Field ConstraintAnchor mTop>
	//   14   25:putfield        #46  <Field ConstraintAnchor mAnchor>
		int i = 0;
	//   15   28:iconst_0        
	//   16   29:istore_1        
		mOrientation = 0;
	//   17   30:aload_0         
	//   18   31:iconst_0        
	//   19   32:putfield        #48  <Field int mOrientation>
		mIsPositionRelaxed = false;
	//   20   35:aload_0         
	//   21   36:iconst_0        
	//   22   37:putfield        #50  <Field boolean mIsPositionRelaxed>
		mMinimumPosition = 0;
	//   23   40:aload_0         
	//   24   41:iconst_0        
	//   25   42:putfield        #52  <Field int mMinimumPosition>
		mHead = new Rectangle();
	//   26   45:aload_0         
	//   27   46:new             #54  <Class Rectangle>
	//   28   49:dup             
	//   29   50:invokespecial   #55  <Method void Rectangle()>
	//   30   53:putfield        #57  <Field Rectangle mHead>
		mHeadSize = 8;
	//   31   56:aload_0         
	//   32   57:bipush          8
	//   33   59:putfield        #59  <Field int mHeadSize>
		mAnchors.clear();
	//   34   62:aload_0         
	//   35   63:getfield        #63  <Field ArrayList mAnchors>
	//   36   66:invokevirtual   #68  <Method void ArrayList.clear()>
		mAnchors.add(((Object) (mAnchor)));
	//   37   69:aload_0         
	//   38   70:getfield        #63  <Field ArrayList mAnchors>
	//   39   73:aload_0         
	//   40   74:getfield        #46  <Field ConstraintAnchor mAnchor>
	//   41   77:invokevirtual   #72  <Method boolean ArrayList.add(Object)>
	//   42   80:pop             
		for(int j = mListAnchors.length; i < j; i++)
	//*  43   81:aload_0         
	//*  44   82:getfield        #76  <Field ConstraintAnchor[] mListAnchors>
	//*  45   85:arraylength     
	//*  46   86:istore_2        
	//*  47   87:iload_1         
	//*  48   88:iload_2         
	//*  49   89:icmpge          109
			mListAnchors[i] = mAnchor;
	//   50   92:aload_0         
	//   51   93:getfield        #76  <Field ConstraintAnchor[] mListAnchors>
	//   52   96:iload_1         
	//   53   97:aload_0         
	//   54   98:getfield        #46  <Field ConstraintAnchor mAnchor>
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
	//    1    1:invokevirtual   #83  <Method ConstraintWidget getParent()>
	//    2    4:checkcast       #85  <Class ConstraintWidgetContainer>
	//    3    7:astore          5
		if(constraintwidgetcontainer == null)
	//*   4    9:aload           5
	//*   5   11:ifnonnull       15
			return;
	//    6   14:return          
		ConstraintAnchor constraintanchor = constraintwidgetcontainer.getAnchor(ConstraintAnchor.Type.LEFT);
	//    7   15:aload           5
	//    8   17:getstatic       #91  <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//    9   20:invokevirtual   #95  <Method ConstraintAnchor ConstraintWidgetContainer.getAnchor(ConstraintAnchor$Type)>
	//   10   23:astore_3        
		Object obj = ((Object) (constraintwidgetcontainer.getAnchor(ConstraintAnchor.Type.RIGHT)));
	//   11   24:aload           5
	//   12   26:getstatic       #98  <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//   13   29:invokevirtual   #95  <Method ConstraintAnchor ConstraintWidgetContainer.getAnchor(ConstraintAnchor$Type)>
	//   14   32:astore          4
		boolean flag;
		if(mParent != null && mParent.mListDimensionBehaviors[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)
	//*  15   34:aload_0         
	//*  16   35:getfield        #102 <Field ConstraintWidget mParent>
	//*  17   38:ifnull          61
	//*  18   41:aload_0         
	//*  19   42:getfield        #102 <Field ConstraintWidget mParent>
	//*  20   45:getfield        #106 <Field ConstraintWidget$DimensionBehaviour[] ConstraintWidget.mListDimensionBehaviors>
	//*  21   48:iconst_0        
	//*  22   49:aaload          
	//*  23   50:getstatic       #112 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
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
	//*  31   64:getfield        #48  <Field int mOrientation>
	//*  32   67:ifne            118
		{
			constraintanchor = constraintwidgetcontainer.getAnchor(ConstraintAnchor.Type.TOP);
	//   33   70:aload           5
	//   34   72:getstatic       #115 <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//   35   75:invokevirtual   #95  <Method ConstraintAnchor ConstraintWidgetContainer.getAnchor(ConstraintAnchor$Type)>
	//   36   78:astore_3        
			obj = ((Object) (constraintwidgetcontainer.getAnchor(ConstraintAnchor.Type.BOTTOM)));
	//   37   79:aload           5
	//   38   81:getstatic       #118 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
	//   39   84:invokevirtual   #95  <Method ConstraintAnchor ConstraintWidgetContainer.getAnchor(ConstraintAnchor$Type)>
	//   40   87:astore          4
			if(mParent != null && mParent.mListDimensionBehaviors[1] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)
	//*  41   89:aload_0         
	//*  42   90:getfield        #102 <Field ConstraintWidget mParent>
	//*  43   93:ifnull          116
	//*  44   96:aload_0         
	//*  45   97:getfield        #102 <Field ConstraintWidget mParent>
	//*  46  100:getfield        #106 <Field ConstraintWidget$DimensionBehaviour[] ConstraintWidget.mListDimensionBehaviors>
	//*  47  103:iconst_1        
	//*  48  104:aaload          
	//*  49  105:getstatic       #112 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
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
	//*  57  119:getfield        #39  <Field int mRelativeBegin>
	//*  58  122:iconst_m1       
	//*  59  123:icmpeq          173
		{
			android.support.constraint.solver.SolverVariable solvervariable = linearsystem.createObjectVariable(((Object) (mAnchor)));
	//   60  126:aload_1         
	//   61  127:aload_0         
	//   62  128:getfield        #46  <Field ConstraintAnchor mAnchor>
	//   63  131:invokevirtual   #124 <Method android.support.constraint.solver.SolverVariable LinearSystem.createObjectVariable(Object)>
	//   64  134:astore          5
			linearsystem.addEquality(solvervariable, linearsystem.createObjectVariable(((Object) (constraintanchor))), mRelativeBegin, 6);
	//   65  136:aload_1         
	//   66  137:aload           5
	//   67  139:aload_1         
	//   68  140:aload_3         
	//   69  141:invokevirtual   #124 <Method android.support.constraint.solver.SolverVariable LinearSystem.createObjectVariable(Object)>
	//   70  144:aload_0         
	//   71  145:getfield        #39  <Field int mRelativeBegin>
	//   72  148:bipush          6
	//   73  150:invokevirtual   #128 <Method android.support.constraint.solver.ArrayRow LinearSystem.addEquality(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
	//   74  153:pop             
			if(flag)
	//*  75  154:iload_2         
	//*  76  155:ifeq            288
			{
				linearsystem.addGreaterThan(linearsystem.createObjectVariable(obj), solvervariable, 0, 5);
	//   77  158:aload_1         
	//   78  159:aload_1         
	//   79  160:aload           4
	//   80  162:invokevirtual   #124 <Method android.support.constraint.solver.SolverVariable LinearSystem.createObjectVariable(Object)>
	//   81  165:aload           5
	//   82  167:iconst_0        
	//   83  168:iconst_5        
	//   84  169:invokevirtual   #132 <Method void LinearSystem.addGreaterThan(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
				return;
	//   85  172:return          
			}
		} else
		if(mRelativeEnd != -1)
	//*  86  173:aload_0         
	//*  87  174:getfield        #41  <Field int mRelativeEnd>
	//*  88  177:iconst_m1       
	//*  89  178:icmpeq          243
		{
			android.support.constraint.solver.SolverVariable solvervariable1 = linearsystem.createObjectVariable(((Object) (mAnchor)));
	//   90  181:aload_1         
	//   91  182:aload_0         
	//   92  183:getfield        #46  <Field ConstraintAnchor mAnchor>
	//   93  186:invokevirtual   #124 <Method android.support.constraint.solver.SolverVariable LinearSystem.createObjectVariable(Object)>
	//   94  189:astore          5
			obj = ((Object) (linearsystem.createObjectVariable(obj)));
	//   95  191:aload_1         
	//   96  192:aload           4
	//   97  194:invokevirtual   #124 <Method android.support.constraint.solver.SolverVariable LinearSystem.createObjectVariable(Object)>
	//   98  197:astore          4
			linearsystem.addEquality(solvervariable1, ((android.support.constraint.solver.SolverVariable) (obj)), -mRelativeEnd, 6);
	//   99  199:aload_1         
	//  100  200:aload           5
	//  101  202:aload           4
	//  102  204:aload_0         
	//  103  205:getfield        #41  <Field int mRelativeEnd>
	//  104  208:ineg            
	//  105  209:bipush          6
	//  106  211:invokevirtual   #128 <Method android.support.constraint.solver.ArrayRow LinearSystem.addEquality(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
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
	//  114  224:invokevirtual   #124 <Method android.support.constraint.solver.SolverVariable LinearSystem.createObjectVariable(Object)>
	//  115  227:iconst_0        
	//  116  228:iconst_5        
	//  117  229:invokevirtual   #132 <Method void LinearSystem.addGreaterThan(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
				linearsystem.addGreaterThan(((android.support.constraint.solver.SolverVariable) (obj)), solvervariable1, 0, 5);
	//  118  232:aload_1         
	//  119  233:aload           4
	//  120  235:aload           5
	//  121  237:iconst_0        
	//  122  238:iconst_5        
	//  123  239:invokevirtual   #132 <Method void LinearSystem.addGreaterThan(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
				return;
	//  124  242:return          
			}
		} else
		if(mRelativePercent != -1F)
	//* 125  243:aload_0         
	//* 126  244:getfield        #37  <Field float mRelativePercent>
	//* 127  247:ldc1            #35  <Float -1F>
	//* 128  249:fcmpl           
	//* 129  250:ifeq            288
			linearsystem.addConstraint(LinearSystem.createRowDimensionPercent(linearsystem, linearsystem.createObjectVariable(((Object) (mAnchor))), linearsystem.createObjectVariable(((Object) (constraintanchor))), linearsystem.createObjectVariable(obj), mRelativePercent, mIsPositionRelaxed));
	//  130  253:aload_1         
	//  131  254:aload_1         
	//  132  255:aload_1         
	//  133  256:aload_0         
	//  134  257:getfield        #46  <Field ConstraintAnchor mAnchor>
	//  135  260:invokevirtual   #124 <Method android.support.constraint.solver.SolverVariable LinearSystem.createObjectVariable(Object)>
	//  136  263:aload_1         
	//  137  264:aload_3         
	//  138  265:invokevirtual   #124 <Method android.support.constraint.solver.SolverVariable LinearSystem.createObjectVariable(Object)>
	//  139  268:aload_1         
	//  140  269:aload           4
	//  141  271:invokevirtual   #124 <Method android.support.constraint.solver.SolverVariable LinearSystem.createObjectVariable(Object)>
	//  142  274:aload_0         
	//  143  275:getfield        #37  <Field float mRelativePercent>
	//  144  278:aload_0         
	//  145  279:getfield        #50  <Field boolean mIsPositionRelaxed>
	//  146  282:invokestatic    #136 <Method android.support.constraint.solver.ArrayRow LinearSystem.createRowDimensionPercent(LinearSystem, android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, float, boolean)>
	//  147  285:invokevirtual   #140 <Method void LinearSystem.addConstraint(android.support.constraint.solver.ArrayRow)>
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
	//    1    1:invokevirtual   #83  <Method ConstraintWidget getParent()>
	//    2    4:astore_2        
		if(constraintwidget == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		if(getOrientation() == 1)
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #148 <Method int getOrientation()>
	//*   8   14:iconst_1        
	//*   9   15:icmpne          235
		{
			mTop.getResolutionNode().dependsOn(1, constraintwidget.mTop.getResolutionNode(), 0);
	//   10   18:aload_0         
	//   11   19:getfield        #44  <Field ConstraintAnchor mTop>
	//   12   22:invokevirtual   #154 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   13   25:iconst_1        
	//   14   26:aload_2         
	//   15   27:getfield        #155 <Field ConstraintAnchor ConstraintWidget.mTop>
	//   16   30:invokevirtual   #154 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   17   33:iconst_0        
	//   18   34:invokevirtual   #161 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
			mBottom.getResolutionNode().dependsOn(1, constraintwidget.mTop.getResolutionNode(), 0);
	//   19   37:aload_0         
	//   20   38:getfield        #164 <Field ConstraintAnchor mBottom>
	//   21   41:invokevirtual   #154 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   22   44:iconst_1        
	//   23   45:aload_2         
	//   24   46:getfield        #155 <Field ConstraintAnchor ConstraintWidget.mTop>
	//   25   49:invokevirtual   #154 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   26   52:iconst_0        
	//   27   53:invokevirtual   #161 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
			if(mRelativeBegin != -1)
	//*  28   56:aload_0         
	//*  29   57:getfield        #39  <Field int mRelativeBegin>
	//*  30   60:iconst_m1       
	//*  31   61:icmpeq          109
			{
				mLeft.getResolutionNode().dependsOn(1, constraintwidget.mLeft.getResolutionNode(), mRelativeBegin);
	//   32   64:aload_0         
	//   33   65:getfield        #167 <Field ConstraintAnchor mLeft>
	//   34   68:invokevirtual   #154 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   35   71:iconst_1        
	//   36   72:aload_2         
	//   37   73:getfield        #168 <Field ConstraintAnchor ConstraintWidget.mLeft>
	//   38   76:invokevirtual   #154 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   39   79:aload_0         
	//   40   80:getfield        #39  <Field int mRelativeBegin>
	//   41   83:invokevirtual   #161 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
				mRight.getResolutionNode().dependsOn(1, constraintwidget.mLeft.getResolutionNode(), mRelativeBegin);
	//   42   86:aload_0         
	//   43   87:getfield        #171 <Field ConstraintAnchor mRight>
	//   44   90:invokevirtual   #154 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   45   93:iconst_1        
	//   46   94:aload_2         
	//   47   95:getfield        #168 <Field ConstraintAnchor ConstraintWidget.mLeft>
	//   48   98:invokevirtual   #154 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   49  101:aload_0         
	//   50  102:getfield        #39  <Field int mRelativeBegin>
	//   51  105:invokevirtual   #161 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
				return;
	//   52  108:return          
			}
			if(mRelativeEnd != -1)
	//*  53  109:aload_0         
	//*  54  110:getfield        #41  <Field int mRelativeEnd>
	//*  55  113:iconst_m1       
	//*  56  114:icmpeq          164
			{
				mLeft.getResolutionNode().dependsOn(1, constraintwidget.mRight.getResolutionNode(), -mRelativeEnd);
	//   57  117:aload_0         
	//   58  118:getfield        #167 <Field ConstraintAnchor mLeft>
	//   59  121:invokevirtual   #154 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   60  124:iconst_1        
	//   61  125:aload_2         
	//   62  126:getfield        #172 <Field ConstraintAnchor ConstraintWidget.mRight>
	//   63  129:invokevirtual   #154 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   64  132:aload_0         
	//   65  133:getfield        #41  <Field int mRelativeEnd>
	//   66  136:ineg            
	//   67  137:invokevirtual   #161 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
				mRight.getResolutionNode().dependsOn(1, constraintwidget.mRight.getResolutionNode(), -mRelativeEnd);
	//   68  140:aload_0         
	//   69  141:getfield        #171 <Field ConstraintAnchor mRight>
	//   70  144:invokevirtual   #154 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   71  147:iconst_1        
	//   72  148:aload_2         
	//   73  149:getfield        #172 <Field ConstraintAnchor ConstraintWidget.mRight>
	//   74  152:invokevirtual   #154 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   75  155:aload_0         
	//   76  156:getfield        #41  <Field int mRelativeEnd>
	//   77  159:ineg            
	//   78  160:invokevirtual   #161 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
				return;
	//   79  163:return          
			}
			if(mRelativePercent != -1F && constraintwidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED)
	//*  80  164:aload_0         
	//*  81  165:getfield        #37  <Field float mRelativePercent>
	//*  82  168:ldc1            #35  <Float -1F>
	//*  83  170:fcmpl           
	//*  84  171:ifeq            451
	//*  85  174:aload_2         
	//*  86  175:invokevirtual   #176 <Method ConstraintWidget$DimensionBehaviour ConstraintWidget.getHorizontalDimensionBehaviour()>
	//*  87  178:getstatic       #179 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.FIXED>
	//*  88  181:if_acmpne       451
			{
				i = (int)((float)constraintwidget.mWidth * mRelativePercent);
	//   89  184:aload_2         
	//   90  185:getfield        #182 <Field int ConstraintWidget.mWidth>
	//   91  188:i2f             
	//   92  189:aload_0         
	//   93  190:getfield        #37  <Field float mRelativePercent>
	//   94  193:fmul            
	//   95  194:f2i             
	//   96  195:istore_1        
				mLeft.getResolutionNode().dependsOn(1, constraintwidget.mLeft.getResolutionNode(), i);
	//   97  196:aload_0         
	//   98  197:getfield        #167 <Field ConstraintAnchor mLeft>
	//   99  200:invokevirtual   #154 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  100  203:iconst_1        
	//  101  204:aload_2         
	//  102  205:getfield        #168 <Field ConstraintAnchor ConstraintWidget.mLeft>
	//  103  208:invokevirtual   #154 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  104  211:iload_1         
	//  105  212:invokevirtual   #161 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
				mRight.getResolutionNode().dependsOn(1, constraintwidget.mLeft.getResolutionNode(), i);
	//  106  215:aload_0         
	//  107  216:getfield        #171 <Field ConstraintAnchor mRight>
	//  108  219:invokevirtual   #154 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  109  222:iconst_1        
	//  110  223:aload_2         
	//  111  224:getfield        #168 <Field ConstraintAnchor ConstraintWidget.mLeft>
	//  112  227:invokevirtual   #154 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  113  230:iload_1         
	//  114  231:invokevirtual   #161 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
				return;
	//  115  234:return          
			}
		} else
		{
			mLeft.getResolutionNode().dependsOn(1, constraintwidget.mLeft.getResolutionNode(), 0);
	//  116  235:aload_0         
	//  117  236:getfield        #167 <Field ConstraintAnchor mLeft>
	//  118  239:invokevirtual   #154 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  119  242:iconst_1        
	//  120  243:aload_2         
	//  121  244:getfield        #168 <Field ConstraintAnchor ConstraintWidget.mLeft>
	//  122  247:invokevirtual   #154 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  123  250:iconst_0        
	//  124  251:invokevirtual   #161 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
			mRight.getResolutionNode().dependsOn(1, constraintwidget.mLeft.getResolutionNode(), 0);
	//  125  254:aload_0         
	//  126  255:getfield        #171 <Field ConstraintAnchor mRight>
	//  127  258:invokevirtual   #154 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  128  261:iconst_1        
	//  129  262:aload_2         
	//  130  263:getfield        #168 <Field ConstraintAnchor ConstraintWidget.mLeft>
	//  131  266:invokevirtual   #154 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  132  269:iconst_0        
	//  133  270:invokevirtual   #161 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
			if(mRelativeBegin != -1)
	//* 134  273:aload_0         
	//* 135  274:getfield        #39  <Field int mRelativeBegin>
	//* 136  277:iconst_m1       
	//* 137  278:icmpeq          326
			{
				mTop.getResolutionNode().dependsOn(1, constraintwidget.mTop.getResolutionNode(), mRelativeBegin);
	//  138  281:aload_0         
	//  139  282:getfield        #44  <Field ConstraintAnchor mTop>
	//  140  285:invokevirtual   #154 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  141  288:iconst_1        
	//  142  289:aload_2         
	//  143  290:getfield        #155 <Field ConstraintAnchor ConstraintWidget.mTop>
	//  144  293:invokevirtual   #154 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  145  296:aload_0         
	//  146  297:getfield        #39  <Field int mRelativeBegin>
	//  147  300:invokevirtual   #161 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
				mBottom.getResolutionNode().dependsOn(1, constraintwidget.mTop.getResolutionNode(), mRelativeBegin);
	//  148  303:aload_0         
	//  149  304:getfield        #164 <Field ConstraintAnchor mBottom>
	//  150  307:invokevirtual   #154 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  151  310:iconst_1        
	//  152  311:aload_2         
	//  153  312:getfield        #155 <Field ConstraintAnchor ConstraintWidget.mTop>
	//  154  315:invokevirtual   #154 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  155  318:aload_0         
	//  156  319:getfield        #39  <Field int mRelativeBegin>
	//  157  322:invokevirtual   #161 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
				return;
	//  158  325:return          
			}
			if(mRelativeEnd != -1)
	//* 159  326:aload_0         
	//* 160  327:getfield        #41  <Field int mRelativeEnd>
	//* 161  330:iconst_m1       
	//* 162  331:icmpeq          381
			{
				mTop.getResolutionNode().dependsOn(1, constraintwidget.mBottom.getResolutionNode(), -mRelativeEnd);
	//  163  334:aload_0         
	//  164  335:getfield        #44  <Field ConstraintAnchor mTop>
	//  165  338:invokevirtual   #154 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  166  341:iconst_1        
	//  167  342:aload_2         
	//  168  343:getfield        #183 <Field ConstraintAnchor ConstraintWidget.mBottom>
	//  169  346:invokevirtual   #154 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  170  349:aload_0         
	//  171  350:getfield        #41  <Field int mRelativeEnd>
	//  172  353:ineg            
	//  173  354:invokevirtual   #161 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
				mBottom.getResolutionNode().dependsOn(1, constraintwidget.mBottom.getResolutionNode(), -mRelativeEnd);
	//  174  357:aload_0         
	//  175  358:getfield        #164 <Field ConstraintAnchor mBottom>
	//  176  361:invokevirtual   #154 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  177  364:iconst_1        
	//  178  365:aload_2         
	//  179  366:getfield        #183 <Field ConstraintAnchor ConstraintWidget.mBottom>
	//  180  369:invokevirtual   #154 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  181  372:aload_0         
	//  182  373:getfield        #41  <Field int mRelativeEnd>
	//  183  376:ineg            
	//  184  377:invokevirtual   #161 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
				return;
	//  185  380:return          
			}
			if(mRelativePercent != -1F && constraintwidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.FIXED)
	//* 186  381:aload_0         
	//* 187  382:getfield        #37  <Field float mRelativePercent>
	//* 188  385:ldc1            #35  <Float -1F>
	//* 189  387:fcmpl           
	//* 190  388:ifeq            451
	//* 191  391:aload_2         
	//* 192  392:invokevirtual   #186 <Method ConstraintWidget$DimensionBehaviour ConstraintWidget.getVerticalDimensionBehaviour()>
	//* 193  395:getstatic       #179 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.FIXED>
	//* 194  398:if_acmpne       451
			{
				i = (int)((float)constraintwidget.mHeight * mRelativePercent);
	//  195  401:aload_2         
	//  196  402:getfield        #189 <Field int ConstraintWidget.mHeight>
	//  197  405:i2f             
	//  198  406:aload_0         
	//  199  407:getfield        #37  <Field float mRelativePercent>
	//  200  410:fmul            
	//  201  411:f2i             
	//  202  412:istore_1        
				mTop.getResolutionNode().dependsOn(1, constraintwidget.mTop.getResolutionNode(), i);
	//  203  413:aload_0         
	//  204  414:getfield        #44  <Field ConstraintAnchor mTop>
	//  205  417:invokevirtual   #154 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  206  420:iconst_1        
	//  207  421:aload_2         
	//  208  422:getfield        #155 <Field ConstraintAnchor ConstraintWidget.mTop>
	//  209  425:invokevirtual   #154 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  210  428:iload_1         
	//  211  429:invokevirtual   #161 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
				mBottom.getResolutionNode().dependsOn(1, constraintwidget.mTop.getResolutionNode(), i);
	//  212  432:aload_0         
	//  213  433:getfield        #164 <Field ConstraintAnchor mBottom>
	//  214  436:invokevirtual   #154 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  215  439:iconst_1        
	//  216  440:aload_2         
	//  217  441:getfield        #155 <Field ConstraintAnchor ConstraintWidget.mTop>
	//  218  444:invokevirtual   #154 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  219  447:iload_1         
	//  220  448:invokevirtual   #161 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
			}
		}
	//  221  451:return          
	}

	public void cyclePosition()
	{
		if(mRelativeBegin != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field int mRelativeBegin>
	//*   2    4:iconst_m1       
	//*   3    5:icmpeq          13
		{
			inferRelativePercentPosition();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #193 <Method void inferRelativePercentPosition()>
			return;
	//    6   12:return          
		}
		if(mRelativePercent != -1F)
	//*   7   13:aload_0         
	//*   8   14:getfield        #37  <Field float mRelativePercent>
	//*   9   17:ldc1            #35  <Float -1F>
	//*  10   19:fcmpl           
	//*  11   20:ifeq            28
		{
			inferRelativeEndPosition();
	//   12   23:aload_0         
	//   13   24:invokevirtual   #196 <Method void inferRelativeEndPosition()>
			return;
	//   14   27:return          
		}
		if(mRelativeEnd != -1)
	//*  15   28:aload_0         
	//*  16   29:getfield        #41  <Field int mRelativeEnd>
	//*  17   32:iconst_m1       
	//*  18   33:icmpeq          40
			inferRelativeBeginPosition();
	//   19   36:aload_0         
	//   20   37:invokevirtual   #199 <Method void inferRelativeBeginPosition()>
	//   21   40:return          
	}

	public ConstraintAnchor getAnchor()
	{
		return mAnchor;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field ConstraintAnchor mAnchor>
	//    2    4:areturn         
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
	//*   0    0:getstatic       #204 <Field int[] Guideline$1.$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #207 <Method int ConstraintAnchor$Type.ordinal()>
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
	//*   9   66:getfield        #48  <Field int mOrientation>
	//*  10   69:ifne            90
				return mAnchor;
	//   11   72:aload_0         
	//   12   73:getfield        #46  <Field ConstraintAnchor mAnchor>
	//   13   76:areturn         
			break;

		case 1: // '\001'
		case 2: // '\002'
			if(mOrientation == 1)
	//*  14   77:aload_0         
	//*  15   78:getfield        #48  <Field int mOrientation>
	//*  16   81:iconst_1        
	//*  17   82:icmpne          90
				return mAnchor;
	//   18   85:aload_0         
	//   19   86:getfield        #46  <Field ConstraintAnchor mAnchor>
	//   20   89:areturn         
			break;
		}
		throw new AssertionError(((Object) (type.name())));
	//   21   90:new             #209 <Class AssertionError>
	//   22   93:dup             
	//   23   94:aload_1         
	//   24   95:invokevirtual   #213 <Method String ConstraintAnchor$Type.name()>
	//   25   98:invokespecial   #216 <Method void AssertionError(Object)>
	//   26  101:athrow          
	}

	public ArrayList getAnchors()
	{
		return mAnchors;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field ArrayList mAnchors>
	//    2    4:areturn         
	}

	public Rectangle getHead()
	{
		Rectangle rectangle = mHead;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Rectangle mHead>
	//    2    4:astore          5
		int i = getDrawX();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #225 <Method int getDrawX()>
	//    5   10:istore_1        
		int k = mHeadSize;
	//    6   11:aload_0         
	//    7   12:getfield        #59  <Field int mHeadSize>
	//    8   15:istore_2        
		int i1 = getDrawY();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #228 <Method int getDrawY()>
	//   11   20:istore_3        
		int k1 = mHeadSize;
	//   12   21:aload_0         
	//   13   22:getfield        #59  <Field int mHeadSize>
	//   14   25:istore          4
		rectangle.setBounds(i - k, i1 - k1 * 2, k1 * 2, k1 * 2);
	//   15   27:aload           5
	//   16   29:iload_1         
	//   17   30:iload_2         
	//   18   31:isub            
	//   19   32:iload_3         
	//   20   33:iload           4
	//   21   35:iconst_2        
	//   22   36:imul            
	//   23   37:isub            
	//   24   38:iload           4
	//   25   40:iconst_2        
	//   26   41:imul            
	//   27   42:iload           4
	//   28   44:iconst_2        
	//   29   45:imul            
	//   30   46:invokevirtual   #232 <Method void Rectangle.setBounds(int, int, int, int)>
		if(getOrientation() == 0)
	//*  31   49:aload_0         
	//*  32   50:invokevirtual   #148 <Method int getOrientation()>
	//*  33   53:ifne            105
		{
			Rectangle rectangle1 = mHead;
	//   34   56:aload_0         
	//   35   57:getfield        #57  <Field Rectangle mHead>
	//   36   60:astore          5
			int j = getDrawX();
	//   37   62:aload_0         
	//   38   63:invokevirtual   #225 <Method int getDrawX()>
	//   39   66:istore_1        
			int l = mHeadSize;
	//   40   67:aload_0         
	//   41   68:getfield        #59  <Field int mHeadSize>
	//   42   71:istore_2        
			int j1 = getDrawY();
	//   43   72:aload_0         
	//   44   73:invokevirtual   #228 <Method int getDrawY()>
	//   45   76:istore_3        
			int l1 = mHeadSize;
	//   46   77:aload_0         
	//   47   78:getfield        #59  <Field int mHeadSize>
	//   48   81:istore          4
			rectangle1.setBounds(j - l * 2, j1 - l1, l1 * 2, l1 * 2);
	//   49   83:aload           5
	//   50   85:iload_1         
	//   51   86:iload_2         
	//   52   87:iconst_2        
	//   53   88:imul            
	//   54   89:isub            
	//   55   90:iload_3         
	//   56   91:iload           4
	//   57   93:isub            
	//   58   94:iload           4
	//   59   96:iconst_2        
	//   60   97:imul            
	//   61   98:iload           4
	//   62  100:iconst_2        
	//   63  101:imul            
	//   64  102:invokevirtual   #232 <Method void Rectangle.setBounds(int, int, int, int)>
		}
		return mHead;
	//   65  105:aload_0         
	//   66  106:getfield        #57  <Field Rectangle mHead>
	//   67  109:areturn         
	}

	public int getOrientation()
	{
		return mOrientation;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int mOrientation>
	//    2    4:ireturn         
	}

	public int getRelativeBegin()
	{
		return mRelativeBegin;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int mRelativeBegin>
	//    2    4:ireturn         
	}

	public int getRelativeBehaviour()
	{
		if(mRelativePercent != -1F)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field float mRelativePercent>
	//*   2    4:ldc1            #35  <Float -1F>
	//*   3    6:fcmpl           
	//*   4    7:ifeq            12
			return 0;
	//    5   10:iconst_0        
	//    6   11:ireturn         
		if(mRelativeBegin != -1)
	//*   7   12:aload_0         
	//*   8   13:getfield        #39  <Field int mRelativeBegin>
	//*   9   16:iconst_m1       
	//*  10   17:icmpeq          22
			return 1;
	//   11   20:iconst_1        
	//   12   21:ireturn         
		return mRelativeEnd == -1 ? -1 : 2;
	//   13   22:aload_0         
	//   14   23:getfield        #41  <Field int mRelativeEnd>
	//   15   26:iconst_m1       
	//   16   27:icmpeq          32
	//   17   30:iconst_2        
	//   18   31:ireturn         
	//   19   32:iconst_m1       
	//   20   33:ireturn         
	}

	public int getRelativeEnd()
	{
		return mRelativeEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int mRelativeEnd>
	//    2    4:ireturn         
	}

	public float getRelativePercent()
	{
		return mRelativePercent;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field float mRelativePercent>
	//    2    4:freturn         
	}

	public String getType()
	{
		return "Guideline";
	//    0    0:ldc1            #240 <String "Guideline">
	//    1    2:areturn         
	}

	void inferRelativeBeginPosition()
	{
		int i = getX();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #243 <Method int getX()>
	//    2    4:istore_1        
		if(mOrientation == 0)
	//*   3    5:aload_0         
	//*   4    6:getfield        #48  <Field int mOrientation>
	//*   5    9:ifne            17
			i = getY();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #246 <Method int getY()>
	//    8   16:istore_1        
		setGuideBegin(i);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:invokevirtual   #249 <Method void setGuideBegin(int)>
	//   12   22:return          
	}

	void inferRelativeEndPosition()
	{
		int i = getParent().getWidth() - getX();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #83  <Method ConstraintWidget getParent()>
	//    2    4:invokevirtual   #252 <Method int ConstraintWidget.getWidth()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #243 <Method int getX()>
	//    5   11:isub            
	//    6   12:istore_1        
		if(mOrientation == 0)
	//*   7   13:aload_0         
	//*   8   14:getfield        #48  <Field int mOrientation>
	//*   9   17:ifne            33
			i = getParent().getHeight() - getY();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #83  <Method ConstraintWidget getParent()>
	//   12   24:invokevirtual   #255 <Method int ConstraintWidget.getHeight()>
	//   13   27:aload_0         
	//   14   28:invokevirtual   #246 <Method int getY()>
	//   15   31:isub            
	//   16   32:istore_1        
		setGuideEnd(i);
	//   17   33:aload_0         
	//   18   34:iload_1         
	//   19   35:invokevirtual   #258 <Method void setGuideEnd(int)>
	//   20   38:return          
	}

	void inferRelativePercentPosition()
	{
		float f = (float)getX() / (float)getParent().getWidth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #243 <Method int getX()>
	//    2    4:i2f             
	//    3    5:aload_0         
	//    4    6:invokevirtual   #83  <Method ConstraintWidget getParent()>
	//    5    9:invokevirtual   #252 <Method int ConstraintWidget.getWidth()>
	//    6   12:i2f             
	//    7   13:fdiv            
	//    8   14:fstore_1        
		if(mOrientation == 0)
	//*   9   15:aload_0         
	//*  10   16:getfield        #48  <Field int mOrientation>
	//*  11   19:ifne            37
			f = (float)getY() / (float)getParent().getHeight();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #246 <Method int getY()>
	//   14   26:i2f             
	//   15   27:aload_0         
	//   16   28:invokevirtual   #83  <Method ConstraintWidget getParent()>
	//   17   31:invokevirtual   #255 <Method int ConstraintWidget.getHeight()>
	//   18   34:i2f             
	//   19   35:fdiv            
	//   20   36:fstore_1        
		setGuidePercent(f);
	//   21   37:aload_0         
	//   22   38:fload_1         
	//   23   39:invokevirtual   #262 <Method void setGuidePercent(float)>
	//   24   42:return          
	}

	public void setDrawOrigin(int i, int j)
	{
		if(mOrientation == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field int mOrientation>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          77
		{
			i -= mOffsetX;
	//    4    8:iload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #267 <Field int mOffsetX>
	//    7   13:isub            
	//    8   14:istore_1        
			if(mRelativeBegin != -1)
	//*   9   15:aload_0         
	//*  10   16:getfield        #39  <Field int mRelativeBegin>
	//*  11   19:iconst_m1       
	//*  12   20:icmpeq          29
			{
				setGuideBegin(i);
	//   13   23:aload_0         
	//   14   24:iload_1         
	//   15   25:invokevirtual   #249 <Method void setGuideBegin(int)>
				return;
	//   16   28:return          
			}
			if(mRelativeEnd != -1)
	//*  17   29:aload_0         
	//*  18   30:getfield        #41  <Field int mRelativeEnd>
	//*  19   33:iconst_m1       
	//*  20   34:icmpeq          51
			{
				setGuideEnd(getParent().getWidth() - i);
	//   21   37:aload_0         
	//   22   38:aload_0         
	//   23   39:invokevirtual   #83  <Method ConstraintWidget getParent()>
	//   24   42:invokevirtual   #252 <Method int ConstraintWidget.getWidth()>
	//   25   45:iload_1         
	//   26   46:isub            
	//   27   47:invokevirtual   #258 <Method void setGuideEnd(int)>
				return;
	//   28   50:return          
			}
			if(mRelativePercent != -1F)
	//*  29   51:aload_0         
	//*  30   52:getfield        #37  <Field float mRelativePercent>
	//*  31   55:ldc1            #35  <Float -1F>
	//*  32   57:fcmpl           
	//*  33   58:ifeq            145
			{
				setGuidePercent((float)i / (float)getParent().getWidth());
	//   34   61:aload_0         
	//   35   62:iload_1         
	//   36   63:i2f             
	//   37   64:aload_0         
	//   38   65:invokevirtual   #83  <Method ConstraintWidget getParent()>
	//   39   68:invokevirtual   #252 <Method int ConstraintWidget.getWidth()>
	//   40   71:i2f             
	//   41   72:fdiv            
	//   42   73:invokevirtual   #262 <Method void setGuidePercent(float)>
				return;
	//   43   76:return          
			}
		} else
		{
			i = j - mOffsetY;
	//   44   77:iload_2         
	//   45   78:aload_0         
	//   46   79:getfield        #270 <Field int mOffsetY>
	//   47   82:isub            
	//   48   83:istore_1        
			if(mRelativeBegin != -1)
	//*  49   84:aload_0         
	//*  50   85:getfield        #39  <Field int mRelativeBegin>
	//*  51   88:iconst_m1       
	//*  52   89:icmpeq          98
			{
				setGuideBegin(i);
	//   53   92:aload_0         
	//   54   93:iload_1         
	//   55   94:invokevirtual   #249 <Method void setGuideBegin(int)>
				return;
	//   56   97:return          
			}
			if(mRelativeEnd != -1)
	//*  57   98:aload_0         
	//*  58   99:getfield        #41  <Field int mRelativeEnd>
	//*  59  102:iconst_m1       
	//*  60  103:icmpeq          120
			{
				setGuideEnd(getParent().getHeight() - i);
	//   61  106:aload_0         
	//   62  107:aload_0         
	//   63  108:invokevirtual   #83  <Method ConstraintWidget getParent()>
	//   64  111:invokevirtual   #255 <Method int ConstraintWidget.getHeight()>
	//   65  114:iload_1         
	//   66  115:isub            
	//   67  116:invokevirtual   #258 <Method void setGuideEnd(int)>
				return;
	//   68  119:return          
			}
			if(mRelativePercent != -1F)
	//*  69  120:aload_0         
	//*  70  121:getfield        #37  <Field float mRelativePercent>
	//*  71  124:ldc1            #35  <Float -1F>
	//*  72  126:fcmpl           
	//*  73  127:ifeq            145
				setGuidePercent((float)i / (float)getParent().getHeight());
	//   74  130:aload_0         
	//   75  131:iload_1         
	//   76  132:i2f             
	//   77  133:aload_0         
	//   78  134:invokevirtual   #83  <Method ConstraintWidget getParent()>
	//   79  137:invokevirtual   #255 <Method int ConstraintWidget.getHeight()>
	//   80  140:i2f             
	//   81  141:fdiv            
	//   82  142:invokevirtual   #262 <Method void setGuidePercent(float)>
		}
	//   83  145:return          
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
	//    4    6:ldc1            #35  <Float -1F>
	//    5    8:putfield        #37  <Field float mRelativePercent>
			mRelativeBegin = i;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:putfield        #39  <Field int mRelativeBegin>
			mRelativeEnd = -1;
	//    9   16:aload_0         
	//   10   17:iconst_m1       
	//   11   18:putfield        #41  <Field int mRelativeEnd>
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
	//    4    6:ldc1            #35  <Float -1F>
	//    5    8:putfield        #37  <Field float mRelativePercent>
			mRelativeBegin = -1;
	//    6   11:aload_0         
	//    7   12:iconst_m1       
	//    8   13:putfield        #39  <Field int mRelativeBegin>
			mRelativeEnd = i;
	//    9   16:aload_0         
	//   10   17:iload_1         
	//   11   18:putfield        #41  <Field int mRelativeEnd>
		}
	//   12   21:return          
	}

	public void setGuidePercent(float f)
	{
		if(f > -1F)
	//*   0    0:fload_1         
	//*   1    1:ldc1            #35  <Float -1F>
	//*   2    3:fcmpl           
	//*   3    4:ifle            22
		{
			mRelativePercent = f;
	//    4    7:aload_0         
	//    5    8:fload_1         
	//    6    9:putfield        #37  <Field float mRelativePercent>
			mRelativeBegin = -1;
	//    7   12:aload_0         
	//    8   13:iconst_m1       
	//    9   14:putfield        #39  <Field int mRelativeBegin>
			mRelativeEnd = -1;
	//   10   17:aload_0         
	//   11   18:iconst_m1       
	//   12   19:putfield        #41  <Field int mRelativeEnd>
		}
	//   13   22:return          
	}

	public void setGuidePercent(int i)
	{
		setGuidePercent((float)i / 100F);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:i2f             
	//    3    3:ldc2            #271 <Float 100F>
	//    4    6:fdiv            
	//    5    7:invokevirtual   #262 <Method void setGuidePercent(float)>
	//    6   10:return          
	}

	public void setMinimumPosition(int i)
	{
		mMinimumPosition = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #52  <Field int mMinimumPosition>
	//    3    5:return          
	}

	public void setOrientation(int i)
	{
		if(mOrientation == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field int mOrientation>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		mOrientation = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #48  <Field int mOrientation>
		mAnchors.clear();
	//    8   14:aload_0         
	//    9   15:getfield        #63  <Field ArrayList mAnchors>
	//   10   18:invokevirtual   #68  <Method void ArrayList.clear()>
		if(mOrientation == 1)
	//*  11   21:aload_0         
	//*  12   22:getfield        #48  <Field int mOrientation>
	//*  13   25:iconst_1        
	//*  14   26:icmpne          40
			mAnchor = mLeft;
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #167 <Field ConstraintAnchor mLeft>
	//   18   34:putfield        #46  <Field ConstraintAnchor mAnchor>
		else
	//*  19   37:goto            48
			mAnchor = mTop;
	//   20   40:aload_0         
	//   21   41:aload_0         
	//   22   42:getfield        #44  <Field ConstraintAnchor mTop>
	//   23   45:putfield        #46  <Field ConstraintAnchor mAnchor>
		mAnchors.add(((Object) (mAnchor)));
	//   24   48:aload_0         
	//   25   49:getfield        #63  <Field ArrayList mAnchors>
	//   26   52:aload_0         
	//   27   53:getfield        #46  <Field ConstraintAnchor mAnchor>
	//   28   56:invokevirtual   #72  <Method boolean ArrayList.add(Object)>
	//   29   59:pop             
		int j = mListAnchors.length;
	//   30   60:aload_0         
	//   31   61:getfield        #76  <Field ConstraintAnchor[] mListAnchors>
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
	//   40   74:getfield        #76  <Field ConstraintAnchor[] mListAnchors>
	//   41   77:iload_1         
	//   42   78:aload_0         
	//   43   79:getfield        #46  <Field ConstraintAnchor mAnchor>
	//   44   82:aastore         

	//   45   83:iload_1         
	//   46   84:iconst_1        
	//   47   85:iadd            
	//   48   86:istore_1        
	//*  49   87:goto            68
	//   50   90:return          
	}

	public void setPositionRelaxed(boolean flag)
	{
		if(mIsPositionRelaxed == flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field boolean mIsPositionRelaxed>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
		{
			return;
	//    4    8:return          
		} else
		{
			mIsPositionRelaxed = flag;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #50  <Field boolean mIsPositionRelaxed>
			return;
	//    8   14:return          
		}
	}

	public void updateFromSolver(LinearSystem linearsystem)
	{
		if(getParent() == null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #83  <Method ConstraintWidget getParent()>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		int i = linearsystem.getObjectVariableValue(((Object) (mAnchor)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #46  <Field ConstraintAnchor mAnchor>
	//    7   13:invokevirtual   #280 <Method int LinearSystem.getObjectVariableValue(Object)>
	//    8   16:istore_2        
		if(mOrientation == 1)
	//*   9   17:aload_0         
	//*  10   18:getfield        #48  <Field int mOrientation>
	//*  11   21:iconst_1        
	//*  12   22:icmpne          52
		{
			setX(i);
	//   13   25:aload_0         
	//   14   26:iload_2         
	//   15   27:invokevirtual   #283 <Method void setX(int)>
			setY(0);
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:invokevirtual   #286 <Method void setY(int)>
			setHeight(getParent().getHeight());
	//   19   35:aload_0         
	//   20   36:aload_0         
	//   21   37:invokevirtual   #83  <Method ConstraintWidget getParent()>
	//   22   40:invokevirtual   #255 <Method int ConstraintWidget.getHeight()>
	//   23   43:invokevirtual   #289 <Method void setHeight(int)>
			setWidth(0);
	//   24   46:aload_0         
	//   25   47:iconst_0        
	//   26   48:invokevirtual   #292 <Method void setWidth(int)>
			return;
	//   27   51:return          
		} else
		{
			setX(0);
	//   28   52:aload_0         
	//   29   53:iconst_0        
	//   30   54:invokevirtual   #283 <Method void setX(int)>
			setY(i);
	//   31   57:aload_0         
	//   32   58:iload_2         
	//   33   59:invokevirtual   #286 <Method void setY(int)>
			setWidth(getParent().getWidth());
	//   34   62:aload_0         
	//   35   63:aload_0         
	//   36   64:invokevirtual   #83  <Method ConstraintWidget getParent()>
	//   37   67:invokevirtual   #252 <Method int ConstraintWidget.getWidth()>
	//   38   70:invokevirtual   #292 <Method void setWidth(int)>
			setHeight(0);
	//   39   73:aload_0         
	//   40   74:iconst_0        
	//   41   75:invokevirtual   #289 <Method void setHeight(int)>
			return;
	//   42   78:return          
		}
	}

	public static final int HORIZONTAL = 0;
	public static final int RELATIVE_BEGIN = 1;
	public static final int RELATIVE_END = 2;
	public static final int RELATIVE_PERCENT = 0;
	public static final int RELATIVE_UNKNWON = -1;
	public static final int VERTICAL = 1;
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
