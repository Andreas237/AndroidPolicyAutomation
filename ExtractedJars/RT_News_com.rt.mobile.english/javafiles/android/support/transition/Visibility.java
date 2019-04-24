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
//			Transition, Styleable, TransitionValues, TransitionUtils, 
//			ViewGroupUtils, ViewGroupOverlayImpl, ViewUtils, AnimatorUtils

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
		VisibilityInfo visibilityinfo = new VisibilityInfo();
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
	//*  12   20:ifnull          79
	//*  13   23:aload_1         
	//*  14   24:getfield        #97  <Field Map TransitionValues.values>
	//*  15   27:ldc1            #30  <String "android:visibility:visibility">
	//*  16   29:invokeinterface #133 <Method boolean Map.containsKey(Object)>
	//*  17   34:ifeq            79
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
	//*  33   76:goto            89
		{
			visibilityinfo.mStartVisibility = -1;
	//   34   79:aload_3         
	//   35   80:iconst_m1       
	//   36   81:putfield        #143 <Field int Visibility$VisibilityInfo.mStartVisibility>
			visibilityinfo.mStartParent = null;
	//   37   84:aload_3         
	//   38   85:aconst_null     
	//   39   86:putfield        #149 <Field ViewGroup Visibility$VisibilityInfo.mStartParent>
		}
		if(transitionvalues1 != null && transitionvalues1.values.containsKey("android:visibility:visibility"))
	//*  40   89:aload_2         
	//*  41   90:ifnull          149
	//*  42   93:aload_2         
	//*  43   94:getfield        #97  <Field Map TransitionValues.values>
	//*  44   97:ldc1            #30  <String "android:visibility:visibility">
	//*  45   99:invokeinterface #133 <Method boolean Map.containsKey(Object)>
	//*  46  104:ifeq            149
		{
			visibilityinfo.mEndVisibility = ((Integer)transitionvalues1.values.get("android:visibility:visibility")).intValue();
	//   47  107:aload_3         
	//   48  108:aload_2         
	//   49  109:getfield        #97  <Field Map TransitionValues.values>
	//   50  112:ldc1            #30  <String "android:visibility:visibility">
	//   51  114:invokeinterface #137 <Method Object Map.get(Object)>
	//   52  119:checkcast       #99  <Class Integer>
	//   53  122:invokevirtual   #140 <Method int Integer.intValue()>
	//   54  125:putfield        #152 <Field int Visibility$VisibilityInfo.mEndVisibility>
			visibilityinfo.mEndParent = (ViewGroup)transitionvalues1.values.get("android:visibility:parent");
	//   55  128:aload_3         
	//   56  129:aload_2         
	//   57  130:getfield        #97  <Field Map TransitionValues.values>
	//   58  133:ldc1            #24  <String "android:visibility:parent">
	//   59  135:invokeinterface #137 <Method Object Map.get(Object)>
	//   60  140:checkcast       #145 <Class ViewGroup>
	//   61  143:putfield        #155 <Field ViewGroup Visibility$VisibilityInfo.mEndParent>
		} else
	//*  62  146:goto            159
		{
			visibilityinfo.mEndVisibility = -1;
	//   63  149:aload_3         
	//   64  150:iconst_m1       
	//   65  151:putfield        #152 <Field int Visibility$VisibilityInfo.mEndVisibility>
			visibilityinfo.mEndParent = null;
	//   66  154:aload_3         
	//   67  155:aconst_null     
	//   68  156:putfield        #155 <Field ViewGroup Visibility$VisibilityInfo.mEndParent>
		}
		if(transitionvalues != null && transitionvalues1 != null)
	//*  69  159:aload_1         
	//*  70  160:ifnull          278
	//*  71  163:aload_2         
	//*  72  164:ifnull          278
		{
			if(visibilityinfo.mStartVisibility == visibilityinfo.mEndVisibility && visibilityinfo.mStartParent == visibilityinfo.mEndParent)
	//*  73  167:aload_3         
	//*  74  168:getfield        #143 <Field int Visibility$VisibilityInfo.mStartVisibility>
	//*  75  171:aload_3         
	//*  76  172:getfield        #152 <Field int Visibility$VisibilityInfo.mEndVisibility>
	//*  77  175:icmpne          191
	//*  78  178:aload_3         
	//*  79  179:getfield        #149 <Field ViewGroup Visibility$VisibilityInfo.mStartParent>
	//*  80  182:aload_3         
	//*  81  183:getfield        #155 <Field ViewGroup Visibility$VisibilityInfo.mEndParent>
	//*  82  186:if_acmpne       191
				return visibilityinfo;
	//   83  189:aload_3         
	//   84  190:areturn         
			if(visibilityinfo.mStartVisibility != visibilityinfo.mEndVisibility)
	//*  85  191:aload_3         
	//*  86  192:getfield        #143 <Field int Visibility$VisibilityInfo.mStartVisibility>
	//*  87  195:aload_3         
	//*  88  196:getfield        #152 <Field int Visibility$VisibilityInfo.mEndVisibility>
	//*  89  199:icmpeq          240
			{
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
	//* 103  225:ifne            322
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
			} else
			{
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
	//* 125  263:ifnonnull       322
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
			}
		} else
		{
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
	//* 148  302:ifnonnull       322
	//* 149  305:aload_3         
	//* 150  306:getfield        #143 <Field int Visibility$VisibilityInfo.mStartVisibility>
	//* 151  309:ifne            322
			{
				visibilityinfo.mFadeIn = false;
	//  152  312:aload_3         
	//  153  313:iconst_0        
	//  154  314:putfield        #129 <Field boolean Visibility$VisibilityInfo.mFadeIn>
				visibilityinfo.mVisibilityChange = true;
	//  155  317:aload_3         
	//  156  318:iconst_1        
	//  157  319:putfield        #126 <Field boolean Visibility$VisibilityInfo.mVisibilityChange>
			}
		}
		return visibilityinfo;
	//  158  322:aload_3         
	//  159  323:areturn         
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
		boolean flag;
