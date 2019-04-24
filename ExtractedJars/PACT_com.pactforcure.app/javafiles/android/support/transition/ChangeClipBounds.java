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
		if(((View) (obj)).getVisibility() != 8)
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #42  <Method int View.getVisibility()>
	//*   5    9:bipush          8
	//*   6   11:icmpne          15
	//*   7   14:return          
		{
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
	//*  18   34:ifnonnull       14
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
				return;
	//   35   68:return          
			}
		}
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
		Object obj;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		viewgroup = ((ViewGroup) (obj));
	//    2    3:aload           6
	//    3    5:astore_1        
		if(transitionvalues == null) goto _L2; else goto _L1
	//    4    6:aload_2         
	//    5    7:ifnull          51
_L1:
		viewgroup = ((ViewGroup) (obj));
	//    6   10:aload           6
	//    7   12:astore_1        
		if(transitionvalues1 == null) goto _L2; else goto _L3
	//    8   13:aload_3         
	//    9   14:ifnull          51
_L3:
		viewgroup = ((ViewGroup) (obj));
	//   10   17:aload           6
	//   11   19:astore_1        
		if(!transitionvalues.values.containsKey("android:clipBounds:clip")) goto _L2; else goto _L4
	//   12   20:aload_2         
	//   13   21:getfield        #52  <Field Map TransitionValues.values>
	//   14   24:ldc1            #13  <String "android:clipBounds:clip">
	//   15   26:invokeinterface #81  <Method boolean Map.containsKey(Object)>
	//   16   31:ifeq            51
_L4:
		if(transitionvalues1.values.containsKey("android:clipBounds:clip")) goto _L6; else goto _L5
	//   17   34:aload_3         
	//   18   35:getfield        #52  <Field Map TransitionValues.values>
	//   19   38:ldc1            #13  <String "android:clipBounds:clip">
	//   20   40:invokeinterface #81  <Method boolean Map.containsKey(Object)>
	//   21   45:ifne            53
_L5:
		viewgroup = ((ViewGroup) (obj));
	//   22   48:aload           6
	//   23   50:astore_1        
_L2:
		return ((Animator) (viewgroup));
	//   24   51:aload_1         
	//   25   52:areturn         
