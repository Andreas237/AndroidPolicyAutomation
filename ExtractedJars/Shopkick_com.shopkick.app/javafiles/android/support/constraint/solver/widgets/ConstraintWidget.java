// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver.widgets;

import android.support.constraint.solver.*;
import java.util.ArrayList;

// Referenced classes of package android.support.constraint.solver.widgets:
//			ConstraintAnchor, ResolutionAnchor, ConstraintWidgetContainer, Optimizer, 
//			ResolutionDimension, WidgetContainer

public class ConstraintWidget
{
	public static final class ContentAlignment extends Enum
	{

		public static ContentAlignment valueOf(String s)
		{
			return (ContentAlignment)Enum.valueOf(android/support/constraint/solver/widgets/ConstraintWidget$ContentAlignment, s);
		//    0    0:ldc1            #2   <Class ConstraintWidget$ContentAlignment>
		//    1    2:aload_0         
		//    2    3:invokestatic    #59  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ConstraintWidget$ContentAlignment>
		//    4    9:areturn         
		}

		public static ContentAlignment[] values()
		{
			return (ContentAlignment[])((ContentAlignment []) ($VALUES)).clone();
		//    0    0:getstatic       #51  <Field ConstraintWidget$ContentAlignment[] $VALUES>
		//    1    3:invokevirtual   #66  <Method Object _5B_Landroid.support.constraint.solver.widgets.ConstraintWidget$ContentAlignment_3B_.clone()>
		//    2    6:checkcast       #62  <Class ConstraintWidget$ContentAlignment[]>
		//    3    9:areturn         
		}

		private static final ContentAlignment $VALUES[];
		public static final ContentAlignment BEGIN;
		public static final ContentAlignment BOTTOM;
		public static final ContentAlignment END;
		public static final ContentAlignment LEFT;
		public static final ContentAlignment MIDDLE;
		public static final ContentAlignment RIGHT;
		public static final ContentAlignment TOP;
		public static final ContentAlignment VERTICAL_MIDDLE;

		static 
		{
			BEGIN = new ContentAlignment("BEGIN", 0);
		//    0    0:new             #2   <Class ConstraintWidget$ContentAlignment>
		//    1    3:dup             
		//    2    4:ldc1            #22  <String "BEGIN">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #26  <Method void ConstraintWidget$ContentAlignment(String, int)>
		//    5   10:putstatic       #28  <Field ConstraintWidget$ContentAlignment BEGIN>
			MIDDLE = new ContentAlignment("MIDDLE", 1);
		//    6   13:new             #2   <Class ConstraintWidget$ContentAlignment>
		//    7   16:dup             
		//    8   17:ldc1            #29  <String "MIDDLE">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #26  <Method void ConstraintWidget$ContentAlignment(String, int)>
		//   11   23:putstatic       #31  <Field ConstraintWidget$ContentAlignment MIDDLE>
			END = new ContentAlignment("END", 2);
		//   12   26:new             #2   <Class ConstraintWidget$ContentAlignment>
		//   13   29:dup             
		//   14   30:ldc1            #32  <String "END">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #26  <Method void ConstraintWidget$ContentAlignment(String, int)>
		//   17   36:putstatic       #34  <Field ConstraintWidget$ContentAlignment END>
			TOP = new ContentAlignment("TOP", 3);
		//   18   39:new             #2   <Class ConstraintWidget$ContentAlignment>
		//   19   42:dup             
		//   20   43:ldc1            #35  <String "TOP">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #26  <Method void ConstraintWidget$ContentAlignment(String, int)>
		//   23   49:putstatic       #37  <Field ConstraintWidget$ContentAlignment TOP>
			VERTICAL_MIDDLE = new ContentAlignment("VERTICAL_MIDDLE", 4);
		//   24   52:new             #2   <Class ConstraintWidget$ContentAlignment>
		//   25   55:dup             
		//   26   56:ldc1            #38  <String "VERTICAL_MIDDLE">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #26  <Method void ConstraintWidget$ContentAlignment(String, int)>
		//   29   62:putstatic       #40  <Field ConstraintWidget$ContentAlignment VERTICAL_MIDDLE>
			BOTTOM = new ContentAlignment("BOTTOM", 5);
		//   30   65:new             #2   <Class ConstraintWidget$ContentAlignment>
		//   31   68:dup             
		//   32   69:ldc1            #41  <String "BOTTOM">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #26  <Method void ConstraintWidget$ContentAlignment(String, int)>
		//   35   75:putstatic       #43  <Field ConstraintWidget$ContentAlignment BOTTOM>
			LEFT = new ContentAlignment("LEFT", 6);
		//   36   78:new             #2   <Class ConstraintWidget$ContentAlignment>
		//   37   81:dup             
		//   38   82:ldc1            #44  <String "LEFT">
		//   39   84:bipush          6
		//   40   86:invokespecial   #26  <Method void ConstraintWidget$ContentAlignment(String, int)>
		//   41   89:putstatic       #46  <Field ConstraintWidget$ContentAlignment LEFT>
			RIGHT = new ContentAlignment("RIGHT", 7);
		//   42   92:new             #2   <Class ConstraintWidget$ContentAlignment>
		//   43   95:dup             
		//   44   96:ldc1            #47  <String "RIGHT">
		//   45   98:bipush          7
		//   46  100:invokespecial   #26  <Method void ConstraintWidget$ContentAlignment(String, int)>
		//   47  103:putstatic       #49  <Field ConstraintWidget$ContentAlignment RIGHT>
			$VALUES = (new ContentAlignment[] {
				BEGIN, MIDDLE, END, TOP, VERTICAL_MIDDLE, BOTTOM, LEFT, RIGHT
			});
		//   48  106:bipush          8
		//   49  108:anewarray       ContentAlignment[]
		//   50  111:dup             
		//   51  112:iconst_0        
		//   52  113:getstatic       #28  <Field ConstraintWidget$ContentAlignment BEGIN>
		//   53  116:aastore         
		//   54  117:dup             
		//   55  118:iconst_1        
		//   56  119:getstatic       #31  <Field ConstraintWidget$ContentAlignment MIDDLE>
		//   57  122:aastore         
		//   58  123:dup             
		//   59  124:iconst_2        
		//   60  125:getstatic       #34  <Field ConstraintWidget$ContentAlignment END>
		//   61  128:aastore         
		//   62  129:dup             
		//   63  130:iconst_3        
		//   64  131:getstatic       #37  <Field ConstraintWidget$ContentAlignment TOP>
		//   65  134:aastore         
		//   66  135:dup             
		//   67  136:iconst_4        
		//   68  137:getstatic       #40  <Field ConstraintWidget$ContentAlignment VERTICAL_MIDDLE>
		//   69  140:aastore         
		//   70  141:dup             
		//   71  142:iconst_5        
		//   72  143:getstatic       #43  <Field ConstraintWidget$ContentAlignment BOTTOM>
		//   73  146:aastore         
		//   74  147:dup             
		//   75  148:bipush          6
		//   76  150:getstatic       #46  <Field ConstraintWidget$ContentAlignment LEFT>
		//   77  153:aastore         
		//   78  154:dup             
		//   79  155:bipush          7
		//   80  157:getstatic       #49  <Field ConstraintWidget$ContentAlignment RIGHT>
		//   81  160:aastore         
		//   82  161:putstatic       #51  <Field ConstraintWidget$ContentAlignment[] $VALUES>
		//*  83  164:return          
		}

		private ContentAlignment(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #53  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

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
	//    1    1:invokespecial   #142 <Method void Object()>
		mHorizontalResolution = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #144 <Field int mHorizontalResolution>
		mVerticalResolution = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #146 <Field int mVerticalResolution>
		mMatchConstraintDefaultWidth = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #148 <Field int mMatchConstraintDefaultWidth>
		mMatchConstraintDefaultHeight = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #150 <Field int mMatchConstraintDefaultHeight>
		mResolvedMatchConstraintDefault = new int[2];
	//   14   24:aload_0         
	//   15   25:iconst_2        
	//   16   26:newarray        int[]
	//   17   28:putfield        #152 <Field int[] mResolvedMatchConstraintDefault>
		mMatchConstraintMinWidth = 0;
	//   18   31:aload_0         
	//   19   32:iconst_0        
	//   20   33:putfield        #154 <Field int mMatchConstraintMinWidth>
		mMatchConstraintMaxWidth = 0;
	//   21   36:aload_0         
	//   22   37:iconst_0        
	//   23   38:putfield        #156 <Field int mMatchConstraintMaxWidth>
		mMatchConstraintPercentWidth = 1.0F;
	//   24   41:aload_0         
	//   25   42:fconst_1        
	//   26   43:putfield        #158 <Field float mMatchConstraintPercentWidth>
		mMatchConstraintMinHeight = 0;
	//   27   46:aload_0         
	//   28   47:iconst_0        
	//   29   48:putfield        #160 <Field int mMatchConstraintMinHeight>
		mMatchConstraintMaxHeight = 0;
	//   30   51:aload_0         
	//   31   52:iconst_0        
	//   32   53:putfield        #162 <Field int mMatchConstraintMaxHeight>
		mMatchConstraintPercentHeight = 1.0F;
	//   33   56:aload_0         
	//   34   57:fconst_1        
	//   35   58:putfield        #164 <Field float mMatchConstraintPercentHeight>
		mResolvedDimensionRatioSide = -1;
	//   36   61:aload_0         
	//   37   62:iconst_m1       
	//   38   63:putfield        #166 <Field int mResolvedDimensionRatioSide>
		mResolvedDimensionRatio = 1.0F;
	//   39   66:aload_0         
	//   40   67:fconst_1        
	//   41   68:putfield        #168 <Field float mResolvedDimensionRatio>
	//   42   71:aload_0         
	//   43   72:iconst_2        
	//   44   73:newarray        int[]
	//   45   75:dup             
	//   46   76:iconst_0        
	//   47   77:ldc1            #169 <Int 0x7fffffff>
	//   48   79:iastore         
	//   49   80:dup             
	//   50   81:iconst_1        
	//   51   82:ldc1            #169 <Int 0x7fffffff>
	//   52   84:iastore         
	//   53   85:putfield        #171 <Field int[] mMaxDimension>
		mCircleConstraintAngle = 0.0F;
	//   54   88:aload_0         
	//   55   89:fconst_0        
	//   56   90:putfield        #173 <Field float mCircleConstraintAngle>
		mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
	//   57   93:aload_0         
	//   58   94:new             #175 <Class ConstraintAnchor>
	//   59   97:dup             
	//   60   98:aload_0         
	//   61   99:getstatic       #181 <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//   62  102:invokespecial   #184 <Method void ConstraintAnchor(ConstraintWidget, ConstraintAnchor$Type)>
	//   63  105:putfield        #186 <Field ConstraintAnchor mLeft>
		mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
	//   64  108:aload_0         
	//   65  109:new             #175 <Class ConstraintAnchor>
	//   66  112:dup             
	//   67  113:aload_0         
	//   68  114:getstatic       #189 <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//   69  117:invokespecial   #184 <Method void ConstraintAnchor(ConstraintWidget, ConstraintAnchor$Type)>
	//   70  120:putfield        #191 <Field ConstraintAnchor mTop>
		mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
	//   71  123:aload_0         
	//   72  124:new             #175 <Class ConstraintAnchor>
	//   73  127:dup             
	//   74  128:aload_0         
	//   75  129:getstatic       #194 <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//   76  132:invokespecial   #184 <Method void ConstraintAnchor(ConstraintWidget, ConstraintAnchor$Type)>
	//   77  135:putfield        #196 <Field ConstraintAnchor mRight>
		mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
	//   78  138:aload_0         
	//   79  139:new             #175 <Class ConstraintAnchor>
	//   80  142:dup             
	//   81  143:aload_0         
	//   82  144:getstatic       #199 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
	//   83  147:invokespecial   #184 <Method void ConstraintAnchor(ConstraintWidget, ConstraintAnchor$Type)>
	//   84  150:putfield        #201 <Field ConstraintAnchor mBottom>
		mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
	//   85  153:aload_0         
	//   86  154:new             #175 <Class ConstraintAnchor>
	//   87  157:dup             
	//   88  158:aload_0         
	//   89  159:getstatic       #204 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BASELINE>
	//   90  162:invokespecial   #184 <Method void ConstraintAnchor(ConstraintWidget, ConstraintAnchor$Type)>
	//   91  165:putfield        #206 <Field ConstraintAnchor mBaseline>
		mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
	//   92  168:aload_0         
	//   93  169:new             #175 <Class ConstraintAnchor>
	//   94  172:dup             
	//   95  173:aload_0         
	//   96  174:getstatic       #209 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_X>
	//   97  177:invokespecial   #184 <Method void ConstraintAnchor(ConstraintWidget, ConstraintAnchor$Type)>
	//   98  180:putfield        #211 <Field ConstraintAnchor mCenterX>
		mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
	//   99  183:aload_0         
	//  100  184:new             #175 <Class ConstraintAnchor>
	//  101  187:dup             
	//  102  188:aload_0         
	//  103  189:getstatic       #214 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_Y>
	//  104  192:invokespecial   #184 <Method void ConstraintAnchor(ConstraintWidget, ConstraintAnchor$Type)>
	//  105  195:putfield        #216 <Field ConstraintAnchor mCenterY>
		mCenter = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
	//  106  198:aload_0         
	//  107  199:new             #175 <Class ConstraintAnchor>
	//  108  202:dup             
	//  109  203:aload_0         
	//  110  204:getstatic       #219 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER>
	//  111  207:invokespecial   #184 <Method void ConstraintAnchor(ConstraintWidget, ConstraintAnchor$Type)>
	//  112  210:putfield        #221 <Field ConstraintAnchor mCenter>
		mListAnchors = (new ConstraintAnchor[] {
			mLeft, mRight, mTop, mBottom, mBaseline, mCenter
		});
	//  113  213:aload_0         
	//  114  214:bipush          6
	//  115  216:anewarray       ConstraintAnchor[]
	//  116  219:dup             
	//  117  220:iconst_0        
	//  118  221:aload_0         
	//  119  222:getfield        #186 <Field ConstraintAnchor mLeft>
	//  120  225:aastore         
	//  121  226:dup             
	//  122  227:iconst_1        
	//  123  228:aload_0         
	//  124  229:getfield        #196 <Field ConstraintAnchor mRight>
	//  125  232:aastore         
	//  126  233:dup             
	//  127  234:iconst_2        
	//  128  235:aload_0         
	//  129  236:getfield        #191 <Field ConstraintAnchor mTop>
	//  130  239:aastore         
	//  131  240:dup             
	//  132  241:iconst_3        
	//  133  242:aload_0         
	//  134  243:getfield        #201 <Field ConstraintAnchor mBottom>
	//  135  246:aastore         
	//  136  247:dup             
	//  137  248:iconst_4        
	//  138  249:aload_0         
	//  139  250:getfield        #206 <Field ConstraintAnchor mBaseline>
	//  140  253:aastore         
	//  141  254:dup             
	//  142  255:iconst_5        
	//  143  256:aload_0         
	//  144  257:getfield        #221 <Field ConstraintAnchor mCenter>
	//  145  260:aastore         
	//  146  261:putfield        #223 <Field ConstraintAnchor[] mListAnchors>
		mAnchors = new ArrayList();
	//  147  264:aload_0         
	//  148  265:new             #225 <Class ArrayList>
	//  149  268:dup             
	//  150  269:invokespecial   #226 <Method void ArrayList()>
	//  151  272:putfield        #228 <Field ArrayList mAnchors>
		mListDimensionBehaviors = (new DimensionBehaviour[] {
			DimensionBehaviour.FIXED, DimensionBehaviour.FIXED
		});
	//  152  275:aload_0         
	//  153  276:iconst_2        
	//  154  277:anewarray       DimensionBehaviour[]
	//  155  280:dup             
	//  156  281:iconst_0        
	//  157  282:getstatic       #232 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.FIXED>
	//  158  285:aastore         
	//  159  286:dup             
	//  160  287:iconst_1        
	//  161  288:getstatic       #232 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.FIXED>
	//  162  291:aastore         
	//  163  292:putfield        #234 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
		mParent = null;
	//  164  295:aload_0         
	//  165  296:aconst_null     
	//  166  297:putfield        #236 <Field ConstraintWidget mParent>
		mWidth = 0;
	//  167  300:aload_0         
	//  168  301:iconst_0        
	//  169  302:putfield        #238 <Field int mWidth>
		mHeight = 0;
	//  170  305:aload_0         
	//  171  306:iconst_0        
	//  172  307:putfield        #240 <Field int mHeight>
		mDimensionRatio = 0.0F;
	//  173  310:aload_0         
	//  174  311:fconst_0        
	//  175  312:putfield        #242 <Field float mDimensionRatio>
		mDimensionRatioSide = -1;
	//  176  315:aload_0         
	//  177  316:iconst_m1       
	//  178  317:putfield        #244 <Field int mDimensionRatioSide>
		mX = 0;
	//  179  320:aload_0         
	//  180  321:iconst_0        
	//  181  322:putfield        #246 <Field int mX>
		mY = 0;
	//  182  325:aload_0         
	//  183  326:iconst_0        
	//  184  327:putfield        #248 <Field int mY>
		mDrawX = 0;
	//  185  330:aload_0         
	//  186  331:iconst_0        
	//  187  332:putfield        #250 <Field int mDrawX>
		mDrawY = 0;
	//  188  335:aload_0         
	//  189  336:iconst_0        
	//  190  337:putfield        #252 <Field int mDrawY>
		mDrawWidth = 0;
	//  191  340:aload_0         
	//  192  341:iconst_0        
	//  193  342:putfield        #254 <Field int mDrawWidth>
		mDrawHeight = 0;
	//  194  345:aload_0         
	//  195  346:iconst_0        
	//  196  347:putfield        #256 <Field int mDrawHeight>
		mOffsetX = 0;
	//  197  350:aload_0         
	//  198  351:iconst_0        
	//  199  352:putfield        #258 <Field int mOffsetX>
		mOffsetY = 0;
	//  200  355:aload_0         
	//  201  356:iconst_0        
	//  202  357:putfield        #260 <Field int mOffsetY>
		mBaselineDistance = 0;
	//  203  360:aload_0         
	//  204  361:iconst_0        
	//  205  362:putfield        #262 <Field int mBaselineDistance>
		float f = DEFAULT_BIAS;
	//  206  365:getstatic       #264 <Field float DEFAULT_BIAS>
	//  207  368:fstore_1        
		mHorizontalBiasPercent = f;
	//  208  369:aload_0         
	//  209  370:fload_1         
	//  210  371:putfield        #266 <Field float mHorizontalBiasPercent>
		mVerticalBiasPercent = f;
	//  211  374:aload_0         
	//  212  375:fload_1         
	//  213  376:putfield        #268 <Field float mVerticalBiasPercent>
		mContainerItemSkip = 0;
	//  214  379:aload_0         
	//  215  380:iconst_0        
	//  216  381:putfield        #270 <Field int mContainerItemSkip>
		mVisibility = 0;
	//  217  384:aload_0         
	//  218  385:iconst_0        
	//  219  386:putfield        #272 <Field int mVisibility>
		mDebugName = null;
	//  220  389:aload_0         
	//  221  390:aconst_null     
	//  222  391:putfield        #274 <Field String mDebugName>
		mType = null;
	//  223  394:aload_0         
	//  224  395:aconst_null     
	//  225  396:putfield        #276 <Field String mType>
		mHorizontalChainStyle = 0;
	//  226  399:aload_0         
	//  227  400:iconst_0        
	//  228  401:putfield        #278 <Field int mHorizontalChainStyle>
		mVerticalChainStyle = 0;
	//  229  404:aload_0         
	//  230  405:iconst_0        
	//  231  406:putfield        #280 <Field int mVerticalChainStyle>
	//  232  409:aload_0         
	//  233  410:iconst_2        
	//  234  411:newarray        float[]
	//  235  413:dup             
	//  236  414:iconst_0        
	//  237  415:ldc2            #281 <Float -1F>
	//  238  418:fastore         
	//  239  419:dup             
	//  240  420:iconst_1        
	//  241  421:ldc2            #281 <Float -1F>
	//  242  424:fastore         
	//  243  425:putfield        #283 <Field float[] mWeight>
	//  244  428:aload_0         
	//  245  429:iconst_2        
	//  246  430:anewarray       ConstraintWidget[]
	//  247  433:dup             
	//  248  434:iconst_0        
	//  249  435:aconst_null     
	//  250  436:aastore         
	//  251  437:dup             
	//  252  438:iconst_1        
	//  253  439:aconst_null     
	//  254  440:aastore         
	//  255  441:putfield        #285 <Field ConstraintWidget[] mListNextMatchConstraintsWidget>
	//  256  444:aload_0         
	//  257  445:iconst_2        
	//  258  446:anewarray       ConstraintWidget[]
	//  259  449:dup             
	//  260  450:iconst_0        
	//  261  451:aconst_null     
	//  262  452:aastore         
	//  263  453:dup             
	//  264  454:iconst_1        
	//  265  455:aconst_null     
	//  266  456:aastore         
	//  267  457:putfield        #287 <Field ConstraintWidget[] mListNextVisibleWidget>
		mHorizontalNextWidget = null;
	//  268  460:aload_0         
	//  269  461:aconst_null     
	//  270  462:putfield        #289 <Field ConstraintWidget mHorizontalNextWidget>
		mVerticalNextWidget = null;
	//  271  465:aload_0         
	//  272  466:aconst_null     
	//  273  467:putfield        #291 <Field ConstraintWidget mVerticalNextWidget>
		addAnchors();
	//  274  470:aload_0         
	//  275  471:invokespecial   #294 <Method void addAnchors()>
	//  276  474:return          
	}

	public ConstraintWidget(int i, int j)
	{
		this(0, 0, i, j);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:iload_1         
	//    4    4:iload_2         
	//    5    5:invokespecial   #298 <Method void ConstraintWidget(int, int, int, int)>
	//    6    8:return          
	}

	public ConstraintWidget(int i, int j, int k, int l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #142 <Method void Object()>
		mHorizontalResolution = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #144 <Field int mHorizontalResolution>
		mVerticalResolution = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #146 <Field int mVerticalResolution>
		mMatchConstraintDefaultWidth = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #148 <Field int mMatchConstraintDefaultWidth>
		mMatchConstraintDefaultHeight = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #150 <Field int mMatchConstraintDefaultHeight>
		mResolvedMatchConstraintDefault = new int[2];
	//   14   24:aload_0         
	//   15   25:iconst_2        
	//   16   26:newarray        int[]
	//   17   28:putfield        #152 <Field int[] mResolvedMatchConstraintDefault>
		mMatchConstraintMinWidth = 0;
	//   18   31:aload_0         
	//   19   32:iconst_0        
	//   20   33:putfield        #154 <Field int mMatchConstraintMinWidth>
		mMatchConstraintMaxWidth = 0;
	//   21   36:aload_0         
	//   22   37:iconst_0        
	//   23   38:putfield        #156 <Field int mMatchConstraintMaxWidth>
		mMatchConstraintPercentWidth = 1.0F;
	//   24   41:aload_0         
	//   25   42:fconst_1        
	//   26   43:putfield        #158 <Field float mMatchConstraintPercentWidth>
		mMatchConstraintMinHeight = 0;
	//   27   46:aload_0         
	//   28   47:iconst_0        
	//   29   48:putfield        #160 <Field int mMatchConstraintMinHeight>
		mMatchConstraintMaxHeight = 0;
	//   30   51:aload_0         
	//   31   52:iconst_0        
	//   32   53:putfield        #162 <Field int mMatchConstraintMaxHeight>
		mMatchConstraintPercentHeight = 1.0F;
	//   33   56:aload_0         
	//   34   57:fconst_1        
	//   35   58:putfield        #164 <Field float mMatchConstraintPercentHeight>
		mResolvedDimensionRatioSide = -1;
	//   36   61:aload_0         
	//   37   62:iconst_m1       
	//   38   63:putfield        #166 <Field int mResolvedDimensionRatioSide>
		mResolvedDimensionRatio = 1.0F;
	//   39   66:aload_0         
	//   40   67:fconst_1        
	//   41   68:putfield        #168 <Field float mResolvedDimensionRatio>
	//   42   71:aload_0         
	//   43   72:iconst_2        
	//   44   73:newarray        int[]
	//   45   75:dup             
	//   46   76:iconst_0        
	//   47   77:ldc1            #169 <Int 0x7fffffff>
	//   48   79:iastore         
	//   49   80:dup             
	//   50   81:iconst_1        
	//   51   82:ldc1            #169 <Int 0x7fffffff>
	//   52   84:iastore         
	//   53   85:putfield        #171 <Field int[] mMaxDimension>
		mCircleConstraintAngle = 0.0F;
	//   54   88:aload_0         
	//   55   89:fconst_0        
	//   56   90:putfield        #173 <Field float mCircleConstraintAngle>
		mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
	//   57   93:aload_0         
	//   58   94:new             #175 <Class ConstraintAnchor>
	//   59   97:dup             
	//   60   98:aload_0         
	//   61   99:getstatic       #181 <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//   62  102:invokespecial   #184 <Method void ConstraintAnchor(ConstraintWidget, ConstraintAnchor$Type)>
	//   63  105:putfield        #186 <Field ConstraintAnchor mLeft>
		mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
	//   64  108:aload_0         
	//   65  109:new             #175 <Class ConstraintAnchor>
	//   66  112:dup             
	//   67  113:aload_0         
	//   68  114:getstatic       #189 <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//   69  117:invokespecial   #184 <Method void ConstraintAnchor(ConstraintWidget, ConstraintAnchor$Type)>
	//   70  120:putfield        #191 <Field ConstraintAnchor mTop>
		mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
	//   71  123:aload_0         
	//   72  124:new             #175 <Class ConstraintAnchor>
	//   73  127:dup             
	//   74  128:aload_0         
	//   75  129:getstatic       #194 <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//   76  132:invokespecial   #184 <Method void ConstraintAnchor(ConstraintWidget, ConstraintAnchor$Type)>
	//   77  135:putfield        #196 <Field ConstraintAnchor mRight>
		mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
	//   78  138:aload_0         
	//   79  139:new             #175 <Class ConstraintAnchor>
	//   80  142:dup             
	//   81  143:aload_0         
	//   82  144:getstatic       #199 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
	//   83  147:invokespecial   #184 <Method void ConstraintAnchor(ConstraintWidget, ConstraintAnchor$Type)>
	//   84  150:putfield        #201 <Field ConstraintAnchor mBottom>
		mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
	//   85  153:aload_0         
	//   86  154:new             #175 <Class ConstraintAnchor>
	//   87  157:dup             
	//   88  158:aload_0         
	//   89  159:getstatic       #204 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BASELINE>
	//   90  162:invokespecial   #184 <Method void ConstraintAnchor(ConstraintWidget, ConstraintAnchor$Type)>
	//   91  165:putfield        #206 <Field ConstraintAnchor mBaseline>
		mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
	//   92  168:aload_0         
	//   93  169:new             #175 <Class ConstraintAnchor>
	//   94  172:dup             
	//   95  173:aload_0         
	//   96  174:getstatic       #209 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_X>
	//   97  177:invokespecial   #184 <Method void ConstraintAnchor(ConstraintWidget, ConstraintAnchor$Type)>
	//   98  180:putfield        #211 <Field ConstraintAnchor mCenterX>
		mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
	//   99  183:aload_0         
	//  100  184:new             #175 <Class ConstraintAnchor>
	//  101  187:dup             
	//  102  188:aload_0         
	//  103  189:getstatic       #214 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_Y>
	//  104  192:invokespecial   #184 <Method void ConstraintAnchor(ConstraintWidget, ConstraintAnchor$Type)>
	//  105  195:putfield        #216 <Field ConstraintAnchor mCenterY>
		mCenter = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
	//  106  198:aload_0         
	//  107  199:new             #175 <Class ConstraintAnchor>
	//  108  202:dup             
	//  109  203:aload_0         
	//  110  204:getstatic       #219 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER>
	//  111  207:invokespecial   #184 <Method void ConstraintAnchor(ConstraintWidget, ConstraintAnchor$Type)>
	//  112  210:putfield        #221 <Field ConstraintAnchor mCenter>
		mListAnchors = (new ConstraintAnchor[] {
			mLeft, mRight, mTop, mBottom, mBaseline, mCenter
		});
	//  113  213:aload_0         
	//  114  214:bipush          6
	//  115  216:anewarray       ConstraintAnchor[]
	//  116  219:dup             
	//  117  220:iconst_0        
	//  118  221:aload_0         
	//  119  222:getfield        #186 <Field ConstraintAnchor mLeft>
	//  120  225:aastore         
	//  121  226:dup             
	//  122  227:iconst_1        
	//  123  228:aload_0         
	//  124  229:getfield        #196 <Field ConstraintAnchor mRight>
	//  125  232:aastore         
	//  126  233:dup             
	//  127  234:iconst_2        
	//  128  235:aload_0         
	//  129  236:getfield        #191 <Field ConstraintAnchor mTop>
	//  130  239:aastore         
	//  131  240:dup             
	//  132  241:iconst_3        
	//  133  242:aload_0         
	//  134  243:getfield        #201 <Field ConstraintAnchor mBottom>
	//  135  246:aastore         
	//  136  247:dup             
	//  137  248:iconst_4        
	//  138  249:aload_0         
	//  139  250:getfield        #206 <Field ConstraintAnchor mBaseline>
	//  140  253:aastore         
	//  141  254:dup             
	//  142  255:iconst_5        
	//  143  256:aload_0         
	//  144  257:getfield        #221 <Field ConstraintAnchor mCenter>
	//  145  260:aastore         
	//  146  261:putfield        #223 <Field ConstraintAnchor[] mListAnchors>
		mAnchors = new ArrayList();
	//  147  264:aload_0         
	//  148  265:new             #225 <Class ArrayList>
	//  149  268:dup             
	//  150  269:invokespecial   #226 <Method void ArrayList()>
	//  151  272:putfield        #228 <Field ArrayList mAnchors>
		mListDimensionBehaviors = (new DimensionBehaviour[] {
			DimensionBehaviour.FIXED, DimensionBehaviour.FIXED
		});
	//  152  275:aload_0         
	//  153  276:iconst_2        
	//  154  277:anewarray       DimensionBehaviour[]
	//  155  280:dup             
	//  156  281:iconst_0        
	//  157  282:getstatic       #232 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.FIXED>
	//  158  285:aastore         
	//  159  286:dup             
	//  160  287:iconst_1        
	//  161  288:getstatic       #232 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.FIXED>
	//  162  291:aastore         
	//  163  292:putfield        #234 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
		mParent = null;
	//  164  295:aload_0         
	//  165  296:aconst_null     
	//  166  297:putfield        #236 <Field ConstraintWidget mParent>
		mWidth = 0;
	//  167  300:aload_0         
	//  168  301:iconst_0        
	//  169  302:putfield        #238 <Field int mWidth>
		mHeight = 0;
	//  170  305:aload_0         
	//  171  306:iconst_0        
	//  172  307:putfield        #240 <Field int mHeight>
		mDimensionRatio = 0.0F;
	//  173  310:aload_0         
	//  174  311:fconst_0        
	//  175  312:putfield        #242 <Field float mDimensionRatio>
		mDimensionRatioSide = -1;
	//  176  315:aload_0         
	//  177  316:iconst_m1       
	//  178  317:putfield        #244 <Field int mDimensionRatioSide>
		mX = 0;
	//  179  320:aload_0         
	//  180  321:iconst_0        
	//  181  322:putfield        #246 <Field int mX>
		mY = 0;
	//  182  325:aload_0         
	//  183  326:iconst_0        
	//  184  327:putfield        #248 <Field int mY>
		mDrawX = 0;
	//  185  330:aload_0         
	//  186  331:iconst_0        
	//  187  332:putfield        #250 <Field int mDrawX>
		mDrawY = 0;
	//  188  335:aload_0         
	//  189  336:iconst_0        
	//  190  337:putfield        #252 <Field int mDrawY>
		mDrawWidth = 0;
	//  191  340:aload_0         
	//  192  341:iconst_0        
	//  193  342:putfield        #254 <Field int mDrawWidth>
		mDrawHeight = 0;
	//  194  345:aload_0         
	//  195  346:iconst_0        
	//  196  347:putfield        #256 <Field int mDrawHeight>
		mOffsetX = 0;
	//  197  350:aload_0         
	//  198  351:iconst_0        
	//  199  352:putfield        #258 <Field int mOffsetX>
		mOffsetY = 0;
	//  200  355:aload_0         
	//  201  356:iconst_0        
	//  202  357:putfield        #260 <Field int mOffsetY>
		mBaselineDistance = 0;
	//  203  360:aload_0         
	//  204  361:iconst_0        
	//  205  362:putfield        #262 <Field int mBaselineDistance>
		float f = DEFAULT_BIAS;
	//  206  365:getstatic       #264 <Field float DEFAULT_BIAS>
	//  207  368:fstore          5
		mHorizontalBiasPercent = f;
	//  208  370:aload_0         
	//  209  371:fload           5
	//  210  373:putfield        #266 <Field float mHorizontalBiasPercent>
		mVerticalBiasPercent = f;
	//  211  376:aload_0         
	//  212  377:fload           5
	//  213  379:putfield        #268 <Field float mVerticalBiasPercent>
		mContainerItemSkip = 0;
	//  214  382:aload_0         
	//  215  383:iconst_0        
	//  216  384:putfield        #270 <Field int mContainerItemSkip>
		mVisibility = 0;
	//  217  387:aload_0         
	//  218  388:iconst_0        
	//  219  389:putfield        #272 <Field int mVisibility>
		mDebugName = null;
	//  220  392:aload_0         
	//  221  393:aconst_null     
	//  222  394:putfield        #274 <Field String mDebugName>
		mType = null;
	//  223  397:aload_0         
	//  224  398:aconst_null     
	//  225  399:putfield        #276 <Field String mType>
		mHorizontalChainStyle = 0;
	//  226  402:aload_0         
	//  227  403:iconst_0        
	//  228  404:putfield        #278 <Field int mHorizontalChainStyle>
		mVerticalChainStyle = 0;
	//  229  407:aload_0         
	//  230  408:iconst_0        
	//  231  409:putfield        #280 <Field int mVerticalChainStyle>
	//  232  412:aload_0         
	//  233  413:iconst_2        
	//  234  414:newarray        float[]
	//  235  416:dup             
	//  236  417:iconst_0        
	//  237  418:ldc2            #281 <Float -1F>
	//  238  421:fastore         
	//  239  422:dup             
	//  240  423:iconst_1        
	//  241  424:ldc2            #281 <Float -1F>
	//  242  427:fastore         
	//  243  428:putfield        #283 <Field float[] mWeight>
	//  244  431:aload_0         
	//  245  432:iconst_2        
	//  246  433:anewarray       ConstraintWidget[]
	//  247  436:dup             
	//  248  437:iconst_0        
	//  249  438:aconst_null     
	//  250  439:aastore         
	//  251  440:dup             
	//  252  441:iconst_1        
	//  253  442:aconst_null     
	//  254  443:aastore         
	//  255  444:putfield        #285 <Field ConstraintWidget[] mListNextMatchConstraintsWidget>
	//  256  447:aload_0         
	//  257  448:iconst_2        
	//  258  449:anewarray       ConstraintWidget[]
	//  259  452:dup             
	//  260  453:iconst_0        
	//  261  454:aconst_null     
	//  262  455:aastore         
	//  263  456:dup             
	//  264  457:iconst_1        
	//  265  458:aconst_null     
	//  266  459:aastore         
	//  267  460:putfield        #287 <Field ConstraintWidget[] mListNextVisibleWidget>
		mHorizontalNextWidget = null;
	//  268  463:aload_0         
	//  269  464:aconst_null     
	//  270  465:putfield        #289 <Field ConstraintWidget mHorizontalNextWidget>
		mVerticalNextWidget = null;
	//  271  468:aload_0         
	//  272  469:aconst_null     
	//  273  470:putfield        #291 <Field ConstraintWidget mVerticalNextWidget>
		mX = i;
	//  274  473:aload_0         
	//  275  474:iload_1         
	//  276  475:putfield        #246 <Field int mX>
		mY = j;
	//  277  478:aload_0         
	//  278  479:iload_2         
	//  279  480:putfield        #248 <Field int mY>
		mWidth = k;
	//  280  483:aload_0         
	//  281  484:iload_3         
	//  282  485:putfield        #238 <Field int mWidth>
		mHeight = l;
	//  283  488:aload_0         
	//  284  489:iload           4
	//  285  491:putfield        #240 <Field int mHeight>
		addAnchors();
	//  286  494:aload_0         
	//  287  495:invokespecial   #294 <Method void addAnchors()>
		forceUpdateDrawPosition();
	//  288  498:aload_0         
	//  289  499:invokevirtual   #301 <Method void forceUpdateDrawPosition()>
	//  290  502:return          
	}

