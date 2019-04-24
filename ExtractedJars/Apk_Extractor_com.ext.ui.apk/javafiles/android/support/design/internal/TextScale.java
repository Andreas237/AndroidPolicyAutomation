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
		float f1 = 1.0F;
	//    0    0:fconst_1        
	//    1    1:fstore          5
		if(transitionvalues == null || transitionvalues1 == null || !(transitionvalues.view instanceof TextView) || !(transitionvalues1.view instanceof TextView))
	//*   2    3:aload_2         
	//*   3    4:ifnull          31
	//*   4    7:aload_3         
	//*   5    8:ifnull          31
	//*   6   11:aload_2         
	//*   7   12:getfield        #29  <Field android.view.View TransitionValues.view>
	//*   8   15:instanceof      #31  <Class TextView>
	//*   9   18:ifeq            31
	//*  10   21:aload_3         
	//*  11   22:getfield        #29  <Field android.view.View TransitionValues.view>
	//*  12   25:instanceof      #31  <Class TextView>
	//*  13   28:ifne            33
			return null;
	//   14   31:aconst_null     
	//   15   32:areturn         
		view = ((ViewGroup) ((TextView)transitionvalues1.view));
	//   16   33:aload_3         
	//   17   34:getfield        #29  <Field android.view.View TransitionValues.view>
	//   18   37:checkcast       #31  <Class TextView>
	//   19   40:astore_1        
		transitionvalues = ((TransitionValues) (transitionvalues.values));
	//   20   41:aload_2         
	//   21   42:getfield        #35  <Field Map TransitionValues.values>
	//   22   45:astore_2        
		transitionvalues1 = ((TransitionValues) (transitionvalues1.values));
	//   23   46:aload_3         
	//   24   47:getfield        #35  <Field Map TransitionValues.values>
	//   25   50:astore_3        
		float f;
		if(((Map) (transitionvalues)).get("android:textscale:scale") != null)
	//*  26   51:aload_2         
	//*  27   52:ldc1            #16  <String "android:textscale:scale">
	//*  28   54:invokeinterface #61  <Method Object Map.get(Object)>
	//*  29   59:ifnull          115
			f = ((Float)((Map) (transitionvalues)).get("android:textscale:scale")).floatValue();
	//   30   62:aload_2         
	//   31   63:ldc1            #16  <String "android:textscale:scale">
	//   32   65:invokeinterface #61  <Method Object Map.get(Object)>
	//   33   70:checkcast       #41  <Class Float>
	//   34   73:invokevirtual   #64  <Method float Float.floatValue()>
	//   35   76:fstore          4
		else
	//*  36   78:aload_3         
	//*  37   79:ldc1            #16  <String "android:textscale:scale">
	//*  38   81:invokeinterface #61  <Method Object Map.get(Object)>
	//*  39   86:ifnull          105
	//*  40   89:aload_3         
	//*  41   90:ldc1            #16  <String "android:textscale:scale">
	//*  42   92:invokeinterface #61  <Method Object Map.get(Object)>
	//*  43   97:checkcast       #41  <Class Float>
	//*  44  100:invokevirtual   #64  <Method float Float.floatValue()>
	//*  45  103:fstore          5
	//*  46  105:fload           4
	//*  47  107:fload           5
	//*  48  109:fcmpl           
	//*  49  110:ifne            121
	//*  50  113:aconst_null     
	//*  51  114:areturn         
			f = 1.0F;
	//   52  115:fconst_1        
	//   53  116:fstore          4
		if(((Map) (transitionvalues1)).get("android:textscale:scale") != null)
			f1 = ((Float)((Map) (transitionvalues1)).get("android:textscale:scale")).floatValue();
		if(f == f1)
		{
			return null;
		} else
	//*  54  118:goto            78
		{
			transitionvalues = ((TransitionValues) (ValueAnimator.ofFloat(new float[] {
				f, f1
			})));
	//   55  121:iconst_2        
	//   56  122:newarray        float[]
	//   57  124:dup             
	//   58  125:iconst_0        
	//   59  126:fload           4
	//   60  128:fastore         
	//   61  129:dup             
	//   62  130:iconst_1        
	//   63  131:fload           5
	//   64  133:fastore         
	//   65  134:invokestatic    #70  <Method ValueAnimator ValueAnimator.ofFloat(float[])>
	//   66  137:astore_2        
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
	//   67  138:aload_2         
	//   68  139:new             #6   <Class TextScale$1>
	//   69  142:dup             
	//   70  143:aload_0         
	//   71  144:aload_1         
	//   72  145:invokespecial   #73  <Method void TextScale$1(TextScale, TextView)>
	//   73  148:invokevirtual   #77  <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
			return ((Animator) (transitionvalues));
	//   74  151:aload_2         
	//   75  152:areturn         
		}
	}

	private static final String PROPNAME_SCALE = "android:textscale:scale";
}
