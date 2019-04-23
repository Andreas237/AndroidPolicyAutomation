// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget.helper;

import android.support.v4.view.g;
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
		mGestureDetector.a(motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field ItemTouchHelper this$0>
	//    2    4:getfield        #24  <Field g ItemTouchHelper.mGestureDetector>
	//    3    7:aload_2         
	//    4    8:invokevirtual   #30  <Method boolean g.a(MotionEvent)>
	//    5   11:pop             
		int i = motionevent.getActionMasked();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #36  <Method int MotionEvent.getActionMasked()>
	//    8   16:istore_3        
		if(i == 0)
	//*   9   17:iload_3         
	//*  10   18:ifne            215
		{
			mActivePointerId = motionevent.getPointerId(0);
	//   11   21:aload_0         
	//   12   22:getfield        #12  <Field ItemTouchHelper this$0>
	//   13   25:aload_2         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #40  <Method int MotionEvent.getPointerId(int)>
	//   16   30:putfield        #44  <Field int ItemTouchHelper.mActivePointerId>
			mInitialTouchX = motionevent.getX();
	//   17   33:aload_0         
	//   18   34:getfield        #12  <Field ItemTouchHelper this$0>
	//   19   37:aload_2         
	//   20   38:invokevirtual   #48  <Method float MotionEvent.getX()>
	//   21   41:putfield        #52  <Field float ItemTouchHelper.mInitialTouchX>
			mInitialTouchY = motionevent.getY();
	//   22   44:aload_0         
	//   23   45:getfield        #12  <Field ItemTouchHelper this$0>
	//   24   48:aload_2         
	//   25   49:invokevirtual   #55  <Method float MotionEvent.getY()>
	//   26   52:putfield        #58  <Field float ItemTouchHelper.mInitialTouchY>
			obtainVelocityTracker();
	//   27   55:aload_0         
	//   28   56:getfield        #12  <Field ItemTouchHelper this$0>
	//   29   59:invokevirtual   #61  <Method void ItemTouchHelper.obtainVelocityTracker()>
			if(mSelected == null)
	//*  30   62:aload_0         
	//*  31   63:getfield        #12  <Field ItemTouchHelper this$0>
	//*  32   66:getfield        #65  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper.mSelected>
	//*  33   69:ifnonnull       287
			{
				recyclerview = ((RecyclerView) (findAnimation(motionevent)));
	//   34   72:aload_0         
	//   35   73:getfield        #12  <Field ItemTouchHelper this$0>
	//   36   76:aload_2         
	//   37   77:invokevirtual   #69  <Method ItemTouchHelper$RecoverAnimation ItemTouchHelper.findAnimation(MotionEvent)>
	//   38   80:astore_1        
				if(recyclerview != null)
	//*  39   81:aload_1         
	//*  40   82:ifnull          287
				{
					ItemTouchHelper itemtouchhelper = ItemTouchHelper.this;
	//   41   85:aload_0         
	//   42   86:getfield        #12  <Field ItemTouchHelper this$0>
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
	//   52  107:getfield        #12  <Field ItemTouchHelper this$0>
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
	//   62  128:getfield        #12  <Field ItemTouchHelper this$0>
	//   63  131:aload_1         
	//   64  132:getfield        #80  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
	//   65  135:iconst_1        
	//   66  136:invokevirtual   #84  <Method void ItemTouchHelper.endRecoverAnimation(android.support.v7.widget.RecyclerView$ViewHolder, boolean)>
					if(mPendingCleanup.remove(((Object) (((coverAnimation) (recyclerview)).mViewHolder.itemView))))
	//*  67  139:aload_0         
	//*  68  140:getfield        #12  <Field ItemTouchHelper this$0>
	//*  69  143:getfield        #88  <Field List ItemTouchHelper.mPendingCleanup>
	//*  70  146:aload_1         
	//*  71  147:getfield        #80  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
	//*  72  150:getfield        #94  <Field android.view.View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  73  153:invokeinterface #100 <Method boolean List.remove(Object)>
	//*  74  158:ifeq            182
						mCallback.clearView(mRecyclerView, ((coverAnimation) (recyclerview)).mViewHolder);
	//   75  161:aload_0         
	//   76  162:getfield        #12  <Field ItemTouchHelper this$0>
	//   77  165:getfield        #104 <Field ItemTouchHelper$Callback ItemTouchHelper.mCallback>
	//   78  168:aload_0         
	//   79  169:getfield        #12  <Field ItemTouchHelper this$0>
	//   80  172:getfield        #108 <Field RecyclerView ItemTouchHelper.mRecyclerView>
	//   81  175:aload_1         
	//   82  176:getfield        #80  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
	//   83  179:invokevirtual   #114 <Method void ItemTouchHelper$Callback.clearView(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
					select(((coverAnimation) (recyclerview)).mViewHolder, ((coverAnimation) (recyclerview)).mActionState);
	//   84  182:aload_0         
	//   85  183:getfield        #12  <Field ItemTouchHelper this$0>
	//   86  186:aload_1         
	//   87  187:getfield        #80  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
	//   88  190:aload_1         
	//   89  191:getfield        #117 <Field int ItemTouchHelper$RecoverAnimation.mActionState>
	//   90  194:invokevirtual   #121 <Method void ItemTouchHelper.select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
					recyclerview = ((RecyclerView) (ItemTouchHelper.this));
	//   91  197:aload_0         
	//   92  198:getfield        #12  <Field ItemTouchHelper this$0>
	//   93  201:astore_1        
					((ItemTouchHelper) (recyclerview)).updateDxDy(motionevent, ((ItemTouchHelper) (recyclerview)).mSelectedFlags, 0);
	//   94  202:aload_1         
	//   95  203:aload_2         
	//   96  204:aload_1         
	//   97  205:getfield        #124 <Field int ItemTouchHelper.mSelectedFlags>
	//   98  208:iconst_0        
	//   99  209:invokevirtual   #128 <Method void ItemTouchHelper.updateDxDy(MotionEvent, int, int)>
				}
			}
		} else
	//* 100  212:goto            287
		if(i != 3 && i != 1)
	//* 101  215:iload_3         
	//* 102  216:iconst_3        
	//* 103  217:icmpeq          271
	//* 104  220:iload_3         
	//* 105  221:iconst_1        
	//* 106  222:icmpne          228
	//* 107  225:goto            271
		{
			if(mActivePointerId != -1)
	//* 108  228:aload_0         
	//* 109  229:getfield        #12  <Field ItemTouchHelper this$0>
	//* 110  232:getfield        #44  <Field int ItemTouchHelper.mActivePointerId>
	//* 111  235:iconst_m1       
	//* 112  236:icmpeq          287
			{
				int j = motionevent.findPointerIndex(mActivePointerId);
	//  113  239:aload_2         
	//  114  240:aload_0         
	//  115  241:getfield        #12  <Field ItemTouchHelper this$0>
	//  116  244:getfield        #44  <Field int ItemTouchHelper.mActivePointerId>
	//  117  247:invokevirtual   #131 <Method int MotionEvent.findPointerIndex(int)>
	//  118  250:istore          4
				if(j >= 0)
	//* 119  252:iload           4
	//* 120  254:iflt            287
					checkSelectForSwipe(i, motionevent, j);
	//  121  257:aload_0         
	//  122  258:getfield        #12  <Field ItemTouchHelper this$0>
	//  123  261:iload_3         
	//  124  262:aload_2         
	//  125  263:iload           4
	//  126  265:invokevirtual   #135 <Method void ItemTouchHelper.checkSelectForSwipe(int, MotionEvent, int)>
			}
		} else
	//* 127  268:goto            287
		{
			recyclerview = ((RecyclerView) (ItemTouchHelper.this));
	//  128  271:aload_0         
	//  129  272:getfield        #12  <Field ItemTouchHelper this$0>
	//  130  275:astore_1        
			recyclerview.mActivePointerId = -1;
	//  131  276:aload_1         
	//  132  277:iconst_m1       
	//  133  278:putfield        #44  <Field int ItemTouchHelper.mActivePointerId>
			((ItemTouchHelper) (recyclerview)).select(((android.support.v7.widget.older) (null)), 0);
	//  134  281:aload_1         
	//  135  282:aconst_null     
	//  136  283:iconst_0        
	//  137  284:invokevirtual   #121 <Method void ItemTouchHelper.select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
		}
		if(mVelocityTracker != null)
	//* 138  287:aload_0         
	//* 139  288:getfield        #12  <Field ItemTouchHelper this$0>
	//* 140  291:getfield        #139 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
	//* 141  294:ifnull          308
			mVelocityTracker.addMovement(motionevent);
	//  142  297:aload_0         
	//  143  298:getfield        #12  <Field ItemTouchHelper this$0>
	//  144  301:getfield        #139 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
	//  145  304:aload_2         
	//  146  305:invokevirtual   #145 <Method void VelocityTracker.addMovement(MotionEvent)>
		return mSelected != null;
	//  147  308:aload_0         
	//  148  309:getfield        #12  <Field ItemTouchHelper this$0>
	//  149  312:getfield        #65  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper.mSelected>
	//  150  315:ifnull          320
	//  151  318:iconst_1        
	//  152  319:ireturn         
	//  153  320:iconst_0        
	//  154  321:ireturn         
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
	//    4    6:getfield        #12  <Field ItemTouchHelper this$0>
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
			mGestureDetector.a(motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field ItemTouchHelper this$0>
	//    2    4:getfield        #24  <Field g ItemTouchHelper.mGestureDetector>
	//    3    7:aload_2         
	//    4    8:invokevirtual   #30  <Method boolean g.a(MotionEvent)>
	//    5   11:pop             
			if(mVelocityTracker != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #12  <Field ItemTouchHelper this$0>
	//*   8   16:getfield        #139 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
	//*   9   19:ifnull          33
				mVelocityTracker.addMovement(motionevent);
	//   10   22:aload_0         
	//   11   23:getfield        #12  <Field ItemTouchHelper this$0>
	//   12   26:getfield        #139 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
	//   13   29:aload_2         
	//   14   30:invokevirtual   #145 <Method void VelocityTracker.addMovement(MotionEvent)>
			if(mActivePointerId == -1)
	//*  15   33:aload_0         
	//*  16   34:getfield        #12  <Field ItemTouchHelper this$0>
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
	//   26   53:getfield        #12  <Field ItemTouchHelper this$0>
	//   27   56:getfield        #44  <Field int ItemTouchHelper.mActivePointerId>
	//   28   59:invokevirtual   #131 <Method int MotionEvent.findPointerIndex(int)>
	//   29   62:istore          5
			if(k >= 0)
	//*  30   64:iload           5
	//*  31   66:iflt            81
				checkSelectForSwipe(j, motionevent, k);
	//   32   69:aload_0         
	//   33   70:getfield        #12  <Field ItemTouchHelper this$0>
	//   34   73:iload           4
	//   35   75:aload_2         
	//   36   76:iload           5
	//   37   78:invokevirtual   #135 <Method void ItemTouchHelper.checkSelectForSwipe(int, MotionEvent, int)>
			recyclerview = ((RecyclerView) (mSelected));
	//   38   81:aload_0         
	//   39   82:getfield        #12  <Field ItemTouchHelper this$0>
	//   40   85:getfield        #65  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper.mSelected>
	//   41   88:astore_1        
			if(recyclerview == null)
	//*  42   89:aload_1         
	//*  43   90:ifnonnull       94
				return;
	//   44   93:return          
			int i = 0;
	//   45   94:iconst_0        
	//   46   95:istore_3        
			if(j != 6)
	//*  47   96:iload           4
	//*  48   98:bipush          6
	//*  49  100:icmpeq          247
			{
				switch(j)
	//*  50  103:iload           4
				{
	//*  51  105:tableswitch     1 3: default 132
	//	               1 229
	//	               2 156
	//	               3 133
				default:
					return;
	//   52  132:return          

				case 1: // '\001'
					break;

				case 3: // '\003'
					if(mVelocityTracker != null)
	//*  53  133:aload_0         
	//*  54  134:getfield        #12  <Field ItemTouchHelper this$0>
	//*  55  137:getfield        #139 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
	//*  56  140:ifnull          229
						mVelocityTracker.clear();
	//   57  143:aload_0         
	//   58  144:getfield        #12  <Field ItemTouchHelper this$0>
	//   59  147:getfield        #139 <Field VelocityTracker ItemTouchHelper.mVelocityTracker>
	//   60  150:invokevirtual   #152 <Method void VelocityTracker.clear()>
					break;
	//   61  153:goto            229

				case 2: // '\002'
					if(k >= 0)
	//*  62  156:iload           5
	//*  63  158:iflt            304
					{
						ItemTouchHelper itemtouchhelper = ItemTouchHelper.this;
	//   64  161:aload_0         
	//   65  162:getfield        #12  <Field ItemTouchHelper this$0>
	//   66  165:astore          6
						itemtouchhelper.updateDxDy(motionevent, itemtouchhelper.mSelectedFlags, k);
	//   67  167:aload           6
	//   68  169:aload_2         
	//   69  170:aload           6
	//   70  172:getfield        #124 <Field int ItemTouchHelper.mSelectedFlags>
	//   71  175:iload           5
	//   72  177:invokevirtual   #128 <Method void ItemTouchHelper.updateDxDy(MotionEvent, int, int)>
						moveIfNecessary(((android.support.v7.widget.older) (recyclerview)));
	//   73  180:aload_0         
	//   74  181:getfield        #12  <Field ItemTouchHelper this$0>
	//   75  184:aload_1         
	//   76  185:invokevirtual   #156 <Method void ItemTouchHelper.moveIfNecessary(android.support.v7.widget.RecyclerView$ViewHolder)>
						mRecyclerView.removeCallbacks(mScrollRunnable);
	//   77  188:aload_0         
	//   78  189:getfield        #12  <Field ItemTouchHelper this$0>
	//   79  192:getfield        #108 <Field RecyclerView ItemTouchHelper.mRecyclerView>
	//   80  195:aload_0         
	//   81  196:getfield        #12  <Field ItemTouchHelper this$0>
	//   82  199:getfield        #160 <Field Runnable ItemTouchHelper.mScrollRunnable>
	//   83  202:invokevirtual   #166 <Method boolean RecyclerView.removeCallbacks(Runnable)>
	//   84  205:pop             
						mScrollRunnable.run();
	//   85  206:aload_0         
	//   86  207:getfield        #12  <Field ItemTouchHelper this$0>
	//   87  210:getfield        #160 <Field Runnable ItemTouchHelper.mScrollRunnable>
	//   88  213:invokeinterface #171 <Method void Runnable.run()>
						mRecyclerView.invalidate();
	//   89  218:aload_0         
	//   90  219:getfield        #12  <Field ItemTouchHelper this$0>
	//   91  222:getfield        #108 <Field RecyclerView ItemTouchHelper.mRecyclerView>
	//   92  225:invokevirtual   #174 <Method void RecyclerView.invalidate()>
						return;
	//   93  228:return          
					}
					break label0;
				}
				select(((android.support.v7.widget.older) (null)), 0);
	//   94  229:aload_0         
	//   95  230:getfield        #12  <Field ItemTouchHelper this$0>
	//   96  233:aconst_null     
	//   97  234:iconst_0        
	//   98  235:invokevirtual   #121 <Method void ItemTouchHelper.select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
				mActivePointerId = -1;
	//   99  238:aload_0         
	//  100  239:getfield        #12  <Field ItemTouchHelper this$0>
	//  101  242:iconst_m1       
	//  102  243:putfield        #44  <Field int ItemTouchHelper.mActivePointerId>
				return;
	//  103  246:return          
			}
			j = motionevent.getActionIndex();
	//  104  247:aload_2         
	//  105  248:invokevirtual   #177 <Method int MotionEvent.getActionIndex()>
	//  106  251:istore          4
			if(motionevent.getPointerId(j) == mActivePointerId)
	//* 107  253:aload_2         
	//* 108  254:iload           4
	//* 109  256:invokevirtual   #40  <Method int MotionEvent.getPointerId(int)>
	//* 110  259:aload_0         
	//* 111  260:getfield        #12  <Field ItemTouchHelper this$0>
	//* 112  263:getfield        #44  <Field int ItemTouchHelper.mActivePointerId>
	//* 113  266:icmpne          304
			{
				if(j == 0)
	//* 114  269:iload           4
	//* 115  271:ifne            276
					i = 1;
	//  116  274:iconst_1        
	//  117  275:istore_3        
				mActivePointerId = motionevent.getPointerId(i);
	//  118  276:aload_0         
	//  119  277:getfield        #12  <Field ItemTouchHelper this$0>
	//  120  280:aload_2         
	//  121  281:iload_3         
	//  122  282:invokevirtual   #40  <Method int MotionEvent.getPointerId(int)>
	//  123  285:putfield        #44  <Field int ItemTouchHelper.mActivePointerId>
				recyclerview = ((RecyclerView) (ItemTouchHelper.this));
	//  124  288:aload_0         
	//  125  289:getfield        #12  <Field ItemTouchHelper this$0>
	//  126  292:astore_1        
				((ItemTouchHelper) (recyclerview)).updateDxDy(motionevent, ((ItemTouchHelper) (recyclerview)).mSelectedFlags, j);
	//  127  293:aload_1         
	//  128  294:aload_2         
	//  129  295:aload_1         
	//  130  296:getfield        #124 <Field int ItemTouchHelper.mSelectedFlags>
	//  131  299:iload           4
	//  132  301:invokevirtual   #128 <Method void ItemTouchHelper.updateDxDy(MotionEvent, int, int)>
			}
		}
	//  133  304:return          
	}

	final ItemTouchHelper this$0;

	ItemTouchHelper$2()
	{
		this$0 = ItemTouchHelper.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field ItemTouchHelper this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}
}
