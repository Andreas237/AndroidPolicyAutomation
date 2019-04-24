// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.v4.content.res.TypedArrayUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.lang.annotation.Annotation;
import java.util.Map;

// Referenced classes of package android.support.transition:
//			Transition, Styleable, TransitionValues, ViewGroupUtils, 
//			ViewGroupOverlayImpl, TransitionUtils, ViewUtils, AnimatorUtils

public abstract class Visibility extends Transition
{
	private static class DisappearListener extends AnimatorListenerAdapter
		implements Transition.TransitionListener, AnimatorUtilsApi14.AnimatorPauseListenerCompat
	{

		private void hideViewWhenNotCanceled()
		{
			if(!mCanceled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field boolean mCanceled>
		//*   2    4:ifne            32
			{
				ViewUtils.setTransitionVisibility(mView, mFinalVisibility);
		//    3    7:aload_0         
		//    4    8:getfield        #30  <Field View mView>
		//    5   11:aload_0         
		//    6   12:getfield        #32  <Field int mFinalVisibility>
		//    7   15:invokestatic    #56  <Method void ViewUtils.setTransitionVisibility(View, int)>
				if(mParent != null)
		//*   8   18:aload_0         
		//*   9   19:getfield        #42  <Field ViewGroup mParent>
		//*  10   22:ifnull          32
					mParent.invalidate();
		//   11   25:aload_0         
		//   12   26:getfield        #42  <Field ViewGroup mParent>
		//   13   29:invokevirtual   #59  <Method void ViewGroup.invalidate()>
			}
			suppressLayout(false);
		//   14   32:aload_0         
		//   15   33:iconst_0        
		//   16   34:invokespecial   #48  <Method void suppressLayout(boolean)>
		//   17   37:return          
		}

		private void suppressLayout(boolean flag)
		{
			if(mSuppressLayout && mLayoutSuppressed != flag && mParent != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #44  <Field boolean mSuppressLayout>
		//*   2    4:ifeq            35
		//*   3    7:aload_0         
		//*   4    8:getfield        #61  <Field boolean mLayoutSuppressed>
		//*   5   11:iload_1         
		//*   6   12:icmpeq          35
		//*   7   15:aload_0         
		//*   8   16:getfield        #42  <Field ViewGroup mParent>
		//*   9   19:ifnull          35
			{
				mLayoutSuppressed = flag;
		//   10   22:aload_0         
		//   11   23:iload_1         
		//   12   24:putfield        #61  <Field boolean mLayoutSuppressed>
				ViewGroupUtils.suppressLayout(mParent, flag);
		//   13   27:aload_0         
		//   14   28:getfield        #42  <Field ViewGroup mParent>
		//   15   31:iload_1         
		//   16   32:invokestatic    #66  <Method void ViewGroupUtils.suppressLayout(ViewGroup, boolean)>
			}
		//   17   35:return          
		}

		public void onAnimationCancel(Animator animator)
		{
			mCanceled = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #28  <Field boolean mCanceled>
		//    3    5:return          
		}

		public void onAnimationEnd(Animator animator)
		{
			hideViewWhenNotCanceled();
		//    0    0:aload_0         
		//    1    1:invokespecial   #71  <Method void hideViewWhenNotCanceled()>
		//    2    4:return          
		}

		public void onAnimationPause(Animator animator)
		{
			if(!mCanceled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field boolean mCanceled>
		//*   2    4:ifne            18
				ViewUtils.setTransitionVisibility(mView, mFinalVisibility);
		//    3    7:aload_0         
		//    4    8:getfield        #30  <Field View mView>
		//    5   11:aload_0         
		//    6   12:getfield        #32  <Field int mFinalVisibility>
		//    7   15:invokestatic    #56  <Method void ViewUtils.setTransitionVisibility(View, int)>
		//    8   18:return          
		}

		public void onAnimationRepeat(Animator animator)
		{
		//    0    0:return          
		}

		public void onAnimationResume(Animator animator)
		{
			if(!mCanceled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field boolean mCanceled>
		//*   2    4:ifne            15
				ViewUtils.setTransitionVisibility(mView, 0);
		//    3    7:aload_0         
		//    4    8:getfield        #30  <Field View mView>
		//    5   11:iconst_0        
		//    6   12:invokestatic    #56  <Method void ViewUtils.setTransitionVisibility(View, int)>
		//    7   15:return          
		}

		public void onAnimationStart(Animator animator)
		{
		//    0    0:return          
		}

		public void onTransitionCancel(Transition transition)
		{
		//    0    0:return          
		}

		public void onTransitionEnd(Transition transition)
		{
			hideViewWhenNotCanceled();
		//    0    0:aload_0         
		//    1    1:invokespecial   #71  <Method void hideViewWhenNotCanceled()>
			transition.removeListener(((Transition.TransitionListener) (this)));
		//    2    4:aload_1         
		//    3    5:aload_0         
		//    4    6:invokevirtual   #86  <Method Transition Transition.removeListener(Transition$TransitionListener)>
		//    5    9:pop             
		//    6   10:return          
		}

		public void onTransitionPause(Transition transition)
		{
			suppressLayout(false);
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:invokespecial   #48  <Method void suppressLayout(boolean)>
		//    3    5:return          
		}

		public void onTransitionResume(Transition transition)
		{
			suppressLayout(true);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:invokespecial   #48  <Method void suppressLayout(boolean)>
		//    3    5:return          
		}

		public void onTransitionStart(Transition transition)
		{
		//    0    0:return          
		}

		boolean mCanceled;
		private final int mFinalVisibility;
		private boolean mLayoutSuppressed;
		private final ViewGroup mParent;
		private final boolean mSuppressLayout;
		private final View mView;

		DisappearListener(View view, int i, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void AnimatorListenerAdapter()>
			mCanceled = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #28  <Field boolean mCanceled>
			mView = view;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #30  <Field View mView>
			mFinalVisibility = i;
		//    8   14:aload_0         
		//    9   15:iload_2         
		//   10   16:putfield        #32  <Field int mFinalVisibility>
			mParent = (ViewGroup)view.getParent();
		//   11   19:aload_0         
		//   12   20:aload_1         
		//   13   21:invokevirtual   #38  <Method android.view.ViewParent View.getParent()>
		//   14   24:checkcast       #40  <Class ViewGroup>
		//   15   27:putfield        #42  <Field ViewGroup mParent>
			mSuppressLayout = flag;
		//   16   30:aload_0         
		//   17   31:iload_3         
		//   18   32:putfield        #44  <Field boolean mSuppressLayout>
			suppressLayout(true);
		//   19   35:aload_0         
		//   20   36:iconst_1        
		//   21   37:invokespecial   #48  <Method void suppressLayout(boolean)>
		//   22   40:return          
		}
	}

	public static interface Mode
		extends Annotation
	{
	}

	private static class VisibilityInfo
	{

		ViewGroup mEndParent;
		int mEndVisibility;
		boolean mFadeIn;
		ViewGroup mStartParent;
		int mStartVisibility;
		boolean mVisibilityChange;

		private VisibilityInfo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
		//    2    4:return          
		}

	}


	public Visibility()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Transition()>
		mMode = 3;
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:putfield        #45  <Field int mMode>
	//    5    9:return          
	}

	public Visibility(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #48  <Method void Transition(Context, AttributeSet)>
		mMode = 3;
	//    4    6:aload_0         
	//    5    7:iconst_3        
	//    6    8:putfield        #45  <Field int mMode>
		context = ((Context) (context.obtainStyledAttributes(attributeset, Styleable.VISIBILITY_TRANSITION)));
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:getstatic       #54  <Field int[] Styleable.VISIBILITY_TRANSITION>
	//   10   16:invokevirtual   #60  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   11   19:astore_1        
		int i = TypedArrayUtils.getNamedInt(((TypedArray) (context)), ((org.xmlpull.v1.XmlPullParser) ((XmlResourceParser)attributeset)), "transitionVisibilityMode", 0, 0);
	//   12   20:aload_1         
	//   13   21:aload_2         
	//   14   22:checkcast       #62  <Class XmlResourceParser>
	//   15   25:ldc1            #64  <String "transitionVisibilityMode">
	//   16   27:iconst_0        
	//   17   28:iconst_0        
	//   18   29:invokestatic    #70  <Method int TypedArrayUtils.getNamedInt(TypedArray, org.xmlpull.v1.XmlPullParser, String, int, int)>
	//   19   32:istore_3        
		((TypedArray) (context)).recycle();
	//   20   33:aload_1         
	//   21   34:invokevirtual   #75  <Method void TypedArray.recycle()>
		if(i != 0)
	//*  22   37:iload_3         
	//*  23   38:ifeq            46
			setMode(i);
	//   24   41:aload_0         
	//   25   42:iload_3         
	//   26   43:invokevirtual   #79  <Method void setMode(int)>
	//   27   46:return          
	}

	private void captureValues(TransitionValues transitionvalues)
	{
		int i = transitionvalues.view.getVisibility();
	//    0    0:aload_1         
	//    1    1:getfield        #87  <Field View TransitionValues.view>
	//    2    4:invokevirtual   #93  <Method int View.getVisibility()>
	//    3    7:istore_2        
		transitionvalues.values.put("android:visibility:visibility", ((Object) (Integer.valueOf(i))));
	//    4    8:aload_1         
	//    5    9:getfield        #97  <Field Map TransitionValues.values>
	//    6   12:ldc1            #30  <String "android:visibility:visibility">
	//    7   14:iload_2         
	//    8   15:invokestatic    #103 <Method Integer Integer.valueOf(int)>
	//    9   18:invokeinterface #109 <Method Object Map.put(Object, Object)>
	//   10   23:pop             
		transitionvalues.values.put("android:visibility:parent", ((Object) (transitionvalues.view.getParent())));
	//   11   24:aload_1         
	//   12   25:getfield        #97  <Field Map TransitionValues.values>
	//   13   28:ldc1            #24  <String "android:visibility:parent">
	//   14   30:aload_1         
	//   15   31:getfield        #87  <Field View TransitionValues.view>
	//   16   34:invokevirtual   #113 <Method android.view.ViewParent View.getParent()>
	//   17   37:invokeinterface #109 <Method Object Map.put(Object, Object)>
	//   18   42:pop             
		int ai[] = new int[2];
	//   19   43:iconst_2        
	//   20   44:newarray        int[]
	//   21   46:astore_3        
		transitionvalues.view.getLocationOnScreen(ai);
	//   22   47:aload_1         
	//   23   48:getfield        #87  <Field View TransitionValues.view>
	//   24   51:aload_3         
	//   25   52:invokevirtual   #117 <Method void View.getLocationOnScreen(int[])>
		transitionvalues.values.put("android:visibility:screenLocation", ((Object) (ai)));
	//   26   55:aload_1         
	//   27   56:getfield        #97  <Field Map TransitionValues.values>
	//   28   59:ldc1            #27  <String "android:visibility:screenLocation">
	//   29   61:aload_3         
	//   30   62:invokeinterface #109 <Method Object Map.put(Object, Object)>
	//   31   67:pop             
	//   32   68:return          
	}

	private VisibilityInfo getVisibilityChangeInfo(TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		VisibilityInfo visibilityinfo;
		visibilityinfo = new VisibilityInfo();
	//    0    0:new             #14  <Class Visibility$VisibilityInfo>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #122 <Method void Visibility$VisibilityInfo(Visibility$1)>
	//    4    8:astore_3        
		visibilityinfo.mVisibilityChange = false;
	//    5    9:aload_3         
	//    6   10:iconst_0        
	//    7   11:putfield        #126 <Field boolean Visibility$VisibilityInfo.mVisibilityChange>
		visibilityinfo.mFadeIn = false;
	//    8   14:aload_3         
	//    9   15:iconst_0        
	//   10   16:putfield        #129 <Field boolean Visibility$VisibilityInfo.mFadeIn>
		if(transitionvalues != null && transitionvalues.values.containsKey("android:visibility:visibility"))
	//*  11   19:aload_1         
	//*  12   20:ifnull          165
	//*  13   23:aload_1         
	//*  14   24:getfield        #97  <Field Map TransitionValues.values>
	//*  15   27:ldc1            #30  <String "android:visibility:visibility">
	//*  16   29:invokeinterface #133 <Method boolean Map.containsKey(Object)>
	//*  17   34:ifeq            165
		{
			visibilityinfo.mStartVisibility = ((Integer)transitionvalues.values.get("android:visibility:visibility")).intValue();
	//   18   37:aload_3         
	//   19   38:aload_1         
	//   20   39:getfield        #97  <Field Map TransitionValues.values>
	//   21   42:ldc1            #30  <String "android:visibility:visibility">
	//   22   44:invokeinterface #137 <Method Object Map.get(Object)>
	//   23   49:checkcast       #99  <Class Integer>
	//   24   52:invokevirtual   #140 <Method int Integer.intValue()>
	//   25   55:putfield        #143 <Field int Visibility$VisibilityInfo.mStartVisibility>
			visibilityinfo.mStartParent = (ViewGroup)transitionvalues.values.get("android:visibility:parent");
	//   26   58:aload_3         
	//   27   59:aload_1         
	//   28   60:getfield        #97  <Field Map TransitionValues.values>
	//   29   63:ldc1            #24  <String "android:visibility:parent">
	//   30   65:invokeinterface #137 <Method Object Map.get(Object)>
	//   31   70:checkcast       #145 <Class ViewGroup>
	//   32   73:putfield        #149 <Field ViewGroup Visibility$VisibilityInfo.mStartParent>
		} else
	//*  33   76:aload_2         
	//*  34   77:ifnull          178
	//*  35   80:aload_2         
	//*  36   81:getfield        #97  <Field Map TransitionValues.values>
	//*  37   84:ldc1            #30  <String "android:visibility:visibility">
	//*  38   86:invokeinterface #133 <Method boolean Map.containsKey(Object)>
	//*  39   91:ifeq            178
	//*  40   94:aload_3         
	//*  41   95:aload_2         
	//*  42   96:getfield        #97  <Field Map TransitionValues.values>
	//*  43   99:ldc1            #30  <String "android:visibility:visibility">
	//*  44  101:invokeinterface #137 <Method Object Map.get(Object)>
	//*  45  106:checkcast       #99  <Class Integer>
	//*  46  109:invokevirtual   #140 <Method int Integer.intValue()>
	//*  47  112:putfield        #152 <Field int Visibility$VisibilityInfo.mEndVisibility>
	//*  48  115:aload_3         
	//*  49  116:aload_2         
	//*  50  117:getfield        #97  <Field Map TransitionValues.values>
	//*  51  120:ldc1            #24  <String "android:visibility:parent">
	//*  52  122:invokeinterface #137 <Method Object Map.get(Object)>
	//*  53  127:checkcast       #145 <Class ViewGroup>
	//*  54  130:putfield        #155 <Field ViewGroup Visibility$VisibilityInfo.mEndParent>
	//*  55  133:aload_1         
	//*  56  134:ifnull          278
	//*  57  137:aload_2         
	//*  58  138:ifnull          278
	//*  59  141:aload_3         
	//*  60  142:getfield        #143 <Field int Visibility$VisibilityInfo.mStartVisibility>
	//*  61  145:aload_3         
	//*  62  146:getfield        #152 <Field int Visibility$VisibilityInfo.mEndVisibility>
	//*  63  149:icmpne          191
	//*  64  152:aload_3         
	//*  65  153:getfield        #149 <Field ViewGroup Visibility$VisibilityInfo.mStartParent>
	//*  66  156:aload_3         
	//*  67  157:getfield        #155 <Field ViewGroup Visibility$VisibilityInfo.mEndParent>
	//*  68  160:if_acmpne       191
	//*  69  163:aload_3         
	//*  70  164:areturn         
		{
			visibilityinfo.mStartVisibility = -1;
	//   71  165:aload_3         
	//   72  166:iconst_m1       
	//   73  167:putfield        #143 <Field int Visibility$VisibilityInfo.mStartVisibility>
			visibilityinfo.mStartParent = null;
	//   74  170:aload_3         
	//   75  171:aconst_null     
	//   76  172:putfield        #149 <Field ViewGroup Visibility$VisibilityInfo.mStartParent>
		}
		if(transitionvalues1 != null && transitionvalues1.values.containsKey("android:visibility:visibility"))
		{
			visibilityinfo.mEndVisibility = ((Integer)transitionvalues1.values.get("android:visibility:visibility")).intValue();
			visibilityinfo.mEndParent = (ViewGroup)transitionvalues1.values.get("android:visibility:parent");
		} else
	//*  77  175:goto            76
		{
			visibilityinfo.mEndVisibility = -1;
	//   78  178:aload_3         
	//   79  179:iconst_m1       
	//   80  180:putfield        #152 <Field int Visibility$VisibilityInfo.mEndVisibility>
			visibilityinfo.mEndParent = null;
	//   81  183:aload_3         
	//   82  184:aconst_null     
	//   83  185:putfield        #155 <Field ViewGroup Visibility$VisibilityInfo.mEndParent>
		}
		if(transitionvalues == null || transitionvalues1 == null) goto _L2; else goto _L1
_L1:
		if(visibilityinfo.mStartVisibility != visibilityinfo.mEndVisibility || visibilityinfo.mStartParent != visibilityinfo.mEndParent) goto _L4; else goto _L3
_L3:
		return visibilityinfo;
	//*  84  188:goto            133
_L4:
		if(visibilityinfo.mStartVisibility == visibilityinfo.mEndVisibility)
			break; /* Loop/switch isn't completed */
	//   85  191:aload_3         
	//   86  192:getfield        #143 <Field int Visibility$VisibilityInfo.mStartVisibility>
	//   87  195:aload_3         
	//   88  196:getfield        #152 <Field int Visibility$VisibilityInfo.mEndVisibility>
	//   89  199:icmpeq          240
		if(visibilityinfo.mStartVisibility == 0)
	//*  90  202:aload_3         
	//*  91  203:getfield        #143 <Field int Visibility$VisibilityInfo.mStartVisibility>
	//*  92  206:ifne            221
		{
			visibilityinfo.mFadeIn = false;
	//   93  209:aload_3         
	//   94  210:iconst_0        
	//   95  211:putfield        #129 <Field boolean Visibility$VisibilityInfo.mFadeIn>
			visibilityinfo.mVisibilityChange = true;
	//   96  214:aload_3         
	//   97  215:iconst_1        
	//   98  216:putfield        #126 <Field boolean Visibility$VisibilityInfo.mVisibilityChange>
			return visibilityinfo;
	//   99  219:aload_3         
	//  100  220:areturn         
		}
		if(visibilityinfo.mEndVisibility == 0)
	//* 101  221:aload_3         
	//* 102  222:getfield        #152 <Field int Visibility$VisibilityInfo.mEndVisibility>
	//* 103  225:ifne            163
		{
			visibilityinfo.mFadeIn = true;
	//  104  228:aload_3         
	//  105  229:iconst_1        
	//  106  230:putfield        #129 <Field boolean Visibility$VisibilityInfo.mFadeIn>
			visibilityinfo.mVisibilityChange = true;
	//  107  233:aload_3         
	//  108  234:iconst_1        
	//  109  235:putfield        #126 <Field boolean Visibility$VisibilityInfo.mVisibilityChange>
			return visibilityinfo;
	//  110  238:aload_3         
	//  111  239:areturn         
		}
		if(true) goto _L3; else goto _L5
_L5:
		if(visibilityinfo.mEndParent == null)
	//* 112  240:aload_3         
	//* 113  241:getfield        #155 <Field ViewGroup Visibility$VisibilityInfo.mEndParent>
	//* 114  244:ifnonnull       259
		{
			visibilityinfo.mFadeIn = false;
	//  115  247:aload_3         
	//  116  248:iconst_0        
	//  117  249:putfield        #129 <Field boolean Visibility$VisibilityInfo.mFadeIn>
			visibilityinfo.mVisibilityChange = true;
	//  118  252:aload_3         
	//  119  253:iconst_1        
	//  120  254:putfield        #126 <Field boolean Visibility$VisibilityInfo.mVisibilityChange>
			return visibilityinfo;
	//  121  257:aload_3         
	//  122  258:areturn         
		}
		if(visibilityinfo.mStartParent == null)
	//* 123  259:aload_3         
	//* 124  260:getfield        #149 <Field ViewGroup Visibility$VisibilityInfo.mStartParent>
	//* 125  263:ifnonnull       163
		{
			visibilityinfo.mFadeIn = true;
	//  126  266:aload_3         
	//  127  267:iconst_1        
	//  128  268:putfield        #129 <Field boolean Visibility$VisibilityInfo.mFadeIn>
			visibilityinfo.mVisibilityChange = true;
	//  129  271:aload_3         
	//  130  272:iconst_1        
	//  131  273:putfield        #126 <Field boolean Visibility$VisibilityInfo.mVisibilityChange>
			return visibilityinfo;
	//  132  276:aload_3         
	//  133  277:areturn         
		}
		continue; /* Loop/switch isn't completed */
_L2:
		if(transitionvalues == null && visibilityinfo.mEndVisibility == 0)
	//* 134  278:aload_1         
	//* 135  279:ifnonnull       301
	//* 136  282:aload_3         
	//* 137  283:getfield        #152 <Field int Visibility$VisibilityInfo.mEndVisibility>
	//* 138  286:ifne            301
		{
			visibilityinfo.mFadeIn = true;
	//  139  289:aload_3         
	//  140  290:iconst_1        
	//  141  291:putfield        #129 <Field boolean Visibility$VisibilityInfo.mFadeIn>
			visibilityinfo.mVisibilityChange = true;
	//  142  294:aload_3         
	//  143  295:iconst_1        
	//  144  296:putfield        #126 <Field boolean Visibility$VisibilityInfo.mVisibilityChange>
			return visibilityinfo;
	//  145  299:aload_3         
	//  146  300:areturn         
		}
		if(transitionvalues1 == null && visibilityinfo.mStartVisibility == 0)
	//* 147  301:aload_2         
	//* 148  302:ifnonnull       163
	//* 149  305:aload_3         
	//* 150  306:getfield        #143 <Field int Visibility$VisibilityInfo.mStartVisibility>
	//* 151  309:ifne            163
		{
			visibilityinfo.mFadeIn = false;
	//  152  312:aload_3         
	//  153  313:iconst_0        
	//  154  314:putfield        #129 <Field boolean Visibility$VisibilityInfo.mFadeIn>
			visibilityinfo.mVisibilityChange = true;
	//  155  317:aload_3         
	//  156  318:iconst_1        
	//  157  319:putfield        #126 <Field boolean Visibility$VisibilityInfo.mVisibilityChange>
			return visibilityinfo;
	//  158  322:aload_3         
	//  159  323:areturn         
		}
		if(true) goto _L3; else goto _L6
_L6:
	}

	public void captureEndValues(TransitionValues transitionvalues)
	{
		captureValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #159 <Method void captureValues(TransitionValues)>
	//    3    5:return          
	}

	public void captureStartValues(TransitionValues transitionvalues)
	{
		captureValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #159 <Method void captureValues(TransitionValues)>
	//    3    5:return          
	}

	public Animator createAnimator(ViewGroup viewgroup, TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		VisibilityInfo visibilityinfo = getVisibilityChangeInfo(transitionvalues, transitionvalues1);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #166 <Method Visibility$VisibilityInfo getVisibilityChangeInfo(TransitionValues, TransitionValues)>
	//    4    6:astore          4
		if(visibilityinfo.mVisibilityChange && (visibilityinfo.mStartParent != null || visibilityinfo.mEndParent != null))
	//*   5    8:aload           4
	//*   6   10:getfield        #126 <Field boolean Visibility$VisibilityInfo.mVisibilityChange>
	//*   7   13:ifeq            76
	//*   8   16:aload           4
	//*   9   18:getfield        #149 <Field ViewGroup Visibility$VisibilityInfo.mStartParent>
	//*  10   21:ifnonnull       32
	//*  11   24:aload           4
	//*  12   26:getfield        #155 <Field ViewGroup Visibility$VisibilityInfo.mEndParent>
	//*  13   29:ifnull          76
		{
			if(visibilityinfo.mFadeIn)
	//*  14   32:aload           4
	//*  15   34:getfield        #129 <Field boolean Visibility$VisibilityInfo.mFadeIn>
	//*  16   37:ifeq            58
				return onAppear(viewgroup, transitionvalues, visibilityinfo.mStartVisibility, transitionvalues1, visibilityinfo.mEndVisibility);
	//   17   40:aload_0         
	//   18   41:aload_1         
	//   19   42:aload_2         
	//   20   43:aload           4
	//   21   45:getfield        #143 <Field int Visibility$VisibilityInfo.mStartVisibility>
	//   22   48:aload_3         
	//   23   49:aload           4
	//   24   51:getfield        #152 <Field int Visibility$VisibilityInfo.mEndVisibility>
	//   25   54:invokevirtual   #170 <Method Animator onAppear(ViewGroup, TransitionValues, int, TransitionValues, int)>
	//   26   57:areturn         
			else
				return onDisappear(viewgroup, transitionvalues, visibilityinfo.mStartVisibility, transitionvalues1, visibilityinfo.mEndVisibility);
	//   27   58:aload_0         
	//   28   59:aload_1         
	//   29   60:aload_2         
	//   30   61:aload           4
	//   31   63:getfield        #143 <Field int Visibility$VisibilityInfo.mStartVisibility>
	//   32   66:aload_3         
	//   33   67:aload           4
	//   34   69:getfield        #152 <Field int Visibility$VisibilityInfo.mEndVisibility>
	//   35   72:invokevirtual   #173 <Method Animator onDisappear(ViewGroup, TransitionValues, int, TransitionValues, int)>
	//   36   75:areturn         
		} else
		{
			return null;
	//   37   76:aconst_null     
	//   38   77:areturn         
		}
	}

	public int getMode()
	{
		return mMode;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int mMode>
	//    2    4:ireturn         
	}

	public String[] getTransitionProperties()
	{
		return sTransitionProperties;
	//    0    0:getstatic       #39  <Field String[] sTransitionProperties>
	//    1    3:areturn         
	}

	public boolean isTransitionRequired(TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		if((transitionvalues != null || transitionvalues1 != null) && (transitionvalues == null || transitionvalues1 == null || transitionvalues1.values.containsKey("android:visibility:visibility") == transitionvalues.values.containsKey("android:visibility:visibility")))
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       10
	//*   4    8:iconst_0        
	//*   5    9:ireturn         
	//*   6   10:aload_1         
	//*   7   11:ifnull          43
	//*   8   14:aload_2         
	//*   9   15:ifnull          43
	//*  10   18:aload_2         
	//*  11   19:getfield        #97  <Field Map TransitionValues.values>
	//*  12   22:ldc1            #30  <String "android:visibility:visibility">
	//*  13   24:invokeinterface #133 <Method boolean Map.containsKey(Object)>
	//*  14   29:aload_1         
	//*  15   30:getfield        #97  <Field Map TransitionValues.values>
	//*  16   33:ldc1            #30  <String "android:visibility:visibility">
	//*  17   35:invokeinterface #133 <Method boolean Map.containsKey(Object)>
	//*  18   40:icmpne          8
		{
			transitionvalues = ((TransitionValues) (getVisibilityChangeInfo(transitionvalues, transitionvalues1)));
	//   19   43:aload_0         
	//   20   44:aload_1         
	//   21   45:aload_2         
	//   22   46:invokespecial   #166 <Method Visibility$VisibilityInfo getVisibilityChangeInfo(TransitionValues, TransitionValues)>
	//   23   49:astore_1        
			if(((VisibilityInfo) (transitionvalues)).mVisibilityChange && (((VisibilityInfo) (transitionvalues)).mStartVisibility == 0 || ((VisibilityInfo) (transitionvalues)).mEndVisibility == 0))
	//*  24   50:aload_1         
	//*  25   51:getfield        #126 <Field boolean Visibility$VisibilityInfo.mVisibilityChange>
	//*  26   54:ifeq            8
	//*  27   57:aload_1         
	//*  28   58:getfield        #143 <Field int Visibility$VisibilityInfo.mStartVisibility>
	//*  29   61:ifeq            71
	//*  30   64:aload_1         
	//*  31   65:getfield        #152 <Field int Visibility$VisibilityInfo.mEndVisibility>
	//*  32   68:ifne            8
				return true;
	//   33   71:iconst_1        
	//   34   72:ireturn         
		}
		return false;
	}

	public boolean isVisible(TransitionValues transitionvalues)
	{
		if(transitionvalues == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		int i = ((Integer)transitionvalues.values.get("android:visibility:visibility")).intValue();
	//    4    6:aload_1         
	//    5    7:getfield        #97  <Field Map TransitionValues.values>
	//    6   10:ldc1            #30  <String "android:visibility:visibility">
	//    7   12:invokeinterface #137 <Method Object Map.get(Object)>
	//    8   17:checkcast       #99  <Class Integer>
	//    9   20:invokevirtual   #140 <Method int Integer.intValue()>
	//   10   23:istore_2        
		transitionvalues = ((TransitionValues) ((View)transitionvalues.values.get("android:visibility:parent")));
	//   11   24:aload_1         
	//   12   25:getfield        #97  <Field Map TransitionValues.values>
	//   13   28:ldc1            #24  <String "android:visibility:parent">
	//   14   30:invokeinterface #137 <Method Object Map.get(Object)>
	//   15   35:checkcast       #89  <Class View>
	//   16   38:astore_1        
		boolean flag;
		if(i == 0 && transitionvalues != null)
	//*  17   39:iload_2         
	//*  18   40:ifne            51
	//*  19   43:aload_1         
	//*  20   44:ifnull          51
			flag = true;
	//   21   47:iconst_1        
	//   22   48:istore_3        
		else
	//*  23   49:iload_3         
	//*  24   50:ireturn         
			flag = false;
	//   25   51:iconst_0        
	//   26   52:istore_3        
		return flag;
	//*  27   53:goto            49
	}

	public Animator onAppear(ViewGroup viewgroup, TransitionValues transitionvalues, int i, TransitionValues transitionvalues1, int j)
	{
		View view;
		if((mMode & 1) == 1 && transitionvalues1 != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field int mMode>
	//*   2    4:iconst_1        
	//*   3    5:iand            
	//*   4    6:iconst_1        
	//*   5    7:icmpne          15
	//*   6   10:aload           4
	//*   7   12:ifnonnull       17
	//*   8   15:aconst_null     
	//*   9   16:areturn         
			if(transitionvalues != null || !getVisibilityChangeInfo(getMatchedTransitionValues(view = (View)transitionvalues1.view.getParent(), false), getTransitionValues(view, false)).mVisibilityChange)
	//*  10   17:aload_2         
	//*  11   18:ifnonnull       58
	//*  12   21:aload           4
	//*  13   23:getfield        #87  <Field View TransitionValues.view>
	//*  14   26:invokevirtual   #113 <Method android.view.ViewParent View.getParent()>
	//*  15   29:checkcast       #89  <Class View>
	//*  16   32:astore          6
	//*  17   34:aload_0         
	//*  18   35:aload_0         
	//*  19   36:aload           6
	//*  20   38:iconst_0        
	//*  21   39:invokevirtual   #185 <Method TransitionValues getMatchedTransitionValues(View, boolean)>
	//*  22   42:aload_0         
	//*  23   43:aload           6
	//*  24   45:iconst_0        
	//*  25   46:invokevirtual   #188 <Method TransitionValues getTransitionValues(View, boolean)>
	//*  26   49:invokespecial   #166 <Method Visibility$VisibilityInfo getVisibilityChangeInfo(TransitionValues, TransitionValues)>
	//*  27   52:getfield        #126 <Field boolean Visibility$VisibilityInfo.mVisibilityChange>
	//*  28   55:ifne            15
				return onAppear(viewgroup, transitionvalues1.view, transitionvalues, transitionvalues1);
	//   29   58:aload_0         
	//   30   59:aload_1         
	//   31   60:aload           4
	//   32   62:getfield        #87  <Field View TransitionValues.view>
	//   33   65:aload_2         
	//   34   66:aload           4
	//   35   68:invokevirtual   #191 <Method Animator onAppear(ViewGroup, View, TransitionValues, TransitionValues)>
	//   36   71:areturn         
		return null;
	}

	public Animator onAppear(ViewGroup viewgroup, View view, TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Animator onDisappear(ViewGroup viewgroup, TransitionValues transitionvalues, int i, TransitionValues transitionvalues1, int j)
	{
		if((mMode & 2) != 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field int mMode>
	//*   2    4:iconst_2        
	//*   3    5:iand            
	//*   4    6:iconst_2        
	//*   5    7:icmpeq          12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		final Object finalOverlayView;
		final Object overlay;
		Object obj;
		Object obj1;
		Object obj2;
		if(transitionvalues != null)
	//*   8   12:aload_2         
	//*   9   13:ifnull          188
			overlay = ((Object) (transitionvalues.view));
	//   10   16:aload_2         
	//   11   17:getfield        #87  <Field View TransitionValues.view>
	//   12   20:astore          7
		else
	//*  13   22:aload           4
	//*  14   24:ifnull          194
	//*  15   27:aload           4
	//*  16   29:getfield        #87  <Field View TransitionValues.view>
	//*  17   32:astore          6
	//*  18   34:aconst_null     
	//*  19   35:astore          10
	//*  20   37:aconst_null     
	//*  21   38:astore          9
	//*  22   40:aload           6
	//*  23   42:ifnull          53
	//*  24   45:aload           6
	//*  25   47:invokevirtual   #113 <Method android.view.ViewParent View.getParent()>
	//*  26   50:ifnonnull       379
	//*  27   53:aload           6
	//*  28   55:ifnull          200
	//*  29   58:aload           9
	//*  30   60:astore          8
	//*  31   62:aload           6
	//*  32   64:ifnull          443
	//*  33   67:aload_2         
	//*  34   68:ifnull          443
	//*  35   71:aload_2         
	//*  36   72:getfield        #97  <Field Map TransitionValues.values>
	//*  37   75:ldc1            #27  <String "android:visibility:screenLocation">
	//*  38   77:invokeinterface #137 <Method Object Map.get(Object)>
	//*  39   82:checkcast       #192 <Class int[]>
	//*  40   85:checkcast       #192 <Class int[]>
	//*  41   88:astore          7
	//*  42   90:aload           7
	//*  43   92:iconst_0        
	//*  44   93:iaload          
	//*  45   94:istore_3        
	//*  46   95:aload           7
	//*  47   97:iconst_1        
	//*  48   98:iaload          
	//*  49   99:istore          5
	//*  50  101:iconst_2        
	//*  51  102:newarray        int[]
	//*  52  104:astore          7
	//*  53  106:aload_1         
	//*  54  107:aload           7
	//*  55  109:invokevirtual   #193 <Method void ViewGroup.getLocationOnScreen(int[])>
	//*  56  112:aload           6
	//*  57  114:iload_3         
	//*  58  115:aload           7
	//*  59  117:iconst_0        
	//*  60  118:iaload          
	//*  61  119:isub            
	//*  62  120:aload           6
	//*  63  122:invokevirtual   #196 <Method int View.getLeft()>
	//*  64  125:isub            
	//*  65  126:invokevirtual   #199 <Method void View.offsetLeftAndRight(int)>
	//*  66  129:aload           6
	//*  67  131:iload           5
	//*  68  133:aload           7
	//*  69  135:iconst_1        
	//*  70  136:iaload          
	//*  71  137:isub            
	//*  72  138:aload           6
	//*  73  140:invokevirtual   #202 <Method int View.getTop()>
	//*  74  143:isub            
	//*  75  144:invokevirtual   #205 <Method void View.offsetTopAndBottom(int)>
	//*  76  147:aload_1         
	//*  77  148:invokestatic    #211 <Method ViewGroupOverlayImpl ViewGroupUtils.getOverlay(ViewGroup)>
	//*  78  151:astore          7
	//*  79  153:aload           7
	//*  80  155:aload           6
	//*  81  157:invokeinterface #217 <Method void ViewGroupOverlayImpl.add(View)>
	//*  82  162:aload_0         
	//*  83  163:aload_1         
	//*  84  164:aload           6
	//*  85  166:aload_2         
	//*  86  167:aload           4
	//*  87  169:invokevirtual   #219 <Method Animator onDisappear(ViewGroup, View, TransitionValues, TransitionValues)>
	//*  88  172:astore_1        
	//*  89  173:aload_1         
	//*  90  174:ifnonnull       425
	//*  91  177:aload           7
	//*  92  179:aload           6
	//*  93  181:invokeinterface #222 <Method void ViewGroupOverlayImpl.remove(View)>
	//*  94  186:aload_1         
	//*  95  187:areturn         
			overlay = null;
	//   96  188:aconst_null     
	//   97  189:astore          7
		if(transitionvalues1 != null)
			finalOverlayView = ((Object) (transitionvalues1.view));
		else
	//*  98  191:goto            22
			finalOverlayView = null;
	//   99  194:aconst_null     
	//  100  195:astore          6
		obj2 = null;
		obj1 = null;
		if(finalOverlayView == null || ((View) (finalOverlayView)).getParent() == null)
		{
			if(finalOverlayView != null)
			{
				obj = ((Object) (obj1));
			} else
	//* 101  197:goto            34
			{
				finalOverlayView = ((Object) (obj2));
	//  102  200:aload           10
	//  103  202:astore          6
				obj = ((Object) (obj1));
	//  104  204:aload           9
	//  105  206:astore          8
				if(overlay != null)
	//* 106  208:aload           7
	//* 107  210:ifnull          62
					if(((View) (overlay)).getParent() == null)
	//* 108  213:aload           7
	//* 109  215:invokevirtual   #113 <Method android.view.ViewParent View.getParent()>
	//* 110  218:ifnonnull       232
					{
						finalOverlayView = overlay;
	//  111  221:aload           7
	//  112  223:astore          6
						obj = ((Object) (obj1));
	//  113  225:aload           9
	//  114  227:astore          8
					} else
	//* 115  229:goto            62
					{
						finalOverlayView = ((Object) (obj2));
	//  116  232:aload           10
	//  117  234:astore          6
						obj = ((Object) (obj1));
	//  118  236:aload           9
	//  119  238:astore          8
						if(((View) (overlay)).getParent() instanceof View)
	//* 120  240:aload           7
	//* 121  242:invokevirtual   #113 <Method android.view.ViewParent View.getParent()>
	//* 122  245:instanceof      #89  <Class View>
	//* 123  248:ifeq            62
						{
							View view = (View)((View) (overlay)).getParent();
	//  124  251:aload           7
	//  125  253:invokevirtual   #113 <Method android.view.ViewParent View.getParent()>
	//  126  256:checkcast       #89  <Class View>
	//  127  259:astore          11
							if(!getVisibilityChangeInfo(getTransitionValues(view, true), getMatchedTransitionValues(view, true)).mVisibilityChange)
	//* 128  261:aload_0         
	//* 129  262:aload_0         
	//* 130  263:aload           11
	//* 131  265:iconst_1        
	//* 132  266:invokevirtual   #188 <Method TransitionValues getTransitionValues(View, boolean)>
	//* 133  269:aload_0         
	//* 134  270:aload           11
	//* 135  272:iconst_1        
	//* 136  273:invokevirtual   #185 <Method TransitionValues getMatchedTransitionValues(View, boolean)>
	//* 137  276:invokespecial   #166 <Method Visibility$VisibilityInfo getVisibilityChangeInfo(TransitionValues, TransitionValues)>
	//* 138  279:getfield        #126 <Field boolean Visibility$VisibilityInfo.mVisibilityChange>
	//* 139  282:ifne            302
							{
								finalOverlayView = ((Object) (TransitionUtils.copyViewImage(viewgroup, ((View) (overlay)), view)));
	//  140  285:aload_1         
	//  141  286:aload           7
	//  142  288:aload           11
	//  143  290:invokestatic    #228 <Method View TransitionUtils.copyViewImage(ViewGroup, View, View)>
	//  144  293:astore          6
								obj = ((Object) (obj1));
	//  145  295:aload           9
	//  146  297:astore          8
							} else
	//* 147  299:goto            62
							{
								finalOverlayView = ((Object) (obj2));
	//  148  302:aload           10
	//  149  304:astore          6
								obj = ((Object) (obj1));
	//  150  306:aload           9
	//  151  308:astore          8
								if(view.getParent() == null)
	//* 152  310:aload           11
	//* 153  312:invokevirtual   #113 <Method android.view.ViewParent View.getParent()>
	//* 154  315:ifnonnull       62
								{
									i = view.getId();
	//  155  318:aload           11
	//  156  320:invokevirtual   #231 <Method int View.getId()>
	//  157  323:istore_3        
									finalOverlayView = ((Object) (obj2));
	//  158  324:aload           10
	//  159  326:astore          6
									obj = ((Object) (obj1));
	//  160  328:aload           9
	//  161  330:astore          8
									if(i != -1)
	//* 162  332:iload_3         
	//* 163  333:iconst_m1       
	//* 164  334:icmpeq          62
									{
										finalOverlayView = ((Object) (obj2));
	//  165  337:aload           10
	//  166  339:astore          6
										obj = ((Object) (obj1));
	//  167  341:aload           9
	//  168  343:astore          8
										if(viewgroup.findViewById(i) != null)
	//* 169  345:aload_1         
	//* 170  346:iload_3         
	//* 171  347:invokevirtual   #235 <Method View ViewGroup.findViewById(int)>
	//* 172  350:ifnull          62
										{
											finalOverlayView = ((Object) (obj2));
	//  173  353:aload           10
	//  174  355:astore          6
											obj = ((Object) (obj1));
	//  175  357:aload           9
	//  176  359:astore          8
											if(mCanRemoveViews)
	//* 177  361:aload_0         
	//* 178  362:getfield        #238 <Field boolean mCanRemoveViews>
	//* 179  365:ifeq            62
											{
												finalOverlayView = overlay;
	//  180  368:aload           7
	//  181  370:astore          6
												obj = ((Object) (obj1));
	//  182  372:aload           9
	//  183  374:astore          8
											}
										}
									}
								}
							}
						}
					}
			}
		} else
	//* 184  376:goto            62
		if(j == 4)
	//* 185  379:iload           5
	//* 186  381:iconst_4        
	//* 187  382:icmpne          396
		{
			obj = finalOverlayView;
	//  188  385:aload           6
	//  189  387:astore          8
			finalOverlayView = ((Object) (obj2));
	//  190  389:aload           10
	//  191  391:astore          6
		} else
	//* 192  393:goto            62
		if(overlay == finalOverlayView)
	//* 193  396:aload           7
	//* 194  398:aload           6
	//* 195  400:if_acmpne       414
		{
			obj = finalOverlayView;
	//  196  403:aload           6
	//  197  405:astore          8
			finalOverlayView = ((Object) (obj2));
	//  198  407:aload           10
	//  199  409:astore          6
		} else
	//* 200  411:goto            62
		{
			finalOverlayView = overlay;
	//  201  414:aload           7
	//  202  416:astore          6
			obj = ((Object) (obj1));
	//  203  418:aload           9
	//  204  420:astore          8
		}
		if(finalOverlayView != null && transitionvalues != null)
		{
			overlay = ((Object) ((int[])(int[])transitionvalues.values.get("android:visibility:screenLocation")));
			i = overlay[0];
			j = overlay[1];
			overlay = ((Object) (new int[2]));
			viewgroup.getLocationOnScreen(((int []) (overlay)));
			((View) (finalOverlayView)).offsetLeftAndRight(i - overlay[0] - ((View) (finalOverlayView)).getLeft());
			((View) (finalOverlayView)).offsetTopAndBottom(j - overlay[1] - ((View) (finalOverlayView)).getTop());
			overlay = ((Object) (ViewGroupUtils.getOverlay(viewgroup)));
			((ViewGroupOverlayImpl) (overlay)).add(((View) (finalOverlayView)));
			viewgroup = ((ViewGroup) (onDisappear(viewgroup, ((View) (finalOverlayView)), transitionvalues, transitionvalues1)));
			if(viewgroup == null)
			{
				((ViewGroupOverlayImpl) (overlay)).remove(((View) (finalOverlayView)));
				return ((Animator) (viewgroup));
			} else
	//* 205  422:goto            62
			{
				((Animator) (viewgroup)).addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

					public void onAnimationEnd(Animator animator)
					{
						overlay.remove(finalOverlayView);
					//    0    0:aload_0         
					//    1    1:getfield        #21  <Field ViewGroupOverlayImpl val$overlay>
					//    2    4:aload_0         
					//    3    5:getfield        #23  <Field View val$finalOverlayView>
					//    4    8:invokeinterface #35  <Method void ViewGroupOverlayImpl.remove(View)>
					//    5   13:return          
					}

					final Visibility this$0;
					final View val$finalOverlayView;
					final ViewGroupOverlayImpl val$overlay;

			
			{
				this$0 = Visibility.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field Visibility this$0>
				overlay = viewgroupoverlayimpl;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field ViewGroupOverlayImpl val$overlay>
				finalOverlayView = view;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #23  <Field View val$finalOverlayView>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #26  <Method void AnimatorListenerAdapter()>
			//   11   19:return          
			}
				}
)));
	//  206  425:aload_1         
	//  207  426:new             #6   <Class Visibility$1>
	//  208  429:dup             
	//  209  430:aload_0         
	//  210  431:aload           7
	//  211  433:aload           6
	//  212  435:invokespecial   #241 <Method void Visibility$1(Visibility, ViewGroupOverlayImpl, View)>
	//  213  438:invokevirtual   #247 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
				return ((Animator) (viewgroup));
	//  214  441:aload_1         
	//  215  442:areturn         
			}
		}
		if(obj != null)
	//* 216  443:aload           8
	//* 217  445:ifnull          514
		{
			i = ((View) (obj)).getVisibility();
	//  218  448:aload           8
	//  219  450:invokevirtual   #93  <Method int View.getVisibility()>
	//  220  453:istore_3        
			ViewUtils.setTransitionVisibility(((View) (obj)), 0);
	//  221  454:aload           8
	//  222  456:iconst_0        
	//  223  457:invokestatic    #253 <Method void ViewUtils.setTransitionVisibility(View, int)>
			viewgroup = ((ViewGroup) (onDisappear(viewgroup, ((View) (obj)), transitionvalues, transitionvalues1)));
	//  224  460:aload_0         
	//  225  461:aload_1         
	//  226  462:aload           8
	//  227  464:aload_2         
	//  228  465:aload           4
	//  229  467:invokevirtual   #219 <Method Animator onDisappear(ViewGroup, View, TransitionValues, TransitionValues)>
	//  230  470:astore_1        
			if(viewgroup != null)
	//* 231  471:aload_1         
	//* 232  472:ifnull          506
			{
				transitionvalues = ((TransitionValues) (new DisappearListener(((View) (obj)), j, true)));
	//  233  475:new             #8   <Class Visibility$DisappearListener>
	//  234  478:dup             
	//  235  479:aload           8
	//  236  481:iload           5
	//  237  483:iconst_1        
	//  238  484:invokespecial   #256 <Method void Visibility$DisappearListener(View, int, boolean)>
	//  239  487:astore_2        
				((Animator) (viewgroup)).addListener(((android.animation.Animator.AnimatorListener) (transitionvalues)));
	//  240  488:aload_1         
	//  241  489:aload_2         
	//  242  490:invokevirtual   #247 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
				AnimatorUtils.addPauseListener(((Animator) (viewgroup)), ((AnimatorListenerAdapter) (transitionvalues)));
	//  243  493:aload_1         
	//  244  494:aload_2         
	//  245  495:invokestatic    #262 <Method void AnimatorUtils.addPauseListener(Animator, AnimatorListenerAdapter)>
				addListener(((Transition.TransitionListener) (transitionvalues)));
	//  246  498:aload_0         
	//  247  499:aload_2         
	//  248  500:invokevirtual   #265 <Method Transition addListener(Transition$TransitionListener)>
	//  249  503:pop             
				return ((Animator) (viewgroup));
	//  250  504:aload_1         
	//  251  505:areturn         
			} else
			{
				ViewUtils.setTransitionVisibility(((View) (obj)), i);
	//  252  506:aload           8
	//  253  508:iload_3         
	//  254  509:invokestatic    #253 <Method void ViewUtils.setTransitionVisibility(View, int)>
				return ((Animator) (viewgroup));
	//  255  512:aload_1         
	//  256  513:areturn         
			}
		} else
		{
			return null;
	//  257  514:aconst_null     
	//  258  515:areturn         
		}
	}

	public Animator onDisappear(ViewGroup viewgroup, View view, TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void setMode(int i)
	{
		if((i & -4) != 0)
	//*   0    0:iload_1         
	//*   1    1:bipush          -4
	//*   2    3:iand            
	//*   3    4:ifeq            18
		{
			throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
	//    4    7:new             #267 <Class IllegalArgumentException>
	//    5   10:dup             
	//    6   11:ldc2            #269 <String "Only MODE_IN and MODE_OUT flags are allowed">
	//    7   14:invokespecial   #272 <Method void IllegalArgumentException(String)>
	//    8   17:athrow          
		} else
		{
			mMode = i;
	//    9   18:aload_0         
	//   10   19:iload_1         
	//   11   20:putfield        #45  <Field int mMode>
			return;
	//   12   23:return          
		}
	}

	public static final int MODE_IN = 1;
	public static final int MODE_OUT = 2;
	private static final String PROPNAME_PARENT = "android:visibility:parent";
	private static final String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
	static final String PROPNAME_VISIBILITY = "android:visibility:visibility";
	private static final String sTransitionProperties[] = {
		"android:visibility:visibility", "android:visibility:parent"
	};
	private int mMode;

	static 
	{
	//    0    0:iconst_2        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #30  <String "android:visibility:visibility">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #24  <String "android:visibility:parent">
	//    9   13:aastore         
	//   10   14:putstatic       #39  <Field String[] sTransitionProperties>
	//*  11   17:return          
	}
}
