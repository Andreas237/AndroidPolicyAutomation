// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.*;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.*;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//			FloatingActionButtonImpl, VisibilityAwareImageButton, ShadowViewDelegate, ShadowDrawableWrapper, 
//			CircularBorderDrawableLollipop, CircularBorderDrawable

class FloatingActionButtonLollipop extends FloatingActionButtonImpl
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


	FloatingActionButtonLollipop(VisibilityAwareImageButton visibilityawareimagebutton, ShadowViewDelegate shadowviewdelegate)
	{
		super(visibilityawareimagebutton, shadowviewdelegate);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #16  <Method void FloatingActionButtonImpl(VisibilityAwareImageButton, ShadowViewDelegate)>
	//    4    6:return          
	}

	public float getElevation()
	{
		return mView.getElevation();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field VisibilityAwareImageButton mView>
	//    2    4:invokevirtual   #27  <Method float VisibilityAwareImageButton.getElevation()>
	//    3    7:freturn         
	}

	void getPadding(Rect rect)
	{
		if(mShadowViewDelegate.isCompatPaddingEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field ShadowViewDelegate mShadowViewDelegate>
	//*   2    4:invokeinterface #39  <Method boolean ShadowViewDelegate.isCompatPaddingEnabled()>
	//*   3    9:ifeq            71
		{
			float f = mShadowViewDelegate.getRadius();
	//    4   12:aload_0         
	//    5   13:getfield        #33  <Field ShadowViewDelegate mShadowViewDelegate>
	//    6   16:invokeinterface #42  <Method float ShadowViewDelegate.getRadius()>
	//    7   21:fstore_2        
			float f1 = getElevation() + mPressedTranslationZ;
	//    8   22:aload_0         
	//    9   23:invokevirtual   #43  <Method float getElevation()>
	//   10   26:aload_0         
	//   11   27:getfield        #47  <Field float mPressedTranslationZ>
	//   12   30:fadd            
	//   13   31:fstore_3        
			int i = (int)Math.ceil(ShadowDrawableWrapper.calculateHorizontalPadding(f1, f, false));
	//   14   32:fload_3         
	//   15   33:fload_2         
	//   16   34:iconst_0        
	//   17   35:invokestatic    #53  <Method float ShadowDrawableWrapper.calculateHorizontalPadding(float, float, boolean)>
	//   18   38:f2d             
	//   19   39:invokestatic    #59  <Method double Math.ceil(double)>
	//   20   42:d2i             
	//   21   43:istore          4
			int j = (int)Math.ceil(ShadowDrawableWrapper.calculateVerticalPadding(f1, f, false));
	//   22   45:fload_3         
	//   23   46:fload_2         
	//   24   47:iconst_0        
	//   25   48:invokestatic    #62  <Method float ShadowDrawableWrapper.calculateVerticalPadding(float, float, boolean)>
	//   26   51:f2d             
	//   27   52:invokestatic    #59  <Method double Math.ceil(double)>
	//   28   55:d2i             
	//   29   56:istore          5
			rect.set(i, j, i, j);
	//   30   58:aload_1         
	//   31   59:iload           4
	//   32   61:iload           5
	//   33   63:iload           4
	//   34   65:iload           5
	//   35   67:invokevirtual   #68  <Method void Rect.set(int, int, int, int)>
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
	//   42   76:invokevirtual   #68  <Method void Rect.set(int, int, int, int)>
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
	//    0    0:new             #74  <Class CircularBorderDrawableLollipop>
	//    1    3:dup             
	//    2    4:invokespecial   #76  <Method void CircularBorderDrawableLollipop()>
	//    3    7:areturn         
	}

	GradientDrawable newGradientDrawableForShape()
	{
		return ((GradientDrawable) (new AlwaysStatefulGradientDrawable()));
	//    0    0:new             #6   <Class FloatingActionButtonLollipop$AlwaysStatefulGradientDrawable>
	//    1    3:dup             
	//    2    4:invokespecial   #79  <Method void FloatingActionButtonLollipop$AlwaysStatefulGradientDrawable()>
	//    3    7:areturn         
	}

	void onCompatShadowChanged()
	{
		updatePadding();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #83  <Method void updatePadding()>
	//    2    4:return          
	}

	void onDrawableStateChanged(int ai[])
	{
	//    0    0:return          
	}

	void onElevationsChanged(float f, float f1)
	{
		if(android.os.Build.VERSION.SDK_INT == 21)
	//*   0    0:getstatic       #93  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpne          90
		{
			if(mView.isEnabled())
	//*   3    8:aload_0         
	//*   4    9:getfield        #23  <Field VisibilityAwareImageButton mView>
	//*   5   12:invokevirtual   #96  <Method boolean VisibilityAwareImageButton.isEnabled()>
	//*   6   15:ifeq            71
			{
				mView.setElevation(f);
	//    7   18:aload_0         
	//    8   19:getfield        #23  <Field VisibilityAwareImageButton mView>
	//    9   22:fload_1         
	//   10   23:invokevirtual   #100 <Method void VisibilityAwareImageButton.setElevation(float)>
				if(!mView.isFocused() && !mView.isPressed())
	//*  11   26:aload_0         
	//*  12   27:getfield        #23  <Field VisibilityAwareImageButton mView>
	//*  13   30:invokevirtual   #103 <Method boolean VisibilityAwareImageButton.isFocused()>
	//*  14   33:ifne            60
	//*  15   36:aload_0         
	//*  16   37:getfield        #23  <Field VisibilityAwareImageButton mView>
	//*  17   40:invokevirtual   #106 <Method boolean VisibilityAwareImageButton.isPressed()>
	//*  18   43:ifeq            49
	//*  19   46:goto            60
					mView.setTranslationZ(0.0F);
	//   20   49:aload_0         
	//   21   50:getfield        #23  <Field VisibilityAwareImageButton mView>
	//   22   53:fconst_0        
	//   23   54:invokevirtual   #109 <Method void VisibilityAwareImageButton.setTranslationZ(float)>
				else
	//*  24   57:goto            504
					mView.setTranslationZ(f1);
	//   25   60:aload_0         
	//   26   61:getfield        #23  <Field VisibilityAwareImageButton mView>
	//   27   64:fload_2         
	//   28   65:invokevirtual   #109 <Method void VisibilityAwareImageButton.setTranslationZ(float)>
			} else
	//*  29   68:goto            504
			{
				mView.setElevation(0.0F);
	//   30   71:aload_0         
	//   31   72:getfield        #23  <Field VisibilityAwareImageButton mView>
	//   32   75:fconst_0        
	//   33   76:invokevirtual   #100 <Method void VisibilityAwareImageButton.setElevation(float)>
				mView.setTranslationZ(0.0F);
	//   34   79:aload_0         
	//   35   80:getfield        #23  <Field VisibilityAwareImageButton mView>
	//   36   83:fconst_0        
	//   37   84:invokevirtual   #109 <Method void VisibilityAwareImageButton.setTranslationZ(float)>
			}
		} else
	//*  38   87:goto            504
		{
			StateListAnimator statelistanimator = new StateListAnimator();
	//   39   90:new             #111 <Class StateListAnimator>
	//   40   93:dup             
	//   41   94:invokespecial   #112 <Method void StateListAnimator()>
	//   42   97:astore_3        
			AnimatorSet animatorset = new AnimatorSet();
	//   43   98:new             #114 <Class AnimatorSet>
	//   44  101:dup             
	//   45  102:invokespecial   #115 <Method void AnimatorSet()>
	//   46  105:astore          4
			animatorset.play(((android.animation.Animator) (ObjectAnimator.ofFloat(((Object) (mView)), "elevation", new float[] {
				f
			}).setDuration(0L)))).with(((android.animation.Animator) (ObjectAnimator.ofFloat(((Object) (mView)), View.TRANSLATION_Z, new float[] {
				f1
			}).setDuration(100L))));
	//   47  107:aload           4
	//   48  109:aload_0         
	//   49  110:getfield        #23  <Field VisibilityAwareImageButton mView>
	//   50  113:ldc1            #117 <String "elevation">
	//   51  115:iconst_1        
	//   52  116:newarray        float[]
	//   53  118:dup             
	//   54  119:iconst_0        
	//   55  120:fload_1         
	//   56  121:fastore         
	//   57  122:invokestatic    #123 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   58  125:lconst_0        
	//   59  126:invokevirtual   #127 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   60  129:invokevirtual   #131 <Method android.animation.AnimatorSet$Builder AnimatorSet.play(android.animation.Animator)>
	//   61  132:aload_0         
	//   62  133:getfield        #23  <Field VisibilityAwareImageButton mView>
	//   63  136:getstatic       #137 <Field android.util.Property View.TRANSLATION_Z>
	//   64  139:iconst_1        
	//   65  140:newarray        float[]
	//   66  142:dup             
	//   67  143:iconst_0        
	//   68  144:fload_2         
	//   69  145:fastore         
	//   70  146:invokestatic    #140 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, android.util.Property, float[])>
	//   71  149:ldc2w           #141 <Long 100L>
	//   72  152:invokevirtual   #127 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   73  155:invokevirtual   #147 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(android.animation.Animator)>
	//   74  158:pop             
			animatorset.setInterpolator(((android.animation.TimeInterpolator) (ANIM_INTERPOLATOR)));
	//   75  159:aload           4
	//   76  161:getstatic       #151 <Field android.view.animation.Interpolator ANIM_INTERPOLATOR>
	//   77  164:invokevirtual   #155 <Method void AnimatorSet.setInterpolator(android.animation.TimeInterpolator)>
			statelistanimator.addState(PRESSED_ENABLED_STATE_SET, ((android.animation.Animator) (animatorset)));
	//   78  167:aload_3         
	//   79  168:getstatic       #159 <Field int[] PRESSED_ENABLED_STATE_SET>
	//   80  171:aload           4
	//   81  173:invokevirtual   #163 <Method void StateListAnimator.addState(int[], android.animation.Animator)>
			animatorset = new AnimatorSet();
	//   82  176:new             #114 <Class AnimatorSet>
	//   83  179:dup             
	//   84  180:invokespecial   #115 <Method void AnimatorSet()>
	//   85  183:astore          4
			animatorset.play(((android.animation.Animator) (ObjectAnimator.ofFloat(((Object) (mView)), "elevation", new float[] {
				f
			}).setDuration(0L)))).with(((android.animation.Animator) (ObjectAnimator.ofFloat(((Object) (mView)), View.TRANSLATION_Z, new float[] {
				f1
			}).setDuration(100L))));
	//   86  185:aload           4
	//   87  187:aload_0         
	//   88  188:getfield        #23  <Field VisibilityAwareImageButton mView>
	//   89  191:ldc1            #117 <String "elevation">
	//   90  193:iconst_1        
	//   91  194:newarray        float[]
	//   92  196:dup             
	//   93  197:iconst_0        
	//   94  198:fload_1         
	//   95  199:fastore         
	//   96  200:invokestatic    #123 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   97  203:lconst_0        
	//   98  204:invokevirtual   #127 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   99  207:invokevirtual   #131 <Method android.animation.AnimatorSet$Builder AnimatorSet.play(android.animation.Animator)>
	//  100  210:aload_0         
	//  101  211:getfield        #23  <Field VisibilityAwareImageButton mView>
	//  102  214:getstatic       #137 <Field android.util.Property View.TRANSLATION_Z>
	//  103  217:iconst_1        
	//  104  218:newarray        float[]
	//  105  220:dup             
	//  106  221:iconst_0        
	//  107  222:fload_2         
	//  108  223:fastore         
	//  109  224:invokestatic    #140 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, android.util.Property, float[])>
	//  110  227:ldc2w           #141 <Long 100L>
	//  111  230:invokevirtual   #127 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  112  233:invokevirtual   #147 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(android.animation.Animator)>
	//  113  236:pop             
			animatorset.setInterpolator(((android.animation.TimeInterpolator) (ANIM_INTERPOLATOR)));
	//  114  237:aload           4
	//  115  239:getstatic       #151 <Field android.view.animation.Interpolator ANIM_INTERPOLATOR>
	//  116  242:invokevirtual   #155 <Method void AnimatorSet.setInterpolator(android.animation.TimeInterpolator)>
			statelistanimator.addState(FOCUSED_ENABLED_STATE_SET, ((android.animation.Animator) (animatorset)));
	//  117  245:aload_3         
	//  118  246:getstatic       #166 <Field int[] FOCUSED_ENABLED_STATE_SET>
	//  119  249:aload           4
	//  120  251:invokevirtual   #163 <Method void StateListAnimator.addState(int[], android.animation.Animator)>
			animatorset = new AnimatorSet();
	//  121  254:new             #114 <Class AnimatorSet>
	//  122  257:dup             
	//  123  258:invokespecial   #115 <Method void AnimatorSet()>
	//  124  261:astore          4
			ArrayList arraylist = new ArrayList();
	//  125  263:new             #168 <Class ArrayList>
	//  126  266:dup             
	//  127  267:invokespecial   #169 <Method void ArrayList()>
	//  128  270:astore          5
			((List) (arraylist)).add(((Object) (ObjectAnimator.ofFloat(((Object) (mView)), "elevation", new float[] {
				f
			}).setDuration(0L))));
	//  129  272:aload           5
	//  130  274:aload_0         
	//  131  275:getfield        #23  <Field VisibilityAwareImageButton mView>
	//  132  278:ldc1            #117 <String "elevation">
	//  133  280:iconst_1        
	//  134  281:newarray        float[]
	//  135  283:dup             
	//  136  284:iconst_0        
	//  137  285:fload_1         
	//  138  286:fastore         
	//  139  287:invokestatic    #123 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//  140  290:lconst_0        
	//  141  291:invokevirtual   #127 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  142  294:invokeinterface #175 <Method boolean List.add(Object)>
	//  143  299:pop             
			if(android.os.Build.VERSION.SDK_INT >= 22 && android.os.Build.VERSION.SDK_INT <= 24)
	//* 144  300:getstatic       #93  <Field int android.os.Build$VERSION.SDK_INT>
	//* 145  303:bipush          22
	//* 146  305:icmplt          353
	//* 147  308:getstatic       #93  <Field int android.os.Build$VERSION.SDK_INT>
	//* 148  311:bipush          24
	//* 149  313:icmpgt          353
				((List) (arraylist)).add(((Object) (ObjectAnimator.ofFloat(((Object) (mView)), View.TRANSLATION_Z, new float[] {
					mView.getTranslationZ()
				}).setDuration(100L))));
	//  150  316:aload           5
	//  151  318:aload_0         
	//  152  319:getfield        #23  <Field VisibilityAwareImageButton mView>
	//  153  322:getstatic       #137 <Field android.util.Property View.TRANSLATION_Z>
	//  154  325:iconst_1        
	//  155  326:newarray        float[]
	//  156  328:dup             
	//  157  329:iconst_0        
	//  158  330:aload_0         
	//  159  331:getfield        #23  <Field VisibilityAwareImageButton mView>
	//  160  334:invokevirtual   #178 <Method float VisibilityAwareImageButton.getTranslationZ()>
	//  161  337:fastore         
	//  162  338:invokestatic    #140 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, android.util.Property, float[])>
	//  163  341:ldc2w           #141 <Long 100L>
	//  164  344:invokevirtual   #127 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  165  347:invokeinterface #175 <Method boolean List.add(Object)>
	//  166  352:pop             
			((List) (arraylist)).add(((Object) (ObjectAnimator.ofFloat(((Object) (mView)), View.TRANSLATION_Z, new float[] {
				0.0F
			}).setDuration(100L))));
	//  167  353:aload           5
	//  168  355:aload_0         
	//  169  356:getfield        #23  <Field VisibilityAwareImageButton mView>
	//  170  359:getstatic       #137 <Field android.util.Property View.TRANSLATION_Z>
	//  171  362:iconst_1        
	//  172  363:newarray        float[]
	//  173  365:dup             
	//  174  366:iconst_0        
	//  175  367:fconst_0        
	//  176  368:fastore         
	//  177  369:invokestatic    #140 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, android.util.Property, float[])>
	//  178  372:ldc2w           #141 <Long 100L>
	//  179  375:invokevirtual   #127 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  180  378:invokeinterface #175 <Method boolean List.add(Object)>
	//  181  383:pop             
			animatorset.playSequentially((android.animation.Animator[])((List) (arraylist)).toArray(((Object []) (new ObjectAnimator[0]))));
	//  182  384:aload           4
	//  183  386:aload           5
	//  184  388:iconst_0        
	//  185  389:anewarray       ObjectAnimator[]
	//  186  392:invokeinterface #182 <Method Object[] List.toArray(Object[])>
	//  187  397:checkcast       #184 <Class android.animation.Animator[]>
	//  188  400:invokevirtual   #188 <Method void AnimatorSet.playSequentially(android.animation.Animator[])>
			animatorset.setInterpolator(((android.animation.TimeInterpolator) (ANIM_INTERPOLATOR)));
	//  189  403:aload           4
	//  190  405:getstatic       #151 <Field android.view.animation.Interpolator ANIM_INTERPOLATOR>
	//  191  408:invokevirtual   #155 <Method void AnimatorSet.setInterpolator(android.animation.TimeInterpolator)>
			statelistanimator.addState(ENABLED_STATE_SET, ((android.animation.Animator) (animatorset)));
	//  192  411:aload_3         
	//  193  412:getstatic       #191 <Field int[] ENABLED_STATE_SET>
	//  194  415:aload           4
	//  195  417:invokevirtual   #163 <Method void StateListAnimator.addState(int[], android.animation.Animator)>
			animatorset = new AnimatorSet();
	//  196  420:new             #114 <Class AnimatorSet>
	//  197  423:dup             
	//  198  424:invokespecial   #115 <Method void AnimatorSet()>
	//  199  427:astore          4
			animatorset.play(((android.animation.Animator) (ObjectAnimator.ofFloat(((Object) (mView)), "elevation", new float[] {
				0.0F
			}).setDuration(0L)))).with(((android.animation.Animator) (ObjectAnimator.ofFloat(((Object) (mView)), View.TRANSLATION_Z, new float[] {
				0.0F
			}).setDuration(0L))));
	//  200  429:aload           4
	//  201  431:aload_0         
	//  202  432:getfield        #23  <Field VisibilityAwareImageButton mView>
	//  203  435:ldc1            #117 <String "elevation">
	//  204  437:iconst_1        
	//  205  438:newarray        float[]
	//  206  440:dup             
	//  207  441:iconst_0        
	//  208  442:fconst_0        
	//  209  443:fastore         
	//  210  444:invokestatic    #123 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//  211  447:lconst_0        
	//  212  448:invokevirtual   #127 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  213  451:invokevirtual   #131 <Method android.animation.AnimatorSet$Builder AnimatorSet.play(android.animation.Animator)>
	//  214  454:aload_0         
	//  215  455:getfield        #23  <Field VisibilityAwareImageButton mView>
	//  216  458:getstatic       #137 <Field android.util.Property View.TRANSLATION_Z>
	//  217  461:iconst_1        
	//  218  462:newarray        float[]
	//  219  464:dup             
	//  220  465:iconst_0        
	//  221  466:fconst_0        
	//  222  467:fastore         
	//  223  468:invokestatic    #140 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, android.util.Property, float[])>
	//  224  471:lconst_0        
	//  225  472:invokevirtual   #127 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  226  475:invokevirtual   #147 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(android.animation.Animator)>
	//  227  478:pop             
			animatorset.setInterpolator(((android.animation.TimeInterpolator) (ANIM_INTERPOLATOR)));
	//  228  479:aload           4
	//  229  481:getstatic       #151 <Field android.view.animation.Interpolator ANIM_INTERPOLATOR>
	//  230  484:invokevirtual   #155 <Method void AnimatorSet.setInterpolator(android.animation.TimeInterpolator)>
			statelistanimator.addState(EMPTY_STATE_SET, ((android.animation.Animator) (animatorset)));
	//  231  487:aload_3         
	//  232  488:getstatic       #194 <Field int[] EMPTY_STATE_SET>
	//  233  491:aload           4
	//  234  493:invokevirtual   #163 <Method void StateListAnimator.addState(int[], android.animation.Animator)>
			mView.setStateListAnimator(statelistanimator);
	//  235  496:aload_0         
	//  236  497:getfield        #23  <Field VisibilityAwareImageButton mView>
	//  237  500:aload_3         
	//  238  501:invokevirtual   #198 <Method void VisibilityAwareImageButton.setStateListAnimator(StateListAnimator)>
		}
		if(mShadowViewDelegate.isCompatPaddingEnabled())
	//* 239  504:aload_0         
	//* 240  505:getfield        #33  <Field ShadowViewDelegate mShadowViewDelegate>
	//* 241  508:invokeinterface #39  <Method boolean ShadowViewDelegate.isCompatPaddingEnabled()>
	//* 242  513:ifeq            520
			updatePadding();
	//  243  516:aload_0         
	//  244  517:invokevirtual   #83  <Method void updatePadding()>
	//  245  520:return          
	}

	void onPaddingUpdated(Rect rect)
	{
		if(mShadowViewDelegate.isCompatPaddingEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field ShadowViewDelegate mShadowViewDelegate>
	//*   2    4:invokeinterface #39  <Method boolean ShadowViewDelegate.isCompatPaddingEnabled()>
	//*   3    9:ifeq            57
		{
			mInsetDrawable = new InsetDrawable(mRippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
	//    4   12:aload_0         
	//    5   13:new             #201 <Class InsetDrawable>
	//    6   16:dup             
	//    7   17:aload_0         
	//    8   18:getfield        #205 <Field Drawable mRippleDrawable>
	//    9   21:aload_1         
	//   10   22:getfield        #208 <Field int Rect.left>
	//   11   25:aload_1         
	//   12   26:getfield        #211 <Field int Rect.top>
	//   13   29:aload_1         
	//   14   30:getfield        #214 <Field int Rect.right>
	//   15   33:aload_1         
	//   16   34:getfield        #217 <Field int Rect.bottom>
	//   17   37:invokespecial   #220 <Method void InsetDrawable(Drawable, int, int, int, int)>
	//   18   40:putfield        #222 <Field InsetDrawable mInsetDrawable>
			mShadowViewDelegate.setBackgroundDrawable(((Drawable) (mInsetDrawable)));
	//   19   43:aload_0         
	//   20   44:getfield        #33  <Field ShadowViewDelegate mShadowViewDelegate>
	//   21   47:aload_0         
	//   22   48:getfield        #222 <Field InsetDrawable mInsetDrawable>
	//   23   51:invokeinterface #226 <Method void ShadowViewDelegate.setBackgroundDrawable(Drawable)>
			return;
	//   24   56:return          
		} else
		{
			mShadowViewDelegate.setBackgroundDrawable(mRippleDrawable);
	//   25   57:aload_0         
	//   26   58:getfield        #33  <Field ShadowViewDelegate mShadowViewDelegate>
	//   27   61:aload_0         
	//   28   62:getfield        #205 <Field Drawable mRippleDrawable>
	//   29   65:invokeinterface #226 <Method void ShadowViewDelegate.setBackgroundDrawable(Drawable)>
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

	void setBackgroundDrawable(ColorStateList colorstatelist, android.graphics.PorterDuff.Mode mode, int i, int j)
	{
		mShapeDrawable = DrawableCompat.wrap(((Drawable) (createShapeDrawable())));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #231 <Method GradientDrawable createShapeDrawable()>
	//    3    5:invokestatic    #237 <Method Drawable DrawableCompat.wrap(Drawable)>
	//    4    8:putfield        #240 <Field Drawable mShapeDrawable>
		DrawableCompat.setTintList(mShapeDrawable, colorstatelist);
	//    5   11:aload_0         
	//    6   12:getfield        #240 <Field Drawable mShapeDrawable>
	//    7   15:aload_1         
	//    8   16:invokestatic    #244 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
		if(mode != null)
	//*   9   19:aload_2         
	//*  10   20:ifnull          31
			DrawableCompat.setTintMode(mShapeDrawable, mode);
	//   11   23:aload_0         
	//   12   24:getfield        #240 <Field Drawable mShapeDrawable>
	//   13   27:aload_2         
	//   14   28:invokestatic    #248 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
		if(j > 0)
	//*  15   31:iload           4
	//*  16   33:ifle            76
		{
			mBorderDrawable = createBorderDrawable(j, colorstatelist);
	//   17   36:aload_0         
	//   18   37:aload_0         
	//   19   38:iload           4
	//   20   40:aload_1         
	//   21   41:invokevirtual   #252 <Method CircularBorderDrawable createBorderDrawable(int, ColorStateList)>
	//   22   44:putfield        #256 <Field CircularBorderDrawable mBorderDrawable>
			colorstatelist = ((ColorStateList) (new LayerDrawable(new Drawable[] {
				mBorderDrawable, mShapeDrawable
			})));
	//   23   47:new             #258 <Class LayerDrawable>
	//   24   50:dup             
	//   25   51:iconst_2        
	//   26   52:anewarray       Drawable[]
	//   27   55:dup             
	//   28   56:iconst_0        
	//   29   57:aload_0         
	//   30   58:getfield        #256 <Field CircularBorderDrawable mBorderDrawable>
	//   31   61:aastore         
	//   32   62:dup             
	//   33   63:iconst_1        
	//   34   64:aload_0         
	//   35   65:getfield        #240 <Field Drawable mShapeDrawable>
	//   36   68:aastore         
	//   37   69:invokespecial   #263 <Method void LayerDrawable(Drawable[])>
	//   38   72:astore_1        
		} else
	//*  39   73:goto            86
		{
			mBorderDrawable = null;
	//   40   76:aload_0         
	//   41   77:aconst_null     
	//   42   78:putfield        #256 <Field CircularBorderDrawable mBorderDrawable>
			colorstatelist = ((ColorStateList) (mShapeDrawable));
	//   43   81:aload_0         
	//   44   82:getfield        #240 <Field Drawable mShapeDrawable>
	//   45   85:astore_1        
		}
		mRippleDrawable = ((Drawable) (new RippleDrawable(ColorStateList.valueOf(i), ((Drawable) (colorstatelist)), ((Drawable) (null)))));
	//   46   86:aload_0         
	//   47   87:new             #265 <Class RippleDrawable>
	//   48   90:dup             
	//   49   91:iload_3         
	//   50   92:invokestatic    #271 <Method ColorStateList ColorStateList.valueOf(int)>
	//   51   95:aload_1         
	//   52   96:aconst_null     
	//   53   97:invokespecial   #274 <Method void RippleDrawable(ColorStateList, Drawable, Drawable)>
	//   54  100:putfield        #205 <Field Drawable mRippleDrawable>
		mContentBackground = mRippleDrawable;
	//   55  103:aload_0         
	//   56  104:aload_0         
	//   57  105:getfield        #205 <Field Drawable mRippleDrawable>
	//   58  108:putfield        #277 <Field Drawable mContentBackground>
		mShadowViewDelegate.setBackgroundDrawable(mRippleDrawable);
	//   59  111:aload_0         
	//   60  112:getfield        #33  <Field ShadowViewDelegate mShadowViewDelegate>
	//   61  115:aload_0         
	//   62  116:getfield        #205 <Field Drawable mRippleDrawable>
	//   63  119:invokeinterface #226 <Method void ShadowViewDelegate.setBackgroundDrawable(Drawable)>
	//   64  124:return          
	}

	void setRippleColor(int i)
	{
		if(mRippleDrawable instanceof RippleDrawable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #205 <Field Drawable mRippleDrawable>
	//*   2    4:instanceof      #265 <Class RippleDrawable>
	//*   3    7:ifeq            25
		{
			((RippleDrawable)mRippleDrawable).setColor(ColorStateList.valueOf(i));
	//    4   10:aload_0         
	//    5   11:getfield        #205 <Field Drawable mRippleDrawable>
	//    6   14:checkcast       #265 <Class RippleDrawable>
	//    7   17:iload_1         
	//    8   18:invokestatic    #271 <Method ColorStateList ColorStateList.valueOf(int)>
	//    9   21:invokevirtual   #283 <Method void RippleDrawable.setColor(ColorStateList)>
			return;
	//   10   24:return          
		} else
		{
			super.setRippleColor(i);
	//   11   25:aload_0         
	//   12   26:iload_1         
	//   13   27:invokespecial   #285 <Method void FloatingActionButtonImpl.setRippleColor(int)>
			return;
	//   14   30:return          
		}
	}

	private InsetDrawable mInsetDrawable;
}
