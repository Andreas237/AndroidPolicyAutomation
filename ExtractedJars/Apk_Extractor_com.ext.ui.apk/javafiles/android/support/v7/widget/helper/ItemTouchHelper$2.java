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
	//*  10   18:ifne            247
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
	//*  33   69:ifnonnull       214
			{
				recyclerview = ((RecyclerView) (findAnimation(motionevent)));
	//   34   72:aload_0         
	//   35   73:getfield        #14  <Field ItemTouchHelper this$0>
	//   36   76:aload_2         
	//   37   77:invokevirtual   #69  <Method ItemTouchHelper$RecoverAnimation ItemTouchHelper.findAnimation(MotionEvent)>
	//   38   80:astore_1        
				if(recyclerview != null)
	//*  39   81:aload_1         
	//*  40   82:ifnull          214
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
	//* 100  214:aload_0         
	//* 101  215:getfield        #14  <Field ItemTouchHelper this$0>
	//* 102  218:getfield        #132 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
	//* 103  221:ifnull          235
	//* 104  224:aload_0         
	//* 105  225:getfield        #14  <Field ItemTouchHelper this$0>
	//* 106  228:getfield        #132 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
	//* 107  231:aload_2         
	//* 108  232:invokevirtual   #138 <Method void VelocityTracker.addMovement(MotionEvent)>
	//* 109  235:aload_0         
	//* 110  236:getfield        #14  <Field ItemTouchHelper this$0>
	//* 111  239:getfield        #65  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper.mSelected>
	//* 112  242:ifnull          321
	//* 113  245:iconst_1        
	//* 114  246:ireturn         
		if(i == 3 || i == 1)
	//* 115  247:iload_3         
	//* 116  248:iconst_3        
	//* 117  249:icmpeq          257
	//* 118  252:iload_3         
	//* 119  253:iconst_1        
	//* 120  254:icmpne          277
		{
			mActivePointerId = -1;
	//  121  257:aload_0         
	//  122  258:getfield        #14  <Field ItemTouchHelper this$0>
	//  123  261:iconst_m1       
	//  124  262:putfield        #44  <Field int ItemTouchHelper.mActivePointerId>
			select(((android.support.v7.widget.older) (null)), 0);
	//  125  265:aload_0         
	//  126  266:getfield        #14  <Field ItemTouchHelper this$0>
	//  127  269:aconst_null     
	//  128  270:iconst_0        
	//  129  271:invokevirtual   #121 <Method void ItemTouchHelper.select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
		} else
	//* 130  274:goto            214
		if(mActivePointerId != -1)
	//* 131  277:aload_0         
	//* 132  278:getfield        #14  <Field ItemTouchHelper this$0>
	//* 133  281:getfield        #44  <Field int ItemTouchHelper.mActivePointerId>
	//* 134  284:iconst_m1       
	//* 135  285:icmpeq          214
		{
			int j = motionevent.findPointerIndex(mActivePointerId);
	//  136  288:aload_2         
	//  137  289:aload_0         
	//  138  290:getfield        #14  <Field ItemTouchHelper this$0>
	//  139  293:getfield        #44  <Field int ItemTouchHelper.mActivePointerId>
	//  140  296:invokevirtual   #141 <Method int MotionEvent.findPointerIndex(int)>
	//  141  299:istore          4
			if(j >= 0)
	//* 142  301:iload           4
	//* 143  303:iflt            214
				checkSelectForSwipe(i, motionevent, j);
	//  144  306:aload_0         
	//  145  307:getfield        #14  <Field ItemTouchHelper this$0>
	//  146  310:iload_3         
	//  147  311:aload_2         
	//  148  312:iload           4
	//  149  314:invokevirtual   #145 <Method boolean ItemTouchHelper.checkSelectForSwipe(int, MotionEvent, int)>
	//  150  317:pop             
		}
		if(mVelocityTracker != null)
			mVelocityTracker.addMovement(motionevent);
		return mSelected != null;
	//  151  318:goto            214
	//  152  321:iconst_0        
	//  153  322:ireturn         
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
		int i;
		i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		mGestureDetector.onTouchEvent(motionevent);
	//    2    2:aload_0         
	//    3    3:getfield        #14  <Field ItemTouchHelper this$0>
	//    4    6:getfield        #24  <Field GestureDetectorCompat ItemTouchHelper.mGestureDetector>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #30  <Method boolean GestureDetectorCompat.onTouchEvent(MotionEvent)>
	//    7   13:pop             
		if(mVelocityTracker != null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #14  <Field ItemTouchHelper this$0>
	//*  10   18:getfield        #132 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
	//*  11   21:ifnull          35
			mVelocityTracker.addMovement(motionevent);
	//   12   24:aload_0         
	//   13   25:getfield        #14  <Field ItemTouchHelper this$0>
	//   14   28:getfield        #132 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
	//   15   31:aload_2         
	//   16   32:invokevirtual   #138 <Method void VelocityTracker.addMovement(MotionEvent)>
		if(mActivePointerId != -1) goto _L2; else goto _L1
	//   17   35:aload_0         
	//   18   36:getfield        #14  <Field ItemTouchHelper this$0>
	//   19   39:getfield        #44  <Field int ItemTouchHelper.mActivePointerId>
	//   20   42:iconst_m1       
	//   21   43:icmpne          47
_L1:
		return;
	//   22   46:return          
_L2:
		int j;
		int k;
		j = motionevent.getActionMasked();
	//   23   47:aload_2         
	//   24   48:invokevirtual   #36  <Method int MotionEvent.getActionMasked()>
	//   25   51:istore          4
		k = motionevent.findPointerIndex(mActivePointerId);
	//   26   53:aload_2         
	//   27   54:aload_0         
	//   28   55:getfield        #14  <Field ItemTouchHelper this$0>
	//   29   58:getfield        #44  <Field int ItemTouchHelper.mActivePointerId>
	//   30   61:invokevirtual   #141 <Method int MotionEvent.findPointerIndex(int)>
	//   31   64:istore          5
		if(k >= 0)
	//*  32   66:iload           5
	//*  33   68:iflt            84
			checkSelectForSwipe(j, motionevent, k);
	//   34   71:aload_0         
	//   35   72:getfield        #14  <Field ItemTouchHelper this$0>
	//   36   75:iload           4
	//   37   77:aload_2         
	//   38   78:iload           5
	//   39   80:invokevirtual   #145 <Method boolean ItemTouchHelper.checkSelectForSwipe(int, MotionEvent, int)>
	//   40   83:pop             
		recyclerview = ((RecyclerView) (mSelected));
	//   41   84:aload_0         
	//   42   85:getfield        #14  <Field ItemTouchHelper this$0>
	//   43   88:getfield        #65  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper.mSelected>
	//   44   91:astore_1        
		if(recyclerview == null) goto _L1; else goto _L3
	//   45   92:aload_1         
	//   46   93:ifnull          46
_L3:
		j;
	//   47   96:iload           4
		JVM INSTR tableswitch 1 6: default 136
	//	               1 137
	//	               2 155
	//	               3 226
	//	               4 136
	//	               5 136
	//	               6 249;
	//   48   98:tableswitch     1 6: default 136
	//	               1 137
	//	               2 155
	//	               3 226
	//	               4 136
	//	               5 136
	//	               6 249
		   goto _L4 _L5 _L6 _L7 _L4 _L4 _L8
_L4:
		return;
	//   49  136:return          
_L5:
		select(((android.support.v7.widget.older) (null)), 0);
	//   50  137:aload_0         
	//   51  138:getfield        #14  <Field ItemTouchHelper this$0>
	//   52  141:aconst_null     
	//   53  142:iconst_0        
	//   54  143:invokevirtual   #121 <Method void ItemTouchHelper.select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
		mActivePointerId = -1;
	//   55  146:aload_0         
	//   56  147:getfield        #14  <Field ItemTouchHelper this$0>
	//   57  150:iconst_m1       
	//   58  151:putfield        #44  <Field int ItemTouchHelper.mActivePointerId>
		return;
	//   59  154:return          
_L6:
		if(k >= 0)
	//*  60  155:iload           5
	//*  61  157:iflt            46
		{
			updateDxDy(motionevent, mSelectedFlags, k);
	//   62  160:aload_0         
	//   63  161:getfield        #14  <Field ItemTouchHelper this$0>
	//   64  164:aload_2         
	//   65  165:aload_0         
	//   66  166:getfield        #14  <Field ItemTouchHelper this$0>
	//   67  169:getfield        #124 <Field int ItemTouchHelper.mSelectedFlags>
	//   68  172:iload           5
	//   69  174:invokevirtual   #128 <Method void ItemTouchHelper.updateDxDy(MotionEvent, int, int)>
			moveIfNecessary(((android.support.v7.widget.older) (recyclerview)));
	//   70  177:aload_0         
	//   71  178:getfield        #14  <Field ItemTouchHelper this$0>
	//   72  181:aload_1         
	//   73  182:invokevirtual   #152 <Method void ItemTouchHelper.moveIfNecessary(android.support.v7.widget.RecyclerView$ViewHolder)>
			mRecyclerView.removeCallbacks(mScrollRunnable);
	//   74  185:aload_0         
	//   75  186:getfield        #14  <Field ItemTouchHelper this$0>
	//   76  189:getfield        #108 <Field RecyclerView ItemTouchHelper.mRecyclerView>
	//   77  192:aload_0         
	//   78  193:getfield        #14  <Field ItemTouchHelper this$0>
	//   79  196:getfield        #156 <Field Runnable ItemTouchHelper.mScrollRunnable>
	//   80  199:invokevirtual   #162 <Method boolean RecyclerView.removeCallbacks(Runnable)>
	//   81  202:pop             
			mScrollRunnable.run();
	//   82  203:aload_0         
	//   83  204:getfield        #14  <Field ItemTouchHelper this$0>
	//   84  207:getfield        #156 <Field Runnable ItemTouchHelper.mScrollRunnable>
	//   85  210:invokeinterface #167 <Method void Runnable.run()>
			mRecyclerView.invalidate();
	//   86  215:aload_0         
	//   87  216:getfield        #14  <Field ItemTouchHelper this$0>
	//   88  219:getfield        #108 <Field RecyclerView ItemTouchHelper.mRecyclerView>
	//   89  222:invokevirtual   #170 <Method void RecyclerView.invalidate()>
			return;
	//   90  225:return          
		}
		break; /* Loop/switch isn't completed */
_L7:
		if(mVelocityTracker != null)
	//*  91  226:aload_0         
	//*  92  227:getfield        #14  <Field ItemTouchHelper this$0>
	//*  93  230:getfield        #132 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
	//*  94  233:ifnull          137
			mVelocityTracker.clear();
	//   95  236:aload_0         
	//   96  237:getfield        #14  <Field ItemTouchHelper this$0>
	//   97  240:getfield        #132 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
	//   98  243:invokevirtual   #173 <Method void VelocityTracker.clear()>
		if(true) goto _L5; else goto _L9
	//   99  246:goto            137
_L9:
		break; /* Loop/switch isn't completed */
_L8:
		j = motionevent.getActionIndex();
	//  100  249:aload_2         
	//  101  250:invokevirtual   #176 <Method int MotionEvent.getActionIndex()>
	//  102  253:istore          4
		continue; /* Loop/switch isn't completed */
		if(true) goto _L1; else goto _L10
_L10:
		if(motionevent.getPointerId(j) != mActivePointerId) goto _L1; else goto _L11
	//  103  255:aload_2         
	//  104  256:iload           4
	//  105  258:invokevirtual   #40  <Method int MotionEvent.getPointerId(int)>
	//  106  261:aload_0         
	//  107  262:getfield        #14  <Field ItemTouchHelper this$0>
	//  108  265:getfield        #44  <Field int ItemTouchHelper.mActivePointerId>
	//  109  268:icmpne          46
_L11:
		if(j == 0)
	//* 110  271:iload           4
	//* 111  273:ifne            278
			i = 1;
	//  112  276:iconst_1        
	//  113  277:istore_3        
		mActivePointerId = motionevent.getPointerId(i);
	//  114  278:aload_0         
	//  115  279:getfield        #14  <Field ItemTouchHelper this$0>
	//  116  282:aload_2         
	//  117  283:iload_3         
	//  118  284:invokevirtual   #40  <Method int MotionEvent.getPointerId(int)>
	//  119  287:putfield        #44  <Field int ItemTouchHelper.mActivePointerId>
		updateDxDy(motionevent, mSelectedFlags, j);
	//  120  290:aload_0         
	//  121  291:getfield        #14  <Field ItemTouchHelper this$0>
	//  122  294:aload_2         
	//  123  295:aload_0         
	//  124  296:getfield        #14  <Field ItemTouchHelper this$0>
	//  125  299:getfield        #124 <Field int ItemTouchHelper.mSelectedFlags>
	//  126  302:iload           4
	//  127  304:invokevirtual   #128 <Method void ItemTouchHelper.updateDxDy(MotionEvent, int, int)>
		return;
	//  128  307:return          
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
