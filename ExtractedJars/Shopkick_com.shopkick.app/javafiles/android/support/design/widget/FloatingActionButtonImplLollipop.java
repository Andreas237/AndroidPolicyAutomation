// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.*;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.*;
import android.support.design.ripple.RippleUtils;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//			FloatingActionButtonImpl, VisibilityAwareImageButton, ShadowViewDelegate, ShadowDrawableWrapper, 
//			CircularBorderDrawableLollipop, CircularBorderDrawable

class FloatingActionButtonImplLollipop extends FloatingActionButtonImpl
{
	static class AlwaysStatefulGradientDrawable extends GradientDrawable
	{

		public boolean isStateful()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		AlwaysStatefulGradientDrawable()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void GradientDrawable()>
		//    2    4:return          
		}
	}


	FloatingActionButtonImplLollipop(VisibilityAwareImageButton visibilityawareimagebutton, ShadowViewDelegate shadowviewdelegate)
	{
		super(visibilityawareimagebutton, shadowviewdelegate);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #16  <Method void FloatingActionButtonImpl(VisibilityAwareImageButton, ShadowViewDelegate)>
	//    4    6:return          
	}

	private Animator createElevationAnimator(float f, float f1)
	{
		AnimatorSet animatorset = new AnimatorSet();
	//    0    0:new             #22  <Class AnimatorSet>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void AnimatorSet()>
	//    3    7:astore_3        
		animatorset.play(((Animator) (ObjectAnimator.ofFloat(((Object) (view)), "elevation", new float[] {
			f
		}).setDuration(0L)))).with(((Animator) (ObjectAnimator.ofFloat(((Object) (view)), View.TRANSLATION_Z, new float[] {
			f1
		}).setDuration(100L))));
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:getfield        #29  <Field VisibilityAwareImageButton view>
	//    7   13:ldc1            #31  <String "elevation">
	//    8   15:iconst_1        
	//    9   16:newarray        float[]
	//   10   18:dup             
	//   11   19:iconst_0        
	//   12   20:fload_1         
	//   13   21:fastore         
	//   14   22:invokestatic    #37  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   15   25:lconst_0        
	//   16   26:invokevirtual   #41  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   17   29:invokevirtual   #45  <Method android.animation.AnimatorSet$Builder AnimatorSet.play(Animator)>
	//   18   32:aload_0         
	//   19   33:getfield        #29  <Field VisibilityAwareImageButton view>
	//   20   36:getstatic       #51  <Field android.util.Property View.TRANSLATION_Z>
	//   21   39:iconst_1        
	//   22   40:newarray        float[]
	//   23   42:dup             
	//   24   43:iconst_0        
	//   25   44:fload_2         
	//   26   45:fastore         
	//   27   46:invokestatic    #54  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, android.util.Property, float[])>
	//   28   49:ldc2w           #55  <Long 100L>
	//   29   52:invokevirtual   #41  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   30   55:invokevirtual   #61  <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(Animator)>
	//   31   58:pop             
		animatorset.setInterpolator(ELEVATION_ANIM_INTERPOLATOR);
	//   32   59:aload_3         
	//   33   60:getstatic       #65  <Field android.animation.TimeInterpolator ELEVATION_ANIM_INTERPOLATOR>
	//   34   63:invokevirtual   #69  <Method void AnimatorSet.setInterpolator(android.animation.TimeInterpolator)>
		return ((Animator) (animatorset));
	//   35   66:aload_3         
	//   36   67:areturn         
	}

	public float getElevation()
	{
		return view.getElevation();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field VisibilityAwareImageButton view>
	//    2    4:invokevirtual   #76  <Method float VisibilityAwareImageButton.getElevation()>
	//    3    7:freturn         
	}

	void getPadding(Rect rect)
	{
		if(shadowViewDelegate.isCompatPaddingEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field ShadowViewDelegate shadowViewDelegate>
	//*   2    4:invokeinterface #88  <Method boolean ShadowViewDelegate.isCompatPaddingEnabled()>
	//*   3    9:ifeq            71
		{
			float f = shadowViewDelegate.getRadius();
	//    4   12:aload_0         
	//    5   13:getfield        #82  <Field ShadowViewDelegate shadowViewDelegate>
	//    6   16:invokeinterface #91  <Method float ShadowViewDelegate.getRadius()>
	//    7   21:fstore_2        
			float f1 = getElevation() + pressedTranslationZ;
	//    8   22:aload_0         
	//    9   23:invokevirtual   #92  <Method float getElevation()>
	//   10   26:aload_0         
	//   11   27:getfield        #96  <Field float pressedTranslationZ>
	//   12   30:fadd            
	//   13   31:fstore_3        
			int i = (int)Math.ceil(ShadowDrawableWrapper.calculateHorizontalPadding(f1, f, false));
	//   14   32:fload_3         
	//   15   33:fload_2         
	//   16   34:iconst_0        
	//   17   35:invokestatic    #102 <Method float ShadowDrawableWrapper.calculateHorizontalPadding(float, float, boolean)>
	//   18   38:f2d             
	//   19   39:invokestatic    #108 <Method double Math.ceil(double)>
	//   20   42:d2i             
	//   21   43:istore          4
			int j = (int)Math.ceil(ShadowDrawableWrapper.calculateVerticalPadding(f1, f, false));
	//   22   45:fload_3         
	//   23   46:fload_2         
	//   24   47:iconst_0        
	//   25   48:invokestatic    #111 <Method float ShadowDrawableWrapper.calculateVerticalPadding(float, float, boolean)>
	//   26   51:f2d             
	//   27   52:invokestatic    #108 <Method double Math.ceil(double)>
	//   28   55:d2i             
	//   29   56:istore          5
			rect.set(i, j, i, j);
	//   30   58:aload_1         
	//   31   59:iload           4
	//   32   61:iload           5
	//   33   63:iload           4
	//   34   65:iload           5
	//   35   67:invokevirtual   #117 <Method void Rect.set(int, int, int, int)>
			return;
	//   36   70:return          
		} else
		{
			rect.set(0, 0, 0, 0);
	//   37   71:aload_1         
	//   38   72:iconst_0        
	//   39   73:iconst_0        
	//   40   74:iconst_0        
	//   41   75:iconst_0        
	//   42   76:invokevirtual   #117 <Method void Rect.set(int, int, int, int)>
			return;
	//   43   79:return          
		}
	}

	void jumpDrawableToCurrentState()
	{
	//    0    0:return          
	}

	CircularBorderDrawable newCircularDrawable()
	{
		return ((CircularBorderDrawable) (new CircularBorderDrawableLollipop()));
	//    0    0:new             #122 <Class CircularBorderDrawableLollipop>
	//    1    3:dup             
	//    2    4:invokespecial   #123 <Method void CircularBorderDrawableLollipop()>
	//    3    7:areturn         
	}

	GradientDrawable newGradientDrawableForShape()
	{
		return ((GradientDrawable) (new AlwaysStatefulGradientDrawable()));
	//    0    0:new             #6   <Class FloatingActionButtonImplLollipop$AlwaysStatefulGradientDrawable>
	//    1    3:dup             
	//    2    4:invokespecial   #126 <Method void FloatingActionButtonImplLollipop$AlwaysStatefulGradientDrawable()>
	//    3    7:areturn         
	}

	void onCompatShadowChanged()
	{
		updatePadding();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #130 <Method void updatePadding()>
	//    2    4:return          
	}

	void onDrawableStateChanged(int ai[])
	{
		if(android.os.Build.VERSION.SDK_INT == 21)
	//*   0    0:getstatic       #138 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpne          111
		{
			if(view.isEnabled())
	//*   3    8:aload_0         
	//*   4    9:getfield        #29  <Field VisibilityAwareImageButton view>
	//*   5   12:invokevirtual   #141 <Method boolean VisibilityAwareImageButton.isEnabled()>
	//*   6   15:ifeq            95
			{
				view.setElevation(elevation);
	//    7   18:aload_0         
	//    8   19:getfield        #29  <Field VisibilityAwareImageButton view>
	//    9   22:aload_0         
	//   10   23:getfield        #143 <Field float elevation>
	//   11   26:invokevirtual   #147 <Method void VisibilityAwareImageButton.setElevation(float)>
				if(view.isPressed())
	//*  12   29:aload_0         
	//*  13   30:getfield        #29  <Field VisibilityAwareImageButton view>
	//*  14   33:invokevirtual   #150 <Method boolean VisibilityAwareImageButton.isPressed()>
	//*  15   36:ifeq            51
				{
					view.setTranslationZ(pressedTranslationZ);
	//   16   39:aload_0         
	//   17   40:getfield        #29  <Field VisibilityAwareImageButton view>
	//   18   43:aload_0         
	//   19   44:getfield        #96  <Field float pressedTranslationZ>
	//   20   47:invokevirtual   #153 <Method void VisibilityAwareImageButton.setTranslationZ(float)>
					return;
	//   21   50:return          
				}
				if(!view.isFocused() && !view.isHovered())
	//*  22   51:aload_0         
	//*  23   52:getfield        #29  <Field VisibilityAwareImageButton view>
	//*  24   55:invokevirtual   #156 <Method boolean VisibilityAwareImageButton.isFocused()>
	//*  25   58:ifne            83
	//*  26   61:aload_0         
	//*  27   62:getfield        #29  <Field VisibilityAwareImageButton view>
	//*  28   65:invokevirtual   #159 <Method boolean VisibilityAwareImageButton.isHovered()>
	//*  29   68:ifeq            74
	//*  30   71:goto            83
				{
					view.setTranslationZ(0.0F);
	//   31   74:aload_0         
	//   32   75:getfield        #29  <Field VisibilityAwareImageButton view>
	//   33   78:fconst_0        
	//   34   79:invokevirtual   #153 <Method void VisibilityAwareImageButton.setTranslationZ(float)>
					return;
	//   35   82:return          
				} else
				{
					view.setTranslationZ(hoveredFocusedTranslationZ);
	//   36   83:aload_0         
	//   37   84:getfield        #29  <Field VisibilityAwareImageButton view>
	//   38   87:aload_0         
	//   39   88:getfield        #162 <Field float hoveredFocusedTranslationZ>
	//   40   91:invokevirtual   #153 <Method void VisibilityAwareImageButton.setTranslationZ(float)>
					return;
	//   41   94:return          
				}
			}
			view.setElevation(0.0F);
	//   42   95:aload_0         
	//   43   96:getfield        #29  <Field VisibilityAwareImageButton view>
	//   44   99:fconst_0        
	//   45  100:invokevirtual   #147 <Method void VisibilityAwareImageButton.setElevation(float)>
			view.setTranslationZ(0.0F);
	//   46  103:aload_0         
	//   47  104:getfield        #29  <Field VisibilityAwareImageButton view>
	//   48  107:fconst_0        
	//   49  108:invokevirtual   #153 <Method void VisibilityAwareImageButton.setTranslationZ(float)>
		}
	//   50  111:return          
	}

	void onElevationsChanged(float f, float f1, float f2)
	{
		if(android.os.Build.VERSION.SDK_INT == 21)
	//*   0    0:getstatic       #138 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpne          18
		{
			view.refreshDrawableState();
	//    3    8:aload_0         
	//    4    9:getfield        #29  <Field VisibilityAwareImageButton view>
	//    5   12:invokevirtual   #167 <Method void VisibilityAwareImageButton.refreshDrawableState()>
		} else
	//*   6   15:goto            273
		{
			StateListAnimator statelistanimator = new StateListAnimator();
	//    7   18:new             #169 <Class StateListAnimator>
	//    8   21:dup             
	//    9   22:invokespecial   #170 <Method void StateListAnimator()>
	//   10   25:astore          4
			statelistanimator.addState(PRESSED_ENABLED_STATE_SET, createElevationAnimator(f, f2));
	//   11   27:aload           4
	//   12   29:getstatic       #174 <Field int[] PRESSED_ENABLED_STATE_SET>
	//   13   32:aload_0         
	//   14   33:fload_1         
	//   15   34:fload_3         
	//   16   35:invokespecial   #176 <Method Animator createElevationAnimator(float, float)>
	//   17   38:invokevirtual   #180 <Method void StateListAnimator.addState(int[], Animator)>
			statelistanimator.addState(HOVERED_FOCUSED_ENABLED_STATE_SET, createElevationAnimator(f, f1));
	//   18   41:aload           4
	//   19   43:getstatic       #183 <Field int[] HOVERED_FOCUSED_ENABLED_STATE_SET>
	//   20   46:aload_0         
	//   21   47:fload_1         
	//   22   48:fload_2         
	//   23   49:invokespecial   #176 <Method Animator createElevationAnimator(float, float)>
	//   24   52:invokevirtual   #180 <Method void StateListAnimator.addState(int[], Animator)>
			statelistanimator.addState(FOCUSED_ENABLED_STATE_SET, createElevationAnimator(f, f1));
	//   25   55:aload           4
	//   26   57:getstatic       #186 <Field int[] FOCUSED_ENABLED_STATE_SET>
	//   27   60:aload_0         
	//   28   61:fload_1         
	//   29   62:fload_2         
	//   30   63:invokespecial   #176 <Method Animator createElevationAnimator(float, float)>
	//   31   66:invokevirtual   #180 <Method void StateListAnimator.addState(int[], Animator)>
			statelistanimator.addState(HOVERED_ENABLED_STATE_SET, createElevationAnimator(f, f1));
	//   32   69:aload           4
	//   33   71:getstatic       #189 <Field int[] HOVERED_ENABLED_STATE_SET>
	//   34   74:aload_0         
	//   35   75:fload_1         
	//   36   76:fload_2         
	//   37   77:invokespecial   #176 <Method Animator createElevationAnimator(float, float)>
	//   38   80:invokevirtual   #180 <Method void StateListAnimator.addState(int[], Animator)>
			AnimatorSet animatorset = new AnimatorSet();
	//   39   83:new             #22  <Class AnimatorSet>
	//   40   86:dup             
	//   41   87:invokespecial   #25  <Method void AnimatorSet()>
	//   42   90:astore          5
			ArrayList arraylist = new ArrayList();
	//   43   92:new             #191 <Class ArrayList>
	//   44   95:dup             
	//   45   96:invokespecial   #192 <Method void ArrayList()>
	//   46   99:astore          6
			((List) (arraylist)).add(((Object) (ObjectAnimator.ofFloat(((Object) (view)), "elevation", new float[] {
				f
			}).setDuration(0L))));
	//   47  101:aload           6
	//   48  103:aload_0         
	//   49  104:getfield        #29  <Field VisibilityAwareImageButton view>
	//   50  107:ldc1            #31  <String "elevation">
	//   51  109:iconst_1        
	//   52  110:newarray        float[]
	//   53  112:dup             
	//   54  113:iconst_0        
	//   55  114:fload_1         
	//   56  115:fastore         
	//   57  116:invokestatic    #37  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   58  119:lconst_0        
	//   59  120:invokevirtual   #41  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   60  123:invokeinterface #198 <Method boolean List.add(Object)>
	//   61  128:pop             
			if(android.os.Build.VERSION.SDK_INT >= 22 && android.os.Build.VERSION.SDK_INT <= 24)
	//*  62  129:getstatic       #138 <Field int android.os.Build$VERSION.SDK_INT>
	//*  63  132:bipush          22
	//*  64  134:icmplt          182
	//*  65  137:getstatic       #138 <Field int android.os.Build$VERSION.SDK_INT>
	//*  66  140:bipush          24
	//*  67  142:icmpgt          182
				((List) (arraylist)).add(((Object) (ObjectAnimator.ofFloat(((Object) (view)), View.TRANSLATION_Z, new float[] {
					view.getTranslationZ()
				}).setDuration(100L))));
	//   68  145:aload           6
	//   69  147:aload_0         
	//   70  148:getfield        #29  <Field VisibilityAwareImageButton view>
	//   71  151:getstatic       #51  <Field android.util.Property View.TRANSLATION_Z>
	//   72  154:iconst_1        
	//   73  155:newarray        float[]
	//   74  157:dup             
	//   75  158:iconst_0        
	//   76  159:aload_0         
	//   77  160:getfield        #29  <Field VisibilityAwareImageButton view>
	//   78  163:invokevirtual   #201 <Method float VisibilityAwareImageButton.getTranslationZ()>
	//   79  166:fastore         
	//   80  167:invokestatic    #54  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, android.util.Property, float[])>
	//   81  170:ldc2w           #55  <Long 100L>
	//   82  173:invokevirtual   #41  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   83  176:invokeinterface #198 <Method boolean List.add(Object)>
	//   84  181:pop             
			((List) (arraylist)).add(((Object) (ObjectAnimator.ofFloat(((Object) (view)), View.TRANSLATION_Z, new float[] {
				0.0F
			}).setDuration(100L))));
	//   85  182:aload           6
	//   86  184:aload_0         
	//   87  185:getfield        #29  <Field VisibilityAwareImageButton view>
	//   88  188:getstatic       #51  <Field android.util.Property View.TRANSLATION_Z>
	//   89  191:iconst_1        
	//   90  192:newarray        float[]
	//   91  194:dup             
	//   92  195:iconst_0        
	//   93  196:fconst_0        
	//   94  197:fastore         
	//   95  198:invokestatic    #54  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, android.util.Property, float[])>
	//   96  201:ldc2w           #55  <Long 100L>
	//   97  204:invokevirtual   #41  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   98  207:invokeinterface #198 <Method boolean List.add(Object)>
	//   99  212:pop             
			animatorset.playSequentially((Animator[])((List) (arraylist)).toArray(((Object []) (new Animator[0]))));
	//  100  213:aload           5
	//  101  215:aload           6
	//  102  217:iconst_0        
	//  103  218:anewarray       Animator[]
	//  104  221:invokeinterface #207 <Method Object[] List.toArray(Object[])>
	//  105  226:checkcast       #209 <Class Animator[]>
	//  106  229:invokevirtual   #213 <Method void AnimatorSet.playSequentially(Animator[])>
			animatorset.setInterpolator(ELEVATION_ANIM_INTERPOLATOR);
	//  107  232:aload           5
	//  108  234:getstatic       #65  <Field android.animation.TimeInterpolator ELEVATION_ANIM_INTERPOLATOR>
	//  109  237:invokevirtual   #69  <Method void AnimatorSet.setInterpolator(android.animation.TimeInterpolator)>
			statelistanimator.addState(ENABLED_STATE_SET, ((Animator) (animatorset)));
	//  110  240:aload           4
	//  111  242:getstatic       #216 <Field int[] ENABLED_STATE_SET>
	//  112  245:aload           5
	//  113  247:invokevirtual   #180 <Method void StateListAnimator.addState(int[], Animator)>
			statelistanimator.addState(EMPTY_STATE_SET, createElevationAnimator(0.0F, 0.0F));
	//  114  250:aload           4
	//  115  252:getstatic       #219 <Field int[] EMPTY_STATE_SET>
	//  116  255:aload_0         
	//  117  256:fconst_0        
	//  118  257:fconst_0        
	//  119  258:invokespecial   #176 <Method Animator createElevationAnimator(float, float)>
	//  120  261:invokevirtual   #180 <Method void StateListAnimator.addState(int[], Animator)>
			view.setStateListAnimator(statelistanimator);
	//  121  264:aload_0         
	//  122  265:getfield        #29  <Field VisibilityAwareImageButton view>
	//  123  268:aload           4
	//  124  270:invokevirtual   #223 <Method void VisibilityAwareImageButton.setStateListAnimator(StateListAnimator)>
		}
		if(shadowViewDelegate.isCompatPaddingEnabled())
	//* 125  273:aload_0         
	//* 126  274:getfield        #82  <Field ShadowViewDelegate shadowViewDelegate>
	//* 127  277:invokeinterface #88  <Method boolean ShadowViewDelegate.isCompatPaddingEnabled()>
	//* 128  282:ifeq            289
			updatePadding();
	//  129  285:aload_0         
	//  130  286:invokevirtual   #130 <Method void updatePadding()>
	//  131  289:return          
	}

	void onPaddingUpdated(Rect rect)
	{
		if(shadowViewDelegate.isCompatPaddingEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field ShadowViewDelegate shadowViewDelegate>
	//*   2    4:invokeinterface #88  <Method boolean ShadowViewDelegate.isCompatPaddingEnabled()>
	//*   3    9:ifeq            57
		{
			insetDrawable = new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
	//    4   12:aload_0         
	//    5   13:new             #226 <Class InsetDrawable>
	//    6   16:dup             
	//    7   17:aload_0         
	//    8   18:getfield        #230 <Field Drawable rippleDrawable>
	//    9   21:aload_1         
	//   10   22:getfield        #233 <Field int Rect.left>
	//   11   25:aload_1         
	//   12   26:getfield        #236 <Field int Rect.top>
	//   13   29:aload_1         
	//   14   30:getfield        #239 <Field int Rect.right>
	//   15   33:aload_1         
	//   16   34:getfield        #242 <Field int Rect.bottom>
	//   17   37:invokespecial   #245 <Method void InsetDrawable(Drawable, int, int, int, int)>
	//   18   40:putfield        #247 <Field InsetDrawable insetDrawable>
			shadowViewDelegate.setBackgroundDrawable(((Drawable) (insetDrawable)));
	//   19   43:aload_0         
	//   20   44:getfield        #82  <Field ShadowViewDelegate shadowViewDelegate>
	//   21   47:aload_0         
	//   22   48:getfield        #247 <Field InsetDrawable insetDrawable>
	//   23   51:invokeinterface #251 <Method void ShadowViewDelegate.setBackgroundDrawable(Drawable)>
			return;
	//   24   56:return          
		} else
		{
			shadowViewDelegate.setBackgroundDrawable(rippleDrawable);
	//   25   57:aload_0         
	//   26   58:getfield        #82  <Field ShadowViewDelegate shadowViewDelegate>
	//   27   61:aload_0         
	//   28   62:getfield        #230 <Field Drawable rippleDrawable>
	//   29   65:invokeinterface #251 <Method void ShadowViewDelegate.setBackgroundDrawable(Drawable)>
			return;
	//   30   70:return          
		}
	}

	boolean requirePreDrawListener()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	void setBackgroundDrawable(ColorStateList colorstatelist, android.graphics.PorterDuff.Mode mode, ColorStateList colorstatelist1, int i)
	{
		shapeDrawable = DrawableCompat.wrap(((Drawable) (createShapeDrawable())));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #256 <Method GradientDrawable createShapeDrawable()>
	//    3    5:invokestatic    #262 <Method Drawable DrawableCompat.wrap(Drawable)>
	//    4    8:putfield        #265 <Field Drawable shapeDrawable>
		DrawableCompat.setTintList(shapeDrawable, colorstatelist);
	//    5   11:aload_0         
	//    6   12:getfield        #265 <Field Drawable shapeDrawable>
	//    7   15:aload_1         
	//    8   16:invokestatic    #269 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
		if(mode != null)
	//*   9   19:aload_2         
	//*  10   20:ifnull          31
			DrawableCompat.setTintMode(shapeDrawable, mode);
	//   11   23:aload_0         
	//   12   24:getfield        #265 <Field Drawable shapeDrawable>
	//   13   27:aload_2         
	//   14   28:invokestatic    #273 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
		if(i > 0)
	//*  15   31:iload           4
	//*  16   33:ifle            76
		{
			borderDrawable = createBorderDrawable(i, colorstatelist);
	//   17   36:aload_0         
	//   18   37:aload_0         
	//   19   38:iload           4
	//   20   40:aload_1         
	//   21   41:invokevirtual   #277 <Method CircularBorderDrawable createBorderDrawable(int, ColorStateList)>
	//   22   44:putfield        #281 <Field CircularBorderDrawable borderDrawable>
			colorstatelist = ((ColorStateList) (new LayerDrawable(new Drawable[] {
				borderDrawable, shapeDrawable
			})));
	//   23   47:new             #283 <Class LayerDrawable>
	//   24   50:dup             
	//   25   51:iconst_2        
	//   26   52:anewarray       Drawable[]
	//   27   55:dup             
	//   28   56:iconst_0        
	//   29   57:aload_0         
	//   30   58:getfield        #281 <Field CircularBorderDrawable borderDrawable>
	//   31   61:aastore         
	//   32   62:dup             
	//   33   63:iconst_1        
	//   34   64:aload_0         
	//   35   65:getfield        #265 <Field Drawable shapeDrawable>
	//   36   68:aastore         
	//   37   69:invokespecial   #288 <Method void LayerDrawable(Drawable[])>
	//   38   72:astore_1        
		} else
	//*  39   73:goto            86
		{
			borderDrawable = null;
	//   40   76:aload_0         
	//   41   77:aconst_null     
	//   42   78:putfield        #281 <Field CircularBorderDrawable borderDrawable>
			colorstatelist = ((ColorStateList) (shapeDrawable));
	//   43   81:aload_0         
	//   44   82:getfield        #265 <Field Drawable shapeDrawable>
	//   45   85:astore_1        
		}
		rippleDrawable = ((Drawable) (new RippleDrawable(RippleUtils.convertToRippleDrawableColor(colorstatelist1), ((Drawable) (colorstatelist)), ((Drawable) (null)))));
	//   46   86:aload_0         
	//   47   87:new             #290 <Class RippleDrawable>
	//   48   90:dup             
	//   49   91:aload_3         
	//   50   92:invokestatic    #296 <Method ColorStateList RippleUtils.convertToRippleDrawableColor(ColorStateList)>
	//   51   95:aload_1         
	//   52   96:aconst_null     
	//   53   97:invokespecial   #299 <Method void RippleDrawable(ColorStateList, Drawable, Drawable)>
	//   54  100:putfield        #230 <Field Drawable rippleDrawable>
		contentBackground = rippleDrawable;
	//   55  103:aload_0         
	//   56  104:aload_0         
	//   57  105:getfield        #230 <Field Drawable rippleDrawable>
	//   58  108:putfield        #302 <Field Drawable contentBackground>
		shadowViewDelegate.setBackgroundDrawable(rippleDrawable);
	//   59  111:aload_0         
	//   60  112:getfield        #82  <Field ShadowViewDelegate shadowViewDelegate>
	//   61  115:aload_0         
	//   62  116:getfield        #230 <Field Drawable rippleDrawable>
	//   63  119:invokeinterface #251 <Method void ShadowViewDelegate.setBackgroundDrawable(Drawable)>
	//   64  124:return          
	}

	void setRippleColor(ColorStateList colorstatelist)
	{
		if(rippleDrawable instanceof RippleDrawable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #230 <Field Drawable rippleDrawable>
	//*   2    4:instanceof      #290 <Class RippleDrawable>
	//*   3    7:ifeq            25
		{
			((RippleDrawable)rippleDrawable).setColor(RippleUtils.convertToRippleDrawableColor(colorstatelist));
	//    4   10:aload_0         
	//    5   11:getfield        #230 <Field Drawable rippleDrawable>
	//    6   14:checkcast       #290 <Class RippleDrawable>
	//    7   17:aload_1         
	//    8   18:invokestatic    #296 <Method ColorStateList RippleUtils.convertToRippleDrawableColor(ColorStateList)>
	//    9   21:invokevirtual   #307 <Method void RippleDrawable.setColor(ColorStateList)>
			return;
	//   10   24:return          
		} else
		{
			super.setRippleColor(colorstatelist);
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:invokespecial   #309 <Method void FloatingActionButtonImpl.setRippleColor(ColorStateList)>
			return;
	//   14   30:return          
		}
	}

	private InsetDrawable insetDrawable;
}
