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

	public Animator createAnimator(ViewGroup viewgroup, TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		if(transitionvalues == null || transitionvalues1 == null || !(transitionvalues.view instanceof TextView) || !(transitionvalues1.view instanceof TextView))
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
			return null;
	//   12   28:aconst_null     
	//   13   29:areturn         
		viewgroup = ((ViewGroup) ((TextView)transitionvalues1.view));
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
		if(((Map) (transitionvalues)).get("android:textscale:scale") != null)
	//*  24   48:aload_2         
	//*  25   49:ldc1            #16  <String "android:textscale:scale">
	//*  26   51:invokeinterface #61  <Method Object Map.get(Object)>
	//*  27   56:ifnull          78
			f = ((Float)((Map) (transitionvalues)).get("android:textscale:scale")).floatValue();
	//   28   59:aload_2         
	//   29   60:ldc1            #16  <String "android:textscale:scale">
	//   30   62:invokeinterface #61  <Method Object Map.get(Object)>
	//   31   67:checkcast       #41  <Class Float>
	//   32   70:invokevirtual   #64  <Method float Float.floatValue()>
	//   33   73:fstore          4
		else
	//*  34   75:goto            81
			f = 1.0F;
	//   35   78:fconst_1        
	//   36   79:fstore          4
		float f1;
		if(((Map) (transitionvalues1)).get("android:textscale:scale") != null)
	//*  37   81:aload_3         
	//*  38   82:ldc1            #16  <String "android:textscale:scale">
	//*  39   84:invokeinterface #61  <Method Object Map.get(Object)>
	//*  40   89:ifnull          111
			f1 = ((Float)((Map) (transitionvalues1)).get("android:textscale:scale")).floatValue();
	//   41   92:aload_3         
	//   42   93:ldc1            #16  <String "android:textscale:scale">
	//   43   95:invokeinterface #61  <Method Object Map.get(Object)>
	//   44  100:checkcast       #41  <Class Float>
	//   45  103:invokevirtual   #64  <Method float Float.floatValue()>
	//   46  106:fstore          5
		else
	//*  47  108:goto            114
			f1 = 1.0F;
	//   48  111:fconst_1        
	//   49  112:fstore          5
		if(f == f1)
	//*  50  114:fload           4
	//*  51  116:fload           5
	//*  52  118:fcmpl           
	//*  53  119:ifne            124
		{
			return null;
	//   54  122:aconst_null     
	//   55  123:areturn         
		} else
		{
			transitionvalues = ((TransitionValues) (ValueAnimator.ofFloat(new float[] {
				f, f1
			})));
	//   56  124:iconst_2        
	//   57  125:newarray        float[]
	//   58  127:dup             
	//   59  128:iconst_0        
	//   60  129:fload           4
	//   61  131:fastore         
	//   62  132:dup             
	//   63  133:iconst_1        
	//   64  134:fload           5
	//   65  136:fastore         
	//   66  137:invokestatic    #70  <Method ValueAnimator ValueAnimator.ofFloat(float[])>
	//   67  140:astore_2        
			((ValueAnimator) (transitionvalues)).addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(((TextView) (viewgroup))) {

				public void onAnimationUpdate(ValueAnimator valueanimator)
				{
					float f2 = ((Float)valueanimator.getAnimatedValue()).floatValue();
				//    0    0:aload_1         
				//    1    1:invokevirtual   #33  <Method Object ValueAnimator.getAnimatedValue()>
				//    2    4:checkcast       #35  <Class Float>
				//    3    7:invokevirtual   #39  <Method float Float.floatValue()>
				//    4   10:fstore_2        
					a.setScaleX(f2);
				//    5   11:aload_0         
				//    6   12:getfield        #21  <Field TextView a>
				//    7   15:fload_2         
				//    8   16:invokevirtual   #45  <Method void TextView.setScaleX(float)>
					a.setScaleY(f2);
				//    9   19:aload_0         
				//   10   20:getfield        #21  <Field TextView a>
				//   11   23:fload_2         
				//   12   24:invokevirtual   #48  <Method void TextView.setScaleY(float)>
				//   13   27:return          
				}

				final TextView a;
				final TextScale d;

			
			{
				d = TextScale.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field TextScale d>
				a = textview;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field TextView a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   68  141:aload_2         
	//   69  142:new             #6   <Class TextScale$5>
	//   70  145:dup             
	//   71  146:aload_0         
	//   72  147:aload_1         
	//   73  148:invokespecial   #73  <Method void TextScale$5(TextScale, TextView)>
	//   74  151:invokevirtual   #77  <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
			return ((Animator) (transitionvalues));
	//   75  154:aload_2         
	//   76  155:areturn         
		}
	}

	private static final String PROPNAME_SCALE = "android:textscale:scale";
}
