// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver.widgets;

import java.util.ArrayList;

// Referenced classes of package android.support.constraint.solver.widgets:
//			ConstraintWidget, ConstraintAnchor

public class ChainHead
{

	public ChainHead(ConstraintWidget constraintwidget, int i, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		mTotalWeight = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #34  <Field float mTotalWeight>
		mIsRtl = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #36  <Field boolean mIsRtl>
		mFirst = constraintwidget;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #38  <Field ConstraintWidget mFirst>
		mOrientation = i;
	//   11   19:aload_0         
	//   12   20:iload_2         
	//   13   21:putfield        #40  <Field int mOrientation>
		mIsRtl = flag;
	//   14   24:aload_0         
	//   15   25:iload_3         
	//   16   26:putfield        #36  <Field boolean mIsRtl>
	//   17   29:return          
	}

	private void defineChainProperties()
	{
		int i = mOrientation * 2;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int mOrientation>
	//    2    4:iconst_2        
	//    3    5:imul            
	//    4    6:istore_3        
		ConstraintWidget constraintwidget3 = mFirst;
	//    5    7:aload_0         
	//    6    8:getfield        #38  <Field ConstraintWidget mFirst>
	//    7   11:astore          8
		boolean flag2 = false;
	//    8   13:iconst_0        
	//    9   14:istore          6
		boolean flag = false;
	//   10   16:iconst_0        
	//   11   17:istore_2        
		while(!flag) 
	//*  12   18:iload_2         
	//*  13   19:ifne            414
		{
			mWidgetsCount = mWidgetsCount + 1;
	//   14   22:aload_0         
	//   15   23:aload_0         
	//   16   24:getfield        #44  <Field int mWidgetsCount>
	//   17   27:iconst_1        
	//   18   28:iadd            
	//   19   29:putfield        #44  <Field int mWidgetsCount>
			ConstraintWidget aconstraintwidget[] = constraintwidget3.mListNextVisibleWidget;
	//   20   32:aload           8
	//   21   34:getfield        #50  <Field ConstraintWidget[] ConstraintWidget.mListNextVisibleWidget>
	//   22   37:astore          7
			int j = mOrientation;
	//   23   39:aload_0         
	//   24   40:getfield        #40  <Field int mOrientation>
	//   25   43:istore          4
			Object obj = null;
	//   26   45:aconst_null     
	//   27   46:astore          9
			aconstraintwidget[j] = null;
	//   28   48:aload           7
	//   29   50:iload           4
	//   30   52:aconst_null     
	//   31   53:aastore         
			constraintwidget3.mListNextMatchConstraintsWidget[mOrientation] = null;
	//   32   54:aload           8
	//   33   56:getfield        #53  <Field ConstraintWidget[] ConstraintWidget.mListNextMatchConstraintsWidget>
	//   34   59:aload_0         
	//   35   60:getfield        #40  <Field int mOrientation>
	//   36   63:aconst_null     
	//   37   64:aastore         
			if(constraintwidget3.getVisibility() != 8)
	//*  38   65:aload           8
	//*  39   67:invokevirtual   #57  <Method int ConstraintWidget.getVisibility()>
	//*  40   70:bipush          8
	//*  41   72:icmpeq          321
			{
				if(mFirstVisibleWidget == null)
	//*  42   75:aload_0         
	//*  43   76:getfield        #59  <Field ConstraintWidget mFirstVisibleWidget>
	//*  44   79:ifnonnull       88
					mFirstVisibleWidget = constraintwidget3;
	//   45   82:aload_0         
	//   46   83:aload           8
	//   47   85:putfield        #59  <Field ConstraintWidget mFirstVisibleWidget>
				ConstraintWidget constraintwidget = mLastVisibleWidget;
	//   48   88:aload_0         
	//   49   89:getfield        #61  <Field ConstraintWidget mLastVisibleWidget>
	//   50   92:astore          7
				if(constraintwidget != null)
	//*  51   94:aload           7
	//*  52   96:ifnull          111
					constraintwidget.mListNextVisibleWidget[mOrientation] = constraintwidget3;
	//   53   99:aload           7
	//   54  101:getfield        #50  <Field ConstraintWidget[] ConstraintWidget.mListNextVisibleWidget>
	//   55  104:aload_0         
	//   56  105:getfield        #40  <Field int mOrientation>
	//   57  108:aload           8
	//   58  110:aastore         
				mLastVisibleWidget = constraintwidget3;
	//   59  111:aload_0         
	//   60  112:aload           8
	//   61  114:putfield        #61  <Field ConstraintWidget mLastVisibleWidget>
				if(constraintwidget3.mListDimensionBehaviors[mOrientation] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && (constraintwidget3.mResolvedMatchConstraintDefault[mOrientation] == 0 || constraintwidget3.mResolvedMatchConstraintDefault[mOrientation] == 3 || constraintwidget3.mResolvedMatchConstraintDefault[mOrientation] == 2))
	//*  62  117:aload           8
	//*  63  119:getfield        #65  <Field ConstraintWidget$DimensionBehaviour[] ConstraintWidget.mListDimensionBehaviors>
	//*  64  122:aload_0         
	//*  65  123:getfield        #40  <Field int mOrientation>
	//*  66  126:aaload          
	//*  67  127:getstatic       #71  <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//*  68  130:if_acmpne       321
	//*  69  133:aload           8
	//*  70  135:getfield        #75  <Field int[] ConstraintWidget.mResolvedMatchConstraintDefault>
	//*  71  138:aload_0         
	//*  72  139:getfield        #40  <Field int mOrientation>
	//*  73  142:iaload          
	//*  74  143:ifeq            174
	//*  75  146:aload           8
	//*  76  148:getfield        #75  <Field int[] ConstraintWidget.mResolvedMatchConstraintDefault>
	//*  77  151:aload_0         
	//*  78  152:getfield        #40  <Field int mOrientation>
	//*  79  155:iaload          
	//*  80  156:iconst_3        
	//*  81  157:icmpeq          174
	//*  82  160:aload           8
	//*  83  162:getfield        #75  <Field int[] ConstraintWidget.mResolvedMatchConstraintDefault>
	//*  84  165:aload_0         
	//*  85  166:getfield        #40  <Field int mOrientation>
	//*  86  169:iaload          
	//*  87  170:iconst_2        
	//*  88  171:icmpne          321
				{
					mWidgetsMatchCount = mWidgetsMatchCount + 1;
	//   89  174:aload_0         
	//   90  175:aload_0         
	//   91  176:getfield        #77  <Field int mWidgetsMatchCount>
	//   92  179:iconst_1        
	//   93  180:iadd            
	//   94  181:putfield        #77  <Field int mWidgetsMatchCount>
					float f = constraintwidget3.mWeight[mOrientation];
	//   95  184:aload           8
	//   96  186:getfield        #81  <Field float[] ConstraintWidget.mWeight>
	//   97  189:aload_0         
	//   98  190:getfield        #40  <Field int mOrientation>
	//   99  193:faload          
	//  100  194:fstore_1        
					if(f > 0.0F)
	//* 101  195:fload_1         
	//* 102  196:fconst_0        
	//* 103  197:fcmpl           
	//* 104  198:ifle            220
						mTotalWeight = mTotalWeight + constraintwidget3.mWeight[mOrientation];
	//  105  201:aload_0         
	//  106  202:aload_0         
	//  107  203:getfield        #34  <Field float mTotalWeight>
	//  108  206:aload           8
	//  109  208:getfield        #81  <Field float[] ConstraintWidget.mWeight>
	//  110  211:aload_0         
	//  111  212:getfield        #40  <Field int mOrientation>
	//  112  215:faload          
	//  113  216:fadd            
	//  114  217:putfield        #34  <Field float mTotalWeight>
					if(isMatchConstraintEqualityCandidate(constraintwidget3, mOrientation))
	//* 115  220:aload           8
	//* 116  222:aload_0         
	//* 117  223:getfield        #40  <Field int mOrientation>
	//* 118  226:invokestatic    #85  <Method boolean isMatchConstraintEqualityCandidate(ConstraintWidget, int)>
	//* 119  229:ifeq            279
					{
						if(f < 0.0F)
	//* 120  232:fload_1         
	//* 121  233:fconst_0        
	//* 122  234:fcmpg           
	//* 123  235:ifge            246
							mHasUndefinedWeights = true;
	//  124  238:aload_0         
	//  125  239:iconst_1        
	//  126  240:putfield        #87  <Field boolean mHasUndefinedWeights>
						else
	//* 127  243:goto            251
							mHasDefinedWeights = true;
	//  128  246:aload_0         
	//  129  247:iconst_1        
	//  130  248:putfield        #89  <Field boolean mHasDefinedWeights>
						if(mWeightedMatchConstraintsWidgets == null)
	//* 131  251:aload_0         
	//* 132  252:getfield        #91  <Field ArrayList mWeightedMatchConstraintsWidgets>
	//* 133  255:ifnonnull       269
							mWeightedMatchConstraintsWidgets = new ArrayList();
	//  134  258:aload_0         
	//  135  259:new             #93  <Class ArrayList>
	//  136  262:dup             
	//  137  263:invokespecial   #94  <Method void ArrayList()>
	//  138  266:putfield        #91  <Field ArrayList mWeightedMatchConstraintsWidgets>
						mWeightedMatchConstraintsWidgets.add(((Object) (constraintwidget3)));
	//  139  269:aload_0         
	//  140  270:getfield        #91  <Field ArrayList mWeightedMatchConstraintsWidgets>
	//  141  273:aload           8
	//  142  275:invokevirtual   #98  <Method boolean ArrayList.add(Object)>
	//  143  278:pop             
					}
					if(mFirstMatchConstraintWidget == null)
	//* 144  279:aload_0         
	//* 145  280:getfield        #100 <Field ConstraintWidget mFirstMatchConstraintWidget>
	//* 146  283:ifnonnull       292
						mFirstMatchConstraintWidget = constraintwidget3;
	//  147  286:aload_0         
	//  148  287:aload           8
	//  149  289:putfield        #100 <Field ConstraintWidget mFirstMatchConstraintWidget>
					ConstraintWidget constraintwidget1 = mLastMatchConstraintWidget;
	//  150  292:aload_0         
	//  151  293:getfield        #102 <Field ConstraintWidget mLastMatchConstraintWidget>
	//  152  296:astore          7
					if(constraintwidget1 != null)
	//* 153  298:aload           7
	//* 154  300:ifnull          315
						constraintwidget1.mListNextMatchConstraintsWidget[mOrientation] = constraintwidget3;
	//  155  303:aload           7
	//  156  305:getfield        #53  <Field ConstraintWidget[] ConstraintWidget.mListNextMatchConstraintsWidget>
	//  157  308:aload_0         
	//  158  309:getfield        #40  <Field int mOrientation>
	//  159  312:aload           8
	//  160  314:aastore         
					mLastMatchConstraintWidget = constraintwidget3;
	//  161  315:aload_0         
	//  162  316:aload           8
	//  163  318:putfield        #102 <Field ConstraintWidget mLastMatchConstraintWidget>
				}
			}
			Object obj1 = ((Object) (constraintwidget3.mListAnchors[i + 1].mTarget));
	//  164  321:aload           8
	//  165  323:getfield        #106 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  166  326:iload_3         
	//  167  327:iconst_1        
	//  168  328:iadd            
	//  169  329:aaload          
	//  170  330:getfield        #112 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//  171  333:astore          10
			ConstraintWidget constraintwidget2 = ((ConstraintWidget) (obj));
	//  172  335:aload           9
	//  173  337:astore          7
			if(obj1 != null)
	//* 174  339:aload           10
	//* 175  341:ifnull          397
			{
				obj1 = ((Object) (((ConstraintAnchor) (obj1)).mOwner));
	//  176  344:aload           10
	//  177  346:getfield        #115 <Field ConstraintWidget ConstraintAnchor.mOwner>
	//  178  349:astore          10
				constraintwidget2 = ((ConstraintWidget) (obj));
	//  179  351:aload           9
	//  180  353:astore          7
				if(((ConstraintWidget) (obj1)).mListAnchors[i].mTarget != null)
	//* 181  355:aload           10
	//* 182  357:getfield        #106 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//* 183  360:iload_3         
	//* 184  361:aaload          
	//* 185  362:getfield        #112 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 186  365:ifnull          397
					if(((ConstraintWidget) (obj1)).mListAnchors[i].mTarget.mOwner != constraintwidget3)
	//* 187  368:aload           10
	//* 188  370:getfield        #106 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//* 189  373:iload_3         
	//* 190  374:aaload          
	//* 191  375:getfield        #112 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 192  378:getfield        #115 <Field ConstraintWidget ConstraintAnchor.mOwner>
	//* 193  381:aload           8
	//* 194  383:if_acmpeq       393
						constraintwidget2 = ((ConstraintWidget) (obj));
	//  195  386:aload           9
	//  196  388:astore          7
					else
	//* 197  390:goto            397
						constraintwidget2 = ((ConstraintWidget) (obj1));
	//  198  393:aload           10
	//  199  395:astore          7
			}
			if(constraintwidget2 != null)
	//* 200  397:aload           7
	//* 201  399:ifnull          409
				constraintwidget3 = constraintwidget2;
	//  202  402:aload           7
	//  203  404:astore          8
			else
	//* 204  406:goto            18
				flag = true;
	//  205  409:iconst_1        
	//  206  410:istore_2        
		}
	//* 207  411:goto            18
		mLast = constraintwidget3;
	//  208  414:aload_0         
	//  209  415:aload           8
	//  210  417:putfield        #117 <Field ConstraintWidget mLast>
		if(mOrientation == 0 && mIsRtl)
	//* 211  420:aload_0         
	//* 212  421:getfield        #40  <Field int mOrientation>
	//* 213  424:ifne            445
	//* 214  427:aload_0         
	//* 215  428:getfield        #36  <Field boolean mIsRtl>
	//* 216  431:ifeq            445
			mHead = mLast;
	//  217  434:aload_0         
	//  218  435:aload_0         
	//  219  436:getfield        #117 <Field ConstraintWidget mLast>
	//  220  439:putfield        #119 <Field ConstraintWidget mHead>
		else
	//* 221  442:goto            453
			mHead = mFirst;
	//  222  445:aload_0         
	//  223  446:aload_0         
	//  224  447:getfield        #38  <Field ConstraintWidget mFirst>
	//  225  450:putfield        #119 <Field ConstraintWidget mHead>
		boolean flag1 = flag2;
	//  226  453:iload           6
	//  227  455:istore          5
		if(mHasDefinedWeights)
	//* 228  457:aload_0         
	//* 229  458:getfield        #89  <Field boolean mHasDefinedWeights>
	//* 230  461:ifeq            478
		{
			flag1 = flag2;
	//  231  464:iload           6
	//  232  466:istore          5
			if(mHasUndefinedWeights)
	//* 233  468:aload_0         
	//* 234  469:getfield        #87  <Field boolean mHasUndefinedWeights>
	//* 235  472:ifeq            478
				flag1 = true;
	//  236  475:iconst_1        
	//  237  476:istore          5
		}
		mHasComplexMatchWeights = flag1;
	//  238  478:aload_0         
	//  239  479:iload           5
	//  240  481:putfield        #121 <Field boolean mHasComplexMatchWeights>
	//  241  484:return          
	}

