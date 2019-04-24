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
	//*   2    5:icmpne          101
		{
			if(mView.isEnabled())
	//*   3    8:aload_0         
	//*   4    9:getfield        #23  <Field VisibilityAwareImageButton mView>
	//*   5   12:invokevirtual   #96  <Method boolean VisibilityAwareImageButton.isEnabled()>
	//*   6   15:ifeq            82
			{
				mView.setElevation(f);
	//    7   18:aload_0         
	//    8   19:getfield        #23  <Field VisibilityAwareImageButton mView>
	//    9   22:fload_1         
	//   10   23:invokevirtual   #100 <Method void VisibilityAwareImageButton.setElevation(float)>
				if(mView.isFocused() || mView.isPressed())
	//*  11   26:aload_0         
	//*  12   27:getfield        #23  <Field VisibilityAwareImageButton mView>
	//*  13   30:invokevirtual   #103 <Method boolean VisibilityAwareImageButton.isFocused()>
	//*  14   33:ifne            46
	//*  15   36:aload_0         
	//*  16   37:getfield        #23  <Field VisibilityAwareImageButton mView>
	//*  17   40:invokevirtual   #106 <Method boolean VisibilityAwareImageButton.isPressed()>
	//*  18   43:ifeq            71
					mView.setTranslationZ(f1);
	//   19   46:aload_0         
	//   20   47:getfield        #23  <Field VisibilityAwareImageButton mView>
	//   21   50:fload_2         
	//   22   51:invokevirtual   #109 <Method void VisibilityAwareImageButton.setTranslationZ(float)>
				else
	//*  23   54:aload_0         
	//*  24   55:getfield        #33  <Field ShadowViewDelegate mShadowViewDelegate>
	//*  25   58:invokeinterface #39  <Method boolean ShadowViewDelegate.isCompatPaddingEnabled()>
	//*  26   63:ifeq            70
	//*  27   66:aload_0         
	//*  28   67:invokevirtual   #83  <Method void updatePadding()>
	//*  29   70:return          
					mView.setTranslationZ(0.0F);
	//   30   71:aload_0         
	//   31   72:getfield        #23  <Field VisibilityAwareImageButton mView>
	//   32   75:fconst_0        
	//   33   76:invokevirtual   #109 <Method void VisibilityAwareImageButton.setTranslationZ(float)>
			} else
	//*  34   79:goto            54
			{
				mView.setElevation(0.0F);
	//   35   82:aload_0         
	//   36   83:getfield        #23  <Field VisibilityAwareImageButton mView>
	//   37   86:fconst_0        
	//   38   87:invokevirtual   #100 <Method void VisibilityAwareImageButton.setElevation(float)>
				mView.setTranslationZ(0.0F);
	//   39   90:aload_0         
	//   40   91:getfield        #23  <Field VisibilityAwareImageButton mView>
	//   41   94:fconst_0        
	//   42   95:invokevirtual   #109 <Method void VisibilityAwareImageButton.setTranslationZ(float)>
			}
		} else
	//*  43   98:goto            54
		{
			StateListAnimator statelistanimator = new StateListAnimator();
	//   44  101:new             #111 <Class StateListAnimator>
	//   45  104:dup             
	//   46  105:invokespecial   #112 <Method void StateListAnimator()>
	//   47  108:astore_3        
			AnimatorSet animatorset = new AnimatorSet();
	//   48  109:new             #114 <Class AnimatorSet>
	//   49  112:dup             
	//   50  113:invokespecial   #115 <Method void AnimatorSet()>
	//   51  116:astore          4
			animatorset.play(((android.animation.Animator) (ObjectAnimator.ofFloat(((Object) (mView)), "elevation", new float[] {
				f
			}).setDuration(0L)))).with(((android.animation.Animator) (ObjectAnimator.ofFloat(((Object) (mView)), View.TRANSLATION_Z, new float[] {
				f1
			}).setDuration(100L))));
	//   52  118:aload           4
	//   53  120:aload_0         
	//   54  121:getfield        #23  <Field VisibilityAwareImageButton mView>
	//   55  124:ldc1            #117 <String "elevation">
	//   56  126:iconst_1        
	//   57  127:newarray        float[]
	//   58  129:dup             
	//   59  130:iconst_0        
	//   60  131:fload_1         
	//   61  132:fastore         
	//   62  133:invokestatic    #123 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   63  136:lconst_0        
	//   64  137:invokevirtual   #127 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   65  140:invokevirtual   #131 <Method android.animation.AnimatorSet$Builder AnimatorSet.play(android.animation.Animator)>
	//   66  143:aload_0         
	//   67  144:getfield        #23  <Field VisibilityAwareImageButton mView>
	//   68  147:getstatic       #137 <Field android.util.Property View.TRANSLATION_Z>
	//   69  150:iconst_1        
	//   70  151:newarray        float[]
	//   71  153:dup             
	//   72  154:iconst_0        
	//   73  155:fload_2         
	//   74  156:fastore         
	//   75  157:invokestatic    #140 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, android.util.Property, float[])>
	//   76  160:ldc2w           #141 <Long 100L>
	//   77  163:invokevirtual   #127 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   78  166:invokevirtual   #147 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(android.animation.Animator)>
	//   79  169:pop             
			animatorset.setInterpolator(((android.animation.TimeInterpolator) (ANIM_INTERPOLATOR)));
	//   80  170:aload           4
	//   81  172:getstatic       #151 <Field android.view.animation.Interpolator ANIM_INTERPOLATOR>
	//   82  175:invokevirtual   #155 <Method void AnimatorSet.setInterpolator(android.animation.TimeInterpolator)>
			statelistanimator.addState(PRESSED_ENABLED_STATE_SET, ((android.animation.Animator) (animatorset)));
	//   83  178:aload_3         
	//   84  179:getstatic       #159 <Field int[] PRESSED_ENABLED_STATE_SET>
	//   85  182:aload           4
	//   86  184:invokevirtual   #163 <Method void StateListAnimator.addState(int[], android.animation.Animator)>
			animatorset = new AnimatorSet();
	//   87  187:new             #114 <Class AnimatorSet>
	//   88  190:dup             
	//   89  191:invokespecial   #115 <Method void AnimatorSet()>
	//   90  194:astore          4
			animatorset.play(((android.animation.Animator) (ObjectAnimator.ofFloat(((Object) (mView)), "elevation", new float[] {
				f
			}).setDuration(0L)))).with(((android.animation.Animator) (ObjectAnimator.ofFloat(((Object) (mView)), View.TRANSLATION_Z, new float[] {
				f1
			}).setDuration(100L))));
	//   91  196:aload           4
	//   92  198:aload_0         
	//   93  199:getfield        #23  <Field VisibilityAwareImageButton mView>
	//   94  202:ldc1            #117 <String "elevation">
	//   95  204:iconst_1        
	//   96  205:newarray        float[]
	//   97  207:dup             
	//   98  208:iconst_0        
	//   99  209:fload_1         
	//  100  210:fastore         
	//  101  211:invokestatic    #123 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//  102  214:lconst_0        
	//  103  215:invokevirtual   #127 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  104  218:invokevirtual   #131 <Method android.animation.AnimatorSet$Builder AnimatorSet.play(android.animation.Animator)>
	//  105  221:aload_0         
	//  106  222:getfield        #23  <Field VisibilityAwareImageButton mView>
	//  107  225:getstatic       #137 <Field android.util.Property View.TRANSLATION_Z>
	//  108  228:iconst_1        
	//  109  229:newarray        float[]
	//  110  231:dup             
	//  111  232:iconst_0        
	//  112  233:fload_2         
	//  113  234:fastore         
	//  114  235:invokestatic    #140 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, android.util.Property, float[])>
	//  115  238:ldc2w           #141 <Long 100L>
	//  116  241:invokevirtual   #127 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  117  244:invokevirtual   #147 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(android.animation.Animator)>
	//  118  247:pop             
			animatorset.setInterpolator(((android.animation.TimeInterpolator) (ANIM_INTERPOLATOR)));
	//  119  248:aload           4
	//  120  250:getstatic       #151 <Field android.view.animation.Interpolator ANIM_INTERPOLATOR>
	//  121  253:invokevirtual   #155 <Method void AnimatorSet.setInterpolator(android.animation.TimeInterpolator)>
			statelistanimator.addState(FOCUSED_ENABLED_STATE_SET, ((android.animation.Animator) (animatorset)));
	//  122  256:aload_3         
	//  123  257:getstatic       #166 <Field int[] FOCUSED_ENABLED_STATE_SET>
	//  124  260:aload           4
	//  125  262:invokevirtual   #163 <Method void StateListAnimator.addState(int[], android.animation.Animator)>
			animatorset = new AnimatorSet();
	//  126  265:new             #114 <Class AnimatorSet>
	//  127  268:dup             
	//  128  269:invokespecial   #115 <Method void AnimatorSet()>
	//  129  272:astore          4
			ArrayList arraylist = new ArrayList();
	//  130  274:new             #168 <Class ArrayList>
	//  131  277:dup             
	//  132  278:invokespecial   #169 <Method void ArrayList()>
	//  133  281:astore          5
			((List) (arraylist)).add(((Object) (ObjectAnimator.ofFloat(((Object) (mView)), "elevation", new float[] {
				f
			}).setDuration(0L))));
	//  134  283:aload           5
	//  135  285:aload_0         
	//  136  286:getfield        #23  <Field VisibilityAwareImageButton mView>
	//  137  289:ldc1            #117 <String "elevation">
	//  138  291:iconst_1        
	//  139  292:newarray        float[]
	//  140  294:dup             
	//  141  295:iconst_0        
	//  142  296:fload_1         
	//  143  297:fastore         
	//  144  298:invokestatic    #123 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//  145  301:lconst_0        
	//  146  302:invokevirtual   #127 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  147  305:invokeinterface #175 <Method boolean List.add(Object)>
	//  148  310:pop             
			if(android.os.Build.VERSION.SDK_INT >= 22 && android.os.Build.VERSION.SDK_INT <= 24)
	//* 149  311:getstatic       #93  <Field int android.os.Build$VERSION.SDK_INT>
	//* 150  314:bipush          22
	//* 151  316:icmplt          364
	//* 152  319:getstatic       #93  <Field int android.os.Build$VERSION.SDK_INT>
	//* 153  322:bipush          24
	//* 154  324:icmpgt          364
				((List) (arraylist)).add(((Object) (ObjectAnimator.ofFloat(((Object) (mView)), View.TRANSLATION_Z, new float[] {
					mView.getTranslationZ()
				}).setDuration(100L))));
	//  155  327:aload           5
	//  156  329:aload_0         
	//  157  330:getfield        #23  <Field VisibilityAwareImageButton mView>
	//  158  333:getstatic       #137 <Field android.util.Property View.TRANSLATION_Z>
	//  159  336:iconst_1        
	//  160  337:newarray        float[]
	//  161  339:dup             
	//  162  340:iconst_0        
	//  163  341:aload_0         
	//  164  342:getfield        #23  <Field VisibilityAwareImageButton mView>
	//  165  345:invokevirtual   #178 <Method float VisibilityAwareImageButton.getTranslationZ()>
	//  166  348:fastore         
	//  167  349:invokestatic    #140 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, android.util.Property, float[])>
	//  168  352:ldc2w           #141 <Long 100L>
	//  169  355:invokevirtual   #127 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  170  358:invokeinterface #175 <Method boolean List.add(Object)>
	//  171  363:pop             
			((List) (arraylist)).add(((Object) (ObjectAnimator.ofFloat(((Object) (mView)), View.TRANSLATION_Z, new float[] {
				0.0F
			}).setDuration(100L))));
	//  172  364:aload           5
	//  173  366:aload_0         
	//  174  367:getfield        #23  <Field VisibilityAwareImageButton mView>
	//  175  370:getstatic       #137 <Field android.util.Property View.TRANSLATION_Z>
	//  176  373:iconst_1        
	//  177  374:newarray        float[]
	//  178  376:dup             
	//  179  377:iconst_0        
	//  180  378:fconst_0        
	//  181  379:fastore         
	//  182  380:invokestatic    #140 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, android.util.Property, float[])>
	//  183  383:ldc2w           #141 <Long 100L>
	//  184  386:invokevirtual   #127 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  185  389:invokeinterface #175 <Method boolean List.add(Object)>
	//  186  394:pop             
			animatorset.playSequentially((android.animation.Animator[])((List) (arraylist)).toArray(((Object []) (new ObjectAnimator[0]))));
	//  187  395:aload           4
	//  188  397:aload           5
	//  189  399:iconst_0        
	//  190  400:anewarray       ObjectAnimator[]
	//  191  403:invokeinterface #182 <Method Object[] List.toArray(Object[])>
	//  192  408:checkcast       #184 <Class android.animation.Animator[]>
	//  193  411:invokevirtual   #188 <Method void AnimatorSet.playSequentially(android.animation.Animator[])>
			animatorset.setInterpolator(((android.animation.TimeInterpolator) (ANIM_INTERPOLATOR)));
	//  194  414:aload           4
	//  195  416:getstatic       #151 <Field android.view.animation.Interpolator ANIM_INTERPOLATOR>
	//  196  419:invokevirtual   #155 <Method void AnimatorSet.setInterpolator(android.animation.TimeInterpolator)>
			statelistanimator.addState(ENABLED_STATE_SET, ((android.animation.Animator) (animatorset)));
	//  197  422:aload_3         
	//  198  423:getstatic       #191 <Field int[] ENABLED_STATE_SET>
	//  199  426:aload           4
	//  200  428:invokevirtual   #163 <Method void StateListAnimator.addState(int[], android.animation.Animator)>
			animatorset = new AnimatorSet();
	//  201  431:new             #114 <Class AnimatorSet>
	//  202  434:dup             
	//  203  435:invokespecial   #115 <Method void AnimatorSet()>
	//  204  438:astore          4
			animatorset.play(((android.animation.Animator) (ObjectAnimator.ofFloat(((Object) (mView)), "elevation", new float[] {
				0.0F
			}).setDuration(0L)))).with(((android.animation.Animator) (ObjectAnimator.ofFloat(((Object) (mView)), View.TRANSLATION_Z, new float[] {
				0.0F
			}).setDuration(0L))));
	//  205  440:aload           4
	//  206  442:aload_0         
	//  207  443:getfield        #23  <Field VisibilityAwareImageButton mView>
	//  208  446:ldc1            #117 <String "elevation">
	//  209  448:iconst_1        
	//  210  449:newarray        float[]
	//  211  451:dup             
	//  212  452:iconst_0        
	//  213  453:fconst_0        
	//  214  454:fastore         
	//  215  455:invokestatic    #123 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//  216  458:lconst_0        
	//  217  459:invokevirtual   #127 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  218  462:invokevirtual   #131 <Method android.animation.AnimatorSet$Builder AnimatorSet.play(android.animation.Animator)>
	//  219  465:aload_0         
	//  220  466:getfield        #23  <Field VisibilityAwareImageButton mView>
	//  221  469:getstatic       #137 <Field android.util.Property View.TRANSLATION_Z>
	//  222  472:iconst_1        
	//  223  473:newarray        float[]
	//  224  475:dup             
	//  225  476:iconst_0        
	//  226  477:fconst_0        
	//  227  478:fastore         
	//  228  479:invokestatic    #140 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, android.util.Property, float[])>
	//  229  482:lconst_0        
	//  230  483:invokevirtual   #127 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//  231  486:invokevirtual   #147 <Method android.animation.AnimatorSet$Builder android.animation.AnimatorSet$Builder.with(android.animation.Animator)>
	//  232  489:pop             
			animatorset.setInterpolator(((android.animation.TimeInterpolator) (ANIM_INTERPOLATOR)));
	//  233  490:aload           4
	//  234  492:getstatic       #151 <Field android.view.animation.Interpolator ANIM_INTERPOLATOR>
	//  235  495:invokevirtual   #155 <Method void AnimatorSet.setInterpolator(android.animation.TimeInterpolator)>
			statelistanimator.addState(EMPTY_STATE_SET, ((android.animation.Animator) (animatorset)));
	//  236  498:aload_3         
	//  237  499:getstatic       #194 <Field int[] EMPTY_STATE_SET>
	//  238  502:aload           4
	//  239  504:invokevirtual   #163 <Method void StateListAnimator.addState(int[], android.animation.Animator)>
			mView.setStateListAnimator(statelistanimator);
	//  240  507:aload_0         
	//  241  508:getfield        #23  <Field VisibilityAwareImageButton mView>
	//  242  511:aload_3         
	//  243  512:invokevirtual   #198 <Method void VisibilityAwareImageButton.setStateListAnimator(StateListAnimator)>
		}
		if(mShadowViewDelegate.isCompatPaddingEnabled())
			updatePadding();
	//* 244  515:goto            54
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
	//*  16   33:ifle            112
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
	//*  39   73:aload_0         
	//*  40   74:new             #265 <Class RippleDrawable>
	//*  41   77:dup             
	//*  42   78:iload_3         
	//*  43   79:invokestatic    #271 <Method ColorStateList ColorStateList.valueOf(int)>
	//*  44   82:aload_1         
	//*  45   83:aconst_null     
	//*  46   84:invokespecial   #274 <Method void RippleDrawable(ColorStateList, Drawable, Drawable)>
	//*  47   87:putfield        #205 <Field Drawable mRippleDrawable>
	//*  48   90:aload_0         
	//*  49   91:aload_0         
	//*  50   92:getfield        #205 <Field Drawable mRippleDrawable>
	//*  51   95:putfield        #277 <Field Drawable mContentBackground>
	//*  52   98:aload_0         
	//*  53   99:getfield        #33  <Field ShadowViewDelegate mShadowViewDelegate>
	//*  54  102:aload_0         
	//*  55  103:getfield        #205 <Field Drawable mRippleDrawable>
	//*  56  106:invokeinterface #226 <Method void ShadowViewDelegate.setBackgroundDrawable(Drawable)>
	//*  57  111:return          
		{
			mBorderDrawable = null;
	//   58  112:aload_0         
	//   59  113:aconst_null     
	//   60  114:putfield        #256 <Field CircularBorderDrawable mBorderDrawable>
			colorstatelist = ((ColorStateList) (mShapeDrawable));
	//   61  117:aload_0         
	//   62  118:getfield        #240 <Field Drawable mShapeDrawable>
	//   63  121:astore_1        
		}
		mRippleDrawable = ((Drawable) (new RippleDrawable(ColorStateList.valueOf(i), ((Drawable) (colorstatelist)), ((Drawable) (null)))));
		mContentBackground = mRippleDrawable;
		mShadowViewDelegate.setBackgroundDrawable(mRippleDrawable);
	//*  64  122:goto            73
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
