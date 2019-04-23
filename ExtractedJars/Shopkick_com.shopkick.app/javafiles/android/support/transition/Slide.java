// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.lang.annotation.Annotation;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package android.support.transition:
//			Visibility, Styleable, TransitionValues, TranslationAnimationCreator, 
//			SidePropagation

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


	public Slide()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method void Visibility()>
		mSlideCalculator = sCalculateBottom;
	//    2    4:aload_0         
	//    3    5:getstatic       #77  <Field Slide$CalculateSlide sCalculateBottom>
	//    4    8:putfield        #81  <Field Slide$CalculateSlide mSlideCalculator>
		mSlideEdge = 80;
	//    5   11:aload_0         
	//    6   12:bipush          80
	//    7   14:putfield        #83  <Field int mSlideEdge>
		setSlideEdge(80);
	//    8   17:aload_0         
	//    9   18:bipush          80
	//   10   20:invokevirtual   #87  <Method void setSlideEdge(int)>
	//   11   23:return          
	}

	public Slide(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method void Visibility()>
		mSlideCalculator = sCalculateBottom;
	//    2    4:aload_0         
	//    3    5:getstatic       #77  <Field Slide$CalculateSlide sCalculateBottom>
	//    4    8:putfield        #81  <Field Slide$CalculateSlide mSlideCalculator>
		mSlideEdge = 80;
	//    5   11:aload_0         
	//    6   12:bipush          80
	//    7   14:putfield        #83  <Field int mSlideEdge>
		setSlideEdge(i);
	//    8   17:aload_0         
	//    9   18:iload_1         
	//   10   19:invokevirtual   #87  <Method void setSlideEdge(int)>
	//   11   22:return          
	}

	public Slide(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #90  <Method void Visibility(Context, AttributeSet)>
		mSlideCalculator = sCalculateBottom;
	//    4    6:aload_0         
	//    5    7:getstatic       #77  <Field Slide$CalculateSlide sCalculateBottom>
	//    6   10:putfield        #81  <Field Slide$CalculateSlide mSlideCalculator>
		mSlideEdge = 80;
	//    7   13:aload_0         
	//    8   14:bipush          80
	//    9   16:putfield        #83  <Field int mSlideEdge>
		context = ((Context) (context.obtainStyledAttributes(attributeset, Styleable.SLIDE)));
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:getstatic       #96  <Field int[] Styleable.SLIDE>
	//   13   24:invokevirtual   #102 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   14   27:astore_1        
		int i = TypedArrayUtils.getNamedInt(((TypedArray) (context)), (XmlPullParser)attributeset, "slideEdge", 0, 80);
	//   15   28:aload_1         
	//   16   29:aload_2         
	//   17   30:checkcast       #104 <Class XmlPullParser>
	//   18   33:ldc1            #106 <String "slideEdge">
	//   19   35:iconst_0        
	//   20   36:bipush          80
	//   21   38:invokestatic    #112 <Method int TypedArrayUtils.getNamedInt(TypedArray, XmlPullParser, String, int, int)>
	//   22   41:istore_3        
		((TypedArray) (context)).recycle();
	//   23   42:aload_1         
	//   24   43:invokevirtual   #117 <Method void TypedArray.recycle()>
		setSlideEdge(i);
	//   25   46:aload_0         
	//   26   47:iload_3         
	//   27   48:invokevirtual   #87  <Method void setSlideEdge(int)>
	//   28   51:return          
	}

	private void captureValues(TransitionValues transitionvalues)
	{
		View view = transitionvalues.view;
	//    0    0:aload_1         
	//    1    1:getfield        #125 <Field View TransitionValues.view>
	//    2    4:astore_2        
		int ai[] = new int[2];
	//    3    5:iconst_2        
	//    4    6:newarray        int[]
	//    5    8:astore_3        
		view.getLocationOnScreen(ai);
	//    6    9:aload_2         
	//    7   10:aload_3         
	//    8   11:invokevirtual   #131 <Method void View.getLocationOnScreen(int[])>
		transitionvalues.values.put("android:slide:screenPosition", ((Object) (ai)));
	//    9   14:aload_1         
	//   10   15:getfield        #135 <Field Map TransitionValues.values>
	//   11   18:ldc1            #32  <String "android:slide:screenPosition">
	//   12   20:aload_3         
	//   13   21:invokeinterface #141 <Method Object Map.put(Object, Object)>
	//   14   26:pop             
	//   15   27:return          
	}

	public void captureEndValues(TransitionValues transitionvalues)
	{
		super.captureEndValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #145 <Method void Visibility.captureEndValues(TransitionValues)>
		captureValues(transitionvalues);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #147 <Method void captureValues(TransitionValues)>
	//    6   10:return          
	}

	public void captureStartValues(TransitionValues transitionvalues)
	{
		super.captureStartValues(transitionvalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #151 <Method void Visibility.captureStartValues(TransitionValues)>
		captureValues(transitionvalues);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #147 <Method void captureValues(TransitionValues)>
	//    6   10:return          
	}

	public int getSlideEdge()
	{
		return mSlideEdge;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field int mSlideEdge>
	//    2    4:ireturn         
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
	//    5    9:getfield        #135 <Field Map TransitionValues.values>
	//    6   12:ldc1            #32  <String "android:slide:screenPosition">
	//    7   14:invokeinterface #159 <Method Object Map.get(Object)>
	//    8   19:checkcast       #160 <Class int[]>
	//    9   22:astore_3        
			float f = view.getTranslationX();
	//   10   23:aload_2         
	//   11   24:invokevirtual   #164 <Method float View.getTranslationX()>
	//   12   27:fstore          5
			float f1 = view.getTranslationY();
	//   13   29:aload_2         
	//   14   30:invokevirtual   #167 <Method float View.getTranslationY()>
	//   15   33:fstore          6
			float f2 = mSlideCalculator.getGoneX(viewgroup, view);
	//   16   35:aload_0         
	//   17   36:getfield        #81  <Field Slide$CalculateSlide mSlideCalculator>
	//   18   39:aload_1         
	//   19   40:aload_2         
	//   20   41:invokeinterface #171 <Method float Slide$CalculateSlide.getGoneX(ViewGroup, View)>
	//   21   46:fstore          7
			float f3 = mSlideCalculator.getGoneY(viewgroup, view);
	//   22   48:aload_0         
	//   23   49:getfield        #81  <Field Slide$CalculateSlide mSlideCalculator>
	//   24   52:aload_1         
	//   25   53:aload_2         
	//   26   54:invokeinterface #174 <Method float Slide$CalculateSlide.getGoneY(ViewGroup, View)>
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
	//   40   78:getstatic       #54  <Field TimeInterpolator sDecelerate>
	//   41   81:invokestatic    #180 <Method Animator TranslationAnimationCreator.createAnimation(View, TransitionValues, int, int, float, float, float, float, TimeInterpolator)>
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
	//    5    7:getfield        #135 <Field Map TransitionValues.values>
	//    6   10:ldc1            #32  <String "android:slide:screenPosition">
	//    7   12:invokeinterface #159 <Method Object Map.get(Object)>
	//    8   17:checkcast       #160 <Class int[]>
	//    9   20:astore          4
			float f = view.getTranslationX();
	//   10   22:aload_2         
	//   11   23:invokevirtual   #164 <Method float View.getTranslationX()>
	//   12   26:fstore          5
			float f1 = view.getTranslationY();
	//   13   28:aload_2         
	//   14   29:invokevirtual   #167 <Method float View.getTranslationY()>
	//   15   32:fstore          6
			float f2 = mSlideCalculator.getGoneX(viewgroup, view);
	//   16   34:aload_0         
	//   17   35:getfield        #81  <Field Slide$CalculateSlide mSlideCalculator>
	//   18   38:aload_1         
	//   19   39:aload_2         
	//   20   40:invokeinterface #171 <Method float Slide$CalculateSlide.getGoneX(ViewGroup, View)>
	//   21   45:fstore          7
			float f3 = mSlideCalculator.getGoneY(viewgroup, view);
	//   22   47:aload_0         
	//   23   48:getfield        #81  <Field Slide$CalculateSlide mSlideCalculator>
	//   24   51:aload_1         
	//   25   52:aload_2         
	//   26   53:invokeinterface #174 <Method float Slide$CalculateSlide.getGoneY(ViewGroup, View)>
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
	//   40   78:getstatic       #59  <Field TimeInterpolator sAccelerate>
	//   41   81:invokestatic    #180 <Method Animator TranslationAnimationCreator.createAnimation(View, TransitionValues, int, int, float, float, float, float, TimeInterpolator)>
	//   42   84:areturn         
		}
	}

	public void setSlideEdge(int i)
	{
		if(i != 3)
	//*   0    0:iload_1         
	//*   1    1:iconst_3        
	//*   2    2:icmpeq          94
		{
			if(i != 5)
	//*   3    5:iload_1         
	//*   4    6:iconst_5        
	//*   5    7:icmpeq          84
			{
				if(i != 48)
	//*   6   10:iload_1         
	//*   7   11:bipush          48
	//*   8   13:icmpeq          74
				{
					if(i != 80)
	//*   9   16:iload_1         
	//*  10   17:bipush          80
	//*  11   19:icmpeq          64
					{
						if(i != 0x800003)
	//*  12   22:iload_1         
	//*  13   23:ldc1            #182 <Int 0x800003>
	//*  14   25:icmpeq          54
						{
							if(i == 0x800005)
	//*  15   28:iload_1         
	//*  16   29:ldc1            #183 <Int 0x800005>
	//*  17   31:icmpne          44
								mSlideCalculator = sCalculateEnd;
	//   18   34:aload_0         
	//   19   35:getstatic       #74  <Field Slide$CalculateSlide sCalculateEnd>
	//   20   38:putfield        #81  <Field Slide$CalculateSlide mSlideCalculator>
							else
	//*  21   41:goto            101
								throw new IllegalArgumentException("Invalid slide direction");
	//   22   44:new             #185 <Class IllegalArgumentException>
	//   23   47:dup             
	//   24   48:ldc1            #187 <String "Invalid slide direction">
	//   25   50:invokespecial   #190 <Method void IllegalArgumentException(String)>
	//   26   53:athrow          
						} else
						{
							mSlideCalculator = sCalculateStart;
	//   27   54:aload_0         
	//   28   55:getstatic       #65  <Field Slide$CalculateSlide sCalculateStart>
	//   29   58:putfield        #81  <Field Slide$CalculateSlide mSlideCalculator>
						}
					} else
	//*  30   61:goto            101
					{
						mSlideCalculator = sCalculateBottom;
	//   31   64:aload_0         
	//   32   65:getstatic       #77  <Field Slide$CalculateSlide sCalculateBottom>
	//   33   68:putfield        #81  <Field Slide$CalculateSlide mSlideCalculator>
					}
				} else
	//*  34   71:goto            101
				{
					mSlideCalculator = sCalculateTop;
	//   35   74:aload_0         
	//   36   75:getstatic       #68  <Field Slide$CalculateSlide sCalculateTop>
	//   37   78:putfield        #81  <Field Slide$CalculateSlide mSlideCalculator>
				}
			} else
	//*  38   81:goto            101
			{
				mSlideCalculator = sCalculateRight;
	//   39   84:aload_0         
	//   40   85:getstatic       #71  <Field Slide$CalculateSlide sCalculateRight>
	//   41   88:putfield        #81  <Field Slide$CalculateSlide mSlideCalculator>
			}
		} else
	//*  42   91:goto            101
		{
			mSlideCalculator = sCalculateLeft;
	//   43   94:aload_0         
	//   44   95:getstatic       #62  <Field Slide$CalculateSlide sCalculateLeft>
	//   45   98:putfield        #81  <Field Slide$CalculateSlide mSlideCalculator>
		}
		mSlideEdge = i;
	//   46  101:aload_0         
	//   47  102:iload_1         
	//   48  103:putfield        #83  <Field int mSlideEdge>
		SidePropagation sidepropagation = new SidePropagation();
	//   49  106:new             #192 <Class SidePropagation>
	//   50  109:dup             
	//   51  110:invokespecial   #193 <Method void SidePropagation()>
	//   52  113:astore_2        
		sidepropagation.setSide(i);
	//   53  114:aload_2         
	//   54  115:iload_1         
	//   55  116:invokevirtual   #196 <Method void SidePropagation.setSide(int)>
		setPropagation(((TransitionPropagation) (sidepropagation)));
	//   56  119:aload_0         
	//   57  120:aload_2         
	//   58  121:invokevirtual   #200 <Method void setPropagation(TransitionPropagation)>
	//   59  124:return          
	}

	private static final String PROPNAME_SCREEN_POSITION = "android:slide:screenPosition";
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
	private int mSlideEdge;

	static 
	{
	//    0    0:new             #49  <Class DecelerateInterpolator>
	//    1    3:dup             
	//    2    4:invokespecial   #52  <Method void DecelerateInterpolator()>
	//    3    7:putstatic       #54  <Field TimeInterpolator sDecelerate>
	//    4   10:new             #56  <Class AccelerateInterpolator>
	//    5   13:dup             
	//    6   14:invokespecial   #57  <Method void AccelerateInterpolator()>
	//    7   17:putstatic       #59  <Field TimeInterpolator sAccelerate>
	//    8   20:new             #6   <Class Slide$1>
	//    9   23:dup             
	//   10   24:invokespecial   #60  <Method void Slide$1()>
	//   11   27:putstatic       #62  <Field Slide$CalculateSlide sCalculateLeft>
	//   12   30:new             #8   <Class Slide$2>
	//   13   33:dup             
	//   14   34:invokespecial   #63  <Method void Slide$2()>
	//   15   37:putstatic       #65  <Field Slide$CalculateSlide sCalculateStart>
	//   16   40:new             #10  <Class Slide$3>
	//   17   43:dup             
	//   18   44:invokespecial   #66  <Method void Slide$3()>
	//   19   47:putstatic       #68  <Field Slide$CalculateSlide sCalculateTop>
	//   20   50:new             #12  <Class Slide$4>
	//   21   53:dup             
	//   22   54:invokespecial   #69  <Method void Slide$4()>
	//   23   57:putstatic       #71  <Field Slide$CalculateSlide sCalculateRight>
	//   24   60:new             #14  <Class Slide$5>
	//   25   63:dup             
	//   26   64:invokespecial   #72  <Method void Slide$5()>
	//   27   67:putstatic       #74  <Field Slide$CalculateSlide sCalculateEnd>
	//   28   70:new             #16  <Class Slide$6>
	//   29   73:dup             
	//   30   74:invokespecial   #75  <Method void Slide$6()>
	//   31   77:putstatic       #77  <Field Slide$CalculateSlide sCalculateBottom>
	//*  32   80:return          
	}
}
