// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.view.MotionEvent;
import android.view.animation.Animation;
import android.widget.ViewFlipper;
import com.pactforcure.app.ui.view.CircleIndicatorView;

// Referenced classes of package com.pactforcure.app.ui:
//			MainActivity

class MainActivity$2
	implements android.view..OnGestureListener
{

	public boolean onDown(MotionEvent motionevent)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
	{
		f1 = motionevent.getX() - motionevent1.getX();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #39  <Method float MotionEvent.getX()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #39  <Method float MotionEvent.getX()>
	//    4    8:fsub            
	//    5    9:fstore          4
		f = Math.abs(f / (float)val$scaledMaximumFlingVelocity);
	//    6   11:fload_3         
	//    7   12:aload_0         
	//    8   13:getfield        #23  <Field int val$scaledMaximumFlingVelocity>
	//    9   16:i2f             
	//   10   17:fdiv            
	//   11   18:invokestatic    #45  <Method float Math.abs(float)>
	//   12   21:fstore_3        
		if(f1 < -30F && f > 0.14F)
	//*  13   22:fload           4
	//*  14   24:ldc1            #46  <Float -30F>
	//*  15   26:fcmpg           
	//*  16   27:ifge            121
	//*  17   30:fload_3         
	//*  18   31:ldc1            #47  <Float 0.14F>
	//*  19   33:fcmpl           
	//*  20   34:ifle            121
		{
			if(MainActivity.access$000(MainActivity.this).getDisplayedChild() > 0)
	//*  21   37:aload_0         
	//*  22   38:getfield        #21  <Field MainActivity this$0>
	//*  23   41:invokestatic    #51  <Method ViewFlipper MainActivity.access$000(MainActivity)>
	//*  24   44:invokevirtual   #57  <Method int ViewFlipper.getDisplayedChild()>
	//*  25   47:ifle            119
			{
				MainActivity.access$000(MainActivity.this).setInAnimation(((android.content.Context) (MainActivity.this)), 0x7f050012);
	//   26   50:aload_0         
	//   27   51:getfield        #21  <Field MainActivity this$0>
	//   28   54:invokestatic    #51  <Method ViewFlipper MainActivity.access$000(MainActivity)>
	//   29   57:aload_0         
	//   30   58:getfield        #21  <Field MainActivity this$0>
	//   31   61:ldc1            #58  <Int 0x7f050012>
	//   32   63:invokevirtual   #62  <Method void ViewFlipper.setInAnimation(android.content.Context, int)>
				MainActivity.access$000(MainActivity.this).setOutAnimation(((android.content.Context) (MainActivity.this)), 0x7f050017);
	//   33   66:aload_0         
	//   34   67:getfield        #21  <Field MainActivity this$0>
	//   35   70:invokestatic    #51  <Method ViewFlipper MainActivity.access$000(MainActivity)>
	//   36   73:aload_0         
	//   37   74:getfield        #21  <Field MainActivity this$0>
	//   38   77:ldc1            #63  <Int 0x7f050017>
	//   39   79:invokevirtual   #66  <Method void ViewFlipper.setOutAnimation(android.content.Context, int)>
				MainActivity.access$000(MainActivity.this).getInAnimation().setAnimationListener(val$onFlipperAnimationsEvents);
	//   40   82:aload_0         
	//   41   83:getfield        #21  <Field MainActivity this$0>
	//   42   86:invokestatic    #51  <Method ViewFlipper MainActivity.access$000(MainActivity)>
	//   43   89:invokevirtual   #70  <Method Animation ViewFlipper.getInAnimation()>
	//   44   92:aload_0         
	//   45   93:getfield        #25  <Field android.view.animation.Animation$AnimationListener val$onFlipperAnimationsEvents>
	//   46   96:invokevirtual   #76  <Method void Animation.setAnimationListener(android.view.animation.Animation$AnimationListener)>
				MainActivity.access$000(MainActivity.this).showPrevious();
	//   47   99:aload_0         
	//   48  100:getfield        #21  <Field MainActivity this$0>
	//   49  103:invokestatic    #51  <Method ViewFlipper MainActivity.access$000(MainActivity)>
	//   50  106:invokevirtual   #79  <Method void ViewFlipper.showPrevious()>
				MainActivity.access$200(MainActivity.this).showPrevious();
	//   51  109:aload_0         
	//   52  110:getfield        #21  <Field MainActivity this$0>
	//   53  113:invokestatic    #83  <Method CircleIndicatorView MainActivity.access$200(MainActivity)>
	//   54  116:invokevirtual   #86  <Method void CircleIndicatorView.showPrevious()>
			}
		} else
	//*  55  119:iconst_1        
	//*  56  120:ireturn         
		if(f1 > 30F && f > 0.14F)
	//*  57  121:fload           4
	//*  58  123:ldc1            #87  <Float 30F>
	//*  59  125:fcmpl           
	//*  60  126:ifle            232
	//*  61  129:fload_3         
	//*  62  130:ldc1            #47  <Float 0.14F>
	//*  63  132:fcmpl           
	//*  64  133:ifle            232
		{
			if(MainActivity.access$000(MainActivity.this).getDisplayedChild() < MainActivity.access$000(MainActivity.this).getChildCount() - 1)
	//*  65  136:aload_0         
	//*  66  137:getfield        #21  <Field MainActivity this$0>
	//*  67  140:invokestatic    #51  <Method ViewFlipper MainActivity.access$000(MainActivity)>
	//*  68  143:invokevirtual   #57  <Method int ViewFlipper.getDisplayedChild()>
	//*  69  146:aload_0         
	//*  70  147:getfield        #21  <Field MainActivity this$0>
	//*  71  150:invokestatic    #51  <Method ViewFlipper MainActivity.access$000(MainActivity)>
	//*  72  153:invokevirtual   #90  <Method int ViewFlipper.getChildCount()>
	//*  73  156:iconst_1        
	//*  74  157:isub            
	//*  75  158:icmpge          119
			{
				MainActivity.access$000(MainActivity.this).setInAnimation(((android.content.Context) (MainActivity.this)), 0x7f050013);
	//   76  161:aload_0         
	//   77  162:getfield        #21  <Field MainActivity this$0>
	//   78  165:invokestatic    #51  <Method ViewFlipper MainActivity.access$000(MainActivity)>
	//   79  168:aload_0         
	//   80  169:getfield        #21  <Field MainActivity this$0>
	//   81  172:ldc1            #91  <Int 0x7f050013>
	//   82  174:invokevirtual   #62  <Method void ViewFlipper.setInAnimation(android.content.Context, int)>
				MainActivity.access$000(MainActivity.this).setOutAnimation(((android.content.Context) (MainActivity.this)), 0x7f050016);
	//   83  177:aload_0         
	//   84  178:getfield        #21  <Field MainActivity this$0>
	//   85  181:invokestatic    #51  <Method ViewFlipper MainActivity.access$000(MainActivity)>
	//   86  184:aload_0         
	//   87  185:getfield        #21  <Field MainActivity this$0>
	//   88  188:ldc1            #92  <Int 0x7f050016>
	//   89  190:invokevirtual   #66  <Method void ViewFlipper.setOutAnimation(android.content.Context, int)>
				MainActivity.access$000(MainActivity.this).getInAnimation().setAnimationListener(val$onFlipperAnimationsEvents);
	//   90  193:aload_0         
	//   91  194:getfield        #21  <Field MainActivity this$0>
	//   92  197:invokestatic    #51  <Method ViewFlipper MainActivity.access$000(MainActivity)>
	//   93  200:invokevirtual   #70  <Method Animation ViewFlipper.getInAnimation()>
	//   94  203:aload_0         
	//   95  204:getfield        #25  <Field android.view.animation.Animation$AnimationListener val$onFlipperAnimationsEvents>
	//   96  207:invokevirtual   #76  <Method void Animation.setAnimationListener(android.view.animation.Animation$AnimationListener)>
				MainActivity.access$000(MainActivity.this).showNext();
	//   97  210:aload_0         
	//   98  211:getfield        #21  <Field MainActivity this$0>
	//   99  214:invokestatic    #51  <Method ViewFlipper MainActivity.access$000(MainActivity)>
	//  100  217:invokevirtual   #95  <Method void ViewFlipper.showNext()>
				MainActivity.access$200(MainActivity.this).showNext();
	//  101  220:aload_0         
	//  102  221:getfield        #21  <Field MainActivity this$0>
	//  103  224:invokestatic    #83  <Method CircleIndicatorView MainActivity.access$200(MainActivity)>
	//  104  227:invokevirtual   #96  <Method void CircleIndicatorView.showNext()>
				return true;
	//  105  230:iconst_1        
	//  106  231:ireturn         
			}
		} else
		{
			return false;
	//  107  232:iconst_0        
	//  108  233:ireturn         
		}
		return true;
	}

	public void onLongPress(MotionEvent motionevent)
	{
	//    0    0:return          
	}

	public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void onShowPress(MotionEvent motionevent)
	{
	//    0    0:return          
	}

	public boolean onSingleTapUp(MotionEvent motionevent)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	final MainActivity this$0;
	final android.view.animation.tionListener val$onFlipperAnimationsEvents;
	final int val$scaledMaximumFlingVelocity;

	MainActivity$2()
	{
		this$0 = final_mainactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field MainActivity this$0>
		val$scaledMaximumFlingVelocity = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #23  <Field int val$scaledMaximumFlingVelocity>
		val$onFlipperAnimationsEvents = android.view.animation.tionListener.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field android.view.animation.Animation$AnimationListener val$onFlipperAnimationsEvents>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
