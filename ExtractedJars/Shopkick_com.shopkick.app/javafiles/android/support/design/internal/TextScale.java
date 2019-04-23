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
	//    1    1:invokespecial   #18  <Method void Transition()>
	//    2    4:return          
	}

	private void captureValues(TransitionValues transitionvalues)
	{
		if(transitionvalues.view instanceof TextView)
	//*   0    0:aload_1         
	//*   1    1:getfield        #27  <Field android.view.View TransitionValues.view>
	//*   2    4:instanceof      #29  <Class TextView>
	//*   3    7:ifeq            37
		{
			TextView textview = (TextView)transitionvalues.view;
	//    4   10:aload_1         
	//    5   11:getfield        #27  <Field android.view.View TransitionValues.view>
	//    6   14:checkcast       #29  <Class TextView>
	//    7   17:astore_2        
			transitionvalues.values.put("android:textscale:scale", ((Object) (Float.valueOf(textview.getScaleX()))));
	//    8   18:aload_1         
	//    9   19:getfield        #33  <Field Map TransitionValues.values>
	//   10   22:ldc1            #14  <String "android:textscale:scale">
	//   11   24:aload_2         
	//   12   25:invokevirtual   #37  <Method float TextView.getScaleX()>
	//   13   28:invokestatic    #43  <Method Float Float.valueOf(float)>
	//   14   31:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   15   36:pop             
		}
	//   16   37:return          
	}

	public void captureEndValues(TransitionValues transitionvalues)
	{
		captureValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #52  <Method void captureValues(TransitionValues)>
	//    3    5:return          
	}

	public void captureStartValues(TransitionValues transitionvalues)
	{
		captureValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #52  <Method void captureValues(TransitionValues)>
	//    3    5:return          
	}

	public Animator createAnimator(final ViewGroup view, TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		if(transitionvalues != null && transitionvalues1 != null && (transitionvalues.view instanceof TextView))
	//*   0    0:aload_2         
	//*   1    1:ifnull          157
	//*   2    4:aload_3         
	//*   3    5:ifnull          157
	//*   4    8:aload_2         
	//*   5    9:getfield        #27  <Field android.view.View TransitionValues.view>
	//*   6   12:instanceof      #29  <Class TextView>
	//*   7   15:ifeq            157
		{
			if(!(transitionvalues1.view instanceof TextView))
	//*   8   18:aload_3         
	//*   9   19:getfield        #27  <Field android.view.View TransitionValues.view>
	//*  10   22:instanceof      #29  <Class TextView>
	//*  11   25:ifne            30
				return null;
	//   12   28:aconst_null     
	//   13   29:areturn         
			view = ((ViewGroup) ((TextView)transitionvalues1.view));
	//   14   30:aload_3         
	//   15   31:getfield        #27  <Field android.view.View TransitionValues.view>
	//   16   34:checkcast       #29  <Class TextView>
	//   17   37:astore_1        
			transitionvalues = ((TransitionValues) (transitionvalues.values));
	//   18   38:aload_2         
	//   19   39:getfield        #33  <Field Map TransitionValues.values>
	//   20   42:astore_2        
			transitionvalues1 = ((TransitionValues) (transitionvalues1.values));
	//   21   43:aload_3         
	//   22   44:getfield        #33  <Field Map TransitionValues.values>
	//   23   47:astore_3        
			Object obj = ((Map) (transitionvalues)).get("android:textscale:scale");
	//   24   48:aload_2         
	//   25   49:ldc1            #14  <String "android:textscale:scale">
	//   26   51:invokeinterface #59  <Method Object Map.get(Object)>
	//   27   56:astore          6
			float f1 = 1.0F;
	//   28   58:fconst_1        
	//   29   59:fstore          5
			float f;
			if(obj != null)
	//*  30   61:aload           6
	//*  31   63:ifnull          85
				f = ((Float)((Map) (transitionvalues)).get("android:textscale:scale")).floatValue();
	//   32   66:aload_2         
	//   33   67:ldc1            #14  <String "android:textscale:scale">
	//   34   69:invokeinterface #59  <Method Object Map.get(Object)>
	//   35   74:checkcast       #39  <Class Float>
	//   36   77:invokevirtual   #62  <Method float Float.floatValue()>
	//   37   80:fstore          4
			else
	//*  38   82:goto            88
				f = 1.0F;
	//   39   85:fconst_1        
	//   40   86:fstore          4
			if(((Map) (transitionvalues1)).get("android:textscale:scale") != null)
	//*  41   88:aload_3         
	//*  42   89:ldc1            #14  <String "android:textscale:scale">
	//*  43   91:invokeinterface #59  <Method Object Map.get(Object)>
	//*  44   96:ifnull          115
				f1 = ((Float)((Map) (transitionvalues1)).get("android:textscale:scale")).floatValue();
	//   45   99:aload_3         
	//   46  100:ldc1            #14  <String "android:textscale:scale">
	//   47  102:invokeinterface #59  <Method Object Map.get(Object)>
	//   48  107:checkcast       #39  <Class Float>
	//   49  110:invokevirtual   #62  <Method float Float.floatValue()>
	//   50  113:fstore          5
			if(f == f1)
	//*  51  115:fload           4
	//*  52  117:fload           5
	//*  53  119:fcmpl           
	//*  54  120:ifne            125
			{
				return null;
	//   55  123:aconst_null     
	//   56  124:areturn         
			} else
			{
				transitionvalues = ((TransitionValues) (ValueAnimator.ofFloat(new float[] {
					f, f1
				})));
	//   57  125:iconst_2        
	//   58  126:newarray        float[]
	//   59  128:dup             
	//   60  129:iconst_0        
	//   61  130:fload           4
	//   62  132:fastore         
	//   63  133:dup             
	//   64  134:iconst_1        
	//   65  135:fload           5
	//   66  137:fastore         
	//   67  138:invokestatic    #68  <Method ValueAnimator ValueAnimator.ofFloat(float[])>
	//   68  141:astore_2        
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
	//   69  142:aload_2         
	//   70  143:new             #6   <Class TextScale$1>
	//   71  146:dup             
	//   72  147:aload_0         
	//   73  148:aload_1         
	//   74  149:invokespecial   #71  <Method void TextScale$1(TextScale, TextView)>
	//   75  152:invokevirtual   #75  <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
				return ((Animator) (transitionvalues));
	//   76  155:aload_2         
	//   77  156:areturn         
			}
		} else
		{
			return null;
	//   78  157:aconst_null     
	//   79  158:areturn         
		}
	}

	private static final String PROPNAME_SCALE = "android:textscale:scale";
}
