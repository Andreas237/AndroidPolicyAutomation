// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint;

import java.util.Arrays;

// Referenced classes of package android.support.constraint:
//			ConstraintSet, Barrier, ConstraintHelper

private static class ConstraintSet$Constraint
{

	private void fillFrom(int i, rams rams)
	{
		mViewId = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #249 <Field int mViewId>
		leftToLeft = rams.leftToLeft;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:getfield        #252 <Field int ConstraintLayout$LayoutParams.leftToLeft>
	//    6   10:putfield        #99  <Field int leftToLeft>
		leftToRight = rams.leftToRight;
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:getfield        #253 <Field int ConstraintLayout$LayoutParams.leftToRight>
	//   10   18:putfield        #101 <Field int leftToRight>
		rightToLeft = rams.rightToLeft;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:getfield        #254 <Field int ConstraintLayout$LayoutParams.rightToLeft>
	//   14   26:putfield        #103 <Field int rightToLeft>
		rightToRight = rams.rightToRight;
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:getfield        #255 <Field int ConstraintLayout$LayoutParams.rightToRight>
	//   18   34:putfield        #105 <Field int rightToRight>
		topToTop = rams.topToTop;
	//   19   37:aload_0         
	//   20   38:aload_2         
	//   21   39:getfield        #256 <Field int ConstraintLayout$LayoutParams.topToTop>
	//   22   42:putfield        #107 <Field int topToTop>
		topToBottom = rams.topToBottom;
	//   23   45:aload_0         
	//   24   46:aload_2         
	//   25   47:getfield        #257 <Field int ConstraintLayout$LayoutParams.topToBottom>
	//   26   50:putfield        #109 <Field int topToBottom>
		bottomToTop = rams.bottomToTop;
	//   27   53:aload_0         
	//   28   54:aload_2         
	//   29   55:getfield        #258 <Field int ConstraintLayout$LayoutParams.bottomToTop>
	//   30   58:putfield        #111 <Field int bottomToTop>
		bottomToBottom = rams.bottomToBottom;
	//   31   61:aload_0         
	//   32   62:aload_2         
	//   33   63:getfield        #259 <Field int ConstraintLayout$LayoutParams.bottomToBottom>
	//   34   66:putfield        #113 <Field int bottomToBottom>
		baselineToBaseline = rams.baselineToBaseline;
	//   35   69:aload_0         
	//   36   70:aload_2         
	//   37   71:getfield        #260 <Field int ConstraintLayout$LayoutParams.baselineToBaseline>
	//   38   74:putfield        #115 <Field int baselineToBaseline>
		startToEnd = rams.startToEnd;
	//   39   77:aload_0         
	//   40   78:aload_2         
	//   41   79:getfield        #261 <Field int ConstraintLayout$LayoutParams.startToEnd>
	//   42   82:putfield        #117 <Field int startToEnd>
		startToStart = rams.startToStart;
	//   43   85:aload_0         
	//   44   86:aload_2         
	//   45   87:getfield        #262 <Field int ConstraintLayout$LayoutParams.startToStart>
	//   46   90:putfield        #119 <Field int startToStart>
		endToStart = rams.endToStart;
	//   47   93:aload_0         
	//   48   94:aload_2         
	//   49   95:getfield        #263 <Field int ConstraintLayout$LayoutParams.endToStart>
	//   50   98:putfield        #121 <Field int endToStart>
		endToEnd = rams.endToEnd;
	//   51  101:aload_0         
	//   52  102:aload_2         
	//   53  103:getfield        #264 <Field int ConstraintLayout$LayoutParams.endToEnd>
	//   54  106:putfield        #123 <Field int endToEnd>
		horizontalBias = rams.horizontalBias;
	//   55  109:aload_0         
	//   56  110:aload_2         
	//   57  111:getfield        #265 <Field float ConstraintLayout$LayoutParams.horizontalBias>
	//   58  114:putfield        #126 <Field float horizontalBias>
		verticalBias = rams.verticalBias;
	//   59  117:aload_0         
	//   60  118:aload_2         
	//   61  119:getfield        #266 <Field float ConstraintLayout$LayoutParams.verticalBias>
	//   62  122:putfield        #128 <Field float verticalBias>
		dimensionRatio = rams.dimensionRatio;
	//   63  125:aload_0         
	//   64  126:aload_2         
	//   65  127:getfield        #267 <Field String ConstraintLayout$LayoutParams.dimensionRatio>
	//   66  130:putfield        #130 <Field String dimensionRatio>
		circleConstraint = rams.circleConstraint;
	//   67  133:aload_0         
	//   68  134:aload_2         
	//   69  135:getfield        #268 <Field int ConstraintLayout$LayoutParams.circleConstraint>
	//   70  138:putfield        #132 <Field int circleConstraint>
		circleRadius = rams.circleRadius;
	//   71  141:aload_0         
	//   72  142:aload_2         
	//   73  143:getfield        #269 <Field int ConstraintLayout$LayoutParams.circleRadius>
	//   74  146:putfield        #134 <Field int circleRadius>
		circleAngle = rams.circleAngle;
	//   75  149:aload_0         
	//   76  150:aload_2         
	//   77  151:getfield        #270 <Field float ConstraintLayout$LayoutParams.circleAngle>
	//   78  154:putfield        #136 <Field float circleAngle>
		editorAbsoluteX = rams.editorAbsoluteX;
	//   79  157:aload_0         
	//   80  158:aload_2         
	//   81  159:getfield        #271 <Field int ConstraintLayout$LayoutParams.editorAbsoluteX>
	//   82  162:putfield        #138 <Field int editorAbsoluteX>
		editorAbsoluteY = rams.editorAbsoluteY;
	//   83  165:aload_0         
	//   84  166:aload_2         
	//   85  167:getfield        #272 <Field int ConstraintLayout$LayoutParams.editorAbsoluteY>
	//   86  170:putfield        #140 <Field int editorAbsoluteY>
		orientation = rams.orientation;
	//   87  173:aload_0         
	//   88  174:aload_2         
	//   89  175:getfield        #273 <Field int ConstraintLayout$LayoutParams.orientation>
	//   90  178:putfield        #142 <Field int orientation>
		guidePercent = rams.guidePercent;
	//   91  181:aload_0         
	//   92  182:aload_2         
	//   93  183:getfield        #274 <Field float ConstraintLayout$LayoutParams.guidePercent>
	//   94  186:putfield        #97  <Field float guidePercent>
		guideBegin = rams.guideBegin;
	//   95  189:aload_0         
	//   96  190:aload_2         
	//   97  191:getfield        #275 <Field int ConstraintLayout$LayoutParams.guideBegin>
	//   98  194:putfield        #92  <Field int guideBegin>
		guideEnd = rams.guideEnd;
	//   99  197:aload_0         
	//  100  198:aload_2         
	//  101  199:getfield        #276 <Field int ConstraintLayout$LayoutParams.guideEnd>
	//  102  202:putfield        #94  <Field int guideEnd>
		mWidth = rams.width;
	//  103  205:aload_0         
	//  104  206:aload_2         
	//  105  207:getfield        #279 <Field int ConstraintLayout$LayoutParams.width>
	//  106  210:putfield        #281 <Field int mWidth>
		mHeight = rams.height;
	//  107  213:aload_0         
	//  108  214:aload_2         
	//  109  215:getfield        #284 <Field int ConstraintLayout$LayoutParams.height>
	//  110  218:putfield        #286 <Field int mHeight>
		leftMargin = rams.leftMargin;
	//  111  221:aload_0         
	//  112  222:aload_2         
	//  113  223:getfield        #287 <Field int ConstraintLayout$LayoutParams.leftMargin>
	//  114  226:putfield        #144 <Field int leftMargin>
		rightMargin = rams.rightMargin;
	//  115  229:aload_0         
	//  116  230:aload_2         
	//  117  231:getfield        #288 <Field int ConstraintLayout$LayoutParams.rightMargin>
	//  118  234:putfield        #146 <Field int rightMargin>
		topMargin = rams.topMargin;
	//  119  237:aload_0         
	//  120  238:aload_2         
	//  121  239:getfield        #289 <Field int ConstraintLayout$LayoutParams.topMargin>
	//  122  242:putfield        #148 <Field int topMargin>
		bottomMargin = rams.bottomMargin;
	//  123  245:aload_0         
	//  124  246:aload_2         
	//  125  247:getfield        #290 <Field int ConstraintLayout$LayoutParams.bottomMargin>
	//  126  250:putfield        #150 <Field int bottomMargin>
		verticalWeight = rams.verticalWeight;
	//  127  253:aload_0         
	//  128  254:aload_2         
	//  129  255:getfield        #291 <Field float ConstraintLayout$LayoutParams.verticalWeight>
	//  130  258:putfield        #170 <Field float verticalWeight>
		horizontalWeight = rams.horizontalWeight;
	//  131  261:aload_0         
	//  132  262:aload_2         
	//  133  263:getfield        #292 <Field float ConstraintLayout$LayoutParams.horizontalWeight>
	//  134  266:putfield        #172 <Field float horizontalWeight>
		verticalChainStyle = rams.verticalChainStyle;
	//  135  269:aload_0         
	//  136  270:aload_2         
	//  137  271:getfield        #293 <Field int ConstraintLayout$LayoutParams.verticalChainStyle>
	//  138  274:putfield        #176 <Field int verticalChainStyle>
		horizontalChainStyle = rams.horizontalChainStyle;
	//  139  277:aload_0         
	//  140  278:aload_2         
	//  141  279:getfield        #294 <Field int ConstraintLayout$LayoutParams.horizontalChainStyle>
	//  142  282:putfield        #174 <Field int horizontalChainStyle>
		constrainedWidth = rams.constrainedWidth;
	//  143  285:aload_0         
	//  144  286:aload_2         
	//  145  287:getfield        #295 <Field boolean ConstraintLayout$LayoutParams.constrainedWidth>
	//  146  290:putfield        #205 <Field boolean constrainedWidth>
		constrainedHeight = rams.constrainedHeight;
	//  147  293:aload_0         
	//  148  294:aload_2         
	//  149  295:getfield        #296 <Field boolean ConstraintLayout$LayoutParams.constrainedHeight>
	//  150  298:putfield        #207 <Field boolean constrainedHeight>
		widthDefault = rams.matchConstraintDefaultWidth;
	//  151  301:aload_0         
	//  152  302:aload_2         
	//  153  303:getfield        #299 <Field int ConstraintLayout$LayoutParams.matchConstraintDefaultWidth>
	//  154  306:putfield        #209 <Field int widthDefault>
		heightDefault = rams.matchConstraintDefaultHeight;
	//  155  309:aload_0         
	//  156  310:aload_2         
	//  157  311:getfield        #302 <Field int ConstraintLayout$LayoutParams.matchConstraintDefaultHeight>
	//  158  314:putfield        #211 <Field int heightDefault>
		constrainedWidth = rams.constrainedWidth;
	//  159  317:aload_0         
	//  160  318:aload_2         
	//  161  319:getfield        #295 <Field boolean ConstraintLayout$LayoutParams.constrainedWidth>
	//  162  322:putfield        #205 <Field boolean constrainedWidth>
		widthMax = rams.matchConstraintMaxWidth;
	//  163  325:aload_0         
	//  164  326:aload_2         
	//  165  327:getfield        #305 <Field int ConstraintLayout$LayoutParams.matchConstraintMaxWidth>
	//  166  330:putfield        #213 <Field int widthMax>
		heightMax = rams.matchConstraintMaxHeight;
	//  167  333:aload_0         
	//  168  334:aload_2         
	//  169  335:getfield        #308 <Field int ConstraintLayout$LayoutParams.matchConstraintMaxHeight>
	//  170  338:putfield        #215 <Field int heightMax>
		widthMin = rams.matchConstraintMinWidth;
	//  171  341:aload_0         
	//  172  342:aload_2         
	//  173  343:getfield        #311 <Field int ConstraintLayout$LayoutParams.matchConstraintMinWidth>
	//  174  346:putfield        #217 <Field int widthMin>
		heightMin = rams.matchConstraintMinHeight;
	//  175  349:aload_0         
	//  176  350:aload_2         
	//  177  351:getfield        #314 <Field int ConstraintLayout$LayoutParams.matchConstraintMinHeight>
	//  178  354:putfield        #219 <Field int heightMin>
		widthPercent = rams.matchConstraintPercentWidth;
	//  179  357:aload_0         
	//  180  358:aload_2         
	//  181  359:getfield        #317 <Field float ConstraintLayout$LayoutParams.matchConstraintPercentWidth>
	//  182  362:putfield        #221 <Field float widthPercent>
		heightPercent = rams.matchConstraintPercentHeight;
	//  183  365:aload_0         
	//  184  366:aload_2         
	//  185  367:getfield        #320 <Field float ConstraintLayout$LayoutParams.matchConstraintPercentHeight>
	//  186  370:putfield        #223 <Field float heightPercent>
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//* 187  373:getstatic       #325 <Field int android.os.Build$VERSION.SDK_INT>
	//* 188  376:bipush          17
	//* 189  378:icmplt          397
		{
			endMargin = rams.getMarginEnd();
	//  190  381:aload_0         
	//  191  382:aload_2         
	//  192  383:invokevirtual   #329 <Method int ConstraintLayout$LayoutParams.getMarginEnd()>
	//  193  386:putfield        #152 <Field int endMargin>
			startMargin = rams.getMarginStart();
	//  194  389:aload_0         
	//  195  390:aload_2         
	//  196  391:invokevirtual   #332 <Method int ConstraintLayout$LayoutParams.getMarginStart()>
	//  197  394:putfield        #154 <Field int startMargin>
		}
	//  198  397:return          
	}

