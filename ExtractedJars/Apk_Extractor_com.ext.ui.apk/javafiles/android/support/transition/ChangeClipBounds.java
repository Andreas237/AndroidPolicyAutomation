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
		if(transitionvalues != null && transitionvalues1 != null && transitionvalues.values.containsKey("android:clipBounds:clip") && transitionvalues1.values.containsKey("android:clipBounds:clip")) goto _L2; else goto _L1
	//    0    0:aload_2         
	//    1    1:ifnull          36
	//    2    4:aload_3         
	//    3    5:ifnull          36
	//    4    8:aload_2         
	//    5    9:getfield        #52  <Field Map TransitionValues.values>
	//    6   12:ldc1            #13  <String "android:clipBounds:clip">
	//    7   14:invokeinterface #81  <Method boolean Map.containsKey(Object)>
	//    8   19:ifeq            36
	//    9   22:aload_3         
	//   10   23:getfield        #52  <Field Map TransitionValues.values>
	//   11   26:ldc1            #13  <String "android:clipBounds:clip">
	//   12   28:invokeinterface #81  <Method boolean Map.containsKey(Object)>
	//   13   33:ifne            40
_L1:
		viewgroup = null;
	//   14   36:aconst_null     
	//   15   37:astore_1        
_L8:
		return ((Animator) (viewgroup));
	//   16   38:aload_1         
	//   17   39:areturn         
_L2:
		boolean flag;
		Rect rect;
		Rect rect1;
		rect = (Rect)transitionvalues.values.get("android:clipBounds:clip");
	//   18   40:aload_2         
	//   19   41:getfield        #52  <Field Map TransitionValues.values>
	//   20   44:ldc1            #13  <String "android:clipBounds:clip">
	//   21   46:invokeinterface #85  <Method Object Map.get(Object)>
	//   22   51:checkcast       #60  <Class Rect>
	//   23   54:astore          5
		rect1 = (Rect)transitionvalues1.values.get("android:clipBounds:clip");
	//   24   56:aload_3         
	//   25   57:getfield        #52  <Field Map TransitionValues.values>
	//   26   60:ldc1            #13  <String "android:clipBounds:clip">
	//   27   62:invokeinterface #85  <Method Object Map.get(Object)>
	//   28   67:checkcast       #60  <Class Rect>
	//   29   70:astore          6
		if(rect1 == null)
	//*  30   72:aload           6
	//*  31   74:ifnonnull       92
			flag = true;
	//   32   77:iconst_1        
	//   33   78:istore          4
		else
	//*  34   80:aload           5
	//*  35   82:ifnonnull       98
	//*  36   85:aload           6
	//*  37   87:ifnonnull       98
	//*  38   90:aconst_null     
	//*  39   91:areturn         
			flag = false;
	//   40   92:iconst_0        
	//   41   93:istore          4
		if(rect == null && rect1 == null)
			return null;
	//*  42   95:goto            80
		if(rect != null) goto _L4; else goto _L3
	//   43   98:aload           5
	//   44  100:ifnonnull       131
_L3:
		viewgroup = ((ViewGroup) ((Rect)transitionvalues.values.get("android:clipBounds:bounds")));
	//   45  103:aload_2         
	//   46  104:getfield        #52  <Field Map TransitionValues.values>
	//   47  107:ldc1            #10  <String "android:clipBounds:bounds">
	//   48  109:invokeinterface #85  <Method Object Map.get(Object)>
	//   49  114:checkcast       #60  <Class Rect>
	//   50  117:astore_1        
		transitionvalues = ((TransitionValues) (rect1));
	//   51  118:aload           6
	//   52  120:astore_2        
_L6:
		if(((Rect) (viewgroup)).equals(((Object) (transitionvalues))))
	//*  53  121:aload_1         
	//*  54  122:aload_2         
	//*  55  123:invokevirtual   #88  <Method boolean Rect.equals(Object)>
	//*  56  126:ifeq            163
			return null;
	//   57  129:aconst_null     
	//   58  130:areturn         
		break; /* Loop/switch isn't completed */
