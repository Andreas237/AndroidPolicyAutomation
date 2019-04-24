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
		implements AnimatorUtilsApi14.AnimatorPauseListenerCompat, Transition.TransitionListener
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
	//*  56  134:ifnull          281
	//*  57  137:aload_2         
	//*  58  138:ifnull          281
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
		if(visibilityinfo.mStartVisibility == visibilityinfo.mEndVisibility && visibilityinfo.mStartParent == visibilityinfo.mEndParent)
			return visibilityinfo;
	//*  84  188:goto            133
		if(visibilityinfo.mStartVisibility == visibilityinfo.mEndVisibility) goto _L4; else goto _L3
	//   85  191:aload_3         
	//   86  192:getfield        #143 <Field int Visibility$VisibilityInfo.mStartVisibility>
	//   87  195:aload_3         
	//   88  196:getfield        #152 <Field int Visibility$VisibilityInfo.mEndVisibility>
	//   89  199:icmpeq          241
_L3:
		if(visibilityinfo.mStartVisibility != 0) goto _L6; else goto _L5
	//   90  202:aload_3         
	//   91  203:getfield        #143 <Field int Visibility$VisibilityInfo.mStartVisibility>
	//   92  206:ifne            221
_L5:
		visibilityinfo.mFadeIn = false;
	//   93  209:aload_3         
	//   94  210:iconst_0        
	//   95  211:putfield        #129 <Field boolean Visibility$VisibilityInfo.mFadeIn>
		visibilityinfo.mVisibilityChange = true;
	//   96  214:aload_3         
	//   97  215:iconst_1        
	//   98  216:putfield        #126 <Field boolean Visibility$VisibilityInfo.mVisibilityChange>
_L8:
		return visibilityinfo;
	//   99  219:aload_3         
	//  100  220:areturn         
_L6:
		if(visibilityinfo.mEndVisibility == 0)
	//* 101  221:aload_3         
	//* 102  222:getfield        #152 <Field int Visibility$VisibilityInfo.mEndVisibility>
	//* 103  225:ifne            219
		{
			visibilityinfo.mFadeIn = true;
	//  104  228:aload_3         
	//  105  229:iconst_1        
	//  106  230:putfield        #129 <Field boolean Visibility$VisibilityInfo.mFadeIn>
			visibilityinfo.mVisibilityChange = true;
	//  107  233:aload_3         
	//  108  234:iconst_1        
	//  109  235:putfield        #126 <Field boolean Visibility$VisibilityInfo.mVisibilityChange>
		}
		continue; /* Loop/switch isn't completed */
	//  110  238:goto            219
_L4:
		if(visibilityinfo.mEndParent == null)
	//* 111  241:aload_3         
	//* 112  242:getfield        #155 <Field ViewGroup Visibility$VisibilityInfo.mEndParent>
	//* 113  245:ifnonnull       261
		{
			visibilityinfo.mFadeIn = false;
	//  114  248:aload_3         
	//  115  249:iconst_0        
	//  116  250:putfield        #129 <Field boolean Visibility$VisibilityInfo.mFadeIn>
			visibilityinfo.mVisibilityChange = true;
	//  117  253:aload_3         
	//  118  254:iconst_1        
	//  119  255:putfield        #126 <Field boolean Visibility$VisibilityInfo.mVisibilityChange>
		} else
	//* 120  258:goto            219
		if(visibilityinfo.mStartParent == null)
	//* 121  261:aload_3         
	//* 122  262:getfield        #149 <Field ViewGroup Visibility$VisibilityInfo.mStartParent>
	//* 123  265:ifnonnull       219
		{
			visibilityinfo.mFadeIn = true;
	//  124  268:aload_3         
	//  125  269:iconst_1        
	//  126  270:putfield        #129 <Field boolean Visibility$VisibilityInfo.mFadeIn>
			visibilityinfo.mVisibilityChange = true;
	//  127  273:aload_3         
	//  128  274:iconst_1        
	//  129  275:putfield        #126 <Field boolean Visibility$VisibilityInfo.mVisibilityChange>
		}
		continue; /* Loop/switch isn't completed */
	//  130  278:goto            219
