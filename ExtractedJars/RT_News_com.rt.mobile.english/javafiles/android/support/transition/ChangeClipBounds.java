// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.*;
import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

// Referenced classes of package android.support.transition:
//			Transition, TransitionValues, RectEvaluator, ViewUtils

public class ChangeClipBounds extends Transition
{

	public ChangeClipBounds()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Transition()>
	//    2    4:return          
	}

	public ChangeClipBounds(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #28  <Method void Transition(Context, AttributeSet)>
	//    4    6:return          
	}

	private void captureValues(TransitionValues transitionvalues)
	{
		Object obj = ((Object) (transitionvalues.view));
	//    0    0:aload_1         
	//    1    1:getfield        #36  <Field View TransitionValues.view>
	//    2    4:astore_2        
		if(((View) (obj)).getVisibility() == 8)
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #42  <Method int View.getVisibility()>
	//*   5    9:bipush          8
	//*   6   11:icmpne          15
			return;
	//    7   14:return          
		Rect rect = ViewCompat.getClipBounds(((View) (obj)));
	//    8   15:aload_2         
	//    9   16:invokestatic    #48  <Method Rect ViewCompat.getClipBounds(View)>
	//   10   19:astore_3        
		transitionvalues.values.put("android:clipBounds:clip", ((Object) (rect)));
	//   11   20:aload_1         
	//   12   21:getfield        #52  <Field Map TransitionValues.values>
	//   13   24:ldc1            #13  <String "android:clipBounds:clip">
	//   14   26:aload_3         
	//   15   27:invokeinterface #58  <Method Object Map.put(Object, Object)>
	//   16   32:pop             
		if(rect == null)
	//*  17   33:aload_3         
	//*  18   34:ifnonnull       68
		{
			obj = ((Object) (new Rect(0, 0, ((View) (obj)).getWidth(), ((View) (obj)).getHeight())));
	//   19   37:new             #60  <Class Rect>
	//   20   40:dup             
	//   21   41:iconst_0        
	//   22   42:iconst_0        
	//   23   43:aload_2         
	//   24   44:invokevirtual   #63  <Method int View.getWidth()>
	//   25   47:aload_2         
	//   26   48:invokevirtual   #66  <Method int View.getHeight()>
	//   27   51:invokespecial   #69  <Method void Rect(int, int, int, int)>
	//   28   54:astore_2        
			transitionvalues.values.put("android:clipBounds:bounds", obj);
	//   29   55:aload_1         
	//   30   56:getfield        #52  <Field Map TransitionValues.values>
	//   31   59:ldc1            #10  <String "android:clipBounds:bounds">
	//   32   61:aload_2         
	//   33   62:invokeinterface #58  <Method Object Map.put(Object, Object)>
	//   34   67:pop             
		}
	//   35   68:return          
	}

	public void captureEndValues(TransitionValues transitionvalues)
	{
		captureValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #73  <Method void captureValues(TransitionValues)>
	//    3    5:return          
	}

	public void captureStartValues(TransitionValues transitionvalues)
	{
		captureValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #73  <Method void captureValues(TransitionValues)>
	//    3    5:return          
	}

	public Animator createAnimator(ViewGroup viewgroup, TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		if(transitionvalues != null && transitionvalues1 != null && transitionvalues.values.containsKey("android:clipBounds:clip"))
	//*   0    0:aload_2         
	//*   1    1:ifnull          233
	//*   2    4:aload_3         
	//*   3    5:ifnull          233
	//*   4    8:aload_2         
	//*   5    9:getfield        #52  <Field Map TransitionValues.values>
	//*   6   12:ldc1            #13  <String "android:clipBounds:clip">
	//*   7   14:invokeinterface #81  <Method boolean Map.containsKey(Object)>
	//*   8   19:ifeq            233
		{
			if(!transitionvalues1.values.containsKey("android:clipBounds:clip"))
	//*   9   22:aload_3         
	//*  10   23:getfield        #52  <Field Map TransitionValues.values>
	//*  11   26:ldc1            #13  <String "android:clipBounds:clip">
	//*  12   28:invokeinterface #81  <Method boolean Map.containsKey(Object)>
	//*  13   33:ifne            38
				return null;
	//   14   36:aconst_null     
	//   15   37:areturn         
			Object obj = ((Object) ((Rect)transitionvalues.values.get("android:clipBounds:clip")));
	//   16   38:aload_2         
	//   17   39:getfield        #52  <Field Map TransitionValues.values>
	//   18   42:ldc1            #13  <String "android:clipBounds:clip">
	//   19   44:invokeinterface #85  <Method Object Map.get(Object)>
	//   20   49:checkcast       #60  <Class Rect>
	//   21   52:astore          5
			Rect rect = (Rect)transitionvalues1.values.get("android:clipBounds:clip");
	//   22   54:aload_3         
	//   23   55:getfield        #52  <Field Map TransitionValues.values>
	//   24   58:ldc1            #13  <String "android:clipBounds:clip">
	//   25   60:invokeinterface #85  <Method Object Map.get(Object)>
	//   26   65:checkcast       #60  <Class Rect>
	//   27   68:astore          6
			boolean flag;
			if(rect == null)
	//*  28   70:aload           6
	//*  29   72:ifnonnull       81
				flag = true;
	//   30   75:iconst_1        
	//   31   76:istore          4
			else
	//*  32   78:goto            84
				flag = false;
	//   33   81:iconst_0        
	//   34   82:istore          4
			if(obj == null && rect == null)
	//*  35   84:aload           5
	//*  36   86:ifnonnull       96
	//*  37   89:aload           6
	//*  38   91:ifnonnull       96
				return null;
	//   39   94:aconst_null     
	//   40   95:areturn         
			if(obj == null)
	//*  41   96:aload           5
	//*  42   98:ifnonnull       122
			{
				viewgroup = ((ViewGroup) ((Rect)transitionvalues.values.get("android:clipBounds:bounds")));
	//   43  101:aload_2         
	//   44  102:getfield        #52  <Field Map TransitionValues.values>
	//   45  105:ldc1            #10  <String "android:clipBounds:bounds">
	//   46  107:invokeinterface #85  <Method Object Map.get(Object)>
	//   47  112:checkcast       #60  <Class Rect>
	//   48  115:astore_1        
				transitionvalues = ((TransitionValues) (rect));
	//   49  116:aload           6
	//   50  118:astore_2        
			} else
	//*  51  119:goto            151
			{
				viewgroup = ((ViewGroup) (obj));
	//   52  122:aload           5
	//   53  124:astore_1        
				transitionvalues = ((TransitionValues) (rect));
	//   54  125:aload           6
	//   55  127:astore_2        
				if(rect == null)
	//*  56  128:aload           6
	//*  57  130:ifnonnull       151
				{
					transitionvalues = ((TransitionValues) ((Rect)transitionvalues1.values.get("android:clipBounds:bounds")));
	//   58  133:aload_3         
	//   59  134:getfield        #52  <Field Map TransitionValues.values>
	//   60  137:ldc1            #10  <String "android:clipBounds:bounds">
	//   61  139:invokeinterface #85  <Method Object Map.get(Object)>
	//   62  144:checkcast       #60  <Class Rect>
	//   63  147:astore_2        
					viewgroup = ((ViewGroup) (obj));
	//   64  148:aload           5
	//   65  150:astore_1        
				}
			}
			if(((Rect) (viewgroup)).equals(((Object) (transitionvalues))))
	//*  66  151:aload_1         
	//*  67  152:aload_2         
	//*  68  153:invokevirtual   #88  <Method boolean Rect.equals(Object)>
	//*  69  156:ifeq            161
				return null;
	//   70  159:aconst_null     
	//   71  160:areturn         
			ViewCompat.setClipBounds(transitionvalues1.view, ((Rect) (viewgroup)));
	//   72  161:aload_3         
	//   73  162:getfield        #36  <Field View TransitionValues.view>
	//   74  165:aload_1         
	//   75  166:invokestatic    #92  <Method void ViewCompat.setClipBounds(View, Rect)>
			obj = ((Object) (new RectEvaluator(new Rect())));
	//   76  169:new             #94  <Class RectEvaluator>
	//   77  172:dup             
	//   78  173:new             #60  <Class Rect>
	//   79  176:dup             
	//   80  177:invokespecial   #95  <Method void Rect()>
	//   81  180:invokespecial   #98  <Method void RectEvaluator(Rect)>
	//   82  183:astore          5
			viewgroup = ((ViewGroup) (ObjectAnimator.ofObject(((Object) (transitionvalues1.view)), ViewUtils.CLIP_BOUNDS, ((android.animation.TypeEvaluator) (obj)), ((Object []) (new Rect[] {
				viewgroup, transitionvalues
			})))));
	//   83  185:aload_3         
	//   84  186:getfield        #36  <Field View TransitionValues.view>
	//   85  189:getstatic       #104 <Field android.util.Property ViewUtils.CLIP_BOUNDS>
	//   86  192:aload           5
	//   87  194:iconst_2        
	//   88  195:anewarray       Rect[]
	//   89  198:dup             
	//   90  199:iconst_0        
	//   91  200:aload_1         
	//   92  201:aastore         
	//   93  202:dup             
	//   94  203:iconst_1        
	//   95  204:aload_2         
	//   96  205:aastore         
	//   97  206:invokestatic    #110 <Method ObjectAnimator ObjectAnimator.ofObject(Object, android.util.Property, android.animation.TypeEvaluator, Object[])>
	//   98  209:astore_1        
			if(flag)
	//*  99  210:iload           4
	//* 100  212:ifeq            231
				((ObjectAnimator) (viewgroup)).addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

					public void onAnimationEnd(Animator animator)
					{
						ViewCompat.setClipBounds(endView, ((Rect) (null)));
					//    0    0:aload_0         
					//    1    1:getfield        #19  <Field View val$endView>
					//    2    4:aconst_null     
					//    3    5:invokestatic    #31  <Method void ViewCompat.setClipBounds(View, Rect)>
					//    4    8:return          
					}

					final ChangeClipBounds this$0;
					final View val$endView;

			
			{
				this$0 = ChangeClipBounds.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ChangeClipBounds this$0>
				endView = view;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field View val$endView>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void AnimatorListenerAdapter()>
			//    8   14:return          
			}
				}
)));
	//  101  215:aload_1         
	//  102  216:new             #6   <Class ChangeClipBounds$1>
	//  103  219:dup             
	//  104  220:aload_0         
	//  105  221:aload_3         
	//  106  222:getfield        #36  <Field View TransitionValues.view>
	//  107  225:invokespecial   #113 <Method void ChangeClipBounds$1(ChangeClipBounds, View)>
	//  108  228:invokevirtual   #117 <Method void ObjectAnimator.addListener(android.animation.Animator$AnimatorListener)>
			return ((Animator) (viewgroup));
	//  109  231:aload_1         
	//  110  232:areturn         
		} else
		{
			return null;
	//  111  233:aconst_null     
	//  112  234:areturn         
		}
	}

	public String[] getTransitionProperties()
	{
		return sTransitionProperties;
	//    0    0:getstatic       #21  <Field String[] sTransitionProperties>
	//    1    3:areturn         
	}

	private static final String PROPNAME_BOUNDS = "android:clipBounds:bounds";
	private static final String PROPNAME_CLIP = "android:clipBounds:clip";
	private static final String sTransitionProperties[] = {
		"android:clipBounds:clip"
	};

	static 
	{
	//    0    0:iconst_1        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #13  <String "android:clipBounds:clip">
	//    5    8:aastore         
	//    6    9:putstatic       #21  <Field String[] sTransitionProperties>
	//*   7   12:return          
	}
}
