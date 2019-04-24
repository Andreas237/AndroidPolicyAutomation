// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.*;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.*;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

// Referenced classes of package android.support.transition:
//			Transition, RectEvaluator, Styleable, TransitionValues, 
//			ViewUtils, PathMotion, ObjectAnimatorUtils, ViewGroupUtils, 
//			TransitionUtils, ViewOverlayImpl, PropertyValuesHolderUtils, TransitionListenerAdapter

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
	//    1    1:invokespecial   #107 <Method void Transition()>
		mTempLocation = new int[2];
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:newarray        int[]
	//    5    8:putfield        #109 <Field int[] mTempLocation>
		mResizeClip = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #111 <Field boolean mResizeClip>
		mReparent = false;
	//    9   16:aload_0         
	//   10   17:iconst_0        
	//   11   18:putfield        #113 <Field boolean mReparent>
	//   12   21:return          
	}

	public ChangeBounds(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #116 <Method void Transition(Context, AttributeSet)>
		mTempLocation = new int[2];
	//    4    6:aload_0         
	//    5    7:iconst_2        
	//    6    8:newarray        int[]
	//    7   10:putfield        #109 <Field int[] mTempLocation>
		mResizeClip = false;
	//    8   13:aload_0         
	//    9   14:iconst_0        
	//   10   15:putfield        #111 <Field boolean mResizeClip>
		mReparent = false;
	//   11   18:aload_0         
	//   12   19:iconst_0        
	//   13   20:putfield        #113 <Field boolean mReparent>
		context = ((Context) (context.obtainStyledAttributes(attributeset, Styleable.CHANGE_BOUNDS)));
	//   14   23:aload_1         
	//   15   24:aload_2         
	//   16   25:getstatic       #121 <Field int[] Styleable.CHANGE_BOUNDS>
	//   17   28:invokevirtual   #127 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   18   31:astore_1        
		boolean flag = TypedArrayUtils.getNamedBoolean(((TypedArray) (context)), ((org.xmlpull.v1.XmlPullParser) ((XmlResourceParser)attributeset)), "resizeClip", 0, false);
	//   19   32:aload_1         
	//   20   33:aload_2         
	//   21   34:checkcast       #129 <Class XmlResourceParser>
	//   22   37:ldc1            #131 <String "resizeClip">
	//   23   39:iconst_0        
	//   24   40:iconst_0        
	//   25   41:invokestatic    #137 <Method boolean TypedArrayUtils.getNamedBoolean(TypedArray, org.xmlpull.v1.XmlPullParser, String, int, boolean)>
	//   26   44:istore_3        
		((TypedArray) (context)).recycle();
	//   27   45:aload_1         
	//   28   46:invokevirtual   #142 <Method void TypedArray.recycle()>
		setResizeClip(flag);
	//   29   49:aload_0         
	//   30   50:iload_3         
	//   31   51:invokevirtual   #146 <Method void setResizeClip(boolean)>
	//   32   54:return          
	}

	private void captureValues(TransitionValues transitionvalues)
	{
		View view = transitionvalues.view;
	//    0    0:aload_1         
	//    1    1:getfield        #154 <Field View TransitionValues.view>
	//    2    4:astore_2        
		if(ViewCompat.isLaidOut(view) || view.getWidth() != 0 || view.getHeight() != 0)
	//*   3    5:aload_2         
	//*   4    6:invokestatic    #160 <Method boolean ViewCompat.isLaidOut(View)>
	//*   5    9:ifne            26
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #166 <Method int View.getWidth()>
	//*   8   16:ifne            26
	//*   9   19:aload_2         
	//*  10   20:invokevirtual   #169 <Method int View.getHeight()>
	//*  11   23:ifeq            163
		{
			transitionvalues.values.put("android:changeBounds:bounds", ((Object) (new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()))));
	//   12   26:aload_1         
	//   13   27:getfield        #173 <Field Map TransitionValues.values>
	//   14   30:ldc1            #39  <String "android:changeBounds:bounds">
	//   15   32:new             #175 <Class Rect>
	//   16   35:dup             
	//   17   36:aload_2         
	//   18   37:invokevirtual   #178 <Method int View.getLeft()>
	//   19   40:aload_2         
	//   20   41:invokevirtual   #181 <Method int View.getTop()>
	//   21   44:aload_2         
	//   22   45:invokevirtual   #184 <Method int View.getRight()>
	//   23   48:aload_2         
	//   24   49:invokevirtual   #187 <Method int View.getBottom()>
	//   25   52:invokespecial   #190 <Method void Rect(int, int, int, int)>
	//   26   55:invokeinterface #196 <Method Object Map.put(Object, Object)>
	//   27   60:pop             
			transitionvalues.values.put("android:changeBounds:parent", ((Object) (transitionvalues.view.getParent())));
	//   28   61:aload_1         
	//   29   62:getfield        #173 <Field Map TransitionValues.values>
	//   30   65:ldc1            #45  <String "android:changeBounds:parent">
	//   31   67:aload_1         
	//   32   68:getfield        #154 <Field View TransitionValues.view>
	//   33   71:invokevirtual   #200 <Method android.view.ViewParent View.getParent()>
	//   34   74:invokeinterface #196 <Method Object Map.put(Object, Object)>
	//   35   79:pop             
			if(mReparent)
	//*  36   80:aload_0         
	//*  37   81:getfield        #113 <Field boolean mReparent>
	//*  38   84:ifeq            140
			{
				transitionvalues.view.getLocationInWindow(mTempLocation);
	//   39   87:aload_1         
	//   40   88:getfield        #154 <Field View TransitionValues.view>
	//   41   91:aload_0         
	//   42   92:getfield        #109 <Field int[] mTempLocation>
	//   43   95:invokevirtual   #204 <Method void View.getLocationInWindow(int[])>
				transitionvalues.values.put("android:changeBounds:windowX", ((Object) (Integer.valueOf(mTempLocation[0]))));
	//   44   98:aload_1         
	//   45   99:getfield        #173 <Field Map TransitionValues.values>
	//   46  102:ldc1            #48  <String "android:changeBounds:windowX">
	//   47  104:aload_0         
	//   48  105:getfield        #109 <Field int[] mTempLocation>
	//   49  108:iconst_0        
	//   50  109:iaload          
	//   51  110:invokestatic    #210 <Method Integer Integer.valueOf(int)>
	//   52  113:invokeinterface #196 <Method Object Map.put(Object, Object)>
	//   53  118:pop             
				transitionvalues.values.put("android:changeBounds:windowY", ((Object) (Integer.valueOf(mTempLocation[1]))));
	//   54  119:aload_1         
	//   55  120:getfield        #173 <Field Map TransitionValues.values>
	//   56  123:ldc1            #51  <String "android:changeBounds:windowY">
	//   57  125:aload_0         
	//   58  126:getfield        #109 <Field int[] mTempLocation>
	//   59  129:iconst_1        
	//   60  130:iaload          
	//   61  131:invokestatic    #210 <Method Integer Integer.valueOf(int)>
	//   62  134:invokeinterface #196 <Method Object Map.put(Object, Object)>
	//   63  139:pop             
			}
			if(mResizeClip)
	//*  64  140:aload_0         
	//*  65  141:getfield        #111 <Field boolean mResizeClip>
	//*  66  144:ifeq            163
				transitionvalues.values.put("android:changeBounds:clip", ((Object) (ViewCompat.getClipBounds(view))));
	//   67  147:aload_1         
	//   68  148:getfield        #173 <Field Map TransitionValues.values>
	//   69  151:ldc1            #42  <String "android:changeBounds:clip">
	//   70  153:aload_2         
	//   71  154:invokestatic    #214 <Method Rect ViewCompat.getClipBounds(View)>
	//   72  157:invokeinterface #196 <Method Object Map.put(Object, Object)>
	//   73  162:pop             
		}
	//   74  163:return          
	}

	private boolean parentMatches(View view, View view1)
	{
		if(!mReparent) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field boolean mReparent>
	//    2    4:ifeq            23
_L1:
		TransitionValues transitionvalues = getMatchedTransitionValues(view, true);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:iconst_1        
	//    6   10:invokevirtual   #220 <Method TransitionValues getMatchedTransitionValues(View, boolean)>
	//    7   13:astore_3        
		if(transitionvalues != null) goto _L4; else goto _L3
	//    8   14:aload_3         
	//    9   15:ifnonnull       27
_L3:
		if(view != view1) goto _L5; else goto _L2
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:if_acmpne       25
_L2:
		return true;
	//   13   23:iconst_1        
	//   14   24:ireturn         
_L5:
		return false;
	//   15   25:iconst_0        
	//   16   26:ireturn         
_L4:
		if(view1 != transitionvalues.view)
	//*  17   27:aload_2         
	//*  18   28:aload_3         
	//*  19   29:getfield        #154 <Field View TransitionValues.view>
	//*  20   32:if_acmpeq       23
			return false;
	//   21   35:iconst_0        
	//   22   36:ireturn         
		if(true) goto _L2; else goto _L6
_L6:
	}

	public void captureEndValues(TransitionValues transitionvalues)
	{
		captureValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #224 <Method void captureValues(TransitionValues)>
	//    3    5:return          
	}

	public void captureStartValues(TransitionValues transitionvalues)
	{
		captureValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #224 <Method void captureValues(TransitionValues)>
	//    3    5:return          
	}

	public Animator createAnimator(final ViewGroup sceneRoot, final TransitionValues parent, TransitionValues transitionvalues)
	{
		if(parent != null && transitionvalues != null) goto _L2; else goto _L1
	//    0    0:aload_2         
	//    1    1:ifnull          8
	//    2    4:aload_3         
	//    3    5:ifnonnull       12
_L1:
		parent = null;
	//    4    8:aconst_null     
	//    5    9:astore_2        
_L5:
		return ((Animator) (parent));
	//    6   10:aload_2         
	//    7   11:areturn         
_L2:
		Object obj;
		final View view;
		ViewGroup viewgroup;
		obj = ((Object) (parent.values));
	//    8   12:aload_2         
	//    9   13:getfield        #173 <Field Map TransitionValues.values>
	//   10   16:astore          20
		view = ((View) (transitionvalues.values));
	//   11   18:aload_3         
	//   12   19:getfield        #173 <Field Map TransitionValues.values>
	//   13   22:astore          21
		obj = ((Object) ((ViewGroup)((Map) (obj)).get("android:changeBounds:parent")));
	//   14   24:aload           20
	//   15   26:ldc1            #45  <String "android:changeBounds:parent">
	//   16   28:invokeinterface #233 <Method Object Map.get(Object)>
	//   17   33:checkcast       #235 <Class ViewGroup>
	//   18   36:astore          20
		viewgroup = (ViewGroup)((Map) (view)).get("android:changeBounds:parent");
	//   19   38:aload           21
	//   20   40:ldc1            #45  <String "android:changeBounds:parent">
	//   21   42:invokeinterface #233 <Method Object Map.get(Object)>
	//   22   47:checkcast       #235 <Class ViewGroup>
	//   23   50:astore          22
		if(obj == null || viewgroup == null)
	//*  24   52:aload           20
	//*  25   54:ifnull          62
	//*  26   57:aload           22
	//*  27   59:ifnonnull       64
			return null;
	//   28   62:aconst_null     
	//   29   63:areturn         
		view = transitionvalues.view;
	//   30   64:aload_3         
	//   31   65:getfield        #154 <Field View TransitionValues.view>
	//   32   68:astore          21
		if(!parentMatches(((View) (obj)), ((View) (viewgroup)))) goto _L4; else goto _L3
	//   33   70:aload_0         
	//   34   71:aload           20
	//   35   73:aload           22
	//   36   75:invokespecial   #237 <Method boolean parentMatches(View, View)>
	//   37   78:ifeq            823
_L3:
		int i;
		int k1;
		final int endLeft;
		int l1;
		final int endTop;
		int i2;
		final int endRight;
		int j2;
		final int endBottom;
		int k2;
		int l2;
		int i3;
		int j3;
		final Object finalClip;
label0:
		{
			sceneRoot = ((ViewGroup) ((Rect)parent.values.get("android:changeBounds:bounds")));
	//   38   81:aload_2         
	//   39   82:getfield        #173 <Field Map TransitionValues.values>
	//   40   85:ldc1            #39  <String "android:changeBounds:bounds">
	//   41   87:invokeinterface #233 <Method Object Map.get(Object)>
	//   42   92:checkcast       #175 <Class Rect>
	//   43   95:astore_1        
			finalClip = ((Object) ((Rect)transitionvalues.values.get("android:changeBounds:bounds")));
	//   44   96:aload_3         
	//   45   97:getfield        #173 <Field Map TransitionValues.values>
	//   46  100:ldc1            #39  <String "android:changeBounds:bounds">
	//   47  102:invokeinterface #233 <Method Object Map.get(Object)>
	//   48  107:checkcast       #175 <Class Rect>
	//   49  110:astore          20
			k1 = ((Rect) (sceneRoot)).left;
	//   50  112:aload_1         
	//   51  113:getfield        #241 <Field int Rect.left>
	//   52  116:istore          8
			endLeft = ((Rect) (finalClip)).left;
	//   53  118:aload           20
	//   54  120:getfield        #241 <Field int Rect.left>
	//   55  123:istore          9
			l1 = ((Rect) (sceneRoot)).top;
	//   56  125:aload_1         
	//   57  126:getfield        #244 <Field int Rect.top>
	//   58  129:istore          10
			endTop = ((Rect) (finalClip)).top;
	//   59  131:aload           20
	//   60  133:getfield        #244 <Field int Rect.top>
	//   61  136:istore          11
			i2 = ((Rect) (sceneRoot)).right;
	//   62  138:aload_1         
	//   63  139:getfield        #247 <Field int Rect.right>
	//   64  142:istore          12
			endRight = ((Rect) (finalClip)).right;
	//   65  144:aload           20
	//   66  146:getfield        #247 <Field int Rect.right>
	//   67  149:istore          13
			j2 = ((Rect) (sceneRoot)).bottom;
	//   68  151:aload_1         
	//   69  152:getfield        #250 <Field int Rect.bottom>
	//   70  155:istore          14
			endBottom = ((Rect) (finalClip)).bottom;
	//   71  157:aload           20
	//   72  159:getfield        #250 <Field int Rect.bottom>
	//   73  162:istore          15
			k2 = i2 - k1;
	//   74  164:iload           12
	//   75  166:iload           8
	//   76  168:isub            
	//   77  169:istore          16
			l2 = j2 - l1;
	//   78  171:iload           14
	//   79  173:iload           10
	//   80  175:isub            
	//   81  176:istore          17
			i3 = endRight - endLeft;
	//   82  178:iload           13
	//   83  180:iload           9
	//   84  182:isub            
	//   85  183:istore          18
			j3 = endBottom - endTop;
	//   86  185:iload           15
	//   87  187:iload           11
	//   88  189:isub            
	//   89  190:istore          19
			parent = ((TransitionValues) ((Rect)parent.values.get("android:changeBounds:clip")));
	//   90  192:aload_2         
	//   91  193:getfield        #173 <Field Map TransitionValues.values>
	//   92  196:ldc1            #42  <String "android:changeBounds:clip">
	//   93  198:invokeinterface #233 <Method Object Map.get(Object)>
	//   94  203:checkcast       #175 <Class Rect>
	//   95  206:astore_2        
			finalClip = ((Object) ((Rect)transitionvalues.values.get("android:changeBounds:clip")));
	//   96  207:aload_3         
	//   97  208:getfield        #173 <Field Map TransitionValues.values>
	//   98  211:ldc1            #42  <String "android:changeBounds:clip">
	//   99  213:invokeinterface #233 <Method Object Map.get(Object)>
	//  100  218:checkcast       #175 <Class Rect>
	//  101  221:astore          20
			boolean flag = false;
	//  102  223:iconst_0        
	//  103  224:istore          7
			int k = 0;
	//  104  226:iconst_0        
	//  105  227:istore          6
			if(k2 == 0 || l2 == 0)
	//* 106  229:iload           16
	//* 107  231:ifeq            239
	//* 108  234:iload           17
	//* 109  236:ifne            257
			{
				i = ((int) (flag));
	//  110  239:iload           7
	//  111  241:istore          5
				if(i3 == 0)
					break label0;
	//  112  243:iload           18
	//  113  245:ifeq            298
				i = ((int) (flag));
	//  114  248:iload           7
	//  115  250:istore          5
				if(j3 == 0)
					break label0;
	//  116  252:iload           19
	//  117  254:ifeq            298
			}
			if(k1 != endLeft || l1 != endTop)
	//* 118  257:iload           8
	//* 119  259:iload           9
	//* 120  261:icmpne          271
	//* 121  264:iload           10
	//* 122  266:iload           11
	//* 123  268:icmpeq          274
				k = 1;
	//  124  271:iconst_1        
	//  125  272:istore          6
			if(i2 == endRight)
	//* 126  274:iload           12
	//* 127  276:iload           13
	//* 128  278:icmpne          292
			{
				i = k;
	//  129  281:iload           6
	//  130  283:istore          5
				if(j2 == endBottom)
					break label0;
	//  131  285:iload           14
	//  132  287:iload           15
	//  133  289:icmpeq          298
			}
			i = k + 1;
	//  134  292:iload           6
	//  135  294:iconst_1        
	//  136  295:iadd            
	//  137  296:istore          5
		}
		int l;
label1:
		{
			if(parent == null || ((Rect) (parent)).equals(finalClip))
	//* 138  298:aload_2         
	//* 139  299:ifnull          311
	//* 140  302:aload_2         
	//* 141  303:aload           20
	//* 142  305:invokevirtual   #254 <Method boolean Rect.equals(Object)>
	//* 143  308:ifeq            328
			{
				l = i;
	//  144  311:iload           5
	//  145  313:istore          6
				if(parent != null)
					break label1;
	//  146  315:aload_2         
	//  147  316:ifnonnull       334
				l = i;
	//  148  319:iload           5
	//  149  321:istore          6
				if(finalClip == null)
					break label1;
	//  150  323:aload           20
	//  151  325:ifnull          334
			}
			l = i + 1;
	//  152  328:iload           5
	//  153  330:iconst_1        
	//  154  331:iadd            
	//  155  332:istore          6
		}
		if(l <= 0)
			break MISSING_BLOCK_LABEL_1070;
	//  156  334:iload           6
	//  157  336:ifle            1070
		if(!mResizeClip)
	//* 158  339:aload_0         
	//* 159  340:getfield        #111 <Field boolean mResizeClip>
	//* 160  343:ifne            642
		{
			ViewUtils.setLeftTopRightBottom(view, k1, l1, i2, j2);
	//  161  346:aload           21
	//  162  348:iload           8
	//  163  350:iload           10
	//  164  352:iload           12
	//  165  354:iload           14
	//  166  356:invokestatic    #260 <Method void ViewUtils.setLeftTopRightBottom(View, int, int, int, int)>
			if(l == 2)
	//* 167  359:iload           6
	//* 168  361:iconst_2        
	//* 169  362:icmpne          562
			{
				if(k2 == i3 && l2 == j3)
	//* 170  365:iload           16
	//* 171  367:iload           18
	//* 172  369:icmpne          452
	//* 173  372:iload           17
	//* 174  374:iload           19
	//* 175  376:icmpne          452
				{
					sceneRoot = ((ViewGroup) (getPathMotion().getPath(k1, l1, endLeft, endTop)));
	//  176  379:aload_0         
	//  177  380:invokevirtual   #264 <Method PathMotion getPathMotion()>
	//  178  383:iload           8
	//  179  385:i2f             
	//  180  386:iload           10
	//  181  388:i2f             
	//  182  389:iload           9
	//  183  391:i2f             
	//  184  392:iload           11
	//  185  394:i2f             
	//  186  395:invokevirtual   #270 <Method android.graphics.Path PathMotion.getPath(float, float, float, float)>
	//  187  398:astore_1        
					sceneRoot = ((ViewGroup) (ObjectAnimatorUtils.ofPointF(((Object) (view)), POSITION_PROPERTY, ((android.graphics.Path) (sceneRoot)))));
	//  188  399:aload           21
	//  189  401:getstatic       #99  <Field Property POSITION_PROPERTY>
	//  190  404:aload_1         
	//  191  405:invokestatic    #276 <Method ObjectAnimator ObjectAnimatorUtils.ofPointF(Object, Property, android.graphics.Path)>
	//  192  408:astore_1        
				} else
	//* 193  409:aload_1         
	//* 194  410:astore_2        
	//* 195  411:aload           21
	//* 196  413:invokevirtual   #200 <Method android.view.ViewParent View.getParent()>
	//* 197  416:instanceof      #235 <Class ViewGroup>
	//* 198  419:ifeq            10
	//* 199  422:aload           21
	//* 200  424:invokevirtual   #200 <Method android.view.ViewParent View.getParent()>
	//* 201  427:checkcast       #235 <Class ViewGroup>
	//* 202  430:astore_2        
	//* 203  431:aload_2         
	//* 204  432:iconst_1        
	//* 205  433:invokestatic    #282 <Method void ViewGroupUtils.suppressLayout(ViewGroup, boolean)>
	//* 206  436:aload_0         
	//* 207  437:new             #24  <Class ChangeBounds$9>
	//* 208  440:dup             
	//* 209  441:aload_0         
	//* 210  442:aload_2         
	//* 211  443:invokespecial   #285 <Method void ChangeBounds$9(ChangeBounds, ViewGroup)>
	//* 212  446:invokevirtual   #289 <Method Transition addListener(Transition$TransitionListener)>
	//* 213  449:pop             
	//* 214  450:aload_1         
	//* 215  451:areturn         
				{
					parent = ((TransitionValues) (new ViewBounds(view)));
	//  216  452:new             #26  <Class ChangeBounds$ViewBounds>
	//  217  455:dup             
	//  218  456:aload           21
	//  219  458:invokespecial   #292 <Method void ChangeBounds$ViewBounds(View)>
	//  220  461:astore_2        
					sceneRoot = ((ViewGroup) (getPathMotion().getPath(k1, l1, endLeft, endTop)));
	//  221  462:aload_0         
	//  222  463:invokevirtual   #264 <Method PathMotion getPathMotion()>
	//  223  466:iload           8
	//  224  468:i2f             
	//  225  469:iload           10
	//  226  471:i2f             
	//  227  472:iload           9
	//  228  474:i2f             
	//  229  475:iload           11
	//  230  477:i2f             
	//  231  478:invokevirtual   #270 <Method android.graphics.Path PathMotion.getPath(float, float, float, float)>
	//  232  481:astore_1        
					transitionvalues = ((TransitionValues) (ObjectAnimatorUtils.ofPointF(((Object) (parent)), TOP_LEFT_PROPERTY, ((android.graphics.Path) (sceneRoot)))));
	//  233  482:aload_2         
	//  234  483:getstatic       #83  <Field Property TOP_LEFT_PROPERTY>
	//  235  486:aload_1         
	//  236  487:invokestatic    #276 <Method ObjectAnimator ObjectAnimatorUtils.ofPointF(Object, Property, android.graphics.Path)>
	//  237  490:astore_3        
					sceneRoot = ((ViewGroup) (getPathMotion().getPath(i2, j2, endRight, endBottom)));
	//  238  491:aload_0         
	//  239  492:invokevirtual   #264 <Method PathMotion getPathMotion()>
	//  240  495:iload           12
	//  241  497:i2f             
	//  242  498:iload           14
	//  243  500:i2f             
	//  244  501:iload           13
	//  245  503:i2f             
	//  246  504:iload           15
	//  247  506:i2f             
	//  248  507:invokevirtual   #270 <Method android.graphics.Path PathMotion.getPath(float, float, float, float)>
	//  249  510:astore_1        
					finalClip = ((Object) (ObjectAnimatorUtils.ofPointF(((Object) (parent)), BOTTOM_RIGHT_PROPERTY, ((android.graphics.Path) (sceneRoot)))));
	//  250  511:aload_2         
	//  251  512:getstatic       #88  <Field Property BOTTOM_RIGHT_PROPERTY>
	//  252  515:aload_1         
	//  253  516:invokestatic    #276 <Method ObjectAnimator ObjectAnimatorUtils.ofPointF(Object, Property, android.graphics.Path)>
	//  254  519:astore          20
					sceneRoot = ((ViewGroup) (new AnimatorSet()));
	//  255  521:new             #294 <Class AnimatorSet>
	//  256  524:dup             
	//  257  525:invokespecial   #295 <Method void AnimatorSet()>
	//  258  528:astore_1        
					((AnimatorSet) (sceneRoot)).playTogether(new Animator[] {
						transitionvalues, finalClip
					});
	//  259  529:aload_1         
	//  260  530:iconst_2        
	//  261  531:anewarray       Animator[]
	//  262  534:dup             
	//  263  535:iconst_0        
	//  264  536:aload_3         
	//  265  537:aastore         
	//  266  538:dup             
	//  267  539:iconst_1        
	//  268  540:aload           20
	//  269  542:aastore         
	//  270  543:invokevirtual   #301 <Method void AnimatorSet.playTogether(Animator[])>
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
	//  271  546:aload_1         
	//  272  547:new             #20  <Class ChangeBounds$7>
	//  273  550:dup             
	//  274  551:aload_0         
	//  275  552:aload_2         
	//  276  553:invokespecial   #304 <Method void ChangeBounds$7(ChangeBounds, ChangeBounds$ViewBounds)>
	//  277  556:invokevirtual   #307 <Method void AnimatorSet.addListener(android.animation.Animator$AnimatorListener)>
				}
			} else
	//* 278  559:goto            409
			if(k1 != endLeft || l1 != endTop)
	//* 279  562:iload           8
	//* 280  564:iload           9
	//* 281  566:icmpne          576
	//* 282  569:iload           10
	//* 283  571:iload           11
	//* 284  573:icmpeq          609
			{
				sceneRoot = ((ViewGroup) (getPathMotion().getPath(k1, l1, endLeft, endTop)));
	//  285  576:aload_0         
	//  286  577:invokevirtual   #264 <Method PathMotion getPathMotion()>
	//  287  580:iload           8
	//  288  582:i2f             
	//  289  583:iload           10
	//  290  585:i2f             
	//  291  586:iload           9
	//  292  588:i2f             
	//  293  589:iload           11
	//  294  591:i2f             
	//  295  592:invokevirtual   #270 <Method android.graphics.Path PathMotion.getPath(float, float, float, float)>
	//  296  595:astore_1        
				sceneRoot = ((ViewGroup) (ObjectAnimatorUtils.ofPointF(((Object) (view)), TOP_LEFT_ONLY_PROPERTY, ((android.graphics.Path) (sceneRoot)))));
	//  297  596:aload           21
	//  298  598:getstatic       #94  <Field Property TOP_LEFT_ONLY_PROPERTY>
	//  299  601:aload_1         
	//  300  602:invokestatic    #276 <Method ObjectAnimator ObjectAnimatorUtils.ofPointF(Object, Property, android.graphics.Path)>
	//  301  605:astore_1        
			} else
	//* 302  606:goto            409
			{
				sceneRoot = ((ViewGroup) (getPathMotion().getPath(i2, j2, endRight, endBottom)));
	//  303  609:aload_0         
	//  304  610:invokevirtual   #264 <Method PathMotion getPathMotion()>
	//  305  613:iload           12
	//  306  615:i2f             
	//  307  616:iload           14
	//  308  618:i2f             
	//  309  619:iload           13
	//  310  621:i2f             
	//  311  622:iload           15
	//  312  624:i2f             
	//  313  625:invokevirtual   #270 <Method android.graphics.Path PathMotion.getPath(float, float, float, float)>
	//  314  628:astore_1        
				sceneRoot = ((ViewGroup) (ObjectAnimatorUtils.ofPointF(((Object) (view)), BOTTOM_RIGHT_ONLY_PROPERTY, ((android.graphics.Path) (sceneRoot)))));
	//  315  629:aload           21
	//  316  631:getstatic       #91  <Field Property BOTTOM_RIGHT_ONLY_PROPERTY>
	//  317  634:aload_1         
	//  318  635:invokestatic    #276 <Method ObjectAnimator ObjectAnimatorUtils.ofPointF(Object, Property, android.graphics.Path)>
	//  319  638:astore_1        
			}
		} else
	//* 320  639:goto            409
		{
			ViewUtils.setLeftTopRightBottom(view, k1, l1, Math.max(k2, i3) + k1, Math.max(l2, j3) + l1);
	//  321  642:aload           21
	//  322  644:iload           8
	//  323  646:iload           10
	//  324  648:iload           16
	//  325  650:iload           18
	//  326  652:invokestatic    #313 <Method int Math.max(int, int)>
	//  327  655:iload           8
	//  328  657:iadd            
	//  329  658:iload           17
	//  330  660:iload           19
	//  331  662:invokestatic    #313 <Method int Math.max(int, int)>
	//  332  665:iload           10
	//  333  667:iadd            
	//  334  668:invokestatic    #260 <Method void ViewUtils.setLeftTopRightBottom(View, int, int, int, int)>
			final float transitionAlpha;
			int j;
			int i1;
			int j1;
			if(k1 != endLeft || l1 != endTop)
	//* 335  671:iload           8
	//* 336  673:iload           9
	//* 337  675:icmpne          685
	//* 338  678:iload           10
	//* 339  680:iload           11
	//* 340  682:icmpeq          1086
			{
				sceneRoot = ((ViewGroup) (getPathMotion().getPath(k1, l1, endLeft, endTop)));
	//  341  685:aload_0         
	//  342  686:invokevirtual   #264 <Method PathMotion getPathMotion()>
	//  343  689:iload           8
	//  344  691:i2f             
	//  345  692:iload           10
	//  346  694:i2f             
	//  347  695:iload           9
	//  348  697:i2f             
	//  349  698:iload           11
	//  350  700:i2f             
	//  351  701:invokevirtual   #270 <Method android.graphics.Path PathMotion.getPath(float, float, float, float)>
	//  352  704:astore_1        
				sceneRoot = ((ViewGroup) (ObjectAnimatorUtils.ofPointF(((Object) (view)), POSITION_PROPERTY, ((android.graphics.Path) (sceneRoot)))));
	//  353  705:aload           21
	//  354  707:getstatic       #99  <Field Property POSITION_PROPERTY>
	//  355  710:aload_1         
	//  356  711:invokestatic    #276 <Method ObjectAnimator ObjectAnimatorUtils.ofPointF(Object, Property, android.graphics.Path)>
	//  357  714:astore_1        
			} else
	//* 358  715:aload_2         
	//* 359  716:ifnonnull       1083
	//* 360  719:new             #175 <Class Rect>
	//* 361  722:dup             
	//* 362  723:iconst_0        
	//* 363  724:iconst_0        
	//* 364  725:iload           16
	//* 365  727:iload           17
	//* 366  729:invokespecial   #190 <Method void Rect(int, int, int, int)>
	//* 367  732:astore_2        
	//* 368  733:aload           20
	//* 369  735:ifnonnull       1077
	//* 370  738:new             #175 <Class Rect>
	//* 371  741:dup             
	//* 372  742:iconst_0        
	//* 373  743:iconst_0        
	//* 374  744:iload           18
	//* 375  746:iload           19
	//* 376  748:invokespecial   #190 <Method void Rect(int, int, int, int)>
	//* 377  751:astore_3        
	//* 378  752:aload_2         
	//* 379  753:aload_3         
	//* 380  754:invokevirtual   #254 <Method boolean Rect.equals(Object)>
	//* 381  757:ifne            1072
	//* 382  760:aload           21
	//* 383  762:aload_2         
	//* 384  763:invokestatic    #317 <Method void ViewCompat.setClipBounds(View, Rect)>
	//* 385  766:aload           21
	//* 386  768:ldc2            #319 <String "clipBounds">
	//* 387  771:getstatic       #105 <Field RectEvaluator sRectEvaluator>
	//* 388  774:iconst_2        
	//* 389  775:anewarray       Object[]
	//* 390  778:dup             
	//* 391  779:iconst_0        
	//* 392  780:aload_2         
	//* 393  781:aastore         
	//* 394  782:dup             
	//* 395  783:iconst_1        
	//* 396  784:aload_3         
	//* 397  785:aastore         
	//* 398  786:invokestatic    #327 <Method ObjectAnimator ObjectAnimator.ofObject(Object, String, android.animation.TypeEvaluator, Object[])>
	//* 399  789:astore_2        
	//* 400  790:aload_2         
	//* 401  791:new             #22  <Class ChangeBounds$8>
	//* 402  794:dup             
	//* 403  795:aload_0         
	//* 404  796:aload           21
	//* 405  798:aload           20
	//* 406  800:iload           9
	//* 407  802:iload           11
	//* 408  804:iload           13
	//* 409  806:iload           15
	//* 410  808:invokespecial   #330 <Method void ChangeBounds$8(ChangeBounds, View, Rect, int, int, int, int)>
	//* 411  811:invokevirtual   #331 <Method void ObjectAnimator.addListener(android.animation.Animator$AnimatorListener)>
	//* 412  814:aload_1         
	//* 413  815:aload_2         
	//* 414  816:invokestatic    #337 <Method Animator TransitionUtils.mergeAnimators(Animator, Animator)>
	//* 415  819:astore_1        
	//* 416  820:goto            409
	//* 417  823:aload_2         
	//* 418  824:getfield        #173 <Field Map TransitionValues.values>
	//* 419  827:ldc1            #48  <String "android:changeBounds:windowX">
	//* 420  829:invokeinterface #233 <Method Object Map.get(Object)>
	//* 421  834:checkcast       #206 <Class Integer>
	//* 422  837:invokevirtual   #340 <Method int Integer.intValue()>
	//* 423  840:istore          5
	//* 424  842:aload_2         
	//* 425  843:getfield        #173 <Field Map TransitionValues.values>
	//* 426  846:ldc1            #51  <String "android:changeBounds:windowY">
	//* 427  848:invokeinterface #233 <Method Object Map.get(Object)>
	//* 428  853:checkcast       #206 <Class Integer>
	//* 429  856:invokevirtual   #340 <Method int Integer.intValue()>
	//* 430  859:istore          6
	//* 431  861:aload_3         
	//* 432  862:getfield        #173 <Field Map TransitionValues.values>
	//* 433  865:ldc1            #48  <String "android:changeBounds:windowX">
	//* 434  867:invokeinterface #233 <Method Object Map.get(Object)>
	//* 435  872:checkcast       #206 <Class Integer>
	//* 436  875:invokevirtual   #340 <Method int Integer.intValue()>
	//* 437  878:istore          7
	//* 438  880:aload_3         
	//* 439  881:getfield        #173 <Field Map TransitionValues.values>
	//* 440  884:ldc1            #51  <String "android:changeBounds:windowY">
	//* 441  886:invokeinterface #233 <Method Object Map.get(Object)>
	//* 442  891:checkcast       #206 <Class Integer>
	//* 443  894:invokevirtual   #340 <Method int Integer.intValue()>
	//* 444  897:istore          8
	//* 445  899:iload           5
	//* 446  901:iload           7
	//* 447  903:icmpne          913
	//* 448  906:iload           6
	//* 449  908:iload           8
	//* 450  910:icmpeq          1070
	//* 451  913:aload_1         
	//* 452  914:aload_0         
	//* 453  915:getfield        #109 <Field int[] mTempLocation>
	//* 454  918:invokevirtual   #341 <Method void ViewGroup.getLocationInWindow(int[])>
	//* 455  921:aload           21
	//* 456  923:invokevirtual   #166 <Method int View.getWidth()>
	//* 457  926:aload           21
	//* 458  928:invokevirtual   #169 <Method int View.getHeight()>
	//* 459  931:getstatic       #347 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//* 460  934:invokestatic    #353 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//* 461  937:astore_2        
	//* 462  938:aload           21
	//* 463  940:new             #355 <Class Canvas>
	//* 464  943:dup             
	//* 465  944:aload_2         
	//* 466  945:invokespecial   #358 <Method void Canvas(Bitmap)>
	//* 467  948:invokevirtual   #362 <Method void View.draw(Canvas)>
	//* 468  951:new             #364 <Class BitmapDrawable>
	//* 469  954:dup             
	//* 470  955:aload_2         
	//* 471  956:invokespecial   #365 <Method void BitmapDrawable(Bitmap)>
	//* 472  959:astore_2        
	//* 473  960:aload           21
	//* 474  962:invokestatic    #369 <Method float ViewUtils.getTransitionAlpha(View)>
	//* 475  965:fstore          4
	//* 476  967:aload           21
	//* 477  969:fconst_0        
	//* 478  970:invokestatic    #373 <Method void ViewUtils.setTransitionAlpha(View, float)>
	//* 479  973:aload_1         
	//* 480  974:invokestatic    #377 <Method ViewOverlayImpl ViewUtils.getOverlay(View)>
	//* 481  977:aload_2         
	//* 482  978:invokeinterface #383 <Method void ViewOverlayImpl.add(Drawable)>
	//* 483  983:aload_0         
	//* 484  984:invokevirtual   #264 <Method PathMotion getPathMotion()>
	//* 485  987:iload           5
	//* 486  989:aload_0         
	//* 487  990:getfield        #109 <Field int[] mTempLocation>
	//* 488  993:iconst_0        
	//* 489  994:iaload          
	//* 490  995:isub            
	//* 491  996:i2f             
	//* 492  997:iload           6
	//* 493  999:aload_0         
	//* 494 1000:getfield        #109 <Field int[] mTempLocation>
	//* 495 1003:iconst_1        
	//* 496 1004:iaload          
	//* 497 1005:isub            
	//* 498 1006:i2f             
	//* 499 1007:iload           7
	//* 500 1009:aload_0         
	//* 501 1010:getfield        #109 <Field int[] mTempLocation>
	//* 502 1013:iconst_0        
	//* 503 1014:iaload          
	//* 504 1015:isub            
	//* 505 1016:i2f             
	//* 506 1017:iload           8
	//* 507 1019:aload_0         
	//* 508 1020:getfield        #109 <Field int[] mTempLocation>
	//* 509 1023:iconst_1        
	//* 510 1024:iaload          
	//* 511 1025:isub            
	//* 512 1026:i2f             
	//* 513 1027:invokevirtual   #270 <Method android.graphics.Path PathMotion.getPath(float, float, float, float)>
	//* 514 1030:astore_3        
	//* 515 1031:aload_2         
	//* 516 1032:iconst_1        
	//* 517 1033:anewarray       PropertyValuesHolder[]
	//* 518 1036:dup             
	//* 519 1037:iconst_0        
	//* 520 1038:getstatic       #78  <Field Property DRAWABLE_ORIGIN_PROPERTY>
	//* 521 1041:aload_3         
	//* 522 1042:invokestatic    #390 <Method PropertyValuesHolder PropertyValuesHolderUtils.ofPointF(Property, android.graphics.Path)>
	//* 523 1045:aastore         
	//* 524 1046:invokestatic    #394 <Method ObjectAnimator ObjectAnimator.ofPropertyValuesHolder(Object, PropertyValuesHolder[])>
	//* 525 1049:astore_3        
	//* 526 1050:aload_3         
	//* 527 1051:new             #8   <Class ChangeBounds$10>
	//* 528 1054:dup             
	//* 529 1055:aload_0         
	//* 530 1056:aload_1         
	//* 531 1057:aload_2         
	//* 532 1058:aload           21
	//* 533 1060:fload           4
	//* 534 1062:invokespecial   #397 <Method void ChangeBounds$10(ChangeBounds, ViewGroup, BitmapDrawable, View, float)>
	//* 535 1065:invokevirtual   #331 <Method void ObjectAnimator.addListener(android.animation.Animator$AnimatorListener)>
	//* 536 1068:aload_3         
	//* 537 1069:areturn         
	//* 538 1070:aconst_null     
	//* 539 1071:areturn         
	//* 540 1072:aconst_null     
	//* 541 1073:astore_2        
	//* 542 1074:goto            814
	//* 543 1077:aload           20
	//* 544 1079:astore_3        
	//* 545 1080:goto            752
	//* 546 1083:goto            733
			{
				sceneRoot = null;
	//  547 1086:aconst_null     
	//  548 1087:astore_1        
			}
			if(parent == null)
				parent = ((TransitionValues) (new Rect(0, 0, k2, l2)));
			if(finalClip == null)
				transitionvalues = ((TransitionValues) (new Rect(0, 0, i3, j3)));
			else
				transitionvalues = ((TransitionValues) (finalClip));
			if(!((Rect) (parent)).equals(((Object) (transitionvalues))))
			{
				ViewCompat.setClipBounds(view, ((Rect) (parent)));
				parent = ((TransitionValues) (ObjectAnimator.ofObject(((Object) (view)), "clipBounds", ((android.animation.TypeEvaluator) (sRectEvaluator)), new Object[] {
					parent, transitionvalues
				})));
				((ObjectAnimator) (parent)).addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

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
			} else
			{
				parent = null;
			}
			sceneRoot = ((ViewGroup) (TransitionUtils.mergeAnimators(((Animator) (sceneRoot)), ((Animator) (parent)))));
		}
		parent = ((TransitionValues) (sceneRoot));
		if(view.getParent() instanceof ViewGroup)
		{
			parent = ((TransitionValues) ((ViewGroup)view.getParent()));
			ViewGroupUtils.suppressLayout(((ViewGroup) (parent)), true);
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
			return ((Animator) (sceneRoot));
		}
		if(true) goto _L5; else goto _L4
	//  549 1088:goto            715
_L4:
		j = ((Integer)parent.values.get("android:changeBounds:windowX")).intValue();
		i1 = ((Integer)parent.values.get("android:changeBounds:windowY")).intValue();
		j1 = ((Integer)transitionvalues.values.get("android:changeBounds:windowX")).intValue();
		k1 = ((Integer)transitionvalues.values.get("android:changeBounds:windowY")).intValue();
		if(j != j1 || i1 != k1)
		{
			sceneRoot.getLocationInWindow(mTempLocation);
			parent = ((TransitionValues) (Bitmap.createBitmap(view.getWidth(), view.getHeight(), android.graphics.Bitmap.Config.ARGB_8888)));
			view.draw(new Canvas(((Bitmap) (parent))));
			parent = ((TransitionValues) (new BitmapDrawable(((Bitmap) (parent)))));
			transitionAlpha = ViewUtils.getTransitionAlpha(view);
			ViewUtils.setTransitionAlpha(view, 0.0F);
			ViewUtils.getOverlay(((View) (sceneRoot))).add(((Drawable) (parent)));
			transitionvalues = ((TransitionValues) (getPathMotion().getPath(j - mTempLocation[0], i1 - mTempLocation[1], j1 - mTempLocation[0], k1 - mTempLocation[1])));
			transitionvalues = ((TransitionValues) (ObjectAnimator.ofPropertyValuesHolder(((Object) (parent)), new PropertyValuesHolder[] {
				PropertyValuesHolderUtils.ofPointF(DRAWABLE_ORIGIN_PROPERTY, ((android.graphics.Path) (transitionvalues)))
			})));
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
			return ((Animator) (transitionvalues));
		}
		return null;
	}

	public boolean getResizeClip()
	{
		return mResizeClip;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field boolean mResizeClip>
	//    2    4:ireturn         
	}

	public String[] getTransitionProperties()
	{
		return sTransitionProperties;
	//    0    0:getstatic       #68  <Field String[] sTransitionProperties>
	//    1    3:areturn         
	}

	public void setResizeClip(boolean flag)
	{
		mResizeClip = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #111 <Field boolean mResizeClip>
	//    3    5:return          
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
	private static final String PROPNAME_BOUNDS = "android:changeBounds:bounds";
	private static final String PROPNAME_CLIP = "android:changeBounds:clip";
	private static final String PROPNAME_PARENT = "android:changeBounds:parent";
	private static final String PROPNAME_WINDOW_X = "android:changeBounds:windowX";
	private static final String PROPNAME_WINDOW_Y = "android:changeBounds:windowY";
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
	//    4    6:ldc1            #39  <String "android:changeBounds:bounds">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #42  <String "android:changeBounds:clip">
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #45  <String "android:changeBounds:parent">
	//   13   18:aastore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:ldc1            #48  <String "android:changeBounds:windowX">
	//   17   23:aastore         
	//   18   24:dup             
	//   19   25:iconst_4        
	//   20   26:ldc1            #51  <String "android:changeBounds:windowY">
	//   21   28:aastore         
	//   22   29:putstatic       #68  <Field String[] sTransitionProperties>
	//   23   32:new             #6   <Class ChangeBounds$1>
	//   24   35:dup             
	//   25   36:ldc1            #70  <Class PointF>
	//   26   38:ldc1            #72  <String "boundsOrigin">
	//   27   40:invokespecial   #76  <Method void ChangeBounds$1(Class, String)>
	//   28   43:putstatic       #78  <Field Property DRAWABLE_ORIGIN_PROPERTY>
	//   29   46:new             #10  <Class ChangeBounds$2>
	//   30   49:dup             
	//   31   50:ldc1            #70  <Class PointF>
	//   32   52:ldc1            #80  <String "topLeft">
	//   33   54:invokespecial   #81  <Method void ChangeBounds$2(Class, String)>
	//   34   57:putstatic       #83  <Field Property TOP_LEFT_PROPERTY>
	//   35   60:new             #12  <Class ChangeBounds$3>
	//   36   63:dup             
	//   37   64:ldc1            #70  <Class PointF>
	//   38   66:ldc1            #85  <String "bottomRight">
	//   39   68:invokespecial   #86  <Method void ChangeBounds$3(Class, String)>
	//   40   71:putstatic       #88  <Field Property BOTTOM_RIGHT_PROPERTY>
	//   41   74:new             #14  <Class ChangeBounds$4>
	//   42   77:dup             
	//   43   78:ldc1            #70  <Class PointF>
	//   44   80:ldc1            #85  <String "bottomRight">
	//   45   82:invokespecial   #89  <Method void ChangeBounds$4(Class, String)>
	//   46   85:putstatic       #91  <Field Property BOTTOM_RIGHT_ONLY_PROPERTY>
	//   47   88:new             #16  <Class ChangeBounds$5>
	//   48   91:dup             
	//   49   92:ldc1            #70  <Class PointF>
	//   50   94:ldc1            #80  <String "topLeft">
	//   51   96:invokespecial   #92  <Method void ChangeBounds$5(Class, String)>
	//   52   99:putstatic       #94  <Field Property TOP_LEFT_ONLY_PROPERTY>
	//   53  102:new             #18  <Class ChangeBounds$6>
	//   54  105:dup             
	//   55  106:ldc1            #70  <Class PointF>
	//   56  108:ldc1            #96  <String "position">
	//   57  110:invokespecial   #97  <Method void ChangeBounds$6(Class, String)>
	//   58  113:putstatic       #99  <Field Property POSITION_PROPERTY>
	//   59  116:new             #101 <Class RectEvaluator>
	//   60  119:dup             
	//   61  120:invokespecial   #103 <Method void RectEvaluator()>
	//   62  123:putstatic       #105 <Field RectEvaluator sRectEvaluator>
	//*  63  126:return          
	}
}