_L2:
		if(transitionvalues == null && visibilityinfo.mEndVisibility == 0)
	//* 131  281:aload_1         
	//* 132  282:ifnonnull       305
	//* 133  285:aload_3         
	//* 134  286:getfield        #152 <Field int Visibility$VisibilityInfo.mEndVisibility>
	//* 135  289:ifne            305
		{
			visibilityinfo.mFadeIn = true;
	//  136  292:aload_3         
	//  137  293:iconst_1        
	//  138  294:putfield        #129 <Field boolean Visibility$VisibilityInfo.mFadeIn>
			visibilityinfo.mVisibilityChange = true;
	//  139  297:aload_3         
	//  140  298:iconst_1        
	//  141  299:putfield        #126 <Field boolean Visibility$VisibilityInfo.mVisibilityChange>
		} else
	//* 142  302:goto            219
		if(transitionvalues1 == null && visibilityinfo.mStartVisibility == 0)
	//* 143  305:aload_2         
	//* 144  306:ifnonnull       219
	//* 145  309:aload_3         
	//* 146  310:getfield        #143 <Field int Visibility$VisibilityInfo.mStartVisibility>
	//* 147  313:ifne            219
		{
			visibilityinfo.mFadeIn = false;
	//  148  316:aload_3         
	//  149  317:iconst_0        
	//  150  318:putfield        #129 <Field boolean Visibility$VisibilityInfo.mFadeIn>
			visibilityinfo.mVisibilityChange = true;
	//  151  321:aload_3         
	//  152  322:iconst_1        
	//  153  323:putfield        #126 <Field boolean Visibility$VisibilityInfo.mVisibilityChange>
		}
		if(true) goto _L8; else goto _L7
	//  154  326:goto            219
