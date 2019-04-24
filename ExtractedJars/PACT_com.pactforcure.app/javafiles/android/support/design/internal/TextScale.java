// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.support.transition.Transition;
import android.support.transition.TransitionValues;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;

public class TextScale extends Transition
{

	public TextScale()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Transition()>
	//    2    4:return          
	}

	private void captureValues(TransitionValues transitionvalues)
	{
		if(transitionvalues.view instanceof TextView)
	//*   0    0:aload_1         
	//*   1    1:getfield        #29  <Field android.view.View TransitionValues.view>
	//*   2    4:instanceof      #31  <Class TextView>
	//*   3    7:ifeq            37
		{
			TextView textview = (TextView)transitionvalues.view;
	//    4   10:aload_1         
	//    5   11:getfield        #29  <Field android.view.View TransitionValues.view>
	//    6   14:checkcast       #31  <Class TextView>
	//    7   17:astore_2        
			transitionvalues.values.put("android:textscale:scale", ((Object) (Float.valueOf(textview.getScaleX()))));
	//    8   18:aload_1         
	//    9   19:getfield        #35  <Field Map TransitionValues.values>
	//   10   22:ldc1            #16  <String "android:textscale:scale">
	//   11   24:aload_2         
	//   12   25:invokevirtual   #39  <Method float TextView.getScaleX()>
	//   13   28:invokestatic    #45  <Method Float Float.valueOf(float)>
	//   14   31:invokeinterface #51  <Method Object Map.put(Object, Object)>
	//   15   36:pop             
		}
	//   16   37:return          
	}

	public void captureEndValues(TransitionValues transitionvalues)
	{
		captureValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #54  <Method void captureValues(TransitionValues)>
	//    3    5:return          
	}

	public void captureStartValues(TransitionValues transitionvalues)
	{
		captureValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #54  <Method void captureValues(TransitionValues)>
	//    3    5:return          
	}

	public Animator createAnimator(final ViewGroup view, TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		if(transitionvalues != null && transitionvalues1 != null && (transitionvalues.view instanceof TextView) && (transitionvalues1.view instanceof TextView))
	//*   0    0:aload_2         
	//*   1    1:ifnull          28
	//*   2    4:aload_3         
	//*   3    5:ifnull          28
	//*   4    8:aload_2         
	//*   5    9:getfield        #29  <Field android.view.View TransitionValues.view>
	//*   6   12:instanceof      #31  <Class TextView>
	//*   7   15:ifeq            28
	//*   8   18:aload_3         
	//*   9   19:getfield        #29  <Field android.view.View TransitionValues.view>
	//*  10   22:instanceof      #31  <Class TextView>
	//*  11   25:ifne            30
	//*  12   28:aconst_null     
	//*  13   29:areturn         
		{
			view = ((ViewGroup) ((TextView)transitionvalues1.view));
	//   14   30:aload_3         
	//   15   31:getfield        #29  <Field android.view.View TransitionValues.view>
	//   16   34:checkcast       #31  <Class TextView>
	//   17   37:astore_1        
			transitionvalues = ((TransitionValues) (transitionvalues.values));
	//   18   38:aload_2         
	//   19   39:getfield        #35  <Field Map TransitionValues.values>
	//   20   42:astore_2        
			transitionvalues1 = ((TransitionValues) (transitionvalues1.values));
	//   21   43:aload_3         
	//   22   44:getfield        #35  <Field Map TransitionValues.values>
	//   23   47:astore_3        
			float f;
			float f1;
			if(((Map) (transitionvalues)).get("android:textscale:scale") != null)
	//*  24   48:aload_2         
	//*  25   49:ldc1            #16  <String "android:textscale:scale">
	//*  26   51:invokeinterface #61  <Method Object Map.get(Object)>
	//*  27   56:ifnull          142
				f = ((Float)((Map) (transitionvalues)).get("android:textscale:scale")).floatValue();
	//   28   59:aload_2         
	//   29   60:ldc1            #16  <String "android:textscale:scale">
	//   30   62:invokeinterface #61  <Method Object Map.get(Object)>
	//   31   67:checkcast       #41  <Class Float>
	//   32   70:invokevirtual   #64  <Method float Float.floatValue()>
	//   33   73:fstore          4
			else
	//*  34   75:aload_3         
	//*  35   76:ldc1            #16  <String "android:textscale:scale">
	//*  36   78:invokeinterface #61  <Method Object Map.get(Object)>
	//*  37   83:ifnull          148
	//*  38   86:aload_3         
	//*  39   87:ldc1            #16  <String "android:textscale:scale">
	//*  40   89:invokeinterface #61  <Method Object Map.get(Object)>
	//*  41   94:checkcast       #41  <Class Float>
	//*  42   97:invokevirtual   #64  <Method float Float.floatValue()>
	//*  43  100:fstore          5
	//*  44  102:fload           4
	//*  45  104:fload           5
	//*  46  106:fcmpl           
	//*  47  107:ifeq            28
	//*  48  110:iconst_2        
	//*  49  111:newarray        float[]
	//*  50  113:dup             
	//*  51  114:iconst_0        
	//*  52  115:fload           4
	//*  53  117:fastore         
	//*  54  118:dup             
	//*  55  119:iconst_1        
	//*  56  120:fload           5
	//*  57  122:fastore         
	//*  58  123:invokestatic    #70  <Method ValueAnimator ValueAnimator.ofFloat(float[])>
	//*  59  126:astore_2        
	//*  60  127:aload_2         
	//*  61  128:new             #6   <Class TextScale$1>
	//*  62  131:dup             
	//*  63  132:aload_0         
	//*  64  133:aload_1         
	//*  65  134:invokespecial   #73  <Method void TextScale$1(TextScale, TextView)>
	//*  66  137:invokevirtual   #77  <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
	//*  67  140:aload_2         
	//*  68  141:areturn         
				f = 1.0F;
	//   69  142:fconst_1        
	//   70  143:fstore          4
			if(((Map) (transitionvalues1)).get("android:textscale:scale") != null)
				f1 = ((Float)((Map) (transitionvalues1)).get("android:textscale:scale")).floatValue();
			else
	//*  71  145:goto            75
				f1 = 1.0F;
	//   72  148:fconst_1        
	//   73  149:fstore          5
			if(f != f1)
			{
				transitionvalues = ((TransitionValues) (ValueAnimator.ofFloat(new float[] {
					f, f1
				})));
				((ValueAnimator) (transitionvalues)).addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

					public void onAnimationUpdate(ValueAnimator valueanimator)
					{
						float f2 = ((Float)valueanimator.getAnimatedValue()).floatValue();
					//    0    0:aload_1         
					//    1    1:invokevirtual   #33  <Method Object ValueAnimator.getAnimatedValue()>
					//    2    4:checkcast       #35  <Class Float>
					//    3    7:invokevirtual   #39  <Method float Float.floatValue()>
					//    4   10:fstore_2        
						view.setScaleX(f2);
					//    5   11:aload_0         
					//    6   12:getfield        #21  <Field TextView val$view>
					//    7   15:fload_2         
					//    8   16:invokevirtual   #45  <Method void TextView.setScaleX(float)>
						view.setScaleY(f2);
					//    9   19:aload_0         
					//   10   20:getfield        #21  <Field TextView val$view>
					//   11   23:fload_2         
					//   12   24:invokevirtual   #48  <Method void TextView.setScaleY(float)>
					//   13   27:return          
					}

					final TextScale this$0;
					final TextView val$view;

			
			{
				this$0 = TextScale.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field TextScale this$0>
				view = textview;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field TextView val$view>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
				}
);
				return ((Animator) (transitionvalues));
			}
		}
		return null;
	//*  74  151:goto            102
	}

	private static final String PROPNAME_SCALE = "android:textscale:scale";
}
