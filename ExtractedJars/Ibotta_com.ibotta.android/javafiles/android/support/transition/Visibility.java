// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.lang.annotation.Annotation;
import java.util.Map;

// Referenced classes of package android.support.transition:
//			Transition, TransitionValues, TransitionUtils, ViewGroupUtils, 
//			ViewGroupOverlayImpl, ViewUtils, AnimatorUtils

public abstract class Visibility extends Transition
{
	private static class DisappearListener extends AnimatorListenerAdapter
		implements AnimatorUtils.AnimatorPauseListenerCompat, Transition.TransitionListener
	{

		private void hideViewWhenNotCanceled()
		{
			if(!mCanceled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field boolean mCanceled>
		//*   2    4:ifne            31
			{
				ViewUtils.setTransitionVisibility(mView, mFinalVisibility);
		//    3    7:aload_0         
		//    4    8:getfield        #30  <Field View mView>
		//    5   11:aload_0         
		//    6   12:getfield        #32  <Field int mFinalVisibility>
		//    7   15:invokestatic    #56  <Method void ViewUtils.setTransitionVisibility(View, int)>
				ViewGroup viewgroup = mParent;
		//    8   18:aload_0         
		//    9   19:getfield        #42  <Field ViewGroup mParent>
		//   10   22:astore_1        
				if(viewgroup != null)
		//*  11   23:aload_1         
		//*  12   24:ifnull          31
					viewgroup.invalidate();
		//   13   27:aload_1         
		//   14   28:invokevirtual   #59  <Method void ViewGroup.invalidate()>
			}
			suppressLayout(false);
		//   15   31:aload_0         
		//   16   32:iconst_0        
		//   17   33:invokespecial   #48  <Method void suppressLayout(boolean)>
		//   18   36:return          
		}

		private void suppressLayout(boolean flag)
		{
			if(mSuppressLayout && mLayoutSuppressed != flag)
		//*   0    0:aload_0         
		//*   1    1:getfield        #44  <Field boolean mSuppressLayout>
		//*   2    4:ifeq            34
		//*   3    7:aload_0         
		//*   4    8:getfield        #61  <Field boolean mLayoutSuppressed>
		//*   5   11:iload_1         
		//*   6   12:icmpeq          34
			{
				ViewGroup viewgroup = mParent;
		//    7   15:aload_0         
		//    8   16:getfield        #42  <Field ViewGroup mParent>
		//    9   19:astore_2        
				if(viewgroup != null)
		//*  10   20:aload_2         
		//*  11   21:ifnull          34
				{
					mLayoutSuppressed = flag;
		//   12   24:aload_0         
		//   13   25:iload_1         
		//   14   26:putfield        #61  <Field boolean mLayoutSuppressed>
					ViewGroupUtils.suppressLayout(viewgroup, flag);
		//   15   29:aload_2         
		//   16   30:iload_1         
		//   17   31:invokestatic    #66  <Method void ViewGroupUtils.suppressLayout(ViewGroup, boolean)>
				}
			}
		//   18   34:return          
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

		VisibilityInfo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
		//    2    4:return          
		}
	}


	public Visibility()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Transition()>
		mMode = 3;
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:putfield        #35  <Field int mMode>
	//    5    9:return          
	}

	private void captureValues(TransitionValues transitionvalues)
	{
		int i = transitionvalues.view.getVisibility();
	//    0    0:aload_1         
	//    1    1:getfield        #43  <Field View TransitionValues.view>
	//    2    4:invokevirtual   #49  <Method int View.getVisibility()>
	//    3    7:istore_2        
		transitionvalues.values.put("android:visibility:visibility", ((Object) (Integer.valueOf(i))));
	//    4    8:aload_1         
	//    5    9:getfield        #53  <Field Map TransitionValues.values>
	//    6   12:ldc1            #25  <String "android:visibility:visibility">
	//    7   14:iload_2         
	//    8   15:invokestatic    #59  <Method Integer Integer.valueOf(int)>
	//    9   18:invokeinterface #65  <Method Object Map.put(Object, Object)>
	//   10   23:pop             
		transitionvalues.values.put("android:visibility:parent", ((Object) (transitionvalues.view.getParent())));
	//   11   24:aload_1         
	//   12   25:getfield        #53  <Field Map TransitionValues.values>
	//   13   28:ldc1            #27  <String "android:visibility:parent">
	//   14   30:aload_1         
	//   15   31:getfield        #43  <Field View TransitionValues.view>
	//   16   34:invokevirtual   #69  <Method android.view.ViewParent View.getParent()>
	//   17   37:invokeinterface #65  <Method Object Map.put(Object, Object)>
	//   18   42:pop             
		int ai[] = new int[2];
	//   19   43:iconst_2        
	//   20   44:newarray        int[]
	//   21   46:astore_3        
		transitionvalues.view.getLocationOnScreen(ai);
	//   22   47:aload_1         
	//   23   48:getfield        #43  <Field View TransitionValues.view>
	//   24   51:aload_3         
	//   25   52:invokevirtual   #73  <Method void View.getLocationOnScreen(int[])>
		transitionvalues.values.put("android:visibility:screenLocation", ((Object) (ai)));
	//   26   55:aload_1         
	//   27   56:getfield        #53  <Field Map TransitionValues.values>
	//   28   59:ldc1            #75  <String "android:visibility:screenLocation">
	//   29   61:aload_3         
	//   30   62:invokeinterface #65  <Method Object Map.put(Object, Object)>
	//   31   67:pop             
	//   32   68:return          
	}

