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
			transitionvalues = ((TransitionValues) ((int[])(int[])transitionvalues1.values.get("android:slide:screenPosition")));
	//    4    7:aload           4
	//    5    9:getfield        #135 <Field Map TransitionValues.values>
	//    6   12:ldc1            #32  <String "android:slide:screenPosition">
	//    7   14:invokeinterface #159 <Method Object Map.get(Object)>
	//    8   19:checkcast       #160 <Class int[]>
	//    9   22:checkcast       #160 <Class int[]>
	//   10   25:astore_3        
			float f = view.getTranslationX();
	//   11   26:aload_2         
	//   12   27:invokevirtual   #164 <Method float View.getTranslationX()>
	//   13   30:fstore          5
			float f1 = view.getTranslationY();
	//   14   32:aload_2         
	//   15   33:invokevirtual   #167 <Method float View.getTranslationY()>
	//   16   36:fstore          6
			float f2 = mSlideCalculator.getGoneX(viewgroup, view);
	//   17   38:aload_0         
	//   18   39:getfield        #81  <Field Slide$CalculateSlide mSlideCalculator>
	//   19   42:aload_1         
	//   20   43:aload_2         
	//   21   44:invokeinterface #171 <Method float Slide$CalculateSlide.getGoneX(ViewGroup, View)>
	//   22   49:fstore          7
			float f3 = mSlideCalculator.getGoneY(viewgroup, view);
	//   23   51:aload_0         
	//   24   52:getfield        #81  <Field Slide$CalculateSlide mSlideCalculator>
	//   25   55:aload_1         
	//   26   56:aload_2         
	//   27   57:invokeinterface #174 <Method float Slide$CalculateSlide.getGoneY(ViewGroup, View)>
	//   28   62:fstore          8
			return TranslationAnimationCreator.createAnimation(view, transitionvalues1, transitionvalues[0], transitionvalues[1], f2, f3, f, f1, sDecelerate);
	//   29   64:aload_2         
	//   30   65:aload           4
	//   31   67:aload_3         
	//   32   68:iconst_0        
	//   33   69:iaload          
	//   34   70:aload_3         
	//   35   71:iconst_1        
	//   36   72:iaload          
	//   37   73:fload           7
	//   38   75:fload           8
	//   39   77:fload           5
	//   40   79:fload           6
	//   41   81:getstatic       #54  <Field TimeInterpolator sDecelerate>
	//   42   84:invokestatic    #180 <Method Animator TranslationAnimationCreator.createAnimation(View, TransitionValues, int, int, float, float, float, float, TimeInterpolator)>
	//   43   87:areturn         
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
			transitionvalues1 = ((TransitionValues) ((int[])(int[])transitionvalues.values.get("android:slide:screenPosition")));
	//    4    6:aload_3         
	//    5    7:getfield        #135 <Field Map TransitionValues.values>
	//    6   10:ldc1            #32  <String "android:slide:screenPosition">
	//    7   12:invokeinterface #159 <Method Object Map.get(Object)>
	//    8   17:checkcast       #160 <Class int[]>
	//    9   20:checkcast       #160 <Class int[]>
	//   10   23:astore          4
			float f = view.getTranslationX();
	//   11   25:aload_2         
	//   12   26:invokevirtual   #164 <Method float View.getTranslationX()>
	//   13   29:fstore          5
			float f1 = view.getTranslationY();
	//   14   31:aload_2         
	//   15   32:invokevirtual   #167 <Method float View.getTranslationY()>
	//   16   35:fstore          6
			float f2 = mSlideCalculator.getGoneX(viewgroup, view);
	//   17   37:aload_0         
	//   18   38:getfield        #81  <Field Slide$CalculateSlide mSlideCalculator>
	//   19   41:aload_1         
	//   20   42:aload_2         
	//   21   43:invokeinterface #171 <Method float Slide$CalculateSlide.getGoneX(ViewGroup, View)>
	//   22   48:fstore          7
			float f3 = mSlideCalculator.getGoneY(viewgroup, view);
	//   23   50:aload_0         
	//   24   51:getfield        #81  <Field Slide$CalculateSlide mSlideCalculator>
	//   25   54:aload_1         
	//   26   55:aload_2         
	//   27   56:invokeinterface #174 <Method float Slide$CalculateSlide.getGoneY(ViewGroup, View)>
	//   28   61:fstore          8
			return TranslationAnimationCreator.createAnimation(view, transitionvalues, transitionvalues1[0], transitionvalues1[1], f, f1, f2, f3, sAccelerate);
	//   29   63:aload_2         
	//   30   64:aload_3         
	//   31   65:aload           4
	//   32   67:iconst_0        
	//   33   68:iaload          
	//   34   69:aload           4
	//   35   71:iconst_1        
	//   36   72:iaload          
	//   37   73:fload           5
	//   38   75:fload           6
	//   39   77:fload           7
	//   40   79:fload           8
	//   41   81:getstatic       #59  <Field TimeInterpolator sAccelerate>
	//   42   84:invokestatic    #180 <Method Animator TranslationAnimationCreator.createAnimation(View, TransitionValues, int, int, float, float, float, float, TimeInterpolator)>
	//   43   87:areturn         
		}
	}

	public void setSlideEdge(int i)
	{
		i;
	//    0    0:iload_1         
		JVM INSTR lookupswitch 6: default 60
	//	               3: 70
	//	               5: 111
	//	               48: 101
	//	               80: 121
	//	               8388611: 131
	//	               8388613: 141;
	//    1    1:lookupswitch    6: default 60
	//	               3: 70
	//	               5: 111
	//	               48: 101
	//	               80: 121
	//	               8388611: 131
	//	               8388613: 141
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
		throw new IllegalArgumentException("Invalid slide direction");
	//    2   60:new             #183 <Class IllegalArgumentException>
	//    3   63:dup             
	//    4   64:ldc1            #185 <String "Invalid slide direction">
	//    5   66:invokespecial   #188 <Method void IllegalArgumentException(String)>
	//    6   69:athrow          
_L2:
		mSlideCalculator = sCalculateLeft;
	//    7   70:aload_0         
	//    8   71:getstatic       #62  <Field Slide$CalculateSlide sCalculateLeft>
	//    9   74:putfield        #81  <Field Slide$CalculateSlide mSlideCalculator>
_L9:
		mSlideEdge = i;
	//   10   77:aload_0         
	//   11   78:iload_1         
	//   12   79:putfield        #83  <Field int mSlideEdge>
		SidePropagation sidepropagation = new SidePropagation();
	//   13   82:new             #190 <Class SidePropagation>
	//   14   85:dup             
	//   15   86:invokespecial   #191 <Method void SidePropagation()>
	//   16   89:astore_2        
		sidepropagation.setSide(i);
	//   17   90:aload_2         
	//   18   91:iload_1         
	//   19   92:invokevirtual   #194 <Method void SidePropagation.setSide(int)>
		setPropagation(((TransitionPropagation) (sidepropagation)));
	//   20   95:aload_0         
	//   21   96:aload_2         
	//   22   97:invokevirtual   #198 <Method void setPropagation(TransitionPropagation)>
		return;
	//   23  100:return          
_L4:
		mSlideCalculator = sCalculateTop;
	//   24  101:aload_0         
	//   25  102:getstatic       #68  <Field Slide$CalculateSlide sCalculateTop>
	//   26  105:putfield        #81  <Field Slide$CalculateSlide mSlideCalculator>
		continue; /* Loop/switch isn't completed */
	//   27  108:goto            77
_L3:
		mSlideCalculator = sCalculateRight;
	//   28  111:aload_0         
	//   29  112:getstatic       #71  <Field Slide$CalculateSlide sCalculateRight>
	//   30  115:putfield        #81  <Field Slide$CalculateSlide mSlideCalculator>
		continue; /* Loop/switch isn't completed */
	//   31  118:goto            77
_L5:
		mSlideCalculator = sCalculateBottom;
	//   32  121:aload_0         
	//   33  122:getstatic       #77  <Field Slide$CalculateSlide sCalculateBottom>
	//   34  125:putfield        #81  <Field Slide$CalculateSlide mSlideCalculator>
		continue; /* Loop/switch isn't completed */
	//   35  128:goto            77
_L6:
		mSlideCalculator = sCalculateStart;
	//   36  131:aload_0         
	//   37  132:getstatic       #65  <Field Slide$CalculateSlide sCalculateStart>
	//   38  135:putfield        #81  <Field Slide$CalculateSlide mSlideCalculator>
		continue; /* Loop/switch isn't completed */
	//   39  138:goto            77
_L7:
		mSlideCalculator = sCalculateEnd;
	//   40  141:aload_0         
	//   41  142:getstatic       #74  <Field Slide$CalculateSlide sCalculateEnd>
	//   42  145:putfield        #81  <Field Slide$CalculateSlide mSlideCalculator>
		if(true) goto _L9; else goto _L8
	//   43  148:goto            77
_L8:
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
			boolean flag = true;
		//    0    0:iconst_1        
		//    1    1:istore_3        
			if(ViewCompat.getLayoutDirection(((View) (viewgroup))) != 1)
		//*   2    2:aload_1         
		//*   3    3:invokestatic    #20  <Method int ViewCompat.getLayoutDirection(View)>
		//*   4    6:iconst_1        
		//*   5    7:icmpne          25
		//*   6   10:iload_3         
		//*   7   11:ifeq            30
		//*   8   14:aload_2         
		//*   9   15:invokevirtual   #26  <Method float View.getTranslationX()>
		//*  10   18:aload_1         
		//*  11   19:invokevirtual   #32  <Method int ViewGroup.getWidth()>
		//*  12   22:i2f             
		//*  13   23:fsub            
		//*  14   24:freturn         
				flag = false;
		//   15   25:iconst_0        
		//   16   26:istore_3        
			if(flag)
				return view.getTranslationX() - (float)viewgroup.getWidth();
			else
		//*  17   27:goto            10
				return view.getTranslationX() + (float)viewgroup.getWidth();
		//   18   30:aload_2         
		//   19   31:invokevirtual   #26  <Method float View.getTranslationX()>
		//   20   34:aload_1         
		//   21   35:invokevirtual   #32  <Method int ViewGroup.getWidth()>
		//   22   38:i2f             
		//   23   39:fadd            
		//   24   40:freturn         
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
			boolean flag = true;
		//    0    0:iconst_1        
		//    1    1:istore_3        
			if(ViewCompat.getLayoutDirection(((View) (viewgroup))) != 1)
		//*   2    2:aload_1         
		//*   3    3:invokestatic    #20  <Method int ViewCompat.getLayoutDirection(View)>
		//*   4    6:iconst_1        
		//*   5    7:icmpne          25
		//*   6   10:iload_3         
		//*   7   11:ifeq            30
		//*   8   14:aload_2         
		//*   9   15:invokevirtual   #26  <Method float View.getTranslationX()>
		//*  10   18:aload_1         
		//*  11   19:invokevirtual   #32  <Method int ViewGroup.getWidth()>
		//*  12   22:i2f             
		//*  13   23:fadd            
		//*  14   24:freturn         
				flag = false;
		//   15   25:iconst_0        
		//   16   26:istore_3        
			if(flag)
				return view.getTranslationX() + (float)viewgroup.getWidth();
			else
		//*  17   27:goto            10
				return view.getTranslationX() - (float)viewgroup.getWidth();
		//   18   30:aload_2         
		//   19   31:invokevirtual   #26  <Method float View.getTranslationX()>
		//   20   34:aload_1         
		//   21   35:invokevirtual   #32  <Method int ViewGroup.getWidth()>
		//   22   38:i2f             
		//   23   39:fsub            
		//   24   40:freturn         
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