label0:
		{
			boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
			if(transitionvalues == null && transitionvalues1 == null)
	//*   2    3:aload_1         
	//*   3    4:ifnonnull       13
	//*   4    7:aload_2         
	//*   5    8:ifnonnull       13
				return false;
	//    6   11:iconst_0        
	//    7   12:ireturn         
			if(transitionvalues != null && transitionvalues1 != null && transitionvalues1.values.containsKey("android:visibility:visibility") != transitionvalues.values.containsKey("android:visibility:visibility"))
	//*   8   13:aload_1         
	//*   9   14:ifnull          48
	//*  10   17:aload_2         
	//*  11   18:ifnull          48
	//*  12   21:aload_2         
	//*  13   22:getfield        #97  <Field Map TransitionValues.values>
	//*  14   25:ldc1            #30  <String "android:visibility:visibility">
	//*  15   27:invokeinterface #133 <Method boolean Map.containsKey(Object)>
	//*  16   32:aload_1         
	//*  17   33:getfield        #97  <Field Map TransitionValues.values>
	//*  18   36:ldc1            #30  <String "android:visibility:visibility">
	//*  19   38:invokeinterface #133 <Method boolean Map.containsKey(Object)>
	//*  20   43:icmpeq          48
				return false;
	//   21   46:iconst_0        
	//   22   47:ireturn         
			transitionvalues = ((TransitionValues) (getVisibilityChangeInfo(transitionvalues, transitionvalues1)));
	//   23   48:aload_0         
	//   24   49:aload_1         
	//   25   50:aload_2         
	//   26   51:invokespecial   #166 <Method Visibility$VisibilityInfo getVisibilityChangeInfo(TransitionValues, TransitionValues)>
	//   27   54:astore_1        
			flag = flag1;
	//   28   55:iload           4
	//   29   57:istore_3        
			if(!((VisibilityInfo) (transitionvalues)).mVisibilityChange)
				break label0;
	//   30   58:aload_1         
	//   31   59:getfield        #126 <Field boolean Visibility$VisibilityInfo.mVisibilityChange>
	//   32   62:ifeq            84
			if(((VisibilityInfo) (transitionvalues)).mStartVisibility != 0)
	//*  33   65:aload_1         
	//*  34   66:getfield        #143 <Field int Visibility$VisibilityInfo.mStartVisibility>
	//*  35   69:ifeq            82
			{
				flag = flag1;
	//   36   72:iload           4
	//   37   74:istore_3        
				if(((VisibilityInfo) (transitionvalues)).mEndVisibility != 0)
					break label0;
	//   38   75:aload_1         
	//   39   76:getfield        #152 <Field int Visibility$VisibilityInfo.mEndVisibility>
	//   40   79:ifne            84
			}
			flag = true;
	//   41   82:iconst_1        
	//   42   83:istore_3        
		}
		return flag;
	//   43   84:iload_3         
	//   44   85:ireturn         
	}

	public boolean isVisible(TransitionValues transitionvalues)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(transitionvalues == null)
	//*   2    3:aload_1         
	//*   3    4:ifnonnull       9
			return false;
	//    4    7:iconst_0        
	//    5    8:ireturn         
		int i = ((Integer)transitionvalues.values.get("android:visibility:visibility")).intValue();
	//    6    9:aload_1         
	//    7   10:getfield        #97  <Field Map TransitionValues.values>
	//    8   13:ldc1            #30  <String "android:visibility:visibility">
	//    9   15:invokeinterface #137 <Method Object Map.get(Object)>
	//   10   20:checkcast       #99  <Class Integer>
	//   11   23:invokevirtual   #140 <Method int Integer.intValue()>
	//   12   26:istore_2        
		transitionvalues = ((TransitionValues) ((View)transitionvalues.values.get("android:visibility:parent")));
	//   13   27:aload_1         
	//   14   28:getfield        #97  <Field Map TransitionValues.values>
	//   15   31:ldc1            #24  <String "android:visibility:parent">
	//   16   33:invokeinterface #137 <Method Object Map.get(Object)>
	//   17   38:checkcast       #89  <Class View>
	//   18   41:astore_1        
		boolean flag = flag1;
	//   19   42:iload           4
	//   20   44:istore_3        
		if(i == 0)
	//*  21   45:iload_2         
	//*  22   46:ifne            58
		{
			flag = flag1;
	//   23   49:iload           4
	//   24   51:istore_3        
			if(transitionvalues != null)
	//*  25   52:aload_1         
	//*  26   53:ifnull          58
				flag = true;
	//   27   56:iconst_1        
	//   28   57:istore_3        
		}
		return flag;
	//   29   58:iload_3         
	//   30   59:ireturn         
	}

	public Animator onAppear(ViewGroup viewgroup, TransitionValues transitionvalues, int i, TransitionValues transitionvalues1, int j)
	{
		if((mMode & 1) == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field int mMode>
	//*   2    4:iconst_1        
	//*   3    5:iand            
	//*   4    6:iconst_1        
	//*   5    7:icmpne          74
		{
			if(transitionvalues1 == null)
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
		} else
		{
			return null;
	//   39   74:aconst_null     
	//   40   75:areturn         
		}
	}

	public Animator onAppear(ViewGroup viewgroup, View view, TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Animator onDisappear(ViewGroup viewgroup, TransitionValues transitionvalues, int i, TransitionValues transitionvalues1, int j)
	{
		final Object overlay;
		View view;
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
		if(transitionvalues != null)
	//*   8   12:aload_2         
	//*   9   13:ifnull          25
			view = transitionvalues.view;
	//   10   16:aload_2         
	//   11   17:getfield        #87  <Field View TransitionValues.view>
	//   12   20:astore          8
		else
	//*  13   22:goto            28
			view = null;
	//   14   25:aconst_null     
	//   15   26:astore          8
		if(transitionvalues1 != null)
	//*  16   28:aload           4
	//*  17   30:ifnull          43
			overlay = ((Object) (transitionvalues1.view));
	//   18   33:aload           4
	//   19   35:getfield        #87  <Field View TransitionValues.view>
	//   20   38:astore          7
		else
	//*  21   40:goto            46
			overlay = null;
	//   22   43:aconst_null     
	//   23   44:astore          7
		if(overlay != null && ((View) (overlay)).getParent() != null) goto _L2; else goto _L1
	//   24   46:aload           7
	//   25   48:ifnull          88
	//   26   51:aload           7
	//   27   53:invokevirtual   #113 <Method android.view.ViewParent View.getParent()>
	//   28   56:ifnonnull       62
	//*  29   59:goto            88
_L2:
		if(j != 4) goto _L4; else goto _L3
	//   30   62:iload           5
	//   31   64:iconst_4        
	//   32   65:icmpne          71
	//*  33   68:goto            82
_L4:
		final Object finalOverlayView = ((Object) (view));
	//   34   71:aload           8
	//   35   73:astore          6
		if(view != overlay) goto _L5; else goto _L3
	//   36   75:aload           8
	//   37   77:aload           7
	//   38   79:if_acmpne       97
_L3:
		finalOverlayView = null;
	//   39   82:aconst_null     
	//   40   83:astore          6
		break MISSING_BLOCK_LABEL_235;
	//   41   85:goto            235
_L1:
		if(overlay == null) goto _L7; else goto _L6
	//   42   88:aload           7
	//   43   90:ifnull          103
_L6:
		finalOverlayView = overlay;
	//   44   93:aload           7
	//   45   95:astore          6
_L5:
		overlay = null;
	//   46   97:aconst_null     
	//   47   98:astore          7
		break MISSING_BLOCK_LABEL_235;
	//   48  100:goto            235
_L7:
		if(view == null)
			break; /* Loop/switch isn't completed */
	//   49  103:aload           8
	//   50  105:ifnull          228
		if(view.getParent() == null)
	//*  51  108:aload           8
	//*  52  110:invokevirtual   #113 <Method android.view.ViewParent View.getParent()>
	//*  53  113:ifnonnull       123
		{
			finalOverlayView = ((Object) (view));
	//   54  116:aload           8
	//   55  118:astore          6
			continue; /* Loop/switch isn't completed */
	//   56  120:goto            97
		}
		if(!(view.getParent() instanceof View))
			break; /* Loop/switch isn't completed */
	//   57  123:aload           8
	//   58  125:invokevirtual   #113 <Method android.view.ViewParent View.getParent()>
	//   59  128:instanceof      #89  <Class View>
	//   60  131:ifeq            228
		finalOverlayView = ((Object) ((View)view.getParent()));
	//   61  134:aload           8
	//   62  136:invokevirtual   #113 <Method android.view.ViewParent View.getParent()>
	//   63  139:checkcast       #89  <Class View>
	//   64  142:astore          6
		if(!getVisibilityChangeInfo(getTransitionValues(((View) (finalOverlayView)), true), getMatchedTransitionValues(((View) (finalOverlayView)), true)).mVisibilityChange)
	//*  65  144:aload_0         
	//*  66  145:aload_0         
	//*  67  146:aload           6
	//*  68  148:iconst_1        
	//*  69  149:invokevirtual   #188 <Method TransitionValues getTransitionValues(View, boolean)>
	//*  70  152:aload_0         
	//*  71  153:aload           6
	//*  72  155:iconst_1        
	//*  73  156:invokevirtual   #185 <Method TransitionValues getMatchedTransitionValues(View, boolean)>
	//*  74  159:invokespecial   #166 <Method Visibility$VisibilityInfo getVisibilityChangeInfo(TransitionValues, TransitionValues)>
	//*  75  162:getfield        #126 <Field boolean Visibility$VisibilityInfo.mVisibilityChange>
	//*  76  165:ifne            181
		{
			finalOverlayView = ((Object) (TransitionUtils.copyViewImage(viewgroup, view, ((View) (finalOverlayView)))));
	//   77  168:aload_1         
	//   78  169:aload           8
	//   79  171:aload           6
	//   80  173:invokestatic    #197 <Method View TransitionUtils.copyViewImage(ViewGroup, View, View)>
	//   81  176:astore          6
			continue; /* Loop/switch isn't completed */
	//   82  178:goto            97
		}
		if(((View) (finalOverlayView)).getParent() == null)
	//*  83  181:aload           6
	//*  84  183:invokevirtual   #113 <Method android.view.ViewParent View.getParent()>
	//*  85  186:ifnonnull       222
		{
			i = ((View) (finalOverlayView)).getId();
	//   86  189:aload           6
	//   87  191:invokevirtual   #200 <Method int View.getId()>
	//   88  194:istore_3        
			if(i != -1 && viewgroup.findViewById(i) != null && mCanRemoveViews)
	//*  89  195:iload_3         
	//*  90  196:iconst_m1       
	//*  91  197:icmpeq          222
	//*  92  200:aload_1         
	//*  93  201:iload_3         
	//*  94  202:invokevirtual   #204 <Method View ViewGroup.findViewById(int)>
	//*  95  205:ifnull          222
	//*  96  208:aload_0         
	//*  97  209:getfield        #207 <Field boolean mCanRemoveViews>
	//*  98  212:ifeq            222
			{
				finalOverlayView = ((Object) (view));
	//   99  215:aload           8
	//  100  217:astore          6
				continue; /* Loop/switch isn't completed */
	//  101  219:goto            97
			}
		}
		finalOverlayView = null;
	//  102  222:aconst_null     
	//  103  223:astore          6
		if(true) goto _L5; else goto _L8
	//  104  225:goto            97
_L8:
		finalOverlayView = null;
	//  105  228:aconst_null     
	//  106  229:astore          6
		overlay = finalOverlayView;
	//  107  231:aload           6
	//  108  233:astore          7
		if(finalOverlayView != null && transitionvalues != null)
	//* 109  235:aload           6
	//* 110  237:ifnull          376
	//* 111  240:aload_2         
	//* 112  241:ifnull          376
		{
			overlay = ((Object) ((int[])transitionvalues.values.get("android:visibility:screenLocation")));
	//  113  244:aload_2         
	//  114  245:getfield        #97  <Field Map TransitionValues.values>
	//  115  248:ldc1            #27  <String "android:visibility:screenLocation">
	//  116  250:invokeinterface #137 <Method Object Map.get(Object)>
	//  117  255:checkcast       #208 <Class int[]>
	//  118  258:astore          7
			i = overlay[0];
	//  119  260:aload           7
	//  120  262:iconst_0        
	//  121  263:iaload          
	//  122  264:istore_3        
			j = overlay[1];
	//  123  265:aload           7
	//  124  267:iconst_1        
	//  125  268:iaload          
	//  126  269:istore          5
			overlay = ((Object) (new int[2]));
	//  127  271:iconst_2        
	//  128  272:newarray        int[]
	//  129  274:astore          7
			viewgroup.getLocationOnScreen(((int []) (overlay)));
	//  130  276:aload_1         
	//  131  277:aload           7
	//  132  279:invokevirtual   #209 <Method void ViewGroup.getLocationOnScreen(int[])>
			((View) (finalOverlayView)).offsetLeftAndRight(i - overlay[0] - ((View) (finalOverlayView)).getLeft());
	//  133  282:aload           6
	//  134  284:iload_3         
	//  135  285:aload           7
	//  136  287:iconst_0        
	//  137  288:iaload          
	//  138  289:isub            
	//  139  290:aload           6
	//  140  292:invokevirtual   #212 <Method int View.getLeft()>
	//  141  295:isub            
	//  142  296:invokevirtual   #215 <Method void View.offsetLeftAndRight(int)>
			((View) (finalOverlayView)).offsetTopAndBottom(j - overlay[1] - ((View) (finalOverlayView)).getTop());
	//  143  299:aload           6
	//  144  301:iload           5
	//  145  303:aload           7
	//  146  305:iconst_1        
	//  147  306:iaload          
	//  148  307:isub            
	//  149  308:aload           6
	//  150  310:invokevirtual   #218 <Method int View.getTop()>
	//  151  313:isub            
	//  152  314:invokevirtual   #221 <Method void View.offsetTopAndBottom(int)>
			overlay = ((Object) (ViewGroupUtils.getOverlay(viewgroup)));
	//  153  317:aload_1         
	//  154  318:invokestatic    #227 <Method ViewGroupOverlayImpl ViewGroupUtils.getOverlay(ViewGroup)>
	//  155  321:astore          7
			((ViewGroupOverlayImpl) (overlay)).add(((View) (finalOverlayView)));
	//  156  323:aload           7
	//  157  325:aload           6
	//  158  327:invokeinterface #233 <Method void ViewGroupOverlayImpl.add(View)>
			viewgroup = ((ViewGroup) (onDisappear(viewgroup, ((View) (finalOverlayView)), transitionvalues, transitionvalues1)));
	//  159  332:aload_0         
	//  160  333:aload_1         
	//  161  334:aload           6
	//  162  336:aload_2         
	//  163  337:aload           4
	//  164  339:invokevirtual   #235 <Method Animator onDisappear(ViewGroup, View, TransitionValues, TransitionValues)>
	//  165  342:astore_1        
			if(viewgroup == null)
	//* 166  343:aload_1         
	//* 167  344:ifnonnull       358
			{
				((ViewGroupOverlayImpl) (overlay)).remove(((View) (finalOverlayView)));
	//  168  347:aload           7
	//  169  349:aload           6
	//  170  351:invokeinterface #238 <Method void ViewGroupOverlayImpl.remove(View)>
				return ((Animator) (viewgroup));
	//  171  356:aload_1         
	//  172  357:areturn         
			} else
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
	//  173  358:aload_1         
	//  174  359:new             #6   <Class Visibility$1>
	//  175  362:dup             
	//  176  363:aload_0         
	//  177  364:aload           7
	//  178  366:aload           6
	//  179  368:invokespecial   #241 <Method void Visibility$1(Visibility, ViewGroupOverlayImpl, View)>
	//  180  371:invokevirtual   #247 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
				return ((Animator) (viewgroup));
	//  181  374:aload_1         
	//  182  375:areturn         
			}
		}
		if(overlay != null)
	//* 183  376:aload           7
	//* 184  378:ifnull          447
		{
			i = ((View) (overlay)).getVisibility();
	//  185  381:aload           7
	//  186  383:invokevirtual   #93  <Method int View.getVisibility()>
	//  187  386:istore_3        
			ViewUtils.setTransitionVisibility(((View) (overlay)), 0);
	//  188  387:aload           7
	//  189  389:iconst_0        
	//  190  390:invokestatic    #253 <Method void ViewUtils.setTransitionVisibility(View, int)>
			viewgroup = ((ViewGroup) (onDisappear(viewgroup, ((View) (overlay)), transitionvalues, transitionvalues1)));
	//  191  393:aload_0         
	//  192  394:aload_1         
	//  193  395:aload           7
	//  194  397:aload_2         
	//  195  398:aload           4
	//  196  400:invokevirtual   #235 <Method Animator onDisappear(ViewGroup, View, TransitionValues, TransitionValues)>
	//  197  403:astore_1        
			if(viewgroup != null)
	//* 198  404:aload_1         
	//* 199  405:ifnull          439
			{
				transitionvalues = ((TransitionValues) (new DisappearListener(((View) (overlay)), j, true)));
	//  200  408:new             #8   <Class Visibility$DisappearListener>
	//  201  411:dup             
	//  202  412:aload           7
	//  203  414:iload           5
	//  204  416:iconst_1        
	//  205  417:invokespecial   #256 <Method void Visibility$DisappearListener(View, int, boolean)>
	//  206  420:astore_2        
				((Animator) (viewgroup)).addListener(((android.animation.Animator.AnimatorListener) (transitionvalues)));
	//  207  421:aload_1         
	//  208  422:aload_2         
	//  209  423:invokevirtual   #247 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
				AnimatorUtils.addPauseListener(((Animator) (viewgroup)), ((AnimatorListenerAdapter) (transitionvalues)));
	//  210  426:aload_1         
	//  211  427:aload_2         
	//  212  428:invokestatic    #262 <Method void AnimatorUtils.addPauseListener(Animator, AnimatorListenerAdapter)>
				addListener(((Transition.TransitionListener) (transitionvalues)));
	//  213  431:aload_0         
	//  214  432:aload_2         
	//  215  433:invokevirtual   #265 <Method Transition addListener(Transition$TransitionListener)>
	//  216  436:pop             
				return ((Animator) (viewgroup));
	//  217  437:aload_1         
	//  218  438:areturn         
			} else
			{
				ViewUtils.setTransitionVisibility(((View) (overlay)), i);
	//  219  439:aload           7
	//  220  441:iload_3         
	//  221  442:invokestatic    #253 <Method void ViewUtils.setTransitionVisibility(View, int)>
				return ((Animator) (viewgroup));
	//  222  445:aload_1         
	//  223  446:areturn         
			}
		} else
		{
			return null;
	//  224  447:aconst_null     
	//  225  448:areturn         
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
