// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps;

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

		public abstract void onNotifySwipe();
	}


	public SwipeDismissTouchListener(View view, Object obj, DismissCallbacks dismisscallbacks)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
		g = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #51  <Field int g>
		ViewConfiguration viewconfiguration = ViewConfiguration.get(view.getContext());
	//    5    9:aload_1         
	//    6   10:invokevirtual   #57  <Method Context View.getContext()>
	//    7   13:invokestatic    #63  <Method ViewConfiguration ViewConfiguration.get(Context)>
	//    8   16:astore          4
		a = viewconfiguration.getScaledTouchSlop();
	//    9   18:aload_0         
	//   10   19:aload           4
	//   11   21:invokevirtual   #67  <Method int ViewConfiguration.getScaledTouchSlop()>
	//   12   24:putfield        #69  <Field int a>
		b = viewconfiguration.getScaledMinimumFlingVelocity() * 16;
	//   13   27:aload_0         
	//   14   28:aload           4
	//   15   30:invokevirtual   #72  <Method int ViewConfiguration.getScaledMinimumFlingVelocity()>
	//   16   33:bipush          16
	//   17   35:imul            
	//   18   36:putfield        #74  <Field int b>
		c = viewconfiguration.getScaledMaximumFlingVelocity();
	//   19   39:aload_0         
	//   20   40:aload           4
	//   21   42:invokevirtual   #77  <Method int ViewConfiguration.getScaledMaximumFlingVelocity()>
	//   22   45:putfield        #79  <Field int c>
		d = view.getContext().getResources().getInteger(0x10e0000);
	//   23   48:aload_0         
	//   24   49:aload_1         
	//   25   50:invokevirtual   #57  <Method Context View.getContext()>
	//   26   53:invokevirtual   #85  <Method Resources Context.getResources()>
	//   27   56:ldc1            #86  <Int 0x10e0000>
	//   28   58:invokevirtual   #92  <Method int Resources.getInteger(int)>
	//   29   61:i2l             
	//   30   62:putfield        #94  <Field long d>
		e = view;
	//   31   65:aload_0         
	//   32   66:aload_1         
	//   33   67:putfield        #96  <Field View e>
		l = obj;
	//   34   70:aload_0         
	//   35   71:aload_2         
	//   36   72:putfield        #98  <Field Object l>
		f = dismisscallbacks;
	//   37   75:aload_0         
	//   38   76:aload_3         
	//   39   77:putfield        #100 <Field SwipeDismissTouchListener$DismissCallbacks f>
	//   40   80:return          
	}

	private void a()
	{
		f.onDismiss(e, l);
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field SwipeDismissTouchListener$DismissCallbacks f>
	//    2    4:aload_0         
	//    3    5:getfield        #96  <Field View e>
	//    4    8:aload_0         
	//    5    9:getfield        #98  <Field Object l>
	//    6   12:invokeinterface #105 <Method void SwipeDismissTouchListener$DismissCallbacks.onDismiss(View, Object)>
		android.view.ViewGroup.LayoutParams layoutparams = e.getLayoutParams();
	//    7   17:aload_0         
	//    8   18:getfield        #96  <Field View e>
	//    9   21:invokevirtual   #109 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   10   24:astore_2        
		int i1 = e.getHeight();
	//   11   25:aload_0         
	//   12   26:getfield        #96  <Field View e>
	//   13   29:invokevirtual   #112 <Method int View.getHeight()>
	//   14   32:istore_1        
		ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
			i1, 1
		}).setDuration(d);
	//   15   33:iconst_2        
	//   16   34:newarray        int[]
	//   17   36:dup             
	//   18   37:iconst_0        
	//   19   38:iload_1         
	//   20   39:iastore         
	//   21   40:dup             
	//   22   41:iconst_1        
	//   23   42:iconst_1        
	//   24   43:iastore         
	//   25   44:invokestatic    #118 <Method ValueAnimator ValueAnimator.ofInt(int[])>
	//   26   47:aload_0         
	//   27   48:getfield        #94  <Field long d>
	//   28   51:invokevirtual   #122 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   29   54:astore_3        
		valueanimator.addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter(layoutparams, i1) {

			public void onAnimationEnd(Animator animator)
			{
				SwipeDismissTouchListener.b(c).setAlpha(0.0F);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field SwipeDismissTouchListener c>
			//    2    4:invokestatic    #30  <Method View SwipeDismissTouchListener.b(SwipeDismissTouchListener)>
			//    3    7:fconst_0        
			//    4    8:invokevirtual   #36  <Method void View.setAlpha(float)>
				SwipeDismissTouchListener.b(c).setTranslationX(0.0F);
			//    5   11:aload_0         
			//    6   12:getfield        #18  <Field SwipeDismissTouchListener c>
			//    7   15:invokestatic    #30  <Method View SwipeDismissTouchListener.b(SwipeDismissTouchListener)>
			//    8   18:fconst_0        
			//    9   19:invokevirtual   #39  <Method void View.setTranslationX(float)>
				a.height = b;
			//   10   22:aload_0         
			//   11   23:getfield        #20  <Field android.view.ViewGroup$LayoutParams a>
			//   12   26:aload_0         
			//   13   27:getfield        #22  <Field int b>
			//   14   30:putfield        #44  <Field int android.view.ViewGroup$LayoutParams.height>
				SwipeDismissTouchListener.b(c).setLayoutParams(a);
			//   15   33:aload_0         
			//   16   34:getfield        #18  <Field SwipeDismissTouchListener c>
			//   17   37:invokestatic    #30  <Method View SwipeDismissTouchListener.b(SwipeDismissTouchListener)>
			//   18   40:aload_0         
			//   19   41:getfield        #20  <Field android.view.ViewGroup$LayoutParams a>
			//   20   44:invokevirtual   #48  <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			//   21   47:return          
			}

			final android.view.ViewGroup.LayoutParams a;
			final int b;
			final SwipeDismissTouchListener c;

			
			{
				c = SwipeDismissTouchListener.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field SwipeDismissTouchListener c>
				a = layoutparams;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field android.view.ViewGroup$LayoutParams a>
				b = i1;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #22  <Field int b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #24  <Method void AnimatorListenerAdapter()>
			//   11   19:return          
			}
		}
)));
	//   30   55:aload_3         
	//   31   56:new             #10  <Class SwipeDismissTouchListener$2>
	//   32   59:dup             
	//   33   60:aload_0         
	//   34   61:aload_2         
	//   35   62:iload_1         
	//   36   63:invokespecial   #125 <Method void SwipeDismissTouchListener$2(SwipeDismissTouchListener, android.view.ViewGroup$LayoutParams, int)>
	//   37   66:invokevirtual   #129 <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
		valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(layoutparams) {

			public void onAnimationUpdate(ValueAnimator valueanimator1)
			{
				a.height = ((Integer)valueanimator1.getAnimatedValue()).intValue();
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field android.view.ViewGroup$LayoutParams a>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #31  <Method Object ValueAnimator.getAnimatedValue()>
			//    4    8:checkcast       #33  <Class Integer>
			//    5   11:invokevirtual   #37  <Method int Integer.intValue()>
			//    6   14:putfield        #43  <Field int android.view.ViewGroup$LayoutParams.height>
				SwipeDismissTouchListener.b(b).setLayoutParams(a);
			//    7   17:aload_0         
			//    8   18:getfield        #18  <Field SwipeDismissTouchListener b>
			//    9   21:invokestatic    #46  <Method View SwipeDismissTouchListener.b(SwipeDismissTouchListener)>
			//   10   24:aload_0         
			//   11   25:getfield        #20  <Field android.view.ViewGroup$LayoutParams a>
			//   12   28:invokevirtual   #52  <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			//   13   31:return          
			}

			final android.view.ViewGroup.LayoutParams a;
			final SwipeDismissTouchListener b;

			
			{
				b = SwipeDismissTouchListener.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field SwipeDismissTouchListener b>
				a = layoutparams;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field android.view.ViewGroup$LayoutParams a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   38   69:aload_3         
	//   39   70:new             #12  <Class SwipeDismissTouchListener$3>
	//   40   73:dup             
	//   41   74:aload_0         
	//   42   75:aload_2         
	//   43   76:invokespecial   #132 <Method void SwipeDismissTouchListener$3(SwipeDismissTouchListener, android.view.ViewGroup$LayoutParams)>
	//   44   79:invokevirtual   #136 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		valueanimator.start();
	//   45   82:aload_3         
	//   46   83:invokevirtual   #139 <Method void ValueAnimator.start()>
	//   47   86:return          
	}

	static void a(SwipeDismissTouchListener swipedismisstouchlistener)
	{
		swipedismisstouchlistener.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #142 <Method void a()>
	//    2    4:return          
	}

	static View b(SwipeDismissTouchListener swipedismisstouchlistener)
	{
		return swipedismisstouchlistener.e;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field View e>
	//    2    4:areturn         
	}

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		motionevent.offsetLocation(n, 0.0F);
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #147 <Field float n>
	//    3    5:fconst_0        
	//    4    6:invokevirtual   #153 <Method void MotionEvent.offsetLocation(float, float)>
		if(g < 2)
	//*   5    9:aload_0         
	//*   6   10:getfield        #51  <Field int g>
	//*   7   13:iconst_2        
	//*   8   14:icmpge          28
			g = e.getWidth();
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #96  <Field View e>
	//   12   22:invokevirtual   #156 <Method int View.getWidth()>
	//   13   25:putfield        #51  <Field int g>
		switch(motionevent.getActionMasked())
	//*  14   28:aload_2         
	//*  15   29:invokevirtual   #159 <Method int MotionEvent.getActionMasked()>
		{
		default:
			break;

	//*  16   32:tableswitch     0 3: default 64
	//	               0 67
	//	               1 121
	//	               2 578
	//	               3 506
	//*  17   64:goto            848
		case 0: // '\0'
			h = motionevent.getRawX();
	//   18   67:aload_0         
	//   19   68:aload_2         
	//   20   69:invokevirtual   #163 <Method float MotionEvent.getRawX()>
	//   21   72:putfield        #165 <Field float h>
			i = motionevent.getRawY();
	//   22   75:aload_0         
	//   23   76:aload_2         
	//   24   77:invokevirtual   #168 <Method float MotionEvent.getRawY()>
	//   25   80:putfield        #170 <Field float i>
			if(f.canDismiss(l))
	//*  26   83:aload_0         
	//*  27   84:getfield        #100 <Field SwipeDismissTouchListener$DismissCallbacks f>
	//*  28   87:aload_0         
	//*  29   88:getfield        #98  <Field Object l>
	//*  30   91:invokeinterface #174 <Method boolean SwipeDismissTouchListener$DismissCallbacks.canDismiss(Object)>
	//*  31   96:ifeq            119
			{
				o = false;
	//   32   99:aload_0         
	//   33  100:iconst_0        
	//   34  101:putfield        #176 <Field boolean o>
				m = VelocityTracker.obtain();
	//   35  104:aload_0         
	//   36  105:invokestatic    #182 <Method VelocityTracker VelocityTracker.obtain()>
	//   37  108:putfield        #184 <Field VelocityTracker m>
				m.addMovement(motionevent);
	//   38  111:aload_0         
	//   39  112:getfield        #184 <Field VelocityTracker m>
	//   40  115:aload_2         
	//   41  116:invokevirtual   #188 <Method void VelocityTracker.addMovement(MotionEvent)>
			}
			return true;
	//   42  119:iconst_1        
	//   43  120:ireturn         

		case 1: // '\001'
			if(m != null)
	//*  44  121:aload_0         
	//*  45  122:getfield        #184 <Field VelocityTracker m>
	//*  46  125:ifnonnull       131
	//*  47  128:goto            848
			{
				float f1 = motionevent.getRawX() - h;
	//   48  131:aload_2         
	//   49  132:invokevirtual   #163 <Method float MotionEvent.getRawX()>
	//   50  135:aload_0         
	//   51  136:getfield        #165 <Field float h>
	//   52  139:fsub            
	//   53  140:fstore_3        
				m.addMovement(motionevent);
	//   54  141:aload_0         
	//   55  142:getfield        #184 <Field VelocityTracker m>
	//   56  145:aload_2         
	//   57  146:invokevirtual   #188 <Method void VelocityTracker.addMovement(MotionEvent)>
				m.computeCurrentVelocity(1000);
	//   58  149:aload_0         
	//   59  150:getfield        #184 <Field VelocityTracker m>
	//   60  153:sipush          1000
	//   61  156:invokevirtual   #192 <Method void VelocityTracker.computeCurrentVelocity(int)>
				float f4 = m.getXVelocity();
	//   62  159:aload_0         
	//   63  160:getfield        #184 <Field VelocityTracker m>
	//   64  163:invokevirtual   #195 <Method float VelocityTracker.getXVelocity()>
	//   65  166:fstore          4
				float f6 = Math.abs(f4);
	//   66  168:fload           4
	//   67  170:invokestatic    #201 <Method float Math.abs(float)>
	//   68  173:fstore          5
				float f8 = Math.abs(m.getYVelocity());
	//   69  175:aload_0         
	//   70  176:getfield        #184 <Field VelocityTracker m>
	//   71  179:invokevirtual   #204 <Method float VelocityTracker.getYVelocity()>
	//   72  182:invokestatic    #201 <Method float Math.abs(float)>
	//   73  185:fstore          6
				boolean flag2 = false;
	//   74  187:iconst_0        
	//   75  188:istore          9
				boolean flag3 = false;
	//   76  190:iconst_0        
	//   77  191:istore          10
				boolean flag;
				boolean flag1;
				if(Math.abs(f1) > (float)(g / 2) && j)
	//*  78  193:fload_3         
	//*  79  194:invokestatic    #201 <Method float Math.abs(float)>
	//*  80  197:aload_0         
	//*  81  198:getfield        #51  <Field int g>
	//*  82  201:iconst_2        
	//*  83  202:idiv            
	//*  84  203:i2f             
	//*  85  204:fcmpl           
	//*  86  205:ifle            236
	//*  87  208:aload_0         
	//*  88  209:getfield        #206 <Field boolean j>
	//*  89  212:ifeq            236
				{
					flag1 = true;
	//   90  215:iconst_1        
	//   91  216:istore          8
					if(f1 > 0.0F)
	//*  92  218:fload_3         
	//*  93  219:fconst_0        
	//*  94  220:fcmpl           
	//*  95  221:ifle            230
						flag = true;
	//   96  224:iconst_1        
	//   97  225:istore          7
					else
	//*  98  227:goto            233
						flag = false;
	//   99  230:iconst_0        
	//  100  231:istore          7
				} else
	//* 101  233:goto            373
				{
					flag1 = flag2;
	//  102  236:iload           9
	//  103  238:istore          8
					flag = flag3;
	//  104  240:iload           10
	//  105  242:istore          7
					if((float)b <= f6)
	//* 106  244:aload_0         
	//* 107  245:getfield        #74  <Field int b>
	//* 108  248:i2f             
	//* 109  249:fload           5
	//* 110  251:fcmpg           
	//* 111  252:ifgt            373
					{
						flag1 = flag2;
	//  112  255:iload           9
	//  113  257:istore          8
						flag = flag3;
	//  114  259:iload           10
	//  115  261:istore          7
						if(f6 <= (float)c)
	//* 116  263:fload           5
	//* 117  265:aload_0         
	//* 118  266:getfield        #79  <Field int c>
	//* 119  269:i2f             
	//* 120  270:fcmpg           
	//* 121  271:ifgt            373
						{
							flag1 = flag2;
	//  122  274:iload           9
	//  123  276:istore          8
							flag = flag3;
	//  124  278:iload           10
	//  125  280:istore          7
							if(f8 < f6)
	//* 126  282:fload           6
	//* 127  284:fload           5
	//* 128  286:fcmpg           
	//* 129  287:ifge            373
							{
								flag1 = flag2;
	//  130  290:iload           9
	//  131  292:istore          8
								flag = flag3;
	//  132  294:iload           10
	//  133  296:istore          7
								if(j)
	//* 134  298:aload_0         
	//* 135  299:getfield        #206 <Field boolean j>
	//* 136  302:ifeq            373
								{
									if(f4 < 0.0F)
	//* 137  305:fload           4
	//* 138  307:fconst_0        
	//* 139  308:fcmpg           
	//* 140  309:ifge            318
										flag = true;
	//  141  312:iconst_1        
	//  142  313:istore          7
									else
	//* 143  315:goto            321
										flag = false;
	//  144  318:iconst_0        
	//  145  319:istore          7
									if(f1 < 0.0F)
	//* 146  321:fload_3         
	//* 147  322:fconst_0        
	//* 148  323:fcmpg           
	//* 149  324:ifge            333
										flag1 = true;
	//  150  327:iconst_1        
	//  151  328:istore          8
									else
	//* 152  330:goto            336
										flag1 = false;
	//  153  333:iconst_0        
	//  154  334:istore          8
									if(flag == flag1)
	//* 155  336:iload           7
	//* 156  338:iload           8
	//* 157  340:icmpne          349
										flag1 = true;
	//  158  343:iconst_1        
	//  159  344:istore          8
									else
	//* 160  346:goto            352
										flag1 = false;
	//  161  349:iconst_0        
	//  162  350:istore          8
									if(m.getXVelocity() > 0.0F)
	//* 163  352:aload_0         
	//* 164  353:getfield        #184 <Field VelocityTracker m>
	//* 165  356:invokevirtual   #195 <Method float VelocityTracker.getXVelocity()>
	//* 166  359:fconst_0        
	//* 167  360:fcmpl           
	//* 168  361:ifle            370
										flag = true;
	//  169  364:iconst_1        
	//  170  365:istore          7
									else
	//* 171  367:goto            373
										flag = false;
	//  172  370:iconst_0        
	//  173  371:istore          7
								}
							}
						}
					}
				}
				if(flag1)
	//* 174  373:iload           8
	//* 175  375:ifeq            437
				{
					view = ((View) (e.animate()));
	//  176  378:aload_0         
	//  177  379:getfield        #96  <Field View e>
	//  178  382:invokevirtual   #210 <Method ViewPropertyAnimator View.animate()>
	//  179  385:astore_1        
					float f2;
					if(flag)
	//* 180  386:iload           7
	//* 181  388:ifeq            400
						f2 = g;
	//  182  391:aload_0         
	//  183  392:getfield        #51  <Field int g>
	//  184  395:i2f             
	//  185  396:fstore_3        
					else
	//* 186  397:goto            407
						f2 = -g;
	//  187  400:aload_0         
	//  188  401:getfield        #51  <Field int g>
	//  189  404:ineg            
	//  190  405:i2f             
	//  191  406:fstore_3        
					((ViewPropertyAnimator) (view)).translationX(f2).alpha(0.0F).setDuration(50L).setListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

						public void onAnimationEnd(Animator animator)
						{
							SwipeDismissTouchListener.a(a);
						//    0    0:aload_0         
						//    1    1:getfield        #15  <Field SwipeDismissTouchListener a>
						//    2    4:invokestatic    #23  <Method void SwipeDismissTouchListener.a(SwipeDismissTouchListener)>
						//    3    7:return          
						}

						final SwipeDismissTouchListener a;

			
			{
				a = SwipeDismissTouchListener.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field SwipeDismissTouchListener a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void AnimatorListenerAdapter()>
			//    5    9:return          
			}
					}
)));
	//  192  407:aload_1         
	//  193  408:fload_3         
	//  194  409:invokevirtual   #216 <Method ViewPropertyAnimator ViewPropertyAnimator.translationX(float)>
	//  195  412:fconst_0        
	//  196  413:invokevirtual   #219 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//  197  416:ldc2w           #220 <Long 50L>
	//  198  419:invokevirtual   #224 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//  199  422:new             #8   <Class SwipeDismissTouchListener$1>
	//  200  425:dup             
	//  201  426:aload_0         
	//  202  427:invokespecial   #226 <Method void SwipeDismissTouchListener$1(SwipeDismissTouchListener)>
	//  203  430:invokevirtual   #230 <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//  204  433:pop             
				} else
	//* 205  434:goto            471
				if(j)
	//* 206  437:aload_0         
	//* 207  438:getfield        #206 <Field boolean j>
	//* 208  441:ifeq            471
					e.animate().translationX(0.0F).alpha(1.0F).setDuration(d).setListener(((android.animation.Animator.AnimatorListener) (null)));
	//  209  444:aload_0         
	//  210  445:getfield        #96  <Field View e>
	//  211  448:invokevirtual   #210 <Method ViewPropertyAnimator View.animate()>
	//  212  451:fconst_0        
	//  213  452:invokevirtual   #216 <Method ViewPropertyAnimator ViewPropertyAnimator.translationX(float)>
	//  214  455:fconst_1        
	//  215  456:invokevirtual   #219 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//  216  459:aload_0         
	//  217  460:getfield        #94  <Field long d>
	//  218  463:invokevirtual   #224 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//  219  466:aconst_null     
	//  220  467:invokevirtual   #230 <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//  221  470:pop             
				m.recycle();
	//  222  471:aload_0         
	//  223  472:getfield        #184 <Field VelocityTracker m>
	//  224  475:invokevirtual   #233 <Method void VelocityTracker.recycle()>
				m = null;
	//  225  478:aload_0         
	//  226  479:aconst_null     
	//  227  480:putfield        #184 <Field VelocityTracker m>
				n = 0.0F;
	//  228  483:aload_0         
	//  229  484:fconst_0        
	//  230  485:putfield        #147 <Field float n>
				h = 0.0F;
	//  231  488:aload_0         
	//  232  489:fconst_0        
	//  233  490:putfield        #165 <Field float h>
				i = 0.0F;
	//  234  493:aload_0         
	//  235  494:fconst_0        
	//  236  495:putfield        #170 <Field float i>
				j = false;
	//  237  498:aload_0         
	//  238  499:iconst_0        
	//  239  500:putfield        #206 <Field boolean j>
			}
			break;
	//  240  503:goto            848

		case 3: // '\003'
			if(m != null)
	//* 241  506:aload_0         
	//* 242  507:getfield        #184 <Field VelocityTracker m>
	//* 243  510:ifnonnull       516
	//* 244  513:goto            848
			{
				e.animate().translationX(0.0F).alpha(1.0F).setDuration(d).setListener(((android.animation.Animator.AnimatorListener) (null)));
	//  245  516:aload_0         
	//  246  517:getfield        #96  <Field View e>
	//  247  520:invokevirtual   #210 <Method ViewPropertyAnimator View.animate()>
	//  248  523:fconst_0        
	//  249  524:invokevirtual   #216 <Method ViewPropertyAnimator ViewPropertyAnimator.translationX(float)>
	//  250  527:fconst_1        
	//  251  528:invokevirtual   #219 <Method ViewPropertyAnimator ViewPropertyAnimator.alpha(float)>
	//  252  531:aload_0         
	//  253  532:getfield        #94  <Field long d>
	//  254  535:invokevirtual   #224 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
	//  255  538:aconst_null     
	//  256  539:invokevirtual   #230 <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//  257  542:pop             
				m.recycle();
	//  258  543:aload_0         
	//  259  544:getfield        #184 <Field VelocityTracker m>
	//  260  547:invokevirtual   #233 <Method void VelocityTracker.recycle()>
				m = null;
	//  261  550:aload_0         
	//  262  551:aconst_null     
	//  263  552:putfield        #184 <Field VelocityTracker m>
				n = 0.0F;
	//  264  555:aload_0         
	//  265  556:fconst_0        
	//  266  557:putfield        #147 <Field float n>
				h = 0.0F;
	//  267  560:aload_0         
	//  268  561:fconst_0        
	//  269  562:putfield        #165 <Field float h>
				i = 0.0F;
	//  270  565:aload_0         
	//  271  566:fconst_0        
	//  272  567:putfield        #170 <Field float i>
				j = false;
	//  273  570:aload_0         
	//  274  571:iconst_0        
	//  275  572:putfield        #206 <Field boolean j>
			}
			break;
	//  276  575:goto            848

		case 2: // '\002'
			if(m == null)
	//* 277  578:aload_0         
	//* 278  579:getfield        #184 <Field VelocityTracker m>
	//* 279  582:ifnonnull       588
				break;
	//  280  585:goto            848
			m.addMovement(motionevent);
	//  281  588:aload_0         
	//  282  589:getfield        #184 <Field VelocityTracker m>
	//  283  592:aload_2         
	//  284  593:invokevirtual   #188 <Method void VelocityTracker.addMovement(MotionEvent)>
			float f3 = motionevent.getRawX() - h;
	//  285  596:aload_2         
	//  286  597:invokevirtual   #163 <Method float MotionEvent.getRawX()>
	//  287  600:aload_0         
	//  288  601:getfield        #165 <Field float h>
	//  289  604:fsub            
	//  290  605:fstore_3        
			float f5 = motionevent.getRawY();
	//  291  606:aload_2         
	//  292  607:invokevirtual   #168 <Method float MotionEvent.getRawY()>
	//  293  610:fstore          4
			float f7 = i;
	//  294  612:aload_0         
	//  295  613:getfield        #170 <Field float i>
	//  296  616:fstore          5
			if(Math.abs(f3) > (float)a && Math.abs(f5 - f7) < Math.abs(f3) / 2.0F)
	//* 297  618:fload_3         
	//* 298  619:invokestatic    #201 <Method float Math.abs(float)>
	//* 299  622:aload_0         
	//* 300  623:getfield        #69  <Field int a>
	//* 301  626:i2f             
	//* 302  627:fcmpl           
	//* 303  628:ifle            791
	//* 304  631:fload           4
	//* 305  633:fload           5
	//* 306  635:fsub            
	//* 307  636:invokestatic    #201 <Method float Math.abs(float)>
	//* 308  639:fload_3         
	//* 309  640:invokestatic    #201 <Method float Math.abs(float)>
	//* 310  643:fconst_2        
	//* 311  644:fdiv            
	//* 312  645:fcmpg           
	//* 313  646:ifge            791
			{
				j = true;
	//  314  649:aload_0         
	//  315  650:iconst_1        
	//  316  651:putfield        #206 <Field boolean j>
				int i1;
				if(f3 > 0.0F)
	//* 317  654:fload_3         
	//* 318  655:fconst_0        
	//* 319  656:fcmpl           
	//* 320  657:ifle            669
					i1 = a;
	//  321  660:aload_0         
	//  322  661:getfield        #69  <Field int a>
	//  323  664:istore          7
				else
	//* 324  666:goto            676
					i1 = -a;
	//  325  669:aload_0         
	//  326  670:getfield        #69  <Field int a>
	//  327  673:ineg            
	//  328  674:istore          7
				k = i1;
	//  329  676:aload_0         
	//  330  677:iload           7
	//  331  679:putfield        #235 <Field int k>
				e.getParent().requestDisallowInterceptTouchEvent(true);
	//  332  682:aload_0         
	//  333  683:getfield        #96  <Field View e>
	//  334  686:invokevirtual   #239 <Method ViewParent View.getParent()>
	//  335  689:iconst_1        
	//  336  690:invokeinterface #245 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
				if(!o)
	//* 337  695:aload_0         
	//* 338  696:getfield        #176 <Field boolean o>
	//* 339  699:ifne            716
				{
					o = true;
	//  340  702:aload_0         
	//  341  703:iconst_1        
	//  342  704:putfield        #176 <Field boolean o>
					f.onNotifySwipe();
	//  343  707:aload_0         
	//  344  708:getfield        #100 <Field SwipeDismissTouchListener$DismissCallbacks f>
	//  345  711:invokeinterface #248 <Method void SwipeDismissTouchListener$DismissCallbacks.onNotifySwipe()>
				}
				if(Math.abs(f3) > (float)(g / 3))
	//* 346  716:fload_3         
	//* 347  717:invokestatic    #201 <Method float Math.abs(float)>
	//* 348  720:aload_0         
	//* 349  721:getfield        #51  <Field int g>
	//* 350  724:iconst_3        
	//* 351  725:idiv            
	//* 352  726:i2f             
	//* 353  727:fcmpl           
	//* 354  728:ifle            755
				{
					if(!p)
	//* 355  731:aload_0         
	//* 356  732:getfield        #250 <Field boolean p>
	//* 357  735:ifne            760
					{
						p = true;
	//  358  738:aload_0         
	//  359  739:iconst_1        
	//  360  740:putfield        #250 <Field boolean p>
						f.onNotifySwipe();
	//  361  743:aload_0         
	//  362  744:getfield        #100 <Field SwipeDismissTouchListener$DismissCallbacks f>
	//  363  747:invokeinterface #248 <Method void SwipeDismissTouchListener$DismissCallbacks.onNotifySwipe()>
					}
				} else
	//* 364  752:goto            760
				{
					p = false;
	//  365  755:aload_0         
	//  366  756:iconst_0        
	//  367  757:putfield        #250 <Field boolean p>
				}
				view = ((View) (MotionEvent.obtain(motionevent)));
	//  368  760:aload_2         
	//  369  761:invokestatic    #253 <Method MotionEvent MotionEvent.obtain(MotionEvent)>
	//  370  764:astore_1        
				((MotionEvent) (view)).setAction(motionevent.getActionIndex() << 8 | 3);
	//  371  765:aload_1         
	//  372  766:aload_2         
	//  373  767:invokevirtual   #256 <Method int MotionEvent.getActionIndex()>
	//  374  770:bipush          8
	//  375  772:ishl            
	//  376  773:iconst_3        
	//  377  774:ior             
	//  378  775:invokevirtual   #259 <Method void MotionEvent.setAction(int)>
				e.onTouchEvent(((MotionEvent) (view)));
	//  379  778:aload_0         
	//  380  779:getfield        #96  <Field View e>
	//  381  782:aload_1         
	//  382  783:invokevirtual   #263 <Method boolean View.onTouchEvent(MotionEvent)>
	//  383  786:pop             
				((MotionEvent) (view)).recycle();
	//  384  787:aload_1         
	//  385  788:invokevirtual   #264 <Method void MotionEvent.recycle()>
			}
			if(j)
	//* 386  791:aload_0         
	//* 387  792:getfield        #206 <Field boolean j>
	//* 388  795:ifeq            848
			{
				n = f3;
	//  389  798:aload_0         
	//  390  799:fload_3         
	//  391  800:putfield        #147 <Field float n>
				e.setTranslationX(f3 - (float)k);
	//  392  803:aload_0         
	//  393  804:getfield        #96  <Field View e>
	//  394  807:fload_3         
	//  395  808:aload_0         
	//  396  809:getfield        #235 <Field int k>
	//  397  812:i2f             
	//  398  813:fsub            
	//  399  814:invokevirtual   #268 <Method void View.setTranslationX(float)>
				e.setAlpha(Math.max(0.0F, Math.min(1.0F, 1.0F - (Math.abs(f3) * 2.0F) / (float)g)));
	//  400  817:aload_0         
	//  401  818:getfield        #96  <Field View e>
	//  402  821:fconst_0        
	//  403  822:fconst_1        
	//  404  823:fconst_1        
	//  405  824:fload_3         
	//  406  825:invokestatic    #201 <Method float Math.abs(float)>
	//  407  828:fconst_2        
	//  408  829:fmul            
	//  409  830:aload_0         
	//  410  831:getfield        #51  <Field int g>
	//  411  834:i2f             
	//  412  835:fdiv            
	//  413  836:fsub            
	//  414  837:invokestatic    #272 <Method float Math.min(float, float)>
	//  415  840:invokestatic    #275 <Method float Math.max(float, float)>
	//  416  843:invokevirtual   #278 <Method void View.setAlpha(float)>
				return true;
	//  417  846:iconst_1        
	//  418  847:ireturn         
			}
			break;
		}
		return false;
	//  419  848:iconst_0        
	//  420  849:ireturn         
	}

	public static final int A_HALF = 2;
	public static final int MIN_VIEW_WIDTH = 2;
	public static final int ONE_THIRD = 3;
	private int a;
	private int b;
	private int c;
	private long d;
	private View e;
	private DismissCallbacks f;
	private int g;
	private float h;
	private float i;
	private boolean j;
	private int k;
	private Object l;
	private VelocityTracker m;
	private float n;
	private boolean o;
	private boolean p;
}
