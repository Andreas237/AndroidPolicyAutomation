// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.*;
import android.view.LayoutInflater;
import android.view.View;
import java.io.IOException;
import java.util.*;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.support.constraint:
//			ConstraintLayout, Barrier, Guideline, Constraints, 
//			ConstraintHelper

public class ConstraintSet
{
	private static class Constraint
	{

		private void fillFrom(int i, ConstraintLayout.LayoutParams layoutparams)
		{
			mViewId = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #251 <Field int mViewId>
			leftToLeft = layoutparams.leftToLeft;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:getfield        #254 <Field int ConstraintLayout$LayoutParams.leftToLeft>
		//    6   10:putfield        #101 <Field int leftToLeft>
			leftToRight = layoutparams.leftToRight;
		//    7   13:aload_0         
		//    8   14:aload_2         
		//    9   15:getfield        #255 <Field int ConstraintLayout$LayoutParams.leftToRight>
		//   10   18:putfield        #103 <Field int leftToRight>
			rightToLeft = layoutparams.rightToLeft;
		//   11   21:aload_0         
		//   12   22:aload_2         
		//   13   23:getfield        #256 <Field int ConstraintLayout$LayoutParams.rightToLeft>
		//   14   26:putfield        #105 <Field int rightToLeft>
			rightToRight = layoutparams.rightToRight;
		//   15   29:aload_0         
		//   16   30:aload_2         
		//   17   31:getfield        #257 <Field int ConstraintLayout$LayoutParams.rightToRight>
		//   18   34:putfield        #107 <Field int rightToRight>
			topToTop = layoutparams.topToTop;
		//   19   37:aload_0         
		//   20   38:aload_2         
		//   21   39:getfield        #258 <Field int ConstraintLayout$LayoutParams.topToTop>
		//   22   42:putfield        #109 <Field int topToTop>
			topToBottom = layoutparams.topToBottom;
		//   23   45:aload_0         
		//   24   46:aload_2         
		//   25   47:getfield        #259 <Field int ConstraintLayout$LayoutParams.topToBottom>
		//   26   50:putfield        #111 <Field int topToBottom>
			bottomToTop = layoutparams.bottomToTop;
		//   27   53:aload_0         
		//   28   54:aload_2         
		//   29   55:getfield        #260 <Field int ConstraintLayout$LayoutParams.bottomToTop>
		//   30   58:putfield        #113 <Field int bottomToTop>
			bottomToBottom = layoutparams.bottomToBottom;
		//   31   61:aload_0         
		//   32   62:aload_2         
		//   33   63:getfield        #261 <Field int ConstraintLayout$LayoutParams.bottomToBottom>
		//   34   66:putfield        #115 <Field int bottomToBottom>
			baselineToBaseline = layoutparams.baselineToBaseline;
		//   35   69:aload_0         
		//   36   70:aload_2         
		//   37   71:getfield        #262 <Field int ConstraintLayout$LayoutParams.baselineToBaseline>
		//   38   74:putfield        #117 <Field int baselineToBaseline>
			startToEnd = layoutparams.startToEnd;
		//   39   77:aload_0         
		//   40   78:aload_2         
		//   41   79:getfield        #263 <Field int ConstraintLayout$LayoutParams.startToEnd>
		//   42   82:putfield        #119 <Field int startToEnd>
			startToStart = layoutparams.startToStart;
		//   43   85:aload_0         
		//   44   86:aload_2         
		//   45   87:getfield        #264 <Field int ConstraintLayout$LayoutParams.startToStart>
		//   46   90:putfield        #121 <Field int startToStart>
			endToStart = layoutparams.endToStart;
		//   47   93:aload_0         
		//   48   94:aload_2         
		//   49   95:getfield        #265 <Field int ConstraintLayout$LayoutParams.endToStart>
		//   50   98:putfield        #123 <Field int endToStart>
			endToEnd = layoutparams.endToEnd;
		//   51  101:aload_0         
		//   52  102:aload_2         
		//   53  103:getfield        #266 <Field int ConstraintLayout$LayoutParams.endToEnd>
		//   54  106:putfield        #125 <Field int endToEnd>
			horizontalBias = layoutparams.horizontalBias;
		//   55  109:aload_0         
		//   56  110:aload_2         
		//   57  111:getfield        #267 <Field float ConstraintLayout$LayoutParams.horizontalBias>
		//   58  114:putfield        #128 <Field float horizontalBias>
			verticalBias = layoutparams.verticalBias;
		//   59  117:aload_0         
		//   60  118:aload_2         
		//   61  119:getfield        #268 <Field float ConstraintLayout$LayoutParams.verticalBias>
		//   62  122:putfield        #130 <Field float verticalBias>
			dimensionRatio = layoutparams.dimensionRatio;
		//   63  125:aload_0         
		//   64  126:aload_2         
		//   65  127:getfield        #269 <Field String ConstraintLayout$LayoutParams.dimensionRatio>
		//   66  130:putfield        #132 <Field String dimensionRatio>
			circleConstraint = layoutparams.circleConstraint;
		//   67  133:aload_0         
		//   68  134:aload_2         
		//   69  135:getfield        #270 <Field int ConstraintLayout$LayoutParams.circleConstraint>
		//   70  138:putfield        #134 <Field int circleConstraint>
			circleRadius = layoutparams.circleRadius;
		//   71  141:aload_0         
		//   72  142:aload_2         
		//   73  143:getfield        #271 <Field int ConstraintLayout$LayoutParams.circleRadius>
		//   74  146:putfield        #136 <Field int circleRadius>
			circleAngle = layoutparams.circleAngle;
		//   75  149:aload_0         
		//   76  150:aload_2         
		//   77  151:getfield        #272 <Field float ConstraintLayout$LayoutParams.circleAngle>
		//   78  154:putfield        #138 <Field float circleAngle>
			editorAbsoluteX = layoutparams.editorAbsoluteX;
		//   79  157:aload_0         
		//   80  158:aload_2         
		//   81  159:getfield        #273 <Field int ConstraintLayout$LayoutParams.editorAbsoluteX>
		//   82  162:putfield        #140 <Field int editorAbsoluteX>
			editorAbsoluteY = layoutparams.editorAbsoluteY;
		//   83  165:aload_0         
		//   84  166:aload_2         
		//   85  167:getfield        #274 <Field int ConstraintLayout$LayoutParams.editorAbsoluteY>
		//   86  170:putfield        #142 <Field int editorAbsoluteY>
			orientation = layoutparams.orientation;
		//   87  173:aload_0         
		//   88  174:aload_2         
		//   89  175:getfield        #275 <Field int ConstraintLayout$LayoutParams.orientation>
		//   90  178:putfield        #144 <Field int orientation>
			guidePercent = layoutparams.guidePercent;
		//   91  181:aload_0         
		//   92  182:aload_2         
		//   93  183:getfield        #276 <Field float ConstraintLayout$LayoutParams.guidePercent>
		//   94  186:putfield        #99  <Field float guidePercent>
			guideBegin = layoutparams.guideBegin;
		//   95  189:aload_0         
		//   96  190:aload_2         
		//   97  191:getfield        #277 <Field int ConstraintLayout$LayoutParams.guideBegin>
		//   98  194:putfield        #94  <Field int guideBegin>
			guideEnd = layoutparams.guideEnd;
		//   99  197:aload_0         
		//  100  198:aload_2         
		//  101  199:getfield        #278 <Field int ConstraintLayout$LayoutParams.guideEnd>
		//  102  202:putfield        #96  <Field int guideEnd>
			mWidth = layoutparams.width;
		//  103  205:aload_0         
		//  104  206:aload_2         
		//  105  207:getfield        #281 <Field int ConstraintLayout$LayoutParams.width>
		//  106  210:putfield        #283 <Field int mWidth>
			mHeight = layoutparams.height;
		//  107  213:aload_0         
		//  108  214:aload_2         
		//  109  215:getfield        #286 <Field int ConstraintLayout$LayoutParams.height>
		//  110  218:putfield        #288 <Field int mHeight>
			leftMargin = layoutparams.leftMargin;
		//  111  221:aload_0         
		//  112  222:aload_2         
		//  113  223:getfield        #289 <Field int ConstraintLayout$LayoutParams.leftMargin>
		//  114  226:putfield        #146 <Field int leftMargin>
			rightMargin = layoutparams.rightMargin;
		//  115  229:aload_0         
		//  116  230:aload_2         
		//  117  231:getfield        #290 <Field int ConstraintLayout$LayoutParams.rightMargin>
		//  118  234:putfield        #148 <Field int rightMargin>
			topMargin = layoutparams.topMargin;
		//  119  237:aload_0         
		//  120  238:aload_2         
		//  121  239:getfield        #291 <Field int ConstraintLayout$LayoutParams.topMargin>
		//  122  242:putfield        #150 <Field int topMargin>
			bottomMargin = layoutparams.bottomMargin;
		//  123  245:aload_0         
		//  124  246:aload_2         
		//  125  247:getfield        #292 <Field int ConstraintLayout$LayoutParams.bottomMargin>
		//  126  250:putfield        #152 <Field int bottomMargin>
			verticalWeight = layoutparams.verticalWeight;
		//  127  253:aload_0         
		//  128  254:aload_2         
		//  129  255:getfield        #293 <Field float ConstraintLayout$LayoutParams.verticalWeight>
		//  130  258:putfield        #172 <Field float verticalWeight>
			horizontalWeight = layoutparams.horizontalWeight;
		//  131  261:aload_0         
		//  132  262:aload_2         
		//  133  263:getfield        #294 <Field float ConstraintLayout$LayoutParams.horizontalWeight>
		//  134  266:putfield        #174 <Field float horizontalWeight>
			verticalChainStyle = layoutparams.verticalChainStyle;
		//  135  269:aload_0         
		//  136  270:aload_2         
		//  137  271:getfield        #295 <Field int ConstraintLayout$LayoutParams.verticalChainStyle>
		//  138  274:putfield        #178 <Field int verticalChainStyle>
			horizontalChainStyle = layoutparams.horizontalChainStyle;
		//  139  277:aload_0         
		//  140  278:aload_2         
		//  141  279:getfield        #296 <Field int ConstraintLayout$LayoutParams.horizontalChainStyle>
		//  142  282:putfield        #176 <Field int horizontalChainStyle>
			constrainedWidth = layoutparams.constrainedWidth;
		//  143  285:aload_0         
		//  144  286:aload_2         
		//  145  287:getfield        #297 <Field boolean ConstraintLayout$LayoutParams.constrainedWidth>
		//  146  290:putfield        #207 <Field boolean constrainedWidth>
			constrainedHeight = layoutparams.constrainedHeight;
		//  147  293:aload_0         
		//  148  294:aload_2         
		//  149  295:getfield        #298 <Field boolean ConstraintLayout$LayoutParams.constrainedHeight>
		//  150  298:putfield        #209 <Field boolean constrainedHeight>
			widthDefault = layoutparams.matchConstraintDefaultWidth;
		//  151  301:aload_0         
		//  152  302:aload_2         
		//  153  303:getfield        #301 <Field int ConstraintLayout$LayoutParams.matchConstraintDefaultWidth>
		//  154  306:putfield        #211 <Field int widthDefault>
			heightDefault = layoutparams.matchConstraintDefaultHeight;
		//  155  309:aload_0         
		//  156  310:aload_2         
		//  157  311:getfield        #304 <Field int ConstraintLayout$LayoutParams.matchConstraintDefaultHeight>
		//  158  314:putfield        #213 <Field int heightDefault>
			constrainedWidth = layoutparams.constrainedWidth;
		//  159  317:aload_0         
		//  160  318:aload_2         
		//  161  319:getfield        #297 <Field boolean ConstraintLayout$LayoutParams.constrainedWidth>
		//  162  322:putfield        #207 <Field boolean constrainedWidth>
			widthMax = layoutparams.matchConstraintMaxWidth;
		//  163  325:aload_0         
		//  164  326:aload_2         
		//  165  327:getfield        #307 <Field int ConstraintLayout$LayoutParams.matchConstraintMaxWidth>
		//  166  330:putfield        #215 <Field int widthMax>
			heightMax = layoutparams.matchConstraintMaxHeight;
		//  167  333:aload_0         
		//  168  334:aload_2         
		//  169  335:getfield        #310 <Field int ConstraintLayout$LayoutParams.matchConstraintMaxHeight>
		//  170  338:putfield        #217 <Field int heightMax>
			widthMin = layoutparams.matchConstraintMinWidth;
		//  171  341:aload_0         
		//  172  342:aload_2         
		//  173  343:getfield        #313 <Field int ConstraintLayout$LayoutParams.matchConstraintMinWidth>
		//  174  346:putfield        #219 <Field int widthMin>
			heightMin = layoutparams.matchConstraintMinHeight;
		//  175  349:aload_0         
		//  176  350:aload_2         
		//  177  351:getfield        #316 <Field int ConstraintLayout$LayoutParams.matchConstraintMinHeight>
		//  178  354:putfield        #221 <Field int heightMin>
			widthPercent = layoutparams.matchConstraintPercentWidth;
		//  179  357:aload_0         
		//  180  358:aload_2         
		//  181  359:getfield        #319 <Field float ConstraintLayout$LayoutParams.matchConstraintPercentWidth>
		//  182  362:putfield        #223 <Field float widthPercent>
			heightPercent = layoutparams.matchConstraintPercentHeight;
		//  183  365:aload_0         
		//  184  366:aload_2         
		//  185  367:getfield        #322 <Field float ConstraintLayout$LayoutParams.matchConstraintPercentHeight>
		//  186  370:putfield        #225 <Field float heightPercent>
			if(android.os.Build.VERSION.SDK_INT >= 17)
		//* 187  373:getstatic       #327 <Field int android.os.Build$VERSION.SDK_INT>
		//* 188  376:bipush          17
		//* 189  378:icmplt          397
			{
				endMargin = layoutparams.getMarginEnd();
		//  190  381:aload_0         
		//  191  382:aload_2         
		//  192  383:invokevirtual   #331 <Method int ConstraintLayout$LayoutParams.getMarginEnd()>
		//  193  386:putfield        #154 <Field int endMargin>
				startMargin = layoutparams.getMarginStart();
		//  194  389:aload_0         
		//  195  390:aload_2         
		//  196  391:invokevirtual   #334 <Method int ConstraintLayout$LayoutParams.getMarginStart()>
		//  197  394:putfield        #156 <Field int startMargin>
			}
		//  198  397:return          
		}

