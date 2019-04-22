// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.listeners;

import android.animation.*;
import android.content.Context;
import android.content.res.Resources;
import android.view.*;

public class SwipeDismissTouchListener
	implements android.view.View.OnTouchListener
{
	public static interface DismissCallbacks
	{

		public abstract boolean canDismiss(Object obj);

		public abstract void onDismiss(View view, Object obj);
	}


	public SwipeDismissTouchListener(View view, Object obj, DismissCallbacks dismisscallbacks)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		mViewWidth = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #44  <Field int mViewWidth>
		ViewConfiguration viewconfiguration = ViewConfiguration.get(view.getContext());
	//    5    9:aload_1         
	//    6   10:invokevirtual   #50  <Method Context View.getContext()>
	//    7   13:invokestatic    #56  <Method ViewConfiguration ViewConfiguration.get(Context)>
	//    8   16:astore          4
		mSlop = viewconfiguration.getScaledTouchSlop();
	//    9   18:aload_0         
	//   10   19:aload           4
	//   11   21:invokevirtual   #60  <Method int ViewConfiguration.getScaledTouchSlop()>
	//   12   24:putfield        #62  <Field int mSlop>
		mMinFlingVelocity = viewconfiguration.getScaledMinimumFlingVelocity() * 16;
	//   13   27:aload_0         
	//   14   28:aload           4
	//   15   30:invokevirtual   #65  <Method int ViewConfiguration.getScaledMinimumFlingVelocity()>
	//   16   33:bipush          16
	//   17   35:imul            
	//   18   36:putfield        #67  <Field int mMinFlingVelocity>
		mMaxFlingVelocity = viewconfiguration.getScaledMaximumFlingVelocity();
	//   19   39:aload_0         
	//   20   40:aload           4
	//   21   42:invokevirtual   #70  <Method int ViewConfiguration.getScaledMaximumFlingVelocity()>
	//   22   45:putfield        #72  <Field int mMaxFlingVelocity>
		mAnimationTime = view.getContext().getResources().getInteger(0x10e0000);
	//   23   48:aload_0         
	//   24   49:aload_1         
	//   25   50:invokevirtual   #50  <Method Context View.getContext()>
	//   26   53:invokevirtual   #78  <Method Resources Context.getResources()>
	//   27   56:ldc1            #79  <Int 0x10e0000>
	//   28   58:invokevirtual   #85  <Method int Resources.getInteger(int)>
	//   29   61:i2l             
	//   30   62:putfield        #87  <Field long mAnimationTime>
		mView = view;
	//   31   65:aload_0         
	//   32   66:aload_1         
	//   33   67:putfield        #89  <Field View mView>
		mToken = obj;
	//   34   70:aload_0         
	//   35   71:aload_2         
	//   36   72:putfield        #91  <Field Object mToken>
		mCallbacks = dismisscallbacks;
	//   37   75:aload_0         
	//   38   76:aload_3         
	//   39   77:putfield        #93  <Field SwipeDismissTouchListener$DismissCallbacks mCallbacks>
	//   40   80:return          
	}

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		motionevent.offsetLocation(mTranslationX, 0.0F);
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #104 <Field float mTranslationX>
	//    3    5:fconst_0        
	//    4    6:invokevirtual   #110 <Method void MotionEvent.offsetLocation(float, float)>
		if(mViewWidth < 2)
	//*   5    9:aload_0         
	//*   6   10:getfield        #44  <Field int mViewWidth>
	//*   7   13:iconst_2        
	//*   8   14:icmpge          28
			mViewWidth = mView.getWidth();
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #89  <Field View mView>
	//   12   22:invokevirtual   #113 <Method int View.getWidth()>
	//   13   25:putfield        #44  <Field int mViewWidth>
		int i = motionevent.getActionMasked();
	//   14   28:aload_2         
	//   15   29:invokevirtual   #116 <Method int MotionEvent.getActionMasked()>
	//   16   32:istore          7
		boolean flag2 = true;
	//   17   34:iconst_1        
	//   18   35:istore          9
		switch(i)
	//*  19   37:iload           7
		{
	//*  20   39:tableswitch     0 3: default 68
	//	               0 672
	//	               1 314
	//	               2 140
	//	               3 70
		default:
			return false;
	//   21   68:iconst_0        
	//   22   69:ireturn         

		case 3: // '\003'
			if(mVelocityTracker == null)
	//*  23   70:aload_0         
	//*  24   71:getfield        #118 <Field VelocityTracker mVelocityTracker>
	//*  25   74:ifnonnull       79
			{
				return false;
	//   26   77:iconst_0        
	//   27   78:ireturn         
			} else
			{
				mView.animate().translationX(0.0F).alpha(1.0F).setDuration(mAnimationTime).setListener(((android.animation.Animator.AnimatorListener) (null)));
	//   28   79:aload_0         
	//   29   80:getfield        #89  <Field View mView>
	//   30   83:invokevirtual   #122 <Method ViewPropertyAnimator View.animate()>
	//   31   86:fconst_0        
	//   32   87:invokevirtual   #128 <Method ViewPropertyAnimator ViewPropertyAnimator.translationX(float)>
	//   33   90:fconst_1        
	//   34   91:invokevirtual   #131 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//   35   94:aload_0         
	//   36   95:getfield        #87  <Field long mAnimationTime>
	//   37   98:invokevirtual   #135 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//   38  101:aconst_null     
	//   39  102:invokevirtual   #139 <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//   40  105:pop             
				mVelocityTracker.recycle();
	//   41  106:aload_0         
	//   42  107:getfield        #118 <Field VelocityTracker mVelocityTracker>
	//   43  110:invokevirtual   #144 <Method void VelocityTracker.recycle()>
				mVelocityTracker = null;
	//   44  113:aload_0         
	//   45  114:aconst_null     
	//   46  115:putfield        #118 <Field VelocityTracker mVelocityTracker>
				mTranslationX = 0.0F;
	//   47  118:aload_0         
	//   48  119:fconst_0        
	//   49  120:putfield        #104 <Field float mTranslationX>
				mDownX = 0.0F;
	//   50  123:aload_0         
	//   51  124:fconst_0        
	//   52  125:putfield        #146 <Field float mDownX>
				mDownY = 0.0F;
	//   53  128:aload_0         
	//   54  129:fconst_0        
	//   55  130:putfield        #148 <Field float mDownY>
				mSwiping = false;
	//   56  133:aload_0         
	//   57  134:iconst_0        
	//   58  135:putfield        #150 <Field boolean mSwiping>
				return false;
	//   59  138:iconst_0        
	//   60  139:ireturn         
			}

		case 2: // '\002'
			view = ((View) (mVelocityTracker));
	//   61  140:aload_0         
	//   62  141:getfield        #118 <Field VelocityTracker mVelocityTracker>
	//   63  144:astore_1        
			if(view == null)
	//*  64  145:aload_1         
	//*  65  146:ifnonnull       151
				return false;
	//   66  149:iconst_0        
	//   67  150:ireturn         
			((VelocityTracker) (view)).addMovement(motionevent);
	//   68  151:aload_1         
	//   69  152:aload_2         
	//   70  153:invokevirtual   #154 <Method void VelocityTracker.addMovement(MotionEvent)>
			float f = motionevent.getRawX() - mDownX;
	//   71  156:aload_2         
	//   72  157:invokevirtual   #158 <Method float MotionEvent.getRawX()>
	//   73  160:aload_0         
	//   74  161:getfield        #146 <Field float mDownX>
	//   75  164:fsub            
	//   76  165:fstore_3        
			float f1 = motionevent.getRawY();
	//   77  166:aload_2         
	//   78  167:invokevirtual   #161 <Method float MotionEvent.getRawY()>
	//   79  170:fstore          4
			float f2 = mDownY;
	//   80  172:aload_0         
	//   81  173:getfield        #148 <Field float mDownY>
	//   82  176:fstore          5
			if(Math.abs(f) > (float)mSlop && Math.abs(f1 - f2) < Math.abs(f) / 2.0F)
	//*  83  178:fload_3         
	//*  84  179:invokestatic    #167 <Method float Math.abs(float)>
	//*  85  182:aload_0         
	//*  86  183:getfield        #62  <Field int mSlop>
	//*  87  186:i2f             
	//*  88  187:fcmpl           
	//*  89  188:ifle            286
	//*  90  191:fload           4
	//*  91  193:fload           5
	//*  92  195:fsub            
	//*  93  196:invokestatic    #167 <Method float Math.abs(float)>
	//*  94  199:fload_3         
	//*  95  200:invokestatic    #167 <Method float Math.abs(float)>
	//*  96  203:fconst_2        
	//*  97  204:fdiv            
	//*  98  205:fcmpg           
	//*  99  206:ifge            286
			{
				mSwiping = true;
	//  100  209:aload_0         
	//  101  210:iconst_1        
	//  102  211:putfield        #150 <Field boolean mSwiping>
				int j;
				if(f > 0.0F)
	//* 103  214:fload_3         
	//* 104  215:fconst_0        
	//* 105  216:fcmpl           
	//* 106  217:ifle            229
					j = mSlop;
	//  107  220:aload_0         
	//  108  221:getfield        #62  <Field int mSlop>
	//  109  224:istore          7
				else
	//* 110  226:goto            236
					j = -mSlop;
	//  111  229:aload_0         
	//  112  230:getfield        #62  <Field int mSlop>
	//  113  233:ineg            
	//  114  234:istore          7
				mSwipingSlop = j;
	//  115  236:aload_0         
	//  116  237:iload           7
	//  117  239:putfield        #169 <Field int mSwipingSlop>
				mView.getParent().requestDisallowInterceptTouchEvent(true);
	//  118  242:aload_0         
	//  119  243:getfield        #89  <Field View mView>
	//  120  246:invokevirtual   #173 <Method ViewParent View.getParent()>
	//  121  249:iconst_1        
	//  122  250:invokeinterface #179 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
				view = ((View) (MotionEvent.obtain(motionevent)));
	//  123  255:aload_2         
	//  124  256:invokestatic    #183 <Method MotionEvent MotionEvent.obtain(MotionEvent)>
	//  125  259:astore_1        
				((MotionEvent) (view)).setAction(motionevent.getActionIndex() << 8 | 3);
	//  126  260:aload_1         
	//  127  261:aload_2         
	//  128  262:invokevirtual   #186 <Method int MotionEvent.getActionIndex()>
	//  129  265:bipush          8
	//  130  267:ishl            
	//  131  268:iconst_3        
	//  132  269:ior             
	//  133  270:invokevirtual   #190 <Method void MotionEvent.setAction(int)>
				mView.onTouchEvent(((MotionEvent) (view)));
	//  134  273:aload_0         
	//  135  274:getfield        #89  <Field View mView>
	//  136  277:aload_1         
	//  137  278:invokevirtual   #194 <Method boolean View.onTouchEvent(MotionEvent)>
	//  138  281:pop             
				((MotionEvent) (view)).recycle();
	//  139  282:aload_1         
	//  140  283:invokevirtual   #195 <Method void MotionEvent.recycle()>
			}
			float f3;
			boolean flag;
			int k;
			boolean flag1;
			if(mSwiping)
	//* 141  286:aload_0         
	//* 142  287:getfield        #150 <Field boolean mSwiping>
	//* 143  290:ifeq            721
			{
				mTranslationX = f;
	//  144  293:aload_0         
	//  145  294:fload_3         
	//  146  295:putfield        #104 <Field float mTranslationX>
				mView.setTranslationX(f - (float)mSwipingSlop);
	//  147  298:aload_0         
	//  148  299:getfield        #89  <Field View mView>
	//  149  302:fload_3         
	//  150  303:aload_0         
	//  151  304:getfield        #169 <Field int mSwipingSlop>
	//  152  307:i2f             
	//  153  308:fsub            
	//  154  309:invokevirtual   #199 <Method void View.setTranslationX(float)>
				return true;
	//  155  312:iconst_1        
	//  156  313:ireturn         
			} else
	//* 157  314:aload_0         
	//* 158  315:getfield        #118 <Field VelocityTracker mVelocityTracker>
	//* 159  318:ifnonnull       323
	//* 160  321:iconst_0        
	//* 161  322:ireturn         
	//* 162  323:aload_2         
	//* 163  324:invokevirtual   #158 <Method float MotionEvent.getRawX()>
	//* 164  327:aload_0         
	//* 165  328:getfield        #146 <Field float mDownX>
	//* 166  331:fsub            
	//* 167  332:fstore_3        
	//* 168  333:aload_0         
	//* 169  334:getfield        #118 <Field VelocityTracker mVelocityTracker>
	//* 170  337:aload_2         
	//* 171  338:invokevirtual   #154 <Method void VelocityTracker.addMovement(MotionEvent)>
	//* 172  341:aload_0         
	//* 173  342:getfield        #118 <Field VelocityTracker mVelocityTracker>
	//* 174  345:sipush          1000
	//* 175  348:invokevirtual   #202 <Method void VelocityTracker.computeCurrentVelocity(int)>
	//* 176  351:aload_0         
	//* 177  352:getfield        #118 <Field VelocityTracker mVelocityTracker>
	//* 178  355:invokevirtual   #205 <Method float VelocityTracker.getXVelocity()>
	//* 179  358:fstore          4
	//* 180  360:fload           4
	//* 181  362:invokestatic    #167 <Method float Math.abs(float)>
	//* 182  365:fstore          5
	//* 183  367:aload_0         
	//* 184  368:getfield        #118 <Field VelocityTracker mVelocityTracker>
	//* 185  371:invokevirtual   #208 <Method float VelocityTracker.getYVelocity()>
	//* 186  374:invokestatic    #167 <Method float Math.abs(float)>
	//* 187  377:fstore          6
	//* 188  379:fload_3         
	//* 189  380:invokestatic    #167 <Method float Math.abs(float)>
	//* 190  383:aload_0         
	//* 191  384:getfield        #44  <Field int mViewWidth>
	//* 192  387:iconst_2        
	//* 193  388:idiv            
	//* 194  389:i2f             
	//* 195  390:fcmpl           
	//* 196  391:ifle            422
	//* 197  394:aload_0         
	//* 198  395:getfield        #150 <Field boolean mSwiping>
	//* 199  398:ifeq            422
	//* 200  401:fload_3         
	//* 201  402:fconst_0        
	//* 202  403:fcmpl           
	//* 203  404:ifle            413
	//* 204  407:iconst_1        
	//* 205  408:istore          7
	//* 206  410:goto            416
	//* 207  413:iconst_0        
	//* 208  414:istore          7
	//* 209  416:iconst_1        
	//* 210  417:istore          8
	//* 211  419:goto            537
	//* 212  422:aload_0         
	//* 213  423:getfield        #67  <Field int mMinFlingVelocity>
	//* 214  426:i2f             
	//* 215  427:fload           5
	//* 216  429:fcmpg           
	//* 217  430:ifgt            531
	//* 218  433:fload           5
	//* 219  435:aload_0         
	//* 220  436:getfield        #72  <Field int mMaxFlingVelocity>
	//* 221  439:i2f             
	//* 222  440:fcmpg           
	//* 223  441:ifgt            531
	//* 224  444:fload           6
	//* 225  446:fload           5
	//* 226  448:fcmpg           
	//* 227  449:ifge            531
	//* 228  452:aload_0         
	//* 229  453:getfield        #150 <Field boolean mSwiping>
	//* 230  456:ifeq            531
	//* 231  459:fload           4
	//* 232  461:fconst_0        
	//* 233  462:fcmpg           
	//* 234  463:ifge            472
	//* 235  466:iconst_1        
	//* 236  467:istore          7
	//* 237  469:goto            475
	//* 238  472:iconst_0        
	//* 239  473:istore          7
	//* 240  475:fload_3         
	//* 241  476:fconst_0        
	//* 242  477:fcmpg           
	//* 243  478:ifge            487
	//* 244  481:iconst_1        
	//* 245  482:istore          8
	//* 246  484:goto            490
	//* 247  487:iconst_0        
	//* 248  488:istore          8
	//* 249  490:iload           7
	//* 250  492:iload           8
	//* 251  494:icmpne          503
	//* 252  497:iconst_1        
	//* 253  498:istore          8
	//* 254  500:goto            506
	//* 255  503:iconst_0        
	//* 256  504:istore          8
	//* 257  506:aload_0         
	//* 258  507:getfield        #118 <Field VelocityTracker mVelocityTracker>
	//* 259  510:invokevirtual   #205 <Method float VelocityTracker.getXVelocity()>
	//* 260  513:fconst_0        
	//* 261  514:fcmpl           
	//* 262  515:ifle            525
	//* 263  518:iload           9
	//* 264  520:istore          7
	//* 265  522:goto            537
	//* 266  525:iconst_0        
	//* 267  526:istore          7
	//* 268  528:goto            537
	//* 269  531:iconst_0        
	//* 270  532:istore          8
	//* 271  534:iconst_0        
	//* 272  535:istore          7
	//* 273  537:iload           8
	//* 274  539:ifeq            604
	//* 275  542:aload_0         
	//* 276  543:getfield        #89  <Field View mView>
	//* 277  546:invokevirtual   #122 <Method ViewPropertyAnimator View.animate()>
	//* 278  549:astore_1        
	//* 279  550:iload           7
	//* 280  552:ifeq            564
	//* 281  555:aload_0         
	//* 282  556:getfield        #44  <Field int mViewWidth>
	//* 283  559:istore          7
	//* 284  561:goto            571
	//* 285  564:aload_0         
	//* 286  565:getfield        #44  <Field int mViewWidth>
	//* 287  568:ineg            
	//* 288  569:istore          7
	//* 289  571:aload_1         
	//* 290  572:iload           7
	//* 291  574:i2f             
	//* 292  575:invokevirtual   #128 <Method ViewPropertyAnimator ViewPropertyAnimator.translationX(float)>
	//* 293  578:fconst_0        
	//* 294  579:invokevirtual   #131 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//* 295  582:aload_0         
	//* 296  583:getfield        #87  <Field long mAnimationTime>
	//* 297  586:invokevirtual   #135 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//* 298  589:new             #8   <Class SwipeDismissTouchListener$1>
	//* 299  592:dup             
	//* 300  593:aload_0         
	//* 301  594:invokespecial   #211 <Method void SwipeDismissTouchListener$1(SwipeDismissTouchListener)>
	//* 302  597:invokevirtual   #139 <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//* 303  600:pop             
	//* 304  601:goto            638
	//* 305  604:aload_0         
	//* 306  605:getfield        #150 <Field boolean mSwiping>
	//* 307  608:ifeq            638
	//* 308  611:aload_0         
	//* 309  612:getfield        #89  <Field View mView>
	//* 310  615:invokevirtual   #122 <Method ViewPropertyAnimator View.animate()>
	//* 311  618:fconst_0        
	//* 312  619:invokevirtual   #128 <Method ViewPropertyAnimator ViewPropertyAnimator.translationX(float)>
	//* 313  622:fconst_1        
	//* 314  623:invokevirtual   #131 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//* 315  626:aload_0         
	//* 316  627:getfield        #87  <Field long mAnimationTime>
	//* 317  630:invokevirtual   #135 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//* 318  633:aconst_null     
	//* 319  634:invokevirtual   #139 <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//* 320  637:pop             
	//* 321  638:aload_0         
	//* 322  639:getfield        #118 <Field VelocityTracker mVelocityTracker>
	//* 323  642:invokevirtual   #144 <Method void VelocityTracker.recycle()>
	//* 324  645:aload_0         
	//* 325  646:aconst_null     
	//* 326  647:putfield        #118 <Field VelocityTracker mVelocityTracker>
	//* 327  650:aload_0         
	//* 328  651:fconst_0        
	//* 329  652:putfield        #104 <Field float mTranslationX>
	//* 330  655:aload_0         
	//* 331  656:fconst_0        
	//* 332  657:putfield        #146 <Field float mDownX>
	//* 333  660:aload_0         
	//* 334  661:fconst_0        
	//* 335  662:putfield        #148 <Field float mDownY>
	//* 336  665:aload_0         
	//* 337  666:iconst_0        
	//* 338  667:putfield        #150 <Field boolean mSwiping>
	//* 339  670:iconst_0        
	//* 340  671:ireturn         
	//* 341  672:aload_0         
	//* 342  673:aload_2         
	//* 343  674:invokevirtual   #158 <Method float MotionEvent.getRawX()>
	//* 344  677:putfield        #146 <Field float mDownX>
	//* 345  680:aload_0         
	//* 346  681:aload_2         
	//* 347  682:invokevirtual   #161 <Method float MotionEvent.getRawY()>
	//* 348  685:putfield        #148 <Field float mDownY>
	//* 349  688:aload_0         
	//* 350  689:getfield        #93  <Field SwipeDismissTouchListener$DismissCallbacks mCallbacks>
	//* 351  692:aload_0         
	//* 352  693:getfield        #91  <Field Object mToken>
	//* 353  696:invokeinterface #215 <Method boolean SwipeDismissTouchListener$DismissCallbacks.canDismiss(Object)>
	//* 354  701:ifeq            719
	//* 355  704:aload_0         
	//* 356  705:invokestatic    #218 <Method VelocityTracker VelocityTracker.obtain()>
	//* 357  708:putfield        #118 <Field VelocityTracker mVelocityTracker>
	//* 358  711:aload_0         
	//* 359  712:getfield        #118 <Field VelocityTracker mVelocityTracker>
	//* 360  715:aload_2         
	//* 361  716:invokevirtual   #154 <Method void VelocityTracker.addMovement(MotionEvent)>
	//* 362  719:iconst_0        
	//* 363  720:ireturn         
			{
				return false;
	//  364  721:iconst_0        
	//  365  722:ireturn         
			}

		case 1: // '\001'
			if(mVelocityTracker == null)
				return false;
			f = motionevent.getRawX() - mDownX;
			mVelocityTracker.addMovement(motionevent);
			mVelocityTracker.computeCurrentVelocity(1000);
			f1 = mVelocityTracker.getXVelocity();
			f2 = Math.abs(f1);
			f3 = Math.abs(mVelocityTracker.getYVelocity());
			if(Math.abs(f) > (float)(mViewWidth / 2) && mSwiping)
			{
				if(f > 0.0F)
					flag = true;
				else
					flag = false;
				flag1 = true;
			} else
			if((float)mMinFlingVelocity <= f2 && f2 <= (float)mMaxFlingVelocity && f3 < f2 && mSwiping)
			{
				if(f1 < 0.0F)
					flag = true;
				else
					flag = false;
				if(f < 0.0F)
					flag1 = true;
				else
					flag1 = false;
				if(flag == flag1)
					flag1 = true;
				else
					flag1 = false;
				if(mVelocityTracker.getXVelocity() > 0.0F)
					flag = flag2;
				else
					flag = false;
			} else
			{
				flag1 = false;
				flag = false;
			}
			if(flag1)
			{
				view = ((View) (mView.animate()));
				if(flag)
					k = mViewWidth;
				else
					k = -mViewWidth;
				((ViewPropertyAnimator) (view)).translationX(k).alpha(0.0F).setDuration(mAnimationTime).setListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

					public void onAnimationEnd(Animator animator)
					{
						performDismiss();
					//    0    0:aload_0         
					//    1    1:getfield        #15  <Field SwipeDismissTouchListener this$0>
					//    2    4:invokevirtual   #24  <Method void SwipeDismissTouchListener.performDismiss()>
					//    3    7:return          
					}

					final SwipeDismissTouchListener this$0;

			
			{
				this$0 = SwipeDismissTouchListener.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field SwipeDismissTouchListener this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void AnimatorListenerAdapter()>
			//    5    9:return          
			}
				}
)));
			} else
			if(mSwiping)
				mView.animate().translationX(0.0F).alpha(1.0F).setDuration(mAnimationTime).setListener(((android.animation.Animator.AnimatorListener) (null)));
			mVelocityTracker.recycle();
			mVelocityTracker = null;
			mTranslationX = 0.0F;
			mDownX = 0.0F;
			mDownY = 0.0F;
			mSwiping = false;
			return false;

		case 0: // '\0'
			mDownX = motionevent.getRawX();
			mDownY = motionevent.getRawY();
			break;
		}
		if(mCallbacks.canDismiss(mToken))
		{
			mVelocityTracker = VelocityTracker.obtain();
			mVelocityTracker.addMovement(motionevent);
		}
		return false;
	}

	public void performDismiss()
	{
		final android.view.ViewGroup.LayoutParams lp = mView.getLayoutParams();
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field View mView>
	//    2    4:invokevirtual   #226 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    3    7:astore_2        
		final int originalHeight = mView.getHeight();
	//    4    8:aload_0         
	//    5    9:getfield        #89  <Field View mView>
	//    6   12:invokevirtual   #229 <Method int View.getHeight()>
	//    7   15:istore_1        
		ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
			originalHeight, 1
		}).setDuration(mAnimationTime);
	//    8   16:iconst_2        
	//    9   17:newarray        int[]
	//   10   19:dup             
	//   11   20:iconst_0        
	//   12   21:iload_1         
	//   13   22:iastore         
	//   14   23:dup             
	//   15   24:iconst_1        
	//   16   25:iconst_1        
	//   17   26:iastore         
	//   18   27:invokestatic    #235 <Method ValueAnimator ValueAnimator.ofInt(int[])>
	//   19   30:aload_0         
	//   20   31:getfield        #87  <Field long mAnimationTime>
	//   21   34:invokevirtual   #238 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   22   37:astore_3        
		valueanimator.addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

			public void onAnimationEnd(Animator animator)
			{
				mCallbacks.onDismiss(mView, mToken);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field SwipeDismissTouchListener this$0>
			//    2    4:invokestatic    #32  <Method SwipeDismissTouchListener$DismissCallbacks SwipeDismissTouchListener.access$200(SwipeDismissTouchListener)>
			//    3    7:aload_0         
			//    4    8:getfield        #19  <Field SwipeDismissTouchListener this$0>
			//    5   11:invokestatic    #36  <Method View SwipeDismissTouchListener.access$000(SwipeDismissTouchListener)>
			//    6   14:aload_0         
			//    7   15:getfield        #19  <Field SwipeDismissTouchListener this$0>
			//    8   18:invokestatic    #40  <Method Object SwipeDismissTouchListener.access$100(SwipeDismissTouchListener)>
			//    9   21:invokeinterface #46  <Method void SwipeDismissTouchListener$DismissCallbacks.onDismiss(View, Object)>
				mView.setAlpha(1.0F);
			//   10   26:aload_0         
			//   11   27:getfield        #19  <Field SwipeDismissTouchListener this$0>
			//   12   30:invokestatic    #36  <Method View SwipeDismissTouchListener.access$000(SwipeDismissTouchListener)>
			//   13   33:fconst_1        
			//   14   34:invokevirtual   #52  <Method void View.setAlpha(float)>
				mView.setTranslationX(0.0F);
			//   15   37:aload_0         
			//   16   38:getfield        #19  <Field SwipeDismissTouchListener this$0>
			//   17   41:invokestatic    #36  <Method View SwipeDismissTouchListener.access$000(SwipeDismissTouchListener)>
			//   18   44:fconst_0        
			//   19   45:invokevirtual   #55  <Method void View.setTranslationX(float)>
				lp.height = originalHeight;
			//   20   48:aload_0         
			//   21   49:getfield        #21  <Field android.view.ViewGroup$LayoutParams val$lp>
			//   22   52:aload_0         
			//   23   53:getfield        #23  <Field int val$originalHeight>
			//   24   56:putfield        #60  <Field int android.view.ViewGroup$LayoutParams.height>
				mView.setLayoutParams(lp);
			//   25   59:aload_0         
			//   26   60:getfield        #19  <Field SwipeDismissTouchListener this$0>
			//   27   63:invokestatic    #36  <Method View SwipeDismissTouchListener.access$000(SwipeDismissTouchListener)>
			//   28   66:aload_0         
			//   29   67:getfield        #21  <Field android.view.ViewGroup$LayoutParams val$lp>
			//   30   70:invokevirtual   #64  <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			//   31   73:return          
			}

			final SwipeDismissTouchListener this$0;
			final android.view.ViewGroup.LayoutParams val$lp;
			final int val$originalHeight;

			
			{
				this$0 = SwipeDismissTouchListener.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field SwipeDismissTouchListener this$0>
				lp = layoutparams;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field android.view.ViewGroup$LayoutParams val$lp>
				originalHeight = i;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #23  <Field int val$originalHeight>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #25  <Method void AnimatorListenerAdapter()>
			//   11   19:return          
			}
		}
)));
	//   23   38:aload_3         
	//   24   39:new             #10  <Class SwipeDismissTouchListener$2>
	//   25   42:dup             
	//   26   43:aload_0         
	//   27   44:aload_2         
	//   28   45:iload_1         
	//   29   46:invokespecial   #241 <Method void SwipeDismissTouchListener$2(SwipeDismissTouchListener, android.view.ViewGroup$LayoutParams, int)>
	//   30   49:invokevirtual   #245 <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
		valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

			public void onAnimationUpdate(ValueAnimator valueanimator1)
			{
				lp.height = ((Integer)valueanimator1.getAnimatedValue()).intValue();
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field android.view.ViewGroup$LayoutParams val$lp>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #32  <Method Object ValueAnimator.getAnimatedValue()>
			//    4    8:checkcast       #34  <Class Integer>
			//    5   11:invokevirtual   #38  <Method int Integer.intValue()>
			//    6   14:putfield        #44  <Field int android.view.ViewGroup$LayoutParams.height>
				mView.setLayoutParams(lp);
			//    7   17:aload_0         
			//    8   18:getfield        #19  <Field SwipeDismissTouchListener this$0>
			//    9   21:invokestatic    #48  <Method View SwipeDismissTouchListener.access$000(SwipeDismissTouchListener)>
			//   10   24:aload_0         
			//   11   25:getfield        #21  <Field android.view.ViewGroup$LayoutParams val$lp>
			//   12   28:invokevirtual   #54  <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			//   13   31:return          
			}

			final SwipeDismissTouchListener this$0;
			final android.view.ViewGroup.LayoutParams val$lp;

			
			{
				this$0 = SwipeDismissTouchListener.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field SwipeDismissTouchListener this$0>
				lp = layoutparams;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field android.view.ViewGroup$LayoutParams val$lp>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   31   52:aload_3         
	//   32   53:new             #12  <Class SwipeDismissTouchListener$3>
	//   33   56:dup             
	//   34   57:aload_0         
	//   35   58:aload_2         
	//   36   59:invokespecial   #248 <Method void SwipeDismissTouchListener$3(SwipeDismissTouchListener, android.view.ViewGroup$LayoutParams)>
	//   37   62:invokevirtual   #252 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		valueanimator.start();
	//   38   65:aload_3         
	//   39   66:invokevirtual   #255 <Method void ValueAnimator.start()>
	//   40   69:return          
	}

	private long mAnimationTime;
	private DismissCallbacks mCallbacks;
	private float mDownX;
	private float mDownY;
	private int mMaxFlingVelocity;
	private int mMinFlingVelocity;
	private int mSlop;
	private boolean mSwiping;
	private int mSwipingSlop;
	private Object mToken;
	private float mTranslationX;
	private VelocityTracker mVelocityTracker;
	private View mView;
	private int mViewWidth;


/*
	static View access$000(SwipeDismissTouchListener swipedismisstouchlistener)
	{
		return swipedismisstouchlistener.mView;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field View mView>
	//    2    4:areturn         
	}

*/


/*
	static Object access$100(SwipeDismissTouchListener swipedismisstouchlistener)
	{
		return swipedismisstouchlistener.mToken;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field Object mToken>
	//    2    4:areturn         
	}

*/


/*
	static DismissCallbacks access$200(SwipeDismissTouchListener swipedismisstouchlistener)
	{
		return swipedismisstouchlistener.mCallbacks;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field SwipeDismissTouchListener$DismissCallbacks mCallbacks>
	//    2    4:areturn         
	}

*/
}
