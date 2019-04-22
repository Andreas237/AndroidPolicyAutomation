// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver.widgets;

import android.support.constraint.solver.*;
import java.util.ArrayList;

// Referenced classes of package android.support.constraint.solver.widgets:
//			ConstraintAnchor, ResolutionAnchor, ConstraintWidgetContainer, Optimizer, 
//			ResolutionDimension

public class ConstraintWidget
{
	public static final class DimensionBehaviour extends Enum
	{

		public static DimensionBehaviour valueOf(String s)
		{
			return (DimensionBehaviour)Enum.valueOf(android/support/constraint/solver/widgets/ConstraintWidget$DimensionBehaviour, s);
		//    0    0:ldc1            #2   <Class ConstraintWidget$DimensionBehaviour>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ConstraintWidget$DimensionBehaviour>
		//    4    9:areturn         
		}

		public static DimensionBehaviour[] values()
		{
			return (DimensionBehaviour[])((DimensionBehaviour []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field ConstraintWidget$DimensionBehaviour[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Landroid.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour_3B_.clone()>
		//    2    6:checkcast       #46  <Class ConstraintWidget$DimensionBehaviour[]>
		//    3    9:areturn         
		}

		private static final DimensionBehaviour $VALUES[];
		public static final DimensionBehaviour FIXED;
		public static final DimensionBehaviour MATCH_CONSTRAINT;
		public static final DimensionBehaviour MATCH_PARENT;
		public static final DimensionBehaviour WRAP_CONTENT;

		static 
		{
			FIXED = new DimensionBehaviour("FIXED", 0);
		//    0    0:new             #2   <Class ConstraintWidget$DimensionBehaviour>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "FIXED">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void ConstraintWidget$DimensionBehaviour(String, int)>
		//    5   10:putstatic       #24  <Field ConstraintWidget$DimensionBehaviour FIXED>
			WRAP_CONTENT = new DimensionBehaviour("WRAP_CONTENT", 1);
		//    6   13:new             #2   <Class ConstraintWidget$DimensionBehaviour>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "WRAP_CONTENT">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void ConstraintWidget$DimensionBehaviour(String, int)>
		//   11   23:putstatic       #27  <Field ConstraintWidget$DimensionBehaviour WRAP_CONTENT>
			MATCH_CONSTRAINT = new DimensionBehaviour("MATCH_CONSTRAINT", 2);
		//   12   26:new             #2   <Class ConstraintWidget$DimensionBehaviour>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "MATCH_CONSTRAINT">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void ConstraintWidget$DimensionBehaviour(String, int)>
		//   17   36:putstatic       #30  <Field ConstraintWidget$DimensionBehaviour MATCH_CONSTRAINT>
			MATCH_PARENT = new DimensionBehaviour("MATCH_PARENT", 3);
		//   18   39:new             #2   <Class ConstraintWidget$DimensionBehaviour>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "MATCH_PARENT">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void ConstraintWidget$DimensionBehaviour(String, int)>
		//   23   49:putstatic       #33  <Field ConstraintWidget$DimensionBehaviour MATCH_PARENT>
			$VALUES = (new DimensionBehaviour[] {
				FIXED, WRAP_CONTENT, MATCH_CONSTRAINT, MATCH_PARENT
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       DimensionBehaviour[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field ConstraintWidget$DimensionBehaviour FIXED>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #27  <Field ConstraintWidget$DimensionBehaviour WRAP_CONTENT>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #30  <Field ConstraintWidget$DimensionBehaviour MATCH_CONSTRAINT>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #33  <Field ConstraintWidget$DimensionBehaviour MATCH_PARENT>
		//   41   79:aastore         
		//   42   80:putstatic       #35  <Field ConstraintWidget$DimensionBehaviour[] $VALUES>
		//*  43   83:return          
		}

		private DimensionBehaviour(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public ConstraintWidget()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #98  <Method void Object()>
		mHorizontalResolution = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #100 <Field int mHorizontalResolution>
		mVerticalResolution = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #102 <Field int mVerticalResolution>
		mMatchConstraintDefaultWidth = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #104 <Field int mMatchConstraintDefaultWidth>
		mMatchConstraintDefaultHeight = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #106 <Field int mMatchConstraintDefaultHeight>
		mResolvedMatchConstraintDefault = new int[2];
	//   14   24:aload_0         
	//   15   25:iconst_2        
	//   16   26:newarray        int[]
	//   17   28:putfield        #108 <Field int[] mResolvedMatchConstraintDefault>
		mMatchConstraintMinWidth = 0;
	//   18   31:aload_0         
	//   19   32:iconst_0        
	//   20   33:putfield        #110 <Field int mMatchConstraintMinWidth>
		mMatchConstraintMaxWidth = 0;
	//   21   36:aload_0         
	//   22   37:iconst_0        
	//   23   38:putfield        #112 <Field int mMatchConstraintMaxWidth>
		mMatchConstraintPercentWidth = 1.0F;
	//   24   41:aload_0         
	//   25   42:fconst_1        
	//   26   43:putfield        #114 <Field float mMatchConstraintPercentWidth>
		mMatchConstraintMinHeight = 0;
	//   27   46:aload_0         
	//   28   47:iconst_0        
	//   29   48:putfield        #116 <Field int mMatchConstraintMinHeight>
		mMatchConstraintMaxHeight = 0;
	//   30   51:aload_0         
	//   31   52:iconst_0        
	//   32   53:putfield        #118 <Field int mMatchConstraintMaxHeight>
		mMatchConstraintPercentHeight = 1.0F;
	//   33   56:aload_0         
	//   34   57:fconst_1        
	//   35   58:putfield        #120 <Field float mMatchConstraintPercentHeight>
		mResolvedDimensionRatioSide = -1;
	//   36   61:aload_0         
	//   37   62:iconst_m1       
	//   38   63:putfield        #122 <Field int mResolvedDimensionRatioSide>
		mResolvedDimensionRatio = 1.0F;
	//   39   66:aload_0         
	//   40   67:fconst_1        
	//   41   68:putfield        #124 <Field float mResolvedDimensionRatio>
	//   42   71:aload_0         
	//   43   72:iconst_2        
	//   44   73:newarray        int[]
	//   45   75:dup             
	//   46   76:iconst_0        
	//   47   77:ldc1            #125 <Int 0x7fffffff>
	//   48   79:iastore         
	//   49   80:dup             
	//   50   81:iconst_1        
	//   51   82:ldc1            #125 <Int 0x7fffffff>
	//   52   84:iastore         
	//   53   85:putfield        #127 <Field int[] mMaxDimension>
		mCircleConstraintAngle = 0.0F;
	//   54   88:aload_0         
	//   55   89:fconst_0        
	//   56   90:putfield        #129 <Field float mCircleConstraintAngle>
		mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
	//   57   93:aload_0         
	//   58   94:new             #131 <Class ConstraintAnchor>
	//   59   97:dup             
	//   60   98:aload_0         
	//   61   99:getstatic       #137 <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//   62  102:invokespecial   #140 <Method void ConstraintAnchor(ConstraintWidget, ConstraintAnchor$Type)>
	//   63  105:putfield        #142 <Field ConstraintAnchor mLeft>
		mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
	//   64  108:aload_0         
	//   65  109:new             #131 <Class ConstraintAnchor>
	//   66  112:dup             
	//   67  113:aload_0         
	//   68  114:getstatic       #145 <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//   69  117:invokespecial   #140 <Method void ConstraintAnchor(ConstraintWidget, ConstraintAnchor$Type)>
	//   70  120:putfield        #147 <Field ConstraintAnchor mTop>
		mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
	//   71  123:aload_0         
	//   72  124:new             #131 <Class ConstraintAnchor>
	//   73  127:dup             
	//   74  128:aload_0         
	//   75  129:getstatic       #150 <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//   76  132:invokespecial   #140 <Method void ConstraintAnchor(ConstraintWidget, ConstraintAnchor$Type)>
	//   77  135:putfield        #152 <Field ConstraintAnchor mRight>
		mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
	//   78  138:aload_0         
	//   79  139:new             #131 <Class ConstraintAnchor>
	//   80  142:dup             
	//   81  143:aload_0         
	//   82  144:getstatic       #155 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
	//   83  147:invokespecial   #140 <Method void ConstraintAnchor(ConstraintWidget, ConstraintAnchor$Type)>
	//   84  150:putfield        #157 <Field ConstraintAnchor mBottom>
		mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
	//   85  153:aload_0         
	//   86  154:new             #131 <Class ConstraintAnchor>
	//   87  157:dup             
	//   88  158:aload_0         
	//   89  159:getstatic       #160 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BASELINE>
	//   90  162:invokespecial   #140 <Method void ConstraintAnchor(ConstraintWidget, ConstraintAnchor$Type)>
	//   91  165:putfield        #162 <Field ConstraintAnchor mBaseline>
		mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
	//   92  168:aload_0         
	//   93  169:new             #131 <Class ConstraintAnchor>
	//   94  172:dup             
	//   95  173:aload_0         
	//   96  174:getstatic       #165 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_X>
	//   97  177:invokespecial   #140 <Method void ConstraintAnchor(ConstraintWidget, ConstraintAnchor$Type)>
	//   98  180:putfield        #167 <Field ConstraintAnchor mCenterX>
		mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
	//   99  183:aload_0         
	//  100  184:new             #131 <Class ConstraintAnchor>
	//  101  187:dup             
	//  102  188:aload_0         
	//  103  189:getstatic       #170 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_Y>
	//  104  192:invokespecial   #140 <Method void ConstraintAnchor(ConstraintWidget, ConstraintAnchor$Type)>
	//  105  195:putfield        #172 <Field ConstraintAnchor mCenterY>
		mCenter = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
	//  106  198:aload_0         
	//  107  199:new             #131 <Class ConstraintAnchor>
	//  108  202:dup             
	//  109  203:aload_0         
	//  110  204:getstatic       #175 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER>
	//  111  207:invokespecial   #140 <Method void ConstraintAnchor(ConstraintWidget, ConstraintAnchor$Type)>
	//  112  210:putfield        #177 <Field ConstraintAnchor mCenter>
		mListAnchors = (new ConstraintAnchor[] {
			mLeft, mRight, mTop, mBottom, mBaseline, mCenter
		});
	//  113  213:aload_0         
	//  114  214:bipush          6
	//  115  216:anewarray       ConstraintAnchor[]
	//  116  219:dup             
	//  117  220:iconst_0        
	//  118  221:aload_0         
	//  119  222:getfield        #142 <Field ConstraintAnchor mLeft>
	//  120  225:aastore         
	//  121  226:dup             
	//  122  227:iconst_1        
	//  123  228:aload_0         
	//  124  229:getfield        #152 <Field ConstraintAnchor mRight>
	//  125  232:aastore         
	//  126  233:dup             
	//  127  234:iconst_2        
	//  128  235:aload_0         
	//  129  236:getfield        #147 <Field ConstraintAnchor mTop>
	//  130  239:aastore         
	//  131  240:dup             
	//  132  241:iconst_3        
	//  133  242:aload_0         
	//  134  243:getfield        #157 <Field ConstraintAnchor mBottom>
	//  135  246:aastore         
	//  136  247:dup             
	//  137  248:iconst_4        
	//  138  249:aload_0         
	//  139  250:getfield        #162 <Field ConstraintAnchor mBaseline>
	//  140  253:aastore         
	//  141  254:dup             
	//  142  255:iconst_5        
	//  143  256:aload_0         
	//  144  257:getfield        #177 <Field ConstraintAnchor mCenter>
	//  145  260:aastore         
	//  146  261:putfield        #179 <Field ConstraintAnchor[] mListAnchors>
		mAnchors = new ArrayList();
	//  147  264:aload_0         
	//  148  265:new             #181 <Class ArrayList>
	//  149  268:dup             
	//  150  269:invokespecial   #182 <Method void ArrayList()>
	//  151  272:putfield        #184 <Field ArrayList mAnchors>
		mListDimensionBehaviors = (new DimensionBehaviour[] {
			DimensionBehaviour.FIXED, DimensionBehaviour.FIXED
		});
	//  152  275:aload_0         
	//  153  276:iconst_2        
	//  154  277:anewarray       DimensionBehaviour[]
	//  155  280:dup             
	//  156  281:iconst_0        
	//  157  282:getstatic       #188 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.FIXED>
	//  158  285:aastore         
	//  159  286:dup             
	//  160  287:iconst_1        
	//  161  288:getstatic       #188 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.FIXED>
	//  162  291:aastore         
	//  163  292:putfield        #190 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
		mParent = null;
	//  164  295:aload_0         
	//  165  296:aconst_null     
	//  166  297:putfield        #192 <Field ConstraintWidget mParent>
		mWidth = 0;
	//  167  300:aload_0         
	//  168  301:iconst_0        
	//  169  302:putfield        #194 <Field int mWidth>
		mHeight = 0;
	//  170  305:aload_0         
	//  171  306:iconst_0        
	//  172  307:putfield        #196 <Field int mHeight>
		mDimensionRatio = 0.0F;
	//  173  310:aload_0         
	//  174  311:fconst_0        
	//  175  312:putfield        #198 <Field float mDimensionRatio>
		mDimensionRatioSide = -1;
	//  176  315:aload_0         
	//  177  316:iconst_m1       
	//  178  317:putfield        #200 <Field int mDimensionRatioSide>
		mX = 0;
	//  179  320:aload_0         
	//  180  321:iconst_0        
	//  181  322:putfield        #202 <Field int mX>
		mY = 0;
	//  182  325:aload_0         
	//  183  326:iconst_0        
	//  184  327:putfield        #204 <Field int mY>
		mDrawX = 0;
	//  185  330:aload_0         
	//  186  331:iconst_0        
	//  187  332:putfield        #206 <Field int mDrawX>
		mDrawY = 0;
	//  188  335:aload_0         
	//  189  336:iconst_0        
	//  190  337:putfield        #208 <Field int mDrawY>
		mDrawWidth = 0;
	//  191  340:aload_0         
	//  192  341:iconst_0        
	//  193  342:putfield        #210 <Field int mDrawWidth>
		mDrawHeight = 0;
	//  194  345:aload_0         
	//  195  346:iconst_0        
	//  196  347:putfield        #212 <Field int mDrawHeight>
		mOffsetX = 0;
	//  197  350:aload_0         
	//  198  351:iconst_0        
	//  199  352:putfield        #214 <Field int mOffsetX>
		mOffsetY = 0;
	//  200  355:aload_0         
	//  201  356:iconst_0        
	//  202  357:putfield        #216 <Field int mOffsetY>
		mBaselineDistance = 0;
	//  203  360:aload_0         
	//  204  361:iconst_0        
	//  205  362:putfield        #218 <Field int mBaselineDistance>
		float f = DEFAULT_BIAS;
	//  206  365:getstatic       #220 <Field float DEFAULT_BIAS>
	//  207  368:fstore_1        
		mHorizontalBiasPercent = f;
	//  208  369:aload_0         
	//  209  370:fload_1         
	//  210  371:putfield        #222 <Field float mHorizontalBiasPercent>
		mVerticalBiasPercent = f;
	//  211  374:aload_0         
	//  212  375:fload_1         
	//  213  376:putfield        #224 <Field float mVerticalBiasPercent>
		mContainerItemSkip = 0;
	//  214  379:aload_0         
	//  215  380:iconst_0        
	//  216  381:putfield        #226 <Field int mContainerItemSkip>
		mVisibility = 0;
	//  217  384:aload_0         
	//  218  385:iconst_0        
	//  219  386:putfield        #228 <Field int mVisibility>
		mDebugName = null;
	//  220  389:aload_0         
	//  221  390:aconst_null     
	//  222  391:putfield        #230 <Field String mDebugName>
		mType = null;
	//  223  394:aload_0         
	//  224  395:aconst_null     
	//  225  396:putfield        #232 <Field String mType>
		mHorizontalChainStyle = 0;
	//  226  399:aload_0         
	//  227  400:iconst_0        
	//  228  401:putfield        #234 <Field int mHorizontalChainStyle>
		mVerticalChainStyle = 0;
	//  229  404:aload_0         
	//  230  405:iconst_0        
	//  231  406:putfield        #236 <Field int mVerticalChainStyle>
	//  232  409:aload_0         
	//  233  410:iconst_2        
	//  234  411:newarray        float[]
	//  235  413:dup             
	//  236  414:iconst_0        
	//  237  415:ldc1            #237 <Float -1F>
	//  238  417:fastore         
	//  239  418:dup             
	//  240  419:iconst_1        
	//  241  420:ldc1            #237 <Float -1F>
	//  242  422:fastore         
	//  243  423:putfield        #239 <Field float[] mWeight>
	//  244  426:aload_0         
	//  245  427:iconst_2        
	//  246  428:anewarray       ConstraintWidget[]
	//  247  431:dup             
	//  248  432:iconst_0        
	//  249  433:aconst_null     
	//  250  434:aastore         
	//  251  435:dup             
	//  252  436:iconst_1        
	//  253  437:aconst_null     
	//  254  438:aastore         
	//  255  439:putfield        #241 <Field ConstraintWidget[] mListNextMatchConstraintsWidget>
	//  256  442:aload_0         
	//  257  443:iconst_2        
	//  258  444:anewarray       ConstraintWidget[]
	//  259  447:dup             
	//  260  448:iconst_0        
	//  261  449:aconst_null     
	//  262  450:aastore         
	//  263  451:dup             
	//  264  452:iconst_1        
	//  265  453:aconst_null     
	//  266  454:aastore         
	//  267  455:putfield        #243 <Field ConstraintWidget[] mListNextVisibleWidget>
		mHorizontalNextWidget = null;
	//  268  458:aload_0         
	//  269  459:aconst_null     
	//  270  460:putfield        #245 <Field ConstraintWidget mHorizontalNextWidget>
		mVerticalNextWidget = null;
	//  271  463:aload_0         
	//  272  464:aconst_null     
	//  273  465:putfield        #247 <Field ConstraintWidget mVerticalNextWidget>
		addAnchors();
	//  274  468:aload_0         
	//  275  469:invokespecial   #250 <Method void addAnchors()>
	//  276  472:return          
	}

	private void addAnchors()
	{
		mAnchors.add(((Object) (mLeft)));
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field ArrayList mAnchors>
	//    2    4:aload_0         
	//    3    5:getfield        #142 <Field ConstraintAnchor mLeft>
	//    4    8:invokevirtual   #254 <Method boolean ArrayList.add(Object)>
	//    5   11:pop             
		mAnchors.add(((Object) (mTop)));
	//    6   12:aload_0         
	//    7   13:getfield        #184 <Field ArrayList mAnchors>
	//    8   16:aload_0         
	//    9   17:getfield        #147 <Field ConstraintAnchor mTop>
	//   10   20:invokevirtual   #254 <Method boolean ArrayList.add(Object)>
	//   11   23:pop             
		mAnchors.add(((Object) (mRight)));
	//   12   24:aload_0         
	//   13   25:getfield        #184 <Field ArrayList mAnchors>
	//   14   28:aload_0         
	//   15   29:getfield        #152 <Field ConstraintAnchor mRight>
	//   16   32:invokevirtual   #254 <Method boolean ArrayList.add(Object)>
	//   17   35:pop             
		mAnchors.add(((Object) (mBottom)));
	//   18   36:aload_0         
	//   19   37:getfield        #184 <Field ArrayList mAnchors>
	//   20   40:aload_0         
	//   21   41:getfield        #157 <Field ConstraintAnchor mBottom>
	//   22   44:invokevirtual   #254 <Method boolean ArrayList.add(Object)>
	//   23   47:pop             
		mAnchors.add(((Object) (mCenterX)));
	//   24   48:aload_0         
	//   25   49:getfield        #184 <Field ArrayList mAnchors>
	//   26   52:aload_0         
	//   27   53:getfield        #167 <Field ConstraintAnchor mCenterX>
	//   28   56:invokevirtual   #254 <Method boolean ArrayList.add(Object)>
	//   29   59:pop             
		mAnchors.add(((Object) (mCenterY)));
	//   30   60:aload_0         
	//   31   61:getfield        #184 <Field ArrayList mAnchors>
	//   32   64:aload_0         
	//   33   65:getfield        #172 <Field ConstraintAnchor mCenterY>
	//   34   68:invokevirtual   #254 <Method boolean ArrayList.add(Object)>
	//   35   71:pop             
		mAnchors.add(((Object) (mCenter)));
	//   36   72:aload_0         
	//   37   73:getfield        #184 <Field ArrayList mAnchors>
	//   38   76:aload_0         
	//   39   77:getfield        #177 <Field ConstraintAnchor mCenter>
	//   40   80:invokevirtual   #254 <Method boolean ArrayList.add(Object)>
	//   41   83:pop             
		mAnchors.add(((Object) (mBaseline)));
	//   42   84:aload_0         
	//   43   85:getfield        #184 <Field ArrayList mAnchors>
	//   44   88:aload_0         
	//   45   89:getfield        #162 <Field ConstraintAnchor mBaseline>
	//   46   92:invokevirtual   #254 <Method boolean ArrayList.add(Object)>
	//   47   95:pop             
	//   48   96:return          
	}

	private void applyConstraints(LinearSystem linearsystem, boolean flag, SolverVariable solvervariable, SolverVariable solvervariable1, DimensionBehaviour dimensionbehaviour, boolean flag1, ConstraintAnchor constraintanchor, 
			ConstraintAnchor constraintanchor1, int i, int j, int k, int l, float f, boolean flag2, 
			boolean flag3, int i1, int j1, int k1, float f1, boolean flag4)
	{
		int l1;
		int i2;
		boolean flag5;
		boolean flag6;
		boolean flag7;
		SolverVariable solvervariable2;
		SolverVariable solvervariable3;
		SolverVariable solvervariable5;
		SolverVariable solvervariable6;
label0:
		{
label1:
			{
				solvervariable6 = linearsystem.createObjectVariable(((Object) (constraintanchor)));
	//    0    0:aload_1         
	//    1    1:aload           7
	//    2    3:invokevirtual   #262 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//    3    6:astore          30
				solvervariable2 = linearsystem.createObjectVariable(((Object) (constraintanchor1)));
	//    4    8:aload_1         
	//    5    9:aload           8
	//    6   11:invokevirtual   #262 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//    7   14:astore          26
				solvervariable5 = linearsystem.createObjectVariable(((Object) (constraintanchor.getTarget())));
	//    8   16:aload_1         
	//    9   17:aload           7
	//   10   19:invokevirtual   #266 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//   11   22:invokevirtual   #262 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//   12   25:astore          29
				solvervariable3 = linearsystem.createObjectVariable(((Object) (constraintanchor1.getTarget())));
	//   13   27:aload_1         
	//   14   28:aload           8
	//   15   30:invokevirtual   #266 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//   16   33:invokevirtual   #262 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//   17   36:astore          27
				if(linearsystem.graphOptimizer && constraintanchor.getResolutionNode().state == 1 && constraintanchor1.getResolutionNode().state == 1)
	//*  18   38:aload_1         
	//*  19   39:getfield        #269 <Field boolean LinearSystem.graphOptimizer>
	//*  20   42:ifeq            128
	//*  21   45:aload           7
	//*  22   47:invokevirtual   #273 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//*  23   50:getfield        #278 <Field int ResolutionAnchor.state>
	//*  24   53:iconst_1        
	//*  25   54:icmpne          128
	//*  26   57:aload           8
	//*  27   59:invokevirtual   #273 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//*  28   62:getfield        #278 <Field int ResolutionAnchor.state>
	//*  29   65:iconst_1        
	//*  30   66:icmpne          128
				{
					if(LinearSystem.getMetrics() != null)
	//*  31   69:invokestatic    #282 <Method Metrics LinearSystem.getMetrics()>
	//*  32   72:ifnull          89
					{
						solvervariable = ((SolverVariable) (LinearSystem.getMetrics()));
	//   33   75:invokestatic    #282 <Method Metrics LinearSystem.getMetrics()>
	//   34   78:astore_3        
						solvervariable.resolvedWidgets = ((Metrics) (solvervariable)).resolvedWidgets + 1L;
	//   35   79:aload_3         
	//   36   80:aload_3         
	//   37   81:getfield        #288 <Field long Metrics.resolvedWidgets>
	//   38   84:lconst_1        
	//   39   85:ladd            
	//   40   86:putfield        #288 <Field long Metrics.resolvedWidgets>
					}
					constraintanchor.getResolutionNode().addResolvedValue(linearsystem);
	//   41   89:aload           7
	//   42   91:invokevirtual   #273 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   43   94:aload_1         
	//   44   95:invokevirtual   #292 <Method void ResolutionAnchor.addResolvedValue(LinearSystem)>
					constraintanchor1.getResolutionNode().addResolvedValue(linearsystem);
	//   45   98:aload           8
	//   46  100:invokevirtual   #273 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   47  103:aload_1         
	//   48  104:invokevirtual   #292 <Method void ResolutionAnchor.addResolvedValue(LinearSystem)>
					if(!flag3 && flag)
	//*  49  107:iload           15
	//*  50  109:ifne            127
	//*  51  112:iload_2         
	//*  52  113:ifeq            127
						linearsystem.addGreaterThan(solvervariable1, solvervariable2, 0, 6);
	//   53  116:aload_1         
	//   54  117:aload           4
	//   55  119:aload           26
	//   56  121:iconst_0        
	//   57  122:bipush          6
	//   58  124:invokevirtual   #296 <Method void LinearSystem.addGreaterThan(SolverVariable, SolverVariable, int, int)>
					return;
	//   59  127:return          
				}
				if(LinearSystem.getMetrics() != null)
	//*  60  128:invokestatic    #282 <Method Metrics LinearSystem.getMetrics()>
	//*  61  131:ifnull          154
				{
					Metrics metrics = LinearSystem.getMetrics();
	//   62  134:invokestatic    #282 <Method Metrics LinearSystem.getMetrics()>
	//   63  137:astore          28
					metrics.nonresolvedWidgets = metrics.nonresolvedWidgets + 1L;
	//   64  139:aload           28
	//   65  141:aload           28
	//   66  143:getfield        #299 <Field long Metrics.nonresolvedWidgets>
	//   67  146:lconst_1        
	//   68  147:ladd            
	//   69  148:putfield        #299 <Field long Metrics.nonresolvedWidgets>
				}
	//*  70  151:goto            154
				flag5 = constraintanchor.isConnected();
	//   71  154:aload           7
	//   72  156:invokevirtual   #303 <Method boolean ConstraintAnchor.isConnected()>
	//   73  159:istore          23
				flag6 = constraintanchor1.isConnected();
	//   74  161:aload           8
	//   75  163:invokevirtual   #303 <Method boolean ConstraintAnchor.isConnected()>
	//   76  166:istore          24
				flag7 = mCenter.isConnected();
	//   77  168:aload_0         
	//   78  169:getfield        #177 <Field ConstraintAnchor mCenter>
	//   79  172:invokevirtual   #303 <Method boolean ConstraintAnchor.isConnected()>
	//   80  175:istore          25
				if(flag5)
	//*  81  177:iload           23
	//*  82  179:ifeq            188
					i2 = 1;
	//   83  182:iconst_1        
	//   84  183:istore          22
				else
	//*  85  185:goto            191
					i2 = 0;
	//   86  188:iconst_0        
	//   87  189:istore          22
				l1 = i2;
	//   88  191:iload           22
	//   89  193:istore          21
				if(flag6)
	//*  90  195:iload           24
	//*  91  197:ifeq            206
					l1 = i2 + 1;
	//   92  200:iload           22
	//   93  202:iconst_1        
	//   94  203:iadd            
	//   95  204:istore          21
				i2 = l1;
	//   96  206:iload           21
	//   97  208:istore          22
				if(flag7)
	//*  98  210:iload           25
	//*  99  212:ifeq            221
					i2 = l1 + 1;
	//  100  215:iload           21
	//  101  217:iconst_1        
	//  102  218:iadd            
	//  103  219:istore          22
				if(flag2)
	//* 104  221:iload           14
	//* 105  223:ifeq            232
					l1 = 3;
	//  106  226:iconst_3        
	//  107  227:istore          21
				else
	//* 108  229:goto            236
					l1 = i1;
	//  109  232:iload           16
	//  110  234:istore          21
				static class _cls1
				{

					static final int $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[];
					static final int $SwitchMap$android$support$constraint$solver$widgets$ConstraintWidget$DimensionBehaviour[];

					static 
					{
						$SwitchMap$android$support$constraint$solver$widgets$ConstraintWidget$DimensionBehaviour = new int[DimensionBehaviour.values().length];
					//    0    0:invokestatic    #19  <Method ConstraintWidget$DimensionBehaviour[] ConstraintWidget$DimensionBehaviour.values()>
					//    1    3:arraylength     
					//    2    4:newarray        int[]
					//    3    6:putstatic       #21  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintWidget$DimensionBehaviour>
						try
						{
							$SwitchMap$android$support$constraint$solver$widgets$ConstraintWidget$DimensionBehaviour[DimensionBehaviour.FIXED.ordinal()] = 1;
					//    4    9:getstatic       #21  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintWidget$DimensionBehaviour>
					//    5   12:getstatic       #25  <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.FIXED>
					//    6   15:invokevirtual   #29  <Method int ConstraintWidget$DimensionBehaviour.ordinal()>
					//    7   18:iconst_1        
					//    8   19:iastore         
						}
					//*   9   20:getstatic       #21  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintWidget$DimensionBehaviour>
					//*  10   23:getstatic       #32  <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
					//*  11   26:invokevirtual   #29  <Method int ConstraintWidget$DimensionBehaviour.ordinal()>
					//*  12   29:iconst_2        
					//*  13   30:iastore         
					//*  14   31:getstatic       #21  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintWidget$DimensionBehaviour>
					//*  15   34:getstatic       #35  <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_PARENT>
					//*  16   37:invokevirtual   #29  <Method int ConstraintWidget$DimensionBehaviour.ordinal()>
					//*  17   40:iconst_3        
					//*  18   41:iastore         
					//*  19   42:getstatic       #21  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintWidget$DimensionBehaviour>
					//*  20   45:getstatic       #38  <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
					//*  21   48:invokevirtual   #29  <Method int ConstraintWidget$DimensionBehaviour.ordinal()>
					//*  22   51:iconst_4        
					//*  23   52:iastore         
					//*  24   53:invokestatic    #43  <Method ConstraintAnchor$Type[] ConstraintAnchor$Type.values()>
					//*  25   56:arraylength     
					//*  26   57:newarray        int[]
					//*  27   59:putstatic       #45  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
					//*  28   62:getstatic       #45  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
					//*  29   65:getstatic       #49  <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
					//*  30   68:invokevirtual   #50  <Method int ConstraintAnchor$Type.ordinal()>
					//*  31   71:iconst_1        
					//*  32   72:iastore         
					//*  33   73:getstatic       #45  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
					//*  34   76:getstatic       #53  <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
					//*  35   79:invokevirtual   #50  <Method int ConstraintAnchor$Type.ordinal()>
					//*  36   82:iconst_2        
					//*  37   83:iastore         
					//*  38   84:getstatic       #45  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
					//*  39   87:getstatic       #56  <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
					//*  40   90:invokevirtual   #50  <Method int ConstraintAnchor$Type.ordinal()>
					//*  41   93:iconst_3        
					//*  42   94:iastore         
					//*  43   95:getstatic       #45  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
					//*  44   98:getstatic       #59  <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
					//*  45  101:invokevirtual   #50  <Method int ConstraintAnchor$Type.ordinal()>
					//*  46  104:iconst_4        
					//*  47  105:iastore         
					//*  48  106:getstatic       #45  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
					//*  49  109:getstatic       #62  <Field ConstraintAnchor$Type ConstraintAnchor$Type.BASELINE>
					//*  50  112:invokevirtual   #50  <Method int ConstraintAnchor$Type.ordinal()>
					//*  51  115:iconst_5        
					//*  52  116:iastore         
					//*  53  117:getstatic       #45  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
					//*  54  120:getstatic       #65  <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER>
					//*  55  123:invokevirtual   #50  <Method int ConstraintAnchor$Type.ordinal()>
					//*  56  126:bipush          6
					//*  57  128:iastore         
					//*  58  129:getstatic       #45  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
					//*  59  132:getstatic       #68  <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_X>
					//*  60  135:invokevirtual   #50  <Method int ConstraintAnchor$Type.ordinal()>
					//*  61  138:bipush          7
					//*  62  140:iastore         
					//*  63  141:getstatic       #45  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
					//*  64  144:getstatic       #71  <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_Y>
					//*  65  147:invokevirtual   #50  <Method int ConstraintAnchor$Type.ordinal()>
					//*  66  150:bipush          8
					//*  67  152:iastore         
					//*  68  153:getstatic       #45  <Field int[] $SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
					//*  69  156:getstatic       #74  <Field ConstraintAnchor$Type ConstraintAnchor$Type.NONE>
					//*  70  159:invokevirtual   #50  <Method int ConstraintAnchor$Type.ordinal()>
					//*  71  162:bipush          9
					//*  72  164:iastore         
					//*  73  165:return          
						catch(NoSuchFieldError nosuchfielderror) { }
					//   74  166:astore_0        
						try
						{
							$SwitchMap$android$support$constraint$solver$widgets$ConstraintWidget$DimensionBehaviour[DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
						}
					//*  75  167:goto            20
						catch(NoSuchFieldError nosuchfielderror1) { }
					//   76  170:astore_0        
						try
						{
							$SwitchMap$android$support$constraint$solver$widgets$ConstraintWidget$DimensionBehaviour[DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
						}
					//*  77  171:goto            31
						catch(NoSuchFieldError nosuchfielderror2) { }
					//   78  174:astore_0        
						try
						{
							$SwitchMap$android$support$constraint$solver$widgets$ConstraintWidget$DimensionBehaviour[DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
						}
					//*  79  175:goto            42
						catch(NoSuchFieldError nosuchfielderror3) { }
					//   80  178:astore_0        
						$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type = new int[ConstraintAnchor.Type.values().length];
						try
						{
							$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
						}
					//*  81  179:goto            53
						catch(NoSuchFieldError nosuchfielderror4) { }
					//   82  182:astore_0        
						try
						{
							$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.TOP.ordinal()] = 2;
						}
					//*  83  183:goto            73
						catch(NoSuchFieldError nosuchfielderror5) { }
					//   84  186:astore_0        
						try
						{
							$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.RIGHT.ordinal()] = 3;
						}
					//*  85  187:goto            84
						catch(NoSuchFieldError nosuchfielderror6) { }
					//   86  190:astore_0        
						try
						{
							$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
						}
					//*  87  191:goto            95
						catch(NoSuchFieldError nosuchfielderror7) { }
					//   88  194:astore_0        
						try
						{
							$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
						}
					//*  89  195:goto            106
						catch(NoSuchFieldError nosuchfielderror8) { }
					//   90  198:astore_0        
						try
						{
							$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
						}
					//*  91  199:goto            117
						catch(NoSuchFieldError nosuchfielderror9) { }
					//   92  202:astore_0        
						try
						{
							$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
						}
					//*  93  203:goto            129
						catch(NoSuchFieldError nosuchfielderror10) { }
					//   94  206:astore_0        
						try
						{
							$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
						}
					//*  95  207:goto            141
						catch(NoSuchFieldError nosuchfielderror11) { }
					//   96  210:astore_0        
						try
						{
							$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.NONE.ordinal()] = 9;
						}
					//*  97  211:goto            153
						catch(NoSuchFieldError nosuchfielderror12) { }
					//   98  214:astore_0        
					//*  99  215:return          
					}
				}

				switch(_cls1..SwitchMap.android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour[dimensionbehaviour.ordinal()])
	//* 111  236:getstatic       #306 <Field int[] ConstraintWidget$1.$SwitchMap$android$support$constraint$solver$widgets$ConstraintWidget$DimensionBehaviour>
	//* 112  239:aload           5
	//* 113  241:invokevirtual   #310 <Method int ConstraintWidget$DimensionBehaviour.ordinal()>
	//* 114  244:iaload          
				{
	//* 115  245:tableswitch     1 4: default 276
	//	               1 312
	//	               2 306
	//	               3 300
	//	               4 282
				default:
					i1 = 0;
	//  116  276:iconst_0        
	//  117  277:istore          16
					break;

	//* 118  279:goto            315
				case 4: // '\004'
					if(l1 == 4)
	//* 119  282:iload           21
	//* 120  284:iconst_4        
	//* 121  285:icmpne          294
						i1 = 0;
	//  122  288:iconst_0        
	//  123  289:istore          16
					else
	//* 124  291:goto            315
						i1 = 1;
	//  125  294:iconst_1        
	//  126  295:istore          16
					break;

	//* 127  297:goto            315
				case 3: // '\003'
					i1 = 0;
	//  128  300:iconst_0        
	//  129  301:istore          16
					break;

	//* 130  303:goto            315
				case 2: // '\002'
					i1 = 0;
	//  131  306:iconst_0        
	//  132  307:istore          16
					break;

	//* 133  309:goto            315
				case 1: // '\001'
					i1 = 0;
	//  134  312:iconst_0        
	//  135  313:istore          16
					break;
				}
				if(mVisibility == 8)
	//* 136  315:aload_0         
	//* 137  316:getfield        #228 <Field int mVisibility>
	//* 138  319:bipush          8
	//* 139  321:icmpne          333
				{
					j = 0;
	//  140  324:iconst_0        
	//  141  325:istore          10
					i1 = 0;
	//  142  327:iconst_0        
	//  143  328:istore          16
				}
	//* 144  330:goto            333
				if(flag4)
	//* 145  333:iload           20
	//* 146  335:ifeq            390
					if(!flag5 && !flag6 && !flag7)
	//* 147  338:iload           23
	//* 148  340:ifne            364
	//* 149  343:iload           24
	//* 150  345:ifne            364
	//* 151  348:iload           25
	//* 152  350:ifne            364
						linearsystem.addEquality(solvervariable6, i);
	//  153  353:aload_1         
	//  154  354:aload           30
	//  155  356:iload           9
	//  156  358:invokevirtual   #314 <Method void LinearSystem.addEquality(SolverVariable, int)>
					else
	//* 157  361:goto            390
					if(flag5 && !flag6)
	//* 158  364:iload           23
	//* 159  366:ifeq            390
	//* 160  369:iload           24
	//* 161  371:ifne            390
						linearsystem.addEquality(solvervariable6, solvervariable5, constraintanchor.getMargin(), 6);
	//  162  374:aload_1         
	//  163  375:aload           30
	//  164  377:aload           29
	//  165  379:aload           7
	//  166  381:invokevirtual   #317 <Method int ConstraintAnchor.getMargin()>
	//  167  384:bipush          6
	//  168  386:invokevirtual   #320 <Method ArrayRow LinearSystem.addEquality(SolverVariable, SolverVariable, int, int)>
	//  169  389:pop             
				if(i1 == 0)
	//* 170  390:iload           16
	//* 171  392:ifne            477
				{
					if(flag1)
	//* 172  395:iload           6
	//* 173  397:ifeq            453
					{
						linearsystem.addEquality(solvervariable2, solvervariable6, 0, 3);
	//  174  400:aload_1         
	//  175  401:aload           26
	//  176  403:aload           30
	//  177  405:iconst_0        
	//  178  406:iconst_3        
	//  179  407:invokevirtual   #320 <Method ArrayRow LinearSystem.addEquality(SolverVariable, SolverVariable, int, int)>
	//  180  410:pop             
						if(k > 0)
	//* 181  411:iload           11
	//* 182  413:ifle            431
							linearsystem.addGreaterThan(solvervariable2, solvervariable6, k, 6);
	//  183  416:aload_1         
	//  184  417:aload           26
	//  185  419:aload           30
	//  186  421:iload           11
	//  187  423:bipush          6
	//  188  425:invokevirtual   #296 <Method void LinearSystem.addGreaterThan(SolverVariable, SolverVariable, int, int)>
	//* 189  428:goto            431
						if(l < 0x7fffffff)
	//* 190  431:iload           12
	//* 191  433:ldc1            #125 <Int 0x7fffffff>
	//* 192  435:icmpge          466
							linearsystem.addLowerThan(solvervariable2, solvervariable6, l, 6);
	//  193  438:aload_1         
	//  194  439:aload           26
	//  195  441:aload           30
	//  196  443:iload           12
	//  197  445:bipush          6
	//  198  447:invokevirtual   #323 <Method void LinearSystem.addLowerThan(SolverVariable, SolverVariable, int, int)>
					} else
	//* 199  450:goto            466
					{
						linearsystem.addEquality(solvervariable2, solvervariable6, j, 6);
	//  200  453:aload_1         
	//  201  454:aload           26
	//  202  456:aload           30
	//  203  458:iload           10
	//  204  460:bipush          6
	//  205  462:invokevirtual   #320 <Method ArrayRow LinearSystem.addEquality(SolverVariable, SolverVariable, int, int)>
	//  206  465:pop             
					}
					l = j1;
	//  207  466:iload           17
	//  208  468:istore          12
					j = k1;
	//  209  470:iload           18
	//  210  472:istore          10
					break label0;
	//  211  474:goto            884
				}
				if(j1 == -2)
	//* 212  477:iload           17
	//* 213  479:bipush          -2
	//* 214  481:icmpne          491
					i = j;
	//  215  484:iload           10
	//  216  486:istore          9
				else
	//* 217  488:goto            495
					i = j1;
	//  218  491:iload           17
	//  219  493:istore          9
				l = k1;
	//  220  495:iload           18
	//  221  497:istore          12
				if(k1 == -2)
	//* 222  499:iload           18
	//* 223  501:bipush          -2
	//* 224  503:icmpne          510
					l = j;
	//  225  506:iload           10
	//  226  508:istore          12
				if(i > 0)
	//* 227  510:iload           9
	//* 228  512:ifle            558
				{
					if(flag)
	//* 229  515:iload_2         
	//* 230  516:ifeq            534
						linearsystem.addGreaterThan(solvervariable2, solvervariable6, i, 6);
	//  231  519:aload_1         
	//  232  520:aload           26
	//  233  522:aload           30
	//  234  524:iload           9
	//  235  526:bipush          6
	//  236  528:invokevirtual   #296 <Method void LinearSystem.addGreaterThan(SolverVariable, SolverVariable, int, int)>
					else
	//* 237  531:goto            546
						linearsystem.addGreaterThan(solvervariable2, solvervariable6, i, 6);
	//  238  534:aload_1         
	//  239  535:aload           26
	//  240  537:aload           30
	//  241  539:iload           9
	//  242  541:bipush          6
	//  243  543:invokevirtual   #296 <Method void LinearSystem.addGreaterThan(SolverVariable, SolverVariable, int, int)>
					j = Math.max(j, i);
	//  244  546:iload           10
	//  245  548:iload           9
	//  246  550:invokestatic    #329 <Method int Math.max(int, int)>
	//  247  553:istore          10
				}
	//* 248  555:goto            558
				if(l > 0)
	//* 249  558:iload           12
	//* 250  560:ifle            605
				{
					if(flag)
	//* 251  563:iload_2         
	//* 252  564:ifeq            581
						linearsystem.addLowerThan(solvervariable2, solvervariable6, l, 1);
	//  253  567:aload_1         
	//  254  568:aload           26
	//  255  570:aload           30
	//  256  572:iload           12
	//  257  574:iconst_1        
	//  258  575:invokevirtual   #323 <Method void LinearSystem.addLowerThan(SolverVariable, SolverVariable, int, int)>
					else
	//* 259  578:goto            593
						linearsystem.addLowerThan(solvervariable2, solvervariable6, l, 6);
	//  260  581:aload_1         
	//  261  582:aload           26
	//  262  584:aload           30
	//  263  586:iload           12
	//  264  588:bipush          6
	//  265  590:invokevirtual   #323 <Method void LinearSystem.addLowerThan(SolverVariable, SolverVariable, int, int)>
					k1 = Math.min(j, l);
	//  266  593:iload           10
	//  267  595:iload           12
	//  268  597:invokestatic    #332 <Method int Math.min(int, int)>
	//  269  600:istore          18
				} else
	//* 270  602:goto            609
				{
					k1 = j;
	//  271  605:iload           10
	//  272  607:istore          18
				}
				if(l1 == 1)
	//* 273  609:iload           21
	//* 274  611:iconst_1        
	//* 275  612:icmpne          670
				{
					if(flag)
	//* 276  615:iload_2         
	//* 277  616:ifeq            635
						linearsystem.addEquality(solvervariable2, solvervariable6, k1, 6);
	//  278  619:aload_1         
	//  279  620:aload           26
	//  280  622:aload           30
	//  281  624:iload           18
	//  282  626:bipush          6
	//  283  628:invokevirtual   #320 <Method ArrayRow LinearSystem.addEquality(SolverVariable, SolverVariable, int, int)>
	//  284  631:pop             
					else
	//* 285  632:goto            795
					if(flag3)
	//* 286  635:iload           15
	//* 287  637:ifeq            655
						linearsystem.addEquality(solvervariable2, solvervariable6, k1, 4);
	//  288  640:aload_1         
	//  289  641:aload           26
	//  290  643:aload           30
	//  291  645:iload           18
	//  292  647:iconst_4        
	//  293  648:invokevirtual   #320 <Method ArrayRow LinearSystem.addEquality(SolverVariable, SolverVariable, int, int)>
	//  294  651:pop             
					else
	//* 295  652:goto            795
						linearsystem.addEquality(solvervariable2, solvervariable6, k1, 1);
	//  296  655:aload_1         
	//  297  656:aload           26
	//  298  658:aload           30
	//  299  660:iload           18
	//  300  662:iconst_1        
	//  301  663:invokevirtual   #320 <Method ArrayRow LinearSystem.addEquality(SolverVariable, SolverVariable, int, int)>
	//  302  666:pop             
				} else
	//* 303  667:goto            795
				if(l1 == 2)
	//* 304  670:iload           21
	//* 305  672:iconst_2        
	//* 306  673:icmpne          795
				{
					SolverVariable solvervariable4;
					if(constraintanchor.getType() != ConstraintAnchor.Type.TOP && constraintanchor.getType() != ConstraintAnchor.Type.BOTTOM)
	//* 307  676:aload           7
	//* 308  678:invokevirtual   #336 <Method ConstraintAnchor$Type ConstraintAnchor.getType()>
	//* 309  681:getstatic       #145 <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//* 310  684:if_acmpeq       736
	//* 311  687:aload           7
	//* 312  689:invokevirtual   #336 <Method ConstraintAnchor$Type ConstraintAnchor.getType()>
	//* 313  692:getstatic       #155 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
	//* 314  695:if_acmpne       701
	//* 315  698:goto            736
					{
						dimensionbehaviour = ((DimensionBehaviour) (linearsystem.createObjectVariable(((Object) (mParent.getAnchor(ConstraintAnchor.Type.LEFT))))));
	//  316  701:aload_1         
	//  317  702:aload_0         
	//  318  703:getfield        #192 <Field ConstraintWidget mParent>
	//  319  706:getstatic       #137 <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//  320  709:invokevirtual   #340 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//  321  712:invokevirtual   #262 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//  322  715:astore          5
						solvervariable4 = linearsystem.createObjectVariable(((Object) (mParent.getAnchor(ConstraintAnchor.Type.RIGHT))));
	//  323  717:aload_1         
	//  324  718:aload_0         
	//  325  719:getfield        #192 <Field ConstraintWidget mParent>
	//  326  722:getstatic       #150 <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//  327  725:invokevirtual   #340 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//  328  728:invokevirtual   #262 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//  329  731:astore          28
					} else
	//* 330  733:goto            768
					{
						dimensionbehaviour = ((DimensionBehaviour) (linearsystem.createObjectVariable(((Object) (mParent.getAnchor(ConstraintAnchor.Type.TOP))))));
	//  331  736:aload_1         
	//  332  737:aload_0         
	//  333  738:getfield        #192 <Field ConstraintWidget mParent>
	//  334  741:getstatic       #145 <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//  335  744:invokevirtual   #340 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//  336  747:invokevirtual   #262 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//  337  750:astore          5
						solvervariable4 = linearsystem.createObjectVariable(((Object) (mParent.getAnchor(ConstraintAnchor.Type.BOTTOM))));
	//  338  752:aload_1         
	//  339  753:aload_0         
	//  340  754:getfield        #192 <Field ConstraintWidget mParent>
	//  341  757:getstatic       #155 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
	//  342  760:invokevirtual   #340 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//  343  763:invokevirtual   #262 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//  344  766:astore          28
					}
					linearsystem.addConstraint(linearsystem.createRow().createRowDimensionRatio(solvervariable2, solvervariable6, solvervariable4, ((SolverVariable) (dimensionbehaviour)), f1));
	//  345  768:aload_1         
	//  346  769:aload_1         
	//  347  770:invokevirtual   #344 <Method ArrayRow LinearSystem.createRow()>
	//  348  773:aload           26
	//  349  775:aload           30
	//  350  777:aload           28
	//  351  779:aload           5
	//  352  781:fload           19
	//  353  783:invokevirtual   #350 <Method ArrayRow ArrayRow.createRowDimensionRatio(SolverVariable, SolverVariable, SolverVariable, SolverVariable, float)>
	//  354  786:invokevirtual   #354 <Method void LinearSystem.addConstraint(ArrayRow)>
					j = 0;
	//  355  789:iconst_0        
	//  356  790:istore          10
					break label1;
	//  357  792:goto            799
				}
				j = i1;
	//  358  795:iload           16
	//  359  797:istore          10
			}
			j1 = l;
	//  360  799:iload           12
	//  361  801:istore          17
			if(j != 0 && i2 != 2 && !flag2)
	//* 362  803:iload           10
	//* 363  805:ifeq            872
	//* 364  808:iload           22
	//* 365  810:iconst_2        
	//* 366  811:icmpeq          872
	//* 367  814:iload           14
	//* 368  816:ifne            872
			{
				j = Math.max(i, k1);
	//  369  819:iload           9
	//  370  821:iload           18
	//  371  823:invokestatic    #329 <Method int Math.max(int, int)>
	//  372  826:istore          10
				if(j1 > 0)
	//* 373  828:iload           17
	//* 374  830:ifle            845
					j = Math.min(j1, j);
	//  375  833:iload           17
	//  376  835:iload           10
	//  377  837:invokestatic    #332 <Method int Math.min(int, int)>
	//  378  840:istore          10
	//* 379  842:goto            845
				linearsystem.addEquality(solvervariable2, solvervariable6, j, 6);
	//  380  845:aload_1         
	//  381  846:aload           26
	//  382  848:aload           30
	//  383  850:iload           10
	//  384  852:bipush          6
	//  385  854:invokevirtual   #320 <Method ArrayRow LinearSystem.addEquality(SolverVariable, SolverVariable, int, int)>
	//  386  857:pop             
				i1 = 0;
	//  387  858:iconst_0        
	//  388  859:istore          16
				j = j1;
	//  389  861:iload           17
	//  390  863:istore          10
				l = i;
	//  391  865:iload           9
	//  392  867:istore          12
			} else
	//* 393  869:goto            884
			{
				i1 = j;
	//  394  872:iload           10
	//  395  874:istore          16
				l = i;
	//  396  876:iload           9
	//  397  878:istore          12
				j = j1;
	//  398  880:iload           17
	//  399  882:istore          10
			}
		}
		dimensionbehaviour = ((DimensionBehaviour) (solvervariable5));
	//  400  884:aload           29
	//  401  886:astore          5
		if(flag4 && !flag3)
	//* 402  888:iload           20
	//* 403  890:ifeq            1441
	//* 404  893:iload           15
	//* 405  895:ifeq            901
	//* 406  898:goto            1441
		{
			if(!flag5 && !flag6 && !flag7)
	//* 407  901:iload           23
	//* 408  903:ifne            942
	//* 409  906:iload           24
	//* 410  908:ifne            942
	//* 411  911:iload           25
	//* 412  913:ifne            942
			{
				if(flag)
	//* 413  916:iload_2         
	//* 414  917:ifeq            936
				{
					linearsystem.addGreaterThan(solvervariable1, solvervariable2, 0, 5);
	//  415  920:aload_1         
	//  416  921:aload           4
	//  417  923:aload           26
	//  418  925:iconst_0        
	//  419  926:iconst_5        
	//  420  927:invokevirtual   #296 <Method void LinearSystem.addGreaterThan(SolverVariable, SolverVariable, int, int)>
					solvervariable = solvervariable2;
	//  421  930:aload           26
	//  422  932:astore_3        
				} else
	//* 423  933:goto            1426
				{
					solvervariable = solvervariable2;
	//  424  936:aload           26
	//  425  938:astore_3        
				}
			} else
	//* 426  939:goto            1426
			if(flag5 && !flag6)
	//* 427  942:iload           23
	//* 428  944:ifeq            978
	//* 429  947:iload           24
	//* 430  949:ifne            978
			{
				if(flag)
	//* 431  952:iload_2         
	//* 432  953:ifeq            972
				{
					linearsystem.addGreaterThan(solvervariable1, solvervariable2, 0, 5);
	//  433  956:aload_1         
	//  434  957:aload           4
	//  435  959:aload           26
	//  436  961:iconst_0        
	//  437  962:iconst_5        
	//  438  963:invokevirtual   #296 <Method void LinearSystem.addGreaterThan(SolverVariable, SolverVariable, int, int)>
					solvervariable = solvervariable2;
	//  439  966:aload           26
	//  440  968:astore_3        
				} else
	//* 441  969:goto            1426
				{
					solvervariable = solvervariable2;
	//  442  972:aload           26
	//  443  974:astore_3        
				}
			} else
	//* 444  975:goto            1426
			if(!flag5 && flag6)
	//* 445  978:iload           23
	//* 446  980:ifne            1030
	//* 447  983:iload           24
	//* 448  985:ifeq            1030
			{
				linearsystem.addEquality(solvervariable2, solvervariable3, -constraintanchor1.getMargin(), 6);
	//  449  988:aload_1         
	//  450  989:aload           26
	//  451  991:aload           27
	//  452  993:aload           8
	//  453  995:invokevirtual   #317 <Method int ConstraintAnchor.getMargin()>
	//  454  998:ineg            
	//  455  999:bipush          6
	//  456 1001:invokevirtual   #320 <Method ArrayRow LinearSystem.addEquality(SolverVariable, SolverVariable, int, int)>
	//  457 1004:pop             
				if(flag)
	//* 458 1005:iload_2         
	//* 459 1006:ifeq            1024
				{
					linearsystem.addGreaterThan(solvervariable6, solvervariable, 0, 5);
	//  460 1009:aload_1         
	//  461 1010:aload           30
	//  462 1012:aload_3         
	//  463 1013:iconst_0        
	//  464 1014:iconst_5        
	//  465 1015:invokevirtual   #296 <Method void LinearSystem.addGreaterThan(SolverVariable, SolverVariable, int, int)>
					solvervariable = solvervariable2;
	//  466 1018:aload           26
	//  467 1020:astore_3        
				} else
	//* 468 1021:goto            1426
				{
					solvervariable = solvervariable2;
	//  469 1024:aload           26
	//  470 1026:astore_3        
				}
			} else
	//* 471 1027:goto            1426
			if(flag5 && flag6)
	//* 472 1030:iload           23
	//* 473 1032:ifeq            1423
	//* 474 1035:iload           24
	//* 475 1037:ifeq            1423
			{
				if(i1 != 0)
	//* 476 1040:iload           16
	//* 477 1042:ifeq            1282
				{
					if(flag && k == 0)
	//* 478 1045:iload_2         
	//* 479 1046:ifeq            1068
	//* 480 1049:iload           11
	//* 481 1051:ifne            1068
						linearsystem.addGreaterThan(solvervariable2, solvervariable6, 0, 6);
	//  482 1054:aload_1         
	//  483 1055:aload           26
	//  484 1057:aload           30
	//  485 1059:iconst_0        
	//  486 1060:bipush          6
	//  487 1062:invokevirtual   #296 <Method void LinearSystem.addGreaterThan(SolverVariable, SolverVariable, int, int)>
	//* 488 1065:goto            1068
					if(l1 == 0)
	//* 489 1068:iload           21
	//* 490 1070:ifne            1175
					{
						if(j <= 0 && l <= 0)
	//* 491 1073:iload           10
	//* 492 1075:ifgt            1096
	//* 493 1078:iload           12
	//* 494 1080:ifle            1086
	//* 495 1083:goto            1096
						{
							k = 6;
	//  496 1086:bipush          6
	//  497 1088:istore          11
							i = 0;
	//  498 1090:iconst_0        
	//  499 1091:istore          9
						} else
	//* 500 1093:goto            1102
						{
							k = 4;
	//  501 1096:iconst_4        
	//  502 1097:istore          11
							i = 1;
	//  503 1099:iconst_1        
	//  504 1100:istore          9
						}
						linearsystem.addEquality(solvervariable6, ((SolverVariable) (dimensionbehaviour)), constraintanchor.getMargin(), k);
	//  505 1102:aload_1         
	//  506 1103:aload           30
	//  507 1105:aload           5
	//  508 1107:aload           7
	//  509 1109:invokevirtual   #317 <Method int ConstraintAnchor.getMargin()>
	//  510 1112:iload           11
	//  511 1114:invokevirtual   #320 <Method ArrayRow LinearSystem.addEquality(SolverVariable, SolverVariable, int, int)>
	//  512 1117:pop             
						linearsystem.addEquality(solvervariable2, solvervariable3, -constraintanchor1.getMargin(), k);
	//  513 1118:aload_1         
	//  514 1119:aload           26
	//  515 1121:aload           27
	//  516 1123:aload           8
	//  517 1125:invokevirtual   #317 <Method int ConstraintAnchor.getMargin()>
	//  518 1128:ineg            
	//  519 1129:iload           11
	//  520 1131:invokevirtual   #320 <Method ArrayRow LinearSystem.addEquality(SolverVariable, SolverVariable, int, int)>
	//  521 1134:pop             
						if(j <= 0 && l <= 0)
	//* 522 1135:iload           10
	//* 523 1137:ifgt            1154
	//* 524 1140:iload           12
	//* 525 1142:ifle            1148
	//* 526 1145:goto            1154
							j = 0;
	//  527 1148:iconst_0        
	//  528 1149:istore          10
						else
	//* 529 1151:goto            1157
							j = 1;
	//  530 1154:iconst_1        
	//  531 1155:istore          10
						l = i;
	//  532 1157:iload           9
	//  533 1159:istore          12
						i = 5;
	//  534 1161:iconst_5        
	//  535 1162:istore          9
						k = j;
	//  536 1164:iload           10
	//  537 1166:istore          11
						j = l;
	//  538 1168:iload           12
	//  539 1170:istore          10
					} else
	//* 540 1172:goto            1324
					{
						k = 1;
	//  541 1175:iconst_1        
	//  542 1176:istore          11
						if(l1 == 1)
	//* 543 1178:iload           21
	//* 544 1180:iconst_1        
	//* 545 1181:icmpne          1194
						{
							i = 6;
	//  546 1184:bipush          6
	//  547 1186:istore          9
							j = 1;
	//  548 1188:iconst_1        
	//  549 1189:istore          10
						} else
	//* 550 1191:goto            1324
						if(l1 == 3)
	//* 551 1194:iload           21
	//* 552 1196:iconst_3        
	//* 553 1197:icmpne          1270
						{
							if(!flag2 && mResolvedDimensionRatioSide != -1 && j <= 0)
	//* 554 1200:iload           14
	//* 555 1202:ifne            1225
	//* 556 1205:aload_0         
	//* 557 1206:getfield        #122 <Field int mResolvedDimensionRatioSide>
	//* 558 1209:iconst_m1       
	//* 559 1210:icmpeq          1225
	//* 560 1213:iload           10
	//* 561 1215:ifgt            1225
								i = 6;
	//  562 1218:bipush          6
	//  563 1220:istore          9
							else
	//* 564 1222:goto            1228
								i = 4;
	//  565 1225:iconst_4        
	//  566 1226:istore          9
							linearsystem.addEquality(solvervariable6, ((SolverVariable) (dimensionbehaviour)), constraintanchor.getMargin(), i);
	//  567 1228:aload_1         
	//  568 1229:aload           30
	//  569 1231:aload           5
	//  570 1233:aload           7
	//  571 1235:invokevirtual   #317 <Method int ConstraintAnchor.getMargin()>
	//  572 1238:iload           9
	//  573 1240:invokevirtual   #320 <Method ArrayRow LinearSystem.addEquality(SolverVariable, SolverVariable, int, int)>
	//  574 1243:pop             
							linearsystem.addEquality(solvervariable2, solvervariable3, -constraintanchor1.getMargin(), i);
	//  575 1244:aload_1         
	//  576 1245:aload           26
	//  577 1247:aload           27
	//  578 1249:aload           8
	//  579 1251:invokevirtual   #317 <Method int ConstraintAnchor.getMargin()>
	//  580 1254:ineg            
	//  581 1255:iload           9
	//  582 1257:invokevirtual   #320 <Method ArrayRow LinearSystem.addEquality(SolverVariable, SolverVariable, int, int)>
	//  583 1260:pop             
							i = 5;
	//  584 1261:iconst_5        
	//  585 1262:istore          9
							j = 1;
	//  586 1264:iconst_1        
	//  587 1265:istore          10
						} else
	//* 588 1267:goto            1324
						{
							i = 5;
	//  589 1270:iconst_5        
	//  590 1271:istore          9
							k = 0;
	//  591 1273:iconst_0        
	//  592 1274:istore          11
							j = 0;
	//  593 1276:iconst_0        
	//  594 1277:istore          10
						}
					}
				} else
	//* 595 1279:goto            1324
				{
					k = 1;
	//  596 1282:iconst_1        
	//  597 1283:istore          11
					if(flag)
	//* 598 1285:iload_2         
	//* 599 1286:ifeq            1318
					{
						linearsystem.addGreaterThan(solvervariable6, ((SolverVariable) (dimensionbehaviour)), constraintanchor.getMargin(), 5);
	//  600 1289:aload_1         
	//  601 1290:aload           30
	//  602 1292:aload           5
	//  603 1294:aload           7
	//  604 1296:invokevirtual   #317 <Method int ConstraintAnchor.getMargin()>
	//  605 1299:iconst_5        
	//  606 1300:invokevirtual   #296 <Method void LinearSystem.addGreaterThan(SolverVariable, SolverVariable, int, int)>
						linearsystem.addLowerThan(solvervariable2, solvervariable3, -constraintanchor1.getMargin(), 5);
	//  607 1303:aload_1         
	//  608 1304:aload           26
	//  609 1306:aload           27
	//  610 1308:aload           8
	//  611 1310:invokevirtual   #317 <Method int ConstraintAnchor.getMargin()>
	//  612 1313:ineg            
	//  613 1314:iconst_5        
	//  614 1315:invokevirtual   #323 <Method void LinearSystem.addLowerThan(SolverVariable, SolverVariable, int, int)>
					}
					i = 5;
	//  615 1318:iconst_5        
	//  616 1319:istore          9
					j = 0;
	//  617 1321:iconst_0        
	//  618 1322:istore          10
				}
				if(k != 0)
	//* 619 1324:iload           11
	//* 620 1326:ifeq            1358
					linearsystem.addCentering(solvervariable6, ((SolverVariable) (dimensionbehaviour)), constraintanchor.getMargin(), f, solvervariable3, solvervariable2, constraintanchor1.getMargin(), i);
	//  621 1329:aload_1         
	//  622 1330:aload           30
	//  623 1332:aload           5
	//  624 1334:aload           7
	//  625 1336:invokevirtual   #317 <Method int ConstraintAnchor.getMargin()>
	//  626 1339:fload           13
	//  627 1341:aload           27
	//  628 1343:aload           26
	//  629 1345:aload           8
	//  630 1347:invokevirtual   #317 <Method int ConstraintAnchor.getMargin()>
	//  631 1350:iload           9
	//  632 1352:invokevirtual   #358 <Method void LinearSystem.addCentering(SolverVariable, SolverVariable, int, float, SolverVariable, SolverVariable, int, int)>
	//* 633 1355:goto            1358
				if(j != 0)
	//* 634 1358:iload           10
	//* 635 1360:ifeq            1397
				{
					linearsystem.addGreaterThan(solvervariable6, ((SolverVariable) (dimensionbehaviour)), constraintanchor.getMargin(), 6);
	//  636 1363:aload_1         
	//  637 1364:aload           30
	//  638 1366:aload           5
	//  639 1368:aload           7
	//  640 1370:invokevirtual   #317 <Method int ConstraintAnchor.getMargin()>
	//  641 1373:bipush          6
	//  642 1375:invokevirtual   #296 <Method void LinearSystem.addGreaterThan(SolverVariable, SolverVariable, int, int)>
					linearsystem.addLowerThan(solvervariable2, solvervariable3, -constraintanchor1.getMargin(), 6);
	//  643 1378:aload_1         
	//  644 1379:aload           26
	//  645 1381:aload           27
	//  646 1383:aload           8
	//  647 1385:invokevirtual   #317 <Method int ConstraintAnchor.getMargin()>
	//  648 1388:ineg            
	//  649 1389:bipush          6
	//  650 1391:invokevirtual   #323 <Method void LinearSystem.addLowerThan(SolverVariable, SolverVariable, int, int)>
				}
	//* 651 1394:goto            1397
				if(flag)
	//* 652 1397:iload_2         
	//* 653 1398:ifeq            1417
				{
					linearsystem.addGreaterThan(solvervariable6, solvervariable, 0, 6);
	//  654 1401:aload_1         
	//  655 1402:aload           30
	//  656 1404:aload_3         
	//  657 1405:iconst_0        
	//  658 1406:bipush          6
	//  659 1408:invokevirtual   #296 <Method void LinearSystem.addGreaterThan(SolverVariable, SolverVariable, int, int)>
					solvervariable = solvervariable2;
	//  660 1411:aload           26
	//  661 1413:astore_3        
				} else
	//* 662 1414:goto            1426
				{
					solvervariable = solvervariable2;
	//  663 1417:aload           26
	//  664 1419:astore_3        
				}
			} else
	//* 665 1420:goto            1426
			{
				solvervariable = solvervariable2;
	//  666 1423:aload           26
	//  667 1425:astore_3        
			}
			if(flag)
	//* 668 1426:iload_2         
	//* 669 1427:ifeq            1440
				linearsystem.addGreaterThan(solvervariable1, solvervariable, 0, 6);
	//  670 1430:aload_1         
	//  671 1431:aload           4
	//  672 1433:aload_3         
	//  673 1434:iconst_0        
	//  674 1435:bipush          6
	//  675 1437:invokevirtual   #296 <Method void LinearSystem.addGreaterThan(SolverVariable, SolverVariable, int, int)>
			return;
	//  676 1440:return          
		}
		if(i2 < 2 && flag)
	//* 677 1441:iload           22
	//* 678 1443:iconst_2        
	//* 679 1444:icmpge          1472
	//* 680 1447:iload_2         
	//* 681 1448:ifeq            1472
		{
			linearsystem.addGreaterThan(solvervariable6, solvervariable, 0, 6);
	//  682 1451:aload_1         
	//  683 1452:aload           30
	//  684 1454:aload_3         
	//  685 1455:iconst_0        
	//  686 1456:bipush          6
	//  687 1458:invokevirtual   #296 <Method void LinearSystem.addGreaterThan(SolverVariable, SolverVariable, int, int)>
			linearsystem.addGreaterThan(solvervariable1, solvervariable2, 0, 6);
	//  688 1461:aload_1         
	//  689 1462:aload           4
	//  690 1464:aload           26
	//  691 1466:iconst_0        
	//  692 1467:bipush          6
	//  693 1469:invokevirtual   #296 <Method void LinearSystem.addGreaterThan(SolverVariable, SolverVariable, int, int)>
		}
	//  694 1472:return          
	}

	public void addToSolver(LinearSystem linearsystem)
	{
		int i;
		int k;
		int l;
		int i1;
		int j1;
		boolean flag1;
		boolean flag2;
		boolean flag3;
		boolean flag4;
		Object obj;
		SolverVariable solvervariable;
		SolverVariable solvervariable1;
		Object obj4;
		SolverVariable solvervariable2;
label0:
		{
			solvervariable2 = linearsystem.createObjectVariable(((Object) (mLeft)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #142 <Field ConstraintAnchor mLeft>
	//    3    5:invokevirtual   #262 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//    4    8:astore          24
			solvervariable1 = linearsystem.createObjectVariable(((Object) (mRight)));
	//    5   10:aload_1         
	//    6   11:aload_0         
	//    7   12:getfield        #152 <Field ConstraintAnchor mRight>
	//    8   15:invokevirtual   #262 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//    9   18:astore          21
			obj4 = ((Object) (linearsystem.createObjectVariable(((Object) (mTop)))));
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #147 <Field ConstraintAnchor mTop>
	//   13   25:invokevirtual   #262 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//   14   28:astore          22
			solvervariable = linearsystem.createObjectVariable(((Object) (mBottom)));
	//   15   30:aload_1         
	//   16   31:aload_0         
	//   17   32:getfield        #157 <Field ConstraintAnchor mBottom>
	//   18   35:invokevirtual   #262 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//   19   38:astore          20
			obj = ((Object) (linearsystem.createObjectVariable(((Object) (mBaseline)))));
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #162 <Field ConstraintAnchor mBaseline>
	//   23   45:invokevirtual   #262 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//   24   48:astore          17
			ConstraintWidget constraintwidget = mParent;
	//   25   50:aload_0         
	//   26   51:getfield        #192 <Field ConstraintWidget mParent>
	//   27   54:astore          18
			if(constraintwidget != null)
	//*  28   56:aload           18
	//*  29   58:ifnull          519
			{
				if(constraintwidget != null && constraintwidget.mListDimensionBehaviors[0] == DimensionBehaviour.WRAP_CONTENT)
	//*  30   61:aload           18
	//*  31   63:ifnull          85
	//*  32   66:aload           18
	//*  33   68:getfield        #190 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//*  34   71:iconst_0        
	//*  35   72:aaload          
	//*  36   73:getstatic       #362 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//*  37   76:if_acmpne       85
					flag1 = true;
	//   38   79:iconst_1        
	//   39   80:istore          10
				else
	//*  40   82:goto            88
					flag1 = false;
	//   41   85:iconst_0        
	//   42   86:istore          10
				constraintwidget = mParent;
	//   43   88:aload_0         
	//   44   89:getfield        #192 <Field ConstraintWidget mParent>
	//   45   92:astore          18
				if(constraintwidget != null && constraintwidget.mListDimensionBehaviors[1] == DimensionBehaviour.WRAP_CONTENT)
	//*  46   94:aload           18
	//*  47   96:ifnull          118
	//*  48   99:aload           18
	//*  49  101:getfield        #190 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//*  50  104:iconst_1        
	//*  51  105:aaload          
	//*  52  106:getstatic       #362 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//*  53  109:if_acmpne       118
					flag2 = true;
	//   54  112:iconst_1        
	//   55  113:istore          11
				else
	//*  56  115:goto            121
					flag2 = false;
	//   57  118:iconst_0        
	//   58  119:istore          11
				if(mLeft.mTarget != null && mLeft.mTarget.mTarget != mLeft && mRight.mTarget != null && mRight.mTarget.mTarget == mRight)
	//*  59  121:aload_0         
	//*  60  122:getfield        #142 <Field ConstraintAnchor mLeft>
	//*  61  125:getfield        #365 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//*  62  128:ifnull          187
	//*  63  131:aload_0         
	//*  64  132:getfield        #142 <Field ConstraintAnchor mLeft>
	//*  65  135:getfield        #365 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//*  66  138:getfield        #365 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//*  67  141:aload_0         
	//*  68  142:getfield        #142 <Field ConstraintAnchor mLeft>
	//*  69  145:if_acmpeq       187
	//*  70  148:aload_0         
	//*  71  149:getfield        #152 <Field ConstraintAnchor mRight>
	//*  72  152:getfield        #365 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//*  73  155:ifnull          187
	//*  74  158:aload_0         
	//*  75  159:getfield        #152 <Field ConstraintAnchor mRight>
	//*  76  162:getfield        #365 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//*  77  165:getfield        #365 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//*  78  168:aload_0         
	//*  79  169:getfield        #152 <Field ConstraintAnchor mRight>
	//*  80  172:if_acmpne       187
					((ConstraintWidgetContainer)mParent).addChain(this, 0);
	//   81  175:aload_0         
	//   82  176:getfield        #192 <Field ConstraintWidget mParent>
	//   83  179:checkcast       #367 <Class ConstraintWidgetContainer>
	//   84  182:aload_0         
	//   85  183:iconst_0        
	//   86  184:invokevirtual   #371 <Method void ConstraintWidgetContainer.addChain(ConstraintWidget, int)>
				if(mLeft.mTarget != null && mLeft.mTarget.mTarget == mLeft || mRight.mTarget != null && mRight.mTarget.mTarget == mRight)
	//*  87  187:aload_0         
	//*  88  188:getfield        #142 <Field ConstraintAnchor mLeft>
	//*  89  191:getfield        #365 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//*  90  194:ifnull          214
	//*  91  197:aload_0         
	//*  92  198:getfield        #142 <Field ConstraintAnchor mLeft>
	//*  93  201:getfield        #365 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//*  94  204:getfield        #365 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//*  95  207:aload_0         
	//*  96  208:getfield        #142 <Field ConstraintAnchor mLeft>
	//*  97  211:if_acmpeq       241
	//*  98  214:aload_0         
	//*  99  215:getfield        #152 <Field ConstraintAnchor mRight>
	//* 100  218:getfield        #365 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 101  221:ifnull          247
	//* 102  224:aload_0         
	//* 103  225:getfield        #152 <Field ConstraintAnchor mRight>
	//* 104  228:getfield        #365 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 105  231:getfield        #365 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 106  234:aload_0         
	//* 107  235:getfield        #152 <Field ConstraintAnchor mRight>
	//* 108  238:if_acmpne       247
					flag3 = true;
	//  109  241:iconst_1        
	//  110  242:istore          12
				else
	//* 111  244:goto            250
					flag3 = false;
	//  112  247:iconst_0        
	//  113  248:istore          12
				if(mTop.mTarget != null && mTop.mTarget.mTarget != mTop && mBottom.mTarget != null && mBottom.mTarget.mTarget == mBottom)
	//* 114  250:aload_0         
	//* 115  251:getfield        #147 <Field ConstraintAnchor mTop>
	//* 116  254:getfield        #365 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 117  257:ifnull          316
	//* 118  260:aload_0         
	//* 119  261:getfield        #147 <Field ConstraintAnchor mTop>
	//* 120  264:getfield        #365 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 121  267:getfield        #365 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 122  270:aload_0         
	//* 123  271:getfield        #147 <Field ConstraintAnchor mTop>
	//* 124  274:if_acmpeq       316
	//* 125  277:aload_0         
	//* 126  278:getfield        #157 <Field ConstraintAnchor mBottom>
	//* 127  281:getfield        #365 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 128  284:ifnull          316
	//* 129  287:aload_0         
	//* 130  288:getfield        #157 <Field ConstraintAnchor mBottom>
	//* 131  291:getfield        #365 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 132  294:getfield        #365 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 133  297:aload_0         
	//* 134  298:getfield        #157 <Field ConstraintAnchor mBottom>
	//* 135  301:if_acmpne       316
					((ConstraintWidgetContainer)mParent).addChain(this, 1);
	//  136  304:aload_0         
	//  137  305:getfield        #192 <Field ConstraintWidget mParent>
	//  138  308:checkcast       #367 <Class ConstraintWidgetContainer>
	//  139  311:aload_0         
	//  140  312:iconst_1        
	//  141  313:invokevirtual   #371 <Method void ConstraintWidgetContainer.addChain(ConstraintWidget, int)>
				if(mTop.mTarget != null && mTop.mTarget.mTarget == mTop || mBottom.mTarget != null && mBottom.mTarget.mTarget == mBottom)
	//* 142  316:aload_0         
	//* 143  317:getfield        #147 <Field ConstraintAnchor mTop>
	//* 144  320:getfield        #365 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 145  323:ifnull          343
	//* 146  326:aload_0         
	//* 147  327:getfield        #147 <Field ConstraintAnchor mTop>
	//* 148  330:getfield        #365 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 149  333:getfield        #365 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 150  336:aload_0         
	//* 151  337:getfield        #147 <Field ConstraintAnchor mTop>
	//* 152  340:if_acmpeq       370
	//* 153  343:aload_0         
	//* 154  344:getfield        #157 <Field ConstraintAnchor mBottom>
	//* 155  347:getfield        #365 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 156  350:ifnull          376
	//* 157  353:aload_0         
	//* 158  354:getfield        #157 <Field ConstraintAnchor mBottom>
	//* 159  357:getfield        #365 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 160  360:getfield        #365 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 161  363:aload_0         
	//* 162  364:getfield        #157 <Field ConstraintAnchor mBottom>
	//* 163  367:if_acmpne       376
					flag4 = true;
	//  164  370:iconst_1        
	//  165  371:istore          13
				else
	//* 166  373:goto            379
					flag4 = false;
	//  167  376:iconst_0        
	//  168  377:istore          13
				if(flag1 && mVisibility != 8 && mLeft.mTarget == null && mRight.mTarget == null)
	//* 169  379:iload           10
	//* 170  381:ifeq            432
	//* 171  384:aload_0         
	//* 172  385:getfield        #228 <Field int mVisibility>
	//* 173  388:bipush          8
	//* 174  390:icmpeq          432
	//* 175  393:aload_0         
	//* 176  394:getfield        #142 <Field ConstraintAnchor mLeft>
	//* 177  397:getfield        #365 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 178  400:ifnonnull       432
	//* 179  403:aload_0         
	//* 180  404:getfield        #152 <Field ConstraintAnchor mRight>
	//* 181  407:getfield        #365 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 182  410:ifnonnull       432
					linearsystem.addGreaterThan(linearsystem.createObjectVariable(((Object) (mParent.mRight))), solvervariable1, 0, 1);
	//  183  413:aload_1         
	//  184  414:aload_1         
	//  185  415:aload_0         
	//  186  416:getfield        #192 <Field ConstraintWidget mParent>
	//  187  419:getfield        #152 <Field ConstraintAnchor mRight>
	//  188  422:invokevirtual   #262 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//  189  425:aload           21
	//  190  427:iconst_0        
	//  191  428:iconst_1        
	//  192  429:invokevirtual   #296 <Method void LinearSystem.addGreaterThan(SolverVariable, SolverVariable, int, int)>
				if(flag2 && mVisibility != 8 && mTop.mTarget == null && mBottom.mTarget == null && mBaseline == null)
	//* 193  432:iload           11
	//* 194  434:ifeq            492
	//* 195  437:aload_0         
	//* 196  438:getfield        #228 <Field int mVisibility>
	//* 197  441:bipush          8
	//* 198  443:icmpeq          492
	//* 199  446:aload_0         
	//* 200  447:getfield        #147 <Field ConstraintAnchor mTop>
	//* 201  450:getfield        #365 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 202  453:ifnonnull       492
	//* 203  456:aload_0         
	//* 204  457:getfield        #157 <Field ConstraintAnchor mBottom>
	//* 205  460:getfield        #365 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 206  463:ifnonnull       492
	//* 207  466:aload_0         
	//* 208  467:getfield        #162 <Field ConstraintAnchor mBaseline>
	//* 209  470:ifnonnull       492
					linearsystem.addGreaterThan(linearsystem.createObjectVariable(((Object) (mParent.mBottom))), solvervariable, 0, 1);
	//  210  473:aload_1         
	//  211  474:aload_1         
	//  212  475:aload_0         
	//  213  476:getfield        #192 <Field ConstraintWidget mParent>
	//  214  479:getfield        #157 <Field ConstraintAnchor mBottom>
	//  215  482:invokevirtual   #262 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//  216  485:aload           20
	//  217  487:iconst_0        
	//  218  488:iconst_1        
	//  219  489:invokevirtual   #296 <Method void LinearSystem.addGreaterThan(SolverVariable, SolverVariable, int, int)>
				boolean flag5 = flag3;
	//  220  492:iload           12
	//  221  494:istore          14
				boolean flag8 = flag4;
	//  222  496:iload           13
	//  223  498:istore          15
				flag3 = flag1;
	//  224  500:iload           10
	//  225  502:istore          12
				flag1 = flag2;
	//  226  504:iload           11
	//  227  506:istore          10
				flag4 = flag5;
	//  228  508:iload           14
	//  229  510:istore          13
				flag2 = flag8;
	//  230  512:iload           15
	//  231  514:istore          11
			} else
	//* 232  516:goto            531
			{
				flag3 = false;
	//  233  519:iconst_0        
	//  234  520:istore          12
				flag1 = false;
	//  235  522:iconst_0        
	//  236  523:istore          10
				flag4 = false;
	//  237  525:iconst_0        
	//  238  526:istore          13
				flag2 = false;
	//  239  528:iconst_0        
	//  240  529:istore          11
			}
			k = mWidth;
	//  241  531:aload_0         
	//  242  532:getfield        #194 <Field int mWidth>
	//  243  535:istore          4
			l = mMinWidth;
	//  244  537:aload_0         
	//  245  538:getfield        #373 <Field int mMinWidth>
	//  246  541:istore          5
			i = k;
	//  247  543:iload           4
	//  248  545:istore_3        
			if(k < l)
	//* 249  546:iload           4
	//* 250  548:iload           5
	//* 251  550:icmpge          556
				i = l;
	//  252  553:iload           5
	//  253  555:istore_3        
			l = mHeight;
	//  254  556:aload_0         
	//  255  557:getfield        #196 <Field int mHeight>
	//  256  560:istore          5
			i1 = mMinHeight;
	//  257  562:aload_0         
	//  258  563:getfield        #375 <Field int mMinHeight>
	//  259  566:istore          6
			k = l;
	//  260  568:iload           5
	//  261  570:istore          4
			if(l < i1)
	//* 262  572:iload           5
	//* 263  574:iload           6
	//* 264  576:icmpge          583
				k = i1;
	//  265  579:iload           6
	//  266  581:istore          4
			boolean flag6;
			if(mListDimensionBehaviors[0] != DimensionBehaviour.MATCH_CONSTRAINT)
	//* 267  583:aload_0         
	//* 268  584:getfield        #190 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//* 269  587:iconst_0        
	//* 270  588:aaload          
	//* 271  589:getstatic       #378 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//* 272  592:if_acmpeq       601
				flag6 = true;
	//  273  595:iconst_1        
	//  274  596:istore          14
			else
	//* 275  598:goto            604
				flag6 = false;
	//  276  601:iconst_0        
	//  277  602:istore          14
			boolean flag9;
			if(mListDimensionBehaviors[1] != DimensionBehaviour.MATCH_CONSTRAINT)
	//* 278  604:aload_0         
	//* 279  605:getfield        #190 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//* 280  608:iconst_1        
	//* 281  609:aaload          
	//* 282  610:getstatic       #378 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//* 283  613:if_acmpeq       622
				flag9 = true;
	//  284  616:iconst_1        
	//  285  617:istore          15
			else
	//* 286  619:goto            625
				flag9 = false;
	//  287  622:iconst_0        
	//  288  623:istore          15
			mResolvedDimensionRatioSide = mDimensionRatioSide;
	//  289  625:aload_0         
	//  290  626:aload_0         
	//  291  627:getfield        #200 <Field int mDimensionRatioSide>
	//  292  630:putfield        #122 <Field int mResolvedDimensionRatioSide>
			float f = mDimensionRatio;
	//  293  633:aload_0         
	//  294  634:getfield        #198 <Field float mDimensionRatio>
	//  295  637:fstore_2        
			mResolvedDimensionRatio = f;
	//  296  638:aload_0         
	//  297  639:fload_2         
	//  298  640:putfield        #124 <Field float mResolvedDimensionRatio>
			int k1 = mMatchConstraintDefaultWidth;
	//  299  643:aload_0         
	//  300  644:getfield        #104 <Field int mMatchConstraintDefaultWidth>
	//  301  647:istore          8
			j1 = mMatchConstraintDefaultHeight;
	//  302  649:aload_0         
	//  303  650:getfield        #106 <Field int mMatchConstraintDefaultHeight>
	//  304  653:istore          7
			if(f > 0.0F && mVisibility != 8)
	//* 305  655:fload_2         
	//* 306  656:fconst_0        
	//* 307  657:fcmpl           
	//* 308  658:ifle            1007
	//* 309  661:aload_0         
	//* 310  662:getfield        #228 <Field int mVisibility>
	//* 311  665:bipush          8
	//* 312  667:icmpeq          1007
			{
				i1 = k1;
	//  313  670:iload           8
	//  314  672:istore          6
				if(mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT)
	//* 315  674:aload_0         
	//* 316  675:getfield        #190 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//* 317  678:iconst_0        
	//* 318  679:aaload          
	//* 319  680:getstatic       #378 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//* 320  683:if_acmpne       698
				{
					i1 = k1;
	//  321  686:iload           8
	//  322  688:istore          6
					if(k1 == 0)
	//* 323  690:iload           8
	//* 324  692:ifne            698
						i1 = 3;
	//  325  695:iconst_3        
	//  326  696:istore          6
				}
				l = j1;
	//  327  698:iload           7
	//  328  700:istore          5
				if(mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT)
	//* 329  702:aload_0         
	//* 330  703:getfield        #190 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//* 331  706:iconst_1        
	//* 332  707:aaload          
	//* 333  708:getstatic       #378 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//* 334  711:if_acmpne       726
				{
					l = j1;
	//  335  714:iload           7
	//  336  716:istore          5
					if(j1 == 0)
	//* 337  718:iload           7
	//* 338  720:ifne            726
						l = 3;
	//  339  723:iconst_3        
	//  340  724:istore          5
				}
				if(mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT && mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT && i1 == 3 && l == 3)
	//* 341  726:aload_0         
	//* 342  727:getfield        #190 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//* 343  730:iconst_0        
	//* 344  731:aaload          
	//* 345  732:getstatic       #378 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//* 346  735:if_acmpne       777
	//* 347  738:aload_0         
	//* 348  739:getfield        #190 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//* 349  742:iconst_1        
	//* 350  743:aaload          
	//* 351  744:getstatic       #378 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//* 352  747:if_acmpne       777
	//* 353  750:iload           6
	//* 354  752:iconst_3        
	//* 355  753:icmpne          777
	//* 356  756:iload           5
	//* 357  758:iconst_3        
	//* 358  759:icmpne          777
				{
					setupDimensionRatio(flag3, flag1, flag6, flag9);
	//  359  762:aload_0         
	//  360  763:iload           12
	//  361  765:iload           10
	//  362  767:iload           14
	//  363  769:iload           15
	//  364  771:invokevirtual   #382 <Method void setupDimensionRatio(boolean, boolean, boolean, boolean)>
				} else
	//* 365  774:goto            983
				{
					if(mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT && i1 == 3)
	//* 366  777:aload_0         
	//* 367  778:getfield        #190 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//* 368  781:iconst_0        
	//* 369  782:aaload          
	//* 370  783:getstatic       #378 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//* 371  786:if_acmpne       870
	//* 372  789:iload           6
	//* 373  791:iconst_3        
	//* 374  792:icmpne          870
					{
						mResolvedDimensionRatioSide = 0;
	//  375  795:aload_0         
	//  376  796:iconst_0        
	//  377  797:putfield        #122 <Field int mResolvedDimensionRatioSide>
						j1 = (int)(mResolvedDimensionRatio * (float)mHeight);
	//  378  800:aload_0         
	//  379  801:getfield        #124 <Field float mResolvedDimensionRatio>
	//  380  804:aload_0         
	//  381  805:getfield        #196 <Field int mHeight>
	//  382  808:i2f             
	//  383  809:fmul            
	//  384  810:f2i             
	//  385  811:istore          7
						if(mListDimensionBehaviors[1] != DimensionBehaviour.MATCH_CONSTRAINT)
	//* 386  813:aload_0         
	//* 387  814:getfield        #190 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//* 388  817:iconst_1        
	//* 389  818:aaload          
	//* 390  819:getstatic       #378 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//* 391  822:if_acmpeq       845
						{
							i1 = j1;
	//  392  825:iload           7
	//  393  827:istore          6
							j1 = k;
	//  394  829:iload           4
	//  395  831:istore          7
							k = l;
	//  396  833:iload           5
	//  397  835:istore          4
							i = 4;
	//  398  837:iconst_4        
	//  399  838:istore_3        
							l = 0;
	//  400  839:iconst_0        
	//  401  840:istore          5
						} else
	//* 402  842:goto            1032
						{
							i = i1;
	//  403  845:iload           6
	//  404  847:istore_3        
							k1 = k;
	//  405  848:iload           4
	//  406  850:istore          8
							k = l;
	//  407  852:iload           5
	//  408  854:istore          4
							l = 1;
	//  409  856:iconst_1        
	//  410  857:istore          5
							i1 = j1;
	//  411  859:iload           7
	//  412  861:istore          6
							j1 = k1;
	//  413  863:iload           8
	//  414  865:istore          7
						}
						break label0;
	//  415  867:goto            1032
					}
					if(mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT && l == 3)
	//* 416  870:aload_0         
	//* 417  871:getfield        #190 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//* 418  874:iconst_1        
	//* 419  875:aaload          
	//* 420  876:getstatic       #378 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//* 421  879:if_acmpne       983
	//* 422  882:iload           5
	//* 423  884:iconst_3        
	//* 424  885:icmpne          983
					{
						mResolvedDimensionRatioSide = 1;
	//  425  888:aload_0         
	//  426  889:iconst_1        
	//  427  890:putfield        #122 <Field int mResolvedDimensionRatioSide>
						if(mDimensionRatioSide == -1)
	//* 428  893:aload_0         
	//* 429  894:getfield        #200 <Field int mDimensionRatioSide>
	//* 430  897:iconst_m1       
	//* 431  898:icmpne          911
							mResolvedDimensionRatio = 1.0F / mResolvedDimensionRatio;
	//  432  901:aload_0         
	//  433  902:fconst_1        
	//  434  903:aload_0         
	//  435  904:getfield        #124 <Field float mResolvedDimensionRatio>
	//  436  907:fdiv            
	//  437  908:putfield        #124 <Field float mResolvedDimensionRatio>
						j1 = (int)(mResolvedDimensionRatio * (float)mWidth);
	//  438  911:aload_0         
	//  439  912:getfield        #124 <Field float mResolvedDimensionRatio>
	//  440  915:aload_0         
	//  441  916:getfield        #194 <Field int mWidth>
	//  442  919:i2f             
	//  443  920:fmul            
	//  444  921:f2i             
	//  445  922:istore          7
						if(mListDimensionBehaviors[0] != DimensionBehaviour.MATCH_CONSTRAINT)
	//* 446  924:aload_0         
	//* 447  925:getfield        #190 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//* 448  928:iconst_0        
	//* 449  929:aaload          
	//* 450  930:getstatic       #378 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//* 451  933:if_acmpeq       959
						{
							k = i1;
	//  452  936:iload           6
	//  453  938:istore          4
							i1 = i;
	//  454  940:iload_3         
	//  455  941:istore          6
							k1 = 4;
	//  456  943:iconst_4        
	//  457  944:istore          8
							l = 0;
	//  458  946:iconst_0        
	//  459  947:istore          5
							i = k;
	//  460  949:iload           4
	//  461  951:istore_3        
							k = k1;
	//  462  952:iload           8
	//  463  954:istore          4
						} else
	//* 464  956:goto            1032
						{
							k = i1;
	//  465  959:iload           6
	//  466  961:istore          4
							i1 = i;
	//  467  963:iload_3         
	//  468  964:istore          6
							k1 = 1;
	//  469  966:iconst_1        
	//  470  967:istore          8
							i = k;
	//  471  969:iload           4
	//  472  971:istore_3        
							k = l;
	//  473  972:iload           5
	//  474  974:istore          4
							l = k1;
	//  475  976:iload           8
	//  476  978:istore          5
						}
						break label0;
	//  477  980:goto            1032
					}
				}
				k1 = i1;
	//  478  983:iload           6
	//  479  985:istore          8
				i1 = i;
	//  480  987:iload_3         
	//  481  988:istore          6
				j1 = k;
	//  482  990:iload           4
	//  483  992:istore          7
				k = l;
	//  484  994:iload           5
	//  485  996:istore          4
				l = 1;
	//  486  998:iconst_1        
	//  487  999:istore          5
				i = k1;
	//  488 1001:iload           8
	//  489 1003:istore_3        
			} else
	//* 490 1004:goto            1032
			{
				l = k;
	//  491 1007:iload           4
	//  492 1009:istore          5
				k = j1;
	//  493 1011:iload           7
	//  494 1013:istore          4
				boolean flag = false;
	//  495 1015:iconst_0        
	//  496 1016:istore          9
				j1 = l;
	//  497 1018:iload           5
	//  498 1020:istore          7
				i1 = i;
	//  499 1022:iload_3         
	//  500 1023:istore          6
				l = ((int) (flag));
	//  501 1025:iload           9
	//  502 1027:istore          5
				i = k1;
	//  503 1029:iload           8
	//  504 1031:istore_3        
			}
		}
		boolean flag7;
label1:
		{
			int ai[] = mResolvedMatchConstraintDefault;
	//  505 1032:aload_0         
	//  506 1033:getfield        #108 <Field int[] mResolvedMatchConstraintDefault>
	//  507 1036:astore          18
			ai[0] = i;
	//  508 1038:aload           18
	//  509 1040:iconst_0        
	//  510 1041:iload_3         
	//  511 1042:iastore         
			ai[1] = k;
	//  512 1043:aload           18
	//  513 1045:iconst_1        
	//  514 1046:iload           4
	//  515 1048:iastore         
			if(l != 0)
	//* 516 1049:iload           5
	//* 517 1051:ifeq            1080
			{
				int l1 = mResolvedDimensionRatioSide;
	//  518 1054:aload_0         
	//  519 1055:getfield        #122 <Field int mResolvedDimensionRatioSide>
	//  520 1058:istore          8
				if(l1 == 0 || l1 == -1)
	//* 521 1060:iload           8
	//* 522 1062:ifeq            1074
	//* 523 1065:iload           8
	//* 524 1067:iconst_m1       
	//* 525 1068:icmpne          1080
	//* 526 1071:goto            1074
				{
					flag7 = true;
	//  527 1074:iconst_1        
	//  528 1075:istore          14
					break label1;
	//  529 1077:goto            1083
				}
			}
			flag7 = false;
	//  530 1080:iconst_0        
	//  531 1081:istore          14
		}
		boolean flag11;
		Object obj2;
		ConstraintWidget constraintwidget1;
label2:
		{
			boolean flag10;
			if(mListDimensionBehaviors[0] == DimensionBehaviour.WRAP_CONTENT && (this instanceof ConstraintWidgetContainer))
	//* 532 1083:aload_0         
	//* 533 1084:getfield        #190 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//* 534 1087:iconst_0        
	//* 535 1088:aaload          
	//* 536 1089:getstatic       #362 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//* 537 1092:if_acmpne       1108
	//* 538 1095:aload_0         
	//* 539 1096:instanceof      #367 <Class ConstraintWidgetContainer>
	//* 540 1099:ifeq            1108
				flag10 = true;
	//  541 1102:iconst_1        
	//  542 1103:istore          15
			else
	//* 543 1105:goto            1111
				flag10 = false;
	//  544 1108:iconst_0        
	//  545 1109:istore          15
			flag11 = mCenter.isConnected() ^ true;
	//  546 1111:aload_0         
	//  547 1112:getfield        #177 <Field ConstraintAnchor mCenter>
	//  548 1115:invokevirtual   #303 <Method boolean ConstraintAnchor.isConnected()>
	//  549 1118:iconst_1        
	//  550 1119:ixor            
	//  551 1120:istore          16
			if(mHorizontalResolution != 2)
	//* 552 1122:aload_0         
	//* 553 1123:getfield        #100 <Field int mHorizontalResolution>
	//* 554 1126:iconst_2        
	//* 555 1127:icmpeq          1255
			{
				Object obj1 = ((Object) (mParent));
	//  556 1130:aload_0         
	//  557 1131:getfield        #192 <Field ConstraintWidget mParent>
	//  558 1134:astore          18
				if(obj1 != null)
	//* 559 1136:aload           18
	//* 560 1138:ifnull          1155
					obj1 = ((Object) (linearsystem.createObjectVariable(((Object) (((ConstraintWidget) (obj1)).mRight)))));
	//  561 1141:aload_1         
	//  562 1142:aload           18
	//  563 1144:getfield        #152 <Field ConstraintAnchor mRight>
	//  564 1147:invokevirtual   #262 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//  565 1150:astore          18
				else
	//* 566 1152:goto            1158
					obj1 = null;
	//  567 1155:aconst_null     
	//  568 1156:astore          18
				Object obj3 = ((Object) (mParent));
	//  569 1158:aload_0         
	//  570 1159:getfield        #192 <Field ConstraintWidget mParent>
	//  571 1162:astore          19
				if(obj3 != null)
	//* 572 1164:aload           19
	//* 573 1166:ifnull          1183
					obj3 = ((Object) (linearsystem.createObjectVariable(((Object) (((ConstraintWidget) (obj3)).mLeft)))));
	//  574 1169:aload_1         
	//  575 1170:aload           19
	//  576 1172:getfield        #142 <Field ConstraintAnchor mLeft>
	//  577 1175:invokevirtual   #262 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//  578 1178:astore          19
				else
	//* 579 1180:goto            1186
					obj3 = null;
	//  580 1183:aconst_null     
	//  581 1184:astore          19
				applyConstraints(linearsystem, flag3, ((SolverVariable) (obj3)), ((SolverVariable) (obj1)), mListDimensionBehaviors[0], flag10, mLeft, mRight, mX, i1, mMinWidth, mMaxDimension[0], mHorizontalBiasPercent, flag7, flag4, i, mMatchConstraintMinWidth, mMatchConstraintMaxWidth, mMatchConstraintPercentWidth, flag11);
	//  582 1186:aload_0         
	//  583 1187:aload_1         
	//  584 1188:iload           12
	//  585 1190:aload           19
	//  586 1192:aload           18
	//  587 1194:aload_0         
	//  588 1195:getfield        #190 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//  589 1198:iconst_0        
	//  590 1199:aaload          
	//  591 1200:iload           15
	//  592 1202:aload_0         
	//  593 1203:getfield        #142 <Field ConstraintAnchor mLeft>
	//  594 1206:aload_0         
	//  595 1207:getfield        #152 <Field ConstraintAnchor mRight>
	//  596 1210:aload_0         
	//  597 1211:getfield        #202 <Field int mX>
	//  598 1214:iload           6
	//  599 1216:aload_0         
	//  600 1217:getfield        #373 <Field int mMinWidth>
	//  601 1220:aload_0         
	//  602 1221:getfield        #127 <Field int[] mMaxDimension>
	//  603 1224:iconst_0        
	//  604 1225:iaload          
	//  605 1226:aload_0         
	//  606 1227:getfield        #222 <Field float mHorizontalBiasPercent>
	//  607 1230:iload           14
	//  608 1232:iload           13
	//  609 1234:iload_3         
	//  610 1235:aload_0         
	//  611 1236:getfield        #110 <Field int mMatchConstraintMinWidth>
	//  612 1239:aload_0         
	//  613 1240:getfield        #112 <Field int mMatchConstraintMaxWidth>
	//  614 1243:aload_0         
	//  615 1244:getfield        #114 <Field float mMatchConstraintPercentWidth>
	//  616 1247:iload           16
	//  617 1249:invokespecial   #384 <Method void applyConstraints(LinearSystem, boolean, SolverVariable, SolverVariable, ConstraintWidget$DimensionBehaviour, boolean, ConstraintAnchor, ConstraintAnchor, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean)>
			}
	//* 618 1252:goto            1255
			obj2 = obj4;
	//  619 1255:aload           22
	//  620 1257:astore          18
			constraintwidget1 = this;
	//  621 1259:aload_0         
	//  622 1260:astore          19
			if(constraintwidget1.mVerticalResolution == 2)
	//* 623 1262:aload           19
	//* 624 1264:getfield        #102 <Field int mVerticalResolution>
	//* 625 1267:iconst_2        
	//* 626 1268:icmpne          1272
				return;
	//  627 1271:return          
			if(constraintwidget1.mListDimensionBehaviors[1] == DimensionBehaviour.WRAP_CONTENT && (constraintwidget1 instanceof ConstraintWidgetContainer))
	//* 628 1272:aload           19
	//* 629 1274:getfield        #190 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//* 630 1277:iconst_1        
	//* 631 1278:aaload          
	//* 632 1279:getstatic       #362 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//* 633 1282:if_acmpne       1299
	//* 634 1285:aload           19
	//* 635 1287:instanceof      #367 <Class ConstraintWidgetContainer>
	//* 636 1290:ifeq            1299
				flag3 = true;
	//  637 1293:iconst_1        
	//  638 1294:istore          12
			else
	//* 639 1296:goto            1302
				flag3 = false;
	//  640 1299:iconst_0        
	//  641 1300:istore          12
			if(l != 0)
	//* 642 1302:iload           5
	//* 643 1304:ifeq            1329
			{
				int j = constraintwidget1.mResolvedDimensionRatioSide;
	//  644 1307:aload           19
	//  645 1309:getfield        #122 <Field int mResolvedDimensionRatioSide>
	//  646 1312:istore_3        
				if(j == 1 || j == -1)
	//* 647 1313:iload_3         
	//* 648 1314:iconst_1        
	//* 649 1315:icmpeq          1323
	//* 650 1318:iload_3         
	//* 651 1319:iconst_m1       
	//* 652 1320:icmpne          1329
				{
					flag4 = true;
	//  653 1323:iconst_1        
	//  654 1324:istore          13
					break label2;
	//  655 1326:goto            1332
				}
			}
			flag4 = false;
	//  656 1329:iconst_0        
	//  657 1330:istore          13
		}
label3:
		{
			if(constraintwidget1.mBaselineDistance > 0)
	//* 658 1332:aload           19
	//* 659 1334:getfield        #218 <Field int mBaselineDistance>
	//* 660 1337:ifle            1430
				if(constraintwidget1.mBaseline.getResolutionNode().state == 1)
	//* 661 1340:aload           19
	//* 662 1342:getfield        #162 <Field ConstraintAnchor mBaseline>
	//* 663 1345:invokevirtual   #273 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//* 664 1348:getfield        #278 <Field int ResolutionAnchor.state>
	//* 665 1351:iconst_1        
	//* 666 1352:icmpne          1370
				{
					constraintwidget1.mBaseline.getResolutionNode().addResolvedValue(linearsystem);
	//  667 1355:aload           19
	//  668 1357:getfield        #162 <Field ConstraintAnchor mBaseline>
	//  669 1360:invokevirtual   #273 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  670 1363:aload_1         
	//  671 1364:invokevirtual   #292 <Method void ResolutionAnchor.addResolvedValue(LinearSystem)>
				} else
	//* 672 1367:goto            1430
				{
					obj4 = ((Object) (linearsystem));
	//  673 1370:aload_1         
	//  674 1371:astore          22
					((LinearSystem) (obj4)).addEquality(((SolverVariable) (obj)), ((SolverVariable) (obj2)), getBaselineDistance(), 6);
	//  675 1373:aload           22
	//  676 1375:aload           17
	//  677 1377:aload           18
	//  678 1379:aload_0         
	//  679 1380:invokevirtual   #387 <Method int getBaselineDistance()>
	//  680 1383:bipush          6
	//  681 1385:invokevirtual   #320 <Method ArrayRow LinearSystem.addEquality(SolverVariable, SolverVariable, int, int)>
	//  682 1388:pop             
					if(constraintwidget1.mBaseline.mTarget != null)
	//* 683 1389:aload           19
	//* 684 1391:getfield        #162 <Field ConstraintAnchor mBaseline>
	//* 685 1394:getfield        #365 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 686 1397:ifnull          1430
					{
						((LinearSystem) (obj4)).addEquality(((SolverVariable) (obj)), ((LinearSystem) (obj4)).createObjectVariable(((Object) (constraintwidget1.mBaseline.mTarget))), 0, 6);
	//  687 1400:aload           22
	//  688 1402:aload           17
	//  689 1404:aload           22
	//  690 1406:aload           19
	//  691 1408:getfield        #162 <Field ConstraintAnchor mBaseline>
	//  692 1411:getfield        #365 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//  693 1414:invokevirtual   #262 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//  694 1417:iconst_0        
	//  695 1418:bipush          6
	//  696 1420:invokevirtual   #320 <Method ArrayRow LinearSystem.addEquality(SolverVariable, SolverVariable, int, int)>
	//  697 1423:pop             
						flag7 = false;
	//  698 1424:iconst_0        
	//  699 1425:istore          14
						break label3;
	//  700 1427:goto            1434
					}
				}
			flag7 = flag11;
	//  701 1430:iload           16
	//  702 1432:istore          14
		}
		LinearSystem linearsystem1 = linearsystem;
	//  703 1434:aload_1         
	//  704 1435:astore          23
		obj4 = obj2;
	//  705 1437:aload           18
	//  706 1439:astore          22
		obj = ((Object) (constraintwidget1.mParent));
	//  707 1441:aload           19
	//  708 1443:getfield        #192 <Field ConstraintWidget mParent>
	//  709 1446:astore          17
		if(obj != null)
	//* 710 1448:aload           17
	//* 711 1450:ifnull          1468
			obj = ((Object) (linearsystem1.createObjectVariable(((Object) (((ConstraintWidget) (obj)).mBottom)))));
	//  712 1453:aload           23
	//  713 1455:aload           17
	//  714 1457:getfield        #157 <Field ConstraintAnchor mBottom>
	//  715 1460:invokevirtual   #262 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//  716 1463:astore          17
		else
	//* 717 1465:goto            1471
			obj = null;
	//  718 1468:aconst_null     
	//  719 1469:astore          17
		obj2 = ((Object) (constraintwidget1.mParent));
	//  720 1471:aload           19
	//  721 1473:getfield        #192 <Field ConstraintWidget mParent>
	//  722 1476:astore          18
		if(obj2 != null)
	//* 723 1478:aload           18
	//* 724 1480:ifnull          1498
			obj2 = ((Object) (linearsystem1.createObjectVariable(((Object) (((ConstraintWidget) (obj2)).mTop)))));
	//  725 1483:aload           23
	//  726 1485:aload           18
	//  727 1487:getfield        #147 <Field ConstraintAnchor mTop>
	//  728 1490:invokevirtual   #262 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//  729 1493:astore          18
		else
	//* 730 1495:goto            1501
			obj2 = null;
	//  731 1498:aconst_null     
	//  732 1499:astore          18
		applyConstraints(linearsystem, flag1, ((SolverVariable) (obj2)), ((SolverVariable) (obj)), constraintwidget1.mListDimensionBehaviors[1], flag3, constraintwidget1.mTop, constraintwidget1.mBottom, constraintwidget1.mY, j1, constraintwidget1.mMinHeight, constraintwidget1.mMaxDimension[1], constraintwidget1.mVerticalBiasPercent, flag4, flag2, k, constraintwidget1.mMatchConstraintMinHeight, constraintwidget1.mMatchConstraintMaxHeight, constraintwidget1.mMatchConstraintPercentHeight, flag7);
	//  733 1501:aload_0         
	//  734 1502:aload_1         
	//  735 1503:iload           10
	//  736 1505:aload           18
	//  737 1507:aload           17
	//  738 1509:aload           19
	//  739 1511:getfield        #190 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//  740 1514:iconst_1        
	//  741 1515:aaload          
	//  742 1516:iload           12
	//  743 1518:aload           19
	//  744 1520:getfield        #147 <Field ConstraintAnchor mTop>
	//  745 1523:aload           19
	//  746 1525:getfield        #157 <Field ConstraintAnchor mBottom>
	//  747 1528:aload           19
	//  748 1530:getfield        #204 <Field int mY>
	//  749 1533:iload           7
	//  750 1535:aload           19
	//  751 1537:getfield        #375 <Field int mMinHeight>
	//  752 1540:aload           19
	//  753 1542:getfield        #127 <Field int[] mMaxDimension>
	//  754 1545:iconst_1        
	//  755 1546:iaload          
	//  756 1547:aload           19
	//  757 1549:getfield        #224 <Field float mVerticalBiasPercent>
	//  758 1552:iload           13
	//  759 1554:iload           11
	//  760 1556:iload           4
	//  761 1558:aload           19
	//  762 1560:getfield        #116 <Field int mMatchConstraintMinHeight>
	//  763 1563:aload           19
	//  764 1565:getfield        #118 <Field int mMatchConstraintMaxHeight>
	//  765 1568:aload           19
	//  766 1570:getfield        #120 <Field float mMatchConstraintPercentHeight>
	//  767 1573:iload           14
	//  768 1575:invokespecial   #384 <Method void applyConstraints(LinearSystem, boolean, SolverVariable, SolverVariable, ConstraintWidget$DimensionBehaviour, boolean, ConstraintAnchor, ConstraintAnchor, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean)>
		if(l != 0)
	//* 769 1578:iload           5
	//* 770 1580:ifeq            1639
		{
			obj = ((Object) (this));
	//  771 1583:aload_0         
	//  772 1584:astore          17
			if(((ConstraintWidget) (obj)).mResolvedDimensionRatioSide == 1)
	//* 773 1586:aload           17
	//* 774 1588:getfield        #122 <Field int mResolvedDimensionRatioSide>
	//* 775 1591:iconst_1        
	//* 776 1592:icmpne          1617
				linearsystem.addRatio(solvervariable, ((SolverVariable) (obj4)), solvervariable1, solvervariable2, ((ConstraintWidget) (obj)).mResolvedDimensionRatio, 6);
	//  777 1595:aload_1         
	//  778 1596:aload           20
	//  779 1598:aload           22
	//  780 1600:aload           21
	//  781 1602:aload           24
	//  782 1604:aload           17
	//  783 1606:getfield        #124 <Field float mResolvedDimensionRatio>
	//  784 1609:bipush          6
	//  785 1611:invokevirtual   #391 <Method void LinearSystem.addRatio(SolverVariable, SolverVariable, SolverVariable, SolverVariable, float, int)>
			else
	//* 786 1614:goto            1639
				linearsystem.addRatio(solvervariable1, solvervariable2, solvervariable, ((SolverVariable) (obj4)), ((ConstraintWidget) (obj)).mResolvedDimensionRatio, 6);
	//  787 1617:aload_1         
	//  788 1618:aload           21
	//  789 1620:aload           24
	//  790 1622:aload           20
	//  791 1624:aload           22
	//  792 1626:aload           17
	//  793 1628:getfield        #124 <Field float mResolvedDimensionRatio>
	//  794 1631:bipush          6
	//  795 1633:invokevirtual   #391 <Method void LinearSystem.addRatio(SolverVariable, SolverVariable, SolverVariable, SolverVariable, float, int)>
		}
	//* 796 1636:goto            1639
		obj = ((Object) (this));
	//  797 1639:aload_0         
	//  798 1640:astore          17
		if(((ConstraintWidget) (obj)).mCenter.isConnected())
	//* 799 1642:aload           17
	//* 800 1644:getfield        #177 <Field ConstraintAnchor mCenter>
	//* 801 1647:invokevirtual   #303 <Method boolean ConstraintAnchor.isConnected()>
	//* 802 1650:ifeq            1692
			linearsystem.addCenterPoint(((ConstraintWidget) (obj)), ((ConstraintWidget) (obj)).mCenter.getTarget().getOwner(), (float)Math.toRadians(((ConstraintWidget) (obj)).mCircleConstraintAngle + 90F), ((ConstraintWidget) (obj)).mCenter.getMargin());
	//  803 1653:aload_1         
	//  804 1654:aload           17
	//  805 1656:aload           17
	//  806 1658:getfield        #177 <Field ConstraintAnchor mCenter>
	//  807 1661:invokevirtual   #266 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//  808 1664:invokevirtual   #395 <Method ConstraintWidget ConstraintAnchor.getOwner()>
	//  809 1667:aload           17
	//  810 1669:getfield        #129 <Field float mCircleConstraintAngle>
	//  811 1672:ldc2            #396 <Float 90F>
	//  812 1675:fadd            
	//  813 1676:f2d             
	//  814 1677:invokestatic    #400 <Method double Math.toRadians(double)>
	//  815 1680:d2f             
	//  816 1681:aload           17
	//  817 1683:getfield        #177 <Field ConstraintAnchor mCenter>
	//  818 1686:invokevirtual   #317 <Method int ConstraintAnchor.getMargin()>
	//  819 1689:invokevirtual   #404 <Method void LinearSystem.addCenterPoint(ConstraintWidget, ConstraintWidget, float, int)>
	//  820 1692:return          
	}

	public boolean allowedInBarrier()
	{
		return mVisibility != 8;
	//    0    0:aload_0         
	//    1    1:getfield        #228 <Field int mVisibility>
	//    2    4:bipush          8
	//    3    6:icmpeq          11
	//    4    9:iconst_1        
	//    5   10:ireturn         
	//    6   11:iconst_0        
	//    7   12:ireturn         
	}

	public void analyze(int i)
	{
		Optimizer.analyze(i, this);
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #412 <Method void Optimizer.analyze(int, ConstraintWidget)>
	//    3    5:return          
	}

	public void connectCircularConstraint(ConstraintWidget constraintwidget, float f, int i)
	{
		immediateConnect(ConstraintAnchor.Type.CENTER, constraintwidget, ConstraintAnchor.Type.CENTER, i, 0);
	//    0    0:aload_0         
	//    1    1:getstatic       #175 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER>
	//    2    4:aload_1         
	//    3    5:getstatic       #175 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER>
	//    4    8:iload_3         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #418 <Method void immediateConnect(ConstraintAnchor$Type, ConstraintWidget, ConstraintAnchor$Type, int, int)>
		mCircleConstraintAngle = f;
	//    7   13:aload_0         
	//    8   14:fload_2         
	//    9   15:putfield        #129 <Field float mCircleConstraintAngle>
	//   10   18:return          
	}

	public void createObjectVariables(LinearSystem linearsystem)
	{
		linearsystem.createObjectVariable(((Object) (mLeft)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #142 <Field ConstraintAnchor mLeft>
	//    3    5:invokevirtual   #262 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//    4    8:pop             
		linearsystem.createObjectVariable(((Object) (mTop)));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #147 <Field ConstraintAnchor mTop>
	//    8   14:invokevirtual   #262 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//    9   17:pop             
		linearsystem.createObjectVariable(((Object) (mRight)));
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #152 <Field ConstraintAnchor mRight>
	//   13   23:invokevirtual   #262 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//   14   26:pop             
		linearsystem.createObjectVariable(((Object) (mBottom)));
	//   15   27:aload_1         
	//   16   28:aload_0         
	//   17   29:getfield        #157 <Field ConstraintAnchor mBottom>
	//   18   32:invokevirtual   #262 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//   19   35:pop             
		if(mBaselineDistance > 0)
	//*  20   36:aload_0         
	//*  21   37:getfield        #218 <Field int mBaselineDistance>
	//*  22   40:ifle            52
			linearsystem.createObjectVariable(((Object) (mBaseline)));
	//   23   43:aload_1         
	//   24   44:aload_0         
	//   25   45:getfield        #162 <Field ConstraintAnchor mBaseline>
	//   26   48:invokevirtual   #262 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//   27   51:pop             
	//   28   52:return          
	}

	public ConstraintAnchor getAnchor(ConstraintAnchor.Type type)
	{
		switch(_cls1..SwitchMap.android.support.constraint.solver.widgets.ConstraintAnchor.Type[type.ordinal()])
	//*   0    0:getstatic       #422 <Field int[] ConstraintWidget$1.$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #423 <Method int ConstraintAnchor$Type.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 9: default 60
	//	               1 109
	//	               2 104
	//	               3 99
	//	               4 94
	//	               5 89
	//	               6 84
	//	               7 79
	//	               8 74
	//	               9 72
		default:
			throw new AssertionError(((Object) (type.name())));
	//    5   60:new             #425 <Class AssertionError>
	//    6   63:dup             
	//    7   64:aload_1         
	//    8   65:invokevirtual   #429 <Method String ConstraintAnchor$Type.name()>
	//    9   68:invokespecial   #432 <Method void AssertionError(Object)>
	//   10   71:athrow          

		case 9: // '\t'
			return null;
	//   11   72:aconst_null     
	//   12   73:areturn         

		case 8: // '\b'
			return mCenterY;
	//   13   74:aload_0         
	//   14   75:getfield        #172 <Field ConstraintAnchor mCenterY>
	//   15   78:areturn         

		case 7: // '\007'
			return mCenterX;
	//   16   79:aload_0         
	//   17   80:getfield        #167 <Field ConstraintAnchor mCenterX>
	//   18   83:areturn         

		case 6: // '\006'
			return mCenter;
	//   19   84:aload_0         
	//   20   85:getfield        #177 <Field ConstraintAnchor mCenter>
	//   21   88:areturn         

		case 5: // '\005'
			return mBaseline;
	//   22   89:aload_0         
	//   23   90:getfield        #162 <Field ConstraintAnchor mBaseline>
	//   24   93:areturn         

		case 4: // '\004'
			return mBottom;
	//   25   94:aload_0         
	//   26   95:getfield        #157 <Field ConstraintAnchor mBottom>
	//   27   98:areturn         

		case 3: // '\003'
			return mRight;
	//   28   99:aload_0         
	//   29  100:getfield        #152 <Field ConstraintAnchor mRight>
	//   30  103:areturn         

		case 2: // '\002'
			return mTop;
	//   31  104:aload_0         
	//   32  105:getfield        #147 <Field ConstraintAnchor mTop>
	//   33  108:areturn         

		case 1: // '\001'
			return mLeft;
	//   34  109:aload_0         
	//   35  110:getfield        #142 <Field ConstraintAnchor mLeft>
	//   36  113:areturn         
		}
	}

	public ArrayList getAnchors()
	{
		return mAnchors;
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field ArrayList mAnchors>
	//    2    4:areturn         
	}

	public int getBaselineDistance()
	{
		return mBaselineDistance;
	//    0    0:aload_0         
	//    1    1:getfield        #218 <Field int mBaselineDistance>
	//    2    4:ireturn         
	}

	public int getBottom()
	{
		return getY() + mHeight;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #440 <Method int getY()>
	//    2    4:aload_0         
	//    3    5:getfield        #196 <Field int mHeight>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public Object getCompanionWidget()
	{
		return mCompanionWidget;
	//    0    0:aload_0         
	//    1    1:getfield        #444 <Field Object mCompanionWidget>
	//    2    4:areturn         
	}

	public String getDebugName()
	{
		return mDebugName;
	//    0    0:aload_0         
	//    1    1:getfield        #230 <Field String mDebugName>
	//    2    4:areturn         
	}

	public int getDrawX()
	{
		return mDrawX + mOffsetX;
	//    0    0:aload_0         
	//    1    1:getfield        #206 <Field int mDrawX>
	//    2    4:aload_0         
	//    3    5:getfield        #214 <Field int mOffsetX>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public int getDrawY()
	{
		return mDrawY + mOffsetY;
	//    0    0:aload_0         
	//    1    1:getfield        #208 <Field int mDrawY>
	//    2    4:aload_0         
	//    3    5:getfield        #216 <Field int mOffsetY>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public int getHeight()
	{
		if(mVisibility == 8)
	//*   0    0:aload_0         
	//*   1    1:getfield        #228 <Field int mVisibility>
	//*   2    4:bipush          8
	//*   3    6:icmpne          11
			return 0;
	//    4    9:iconst_0        
	//    5   10:ireturn         
		else
			return mHeight;
	//    6   11:aload_0         
	//    7   12:getfield        #196 <Field int mHeight>
	//    8   15:ireturn         
	}

	public float getHorizontalBiasPercent()
	{
		return mHorizontalBiasPercent;
	//    0    0:aload_0         
	//    1    1:getfield        #222 <Field float mHorizontalBiasPercent>
	//    2    4:freturn         
	}

	public DimensionBehaviour getHorizontalDimensionBehaviour()
	{
		return mListDimensionBehaviors[0];
	//    0    0:aload_0         
	//    1    1:getfield        #190 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//    2    4:iconst_0        
	//    3    5:aaload          
	//    4    6:areturn         
	}

	public ConstraintWidget getParent()
	{
		return mParent;
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field ConstraintWidget mParent>
	//    2    4:areturn         
	}

	public ResolutionDimension getResolutionHeight()
	{
		if(mResolutionHeight == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #457 <Field ResolutionDimension mResolutionHeight>
	//*   2    4:ifnonnull       18
			mResolutionHeight = new ResolutionDimension();
	//    3    7:aload_0         
	//    4    8:new             #459 <Class ResolutionDimension>
	//    5   11:dup             
	//    6   12:invokespecial   #460 <Method void ResolutionDimension()>
	//    7   15:putfield        #457 <Field ResolutionDimension mResolutionHeight>
		return mResolutionHeight;
	//    8   18:aload_0         
	//    9   19:getfield        #457 <Field ResolutionDimension mResolutionHeight>
	//   10   22:areturn         
	}

	public ResolutionDimension getResolutionWidth()
	{
		if(mResolutionWidth == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #463 <Field ResolutionDimension mResolutionWidth>
	//*   2    4:ifnonnull       18
			mResolutionWidth = new ResolutionDimension();
	//    3    7:aload_0         
	//    4    8:new             #459 <Class ResolutionDimension>
	//    5   11:dup             
	//    6   12:invokespecial   #460 <Method void ResolutionDimension()>
	//    7   15:putfield        #463 <Field ResolutionDimension mResolutionWidth>
		return mResolutionWidth;
	//    8   18:aload_0         
	//    9   19:getfield        #463 <Field ResolutionDimension mResolutionWidth>
	//   10   22:areturn         
	}

	public int getRight()
	{
		return getX() + mWidth;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #467 <Method int getX()>
	//    2    4:aload_0         
	//    3    5:getfield        #194 <Field int mWidth>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	protected int getRootX()
	{
		return mX + mOffsetX;
	//    0    0:aload_0         
	//    1    1:getfield        #202 <Field int mX>
	//    2    4:aload_0         
	//    3    5:getfield        #214 <Field int mOffsetX>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	protected int getRootY()
	{
		return mY + mOffsetY;
	//    0    0:aload_0         
	//    1    1:getfield        #204 <Field int mY>
	//    2    4:aload_0         
	//    3    5:getfield        #216 <Field int mOffsetY>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public DimensionBehaviour getVerticalDimensionBehaviour()
	{
		return mListDimensionBehaviors[1];
	//    0    0:aload_0         
	//    1    1:getfield        #190 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//    2    4:iconst_1        
	//    3    5:aaload          
	//    4    6:areturn         
	}

	public int getVisibility()
	{
		return mVisibility;
	//    0    0:aload_0         
	//    1    1:getfield        #228 <Field int mVisibility>
	//    2    4:ireturn         
	}

	public int getWidth()
	{
		if(mVisibility == 8)
	//*   0    0:aload_0         
	//*   1    1:getfield        #228 <Field int mVisibility>
	//*   2    4:bipush          8
	//*   3    6:icmpne          11
			return 0;
	//    4    9:iconst_0        
	//    5   10:ireturn         
		else
			return mWidth;
	//    6   11:aload_0         
	//    7   12:getfield        #194 <Field int mWidth>
	//    8   15:ireturn         
	}

	public int getWrapHeight()
	{
		return mWrapHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #475 <Field int mWrapHeight>
	//    2    4:ireturn         
	}

	public int getWrapWidth()
	{
		return mWrapWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #478 <Field int mWrapWidth>
	//    2    4:ireturn         
	}

	public int getX()
	{
		return mX;
	//    0    0:aload_0         
	//    1    1:getfield        #202 <Field int mX>
	//    2    4:ireturn         
	}

	public int getY()
	{
		return mY;
	//    0    0:aload_0         
	//    1    1:getfield        #204 <Field int mY>
	//    2    4:ireturn         
	}

	public boolean hasBaseline()
	{
		return mBaselineDistance > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #218 <Field int mBaselineDistance>
	//    2    4:ifle            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public void immediateConnect(ConstraintAnchor.Type type, ConstraintWidget constraintwidget, ConstraintAnchor.Type type1, int i, int j)
	{
		getAnchor(type).connect(constraintwidget.getAnchor(type1), i, j, ConstraintAnchor.Strength.STRONG, 0, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #340 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #340 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//    6   10:iload           4
	//    7   12:iload           5
	//    8   14:getstatic       #485 <Field ConstraintAnchor$Strength ConstraintAnchor$Strength.STRONG>
	//    9   17:iconst_0        
	//   10   18:iconst_1        
	//   11   19:invokevirtual   #489 <Method boolean ConstraintAnchor.connect(ConstraintAnchor, int, int, ConstraintAnchor$Strength, int, boolean)>
	//   12   22:pop             
	//   13   23:return          
	}

	public boolean isSpreadHeight()
	{
		return mMatchConstraintDefaultHeight == 0 && mDimensionRatio == 0.0F && mMatchConstraintMinHeight == 0 && mMatchConstraintMaxHeight == 0 && mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field int mMatchConstraintDefaultHeight>
	//    2    4:ifne            44
	//    3    7:aload_0         
	//    4    8:getfield        #198 <Field float mDimensionRatio>
	//    5   11:fconst_0        
	//    6   12:fcmpl           
	//    7   13:ifne            44
	//    8   16:aload_0         
	//    9   17:getfield        #116 <Field int mMatchConstraintMinHeight>
	//   10   20:ifne            44
	//   11   23:aload_0         
	//   12   24:getfield        #118 <Field int mMatchConstraintMaxHeight>
	//   13   27:ifne            44
	//   14   30:aload_0         
	//   15   31:getfield        #190 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//   16   34:iconst_1        
	//   17   35:aaload          
	//   18   36:getstatic       #378 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//   19   39:if_acmpne       44
	//   20   42:iconst_1        
	//   21   43:ireturn         
	//   22   44:iconst_0        
	//   23   45:ireturn         
	}

	public boolean isSpreadWidth()
	{
		int i = mMatchConstraintDefaultWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field int mMatchConstraintDefaultWidth>
	//    2    4:istore_1        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		boolean flag = flag1;
	//    5    7:iload_3         
	//    6    8:istore_2        
		if(i == 0)
	//*   7    9:iload_1         
	//*   8   10:ifne            58
		{
			flag = flag1;
	//    9   13:iload_3         
	//   10   14:istore_2        
			if(mDimensionRatio == 0.0F)
	//*  11   15:aload_0         
	//*  12   16:getfield        #198 <Field float mDimensionRatio>
	//*  13   19:fconst_0        
	//*  14   20:fcmpl           
	//*  15   21:ifne            58
			{
				flag = flag1;
	//   16   24:iload_3         
	//   17   25:istore_2        
				if(mMatchConstraintMinWidth == 0)
	//*  18   26:aload_0         
	//*  19   27:getfield        #110 <Field int mMatchConstraintMinWidth>
	//*  20   30:ifne            58
				{
					flag = flag1;
	//   21   33:iload_3         
	//   22   34:istore_2        
					if(mMatchConstraintMaxWidth == 0)
	//*  23   35:aload_0         
	//*  24   36:getfield        #112 <Field int mMatchConstraintMaxWidth>
	//*  25   39:ifne            58
					{
						flag = flag1;
	//   26   42:iload_3         
	//   27   43:istore_2        
						if(mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT)
	//*  28   44:aload_0         
	//*  29   45:getfield        #190 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//*  30   48:iconst_0        
	//*  31   49:aaload          
	//*  32   50:getstatic       #378 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//*  33   53:if_acmpne       58
							flag = true;
	//   34   56:iconst_1        
	//   35   57:istore_2        
					}
				}
			}
		}
		return flag;
	//   36   58:iload_2         
	//   37   59:ireturn         
	}

	public void reset()
	{
		mLeft.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field ConstraintAnchor mLeft>
	//    2    4:invokevirtual   #494 <Method void ConstraintAnchor.reset()>
		mTop.reset();
	//    3    7:aload_0         
	//    4    8:getfield        #147 <Field ConstraintAnchor mTop>
	//    5   11:invokevirtual   #494 <Method void ConstraintAnchor.reset()>
		mRight.reset();
	//    6   14:aload_0         
	//    7   15:getfield        #152 <Field ConstraintAnchor mRight>
	//    8   18:invokevirtual   #494 <Method void ConstraintAnchor.reset()>
		mBottom.reset();
	//    9   21:aload_0         
	//   10   22:getfield        #157 <Field ConstraintAnchor mBottom>
	//   11   25:invokevirtual   #494 <Method void ConstraintAnchor.reset()>
		mBaseline.reset();
	//   12   28:aload_0         
	//   13   29:getfield        #162 <Field ConstraintAnchor mBaseline>
	//   14   32:invokevirtual   #494 <Method void ConstraintAnchor.reset()>
		mCenterX.reset();
	//   15   35:aload_0         
	//   16   36:getfield        #167 <Field ConstraintAnchor mCenterX>
	//   17   39:invokevirtual   #494 <Method void ConstraintAnchor.reset()>
		mCenterY.reset();
	//   18   42:aload_0         
	//   19   43:getfield        #172 <Field ConstraintAnchor mCenterY>
	//   20   46:invokevirtual   #494 <Method void ConstraintAnchor.reset()>
		mCenter.reset();
	//   21   49:aload_0         
	//   22   50:getfield        #177 <Field ConstraintAnchor mCenter>
	//   23   53:invokevirtual   #494 <Method void ConstraintAnchor.reset()>
		mParent = null;
	//   24   56:aload_0         
	//   25   57:aconst_null     
	//   26   58:putfield        #192 <Field ConstraintWidget mParent>
		mCircleConstraintAngle = 0.0F;
	//   27   61:aload_0         
	//   28   62:fconst_0        
	//   29   63:putfield        #129 <Field float mCircleConstraintAngle>
		mWidth = 0;
	//   30   66:aload_0         
	//   31   67:iconst_0        
	//   32   68:putfield        #194 <Field int mWidth>
		mHeight = 0;
	//   33   71:aload_0         
	//   34   72:iconst_0        
	//   35   73:putfield        #196 <Field int mHeight>
		mDimensionRatio = 0.0F;
	//   36   76:aload_0         
	//   37   77:fconst_0        
	//   38   78:putfield        #198 <Field float mDimensionRatio>
		mDimensionRatioSide = -1;
	//   39   81:aload_0         
	//   40   82:iconst_m1       
	//   41   83:putfield        #200 <Field int mDimensionRatioSide>
		mX = 0;
	//   42   86:aload_0         
	//   43   87:iconst_0        
	//   44   88:putfield        #202 <Field int mX>
		mY = 0;
	//   45   91:aload_0         
	//   46   92:iconst_0        
	//   47   93:putfield        #204 <Field int mY>
		mDrawX = 0;
	//   48   96:aload_0         
	//   49   97:iconst_0        
	//   50   98:putfield        #206 <Field int mDrawX>
		mDrawY = 0;
	//   51  101:aload_0         
	//   52  102:iconst_0        
	//   53  103:putfield        #208 <Field int mDrawY>
		mDrawWidth = 0;
	//   54  106:aload_0         
	//   55  107:iconst_0        
	//   56  108:putfield        #210 <Field int mDrawWidth>
		mDrawHeight = 0;
	//   57  111:aload_0         
	//   58  112:iconst_0        
	//   59  113:putfield        #212 <Field int mDrawHeight>
		mOffsetX = 0;
	//   60  116:aload_0         
	//   61  117:iconst_0        
	//   62  118:putfield        #214 <Field int mOffsetX>
		mOffsetY = 0;
	//   63  121:aload_0         
	//   64  122:iconst_0        
	//   65  123:putfield        #216 <Field int mOffsetY>
		mBaselineDistance = 0;
	//   66  126:aload_0         
	//   67  127:iconst_0        
	//   68  128:putfield        #218 <Field int mBaselineDistance>
		mMinWidth = 0;
	//   69  131:aload_0         
	//   70  132:iconst_0        
	//   71  133:putfield        #373 <Field int mMinWidth>
		mMinHeight = 0;
	//   72  136:aload_0         
	//   73  137:iconst_0        
	//   74  138:putfield        #375 <Field int mMinHeight>
		mWrapWidth = 0;
	//   75  141:aload_0         
	//   76  142:iconst_0        
	//   77  143:putfield        #478 <Field int mWrapWidth>
		mWrapHeight = 0;
	//   78  146:aload_0         
	//   79  147:iconst_0        
	//   80  148:putfield        #475 <Field int mWrapHeight>
		float f = DEFAULT_BIAS;
	//   81  151:getstatic       #220 <Field float DEFAULT_BIAS>
	//   82  154:fstore_1        
		mHorizontalBiasPercent = f;
	//   83  155:aload_0         
	//   84  156:fload_1         
	//   85  157:putfield        #222 <Field float mHorizontalBiasPercent>
		mVerticalBiasPercent = f;
	//   86  160:aload_0         
	//   87  161:fload_1         
	//   88  162:putfield        #224 <Field float mVerticalBiasPercent>
		mListDimensionBehaviors[0] = DimensionBehaviour.FIXED;
	//   89  165:aload_0         
	//   90  166:getfield        #190 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//   91  169:iconst_0        
	//   92  170:getstatic       #188 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.FIXED>
	//   93  173:aastore         
		mListDimensionBehaviors[1] = DimensionBehaviour.FIXED;
	//   94  174:aload_0         
	//   95  175:getfield        #190 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//   96  178:iconst_1        
	//   97  179:getstatic       #188 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.FIXED>
	//   98  182:aastore         
		mCompanionWidget = null;
	//   99  183:aload_0         
	//  100  184:aconst_null     
	//  101  185:putfield        #444 <Field Object mCompanionWidget>
		mContainerItemSkip = 0;
	//  102  188:aload_0         
	//  103  189:iconst_0        
	//  104  190:putfield        #226 <Field int mContainerItemSkip>
		mVisibility = 0;
	//  105  193:aload_0         
	//  106  194:iconst_0        
	//  107  195:putfield        #228 <Field int mVisibility>
		mType = null;
	//  108  198:aload_0         
	//  109  199:aconst_null     
	//  110  200:putfield        #232 <Field String mType>
		mHorizontalWrapVisited = false;
	//  111  203:aload_0         
	//  112  204:iconst_0        
	//  113  205:putfield        #496 <Field boolean mHorizontalWrapVisited>
		mVerticalWrapVisited = false;
	//  114  208:aload_0         
	//  115  209:iconst_0        
	//  116  210:putfield        #498 <Field boolean mVerticalWrapVisited>
		mHorizontalChainStyle = 0;
	//  117  213:aload_0         
	//  118  214:iconst_0        
	//  119  215:putfield        #234 <Field int mHorizontalChainStyle>
		mVerticalChainStyle = 0;
	//  120  218:aload_0         
	//  121  219:iconst_0        
	//  122  220:putfield        #236 <Field int mVerticalChainStyle>
		mHorizontalChainFixedPosition = false;
	//  123  223:aload_0         
	//  124  224:iconst_0        
	//  125  225:putfield        #500 <Field boolean mHorizontalChainFixedPosition>
		mVerticalChainFixedPosition = false;
	//  126  228:aload_0         
	//  127  229:iconst_0        
	//  128  230:putfield        #502 <Field boolean mVerticalChainFixedPosition>
		float af[] = mWeight;
	//  129  233:aload_0         
	//  130  234:getfield        #239 <Field float[] mWeight>
	//  131  237:astore_2        
		af[0] = -1F;
	//  132  238:aload_2         
	//  133  239:iconst_0        
	//  134  240:ldc1            #237 <Float -1F>
	//  135  242:fastore         
		af[1] = -1F;
	//  136  243:aload_2         
	//  137  244:iconst_1        
	//  138  245:ldc1            #237 <Float -1F>
	//  139  247:fastore         
		mHorizontalResolution = -1;
	//  140  248:aload_0         
	//  141  249:iconst_m1       
	//  142  250:putfield        #100 <Field int mHorizontalResolution>
		mVerticalResolution = -1;
	//  143  253:aload_0         
	//  144  254:iconst_m1       
	//  145  255:putfield        #102 <Field int mVerticalResolution>
		af = ((float []) (mMaxDimension));
	//  146  258:aload_0         
	//  147  259:getfield        #127 <Field int[] mMaxDimension>
	//  148  262:astore_2        
		af[0] = 0x7fffffff;
	//  149  263:aload_2         
	//  150  264:iconst_0        
	//  151  265:ldc1            #125 <Int 0x7fffffff>
	//  152  267:iastore         
		af[1] = 0x7fffffff;
	//  153  268:aload_2         
	//  154  269:iconst_1        
	//  155  270:ldc1            #125 <Int 0x7fffffff>
	//  156  272:iastore         
		mMatchConstraintDefaultWidth = 0;
	//  157  273:aload_0         
	//  158  274:iconst_0        
	//  159  275:putfield        #104 <Field int mMatchConstraintDefaultWidth>
		mMatchConstraintDefaultHeight = 0;
	//  160  278:aload_0         
	//  161  279:iconst_0        
	//  162  280:putfield        #106 <Field int mMatchConstraintDefaultHeight>
		mMatchConstraintPercentWidth = 1.0F;
	//  163  283:aload_0         
	//  164  284:fconst_1        
	//  165  285:putfield        #114 <Field float mMatchConstraintPercentWidth>
		mMatchConstraintPercentHeight = 1.0F;
	//  166  288:aload_0         
	//  167  289:fconst_1        
	//  168  290:putfield        #120 <Field float mMatchConstraintPercentHeight>
		mMatchConstraintMaxWidth = 0x7fffffff;
	//  169  293:aload_0         
	//  170  294:ldc1            #125 <Int 0x7fffffff>
	//  171  296:putfield        #112 <Field int mMatchConstraintMaxWidth>
		mMatchConstraintMaxHeight = 0x7fffffff;
	//  172  299:aload_0         
	//  173  300:ldc1            #125 <Int 0x7fffffff>
	//  174  302:putfield        #118 <Field int mMatchConstraintMaxHeight>
		mMatchConstraintMinWidth = 0;
	//  175  305:aload_0         
	//  176  306:iconst_0        
	//  177  307:putfield        #110 <Field int mMatchConstraintMinWidth>
		mMatchConstraintMinHeight = 0;
	//  178  310:aload_0         
	//  179  311:iconst_0        
	//  180  312:putfield        #116 <Field int mMatchConstraintMinHeight>
		mResolvedDimensionRatioSide = -1;
	//  181  315:aload_0         
	//  182  316:iconst_m1       
	//  183  317:putfield        #122 <Field int mResolvedDimensionRatioSide>
		mResolvedDimensionRatio = 1.0F;
	//  184  320:aload_0         
	//  185  321:fconst_1        
	//  186  322:putfield        #124 <Field float mResolvedDimensionRatio>
		ResolutionDimension resolutiondimension = mResolutionWidth;
	//  187  325:aload_0         
	//  188  326:getfield        #463 <Field ResolutionDimension mResolutionWidth>
	//  189  329:astore_2        
		if(resolutiondimension != null)
	//* 190  330:aload_2         
	//* 191  331:ifnull          338
			resolutiondimension.reset();
	//  192  334:aload_2         
	//  193  335:invokevirtual   #503 <Method void ResolutionDimension.reset()>
		resolutiondimension = mResolutionHeight;
	//  194  338:aload_0         
	//  195  339:getfield        #457 <Field ResolutionDimension mResolutionHeight>
	//  196  342:astore_2        
		if(resolutiondimension != null)
	//* 197  343:aload_2         
	//* 198  344:ifnull          351
			resolutiondimension.reset();
	//  199  347:aload_2         
	//  200  348:invokevirtual   #503 <Method void ResolutionDimension.reset()>
	//  201  351:return          
	}

	public void resetAnchors()
	{
		ConstraintWidget constraintwidget = getParent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #506 <Method ConstraintWidget getParent()>
	//    2    4:astore_3        
		if(constraintwidget != null && (constraintwidget instanceof ConstraintWidgetContainer) && ((ConstraintWidgetContainer)getParent()).handlesInternalConstraints())
	//*   3    5:aload_3         
	//*   4    6:ifnull          30
	//*   5    9:aload_3         
	//*   6   10:instanceof      #367 <Class ConstraintWidgetContainer>
	//*   7   13:ifeq            30
	//*   8   16:aload_0         
	//*   9   17:invokevirtual   #506 <Method ConstraintWidget getParent()>
	//*  10   20:checkcast       #367 <Class ConstraintWidgetContainer>
	//*  11   23:invokevirtual   #509 <Method boolean ConstraintWidgetContainer.handlesInternalConstraints()>
	//*  12   26:ifeq            30
			return;
	//   13   29:return          
		int i = 0;
	//   14   30:iconst_0        
	//   15   31:istore_1        
		for(int j = mAnchors.size(); i < j; i++)
	//*  16   32:aload_0         
	//*  17   33:getfield        #184 <Field ArrayList mAnchors>
	//*  18   36:invokevirtual   #512 <Method int ArrayList.size()>
	//*  19   39:istore_2        
	//*  20   40:iload_1         
	//*  21   41:iload_2         
	//*  22   42:icmpge          66
			((ConstraintAnchor)mAnchors.get(i)).reset();
	//   23   45:aload_0         
	//   24   46:getfield        #184 <Field ArrayList mAnchors>
	//   25   49:iload_1         
	//   26   50:invokevirtual   #516 <Method Object ArrayList.get(int)>
	//   27   53:checkcast       #131 <Class ConstraintAnchor>
	//   28   56:invokevirtual   #494 <Method void ConstraintAnchor.reset()>

	//   29   59:iload_1         
	//   30   60:iconst_1        
	//   31   61:iadd            
	//   32   62:istore_1        
	//*  33   63:goto            40
	//   34   66:return          
	}

	public void resetResolutionNodes()
	{
		for(int i = 0; i < 6; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:bipush          6
	//*   4    5:icmpge          27
			mListAnchors[i].getResolutionNode().reset();
	//    5    8:aload_0         
	//    6    9:getfield        #179 <Field ConstraintAnchor[] mListAnchors>
	//    7   12:iload_1         
	//    8   13:aaload          
	//    9   14:invokevirtual   #273 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   10   17:invokevirtual   #518 <Method void ResolutionAnchor.reset()>

	//   11   20:iload_1         
	//   12   21:iconst_1        
	//   13   22:iadd            
	//   14   23:istore_1        
	//*  15   24:goto            2
	//   16   27:return          
	}

	public void resetSolverVariables(Cache cache)
	{
		mLeft.resetSolverVariable(cache);
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field ConstraintAnchor mLeft>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #523 <Method void ConstraintAnchor.resetSolverVariable(Cache)>
		mTop.resetSolverVariable(cache);
	//    4    8:aload_0         
	//    5    9:getfield        #147 <Field ConstraintAnchor mTop>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #523 <Method void ConstraintAnchor.resetSolverVariable(Cache)>
		mRight.resetSolverVariable(cache);
	//    8   16:aload_0         
	//    9   17:getfield        #152 <Field ConstraintAnchor mRight>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #523 <Method void ConstraintAnchor.resetSolverVariable(Cache)>
		mBottom.resetSolverVariable(cache);
	//   12   24:aload_0         
	//   13   25:getfield        #157 <Field ConstraintAnchor mBottom>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #523 <Method void ConstraintAnchor.resetSolverVariable(Cache)>
		mBaseline.resetSolverVariable(cache);
	//   16   32:aload_0         
	//   17   33:getfield        #162 <Field ConstraintAnchor mBaseline>
	//   18   36:aload_1         
	//   19   37:invokevirtual   #523 <Method void ConstraintAnchor.resetSolverVariable(Cache)>
		mCenter.resetSolverVariable(cache);
	//   20   40:aload_0         
	//   21   41:getfield        #177 <Field ConstraintAnchor mCenter>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #523 <Method void ConstraintAnchor.resetSolverVariable(Cache)>
		mCenterX.resetSolverVariable(cache);
	//   24   48:aload_0         
	//   25   49:getfield        #167 <Field ConstraintAnchor mCenterX>
	//   26   52:aload_1         
	//   27   53:invokevirtual   #523 <Method void ConstraintAnchor.resetSolverVariable(Cache)>
		mCenterY.resetSolverVariable(cache);
	//   28   56:aload_0         
	//   29   57:getfield        #172 <Field ConstraintAnchor mCenterY>
	//   30   60:aload_1         
	//   31   61:invokevirtual   #523 <Method void ConstraintAnchor.resetSolverVariable(Cache)>
	//   32   64:return          
	}

	public void resolve()
	{
	//    0    0:return          
	}

	public void setBaselineDistance(int i)
	{
		mBaselineDistance = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #218 <Field int mBaselineDistance>
	//    3    5:return          
	}

	public void setCompanionWidget(Object obj)
	{
		mCompanionWidget = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #444 <Field Object mCompanionWidget>
	//    3    5:return          
	}

	public void setDebugName(String s)
	{
		mDebugName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #230 <Field String mDebugName>
	//    3    5:return          
	}

	public void setDimensionRatio(String s)
	{
		if(s != null && s.length() != 0) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnull          271
	//    2    4:aload_1         
	//    3    5:invokevirtual   #536 <Method int String.length()>
	//    4    8:ifne            14
	//*   5   11:goto            271
_L2:
		int i;
		int j;
		int k;
		int l;
		k = -1;
	//    6   14:iconst_m1       
	//    7   15:istore          6
		l = s.length();
	//    8   17:aload_1         
	//    9   18:invokevirtual   #536 <Method int String.length()>
	//   10   21:istore          8
		int i1 = s.indexOf(',');
	//   11   23:aload_1         
	//   12   24:bipush          44
	//   13   26:invokevirtual   #540 <Method int String.indexOf(int)>
	//   14   29:istore          9
		boolean flag = false;
	//   15   31:iconst_0        
	//   16   32:istore          7
		i = k;
	//   17   34:iload           6
	//   18   36:istore          4
		j = ((int) (flag));
	//   19   38:iload           7
	//   20   40:istore          5
		if(i1 > 0)
	//*  21   42:iload           9
	//*  22   44:ifle            114
		{
			i = k;
	//   23   47:iload           6
	//   24   49:istore          4
			j = ((int) (flag));
	//   25   51:iload           7
	//   26   53:istore          5
			if(i1 < l - 1)
	//*  27   55:iload           9
	//*  28   57:iload           8
	//*  29   59:iconst_1        
	//*  30   60:isub            
	//*  31   61:icmpge          114
			{
				String s1 = s.substring(0, i1);
	//   32   64:aload_1         
	//   33   65:iconst_0        
	//   34   66:iload           9
	//   35   68:invokevirtual   #544 <Method String String.substring(int, int)>
	//   36   71:astore          10
				if(s1.equalsIgnoreCase("W"))
	//*  37   73:aload           10
	//*  38   75:ldc2            #546 <String "W">
	//*  39   78:invokevirtual   #550 <Method boolean String.equalsIgnoreCase(String)>
	//*  40   81:ifeq            90
				{
					i = 0;
	//   41   84:iconst_0        
	//   42   85:istore          4
				} else
	//*  43   87:goto            108
				{
					i = k;
	//   44   90:iload           6
	//   45   92:istore          4
					if(s1.equalsIgnoreCase("H"))
	//*  46   94:aload           10
	//*  47   96:ldc2            #552 <String "H">
	//*  48   99:invokevirtual   #550 <Method boolean String.equalsIgnoreCase(String)>
	//*  49  102:ifeq            108
						i = 1;
	//   50  105:iconst_1        
	//   51  106:istore          4
				}
				j = i1 + 1;
	//   52  108:iload           9
	//   53  110:iconst_1        
	//   54  111:iadd            
	//   55  112:istore          5
			}
		}
		k = s.indexOf(':');
	//   56  114:aload_1         
	//   57  115:bipush          58
	//   58  117:invokevirtual   #540 <Method int String.indexOf(int)>
	//   59  120:istore          6
		if(k < 0 || k >= l - 1) goto _L4; else goto _L3
	//   60  122:iload           6
	//   61  124:iflt            229
	//   62  127:iload           6
	//   63  129:iload           8
	//   64  131:iconst_1        
	//   65  132:isub            
	//   66  133:icmpge          229
_L3:
		String s2;
		s2 = s.substring(j, k);
	//   67  136:aload_1         
	//   68  137:iload           5
	//   69  139:iload           6
	//   70  141:invokevirtual   #544 <Method String String.substring(int, int)>
	//   71  144:astore          10
		s = s.substring(k + 1);
	//   72  146:aload_1         
	//   73  147:iload           6
	//   74  149:iconst_1        
	//   75  150:iadd            
	//   76  151:invokevirtual   #555 <Method String String.substring(int)>
	//   77  154:astore_1        
		if(s2.length() <= 0 || s.length() <= 0) goto _L6; else goto _L5
	//   78  155:aload           10
	//   79  157:invokevirtual   #536 <Method int String.length()>
	//   80  160:ifle            224
	//   81  163:aload_1         
	//   82  164:invokevirtual   #536 <Method int String.length()>
	//   83  167:ifle            224
_L5:
		float f;
		float f1;
		f = Float.parseFloat(s2);
	//   84  170:aload           10
	//   85  172:invokestatic    #561 <Method float Float.parseFloat(String)>
	//   86  175:fstore_2        
		f1 = Float.parseFloat(s);
	//   87  176:aload_1         
	//   88  177:invokestatic    #561 <Method float Float.parseFloat(String)>
	//   89  180:fstore_3        
		if(f <= 0.0F || f1 <= 0.0F) goto _L8; else goto _L7
	//   90  181:fload_2         
	//   91  182:fconst_0        
	//   92  183:fcmpl           
	//   93  184:ifle            219
	//   94  187:fload_3         
	//   95  188:fconst_0        
	//   96  189:fcmpl           
	//   97  190:ifle            219
_L7:
		if(i != 1) goto _L10; else goto _L9
	//   98  193:iload           4
	//   99  195:iconst_1        
	//  100  196:icmpne          209
_L9:
		f = Math.abs(f1 / f);
	//  101  199:fload_3         
	//  102  200:fload_2         
	//  103  201:fdiv            
	//  104  202:invokestatic    #565 <Method float Math.abs(float)>
	//  105  205:fstore_2        
		  goto _L11
	//* 106  206:goto            253
_L10:
		f = Math.abs(f / f1);
	//  107  209:fload_2         
	//  108  210:fload_3         
	//  109  211:fdiv            
	//  110  212:invokestatic    #565 <Method float Math.abs(float)>
	//  111  215:fstore_2        
		  goto _L11
	//* 112  216:goto            253
_L8:
		f = 0.0F;
	//  113  219:fconst_0        
	//  114  220:fstore_2        
		  goto _L11
	//* 115  221:goto            253
_L6:
		f = 0.0F;
	//  116  224:fconst_0        
	//  117  225:fstore_2        
		  goto _L11
	//* 118  226:goto            253
_L4:
		s = s.substring(j);
	//  119  229:aload_1         
	//  120  230:iload           5
	//  121  232:invokevirtual   #555 <Method String String.substring(int)>
	//  122  235:astore_1        
		if(s.length() <= 0) goto _L13; else goto _L12
	//  123  236:aload_1         
	//  124  237:invokevirtual   #536 <Method int String.length()>
	//  125  240:ifle            251
_L12:
		f = Float.parseFloat(s);
	//  126  243:aload_1         
	//  127  244:invokestatic    #561 <Method float Float.parseFloat(String)>
	//  128  247:fstore_2        
		  goto _L11
	//* 129  248:goto            253
_L13:
		f = 0.0F;
	//  130  251:fconst_0        
	//  131  252:fstore_2        
_L11:
		if(f > 0.0F)
	//* 132  253:fload_2         
	//* 133  254:fconst_0        
	//* 134  255:fcmpl           
	//* 135  256:ifle            270
		{
			mDimensionRatio = f;
	//  136  259:aload_0         
	//  137  260:fload_2         
	//  138  261:putfield        #198 <Field float mDimensionRatio>
			mDimensionRatioSide = i;
	//  139  264:aload_0         
	//  140  265:iload           4
	//  141  267:putfield        #200 <Field int mDimensionRatioSide>
		}
		return;
	//  142  270:return          
_L1:
		mDimensionRatio = 0.0F;
	//  143  271:aload_0         
	//  144  272:fconst_0        
	//  145  273:putfield        #198 <Field float mDimensionRatio>
		return;
	//  146  276:return          
		s;
	//  147  277:astore_1        
		  goto _L6
	//* 148  278:goto            224
		s;
	//  149  281:astore_1        
		  goto _L13
	//* 150  282:goto            251
	}

	public void setFrame(int i, int j, int k, int l)
	{
label0:
		{
			int i1 = k - i;
	//    0    0:iload_3         
	//    1    1:iload_1         
	//    2    2:isub            
	//    3    3:istore          5
			k = l - j;
	//    4    5:iload           4
	//    5    7:iload_2         
	//    6    8:isub            
	//    7    9:istore_3        
			mX = i;
	//    8   10:aload_0         
	//    9   11:iload_1         
	//   10   12:putfield        #202 <Field int mX>
			mY = j;
	//   11   15:aload_0         
	//   12   16:iload_2         
	//   13   17:putfield        #204 <Field int mY>
			if(mVisibility == 8)
	//*  14   20:aload_0         
	//*  15   21:getfield        #228 <Field int mVisibility>
	//*  16   24:bipush          8
	//*  17   26:icmpne          40
			{
				mWidth = 0;
	//   18   29:aload_0         
	//   19   30:iconst_0        
	//   20   31:putfield        #194 <Field int mWidth>
				mHeight = 0;
	//   21   34:aload_0         
	//   22   35:iconst_0        
	//   23   36:putfield        #196 <Field int mHeight>
				return;
	//   24   39:return          
			}
			if(mListDimensionBehaviors[0] == DimensionBehaviour.FIXED)
	//*  25   40:aload_0         
	//*  26   41:getfield        #190 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//*  27   44:iconst_0        
	//*  28   45:aaload          
	//*  29   46:getstatic       #188 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.FIXED>
	//*  30   49:if_acmpne       66
			{
				i = mWidth;
	//   31   52:aload_0         
	//   32   53:getfield        #194 <Field int mWidth>
	//   33   56:istore_1        
				if(i1 < i)
	//*  34   57:iload           5
	//*  35   59:iload_1         
	//*  36   60:icmpge          66
					break label0;
	//   37   63:goto            69
			}
			i = i1;
	//   38   66:iload           5
	//   39   68:istore_1        
		}
label1:
		{
			if(mListDimensionBehaviors[1] == DimensionBehaviour.FIXED)
	//*  40   69:aload_0         
	//*  41   70:getfield        #190 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//*  42   73:iconst_1        
	//*  43   74:aaload          
	//*  44   75:getstatic       #188 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.FIXED>
	//*  45   78:if_acmpne       94
			{
				j = mHeight;
	//   46   81:aload_0         
	//   47   82:getfield        #196 <Field int mHeight>
	//   48   85:istore_2        
				if(k < j)
	//*  49   86:iload_3         
	//*  50   87:iload_2         
	//*  51   88:icmpge          94
					break label1;
	//   52   91:goto            96
			}
			j = k;
	//   53   94:iload_3         
	//   54   95:istore_2        
		}
		mWidth = i;
	//   55   96:aload_0         
	//   56   97:iload_1         
	//   57   98:putfield        #194 <Field int mWidth>
		mHeight = j;
	//   58  101:aload_0         
	//   59  102:iload_2         
	//   60  103:putfield        #196 <Field int mHeight>
		i = mHeight;
	//   61  106:aload_0         
	//   62  107:getfield        #196 <Field int mHeight>
	//   63  110:istore_1        
		j = mMinHeight;
	//   64  111:aload_0         
	//   65  112:getfield        #375 <Field int mMinHeight>
	//   66  115:istore_2        
		if(i < j)
	//*  67  116:iload_1         
	//*  68  117:iload_2         
	//*  69  118:icmpge          126
			mHeight = j;
	//   70  121:aload_0         
	//   71  122:iload_2         
	//   72  123:putfield        #196 <Field int mHeight>
		i = mWidth;
	//   73  126:aload_0         
	//   74  127:getfield        #194 <Field int mWidth>
	//   75  130:istore_1        
		j = mMinWidth;
	//   76  131:aload_0         
	//   77  132:getfield        #373 <Field int mMinWidth>
	//   78  135:istore_2        
		if(i < j)
	//*  79  136:iload_1         
	//*  80  137:iload_2         
	//*  81  138:icmpge          146
			mWidth = j;
	//   82  141:aload_0         
	//   83  142:iload_2         
	//   84  143:putfield        #194 <Field int mWidth>
	//   85  146:return          
	}

	public void setHeight(int i)
	{
		mHeight = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #196 <Field int mHeight>
		i = mHeight;
	//    3    5:aload_0         
	//    4    6:getfield        #196 <Field int mHeight>
	//    5    9:istore_1        
		int j = mMinHeight;
	//    6   10:aload_0         
	//    7   11:getfield        #375 <Field int mMinHeight>
	//    8   14:istore_2        
		if(i < j)
	//*   9   15:iload_1         
	//*  10   16:iload_2         
	//*  11   17:icmpge          25
			mHeight = j;
	//   12   20:aload_0         
	//   13   21:iload_2         
	//   14   22:putfield        #196 <Field int mHeight>
	//   15   25:return          
	}

	public void setHeightWrapContent(boolean flag)
	{
		mIsHeightWrapContent = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #572 <Field boolean mIsHeightWrapContent>
	//    3    5:return          
	}

	public void setHorizontalBiasPercent(float f)
	{
		mHorizontalBiasPercent = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #222 <Field float mHorizontalBiasPercent>
	//    3    5:return          
	}

	public void setHorizontalChainStyle(int i)
	{
		mHorizontalChainStyle = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #234 <Field int mHorizontalChainStyle>
	//    3    5:return          
	}

	public void setHorizontalDimension(int i, int j)
	{
		mX = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #202 <Field int mX>
		mWidth = j - i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:iload_1         
	//    6    8:isub            
	//    7    9:putfield        #194 <Field int mWidth>
		i = mWidth;
	//    8   12:aload_0         
	//    9   13:getfield        #194 <Field int mWidth>
	//   10   16:istore_1        
		j = mMinWidth;
	//   11   17:aload_0         
	//   12   18:getfield        #373 <Field int mMinWidth>
	//   13   21:istore_2        
		if(i < j)
	//*  14   22:iload_1         
	//*  15   23:iload_2         
	//*  16   24:icmpge          32
			mWidth = j;
	//   17   27:aload_0         
	//   18   28:iload_2         
	//   19   29:putfield        #194 <Field int mWidth>
	//   20   32:return          
	}

	public void setHorizontalDimensionBehaviour(DimensionBehaviour dimensionbehaviour)
	{
		mListDimensionBehaviors[0] = dimensionbehaviour;
	//    0    0:aload_0         
	//    1    1:getfield        #190 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//    2    4:iconst_0        
	//    3    5:aload_1         
	//    4    6:aastore         
		if(dimensionbehaviour == DimensionBehaviour.WRAP_CONTENT)
	//*   5    7:aload_1         
	//*   6    8:getstatic       #362 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//*   7   11:if_acmpne       22
			setWidth(mWrapWidth);
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #478 <Field int mWrapWidth>
	//   11   19:invokevirtual   #582 <Method void setWidth(int)>
	//   12   22:return          
	}

	public void setHorizontalMatchStyle(int i, int j, int k, float f)
	{
		mMatchConstraintDefaultWidth = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #104 <Field int mMatchConstraintDefaultWidth>
		mMatchConstraintMinWidth = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #110 <Field int mMatchConstraintMinWidth>
		mMatchConstraintMaxWidth = k;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #112 <Field int mMatchConstraintMaxWidth>
		mMatchConstraintPercentWidth = f;
	//    9   15:aload_0         
	//   10   16:fload           4
	//   11   18:putfield        #114 <Field float mMatchConstraintPercentWidth>
		if(f < 1.0F && mMatchConstraintDefaultWidth == 0)
	//*  12   21:fload           4
	//*  13   23:fconst_1        
	//*  14   24:fcmpg           
	//*  15   25:ifge            40
	//*  16   28:aload_0         
	//*  17   29:getfield        #104 <Field int mMatchConstraintDefaultWidth>
	//*  18   32:ifne            40
			mMatchConstraintDefaultWidth = 2;
	//   19   35:aload_0         
	//   20   36:iconst_2        
	//   21   37:putfield        #104 <Field int mMatchConstraintDefaultWidth>
	//   22   40:return          
	}

	public void setHorizontalWeight(float f)
	{
		mWeight[0] = f;
	//    0    0:aload_0         
	//    1    1:getfield        #239 <Field float[] mWeight>
	//    2    4:iconst_0        
	//    3    5:fload_1         
	//    4    6:fastore         
	//    5    7:return          
	}

	public void setMaxHeight(int i)
	{
		mMaxDimension[1] = i;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field int[] mMaxDimension>
	//    2    4:iconst_1        
	//    3    5:iload_1         
	//    4    6:iastore         
	//    5    7:return          
	}

	public void setMaxWidth(int i)
	{
		mMaxDimension[0] = i;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field int[] mMaxDimension>
	//    2    4:iconst_0        
	//    3    5:iload_1         
	//    4    6:iastore         
	//    5    7:return          
	}

	public void setMinHeight(int i)
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            10
		{
			mMinHeight = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #375 <Field int mMinHeight>
			return;
	//    5    9:return          
		} else
		{
			mMinHeight = i;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:putfield        #375 <Field int mMinHeight>
			return;
	//    9   15:return          
		}
	}

	public void setMinWidth(int i)
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            10
		{
			mMinWidth = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #373 <Field int mMinWidth>
			return;
	//    5    9:return          
		} else
		{
			mMinWidth = i;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:putfield        #373 <Field int mMinWidth>
			return;
	//    9   15:return          
		}
	}

	public void setOffset(int i, int j)
	{
		mOffsetX = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #214 <Field int mOffsetX>
		mOffsetY = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #216 <Field int mOffsetY>
	//    6   10:return          
	}

	public void setOrigin(int i, int j)
	{
		mX = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #202 <Field int mX>
		mY = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #204 <Field int mY>
	//    6   10:return          
	}

	public void setParent(ConstraintWidget constraintwidget)
	{
		mParent = constraintwidget;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #192 <Field ConstraintWidget mParent>
	//    3    5:return          
	}

	public void setVerticalBiasPercent(float f)
	{
		mVerticalBiasPercent = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #224 <Field float mVerticalBiasPercent>
	//    3    5:return          
	}

	public void setVerticalChainStyle(int i)
	{
		mVerticalChainStyle = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #236 <Field int mVerticalChainStyle>
	//    3    5:return          
	}

	public void setVerticalDimension(int i, int j)
	{
		mY = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #204 <Field int mY>
		mHeight = j - i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:iload_1         
	//    6    8:isub            
	//    7    9:putfield        #196 <Field int mHeight>
		i = mHeight;
	//    8   12:aload_0         
	//    9   13:getfield        #196 <Field int mHeight>
	//   10   16:istore_1        
		j = mMinHeight;
	//   11   17:aload_0         
	//   12   18:getfield        #375 <Field int mMinHeight>
	//   13   21:istore_2        
		if(i < j)
	//*  14   22:iload_1         
	//*  15   23:iload_2         
	//*  16   24:icmpge          32
			mHeight = j;
	//   17   27:aload_0         
	//   18   28:iload_2         
	//   19   29:putfield        #196 <Field int mHeight>
	//   20   32:return          
	}

	public void setVerticalDimensionBehaviour(DimensionBehaviour dimensionbehaviour)
	{
		mListDimensionBehaviors[1] = dimensionbehaviour;
	//    0    0:aload_0         
	//    1    1:getfield        #190 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//    2    4:iconst_1        
	//    3    5:aload_1         
	//    4    6:aastore         
		if(dimensionbehaviour == DimensionBehaviour.WRAP_CONTENT)
	//*   5    7:aload_1         
	//*   6    8:getstatic       #362 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//*   7   11:if_acmpne       22
			setHeight(mWrapHeight);
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #475 <Field int mWrapHeight>
	//   11   19:invokevirtual   #599 <Method void setHeight(int)>
	//   12   22:return          
	}

	public void setVerticalMatchStyle(int i, int j, int k, float f)
	{
		mMatchConstraintDefaultHeight = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #106 <Field int mMatchConstraintDefaultHeight>
		mMatchConstraintMinHeight = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #116 <Field int mMatchConstraintMinHeight>
		mMatchConstraintMaxHeight = k;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #118 <Field int mMatchConstraintMaxHeight>
		mMatchConstraintPercentHeight = f;
	//    9   15:aload_0         
	//   10   16:fload           4
	//   11   18:putfield        #120 <Field float mMatchConstraintPercentHeight>
		if(f < 1.0F && mMatchConstraintDefaultHeight == 0)
	//*  12   21:fload           4
	//*  13   23:fconst_1        
	//*  14   24:fcmpg           
	//*  15   25:ifge            40
	//*  16   28:aload_0         
	//*  17   29:getfield        #106 <Field int mMatchConstraintDefaultHeight>
	//*  18   32:ifne            40
			mMatchConstraintDefaultHeight = 2;
	//   19   35:aload_0         
	//   20   36:iconst_2        
	//   21   37:putfield        #106 <Field int mMatchConstraintDefaultHeight>
	//   22   40:return          
	}

	public void setVerticalWeight(float f)
	{
		mWeight[1] = f;
	//    0    0:aload_0         
	//    1    1:getfield        #239 <Field float[] mWeight>
	//    2    4:iconst_1        
	//    3    5:fload_1         
	//    4    6:fastore         
	//    5    7:return          
	}

	public void setVisibility(int i)
	{
		mVisibility = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #228 <Field int mVisibility>
	//    3    5:return          
	}

	public void setWidth(int i)
	{
		mWidth = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #194 <Field int mWidth>
		i = mWidth;
	//    3    5:aload_0         
	//    4    6:getfield        #194 <Field int mWidth>
	//    5    9:istore_1        
		int j = mMinWidth;
	//    6   10:aload_0         
	//    7   11:getfield        #373 <Field int mMinWidth>
	//    8   14:istore_2        
		if(i < j)
	//*   9   15:iload_1         
	//*  10   16:iload_2         
	//*  11   17:icmpge          25
			mWidth = j;
	//   12   20:aload_0         
	//   13   21:iload_2         
	//   14   22:putfield        #194 <Field int mWidth>
	//   15   25:return          
	}

	public void setWidthWrapContent(boolean flag)
	{
		mIsWidthWrapContent = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #605 <Field boolean mIsWidthWrapContent>
	//    3    5:return          
	}

	public void setWrapHeight(int i)
	{
		mWrapHeight = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #475 <Field int mWrapHeight>
	//    3    5:return          
	}

	public void setWrapWidth(int i)
	{
		mWrapWidth = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #478 <Field int mWrapWidth>
	//    3    5:return          
	}

	public void setX(int i)
	{
		mX = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #202 <Field int mX>
	//    3    5:return          
	}

	public void setY(int i)
	{
		mY = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #204 <Field int mY>
	//    3    5:return          
	}

	public void setupDimensionRatio(boolean flag, boolean flag1, boolean flag2, boolean flag3)
	{
		if(mResolvedDimensionRatioSide == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #122 <Field int mResolvedDimensionRatioSide>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          57
			if(flag2 && !flag3)
	//*   4    8:iload_3         
	//*   5    9:ifeq            25
	//*   6   12:iload           4
	//*   7   14:ifne            25
				mResolvedDimensionRatioSide = 0;
	//    8   17:aload_0         
	//    9   18:iconst_0        
	//   10   19:putfield        #122 <Field int mResolvedDimensionRatioSide>
			else
	//*  11   22:goto            57
			if(!flag2 && flag3)
	//*  12   25:iload_3         
	//*  13   26:ifne            57
	//*  14   29:iload           4
	//*  15   31:ifeq            57
			{
				mResolvedDimensionRatioSide = 1;
	//   16   34:aload_0         
	//   17   35:iconst_1        
	//   18   36:putfield        #122 <Field int mResolvedDimensionRatioSide>
				if(mDimensionRatioSide == -1)
	//*  19   39:aload_0         
	//*  20   40:getfield        #200 <Field int mDimensionRatioSide>
	//*  21   43:iconst_m1       
	//*  22   44:icmpne          57
					mResolvedDimensionRatio = 1.0F / mResolvedDimensionRatio;
	//   23   47:aload_0         
	//   24   48:fconst_1        
	//   25   49:aload_0         
	//   26   50:getfield        #124 <Field float mResolvedDimensionRatio>
	//   27   53:fdiv            
	//   28   54:putfield        #124 <Field float mResolvedDimensionRatio>
			}
		if(mResolvedDimensionRatioSide == 0 && (!mTop.isConnected() || !mBottom.isConnected()))
	//*  29   57:aload_0         
	//*  30   58:getfield        #122 <Field int mResolvedDimensionRatioSide>
	//*  31   61:ifne            92
	//*  32   64:aload_0         
	//*  33   65:getfield        #147 <Field ConstraintAnchor mTop>
	//*  34   68:invokevirtual   #303 <Method boolean ConstraintAnchor.isConnected()>
	//*  35   71:ifeq            84
	//*  36   74:aload_0         
	//*  37   75:getfield        #157 <Field ConstraintAnchor mBottom>
	//*  38   78:invokevirtual   #303 <Method boolean ConstraintAnchor.isConnected()>
	//*  39   81:ifne            92
			mResolvedDimensionRatioSide = 1;
	//   40   84:aload_0         
	//   41   85:iconst_1        
	//   42   86:putfield        #122 <Field int mResolvedDimensionRatioSide>
		else
	//*  43   89:goto            125
		if(mResolvedDimensionRatioSide == 1 && (!mLeft.isConnected() || !mRight.isConnected()))
	//*  44   92:aload_0         
	//*  45   93:getfield        #122 <Field int mResolvedDimensionRatioSide>
	//*  46   96:iconst_1        
	//*  47   97:icmpne          125
	//*  48  100:aload_0         
	//*  49  101:getfield        #142 <Field ConstraintAnchor mLeft>
	//*  50  104:invokevirtual   #303 <Method boolean ConstraintAnchor.isConnected()>
	//*  51  107:ifeq            120
	//*  52  110:aload_0         
	//*  53  111:getfield        #152 <Field ConstraintAnchor mRight>
	//*  54  114:invokevirtual   #303 <Method boolean ConstraintAnchor.isConnected()>
	//*  55  117:ifne            125
			mResolvedDimensionRatioSide = 0;
	//   56  120:aload_0         
	//   57  121:iconst_0        
	//   58  122:putfield        #122 <Field int mResolvedDimensionRatioSide>
		if(mResolvedDimensionRatioSide == -1 && (!mTop.isConnected() || !mBottom.isConnected() || !mLeft.isConnected() || !mRight.isConnected()))
	//*  59  125:aload_0         
	//*  60  126:getfield        #122 <Field int mResolvedDimensionRatioSide>
	//*  61  129:iconst_m1       
	//*  62  130:icmpne          236
	//*  63  133:aload_0         
	//*  64  134:getfield        #147 <Field ConstraintAnchor mTop>
	//*  65  137:invokevirtual   #303 <Method boolean ConstraintAnchor.isConnected()>
	//*  66  140:ifeq            173
	//*  67  143:aload_0         
	//*  68  144:getfield        #157 <Field ConstraintAnchor mBottom>
	//*  69  147:invokevirtual   #303 <Method boolean ConstraintAnchor.isConnected()>
	//*  70  150:ifeq            173
	//*  71  153:aload_0         
	//*  72  154:getfield        #142 <Field ConstraintAnchor mLeft>
	//*  73  157:invokevirtual   #303 <Method boolean ConstraintAnchor.isConnected()>
	//*  74  160:ifeq            173
	//*  75  163:aload_0         
	//*  76  164:getfield        #152 <Field ConstraintAnchor mRight>
	//*  77  167:invokevirtual   #303 <Method boolean ConstraintAnchor.isConnected()>
	//*  78  170:ifne            236
			if(mTop.isConnected() && mBottom.isConnected())
	//*  79  173:aload_0         
	//*  80  174:getfield        #147 <Field ConstraintAnchor mTop>
	//*  81  177:invokevirtual   #303 <Method boolean ConstraintAnchor.isConnected()>
	//*  82  180:ifeq            201
	//*  83  183:aload_0         
	//*  84  184:getfield        #157 <Field ConstraintAnchor mBottom>
	//*  85  187:invokevirtual   #303 <Method boolean ConstraintAnchor.isConnected()>
	//*  86  190:ifeq            201
				mResolvedDimensionRatioSide = 0;
	//   87  193:aload_0         
	//   88  194:iconst_0        
	//   89  195:putfield        #122 <Field int mResolvedDimensionRatioSide>
			else
	//*  90  198:goto            236
			if(mLeft.isConnected() && mRight.isConnected())
	//*  91  201:aload_0         
	//*  92  202:getfield        #142 <Field ConstraintAnchor mLeft>
	//*  93  205:invokevirtual   #303 <Method boolean ConstraintAnchor.isConnected()>
	//*  94  208:ifeq            236
	//*  95  211:aload_0         
	//*  96  212:getfield        #152 <Field ConstraintAnchor mRight>
	//*  97  215:invokevirtual   #303 <Method boolean ConstraintAnchor.isConnected()>
	//*  98  218:ifeq            236
			{
				mResolvedDimensionRatio = 1.0F / mResolvedDimensionRatio;
	//   99  221:aload_0         
	//  100  222:fconst_1        
	//  101  223:aload_0         
	//  102  224:getfield        #124 <Field float mResolvedDimensionRatio>
	//  103  227:fdiv            
	//  104  228:putfield        #124 <Field float mResolvedDimensionRatio>
				mResolvedDimensionRatioSide = 1;
	//  105  231:aload_0         
	//  106  232:iconst_1        
	//  107  233:putfield        #122 <Field int mResolvedDimensionRatioSide>
			}
		if(mResolvedDimensionRatioSide == -1)
	//* 108  236:aload_0         
	//* 109  237:getfield        #122 <Field int mResolvedDimensionRatioSide>
	//* 110  240:iconst_m1       
	//* 111  241:icmpne          283
			if(flag && !flag1)
	//* 112  244:iload_1         
	//* 113  245:ifeq            260
	//* 114  248:iload_2         
	//* 115  249:ifne            260
				mResolvedDimensionRatioSide = 0;
	//  116  252:aload_0         
	//  117  253:iconst_0        
	//  118  254:putfield        #122 <Field int mResolvedDimensionRatioSide>
			else
	//* 119  257:goto            283
			if(!flag && flag1)
	//* 120  260:iload_1         
	//* 121  261:ifne            283
	//* 122  264:iload_2         
	//* 123  265:ifeq            283
			{
				mResolvedDimensionRatio = 1.0F / mResolvedDimensionRatio;
	//  124  268:aload_0         
	//  125  269:fconst_1        
	//  126  270:aload_0         
	//  127  271:getfield        #124 <Field float mResolvedDimensionRatio>
	//  128  274:fdiv            
	//  129  275:putfield        #124 <Field float mResolvedDimensionRatio>
				mResolvedDimensionRatioSide = 1;
	//  130  278:aload_0         
	//  131  279:iconst_1        
	//  132  280:putfield        #122 <Field int mResolvedDimensionRatioSide>
			}
		if(mResolvedDimensionRatioSide == -1)
	//* 133  283:aload_0         
	//* 134  284:getfield        #122 <Field int mResolvedDimensionRatioSide>
	//* 135  287:iconst_m1       
	//* 136  288:icmpne          342
			if(mMatchConstraintMinWidth > 0 && mMatchConstraintMinHeight == 0)
	//* 137  291:aload_0         
	//* 138  292:getfield        #110 <Field int mMatchConstraintMinWidth>
	//* 139  295:ifle            313
	//* 140  298:aload_0         
	//* 141  299:getfield        #116 <Field int mMatchConstraintMinHeight>
	//* 142  302:ifne            313
				mResolvedDimensionRatioSide = 0;
	//  143  305:aload_0         
	//  144  306:iconst_0        
	//  145  307:putfield        #122 <Field int mResolvedDimensionRatioSide>
			else
	//* 146  310:goto            342
			if(mMatchConstraintMinWidth == 0 && mMatchConstraintMinHeight > 0)
	//* 147  313:aload_0         
	//* 148  314:getfield        #110 <Field int mMatchConstraintMinWidth>
	//* 149  317:ifne            342
	//* 150  320:aload_0         
	//* 151  321:getfield        #116 <Field int mMatchConstraintMinHeight>
	//* 152  324:ifle            342
			{
				mResolvedDimensionRatio = 1.0F / mResolvedDimensionRatio;
	//  153  327:aload_0         
	//  154  328:fconst_1        
	//  155  329:aload_0         
	//  156  330:getfield        #124 <Field float mResolvedDimensionRatio>
	//  157  333:fdiv            
	//  158  334:putfield        #124 <Field float mResolvedDimensionRatio>
				mResolvedDimensionRatioSide = 1;
	//  159  337:aload_0         
	//  160  338:iconst_1        
	//  161  339:putfield        #122 <Field int mResolvedDimensionRatioSide>
			}
		if(mResolvedDimensionRatioSide == -1 && flag && flag1)
	//* 162  342:aload_0         
	//* 163  343:getfield        #122 <Field int mResolvedDimensionRatioSide>
	//* 164  346:iconst_m1       
	//* 165  347:icmpne          373
	//* 166  350:iload_1         
	//* 167  351:ifeq            373
	//* 168  354:iload_2         
	//* 169  355:ifeq            373
		{
			mResolvedDimensionRatio = 1.0F / mResolvedDimensionRatio;
	//  170  358:aload_0         
	//  171  359:fconst_1        
	//  172  360:aload_0         
	//  173  361:getfield        #124 <Field float mResolvedDimensionRatio>
	//  174  364:fdiv            
	//  175  365:putfield        #124 <Field float mResolvedDimensionRatio>
			mResolvedDimensionRatioSide = 1;
	//  176  368:aload_0         
	//  177  369:iconst_1        
	//  178  370:putfield        #122 <Field int mResolvedDimensionRatioSide>
		}
	//  179  373:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #612 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #613 <Method void StringBuilder()>
	//    3    7:astore_2        
		Object obj;
		if(mType != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #232 <Field String mType>
	//*   6   12:ifnull          56
		{
			obj = ((Object) (new StringBuilder()));
	//    7   15:new             #612 <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #613 <Method void StringBuilder()>
	//   10   22:astore_1        
			((StringBuilder) (obj)).append("type: ");
	//   11   23:aload_1         
	//   12   24:ldc2            #615 <String "type: ">
	//   13   27:invokevirtual   #619 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
			((StringBuilder) (obj)).append(mType);
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getfield        #232 <Field String mType>
	//   18   36:invokevirtual   #619 <Method StringBuilder StringBuilder.append(String)>
	//   19   39:pop             
			((StringBuilder) (obj)).append(" ");
	//   20   40:aload_1         
	//   21   41:ldc2            #621 <String " ">
	//   22   44:invokevirtual   #619 <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   24   48:aload_1         
	//   25   49:invokevirtual   #623 <Method String StringBuilder.toString()>
	//   26   52:astore_1        
		} else
	//*  27   53:goto            60
		{
			obj = "";
	//   28   56:ldc2            #625 <String "">
	//   29   59:astore_1        
		}
		stringbuilder.append(((String) (obj)));
	//   30   60:aload_2         
	//   31   61:aload_1         
	//   32   62:invokevirtual   #619 <Method StringBuilder StringBuilder.append(String)>
	//   33   65:pop             
		if(mDebugName != null)
	//*  34   66:aload_0         
	//*  35   67:getfield        #230 <Field String mDebugName>
	//*  36   70:ifnull          114
		{
			obj = ((Object) (new StringBuilder()));
	//   37   73:new             #612 <Class StringBuilder>
	//   38   76:dup             
	//   39   77:invokespecial   #613 <Method void StringBuilder()>
	//   40   80:astore_1        
			((StringBuilder) (obj)).append("id: ");
	//   41   81:aload_1         
	//   42   82:ldc2            #627 <String "id: ">
	//   43   85:invokevirtual   #619 <Method StringBuilder StringBuilder.append(String)>
	//   44   88:pop             
			((StringBuilder) (obj)).append(mDebugName);
	//   45   89:aload_1         
	//   46   90:aload_0         
	//   47   91:getfield        #230 <Field String mDebugName>
	//   48   94:invokevirtual   #619 <Method StringBuilder StringBuilder.append(String)>
	//   49   97:pop             
			((StringBuilder) (obj)).append(" ");
	//   50   98:aload_1         
	//   51   99:ldc2            #621 <String " ">
	//   52  102:invokevirtual   #619 <Method StringBuilder StringBuilder.append(String)>
	//   53  105:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   54  106:aload_1         
	//   55  107:invokevirtual   #623 <Method String StringBuilder.toString()>
	//   56  110:astore_1        
		} else
	//*  57  111:goto            118
		{
			obj = "";
	//   58  114:ldc2            #625 <String "">
	//   59  117:astore_1        
		}
		stringbuilder.append(((String) (obj)));
	//   60  118:aload_2         
	//   61  119:aload_1         
	//   62  120:invokevirtual   #619 <Method StringBuilder StringBuilder.append(String)>
	//   63  123:pop             
		stringbuilder.append("(");
	//   64  124:aload_2         
	//   65  125:ldc2            #629 <String "(">
	//   66  128:invokevirtual   #619 <Method StringBuilder StringBuilder.append(String)>
	//   67  131:pop             
		stringbuilder.append(mX);
	//   68  132:aload_2         
	//   69  133:aload_0         
	//   70  134:getfield        #202 <Field int mX>
	//   71  137:invokevirtual   #632 <Method StringBuilder StringBuilder.append(int)>
	//   72  140:pop             
		stringbuilder.append(", ");
	//   73  141:aload_2         
	//   74  142:ldc2            #634 <String ", ">
	//   75  145:invokevirtual   #619 <Method StringBuilder StringBuilder.append(String)>
	//   76  148:pop             
		stringbuilder.append(mY);
	//   77  149:aload_2         
	//   78  150:aload_0         
	//   79  151:getfield        #204 <Field int mY>
	//   80  154:invokevirtual   #632 <Method StringBuilder StringBuilder.append(int)>
	//   81  157:pop             
		stringbuilder.append(") - (");
	//   82  158:aload_2         
	//   83  159:ldc2            #636 <String ") - (">
	//   84  162:invokevirtual   #619 <Method StringBuilder StringBuilder.append(String)>
	//   85  165:pop             
		stringbuilder.append(mWidth);
	//   86  166:aload_2         
	//   87  167:aload_0         
	//   88  168:getfield        #194 <Field int mWidth>
	//   89  171:invokevirtual   #632 <Method StringBuilder StringBuilder.append(int)>
	//   90  174:pop             
		stringbuilder.append(" x ");
	//   91  175:aload_2         
	//   92  176:ldc2            #638 <String " x ">
	//   93  179:invokevirtual   #619 <Method StringBuilder StringBuilder.append(String)>
	//   94  182:pop             
		stringbuilder.append(mHeight);
	//   95  183:aload_2         
	//   96  184:aload_0         
	//   97  185:getfield        #196 <Field int mHeight>
	//   98  188:invokevirtual   #632 <Method StringBuilder StringBuilder.append(int)>
	//   99  191:pop             
		stringbuilder.append(") wrap: (");
	//  100  192:aload_2         
	//  101  193:ldc2            #640 <String ") wrap: (">
	//  102  196:invokevirtual   #619 <Method StringBuilder StringBuilder.append(String)>
	//  103  199:pop             
		stringbuilder.append(mWrapWidth);
	//  104  200:aload_2         
	//  105  201:aload_0         
	//  106  202:getfield        #478 <Field int mWrapWidth>
	//  107  205:invokevirtual   #632 <Method StringBuilder StringBuilder.append(int)>
	//  108  208:pop             
		stringbuilder.append(" x ");
	//  109  209:aload_2         
	//  110  210:ldc2            #638 <String " x ">
	//  111  213:invokevirtual   #619 <Method StringBuilder StringBuilder.append(String)>
	//  112  216:pop             
		stringbuilder.append(mWrapHeight);
	//  113  217:aload_2         
	//  114  218:aload_0         
	//  115  219:getfield        #475 <Field int mWrapHeight>
	//  116  222:invokevirtual   #632 <Method StringBuilder StringBuilder.append(int)>
	//  117  225:pop             
		stringbuilder.append(")");
	//  118  226:aload_2         
	//  119  227:ldc2            #642 <String ")">
	//  120  230:invokevirtual   #619 <Method StringBuilder StringBuilder.append(String)>
	//  121  233:pop             
		return stringbuilder.toString();
	//  122  234:aload_2         
	//  123  235:invokevirtual   #623 <Method String StringBuilder.toString()>
	//  124  238:areturn         
	}

	public void updateDrawPosition()
	{
		int i = mX;
	//    0    0:aload_0         
	//    1    1:getfield        #202 <Field int mX>
	//    2    4:istore_1        
		int j = mY;
	//    3    5:aload_0         
	//    4    6:getfield        #204 <Field int mY>
	//    5    9:istore_2        
		int k = mWidth;
	//    6   10:aload_0         
	//    7   11:getfield        #194 <Field int mWidth>
	//    8   14:istore_3        
		int l = mHeight;
	//    9   15:aload_0         
	//   10   16:getfield        #196 <Field int mHeight>
	//   11   19:istore          4
		mDrawX = i;
	//   12   21:aload_0         
	//   13   22:iload_1         
	//   14   23:putfield        #206 <Field int mDrawX>
		mDrawY = j;
	//   15   26:aload_0         
	//   16   27:iload_2         
	//   17   28:putfield        #208 <Field int mDrawY>
		mDrawWidth = (k + i) - i;
	//   18   31:aload_0         
	//   19   32:iload_3         
	//   20   33:iload_1         
	//   21   34:iadd            
	//   22   35:iload_1         
	//   23   36:isub            
	//   24   37:putfield        #210 <Field int mDrawWidth>
		mDrawHeight = (l + j) - j;
	//   25   40:aload_0         
	//   26   41:iload           4
	//   27   43:iload_2         
	//   28   44:iadd            
	//   29   45:iload_2         
	//   30   46:isub            
	//   31   47:putfield        #212 <Field int mDrawHeight>
	//   32   50:return          
	}

	public void updateFromSolver(LinearSystem linearsystem)
	{
		int i;
		int j;
		int k;
		int l;
label0:
		{
			j = linearsystem.getObjectVariableValue(((Object) (mLeft)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #142 <Field ConstraintAnchor mLeft>
	//    3    5:invokevirtual   #648 <Method int LinearSystem.getObjectVariableValue(Object)>
	//    4    8:istore_3        
			k = linearsystem.getObjectVariableValue(((Object) (mTop)));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #147 <Field ConstraintAnchor mTop>
	//    8   14:invokevirtual   #648 <Method int LinearSystem.getObjectVariableValue(Object)>
	//    9   17:istore          4
			l = linearsystem.getObjectVariableValue(((Object) (mRight)));
	//   10   19:aload_1         
	//   11   20:aload_0         
	//   12   21:getfield        #152 <Field ConstraintAnchor mRight>
	//   13   24:invokevirtual   #648 <Method int LinearSystem.getObjectVariableValue(Object)>
	//   14   27:istore          5
			int i1 = linearsystem.getObjectVariableValue(((Object) (mBottom)));
	//   15   29:aload_1         
	//   16   30:aload_0         
	//   17   31:getfield        #157 <Field ConstraintAnchor mBottom>
	//   18   34:invokevirtual   #648 <Method int LinearSystem.getObjectVariableValue(Object)>
	//   19   37:istore          6
			if(l - j >= 0 && i1 - k >= 0 && j != 0x80000000 && j != 0x7fffffff && k != 0x80000000 && k != 0x7fffffff && l != 0x80000000 && l != 0x7fffffff && i1 != 0x80000000)
	//*  20   39:iload           5
	//*  21   41:iload_3         
	//*  22   42:isub            
	//*  23   43:iflt            115
	//*  24   46:iload           6
	//*  25   48:iload           4
	//*  26   50:isub            
	//*  27   51:iflt            115
	//*  28   54:iload_3         
	//*  29   55:ldc2            #649 <Int 0x80000000>
	//*  30   58:icmpeq          115
	//*  31   61:iload_3         
	//*  32   62:ldc1            #125 <Int 0x7fffffff>
	//*  33   64:icmpeq          115
	//*  34   67:iload           4
	//*  35   69:ldc2            #649 <Int 0x80000000>
	//*  36   72:icmpeq          115
	//*  37   75:iload           4
	//*  38   77:ldc1            #125 <Int 0x7fffffff>
	//*  39   79:icmpeq          115
	//*  40   82:iload           5
	//*  41   84:ldc2            #649 <Int 0x80000000>
	//*  42   87:icmpeq          115
	//*  43   90:iload           5
	//*  44   92:ldc1            #125 <Int 0x7fffffff>
	//*  45   94:icmpeq          115
	//*  46   97:iload           6
	//*  47   99:ldc2            #649 <Int 0x80000000>
	//*  48  102:icmpeq          115
			{
				i = i1;
	//   49  105:iload           6
	//   50  107:istore_2        
				if(i1 != 0x7fffffff)
					break label0;
	//   51  108:iload           6
	//   52  110:ldc1            #125 <Int 0x7fffffff>
	//   53  112:icmpne          125
			}
			i = 0;
	//   54  115:iconst_0        
	//   55  116:istore_2        
			j = 0;
	//   56  117:iconst_0        
	//   57  118:istore_3        
			k = 0;
	//   58  119:iconst_0        
	//   59  120:istore          4
			l = 0;
	//   60  122:iconst_0        
	//   61  123:istore          5
		}
		setFrame(j, k, l, i);
	//   62  125:aload_0         
	//   63  126:iload_3         
	//   64  127:iload           4
	//   65  129:iload           5
	//   66  131:iload_2         
	//   67  132:invokevirtual   #651 <Method void setFrame(int, int, int, int)>
	//   68  135:return          
	}

	public void updateResolutionNodes()
	{
		for(int i = 0; i < 6; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:bipush          6
	//*   4    5:icmpge          27
			mListAnchors[i].getResolutionNode().update();
	//    5    8:aload_0         
	//    6    9:getfield        #179 <Field ConstraintAnchor[] mListAnchors>
	//    7   12:iload_1         
	//    8   13:aaload          
	//    9   14:invokevirtual   #273 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   10   17:invokevirtual   #655 <Method void ResolutionAnchor.update()>

	//   11   20:iload_1         
	//   12   21:iconst_1        
	//   13   22:iadd            
	//   14   23:istore_1        
	//*  15   24:goto            2
	//   16   27:return          
	}

	public static float DEFAULT_BIAS = 0.5F;
	protected ArrayList mAnchors;
	ConstraintAnchor mBaseline;
	int mBaselineDistance;
	ConstraintAnchor mBottom;
	ConstraintAnchor mCenter;
	ConstraintAnchor mCenterX;
	ConstraintAnchor mCenterY;
	private float mCircleConstraintAngle;
	private Object mCompanionWidget;
	private int mContainerItemSkip;
	private String mDebugName;
	protected float mDimensionRatio;
	protected int mDimensionRatioSide;
	private int mDrawHeight;
	private int mDrawWidth;
	private int mDrawX;
	private int mDrawY;
	int mHeight;
	float mHorizontalBiasPercent;
	boolean mHorizontalChainFixedPosition;
	int mHorizontalChainStyle;
	ConstraintWidget mHorizontalNextWidget;
	public int mHorizontalResolution;
	boolean mHorizontalWrapVisited;
	boolean mIsHeightWrapContent;
	boolean mIsWidthWrapContent;
	ConstraintAnchor mLeft;
	protected ConstraintAnchor mListAnchors[];
	protected DimensionBehaviour mListDimensionBehaviors[];
	protected ConstraintWidget mListNextMatchConstraintsWidget[] = {
		null, null
	};
	protected ConstraintWidget mListNextVisibleWidget[] = {
		null, null
	};
	int mMatchConstraintDefaultHeight;
	int mMatchConstraintDefaultWidth;
	int mMatchConstraintMaxHeight;
	int mMatchConstraintMaxWidth;
	int mMatchConstraintMinHeight;
	int mMatchConstraintMinWidth;
	float mMatchConstraintPercentHeight;
	float mMatchConstraintPercentWidth;
	private int mMaxDimension[] = {
		0x7fffffff, 0x7fffffff
	};
	protected int mMinHeight;
	protected int mMinWidth;
	protected int mOffsetX;
	protected int mOffsetY;
	ConstraintWidget mParent;
	ResolutionDimension mResolutionHeight;
	ResolutionDimension mResolutionWidth;
	float mResolvedDimensionRatio;
	int mResolvedDimensionRatioSide;
	int mResolvedMatchConstraintDefault[];
	ConstraintAnchor mRight;
	ConstraintAnchor mTop;
	private String mType;
	float mVerticalBiasPercent;
	boolean mVerticalChainFixedPosition;
	int mVerticalChainStyle;
	ConstraintWidget mVerticalNextWidget;
	public int mVerticalResolution;
	boolean mVerticalWrapVisited;
	private int mVisibility;
	float mWeight[] = {
		-1F, -1F
	};
	int mWidth;
	private int mWrapHeight;
	private int mWrapWidth;
	protected int mX;
	protected int mY;

	static 
	{
	//    0    0:return          
	}
}