		private void fillFromConstraints(int i, Constraints.LayoutParams layoutparams)
		{
			fillFrom(i, ((ConstraintLayout.LayoutParams) (layoutparams)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #238 <Method void fillFrom(int, ConstraintLayout$LayoutParams)>
			alpha = layoutparams.alpha;
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:getfield        #337 <Field float Constraints$LayoutParams.alpha>
		//    7   11:putfield        #180 <Field float alpha>
			rotation = layoutparams.rotation;
		//    8   14:aload_0         
		//    9   15:aload_2         
		//   10   16:getfield        #338 <Field float Constraints$LayoutParams.rotation>
		//   11   19:putfield        #186 <Field float rotation>
			rotationX = layoutparams.rotationX;
		//   12   22:aload_0         
		//   13   23:aload_2         
		//   14   24:getfield        #339 <Field float Constraints$LayoutParams.rotationX>
		//   15   27:putfield        #188 <Field float rotationX>
			rotationY = layoutparams.rotationY;
		//   16   30:aload_0         
		//   17   31:aload_2         
		//   18   32:getfield        #340 <Field float Constraints$LayoutParams.rotationY>
		//   19   35:putfield        #190 <Field float rotationY>
			scaleX = layoutparams.scaleX;
		//   20   38:aload_0         
		//   21   39:aload_2         
		//   22   40:getfield        #341 <Field float Constraints$LayoutParams.scaleX>
		//   23   43:putfield        #192 <Field float scaleX>
			scaleY = layoutparams.scaleY;
		//   24   46:aload_0         
		//   25   47:aload_2         
		//   26   48:getfield        #342 <Field float Constraints$LayoutParams.scaleY>
		//   27   51:putfield        #194 <Field float scaleY>
			transformPivotX = layoutparams.transformPivotX;
		//   28   54:aload_0         
		//   29   55:aload_2         
		//   30   56:getfield        #343 <Field float Constraints$LayoutParams.transformPivotX>
		//   31   59:putfield        #197 <Field float transformPivotX>
			transformPivotY = layoutparams.transformPivotY;
		//   32   62:aload_0         
		//   33   63:aload_2         
		//   34   64:getfield        #344 <Field float Constraints$LayoutParams.transformPivotY>
		//   35   67:putfield        #199 <Field float transformPivotY>
			translationX = layoutparams.translationX;
		//   36   70:aload_0         
		//   37   71:aload_2         
		//   38   72:getfield        #345 <Field float Constraints$LayoutParams.translationX>
		//   39   75:putfield        #201 <Field float translationX>
			translationY = layoutparams.translationY;
		//   40   78:aload_0         
		//   41   79:aload_2         
		//   42   80:getfield        #346 <Field float Constraints$LayoutParams.translationY>
		//   43   83:putfield        #203 <Field float translationY>
			translationZ = layoutparams.translationZ;
		//   44   86:aload_0         
		//   45   87:aload_2         
		//   46   88:getfield        #347 <Field float Constraints$LayoutParams.translationZ>
		//   47   91:putfield        #205 <Field float translationZ>
			elevation = layoutparams.elevation;
		//   48   94:aload_0         
		//   49   95:aload_2         
		//   50   96:getfield        #348 <Field float Constraints$LayoutParams.elevation>
		//   51   99:putfield        #184 <Field float elevation>
			applyElevation = layoutparams.applyElevation;
		//   52  102:aload_0         
		//   53  103:aload_2         
		//   54  104:getfield        #349 <Field boolean Constraints$LayoutParams.applyElevation>
		//   55  107:putfield        #182 <Field boolean applyElevation>
		//   56  110:return          
		}

		private void fillFromConstraints(ConstraintHelper constrainthelper, int i, Constraints.LayoutParams layoutparams)
		{
			fillFromConstraints(i, layoutparams);
		//    0    0:aload_0         
		//    1    1:iload_2         
		//    2    2:aload_3         
		//    3    3:invokespecial   #249 <Method void fillFromConstraints(int, Constraints$LayoutParams)>
			if(constrainthelper instanceof Barrier)
		//*   4    6:aload_1         
		//*   5    7:instanceof      #351 <Class Barrier>
		//*   6   10:ifeq            39
			{
				mHelperType = 1;
		//    7   13:aload_0         
		//    8   14:iconst_1        
		//    9   15:putfield        #229 <Field int mHelperType>
				constrainthelper = ((ConstraintHelper) ((Barrier)constrainthelper));
		//   10   18:aload_1         
		//   11   19:checkcast       #351 <Class Barrier>
		//   12   22:astore_1        
				mBarrierDirection = ((Barrier) (constrainthelper)).getType();
		//   13   23:aload_0         
		//   14   24:aload_1         
		//   15   25:invokevirtual   #354 <Method int Barrier.getType()>
		//   16   28:putfield        #227 <Field int mBarrierDirection>
				mReferenceIds = ((Barrier) (constrainthelper)).getReferencedIds();
		//   17   31:aload_0         
		//   18   32:aload_1         
		//   19   33:invokevirtual   #358 <Method int[] Barrier.getReferencedIds()>
		//   20   36:putfield        #360 <Field int[] mReferenceIds>
			}
		//   21   39:return          
		}

		public void applyTo(ConstraintLayout.LayoutParams layoutparams)
		{
			layoutparams.leftToLeft = leftToLeft;
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #101 <Field int leftToLeft>
		//    3    5:putfield        #254 <Field int ConstraintLayout$LayoutParams.leftToLeft>
			layoutparams.leftToRight = leftToRight;
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #103 <Field int leftToRight>
		//    7   13:putfield        #255 <Field int ConstraintLayout$LayoutParams.leftToRight>
			layoutparams.rightToLeft = rightToLeft;
		//    8   16:aload_1         
		//    9   17:aload_0         
		//   10   18:getfield        #105 <Field int rightToLeft>
		//   11   21:putfield        #256 <Field int ConstraintLayout$LayoutParams.rightToLeft>
			layoutparams.rightToRight = rightToRight;
		//   12   24:aload_1         
		//   13   25:aload_0         
		//   14   26:getfield        #107 <Field int rightToRight>
		//   15   29:putfield        #257 <Field int ConstraintLayout$LayoutParams.rightToRight>
			layoutparams.topToTop = topToTop;
		//   16   32:aload_1         
		//   17   33:aload_0         
		//   18   34:getfield        #109 <Field int topToTop>
		//   19   37:putfield        #258 <Field int ConstraintLayout$LayoutParams.topToTop>
			layoutparams.topToBottom = topToBottom;
		//   20   40:aload_1         
		//   21   41:aload_0         
		//   22   42:getfield        #111 <Field int topToBottom>
		//   23   45:putfield        #259 <Field int ConstraintLayout$LayoutParams.topToBottom>
			layoutparams.bottomToTop = bottomToTop;
		//   24   48:aload_1         
		//   25   49:aload_0         
		//   26   50:getfield        #113 <Field int bottomToTop>
		//   27   53:putfield        #260 <Field int ConstraintLayout$LayoutParams.bottomToTop>
			layoutparams.bottomToBottom = bottomToBottom;
		//   28   56:aload_1         
		//   29   57:aload_0         
		//   30   58:getfield        #115 <Field int bottomToBottom>
		//   31   61:putfield        #261 <Field int ConstraintLayout$LayoutParams.bottomToBottom>
			layoutparams.baselineToBaseline = baselineToBaseline;
		//   32   64:aload_1         
		//   33   65:aload_0         
		//   34   66:getfield        #117 <Field int baselineToBaseline>
		//   35   69:putfield        #262 <Field int ConstraintLayout$LayoutParams.baselineToBaseline>
			layoutparams.startToEnd = startToEnd;
		//   36   72:aload_1         
		//   37   73:aload_0         
		//   38   74:getfield        #119 <Field int startToEnd>
		//   39   77:putfield        #263 <Field int ConstraintLayout$LayoutParams.startToEnd>
			layoutparams.startToStart = startToStart;
		//   40   80:aload_1         
		//   41   81:aload_0         
		//   42   82:getfield        #121 <Field int startToStart>
		//   43   85:putfield        #264 <Field int ConstraintLayout$LayoutParams.startToStart>
			layoutparams.endToStart = endToStart;
		//   44   88:aload_1         
		//   45   89:aload_0         
		//   46   90:getfield        #123 <Field int endToStart>
		//   47   93:putfield        #265 <Field int ConstraintLayout$LayoutParams.endToStart>
			layoutparams.endToEnd = endToEnd;
		//   48   96:aload_1         
		//   49   97:aload_0         
		//   50   98:getfield        #125 <Field int endToEnd>
		//   51  101:putfield        #266 <Field int ConstraintLayout$LayoutParams.endToEnd>
			layoutparams.leftMargin = leftMargin;
		//   52  104:aload_1         
		//   53  105:aload_0         
		//   54  106:getfield        #146 <Field int leftMargin>
		//   55  109:putfield        #289 <Field int ConstraintLayout$LayoutParams.leftMargin>
			layoutparams.rightMargin = rightMargin;
		//   56  112:aload_1         
		//   57  113:aload_0         
		//   58  114:getfield        #148 <Field int rightMargin>
		//   59  117:putfield        #290 <Field int ConstraintLayout$LayoutParams.rightMargin>
			layoutparams.topMargin = topMargin;
		//   60  120:aload_1         
		//   61  121:aload_0         
		//   62  122:getfield        #150 <Field int topMargin>
		//   63  125:putfield        #291 <Field int ConstraintLayout$LayoutParams.topMargin>
			layoutparams.bottomMargin = bottomMargin;
		//   64  128:aload_1         
		//   65  129:aload_0         
		//   66  130:getfield        #152 <Field int bottomMargin>
		//   67  133:putfield        #292 <Field int ConstraintLayout$LayoutParams.bottomMargin>
			layoutparams.goneStartMargin = goneStartMargin;
		//   68  136:aload_1         
		//   69  137:aload_0         
		//   70  138:getfield        #170 <Field int goneStartMargin>
		//   71  141:putfield        #363 <Field int ConstraintLayout$LayoutParams.goneStartMargin>
			layoutparams.goneEndMargin = goneEndMargin;
		//   72  144:aload_1         
		//   73  145:aload_0         
		//   74  146:getfield        #168 <Field int goneEndMargin>
		//   75  149:putfield        #364 <Field int ConstraintLayout$LayoutParams.goneEndMargin>
			layoutparams.horizontalBias = horizontalBias;
		//   76  152:aload_1         
		//   77  153:aload_0         
		//   78  154:getfield        #128 <Field float horizontalBias>
		//   79  157:putfield        #267 <Field float ConstraintLayout$LayoutParams.horizontalBias>
			layoutparams.verticalBias = verticalBias;
		//   80  160:aload_1         
		//   81  161:aload_0         
		//   82  162:getfield        #130 <Field float verticalBias>
		//   83  165:putfield        #268 <Field float ConstraintLayout$LayoutParams.verticalBias>
			layoutparams.circleConstraint = circleConstraint;
		//   84  168:aload_1         
		//   85  169:aload_0         
		//   86  170:getfield        #134 <Field int circleConstraint>
		//   87  173:putfield        #270 <Field int ConstraintLayout$LayoutParams.circleConstraint>
			layoutparams.circleRadius = circleRadius;
		//   88  176:aload_1         
		//   89  177:aload_0         
		//   90  178:getfield        #136 <Field int circleRadius>
		//   91  181:putfield        #271 <Field int ConstraintLayout$LayoutParams.circleRadius>
			layoutparams.circleAngle = circleAngle;
		//   92  184:aload_1         
		//   93  185:aload_0         
		//   94  186:getfield        #138 <Field float circleAngle>
		//   95  189:putfield        #272 <Field float ConstraintLayout$LayoutParams.circleAngle>
			layoutparams.dimensionRatio = dimensionRatio;
		//   96  192:aload_1         
		//   97  193:aload_0         
		//   98  194:getfield        #132 <Field String dimensionRatio>
		//   99  197:putfield        #269 <Field String ConstraintLayout$LayoutParams.dimensionRatio>
			layoutparams.editorAbsoluteX = editorAbsoluteX;
		//  100  200:aload_1         
		//  101  201:aload_0         
		//  102  202:getfield        #140 <Field int editorAbsoluteX>
		//  103  205:putfield        #273 <Field int ConstraintLayout$LayoutParams.editorAbsoluteX>
			layoutparams.editorAbsoluteY = editorAbsoluteY;
		//  104  208:aload_1         
		//  105  209:aload_0         
		//  106  210:getfield        #142 <Field int editorAbsoluteY>
		//  107  213:putfield        #274 <Field int ConstraintLayout$LayoutParams.editorAbsoluteY>
			layoutparams.verticalWeight = verticalWeight;
		//  108  216:aload_1         
		//  109  217:aload_0         
		//  110  218:getfield        #172 <Field float verticalWeight>
		//  111  221:putfield        #293 <Field float ConstraintLayout$LayoutParams.verticalWeight>
			layoutparams.horizontalWeight = horizontalWeight;
		//  112  224:aload_1         
		//  113  225:aload_0         
		//  114  226:getfield        #174 <Field float horizontalWeight>
		//  115  229:putfield        #294 <Field float ConstraintLayout$LayoutParams.horizontalWeight>
			layoutparams.verticalChainStyle = verticalChainStyle;
		//  116  232:aload_1         
		//  117  233:aload_0         
		//  118  234:getfield        #178 <Field int verticalChainStyle>
		//  119  237:putfield        #295 <Field int ConstraintLayout$LayoutParams.verticalChainStyle>
			layoutparams.horizontalChainStyle = horizontalChainStyle;
		//  120  240:aload_1         
		//  121  241:aload_0         
		//  122  242:getfield        #176 <Field int horizontalChainStyle>
		//  123  245:putfield        #296 <Field int ConstraintLayout$LayoutParams.horizontalChainStyle>
			layoutparams.constrainedWidth = constrainedWidth;
		//  124  248:aload_1         
		//  125  249:aload_0         
		//  126  250:getfield        #207 <Field boolean constrainedWidth>
		//  127  253:putfield        #297 <Field boolean ConstraintLayout$LayoutParams.constrainedWidth>
			layoutparams.constrainedHeight = constrainedHeight;
		//  128  256:aload_1         
		//  129  257:aload_0         
		//  130  258:getfield        #209 <Field boolean constrainedHeight>
		//  131  261:putfield        #298 <Field boolean ConstraintLayout$LayoutParams.constrainedHeight>
			layoutparams.matchConstraintDefaultWidth = widthDefault;
		//  132  264:aload_1         
		//  133  265:aload_0         
		//  134  266:getfield        #211 <Field int widthDefault>
		//  135  269:putfield        #301 <Field int ConstraintLayout$LayoutParams.matchConstraintDefaultWidth>
			layoutparams.matchConstraintDefaultHeight = heightDefault;
		//  136  272:aload_1         
		//  137  273:aload_0         
		//  138  274:getfield        #213 <Field int heightDefault>
		//  139  277:putfield        #304 <Field int ConstraintLayout$LayoutParams.matchConstraintDefaultHeight>
			layoutparams.matchConstraintMaxWidth = widthMax;
		//  140  280:aload_1         
		//  141  281:aload_0         
		//  142  282:getfield        #215 <Field int widthMax>
		//  143  285:putfield        #307 <Field int ConstraintLayout$LayoutParams.matchConstraintMaxWidth>
			layoutparams.matchConstraintMaxHeight = heightMax;
		//  144  288:aload_1         
		//  145  289:aload_0         
		//  146  290:getfield        #217 <Field int heightMax>
		//  147  293:putfield        #310 <Field int ConstraintLayout$LayoutParams.matchConstraintMaxHeight>
			layoutparams.matchConstraintMinWidth = widthMin;
		//  148  296:aload_1         
		//  149  297:aload_0         
		//  150  298:getfield        #219 <Field int widthMin>
		//  151  301:putfield        #313 <Field int ConstraintLayout$LayoutParams.matchConstraintMinWidth>
			layoutparams.matchConstraintMinHeight = heightMin;
		//  152  304:aload_1         
		//  153  305:aload_0         
		//  154  306:getfield        #221 <Field int heightMin>
		//  155  309:putfield        #316 <Field int ConstraintLayout$LayoutParams.matchConstraintMinHeight>
			layoutparams.matchConstraintPercentWidth = widthPercent;
		//  156  312:aload_1         
		//  157  313:aload_0         
		//  158  314:getfield        #223 <Field float widthPercent>
		//  159  317:putfield        #319 <Field float ConstraintLayout$LayoutParams.matchConstraintPercentWidth>
			layoutparams.matchConstraintPercentHeight = heightPercent;
		//  160  320:aload_1         
		//  161  321:aload_0         
		//  162  322:getfield        #225 <Field float heightPercent>
		//  163  325:putfield        #322 <Field float ConstraintLayout$LayoutParams.matchConstraintPercentHeight>
			layoutparams.orientation = orientation;
		//  164  328:aload_1         
		//  165  329:aload_0         
		//  166  330:getfield        #144 <Field int orientation>
		//  167  333:putfield        #275 <Field int ConstraintLayout$LayoutParams.orientation>
			layoutparams.guidePercent = guidePercent;
		//  168  336:aload_1         
		//  169  337:aload_0         
		//  170  338:getfield        #99  <Field float guidePercent>
		//  171  341:putfield        #276 <Field float ConstraintLayout$LayoutParams.guidePercent>
			layoutparams.guideBegin = guideBegin;
		//  172  344:aload_1         
		//  173  345:aload_0         
		//  174  346:getfield        #94  <Field int guideBegin>
		//  175  349:putfield        #277 <Field int ConstraintLayout$LayoutParams.guideBegin>
			layoutparams.guideEnd = guideEnd;
		//  176  352:aload_1         
		//  177  353:aload_0         
		//  178  354:getfield        #96  <Field int guideEnd>
		//  179  357:putfield        #278 <Field int ConstraintLayout$LayoutParams.guideEnd>
			layoutparams.width = mWidth;
		//  180  360:aload_1         
		//  181  361:aload_0         
		//  182  362:getfield        #283 <Field int mWidth>
		//  183  365:putfield        #281 <Field int ConstraintLayout$LayoutParams.width>
			layoutparams.height = mHeight;
		//  184  368:aload_1         
		//  185  369:aload_0         
		//  186  370:getfield        #288 <Field int mHeight>
		//  187  373:putfield        #286 <Field int ConstraintLayout$LayoutParams.height>
			if(android.os.Build.VERSION.SDK_INT >= 17)
		//* 188  376:getstatic       #327 <Field int android.os.Build$VERSION.SDK_INT>
		//* 189  379:bipush          17
		//* 190  381:icmplt          400
			{
				layoutparams.setMarginStart(startMargin);
		//  191  384:aload_1         
		//  192  385:aload_0         
		//  193  386:getfield        #156 <Field int startMargin>
		//  194  389:invokevirtual   #368 <Method void ConstraintLayout$LayoutParams.setMarginStart(int)>
				layoutparams.setMarginEnd(endMargin);
		//  195  392:aload_1         
		//  196  393:aload_0         
		//  197  394:getfield        #154 <Field int endMargin>
		//  198  397:invokevirtual   #371 <Method void ConstraintLayout$LayoutParams.setMarginEnd(int)>
			}
			layoutparams.validate();
		//  199  400:aload_1         
		//  200  401:invokevirtual   #374 <Method void ConstraintLayout$LayoutParams.validate()>
		//  201  404:return          
		}

		public Constraint clone()
		{
			Constraint constraint = new Constraint();
		//    0    0:new             #2   <Class ConstraintSet$Constraint>
		//    1    3:dup             
		//    2    4:invokespecial   #232 <Method void ConstraintSet$Constraint()>
		//    3    7:astore_1        
			constraint.mIsGuideline = mIsGuideline;
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #92  <Field boolean mIsGuideline>
		//    7   13:putfield        #92  <Field boolean mIsGuideline>
			constraint.mWidth = mWidth;
		//    8   16:aload_1         
		//    9   17:aload_0         
		//   10   18:getfield        #283 <Field int mWidth>
		//   11   21:putfield        #283 <Field int mWidth>
			constraint.mHeight = mHeight;
		//   12   24:aload_1         
		//   13   25:aload_0         
		//   14   26:getfield        #288 <Field int mHeight>
		//   15   29:putfield        #288 <Field int mHeight>
			constraint.guideBegin = guideBegin;
		//   16   32:aload_1         
		//   17   33:aload_0         
		//   18   34:getfield        #94  <Field int guideBegin>
		//   19   37:putfield        #94  <Field int guideBegin>
			constraint.guideEnd = guideEnd;
		//   20   40:aload_1         
		//   21   41:aload_0         
		//   22   42:getfield        #96  <Field int guideEnd>
		//   23   45:putfield        #96  <Field int guideEnd>
			constraint.guidePercent = guidePercent;
		//   24   48:aload_1         
		//   25   49:aload_0         
		//   26   50:getfield        #99  <Field float guidePercent>
		//   27   53:putfield        #99  <Field float guidePercent>
			constraint.leftToLeft = leftToLeft;
		//   28   56:aload_1         
		//   29   57:aload_0         
		//   30   58:getfield        #101 <Field int leftToLeft>
		//   31   61:putfield        #101 <Field int leftToLeft>
			constraint.leftToRight = leftToRight;
		//   32   64:aload_1         
		//   33   65:aload_0         
		//   34   66:getfield        #103 <Field int leftToRight>
		//   35   69:putfield        #103 <Field int leftToRight>
			constraint.rightToLeft = rightToLeft;
		//   36   72:aload_1         
		//   37   73:aload_0         
		//   38   74:getfield        #105 <Field int rightToLeft>
		//   39   77:putfield        #105 <Field int rightToLeft>
			constraint.rightToRight = rightToRight;
		//   40   80:aload_1         
		//   41   81:aload_0         
		//   42   82:getfield        #107 <Field int rightToRight>
		//   43   85:putfield        #107 <Field int rightToRight>
			constraint.topToTop = topToTop;
		//   44   88:aload_1         
		//   45   89:aload_0         
		//   46   90:getfield        #109 <Field int topToTop>
		//   47   93:putfield        #109 <Field int topToTop>
			constraint.topToBottom = topToBottom;
		//   48   96:aload_1         
		//   49   97:aload_0         
		//   50   98:getfield        #111 <Field int topToBottom>
		//   51  101:putfield        #111 <Field int topToBottom>
			constraint.bottomToTop = bottomToTop;
		//   52  104:aload_1         
		//   53  105:aload_0         
		//   54  106:getfield        #113 <Field int bottomToTop>
		//   55  109:putfield        #113 <Field int bottomToTop>
			constraint.bottomToBottom = bottomToBottom;
		//   56  112:aload_1         
		//   57  113:aload_0         
		//   58  114:getfield        #115 <Field int bottomToBottom>
		//   59  117:putfield        #115 <Field int bottomToBottom>
			constraint.baselineToBaseline = baselineToBaseline;
		//   60  120:aload_1         
		//   61  121:aload_0         
		//   62  122:getfield        #117 <Field int baselineToBaseline>
		//   63  125:putfield        #117 <Field int baselineToBaseline>
			constraint.startToEnd = startToEnd;
		//   64  128:aload_1         
		//   65  129:aload_0         
		//   66  130:getfield        #119 <Field int startToEnd>
		//   67  133:putfield        #119 <Field int startToEnd>
			constraint.startToStart = startToStart;
		//   68  136:aload_1         
		//   69  137:aload_0         
		//   70  138:getfield        #121 <Field int startToStart>
		//   71  141:putfield        #121 <Field int startToStart>
			constraint.endToStart = endToStart;
		//   72  144:aload_1         
		//   73  145:aload_0         
		//   74  146:getfield        #123 <Field int endToStart>
		//   75  149:putfield        #123 <Field int endToStart>
			constraint.endToEnd = endToEnd;
		//   76  152:aload_1         
		//   77  153:aload_0         
		//   78  154:getfield        #125 <Field int endToEnd>
		//   79  157:putfield        #125 <Field int endToEnd>
			constraint.horizontalBias = horizontalBias;
		//   80  160:aload_1         
		//   81  161:aload_0         
		//   82  162:getfield        #128 <Field float horizontalBias>
		//   83  165:putfield        #128 <Field float horizontalBias>
			constraint.verticalBias = verticalBias;
		//   84  168:aload_1         
		//   85  169:aload_0         
		//   86  170:getfield        #130 <Field float verticalBias>
		//   87  173:putfield        #130 <Field float verticalBias>
			constraint.dimensionRatio = dimensionRatio;
		//   88  176:aload_1         
		//   89  177:aload_0         
		//   90  178:getfield        #132 <Field String dimensionRatio>
		//   91  181:putfield        #132 <Field String dimensionRatio>
			constraint.editorAbsoluteX = editorAbsoluteX;
		//   92  184:aload_1         
		//   93  185:aload_0         
		//   94  186:getfield        #140 <Field int editorAbsoluteX>
		//   95  189:putfield        #140 <Field int editorAbsoluteX>
			constraint.editorAbsoluteY = editorAbsoluteY;
		//   96  192:aload_1         
		//   97  193:aload_0         
		//   98  194:getfield        #142 <Field int editorAbsoluteY>
		//   99  197:putfield        #142 <Field int editorAbsoluteY>
			constraint.horizontalBias = horizontalBias;
		//  100  200:aload_1         
		//  101  201:aload_0         
		//  102  202:getfield        #128 <Field float horizontalBias>
		//  103  205:putfield        #128 <Field float horizontalBias>
			constraint.horizontalBias = horizontalBias;
		//  104  208:aload_1         
		//  105  209:aload_0         
		//  106  210:getfield        #128 <Field float horizontalBias>
		//  107  213:putfield        #128 <Field float horizontalBias>
			constraint.horizontalBias = horizontalBias;
		//  108  216:aload_1         
		//  109  217:aload_0         
		//  110  218:getfield        #128 <Field float horizontalBias>
		//  111  221:putfield        #128 <Field float horizontalBias>
			constraint.horizontalBias = horizontalBias;
		//  112  224:aload_1         
		//  113  225:aload_0         
		//  114  226:getfield        #128 <Field float horizontalBias>
		//  115  229:putfield        #128 <Field float horizontalBias>
			constraint.horizontalBias = horizontalBias;
		//  116  232:aload_1         
		//  117  233:aload_0         
		//  118  234:getfield        #128 <Field float horizontalBias>
		//  119  237:putfield        #128 <Field float horizontalBias>
			constraint.orientation = orientation;
		//  120  240:aload_1         
		//  121  241:aload_0         
		//  122  242:getfield        #144 <Field int orientation>
		//  123  245:putfield        #144 <Field int orientation>
			constraint.leftMargin = leftMargin;
		//  124  248:aload_1         
		//  125  249:aload_0         
		//  126  250:getfield        #146 <Field int leftMargin>
		//  127  253:putfield        #146 <Field int leftMargin>
			constraint.rightMargin = rightMargin;
		//  128  256:aload_1         
		//  129  257:aload_0         
		//  130  258:getfield        #148 <Field int rightMargin>
		//  131  261:putfield        #148 <Field int rightMargin>
			constraint.topMargin = topMargin;
		//  132  264:aload_1         
		//  133  265:aload_0         
		//  134  266:getfield        #150 <Field int topMargin>
		//  135  269:putfield        #150 <Field int topMargin>
			constraint.bottomMargin = bottomMargin;
		//  136  272:aload_1         
		//  137  273:aload_0         
		//  138  274:getfield        #152 <Field int bottomMargin>
		//  139  277:putfield        #152 <Field int bottomMargin>
			constraint.endMargin = endMargin;
		//  140  280:aload_1         
		//  141  281:aload_0         
		//  142  282:getfield        #154 <Field int endMargin>
		//  143  285:putfield        #154 <Field int endMargin>
			constraint.startMargin = startMargin;
		//  144  288:aload_1         
		//  145  289:aload_0         
		//  146  290:getfield        #156 <Field int startMargin>
		//  147  293:putfield        #156 <Field int startMargin>
			constraint.visibility = visibility;
		//  148  296:aload_1         
		//  149  297:aload_0         
		//  150  298:getfield        #158 <Field int visibility>
		//  151  301:putfield        #158 <Field int visibility>
			constraint.goneLeftMargin = goneLeftMargin;
		//  152  304:aload_1         
		//  153  305:aload_0         
		//  154  306:getfield        #160 <Field int goneLeftMargin>
		//  155  309:putfield        #160 <Field int goneLeftMargin>
			constraint.goneTopMargin = goneTopMargin;
		//  156  312:aload_1         
		//  157  313:aload_0         
		//  158  314:getfield        #162 <Field int goneTopMargin>
		//  159  317:putfield        #162 <Field int goneTopMargin>
			constraint.goneRightMargin = goneRightMargin;
		//  160  320:aload_1         
		//  161  321:aload_0         
		//  162  322:getfield        #164 <Field int goneRightMargin>
		//  163  325:putfield        #164 <Field int goneRightMargin>
			constraint.goneBottomMargin = goneBottomMargin;
		//  164  328:aload_1         
		//  165  329:aload_0         
		//  166  330:getfield        #166 <Field int goneBottomMargin>
		//  167  333:putfield        #166 <Field int goneBottomMargin>
			constraint.goneEndMargin = goneEndMargin;
		//  168  336:aload_1         
		//  169  337:aload_0         
		//  170  338:getfield        #168 <Field int goneEndMargin>
		//  171  341:putfield        #168 <Field int goneEndMargin>
			constraint.goneStartMargin = goneStartMargin;
		//  172  344:aload_1         
		//  173  345:aload_0         
		//  174  346:getfield        #170 <Field int goneStartMargin>
		//  175  349:putfield        #170 <Field int goneStartMargin>
			constraint.verticalWeight = verticalWeight;
		//  176  352:aload_1         
		//  177  353:aload_0         
		//  178  354:getfield        #172 <Field float verticalWeight>
		//  179  357:putfield        #172 <Field float verticalWeight>
			constraint.horizontalWeight = horizontalWeight;
		//  180  360:aload_1         
		//  181  361:aload_0         
		//  182  362:getfield        #174 <Field float horizontalWeight>
		//  183  365:putfield        #174 <Field float horizontalWeight>
			constraint.horizontalChainStyle = horizontalChainStyle;
		//  184  368:aload_1         
		//  185  369:aload_0         
		//  186  370:getfield        #176 <Field int horizontalChainStyle>
		//  187  373:putfield        #176 <Field int horizontalChainStyle>
			constraint.verticalChainStyle = verticalChainStyle;
		//  188  376:aload_1         
		//  189  377:aload_0         
		//  190  378:getfield        #178 <Field int verticalChainStyle>
		//  191  381:putfield        #178 <Field int verticalChainStyle>
			constraint.alpha = alpha;
		//  192  384:aload_1         
		//  193  385:aload_0         
		//  194  386:getfield        #180 <Field float alpha>
		//  195  389:putfield        #180 <Field float alpha>
			constraint.applyElevation = applyElevation;
		//  196  392:aload_1         
		//  197  393:aload_0         
		//  198  394:getfield        #182 <Field boolean applyElevation>
		//  199  397:putfield        #182 <Field boolean applyElevation>
			constraint.elevation = elevation;
		//  200  400:aload_1         
		//  201  401:aload_0         
		//  202  402:getfield        #184 <Field float elevation>
		//  203  405:putfield        #184 <Field float elevation>
			constraint.rotation = rotation;
		//  204  408:aload_1         
		//  205  409:aload_0         
		//  206  410:getfield        #186 <Field float rotation>
		//  207  413:putfield        #186 <Field float rotation>
			constraint.rotationX = rotationX;
		//  208  416:aload_1         
		//  209  417:aload_0         
		//  210  418:getfield        #188 <Field float rotationX>
		//  211  421:putfield        #188 <Field float rotationX>
			constraint.rotationY = rotationY;
		//  212  424:aload_1         
		//  213  425:aload_0         
		//  214  426:getfield        #190 <Field float rotationY>
		//  215  429:putfield        #190 <Field float rotationY>
			constraint.scaleX = scaleX;
		//  216  432:aload_1         
		//  217  433:aload_0         
		//  218  434:getfield        #192 <Field float scaleX>
		//  219  437:putfield        #192 <Field float scaleX>
			constraint.scaleY = scaleY;
		//  220  440:aload_1         
		//  221  441:aload_0         
		//  222  442:getfield        #194 <Field float scaleY>
		//  223  445:putfield        #194 <Field float scaleY>
			constraint.transformPivotX = transformPivotX;
		//  224  448:aload_1         
		//  225  449:aload_0         
		//  226  450:getfield        #197 <Field float transformPivotX>
		//  227  453:putfield        #197 <Field float transformPivotX>
			constraint.transformPivotY = transformPivotY;
		//  228  456:aload_1         
		//  229  457:aload_0         
		//  230  458:getfield        #199 <Field float transformPivotY>
		//  231  461:putfield        #199 <Field float transformPivotY>
			constraint.translationX = translationX;
		//  232  464:aload_1         
		//  233  465:aload_0         
		//  234  466:getfield        #201 <Field float translationX>
		//  235  469:putfield        #201 <Field float translationX>
			constraint.translationY = translationY;
		//  236  472:aload_1         
		//  237  473:aload_0         
		//  238  474:getfield        #203 <Field float translationY>
		//  239  477:putfield        #203 <Field float translationY>
			constraint.translationZ = translationZ;
		//  240  480:aload_1         
		//  241  481:aload_0         
		//  242  482:getfield        #205 <Field float translationZ>
		//  243  485:putfield        #205 <Field float translationZ>
			constraint.constrainedWidth = constrainedWidth;
		//  244  488:aload_1         
		//  245  489:aload_0         
		//  246  490:getfield        #207 <Field boolean constrainedWidth>
		//  247  493:putfield        #207 <Field boolean constrainedWidth>
			constraint.constrainedHeight = constrainedHeight;
		//  248  496:aload_1         
		//  249  497:aload_0         
		//  250  498:getfield        #209 <Field boolean constrainedHeight>
		//  251  501:putfield        #209 <Field boolean constrainedHeight>
			constraint.widthDefault = widthDefault;
		//  252  504:aload_1         
		//  253  505:aload_0         
		//  254  506:getfield        #211 <Field int widthDefault>
		//  255  509:putfield        #211 <Field int widthDefault>
			constraint.heightDefault = heightDefault;
		//  256  512:aload_1         
		//  257  513:aload_0         
		//  258  514:getfield        #213 <Field int heightDefault>
		//  259  517:putfield        #213 <Field int heightDefault>
			constraint.widthMax = widthMax;
		//  260  520:aload_1         
		//  261  521:aload_0         
		//  262  522:getfield        #215 <Field int widthMax>
		//  263  525:putfield        #215 <Field int widthMax>
			constraint.heightMax = heightMax;
		//  264  528:aload_1         
		//  265  529:aload_0         
		//  266  530:getfield        #217 <Field int heightMax>
		//  267  533:putfield        #217 <Field int heightMax>
			constraint.widthMin = widthMin;
		//  268  536:aload_1         
		//  269  537:aload_0         
		//  270  538:getfield        #219 <Field int widthMin>
		//  271  541:putfield        #219 <Field int widthMin>
			constraint.heightMin = heightMin;
		//  272  544:aload_1         
		//  273  545:aload_0         
		//  274  546:getfield        #221 <Field int heightMin>
		//  275  549:putfield        #221 <Field int heightMin>
			constraint.widthPercent = widthPercent;
		//  276  552:aload_1         
		//  277  553:aload_0         
		//  278  554:getfield        #223 <Field float widthPercent>
		//  279  557:putfield        #223 <Field float widthPercent>
			constraint.heightPercent = heightPercent;
		//  280  560:aload_1         
		//  281  561:aload_0         
		//  282  562:getfield        #225 <Field float heightPercent>
		//  283  565:putfield        #225 <Field float heightPercent>
			constraint.mBarrierDirection = mBarrierDirection;
		//  284  568:aload_1         
		//  285  569:aload_0         
		//  286  570:getfield        #227 <Field int mBarrierDirection>
		//  287  573:putfield        #227 <Field int mBarrierDirection>
			constraint.mHelperType = mHelperType;
		//  288  576:aload_1         
		//  289  577:aload_0         
		//  290  578:getfield        #229 <Field int mHelperType>
		//  291  581:putfield        #229 <Field int mHelperType>
			int ai[] = mReferenceIds;
		//  292  584:aload_0         
		//  293  585:getfield        #360 <Field int[] mReferenceIds>
		//  294  588:astore_2        
			if(ai != null)
		//* 295  589:aload_2         
		//* 296  590:ifnull          603
				constraint.mReferenceIds = Arrays.copyOf(ai, ai.length);
		//  297  593:aload_1         
		//  298  594:aload_2         
		//  299  595:aload_2         
		//  300  596:arraylength     
		//  301  597:invokestatic    #382 <Method int[] Arrays.copyOf(int[], int)>
		//  302  600:putfield        #360 <Field int[] mReferenceIds>
			constraint.circleConstraint = circleConstraint;
		//  303  603:aload_1         
		//  304  604:aload_0         
		//  305  605:getfield        #134 <Field int circleConstraint>
		//  306  608:putfield        #134 <Field int circleConstraint>
			constraint.circleRadius = circleRadius;
		//  307  611:aload_1         
		//  308  612:aload_0         
		//  309  613:getfield        #136 <Field int circleRadius>
		//  310  616:putfield        #136 <Field int circleRadius>
			constraint.circleAngle = circleAngle;
		//  311  619:aload_1         
		//  312  620:aload_0         
		//  313  621:getfield        #138 <Field float circleAngle>
		//  314  624:putfield        #138 <Field float circleAngle>
			return constraint;
		//  315  627:aload_1         
		//  316  628:areturn         
		}

		public volatile Object clone()
			throws CloneNotSupportedException
		{
			return ((Object) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #387 <Method ConstraintSet$Constraint clone()>
		//    2    4:areturn         
		}

		static final int UNSET = -1;
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
		static void access$100(Constraint constraint, int i, ConstraintLayout.LayoutParams layoutparams)
		{
			constraint.fillFrom(i, layoutparams);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #238 <Method void fillFrom(int, ConstraintLayout$LayoutParams)>
			return;
		//    4    6:return          
		}

*/


/*
		static void access$200(Constraint constraint, ConstraintHelper constrainthelper, int i, Constraints.LayoutParams layoutparams)
		{
			constraint.fillFromConstraints(constrainthelper, i, layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #244 <Method void fillFromConstraints(ConstraintHelper, int, Constraints$LayoutParams)>
			return;
		//    5    7:return          
		}

*/


/*
		static void access$300(Constraint constraint, int i, Constraints.LayoutParams layoutparams)
		{
			constraint.fillFromConstraints(i, layoutparams);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #249 <Method void fillFromConstraints(int, Constraints$LayoutParams)>
			return;
		//    4    6:return          
		}

*/

		private Constraint()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #90  <Method void Object()>
			mIsGuideline = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #92  <Field boolean mIsGuideline>
			guideBegin = -1;
		//    5    9:aload_0         
		//    6   10:iconst_m1       
		//    7   11:putfield        #94  <Field int guideBegin>
			guideEnd = -1;
		//    8   14:aload_0         
		//    9   15:iconst_m1       
		//   10   16:putfield        #96  <Field int guideEnd>
			guidePercent = -1F;
		//   11   19:aload_0         
		//   12   20:ldc1            #97  <Float -1F>
		//   13   22:putfield        #99  <Field float guidePercent>
			leftToLeft = -1;
		//   14   25:aload_0         
		//   15   26:iconst_m1       
		//   16   27:putfield        #101 <Field int leftToLeft>
			leftToRight = -1;
		//   17   30:aload_0         
		//   18   31:iconst_m1       
		//   19   32:putfield        #103 <Field int leftToRight>
			rightToLeft = -1;
		//   20   35:aload_0         
		//   21   36:iconst_m1       
		//   22   37:putfield        #105 <Field int rightToLeft>
			rightToRight = -1;
		//   23   40:aload_0         
		//   24   41:iconst_m1       
		//   25   42:putfield        #107 <Field int rightToRight>
			topToTop = -1;
		//   26   45:aload_0         
		//   27   46:iconst_m1       
		//   28   47:putfield        #109 <Field int topToTop>
			topToBottom = -1;
		//   29   50:aload_0         
		//   30   51:iconst_m1       
		//   31   52:putfield        #111 <Field int topToBottom>
			bottomToTop = -1;
		//   32   55:aload_0         
		//   33   56:iconst_m1       
		//   34   57:putfield        #113 <Field int bottomToTop>
			bottomToBottom = -1;
		//   35   60:aload_0         
		//   36   61:iconst_m1       
		//   37   62:putfield        #115 <Field int bottomToBottom>
			baselineToBaseline = -1;
		//   38   65:aload_0         
		//   39   66:iconst_m1       
		//   40   67:putfield        #117 <Field int baselineToBaseline>
			startToEnd = -1;
		//   41   70:aload_0         
		//   42   71:iconst_m1       
		//   43   72:putfield        #119 <Field int startToEnd>
			startToStart = -1;
		//   44   75:aload_0         
		//   45   76:iconst_m1       
		//   46   77:putfield        #121 <Field int startToStart>
			endToStart = -1;
		//   47   80:aload_0         
		//   48   81:iconst_m1       
		//   49   82:putfield        #123 <Field int endToStart>
			endToEnd = -1;
		//   50   85:aload_0         
		//   51   86:iconst_m1       
		//   52   87:putfield        #125 <Field int endToEnd>
			horizontalBias = 0.5F;
		//   53   90:aload_0         
		//   54   91:ldc1            #126 <Float 0.5F>
		//   55   93:putfield        #128 <Field float horizontalBias>
			verticalBias = 0.5F;
		//   56   96:aload_0         
		//   57   97:ldc1            #126 <Float 0.5F>
		//   58   99:putfield        #130 <Field float verticalBias>
			dimensionRatio = null;
		//   59  102:aload_0         
		//   60  103:aconst_null     
		//   61  104:putfield        #132 <Field String dimensionRatio>
			circleConstraint = -1;
		//   62  107:aload_0         
		//   63  108:iconst_m1       
		//   64  109:putfield        #134 <Field int circleConstraint>
			circleRadius = 0;
		//   65  112:aload_0         
		//   66  113:iconst_0        
		//   67  114:putfield        #136 <Field int circleRadius>
			circleAngle = 0.0F;
		//   68  117:aload_0         
		//   69  118:fconst_0        
		//   70  119:putfield        #138 <Field float circleAngle>
			editorAbsoluteX = -1;
		//   71  122:aload_0         
		//   72  123:iconst_m1       
		//   73  124:putfield        #140 <Field int editorAbsoluteX>
			editorAbsoluteY = -1;
		//   74  127:aload_0         
		//   75  128:iconst_m1       
		//   76  129:putfield        #142 <Field int editorAbsoluteY>
			orientation = -1;
		//   77  132:aload_0         
		//   78  133:iconst_m1       
		//   79  134:putfield        #144 <Field int orientation>
			leftMargin = -1;
		//   80  137:aload_0         
		//   81  138:iconst_m1       
		//   82  139:putfield        #146 <Field int leftMargin>
			rightMargin = -1;
		//   83  142:aload_0         
		//   84  143:iconst_m1       
		//   85  144:putfield        #148 <Field int rightMargin>
			topMargin = -1;
		//   86  147:aload_0         
		//   87  148:iconst_m1       
		//   88  149:putfield        #150 <Field int topMargin>
			bottomMargin = -1;
		//   89  152:aload_0         
		//   90  153:iconst_m1       
		//   91  154:putfield        #152 <Field int bottomMargin>
			endMargin = -1;
		//   92  157:aload_0         
		//   93  158:iconst_m1       
		//   94  159:putfield        #154 <Field int endMargin>
			startMargin = -1;
		//   95  162:aload_0         
		//   96  163:iconst_m1       
		//   97  164:putfield        #156 <Field int startMargin>
			visibility = 0;
		//   98  167:aload_0         
		//   99  168:iconst_0        
		//  100  169:putfield        #158 <Field int visibility>
			goneLeftMargin = -1;
		//  101  172:aload_0         
		//  102  173:iconst_m1       
		//  103  174:putfield        #160 <Field int goneLeftMargin>
			goneTopMargin = -1;
		//  104  177:aload_0         
		//  105  178:iconst_m1       
		//  106  179:putfield        #162 <Field int goneTopMargin>
			goneRightMargin = -1;
		//  107  182:aload_0         
		//  108  183:iconst_m1       
		//  109  184:putfield        #164 <Field int goneRightMargin>
			goneBottomMargin = -1;
		//  110  187:aload_0         
		//  111  188:iconst_m1       
		//  112  189:putfield        #166 <Field int goneBottomMargin>
			goneEndMargin = -1;
		//  113  192:aload_0         
		//  114  193:iconst_m1       
		//  115  194:putfield        #168 <Field int goneEndMargin>
			goneStartMargin = -1;
		//  116  197:aload_0         
		//  117  198:iconst_m1       
		//  118  199:putfield        #170 <Field int goneStartMargin>
			verticalWeight = 0.0F;
		//  119  202:aload_0         
		//  120  203:fconst_0        
		//  121  204:putfield        #172 <Field float verticalWeight>
			horizontalWeight = 0.0F;
		//  122  207:aload_0         
		//  123  208:fconst_0        
		//  124  209:putfield        #174 <Field float horizontalWeight>
			horizontalChainStyle = 0;
		//  125  212:aload_0         
		//  126  213:iconst_0        
		//  127  214:putfield        #176 <Field int horizontalChainStyle>
			verticalChainStyle = 0;
		//  128  217:aload_0         
		//  129  218:iconst_0        
		//  130  219:putfield        #178 <Field int verticalChainStyle>
			alpha = 1.0F;
		//  131  222:aload_0         
		//  132  223:fconst_1        
		//  133  224:putfield        #180 <Field float alpha>
			applyElevation = false;
		//  134  227:aload_0         
		//  135  228:iconst_0        
		//  136  229:putfield        #182 <Field boolean applyElevation>
			elevation = 0.0F;
		//  137  232:aload_0         
		//  138  233:fconst_0        
		//  139  234:putfield        #184 <Field float elevation>
			rotation = 0.0F;
		//  140  237:aload_0         
		//  141  238:fconst_0        
		//  142  239:putfield        #186 <Field float rotation>
			rotationX = 0.0F;
		//  143  242:aload_0         
		//  144  243:fconst_0        
		//  145  244:putfield        #188 <Field float rotationX>
			rotationY = 0.0F;
		//  146  247:aload_0         
		//  147  248:fconst_0        
		//  148  249:putfield        #190 <Field float rotationY>
			scaleX = 1.0F;
		//  149  252:aload_0         
		//  150  253:fconst_1        
		//  151  254:putfield        #192 <Field float scaleX>
			scaleY = 1.0F;
		//  152  257:aload_0         
		//  153  258:fconst_1        
		//  154  259:putfield        #194 <Field float scaleY>
			transformPivotX = (0.0F / 0.0F);
		//  155  262:aload_0         
		//  156  263:ldc1            #195 <Float (0.0F / 0.0F)>
		//  157  265:putfield        #197 <Field float transformPivotX>
			transformPivotY = (0.0F / 0.0F);
		//  158  268:aload_0         
		//  159  269:ldc1            #195 <Float (0.0F / 0.0F)>
		//  160  271:putfield        #199 <Field float transformPivotY>
			translationX = 0.0F;
		//  161  274:aload_0         
		//  162  275:fconst_0        
		//  163  276:putfield        #201 <Field float translationX>
			translationY = 0.0F;
		//  164  279:aload_0         
		//  165  280:fconst_0        
		//  166  281:putfield        #203 <Field float translationY>
			translationZ = 0.0F;
		//  167  284:aload_0         
		//  168  285:fconst_0        
		//  169  286:putfield        #205 <Field float translationZ>
			constrainedWidth = false;
		//  170  289:aload_0         
		//  171  290:iconst_0        
		//  172  291:putfield        #207 <Field boolean constrainedWidth>
			constrainedHeight = false;
		//  173  294:aload_0         
		//  174  295:iconst_0        
		//  175  296:putfield        #209 <Field boolean constrainedHeight>
			widthDefault = 0;
		//  176  299:aload_0         
		//  177  300:iconst_0        
		//  178  301:putfield        #211 <Field int widthDefault>
			heightDefault = 0;
		//  179  304:aload_0         
		//  180  305:iconst_0        
		//  181  306:putfield        #213 <Field int heightDefault>
			widthMax = -1;
		//  182  309:aload_0         
		//  183  310:iconst_m1       
		//  184  311:putfield        #215 <Field int widthMax>
			heightMax = -1;
		//  185  314:aload_0         
		//  186  315:iconst_m1       
		//  187  316:putfield        #217 <Field int heightMax>
			widthMin = -1;
		//  188  319:aload_0         
		//  189  320:iconst_m1       
		//  190  321:putfield        #219 <Field int widthMin>
			heightMin = -1;
		//  191  324:aload_0         
		//  192  325:iconst_m1       
		//  193  326:putfield        #221 <Field int heightMin>
			widthPercent = 1.0F;
		//  194  329:aload_0         
		//  195  330:fconst_1        
		//  196  331:putfield        #223 <Field float widthPercent>
			heightPercent = 1.0F;
		//  197  334:aload_0         
		//  198  335:fconst_1        
		//  199  336:putfield        #225 <Field float heightPercent>
			mBarrierDirection = -1;
		//  200  339:aload_0         
		//  201  340:iconst_m1       
		//  202  341:putfield        #227 <Field int mBarrierDirection>
			mHelperType = -1;
		//  203  344:aload_0         
		//  204  345:iconst_m1       
		//  205  346:putfield        #229 <Field int mHelperType>
		//  206  349:return          
		}

	}


	public ConstraintSet()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #401 <Method void Object()>
		mConstraints = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #403 <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #404 <Method void HashMap()>
	//    6   12:putfield        #406 <Field HashMap mConstraints>
	//    7   15:return          
	}

	private void createHorizontalChain(int i, int j, int k, int l, int ai[], float af[], int i1, 
			int j1, int k1)
	{
		if(ai.length >= 2)
	//*   0    0:aload           5
	//*   1    2:arraylength     
	//*   2    3:iconst_2        
	//*   3    4:icmplt          184
		{
			if(af != null && af.length != ai.length)
	//*   4    7:aload           6
	//*   5    9:ifnull          35
	//*   6   12:aload           6
	//*   7   14:arraylength     
	//*   8   15:aload           5
	//*   9   17:arraylength     
	//*  10   18:icmpne          24
	//*  11   21:goto            35
				throw new IllegalArgumentException("must have 2 or more widgets in a chain");
	//   12   24:new             #410 <Class IllegalArgumentException>
	//   13   27:dup             
	//   14   28:ldc2            #412 <String "must have 2 or more widgets in a chain">
	//   15   31:invokespecial   #415 <Method void IllegalArgumentException(String)>
	//   16   34:athrow          
			if(af != null)
	//*  17   35:aload           6
	//*  18   37:ifnull          55
				get(ai[0]).horizontalWeight = af[0];
	//   19   40:aload_0         
	//   20   41:aload           5
	//   21   43:iconst_0        
	//   22   44:iaload          
	//   23   45:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//   24   48:aload           6
	//   25   50:iconst_0        
	//   26   51:faload          
	//   27   52:putfield        #423 <Field float ConstraintSet$Constraint.horizontalWeight>
			get(ai[0]).horizontalChainStyle = i1;
	//   28   55:aload_0         
	//   29   56:aload           5
	//   30   58:iconst_0        
	//   31   59:iaload          
	//   32   60:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//   33   63:iload           7
	//   34   65:putfield        #426 <Field int ConstraintSet$Constraint.horizontalChainStyle>
			connect(ai[0], j1, i, j, -1);
	//   35   68:aload_0         
	//   36   69:aload           5
	//   37   71:iconst_0        
	//   38   72:iaload          
	//   39   73:iload           8
	//   40   75:iload_1         
	//   41   76:iload_2         
	//   42   77:iconst_m1       
	//   43   78:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
			for(i = 1; i < ai.length; i++)
	//*  44   81:iconst_1        
	//*  45   82:istore_1        
	//*  46   83:iload_1         
	//*  47   84:aload           5
	//*  48   86:arraylength     
	//*  49   87:icmpge          165
			{
				j = ai[i];
	//   50   90:aload           5
	//   51   92:iload_1         
	//   52   93:iaload          
	//   53   94:istore_2        
				j = ai[i];
	//   54   95:aload           5
	//   55   97:iload_1         
	//   56   98:iaload          
	//   57   99:istore_2        
				i1 = i - 1;
	//   58  100:iload_1         
	//   59  101:iconst_1        
	//   60  102:isub            
	//   61  103:istore          7
				connect(j, j1, ai[i1], k1, -1);
	//   62  105:aload_0         
	//   63  106:iload_2         
	//   64  107:iload           8
	//   65  109:aload           5
	//   66  111:iload           7
	//   67  113:iaload          
	//   68  114:iload           9
	//   69  116:iconst_m1       
	//   70  117:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
				connect(ai[i1], k1, ai[i], j1, -1);
	//   71  120:aload_0         
	//   72  121:aload           5
	//   73  123:iload           7
	//   74  125:iaload          
	//   75  126:iload           9
	//   76  128:aload           5
	//   77  130:iload_1         
	//   78  131:iaload          
	//   79  132:iload           8
	//   80  134:iconst_m1       
	//   81  135:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
				if(af != null)
	//*  82  138:aload           6
	//*  83  140:ifnull          158
					get(ai[i]).horizontalWeight = af[i];
	//   84  143:aload_0         
	//   85  144:aload           5
	//   86  146:iload_1         
	//   87  147:iaload          
	//   88  148:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//   89  151:aload           6
	//   90  153:iload_1         
	//   91  154:faload          
	//   92  155:putfield        #423 <Field float ConstraintSet$Constraint.horizontalWeight>
			}

	//   93  158:iload_1         
	//   94  159:iconst_1        
	//   95  160:iadd            
	//   96  161:istore_1        
	//*  97  162:goto            83
			connect(ai[ai.length - 1], k1, k, l, -1);
	//   98  165:aload_0         
	//   99  166:aload           5
	//  100  168:aload           5
	//  101  170:arraylength     
	//  102  171:iconst_1        
	//  103  172:isub            
	//  104  173:iaload          
	//  105  174:iload           9
	//  106  176:iload_3         
	//  107  177:iload           4
	//  108  179:iconst_m1       
	//  109  180:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
			return;
	//  110  183:return          
		} else
		{
			throw new IllegalArgumentException("must have 2 or more widgets in a chain");
	//  111  184:new             #410 <Class IllegalArgumentException>
	//  112  187:dup             
	//  113  188:ldc2            #412 <String "must have 2 or more widgets in a chain">
	//  114  191:invokespecial   #415 <Method void IllegalArgumentException(String)>
	//  115  194:athrow          
		}
	}