	private void addAnchors()
	{
		mAnchors.add(((Object) (mLeft)));
	//    0    0:aload_0         
	//    1    1:getfield        #228 <Field ArrayList mAnchors>
	//    2    4:aload_0         
	//    3    5:getfield        #186 <Field ConstraintAnchor mLeft>
	//    4    8:invokevirtual   #305 <Method boolean ArrayList.add(Object)>
	//    5   11:pop             
		mAnchors.add(((Object) (mTop)));
	//    6   12:aload_0         
	//    7   13:getfield        #228 <Field ArrayList mAnchors>
	//    8   16:aload_0         
	//    9   17:getfield        #191 <Field ConstraintAnchor mTop>
	//   10   20:invokevirtual   #305 <Method boolean ArrayList.add(Object)>
	//   11   23:pop             
		mAnchors.add(((Object) (mRight)));
	//   12   24:aload_0         
	//   13   25:getfield        #228 <Field ArrayList mAnchors>
	//   14   28:aload_0         
	//   15   29:getfield        #196 <Field ConstraintAnchor mRight>
	//   16   32:invokevirtual   #305 <Method boolean ArrayList.add(Object)>
	//   17   35:pop             
		mAnchors.add(((Object) (mBottom)));
	//   18   36:aload_0         
	//   19   37:getfield        #228 <Field ArrayList mAnchors>
	//   20   40:aload_0         
	//   21   41:getfield        #201 <Field ConstraintAnchor mBottom>
	//   22   44:invokevirtual   #305 <Method boolean ArrayList.add(Object)>
	//   23   47:pop             
		mAnchors.add(((Object) (mCenterX)));
	//   24   48:aload_0         
	//   25   49:getfield        #228 <Field ArrayList mAnchors>
	//   26   52:aload_0         
	//   27   53:getfield        #211 <Field ConstraintAnchor mCenterX>
	//   28   56:invokevirtual   #305 <Method boolean ArrayList.add(Object)>
	//   29   59:pop             
		mAnchors.add(((Object) (mCenterY)));
	//   30   60:aload_0         
	//   31   61:getfield        #228 <Field ArrayList mAnchors>
	//   32   64:aload_0         
	//   33   65:getfield        #216 <Field ConstraintAnchor mCenterY>
	//   34   68:invokevirtual   #305 <Method boolean ArrayList.add(Object)>
	//   35   71:pop             
		mAnchors.add(((Object) (mCenter)));
	//   36   72:aload_0         
	//   37   73:getfield        #228 <Field ArrayList mAnchors>
	//   38   76:aload_0         
	//   39   77:getfield        #221 <Field ConstraintAnchor mCenter>
	//   40   80:invokevirtual   #305 <Method boolean ArrayList.add(Object)>
	//   41   83:pop             
		mAnchors.add(((Object) (mBaseline)));
	//   42   84:aload_0         
	//   43   85:getfield        #228 <Field ArrayList mAnchors>
	//   44   88:aload_0         
	//   45   89:getfield        #206 <Field ConstraintAnchor mBaseline>
	//   46   92:invokevirtual   #305 <Method boolean ArrayList.add(Object)>
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
	//    2    3:invokevirtual   #313 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//    3    6:astore          30
				solvervariable2 = linearsystem.createObjectVariable(((Object) (constraintanchor1)));
	//    4    8:aload_1         
	//    5    9:aload           8
	//    6   11:invokevirtual   #313 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//    7   14:astore          26
				solvervariable5 = linearsystem.createObjectVariable(((Object) (constraintanchor.getTarget())));
	//    8   16:aload_1         
	//    9   17:aload           7
	//   10   19:invokevirtual   #317 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//   11   22:invokevirtual   #313 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//   12   25:astore          29
				solvervariable3 = linearsystem.createObjectVariable(((Object) (constraintanchor1.getTarget())));
	//   13   27:aload_1         
	//   14   28:aload           8
	//   15   30:invokevirtual   #317 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//   16   33:invokevirtual   #313 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//   17   36:astore          27
				if(linearsystem.graphOptimizer && constraintanchor.getResolutionNode().state == 1 && constraintanchor1.getResolutionNode().state == 1)
	//*  18   38:aload_1         
	//*  19   39:getfield        #320 <Field boolean LinearSystem.graphOptimizer>
	//*  20   42:ifeq            128
	//*  21   45:aload           7
	//*  22   47:invokevirtual   #324 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//*  23   50:getfield        #329 <Field int ResolutionAnchor.state>
	//*  24   53:iconst_1        
	//*  25   54:icmpne          128
	//*  26   57:aload           8
	//*  27   59:invokevirtual   #324 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//*  28   62:getfield        #329 <Field int ResolutionAnchor.state>
	//*  29   65:iconst_1        
	//*  30   66:icmpne          128
				{
					if(LinearSystem.getMetrics() != null)
	//*  31   69:invokestatic    #333 <Method Metrics LinearSystem.getMetrics()>
	//*  32   72:ifnull          89
					{
						solvervariable = ((SolverVariable) (LinearSystem.getMetrics()));
	//   33   75:invokestatic    #333 <Method Metrics LinearSystem.getMetrics()>
	//   34   78:astore_3        
						solvervariable.resolvedWidgets = ((Metrics) (solvervariable)).resolvedWidgets + 1L;
	//   35   79:aload_3         
	//   36   80:aload_3         
	//   37   81:getfield        #339 <Field long Metrics.resolvedWidgets>
	//   38   84:lconst_1        
	//   39   85:ladd            
	//   40   86:putfield        #339 <Field long Metrics.resolvedWidgets>
					}
					constraintanchor.getResolutionNode().addResolvedValue(linearsystem);
	//   41   89:aload           7
	//   42   91:invokevirtual   #324 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   43   94:aload_1         
	//   44   95:invokevirtual   #343 <Method void ResolutionAnchor.addResolvedValue(LinearSystem)>
					constraintanchor1.getResolutionNode().addResolvedValue(linearsystem);
	//   45   98:aload           8
	//   46  100:invokevirtual   #324 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   47  103:aload_1         
	//   48  104:invokevirtual   #343 <Method void ResolutionAnchor.addResolvedValue(LinearSystem)>
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
	//   58  124:invokevirtual   #347 <Method void LinearSystem.addGreaterThan(SolverVariable, SolverVariable, int, int)>
					return;
	//   59  127:return          
				}
				if(LinearSystem.getMetrics() != null)
	//*  60  128:invokestatic    #333 <Method Metrics LinearSystem.getMetrics()>
	//*  61  131:ifnull          154
				{
					Metrics metrics = LinearSystem.getMetrics();
	//   62  134:invokestatic    #333 <Method Metrics LinearSystem.getMetrics()>
	//   63  137:astore          28
					metrics.nonresolvedWidgets = metrics.nonresolvedWidgets + 1L;
	//   64  139:aload           28
	//   65  141:aload           28
	//   66  143:getfield        #350 <Field long Metrics.nonresolvedWidgets>
	//   67  146:lconst_1        
	//   68  147:ladd            
	//   69  148:putfield        #350 <Field long Metrics.nonresolvedWidgets>
				}
	//*  70  151:goto            154
				flag5 = constraintanchor.isConnected();
	//   71  154:aload           7
	//   72  156:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//   73  159:istore          23
				flag6 = constraintanchor1.isConnected();
	//   74  161:aload           8
	//   75  163:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//   76  166:istore          24
				flag7 = mCenter.isConnected();
	//   77  168:aload_0         
	//   78  169:getfield        #221 <Field ConstraintAnchor mCenter>
	//   79  172:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
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
	//* 111  236:getstatic       #357 <Field int[] ConstraintWidget$1.$SwitchMap$android$support$constraint$solver$widgets$ConstraintWidget$DimensionBehaviour>
	//* 112  239:aload           5
	//* 113  241:invokevirtual   #361 <Method int ConstraintWidget$DimensionBehaviour.ordinal()>
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
	//* 137  316:getfield        #272 <Field int mVisibility>
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
	//  156  358:invokevirtual   #365 <Method void LinearSystem.addEquality(SolverVariable, int)>
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
	//  166  381:invokevirtual   #368 <Method int ConstraintAnchor.getMargin()>
	//  167  384:bipush          6
	//  168  386:invokevirtual   #371 <Method ArrayRow LinearSystem.addEquality(SolverVariable, SolverVariable, int, int)>
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
	//  179  407:invokevirtual   #371 <Method ArrayRow LinearSystem.addEquality(SolverVariable, SolverVariable, int, int)>
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
	//  188  425:invokevirtual   #347 <Method void LinearSystem.addGreaterThan(SolverVariable, SolverVariable, int, int)>
	//* 189  428:goto            431
						if(l < 0x7fffffff)
	//* 190  431:iload           12
	//* 191  433:ldc1            #169 <Int 0x7fffffff>
	//* 192  435:icmpge          466
							linearsystem.addLowerThan(solvervariable2, solvervariable6, l, 6);
	//  193  438:aload_1         
	//  194  439:aload           26
	//  195  441:aload           30
	//  196  443:iload           12
	//  197  445:bipush          6
	//  198  447:invokevirtual   #374 <Method void LinearSystem.addLowerThan(SolverVariable, SolverVariable, int, int)>
					} else
	//* 199  450:goto            466
					{
						linearsystem.addEquality(solvervariable2, solvervariable6, j, 6);
	//  200  453:aload_1         
	//  201  454:aload           26
	//  202  456:aload           30
	//  203  458:iload           10
	//  204  460:bipush          6
	//  205  462:invokevirtual   #371 <Method ArrayRow LinearSystem.addEquality(SolverVariable, SolverVariable, int, int)>
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
	//  236  528:invokevirtual   #347 <Method void LinearSystem.addGreaterThan(SolverVariable, SolverVariable, int, int)>
					else
	//* 237  531:goto            546
						linearsystem.addGreaterThan(solvervariable2, solvervariable6, i, 6);
	//  238  534:aload_1         
	//  239  535:aload           26
	//  240  537:aload           30
	//  241  539:iload           9
	//  242  541:bipush          6
	//  243  543:invokevirtual   #347 <Method void LinearSystem.addGreaterThan(SolverVariable, SolverVariable, int, int)>
					j = Math.max(j, i);
	//  244  546:iload           10
	//  245  548:iload           9
	//  246  550:invokestatic    #380 <Method int Math.max(int, int)>
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
	//  258  575:invokevirtual   #374 <Method void LinearSystem.addLowerThan(SolverVariable, SolverVariable, int, int)>
					else
	//* 259  578:goto            593
						linearsystem.addLowerThan(solvervariable2, solvervariable6, l, 6);
	//  260  581:aload_1         
	//  261  582:aload           26
	//  262  584:aload           30
	//  263  586:iload           12
	//  264  588:bipush          6
	//  265  590:invokevirtual   #374 <Method void LinearSystem.addLowerThan(SolverVariable, SolverVariable, int, int)>
					k1 = Math.min(j, l);
	//  266  593:iload           10
	//  267  595:iload           12
	//  268  597:invokestatic    #383 <Method int Math.min(int, int)>
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
	//  283  628:invokevirtual   #371 <Method ArrayRow LinearSystem.addEquality(SolverVariable, SolverVariable, int, int)>
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
	//  293  648:invokevirtual   #371 <Method ArrayRow LinearSystem.addEquality(SolverVariable, SolverVariable, int, int)>
	//  294  651:pop             
					else
	//* 295  652:goto            795
						linearsystem.addEquality(solvervariable2, solvervariable6, k1, 1);
	//  296  655:aload_1         
	//  297  656:aload           26
	//  298  658:aload           30
	//  299  660:iload           18
	//  300  662:iconst_1        
	//  301  663:invokevirtual   #371 <Method ArrayRow LinearSystem.addEquality(SolverVariable, SolverVariable, int, int)>
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
	//* 308  678:invokevirtual   #387 <Method ConstraintAnchor$Type ConstraintAnchor.getType()>
	//* 309  681:getstatic       #189 <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//* 310  684:if_acmpeq       736
	//* 311  687:aload           7
	//* 312  689:invokevirtual   #387 <Method ConstraintAnchor$Type ConstraintAnchor.getType()>
	//* 313  692:getstatic       #199 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
	//* 314  695:if_acmpne       701
	//* 315  698:goto            736
					{
						dimensionbehaviour = ((DimensionBehaviour) (linearsystem.createObjectVariable(((Object) (mParent.getAnchor(ConstraintAnchor.Type.LEFT))))));
	//  316  701:aload_1         
	//  317  702:aload_0         
	//  318  703:getfield        #236 <Field ConstraintWidget mParent>
	//  319  706:getstatic       #181 <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//  320  709:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//  321  712:invokevirtual   #313 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//  322  715:astore          5
						solvervariable4 = linearsystem.createObjectVariable(((Object) (mParent.getAnchor(ConstraintAnchor.Type.RIGHT))));
	//  323  717:aload_1         
	//  324  718:aload_0         
	//  325  719:getfield        #236 <Field ConstraintWidget mParent>
	//  326  722:getstatic       #194 <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//  327  725:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//  328  728:invokevirtual   #313 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//  329  731:astore          28
					} else
	//* 330  733:goto            768
					{
						dimensionbehaviour = ((DimensionBehaviour) (linearsystem.createObjectVariable(((Object) (mParent.getAnchor(ConstraintAnchor.Type.TOP))))));
	//  331  736:aload_1         
	//  332  737:aload_0         
	//  333  738:getfield        #236 <Field ConstraintWidget mParent>
	//  334  741:getstatic       #189 <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//  335  744:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//  336  747:invokevirtual   #313 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//  337  750:astore          5
						solvervariable4 = linearsystem.createObjectVariable(((Object) (mParent.getAnchor(ConstraintAnchor.Type.BOTTOM))));
	//  338  752:aload_1         
	//  339  753:aload_0         
	//  340  754:getfield        #236 <Field ConstraintWidget mParent>
	//  341  757:getstatic       #199 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
	//  342  760:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//  343  763:invokevirtual   #313 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//  344  766:astore          28
					}
					linearsystem.addConstraint(linearsystem.createRow().createRowDimensionRatio(solvervariable2, solvervariable6, solvervariable4, ((SolverVariable) (dimensionbehaviour)), f1));
	//  345  768:aload_1         
	//  346  769:aload_1         
	//  347  770:invokevirtual   #395 <Method ArrayRow LinearSystem.createRow()>
	//  348  773:aload           26
	//  349  775:aload           30
	//  350  777:aload           28
	//  351  779:aload           5
	//  352  781:fload           19
	//  353  783:invokevirtual   #401 <Method ArrayRow ArrayRow.createRowDimensionRatio(SolverVariable, SolverVariable, SolverVariable, SolverVariable, float)>
	//  354  786:invokevirtual   #405 <Method void LinearSystem.addConstraint(ArrayRow)>
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
	//  371  823:invokestatic    #380 <Method int Math.max(int, int)>
	//  372  826:istore          10
				if(j1 > 0)
	//* 373  828:iload           17
	//* 374  830:ifle            845
					j = Math.min(j1, j);
	//  375  833:iload           17
	//  376  835:iload           10
	//  377  837:invokestatic    #383 <Method int Math.min(int, int)>
	//  378  840:istore          10
	//* 379  842:goto            845
				linearsystem.addEquality(solvervariable2, solvervariable6, j, 6);
	//  380  845:aload_1         
	//  381  846:aload           26
	//  382  848:aload           30
	//  383  850:iload           10
	//  384  852:bipush          6
	//  385  854:invokevirtual   #371 <Method ArrayRow LinearSystem.addEquality(SolverVariable, SolverVariable, int, int)>
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
	//* 403  890:ifeq            1477
	//* 404  893:iload           15
	//* 405  895:ifeq            901
	//* 406  898:goto            1477
		{
			if(!flag5 && !flag6 && !flag7)
	//* 407  901:iload           23
	//* 408  903:ifne            950
	//* 409  906:iload           24
	//* 410  908:ifne            950
	//* 411  911:iload           25
	//* 412  913:ifne            950
			{
				if(flag)
	//* 413  916:iload_2         
	//* 414  917:ifeq            940
				{
					linearsystem.addGreaterThan(solvervariable1, solvervariable2, 0, 5);
	//  415  920:aload_1         
	//  416  921:aload           4
	//  417  923:aload           26
	//  418  925:iconst_0        
	//  419  926:iconst_5        
	//  420  927:invokevirtual   #347 <Method void LinearSystem.addGreaterThan(SolverVariable, SolverVariable, int, int)>
					solvervariable = solvervariable2;
	//  421  930:aload           26
	//  422  932:astore_3        
					i = 6;
	//  423  933:bipush          6
	//  424  935:istore          9
				} else
	//* 425  937:goto            1462
				{
					solvervariable = solvervariable2;
	//  426  940:aload           26
	//  427  942:astore_3        
					i = 6;
	//  428  943:bipush          6
	//  429  945:istore          9
				}
			} else
	//* 430  947:goto            1462
			if(flag5 && !flag6)
	//* 431  950:iload           23
	//* 432  952:ifeq            994
	//* 433  955:iload           24
	//* 434  957:ifne            994
			{
				if(flag)
	//* 435  960:iload_2         
	//* 436  961:ifeq            984
				{
					linearsystem.addGreaterThan(solvervariable1, solvervariable2, 0, 5);
	//  437  964:aload_1         
	//  438  965:aload           4
	//  439  967:aload           26
	//  440  969:iconst_0        
	//  441  970:iconst_5        
	//  442  971:invokevirtual   #347 <Method void LinearSystem.addGreaterThan(SolverVariable, SolverVariable, int, int)>
					solvervariable = solvervariable2;
	//  443  974:aload           26
	//  444  976:astore_3        
					i = 6;
	//  445  977:bipush          6
	//  446  979:istore          9
				} else
	//* 447  981:goto            1462
				{
					solvervariable = solvervariable2;
	//  448  984:aload           26
	//  449  986:astore_3        
					i = 6;
	//  450  987:bipush          6
	//  451  989:istore          9
				}
			} else
	//* 452  991:goto            1462
			if(!flag5 && flag6)
	//* 453  994:iload           23
	//* 454  996:ifne            1054
	//* 455  999:iload           24
	//* 456 1001:ifeq            1054
			{
				linearsystem.addEquality(solvervariable2, solvervariable3, -constraintanchor1.getMargin(), 6);
	//  457 1004:aload_1         
	//  458 1005:aload           26
	//  459 1007:aload           27
	//  460 1009:aload           8
	//  461 1011:invokevirtual   #368 <Method int ConstraintAnchor.getMargin()>
	//  462 1014:ineg            
	//  463 1015:bipush          6
	//  464 1017:invokevirtual   #371 <Method ArrayRow LinearSystem.addEquality(SolverVariable, SolverVariable, int, int)>
	//  465 1020:pop             
				if(flag)
	//* 466 1021:iload_2         
	//* 467 1022:ifeq            1044
				{
					linearsystem.addGreaterThan(solvervariable6, solvervariable, 0, 5);
	//  468 1025:aload_1         
	//  469 1026:aload           30
	//  470 1028:aload_3         
	//  471 1029:iconst_0        
	//  472 1030:iconst_5        
	//  473 1031:invokevirtual   #347 <Method void LinearSystem.addGreaterThan(SolverVariable, SolverVariable, int, int)>
					solvervariable = solvervariable2;
	//  474 1034:aload           26
	//  475 1036:astore_3        
					i = 6;
	//  476 1037:bipush          6
	//  477 1039:istore          9
				} else
	//* 478 1041:goto            1462
				{
					solvervariable = solvervariable2;
	//  479 1044:aload           26
	//  480 1046:astore_3        
					i = 6;
	//  481 1047:bipush          6
	//  482 1049:istore          9
				}
			} else
	//* 483 1051:goto            1462
			if(flag5 && flag6)
	//* 484 1054:iload           23
	//* 485 1056:ifeq            1455
	//* 486 1059:iload           24
	//* 487 1061:ifeq            1455
			{
				if(i1 != 0)
	//* 488 1064:iload           16
	//* 489 1066:ifeq            1310
				{
					if(flag && k == 0)
	//* 490 1069:iload_2         
	//* 491 1070:ifeq            1092
	//* 492 1073:iload           11
	//* 493 1075:ifne            1092
						linearsystem.addGreaterThan(solvervariable2, solvervariable6, 0, 6);
	//  494 1078:aload_1         
	//  495 1079:aload           26
	//  496 1081:aload           30
	//  497 1083:iconst_0        
	//  498 1084:bipush          6
	//  499 1086:invokevirtual   #347 <Method void LinearSystem.addGreaterThan(SolverVariable, SolverVariable, int, int)>
	//* 500 1089:goto            1092
					if(l1 == 0)
	//* 501 1092:iload           21
	//* 502 1094:ifne            1203
					{
						if(j <= 0 && l <= 0)
	//* 503 1097:iload           10
	//* 504 1099:ifgt            1120
	//* 505 1102:iload           12
	//* 506 1104:ifle            1110
	//* 507 1107:goto            1120
						{
							k = 6;
	//  508 1110:bipush          6
	//  509 1112:istore          11
							i = 0;
	//  510 1114:iconst_0        
	//  511 1115:istore          9
						} else
	//* 512 1117:goto            1126
						{
							k = 4;
	//  513 1120:iconst_4        
	//  514 1121:istore          11
							i = 1;
	//  515 1123:iconst_1        
	//  516 1124:istore          9
						}
						linearsystem.addEquality(solvervariable6, ((SolverVariable) (dimensionbehaviour)), constraintanchor.getMargin(), k);
	//  517 1126:aload_1         
	//  518 1127:aload           30
	//  519 1129:aload           5
	//  520 1131:aload           7
	//  521 1133:invokevirtual   #368 <Method int ConstraintAnchor.getMargin()>
	//  522 1136:iload           11
	//  523 1138:invokevirtual   #371 <Method ArrayRow LinearSystem.addEquality(SolverVariable, SolverVariable, int, int)>
	//  524 1141:pop             
						linearsystem.addEquality(solvervariable2, solvervariable3, -constraintanchor1.getMargin(), k);
	//  525 1142:aload_1         
	//  526 1143:aload           26
	//  527 1145:aload           27
	//  528 1147:aload           8
	//  529 1149:invokevirtual   #368 <Method int ConstraintAnchor.getMargin()>
	//  530 1152:ineg            
	//  531 1153:iload           11
	//  532 1155:invokevirtual   #371 <Method ArrayRow LinearSystem.addEquality(SolverVariable, SolverVariable, int, int)>
	//  533 1158:pop             
						if(j <= 0 && l <= 0)
	//* 534 1159:iload           10
	//* 535 1161:ifgt            1178
	//* 536 1164:iload           12
	//* 537 1166:ifle            1172
	//* 538 1169:goto            1178
							j = 0;
	//  539 1172:iconst_0        
	//  540 1173:istore          10
						else
	//* 541 1175:goto            1181
							j = 1;
	//  542 1178:iconst_1        
	//  543 1179:istore          10
						k = 5;
	//  544 1181:iconst_5        
	//  545 1182:istore          11
						l = i;
	//  546 1184:iload           9
	//  547 1186:istore          12
						i = k;
	//  548 1188:iload           11
	//  549 1190:istore          9
						k = j;
	//  550 1192:iload           10
	//  551 1194:istore          11
						j = l;
	//  552 1196:iload           12
	//  553 1198:istore          10
					} else
	//* 554 1200:goto            1352
					{
						k = 1;
	//  555 1203:iconst_1        
	//  556 1204:istore          11
						if(l1 == 1)
	//* 557 1206:iload           21
	//* 558 1208:iconst_1        
	//* 559 1209:icmpne          1222
						{
							j = 1;
	//  560 1212:iconst_1        
	//  561 1213:istore          10
							i = 6;
	//  562 1215:bipush          6
	//  563 1217:istore          9
						} else
	//* 564 1219:goto            1352
						if(l1 == 3)
	//* 565 1222:iload           21
	//* 566 1224:iconst_3        
	//* 567 1225:icmpne          1298
						{
							if(!flag2 && mResolvedDimensionRatioSide != -1 && j <= 0)
	//* 568 1228:iload           14
	//* 569 1230:ifne            1253
	//* 570 1233:aload_0         
	//* 571 1234:getfield        #166 <Field int mResolvedDimensionRatioSide>
	//* 572 1237:iconst_m1       
	//* 573 1238:icmpeq          1253
	//* 574 1241:iload           10
	//* 575 1243:ifgt            1253
								i = 6;
	//  576 1246:bipush          6
	//  577 1248:istore          9
							else
	//* 578 1250:goto            1256
								i = 4;
	//  579 1253:iconst_4        
	//  580 1254:istore          9
							linearsystem.addEquality(solvervariable6, ((SolverVariable) (dimensionbehaviour)), constraintanchor.getMargin(), i);
	//  581 1256:aload_1         
	//  582 1257:aload           30
	//  583 1259:aload           5
	//  584 1261:aload           7
	//  585 1263:invokevirtual   #368 <Method int ConstraintAnchor.getMargin()>
	//  586 1266:iload           9
	//  587 1268:invokevirtual   #371 <Method ArrayRow LinearSystem.addEquality(SolverVariable, SolverVariable, int, int)>
	//  588 1271:pop             
							linearsystem.addEquality(solvervariable2, solvervariable3, -constraintanchor1.getMargin(), i);
	//  589 1272:aload_1         
	//  590 1273:aload           26
	//  591 1275:aload           27
	//  592 1277:aload           8
	//  593 1279:invokevirtual   #368 <Method int ConstraintAnchor.getMargin()>
	//  594 1282:ineg            
	//  595 1283:iload           9
	//  596 1285:invokevirtual   #371 <Method ArrayRow LinearSystem.addEquality(SolverVariable, SolverVariable, int, int)>
	//  597 1288:pop             
							j = 1;
	//  598 1289:iconst_1        
	//  599 1290:istore          10
							i = 5;
	//  600 1292:iconst_5        
	//  601 1293:istore          9
						} else
	//* 602 1295:goto            1352
						{
							i = 5;
	//  603 1298:iconst_5        
	//  604 1299:istore          9
							k = 0;
	//  605 1301:iconst_0        
	//  606 1302:istore          11
							j = 0;
	//  607 1304:iconst_0        
	//  608 1305:istore          10
						}
					}
				} else
	//* 609 1307:goto            1352
				{
					k = 1;
	//  610 1310:iconst_1        
	//  611 1311:istore          11
					if(flag)
	//* 612 1313:iload_2         
	//* 613 1314:ifeq            1346
					{
						linearsystem.addGreaterThan(solvervariable6, ((SolverVariable) (dimensionbehaviour)), constraintanchor.getMargin(), 5);
	//  614 1317:aload_1         
	//  615 1318:aload           30
	//  616 1320:aload           5
	//  617 1322:aload           7
	//  618 1324:invokevirtual   #368 <Method int ConstraintAnchor.getMargin()>
	//  619 1327:iconst_5        
	//  620 1328:invokevirtual   #347 <Method void LinearSystem.addGreaterThan(SolverVariable, SolverVariable, int, int)>
						linearsystem.addLowerThan(solvervariable2, solvervariable3, -constraintanchor1.getMargin(), 5);
	//  621 1331:aload_1         
	//  622 1332:aload           26
	//  623 1334:aload           27
	//  624 1336:aload           8
	//  625 1338:invokevirtual   #368 <Method int ConstraintAnchor.getMargin()>
	//  626 1341:ineg            
	//  627 1342:iconst_5        
	//  628 1343:invokevirtual   #374 <Method void LinearSystem.addLowerThan(SolverVariable, SolverVariable, int, int)>
					}
					i = 5;
	//  629 1346:iconst_5        
	//  630 1347:istore          9
					j = 0;
	//  631 1349:iconst_0        
	//  632 1350:istore          10
				}
				if(k != 0)
	//* 633 1352:iload           11
	//* 634 1354:ifeq            1386
					linearsystem.addCentering(solvervariable6, ((SolverVariable) (dimensionbehaviour)), constraintanchor.getMargin(), f, solvervariable3, solvervariable2, constraintanchor1.getMargin(), i);
	//  635 1357:aload_1         
	//  636 1358:aload           30
	//  637 1360:aload           5
	//  638 1362:aload           7
	//  639 1364:invokevirtual   #368 <Method int ConstraintAnchor.getMargin()>
	//  640 1367:fload           13
	//  641 1369:aload           27
	//  642 1371:aload           26
	//  643 1373:aload           8
	//  644 1375:invokevirtual   #368 <Method int ConstraintAnchor.getMargin()>
	//  645 1378:iload           9
	//  646 1380:invokevirtual   #409 <Method void LinearSystem.addCentering(SolverVariable, SolverVariable, int, float, SolverVariable, SolverVariable, int, int)>
	//* 647 1383:goto            1386
				i = 6;
	//  648 1386:bipush          6
	//  649 1388:istore          9
				if(j != 0)
	//* 650 1390:iload           10
	//* 651 1392:ifeq            1429
				{
					linearsystem.addGreaterThan(solvervariable6, ((SolverVariable) (dimensionbehaviour)), constraintanchor.getMargin(), i);
	//  652 1395:aload_1         
	//  653 1396:aload           30
	//  654 1398:aload           5
	//  655 1400:aload           7
	//  656 1402:invokevirtual   #368 <Method int ConstraintAnchor.getMargin()>
	//  657 1405:iload           9
	//  658 1407:invokevirtual   #347 <Method void LinearSystem.addGreaterThan(SolverVariable, SolverVariable, int, int)>
					linearsystem.addLowerThan(solvervariable2, solvervariable3, -constraintanchor1.getMargin(), i);
	//  659 1410:aload_1         
	//  660 1411:aload           26
	//  661 1413:aload           27
	//  662 1415:aload           8
	//  663 1417:invokevirtual   #368 <Method int ConstraintAnchor.getMargin()>
	//  664 1420:ineg            
	//  665 1421:iload           9
	//  666 1423:invokevirtual   #374 <Method void LinearSystem.addLowerThan(SolverVariable, SolverVariable, int, int)>
				}
	//* 667 1426:goto            1429
				if(flag)
	//* 668 1429:iload_2         
	//* 669 1430:ifeq            1449
				{
					linearsystem.addGreaterThan(solvervariable6, solvervariable, 0, i);
	//  670 1433:aload_1         
	//  671 1434:aload           30
	//  672 1436:aload_3         
	//  673 1437:iconst_0        
	//  674 1438:iload           9
	//  675 1440:invokevirtual   #347 <Method void LinearSystem.addGreaterThan(SolverVariable, SolverVariable, int, int)>
					solvervariable = solvervariable2;
	//  676 1443:aload           26
	//  677 1445:astore_3        
				} else
	//* 678 1446:goto            1462
				{
					solvervariable = solvervariable2;
	//  679 1449:aload           26
	//  680 1451:astore_3        
				}
			} else
	//* 681 1452:goto            1462
			{
				solvervariable = solvervariable2;
	//  682 1455:aload           26
	//  683 1457:astore_3        
				i = 6;
	//  684 1458:bipush          6
	//  685 1460:istore          9
			}
			if(flag)
	//* 686 1462:iload_2         
	//* 687 1463:ifeq            1476
				linearsystem.addGreaterThan(solvervariable1, solvervariable, 0, i);
	//  688 1466:aload_1         
	//  689 1467:aload           4
	//  690 1469:aload_3         
	//  691 1470:iconst_0        
	//  692 1471:iload           9
	//  693 1473:invokevirtual   #347 <Method void LinearSystem.addGreaterThan(SolverVariable, SolverVariable, int, int)>
			return;
	//  694 1476:return          
		}
		if(i2 < 2 && flag)
	//* 695 1477:iload           22
	//* 696 1479:iconst_2        
	//* 697 1480:icmpge          1508
	//* 698 1483:iload_2         
	//* 699 1484:ifeq            1508
		{
			linearsystem.addGreaterThan(solvervariable6, solvervariable, 0, 6);
	//  700 1487:aload_1         
	//  701 1488:aload           30
	//  702 1490:aload_3         
	//  703 1491:iconst_0        
	//  704 1492:bipush          6
	//  705 1494:invokevirtual   #347 <Method void LinearSystem.addGreaterThan(SolverVariable, SolverVariable, int, int)>
			linearsystem.addGreaterThan(solvervariable1, solvervariable2, 0, 6);
	//  706 1497:aload_1         
	//  707 1498:aload           4
	//  708 1500:aload           26
	//  709 1502:iconst_0        
	//  710 1503:bipush          6
	//  711 1505:invokevirtual   #347 <Method void LinearSystem.addGreaterThan(SolverVariable, SolverVariable, int, int)>
		}
	//  712 1508:return          
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
	//    2    2:getfield        #186 <Field ConstraintAnchor mLeft>
	//    3    5:invokevirtual   #313 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//    4    8:astore          24
			solvervariable1 = linearsystem.createObjectVariable(((Object) (mRight)));
	//    5   10:aload_1         
	//    6   11:aload_0         
	//    7   12:getfield        #196 <Field ConstraintAnchor mRight>
	//    8   15:invokevirtual   #313 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//    9   18:astore          21
			obj4 = ((Object) (linearsystem.createObjectVariable(((Object) (mTop)))));
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #191 <Field ConstraintAnchor mTop>
	//   13   25:invokevirtual   #313 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//   14   28:astore          22
			solvervariable = linearsystem.createObjectVariable(((Object) (mBottom)));
	//   15   30:aload_1         
	//   16   31:aload_0         
	//   17   32:getfield        #201 <Field ConstraintAnchor mBottom>
	//   18   35:invokevirtual   #313 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//   19   38:astore          20
			obj = ((Object) (linearsystem.createObjectVariable(((Object) (mBaseline)))));
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #206 <Field ConstraintAnchor mBaseline>
	//   23   45:invokevirtual   #313 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//   24   48:astore          17
			ConstraintWidget constraintwidget = mParent;
	//   25   50:aload_0         
	//   26   51:getfield        #236 <Field ConstraintWidget mParent>
	//   27   54:astore          18
			if(constraintwidget != null)
	//*  28   56:aload           18
	//*  29   58:ifnull          519
			{
				if(constraintwidget != null && constraintwidget.mListDimensionBehaviors[0] == DimensionBehaviour.WRAP_CONTENT)
	//*  30   61:aload           18
	//*  31   63:ifnull          85
	//*  32   66:aload           18
	//*  33   68:getfield        #234 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//*  34   71:iconst_0        
	//*  35   72:aaload          
	//*  36   73:getstatic       #413 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
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
	//   44   89:getfield        #236 <Field ConstraintWidget mParent>
	//   45   92:astore          18
				if(constraintwidget != null && constraintwidget.mListDimensionBehaviors[1] == DimensionBehaviour.WRAP_CONTENT)
	//*  46   94:aload           18
	//*  47   96:ifnull          118
	//*  48   99:aload           18
	//*  49  101:getfield        #234 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//*  50  104:iconst_1        
	//*  51  105:aaload          
	//*  52  106:getstatic       #413 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
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
	//*  60  122:getfield        #186 <Field ConstraintAnchor mLeft>
	//*  61  125:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//*  62  128:ifnull          187
	//*  63  131:aload_0         
	//*  64  132:getfield        #186 <Field ConstraintAnchor mLeft>
	//*  65  135:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//*  66  138:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//*  67  141:aload_0         
	//*  68  142:getfield        #186 <Field ConstraintAnchor mLeft>
	//*  69  145:if_acmpeq       187
	//*  70  148:aload_0         
	//*  71  149:getfield        #196 <Field ConstraintAnchor mRight>
	//*  72  152:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//*  73  155:ifnull          187
	//*  74  158:aload_0         
	//*  75  159:getfield        #196 <Field ConstraintAnchor mRight>
	//*  76  162:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//*  77  165:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//*  78  168:aload_0         
	//*  79  169:getfield        #196 <Field ConstraintAnchor mRight>
	//*  80  172:if_acmpne       187
					((ConstraintWidgetContainer)mParent).addChain(this, 0);
	//   81  175:aload_0         
	//   82  176:getfield        #236 <Field ConstraintWidget mParent>
	//   83  179:checkcast       #418 <Class ConstraintWidgetContainer>
	//   84  182:aload_0         
	//   85  183:iconst_0        
	//   86  184:invokevirtual   #422 <Method void ConstraintWidgetContainer.addChain(ConstraintWidget, int)>
				if(mLeft.mTarget != null && mLeft.mTarget.mTarget == mLeft || mRight.mTarget != null && mRight.mTarget.mTarget == mRight)
	//*  87  187:aload_0         
	//*  88  188:getfield        #186 <Field ConstraintAnchor mLeft>
	//*  89  191:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//*  90  194:ifnull          214
	//*  91  197:aload_0         
	//*  92  198:getfield        #186 <Field ConstraintAnchor mLeft>
	//*  93  201:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//*  94  204:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//*  95  207:aload_0         
	//*  96  208:getfield        #186 <Field ConstraintAnchor mLeft>
	//*  97  211:if_acmpeq       241
	//*  98  214:aload_0         
	//*  99  215:getfield        #196 <Field ConstraintAnchor mRight>
	//* 100  218:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 101  221:ifnull          247
	//* 102  224:aload_0         
	//* 103  225:getfield        #196 <Field ConstraintAnchor mRight>
	//* 104  228:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 105  231:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 106  234:aload_0         
	//* 107  235:getfield        #196 <Field ConstraintAnchor mRight>
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
	//* 115  251:getfield        #191 <Field ConstraintAnchor mTop>
	//* 116  254:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 117  257:ifnull          316
	//* 118  260:aload_0         
	//* 119  261:getfield        #191 <Field ConstraintAnchor mTop>
	//* 120  264:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 121  267:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 122  270:aload_0         
	//* 123  271:getfield        #191 <Field ConstraintAnchor mTop>
	//* 124  274:if_acmpeq       316
	//* 125  277:aload_0         
	//* 126  278:getfield        #201 <Field ConstraintAnchor mBottom>
	//* 127  281:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 128  284:ifnull          316
	//* 129  287:aload_0         
	//* 130  288:getfield        #201 <Field ConstraintAnchor mBottom>
	//* 131  291:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 132  294:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 133  297:aload_0         
	//* 134  298:getfield        #201 <Field ConstraintAnchor mBottom>
	//* 135  301:if_acmpne       316
					((ConstraintWidgetContainer)mParent).addChain(this, 1);
	//  136  304:aload_0         
	//  137  305:getfield        #236 <Field ConstraintWidget mParent>
	//  138  308:checkcast       #418 <Class ConstraintWidgetContainer>
	//  139  311:aload_0         
	//  140  312:iconst_1        
	//  141  313:invokevirtual   #422 <Method void ConstraintWidgetContainer.addChain(ConstraintWidget, int)>
				if(mTop.mTarget != null && mTop.mTarget.mTarget == mTop || mBottom.mTarget != null && mBottom.mTarget.mTarget == mBottom)
	//* 142  316:aload_0         
	//* 143  317:getfield        #191 <Field ConstraintAnchor mTop>
	//* 144  320:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 145  323:ifnull          343
	//* 146  326:aload_0         
	//* 147  327:getfield        #191 <Field ConstraintAnchor mTop>
	//* 148  330:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 149  333:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 150  336:aload_0         
	//* 151  337:getfield        #191 <Field ConstraintAnchor mTop>
	//* 152  340:if_acmpeq       370
	//* 153  343:aload_0         
	//* 154  344:getfield        #201 <Field ConstraintAnchor mBottom>
	//* 155  347:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 156  350:ifnull          376
	//* 157  353:aload_0         
	//* 158  354:getfield        #201 <Field ConstraintAnchor mBottom>
	//* 159  357:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 160  360:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 161  363:aload_0         
	//* 162  364:getfield        #201 <Field ConstraintAnchor mBottom>
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
	//* 172  385:getfield        #272 <Field int mVisibility>
	//* 173  388:bipush          8
	//* 174  390:icmpeq          432
	//* 175  393:aload_0         
	//* 176  394:getfield        #186 <Field ConstraintAnchor mLeft>
	//* 177  397:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 178  400:ifnonnull       432
	//* 179  403:aload_0         
	//* 180  404:getfield        #196 <Field ConstraintAnchor mRight>
	//* 181  407:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 182  410:ifnonnull       432
					linearsystem.addGreaterThan(linearsystem.createObjectVariable(((Object) (mParent.mRight))), solvervariable1, 0, 1);
	//  183  413:aload_1         
	//  184  414:aload_1         
	//  185  415:aload_0         
	//  186  416:getfield        #236 <Field ConstraintWidget mParent>
	//  187  419:getfield        #196 <Field ConstraintAnchor mRight>
	//  188  422:invokevirtual   #313 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//  189  425:aload           21
	//  190  427:iconst_0        
	//  191  428:iconst_1        
	//  192  429:invokevirtual   #347 <Method void LinearSystem.addGreaterThan(SolverVariable, SolverVariable, int, int)>
				if(flag2 && mVisibility != 8 && mTop.mTarget == null && mBottom.mTarget == null && mBaseline == null)
	//* 193  432:iload           11
	//* 194  434:ifeq            492
	//* 195  437:aload_0         
	//* 196  438:getfield        #272 <Field int mVisibility>
	//* 197  441:bipush          8
	//* 198  443:icmpeq          492
	//* 199  446:aload_0         
	//* 200  447:getfield        #191 <Field ConstraintAnchor mTop>
	//* 201  450:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 202  453:ifnonnull       492
	//* 203  456:aload_0         
	//* 204  457:getfield        #201 <Field ConstraintAnchor mBottom>
	//* 205  460:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 206  463:ifnonnull       492
	//* 207  466:aload_0         
	//* 208  467:getfield        #206 <Field ConstraintAnchor mBaseline>
	//* 209  470:ifnonnull       492
					linearsystem.addGreaterThan(linearsystem.createObjectVariable(((Object) (mParent.mBottom))), solvervariable, 0, 1);
	//  210  473:aload_1         
	//  211  474:aload_1         
	//  212  475:aload_0         
	//  213  476:getfield        #236 <Field ConstraintWidget mParent>
	//  214  479:getfield        #201 <Field ConstraintAnchor mBottom>
	//  215  482:invokevirtual   #313 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//  216  485:aload           20
	//  217  487:iconst_0        
	//  218  488:iconst_1        
	//  219  489:invokevirtual   #347 <Method void LinearSystem.addGreaterThan(SolverVariable, SolverVariable, int, int)>
				boolean flag5 = flag2;
	//  220  492:iload           11
	//  221  494:istore          14
				boolean flag9 = flag4;
	//  222  496:iload           13
	//  223  498:istore          15
				flag2 = flag1;
	//  224  500:iload           10
	//  225  502:istore          11
				flag1 = flag5;
	//  226  504:iload           14
	//  227  506:istore          10
				flag4 = flag3;
	//  228  508:iload           12
	//  229  510:istore          13
				flag3 = flag9;
	//  230  512:iload           15
	//  231  514:istore          12
			} else
	//* 232  516:goto            542
			{
				boolean flag6 = false;
	//  233  519:iconst_0        
	//  234  520:istore          14
				flag1 = flag6;
	//  235  522:iload           14
	//  236  524:istore          10
				flag2 = flag1;
	//  237  526:iload           10
	//  238  528:istore          11
				flag3 = flag2;
	//  239  530:iload           11
	//  240  532:istore          12
				flag4 = flag2;
	//  241  534:iload           11
	//  242  536:istore          13
				flag2 = flag6;
	//  243  538:iload           14
	//  244  540:istore          11
			}
			k = mWidth;
	//  245  542:aload_0         
	//  246  543:getfield        #238 <Field int mWidth>
	//  247  546:istore          4
			l = mMinWidth;
	//  248  548:aload_0         
	//  249  549:getfield        #424 <Field int mMinWidth>
	//  250  552:istore          5
			i = k;
	//  251  554:iload           4
	//  252  556:istore_3        
			if(k < l)
	//* 253  557:iload           4
	//* 254  559:iload           5
	//* 255  561:icmpge          567
				i = l;
	//  256  564:iload           5
	//  257  566:istore_3        
			k = mHeight;
	//  258  567:aload_0         
	//  259  568:getfield        #240 <Field int mHeight>
	//  260  571:istore          4
			i1 = mMinHeight;
	//  261  573:aload_0         
	//  262  574:getfield        #426 <Field int mMinHeight>
	//  263  577:istore          6
			l = k;
	//  264  579:iload           4
	//  265  581:istore          5
			if(k < i1)
	//* 266  583:iload           4
	//* 267  585:iload           6
	//* 268  587:icmpge          594
				l = i1;
	//  269  590:iload           6
	//  270  592:istore          5
			boolean flag7;
			if(mListDimensionBehaviors[0] != DimensionBehaviour.MATCH_CONSTRAINT)
	//* 271  594:aload_0         
	//* 272  595:getfield        #234 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//* 273  598:iconst_0        
	//* 274  599:aaload          
	//* 275  600:getstatic       #429 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//* 276  603:if_acmpeq       612
				flag7 = true;
	//  277  606:iconst_1        
	//  278  607:istore          14
			else
	//* 279  609:goto            615
				flag7 = false;
	//  280  612:iconst_0        
	//  281  613:istore          14
			boolean flag10;
			if(mListDimensionBehaviors[1] != DimensionBehaviour.MATCH_CONSTRAINT)
	//* 282  615:aload_0         
	//* 283  616:getfield        #234 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//* 284  619:iconst_1        
	//* 285  620:aaload          
	//* 286  621:getstatic       #429 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//* 287  624:if_acmpeq       633
				flag10 = true;
	//  288  627:iconst_1        
	//  289  628:istore          15
			else
	//* 290  630:goto            636
				flag10 = false;
	//  291  633:iconst_0        
	//  292  634:istore          15
			mResolvedDimensionRatioSide = mDimensionRatioSide;
	//  293  636:aload_0         
	//  294  637:aload_0         
	//  295  638:getfield        #244 <Field int mDimensionRatioSide>
	//  296  641:putfield        #166 <Field int mResolvedDimensionRatioSide>
			float f = mDimensionRatio;
	//  297  644:aload_0         
	//  298  645:getfield        #242 <Field float mDimensionRatio>
	//  299  648:fstore_2        
			mResolvedDimensionRatio = f;
	//  300  649:aload_0         
	//  301  650:fload_2         
	//  302  651:putfield        #168 <Field float mResolvedDimensionRatio>
			int k1 = mMatchConstraintDefaultWidth;
	//  303  654:aload_0         
	//  304  655:getfield        #148 <Field int mMatchConstraintDefaultWidth>
	//  305  658:istore          8
			j1 = mMatchConstraintDefaultHeight;
	//  306  660:aload_0         
	//  307  661:getfield        #150 <Field int mMatchConstraintDefaultHeight>
	//  308  664:istore          7
			if(f > 0.0F && mVisibility != 8)
	//* 309  666:fload_2         
	//* 310  667:fconst_0        
	//* 311  668:fcmpl           
	//* 312  669:ifle            1002
	//* 313  672:aload_0         
	//* 314  673:getfield        #272 <Field int mVisibility>
	//* 315  676:bipush          8
	//* 316  678:icmpeq          1002
			{
				i1 = k1;
	//  317  681:iload           8
	//  318  683:istore          6
				if(mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT)
	//* 319  685:aload_0         
	//* 320  686:getfield        #234 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//* 321  689:iconst_0        
	//* 322  690:aaload          
	//* 323  691:getstatic       #429 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//* 324  694:if_acmpne       709
				{
					i1 = k1;
	//  325  697:iload           8
	//  326  699:istore          6
					if(k1 == 0)
	//* 327  701:iload           8
	//* 328  703:ifne            709
						i1 = 3;
	//  329  706:iconst_3        
	//  330  707:istore          6
				}
				k = j1;
	//  331  709:iload           7
	//  332  711:istore          4
				if(mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT)
	//* 333  713:aload_0         
	//* 334  714:getfield        #234 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//* 335  717:iconst_1        
	//* 336  718:aaload          
	//* 337  719:getstatic       #429 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//* 338  722:if_acmpne       737
				{
					k = j1;
	//  339  725:iload           7
	//  340  727:istore          4
					if(j1 == 0)
	//* 341  729:iload           7
	//* 342  731:ifne            737
						k = 3;
	//  343  734:iconst_3        
	//  344  735:istore          4
				}
				if(mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT && mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT && i1 == 3 && k == 3)
	//* 345  737:aload_0         
	//* 346  738:getfield        #234 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//* 347  741:iconst_0        
	//* 348  742:aaload          
	//* 349  743:getstatic       #429 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//* 350  746:if_acmpne       788
	//* 351  749:aload_0         
	//* 352  750:getfield        #234 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//* 353  753:iconst_1        
	//* 354  754:aaload          
	//* 355  755:getstatic       #429 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//* 356  758:if_acmpne       788
	//* 357  761:iload           6
	//* 358  763:iconst_3        
	//* 359  764:icmpne          788
	//* 360  767:iload           4
	//* 361  769:iconst_3        
	//* 362  770:icmpne          788
				{
					setupDimensionRatio(flag2, flag1, flag7, flag10);
	//  363  773:aload_0         
	//  364  774:iload           11
	//  365  776:iload           10
	//  366  778:iload           14
	//  367  780:iload           15
	//  368  782:invokevirtual   #433 <Method void setupDimensionRatio(boolean, boolean, boolean, boolean)>
				} else
	//* 369  785:goto            982
				{
					if(mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT && i1 == 3)
	//* 370  788:aload_0         
	//* 371  789:getfield        #234 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//* 372  792:iconst_0        
	//* 373  793:aaload          
	//* 374  794:getstatic       #429 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//* 375  797:if_acmpne       873
	//* 376  800:iload           6
	//* 377  802:iconst_3        
	//* 378  803:icmpne          873
					{
						mResolvedDimensionRatioSide = 0;
	//  379  806:aload_0         
	//  380  807:iconst_0        
	//  381  808:putfield        #166 <Field int mResolvedDimensionRatioSide>
						j1 = (int)(mResolvedDimensionRatio * (float)mHeight);
	//  382  811:aload_0         
	//  383  812:getfield        #168 <Field float mResolvedDimensionRatio>
	//  384  815:aload_0         
	//  385  816:getfield        #240 <Field int mHeight>
	//  386  819:i2f             
	//  387  820:fmul            
	//  388  821:f2i             
	//  389  822:istore          7
						if(mListDimensionBehaviors[1] != DimensionBehaviour.MATCH_CONSTRAINT)
	//* 390  824:aload_0         
	//* 391  825:getfield        #234 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//* 392  828:iconst_1        
	//* 393  829:aaload          
	//* 394  830:getstatic       #429 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//* 395  833:if_acmpeq       852
						{
							i1 = j1;
	//  396  836:iload           7
	//  397  838:istore          6
							j1 = l;
	//  398  840:iload           5
	//  399  842:istore          7
							i = 4;
	//  400  844:iconst_4        
	//  401  845:istore_3        
							l = 0;
	//  402  846:iconst_0        
	//  403  847:istore          5
						} else
	//* 404  849:goto            1023
						{
							i = i1;
	//  405  852:iload           6
	//  406  854:istore_3        
							k1 = l;
	//  407  855:iload           5
	//  408  857:istore          8
							l = 1;
	//  409  859:iconst_1        
	//  410  860:istore          5
							i1 = j1;
	//  411  862:iload           7
	//  412  864:istore          6
							j1 = k1;
	//  413  866:iload           8
	//  414  868:istore          7
						}
						break label0;
	//  415  870:goto            1023
					}
					if(mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT && k == 3)
	//* 416  873:aload_0         
	//* 417  874:getfield        #234 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//* 418  877:iconst_1        
	//* 419  878:aaload          
	//* 420  879:getstatic       #429 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//* 421  882:if_acmpne       982
	//* 422  885:iload           4
	//* 423  887:iconst_3        
	//* 424  888:icmpne          982
					{
						mResolvedDimensionRatioSide = 1;
	//  425  891:aload_0         
	//  426  892:iconst_1        
	//  427  893:putfield        #166 <Field int mResolvedDimensionRatioSide>
						if(mDimensionRatioSide == -1)
	//* 428  896:aload_0         
	//* 429  897:getfield        #244 <Field int mDimensionRatioSide>
	//* 430  900:iconst_m1       
	//* 431  901:icmpne          914
							mResolvedDimensionRatio = 1.0F / mResolvedDimensionRatio;
	//  432  904:aload_0         
	//  433  905:fconst_1        
	//  434  906:aload_0         
	//  435  907:getfield        #168 <Field float mResolvedDimensionRatio>
	//  436  910:fdiv            
	//  437  911:putfield        #168 <Field float mResolvedDimensionRatio>
						j1 = (int)(mResolvedDimensionRatio * (float)mWidth);
	//  438  914:aload_0         
	//  439  915:getfield        #168 <Field float mResolvedDimensionRatio>
	//  440  918:aload_0         
	//  441  919:getfield        #238 <Field int mWidth>
	//  442  922:i2f             
	//  443  923:fmul            
	//  444  924:f2i             
	//  445  925:istore          7
						if(mListDimensionBehaviors[0] != DimensionBehaviour.MATCH_CONSTRAINT)
	//* 446  927:aload_0         
	//* 447  928:getfield        #234 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//* 448  931:iconst_0        
	//* 449  932:aaload          
	//* 450  933:getstatic       #429 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//* 451  936:if_acmpeq       962
						{
							k = i1;
	//  452  939:iload           6
	//  453  941:istore          4
							i1 = i;
	//  454  943:iload_3         
	//  455  944:istore          6
							k1 = 4;
	//  456  946:iconst_4        
	//  457  947:istore          8
							l = 0;
	//  458  949:iconst_0        
	//  459  950:istore          5
							i = k;
	//  460  952:iload           4
	//  461  954:istore_3        
							k = k1;
	//  462  955:iload           8
	//  463  957:istore          4
						} else
	//* 464  959:goto            1023
						{
							l = i1;
	//  465  962:iload           6
	//  466  964:istore          5
							i1 = i;
	//  467  966:iload_3         
	//  468  967:istore          6
							k1 = 1;
	//  469  969:iconst_1        
	//  470  970:istore          8
							i = l;
	//  471  972:iload           5
	//  472  974:istore_3        
							l = k1;
	//  473  975:iload           8
	//  474  977:istore          5
						}
						break label0;
	//  475  979:goto            1023
					}
				}
				k1 = i1;
	//  476  982:iload           6
	//  477  984:istore          8
				i1 = i;
	//  478  986:iload_3         
	//  479  987:istore          6
				j1 = l;
	//  480  989:iload           5
	//  481  991:istore          7
				l = 1;
	//  482  993:iconst_1        
	//  483  994:istore          5
				i = k1;
	//  484  996:iload           8
	//  485  998:istore_3        
			} else
	//* 486  999:goto            1023
			{
				k = j1;
	//  487 1002:iload           7
	//  488 1004:istore          4
				boolean flag = false;
	//  489 1006:iconst_0        
	//  490 1007:istore          9
				j1 = l;
	//  491 1009:iload           5
	//  492 1011:istore          7
				i1 = i;
	//  493 1013:iload_3         
	//  494 1014:istore          6
				l = ((int) (flag));
	//  495 1016:iload           9
	//  496 1018:istore          5
				i = k1;
	//  497 1020:iload           8
	//  498 1022:istore_3        
			}
		}
		boolean flag8;
label1:
		{
			int ai[] = mResolvedMatchConstraintDefault;
	//  499 1023:aload_0         
	//  500 1024:getfield        #152 <Field int[] mResolvedMatchConstraintDefault>
	//  501 1027:astore          18
			ai[0] = i;
	//  502 1029:aload           18
	//  503 1031:iconst_0        
	//  504 1032:iload_3         
	//  505 1033:iastore         
			ai[1] = k;
	//  506 1034:aload           18
	//  507 1036:iconst_1        
	//  508 1037:iload           4
	//  509 1039:iastore         
			if(l != 0)
	//* 510 1040:iload           5
	//* 511 1042:ifeq            1071
			{
				int l1 = mResolvedDimensionRatioSide;
	//  512 1045:aload_0         
	//  513 1046:getfield        #166 <Field int mResolvedDimensionRatioSide>
	//  514 1049:istore          8
				if(l1 == 0 || l1 == -1)
	//* 515 1051:iload           8
	//* 516 1053:ifeq            1065
	//* 517 1056:iload           8
	//* 518 1058:iconst_m1       
	//* 519 1059:icmpne          1071
	//* 520 1062:goto            1065
				{
					flag8 = true;
	//  521 1065:iconst_1        
	//  522 1066:istore          14
					break label1;
	//  523 1068:goto            1074
				}
			}
			flag8 = false;
	//  524 1071:iconst_0        
	//  525 1072:istore          14
		}
		boolean flag12;
		Object obj2;
		ConstraintWidget constraintwidget1;
label2:
		{
			boolean flag11;
			if(mListDimensionBehaviors[0] == DimensionBehaviour.WRAP_CONTENT && (this instanceof ConstraintWidgetContainer))
	//* 526 1074:aload_0         
	//* 527 1075:getfield        #234 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//* 528 1078:iconst_0        
	//* 529 1079:aaload          
	//* 530 1080:getstatic       #413 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//* 531 1083:if_acmpne       1099
	//* 532 1086:aload_0         
	//* 533 1087:instanceof      #418 <Class ConstraintWidgetContainer>
	//* 534 1090:ifeq            1099
				flag11 = true;
	//  535 1093:iconst_1        
	//  536 1094:istore          15
			else
	//* 537 1096:goto            1102
				flag11 = false;
	//  538 1099:iconst_0        
	//  539 1100:istore          15
			flag12 = mCenter.isConnected() ^ true;
	//  540 1102:aload_0         
	//  541 1103:getfield        #221 <Field ConstraintAnchor mCenter>
	//  542 1106:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//  543 1109:iconst_1        
	//  544 1110:ixor            
	//  545 1111:istore          16
			if(mHorizontalResolution != 2)
	//* 546 1113:aload_0         
	//* 547 1114:getfield        #144 <Field int mHorizontalResolution>
	//* 548 1117:iconst_2        
	//* 549 1118:icmpeq          1246
			{
				Object obj1 = ((Object) (mParent));
	//  550 1121:aload_0         
	//  551 1122:getfield        #236 <Field ConstraintWidget mParent>
	//  552 1125:astore          18
				if(obj1 != null)
	//* 553 1127:aload           18
	//* 554 1129:ifnull          1146
					obj1 = ((Object) (linearsystem.createObjectVariable(((Object) (((ConstraintWidget) (obj1)).mRight)))));
	//  555 1132:aload_1         
	//  556 1133:aload           18
	//  557 1135:getfield        #196 <Field ConstraintAnchor mRight>
	//  558 1138:invokevirtual   #313 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//  559 1141:astore          18
				else
	//* 560 1143:goto            1149
					obj1 = null;
	//  561 1146:aconst_null     
	//  562 1147:astore          18
				Object obj3 = ((Object) (mParent));
	//  563 1149:aload_0         
	//  564 1150:getfield        #236 <Field ConstraintWidget mParent>
	//  565 1153:astore          19
				if(obj3 != null)
	//* 566 1155:aload           19
	//* 567 1157:ifnull          1174
					obj3 = ((Object) (linearsystem.createObjectVariable(((Object) (((ConstraintWidget) (obj3)).mLeft)))));
	//  568 1160:aload_1         
	//  569 1161:aload           19
	//  570 1163:getfield        #186 <Field ConstraintAnchor mLeft>
	//  571 1166:invokevirtual   #313 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//  572 1169:astore          19
				else
	//* 573 1171:goto            1177
					obj3 = null;
	//  574 1174:aconst_null     
	//  575 1175:astore          19
				applyConstraints(linearsystem, flag2, ((SolverVariable) (obj3)), ((SolverVariable) (obj1)), mListDimensionBehaviors[0], flag11, mLeft, mRight, mX, i1, mMinWidth, mMaxDimension[0], mHorizontalBiasPercent, flag8, flag4, i, mMatchConstraintMinWidth, mMatchConstraintMaxWidth, mMatchConstraintPercentWidth, flag12);
	//  576 1177:aload_0         
	//  577 1178:aload_1         
	//  578 1179:iload           11
	//  579 1181:aload           19
	//  580 1183:aload           18
	//  581 1185:aload_0         
	//  582 1186:getfield        #234 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//  583 1189:iconst_0        
	//  584 1190:aaload          
	//  585 1191:iload           15
	//  586 1193:aload_0         
	//  587 1194:getfield        #186 <Field ConstraintAnchor mLeft>
	//  588 1197:aload_0         
	//  589 1198:getfield        #196 <Field ConstraintAnchor mRight>
	//  590 1201:aload_0         
	//  591 1202:getfield        #246 <Field int mX>
	//  592 1205:iload           6
	//  593 1207:aload_0         
	//  594 1208:getfield        #424 <Field int mMinWidth>
	//  595 1211:aload_0         
	//  596 1212:getfield        #171 <Field int[] mMaxDimension>
	//  597 1215:iconst_0        
	//  598 1216:iaload          
	//  599 1217:aload_0         
	//  600 1218:getfield        #266 <Field float mHorizontalBiasPercent>
	//  601 1221:iload           14
	//  602 1223:iload           13
	//  603 1225:iload_3         
	//  604 1226:aload_0         
	//  605 1227:getfield        #154 <Field int mMatchConstraintMinWidth>
	//  606 1230:aload_0         
	//  607 1231:getfield        #156 <Field int mMatchConstraintMaxWidth>
	//  608 1234:aload_0         
	//  609 1235:getfield        #158 <Field float mMatchConstraintPercentWidth>
	//  610 1238:iload           16
	//  611 1240:invokespecial   #435 <Method void applyConstraints(LinearSystem, boolean, SolverVariable, SolverVariable, ConstraintWidget$DimensionBehaviour, boolean, ConstraintAnchor, ConstraintAnchor, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean)>
			}
	//* 612 1243:goto            1246
			obj2 = obj4;
	//  613 1246:aload           22
	//  614 1248:astore          18
			constraintwidget1 = this;
	//  615 1250:aload_0         
	//  616 1251:astore          19
			if(constraintwidget1.mVerticalResolution == 2)
	//* 617 1253:aload           19
	//* 618 1255:getfield        #146 <Field int mVerticalResolution>
	//* 619 1258:iconst_2        
	//* 620 1259:icmpne          1263
				return;
	//  621 1262:return          
			if(constraintwidget1.mListDimensionBehaviors[1] == DimensionBehaviour.WRAP_CONTENT && (constraintwidget1 instanceof ConstraintWidgetContainer))
	//* 622 1263:aload           19
	//* 623 1265:getfield        #234 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//* 624 1268:iconst_1        
	//* 625 1269:aaload          
	//* 626 1270:getstatic       #413 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//* 627 1273:if_acmpne       1290
	//* 628 1276:aload           19
	//* 629 1278:instanceof      #418 <Class ConstraintWidgetContainer>
	//* 630 1281:ifeq            1290
				flag2 = true;
	//  631 1284:iconst_1        
	//  632 1285:istore          11
			else
	//* 633 1287:goto            1293
				flag2 = false;
	//  634 1290:iconst_0        
	//  635 1291:istore          11
			if(l != 0)
	//* 636 1293:iload           5
	//* 637 1295:ifeq            1320
			{
				int j = constraintwidget1.mResolvedDimensionRatioSide;
	//  638 1298:aload           19
	//  639 1300:getfield        #166 <Field int mResolvedDimensionRatioSide>
	//  640 1303:istore_3        
				if(j == 1 || j == -1)
	//* 641 1304:iload_3         
	//* 642 1305:iconst_1        
	//* 643 1306:icmpeq          1314
	//* 644 1309:iload_3         
	//* 645 1310:iconst_m1       
	//* 646 1311:icmpne          1320
				{
					flag4 = true;
	//  647 1314:iconst_1        
	//  648 1315:istore          13
					break label2;
	//  649 1317:goto            1323
				}
			}
			flag4 = false;
	//  650 1320:iconst_0        
	//  651 1321:istore          13
		}
label3:
		{
			if(constraintwidget1.mBaselineDistance > 0)
	//* 652 1323:aload           19
	//* 653 1325:getfield        #262 <Field int mBaselineDistance>
	//* 654 1328:ifle            1421
				if(constraintwidget1.mBaseline.getResolutionNode().state == 1)
	//* 655 1331:aload           19
	//* 656 1333:getfield        #206 <Field ConstraintAnchor mBaseline>
	//* 657 1336:invokevirtual   #324 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//* 658 1339:getfield        #329 <Field int ResolutionAnchor.state>
	//* 659 1342:iconst_1        
	//* 660 1343:icmpne          1361
				{
					constraintwidget1.mBaseline.getResolutionNode().addResolvedValue(linearsystem);
	//  661 1346:aload           19
	//  662 1348:getfield        #206 <Field ConstraintAnchor mBaseline>
	//  663 1351:invokevirtual   #324 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  664 1354:aload_1         
	//  665 1355:invokevirtual   #343 <Method void ResolutionAnchor.addResolvedValue(LinearSystem)>
				} else
	//* 666 1358:goto            1421
				{
					obj4 = ((Object) (linearsystem));
	//  667 1361:aload_1         
	//  668 1362:astore          22
					((LinearSystem) (obj4)).addEquality(((SolverVariable) (obj)), ((SolverVariable) (obj2)), getBaselineDistance(), 6);
	//  669 1364:aload           22
	//  670 1366:aload           17
	//  671 1368:aload           18
	//  672 1370:aload_0         
	//  673 1371:invokevirtual   #438 <Method int getBaselineDistance()>
	//  674 1374:bipush          6
	//  675 1376:invokevirtual   #371 <Method ArrayRow LinearSystem.addEquality(SolverVariable, SolverVariable, int, int)>
	//  676 1379:pop             
					if(constraintwidget1.mBaseline.mTarget != null)
	//* 677 1380:aload           19
	//* 678 1382:getfield        #206 <Field ConstraintAnchor mBaseline>
	//* 679 1385:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 680 1388:ifnull          1421
					{
						((LinearSystem) (obj4)).addEquality(((SolverVariable) (obj)), ((LinearSystem) (obj4)).createObjectVariable(((Object) (constraintwidget1.mBaseline.mTarget))), 0, 6);
	//  681 1391:aload           22
	//  682 1393:aload           17
	//  683 1395:aload           22
	//  684 1397:aload           19
	//  685 1399:getfield        #206 <Field ConstraintAnchor mBaseline>
	//  686 1402:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//  687 1405:invokevirtual   #313 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//  688 1408:iconst_0        
	//  689 1409:bipush          6
	//  690 1411:invokevirtual   #371 <Method ArrayRow LinearSystem.addEquality(SolverVariable, SolverVariable, int, int)>
	//  691 1414:pop             
						flag8 = false;
	//  692 1415:iconst_0        
	//  693 1416:istore          14
						break label3;
	//  694 1418:goto            1425
					}
				}
			flag8 = flag12;
	//  695 1421:iload           16
	//  696 1423:istore          14
		}
		LinearSystem linearsystem1 = linearsystem;
	//  697 1425:aload_1         
	//  698 1426:astore          23
		obj4 = obj2;
	//  699 1428:aload           18
	//  700 1430:astore          22
		obj = ((Object) (constraintwidget1.mParent));
	//  701 1432:aload           19
	//  702 1434:getfield        #236 <Field ConstraintWidget mParent>
	//  703 1437:astore          17
		if(obj != null)
	//* 704 1439:aload           17
	//* 705 1441:ifnull          1459
			obj = ((Object) (linearsystem1.createObjectVariable(((Object) (((ConstraintWidget) (obj)).mBottom)))));
	//  706 1444:aload           23
	//  707 1446:aload           17
	//  708 1448:getfield        #201 <Field ConstraintAnchor mBottom>
	//  709 1451:invokevirtual   #313 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//  710 1454:astore          17
		else
	//* 711 1456:goto            1462
			obj = null;
	//  712 1459:aconst_null     
	//  713 1460:astore          17
		obj2 = ((Object) (constraintwidget1.mParent));
	//  714 1462:aload           19
	//  715 1464:getfield        #236 <Field ConstraintWidget mParent>
	//  716 1467:astore          18
		if(obj2 != null)
	//* 717 1469:aload           18
	//* 718 1471:ifnull          1489
			obj2 = ((Object) (linearsystem1.createObjectVariable(((Object) (((ConstraintWidget) (obj2)).mTop)))));
	//  719 1474:aload           23
	//  720 1476:aload           18
	//  721 1478:getfield        #191 <Field ConstraintAnchor mTop>
	//  722 1481:invokevirtual   #313 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//  723 1484:astore          18
		else
	//* 724 1486:goto            1492
			obj2 = null;
	//  725 1489:aconst_null     
	//  726 1490:astore          18
		applyConstraints(linearsystem, flag1, ((SolverVariable) (obj2)), ((SolverVariable) (obj)), constraintwidget1.mListDimensionBehaviors[1], flag2, constraintwidget1.mTop, constraintwidget1.mBottom, constraintwidget1.mY, j1, constraintwidget1.mMinHeight, constraintwidget1.mMaxDimension[1], constraintwidget1.mVerticalBiasPercent, flag4, flag3, k, constraintwidget1.mMatchConstraintMinHeight, constraintwidget1.mMatchConstraintMaxHeight, constraintwidget1.mMatchConstraintPercentHeight, flag8);
	//  727 1492:aload_0         
	//  728 1493:aload_1         
	//  729 1494:iload           10
	//  730 1496:aload           18
	//  731 1498:aload           17
	//  732 1500:aload           19
	//  733 1502:getfield        #234 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//  734 1505:iconst_1        
	//  735 1506:aaload          
	//  736 1507:iload           11
	//  737 1509:aload           19
	//  738 1511:getfield        #191 <Field ConstraintAnchor mTop>
	//  739 1514:aload           19
	//  740 1516:getfield        #201 <Field ConstraintAnchor mBottom>
	//  741 1519:aload           19
	//  742 1521:getfield        #248 <Field int mY>
	//  743 1524:iload           7
	//  744 1526:aload           19
	//  745 1528:getfield        #426 <Field int mMinHeight>
	//  746 1531:aload           19
	//  747 1533:getfield        #171 <Field int[] mMaxDimension>
	//  748 1536:iconst_1        
	//  749 1537:iaload          
	//  750 1538:aload           19
	//  751 1540:getfield        #268 <Field float mVerticalBiasPercent>
	//  752 1543:iload           13
	//  753 1545:iload           12
	//  754 1547:iload           4
	//  755 1549:aload           19
	//  756 1551:getfield        #160 <Field int mMatchConstraintMinHeight>
	//  757 1554:aload           19
	//  758 1556:getfield        #162 <Field int mMatchConstraintMaxHeight>
	//  759 1559:aload           19
	//  760 1561:getfield        #164 <Field float mMatchConstraintPercentHeight>
	//  761 1564:iload           14
	//  762 1566:invokespecial   #435 <Method void applyConstraints(LinearSystem, boolean, SolverVariable, SolverVariable, ConstraintWidget$DimensionBehaviour, boolean, ConstraintAnchor, ConstraintAnchor, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean)>
		if(l != 0)
	//* 763 1569:iload           5
	//* 764 1571:ifeq            1630
		{
			obj = ((Object) (this));
	//  765 1574:aload_0         
	//  766 1575:astore          17
			if(((ConstraintWidget) (obj)).mResolvedDimensionRatioSide == 1)
	//* 767 1577:aload           17
	//* 768 1579:getfield        #166 <Field int mResolvedDimensionRatioSide>
	//* 769 1582:iconst_1        
	//* 770 1583:icmpne          1608
				linearsystem.addRatio(solvervariable, ((SolverVariable) (obj4)), solvervariable1, solvervariable2, ((ConstraintWidget) (obj)).mResolvedDimensionRatio, 6);
	//  771 1586:aload_1         
	//  772 1587:aload           20
	//  773 1589:aload           22
	//  774 1591:aload           21
	//  775 1593:aload           24
	//  776 1595:aload           17
	//  777 1597:getfield        #168 <Field float mResolvedDimensionRatio>
	//  778 1600:bipush          6
	//  779 1602:invokevirtual   #442 <Method void LinearSystem.addRatio(SolverVariable, SolverVariable, SolverVariable, SolverVariable, float, int)>
			else
	//* 780 1605:goto            1630
				linearsystem.addRatio(solvervariable1, solvervariable2, solvervariable, ((SolverVariable) (obj4)), ((ConstraintWidget) (obj)).mResolvedDimensionRatio, 6);
	//  781 1608:aload_1         
	//  782 1609:aload           21
	//  783 1611:aload           24
	//  784 1613:aload           20
	//  785 1615:aload           22
	//  786 1617:aload           17
	//  787 1619:getfield        #168 <Field float mResolvedDimensionRatio>
	//  788 1622:bipush          6
	//  789 1624:invokevirtual   #442 <Method void LinearSystem.addRatio(SolverVariable, SolverVariable, SolverVariable, SolverVariable, float, int)>
		}
	//* 790 1627:goto            1630
		obj = ((Object) (this));
	//  791 1630:aload_0         
	//  792 1631:astore          17
		if(((ConstraintWidget) (obj)).mCenter.isConnected())
	//* 793 1633:aload           17
	//* 794 1635:getfield        #221 <Field ConstraintAnchor mCenter>
	//* 795 1638:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//* 796 1641:ifeq            1683
			linearsystem.addCenterPoint(((ConstraintWidget) (obj)), ((ConstraintWidget) (obj)).mCenter.getTarget().getOwner(), (float)Math.toRadians(((ConstraintWidget) (obj)).mCircleConstraintAngle + 90F), ((ConstraintWidget) (obj)).mCenter.getMargin());
	//  797 1644:aload_1         
	//  798 1645:aload           17
	//  799 1647:aload           17
	//  800 1649:getfield        #221 <Field ConstraintAnchor mCenter>
	//  801 1652:invokevirtual   #317 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//  802 1655:invokevirtual   #446 <Method ConstraintWidget ConstraintAnchor.getOwner()>
	//  803 1658:aload           17
	//  804 1660:getfield        #173 <Field float mCircleConstraintAngle>
	//  805 1663:ldc2            #447 <Float 90F>
	//  806 1666:fadd            
	//  807 1667:f2d             
	//  808 1668:invokestatic    #451 <Method double Math.toRadians(double)>
	//  809 1671:d2f             
	//  810 1672:aload           17
	//  811 1674:getfield        #221 <Field ConstraintAnchor mCenter>
	//  812 1677:invokevirtual   #368 <Method int ConstraintAnchor.getMargin()>
	//  813 1680:invokevirtual   #455 <Method void LinearSystem.addCenterPoint(ConstraintWidget, ConstraintWidget, float, int)>
	//  814 1683:return          
	}

