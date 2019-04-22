// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.*;
import android.graphics.*;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

// Referenced classes of package android.support.transition:
//			Transition, RectEvaluator, TransitionValues, ViewUtils, 
//			PathMotion, ObjectAnimatorUtils, TransitionUtils, ViewGroupUtils, 
//			ViewOverlayImpl, PropertyValuesHolderUtils, TransitionListenerAdapter

public class ChangeBounds extends Transition
{
	private static class ViewBounds
	{

		private void setLeftTopRightBottom()
		{
			ViewUtils.setLeftTopRightBottom(mView, mLeft, mTop, mRight, mBottom);
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field View mView>
		//    2    4:aload_0         
		//    3    5:getfield        #27  <Field int mLeft>
		//    4    8:aload_0         
		//    5    9:getfield        #29  <Field int mTop>
		//    6   12:aload_0         
		//    7   13:getfield        #31  <Field int mRight>
		//    8   16:aload_0         
		//    9   17:getfield        #33  <Field int mBottom>
		//   10   20:invokestatic    #38  <Method void ViewUtils.setLeftTopRightBottom(View, int, int, int, int)>
			mTopLeftCalls = 0;
		//   11   23:aload_0         
		//   12   24:iconst_0        
		//   13   25:putfield        #40  <Field int mTopLeftCalls>
			mBottomRightCalls = 0;
		//   14   28:aload_0         
		//   15   29:iconst_0        
		//   16   30:putfield        #42  <Field int mBottomRightCalls>
		//   17   33:return          
		}

		void setBottomRight(PointF pointf)
		{
			mRight = Math.round(pointf.x);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getfield        #50  <Field float PointF.x>
		//    3    5:invokestatic    #56  <Method int Math.round(float)>
		//    4    8:putfield        #31  <Field int mRight>
			mBottom = Math.round(pointf.y);
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:getfield        #59  <Field float PointF.y>
		//    8   16:invokestatic    #56  <Method int Math.round(float)>
		//    9   19:putfield        #33  <Field int mBottom>
			mBottomRightCalls = mBottomRightCalls + 1;
		//   10   22:aload_0         
		//   11   23:aload_0         
		//   12   24:getfield        #42  <Field int mBottomRightCalls>
		//   13   27:iconst_1        
		//   14   28:iadd            
		//   15   29:putfield        #42  <Field int mBottomRightCalls>
			if(mTopLeftCalls == mBottomRightCalls)
		//*  16   32:aload_0         
		//*  17   33:getfield        #40  <Field int mTopLeftCalls>
		//*  18   36:aload_0         
		//*  19   37:getfield        #42  <Field int mBottomRightCalls>
		//*  20   40:icmpne          47
				setLeftTopRightBottom();
		//   21   43:aload_0         
		//   22   44:invokespecial   #61  <Method void setLeftTopRightBottom()>
		//   23   47:return          
		}

		void setTopLeft(PointF pointf)
		{
			mLeft = Math.round(pointf.x);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getfield        #50  <Field float PointF.x>
		//    3    5:invokestatic    #56  <Method int Math.round(float)>
		//    4    8:putfield        #27  <Field int mLeft>
			mTop = Math.round(pointf.y);
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:getfield        #59  <Field float PointF.y>
		//    8   16:invokestatic    #56  <Method int Math.round(float)>
		//    9   19:putfield        #29  <Field int mTop>
			mTopLeftCalls = mTopLeftCalls + 1;
		//   10   22:aload_0         
		//   11   23:aload_0         
		//   12   24:getfield        #40  <Field int mTopLeftCalls>
		//   13   27:iconst_1        
		//   14   28:iadd            
		//   15   29:putfield        #40  <Field int mTopLeftCalls>
			if(mTopLeftCalls == mBottomRightCalls)
		//*  16   32:aload_0         
		//*  17   33:getfield        #40  <Field int mTopLeftCalls>
		//*  18   36:aload_0         
		//*  19   37:getfield        #42  <Field int mBottomRightCalls>
		//*  20   40:icmpne          47
				setLeftTopRightBottom();
		//   21   43:aload_0         
		//   22   44:invokespecial   #61  <Method void setLeftTopRightBottom()>
		//   23   47:return          
		}

		private int mBottom;
		private int mBottomRightCalls;
		private int mLeft;
		private int mRight;
		private int mTop;
		private int mTopLeftCalls;
		private View mView;

