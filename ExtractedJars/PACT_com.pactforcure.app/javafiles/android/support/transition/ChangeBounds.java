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
		TransitionValues transitionvalues;
label0:
		{
label1:
			{
				if(mReparent)
	//*   0    0:aload_0         
	//*   1    1:getfield        #113 <Field boolean mReparent>
	//*   2    4:ifeq            23
				{
					transitionvalues = getMatchedTransitionValues(view, true);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:iconst_1        
	//    6   10:invokevirtual   #220 <Method TransitionValues getMatchedTransitionValues(View, boolean)>
	//    7   13:astore_3        
					if(transitionvalues != null)
						break label0;
	//    8   14:aload_3         
	//    9   15:ifnonnull       27
					if(view != view1)
						break label1;
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:if_acmpne       25
				}
				return true;
	//   13   23:iconst_1        
	//   14   24:ireturn         
			}
			return false;
	//   15   25:iconst_0        
	//   16   26:ireturn         
		}
		return view1 == transitionvalues.view;
	//   17   27:aload_2         
	//   18   28:aload_3         
	//   19   29:getfield        #154 <Field View TransitionValues.view>
	//   20   32:if_acmpne       37
	//   21   35:iconst_1        
	//   22   36:ireturn         
	//   23   37:iconst_0        
	//   24   38:ireturn         
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

	public Animator createAnimator(final ViewGroup sceneRoot, final TransitionValues parent, final TransitionValues viewBounds)
	{
		if(parent != null && viewBounds != null) goto _L2; else goto _L1
	//    0    0:aload_2         
	//    1    1:ifnull          8
	//    2    4:aload_3         
	//    3    5:ifnonnull       12
_L1:
		parent = null;
	//    4    8:aconst_null     
	//    5    9:astore_2        
_L4:
		return ((Animator) (parent));
	//    6   10:aload_2         
	//    7   11:areturn         
_L2:
		final View view;
		int i;
		int k1;
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
label0:
		{
			finalClip = ((Object) (parent.values));
	//    8   12:aload_2         
	//    9   13:getfield        #173 <Field Map TransitionValues.values>
	//   10   16:astore          20
			Object obj = ((Object) (viewBounds.values));
	//   11   18:aload_3         
	//   12   19:getfield        #173 <Field Map TransitionValues.values>
	//   13   22:astore          21
			finalClip = ((Object) ((ViewGroup)((Map) (finalClip)).get("android:changeBounds:parent")));
	//   14   24:aload           20
	//   15   26:ldc1            #45  <String "android:changeBounds:parent">
	//   16   28:invokeinterface #233 <Method Object Map.get(Object)>
	//   17   33:checkcast       #235 <Class ViewGroup>
	//   18   36:astore          20
			obj = ((Object) ((ViewGroup)((Map) (obj)).get("android:changeBounds:parent")));
	//   19   38:aload           21
	//   20   40:ldc1            #45  <String "android:changeBounds:parent">
	//   21   42:invokeinterface #233 <Method Object Map.get(Object)>
	//   22   47:checkcast       #235 <Class ViewGroup>
	//   23   50:astore          21
			if(finalClip == null || obj == null)
	//*  24   52:aload           20
	//*  25   54:ifnull          62
	//*  26   57:aload           21
	//*  27   59:ifnonnull       64
				return null;
	//   28   62:aconst_null     
	//   29   63:areturn         
			view = viewBounds.view;
	//   30   64:aload_3         
	//   31   65:getfield        #154 <Field View TransitionValues.view>
	//   32   68:astore          22
			if(!parentMatches(((View) (finalClip)), ((View) (obj))))
				break; /* Loop/switch isn't completed */
	//   33   70:aload_0         
	//   34   71:aload           20
	//   35   73:aload           21
	//   36   75:invokespecial   #237 <Method boolean parentMatches(View, View)>
	//   37   78:ifeq            841
			sceneRoot = ((ViewGroup) ((Rect)parent.values.get("android:changeBounds:bounds")));
	//   38   81:aload_2         
	//   39   82:getfield        #173 <Field Map TransitionValues.values>
	//   40   85:ldc1            #39  <String "android:changeBounds:bounds">
	//   41   87:invokeinterface #233 <Method Object Map.get(Object)>
	//   42   92:checkcast       #175 <Class Rect>
	//   43   95:astore_1        
			finalClip = ((Object) ((Rect)viewBounds.values.get("android:changeBounds:bounds")));
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
			i2 = ((Rect) (sceneRoot)).top;
	//   56  125:aload_1         
	//   57  126:getfield        #244 <Field int Rect.top>
	//   58  129:istore          10
			endTop = ((Rect) (finalClip)).top;
	//   59  131:aload           20
	//   60  133:getfield        #244 <Field int Rect.top>
	//   61  136:istore          11
			j2 = ((Rect) (sceneRoot)).right;
	//   62  138:aload_1         
	//   63  139:getfield        #247 <Field int Rect.right>
	//   64  142:istore          12
			endRight = ((Rect) (finalClip)).right;
	//   65  144:aload           20
	//   66  146:getfield        #247 <Field int Rect.right>
	//   67  149:istore          13
			k2 = ((Rect) (sceneRoot)).bottom;
	//   68  151:aload_1         
	//   69  152:getfield        #250 <Field int Rect.bottom>
	//   70  155:istore          14
			endBottom = ((Rect) (finalClip)).bottom;
	//   71  157:aload           20
	//   72  159:getfield        #250 <Field int Rect.bottom>
	//   73  162:istore          15
			l2 = j2 - k1;
	//   74  164:iload           12
	//   75  166:iload           8
	//   76  168:isub            
	//   77  169:istore          16
			i3 = k2 - i2;
	//   78  171:iload           14
	//   79  173:iload           10
	//   80  175:isub            
	//   81  176:istore          17
			j3 = endRight - endLeft;
	//   82  178:iload           13
	//   83  180:iload           9
	//   84  182:isub            
	//   85  183:istore          18
			k3 = endBottom - endTop;
	//   86  185:iload           15
	//   87  187:iload           11
	//   88  189:isub            
	//   89  190:istore          19
			sceneRoot = ((ViewGroup) ((Rect)parent.values.get("android:changeBounds:clip")));
	//   90  192:aload_2         
	//   91  193:getfield        #173 <Field Map TransitionValues.values>
	//   92  196:ldc1            #42  <String "android:changeBounds:clip">
	//   93  198:invokeinterface #233 <Method Object Map.get(Object)>
	//   94  203:checkcast       #175 <Class Rect>
	//   95  206:astore_1        
			finalClip = ((Object) ((Rect)viewBounds.values.get("android:changeBounds:clip")));
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
			if(l2 == 0 || i3 == 0)
	//* 106  229:iload           16
	//* 107  231:ifeq            239
	//* 108  234:iload           17
	//* 109  236:ifne            257
			{
				i = ((int) (flag));
	//  110  239:iload           7
	//  111  241:istore          5
				if(j3 == 0)
					break label0;
	//  112  243:iload           18
	//  113  245:ifeq            300
				i = ((int) (flag));
	//  114  248:iload           7
	//  115  250:istore          5
				if(k3 == 0)
					break label0;
	//  116  252:iload           19
	//  117  254:ifeq            300
			}
			if(k1 != endLeft || i2 != endTop)
	//* 118  257:iload           8
	//* 119  259:iload           9
	//* 120  261:icmpne          271
	//* 121  264:iload           10
	//* 122  266:iload           11
	//* 123  268:icmpeq          276
				k = 0 + 1;
	//  124  271:iconst_0        
	//  125  272:iconst_1        
	//  126  273:iadd            
	//  127  274:istore          6
			if(j2 == endRight)
	//* 128  276:iload           12
	//* 129  278:iload           13
	//* 130  280:icmpne          294
			{
				i = k;
	//  131  283:iload           6
	//  132  285:istore          5
				if(k2 == endBottom)
					break label0;
	//  133  287:iload           14
	//  134  289:iload           15
	//  135  291:icmpeq          300
			}
			i = k + 1;
	//  136  294:iload           6
	//  137  296:iconst_1        
	//  138  297:iadd            
	//  139  298:istore          5
		}
		int l;
label1:
		{
			if(sceneRoot == null || ((Rect) (sceneRoot)).equals(finalClip))
	//* 140  300:aload_1         
	//* 141  301:ifnull          313
	//* 142  304:aload_1         
	//* 143  305:aload           20
	//* 144  307:invokevirtual   #254 <Method boolean Rect.equals(Object)>
	//* 145  310:ifeq            330
			{
				l = i;
	//  146  313:iload           5
	//  147  315:istore          6
				if(sceneRoot != null)
					break label1;
	//  148  317:aload_1         
	//  149  318:ifnonnull       336
				l = i;
	//  150  321:iload           5
	//  151  323:istore          6
				if(finalClip == null)
					break label1;
	//  152  325:aload           20
	//  153  327:ifnull          336
			}
			l = i + 1;
	//  154  330:iload           5
	//  155  332:iconst_1        
	//  156  333:iadd            
	//  157  334:istore          6
		}
		if(l <= 0)
			break MISSING_BLOCK_LABEL_1088;
	//  158  336:iload           6
	//  159  338:ifle            1088
		if(!mResizeClip)
	//* 160  341:aload_0         
	//* 161  342:getfield        #111 <Field boolean mResizeClip>
	//* 162  345:ifne            646
		{
			ViewUtils.setLeftTopRightBottom(view, k1, i2, j2, k2);
	//  163  348:aload           22
	//  164  350:iload           8
	//  165  352:iload           10
	//  166  354:iload           12
	//  167  356:iload           14
	//  168  358:invokestatic    #260 <Method void ViewUtils.setLeftTopRightBottom(View, int, int, int, int)>
			if(l == 2)
	//* 169  361:iload           6
	//* 170  363:iconst_2        
	//* 171  364:icmpne          566
			{
				if(l2 == j3 && i3 == k3)
	//* 172  367:iload           16
	//* 173  369:iload           18
	//* 174  371:icmpne          454
	//* 175  374:iload           17
	//* 176  376:iload           19
	//* 177  378:icmpne          454
				{
					sceneRoot = ((ViewGroup) (getPathMotion().getPath(k1, i2, endLeft, endTop)));
	//  178  381:aload_0         
	//  179  382:invokevirtual   #264 <Method PathMotion getPathMotion()>
	//  180  385:iload           8
	//  181  387:i2f             
	//  182  388:iload           10
	//  183  390:i2f             
	//  184  391:iload           9
	//  185  393:i2f             
	//  186  394:iload           11
	//  187  396:i2f             
	//  188  397:invokevirtual   #270 <Method android.graphics.Path PathMotion.getPath(float, float, float, float)>
	//  189  400:astore_1        
					sceneRoot = ((ViewGroup) (ObjectAnimatorUtils.ofPointF(((Object) (view)), POSITION_PROPERTY, ((android.graphics.Path) (sceneRoot)))));
	//  190  401:aload           22
	//  191  403:getstatic       #99  <Field Property POSITION_PROPERTY>
	//  192  406:aload_1         
	//  193  407:invokestatic    #276 <Method ObjectAnimator ObjectAnimatorUtils.ofPointF(Object, Property, android.graphics.Path)>
	//  194  410:astore_1        
				} else
	//* 195  411:aload_1         
	//* 196  412:astore_2        
	//* 197  413:aload           22
	//* 198  415:invokevirtual   #200 <Method android.view.ViewParent View.getParent()>
	//* 199  418:instanceof      #235 <Class ViewGroup>
	//* 200  421:ifeq            10
	//* 201  424:aload           22
	//* 202  426:invokevirtual   #200 <Method android.view.ViewParent View.getParent()>
	//* 203  429:checkcast       #235 <Class ViewGroup>
	//* 204  432:astore_2        
	//* 205  433:aload_2         
	//* 206  434:iconst_1        
	//* 207  435:invokestatic    #282 <Method void ViewGroupUtils.suppressLayout(ViewGroup, boolean)>
	//* 208  438:aload_0         
	//* 209  439:new             #24  <Class ChangeBounds$9>
	//* 210  442:dup             
	//* 211  443:aload_0         
	//* 212  444:aload_2         
	//* 213  445:invokespecial   #285 <Method void ChangeBounds$9(ChangeBounds, ViewGroup)>
	//* 214  448:invokevirtual   #289 <Method Transition addListener(Transition$TransitionListener)>
	//* 215  451:pop             
	//* 216  452:aload_1         
	//* 217  453:areturn         
				{
					viewBounds = ((TransitionValues) (new ViewBounds(view)));
	//  218  454:new             #26  <Class ChangeBounds$ViewBounds>
	//  219  457:dup             
	//  220  458:aload           22
	//  221  460:invokespecial   #292 <Method void ChangeBounds$ViewBounds(View)>
	//  222  463:astore_3        
					sceneRoot = ((ViewGroup) (getPathMotion().getPath(k1, i2, endLeft, endTop)));
	//  223  464:aload_0         
	//  224  465:invokevirtual   #264 <Method PathMotion getPathMotion()>
	//  225  468:iload           8
	//  226  470:i2f             
	//  227  471:iload           10
	//  228  473:i2f             
	//  229  474:iload           9
	//  230  476:i2f             
	//  231  477:iload           11
	//  232  479:i2f             
	//  233  480:invokevirtual   #270 <Method android.graphics.Path PathMotion.getPath(float, float, float, float)>
	//  234  483:astore_1        
					sceneRoot = ((ViewGroup) (ObjectAnimatorUtils.ofPointF(((Object) (viewBounds)), TOP_LEFT_PROPERTY, ((android.graphics.Path) (sceneRoot)))));
	//  235  484:aload_3         
	//  236  485:getstatic       #83  <Field Property TOP_LEFT_PROPERTY>
	//  237  488:aload_1         
	//  238  489:invokestatic    #276 <Method ObjectAnimator ObjectAnimatorUtils.ofPointF(Object, Property, android.graphics.Path)>
	//  239  492:astore_1        
					parent = ((TransitionValues) (getPathMotion().getPath(j2, k2, endRight, endBottom)));
	//  240  493:aload_0         
	//  241  494:invokevirtual   #264 <Method PathMotion getPathMotion()>
	//  242  497:iload           12
	//  243  499:i2f             
	//  244  500:iload           14
	//  245  502:i2f             
	//  246  503:iload           13
	//  247  505:i2f             
	//  248  506:iload           15
	//  249  508:i2f             
	//  250  509:invokevirtual   #270 <Method android.graphics.Path PathMotion.getPath(float, float, float, float)>
	//  251  512:astore_2        
					finalClip = ((Object) (ObjectAnimatorUtils.ofPointF(((Object) (viewBounds)), BOTTOM_RIGHT_PROPERTY, ((android.graphics.Path) (parent)))));
	//  252  513:aload_3         
	//  253  514:getstatic       #88  <Field Property BOTTOM_RIGHT_PROPERTY>
	//  254  517:aload_2         
	//  255  518:invokestatic    #276 <Method ObjectAnimator ObjectAnimatorUtils.ofPointF(Object, Property, android.graphics.Path)>
	//  256  521:astore          20
					parent = ((TransitionValues) (new AnimatorSet()));
	//  257  523:new             #294 <Class AnimatorSet>
	//  258  526:dup             
	//  259  527:invokespecial   #295 <Method void AnimatorSet()>
	//  260  530:astore_2        
					((AnimatorSet) (parent)).playTogether(new Animator[] {
						sceneRoot, finalClip
					});
	//  261  531:aload_2         
	//  262  532:iconst_2        
	//  263  533:anewarray       Animator[]
	//  264  536:dup             
	//  265  537:iconst_0        
	//  266  538:aload_1         
	//  267  539:aastore         
	//  268  540:dup             
	//  269  541:iconst_1        
	//  270  542:aload           20
	//  271  544:aastore         
	//  272  545:invokevirtual   #301 <Method void AnimatorSet.playTogether(Animator[])>
					sceneRoot = ((ViewGroup) (parent));
	//  273  548:aload_2         
	//  274  549:astore_1        
					((AnimatorSet) (parent)).addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

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
	//  275  550:aload_2         
	//  276  551:new             #20  <Class ChangeBounds$7>
	//  277  554:dup             
	//  278  555:aload_0         
	//  279  556:aload_3         
	//  280  557:invokespecial   #304 <Method void ChangeBounds$7(ChangeBounds, ChangeBounds$ViewBounds)>
	//  281  560:invokevirtual   #307 <Method void AnimatorSet.addListener(android.animation.Animator$AnimatorListener)>
				}
			} else
	//* 282  563:goto            411
			if(k1 != endLeft || i2 != endTop)
	//* 283  566:iload           8
	//* 284  568:iload           9
	//* 285  570:icmpne          580
	//* 286  573:iload           10
	//* 287  575:iload           11
	//* 288  577:icmpeq          613
			{
				sceneRoot = ((ViewGroup) (getPathMotion().getPath(k1, i2, endLeft, endTop)));
	//  289  580:aload_0         
	//  290  581:invokevirtual   #264 <Method PathMotion getPathMotion()>
	//  291  584:iload           8
	//  292  586:i2f             
	//  293  587:iload           10
	//  294  589:i2f             
	//  295  590:iload           9
	//  296  592:i2f             
	//  297  593:iload           11
	//  298  595:i2f             
	//  299  596:invokevirtual   #270 <Method android.graphics.Path PathMotion.getPath(float, float, float, float)>
	//  300  599:astore_1        
				sceneRoot = ((ViewGroup) (ObjectAnimatorUtils.ofPointF(((Object) (view)), TOP_LEFT_ONLY_PROPERTY, ((android.graphics.Path) (sceneRoot)))));
	//  301  600:aload           22
	//  302  602:getstatic       #94  <Field Property TOP_LEFT_ONLY_PROPERTY>
	//  303  605:aload_1         
	//  304  606:invokestatic    #276 <Method ObjectAnimator ObjectAnimatorUtils.ofPointF(Object, Property, android.graphics.Path)>
	//  305  609:astore_1        
			} else
	//* 306  610:goto            411
			{
				sceneRoot = ((ViewGroup) (getPathMotion().getPath(j2, k2, endRight, endBottom)));
	//  307  613:aload_0         
	//  308  614:invokevirtual   #264 <Method PathMotion getPathMotion()>
	//  309  617:iload           12
	//  310  619:i2f             
	//  311  620:iload           14
	//  312  622:i2f             
	//  313  623:iload           13
	//  314  625:i2f             
	//  315  626:iload           15
	//  316  628:i2f             
	//  317  629:invokevirtual   #270 <Method android.graphics.Path PathMotion.getPath(float, float, float, float)>
	//  318  632:astore_1        
				sceneRoot = ((ViewGroup) (ObjectAnimatorUtils.ofPointF(((Object) (view)), BOTTOM_RIGHT_ONLY_PROPERTY, ((android.graphics.Path) (sceneRoot)))));
	//  319  633:aload           22
	//  320  635:getstatic       #91  <Field Property BOTTOM_RIGHT_ONLY_PROPERTY>
	//  321  638:aload_1         
	//  322  639:invokestatic    #276 <Method ObjectAnimator ObjectAnimatorUtils.ofPointF(Object, Property, android.graphics.Path)>
	//  323  642:astore_1        
			}
		} else
	//* 324  643:goto            411
		{
			ViewUtils.setLeftTopRightBottom(view, k1, i2, k1 + Math.max(l2, j3), i2 + Math.max(i3, k3));
	//  325  646:aload           22
	//  326  648:iload           8
	//  327  650:iload           10
	//  328  652:iload           8
	//  329  654:iload           16
	//  330  656:iload           18
	//  331  658:invokestatic    #313 <Method int Math.max(int, int)>
	//  332  661:iadd            
	//  333  662:iload           10
	//  334  664:iload           17
	//  335  666:iload           19
	//  336  668:invokestatic    #313 <Method int Math.max(int, int)>
	//  337  671:iadd            
	//  338  672:invokestatic    #260 <Method void ViewUtils.setLeftTopRightBottom(View, int, int, int, int)>
			parent = null;
	//  339  675:aconst_null     
	//  340  676:astore_2        
			if(k1 != endLeft || i2 != endTop)
	//* 341  677:iload           8
	//* 342  679:iload           9
	//* 343  681:icmpne          691
	//* 344  684:iload           10
	//* 345  686:iload           11
	//* 346  688:icmpeq          721
			{
				parent = ((TransitionValues) (getPathMotion().getPath(k1, i2, endLeft, endTop)));
	//  347  691:aload_0         
	//  348  692:invokevirtual   #264 <Method PathMotion getPathMotion()>
	//  349  695:iload           8
	//  350  697:i2f             
	//  351  698:iload           10
	//  352  700:i2f             
	//  353  701:iload           9
	//  354  703:i2f             
	//  355  704:iload           11
	//  356  706:i2f             
	//  357  707:invokevirtual   #270 <Method android.graphics.Path PathMotion.getPath(float, float, float, float)>
	//  358  710:astore_2        
				parent = ((TransitionValues) (ObjectAnimatorUtils.ofPointF(((Object) (view)), POSITION_PROPERTY, ((android.graphics.Path) (parent)))));
	//  359  711:aload           22
	//  360  713:getstatic       #99  <Field Property POSITION_PROPERTY>
	//  361  716:aload_2         
	//  362  717:invokestatic    #276 <Method ObjectAnimator ObjectAnimatorUtils.ofPointF(Object, Property, android.graphics.Path)>
	//  363  720:astore_2        
			}
			viewBounds = ((TransitionValues) (sceneRoot));
	//  364  721:aload_1         
	//  365  722:astore_3        
			if(sceneRoot == null)
	//* 366  723:aload_1         
	//* 367  724:ifnonnull       741
				viewBounds = ((TransitionValues) (new Rect(0, 0, l2, i3)));
	//  368  727:new             #175 <Class Rect>
	//  369  730:dup             
	//  370  731:iconst_0        
	//  371  732:iconst_0        
	//  372  733:iload           16
	//  373  735:iload           17
	//  374  737:invokespecial   #190 <Method void Rect(int, int, int, int)>
	//  375  740:astore_3        
			sceneRoot = ((ViewGroup) (finalClip));
	//  376  741:aload           20
	//  377  743:astore_1        
			if(finalClip == null)
	//* 378  744:aload           20
	//* 379  746:ifnonnull       763
				sceneRoot = ((ViewGroup) (new Rect(0, 0, j3, k3)));
	//  380  749:new             #175 <Class Rect>
	//  381  752:dup             
	//  382  753:iconst_0        
	//  383  754:iconst_0        
	//  384  755:iload           18
	//  385  757:iload           19
	//  386  759:invokespecial   #190 <Method void Rect(int, int, int, int)>
	//  387  762:astore_1        
			ViewGroup viewgroup = sceneRoot;
	//  388  763:aload_1         
	//  389  764:astore          21
			sceneRoot = null;
	//  390  766:aconst_null     
	//  391  767:astore_1        
			if(!((Rect) (viewBounds)).equals(((Object) (viewgroup))))
	//* 392  768:aload_3         
	//* 393  769:aload           21
	//* 394  771:invokevirtual   #254 <Method boolean Rect.equals(Object)>
	//* 395  774:ifne            832
			{
				ViewCompat.setClipBounds(view, ((Rect) (viewBounds)));
	//  396  777:aload           22
	//  397  779:aload_3         
	//  398  780:invokestatic    #317 <Method void ViewCompat.setClipBounds(View, Rect)>
				sceneRoot = ((ViewGroup) (ObjectAnimator.ofObject(((Object) (view)), "clipBounds", ((android.animation.TypeEvaluator) (sRectEvaluator)), new Object[] {
					viewBounds, viewgroup
				})));
	//  399  783:aload           22
	//  400  785:ldc2            #319 <String "clipBounds">
	//  401  788:getstatic       #105 <Field RectEvaluator sRectEvaluator>
	//  402  791:iconst_2        
	//  403  792:anewarray       Object[]
	//  404  795:dup             
	//  405  796:iconst_0        
	//  406  797:aload_3         
	//  407  798:aastore         
	//  408  799:dup             
	//  409  800:iconst_1        
	//  410  801:aload           21
	//  411  803:aastore         
	//  412  804:invokestatic    #327 <Method ObjectAnimator ObjectAnimator.ofObject(Object, String, android.animation.TypeEvaluator, Object[])>
	//  413  807:astore_1        
				((ObjectAnimator) (sceneRoot)).addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

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
	//  414  808:aload_1         
	//  415  809:new             #22  <Class ChangeBounds$8>
	//  416  812:dup             
	//  417  813:aload_0         
	//  418  814:aload           22
	//  419  816:aload           20
	//  420  818:iload           9
	//  421  820:iload           11
	//  422  822:iload           13
	//  423  824:iload           15
	//  424  826:invokespecial   #330 <Method void ChangeBounds$8(ChangeBounds, View, Rect, int, int, int, int)>
	//  425  829:invokevirtual   #331 <Method void ObjectAnimator.addListener(android.animation.Animator$AnimatorListener)>
			}
			sceneRoot = ((ViewGroup) (TransitionUtils.mergeAnimators(((Animator) (parent)), ((Animator) (sceneRoot)))));
	//  426  832:aload_2         
	//  427  833:aload_1         
	//  428  834:invokestatic    #337 <Method Animator TransitionUtils.mergeAnimators(Animator, Animator)>
	//  429  837:astore_1        
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
		if(true) goto _L4; else goto _L3
	//  430  838:goto            411
_L3:
		int j = ((Integer)parent.values.get("android:changeBounds:windowX")).intValue();
	//  431  841:aload_2         
	//  432  842:getfield        #173 <Field Map TransitionValues.values>
	//  433  845:ldc1            #48  <String "android:changeBounds:windowX">
	//  434  847:invokeinterface #233 <Method Object Map.get(Object)>
	//  435  852:checkcast       #206 <Class Integer>
	//  436  855:invokevirtual   #340 <Method int Integer.intValue()>
	//  437  858:istore          5
		int i1 = ((Integer)parent.values.get("android:changeBounds:windowY")).intValue();
	//  438  860:aload_2         
	//  439  861:getfield        #173 <Field Map TransitionValues.values>
	//  440  864:ldc1            #51  <String "android:changeBounds:windowY">
	//  441  866:invokeinterface #233 <Method Object Map.get(Object)>
	//  442  871:checkcast       #206 <Class Integer>
	//  443  874:invokevirtual   #340 <Method int Integer.intValue()>
	//  444  877:istore          6
		int j1 = ((Integer)viewBounds.values.get("android:changeBounds:windowX")).intValue();
	//  445  879:aload_3         
	//  446  880:getfield        #173 <Field Map TransitionValues.values>
	//  447  883:ldc1            #48  <String "android:changeBounds:windowX">
	//  448  885:invokeinterface #233 <Method Object Map.get(Object)>
	//  449  890:checkcast       #206 <Class Integer>
	//  450  893:invokevirtual   #340 <Method int Integer.intValue()>
	//  451  896:istore          7
		int l1 = ((Integer)viewBounds.values.get("android:changeBounds:windowY")).intValue();
	//  452  898:aload_3         
	//  453  899:getfield        #173 <Field Map TransitionValues.values>
	//  454  902:ldc1            #51  <String "android:changeBounds:windowY">
	//  455  904:invokeinterface #233 <Method Object Map.get(Object)>
	//  456  909:checkcast       #206 <Class Integer>
	//  457  912:invokevirtual   #340 <Method int Integer.intValue()>
	//  458  915:istore          8
		if(j != j1 || i1 != l1)
	//* 459  917:iload           5
	//* 460  919:iload           7
	//* 461  921:icmpne          931
	//* 462  924:iload           6
	//* 463  926:iload           8
	//* 464  928:icmpeq          1088
		{
			sceneRoot.getLocationInWindow(mTempLocation);
	//  465  931:aload_1         
	//  466  932:aload_0         
	//  467  933:getfield        #109 <Field int[] mTempLocation>
	//  468  936:invokevirtual   #341 <Method void ViewGroup.getLocationInWindow(int[])>
			parent = ((TransitionValues) (Bitmap.createBitmap(view.getWidth(), view.getHeight(), android.graphics.Bitmap.Config.ARGB_8888)));
	//  469  939:aload           22
	//  470  941:invokevirtual   #166 <Method int View.getWidth()>
	//  471  944:aload           22
	//  472  946:invokevirtual   #169 <Method int View.getHeight()>
	//  473  949:getstatic       #347 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//  474  952:invokestatic    #353 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//  475  955:astore_2        
			view.draw(new Canvas(((Bitmap) (parent))));
	//  476  956:aload           22
	//  477  958:new             #355 <Class Canvas>
	//  478  961:dup             
	//  479  962:aload_2         
	//  480  963:invokespecial   #358 <Method void Canvas(Bitmap)>
	//  481  966:invokevirtual   #362 <Method void View.draw(Canvas)>
			parent = ((TransitionValues) (new BitmapDrawable(((Bitmap) (parent)))));
	//  482  969:new             #364 <Class BitmapDrawable>
	//  483  972:dup             
	//  484  973:aload_2         
	//  485  974:invokespecial   #365 <Method void BitmapDrawable(Bitmap)>
	//  486  977:astore_2        
			final float transitionAlpha = ViewUtils.getTransitionAlpha(view);
	//  487  978:aload           22
	//  488  980:invokestatic    #369 <Method float ViewUtils.getTransitionAlpha(View)>
	//  489  983:fstore          4
			ViewUtils.setTransitionAlpha(view, 0.0F);
	//  490  985:aload           22
	//  491  987:fconst_0        
	//  492  988:invokestatic    #373 <Method void ViewUtils.setTransitionAlpha(View, float)>
			ViewUtils.getOverlay(((View) (sceneRoot))).add(((Drawable) (parent)));
	//  493  991:aload_1         
	//  494  992:invokestatic    #377 <Method ViewOverlayImpl ViewUtils.getOverlay(View)>
	//  495  995:aload_2         
	//  496  996:invokeinterface #383 <Method void ViewOverlayImpl.add(Drawable)>
			viewBounds = ((TransitionValues) (getPathMotion().getPath(j - mTempLocation[0], i1 - mTempLocation[1], j1 - mTempLocation[0], l1 - mTempLocation[1])));
	//  497 1001:aload_0         
	//  498 1002:invokevirtual   #264 <Method PathMotion getPathMotion()>
	//  499 1005:iload           5
	//  500 1007:aload_0         
	//  501 1008:getfield        #109 <Field int[] mTempLocation>
	//  502 1011:iconst_0        
	//  503 1012:iaload          
	//  504 1013:isub            
	//  505 1014:i2f             
	//  506 1015:iload           6
	//  507 1017:aload_0         
	//  508 1018:getfield        #109 <Field int[] mTempLocation>
	//  509 1021:iconst_1        
	//  510 1022:iaload          
	//  511 1023:isub            
	//  512 1024:i2f             
	//  513 1025:iload           7
	//  514 1027:aload_0         
	//  515 1028:getfield        #109 <Field int[] mTempLocation>
	//  516 1031:iconst_0        
	//  517 1032:iaload          
	//  518 1033:isub            
	//  519 1034:i2f             
	//  520 1035:iload           8
	//  521 1037:aload_0         
	//  522 1038:getfield        #109 <Field int[] mTempLocation>
	//  523 1041:iconst_1        
	//  524 1042:iaload          
	//  525 1043:isub            
	//  526 1044:i2f             
	//  527 1045:invokevirtual   #270 <Method android.graphics.Path PathMotion.getPath(float, float, float, float)>
	//  528 1048:astore_3        
			viewBounds = ((TransitionValues) (ObjectAnimator.ofPropertyValuesHolder(((Object) (parent)), new PropertyValuesHolder[] {
				PropertyValuesHolderUtils.ofPointF(DRAWABLE_ORIGIN_PROPERTY, ((android.graphics.Path) (viewBounds)))
			})));
	//  529 1049:aload_2         
	//  530 1050:iconst_1        
	//  531 1051:anewarray       PropertyValuesHolder[]
	//  532 1054:dup             
	//  533 1055:iconst_0        
	//  534 1056:getstatic       #78  <Field Property DRAWABLE_ORIGIN_PROPERTY>
	//  535 1059:aload_3         
	//  536 1060:invokestatic    #390 <Method PropertyValuesHolder PropertyValuesHolderUtils.ofPointF(Property, android.graphics.Path)>
	//  537 1063:aastore         
	//  538 1064:invokestatic    #394 <Method ObjectAnimator ObjectAnimator.ofPropertyValuesHolder(Object, PropertyValuesHolder[])>
	//  539 1067:astore_3        
			((ObjectAnimator) (viewBounds)).addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

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
	//  540 1068:aload_3         
	//  541 1069:new             #8   <Class ChangeBounds$10>
	//  542 1072:dup             
	//  543 1073:aload_0         
	//  544 1074:aload_1         
	//  545 1075:aload_2         
	//  546 1076:aload           22
	//  547 1078:fload           4
	//  548 1080:invokespecial   #397 <Method void ChangeBounds$10(ChangeBounds, ViewGroup, BitmapDrawable, View, float)>
	//  549 1083:invokevirtual   #331 <Method void ObjectAnimator.addListener(android.animation.Animator$AnimatorListener)>
			return ((Animator) (viewBounds));
	//  550 1086:aload_3         
	//  551 1087:areturn         
		}
		return null;
	//  552 1088:aconst_null     
	//  553 1089:areturn         
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
			ViewUtils.setLeftTopRightBottom(view, i, j, i + view.getWidth(), j + view.getHeight());
		//    8   17:aload_1         
		//    9   18:iload_3         
		//   10   19:iload           4
		//   11   21:iload_3         
		//   12   22:aload_1         
		//   13   23:invokevirtual   #40  <Method int View.getWidth()>
		//   14   26:iadd            
		//   15   27:iload           4
		//   16   29:aload_1         
		//   17   30:invokevirtual   #43  <Method int View.getHeight()>
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