	private static boolean isMatchConstraintEqualityCandidate(ConstraintWidget constraintwidget, int i)
	{
		return constraintwidget.getVisibility() != 8 && constraintwidget.mListDimensionBehaviors[i] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && (constraintwidget.mResolvedMatchConstraintDefault[i] == 0 || constraintwidget.mResolvedMatchConstraintDefault[i] == 3);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #57  <Method int ConstraintWidget.getVisibility()>
	//    2    4:bipush          8
	//    3    6:icmpeq          42
	//    4    9:aload_0         
	//    5   10:getfield        #65  <Field ConstraintWidget$DimensionBehaviour[] ConstraintWidget.mListDimensionBehaviors>
	//    6   13:iload_1         
	//    7   14:aaload          
	//    8   15:getstatic       #71  <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//    9   18:if_acmpne       42
	//   10   21:aload_0         
	//   11   22:getfield        #75  <Field int[] ConstraintWidget.mResolvedMatchConstraintDefault>
	//   12   25:iload_1         
	//   13   26:iaload          
	//   14   27:ifeq            40
	//   15   30:aload_0         
	//   16   31:getfield        #75  <Field int[] ConstraintWidget.mResolvedMatchConstraintDefault>
	//   17   34:iload_1         
	//   18   35:iaload          
	//   19   36:iconst_3        
	//   20   37:icmpne          42
	//   21   40:iconst_1        
	//   22   41:ireturn         
	//   23   42:iconst_0        
	//   24   43:ireturn         
	}