	private Constraint fillFromAttributeList(Context context, AttributeSet attributeset)
	{
		Constraint constraint = new Constraint();
	//    0    0:new             #8   <Class ConstraintSet$Constraint>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #435 <Method void ConstraintSet$Constraint(ConstraintSet$1)>
	//    4    8:astore_3        
		context = ((Context) (context.obtainStyledAttributes(attributeset, R.styleable.ConstraintSet)));
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:getstatic       #437 <Field int[] R$styleable.ConstraintSet>
	//    8   14:invokevirtual   #443 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//    9   17:astore_1        
		populateConstraint(constraint, ((TypedArray) (context)));
	//   10   18:aload_0         
	//   11   19:aload_3         
	//   12   20:aload_1         
	//   13   21:invokespecial   #447 <Method void populateConstraint(ConstraintSet$Constraint, TypedArray)>
		((TypedArray) (context)).recycle();
	//   14   24:aload_1         
	//   15   25:invokevirtual   #452 <Method void TypedArray.recycle()>
		return constraint;
	//   16   28:aload_3         
	//   17   29:areturn         
	}

	private Constraint get(int i)
	{
		if(!mConstraints.containsKey(((Object) (Integer.valueOf(i)))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #406 <Field HashMap mConstraints>
	//*   2    4:iload_1         
	//*   3    5:invokestatic    #458 <Method Integer Integer.valueOf(int)>
	//*   4    8:invokevirtual   #462 <Method boolean HashMap.containsKey(Object)>
	//*   5   11:ifne            34
			mConstraints.put(((Object) (Integer.valueOf(i))), ((Object) (new Constraint())));
	//    6   14:aload_0         
	//    7   15:getfield        #406 <Field HashMap mConstraints>
	//    8   18:iload_1         
	//    9   19:invokestatic    #458 <Method Integer Integer.valueOf(int)>
	//   10   22:new             #8   <Class ConstraintSet$Constraint>
	//   11   25:dup             
	//   12   26:aconst_null     
	//   13   27:invokespecial   #435 <Method void ConstraintSet$Constraint(ConstraintSet$1)>
	//   14   30:invokevirtual   #466 <Method Object HashMap.put(Object, Object)>
	//   15   33:pop             
		return (Constraint)mConstraints.get(((Object) (Integer.valueOf(i))));
	//   16   34:aload_0         
	//   17   35:getfield        #406 <Field HashMap mConstraints>
	//   18   38:iload_1         
	//   19   39:invokestatic    #458 <Method Integer Integer.valueOf(int)>
	//   20   42:invokevirtual   #469 <Method Object HashMap.get(Object)>
	//   21   45:checkcast       #8   <Class ConstraintSet$Constraint>
	//   22   48:areturn         
	}

	private static int lookupID(TypedArray typedarray, int i, int j)
	{
		int k = typedarray.getResourceId(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #475 <Method int TypedArray.getResourceId(int, int)>
	//    4    6:istore_3        
		j = k;
	//    5    7:iload_3         
	//    6    8:istore_2        
		if(k == -1)
	//*   7    9:iload_3         
	//*   8   10:iconst_m1       
	//*   9   11:icmpne          21
			j = typedarray.getInt(i, -1);
	//   10   14:aload_0         
	//   11   15:iload_1         
	//   12   16:iconst_m1       
	//   13   17:invokevirtual   #478 <Method int TypedArray.getInt(int, int)>
	//   14   20:istore_2        
		return j;
	//   15   21:iload_2         
	//   16   22:ireturn         
	}

	private void populateConstraint(Constraint constraint, TypedArray typedarray)
	{
		int j = typedarray.getIndexCount();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #482 <Method int TypedArray.getIndexCount()>
	//    2    4:istore          4
		for(int i = 0; i < j; i++)
	//*   3    6:iconst_0        
	//*   4    7:istore_3        
	//*   5    8:iload_3         
	//*   6    9:iload           4
	//*   7   11:icmpge          1414
		{
			int k = typedarray.getIndex(i);
	//    8   14:aload_2         
	//    9   15:iload_3         
	//   10   16:invokevirtual   #486 <Method int TypedArray.getIndex(int)>
	//   11   19:istore          5
			int l = mapToConstant.get(k);
	//   12   21:getstatic       #189 <Field SparseIntArray mapToConstant>
	//   13   24:iload           5
	//   14   26:invokevirtual   #488 <Method int SparseIntArray.get(int)>
	//   15   29:istore          6
			switch(l)
	//*  16   31:iload           6
			{
	//*  17   33:tableswitch     1 53: default 260
	//	               1 1393
	//	               2 1376
	//	               3 1359
	//	               4 1342
	//	               5 1329
	//	               6 1312
	//	               7 1295
	//	               8 1278
	//	               9 1261
	//	               10 1244
	//	               11 1227
	//	               12 1210
	//	               13 1193
	//	               14 1176
	//	               15 1159
	//	               16 1142
	//	               17 1125
	//	               18 1108
	//	               19 1091
	//	               20 1074
	//	               21 1057
	//	               22 1028
	//	               23 1011
	//	               24 994
	//	               25 977
	//	               26 960
	//	               27 943
	//	               28 926
	//	               29 909
	//	               30 892
	//	               31 875
	//	               32 858
	//	               33 841
	//	               34 824
	//	               35 807
	//	               36 790
	//	               37 773
	//	               38 756
	//	               39 739
	//	               40 722
	//	               41 705
	//	               42 688
	//	               43 671
	//	               44 649
	//	               45 632
	//	               46 615
	//	               47 598
	//	               48 581
	//	               49 564
	//	               50 547
	//	               51 530
	//	               52 513
	//	               53 496
			default:
				switch(l)
	//*  18  260:iload           6
				{
	//*  19  262:tableswitch     60 64: default 296
	//	               60 479
	//	               61 462
	//	               62 445
	//	               63 428
	//	               64 362
				default:
					StringBuilder stringbuilder = new StringBuilder();
	//   20  296:new             #490 <Class StringBuilder>
	//   21  299:dup             
	//   22  300:invokespecial   #491 <Method void StringBuilder()>
	//   23  303:astore          7
					stringbuilder.append("Unknown attribute 0x");
	//   24  305:aload           7
	//   25  307:ldc2            #493 <String "Unknown attribute 0x">
	//   26  310:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   27  313:pop             
					stringbuilder.append(Integer.toHexString(k));
	//   28  314:aload           7
	//   29  316:iload           5
	//   30  318:invokestatic    #500 <Method String Integer.toHexString(int)>
	//   31  321:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   32  324:pop             
					stringbuilder.append("   ");
	//   33  325:aload           7
	//   34  327:ldc2            #502 <String "   ">
	//   35  330:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   36  333:pop             
					stringbuilder.append(mapToConstant.get(k));
	//   37  334:aload           7
	//   38  336:getstatic       #189 <Field SparseIntArray mapToConstant>
	//   39  339:iload           5
	//   40  341:invokevirtual   #488 <Method int SparseIntArray.get(int)>
	//   41  344:invokevirtual   #505 <Method StringBuilder StringBuilder.append(int)>
	//   42  347:pop             
					Log.w("ConstraintSet", stringbuilder.toString());
	//   43  348:ldc1            #131 <String "ConstraintSet">
	//   44  350:aload           7
	//   45  352:invokevirtual   #509 <Method String StringBuilder.toString()>
	//   46  355:invokestatic    #515 <Method int Log.w(String, String)>
	//   47  358:pop             
					break;

	//*  48  359:goto            1407
				case 64: // '@'
					StringBuilder stringbuilder1 = new StringBuilder();
	//   49  362:new             #490 <Class StringBuilder>
	//   50  365:dup             
	//   51  366:invokespecial   #491 <Method void StringBuilder()>
	//   52  369:astore          7
					stringbuilder1.append("unused attribute 0x");
	//   53  371:aload           7
	//   54  373:ldc2            #517 <String "unused attribute 0x">
	//   55  376:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   56  379:pop             
					stringbuilder1.append(Integer.toHexString(k));
	//   57  380:aload           7
	//   58  382:iload           5
	//   59  384:invokestatic    #500 <Method String Integer.toHexString(int)>
	//   60  387:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   61  390:pop             
					stringbuilder1.append("   ");
	//   62  391:aload           7
	//   63  393:ldc2            #502 <String "   ">
	//   64  396:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   65  399:pop             
					stringbuilder1.append(mapToConstant.get(k));
	//   66  400:aload           7
	//   67  402:getstatic       #189 <Field SparseIntArray mapToConstant>
	//   68  405:iload           5
	//   69  407:invokevirtual   #488 <Method int SparseIntArray.get(int)>
	//   70  410:invokevirtual   #505 <Method StringBuilder StringBuilder.append(int)>
	//   71  413:pop             
					Log.w("ConstraintSet", stringbuilder1.toString());
	//   72  414:ldc1            #131 <String "ConstraintSet">
	//   73  416:aload           7
	//   74  418:invokevirtual   #509 <Method String StringBuilder.toString()>
	//   75  421:invokestatic    #515 <Method int Log.w(String, String)>
	//   76  424:pop             
					break;

	//*  77  425:goto            1407
				case 63: // '?'
					constraint.circleAngle = typedarray.getFloat(k, constraint.circleAngle);
	//   78  428:aload_1         
	//   79  429:aload_2         
	//   80  430:iload           5
	//   81  432:aload_1         
	//   82  433:getfield        #520 <Field float ConstraintSet$Constraint.circleAngle>
	//   83  436:invokevirtual   #524 <Method float TypedArray.getFloat(int, float)>
	//   84  439:putfield        #520 <Field float ConstraintSet$Constraint.circleAngle>
					break;

	//*  85  442:goto            1407
				case 62: // '>'
					constraint.circleRadius = typedarray.getDimensionPixelSize(k, constraint.circleRadius);
	//   86  445:aload_1         
	//   87  446:aload_2         
	//   88  447:iload           5
	//   89  449:aload_1         
	//   90  450:getfield        #527 <Field int ConstraintSet$Constraint.circleRadius>
	//   91  453:invokevirtual   #530 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   92  456:putfield        #527 <Field int ConstraintSet$Constraint.circleRadius>
					break;

	//*  93  459:goto            1407
				case 61: // '='
					constraint.circleConstraint = lookupID(typedarray, k, constraint.circleConstraint);
	//   94  462:aload_1         
	//   95  463:aload_2         
	//   96  464:iload           5
	//   97  466:aload_1         
	//   98  467:getfield        #533 <Field int ConstraintSet$Constraint.circleConstraint>
	//   99  470:invokestatic    #535 <Method int lookupID(TypedArray, int, int)>
	//  100  473:putfield        #533 <Field int ConstraintSet$Constraint.circleConstraint>
					break;

	//* 101  476:goto            1407
				case 60: // '<'
					constraint.rotation = typedarray.getFloat(k, constraint.rotation);
	//  102  479:aload_1         
	//  103  480:aload_2         
	//  104  481:iload           5
	//  105  483:aload_1         
	//  106  484:getfield        #538 <Field float ConstraintSet$Constraint.rotation>
	//  107  487:invokevirtual   #524 <Method float TypedArray.getFloat(int, float)>
	//  108  490:putfield        #538 <Field float ConstraintSet$Constraint.rotation>
					break;
				}
				break;

	//* 109  493:goto            1407
			case 53: // '5'
				constraint.translationZ = typedarray.getDimension(k, constraint.translationZ);
	//  110  496:aload_1         
	//  111  497:aload_2         
	//  112  498:iload           5
	//  113  500:aload_1         
	//  114  501:getfield        #541 <Field float ConstraintSet$Constraint.translationZ>
	//  115  504:invokevirtual   #544 <Method float TypedArray.getDimension(int, float)>
	//  116  507:putfield        #541 <Field float ConstraintSet$Constraint.translationZ>
				break;

	//* 117  510:goto            1407
			case 52: // '4'
				constraint.translationY = typedarray.getDimension(k, constraint.translationY);
	//  118  513:aload_1         
	//  119  514:aload_2         
	//  120  515:iload           5
	//  121  517:aload_1         
	//  122  518:getfield        #547 <Field float ConstraintSet$Constraint.translationY>
	//  123  521:invokevirtual   #544 <Method float TypedArray.getDimension(int, float)>
	//  124  524:putfield        #547 <Field float ConstraintSet$Constraint.translationY>
				break;

	//* 125  527:goto            1407
			case 51: // '3'
				constraint.translationX = typedarray.getDimension(k, constraint.translationX);
	//  126  530:aload_1         
	//  127  531:aload_2         
	//  128  532:iload           5
	//  129  534:aload_1         
	//  130  535:getfield        #550 <Field float ConstraintSet$Constraint.translationX>
	//  131  538:invokevirtual   #544 <Method float TypedArray.getDimension(int, float)>
	//  132  541:putfield        #550 <Field float ConstraintSet$Constraint.translationX>
				break;

	//* 133  544:goto            1407
			case 50: // '2'
				constraint.transformPivotY = typedarray.getFloat(k, constraint.transformPivotY);
	//  134  547:aload_1         
	//  135  548:aload_2         
	//  136  549:iload           5
	//  137  551:aload_1         
	//  138  552:getfield        #553 <Field float ConstraintSet$Constraint.transformPivotY>
	//  139  555:invokevirtual   #524 <Method float TypedArray.getFloat(int, float)>
	//  140  558:putfield        #553 <Field float ConstraintSet$Constraint.transformPivotY>
				break;

	//* 141  561:goto            1407
			case 49: // '1'
				constraint.transformPivotX = typedarray.getFloat(k, constraint.transformPivotX);
	//  142  564:aload_1         
	//  143  565:aload_2         
	//  144  566:iload           5
	//  145  568:aload_1         
	//  146  569:getfield        #556 <Field float ConstraintSet$Constraint.transformPivotX>
	//  147  572:invokevirtual   #524 <Method float TypedArray.getFloat(int, float)>
	//  148  575:putfield        #556 <Field float ConstraintSet$Constraint.transformPivotX>
				break;

	//* 149  578:goto            1407
			case 48: // '0'
				constraint.scaleY = typedarray.getFloat(k, constraint.scaleY);
	//  150  581:aload_1         
	//  151  582:aload_2         
	//  152  583:iload           5
	//  153  585:aload_1         
	//  154  586:getfield        #559 <Field float ConstraintSet$Constraint.scaleY>
	//  155  589:invokevirtual   #524 <Method float TypedArray.getFloat(int, float)>
	//  156  592:putfield        #559 <Field float ConstraintSet$Constraint.scaleY>
				break;

	//* 157  595:goto            1407
			case 47: // '/'
				constraint.scaleX = typedarray.getFloat(k, constraint.scaleX);
	//  158  598:aload_1         
	//  159  599:aload_2         
	//  160  600:iload           5
	//  161  602:aload_1         
	//  162  603:getfield        #562 <Field float ConstraintSet$Constraint.scaleX>
	//  163  606:invokevirtual   #524 <Method float TypedArray.getFloat(int, float)>
	//  164  609:putfield        #562 <Field float ConstraintSet$Constraint.scaleX>
				break;

	//* 165  612:goto            1407
			case 46: // '.'
				constraint.rotationY = typedarray.getFloat(k, constraint.rotationY);
	//  166  615:aload_1         
	//  167  616:aload_2         
	//  168  617:iload           5
	//  169  619:aload_1         
	//  170  620:getfield        #565 <Field float ConstraintSet$Constraint.rotationY>
	//  171  623:invokevirtual   #524 <Method float TypedArray.getFloat(int, float)>
	//  172  626:putfield        #565 <Field float ConstraintSet$Constraint.rotationY>
				break;

	//* 173  629:goto            1407
			case 45: // '-'
				constraint.rotationX = typedarray.getFloat(k, constraint.rotationX);
	//  174  632:aload_1         
	//  175  633:aload_2         
	//  176  634:iload           5
	//  177  636:aload_1         
	//  178  637:getfield        #568 <Field float ConstraintSet$Constraint.rotationX>
	//  179  640:invokevirtual   #524 <Method float TypedArray.getFloat(int, float)>
	//  180  643:putfield        #568 <Field float ConstraintSet$Constraint.rotationX>
				break;

	//* 181  646:goto            1407
			case 44: // ','
				constraint.applyElevation = true;
	//  182  649:aload_1         
	//  183  650:iconst_1        
	//  184  651:putfield        #571 <Field boolean ConstraintSet$Constraint.applyElevation>
				constraint.elevation = typedarray.getDimension(k, constraint.elevation);
	//  185  654:aload_1         
	//  186  655:aload_2         
	//  187  656:iload           5
	//  188  658:aload_1         
	//  189  659:getfield        #574 <Field float ConstraintSet$Constraint.elevation>
	//  190  662:invokevirtual   #544 <Method float TypedArray.getDimension(int, float)>
	//  191  665:putfield        #574 <Field float ConstraintSet$Constraint.elevation>
				break;

	//* 192  668:goto            1407
			case 43: // '+'
				constraint.alpha = typedarray.getFloat(k, constraint.alpha);
	//  193  671:aload_1         
	//  194  672:aload_2         
	//  195  673:iload           5
	//  196  675:aload_1         
	//  197  676:getfield        #577 <Field float ConstraintSet$Constraint.alpha>
	//  198  679:invokevirtual   #524 <Method float TypedArray.getFloat(int, float)>
	//  199  682:putfield        #577 <Field float ConstraintSet$Constraint.alpha>
				break;

	//* 200  685:goto            1407
			case 42: // '*'
				constraint.verticalChainStyle = typedarray.getInt(k, constraint.verticalChainStyle);
	//  201  688:aload_1         
	//  202  689:aload_2         
	//  203  690:iload           5
	//  204  692:aload_1         
	//  205  693:getfield        #580 <Field int ConstraintSet$Constraint.verticalChainStyle>
	//  206  696:invokevirtual   #478 <Method int TypedArray.getInt(int, int)>
	//  207  699:putfield        #580 <Field int ConstraintSet$Constraint.verticalChainStyle>
				break;

	//* 208  702:goto            1407
			case 41: // ')'
				constraint.horizontalChainStyle = typedarray.getInt(k, constraint.horizontalChainStyle);
	//  209  705:aload_1         
	//  210  706:aload_2         
	//  211  707:iload           5
	//  212  709:aload_1         
	//  213  710:getfield        #426 <Field int ConstraintSet$Constraint.horizontalChainStyle>
	//  214  713:invokevirtual   #478 <Method int TypedArray.getInt(int, int)>
	//  215  716:putfield        #426 <Field int ConstraintSet$Constraint.horizontalChainStyle>
				break;

	//* 216  719:goto            1407
			case 40: // '('
				constraint.verticalWeight = typedarray.getFloat(k, constraint.verticalWeight);
	//  217  722:aload_1         
	//  218  723:aload_2         
	//  219  724:iload           5
	//  220  726:aload_1         
	//  221  727:getfield        #583 <Field float ConstraintSet$Constraint.verticalWeight>
	//  222  730:invokevirtual   #524 <Method float TypedArray.getFloat(int, float)>
	//  223  733:putfield        #583 <Field float ConstraintSet$Constraint.verticalWeight>
				break;

	//* 224  736:goto            1407
			case 39: // '\''
				constraint.horizontalWeight = typedarray.getFloat(k, constraint.horizontalWeight);
	//  225  739:aload_1         
	//  226  740:aload_2         
	//  227  741:iload           5
	//  228  743:aload_1         
	//  229  744:getfield        #423 <Field float ConstraintSet$Constraint.horizontalWeight>
	//  230  747:invokevirtual   #524 <Method float TypedArray.getFloat(int, float)>
	//  231  750:putfield        #423 <Field float ConstraintSet$Constraint.horizontalWeight>
				break;

	//* 232  753:goto            1407
			case 38: // '&'
				constraint.mViewId = typedarray.getResourceId(k, constraint.mViewId);
	//  233  756:aload_1         
	//  234  757:aload_2         
	//  235  758:iload           5
	//  236  760:aload_1         
	//  237  761:getfield        #586 <Field int ConstraintSet$Constraint.mViewId>
	//  238  764:invokevirtual   #475 <Method int TypedArray.getResourceId(int, int)>
	//  239  767:putfield        #586 <Field int ConstraintSet$Constraint.mViewId>
				break;

	//* 240  770:goto            1407
			case 37: // '%'
				constraint.verticalBias = typedarray.getFloat(k, constraint.verticalBias);
	//  241  773:aload_1         
	//  242  774:aload_2         
	//  243  775:iload           5
	//  244  777:aload_1         
	//  245  778:getfield        #589 <Field float ConstraintSet$Constraint.verticalBias>
	//  246  781:invokevirtual   #524 <Method float TypedArray.getFloat(int, float)>
	//  247  784:putfield        #589 <Field float ConstraintSet$Constraint.verticalBias>
				break;

	//* 248  787:goto            1407
			case 36: // '$'
				constraint.topToTop = lookupID(typedarray, k, constraint.topToTop);
	//  249  790:aload_1         
	//  250  791:aload_2         
	//  251  792:iload           5
	//  252  794:aload_1         
	//  253  795:getfield        #592 <Field int ConstraintSet$Constraint.topToTop>
	//  254  798:invokestatic    #535 <Method int lookupID(TypedArray, int, int)>
	//  255  801:putfield        #592 <Field int ConstraintSet$Constraint.topToTop>
				break;

	//* 256  804:goto            1407
			case 35: // '#'
				constraint.topToBottom = lookupID(typedarray, k, constraint.topToBottom);
	//  257  807:aload_1         
	//  258  808:aload_2         
	//  259  809:iload           5
	//  260  811:aload_1         
	//  261  812:getfield        #595 <Field int ConstraintSet$Constraint.topToBottom>
	//  262  815:invokestatic    #535 <Method int lookupID(TypedArray, int, int)>
	//  263  818:putfield        #595 <Field int ConstraintSet$Constraint.topToBottom>
				break;

	//* 264  821:goto            1407
			case 34: // '"'
				constraint.topMargin = typedarray.getDimensionPixelSize(k, constraint.topMargin);
	//  265  824:aload_1         
	//  266  825:aload_2         
	//  267  826:iload           5
	//  268  828:aload_1         
	//  269  829:getfield        #598 <Field int ConstraintSet$Constraint.topMargin>
	//  270  832:invokevirtual   #530 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  271  835:putfield        #598 <Field int ConstraintSet$Constraint.topMargin>
				break;

	//* 272  838:goto            1407
			case 33: // '!'
				constraint.startToStart = lookupID(typedarray, k, constraint.startToStart);
	//  273  841:aload_1         
	//  274  842:aload_2         
	//  275  843:iload           5
	//  276  845:aload_1         
	//  277  846:getfield        #601 <Field int ConstraintSet$Constraint.startToStart>
	//  278  849:invokestatic    #535 <Method int lookupID(TypedArray, int, int)>
	//  279  852:putfield        #601 <Field int ConstraintSet$Constraint.startToStart>
				break;

	//* 280  855:goto            1407
			case 32: // ' '
				constraint.startToEnd = lookupID(typedarray, k, constraint.startToEnd);
	//  281  858:aload_1         
	//  282  859:aload_2         
	//  283  860:iload           5
	//  284  862:aload_1         
	//  285  863:getfield        #604 <Field int ConstraintSet$Constraint.startToEnd>
	//  286  866:invokestatic    #535 <Method int lookupID(TypedArray, int, int)>
	//  287  869:putfield        #604 <Field int ConstraintSet$Constraint.startToEnd>
				break;

	//* 288  872:goto            1407
			case 31: // '\037'
				constraint.startMargin = typedarray.getDimensionPixelSize(k, constraint.startMargin);
	//  289  875:aload_1         
	//  290  876:aload_2         
	//  291  877:iload           5
	//  292  879:aload_1         
	//  293  880:getfield        #607 <Field int ConstraintSet$Constraint.startMargin>
	//  294  883:invokevirtual   #530 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  295  886:putfield        #607 <Field int ConstraintSet$Constraint.startMargin>
				break;

	//* 296  889:goto            1407
			case 30: // '\036'
				constraint.rightToRight = lookupID(typedarray, k, constraint.rightToRight);
	//  297  892:aload_1         
	//  298  893:aload_2         
	//  299  894:iload           5
	//  300  896:aload_1         
	//  301  897:getfield        #610 <Field int ConstraintSet$Constraint.rightToRight>
	//  302  900:invokestatic    #535 <Method int lookupID(TypedArray, int, int)>
	//  303  903:putfield        #610 <Field int ConstraintSet$Constraint.rightToRight>
				break;

	//* 304  906:goto            1407
			case 29: // '\035'
				constraint.rightToLeft = lookupID(typedarray, k, constraint.rightToLeft);
	//  305  909:aload_1         
	//  306  910:aload_2         
	//  307  911:iload           5
	//  308  913:aload_1         
	//  309  914:getfield        #613 <Field int ConstraintSet$Constraint.rightToLeft>
	//  310  917:invokestatic    #535 <Method int lookupID(TypedArray, int, int)>
	//  311  920:putfield        #613 <Field int ConstraintSet$Constraint.rightToLeft>
				break;

	//* 312  923:goto            1407
			case 28: // '\034'
				constraint.rightMargin = typedarray.getDimensionPixelSize(k, constraint.rightMargin);
	//  313  926:aload_1         
	//  314  927:aload_2         
	//  315  928:iload           5
	//  316  930:aload_1         
	//  317  931:getfield        #616 <Field int ConstraintSet$Constraint.rightMargin>
	//  318  934:invokevirtual   #530 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  319  937:putfield        #616 <Field int ConstraintSet$Constraint.rightMargin>
				break;

	//* 320  940:goto            1407
			case 27: // '\033'
				constraint.orientation = typedarray.getInt(k, constraint.orientation);
	//  321  943:aload_1         
	//  322  944:aload_2         
	//  323  945:iload           5
	//  324  947:aload_1         
	//  325  948:getfield        #619 <Field int ConstraintSet$Constraint.orientation>
	//  326  951:invokevirtual   #478 <Method int TypedArray.getInt(int, int)>
	//  327  954:putfield        #619 <Field int ConstraintSet$Constraint.orientation>
				break;

	//* 328  957:goto            1407
			case 26: // '\032'
				constraint.leftToRight = lookupID(typedarray, k, constraint.leftToRight);
	//  329  960:aload_1         
	//  330  961:aload_2         
	//  331  962:iload           5
	//  332  964:aload_1         
	//  333  965:getfield        #622 <Field int ConstraintSet$Constraint.leftToRight>
	//  334  968:invokestatic    #535 <Method int lookupID(TypedArray, int, int)>
	//  335  971:putfield        #622 <Field int ConstraintSet$Constraint.leftToRight>
				break;

	//* 336  974:goto            1407
			case 25: // '\031'
				constraint.leftToLeft = lookupID(typedarray, k, constraint.leftToLeft);
	//  337  977:aload_1         
	//  338  978:aload_2         
	//  339  979:iload           5
	//  340  981:aload_1         
	//  341  982:getfield        #625 <Field int ConstraintSet$Constraint.leftToLeft>
	//  342  985:invokestatic    #535 <Method int lookupID(TypedArray, int, int)>
	//  343  988:putfield        #625 <Field int ConstraintSet$Constraint.leftToLeft>
				break;

	//* 344  991:goto            1407
			case 24: // '\030'
				constraint.leftMargin = typedarray.getDimensionPixelSize(k, constraint.leftMargin);
	//  345  994:aload_1         
	//  346  995:aload_2         
	//  347  996:iload           5
	//  348  998:aload_1         
	//  349  999:getfield        #628 <Field int ConstraintSet$Constraint.leftMargin>
	//  350 1002:invokevirtual   #530 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  351 1005:putfield        #628 <Field int ConstraintSet$Constraint.leftMargin>
				break;

	//* 352 1008:goto            1407
			case 23: // '\027'
				constraint.mWidth = typedarray.getLayoutDimension(k, constraint.mWidth);
	//  353 1011:aload_1         
	//  354 1012:aload_2         
	//  355 1013:iload           5
	//  356 1015:aload_1         
	//  357 1016:getfield        #631 <Field int ConstraintSet$Constraint.mWidth>
	//  358 1019:invokevirtual   #634 <Method int TypedArray.getLayoutDimension(int, int)>
	//  359 1022:putfield        #631 <Field int ConstraintSet$Constraint.mWidth>
				break;

	//* 360 1025:goto            1407
			case 22: // '\026'
				constraint.visibility = typedarray.getInt(k, constraint.visibility);
	//  361 1028:aload_1         
	//  362 1029:aload_2         
	//  363 1030:iload           5
	//  364 1032:aload_1         
	//  365 1033:getfield        #637 <Field int ConstraintSet$Constraint.visibility>
	//  366 1036:invokevirtual   #478 <Method int TypedArray.getInt(int, int)>
	//  367 1039:putfield        #637 <Field int ConstraintSet$Constraint.visibility>
				constraint.visibility = VISIBILITY_FLAGS[constraint.visibility];
	//  368 1042:aload_1         
	//  369 1043:getstatic       #182 <Field int[] VISIBILITY_FLAGS>
	//  370 1046:aload_1         
	//  371 1047:getfield        #637 <Field int ConstraintSet$Constraint.visibility>
	//  372 1050:iaload          
	//  373 1051:putfield        #637 <Field int ConstraintSet$Constraint.visibility>
				break;

	//* 374 1054:goto            1407
			case 21: // '\025'
				constraint.mHeight = typedarray.getLayoutDimension(k, constraint.mHeight);
	//  375 1057:aload_1         
	//  376 1058:aload_2         
	//  377 1059:iload           5
	//  378 1061:aload_1         
	//  379 1062:getfield        #640 <Field int ConstraintSet$Constraint.mHeight>
	//  380 1065:invokevirtual   #634 <Method int TypedArray.getLayoutDimension(int, int)>
	//  381 1068:putfield        #640 <Field int ConstraintSet$Constraint.mHeight>
				break;

	//* 382 1071:goto            1407
			case 20: // '\024'
				constraint.horizontalBias = typedarray.getFloat(k, constraint.horizontalBias);
	//  383 1074:aload_1         
	//  384 1075:aload_2         
	//  385 1076:iload           5
	//  386 1078:aload_1         
	//  387 1079:getfield        #643 <Field float ConstraintSet$Constraint.horizontalBias>
	//  388 1082:invokevirtual   #524 <Method float TypedArray.getFloat(int, float)>
	//  389 1085:putfield        #643 <Field float ConstraintSet$Constraint.horizontalBias>
				break;

	//* 390 1088:goto            1407
			case 19: // '\023'
				constraint.guidePercent = typedarray.getFloat(k, constraint.guidePercent);
	//  391 1091:aload_1         
	//  392 1092:aload_2         
	//  393 1093:iload           5
	//  394 1095:aload_1         
	//  395 1096:getfield        #646 <Field float ConstraintSet$Constraint.guidePercent>
	//  396 1099:invokevirtual   #524 <Method float TypedArray.getFloat(int, float)>
	//  397 1102:putfield        #646 <Field float ConstraintSet$Constraint.guidePercent>
				break;

	//* 398 1105:goto            1407
			case 18: // '\022'
				constraint.guideEnd = typedarray.getDimensionPixelOffset(k, constraint.guideEnd);
	//  399 1108:aload_1         
	//  400 1109:aload_2         
	//  401 1110:iload           5
	//  402 1112:aload_1         
	//  403 1113:getfield        #649 <Field int ConstraintSet$Constraint.guideEnd>
	//  404 1116:invokevirtual   #652 <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//  405 1119:putfield        #649 <Field int ConstraintSet$Constraint.guideEnd>
				break;

	//* 406 1122:goto            1407
			case 17: // '\021'
				constraint.guideBegin = typedarray.getDimensionPixelOffset(k, constraint.guideBegin);
	//  407 1125:aload_1         
	//  408 1126:aload_2         
	//  409 1127:iload           5
	//  410 1129:aload_1         
	//  411 1130:getfield        #655 <Field int ConstraintSet$Constraint.guideBegin>
	//  412 1133:invokevirtual   #652 <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//  413 1136:putfield        #655 <Field int ConstraintSet$Constraint.guideBegin>
				break;

	//* 414 1139:goto            1407
			case 16: // '\020'
				constraint.goneTopMargin = typedarray.getDimensionPixelSize(k, constraint.goneTopMargin);
	//  415 1142:aload_1         
	//  416 1143:aload_2         
	//  417 1144:iload           5
	//  418 1146:aload_1         
	//  419 1147:getfield        #658 <Field int ConstraintSet$Constraint.goneTopMargin>
	//  420 1150:invokevirtual   #530 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  421 1153:putfield        #658 <Field int ConstraintSet$Constraint.goneTopMargin>
				break;

	//* 422 1156:goto            1407
			case 15: // '\017'
				constraint.goneStartMargin = typedarray.getDimensionPixelSize(k, constraint.goneStartMargin);
	//  423 1159:aload_1         
	//  424 1160:aload_2         
	//  425 1161:iload           5
	//  426 1163:aload_1         
	//  427 1164:getfield        #661 <Field int ConstraintSet$Constraint.goneStartMargin>
	//  428 1167:invokevirtual   #530 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  429 1170:putfield        #661 <Field int ConstraintSet$Constraint.goneStartMargin>
				break;

	//* 430 1173:goto            1407
			case 14: // '\016'
				constraint.goneRightMargin = typedarray.getDimensionPixelSize(k, constraint.goneRightMargin);
	//  431 1176:aload_1         
	//  432 1177:aload_2         
	//  433 1178:iload           5
	//  434 1180:aload_1         
	//  435 1181:getfield        #664 <Field int ConstraintSet$Constraint.goneRightMargin>
	//  436 1184:invokevirtual   #530 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  437 1187:putfield        #664 <Field int ConstraintSet$Constraint.goneRightMargin>
				break;

	//* 438 1190:goto            1407
			case 13: // '\r'
				constraint.goneLeftMargin = typedarray.getDimensionPixelSize(k, constraint.goneLeftMargin);
	//  439 1193:aload_1         
	//  440 1194:aload_2         
	//  441 1195:iload           5
	//  442 1197:aload_1         
	//  443 1198:getfield        #667 <Field int ConstraintSet$Constraint.goneLeftMargin>
	//  444 1201:invokevirtual   #530 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  445 1204:putfield        #667 <Field int ConstraintSet$Constraint.goneLeftMargin>
				break;

	//* 446 1207:goto            1407
			case 12: // '\f'
				constraint.goneEndMargin = typedarray.getDimensionPixelSize(k, constraint.goneEndMargin);
	//  447 1210:aload_1         
	//  448 1211:aload_2         
	//  449 1212:iload           5
	//  450 1214:aload_1         
	//  451 1215:getfield        #670 <Field int ConstraintSet$Constraint.goneEndMargin>
	//  452 1218:invokevirtual   #530 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  453 1221:putfield        #670 <Field int ConstraintSet$Constraint.goneEndMargin>
				break;

	//* 454 1224:goto            1407
			case 11: // '\013'
				constraint.goneBottomMargin = typedarray.getDimensionPixelSize(k, constraint.goneBottomMargin);
	//  455 1227:aload_1         
	//  456 1228:aload_2         
	//  457 1229:iload           5
	//  458 1231:aload_1         
	//  459 1232:getfield        #673 <Field int ConstraintSet$Constraint.goneBottomMargin>
	//  460 1235:invokevirtual   #530 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  461 1238:putfield        #673 <Field int ConstraintSet$Constraint.goneBottomMargin>
				break;

	//* 462 1241:goto            1407
			case 10: // '\n'
				constraint.endToStart = lookupID(typedarray, k, constraint.endToStart);
	//  463 1244:aload_1         
	//  464 1245:aload_2         
	//  465 1246:iload           5
	//  466 1248:aload_1         
	//  467 1249:getfield        #676 <Field int ConstraintSet$Constraint.endToStart>
	//  468 1252:invokestatic    #535 <Method int lookupID(TypedArray, int, int)>
	//  469 1255:putfield        #676 <Field int ConstraintSet$Constraint.endToStart>
				break;

	//* 470 1258:goto            1407
			case 9: // '\t'
				constraint.endToEnd = lookupID(typedarray, k, constraint.endToEnd);
	//  471 1261:aload_1         
	//  472 1262:aload_2         
	//  473 1263:iload           5
	//  474 1265:aload_1         
	//  475 1266:getfield        #679 <Field int ConstraintSet$Constraint.endToEnd>
	//  476 1269:invokestatic    #535 <Method int lookupID(TypedArray, int, int)>
	//  477 1272:putfield        #679 <Field int ConstraintSet$Constraint.endToEnd>
				break;

	//* 478 1275:goto            1407
			case 8: // '\b'
				constraint.endMargin = typedarray.getDimensionPixelSize(k, constraint.endMargin);
	//  479 1278:aload_1         
	//  480 1279:aload_2         
	//  481 1280:iload           5
	//  482 1282:aload_1         
	//  483 1283:getfield        #682 <Field int ConstraintSet$Constraint.endMargin>
	//  484 1286:invokevirtual   #530 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  485 1289:putfield        #682 <Field int ConstraintSet$Constraint.endMargin>
				break;

	//* 486 1292:goto            1407
			case 7: // '\007'
				constraint.editorAbsoluteY = typedarray.getDimensionPixelOffset(k, constraint.editorAbsoluteY);
	//  487 1295:aload_1         
	//  488 1296:aload_2         
	//  489 1297:iload           5
	//  490 1299:aload_1         
	//  491 1300:getfield        #685 <Field int ConstraintSet$Constraint.editorAbsoluteY>
	//  492 1303:invokevirtual   #652 <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//  493 1306:putfield        #685 <Field int ConstraintSet$Constraint.editorAbsoluteY>
				break;

	//* 494 1309:goto            1407
			case 6: // '\006'
				constraint.editorAbsoluteX = typedarray.getDimensionPixelOffset(k, constraint.editorAbsoluteX);
	//  495 1312:aload_1         
	//  496 1313:aload_2         
	//  497 1314:iload           5
	//  498 1316:aload_1         
	//  499 1317:getfield        #688 <Field int ConstraintSet$Constraint.editorAbsoluteX>
	//  500 1320:invokevirtual   #652 <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//  501 1323:putfield        #688 <Field int ConstraintSet$Constraint.editorAbsoluteX>
				break;

	//* 502 1326:goto            1407
			case 5: // '\005'
				constraint.dimensionRatio = typedarray.getString(k);
	//  503 1329:aload_1         
	//  504 1330:aload_2         
	//  505 1331:iload           5
	//  506 1333:invokevirtual   #691 <Method String TypedArray.getString(int)>
	//  507 1336:putfield        #694 <Field String ConstraintSet$Constraint.dimensionRatio>
				break;

	//* 508 1339:goto            1407
			case 4: // '\004'
				constraint.bottomToTop = lookupID(typedarray, k, constraint.bottomToTop);
	//  509 1342:aload_1         
	//  510 1343:aload_2         
	//  511 1344:iload           5
	//  512 1346:aload_1         
	//  513 1347:getfield        #697 <Field int ConstraintSet$Constraint.bottomToTop>
	//  514 1350:invokestatic    #535 <Method int lookupID(TypedArray, int, int)>
	//  515 1353:putfield        #697 <Field int ConstraintSet$Constraint.bottomToTop>
				break;

	//* 516 1356:goto            1407
			case 3: // '\003'
				constraint.bottomToBottom = lookupID(typedarray, k, constraint.bottomToBottom);
	//  517 1359:aload_1         
	//  518 1360:aload_2         
	//  519 1361:iload           5
	//  520 1363:aload_1         
	//  521 1364:getfield        #700 <Field int ConstraintSet$Constraint.bottomToBottom>
	//  522 1367:invokestatic    #535 <Method int lookupID(TypedArray, int, int)>
	//  523 1370:putfield        #700 <Field int ConstraintSet$Constraint.bottomToBottom>
				break;

	//* 524 1373:goto            1407
			case 2: // '\002'
				constraint.bottomMargin = typedarray.getDimensionPixelSize(k, constraint.bottomMargin);
	//  525 1376:aload_1         
	//  526 1377:aload_2         
	//  527 1378:iload           5
	//  528 1380:aload_1         
	//  529 1381:getfield        #703 <Field int ConstraintSet$Constraint.bottomMargin>
	//  530 1384:invokevirtual   #530 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  531 1387:putfield        #703 <Field int ConstraintSet$Constraint.bottomMargin>
				break;

	//* 532 1390:goto            1407
			case 1: // '\001'
				constraint.baselineToBaseline = lookupID(typedarray, k, constraint.baselineToBaseline);
	//  533 1393:aload_1         
	//  534 1394:aload_2         
	//  535 1395:iload           5
	//  536 1397:aload_1         
	//  537 1398:getfield        #706 <Field int ConstraintSet$Constraint.baselineToBaseline>
	//  538 1401:invokestatic    #535 <Method int lookupID(TypedArray, int, int)>
	//  539 1404:putfield        #706 <Field int ConstraintSet$Constraint.baselineToBaseline>
				break;
			}
		}

	//  540 1407:iload_3         
	//  541 1408:iconst_1        
	//  542 1409:iadd            
	//  543 1410:istore_3        
	//* 544 1411:goto            8
	//  545 1414:return          
	}

	private String sideToString(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 7: default 44
	//	               1 72
	//	               2 68
	//	               3 64
	//	               4 60
	//	               5 56
	//	               6 52
	//	               7 48
		default:
			return "undefined";
	//    2   44:ldc2            #709 <String "undefined">
	//    3   47:areturn         

		case 7: // '\007'
			return "end";
	//    4   48:ldc2            #711 <String "end">
	//    5   51:areturn         

		case 6: // '\006'
			return "start";
	//    6   52:ldc2            #713 <String "start">
	//    7   55:areturn         

		case 5: // '\005'
			return "baseline";
	//    8   56:ldc2            #715 <String "baseline">
	//    9   59:areturn         

		case 4: // '\004'
			return "bottom";
	//   10   60:ldc2            #717 <String "bottom">
	//   11   63:areturn         

		case 3: // '\003'
			return "top";
	//   12   64:ldc2            #719 <String "top">
	//   13   67:areturn         

		case 2: // '\002'
			return "right";
	//   14   68:ldc2            #721 <String "right">
	//   15   71:areturn         

		case 1: // '\001'
			return "left";
	//   16   72:ldc2            #723 <String "left">
	//   17   75:areturn         
		}
	}

	public void addToHorizontalChain(int i, int j, int k)
	{
		byte byte0;
		if(j == 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            10
			byte0 = 1;
	//    2    4:iconst_1        
	//    3    5:istore          4
		else
	//*   4    7:goto            13
			byte0 = 2;
	//    5   10:iconst_2        
	//    6   11:istore          4
		connect(i, 1, j, ((int) (byte0)), 0);
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:iconst_1        
	//   10   16:iload_2         
	//   11   17:iload           4
	//   12   19:iconst_0        
	//   13   20:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
		if(k == 0)
	//*  14   23:iload_3         
	//*  15   24:ifne            33
			byte0 = 2;
	//   16   27:iconst_2        
	//   17   28:istore          4
		else
	//*  18   30:goto            36
			byte0 = 1;
	//   19   33:iconst_1        
	//   20   34:istore          4
		connect(i, 2, k, ((int) (byte0)), 0);
	//   21   36:aload_0         
	//   22   37:iload_1         
	//   23   38:iconst_2        
	//   24   39:iload_3         
	//   25   40:iload           4
	//   26   42:iconst_0        
	//   27   43:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
		if(j != 0)
	//*  28   46:iload_2         
	//*  29   47:ifeq            59
			connect(j, 2, i, 1, 0);
	//   30   50:aload_0         
	//   31   51:iload_2         
	//   32   52:iconst_2        
	//   33   53:iload_1         
	//   34   54:iconst_1        
	//   35   55:iconst_0        
	//   36   56:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
		if(k != 0)
	//*  37   59:iload_3         
	//*  38   60:ifeq            72
			connect(k, 1, i, 2, 0);
	//   39   63:aload_0         
	//   40   64:iload_3         
	//   41   65:iconst_1        
	//   42   66:iload_1         
	//   43   67:iconst_2        
	//   44   68:iconst_0        
	//   45   69:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
	//   46   72:return          
	}

	public void addToHorizontalChainRTL(int i, int j, int k)
	{
		byte byte0;
		if(j == 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            11
			byte0 = 6;
	//    2    4:bipush          6
	//    3    6:istore          4
		else
	//*   4    8:goto            15
			byte0 = 7;
	//    5   11:bipush          7
	//    6   13:istore          4
		connect(i, 6, j, ((int) (byte0)), 0);
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:bipush          6
	//   10   19:iload_2         
	//   11   20:iload           4
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
		if(k == 0)
	//*  14   26:iload_3         
	//*  15   27:ifne            37
			byte0 = 7;
	//   16   30:bipush          7
	//   17   32:istore          4
		else
	//*  18   34:goto            41
			byte0 = 6;
	//   19   37:bipush          6
	//   20   39:istore          4
		connect(i, 7, k, ((int) (byte0)), 0);
	//   21   41:aload_0         
	//   22   42:iload_1         
	//   23   43:bipush          7
	//   24   45:iload_3         
	//   25   46:iload           4
	//   26   48:iconst_0        
	//   27   49:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
		if(j != 0)
	//*  28   52:iload_2         
	//*  29   53:ifeq            67
			connect(j, 7, i, 6, 0);
	//   30   56:aload_0         
	//   31   57:iload_2         
	//   32   58:bipush          7
	//   33   60:iload_1         
	//   34   61:bipush          6
	//   35   63:iconst_0        
	//   36   64:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
		if(k != 0)
	//*  37   67:iload_3         
	//*  38   68:ifeq            82
			connect(k, 6, i, 7, 0);
	//   39   71:aload_0         
	//   40   72:iload_3         
	//   41   73:bipush          6
	//   42   75:iload_1         
	//   43   76:bipush          7
	//   44   78:iconst_0        
	//   45   79:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
	//   46   82:return          
	}

	public void addToVerticalChain(int i, int j, int k)
	{
		byte byte0;
		if(j == 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            10
			byte0 = 3;
	//    2    4:iconst_3        
	//    3    5:istore          4
		else
	//*   4    7:goto            13
			byte0 = 4;
	//    5   10:iconst_4        
	//    6   11:istore          4
		connect(i, 3, j, ((int) (byte0)), 0);
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:iconst_3        
	//   10   16:iload_2         
	//   11   17:iload           4
	//   12   19:iconst_0        
	//   13   20:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
		if(k == 0)
	//*  14   23:iload_3         
	//*  15   24:ifne            33
			byte0 = 4;
	//   16   27:iconst_4        
	//   17   28:istore          4
		else
	//*  18   30:goto            36
			byte0 = 3;
	//   19   33:iconst_3        
	//   20   34:istore          4
		connect(i, 4, k, ((int) (byte0)), 0);
	//   21   36:aload_0         
	//   22   37:iload_1         
	//   23   38:iconst_4        
	//   24   39:iload_3         
	//   25   40:iload           4
	//   26   42:iconst_0        
	//   27   43:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
		if(j != 0)
	//*  28   46:iload_2         
	//*  29   47:ifeq            59
			connect(j, 4, i, 3, 0);
	//   30   50:aload_0         
	//   31   51:iload_2         
	//   32   52:iconst_4        
	//   33   53:iload_1         
	//   34   54:iconst_3        
	//   35   55:iconst_0        
	//   36   56:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
		if(j != 0)
	//*  37   59:iload_2         
	//*  38   60:ifeq            72
			connect(k, 3, i, 4, 0);
	//   39   63:aload_0         
	//   40   64:iload_3         
	//   41   65:iconst_3        
	//   42   66:iload_1         
	//   43   67:iconst_4        
	//   44   68:iconst_0        
	//   45   69:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
	//   46   72:return          
	}

	public void applyTo(ConstraintLayout constraintlayout)
	{
		applyToInternal(constraintlayout);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #732 <Method void applyToInternal(ConstraintLayout)>
		constraintlayout.setConstraintSet(((ConstraintSet) (null)));
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:invokevirtual   #738 <Method void ConstraintLayout.setConstraintSet(ConstraintSet)>
	//    6   10:return          
	}

	void applyToInternal(ConstraintLayout constraintlayout)
	{
		int j = constraintlayout.getChildCount();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #741 <Method int ConstraintLayout.getChildCount()>
	//    2    4:istore_3        
		Object obj = ((Object) (new HashSet(((java.util.Collection) (mConstraints.keySet())))));
	//    3    5:new             #743 <Class HashSet>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:getfield        #406 <Field HashMap mConstraints>
	//    7   13:invokevirtual   #747 <Method Set HashMap.keySet()>
	//    8   16:invokespecial   #750 <Method void HashSet(java.util.Collection)>
	//    9   19:astore          5
		for(int i = 0; i < j;)
	//*  10   21:iconst_0        
	//*  11   22:istore_2        
	//*  12   23:iload_2         
	//*  13   24:iload_3         
	//*  14   25:icmpge          373
		{
			View view = constraintlayout.getChildAt(i);
	//   15   28:aload_1         
	//   16   29:iload_2         
	//   17   30:invokevirtual   #754 <Method View ConstraintLayout.getChildAt(int)>
	//   18   33:astore          6
			int k = view.getId();
	//   19   35:aload           6
	//   20   37:invokevirtual   #759 <Method int View.getId()>
	//   21   40:istore          4
			if(k != -1)
	//*  22   42:iload           4
	//*  23   44:iconst_m1       
	//*  24   45:icmpeq          362
			{
				if(mConstraints.containsKey(((Object) (Integer.valueOf(k)))))
	//*  25   48:aload_0         
	//*  26   49:getfield        #406 <Field HashMap mConstraints>
	//*  27   52:iload           4
	//*  28   54:invokestatic    #458 <Method Integer Integer.valueOf(int)>
	//*  29   57:invokevirtual   #462 <Method boolean HashMap.containsKey(Object)>
	//*  30   60:ifeq            355
				{
					((HashSet) (obj)).remove(((Object) (Integer.valueOf(k))));
	//   31   63:aload           5
	//   32   65:iload           4
	//   33   67:invokestatic    #458 <Method Integer Integer.valueOf(int)>
	//   34   70:invokevirtual   #762 <Method boolean HashSet.remove(Object)>
	//   35   73:pop             
					Constraint constraint1 = (Constraint)mConstraints.get(((Object) (Integer.valueOf(k))));
	//   36   74:aload_0         
	//   37   75:getfield        #406 <Field HashMap mConstraints>
	//   38   78:iload           4
	//   39   80:invokestatic    #458 <Method Integer Integer.valueOf(int)>
	//   40   83:invokevirtual   #469 <Method Object HashMap.get(Object)>
	//   41   86:checkcast       #8   <Class ConstraintSet$Constraint>
	//   42   89:astore          7
					if(constraint1.mHelperType != -1 && constraint1.mHelperType == 1)
	//*  43   91:aload           7
	//*  44   93:getfield        #765 <Field int ConstraintSet$Constraint.mHelperType>
	//*  45   96:iconst_m1       
	//*  46   97:icmpeq          155
	//*  47  100:aload           7
	//*  48  102:getfield        #765 <Field int ConstraintSet$Constraint.mHelperType>
	//*  49  105:iconst_1        
	//*  50  106:icmpeq          112
	//*  51  109:goto            155
					{
						Barrier barrier = (Barrier)view;
	//   52  112:aload           6
	//   53  114:checkcast       #767 <Class Barrier>
	//   54  117:astore          8
						barrier.setId(k);
	//   55  119:aload           8
	//   56  121:iload           4
	//   57  123:invokevirtual   #771 <Method void Barrier.setId(int)>
						barrier.setReferencedIds(constraint1.mReferenceIds);
	//   58  126:aload           8
	//   59  128:aload           7
	//   60  130:getfield        #774 <Field int[] ConstraintSet$Constraint.mReferenceIds>
	//   61  133:invokevirtual   #778 <Method void Barrier.setReferencedIds(int[])>
						barrier.setType(constraint1.mBarrierDirection);
	//   62  136:aload           8
	//   63  138:aload           7
	//   64  140:getfield        #781 <Field int ConstraintSet$Constraint.mBarrierDirection>
	//   65  143:invokevirtual   #784 <Method void Barrier.setType(int)>
						constraint1.applyTo(constraintlayout.generateDefaultLayoutParams());
	//   66  146:aload           7
	//   67  148:aload_1         
	//   68  149:invokevirtual   #788 <Method ConstraintLayout$LayoutParams ConstraintLayout.generateDefaultLayoutParams()>
	//   69  152:invokevirtual   #791 <Method void ConstraintSet$Constraint.applyTo(ConstraintLayout$LayoutParams)>
					}
					ConstraintLayout.LayoutParams layoutparams = (ConstraintLayout.LayoutParams)view.getLayoutParams();
	//   70  155:aload           6
	//   71  157:invokevirtual   #795 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   72  160:checkcast       #797 <Class ConstraintLayout$LayoutParams>
	//   73  163:astore          8
					constraint1.applyTo(layoutparams);
	//   74  165:aload           7
	//   75  167:aload           8
	//   76  169:invokevirtual   #791 <Method void ConstraintSet$Constraint.applyTo(ConstraintLayout$LayoutParams)>
					view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   77  172:aload           6
	//   78  174:aload           8
	//   79  176:invokevirtual   #801 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
					view.setVisibility(constraint1.visibility);
	//   80  179:aload           6
	//   81  181:aload           7
	//   82  183:getfield        #637 <Field int ConstraintSet$Constraint.visibility>
	//   83  186:invokevirtual   #804 <Method void View.setVisibility(int)>
					if(android.os.Build.VERSION.SDK_INT >= 17)
	//*  84  189:getstatic       #809 <Field int android.os.Build$VERSION.SDK_INT>
	//*  85  192:bipush          17
	//*  86  194:icmplt          355
					{
						view.setAlpha(constraint1.alpha);
	//   87  197:aload           6
	//   88  199:aload           7
	//   89  201:getfield        #577 <Field float ConstraintSet$Constraint.alpha>
	//   90  204:invokevirtual   #813 <Method void View.setAlpha(float)>
						view.setRotation(constraint1.rotation);
	//   91  207:aload           6
	//   92  209:aload           7
	//   93  211:getfield        #538 <Field float ConstraintSet$Constraint.rotation>
	//   94  214:invokevirtual   #816 <Method void View.setRotation(float)>
						view.setRotationX(constraint1.rotationX);
	//   95  217:aload           6
	//   96  219:aload           7
	//   97  221:getfield        #568 <Field float ConstraintSet$Constraint.rotationX>
	//   98  224:invokevirtual   #819 <Method void View.setRotationX(float)>
						view.setRotationY(constraint1.rotationY);
	//   99  227:aload           6
	//  100  229:aload           7
	//  101  231:getfield        #565 <Field float ConstraintSet$Constraint.rotationY>
	//  102  234:invokevirtual   #822 <Method void View.setRotationY(float)>
						view.setScaleX(constraint1.scaleX);
	//  103  237:aload           6
	//  104  239:aload           7
	//  105  241:getfield        #562 <Field float ConstraintSet$Constraint.scaleX>
	//  106  244:invokevirtual   #825 <Method void View.setScaleX(float)>
						view.setScaleY(constraint1.scaleY);
	//  107  247:aload           6
	//  108  249:aload           7
	//  109  251:getfield        #559 <Field float ConstraintSet$Constraint.scaleY>
	//  110  254:invokevirtual   #828 <Method void View.setScaleY(float)>
						if(!Float.isNaN(constraint1.transformPivotX))
	//* 111  257:aload           7
	//* 112  259:getfield        #556 <Field float ConstraintSet$Constraint.transformPivotX>
	//* 113  262:invokestatic    #834 <Method boolean Float.isNaN(float)>
	//* 114  265:ifne            278
							view.setPivotX(constraint1.transformPivotX);
	//  115  268:aload           6
	//  116  270:aload           7
	//  117  272:getfield        #556 <Field float ConstraintSet$Constraint.transformPivotX>
	//  118  275:invokevirtual   #837 <Method void View.setPivotX(float)>
						if(!Float.isNaN(constraint1.transformPivotY))
	//* 119  278:aload           7
	//* 120  280:getfield        #553 <Field float ConstraintSet$Constraint.transformPivotY>
	//* 121  283:invokestatic    #834 <Method boolean Float.isNaN(float)>
	//* 122  286:ifne            299
							view.setPivotY(constraint1.transformPivotY);
	//  123  289:aload           6
	//  124  291:aload           7
	//  125  293:getfield        #553 <Field float ConstraintSet$Constraint.transformPivotY>
	//  126  296:invokevirtual   #840 <Method void View.setPivotY(float)>
						view.setTranslationX(constraint1.translationX);
	//  127  299:aload           6
	//  128  301:aload           7
	//  129  303:getfield        #550 <Field float ConstraintSet$Constraint.translationX>
	//  130  306:invokevirtual   #843 <Method void View.setTranslationX(float)>
						view.setTranslationY(constraint1.translationY);
	//  131  309:aload           6
	//  132  311:aload           7
	//  133  313:getfield        #547 <Field float ConstraintSet$Constraint.translationY>
	//  134  316:invokevirtual   #846 <Method void View.setTranslationY(float)>
						if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 135  319:getstatic       #809 <Field int android.os.Build$VERSION.SDK_INT>
	//* 136  322:bipush          21
	//* 137  324:icmplt          355
						{
							view.setTranslationZ(constraint1.translationZ);
	//  138  327:aload           6
	//  139  329:aload           7
	//  140  331:getfield        #541 <Field float ConstraintSet$Constraint.translationZ>
	//  141  334:invokevirtual   #849 <Method void View.setTranslationZ(float)>
							if(constraint1.applyElevation)
	//* 142  337:aload           7
	//* 143  339:getfield        #571 <Field boolean ConstraintSet$Constraint.applyElevation>
	//* 144  342:ifeq            355
								view.setElevation(constraint1.elevation);
	//  145  345:aload           6
	//  146  347:aload           7
	//  147  349:getfield        #574 <Field float ConstraintSet$Constraint.elevation>
	//  148  352:invokevirtual   #852 <Method void View.setElevation(float)>
						}
					}
				}
				i++;
	//  149  355:iload_2         
	//  150  356:iconst_1        
	//  151  357:iadd            
	//  152  358:istore_2        
			} else
	//* 153  359:goto            23
			{
				throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
	//  154  362:new             #854 <Class RuntimeException>
	//  155  365:dup             
	//  156  366:ldc2            #856 <String "All children of ConstraintLayout must have ids to use ConstraintSet">
	//  157  369:invokespecial   #857 <Method void RuntimeException(String)>
	//  158  372:athrow          
			}
		}

		obj = ((Object) (((HashSet) (obj)).iterator()));
	//  159  373:aload           5
	//  160  375:invokevirtual   #861 <Method Iterator HashSet.iterator()>
	//  161  378:astore          5
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//  162  380:aload           5
	//  163  382:invokeinterface #867 <Method boolean Iterator.hasNext()>
	//  164  387:ifeq            556
			Object obj1 = ((Object) ((Integer)((Iterator) (obj)).next()));
	//  165  390:aload           5
	//  166  392:invokeinterface #871 <Method Object Iterator.next()>
	//  167  397:checkcast       #454 <Class Integer>
	//  168  400:astore          7
			Constraint constraint = (Constraint)mConstraints.get(obj1);
	//  169  402:aload_0         
	//  170  403:getfield        #406 <Field HashMap mConstraints>
	//  171  406:aload           7
	//  172  408:invokevirtual   #469 <Method Object HashMap.get(Object)>
	//  173  411:checkcast       #8   <Class ConstraintSet$Constraint>
	//  174  414:astore          6
			if(constraint.mHelperType != -1 && constraint.mHelperType == 1)
	//* 175  416:aload           6
	//* 176  418:getfield        #765 <Field int ConstraintSet$Constraint.mHelperType>
	//* 177  421:iconst_m1       
	//* 178  422:icmpeq          501
	//* 179  425:aload           6
	//* 180  427:getfield        #765 <Field int ConstraintSet$Constraint.mHelperType>
	//* 181  430:iconst_1        
	//* 182  431:icmpeq          437
	//* 183  434:goto            501
			{
				Barrier barrier1 = new Barrier(constraintlayout.getContext());
	//  184  437:new             #767 <Class Barrier>
	//  185  440:dup             
	//  186  441:aload_1         
	//  187  442:invokevirtual   #875 <Method Context ConstraintLayout.getContext()>
	//  188  445:invokespecial   #878 <Method void Barrier(Context)>
	//  189  448:astore          8
				barrier1.setId(((Integer) (obj1)).intValue());
	//  190  450:aload           8
	//  191  452:aload           7
	//  192  454:invokevirtual   #881 <Method int Integer.intValue()>
	//  193  457:invokevirtual   #771 <Method void Barrier.setId(int)>
				barrier1.setReferencedIds(constraint.mReferenceIds);
	//  194  460:aload           8
	//  195  462:aload           6
	//  196  464:getfield        #774 <Field int[] ConstraintSet$Constraint.mReferenceIds>
	//  197  467:invokevirtual   #778 <Method void Barrier.setReferencedIds(int[])>
				barrier1.setType(constraint.mBarrierDirection);
	//  198  470:aload           8
	//  199  472:aload           6
	//  200  474:getfield        #781 <Field int ConstraintSet$Constraint.mBarrierDirection>
	//  201  477:invokevirtual   #784 <Method void Barrier.setType(int)>
				ConstraintLayout.LayoutParams layoutparams1 = constraintlayout.generateDefaultLayoutParams();
	//  202  480:aload_1         
	//  203  481:invokevirtual   #788 <Method ConstraintLayout$LayoutParams ConstraintLayout.generateDefaultLayoutParams()>
	//  204  484:astore          9
				constraint.applyTo(layoutparams1);
	//  205  486:aload           6
	//  206  488:aload           9
	//  207  490:invokevirtual   #791 <Method void ConstraintSet$Constraint.applyTo(ConstraintLayout$LayoutParams)>
				constraintlayout.addView(((View) (barrier1)), ((android.view.ViewGroup.LayoutParams) (layoutparams1)));
	//  208  493:aload_1         
	//  209  494:aload           8
	//  210  496:aload           9
	//  211  498:invokevirtual   #885 <Method void ConstraintLayout.addView(View, android.view.ViewGroup$LayoutParams)>
			}
			if(constraint.mIsGuideline)
	//* 212  501:aload           6
	//* 213  503:getfield        #888 <Field boolean ConstraintSet$Constraint.mIsGuideline>
	//* 214  506:ifeq            380
			{
				Guideline guideline = new Guideline(constraintlayout.getContext());
	//  215  509:new             #890 <Class Guideline>
	//  216  512:dup             
	//  217  513:aload_1         
	//  218  514:invokevirtual   #875 <Method Context ConstraintLayout.getContext()>
	//  219  517:invokespecial   #891 <Method void Guideline(Context)>
	//  220  520:astore          8
				guideline.setId(((Integer) (obj1)).intValue());
	//  221  522:aload           8
	//  222  524:aload           7
	//  223  526:invokevirtual   #881 <Method int Integer.intValue()>
	//  224  529:invokevirtual   #892 <Method void Guideline.setId(int)>
				obj1 = ((Object) (constraintlayout.generateDefaultLayoutParams()));
	//  225  532:aload_1         
	//  226  533:invokevirtual   #788 <Method ConstraintLayout$LayoutParams ConstraintLayout.generateDefaultLayoutParams()>
	//  227  536:astore          7
				constraint.applyTo(((ConstraintLayout.LayoutParams) (obj1)));
	//  228  538:aload           6
	//  229  540:aload           7
	//  230  542:invokevirtual   #791 <Method void ConstraintSet$Constraint.applyTo(ConstraintLayout$LayoutParams)>
				constraintlayout.addView(((View) (guideline)), ((android.view.ViewGroup.LayoutParams) (obj1)));
	//  231  545:aload_1         
	//  232  546:aload           8
	//  233  548:aload           7
	//  234  550:invokevirtual   #885 <Method void ConstraintLayout.addView(View, android.view.ViewGroup$LayoutParams)>
			}
		} while(true);
	//  235  553:goto            380
	//  236  556:return          
	}

	public void center(int i, int j, int k, int l, int i1, int j1, int k1, 
			float f)
	{
		if(l >= 0)
	//*   0    0:iload           4
	//*   1    2:iflt            202
		{
			if(k1 >= 0)
	//*   2    5:iload           7
	//*   3    7:iflt            191
			{
				if(f > 0.0F && f <= 1.0F)
	//*   4   10:fload           8
	//*   5   12:fconst_0        
	//*   6   13:fcmpg           
	//*   7   14:ifle            180
	//*   8   17:fload           8
	//*   9   19:fconst_1        
	//*  10   20:fcmpl           
	//*  11   21:ifgt            180
				{
					if(k != 1 && k != 2)
	//*  12   24:iload_3         
	//*  13   25:iconst_1        
	//*  14   26:icmpeq          138
	//*  15   29:iload_3         
	//*  16   30:iconst_2        
	//*  17   31:icmpne          37
	//*  18   34:goto            138
					{
						if(k != 6 && k != 7)
	//*  19   37:iload_3         
	//*  20   38:bipush          6
	//*  21   40:icmpeq          94
	//*  22   43:iload_3         
	//*  23   44:bipush          7
	//*  24   46:icmpne          52
	//*  25   49:goto            94
						{
							connect(i, 3, j, k, l);
	//   26   52:aload_0         
	//   27   53:iload_1         
	//   28   54:iconst_3        
	//   29   55:iload_2         
	//   30   56:iload_3         
	//   31   57:iload           4
	//   32   59:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
							connect(i, 4, i1, j1, k1);
	//   33   62:aload_0         
	//   34   63:iload_1         
	//   35   64:iconst_4        
	//   36   65:iload           5
	//   37   67:iload           6
	//   38   69:iload           7
	//   39   71:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
							((Constraint)mConstraints.get(((Object) (Integer.valueOf(i))))).verticalBias = f;
	//   40   74:aload_0         
	//   41   75:getfield        #406 <Field HashMap mConstraints>
	//   42   78:iload_1         
	//   43   79:invokestatic    #458 <Method Integer Integer.valueOf(int)>
	//   44   82:invokevirtual   #469 <Method Object HashMap.get(Object)>
	//   45   85:checkcast       #8   <Class ConstraintSet$Constraint>
	//   46   88:fload           8
	//   47   90:putfield        #589 <Field float ConstraintSet$Constraint.verticalBias>
							return;
	//   48   93:return          
						} else
						{
							connect(i, 6, j, k, l);
	//   49   94:aload_0         
	//   50   95:iload_1         
	//   51   96:bipush          6
	//   52   98:iload_2         
	//   53   99:iload_3         
	//   54  100:iload           4
	//   55  102:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
							connect(i, 7, i1, j1, k1);
	//   56  105:aload_0         
	//   57  106:iload_1         
	//   58  107:bipush          7
	//   59  109:iload           5
	//   60  111:iload           6
	//   61  113:iload           7
	//   62  115:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
							((Constraint)mConstraints.get(((Object) (Integer.valueOf(i))))).horizontalBias = f;
	//   63  118:aload_0         
	//   64  119:getfield        #406 <Field HashMap mConstraints>
	//   65  122:iload_1         
	//   66  123:invokestatic    #458 <Method Integer Integer.valueOf(int)>
	//   67  126:invokevirtual   #469 <Method Object HashMap.get(Object)>
	//   68  129:checkcast       #8   <Class ConstraintSet$Constraint>
	//   69  132:fload           8
	//   70  134:putfield        #643 <Field float ConstraintSet$Constraint.horizontalBias>
							return;
	//   71  137:return          
						}
					} else
					{
						connect(i, 1, j, k, l);
	//   72  138:aload_0         
	//   73  139:iload_1         
	//   74  140:iconst_1        
	//   75  141:iload_2         
	//   76  142:iload_3         
	//   77  143:iload           4
	//   78  145:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
						connect(i, 2, i1, j1, k1);
	//   79  148:aload_0         
	//   80  149:iload_1         
	//   81  150:iconst_2        
	//   82  151:iload           5
	//   83  153:iload           6
	//   84  155:iload           7
	//   85  157:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
						((Constraint)mConstraints.get(((Object) (Integer.valueOf(i))))).horizontalBias = f;
	//   86  160:aload_0         
	//   87  161:getfield        #406 <Field HashMap mConstraints>
	//   88  164:iload_1         
	//   89  165:invokestatic    #458 <Method Integer Integer.valueOf(int)>
	//   90  168:invokevirtual   #469 <Method Object HashMap.get(Object)>
	//   91  171:checkcast       #8   <Class ConstraintSet$Constraint>
	//   92  174:fload           8
	//   93  176:putfield        #643 <Field float ConstraintSet$Constraint.horizontalBias>
						return;
	//   94  179:return          
					}
				} else
				{
					throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
	//   95  180:new             #410 <Class IllegalArgumentException>
	//   96  183:dup             
	//   97  184:ldc2            #896 <String "bias must be between 0 and 1 inclusive">
	//   98  187:invokespecial   #415 <Method void IllegalArgumentException(String)>
	//   99  190:athrow          
				}
			} else
			{
				throw new IllegalArgumentException("margin must be > 0");
	//  100  191:new             #410 <Class IllegalArgumentException>
	//  101  194:dup             
	//  102  195:ldc2            #898 <String "margin must be > 0">
	//  103  198:invokespecial   #415 <Method void IllegalArgumentException(String)>
	//  104  201:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("margin must be > 0");
	//  105  202:new             #410 <Class IllegalArgumentException>
	//  106  205:dup             
	//  107  206:ldc2            #898 <String "margin must be > 0">
	//  108  209:invokespecial   #415 <Method void IllegalArgumentException(String)>
	//  109  212:athrow          
		}
	}

	public void centerHorizontally(int i, int j)
	{
		if(j == 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            19
		{
			center(i, 0, 1, 0, 0, 2, 0, 0.5F);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iconst_0        
	//    5    7:iconst_1        
	//    6    8:iconst_0        
	//    7    9:iconst_0        
	//    8   10:iconst_2        
	//    9   11:iconst_0        
	//   10   12:ldc2            #900 <Float 0.5F>
	//   11   15:invokevirtual   #902 <Method void center(int, int, int, int, int, int, int, float)>
			return;
	//   12   18:return          
		} else
		{
			center(i, j, 2, 0, j, 1, 0, 0.5F);
	//   13   19:aload_0         
	//   14   20:iload_1         
	//   15   21:iload_2         
	//   16   22:iconst_2        
	//   17   23:iconst_0        
	//   18   24:iload_2         
	//   19   25:iconst_1        
	//   20   26:iconst_0        
	//   21   27:ldc2            #900 <Float 0.5F>
	//   22   30:invokevirtual   #902 <Method void center(int, int, int, int, int, int, int, float)>
			return;
	//   23   33:return          
		}
	}

	public void centerHorizontally(int i, int j, int k, int l, int i1, int j1, int k1, 
			float f)
	{
		connect(i, 1, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:iload_2         
	//    4    4:iload_3         
	//    5    5:iload           4
	//    6    7:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
		connect(i, 2, i1, j1, k1);
	//    7   10:aload_0         
	//    8   11:iload_1         
	//    9   12:iconst_2        
	//   10   13:iload           5
	//   11   15:iload           6
	//   12   17:iload           7
	//   13   19:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
		((Constraint)mConstraints.get(((Object) (Integer.valueOf(i))))).horizontalBias = f;
	//   14   22:aload_0         
	//   15   23:getfield        #406 <Field HashMap mConstraints>
	//   16   26:iload_1         
	//   17   27:invokestatic    #458 <Method Integer Integer.valueOf(int)>
	//   18   30:invokevirtual   #469 <Method Object HashMap.get(Object)>
	//   19   33:checkcast       #8   <Class ConstraintSet$Constraint>
	//   20   36:fload           8
	//   21   38:putfield        #643 <Field float ConstraintSet$Constraint.horizontalBias>
	//   22   41:return          
	}

	public void centerHorizontallyRtl(int i, int j)
	{
		if(j == 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            21
		{
			center(i, 0, 6, 0, 0, 7, 0, 0.5F);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iconst_0        
	//    5    7:bipush          6
	//    6    9:iconst_0        
	//    7   10:iconst_0        
	//    8   11:bipush          7
	//    9   13:iconst_0        
	//   10   14:ldc2            #900 <Float 0.5F>
	//   11   17:invokevirtual   #902 <Method void center(int, int, int, int, int, int, int, float)>
			return;
	//   12   20:return          
		} else
		{
			center(i, j, 7, 0, j, 6, 0, 0.5F);
	//   13   21:aload_0         
	//   14   22:iload_1         
	//   15   23:iload_2         
	//   16   24:bipush          7
	//   17   26:iconst_0        
	//   18   27:iload_2         
	//   19   28:bipush          6
	//   20   30:iconst_0        
	//   21   31:ldc2            #900 <Float 0.5F>
	//   22   34:invokevirtual   #902 <Method void center(int, int, int, int, int, int, int, float)>
			return;
	//   23   37:return          
		}
	}

	public void centerHorizontallyRtl(int i, int j, int k, int l, int i1, int j1, int k1, 
			float f)
	{
		connect(i, 6, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:bipush          6
	//    3    4:iload_2         
	//    4    5:iload_3         
	//    5    6:iload           4
	//    6    8:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
		connect(i, 7, i1, j1, k1);
	//    7   11:aload_0         
	//    8   12:iload_1         
	//    9   13:bipush          7
	//   10   15:iload           5
	//   11   17:iload           6
	//   12   19:iload           7
	//   13   21:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
		((Constraint)mConstraints.get(((Object) (Integer.valueOf(i))))).horizontalBias = f;
	//   14   24:aload_0         
	//   15   25:getfield        #406 <Field HashMap mConstraints>
	//   16   28:iload_1         
	//   17   29:invokestatic    #458 <Method Integer Integer.valueOf(int)>
	//   18   32:invokevirtual   #469 <Method Object HashMap.get(Object)>
	//   19   35:checkcast       #8   <Class ConstraintSet$Constraint>
	//   20   38:fload           8
	//   21   40:putfield        #643 <Field float ConstraintSet$Constraint.horizontalBias>
	//   22   43:return          
	}

	public void centerVertically(int i, int j)
	{
		if(j == 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            19
		{
			center(i, 0, 3, 0, 0, 4, 0, 0.5F);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iconst_0        
	//    5    7:iconst_3        
	//    6    8:iconst_0        
	//    7    9:iconst_0        
	//    8   10:iconst_4        
	//    9   11:iconst_0        
	//   10   12:ldc2            #900 <Float 0.5F>
	//   11   15:invokevirtual   #902 <Method void center(int, int, int, int, int, int, int, float)>
			return;
	//   12   18:return          
		} else
		{
			center(i, j, 4, 0, j, 3, 0, 0.5F);
	//   13   19:aload_0         
	//   14   20:iload_1         
	//   15   21:iload_2         
	//   16   22:iconst_4        
	//   17   23:iconst_0        
	//   18   24:iload_2         
	//   19   25:iconst_3        
	//   20   26:iconst_0        
	//   21   27:ldc2            #900 <Float 0.5F>
	//   22   30:invokevirtual   #902 <Method void center(int, int, int, int, int, int, int, float)>
			return;
	//   23   33:return          
		}
	}

	public void centerVertically(int i, int j, int k, int l, int i1, int j1, int k1, 
			float f)
	{
		connect(i, 3, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_3        
	//    3    3:iload_2         
	//    4    4:iload_3         
	//    5    5:iload           4
	//    6    7:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
		connect(i, 4, i1, j1, k1);
	//    7   10:aload_0         
	//    8   11:iload_1         
	//    9   12:iconst_4        
	//   10   13:iload           5
	//   11   15:iload           6
	//   12   17:iload           7
	//   13   19:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
		((Constraint)mConstraints.get(((Object) (Integer.valueOf(i))))).verticalBias = f;
	//   14   22:aload_0         
	//   15   23:getfield        #406 <Field HashMap mConstraints>
	//   16   26:iload_1         
	//   17   27:invokestatic    #458 <Method Integer Integer.valueOf(int)>
	//   18   30:invokevirtual   #469 <Method Object HashMap.get(Object)>
	//   19   33:checkcast       #8   <Class ConstraintSet$Constraint>
	//   20   36:fload           8
	//   21   38:putfield        #589 <Field float ConstraintSet$Constraint.verticalBias>
	//   22   41:return          
	}

	public void clear(int i)
	{
		mConstraints.remove(((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #406 <Field HashMap mConstraints>
	//    2    4:iload_1         
	//    3    5:invokestatic    #458 <Method Integer Integer.valueOf(int)>
	//    4    8:invokevirtual   #907 <Method Object HashMap.remove(Object)>
	//    5   11:pop             
	//    6   12:return          
	}

	public void clear(int i, int j)
	{
		if(mConstraints.containsKey(((Object) (Integer.valueOf(i)))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #406 <Field HashMap mConstraints>
	//*   2    4:iload_1         
	//*   3    5:invokestatic    #458 <Method Integer Integer.valueOf(int)>
	//*   4    8:invokevirtual   #462 <Method boolean HashMap.containsKey(Object)>
	//*   5   11:ifeq            214
		{
			Constraint constraint = (Constraint)mConstraints.get(((Object) (Integer.valueOf(i))));
	//    6   14:aload_0         
	//    7   15:getfield        #406 <Field HashMap mConstraints>
	//    8   18:iload_1         
	//    9   19:invokestatic    #458 <Method Integer Integer.valueOf(int)>
	//   10   22:invokevirtual   #469 <Method Object HashMap.get(Object)>
	//   11   25:checkcast       #8   <Class ConstraintSet$Constraint>
	//   12   28:astore_3        
			switch(j)
	//*  13   29:iload_2         
			{
	//*  14   30:tableswitch     1 7: default 72
	//	               1 194
	//	               2 173
	//	               3 152
	//	               4 131
	//	               5 125
	//	               6 104
	//	               7 83
			default:
				throw new IllegalArgumentException("unknown constraint");
	//   15   72:new             #410 <Class IllegalArgumentException>
	//   16   75:dup             
	//   17   76:ldc2            #909 <String "unknown constraint">
	//   18   79:invokespecial   #415 <Method void IllegalArgumentException(String)>
	//   19   82:athrow          

			case 7: // '\007'
				constraint.endToStart = -1;
	//   20   83:aload_3         
	//   21   84:iconst_m1       
	//   22   85:putfield        #676 <Field int ConstraintSet$Constraint.endToStart>
				constraint.endToEnd = -1;
	//   23   88:aload_3         
	//   24   89:iconst_m1       
	//   25   90:putfield        #679 <Field int ConstraintSet$Constraint.endToEnd>
				constraint.endMargin = -1;
	//   26   93:aload_3         
	//   27   94:iconst_m1       
	//   28   95:putfield        #682 <Field int ConstraintSet$Constraint.endMargin>
				constraint.goneEndMargin = -1;
	//   29   98:aload_3         
	//   30   99:iconst_m1       
	//   31  100:putfield        #670 <Field int ConstraintSet$Constraint.goneEndMargin>
				return;
	//   32  103:return          

			case 6: // '\006'
				constraint.startToEnd = -1;
	//   33  104:aload_3         
	//   34  105:iconst_m1       
	//   35  106:putfield        #604 <Field int ConstraintSet$Constraint.startToEnd>
				constraint.startToStart = -1;
	//   36  109:aload_3         
	//   37  110:iconst_m1       
	//   38  111:putfield        #601 <Field int ConstraintSet$Constraint.startToStart>
				constraint.startMargin = -1;
	//   39  114:aload_3         
	//   40  115:iconst_m1       
	//   41  116:putfield        #607 <Field int ConstraintSet$Constraint.startMargin>
				constraint.goneStartMargin = -1;
	//   42  119:aload_3         
	//   43  120:iconst_m1       
	//   44  121:putfield        #661 <Field int ConstraintSet$Constraint.goneStartMargin>
				return;
	//   45  124:return          

			case 5: // '\005'
				constraint.baselineToBaseline = -1;
	//   46  125:aload_3         
	//   47  126:iconst_m1       
	//   48  127:putfield        #706 <Field int ConstraintSet$Constraint.baselineToBaseline>
				return;
	//   49  130:return          

			case 4: // '\004'
				constraint.bottomToTop = -1;
	//   50  131:aload_3         
	//   51  132:iconst_m1       
	//   52  133:putfield        #697 <Field int ConstraintSet$Constraint.bottomToTop>
				constraint.bottomToBottom = -1;
	//   53  136:aload_3         
	//   54  137:iconst_m1       
	//   55  138:putfield        #700 <Field int ConstraintSet$Constraint.bottomToBottom>
				constraint.bottomMargin = -1;
	//   56  141:aload_3         
	//   57  142:iconst_m1       
	//   58  143:putfield        #703 <Field int ConstraintSet$Constraint.bottomMargin>
				constraint.goneBottomMargin = -1;
	//   59  146:aload_3         
	//   60  147:iconst_m1       
	//   61  148:putfield        #673 <Field int ConstraintSet$Constraint.goneBottomMargin>
				return;
	//   62  151:return          

			case 3: // '\003'
				constraint.topToBottom = -1;
	//   63  152:aload_3         
	//   64  153:iconst_m1       
	//   65  154:putfield        #595 <Field int ConstraintSet$Constraint.topToBottom>
				constraint.topToTop = -1;
	//   66  157:aload_3         
	//   67  158:iconst_m1       
	//   68  159:putfield        #592 <Field int ConstraintSet$Constraint.topToTop>
				constraint.topMargin = -1;
	//   69  162:aload_3         
	//   70  163:iconst_m1       
	//   71  164:putfield        #598 <Field int ConstraintSet$Constraint.topMargin>
				constraint.goneTopMargin = -1;
	//   72  167:aload_3         
	//   73  168:iconst_m1       
	//   74  169:putfield        #658 <Field int ConstraintSet$Constraint.goneTopMargin>
				return;
	//   75  172:return          

			case 2: // '\002'
				constraint.rightToRight = -1;
	//   76  173:aload_3         
	//   77  174:iconst_m1       
	//   78  175:putfield        #610 <Field int ConstraintSet$Constraint.rightToRight>
				constraint.rightToLeft = -1;
	//   79  178:aload_3         
	//   80  179:iconst_m1       
	//   81  180:putfield        #613 <Field int ConstraintSet$Constraint.rightToLeft>
				constraint.rightMargin = -1;
	//   82  183:aload_3         
	//   83  184:iconst_m1       
	//   84  185:putfield        #616 <Field int ConstraintSet$Constraint.rightMargin>
				constraint.goneRightMargin = -1;
	//   85  188:aload_3         
	//   86  189:iconst_m1       
	//   87  190:putfield        #664 <Field int ConstraintSet$Constraint.goneRightMargin>
				return;
	//   88  193:return          

			case 1: // '\001'
				constraint.leftToRight = -1;
	//   89  194:aload_3         
	//   90  195:iconst_m1       
	//   91  196:putfield        #622 <Field int ConstraintSet$Constraint.leftToRight>
				constraint.leftToLeft = -1;
	//   92  199:aload_3         
	//   93  200:iconst_m1       
	//   94  201:putfield        #625 <Field int ConstraintSet$Constraint.leftToLeft>
				constraint.leftMargin = -1;
	//   95  204:aload_3         
	//   96  205:iconst_m1       
	//   97  206:putfield        #628 <Field int ConstraintSet$Constraint.leftMargin>
				constraint.goneLeftMargin = -1;
	//   98  209:aload_3         
	//   99  210:iconst_m1       
	//  100  211:putfield        #667 <Field int ConstraintSet$Constraint.goneLeftMargin>
				break;
			}
		}
	//  101  214:return          
	}

	public void clone(Context context, int i)
	{
		clone((ConstraintLayout)LayoutInflater.from(context).inflate(i, ((android.view.ViewGroup) (null))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #917 <Method LayoutInflater LayoutInflater.from(Context)>
	//    3    5:iload_2         
	//    4    6:aconst_null     
	//    5    7:invokevirtual   #921 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//    6   10:checkcast       #734 <Class ConstraintLayout>
	//    7   13:invokevirtual   #923 <Method void clone(ConstraintLayout)>
	//    8   16:return          
	}

	public void clone(ConstraintLayout constraintlayout)
	{
		int j = constraintlayout.getChildCount();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #741 <Method int ConstraintLayout.getChildCount()>
	//    2    4:istore          5
		mConstraints.clear();
	//    3    6:aload_0         
	//    4    7:getfield        #406 <Field HashMap mConstraints>
	//    5   10:invokevirtual   #925 <Method void HashMap.clear()>
		for(int i = 0; i < j;)
	//*   6   13:iconst_0        
	//*   7   14:istore          4
	//*   8   16:iload           4
	//*   9   18:iload           5
	//*  10   20:icmpge          308
		{
			View view = constraintlayout.getChildAt(i);
	//   11   23:aload_1         
	//   12   24:iload           4
	//   13   26:invokevirtual   #754 <Method View ConstraintLayout.getChildAt(int)>
	//   14   29:astore          7
			ConstraintLayout.LayoutParams layoutparams = (ConstraintLayout.LayoutParams)view.getLayoutParams();
	//   15   31:aload           7
	//   16   33:invokevirtual   #795 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   17   36:checkcast       #797 <Class ConstraintLayout$LayoutParams>
	//   18   39:astore          8
			int k = view.getId();
	//   19   41:aload           7
	//   20   43:invokevirtual   #759 <Method int View.getId()>
	//   21   46:istore          6
			if(k != -1)
	//*  22   48:iload           6
	//*  23   50:iconst_m1       
	//*  24   51:icmpeq          297
			{
				if(!mConstraints.containsKey(((Object) (Integer.valueOf(k)))))
	//*  25   54:aload_0         
	//*  26   55:getfield        #406 <Field HashMap mConstraints>
	//*  27   58:iload           6
	//*  28   60:invokestatic    #458 <Method Integer Integer.valueOf(int)>
	//*  29   63:invokevirtual   #462 <Method boolean HashMap.containsKey(Object)>
	//*  30   66:ifne            90
					mConstraints.put(((Object) (Integer.valueOf(k))), ((Object) (new Constraint())));
	//   31   69:aload_0         
	//   32   70:getfield        #406 <Field HashMap mConstraints>
	//   33   73:iload           6
	//   34   75:invokestatic    #458 <Method Integer Integer.valueOf(int)>
	//   35   78:new             #8   <Class ConstraintSet$Constraint>
	//   36   81:dup             
	//   37   82:aconst_null     
	//   38   83:invokespecial   #435 <Method void ConstraintSet$Constraint(ConstraintSet$1)>
	//   39   86:invokevirtual   #466 <Method Object HashMap.put(Object, Object)>
	//   40   89:pop             
				Constraint constraint = (Constraint)mConstraints.get(((Object) (Integer.valueOf(k))));
	//   41   90:aload_0         
	//   42   91:getfield        #406 <Field HashMap mConstraints>
	//   43   94:iload           6
	//   44   96:invokestatic    #458 <Method Integer Integer.valueOf(int)>
	//   45   99:invokevirtual   #469 <Method Object HashMap.get(Object)>
	//   46  102:checkcast       #8   <Class ConstraintSet$Constraint>
	//   47  105:astore          9
				constraint.fillFrom(k, layoutparams);
	//   48  107:aload           9
	//   49  109:iload           6
	//   50  111:aload           8
	//   51  113:invokestatic    #929 <Method void ConstraintSet$Constraint.access$100(ConstraintSet$Constraint, int, ConstraintLayout$LayoutParams)>
				constraint.visibility = view.getVisibility();
	//   52  116:aload           9
	//   53  118:aload           7
	//   54  120:invokevirtual   #932 <Method int View.getVisibility()>
	//   55  123:putfield        #637 <Field int ConstraintSet$Constraint.visibility>
				if(android.os.Build.VERSION.SDK_INT >= 17)
	//*  56  126:getstatic       #809 <Field int android.os.Build$VERSION.SDK_INT>
	//*  57  129:bipush          17
	//*  58  131:icmplt          288
				{
					constraint.alpha = view.getAlpha();
	//   59  134:aload           9
	//   60  136:aload           7
	//   61  138:invokevirtual   #936 <Method float View.getAlpha()>
	//   62  141:putfield        #577 <Field float ConstraintSet$Constraint.alpha>
					constraint.rotation = view.getRotation();
	//   63  144:aload           9
	//   64  146:aload           7
	//   65  148:invokevirtual   #939 <Method float View.getRotation()>
	//   66  151:putfield        #538 <Field float ConstraintSet$Constraint.rotation>
					constraint.rotationX = view.getRotationX();
	//   67  154:aload           9
	//   68  156:aload           7
	//   69  158:invokevirtual   #942 <Method float View.getRotationX()>
	//   70  161:putfield        #568 <Field float ConstraintSet$Constraint.rotationX>
					constraint.rotationY = view.getRotationY();
	//   71  164:aload           9
	//   72  166:aload           7
	//   73  168:invokevirtual   #945 <Method float View.getRotationY()>
	//   74  171:putfield        #565 <Field float ConstraintSet$Constraint.rotationY>
					constraint.scaleX = view.getScaleX();
	//   75  174:aload           9
	//   76  176:aload           7
	//   77  178:invokevirtual   #948 <Method float View.getScaleX()>
	//   78  181:putfield        #562 <Field float ConstraintSet$Constraint.scaleX>
					constraint.scaleY = view.getScaleY();
	//   79  184:aload           9
	//   80  186:aload           7
	//   81  188:invokevirtual   #951 <Method float View.getScaleY()>
	//   82  191:putfield        #559 <Field float ConstraintSet$Constraint.scaleY>
					float f = view.getPivotX();
	//   83  194:aload           7
	//   84  196:invokevirtual   #954 <Method float View.getPivotX()>
	//   85  199:fstore_2        
					float f1 = view.getPivotY();
	//   86  200:aload           7
	//   87  202:invokevirtual   #957 <Method float View.getPivotY()>
	//   88  205:fstore_3        
					if((double)f != 0.0D || (double)f1 != 0.0D)
	//*  89  206:fload_2         
	//*  90  207:f2d             
	//*  91  208:dconst_0        
	//*  92  209:dcmpl           
	//*  93  210:ifne            220
	//*  94  213:fload_3         
	//*  95  214:f2d             
	//*  96  215:dconst_0        
	//*  97  216:dcmpl           
	//*  98  217:ifeq            232
					{
						constraint.transformPivotX = f;
	//   99  220:aload           9
	//  100  222:fload_2         
	//  101  223:putfield        #556 <Field float ConstraintSet$Constraint.transformPivotX>
						constraint.transformPivotY = f1;
	//  102  226:aload           9
	//  103  228:fload_3         
	//  104  229:putfield        #553 <Field float ConstraintSet$Constraint.transformPivotY>
					}
					constraint.translationX = view.getTranslationX();
	//  105  232:aload           9
	//  106  234:aload           7
	//  107  236:invokevirtual   #960 <Method float View.getTranslationX()>
	//  108  239:putfield        #550 <Field float ConstraintSet$Constraint.translationX>
					constraint.translationY = view.getTranslationY();
	//  109  242:aload           9
	//  110  244:aload           7
	//  111  246:invokevirtual   #963 <Method float View.getTranslationY()>
	//  112  249:putfield        #547 <Field float ConstraintSet$Constraint.translationY>
					if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 113  252:getstatic       #809 <Field int android.os.Build$VERSION.SDK_INT>
	//* 114  255:bipush          21
	//* 115  257:icmplt          288
					{
						constraint.translationZ = view.getTranslationZ();
	//  116  260:aload           9
	//  117  262:aload           7
	//  118  264:invokevirtual   #966 <Method float View.getTranslationZ()>
	//  119  267:putfield        #541 <Field float ConstraintSet$Constraint.translationZ>
						if(constraint.applyElevation)
	//* 120  270:aload           9
	//* 121  272:getfield        #571 <Field boolean ConstraintSet$Constraint.applyElevation>
	//* 122  275:ifeq            288
							constraint.elevation = view.getElevation();
	//  123  278:aload           9
	//  124  280:aload           7
	//  125  282:invokevirtual   #969 <Method float View.getElevation()>
	//  126  285:putfield        #574 <Field float ConstraintSet$Constraint.elevation>
					}
				}
				i++;
	//  127  288:iload           4
	//  128  290:iconst_1        
	//  129  291:iadd            
	//  130  292:istore          4
			} else
	//* 131  294:goto            16
			{
				throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
	//  132  297:new             #854 <Class RuntimeException>
	//  133  300:dup             
	//  134  301:ldc2            #856 <String "All children of ConstraintLayout must have ids to use ConstraintSet">
	//  135  304:invokespecial   #857 <Method void RuntimeException(String)>
	//  136  307:athrow          
			}
		}

	//  137  308:return          
	}

	public void clone(ConstraintSet constraintset)
	{
		mConstraints.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #406 <Field HashMap mConstraints>
	//    2    4:invokevirtual   #925 <Method void HashMap.clear()>
		Integer integer;
		for(Iterator iterator = constraintset.mConstraints.keySet().iterator(); iterator.hasNext(); mConstraints.put(((Object) (integer)), ((Object) (((Constraint)constraintset.mConstraints.get(((Object) (integer)))).clone()))))
	//*   3    7:aload_1         
	//*   4    8:getfield        #406 <Field HashMap mConstraints>
	//*   5   11:invokevirtual   #747 <Method Set HashMap.keySet()>
	//*   6   14:invokeinterface #972 <Method Iterator Set.iterator()>
	//*   7   19:astore_2        
	//*   8   20:aload_2         
	//*   9   21:invokeinterface #867 <Method boolean Iterator.hasNext()>
	//*  10   26:ifeq            65
			integer = (Integer)iterator.next();
	//   11   29:aload_2         
	//   12   30:invokeinterface #871 <Method Object Iterator.next()>
	//   13   35:checkcast       #454 <Class Integer>
	//   14   38:astore_3        

	//   15   39:aload_0         
	//   16   40:getfield        #406 <Field HashMap mConstraints>
	//   17   43:aload_3         
	//   18   44:aload_1         
	//   19   45:getfield        #406 <Field HashMap mConstraints>
	//   20   48:aload_3         
	//   21   49:invokevirtual   #469 <Method Object HashMap.get(Object)>
	//   22   52:checkcast       #8   <Class ConstraintSet$Constraint>
	//   23   55:invokevirtual   #975 <Method ConstraintSet$Constraint ConstraintSet$Constraint.clone()>
	//   24   58:invokevirtual   #466 <Method Object HashMap.put(Object, Object)>
	//   25   61:pop             
	//*  26   62:goto            20
	//   27   65:return          
	}

	public void clone(Constraints constraints)
	{
		int j = constraints.getChildCount();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #979 <Method int Constraints.getChildCount()>
	//    2    4:istore_3        
		mConstraints.clear();
	//    3    5:aload_0         
	//    4    6:getfield        #406 <Field HashMap mConstraints>
	//    5    9:invokevirtual   #925 <Method void HashMap.clear()>
		for(int i = 0; i < j;)
	//*   6   12:iconst_0        
	//*   7   13:istore_2        
	//*   8   14:iload_2         
	//*   9   15:iload_3         
	//*  10   16:icmpge          151
		{
			View view = constraints.getChildAt(i);
	//   11   19:aload_1         
	//   12   20:iload_2         
	//   13   21:invokevirtual   #980 <Method View Constraints.getChildAt(int)>
	//   14   24:astore          5
			Constraints.LayoutParams layoutparams = (Constraints.LayoutParams)view.getLayoutParams();
	//   15   26:aload           5
	//   16   28:invokevirtual   #795 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   17   31:checkcast       #982 <Class Constraints$LayoutParams>
	//   18   34:astore          6
			int k = view.getId();
	//   19   36:aload           5
	//   20   38:invokevirtual   #759 <Method int View.getId()>
	//   21   41:istore          4
			if(k != -1)
	//*  22   43:iload           4
	//*  23   45:iconst_m1       
	//*  24   46:icmpeq          140
			{
				if(!mConstraints.containsKey(((Object) (Integer.valueOf(k)))))
	//*  25   49:aload_0         
	//*  26   50:getfield        #406 <Field HashMap mConstraints>
	//*  27   53:iload           4
	//*  28   55:invokestatic    #458 <Method Integer Integer.valueOf(int)>
	//*  29   58:invokevirtual   #462 <Method boolean HashMap.containsKey(Object)>
	//*  30   61:ifne            85
					mConstraints.put(((Object) (Integer.valueOf(k))), ((Object) (new Constraint())));
	//   31   64:aload_0         
	//   32   65:getfield        #406 <Field HashMap mConstraints>
	//   33   68:iload           4
	//   34   70:invokestatic    #458 <Method Integer Integer.valueOf(int)>
	//   35   73:new             #8   <Class ConstraintSet$Constraint>
	//   36   76:dup             
	//   37   77:aconst_null     
	//   38   78:invokespecial   #435 <Method void ConstraintSet$Constraint(ConstraintSet$1)>
	//   39   81:invokevirtual   #466 <Method Object HashMap.put(Object, Object)>
	//   40   84:pop             
				Constraint constraint = (Constraint)mConstraints.get(((Object) (Integer.valueOf(k))));
	//   41   85:aload_0         
	//   42   86:getfield        #406 <Field HashMap mConstraints>
	//   43   89:iload           4
	//   44   91:invokestatic    #458 <Method Integer Integer.valueOf(int)>
	//   45   94:invokevirtual   #469 <Method Object HashMap.get(Object)>
	//   46   97:checkcast       #8   <Class ConstraintSet$Constraint>
	//   47  100:astore          7
				if(view instanceof ConstraintHelper)
	//*  48  102:aload           5
	//*  49  104:instanceof      #984 <Class ConstraintHelper>
	//*  50  107:ifeq            124
					constraint.fillFromConstraints((ConstraintHelper)view, k, layoutparams);
	//   51  110:aload           7
	//   52  112:aload           5
	//   53  114:checkcast       #984 <Class ConstraintHelper>
	//   54  117:iload           4
	//   55  119:aload           6
	//   56  121:invokestatic    #988 <Method void ConstraintSet$Constraint.access$200(ConstraintSet$Constraint, ConstraintHelper, int, Constraints$LayoutParams)>
				constraint.fillFromConstraints(k, layoutparams);
	//   57  124:aload           7
	//   58  126:iload           4
	//   59  128:aload           6
	//   60  130:invokestatic    #992 <Method void ConstraintSet$Constraint.access$300(ConstraintSet$Constraint, int, Constraints$LayoutParams)>
				i++;
	//   61  133:iload_2         
	//   62  134:iconst_1        
	//   63  135:iadd            
	//   64  136:istore_2        
			} else
	//*  65  137:goto            14
			{
				throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
	//   66  140:new             #854 <Class RuntimeException>
	//   67  143:dup             
	//   68  144:ldc2            #856 <String "All children of ConstraintLayout must have ids to use ConstraintSet">
	//   69  147:invokespecial   #857 <Method void RuntimeException(String)>
	//   70  150:athrow          
			}
		}

	//   71  151:return          
	}

	public void connect(int i, int j, int k, int l)
	{
		if(!mConstraints.containsKey(((Object) (Integer.valueOf(i)))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #406 <Field HashMap mConstraints>
	//*   2    4:iload_1         
	//*   3    5:invokestatic    #458 <Method Integer Integer.valueOf(int)>
	//*   4    8:invokevirtual   #462 <Method boolean HashMap.containsKey(Object)>
	//*   5   11:ifne            34
			mConstraints.put(((Object) (Integer.valueOf(i))), ((Object) (new Constraint())));
	//    6   14:aload_0         
	//    7   15:getfield        #406 <Field HashMap mConstraints>
	//    8   18:iload_1         
	//    9   19:invokestatic    #458 <Method Integer Integer.valueOf(int)>
	//   10   22:new             #8   <Class ConstraintSet$Constraint>
	//   11   25:dup             
	//   12   26:aconst_null     
	//   13   27:invokespecial   #435 <Method void ConstraintSet$Constraint(ConstraintSet$1)>
	//   14   30:invokevirtual   #466 <Method Object HashMap.put(Object, Object)>
	//   15   33:pop             
		Object obj = ((Object) ((Constraint)mConstraints.get(((Object) (Integer.valueOf(i))))));
	//   16   34:aload_0         
	//   17   35:getfield        #406 <Field HashMap mConstraints>
	//   18   38:iload_1         
	//   19   39:invokestatic    #458 <Method Integer Integer.valueOf(int)>
	//   20   42:invokevirtual   #469 <Method Object HashMap.get(Object)>
	//   21   45:checkcast       #8   <Class ConstraintSet$Constraint>
	//   22   48:astore          5
		switch(j)
	//*  23   50:iload_2         
		{
	//*  24   51:tableswitch     1 7: default 92
	//	               1 722
	//	               2 632
	//	               3 530
	//	               4 428
	//	               5 339
	//	               6 247
	//	               7 155
		default:
			obj = ((Object) (new StringBuilder()));
	//   25   92:new             #490 <Class StringBuilder>
	//   26   95:dup             
	//   27   96:invokespecial   #491 <Method void StringBuilder()>
	//   28   99:astore          5
			((StringBuilder) (obj)).append(sideToString(j));
	//   29  101:aload           5
	//   30  103:aload_0         
	//   31  104:iload_2         
	//   32  105:invokespecial   #995 <Method String sideToString(int)>
	//   33  108:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   34  111:pop             
			((StringBuilder) (obj)).append(" to ");
	//   35  112:aload           5
	//   36  114:ldc2            #997 <String " to ">
	//   37  117:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   38  120:pop             
			((StringBuilder) (obj)).append(sideToString(l));
	//   39  121:aload           5
	//   40  123:aload_0         
	//   41  124:iload           4
	//   42  126:invokespecial   #995 <Method String sideToString(int)>
	//   43  129:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   44  132:pop             
			((StringBuilder) (obj)).append(" unknown");
	//   45  133:aload           5
	//   46  135:ldc2            #999 <String " unknown">
	//   47  138:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   48  141:pop             
			throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   49  142:new             #410 <Class IllegalArgumentException>
	//   50  145:dup             
	//   51  146:aload           5
	//   52  148:invokevirtual   #509 <Method String StringBuilder.toString()>
	//   53  151:invokespecial   #415 <Method void IllegalArgumentException(String)>
	//   54  154:athrow          

		case 7: // '\007'
			if(l == 7)
	//*  55  155:iload           4
	//*  56  157:bipush          7
	//*  57  159:icmpne          175
			{
				obj.endToEnd = k;
	//   58  162:aload           5
	//   59  164:iload_3         
	//   60  165:putfield        #679 <Field int ConstraintSet$Constraint.endToEnd>
				obj.endToStart = -1;
	//   61  168:aload           5
	//   62  170:iconst_m1       
	//   63  171:putfield        #676 <Field int ConstraintSet$Constraint.endToStart>
				return;
	//   64  174:return          
			}
			if(l == 6)
	//*  65  175:iload           4
	//*  66  177:bipush          6
	//*  67  179:icmpne          195
			{
				obj.endToStart = k;
	//   68  182:aload           5
	//   69  184:iload_3         
	//   70  185:putfield        #676 <Field int ConstraintSet$Constraint.endToStart>
				obj.endToEnd = -1;
	//   71  188:aload           5
	//   72  190:iconst_m1       
	//   73  191:putfield        #679 <Field int ConstraintSet$Constraint.endToEnd>
				return;
	//   74  194:return          
			} else
			{
				obj = ((Object) (new StringBuilder()));
	//   75  195:new             #490 <Class StringBuilder>
	//   76  198:dup             
	//   77  199:invokespecial   #491 <Method void StringBuilder()>
	//   78  202:astore          5
				((StringBuilder) (obj)).append("right to ");
	//   79  204:aload           5
	//   80  206:ldc2            #1001 <String "right to ">
	//   81  209:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   82  212:pop             
				((StringBuilder) (obj)).append(sideToString(l));
	//   83  213:aload           5
	//   84  215:aload_0         
	//   85  216:iload           4
	//   86  218:invokespecial   #995 <Method String sideToString(int)>
	//   87  221:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   88  224:pop             
				((StringBuilder) (obj)).append(" undefined");
	//   89  225:aload           5
	//   90  227:ldc2            #1003 <String " undefined">
	//   91  230:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   92  233:pop             
				throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   93  234:new             #410 <Class IllegalArgumentException>
	//   94  237:dup             
	//   95  238:aload           5
	//   96  240:invokevirtual   #509 <Method String StringBuilder.toString()>
	//   97  243:invokespecial   #415 <Method void IllegalArgumentException(String)>
	//   98  246:athrow          
			}

		case 6: // '\006'
			if(l == 6)
	//*  99  247:iload           4
	//* 100  249:bipush          6
	//* 101  251:icmpne          267
			{
				obj.startToStart = k;
	//  102  254:aload           5
	//  103  256:iload_3         
	//  104  257:putfield        #601 <Field int ConstraintSet$Constraint.startToStart>
				obj.startToEnd = -1;
	//  105  260:aload           5
	//  106  262:iconst_m1       
	//  107  263:putfield        #604 <Field int ConstraintSet$Constraint.startToEnd>
				return;
	//  108  266:return          
			}
			if(l == 7)
	//* 109  267:iload           4
	//* 110  269:bipush          7
	//* 111  271:icmpne          287
			{
				obj.startToEnd = k;
	//  112  274:aload           5
	//  113  276:iload_3         
	//  114  277:putfield        #604 <Field int ConstraintSet$Constraint.startToEnd>
				obj.startToStart = -1;
	//  115  280:aload           5
	//  116  282:iconst_m1       
	//  117  283:putfield        #601 <Field int ConstraintSet$Constraint.startToStart>
				return;
	//  118  286:return          
			} else
			{
				obj = ((Object) (new StringBuilder()));
	//  119  287:new             #490 <Class StringBuilder>
	//  120  290:dup             
	//  121  291:invokespecial   #491 <Method void StringBuilder()>
	//  122  294:astore          5
				((StringBuilder) (obj)).append("right to ");
	//  123  296:aload           5
	//  124  298:ldc2            #1001 <String "right to ">
	//  125  301:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  126  304:pop             
				((StringBuilder) (obj)).append(sideToString(l));
	//  127  305:aload           5
	//  128  307:aload_0         
	//  129  308:iload           4
	//  130  310:invokespecial   #995 <Method String sideToString(int)>
	//  131  313:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  132  316:pop             
				((StringBuilder) (obj)).append(" undefined");
	//  133  317:aload           5
	//  134  319:ldc2            #1003 <String " undefined">
	//  135  322:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  136  325:pop             
				throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//  137  326:new             #410 <Class IllegalArgumentException>
	//  138  329:dup             
	//  139  330:aload           5
	//  140  332:invokevirtual   #509 <Method String StringBuilder.toString()>
	//  141  335:invokespecial   #415 <Method void IllegalArgumentException(String)>
	//  142  338:athrow          
			}

		case 5: // '\005'
			if(l == 5)
	//* 143  339:iload           4
	//* 144  341:iconst_5        
	//* 145  342:icmpne          376
			{
				obj.baselineToBaseline = k;
	//  146  345:aload           5
	//  147  347:iload_3         
	//  148  348:putfield        #706 <Field int ConstraintSet$Constraint.baselineToBaseline>
				obj.bottomToBottom = -1;
	//  149  351:aload           5
	//  150  353:iconst_m1       
	//  151  354:putfield        #700 <Field int ConstraintSet$Constraint.bottomToBottom>
				obj.bottomToTop = -1;
	//  152  357:aload           5
	//  153  359:iconst_m1       
	//  154  360:putfield        #697 <Field int ConstraintSet$Constraint.bottomToTop>
				obj.topToTop = -1;
	//  155  363:aload           5
	//  156  365:iconst_m1       
	//  157  366:putfield        #592 <Field int ConstraintSet$Constraint.topToTop>
				obj.topToBottom = -1;
	//  158  369:aload           5
	//  159  371:iconst_m1       
	//  160  372:putfield        #595 <Field int ConstraintSet$Constraint.topToBottom>
				return;
	//  161  375:return          
			} else
			{
				obj = ((Object) (new StringBuilder()));
	//  162  376:new             #490 <Class StringBuilder>
	//  163  379:dup             
	//  164  380:invokespecial   #491 <Method void StringBuilder()>
	//  165  383:astore          5
				((StringBuilder) (obj)).append("right to ");
	//  166  385:aload           5
	//  167  387:ldc2            #1001 <String "right to ">
	//  168  390:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  169  393:pop             
				((StringBuilder) (obj)).append(sideToString(l));
	//  170  394:aload           5
	//  171  396:aload_0         
	//  172  397:iload           4
	//  173  399:invokespecial   #995 <Method String sideToString(int)>
	//  174  402:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  175  405:pop             
				((StringBuilder) (obj)).append(" undefined");
	//  176  406:aload           5
	//  177  408:ldc2            #1003 <String " undefined">
	//  178  411:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  179  414:pop             
				throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//  180  415:new             #410 <Class IllegalArgumentException>
	//  181  418:dup             
	//  182  419:aload           5
	//  183  421:invokevirtual   #509 <Method String StringBuilder.toString()>
	//  184  424:invokespecial   #415 <Method void IllegalArgumentException(String)>
	//  185  427:athrow          
			}

		case 4: // '\004'
			if(l == 4)
	//* 186  428:iload           4
	//* 187  430:iconst_4        
	//* 188  431:icmpne          453
			{
				obj.bottomToBottom = k;
	//  189  434:aload           5
	//  190  436:iload_3         
	//  191  437:putfield        #700 <Field int ConstraintSet$Constraint.bottomToBottom>
				obj.bottomToTop = -1;
	//  192  440:aload           5
	//  193  442:iconst_m1       
	//  194  443:putfield        #697 <Field int ConstraintSet$Constraint.bottomToTop>
				obj.baselineToBaseline = -1;
	//  195  446:aload           5
	//  196  448:iconst_m1       
	//  197  449:putfield        #706 <Field int ConstraintSet$Constraint.baselineToBaseline>
				return;
	//  198  452:return          
			}
			if(l == 3)
	//* 199  453:iload           4
	//* 200  455:iconst_3        
	//* 201  456:icmpne          478
			{
				obj.bottomToTop = k;
	//  202  459:aload           5
	//  203  461:iload_3         
	//  204  462:putfield        #697 <Field int ConstraintSet$Constraint.bottomToTop>
				obj.bottomToBottom = -1;
	//  205  465:aload           5
	//  206  467:iconst_m1       
	//  207  468:putfield        #700 <Field int ConstraintSet$Constraint.bottomToBottom>
				obj.baselineToBaseline = -1;
	//  208  471:aload           5
	//  209  473:iconst_m1       
	//  210  474:putfield        #706 <Field int ConstraintSet$Constraint.baselineToBaseline>
				return;
	//  211  477:return          
			} else
			{
				obj = ((Object) (new StringBuilder()));
	//  212  478:new             #490 <Class StringBuilder>
	//  213  481:dup             
	//  214  482:invokespecial   #491 <Method void StringBuilder()>
	//  215  485:astore          5
				((StringBuilder) (obj)).append("right to ");
	//  216  487:aload           5
	//  217  489:ldc2            #1001 <String "right to ">
	//  218  492:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  219  495:pop             
				((StringBuilder) (obj)).append(sideToString(l));
	//  220  496:aload           5
	//  221  498:aload_0         
	//  222  499:iload           4
	//  223  501:invokespecial   #995 <Method String sideToString(int)>
	//  224  504:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  225  507:pop             
				((StringBuilder) (obj)).append(" undefined");
	//  226  508:aload           5
	//  227  510:ldc2            #1003 <String " undefined">
	//  228  513:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  229  516:pop             
				throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//  230  517:new             #410 <Class IllegalArgumentException>
	//  231  520:dup             
	//  232  521:aload           5
	//  233  523:invokevirtual   #509 <Method String StringBuilder.toString()>
	//  234  526:invokespecial   #415 <Method void IllegalArgumentException(String)>
	//  235  529:athrow          
			}

		case 3: // '\003'
			if(l == 3)
	//* 236  530:iload           4
	//* 237  532:iconst_3        
	//* 238  533:icmpne          555
			{
				obj.topToTop = k;
	//  239  536:aload           5
	//  240  538:iload_3         
	//  241  539:putfield        #592 <Field int ConstraintSet$Constraint.topToTop>
				obj.topToBottom = -1;
	//  242  542:aload           5
	//  243  544:iconst_m1       
	//  244  545:putfield        #595 <Field int ConstraintSet$Constraint.topToBottom>
				obj.baselineToBaseline = -1;
	//  245  548:aload           5
	//  246  550:iconst_m1       
	//  247  551:putfield        #706 <Field int ConstraintSet$Constraint.baselineToBaseline>
				return;
	//  248  554:return          
			}
			if(l == 4)
	//* 249  555:iload           4
	//* 250  557:iconst_4        
	//* 251  558:icmpne          580
			{
				obj.topToBottom = k;
	//  252  561:aload           5
	//  253  563:iload_3         
	//  254  564:putfield        #595 <Field int ConstraintSet$Constraint.topToBottom>
				obj.topToTop = -1;
	//  255  567:aload           5
	//  256  569:iconst_m1       
	//  257  570:putfield        #592 <Field int ConstraintSet$Constraint.topToTop>
				obj.baselineToBaseline = -1;
	//  258  573:aload           5
	//  259  575:iconst_m1       
	//  260  576:putfield        #706 <Field int ConstraintSet$Constraint.baselineToBaseline>
				return;
	//  261  579:return          
			} else
			{
				obj = ((Object) (new StringBuilder()));
	//  262  580:new             #490 <Class StringBuilder>
	//  263  583:dup             
	//  264  584:invokespecial   #491 <Method void StringBuilder()>
	//  265  587:astore          5
				((StringBuilder) (obj)).append("right to ");
	//  266  589:aload           5
	//  267  591:ldc2            #1001 <String "right to ">
	//  268  594:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  269  597:pop             
				((StringBuilder) (obj)).append(sideToString(l));
	//  270  598:aload           5
	//  271  600:aload_0         
	//  272  601:iload           4
	//  273  603:invokespecial   #995 <Method String sideToString(int)>
	//  274  606:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  275  609:pop             
				((StringBuilder) (obj)).append(" undefined");
	//  276  610:aload           5
	//  277  612:ldc2            #1003 <String " undefined">
	//  278  615:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  279  618:pop             
				throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//  280  619:new             #410 <Class IllegalArgumentException>
	//  281  622:dup             
	//  282  623:aload           5
	//  283  625:invokevirtual   #509 <Method String StringBuilder.toString()>
	//  284  628:invokespecial   #415 <Method void IllegalArgumentException(String)>
	//  285  631:athrow          
			}

		case 2: // '\002'
			if(l == 1)
	//* 286  632:iload           4
	//* 287  634:iconst_1        
	//* 288  635:icmpne          651
			{
				obj.rightToLeft = k;
	//  289  638:aload           5
	//  290  640:iload_3         
	//  291  641:putfield        #613 <Field int ConstraintSet$Constraint.rightToLeft>
				obj.rightToRight = -1;
	//  292  644:aload           5
	//  293  646:iconst_m1       
	//  294  647:putfield        #610 <Field int ConstraintSet$Constraint.rightToRight>
				return;
	//  295  650:return          
			}
			if(l == 2)
	//* 296  651:iload           4
	//* 297  653:iconst_2        
	//* 298  654:icmpne          670
			{
				obj.rightToRight = k;
	//  299  657:aload           5
	//  300  659:iload_3         
	//  301  660:putfield        #610 <Field int ConstraintSet$Constraint.rightToRight>
				obj.rightToLeft = -1;
	//  302  663:aload           5
	//  303  665:iconst_m1       
	//  304  666:putfield        #613 <Field int ConstraintSet$Constraint.rightToLeft>
				return;
	//  305  669:return          
			} else
			{
				obj = ((Object) (new StringBuilder()));
	//  306  670:new             #490 <Class StringBuilder>
	//  307  673:dup             
	//  308  674:invokespecial   #491 <Method void StringBuilder()>
	//  309  677:astore          5
				((StringBuilder) (obj)).append("right to ");
	//  310  679:aload           5
	//  311  681:ldc2            #1001 <String "right to ">
	//  312  684:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  313  687:pop             
				((StringBuilder) (obj)).append(sideToString(l));
	//  314  688:aload           5
	//  315  690:aload_0         
	//  316  691:iload           4
	//  317  693:invokespecial   #995 <Method String sideToString(int)>
	//  318  696:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  319  699:pop             
				((StringBuilder) (obj)).append(" undefined");
	//  320  700:aload           5
	//  321  702:ldc2            #1003 <String " undefined">
	//  322  705:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  323  708:pop             
				throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//  324  709:new             #410 <Class IllegalArgumentException>
	//  325  712:dup             
	//  326  713:aload           5
	//  327  715:invokevirtual   #509 <Method String StringBuilder.toString()>
	//  328  718:invokespecial   #415 <Method void IllegalArgumentException(String)>
	//  329  721:athrow          
			}

		case 1: // '\001'
			break;
		}
		if(l == 1)
	//* 330  722:iload           4
	//* 331  724:iconst_1        
	//* 332  725:icmpne          741
		{
			obj.leftToLeft = k;
	//  333  728:aload           5
	//  334  730:iload_3         
	//  335  731:putfield        #625 <Field int ConstraintSet$Constraint.leftToLeft>
			obj.leftToRight = -1;
	//  336  734:aload           5
	//  337  736:iconst_m1       
	//  338  737:putfield        #622 <Field int ConstraintSet$Constraint.leftToRight>
			return;
	//  339  740:return          
		}
		if(l == 2)
	//* 340  741:iload           4
	//* 341  743:iconst_2        
	//* 342  744:icmpne          760
		{
			obj.leftToRight = k;
	//  343  747:aload           5
	//  344  749:iload_3         
	//  345  750:putfield        #622 <Field int ConstraintSet$Constraint.leftToRight>
			obj.leftToLeft = -1;
	//  346  753:aload           5
	//  347  755:iconst_m1       
	//  348  756:putfield        #625 <Field int ConstraintSet$Constraint.leftToLeft>
			return;
	//  349  759:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//  350  760:new             #490 <Class StringBuilder>
	//  351  763:dup             
	//  352  764:invokespecial   #491 <Method void StringBuilder()>
	//  353  767:astore          5
			stringbuilder.append("left to ");
	//  354  769:aload           5
	//  355  771:ldc2            #1005 <String "left to ">
	//  356  774:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  357  777:pop             
			stringbuilder.append(sideToString(l));
	//  358  778:aload           5
	//  359  780:aload_0         
	//  360  781:iload           4
	//  361  783:invokespecial   #995 <Method String sideToString(int)>
	//  362  786:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  363  789:pop             
			stringbuilder.append(" undefined");
	//  364  790:aload           5
	//  365  792:ldc2            #1003 <String " undefined">
	//  366  795:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  367  798:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//  368  799:new             #410 <Class IllegalArgumentException>
	//  369  802:dup             
	//  370  803:aload           5
	//  371  805:invokevirtual   #509 <Method String StringBuilder.toString()>
	//  372  808:invokespecial   #415 <Method void IllegalArgumentException(String)>
	//  373  811:athrow          
		}
	}

	public void connect(int i, int j, int k, int l, int i1)
	{
		Object obj;
		if(!mConstraints.containsKey(((Object) (Integer.valueOf(i)))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #406 <Field HashMap mConstraints>
	//*   2    4:iload_1         
	//*   3    5:invokestatic    #458 <Method Integer Integer.valueOf(int)>
	//*   4    8:invokevirtual   #462 <Method boolean HashMap.containsKey(Object)>
	//*   5   11:ifne            34
			mConstraints.put(((Object) (Integer.valueOf(i))), ((Object) (new Constraint())));
	//    6   14:aload_0         
	//    7   15:getfield        #406 <Field HashMap mConstraints>
	//    8   18:iload_1         
	//    9   19:invokestatic    #458 <Method Integer Integer.valueOf(int)>
	//   10   22:new             #8   <Class ConstraintSet$Constraint>
	//   11   25:dup             
	//   12   26:aconst_null     
	//   13   27:invokespecial   #435 <Method void ConstraintSet$Constraint(ConstraintSet$1)>
	//   14   30:invokevirtual   #466 <Method Object HashMap.put(Object, Object)>
	//   15   33:pop             
		obj = ((Object) ((Constraint)mConstraints.get(((Object) (Integer.valueOf(i))))));
	//   16   34:aload_0         
	//   17   35:getfield        #406 <Field HashMap mConstraints>
	//   18   38:iload_1         
	//   19   39:invokestatic    #458 <Method Integer Integer.valueOf(int)>
	//   20   42:invokevirtual   #469 <Method Object HashMap.get(Object)>
	//   21   45:checkcast       #8   <Class ConstraintSet$Constraint>
	//   22   48:astore          6
		j;
	//   23   50:iload_2         
		JVM INSTR tableswitch 1 7: default 92
	//	               1 767
	//	               2 668
	//	               3 557
	//	               4 446
	//	               5 357
	//	               6 256
	//	               7 155;
	//   24   51:tableswitch     1 7: default 92
	//	               1 767
	//	               2 668
	//	               3 557
	//	               4 446
	//	               5 357
	//	               6 256
	//	               7 155
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		obj = ((Object) (new StringBuilder()));
	//   25   92:new             #490 <Class StringBuilder>
	//   26   95:dup             
	//   27   96:invokespecial   #491 <Method void StringBuilder()>
	//   28   99:astore          6
		((StringBuilder) (obj)).append(sideToString(j));
	//   29  101:aload           6
	//   30  103:aload_0         
	//   31  104:iload_2         
	//   32  105:invokespecial   #995 <Method String sideToString(int)>
	//   33  108:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   34  111:pop             
		((StringBuilder) (obj)).append(" to ");
	//   35  112:aload           6
	//   36  114:ldc2            #997 <String " to ">
	//   37  117:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   38  120:pop             
		((StringBuilder) (obj)).append(sideToString(l));
	//   39  121:aload           6
	//   40  123:aload_0         
	//   41  124:iload           4
	//   42  126:invokespecial   #995 <Method String sideToString(int)>
	//   43  129:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   44  132:pop             
		((StringBuilder) (obj)).append(" unknown");
	//   45  133:aload           6
	//   46  135:ldc2            #999 <String " unknown">
	//   47  138:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   48  141:pop             
		throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   49  142:new             #410 <Class IllegalArgumentException>
	//   50  145:dup             
	//   51  146:aload           6
	//   52  148:invokevirtual   #509 <Method String StringBuilder.toString()>
	//   53  151:invokespecial   #415 <Method void IllegalArgumentException(String)>
	//   54  154:athrow          
_L8:
		if(l != 7) goto _L10; else goto _L9
	//   55  155:iload           4
	//   56  157:bipush          7
	//   57  159:icmpne          177
_L9:
		obj.endToEnd = k;
	//   58  162:aload           6
	//   59  164:iload_3         
	//   60  165:putfield        #679 <Field int ConstraintSet$Constraint.endToEnd>
		obj.endToStart = -1;
	//   61  168:aload           6
	//   62  170:iconst_m1       
	//   63  171:putfield        #676 <Field int ConstraintSet$Constraint.endToStart>
		  goto _L11
	//*  64  174:goto            196
_L10:
		if(l != 6) goto _L13; else goto _L12
	//   65  177:iload           4
	//   66  179:bipush          6
	//   67  181:icmpne          204
_L12:
		obj.endToStart = k;
	//   68  184:aload           6
	//   69  186:iload_3         
	//   70  187:putfield        #676 <Field int ConstraintSet$Constraint.endToStart>
		obj.endToEnd = -1;
	//   71  190:aload           6
	//   72  192:iconst_m1       
	//   73  193:putfield        #679 <Field int ConstraintSet$Constraint.endToEnd>
_L11:
		obj.endMargin = i1;
	//   74  196:aload           6
	//   75  198:iload           5
	//   76  200:putfield        #682 <Field int ConstraintSet$Constraint.endMargin>
		return;
	//   77  203:return          
_L13:
		obj = ((Object) (new StringBuilder()));
	//   78  204:new             #490 <Class StringBuilder>
	//   79  207:dup             
	//   80  208:invokespecial   #491 <Method void StringBuilder()>
	//   81  211:astore          6
		((StringBuilder) (obj)).append("right to ");
	//   82  213:aload           6
	//   83  215:ldc2            #1001 <String "right to ">
	//   84  218:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   85  221:pop             
		((StringBuilder) (obj)).append(sideToString(l));
	//   86  222:aload           6
	//   87  224:aload_0         
	//   88  225:iload           4
	//   89  227:invokespecial   #995 <Method String sideToString(int)>
	//   90  230:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   91  233:pop             
		((StringBuilder) (obj)).append(" undefined");
	//   92  234:aload           6
	//   93  236:ldc2            #1003 <String " undefined">
	//   94  239:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//   95  242:pop             
		throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   96  243:new             #410 <Class IllegalArgumentException>
	//   97  246:dup             
	//   98  247:aload           6
	//   99  249:invokevirtual   #509 <Method String StringBuilder.toString()>
	//  100  252:invokespecial   #415 <Method void IllegalArgumentException(String)>
	//  101  255:athrow          
_L7:
		if(l != 6) goto _L15; else goto _L14
	//  102  256:iload           4
	//  103  258:bipush          6
	//  104  260:icmpne          278
_L14:
		obj.startToStart = k;
	//  105  263:aload           6
	//  106  265:iload_3         
	//  107  266:putfield        #601 <Field int ConstraintSet$Constraint.startToStart>
		obj.startToEnd = -1;
	//  108  269:aload           6
	//  109  271:iconst_m1       
	//  110  272:putfield        #604 <Field int ConstraintSet$Constraint.startToEnd>
		  goto _L16
	//* 111  275:goto            297
_L15:
		if(l != 7) goto _L18; else goto _L17
	//  112  278:iload           4
	//  113  280:bipush          7
	//  114  282:icmpne          305
_L17:
		obj.startToEnd = k;
	//  115  285:aload           6
	//  116  287:iload_3         
	//  117  288:putfield        #604 <Field int ConstraintSet$Constraint.startToEnd>
		obj.startToStart = -1;
	//  118  291:aload           6
	//  119  293:iconst_m1       
	//  120  294:putfield        #601 <Field int ConstraintSet$Constraint.startToStart>
_L16:
		obj.startMargin = i1;
	//  121  297:aload           6
	//  122  299:iload           5
	//  123  301:putfield        #607 <Field int ConstraintSet$Constraint.startMargin>
		return;
	//  124  304:return          
_L18:
		obj = ((Object) (new StringBuilder()));
	//  125  305:new             #490 <Class StringBuilder>
	//  126  308:dup             
	//  127  309:invokespecial   #491 <Method void StringBuilder()>
	//  128  312:astore          6
		((StringBuilder) (obj)).append("right to ");
	//  129  314:aload           6
	//  130  316:ldc2            #1001 <String "right to ">
	//  131  319:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  132  322:pop             
		((StringBuilder) (obj)).append(sideToString(l));
	//  133  323:aload           6
	//  134  325:aload_0         
	//  135  326:iload           4
	//  136  328:invokespecial   #995 <Method String sideToString(int)>
	//  137  331:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  138  334:pop             
		((StringBuilder) (obj)).append(" undefined");
	//  139  335:aload           6
	//  140  337:ldc2            #1003 <String " undefined">
	//  141  340:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  142  343:pop             
		throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//  143  344:new             #410 <Class IllegalArgumentException>
	//  144  347:dup             
	//  145  348:aload           6
	//  146  350:invokevirtual   #509 <Method String StringBuilder.toString()>
	//  147  353:invokespecial   #415 <Method void IllegalArgumentException(String)>
	//  148  356:athrow          
_L6:
		if(l == 5)
	//* 149  357:iload           4
	//* 150  359:iconst_5        
	//* 151  360:icmpne          394
		{
			obj.baselineToBaseline = k;
	//  152  363:aload           6
	//  153  365:iload_3         
	//  154  366:putfield        #706 <Field int ConstraintSet$Constraint.baselineToBaseline>
			obj.bottomToBottom = -1;
	//  155  369:aload           6
	//  156  371:iconst_m1       
	//  157  372:putfield        #700 <Field int ConstraintSet$Constraint.bottomToBottom>
			obj.bottomToTop = -1;
	//  158  375:aload           6
	//  159  377:iconst_m1       
	//  160  378:putfield        #697 <Field int ConstraintSet$Constraint.bottomToTop>
			obj.topToTop = -1;
	//  161  381:aload           6
	//  162  383:iconst_m1       
	//  163  384:putfield        #592 <Field int ConstraintSet$Constraint.topToTop>
			obj.topToBottom = -1;
	//  164  387:aload           6
	//  165  389:iconst_m1       
	//  166  390:putfield        #595 <Field int ConstraintSet$Constraint.topToBottom>
			return;
	//  167  393:return          
		} else
		{
			obj = ((Object) (new StringBuilder()));
	//  168  394:new             #490 <Class StringBuilder>
	//  169  397:dup             
	//  170  398:invokespecial   #491 <Method void StringBuilder()>
	//  171  401:astore          6
			((StringBuilder) (obj)).append("right to ");
	//  172  403:aload           6
	//  173  405:ldc2            #1001 <String "right to ">
	//  174  408:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  175  411:pop             
			((StringBuilder) (obj)).append(sideToString(l));
	//  176  412:aload           6
	//  177  414:aload_0         
	//  178  415:iload           4
	//  179  417:invokespecial   #995 <Method String sideToString(int)>
	//  180  420:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  181  423:pop             
			((StringBuilder) (obj)).append(" undefined");
	//  182  424:aload           6
	//  183  426:ldc2            #1003 <String " undefined">
	//  184  429:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  185  432:pop             
			throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//  186  433:new             #410 <Class IllegalArgumentException>
	//  187  436:dup             
	//  188  437:aload           6
	//  189  439:invokevirtual   #509 <Method String StringBuilder.toString()>
	//  190  442:invokespecial   #415 <Method void IllegalArgumentException(String)>
	//  191  445:athrow          
		}
_L5:
		if(l != 4) goto _L20; else goto _L19
	//  192  446:iload           4
	//  193  448:iconst_4        
	//  194  449:icmpne          473
_L19:
		obj.bottomToBottom = k;
	//  195  452:aload           6
	//  196  454:iload_3         
	//  197  455:putfield        #700 <Field int ConstraintSet$Constraint.bottomToBottom>
		obj.bottomToTop = -1;
	//  198  458:aload           6
	//  199  460:iconst_m1       
	//  200  461:putfield        #697 <Field int ConstraintSet$Constraint.bottomToTop>
		obj.baselineToBaseline = -1;
	//  201  464:aload           6
	//  202  466:iconst_m1       
	//  203  467:putfield        #706 <Field int ConstraintSet$Constraint.baselineToBaseline>
		  goto _L21
	//* 204  470:goto            497
_L20:
		if(l != 3) goto _L23; else goto _L22
	//  205  473:iload           4
	//  206  475:iconst_3        
	//  207  476:icmpne          505
_L22:
		obj.bottomToTop = k;
	//  208  479:aload           6
	//  209  481:iload_3         
	//  210  482:putfield        #697 <Field int ConstraintSet$Constraint.bottomToTop>
		obj.bottomToBottom = -1;
	//  211  485:aload           6
	//  212  487:iconst_m1       
	//  213  488:putfield        #700 <Field int ConstraintSet$Constraint.bottomToBottom>
		obj.baselineToBaseline = -1;
	//  214  491:aload           6
	//  215  493:iconst_m1       
	//  216  494:putfield        #706 <Field int ConstraintSet$Constraint.baselineToBaseline>
_L21:
		obj.bottomMargin = i1;
	//  217  497:aload           6
	//  218  499:iload           5
	//  219  501:putfield        #703 <Field int ConstraintSet$Constraint.bottomMargin>
		return;
	//  220  504:return          
_L23:
		obj = ((Object) (new StringBuilder()));
	//  221  505:new             #490 <Class StringBuilder>
	//  222  508:dup             
	//  223  509:invokespecial   #491 <Method void StringBuilder()>
	//  224  512:astore          6
		((StringBuilder) (obj)).append("right to ");
	//  225  514:aload           6
	//  226  516:ldc2            #1001 <String "right to ">
	//  227  519:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  228  522:pop             
		((StringBuilder) (obj)).append(sideToString(l));
	//  229  523:aload           6
	//  230  525:aload_0         
	//  231  526:iload           4
	//  232  528:invokespecial   #995 <Method String sideToString(int)>
	//  233  531:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  234  534:pop             
		((StringBuilder) (obj)).append(" undefined");
	//  235  535:aload           6
	//  236  537:ldc2            #1003 <String " undefined">
	//  237  540:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  238  543:pop             
		throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//  239  544:new             #410 <Class IllegalArgumentException>
	//  240  547:dup             
	//  241  548:aload           6
	//  242  550:invokevirtual   #509 <Method String StringBuilder.toString()>
	//  243  553:invokespecial   #415 <Method void IllegalArgumentException(String)>
	//  244  556:athrow          
_L4:
		if(l != 3) goto _L25; else goto _L24
	//  245  557:iload           4
	//  246  559:iconst_3        
	//  247  560:icmpne          584
_L24:
		obj.topToTop = k;
	//  248  563:aload           6
	//  249  565:iload_3         
	//  250  566:putfield        #592 <Field int ConstraintSet$Constraint.topToTop>
		obj.topToBottom = -1;
	//  251  569:aload           6
	//  252  571:iconst_m1       
	//  253  572:putfield        #595 <Field int ConstraintSet$Constraint.topToBottom>
		obj.baselineToBaseline = -1;
	//  254  575:aload           6
	//  255  577:iconst_m1       
	//  256  578:putfield        #706 <Field int ConstraintSet$Constraint.baselineToBaseline>
		  goto _L26
	//* 257  581:goto            608
_L25:
		if(l != 4) goto _L28; else goto _L27
	//  258  584:iload           4
	//  259  586:iconst_4        
	//  260  587:icmpne          616
_L27:
		obj.topToBottom = k;
	//  261  590:aload           6
	//  262  592:iload_3         
	//  263  593:putfield        #595 <Field int ConstraintSet$Constraint.topToBottom>
		obj.topToTop = -1;
	//  264  596:aload           6
	//  265  598:iconst_m1       
	//  266  599:putfield        #592 <Field int ConstraintSet$Constraint.topToTop>
		obj.baselineToBaseline = -1;
	//  267  602:aload           6
	//  268  604:iconst_m1       
	//  269  605:putfield        #706 <Field int ConstraintSet$Constraint.baselineToBaseline>
_L26:
		obj.topMargin = i1;
	//  270  608:aload           6
	//  271  610:iload           5
	//  272  612:putfield        #598 <Field int ConstraintSet$Constraint.topMargin>
		return;
	//  273  615:return          
_L28:
		obj = ((Object) (new StringBuilder()));
	//  274  616:new             #490 <Class StringBuilder>
	//  275  619:dup             
	//  276  620:invokespecial   #491 <Method void StringBuilder()>
	//  277  623:astore          6
		((StringBuilder) (obj)).append("right to ");
	//  278  625:aload           6
	//  279  627:ldc2            #1001 <String "right to ">
	//  280  630:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  281  633:pop             
		((StringBuilder) (obj)).append(sideToString(l));
	//  282  634:aload           6
	//  283  636:aload_0         
	//  284  637:iload           4
	//  285  639:invokespecial   #995 <Method String sideToString(int)>
	//  286  642:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  287  645:pop             
		((StringBuilder) (obj)).append(" undefined");
	//  288  646:aload           6
	//  289  648:ldc2            #1003 <String " undefined">
	//  290  651:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  291  654:pop             
		throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//  292  655:new             #410 <Class IllegalArgumentException>
	//  293  658:dup             
	//  294  659:aload           6
	//  295  661:invokevirtual   #509 <Method String StringBuilder.toString()>
	//  296  664:invokespecial   #415 <Method void IllegalArgumentException(String)>
	//  297  667:athrow          
_L3:
		if(l != 1) goto _L30; else goto _L29
	//  298  668:iload           4
	//  299  670:iconst_1        
	//  300  671:icmpne          689
_L29:
		obj.rightToLeft = k;
	//  301  674:aload           6
	//  302  676:iload_3         
	//  303  677:putfield        #613 <Field int ConstraintSet$Constraint.rightToLeft>
		obj.rightToRight = -1;
	//  304  680:aload           6
	//  305  682:iconst_m1       
	//  306  683:putfield        #610 <Field int ConstraintSet$Constraint.rightToRight>
		  goto _L31
	//* 307  686:goto            707
_L30:
		if(l != 2) goto _L33; else goto _L32
	//  308  689:iload           4
	//  309  691:iconst_2        
	//  310  692:icmpne          715
_L32:
		obj.rightToRight = k;
	//  311  695:aload           6
	//  312  697:iload_3         
	//  313  698:putfield        #610 <Field int ConstraintSet$Constraint.rightToRight>
		obj.rightToLeft = -1;
	//  314  701:aload           6
	//  315  703:iconst_m1       
	//  316  704:putfield        #613 <Field int ConstraintSet$Constraint.rightToLeft>
_L31:
		obj.rightMargin = i1;
	//  317  707:aload           6
	//  318  709:iload           5
	//  319  711:putfield        #616 <Field int ConstraintSet$Constraint.rightMargin>
		return;
	//  320  714:return          
_L33:
		obj = ((Object) (new StringBuilder()));
	//  321  715:new             #490 <Class StringBuilder>
	//  322  718:dup             
	//  323  719:invokespecial   #491 <Method void StringBuilder()>
	//  324  722:astore          6
		((StringBuilder) (obj)).append("right to ");
	//  325  724:aload           6
	//  326  726:ldc2            #1001 <String "right to ">
	//  327  729:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  328  732:pop             
		((StringBuilder) (obj)).append(sideToString(l));
	//  329  733:aload           6
	//  330  735:aload_0         
	//  331  736:iload           4
	//  332  738:invokespecial   #995 <Method String sideToString(int)>
	//  333  741:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  334  744:pop             
		((StringBuilder) (obj)).append(" undefined");
	//  335  745:aload           6
	//  336  747:ldc2            #1003 <String " undefined">
	//  337  750:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  338  753:pop             
		throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//  339  754:new             #410 <Class IllegalArgumentException>
	//  340  757:dup             
	//  341  758:aload           6
	//  342  760:invokevirtual   #509 <Method String StringBuilder.toString()>
	//  343  763:invokespecial   #415 <Method void IllegalArgumentException(String)>
	//  344  766:athrow          
_L2:
		if(l != 1) goto _L35; else goto _L34
	//  345  767:iload           4
	//  346  769:iconst_1        
	//  347  770:icmpne          788
_L34:
		obj.leftToLeft = k;
	//  348  773:aload           6
	//  349  775:iload_3         
	//  350  776:putfield        #625 <Field int ConstraintSet$Constraint.leftToLeft>
		obj.leftToRight = -1;
	//  351  779:aload           6
	//  352  781:iconst_m1       
	//  353  782:putfield        #622 <Field int ConstraintSet$Constraint.leftToRight>
		  goto _L36
	//* 354  785:goto            806
_L35:
		if(l != 2) goto _L38; else goto _L37
	//  355  788:iload           4
	//  356  790:iconst_2        
	//  357  791:icmpne          814
_L37:
		obj.leftToRight = k;
	//  358  794:aload           6
	//  359  796:iload_3         
	//  360  797:putfield        #622 <Field int ConstraintSet$Constraint.leftToRight>
		obj.leftToLeft = -1;
	//  361  800:aload           6
	//  362  802:iconst_m1       
	//  363  803:putfield        #625 <Field int ConstraintSet$Constraint.leftToLeft>
_L36:
		obj.leftMargin = i1;
	//  364  806:aload           6
	//  365  808:iload           5
	//  366  810:putfield        #628 <Field int ConstraintSet$Constraint.leftMargin>
		return;
	//  367  813:return          
_L38:
		StringBuilder stringbuilder = new StringBuilder();
	//  368  814:new             #490 <Class StringBuilder>
	//  369  817:dup             
	//  370  818:invokespecial   #491 <Method void StringBuilder()>
	//  371  821:astore          6
		stringbuilder.append("Left to ");
	//  372  823:aload           6
	//  373  825:ldc2            #1007 <String "Left to ">
	//  374  828:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  375  831:pop             
		stringbuilder.append(sideToString(l));
	//  376  832:aload           6
	//  377  834:aload_0         
	//  378  835:iload           4
	//  379  837:invokespecial   #995 <Method String sideToString(int)>
	//  380  840:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  381  843:pop             
		stringbuilder.append(" undefined");
	//  382  844:aload           6
	//  383  846:ldc2            #1003 <String " undefined">
	//  384  849:invokevirtual   #496 <Method StringBuilder StringBuilder.append(String)>
	//  385  852:pop             
		throw new IllegalArgumentException(stringbuilder.toString());
	//  386  853:new             #410 <Class IllegalArgumentException>
	//  387  856:dup             
	//  388  857:aload           6
	//  389  859:invokevirtual   #509 <Method String StringBuilder.toString()>
	//  390  862:invokespecial   #415 <Method void IllegalArgumentException(String)>
	//  391  865:athrow          
	}

	public void constrainCircle(int i, int j, int k, float f)
	{
		Constraint constraint = get(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:astore          5
		constraint.circleConstraint = j;
	//    4    7:aload           5
	//    5    9:iload_2         
	//    6   10:putfield        #533 <Field int ConstraintSet$Constraint.circleConstraint>
		constraint.circleRadius = k;
	//    7   13:aload           5
	//    8   15:iload_3         
	//    9   16:putfield        #527 <Field int ConstraintSet$Constraint.circleRadius>
		constraint.circleAngle = f;
	//   10   19:aload           5
	//   11   21:fload           4
	//   12   23:putfield        #520 <Field float ConstraintSet$Constraint.circleAngle>
	//   13   26:return          
	}

	public void constrainDefaultHeight(int i, int j)
	{
		get(i).heightDefault = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:iload_2         
	//    4    6:putfield        #1013 <Field int ConstraintSet$Constraint.heightDefault>
	//    5    9:return          
	}

	public void constrainDefaultWidth(int i, int j)
	{
		get(i).widthDefault = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:iload_2         
	//    4    6:putfield        #1017 <Field int ConstraintSet$Constraint.widthDefault>
	//    5    9:return          
	}

	public void constrainHeight(int i, int j)
	{
		get(i).mHeight = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:iload_2         
	//    4    6:putfield        #640 <Field int ConstraintSet$Constraint.mHeight>
	//    5    9:return          
	}

	public void constrainMaxHeight(int i, int j)
	{
		get(i).heightMax = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:iload_2         
	//    4    6:putfield        #1022 <Field int ConstraintSet$Constraint.heightMax>
	//    5    9:return          
	}

	public void constrainMaxWidth(int i, int j)
	{
		get(i).widthMax = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:iload_2         
	//    4    6:putfield        #1026 <Field int ConstraintSet$Constraint.widthMax>
	//    5    9:return          
	}

	public void constrainMinHeight(int i, int j)
	{
		get(i).heightMin = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:iload_2         
	//    4    6:putfield        #1030 <Field int ConstraintSet$Constraint.heightMin>
	//    5    9:return          
	}

	public void constrainMinWidth(int i, int j)
	{
		get(i).widthMin = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:iload_2         
	//    4    6:putfield        #1034 <Field int ConstraintSet$Constraint.widthMin>
	//    5    9:return          
	}

	public void constrainPercentHeight(int i, float f)
	{
		get(i).heightPercent = f;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:fload_2         
	//    4    6:putfield        #1039 <Field float ConstraintSet$Constraint.heightPercent>
	//    5    9:return          
	}

	public void constrainPercentWidth(int i, float f)
	{
		get(i).widthPercent = f;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:fload_2         
	//    4    6:putfield        #1043 <Field float ConstraintSet$Constraint.widthPercent>
	//    5    9:return          
	}

	public void constrainWidth(int i, int j)
	{
		get(i).mWidth = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:iload_2         
	//    4    6:putfield        #631 <Field int ConstraintSet$Constraint.mWidth>
	//    5    9:return          
	}

	public void create(int i, int j)
	{
		Constraint constraint = get(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:astore_3        
		constraint.mIsGuideline = true;
	//    4    6:aload_3         
	//    5    7:iconst_1        
	//    6    8:putfield        #888 <Field boolean ConstraintSet$Constraint.mIsGuideline>
		constraint.orientation = j;
	//    7   11:aload_3         
	//    8   12:iload_2         
	//    9   13:putfield        #619 <Field int ConstraintSet$Constraint.orientation>
	//   10   16:return          
	}

	public transient void createBarrier(int i, int j, int ai[])
	{
		Constraint constraint = get(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:astore          4
		constraint.mHelperType = 1;
	//    4    7:aload           4
	//    5    9:iconst_1        
	//    6   10:putfield        #765 <Field int ConstraintSet$Constraint.mHelperType>
		constraint.mBarrierDirection = j;
	//    7   13:aload           4
	//    8   15:iload_2         
	//    9   16:putfield        #781 <Field int ConstraintSet$Constraint.mBarrierDirection>
		constraint.mIsGuideline = false;
	//   10   19:aload           4
	//   11   21:iconst_0        
	//   12   22:putfield        #888 <Field boolean ConstraintSet$Constraint.mIsGuideline>
		constraint.mReferenceIds = ai;
	//   13   25:aload           4
	//   14   27:aload_3         
	//   15   28:putfield        #774 <Field int[] ConstraintSet$Constraint.mReferenceIds>
	//   16   31:return          
	}

	public void createHorizontalChain(int i, int j, int k, int l, int ai[], float af[], int i1)
	{
		createHorizontalChain(i, j, k, l, ai, af, i1, 1, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:iload           7
	//    8   12:iconst_1        
	//    9   13:iconst_2        
	//   10   14:invokespecial   #1050 <Method void createHorizontalChain(int, int, int, int, int[], float[], int, int, int)>
	//   11   17:return          
	}

	public void createHorizontalChainRtl(int i, int j, int k, int l, int ai[], float af[], int i1)
	{
		createHorizontalChain(i, j, k, l, ai, af, i1, 6, 7);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:iload           7
	//    8   12:bipush          6
	//    9   14:bipush          7
	//   10   16:invokespecial   #1050 <Method void createHorizontalChain(int, int, int, int, int[], float[], int, int, int)>
	//   11   19:return          
	}

	public void createVerticalChain(int i, int j, int k, int l, int ai[], float af[], int i1)
	{
		if(ai.length >= 2)
	//*   0    0:aload           5
	//*   1    2:arraylength     
	//*   2    3:iconst_2        
	//*   3    4:icmplt          178
		{
			if(af != null && af.length != ai.length)
	//*   4    7:aload           6
	//*   5    9:ifnull          35
	//*   6   12:aload           6
	//*   7   14:arraylength     
	//*   8   15:aload           5
	//*   9   17:arraylength     
	//*  10   18:icmpne          24
	//*  11   21:goto            35
				throw new IllegalArgumentException("must have 2 or more widgets in a chain");
	//   12   24:new             #410 <Class IllegalArgumentException>
	//   13   27:dup             
	//   14   28:ldc2            #412 <String "must have 2 or more widgets in a chain">
	//   15   31:invokespecial   #415 <Method void IllegalArgumentException(String)>
	//   16   34:athrow          
			if(af != null)
	//*  17   35:aload           6
	//*  18   37:ifnull          55
				get(ai[0]).verticalWeight = af[0];
	//   19   40:aload_0         
	//   20   41:aload           5
	//   21   43:iconst_0        
	//   22   44:iaload          
	//   23   45:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//   24   48:aload           6
	//   25   50:iconst_0        
	//   26   51:faload          
	//   27   52:putfield        #583 <Field float ConstraintSet$Constraint.verticalWeight>
			get(ai[0]).verticalChainStyle = i1;
	//   28   55:aload_0         
	//   29   56:aload           5
	//   30   58:iconst_0        
	//   31   59:iaload          
	//   32   60:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//   33   63:iload           7
	//   34   65:putfield        #580 <Field int ConstraintSet$Constraint.verticalChainStyle>
			connect(ai[0], 3, i, j, 0);
	//   35   68:aload_0         
	//   36   69:aload           5
	//   37   71:iconst_0        
	//   38   72:iaload          
	//   39   73:iconst_3        
	//   40   74:iload_1         
	//   41   75:iload_2         
	//   42   76:iconst_0        
	//   43   77:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
			for(i = 1; i < ai.length; i++)
	//*  44   80:iconst_1        
	//*  45   81:istore_1        
	//*  46   82:iload_1         
	//*  47   83:aload           5
	//*  48   85:arraylength     
	//*  49   86:icmpge          160
			{
				j = ai[i];
	//   50   89:aload           5
	//   51   91:iload_1         
	//   52   92:iaload          
	//   53   93:istore_2        
				j = ai[i];
	//   54   94:aload           5
	//   55   96:iload_1         
	//   56   97:iaload          
	//   57   98:istore_2        
				i1 = i - 1;
	//   58   99:iload_1         
	//   59  100:iconst_1        
	//   60  101:isub            
	//   61  102:istore          7
				connect(j, 3, ai[i1], 4, 0);
	//   62  104:aload_0         
	//   63  105:iload_2         
	//   64  106:iconst_3        
	//   65  107:aload           5
	//   66  109:iload           7
	//   67  111:iaload          
	//   68  112:iconst_4        
	//   69  113:iconst_0        
	//   70  114:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
				connect(ai[i1], 4, ai[i], 3, 0);
	//   71  117:aload_0         
	//   72  118:aload           5
	//   73  120:iload           7
	//   74  122:iaload          
	//   75  123:iconst_4        
	//   76  124:aload           5
	//   77  126:iload_1         
	//   78  127:iaload          
	//   79  128:iconst_3        
	//   80  129:iconst_0        
	//   81  130:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
				if(af != null)
	//*  82  133:aload           6
	//*  83  135:ifnull          153
					get(ai[i]).verticalWeight = af[i];
	//   84  138:aload_0         
	//   85  139:aload           5
	//   86  141:iload_1         
	//   87  142:iaload          
	//   88  143:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//   89  146:aload           6
	//   90  148:iload_1         
	//   91  149:faload          
	//   92  150:putfield        #583 <Field float ConstraintSet$Constraint.verticalWeight>
			}

	//   93  153:iload_1         
	//   94  154:iconst_1        
	//   95  155:iadd            
	//   96  156:istore_1        
	//*  97  157:goto            82
			connect(ai[ai.length - 1], 4, k, l, 0);
	//   98  160:aload_0         
	//   99  161:aload           5
	//  100  163:aload           5
	//  101  165:arraylength     
	//  102  166:iconst_1        
	//  103  167:isub            
	//  104  168:iaload          
	//  105  169:iconst_4        
	//  106  170:iload_3         
	//  107  171:iload           4
	//  108  173:iconst_0        
	//  109  174:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
			return;
	//  110  177:return          
		} else
		{
			throw new IllegalArgumentException("must have 2 or more widgets in a chain");
	//  111  178:new             #410 <Class IllegalArgumentException>
	//  112  181:dup             
	//  113  182:ldc2            #412 <String "must have 2 or more widgets in a chain">
	//  114  185:invokespecial   #415 <Method void IllegalArgumentException(String)>
	//  115  188:athrow          
		}
	}

	public boolean getApplyElevation(int i)
	{
		return get(i).applyElevation;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:getfield        #571 <Field boolean ConstraintSet$Constraint.applyElevation>
	//    4    8:ireturn         
	}

	public void load(Context context, int i)
	{
		android.content.res.XmlResourceParser xmlresourceparser = context.getResources().getXml(i);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #1063 <Method Resources Context.getResources()>
	//    2    4:iload_2         
	//    3    5:invokevirtual   #1069 <Method android.content.res.XmlResourceParser Resources.getXml(int)>
	//    4    8:astore_3        
		i = ((XmlPullParser) (xmlresourceparser)).getEventType();
	//    5    9:aload_3         
	//    6   10:invokeinterface #1074 <Method int XmlPullParser.getEventType()>
	//    7   15:istore_2        
		  goto _L1
	//*   8   16:goto            105
_L9:
		String s = ((XmlPullParser) (xmlresourceparser)).getName();
	//    9   19:aload_3         
	//   10   20:invokeinterface #1077 <Method String XmlPullParser.getName()>
	//   11   25:astore          4
		Constraint constraint = fillFromAttributeList(context, Xml.asAttributeSet(((XmlPullParser) (xmlresourceparser))));
	//   12   27:aload_0         
	//   13   28:aload_1         
	//   14   29:aload_3         
	//   15   30:invokestatic    #1083 <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//   16   33:invokespecial   #1085 <Method ConstraintSet$Constraint fillFromAttributeList(Context, AttributeSet)>
	//   17   36:astore          5
		if(s.equalsIgnoreCase("Guideline"))
	//*  18   38:aload           4
	//*  19   40:ldc2            #1087 <String "Guideline">
	//*  20   43:invokevirtual   #1093 <Method boolean String.equalsIgnoreCase(String)>
	//*  21   46:ifeq            55
			constraint.mIsGuideline = true;
	//   22   49:aload           5
	//   23   51:iconst_1        
	//   24   52:putfield        #888 <Field boolean ConstraintSet$Constraint.mIsGuideline>
		mConstraints.put(((Object) (Integer.valueOf(constraint.mViewId))), ((Object) (constraint)));
	//   25   55:aload_0         
	//   26   56:getfield        #406 <Field HashMap mConstraints>
	//   27   59:aload           5
	//   28   61:getfield        #586 <Field int ConstraintSet$Constraint.mViewId>
	//   29   64:invokestatic    #458 <Method Integer Integer.valueOf(int)>
	//   30   67:aload           5
	//   31   69:invokevirtual   #466 <Method Object HashMap.put(Object, Object)>
	//   32   72:pop             
		  goto _L2
	//*  33   73:goto            83
_L6:
		((XmlPullParser) (xmlresourceparser)).getName();
	//   34   76:aload_3         
	//   35   77:invokeinterface #1077 <Method String XmlPullParser.getName()>
	//   36   82:pop             
_L2:
		i = ((XmlPullParser) (xmlresourceparser)).next();
	//   37   83:aload_3         
	//   38   84:invokeinterface #1095 <Method int XmlPullParser.next()>
	//   39   89:istore_2        
		  goto _L1
	//*  40   90:goto            105
		context;
	//   41   93:astore_1        
		((IOException) (context)).printStackTrace();
	//   42   94:aload_1         
	//   43   95:invokevirtual   #1098 <Method void IOException.printStackTrace()>
		return;
	//   44   98:return          
		context;
	//   45   99:astore_1        
		((XmlPullParserException) (context)).printStackTrace();
	//   46  100:aload_1         
	//   47  101:invokevirtual   #1099 <Method void XmlPullParserException.printStackTrace()>
_L4:
		return;
	//   48  104:return          
_L1:
		if(i == 1) goto _L4; else goto _L3
	//   49  105:iload_2         
	//   50  106:iconst_1        
	//   51  107:icmpeq          104
_L3:
		if(i == 0) goto _L6; else goto _L5
	//   52  110:iload_2         
	//   53  111:ifeq            76
_L5:
		i;
	//   54  114:iload_2         
		JVM INSTR tableswitch 2 3: default 136
	//	               2 19
	//	               3 83;
	//   55  115:tableswitch     2 3: default 136
	//	               2 19
	//	               3 83
		   goto _L2 _L7 _L2
_L7:
		if(true) goto _L9; else goto _L8
_L8:
	//*  56  136:goto            83
	}

	public void removeFromHorizontalChain(int i)
	{
		if(mConstraints.containsKey(((Object) (Integer.valueOf(i)))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #406 <Field HashMap mConstraints>
	//*   2    4:iload_1         
	//*   3    5:invokestatic    #458 <Method Integer Integer.valueOf(int)>
	//*   4    8:invokevirtual   #462 <Method boolean HashMap.containsKey(Object)>
	//*   5   11:ifeq            295
		{
			Constraint constraint = (Constraint)mConstraints.get(((Object) (Integer.valueOf(i))));
	//    6   14:aload_0         
	//    7   15:getfield        #406 <Field HashMap mConstraints>
	//    8   18:iload_1         
	//    9   19:invokestatic    #458 <Method Integer Integer.valueOf(int)>
	//   10   22:invokevirtual   #469 <Method Object HashMap.get(Object)>
	//   11   25:checkcast       #8   <Class ConstraintSet$Constraint>
	//   12   28:astore          5
			int j = constraint.leftToRight;
	//   13   30:aload           5
	//   14   32:getfield        #622 <Field int ConstraintSet$Constraint.leftToRight>
	//   15   35:istore_2        
			int k = constraint.rightToLeft;
	//   16   36:aload           5
	//   17   38:getfield        #613 <Field int ConstraintSet$Constraint.rightToLeft>
	//   18   41:istore_3        
			if(j == -1 && k == -1)
	//*  19   42:iload_2         
	//*  20   43:iconst_m1       
	//*  21   44:icmpne          195
	//*  22   47:iload_3         
	//*  23   48:iconst_m1       
	//*  24   49:icmpeq          55
	//*  25   52:goto            195
			{
				k = constraint.startToEnd;
	//   26   55:aload           5
	//   27   57:getfield        #604 <Field int ConstraintSet$Constraint.startToEnd>
	//   28   60:istore_3        
				int l = constraint.endToStart;
	//   29   61:aload           5
	//   30   63:getfield        #676 <Field int ConstraintSet$Constraint.endToStart>
	//   31   66:istore          4
				if(k != -1 || l != -1)
	//*  32   68:iload_3         
	//*  33   69:iconst_m1       
	//*  34   70:icmpne          79
	//*  35   73:iload           4
	//*  36   75:iconst_m1       
	//*  37   76:icmpeq          180
					if(k != -1 && l != -1)
	//*  38   79:iload_3         
	//*  39   80:iconst_m1       
	//*  40   81:icmpeq          117
	//*  41   84:iload           4
	//*  42   86:iconst_m1       
	//*  43   87:icmpeq          117
					{
						connect(k, 7, l, 6, 0);
	//   44   90:aload_0         
	//   45   91:iload_3         
	//   46   92:bipush          7
	//   47   94:iload           4
	//   48   96:bipush          6
	//   49   98:iconst_0        
	//   50   99:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
						connect(l, 6, j, 7, 0);
	//   51  102:aload_0         
	//   52  103:iload           4
	//   53  105:bipush          6
	//   54  107:iload_2         
	//   55  108:bipush          7
	//   56  110:iconst_0        
	//   57  111:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
					} else
	//*  58  114:goto            180
					if(j != -1 || l != -1)
	//*  59  117:iload_2         
	//*  60  118:iconst_m1       
	//*  61  119:icmpne          128
	//*  62  122:iload           4
	//*  63  124:iconst_m1       
	//*  64  125:icmpeq          180
						if(constraint.rightToRight != -1)
	//*  65  128:aload           5
	//*  66  130:getfield        #610 <Field int ConstraintSet$Constraint.rightToRight>
	//*  67  133:iconst_m1       
	//*  68  134:icmpeq          155
							connect(j, 7, constraint.rightToRight, 7, 0);
	//   69  137:aload_0         
	//   70  138:iload_2         
	//   71  139:bipush          7
	//   72  141:aload           5
	//   73  143:getfield        #610 <Field int ConstraintSet$Constraint.rightToRight>
	//   74  146:bipush          7
	//   75  148:iconst_0        
	//   76  149:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
						else
	//*  77  152:goto            180
						if(constraint.leftToLeft != -1)
	//*  78  155:aload           5
	//*  79  157:getfield        #625 <Field int ConstraintSet$Constraint.leftToLeft>
	//*  80  160:iconst_m1       
	//*  81  161:icmpeq          180
							connect(l, 6, constraint.leftToLeft, 6, 0);
	//   82  164:aload_0         
	//   83  165:iload           4
	//   84  167:bipush          6
	//   85  169:aload           5
	//   86  171:getfield        #625 <Field int ConstraintSet$Constraint.leftToLeft>
	//   87  174:bipush          6
	//   88  176:iconst_0        
	//   89  177:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
				clear(i, 6);
	//   90  180:aload_0         
	//   91  181:iload_1         
	//   92  182:bipush          6
	//   93  184:invokevirtual   #1102 <Method void clear(int, int)>
				clear(i, 7);
	//   94  187:aload_0         
	//   95  188:iload_1         
	//   96  189:bipush          7
	//   97  191:invokevirtual   #1102 <Method void clear(int, int)>
				return;
	//   98  194:return          
			}
			if(j != -1 && k != -1)
	//*  99  195:iload_2         
	//* 100  196:iconst_m1       
	//* 101  197:icmpeq          226
	//* 102  200:iload_3         
	//* 103  201:iconst_m1       
	//* 104  202:icmpeq          226
			{
				connect(j, 2, k, 1, 0);
	//  105  205:aload_0         
	//  106  206:iload_2         
	//  107  207:iconst_2        
	//  108  208:iload_3         
	//  109  209:iconst_1        
	//  110  210:iconst_0        
	//  111  211:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
				connect(k, 1, j, 2, 0);
	//  112  214:aload_0         
	//  113  215:iload_3         
	//  114  216:iconst_1        
	//  115  217:iload_2         
	//  116  218:iconst_2        
	//  117  219:iconst_0        
	//  118  220:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
			} else
	//* 119  223:goto            283
			if(j != -1 || k != -1)
	//* 120  226:iload_2         
	//* 121  227:iconst_m1       
	//* 122  228:icmpne          236
	//* 123  231:iload_3         
	//* 124  232:iconst_m1       
	//* 125  233:icmpeq          283
				if(constraint.rightToRight != -1)
	//* 126  236:aload           5
	//* 127  238:getfield        #610 <Field int ConstraintSet$Constraint.rightToRight>
	//* 128  241:iconst_m1       
	//* 129  242:icmpeq          261
					connect(j, 2, constraint.rightToRight, 2, 0);
	//  130  245:aload_0         
	//  131  246:iload_2         
	//  132  247:iconst_2        
	//  133  248:aload           5
	//  134  250:getfield        #610 <Field int ConstraintSet$Constraint.rightToRight>
	//  135  253:iconst_2        
	//  136  254:iconst_0        
	//  137  255:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
				else
	//* 138  258:goto            283
				if(constraint.leftToLeft != -1)
	//* 139  261:aload           5
	//* 140  263:getfield        #625 <Field int ConstraintSet$Constraint.leftToLeft>
	//* 141  266:iconst_m1       
	//* 142  267:icmpeq          283
					connect(k, 1, constraint.leftToLeft, 1, 0);
	//  143  270:aload_0         
	//  144  271:iload_3         
	//  145  272:iconst_1        
	//  146  273:aload           5
	//  147  275:getfield        #625 <Field int ConstraintSet$Constraint.leftToLeft>
	//  148  278:iconst_1        
	//  149  279:iconst_0        
	//  150  280:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
			clear(i, 1);
	//  151  283:aload_0         
	//  152  284:iload_1         
	//  153  285:iconst_1        
	//  154  286:invokevirtual   #1102 <Method void clear(int, int)>
			clear(i, 2);
	//  155  289:aload_0         
	//  156  290:iload_1         
	//  157  291:iconst_2        
	//  158  292:invokevirtual   #1102 <Method void clear(int, int)>
		}
	//  159  295:return          
	}

	public void removeFromVerticalChain(int i)
	{
		if(mConstraints.containsKey(((Object) (Integer.valueOf(i)))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #406 <Field HashMap mConstraints>
	//*   2    4:iload_1         
	//*   3    5:invokestatic    #458 <Method Integer Integer.valueOf(int)>
	//*   4    8:invokevirtual   #462 <Method boolean HashMap.containsKey(Object)>
	//*   5   11:ifeq            140
		{
			Constraint constraint = (Constraint)mConstraints.get(((Object) (Integer.valueOf(i))));
	//    6   14:aload_0         
	//    7   15:getfield        #406 <Field HashMap mConstraints>
	//    8   18:iload_1         
	//    9   19:invokestatic    #458 <Method Integer Integer.valueOf(int)>
	//   10   22:invokevirtual   #469 <Method Object HashMap.get(Object)>
	//   11   25:checkcast       #8   <Class ConstraintSet$Constraint>
	//   12   28:astore          4
			int j = constraint.topToBottom;
	//   13   30:aload           4
	//   14   32:getfield        #595 <Field int ConstraintSet$Constraint.topToBottom>
	//   15   35:istore_2        
			int k = constraint.bottomToTop;
	//   16   36:aload           4
	//   17   38:getfield        #697 <Field int ConstraintSet$Constraint.bottomToTop>
	//   18   41:istore_3        
			if(j != -1 || k != -1)
	//*  19   42:iload_2         
	//*  20   43:iconst_m1       
	//*  21   44:icmpne          52
	//*  22   47:iload_3         
	//*  23   48:iconst_m1       
	//*  24   49:icmpeq          140
				if(j != -1 && k != -1)
	//*  25   52:iload_2         
	//*  26   53:iconst_m1       
	//*  27   54:icmpeq          83
	//*  28   57:iload_3         
	//*  29   58:iconst_m1       
	//*  30   59:icmpeq          83
				{
					connect(j, 4, k, 3, 0);
	//   31   62:aload_0         
	//   32   63:iload_2         
	//   33   64:iconst_4        
	//   34   65:iload_3         
	//   35   66:iconst_3        
	//   36   67:iconst_0        
	//   37   68:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
					connect(k, 3, j, 4, 0);
	//   38   71:aload_0         
	//   39   72:iload_3         
	//   40   73:iconst_3        
	//   41   74:iload_2         
	//   42   75:iconst_4        
	//   43   76:iconst_0        
	//   44   77:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
				} else
	//*  45   80:goto            140
				if(j != -1 || k != -1)
	//*  46   83:iload_2         
	//*  47   84:iconst_m1       
	//*  48   85:icmpne          93
	//*  49   88:iload_3         
	//*  50   89:iconst_m1       
	//*  51   90:icmpeq          140
					if(constraint.bottomToBottom != -1)
	//*  52   93:aload           4
	//*  53   95:getfield        #700 <Field int ConstraintSet$Constraint.bottomToBottom>
	//*  54   98:iconst_m1       
	//*  55   99:icmpeq          118
						connect(j, 4, constraint.bottomToBottom, 4, 0);
	//   56  102:aload_0         
	//   57  103:iload_2         
	//   58  104:iconst_4        
	//   59  105:aload           4
	//   60  107:getfield        #700 <Field int ConstraintSet$Constraint.bottomToBottom>
	//   61  110:iconst_4        
	//   62  111:iconst_0        
	//   63  112:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
					else
	//*  64  115:goto            140
					if(constraint.topToTop != -1)
	//*  65  118:aload           4
	//*  66  120:getfield        #592 <Field int ConstraintSet$Constraint.topToTop>
	//*  67  123:iconst_m1       
	//*  68  124:icmpeq          140
						connect(k, 3, constraint.topToTop, 3, 0);
	//   69  127:aload_0         
	//   70  128:iload_3         
	//   71  129:iconst_3        
	//   72  130:aload           4
	//   73  132:getfield        #592 <Field int ConstraintSet$Constraint.topToTop>
	//   74  135:iconst_3        
	//   75  136:iconst_0        
	//   76  137:invokevirtual   #430 <Method void connect(int, int, int, int, int)>
		}
		clear(i, 3);
	//   77  140:aload_0         
	//   78  141:iload_1         
	//   79  142:iconst_3        
	//   80  143:invokevirtual   #1102 <Method void clear(int, int)>
		clear(i, 4);
	//   81  146:aload_0         
	//   82  147:iload_1         
	//   83  148:iconst_4        
	//   84  149:invokevirtual   #1102 <Method void clear(int, int)>
	//   85  152:return          
	}

	public void setAlpha(int i, float f)
	{
		get(i).alpha = f;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:fload_2         
	//    4    6:putfield        #577 <Field float ConstraintSet$Constraint.alpha>
	//    5    9:return          
	}

	public void setApplyElevation(int i, boolean flag)
	{
		get(i).applyElevation = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:iload_2         
	//    4    6:putfield        #571 <Field boolean ConstraintSet$Constraint.applyElevation>
	//    5    9:return          
	}

	public void setBarrierType(int i, int j)
	{
	//    0    0:return          
	}

	public void setDimensionRatio(int i, String s)
	{
		get(i).dimensionRatio = s;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:aload_2         
	//    4    6:putfield        #694 <Field String ConstraintSet$Constraint.dimensionRatio>
	//    5    9:return          
	}

	public void setElevation(int i, float f)
	{
		get(i).elevation = f;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:fload_2         
	//    4    6:putfield        #574 <Field float ConstraintSet$Constraint.elevation>
		get(i).applyElevation = true;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    8   14:iconst_1        
	//    9   15:putfield        #571 <Field boolean ConstraintSet$Constraint.applyElevation>
	//   10   18:return          
	}

	public void setGoneMargin(int i, int j, int k)
	{
		Constraint constraint = get(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:astore          4
		switch(j)
	//*   4    7:iload_2         
		{
	//*   5    8:tableswitch     1 7: default 52
	//	               1 109
	//	               2 102
	//	               3 95
	//	               4 88
	//	               5 77
	//	               6 70
	//	               7 63
		default:
			throw new IllegalArgumentException("unknown constraint");
	//    6   52:new             #410 <Class IllegalArgumentException>
	//    7   55:dup             
	//    8   56:ldc2            #909 <String "unknown constraint">
	//    9   59:invokespecial   #415 <Method void IllegalArgumentException(String)>
	//   10   62:athrow          

		case 7: // '\007'
			constraint.goneEndMargin = k;
	//   11   63:aload           4
	//   12   65:iload_3         
	//   13   66:putfield        #670 <Field int ConstraintSet$Constraint.goneEndMargin>
			return;
	//   14   69:return          

		case 6: // '\006'
			constraint.goneStartMargin = k;
	//   15   70:aload           4
	//   16   72:iload_3         
	//   17   73:putfield        #661 <Field int ConstraintSet$Constraint.goneStartMargin>
			return;
	//   18   76:return          

		case 5: // '\005'
			throw new IllegalArgumentException("baseline does not support margins");
	//   19   77:new             #410 <Class IllegalArgumentException>
	//   20   80:dup             
	//   21   81:ldc2            #1111 <String "baseline does not support margins">
	//   22   84:invokespecial   #415 <Method void IllegalArgumentException(String)>
	//   23   87:athrow          

		case 4: // '\004'
			constraint.goneBottomMargin = k;
	//   24   88:aload           4
	//   25   90:iload_3         
	//   26   91:putfield        #673 <Field int ConstraintSet$Constraint.goneBottomMargin>
			return;
	//   27   94:return          

		case 3: // '\003'
			constraint.goneTopMargin = k;
	//   28   95:aload           4
	//   29   97:iload_3         
	//   30   98:putfield        #658 <Field int ConstraintSet$Constraint.goneTopMargin>
			return;
	//   31  101:return          

		case 2: // '\002'
			constraint.goneRightMargin = k;
	//   32  102:aload           4
	//   33  104:iload_3         
	//   34  105:putfield        #664 <Field int ConstraintSet$Constraint.goneRightMargin>
			return;
	//   35  108:return          

		case 1: // '\001'
			constraint.goneLeftMargin = k;
	//   36  109:aload           4
	//   37  111:iload_3         
	//   38  112:putfield        #667 <Field int ConstraintSet$Constraint.goneLeftMargin>
			return;
	//   39  115:return          
		}
	}

	public void setGuidelineBegin(int i, int j)
	{
		get(i).guideBegin = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:iload_2         
	//    4    6:putfield        #655 <Field int ConstraintSet$Constraint.guideBegin>
		get(i).guideEnd = -1;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    8   14:iconst_m1       
	//    9   15:putfield        #649 <Field int ConstraintSet$Constraint.guideEnd>
		get(i).guidePercent = -1F;
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//   13   23:ldc2            #1113 <Float -1F>
	//   14   26:putfield        #646 <Field float ConstraintSet$Constraint.guidePercent>
	//   15   29:return          
	}

	public void setGuidelineEnd(int i, int j)
	{
		get(i).guideEnd = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:iload_2         
	//    4    6:putfield        #649 <Field int ConstraintSet$Constraint.guideEnd>
		get(i).guideBegin = -1;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    8   14:iconst_m1       
	//    9   15:putfield        #655 <Field int ConstraintSet$Constraint.guideBegin>
		get(i).guidePercent = -1F;
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//   13   23:ldc2            #1113 <Float -1F>
	//   14   26:putfield        #646 <Field float ConstraintSet$Constraint.guidePercent>
	//   15   29:return          
	}

	public void setGuidelinePercent(int i, float f)
	{
		get(i).guidePercent = f;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:fload_2         
	//    4    6:putfield        #646 <Field float ConstraintSet$Constraint.guidePercent>
		get(i).guideEnd = -1;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    8   14:iconst_m1       
	//    9   15:putfield        #649 <Field int ConstraintSet$Constraint.guideEnd>
		get(i).guideBegin = -1;
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//   13   23:iconst_m1       
	//   14   24:putfield        #655 <Field int ConstraintSet$Constraint.guideBegin>
	//   15   27:return          
	}

	public void setHorizontalBias(int i, float f)
	{
		get(i).horizontalBias = f;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:fload_2         
	//    4    6:putfield        #643 <Field float ConstraintSet$Constraint.horizontalBias>
	//    5    9:return          
	}

	public void setHorizontalChainStyle(int i, int j)
	{
		get(i).horizontalChainStyle = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:iload_2         
	//    4    6:putfield        #426 <Field int ConstraintSet$Constraint.horizontalChainStyle>
	//    5    9:return          
	}

	public void setHorizontalWeight(int i, float f)
	{
		get(i).horizontalWeight = f;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:fload_2         
	//    4    6:putfield        #423 <Field float ConstraintSet$Constraint.horizontalWeight>
	//    5    9:return          
	}

	public void setMargin(int i, int j, int k)
	{
		Constraint constraint = get(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:astore          4
		switch(j)
	//*   4    7:iload_2         
		{
	//*   5    8:tableswitch     1 7: default 52
	//	               1 109
	//	               2 102
	//	               3 95
	//	               4 88
	//	               5 77
	//	               6 70
	//	               7 63
		default:
			throw new IllegalArgumentException("unknown constraint");
	//    6   52:new             #410 <Class IllegalArgumentException>
	//    7   55:dup             
	//    8   56:ldc2            #909 <String "unknown constraint">
	//    9   59:invokespecial   #415 <Method void IllegalArgumentException(String)>
	//   10   62:athrow          

		case 7: // '\007'
			constraint.endMargin = k;
	//   11   63:aload           4
	//   12   65:iload_3         
	//   13   66:putfield        #682 <Field int ConstraintSet$Constraint.endMargin>
			return;
	//   14   69:return          

		case 6: // '\006'
			constraint.startMargin = k;
	//   15   70:aload           4
	//   16   72:iload_3         
	//   17   73:putfield        #607 <Field int ConstraintSet$Constraint.startMargin>
			return;
	//   18   76:return          

		case 5: // '\005'
			throw new IllegalArgumentException("baseline does not support margins");
	//   19   77:new             #410 <Class IllegalArgumentException>
	//   20   80:dup             
	//   21   81:ldc2            #1111 <String "baseline does not support margins">
	//   22   84:invokespecial   #415 <Method void IllegalArgumentException(String)>
	//   23   87:athrow          

		case 4: // '\004'
			constraint.bottomMargin = k;
	//   24   88:aload           4
	//   25   90:iload_3         
	//   26   91:putfield        #703 <Field int ConstraintSet$Constraint.bottomMargin>
			return;
	//   27   94:return          

		case 3: // '\003'
			constraint.topMargin = k;
	//   28   95:aload           4
	//   29   97:iload_3         
	//   30   98:putfield        #598 <Field int ConstraintSet$Constraint.topMargin>
			return;
	//   31  101:return          

		case 2: // '\002'
			constraint.rightMargin = k;
	//   32  102:aload           4
	//   33  104:iload_3         
	//   34  105:putfield        #616 <Field int ConstraintSet$Constraint.rightMargin>
			return;
	//   35  108:return          

		case 1: // '\001'
			constraint.leftMargin = k;
	//   36  109:aload           4
	//   37  111:iload_3         
	//   38  112:putfield        #628 <Field int ConstraintSet$Constraint.leftMargin>
			return;
	//   39  115:return          
		}
	}

	public void setRotation(int i, float f)
	{
		get(i).rotation = f;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:fload_2         
	//    4    6:putfield        #538 <Field float ConstraintSet$Constraint.rotation>
	//    5    9:return          
	}

	public void setRotationX(int i, float f)
	{
		get(i).rotationX = f;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:fload_2         
	//    4    6:putfield        #568 <Field float ConstraintSet$Constraint.rotationX>
	//    5    9:return          
	}

	public void setRotationY(int i, float f)
	{
		get(i).rotationY = f;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:fload_2         
	//    4    6:putfield        #565 <Field float ConstraintSet$Constraint.rotationY>
	//    5    9:return          
	}

	public void setScaleX(int i, float f)
	{
		get(i).scaleX = f;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:fload_2         
	//    4    6:putfield        #562 <Field float ConstraintSet$Constraint.scaleX>
	//    5    9:return          
	}

	public void setScaleY(int i, float f)
	{
		get(i).scaleY = f;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:fload_2         
	//    4    6:putfield        #559 <Field float ConstraintSet$Constraint.scaleY>
	//    5    9:return          
	}

	public void setTransformPivot(int i, float f, float f1)
	{
		Constraint constraint = get(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:astore          4
		constraint.transformPivotY = f1;
	//    4    7:aload           4
	//    5    9:fload_3         
	//    6   10:putfield        #553 <Field float ConstraintSet$Constraint.transformPivotY>
		constraint.transformPivotX = f;
	//    7   13:aload           4
	//    8   15:fload_2         
	//    9   16:putfield        #556 <Field float ConstraintSet$Constraint.transformPivotX>
	//   10   19:return          
	}

	public void setTransformPivotX(int i, float f)
	{
		get(i).transformPivotX = f;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:fload_2         
	//    4    6:putfield        #556 <Field float ConstraintSet$Constraint.transformPivotX>
	//    5    9:return          
	}

	public void setTransformPivotY(int i, float f)
	{
		get(i).transformPivotY = f;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:fload_2         
	//    4    6:putfield        #553 <Field float ConstraintSet$Constraint.transformPivotY>
	//    5    9:return          
	}

	public void setTranslation(int i, float f, float f1)
	{
		Constraint constraint = get(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:astore          4
		constraint.translationX = f;
	//    4    7:aload           4
	//    5    9:fload_2         
	//    6   10:putfield        #550 <Field float ConstraintSet$Constraint.translationX>
		constraint.translationY = f1;
	//    7   13:aload           4
	//    8   15:fload_3         
	//    9   16:putfield        #547 <Field float ConstraintSet$Constraint.translationY>
	//   10   19:return          
	}

	public void setTranslationX(int i, float f)
	{
		get(i).translationX = f;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:fload_2         
	//    4    6:putfield        #550 <Field float ConstraintSet$Constraint.translationX>
	//    5    9:return          
	}

	public void setTranslationY(int i, float f)
	{
		get(i).translationY = f;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:fload_2         
	//    4    6:putfield        #547 <Field float ConstraintSet$Constraint.translationY>
	//    5    9:return          
	}

	public void setTranslationZ(int i, float f)
	{
		get(i).translationZ = f;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:fload_2         
	//    4    6:putfield        #541 <Field float ConstraintSet$Constraint.translationZ>
	//    5    9:return          
	}

	public void setVerticalBias(int i, float f)
	{
		get(i).verticalBias = f;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:fload_2         
	//    4    6:putfield        #589 <Field float ConstraintSet$Constraint.verticalBias>
	//    5    9:return          
	}

	public void setVerticalChainStyle(int i, int j)
	{
		get(i).verticalChainStyle = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:iload_2         
	//    4    6:putfield        #580 <Field int ConstraintSet$Constraint.verticalChainStyle>
	//    5    9:return          
	}

	public void setVerticalWeight(int i, float f)
	{
		get(i).verticalWeight = f;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:fload_2         
	//    4    6:putfield        #583 <Field float ConstraintSet$Constraint.verticalWeight>
	//    5    9:return          
	}

	public void setVisibility(int i, int j)
	{
		get(i).visibility = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #419 <Method ConstraintSet$Constraint get(int)>
	//    3    5:iload_2         
	//    4    6:putfield        #637 <Field int ConstraintSet$Constraint.visibility>
	//    5    9:return          
	}

	private static final int ALPHA = 43;
	private static final int BARRIER_TYPE = 1;
	public static final int BASELINE = 5;
	private static final int BASELINE_TO_BASELINE = 1;
	public static final int BOTTOM = 4;
	private static final int BOTTOM_MARGIN = 2;
	private static final int BOTTOM_TO_BOTTOM = 3;
	private static final int BOTTOM_TO_TOP = 4;
	public static final int CHAIN_PACKED = 2;
	public static final int CHAIN_SPREAD = 0;
	public static final int CHAIN_SPREAD_INSIDE = 1;
	private static final int CIRCLE = 61;
	private static final int CIRCLE_ANGLE = 63;
	private static final int CIRCLE_RADIUS = 62;
	private static final boolean DEBUG = false;
	private static final int DIMENSION_RATIO = 5;
	private static final int EDITOR_ABSOLUTE_X = 6;
	private static final int EDITOR_ABSOLUTE_Y = 7;
	private static final int ELEVATION = 44;
	public static final int END = 7;
	private static final int END_MARGIN = 8;
	private static final int END_TO_END = 9;
	private static final int END_TO_START = 10;
	public static final int GONE = 8;
	private static final int GONE_BOTTOM_MARGIN = 11;
	private static final int GONE_END_MARGIN = 12;
	private static final int GONE_LEFT_MARGIN = 13;
	private static final int GONE_RIGHT_MARGIN = 14;
	private static final int GONE_START_MARGIN = 15;
	private static final int GONE_TOP_MARGIN = 16;
	private static final int GUIDE_BEGIN = 17;
	private static final int GUIDE_END = 18;
	private static final int GUIDE_PERCENT = 19;
	private static final int HEIGHT_DEFAULT = 55;
	private static final int HEIGHT_MAX = 57;
	private static final int HEIGHT_MIN = 59;
	public static final int HORIZONTAL = 0;
	private static final int HORIZONTAL_BIAS = 20;
	public static final int HORIZONTAL_GUIDELINE = 0;
	private static final int HORIZONTAL_STYLE = 41;
	private static final int HORIZONTAL_WEIGHT = 39;
	public static final int INVISIBLE = 4;
	private static final int LAYOUT_HEIGHT = 21;
	private static final int LAYOUT_VISIBILITY = 22;
	private static final int LAYOUT_WIDTH = 23;
	public static final int LEFT = 1;
	private static final int LEFT_MARGIN = 24;
	private static final int LEFT_TO_LEFT = 25;
	private static final int LEFT_TO_RIGHT = 26;
	public static final int MATCH_CONSTRAINT = 0;
	public static final int MATCH_CONSTRAINT_SPREAD = 0;
	public static final int MATCH_CONSTRAINT_WRAP = 1;
	private static final int ORIENTATION = 27;
	public static final int PARENT_ID = 0;
	public static final int RIGHT = 2;
	private static final int RIGHT_MARGIN = 28;
	private static final int RIGHT_TO_LEFT = 29;
	private static final int RIGHT_TO_RIGHT = 30;
	private static final int ROTATION = 60;
	private static final int ROTATION_X = 45;
	private static final int ROTATION_Y = 46;
	private static final int SCALE_X = 47;
	private static final int SCALE_Y = 48;
	public static final int START = 6;
	private static final int START_MARGIN = 31;
	private static final int START_TO_END = 32;
	private static final int START_TO_START = 33;
	private static final String TAG = "ConstraintSet";
	public static final int TOP = 3;
	private static final int TOP_MARGIN = 34;
	private static final int TOP_TO_BOTTOM = 35;
	private static final int TOP_TO_TOP = 36;
	private static final int TRANSFORM_PIVOT_X = 49;
	private static final int TRANSFORM_PIVOT_Y = 50;
	private static final int TRANSLATION_X = 51;
	private static final int TRANSLATION_Y = 52;
	private static final int TRANSLATION_Z = 53;
	public static final int UNSET = -1;
	private static final int UNUSED = 64;
	public static final int VERTICAL = 1;
	private static final int VERTICAL_BIAS = 37;
	public static final int VERTICAL_GUIDELINE = 1;
	private static final int VERTICAL_STYLE = 42;
	private static final int VERTICAL_WEIGHT = 40;
	private static final int VIEW_ID = 38;
	private static final int VISIBILITY_FLAGS[] = {
		0, 4, 8
	};
	public static final int VISIBLE = 0;
	private static final int WIDTH_DEFAULT = 54;
	private static final int WIDTH_MAX = 56;
	private static final int WIDTH_MIN = 58;
	public static final int WRAP_CONTENT = -2;
	private static SparseIntArray mapToConstant;
	private HashMap mConstraints;

	static 
	{
	//    0    0:iconst_3        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:iconst_0        
	//    5    6:iastore         
	//    6    7:dup             
	//    7    8:iconst_1        
	//    8    9:iconst_4        
	//    9   10:iastore         
	//   10   11:dup             
	//   11   12:iconst_2        
	//   12   13:bipush          8
	//   13   15:iastore         
	//   14   16:putstatic       #182 <Field int[] VISIBILITY_FLAGS>
		mapToConstant = new SparseIntArray();
	//   15   19:new             #184 <Class SparseIntArray>
	//   16   22:dup             
	//   17   23:invokespecial   #187 <Method void SparseIntArray()>
	//   18   26:putstatic       #189 <Field SparseIntArray mapToConstant>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
	//   19   29:getstatic       #189 <Field SparseIntArray mapToConstant>
	//   20   32:getstatic       #194 <Field int R$styleable.ConstraintSet_layout_constraintLeft_toLeftOf>
	//   21   35:bipush          25
	//   22   37:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintLeft_toRightOf, 26);
	//   23   40:getstatic       #189 <Field SparseIntArray mapToConstant>
	//   24   43:getstatic       #201 <Field int R$styleable.ConstraintSet_layout_constraintLeft_toRightOf>
	//   25   46:bipush          26
	//   26   48:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintRight_toLeftOf, 29);
	//   27   51:getstatic       #189 <Field SparseIntArray mapToConstant>
	//   28   54:getstatic       #204 <Field int R$styleable.ConstraintSet_layout_constraintRight_toLeftOf>
	//   29   57:bipush          29
	//   30   59:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintRight_toRightOf, 30);
	//   31   62:getstatic       #189 <Field SparseIntArray mapToConstant>
	//   32   65:getstatic       #207 <Field int R$styleable.ConstraintSet_layout_constraintRight_toRightOf>
	//   33   68:bipush          30
	//   34   70:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintTop_toTopOf, 36);
	//   35   73:getstatic       #189 <Field SparseIntArray mapToConstant>
	//   36   76:getstatic       #210 <Field int R$styleable.ConstraintSet_layout_constraintTop_toTopOf>
	//   37   79:bipush          36
	//   38   81:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintTop_toBottomOf, 35);
	//   39   84:getstatic       #189 <Field SparseIntArray mapToConstant>
	//   40   87:getstatic       #213 <Field int R$styleable.ConstraintSet_layout_constraintTop_toBottomOf>
	//   41   90:bipush          35
	//   42   92:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintBottom_toTopOf, 4);
	//   43   95:getstatic       #189 <Field SparseIntArray mapToConstant>
	//   44   98:getstatic       #216 <Field int R$styleable.ConstraintSet_layout_constraintBottom_toTopOf>
	//   45  101:iconst_4        
	//   46  102:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
	//   47  105:getstatic       #189 <Field SparseIntArray mapToConstant>
	//   48  108:getstatic       #219 <Field int R$styleable.ConstraintSet_layout_constraintBottom_toBottomOf>
	//   49  111:iconst_3        
	//   50  112:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
	//   51  115:getstatic       #189 <Field SparseIntArray mapToConstant>
	//   52  118:getstatic       #222 <Field int R$styleable.ConstraintSet_layout_constraintBaseline_toBaselineOf>
	//   53  121:iconst_1        
	//   54  122:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_editor_absoluteX, 6);
	//   55  125:getstatic       #189 <Field SparseIntArray mapToConstant>
	//   56  128:getstatic       #225 <Field int R$styleable.ConstraintSet_layout_editor_absoluteX>
	//   57  131:bipush          6
	//   58  133:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_editor_absoluteY, 7);
	//   59  136:getstatic       #189 <Field SparseIntArray mapToConstant>
	//   60  139:getstatic       #228 <Field int R$styleable.ConstraintSet_layout_editor_absoluteY>
	//   61  142:bipush          7
	//   62  144:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintGuide_begin, 17);
	//   63  147:getstatic       #189 <Field SparseIntArray mapToConstant>
	//   64  150:getstatic       #231 <Field int R$styleable.ConstraintSet_layout_constraintGuide_begin>
	//   65  153:bipush          17
	//   66  155:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintGuide_end, 18);
	//   67  158:getstatic       #189 <Field SparseIntArray mapToConstant>
	//   68  161:getstatic       #234 <Field int R$styleable.ConstraintSet_layout_constraintGuide_end>
	//   69  164:bipush          18
	//   70  166:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintGuide_percent, 19);
	//   71  169:getstatic       #189 <Field SparseIntArray mapToConstant>
	//   72  172:getstatic       #237 <Field int R$styleable.ConstraintSet_layout_constraintGuide_percent>
	//   73  175:bipush          19
	//   74  177:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_orientation, 27);
	//   75  180:getstatic       #189 <Field SparseIntArray mapToConstant>
	//   76  183:getstatic       #240 <Field int R$styleable.ConstraintSet_android_orientation>
	//   77  186:bipush          27
	//   78  188:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintStart_toEndOf, 32);
	//   79  191:getstatic       #189 <Field SparseIntArray mapToConstant>
	//   80  194:getstatic       #243 <Field int R$styleable.ConstraintSet_layout_constraintStart_toEndOf>
	//   81  197:bipush          32
	//   82  199:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintStart_toStartOf, 33);
	//   83  202:getstatic       #189 <Field SparseIntArray mapToConstant>
	//   84  205:getstatic       #246 <Field int R$styleable.ConstraintSet_layout_constraintStart_toStartOf>
	//   85  208:bipush          33
	//   86  210:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintEnd_toStartOf, 10);
	//   87  213:getstatic       #189 <Field SparseIntArray mapToConstant>
	//   88  216:getstatic       #249 <Field int R$styleable.ConstraintSet_layout_constraintEnd_toStartOf>
	//   89  219:bipush          10
	//   90  221:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintEnd_toEndOf, 9);
	//   91  224:getstatic       #189 <Field SparseIntArray mapToConstant>
	//   92  227:getstatic       #252 <Field int R$styleable.ConstraintSet_layout_constraintEnd_toEndOf>
	//   93  230:bipush          9
	//   94  232:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_goneMarginLeft, 13);
	//   95  235:getstatic       #189 <Field SparseIntArray mapToConstant>
	//   96  238:getstatic       #255 <Field int R$styleable.ConstraintSet_layout_goneMarginLeft>
	//   97  241:bipush          13
	//   98  243:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_goneMarginTop, 16);
	//   99  246:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  100  249:getstatic       #258 <Field int R$styleable.ConstraintSet_layout_goneMarginTop>
	//  101  252:bipush          16
	//  102  254:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_goneMarginRight, 14);
	//  103  257:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  104  260:getstatic       #261 <Field int R$styleable.ConstraintSet_layout_goneMarginRight>
	//  105  263:bipush          14
	//  106  265:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_goneMarginBottom, 11);
	//  107  268:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  108  271:getstatic       #264 <Field int R$styleable.ConstraintSet_layout_goneMarginBottom>
	//  109  274:bipush          11
	//  110  276:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_goneMarginStart, 15);
	//  111  279:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  112  282:getstatic       #267 <Field int R$styleable.ConstraintSet_layout_goneMarginStart>
	//  113  285:bipush          15
	//  114  287:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_goneMarginEnd, 12);
	//  115  290:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  116  293:getstatic       #270 <Field int R$styleable.ConstraintSet_layout_goneMarginEnd>
	//  117  296:bipush          12
	//  118  298:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintVertical_weight, 40);
	//  119  301:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  120  304:getstatic       #273 <Field int R$styleable.ConstraintSet_layout_constraintVertical_weight>
	//  121  307:bipush          40
	//  122  309:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintHorizontal_weight, 39);
	//  123  312:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  124  315:getstatic       #276 <Field int R$styleable.ConstraintSet_layout_constraintHorizontal_weight>
	//  125  318:bipush          39
	//  126  320:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
	//  127  323:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  128  326:getstatic       #279 <Field int R$styleable.ConstraintSet_layout_constraintHorizontal_chainStyle>
	//  129  329:bipush          41
	//  130  331:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintVertical_chainStyle, 42);
	//  131  334:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  132  337:getstatic       #282 <Field int R$styleable.ConstraintSet_layout_constraintVertical_chainStyle>
	//  133  340:bipush          42
	//  134  342:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintHorizontal_bias, 20);
	//  135  345:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  136  348:getstatic       #285 <Field int R$styleable.ConstraintSet_layout_constraintHorizontal_bias>
	//  137  351:bipush          20
	//  138  353:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintVertical_bias, 37);
	//  139  356:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  140  359:getstatic       #288 <Field int R$styleable.ConstraintSet_layout_constraintVertical_bias>
	//  141  362:bipush          37
	//  142  364:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintDimensionRatio, 5);
	//  143  367:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  144  370:getstatic       #291 <Field int R$styleable.ConstraintSet_layout_constraintDimensionRatio>
	//  145  373:iconst_5        
	//  146  374:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintLeft_creator, 64);
	//  147  377:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  148  380:getstatic       #294 <Field int R$styleable.ConstraintSet_layout_constraintLeft_creator>
	//  149  383:bipush          64
	//  150  385:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintTop_creator, 64);
	//  151  388:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  152  391:getstatic       #297 <Field int R$styleable.ConstraintSet_layout_constraintTop_creator>
	//  153  394:bipush          64
	//  154  396:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintRight_creator, 64);
	//  155  399:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  156  402:getstatic       #300 <Field int R$styleable.ConstraintSet_layout_constraintRight_creator>
	//  157  405:bipush          64
	//  158  407:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintBottom_creator, 64);
	//  159  410:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  160  413:getstatic       #303 <Field int R$styleable.ConstraintSet_layout_constraintBottom_creator>
	//  161  416:bipush          64
	//  162  418:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintBaseline_creator, 64);
	//  163  421:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  164  424:getstatic       #306 <Field int R$styleable.ConstraintSet_layout_constraintBaseline_creator>
	//  165  427:bipush          64
	//  166  429:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_layout_marginLeft, 24);
	//  167  432:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  168  435:getstatic       #309 <Field int R$styleable.ConstraintSet_android_layout_marginLeft>
	//  169  438:bipush          24
	//  170  440:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_layout_marginRight, 28);
	//  171  443:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  172  446:getstatic       #312 <Field int R$styleable.ConstraintSet_android_layout_marginRight>
	//  173  449:bipush          28
	//  174  451:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_layout_marginStart, 31);
	//  175  454:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  176  457:getstatic       #315 <Field int R$styleable.ConstraintSet_android_layout_marginStart>
	//  177  460:bipush          31
	//  178  462:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_layout_marginEnd, 8);
	//  179  465:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  180  468:getstatic       #318 <Field int R$styleable.ConstraintSet_android_layout_marginEnd>
	//  181  471:bipush          8
	//  182  473:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_layout_marginTop, 34);
	//  183  476:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  184  479:getstatic       #321 <Field int R$styleable.ConstraintSet_android_layout_marginTop>
	//  185  482:bipush          34
	//  186  484:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_layout_marginBottom, 2);
	//  187  487:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  188  490:getstatic       #324 <Field int R$styleable.ConstraintSet_android_layout_marginBottom>
	//  189  493:iconst_2        
	//  190  494:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_layout_width, 23);
	//  191  497:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  192  500:getstatic       #327 <Field int R$styleable.ConstraintSet_android_layout_width>
	//  193  503:bipush          23
	//  194  505:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_layout_height, 21);
	//  195  508:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  196  511:getstatic       #330 <Field int R$styleable.ConstraintSet_android_layout_height>
	//  197  514:bipush          21
	//  198  516:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_visibility, 22);
	//  199  519:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  200  522:getstatic       #333 <Field int R$styleable.ConstraintSet_android_visibility>
	//  201  525:bipush          22
	//  202  527:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_alpha, 43);
	//  203  530:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  204  533:getstatic       #336 <Field int R$styleable.ConstraintSet_android_alpha>
	//  205  536:bipush          43
	//  206  538:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_elevation, 44);
	//  207  541:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  208  544:getstatic       #339 <Field int R$styleable.ConstraintSet_android_elevation>
	//  209  547:bipush          44
	//  210  549:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_rotationX, 45);
	//  211  552:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  212  555:getstatic       #342 <Field int R$styleable.ConstraintSet_android_rotationX>
	//  213  558:bipush          45
	//  214  560:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_rotationY, 46);
	//  215  563:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  216  566:getstatic       #345 <Field int R$styleable.ConstraintSet_android_rotationY>
	//  217  569:bipush          46
	//  218  571:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_rotation, 60);
	//  219  574:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  220  577:getstatic       #348 <Field int R$styleable.ConstraintSet_android_rotation>
	//  221  580:bipush          60
	//  222  582:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_scaleX, 47);
	//  223  585:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  224  588:getstatic       #351 <Field int R$styleable.ConstraintSet_android_scaleX>
	//  225  591:bipush          47
	//  226  593:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_scaleY, 48);
	//  227  596:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  228  599:getstatic       #354 <Field int R$styleable.ConstraintSet_android_scaleY>
	//  229  602:bipush          48
	//  230  604:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_transformPivotX, 49);
	//  231  607:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  232  610:getstatic       #357 <Field int R$styleable.ConstraintSet_android_transformPivotX>
	//  233  613:bipush          49
	//  234  615:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_transformPivotY, 50);
	//  235  618:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  236  621:getstatic       #360 <Field int R$styleable.ConstraintSet_android_transformPivotY>
	//  237  624:bipush          50
	//  238  626:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_translationX, 51);
	//  239  629:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  240  632:getstatic       #363 <Field int R$styleable.ConstraintSet_android_translationX>
	//  241  635:bipush          51
	//  242  637:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_translationY, 52);
	//  243  640:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  244  643:getstatic       #366 <Field int R$styleable.ConstraintSet_android_translationY>
	//  245  646:bipush          52
	//  246  648:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_translationZ, 53);
	//  247  651:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  248  654:getstatic       #369 <Field int R$styleable.ConstraintSet_android_translationZ>
	//  249  657:bipush          53
	//  250  659:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintWidth_default, 54);
	//  251  662:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  252  665:getstatic       #372 <Field int R$styleable.ConstraintSet_layout_constraintWidth_default>
	//  253  668:bipush          54
	//  254  670:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintHeight_default, 55);
	//  255  673:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  256  676:getstatic       #375 <Field int R$styleable.ConstraintSet_layout_constraintHeight_default>
	//  257  679:bipush          55
	//  258  681:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintWidth_max, 56);
	//  259  684:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  260  687:getstatic       #378 <Field int R$styleable.ConstraintSet_layout_constraintWidth_max>
	//  261  690:bipush          56
	//  262  692:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintHeight_max, 57);
	//  263  695:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  264  698:getstatic       #381 <Field int R$styleable.ConstraintSet_layout_constraintHeight_max>
	//  265  701:bipush          57
	//  266  703:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintWidth_min, 58);
	//  267  706:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  268  709:getstatic       #384 <Field int R$styleable.ConstraintSet_layout_constraintWidth_min>
	//  269  712:bipush          58
	//  270  714:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintHeight_min, 59);
	//  271  717:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  272  720:getstatic       #387 <Field int R$styleable.ConstraintSet_layout_constraintHeight_min>
	//  273  723:bipush          59
	//  274  725:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintCircle, 61);
	//  275  728:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  276  731:getstatic       #390 <Field int R$styleable.ConstraintSet_layout_constraintCircle>
	//  277  734:bipush          61
	//  278  736:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintCircleRadius, 62);
	//  279  739:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  280  742:getstatic       #393 <Field int R$styleable.ConstraintSet_layout_constraintCircleRadius>
	//  281  745:bipush          62
	//  282  747:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintCircleAngle, 63);
	//  283  750:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  284  753:getstatic       #396 <Field int R$styleable.ConstraintSet_layout_constraintCircleAngle>
	//  285  756:bipush          63
	//  286  758:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_id, 38);
	//  287  761:getstatic       #189 <Field SparseIntArray mapToConstant>
	//  288  764:getstatic       #399 <Field int R$styleable.ConstraintSet_android_id>
	//  289  767:bipush          38
	//  290  769:invokevirtual   #198 <Method void SparseIntArray.append(int, int)>
	//* 291  772:return          
	}
}
