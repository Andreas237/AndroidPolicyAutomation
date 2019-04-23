// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.chrisbanes.photoview;

import android.content.Context;
import android.view.*;

// Referenced classes of package com.github.chrisbanes.photoview:
//			OnGestureListener, Util

class CustomGestureDetector
{

	CustomGestureDetector(Context context, OnGestureListener ongesturelistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		mActivePointerId = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #31  <Field int mActivePointerId>
		mActivePointerIndex = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #33  <Field int mActivePointerIndex>
		ViewConfiguration viewconfiguration = ViewConfiguration.get(context);
	//    8   14:aload_1         
	//    9   15:invokestatic    #39  <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   10   18:astore_3        
		mMinimumVelocity = viewconfiguration.getScaledMinimumFlingVelocity();
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:invokevirtual   #43  <Method int ViewConfiguration.getScaledMinimumFlingVelocity()>
	//   14   24:i2f             
	//   15   25:putfield        #45  <Field float mMinimumVelocity>
		mTouchSlop = viewconfiguration.getScaledTouchSlop();
	//   16   28:aload_0         
	//   17   29:aload_3         
	//   18   30:invokevirtual   #48  <Method int ViewConfiguration.getScaledTouchSlop()>
	//   19   33:i2f             
	//   20   34:putfield        #50  <Field float mTouchSlop>
		mListener = ongesturelistener;
	//   21   37:aload_0         
	//   22   38:aload_2         
	//   23   39:putfield        #52  <Field OnGestureListener mListener>
		mDetector = new ScaleGestureDetector(context, new android.view.ScaleGestureDetector.OnScaleGestureListener() {

			public boolean onScale(ScaleGestureDetector scalegesturedetector)
			{
				float f = scalegesturedetector.getScaleFactor();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #28  <Method float ScaleGestureDetector.getScaleFactor()>
			//    2    4:fstore_2        
				if(!Float.isNaN(f) && !Float.isInfinite(f))
			//*   3    5:fload_2         
			//*   4    6:invokestatic    #34  <Method boolean Float.isNaN(float)>
			//*   5    9:ifne            45
			//*   6   12:fload_2         
			//*   7   13:invokestatic    #37  <Method boolean Float.isInfinite(float)>
			//*   8   16:ifeq            22
			//*   9   19:goto            45
				{
					mListener.onScale(f, scalegesturedetector.getFocusX(), scalegesturedetector.getFocusY());
			//   10   22:aload_0         
			//   11   23:getfield        #16  <Field CustomGestureDetector this$0>
			//   12   26:invokestatic    #41  <Method OnGestureListener CustomGestureDetector.access$000(CustomGestureDetector)>
			//   13   29:fload_2         
			//   14   30:aload_1         
			//   15   31:invokevirtual   #44  <Method float ScaleGestureDetector.getFocusX()>
			//   16   34:aload_1         
			//   17   35:invokevirtual   #47  <Method float ScaleGestureDetector.getFocusY()>
			//   18   38:invokeinterface #52  <Method void OnGestureListener.onScale(float, float, float)>
					return true;
			//   19   43:iconst_1        
			//   20   44:ireturn         
				} else
				{
					return false;
			//   21   45:iconst_0        
			//   22   46:ireturn         
				}
			}

			public boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
			{
				return true;
			//    0    0:iconst_1        
			//    1    1:ireturn         
			}

			public void onScaleEnd(ScaleGestureDetector scalegesturedetector)
			{
			//    0    0:return          
			}

			final CustomGestureDetector this$0;

			
			{
				this$0 = CustomGestureDetector.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field CustomGestureDetector this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   24   42:aload_0         
	//   25   43:new             #54  <Class ScaleGestureDetector>
	//   26   46:dup             
	//   27   47:aload_1         
	//   28   48:new             #6   <Class CustomGestureDetector$1>
	//   29   51:dup             
	//   30   52:aload_0         
	//   31   53:invokespecial   #57  <Method void CustomGestureDetector$1(CustomGestureDetector)>
	//   32   56:invokespecial   #60  <Method void ScaleGestureDetector(Context, android.view.ScaleGestureDetector$OnScaleGestureListener)>
	//   33   59:putfield        #62  <Field ScaleGestureDetector mDetector>
	//   34   62:return          
	}

	private float getActiveX(MotionEvent motionevent)
	{
		Exception exception;
		float f;
		try
		{
			f = motionevent.getX(mActivePointerIndex);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #33  <Field int mActivePointerIndex>
	//    3    5:invokevirtual   #75  <Method float MotionEvent.getX(int)>
	//    4    8:fstore_2        
		}
	//*   5    9:fload_2         
	//*   6   10:freturn         
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #78  <Method float MotionEvent.getX()>
	//*   9   15:freturn         
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			return motionevent.getX();
		}
		return f;
	//*  10   16:astore_3        
	//*  11   17:goto            11
	}

	private float getActiveY(MotionEvent motionevent)
	{
		Exception exception;
		float f;
		try
		{
			f = motionevent.getY(mActivePointerIndex);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #33  <Field int mActivePointerIndex>
	//    3    5:invokevirtual   #82  <Method float MotionEvent.getY(int)>
	//    4    8:fstore_2        
		}
	//*   5    9:fload_2         
	//*   6   10:freturn         
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #84  <Method float MotionEvent.getY()>
	//*   9   15:freturn         
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			return motionevent.getY();
		}
		return f;
	//*  10   16:astore_3        
	//*  11   17:goto            11
	}

	private boolean processTouchEvent(MotionEvent motionevent)
	{
		int i = motionevent.getAction() & 0xff;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #89  <Method int MotionEvent.getAction()>
	//    2    4:sipush          255
	//    3    7:iand            
	//    4    8:istore          6
		if(i != 6)
	//*   5   10:iload           6
	//*   6   12:bipush          6
	//*   7   14:icmpeq          398
		{
			switch(i)
	//*   8   17:iload           6
			{
	//*   9   19:tableswitch     0 3: default 48
	//	               0 339
	//	               1 204
	//	               2 80
	//	               3 51
	//*  10   48:goto            464
			case 3: // '\003'
				mActivePointerId = -1;
	//   11   51:aload_0         
	//   12   52:iconst_m1       
	//   13   53:putfield        #31  <Field int mActivePointerId>
				VelocityTracker velocitytracker = mVelocityTracker;
	//   14   56:aload_0         
	//   15   57:getfield        #91  <Field VelocityTracker mVelocityTracker>
	//   16   60:astore          8
				if(velocitytracker != null)
	//*  17   62:aload           8
	//*  18   64:ifnull          464
				{
					velocitytracker.recycle();
	//   19   67:aload           8
	//   20   69:invokevirtual   #96  <Method void VelocityTracker.recycle()>
					mVelocityTracker = null;
	//   21   72:aload_0         
	//   22   73:aconst_null     
	//   23   74:putfield        #91  <Field VelocityTracker mVelocityTracker>
				}
				break;

	//*  24   77:goto            464
			case 2: // '\002'
				float f = getActiveX(motionevent);
	//   25   80:aload_0         
	//   26   81:aload_1         
	//   27   82:invokespecial   #98  <Method float getActiveX(MotionEvent)>
	//   28   85:fstore_2        
				float f2 = getActiveY(motionevent);
	//   29   86:aload_0         
	//   30   87:aload_1         
	//   31   88:invokespecial   #100 <Method float getActiveY(MotionEvent)>
	//   32   91:fstore_3        
				float f4 = f - mLastTouchX;
	//   33   92:fload_2         
	//   34   93:aload_0         
	//   35   94:getfield        #102 <Field float mLastTouchX>
	//   36   97:fsub            
	//   37   98:fstore          4
				float f5 = f2 - mLastTouchY;
	//   38  100:fload_3         
	//   39  101:aload_0         
	//   40  102:getfield        #104 <Field float mLastTouchY>
	//   41  105:fsub            
	//   42  106:fstore          5
				if(!mIsDragging)
	//*  43  108:aload_0         
	//*  44  109:getfield        #106 <Field boolean mIsDragging>
	//*  45  112:ifne            154
				{
					boolean flag;
					if(Math.sqrt(f4 * f4 + f5 * f5) >= (double)mTouchSlop)
	//*  46  115:fload           4
	//*  47  117:fload           4
	//*  48  119:fmul            
	//*  49  120:fload           5
	//*  50  122:fload           5
	//*  51  124:fmul            
	//*  52  125:fadd            
	//*  53  126:f2d             
	//*  54  127:invokestatic    #112 <Method double Math.sqrt(double)>
	//*  55  130:aload_0         
	//*  56  131:getfield        #50  <Field float mTouchSlop>
	//*  57  134:f2d             
	//*  58  135:dcmpl           
	//*  59  136:iflt            145
						flag = true;
	//   60  139:iconst_1        
	//   61  140:istore          7
					else
	//*  62  142:goto            148
						flag = false;
	//   63  145:iconst_0        
	//   64  146:istore          7
					mIsDragging = flag;
	//   65  148:aload_0         
	//   66  149:iload           7
	//   67  151:putfield        #106 <Field boolean mIsDragging>
				}
				if(mIsDragging)
	//*  68  154:aload_0         
	//*  69  155:getfield        #106 <Field boolean mIsDragging>
	//*  70  158:ifeq            464
				{
					mListener.onDrag(f4, f5);
	//   71  161:aload_0         
	//   72  162:getfield        #52  <Field OnGestureListener mListener>
	//   73  165:fload           4
	//   74  167:fload           5
	//   75  169:invokeinterface #118 <Method void OnGestureListener.onDrag(float, float)>
					mLastTouchX = f;
	//   76  174:aload_0         
	//   77  175:fload_2         
	//   78  176:putfield        #102 <Field float mLastTouchX>
					mLastTouchY = f2;
	//   79  179:aload_0         
	//   80  180:fload_3         
	//   81  181:putfield        #104 <Field float mLastTouchY>
					VelocityTracker velocitytracker1 = mVelocityTracker;
	//   82  184:aload_0         
	//   83  185:getfield        #91  <Field VelocityTracker mVelocityTracker>
	//   84  188:astore          8
					if(velocitytracker1 != null)
	//*  85  190:aload           8
	//*  86  192:ifnull          464
						velocitytracker1.addMovement(motionevent);
	//   87  195:aload           8
	//   88  197:aload_1         
	//   89  198:invokevirtual   #122 <Method void VelocityTracker.addMovement(MotionEvent)>
				}
				break;

	//*  90  201:goto            464
			case 1: // '\001'
				mActivePointerId = -1;
	//   91  204:aload_0         
	//   92  205:iconst_m1       
	//   93  206:putfield        #31  <Field int mActivePointerId>
				if(mIsDragging && mVelocityTracker != null)
	//*  94  209:aload_0         
	//*  95  210:getfield        #106 <Field boolean mIsDragging>
	//*  96  213:ifeq            315
	//*  97  216:aload_0         
	//*  98  217:getfield        #91  <Field VelocityTracker mVelocityTracker>
	//*  99  220:ifnull          315
				{
					mLastTouchX = getActiveX(motionevent);
	//  100  223:aload_0         
	//  101  224:aload_0         
	//  102  225:aload_1         
	//  103  226:invokespecial   #98  <Method float getActiveX(MotionEvent)>
	//  104  229:putfield        #102 <Field float mLastTouchX>
					mLastTouchY = getActiveY(motionevent);
	//  105  232:aload_0         
	//  106  233:aload_0         
	//  107  234:aload_1         
	//  108  235:invokespecial   #100 <Method float getActiveY(MotionEvent)>
	//  109  238:putfield        #104 <Field float mLastTouchY>
					mVelocityTracker.addMovement(motionevent);
	//  110  241:aload_0         
	//  111  242:getfield        #91  <Field VelocityTracker mVelocityTracker>
	//  112  245:aload_1         
	//  113  246:invokevirtual   #122 <Method void VelocityTracker.addMovement(MotionEvent)>
					mVelocityTracker.computeCurrentVelocity(1000);
	//  114  249:aload_0         
	//  115  250:getfield        #91  <Field VelocityTracker mVelocityTracker>
	//  116  253:sipush          1000
	//  117  256:invokevirtual   #126 <Method void VelocityTracker.computeCurrentVelocity(int)>
					float f1 = mVelocityTracker.getXVelocity();
	//  118  259:aload_0         
	//  119  260:getfield        #91  <Field VelocityTracker mVelocityTracker>
	//  120  263:invokevirtual   #129 <Method float VelocityTracker.getXVelocity()>
	//  121  266:fstore_2        
					float f3 = mVelocityTracker.getYVelocity();
	//  122  267:aload_0         
	//  123  268:getfield        #91  <Field VelocityTracker mVelocityTracker>
	//  124  271:invokevirtual   #132 <Method float VelocityTracker.getYVelocity()>
	//  125  274:fstore_3        
					if(Math.max(Math.abs(f1), Math.abs(f3)) >= mMinimumVelocity)
	//* 126  275:fload_2         
	//* 127  276:invokestatic    #136 <Method float Math.abs(float)>
	//* 128  279:fload_3         
	//* 129  280:invokestatic    #136 <Method float Math.abs(float)>
	//* 130  283:invokestatic    #140 <Method float Math.max(float, float)>
	//* 131  286:aload_0         
	//* 132  287:getfield        #45  <Field float mMinimumVelocity>
	//* 133  290:fcmpl           
	//* 134  291:iflt            315
						mListener.onFling(mLastTouchX, mLastTouchY, -f1, -f3);
	//  135  294:aload_0         
	//  136  295:getfield        #52  <Field OnGestureListener mListener>
	//  137  298:aload_0         
	//  138  299:getfield        #102 <Field float mLastTouchX>
	//  139  302:aload_0         
	//  140  303:getfield        #104 <Field float mLastTouchY>
	//  141  306:fload_2         
	//  142  307:fneg            
	//  143  308:fload_3         
	//  144  309:fneg            
	//  145  310:invokeinterface #144 <Method void OnGestureListener.onFling(float, float, float, float)>
				}
				VelocityTracker velocitytracker2 = mVelocityTracker;
	//  146  315:aload_0         
	//  147  316:getfield        #91  <Field VelocityTracker mVelocityTracker>
	//  148  319:astore          8
				if(velocitytracker2 != null)
	//* 149  321:aload           8
	//* 150  323:ifnull          464
				{
					velocitytracker2.recycle();
	//  151  326:aload           8
	//  152  328:invokevirtual   #96  <Method void VelocityTracker.recycle()>
					mVelocityTracker = null;
	//  153  331:aload_0         
	//  154  332:aconst_null     
	//  155  333:putfield        #91  <Field VelocityTracker mVelocityTracker>
				}
				break;

	//* 156  336:goto            464
			case 0: // '\0'
				mActivePointerId = motionevent.getPointerId(0);
	//  157  339:aload_0         
	//  158  340:aload_1         
	//  159  341:iconst_0        
	//  160  342:invokevirtual   #148 <Method int MotionEvent.getPointerId(int)>
	//  161  345:putfield        #31  <Field int mActivePointerId>
				mVelocityTracker = VelocityTracker.obtain();
	//  162  348:aload_0         
	//  163  349:invokestatic    #152 <Method VelocityTracker VelocityTracker.obtain()>
	//  164  352:putfield        #91  <Field VelocityTracker mVelocityTracker>
				VelocityTracker velocitytracker3 = mVelocityTracker;
	//  165  355:aload_0         
	//  166  356:getfield        #91  <Field VelocityTracker mVelocityTracker>
	//  167  359:astore          8
				if(velocitytracker3 != null)
	//* 168  361:aload           8
	//* 169  363:ifnull          372
					velocitytracker3.addMovement(motionevent);
	//  170  366:aload           8
	//  171  368:aload_1         
	//  172  369:invokevirtual   #122 <Method void VelocityTracker.addMovement(MotionEvent)>
				mLastTouchX = getActiveX(motionevent);
	//  173  372:aload_0         
	//  174  373:aload_0         
	//  175  374:aload_1         
	//  176  375:invokespecial   #98  <Method float getActiveX(MotionEvent)>
	//  177  378:putfield        #102 <Field float mLastTouchX>
				mLastTouchY = getActiveY(motionevent);
	//  178  381:aload_0         
	//  179  382:aload_0         
	//  180  383:aload_1         
	//  181  384:invokespecial   #100 <Method float getActiveY(MotionEvent)>
	//  182  387:putfield        #104 <Field float mLastTouchY>
				mIsDragging = false;
	//  183  390:aload_0         
	//  184  391:iconst_0        
	//  185  392:putfield        #106 <Field boolean mIsDragging>
				break;
			}
		} else
	//* 186  395:goto            464
		{
			i = Util.getPointerIndex(motionevent.getAction());
	//  187  398:aload_1         
	//  188  399:invokevirtual   #89  <Method int MotionEvent.getAction()>
	//  189  402:invokestatic    #157 <Method int Util.getPointerIndex(int)>
	//  190  405:istore          6
			if(motionevent.getPointerId(i) == mActivePointerId)
	//* 191  407:aload_1         
	//* 192  408:iload           6
	//* 193  410:invokevirtual   #148 <Method int MotionEvent.getPointerId(int)>
	//* 194  413:aload_0         
	//* 195  414:getfield        #31  <Field int mActivePointerId>
	//* 196  417:icmpne          464
			{
				if(i == 0)
	//* 197  420:iload           6
	//* 198  422:ifne            431
					i = 1;
	//  199  425:iconst_1        
	//  200  426:istore          6
				else
	//* 201  428:goto            434
					i = 0;
	//  202  431:iconst_0        
	//  203  432:istore          6
				mActivePointerId = motionevent.getPointerId(i);
	//  204  434:aload_0         
	//  205  435:aload_1         
	//  206  436:iload           6
	//  207  438:invokevirtual   #148 <Method int MotionEvent.getPointerId(int)>
	//  208  441:putfield        #31  <Field int mActivePointerId>
				mLastTouchX = motionevent.getX(i);
	//  209  444:aload_0         
	//  210  445:aload_1         
	//  211  446:iload           6
	//  212  448:invokevirtual   #75  <Method float MotionEvent.getX(int)>
	//  213  451:putfield        #102 <Field float mLastTouchX>
				mLastTouchY = motionevent.getY(i);
	//  214  454:aload_0         
	//  215  455:aload_1         
	//  216  456:iload           6
	//  217  458:invokevirtual   #82  <Method float MotionEvent.getY(int)>
	//  218  461:putfield        #104 <Field float mLastTouchY>
			}
		}
		i = mActivePointerId;
	//  219  464:aload_0         
	//  220  465:getfield        #31  <Field int mActivePointerId>
	//  221  468:istore          6
		if(i == -1)
	//* 222  470:iload           6
	//* 223  472:iconst_m1       
	//* 224  473:icmpeq          479
	//* 225  476:goto            482
			i = 0;
	//  226  479:iconst_0        
	//  227  480:istore          6
		mActivePointerIndex = motionevent.findPointerIndex(i);
	//  228  482:aload_0         
	//  229  483:aload_1         
	//  230  484:iload           6
	//  231  486:invokevirtual   #160 <Method int MotionEvent.findPointerIndex(int)>
	//  232  489:putfield        #33  <Field int mActivePointerIndex>
		return true;
	//  233  492:iconst_1        
	//  234  493:ireturn         
	}

	public boolean isDragging()
	{
		return mIsDragging;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field boolean mIsDragging>
	//    2    4:ireturn         
	}

	public boolean isScaling()
	{
		return mDetector.isInProgress();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field ScaleGestureDetector mDetector>
	//    2    4:invokevirtual   #166 <Method boolean ScaleGestureDetector.isInProgress()>
	//    3    7:ireturn         
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		boolean flag;
		try
		{
			mDetector.onTouchEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field ScaleGestureDetector mDetector>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #171 <Method boolean ScaleGestureDetector.onTouchEvent(MotionEvent)>
	//    4    8:pop             
			flag = processTouchEvent(motionevent);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #173 <Method boolean processTouchEvent(MotionEvent)>
	//    8   14:istore_2        
		}
	//*   9   15:iload_2         
	//*  10   16:ireturn         
	//*  11   17:iconst_1        
	//*  12   18:ireturn         
		// Misplaced declaration of an exception variable
		catch(MotionEvent motionevent)
		{
			return true;
		}
		return flag;
	//*  13   19:astore_1        
	//*  14   20:goto            17
	}

	private static final int INVALID_POINTER_ID = -1;
	private int mActivePointerId;
	private int mActivePointerIndex;
	private final ScaleGestureDetector mDetector;
	private boolean mIsDragging;
	private float mLastTouchX;
	private float mLastTouchY;
	private OnGestureListener mListener;
	private final float mMinimumVelocity;
	private final float mTouchSlop;
	private VelocityTracker mVelocityTracker;


/*
	static OnGestureListener access$000(CustomGestureDetector customgesturedetector)
	{
		return customgesturedetector.mListener;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field OnGestureListener mListener>
	//    2    4:areturn         
	}

*/
}