	public void define()
	{
		if(!mDefined)
	//*   0    0:aload_0         
	//*   1    1:getfield        #124 <Field boolean mDefined>
	//*   2    4:ifne            11
			defineChainProperties();
	//    3    7:aload_0         
	//    4    8:invokespecial   #126 <Method void defineChainProperties()>
		mDefined = true;
	//    5   11:aload_0         
	//    6   12:iconst_1        
	//    7   13:putfield        #124 <Field boolean mDefined>
	//    8   16:return          
	}

	public ConstraintWidget getFirst()
	{
		return mFirst;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ConstraintWidget mFirst>
	//    2    4:areturn         
	}

	public ConstraintWidget getFirstMatchConstraintWidget()
	{
		return mFirstMatchConstraintWidget;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field ConstraintWidget mFirstMatchConstraintWidget>
	//    2    4:areturn         
	}

	public ConstraintWidget getFirstVisibleWidget()
	{
		return mFirstVisibleWidget;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field ConstraintWidget mFirstVisibleWidget>
	//    2    4:areturn         
	}

	public ConstraintWidget getHead()
	{
		return mHead;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field ConstraintWidget mHead>
	//    2    4:areturn         
	}

	public ConstraintWidget getLast()
	{
		return mLast;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field ConstraintWidget mLast>
	//    2    4:areturn         
	}

