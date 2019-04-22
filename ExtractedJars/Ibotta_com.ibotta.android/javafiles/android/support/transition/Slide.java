// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.lang.annotation.Annotation;
import java.util.Map;

// Referenced classes of package android.support.transition:
//			Visibility, TransitionValues, TranslationAnimationCreator

public class Slide extends Visibility
{
	private static interface CalculateSlide
	{

		public abstract float getGoneX(ViewGroup viewgroup, View view);

		public abstract float getGoneY(ViewGroup viewgroup, View view);
	}

	private static abstract class CalculateSlideHorizontal
		implements CalculateSlide
	{

		public float getGoneY(ViewGroup viewgroup, View view)
		{
			return view.getTranslationY();
		//    0    0:aload_2         
		//    1    1:invokevirtual   #24  <Method float View.getTranslationY()>
		//    2    4:freturn         
		}

		private CalculateSlideHorizontal()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static abstract class CalculateSlideVertical
		implements CalculateSlide
	{

		public float getGoneX(ViewGroup viewgroup, View view)
		{
			return view.getTranslationX();
		//    0    0:aload_2         
		//    1    1:invokevirtual   #24  <Method float View.getTranslationX()>
		//    2    4:freturn         
		}

		private CalculateSlideVertical()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	public static interface GravityFlag
		extends Annotation
	{
	}


	private void captureValues(TransitionValues transitionvalues)
	{
		View view = transitionvalues.view;
	//    0    0:aload_1         
	//    1    1:getfield        #80  <Field View TransitionValues.view>
	//    2    4:astore_2        
		int ai[] = new int[2];
	//    3    5:iconst_2        
	//    4    6:newarray        int[]
	//    5    8:astore_3        
		view.getLocationOnScreen(ai);
	//    6    9:aload_2         
	//    7   10:aload_3         
	//    8   11:invokevirtual   #86  <Method void View.getLocationOnScreen(int[])>
		transitionvalues.values.put("android:slide:screenPosition", ((Object) (ai)));
	//    9   14:aload_1         
	//   10   15:getfield        #90  <Field Map TransitionValues.values>
	//   11   18:ldc1            #92  <String "android:slide:screenPosition">
	//   12   20:aload_3         
	//   13   21:invokeinterface #98  <Method Object Map.put(Object, Object)>
	//   14   26:pop             
	//   15   27:return          
	}

	public void captureEndValues(TransitionValues transitionvalues)
	{
		super.captureEndValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #102 <Method void Visibility.captureEndValues(TransitionValues)>
		captureValues(transitionvalues);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #104 <Method void captureValues(TransitionValues)>
	//    6   10:return          
	}

	public void captureStartValues(TransitionValues transitionvalues)
	{
		super.captureStartValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #108 <Method void Visibility.captureStartValues(TransitionValues)>
		captureValues(transitionvalues);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #104 <Method void captureValues(TransitionValues)>
	//    6   10:return          
	}

	public Animator onAppear(ViewGroup viewgroup, View view, TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		if(transitionvalues1 == null)
	//*   0    0:aload           4
	//*   1    2:ifnonnull       7
		{
			return null;
	//    2    5:aconst_null     
	//    3    6:areturn         
		} else
		{
			transitionvalues = ((TransitionValues) ((int[])transitionvalues1.values.get("android:slide:screenPosition")));
	//    4    7:aload           4
	//    5    9:getfield        #90  <Field Map TransitionValues.values>
	//    6   12:ldc1            #92  <String "android:slide:screenPosition">
	//    7   14:invokeinterface #114 <Method Object Map.get(Object)>
	//    8   19:checkcast       #116 <Class int[]>
	//    9   22:astore_3        
			float f = view.getTranslationX();
	//   10   23:aload_2         
	//   11   24:invokevirtual   #120 <Method float View.getTranslationX()>
	//   12   27:fstore          5
			float f1 = view.getTranslationY();
	//   13   29:aload_2         
	//   14   30:invokevirtual   #123 <Method float View.getTranslationY()>
	//   15   33:fstore          6
			float f2 = mSlideCalculator.getGoneX(viewgroup, view);
	//   16   35:aload_0         
	//   17   36:getfield        #125 <Field Slide$CalculateSlide mSlideCalculator>
	//   18   39:aload_1         
	//   19   40:aload_2         
	//   20   41:invokeinterface #129 <Method float Slide$CalculateSlide.getGoneX(ViewGroup, View)>
	//   21   46:fstore          7
			float f3 = mSlideCalculator.getGoneY(viewgroup, view);
	//   22   48:aload_0         
	//   23   49:getfield        #125 <Field Slide$CalculateSlide mSlideCalculator>
	//   24   52:aload_1         
	//   25   53:aload_2         
	//   26   54:invokeinterface #132 <Method float Slide$CalculateSlide.getGoneY(ViewGroup, View)>
	//   27   59:fstore          8
			return TranslationAnimationCreator.createAnimation(view, transitionvalues1, transitionvalues[0], transitionvalues[1], f2, f3, f, f1, sDecelerate);
	//   28   61:aload_2         
	//   29   62:aload           4
	//   30   64:aload_3         
	//   31   65:iconst_0        
	//   32   66:iaload          
	//   33   67:aload_3         
	//   34   68:iconst_1        
	//   35   69:iaload          
	//   36   70:fload           7
	//   37   72:fload           8
	//   38   74:fload           5
	//   39   76:fload           6
	//   40   78:getstatic       #48  <Field TimeInterpolator sDecelerate>
	//   41   81:invokestatic    #138 <Method Animator TranslationAnimationCreator.createAnimation(View, TransitionValues, int, int, float, float, float, float, TimeInterpolator)>
	//   42   84:areturn         
		}
	}

	public Animator onDisappear(ViewGroup viewgroup, View view, TransitionValues transitionvalues, TransitionValues transitionvalues1)
	{
		if(transitionvalues == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       6
		{
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		} else
		{
			transitionvalues1 = ((TransitionValues) ((int[])transitionvalues.values.get("android:slide:screenPosition")));
	//    4    6:aload_3         
	//    5    7:getfield        #90  <Field Map TransitionValues.values>
	//    6   10:ldc1            #92  <String "android:slide:screenPosition">
	//    7   12:invokeinterface #114 <Method Object Map.get(Object)>
	//    8   17:checkcast       #116 <Class int[]>
	//    9   20:astore          4
			float f = view.getTranslationX();
	//   10   22:aload_2         
	//   11   23:invokevirtual   #120 <Method float View.getTranslationX()>
	//   12   26:fstore          5
			float f1 = view.getTranslationY();
	//   13   28:aload_2         
	//   14   29:invokevirtual   #123 <Method float View.getTranslationY()>
	//   15   32:fstore          6
			float f2 = mSlideCalculator.getGoneX(viewgroup, view);
	//   16   34:aload_0         
	//   17   35:getfield        #125 <Field Slide$CalculateSlide mSlideCalculator>
	//   18   38:aload_1         
	//   19   39:aload_2         
	//   20   40:invokeinterface #129 <Method float Slide$CalculateSlide.getGoneX(ViewGroup, View)>
	//   21   45:fstore          7
			float f3 = mSlideCalculator.getGoneY(viewgroup, view);
	//   22   47:aload_0         
	//   23   48:getfield        #125 <Field Slide$CalculateSlide mSlideCalculator>
	//   24   51:aload_1         
	//   25   52:aload_2         
	//   26   53:invokeinterface #132 <Method float Slide$CalculateSlide.getGoneY(ViewGroup, View)>
	//   27   58:fstore          8
			return TranslationAnimationCreator.createAnimation(view, transitionvalues, transitionvalues1[0], transitionvalues1[1], f, f1, f2, f3, sAccelerate);
	//   28   60:aload_2         
	//   29   61:aload_3         
	//   30   62:aload           4
	//   31   64:iconst_0        
	//   32   65:iaload          
	//   33   66:aload           4
	//   34   68:iconst_1        
	//   35   69:iaload          
	//   36   70:fload           5
	//   37   72:fload           6
	//   38   74:fload           7
	//   39   76:fload           8
	//   40   78:getstatic       #53  <Field TimeInterpolator sAccelerate>
	//   41   81:invokestatic    #138 <Method Animator TranslationAnimationCreator.createAnimation(View, TransitionValues, int, int, float, float, float, float, TimeInterpolator)>
	//   42   84:areturn         
		}
	}

	private static final TimeInterpolator sAccelerate = new AccelerateInterpolator();
	private static final CalculateSlide sCalculateBottom = new CalculateSlideVertical() {

		public float getGoneY(ViewGroup viewgroup, View view)
		{
			return view.getTranslationY() + (float)viewgroup.getHeight();
		//    0    0:aload_2         
		//    1    1:invokevirtual   #20  <Method float View.getTranslationY()>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #26  <Method int ViewGroup.getHeight()>
		//    4    8:i2f             
		//    5    9:fadd            
		//    6   10:freturn         
		}

	}
;
	private static final CalculateSlide sCalculateEnd = new CalculateSlideHorizontal() {

		public float getGoneX(ViewGroup viewgroup, View view)
		{
			int i = ViewCompat.getLayoutDirection(((View) (viewgroup)));
		//    0    0:aload_1         
		//    1    1:invokestatic    #20  <Method int ViewCompat.getLayoutDirection(View)>
		//    2    4:istore          4
			boolean flag = true;
		//    3    6:iconst_1        
		//    4    7:istore_3        
			if(i != 1)
		//*   5    8:iload           4
		//*   6   10:iconst_1        
		//*   7   11:icmpne          17
		//*   8   14:goto            19
				flag = false;
		//    9   17:iconst_0        
		//   10   18:istore_3        
			if(flag)
		//*  11   19:iload_3         
		//*  12   20:ifeq            34
				return view.getTranslationX() - (float)viewgroup.getWidth();
		//   13   23:aload_2         
		//   14   24:invokevirtual   #26  <Method float View.getTranslationX()>
		//   15   27:aload_1         
		//   16   28:invokevirtual   #32  <Method int ViewGroup.getWidth()>
		//   17   31:i2f             
		//   18   32:fsub            
		//   19   33:freturn         
			else
				return view.getTranslationX() + (float)viewgroup.getWidth();
		//   20   34:aload_2         
		//   21   35:invokevirtual   #26  <Method float View.getTranslationX()>
		//   22   38:aload_1         
		//   23   39:invokevirtual   #32  <Method int ViewGroup.getWidth()>
		//   24   42:i2f             
		//   25   43:fadd            
		//   26   44:freturn         
		}

	}
;
	private static final CalculateSlide sCalculateLeft = new CalculateSlideHorizontal() {

		public float getGoneX(ViewGroup viewgroup, View view)
		{
			return view.getTranslationX() - (float)viewgroup.getWidth();
		//    0    0:aload_2         
		//    1    1:invokevirtual   #20  <Method float View.getTranslationX()>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #26  <Method int ViewGroup.getWidth()>
		//    4    8:i2f             
		//    5    9:fsub            
		//    6   10:freturn         
		}

	}
;
	private static final CalculateSlide sCalculateRight = new CalculateSlideHorizontal() {

		public float getGoneX(ViewGroup viewgroup, View view)
		{
			return view.getTranslationX() + (float)viewgroup.getWidth();
		//    0    0:aload_2         
		//    1    1:invokevirtual   #20  <Method float View.getTranslationX()>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #26  <Method int ViewGroup.getWidth()>
		//    4    8:i2f             
		//    5    9:fadd            
		//    6   10:freturn         
		}

	}
;
	private static final CalculateSlide sCalculateStart = new CalculateSlideHorizontal() {

		public float getGoneX(ViewGroup viewgroup, View view)
		{
			int i = ViewCompat.getLayoutDirection(((View) (viewgroup)));
		//    0    0:aload_1         
		//    1    1:invokestatic    #20  <Method int ViewCompat.getLayoutDirection(View)>
		//    2    4:istore          4
			boolean flag = true;
		//    3    6:iconst_1        
		//    4    7:istore_3        
			if(i != 1)
		//*   5    8:iload           4
		//*   6   10:iconst_1        
		//*   7   11:icmpne          17
		//*   8   14:goto            19
				flag = false;
		//    9   17:iconst_0        
		//   10   18:istore_3        
			if(flag)
		//*  11   19:iload_3         
		//*  12   20:ifeq            34
				return view.getTranslationX() + (float)viewgroup.getWidth();
		//   13   23:aload_2         
		//   14   24:invokevirtual   #26  <Method float View.getTranslationX()>
		//   15   27:aload_1         
		//   16   28:invokevirtual   #32  <Method int ViewGroup.getWidth()>
		//   17   31:i2f             
		//   18   32:fadd            
		//   19   33:freturn         
			else
				return view.getTranslationX() - (float)viewgroup.getWidth();
		//   20   34:aload_2         
		//   21   35:invokevirtual   #26  <Method float View.getTranslationX()>
		//   22   38:aload_1         
		//   23   39:invokevirtual   #32  <Method int ViewGroup.getWidth()>
		//   24   42:i2f             
		//   25   43:fsub            
		//   26   44:freturn         
		}

	}
;
	private static final CalculateSlide sCalculateTop = new CalculateSlideVertical() {

		public float getGoneY(ViewGroup viewgroup, View view)
		{
			return view.getTranslationY() - (float)viewgroup.getHeight();
		//    0    0:aload_2         
		//    1    1:invokevirtual   #20  <Method float View.getTranslationY()>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #26  <Method int ViewGroup.getHeight()>
		//    4    8:i2f             
		//    5    9:fsub            
		//    6   10:freturn         
		}

	}
;
	private static final TimeInterpolator sDecelerate = new DecelerateInterpolator();
	private CalculateSlide mSlideCalculator;

	static 
	{
	//    0    0:new             #43  <Class DecelerateInterpolator>
	//    1    3:dup             
	//    2    4:invokespecial   #46  <Method void DecelerateInterpolator()>
	//    3    7:putstatic       #48  <Field TimeInterpolator sDecelerate>
	//    4   10:new             #50  <Class AccelerateInterpolator>
	//    5   13:dup             
	//    6   14:invokespecial   #51  <Method void AccelerateInterpolator()>
	//    7   17:putstatic       #53  <Field TimeInterpolator sAccelerate>
	//    8   20:new             #6   <Class Slide$1>
	//    9   23:dup             
	//   10   24:invokespecial   #54  <Method void Slide$1()>
	//   11   27:putstatic       #56  <Field Slide$CalculateSlide sCalculateLeft>
	//   12   30:new             #8   <Class Slide$2>
	//   13   33:dup             
	//   14   34:invokespecial   #57  <Method void Slide$2()>
	//   15   37:putstatic       #59  <Field Slide$CalculateSlide sCalculateStart>
	//   16   40:new             #10  <Class Slide$3>
	//   17   43:dup             
	//   18   44:invokespecial   #60  <Method void Slide$3()>
	//   19   47:putstatic       #62  <Field Slide$CalculateSlide sCalculateTop>
	//   20   50:new             #12  <Class Slide$4>
	//   21   53:dup             
	//   22   54:invokespecial   #63  <Method void Slide$4()>
	//   23   57:putstatic       #65  <Field Slide$CalculateSlide sCalculateRight>
	//   24   60:new             #14  <Class Slide$5>
	//   25   63:dup             
	//   26   64:invokespecial   #66  <Method void Slide$5()>
	//   27   67:putstatic       #68  <Field Slide$CalculateSlide sCalculateEnd>
	//   28   70:new             #16  <Class Slide$6>
	//   29   73:dup             
	//   30   74:invokespecial   #69  <Method void Slide$6()>
	//   31   77:putstatic       #71  <Field Slide$CalculateSlide sCalculateBottom>
	//*  32   80:return          
	}
}