	private VisibilityInfo getVisibilityChangeInfo(TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		VisibilityInfo visibilityinfo = new VisibilityInfo();
	//    0    0:new             #14  <Class Visibility$VisibilityInfo>
	//    1    3:dup             
	//    2    4:invokespecial   #78  <Method void Visibility$VisibilityInfo()>
	//    3    7:astore_3        
		visibilityinfo.mVisibilityChange = false;
	//    4    8:aload_3         
	//    5    9:iconst_0        
	//    6   10:putfield        #82  <Field boolean Visibility$VisibilityInfo.mVisibilityChange>
		visibilityinfo.mFadeIn = false;
	//    7   13:aload_3         
	//    8   14:iconst_0        
	//    9   15:putfield        #85  <Field boolean Visibility$VisibilityInfo.mFadeIn>
		if(transitionvalues != null && transitionvalues.values.containsKey("android:visibility:visibility"))
	//*  10   18:aload_1         
	//*  11   19:ifnull          78
	//*  12   22:aload_1         
	//*  13   23:getfield        #53  <Field Map TransitionValues.values>
	//*  14   26:ldc1            #25  <String "android:visibility:visibility">
	//*  15   28:invokeinterface #89  <Method boolean Map.containsKey(Object)>
	//*  16   33:ifeq            78
		{
			visibilityinfo.mStartVisibility = ((Integer)transitionvalues.values.get("android:visibility:visibility")).intValue();
	//   17   36:aload_3         
	//   18   37:aload_1         
	//   19   38:getfield        #53  <Field Map TransitionValues.values>
	//   20   41:ldc1            #25  <String "android:visibility:visibility">
	//   21   43:invokeinterface #93  <Method Object Map.get(Object)>
	//   22   48:checkcast       #55  <Class Integer>
	//   23   51:invokevirtual   #96  <Method int Integer.intValue()>
	//   24   54:putfield        #99  <Field int Visibility$VisibilityInfo.mStartVisibility>
			visibilityinfo.mStartParent = (ViewGroup)transitionvalues.values.get("android:visibility:parent");
	//   25   57:aload_3         
	//   26   58:aload_1         
	//   27   59:getfield        #53  <Field Map TransitionValues.values>
	//   28   62:ldc1            #27  <String "android:visibility:parent">
	//   29   64:invokeinterface #93  <Method Object Map.get(Object)>
	//   30   69:checkcast       #101 <Class ViewGroup>
	//   31   72:putfield        #105 <Field ViewGroup Visibility$VisibilityInfo.mStartParent>
		} else
	//*  32   75:goto            88
		{
			visibilityinfo.mStartVisibility = -1;
	//   33   78:aload_3         
	//   34   79:iconst_m1       
	//   35   80:putfield        #99  <Field int Visibility$VisibilityInfo.mStartVisibility>
			visibilityinfo.mStartParent = null;
	//   36   83:aload_3         
	//   37   84:aconst_null     
	//   38   85:putfield        #105 <Field ViewGroup Visibility$VisibilityInfo.mStartParent>
		}
		if(transitionvalues1 != null && transitionvalues1.values.containsKey("android:visibility:visibility"))
	//*  39   88:aload_2         
	//*  40   89:ifnull          148
	//*  41   92:aload_2         
	//*  42   93:getfield        #53  <Field Map TransitionValues.values>
	//*  43   96:ldc1            #25  <String "android:visibility:visibility">
	//*  44   98:invokeinterface #89  <Method boolean Map.containsKey(Object)>
	//*  45  103:ifeq            148
		{
			visibilityinfo.mEndVisibility = ((Integer)transitionvalues1.values.get("android:visibility:visibility")).intValue();
	//   46  106:aload_3         
	//   47  107:aload_2         
	//   48  108:getfield        #53  <Field Map TransitionValues.values>
	//   49  111:ldc1            #25  <String "android:visibility:visibility">
	//   50  113:invokeinterface #93  <Method Object Map.get(Object)>
	//   51  118:checkcast       #55  <Class Integer>
	//   52  121:invokevirtual   #96  <Method int Integer.intValue()>
	//   53  124:putfield        #108 <Field int Visibility$VisibilityInfo.mEndVisibility>
			visibilityinfo.mEndParent = (ViewGroup)transitionvalues1.values.get("android:visibility:parent");
	//   54  127:aload_3         
	//   55  128:aload_2         
	//   56  129:getfield        #53  <Field Map TransitionValues.values>
	//   57  132:ldc1            #27  <String "android:visibility:parent">
	//   58  134:invokeinterface #93  <Method Object Map.get(Object)>
	//   59  139:checkcast       #101 <Class ViewGroup>
	//   60  142:putfield        #111 <Field ViewGroup Visibility$VisibilityInfo.mEndParent>
		} else
	//*  61  145:goto            158
		{
			visibilityinfo.mEndVisibility = -1;
	//   62  148:aload_3         
	//   63  149:iconst_m1       
	//   64  150:putfield        #108 <Field int Visibility$VisibilityInfo.mEndVisibility>
			visibilityinfo.mEndParent = null;
	//   65  153:aload_3         
	//   66  154:aconst_null     
	//   67  155:putfield        #111 <Field ViewGroup Visibility$VisibilityInfo.mEndParent>
		}
		if(transitionvalues != null && transitionvalues1 != null)
	//*  68  158:aload_1         
	//*  69  159:ifnull          277
	//*  70  162:aload_2         
	//*  71  163:ifnull          277
		{
			if(visibilityinfo.mStartVisibility == visibilityinfo.mEndVisibility && visibilityinfo.mStartParent == visibilityinfo.mEndParent)
	//*  72  166:aload_3         
	//*  73  167:getfield        #99  <Field int Visibility$VisibilityInfo.mStartVisibility>
	//*  74  170:aload_3         
	//*  75  171:getfield        #108 <Field int Visibility$VisibilityInfo.mEndVisibility>
	//*  76  174:icmpne          190
	//*  77  177:aload_3         
	//*  78  178:getfield        #105 <Field ViewGroup Visibility$VisibilityInfo.mStartParent>
	//*  79  181:aload_3         
	//*  80  182:getfield        #111 <Field ViewGroup Visibility$VisibilityInfo.mEndParent>
	//*  81  185:if_acmpne       190
				return visibilityinfo;
	//   82  188:aload_3         
	//   83  189:areturn         
			if(visibilityinfo.mStartVisibility != visibilityinfo.mEndVisibility)
	//*  84  190:aload_3         
	//*  85  191:getfield        #99  <Field int Visibility$VisibilityInfo.mStartVisibility>
	//*  86  194:aload_3         
	//*  87  195:getfield        #108 <Field int Visibility$VisibilityInfo.mEndVisibility>
	//*  88  198:icmpeq          239
			{
				if(visibilityinfo.mStartVisibility == 0)
	//*  89  201:aload_3         
	//*  90  202:getfield        #99  <Field int Visibility$VisibilityInfo.mStartVisibility>
	//*  91  205:ifne            220
				{
					visibilityinfo.mFadeIn = false;
	//   92  208:aload_3         
	//   93  209:iconst_0        
	//   94  210:putfield        #85  <Field boolean Visibility$VisibilityInfo.mFadeIn>
					visibilityinfo.mVisibilityChange = true;
	//   95  213:aload_3         
	//   96  214:iconst_1        
	//   97  215:putfield        #82  <Field boolean Visibility$VisibilityInfo.mVisibilityChange>
					return visibilityinfo;
	//   98  218:aload_3         
	//   99  219:areturn         
				}
				if(visibilityinfo.mEndVisibility == 0)
	//* 100  220:aload_3         
	//* 101  221:getfield        #108 <Field int Visibility$VisibilityInfo.mEndVisibility>
	//* 102  224:ifne            321
				{
					visibilityinfo.mFadeIn = true;
	//  103  227:aload_3         
	//  104  228:iconst_1        
	//  105  229:putfield        #85  <Field boolean Visibility$VisibilityInfo.mFadeIn>
					visibilityinfo.mVisibilityChange = true;
	//  106  232:aload_3         
	//  107  233:iconst_1        
	//  108  234:putfield        #82  <Field boolean Visibility$VisibilityInfo.mVisibilityChange>
					return visibilityinfo;
	//  109  237:aload_3         
	//  110  238:areturn         
				}
			} else
			{
				if(visibilityinfo.mEndParent == null)
	//* 111  239:aload_3         
	//* 112  240:getfield        #111 <Field ViewGroup Visibility$VisibilityInfo.mEndParent>
	//* 113  243:ifnonnull       258
				{
					visibilityinfo.mFadeIn = false;
	//  114  246:aload_3         
	//  115  247:iconst_0        
	//  116  248:putfield        #85  <Field boolean Visibility$VisibilityInfo.mFadeIn>
					visibilityinfo.mVisibilityChange = true;
	//  117  251:aload_3         
	//  118  252:iconst_1        
	//  119  253:putfield        #82  <Field boolean Visibility$VisibilityInfo.mVisibilityChange>
					return visibilityinfo;
	//  120  256:aload_3         
	//  121  257:areturn         
				}
				if(visibilityinfo.mStartParent == null)
	//* 122  258:aload_3         
	//* 123  259:getfield        #105 <Field ViewGroup Visibility$VisibilityInfo.mStartParent>
	//* 124  262:ifnonnull       321
				{
					visibilityinfo.mFadeIn = true;
	//  125  265:aload_3         
	//  126  266:iconst_1        
	//  127  267:putfield        #85  <Field boolean Visibility$VisibilityInfo.mFadeIn>
					visibilityinfo.mVisibilityChange = true;
	//  128  270:aload_3         
	//  129  271:iconst_1        
	//  130  272:putfield        #82  <Field boolean Visibility$VisibilityInfo.mVisibilityChange>
					return visibilityinfo;
	//  131  275:aload_3         
	//  132  276:areturn         
				}
			}
		} else
		{
			if(transitionvalues == null && visibilityinfo.mEndVisibility == 0)
	//* 133  277:aload_1         
	//* 134  278:ifnonnull       300
	//* 135  281:aload_3         
	//* 136  282:getfield        #108 <Field int Visibility$VisibilityInfo.mEndVisibility>
	//* 137  285:ifne            300
			{
				visibilityinfo.mFadeIn = true;
	//  138  288:aload_3         
	//  139  289:iconst_1        
	//  140  290:putfield        #85  <Field boolean Visibility$VisibilityInfo.mFadeIn>
				visibilityinfo.mVisibilityChange = true;
	//  141  293:aload_3         
	//  142  294:iconst_1        
	//  143  295:putfield        #82  <Field boolean Visibility$VisibilityInfo.mVisibilityChange>
				return visibilityinfo;
	//  144  298:aload_3         
	//  145  299:areturn         
			}
			if(transitionvalues1 == null && visibilityinfo.mStartVisibility == 0)
	//* 146  300:aload_2         
	//* 147  301:ifnonnull       321
	//* 148  304:aload_3         
	//* 149  305:getfield        #99  <Field int Visibility$VisibilityInfo.mStartVisibility>
	//* 150  308:ifne            321
			{
				visibilityinfo.mFadeIn = false;
	//  151  311:aload_3         
	//  152  312:iconst_0        
	//  153  313:putfield        #85  <Field boolean Visibility$VisibilityInfo.mFadeIn>
				visibilityinfo.mVisibilityChange = true;
	//  154  316:aload_3         
	//  155  317:iconst_1        
	//  156  318:putfield        #82  <Field boolean Visibility$VisibilityInfo.mVisibilityChange>
			}
		}
		return visibilityinfo;
	//  157  321:aload_3         
	//  158  322:areturn         
	}

