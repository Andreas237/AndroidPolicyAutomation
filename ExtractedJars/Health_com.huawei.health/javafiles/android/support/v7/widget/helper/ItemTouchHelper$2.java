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
	//*  33   69:ifnonnull       288
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
	//* 100  214:goto            288
		if(i == 3 || i == 1)
	//* 101  217:iload_3         
	//* 102  218:iconst_3        
	//* 103  219:icmpeq          227
	//* 104  222:iload_3         
	//* 105  223:iconst_1        
	//* 106  224:icmpne          247
		{
			mActivePointerId = -1;
	//  107  227:aload_0         
	//  108  228:getfield        #14  <Field ItemTouchHelper this$0>
	//  109  231:iconst_m1       
	//  110  232:putfield        #44  <Field int ItemTouchHelper.mActivePointerId>
			select(((android.support.v7.widget.older) (null)), 0);
	//  111  235:aload_0         
	//  112  236:getfield        #14  <Field ItemTouchHelper this$0>
	//  113  239:aconst_null     
	//  114  240:iconst_0        
	//  115  241:invokevirtual   #121 <Method void ItemTouchHelper.select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
		} else
	//* 116  244:goto            288
		if(mActivePointerId != -1)
	//* 117  247:aload_0         
	//* 118  248:getfield        #14  <Field ItemTouchHelper this$0>
	//* 119  251:getfield        #44  <Field int ItemTouchHelper.mActivePointerId>
	//* 120  254:iconst_m1       
	//* 121  255:icmpeq          288
		{
			int j = motionevent.findPointerIndex(mActivePointerId);
	//  122  258:aload_2         
	//  123  259:aload_0         
	//  124  260:getfield        #14  <Field ItemTouchHelper this$0>
	//  125  263:getfield        #44  <Field int ItemTouchHelper.mActivePointerId>
	//  126  266:invokevirtual   #131 <Method int MotionEvent.findPointerIndex(int)>
	//  127  269:istore          4
			if(j >= 0)
	//* 128  271:iload           4
	//* 129  273:iflt            288
				checkSelectForSwipe(i, motionevent, j);
	//  130  276:aload_0         
	//  131  277:getfield        #14  <Field ItemTouchHelper this$0>
	//  132  280:iload_3         
	//  133  281:aload_2         
	//  134  282:iload           4
	//  135  284:invokevirtual   #135 <Method boolean ItemTouchHelper.checkSelectForSwipe(int, MotionEvent, int)>
	//  136  287:pop             
		}
		if(mVelocityTracker != null)
	//* 137  288:aload_0         
	//* 138  289:getfield        #14  <Field ItemTouchHelper this$0>
	//* 139  292:getfield        #139 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
	//* 140  295:ifnull          309
			mVelocityTracker.addMovement(motionevent);
	//  141  298:aload_0         
	//  142  299:getfield        #14  <Field ItemTouchHelper this$0>
	//  143  302:getfield        #139 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
	//  144  305:aload_2         
	//  145  306:invokevirtual   #145 <Method void VelocityTracker.addMovement(MotionEvent)>
		return mSelected != null;
	//  146  309:aload_0         
	//  147  310:getfield        #14  <Field ItemTouchHelper this$0>
	//  148  313:getfield        #65  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper.mSelected>
	//  149  316:ifnull          321
	//  150  319:iconst_1        
	//  151  320:ireturn         
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
		int i = motionevent.getActionMasked();
	//   21   45:aload_2         
	//   22   46:invokevirtual   #36  <Method int MotionEvent.getActionMasked()>
	//   23   49:istore_3        
		int k = motionevent.findPointerIndex(mActivePointerId);
	//   24   50:aload_2         
	//   25   51:aload_0         
	//   26   52:getfield        #14  <Field ItemTouchHelper this$0>
	//   27   55:getfield        #44  <Field int ItemTouchHelper.mActivePointerId>
	//   28   58:invokevirtual   #131 <Method int MotionEvent.findPointerIndex(int)>
	//   29   61:istore          4
		if(k >= 0)
	//*  30   63:iload           4
	//*  31   65:iflt            80
			checkSelectForSwipe(i, motionevent, k);
	//   32   68:aload_0         
	//   33   69:getfield        #14  <Field ItemTouchHelper this$0>
	//   34   72:iload_3         
	//   35   73:aload_2         
	//   36   74:iload           4
	//   37   76:invokevirtual   #135 <Method boolean ItemTouchHelper.checkSelectForSwipe(int, MotionEvent, int)>
	//   38   79:pop             
		recyclerview = ((RecyclerView) (mSelected));
	//   39   80:aload_0         
	//   40   81:getfield        #14  <Field ItemTouchHelper this$0>
	//   41   84:getfield        #65  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper.mSelected>
	//   42   87:astore_1        
		if(recyclerview == null)
	//*  43   88:aload_1         
	//*  44   89:ifnonnull       93
			return;
	//   45   92:return          
		switch(i)
	//*  46   93:iload_3         
		{
	//*  47   94:tableswitch     1 6: default 132
	//	               1 224
	//	               2 133
	//	               3 204
	//	               4 305
	//	               5 305
	//	               6 242
		default:
			return;
	//   48  132:return          

		case 4: // '\004'
		case 5: // '\005'
			break;

		case 2: // '\002'
			if(k >= 0)
	//*  49  133:iload           4
	//*  50  135:iflt            305
			{
				updateDxDy(motionevent, mSelectedFlags, k);
	//   51  138:aload_0         
	//   52  139:getfield        #14  <Field ItemTouchHelper this$0>
	//   53  142:aload_2         
	//   54  143:aload_0         
	//   55  144:getfield        #14  <Field ItemTouchHelper this$0>
	//   56  147:getfield        #124 <Field int ItemTouchHelper.mSelectedFlags>
	//   57  150:iload           4
	//   58  152:invokevirtual   #128 <Method void ItemTouchHelper.updateDxDy(MotionEvent, int, int)>
				moveIfNecessary(((android.support.v7.widget.older) (recyclerview)));
	//   59  155:aload_0         
	//   60  156:getfield        #14  <Field ItemTouchHelper this$0>
	//   61  159:aload_1         
	//   62  160:invokevirtual   #152 <Method void ItemTouchHelper.moveIfNecessary(android.support.v7.widget.RecyclerView$ViewHolder)>
				mRecyclerView.removeCallbacks(mScrollRunnable);
	//   63  163:aload_0         
	//   64  164:getfield        #14  <Field ItemTouchHelper this$0>
	//   65  167:getfield        #108 <Field RecyclerView ItemTouchHelper.mRecyclerView>
	//   66  170:aload_0         
	//   67  171:getfield        #14  <Field ItemTouchHelper this$0>
	//   68  174:getfield        #156 <Field Runnable ItemTouchHelper.mScrollRunnable>
	//   69  177:invokevirtual   #162 <Method boolean RecyclerView.removeCallbacks(Runnable)>
	//   70  180:pop             
				mScrollRunnable.run();
	//   71  181:aload_0         
	//   72  182:getfield        #14  <Field ItemTouchHelper this$0>
	//   73  185:getfield        #156 <Field Runnable ItemTouchHelper.mScrollRunnable>
	//   74  188:invokeinterface #167 <Method void Runnable.run()>
				mRecyclerView.invalidate();
	//   75  193:aload_0         
	//   76  194:getfield        #14  <Field ItemTouchHelper this$0>
	//   77  197:getfield        #108 <Field RecyclerView ItemTouchHelper.mRecyclerView>
	//   78  200:invokevirtual   #170 <Method void RecyclerView.invalidate()>
				return;
	//   79  203:return          
			}
			break;

		case 3: // '\003'
			if(mVelocityTracker != null)
	//*  80  204:aload_0         
	//*  81  205:getfield        #14  <Field ItemTouchHelper this$0>
	//*  82  208:getfield        #139 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
	//*  83  211:ifnull          224
				mVelocityTracker.clear();
	//   84  214:aload_0         
	//   85  215:getfield        #14  <Field ItemTouchHelper this$0>
	//   86  218:getfield        #139 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
	//   87  221:invokevirtual   #173 <Method void VelocityTracker.clear()>
			// fall through

		case 1: // '\001'
			select(((android.support.v7.widget.older) (null)), 0);
	//   88  224:aload_0         
	//   89  225:getfield        #14  <Field ItemTouchHelper this$0>
	//   90  228:aconst_null     
	//   91  229:iconst_0        
	//   92  230:invokevirtual   #121 <Method void ItemTouchHelper.select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
			mActivePointerId = -1;
	//   93  233:aload_0         
	//   94  234:getfield        #14  <Field ItemTouchHelper this$0>
	//   95  237:iconst_m1       
	//   96  238:putfield        #44  <Field int ItemTouchHelper.mActivePointerId>
			return;
	//   97  241:return          

		case 6: // '\006'
			int l = motionevent.getActionIndex();
	//   98  242:aload_2         
	//   99  243:invokevirtual   #176 <Method int MotionEvent.getActionIndex()>
	//  100  246:istore          4
			if(motionevent.getPointerId(l) != mActivePointerId)
				break;
	//  101  248:aload_2         
	//  102  249:iload           4
	//  103  251:invokevirtual   #40  <Method int MotionEvent.getPointerId(int)>
	//  104  254:aload_0         
	//  105  255:getfield        #14  <Field ItemTouchHelper this$0>
	//  106  258:getfield        #44  <Field int ItemTouchHelper.mActivePointerId>
	//  107  261:icmpne          305
			int j;
			if(l == 0)
	//* 108  264:iload           4
	//* 109  266:ifne            274
				j = 1;
	//  110  269:iconst_1        
	//  111  270:istore_3        
			else
	//* 112  271:goto            276
				j = 0;
	//  113  274:iconst_0        
	//  114  275:istore_3        
			mActivePointerId = motionevent.getPointerId(j);
	//  115  276:aload_0         
	//  116  277:getfield        #14  <Field ItemTouchHelper this$0>
	//  117  280:aload_2         
	//  118  281:iload_3         
	//  119  282:invokevirtual   #40  <Method int MotionEvent.getPointerId(int)>
	//  120  285:putfield        #44  <Field int ItemTouchHelper.mActivePointerId>
			updateDxDy(motionevent, mSelectedFlags, l);
	//  121  288:aload_0         
	//  122  289:getfield        #14  <Field ItemTouchHelper this$0>
	//  123  292:aload_2         
	//  124  293:aload_0         
	//  125  294:getfield        #14  <Field ItemTouchHelper this$0>
	//  126  297:getfield        #124 <Field int ItemTouchHelper.mSelectedFlags>
	//  127  300:iload           4
	//  128  302:invokevirtual   #128 <Method void ItemTouchHelper.updateDxDy(MotionEvent, int, int)>
			break;
		}
	//  129  305:return          
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