	public ConstraintWidget getLastMatchConstraintWidget()
	{
		return mLastMatchConstraintWidget;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field ConstraintWidget mLastMatchConstraintWidget>
	//    2    4:areturn         
	}

	public ConstraintWidget getLastVisibleWidget()
	{
		return mLastVisibleWidget;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field ConstraintWidget mLastVisibleWidget>
	//    2    4:areturn         
	}

	public float getTotalWeight()
	{
		return mTotalWeight;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field float mTotalWeight>
	//    2    4:freturn         
	}

	private boolean mDefined;
	protected ConstraintWidget mFirst;
	protected ConstraintWidget mFirstMatchConstraintWidget;
	protected ConstraintWidget mFirstVisibleWidget;
	protected boolean mHasComplexMatchWeights;
	protected boolean mHasDefinedWeights;
	protected boolean mHasUndefinedWeights;
	protected ConstraintWidget mHead;
	private boolean mIsRtl;
	protected ConstraintWidget mLast;
	protected ConstraintWidget mLastMatchConstraintWidget;
	protected ConstraintWidget mLastVisibleWidget;
	private int mOrientation;
	protected float mTotalWeight;
	protected ArrayList mWeightedMatchConstraintsWidgets;
	protected int mWidgetsCount;
	protected int mWidgetsMatchCount;
}