	public void captureEndValues(TransitionValues transitionvalues)
	{
		captureValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #115 <Method void captureValues(TransitionValues)>
	//    3    5:return          
	}

	public void captureStartValues(TransitionValues transitionvalues)
	{
		captureValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #115 <Method void captureValues(TransitionValues)>
	//    3    5:return          
	}

	public Animator createAnimator(ViewGroup viewgroup, TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		VisibilityInfo visibilityinfo = getVisibilityChangeInfo(transitionvalues, transitionvalues1);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #122 <Method Visibility$VisibilityInfo getVisibilityChangeInfo(TransitionValues, TransitionValues)>
	//    4    6:astore          4
		if(visibilityinfo.mVisibilityChange && (visibilityinfo.mStartParent != null || visibilityinfo.mEndParent != null))
	//*   5    8:aload           4
	//*   6   10:getfield        #82  <Field boolean Visibility$VisibilityInfo.mVisibilityChange>
	//*   7   13:ifeq            76
	//*   8   16:aload           4
	//*   9   18:getfield        #105 <Field ViewGroup Visibility$VisibilityInfo.mStartParent>
	//*  10   21:ifnonnull       32
	//*  11   24:aload           4
	//*  12   26:getfield        #111 <Field ViewGroup Visibility$VisibilityInfo.mEndParent>
	//*  13   29:ifnull          76
		{
			if(visibilityinfo.mFadeIn)
	//*  14   32:aload           4
	//*  15   34:getfield        #85  <Field boolean Visibility$VisibilityInfo.mFadeIn>
	//*  16   37:ifeq            58
				return onAppear(viewgroup, transitionvalues, visibilityinfo.mStartVisibility, transitionvalues1, visibilityinfo.mEndVisibility);
	//   17   40:aload_0         
	//   18   41:aload_1         
	//   19   42:aload_2         
	//   20   43:aload           4
	//   21   45:getfield        #99  <Field int Visibility$VisibilityInfo.mStartVisibility>
	//   22   48:aload_3         
	//   23   49:aload           4
	//   24   51:getfield        #108 <Field int Visibility$VisibilityInfo.mEndVisibility>
	//   25   54:invokevirtual   #126 <Method Animator onAppear(ViewGroup, TransitionValues, int, TransitionValues, int)>
	//   26   57:areturn         
			else
				return onDisappear(viewgroup, transitionvalues, visibilityinfo.mStartVisibility, transitionvalues1, visibilityinfo.mEndVisibility);
	//   27   58:aload_0         
	//   28   59:aload_1         
	//   29   60:aload_2         
	//   30   61:aload           4
	//   31   63:getfield        #99  <Field int Visibility$VisibilityInfo.mStartVisibility>
	//   32   66:aload_3         
	//   33   67:aload           4
	//   34   69:getfield        #108 <Field int Visibility$VisibilityInfo.mEndVisibility>
	//   35   72:invokevirtual   #129 <Method Animator onDisappear(ViewGroup, TransitionValues, int, TransitionValues, int)>
	//   36   75:areturn         
		} else
		{
			return null;
	//   37   76:aconst_null     
	//   38   77:areturn         
		}
	}