_L7:
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
		if((mMode & 1) != 1 || transitionvalues1 == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field int mMode>
	//*   2    4:iconst_1        
	//*   3    5:iand            
	//*   4    6:iconst_1        
	//*   5    7:icmpne          15
	//*   6   10:aload           4
	//*   7   12:ifnonnull       17
			return null;
	//    8   15:aconst_null     
	//    9   16:areturn         
		if(transitionvalues == null)
	//*  10   17:aload_2         
	//*  11   18:ifnonnull       60
		{
			View view = (View)transitionvalues1.view.getParent();
	//   12   21:aload           4
	//   13   23:getfield        #87  <Field View TransitionValues.view>
	//   14   26:invokevirtual   #113 <Method android.view.ViewParent View.getParent()>
	//   15   29:checkcast       #89  <Class View>
	//   16   32:astore          6
			if(getVisibilityChangeInfo(getMatchedTransitionValues(view, false), getTransitionValues(view, false)).mVisibilityChange)
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
	//*  28   55:ifeq            60
				return null;
	//   29   58:aconst_null     
	//   30   59:areturn         
		}
		return onAppear(viewgroup, transitionvalues1.view, transitionvalues, transitionvalues1);
	//   31   60:aload_0         
	//   32   61:aload_1         
	//   33   62:aload           4
	//   34   64:getfield        #87  <Field View TransitionValues.view>
	//   35   67:aload_2         
	//   36   68:aload           4
	//   37   70:invokevirtual   #191 <Method Animator onAppear(ViewGroup, View, TransitionValues, TransitionValues)>
	//   38   73:areturn         
	}

	public Animator onAppear(ViewGroup viewgroup, View view, TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Animator onDisappear(ViewGroup viewgroup, TransitionValues transitionvalues, int i, TransitionValues transitionvalues1, int j)
	{
		if((mMode & 2) == 2) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int mMode>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:iconst_2        
	//    5    7:icmpeq          12
_L1:
		return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
_L2:
		final Object overlay;
		final Object finalOverlayView;
		if(transitionvalues != null)
	//*   8   12:aload_2         
	//*   9   13:ifnull          189
			finalOverlayView = ((Object) (transitionvalues.view));
	//   10   16:aload_2         
	//   11   17:getfield        #87  <Field View TransitionValues.view>
	//   12   20:astore          7
		else
	//*  13   22:aload           4
	//*  14   24:ifnull          195
	//*  15   27:aload           4
	//*  16   29:getfield        #87  <Field View TransitionValues.view>
	//*  17   32:astore          6
	//*  18   34:aload           6
	//*  19   36:ifnull          47
	//*  20   39:aload           6
	//*  21   41:invokevirtual   #113 <Method android.view.ViewParent View.getParent()>
	//*  22   44:ifnonnull       326
	//*  23   47:aload           6
	//*  24   49:ifnull          201
	//*  25   52:aconst_null     
	//*  26   53:astore          8
	//*  27   55:aload           6
	//*  28   57:astore          7
	//*  29   59:aload           8
	//*  30   61:astore          6
	//*  31   63:aload           7
	//*  32   65:ifnull          375
	//*  33   68:aload_2         
	//*  34   69:ifnull          375
	//*  35   72:aload_2         
	//*  36   73:getfield        #97  <Field Map TransitionValues.values>
	//*  37   76:ldc1            #27  <String "android:visibility:screenLocation">
	//*  38   78:invokeinterface #137 <Method Object Map.get(Object)>
	//*  39   83:checkcast       #192 <Class int[]>
	//*  40   86:checkcast       #192 <Class int[]>
	//*  41   89:astore          6
	//*  42   91:aload           6
	//*  43   93:iconst_0        
	//*  44   94:iaload          
	//*  45   95:istore_3        
	//*  46   96:aload           6
	//*  47   98:iconst_1        
	//*  48   99:iaload          
	//*  49  100:istore          5
	//*  50  102:iconst_2        
	//*  51  103:newarray        int[]
	//*  52  105:astore          6
	//*  53  107:aload_1         
	//*  54  108:aload           6
	//*  55  110:invokevirtual   #193 <Method void ViewGroup.getLocationOnScreen(int[])>
	//*  56  113:aload           7
	//*  57  115:iload_3         
	//*  58  116:aload           6
	//*  59  118:iconst_0        
	//*  60  119:iaload          
	//*  61  120:isub            
	//*  62  121:aload           7
	//*  63  123:invokevirtual   #196 <Method int View.getLeft()>
	//*  64  126:isub            
	//*  65  127:invokevirtual   #199 <Method void View.offsetLeftAndRight(int)>
	//*  66  130:aload           7
	//*  67  132:iload           5
	//*  68  134:aload           6
	//*  69  136:iconst_1        
	//*  70  137:iaload          
	//*  71  138:isub            
	//*  72  139:aload           7
	//*  73  141:invokevirtual   #202 <Method int View.getTop()>
	//*  74  144:isub            
	//*  75  145:invokevirtual   #205 <Method void View.offsetTopAndBottom(int)>
	//*  76  148:aload_1         
	//*  77  149:invokestatic    #211 <Method ViewGroupOverlayImpl ViewGroupUtils.getOverlay(ViewGroup)>
	//*  78  152:astore          6
	//*  79  154:aload           6
	//*  80  156:aload           7
	//*  81  158:invokeinterface #217 <Method void ViewGroupOverlayImpl.add(View)>
	//*  82  163:aload_0         
	//*  83  164:aload_1         
	//*  84  165:aload           7
	//*  85  167:aload_2         
	//*  86  168:aload           4
	//*  87  170:invokevirtual   #219 <Method Animator onDisappear(ViewGroup, View, TransitionValues, TransitionValues)>
	//*  88  173:astore_1        
	//*  89  174:aload_1         
	//*  90  175:ifnonnull       357
	//*  91  178:aload           6
	//*  92  180:aload           7
	//*  93  182:invokeinterface #222 <Method void ViewGroupOverlayImpl.remove(View)>
	//*  94  187:aload_1         
	//*  95  188:areturn         
			finalOverlayView = null;
	//   96  189:aconst_null     
	//   97  190:astore          7
		if(transitionvalues1 != null)
			overlay = ((Object) (transitionvalues1.view));
		else
	//*  98  192:goto            22
			overlay = null;
	//   99  195:aconst_null     
	//  100  196:astore          6
		if(overlay == null || ((View) (overlay)).getParent() == null)
		{
			if(overlay != null)
			{
				Object obj = null;
				finalOverlayView = overlay;
				overlay = ((Object) (obj));
			} else
	//* 101  198:goto            34
			{
label0:
				{
					if(finalOverlayView == null)
						break MISSING_BLOCK_LABEL_452;
	//  102  201:aload           7
	//  103  203:ifnull          452
					if(((View) (finalOverlayView)).getParent() != null)
						break label0;
	//  104  206:aload           7
	//  105  208:invokevirtual   #113 <Method android.view.ViewParent View.getParent()>
	//  106  211:ifnonnull       220
					overlay = null;
	//  107  214:aconst_null     
	//  108  215:astore          6
				}
			}
		} else
	//* 109  217:goto            63
	//* 110  220:aload           7
	//* 111  222:invokevirtual   #113 <Method android.view.ViewParent View.getParent()>
	//* 112  225:instanceof      #89  <Class View>
	//* 113  228:ifeq            452
	//* 114  231:aload           7
	//* 115  233:invokevirtual   #113 <Method android.view.ViewParent View.getParent()>
	//* 116  236:checkcast       #89  <Class View>
	//* 117  239:astore          6
	//* 118  241:aload_0         
	//* 119  242:aload_0         
	//* 120  243:aload           6
	//* 121  245:iconst_1        
	//* 122  246:invokevirtual   #188 <Method TransitionValues getTransitionValues(View, boolean)>
	//* 123  249:aload_0         
	//* 124  250:aload           6
	//* 125  252:iconst_1        
	//* 126  253:invokevirtual   #185 <Method TransitionValues getMatchedTransitionValues(View, boolean)>
	//* 127  256:invokespecial   #166 <Method Visibility$VisibilityInfo getVisibilityChangeInfo(TransitionValues, TransitionValues)>
	//* 128  259:getfield        #126 <Field boolean Visibility$VisibilityInfo.mVisibilityChange>
	//* 129  262:ifne            285
	//* 130  265:aload_1         
	//* 131  266:aload           7
	//* 132  268:aload           6
	//* 133  270:invokestatic    #228 <Method View TransitionUtils.copyViewImage(ViewGroup, View, View)>
	//* 134  273:astore          6
	//* 135  275:aload           6
	//* 136  277:astore          7
	//* 137  279:aconst_null     
	//* 138  280:astore          6
	//* 139  282:goto            63
	//* 140  285:aload           6
	//* 141  287:invokevirtual   #113 <Method android.view.ViewParent View.getParent()>
	//* 142  290:ifnonnull       446
	//* 143  293:aload           6
	//* 144  295:invokevirtual   #231 <Method int View.getId()>
	//* 145  298:istore_3        
	//* 146  299:iload_3         
	//* 147  300:iconst_m1       
	//* 148  301:icmpeq          446
	//* 149  304:aload_1         
	//* 150  305:iload_3         
	//* 151  306:invokevirtual   #235 <Method View ViewGroup.findViewById(int)>
	//* 152  309:ifnull          446
	//* 153  312:aload_0         
	//* 154  313:getfield        #238 <Field boolean mCanRemoveViews>
	//* 155  316:ifeq            446
	//* 156  319:aload           7
	//* 157  321:astore          6
	//* 158  323:goto            275
		if(j == 4)
	//* 159  326:iload           5
	//* 160  328:iconst_4        
	//* 161  329:icmpne          338
			finalOverlayView = null;
	//  162  332:aconst_null     
	//  163  333:astore          7
		else
	//* 164  335:goto            63
		if(finalOverlayView == overlay)
	//* 165  338:aload           7
	//* 166  340:aload           6
	//* 167  342:if_acmpne       351
			finalOverlayView = null;
	//  168  345:aconst_null     
	//  169  346:astore          7
		else
	//* 170  348:goto            63
			overlay = null;
	//  171  351:aconst_null     
	//  172  352:astore          6
_L5:
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
	//* 173  354:goto            63
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
	//  174  357:aload_1         
	//  175  358:new             #6   <Class Visibility$1>
	//  176  361:dup             
	//  177  362:aload_0         
	//  178  363:aload           6
	//  179  365:aload           7
	//  180  367:invokespecial   #241 <Method void Visibility$1(Visibility, ViewGroupOverlayImpl, View)>
	//  181  370:invokevirtual   #247 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
				return ((Animator) (viewgroup));
	//  182  373:aload_1         
	//  183  374:areturn         
			}
		}
		continue; /* Loop/switch isn't completed */
		if(!(((View) (finalOverlayView)).getParent() instanceof View))
			break MISSING_BLOCK_LABEL_452;
		overlay = ((Object) ((View)((View) (finalOverlayView)).getParent()));
		if(!getVisibilityChangeInfo(getTransitionValues(((View) (overlay)), true), getMatchedTransitionValues(((View) (overlay)), true)).mVisibilityChange)
		{
			overlay = ((Object) (TransitionUtils.copyViewImage(viewgroup, ((View) (finalOverlayView)), ((View) (overlay)))));
		} else
		{
			if(((View) (overlay)).getParent() != null)
				break MISSING_BLOCK_LABEL_446;
			i = ((View) (overlay)).getId();
			if(i == -1 || viewgroup.findViewById(i) == null || !mCanRemoveViews)
				break MISSING_BLOCK_LABEL_446;
			overlay = finalOverlayView;
		}
