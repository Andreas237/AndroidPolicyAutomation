// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.*;
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
		//    2    2:putfield        #249 <Field int mViewId>
			leftToLeft = layoutparams.leftToLeft;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:getfield        #252 <Field int ConstraintLayout$LayoutParams.leftToLeft>
		//    6   10:putfield        #99  <Field int leftToLeft>
			leftToRight = layoutparams.leftToRight;
		//    7   13:aload_0         
		//    8   14:aload_2         
		//    9   15:getfield        #253 <Field int ConstraintLayout$LayoutParams.leftToRight>
		//   10   18:putfield        #101 <Field int leftToRight>
			rightToLeft = layoutparams.rightToLeft;
		//   11   21:aload_0         
		//   12   22:aload_2         
		//   13   23:getfield        #254 <Field int ConstraintLayout$LayoutParams.rightToLeft>
		//   14   26:putfield        #103 <Field int rightToLeft>
			rightToRight = layoutparams.rightToRight;
		//   15   29:aload_0         
		//   16   30:aload_2         
		//   17   31:getfield        #255 <Field int ConstraintLayout$LayoutParams.rightToRight>
		//   18   34:putfield        #105 <Field int rightToRight>
			topToTop = layoutparams.topToTop;
		//   19   37:aload_0         
		//   20   38:aload_2         
		//   21   39:getfield        #256 <Field int ConstraintLayout$LayoutParams.topToTop>
		//   22   42:putfield        #107 <Field int topToTop>
			topToBottom = layoutparams.topToBottom;
		//   23   45:aload_0         
		//   24   46:aload_2         
		//   25   47:getfield        #257 <Field int ConstraintLayout$LayoutParams.topToBottom>
		//   26   50:putfield        #109 <Field int topToBottom>
			bottomToTop = layoutparams.bottomToTop;
		//   27   53:aload_0         
		//   28   54:aload_2         
		//   29   55:getfield        #258 <Field int ConstraintLayout$LayoutParams.bottomToTop>
		//   30   58:putfield        #111 <Field int bottomToTop>
			bottomToBottom = layoutparams.bottomToBottom;
		//   31   61:aload_0         
		//   32   62:aload_2         
		//   33   63:getfield        #259 <Field int ConstraintLayout$LayoutParams.bottomToBottom>
		//   34   66:putfield        #113 <Field int bottomToBottom>
			baselineToBaseline = layoutparams.baselineToBaseline;
		//   35   69:aload_0         
		//   36   70:aload_2         
		//   37   71:getfield        #260 <Field int ConstraintLayout$LayoutParams.baselineToBaseline>
		//   38   74:putfield        #115 <Field int baselineToBaseline>
			startToEnd = layoutparams.startToEnd;
		//   39   77:aload_0         
		//   40   78:aload_2         
		//   41   79:getfield        #261 <Field int ConstraintLayout$LayoutParams.startToEnd>
		//   42   82:putfield        #117 <Field int startToEnd>
			startToStart = layoutparams.startToStart;
		//   43   85:aload_0         
		//   44   86:aload_2         
		//   45   87:getfield        #262 <Field int ConstraintLayout$LayoutParams.startToStart>
		//   46   90:putfield        #119 <Field int startToStart>
			endToStart = layoutparams.endToStart;
		//   47   93:aload_0         
		//   48   94:aload_2         
		//   49   95:getfield        #263 <Field int ConstraintLayout$LayoutParams.endToStart>
		//   50   98:putfield        #121 <Field int endToStart>
			endToEnd = layoutparams.endToEnd;
		//   51  101:aload_0         
		//   52  102:aload_2         
		//   53  103:getfield        #264 <Field int ConstraintLayout$LayoutParams.endToEnd>
		//   54  106:putfield        #123 <Field int endToEnd>
			horizontalBias = layoutparams.horizontalBias;
		//   55  109:aload_0         
		//   56  110:aload_2         
		//   57  111:getfield        #265 <Field float ConstraintLayout$LayoutParams.horizontalBias>
		//   58  114:putfield        #126 <Field float horizontalBias>
			verticalBias = layoutparams.verticalBias;
		//   59  117:aload_0         
		//   60  118:aload_2         
		//   61  119:getfield        #266 <Field float ConstraintLayout$LayoutParams.verticalBias>
		//   62  122:putfield        #128 <Field float verticalBias>
			dimensionRatio = layoutparams.dimensionRatio;
		//   63  125:aload_0         
		//   64  126:aload_2         
		//   65  127:getfield        #267 <Field String ConstraintLayout$LayoutParams.dimensionRatio>
		//   66  130:putfield        #130 <Field String dimensionRatio>
			circleConstraint = layoutparams.circleConstraint;
		//   67  133:aload_0         
		//   68  134:aload_2         
		//   69  135:getfield        #268 <Field int ConstraintLayout$LayoutParams.circleConstraint>
		//   70  138:putfield        #132 <Field int circleConstraint>
			circleRadius = layoutparams.circleRadius;
		//   71  141:aload_0         
		//   72  142:aload_2         
		//   73  143:getfield        #269 <Field int ConstraintLayout$LayoutParams.circleRadius>
		//   74  146:putfield        #134 <Field int circleRadius>
			circleAngle = layoutparams.circleAngle;
		//   75  149:aload_0         
		//   76  150:aload_2         
		//   77  151:getfield        #270 <Field float ConstraintLayout$LayoutParams.circleAngle>
		//   78  154:putfield        #136 <Field float circleAngle>
			editorAbsoluteX = layoutparams.editorAbsoluteX;
		//   79  157:aload_0         
		//   80  158:aload_2         
		//   81  159:getfield        #271 <Field int ConstraintLayout$LayoutParams.editorAbsoluteX>
		//   82  162:putfield        #138 <Field int editorAbsoluteX>
			editorAbsoluteY = layoutparams.editorAbsoluteY;
		//   83  165:aload_0         
		//   84  166:aload_2         
		//   85  167:getfield        #272 <Field int ConstraintLayout$LayoutParams.editorAbsoluteY>
		//   86  170:putfield        #140 <Field int editorAbsoluteY>
			orientation = layoutparams.orientation;
		//   87  173:aload_0         
		//   88  174:aload_2         
		//   89  175:getfield        #273 <Field int ConstraintLayout$LayoutParams.orientation>
		//   90  178:putfield        #142 <Field int orientation>
			guidePercent = layoutparams.guidePercent;
		//   91  181:aload_0         
		//   92  182:aload_2         
		//   93  183:getfield        #274 <Field float ConstraintLayout$LayoutParams.guidePercent>
		//   94  186:putfield        #97  <Field float guidePercent>
			guideBegin = layoutparams.guideBegin;
		//   95  189:aload_0         
		//   96  190:aload_2         
		//   97  191:getfield        #275 <Field int ConstraintLayout$LayoutParams.guideBegin>
		//   98  194:putfield        #92  <Field int guideBegin>
			guideEnd = layoutparams.guideEnd;
		//   99  197:aload_0         
		//  100  198:aload_2         
		//  101  199:getfield        #276 <Field int ConstraintLayout$LayoutParams.guideEnd>
		//  102  202:putfield        #94  <Field int guideEnd>
			mWidth = layoutparams.width;
		//  103  205:aload_0         
		//  104  206:aload_2         
		//  105  207:getfield        #279 <Field int ConstraintLayout$LayoutParams.width>
		//  106  210:putfield        #281 <Field int mWidth>
			mHeight = layoutparams.height;
		//  107  213:aload_0         
		//  108  214:aload_2         
		//  109  215:getfield        #284 <Field int ConstraintLayout$LayoutParams.height>
		//  110  218:putfield        #286 <Field int mHeight>
			leftMargin = layoutparams.leftMargin;
		//  111  221:aload_0         
		//  112  222:aload_2         
		//  113  223:getfield        #287 <Field int ConstraintLayout$LayoutParams.leftMargin>
		//  114  226:putfield        #144 <Field int leftMargin>
			rightMargin = layoutparams.rightMargin;
		//  115  229:aload_0         
		//  116  230:aload_2         
		//  117  231:getfield        #288 <Field int ConstraintLayout$LayoutParams.rightMargin>
		//  118  234:putfield        #146 <Field int rightMargin>
			topMargin = layoutparams.topMargin;
		//  119  237:aload_0         
		//  120  238:aload_2         
		//  121  239:getfield        #289 <Field int ConstraintLayout$LayoutParams.topMargin>
		//  122  242:putfield        #148 <Field int topMargin>
			bottomMargin = layoutparams.bottomMargin;
		//  123  245:aload_0         
		//  124  246:aload_2         
		//  125  247:getfield        #290 <Field int ConstraintLayout$LayoutParams.bottomMargin>
		//  126  250:putfield        #150 <Field int bottomMargin>
			verticalWeight = layoutparams.verticalWeight;
		//  127  253:aload_0         
		//  128  254:aload_2         
		//  129  255:getfield        #291 <Field float ConstraintLayout$LayoutParams.verticalWeight>
		//  130  258:putfield        #170 <Field float verticalWeight>
			horizontalWeight = layoutparams.horizontalWeight;
		//  131  261:aload_0         
		//  132  262:aload_2         
		//  133  263:getfield        #292 <Field float ConstraintLayout$LayoutParams.horizontalWeight>
		//  134  266:putfield        #172 <Field float horizontalWeight>
			verticalChainStyle = layoutparams.verticalChainStyle;
		//  135  269:aload_0         
		//  136  270:aload_2         
		//  137  271:getfield        #293 <Field int ConstraintLayout$LayoutParams.verticalChainStyle>
		//  138  274:putfield        #176 <Field int verticalChainStyle>
			horizontalChainStyle = layoutparams.horizontalChainStyle;
		//  139  277:aload_0         
		//  140  278:aload_2         
		//  141  279:getfield        #294 <Field int ConstraintLayout$LayoutParams.horizontalChainStyle>
		//  142  282:putfield        #174 <Field int horizontalChainStyle>
			constrainedWidth = layoutparams.constrainedWidth;
		//  143  285:aload_0         
		//  144  286:aload_2         
		//  145  287:getfield        #295 <Field boolean ConstraintLayout$LayoutParams.constrainedWidth>
		//  146  290:putfield        #205 <Field boolean constrainedWidth>
			constrainedHeight = layoutparams.constrainedHeight;
		//  147  293:aload_0         
		//  148  294:aload_2         
		//  149  295:getfield        #296 <Field boolean ConstraintLayout$LayoutParams.constrainedHeight>
		//  150  298:putfield        #207 <Field boolean constrainedHeight>
			widthDefault = layoutparams.matchConstraintDefaultWidth;
		//  151  301:aload_0         
		//  152  302:aload_2         
		//  153  303:getfield        #299 <Field int ConstraintLayout$LayoutParams.matchConstraintDefaultWidth>
		//  154  306:putfield        #209 <Field int widthDefault>
			heightDefault = layoutparams.matchConstraintDefaultHeight;
		//  155  309:aload_0         
		//  156  310:aload_2         
		//  157  311:getfield        #302 <Field int ConstraintLayout$LayoutParams.matchConstraintDefaultHeight>
		//  158  314:putfield        #211 <Field int heightDefault>
			constrainedWidth = layoutparams.constrainedWidth;
		//  159  317:aload_0         
		//  160  318:aload_2         
		//  161  319:getfield        #295 <Field boolean ConstraintLayout$LayoutParams.constrainedWidth>
		//  162  322:putfield        #205 <Field boolean constrainedWidth>
			widthMax = layoutparams.matchConstraintMaxWidth;
		//  163  325:aload_0         
		//  164  326:aload_2         
		//  165  327:getfield        #305 <Field int ConstraintLayout$LayoutParams.matchConstraintMaxWidth>
		//  166  330:putfield        #213 <Field int widthMax>
			heightMax = layoutparams.matchConstraintMaxHeight;
		//  167  333:aload_0         
		//  168  334:aload_2         
		//  169  335:getfield        #308 <Field int ConstraintLayout$LayoutParams.matchConstraintMaxHeight>
		//  170  338:putfield        #215 <Field int heightMax>
			widthMin = layoutparams.matchConstraintMinWidth;
		//  171  341:aload_0         
		//  172  342:aload_2         
		//  173  343:getfield        #311 <Field int ConstraintLayout$LayoutParams.matchConstraintMinWidth>
		//  174  346:putfield        #217 <Field int widthMin>
			heightMin = layoutparams.matchConstraintMinHeight;
		//  175  349:aload_0         
		//  176  350:aload_2         
		//  177  351:getfield        #314 <Field int ConstraintLayout$LayoutParams.matchConstraintMinHeight>
		//  178  354:putfield        #219 <Field int heightMin>
			widthPercent = layoutparams.matchConstraintPercentWidth;
		//  179  357:aload_0         
		//  180  358:aload_2         
		//  181  359:getfield        #317 <Field float ConstraintLayout$LayoutParams.matchConstraintPercentWidth>
		//  182  362:putfield        #221 <Field float widthPercent>
			heightPercent = layoutparams.matchConstraintPercentHeight;
		//  183  365:aload_0         
		//  184  366:aload_2         
		//  185  367:getfield        #320 <Field float ConstraintLayout$LayoutParams.matchConstraintPercentHeight>
		//  186  370:putfield        #223 <Field float heightPercent>
			if(android.os.Build.VERSION.SDK_INT >= 17)
		//* 187  373:getstatic       #325 <Field int android.os.Build$VERSION.SDK_INT>
		//* 188  376:bipush          17
		//* 189  378:icmplt          397
			{
				endMargin = layoutparams.getMarginEnd();
		//  190  381:aload_0         
		//  191  382:aload_2         
		//  192  383:invokevirtual   #329 <Method int ConstraintLayout$LayoutParams.getMarginEnd()>
		//  193  386:putfield        #152 <Field int endMargin>
				startMargin = layoutparams.getMarginStart();
		//  194  389:aload_0         
		//  195  390:aload_2         
		//  196  391:invokevirtual   #332 <Method int ConstraintLayout$LayoutParams.getMarginStart()>
		//  197  394:putfield        #154 <Field int startMargin>
			}
		//  198  397:return          
		}

		private void fillFromConstraints(int i, Constraints.LayoutParams layoutparams)
		{
			fillFrom(i, ((ConstraintLayout.LayoutParams) (layoutparams)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #236 <Method void fillFrom(int, ConstraintLayout$LayoutParams)>
			alpha = layoutparams.alpha;
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:getfield        #335 <Field float Constraints$LayoutParams.alpha>
		//    7   11:putfield        #178 <Field float alpha>
			rotation = layoutparams.rotation;
		//    8   14:aload_0         
		//    9   15:aload_2         
		//   10   16:getfield        #336 <Field float Constraints$LayoutParams.rotation>
		//   11   19:putfield        #184 <Field float rotation>
			rotationX = layoutparams.rotationX;
		//   12   22:aload_0         
		//   13   23:aload_2         
		//   14   24:getfield        #337 <Field float Constraints$LayoutParams.rotationX>
		//   15   27:putfield        #186 <Field float rotationX>
			rotationY = layoutparams.rotationY;
		//   16   30:aload_0         
		//   17   31:aload_2         
		//   18   32:getfield        #338 <Field float Constraints$LayoutParams.rotationY>
		//   19   35:putfield        #188 <Field float rotationY>
			scaleX = layoutparams.scaleX;
		//   20   38:aload_0         
		//   21   39:aload_2         
		//   22   40:getfield        #339 <Field float Constraints$LayoutParams.scaleX>
		//   23   43:putfield        #190 <Field float scaleX>
			scaleY = layoutparams.scaleY;
		//   24   46:aload_0         
		//   25   47:aload_2         
		//   26   48:getfield        #340 <Field float Constraints$LayoutParams.scaleY>
		//   27   51:putfield        #192 <Field float scaleY>
			transformPivotX = layoutparams.transformPivotX;
		//   28   54:aload_0         
		//   29   55:aload_2         
		//   30   56:getfield        #341 <Field float Constraints$LayoutParams.transformPivotX>
		//   31   59:putfield        #195 <Field float transformPivotX>
			transformPivotY = layoutparams.transformPivotY;
		//   32   62:aload_0         
		//   33   63:aload_2         
		//   34   64:getfield        #342 <Field float Constraints$LayoutParams.transformPivotY>
		//   35   67:putfield        #197 <Field float transformPivotY>
			translationX = layoutparams.translationX;
		//   36   70:aload_0         
		//   37   71:aload_2         
		//   38   72:getfield        #343 <Field float Constraints$LayoutParams.translationX>
		//   39   75:putfield        #199 <Field float translationX>
			translationY = layoutparams.translationY;
		//   40   78:aload_0         
		//   41   79:aload_2         
		//   42   80:getfield        #344 <Field float Constraints$LayoutParams.translationY>
		//   43   83:putfield        #201 <Field float translationY>
			translationZ = layoutparams.translationZ;
		//   44   86:aload_0         
		//   45   87:aload_2         
		//   46   88:getfield        #345 <Field float Constraints$LayoutParams.translationZ>
		//   47   91:putfield        #203 <Field float translationZ>
			elevation = layoutparams.elevation;
		//   48   94:aload_0         
		//   49   95:aload_2         
		//   50   96:getfield        #346 <Field float Constraints$LayoutParams.elevation>
		//   51   99:putfield        #182 <Field float elevation>
			applyElevation = layoutparams.applyElevation;
		//   52  102:aload_0         
		//   53  103:aload_2         
		//   54  104:getfield        #347 <Field boolean Constraints$LayoutParams.applyElevation>
		//   55  107:putfield        #180 <Field boolean applyElevation>
		//   56  110:return          
		}

		private void fillFromConstraints(ConstraintHelper constrainthelper, int i, Constraints.LayoutParams layoutparams)
		{
			fillFromConstraints(i, layoutparams);
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

		public void applyTo(ConstraintLayout.LayoutParams layoutparams)
		{
			layoutparams.leftToLeft = leftToLeft;
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #99  <Field int leftToLeft>
		//    3    5:putfield        #252 <Field int ConstraintLayout$LayoutParams.leftToLeft>
			layoutparams.leftToRight = leftToRight;
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #101 <Field int leftToRight>
		//    7   13:putfield        #253 <Field int ConstraintLayout$LayoutParams.leftToRight>
			layoutparams.rightToLeft = rightToLeft;
		//    8   16:aload_1         
		//    9   17:aload_0         
		//   10   18:getfield        #103 <Field int rightToLeft>
		//   11   21:putfield        #254 <Field int ConstraintLayout$LayoutParams.rightToLeft>
			layoutparams.rightToRight = rightToRight;
		//   12   24:aload_1         
		//   13   25:aload_0         
		//   14   26:getfield        #105 <Field int rightToRight>
		//   15   29:putfield        #255 <Field int ConstraintLayout$LayoutParams.rightToRight>
			layoutparams.topToTop = topToTop;
		//   16   32:aload_1         
		//   17   33:aload_0         
		//   18   34:getfield        #107 <Field int topToTop>
		//   19   37:putfield        #256 <Field int ConstraintLayout$LayoutParams.topToTop>
			layoutparams.topToBottom = topToBottom;
		//   20   40:aload_1         
		//   21   41:aload_0         
		//   22   42:getfield        #109 <Field int topToBottom>
		//   23   45:putfield        #257 <Field int ConstraintLayout$LayoutParams.topToBottom>
			layoutparams.bottomToTop = bottomToTop;
		//   24   48:aload_1         
		//   25   49:aload_0         
		//   26   50:getfield        #111 <Field int bottomToTop>
		//   27   53:putfield        #258 <Field int ConstraintLayout$LayoutParams.bottomToTop>
			layoutparams.bottomToBottom = bottomToBottom;
		//   28   56:aload_1         
		//   29   57:aload_0         
		//   30   58:getfield        #113 <Field int bottomToBottom>
		//   31   61:putfield        #259 <Field int ConstraintLayout$LayoutParams.bottomToBottom>
			layoutparams.baselineToBaseline = baselineToBaseline;
		//   32   64:aload_1         
		//   33   65:aload_0         
		//   34   66:getfield        #115 <Field int baselineToBaseline>
		//   35   69:putfield        #260 <Field int ConstraintLayout$LayoutParams.baselineToBaseline>
			layoutparams.startToEnd = startToEnd;
		//   36   72:aload_1         
		//   37   73:aload_0         
		//   38   74:getfield        #117 <Field int startToEnd>
		//   39   77:putfield        #261 <Field int ConstraintLayout$LayoutParams.startToEnd>
			layoutparams.startToStart = startToStart;
		//   40   80:aload_1         
		//   41   81:aload_0         
		//   42   82:getfield        #119 <Field int startToStart>
		//   43   85:putfield        #262 <Field int ConstraintLayout$LayoutParams.startToStart>
			layoutparams.endToStart = endToStart;
		//   44   88:aload_1         
		//   45   89:aload_0         
		//   46   90:getfield        #121 <Field int endToStart>
		//   47   93:putfield        #263 <Field int ConstraintLayout$LayoutParams.endToStart>
			layoutparams.endToEnd = endToEnd;
		//   48   96:aload_1         
		//   49   97:aload_0         
		//   50   98:getfield        #123 <Field int endToEnd>
		//   51  101:putfield        #264 <Field int ConstraintLayout$LayoutParams.endToEnd>
			layoutparams.leftMargin = leftMargin;
		//   52  104:aload_1         
		//   53  105:aload_0         
		//   54  106:getfield        #144 <Field int leftMargin>
		//   55  109:putfield        #287 <Field int ConstraintLayout$LayoutParams.leftMargin>
			layoutparams.rightMargin = rightMargin;
		//   56  112:aload_1         
		//   57  113:aload_0         
		//   58  114:getfield        #146 <Field int rightMargin>
		//   59  117:putfield        #288 <Field int ConstraintLayout$LayoutParams.rightMargin>
			layoutparams.topMargin = topMargin;
		//   60  120:aload_1         
		//   61  121:aload_0         
		//   62  122:getfield        #148 <Field int topMargin>
		//   63  125:putfield        #289 <Field int ConstraintLayout$LayoutParams.topMargin>
			layoutparams.bottomMargin = bottomMargin;
		//   64  128:aload_1         
		//   65  129:aload_0         
		//   66  130:getfield        #150 <Field int bottomMargin>
		//   67  133:putfield        #290 <Field int ConstraintLayout$LayoutParams.bottomMargin>
			layoutparams.goneStartMargin = goneStartMargin;
		//   68  136:aload_1         
		//   69  137:aload_0         
		//   70  138:getfield        #168 <Field int goneStartMargin>
		//   71  141:putfield        #361 <Field int ConstraintLayout$LayoutParams.goneStartMargin>
			layoutparams.goneEndMargin = goneEndMargin;
		//   72  144:aload_1         
		//   73  145:aload_0         
		//   74  146:getfield        #166 <Field int goneEndMargin>
		//   75  149:putfield        #362 <Field int ConstraintLayout$LayoutParams.goneEndMargin>
			layoutparams.horizontalBias = horizontalBias;
		//   76  152:aload_1         
		//   77  153:aload_0         
		//   78  154:getfield        #126 <Field float horizontalBias>
		//   79  157:putfield        #265 <Field float ConstraintLayout$LayoutParams.horizontalBias>
			layoutparams.verticalBias = verticalBias;
		//   80  160:aload_1         
		//   81  161:aload_0         
		//   82  162:getfield        #128 <Field float verticalBias>
		//   83  165:putfield        #266 <Field float ConstraintLayout$LayoutParams.verticalBias>
			layoutparams.circleConstraint = circleConstraint;
		//   84  168:aload_1         
		//   85  169:aload_0         
		//   86  170:getfield        #132 <Field int circleConstraint>
		//   87  173:putfield        #268 <Field int ConstraintLayout$LayoutParams.circleConstraint>
			layoutparams.circleRadius = circleRadius;
		//   88  176:aload_1         
		//   89  177:aload_0         
		//   90  178:getfield        #134 <Field int circleRadius>
		//   91  181:putfield        #269 <Field int ConstraintLayout$LayoutParams.circleRadius>
			layoutparams.circleAngle = circleAngle;
		//   92  184:aload_1         
		//   93  185:aload_0         
		//   94  186:getfield        #136 <Field float circleAngle>
		//   95  189:putfield        #270 <Field float ConstraintLayout$LayoutParams.circleAngle>
			layoutparams.dimensionRatio = dimensionRatio;
		//   96  192:aload_1         
		//   97  193:aload_0         
		//   98  194:getfield        #130 <Field String dimensionRatio>
		//   99  197:putfield        #267 <Field String ConstraintLayout$LayoutParams.dimensionRatio>
			layoutparams.editorAbsoluteX = editorAbsoluteX;
		//  100  200:aload_1         
		//  101  201:aload_0         
		//  102  202:getfield        #138 <Field int editorAbsoluteX>
		//  103  205:putfield        #271 <Field int ConstraintLayout$LayoutParams.editorAbsoluteX>
			layoutparams.editorAbsoluteY = editorAbsoluteY;
		//  104  208:aload_1         
		//  105  209:aload_0         
		//  106  210:getfield        #140 <Field int editorAbsoluteY>
		//  107  213:putfield        #272 <Field int ConstraintLayout$LayoutParams.editorAbsoluteY>
			layoutparams.verticalWeight = verticalWeight;
		//  108  216:aload_1         
		//  109  217:aload_0         
		//  110  218:getfield        #170 <Field float verticalWeight>
		//  111  221:putfield        #291 <Field float ConstraintLayout$LayoutParams.verticalWeight>
			layoutparams.horizontalWeight = horizontalWeight;
		//  112  224:aload_1         
		//  113  225:aload_0         
		//  114  226:getfield        #172 <Field float horizontalWeight>
		//  115  229:putfield        #292 <Field float ConstraintLayout$LayoutParams.horizontalWeight>
			layoutparams.verticalChainStyle = verticalChainStyle;
		//  116  232:aload_1         
		//  117  233:aload_0         
		//  118  234:getfield        #176 <Field int verticalChainStyle>
		//  119  237:putfield        #293 <Field int ConstraintLayout$LayoutParams.verticalChainStyle>
			layoutparams.horizontalChainStyle = horizontalChainStyle;
		//  120  240:aload_1         
		//  121  241:aload_0         
		//  122  242:getfield        #174 <Field int horizontalChainStyle>
		//  123  245:putfield        #294 <Field int ConstraintLayout$LayoutParams.horizontalChainStyle>
			layoutparams.constrainedWidth = constrainedWidth;
		//  124  248:aload_1         
		//  125  249:aload_0         
		//  126  250:getfield        #205 <Field boolean constrainedWidth>
		//  127  253:putfield        #295 <Field boolean ConstraintLayout$LayoutParams.constrainedWidth>
			layoutparams.constrainedHeight = constrainedHeight;
		//  128  256:aload_1         
		//  129  257:aload_0         
		//  130  258:getfield        #207 <Field boolean constrainedHeight>
		//  131  261:putfield        #296 <Field boolean ConstraintLayout$LayoutParams.constrainedHeight>
			layoutparams.matchConstraintDefaultWidth = widthDefault;
		//  132  264:aload_1         
		//  133  265:aload_0         
		//  134  266:getfield        #209 <Field int widthDefault>
		//  135  269:putfield        #299 <Field int ConstraintLayout$LayoutParams.matchConstraintDefaultWidth>
			layoutparams.matchConstraintDefaultHeight = heightDefault;
		//  136  272:aload_1         
		//  137  273:aload_0         
		//  138  274:getfield        #211 <Field int heightDefault>
		//  139  277:putfield        #302 <Field int ConstraintLayout$LayoutParams.matchConstraintDefaultHeight>
			layoutparams.matchConstraintMaxWidth = widthMax;
		//  140  280:aload_1         
		//  141  281:aload_0         
		//  142  282:getfield        #213 <Field int widthMax>
		//  143  285:putfield        #305 <Field int ConstraintLayout$LayoutParams.matchConstraintMaxWidth>
			layoutparams.matchConstraintMaxHeight = heightMax;
		//  144  288:aload_1         
		//  145  289:aload_0         
		//  146  290:getfield        #215 <Field int heightMax>
		//  147  293:putfield        #308 <Field int ConstraintLayout$LayoutParams.matchConstraintMaxHeight>
			layoutparams.matchConstraintMinWidth = widthMin;
		//  148  296:aload_1         
		//  149  297:aload_0         
		//  150  298:getfield        #217 <Field int widthMin>
		//  151  301:putfield        #311 <Field int ConstraintLayout$LayoutParams.matchConstraintMinWidth>
			layoutparams.matchConstraintMinHeight = heightMin;
		//  152  304:aload_1         
		//  153  305:aload_0         
		//  154  306:getfield        #219 <Field int heightMin>
		//  155  309:putfield        #314 <Field int ConstraintLayout$LayoutParams.matchConstraintMinHeight>
			layoutparams.matchConstraintPercentWidth = widthPercent;
		//  156  312:aload_1         
		//  157  313:aload_0         
		//  158  314:getfield        #221 <Field float widthPercent>
		//  159  317:putfield        #317 <Field float ConstraintLayout$LayoutParams.matchConstraintPercentWidth>
			layoutparams.matchConstraintPercentHeight = heightPercent;
		//  160  320:aload_1         
		//  161  321:aload_0         
		//  162  322:getfield        #223 <Field float heightPercent>
		//  163  325:putfield        #320 <Field float ConstraintLayout$LayoutParams.matchConstraintPercentHeight>
			layoutparams.orientation = orientation;
		//  164  328:aload_1         
		//  165  329:aload_0         
		//  166  330:getfield        #142 <Field int orientation>
		//  167  333:putfield        #273 <Field int ConstraintLayout$LayoutParams.orientation>
			layoutparams.guidePercent = guidePercent;
		//  168  336:aload_1         
		//  169  337:aload_0         
		//  170  338:getfield        #97  <Field float guidePercent>
		//  171  341:putfield        #274 <Field float ConstraintLayout$LayoutParams.guidePercent>
			layoutparams.guideBegin = guideBegin;
		//  172  344:aload_1         
		//  173  345:aload_0         
		//  174  346:getfield        #92  <Field int guideBegin>
		//  175  349:putfield        #275 <Field int ConstraintLayout$LayoutParams.guideBegin>
			layoutparams.guideEnd = guideEnd;
		//  176  352:aload_1         
		//  177  353:aload_0         
		//  178  354:getfield        #94  <Field int guideEnd>
		//  179  357:putfield        #276 <Field int ConstraintLayout$LayoutParams.guideEnd>
			layoutparams.width = mWidth;
		//  180  360:aload_1         
		//  181  361:aload_0         
		//  182  362:getfield        #281 <Field int mWidth>
		//  183  365:putfield        #279 <Field int ConstraintLayout$LayoutParams.width>
			layoutparams.height = mHeight;
		//  184  368:aload_1         
		//  185  369:aload_0         
		//  186  370:getfield        #286 <Field int mHeight>
		//  187  373:putfield        #284 <Field int ConstraintLayout$LayoutParams.height>
			if(android.os.Build.VERSION.SDK_INT >= 17)
		//* 188  376:getstatic       #325 <Field int android.os.Build$VERSION.SDK_INT>
		//* 189  379:bipush          17
		//* 190  381:icmplt          400
			{
				layoutparams.setMarginStart(startMargin);
		//  191  384:aload_1         
		//  192  385:aload_0         
		//  193  386:getfield        #154 <Field int startMargin>
		//  194  389:invokevirtual   #366 <Method void ConstraintLayout$LayoutParams.setMarginStart(int)>
				layoutparams.setMarginEnd(endMargin);
		//  195  392:aload_1         
		//  196  393:aload_0         
		//  197  394:getfield        #152 <Field int endMargin>
		//  198  397:invokevirtual   #369 <Method void ConstraintLayout$LayoutParams.setMarginEnd(int)>
			}
			layoutparams.validate();
		//  199  400:aload_1         
		//  200  401:invokevirtual   #372 <Method void ConstraintLayout$LayoutParams.validate()>
		//  201  404:return          
		}

		public Constraint clone()
		{
			Constraint constraint = new Constraint();
		//    0    0:new             #2   <Class ConstraintSet$Constraint>
		//    1    3:dup             
		//    2    4:invokespecial   #230 <Method void ConstraintSet$Constraint()>
		//    3    7:astore_1        
			constraint.mIsGuideline = mIsGuideline;
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #90  <Field boolean mIsGuideline>
		//    7   13:putfield        #90  <Field boolean mIsGuideline>
			constraint.mWidth = mWidth;
		//    8   16:aload_1         
		//    9   17:aload_0         
		//   10   18:getfield        #281 <Field int mWidth>
		//   11   21:putfield        #281 <Field int mWidth>
			constraint.mHeight = mHeight;
		//   12   24:aload_1         
		//   13   25:aload_0         
		//   14   26:getfield        #286 <Field int mHeight>
		//   15   29:putfield        #286 <Field int mHeight>
			constraint.guideBegin = guideBegin;
		//   16   32:aload_1         
		//   17   33:aload_0         
		//   18   34:getfield        #92  <Field int guideBegin>
		//   19   37:putfield        #92  <Field int guideBegin>
			constraint.guideEnd = guideEnd;
		//   20   40:aload_1         
		//   21   41:aload_0         
		//   22   42:getfield        #94  <Field int guideEnd>
		//   23   45:putfield        #94  <Field int guideEnd>
			constraint.guidePercent = guidePercent;
		//   24   48:aload_1         
		//   25   49:aload_0         
		//   26   50:getfield        #97  <Field float guidePercent>
		//   27   53:putfield        #97  <Field float guidePercent>
			constraint.leftToLeft = leftToLeft;
		//   28   56:aload_1         
		//   29   57:aload_0         
		//   30   58:getfield        #99  <Field int leftToLeft>
		//   31   61:putfield        #99  <Field int leftToLeft>
			constraint.leftToRight = leftToRight;
		//   32   64:aload_1         
		//   33   65:aload_0         
		//   34   66:getfield        #101 <Field int leftToRight>
		//   35   69:putfield        #101 <Field int leftToRight>
			constraint.rightToLeft = rightToLeft;
		//   36   72:aload_1         
		//   37   73:aload_0         
		//   38   74:getfield        #103 <Field int rightToLeft>
		//   39   77:putfield        #103 <Field int rightToLeft>
			constraint.rightToRight = rightToRight;
		//   40   80:aload_1         
		//   41   81:aload_0         
		//   42   82:getfield        #105 <Field int rightToRight>
		//   43   85:putfield        #105 <Field int rightToRight>
			constraint.topToTop = topToTop;
		//   44   88:aload_1         
		//   45   89:aload_0         
		//   46   90:getfield        #107 <Field int topToTop>
		//   47   93:putfield        #107 <Field int topToTop>
			constraint.topToBottom = topToBottom;
		//   48   96:aload_1         
		//   49   97:aload_0         
		//   50   98:getfield        #109 <Field int topToBottom>
		//   51  101:putfield        #109 <Field int topToBottom>
			constraint.bottomToTop = bottomToTop;
		//   52  104:aload_1         
		//   53  105:aload_0         
		//   54  106:getfield        #111 <Field int bottomToTop>
		//   55  109:putfield        #111 <Field int bottomToTop>
			constraint.bottomToBottom = bottomToBottom;
		//   56  112:aload_1         
		//   57  113:aload_0         
		//   58  114:getfield        #113 <Field int bottomToBottom>
		//   59  117:putfield        #113 <Field int bottomToBottom>
			constraint.baselineToBaseline = baselineToBaseline;
		//   60  120:aload_1         
		//   61  121:aload_0         
		//   62  122:getfield        #115 <Field int baselineToBaseline>
		//   63  125:putfield        #115 <Field int baselineToBaseline>
			constraint.startToEnd = startToEnd;
		//   64  128:aload_1         
		//   65  129:aload_0         
		//   66  130:getfield        #117 <Field int startToEnd>
		//   67  133:putfield        #117 <Field int startToEnd>
			constraint.startToStart = startToStart;
		//   68  136:aload_1         
		//   69  137:aload_0         
		//   70  138:getfield        #119 <Field int startToStart>
		//   71  141:putfield        #119 <Field int startToStart>
			constraint.endToStart = endToStart;
		//   72  144:aload_1         
		//   73  145:aload_0         
		//   74  146:getfield        #121 <Field int endToStart>
		//   75  149:putfield        #121 <Field int endToStart>
			constraint.endToEnd = endToEnd;
		//   76  152:aload_1         
		//   77  153:aload_0         
		//   78  154:getfield        #123 <Field int endToEnd>
		//   79  157:putfield        #123 <Field int endToEnd>
			constraint.horizontalBias = horizontalBias;
		//   80  160:aload_1         
		//   81  161:aload_0         
		//   82  162:getfield        #126 <Field float horizontalBias>
		//   83  165:putfield        #126 <Field float horizontalBias>
			constraint.verticalBias = verticalBias;
		//   84  168:aload_1         
		//   85  169:aload_0         
		//   86  170:getfield        #128 <Field float verticalBias>
		//   87  173:putfield        #128 <Field float verticalBias>
			constraint.dimensionRatio = dimensionRatio;
		//   88  176:aload_1         
		//   89  177:aload_0         
		//   90  178:getfield        #130 <Field String dimensionRatio>
		//   91  181:putfield        #130 <Field String dimensionRatio>
			constraint.editorAbsoluteX = editorAbsoluteX;
		//   92  184:aload_1         
		//   93  185:aload_0         
		//   94  186:getfield        #138 <Field int editorAbsoluteX>
		//   95  189:putfield        #138 <Field int editorAbsoluteX>
			constraint.editorAbsoluteY = editorAbsoluteY;
		//   96  192:aload_1         
		//   97  193:aload_0         
		//   98  194:getfield        #140 <Field int editorAbsoluteY>
		//   99  197:putfield        #140 <Field int editorAbsoluteY>
			constraint.horizontalBias = horizontalBias;
		//  100  200:aload_1         
		//  101  201:aload_0         
		//  102  202:getfield        #126 <Field float horizontalBias>
		//  103  205:putfield        #126 <Field float horizontalBias>
			constraint.horizontalBias = horizontalBias;
		//  104  208:aload_1         
		//  105  209:aload_0         
		//  106  210:getfield        #126 <Field float horizontalBias>
		//  107  213:putfield        #126 <Field float horizontalBias>
			constraint.horizontalBias = horizontalBias;
		//  108  216:aload_1         
		//  109  217:aload_0         
		//  110  218:getfield        #126 <Field float horizontalBias>
		//  111  221:putfield        #126 <Field float horizontalBias>
			constraint.horizontalBias = horizontalBias;
		//  112  224:aload_1         
		//  113  225:aload_0         
		//  114  226:getfield        #126 <Field float horizontalBias>
		//  115  229:putfield        #126 <Field float horizontalBias>
			constraint.horizontalBias = horizontalBias;
		//  116  232:aload_1         
		//  117  233:aload_0         
		//  118  234:getfield        #126 <Field float horizontalBias>
		//  119  237:putfield        #126 <Field float horizontalBias>
			constraint.orientation = orientation;
		//  120  240:aload_1         
		//  121  241:aload_0         
		//  122  242:getfield        #142 <Field int orientation>
		//  123  245:putfield        #142 <Field int orientation>
			constraint.leftMargin = leftMargin;
		//  124  248:aload_1         
		//  125  249:aload_0         
		//  126  250:getfield        #144 <Field int leftMargin>
		//  127  253:putfield        #144 <Field int leftMargin>
			constraint.rightMargin = rightMargin;
		//  128  256:aload_1         
		//  129  257:aload_0         
		//  130  258:getfield        #146 <Field int rightMargin>
		//  131  261:putfield        #146 <Field int rightMargin>
			constraint.topMargin = topMargin;
		//  132  264:aload_1         
		//  133  265:aload_0         
		//  134  266:getfield        #148 <Field int topMargin>
		//  135  269:putfield        #148 <Field int topMargin>
			constraint.bottomMargin = bottomMargin;
		//  136  272:aload_1         
		//  137  273:aload_0         
		//  138  274:getfield        #150 <Field int bottomMargin>
		//  139  277:putfield        #150 <Field int bottomMargin>
			constraint.endMargin = endMargin;
		//  140  280:aload_1         
		//  141  281:aload_0         
		//  142  282:getfield        #152 <Field int endMargin>
		//  143  285:putfield        #152 <Field int endMargin>
			constraint.startMargin = startMargin;
		//  144  288:aload_1         
		//  145  289:aload_0         
		//  146  290:getfield        #154 <Field int startMargin>
		//  147  293:putfield        #154 <Field int startMargin>
			constraint.visibility = visibility;
		//  148  296:aload_1         
		//  149  297:aload_0         
		//  150  298:getfield        #156 <Field int visibility>
		//  151  301:putfield        #156 <Field int visibility>
			constraint.goneLeftMargin = goneLeftMargin;
		//  152  304:aload_1         
		//  153  305:aload_0         
		//  154  306:getfield        #158 <Field int goneLeftMargin>
		//  155  309:putfield        #158 <Field int goneLeftMargin>
			constraint.goneTopMargin = goneTopMargin;
		//  156  312:aload_1         
		//  157  313:aload_0         
		//  158  314:getfield        #160 <Field int goneTopMargin>
		//  159  317:putfield        #160 <Field int goneTopMargin>
			constraint.goneRightMargin = goneRightMargin;
		//  160  320:aload_1         
		//  161  321:aload_0         
		//  162  322:getfield        #162 <Field int goneRightMargin>
		//  163  325:putfield        #162 <Field int goneRightMargin>
			constraint.goneBottomMargin = goneBottomMargin;
		//  164  328:aload_1         
		//  165  329:aload_0         
		//  166  330:getfield        #164 <Field int goneBottomMargin>
		//  167  333:putfield        #164 <Field int goneBottomMargin>
			constraint.goneEndMargin = goneEndMargin;
		//  168  336:aload_1         
		//  169  337:aload_0         
		//  170  338:getfield        #166 <Field int goneEndMargin>
		//  171  341:putfield        #166 <Field int goneEndMargin>
			constraint.goneStartMargin = goneStartMargin;
		//  172  344:aload_1         
		//  173  345:aload_0         
		//  174  346:getfield        #168 <Field int goneStartMargin>
		//  175  349:putfield        #168 <Field int goneStartMargin>
			constraint.verticalWeight = verticalWeight;
		//  176  352:aload_1         
		//  177  353:aload_0         
		//  178  354:getfield        #170 <Field float verticalWeight>
		//  179  357:putfield        #170 <Field float verticalWeight>
			constraint.horizontalWeight = horizontalWeight;
		//  180  360:aload_1         
		//  181  361:aload_0         
		//  182  362:getfield        #172 <Field float horizontalWeight>
		//  183  365:putfield        #172 <Field float horizontalWeight>
			constraint.horizontalChainStyle = horizontalChainStyle;
		//  184  368:aload_1         
		//  185  369:aload_0         
		//  186  370:getfield        #174 <Field int horizontalChainStyle>
		//  187  373:putfield        #174 <Field int horizontalChainStyle>
			constraint.verticalChainStyle = verticalChainStyle;
		//  188  376:aload_1         
		//  189  377:aload_0         
		//  190  378:getfield        #176 <Field int verticalChainStyle>
		//  191  381:putfield        #176 <Field int verticalChainStyle>
			constraint.alpha = alpha;
		//  192  384:aload_1         
		//  193  385:aload_0         
		//  194  386:getfield        #178 <Field float alpha>
		//  195  389:putfield        #178 <Field float alpha>
			constraint.applyElevation = applyElevation;
		//  196  392:aload_1         
		//  197  393:aload_0         
		//  198  394:getfield        #180 <Field boolean applyElevation>
		//  199  397:putfield        #180 <Field boolean applyElevation>
			constraint.elevation = elevation;
		//  200  400:aload_1         
		//  201  401:aload_0         
		//  202  402:getfield        #182 <Field float elevation>
		//  203  405:putfield        #182 <Field float elevation>
			constraint.rotation = rotation;
		//  204  408:aload_1         
		//  205  409:aload_0         
		//  206  410:getfield        #184 <Field float rotation>
		//  207  413:putfield        #184 <Field float rotation>
			constraint.rotationX = rotationX;
		//  208  416:aload_1         
		//  209  417:aload_0         
		//  210  418:getfield        #186 <Field float rotationX>
		//  211  421:putfield        #186 <Field float rotationX>
			constraint.rotationY = rotationY;
		//  212  424:aload_1         
		//  213  425:aload_0         
		//  214  426:getfield        #188 <Field float rotationY>
		//  215  429:putfield        #188 <Field float rotationY>
			constraint.scaleX = scaleX;
		//  216  432:aload_1         
		//  217  433:aload_0         
		//  218  434:getfield        #190 <Field float scaleX>
		//  219  437:putfield        #190 <Field float scaleX>
			constraint.scaleY = scaleY;
		//  220  440:aload_1         
		//  221  441:aload_0         
		//  222  442:getfield        #192 <Field float scaleY>
		//  223  445:putfield        #192 <Field float scaleY>
			constraint.transformPivotX = transformPivotX;
		//  224  448:aload_1         
		//  225  449:aload_0         
		//  226  450:getfield        #195 <Field float transformPivotX>
		//  227  453:putfield        #195 <Field float transformPivotX>
			constraint.transformPivotY = transformPivotY;
		//  228  456:aload_1         
		//  229  457:aload_0         
		//  230  458:getfield        #197 <Field float transformPivotY>
		//  231  461:putfield        #197 <Field float transformPivotY>
			constraint.translationX = translationX;
		//  232  464:aload_1         
		//  233  465:aload_0         
		//  234  466:getfield        #199 <Field float translationX>
		//  235  469:putfield        #199 <Field float translationX>
			constraint.translationY = translationY;
		//  236  472:aload_1         
		//  237  473:aload_0         
		//  238  474:getfield        #201 <Field float translationY>
		//  239  477:putfield        #201 <Field float translationY>
			constraint.translationZ = translationZ;
		//  240  480:aload_1         
		//  241  481:aload_0         
		//  242  482:getfield        #203 <Field float translationZ>
		//  243  485:putfield        #203 <Field float translationZ>
			constraint.constrainedWidth = constrainedWidth;
		//  244  488:aload_1         
		//  245  489:aload_0         
		//  246  490:getfield        #205 <Field boolean constrainedWidth>
		//  247  493:putfield        #205 <Field boolean constrainedWidth>
			constraint.constrainedHeight = constrainedHeight;
		//  248  496:aload_1         
		//  249  497:aload_0         
		//  250  498:getfield        #207 <Field boolean constrainedHeight>
		//  251  501:putfield        #207 <Field boolean constrainedHeight>
			constraint.widthDefault = widthDefault;
		//  252  504:aload_1         
		//  253  505:aload_0         
		//  254  506:getfield        #209 <Field int widthDefault>
		//  255  509:putfield        #209 <Field int widthDefault>
			constraint.heightDefault = heightDefault;
		//  256  512:aload_1         
		//  257  513:aload_0         
		//  258  514:getfield        #211 <Field int heightDefault>
		//  259  517:putfield        #211 <Field int heightDefault>
			constraint.widthMax = widthMax;
		//  260  520:aload_1         
		//  261  521:aload_0         
		//  262  522:getfield        #213 <Field int widthMax>
		//  263  525:putfield        #213 <Field int widthMax>
			constraint.heightMax = heightMax;
		//  264  528:aload_1         
		//  265  529:aload_0         
		//  266  530:getfield        #215 <Field int heightMax>
		//  267  533:putfield        #215 <Field int heightMax>
			constraint.widthMin = widthMin;
		//  268  536:aload_1         
		//  269  537:aload_0         
		//  270  538:getfield        #217 <Field int widthMin>
		//  271  541:putfield        #217 <Field int widthMin>
			constraint.heightMin = heightMin;
		//  272  544:aload_1         
		//  273  545:aload_0         
		//  274  546:getfield        #219 <Field int heightMin>
		//  275  549:putfield        #219 <Field int heightMin>
			constraint.widthPercent = widthPercent;
		//  276  552:aload_1         
		//  277  553:aload_0         
		//  278  554:getfield        #221 <Field float widthPercent>
		//  279  557:putfield        #221 <Field float widthPercent>
			constraint.heightPercent = heightPercent;
		//  280  560:aload_1         
		//  281  561:aload_0         
		//  282  562:getfield        #223 <Field float heightPercent>
		//  283  565:putfield        #223 <Field float heightPercent>
			constraint.mBarrierDirection = mBarrierDirection;
		//  284  568:aload_1         
		//  285  569:aload_0         
		//  286  570:getfield        #225 <Field int mBarrierDirection>
		//  287  573:putfield        #225 <Field int mBarrierDirection>
			constraint.mHelperType = mHelperType;
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
				constraint.mReferenceIds = Arrays.copyOf(ai, ai.length);
		//  297  593:aload_1         
		//  298  594:aload_2         
		//  299  595:aload_2         
		//  300  596:arraylength     
		//  301  597:invokestatic    #380 <Method int[] Arrays.copyOf(int[], int)>
		//  302  600:putfield        #358 <Field int[] mReferenceIds>
			constraint.circleConstraint = circleConstraint;
		//  303  603:aload_1         
		//  304  604:aload_0         
		//  305  605:getfield        #132 <Field int circleConstraint>
		//  306  608:putfield        #132 <Field int circleConstraint>
			constraint.circleRadius = circleRadius;
		//  307  611:aload_1         
		//  308  612:aload_0         
		//  309  613:getfield        #134 <Field int circleRadius>
		//  310  616:putfield        #134 <Field int circleRadius>
			constraint.circleAngle = circleAngle;
		//  311  619:aload_1         
		//  312  620:aload_0         
		//  313  621:getfield        #136 <Field float circleAngle>
		//  314  624:putfield        #136 <Field float circleAngle>
			return constraint;
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
		static void access$100(Constraint constraint, int i, ConstraintLayout.LayoutParams layoutparams)
		{
			constraint.fillFrom(i, layoutparams);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #236 <Method void fillFrom(int, ConstraintLayout$LayoutParams)>
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
		//    4    4:invokespecial   #242 <Method void fillFromConstraints(ConstraintHelper, int, Constraints$LayoutParams)>
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
		//    3    3:invokespecial   #247 <Method void fillFromConstraints(int, Constraints$LayoutParams)>
			return;
		//    4    6:return          
		}

*/

		private Constraint()
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

	}


	public ConstraintSet()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #240 <Method void Object()>
		mConstraints = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #242 <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #243 <Method void HashMap()>
	//    6   12:putfield        #245 <Field HashMap mConstraints>
	//    7   15:return          
	}

	private Constraint fillFromAttributeList(Context context, AttributeSet attributeset)
	{
		Constraint constraint = new Constraint();
	//    0    0:new             #8   <Class ConstraintSet$Constraint>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #250 <Method void ConstraintSet$Constraint(ConstraintSet$1)>
	//    4    8:astore_3        
		context = ((Context) (context.obtainStyledAttributes(attributeset, R.styleable.ConstraintSet)));
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:getstatic       #253 <Field int[] R$styleable.ConstraintSet>
	//    8   14:invokevirtual   #259 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//    9   17:astore_1        
		populateConstraint(constraint, ((TypedArray) (context)));
	//   10   18:aload_0         
	//   11   19:aload_3         
	//   12   20:aload_1         
	//   13   21:invokespecial   #263 <Method void populateConstraint(ConstraintSet$Constraint, TypedArray)>
		((TypedArray) (context)).recycle();
	//   14   24:aload_1         
	//   15   25:invokevirtual   #268 <Method void TypedArray.recycle()>
		return constraint;
	//   16   28:aload_3         
	//   17   29:areturn         
	}

	private Constraint get(int i)
	{
		if(!mConstraints.containsKey(((Object) (Integer.valueOf(i)))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #245 <Field HashMap mConstraints>
	//*   2    4:iload_1         
	//*   3    5:invokestatic    #276 <Method Integer Integer.valueOf(int)>
	//*   4    8:invokevirtual   #280 <Method boolean HashMap.containsKey(Object)>
	//*   5   11:ifne            34
			mConstraints.put(((Object) (Integer.valueOf(i))), ((Object) (new Constraint())));
	//    6   14:aload_0         
	//    7   15:getfield        #245 <Field HashMap mConstraints>
	//    8   18:iload_1         
	//    9   19:invokestatic    #276 <Method Integer Integer.valueOf(int)>
	//   10   22:new             #8   <Class ConstraintSet$Constraint>
	//   11   25:dup             
	//   12   26:aconst_null     
	//   13   27:invokespecial   #250 <Method void ConstraintSet$Constraint(ConstraintSet$1)>
	//   14   30:invokevirtual   #284 <Method Object HashMap.put(Object, Object)>
	//   15   33:pop             
		return (Constraint)mConstraints.get(((Object) (Integer.valueOf(i))));
	//   16   34:aload_0         
	//   17   35:getfield        #245 <Field HashMap mConstraints>
	//   18   38:iload_1         
	//   19   39:invokestatic    #276 <Method Integer Integer.valueOf(int)>
	//   20   42:invokevirtual   #287 <Method Object HashMap.get(Object)>
	//   21   45:checkcast       #8   <Class ConstraintSet$Constraint>
	//   22   48:areturn         
	}

	private static int lookupID(TypedArray typedarray, int i, int j)
	{
		int k = typedarray.getResourceId(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #293 <Method int TypedArray.getResourceId(int, int)>
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
	//   13   17:invokevirtual   #296 <Method int TypedArray.getInt(int, int)>
	//   14   20:istore_2        
		return j;
	//   15   21:iload_2         
	//   16   22:ireturn         
	}

	private void populateConstraint(Constraint constraint, TypedArray typedarray)
	{
		int j = typedarray.getIndexCount();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #300 <Method int TypedArray.getIndexCount()>
	//    2    4:istore          4
		for(int i = 0; i < j; i++)
	//*   3    6:iconst_0        
	//*   4    7:istore_3        
	//*   5    8:iload_3         
	//*   6    9:iload           4
	//*   7   11:icmpge          1416
		{
			int k = typedarray.getIndex(i);
	//    8   14:aload_2         
	//    9   15:iload_3         
	//   10   16:invokevirtual   #304 <Method int TypedArray.getIndex(int)>
	//   11   19:istore          5
			int l = mapToConstant.get(k);
	//   12   21:getstatic       #27  <Field SparseIntArray mapToConstant>
	//   13   24:iload           5
	//   14   26:invokevirtual   #306 <Method int SparseIntArray.get(int)>
	//   15   29:istore          6
			switch(l)
	//*  16   31:iload           6
			{
	//*  17   33:tableswitch     1 53: default 260
	//	               1 1395
	//	               2 1378
	//	               3 1361
	//	               4 1344
	//	               5 1331
	//	               6 1314
	//	               7 1297
	//	               8 1280
	//	               9 1263
	//	               10 1246
	//	               11 1229
	//	               12 1212
	//	               13 1195
	//	               14 1178
	//	               15 1161
	//	               16 1144
	//	               17 1127
	//	               18 1110
	//	               19 1093
	//	               20 1076
	//	               21 1059
	//	               22 1030
	//	               23 1013
	//	               24 996
	//	               25 979
	//	               26 962
	//	               27 945
	//	               28 928
	//	               29 911
	//	               30 894
	//	               31 877
	//	               32 860
	//	               33 843
	//	               34 826
	//	               35 809
	//	               36 792
	//	               37 775
	//	               38 758
	//	               39 741
	//	               40 724
	//	               41 707
	//	               42 690
	//	               43 673
	//	               44 651
	//	               45 634
	//	               46 617
	//	               47 600
	//	               48 583
	//	               49 566
	//	               50 549
	//	               51 532
	//	               52 515
	//	               53 498
			default:
				switch(l)
	//*  18  260:iload           6
				{
	//*  19  262:tableswitch     60 64: default 296
	//	               60 481
	//	               61 464
	//	               62 447
	//	               63 430
	//	               64 363
				default:
					StringBuilder stringbuilder = new StringBuilder();
	//   20  296:new             #308 <Class StringBuilder>
	//   21  299:dup             
	//   22  300:invokespecial   #309 <Method void StringBuilder()>
	//   23  303:astore          7
					stringbuilder.append("Unknown attribute 0x");
	//   24  305:aload           7
	//   25  307:ldc2            #311 <String "Unknown attribute 0x">
	//   26  310:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//   27  313:pop             
					stringbuilder.append(Integer.toHexString(k));
	//   28  314:aload           7
	//   29  316:iload           5
	//   30  318:invokestatic    #318 <Method String Integer.toHexString(int)>
	//   31  321:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//   32  324:pop             
					stringbuilder.append("   ");
	//   33  325:aload           7
	//   34  327:ldc2            #320 <String "   ">
	//   35  330:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//   36  333:pop             
					stringbuilder.append(mapToConstant.get(k));
	//   37  334:aload           7
	//   38  336:getstatic       #27  <Field SparseIntArray mapToConstant>
	//   39  339:iload           5
	//   40  341:invokevirtual   #306 <Method int SparseIntArray.get(int)>
	//   41  344:invokevirtual   #323 <Method StringBuilder StringBuilder.append(int)>
	//   42  347:pop             
					Log.w("ConstraintSet", stringbuilder.toString());
	//   43  348:ldc2            #324 <String "ConstraintSet">
	//   44  351:aload           7
	//   45  353:invokevirtual   #328 <Method String StringBuilder.toString()>
	//   46  356:invokestatic    #334 <Method int Log.w(String, String)>
	//   47  359:pop             
					break;

	//*  48  360:goto            1409
				case 64: // '@'
					StringBuilder stringbuilder1 = new StringBuilder();
	//   49  363:new             #308 <Class StringBuilder>
	//   50  366:dup             
	//   51  367:invokespecial   #309 <Method void StringBuilder()>
	//   52  370:astore          7
					stringbuilder1.append("unused attribute 0x");
	//   53  372:aload           7
	//   54  374:ldc2            #336 <String "unused attribute 0x">
	//   55  377:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//   56  380:pop             
					stringbuilder1.append(Integer.toHexString(k));
	//   57  381:aload           7
	//   58  383:iload           5
	//   59  385:invokestatic    #318 <Method String Integer.toHexString(int)>
	//   60  388:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//   61  391:pop             
					stringbuilder1.append("   ");
	//   62  392:aload           7
	//   63  394:ldc2            #320 <String "   ">
	//   64  397:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//   65  400:pop             
					stringbuilder1.append(mapToConstant.get(k));
	//   66  401:aload           7
	//   67  403:getstatic       #27  <Field SparseIntArray mapToConstant>
	//   68  406:iload           5
	//   69  408:invokevirtual   #306 <Method int SparseIntArray.get(int)>
	//   70  411:invokevirtual   #323 <Method StringBuilder StringBuilder.append(int)>
	//   71  414:pop             
					Log.w("ConstraintSet", stringbuilder1.toString());
	//   72  415:ldc2            #324 <String "ConstraintSet">
	//   73  418:aload           7
	//   74  420:invokevirtual   #328 <Method String StringBuilder.toString()>
	//   75  423:invokestatic    #334 <Method int Log.w(String, String)>
	//   76  426:pop             
					break;

	//*  77  427:goto            1409
				case 63: // '?'
					constraint.circleAngle = typedarray.getFloat(k, constraint.circleAngle);
	//   78  430:aload_1         
	//   79  431:aload_2         
	//   80  432:iload           5
	//   81  434:aload_1         
	//   82  435:getfield        #340 <Field float ConstraintSet$Constraint.circleAngle>
	//   83  438:invokevirtual   #344 <Method float TypedArray.getFloat(int, float)>
	//   84  441:putfield        #340 <Field float ConstraintSet$Constraint.circleAngle>
					break;

	//*  85  444:goto            1409
				case 62: // '>'
					constraint.circleRadius = typedarray.getDimensionPixelSize(k, constraint.circleRadius);
	//   86  447:aload_1         
	//   87  448:aload_2         
	//   88  449:iload           5
	//   89  451:aload_1         
	//   90  452:getfield        #347 <Field int ConstraintSet$Constraint.circleRadius>
	//   91  455:invokevirtual   #350 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   92  458:putfield        #347 <Field int ConstraintSet$Constraint.circleRadius>
					break;

	//*  93  461:goto            1409
				case 61: // '='
					constraint.circleConstraint = lookupID(typedarray, k, constraint.circleConstraint);
	//   94  464:aload_1         
	//   95  465:aload_2         
	//   96  466:iload           5
	//   97  468:aload_1         
	//   98  469:getfield        #353 <Field int ConstraintSet$Constraint.circleConstraint>
	//   99  472:invokestatic    #355 <Method int lookupID(TypedArray, int, int)>
	//  100  475:putfield        #353 <Field int ConstraintSet$Constraint.circleConstraint>
					break;

	//* 101  478:goto            1409
				case 60: // '<'
					constraint.rotation = typedarray.getFloat(k, constraint.rotation);
	//  102  481:aload_1         
	//  103  482:aload_2         
	//  104  483:iload           5
	//  105  485:aload_1         
	//  106  486:getfield        #358 <Field float ConstraintSet$Constraint.rotation>
	//  107  489:invokevirtual   #344 <Method float TypedArray.getFloat(int, float)>
	//  108  492:putfield        #358 <Field float ConstraintSet$Constraint.rotation>
					break;
				}
				break;

	//* 109  495:goto            1409
			case 53: // '5'
				constraint.translationZ = typedarray.getDimension(k, constraint.translationZ);
	//  110  498:aload_1         
	//  111  499:aload_2         
	//  112  500:iload           5
	//  113  502:aload_1         
	//  114  503:getfield        #361 <Field float ConstraintSet$Constraint.translationZ>
	//  115  506:invokevirtual   #364 <Method float TypedArray.getDimension(int, float)>
	//  116  509:putfield        #361 <Field float ConstraintSet$Constraint.translationZ>
				break;

	//* 117  512:goto            1409
			case 52: // '4'
				constraint.translationY = typedarray.getDimension(k, constraint.translationY);
	//  118  515:aload_1         
	//  119  516:aload_2         
	//  120  517:iload           5
	//  121  519:aload_1         
	//  122  520:getfield        #367 <Field float ConstraintSet$Constraint.translationY>
	//  123  523:invokevirtual   #364 <Method float TypedArray.getDimension(int, float)>
	//  124  526:putfield        #367 <Field float ConstraintSet$Constraint.translationY>
				break;

	//* 125  529:goto            1409
			case 51: // '3'
				constraint.translationX = typedarray.getDimension(k, constraint.translationX);
	//  126  532:aload_1         
	//  127  533:aload_2         
	//  128  534:iload           5
	//  129  536:aload_1         
	//  130  537:getfield        #370 <Field float ConstraintSet$Constraint.translationX>
	//  131  540:invokevirtual   #364 <Method float TypedArray.getDimension(int, float)>
	//  132  543:putfield        #370 <Field float ConstraintSet$Constraint.translationX>
				break;

	//* 133  546:goto            1409
			case 50: // '2'
				constraint.transformPivotY = typedarray.getFloat(k, constraint.transformPivotY);
	//  134  549:aload_1         
	//  135  550:aload_2         
	//  136  551:iload           5
	//  137  553:aload_1         
	//  138  554:getfield        #373 <Field float ConstraintSet$Constraint.transformPivotY>
	//  139  557:invokevirtual   #344 <Method float TypedArray.getFloat(int, float)>
	//  140  560:putfield        #373 <Field float ConstraintSet$Constraint.transformPivotY>
				break;

	//* 141  563:goto            1409
			case 49: // '1'
				constraint.transformPivotX = typedarray.getFloat(k, constraint.transformPivotX);
	//  142  566:aload_1         
	//  143  567:aload_2         
	//  144  568:iload           5
	//  145  570:aload_1         
	//  146  571:getfield        #376 <Field float ConstraintSet$Constraint.transformPivotX>
	//  147  574:invokevirtual   #344 <Method float TypedArray.getFloat(int, float)>
	//  148  577:putfield        #376 <Field float ConstraintSet$Constraint.transformPivotX>
				break;

	//* 149  580:goto            1409
			case 48: // '0'
				constraint.scaleY = typedarray.getFloat(k, constraint.scaleY);
	//  150  583:aload_1         
	//  151  584:aload_2         
	//  152  585:iload           5
	//  153  587:aload_1         
	//  154  588:getfield        #379 <Field float ConstraintSet$Constraint.scaleY>
	//  155  591:invokevirtual   #344 <Method float TypedArray.getFloat(int, float)>
	//  156  594:putfield        #379 <Field float ConstraintSet$Constraint.scaleY>
				break;

	//* 157  597:goto            1409
			case 47: // '/'
				constraint.scaleX = typedarray.getFloat(k, constraint.scaleX);
	//  158  600:aload_1         
	//  159  601:aload_2         
	//  160  602:iload           5
	//  161  604:aload_1         
	//  162  605:getfield        #382 <Field float ConstraintSet$Constraint.scaleX>
	//  163  608:invokevirtual   #344 <Method float TypedArray.getFloat(int, float)>
	//  164  611:putfield        #382 <Field float ConstraintSet$Constraint.scaleX>
				break;

	//* 165  614:goto            1409
			case 46: // '.'
				constraint.rotationY = typedarray.getFloat(k, constraint.rotationY);
	//  166  617:aload_1         
	//  167  618:aload_2         
	//  168  619:iload           5
	//  169  621:aload_1         
	//  170  622:getfield        #385 <Field float ConstraintSet$Constraint.rotationY>
	//  171  625:invokevirtual   #344 <Method float TypedArray.getFloat(int, float)>
	//  172  628:putfield        #385 <Field float ConstraintSet$Constraint.rotationY>
				break;

	//* 173  631:goto            1409
			case 45: // '-'
				constraint.rotationX = typedarray.getFloat(k, constraint.rotationX);
	//  174  634:aload_1         
	//  175  635:aload_2         
	//  176  636:iload           5
	//  177  638:aload_1         
	//  178  639:getfield        #388 <Field float ConstraintSet$Constraint.rotationX>
	//  179  642:invokevirtual   #344 <Method float TypedArray.getFloat(int, float)>
	//  180  645:putfield        #388 <Field float ConstraintSet$Constraint.rotationX>
				break;

	//* 181  648:goto            1409
			case 44: // ','
				constraint.applyElevation = true;
	//  182  651:aload_1         
	//  183  652:iconst_1        
	//  184  653:putfield        #392 <Field boolean ConstraintSet$Constraint.applyElevation>
				constraint.elevation = typedarray.getDimension(k, constraint.elevation);
	//  185  656:aload_1         
	//  186  657:aload_2         
	//  187  658:iload           5
	//  188  660:aload_1         
	//  189  661:getfield        #395 <Field float ConstraintSet$Constraint.elevation>
	//  190  664:invokevirtual   #364 <Method float TypedArray.getDimension(int, float)>
	//  191  667:putfield        #395 <Field float ConstraintSet$Constraint.elevation>
				break;

	//* 192  670:goto            1409
			case 43: // '+'
				constraint.alpha = typedarray.getFloat(k, constraint.alpha);
	//  193  673:aload_1         
	//  194  674:aload_2         
	//  195  675:iload           5
	//  196  677:aload_1         
	//  197  678:getfield        #398 <Field float ConstraintSet$Constraint.alpha>
	//  198  681:invokevirtual   #344 <Method float TypedArray.getFloat(int, float)>
	//  199  684:putfield        #398 <Field float ConstraintSet$Constraint.alpha>
				break;

	//* 200  687:goto            1409
			case 42: // '*'
				constraint.verticalChainStyle = typedarray.getInt(k, constraint.verticalChainStyle);
	//  201  690:aload_1         
	//  202  691:aload_2         
	//  203  692:iload           5
	//  204  694:aload_1         
	//  205  695:getfield        #401 <Field int ConstraintSet$Constraint.verticalChainStyle>
	//  206  698:invokevirtual   #296 <Method int TypedArray.getInt(int, int)>
	//  207  701:putfield        #401 <Field int ConstraintSet$Constraint.verticalChainStyle>
				break;

	//* 208  704:goto            1409
			case 41: // ')'
				constraint.horizontalChainStyle = typedarray.getInt(k, constraint.horizontalChainStyle);
	//  209  707:aload_1         
	//  210  708:aload_2         
	//  211  709:iload           5
	//  212  711:aload_1         
	//  213  712:getfield        #404 <Field int ConstraintSet$Constraint.horizontalChainStyle>
	//  214  715:invokevirtual   #296 <Method int TypedArray.getInt(int, int)>
	//  215  718:putfield        #404 <Field int ConstraintSet$Constraint.horizontalChainStyle>
				break;

	//* 216  721:goto            1409
			case 40: // '('
				constraint.verticalWeight = typedarray.getFloat(k, constraint.verticalWeight);
	//  217  724:aload_1         
	//  218  725:aload_2         
	//  219  726:iload           5
	//  220  728:aload_1         
	//  221  729:getfield        #407 <Field float ConstraintSet$Constraint.verticalWeight>
	//  222  732:invokevirtual   #344 <Method float TypedArray.getFloat(int, float)>
	//  223  735:putfield        #407 <Field float ConstraintSet$Constraint.verticalWeight>
				break;

	//* 224  738:goto            1409
			case 39: // '\''
				constraint.horizontalWeight = typedarray.getFloat(k, constraint.horizontalWeight);
	//  225  741:aload_1         
	//  226  742:aload_2         
	//  227  743:iload           5
	//  228  745:aload_1         
	//  229  746:getfield        #410 <Field float ConstraintSet$Constraint.horizontalWeight>
	//  230  749:invokevirtual   #344 <Method float TypedArray.getFloat(int, float)>
	//  231  752:putfield        #410 <Field float ConstraintSet$Constraint.horizontalWeight>
				break;

	//* 232  755:goto            1409
			case 38: // '&'
				constraint.mViewId = typedarray.getResourceId(k, constraint.mViewId);
	//  233  758:aload_1         
	//  234  759:aload_2         
	//  235  760:iload           5
	//  236  762:aload_1         
	//  237  763:getfield        #413 <Field int ConstraintSet$Constraint.mViewId>
	//  238  766:invokevirtual   #293 <Method int TypedArray.getResourceId(int, int)>
	//  239  769:putfield        #413 <Field int ConstraintSet$Constraint.mViewId>
				break;

	//* 240  772:goto            1409
			case 37: // '%'
				constraint.verticalBias = typedarray.getFloat(k, constraint.verticalBias);
	//  241  775:aload_1         
	//  242  776:aload_2         
	//  243  777:iload           5
	//  244  779:aload_1         
	//  245  780:getfield        #416 <Field float ConstraintSet$Constraint.verticalBias>
	//  246  783:invokevirtual   #344 <Method float TypedArray.getFloat(int, float)>
	//  247  786:putfield        #416 <Field float ConstraintSet$Constraint.verticalBias>
				break;

	//* 248  789:goto            1409
			case 36: // '$'
				constraint.topToTop = lookupID(typedarray, k, constraint.topToTop);
	//  249  792:aload_1         
	//  250  793:aload_2         
	//  251  794:iload           5
	//  252  796:aload_1         
	//  253  797:getfield        #419 <Field int ConstraintSet$Constraint.topToTop>
	//  254  800:invokestatic    #355 <Method int lookupID(TypedArray, int, int)>
	//  255  803:putfield        #419 <Field int ConstraintSet$Constraint.topToTop>
				break;

	//* 256  806:goto            1409
			case 35: // '#'
				constraint.topToBottom = lookupID(typedarray, k, constraint.topToBottom);
	//  257  809:aload_1         
	//  258  810:aload_2         
	//  259  811:iload           5
	//  260  813:aload_1         
	//  261  814:getfield        #422 <Field int ConstraintSet$Constraint.topToBottom>
	//  262  817:invokestatic    #355 <Method int lookupID(TypedArray, int, int)>
	//  263  820:putfield        #422 <Field int ConstraintSet$Constraint.topToBottom>
				break;

	//* 264  823:goto            1409
			case 34: // '"'
				constraint.topMargin = typedarray.getDimensionPixelSize(k, constraint.topMargin);
	//  265  826:aload_1         
	//  266  827:aload_2         
	//  267  828:iload           5
	//  268  830:aload_1         
	//  269  831:getfield        #425 <Field int ConstraintSet$Constraint.topMargin>
	//  270  834:invokevirtual   #350 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  271  837:putfield        #425 <Field int ConstraintSet$Constraint.topMargin>
				break;

	//* 272  840:goto            1409
			case 33: // '!'
				constraint.startToStart = lookupID(typedarray, k, constraint.startToStart);
	//  273  843:aload_1         
	//  274  844:aload_2         
	//  275  845:iload           5
	//  276  847:aload_1         
	//  277  848:getfield        #428 <Field int ConstraintSet$Constraint.startToStart>
	//  278  851:invokestatic    #355 <Method int lookupID(TypedArray, int, int)>
	//  279  854:putfield        #428 <Field int ConstraintSet$Constraint.startToStart>
				break;

	//* 280  857:goto            1409
			case 32: // ' '
				constraint.startToEnd = lookupID(typedarray, k, constraint.startToEnd);
	//  281  860:aload_1         
	//  282  861:aload_2         
	//  283  862:iload           5
	//  284  864:aload_1         
	//  285  865:getfield        #431 <Field int ConstraintSet$Constraint.startToEnd>
	//  286  868:invokestatic    #355 <Method int lookupID(TypedArray, int, int)>
	//  287  871:putfield        #431 <Field int ConstraintSet$Constraint.startToEnd>
				break;

	//* 288  874:goto            1409
			case 31: // '\037'
				constraint.startMargin = typedarray.getDimensionPixelSize(k, constraint.startMargin);
	//  289  877:aload_1         
	//  290  878:aload_2         
	//  291  879:iload           5
	//  292  881:aload_1         
	//  293  882:getfield        #434 <Field int ConstraintSet$Constraint.startMargin>
	//  294  885:invokevirtual   #350 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  295  888:putfield        #434 <Field int ConstraintSet$Constraint.startMargin>
				break;

	//* 296  891:goto            1409
			case 30: // '\036'
				constraint.rightToRight = lookupID(typedarray, k, constraint.rightToRight);
	//  297  894:aload_1         
	//  298  895:aload_2         
	//  299  896:iload           5
	//  300  898:aload_1         
	//  301  899:getfield        #437 <Field int ConstraintSet$Constraint.rightToRight>
	//  302  902:invokestatic    #355 <Method int lookupID(TypedArray, int, int)>
	//  303  905:putfield        #437 <Field int ConstraintSet$Constraint.rightToRight>
				break;

	//* 304  908:goto            1409
			case 29: // '\035'
				constraint.rightToLeft = lookupID(typedarray, k, constraint.rightToLeft);
	//  305  911:aload_1         
	//  306  912:aload_2         
	//  307  913:iload           5
	//  308  915:aload_1         
	//  309  916:getfield        #440 <Field int ConstraintSet$Constraint.rightToLeft>
	//  310  919:invokestatic    #355 <Method int lookupID(TypedArray, int, int)>
	//  311  922:putfield        #440 <Field int ConstraintSet$Constraint.rightToLeft>
				break;

	//* 312  925:goto            1409
			case 28: // '\034'
				constraint.rightMargin = typedarray.getDimensionPixelSize(k, constraint.rightMargin);
	//  313  928:aload_1         
	//  314  929:aload_2         
	//  315  930:iload           5
	//  316  932:aload_1         
	//  317  933:getfield        #443 <Field int ConstraintSet$Constraint.rightMargin>
	//  318  936:invokevirtual   #350 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  319  939:putfield        #443 <Field int ConstraintSet$Constraint.rightMargin>
				break;

	//* 320  942:goto            1409
			case 27: // '\033'
				constraint.orientation = typedarray.getInt(k, constraint.orientation);
	//  321  945:aload_1         
	//  322  946:aload_2         
	//  323  947:iload           5
	//  324  949:aload_1         
	//  325  950:getfield        #446 <Field int ConstraintSet$Constraint.orientation>
	//  326  953:invokevirtual   #296 <Method int TypedArray.getInt(int, int)>
	//  327  956:putfield        #446 <Field int ConstraintSet$Constraint.orientation>
				break;

	//* 328  959:goto            1409
			case 26: // '\032'
				constraint.leftToRight = lookupID(typedarray, k, constraint.leftToRight);
	//  329  962:aload_1         
	//  330  963:aload_2         
	//  331  964:iload           5
	//  332  966:aload_1         
	//  333  967:getfield        #449 <Field int ConstraintSet$Constraint.leftToRight>
	//  334  970:invokestatic    #355 <Method int lookupID(TypedArray, int, int)>
	//  335  973:putfield        #449 <Field int ConstraintSet$Constraint.leftToRight>
				break;

	//* 336  976:goto            1409
			case 25: // '\031'
				constraint.leftToLeft = lookupID(typedarray, k, constraint.leftToLeft);
	//  337  979:aload_1         
	//  338  980:aload_2         
	//  339  981:iload           5
	//  340  983:aload_1         
	//  341  984:getfield        #452 <Field int ConstraintSet$Constraint.leftToLeft>
	//  342  987:invokestatic    #355 <Method int lookupID(TypedArray, int, int)>
	//  343  990:putfield        #452 <Field int ConstraintSet$Constraint.leftToLeft>
				break;

	//* 344  993:goto            1409
			case 24: // '\030'
				constraint.leftMargin = typedarray.getDimensionPixelSize(k, constraint.leftMargin);
	//  345  996:aload_1         
	//  346  997:aload_2         
	//  347  998:iload           5
	//  348 1000:aload_1         
	//  349 1001:getfield        #455 <Field int ConstraintSet$Constraint.leftMargin>
	//  350 1004:invokevirtual   #350 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  351 1007:putfield        #455 <Field int ConstraintSet$Constraint.leftMargin>
				break;

	//* 352 1010:goto            1409
			case 23: // '\027'
				constraint.mWidth = typedarray.getLayoutDimension(k, constraint.mWidth);
	//  353 1013:aload_1         
	//  354 1014:aload_2         
	//  355 1015:iload           5
	//  356 1017:aload_1         
	//  357 1018:getfield        #458 <Field int ConstraintSet$Constraint.mWidth>
	//  358 1021:invokevirtual   #461 <Method int TypedArray.getLayoutDimension(int, int)>
	//  359 1024:putfield        #458 <Field int ConstraintSet$Constraint.mWidth>
				break;

	//* 360 1027:goto            1409
			case 22: // '\026'
				constraint.visibility = typedarray.getInt(k, constraint.visibility);
	//  361 1030:aload_1         
	//  362 1031:aload_2         
	//  363 1032:iload           5
	//  364 1034:aload_1         
	//  365 1035:getfield        #464 <Field int ConstraintSet$Constraint.visibility>
	//  366 1038:invokevirtual   #296 <Method int TypedArray.getInt(int, int)>
	//  367 1041:putfield        #464 <Field int ConstraintSet$Constraint.visibility>
				constraint.visibility = VISIBILITY_FLAGS[constraint.visibility];
	//  368 1044:aload_1         
	//  369 1045:getstatic       #20  <Field int[] VISIBILITY_FLAGS>
	//  370 1048:aload_1         
	//  371 1049:getfield        #464 <Field int ConstraintSet$Constraint.visibility>
	//  372 1052:iaload          
	//  373 1053:putfield        #464 <Field int ConstraintSet$Constraint.visibility>
				break;

	//* 374 1056:goto            1409
			case 21: // '\025'
				constraint.mHeight = typedarray.getLayoutDimension(k, constraint.mHeight);
	//  375 1059:aload_1         
	//  376 1060:aload_2         
	//  377 1061:iload           5
	//  378 1063:aload_1         
	//  379 1064:getfield        #467 <Field int ConstraintSet$Constraint.mHeight>
	//  380 1067:invokevirtual   #461 <Method int TypedArray.getLayoutDimension(int, int)>
	//  381 1070:putfield        #467 <Field int ConstraintSet$Constraint.mHeight>
				break;

	//* 382 1073:goto            1409
			case 20: // '\024'
				constraint.horizontalBias = typedarray.getFloat(k, constraint.horizontalBias);
	//  383 1076:aload_1         
	//  384 1077:aload_2         
	//  385 1078:iload           5
	//  386 1080:aload_1         
	//  387 1081:getfield        #470 <Field float ConstraintSet$Constraint.horizontalBias>
	//  388 1084:invokevirtual   #344 <Method float TypedArray.getFloat(int, float)>
	//  389 1087:putfield        #470 <Field float ConstraintSet$Constraint.horizontalBias>
				break;

	//* 390 1090:goto            1409
			case 19: // '\023'
				constraint.guidePercent = typedarray.getFloat(k, constraint.guidePercent);
	//  391 1093:aload_1         
	//  392 1094:aload_2         
	//  393 1095:iload           5
	//  394 1097:aload_1         
	//  395 1098:getfield        #473 <Field float ConstraintSet$Constraint.guidePercent>
	//  396 1101:invokevirtual   #344 <Method float TypedArray.getFloat(int, float)>
	//  397 1104:putfield        #473 <Field float ConstraintSet$Constraint.guidePercent>
				break;

	//* 398 1107:goto            1409
			case 18: // '\022'
				constraint.guideEnd = typedarray.getDimensionPixelOffset(k, constraint.guideEnd);
	//  399 1110:aload_1         
	//  400 1111:aload_2         
	//  401 1112:iload           5
	//  402 1114:aload_1         
	//  403 1115:getfield        #476 <Field int ConstraintSet$Constraint.guideEnd>
	//  404 1118:invokevirtual   #479 <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//  405 1121:putfield        #476 <Field int ConstraintSet$Constraint.guideEnd>
				break;

	//* 406 1124:goto            1409
			case 17: // '\021'
				constraint.guideBegin = typedarray.getDimensionPixelOffset(k, constraint.guideBegin);
	//  407 1127:aload_1         
	//  408 1128:aload_2         
	//  409 1129:iload           5
	//  410 1131:aload_1         
	//  411 1132:getfield        #482 <Field int ConstraintSet$Constraint.guideBegin>
	//  412 1135:invokevirtual   #479 <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//  413 1138:putfield        #482 <Field int ConstraintSet$Constraint.guideBegin>
				break;

	//* 414 1141:goto            1409
			case 16: // '\020'
				constraint.goneTopMargin = typedarray.getDimensionPixelSize(k, constraint.goneTopMargin);
	//  415 1144:aload_1         
	//  416 1145:aload_2         
	//  417 1146:iload           5
	//  418 1148:aload_1         
	//  419 1149:getfield        #485 <Field int ConstraintSet$Constraint.goneTopMargin>
	//  420 1152:invokevirtual   #350 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  421 1155:putfield        #485 <Field int ConstraintSet$Constraint.goneTopMargin>
				break;

	//* 422 1158:goto            1409
			case 15: // '\017'
				constraint.goneStartMargin = typedarray.getDimensionPixelSize(k, constraint.goneStartMargin);
	//  423 1161:aload_1         
	//  424 1162:aload_2         
	//  425 1163:iload           5
	//  426 1165:aload_1         
	//  427 1166:getfield        #488 <Field int ConstraintSet$Constraint.goneStartMargin>
	//  428 1169:invokevirtual   #350 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  429 1172:putfield        #488 <Field int ConstraintSet$Constraint.goneStartMargin>
				break;

	//* 430 1175:goto            1409
			case 14: // '\016'
				constraint.goneRightMargin = typedarray.getDimensionPixelSize(k, constraint.goneRightMargin);
	//  431 1178:aload_1         
	//  432 1179:aload_2         
	//  433 1180:iload           5
	//  434 1182:aload_1         
	//  435 1183:getfield        #491 <Field int ConstraintSet$Constraint.goneRightMargin>
	//  436 1186:invokevirtual   #350 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  437 1189:putfield        #491 <Field int ConstraintSet$Constraint.goneRightMargin>
				break;

	//* 438 1192:goto            1409
			case 13: // '\r'
				constraint.goneLeftMargin = typedarray.getDimensionPixelSize(k, constraint.goneLeftMargin);
	//  439 1195:aload_1         
	//  440 1196:aload_2         
	//  441 1197:iload           5
	//  442 1199:aload_1         
	//  443 1200:getfield        #494 <Field int ConstraintSet$Constraint.goneLeftMargin>
	//  444 1203:invokevirtual   #350 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  445 1206:putfield        #494 <Field int ConstraintSet$Constraint.goneLeftMargin>
				break;

	//* 446 1209:goto            1409
			case 12: // '\f'
				constraint.goneEndMargin = typedarray.getDimensionPixelSize(k, constraint.goneEndMargin);
	//  447 1212:aload_1         
	//  448 1213:aload_2         
	//  449 1214:iload           5
	//  450 1216:aload_1         
	//  451 1217:getfield        #497 <Field int ConstraintSet$Constraint.goneEndMargin>
	//  452 1220:invokevirtual   #350 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  453 1223:putfield        #497 <Field int ConstraintSet$Constraint.goneEndMargin>
				break;

	//* 454 1226:goto            1409
			case 11: // '\013'
				constraint.goneBottomMargin = typedarray.getDimensionPixelSize(k, constraint.goneBottomMargin);
	//  455 1229:aload_1         
	//  456 1230:aload_2         
	//  457 1231:iload           5
	//  458 1233:aload_1         
	//  459 1234:getfield        #500 <Field int ConstraintSet$Constraint.goneBottomMargin>
	//  460 1237:invokevirtual   #350 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  461 1240:putfield        #500 <Field int ConstraintSet$Constraint.goneBottomMargin>
				break;

	//* 462 1243:goto            1409
			case 10: // '\n'
				constraint.endToStart = lookupID(typedarray, k, constraint.endToStart);
	//  463 1246:aload_1         
	//  464 1247:aload_2         
	//  465 1248:iload           5
	//  466 1250:aload_1         
	//  467 1251:getfield        #503 <Field int ConstraintSet$Constraint.endToStart>
	//  468 1254:invokestatic    #355 <Method int lookupID(TypedArray, int, int)>
	//  469 1257:putfield        #503 <Field int ConstraintSet$Constraint.endToStart>
				break;

	//* 470 1260:goto            1409
			case 9: // '\t'
				constraint.endToEnd = lookupID(typedarray, k, constraint.endToEnd);
	//  471 1263:aload_1         
	//  472 1264:aload_2         
	//  473 1265:iload           5
	//  474 1267:aload_1         
	//  475 1268:getfield        #506 <Field int ConstraintSet$Constraint.endToEnd>
	//  476 1271:invokestatic    #355 <Method int lookupID(TypedArray, int, int)>
	//  477 1274:putfield        #506 <Field int ConstraintSet$Constraint.endToEnd>
				break;

	//* 478 1277:goto            1409
			case 8: // '\b'
				constraint.endMargin = typedarray.getDimensionPixelSize(k, constraint.endMargin);
	//  479 1280:aload_1         
	//  480 1281:aload_2         
	//  481 1282:iload           5
	//  482 1284:aload_1         
	//  483 1285:getfield        #509 <Field int ConstraintSet$Constraint.endMargin>
	//  484 1288:invokevirtual   #350 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  485 1291:putfield        #509 <Field int ConstraintSet$Constraint.endMargin>
				break;

	//* 486 1294:goto            1409
			case 7: // '\007'
				constraint.editorAbsoluteY = typedarray.getDimensionPixelOffset(k, constraint.editorAbsoluteY);
	//  487 1297:aload_1         
	//  488 1298:aload_2         
	//  489 1299:iload           5
	//  490 1301:aload_1         
	//  491 1302:getfield        #512 <Field int ConstraintSet$Constraint.editorAbsoluteY>
	//  492 1305:invokevirtual   #479 <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//  493 1308:putfield        #512 <Field int ConstraintSet$Constraint.editorAbsoluteY>
				break;

	//* 494 1311:goto            1409
			case 6: // '\006'
				constraint.editorAbsoluteX = typedarray.getDimensionPixelOffset(k, constraint.editorAbsoluteX);
	//  495 1314:aload_1         
	//  496 1315:aload_2         
	//  497 1316:iload           5
	//  498 1318:aload_1         
	//  499 1319:getfield        #515 <Field int ConstraintSet$Constraint.editorAbsoluteX>
	//  500 1322:invokevirtual   #479 <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//  501 1325:putfield        #515 <Field int ConstraintSet$Constraint.editorAbsoluteX>
				break;

	//* 502 1328:goto            1409
			case 5: // '\005'
				constraint.dimensionRatio = typedarray.getString(k);
	//  503 1331:aload_1         
	//  504 1332:aload_2         
	//  505 1333:iload           5
	//  506 1335:invokevirtual   #518 <Method String TypedArray.getString(int)>
	//  507 1338:putfield        #522 <Field String ConstraintSet$Constraint.dimensionRatio>
				break;

	//* 508 1341:goto            1409
			case 4: // '\004'
				constraint.bottomToTop = lookupID(typedarray, k, constraint.bottomToTop);
	//  509 1344:aload_1         
	//  510 1345:aload_2         
	//  511 1346:iload           5
	//  512 1348:aload_1         
	//  513 1349:getfield        #525 <Field int ConstraintSet$Constraint.bottomToTop>
	//  514 1352:invokestatic    #355 <Method int lookupID(TypedArray, int, int)>
	//  515 1355:putfield        #525 <Field int ConstraintSet$Constraint.bottomToTop>
				break;

	//* 516 1358:goto            1409
			case 3: // '\003'
				constraint.bottomToBottom = lookupID(typedarray, k, constraint.bottomToBottom);
	//  517 1361:aload_1         
	//  518 1362:aload_2         
	//  519 1363:iload           5
	//  520 1365:aload_1         
	//  521 1366:getfield        #528 <Field int ConstraintSet$Constraint.bottomToBottom>
	//  522 1369:invokestatic    #355 <Method int lookupID(TypedArray, int, int)>
	//  523 1372:putfield        #528 <Field int ConstraintSet$Constraint.bottomToBottom>
				break;

	//* 524 1375:goto            1409
			case 2: // '\002'
				constraint.bottomMargin = typedarray.getDimensionPixelSize(k, constraint.bottomMargin);
	//  525 1378:aload_1         
	//  526 1379:aload_2         
	//  527 1380:iload           5
	//  528 1382:aload_1         
	//  529 1383:getfield        #531 <Field int ConstraintSet$Constraint.bottomMargin>
	//  530 1386:invokevirtual   #350 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  531 1389:putfield        #531 <Field int ConstraintSet$Constraint.bottomMargin>
				break;

	//* 532 1392:goto            1409
			case 1: // '\001'
				constraint.baselineToBaseline = lookupID(typedarray, k, constraint.baselineToBaseline);
	//  533 1395:aload_1         
	//  534 1396:aload_2         
	//  535 1397:iload           5
	//  536 1399:aload_1         
	//  537 1400:getfield        #534 <Field int ConstraintSet$Constraint.baselineToBaseline>
	//  538 1403:invokestatic    #355 <Method int lookupID(TypedArray, int, int)>
	//  539 1406:putfield        #534 <Field int ConstraintSet$Constraint.baselineToBaseline>
				break;
			}
		}

	//  540 1409:iload_3         
	//  541 1410:iconst_1        
	//  542 1411:iadd            
	//  543 1412:istore_3        
	//* 544 1413:goto            8
	//  545 1416:return          
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
	//    2   44:ldc2            #537 <String "undefined">
	//    3   47:areturn         

		case 7: // '\007'
			return "end";
	//    4   48:ldc2            #539 <String "end">
	//    5   51:areturn         

		case 6: // '\006'
			return "start";
	//    6   52:ldc2            #541 <String "start">
	//    7   55:areturn         

		case 5: // '\005'
			return "baseline";
	//    8   56:ldc2            #543 <String "baseline">
	//    9   59:areturn         

		case 4: // '\004'
			return "bottom";
	//   10   60:ldc2            #545 <String "bottom">
	//   11   63:areturn         

		case 3: // '\003'
			return "top";
	//   12   64:ldc2            #547 <String "top">
	//   13   67:areturn         

		case 2: // '\002'
			return "right";
	//   14   68:ldc2            #549 <String "right">
	//   15   71:areturn         

		case 1: // '\001'
			return "left";
	//   16   72:ldc2            #551 <String "left">
	//   17   75:areturn         
		}
	}

	public void applyTo(ConstraintLayout constraintlayout)
	{
		applyToInternal(constraintlayout);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #556 <Method void applyToInternal(ConstraintLayout)>
		constraintlayout.setConstraintSet(((ConstraintSet) (null)));
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:invokevirtual   #562 <Method void ConstraintLayout.setConstraintSet(ConstraintSet)>
	//    6   10:return          
	}

	void applyToInternal(ConstraintLayout constraintlayout)
	{
		int j = constraintlayout.getChildCount();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #565 <Method int ConstraintLayout.getChildCount()>
	//    2    4:istore_3        
		Object obj = ((Object) (new HashSet(((java.util.Collection) (mConstraints.keySet())))));
	//    3    5:new             #567 <Class HashSet>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:getfield        #245 <Field HashMap mConstraints>
	//    7   13:invokevirtual   #571 <Method java.util.Set HashMap.keySet()>
	//    8   16:invokespecial   #574 <Method void HashSet(java.util.Collection)>
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
	//   17   30:invokevirtual   #578 <Method View ConstraintLayout.getChildAt(int)>
	//   18   33:astore          6
			int k = view.getId();
	//   19   35:aload           6
	//   20   37:invokevirtual   #583 <Method int View.getId()>
	//   21   40:istore          4
			if(k != -1)
	//*  22   42:iload           4
	//*  23   44:iconst_m1       
	//*  24   45:icmpeq          362
			{
				if(mConstraints.containsKey(((Object) (Integer.valueOf(k)))))
	//*  25   48:aload_0         
	//*  26   49:getfield        #245 <Field HashMap mConstraints>
	//*  27   52:iload           4
	//*  28   54:invokestatic    #276 <Method Integer Integer.valueOf(int)>
	//*  29   57:invokevirtual   #280 <Method boolean HashMap.containsKey(Object)>
	//*  30   60:ifeq            355
				{
					((HashSet) (obj)).remove(((Object) (Integer.valueOf(k))));
	//   31   63:aload           5
	//   32   65:iload           4
	//   33   67:invokestatic    #276 <Method Integer Integer.valueOf(int)>
	//   34   70:invokevirtual   #586 <Method boolean HashSet.remove(Object)>
	//   35   73:pop             
					Constraint constraint1 = (Constraint)mConstraints.get(((Object) (Integer.valueOf(k))));
	//   36   74:aload_0         
	//   37   75:getfield        #245 <Field HashMap mConstraints>
	//   38   78:iload           4
	//   39   80:invokestatic    #276 <Method Integer Integer.valueOf(int)>
	//   40   83:invokevirtual   #287 <Method Object HashMap.get(Object)>
	//   41   86:checkcast       #8   <Class ConstraintSet$Constraint>
	//   42   89:astore          7
					if(constraint1.mHelperType != -1 && constraint1.mHelperType == 1)
	//*  43   91:aload           7
	//*  44   93:getfield        #589 <Field int ConstraintSet$Constraint.mHelperType>
	//*  45   96:iconst_m1       
	//*  46   97:icmpeq          155
	//*  47  100:aload           7
	//*  48  102:getfield        #589 <Field int ConstraintSet$Constraint.mHelperType>
	//*  49  105:iconst_1        
	//*  50  106:icmpeq          112
	//*  51  109:goto            155
					{
						Barrier barrier = (Barrier)view;
	//   52  112:aload           6
	//   53  114:checkcast       #591 <Class Barrier>
	//   54  117:astore          8
						barrier.setId(k);
	//   55  119:aload           8
	//   56  121:iload           4
	//   57  123:invokevirtual   #595 <Method void Barrier.setId(int)>
						barrier.setReferencedIds(constraint1.mReferenceIds);
	//   58  126:aload           8
	//   59  128:aload           7
	//   60  130:getfield        #598 <Field int[] ConstraintSet$Constraint.mReferenceIds>
	//   61  133:invokevirtual   #602 <Method void Barrier.setReferencedIds(int[])>
						barrier.setType(constraint1.mBarrierDirection);
	//   62  136:aload           8
	//   63  138:aload           7
	//   64  140:getfield        #605 <Field int ConstraintSet$Constraint.mBarrierDirection>
	//   65  143:invokevirtual   #608 <Method void Barrier.setType(int)>
						constraint1.applyTo(constraintlayout.generateDefaultLayoutParams());
	//   66  146:aload           7
	//   67  148:aload_1         
	//   68  149:invokevirtual   #612 <Method ConstraintLayout$LayoutParams ConstraintLayout.generateDefaultLayoutParams()>
	//   69  152:invokevirtual   #615 <Method void ConstraintSet$Constraint.applyTo(ConstraintLayout$LayoutParams)>
					}
					ConstraintLayout.LayoutParams layoutparams = (ConstraintLayout.LayoutParams)view.getLayoutParams();
	//   70  155:aload           6
	//   71  157:invokevirtual   #619 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   72  160:checkcast       #621 <Class ConstraintLayout$LayoutParams>
	//   73  163:astore          8
					constraint1.applyTo(layoutparams);
	//   74  165:aload           7
	//   75  167:aload           8
	//   76  169:invokevirtual   #615 <Method void ConstraintSet$Constraint.applyTo(ConstraintLayout$LayoutParams)>
					view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   77  172:aload           6
	//   78  174:aload           8
	//   79  176:invokevirtual   #625 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
					view.setVisibility(constraint1.visibility);
	//   80  179:aload           6
	//   81  181:aload           7
	//   82  183:getfield        #464 <Field int ConstraintSet$Constraint.visibility>
	//   83  186:invokevirtual   #628 <Method void View.setVisibility(int)>
					if(android.os.Build.VERSION.SDK_INT >= 17)
	//*  84  189:getstatic       #633 <Field int android.os.Build$VERSION.SDK_INT>
	//*  85  192:bipush          17
	//*  86  194:icmplt          355
					{
						view.setAlpha(constraint1.alpha);
	//   87  197:aload           6
	//   88  199:aload           7
	//   89  201:getfield        #398 <Field float ConstraintSet$Constraint.alpha>
	//   90  204:invokevirtual   #637 <Method void View.setAlpha(float)>
						view.setRotation(constraint1.rotation);
	//   91  207:aload           6
	//   92  209:aload           7
	//   93  211:getfield        #358 <Field float ConstraintSet$Constraint.rotation>
	//   94  214:invokevirtual   #640 <Method void View.setRotation(float)>
						view.setRotationX(constraint1.rotationX);
	//   95  217:aload           6
	//   96  219:aload           7
	//   97  221:getfield        #388 <Field float ConstraintSet$Constraint.rotationX>
	//   98  224:invokevirtual   #643 <Method void View.setRotationX(float)>
						view.setRotationY(constraint1.rotationY);
	//   99  227:aload           6
	//  100  229:aload           7
	//  101  231:getfield        #385 <Field float ConstraintSet$Constraint.rotationY>
	//  102  234:invokevirtual   #646 <Method void View.setRotationY(float)>
						view.setScaleX(constraint1.scaleX);
	//  103  237:aload           6
	//  104  239:aload           7
	//  105  241:getfield        #382 <Field float ConstraintSet$Constraint.scaleX>
	//  106  244:invokevirtual   #649 <Method void View.setScaleX(float)>
						view.setScaleY(constraint1.scaleY);
	//  107  247:aload           6
	//  108  249:aload           7
	//  109  251:getfield        #379 <Field float ConstraintSet$Constraint.scaleY>
	//  110  254:invokevirtual   #652 <Method void View.setScaleY(float)>
						if(!Float.isNaN(constraint1.transformPivotX))
	//* 111  257:aload           7
	//* 112  259:getfield        #376 <Field float ConstraintSet$Constraint.transformPivotX>
	//* 113  262:invokestatic    #658 <Method boolean Float.isNaN(float)>
	//* 114  265:ifne            278
							view.setPivotX(constraint1.transformPivotX);
	//  115  268:aload           6
	//  116  270:aload           7
	//  117  272:getfield        #376 <Field float ConstraintSet$Constraint.transformPivotX>
	//  118  275:invokevirtual   #661 <Method void View.setPivotX(float)>
						if(!Float.isNaN(constraint1.transformPivotY))
	//* 119  278:aload           7
	//* 120  280:getfield        #373 <Field float ConstraintSet$Constraint.transformPivotY>
	//* 121  283:invokestatic    #658 <Method boolean Float.isNaN(float)>
	//* 122  286:ifne            299
							view.setPivotY(constraint1.transformPivotY);
	//  123  289:aload           6
	//  124  291:aload           7
	//  125  293:getfield        #373 <Field float ConstraintSet$Constraint.transformPivotY>
	//  126  296:invokevirtual   #664 <Method void View.setPivotY(float)>
						view.setTranslationX(constraint1.translationX);
	//  127  299:aload           6
	//  128  301:aload           7
	//  129  303:getfield        #370 <Field float ConstraintSet$Constraint.translationX>
	//  130  306:invokevirtual   #667 <Method void View.setTranslationX(float)>
						view.setTranslationY(constraint1.translationY);
	//  131  309:aload           6
	//  132  311:aload           7
	//  133  313:getfield        #367 <Field float ConstraintSet$Constraint.translationY>
	//  134  316:invokevirtual   #670 <Method void View.setTranslationY(float)>
						if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 135  319:getstatic       #633 <Field int android.os.Build$VERSION.SDK_INT>
	//* 136  322:bipush          21
	//* 137  324:icmplt          355
						{
							view.setTranslationZ(constraint1.translationZ);
	//  138  327:aload           6
	//  139  329:aload           7
	//  140  331:getfield        #361 <Field float ConstraintSet$Constraint.translationZ>
	//  141  334:invokevirtual   #673 <Method void View.setTranslationZ(float)>
							if(constraint1.applyElevation)
	//* 142  337:aload           7
	//* 143  339:getfield        #392 <Field boolean ConstraintSet$Constraint.applyElevation>
	//* 144  342:ifeq            355
								view.setElevation(constraint1.elevation);
	//  145  345:aload           6
	//  146  347:aload           7
	//  147  349:getfield        #395 <Field float ConstraintSet$Constraint.elevation>
	//  148  352:invokevirtual   #676 <Method void View.setElevation(float)>
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
	//  154  362:new             #678 <Class RuntimeException>
	//  155  365:dup             
	//  156  366:ldc2            #680 <String "All children of ConstraintLayout must have ids to use ConstraintSet">
	//  157  369:invokespecial   #683 <Method void RuntimeException(String)>
	//  158  372:athrow          
			}
		}

		obj = ((Object) (((HashSet) (obj)).iterator()));
	//  159  373:aload           5
	//  160  375:invokevirtual   #687 <Method Iterator HashSet.iterator()>
	//  161  378:astore          5
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//  162  380:aload           5
	//  163  382:invokeinterface #693 <Method boolean Iterator.hasNext()>
	//  164  387:ifeq            556
			Object obj1 = ((Object) ((Integer)((Iterator) (obj)).next()));
	//  165  390:aload           5
	//  166  392:invokeinterface #697 <Method Object Iterator.next()>
	//  167  397:checkcast       #272 <Class Integer>
	//  168  400:astore          7
			Constraint constraint = (Constraint)mConstraints.get(obj1);
	//  169  402:aload_0         
	//  170  403:getfield        #245 <Field HashMap mConstraints>
	//  171  406:aload           7
	//  172  408:invokevirtual   #287 <Method Object HashMap.get(Object)>
	//  173  411:checkcast       #8   <Class ConstraintSet$Constraint>
	//  174  414:astore          6
			if(constraint.mHelperType != -1 && constraint.mHelperType == 1)
	//* 175  416:aload           6
	//* 176  418:getfield        #589 <Field int ConstraintSet$Constraint.mHelperType>
	//* 177  421:iconst_m1       
	//* 178  422:icmpeq          501
	//* 179  425:aload           6
	//* 180  427:getfield        #589 <Field int ConstraintSet$Constraint.mHelperType>
	//* 181  430:iconst_1        
	//* 182  431:icmpeq          437
	//* 183  434:goto            501
			{
				Barrier barrier1 = new Barrier(constraintlayout.getContext());
	//  184  437:new             #591 <Class Barrier>
	//  185  440:dup             
	//  186  441:aload_1         
	//  187  442:invokevirtual   #701 <Method Context ConstraintLayout.getContext()>
	//  188  445:invokespecial   #704 <Method void Barrier(Context)>
	//  189  448:astore          8
				barrier1.setId(((Integer) (obj1)).intValue());
	//  190  450:aload           8
	//  191  452:aload           7
	//  192  454:invokevirtual   #707 <Method int Integer.intValue()>
	//  193  457:invokevirtual   #595 <Method void Barrier.setId(int)>
				barrier1.setReferencedIds(constraint.mReferenceIds);
	//  194  460:aload           8
	//  195  462:aload           6
	//  196  464:getfield        #598 <Field int[] ConstraintSet$Constraint.mReferenceIds>
	//  197  467:invokevirtual   #602 <Method void Barrier.setReferencedIds(int[])>
				barrier1.setType(constraint.mBarrierDirection);
	//  198  470:aload           8
	//  199  472:aload           6
	//  200  474:getfield        #605 <Field int ConstraintSet$Constraint.mBarrierDirection>
	//  201  477:invokevirtual   #608 <Method void Barrier.setType(int)>
				ConstraintLayout.LayoutParams layoutparams1 = constraintlayout.generateDefaultLayoutParams();
	//  202  480:aload_1         
	//  203  481:invokevirtual   #612 <Method ConstraintLayout$LayoutParams ConstraintLayout.generateDefaultLayoutParams()>
	//  204  484:astore          9
				constraint.applyTo(layoutparams1);
	//  205  486:aload           6
	//  206  488:aload           9
	//  207  490:invokevirtual   #615 <Method void ConstraintSet$Constraint.applyTo(ConstraintLayout$LayoutParams)>
				constraintlayout.addView(((View) (barrier1)), ((android.view.ViewGroup.LayoutParams) (layoutparams1)));
	//  208  493:aload_1         
	//  209  494:aload           8
	//  210  496:aload           9
	//  211  498:invokevirtual   #711 <Method void ConstraintLayout.addView(View, android.view.ViewGroup$LayoutParams)>
			}
			if(constraint.mIsGuideline)
	//* 212  501:aload           6
	//* 213  503:getfield        #714 <Field boolean ConstraintSet$Constraint.mIsGuideline>
	//* 214  506:ifeq            380
			{
				Guideline guideline = new Guideline(constraintlayout.getContext());
	//  215  509:new             #716 <Class Guideline>
	//  216  512:dup             
	//  217  513:aload_1         
	//  218  514:invokevirtual   #701 <Method Context ConstraintLayout.getContext()>
	//  219  517:invokespecial   #717 <Method void Guideline(Context)>
	//  220  520:astore          8
				guideline.setId(((Integer) (obj1)).intValue());
	//  221  522:aload           8
	//  222  524:aload           7
	//  223  526:invokevirtual   #707 <Method int Integer.intValue()>
	//  224  529:invokevirtual   #718 <Method void Guideline.setId(int)>
				obj1 = ((Object) (constraintlayout.generateDefaultLayoutParams()));
	//  225  532:aload_1         
	//  226  533:invokevirtual   #612 <Method ConstraintLayout$LayoutParams ConstraintLayout.generateDefaultLayoutParams()>
	//  227  536:astore          7
				constraint.applyTo(((ConstraintLayout.LayoutParams) (obj1)));
	//  228  538:aload           6
	//  229  540:aload           7
	//  230  542:invokevirtual   #615 <Method void ConstraintSet$Constraint.applyTo(ConstraintLayout$LayoutParams)>
				constraintlayout.addView(((View) (guideline)), ((android.view.ViewGroup.LayoutParams) (obj1)));
	//  231  545:aload_1         
	//  232  546:aload           8
	//  233  548:aload           7
	//  234  550:invokevirtual   #711 <Method void ConstraintLayout.addView(View, android.view.ViewGroup$LayoutParams)>
			}
		} while(true);
	//  235  553:goto            380
	//  236  556:return          
	}

	public void clone(ConstraintLayout constraintlayout)
	{
		int j = constraintlayout.getChildCount();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #565 <Method int ConstraintLayout.getChildCount()>
	//    2    4:istore          5
		mConstraints.clear();
	//    3    6:aload_0         
	//    4    7:getfield        #245 <Field HashMap mConstraints>
	//    5   10:invokevirtual   #722 <Method void HashMap.clear()>
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
	//   13   26:invokevirtual   #578 <Method View ConstraintLayout.getChildAt(int)>
	//   14   29:astore          7
			ConstraintLayout.LayoutParams layoutparams = (ConstraintLayout.LayoutParams)view.getLayoutParams();
	//   15   31:aload           7
	//   16   33:invokevirtual   #619 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   17   36:checkcast       #621 <Class ConstraintLayout$LayoutParams>
	//   18   39:astore          8
			int k = view.getId();
	//   19   41:aload           7
	//   20   43:invokevirtual   #583 <Method int View.getId()>
	//   21   46:istore          6
			if(k != -1)
	//*  22   48:iload           6
	//*  23   50:iconst_m1       
	//*  24   51:icmpeq          297
			{
				if(!mConstraints.containsKey(((Object) (Integer.valueOf(k)))))
	//*  25   54:aload_0         
	//*  26   55:getfield        #245 <Field HashMap mConstraints>
	//*  27   58:iload           6
	//*  28   60:invokestatic    #276 <Method Integer Integer.valueOf(int)>
	//*  29   63:invokevirtual   #280 <Method boolean HashMap.containsKey(Object)>
	//*  30   66:ifne            90
					mConstraints.put(((Object) (Integer.valueOf(k))), ((Object) (new Constraint())));
	//   31   69:aload_0         
	//   32   70:getfield        #245 <Field HashMap mConstraints>
	//   33   73:iload           6
	//   34   75:invokestatic    #276 <Method Integer Integer.valueOf(int)>
	//   35   78:new             #8   <Class ConstraintSet$Constraint>
	//   36   81:dup             
	//   37   82:aconst_null     
	//   38   83:invokespecial   #250 <Method void ConstraintSet$Constraint(ConstraintSet$1)>
	//   39   86:invokevirtual   #284 <Method Object HashMap.put(Object, Object)>
	//   40   89:pop             
				Constraint constraint = (Constraint)mConstraints.get(((Object) (Integer.valueOf(k))));
	//   41   90:aload_0         
	//   42   91:getfield        #245 <Field HashMap mConstraints>
	//   43   94:iload           6
	//   44   96:invokestatic    #276 <Method Integer Integer.valueOf(int)>
	//   45   99:invokevirtual   #287 <Method Object HashMap.get(Object)>
	//   46  102:checkcast       #8   <Class ConstraintSet$Constraint>
	//   47  105:astore          9
				constraint.fillFrom(k, layoutparams);
	//   48  107:aload           9
	//   49  109:iload           6
	//   50  111:aload           8
	//   51  113:invokestatic    #726 <Method void ConstraintSet$Constraint.access$100(ConstraintSet$Constraint, int, ConstraintLayout$LayoutParams)>
				constraint.visibility = view.getVisibility();
	//   52  116:aload           9
	//   53  118:aload           7
	//   54  120:invokevirtual   #729 <Method int View.getVisibility()>
	//   55  123:putfield        #464 <Field int ConstraintSet$Constraint.visibility>
				if(android.os.Build.VERSION.SDK_INT >= 17)
	//*  56  126:getstatic       #633 <Field int android.os.Build$VERSION.SDK_INT>
	//*  57  129:bipush          17
	//*  58  131:icmplt          288
				{
					constraint.alpha = view.getAlpha();
	//   59  134:aload           9
	//   60  136:aload           7
	//   61  138:invokevirtual   #733 <Method float View.getAlpha()>
	//   62  141:putfield        #398 <Field float ConstraintSet$Constraint.alpha>
					constraint.rotation = view.getRotation();
	//   63  144:aload           9
	//   64  146:aload           7
	//   65  148:invokevirtual   #736 <Method float View.getRotation()>
	//   66  151:putfield        #358 <Field float ConstraintSet$Constraint.rotation>
					constraint.rotationX = view.getRotationX();
	//   67  154:aload           9
	//   68  156:aload           7
	//   69  158:invokevirtual   #739 <Method float View.getRotationX()>
	//   70  161:putfield        #388 <Field float ConstraintSet$Constraint.rotationX>
					constraint.rotationY = view.getRotationY();
	//   71  164:aload           9
	//   72  166:aload           7
	//   73  168:invokevirtual   #742 <Method float View.getRotationY()>
	//   74  171:putfield        #385 <Field float ConstraintSet$Constraint.rotationY>
					constraint.scaleX = view.getScaleX();
	//   75  174:aload           9
	//   76  176:aload           7
	//   77  178:invokevirtual   #745 <Method float View.getScaleX()>
	//   78  181:putfield        #382 <Field float ConstraintSet$Constraint.scaleX>
					constraint.scaleY = view.getScaleY();
	//   79  184:aload           9
	//   80  186:aload           7
	//   81  188:invokevirtual   #748 <Method float View.getScaleY()>
	//   82  191:putfield        #379 <Field float ConstraintSet$Constraint.scaleY>
					float f = view.getPivotX();
	//   83  194:aload           7
	//   84  196:invokevirtual   #751 <Method float View.getPivotX()>
	//   85  199:fstore_2        
					float f1 = view.getPivotY();
	//   86  200:aload           7
	//   87  202:invokevirtual   #754 <Method float View.getPivotY()>
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
	//  101  223:putfield        #376 <Field float ConstraintSet$Constraint.transformPivotX>
						constraint.transformPivotY = f1;
	//  102  226:aload           9
	//  103  228:fload_3         
	//  104  229:putfield        #373 <Field float ConstraintSet$Constraint.transformPivotY>
					}
					constraint.translationX = view.getTranslationX();
	//  105  232:aload           9
	//  106  234:aload           7
	//  107  236:invokevirtual   #757 <Method float View.getTranslationX()>
	//  108  239:putfield        #370 <Field float ConstraintSet$Constraint.translationX>
					constraint.translationY = view.getTranslationY();
	//  109  242:aload           9
	//  110  244:aload           7
	//  111  246:invokevirtual   #760 <Method float View.getTranslationY()>
	//  112  249:putfield        #367 <Field float ConstraintSet$Constraint.translationY>
					if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 113  252:getstatic       #633 <Field int android.os.Build$VERSION.SDK_INT>
	//* 114  255:bipush          21
	//* 115  257:icmplt          288
					{
						constraint.translationZ = view.getTranslationZ();
	//  116  260:aload           9
	//  117  262:aload           7
	//  118  264:invokevirtual   #763 <Method float View.getTranslationZ()>
	//  119  267:putfield        #361 <Field float ConstraintSet$Constraint.translationZ>
						if(constraint.applyElevation)
	//* 120  270:aload           9
	//* 121  272:getfield        #392 <Field boolean ConstraintSet$Constraint.applyElevation>
	//* 122  275:ifeq            288
							constraint.elevation = view.getElevation();
	//  123  278:aload           9
	//  124  280:aload           7
	//  125  282:invokevirtual   #766 <Method float View.getElevation()>
	//  126  285:putfield        #395 <Field float ConstraintSet$Constraint.elevation>
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
	//  132  297:new             #678 <Class RuntimeException>
	//  133  300:dup             
	//  134  301:ldc2            #680 <String "All children of ConstraintLayout must have ids to use ConstraintSet">
	//  135  304:invokespecial   #683 <Method void RuntimeException(String)>
	//  136  307:athrow          
			}
		}

	//  137  308:return          
	}

	public void clone(Constraints constraints)
	{
		int j = constraints.getChildCount();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #770 <Method int Constraints.getChildCount()>
	//    2    4:istore_3        
		mConstraints.clear();
	//    3    5:aload_0         
	//    4    6:getfield        #245 <Field HashMap mConstraints>
	//    5    9:invokevirtual   #722 <Method void HashMap.clear()>
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
	//   13   21:invokevirtual   #771 <Method View Constraints.getChildAt(int)>
	//   14   24:astore          5
			Constraints.LayoutParams layoutparams = (Constraints.LayoutParams)view.getLayoutParams();
	//   15   26:aload           5
	//   16   28:invokevirtual   #619 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   17   31:checkcast       #773 <Class Constraints$LayoutParams>
	//   18   34:astore          6
			int k = view.getId();
	//   19   36:aload           5
	//   20   38:invokevirtual   #583 <Method int View.getId()>
	//   21   41:istore          4
			if(k != -1)
	//*  22   43:iload           4
	//*  23   45:iconst_m1       
	//*  24   46:icmpeq          140
			{
				if(!mConstraints.containsKey(((Object) (Integer.valueOf(k)))))
	//*  25   49:aload_0         
	//*  26   50:getfield        #245 <Field HashMap mConstraints>
	//*  27   53:iload           4
	//*  28   55:invokestatic    #276 <Method Integer Integer.valueOf(int)>
	//*  29   58:invokevirtual   #280 <Method boolean HashMap.containsKey(Object)>
	//*  30   61:ifne            85
					mConstraints.put(((Object) (Integer.valueOf(k))), ((Object) (new Constraint())));
	//   31   64:aload_0         
	//   32   65:getfield        #245 <Field HashMap mConstraints>
	//   33   68:iload           4
	//   34   70:invokestatic    #276 <Method Integer Integer.valueOf(int)>
	//   35   73:new             #8   <Class ConstraintSet$Constraint>
	//   36   76:dup             
	//   37   77:aconst_null     
	//   38   78:invokespecial   #250 <Method void ConstraintSet$Constraint(ConstraintSet$1)>
	//   39   81:invokevirtual   #284 <Method Object HashMap.put(Object, Object)>
	//   40   84:pop             
				Constraint constraint = (Constraint)mConstraints.get(((Object) (Integer.valueOf(k))));
	//   41   85:aload_0         
	//   42   86:getfield        #245 <Field HashMap mConstraints>
	//   43   89:iload           4
	//   44   91:invokestatic    #276 <Method Integer Integer.valueOf(int)>
	//   45   94:invokevirtual   #287 <Method Object HashMap.get(Object)>
	//   46   97:checkcast       #8   <Class ConstraintSet$Constraint>
	//   47  100:astore          7
				if(view instanceof ConstraintHelper)
	//*  48  102:aload           5
	//*  49  104:instanceof      #775 <Class ConstraintHelper>
	//*  50  107:ifeq            124
					constraint.fillFromConstraints((ConstraintHelper)view, k, layoutparams);
	//   51  110:aload           7
	//   52  112:aload           5
	//   53  114:checkcast       #775 <Class ConstraintHelper>
	//   54  117:iload           4
	//   55  119:aload           6
	//   56  121:invokestatic    #779 <Method void ConstraintSet$Constraint.access$200(ConstraintSet$Constraint, ConstraintHelper, int, Constraints$LayoutParams)>
				constraint.fillFromConstraints(k, layoutparams);
	//   57  124:aload           7
	//   58  126:iload           4
	//   59  128:aload           6
	//   60  130:invokestatic    #783 <Method void ConstraintSet$Constraint.access$300(ConstraintSet$Constraint, int, Constraints$LayoutParams)>
				i++;
	//   61  133:iload_2         
	//   62  134:iconst_1        
	//   63  135:iadd            
	//   64  136:istore_2        
			} else
	//*  65  137:goto            14
			{
				throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
	//   66  140:new             #678 <Class RuntimeException>
	//   67  143:dup             
	//   68  144:ldc2            #680 <String "All children of ConstraintLayout must have ids to use ConstraintSet">
	//   69  147:invokespecial   #683 <Method void RuntimeException(String)>
	//   70  150:athrow          
			}
		}

	//   71  151:return          
	}

	public void connect(int i, int j, int k, int l)
	{
		if(!mConstraints.containsKey(((Object) (Integer.valueOf(i)))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #245 <Field HashMap mConstraints>
	//*   2    4:iload_1         
	//*   3    5:invokestatic    #276 <Method Integer Integer.valueOf(int)>
	//*   4    8:invokevirtual   #280 <Method boolean HashMap.containsKey(Object)>
	//*   5   11:ifne            34
			mConstraints.put(((Object) (Integer.valueOf(i))), ((Object) (new Constraint())));
	//    6   14:aload_0         
	//    7   15:getfield        #245 <Field HashMap mConstraints>
	//    8   18:iload_1         
	//    9   19:invokestatic    #276 <Method Integer Integer.valueOf(int)>
	//   10   22:new             #8   <Class ConstraintSet$Constraint>
	//   11   25:dup             
	//   12   26:aconst_null     
	//   13   27:invokespecial   #250 <Method void ConstraintSet$Constraint(ConstraintSet$1)>
	//   14   30:invokevirtual   #284 <Method Object HashMap.put(Object, Object)>
	//   15   33:pop             
		Object obj = ((Object) ((Constraint)mConstraints.get(((Object) (Integer.valueOf(i))))));
	//   16   34:aload_0         
	//   17   35:getfield        #245 <Field HashMap mConstraints>
	//   18   38:iload_1         
	//   19   39:invokestatic    #276 <Method Integer Integer.valueOf(int)>
	//   20   42:invokevirtual   #287 <Method Object HashMap.get(Object)>
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
	//   25   92:new             #308 <Class StringBuilder>
	//   26   95:dup             
	//   27   96:invokespecial   #309 <Method void StringBuilder()>
	//   28   99:astore          5
			((StringBuilder) (obj)).append(sideToString(j));
	//   29  101:aload           5
	//   30  103:aload_0         
	//   31  104:iload_2         
	//   32  105:invokespecial   #787 <Method String sideToString(int)>
	//   33  108:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//   34  111:pop             
			((StringBuilder) (obj)).append(" to ");
	//   35  112:aload           5
	//   36  114:ldc2            #789 <String " to ">
	//   37  117:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//   38  120:pop             
			((StringBuilder) (obj)).append(sideToString(l));
	//   39  121:aload           5
	//   40  123:aload_0         
	//   41  124:iload           4
	//   42  126:invokespecial   #787 <Method String sideToString(int)>
	//   43  129:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//   44  132:pop             
			((StringBuilder) (obj)).append(" unknown");
	//   45  133:aload           5
	//   46  135:ldc2            #791 <String " unknown">
	//   47  138:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//   48  141:pop             
			throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   49  142:new             #793 <Class IllegalArgumentException>
	//   50  145:dup             
	//   51  146:aload           5
	//   52  148:invokevirtual   #328 <Method String StringBuilder.toString()>
	//   53  151:invokespecial   #794 <Method void IllegalArgumentException(String)>
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
	//   60  165:putfield        #506 <Field int ConstraintSet$Constraint.endToEnd>
				obj.endToStart = -1;
	//   61  168:aload           5
	//   62  170:iconst_m1       
	//   63  171:putfield        #503 <Field int ConstraintSet$Constraint.endToStart>
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
	//   70  185:putfield        #503 <Field int ConstraintSet$Constraint.endToStart>
				obj.endToEnd = -1;
	//   71  188:aload           5
	//   72  190:iconst_m1       
	//   73  191:putfield        #506 <Field int ConstraintSet$Constraint.endToEnd>
				return;
	//   74  194:return          
			} else
			{
				obj = ((Object) (new StringBuilder()));
	//   75  195:new             #308 <Class StringBuilder>
	//   76  198:dup             
	//   77  199:invokespecial   #309 <Method void StringBuilder()>
	//   78  202:astore          5
				((StringBuilder) (obj)).append("right to ");
	//   79  204:aload           5
	//   80  206:ldc2            #796 <String "right to ">
	//   81  209:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//   82  212:pop             
				((StringBuilder) (obj)).append(sideToString(l));
	//   83  213:aload           5
	//   84  215:aload_0         
	//   85  216:iload           4
	//   86  218:invokespecial   #787 <Method String sideToString(int)>
	//   87  221:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//   88  224:pop             
				((StringBuilder) (obj)).append(" undefined");
	//   89  225:aload           5
	//   90  227:ldc2            #798 <String " undefined">
	//   91  230:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//   92  233:pop             
				throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   93  234:new             #793 <Class IllegalArgumentException>
	//   94  237:dup             
	//   95  238:aload           5
	//   96  240:invokevirtual   #328 <Method String StringBuilder.toString()>
	//   97  243:invokespecial   #794 <Method void IllegalArgumentException(String)>
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
	//  104  257:putfield        #428 <Field int ConstraintSet$Constraint.startToStart>
				obj.startToEnd = -1;
	//  105  260:aload           5
	//  106  262:iconst_m1       
	//  107  263:putfield        #431 <Field int ConstraintSet$Constraint.startToEnd>
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
	//  114  277:putfield        #431 <Field int ConstraintSet$Constraint.startToEnd>
				obj.startToStart = -1;
	//  115  280:aload           5
	//  116  282:iconst_m1       
	//  117  283:putfield        #428 <Field int ConstraintSet$Constraint.startToStart>
				return;
	//  118  286:return          
			} else
			{
				obj = ((Object) (new StringBuilder()));
	//  119  287:new             #308 <Class StringBuilder>
	//  120  290:dup             
	//  121  291:invokespecial   #309 <Method void StringBuilder()>
	//  122  294:astore          5
				((StringBuilder) (obj)).append("right to ");
	//  123  296:aload           5
	//  124  298:ldc2            #796 <String "right to ">
	//  125  301:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  126  304:pop             
				((StringBuilder) (obj)).append(sideToString(l));
	//  127  305:aload           5
	//  128  307:aload_0         
	//  129  308:iload           4
	//  130  310:invokespecial   #787 <Method String sideToString(int)>
	//  131  313:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  132  316:pop             
				((StringBuilder) (obj)).append(" undefined");
	//  133  317:aload           5
	//  134  319:ldc2            #798 <String " undefined">
	//  135  322:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  136  325:pop             
				throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//  137  326:new             #793 <Class IllegalArgumentException>
	//  138  329:dup             
	//  139  330:aload           5
	//  140  332:invokevirtual   #328 <Method String StringBuilder.toString()>
	//  141  335:invokespecial   #794 <Method void IllegalArgumentException(String)>
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
	//  148  348:putfield        #534 <Field int ConstraintSet$Constraint.baselineToBaseline>
				obj.bottomToBottom = -1;
	//  149  351:aload           5
	//  150  353:iconst_m1       
	//  151  354:putfield        #528 <Field int ConstraintSet$Constraint.bottomToBottom>
				obj.bottomToTop = -1;
	//  152  357:aload           5
	//  153  359:iconst_m1       
	//  154  360:putfield        #525 <Field int ConstraintSet$Constraint.bottomToTop>
				obj.topToTop = -1;
	//  155  363:aload           5
	//  156  365:iconst_m1       
	//  157  366:putfield        #419 <Field int ConstraintSet$Constraint.topToTop>
				obj.topToBottom = -1;
	//  158  369:aload           5
	//  159  371:iconst_m1       
	//  160  372:putfield        #422 <Field int ConstraintSet$Constraint.topToBottom>
				return;
	//  161  375:return          
			} else
			{
				obj = ((Object) (new StringBuilder()));
	//  162  376:new             #308 <Class StringBuilder>
	//  163  379:dup             
	//  164  380:invokespecial   #309 <Method void StringBuilder()>
	//  165  383:astore          5
				((StringBuilder) (obj)).append("right to ");
	//  166  385:aload           5
	//  167  387:ldc2            #796 <String "right to ">
	//  168  390:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  169  393:pop             
				((StringBuilder) (obj)).append(sideToString(l));
	//  170  394:aload           5
	//  171  396:aload_0         
	//  172  397:iload           4
	//  173  399:invokespecial   #787 <Method String sideToString(int)>
	//  174  402:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  175  405:pop             
				((StringBuilder) (obj)).append(" undefined");
	//  176  406:aload           5
	//  177  408:ldc2            #798 <String " undefined">
	//  178  411:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  179  414:pop             
				throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//  180  415:new             #793 <Class IllegalArgumentException>
	//  181  418:dup             
	//  182  419:aload           5
	//  183  421:invokevirtual   #328 <Method String StringBuilder.toString()>
	//  184  424:invokespecial   #794 <Method void IllegalArgumentException(String)>
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
	//  191  437:putfield        #528 <Field int ConstraintSet$Constraint.bottomToBottom>
				obj.bottomToTop = -1;
	//  192  440:aload           5
	//  193  442:iconst_m1       
	//  194  443:putfield        #525 <Field int ConstraintSet$Constraint.bottomToTop>
				obj.baselineToBaseline = -1;
	//  195  446:aload           5
	//  196  448:iconst_m1       
	//  197  449:putfield        #534 <Field int ConstraintSet$Constraint.baselineToBaseline>
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
	//  204  462:putfield        #525 <Field int ConstraintSet$Constraint.bottomToTop>
				obj.bottomToBottom = -1;
	//  205  465:aload           5
	//  206  467:iconst_m1       
	//  207  468:putfield        #528 <Field int ConstraintSet$Constraint.bottomToBottom>
				obj.baselineToBaseline = -1;
	//  208  471:aload           5
	//  209  473:iconst_m1       
	//  210  474:putfield        #534 <Field int ConstraintSet$Constraint.baselineToBaseline>
				return;
	//  211  477:return          
			} else
			{
				obj = ((Object) (new StringBuilder()));
	//  212  478:new             #308 <Class StringBuilder>
	//  213  481:dup             
	//  214  482:invokespecial   #309 <Method void StringBuilder()>
	//  215  485:astore          5
				((StringBuilder) (obj)).append("right to ");
	//  216  487:aload           5
	//  217  489:ldc2            #796 <String "right to ">
	//  218  492:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  219  495:pop             
				((StringBuilder) (obj)).append(sideToString(l));
	//  220  496:aload           5
	//  221  498:aload_0         
	//  222  499:iload           4
	//  223  501:invokespecial   #787 <Method String sideToString(int)>
	//  224  504:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  225  507:pop             
				((StringBuilder) (obj)).append(" undefined");
	//  226  508:aload           5
	//  227  510:ldc2            #798 <String " undefined">
	//  228  513:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  229  516:pop             
				throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//  230  517:new             #793 <Class IllegalArgumentException>
	//  231  520:dup             
	//  232  521:aload           5
	//  233  523:invokevirtual   #328 <Method String StringBuilder.toString()>
	//  234  526:invokespecial   #794 <Method void IllegalArgumentException(String)>
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
	//  241  539:putfield        #419 <Field int ConstraintSet$Constraint.topToTop>
				obj.topToBottom = -1;
	//  242  542:aload           5
	//  243  544:iconst_m1       
	//  244  545:putfield        #422 <Field int ConstraintSet$Constraint.topToBottom>
				obj.baselineToBaseline = -1;
	//  245  548:aload           5
	//  246  550:iconst_m1       
	//  247  551:putfield        #534 <Field int ConstraintSet$Constraint.baselineToBaseline>
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
	//  254  564:putfield        #422 <Field int ConstraintSet$Constraint.topToBottom>
				obj.topToTop = -1;
	//  255  567:aload           5
	//  256  569:iconst_m1       
	//  257  570:putfield        #419 <Field int ConstraintSet$Constraint.topToTop>
				obj.baselineToBaseline = -1;
	//  258  573:aload           5
	//  259  575:iconst_m1       
	//  260  576:putfield        #534 <Field int ConstraintSet$Constraint.baselineToBaseline>
				return;
	//  261  579:return          
			} else
			{
				obj = ((Object) (new StringBuilder()));
	//  262  580:new             #308 <Class StringBuilder>
	//  263  583:dup             
	//  264  584:invokespecial   #309 <Method void StringBuilder()>
	//  265  587:astore          5
				((StringBuilder) (obj)).append("right to ");
	//  266  589:aload           5
	//  267  591:ldc2            #796 <String "right to ">
	//  268  594:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  269  597:pop             
				((StringBuilder) (obj)).append(sideToString(l));
	//  270  598:aload           5
	//  271  600:aload_0         
	//  272  601:iload           4
	//  273  603:invokespecial   #787 <Method String sideToString(int)>
	//  274  606:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  275  609:pop             
				((StringBuilder) (obj)).append(" undefined");
	//  276  610:aload           5
	//  277  612:ldc2            #798 <String " undefined">
	//  278  615:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  279  618:pop             
				throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//  280  619:new             #793 <Class IllegalArgumentException>
	//  281  622:dup             
	//  282  623:aload           5
	//  283  625:invokevirtual   #328 <Method String StringBuilder.toString()>
	//  284  628:invokespecial   #794 <Method void IllegalArgumentException(String)>
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
	//  291  641:putfield        #440 <Field int ConstraintSet$Constraint.rightToLeft>
				obj.rightToRight = -1;
	//  292  644:aload           5
	//  293  646:iconst_m1       
	//  294  647:putfield        #437 <Field int ConstraintSet$Constraint.rightToRight>
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
	//  301  660:putfield        #437 <Field int ConstraintSet$Constraint.rightToRight>
				obj.rightToLeft = -1;
	//  302  663:aload           5
	//  303  665:iconst_m1       
	//  304  666:putfield        #440 <Field int ConstraintSet$Constraint.rightToLeft>
				return;
	//  305  669:return          
			} else
			{
				obj = ((Object) (new StringBuilder()));
	//  306  670:new             #308 <Class StringBuilder>
	//  307  673:dup             
	//  308  674:invokespecial   #309 <Method void StringBuilder()>
	//  309  677:astore          5
				((StringBuilder) (obj)).append("right to ");
	//  310  679:aload           5
	//  311  681:ldc2            #796 <String "right to ">
	//  312  684:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  313  687:pop             
				((StringBuilder) (obj)).append(sideToString(l));
	//  314  688:aload           5
	//  315  690:aload_0         
	//  316  691:iload           4
	//  317  693:invokespecial   #787 <Method String sideToString(int)>
	//  318  696:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  319  699:pop             
				((StringBuilder) (obj)).append(" undefined");
	//  320  700:aload           5
	//  321  702:ldc2            #798 <String " undefined">
	//  322  705:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  323  708:pop             
				throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//  324  709:new             #793 <Class IllegalArgumentException>
	//  325  712:dup             
	//  326  713:aload           5
	//  327  715:invokevirtual   #328 <Method String StringBuilder.toString()>
	//  328  718:invokespecial   #794 <Method void IllegalArgumentException(String)>
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
	//  335  731:putfield        #452 <Field int ConstraintSet$Constraint.leftToLeft>
			obj.leftToRight = -1;
	//  336  734:aload           5
	//  337  736:iconst_m1       
	//  338  737:putfield        #449 <Field int ConstraintSet$Constraint.leftToRight>
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
	//  345  750:putfield        #449 <Field int ConstraintSet$Constraint.leftToRight>
			obj.leftToLeft = -1;
	//  346  753:aload           5
	//  347  755:iconst_m1       
	//  348  756:putfield        #452 <Field int ConstraintSet$Constraint.leftToLeft>
			return;
	//  349  759:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//  350  760:new             #308 <Class StringBuilder>
	//  351  763:dup             
	//  352  764:invokespecial   #309 <Method void StringBuilder()>
	//  353  767:astore          5
			stringbuilder.append("left to ");
	//  354  769:aload           5
	//  355  771:ldc2            #800 <String "left to ">
	//  356  774:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  357  777:pop             
			stringbuilder.append(sideToString(l));
	//  358  778:aload           5
	//  359  780:aload_0         
	//  360  781:iload           4
	//  361  783:invokespecial   #787 <Method String sideToString(int)>
	//  362  786:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  363  789:pop             
			stringbuilder.append(" undefined");
	//  364  790:aload           5
	//  365  792:ldc2            #798 <String " undefined">
	//  366  795:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  367  798:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//  368  799:new             #793 <Class IllegalArgumentException>
	//  369  802:dup             
	//  370  803:aload           5
	//  371  805:invokevirtual   #328 <Method String StringBuilder.toString()>
	//  372  808:invokespecial   #794 <Method void IllegalArgumentException(String)>
	//  373  811:athrow          
		}
	}

	public void connect(int i, int j, int k, int l, int i1)
	{
		Object obj;
		if(!mConstraints.containsKey(((Object) (Integer.valueOf(i)))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #245 <Field HashMap mConstraints>
	//*   2    4:iload_1         
	//*   3    5:invokestatic    #276 <Method Integer Integer.valueOf(int)>
	//*   4    8:invokevirtual   #280 <Method boolean HashMap.containsKey(Object)>
	//*   5   11:ifne            34
			mConstraints.put(((Object) (Integer.valueOf(i))), ((Object) (new Constraint())));
	//    6   14:aload_0         
	//    7   15:getfield        #245 <Field HashMap mConstraints>
	//    8   18:iload_1         
	//    9   19:invokestatic    #276 <Method Integer Integer.valueOf(int)>
	//   10   22:new             #8   <Class ConstraintSet$Constraint>
	//   11   25:dup             
	//   12   26:aconst_null     
	//   13   27:invokespecial   #250 <Method void ConstraintSet$Constraint(ConstraintSet$1)>
	//   14   30:invokevirtual   #284 <Method Object HashMap.put(Object, Object)>
	//   15   33:pop             
		obj = ((Object) ((Constraint)mConstraints.get(((Object) (Integer.valueOf(i))))));
	//   16   34:aload_0         
	//   17   35:getfield        #245 <Field HashMap mConstraints>
	//   18   38:iload_1         
	//   19   39:invokestatic    #276 <Method Integer Integer.valueOf(int)>
	//   20   42:invokevirtual   #287 <Method Object HashMap.get(Object)>
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
	//   25   92:new             #308 <Class StringBuilder>
	//   26   95:dup             
	//   27   96:invokespecial   #309 <Method void StringBuilder()>
	//   28   99:astore          6
		((StringBuilder) (obj)).append(sideToString(j));
	//   29  101:aload           6
	//   30  103:aload_0         
	//   31  104:iload_2         
	//   32  105:invokespecial   #787 <Method String sideToString(int)>
	//   33  108:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//   34  111:pop             
		((StringBuilder) (obj)).append(" to ");
	//   35  112:aload           6
	//   36  114:ldc2            #789 <String " to ">
	//   37  117:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//   38  120:pop             
		((StringBuilder) (obj)).append(sideToString(l));
	//   39  121:aload           6
	//   40  123:aload_0         
	//   41  124:iload           4
	//   42  126:invokespecial   #787 <Method String sideToString(int)>
	//   43  129:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//   44  132:pop             
		((StringBuilder) (obj)).append(" unknown");
	//   45  133:aload           6
	//   46  135:ldc2            #791 <String " unknown">
	//   47  138:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//   48  141:pop             
		throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   49  142:new             #793 <Class IllegalArgumentException>
	//   50  145:dup             
	//   51  146:aload           6
	//   52  148:invokevirtual   #328 <Method String StringBuilder.toString()>
	//   53  151:invokespecial   #794 <Method void IllegalArgumentException(String)>
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
	//   60  165:putfield        #506 <Field int ConstraintSet$Constraint.endToEnd>
		obj.endToStart = -1;
	//   61  168:aload           6
	//   62  170:iconst_m1       
	//   63  171:putfield        #503 <Field int ConstraintSet$Constraint.endToStart>
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
	//   70  187:putfield        #503 <Field int ConstraintSet$Constraint.endToStart>
		obj.endToEnd = -1;
	//   71  190:aload           6
	//   72  192:iconst_m1       
	//   73  193:putfield        #506 <Field int ConstraintSet$Constraint.endToEnd>
_L11:
		obj.endMargin = i1;
	//   74  196:aload           6
	//   75  198:iload           5
	//   76  200:putfield        #509 <Field int ConstraintSet$Constraint.endMargin>
		return;
	//   77  203:return          
_L13:
		obj = ((Object) (new StringBuilder()));
	//   78  204:new             #308 <Class StringBuilder>
	//   79  207:dup             
	//   80  208:invokespecial   #309 <Method void StringBuilder()>
	//   81  211:astore          6
		((StringBuilder) (obj)).append("right to ");
	//   82  213:aload           6
	//   83  215:ldc2            #796 <String "right to ">
	//   84  218:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//   85  221:pop             
		((StringBuilder) (obj)).append(sideToString(l));
	//   86  222:aload           6
	//   87  224:aload_0         
	//   88  225:iload           4
	//   89  227:invokespecial   #787 <Method String sideToString(int)>
	//   90  230:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//   91  233:pop             
		((StringBuilder) (obj)).append(" undefined");
	//   92  234:aload           6
	//   93  236:ldc2            #798 <String " undefined">
	//   94  239:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//   95  242:pop             
		throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   96  243:new             #793 <Class IllegalArgumentException>
	//   97  246:dup             
	//   98  247:aload           6
	//   99  249:invokevirtual   #328 <Method String StringBuilder.toString()>
	//  100  252:invokespecial   #794 <Method void IllegalArgumentException(String)>
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
	//  107  266:putfield        #428 <Field int ConstraintSet$Constraint.startToStart>
		obj.startToEnd = -1;
	//  108  269:aload           6
	//  109  271:iconst_m1       
	//  110  272:putfield        #431 <Field int ConstraintSet$Constraint.startToEnd>
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
	//  117  288:putfield        #431 <Field int ConstraintSet$Constraint.startToEnd>
		obj.startToStart = -1;
	//  118  291:aload           6
	//  119  293:iconst_m1       
	//  120  294:putfield        #428 <Field int ConstraintSet$Constraint.startToStart>
_L16:
		obj.startMargin = i1;
	//  121  297:aload           6
	//  122  299:iload           5
	//  123  301:putfield        #434 <Field int ConstraintSet$Constraint.startMargin>
		return;
	//  124  304:return          
_L18:
		obj = ((Object) (new StringBuilder()));
	//  125  305:new             #308 <Class StringBuilder>
	//  126  308:dup             
	//  127  309:invokespecial   #309 <Method void StringBuilder()>
	//  128  312:astore          6
		((StringBuilder) (obj)).append("right to ");
	//  129  314:aload           6
	//  130  316:ldc2            #796 <String "right to ">
	//  131  319:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  132  322:pop             
		((StringBuilder) (obj)).append(sideToString(l));
	//  133  323:aload           6
	//  134  325:aload_0         
	//  135  326:iload           4
	//  136  328:invokespecial   #787 <Method String sideToString(int)>
	//  137  331:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  138  334:pop             
		((StringBuilder) (obj)).append(" undefined");
	//  139  335:aload           6
	//  140  337:ldc2            #798 <String " undefined">
	//  141  340:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  142  343:pop             
		throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//  143  344:new             #793 <Class IllegalArgumentException>
	//  144  347:dup             
	//  145  348:aload           6
	//  146  350:invokevirtual   #328 <Method String StringBuilder.toString()>
	//  147  353:invokespecial   #794 <Method void IllegalArgumentException(String)>
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
	//  154  366:putfield        #534 <Field int ConstraintSet$Constraint.baselineToBaseline>
			obj.bottomToBottom = -1;
	//  155  369:aload           6
	//  156  371:iconst_m1       
	//  157  372:putfield        #528 <Field int ConstraintSet$Constraint.bottomToBottom>
			obj.bottomToTop = -1;
	//  158  375:aload           6
	//  159  377:iconst_m1       
	//  160  378:putfield        #525 <Field int ConstraintSet$Constraint.bottomToTop>
			obj.topToTop = -1;
	//  161  381:aload           6
	//  162  383:iconst_m1       
	//  163  384:putfield        #419 <Field int ConstraintSet$Constraint.topToTop>
			obj.topToBottom = -1;
	//  164  387:aload           6
	//  165  389:iconst_m1       
	//  166  390:putfield        #422 <Field int ConstraintSet$Constraint.topToBottom>
			return;
	//  167  393:return          
		} else
		{
			obj = ((Object) (new StringBuilder()));
	//  168  394:new             #308 <Class StringBuilder>
	//  169  397:dup             
	//  170  398:invokespecial   #309 <Method void StringBuilder()>
	//  171  401:astore          6
			((StringBuilder) (obj)).append("right to ");
	//  172  403:aload           6
	//  173  405:ldc2            #796 <String "right to ">
	//  174  408:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  175  411:pop             
			((StringBuilder) (obj)).append(sideToString(l));
	//  176  412:aload           6
	//  177  414:aload_0         
	//  178  415:iload           4
	//  179  417:invokespecial   #787 <Method String sideToString(int)>
	//  180  420:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  181  423:pop             
			((StringBuilder) (obj)).append(" undefined");
	//  182  424:aload           6
	//  183  426:ldc2            #798 <String " undefined">
	//  184  429:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  185  432:pop             
			throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//  186  433:new             #793 <Class IllegalArgumentException>
	//  187  436:dup             
	//  188  437:aload           6
	//  189  439:invokevirtual   #328 <Method String StringBuilder.toString()>
	//  190  442:invokespecial   #794 <Method void IllegalArgumentException(String)>
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
	//  197  455:putfield        #528 <Field int ConstraintSet$Constraint.bottomToBottom>
		obj.bottomToTop = -1;
	//  198  458:aload           6
	//  199  460:iconst_m1       
	//  200  461:putfield        #525 <Field int ConstraintSet$Constraint.bottomToTop>
		obj.baselineToBaseline = -1;
	//  201  464:aload           6
	//  202  466:iconst_m1       
	//  203  467:putfield        #534 <Field int ConstraintSet$Constraint.baselineToBaseline>
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
	//  210  482:putfield        #525 <Field int ConstraintSet$Constraint.bottomToTop>
		obj.bottomToBottom = -1;
	//  211  485:aload           6
	//  212  487:iconst_m1       
	//  213  488:putfield        #528 <Field int ConstraintSet$Constraint.bottomToBottom>
		obj.baselineToBaseline = -1;
	//  214  491:aload           6
	//  215  493:iconst_m1       
	//  216  494:putfield        #534 <Field int ConstraintSet$Constraint.baselineToBaseline>
_L21:
		obj.bottomMargin = i1;
	//  217  497:aload           6
	//  218  499:iload           5
	//  219  501:putfield        #531 <Field int ConstraintSet$Constraint.bottomMargin>
		return;
	//  220  504:return          
_L23:
		obj = ((Object) (new StringBuilder()));
	//  221  505:new             #308 <Class StringBuilder>
	//  222  508:dup             
	//  223  509:invokespecial   #309 <Method void StringBuilder()>
	//  224  512:astore          6
		((StringBuilder) (obj)).append("right to ");
	//  225  514:aload           6
	//  226  516:ldc2            #796 <String "right to ">
	//  227  519:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  228  522:pop             
		((StringBuilder) (obj)).append(sideToString(l));
	//  229  523:aload           6
	//  230  525:aload_0         
	//  231  526:iload           4
	//  232  528:invokespecial   #787 <Method String sideToString(int)>
	//  233  531:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  234  534:pop             
		((StringBuilder) (obj)).append(" undefined");
	//  235  535:aload           6
	//  236  537:ldc2            #798 <String " undefined">
	//  237  540:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  238  543:pop             
		throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//  239  544:new             #793 <Class IllegalArgumentException>
	//  240  547:dup             
	//  241  548:aload           6
	//  242  550:invokevirtual   #328 <Method String StringBuilder.toString()>
	//  243  553:invokespecial   #794 <Method void IllegalArgumentException(String)>
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
	//  250  566:putfield        #419 <Field int ConstraintSet$Constraint.topToTop>
		obj.topToBottom = -1;
	//  251  569:aload           6
	//  252  571:iconst_m1       
	//  253  572:putfield        #422 <Field int ConstraintSet$Constraint.topToBottom>
		obj.baselineToBaseline = -1;
	//  254  575:aload           6
	//  255  577:iconst_m1       
	//  256  578:putfield        #534 <Field int ConstraintSet$Constraint.baselineToBaseline>
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
	//  263  593:putfield        #422 <Field int ConstraintSet$Constraint.topToBottom>
		obj.topToTop = -1;
	//  264  596:aload           6
	//  265  598:iconst_m1       
	//  266  599:putfield        #419 <Field int ConstraintSet$Constraint.topToTop>
		obj.baselineToBaseline = -1;
	//  267  602:aload           6
	//  268  604:iconst_m1       
	//  269  605:putfield        #534 <Field int ConstraintSet$Constraint.baselineToBaseline>
_L26:
		obj.topMargin = i1;
	//  270  608:aload           6
	//  271  610:iload           5
	//  272  612:putfield        #425 <Field int ConstraintSet$Constraint.topMargin>
		return;
	//  273  615:return          
_L28:
		obj = ((Object) (new StringBuilder()));
	//  274  616:new             #308 <Class StringBuilder>
	//  275  619:dup             
	//  276  620:invokespecial   #309 <Method void StringBuilder()>
	//  277  623:astore          6
		((StringBuilder) (obj)).append("right to ");
	//  278  625:aload           6
	//  279  627:ldc2            #796 <String "right to ">
	//  280  630:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  281  633:pop             
		((StringBuilder) (obj)).append(sideToString(l));
	//  282  634:aload           6
	//  283  636:aload_0         
	//  284  637:iload           4
	//  285  639:invokespecial   #787 <Method String sideToString(int)>
	//  286  642:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  287  645:pop             
		((StringBuilder) (obj)).append(" undefined");
	//  288  646:aload           6
	//  289  648:ldc2            #798 <String " undefined">
	//  290  651:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  291  654:pop             
		throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//  292  655:new             #793 <Class IllegalArgumentException>
	//  293  658:dup             
	//  294  659:aload           6
	//  295  661:invokevirtual   #328 <Method String StringBuilder.toString()>
	//  296  664:invokespecial   #794 <Method void IllegalArgumentException(String)>
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
	//  303  677:putfield        #440 <Field int ConstraintSet$Constraint.rightToLeft>
		obj.rightToRight = -1;
	//  304  680:aload           6
	//  305  682:iconst_m1       
	//  306  683:putfield        #437 <Field int ConstraintSet$Constraint.rightToRight>
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
	//  313  698:putfield        #437 <Field int ConstraintSet$Constraint.rightToRight>
		obj.rightToLeft = -1;
	//  314  701:aload           6
	//  315  703:iconst_m1       
	//  316  704:putfield        #440 <Field int ConstraintSet$Constraint.rightToLeft>
_L31:
		obj.rightMargin = i1;
	//  317  707:aload           6
	//  318  709:iload           5
	//  319  711:putfield        #443 <Field int ConstraintSet$Constraint.rightMargin>
		return;
	//  320  714:return          
_L33:
		obj = ((Object) (new StringBuilder()));
	//  321  715:new             #308 <Class StringBuilder>
	//  322  718:dup             
	//  323  719:invokespecial   #309 <Method void StringBuilder()>
	//  324  722:astore          6
		((StringBuilder) (obj)).append("right to ");
	//  325  724:aload           6
	//  326  726:ldc2            #796 <String "right to ">
	//  327  729:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  328  732:pop             
		((StringBuilder) (obj)).append(sideToString(l));
	//  329  733:aload           6
	//  330  735:aload_0         
	//  331  736:iload           4
	//  332  738:invokespecial   #787 <Method String sideToString(int)>
	//  333  741:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  334  744:pop             
		((StringBuilder) (obj)).append(" undefined");
	//  335  745:aload           6
	//  336  747:ldc2            #798 <String " undefined">
	//  337  750:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  338  753:pop             
		throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//  339  754:new             #793 <Class IllegalArgumentException>
	//  340  757:dup             
	//  341  758:aload           6
	//  342  760:invokevirtual   #328 <Method String StringBuilder.toString()>
	//  343  763:invokespecial   #794 <Method void IllegalArgumentException(String)>
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
	//  350  776:putfield        #452 <Field int ConstraintSet$Constraint.leftToLeft>
		obj.leftToRight = -1;
	//  351  779:aload           6
	//  352  781:iconst_m1       
	//  353  782:putfield        #449 <Field int ConstraintSet$Constraint.leftToRight>
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
	//  360  797:putfield        #449 <Field int ConstraintSet$Constraint.leftToRight>
		obj.leftToLeft = -1;
	//  361  800:aload           6
	//  362  802:iconst_m1       
	//  363  803:putfield        #452 <Field int ConstraintSet$Constraint.leftToLeft>
_L36:
		obj.leftMargin = i1;
	//  364  806:aload           6
	//  365  808:iload           5
	//  366  810:putfield        #455 <Field int ConstraintSet$Constraint.leftMargin>
		return;
	//  367  813:return          
_L38:
		StringBuilder stringbuilder = new StringBuilder();
	//  368  814:new             #308 <Class StringBuilder>
	//  369  817:dup             
	//  370  818:invokespecial   #309 <Method void StringBuilder()>
	//  371  821:astore          6
		stringbuilder.append("Left to ");
	//  372  823:aload           6
	//  373  825:ldc2            #803 <String "Left to ">
	//  374  828:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  375  831:pop             
		stringbuilder.append(sideToString(l));
	//  376  832:aload           6
	//  377  834:aload_0         
	//  378  835:iload           4
	//  379  837:invokespecial   #787 <Method String sideToString(int)>
	//  380  840:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  381  843:pop             
		stringbuilder.append(" undefined");
	//  382  844:aload           6
	//  383  846:ldc2            #798 <String " undefined">
	//  384  849:invokevirtual   #314 <Method StringBuilder StringBuilder.append(String)>
	//  385  852:pop             
		throw new IllegalArgumentException(stringbuilder.toString());
	//  386  853:new             #793 <Class IllegalArgumentException>
	//  387  856:dup             
	//  388  857:aload           6
	//  389  859:invokevirtual   #328 <Method String StringBuilder.toString()>
	//  390  862:invokespecial   #794 <Method void IllegalArgumentException(String)>
	//  391  865:athrow          
	}

	public void load(Context context, int i)
	{
		android.content.res.XmlResourceParser xmlresourceparser = context.getResources().getXml(i);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #813 <Method Resources Context.getResources()>
	//    2    4:iload_2         
	//    3    5:invokevirtual   #819 <Method android.content.res.XmlResourceParser Resources.getXml(int)>
	//    4    8:astore_3        
		i = ((XmlPullParser) (xmlresourceparser)).getEventType();
	//    5    9:aload_3         
	//    6   10:invokeinterface #824 <Method int XmlPullParser.getEventType()>
	//    7   15:istore_2        
		  goto _L1
	//*   8   16:goto            105
_L9:
		String s = ((XmlPullParser) (xmlresourceparser)).getName();
	//    9   19:aload_3         
	//   10   20:invokeinterface #827 <Method String XmlPullParser.getName()>
	//   11   25:astore          4
		Constraint constraint = fillFromAttributeList(context, Xml.asAttributeSet(((XmlPullParser) (xmlresourceparser))));
	//   12   27:aload_0         
	//   13   28:aload_1         
	//   14   29:aload_3         
	//   15   30:invokestatic    #833 <Method AttributeSet Xml.asAttributeSet(XmlPullParser)>
	//   16   33:invokespecial   #835 <Method ConstraintSet$Constraint fillFromAttributeList(Context, AttributeSet)>
	//   17   36:astore          5
		if(s.equalsIgnoreCase("Guideline"))
	//*  18   38:aload           4
	//*  19   40:ldc2            #837 <String "Guideline">
	//*  20   43:invokevirtual   #843 <Method boolean String.equalsIgnoreCase(String)>
	//*  21   46:ifeq            55
			constraint.mIsGuideline = true;
	//   22   49:aload           5
	//   23   51:iconst_1        
	//   24   52:putfield        #714 <Field boolean ConstraintSet$Constraint.mIsGuideline>
		mConstraints.put(((Object) (Integer.valueOf(constraint.mViewId))), ((Object) (constraint)));
	//   25   55:aload_0         
	//   26   56:getfield        #245 <Field HashMap mConstraints>
	//   27   59:aload           5
	//   28   61:getfield        #413 <Field int ConstraintSet$Constraint.mViewId>
	//   29   64:invokestatic    #276 <Method Integer Integer.valueOf(int)>
	//   30   67:aload           5
	//   31   69:invokevirtual   #284 <Method Object HashMap.put(Object, Object)>
	//   32   72:pop             
		  goto _L2
	//*  33   73:goto            83
_L6:
		((XmlPullParser) (xmlresourceparser)).getName();
	//   34   76:aload_3         
	//   35   77:invokeinterface #827 <Method String XmlPullParser.getName()>
	//   36   82:pop             
_L2:
		i = ((XmlPullParser) (xmlresourceparser)).next();
	//   37   83:aload_3         
	//   38   84:invokeinterface #845 <Method int XmlPullParser.next()>
	//   39   89:istore_2        
		  goto _L1
	//*  40   90:goto            105
		context;
	//   41   93:astore_1        
		((IOException) (context)).printStackTrace();
	//   42   94:aload_1         
	//   43   95:invokevirtual   #848 <Method void IOException.printStackTrace()>
		return;
	//   44   98:return          
		context;
	//   45   99:astore_1        
		((XmlPullParserException) (context)).printStackTrace();
	//   46  100:aload_1         
	//   47  101:invokevirtual   #849 <Method void XmlPullParserException.printStackTrace()>
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

	public void setVerticalBias(int i, float f)
	{
		get(i).verticalBias = f;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #853 <Method ConstraintSet$Constraint get(int)>
	//    3    5:fload_2         
	//    4    6:putfield        #416 <Field float ConstraintSet$Constraint.verticalBias>
	//    5    9:return          
	}

	private static final int VISIBILITY_FLAGS[] = {
		0, 4, 8
	};
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
	//   14   16:putstatic       #20  <Field int[] VISIBILITY_FLAGS>
		mapToConstant = new SparseIntArray();
	//   15   19:new             #22  <Class SparseIntArray>
	//   16   22:dup             
	//   17   23:invokespecial   #25  <Method void SparseIntArray()>
	//   18   26:putstatic       #27  <Field SparseIntArray mapToConstant>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
	//   19   29:getstatic       #27  <Field SparseIntArray mapToConstant>
	//   20   32:getstatic       #33  <Field int R$styleable.ConstraintSet_layout_constraintLeft_toLeftOf>
	//   21   35:bipush          25
	//   22   37:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintLeft_toRightOf, 26);
	//   23   40:getstatic       #27  <Field SparseIntArray mapToConstant>
	//   24   43:getstatic       #40  <Field int R$styleable.ConstraintSet_layout_constraintLeft_toRightOf>
	//   25   46:bipush          26
	//   26   48:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintRight_toLeftOf, 29);
	//   27   51:getstatic       #27  <Field SparseIntArray mapToConstant>
	//   28   54:getstatic       #43  <Field int R$styleable.ConstraintSet_layout_constraintRight_toLeftOf>
	//   29   57:bipush          29
	//   30   59:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintRight_toRightOf, 30);
	//   31   62:getstatic       #27  <Field SparseIntArray mapToConstant>
	//   32   65:getstatic       #46  <Field int R$styleable.ConstraintSet_layout_constraintRight_toRightOf>
	//   33   68:bipush          30
	//   34   70:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintTop_toTopOf, 36);
	//   35   73:getstatic       #27  <Field SparseIntArray mapToConstant>
	//   36   76:getstatic       #49  <Field int R$styleable.ConstraintSet_layout_constraintTop_toTopOf>
	//   37   79:bipush          36
	//   38   81:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintTop_toBottomOf, 35);
	//   39   84:getstatic       #27  <Field SparseIntArray mapToConstant>
	//   40   87:getstatic       #52  <Field int R$styleable.ConstraintSet_layout_constraintTop_toBottomOf>
	//   41   90:bipush          35
	//   42   92:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintBottom_toTopOf, 4);
	//   43   95:getstatic       #27  <Field SparseIntArray mapToConstant>
	//   44   98:getstatic       #55  <Field int R$styleable.ConstraintSet_layout_constraintBottom_toTopOf>
	//   45  101:iconst_4        
	//   46  102:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
	//   47  105:getstatic       #27  <Field SparseIntArray mapToConstant>
	//   48  108:getstatic       #58  <Field int R$styleable.ConstraintSet_layout_constraintBottom_toBottomOf>
	//   49  111:iconst_3        
	//   50  112:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
	//   51  115:getstatic       #27  <Field SparseIntArray mapToConstant>
	//   52  118:getstatic       #61  <Field int R$styleable.ConstraintSet_layout_constraintBaseline_toBaselineOf>
	//   53  121:iconst_1        
	//   54  122:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_editor_absoluteX, 6);
	//   55  125:getstatic       #27  <Field SparseIntArray mapToConstant>
	//   56  128:getstatic       #64  <Field int R$styleable.ConstraintSet_layout_editor_absoluteX>
	//   57  131:bipush          6
	//   58  133:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_editor_absoluteY, 7);
	//   59  136:getstatic       #27  <Field SparseIntArray mapToConstant>
	//   60  139:getstatic       #67  <Field int R$styleable.ConstraintSet_layout_editor_absoluteY>
	//   61  142:bipush          7
	//   62  144:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintGuide_begin, 17);
	//   63  147:getstatic       #27  <Field SparseIntArray mapToConstant>
	//   64  150:getstatic       #70  <Field int R$styleable.ConstraintSet_layout_constraintGuide_begin>
	//   65  153:bipush          17
	//   66  155:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintGuide_end, 18);
	//   67  158:getstatic       #27  <Field SparseIntArray mapToConstant>
	//   68  161:getstatic       #73  <Field int R$styleable.ConstraintSet_layout_constraintGuide_end>
	//   69  164:bipush          18
	//   70  166:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintGuide_percent, 19);
	//   71  169:getstatic       #27  <Field SparseIntArray mapToConstant>
	//   72  172:getstatic       #76  <Field int R$styleable.ConstraintSet_layout_constraintGuide_percent>
	//   73  175:bipush          19
	//   74  177:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_orientation, 27);
	//   75  180:getstatic       #27  <Field SparseIntArray mapToConstant>
	//   76  183:getstatic       #79  <Field int R$styleable.ConstraintSet_android_orientation>
	//   77  186:bipush          27
	//   78  188:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintStart_toEndOf, 32);
	//   79  191:getstatic       #27  <Field SparseIntArray mapToConstant>
	//   80  194:getstatic       #82  <Field int R$styleable.ConstraintSet_layout_constraintStart_toEndOf>
	//   81  197:bipush          32
	//   82  199:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintStart_toStartOf, 33);
	//   83  202:getstatic       #27  <Field SparseIntArray mapToConstant>
	//   84  205:getstatic       #85  <Field int R$styleable.ConstraintSet_layout_constraintStart_toStartOf>
	//   85  208:bipush          33
	//   86  210:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintEnd_toStartOf, 10);
	//   87  213:getstatic       #27  <Field SparseIntArray mapToConstant>
	//   88  216:getstatic       #88  <Field int R$styleable.ConstraintSet_layout_constraintEnd_toStartOf>
	//   89  219:bipush          10
	//   90  221:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintEnd_toEndOf, 9);
	//   91  224:getstatic       #27  <Field SparseIntArray mapToConstant>
	//   92  227:getstatic       #91  <Field int R$styleable.ConstraintSet_layout_constraintEnd_toEndOf>
	//   93  230:bipush          9
	//   94  232:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_goneMarginLeft, 13);
	//   95  235:getstatic       #27  <Field SparseIntArray mapToConstant>
	//   96  238:getstatic       #94  <Field int R$styleable.ConstraintSet_layout_goneMarginLeft>
	//   97  241:bipush          13
	//   98  243:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_goneMarginTop, 16);
	//   99  246:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  100  249:getstatic       #97  <Field int R$styleable.ConstraintSet_layout_goneMarginTop>
	//  101  252:bipush          16
	//  102  254:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_goneMarginRight, 14);
	//  103  257:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  104  260:getstatic       #100 <Field int R$styleable.ConstraintSet_layout_goneMarginRight>
	//  105  263:bipush          14
	//  106  265:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_goneMarginBottom, 11);
	//  107  268:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  108  271:getstatic       #103 <Field int R$styleable.ConstraintSet_layout_goneMarginBottom>
	//  109  274:bipush          11
	//  110  276:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_goneMarginStart, 15);
	//  111  279:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  112  282:getstatic       #106 <Field int R$styleable.ConstraintSet_layout_goneMarginStart>
	//  113  285:bipush          15
	//  114  287:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_goneMarginEnd, 12);
	//  115  290:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  116  293:getstatic       #109 <Field int R$styleable.ConstraintSet_layout_goneMarginEnd>
	//  117  296:bipush          12
	//  118  298:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintVertical_weight, 40);
	//  119  301:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  120  304:getstatic       #112 <Field int R$styleable.ConstraintSet_layout_constraintVertical_weight>
	//  121  307:bipush          40
	//  122  309:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintHorizontal_weight, 39);
	//  123  312:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  124  315:getstatic       #115 <Field int R$styleable.ConstraintSet_layout_constraintHorizontal_weight>
	//  125  318:bipush          39
	//  126  320:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
	//  127  323:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  128  326:getstatic       #118 <Field int R$styleable.ConstraintSet_layout_constraintHorizontal_chainStyle>
	//  129  329:bipush          41
	//  130  331:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintVertical_chainStyle, 42);
	//  131  334:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  132  337:getstatic       #121 <Field int R$styleable.ConstraintSet_layout_constraintVertical_chainStyle>
	//  133  340:bipush          42
	//  134  342:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintHorizontal_bias, 20);
	//  135  345:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  136  348:getstatic       #124 <Field int R$styleable.ConstraintSet_layout_constraintHorizontal_bias>
	//  137  351:bipush          20
	//  138  353:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintVertical_bias, 37);
	//  139  356:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  140  359:getstatic       #127 <Field int R$styleable.ConstraintSet_layout_constraintVertical_bias>
	//  141  362:bipush          37
	//  142  364:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintDimensionRatio, 5);
	//  143  367:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  144  370:getstatic       #130 <Field int R$styleable.ConstraintSet_layout_constraintDimensionRatio>
	//  145  373:iconst_5        
	//  146  374:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintLeft_creator, 64);
	//  147  377:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  148  380:getstatic       #133 <Field int R$styleable.ConstraintSet_layout_constraintLeft_creator>
	//  149  383:bipush          64
	//  150  385:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintTop_creator, 64);
	//  151  388:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  152  391:getstatic       #136 <Field int R$styleable.ConstraintSet_layout_constraintTop_creator>
	//  153  394:bipush          64
	//  154  396:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintRight_creator, 64);
	//  155  399:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  156  402:getstatic       #139 <Field int R$styleable.ConstraintSet_layout_constraintRight_creator>
	//  157  405:bipush          64
	//  158  407:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintBottom_creator, 64);
	//  159  410:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  160  413:getstatic       #142 <Field int R$styleable.ConstraintSet_layout_constraintBottom_creator>
	//  161  416:bipush          64
	//  162  418:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintBaseline_creator, 64);
	//  163  421:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  164  424:getstatic       #145 <Field int R$styleable.ConstraintSet_layout_constraintBaseline_creator>
	//  165  427:bipush          64
	//  166  429:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_layout_marginLeft, 24);
	//  167  432:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  168  435:getstatic       #148 <Field int R$styleable.ConstraintSet_android_layout_marginLeft>
	//  169  438:bipush          24
	//  170  440:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_layout_marginRight, 28);
	//  171  443:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  172  446:getstatic       #151 <Field int R$styleable.ConstraintSet_android_layout_marginRight>
	//  173  449:bipush          28
	//  174  451:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_layout_marginStart, 31);
	//  175  454:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  176  457:getstatic       #154 <Field int R$styleable.ConstraintSet_android_layout_marginStart>
	//  177  460:bipush          31
	//  178  462:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_layout_marginEnd, 8);
	//  179  465:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  180  468:getstatic       #157 <Field int R$styleable.ConstraintSet_android_layout_marginEnd>
	//  181  471:bipush          8
	//  182  473:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_layout_marginTop, 34);
	//  183  476:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  184  479:getstatic       #160 <Field int R$styleable.ConstraintSet_android_layout_marginTop>
	//  185  482:bipush          34
	//  186  484:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_layout_marginBottom, 2);
	//  187  487:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  188  490:getstatic       #163 <Field int R$styleable.ConstraintSet_android_layout_marginBottom>
	//  189  493:iconst_2        
	//  190  494:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_layout_width, 23);
	//  191  497:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  192  500:getstatic       #166 <Field int R$styleable.ConstraintSet_android_layout_width>
	//  193  503:bipush          23
	//  194  505:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_layout_height, 21);
	//  195  508:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  196  511:getstatic       #169 <Field int R$styleable.ConstraintSet_android_layout_height>
	//  197  514:bipush          21
	//  198  516:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_visibility, 22);
	//  199  519:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  200  522:getstatic       #172 <Field int R$styleable.ConstraintSet_android_visibility>
	//  201  525:bipush          22
	//  202  527:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_alpha, 43);
	//  203  530:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  204  533:getstatic       #175 <Field int R$styleable.ConstraintSet_android_alpha>
	//  205  536:bipush          43
	//  206  538:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_elevation, 44);
	//  207  541:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  208  544:getstatic       #178 <Field int R$styleable.ConstraintSet_android_elevation>
	//  209  547:bipush          44
	//  210  549:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_rotationX, 45);
	//  211  552:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  212  555:getstatic       #181 <Field int R$styleable.ConstraintSet_android_rotationX>
	//  213  558:bipush          45
	//  214  560:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_rotationY, 46);
	//  215  563:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  216  566:getstatic       #184 <Field int R$styleable.ConstraintSet_android_rotationY>
	//  217  569:bipush          46
	//  218  571:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_rotation, 60);
	//  219  574:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  220  577:getstatic       #187 <Field int R$styleable.ConstraintSet_android_rotation>
	//  221  580:bipush          60
	//  222  582:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_scaleX, 47);
	//  223  585:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  224  588:getstatic       #190 <Field int R$styleable.ConstraintSet_android_scaleX>
	//  225  591:bipush          47
	//  226  593:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_scaleY, 48);
	//  227  596:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  228  599:getstatic       #193 <Field int R$styleable.ConstraintSet_android_scaleY>
	//  229  602:bipush          48
	//  230  604:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_transformPivotX, 49);
	//  231  607:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  232  610:getstatic       #196 <Field int R$styleable.ConstraintSet_android_transformPivotX>
	//  233  613:bipush          49
	//  234  615:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_transformPivotY, 50);
	//  235  618:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  236  621:getstatic       #199 <Field int R$styleable.ConstraintSet_android_transformPivotY>
	//  237  624:bipush          50
	//  238  626:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_translationX, 51);
	//  239  629:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  240  632:getstatic       #202 <Field int R$styleable.ConstraintSet_android_translationX>
	//  241  635:bipush          51
	//  242  637:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_translationY, 52);
	//  243  640:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  244  643:getstatic       #205 <Field int R$styleable.ConstraintSet_android_translationY>
	//  245  646:bipush          52
	//  246  648:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_translationZ, 53);
	//  247  651:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  248  654:getstatic       #208 <Field int R$styleable.ConstraintSet_android_translationZ>
	//  249  657:bipush          53
	//  250  659:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintWidth_default, 54);
	//  251  662:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  252  665:getstatic       #211 <Field int R$styleable.ConstraintSet_layout_constraintWidth_default>
	//  253  668:bipush          54
	//  254  670:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintHeight_default, 55);
	//  255  673:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  256  676:getstatic       #214 <Field int R$styleable.ConstraintSet_layout_constraintHeight_default>
	//  257  679:bipush          55
	//  258  681:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintWidth_max, 56);
	//  259  684:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  260  687:getstatic       #217 <Field int R$styleable.ConstraintSet_layout_constraintWidth_max>
	//  261  690:bipush          56
	//  262  692:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintHeight_max, 57);
	//  263  695:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  264  698:getstatic       #220 <Field int R$styleable.ConstraintSet_layout_constraintHeight_max>
	//  265  701:bipush          57
	//  266  703:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintWidth_min, 58);
	//  267  706:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  268  709:getstatic       #223 <Field int R$styleable.ConstraintSet_layout_constraintWidth_min>
	//  269  712:bipush          58
	//  270  714:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintHeight_min, 59);
	//  271  717:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  272  720:getstatic       #226 <Field int R$styleable.ConstraintSet_layout_constraintHeight_min>
	//  273  723:bipush          59
	//  274  725:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintCircle, 61);
	//  275  728:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  276  731:getstatic       #229 <Field int R$styleable.ConstraintSet_layout_constraintCircle>
	//  277  734:bipush          61
	//  278  736:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintCircleRadius, 62);
	//  279  739:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  280  742:getstatic       #232 <Field int R$styleable.ConstraintSet_layout_constraintCircleRadius>
	//  281  745:bipush          62
	//  282  747:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_layout_constraintCircleAngle, 63);
	//  283  750:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  284  753:getstatic       #235 <Field int R$styleable.ConstraintSet_layout_constraintCircleAngle>
	//  285  756:bipush          63
	//  286  758:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
		mapToConstant.append(R.styleable.ConstraintSet_android_id, 38);
	//  287  761:getstatic       #27  <Field SparseIntArray mapToConstant>
	//  288  764:getstatic       #238 <Field int R$styleable.ConstraintSet_android_id>
	//  289  767:bipush          38
	//  290  769:invokevirtual   #37  <Method void SparseIntArray.append(int, int)>
	//* 291  772:return          
	}
}