	public String[] getTransitionProperties()
	{
		return sTransitionProperties;
	//    0    0:getstatic       #29  <Field String[] sTransitionProperties>
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
	//*  13   22:getfield        #53  <Field Map TransitionValues.values>
	//*  14   25:ldc1            #25  <String "android:visibility:visibility">
	//*  15   27:invokeinterface #89  <Method boolean Map.containsKey(Object)>
	//*  16   32:aload_1         
	//*  17   33:getfield        #53  <Field Map TransitionValues.values>
	//*  18   36:ldc1            #25  <String "android:visibility:visibility">
	//*  19   38:invokeinterface #89  <Method boolean Map.containsKey(Object)>
	//*  20   43:icmpeq          48
				return false;
	//   21   46:iconst_0        
	//   22   47:ireturn         
			transitionvalues = ((TransitionValues) (getVisibilityChangeInfo(transitionvalues, transitionvalues1)));
	//   23   48:aload_0         
	//   24   49:aload_1         
	//   25   50:aload_2         
	//   26   51:invokespecial   #122 <Method Visibility$VisibilityInfo getVisibilityChangeInfo(TransitionValues, TransitionValues)>
	//   27   54:astore_1        
			flag = flag1;
	//   28   55:iload           4
	//   29   57:istore_3        
			if(!((VisibilityInfo) (transitionvalues)).mVisibilityChange)
				break label0;
	//   30   58:aload_1         
	//   31   59:getfield        #82  <Field boolean Visibility$VisibilityInfo.mVisibilityChange>
	//   32   62:ifeq            84
			if(((VisibilityInfo) (transitionvalues)).mStartVisibility != 0)
	//*  33   65:aload_1         
	//*  34   66:getfield        #99  <Field int Visibility$VisibilityInfo.mStartVisibility>
	//*  35   69:ifeq            82
			{
				flag = flag1;
	//   36   72:iload           4
	//   37   74:istore_3        
				if(((VisibilityInfo) (transitionvalues)).mEndVisibility != 0)
					break label0;
	//   38   75:aload_1         
	//   39   76:getfield        #108 <Field int Visibility$VisibilityInfo.mEndVisibility>
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

	public Animator onAppear(ViewGroup viewgroup, TransitionValues transitionvalues, int i, TransitionValues transitionvalues1, int j)
	{
		if((mMode & 1) == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field int mMode>
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
	//   13   23:getfield        #43  <Field View TransitionValues.view>
	//   14   26:invokevirtual   #69  <Method android.view.ViewParent View.getParent()>
	//   15   29:checkcast       #45  <Class View>
	//   16   32:astore          6
				if(getVisibilityChangeInfo(getMatchedTransitionValues(view, false), getTransitionValues(view, false)).mVisibilityChange)
	//*  17   34:aload_0         
	//*  18   35:aload_0         
	//*  19   36:aload           6
	//*  20   38:iconst_0        
	//*  21   39:invokevirtual   #138 <Method TransitionValues getMatchedTransitionValues(View, boolean)>
	//*  22   42:aload_0         
	//*  23   43:aload           6
	//*  24   45:iconst_0        
	//*  25   46:invokevirtual   #141 <Method TransitionValues getTransitionValues(View, boolean)>
	//*  26   49:invokespecial   #122 <Method Visibility$VisibilityInfo getVisibilityChangeInfo(TransitionValues, TransitionValues)>
	//*  27   52:getfield        #82  <Field boolean Visibility$VisibilityInfo.mVisibilityChange>
	//*  28   55:ifeq            60
					return null;
	//   29   58:aconst_null     
	//   30   59:areturn         
			}
			return onAppear(viewgroup, transitionvalues1.view, transitionvalues, transitionvalues1);
	//   31   60:aload_0         
	//   32   61:aload_1         
	//   33   62:aload           4
	//   34   64:getfield        #43  <Field View TransitionValues.view>
	//   35   67:aload_2         
	//   36   68:aload           4
	//   37   70:invokevirtual   #144 <Method Animator onAppear(ViewGroup, View, TransitionValues, TransitionValues)>
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
		final Object finalOverlayView;
label0:
		{
label1:
			{
label2:
				{
					if((mMode & 2) != 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field int mMode>
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
						finalOverlayView = ((Object) (transitionvalues.view));
	//   10   16:aload_2         
	//   11   17:getfield        #43  <Field View TransitionValues.view>
	//   12   20:astore          7
					else
	//*  13   22:goto            28
						finalOverlayView = null;
	//   14   25:aconst_null     
	//   15   26:astore          7
					if(transitionvalues1 != null)
	//*  16   28:aload           4
	//*  17   30:ifnull          43
						overlay = ((Object) (transitionvalues1.view));
	//   18   33:aload           4
	//   19   35:getfield        #43  <Field View TransitionValues.view>
	//   20   38:astore          6
					else
	//*  21   40:goto            46
						overlay = null;
	//   22   43:aconst_null     
	//   23   44:astore          6
					if(overlay != null && ((View) (overlay)).getParent() != null)
	//*  24   46:aload           6
	//*  25   48:ifnull          116
	//*  26   51:aload           6
	//*  27   53:invokevirtual   #69  <Method android.view.ViewParent View.getParent()>
	//*  28   56:ifnonnull       62
	//*  29   59:goto            116
					{
						if(j == 4 || finalOverlayView == overlay)
	//*  30   62:iload           5
	//*  31   64:iconst_4        
	//*  32   65:icmpne          71
	//*  33   68:goto            78
	//*  34   71:aload           7
	//*  35   73:aload           6
	//*  36   75:if_acmpne       84
						{
							finalOverlayView = null;
	//   37   78:aconst_null     
	//   38   79:astore          7
							break label0;
	//   39   81:goto            261
						}
						if(!mCanRemoveViews)
	//*  40   84:aload_0         
	//*  41   85:getfield        #147 <Field boolean mCanRemoveViews>
	//*  42   88:ifeq            94
	//*  43   91:goto            144
						{
							finalOverlayView = ((Object) (TransitionUtils.copyViewImage(viewgroup, ((View) (finalOverlayView)), (View)((View) (finalOverlayView)).getParent())));
	//   44   94:aload_1         
	//   45   95:aload           7
	//   46   97:aload           7
	//   47   99:invokevirtual   #69  <Method android.view.ViewParent View.getParent()>
	//   48  102:checkcast       #45  <Class View>
	//   49  105:invokestatic    #153 <Method View TransitionUtils.copyViewImage(ViewGroup, View, View)>
	//   50  108:astore          7
							overlay = null;
	//   51  110:aconst_null     
	//   52  111:astore          6
							break label0;
	//   53  113:goto            261
						}
					} else
					{
						if(overlay != null)
	//*  54  116:aload           6
	//*  55  118:ifnull          131
						{
							finalOverlayView = overlay;
	//   56  121:aload           6
	//   57  123:astore          7
							overlay = null;
	//   58  125:aconst_null     
	//   59  126:astore          6
							break label0;
	//   60  128:goto            261
						}
						if(finalOverlayView == null)
							break label1;
	//   61  131:aload           7
	//   62  133:ifnull          254
						if(((View) (finalOverlayView)).getParent() != null)
							break label2;
	//   63  136:aload           7
	//   64  138:invokevirtual   #69  <Method android.view.ViewParent View.getParent()>
	//   65  141:ifnonnull       150
					}
					overlay = null;
	//   66  144:aconst_null     
	//   67  145:astore          6
					break label0;
	//   68  147:goto            261
				}
label3:
				{
					if(!(((View) (finalOverlayView)).getParent() instanceof View))
						break label1;
	//   69  150:aload           7
	//   70  152:invokevirtual   #69  <Method android.view.ViewParent View.getParent()>
	//   71  155:instanceof      #45  <Class View>
	//   72  158:ifeq            254
					overlay = ((Object) ((View)((View) (finalOverlayView)).getParent()));
	//   73  161:aload           7
	//   74  163:invokevirtual   #69  <Method android.view.ViewParent View.getParent()>
	//   75  166:checkcast       #45  <Class View>
	//   76  169:astore          6
					if(!getVisibilityChangeInfo(getTransitionValues(((View) (overlay)), true), getMatchedTransitionValues(((View) (overlay)), true)).mVisibilityChange)
	//*  77  171:aload_0         
	//*  78  172:aload_0         
	//*  79  173:aload           6
	//*  80  175:iconst_1        
	//*  81  176:invokevirtual   #141 <Method TransitionValues getTransitionValues(View, boolean)>
	//*  82  179:aload_0         
	//*  83  180:aload           6
	//*  84  182:iconst_1        
	//*  85  183:invokevirtual   #138 <Method TransitionValues getMatchedTransitionValues(View, boolean)>
	//*  86  186:invokespecial   #122 <Method Visibility$VisibilityInfo getVisibilityChangeInfo(TransitionValues, TransitionValues)>
	//*  87  189:getfield        #82  <Field boolean Visibility$VisibilityInfo.mVisibilityChange>
	//*  88  192:ifne            208
					{
						finalOverlayView = ((Object) (TransitionUtils.copyViewImage(viewgroup, ((View) (finalOverlayView)), ((View) (overlay)))));
	//   89  195:aload_1         
	//   90  196:aload           7
	//   91  198:aload           6
	//   92  200:invokestatic    #153 <Method View TransitionUtils.copyViewImage(ViewGroup, View, View)>
	//   93  203:astore          7
						break label3;
	//   94  205:goto            248
					}
					if(((View) (overlay)).getParent() == null)
	//*  95  208:aload           6
	//*  96  210:invokevirtual   #69  <Method android.view.ViewParent View.getParent()>
	//*  97  213:ifnonnull       245
					{
						i = ((View) (overlay)).getId();
	//   98  216:aload           6
	//   99  218:invokevirtual   #156 <Method int View.getId()>
	//  100  221:istore_3        
						if(i != -1 && viewgroup.findViewById(i) != null && mCanRemoveViews)
	//* 101  222:iload_3         
	//* 102  223:iconst_m1       
	//* 103  224:icmpeq          245
	//* 104  227:aload_1         
	//* 105  228:iload_3         
	//* 106  229:invokevirtual   #160 <Method View ViewGroup.findViewById(int)>
	//* 107  232:ifnull          245
	//* 108  235:aload_0         
	//* 109  236:getfield        #147 <Field boolean mCanRemoveViews>
	//* 110  239:ifeq            245
							break label3;
	//  111  242:goto            248
					}
					finalOverlayView = null;
	//  112  245:aconst_null     
	//  113  246:astore          7
				}
				overlay = null;
	//  114  248:aconst_null     
	//  115  249:astore          6
				break label0;
	//  116  251:goto            261
			}
			finalOverlayView = null;
	//  117  254:aconst_null     
	//  118  255:astore          7
			overlay = finalOverlayView;
	//  119  257:aload           7
	//  120  259:astore          6
		}
		if(finalOverlayView != null && transitionvalues != null)
	//* 121  261:aload           7
	//* 122  263:ifnull          402
	//* 123  266:aload_2         
	//* 124  267:ifnull          402
		{
			overlay = ((Object) ((int[])transitionvalues.values.get("android:visibility:screenLocation")));
	//  125  270:aload_2         
	//  126  271:getfield        #53  <Field Map TransitionValues.values>
	//  127  274:ldc1            #75  <String "android:visibility:screenLocation">
	//  128  276:invokeinterface #93  <Method Object Map.get(Object)>
	//  129  281:checkcast       #162 <Class int[]>
	//  130  284:astore          6
			i = overlay[0];
	//  131  286:aload           6
	//  132  288:iconst_0        
	//  133  289:iaload          
	//  134  290:istore_3        
			j = overlay[1];
	//  135  291:aload           6
	//  136  293:iconst_1        
	//  137  294:iaload          
	//  138  295:istore          5
			overlay = ((Object) (new int[2]));
	//  139  297:iconst_2        
	//  140  298:newarray        int[]
	//  141  300:astore          6
			viewgroup.getLocationOnScreen(((int []) (overlay)));
	//  142  302:aload_1         
	//  143  303:aload           6
	//  144  305:invokevirtual   #163 <Method void ViewGroup.getLocationOnScreen(int[])>
			((View) (finalOverlayView)).offsetLeftAndRight(i - overlay[0] - ((View) (finalOverlayView)).getLeft());
	//  145  308:aload           7
	//  146  310:iload_3         
	//  147  311:aload           6
	//  148  313:iconst_0        
	//  149  314:iaload          
	//  150  315:isub            
	//  151  316:aload           7
	//  152  318:invokevirtual   #166 <Method int View.getLeft()>
	//  153  321:isub            
	//  154  322:invokevirtual   #170 <Method void View.offsetLeftAndRight(int)>
			((View) (finalOverlayView)).offsetTopAndBottom(j - overlay[1] - ((View) (finalOverlayView)).getTop());
	//  155  325:aload           7
	//  156  327:iload           5
	//  157  329:aload           6
	//  158  331:iconst_1        
	//  159  332:iaload          
	//  160  333:isub            
	//  161  334:aload           7
	//  162  336:invokevirtual   #173 <Method int View.getTop()>
	//  163  339:isub            
	//  164  340:invokevirtual   #176 <Method void View.offsetTopAndBottom(int)>
			overlay = ((Object) (ViewGroupUtils.getOverlay(viewgroup)));
	//  165  343:aload_1         
	//  166  344:invokestatic    #182 <Method ViewGroupOverlayImpl ViewGroupUtils.getOverlay(ViewGroup)>
	//  167  347:astore          6
			((ViewGroupOverlayImpl) (overlay)).add(((View) (finalOverlayView)));
	//  168  349:aload           6
	//  169  351:aload           7
	//  170  353:invokeinterface #188 <Method void ViewGroupOverlayImpl.add(View)>
			viewgroup = ((ViewGroup) (onDisappear(viewgroup, ((View) (finalOverlayView)), transitionvalues, transitionvalues1)));
	//  171  358:aload_0         
	//  172  359:aload_1         
	//  173  360:aload           7
	//  174  362:aload_2         
	//  175  363:aload           4
	//  176  365:invokevirtual   #190 <Method Animator onDisappear(ViewGroup, View, TransitionValues, TransitionValues)>
	//  177  368:astore_1        
			if(viewgroup == null)
	//* 178  369:aload_1         
	//* 179  370:ifnonnull       384
			{
				((ViewGroupOverlayImpl) (overlay)).remove(((View) (finalOverlayView)));
	//  180  373:aload           6
	//  181  375:aload           7
	//  182  377:invokeinterface #193 <Method void ViewGroupOverlayImpl.remove(View)>
				return ((Animator) (viewgroup));
	//  183  382:aload_1         
	//  184  383:areturn         
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
	//  185  384:aload_1         
	//  186  385:new             #6   <Class Visibility$1>
	//  187  388:dup             
	//  188  389:aload_0         
	//  189  390:aload           6
	//  190  392:aload           7
	//  191  394:invokespecial   #196 <Method void Visibility$1(Visibility, ViewGroupOverlayImpl, View)>
	//  192  397:invokevirtual   #202 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
				return ((Animator) (viewgroup));
	//  193  400:aload_1         
	//  194  401:areturn         
			}
		}
		if(overlay != null)
	//* 195  402:aload           6
	//* 196  404:ifnull          473
		{
			i = ((View) (overlay)).getVisibility();
	//  197  407:aload           6
	//  198  409:invokevirtual   #49  <Method int View.getVisibility()>
	//  199  412:istore_3        
			ViewUtils.setTransitionVisibility(((View) (overlay)), 0);
	//  200  413:aload           6
	//  201  415:iconst_0        
	//  202  416:invokestatic    #208 <Method void ViewUtils.setTransitionVisibility(View, int)>
			viewgroup = ((ViewGroup) (onDisappear(viewgroup, ((View) (overlay)), transitionvalues, transitionvalues1)));
	//  203  419:aload_0         
	//  204  420:aload_1         
	//  205  421:aload           6
	//  206  423:aload_2         
	//  207  424:aload           4
	//  208  426:invokevirtual   #190 <Method Animator onDisappear(ViewGroup, View, TransitionValues, TransitionValues)>
	//  209  429:astore_1        
			if(viewgroup != null)
	//* 210  430:aload_1         
	//* 211  431:ifnull          465
			{
				transitionvalues = ((TransitionValues) (new DisappearListener(((View) (overlay)), j, true)));
	//  212  434:new             #8   <Class Visibility$DisappearListener>
	//  213  437:dup             
	//  214  438:aload           6
	//  215  440:iload           5
	//  216  442:iconst_1        
	//  217  443:invokespecial   #211 <Method void Visibility$DisappearListener(View, int, boolean)>
	//  218  446:astore_2        
				((Animator) (viewgroup)).addListener(((android.animation.Animator.AnimatorListener) (transitionvalues)));
	//  219  447:aload_1         
	//  220  448:aload_2         
	//  221  449:invokevirtual   #202 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
				AnimatorUtils.addPauseListener(((Animator) (viewgroup)), ((AnimatorListenerAdapter) (transitionvalues)));
	//  222  452:aload_1         
	//  223  453:aload_2         
	//  224  454:invokestatic    #217 <Method void AnimatorUtils.addPauseListener(Animator, AnimatorListenerAdapter)>
				addListener(((Transition.TransitionListener) (transitionvalues)));
	//  225  457:aload_0         
	//  226  458:aload_2         
	//  227  459:invokevirtual   #220 <Method Transition addListener(Transition$TransitionListener)>
	//  228  462:pop             
				return ((Animator) (viewgroup));
	//  229  463:aload_1         
	//  230  464:areturn         
			} else
			{
				ViewUtils.setTransitionVisibility(((View) (overlay)), i);
	//  231  465:aload           6
	//  232  467:iload_3         
	//  233  468:invokestatic    #208 <Method void ViewUtils.setTransitionVisibility(View, int)>
				return ((Animator) (viewgroup));
	//  234  471:aload_1         
	//  235  472:areturn         
			}
		} else
		{
			return null;
	//  236  473:aconst_null     
	//  237  474:areturn         
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
		if((i & -4) == 0)
	//*   0    0:iload_1         
	//*   1    1:bipush          -4
	//*   2    3:iand            
	//*   3    4:ifne            13
		{
			mMode = i;
	//    4    7:aload_0         
	//    5    8:iload_1         
	//    6    9:putfield        #35  <Field int mMode>
			return;
	//    7   12:return          
		} else
		{
			throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
	//    8   13:new             #223 <Class IllegalArgumentException>
	//    9   16:dup             
	//   10   17:ldc1            #225 <String "Only MODE_IN and MODE_OUT flags are allowed">
	//   11   19:invokespecial   #228 <Method void IllegalArgumentException(String)>
	//   12   22:athrow          
		}
	}

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
	//    4    6:ldc1            #25  <String "android:visibility:visibility">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #27  <String "android:visibility:parent">
	//    9   13:aastore         
	//   10   14:putstatic       #29  <Field String[] sTransitionProperties>
	//*  11   17:return          
	}
}