		ViewBounds(View view)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			mView = view;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field View mView>
		//    5    9:return          
		}
	}


	public ChangeBounds()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #101 <Method void Transition()>
		mTempLocation = new int[2];
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:newarray        int[]
	//    5    8:putfield        #103 <Field int[] mTempLocation>
		mResizeClip = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #105 <Field boolean mResizeClip>
		mReparent = false;
	//    9   16:aload_0         
	//   10   17:iconst_0        
	//   11   18:putfield        #107 <Field boolean mReparent>
	//   12   21:return          
	}

	private void captureValues(TransitionValues transitionvalues)
	{
		View view = transitionvalues.view;
	//    0    0:aload_1         
	//    1    1:getfield        #115 <Field View TransitionValues.view>
	//    2    4:astore_2        
		if(ViewCompat.isLaidOut(view) || view.getWidth() != 0 || view.getHeight() != 0)
	//*   3    5:aload_2         
	//*   4    6:invokestatic    #121 <Method boolean ViewCompat.isLaidOut(View)>
	//*   5    9:ifne            26
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #127 <Method int View.getWidth()>
	//*   8   16:ifne            26
	//*   9   19:aload_2         
	//*  10   20:invokevirtual   #130 <Method int View.getHeight()>
	//*  11   23:ifeq            163
		{
			transitionvalues.values.put("android:changeBounds:bounds", ((Object) (new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()))));
	//   12   26:aload_1         
	//   13   27:getfield        #134 <Field Map TransitionValues.values>
	//   14   30:ldc1            #52  <String "android:changeBounds:bounds">
	//   15   32:new             #136 <Class Rect>
	//   16   35:dup             
	//   17   36:aload_2         
	//   18   37:invokevirtual   #139 <Method int View.getLeft()>
	//   19   40:aload_2         
	//   20   41:invokevirtual   #142 <Method int View.getTop()>
	//   21   44:aload_2         
	//   22   45:invokevirtual   #145 <Method int View.getRight()>
	//   23   48:aload_2         
	//   24   49:invokevirtual   #148 <Method int View.getBottom()>
	//   25   52:invokespecial   #151 <Method void Rect(int, int, int, int)>
	//   26   55:invokeinterface #157 <Method Object Map.put(Object, Object)>
	//   27   60:pop             
			transitionvalues.values.put("android:changeBounds:parent", ((Object) (transitionvalues.view.getParent())));
	//   28   61:aload_1         
	//   29   62:getfield        #134 <Field Map TransitionValues.values>
	//   30   65:ldc1            #56  <String "android:changeBounds:parent">
	//   31   67:aload_1         
	//   32   68:getfield        #115 <Field View TransitionValues.view>
	//   33   71:invokevirtual   #161 <Method android.view.ViewParent View.getParent()>
	//   34   74:invokeinterface #157 <Method Object Map.put(Object, Object)>
	//   35   79:pop             
			if(mReparent)
	//*  36   80:aload_0         
	//*  37   81:getfield        #107 <Field boolean mReparent>
	//*  38   84:ifeq            140
			{
				transitionvalues.view.getLocationInWindow(mTempLocation);
	//   39   87:aload_1         
	//   40   88:getfield        #115 <Field View TransitionValues.view>
	//   41   91:aload_0         
	//   42   92:getfield        #103 <Field int[] mTempLocation>
	//   43   95:invokevirtual   #165 <Method void View.getLocationInWindow(int[])>
				transitionvalues.values.put("android:changeBounds:windowX", ((Object) (Integer.valueOf(mTempLocation[0]))));
	//   44   98:aload_1         
	//   45   99:getfield        #134 <Field Map TransitionValues.values>
	//   46  102:ldc1            #58  <String "android:changeBounds:windowX">
	//   47  104:aload_0         
	//   48  105:getfield        #103 <Field int[] mTempLocation>
	//   49  108:iconst_0        
	//   50  109:iaload          
	//   51  110:invokestatic    #171 <Method Integer Integer.valueOf(int)>
	//   52  113:invokeinterface #157 <Method Object Map.put(Object, Object)>
	//   53  118:pop             
				transitionvalues.values.put("android:changeBounds:windowY", ((Object) (Integer.valueOf(mTempLocation[1]))));
	//   54  119:aload_1         
	//   55  120:getfield        #134 <Field Map TransitionValues.values>
	//   56  123:ldc1            #60  <String "android:changeBounds:windowY">
	//   57  125:aload_0         
	//   58  126:getfield        #103 <Field int[] mTempLocation>
	//   59  129:iconst_1        
	//   60  130:iaload          
	//   61  131:invokestatic    #171 <Method Integer Integer.valueOf(int)>
	//   62  134:invokeinterface #157 <Method Object Map.put(Object, Object)>
	//   63  139:pop             
			}
			if(mResizeClip)
	//*  64  140:aload_0         
	//*  65  141:getfield        #105 <Field boolean mResizeClip>
	//*  66  144:ifeq            163
				transitionvalues.values.put("android:changeBounds:clip", ((Object) (ViewCompat.getClipBounds(view))));
	//   67  147:aload_1         
	//   68  148:getfield        #134 <Field Map TransitionValues.values>
	//   69  151:ldc1            #54  <String "android:changeBounds:clip">
	//   70  153:aload_2         
	//   71  154:invokestatic    #175 <Method Rect ViewCompat.getClipBounds(View)>
	//   72  157:invokeinterface #157 <Method Object Map.put(Object, Object)>
	//   73  162:pop             
		}
	//   74  163:return          
	}

	private boolean parentMatches(View view, View view1)
	{
		boolean flag1 = mReparent;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field boolean mReparent>
	//    2    4:istore          4
		boolean flag = true;
	//    3    6:iconst_1        
	//    4    7:istore_3        
		if(flag1)
	//*   5    8:iload           4
	//*   6   10:ifeq            48
		{
			TransitionValues transitionvalues = getMatchedTransitionValues(view, true);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:iconst_1        
	//   10   16:invokevirtual   #181 <Method TransitionValues getMatchedTransitionValues(View, boolean)>
	//   11   19:astore          5
			if(transitionvalues == null)
	//*  12   21:aload           5
	//*  13   23:ifnonnull       35
				return view == view1;
	//   14   26:aload_1         
	//   15   27:aload_2         
	//   16   28:if_acmpne       33
	//   17   31:iconst_1        
	//   18   32:ireturn         
	//   19   33:iconst_0        
	//   20   34:ireturn         
			if(view1 == transitionvalues.view)
	//*  21   35:aload_2         
	//*  22   36:aload           5
	//*  23   38:getfield        #115 <Field View TransitionValues.view>
	//*  24   41:if_acmpne       46
				return true;
	//   25   44:iconst_1        
	//   26   45:ireturn         
			flag = false;
	//   27   46:iconst_0        
	//   28   47:istore_3        
		}
		return flag;
	//   29   48:iload_3         
	//   30   49:ireturn         
	}

	public void captureEndValues(TransitionValues transitionvalues)
	{
		captureValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #185 <Method void captureValues(TransitionValues)>
	//    3    5:return          
	}

	public void captureStartValues(TransitionValues transitionvalues)
	{
		captureValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #185 <Method void captureValues(TransitionValues)>
	//    3    5:return          
	}

	public Animator createAnimator(final ViewGroup sceneRoot, final TransitionValues viewBounds, TransitionValues transitionvalues)
	{
label0:
		{
label1:
			{
				final View view;
label2:
				{
					int i;
					int j1;
					final int endLeft;
					int i2;
					final int endTop;
					int j2;
					final int endRight;
					int k2;
					final int endBottom;
					int l2;
					int i3;
					int j3;
					int k3;
					final Object finalClip;
label3:
					{
						if(viewBounds == null || transitionvalues == null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          1105
	//*   2    4:aload_3         
	//*   3    5:ifnonnull       11
							break label0;
	//    4    8:goto            1105
						finalClip = ((Object) (viewBounds.values));
	//    5   11:aload_2         
	//    6   12:getfield        #134 <Field Map TransitionValues.values>
	//    7   15:astore          20
						view = ((View) (transitionvalues.values));
	//    8   17:aload_3         
	//    9   18:getfield        #134 <Field Map TransitionValues.values>
	//   10   21:astore          19
						finalClip = ((Object) ((ViewGroup)((Map) (finalClip)).get("android:changeBounds:parent")));
	//   11   23:aload           20
	//   12   25:ldc1            #56  <String "android:changeBounds:parent">
	//   13   27:invokeinterface #194 <Method Object Map.get(Object)>
	//   14   32:checkcast       #196 <Class ViewGroup>
	//   15   35:astore          20
						ViewGroup viewgroup = (ViewGroup)((Map) (view)).get("android:changeBounds:parent");
	//   16   37:aload           19
	//   17   39:ldc1            #56  <String "android:changeBounds:parent">
	//   18   41:invokeinterface #194 <Method Object Map.get(Object)>
	//   19   46:checkcast       #196 <Class ViewGroup>
	//   20   49:astore          21
						if(finalClip == null || viewgroup == null)
	//*  21   51:aload           20
	//*  22   53:ifnull          1103
	//*  23   56:aload           21
	//*  24   58:ifnonnull       64
							break label1;
	//   25   61:goto            1103
						view = transitionvalues.view;
	//   26   64:aload_3         
	//   27   65:getfield        #115 <Field View TransitionValues.view>
	//   28   68:astore          19
						if(!parentMatches(((View) (finalClip)), ((View) (viewgroup))))
							break label2;
	//   29   70:aload_0         
	//   30   71:aload           20
	//   31   73:aload           21
	//   32   75:invokespecial   #198 <Method boolean parentMatches(View, View)>
	//   33   78:ifeq            851
						sceneRoot = ((ViewGroup) ((Rect)viewBounds.values.get("android:changeBounds:bounds")));
	//   34   81:aload_2         
	//   35   82:getfield        #134 <Field Map TransitionValues.values>
	//   36   85:ldc1            #52  <String "android:changeBounds:bounds">
	//   37   87:invokeinterface #194 <Method Object Map.get(Object)>
	//   38   92:checkcast       #136 <Class Rect>
	//   39   95:astore_1        
						finalClip = ((Object) ((Rect)transitionvalues.values.get("android:changeBounds:bounds")));
	//   40   96:aload_3         
	//   41   97:getfield        #134 <Field Map TransitionValues.values>
	//   42  100:ldc1            #52  <String "android:changeBounds:bounds">
	//   43  102:invokeinterface #194 <Method Object Map.get(Object)>
	//   44  107:checkcast       #136 <Class Rect>
	//   45  110:astore          20
						j1 = ((Rect) (sceneRoot)).left;
	//   46  112:aload_1         
	//   47  113:getfield        #202 <Field int Rect.left>
	//   48  116:istore          7
						endLeft = ((Rect) (finalClip)).left;
	//   49  118:aload           20
	//   50  120:getfield        #202 <Field int Rect.left>
	//   51  123:istore          8
						i2 = ((Rect) (sceneRoot)).top;
	//   52  125:aload_1         
	//   53  126:getfield        #205 <Field int Rect.top>
	//   54  129:istore          9
						endTop = ((Rect) (finalClip)).top;
	//   55  131:aload           20
	//   56  133:getfield        #205 <Field int Rect.top>
	//   57  136:istore          10
						j2 = ((Rect) (sceneRoot)).right;
	//   58  138:aload_1         
	//   59  139:getfield        #208 <Field int Rect.right>
	//   60  142:istore          11
						endRight = ((Rect) (finalClip)).right;
	//   61  144:aload           20
	//   62  146:getfield        #208 <Field int Rect.right>
	//   63  149:istore          12
						k2 = ((Rect) (sceneRoot)).bottom;
	//   64  151:aload_1         
	//   65  152:getfield        #211 <Field int Rect.bottom>
	//   66  155:istore          13
						endBottom = ((Rect) (finalClip)).bottom;
	//   67  157:aload           20
	//   68  159:getfield        #211 <Field int Rect.bottom>
	//   69  162:istore          14
						l2 = j2 - j1;
	//   70  164:iload           11
	//   71  166:iload           7
	//   72  168:isub            
	//   73  169:istore          15
						i3 = k2 - i2;
	//   74  171:iload           13
	//   75  173:iload           9
	//   76  175:isub            
	//   77  176:istore          16
						j3 = endRight - endLeft;
	//   78  178:iload           12
	//   79  180:iload           8
	//   80  182:isub            
	//   81  183:istore          17
						k3 = endBottom - endTop;
	//   82  185:iload           14
	//   83  187:iload           10
	//   84  189:isub            
	//   85  190:istore          18
						viewBounds = ((TransitionValues) ((Rect)viewBounds.values.get("android:changeBounds:clip")));
	//   86  192:aload_2         
	//   87  193:getfield        #134 <Field Map TransitionValues.values>
	//   88  196:ldc1            #54  <String "android:changeBounds:clip">
	//   89  198:invokeinterface #194 <Method Object Map.get(Object)>
	//   90  203:checkcast       #136 <Class Rect>
	//   91  206:astore_2        
						finalClip = ((Object) ((Rect)transitionvalues.values.get("android:changeBounds:clip")));
	//   92  207:aload_3         
	//   93  208:getfield        #134 <Field Map TransitionValues.values>
	//   94  211:ldc1            #54  <String "android:changeBounds:clip">
	//   95  213:invokeinterface #194 <Method Object Map.get(Object)>
	//   96  218:checkcast       #136 <Class Rect>
	//   97  221:astore          20
						if(l2 != 0 && i3 != 0 || j3 != 0 && k3 != 0)
	//*  98  223:iload           15
	//*  99  225:ifeq            233
	//* 100  228:iload           16
	//* 101  230:ifne            243
	//* 102  233:iload           17
	//* 103  235:ifeq            296
	//* 104  238:iload           18
	//* 105  240:ifeq            296
						{
							int k;
							if(j1 == endLeft && i2 == endTop)
	//* 106  243:iload           7
	//* 107  245:iload           8
	//* 108  247:icmpne          266
	//* 109  250:iload           9
	//* 110  252:iload           10
	//* 111  254:icmpeq          260
	//* 112  257:goto            266
								k = 0;
	//  113  260:iconst_0        
	//  114  261:istore          6
							else
	//* 115  263:goto            269
								k = 1;
	//  116  266:iconst_1        
	//  117  267:istore          6
							if(j2 == endRight)
	//* 118  269:iload           11
	//* 119  271:iload           12
	//* 120  273:icmpne          287
							{
								i = k;
	//  121  276:iload           6
	//  122  278:istore          5
								if(k2 == endBottom)
									break label3;
	//  123  280:iload           13
	//  124  282:iload           14
	//  125  284:icmpeq          299
							}
							i = k + 1;
	//  126  287:iload           6
	//  127  289:iconst_1        
	//  128  290:iadd            
	//  129  291:istore          5
						} else
	//* 130  293:goto            299
						{
							i = 0;
	//  131  296:iconst_0        
	//  132  297:istore          5
						}
					}
					int l;
label4:
					{
						if(viewBounds == null || ((Rect) (viewBounds)).equals(finalClip))
	//* 133  299:aload_2         
	//* 134  300:ifnull          312
	//* 135  303:aload_2         
	//* 136  304:aload           20
	//* 137  306:invokevirtual   #215 <Method boolean Rect.equals(Object)>
	//* 138  309:ifeq            329
						{
							l = i;
	//  139  312:iload           5
	//  140  314:istore          6
							if(viewBounds != null)
								break label4;
	//  141  316:aload_2         
	//  142  317:ifnonnull       335
							l = i;
	//  143  320:iload           5
	//  144  322:istore          6
							if(finalClip == null)
								break label4;
	//  145  324:aload           20
	//  146  326:ifnull          335
						}
						l = i + 1;
	//  147  329:iload           5
	//  148  331:iconst_1        
	//  149  332:iadd            
	//  150  333:istore          6
					}
					if(l > 0)
	//* 151  335:iload           6
	//* 152  337:ifle            849
					{
						if(!mResizeClip)
	//* 153  340:aload_0         
	//* 154  341:getfield        #105 <Field boolean mResizeClip>
	//* 155  344:ifne            604
						{
							sceneRoot = ((ViewGroup) (view));
	//  156  347:aload           19
	//  157  349:astore_1        
							ViewUtils.setLeftTopRightBottom(((View) (sceneRoot)), j1, i2, j2, k2);
	//  158  350:aload_1         
	//  159  351:iload           7
	//  160  353:iload           9
	//  161  355:iload           11
	//  162  357:iload           13
	//  163  359:invokestatic    #221 <Method void ViewUtils.setLeftTopRightBottom(View, int, int, int, int)>
							if(l == 2)
	//* 164  362:iload           6
	//* 165  364:iconst_2        
	//* 166  365:icmpne          523
							{
								if(l2 == j3 && i3 == k3)
	//* 167  368:iload           15
	//* 168  370:iload           17
	//* 169  372:icmpne          414
	//* 170  375:iload           16
	//* 171  377:iload           18
	//* 172  379:icmpne          414
								{
									viewBounds = ((TransitionValues) (getPathMotion().getPath(j1, i2, endLeft, endTop)));
	//  173  382:aload_0         
	//  174  383:invokevirtual   #225 <Method PathMotion getPathMotion()>
	//  175  386:iload           7
	//  176  388:i2f             
	//  177  389:iload           9
	//  178  391:i2f             
	//  179  392:iload           8
	//  180  394:i2f             
	//  181  395:iload           10
	//  182  397:i2f             
	//  183  398:invokevirtual   #231 <Method android.graphics.Path PathMotion.getPath(float, float, float, float)>
	//  184  401:astore_2        
									sceneRoot = ((ViewGroup) (ObjectAnimatorUtils.ofPointF(((Object) (sceneRoot)), POSITION_PROPERTY, ((android.graphics.Path) (viewBounds)))));
	//  185  402:aload_1         
	//  186  403:getstatic       #93  <Field Property POSITION_PROPERTY>
	//  187  406:aload_2         
	//  188  407:invokestatic    #237 <Method ObjectAnimator ObjectAnimatorUtils.ofPointF(Object, Property, android.graphics.Path)>
	//  189  410:astore_1        
								} else
	//* 190  411:goto            808
								{
									viewBounds = ((TransitionValues) (new ViewBounds(((View) (sceneRoot)))));
	//  191  414:new             #26  <Class ChangeBounds$ViewBounds>
	//  192  417:dup             
	//  193  418:aload_1         
	//  194  419:invokespecial   #240 <Method void ChangeBounds$ViewBounds(View)>
	//  195  422:astore_2        
									sceneRoot = ((ViewGroup) (getPathMotion().getPath(j1, i2, endLeft, endTop)));
	//  196  423:aload_0         
	//  197  424:invokevirtual   #225 <Method PathMotion getPathMotion()>
	//  198  427:iload           7
	//  199  429:i2f             
	//  200  430:iload           9
	//  201  432:i2f             
	//  202  433:iload           8
	//  203  435:i2f             
	//  204  436:iload           10
	//  205  438:i2f             
	//  206  439:invokevirtual   #231 <Method android.graphics.Path PathMotion.getPath(float, float, float, float)>
	//  207  442:astore_1        
									transitionvalues = ((TransitionValues) (ObjectAnimatorUtils.ofPointF(((Object) (viewBounds)), TOP_LEFT_PROPERTY, ((android.graphics.Path) (sceneRoot)))));
	//  208  443:aload_2         
	//  209  444:getstatic       #77  <Field Property TOP_LEFT_PROPERTY>
	//  210  447:aload_1         
	//  211  448:invokestatic    #237 <Method ObjectAnimator ObjectAnimatorUtils.ofPointF(Object, Property, android.graphics.Path)>
	//  212  451:astore_3        
									sceneRoot = ((ViewGroup) (getPathMotion().getPath(j2, k2, endRight, endBottom)));
	//  213  452:aload_0         
	//  214  453:invokevirtual   #225 <Method PathMotion getPathMotion()>
	//  215  456:iload           11
	//  216  458:i2f             
	//  217  459:iload           13
	//  218  461:i2f             
	//  219  462:iload           12
	//  220  464:i2f             
	//  221  465:iload           14
	//  222  467:i2f             
	//  223  468:invokevirtual   #231 <Method android.graphics.Path PathMotion.getPath(float, float, float, float)>
	//  224  471:astore_1        
									finalClip = ((Object) (ObjectAnimatorUtils.ofPointF(((Object) (viewBounds)), BOTTOM_RIGHT_PROPERTY, ((android.graphics.Path) (sceneRoot)))));
	//  225  472:aload_2         
	//  226  473:getstatic       #82  <Field Property BOTTOM_RIGHT_PROPERTY>
	//  227  476:aload_1         
	//  228  477:invokestatic    #237 <Method ObjectAnimator ObjectAnimatorUtils.ofPointF(Object, Property, android.graphics.Path)>
	//  229  480:astore          20
									sceneRoot = ((ViewGroup) (new AnimatorSet()));
	//  230  482:new             #242 <Class AnimatorSet>
	//  231  485:dup             
	//  232  486:invokespecial   #243 <Method void AnimatorSet()>
	//  233  489:astore_1        
									((AnimatorSet) (sceneRoot)).playTogether(new Animator[] {
										transitionvalues, finalClip
									});
	//  234  490:aload_1         
	//  235  491:iconst_2        
	//  236  492:anewarray       Animator[]
	//  237  495:dup             
	//  238  496:iconst_0        
	//  239  497:aload_3         
	//  240  498:aastore         
	//  241  499:dup             
	//  242  500:iconst_1        
	//  243  501:aload           20
	//  244  503:aastore         
	//  245  504:invokevirtual   #249 <Method void AnimatorSet.playTogether(Animator[])>
									((AnimatorSet) (sceneRoot)).addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

										private ViewBounds mViewBounds;
										final ChangeBounds this$0;
										final ViewBounds val$viewBounds;

			
			{
				this$0 = ChangeBounds.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ChangeBounds this$0>
				viewBounds = viewbounds;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field ChangeBounds$ViewBounds val$viewBounds>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void AnimatorListenerAdapter()>
				mViewBounds = viewBounds;
			//    8   14:aload_0         
			//    9   15:aload_0         
			//   10   16:getfield        #20  <Field ChangeBounds$ViewBounds val$viewBounds>
			//   11   19:putfield        #25  <Field ChangeBounds$ViewBounds mViewBounds>
			//   12   22:return          
			}
									}
)));
	//  246  507:aload_1         
	//  247  508:new             #20  <Class ChangeBounds$7>
	//  248  511:dup             
	//  249  512:aload_0         
	//  250  513:aload_2         
	//  251  514:invokespecial   #252 <Method void ChangeBounds$7(ChangeBounds, ChangeBounds$ViewBounds)>
	//  252  517:invokevirtual   #256 <Method void AnimatorSet.addListener(android.animation.Animator$AnimatorListener)>
								}
							} else
	//* 253  520:goto            808
							if(j1 == endLeft && i2 == endTop)
	//* 254  523:iload           7
	//* 255  525:iload           8
	//* 256  527:icmpne          572
	//* 257  530:iload           9
	//* 258  532:iload           10
	//* 259  534:icmpeq          540
	//* 260  537:goto            572
							{
								viewBounds = ((TransitionValues) (getPathMotion().getPath(j2, k2, endRight, endBottom)));
	//  261  540:aload_0         
	//  262  541:invokevirtual   #225 <Method PathMotion getPathMotion()>
	//  263  544:iload           11
	//  264  546:i2f             
	//  265  547:iload           13
	//  266  549:i2f             
	//  267  550:iload           12
	//  268  552:i2f             
	//  269  553:iload           14
	//  270  555:i2f             
	//  271  556:invokevirtual   #231 <Method android.graphics.Path PathMotion.getPath(float, float, float, float)>
	//  272  559:astore_2        
								sceneRoot = ((ViewGroup) (ObjectAnimatorUtils.ofPointF(((Object) (sceneRoot)), BOTTOM_RIGHT_ONLY_PROPERTY, ((android.graphics.Path) (viewBounds)))));
	//  273  560:aload_1         
	//  274  561:getstatic       #85  <Field Property BOTTOM_RIGHT_ONLY_PROPERTY>
	//  275  564:aload_2         
	//  276  565:invokestatic    #237 <Method ObjectAnimator ObjectAnimatorUtils.ofPointF(Object, Property, android.graphics.Path)>
	//  277  568:astore_1        
							} else
	//* 278  569:goto            808
							{
								viewBounds = ((TransitionValues) (getPathMotion().getPath(j1, i2, endLeft, endTop)));
	//  279  572:aload_0         
	//  280  573:invokevirtual   #225 <Method PathMotion getPathMotion()>
	//  281  576:iload           7
	//  282  578:i2f             
	//  283  579:iload           9
	//  284  581:i2f             
	//  285  582:iload           8
	//  286  584:i2f             
	//  287  585:iload           10
	//  288  587:i2f             
	//  289  588:invokevirtual   #231 <Method android.graphics.Path PathMotion.getPath(float, float, float, float)>
	//  290  591:astore_2        
								sceneRoot = ((ViewGroup) (ObjectAnimatorUtils.ofPointF(((Object) (sceneRoot)), TOP_LEFT_ONLY_PROPERTY, ((android.graphics.Path) (viewBounds)))));
	//  291  592:aload_1         
	//  292  593:getstatic       #88  <Field Property TOP_LEFT_ONLY_PROPERTY>
	//  293  596:aload_2         
	//  294  597:invokestatic    #237 <Method ObjectAnimator ObjectAnimatorUtils.ofPointF(Object, Property, android.graphics.Path)>
	//  295  600:astore_1        
							}
						} else
	//* 296  601:goto            808
						{
							final View view = view;
	//  297  604:aload           19
	//  298  606:astore          21
							ViewUtils.setLeftTopRightBottom(view, j1, i2, Math.max(l2, j3) + j1, Math.max(i3, k3) + i2);
	//  299  608:aload           21
	//  300  610:iload           7
	//  301  612:iload           9
	//  302  614:iload           15
	//  303  616:iload           17
	//  304  618:invokestatic    #262 <Method int Math.max(int, int)>
	//  305  621:iload           7
	//  306  623:iadd            
	//  307  624:iload           16
	//  308  626:iload           18
	//  309  628:invokestatic    #262 <Method int Math.max(int, int)>
	//  310  631:iload           9
	//  311  633:iadd            
	//  312  634:invokestatic    #221 <Method void ViewUtils.setLeftTopRightBottom(View, int, int, int, int)>
							if(j1 == endLeft && i2 == endTop)
	//* 313  637:iload           7
	//* 314  639:iload           8
	//* 315  641:icmpne          659
	//* 316  644:iload           9
	//* 317  646:iload           10
	//* 318  648:icmpeq          654
	//* 319  651:goto            659
							{
								sceneRoot = null;
	//  320  654:aconst_null     
	//  321  655:astore_1        
							} else
	//* 322  656:goto            689
							{
								sceneRoot = ((ViewGroup) (getPathMotion().getPath(j1, i2, endLeft, endTop)));
	//  323  659:aload_0         
	//  324  660:invokevirtual   #225 <Method PathMotion getPathMotion()>
	//  325  663:iload           7
	//  326  665:i2f             
	//  327  666:iload           9
	//  328  668:i2f             
	//  329  669:iload           8
	//  330  671:i2f             
	//  331  672:iload           10
	//  332  674:i2f             
	//  333  675:invokevirtual   #231 <Method android.graphics.Path PathMotion.getPath(float, float, float, float)>
	//  334  678:astore_1        
								sceneRoot = ((ViewGroup) (ObjectAnimatorUtils.ofPointF(((Object) (view)), POSITION_PROPERTY, ((android.graphics.Path) (sceneRoot)))));
	//  335  679:aload           21
	//  336  681:getstatic       #93  <Field Property POSITION_PROPERTY>
	//  337  684:aload_1         
	//  338  685:invokestatic    #237 <Method ObjectAnimator ObjectAnimatorUtils.ofPointF(Object, Property, android.graphics.Path)>
	//  339  688:astore_1        
							}
							if(viewBounds == null)
	//* 340  689:aload_2         
	//* 341  690:ifnonnull       710
								viewBounds = ((TransitionValues) (new Rect(0, 0, l2, i3)));
	//  342  693:new             #136 <Class Rect>
	//  343  696:dup             
	//  344  697:iconst_0        
	//  345  698:iconst_0        
	//  346  699:iload           15
	//  347  701:iload           16
	//  348  703:invokespecial   #151 <Method void Rect(int, int, int, int)>
	//  349  706:astore_2        
	//* 350  707:goto            710
							if(finalClip == null)
	//* 351  710:aload           20
	//* 352  712:ifnonnull       732
								transitionvalues = ((TransitionValues) (new Rect(0, 0, j3, k3)));
	//  353  715:new             #136 <Class Rect>
	//  354  718:dup             
	//  355  719:iconst_0        
	//  356  720:iconst_0        
	//  357  721:iload           17
	//  358  723:iload           18
	//  359  725:invokespecial   #151 <Method void Rect(int, int, int, int)>
	//  360  728:astore_3        
							else
	//* 361  729:goto            735
								transitionvalues = ((TransitionValues) (finalClip));
	//  362  732:aload           20
	//  363  734:astore_3        
							if(!((Rect) (viewBounds)).equals(((Object) (transitionvalues))))
	//* 364  735:aload_2         
	//* 365  736:aload_3         
	//* 366  737:invokevirtual   #215 <Method boolean Rect.equals(Object)>
	//* 367  740:ifne            800
							{
								ViewCompat.setClipBounds(view, ((Rect) (viewBounds)));
	//  368  743:aload           21
	//  369  745:aload_2         
	//  370  746:invokestatic    #266 <Method void ViewCompat.setClipBounds(View, Rect)>
								viewBounds = ((TransitionValues) (ObjectAnimator.ofObject(((Object) (view)), "clipBounds", ((android.animation.TypeEvaluator) (sRectEvaluator)), new Object[] {
									viewBounds, transitionvalues
								})));
	//  371  749:aload           21
	//  372  751:ldc2            #268 <String "clipBounds">
	//  373  754:getstatic       #99  <Field RectEvaluator sRectEvaluator>
	//  374  757:iconst_2        
	//  375  758:anewarray       Object[]
	//  376  761:dup             
	//  377  762:iconst_0        
	//  378  763:aload_2         
	//  379  764:aastore         
	//  380  765:dup             
	//  381  766:iconst_1        
	//  382  767:aload_3         
	//  383  768:aastore         
	//  384  769:invokestatic    #276 <Method ObjectAnimator ObjectAnimator.ofObject(Object, String, android.animation.TypeEvaluator, Object[])>
	//  385  772:astore_2        
								((ObjectAnimator) (viewBounds)).addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

									public void onAnimationCancel(Animator animator)
									{
										mIsCanceled = true;
									//    0    0:aload_0         
									//    1    1:iconst_1        
									//    2    2:putfield        #46  <Field boolean mIsCanceled>
									//    3    5:return          
									}

									public void onAnimationEnd(Animator animator)
									{
										if(!mIsCanceled)
									//*   0    0:aload_0         
									//*   1    1:getfield        #46  <Field boolean mIsCanceled>
									//*   2    4:ifne            41
										{
											ViewCompat.setClipBounds(view, finalClip);
									//    3    7:aload_0         
									//    4    8:getfield        #28  <Field View val$view>
									//    5   11:aload_0         
									//    6   12:getfield        #30  <Field Rect val$finalClip>
									//    7   15:invokestatic    #53  <Method void ViewCompat.setClipBounds(View, Rect)>
											ViewUtils.setLeftTopRightBottom(view, endLeft, endTop, endRight, endBottom);
									//    8   18:aload_0         
									//    9   19:getfield        #28  <Field View val$view>
									//   10   22:aload_0         
									//   11   23:getfield        #32  <Field int val$endLeft>
									//   12   26:aload_0         
									//   13   27:getfield        #34  <Field int val$endTop>
									//   14   30:aload_0         
									//   15   31:getfield        #36  <Field int val$endRight>
									//   16   34:aload_0         
									//   17   35:getfield        #38  <Field int val$endBottom>
									//   18   38:invokestatic    #59  <Method void ViewUtils.setLeftTopRightBottom(View, int, int, int, int)>
										}
									//   19   41:return          
									}

									private boolean mIsCanceled;
									final ChangeBounds this$0;
									final int val$endBottom;
									final int val$endLeft;
									final int val$endRight;
									final int val$endTop;
									final Rect val$finalClip;
									final View val$view;

			
			{
				this$0 = ChangeBounds.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field ChangeBounds this$0>
				view = view1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field View val$view>
				finalClip = rect;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field Rect val$finalClip>
				endLeft = i;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #32  <Field int val$endLeft>
				endTop = j;
			//   12   21:aload_0         
			//   13   22:iload           5
			//   14   24:putfield        #34  <Field int val$endTop>
				endRight = k;
			//   15   27:aload_0         
			//   16   28:iload           6
			//   17   30:putfield        #36  <Field int val$endRight>
				endBottom = l;
			//   18   33:aload_0         
			//   19   34:iload           7
			//   20   36:putfield        #38  <Field int val$endBottom>
				super();
			//   21   39:aload_0         
			//   22   40:invokespecial   #41  <Method void AnimatorListenerAdapter()>
			//   23   43:return          
			}
								}
)));
	//  386  773:aload_2         
	//  387  774:new             #22  <Class ChangeBounds$8>
	//  388  777:dup             
	//  389  778:aload_0         
	//  390  779:aload           21
	//  391  781:aload           20
	//  392  783:iload           8
	//  393  785:iload           10
	//  394  787:iload           12
	//  395  789:iload           14
	//  396  791:invokespecial   #279 <Method void ChangeBounds$8(ChangeBounds, View, Rect, int, int, int, int)>
	//  397  794:invokevirtual   #280 <Method void ObjectAnimator.addListener(android.animation.Animator$AnimatorListener)>
							} else
	//* 398  797:goto            802
							{
								viewBounds = null;
	//  399  800:aconst_null     
	//  400  801:astore_2        
							}
							sceneRoot = ((ViewGroup) (TransitionUtils.mergeAnimators(((Animator) (sceneRoot)), ((Animator) (viewBounds)))));
	//  401  802:aload_1         
	//  402  803:aload_2         
	//  403  804:invokestatic    #286 <Method Animator TransitionUtils.mergeAnimators(Animator, Animator)>
	//  404  807:astore_1        
						}
						if(view.getParent() instanceof ViewGroup)
	//* 405  808:aload           19
	//* 406  810:invokevirtual   #161 <Method android.view.ViewParent View.getParent()>
	//* 407  813:instanceof      #196 <Class ViewGroup>
	//* 408  816:ifeq            847
						{
							viewBounds = ((TransitionValues) ((ViewGroup)view.getParent()));
	//  409  819:aload           19
	//  410  821:invokevirtual   #161 <Method android.view.ViewParent View.getParent()>
	//  411  824:checkcast       #196 <Class ViewGroup>
	//  412  827:astore_2        
							ViewGroupUtils.suppressLayout(((ViewGroup) (viewBounds)), true);
	//  413  828:aload_2         
	//  414  829:iconst_1        
	//  415  830:invokestatic    #292 <Method void ViewGroupUtils.suppressLayout(ViewGroup, boolean)>
							addListener(((Transition.TransitionListener) (new TransitionListenerAdapter() {

								public void onTransitionCancel(Transition transition)
								{
									ViewGroupUtils.suppressLayout(parent, false);
								//    0    0:aload_0         
								//    1    1:getfield        #21  <Field ViewGroup val$parent>
								//    2    4:iconst_0        
								//    3    5:invokestatic    #36  <Method void ViewGroupUtils.suppressLayout(ViewGroup, boolean)>
									mCanceled = true;
								//    4    8:aload_0         
								//    5    9:iconst_1        
								//    6   10:putfield        #26  <Field boolean mCanceled>
								//    7   13:return          
								}

								public void onTransitionEnd(Transition transition)
								{
									if(!mCanceled)
								//*   0    0:aload_0         
								//*   1    1:getfield        #26  <Field boolean mCanceled>
								//*   2    4:ifne            15
										ViewGroupUtils.suppressLayout(parent, false);
								//    3    7:aload_0         
								//    4    8:getfield        #21  <Field ViewGroup val$parent>
								//    5   11:iconst_0        
								//    6   12:invokestatic    #36  <Method void ViewGroupUtils.suppressLayout(ViewGroup, boolean)>
									transition.removeListener(((Transition.TransitionListener) (this)));
								//    7   15:aload_1         
								//    8   16:aload_0         
								//    9   17:invokevirtual   #44  <Method Transition Transition.removeListener(Transition$TransitionListener)>
								//   10   20:pop             
								//   11   21:return          
								}

								public void onTransitionPause(Transition transition)
								{
									ViewGroupUtils.suppressLayout(parent, false);
								//    0    0:aload_0         
								//    1    1:getfield        #21  <Field ViewGroup val$parent>
								//    2    4:iconst_0        
								//    3    5:invokestatic    #36  <Method void ViewGroupUtils.suppressLayout(ViewGroup, boolean)>
								//    4    8:return          
								}

								public void onTransitionResume(Transition transition)
								{
									ViewGroupUtils.suppressLayout(parent, true);
								//    0    0:aload_0         
								//    1    1:getfield        #21  <Field ViewGroup val$parent>
								//    2    4:iconst_1        
								//    3    5:invokestatic    #36  <Method void ViewGroupUtils.suppressLayout(ViewGroup, boolean)>
								//    4    8:return          
								}

								boolean mCanceled;
								final ChangeBounds this$0;
								final ViewGroup val$parent;

			
			{
				this$0 = ChangeBounds.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ChangeBounds this$0>
				parent = viewgroup;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field ViewGroup val$parent>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void TransitionListenerAdapter()>
				mCanceled = false;
			//    8   14:aload_0         
			//    9   15:iconst_0        
			//   10   16:putfield        #26  <Field boolean mCanceled>
			//   11   19:return          
			}
							}
)));
	//  416  833:aload_0         
	//  417  834:new             #24  <Class ChangeBounds$9>
	//  418  837:dup             
	//  419  838:aload_0         
	//  420  839:aload_2         
	//  421  840:invokespecial   #295 <Method void ChangeBounds$9(ChangeBounds, ViewGroup)>
	//  422  843:invokevirtual   #298 <Method Transition addListener(Transition$TransitionListener)>
	//  423  846:pop             
						}
						return ((Animator) (sceneRoot));
	//  424  847:aload_1         
	//  425  848:areturn         
					} else
					{
						return null;
	//  426  849:aconst_null     
	//  427  850:areturn         
					}
				}
				int j = ((Integer)viewBounds.values.get("android:changeBounds:windowX")).intValue();
	//  428  851:aload_2         
	//  429  852:getfield        #134 <Field Map TransitionValues.values>
	//  430  855:ldc1            #58  <String "android:changeBounds:windowX">
	//  431  857:invokeinterface #194 <Method Object Map.get(Object)>
	//  432  862:checkcast       #167 <Class Integer>
	//  433  865:invokevirtual   #301 <Method int Integer.intValue()>
	//  434  868:istore          5
				int i1 = ((Integer)viewBounds.values.get("android:changeBounds:windowY")).intValue();
	//  435  870:aload_2         
	//  436  871:getfield        #134 <Field Map TransitionValues.values>
	//  437  874:ldc1            #60  <String "android:changeBounds:windowY">
	//  438  876:invokeinterface #194 <Method Object Map.get(Object)>
	//  439  881:checkcast       #167 <Class Integer>
	//  440  884:invokevirtual   #301 <Method int Integer.intValue()>
	//  441  887:istore          6
				int k1 = ((Integer)transitionvalues.values.get("android:changeBounds:windowX")).intValue();
	//  442  889:aload_3         
	//  443  890:getfield        #134 <Field Map TransitionValues.values>
	//  444  893:ldc1            #58  <String "android:changeBounds:windowX">
	//  445  895:invokeinterface #194 <Method Object Map.get(Object)>
	//  446  900:checkcast       #167 <Class Integer>
	//  447  903:invokevirtual   #301 <Method int Integer.intValue()>
	//  448  906:istore          7
				int l1 = ((Integer)transitionvalues.values.get("android:changeBounds:windowY")).intValue();
	//  449  908:aload_3         
	//  450  909:getfield        #134 <Field Map TransitionValues.values>
	//  451  912:ldc1            #60  <String "android:changeBounds:windowY">
	//  452  914:invokeinterface #194 <Method Object Map.get(Object)>
	//  453  919:checkcast       #167 <Class Integer>
	//  454  922:invokevirtual   #301 <Method int Integer.intValue()>
	//  455  925:istore          8
				if(j == k1 && i1 == l1)
	//* 456  927:iload           5
	//* 457  929:iload           7
	//* 458  931:icmpne          946
	//* 459  934:iload           6
	//* 460  936:iload           8
	//* 461  938:icmpeq          944
	//* 462  941:goto            946
				{
					return null;
	//  463  944:aconst_null     
	//  464  945:areturn         
				} else
				{
					sceneRoot.getLocationInWindow(mTempLocation);
	//  465  946:aload_1         
	//  466  947:aload_0         
	//  467  948:getfield        #103 <Field int[] mTempLocation>
	//  468  951:invokevirtual   #302 <Method void ViewGroup.getLocationInWindow(int[])>
					viewBounds = ((TransitionValues) (Bitmap.createBitmap(view.getWidth(), view.getHeight(), android.graphics.Bitmap.Config.ARGB_8888)));
	//  469  954:aload           19
	//  470  956:invokevirtual   #127 <Method int View.getWidth()>
	//  471  959:aload           19
	//  472  961:invokevirtual   #130 <Method int View.getHeight()>
	//  473  964:getstatic       #308 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//  474  967:invokestatic    #314 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//  475  970:astore_2        
					view.draw(new Canvas(((Bitmap) (viewBounds))));
	//  476  971:aload           19
	//  477  973:new             #316 <Class Canvas>
	//  478  976:dup             
	//  479  977:aload_2         
	//  480  978:invokespecial   #319 <Method void Canvas(Bitmap)>
	//  481  981:invokevirtual   #323 <Method void View.draw(Canvas)>
					viewBounds = ((TransitionValues) (new BitmapDrawable(((Bitmap) (viewBounds)))));
	//  482  984:new             #325 <Class BitmapDrawable>
	//  483  987:dup             
	//  484  988:aload_2         
	//  485  989:invokespecial   #326 <Method void BitmapDrawable(Bitmap)>
	//  486  992:astore_2        
					final float transitionAlpha = ViewUtils.getTransitionAlpha(view);
	//  487  993:aload           19
	//  488  995:invokestatic    #330 <Method float ViewUtils.getTransitionAlpha(View)>
	//  489  998:fstore          4
					ViewUtils.setTransitionAlpha(view, 0.0F);
	//  490 1000:aload           19
	//  491 1002:fconst_0        
	//  492 1003:invokestatic    #334 <Method void ViewUtils.setTransitionAlpha(View, float)>
					ViewUtils.getOverlay(((View) (sceneRoot))).add(((Drawable) (viewBounds)));
	//  493 1006:aload_1         
	//  494 1007:invokestatic    #338 <Method ViewOverlayImpl ViewUtils.getOverlay(View)>
	//  495 1010:aload_2         
	//  496 1011:invokeinterface #344 <Method void ViewOverlayImpl.add(Drawable)>
					transitionvalues = ((TransitionValues) (getPathMotion()));
	//  497 1016:aload_0         
	//  498 1017:invokevirtual   #225 <Method PathMotion getPathMotion()>
	//  499 1020:astore_3        
					int ai[] = mTempLocation;
	//  500 1021:aload_0         
	//  501 1022:getfield        #103 <Field int[] mTempLocation>
	//  502 1025:astore          20
					transitionvalues = ((TransitionValues) (((PathMotion) (transitionvalues)).getPath(j - ai[0], i1 - ai[1], k1 - ai[0], l1 - ai[1])));
	//  503 1027:aload_3         
	//  504 1028:iload           5
	//  505 1030:aload           20
	//  506 1032:iconst_0        
	//  507 1033:iaload          
	//  508 1034:isub            
	//  509 1035:i2f             
	//  510 1036:iload           6
	//  511 1038:aload           20
	//  512 1040:iconst_1        
	//  513 1041:iaload          
	//  514 1042:isub            
	//  515 1043:i2f             
	//  516 1044:iload           7
	//  517 1046:aload           20
	//  518 1048:iconst_0        
	//  519 1049:iaload          
	//  520 1050:isub            
	//  521 1051:i2f             
	//  522 1052:iload           8
	//  523 1054:aload           20
	//  524 1056:iconst_1        
	//  525 1057:iaload          
	//  526 1058:isub            
	//  527 1059:i2f             
	//  528 1060:invokevirtual   #231 <Method android.graphics.Path PathMotion.getPath(float, float, float, float)>
	//  529 1063:astore_3        
					transitionvalues = ((TransitionValues) (ObjectAnimator.ofPropertyValuesHolder(((Object) (viewBounds)), new PropertyValuesHolder[] {
						PropertyValuesHolderUtils.ofPointF(DRAWABLE_ORIGIN_PROPERTY, ((android.graphics.Path) (transitionvalues)))
					})));
	//  530 1064:aload_2         
	//  531 1065:iconst_1        
	//  532 1066:anewarray       PropertyValuesHolder[]
	//  533 1069:dup             
	//  534 1070:iconst_0        
	//  535 1071:getstatic       #72  <Field Property DRAWABLE_ORIGIN_PROPERTY>
	//  536 1074:aload_3         
	//  537 1075:invokestatic    #351 <Method PropertyValuesHolder PropertyValuesHolderUtils.ofPointF(Property, android.graphics.Path)>
	//  538 1078:aastore         
	//  539 1079:invokestatic    #355 <Method ObjectAnimator ObjectAnimator.ofPropertyValuesHolder(Object, PropertyValuesHolder[])>
	//  540 1082:astore_3        
					((ObjectAnimator) (transitionvalues)).addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

						public void onAnimationEnd(Animator animator)
						{
							ViewUtils.getOverlay(((View) (sceneRoot))).remove(((Drawable) (drawable)));
						//    0    0:aload_0         
						//    1    1:getfield        #25  <Field ViewGroup val$sceneRoot>
						//    2    4:invokestatic    #43  <Method ViewOverlayImpl ViewUtils.getOverlay(View)>
						//    3    7:aload_0         
						//    4    8:getfield        #27  <Field BitmapDrawable val$drawable>
						//    5   11:invokeinterface #49  <Method void ViewOverlayImpl.remove(Drawable)>
							ViewUtils.setTransitionAlpha(view, transitionAlpha);
						//    6   16:aload_0         
						//    7   17:getfield        #29  <Field View val$view>
						//    8   20:aload_0         
						//    9   21:getfield        #31  <Field float val$transitionAlpha>
						//   10   24:invokestatic    #53  <Method void ViewUtils.setTransitionAlpha(View, float)>
						//   11   27:return          
						}

						final ChangeBounds this$0;
						final BitmapDrawable val$drawable;
						final ViewGroup val$sceneRoot;
						final float val$transitionAlpha;
						final View val$view;

			
			{
				this$0 = ChangeBounds.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field ChangeBounds this$0>
				sceneRoot = viewgroup;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field ViewGroup val$sceneRoot>
				drawable = bitmapdrawable;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field BitmapDrawable val$drawable>
				view = view1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field View val$view>
				transitionAlpha = f;
			//   12   21:aload_0         
			//   13   22:fload           5
			//   14   24:putfield        #31  <Field float val$transitionAlpha>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #34  <Method void AnimatorListenerAdapter()>
			//   17   31:return          
			}
					}
)));
	//  541 1083:aload_3         
	//  542 1084:new             #8   <Class ChangeBounds$10>
	//  543 1087:dup             
	//  544 1088:aload_0         
	//  545 1089:aload_1         
	//  546 1090:aload_2         
	//  547 1091:aload           19
	//  548 1093:fload           4
	//  549 1095:invokespecial   #358 <Method void ChangeBounds$10(ChangeBounds, ViewGroup, BitmapDrawable, View, float)>
	//  550 1098:invokevirtual   #280 <Method void ObjectAnimator.addListener(android.animation.Animator$AnimatorListener)>
					return ((Animator) (transitionvalues));
	//  551 1101:aload_3         
	//  552 1102:areturn         
				}
			}
			return null;
	//  553 1103:aconst_null     
	//  554 1104:areturn         
		}
		return null;
	//  555 1105:aconst_null     
	//  556 1106:areturn         
	}

	public String[] getTransitionProperties()
	{
		return sTransitionProperties;
	//    0    0:getstatic       #62  <Field String[] sTransitionProperties>
	//    1    3:areturn         
	}

	private static final Property BOTTOM_RIGHT_ONLY_PROPERTY = new Property(android/graphics/PointF, "bottomRight") {

		public PointF get(View view)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public volatile Object get(Object obj)
		{
			return ((Object) (get((View)obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #17  <Class View>
		//    3    5:invokevirtual   #19  <Method PointF get(View)>
		//    4    8:areturn         
		}

		public void set(View view, PointF pointf)
		{
			ViewUtils.setLeftTopRightBottom(view, view.getLeft(), view.getTop(), Math.round(pointf.x), Math.round(pointf.y));
		//    0    0:aload_1         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #25  <Method int View.getLeft()>
		//    3    5:aload_1         
		//    4    6:invokevirtual   #28  <Method int View.getTop()>
		//    5    9:aload_2         
		//    6   10:getfield        #34  <Field float PointF.x>
		//    7   13:invokestatic    #40  <Method int Math.round(float)>
		//    8   16:aload_2         
		//    9   17:getfield        #43  <Field float PointF.y>
		//   10   20:invokestatic    #40  <Method int Math.round(float)>
		//   11   23:invokestatic    #49  <Method void ViewUtils.setLeftTopRightBottom(View, int, int, int, int)>
		//   12   26:return          
		}

		public volatile void set(Object obj, Object obj1)
		{
			set((View)obj, (PointF)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #17  <Class View>
		//    3    5:aload_2         
		//    4    6:checkcast       #30  <Class PointF>
		//    5    9:invokevirtual   #52  <Method void set(View, PointF)>
		//    6   12:return          
		}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #11  <Method void Property(Class, String)>
			//    4    6:return          
			}
	}
;
	private static final Property BOTTOM_RIGHT_PROPERTY = new Property(android/graphics/PointF, "bottomRight") {

		public PointF get(ViewBounds viewbounds)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public volatile Object get(Object obj)
		{
			return ((Object) (get((ViewBounds)obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #17  <Class ChangeBounds$ViewBounds>
		//    3    5:invokevirtual   #19  <Method PointF get(ChangeBounds$ViewBounds)>
		//    4    8:areturn         
		}

		public void set(ViewBounds viewbounds, PointF pointf)
		{
			viewbounds.setBottomRight(pointf);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #25  <Method void ChangeBounds$ViewBounds.setBottomRight(PointF)>
		//    3    5:return          
		}

		public volatile void set(Object obj, Object obj1)
		{
			set((ViewBounds)obj, (PointF)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #17  <Class ChangeBounds$ViewBounds>
		//    3    5:aload_2         
		//    4    6:checkcast       #28  <Class PointF>
		//    5    9:invokevirtual   #30  <Method void set(ChangeBounds$ViewBounds, PointF)>
		//    6   12:return          
		}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #11  <Method void Property(Class, String)>
			//    4    6:return          
			}
	}
;
	private static final Property DRAWABLE_ORIGIN_PROPERTY = new Property(android/graphics/PointF, "boundsOrigin") {

		public PointF get(Drawable drawable)
		{
			drawable.copyBounds(mBounds);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #20  <Field Rect mBounds>
		//    3    5:invokevirtual   #29  <Method void Drawable.copyBounds(Rect)>
			return new PointF(mBounds.left, mBounds.top);
		//    4    8:new             #31  <Class PointF>
		//    5   11:dup             
		//    6   12:aload_0         
		//    7   13:getfield        #20  <Field Rect mBounds>
		//    8   16:getfield        #35  <Field int Rect.left>
		//    9   19:i2f             
		//   10   20:aload_0         
		//   11   21:getfield        #20  <Field Rect mBounds>
		//   12   24:getfield        #38  <Field int Rect.top>
		//   13   27:i2f             
		//   14   28:invokespecial   #41  <Method void PointF(float, float)>
		//   15   31:areturn         
		}

		public volatile Object get(Object obj)
		{
			return ((Object) (get((Drawable)obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #25  <Class Drawable>
		//    3    5:invokevirtual   #44  <Method PointF get(Drawable)>
		//    4    8:areturn         
		}

		public void set(Drawable drawable, PointF pointf)
		{
			drawable.copyBounds(mBounds);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #20  <Field Rect mBounds>
		//    3    5:invokevirtual   #29  <Method void Drawable.copyBounds(Rect)>
			mBounds.offsetTo(Math.round(pointf.x), Math.round(pointf.y));
		//    4    8:aload_0         
		//    5    9:getfield        #20  <Field Rect mBounds>
		//    6   12:aload_2         
		//    7   13:getfield        #50  <Field float PointF.x>
		//    8   16:invokestatic    #56  <Method int Math.round(float)>
		//    9   19:aload_2         
		//   10   20:getfield        #59  <Field float PointF.y>
		//   11   23:invokestatic    #56  <Method int Math.round(float)>
		//   12   26:invokevirtual   #63  <Method void Rect.offsetTo(int, int)>
			drawable.setBounds(mBounds);
		//   13   29:aload_1         
		//   14   30:aload_0         
		//   15   31:getfield        #20  <Field Rect mBounds>
		//   16   34:invokevirtual   #66  <Method void Drawable.setBounds(Rect)>
		//   17   37:return          
		}

		public volatile void set(Object obj, Object obj1)
		{
			set((Drawable)obj, (PointF)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #25  <Class Drawable>
		//    3    5:aload_2         
		//    4    6:checkcast       #31  <Class PointF>
		//    5    9:invokevirtual   #69  <Method void set(Drawable, PointF)>
		//    6   12:return          
		}

		private Rect mBounds;

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #13  <Method void Property(Class, String)>
				mBounds = new Rect();
			//    4    6:aload_0         
			//    5    7:new             #15  <Class Rect>
			//    6   10:dup             
			//    7   11:invokespecial   #18  <Method void Rect()>
			//    8   14:putfield        #20  <Field Rect mBounds>
			//    9   17:return          
			}
	}
;
	private static final Property POSITION_PROPERTY = new Property(android/graphics/PointF, "position") {

		public PointF get(View view)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public volatile Object get(Object obj)
		{
			return ((Object) (get((View)obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #17  <Class View>
		//    3    5:invokevirtual   #19  <Method PointF get(View)>
		//    4    8:areturn         
		}

		public void set(View view, PointF pointf)
		{
			int i = Math.round(pointf.x);
		//    0    0:aload_2         
		//    1    1:getfield        #27  <Field float PointF.x>
		//    2    4:invokestatic    #33  <Method int Math.round(float)>
		//    3    7:istore_3        
			int j = Math.round(pointf.y);
		//    4    8:aload_2         
		//    5    9:getfield        #36  <Field float PointF.y>
		//    6   12:invokestatic    #33  <Method int Math.round(float)>
		//    7   15:istore          4
			ViewUtils.setLeftTopRightBottom(view, i, j, view.getWidth() + i, view.getHeight() + j);
		//    8   17:aload_1         
		//    9   18:iload_3         
		//   10   19:iload           4
		//   11   21:aload_1         
		//   12   22:invokevirtual   #40  <Method int View.getWidth()>
		//   13   25:iload_3         
		//   14   26:iadd            
		//   15   27:aload_1         
		//   16   28:invokevirtual   #43  <Method int View.getHeight()>
		//   17   31:iload           4
		//   18   33:iadd            
		//   19   34:invokestatic    #49  <Method void ViewUtils.setLeftTopRightBottom(View, int, int, int, int)>
		//   20   37:return          
		}

		public volatile void set(Object obj, Object obj1)
		{
			set((View)obj, (PointF)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #17  <Class View>
		//    3    5:aload_2         
		//    4    6:checkcast       #23  <Class PointF>
		//    5    9:invokevirtual   #52  <Method void set(View, PointF)>
		//    6   12:return          
		}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #11  <Method void Property(Class, String)>
			//    4    6:return          
			}
	}
;
	private static final Property TOP_LEFT_ONLY_PROPERTY = new Property(android/graphics/PointF, "topLeft") {

		public PointF get(View view)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public volatile Object get(Object obj)
		{
			return ((Object) (get((View)obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #17  <Class View>
		//    3    5:invokevirtual   #19  <Method PointF get(View)>
		//    4    8:areturn         
		}

		public void set(View view, PointF pointf)
		{
			ViewUtils.setLeftTopRightBottom(view, Math.round(pointf.x), Math.round(pointf.y), view.getRight(), view.getBottom());
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:getfield        #27  <Field float PointF.x>
		//    3    5:invokestatic    #33  <Method int Math.round(float)>
		//    4    8:aload_2         
		//    5    9:getfield        #36  <Field float PointF.y>
		//    6   12:invokestatic    #33  <Method int Math.round(float)>
		//    7   15:aload_1         
		//    8   16:invokevirtual   #40  <Method int View.getRight()>
		//    9   19:aload_1         
		//   10   20:invokevirtual   #43  <Method int View.getBottom()>
		//   11   23:invokestatic    #49  <Method void ViewUtils.setLeftTopRightBottom(View, int, int, int, int)>
		//   12   26:return          
		}

		public volatile void set(Object obj, Object obj1)
		{
			set((View)obj, (PointF)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #17  <Class View>
		//    3    5:aload_2         
		//    4    6:checkcast       #23  <Class PointF>
		//    5    9:invokevirtual   #52  <Method void set(View, PointF)>
		//    6   12:return          
		}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #11  <Method void Property(Class, String)>
			//    4    6:return          
			}
	}
;
	private static final Property TOP_LEFT_PROPERTY = new Property(android/graphics/PointF, "topLeft") {

		public PointF get(ViewBounds viewbounds)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public volatile Object get(Object obj)
		{
			return ((Object) (get((ViewBounds)obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #17  <Class ChangeBounds$ViewBounds>
		//    3    5:invokevirtual   #19  <Method PointF get(ChangeBounds$ViewBounds)>
		//    4    8:areturn         
		}

		public void set(ViewBounds viewbounds, PointF pointf)
		{
			viewbounds.setTopLeft(pointf);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #25  <Method void ChangeBounds$ViewBounds.setTopLeft(PointF)>
		//    3    5:return          
		}

		public volatile void set(Object obj, Object obj1)
		{
			set((ViewBounds)obj, (PointF)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #17  <Class ChangeBounds$ViewBounds>
		//    3    5:aload_2         
		//    4    6:checkcast       #28  <Class PointF>
		//    5    9:invokevirtual   #30  <Method void set(ChangeBounds$ViewBounds, PointF)>
		//    6   12:return          
		}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #11  <Method void Property(Class, String)>
			//    4    6:return          
			}
	}
;
	private static RectEvaluator sRectEvaluator = new RectEvaluator();
	private static final String sTransitionProperties[] = {
		"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"
	};
	private boolean mReparent;
	private boolean mResizeClip;
	private int mTempLocation[];

	static 
	{
	//    0    0:iconst_5        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #52  <String "android:changeBounds:bounds">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #54  <String "android:changeBounds:clip">
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #56  <String "android:changeBounds:parent">
	//   13   18:aastore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:ldc1            #58  <String "android:changeBounds:windowX">
	//   17   23:aastore         
	//   18   24:dup             
	//   19   25:iconst_4        
	//   20   26:ldc1            #60  <String "android:changeBounds:windowY">
	//   21   28:aastore         
	//   22   29:putstatic       #62  <Field String[] sTransitionProperties>
	//   23   32:new             #6   <Class ChangeBounds$1>
	//   24   35:dup             
	//   25   36:ldc1            #64  <Class PointF>
	//   26   38:ldc1            #66  <String "boundsOrigin">
	//   27   40:invokespecial   #70  <Method void ChangeBounds$1(Class, String)>
	//   28   43:putstatic       #72  <Field Property DRAWABLE_ORIGIN_PROPERTY>
	//   29   46:new             #10  <Class ChangeBounds$2>
	//   30   49:dup             
	//   31   50:ldc1            #64  <Class PointF>
	//   32   52:ldc1            #74  <String "topLeft">
	//   33   54:invokespecial   #75  <Method void ChangeBounds$2(Class, String)>
	//   34   57:putstatic       #77  <Field Property TOP_LEFT_PROPERTY>
	//   35   60:new             #12  <Class ChangeBounds$3>
	//   36   63:dup             
	//   37   64:ldc1            #64  <Class PointF>
	//   38   66:ldc1            #79  <String "bottomRight">
	//   39   68:invokespecial   #80  <Method void ChangeBounds$3(Class, String)>
	//   40   71:putstatic       #82  <Field Property BOTTOM_RIGHT_PROPERTY>
	//   41   74:new             #14  <Class ChangeBounds$4>
	//   42   77:dup             
	//   43   78:ldc1            #64  <Class PointF>
	//   44   80:ldc1            #79  <String "bottomRight">
	//   45   82:invokespecial   #83  <Method void ChangeBounds$4(Class, String)>
	//   46   85:putstatic       #85  <Field Property BOTTOM_RIGHT_ONLY_PROPERTY>
	//   47   88:new             #16  <Class ChangeBounds$5>
	//   48   91:dup             
	//   49   92:ldc1            #64  <Class PointF>
	//   50   94:ldc1            #74  <String "topLeft">
	//   51   96:invokespecial   #86  <Method void ChangeBounds$5(Class, String)>
	//   52   99:putstatic       #88  <Field Property TOP_LEFT_ONLY_PROPERTY>
	//   53  102:new             #18  <Class ChangeBounds$6>
	//   54  105:dup             
	//   55  106:ldc1            #64  <Class PointF>
	//   56  108:ldc1            #90  <String "position">
	//   57  110:invokespecial   #91  <Method void ChangeBounds$6(Class, String)>
	//   58  113:putstatic       #93  <Field Property POSITION_PROPERTY>
	//   59  116:new             #95  <Class RectEvaluator>
	//   60  119:dup             
	//   61  120:invokespecial   #97  <Method void RectEvaluator()>
	//   62  123:putstatic       #99  <Field RectEvaluator sRectEvaluator>
	//*  63  126:return          
	}
}