	private void fillFromConstraints(int i, Constraints$LayoutParams constraints$layoutparams)
	{
		fillFrom(i, ((rams) (constraints$layoutparams)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #236 <Method void fillFrom(int, ConstraintLayout$LayoutParams)>
		alpha = constraints$layoutparams.alpha;
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:getfield        #335 <Field float Constraints$LayoutParams.alpha>
	//    7   11:putfield        #178 <Field float alpha>
		rotation = constraints$layoutparams.rotation;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:getfield        #336 <Field float Constraints$LayoutParams.rotation>
	//   11   19:putfield        #184 <Field float rotation>
		rotationX = constraints$layoutparams.rotationX;
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:getfield        #337 <Field float Constraints$LayoutParams.rotationX>
	//   15   27:putfield        #186 <Field float rotationX>
		rotationY = constraints$layoutparams.rotationY;
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:getfield        #338 <Field float Constraints$LayoutParams.rotationY>
	//   19   35:putfield        #188 <Field float rotationY>
		scaleX = constraints$layoutparams.scaleX;
	//   20   38:aload_0         
	//   21   39:aload_2         
	//   22   40:getfield        #339 <Field float Constraints$LayoutParams.scaleX>
	//   23   43:putfield        #190 <Field float scaleX>
		scaleY = constraints$layoutparams.scaleY;
	//   24   46:aload_0         
	//   25   47:aload_2         
	//   26   48:getfield        #340 <Field float Constraints$LayoutParams.scaleY>
	//   27   51:putfield        #192 <Field float scaleY>
		transformPivotX = constraints$layoutparams.transformPivotX;
	//   28   54:aload_0         
	//   29   55:aload_2         
	//   30   56:getfield        #341 <Field float Constraints$LayoutParams.transformPivotX>
	//   31   59:putfield        #195 <Field float transformPivotX>
		transformPivotY = constraints$layoutparams.transformPivotY;
	//   32   62:aload_0         
	//   33   63:aload_2         
	//   34   64:getfield        #342 <Field float Constraints$LayoutParams.transformPivotY>
	//   35   67:putfield        #197 <Field float transformPivotY>
		translationX = constraints$layoutparams.translationX;
	//   36   70:aload_0         
	//   37   71:aload_2         
	//   38   72:getfield        #343 <Field float Constraints$LayoutParams.translationX>
	//   39   75:putfield        #199 <Field float translationX>
		translationY = constraints$layoutparams.translationY;
	//   40   78:aload_0         
	//   41   79:aload_2         
	//   42   80:getfield        #344 <Field float Constraints$LayoutParams.translationY>
	//   43   83:putfield        #201 <Field float translationY>
		translationZ = constraints$layoutparams.translationZ;
	//   44   86:aload_0         
	//   45   87:aload_2         
	//   46   88:getfield        #345 <Field float Constraints$LayoutParams.translationZ>
	//   47   91:putfield        #203 <Field float translationZ>
		elevation = constraints$layoutparams.elevation;
	//   48   94:aload_0         
	//   49   95:aload_2         
	//   50   96:getfield        #346 <Field float Constraints$LayoutParams.elevation>
	//   51   99:putfield        #182 <Field float elevation>
		applyElevation = constraints$layoutparams.applyElevation;
	//   52  102:aload_0         
	//   53  103:aload_2         
	//   54  104:getfield        #347 <Field boolean Constraints$LayoutParams.applyElevation>
	//   55  107:putfield        #180 <Field boolean applyElevation>
	//   56  110:return          
	}

	private void fillFromConstraints(ConstraintHelper constrainthelper, int i, Constraints$LayoutParams constraints$layoutparams)
	{
		fillFromConstraints(i, constraints$layoutparams);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #247 <Method void fillFromConstraints(int, Constraints$LayoutParams)>
		if(constrainthelper instanceof Barrier)
	//*   4    6:aload_1         
	//*   5    7:instanceof      #349 <Class Barrier>
	//*   6   10:ifeq            39
		{
			mHelperType = 1;
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:putfield        #227 <Field int mHelperType>
			constrainthelper = ((ConstraintHelper) ((Barrier)constrainthelper));
	//   10   18:aload_1         
	//   11   19:checkcast       #349 <Class Barrier>
	//   12   22:astore_1        
			mBarrierDirection = ((Barrier) (constrainthelper)).getType();
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:invokevirtual   #352 <Method int Barrier.getType()>
	//   16   28:putfield        #225 <Field int mBarrierDirection>
			mReferenceIds = ((Barrier) (constrainthelper)).getReferencedIds();
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:invokevirtual   #356 <Method int[] Barrier.getReferencedIds()>
	//   20   36:putfield        #358 <Field int[] mReferenceIds>
		}
	//   21   39:return          
	}

	public void applyTo(rams rams)
	{
		rams.leftToLeft = leftToLeft;
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #99  <Field int leftToLeft>
	//    3    5:putfield        #252 <Field int ConstraintLayout$LayoutParams.leftToLeft>
		rams.leftToRight = leftToRight;
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #101 <Field int leftToRight>
	//    7   13:putfield        #253 <Field int ConstraintLayout$LayoutParams.leftToRight>
		rams.rightToLeft = rightToLeft;
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #103 <Field int rightToLeft>
	//   11   21:putfield        #254 <Field int ConstraintLayout$LayoutParams.rightToLeft>
		rams.rightToRight = rightToRight;
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #105 <Field int rightToRight>
	//   15   29:putfield        #255 <Field int ConstraintLayout$LayoutParams.rightToRight>
		rams.topToTop = topToTop;
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #107 <Field int topToTop>
	//   19   37:putfield        #256 <Field int ConstraintLayout$LayoutParams.topToTop>
		rams.topToBottom = topToBottom;
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #109 <Field int topToBottom>
	//   23   45:putfield        #257 <Field int ConstraintLayout$LayoutParams.topToBottom>
		rams.bottomToTop = bottomToTop;
	//   24   48:aload_1         
	//   25   49:aload_0         
	//   26   50:getfield        #111 <Field int bottomToTop>
	//   27   53:putfield        #258 <Field int ConstraintLayout$LayoutParams.bottomToTop>
		rams.bottomToBottom = bottomToBottom;
	//   28   56:aload_1         
	//   29   57:aload_0         
	//   30   58:getfield        #113 <Field int bottomToBottom>
	//   31   61:putfield        #259 <Field int ConstraintLayout$LayoutParams.bottomToBottom>
		rams.baselineToBaseline = baselineToBaseline;
	//   32   64:aload_1         
	//   33   65:aload_0         
	//   34   66:getfield        #115 <Field int baselineToBaseline>
	//   35   69:putfield        #260 <Field int ConstraintLayout$LayoutParams.baselineToBaseline>
		rams.startToEnd = startToEnd;
	//   36   72:aload_1         
	//   37   73:aload_0         
	//   38   74:getfield        #117 <Field int startToEnd>
	//   39   77:putfield        #261 <Field int ConstraintLayout$LayoutParams.startToEnd>
		rams.startToStart = startToStart;
	//   40   80:aload_1         
	//   41   81:aload_0         
	//   42   82:getfield        #119 <Field int startToStart>
	//   43   85:putfield        #262 <Field int ConstraintLayout$LayoutParams.startToStart>
		rams.endToStart = endToStart;
	//   44   88:aload_1         
	//   45   89:aload_0         
	//   46   90:getfield        #121 <Field int endToStart>
	//   47   93:putfield        #263 <Field int ConstraintLayout$LayoutParams.endToStart>
		rams.endToEnd = endToEnd;
	//   48   96:aload_1         
	//   49   97:aload_0         
	//   50   98:getfield        #123 <Field int endToEnd>
	//   51  101:putfield        #264 <Field int ConstraintLayout$LayoutParams.endToEnd>
		rams.leftMargin = leftMargin;
	//   52  104:aload_1         
	//   53  105:aload_0         
	//   54  106:getfield        #144 <Field int leftMargin>
	//   55  109:putfield        #287 <Field int ConstraintLayout$LayoutParams.leftMargin>
		rams.rightMargin = rightMargin;
	//   56  112:aload_1         
	//   57  113:aload_0         
	//   58  114:getfield        #146 <Field int rightMargin>
	//   59  117:putfield        #288 <Field int ConstraintLayout$LayoutParams.rightMargin>
		rams.topMargin = topMargin;
	//   60  120:aload_1         
	//   61  121:aload_0         
	//   62  122:getfield        #148 <Field int topMargin>
	//   63  125:putfield        #289 <Field int ConstraintLayout$LayoutParams.topMargin>
		rams.bottomMargin = bottomMargin;
	//   64  128:aload_1         
	//   65  129:aload_0         
	//   66  130:getfield        #150 <Field int bottomMargin>
	//   67  133:putfield        #290 <Field int ConstraintLayout$LayoutParams.bottomMargin>
		rams.goneStartMargin = goneStartMargin;
	//   68  136:aload_1         
	//   69  137:aload_0         
	//   70  138:getfield        #168 <Field int goneStartMargin>
	//   71  141:putfield        #361 <Field int ConstraintLayout$LayoutParams.goneStartMargin>
		rams.goneEndMargin = goneEndMargin;
	//   72  144:aload_1         
	//   73  145:aload_0         
	//   74  146:getfield        #166 <Field int goneEndMargin>
	//   75  149:putfield        #362 <Field int ConstraintLayout$LayoutParams.goneEndMargin>
		rams.horizontalBias = horizontalBias;
	//   76  152:aload_1         
	//   77  153:aload_0         
	//   78  154:getfield        #126 <Field float horizontalBias>
	//   79  157:putfield        #265 <Field float ConstraintLayout$LayoutParams.horizontalBias>
		rams.verticalBias = verticalBias;
	//   80  160:aload_1         
	//   81  161:aload_0         
	//   82  162:getfield        #128 <Field float verticalBias>
	//   83  165:putfield        #266 <Field float ConstraintLayout$LayoutParams.verticalBias>
		rams.circleConstraint = circleConstraint;
	//   84  168:aload_1         
	//   85  169:aload_0         
	//   86  170:getfield        #132 <Field int circleConstraint>
	//   87  173:putfield        #268 <Field int ConstraintLayout$LayoutParams.circleConstraint>
		rams.circleRadius = circleRadius;
	//   88  176:aload_1         
	//   89  177:aload_0         
	//   90  178:getfield        #134 <Field int circleRadius>
	//   91  181:putfield        #269 <Field int ConstraintLayout$LayoutParams.circleRadius>
		rams.circleAngle = circleAngle;
	//   92  184:aload_1         
	//   93  185:aload_0         
	//   94  186:getfield        #136 <Field float circleAngle>
	//   95  189:putfield        #270 <Field float ConstraintLayout$LayoutParams.circleAngle>
		rams.dimensionRatio = dimensionRatio;
	//   96  192:aload_1         
	//   97  193:aload_0         
	//   98  194:getfield        #130 <Field String dimensionRatio>
	//   99  197:putfield        #267 <Field String ConstraintLayout$LayoutParams.dimensionRatio>
		rams.editorAbsoluteX = editorAbsoluteX;
	//  100  200:aload_1         
	//  101  201:aload_0         
	//  102  202:getfield        #138 <Field int editorAbsoluteX>
	//  103  205:putfield        #271 <Field int ConstraintLayout$LayoutParams.editorAbsoluteX>
		rams.editorAbsoluteY = editorAbsoluteY;
	//  104  208:aload_1         
	//  105  209:aload_0         
	//  106  210:getfield        #140 <Field int editorAbsoluteY>
	//  107  213:putfield        #272 <Field int ConstraintLayout$LayoutParams.editorAbsoluteY>
		rams.verticalWeight = verticalWeight;
	//  108  216:aload_1         
	//  109  217:aload_0         
	//  110  218:getfield        #170 <Field float verticalWeight>
	//  111  221:putfield        #291 <Field float ConstraintLayout$LayoutParams.verticalWeight>
		rams.horizontalWeight = horizontalWeight;
	//  112  224:aload_1         
	//  113  225:aload_0         
	//  114  226:getfield        #172 <Field float horizontalWeight>
	//  115  229:putfield        #292 <Field float ConstraintLayout$LayoutParams.horizontalWeight>
		rams.verticalChainStyle = verticalChainStyle;
	//  116  232:aload_1         
	//  117  233:aload_0         
	//  118  234:getfield        #176 <Field int verticalChainStyle>
	//  119  237:putfield        #293 <Field int ConstraintLayout$LayoutParams.verticalChainStyle>
		rams.horizontalChainStyle = horizontalChainStyle;
	//  120  240:aload_1         
	//  121  241:aload_0         
	//  122  242:getfield        #174 <Field int horizontalChainStyle>
	//  123  245:putfield        #294 <Field int ConstraintLayout$LayoutParams.horizontalChainStyle>
		rams.constrainedWidth = constrainedWidth;
	//  124  248:aload_1         
	//  125  249:aload_0         
	//  126  250:getfield        #205 <Field boolean constrainedWidth>
	//  127  253:putfield        #295 <Field boolean ConstraintLayout$LayoutParams.constrainedWidth>
		rams.constrainedHeight = constrainedHeight;
	//  128  256:aload_1         
	//  129  257:aload_0         
	//  130  258:getfield        #207 <Field boolean constrainedHeight>
	//  131  261:putfield        #296 <Field boolean ConstraintLayout$LayoutParams.constrainedHeight>
		rams.matchConstraintDefaultWidth = widthDefault;
	//  132  264:aload_1         
	//  133  265:aload_0         
	//  134  266:getfield        #209 <Field int widthDefault>
	//  135  269:putfield        #299 <Field int ConstraintLayout$LayoutParams.matchConstraintDefaultWidth>
		rams.matchConstraintDefaultHeight = heightDefault;
	//  136  272:aload_1         
	//  137  273:aload_0         
	//  138  274:getfield        #211 <Field int heightDefault>
	//  139  277:putfield        #302 <Field int ConstraintLayout$LayoutParams.matchConstraintDefaultHeight>
		rams.matchConstraintMaxWidth = widthMax;
	//  140  280:aload_1         
	//  141  281:aload_0         
	//  142  282:getfield        #213 <Field int widthMax>
	//  143  285:putfield        #305 <Field int ConstraintLayout$LayoutParams.matchConstraintMaxWidth>
		rams.matchConstraintMaxHeight = heightMax;
	//  144  288:aload_1         
	//  145  289:aload_0         
	//  146  290:getfield        #215 <Field int heightMax>
	//  147  293:putfield        #308 <Field int ConstraintLayout$LayoutParams.matchConstraintMaxHeight>
		rams.matchConstraintMinWidth = widthMin;
	//  148  296:aload_1         
	//  149  297:aload_0         
	//  150  298:getfield        #217 <Field int widthMin>
	//  151  301:putfield        #311 <Field int ConstraintLayout$LayoutParams.matchConstraintMinWidth>
		rams.matchConstraintMinHeight = heightMin;
	//  152  304:aload_1         
	//  153  305:aload_0         
	//  154  306:getfield        #219 <Field int heightMin>
	//  155  309:putfield        #314 <Field int ConstraintLayout$LayoutParams.matchConstraintMinHeight>
		rams.matchConstraintPercentWidth = widthPercent;
	//  156  312:aload_1         
	//  157  313:aload_0         
	//  158  314:getfield        #221 <Field float widthPercent>
	//  159  317:putfield        #317 <Field float ConstraintLayout$LayoutParams.matchConstraintPercentWidth>
		rams.matchConstraintPercentHeight = heightPercent;
	//  160  320:aload_1         
	//  161  321:aload_0         
	//  162  322:getfield        #223 <Field float heightPercent>
	//  163  325:putfield        #320 <Field float ConstraintLayout$LayoutParams.matchConstraintPercentHeight>
		rams.orientation = orientation;
	//  164  328:aload_1         
	//  165  329:aload_0         
	//  166  330:getfield        #142 <Field int orientation>
	//  167  333:putfield        #273 <Field int ConstraintLayout$LayoutParams.orientation>
		rams.guidePercent = guidePercent;
	//  168  336:aload_1         
	//  169  337:aload_0         
	//  170  338:getfield        #97  <Field float guidePercent>
	//  171  341:putfield        #274 <Field float ConstraintLayout$LayoutParams.guidePercent>
		rams.guideBegin = guideBegin;
	//  172  344:aload_1         
	//  173  345:aload_0         
	//  174  346:getfield        #92  <Field int guideBegin>
	//  175  349:putfield        #275 <Field int ConstraintLayout$LayoutParams.guideBegin>
		rams.guideEnd = guideEnd;
	//  176  352:aload_1         
	//  177  353:aload_0         
	//  178  354:getfield        #94  <Field int guideEnd>
	//  179  357:putfield        #276 <Field int ConstraintLayout$LayoutParams.guideEnd>
		rams.width = mWidth;
	//  180  360:aload_1         
	//  181  361:aload_0         
	//  182  362:getfield        #281 <Field int mWidth>
	//  183  365:putfield        #279 <Field int ConstraintLayout$LayoutParams.width>
		rams.height = mHeight;
	//  184  368:aload_1         
	//  185  369:aload_0         
	//  186  370:getfield        #286 <Field int mHeight>
	//  187  373:putfield        #284 <Field int ConstraintLayout$LayoutParams.height>
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//* 188  376:getstatic       #325 <Field int android.os.Build$VERSION.SDK_INT>
	//* 189  379:bipush          17
	//* 190  381:icmplt          400
		{
			rams.setMarginStart(startMargin);
	//  191  384:aload_1         
	//  192  385:aload_0         
	//  193  386:getfield        #154 <Field int startMargin>
	//  194  389:invokevirtual   #366 <Method void ConstraintLayout$LayoutParams.setMarginStart(int)>
			rams.setMarginEnd(endMargin);
	//  195  392:aload_1         
	//  196  393:aload_0         
	//  197  394:getfield        #152 <Field int endMargin>
	//  198  397:invokevirtual   #369 <Method void ConstraintLayout$LayoutParams.setMarginEnd(int)>
		}
		rams.validate();
	//  199  400:aload_1         
	//  200  401:invokevirtual   #372 <Method void ConstraintLayout$LayoutParams.validate()>
	//  201  404:return          
	}

	public ConstraintSet$Constraint clone()
	{
		ConstraintSet$Constraint constraintset$constraint = new ConstraintSet$Constraint();
	//    0    0:new             #2   <Class ConstraintSet$Constraint>
	//    1    3:dup             
	//    2    4:invokespecial   #230 <Method void ConstraintSet$Constraint()>
	//    3    7:astore_1        
		constraintset$constraint.mIsGuideline = mIsGuideline;
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #90  <Field boolean mIsGuideline>
	//    7   13:putfield        #90  <Field boolean mIsGuideline>
		constraintset$constraint.mWidth = mWidth;
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #281 <Field int mWidth>
	//   11   21:putfield        #281 <Field int mWidth>
		constraintset$constraint.mHeight = mHeight;
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #286 <Field int mHeight>
	//   15   29:putfield        #286 <Field int mHeight>
		constraintset$constraint.guideBegin = guideBegin;
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #92  <Field int guideBegin>
	//   19   37:putfield        #92  <Field int guideBegin>
		constraintset$constraint.guideEnd = guideEnd;
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #94  <Field int guideEnd>
	//   23   45:putfield        #94  <Field int guideEnd>
		constraintset$constraint.guidePercent = guidePercent;
	//   24   48:aload_1         
	//   25   49:aload_0         
	//   26   50:getfield        #97  <Field float guidePercent>
	//   27   53:putfield        #97  <Field float guidePercent>
		constraintset$constraint.leftToLeft = leftToLeft;
	//   28   56:aload_1         
	//   29   57:aload_0         
	//   30   58:getfield        #99  <Field int leftToLeft>
	//   31   61:putfield        #99  <Field int leftToLeft>
		constraintset$constraint.leftToRight = leftToRight;
	//   32   64:aload_1         
	//   33   65:aload_0         
	//   34   66:getfield        #101 <Field int leftToRight>
	//   35   69:putfield        #101 <Field int leftToRight>
		constraintset$constraint.rightToLeft = rightToLeft;
	//   36   72:aload_1         
	//   37   73:aload_0         
	//   38   74:getfield        #103 <Field int rightToLeft>
	//   39   77:putfield        #103 <Field int rightToLeft>
		constraintset$constraint.rightToRight = rightToRight;
	//   40   80:aload_1         
	//   41   81:aload_0         
	//   42   82:getfield        #105 <Field int rightToRight>
	//   43   85:putfield        #105 <Field int rightToRight>
		constraintset$constraint.topToTop = topToTop;
	//   44   88:aload_1         
	//   45   89:aload_0         
	//   46   90:getfield        #107 <Field int topToTop>
	//   47   93:putfield        #107 <Field int topToTop>
		constraintset$constraint.topToBottom = topToBottom;
	//   48   96:aload_1         
	//   49   97:aload_0         
	//   50   98:getfield        #109 <Field int topToBottom>
	//   51  101:putfield        #109 <Field int topToBottom>
		constraintset$constraint.bottomToTop = bottomToTop;
	//   52  104:aload_1         
	//   53  105:aload_0         
	//   54  106:getfield        #111 <Field int bottomToTop>
	//   55  109:putfield        #111 <Field int bottomToTop>
		constraintset$constraint.bottomToBottom = bottomToBottom;
	//   56  112:aload_1         
	//   57  113:aload_0         
	//   58  114:getfield        #113 <Field int bottomToBottom>
	//   59  117:putfield        #113 <Field int bottomToBottom>
		constraintset$constraint.baselineToBaseline = baselineToBaseline;
	//   60  120:aload_1         
	//   61  121:aload_0         
	//   62  122:getfield        #115 <Field int baselineToBaseline>
	//   63  125:putfield        #115 <Field int baselineToBaseline>
		constraintset$constraint.startToEnd = startToEnd;
	//   64  128:aload_1         
	//   65  129:aload_0         
	//   66  130:getfield        #117 <Field int startToEnd>
	//   67  133:putfield        #117 <Field int startToEnd>
		constraintset$constraint.startToStart = startToStart;
	//   68  136:aload_1         
	//   69  137:aload_0         
	//   70  138:getfield        #119 <Field int startToStart>
	//   71  141:putfield        #119 <Field int startToStart>
		constraintset$constraint.endToStart = endToStart;
	//   72  144:aload_1         
	//   73  145:aload_0         
	//   74  146:getfield        #121 <Field int endToStart>
	//   75  149:putfield        #121 <Field int endToStart>
		constraintset$constraint.endToEnd = endToEnd;
	//   76  152:aload_1         
	//   77  153:aload_0         
	//   78  154:getfield        #123 <Field int endToEnd>
	//   79  157:putfield        #123 <Field int endToEnd>
		constraintset$constraint.horizontalBias = horizontalBias;
	//   80  160:aload_1         
	//   81  161:aload_0         
	//   82  162:getfield        #126 <Field float horizontalBias>
	//   83  165:putfield        #126 <Field float horizontalBias>
		constraintset$constraint.verticalBias = verticalBias;
	//   84  168:aload_1         
	//   85  169:aload_0         
	//   86  170:getfield        #128 <Field float verticalBias>
	//   87  173:putfield        #128 <Field float verticalBias>
		constraintset$constraint.dimensionRatio = dimensionRatio;
	//   88  176:aload_1         
	//   89  177:aload_0         
	//   90  178:getfield        #130 <Field String dimensionRatio>
	//   91  181:putfield        #130 <Field String dimensionRatio>
		constraintset$constraint.editorAbsoluteX = editorAbsoluteX;
	//   92  184:aload_1         
	//   93  185:aload_0         
	//   94  186:getfield        #138 <Field int editorAbsoluteX>
	//   95  189:putfield        #138 <Field int editorAbsoluteX>
		constraintset$constraint.editorAbsoluteY = editorAbsoluteY;
	//   96  192:aload_1         
	//   97  193:aload_0         
	//   98  194:getfield        #140 <Field int editorAbsoluteY>
	//   99  197:putfield        #140 <Field int editorAbsoluteY>
		constraintset$constraint.horizontalBias = horizontalBias;
	//  100  200:aload_1         
	//  101  201:aload_0         
	//  102  202:getfield        #126 <Field float horizontalBias>
	//  103  205:putfield        #126 <Field float horizontalBias>
		constraintset$constraint.horizontalBias = horizontalBias;
	//  104  208:aload_1         
	//  105  209:aload_0         
	//  106  210:getfield        #126 <Field float horizontalBias>
	//  107  213:putfield        #126 <Field float horizontalBias>
		constraintset$constraint.horizontalBias = horizontalBias;
	//  108  216:aload_1         
	//  109  217:aload_0         
	//  110  218:getfield        #126 <Field float horizontalBias>
	//  111  221:putfield        #126 <Field float horizontalBias>
		constraintset$constraint.horizontalBias = horizontalBias;
	//  112  224:aload_1         
	//  113  225:aload_0         
	//  114  226:getfield        #126 <Field float horizontalBias>
	//  115  229:putfield        #126 <Field float horizontalBias>
		constraintset$constraint.horizontalBias = horizontalBias;
	//  116  232:aload_1         
	//  117  233:aload_0         
	//  118  234:getfield        #126 <Field float horizontalBias>
	//  119  237:putfield        #126 <Field float horizontalBias>
		constraintset$constraint.orientation = orientation;
	//  120  240:aload_1         
	//  121  241:aload_0         
	//  122  242:getfield        #142 <Field int orientation>
	//  123  245:putfield        #142 <Field int orientation>
		constraintset$constraint.leftMargin = leftMargin;
	//  124  248:aload_1         
	//  125  249:aload_0         
	//  126  250:getfield        #144 <Field int leftMargin>
	//  127  253:putfield        #144 <Field int leftMargin>
		constraintset$constraint.rightMargin = rightMargin;
	//  128  256:aload_1         
	//  129  257:aload_0         
	//  130  258:getfield        #146 <Field int rightMargin>
	//  131  261:putfield        #146 <Field int rightMargin>
		constraintset$constraint.topMargin = topMargin;
	//  132  264:aload_1         
	//  133  265:aload_0         
	//  134  266:getfield        #148 <Field int topMargin>
	//  135  269:putfield        #148 <Field int topMargin>
		constraintset$constraint.bottomMargin = bottomMargin;
	//  136  272:aload_1         
	//  137  273:aload_0         
	//  138  274:getfield        #150 <Field int bottomMargin>
	//  139  277:putfield        #150 <Field int bottomMargin>
		constraintset$constraint.endMargin = endMargin;
	//  140  280:aload_1         
	//  141  281:aload_0         
	//  142  282:getfield        #152 <Field int endMargin>
	//  143  285:putfield        #152 <Field int endMargin>
		constraintset$constraint.startMargin = startMargin;
	//  144  288:aload_1         
	//  145  289:aload_0         
	//  146  290:getfield        #154 <Field int startMargin>
	//  147  293:putfield        #154 <Field int startMargin>
		constraintset$constraint.visibility = visibility;
	//  148  296:aload_1         
	//  149  297:aload_0         
	//  150  298:getfield        #156 <Field int visibility>
	//  151  301:putfield        #156 <Field int visibility>
		constraintset$constraint.goneLeftMargin = goneLeftMargin;
	//  152  304:aload_1         
	//  153  305:aload_0         
	//  154  306:getfield        #158 <Field int goneLeftMargin>
	//  155  309:putfield        #158 <Field int goneLeftMargin>
		constraintset$constraint.goneTopMargin = goneTopMargin;
	//  156  312:aload_1         
	//  157  313:aload_0         
	//  158  314:getfield        #160 <Field int goneTopMargin>
	//  159  317:putfield        #160 <Field int goneTopMargin>
		constraintset$constraint.goneRightMargin = goneRightMargin;
	//  160  320:aload_1         
	//  161  321:aload_0         
	//  162  322:getfield        #162 <Field int goneRightMargin>
	//  163  325:putfield        #162 <Field int goneRightMargin>
		constraintset$constraint.goneBottomMargin = goneBottomMargin;
	//  164  328:aload_1         
	//  165  329:aload_0         
	//  166  330:getfield        #164 <Field int goneBottomMargin>
	//  167  333:putfield        #164 <Field int goneBottomMargin>
		constraintset$constraint.goneEndMargin = goneEndMargin;
	//  168  336:aload_1         
	//  169  337:aload_0         
	//  170  338:getfield        #166 <Field int goneEndMargin>
	//  171  341:putfield        #166 <Field int goneEndMargin>
		constraintset$constraint.goneStartMargin = goneStartMargin;
	//  172  344:aload_1         
	//  173  345:aload_0         
	//  174  346:getfield        #168 <Field int goneStartMargin>
	//  175  349:putfield        #168 <Field int goneStartMargin>
		constraintset$constraint.verticalWeight = verticalWeight;
	//  176  352:aload_1         
	//  177  353:aload_0         
	//  178  354:getfield        #170 <Field float verticalWeight>
	//  179  357:putfield        #170 <Field float verticalWeight>
		constraintset$constraint.horizontalWeight = horizontalWeight;
	//  180  360:aload_1         
	//  181  361:aload_0         
	//  182  362:getfield        #172 <Field float horizontalWeight>
	//  183  365:putfield        #172 <Field float horizontalWeight>
		constraintset$constraint.horizontalChainStyle = horizontalChainStyle;
	//  184  368:aload_1         
	//  185  369:aload_0         
	//  186  370:getfield        #174 <Field int horizontalChainStyle>
	//  187  373:putfield        #174 <Field int horizontalChainStyle>
		constraintset$constraint.verticalChainStyle = verticalChainStyle;
	//  188  376:aload_1         
	//  189  377:aload_0         
	//  190  378:getfield        #176 <Field int verticalChainStyle>
	//  191  381:putfield        #176 <Field int verticalChainStyle>
		constraintset$constraint.alpha = alpha;
	//  192  384:aload_1         
	//  193  385:aload_0         
	//  194  386:getfield        #178 <Field float alpha>
	//  195  389:putfield        #178 <Field float alpha>
		constraintset$constraint.applyElevation = applyElevation;
	//  196  392:aload_1         
	//  197  393:aload_0         
	//  198  394:getfield        #180 <Field boolean applyElevation>
	//  199  397:putfield        #180 <Field boolean applyElevation>
		constraintset$constraint.elevation = elevation;
	//  200  400:aload_1         
	//  201  401:aload_0         
	//  202  402:getfield        #182 <Field float elevation>
	//  203  405:putfield        #182 <Field float elevation>
		constraintset$constraint.rotation = rotation;
	//  204  408:aload_1         
	//  205  409:aload_0         
	//  206  410:getfield        #184 <Field float rotation>
	//  207  413:putfield        #184 <Field float rotation>
		constraintset$constraint.rotationX = rotationX;
	//  208  416:aload_1         
	//  209  417:aload_0         
	//  210  418:getfield        #186 <Field float rotationX>
	//  211  421:putfield        #186 <Field float rotationX>
		constraintset$constraint.rotationY = rotationY;
	//  212  424:aload_1         
	//  213  425:aload_0         
	//  214  426:getfield        #188 <Field float rotationY>
	//  215  429:putfield        #188 <Field float rotationY>
		constraintset$constraint.scaleX = scaleX;
	//  216  432:aload_1         
	//  217  433:aload_0         
	//  218  434:getfield        #190 <Field float scaleX>
	//  219  437:putfield        #190 <Field float scaleX>
		constraintset$constraint.scaleY = scaleY;
	//  220  440:aload_1         
	//  221  441:aload_0         
	//  222  442:getfield        #192 <Field float scaleY>
	//  223  445:putfield        #192 <Field float scaleY>
		constraintset$constraint.transformPivotX = transformPivotX;
	//  224  448:aload_1         
	//  225  449:aload_0         
	//  226  450:getfield        #195 <Field float transformPivotX>
	//  227  453:putfield        #195 <Field float transformPivotX>
		constraintset$constraint.transformPivotY = transformPivotY;
	//  228  456:aload_1         
	//  229  457:aload_0         
	//  230  458:getfield        #197 <Field float transformPivotY>
	//  231  461:putfield        #197 <Field float transformPivotY>
		constraintset$constraint.translationX = translationX;
	//  232  464:aload_1         
	//  233  465:aload_0         
	//  234  466:getfield        #199 <Field float translationX>
	//  235  469:putfield        #199 <Field float translationX>
		constraintset$constraint.translationY = translationY;
	//  236  472:aload_1         
	//  237  473:aload_0         
	//  238  474:getfield        #201 <Field float translationY>
	//  239  477:putfield        #201 <Field float translationY>
		constraintset$constraint.translationZ = translationZ;
	//  240  480:aload_1         
	//  241  481:aload_0         
	//  242  482:getfield        #203 <Field float translationZ>
	//  243  485:putfield        #203 <Field float translationZ>
		constraintset$constraint.constrainedWidth = constrainedWidth;
	//  244  488:aload_1         
	//  245  489:aload_0         
	//  246  490:getfield        #205 <Field boolean constrainedWidth>
	//  247  493:putfield        #205 <Field boolean constrainedWidth>
		constraintset$constraint.constrainedHeight = constrainedHeight;
	//  248  496:aload_1         
	//  249  497:aload_0         
	//  250  498:getfield        #207 <Field boolean constrainedHeight>
	//  251  501:putfield        #207 <Field boolean constrainedHeight>
		constraintset$constraint.widthDefault = widthDefault;
	//  252  504:aload_1         
	//  253  505:aload_0         
	//  254  506:getfield        #209 <Field int widthDefault>
	//  255  509:putfield        #209 <Field int widthDefault>
		constraintset$constraint.heightDefault = heightDefault;
	//  256  512:aload_1         
	//  257  513:aload_0         
	//  258  514:getfield        #211 <Field int heightDefault>
	//  259  517:putfield        #211 <Field int heightDefault>
		constraintset$constraint.widthMax = widthMax;
	//  260  520:aload_1         
	//  261  521:aload_0         
	//  262  522:getfield        #213 <Field int widthMax>
	//  263  525:putfield        #213 <Field int widthMax>
		constraintset$constraint.heightMax = heightMax;
	//  264  528:aload_1         
	//  265  529:aload_0         
	//  266  530:getfield        #215 <Field int heightMax>
	//  267  533:putfield        #215 <Field int heightMax>
		constraintset$constraint.widthMin = widthMin;
	//  268  536:aload_1         
	//  269  537:aload_0         
	//  270  538:getfield        #217 <Field int widthMin>
	//  271  541:putfield        #217 <Field int widthMin>
		constraintset$constraint.heightMin = heightMin;
	//  272  544:aload_1         
	//  273  545:aload_0         
	//  274  546:getfield        #219 <Field int heightMin>
	//  275  549:putfield        #219 <Field int heightMin>
		constraintset$constraint.widthPercent = widthPercent;
	//  276  552:aload_1         
	//  277  553:aload_0         
	//  278  554:getfield        #221 <Field float widthPercent>
	//  279  557:putfield        #221 <Field float widthPercent>
		constraintset$constraint.heightPercent = heightPercent;
	//  280  560:aload_1         
	//  281  561:aload_0         
	//  282  562:getfield        #223 <Field float heightPercent>
	//  283  565:putfield        #223 <Field float heightPercent>
		constraintset$constraint.mBarrierDirection = mBarrierDirection;
	//  284  568:aload_1         
	//  285  569:aload_0         
	//  286  570:getfield        #225 <Field int mBarrierDirection>
	//  287  573:putfield        #225 <Field int mBarrierDirection>
		constraintset$constraint.mHelperType = mHelperType;
	//  288  576:aload_1         
	//  289  577:aload_0         
	//  290  578:getfield        #227 <Field int mHelperType>
	//  291  581:putfield        #227 <Field int mHelperType>
		int ai[] = mReferenceIds;
	//  292  584:aload_0         
	//  293  585:getfield        #358 <Field int[] mReferenceIds>
	//  294  588:astore_2        
		if(ai != null)
	//* 295  589:aload_2         
	//* 296  590:ifnull          603
			constraintset$constraint.mReferenceIds = Arrays.copyOf(ai, ai.length);
	//  297  593:aload_1         
	//  298  594:aload_2         
	//  299  595:aload_2         
	//  300  596:arraylength     
	//  301  597:invokestatic    #380 <Method int[] Arrays.copyOf(int[], int)>
	//  302  600:putfield        #358 <Field int[] mReferenceIds>
		constraintset$constraint.circleConstraint = circleConstraint;
	//  303  603:aload_1         
	//  304  604:aload_0         
	//  305  605:getfield        #132 <Field int circleConstraint>
	//  306  608:putfield        #132 <Field int circleConstraint>
		constraintset$constraint.circleRadius = circleRadius;
	//  307  611:aload_1         
	//  308  612:aload_0         
	//  309  613:getfield        #134 <Field int circleRadius>
	//  310  616:putfield        #134 <Field int circleRadius>
		constraintset$constraint.circleAngle = circleAngle;
	//  311  619:aload_1         
	//  312  620:aload_0         
	//  313  621:getfield        #136 <Field float circleAngle>
	//  314  624:putfield        #136 <Field float circleAngle>
		return constraintset$constraint;
	//  315  627:aload_1         
	//  316  628:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #385 <Method ConstraintSet$Constraint clone()>
	//    2    4:areturn         
	}

	public float alpha;
	public boolean applyElevation;
	public int baselineToBaseline;
	public int bottomMargin;
	public int bottomToBottom;
	public int bottomToTop;
	public float circleAngle;
	public int circleConstraint;
	public int circleRadius;
	public boolean constrainedHeight;
	public boolean constrainedWidth;
	public String dimensionRatio;
	public int editorAbsoluteX;
	public int editorAbsoluteY;
	public float elevation;
	public int endMargin;
	public int endToEnd;
	public int endToStart;
	public int goneBottomMargin;
	public int goneEndMargin;
	public int goneLeftMargin;
	public int goneRightMargin;
	public int goneStartMargin;
	public int goneTopMargin;
	public int guideBegin;
	public int guideEnd;
	public float guidePercent;
	public int heightDefault;
	public int heightMax;
	public int heightMin;
	public float heightPercent;
	public float horizontalBias;
	public int horizontalChainStyle;
	public float horizontalWeight;
	public int leftMargin;
	public int leftToLeft;
	public int leftToRight;
	public int mBarrierDirection;
	public int mHeight;
	public int mHelperType;
	boolean mIsGuideline;
	public int mReferenceIds[];
	int mViewId;
	public int mWidth;
	public int orientation;
	public int rightMargin;
	public int rightToLeft;
	public int rightToRight;
	public float rotation;
	public float rotationX;
	public float rotationY;
	public float scaleX;
	public float scaleY;
	public int startMargin;
	public int startToEnd;
	public int startToStart;
	public int topMargin;
	public int topToBottom;
	public int topToTop;
	public float transformPivotX;
	public float transformPivotY;
	public float translationX;
	public float translationY;
	public float translationZ;
	public float verticalBias;
	public int verticalChainStyle;
	public float verticalWeight;
	public int visibility;
	public int widthDefault;
	public int widthMax;
	public int widthMin;
	public float widthPercent;


/*
	static void access$100(ConstraintSet$Constraint constraintset$constraint, int i, rams rams)
	{
		constraintset$constraint.fillFrom(i, rams);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #236 <Method void fillFrom(int, ConstraintLayout$LayoutParams)>
		return;
	//    4    6:return          
	}

*/


/*
	static void access$200(ConstraintSet$Constraint constraintset$constraint, ConstraintHelper constrainthelper, int i, Constraints$LayoutParams constraints$layoutparams)
	{
		constraintset$constraint.fillFromConstraints(constrainthelper, i, constraints$layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #242 <Method void fillFromConstraints(ConstraintHelper, int, Constraints$LayoutParams)>
		return;
	//    5    7:return          
	}

*/


/*
	static void access$300(ConstraintSet$Constraint constraintset$constraint, int i, Constraints$LayoutParams constraints$layoutparams)
	{
		constraintset$constraint.fillFromConstraints(i, constraints$layoutparams);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #247 <Method void fillFromConstraints(int, Constraints$LayoutParams)>
		return;
	//    4    6:return          
	}

*/

	private ConstraintSet$Constraint()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #88  <Method void Object()>
		mIsGuideline = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #90  <Field boolean mIsGuideline>
		guideBegin = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #92  <Field int guideBegin>
		guideEnd = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #94  <Field int guideEnd>
		guidePercent = -1F;
	//   11   19:aload_0         
	//   12   20:ldc1            #95  <Float -1F>
	//   13   22:putfield        #97  <Field float guidePercent>
		leftToLeft = -1;
	//   14   25:aload_0         
	//   15   26:iconst_m1       
	//   16   27:putfield        #99  <Field int leftToLeft>
		leftToRight = -1;
	//   17   30:aload_0         
	//   18   31:iconst_m1       
	//   19   32:putfield        #101 <Field int leftToRight>
		rightToLeft = -1;
	//   20   35:aload_0         
	//   21   36:iconst_m1       
	//   22   37:putfield        #103 <Field int rightToLeft>
		rightToRight = -1;
	//   23   40:aload_0         
	//   24   41:iconst_m1       
	//   25   42:putfield        #105 <Field int rightToRight>
		topToTop = -1;
	//   26   45:aload_0         
	//   27   46:iconst_m1       
	//   28   47:putfield        #107 <Field int topToTop>
		topToBottom = -1;
	//   29   50:aload_0         
	//   30   51:iconst_m1       
	//   31   52:putfield        #109 <Field int topToBottom>
		bottomToTop = -1;
	//   32   55:aload_0         
	//   33   56:iconst_m1       
	//   34   57:putfield        #111 <Field int bottomToTop>
		bottomToBottom = -1;
	//   35   60:aload_0         
	//   36   61:iconst_m1       
	//   37   62:putfield        #113 <Field int bottomToBottom>
		baselineToBaseline = -1;
	//   38   65:aload_0         
	//   39   66:iconst_m1       
	//   40   67:putfield        #115 <Field int baselineToBaseline>
		startToEnd = -1;
	//   41   70:aload_0         
	//   42   71:iconst_m1       
	//   43   72:putfield        #117 <Field int startToEnd>
		startToStart = -1;
	//   44   75:aload_0         
	//   45   76:iconst_m1       
	//   46   77:putfield        #119 <Field int startToStart>
		endToStart = -1;
	//   47   80:aload_0         
	//   48   81:iconst_m1       
	//   49   82:putfield        #121 <Field int endToStart>
		endToEnd = -1;
	//   50   85:aload_0         
	//   51   86:iconst_m1       
	//   52   87:putfield        #123 <Field int endToEnd>
		horizontalBias = 0.5F;
	//   53   90:aload_0         
	//   54   91:ldc1            #124 <Float 0.5F>
	//   55   93:putfield        #126 <Field float horizontalBias>
		verticalBias = 0.5F;
	//   56   96:aload_0         
	//   57   97:ldc1            #124 <Float 0.5F>
	//   58   99:putfield        #128 <Field float verticalBias>
		dimensionRatio = null;
	//   59  102:aload_0         
	//   60  103:aconst_null     
	//   61  104:putfield        #130 <Field String dimensionRatio>
		circleConstraint = -1;
	//   62  107:aload_0         
	//   63  108:iconst_m1       
	//   64  109:putfield        #132 <Field int circleConstraint>
		circleRadius = 0;
	//   65  112:aload_0         
	//   66  113:iconst_0        
	//   67  114:putfield        #134 <Field int circleRadius>
		circleAngle = 0.0F;
	//   68  117:aload_0         
	//   69  118:fconst_0        
	//   70  119:putfield        #136 <Field float circleAngle>
		editorAbsoluteX = -1;
	//   71  122:aload_0         
	//   72  123:iconst_m1       
	//   73  124:putfield        #138 <Field int editorAbsoluteX>
		editorAbsoluteY = -1;
	//   74  127:aload_0         
	//   75  128:iconst_m1       
	//   76  129:putfield        #140 <Field int editorAbsoluteY>
		orientation = -1;
	//   77  132:aload_0         
	//   78  133:iconst_m1       
	//   79  134:putfield        #142 <Field int orientation>
		leftMargin = -1;
	//   80  137:aload_0         
	//   81  138:iconst_m1       
	//   82  139:putfield        #144 <Field int leftMargin>
		rightMargin = -1;
	//   83  142:aload_0         
	//   84  143:iconst_m1       
	//   85  144:putfield        #146 <Field int rightMargin>
		topMargin = -1;
	//   86  147:aload_0         
	//   87  148:iconst_m1       
	//   88  149:putfield        #148 <Field int topMargin>
		bottomMargin = -1;
	//   89  152:aload_0         
	//   90  153:iconst_m1       
	//   91  154:putfield        #150 <Field int bottomMargin>
		endMargin = -1;
	//   92  157:aload_0         
	//   93  158:iconst_m1       
	//   94  159:putfield        #152 <Field int endMargin>
		startMargin = -1;
	//   95  162:aload_0         
	//   96  163:iconst_m1       
	//   97  164:putfield        #154 <Field int startMargin>
		visibility = 0;
	//   98  167:aload_0         
	//   99  168:iconst_0        
	//  100  169:putfield        #156 <Field int visibility>
		goneLeftMargin = -1;
	//  101  172:aload_0         
	//  102  173:iconst_m1       
	//  103  174:putfield        #158 <Field int goneLeftMargin>
		goneTopMargin = -1;
	//  104  177:aload_0         
	//  105  178:iconst_m1       
	//  106  179:putfield        #160 <Field int goneTopMargin>
		goneRightMargin = -1;
	//  107  182:aload_0         
	//  108  183:iconst_m1       
	//  109  184:putfield        #162 <Field int goneRightMargin>
		goneBottomMargin = -1;
	//  110  187:aload_0         
	//  111  188:iconst_m1       
	//  112  189:putfield        #164 <Field int goneBottomMargin>
		goneEndMargin = -1;
	//  113  192:aload_0         
	//  114  193:iconst_m1       
	//  115  194:putfield        #166 <Field int goneEndMargin>
		goneStartMargin = -1;
	//  116  197:aload_0         
	//  117  198:iconst_m1       
	//  118  199:putfield        #168 <Field int goneStartMargin>
		verticalWeight = 0.0F;
	//  119  202:aload_0         
	//  120  203:fconst_0        
	//  121  204:putfield        #170 <Field float verticalWeight>
		horizontalWeight = 0.0F;
	//  122  207:aload_0         
	//  123  208:fconst_0        
	//  124  209:putfield        #172 <Field float horizontalWeight>
		horizontalChainStyle = 0;
	//  125  212:aload_0         
	//  126  213:iconst_0        
	//  127  214:putfield        #174 <Field int horizontalChainStyle>
		verticalChainStyle = 0;
	//  128  217:aload_0         
	//  129  218:iconst_0        
	//  130  219:putfield        #176 <Field int verticalChainStyle>
		alpha = 1.0F;
	//  131  222:aload_0         
	//  132  223:fconst_1        
	//  133  224:putfield        #178 <Field float alpha>
		applyElevation = false;
	//  134  227:aload_0         
	//  135  228:iconst_0        
	//  136  229:putfield        #180 <Field boolean applyElevation>
		elevation = 0.0F;
	//  137  232:aload_0         
	//  138  233:fconst_0        
	//  139  234:putfield        #182 <Field float elevation>
		rotation = 0.0F;
	//  140  237:aload_0         
	//  141  238:fconst_0        
	//  142  239:putfield        #184 <Field float rotation>
		rotationX = 0.0F;
	//  143  242:aload_0         
	//  144  243:fconst_0        
	//  145  244:putfield        #186 <Field float rotationX>
		rotationY = 0.0F;
	//  146  247:aload_0         
	//  147  248:fconst_0        
	//  148  249:putfield        #188 <Field float rotationY>
		scaleX = 1.0F;
	//  149  252:aload_0         
	//  150  253:fconst_1        
	//  151  254:putfield        #190 <Field float scaleX>
		scaleY = 1.0F;
	//  152  257:aload_0         
	//  153  258:fconst_1        
	//  154  259:putfield        #192 <Field float scaleY>
		transformPivotX = (0.0F / 0.0F);
	//  155  262:aload_0         
	//  156  263:ldc1            #193 <Float (0.0F / 0.0F)>
	//  157  265:putfield        #195 <Field float transformPivotX>
		transformPivotY = (0.0F / 0.0F);
	//  158  268:aload_0         
	//  159  269:ldc1            #193 <Float (0.0F / 0.0F)>
	//  160  271:putfield        #197 <Field float transformPivotY>
		translationX = 0.0F;
	//  161  274:aload_0         
	//  162  275:fconst_0        
	//  163  276:putfield        #199 <Field float translationX>
		translationY = 0.0F;
	//  164  279:aload_0         
	//  165  280:fconst_0        
	//  166  281:putfield        #201 <Field float translationY>
		translationZ = 0.0F;
	//  167  284:aload_0         
	//  168  285:fconst_0        
	//  169  286:putfield        #203 <Field float translationZ>
		constrainedWidth = false;
	//  170  289:aload_0         
	//  171  290:iconst_0        
	//  172  291:putfield        #205 <Field boolean constrainedWidth>
		constrainedHeight = false;
	//  173  294:aload_0         
	//  174  295:iconst_0        
	//  175  296:putfield        #207 <Field boolean constrainedHeight>
		widthDefault = 0;
	//  176  299:aload_0         
	//  177  300:iconst_0        
	//  178  301:putfield        #209 <Field int widthDefault>
		heightDefault = 0;
	//  179  304:aload_0         
	//  180  305:iconst_0        
	//  181  306:putfield        #211 <Field int heightDefault>
		widthMax = -1;
	//  182  309:aload_0         
	//  183  310:iconst_m1       
	//  184  311:putfield        #213 <Field int widthMax>
		heightMax = -1;
	//  185  314:aload_0         
	//  186  315:iconst_m1       
	//  187  316:putfield        #215 <Field int heightMax>
		widthMin = -1;
	//  188  319:aload_0         
	//  189  320:iconst_m1       
	//  190  321:putfield        #217 <Field int widthMin>
		heightMin = -1;
	//  191  324:aload_0         
	//  192  325:iconst_m1       
	//  193  326:putfield        #219 <Field int heightMin>
		widthPercent = 1.0F;
	//  194  329:aload_0         
	//  195  330:fconst_1        
	//  196  331:putfield        #221 <Field float widthPercent>
		heightPercent = 1.0F;
	//  197  334:aload_0         
	//  198  335:fconst_1        
	//  199  336:putfield        #223 <Field float heightPercent>
		mBarrierDirection = -1;
	//  200  339:aload_0         
	//  201  340:iconst_m1       
	//  202  341:putfield        #225 <Field int mBarrierDirection>
		mHelperType = -1;
	//  203  344:aload_0         
	//  204  345:iconst_m1       
	//  205  346:putfield        #227 <Field int mHelperType>
	//  206  349:return          
	}

	ConstraintSet$Constraint(ConstraintSet._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #230 <Method void ConstraintSet$Constraint()>
	//    2    4:return          
	}
}
