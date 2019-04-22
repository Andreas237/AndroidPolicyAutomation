// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.transformation;

import android.animation.*;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.design.animation.*;
import android.support.design.circularreveal.*;
import android.support.design.widget.*;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.Property;
import android.view.*;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.design.transformation:
//			ExpandableTransformationBehavior, TransformationChildLayout, TransformationChildCard

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior
{
	protected static class FabTransformationSpec
	{

		public Positioning positioning;
		public MotionSpec timings;

		protected FabTransformationSpec()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:return          
		}
	}


	public FabTransformationBehavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void ExpandableTransformationBehavior()>
		tmpRect = new Rect();
	//    2    4:aload_0         
	//    3    5:new             #28  <Class Rect>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void Rect()>
	//    6   12:putfield        #31  <Field Rect tmpRect>
		tmpRectF1 = new RectF();
	//    7   15:aload_0         
	//    8   16:new             #33  <Class RectF>
	//    9   19:dup             
	//   10   20:invokespecial   #34  <Method void RectF()>
	//   11   23:putfield        #36  <Field RectF tmpRectF1>
		tmpRectF2 = new RectF();
	//   12   26:aload_0         
	//   13   27:new             #33  <Class RectF>
	//   14   30:dup             
	//   15   31:invokespecial   #34  <Method void RectF()>
	//   16   34:putfield        #38  <Field RectF tmpRectF2>
		tmpArray = new int[2];
	//   17   37:aload_0         
	//   18   38:iconst_2        
	//   19   39:newarray        int[]
	//   20   41:putfield        #40  <Field int[] tmpArray>
	//   21   44:return          
	}

	public FabTransformationBehavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #44  <Method void ExpandableTransformationBehavior(Context, AttributeSet)>
		tmpRect = new Rect();
	//    4    6:aload_0         
	//    5    7:new             #28  <Class Rect>
	//    6   10:dup             
	//    7   11:invokespecial   #29  <Method void Rect()>
	//    8   14:putfield        #31  <Field Rect tmpRect>
		tmpRectF1 = new RectF();
	//    9   17:aload_0         
	//   10   18:new             #33  <Class RectF>
	//   11   21:dup             
	//   12   22:invokespecial   #34  <Method void RectF()>
	//   13   25:putfield        #36  <Field RectF tmpRectF1>
		tmpRectF2 = new RectF();
	//   14   28:aload_0         
	//   15   29:new             #33  <Class RectF>
	//   16   32:dup             
	//   17   33:invokespecial   #34  <Method void RectF()>
	//   18   36:putfield        #38  <Field RectF tmpRectF2>
		tmpArray = new int[2];
	//   19   39:aload_0         
	//   20   40:iconst_2        
	//   21   41:newarray        int[]
	//   22   43:putfield        #40  <Field int[] tmpArray>
	//   23   46:return          
	}

	private ViewGroup calculateChildContentContainer(View view)
	{
		View view1 = view.findViewById(android.support.design.R.id.mtrl_child_content_container);
	//    0    0:aload_1         
	//    1    1:getstatic       #53  <Field int android.support.design.R$id.mtrl_child_content_container>
	//    2    4:invokevirtual   #59  <Method View View.findViewById(int)>
	//    3    7:astore_2        
		if(view1 != null)
	//*   4    8:aload_2         
	//*   5    9:ifnull          18
			return toViewGroupOrNull(view1);
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:invokespecial   #62  <Method ViewGroup toViewGroupOrNull(View)>
	//    9   17:areturn         
		if(!(view instanceof TransformationChildLayout) && !(view instanceof TransformationChildCard))
	//*  10   18:aload_1         
	//*  11   19:instanceof      #64  <Class TransformationChildLayout>
	//*  12   22:ifne            41
	//*  13   25:aload_1         
	//*  14   26:instanceof      #66  <Class TransformationChildCard>
	//*  15   29:ifeq            35
	//*  16   32:goto            41
			return toViewGroupOrNull(view);
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:invokespecial   #62  <Method ViewGroup toViewGroupOrNull(View)>
	//   20   40:areturn         
		else
			return toViewGroupOrNull(((ViewGroup)view).getChildAt(0));
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:checkcast       #68  <Class ViewGroup>
	//   24   46:iconst_0        
	//   25   47:invokevirtual   #71  <Method View ViewGroup.getChildAt(int)>
	//   26   50:invokespecial   #62  <Method ViewGroup toViewGroupOrNull(View)>
	//   27   53:areturn         
	}

	private void calculateChildVisibleBoundsAtEndOfExpansion(View view, FabTransformationSpec fabtransformationspec, MotionTiming motiontiming, MotionTiming motiontiming1, float f, float f1, float f2, 
			float f3, RectF rectf)
	{
		f = calculateValueOfAnimationAtEndOfExpansion(fabtransformationspec, motiontiming, f, f2);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:fload           5
	//    4    5:fload           7
	//    5    7:invokespecial   #78  <Method float calculateValueOfAnimationAtEndOfExpansion(FabTransformationBehavior$FabTransformationSpec, MotionTiming, float, float)>
	//    6   10:fstore          5
		f1 = calculateValueOfAnimationAtEndOfExpansion(fabtransformationspec, motiontiming1, f1, f3);
	//    7   12:aload_0         
	//    8   13:aload_2         
	//    9   14:aload           4
	//   10   16:fload           6
	//   11   18:fload           8
	//   12   20:invokespecial   #78  <Method float calculateValueOfAnimationAtEndOfExpansion(FabTransformationBehavior$FabTransformationSpec, MotionTiming, float, float)>
	//   13   23:fstore          6
		motiontiming = ((MotionTiming) (tmpRect));
	//   14   25:aload_0         
	//   15   26:getfield        #31  <Field Rect tmpRect>
	//   16   29:astore_3        
		view.getWindowVisibleDisplayFrame(((Rect) (motiontiming)));
	//   17   30:aload_1         
	//   18   31:aload_3         
	//   19   32:invokevirtual   #82  <Method void View.getWindowVisibleDisplayFrame(Rect)>
		fabtransformationspec = ((FabTransformationSpec) (tmpRectF1));
	//   20   35:aload_0         
	//   21   36:getfield        #36  <Field RectF tmpRectF1>
	//   22   39:astore_2        
		((RectF) (fabtransformationspec)).set(((Rect) (motiontiming)));
	//   23   40:aload_2         
	//   24   41:aload_3         
	//   25   42:invokevirtual   #85  <Method void RectF.set(Rect)>
		motiontiming = ((MotionTiming) (tmpRectF2));
	//   26   45:aload_0         
	//   27   46:getfield        #38  <Field RectF tmpRectF2>
	//   28   49:astore_3        
		calculateWindowBounds(view, ((RectF) (motiontiming)));
	//   29   50:aload_0         
	//   30   51:aload_1         
	//   31   52:aload_3         
	//   32   53:invokespecial   #89  <Method void calculateWindowBounds(View, RectF)>
		((RectF) (motiontiming)).offset(f, f1);
	//   33   56:aload_3         
	//   34   57:fload           5
	//   35   59:fload           6
	//   36   61:invokevirtual   #93  <Method void RectF.offset(float, float)>
		((RectF) (motiontiming)).intersect(((RectF) (fabtransformationspec)));
	//   37   64:aload_3         
	//   38   65:aload_2         
	//   39   66:invokevirtual   #97  <Method boolean RectF.intersect(RectF)>
	//   40   69:pop             
		rectf.set(((RectF) (motiontiming)));
	//   41   70:aload           9
	//   42   72:aload_3         
	//   43   73:invokevirtual   #100 <Method void RectF.set(RectF)>
	//   44   76:return          
	}

	private float calculateRevealCenterX(View view, View view1, Positioning positioning)
	{
		RectF rectf = tmpRectF1;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field RectF tmpRectF1>
	//    2    4:astore          4
		RectF rectf1 = tmpRectF2;
	//    3    6:aload_0         
	//    4    7:getfield        #38  <Field RectF tmpRectF2>
	//    5   10:astore          5
		calculateWindowBounds(view, rectf);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload           4
	//    9   16:invokespecial   #89  <Method void calculateWindowBounds(View, RectF)>
		calculateWindowBounds(view1, rectf1);
	//   10   19:aload_0         
	//   11   20:aload_2         
	//   12   21:aload           5
	//   13   23:invokespecial   #89  <Method void calculateWindowBounds(View, RectF)>
		rectf1.offset(-calculateTranslationX(view, view1, positioning), 0.0F);
	//   14   26:aload           5
	//   15   28:aload_0         
	//   16   29:aload_1         
	//   17   30:aload_2         
	//   18   31:aload_3         
	//   19   32:invokespecial   #105 <Method float calculateTranslationX(View, View, Positioning)>
	//   20   35:fneg            
	//   21   36:fconst_0        
	//   22   37:invokevirtual   #93  <Method void RectF.offset(float, float)>
		return rectf.centerX() - rectf1.left;
	//   23   40:aload           4
	//   24   42:invokevirtual   #109 <Method float RectF.centerX()>
	//   25   45:aload           5
	//   26   47:getfield        #113 <Field float RectF.left>
	//   27   50:fsub            
	//   28   51:freturn         
	}

	private float calculateRevealCenterY(View view, View view1, Positioning positioning)
	{
		RectF rectf = tmpRectF1;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field RectF tmpRectF1>
	//    2    4:astore          4
		RectF rectf1 = tmpRectF2;
	//    3    6:aload_0         
	//    4    7:getfield        #38  <Field RectF tmpRectF2>
	//    5   10:astore          5
		calculateWindowBounds(view, rectf);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload           4
	//    9   16:invokespecial   #89  <Method void calculateWindowBounds(View, RectF)>
		calculateWindowBounds(view1, rectf1);
	//   10   19:aload_0         
	//   11   20:aload_2         
	//   12   21:aload           5
	//   13   23:invokespecial   #89  <Method void calculateWindowBounds(View, RectF)>
		rectf1.offset(0.0F, -calculateTranslationY(view, view1, positioning));
	//   14   26:aload           5
	//   15   28:fconst_0        
	//   16   29:aload_0         
	//   17   30:aload_1         
	//   18   31:aload_2         
	//   19   32:aload_3         
	//   20   33:invokespecial   #117 <Method float calculateTranslationY(View, View, Positioning)>
	//   21   36:fneg            
	//   22   37:invokevirtual   #93  <Method void RectF.offset(float, float)>
		return rectf.centerY() - rectf1.top;
	//   23   40:aload           4
	//   24   42:invokevirtual   #120 <Method float RectF.centerY()>
	//   25   45:aload           5
	//   26   47:getfield        #123 <Field float RectF.top>
	//   27   50:fsub            
	//   28   51:freturn         
	}

	private float calculateTranslationX(View view, View view1, Positioning positioning)
	{
		RectF rectf = tmpRectF1;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field RectF tmpRectF1>
	//    2    4:astore          6
		RectF rectf1 = tmpRectF2;
	//    3    6:aload_0         
	//    4    7:getfield        #38  <Field RectF tmpRectF2>
	//    5   10:astore          7
		calculateWindowBounds(view, rectf);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload           6
	//    9   16:invokespecial   #89  <Method void calculateWindowBounds(View, RectF)>
		calculateWindowBounds(view1, rectf1);
	//   10   19:aload_0         
	//   11   20:aload_2         
	//   12   21:aload           7
	//   13   23:invokespecial   #89  <Method void calculateWindowBounds(View, RectF)>
		int i = positioning.gravity & 7;
	//   14   26:aload_3         
	//   15   27:getfield        #128 <Field int Positioning.gravity>
	//   16   30:bipush          7
	//   17   32:iand            
	//   18   33:istore          5
		float f;
		if(i != 1)
	//*  19   35:iload           5
	//*  20   37:iconst_1        
	//*  21   38:icmpeq          91
		{
			if(i != 3)
	//*  22   41:iload           5
	//*  23   43:iconst_3        
	//*  24   44:icmpeq          75
			{
				if(i != 5)
	//*  25   47:iload           5
	//*  26   49:iconst_5        
	//*  27   50:icmpeq          59
					f = 0.0F;
	//   28   53:fconst_0        
	//   29   54:fstore          4
				else
	//*  30   56:goto            104
					f = rectf1.right - rectf.right;
	//   31   59:aload           7
	//   32   61:getfield        #131 <Field float RectF.right>
	//   33   64:aload           6
	//   34   66:getfield        #131 <Field float RectF.right>
	//   35   69:fsub            
	//   36   70:fstore          4
			} else
	//*  37   72:goto            104
			{
				f = rectf1.left - rectf.left;
	//   38   75:aload           7
	//   39   77:getfield        #113 <Field float RectF.left>
	//   40   80:aload           6
	//   41   82:getfield        #113 <Field float RectF.left>
	//   42   85:fsub            
	//   43   86:fstore          4
			}
		} else
	//*  44   88:goto            104
		{
			f = rectf1.centerX() - rectf.centerX();
	//   45   91:aload           7
	//   46   93:invokevirtual   #109 <Method float RectF.centerX()>
	//   47   96:aload           6
	//   48   98:invokevirtual   #109 <Method float RectF.centerX()>
	//   49  101:fsub            
	//   50  102:fstore          4
		}
		return f + positioning.xAdjustment;
	//   51  104:fload           4
	//   52  106:aload_3         
	//   53  107:getfield        #134 <Field float Positioning.xAdjustment>
	//   54  110:fadd            
	//   55  111:freturn         
	}

	private float calculateTranslationY(View view, View view1, Positioning positioning)
	{
		RectF rectf = tmpRectF1;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field RectF tmpRectF1>
	//    2    4:astore          6
		RectF rectf1 = tmpRectF2;
	//    3    6:aload_0         
	//    4    7:getfield        #38  <Field RectF tmpRectF2>
	//    5   10:astore          7
		calculateWindowBounds(view, rectf);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload           6
	//    9   16:invokespecial   #89  <Method void calculateWindowBounds(View, RectF)>
		calculateWindowBounds(view1, rectf1);
	//   10   19:aload_0         
	//   11   20:aload_2         
	//   12   21:aload           7
	//   13   23:invokespecial   #89  <Method void calculateWindowBounds(View, RectF)>
		int i = positioning.gravity & 0x70;
	//   14   26:aload_3         
	//   15   27:getfield        #128 <Field int Positioning.gravity>
	//   16   30:bipush          112
	//   17   32:iand            
	//   18   33:istore          5
		float f;
		if(i != 16)
	//*  19   35:iload           5
	//*  20   37:bipush          16
	//*  21   39:icmpeq          94
		{
			if(i != 48)
	//*  22   42:iload           5
	//*  23   44:bipush          48
	//*  24   46:icmpeq          78
			{
				if(i != 80)
	//*  25   49:iload           5
	//*  26   51:bipush          80
	//*  27   53:icmpeq          62
					f = 0.0F;
	//   28   56:fconst_0        
	//   29   57:fstore          4
				else
	//*  30   59:goto            107
					f = rectf1.bottom - rectf.bottom;
	//   31   62:aload           7
	//   32   64:getfield        #137 <Field float RectF.bottom>
	//   33   67:aload           6
	//   34   69:getfield        #137 <Field float RectF.bottom>
	//   35   72:fsub            
	//   36   73:fstore          4
			} else
	//*  37   75:goto            107
			{
				f = rectf1.top - rectf.top;
	//   38   78:aload           7
	//   39   80:getfield        #123 <Field float RectF.top>
	//   40   83:aload           6
	//   41   85:getfield        #123 <Field float RectF.top>
	//   42   88:fsub            
	//   43   89:fstore          4
			}
		} else
	//*  44   91:goto            107
		{
			f = rectf1.centerY() - rectf.centerY();
	//   45   94:aload           7
	//   46   96:invokevirtual   #120 <Method float RectF.centerY()>
	//   47   99:aload           6
	//   48  101:invokevirtual   #120 <Method float RectF.centerY()>
	//   49  104:fsub            
	//   50  105:fstore          4
		}
		return f + positioning.yAdjustment;
	//   51  107:fload           4
	//   52  109:aload_3         
	//   53  110:getfield        #140 <Field float Positioning.yAdjustment>
	//   54  113:fadd            
	//   55  114:freturn         
	}

	private float calculateValueOfAnimationAtEndOfExpansion(FabTransformationSpec fabtransformationspec, MotionTiming motiontiming, float f, float f1)
	{
		long l = motiontiming.getDelay();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #146 <Method long MotionTiming.getDelay()>
	//    2    4:lstore          6
		long l1 = motiontiming.getDuration();
	//    3    6:aload_2         
	//    4    7:invokevirtual   #149 <Method long MotionTiming.getDuration()>
	//    5   10:lstore          8
		fabtransformationspec = ((FabTransformationSpec) (fabtransformationspec.timings.getTiming("expansion")));
	//    6   12:aload_1         
	//    7   13:getfield        #153 <Field MotionSpec FabTransformationBehavior$FabTransformationSpec.timings>
	//    8   16:ldc1            #155 <String "expansion">
	//    9   18:invokevirtual   #161 <Method MotionTiming MotionSpec.getTiming(String)>
	//   10   21:astore_1        
		float f2 = (float)((((MotionTiming) (fabtransformationspec)).getDelay() + ((MotionTiming) (fabtransformationspec)).getDuration() + 17L) - l) / (float)l1;
	//   11   22:aload_1         
	//   12   23:invokevirtual   #146 <Method long MotionTiming.getDelay()>
	//   13   26:aload_1         
	//   14   27:invokevirtual   #149 <Method long MotionTiming.getDuration()>
	//   15   30:ladd            
	//   16   31:ldc2w           #162 <Long 17L>
	//   17   34:ladd            
	//   18   35:lload           6
	//   19   37:lsub            
	//   20   38:l2f             
	//   21   39:lload           8
	//   22   41:l2f             
	//   23   42:fdiv            
	//   24   43:fstore          5
		return AnimationUtils.lerp(f, f1, motiontiming.getInterpolator().getInterpolation(f2));
	//   25   45:fload_3         
	//   26   46:fload           4
	//   27   48:aload_2         
	//   28   49:invokevirtual   #167 <Method TimeInterpolator MotionTiming.getInterpolator()>
	//   29   52:fload           5
	//   30   54:invokeinterface #173 <Method float TimeInterpolator.getInterpolation(float)>
	//   31   59:invokestatic    #179 <Method float AnimationUtils.lerp(float, float, float)>
	//   32   62:freturn         
	}

	private void calculateWindowBounds(View view, RectF rectf)
	{
		rectf.set(0.0F, 0.0F, view.getWidth(), view.getHeight());
	//    0    0:aload_2         
	//    1    1:fconst_0        
	//    2    2:fconst_0        
	//    3    3:aload_1         
	//    4    4:invokevirtual   #183 <Method int View.getWidth()>
	//    5    7:i2f             
	//    6    8:aload_1         
	//    7    9:invokevirtual   #186 <Method int View.getHeight()>
	//    8   12:i2f             
	//    9   13:invokevirtual   #189 <Method void RectF.set(float, float, float, float)>
		int ai[] = tmpArray;
	//   10   16:aload_0         
	//   11   17:getfield        #40  <Field int[] tmpArray>
	//   12   20:astore_3        
		view.getLocationInWindow(ai);
	//   13   21:aload_1         
	//   14   22:aload_3         
	//   15   23:invokevirtual   #193 <Method void View.getLocationInWindow(int[])>
		rectf.offsetTo(ai[0], ai[1]);
	//   16   26:aload_2         
	//   17   27:aload_3         
	//   18   28:iconst_0        
	//   19   29:iaload          
	//   20   30:i2f             
	//   21   31:aload_3         
	//   22   32:iconst_1        
	//   23   33:iaload          
	//   24   34:i2f             
	//   25   35:invokevirtual   #196 <Method void RectF.offsetTo(float, float)>
		rectf.offset((int)(-view.getTranslationX()), (int)(-view.getTranslationY()));
	//   26   38:aload_2         
	//   27   39:aload_1         
	//   28   40:invokevirtual   #199 <Method float View.getTranslationX()>
	//   29   43:fneg            
	//   30   44:f2i             
	//   31   45:i2f             
	//   32   46:aload_1         
	//   33   47:invokevirtual   #202 <Method float View.getTranslationY()>
	//   34   50:fneg            
	//   35   51:f2i             
	//   36   52:i2f             
	//   37   53:invokevirtual   #93  <Method void RectF.offset(float, float)>
	//   38   56:return          
	}

	private void createChildrenFadeAnimation(View view, View view1, boolean flag, boolean flag1, FabTransformationSpec fabtransformationspec, List list, List list1)
	{
		if(!(view1 instanceof ViewGroup))
	//*   0    0:aload_2         
	//*   1    1:instanceof      #68  <Class ViewGroup>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if((view1 instanceof CircularRevealWidget) && CircularRevealHelper.STRATEGY == 0)
	//*   4    8:aload_2         
	//*   5    9:instanceof      #206 <Class CircularRevealWidget>
	//*   6   12:ifeq            22
	//*   7   15:getstatic       #211 <Field int CircularRevealHelper.STRATEGY>
	//*   8   18:ifne            22
			return;
	//    9   21:return          
		view = ((View) (calculateChildContentContainer(view1)));
	//   10   22:aload_0         
	//   11   23:aload_2         
	//   12   24:invokespecial   #213 <Method ViewGroup calculateChildContentContainer(View)>
	//   13   27:astore_1        
		if(view == null)
	//*  14   28:aload_1         
	//*  15   29:ifnonnull       33
			return;
	//   16   32:return          
		if(flag)
	//*  17   33:iload_3         
	//*  18   34:ifeq            71
		{
			if(!flag1)
	//*  19   37:iload           4
	//*  20   39:ifne            53
				ChildrenAlphaProperty.CHILDREN_ALPHA.set(((Object) (view)), ((Object) (Float.valueOf(0.0F))));
	//   21   42:getstatic       #219 <Field Property ChildrenAlphaProperty.CHILDREN_ALPHA>
	//   22   45:aload_1         
	//   23   46:fconst_0        
	//   24   47:invokestatic    #225 <Method Float Float.valueOf(float)>
	//   25   50:invokevirtual   #230 <Method void Property.set(Object, Object)>
			view = ((View) (ObjectAnimator.ofFloat(((Object) (view)), ChildrenAlphaProperty.CHILDREN_ALPHA, new float[] {
				1.0F
			})));
	//   26   53:aload_1         
	//   27   54:getstatic       #219 <Field Property ChildrenAlphaProperty.CHILDREN_ALPHA>
	//   28   57:iconst_1        
	//   29   58:newarray        float[]
	//   30   60:dup             
	//   31   61:iconst_0        
	//   32   62:fconst_1        
	//   33   63:fastore         
	//   34   64:invokestatic    #236 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, Property, float[])>
	//   35   67:astore_1        
		} else
	//*  36   68:goto            86
		{
			view = ((View) (ObjectAnimator.ofFloat(((Object) (view)), ChildrenAlphaProperty.CHILDREN_ALPHA, new float[] {
				0.0F
			})));
	//   37   71:aload_1         
	//   38   72:getstatic       #219 <Field Property ChildrenAlphaProperty.CHILDREN_ALPHA>
	//   39   75:iconst_1        
	//   40   76:newarray        float[]
	//   41   78:dup             
	//   42   79:iconst_0        
	//   43   80:fconst_0        
	//   44   81:fastore         
	//   45   82:invokestatic    #236 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, Property, float[])>
	//   46   85:astore_1        
		}
		fabtransformationspec.timings.getTiming("contentFade").apply(((Animator) (view)));
	//   47   86:aload           5
	//   48   88:getfield        #153 <Field MotionSpec FabTransformationBehavior$FabTransformationSpec.timings>
	//   49   91:ldc1            #238 <String "contentFade">
	//   50   93:invokevirtual   #161 <Method MotionTiming MotionSpec.getTiming(String)>
	//   51   96:aload_1         
	//   52   97:invokevirtual   #242 <Method void MotionTiming.apply(Animator)>
		list.add(((Object) (view)));
	//   53  100:aload           6
	//   54  102:aload_1         
	//   55  103:invokeinterface #248 <Method boolean List.add(Object)>
	//   56  108:pop             
	//   57  109:return          
	}

	private void createColorAnimation(View view, View view1, boolean flag, boolean flag1, FabTransformationSpec fabtransformationspec, List list, List list1)
	{
		if(!(view1 instanceof CircularRevealWidget))
	//*   0    0:aload_2         
	//*   1    1:instanceof      #206 <Class CircularRevealWidget>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		view1 = ((View) ((CircularRevealWidget)view1));
	//    4    8:aload_2         
	//    5    9:checkcast       #206 <Class CircularRevealWidget>
	//    6   12:astore_2        
		int i = getBackgroundTint(view);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #255 <Method int getBackgroundTint(View)>
	//   10   18:istore          8
		if(flag)
	//*  11   20:iload_3         
	//*  12   21:ifeq            60
		{
			if(!flag1)
	//*  13   24:iload           4
	//*  14   26:ifne            37
				((CircularRevealWidget) (view1)).setCircularRevealScrimColor(i);
	//   15   29:aload_2         
	//   16   30:iload           8
	//   17   32:invokeinterface #259 <Method void CircularRevealWidget.setCircularRevealScrimColor(int)>
			view = ((View) (ObjectAnimator.ofInt(((Object) (view1)), android.support.design.circularreveal.CircularRevealWidget.CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR, new int[] {
				0xffffff & i
			})));
	//   18   37:aload_2         
	//   19   38:getstatic       #264 <Field Property android.support.design.circularreveal.CircularRevealWidget$CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR>
	//   20   41:iconst_1        
	//   21   42:newarray        int[]
	//   22   44:dup             
	//   23   45:iconst_0        
	//   24   46:ldc2            #265 <Int 0xffffff>
	//   25   49:iload           8
	//   26   51:iand            
	//   27   52:iastore         
	//   28   53:invokestatic    #269 <Method ObjectAnimator ObjectAnimator.ofInt(Object, Property, int[])>
	//   29   56:astore_1        
		} else
	//*  30   57:goto            76
		{
			view = ((View) (ObjectAnimator.ofInt(((Object) (view1)), android.support.design.circularreveal.CircularRevealWidget.CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR, new int[] {
				i
			})));
	//   31   60:aload_2         
	//   32   61:getstatic       #264 <Field Property android.support.design.circularreveal.CircularRevealWidget$CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR>
	//   33   64:iconst_1        
	//   34   65:newarray        int[]
	//   35   67:dup             
	//   36   68:iconst_0        
	//   37   69:iload           8
	//   38   71:iastore         
	//   39   72:invokestatic    #269 <Method ObjectAnimator ObjectAnimator.ofInt(Object, Property, int[])>
	//   40   75:astore_1        
		}
		((ObjectAnimator) (view)).setEvaluator(((android.animation.TypeEvaluator) (ArgbEvaluatorCompat.getInstance())));
	//   41   76:aload_1         
	//   42   77:invokestatic    #275 <Method ArgbEvaluatorCompat ArgbEvaluatorCompat.getInstance()>
	//   43   80:invokevirtual   #279 <Method void ObjectAnimator.setEvaluator(android.animation.TypeEvaluator)>
		fabtransformationspec.timings.getTiming("color").apply(((Animator) (view)));
	//   44   83:aload           5
	//   45   85:getfield        #153 <Field MotionSpec FabTransformationBehavior$FabTransformationSpec.timings>
	//   46   88:ldc2            #281 <String "color">
	//   47   91:invokevirtual   #161 <Method MotionTiming MotionSpec.getTiming(String)>
	//   48   94:aload_1         
	//   49   95:invokevirtual   #242 <Method void MotionTiming.apply(Animator)>
		list.add(((Object) (view)));
	//   50   98:aload           6
	//   51  100:aload_1         
	//   52  101:invokeinterface #248 <Method boolean List.add(Object)>
	//   53  106:pop             
	//   54  107:return          
	}

	private void createElevationAnimation(View view, View view1, boolean flag, boolean flag1, FabTransformationSpec fabtransformationspec, List list, List list1)
	{
		float f = ViewCompat.getElevation(view1) - ViewCompat.getElevation(view);
	//    0    0:aload_2         
	//    1    1:invokestatic    #291 <Method float ViewCompat.getElevation(View)>
	//    2    4:aload_1         
	//    3    5:invokestatic    #291 <Method float ViewCompat.getElevation(View)>
	//    4    8:fsub            
	//    5    9:fstore          8
		if(flag)
	//*   6   11:iload_3         
	//*   7   12:ifeq            45
		{
			if(!flag1)
	//*   8   15:iload           4
	//*   9   17:ifne            27
				view1.setTranslationZ(-f);
	//   10   20:aload_2         
	//   11   21:fload           8
	//   12   23:fneg            
	//   13   24:invokevirtual   #295 <Method void View.setTranslationZ(float)>
			view = ((View) (ObjectAnimator.ofFloat(((Object) (view1)), View.TRANSLATION_Z, new float[] {
				0.0F
			})));
	//   14   27:aload_2         
	//   15   28:getstatic       #298 <Field Property View.TRANSLATION_Z>
	//   16   31:iconst_1        
	//   17   32:newarray        float[]
	//   18   34:dup             
	//   19   35:iconst_0        
	//   20   36:fconst_0        
	//   21   37:fastore         
	//   22   38:invokestatic    #236 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, Property, float[])>
	//   23   41:astore_1        
		} else
	//*  24   42:goto            62
		{
			view = ((View) (ObjectAnimator.ofFloat(((Object) (view1)), View.TRANSLATION_Z, new float[] {
				-f
			})));
	//   25   45:aload_2         
	//   26   46:getstatic       #298 <Field Property View.TRANSLATION_Z>
	//   27   49:iconst_1        
	//   28   50:newarray        float[]
	//   29   52:dup             
	//   30   53:iconst_0        
	//   31   54:fload           8
	//   32   56:fneg            
	//   33   57:fastore         
	//   34   58:invokestatic    #236 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, Property, float[])>
	//   35   61:astore_1        
		}
		fabtransformationspec.timings.getTiming("elevation").apply(((Animator) (view)));
	//   36   62:aload           5
	//   37   64:getfield        #153 <Field MotionSpec FabTransformationBehavior$FabTransformationSpec.timings>
	//   38   67:ldc2            #300 <String "elevation">
	//   39   70:invokevirtual   #161 <Method MotionTiming MotionSpec.getTiming(String)>
	//   40   73:aload_1         
	//   41   74:invokevirtual   #242 <Method void MotionTiming.apply(Animator)>
		list.add(((Object) (view)));
	//   42   77:aload           6
	//   43   79:aload_1         
	//   44   80:invokeinterface #248 <Method boolean List.add(Object)>
	//   45   85:pop             
	//   46   86:return          
	}

	private void createExpansionAnimation(View view, View view1, boolean flag, boolean flag1, FabTransformationSpec fabtransformationspec, float f, float f1, 
			List list, List list1)
	{
		if(!(view1 instanceof CircularRevealWidget))
	//*   0    0:aload_2         
	//*   1    1:instanceof      #206 <Class CircularRevealWidget>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		final CircularRevealWidget circularRevealChild = (CircularRevealWidget)view1;
	//    4    8:aload_2         
	//    5    9:checkcast       #206 <Class CircularRevealWidget>
	//    6   12:astore          17
		float f3 = calculateRevealCenterX(view, view1, fabtransformationspec.positioning);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:aload_2         
	//   10   17:aload           5
	//   11   19:getfield        #306 <Field Positioning FabTransformationBehavior$FabTransformationSpec.positioning>
	//   12   22:invokespecial   #308 <Method float calculateRevealCenterX(View, View, Positioning)>
	//   13   25:fstore          11
		float f4 = calculateRevealCenterY(view, view1, fabtransformationspec.positioning);
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:aload_2         
	//   17   30:aload           5
	//   18   32:getfield        #306 <Field Positioning FabTransformationBehavior$FabTransformationSpec.positioning>
	//   19   35:invokespecial   #310 <Method float calculateRevealCenterY(View, View, Positioning)>
	//   20   38:fstore          12
		((FloatingActionButton)view).getContentRect(tmpRect);
	//   21   40:aload_1         
	//   22   41:checkcast       #312 <Class FloatingActionButton>
	//   23   44:aload_0         
	//   24   45:getfield        #31  <Field Rect tmpRect>
	//   25   48:invokevirtual   #316 <Method boolean FloatingActionButton.getContentRect(Rect)>
	//   26   51:pop             
		float f2 = (float)tmpRect.width() / 2.0F;
	//   27   52:aload_0         
	//   28   53:getfield        #31  <Field Rect tmpRect>
	//   29   56:invokevirtual   #319 <Method int Rect.width()>
	//   30   59:i2f             
	//   31   60:fconst_2        
	//   32   61:fdiv            
	//   33   62:fstore          10
		MotionTiming motiontiming = fabtransformationspec.timings.getTiming("expansion");
	//   34   64:aload           5
	//   35   66:getfield        #153 <Field MotionSpec FabTransformationBehavior$FabTransformationSpec.timings>
	//   36   69:ldc1            #155 <String "expansion">
	//   37   71:invokevirtual   #161 <Method MotionTiming MotionSpec.getTiming(String)>
	//   38   74:astore          18
		if(flag)
	//*  39   76:iload_3         
	//*  40   77:ifeq            182
		{
			if(!flag1)
	//*  41   80:iload           4
	//*  42   82:ifne            105
				circularRevealChild.setRevealInfo(new android.support.design.circularreveal.CircularRevealWidget.RevealInfo(f3, f4, f2));
	//   43   85:aload           17
	//   44   87:new             #321 <Class android.support.design.circularreveal.CircularRevealWidget$RevealInfo>
	//   45   90:dup             
	//   46   91:fload           11
	//   47   93:fload           12
	//   48   95:fload           10
	//   49   97:invokespecial   #324 <Method void android.support.design.circularreveal.CircularRevealWidget$RevealInfo(float, float, float)>
	//   50  100:invokeinterface #328 <Method void CircularRevealWidget.setRevealInfo(android.support.design.circularreveal.CircularRevealWidget$RevealInfo)>
			if(flag1)
	//*  51  105:iload           4
	//*  52  107:ifeq            122
				f2 = circularRevealChild.getRevealInfo().radius;
	//   53  110:aload           17
	//   54  112:invokeinterface #332 <Method android.support.design.circularreveal.CircularRevealWidget$RevealInfo CircularRevealWidget.getRevealInfo()>
	//   55  117:getfield        #335 <Field float android.support.design.circularreveal.CircularRevealWidget$RevealInfo.radius>
	//   56  120:fstore          10
			view = ((View) (CircularRevealCompat.createCircularReveal(circularRevealChild, f3, f4, MathUtils.distanceToFurthestCorner(f3, f4, 0.0F, 0.0F, f, f1))));
	//   57  122:aload           17
	//   58  124:fload           11
	//   59  126:fload           12
	//   60  128:fload           11
	//   61  130:fload           12
	//   62  132:fconst_0        
	//   63  133:fconst_0        
	//   64  134:fload           6
	//   65  136:fload           7
	//   66  138:invokestatic    #341 <Method float MathUtils.distanceToFurthestCorner(float, float, float, float, float, float)>
	//   67  141:invokestatic    #347 <Method Animator CircularRevealCompat.createCircularReveal(CircularRevealWidget, float, float, float)>
	//   68  144:astore_1        
			((Animator) (view)).addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

				public void onAnimationEnd(Animator animator)
				{
					animator = ((Animator) (circularRevealChild.getRevealInfo()));
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field CircularRevealWidget val$circularRevealChild>
				//    2    4:invokeinterface #31  <Method android.support.design.circularreveal.CircularRevealWidget$RevealInfo CircularRevealWidget.getRevealInfo()>
				//    3    9:astore_1        
					animator.radius = 3.402823E+38F;
				//    4   10:aload_1         
				//    5   11:ldc1            #32  <Float 3.402823E+38F>
				//    6   13:putfield        #38  <Field float android.support.design.circularreveal.CircularRevealWidget$RevealInfo.radius>
					circularRevealChild.setRevealInfo(((android.support.design.circularreveal.CircularRevealWidget.RevealInfo) (animator)));
				//    7   16:aload_0         
				//    8   17:getfield        #19  <Field CircularRevealWidget val$circularRevealChild>
				//    9   20:aload_1         
				//   10   21:invokeinterface #42  <Method void CircularRevealWidget.setRevealInfo(android.support.design.circularreveal.CircularRevealWidget$RevealInfo)>
				//   11   26:return          
				}

				final FabTransformationBehavior this$0;
				final CircularRevealWidget val$circularRevealChild;

			
			{
				this$0 = FabTransformationBehavior.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field FabTransformationBehavior this$0>
				circularRevealChild = circularrevealwidget;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field CircularRevealWidget val$circularRevealChild>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void AnimatorListenerAdapter()>
			//    8   14:return          
			}
			}
)));
	//   69  145:aload_1         
	//   70  146:new             #12  <Class FabTransformationBehavior$4>
	//   71  149:dup             
	//   72  150:aload_0         
	//   73  151:aload           17
	//   74  153:invokespecial   #350 <Method void FabTransformationBehavior$4(FabTransformationBehavior, CircularRevealWidget)>
	//   75  156:invokevirtual   #356 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
			createPreFillRadialExpansion(view1, motiontiming.getDelay(), (int)f3, (int)f4, f2, list);
	//   76  159:aload_0         
	//   77  160:aload_2         
	//   78  161:aload           18
	//   79  163:invokevirtual   #146 <Method long MotionTiming.getDelay()>
	//   80  166:fload           11
	//   81  168:f2i             
	//   82  169:fload           12
	//   83  171:f2i             
	//   84  172:fload           10
	//   85  174:aload           8
	//   86  176:invokespecial   #360 <Method void createPreFillRadialExpansion(View, long, int, int, float, List)>
		} else
	//*  87  179:goto            269
		{
			f = circularRevealChild.getRevealInfo().radius;
	//   88  182:aload           17
	//   89  184:invokeinterface #332 <Method android.support.design.circularreveal.CircularRevealWidget$RevealInfo CircularRevealWidget.getRevealInfo()>
	//   90  189:getfield        #335 <Field float android.support.design.circularreveal.CircularRevealWidget$RevealInfo.radius>
	//   91  192:fstore          6
			view = ((View) (CircularRevealCompat.createCircularReveal(circularRevealChild, f3, f4, f2)));
	//   92  194:aload           17
	//   93  196:fload           11
	//   94  198:fload           12
	//   95  200:fload           10
	//   96  202:invokestatic    #347 <Method Animator CircularRevealCompat.createCircularReveal(CircularRevealWidget, float, float, float)>
	//   97  205:astore_1        
			long l = motiontiming.getDelay();
	//   98  206:aload           18
	//   99  208:invokevirtual   #146 <Method long MotionTiming.getDelay()>
	//  100  211:lstore          15
			int i = (int)f3;
	//  101  213:fload           11
	//  102  215:f2i             
	//  103  216:istore          13
			int j = (int)f4;
	//  104  218:fload           12
	//  105  220:f2i             
	//  106  221:istore          14
			createPreFillRadialExpansion(view1, l, i, j, f, list);
	//  107  223:aload_0         
	//  108  224:aload_2         
	//  109  225:lload           15
	//  110  227:iload           13
	//  111  229:iload           14
	//  112  231:fload           6
	//  113  233:aload           8
	//  114  235:invokespecial   #360 <Method void createPreFillRadialExpansion(View, long, int, int, float, List)>
			createPostFillRadialExpansion(view1, motiontiming.getDelay(), motiontiming.getDuration(), fabtransformationspec.timings.getTotalDuration(), i, j, f2, list);
	//  115  238:aload_0         
	//  116  239:aload_2         
	//  117  240:aload           18
	//  118  242:invokevirtual   #146 <Method long MotionTiming.getDelay()>
	//  119  245:aload           18
	//  120  247:invokevirtual   #149 <Method long MotionTiming.getDuration()>
	//  121  250:aload           5
	//  122  252:getfield        #153 <Field MotionSpec FabTransformationBehavior$FabTransformationSpec.timings>
	//  123  255:invokevirtual   #363 <Method long MotionSpec.getTotalDuration()>
	//  124  258:iload           13
	//  125  260:iload           14
	//  126  262:fload           10
	//  127  264:aload           8
	//  128  266:invokespecial   #367 <Method void createPostFillRadialExpansion(View, long, long, long, int, int, float, List)>
		}
		motiontiming.apply(((Animator) (view)));
	//  129  269:aload           18
	//  130  271:aload_1         
	//  131  272:invokevirtual   #242 <Method void MotionTiming.apply(Animator)>
		list.add(((Object) (view)));
	//  132  275:aload           8
	//  133  277:aload_1         
	//  134  278:invokeinterface #248 <Method boolean List.add(Object)>
	//  135  283:pop             
		list1.add(((Object) (CircularRevealCompat.createCircularRevealListener(circularRevealChild))));
	//  136  284:aload           9
	//  137  286:aload           17
	//  138  288:invokestatic    #371 <Method android.animation.Animator$AnimatorListener CircularRevealCompat.createCircularRevealListener(CircularRevealWidget)>
	//  139  291:invokeinterface #248 <Method boolean List.add(Object)>
	//  140  296:pop             
	//  141  297:return          
	}

	private void createIconFadeAnimation(View view, final View child, boolean flag, boolean flag1, FabTransformationSpec fabtransformationspec, List list, List list1)
	{
		if(child instanceof CircularRevealWidget)
	//*   0    0:aload_2         
	//*   1    1:instanceof      #206 <Class CircularRevealWidget>
	//*   2    4:ifeq            154
		{
			if(!(view instanceof ImageView))
	//*   3    7:aload_1         
	//*   4    8:instanceof      #375 <Class ImageView>
	//*   5   11:ifne            15
				return;
	//    6   14:return          
			final CircularRevealWidget circularRevealChild = (CircularRevealWidget)child;
	//    7   15:aload_2         
	//    8   16:checkcast       #206 <Class CircularRevealWidget>
	//    9   19:astore          8
			final Drawable icon = ((ImageView)view).getDrawable();
	//   10   21:aload_1         
	//   11   22:checkcast       #375 <Class ImageView>
	//   12   25:invokevirtual   #379 <Method Drawable ImageView.getDrawable()>
	//   13   28:astore          9
			if(icon == null)
	//*  14   30:aload           9
	//*  15   32:ifnonnull       36
				return;
	//   16   35:return          
			icon.mutate();
	//   17   36:aload           9
	//   18   38:invokevirtual   #384 <Method Drawable Drawable.mutate()>
	//   19   41:pop             
			if(flag)
	//*  20   42:iload_3         
	//*  21   43:ifeq            78
			{
				if(!flag1)
	//*  22   46:iload           4
	//*  23   48:ifne            59
					icon.setAlpha(255);
	//   24   51:aload           9
	//   25   53:sipush          255
	//   26   56:invokevirtual   #387 <Method void Drawable.setAlpha(int)>
				view = ((View) (ObjectAnimator.ofInt(((Object) (icon)), DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT, new int[] {
					0
				})));
	//   27   59:aload           9
	//   28   61:getstatic       #392 <Field Property DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT>
	//   29   64:iconst_1        
	//   30   65:newarray        int[]
	//   31   67:dup             
	//   32   68:iconst_0        
	//   33   69:iconst_0        
	//   34   70:iastore         
	//   35   71:invokestatic    #269 <Method ObjectAnimator ObjectAnimator.ofInt(Object, Property, int[])>
	//   36   74:astore_1        
			} else
	//*  37   75:goto            96
			{
				view = ((View) (ObjectAnimator.ofInt(((Object) (icon)), DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT, new int[] {
					255
				})));
	//   38   78:aload           9
	//   39   80:getstatic       #392 <Field Property DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT>
	//   40   83:iconst_1        
	//   41   84:newarray        int[]
	//   42   86:dup             
	//   43   87:iconst_0        
	//   44   88:sipush          255
	//   45   91:iastore         
	//   46   92:invokestatic    #269 <Method ObjectAnimator ObjectAnimator.ofInt(Object, Property, int[])>
	//   47   95:astore_1        
			}
			((ObjectAnimator) (view)).addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

				public void onAnimationUpdate(ValueAnimator valueanimator)
				{
					child.invalidate();
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field View val$child>
				//    2    4:invokevirtual   #32  <Method void View.invalidate()>
				//    3    7:return          
				}

				final FabTransformationBehavior this$0;
				final View val$child;

			
			{
				this$0 = FabTransformationBehavior.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field FabTransformationBehavior this$0>
				child = view;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field View val$child>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   48   96:aload_1         
	//   49   97:new             #8   <Class FabTransformationBehavior$2>
	//   50  100:dup             
	//   51  101:aload_0         
	//   52  102:aload_2         
	//   53  103:invokespecial   #395 <Method void FabTransformationBehavior$2(FabTransformationBehavior, View)>
	//   54  106:invokevirtual   #399 <Method void ObjectAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
			fabtransformationspec.timings.getTiming("iconFade").apply(((Animator) (view)));
	//   55  109:aload           5
	//   56  111:getfield        #153 <Field MotionSpec FabTransformationBehavior$FabTransformationSpec.timings>
	//   57  114:ldc2            #401 <String "iconFade">
	//   58  117:invokevirtual   #161 <Method MotionTiming MotionSpec.getTiming(String)>
	//   59  120:aload_1         
	//   60  121:invokevirtual   #242 <Method void MotionTiming.apply(Animator)>
			list.add(((Object) (view)));
	//   61  124:aload           6
	//   62  126:aload_1         
	//   63  127:invokeinterface #248 <Method boolean List.add(Object)>
	//   64  132:pop             
			list1.add(((Object) (new AnimatorListenerAdapter() {

				public void onAnimationEnd(Animator animator)
				{
					circularRevealChild.setCircularRevealOverlayDrawable(((Drawable) (null)));
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field CircularRevealWidget val$circularRevealChild>
				//    2    4:aconst_null     
				//    3    5:invokeinterface #35  <Method void CircularRevealWidget.setCircularRevealOverlayDrawable(Drawable)>
				//    4   10:return          
				}

				public void onAnimationStart(Animator animator)
				{
					circularRevealChild.setCircularRevealOverlayDrawable(icon);
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field CircularRevealWidget val$circularRevealChild>
				//    2    4:aload_0         
				//    3    5:getfield        #23  <Field Drawable val$icon>
				//    4    8:invokeinterface #35  <Method void CircularRevealWidget.setCircularRevealOverlayDrawable(Drawable)>
				//    5   13:return          
				}

				final FabTransformationBehavior this$0;
				final CircularRevealWidget val$circularRevealChild;
				final Drawable val$icon;

			
			{
				this$0 = FabTransformationBehavior.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field FabTransformationBehavior this$0>
				circularRevealChild = circularrevealwidget;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field CircularRevealWidget val$circularRevealChild>
				icon = drawable;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #23  <Field Drawable val$icon>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #26  <Method void AnimatorListenerAdapter()>
			//   11   19:return          
			}
			}
)));
	//   65  133:aload           7
	//   66  135:new             #10  <Class FabTransformationBehavior$3>
	//   67  138:dup             
	//   68  139:aload_0         
	//   69  140:aload           8
	//   70  142:aload           9
	//   71  144:invokespecial   #404 <Method void FabTransformationBehavior$3(FabTransformationBehavior, CircularRevealWidget, Drawable)>
	//   72  147:invokeinterface #248 <Method boolean List.add(Object)>
	//   73  152:pop             
			return;
	//   74  153:return          
		} else
		{
			return;
	//   75  154:return          
		}
	}

	private void createPostFillRadialExpansion(View view, long l, long l1, long l2, 
			int i, int j, float f, List list)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #409 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          56
		{
			l += l1;
	//    3    8:lload_2         
	//    4    9:lload           4
	//    5   11:ladd            
	//    6   12:lstore_2        
			if(l < l2)
	//*   7   13:lload_2         
	//*   8   14:lload           6
	//*   9   16:lcmp            
	//*  10   17:ifge            56
			{
				view = ((View) (ViewAnimationUtils.createCircularReveal(view, i, j, f, f)));
	//   11   20:aload_1         
	//   12   21:iload           8
	//   13   23:iload           9
	//   14   25:fload           10
	//   15   27:fload           10
	//   16   29:invokestatic    #414 <Method Animator ViewAnimationUtils.createCircularReveal(View, int, int, float, float)>
	//   17   32:astore_1        
				((Animator) (view)).setStartDelay(l);
	//   18   33:aload_1         
	//   19   34:lload_2         
	//   20   35:invokevirtual   #418 <Method void Animator.setStartDelay(long)>
				((Animator) (view)).setDuration(l2 - l);
	//   21   38:aload_1         
	//   22   39:lload           6
	//   23   41:lload_2         
	//   24   42:lsub            
	//   25   43:invokevirtual   #422 <Method Animator Animator.setDuration(long)>
	//   26   46:pop             
				list.add(((Object) (view)));
	//   27   47:aload           11
	//   28   49:aload_1         
	//   29   50:invokeinterface #248 <Method boolean List.add(Object)>
	//   30   55:pop             
			}
		}
	//   31   56:return          
	}

	private void createPreFillRadialExpansion(View view, long l, int i, int j, float f, List list)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21 && l > 0L)
	//*   0    0:getstatic       #409 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          47
	//*   3    8:lload_2         
	//*   4    9:lconst_0        
	//*   5   10:lcmp            
	//*   6   11:ifle            47
		{
			view = ((View) (ViewAnimationUtils.createCircularReveal(view, i, j, f, f)));
	//    7   14:aload_1         
	//    8   15:iload           4
	//    9   17:iload           5
	//   10   19:fload           6
	//   11   21:fload           6
	//   12   23:invokestatic    #414 <Method Animator ViewAnimationUtils.createCircularReveal(View, int, int, float, float)>
	//   13   26:astore_1        
			((Animator) (view)).setStartDelay(0L);
	//   14   27:aload_1         
	//   15   28:lconst_0        
	//   16   29:invokevirtual   #418 <Method void Animator.setStartDelay(long)>
			((Animator) (view)).setDuration(l);
	//   17   32:aload_1         
	//   18   33:lload_2         
	//   19   34:invokevirtual   #422 <Method Animator Animator.setDuration(long)>
	//   20   37:pop             
			list.add(((Object) (view)));
	//   21   38:aload           7
	//   22   40:aload_1         
	//   23   41:invokeinterface #248 <Method boolean List.add(Object)>
	//   24   46:pop             
		}
	//   25   47:return          
	}

	private void createTranslationAnimation(View view, View view1, boolean flag, boolean flag1, FabTransformationSpec fabtransformationspec, List list, List list1, 
			RectF rectf)
	{
		float f;
		float f1;
label0:
		{
			f = calculateTranslationX(view, view1, fabtransformationspec.positioning);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload           5
	//    4    5:getfield        #306 <Field Positioning FabTransformationBehavior$FabTransformationSpec.positioning>
	//    5    8:invokespecial   #105 <Method float calculateTranslationX(View, View, Positioning)>
	//    6   11:fstore          9
			f1 = calculateTranslationY(view, view1, fabtransformationspec.positioning);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:aload           5
	//   11   18:getfield        #306 <Field Positioning FabTransformationBehavior$FabTransformationSpec.positioning>
	//   12   21:invokespecial   #117 <Method float calculateTranslationY(View, View, Positioning)>
	//   13   24:fstore          10
			if(f != 0.0F)
	//*  14   26:fload           9
	//*  15   28:fconst_0        
	//*  16   29:fcmpl           
	//*  17   30:ifeq            123
			{
				int i = f1 != 0.0F;
	//   18   33:fload           10
	//   19   35:fconst_0        
	//   20   36:fcmpl           
	//   21   37:istore          11
				if(i != 0)
	//*  22   39:iload           11
	//*  23   41:ifne            47
	//*  24   44:goto            123
				{
					if(flag && f1 < 0.0F || !flag && i > 0)
	//*  25   47:iload_3         
	//*  26   48:ifeq            58
	//*  27   51:fload           10
	//*  28   53:fconst_0        
	//*  29   54:fcmpg           
	//*  30   55:iflt            67
	//*  31   58:iload_3         
	//*  32   59:ifne            95
	//*  33   62:iload           11
	//*  34   64:ifle            95
					{
						view = ((View) (fabtransformationspec.timings.getTiming("translationXCurveUpwards")));
	//   35   67:aload           5
	//   36   69:getfield        #153 <Field MotionSpec FabTransformationBehavior$FabTransformationSpec.timings>
	//   37   72:ldc2            #428 <String "translationXCurveUpwards">
	//   38   75:invokevirtual   #161 <Method MotionTiming MotionSpec.getTiming(String)>
	//   39   78:astore_1        
						list1 = ((List) (fabtransformationspec.timings.getTiming("translationYCurveUpwards")));
	//   40   79:aload           5
	//   41   81:getfield        #153 <Field MotionSpec FabTransformationBehavior$FabTransformationSpec.timings>
	//   42   84:ldc2            #430 <String "translationYCurveUpwards">
	//   43   87:invokevirtual   #161 <Method MotionTiming MotionSpec.getTiming(String)>
	//   44   90:astore          7
					} else
	//*  45   92:goto            148
					{
						view = ((View) (fabtransformationspec.timings.getTiming("translationXCurveDownwards")));
	//   46   95:aload           5
	//   47   97:getfield        #153 <Field MotionSpec FabTransformationBehavior$FabTransformationSpec.timings>
	//   48  100:ldc2            #432 <String "translationXCurveDownwards">
	//   49  103:invokevirtual   #161 <Method MotionTiming MotionSpec.getTiming(String)>
	//   50  106:astore_1        
						list1 = ((List) (fabtransformationspec.timings.getTiming("translationYCurveDownwards")));
	//   51  107:aload           5
	//   52  109:getfield        #153 <Field MotionSpec FabTransformationBehavior$FabTransformationSpec.timings>
	//   53  112:ldc2            #434 <String "translationYCurveDownwards">
	//   54  115:invokevirtual   #161 <Method MotionTiming MotionSpec.getTiming(String)>
	//   55  118:astore          7
					}
					break label0;
	//   56  120:goto            148
				}
			}
			view = ((View) (fabtransformationspec.timings.getTiming("translationXLinear")));
	//   57  123:aload           5
	//   58  125:getfield        #153 <Field MotionSpec FabTransformationBehavior$FabTransformationSpec.timings>
	//   59  128:ldc2            #436 <String "translationXLinear">
	//   60  131:invokevirtual   #161 <Method MotionTiming MotionSpec.getTiming(String)>
	//   61  134:astore_1        
			list1 = ((List) (fabtransformationspec.timings.getTiming("translationYLinear")));
	//   62  135:aload           5
	//   63  137:getfield        #153 <Field MotionSpec FabTransformationBehavior$FabTransformationSpec.timings>
	//   64  140:ldc2            #438 <String "translationYLinear">
	//   65  143:invokevirtual   #161 <Method MotionTiming MotionSpec.getTiming(String)>
	//   66  146:astore          7
		}
		if(flag)
	//*  67  148:iload_3         
	//*  68  149:ifeq            233
		{
			if(!flag1)
	//*  69  152:iload           4
	//*  70  154:ifne            171
			{
				view1.setTranslationX(-f);
	//   71  157:aload_2         
	//   72  158:fload           9
	//   73  160:fneg            
	//   74  161:invokevirtual   #441 <Method void View.setTranslationX(float)>
				view1.setTranslationY(-f1);
	//   75  164:aload_2         
	//   76  165:fload           10
	//   77  167:fneg            
	//   78  168:invokevirtual   #444 <Method void View.setTranslationY(float)>
			}
			ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(((Object) (view1)), View.TRANSLATION_X, new float[] {
				0.0F
			});
	//   79  171:aload_2         
	//   80  172:getstatic       #447 <Field Property View.TRANSLATION_X>
	//   81  175:iconst_1        
	//   82  176:newarray        float[]
	//   83  178:dup             
	//   84  179:iconst_0        
	//   85  180:fconst_0        
	//   86  181:fastore         
	//   87  182:invokestatic    #236 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, Property, float[])>
	//   88  185:astore          13
			ObjectAnimator objectanimator = ObjectAnimator.ofFloat(((Object) (view1)), View.TRANSLATION_Y, new float[] {
				0.0F
			});
	//   89  187:aload_2         
	//   90  188:getstatic       #450 <Field Property View.TRANSLATION_Y>
	//   91  191:iconst_1        
	//   92  192:newarray        float[]
	//   93  194:dup             
	//   94  195:iconst_0        
	//   95  196:fconst_0        
	//   96  197:fastore         
	//   97  198:invokestatic    #236 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, Property, float[])>
	//   98  201:astore          12
			calculateChildVisibleBoundsAtEndOfExpansion(view1, fabtransformationspec, ((MotionTiming) (view)), ((MotionTiming) (list1)), -f, -f1, 0.0F, 0.0F, rectf);
	//   99  203:aload_0         
	//  100  204:aload_2         
	//  101  205:aload           5
	//  102  207:aload_1         
	//  103  208:aload           7
	//  104  210:fload           9
	//  105  212:fneg            
	//  106  213:fload           10
	//  107  215:fneg            
	//  108  216:fconst_0        
	//  109  217:fconst_0        
	//  110  218:aload           8
	//  111  220:invokespecial   #452 <Method void calculateChildVisibleBoundsAtEndOfExpansion(View, FabTransformationBehavior$FabTransformationSpec, MotionTiming, MotionTiming, float, float, float, float, RectF)>
			view1 = ((View) (objectanimator1));
	//  112  223:aload           13
	//  113  225:astore_2        
			fabtransformationspec = ((FabTransformationSpec) (objectanimator));
	//  114  226:aload           12
	//  115  228:astore          5
		} else
	//* 116  230:goto            272
		{
			rectf = ((RectF) (ObjectAnimator.ofFloat(((Object) (view1)), View.TRANSLATION_X, new float[] {
				-f
			})));
	//  117  233:aload_2         
	//  118  234:getstatic       #447 <Field Property View.TRANSLATION_X>
	//  119  237:iconst_1        
	//  120  238:newarray        float[]
	//  121  240:dup             
	//  122  241:iconst_0        
	//  123  242:fload           9
	//  124  244:fneg            
	//  125  245:fastore         
	//  126  246:invokestatic    #236 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, Property, float[])>
	//  127  249:astore          8
			fabtransformationspec = ((FabTransformationSpec) (ObjectAnimator.ofFloat(((Object) (view1)), View.TRANSLATION_Y, new float[] {
				-f1
			})));
	//  128  251:aload_2         
	//  129  252:getstatic       #450 <Field Property View.TRANSLATION_Y>
	//  130  255:iconst_1        
	//  131  256:newarray        float[]
	//  132  258:dup             
	//  133  259:iconst_0        
	//  134  260:fload           10
	//  135  262:fneg            
	//  136  263:fastore         
	//  137  264:invokestatic    #236 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, Property, float[])>
	//  138  267:astore          5
			view1 = ((View) (rectf));
	//  139  269:aload           8
	//  140  271:astore_2        
		}
		((MotionTiming) (view)).apply(((Animator) (view1)));
	//  141  272:aload_1         
	//  142  273:aload_2         
	//  143  274:invokevirtual   #242 <Method void MotionTiming.apply(Animator)>
		((MotionTiming) (list1)).apply(((Animator) (fabtransformationspec)));
	//  144  277:aload           7
	//  145  279:aload           5
	//  146  281:invokevirtual   #242 <Method void MotionTiming.apply(Animator)>
		list.add(((Object) (view1)));
	//  147  284:aload           6
	//  148  286:aload_2         
	//  149  287:invokeinterface #248 <Method boolean List.add(Object)>
	//  150  292:pop             
		list.add(((Object) (fabtransformationspec)));
	//  151  293:aload           6
	//  152  295:aload           5
	//  153  297:invokeinterface #248 <Method boolean List.add(Object)>
	//  154  302:pop             
	//  155  303:return          
	}

	private int getBackgroundTint(View view)
	{
		ColorStateList colorstatelist = ViewCompat.getBackgroundTintList(view);
	//    0    0:aload_1         
	//    1    1:invokestatic    #457 <Method ColorStateList ViewCompat.getBackgroundTintList(View)>
	//    2    4:astore_2        
		if(colorstatelist != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          22
			return colorstatelist.getColorForState(view.getDrawableState(), colorstatelist.getDefaultColor());
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #461 <Method int[] View.getDrawableState()>
	//    8   14:aload_2         
	//    9   15:invokevirtual   #466 <Method int ColorStateList.getDefaultColor()>
	//   10   18:invokevirtual   #470 <Method int ColorStateList.getColorForState(int[], int)>
	//   11   21:ireturn         
		else
			return 0;
	//   12   22:iconst_0        
	//   13   23:ireturn         
	}

	private ViewGroup toViewGroupOrNull(View view)
	{
		if(view instanceof ViewGroup)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #68  <Class ViewGroup>
	//*   2    4:ifeq            12
			return (ViewGroup)view;
	//    3    7:aload_1         
	//    4    8:checkcast       #68  <Class ViewGroup>
	//    5   11:areturn         
		else
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
	}

	public boolean layoutDependsOn(CoordinatorLayout coordinatorlayout, View view, View view1)
	{
		if(view.getVisibility() != 8)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #476 <Method int View.getVisibility()>
	//*   2    4:bipush          8
	//*   3    6:icmpeq          54
		{
			boolean flag1 = view1 instanceof FloatingActionButton;
	//    4    9:aload_3         
	//    5   10:instanceof      #312 <Class FloatingActionButton>
	//    6   13:istore          6
			boolean flag = false;
	//    7   15:iconst_0        
	//    8   16:istore          5
			if(flag1)
	//*   9   18:iload           6
	//*  10   20:ifeq            52
			{
				int i = ((FloatingActionButton)view1).getExpandedComponentIdHint();
	//   11   23:aload_3         
	//   12   24:checkcast       #312 <Class FloatingActionButton>
	//   13   27:invokevirtual   #479 <Method int FloatingActionButton.getExpandedComponentIdHint()>
	//   14   30:istore          4
				if(i == 0 || i == view.getId())
	//*  15   32:iload           4
	//*  16   34:ifeq            46
	//*  17   37:iload           4
	//*  18   39:aload_2         
	//*  19   40:invokevirtual   #482 <Method int View.getId()>
	//*  20   43:icmpne          49
					flag = true;
	//   21   46:iconst_1        
	//   22   47:istore          5
				return flag;
	//   23   49:iload           5
	//   24   51:ireturn         
			} else
			{
				return false;
	//   25   52:iconst_0        
	//   26   53:ireturn         
			}
		} else
		{
			throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
	//   27   54:new             #484 <Class IllegalStateException>
	//   28   57:dup             
	//   29   58:ldc2            #486 <String "This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.">
	//   30   61:invokespecial   #489 <Method void IllegalStateException(String)>
	//   31   64:athrow          
		}
	}

	public void onAttachedToLayoutParams(android.support.design.widget.CoordinatorLayout.LayoutParams layoutparams)
	{
		if(layoutparams.dodgeInsetEdges == 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #497 <Field int android.support.design.widget.CoordinatorLayout$LayoutParams.dodgeInsetEdges>
	//*   2    4:ifne            13
			layoutparams.dodgeInsetEdges = 80;
	//    3    7:aload_1         
	//    4    8:bipush          80
	//    5   10:putfield        #497 <Field int android.support.design.widget.CoordinatorLayout$LayoutParams.dodgeInsetEdges>
	//    6   13:return          
	}

	protected AnimatorSet onCreateExpandedStateChangeAnimation(final View dependency, final View child, final boolean expanded, boolean flag)
	{
		Object obj = ((Object) (onCreateMotionSpec(child.getContext(), expanded)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #504 <Method Context View.getContext()>
	//    3    5:iload_3         
	//    4    6:invokevirtual   #508 <Method FabTransformationBehavior$FabTransformationSpec onCreateMotionSpec(Context, boolean)>
	//    5    9:astore          11
		ArrayList arraylist = new ArrayList();
	//    6   11:new             #510 <Class ArrayList>
	//    7   14:dup             
	//    8   15:invokespecial   #511 <Method void ArrayList()>
	//    9   18:astore          9
		ArrayList arraylist1 = new ArrayList();
	//   10   20:new             #510 <Class ArrayList>
	//   11   23:dup             
	//   12   24:invokespecial   #511 <Method void ArrayList()>
	//   13   27:astore          10
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  14   29:getstatic       #409 <Field int android.os.Build$VERSION.SDK_INT>
	//*  15   32:bipush          21
	//*  16   34:icmplt          52
			createElevationAnimation(dependency, child, expanded, flag, ((FabTransformationSpec) (obj)), ((List) (arraylist)), ((List) (arraylist1)));
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:aload_2         
	//   20   40:iload_3         
	//   21   41:iload           4
	//   22   43:aload           11
	//   23   45:aload           9
	//   24   47:aload           10
	//   25   49:invokespecial   #513 <Method void createElevationAnimation(View, View, boolean, boolean, FabTransformationBehavior$FabTransformationSpec, List, List)>
		RectF rectf = tmpRectF1;
	//   26   52:aload_0         
	//   27   53:getfield        #36  <Field RectF tmpRectF1>
	//   28   56:astore          12
		createTranslationAnimation(dependency, child, expanded, flag, ((FabTransformationSpec) (obj)), ((List) (arraylist)), ((List) (arraylist1)), rectf);
	//   29   58:aload_0         
	//   30   59:aload_1         
	//   31   60:aload_2         
	//   32   61:iload_3         
	//   33   62:iload           4
	//   34   64:aload           11
	//   35   66:aload           9
	//   36   68:aload           10
	//   37   70:aload           12
	//   38   72:invokespecial   #515 <Method void createTranslationAnimation(View, View, boolean, boolean, FabTransformationBehavior$FabTransformationSpec, List, List, RectF)>
		float f = rectf.width();
	//   39   75:aload           12
	//   40   77:invokevirtual   #517 <Method float RectF.width()>
	//   41   80:fstore          5
		float f1 = rectf.height();
	//   42   82:aload           12
	//   43   84:invokevirtual   #520 <Method float RectF.height()>
	//   44   87:fstore          6
		createIconFadeAnimation(dependency, child, expanded, flag, ((FabTransformationSpec) (obj)), ((List) (arraylist)), ((List) (arraylist1)));
	//   45   89:aload_0         
	//   46   90:aload_1         
	//   47   91:aload_2         
	//   48   92:iload_3         
	//   49   93:iload           4
	//   50   95:aload           11
	//   51   97:aload           9
	//   52   99:aload           10
	//   53  101:invokespecial   #522 <Method void createIconFadeAnimation(View, View, boolean, boolean, FabTransformationBehavior$FabTransformationSpec, List, List)>
		createExpansionAnimation(dependency, child, expanded, flag, ((FabTransformationSpec) (obj)), f, f1, ((List) (arraylist)), ((List) (arraylist1)));
	//   54  104:aload_0         
	//   55  105:aload_1         
	//   56  106:aload_2         
	//   57  107:iload_3         
	//   58  108:iload           4
	//   59  110:aload           11
	//   60  112:fload           5
	//   61  114:fload           6
	//   62  116:aload           9
	//   63  118:aload           10
	//   64  120:invokespecial   #524 <Method void createExpansionAnimation(View, View, boolean, boolean, FabTransformationBehavior$FabTransformationSpec, float, float, List, List)>
		createColorAnimation(dependency, child, expanded, flag, ((FabTransformationSpec) (obj)), ((List) (arraylist)), ((List) (arraylist1)));
	//   65  123:aload_0         
	//   66  124:aload_1         
	//   67  125:aload_2         
	//   68  126:iload_3         
	//   69  127:iload           4
	//   70  129:aload           11
	//   71  131:aload           9
	//   72  133:aload           10
	//   73  135:invokespecial   #526 <Method void createColorAnimation(View, View, boolean, boolean, FabTransformationBehavior$FabTransformationSpec, List, List)>
		createChildrenFadeAnimation(dependency, child, expanded, flag, ((FabTransformationSpec) (obj)), ((List) (arraylist)), ((List) (arraylist1)));
	//   74  138:aload_0         
	//   75  139:aload_1         
	//   76  140:aload_2         
	//   77  141:iload_3         
	//   78  142:iload           4
	//   79  144:aload           11
	//   80  146:aload           9
	//   81  148:aload           10
	//   82  150:invokespecial   #528 <Method void createChildrenFadeAnimation(View, View, boolean, boolean, FabTransformationBehavior$FabTransformationSpec, List, List)>
		obj = ((Object) (new AnimatorSet()));
	//   83  153:new             #530 <Class AnimatorSet>
	//   84  156:dup             
	//   85  157:invokespecial   #531 <Method void AnimatorSet()>
	//   86  160:astore          11
		AnimatorSetCompat.playTogether(((AnimatorSet) (obj)), ((List) (arraylist)));
	//   87  162:aload           11
	//   88  164:aload           9
	//   89  166:invokestatic    #537 <Method void AnimatorSetCompat.playTogether(AnimatorSet, List)>
		((AnimatorSet) (obj)).addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

			public void onAnimationEnd(Animator animator)
			{
				if(!expanded)
			//*   0    0:aload_0         
			//*   1    1:getfield        #22  <Field boolean val$expanded>
			//*   2    4:ifne            31
				{
					child.setVisibility(4);
			//    3    7:aload_0         
			//    4    8:getfield        #24  <Field View val$child>
			//    5   11:iconst_4        
			//    6   12:invokevirtual   #38  <Method void View.setVisibility(int)>
					dependency.setAlpha(1.0F);
			//    7   15:aload_0         
			//    8   16:getfield        #26  <Field View val$dependency>
			//    9   19:fconst_1        
			//   10   20:invokevirtual   #42  <Method void View.setAlpha(float)>
					dependency.setVisibility(0);
			//   11   23:aload_0         
			//   12   24:getfield        #26  <Field View val$dependency>
			//   13   27:iconst_0        
			//   14   28:invokevirtual   #38  <Method void View.setVisibility(int)>
				}
			//   15   31:return          
			}

			public void onAnimationStart(Animator animator)
			{
				if(expanded)
			//*   0    0:aload_0         
			//*   1    1:getfield        #22  <Field boolean val$expanded>
			//*   2    4:ifeq            31
				{
					child.setVisibility(0);
			//    3    7:aload_0         
			//    4    8:getfield        #24  <Field View val$child>
			//    5   11:iconst_0        
			//    6   12:invokevirtual   #38  <Method void View.setVisibility(int)>
					dependency.setAlpha(0.0F);
			//    7   15:aload_0         
			//    8   16:getfield        #26  <Field View val$dependency>
			//    9   19:fconst_0        
			//   10   20:invokevirtual   #42  <Method void View.setAlpha(float)>
					dependency.setVisibility(4);
			//   11   23:aload_0         
			//   12   24:getfield        #26  <Field View val$dependency>
			//   13   27:iconst_4        
			//   14   28:invokevirtual   #38  <Method void View.setVisibility(int)>
				}
			//   15   31:return          
			}

			final FabTransformationBehavior this$0;
			final View val$child;
			final View val$dependency;
			final boolean val$expanded;

			
			{
				this$0 = FabTransformationBehavior.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field FabTransformationBehavior this$0>
				expanded = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #22  <Field boolean val$expanded>
				child = view;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field View val$child>
				dependency = view1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #26  <Field View val$dependency>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #29  <Method void AnimatorListenerAdapter()>
			//   14   25:return          
			}
		}
)));
	//   90  169:aload           11
	//   91  171:new             #6   <Class FabTransformationBehavior$1>
	//   92  174:dup             
	//   93  175:aload_0         
	//   94  176:iload_3         
	//   95  177:aload_2         
	//   96  178:aload_1         
	//   97  179:invokespecial   #540 <Method void FabTransformationBehavior$1(FabTransformationBehavior, boolean, View, View)>
	//   98  182:invokevirtual   #541 <Method void AnimatorSet.addListener(android.animation.Animator$AnimatorListener)>
		int i = 0;
	//   99  185:iconst_0        
	//  100  186:istore          7
		for(int j = ((List) (arraylist1)).size(); i < j; i++)
	//* 101  188:aload           10
	//* 102  190:invokeinterface #544 <Method int List.size()>
	//* 103  195:istore          8
	//* 104  197:iload           7
	//* 105  199:iload           8
	//* 106  201:icmpge          230
			((AnimatorSet) (obj)).addListener((android.animation.Animator.AnimatorListener)((List) (arraylist1)).get(i));
	//  107  204:aload           11
	//  108  206:aload           10
	//  109  208:iload           7
	//  110  210:invokeinterface #548 <Method Object List.get(int)>
	//  111  215:checkcast       #550 <Class android.animation.Animator$AnimatorListener>
	//  112  218:invokevirtual   #541 <Method void AnimatorSet.addListener(android.animation.Animator$AnimatorListener)>

	//  113  221:iload           7
	//  114  223:iconst_1        
	//  115  224:iadd            
	//  116  225:istore          7
	//* 117  227:goto            197
		return ((AnimatorSet) (obj));
	//  118  230:aload           11
	//  119  232:areturn         
	}

	protected abstract FabTransformationSpec onCreateMotionSpec(Context context, boolean flag);

	private final int tmpArray[];
	private final Rect tmpRect;
	private final RectF tmpRectF1;
	private final RectF tmpRectF2;
}