_L4:
		viewgroup = ((ViewGroup) (rect));
	//   59  131:aload           5
	//   60  133:astore_1        
		transitionvalues = ((TransitionValues) (rect1));
	//   61  134:aload           6
	//   62  136:astore_2        
		if(rect1 == null)
	//*  63  137:aload           6
	//*  64  139:ifnonnull       121
		{
			transitionvalues = ((TransitionValues) ((Rect)transitionvalues1.values.get("android:clipBounds:bounds")));
	//   65  142:aload_3         
	//   66  143:getfield        #52  <Field Map TransitionValues.values>
	//   67  146:ldc1            #10  <String "android:clipBounds:bounds">
	//   68  148:invokeinterface #85  <Method Object Map.get(Object)>
	//   69  153:checkcast       #60  <Class Rect>
	//   70  156:astore_2        
			viewgroup = ((ViewGroup) (rect));
	//   71  157:aload           5
	//   72  159:astore_1        
		}
		if(true) goto _L6; else goto _L5
	//   73  160:goto            121
_L5:
		ViewCompat.setClipBounds(transitionvalues1.view, ((Rect) (viewgroup)));
	//   74  163:aload_3         
	//   75  164:getfield        #36  <Field View TransitionValues.view>
	//   76  167:aload_1         
	//   77  168:invokestatic    #92  <Method void ViewCompat.setClipBounds(View, Rect)>
		RectEvaluator rectevaluator = new RectEvaluator(new Rect());
	//   78  171:new             #94  <Class RectEvaluator>
	//   79  174:dup             
	//   80  175:new             #60  <Class Rect>
	//   81  178:dup             
	//   82  179:invokespecial   #95  <Method void Rect()>
	//   83  182:invokespecial   #98  <Method void RectEvaluator(Rect)>
	//   84  185:astore          5
		transitionvalues = ((TransitionValues) (ObjectAnimator.ofObject(((Object) (transitionvalues1.view)), ViewUtils.CLIP_BOUNDS, ((android.animation.TypeEvaluator) (rectevaluator)), ((Object []) (new Rect[] {
			viewgroup, transitionvalues
		})))));
	//   85  187:aload_3         
	//   86  188:getfield        #36  <Field View TransitionValues.view>
	//   87  191:getstatic       #104 <Field android.util.Property ViewUtils.CLIP_BOUNDS>
	//   88  194:aload           5
	//   89  196:iconst_2        
	//   90  197:anewarray       Rect[]
	//   91  200:dup             
	//   92  201:iconst_0        
	//   93  202:aload_1         
	//   94  203:aastore         
	//   95  204:dup             
	//   96  205:iconst_1        
	//   97  206:aload_2         
	//   98  207:aastore         
	//   99  208:invokestatic    #110 <Method ObjectAnimator ObjectAnimator.ofObject(Object, android.util.Property, android.animation.TypeEvaluator, Object[])>
	//  100  211:astore_2        
		viewgroup = ((ViewGroup) (transitionvalues));
	//  101  212:aload_2         
	//  102  213:astore_1        
		if(flag)
	//* 103  214:iload           4
	//* 104  216:ifeq            38
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
	//  105  219:aload_2         
	//  106  220:new             #6   <Class ChangeClipBounds$1>
	//  107  223:dup             
	//  108  224:aload_0         
	//  109  225:aload_3         
	//  110  226:getfield        #36  <Field View TransitionValues.view>
	//  111  229:invokespecial   #113 <Method void ChangeClipBounds$1(ChangeClipBounds, View)>
	//  112  232:invokevirtual   #117 <Method void ObjectAnimator.addListener(android.animation.Animator$AnimatorListener)>
			return ((Animator) (transitionvalues));
	//  113  235:aload_2         
	//  114  236:areturn         
		}
		if(true) goto _L8; else goto _L7
_L7:
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
