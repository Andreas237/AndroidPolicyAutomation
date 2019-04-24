// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget.helper;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.List;

// Referenced classes of package android.support.v7.widget.helper:
//			ItemTouchHelper

class ItemTouchHelper$2
	implements android.support.v7.widget.mTouchListener
{

	public boolean onInterceptTouchEvent(RecyclerView recyclerview, MotionEvent motionevent)
	{
		mGestureDetector.onTouchEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ItemTouchHelper this$0>
	//    2    4:getfield        #24  <Field GestureDetectorCompat ItemTouchHelper.mGestureDetector>
	//    3    7:aload_2         
	//    4    8:invokevirtual   #30  <Method boolean GestureDetectorCompat.onTouchEvent(MotionEvent)>
	//    5   11:pop             
		int i = motionevent.getActionMasked();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #36  <Method int MotionEvent.getActionMasked()>
	//    8   16:istore_3        
		if(i == 0)
	//*   9   17:iload_3         
	//*  10   18:ifne            217
		{
			mActivePointerId = motionevent.getPointerId(0);
	//   11   21:aload_0         
	//   12   22:getfield        #14  <Field ItemTouchHelper this$0>
	//   13   25:aload_2         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #40  <Method int MotionEvent.getPointerId(int)>
	//   16   30:putfield        #44  <Field int ItemTouchHelper.mActivePointerId>
			mInitialTouchX = motionevent.getX();
	//   17   33:aload_0         
	//   18   34:getfield        #14  <Field ItemTouchHelper this$0>
	//   19   37:aload_2         
	//   20   38:invokevirtual   #48  <Method float MotionEvent.getX()>
	//   21   41:putfield        #52  <Field float ItemTouchHelper.mInitialTouchX>
			mInitialTouchY = motionevent.getY();
	//   22   44:aload_0         
	//   23   45:getfield        #14  <Field ItemTouchHelper this$0>
	//   24   48:aload_2         
	//   25   49:invokevirtual   #55  <Method float MotionEvent.getY()>
	//   26   52:putfield        #58  <Field float ItemTouchHelper.mInitialTouchY>
			obtainVelocityTracker();
	//   27   55:aload_0         
	//   28   56:getfield        #14  <Field ItemTouchHelper this$0>
	//   29   59:invokevirtual   #61  <Method void ItemTouchHelper.obtainVelocityTracker()>
			if(mSelected == null)
	//*  30   62:aload_0         
	//*  31   63:getfield        #14  <Field ItemTouchHelper this$0>
	//*  32   66:getfield        #65  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper.mSelected>
	//*  33   69:ifnonnull       291
			{
				recyclerview = ((RecyclerView) (findAnimation(motionevent)));
	//   34   72:aload_0         
	//   35   73:getfield        #14  <Field ItemTouchHelper this$0>
	//   36   76:aload_2         
	//   37   77:invokevirtual   #69  <Method ItemTouchHelper$RecoverAnimation ItemTouchHelper.findAnimation(MotionEvent)>
	//   38   80:astore_1        
				if(recyclerview != null)
	//*  39   81:aload_1         
	//*  40   82:ifnull          291
				{
					ItemTouchHelper itemtouchhelper = ItemTouchHelper.this;
	//   41   85:aload_0         
	//   42   86:getfield        #14  <Field ItemTouchHelper this$0>
	//   43   89:astore          5
					itemtouchhelper.mInitialTouchX = itemtouchhelper.mInitialTouchX - ((coverAnimation) (recyclerview)).mX;
	//   44   91:aload           5
	//   45   93:aload           5
	//   46   95:getfield        #52  <Field float ItemTouchHelper.mInitialTouchX>
	//   47   98:aload_1         
	//   48   99:getfield        #74  <Field float ItemTouchHelper$RecoverAnimation.mX>
	//   49  102:fsub            
	//   50  103:putfield        #52  <Field float ItemTouchHelper.mInitialTouchX>
					itemtouchhelper = ItemTouchHelper.this;
	//   51  106:aload_0         
	//   52  107:getfield        #14  <Field ItemTouchHelper this$0>
	//   53  110:astore          5
					itemtouchhelper.mInitialTouchY = itemtouchhelper.mInitialTouchY - ((coverAnimation) (recyclerview)).mY;
	//   54  112:aload           5
	//   55  114:aload           5
	//   56  116:getfield        #58  <Field float ItemTouchHelper.mInitialTouchY>
	//   57  119:aload_1         
	//   58  120:getfield        #77  <Field float ItemTouchHelper$RecoverAnimation.mY>
	//   59  123:fsub            
	//   60  124:putfield        #58  <Field float ItemTouchHelper.mInitialTouchY>
					endRecoverAnimation(((coverAnimation) (recyclerview)).mViewHolder, true);
	//   61  127:aload_0         
	//   62  128:getfield        #14  <Field ItemTouchHelper this$0>
	//   63  131:aload_1         
	//   64  132:getfield        #80  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
	//   65  135:iconst_1        
	//   66  136:invokevirtual   #84  <Method int ItemTouchHelper.endRecoverAnimation(android.support.v7.widget.RecyclerView$ViewHolder, boolean)>
	//   67  139:pop             
					if(mPendingCleanup.remove(((Object) (((coverAnimation) (recyclerview)).mViewHolder.itemView))))
	//*  68  140:aload_0         
	//*  69  141:getfield        #14  <Field ItemTouchHelper this$0>
	//*  70  144:getfield        #88  <Field List ItemTouchHelper.mPendingCleanup>
	//*  71  147:aload_1         
	//*  72  148:getfield        #80  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
	//*  73  151:getfield        #94  <Field android.view.View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  74  154:invokeinterface #100 <Method boolean List.remove(Object)>
	//*  75  159:ifeq            183
						mCallback.clearView(mRecyclerView, ((coverAnimation) (recyclerview)).mViewHolder);
	//   76  162:aload_0         
	//   77  163:getfield        #14  <Field ItemTouchHelper this$0>
	//   78  166:getfield        #104 <Field ItemTouchHelper$Callback ItemTouchHelper.mCallback>
	//   79  169:aload_0         
	//   80  170:getfield        #14  <Field ItemTouchHelper this$0>
	//   81  173:getfield        #108 <Field RecyclerView ItemTouchHelper.mRecyclerView>
	//   82  176:aload_1         
	//   83  177:getfield        #80  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
	//   84  180:invokevirtual   #114 <Method void ItemTouchHelper$Callback.clearView(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
					select(((coverAnimation) (recyclerview)).mViewHolder, ((coverAnimation) (recyclerview)).mActionState);
	//   85  183:aload_0         
	//   86  184:getfield        #14  <Field ItemTouchHelper this$0>
	//   87  187:aload_1         
	//   88  188:getfield        #80  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
	//   89  191:aload_1         
	//   90  192:getfield        #117 <Field int ItemTouchHelper$RecoverAnimation.mActionState>
	//   91  195:invokevirtual   #121 <Method void ItemTouchHelper.select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
					updateDxDy(motionevent, mSelectedFlags, 0);
	//   92  198:aload_0         
	//   93  199:getfield        #14  <Field ItemTouchHelper this$0>
	//   94  202:aload_2         
	//   95  203:aload_0         
	//   96  204:getfield        #14  <Field ItemTouchHelper this$0>
	//   97  207:getfield        #124 <Field int ItemTouchHelper.mSelectedFlags>
	//   98  210:iconst_0        
	//   99  211:invokevirtual   #128 <Method void ItemTouchHelper.updateDxDy(MotionEvent, int, int)>
				}
			}
		} else
	//* 100  214:goto            291
		if(i != 3 && i != 1)
	//* 101  217:iload_3         
	//* 102  218:iconst_3        
	//* 103  219:icmpeq          274
	//* 104  222:iload_3         
	//* 105  223:iconst_1        
	//* 106  224:icmpne          230
	//* 107  227:goto            274
		{
			if(mActivePointerId != -1)
	//* 108  230:aload_0         
	//* 109  231:getfield        #14  <Field ItemTouchHelper this$0>
	//* 110  234:getfield        #44  <Field int ItemTouchHelper.mActivePointerId>
	//* 111  237:iconst_m1       
	//* 112  238:icmpeq          291
			{
				int j = motionevent.findPointerIndex(mActivePointerId);
	//  113  241:aload_2         
	//  114  242:aload_0         
	//  115  243:getfield        #14  <Field ItemTouchHelper this$0>
	//  116  246:getfield        #44  <Field int ItemTouchHelper.mActivePointerId>
	//  117  249:invokevirtual   #131 <Method int MotionEvent.findPointerIndex(int)>
	//  118  252:istore          4
				if(j >= 0)
	//* 119  254:iload           4
	//* 120  256:iflt            291
					checkSelectForSwipe(i, motionevent, j);
	//  121  259:aload_0         
	//  122  260:getfield        #14  <Field ItemTouchHelper this$0>
	//  123  263:iload_3         
	//  124  264:aload_2         
	//  125  265:iload           4
	//  126  267:invokevirtual   #135 <Method boolean ItemTouchHelper.checkSelectForSwipe(int, MotionEvent, int)>
	//  127  270:pop             
			}
		} else
	//* 128  271:goto            291
		{
			mActivePointerId = -1;
	//  129  274:aload_0         
	//  130  275:getfield        #14  <Field ItemTouchHelper this$0>
	//  131  278:iconst_m1       
	//  132  279:putfield        #44  <Field int ItemTouchHelper.mActivePointerId>
			select(((android.support.v7.widget.older) (null)), 0);
	//  133  282:aload_0         
	//  134  283:getfield        #14  <Field ItemTouchHelper this$0>
	//  135  286:aconst_null     
	//  136  287:iconst_0        
	//  137  288:invokevirtual   #121 <Method void ItemTouchHelper.select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
		}
		if(mVelocityTracker != null)
	//* 138  291:aload_0         
	//* 139  292:getfield        #14  <Field ItemTouchHelper this$0>
	//* 140  295:getfield        #139 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
	//* 141  298:ifnull          312
			mVelocityTracker.addMovement(motionevent);
	//  142  301:aload_0         
	//  143  302:getfield        #14  <Field ItemTouchHelper this$0>
	//  144  305:getfield        #139 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
	//  145  308:aload_2         
	//  146  309:invokevirtual   #145 <Method void VelocityTracker.addMovement(MotionEvent)>
		return mSelected != null;
	//  147  312:aload_0         
	//  148  313:getfield        #14  <Field ItemTouchHelper this$0>
	//  149  316:getfield        #65  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper.mSelected>
	//  150  319:ifnull          324
	//  151  322:iconst_1        
	//  152  323:ireturn         
	//  153  324:iconst_0        
	//  154  325:ireturn         
	}

	public void onRequestDisallowInterceptTouchEvent(boolean flag)
	{
		if(!flag)
	//*   0    0:iload_1         
	//*   1    1:ifne            5
		{
			return;
	//    2    4:return          
		} else
		{
			select(((android.support.v7.widget.older) (null)), 0);
	//    3    5:aload_0         
	//    4    6:getfield        #14  <Field ItemTouchHelper this$0>
	//    5    9:aconst_null     
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #121 <Method void ItemTouchHelper.select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
			return;
	//    8   14:return          
		}
	}

	public void onTouchEvent(RecyclerView recyclerview, MotionEvent motionevent)
	{
label0:
		{
			mGestureDetector.onTouchEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ItemTouchHelper this$0>
	//    2    4:getfield        #24  <Field GestureDetectorCompat ItemTouchHelper.mGestureDetector>
	//    3    7:aload_2         
	//    4    8:invokevirtual   #30  <Method boolean GestureDetectorCompat.onTouchEvent(MotionEvent)>
	//    5   11:pop             
			if(mVelocityTracker != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #14  <Field ItemTouchHelper this$0>
	//*   8   16:getfield        #139 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
	//*   9   19:ifnull          33
				mVelocityTracker.addMovement(motionevent);
	//   10   22:aload_0         
	//   11   23:getfield        #14  <Field ItemTouchHelper this$0>
	//   12   26:getfield        #139 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
	//   13   29:aload_2         
	//   14   30:invokevirtual   #145 <Method void VelocityTracker.addMovement(MotionEvent)>
			if(mActivePointerId == -1)
	//*  15   33:aload_0         
	//*  16   34:getfield        #14  <Field ItemTouchHelper this$0>
	//*  17   37:getfield        #44  <Field int ItemTouchHelper.mActivePointerId>
	//*  18   40:iconst_m1       
	//*  19   41:icmpne          45
				return;
	//   20   44:return          
			int j = motionevent.getActionMasked();
	//   21   45:aload_2         
	//   22   46:invokevirtual   #36  <Method int MotionEvent.getActionMasked()>
	//   23   49:istore          4
			int k = motionevent.findPointerIndex(mActivePointerId);
	//   24   51:aload_2         
	//   25   52:aload_0         
	//   26   53:getfield        #14  <Field ItemTouchHelper this$0>
	//   27   56:getfield        #44  <Field int ItemTouchHelper.mActivePointerId>
	//   28   59:invokevirtual   #131 <Method int MotionEvent.findPointerIndex(int)>
	//   29   62:istore          5
			if(k >= 0)
	//*  30   64:iload           5
	//*  31   66:iflt            82
				checkSelectForSwipe(j, motionevent, k);
	//   32   69:aload_0         
	//   33   70:getfield        #14  <Field ItemTouchHelper this$0>
	//   34   73:iload           4
	//   35   75:aload_2         
	//   36   76:iload           5
	//   37   78:invokevirtual   #135 <Method boolean ItemTouchHelper.checkSelectForSwipe(int, MotionEvent, int)>
	//   38   81:pop             
			recyclerview = ((RecyclerView) (mSelected));
	//   39   82:aload_0         
	//   40   83:getfield        #14  <Field ItemTouchHelper this$0>
	//   41   86:getfield        #65  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper.mSelected>
	//   42   89:astore_1        
			if(recyclerview == null)
	//*  43   90:aload_1         
	//*  44   91:ifnonnull       95
				return;
	//   45   94:return          
			int i = 0;
	//   46   95:iconst_0        
	//   47   96:istore_3        
			if(j != 6)
	//*  48   97:iload           4
	//*  49   99:bipush          6
	//*  50  101:icmpeq          245
			{
				switch(j)
	//*  51  104:iload           4
				{
	//*  52  106:tableswitch     1 3: default 132
	//	               1 227
	//	               2 156
	//	               3 133
				default:
					return;
	//   53  132:return          

				case 1: // '\001'
					break;

				case 3: // '\003'
					if(mVelocityTracker != null)
	//*  54  133:aload_0         
	//*  55  134:getfield        #14  <Field ItemTouchHelper this$0>
	//*  56  137:getfield        #139 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
	//*  57  140:ifnull          227
						mVelocityTracker.clear();
	//   58  143:aload_0         
	//   59  144:getfield        #14  <Field ItemTouchHelper this$0>
	//   60  147:getfield        #139 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
	//   61  150:invokevirtual   #151 <Method void VelocityTracker.clear()>
					break;
	//   62  153:goto            227

				case 2: // '\002'
					if(k >= 0)
	//*  63  156:iload           5
	//*  64  158:iflt            303
					{
						updateDxDy(motionevent, mSelectedFlags, k);
	//   65  161:aload_0         
	//   66  162:getfield        #14  <Field ItemTouchHelper this$0>
	//   67  165:aload_2         
	//   68  166:aload_0         
	//   69  167:getfield        #14  <Field ItemTouchHelper this$0>
	//   70  170:getfield        #124 <Field int ItemTouchHelper.mSelectedFlags>
	//   71  173:iload           5
	//   72  175:invokevirtual   #128 <Method void ItemTouchHelper.updateDxDy(MotionEvent, int, int)>
						moveIfNecessary(((android.support.v7.widget.older) (recyclerview)));
	//   73  178:aload_0         
	//   74  179:getfield        #14  <Field ItemTouchHelper this$0>
	//   75  182:aload_1         
	//   76  183:invokevirtual   #155 <Method void ItemTouchHelper.moveIfNecessary(android.support.v7.widget.RecyclerView$ViewHolder)>
						mRecyclerView.removeCallbacks(mScrollRunnable);
	//   77  186:aload_0         
	//   78  187:getfield        #14  <Field ItemTouchHelper this$0>
	//   79  190:getfield        #108 <Field RecyclerView ItemTouchHelper.mRecyclerView>
	//   80  193:aload_0         
	//   81  194:getfield        #14  <Field ItemTouchHelper this$0>
	//   82  197:getfield        #159 <Field Runnable ItemTouchHelper.mScrollRunnable>
	//   83  200:invokevirtual   #165 <Method boolean RecyclerView.removeCallbacks(Runnable)>
	//   84  203:pop             
						mScrollRunnable.run();
	//   85  204:aload_0         
	//   86  205:getfield        #14  <Field ItemTouchHelper this$0>
	//   87  208:getfield        #159 <Field Runnable ItemTouchHelper.mScrollRunnable>
	//   88  211:invokeinterface #170 <Method void Runnable.run()>
						mRecyclerView.invalidate();
	//   89  216:aload_0         
	//   90  217:getfield        #14  <Field ItemTouchHelper this$0>
	//   91  220:getfield        #108 <Field RecyclerView ItemTouchHelper.mRecyclerView>
	//   92  223:invokevirtual   #173 <Method void RecyclerView.invalidate()>
						return;
	//   93  226:return          
					}
					break label0;
				}
				select(((android.support.v7.widget.older) (null)), 0);
	//   94  227:aload_0         
	//   95  228:getfield        #14  <Field ItemTouchHelper this$0>
	//   96  231:aconst_null     
	//   97  232:iconst_0        
	//   98  233:invokevirtual   #121 <Method void ItemTouchHelper.select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
				mActivePointerId = -1;
	//   99  236:aload_0         
	//  100  237:getfield        #14  <Field ItemTouchHelper this$0>
	//  101  240:iconst_m1       
	//  102  241:putfield        #44  <Field int ItemTouchHelper.mActivePointerId>
				return;
	//  103  244:return          
			}
			j = motionevent.getActionIndex();
	//  104  245:aload_2         
	//  105  246:invokevirtual   #176 <Method int MotionEvent.getActionIndex()>
	//  106  249:istore          4
			if(motionevent.getPointerId(j) == mActivePointerId)
	//* 107  251:aload_2         
	//* 108  252:iload           4
	//* 109  254:invokevirtual   #40  <Method int MotionEvent.getPointerId(int)>
	//* 110  257:aload_0         
	//* 111  258:getfield        #14  <Field ItemTouchHelper this$0>
	//* 112  261:getfield        #44  <Field int ItemTouchHelper.mActivePointerId>
	//* 113  264:icmpne          303
			{
				if(j == 0)
	//* 114  267:iload           4
	//* 115  269:ifne            274
					i = 1;
	//  116  272:iconst_1        
	//  117  273:istore_3        
				mActivePointerId = motionevent.getPointerId(i);
	//  118  274:aload_0         
	//  119  275:getfield        #14  <Field ItemTouchHelper this$0>
	//  120  278:aload_2         
	//  121  279:iload_3         
	//  122  280:invokevirtual   #40  <Method int MotionEvent.getPointerId(int)>
	//  123  283:putfield        #44  <Field int ItemTouchHelper.mActivePointerId>
				updateDxDy(motionevent, mSelectedFlags, j);
	//  124  286:aload_0         
	//  125  287:getfield        #14  <Field ItemTouchHelper this$0>
	//  126  290:aload_2         
	//  127  291:aload_0         
	//  128  292:getfield        #14  <Field ItemTouchHelper this$0>
	//  129  295:getfield        #124 <Field int ItemTouchHelper.mSelectedFlags>
	//  130  298:iload           4
	//  131  300:invokevirtual   #128 <Method void ItemTouchHelper.updateDxDy(MotionEvent, int, int)>
			}
		}
	//  132  303:return          
	}

	final ItemTouchHelper this$0;

	ItemTouchHelper$2()
	{
		this$0 = ItemTouchHelper.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ItemTouchHelper this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