_L6:
		Rect rect;
		Rect rect1;
		Rect rect2;
		rect1 = (Rect)transitionvalues.values.get("android:clipBounds:clip");
	//   26   53:aload_2         
	//   27   54:getfield        #52  <Field Map TransitionValues.values>
	//   28   57:ldc1            #13  <String "android:clipBounds:clip">
	//   29   59:invokeinterface #85  <Method Object Map.get(Object)>
	//   30   64:checkcast       #60  <Class Rect>
	//   31   67:astore          7
		rect2 = (Rect)transitionvalues1.values.get("android:clipBounds:clip");
	//   32   69:aload_3         
	//   33   70:getfield        #52  <Field Map TransitionValues.values>
	//   34   73:ldc1            #13  <String "android:clipBounds:clip">
	//   35   75:invokeinterface #85  <Method Object Map.get(Object)>
	//   36   80:checkcast       #60  <Class Rect>
	//   37   83:astore          8
		boolean flag;
		if(rect2 == null)
	//*  38   85:aload           8
	//*  39   87:ifnonnull       216
			flag = true;
	//   40   90:iconst_1        
	//   41   91:istore          4
		else
	//*  42   93:aload           7
	//*  43   95:ifnonnull       106
	//*  44   98:aload           6
	//*  45  100:astore_1        
	//*  46  101:aload           8
	//*  47  103:ifnull          51
	//*  48  106:aload           7
	//*  49  108:ifnonnull       222
	//*  50  111:aload_2         
	//*  51  112:getfield        #52  <Field Map TransitionValues.values>
	//*  52  115:ldc1            #10  <String "android:clipBounds:bounds">
	//*  53  117:invokeinterface #85  <Method Object Map.get(Object)>
	//*  54  122:checkcast       #60  <Class Rect>
	//*  55  125:astore          5
	//*  56  127:aload           8
	//*  57  129:astore_2        
	//*  58  130:aload           6
	//*  59  132:astore_1        
	//*  60  133:aload           5
	//*  61  135:aload_2         
	//*  62  136:invokevirtual   #88  <Method boolean Rect.equals(Object)>
	//*  63  139:ifne            51
	//*  64  142:aload_3         
	//*  65  143:getfield        #36  <Field View TransitionValues.view>
	//*  66  146:aload           5
	//*  67  148:invokestatic    #92  <Method void ViewCompat.setClipBounds(View, Rect)>
	//*  68  151:new             #94  <Class RectEvaluator>
	//*  69  154:dup             
	//*  70  155:new             #60  <Class Rect>
	//*  71  158:dup             
	//*  72  159:invokespecial   #95  <Method void Rect()>
	//*  73  162:invokespecial   #98  <Method void RectEvaluator(Rect)>
	//*  74  165:astore_1        
	//*  75  166:aload_3         
	//*  76  167:getfield        #36  <Field View TransitionValues.view>
	//*  77  170:getstatic       #104 <Field android.util.Property ViewUtils.CLIP_BOUNDS>
	//*  78  173:aload_1         
	//*  79  174:iconst_2        
	//*  80  175:anewarray       Rect[]
	//*  81  178:dup             
	//*  82  179:iconst_0        
	//*  83  180:aload           5
	//*  84  182:aastore         
	//*  85  183:dup             
	//*  86  184:iconst_1        
	//*  87  185:aload_2         
	//*  88  186:aastore         
	//*  89  187:invokestatic    #110 <Method ObjectAnimator ObjectAnimator.ofObject(Object, android.util.Property, android.animation.TypeEvaluator, Object[])>
	//*  90  190:astore_2        
	//*  91  191:aload_2         
	//*  92  192:astore_1        
	//*  93  193:iload           4
	//*  94  195:ifeq            51
	//*  95  198:aload_2         
	//*  96  199:new             #6   <Class ChangeClipBounds$1>
	//*  97  202:dup             
	//*  98  203:aload_0         
	//*  99  204:aload_3         
	//* 100  205:getfield        #36  <Field View TransitionValues.view>
	//* 101  208:invokespecial   #113 <Method void ChangeClipBounds$1(ChangeClipBounds, View)>
	//* 102  211:invokevirtual   #117 <Method void ObjectAnimator.addListener(android.animation.Animator$AnimatorListener)>
	//* 103  214:aload_2         
	//* 104  215:areturn         
			flag = false;
	//  105  216:iconst_0        
	//  106  217:istore          4
		if(rect1 != null)
			break; /* Loop/switch isn't completed */
		viewgroup = ((ViewGroup) (obj));
		if(rect2 == null) goto _L2; else goto _L7
_L7:
		if(rect1 != null)
			break; /* Loop/switch isn't completed */
		rect = (Rect)transitionvalues.values.get("android:clipBounds:bounds");
		transitionvalues = ((TransitionValues) (rect2));
_L9:
		viewgroup = ((ViewGroup) (obj));
		if(!rect.equals(((Object) (transitionvalues))))
		{
			ViewCompat.setClipBounds(transitionvalues1.view, rect);
			viewgroup = ((ViewGroup) (new RectEvaluator(new Rect())));
			transitionvalues = ((TransitionValues) (ObjectAnimator.ofObject(((Object) (transitionvalues1.view)), ViewUtils.CLIP_BOUNDS, ((android.animation.TypeEvaluator) (viewgroup)), ((Object []) (new Rect[] {
				rect, transitionvalues
			})))));
			viewgroup = ((ViewGroup) (transitionvalues));
			if(flag)
			{
				((ObjectAnimator) (transitionvalues)).addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

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
				return ((Animator) (transitionvalues));
			}
		}
		if(true) goto _L2; else goto _L8
	//* 107  219:goto            93
_L8:
		transitionvalues = ((TransitionValues) (rect2));
	//  108  222:aload           8
	//  109  224:astore_2        
		rect = rect1;
	//  110  225:aload           7
	//  111  227:astore          5
		if(rect2 == null)
	//* 112  229:aload           8
	//* 113  231:ifnonnull       130
		{
			transitionvalues = ((TransitionValues) ((Rect)transitionvalues1.values.get("android:clipBounds:bounds")));
	//  114  234:aload_3         
	//  115  235:getfield        #52  <Field Map TransitionValues.values>
	//  116  238:ldc1            #10  <String "android:clipBounds:bounds">
	//  117  240:invokeinterface #85  <Method Object Map.get(Object)>
	//  118  245:checkcast       #60  <Class Rect>
	//  119  248:astore_2        
			rect = rect1;
	//  120  249:aload           7
	//  121  251:astore          5
		}
		  goto _L9
		if(true) goto _L2; else goto _L10
_L10:
	//* 122  253:goto            130
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