_L4:
		finalOverlayView = overlay;
		overlay = null;
		break MISSING_BLOCK_LABEL_63;
		if(overlay == null) goto _L1; else goto _L3
	//  184  375:aload           6
	//  185  377:ifnull          10
_L3:
		i = ((View) (overlay)).getVisibility();
	//  186  380:aload           6
	//  187  382:invokevirtual   #93  <Method int View.getVisibility()>
	//  188  385:istore_3        
		ViewUtils.setTransitionVisibility(((View) (overlay)), 0);
	//  189  386:aload           6
	//  190  388:iconst_0        
	//  191  389:invokestatic    #253 <Method void ViewUtils.setTransitionVisibility(View, int)>
		viewgroup = ((ViewGroup) (onDisappear(viewgroup, ((View) (overlay)), transitionvalues, transitionvalues1)));
	//  192  392:aload_0         
	//  193  393:aload_1         
	//  194  394:aload           6
	//  195  396:aload_2         
	//  196  397:aload           4
	//  197  399:invokevirtual   #219 <Method Animator onDisappear(ViewGroup, View, TransitionValues, TransitionValues)>
	//  198  402:astore_1        
		if(viewgroup != null)
	//* 199  403:aload_1         
	//* 200  404:ifnull          438
		{
			transitionvalues = ((TransitionValues) (new DisappearListener(((View) (overlay)), j, true)));
	//  201  407:new             #8   <Class Visibility$DisappearListener>
	//  202  410:dup             
	//  203  411:aload           6
	//  204  413:iload           5
	//  205  415:iconst_1        
	//  206  416:invokespecial   #256 <Method void Visibility$DisappearListener(View, int, boolean)>
	//  207  419:astore_2        
			((Animator) (viewgroup)).addListener(((android.animation.Animator.AnimatorListener) (transitionvalues)));
	//  208  420:aload_1         
	//  209  421:aload_2         
	//  210  422:invokevirtual   #247 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
			AnimatorUtils.addPauseListener(((Animator) (viewgroup)), ((AnimatorListenerAdapter) (transitionvalues)));
	//  211  425:aload_1         
	//  212  426:aload_2         
	//  213  427:invokestatic    #262 <Method void AnimatorUtils.addPauseListener(Animator, AnimatorListenerAdapter)>
			addListener(((Transition.TransitionListener) (transitionvalues)));
	//  214  430:aload_0         
	//  215  431:aload_2         
	//  216  432:invokevirtual   #265 <Method Transition addListener(Transition$TransitionListener)>
	//  217  435:pop             
			return ((Animator) (viewgroup));
	//  218  436:aload_1         
	//  219  437:areturn         
		} else
		{
			ViewUtils.setTransitionVisibility(((View) (overlay)), i);
	//  220  438:aload           6
	//  221  440:iload_3         
	//  222  441:invokestatic    #253 <Method void ViewUtils.setTransitionVisibility(View, int)>
			return ((Animator) (viewgroup));
	//  223  444:aload_1         
	//  224  445:areturn         
		}
		overlay = null;
	//  225  446:aconst_null     
	//  226  447:astore          6
		  goto _L4
	//* 227  449:goto            275
		overlay = null;
	//  228  452:aconst_null     
	//  229  453:astore          6
		finalOverlayView = null;
	//  230  455:aconst_null     
	//  231  456:astore          7
		  goto _L5
	//* 232  458:goto            63
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