	public boolean allowedInBarrier()
	{
		return mVisibility != 8;
	//    0    0:aload_0         
	//    1    1:getfield        #272 <Field int mVisibility>
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
	//    2    2:invokestatic    #463 <Method void Optimizer.analyze(int, ConstraintWidget)>
	//    3    5:return          
	}

	public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintwidget, ConstraintAnchor.Type type1)
	{
		connect(type, constraintwidget, type1, 0, ConstraintAnchor.Strength.STRONG);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_0        
	//    5    5:getstatic       #471 <Field ConstraintAnchor$Strength ConstraintAnchor$Strength.STRONG>
	//    6    8:invokevirtual   #474 <Method void connect(ConstraintAnchor$Type, ConstraintWidget, ConstraintAnchor$Type, int, ConstraintAnchor$Strength)>
	//    7   11:return          
	}

	public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintwidget, ConstraintAnchor.Type type1, int i)
	{
		connect(type, constraintwidget, type1, i, ConstraintAnchor.Strength.STRONG);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:getstatic       #471 <Field ConstraintAnchor$Strength ConstraintAnchor$Strength.STRONG>
	//    6    9:invokevirtual   #474 <Method void connect(ConstraintAnchor$Type, ConstraintWidget, ConstraintAnchor$Type, int, ConstraintAnchor$Strength)>
	//    7   12:return          
	}

	public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintwidget, ConstraintAnchor.Type type1, int i, ConstraintAnchor.Strength strength)
	{
		connect(type, constraintwidget, type1, i, strength, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:iconst_0        
	//    7    9:invokevirtual   #478 <Method void connect(ConstraintAnchor$Type, ConstraintWidget, ConstraintAnchor$Type, int, ConstraintAnchor$Strength, int)>
	//    8   12:return          
	}

	public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintwidget, ConstraintAnchor.Type type1, int i, ConstraintAnchor.Strength strength, int j)
	{
		ConstraintAnchor.Type type2 = ConstraintAnchor.Type.CENTER;
	//    0    0:getstatic       #219 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER>
	//    1    3:astore          8
		boolean flag = false;
	//    2    5:iconst_0        
	//    3    6:istore          7
		if(type == type2)
	//*   4    8:aload_1         
	//*   5    9:aload           8
	//*   6   11:if_acmpne       400
		{
			if(type1 == ConstraintAnchor.Type.CENTER)
	//*   7   14:aload_3         
	//*   8   15:getstatic       #219 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER>
	//*   9   18:if_acmpne       271
			{
				type = ((ConstraintAnchor.Type) (getAnchor(ConstraintAnchor.Type.LEFT)));
	//   10   21:aload_0         
	//   11   22:getstatic       #181 <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//   12   25:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//   13   28:astore_1        
				type1 = ((ConstraintAnchor.Type) (getAnchor(ConstraintAnchor.Type.RIGHT)));
	//   14   29:aload_0         
	//   15   30:getstatic       #194 <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//   16   33:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//   17   36:astore_3        
				ConstraintAnchor constraintanchor = getAnchor(ConstraintAnchor.Type.TOP);
	//   18   37:aload_0         
	//   19   38:getstatic       #189 <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//   20   41:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//   21   44:astore          8
				ConstraintAnchor constraintanchor2 = getAnchor(ConstraintAnchor.Type.BOTTOM);
	//   22   46:aload_0         
	//   23   47:getstatic       #199 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
	//   24   50:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//   25   53:astore          9
				flag = true;
	//   26   55:iconst_1        
	//   27   56:istore          7
				if(type != null && ((ConstraintAnchor) (type)).isConnected() || type1 != null && ((ConstraintAnchor) (type1)).isConnected())
	//*  28   58:aload_1         
	//*  29   59:ifnull          69
	//*  30   62:aload_1         
	//*  31   63:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//*  32   66:ifne            80
	//*  33   69:aload_3         
	//*  34   70:ifnull          86
	//*  35   73:aload_3         
	//*  36   74:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//*  37   77:ifeq            86
				{
					i = 0;
	//   38   80:iconst_0        
	//   39   81:istore          4
				} else
	//*  40   83:goto            121
				{
					connect(ConstraintAnchor.Type.LEFT, constraintwidget, ConstraintAnchor.Type.LEFT, 0, strength, j);
	//   41   86:aload_0         
	//   42   87:getstatic       #181 <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//   43   90:aload_2         
	//   44   91:getstatic       #181 <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//   45   94:iconst_0        
	//   46   95:aload           5
	//   47   97:iload           6
	//   48   99:invokevirtual   #478 <Method void connect(ConstraintAnchor$Type, ConstraintWidget, ConstraintAnchor$Type, int, ConstraintAnchor$Strength, int)>
					connect(ConstraintAnchor.Type.RIGHT, constraintwidget, ConstraintAnchor.Type.RIGHT, 0, strength, j);
	//   49  102:aload_0         
	//   50  103:getstatic       #194 <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//   51  106:aload_2         
	//   52  107:getstatic       #194 <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//   53  110:iconst_0        
	//   54  111:aload           5
	//   55  113:iload           6
	//   56  115:invokevirtual   #478 <Method void connect(ConstraintAnchor$Type, ConstraintWidget, ConstraintAnchor$Type, int, ConstraintAnchor$Strength, int)>
					i = 1;
	//   57  118:iconst_1        
	//   58  119:istore          4
				}
				if(constraintanchor != null && constraintanchor.isConnected() || constraintanchor2 != null && constraintanchor2.isConnected())
	//*  59  121:aload           8
	//*  60  123:ifnull          134
	//*  61  126:aload           8
	//*  62  128:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//*  63  131:ifne            147
	//*  64  134:aload           9
	//*  65  136:ifnull          153
	//*  66  139:aload           9
	//*  67  141:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//*  68  144:ifeq            153
				{
					flag = false;
	//   69  147:iconst_0        
	//   70  148:istore          7
				} else
	//*  71  150:goto            185
				{
					connect(ConstraintAnchor.Type.TOP, constraintwidget, ConstraintAnchor.Type.TOP, 0, strength, j);
	//   72  153:aload_0         
	//   73  154:getstatic       #189 <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//   74  157:aload_2         
	//   75  158:getstatic       #189 <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//   76  161:iconst_0        
	//   77  162:aload           5
	//   78  164:iload           6
	//   79  166:invokevirtual   #478 <Method void connect(ConstraintAnchor$Type, ConstraintWidget, ConstraintAnchor$Type, int, ConstraintAnchor$Strength, int)>
					connect(ConstraintAnchor.Type.BOTTOM, constraintwidget, ConstraintAnchor.Type.BOTTOM, 0, strength, j);
	//   80  169:aload_0         
	//   81  170:getstatic       #199 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
	//   82  173:aload_2         
	//   83  174:getstatic       #199 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
	//   84  177:iconst_0        
	//   85  178:aload           5
	//   86  180:iload           6
	//   87  182:invokevirtual   #478 <Method void connect(ConstraintAnchor$Type, ConstraintWidget, ConstraintAnchor$Type, int, ConstraintAnchor$Strength, int)>
				}
				if(i != 0 && flag)
	//*  88  185:iload           4
	//*  89  187:ifeq            217
	//*  90  190:iload           7
	//*  91  192:ifeq            217
				{
					getAnchor(ConstraintAnchor.Type.CENTER).connect(constraintwidget.getAnchor(ConstraintAnchor.Type.CENTER), 0, j);
	//   92  195:aload_0         
	//   93  196:getstatic       #219 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER>
	//   94  199:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//   95  202:aload_2         
	//   96  203:getstatic       #219 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER>
	//   97  206:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//   98  209:iconst_0        
	//   99  210:iload           6
	//  100  212:invokevirtual   #483 <Method boolean ConstraintAnchor.connect(ConstraintAnchor, int, int)>
	//  101  215:pop             
					return;
	//  102  216:return          
				}
				if(i != 0)
	//* 103  217:iload           4
	//* 104  219:ifeq            244
				{
					getAnchor(ConstraintAnchor.Type.CENTER_X).connect(constraintwidget.getAnchor(ConstraintAnchor.Type.CENTER_X), 0, j);
	//  105  222:aload_0         
	//  106  223:getstatic       #209 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_X>
	//  107  226:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//  108  229:aload_2         
	//  109  230:getstatic       #209 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_X>
	//  110  233:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//  111  236:iconst_0        
	//  112  237:iload           6
	//  113  239:invokevirtual   #483 <Method boolean ConstraintAnchor.connect(ConstraintAnchor, int, int)>
	//  114  242:pop             
					return;
	//  115  243:return          
				}
				if(flag)
	//* 116  244:iload           7
	//* 117  246:ifeq            949
				{
					getAnchor(ConstraintAnchor.Type.CENTER_Y).connect(constraintwidget.getAnchor(ConstraintAnchor.Type.CENTER_Y), 0, j);
	//  118  249:aload_0         
	//  119  250:getstatic       #214 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_Y>
	//  120  253:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//  121  256:aload_2         
	//  122  257:getstatic       #214 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_Y>
	//  123  260:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//  124  263:iconst_0        
	//  125  264:iload           6
	//  126  266:invokevirtual   #483 <Method boolean ConstraintAnchor.connect(ConstraintAnchor, int, int)>
	//  127  269:pop             
					return;
	//  128  270:return          
				}
			} else
			if(type1 != ConstraintAnchor.Type.LEFT && type1 != ConstraintAnchor.Type.RIGHT)
	//* 129  271:aload_3         
	//* 130  272:getstatic       #181 <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//* 131  275:if_acmpeq       350
	//* 132  278:aload_3         
	//* 133  279:getstatic       #194 <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//* 134  282:if_acmpne       288
	//* 135  285:goto            350
			{
				if(type1 == ConstraintAnchor.Type.TOP || type1 == ConstraintAnchor.Type.BOTTOM)
	//* 136  288:aload_3         
	//* 137  289:getstatic       #189 <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//* 138  292:if_acmpeq       302
	//* 139  295:aload_3         
	//* 140  296:getstatic       #199 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
	//* 141  299:if_acmpne       949
				{
					connect(ConstraintAnchor.Type.TOP, constraintwidget, type1, 0, strength, j);
	//  142  302:aload_0         
	//  143  303:getstatic       #189 <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//  144  306:aload_2         
	//  145  307:aload_3         
	//  146  308:iconst_0        
	//  147  309:aload           5
	//  148  311:iload           6
	//  149  313:invokevirtual   #478 <Method void connect(ConstraintAnchor$Type, ConstraintWidget, ConstraintAnchor$Type, int, ConstraintAnchor$Strength, int)>
					connect(ConstraintAnchor.Type.BOTTOM, constraintwidget, type1, 0, strength, j);
	//  150  316:aload_0         
	//  151  317:getstatic       #199 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
	//  152  320:aload_2         
	//  153  321:aload_3         
	//  154  322:iconst_0        
	//  155  323:aload           5
	//  156  325:iload           6
	//  157  327:invokevirtual   #478 <Method void connect(ConstraintAnchor$Type, ConstraintWidget, ConstraintAnchor$Type, int, ConstraintAnchor$Strength, int)>
					getAnchor(ConstraintAnchor.Type.CENTER).connect(constraintwidget.getAnchor(type1), 0, j);
	//  158  330:aload_0         
	//  159  331:getstatic       #219 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER>
	//  160  334:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//  161  337:aload_2         
	//  162  338:aload_3         
	//  163  339:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//  164  342:iconst_0        
	//  165  343:iload           6
	//  166  345:invokevirtual   #483 <Method boolean ConstraintAnchor.connect(ConstraintAnchor, int, int)>
	//  167  348:pop             
					return;
	//  168  349:return          
				}
			} else
			{
				connect(ConstraintAnchor.Type.LEFT, constraintwidget, type1, 0, strength, j);
	//  169  350:aload_0         
	//  170  351:getstatic       #181 <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//  171  354:aload_2         
	//  172  355:aload_3         
	//  173  356:iconst_0        
	//  174  357:aload           5
	//  175  359:iload           6
	//  176  361:invokevirtual   #478 <Method void connect(ConstraintAnchor$Type, ConstraintWidget, ConstraintAnchor$Type, int, ConstraintAnchor$Strength, int)>
				type = ConstraintAnchor.Type.RIGHT;
	//  177  364:getstatic       #194 <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//  178  367:astore_1        
				ConstraintAnchor constraintanchor1;
				try
				{
					connect(type, constraintwidget, type1, 0, strength, j);
	//  179  368:aload_0         
	//  180  369:aload_1         
	//  181  370:aload_2         
	//  182  371:aload_3         
	//  183  372:iconst_0        
	//  184  373:aload           5
	//  185  375:iload           6
	//  186  377:invokevirtual   #478 <Method void connect(ConstraintAnchor$Type, ConstraintWidget, ConstraintAnchor$Type, int, ConstraintAnchor$Strength, int)>
				}
	//* 187  380:aload_0         
	//* 188  381:getstatic       #219 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER>
	//* 189  384:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//* 190  387:aload_2         
	//* 191  388:aload_3         
	//* 192  389:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//* 193  392:iconst_0        
	//* 194  393:iload           6
	//* 195  395:invokevirtual   #483 <Method boolean ConstraintAnchor.connect(ConstraintAnchor, int, int)>
	//* 196  398:pop             
	//* 197  399:return          
	//* 198  400:aload_1         
	//* 199  401:getstatic       #209 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_X>
	//* 200  404:if_acmpne       477
	//* 201  407:aload_3         
	//* 202  408:getstatic       #181 <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//* 203  411:if_acmpeq       421
	//* 204  414:aload_3         
	//* 205  415:getstatic       #194 <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//* 206  418:if_acmpne       477
	//* 207  421:aload_0         
	//* 208  422:getstatic       #181 <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//* 209  425:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//* 210  428:astore_1        
	//* 211  429:aload_2         
	//* 212  430:aload_3         
	//* 213  431:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//* 214  434:astore_2        
	//* 215  435:aload_0         
	//* 216  436:getstatic       #194 <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//* 217  439:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//* 218  442:astore_3        
	//* 219  443:aload_1         
	//* 220  444:aload_2         
	//* 221  445:iconst_0        
	//* 222  446:iload           6
	//* 223  448:invokevirtual   #483 <Method boolean ConstraintAnchor.connect(ConstraintAnchor, int, int)>
	//* 224  451:pop             
	//* 225  452:aload_3         
	//* 226  453:aload_2         
	//* 227  454:iconst_0        
	//* 228  455:iload           6
	//* 229  457:invokevirtual   #483 <Method boolean ConstraintAnchor.connect(ConstraintAnchor, int, int)>
	//* 230  460:pop             
	//* 231  461:aload_0         
	//* 232  462:getstatic       #209 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_X>
	//* 233  465:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//* 234  468:aload_2         
	//* 235  469:iconst_0        
	//* 236  470:iload           6
	//* 237  472:invokevirtual   #483 <Method boolean ConstraintAnchor.connect(ConstraintAnchor, int, int)>
	//* 238  475:pop             
	//* 239  476:return          
	//* 240  477:aload_1         
	//* 241  478:getstatic       #214 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_Y>
	//* 242  481:if_acmpne       550
	//* 243  484:aload_3         
	//* 244  485:getstatic       #189 <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//* 245  488:if_acmpeq       498
	//* 246  491:aload_3         
	//* 247  492:getstatic       #199 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
	//* 248  495:if_acmpne       550
	//* 249  498:aload_2         
	//* 250  499:aload_3         
	//* 251  500:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//* 252  503:astore_1        
	//* 253  504:aload_0         
	//* 254  505:getstatic       #189 <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//* 255  508:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//* 256  511:aload_1         
	//* 257  512:iconst_0        
	//* 258  513:iload           6
	//* 259  515:invokevirtual   #483 <Method boolean ConstraintAnchor.connect(ConstraintAnchor, int, int)>
	//* 260  518:pop             
	//* 261  519:aload_0         
	//* 262  520:getstatic       #199 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
	//* 263  523:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//* 264  526:aload_1         
	//* 265  527:iconst_0        
	//* 266  528:iload           6
	//* 267  530:invokevirtual   #483 <Method boolean ConstraintAnchor.connect(ConstraintAnchor, int, int)>
	//* 268  533:pop             
	//* 269  534:aload_0         
	//* 270  535:getstatic       #214 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_Y>
	//* 271  538:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//* 272  541:aload_1         
	//* 273  542:iconst_0        
	//* 274  543:iload           6
	//* 275  545:invokevirtual   #483 <Method boolean ConstraintAnchor.connect(ConstraintAnchor, int, int)>
	//* 276  548:pop             
	//* 277  549:return          
	//* 278  550:aload_1         
	//* 279  551:getstatic       #209 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_X>
	//* 280  554:if_acmpne       626
	//* 281  557:aload_3         
	//* 282  558:getstatic       #209 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_X>
	//* 283  561:if_acmpne       626
	//* 284  564:aload_0         
	//* 285  565:getstatic       #181 <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//* 286  568:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//* 287  571:aload_2         
	//* 288  572:getstatic       #181 <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//* 289  575:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//* 290  578:iconst_0        
	//* 291  579:iload           6
	//* 292  581:invokevirtual   #483 <Method boolean ConstraintAnchor.connect(ConstraintAnchor, int, int)>
	//* 293  584:pop             
	//* 294  585:aload_0         
	//* 295  586:getstatic       #194 <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//* 296  589:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//* 297  592:aload_2         
	//* 298  593:getstatic       #194 <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//* 299  596:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//* 300  599:iconst_0        
	//* 301  600:iload           6
	//* 302  602:invokevirtual   #483 <Method boolean ConstraintAnchor.connect(ConstraintAnchor, int, int)>
	//* 303  605:pop             
	//* 304  606:aload_0         
	//* 305  607:getstatic       #209 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_X>
	//* 306  610:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//* 307  613:aload_2         
	//* 308  614:aload_3         
	//* 309  615:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//* 310  618:iconst_0        
	//* 311  619:iload           6
	//* 312  621:invokevirtual   #483 <Method boolean ConstraintAnchor.connect(ConstraintAnchor, int, int)>
	//* 313  624:pop             
	//* 314  625:return          
	//* 315  626:aload_1         
	//* 316  627:getstatic       #214 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_Y>
	//* 317  630:if_acmpne       702
	//* 318  633:aload_3         
	//* 319  634:getstatic       #214 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_Y>
	//* 320  637:if_acmpne       702
	//* 321  640:aload_0         
	//* 322  641:getstatic       #189 <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//* 323  644:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//* 324  647:aload_2         
	//* 325  648:getstatic       #189 <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//* 326  651:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//* 327  654:iconst_0        
	//* 328  655:iload           6
	//* 329  657:invokevirtual   #483 <Method boolean ConstraintAnchor.connect(ConstraintAnchor, int, int)>
	//* 330  660:pop             
	//* 331  661:aload_0         
	//* 332  662:getstatic       #199 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
	//* 333  665:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//* 334  668:aload_2         
	//* 335  669:getstatic       #199 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
	//* 336  672:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//* 337  675:iconst_0        
	//* 338  676:iload           6
	//* 339  678:invokevirtual   #483 <Method boolean ConstraintAnchor.connect(ConstraintAnchor, int, int)>
	//* 340  681:pop             
	//* 341  682:aload_0         
	//* 342  683:getstatic       #214 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_Y>
	//* 343  686:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//* 344  689:aload_2         
	//* 345  690:aload_3         
	//* 346  691:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//* 347  694:iconst_0        
	//* 348  695:iload           6
	//* 349  697:invokevirtual   #483 <Method boolean ConstraintAnchor.connect(ConstraintAnchor, int, int)>
	//* 350  700:pop             
	//* 351  701:return          
	//* 352  702:aload_0         
	//* 353  703:aload_1         
	//* 354  704:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//* 355  707:astore          8
	//* 356  709:aload_2         
	//* 357  710:aload_3         
	//* 358  711:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//* 359  714:astore_2        
	//* 360  715:aload           8
	//* 361  717:aload_2         
	//* 362  718:invokevirtual   #487 <Method boolean ConstraintAnchor.isValidConnection(ConstraintAnchor)>
	//* 363  721:ifeq            949
	//* 364  724:aload_1         
	//* 365  725:getstatic       #204 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BASELINE>
	//* 366  728:if_acmpne       770
	//* 367  731:aload_0         
	//* 368  732:getstatic       #189 <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//* 369  735:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//* 370  738:astore_1        
	//* 371  739:aload_0         
	//* 372  740:getstatic       #199 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
	//* 373  743:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//* 374  746:astore_3        
	//* 375  747:aload_1         
	//* 376  748:ifnull          755
	//* 377  751:aload_1         
	//* 378  752:invokevirtual   #490 <Method void ConstraintAnchor.reset()>
	//* 379  755:aload_3         
	//* 380  756:ifnull          763
	//* 381  759:aload_3         
	//* 382  760:invokevirtual   #490 <Method void ConstraintAnchor.reset()>
	//* 383  763:iload           7
	//* 384  765:istore          4
	//* 385  767:goto            924
	//* 386  770:aload_1         
	//* 387  771:getstatic       #189 <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//* 388  774:if_acmpeq       856
	//* 389  777:aload_1         
	//* 390  778:getstatic       #199 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
	//* 391  781:if_acmpne       787
	//* 392  784:goto            856
	//* 393  787:aload_1         
	//* 394  788:getstatic       #181 <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//* 395  791:if_acmpeq       801
	//* 396  794:aload_1         
	//* 397  795:getstatic       #194 <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//* 398  798:if_acmpne       924
	//* 399  801:aload_0         
	//* 400  802:getstatic       #219 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER>
	//* 401  805:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//* 402  808:astore_3        
	//* 403  809:aload_3         
	//* 404  810:invokevirtual   #317 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//* 405  813:aload_2         
	//* 406  814:if_acmpeq       821
	//* 407  817:aload_3         
	//* 408  818:invokevirtual   #490 <Method void ConstraintAnchor.reset()>
	//* 409  821:aload_0         
	//* 410  822:aload_1         
	//* 411  823:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//* 412  826:invokevirtual   #493 <Method ConstraintAnchor ConstraintAnchor.getOpposite()>
	//* 413  829:astore_1        
	//* 414  830:aload_0         
	//* 415  831:getstatic       #209 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_X>
	//* 416  834:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//* 417  837:astore_3        
	//* 418  838:aload_3         
	//* 419  839:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//* 420  842:ifeq            924
	//* 421  845:aload_1         
	//* 422  846:invokevirtual   #490 <Method void ConstraintAnchor.reset()>
	//* 423  849:aload_3         
	//* 424  850:invokevirtual   #490 <Method void ConstraintAnchor.reset()>
	//* 425  853:goto            924
	//* 426  856:aload_0         
	//* 427  857:getstatic       #204 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BASELINE>
	//* 428  860:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//* 429  863:astore_3        
	//* 430  864:aload_3         
	//* 431  865:ifnull          872
	//* 432  868:aload_3         
	//* 433  869:invokevirtual   #490 <Method void ConstraintAnchor.reset()>
	//* 434  872:aload_0         
	//* 435  873:getstatic       #219 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER>
	//* 436  876:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//* 437  879:astore_3        
	//* 438  880:aload_3         
	//* 439  881:invokevirtual   #317 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//* 440  884:aload_2         
	//* 441  885:if_acmpeq       892
	//* 442  888:aload_3         
	//* 443  889:invokevirtual   #490 <Method void ConstraintAnchor.reset()>
	//* 444  892:aload_0         
	//* 445  893:aload_1         
	//* 446  894:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//* 447  897:invokevirtual   #493 <Method ConstraintAnchor ConstraintAnchor.getOpposite()>
	//* 448  900:astore_1        
	//* 449  901:aload_0         
	//* 450  902:getstatic       #214 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_Y>
	//* 451  905:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//* 452  908:astore_3        
	//* 453  909:aload_3         
	//* 454  910:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//* 455  913:ifeq            924
	//* 456  916:aload_1         
	//* 457  917:invokevirtual   #490 <Method void ConstraintAnchor.reset()>
	//* 458  920:aload_3         
	//* 459  921:invokevirtual   #490 <Method void ConstraintAnchor.reset()>
	//* 460  924:aload           8
	//* 461  926:aload_2         
	//* 462  927:iload           4
	//* 463  929:aload           5
	//* 464  931:iload           6
	//* 465  933:invokevirtual   #496 <Method boolean ConstraintAnchor.connect(ConstraintAnchor, int, ConstraintAnchor$Strength, int)>
	//* 466  936:pop             
	//* 467  937:aload_2         
	//* 468  938:invokevirtual   #446 <Method ConstraintWidget ConstraintAnchor.getOwner()>
	//* 469  941:aload           8
	//* 470  943:invokevirtual   #446 <Method ConstraintWidget ConstraintAnchor.getOwner()>
	//* 471  946:invokevirtual   #500 <Method void connectedTo(ConstraintWidget)>
	//* 472  949:return          
				// Misplaced declaration of an exception variable
				catch(ConstraintAnchor.Type type)
	//* 473  950:astore_1        
				{
					throw type;
	//  474  951:aload_1         
	//  475  952:athrow          
				}
				getAnchor(ConstraintAnchor.Type.CENTER).connect(constraintwidget.getAnchor(type1), 0, j);
				return;
			}
		} else
		{
			if(type == ConstraintAnchor.Type.CENTER_X && (type1 == ConstraintAnchor.Type.LEFT || type1 == ConstraintAnchor.Type.RIGHT))
			{
				type = ((ConstraintAnchor.Type) (getAnchor(ConstraintAnchor.Type.LEFT)));
				constraintwidget = ((ConstraintWidget) (constraintwidget.getAnchor(type1)));
				type1 = ((ConstraintAnchor.Type) (getAnchor(ConstraintAnchor.Type.RIGHT)));
				((ConstraintAnchor) (type)).connect(((ConstraintAnchor) (constraintwidget)), 0, j);
				((ConstraintAnchor) (type1)).connect(((ConstraintAnchor) (constraintwidget)), 0, j);
				getAnchor(ConstraintAnchor.Type.CENTER_X).connect(((ConstraintAnchor) (constraintwidget)), 0, j);
				return;
			}
			if(type == ConstraintAnchor.Type.CENTER_Y && (type1 == ConstraintAnchor.Type.TOP || type1 == ConstraintAnchor.Type.BOTTOM))
			{
				type = ((ConstraintAnchor.Type) (constraintwidget.getAnchor(type1)));
				getAnchor(ConstraintAnchor.Type.TOP).connect(((ConstraintAnchor) (type)), 0, j);
				getAnchor(ConstraintAnchor.Type.BOTTOM).connect(((ConstraintAnchor) (type)), 0, j);
				getAnchor(ConstraintAnchor.Type.CENTER_Y).connect(((ConstraintAnchor) (type)), 0, j);
				return;
			}
			if(type == ConstraintAnchor.Type.CENTER_X && type1 == ConstraintAnchor.Type.CENTER_X)
			{
				getAnchor(ConstraintAnchor.Type.LEFT).connect(constraintwidget.getAnchor(ConstraintAnchor.Type.LEFT), 0, j);
				getAnchor(ConstraintAnchor.Type.RIGHT).connect(constraintwidget.getAnchor(ConstraintAnchor.Type.RIGHT), 0, j);
				getAnchor(ConstraintAnchor.Type.CENTER_X).connect(constraintwidget.getAnchor(type1), 0, j);
				return;
			}
			if(type == ConstraintAnchor.Type.CENTER_Y && type1 == ConstraintAnchor.Type.CENTER_Y)
			{
				getAnchor(ConstraintAnchor.Type.TOP).connect(constraintwidget.getAnchor(ConstraintAnchor.Type.TOP), 0, j);
				getAnchor(ConstraintAnchor.Type.BOTTOM).connect(constraintwidget.getAnchor(ConstraintAnchor.Type.BOTTOM), 0, j);
				getAnchor(ConstraintAnchor.Type.CENTER_Y).connect(constraintwidget.getAnchor(type1), 0, j);
				return;
			}
			constraintanchor1 = getAnchor(type);
			constraintwidget = ((ConstraintWidget) (constraintwidget.getAnchor(type1)));
			if(constraintanchor1.isValidConnection(((ConstraintAnchor) (constraintwidget))))
			{
				if(type == ConstraintAnchor.Type.BASELINE)
				{
					type = ((ConstraintAnchor.Type) (getAnchor(ConstraintAnchor.Type.TOP)));
					type1 = ((ConstraintAnchor.Type) (getAnchor(ConstraintAnchor.Type.BOTTOM)));
					if(type != null)
						((ConstraintAnchor) (type)).reset();
					if(type1 != null)
						((ConstraintAnchor) (type1)).reset();
					i = ((int) (flag));
				} else
				if(type != ConstraintAnchor.Type.TOP && type != ConstraintAnchor.Type.BOTTOM)
				{
					if(type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT)
					{
						type1 = ((ConstraintAnchor.Type) (getAnchor(ConstraintAnchor.Type.CENTER)));
						if(((ConstraintAnchor) (type1)).getTarget() != constraintwidget)
							((ConstraintAnchor) (type1)).reset();
						type = ((ConstraintAnchor.Type) (getAnchor(type).getOpposite()));
						type1 = ((ConstraintAnchor.Type) (getAnchor(ConstraintAnchor.Type.CENTER_X)));
						if(((ConstraintAnchor) (type1)).isConnected())
						{
							((ConstraintAnchor) (type)).reset();
							((ConstraintAnchor) (type1)).reset();
						}
					}
				} else
				{
					type1 = ((ConstraintAnchor.Type) (getAnchor(ConstraintAnchor.Type.BASELINE)));
					if(type1 != null)
						((ConstraintAnchor) (type1)).reset();
					type1 = ((ConstraintAnchor.Type) (getAnchor(ConstraintAnchor.Type.CENTER)));
					if(((ConstraintAnchor) (type1)).getTarget() != constraintwidget)
						((ConstraintAnchor) (type1)).reset();
					type = ((ConstraintAnchor.Type) (getAnchor(type).getOpposite()));
					type1 = ((ConstraintAnchor.Type) (getAnchor(ConstraintAnchor.Type.CENTER_Y)));
					if(((ConstraintAnchor) (type1)).isConnected())
					{
						((ConstraintAnchor) (type)).reset();
						((ConstraintAnchor) (type1)).reset();
					}
				}
				constraintanchor1.connect(((ConstraintAnchor) (constraintwidget)), i, strength, j);
				((ConstraintAnchor) (constraintwidget)).getOwner().connectedTo(constraintanchor1.getOwner());
			}
		}
	}

	public void connect(ConstraintAnchor constraintanchor, ConstraintAnchor constraintanchor1, int i)
	{
		connect(constraintanchor, constraintanchor1, i, ConstraintAnchor.Strength.STRONG, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:getstatic       #471 <Field ConstraintAnchor$Strength ConstraintAnchor$Strength.STRONG>
	//    5    7:iconst_0        
	//    6    8:invokevirtual   #504 <Method void connect(ConstraintAnchor, ConstraintAnchor, int, ConstraintAnchor$Strength, int)>
	//    7   11:return          
	}

	public void connect(ConstraintAnchor constraintanchor, ConstraintAnchor constraintanchor1, int i, int j)
	{
		connect(constraintanchor, constraintanchor1, i, ConstraintAnchor.Strength.STRONG, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:getstatic       #471 <Field ConstraintAnchor$Strength ConstraintAnchor$Strength.STRONG>
	//    5    7:iload           4
	//    6    9:invokevirtual   #504 <Method void connect(ConstraintAnchor, ConstraintAnchor, int, ConstraintAnchor$Strength, int)>
	//    7   12:return          
	}

	public void connect(ConstraintAnchor constraintanchor, ConstraintAnchor constraintanchor1, int i, ConstraintAnchor.Strength strength, int j)
	{
		if(constraintanchor.getOwner() == this)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #446 <Method ConstraintWidget ConstraintAnchor.getOwner()>
	//*   2    4:aload_0         
	//*   3    5:if_acmpne       29
			connect(constraintanchor.getType(), constraintanchor1.getOwner(), constraintanchor1.getType(), i, strength, j);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #387 <Method ConstraintAnchor$Type ConstraintAnchor.getType()>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #446 <Method ConstraintWidget ConstraintAnchor.getOwner()>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #387 <Method ConstraintAnchor$Type ConstraintAnchor.getType()>
	//   11   21:iload_3         
	//   12   22:aload           4
	//   13   24:iload           5
	//   14   26:invokevirtual   #478 <Method void connect(ConstraintAnchor$Type, ConstraintWidget, ConstraintAnchor$Type, int, ConstraintAnchor$Strength, int)>
	//   15   29:return          
	}

	public void connectCircularConstraint(ConstraintWidget constraintwidget, float f, int i)
	{
		immediateConnect(ConstraintAnchor.Type.CENTER, constraintwidget, ConstraintAnchor.Type.CENTER, i, 0);
	//    0    0:aload_0         
	//    1    1:getstatic       #219 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER>
	//    2    4:aload_1         
	//    3    5:getstatic       #219 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER>
	//    4    8:iload_3         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #511 <Method void immediateConnect(ConstraintAnchor$Type, ConstraintWidget, ConstraintAnchor$Type, int, int)>
		mCircleConstraintAngle = f;
	//    7   13:aload_0         
	//    8   14:fload_2         
	//    9   15:putfield        #173 <Field float mCircleConstraintAngle>
	//   10   18:return          
	}

	public void connectedTo(ConstraintWidget constraintwidget)
	{
	//    0    0:return          
	}

	public void createObjectVariables(LinearSystem linearsystem)
	{
		linearsystem.createObjectVariable(((Object) (mLeft)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #186 <Field ConstraintAnchor mLeft>
	//    3    5:invokevirtual   #313 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//    4    8:pop             
		linearsystem.createObjectVariable(((Object) (mTop)));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #191 <Field ConstraintAnchor mTop>
	//    8   14:invokevirtual   #313 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//    9   17:pop             
		linearsystem.createObjectVariable(((Object) (mRight)));
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #196 <Field ConstraintAnchor mRight>
	//   13   23:invokevirtual   #313 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//   14   26:pop             
		linearsystem.createObjectVariable(((Object) (mBottom)));
	//   15   27:aload_1         
	//   16   28:aload_0         
	//   17   29:getfield        #201 <Field ConstraintAnchor mBottom>
	//   18   32:invokevirtual   #313 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//   19   35:pop             
		if(mBaselineDistance > 0)
	//*  20   36:aload_0         
	//*  21   37:getfield        #262 <Field int mBaselineDistance>
	//*  22   40:ifle            52
			linearsystem.createObjectVariable(((Object) (mBaseline)));
	//   23   43:aload_1         
	//   24   44:aload_0         
	//   25   45:getfield        #206 <Field ConstraintAnchor mBaseline>
	//   26   48:invokevirtual   #313 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//   27   51:pop             
	//   28   52:return          
	}

	public void disconnectUnlockedWidget(ConstraintWidget constraintwidget)
	{
		ArrayList arraylist = getAnchors();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #517 <Method ArrayList getAnchors()>
	//    2    4:astore          4
		int j = arraylist.size();
	//    3    6:aload           4
	//    4    8:invokevirtual   #520 <Method int ArrayList.size()>
	//    5   11:istore_3        
		for(int i = 0; i < j; i++)
	//*   6   12:iconst_0        
	//*   7   13:istore_2        
	//*   8   14:iload_2         
	//*   9   15:iload_3         
	//*  10   16:icmpge          71
		{
			ConstraintAnchor constraintanchor = (ConstraintAnchor)arraylist.get(i);
	//   11   19:aload           4
	//   12   21:iload_2         
	//   13   22:invokevirtual   #524 <Method Object ArrayList.get(int)>
	//   14   25:checkcast       #175 <Class ConstraintAnchor>
	//   15   28:astore          5
			if(constraintanchor.isConnected() && constraintanchor.getTarget().getOwner() == constraintwidget && constraintanchor.getConnectionCreator() == 2)
	//*  16   30:aload           5
	//*  17   32:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//*  18   35:ifeq            64
	//*  19   38:aload           5
	//*  20   40:invokevirtual   #317 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//*  21   43:invokevirtual   #446 <Method ConstraintWidget ConstraintAnchor.getOwner()>
	//*  22   46:aload_1         
	//*  23   47:if_acmpne       64
	//*  24   50:aload           5
	//*  25   52:invokevirtual   #527 <Method int ConstraintAnchor.getConnectionCreator()>
	//*  26   55:iconst_2        
	//*  27   56:icmpne          64
				constraintanchor.reset();
	//   28   59:aload           5
	//   29   61:invokevirtual   #490 <Method void ConstraintAnchor.reset()>
		}

	//   30   64:iload_2         
	//   31   65:iconst_1        
	//   32   66:iadd            
	//   33   67:istore_2        
	//*  34   68:goto            14
	//   35   71:return          
	}

	public void disconnectWidget(ConstraintWidget constraintwidget)
	{
		ArrayList arraylist = getAnchors();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #517 <Method ArrayList getAnchors()>
	//    2    4:astore          4
		int j = arraylist.size();
	//    3    6:aload           4
	//    4    8:invokevirtual   #520 <Method int ArrayList.size()>
	//    5   11:istore_3        
		for(int i = 0; i < j; i++)
	//*   6   12:iconst_0        
	//*   7   13:istore_2        
	//*   8   14:iload_2         
	//*   9   15:iload_3         
	//*  10   16:icmpge          62
		{
			ConstraintAnchor constraintanchor = (ConstraintAnchor)arraylist.get(i);
	//   11   19:aload           4
	//   12   21:iload_2         
	//   13   22:invokevirtual   #524 <Method Object ArrayList.get(int)>
	//   14   25:checkcast       #175 <Class ConstraintAnchor>
	//   15   28:astore          5
			if(constraintanchor.isConnected() && constraintanchor.getTarget().getOwner() == constraintwidget)
	//*  16   30:aload           5
	//*  17   32:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//*  18   35:ifeq            55
	//*  19   38:aload           5
	//*  20   40:invokevirtual   #317 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//*  21   43:invokevirtual   #446 <Method ConstraintWidget ConstraintAnchor.getOwner()>
	//*  22   46:aload_1         
	//*  23   47:if_acmpne       55
				constraintanchor.reset();
	//   24   50:aload           5
	//   25   52:invokevirtual   #490 <Method void ConstraintAnchor.reset()>
		}

	//   26   55:iload_2         
	//   27   56:iconst_1        
	//   28   57:iadd            
	//   29   58:istore_2        
	//*  30   59:goto            14
	//   31   62:return          
	}

	public void forceUpdateDrawPosition()
	{
		int i = mX;
	//    0    0:aload_0         
	//    1    1:getfield        #246 <Field int mX>
	//    2    4:istore_1        
		int j = mY;
	//    3    5:aload_0         
	//    4    6:getfield        #248 <Field int mY>
	//    5    9:istore_2        
		int k = mWidth;
	//    6   10:aload_0         
	//    7   11:getfield        #238 <Field int mWidth>
	//    8   14:istore_3        
		int l = mHeight;
	//    9   15:aload_0         
	//   10   16:getfield        #240 <Field int mHeight>
	//   11   19:istore          4
		mDrawX = i;
	//   12   21:aload_0         
	//   13   22:iload_1         
	//   14   23:putfield        #250 <Field int mDrawX>
		mDrawY = j;
	//   15   26:aload_0         
	//   16   27:iload_2         
	//   17   28:putfield        #252 <Field int mDrawY>
		mDrawWidth = (k + i) - i;
	//   18   31:aload_0         
	//   19   32:iload_3         
	//   20   33:iload_1         
	//   21   34:iadd            
	//   22   35:iload_1         
	//   23   36:isub            
	//   24   37:putfield        #254 <Field int mDrawWidth>
		mDrawHeight = (l + j) - j;
	//   25   40:aload_0         
	//   26   41:iload           4
	//   27   43:iload_2         
	//   28   44:iadd            
	//   29   45:iload_2         
	//   30   46:isub            
	//   31   47:putfield        #256 <Field int mDrawHeight>
	//   32   50:return          
	}

	public ConstraintAnchor getAnchor(ConstraintAnchor.Type type)
	{
		switch(_cls1..SwitchMap.android.support.constraint.solver.widgets.ConstraintAnchor.Type[type.ordinal()])
	//*   0    0:getstatic       #531 <Field int[] ConstraintWidget$1.$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #532 <Method int ConstraintAnchor$Type.ordinal()>
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
	//    5   60:new             #534 <Class AssertionError>
	//    6   63:dup             
	//    7   64:aload_1         
	//    8   65:invokevirtual   #538 <Method String ConstraintAnchor$Type.name()>
	//    9   68:invokespecial   #541 <Method void AssertionError(Object)>
	//   10   71:athrow          

		case 9: // '\t'
			return null;
	//   11   72:aconst_null     
	//   12   73:areturn         

		case 8: // '\b'
			return mCenterY;
	//   13   74:aload_0         
	//   14   75:getfield        #216 <Field ConstraintAnchor mCenterY>
	//   15   78:areturn         

		case 7: // '\007'
			return mCenterX;
	//   16   79:aload_0         
	//   17   80:getfield        #211 <Field ConstraintAnchor mCenterX>
	//   18   83:areturn         

		case 6: // '\006'
			return mCenter;
	//   19   84:aload_0         
	//   20   85:getfield        #221 <Field ConstraintAnchor mCenter>
	//   21   88:areturn         

		case 5: // '\005'
			return mBaseline;
	//   22   89:aload_0         
	//   23   90:getfield        #206 <Field ConstraintAnchor mBaseline>
	//   24   93:areturn         

		case 4: // '\004'
			return mBottom;
	//   25   94:aload_0         
	//   26   95:getfield        #201 <Field ConstraintAnchor mBottom>
	//   27   98:areturn         

		case 3: // '\003'
			return mRight;
	//   28   99:aload_0         
	//   29  100:getfield        #196 <Field ConstraintAnchor mRight>
	//   30  103:areturn         

		case 2: // '\002'
			return mTop;
	//   31  104:aload_0         
	//   32  105:getfield        #191 <Field ConstraintAnchor mTop>
	//   33  108:areturn         

		case 1: // '\001'
			return mLeft;
	//   34  109:aload_0         
	//   35  110:getfield        #186 <Field ConstraintAnchor mLeft>
	//   36  113:areturn         
		}
	}

	public ArrayList getAnchors()
	{
		return mAnchors;
	//    0    0:aload_0         
	//    1    1:getfield        #228 <Field ArrayList mAnchors>
	//    2    4:areturn         
	}

	public int getBaselineDistance()
	{
		return mBaselineDistance;
	//    0    0:aload_0         
	//    1    1:getfield        #262 <Field int mBaselineDistance>
	//    2    4:ireturn         
	}

	public int getBottom()
	{
		return getY() + mHeight;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #547 <Method int getY()>
	//    2    4:aload_0         
	//    3    5:getfield        #240 <Field int mHeight>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public Object getCompanionWidget()
	{
		return mCompanionWidget;
	//    0    0:aload_0         
	//    1    1:getfield        #551 <Field Object mCompanionWidget>
	//    2    4:areturn         
	}

	public int getContainerItemSkip()
	{
		return mContainerItemSkip;
	//    0    0:aload_0         
	//    1    1:getfield        #270 <Field int mContainerItemSkip>
	//    2    4:ireturn         
	}

	public String getDebugName()
	{
		return mDebugName;
	//    0    0:aload_0         
	//    1    1:getfield        #274 <Field String mDebugName>
	//    2    4:areturn         
	}

	public float getDimensionRatio()
	{
		return mDimensionRatio;
	//    0    0:aload_0         
	//    1    1:getfield        #242 <Field float mDimensionRatio>
	//    2    4:freturn         
	}

	public int getDimensionRatioSide()
	{
		return mDimensionRatioSide;
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field int mDimensionRatioSide>
	//    2    4:ireturn         
	}

	public int getDrawBottom()
	{
		return getDrawY() + mDrawHeight;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #560 <Method int getDrawY()>
	//    2    4:aload_0         
	//    3    5:getfield        #256 <Field int mDrawHeight>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public int getDrawHeight()
	{
		return mDrawHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #256 <Field int mDrawHeight>
	//    2    4:ireturn         
	}

	public int getDrawRight()
	{
		return getDrawX() + mDrawWidth;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #565 <Method int getDrawX()>
	//    2    4:aload_0         
	//    3    5:getfield        #254 <Field int mDrawWidth>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public int getDrawWidth()
	{
		return mDrawWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #254 <Field int mDrawWidth>
	//    2    4:ireturn         
	}

	public int getDrawX()
	{
		return mDrawX + mOffsetX;
	//    0    0:aload_0         
	//    1    1:getfield        #250 <Field int mDrawX>
	//    2    4:aload_0         
	//    3    5:getfield        #258 <Field int mOffsetX>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public int getDrawY()
	{
		return mDrawY + mOffsetY;
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field int mDrawY>
	//    2    4:aload_0         
	//    3    5:getfield        #260 <Field int mOffsetY>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public int getHeight()
	{
		if(mVisibility == 8)
	//*   0    0:aload_0         
	//*   1    1:getfield        #272 <Field int mVisibility>
	//*   2    4:bipush          8
	//*   3    6:icmpne          11
			return 0;
	//    4    9:iconst_0        
	//    5   10:ireturn         
		else
			return mHeight;
	//    6   11:aload_0         
	//    7   12:getfield        #240 <Field int mHeight>
	//    8   15:ireturn         
	}

	public float getHorizontalBiasPercent()
	{
		return mHorizontalBiasPercent;
	//    0    0:aload_0         
	//    1    1:getfield        #266 <Field float mHorizontalBiasPercent>
	//    2    4:freturn         
	}

	public ConstraintWidget getHorizontalChainControlWidget()
	{
		Object obj1;
		if(isInHorizontalChain())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #572 <Method boolean isInHorizontalChain()>
	//*   2    4:ifeq            115
		{
			Object obj = ((Object) (this));
	//    3    7:aload_0         
	//    4    8:astore_1        
			ConstraintWidget constraintwidget = null;
	//    5    9:aconst_null     
	//    6   10:astore_2        
			do
			{
				obj1 = ((Object) (constraintwidget));
	//    7   11:aload_2         
	//    8   12:astore_3        
				if(constraintwidget != null)
					break;
	//    9   13:aload_2         
	//   10   14:ifnonnull       117
				obj1 = ((Object) (constraintwidget));
	//   11   17:aload_2         
	//   12   18:astore_3        
				if(obj == null)
					break;
	//   13   19:aload_1         
	//   14   20:ifnull          117
				obj1 = ((Object) (((ConstraintWidget) (obj)).getAnchor(ConstraintAnchor.Type.LEFT)));
	//   15   23:aload_1         
	//   16   24:getstatic       #181 <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//   17   27:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//   18   30:astore_3        
				if(obj1 == null)
	//*  19   31:aload_3         
	//*  20   32:ifnonnull       40
					obj1 = null;
	//   21   35:aconst_null     
	//   22   36:astore_3        
				else
	//*  23   37:goto            45
					obj1 = ((Object) (((ConstraintAnchor) (obj1)).getTarget()));
	//   24   40:aload_3         
	//   25   41:invokevirtual   #317 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//   26   44:astore_3        
				if(obj1 == null)
	//*  27   45:aload_3         
	//*  28   46:ifnonnull       54
					obj1 = null;
	//   29   49:aconst_null     
	//   30   50:astore_3        
				else
	//*  31   51:goto            59
					obj1 = ((Object) (((ConstraintAnchor) (obj1)).getOwner()));
	//   32   54:aload_3         
	//   33   55:invokevirtual   #446 <Method ConstraintWidget ConstraintAnchor.getOwner()>
	//   34   58:astore_3        
				if(obj1 == getParent())
	//*  35   59:aload_3         
	//*  36   60:aload_0         
	//*  37   61:invokevirtual   #575 <Method ConstraintWidget getParent()>
	//*  38   64:if_acmpne       69
					return ((ConstraintWidget) (obj));
	//   39   67:aload_1         
	//   40   68:areturn         
				ConstraintAnchor constraintanchor;
				if(obj1 == null)
	//*  41   69:aload_3         
	//*  42   70:ifnonnull       79
					constraintanchor = null;
	//   43   73:aconst_null     
	//   44   74:astore          4
				else
	//*  45   76:goto            91
					constraintanchor = ((ConstraintWidget) (obj1)).getAnchor(ConstraintAnchor.Type.RIGHT).getTarget();
	//   46   79:aload_3         
	//   47   80:getstatic       #194 <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//   48   83:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//   49   86:invokevirtual   #317 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//   50   89:astore          4
				if(constraintanchor != null && constraintanchor.getOwner() != obj)
	//*  51   91:aload           4
	//*  52   93:ifnull          110
	//*  53   96:aload           4
	//*  54   98:invokevirtual   #446 <Method ConstraintWidget ConstraintAnchor.getOwner()>
	//*  55  101:aload_1         
	//*  56  102:if_acmpeq       110
					constraintwidget = ((ConstraintWidget) (obj));
	//   57  105:aload_1         
	//   58  106:astore_2        
				else
	//*  59  107:goto            11
					obj = obj1;
	//   60  110:aload_3         
	//   61  111:astore_1        
			} while(true);
	//   62  112:goto            11
		} else
		{
			obj1 = null;
	//   63  115:aconst_null     
	//   64  116:astore_3        
		}
		return ((ConstraintWidget) (obj1));
	//   65  117:aload_3         
	//   66  118:areturn         
	}

	public int getHorizontalChainStyle()
	{
		return mHorizontalChainStyle;
	//    0    0:aload_0         
	//    1    1:getfield        #278 <Field int mHorizontalChainStyle>
	//    2    4:ireturn         
	}

	public DimensionBehaviour getHorizontalDimensionBehaviour()
	{
		return mListDimensionBehaviors[0];
	//    0    0:aload_0         
	//    1    1:getfield        #234 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//    2    4:iconst_0        
	//    3    5:aaload          
	//    4    6:areturn         
	}

	public int getInternalDrawBottom()
	{
		return mDrawY + mDrawHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field int mDrawY>
	//    2    4:aload_0         
	//    3    5:getfield        #256 <Field int mDrawHeight>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public int getInternalDrawRight()
	{
		return mDrawX + mDrawWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #250 <Field int mDrawX>
	//    2    4:aload_0         
	//    3    5:getfield        #254 <Field int mDrawWidth>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	int getInternalDrawX()
	{
		return mDrawX;
	//    0    0:aload_0         
	//    1    1:getfield        #250 <Field int mDrawX>
	//    2    4:ireturn         
	}

	int getInternalDrawY()
	{
		return mDrawY;
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field int mDrawY>
	//    2    4:ireturn         
	}

	public int getLeft()
	{
		return getX();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #586 <Method int getX()>
	//    2    4:ireturn         
	}

	public int getMaxHeight()
	{
		return mMaxDimension[1];
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field int[] mMaxDimension>
	//    2    4:iconst_1        
	//    3    5:iaload          
	//    4    6:ireturn         
	}

	public int getMaxWidth()
	{
		return mMaxDimension[0];
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field int[] mMaxDimension>
	//    2    4:iconst_0        
	//    3    5:iaload          
	//    4    6:ireturn         
	}

	public int getMinHeight()
	{
		return mMinHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #426 <Field int mMinHeight>
	//    2    4:ireturn         
	}

	public int getMinWidth()
	{
		return mMinWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #424 <Field int mMinWidth>
	//    2    4:ireturn         
	}

	public int getOptimizerWrapHeight()
	{
		int i = mHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #240 <Field int mHeight>
	//    2    4:istore_1        
		int j = i;
	//    3    5:iload_1         
	//    4    6:istore_2        
		if(mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT)
	//*   5    7:aload_0         
	//*   6    8:getfield        #234 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//*   7   11:iconst_1        
	//*   8   12:aaload          
	//*   9   13:getstatic       #429 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//*  10   16:if_acmpne       78
		{
			if(mMatchConstraintDefaultHeight == 1)
	//*  11   19:aload_0         
	//*  12   20:getfield        #150 <Field int mMatchConstraintDefaultHeight>
	//*  13   23:iconst_1        
	//*  14   24:icmpne          39
			{
				i = Math.max(mMatchConstraintMinHeight, i);
	//   15   27:aload_0         
	//   16   28:getfield        #160 <Field int mMatchConstraintMinHeight>
	//   17   31:iload_1         
	//   18   32:invokestatic    #380 <Method int Math.max(int, int)>
	//   19   35:istore_1        
			} else
	//*  20   36:goto            58
			{
				i = mMatchConstraintMinHeight;
	//   21   39:aload_0         
	//   22   40:getfield        #160 <Field int mMatchConstraintMinHeight>
	//   23   43:istore_1        
				if(i > 0)
	//*  24   44:iload_1         
	//*  25   45:ifle            56
					mHeight = i;
	//   26   48:aload_0         
	//   27   49:iload_1         
	//   28   50:putfield        #240 <Field int mHeight>
				else
	//*  29   53:goto            58
					i = 0;
	//   30   56:iconst_0        
	//   31   57:istore_1        
			}
			int k = mMatchConstraintMaxHeight;
	//   32   58:aload_0         
	//   33   59:getfield        #162 <Field int mMatchConstraintMaxHeight>
	//   34   62:istore_3        
			j = i;
	//   35   63:iload_1         
	//   36   64:istore_2        
			if(k > 0)
	//*  37   65:iload_3         
	//*  38   66:ifle            78
			{
				j = i;
	//   39   69:iload_1         
	//   40   70:istore_2        
				if(k < i)
	//*  41   71:iload_3         
	//*  42   72:iload_1         
	//*  43   73:icmpge          78
					j = k;
	//   44   76:iload_3         
	//   45   77:istore_2        
			}
		}
		return j;
	//   46   78:iload_2         
	//   47   79:ireturn         
	}

	public int getOptimizerWrapWidth()
	{
		int i = mWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #238 <Field int mWidth>
	//    2    4:istore_1        
		int j = i;
	//    3    5:iload_1         
	//    4    6:istore_2        
		if(mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT)
	//*   5    7:aload_0         
	//*   6    8:getfield        #234 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//*   7   11:iconst_0        
	//*   8   12:aaload          
	//*   9   13:getstatic       #429 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//*  10   16:if_acmpne       78
		{
			if(mMatchConstraintDefaultWidth == 1)
	//*  11   19:aload_0         
	//*  12   20:getfield        #148 <Field int mMatchConstraintDefaultWidth>
	//*  13   23:iconst_1        
	//*  14   24:icmpne          39
			{
				i = Math.max(mMatchConstraintMinWidth, i);
	//   15   27:aload_0         
	//   16   28:getfield        #154 <Field int mMatchConstraintMinWidth>
	//   17   31:iload_1         
	//   18   32:invokestatic    #380 <Method int Math.max(int, int)>
	//   19   35:istore_1        
			} else
	//*  20   36:goto            58
			{
				i = mMatchConstraintMinWidth;
	//   21   39:aload_0         
	//   22   40:getfield        #154 <Field int mMatchConstraintMinWidth>
	//   23   43:istore_1        
				if(i > 0)
	//*  24   44:iload_1         
	//*  25   45:ifle            56
					mWidth = i;
	//   26   48:aload_0         
	//   27   49:iload_1         
	//   28   50:putfield        #238 <Field int mWidth>
				else
	//*  29   53:goto            58
					i = 0;
	//   30   56:iconst_0        
	//   31   57:istore_1        
			}
			int k = mMatchConstraintMaxWidth;
	//   32   58:aload_0         
	//   33   59:getfield        #156 <Field int mMatchConstraintMaxWidth>
	//   34   62:istore_3        
			j = i;
	//   35   63:iload_1         
	//   36   64:istore_2        
			if(k > 0)
	//*  37   65:iload_3         
	//*  38   66:ifle            78
			{
				j = i;
	//   39   69:iload_1         
	//   40   70:istore_2        
				if(k < i)
	//*  41   71:iload_3         
	//*  42   72:iload_1         
	//*  43   73:icmpge          78
					j = k;
	//   44   76:iload_3         
	//   45   77:istore_2        
			}
		}
		return j;
	//   46   78:iload_2         
	//   47   79:ireturn         
	}

	public ConstraintWidget getParent()
	{
		return mParent;
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field ConstraintWidget mParent>
	//    2    4:areturn         
	}

	public ResolutionDimension getResolutionHeight()
	{
		if(mResolutionHeight == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #596 <Field ResolutionDimension mResolutionHeight>
	//*   2    4:ifnonnull       18
			mResolutionHeight = new ResolutionDimension();
	//    3    7:aload_0         
	//    4    8:new             #598 <Class ResolutionDimension>
	//    5   11:dup             
	//    6   12:invokespecial   #599 <Method void ResolutionDimension()>
	//    7   15:putfield        #596 <Field ResolutionDimension mResolutionHeight>
		return mResolutionHeight;
	//    8   18:aload_0         
	//    9   19:getfield        #596 <Field ResolutionDimension mResolutionHeight>
	//   10   22:areturn         
	}

	public ResolutionDimension getResolutionWidth()
	{
		if(mResolutionWidth == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #602 <Field ResolutionDimension mResolutionWidth>
	//*   2    4:ifnonnull       18
			mResolutionWidth = new ResolutionDimension();
	//    3    7:aload_0         
	//    4    8:new             #598 <Class ResolutionDimension>
	//    5   11:dup             
	//    6   12:invokespecial   #599 <Method void ResolutionDimension()>
	//    7   15:putfield        #602 <Field ResolutionDimension mResolutionWidth>
		return mResolutionWidth;
	//    8   18:aload_0         
	//    9   19:getfield        #602 <Field ResolutionDimension mResolutionWidth>
	//   10   22:areturn         
	}

	public int getRight()
	{
		return getX() + mWidth;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #586 <Method int getX()>
	//    2    4:aload_0         
	//    3    5:getfield        #238 <Field int mWidth>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public WidgetContainer getRootWidgetContainer()
	{
		ConstraintWidget constraintwidget;
		for(constraintwidget = this; constraintwidget.getParent() != null; constraintwidget = constraintwidget.getParent());
	//    0    0:aload_0         
	//    1    1:astore_1        
	//    2    2:aload_1         
	//    3    3:invokevirtual   #575 <Method ConstraintWidget getParent()>
	//    4    6:ifnull          17
	//    5    9:aload_1         
	//    6   10:invokevirtual   #575 <Method ConstraintWidget getParent()>
	//    7   13:astore_1        
	//*   8   14:goto            2
		if(constraintwidget instanceof WidgetContainer)
	//*   9   17:aload_1         
	//*  10   18:instanceof      #607 <Class WidgetContainer>
	//*  11   21:ifeq            29
			return (WidgetContainer)constraintwidget;
	//   12   24:aload_1         
	//   13   25:checkcast       #607 <Class WidgetContainer>
	//   14   28:areturn         
		else
			return null;
	//   15   29:aconst_null     
	//   16   30:areturn         
	}

	protected int getRootX()
	{
		return mX + mOffsetX;
	//    0    0:aload_0         
	//    1    1:getfield        #246 <Field int mX>
	//    2    4:aload_0         
	//    3    5:getfield        #258 <Field int mOffsetX>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	protected int getRootY()
	{
		return mY + mOffsetY;
	//    0    0:aload_0         
	//    1    1:getfield        #248 <Field int mY>
	//    2    4:aload_0         
	//    3    5:getfield        #260 <Field int mOffsetY>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public int getTop()
	{
		return getY();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #547 <Method int getY()>
	//    2    4:ireturn         
	}

	public String getType()
	{
		return mType;
	//    0    0:aload_0         
	//    1    1:getfield        #276 <Field String mType>
	//    2    4:areturn         
	}

	public float getVerticalBiasPercent()
	{
		return mVerticalBiasPercent;
	//    0    0:aload_0         
	//    1    1:getfield        #268 <Field float mVerticalBiasPercent>
	//    2    4:freturn         
	}

	public ConstraintWidget getVerticalChainControlWidget()
	{
		Object obj1;
		if(isInVerticalChain())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #615 <Method boolean isInVerticalChain()>
	//*   2    4:ifeq            115
		{
			Object obj = ((Object) (this));
	//    3    7:aload_0         
	//    4    8:astore_1        
			ConstraintWidget constraintwidget = null;
	//    5    9:aconst_null     
	//    6   10:astore_2        
			do
			{
				obj1 = ((Object) (constraintwidget));
	//    7   11:aload_2         
	//    8   12:astore_3        
				if(constraintwidget != null)
					break;
	//    9   13:aload_2         
	//   10   14:ifnonnull       117
				obj1 = ((Object) (constraintwidget));
	//   11   17:aload_2         
	//   12   18:astore_3        
				if(obj == null)
					break;
	//   13   19:aload_1         
	//   14   20:ifnull          117
				obj1 = ((Object) (((ConstraintWidget) (obj)).getAnchor(ConstraintAnchor.Type.TOP)));
	//   15   23:aload_1         
	//   16   24:getstatic       #189 <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//   17   27:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//   18   30:astore_3        
				if(obj1 == null)
	//*  19   31:aload_3         
	//*  20   32:ifnonnull       40
					obj1 = null;
	//   21   35:aconst_null     
	//   22   36:astore_3        
				else
	//*  23   37:goto            45
					obj1 = ((Object) (((ConstraintAnchor) (obj1)).getTarget()));
	//   24   40:aload_3         
	//   25   41:invokevirtual   #317 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//   26   44:astore_3        
				if(obj1 == null)
	//*  27   45:aload_3         
	//*  28   46:ifnonnull       54
					obj1 = null;
	//   29   49:aconst_null     
	//   30   50:astore_3        
				else
	//*  31   51:goto            59
					obj1 = ((Object) (((ConstraintAnchor) (obj1)).getOwner()));
	//   32   54:aload_3         
	//   33   55:invokevirtual   #446 <Method ConstraintWidget ConstraintAnchor.getOwner()>
	//   34   58:astore_3        
				if(obj1 == getParent())
	//*  35   59:aload_3         
	//*  36   60:aload_0         
	//*  37   61:invokevirtual   #575 <Method ConstraintWidget getParent()>
	//*  38   64:if_acmpne       69
					return ((ConstraintWidget) (obj));
	//   39   67:aload_1         
	//   40   68:areturn         
				ConstraintAnchor constraintanchor;
				if(obj1 == null)
	//*  41   69:aload_3         
	//*  42   70:ifnonnull       79
					constraintanchor = null;
	//   43   73:aconst_null     
	//   44   74:astore          4
				else
	//*  45   76:goto            91
					constraintanchor = ((ConstraintWidget) (obj1)).getAnchor(ConstraintAnchor.Type.BOTTOM).getTarget();
	//   46   79:aload_3         
	//   47   80:getstatic       #199 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
	//   48   83:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//   49   86:invokevirtual   #317 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//   50   89:astore          4
				if(constraintanchor != null && constraintanchor.getOwner() != obj)
	//*  51   91:aload           4
	//*  52   93:ifnull          110
	//*  53   96:aload           4
	//*  54   98:invokevirtual   #446 <Method ConstraintWidget ConstraintAnchor.getOwner()>
	//*  55  101:aload_1         
	//*  56  102:if_acmpeq       110
					constraintwidget = ((ConstraintWidget) (obj));
	//   57  105:aload_1         
	//   58  106:astore_2        
				else
	//*  59  107:goto            11
					obj = obj1;
	//   60  110:aload_3         
	//   61  111:astore_1        
			} while(true);
	//   62  112:goto            11
		} else
		{
			obj1 = null;
	//   63  115:aconst_null     
	//   64  116:astore_3        
		}
		return ((ConstraintWidget) (obj1));
	//   65  117:aload_3         
	//   66  118:areturn         
	}

	public int getVerticalChainStyle()
	{
		return mVerticalChainStyle;
	//    0    0:aload_0         
	//    1    1:getfield        #280 <Field int mVerticalChainStyle>
	//    2    4:ireturn         
	}

	public DimensionBehaviour getVerticalDimensionBehaviour()
	{
		return mListDimensionBehaviors[1];
	//    0    0:aload_0         
	//    1    1:getfield        #234 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//    2    4:iconst_1        
	//    3    5:aaload          
	//    4    6:areturn         
	}

	public int getVisibility()
	{
		return mVisibility;
	//    0    0:aload_0         
	//    1    1:getfield        #272 <Field int mVisibility>
	//    2    4:ireturn         
	}

	public int getWidth()
	{
		if(mVisibility == 8)
	//*   0    0:aload_0         
	//*   1    1:getfield        #272 <Field int mVisibility>
	//*   2    4:bipush          8
	//*   3    6:icmpne          11
			return 0;
	//    4    9:iconst_0        
	//    5   10:ireturn         
		else
			return mWidth;
	//    6   11:aload_0         
	//    7   12:getfield        #238 <Field int mWidth>
	//    8   15:ireturn         
	}

	public int getWrapHeight()
	{
		return mWrapHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #622 <Field int mWrapHeight>
	//    2    4:ireturn         
	}

	public int getWrapWidth()
	{
		return mWrapWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #625 <Field int mWrapWidth>
	//    2    4:ireturn         
	}

	public int getX()
	{
		return mX;
	//    0    0:aload_0         
	//    1    1:getfield        #246 <Field int mX>
	//    2    4:ireturn         
	}

	public int getY()
	{
		return mY;
	//    0    0:aload_0         
	//    1    1:getfield        #248 <Field int mY>
	//    2    4:ireturn         
	}

	public boolean hasAncestor(ConstraintWidget constraintwidget)
	{
		ConstraintWidget constraintwidget2 = getParent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #575 <Method ConstraintWidget getParent()>
	//    2    4:astore_3        
		if(constraintwidget2 == constraintwidget)
	//*   3    5:aload_3         
	//*   4    6:aload_1         
	//*   5    7:if_acmpne       12
			return true;
	//    6   10:iconst_1        
	//    7   11:ireturn         
		ConstraintWidget constraintwidget1 = constraintwidget2;
	//    8   12:aload_3         
	//    9   13:astore_2        
		if(constraintwidget2 == constraintwidget.getParent())
	//*  10   14:aload_3         
	//*  11   15:aload_1         
	//*  12   16:invokevirtual   #575 <Method ConstraintWidget getParent()>
	//*  13   19:if_acmpne       24
			return false;
	//   14   22:iconst_0        
	//   15   23:ireturn         
		for(; constraintwidget1 != null; constraintwidget1 = constraintwidget1.getParent())
	//*  16   24:aload_2         
	//*  17   25:ifnull          53
		{
			if(constraintwidget1 == constraintwidget)
	//*  18   28:aload_2         
	//*  19   29:aload_1         
	//*  20   30:if_acmpne       35
				return true;
	//   21   33:iconst_1        
	//   22   34:ireturn         
			if(constraintwidget1 == constraintwidget.getParent())
	//*  23   35:aload_2         
	//*  24   36:aload_1         
	//*  25   37:invokevirtual   #575 <Method ConstraintWidget getParent()>
	//*  26   40:if_acmpne       45
				return true;
	//   27   43:iconst_1        
	//   28   44:ireturn         
		}

	//   29   45:aload_2         
	//   30   46:invokevirtual   #575 <Method ConstraintWidget getParent()>
	//   31   49:astore_2        
	//*  32   50:goto            24
		return false;
	//   33   53:iconst_0        
	//   34   54:ireturn         
	}

	public boolean hasBaseline()
	{
		return mBaselineDistance > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #262 <Field int mBaselineDistance>
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
	//    2    2:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//    6   10:iload           4
	//    7   12:iload           5
	//    8   14:getstatic       #471 <Field ConstraintAnchor$Strength ConstraintAnchor$Strength.STRONG>
	//    9   17:iconst_0        
	//   10   18:iconst_1        
	//   11   19:invokevirtual   #631 <Method boolean ConstraintAnchor.connect(ConstraintAnchor, int, int, ConstraintAnchor$Strength, int, boolean)>
	//   12   22:pop             
	//   13   23:return          
	}

	public boolean isFullyResolved()
	{
		return mLeft.getResolutionNode().state == 1 && mRight.getResolutionNode().state == 1 && mTop.getResolutionNode().state == 1 && mBottom.getResolutionNode().state == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field ConstraintAnchor mLeft>
	//    2    4:invokevirtual   #324 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//    3    7:getfield        #329 <Field int ResolutionAnchor.state>
	//    4   10:iconst_1        
	//    5   11:icmpne          58
	//    6   14:aload_0         
	//    7   15:getfield        #196 <Field ConstraintAnchor mRight>
	//    8   18:invokevirtual   #324 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//    9   21:getfield        #329 <Field int ResolutionAnchor.state>
	//   10   24:iconst_1        
	//   11   25:icmpne          58
	//   12   28:aload_0         
	//   13   29:getfield        #191 <Field ConstraintAnchor mTop>
	//   14   32:invokevirtual   #324 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   15   35:getfield        #329 <Field int ResolutionAnchor.state>
	//   16   38:iconst_1        
	//   17   39:icmpne          58
	//   18   42:aload_0         
	//   19   43:getfield        #201 <Field ConstraintAnchor mBottom>
	//   20   46:invokevirtual   #324 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   21   49:getfield        #329 <Field int ResolutionAnchor.state>
	//   22   52:iconst_1        
	//   23   53:icmpne          58
	//   24   56:iconst_1        
	//   25   57:ireturn         
	//   26   58:iconst_0        
	//   27   59:ireturn         
	}

	public boolean isHeightWrapContent()
	{
		return mIsHeightWrapContent;
	//    0    0:aload_0         
	//    1    1:getfield        #635 <Field boolean mIsHeightWrapContent>
	//    2    4:ireturn         
	}

	public boolean isInHorizontalChain()
	{
		return mLeft.mTarget != null && mLeft.mTarget.mTarget == mLeft || mRight.mTarget != null && mRight.mTarget.mTarget == mRight;
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field ConstraintAnchor mLeft>
	//    2    4:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//    3    7:ifnull          27
	//    4   10:aload_0         
	//    5   11:getfield        #186 <Field ConstraintAnchor mLeft>
	//    6   14:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//    7   17:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//    8   20:aload_0         
	//    9   21:getfield        #186 <Field ConstraintAnchor mLeft>
	//   10   24:if_acmpeq       54
	//   11   27:aload_0         
	//   12   28:getfield        #196 <Field ConstraintAnchor mRight>
	//   13   31:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//   14   34:ifnull          56
	//   15   37:aload_0         
	//   16   38:getfield        #196 <Field ConstraintAnchor mRight>
	//   17   41:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//   18   44:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//   19   47:aload_0         
	//   20   48:getfield        #196 <Field ConstraintAnchor mRight>
	//   21   51:if_acmpne       56
	//   22   54:iconst_1        
	//   23   55:ireturn         
	//   24   56:iconst_0        
	//   25   57:ireturn         
	}

	public boolean isInVerticalChain()
	{
		return mTop.mTarget != null && mTop.mTarget.mTarget == mTop || mBottom.mTarget != null && mBottom.mTarget.mTarget == mBottom;
	//    0    0:aload_0         
	//    1    1:getfield        #191 <Field ConstraintAnchor mTop>
	//    2    4:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//    3    7:ifnull          27
	//    4   10:aload_0         
	//    5   11:getfield        #191 <Field ConstraintAnchor mTop>
	//    6   14:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//    7   17:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//    8   20:aload_0         
	//    9   21:getfield        #191 <Field ConstraintAnchor mTop>
	//   10   24:if_acmpeq       54
	//   11   27:aload_0         
	//   12   28:getfield        #201 <Field ConstraintAnchor mBottom>
	//   13   31:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//   14   34:ifnull          56
	//   15   37:aload_0         
	//   16   38:getfield        #201 <Field ConstraintAnchor mBottom>
	//   17   41:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//   18   44:getfield        #416 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//   19   47:aload_0         
	//   20   48:getfield        #201 <Field ConstraintAnchor mBottom>
	//   21   51:if_acmpne       56
	//   22   54:iconst_1        
	//   23   55:ireturn         
	//   24   56:iconst_0        
	//   25   57:ireturn         
	}

	public boolean isInsideConstraintLayout()
	{
		ConstraintWidget constraintwidget1 = getParent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #575 <Method ConstraintWidget getParent()>
	//    2    4:astore_2        
		ConstraintWidget constraintwidget = constraintwidget1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(constraintwidget1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		for(; constraintwidget != null; constraintwidget = constraintwidget.getParent())
	//*   9   13:aload_1         
	//*  10   14:ifnull          34
			if(constraintwidget instanceof ConstraintWidgetContainer)
	//*  11   17:aload_1         
	//*  12   18:instanceof      #418 <Class ConstraintWidgetContainer>
	//*  13   21:ifeq            26
				return true;
	//   14   24:iconst_1        
	//   15   25:ireturn         

	//   16   26:aload_1         
	//   17   27:invokevirtual   #575 <Method ConstraintWidget getParent()>
	//   18   30:astore_1        
	//*  19   31:goto            13
		return false;
	//   20   34:iconst_0        
	//   21   35:ireturn         
	}

	public boolean isRoot()
	{
		return mParent == null;
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field ConstraintWidget mParent>
	//    2    4:ifnonnull       9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean isRootContainer()
	{
		if(this instanceof ConstraintWidgetContainer)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #418 <Class ConstraintWidgetContainer>
	//*   2    4:ifeq            25
		{
			ConstraintWidget constraintwidget = mParent;
	//    3    7:aload_0         
	//    4    8:getfield        #236 <Field ConstraintWidget mParent>
	//    5   11:astore_1        
			if(constraintwidget == null || !(constraintwidget instanceof ConstraintWidgetContainer))
	//*   6   12:aload_1         
	//*   7   13:ifnull          23
	//*   8   16:aload_1         
	//*   9   17:instanceof      #418 <Class ConstraintWidgetContainer>
	//*  10   20:ifne            25
				return true;
	//   11   23:iconst_1        
	//   12   24:ireturn         
		}
		return false;
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public boolean isSpreadHeight()
	{
		return mMatchConstraintDefaultHeight == 0 && mDimensionRatio == 0.0F && mMatchConstraintMinHeight == 0 && mMatchConstraintMaxHeight == 0 && mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT;
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field int mMatchConstraintDefaultHeight>
	//    2    4:ifne            44
	//    3    7:aload_0         
	//    4    8:getfield        #242 <Field float mDimensionRatio>
	//    5   11:fconst_0        
	//    6   12:fcmpl           
	//    7   13:ifne            44
	//    8   16:aload_0         
	//    9   17:getfield        #160 <Field int mMatchConstraintMinHeight>
	//   10   20:ifne            44
	//   11   23:aload_0         
	//   12   24:getfield        #162 <Field int mMatchConstraintMaxHeight>
	//   13   27:ifne            44
	//   14   30:aload_0         
	//   15   31:getfield        #234 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//   16   34:iconst_1        
	//   17   35:aaload          
	//   18   36:getstatic       #429 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
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
	//    1    1:getfield        #148 <Field int mMatchConstraintDefaultWidth>
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
	//*  12   16:getfield        #242 <Field float mDimensionRatio>
	//*  13   19:fconst_0        
	//*  14   20:fcmpl           
	//*  15   21:ifne            58
			{
				flag = flag1;
	//   16   24:iload_3         
	//   17   25:istore_2        
				if(mMatchConstraintMinWidth == 0)
	//*  18   26:aload_0         
	//*  19   27:getfield        #154 <Field int mMatchConstraintMinWidth>
	//*  20   30:ifne            58
				{
					flag = flag1;
	//   21   33:iload_3         
	//   22   34:istore_2        
					if(mMatchConstraintMaxWidth == 0)
	//*  23   35:aload_0         
	//*  24   36:getfield        #156 <Field int mMatchConstraintMaxWidth>
	//*  25   39:ifne            58
					{
						flag = flag1;
	//   26   42:iload_3         
	//   27   43:istore_2        
						if(mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT)
	//*  28   44:aload_0         
	//*  29   45:getfield        #234 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//*  30   48:iconst_0        
	//*  31   49:aaload          
	//*  32   50:getstatic       #429 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
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

	public boolean isWidthWrapContent()
	{
		return mIsWidthWrapContent;
	//    0    0:aload_0         
	//    1    1:getfield        #643 <Field boolean mIsWidthWrapContent>
	//    2    4:ireturn         
	}

	public void reset()
	{
		mLeft.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field ConstraintAnchor mLeft>
	//    2    4:invokevirtual   #490 <Method void ConstraintAnchor.reset()>
		mTop.reset();
	//    3    7:aload_0         
	//    4    8:getfield        #191 <Field ConstraintAnchor mTop>
	//    5   11:invokevirtual   #490 <Method void ConstraintAnchor.reset()>
		mRight.reset();
	//    6   14:aload_0         
	//    7   15:getfield        #196 <Field ConstraintAnchor mRight>
	//    8   18:invokevirtual   #490 <Method void ConstraintAnchor.reset()>
		mBottom.reset();
	//    9   21:aload_0         
	//   10   22:getfield        #201 <Field ConstraintAnchor mBottom>
	//   11   25:invokevirtual   #490 <Method void ConstraintAnchor.reset()>
		mBaseline.reset();
	//   12   28:aload_0         
	//   13   29:getfield        #206 <Field ConstraintAnchor mBaseline>
	//   14   32:invokevirtual   #490 <Method void ConstraintAnchor.reset()>
		mCenterX.reset();
	//   15   35:aload_0         
	//   16   36:getfield        #211 <Field ConstraintAnchor mCenterX>
	//   17   39:invokevirtual   #490 <Method void ConstraintAnchor.reset()>
		mCenterY.reset();
	//   18   42:aload_0         
	//   19   43:getfield        #216 <Field ConstraintAnchor mCenterY>
	//   20   46:invokevirtual   #490 <Method void ConstraintAnchor.reset()>
		mCenter.reset();
	//   21   49:aload_0         
	//   22   50:getfield        #221 <Field ConstraintAnchor mCenter>
	//   23   53:invokevirtual   #490 <Method void ConstraintAnchor.reset()>
		mParent = null;
	//   24   56:aload_0         
	//   25   57:aconst_null     
	//   26   58:putfield        #236 <Field ConstraintWidget mParent>
		mCircleConstraintAngle = 0.0F;
	//   27   61:aload_0         
	//   28   62:fconst_0        
	//   29   63:putfield        #173 <Field float mCircleConstraintAngle>
		mWidth = 0;
	//   30   66:aload_0         
	//   31   67:iconst_0        
	//   32   68:putfield        #238 <Field int mWidth>
		mHeight = 0;
	//   33   71:aload_0         
	//   34   72:iconst_0        
	//   35   73:putfield        #240 <Field int mHeight>
		mDimensionRatio = 0.0F;
	//   36   76:aload_0         
	//   37   77:fconst_0        
	//   38   78:putfield        #242 <Field float mDimensionRatio>
		mDimensionRatioSide = -1;
	//   39   81:aload_0         
	//   40   82:iconst_m1       
	//   41   83:putfield        #244 <Field int mDimensionRatioSide>
		mX = 0;
	//   42   86:aload_0         
	//   43   87:iconst_0        
	//   44   88:putfield        #246 <Field int mX>
		mY = 0;
	//   45   91:aload_0         
	//   46   92:iconst_0        
	//   47   93:putfield        #248 <Field int mY>
		mDrawX = 0;
	//   48   96:aload_0         
	//   49   97:iconst_0        
	//   50   98:putfield        #250 <Field int mDrawX>
		mDrawY = 0;
	//   51  101:aload_0         
	//   52  102:iconst_0        
	//   53  103:putfield        #252 <Field int mDrawY>
		mDrawWidth = 0;
	//   54  106:aload_0         
	//   55  107:iconst_0        
	//   56  108:putfield        #254 <Field int mDrawWidth>
		mDrawHeight = 0;
	//   57  111:aload_0         
	//   58  112:iconst_0        
	//   59  113:putfield        #256 <Field int mDrawHeight>
		mOffsetX = 0;
	//   60  116:aload_0         
	//   61  117:iconst_0        
	//   62  118:putfield        #258 <Field int mOffsetX>
		mOffsetY = 0;
	//   63  121:aload_0         
	//   64  122:iconst_0        
	//   65  123:putfield        #260 <Field int mOffsetY>
		mBaselineDistance = 0;
	//   66  126:aload_0         
	//   67  127:iconst_0        
	//   68  128:putfield        #262 <Field int mBaselineDistance>
		mMinWidth = 0;
	//   69  131:aload_0         
	//   70  132:iconst_0        
	//   71  133:putfield        #424 <Field int mMinWidth>
		mMinHeight = 0;
	//   72  136:aload_0         
	//   73  137:iconst_0        
	//   74  138:putfield        #426 <Field int mMinHeight>
		mWrapWidth = 0;
	//   75  141:aload_0         
	//   76  142:iconst_0        
	//   77  143:putfield        #625 <Field int mWrapWidth>
		mWrapHeight = 0;
	//   78  146:aload_0         
	//   79  147:iconst_0        
	//   80  148:putfield        #622 <Field int mWrapHeight>
		float f = DEFAULT_BIAS;
	//   81  151:getstatic       #264 <Field float DEFAULT_BIAS>
	//   82  154:fstore_1        
		mHorizontalBiasPercent = f;
	//   83  155:aload_0         
	//   84  156:fload_1         
	//   85  157:putfield        #266 <Field float mHorizontalBiasPercent>
		mVerticalBiasPercent = f;
	//   86  160:aload_0         
	//   87  161:fload_1         
	//   88  162:putfield        #268 <Field float mVerticalBiasPercent>
		mListDimensionBehaviors[0] = DimensionBehaviour.FIXED;
	//   89  165:aload_0         
	//   90  166:getfield        #234 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//   91  169:iconst_0        
	//   92  170:getstatic       #232 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.FIXED>
	//   93  173:aastore         
		mListDimensionBehaviors[1] = DimensionBehaviour.FIXED;
	//   94  174:aload_0         
	//   95  175:getfield        #234 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//   96  178:iconst_1        
	//   97  179:getstatic       #232 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.FIXED>
	//   98  182:aastore         
		mCompanionWidget = null;
	//   99  183:aload_0         
	//  100  184:aconst_null     
	//  101  185:putfield        #551 <Field Object mCompanionWidget>
		mContainerItemSkip = 0;
	//  102  188:aload_0         
	//  103  189:iconst_0        
	//  104  190:putfield        #270 <Field int mContainerItemSkip>
		mVisibility = 0;
	//  105  193:aload_0         
	//  106  194:iconst_0        
	//  107  195:putfield        #272 <Field int mVisibility>
		mType = null;
	//  108  198:aload_0         
	//  109  199:aconst_null     
	//  110  200:putfield        #276 <Field String mType>
		mHorizontalWrapVisited = false;
	//  111  203:aload_0         
	//  112  204:iconst_0        
	//  113  205:putfield        #645 <Field boolean mHorizontalWrapVisited>
		mVerticalWrapVisited = false;
	//  114  208:aload_0         
	//  115  209:iconst_0        
	//  116  210:putfield        #647 <Field boolean mVerticalWrapVisited>
		mHorizontalChainStyle = 0;
	//  117  213:aload_0         
	//  118  214:iconst_0        
	//  119  215:putfield        #278 <Field int mHorizontalChainStyle>
		mVerticalChainStyle = 0;
	//  120  218:aload_0         
	//  121  219:iconst_0        
	//  122  220:putfield        #280 <Field int mVerticalChainStyle>
		mHorizontalChainFixedPosition = false;
	//  123  223:aload_0         
	//  124  224:iconst_0        
	//  125  225:putfield        #649 <Field boolean mHorizontalChainFixedPosition>
		mVerticalChainFixedPosition = false;
	//  126  228:aload_0         
	//  127  229:iconst_0        
	//  128  230:putfield        #651 <Field boolean mVerticalChainFixedPosition>
		float af[] = mWeight;
	//  129  233:aload_0         
	//  130  234:getfield        #283 <Field float[] mWeight>
	//  131  237:astore_2        
		af[0] = -1F;
	//  132  238:aload_2         
	//  133  239:iconst_0        
	//  134  240:ldc2            #281 <Float -1F>
	//  135  243:fastore         
		af[1] = -1F;
	//  136  244:aload_2         
	//  137  245:iconst_1        
	//  138  246:ldc2            #281 <Float -1F>
	//  139  249:fastore         
		mHorizontalResolution = -1;
	//  140  250:aload_0         
	//  141  251:iconst_m1       
	//  142  252:putfield        #144 <Field int mHorizontalResolution>
		mVerticalResolution = -1;
	//  143  255:aload_0         
	//  144  256:iconst_m1       
	//  145  257:putfield        #146 <Field int mVerticalResolution>
		af = ((float []) (mMaxDimension));
	//  146  260:aload_0         
	//  147  261:getfield        #171 <Field int[] mMaxDimension>
	//  148  264:astore_2        
		af[0] = 0x7fffffff;
	//  149  265:aload_2         
	//  150  266:iconst_0        
	//  151  267:ldc1            #169 <Int 0x7fffffff>
	//  152  269:iastore         
		af[1] = 0x7fffffff;
	//  153  270:aload_2         
	//  154  271:iconst_1        
	//  155  272:ldc1            #169 <Int 0x7fffffff>
	//  156  274:iastore         
		mMatchConstraintDefaultWidth = 0;
	//  157  275:aload_0         
	//  158  276:iconst_0        
	//  159  277:putfield        #148 <Field int mMatchConstraintDefaultWidth>
		mMatchConstraintDefaultHeight = 0;
	//  160  280:aload_0         
	//  161  281:iconst_0        
	//  162  282:putfield        #150 <Field int mMatchConstraintDefaultHeight>
		mMatchConstraintPercentWidth = 1.0F;
	//  163  285:aload_0         
	//  164  286:fconst_1        
	//  165  287:putfield        #158 <Field float mMatchConstraintPercentWidth>
		mMatchConstraintPercentHeight = 1.0F;
	//  166  290:aload_0         
	//  167  291:fconst_1        
	//  168  292:putfield        #164 <Field float mMatchConstraintPercentHeight>
		mMatchConstraintMaxWidth = 0x7fffffff;
	//  169  295:aload_0         
	//  170  296:ldc1            #169 <Int 0x7fffffff>
	//  171  298:putfield        #156 <Field int mMatchConstraintMaxWidth>
		mMatchConstraintMaxHeight = 0x7fffffff;
	//  172  301:aload_0         
	//  173  302:ldc1            #169 <Int 0x7fffffff>
	//  174  304:putfield        #162 <Field int mMatchConstraintMaxHeight>
		mMatchConstraintMinWidth = 0;
	//  175  307:aload_0         
	//  176  308:iconst_0        
	//  177  309:putfield        #154 <Field int mMatchConstraintMinWidth>
		mMatchConstraintMinHeight = 0;
	//  178  312:aload_0         
	//  179  313:iconst_0        
	//  180  314:putfield        #160 <Field int mMatchConstraintMinHeight>
		mResolvedDimensionRatioSide = -1;
	//  181  317:aload_0         
	//  182  318:iconst_m1       
	//  183  319:putfield        #166 <Field int mResolvedDimensionRatioSide>
		mResolvedDimensionRatio = 1.0F;
	//  184  322:aload_0         
	//  185  323:fconst_1        
	//  186  324:putfield        #168 <Field float mResolvedDimensionRatio>
		ResolutionDimension resolutiondimension = mResolutionWidth;
	//  187  327:aload_0         
	//  188  328:getfield        #602 <Field ResolutionDimension mResolutionWidth>
	//  189  331:astore_2        
		if(resolutiondimension != null)
	//* 190  332:aload_2         
	//* 191  333:ifnull          340
			resolutiondimension.reset();
	//  192  336:aload_2         
	//  193  337:invokevirtual   #652 <Method void ResolutionDimension.reset()>
		resolutiondimension = mResolutionHeight;
	//  194  340:aload_0         
	//  195  341:getfield        #596 <Field ResolutionDimension mResolutionHeight>
	//  196  344:astore_2        
		if(resolutiondimension != null)
	//* 197  345:aload_2         
	//* 198  346:ifnull          353
			resolutiondimension.reset();
	//  199  349:aload_2         
	//  200  350:invokevirtual   #652 <Method void ResolutionDimension.reset()>
	//  201  353:return          
	}

	public void resetAllConstraints()
	{
		resetAnchors();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #656 <Method void resetAnchors()>
		setVerticalBiasPercent(DEFAULT_BIAS);
	//    2    4:aload_0         
	//    3    5:getstatic       #264 <Field float DEFAULT_BIAS>
	//    4    8:invokevirtual   #660 <Method void setVerticalBiasPercent(float)>
		setHorizontalBiasPercent(DEFAULT_BIAS);
	//    5   11:aload_0         
	//    6   12:getstatic       #264 <Field float DEFAULT_BIAS>
	//    7   15:invokevirtual   #663 <Method void setHorizontalBiasPercent(float)>
		if(this instanceof ConstraintWidgetContainer)
	//*   8   18:aload_0         
	//*   9   19:instanceof      #418 <Class ConstraintWidgetContainer>
	//*  10   22:ifeq            26
			return;
	//   11   25:return          
		if(getHorizontalDimensionBehaviour() == DimensionBehaviour.MATCH_CONSTRAINT)
	//*  12   26:aload_0         
	//*  13   27:invokevirtual   #665 <Method ConstraintWidget$DimensionBehaviour getHorizontalDimensionBehaviour()>
	//*  14   30:getstatic       #429 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//*  15   33:if_acmpne       75
			if(getWidth() == getWrapWidth())
	//*  16   36:aload_0         
	//*  17   37:invokevirtual   #667 <Method int getWidth()>
	//*  18   40:aload_0         
	//*  19   41:invokevirtual   #669 <Method int getWrapWidth()>
	//*  20   44:icmpne          57
				setHorizontalDimensionBehaviour(DimensionBehaviour.WRAP_CONTENT);
	//   21   47:aload_0         
	//   22   48:getstatic       #413 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//   23   51:invokevirtual   #673 <Method void setHorizontalDimensionBehaviour(ConstraintWidget$DimensionBehaviour)>
			else
	//*  24   54:goto            75
			if(getWidth() > getMinWidth())
	//*  25   57:aload_0         
	//*  26   58:invokevirtual   #667 <Method int getWidth()>
	//*  27   61:aload_0         
	//*  28   62:invokevirtual   #675 <Method int getMinWidth()>
	//*  29   65:icmple          75
				setHorizontalDimensionBehaviour(DimensionBehaviour.FIXED);
	//   30   68:aload_0         
	//   31   69:getstatic       #232 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.FIXED>
	//   32   72:invokevirtual   #673 <Method void setHorizontalDimensionBehaviour(ConstraintWidget$DimensionBehaviour)>
		if(getVerticalDimensionBehaviour() == DimensionBehaviour.MATCH_CONSTRAINT)
	//*  33   75:aload_0         
	//*  34   76:invokevirtual   #677 <Method ConstraintWidget$DimensionBehaviour getVerticalDimensionBehaviour()>
	//*  35   79:getstatic       #429 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//*  36   82:if_acmpne       122
		{
			if(getHeight() == getWrapHeight())
	//*  37   85:aload_0         
	//*  38   86:invokevirtual   #679 <Method int getHeight()>
	//*  39   89:aload_0         
	//*  40   90:invokevirtual   #681 <Method int getWrapHeight()>
	//*  41   93:icmpne          104
			{
				setVerticalDimensionBehaviour(DimensionBehaviour.WRAP_CONTENT);
	//   42   96:aload_0         
	//   43   97:getstatic       #413 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//   44  100:invokevirtual   #684 <Method void setVerticalDimensionBehaviour(ConstraintWidget$DimensionBehaviour)>
				return;
	//   45  103:return          
			}
			if(getHeight() > getMinHeight())
	//*  46  104:aload_0         
	//*  47  105:invokevirtual   #679 <Method int getHeight()>
	//*  48  108:aload_0         
	//*  49  109:invokevirtual   #686 <Method int getMinHeight()>
	//*  50  112:icmple          122
				setVerticalDimensionBehaviour(DimensionBehaviour.FIXED);
	//   51  115:aload_0         
	//   52  116:getstatic       #232 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.FIXED>
	//   53  119:invokevirtual   #684 <Method void setVerticalDimensionBehaviour(ConstraintWidget$DimensionBehaviour)>
		}
	//   54  122:return          
	}

	public void resetAnchor(ConstraintAnchor constraintanchor)
	{
		if(getParent() != null && (getParent() instanceof ConstraintWidgetContainer) && ((ConstraintWidgetContainer)getParent()).handlesInternalConstraints())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #575 <Method ConstraintWidget getParent()>
	//*   2    4:ifnull          31
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #575 <Method ConstraintWidget getParent()>
	//*   5   11:instanceof      #418 <Class ConstraintWidgetContainer>
	//*   6   14:ifeq            31
	//*   7   17:aload_0         
	//*   8   18:invokevirtual   #575 <Method ConstraintWidget getParent()>
	//*   9   21:checkcast       #418 <Class ConstraintWidgetContainer>
	//*  10   24:invokevirtual   #691 <Method boolean ConstraintWidgetContainer.handlesInternalConstraints()>
	//*  11   27:ifeq            31
			return;
	//   12   30:return          
		ConstraintAnchor constraintanchor1 = getAnchor(ConstraintAnchor.Type.LEFT);
	//   13   31:aload_0         
	//   14   32:getstatic       #181 <Field ConstraintAnchor$Type ConstraintAnchor$Type.LEFT>
	//   15   35:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//   16   38:astore_2        
		ConstraintAnchor constraintanchor2 = getAnchor(ConstraintAnchor.Type.RIGHT);
	//   17   39:aload_0         
	//   18   40:getstatic       #194 <Field ConstraintAnchor$Type ConstraintAnchor$Type.RIGHT>
	//   19   43:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//   20   46:astore_3        
		ConstraintAnchor constraintanchor3 = getAnchor(ConstraintAnchor.Type.TOP);
	//   21   47:aload_0         
	//   22   48:getstatic       #189 <Field ConstraintAnchor$Type ConstraintAnchor$Type.TOP>
	//   23   51:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//   24   54:astore          4
		ConstraintAnchor constraintanchor4 = getAnchor(ConstraintAnchor.Type.BOTTOM);
	//   25   56:aload_0         
	//   26   57:getstatic       #199 <Field ConstraintAnchor$Type ConstraintAnchor$Type.BOTTOM>
	//   27   60:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//   28   63:astore          5
		ConstraintAnchor constraintanchor5 = getAnchor(ConstraintAnchor.Type.CENTER);
	//   29   65:aload_0         
	//   30   66:getstatic       #219 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER>
	//   31   69:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//   32   72:astore          6
		ConstraintAnchor constraintanchor6 = getAnchor(ConstraintAnchor.Type.CENTER_X);
	//   33   74:aload_0         
	//   34   75:getstatic       #209 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_X>
	//   35   78:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//   36   81:astore          7
		ConstraintAnchor constraintanchor7 = getAnchor(ConstraintAnchor.Type.CENTER_Y);
	//   37   83:aload_0         
	//   38   84:getstatic       #214 <Field ConstraintAnchor$Type ConstraintAnchor$Type.CENTER_Y>
	//   39   87:invokevirtual   #391 <Method ConstraintAnchor getAnchor(ConstraintAnchor$Type)>
	//   40   90:astore          8
		if(constraintanchor == constraintanchor5)
	//*  41   92:aload_1         
	//*  42   93:aload           6
	//*  43   95:if_acmpne       185
		{
			if(constraintanchor1.isConnected() && constraintanchor2.isConnected() && constraintanchor1.getTarget() == constraintanchor2.getTarget())
	//*  44   98:aload_2         
	//*  45   99:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//*  46  102:ifeq            131
	//*  47  105:aload_3         
	//*  48  106:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//*  49  109:ifeq            131
	//*  50  112:aload_2         
	//*  51  113:invokevirtual   #317 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//*  52  116:aload_3         
	//*  53  117:invokevirtual   #317 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//*  54  120:if_acmpne       131
			{
				constraintanchor1.reset();
	//   55  123:aload_2         
	//   56  124:invokevirtual   #490 <Method void ConstraintAnchor.reset()>
				constraintanchor2.reset();
	//   57  127:aload_3         
	//   58  128:invokevirtual   #490 <Method void ConstraintAnchor.reset()>
			}
			if(constraintanchor3.isConnected() && constraintanchor4.isConnected() && constraintanchor3.getTarget() == constraintanchor4.getTarget())
	//*  59  131:aload           4
	//*  60  133:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//*  61  136:ifeq            170
	//*  62  139:aload           5
	//*  63  141:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//*  64  144:ifeq            170
	//*  65  147:aload           4
	//*  66  149:invokevirtual   #317 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//*  67  152:aload           5
	//*  68  154:invokevirtual   #317 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//*  69  157:if_acmpne       170
			{
				constraintanchor3.reset();
	//   70  160:aload           4
	//   71  162:invokevirtual   #490 <Method void ConstraintAnchor.reset()>
				constraintanchor4.reset();
	//   72  165:aload           5
	//   73  167:invokevirtual   #490 <Method void ConstraintAnchor.reset()>
			}
			mHorizontalBiasPercent = 0.5F;
	//   74  170:aload_0         
	//   75  171:ldc1            #31  <Float 0.5F>
	//   76  173:putfield        #266 <Field float mHorizontalBiasPercent>
			mVerticalBiasPercent = 0.5F;
	//   77  176:aload_0         
	//   78  177:ldc1            #31  <Float 0.5F>
	//   79  179:putfield        #268 <Field float mVerticalBiasPercent>
		} else
	//*  80  182:goto            376
		if(constraintanchor == constraintanchor6)
	//*  81  185:aload_1         
	//*  82  186:aload           7
	//*  83  188:if_acmpne       239
		{
			if(constraintanchor1.isConnected() && constraintanchor2.isConnected() && constraintanchor1.getTarget().getOwner() == constraintanchor2.getTarget().getOwner())
	//*  84  191:aload_2         
	//*  85  192:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//*  86  195:ifeq            230
	//*  87  198:aload_3         
	//*  88  199:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//*  89  202:ifeq            230
	//*  90  205:aload_2         
	//*  91  206:invokevirtual   #317 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//*  92  209:invokevirtual   #446 <Method ConstraintWidget ConstraintAnchor.getOwner()>
	//*  93  212:aload_3         
	//*  94  213:invokevirtual   #317 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//*  95  216:invokevirtual   #446 <Method ConstraintWidget ConstraintAnchor.getOwner()>
	//*  96  219:if_acmpne       230
			{
				constraintanchor1.reset();
	//   97  222:aload_2         
	//   98  223:invokevirtual   #490 <Method void ConstraintAnchor.reset()>
				constraintanchor2.reset();
	//   99  226:aload_3         
	//  100  227:invokevirtual   #490 <Method void ConstraintAnchor.reset()>
			}
			mHorizontalBiasPercent = 0.5F;
	//  101  230:aload_0         
	//  102  231:ldc1            #31  <Float 0.5F>
	//  103  233:putfield        #266 <Field float mHorizontalBiasPercent>
		} else
	//* 104  236:goto            376
		if(constraintanchor == constraintanchor7)
	//* 105  239:aload_1         
	//* 106  240:aload           8
	//* 107  242:if_acmpne       299
		{
			if(constraintanchor3.isConnected() && constraintanchor4.isConnected() && constraintanchor3.getTarget().getOwner() == constraintanchor4.getTarget().getOwner())
	//* 108  245:aload           4
	//* 109  247:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//* 110  250:ifeq            290
	//* 111  253:aload           5
	//* 112  255:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//* 113  258:ifeq            290
	//* 114  261:aload           4
	//* 115  263:invokevirtual   #317 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//* 116  266:invokevirtual   #446 <Method ConstraintWidget ConstraintAnchor.getOwner()>
	//* 117  269:aload           5
	//* 118  271:invokevirtual   #317 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//* 119  274:invokevirtual   #446 <Method ConstraintWidget ConstraintAnchor.getOwner()>
	//* 120  277:if_acmpne       290
			{
				constraintanchor3.reset();
	//  121  280:aload           4
	//  122  282:invokevirtual   #490 <Method void ConstraintAnchor.reset()>
				constraintanchor4.reset();
	//  123  285:aload           5
	//  124  287:invokevirtual   #490 <Method void ConstraintAnchor.reset()>
			}
			mVerticalBiasPercent = 0.5F;
	//  125  290:aload_0         
	//  126  291:ldc1            #31  <Float 0.5F>
	//  127  293:putfield        #268 <Field float mVerticalBiasPercent>
		} else
	//* 128  296:goto            376
		if(constraintanchor != constraintanchor1 && constraintanchor != constraintanchor2)
	//* 129  299:aload_1         
	//* 130  300:aload_2         
	//* 131  301:if_acmpeq       353
	//* 132  304:aload_1         
	//* 133  305:aload_3         
	//* 134  306:if_acmpne       312
	//* 135  309:goto            353
		{
			if((constraintanchor == constraintanchor3 || constraintanchor == constraintanchor4) && constraintanchor3.isConnected() && constraintanchor3.getTarget() == constraintanchor4.getTarget())
	//* 136  312:aload_1         
	//* 137  313:aload           4
	//* 138  315:if_acmpeq       324
	//* 139  318:aload_1         
	//* 140  319:aload           5
	//* 141  321:if_acmpne       376
	//* 142  324:aload           4
	//* 143  326:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//* 144  329:ifeq            376
	//* 145  332:aload           4
	//* 146  334:invokevirtual   #317 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//* 147  337:aload           5
	//* 148  339:invokevirtual   #317 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//* 149  342:if_acmpne       376
				constraintanchor5.reset();
	//  150  345:aload           6
	//  151  347:invokevirtual   #490 <Method void ConstraintAnchor.reset()>
		} else
	//* 152  350:goto            376
		if(constraintanchor1.isConnected() && constraintanchor1.getTarget() == constraintanchor2.getTarget())
	//* 153  353:aload_2         
	//* 154  354:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//* 155  357:ifeq            376
	//* 156  360:aload_2         
	//* 157  361:invokevirtual   #317 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//* 158  364:aload_3         
	//* 159  365:invokevirtual   #317 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//* 160  368:if_acmpne       376
			constraintanchor5.reset();
	//  161  371:aload           6
	//  162  373:invokevirtual   #490 <Method void ConstraintAnchor.reset()>
		constraintanchor.reset();
	//  163  376:aload_1         
	//  164  377:invokevirtual   #490 <Method void ConstraintAnchor.reset()>
	//  165  380:return          
	}

	public void resetAnchors()
	{
		ConstraintWidget constraintwidget = getParent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #575 <Method ConstraintWidget getParent()>
	//    2    4:astore_3        
		if(constraintwidget != null && (constraintwidget instanceof ConstraintWidgetContainer) && ((ConstraintWidgetContainer)getParent()).handlesInternalConstraints())
	//*   3    5:aload_3         
	//*   4    6:ifnull          30
	//*   5    9:aload_3         
	//*   6   10:instanceof      #418 <Class ConstraintWidgetContainer>
	//*   7   13:ifeq            30
	//*   8   16:aload_0         
	//*   9   17:invokevirtual   #575 <Method ConstraintWidget getParent()>
	//*  10   20:checkcast       #418 <Class ConstraintWidgetContainer>
	//*  11   23:invokevirtual   #691 <Method boolean ConstraintWidgetContainer.handlesInternalConstraints()>
	//*  12   26:ifeq            30
			return;
	//   13   29:return          
		int i = 0;
	//   14   30:iconst_0        
	//   15   31:istore_1        
		for(int j = mAnchors.size(); i < j; i++)
	//*  16   32:aload_0         
	//*  17   33:getfield        #228 <Field ArrayList mAnchors>
	//*  18   36:invokevirtual   #520 <Method int ArrayList.size()>
	//*  19   39:istore_2        
	//*  20   40:iload_1         
	//*  21   41:iload_2         
	//*  22   42:icmpge          66
			((ConstraintAnchor)mAnchors.get(i)).reset();
	//   23   45:aload_0         
	//   24   46:getfield        #228 <Field ArrayList mAnchors>
	//   25   49:iload_1         
	//   26   50:invokevirtual   #524 <Method Object ArrayList.get(int)>
	//   27   53:checkcast       #175 <Class ConstraintAnchor>
	//   28   56:invokevirtual   #490 <Method void ConstraintAnchor.reset()>

	//   29   59:iload_1         
	//   30   60:iconst_1        
	//   31   61:iadd            
	//   32   62:istore_1        
	//*  33   63:goto            40
	//   34   66:return          
	}

	public void resetAnchors(int i)
	{
		ConstraintWidget constraintwidget = getParent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #575 <Method ConstraintWidget getParent()>
	//    2    4:astore          4
		if(constraintwidget != null && (constraintwidget instanceof ConstraintWidgetContainer) && ((ConstraintWidgetContainer)getParent()).handlesInternalConstraints())
	//*   3    6:aload           4
	//*   4    8:ifnull          33
	//*   5   11:aload           4
	//*   6   13:instanceof      #418 <Class ConstraintWidgetContainer>
	//*   7   16:ifeq            33
	//*   8   19:aload_0         
	//*   9   20:invokevirtual   #575 <Method ConstraintWidget getParent()>
	//*  10   23:checkcast       #418 <Class ConstraintWidgetContainer>
	//*  11   26:invokevirtual   #691 <Method boolean ConstraintWidgetContainer.handlesInternalConstraints()>
	//*  12   29:ifeq            33
			return;
	//   13   32:return          
		int j = 0;
	//   14   33:iconst_0        
	//   15   34:istore_2        
		for(int k = mAnchors.size(); j < k; j++)
	//*  16   35:aload_0         
	//*  17   36:getfield        #228 <Field ArrayList mAnchors>
	//*  18   39:invokevirtual   #520 <Method int ArrayList.size()>
	//*  19   42:istore_3        
	//*  20   43:iload_2         
	//*  21   44:iload_3         
	//*  22   45:icmpge          107
		{
			ConstraintAnchor constraintanchor = (ConstraintAnchor)mAnchors.get(j);
	//   23   48:aload_0         
	//   24   49:getfield        #228 <Field ArrayList mAnchors>
	//   25   52:iload_2         
	//   26   53:invokevirtual   #524 <Method Object ArrayList.get(int)>
	//   27   56:checkcast       #175 <Class ConstraintAnchor>
	//   28   59:astore          4
			if(i != constraintanchor.getConnectionCreator())
				continue;
	//   29   61:iload_1         
	//   30   62:aload           4
	//   31   64:invokevirtual   #527 <Method int ConstraintAnchor.getConnectionCreator()>
	//   32   67:icmpne          100
			if(constraintanchor.isVerticalAnchor())
	//*  33   70:aload           4
	//*  34   72:invokevirtual   #694 <Method boolean ConstraintAnchor.isVerticalAnchor()>
	//*  35   75:ifeq            88
				setVerticalBiasPercent(DEFAULT_BIAS);
	//   36   78:aload_0         
	//   37   79:getstatic       #264 <Field float DEFAULT_BIAS>
	//   38   82:invokevirtual   #660 <Method void setVerticalBiasPercent(float)>
			else
	//*  39   85:goto            95
				setHorizontalBiasPercent(DEFAULT_BIAS);
	//   40   88:aload_0         
	//   41   89:getstatic       #264 <Field float DEFAULT_BIAS>
	//   42   92:invokevirtual   #663 <Method void setHorizontalBiasPercent(float)>
			constraintanchor.reset();
	//   43   95:aload           4
	//   44   97:invokevirtual   #490 <Method void ConstraintAnchor.reset()>
		}

	//   45  100:iload_2         
	//   46  101:iconst_1        
	//   47  102:iadd            
	//   48  103:istore_2        
	//*  49  104:goto            43
	//   50  107:return          
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
	//    6    9:getfield        #223 <Field ConstraintAnchor[] mListAnchors>
	//    7   12:iload_1         
	//    8   13:aaload          
	//    9   14:invokevirtual   #324 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   10   17:invokevirtual   #696 <Method void ResolutionAnchor.reset()>

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
	//    1    1:getfield        #186 <Field ConstraintAnchor mLeft>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #701 <Method void ConstraintAnchor.resetSolverVariable(Cache)>
		mTop.resetSolverVariable(cache);
	//    4    8:aload_0         
	//    5    9:getfield        #191 <Field ConstraintAnchor mTop>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #701 <Method void ConstraintAnchor.resetSolverVariable(Cache)>
		mRight.resetSolverVariable(cache);
	//    8   16:aload_0         
	//    9   17:getfield        #196 <Field ConstraintAnchor mRight>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #701 <Method void ConstraintAnchor.resetSolverVariable(Cache)>
		mBottom.resetSolverVariable(cache);
	//   12   24:aload_0         
	//   13   25:getfield        #201 <Field ConstraintAnchor mBottom>
	//   14   28:aload_1         
	//   15   29:invokevirtual   #701 <Method void ConstraintAnchor.resetSolverVariable(Cache)>
		mBaseline.resetSolverVariable(cache);
	//   16   32:aload_0         
	//   17   33:getfield        #206 <Field ConstraintAnchor mBaseline>
	//   18   36:aload_1         
	//   19   37:invokevirtual   #701 <Method void ConstraintAnchor.resetSolverVariable(Cache)>
		mCenter.resetSolverVariable(cache);
	//   20   40:aload_0         
	//   21   41:getfield        #221 <Field ConstraintAnchor mCenter>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #701 <Method void ConstraintAnchor.resetSolverVariable(Cache)>
		mCenterX.resetSolverVariable(cache);
	//   24   48:aload_0         
	//   25   49:getfield        #211 <Field ConstraintAnchor mCenterX>
	//   26   52:aload_1         
	//   27   53:invokevirtual   #701 <Method void ConstraintAnchor.resetSolverVariable(Cache)>
		mCenterY.resetSolverVariable(cache);
	//   28   56:aload_0         
	//   29   57:getfield        #216 <Field ConstraintAnchor mCenterY>
	//   30   60:aload_1         
	//   31   61:invokevirtual   #701 <Method void ConstraintAnchor.resetSolverVariable(Cache)>
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
	//    2    2:putfield        #262 <Field int mBaselineDistance>
	//    3    5:return          
	}

	public void setCompanionWidget(Object obj)
	{
		mCompanionWidget = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #551 <Field Object mCompanionWidget>
	//    3    5:return          
	}

	public void setContainerItemSkip(int i)
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            10
		{
			mContainerItemSkip = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #270 <Field int mContainerItemSkip>
			return;
	//    5    9:return          
		} else
		{
			mContainerItemSkip = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #270 <Field int mContainerItemSkip>
			return;
	//    9   15:return          
		}
	}

	public void setDebugName(String s)
	{
		mDebugName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #274 <Field String mDebugName>
	//    3    5:return          
	}

	public void setDebugSolverName(LinearSystem linearsystem, String s)
	{
		mDebugName = s;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #274 <Field String mDebugName>
		Object obj2 = ((Object) (linearsystem.createObjectVariable(((Object) (mLeft)))));
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #186 <Field ConstraintAnchor mLeft>
	//    6   10:invokevirtual   #313 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//    7   13:astore          6
		Object obj1 = ((Object) (linearsystem.createObjectVariable(((Object) (mTop)))));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #191 <Field ConstraintAnchor mTop>
	//   11   20:invokevirtual   #313 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//   12   23:astore          5
		Object obj = ((Object) (linearsystem.createObjectVariable(((Object) (mRight)))));
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #196 <Field ConstraintAnchor mRight>
	//   16   30:invokevirtual   #313 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//   17   33:astore          4
		SolverVariable solvervariable = linearsystem.createObjectVariable(((Object) (mBottom)));
	//   18   35:aload_1         
	//   19   36:aload_0         
	//   20   37:getfield        #201 <Field ConstraintAnchor mBottom>
	//   21   40:invokevirtual   #313 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//   22   43:astore_3        
		StringBuilder stringbuilder1 = new StringBuilder();
	//   23   44:new             #711 <Class StringBuilder>
	//   24   47:dup             
	//   25   48:invokespecial   #712 <Method void StringBuilder()>
	//   26   51:astore          7
		stringbuilder1.append(s);
	//   27   53:aload           7
	//   28   55:aload_2         
	//   29   56:invokevirtual   #716 <Method StringBuilder StringBuilder.append(String)>
	//   30   59:pop             
		stringbuilder1.append(".left");
	//   31   60:aload           7
	//   32   62:ldc2            #718 <String ".left">
	//   33   65:invokevirtual   #716 <Method StringBuilder StringBuilder.append(String)>
	//   34   68:pop             
		((SolverVariable) (obj2)).setName(stringbuilder1.toString());
	//   35   69:aload           6
	//   36   71:aload           7
	//   37   73:invokevirtual   #721 <Method String StringBuilder.toString()>
	//   38   76:invokevirtual   #726 <Method void SolverVariable.setName(String)>
		obj2 = ((Object) (new StringBuilder()));
	//   39   79:new             #711 <Class StringBuilder>
	//   40   82:dup             
	//   41   83:invokespecial   #712 <Method void StringBuilder()>
	//   42   86:astore          6
		((StringBuilder) (obj2)).append(s);
	//   43   88:aload           6
	//   44   90:aload_2         
	//   45   91:invokevirtual   #716 <Method StringBuilder StringBuilder.append(String)>
	//   46   94:pop             
		((StringBuilder) (obj2)).append(".top");
	//   47   95:aload           6
	//   48   97:ldc2            #728 <String ".top">
	//   49  100:invokevirtual   #716 <Method StringBuilder StringBuilder.append(String)>
	//   50  103:pop             
		((SolverVariable) (obj1)).setName(((StringBuilder) (obj2)).toString());
	//   51  104:aload           5
	//   52  106:aload           6
	//   53  108:invokevirtual   #721 <Method String StringBuilder.toString()>
	//   54  111:invokevirtual   #726 <Method void SolverVariable.setName(String)>
		obj1 = ((Object) (new StringBuilder()));
	//   55  114:new             #711 <Class StringBuilder>
	//   56  117:dup             
	//   57  118:invokespecial   #712 <Method void StringBuilder()>
	//   58  121:astore          5
		((StringBuilder) (obj1)).append(s);
	//   59  123:aload           5
	//   60  125:aload_2         
	//   61  126:invokevirtual   #716 <Method StringBuilder StringBuilder.append(String)>
	//   62  129:pop             
		((StringBuilder) (obj1)).append(".right");
	//   63  130:aload           5
	//   64  132:ldc2            #730 <String ".right">
	//   65  135:invokevirtual   #716 <Method StringBuilder StringBuilder.append(String)>
	//   66  138:pop             
		((SolverVariable) (obj)).setName(((StringBuilder) (obj1)).toString());
	//   67  139:aload           4
	//   68  141:aload           5
	//   69  143:invokevirtual   #721 <Method String StringBuilder.toString()>
	//   70  146:invokevirtual   #726 <Method void SolverVariable.setName(String)>
		obj = ((Object) (new StringBuilder()));
	//   71  149:new             #711 <Class StringBuilder>
	//   72  152:dup             
	//   73  153:invokespecial   #712 <Method void StringBuilder()>
	//   74  156:astore          4
		((StringBuilder) (obj)).append(s);
	//   75  158:aload           4
	//   76  160:aload_2         
	//   77  161:invokevirtual   #716 <Method StringBuilder StringBuilder.append(String)>
	//   78  164:pop             
		((StringBuilder) (obj)).append(".bottom");
	//   79  165:aload           4
	//   80  167:ldc2            #732 <String ".bottom">
	//   81  170:invokevirtual   #716 <Method StringBuilder StringBuilder.append(String)>
	//   82  173:pop             
		solvervariable.setName(((StringBuilder) (obj)).toString());
	//   83  174:aload_3         
	//   84  175:aload           4
	//   85  177:invokevirtual   #721 <Method String StringBuilder.toString()>
	//   86  180:invokevirtual   #726 <Method void SolverVariable.setName(String)>
		if(mBaselineDistance > 0)
	//*  87  183:aload_0         
	//*  88  184:getfield        #262 <Field int mBaselineDistance>
	//*  89  187:ifle            229
		{
			linearsystem = ((LinearSystem) (linearsystem.createObjectVariable(((Object) (mBaseline)))));
	//   90  190:aload_1         
	//   91  191:aload_0         
	//   92  192:getfield        #206 <Field ConstraintAnchor mBaseline>
	//   93  195:invokevirtual   #313 <Method SolverVariable LinearSystem.createObjectVariable(Object)>
	//   94  198:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   95  199:new             #711 <Class StringBuilder>
	//   96  202:dup             
	//   97  203:invokespecial   #712 <Method void StringBuilder()>
	//   98  206:astore_3        
			stringbuilder.append(s);
	//   99  207:aload_3         
	//  100  208:aload_2         
	//  101  209:invokevirtual   #716 <Method StringBuilder StringBuilder.append(String)>
	//  102  212:pop             
			stringbuilder.append(".baseline");
	//  103  213:aload_3         
	//  104  214:ldc2            #734 <String ".baseline">
	//  105  217:invokevirtual   #716 <Method StringBuilder StringBuilder.append(String)>
	//  106  220:pop             
			((SolverVariable) (linearsystem)).setName(stringbuilder.toString());
	//  107  221:aload_1         
	//  108  222:aload_3         
	//  109  223:invokevirtual   #721 <Method String StringBuilder.toString()>
	//  110  226:invokevirtual   #726 <Method void SolverVariable.setName(String)>
		}
	//  111  229:return          
	}

	public void setDimension(int i, int j)
	{
		mWidth = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #238 <Field int mWidth>
		i = mWidth;
	//    3    5:aload_0         
	//    4    6:getfield        #238 <Field int mWidth>
	//    5    9:istore_1        
		int k = mMinWidth;
	//    6   10:aload_0         
	//    7   11:getfield        #424 <Field int mMinWidth>
	//    8   14:istore_3        
		if(i < k)
	//*   9   15:iload_1         
	//*  10   16:iload_3         
	//*  11   17:icmpge          25
			mWidth = k;
	//   12   20:aload_0         
	//   13   21:iload_3         
	//   14   22:putfield        #238 <Field int mWidth>
		mHeight = j;
	//   15   25:aload_0         
	//   16   26:iload_2         
	//   17   27:putfield        #240 <Field int mHeight>
		i = mHeight;
	//   18   30:aload_0         
	//   19   31:getfield        #240 <Field int mHeight>
	//   20   34:istore_1        
		j = mMinHeight;
	//   21   35:aload_0         
	//   22   36:getfield        #426 <Field int mMinHeight>
	//   23   39:istore_2        
		if(i < j)
	//*  24   40:iload_1         
	//*  25   41:iload_2         
	//*  26   42:icmpge          50
			mHeight = j;
	//   27   45:aload_0         
	//   28   46:iload_2         
	//   29   47:putfield        #240 <Field int mHeight>
	//   30   50:return          
	}

	public void setDimensionRatio(float f, int i)
	{
		mDimensionRatio = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #242 <Field float mDimensionRatio>
		mDimensionRatioSide = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #244 <Field int mDimensionRatioSide>
	//    6   10:return          
	}

	public void setDimensionRatio(String s)
	{
		if(s != null && s.length() != 0) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnull          271
	//    2    4:aload_1         
	//    3    5:invokevirtual   #744 <Method int String.length()>
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
	//    9   18:invokevirtual   #744 <Method int String.length()>
	//   10   21:istore          8
		int i1 = s.indexOf(',');
	//   11   23:aload_1         
	//   12   24:bipush          44
	//   13   26:invokevirtual   #748 <Method int String.indexOf(int)>
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
	//   35   68:invokevirtual   #752 <Method String String.substring(int, int)>
	//   36   71:astore          10
				if(s1.equalsIgnoreCase("W"))
	//*  37   73:aload           10
	//*  38   75:ldc2            #754 <String "W">
	//*  39   78:invokevirtual   #758 <Method boolean String.equalsIgnoreCase(String)>
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
	//*  47   96:ldc2            #760 <String "H">
	//*  48   99:invokevirtual   #758 <Method boolean String.equalsIgnoreCase(String)>
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
	//   58  117:invokevirtual   #748 <Method int String.indexOf(int)>
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
	//   70  141:invokevirtual   #752 <Method String String.substring(int, int)>
	//   71  144:astore          10
		s = s.substring(k + 1);
	//   72  146:aload_1         
	//   73  147:iload           6
	//   74  149:iconst_1        
	//   75  150:iadd            
	//   76  151:invokevirtual   #763 <Method String String.substring(int)>
	//   77  154:astore_1        
		if(s2.length() <= 0 || s.length() <= 0) goto _L6; else goto _L5
	//   78  155:aload           10
	//   79  157:invokevirtual   #744 <Method int String.length()>
	//   80  160:ifle            224
	//   81  163:aload_1         
	//   82  164:invokevirtual   #744 <Method int String.length()>
	//   83  167:ifle            224
_L5:
		float f;
		float f1;
		f = Float.parseFloat(s2);
	//   84  170:aload           10
	//   85  172:invokestatic    #769 <Method float Float.parseFloat(String)>
	//   86  175:fstore_2        
		f1 = Float.parseFloat(s);
	//   87  176:aload_1         
	//   88  177:invokestatic    #769 <Method float Float.parseFloat(String)>
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
	//  104  202:invokestatic    #773 <Method float Math.abs(float)>
	//  105  205:fstore_2        
		  goto _L11
	//* 106  206:goto            253
_L10:
		f = Math.abs(f / f1);
	//  107  209:fload_2         
	//  108  210:fload_3         
	//  109  211:fdiv            
	//  110  212:invokestatic    #773 <Method float Math.abs(float)>
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
	//  121  232:invokevirtual   #763 <Method String String.substring(int)>
	//  122  235:astore_1        
		if(s.length() <= 0) goto _L13; else goto _L12
	//  123  236:aload_1         
	//  124  237:invokevirtual   #744 <Method int String.length()>
	//  125  240:ifle            251
_L12:
		f = Float.parseFloat(s);
	//  126  243:aload_1         
	//  127  244:invokestatic    #769 <Method float Float.parseFloat(String)>
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
	//  138  261:putfield        #242 <Field float mDimensionRatio>
			mDimensionRatioSide = i;
	//  139  264:aload_0         
	//  140  265:iload           4
	//  141  267:putfield        #244 <Field int mDimensionRatioSide>
		}
		return;
	//  142  270:return          
_L1:
		mDimensionRatio = 0.0F;
	//  143  271:aload_0         
	//  144  272:fconst_0        
	//  145  273:putfield        #242 <Field float mDimensionRatio>
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

	public void setDrawHeight(int i)
	{
		mDrawHeight = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #256 <Field int mDrawHeight>
	//    3    5:return          
	}

	public void setDrawOrigin(int i, int j)
	{
		mDrawX = i - mOffsetX;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #258 <Field int mOffsetX>
	//    4    6:isub            
	//    5    7:putfield        #250 <Field int mDrawX>
		mDrawY = j - mOffsetY;
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:aload_0         
	//    9   13:getfield        #260 <Field int mOffsetY>
	//   10   16:isub            
	//   11   17:putfield        #252 <Field int mDrawY>
		mX = mDrawX;
	//   12   20:aload_0         
	//   13   21:aload_0         
	//   14   22:getfield        #250 <Field int mDrawX>
	//   15   25:putfield        #246 <Field int mX>
		mY = mDrawY;
	//   16   28:aload_0         
	//   17   29:aload_0         
	//   18   30:getfield        #252 <Field int mDrawY>
	//   19   33:putfield        #248 <Field int mY>
	//   20   36:return          
	}

	public void setDrawWidth(int i)
	{
		mDrawWidth = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #254 <Field int mDrawWidth>
	//    3    5:return          
	}

	public void setDrawX(int i)
	{
		mDrawX = i - mOffsetX;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #258 <Field int mOffsetX>
	//    4    6:isub            
	//    5    7:putfield        #250 <Field int mDrawX>
		mX = mDrawX;
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #250 <Field int mDrawX>
	//    9   15:putfield        #246 <Field int mX>
	//   10   18:return          
	}

	public void setDrawY(int i)
	{
		mDrawY = i - mOffsetY;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #260 <Field int mOffsetY>
	//    4    6:isub            
	//    5    7:putfield        #252 <Field int mDrawY>
		mY = mDrawY;
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #252 <Field int mDrawY>
	//    9   15:putfield        #248 <Field int mY>
	//   10   18:return          
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
	//   10   12:putfield        #246 <Field int mX>
			mY = j;
	//   11   15:aload_0         
	//   12   16:iload_2         
	//   13   17:putfield        #248 <Field int mY>
			if(mVisibility == 8)
	//*  14   20:aload_0         
	//*  15   21:getfield        #272 <Field int mVisibility>
	//*  16   24:bipush          8
	//*  17   26:icmpne          40
			{
				mWidth = 0;
	//   18   29:aload_0         
	//   19   30:iconst_0        
	//   20   31:putfield        #238 <Field int mWidth>
				mHeight = 0;
	//   21   34:aload_0         
	//   22   35:iconst_0        
	//   23   36:putfield        #240 <Field int mHeight>
				return;
	//   24   39:return          
			}
			if(mListDimensionBehaviors[0] == DimensionBehaviour.FIXED)
	//*  25   40:aload_0         
	//*  26   41:getfield        #234 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//*  27   44:iconst_0        
	//*  28   45:aaload          
	//*  29   46:getstatic       #232 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.FIXED>
	//*  30   49:if_acmpne       66
			{
				i = mWidth;
	//   31   52:aload_0         
	//   32   53:getfield        #238 <Field int mWidth>
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
	//*  41   70:getfield        #234 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//*  42   73:iconst_1        
	//*  43   74:aaload          
	//*  44   75:getstatic       #232 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.FIXED>
	//*  45   78:if_acmpne       94
			{
				j = mHeight;
	//   46   81:aload_0         
	//   47   82:getfield        #240 <Field int mHeight>
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
	//   57   98:putfield        #238 <Field int mWidth>
		mHeight = j;
	//   58  101:aload_0         
	//   59  102:iload_2         
	//   60  103:putfield        #240 <Field int mHeight>
		i = mHeight;
	//   61  106:aload_0         
	//   62  107:getfield        #240 <Field int mHeight>
	//   63  110:istore_1        
		j = mMinHeight;
	//   64  111:aload_0         
	//   65  112:getfield        #426 <Field int mMinHeight>
	//   66  115:istore_2        
		if(i < j)
	//*  67  116:iload_1         
	//*  68  117:iload_2         
	//*  69  118:icmpge          126
			mHeight = j;
	//   70  121:aload_0         
	//   71  122:iload_2         
	//   72  123:putfield        #240 <Field int mHeight>
		i = mWidth;
	//   73  126:aload_0         
	//   74  127:getfield        #238 <Field int mWidth>
	//   75  130:istore_1        
		j = mMinWidth;
	//   76  131:aload_0         
	//   77  132:getfield        #424 <Field int mMinWidth>
	//   78  135:istore_2        
		if(i < j)
	//*  79  136:iload_1         
	//*  80  137:iload_2         
	//*  81  138:icmpge          146
			mWidth = j;
	//   82  141:aload_0         
	//   83  142:iload_2         
	//   84  143:putfield        #238 <Field int mWidth>
	//   85  146:return          
	}

	public void setGoneMargin(ConstraintAnchor.Type type, int i)
	{
		switch(_cls1..SwitchMap.android.support.constraint.solver.widgets.ConstraintAnchor.Type[type.ordinal()])
	//*   0    0:getstatic       #531 <Field int[] ConstraintWidget$1.$SwitchMap$android$support$constraint$solver$widgets$ConstraintAnchor$Type>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #532 <Method int ConstraintAnchor$Type.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 4: default 40
	//	               1 68
	//	               2 59
	//	               3 50
	//	               4 41
		default:
			return;
	//    5   40:return          

		case 4: // '\004'
			mBottom.mGoneMargin = i;
	//    6   41:aload_0         
	//    7   42:getfield        #201 <Field ConstraintAnchor mBottom>
	//    8   45:iload_2         
	//    9   46:putfield        #784 <Field int ConstraintAnchor.mGoneMargin>
			return;
	//   10   49:return          

		case 3: // '\003'
			mRight.mGoneMargin = i;
	//   11   50:aload_0         
	//   12   51:getfield        #196 <Field ConstraintAnchor mRight>
	//   13   54:iload_2         
	//   14   55:putfield        #784 <Field int ConstraintAnchor.mGoneMargin>
			return;
	//   15   58:return          

		case 2: // '\002'
			mTop.mGoneMargin = i;
	//   16   59:aload_0         
	//   17   60:getfield        #191 <Field ConstraintAnchor mTop>
	//   18   63:iload_2         
	//   19   64:putfield        #784 <Field int ConstraintAnchor.mGoneMargin>
			return;
	//   20   67:return          

		case 1: // '\001'
			mLeft.mGoneMargin = i;
	//   21   68:aload_0         
	//   22   69:getfield        #186 <Field ConstraintAnchor mLeft>
	//   23   72:iload_2         
	//   24   73:putfield        #784 <Field int ConstraintAnchor.mGoneMargin>
			return;
	//   25   76:return          
		}
	}

	public void setHeight(int i)
	{
		mHeight = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #240 <Field int mHeight>
		i = mHeight;
	//    3    5:aload_0         
	//    4    6:getfield        #240 <Field int mHeight>
	//    5    9:istore_1        
		int j = mMinHeight;
	//    6   10:aload_0         
	//    7   11:getfield        #426 <Field int mMinHeight>
	//    8   14:istore_2        
		if(i < j)
	//*   9   15:iload_1         
	//*  10   16:iload_2         
	//*  11   17:icmpge          25
			mHeight = j;
	//   12   20:aload_0         
	//   13   21:iload_2         
	//   14   22:putfield        #240 <Field int mHeight>
	//   15   25:return          
	}

	public void setHeightWrapContent(boolean flag)
	{
		mIsHeightWrapContent = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #635 <Field boolean mIsHeightWrapContent>
	//    3    5:return          
	}

	public void setHorizontalBiasPercent(float f)
	{
		mHorizontalBiasPercent = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #266 <Field float mHorizontalBiasPercent>
	//    3    5:return          
	}

	public void setHorizontalChainStyle(int i)
	{
		mHorizontalChainStyle = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #278 <Field int mHorizontalChainStyle>
	//    3    5:return          
	}

	public void setHorizontalDimension(int i, int j)
	{
		mX = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #246 <Field int mX>
		mWidth = j - i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:iload_1         
	//    6    8:isub            
	//    7    9:putfield        #238 <Field int mWidth>
		i = mWidth;
	//    8   12:aload_0         
	//    9   13:getfield        #238 <Field int mWidth>
	//   10   16:istore_1        
		j = mMinWidth;
	//   11   17:aload_0         
	//   12   18:getfield        #424 <Field int mMinWidth>
	//   13   21:istore_2        
		if(i < j)
	//*  14   22:iload_1         
	//*  15   23:iload_2         
	//*  16   24:icmpge          32
			mWidth = j;
	//   17   27:aload_0         
	//   18   28:iload_2         
	//   19   29:putfield        #238 <Field int mWidth>
	//   20   32:return          
	}

	public void setHorizontalDimensionBehaviour(DimensionBehaviour dimensionbehaviour)
	{
		mListDimensionBehaviors[0] = dimensionbehaviour;
	//    0    0:aload_0         
	//    1    1:getfield        #234 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//    2    4:iconst_0        
	//    3    5:aload_1         
	//    4    6:aastore         
		if(dimensionbehaviour == DimensionBehaviour.WRAP_CONTENT)
	//*   5    7:aload_1         
	//*   6    8:getstatic       #413 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//*   7   11:if_acmpne       22
			setWidth(mWrapWidth);
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #625 <Field int mWrapWidth>
	//   11   19:invokevirtual   #792 <Method void setWidth(int)>
	//   12   22:return          
	}

	public void setHorizontalMatchStyle(int i, int j, int k, float f)
	{
		mMatchConstraintDefaultWidth = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #148 <Field int mMatchConstraintDefaultWidth>
		mMatchConstraintMinWidth = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #154 <Field int mMatchConstraintMinWidth>
		mMatchConstraintMaxWidth = k;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #156 <Field int mMatchConstraintMaxWidth>
		mMatchConstraintPercentWidth = f;
	//    9   15:aload_0         
	//   10   16:fload           4
	//   11   18:putfield        #158 <Field float mMatchConstraintPercentWidth>
		if(f < 1.0F && mMatchConstraintDefaultWidth == 0)
	//*  12   21:fload           4
	//*  13   23:fconst_1        
	//*  14   24:fcmpg           
	//*  15   25:ifge            40
	//*  16   28:aload_0         
	//*  17   29:getfield        #148 <Field int mMatchConstraintDefaultWidth>
	//*  18   32:ifne            40
			mMatchConstraintDefaultWidth = 2;
	//   19   35:aload_0         
	//   20   36:iconst_2        
	//   21   37:putfield        #148 <Field int mMatchConstraintDefaultWidth>
	//   22   40:return          
	}

	public void setHorizontalWeight(float f)
	{
		mWeight[0] = f;
	//    0    0:aload_0         
	//    1    1:getfield        #283 <Field float[] mWeight>
	//    2    4:iconst_0        
	//    3    5:fload_1         
	//    4    6:fastore         
	//    5    7:return          
	}

	public void setMaxHeight(int i)
	{
		mMaxDimension[1] = i;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field int[] mMaxDimension>
	//    2    4:iconst_1        
	//    3    5:iload_1         
	//    4    6:iastore         
	//    5    7:return          
	}

	public void setMaxWidth(int i)
	{
		mMaxDimension[0] = i;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field int[] mMaxDimension>
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
	//    4    6:putfield        #426 <Field int mMinHeight>
			return;
	//    5    9:return          
		} else
		{
			mMinHeight = i;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:putfield        #426 <Field int mMinHeight>
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
	//    4    6:putfield        #424 <Field int mMinWidth>
			return;
	//    5    9:return          
		} else
		{
			mMinWidth = i;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:putfield        #424 <Field int mMinWidth>
			return;
	//    9   15:return          
		}
	}

	public void setOffset(int i, int j)
	{
		mOffsetX = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #258 <Field int mOffsetX>
		mOffsetY = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #260 <Field int mOffsetY>
	//    6   10:return          
	}

	public void setOrigin(int i, int j)
	{
		mX = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #246 <Field int mX>
		mY = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #248 <Field int mY>
	//    6   10:return          
	}

	public void setParent(ConstraintWidget constraintwidget)
	{
		mParent = constraintwidget;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #236 <Field ConstraintWidget mParent>
	//    3    5:return          
	}

	public void setType(String s)
	{
		mType = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #276 <Field String mType>
	//    3    5:return          
	}

	public void setVerticalBiasPercent(float f)
	{
		mVerticalBiasPercent = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #268 <Field float mVerticalBiasPercent>
	//    3    5:return          
	}

	public void setVerticalChainStyle(int i)
	{
		mVerticalChainStyle = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #280 <Field int mVerticalChainStyle>
	//    3    5:return          
	}

	public void setVerticalDimension(int i, int j)
	{
		mY = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #248 <Field int mY>
		mHeight = j - i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:iload_1         
	//    6    8:isub            
	//    7    9:putfield        #240 <Field int mHeight>
		i = mHeight;
	//    8   12:aload_0         
	//    9   13:getfield        #240 <Field int mHeight>
	//   10   16:istore_1        
		j = mMinHeight;
	//   11   17:aload_0         
	//   12   18:getfield        #426 <Field int mMinHeight>
	//   13   21:istore_2        
		if(i < j)
	//*  14   22:iload_1         
	//*  15   23:iload_2         
	//*  16   24:icmpge          32
			mHeight = j;
	//   17   27:aload_0         
	//   18   28:iload_2         
	//   19   29:putfield        #240 <Field int mHeight>
	//   20   32:return          
	}

	public void setVerticalDimensionBehaviour(DimensionBehaviour dimensionbehaviour)
	{
		mListDimensionBehaviors[1] = dimensionbehaviour;
	//    0    0:aload_0         
	//    1    1:getfield        #234 <Field ConstraintWidget$DimensionBehaviour[] mListDimensionBehaviors>
	//    2    4:iconst_1        
	//    3    5:aload_1         
	//    4    6:aastore         
		if(dimensionbehaviour == DimensionBehaviour.WRAP_CONTENT)
	//*   5    7:aload_1         
	//*   6    8:getstatic       #413 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//*   7   11:if_acmpne       22
			setHeight(mWrapHeight);
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #622 <Field int mWrapHeight>
	//   11   19:invokevirtual   #807 <Method void setHeight(int)>
	//   12   22:return          
	}

	public void setVerticalMatchStyle(int i, int j, int k, float f)
	{
		mMatchConstraintDefaultHeight = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #150 <Field int mMatchConstraintDefaultHeight>
		mMatchConstraintMinHeight = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #160 <Field int mMatchConstraintMinHeight>
		mMatchConstraintMaxHeight = k;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #162 <Field int mMatchConstraintMaxHeight>
		mMatchConstraintPercentHeight = f;
	//    9   15:aload_0         
	//   10   16:fload           4
	//   11   18:putfield        #164 <Field float mMatchConstraintPercentHeight>
		if(f < 1.0F && mMatchConstraintDefaultHeight == 0)
	//*  12   21:fload           4
	//*  13   23:fconst_1        
	//*  14   24:fcmpg           
	//*  15   25:ifge            40
	//*  16   28:aload_0         
	//*  17   29:getfield        #150 <Field int mMatchConstraintDefaultHeight>
	//*  18   32:ifne            40
			mMatchConstraintDefaultHeight = 2;
	//   19   35:aload_0         
	//   20   36:iconst_2        
	//   21   37:putfield        #150 <Field int mMatchConstraintDefaultHeight>
	//   22   40:return          
	}

	public void setVerticalWeight(float f)
	{
		mWeight[1] = f;
	//    0    0:aload_0         
	//    1    1:getfield        #283 <Field float[] mWeight>
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
	//    2    2:putfield        #272 <Field int mVisibility>
	//    3    5:return          
	}

	public void setWidth(int i)
	{
		mWidth = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #238 <Field int mWidth>
		i = mWidth;
	//    3    5:aload_0         
	//    4    6:getfield        #238 <Field int mWidth>
	//    5    9:istore_1        
		int j = mMinWidth;
	//    6   10:aload_0         
	//    7   11:getfield        #424 <Field int mMinWidth>
	//    8   14:istore_2        
		if(i < j)
	//*   9   15:iload_1         
	//*  10   16:iload_2         
	//*  11   17:icmpge          25
			mWidth = j;
	//   12   20:aload_0         
	//   13   21:iload_2         
	//   14   22:putfield        #238 <Field int mWidth>
	//   15   25:return          
	}

	public void setWidthWrapContent(boolean flag)
	{
		mIsWidthWrapContent = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #643 <Field boolean mIsWidthWrapContent>
	//    3    5:return          
	}

	public void setWrapHeight(int i)
	{
		mWrapHeight = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #622 <Field int mWrapHeight>
	//    3    5:return          
	}

	public void setWrapWidth(int i)
	{
		mWrapWidth = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #625 <Field int mWrapWidth>
	//    3    5:return          
	}

	public void setX(int i)
	{
		mX = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #246 <Field int mX>
	//    3    5:return          
	}

	public void setY(int i)
	{
		mY = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #248 <Field int mY>
	//    3    5:return          
	}

	public void setupDimensionRatio(boolean flag, boolean flag1, boolean flag2, boolean flag3)
	{
		if(mResolvedDimensionRatioSide == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #166 <Field int mResolvedDimensionRatioSide>
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
	//   10   19:putfield        #166 <Field int mResolvedDimensionRatioSide>
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
	//   18   36:putfield        #166 <Field int mResolvedDimensionRatioSide>
				if(mDimensionRatioSide == -1)
	//*  19   39:aload_0         
	//*  20   40:getfield        #244 <Field int mDimensionRatioSide>
	//*  21   43:iconst_m1       
	//*  22   44:icmpne          57
					mResolvedDimensionRatio = 1.0F / mResolvedDimensionRatio;
	//   23   47:aload_0         
	//   24   48:fconst_1        
	//   25   49:aload_0         
	//   26   50:getfield        #168 <Field float mResolvedDimensionRatio>
	//   27   53:fdiv            
	//   28   54:putfield        #168 <Field float mResolvedDimensionRatio>
			}
		if(mResolvedDimensionRatioSide == 0 && (!mTop.isConnected() || !mBottom.isConnected()))
	//*  29   57:aload_0         
	//*  30   58:getfield        #166 <Field int mResolvedDimensionRatioSide>
	//*  31   61:ifne            92
	//*  32   64:aload_0         
	//*  33   65:getfield        #191 <Field ConstraintAnchor mTop>
	//*  34   68:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//*  35   71:ifeq            84
	//*  36   74:aload_0         
	//*  37   75:getfield        #201 <Field ConstraintAnchor mBottom>
	//*  38   78:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//*  39   81:ifne            92
			mResolvedDimensionRatioSide = 1;
	//   40   84:aload_0         
	//   41   85:iconst_1        
	//   42   86:putfield        #166 <Field int mResolvedDimensionRatioSide>
		else
	//*  43   89:goto            125
		if(mResolvedDimensionRatioSide == 1 && (!mLeft.isConnected() || !mRight.isConnected()))
	//*  44   92:aload_0         
	//*  45   93:getfield        #166 <Field int mResolvedDimensionRatioSide>
	//*  46   96:iconst_1        
	//*  47   97:icmpne          125
	//*  48  100:aload_0         
	//*  49  101:getfield        #186 <Field ConstraintAnchor mLeft>
	//*  50  104:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//*  51  107:ifeq            120
	//*  52  110:aload_0         
	//*  53  111:getfield        #196 <Field ConstraintAnchor mRight>
	//*  54  114:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//*  55  117:ifne            125
			mResolvedDimensionRatioSide = 0;
	//   56  120:aload_0         
	//   57  121:iconst_0        
	//   58  122:putfield        #166 <Field int mResolvedDimensionRatioSide>
		if(mResolvedDimensionRatioSide == -1 && (!mTop.isConnected() || !mBottom.isConnected() || !mLeft.isConnected() || !mRight.isConnected()))
	//*  59  125:aload_0         
	//*  60  126:getfield        #166 <Field int mResolvedDimensionRatioSide>
	//*  61  129:iconst_m1       
	//*  62  130:icmpne          236
	//*  63  133:aload_0         
	//*  64  134:getfield        #191 <Field ConstraintAnchor mTop>
	//*  65  137:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//*  66  140:ifeq            173
	//*  67  143:aload_0         
	//*  68  144:getfield        #201 <Field ConstraintAnchor mBottom>
	//*  69  147:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//*  70  150:ifeq            173
	//*  71  153:aload_0         
	//*  72  154:getfield        #186 <Field ConstraintAnchor mLeft>
	//*  73  157:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//*  74  160:ifeq            173
	//*  75  163:aload_0         
	//*  76  164:getfield        #196 <Field ConstraintAnchor mRight>
	//*  77  167:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//*  78  170:ifne            236
			if(mTop.isConnected() && mBottom.isConnected())
	//*  79  173:aload_0         
	//*  80  174:getfield        #191 <Field ConstraintAnchor mTop>
	//*  81  177:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//*  82  180:ifeq            201
	//*  83  183:aload_0         
	//*  84  184:getfield        #201 <Field ConstraintAnchor mBottom>
	//*  85  187:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//*  86  190:ifeq            201
				mResolvedDimensionRatioSide = 0;
	//   87  193:aload_0         
	//   88  194:iconst_0        
	//   89  195:putfield        #166 <Field int mResolvedDimensionRatioSide>
			else
	//*  90  198:goto            236
			if(mLeft.isConnected() && mRight.isConnected())
	//*  91  201:aload_0         
	//*  92  202:getfield        #186 <Field ConstraintAnchor mLeft>
	//*  93  205:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//*  94  208:ifeq            236
	//*  95  211:aload_0         
	//*  96  212:getfield        #196 <Field ConstraintAnchor mRight>
	//*  97  215:invokevirtual   #354 <Method boolean ConstraintAnchor.isConnected()>
	//*  98  218:ifeq            236
			{
				mResolvedDimensionRatio = 1.0F / mResolvedDimensionRatio;
	//   99  221:aload_0         
	//  100  222:fconst_1        
	//  101  223:aload_0         
	//  102  224:getfield        #168 <Field float mResolvedDimensionRatio>
	//  103  227:fdiv            
	//  104  228:putfield        #168 <Field float mResolvedDimensionRatio>
				mResolvedDimensionRatioSide = 1;
	//  105  231:aload_0         
	//  106  232:iconst_1        
	//  107  233:putfield        #166 <Field int mResolvedDimensionRatioSide>
			}
		if(mResolvedDimensionRatioSide == -1)
	//* 108  236:aload_0         
	//* 109  237:getfield        #166 <Field int mResolvedDimensionRatioSide>
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
	//  118  254:putfield        #166 <Field int mResolvedDimensionRatioSide>
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
	//  127  271:getfield        #168 <Field float mResolvedDimensionRatio>
	//  128  274:fdiv            
	//  129  275:putfield        #168 <Field float mResolvedDimensionRatio>
				mResolvedDimensionRatioSide = 1;
	//  130  278:aload_0         
	//  131  279:iconst_1        
	//  132  280:putfield        #166 <Field int mResolvedDimensionRatioSide>
			}
		if(mResolvedDimensionRatioSide == -1)
	//* 133  283:aload_0         
	//* 134  284:getfield        #166 <Field int mResolvedDimensionRatioSide>
	//* 135  287:iconst_m1       
	//* 136  288:icmpne          342
			if(mMatchConstraintMinWidth > 0 && mMatchConstraintMinHeight == 0)
	//* 137  291:aload_0         
	//* 138  292:getfield        #154 <Field int mMatchConstraintMinWidth>
	//* 139  295:ifle            313
	//* 140  298:aload_0         
	//* 141  299:getfield        #160 <Field int mMatchConstraintMinHeight>
	//* 142  302:ifne            313
				mResolvedDimensionRatioSide = 0;
	//  143  305:aload_0         
	//  144  306:iconst_0        
	//  145  307:putfield        #166 <Field int mResolvedDimensionRatioSide>
			else
	//* 146  310:goto            342
			if(mMatchConstraintMinWidth == 0 && mMatchConstraintMinHeight > 0)
	//* 147  313:aload_0         
	//* 148  314:getfield        #154 <Field int mMatchConstraintMinWidth>
	//* 149  317:ifne            342
	//* 150  320:aload_0         
	//* 151  321:getfield        #160 <Field int mMatchConstraintMinHeight>
	//* 152  324:ifle            342
			{
				mResolvedDimensionRatio = 1.0F / mResolvedDimensionRatio;
	//  153  327:aload_0         
	//  154  328:fconst_1        
	//  155  329:aload_0         
	//  156  330:getfield        #168 <Field float mResolvedDimensionRatio>
	//  157  333:fdiv            
	//  158  334:putfield        #168 <Field float mResolvedDimensionRatio>
				mResolvedDimensionRatioSide = 1;
	//  159  337:aload_0         
	//  160  338:iconst_1        
	//  161  339:putfield        #166 <Field int mResolvedDimensionRatioSide>
			}
		if(mResolvedDimensionRatioSide == -1 && flag && flag1)
	//* 162  342:aload_0         
	//* 163  343:getfield        #166 <Field int mResolvedDimensionRatioSide>
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
	//  173  361:getfield        #168 <Field float mResolvedDimensionRatio>
	//  174  364:fdiv            
	//  175  365:putfield        #168 <Field float mResolvedDimensionRatio>
			mResolvedDimensionRatioSide = 1;
	//  176  368:aload_0         
	//  177  369:iconst_1        
	//  178  370:putfield        #166 <Field int mResolvedDimensionRatioSide>
		}
	//  179  373:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #711 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #712 <Method void StringBuilder()>
	//    3    7:astore_2        
		Object obj;
		if(mType != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #276 <Field String mType>
	//*   6   12:ifnull          56
		{
			obj = ((Object) (new StringBuilder()));
	//    7   15:new             #711 <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #712 <Method void StringBuilder()>
	//   10   22:astore_1        
			((StringBuilder) (obj)).append("type: ");
	//   11   23:aload_1         
	//   12   24:ldc2            #817 <String "type: ">
	//   13   27:invokevirtual   #716 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
			((StringBuilder) (obj)).append(mType);
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getfield        #276 <Field String mType>
	//   18   36:invokevirtual   #716 <Method StringBuilder StringBuilder.append(String)>
	//   19   39:pop             
			((StringBuilder) (obj)).append(" ");
	//   20   40:aload_1         
	//   21   41:ldc2            #819 <String " ">
	//   22   44:invokevirtual   #716 <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   24   48:aload_1         
	//   25   49:invokevirtual   #721 <Method String StringBuilder.toString()>
	//   26   52:astore_1        
		} else
	//*  27   53:goto            60
		{
			obj = "";
	//   28   56:ldc2            #821 <String "">
	//   29   59:astore_1        
		}
		stringbuilder.append(((String) (obj)));
	//   30   60:aload_2         
	//   31   61:aload_1         
	//   32   62:invokevirtual   #716 <Method StringBuilder StringBuilder.append(String)>
	//   33   65:pop             
		if(mDebugName != null)
	//*  34   66:aload_0         
	//*  35   67:getfield        #274 <Field String mDebugName>
	//*  36   70:ifnull          114
		{
			obj = ((Object) (new StringBuilder()));
	//   37   73:new             #711 <Class StringBuilder>
	//   38   76:dup             
	//   39   77:invokespecial   #712 <Method void StringBuilder()>
	//   40   80:astore_1        
			((StringBuilder) (obj)).append("id: ");
	//   41   81:aload_1         
	//   42   82:ldc2            #823 <String "id: ">
	//   43   85:invokevirtual   #716 <Method StringBuilder StringBuilder.append(String)>
	//   44   88:pop             
			((StringBuilder) (obj)).append(mDebugName);
	//   45   89:aload_1         
	//   46   90:aload_0         
	//   47   91:getfield        #274 <Field String mDebugName>
	//   48   94:invokevirtual   #716 <Method StringBuilder StringBuilder.append(String)>
	//   49   97:pop             
			((StringBuilder) (obj)).append(" ");
	//   50   98:aload_1         
	//   51   99:ldc2            #819 <String " ">
	//   52  102:invokevirtual   #716 <Method StringBuilder StringBuilder.append(String)>
	//   53  105:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   54  106:aload_1         
	//   55  107:invokevirtual   #721 <Method String StringBuilder.toString()>
	//   56  110:astore_1        
		} else
	//*  57  111:goto            118
		{
			obj = "";
	//   58  114:ldc2            #821 <String "">
	//   59  117:astore_1        
		}
		stringbuilder.append(((String) (obj)));
	//   60  118:aload_2         
	//   61  119:aload_1         
	//   62  120:invokevirtual   #716 <Method StringBuilder StringBuilder.append(String)>
	//   63  123:pop             
		stringbuilder.append("(");
	//   64  124:aload_2         
	//   65  125:ldc2            #825 <String "(">
	//   66  128:invokevirtual   #716 <Method StringBuilder StringBuilder.append(String)>
	//   67  131:pop             
		stringbuilder.append(mX);
	//   68  132:aload_2         
	//   69  133:aload_0         
	//   70  134:getfield        #246 <Field int mX>
	//   71  137:invokevirtual   #828 <Method StringBuilder StringBuilder.append(int)>
	//   72  140:pop             
		stringbuilder.append(", ");
	//   73  141:aload_2         
	//   74  142:ldc2            #830 <String ", ">
	//   75  145:invokevirtual   #716 <Method StringBuilder StringBuilder.append(String)>
	//   76  148:pop             
		stringbuilder.append(mY);
	//   77  149:aload_2         
	//   78  150:aload_0         
	//   79  151:getfield        #248 <Field int mY>
	//   80  154:invokevirtual   #828 <Method StringBuilder StringBuilder.append(int)>
	//   81  157:pop             
		stringbuilder.append(") - (");
	//   82  158:aload_2         
	//   83  159:ldc2            #832 <String ") - (">
	//   84  162:invokevirtual   #716 <Method StringBuilder StringBuilder.append(String)>
	//   85  165:pop             
		stringbuilder.append(mWidth);
	//   86  166:aload_2         
	//   87  167:aload_0         
	//   88  168:getfield        #238 <Field int mWidth>
	//   89  171:invokevirtual   #828 <Method StringBuilder StringBuilder.append(int)>
	//   90  174:pop             
		stringbuilder.append(" x ");
	//   91  175:aload_2         
	//   92  176:ldc2            #834 <String " x ">
	//   93  179:invokevirtual   #716 <Method StringBuilder StringBuilder.append(String)>
	//   94  182:pop             
		stringbuilder.append(mHeight);
	//   95  183:aload_2         
	//   96  184:aload_0         
	//   97  185:getfield        #240 <Field int mHeight>
	//   98  188:invokevirtual   #828 <Method StringBuilder StringBuilder.append(int)>
	//   99  191:pop             
		stringbuilder.append(") wrap: (");
	//  100  192:aload_2         
	//  101  193:ldc2            #836 <String ") wrap: (">
	//  102  196:invokevirtual   #716 <Method StringBuilder StringBuilder.append(String)>
	//  103  199:pop             
		stringbuilder.append(mWrapWidth);
	//  104  200:aload_2         
	//  105  201:aload_0         
	//  106  202:getfield        #625 <Field int mWrapWidth>
	//  107  205:invokevirtual   #828 <Method StringBuilder StringBuilder.append(int)>
	//  108  208:pop             
		stringbuilder.append(" x ");
	//  109  209:aload_2         
	//  110  210:ldc2            #834 <String " x ">
	//  111  213:invokevirtual   #716 <Method StringBuilder StringBuilder.append(String)>
	//  112  216:pop             
		stringbuilder.append(mWrapHeight);
	//  113  217:aload_2         
	//  114  218:aload_0         
	//  115  219:getfield        #622 <Field int mWrapHeight>
	//  116  222:invokevirtual   #828 <Method StringBuilder StringBuilder.append(int)>
	//  117  225:pop             
		stringbuilder.append(")");
	//  118  226:aload_2         
	//  119  227:ldc2            #838 <String ")">
	//  120  230:invokevirtual   #716 <Method StringBuilder StringBuilder.append(String)>
	//  121  233:pop             
		return stringbuilder.toString();
	//  122  234:aload_2         
	//  123  235:invokevirtual   #721 <Method String StringBuilder.toString()>
	//  124  238:areturn         
	}

	public void updateDrawPosition()
	{
		int i = mX;
	//    0    0:aload_0         
	//    1    1:getfield        #246 <Field int mX>
	//    2    4:istore_1        
		int j = mY;
	//    3    5:aload_0         
	//    4    6:getfield        #248 <Field int mY>
	//    5    9:istore_2        
		int k = mWidth;
	//    6   10:aload_0         
	//    7   11:getfield        #238 <Field int mWidth>
	//    8   14:istore_3        
		int l = mHeight;
	//    9   15:aload_0         
	//   10   16:getfield        #240 <Field int mHeight>
	//   11   19:istore          4
		mDrawX = i;
	//   12   21:aload_0         
	//   13   22:iload_1         
	//   14   23:putfield        #250 <Field int mDrawX>
		mDrawY = j;
	//   15   26:aload_0         
	//   16   27:iload_2         
	//   17   28:putfield        #252 <Field int mDrawY>
		mDrawWidth = (k + i) - i;
	//   18   31:aload_0         
	//   19   32:iload_3         
	//   20   33:iload_1         
	//   21   34:iadd            
	//   22   35:iload_1         
	//   23   36:isub            
	//   24   37:putfield        #254 <Field int mDrawWidth>
		mDrawHeight = (l + j) - j;
	//   25   40:aload_0         
	//   26   41:iload           4
	//   27   43:iload_2         
	//   28   44:iadd            
	//   29   45:iload_2         
	//   30   46:isub            
	//   31   47:putfield        #256 <Field int mDrawHeight>
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
			i = linearsystem.getObjectVariableValue(((Object) (mLeft)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #186 <Field ConstraintAnchor mLeft>
	//    3    5:invokevirtual   #844 <Method int LinearSystem.getObjectVariableValue(Object)>
	//    4    8:istore_2        
			j = linearsystem.getObjectVariableValue(((Object) (mTop)));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #191 <Field ConstraintAnchor mTop>
	//    8   14:invokevirtual   #844 <Method int LinearSystem.getObjectVariableValue(Object)>
	//    9   17:istore_3        
			l = linearsystem.getObjectVariableValue(((Object) (mRight)));
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #196 <Field ConstraintAnchor mRight>
	//   13   23:invokevirtual   #844 <Method int LinearSystem.getObjectVariableValue(Object)>
	//   14   26:istore          5
			int i1 = linearsystem.getObjectVariableValue(((Object) (mBottom)));
	//   15   28:aload_1         
	//   16   29:aload_0         
	//   17   30:getfield        #201 <Field ConstraintAnchor mBottom>
	//   18   33:invokevirtual   #844 <Method int LinearSystem.getObjectVariableValue(Object)>
	//   19   36:istore          6
			if(l - i >= 0 && i1 - j >= 0 && i != 0x80000000 && i != 0x7fffffff && j != 0x80000000 && j != 0x7fffffff && l != 0x80000000 && l != 0x7fffffff && i1 != 0x80000000)
	//*  20   38:iload           5
	//*  21   40:iload_2         
	//*  22   41:isub            
	//*  23   42:iflt            112
	//*  24   45:iload           6
	//*  25   47:iload_3         
	//*  26   48:isub            
	//*  27   49:iflt            112
	//*  28   52:iload_2         
	//*  29   53:ldc2            #845 <Int 0x80000000>
	//*  30   56:icmpeq          112
	//*  31   59:iload_2         
	//*  32   60:ldc1            #169 <Int 0x7fffffff>
	//*  33   62:icmpeq          112
	//*  34   65:iload_3         
	//*  35   66:ldc2            #845 <Int 0x80000000>
	//*  36   69:icmpeq          112
	//*  37   72:iload_3         
	//*  38   73:ldc1            #169 <Int 0x7fffffff>
	//*  39   75:icmpeq          112
	//*  40   78:iload           5
	//*  41   80:ldc2            #845 <Int 0x80000000>
	//*  42   83:icmpeq          112
	//*  43   86:iload           5
	//*  44   88:ldc1            #169 <Int 0x7fffffff>
	//*  45   90:icmpeq          112
	//*  46   93:iload           6
	//*  47   95:ldc2            #845 <Int 0x80000000>
	//*  48   98:icmpeq          112
			{
				k = i1;
	//   49  101:iload           6
	//   50  103:istore          4
				if(i1 != 0x7fffffff)
					break label0;
	//   51  105:iload           6
	//   52  107:ldc1            #169 <Int 0x7fffffff>
	//   53  109:icmpne          123
			}
			k = 0;
	//   54  112:iconst_0        
	//   55  113:istore          4
			i = k;
	//   56  115:iload           4
	//   57  117:istore_2        
			j = i;
	//   58  118:iload_2         
	//   59  119:istore_3        
			l = j;
	//   60  120:iload_3         
	//   61  121:istore          5
		}
		setFrame(i, j, l, k);
	//   62  123:aload_0         
	//   63  124:iload_2         
	//   64  125:iload_3         
	//   65  126:iload           5
	//   66  128:iload           4
	//   67  130:invokevirtual   #847 <Method void setFrame(int, int, int, int)>
	//   68  133:return          
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
	//    6    9:getfield        #223 <Field ConstraintAnchor[] mListAnchors>
	//    7   12:iload_1         
	//    8   13:aaload          
	//    9   14:invokevirtual   #324 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   10   17:invokevirtual   #851 <Method void ResolutionAnchor.update()>

	//   11   20:iload_1         
	//   12   21:iconst_1        
	//   13   22:iadd            
	//   14   23:istore_1        
	//*  15   24:goto            2
	//   16   27:return          
	}

	protected static final int ANCHOR_BASELINE = 4;
	protected static final int ANCHOR_BOTTOM = 3;
	protected static final int ANCHOR_LEFT = 0;
	protected static final int ANCHOR_RIGHT = 1;
	protected static final int ANCHOR_TOP = 2;
	private static final boolean AUTOTAG_CENTER = false;
	public static final int CHAIN_PACKED = 2;
	public static final int CHAIN_SPREAD = 0;
	public static final int CHAIN_SPREAD_INSIDE = 1;
	public static float DEFAULT_BIAS = 0.5F;
	static final int DIMENSION_HORIZONTAL = 0;
	static final int DIMENSION_VERTICAL = 1;
	protected static final int DIRECT = 2;
	public static final int GONE = 8;
	public static final int HORIZONTAL = 0;
	public static final int INVISIBLE = 4;
	public static final int MATCH_CONSTRAINT_PERCENT = 2;
	public static final int MATCH_CONSTRAINT_RATIO = 3;
	public static final int MATCH_CONSTRAINT_RATIO_RESOLVED = 4;
	public static final int MATCH_CONSTRAINT_SPREAD = 0;
	public static final int MATCH_CONSTRAINT_WRAP = 1;
	protected static final int SOLVER = 1;
	public static final int UNKNOWN = -1;
	public static final int VERTICAL = 1;
	public static final int VISIBLE = 0;
	private static final int WRAP = -2;
	protected ArrayList mAnchors;
	ConstraintAnchor mBaseline;
	int mBaselineDistance;
	ConstraintAnchor mBottom;
	boolean mBottomHasCentered;
	ConstraintAnchor mCenter;
	ConstraintAnchor mCenterX;
	ConstraintAnchor mCenterY;
	private float mCircleConstraintAngle;
	private Object mCompanionWidget;
	private int mContainerItemSkip;
	private String mDebugName;
	protected float mDimensionRatio;
	protected int mDimensionRatioSide;
	int mDistToBottom;
	int mDistToLeft;
	int mDistToRight;
	int mDistToTop;
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
	boolean mLeftHasCentered;
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
	boolean mRightHasCentered;
	ConstraintAnchor mTop;
	boolean mTopHasCentered;
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
