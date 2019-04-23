// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget.helper;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v4.view.ac;
import android.support.v4.view.g;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.*;
import java.util.ArrayList;
import java.util.List;

public class ItemTouchHelper extends android.support.v7.widget.RecyclerView.ItemDecoration
	implements android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener
{

	public ItemTouchHelper(Callback callback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #93  <Method void android.support.v7.widget.RecyclerView$ItemDecoration()>
	//    2    4:aload_0         
	//    3    5:new             #95  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #96  <Method void ArrayList()>
	//    6   12:putfield        #98  <Field List mPendingCleanup>
	//    7   15:aload_0         
	//    8   16:iconst_2        
	//    9   17:newarray        float[]
	//   10   19:putfield        #100 <Field float[] mTmpPosition>
		mSelected = null;
	//   11   22:aload_0         
	//   12   23:aconst_null     
	//   13   24:putfield        #102 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
		mActivePointerId = -1;
	//   14   27:aload_0         
	//   15   28:iconst_m1       
	//   16   29:putfield        #104 <Field int mActivePointerId>
		mActionState = 0;
	//   17   32:aload_0         
	//   18   33:iconst_0        
	//   19   34:putfield        #106 <Field int mActionState>
		mRecoverAnimations = ((List) (new ArrayList()));
	//   20   37:aload_0         
	//   21   38:new             #95  <Class ArrayList>
	//   22   41:dup             
	//   23   42:invokespecial   #96  <Method void ArrayList()>
	//   24   45:putfield        #108 <Field List mRecoverAnimations>
	//   25   48:aload_0         
	//   26   49:new             #110 <Class ItemTouchHelper$1>
	//   27   52:dup             
	//   28   53:aload_0         
	//   29   54:invokespecial   #113 <Method void ItemTouchHelper$1(ItemTouchHelper)>
	//   30   57:putfield        #115 <Field Runnable mScrollRunnable>
		mChildDrawingOrderCallback = null;
	//   31   60:aload_0         
	//   32   61:aconst_null     
	//   33   62:putfield        #117 <Field android.support.v7.widget.RecyclerView$ChildDrawingOrderCallback mChildDrawingOrderCallback>
		mOverdrawChild = null;
	//   34   65:aload_0         
	//   35   66:aconst_null     
	//   36   67:putfield        #119 <Field View mOverdrawChild>
		mOverdrawChildPosition = -1;
	//   37   70:aload_0         
	//   38   71:iconst_m1       
	//   39   72:putfield        #121 <Field int mOverdrawChildPosition>
	//   40   75:aload_0         
	//   41   76:new             #123 <Class ItemTouchHelper$2>
	//   42   79:dup             
	//   43   80:aload_0         
	//   44   81:invokespecial   #124 <Method void ItemTouchHelper$2(ItemTouchHelper)>
	//   45   84:putfield        #126 <Field android.support.v7.widget.RecyclerView$OnItemTouchListener mOnItemTouchListener>
		mCallback = callback;
	//   46   87:aload_0         
	//   47   88:aload_1         
	//   48   89:putfield        #128 <Field ItemTouchHelper$Callback mCallback>
	//   49   92:return          
	}

	private void addChildDrawingOrderCallback()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #135 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          9
			return;
	//    3    8:return          
		if(mChildDrawingOrderCallback == null)
	//*   4    9:aload_0         
	//*   5   10:getfield        #117 <Field android.support.v7.widget.RecyclerView$ChildDrawingOrderCallback mChildDrawingOrderCallback>
	//*   6   13:ifnonnull       28
			mChildDrawingOrderCallback = ((android.support.v7.widget.RecyclerView.ChildDrawingOrderCallback) (new _cls5()));
	//    7   16:aload_0         
	//    8   17:new             #137 <Class ItemTouchHelper$5>
	//    9   20:dup             
	//   10   21:aload_0         
	//   11   22:invokespecial   #138 <Method void ItemTouchHelper$5(ItemTouchHelper)>
	//   12   25:putfield        #117 <Field android.support.v7.widget.RecyclerView$ChildDrawingOrderCallback mChildDrawingOrderCallback>
		mRecyclerView.setChildDrawingOrderCallback(mChildDrawingOrderCallback);
	//   13   28:aload_0         
	//   14   29:getfield        #140 <Field RecyclerView mRecyclerView>
	//   15   32:aload_0         
	//   16   33:getfield        #117 <Field android.support.v7.widget.RecyclerView$ChildDrawingOrderCallback mChildDrawingOrderCallback>
	//   17   36:invokevirtual   #146 <Method void RecyclerView.setChildDrawingOrderCallback(android.support.v7.widget.RecyclerView$ChildDrawingOrderCallback)>
	//   18   39:return          
	}

	private int checkHorizontalSwipe(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
	{
		if((i & 0xc) != 0)
	//*   0    0:iload_2         
	//*   1    1:bipush          12
	//*   2    3:iand            
	//*   3    4:ifeq            203
		{
			float f = mDx;
	//    4    7:aload_0         
	//    5    8:getfield        #150 <Field float mDx>
	//    6   11:fstore_3        
			byte byte1 = 8;
	//    7   12:bipush          8
	//    8   14:istore          6
			byte byte0;
			if(f > 0.0F)
	//*   9   16:fload_3         
	//*  10   17:fconst_0        
	//*  11   18:fcmpl           
	//*  12   19:ifle            29
				byte0 = 8;
	//   13   22:bipush          8
	//   14   24:istore          5
			else
	//*  15   26:goto            32
				byte0 = 4;
	//   16   29:iconst_4        
	//   17   30:istore          5
			VelocityTracker velocitytracker = mVelocityTracker;
	//   18   32:aload_0         
	//   19   33:getfield        #152 <Field VelocityTracker mVelocityTracker>
	//   20   36:astore          7
			if(velocitytracker != null && mActivePointerId > -1)
	//*  21   38:aload           7
	//*  22   40:ifnull          159
	//*  23   43:aload_0         
	//*  24   44:getfield        #104 <Field int mActivePointerId>
	//*  25   47:iconst_m1       
	//*  26   48:icmple          159
			{
				velocitytracker.computeCurrentVelocity(1000, mCallback.getSwipeVelocityThreshold(mMaxSwipeVelocity));
	//   27   51:aload           7
	//   28   53:sipush          1000
	//   29   56:aload_0         
	//   30   57:getfield        #128 <Field ItemTouchHelper$Callback mCallback>
	//   31   60:aload_0         
	//   32   61:getfield        #154 <Field float mMaxSwipeVelocity>
	//   33   64:invokevirtual   #160 <Method float ItemTouchHelper$Callback.getSwipeVelocityThreshold(float)>
	//   34   67:invokevirtual   #166 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
				float f1 = mVelocityTracker.getXVelocity(mActivePointerId);
	//   35   70:aload_0         
	//   36   71:getfield        #152 <Field VelocityTracker mVelocityTracker>
	//   37   74:aload_0         
	//   38   75:getfield        #104 <Field int mActivePointerId>
	//   39   78:invokevirtual   #170 <Method float VelocityTracker.getXVelocity(int)>
	//   40   81:fstore          4
				f = mVelocityTracker.getYVelocity(mActivePointerId);
	//   41   83:aload_0         
	//   42   84:getfield        #152 <Field VelocityTracker mVelocityTracker>
	//   43   87:aload_0         
	//   44   88:getfield        #104 <Field int mActivePointerId>
	//   45   91:invokevirtual   #173 <Method float VelocityTracker.getYVelocity(int)>
	//   46   94:fstore_3        
				if(f1 <= 0.0F)
	//*  47   95:fload           4
	//*  48   97:fconst_0        
	//*  49   98:fcmpl           
	//*  50   99:ifle            105
	//*  51  102:goto            108
					byte1 = 4;
	//   52  105:iconst_4        
	//   53  106:istore          6
				f1 = Math.abs(f1);
	//   54  108:fload           4
	//   55  110:invokestatic    #178 <Method float Math.abs(float)>
	//   56  113:fstore          4
				if((byte1 & i) != 0 && byte0 == byte1 && f1 >= mCallback.getSwipeEscapeVelocity(mSwipeEscapeVelocity) && f1 > Math.abs(f))
	//*  57  115:iload           6
	//*  58  117:iload_2         
	//*  59  118:iand            
	//*  60  119:ifeq            159
	//*  61  122:iload           5
	//*  62  124:iload           6
	//*  63  126:icmpne          159
	//*  64  129:fload           4
	//*  65  131:aload_0         
	//*  66  132:getfield        #128 <Field ItemTouchHelper$Callback mCallback>
	//*  67  135:aload_0         
	//*  68  136:getfield        #180 <Field float mSwipeEscapeVelocity>
	//*  69  139:invokevirtual   #183 <Method float ItemTouchHelper$Callback.getSwipeEscapeVelocity(float)>
	//*  70  142:fcmpl           
	//*  71  143:iflt            159
	//*  72  146:fload           4
	//*  73  148:fload_3         
	//*  74  149:invokestatic    #178 <Method float Math.abs(float)>
	//*  75  152:fcmpl           
	//*  76  153:ifle            159
					return ((int) (byte1));
	//   77  156:iload           6
	//   78  158:ireturn         
			}
			f = mRecyclerView.getWidth();
	//   79  159:aload_0         
	//   80  160:getfield        #140 <Field RecyclerView mRecyclerView>
	//   81  163:invokevirtual   #187 <Method int RecyclerView.getWidth()>
	//   82  166:i2f             
	//   83  167:fstore_3        
			float f2 = mCallback.getSwipeThreshold(viewholder);
	//   84  168:aload_0         
	//   85  169:getfield        #128 <Field ItemTouchHelper$Callback mCallback>
	//   86  172:aload_1         
	//   87  173:invokevirtual   #191 <Method float ItemTouchHelper$Callback.getSwipeThreshold(android.support.v7.widget.RecyclerView$ViewHolder)>
	//   88  176:fstore          4
			if((i & byte0) != 0 && Math.abs(mDx) > f * f2)
	//*  89  178:iload_2         
	//*  90  179:iload           5
	//*  91  181:iand            
	//*  92  182:ifeq            203
	//*  93  185:aload_0         
	//*  94  186:getfield        #150 <Field float mDx>
	//*  95  189:invokestatic    #178 <Method float Math.abs(float)>
	//*  96  192:fload_3         
	//*  97  193:fload           4
	//*  98  195:fmul            
	//*  99  196:fcmpl           
	//* 100  197:ifle            203
				return ((int) (byte0));
	//  101  200:iload           5
	//  102  202:ireturn         
		}
		return 0;
	//  103  203:iconst_0        
	//  104  204:ireturn         
	}

	private int checkVerticalSwipe(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
	{
		if((i & 3) != 0)
	//*   0    0:iload_2         
	//*   1    1:iconst_3        
	//*   2    2:iand            
	//*   3    3:ifeq            200
		{
			float f = mDy;
	//    4    6:aload_0         
	//    5    7:getfield        #194 <Field float mDy>
	//    6   10:fstore_3        
			byte byte1 = 2;
	//    7   11:iconst_2        
	//    8   12:istore          6
			byte byte0;
			if(f > 0.0F)
	//*   9   14:fload_3         
	//*  10   15:fconst_0        
	//*  11   16:fcmpl           
	//*  12   17:ifle            26
				byte0 = 2;
	//   13   20:iconst_2        
	//   14   21:istore          5
			else
	//*  15   23:goto            29
				byte0 = 1;
	//   16   26:iconst_1        
	//   17   27:istore          5
			VelocityTracker velocitytracker = mVelocityTracker;
	//   18   29:aload_0         
	//   19   30:getfield        #152 <Field VelocityTracker mVelocityTracker>
	//   20   33:astore          7
			if(velocitytracker != null && mActivePointerId > -1)
	//*  21   35:aload           7
	//*  22   37:ifnull          156
	//*  23   40:aload_0         
	//*  24   41:getfield        #104 <Field int mActivePointerId>
	//*  25   44:iconst_m1       
	//*  26   45:icmple          156
			{
				velocitytracker.computeCurrentVelocity(1000, mCallback.getSwipeVelocityThreshold(mMaxSwipeVelocity));
	//   27   48:aload           7
	//   28   50:sipush          1000
	//   29   53:aload_0         
	//   30   54:getfield        #128 <Field ItemTouchHelper$Callback mCallback>
	//   31   57:aload_0         
	//   32   58:getfield        #154 <Field float mMaxSwipeVelocity>
	//   33   61:invokevirtual   #160 <Method float ItemTouchHelper$Callback.getSwipeVelocityThreshold(float)>
	//   34   64:invokevirtual   #166 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
				f = mVelocityTracker.getXVelocity(mActivePointerId);
	//   35   67:aload_0         
	//   36   68:getfield        #152 <Field VelocityTracker mVelocityTracker>
	//   37   71:aload_0         
	//   38   72:getfield        #104 <Field int mActivePointerId>
	//   39   75:invokevirtual   #170 <Method float VelocityTracker.getXVelocity(int)>
	//   40   78:fstore_3        
				float f1 = mVelocityTracker.getYVelocity(mActivePointerId);
	//   41   79:aload_0         
	//   42   80:getfield        #152 <Field VelocityTracker mVelocityTracker>
	//   43   83:aload_0         
	//   44   84:getfield        #104 <Field int mActivePointerId>
	//   45   87:invokevirtual   #173 <Method float VelocityTracker.getYVelocity(int)>
	//   46   90:fstore          4
				if(f1 <= 0.0F)
	//*  47   92:fload           4
	//*  48   94:fconst_0        
	//*  49   95:fcmpl           
	//*  50   96:ifle            102
	//*  51   99:goto            105
					byte1 = 1;
	//   52  102:iconst_1        
	//   53  103:istore          6
				f1 = Math.abs(f1);
	//   54  105:fload           4
	//   55  107:invokestatic    #178 <Method float Math.abs(float)>
	//   56  110:fstore          4
				if((byte1 & i) != 0 && byte1 == byte0 && f1 >= mCallback.getSwipeEscapeVelocity(mSwipeEscapeVelocity) && f1 > Math.abs(f))
	//*  57  112:iload           6
	//*  58  114:iload_2         
	//*  59  115:iand            
	//*  60  116:ifeq            156
	//*  61  119:iload           6
	//*  62  121:iload           5
	//*  63  123:icmpne          156
	//*  64  126:fload           4
	//*  65  128:aload_0         
	//*  66  129:getfield        #128 <Field ItemTouchHelper$Callback mCallback>
	//*  67  132:aload_0         
	//*  68  133:getfield        #180 <Field float mSwipeEscapeVelocity>
	//*  69  136:invokevirtual   #183 <Method float ItemTouchHelper$Callback.getSwipeEscapeVelocity(float)>
	//*  70  139:fcmpl           
	//*  71  140:iflt            156
	//*  72  143:fload           4
	//*  73  145:fload_3         
	//*  74  146:invokestatic    #178 <Method float Math.abs(float)>
	//*  75  149:fcmpl           
	//*  76  150:ifle            156
					return ((int) (byte1));
	//   77  153:iload           6
	//   78  155:ireturn         
			}
			f = mRecyclerView.getHeight();
	//   79  156:aload_0         
	//   80  157:getfield        #140 <Field RecyclerView mRecyclerView>
	//   81  160:invokevirtual   #197 <Method int RecyclerView.getHeight()>
	//   82  163:i2f             
	//   83  164:fstore_3        
			float f2 = mCallback.getSwipeThreshold(viewholder);
	//   84  165:aload_0         
	//   85  166:getfield        #128 <Field ItemTouchHelper$Callback mCallback>
	//   86  169:aload_1         
	//   87  170:invokevirtual   #191 <Method float ItemTouchHelper$Callback.getSwipeThreshold(android.support.v7.widget.RecyclerView$ViewHolder)>
	//   88  173:fstore          4
			if((i & byte0) != 0 && Math.abs(mDy) > f * f2)
	//*  89  175:iload_2         
	//*  90  176:iload           5
	//*  91  178:iand            
	//*  92  179:ifeq            200
	//*  93  182:aload_0         
	//*  94  183:getfield        #194 <Field float mDy>
	//*  95  186:invokestatic    #178 <Method float Math.abs(float)>
	//*  96  189:fload_3         
	//*  97  190:fload           4
	//*  98  192:fmul            
	//*  99  193:fcmpl           
	//* 100  194:ifle            200
				return ((int) (byte0));
	//  101  197:iload           5
	//  102  199:ireturn         
		}
		return 0;
	//  103  200:iconst_0        
	//  104  201:ireturn         
	}

	private void destroyCallbacks()
	{
		mRecyclerView.removeItemDecoration(((android.support.v7.widget.RecyclerView.ItemDecoration) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field RecyclerView mRecyclerView>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #202 <Method void RecyclerView.removeItemDecoration(android.support.v7.widget.RecyclerView$ItemDecoration)>
		mRecyclerView.removeOnItemTouchListener(mOnItemTouchListener);
	//    4    8:aload_0         
	//    5    9:getfield        #140 <Field RecyclerView mRecyclerView>
	//    6   12:aload_0         
	//    7   13:getfield        #126 <Field android.support.v7.widget.RecyclerView$OnItemTouchListener mOnItemTouchListener>
	//    8   16:invokevirtual   #206 <Method void RecyclerView.removeOnItemTouchListener(android.support.v7.widget.RecyclerView$OnItemTouchListener)>
		mRecyclerView.removeOnChildAttachStateChangeListener(((android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener) (this)));
	//    9   19:aload_0         
	//   10   20:getfield        #140 <Field RecyclerView mRecyclerView>
	//   11   23:aload_0         
	//   12   24:invokevirtual   #210 <Method void RecyclerView.removeOnChildAttachStateChangeListener(android.support.v7.widget.RecyclerView$OnChildAttachStateChangeListener)>
		for(int i = mRecoverAnimations.size() - 1; i >= 0; i--)
	//*  13   27:aload_0         
	//*  14   28:getfield        #108 <Field List mRecoverAnimations>
	//*  15   31:invokeinterface #215 <Method int List.size()>
	//*  16   36:iconst_1        
	//*  17   37:isub            
	//*  18   38:istore_1        
	//*  19   39:iload_1         
	//*  20   40:iflt            79
		{
			RecoverAnimation recoveranimation = (RecoverAnimation)mRecoverAnimations.get(0);
	//   21   43:aload_0         
	//   22   44:getfield        #108 <Field List mRecoverAnimations>
	//   23   47:iconst_0        
	//   24   48:invokeinterface #219 <Method Object List.get(int)>
	//   25   53:checkcast       #221 <Class ItemTouchHelper$RecoverAnimation>
	//   26   56:astore_2        
			mCallback.clearView(mRecyclerView, recoveranimation.mViewHolder);
	//   27   57:aload_0         
	//   28   58:getfield        #128 <Field ItemTouchHelper$Callback mCallback>
	//   29   61:aload_0         
	//   30   62:getfield        #140 <Field RecyclerView mRecyclerView>
	//   31   65:aload_2         
	//   32   66:getfield        #224 <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
	//   33   69:invokevirtual   #228 <Method void ItemTouchHelper$Callback.clearView(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
		}

	//   34   72:iload_1         
	//   35   73:iconst_1        
	//   36   74:isub            
	//   37   75:istore_1        
	//*  38   76:goto            39
		mRecoverAnimations.clear();
	//   39   79:aload_0         
	//   40   80:getfield        #108 <Field List mRecoverAnimations>
	//   41   83:invokeinterface #231 <Method void List.clear()>
		mOverdrawChild = null;
	//   42   88:aload_0         
	//   43   89:aconst_null     
	//   44   90:putfield        #119 <Field View mOverdrawChild>
		mOverdrawChildPosition = -1;
	//   45   93:aload_0         
	//   46   94:iconst_m1       
	//   47   95:putfield        #121 <Field int mOverdrawChildPosition>
		releaseVelocityTracker();
	//   48   98:aload_0         
	//   49   99:invokespecial   #234 <Method void releaseVelocityTracker()>
		stopGestureDetection();
	//   50  102:aload_0         
	//   51  103:invokespecial   #237 <Method void stopGestureDetection()>
	//   52  106:return          
	}

	private List findSwapTargets(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
	{
		Object obj = ((Object) (viewholder));
	//    0    0:aload_1         
	//    1    1:astore          14
		List list = mSwapTargets;
	//    2    3:aload_0         
	//    3    4:getfield        #241 <Field List mSwapTargets>
	//    4    7:astore          15
		if(list == null)
	//*   5    9:aload           15
	//*   6   11:ifnonnull       39
		{
			mSwapTargets = ((List) (new ArrayList()));
	//    7   14:aload_0         
	//    8   15:new             #95  <Class ArrayList>
	//    9   18:dup             
	//   10   19:invokespecial   #96  <Method void ArrayList()>
	//   11   22:putfield        #241 <Field List mSwapTargets>
			mDistances = ((List) (new ArrayList()));
	//   12   25:aload_0         
	//   13   26:new             #95  <Class ArrayList>
	//   14   29:dup             
	//   15   30:invokespecial   #96  <Method void ArrayList()>
	//   16   33:putfield        #243 <Field List mDistances>
		} else
	//*  17   36:goto            55
		{
			list.clear();
	//   18   39:aload           15
	//   19   41:invokeinterface #231 <Method void List.clear()>
			mDistances.clear();
	//   20   46:aload_0         
	//   21   47:getfield        #243 <Field List mDistances>
	//   22   50:invokeinterface #231 <Method void List.clear()>
		}
		int k = mCallback.getBoundingBoxMargin();
	//   23   55:aload_0         
	//   24   56:getfield        #128 <Field ItemTouchHelper$Callback mCallback>
	//   25   59:invokevirtual   #246 <Method int ItemTouchHelper$Callback.getBoundingBoxMargin()>
	//   26   62:istore_3        
		int j1 = Math.round(mSelectedStartX + mDx) - k;
	//   27   63:aload_0         
	//   28   64:getfield        #248 <Field float mSelectedStartX>
	//   29   67:aload_0         
	//   30   68:getfield        #150 <Field float mDx>
	//   31   71:fadd            
	//   32   72:invokestatic    #252 <Method int Math.round(float)>
	//   33   75:iload_3         
	//   34   76:isub            
	//   35   77:istore          5
		int k1 = Math.round(mSelectedStartY + mDy) - k;
	//   36   79:aload_0         
	//   37   80:getfield        #254 <Field float mSelectedStartY>
	//   38   83:aload_0         
	//   39   84:getfield        #194 <Field float mDy>
	//   40   87:fadd            
	//   41   88:invokestatic    #252 <Method int Math.round(float)>
	//   42   91:iload_3         
	//   43   92:isub            
	//   44   93:istore          6
		int i = ((android.support.v7.widget.RecyclerView.ViewHolder) (obj)).itemView.getWidth();
	//   45   95:aload           14
	//   46   97:getfield        #259 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   47  100:invokevirtual   #262 <Method int View.getWidth()>
	//   48  103:istore_2        
		k *= 2;
	//   49  104:iload_3         
	//   50  105:iconst_2        
	//   51  106:imul            
	//   52  107:istore_3        
		int l1 = i + j1 + k;
	//   53  108:iload_2         
	//   54  109:iload           5
	//   55  111:iadd            
	//   56  112:iload_3         
	//   57  113:iadd            
	//   58  114:istore          7
		int i2 = ((android.support.v7.widget.RecyclerView.ViewHolder) (obj)).itemView.getHeight() + k1 + k;
	//   59  116:aload           14
	//   60  118:getfield        #259 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   61  121:invokevirtual   #263 <Method int View.getHeight()>
	//   62  124:iload           6
	//   63  126:iadd            
	//   64  127:iload_3         
	//   65  128:iadd            
	//   66  129:istore          8
		int j2 = (j1 + l1) / 2;
	//   67  131:iload           5
	//   68  133:iload           7
	//   69  135:iadd            
	//   70  136:iconst_2        
	//   71  137:idiv            
	//   72  138:istore          9
		int k2 = (k1 + i2) / 2;
	//   73  140:iload           6
	//   74  142:iload           8
	//   75  144:iadd            
	//   76  145:iconst_2        
	//   77  146:idiv            
	//   78  147:istore          10
		obj = ((Object) (mRecyclerView.getLayoutManager()));
	//   79  149:aload_0         
	//   80  150:getfield        #140 <Field RecyclerView mRecyclerView>
	//   81  153:invokevirtual   #267 <Method android.support.v7.widget.RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//   82  156:astore          14
		int l2 = ((android.support.v7.widget.RecyclerView.LayoutManager) (obj)).getChildCount();
	//   83  158:aload           14
	//   84  160:invokevirtual   #272 <Method int android.support.v7.widget.RecyclerView$LayoutManager.getChildCount()>
	//   85  163:istore          11
		for(int j = 0; j < l2; j++)
	//*  86  165:iconst_0        
	//*  87  166:istore_2        
	//*  88  167:iload_2         
	//*  89  168:iload           11
	//*  90  170:icmpge          411
		{
			View view = ((android.support.v7.widget.RecyclerView.LayoutManager) (obj)).getChildAt(j);
	//   91  173:aload           14
	//   92  175:iload_2         
	//   93  176:invokevirtual   #276 <Method View android.support.v7.widget.RecyclerView$LayoutManager.getChildAt(int)>
	//   94  179:astore          15
			if(view == viewholder.itemView || view.getBottom() < k1 || view.getTop() > i2 || view.getRight() < j1 || view.getLeft() > l1)
	//*  95  181:aload           15
	//*  96  183:aload_1         
	//*  97  184:getfield        #259 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  98  187:if_acmpne       193
	//*  99  190:goto            404
	//* 100  193:aload           15
	//* 101  195:invokevirtual   #279 <Method int View.getBottom()>
	//* 102  198:iload           6
	//* 103  200:icmplt          404
	//* 104  203:aload           15
	//* 105  205:invokevirtual   #282 <Method int View.getTop()>
	//* 106  208:iload           8
	//* 107  210:icmpgt          404
	//* 108  213:aload           15
	//* 109  215:invokevirtual   #285 <Method int View.getRight()>
	//* 110  218:iload           5
	//* 111  220:icmplt          404
	//* 112  223:aload           15
	//* 113  225:invokevirtual   #288 <Method int View.getLeft()>
	//* 114  228:iload           7
	//* 115  230:icmple          236
				continue;
	//  116  233:goto            404
			android.support.v7.widget.RecyclerView.ViewHolder viewholder1 = mRecyclerView.getChildViewHolder(view);
	//  117  236:aload_0         
	//  118  237:getfield        #140 <Field RecyclerView mRecyclerView>
	//  119  240:aload           15
	//  120  242:invokevirtual   #292 <Method android.support.v7.widget.RecyclerView$ViewHolder RecyclerView.getChildViewHolder(View)>
	//  121  245:astore          16
			if(!mCallback.canDropOver(mRecyclerView, mSelected, viewholder1))
				continue;
	//  122  247:aload_0         
	//  123  248:getfield        #128 <Field ItemTouchHelper$Callback mCallback>
	//  124  251:aload_0         
	//  125  252:getfield        #140 <Field RecyclerView mRecyclerView>
	//  126  255:aload_0         
	//  127  256:getfield        #102 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//  128  259:aload           16
	//  129  261:invokevirtual   #296 <Method boolean ItemTouchHelper$Callback.canDropOver(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, android.support.v7.widget.RecyclerView$ViewHolder)>
	//  130  264:ifeq            404
			int l = Math.abs(j2 - (view.getLeft() + view.getRight()) / 2);
	//  131  267:iload           9
	//  132  269:aload           15
	//  133  271:invokevirtual   #288 <Method int View.getLeft()>
	//  134  274:aload           15
	//  135  276:invokevirtual   #285 <Method int View.getRight()>
	//  136  279:iadd            
	//  137  280:iconst_2        
	//  138  281:idiv            
	//  139  282:isub            
	//  140  283:invokestatic    #299 <Method int Math.abs(int)>
	//  141  286:istore_3        
			int i1 = Math.abs(k2 - (view.getTop() + view.getBottom()) / 2);
	//  142  287:iload           10
	//  143  289:aload           15
	//  144  291:invokevirtual   #282 <Method int View.getTop()>
	//  145  294:aload           15
	//  146  296:invokevirtual   #279 <Method int View.getBottom()>
	//  147  299:iadd            
	//  148  300:iconst_2        
	//  149  301:idiv            
	//  150  302:isub            
	//  151  303:invokestatic    #299 <Method int Math.abs(int)>
	//  152  306:istore          4
			int i3 = l * l + i1 * i1;
	//  153  308:iload_3         
	//  154  309:iload_3         
	//  155  310:imul            
	//  156  311:iload           4
	//  157  313:iload           4
	//  158  315:imul            
	//  159  316:iadd            
	//  160  317:istore          12
			int j3 = mSwapTargets.size();
	//  161  319:aload_0         
	//  162  320:getfield        #241 <Field List mSwapTargets>
	//  163  323:invokeinterface #215 <Method int List.size()>
	//  164  328:istore          13
			l = 0;
	//  165  330:iconst_0        
	//  166  331:istore_3        
			i1 = 0;
	//  167  332:iconst_0        
	//  168  333:istore          4
			for(; l < j3 && i3 > ((Integer)mDistances.get(l)).intValue(); l++)
	//* 169  335:iload_3         
	//* 170  336:iload           13
	//* 171  338:icmpge          375
	//* 172  341:iload           12
	//* 173  343:aload_0         
	//* 174  344:getfield        #243 <Field List mDistances>
	//* 175  347:iload_3         
	//* 176  348:invokeinterface #219 <Method Object List.get(int)>
	//* 177  353:checkcast       #301 <Class Integer>
	//* 178  356:invokevirtual   #304 <Method int Integer.intValue()>
	//* 179  359:icmple          375
				i1++;
	//  180  362:iload           4
	//  181  364:iconst_1        
	//  182  365:iadd            
	//  183  366:istore          4

	//  184  368:iload_3         
	//  185  369:iconst_1        
	//  186  370:iadd            
	//  187  371:istore_3        
	//* 188  372:goto            335
			mSwapTargets.add(i1, ((Object) (viewholder1)));
	//  189  375:aload_0         
	//  190  376:getfield        #241 <Field List mSwapTargets>
	//  191  379:iload           4
	//  192  381:aload           16
	//  193  383:invokeinterface #308 <Method void List.add(int, Object)>
			mDistances.add(i1, ((Object) (Integer.valueOf(i3))));
	//  194  388:aload_0         
	//  195  389:getfield        #243 <Field List mDistances>
	//  196  392:iload           4
	//  197  394:iload           12
	//  198  396:invokestatic    #312 <Method Integer Integer.valueOf(int)>
	//  199  399:invokeinterface #308 <Method void List.add(int, Object)>
		}

	//  200  404:iload_2         
	//  201  405:iconst_1        
	//  202  406:iadd            
	//  203  407:istore_2        
	//* 204  408:goto            167
		return mSwapTargets;
	//  205  411:aload_0         
	//  206  412:getfield        #241 <Field List mSwapTargets>
	//  207  415:areturn         
	}

	private android.support.v7.widget.RecyclerView.ViewHolder findSwipedView(MotionEvent motionevent)
	{
		android.support.v7.widget.RecyclerView.LayoutManager layoutmanager = mRecyclerView.getLayoutManager();
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field RecyclerView mRecyclerView>
	//    2    4:invokevirtual   #267 <Method android.support.v7.widget.RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//    3    7:astore          7
		int i = mActivePointerId;
	//    4    9:aload_0         
	//    5   10:getfield        #104 <Field int mActivePointerId>
	//    6   13:istore          6
		if(i == -1)
	//*   7   15:iload           6
	//*   8   17:iconst_m1       
	//*   9   18:icmpne          23
			return null;
	//   10   21:aconst_null     
	//   11   22:areturn         
		i = motionevent.findPointerIndex(i);
	//   12   23:aload_1         
	//   13   24:iload           6
	//   14   26:invokevirtual   #319 <Method int MotionEvent.findPointerIndex(int)>
	//   15   29:istore          6
		float f2 = motionevent.getX(i);
	//   16   31:aload_1         
	//   17   32:iload           6
	//   18   34:invokevirtual   #322 <Method float MotionEvent.getX(int)>
	//   19   37:fstore          4
		float f3 = mInitialTouchX;
	//   20   39:aload_0         
	//   21   40:getfield        #324 <Field float mInitialTouchX>
	//   22   43:fstore          5
		float f = motionevent.getY(i);
	//   23   45:aload_1         
	//   24   46:iload           6
	//   25   48:invokevirtual   #327 <Method float MotionEvent.getY(int)>
	//   26   51:fstore_2        
		float f1 = mInitialTouchY;
	//   27   52:aload_0         
	//   28   53:getfield        #329 <Field float mInitialTouchY>
	//   29   56:fstore_3        
		f2 = Math.abs(f2 - f3);
	//   30   57:fload           4
	//   31   59:fload           5
	//   32   61:fsub            
	//   33   62:invokestatic    #178 <Method float Math.abs(float)>
	//   34   65:fstore          4
		f = Math.abs(f - f1);
	//   35   67:fload_2         
	//   36   68:fload_3         
	//   37   69:fsub            
	//   38   70:invokestatic    #178 <Method float Math.abs(float)>
	//   39   73:fstore_2        
		i = mSlop;
	//   40   74:aload_0         
	//   41   75:getfield        #331 <Field int mSlop>
	//   42   78:istore          6
		if(f2 < (float)i && f < (float)i)
	//*  43   80:fload           4
	//*  44   82:iload           6
	//*  45   84:i2f             
	//*  46   85:fcmpg           
	//*  47   86:ifge            99
	//*  48   89:fload_2         
	//*  49   90:iload           6
	//*  50   92:i2f             
	//*  51   93:fcmpg           
	//*  52   94:ifge            99
			return null;
	//   53   97:aconst_null     
	//   54   98:areturn         
		if(f2 > f && layoutmanager.canScrollHorizontally())
	//*  55   99:fload           4
	//*  56  101:fload_2         
	//*  57  102:fcmpl           
	//*  58  103:ifle            116
	//*  59  106:aload           7
	//*  60  108:invokevirtual   #335 <Method boolean android.support.v7.widget.RecyclerView$LayoutManager.canScrollHorizontally()>
	//*  61  111:ifeq            116
			return null;
	//   62  114:aconst_null     
	//   63  115:areturn         
		if(f > f2 && layoutmanager.canScrollVertically())
	//*  64  116:fload_2         
	//*  65  117:fload           4
	//*  66  119:fcmpl           
	//*  67  120:ifle            133
	//*  68  123:aload           7
	//*  69  125:invokevirtual   #338 <Method boolean android.support.v7.widget.RecyclerView$LayoutManager.canScrollVertically()>
	//*  70  128:ifeq            133
			return null;
	//   71  131:aconst_null     
	//   72  132:areturn         
		motionevent = ((MotionEvent) (findChildView(motionevent)));
	//   73  133:aload_0         
	//   74  134:aload_1         
	//   75  135:invokevirtual   #342 <Method View findChildView(MotionEvent)>
	//   76  138:astore_1        
		if(motionevent == null)
	//*  77  139:aload_1         
	//*  78  140:ifnonnull       145
			return null;
	//   79  143:aconst_null     
	//   80  144:areturn         
		else
			return mRecyclerView.getChildViewHolder(((View) (motionevent)));
	//   81  145:aload_0         
	//   82  146:getfield        #140 <Field RecyclerView mRecyclerView>
	//   83  149:aload_1         
	//   84  150:invokevirtual   #292 <Method android.support.v7.widget.RecyclerView$ViewHolder RecyclerView.getChildViewHolder(View)>
	//   85  153:areturn         
	}

	private void getSelectedDxDy(float af[])
	{
		if((mSelectedFlags & 0xc) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #346 <Field int mSelectedFlags>
	//*   2    4:bipush          12
	//*   3    6:iand            
	//*   4    7:ifeq            37
			af[0] = (mSelectedStartX + mDx) - (float)mSelected.itemView.getLeft();
	//    5   10:aload_1         
	//    6   11:iconst_0        
	//    7   12:aload_0         
	//    8   13:getfield        #248 <Field float mSelectedStartX>
	//    9   16:aload_0         
	//   10   17:getfield        #150 <Field float mDx>
	//   11   20:fadd            
	//   12   21:aload_0         
	//   13   22:getfield        #102 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//   14   25:getfield        #259 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   15   28:invokevirtual   #288 <Method int View.getLeft()>
	//   16   31:i2f             
	//   17   32:fsub            
	//   18   33:fastore         
		else
	//*  19   34:goto            50
			af[0] = mSelected.itemView.getTranslationX();
	//   20   37:aload_1         
	//   21   38:iconst_0        
	//   22   39:aload_0         
	//   23   40:getfield        #102 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//   24   43:getfield        #259 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   25   46:invokevirtual   #350 <Method float View.getTranslationX()>
	//   26   49:fastore         
		if((mSelectedFlags & 3) != 0)
	//*  27   50:aload_0         
	//*  28   51:getfield        #346 <Field int mSelectedFlags>
	//*  29   54:iconst_3        
	//*  30   55:iand            
	//*  31   56:ifeq            84
		{
			af[1] = (mSelectedStartY + mDy) - (float)mSelected.itemView.getTop();
	//   32   59:aload_1         
	//   33   60:iconst_1        
	//   34   61:aload_0         
	//   35   62:getfield        #254 <Field float mSelectedStartY>
	//   36   65:aload_0         
	//   37   66:getfield        #194 <Field float mDy>
	//   38   69:fadd            
	//   39   70:aload_0         
	//   40   71:getfield        #102 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//   41   74:getfield        #259 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   42   77:invokevirtual   #282 <Method int View.getTop()>
	//   43   80:i2f             
	//   44   81:fsub            
	//   45   82:fastore         
			return;
	//   46   83:return          
		} else
		{
			af[1] = mSelected.itemView.getTranslationY();
	//   47   84:aload_1         
	//   48   85:iconst_1        
	//   49   86:aload_0         
	//   50   87:getfield        #102 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//   51   90:getfield        #259 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   52   93:invokevirtual   #353 <Method float View.getTranslationY()>
	//   53   96:fastore         
			return;
	//   54   97:return          
		}
	}

	private static boolean hitTest(View view, float f, float f1, float f2, float f3)
	{
		return f >= f2 && f <= f2 + (float)view.getWidth() && f1 >= f3 && f1 <= f3 + (float)view.getHeight();
	//    0    0:fload_1         
	//    1    1:fload_3         
	//    2    2:fcmpl           
	//    3    3:iflt            40
	//    4    6:fload_1         
	//    5    7:fload_3         
	//    6    8:aload_0         
	//    7    9:invokevirtual   #262 <Method int View.getWidth()>
	//    8   12:i2f             
	//    9   13:fadd            
	//   10   14:fcmpg           
	//   11   15:ifgt            40
	//   12   18:fload_2         
	//   13   19:fload           4
	//   14   21:fcmpl           
	//   15   22:iflt            40
	//   16   25:fload_2         
	//   17   26:fload           4
	//   18   28:aload_0         
	//   19   29:invokevirtual   #263 <Method int View.getHeight()>
	//   20   32:i2f             
	//   21   33:fadd            
	//   22   34:fcmpg           
	//   23   35:ifgt            40
	//   24   38:iconst_1        
	//   25   39:ireturn         
	//   26   40:iconst_0        
	//   27   41:ireturn         
	}

	private void releaseVelocityTracker()
	{
		VelocityTracker velocitytracker = mVelocityTracker;
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field VelocityTracker mVelocityTracker>
	//    2    4:astore_1        
		if(velocitytracker != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
		{
			velocitytracker.recycle();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #358 <Method void VelocityTracker.recycle()>
			mVelocityTracker = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #152 <Field VelocityTracker mVelocityTracker>
		}
	//   10   18:return          
	}

	private void setupCallbacks()
	{
		mSlop = ViewConfiguration.get(mRecyclerView.getContext()).getScaledTouchSlop();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #140 <Field RecyclerView mRecyclerView>
	//    3    5:invokevirtual   #363 <Method android.content.Context RecyclerView.getContext()>
	//    4    8:invokestatic    #368 <Method ViewConfiguration ViewConfiguration.get(android.content.Context)>
	//    5   11:invokevirtual   #371 <Method int ViewConfiguration.getScaledTouchSlop()>
	//    6   14:putfield        #331 <Field int mSlop>
		mRecyclerView.addItemDecoration(((android.support.v7.widget.RecyclerView.ItemDecoration) (this)));
	//    7   17:aload_0         
	//    8   18:getfield        #140 <Field RecyclerView mRecyclerView>
	//    9   21:aload_0         
	//   10   22:invokevirtual   #374 <Method void RecyclerView.addItemDecoration(android.support.v7.widget.RecyclerView$ItemDecoration)>
		mRecyclerView.addOnItemTouchListener(mOnItemTouchListener);
	//   11   25:aload_0         
	//   12   26:getfield        #140 <Field RecyclerView mRecyclerView>
	//   13   29:aload_0         
	//   14   30:getfield        #126 <Field android.support.v7.widget.RecyclerView$OnItemTouchListener mOnItemTouchListener>
	//   15   33:invokevirtual   #377 <Method void RecyclerView.addOnItemTouchListener(android.support.v7.widget.RecyclerView$OnItemTouchListener)>
		mRecyclerView.addOnChildAttachStateChangeListener(((android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener) (this)));
	//   16   36:aload_0         
	//   17   37:getfield        #140 <Field RecyclerView mRecyclerView>
	//   18   40:aload_0         
	//   19   41:invokevirtual   #380 <Method void RecyclerView.addOnChildAttachStateChangeListener(android.support.v7.widget.RecyclerView$OnChildAttachStateChangeListener)>
		startGestureDetection();
	//   20   44:aload_0         
	//   21   45:invokespecial   #383 <Method void startGestureDetection()>
	//   22   48:return          
	}

	private void startGestureDetection()
	{
		mItemTouchHelperGestureListener = new ItemTouchHelperGestureListener();
	//    0    0:aload_0         
	//    1    1:new             #385 <Class ItemTouchHelper$ItemTouchHelperGestureListener>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #386 <Method void ItemTouchHelper$ItemTouchHelperGestureListener(ItemTouchHelper)>
	//    5    9:putfield        #388 <Field ItemTouchHelper$ItemTouchHelperGestureListener mItemTouchHelperGestureListener>
		mGestureDetector = new g(mRecyclerView.getContext(), ((android.view.GestureDetector.OnGestureListener) (mItemTouchHelperGestureListener)));
	//    6   12:aload_0         
	//    7   13:new             #390 <Class g>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #140 <Field RecyclerView mRecyclerView>
	//   11   21:invokevirtual   #363 <Method android.content.Context RecyclerView.getContext()>
	//   12   24:aload_0         
	//   13   25:getfield        #388 <Field ItemTouchHelper$ItemTouchHelperGestureListener mItemTouchHelperGestureListener>
	//   14   28:invokespecial   #393 <Method void g(android.content.Context, android.view.GestureDetector$OnGestureListener)>
	//   15   31:putfield        #395 <Field g mGestureDetector>
	//   16   34:return          
	}

	private void stopGestureDetection()
	{
		ItemTouchHelperGestureListener itemtouchhelpergesturelistener = mItemTouchHelperGestureListener;
	//    0    0:aload_0         
	//    1    1:getfield        #388 <Field ItemTouchHelper$ItemTouchHelperGestureListener mItemTouchHelperGestureListener>
	//    2    4:astore_1        
		if(itemtouchhelpergesturelistener != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
		{
			itemtouchhelpergesturelistener.doNotReactToLongPress();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #398 <Method void ItemTouchHelper$ItemTouchHelperGestureListener.doNotReactToLongPress()>
			mItemTouchHelperGestureListener = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #388 <Field ItemTouchHelper$ItemTouchHelperGestureListener mItemTouchHelperGestureListener>
		}
		if(mGestureDetector != null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #395 <Field g mGestureDetector>
	//*  12   22:ifnull          30
			mGestureDetector = null;
	//   13   25:aload_0         
	//   14   26:aconst_null     
	//   15   27:putfield        #395 <Field g mGestureDetector>
	//   16   30:return          
	}

	private int swipeIfNecessary(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
	{
		if(mActionState == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #106 <Field int mActionState>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          10
			return 0;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		int j = mCallback.getMovementFlags(mRecyclerView, viewholder);
	//    6   10:aload_0         
	//    7   11:getfield        #128 <Field ItemTouchHelper$Callback mCallback>
	//    8   14:aload_0         
	//    9   15:getfield        #140 <Field RecyclerView mRecyclerView>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #404 <Method int ItemTouchHelper$Callback.getMovementFlags(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
	//   12   22:istore_3        
		int i = (mCallback.convertToAbsoluteDirection(j, ac.f(((View) (mRecyclerView)))) & 0xff00) >> 8;
	//   13   23:aload_0         
	//   14   24:getfield        #128 <Field ItemTouchHelper$Callback mCallback>
	//   15   27:iload_3         
	//   16   28:aload_0         
	//   17   29:getfield        #140 <Field RecyclerView mRecyclerView>
	//   18   32:invokestatic    #410 <Method int ac.f(View)>
	//   19   35:invokevirtual   #414 <Method int ItemTouchHelper$Callback.convertToAbsoluteDirection(int, int)>
	//   20   38:ldc1            #13  <Int 65280>
	//   21   40:iand            
	//   22   41:bipush          8
	//   23   43:ishr            
	//   24   44:istore_2        
		if(i == 0)
	//*  25   45:iload_2         
	//*  26   46:ifne            51
			return 0;
	//   27   49:iconst_0        
	//   28   50:ireturn         
		j = (j & 0xff00) >> 8;
	//   29   51:iload_3         
	//   30   52:ldc1            #13  <Int 65280>
	//   31   54:iand            
	//   32   55:bipush          8
	//   33   57:ishr            
	//   34   58:istore_3        
		if(Math.abs(mDx) > Math.abs(mDy))
	//*  35   59:aload_0         
	//*  36   60:getfield        #150 <Field float mDx>
	//*  37   63:invokestatic    #178 <Method float Math.abs(float)>
	//*  38   66:aload_0         
	//*  39   67:getfield        #194 <Field float mDy>
	//*  40   70:invokestatic    #178 <Method float Math.abs(float)>
	//*  41   73:fcmpl           
	//*  42   74:ifle            126
		{
			int k = checkHorizontalSwipe(viewholder, i);
	//   43   77:aload_0         
	//   44   78:aload_1         
	//   45   79:iload_2         
	//   46   80:invokespecial   #416 <Method int checkHorizontalSwipe(android.support.v7.widget.RecyclerView$ViewHolder, int)>
	//   47   83:istore          4
			if(k > 0)
	//*  48   85:iload           4
	//*  49   87:ifle            113
				if((j & k) == 0)
	//*  50   90:iload_3         
	//*  51   91:iload           4
	//*  52   93:iand            
	//*  53   94:ifne            110
					return Callback.convertToRelativeDirection(k, ac.f(((View) (mRecyclerView))));
	//   54   97:iload           4
	//   55   99:aload_0         
	//   56  100:getfield        #140 <Field RecyclerView mRecyclerView>
	//   57  103:invokestatic    #410 <Method int ac.f(View)>
	//   58  106:invokestatic    #419 <Method int ItemTouchHelper$Callback.convertToRelativeDirection(int, int)>
	//   59  109:ireturn         
				else
					return k;
	//   60  110:iload           4
	//   61  112:ireturn         
			i = checkVerticalSwipe(viewholder, i);
	//   62  113:aload_0         
	//   63  114:aload_1         
	//   64  115:iload_2         
	//   65  116:invokespecial   #421 <Method int checkVerticalSwipe(android.support.v7.widget.RecyclerView$ViewHolder, int)>
	//   66  119:istore_2        
			if(i > 0)
	//*  67  120:iload_2         
	//*  68  121:ifle            173
				return i;
	//   69  124:iload_2         
	//   70  125:ireturn         
		} else
		{
			int l = checkVerticalSwipe(viewholder, i);
	//   71  126:aload_0         
	//   72  127:aload_1         
	//   73  128:iload_2         
	//   74  129:invokespecial   #421 <Method int checkVerticalSwipe(android.support.v7.widget.RecyclerView$ViewHolder, int)>
	//   75  132:istore          4
			if(l > 0)
	//*  76  134:iload           4
	//*  77  136:ifle            142
				return l;
	//   78  139:iload           4
	//   79  141:ireturn         
			i = checkHorizontalSwipe(viewholder, i);
	//   80  142:aload_0         
	//   81  143:aload_1         
	//   82  144:iload_2         
	//   83  145:invokespecial   #416 <Method int checkHorizontalSwipe(android.support.v7.widget.RecyclerView$ViewHolder, int)>
	//   84  148:istore_2        
			if(i > 0)
	//*  85  149:iload_2         
	//*  86  150:ifle            173
				if((j & i) == 0)
	//*  87  153:iload_3         
	//*  88  154:iload_2         
	//*  89  155:iand            
	//*  90  156:ifne            171
					return Callback.convertToRelativeDirection(i, ac.f(((View) (mRecyclerView))));
	//   91  159:iload_2         
	//   92  160:aload_0         
	//   93  161:getfield        #140 <Field RecyclerView mRecyclerView>
	//   94  164:invokestatic    #410 <Method int ac.f(View)>
	//   95  167:invokestatic    #419 <Method int ItemTouchHelper$Callback.convertToRelativeDirection(int, int)>
	//   96  170:ireturn         
				else
					return i;
	//   97  171:iload_2         
	//   98  172:ireturn         
		}
		return 0;
	//   99  173:iconst_0        
	//  100  174:ireturn         
	}

	public void attachToRecyclerView(RecyclerView recyclerview)
	{
		RecyclerView recyclerview1 = mRecyclerView;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field RecyclerView mRecyclerView>
	//    2    4:astore_2        
		if(recyclerview1 == recyclerview)
	//*   3    5:aload_2         
	//*   4    6:aload_1         
	//*   5    7:if_acmpne       11
			return;
	//    6   10:return          
		if(recyclerview1 != null)
	//*   7   11:aload_2         
	//*   8   12:ifnull          19
			destroyCallbacks();
	//    9   15:aload_0         
	//   10   16:invokespecial   #425 <Method void destroyCallbacks()>
		mRecyclerView = recyclerview;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #140 <Field RecyclerView mRecyclerView>
		if(recyclerview != null)
	//*  14   24:aload_1         
	//*  15   25:ifnull          59
		{
			recyclerview = ((RecyclerView) (recyclerview.getResources()));
	//   16   28:aload_1         
	//   17   29:invokevirtual   #429 <Method Resources RecyclerView.getResources()>
	//   18   32:astore_1        
			mSwipeEscapeVelocity = ((Resources) (recyclerview)).getDimension(android.support.v7.recyclerview.R.dimen.item_touch_helper_swipe_escape_velocity);
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:getstatic       #434 <Field int android.support.v7.recyclerview.R$dimen.item_touch_helper_swipe_escape_velocity>
	//   22   38:invokevirtual   #439 <Method float Resources.getDimension(int)>
	//   23   41:putfield        #180 <Field float mSwipeEscapeVelocity>
			mMaxSwipeVelocity = ((Resources) (recyclerview)).getDimension(android.support.v7.recyclerview.R.dimen.item_touch_helper_swipe_escape_max_velocity);
	//   24   44:aload_0         
	//   25   45:aload_1         
	//   26   46:getstatic       #442 <Field int android.support.v7.recyclerview.R$dimen.item_touch_helper_swipe_escape_max_velocity>
	//   27   49:invokevirtual   #439 <Method float Resources.getDimension(int)>
	//   28   52:putfield        #154 <Field float mMaxSwipeVelocity>
			setupCallbacks();
	//   29   55:aload_0         
	//   30   56:invokespecial   #444 <Method void setupCallbacks()>
		}
	//   31   59:return          
	}

	void checkSelectForSwipe(int i, MotionEvent motionevent, int j)
	{
		if(mSelected == null && i == 2 && mActionState != 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//*   2    4:ifnonnull       241
	//*   3    7:iload_1         
	//*   4    8:iconst_2        
	//*   5    9:icmpne          241
	//*   6   12:aload_0         
	//*   7   13:getfield        #106 <Field int mActionState>
	//*   8   16:iconst_2        
	//*   9   17:icmpeq          241
		{
			if(!mCallback.isItemViewSwipeEnabled())
	//*  10   20:aload_0         
	//*  11   21:getfield        #128 <Field ItemTouchHelper$Callback mCallback>
	//*  12   24:invokevirtual   #449 <Method boolean ItemTouchHelper$Callback.isItemViewSwipeEnabled()>
	//*  13   27:ifne            31
				return;
	//   14   30:return          
			if(mRecyclerView.getScrollState() == 1)
	//*  15   31:aload_0         
	//*  16   32:getfield        #140 <Field RecyclerView mRecyclerView>
	//*  17   35:invokevirtual   #452 <Method int RecyclerView.getScrollState()>
	//*  18   38:iconst_1        
	//*  19   39:icmpne          43
				return;
	//   20   42:return          
			android.support.v7.widget.RecyclerView.ViewHolder viewholder = findSwipedView(motionevent);
	//   21   43:aload_0         
	//   22   44:aload_2         
	//   23   45:invokespecial   #454 <Method android.support.v7.widget.RecyclerView$ViewHolder findSwipedView(MotionEvent)>
	//   24   48:astore          8
			if(viewholder == null)
	//*  25   50:aload           8
	//*  26   52:ifnonnull       56
				return;
	//   27   55:return          
			i = (mCallback.getAbsoluteMovementFlags(mRecyclerView, viewholder) & 0xff00) >> 8;
	//   28   56:aload_0         
	//   29   57:getfield        #128 <Field ItemTouchHelper$Callback mCallback>
	//   30   60:aload_0         
	//   31   61:getfield        #140 <Field RecyclerView mRecyclerView>
	//   32   64:aload           8
	//   33   66:invokevirtual   #457 <Method int ItemTouchHelper$Callback.getAbsoluteMovementFlags(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
	//   34   69:ldc1            #13  <Int 65280>
	//   35   71:iand            
	//   36   72:bipush          8
	//   37   74:ishr            
	//   38   75:istore_1        
			if(i == 0)
	//*  39   76:iload_1         
	//*  40   77:ifne            81
				return;
	//   41   80:return          
			float f = motionevent.getX(j);
	//   42   81:aload_2         
	//   43   82:iload_3         
	//   44   83:invokevirtual   #322 <Method float MotionEvent.getX(int)>
	//   45   86:fstore          4
			float f1 = motionevent.getY(j);
	//   46   88:aload_2         
	//   47   89:iload_3         
	//   48   90:invokevirtual   #327 <Method float MotionEvent.getY(int)>
	//   49   93:fstore          5
			f -= mInitialTouchX;
	//   50   95:fload           4
	//   51   97:aload_0         
	//   52   98:getfield        #324 <Field float mInitialTouchX>
	//   53  101:fsub            
	//   54  102:fstore          4
			f1 -= mInitialTouchY;
	//   55  104:fload           5
	//   56  106:aload_0         
	//   57  107:getfield        #329 <Field float mInitialTouchY>
	//   58  110:fsub            
	//   59  111:fstore          5
			float f2 = Math.abs(f);
	//   60  113:fload           4
	//   61  115:invokestatic    #178 <Method float Math.abs(float)>
	//   62  118:fstore          6
			float f3 = Math.abs(f1);
	//   63  120:fload           5
	//   64  122:invokestatic    #178 <Method float Math.abs(float)>
	//   65  125:fstore          7
			j = mSlop;
	//   66  127:aload_0         
	//   67  128:getfield        #331 <Field int mSlop>
	//   68  131:istore_3        
			if(f2 < (float)j && f3 < (float)j)
	//*  69  132:fload           6
	//*  70  134:iload_3         
	//*  71  135:i2f             
	//*  72  136:fcmpg           
	//*  73  137:ifge            149
	//*  74  140:fload           7
	//*  75  142:iload_3         
	//*  76  143:i2f             
	//*  77  144:fcmpg           
	//*  78  145:ifge            149
				return;
	//   79  148:return          
			if(f2 > f3)
	//*  80  149:fload           6
	//*  81  151:fload           7
	//*  82  153:fcmpl           
	//*  83  154:ifle            186
			{
				if(f < 0.0F && (i & 4) == 0)
	//*  84  157:fload           4
	//*  85  159:fconst_0        
	//*  86  160:fcmpg           
	//*  87  161:ifge            171
	//*  88  164:iload_1         
	//*  89  165:iconst_4        
	//*  90  166:iand            
	//*  91  167:ifne            171
					return;
	//   92  170:return          
				if(f > 0.0F && (i & 8) == 0)
	//*  93  171:fload           4
	//*  94  173:fconst_0        
	//*  95  174:fcmpl           
	//*  96  175:ifle            214
	//*  97  178:iload_1         
	//*  98  179:bipush          8
	//*  99  181:iand            
	//* 100  182:ifne            214
					return;
	//  101  185:return          
			} else
			{
				if(f1 < 0.0F && (i & 1) == 0)
	//* 102  186:fload           5
	//* 103  188:fconst_0        
	//* 104  189:fcmpg           
	//* 105  190:ifge            200
	//* 106  193:iload_1         
	//* 107  194:iconst_1        
	//* 108  195:iand            
	//* 109  196:ifne            200
					return;
	//  110  199:return          
				if(f1 > 0.0F && (i & 2) == 0)
	//* 111  200:fload           5
	//* 112  202:fconst_0        
	//* 113  203:fcmpl           
	//* 114  204:ifle            214
	//* 115  207:iload_1         
	//* 116  208:iconst_2        
	//* 117  209:iand            
	//* 118  210:ifne            214
					return;
	//  119  213:return          
			}
			mDy = 0.0F;
	//  120  214:aload_0         
	//  121  215:fconst_0        
	//  122  216:putfield        #194 <Field float mDy>
			mDx = 0.0F;
	//  123  219:aload_0         
	//  124  220:fconst_0        
	//  125  221:putfield        #150 <Field float mDx>
			mActivePointerId = motionevent.getPointerId(0);
	//  126  224:aload_0         
	//  127  225:aload_2         
	//  128  226:iconst_0        
	//  129  227:invokevirtual   #460 <Method int MotionEvent.getPointerId(int)>
	//  130  230:putfield        #104 <Field int mActivePointerId>
			select(viewholder, 1);
	//  131  233:aload_0         
	//  132  234:aload           8
	//  133  236:iconst_1        
	//  134  237:invokevirtual   #464 <Method void select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
			return;
	//  135  240:return          
		} else
		{
			return;
	//  136  241:return          
		}
	}

	void endRecoverAnimation(android.support.v7.widget.RecyclerView.ViewHolder viewholder, boolean flag)
	{
		for(int i = mRecoverAnimations.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #108 <Field List mRecoverAnimations>
	//*   2    4:invokeinterface #215 <Method int List.size()>
	//*   3    9:iconst_1        
	//*   4   10:isub            
	//*   5   11:istore_3        
	//*   6   12:iload_3         
	//*   7   13:iflt            84
		{
			RecoverAnimation recoveranimation = (RecoverAnimation)mRecoverAnimations.get(i);
	//    8   16:aload_0         
	//    9   17:getfield        #108 <Field List mRecoverAnimations>
	//   10   20:iload_3         
	//   11   21:invokeinterface #219 <Method Object List.get(int)>
	//   12   26:checkcast       #221 <Class ItemTouchHelper$RecoverAnimation>
	//   13   29:astore          4
			if(recoveranimation.mViewHolder == viewholder)
	//*  14   31:aload           4
	//*  15   33:getfield        #224 <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
	//*  16   36:aload_1         
	//*  17   37:if_acmpne       77
			{
				recoveranimation.mOverridden = recoveranimation.mOverridden | flag;
	//   18   40:aload           4
	//   19   42:aload           4
	//   20   44:getfield        #469 <Field boolean ItemTouchHelper$RecoverAnimation.mOverridden>
	//   21   47:iload_2         
	//   22   48:ior             
	//   23   49:putfield        #469 <Field boolean ItemTouchHelper$RecoverAnimation.mOverridden>
				if(!recoveranimation.mEnded)
	//*  24   52:aload           4
	//*  25   54:getfield        #472 <Field boolean ItemTouchHelper$RecoverAnimation.mEnded>
	//*  26   57:ifne            65
					recoveranimation.cancel();
	//   27   60:aload           4
	//   28   62:invokevirtual   #475 <Method void ItemTouchHelper$RecoverAnimation.cancel()>
				mRecoverAnimations.remove(i);
	//   29   65:aload_0         
	//   30   66:getfield        #108 <Field List mRecoverAnimations>
	//   31   69:iload_3         
	//   32   70:invokeinterface #478 <Method Object List.remove(int)>
	//   33   75:pop             
				return;
	//   34   76:return          
			}
		}

	//   35   77:iload_3         
	//   36   78:iconst_1        
	//   37   79:isub            
	//   38   80:istore_3        
	//*  39   81:goto            12
	//   40   84:return          
	}

	RecoverAnimation findAnimation(MotionEvent motionevent)
	{
		if(mRecoverAnimations.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #108 <Field List mRecoverAnimations>
	//*   2    4:invokeinterface #483 <Method boolean List.isEmpty()>
	//*   3    9:ifeq            14
			return null;
	//    4   12:aconst_null     
	//    5   13:areturn         
		motionevent = ((MotionEvent) (findChildView(motionevent)));
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokevirtual   #342 <Method View findChildView(MotionEvent)>
	//    9   19:astore_1        
		for(int i = mRecoverAnimations.size() - 1; i >= 0; i--)
	//*  10   20:aload_0         
	//*  11   21:getfield        #108 <Field List mRecoverAnimations>
	//*  12   24:invokeinterface #215 <Method int List.size()>
	//*  13   29:iconst_1        
	//*  14   30:isub            
	//*  15   31:istore_2        
	//*  16   32:iload_2         
	//*  17   33:iflt            70
		{
			RecoverAnimation recoveranimation = (RecoverAnimation)mRecoverAnimations.get(i);
	//   18   36:aload_0         
	//   19   37:getfield        #108 <Field List mRecoverAnimations>
	//   20   40:iload_2         
	//   21   41:invokeinterface #219 <Method Object List.get(int)>
	//   22   46:checkcast       #221 <Class ItemTouchHelper$RecoverAnimation>
	//   23   49:astore_3        
			if(recoveranimation.mViewHolder.itemView == motionevent)
	//*  24   50:aload_3         
	//*  25   51:getfield        #224 <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
	//*  26   54:getfield        #259 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  27   57:aload_1         
	//*  28   58:if_acmpne       63
				return recoveranimation;
	//   29   61:aload_3         
	//   30   62:areturn         
		}

	//   31   63:iload_2         
	//   32   64:iconst_1        
	//   33   65:isub            
	//   34   66:istore_2        
	//*  35   67:goto            32
		return null;
	//   36   70:aconst_null     
	//   37   71:areturn         
	}

	View findChildView(MotionEvent motionevent)
	{
		float f = motionevent.getX();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #485 <Method float MotionEvent.getX()>
	//    2    4:fstore_2        
		float f1 = motionevent.getY();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #487 <Method float MotionEvent.getY()>
	//    5    9:fstore_3        
		motionevent = ((MotionEvent) (mSelected));
	//    6   10:aload_0         
	//    7   11:getfield        #102 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//    8   14:astore_1        
		if(motionevent != null)
	//*   9   15:aload_1         
	//*  10   16:ifnull          53
		{
			motionevent = ((MotionEvent) (((android.support.v7.widget.RecyclerView.ViewHolder) (motionevent)).itemView));
	//   11   19:aload_1         
	//   12   20:getfield        #259 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   13   23:astore_1        
			if(hitTest(((View) (motionevent)), f, f1, mSelectedStartX + mDx, mSelectedStartY + mDy))
	//*  14   24:aload_1         
	//*  15   25:fload_2         
	//*  16   26:fload_3         
	//*  17   27:aload_0         
	//*  18   28:getfield        #248 <Field float mSelectedStartX>
	//*  19   31:aload_0         
	//*  20   32:getfield        #150 <Field float mDx>
	//*  21   35:fadd            
	//*  22   36:aload_0         
	//*  23   37:getfield        #254 <Field float mSelectedStartY>
	//*  24   40:aload_0         
	//*  25   41:getfield        #194 <Field float mDy>
	//*  26   44:fadd            
	//*  27   45:invokestatic    #489 <Method boolean hitTest(View, float, float, float, float)>
	//*  28   48:ifeq            53
				return ((View) (motionevent));
	//   29   51:aload_1         
	//   30   52:areturn         
		}
		for(int i = mRecoverAnimations.size() - 1; i >= 0; i--)
	//*  31   53:aload_0         
	//*  32   54:getfield        #108 <Field List mRecoverAnimations>
	//*  33   57:invokeinterface #215 <Method int List.size()>
	//*  34   62:iconst_1        
	//*  35   63:isub            
	//*  36   64:istore          4
	//*  37   66:iload           4
	//*  38   68:iflt            125
		{
			motionevent = ((MotionEvent) ((RecoverAnimation)mRecoverAnimations.get(i)));
	//   39   71:aload_0         
	//   40   72:getfield        #108 <Field List mRecoverAnimations>
	//   41   75:iload           4
	//   42   77:invokeinterface #219 <Method Object List.get(int)>
	//   43   82:checkcast       #221 <Class ItemTouchHelper$RecoverAnimation>
	//   44   85:astore_1        
			View view = ((RecoverAnimation) (motionevent)).mViewHolder.itemView;
	//   45   86:aload_1         
	//   46   87:getfield        #224 <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
	//   47   90:getfield        #259 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   48   93:astore          5
			if(hitTest(view, f, f1, ((RecoverAnimation) (motionevent)).mX, ((RecoverAnimation) (motionevent)).mY))
	//*  49   95:aload           5
	//*  50   97:fload_2         
	//*  51   98:fload_3         
	//*  52   99:aload_1         
	//*  53  100:getfield        #492 <Field float ItemTouchHelper$RecoverAnimation.mX>
	//*  54  103:aload_1         
	//*  55  104:getfield        #495 <Field float ItemTouchHelper$RecoverAnimation.mY>
	//*  56  107:invokestatic    #489 <Method boolean hitTest(View, float, float, float, float)>
	//*  57  110:ifeq            116
				return view;
	//   58  113:aload           5
	//   59  115:areturn         
		}

	//   60  116:iload           4
	//   61  118:iconst_1        
	//   62  119:isub            
	//   63  120:istore          4
	//*  64  122:goto            66
		return mRecyclerView.findChildViewUnder(f, f1);
	//   65  125:aload_0         
	//   66  126:getfield        #140 <Field RecyclerView mRecyclerView>
	//   67  129:fload_2         
	//   68  130:fload_3         
	//   69  131:invokevirtual   #499 <Method View RecyclerView.findChildViewUnder(float, float)>
	//   70  134:areturn         
	}

	public void getItemOffsets(Rect rect, View view, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.State state)
	{
		rect.setEmpty();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #506 <Method void Rect.setEmpty()>
	//    2    4:return          
	}

	boolean hasRunningRecoverAnim()
	{
		int j = mRecoverAnimations.size();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field List mRecoverAnimations>
	//    2    4:invokeinterface #215 <Method int List.size()>
	//    3    9:istore_2        
		for(int i = 0; i < j; i++)
	//*   4   10:iconst_0        
	//*   5   11:istore_1        
	//*   6   12:iload_1         
	//*   7   13:iload_2         
	//*   8   14:icmpge          45
			if(!((RecoverAnimation)mRecoverAnimations.get(i)).mEnded)
	//*   9   17:aload_0         
	//*  10   18:getfield        #108 <Field List mRecoverAnimations>
	//*  11   21:iload_1         
	//*  12   22:invokeinterface #219 <Method Object List.get(int)>
	//*  13   27:checkcast       #221 <Class ItemTouchHelper$RecoverAnimation>
	//*  14   30:getfield        #472 <Field boolean ItemTouchHelper$RecoverAnimation.mEnded>
	//*  15   33:ifne            38
				return true;
	//   16   36:iconst_1        
	//   17   37:ireturn         

	//   18   38:iload_1         
	//   19   39:iconst_1        
	//   20   40:iadd            
	//   21   41:istore_1        
	//*  22   42:goto            12
		return false;
	//   23   45:iconst_0        
	//   24   46:ireturn         
	}

	void moveIfNecessary(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
	{
		if(mRecyclerView.isLayoutRequested())
	//*   0    0:aload_0         
	//*   1    1:getfield        #140 <Field RecyclerView mRecyclerView>
	//*   2    4:invokevirtual   #512 <Method boolean RecyclerView.isLayoutRequested()>
	//*   3    7:ifeq            11
			return;
	//    4   10:return          
		if(mActionState != 2)
	//*   5   11:aload_0         
	//*   6   12:getfield        #106 <Field int mActionState>
	//*   7   15:iconst_2        
	//*   8   16:icmpeq          20
			return;
	//    9   19:return          
		float f = mCallback.getMoveThreshold(viewholder);
	//   10   20:aload_0         
	//   11   21:getfield        #128 <Field ItemTouchHelper$Callback mCallback>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #515 <Method float ItemTouchHelper$Callback.getMoveThreshold(android.support.v7.widget.RecyclerView$ViewHolder)>
	//   14   28:fstore_2        
		int i = (int)(mSelectedStartX + mDx);
	//   15   29:aload_0         
	//   16   30:getfield        #248 <Field float mSelectedStartX>
	//   17   33:aload_0         
	//   18   34:getfield        #150 <Field float mDx>
	//   19   37:fadd            
	//   20   38:f2i             
	//   21   39:istore_3        
		int j = (int)(mSelectedStartY + mDy);
	//   22   40:aload_0         
	//   23   41:getfield        #254 <Field float mSelectedStartY>
	//   24   44:aload_0         
	//   25   45:getfield        #194 <Field float mDy>
	//   26   48:fadd            
	//   27   49:f2i             
	//   28   50:istore          4
		if((float)Math.abs(j - viewholder.itemView.getTop()) < (float)viewholder.itemView.getHeight() * f && (float)Math.abs(i - viewholder.itemView.getLeft()) < (float)viewholder.itemView.getWidth() * f)
	//*  29   52:iload           4
	//*  30   54:aload_1         
	//*  31   55:getfield        #259 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  32   58:invokevirtual   #282 <Method int View.getTop()>
	//*  33   61:isub            
	//*  34   62:invokestatic    #299 <Method int Math.abs(int)>
	//*  35   65:i2f             
	//*  36   66:aload_1         
	//*  37   67:getfield        #259 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  38   70:invokevirtual   #263 <Method int View.getHeight()>
	//*  39   73:i2f             
	//*  40   74:fload_2         
	//*  41   75:fmul            
	//*  42   76:fcmpg           
	//*  43   77:ifge            108
	//*  44   80:iload_3         
	//*  45   81:aload_1         
	//*  46   82:getfield        #259 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  47   85:invokevirtual   #288 <Method int View.getLeft()>
	//*  48   88:isub            
	//*  49   89:invokestatic    #299 <Method int Math.abs(int)>
	//*  50   92:i2f             
	//*  51   93:aload_1         
	//*  52   94:getfield        #259 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  53   97:invokevirtual   #262 <Method int View.getWidth()>
	//*  54  100:i2f             
	//*  55  101:fload_2         
	//*  56  102:fmul            
	//*  57  103:fcmpg           
	//*  58  104:ifge            108
			return;
	//   59  107:return          
		Object obj = ((Object) (findSwapTargets(viewholder)));
	//   60  108:aload_0         
	//   61  109:aload_1         
	//   62  110:invokespecial   #517 <Method List findSwapTargets(android.support.v7.widget.RecyclerView$ViewHolder)>
	//   63  113:astore          7
		if(((List) (obj)).size() == 0)
	//*  64  115:aload           7
	//*  65  117:invokeinterface #215 <Method int List.size()>
	//*  66  122:ifne            126
			return;
	//   67  125:return          
		obj = ((Object) (mCallback.chooseDropTarget(viewholder, ((List) (obj)), i, j)));
	//   68  126:aload_0         
	//   69  127:getfield        #128 <Field ItemTouchHelper$Callback mCallback>
	//   70  130:aload_1         
	//   71  131:aload           7
	//   72  133:iload_3         
	//   73  134:iload           4
	//   74  136:invokevirtual   #521 <Method android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$Callback.chooseDropTarget(android.support.v7.widget.RecyclerView$ViewHolder, List, int, int)>
	//   75  139:astore          7
		if(obj == null)
	//*  76  141:aload           7
	//*  77  143:ifnonnull       165
		{
			mSwapTargets.clear();
	//   78  146:aload_0         
	//   79  147:getfield        #241 <Field List mSwapTargets>
	//   80  150:invokeinterface #231 <Method void List.clear()>
			mDistances.clear();
	//   81  155:aload_0         
	//   82  156:getfield        #243 <Field List mDistances>
	//   83  159:invokeinterface #231 <Method void List.clear()>
			return;
	//   84  164:return          
		}
		int k = ((android.support.v7.widget.RecyclerView.ViewHolder) (obj)).getAdapterPosition();
	//   85  165:aload           7
	//   86  167:invokevirtual   #524 <Method int android.support.v7.widget.RecyclerView$ViewHolder.getAdapterPosition()>
	//   87  170:istore          5
		int l = viewholder.getAdapterPosition();
	//   88  172:aload_1         
	//   89  173:invokevirtual   #524 <Method int android.support.v7.widget.RecyclerView$ViewHolder.getAdapterPosition()>
	//   90  176:istore          6
		if(mCallback.onMove(mRecyclerView, viewholder, ((android.support.v7.widget.RecyclerView.ViewHolder) (obj))))
	//*  91  178:aload_0         
	//*  92  179:getfield        #128 <Field ItemTouchHelper$Callback mCallback>
	//*  93  182:aload_0         
	//*  94  183:getfield        #140 <Field RecyclerView mRecyclerView>
	//*  95  186:aload_1         
	//*  96  187:aload           7
	//*  97  189:invokevirtual   #527 <Method boolean ItemTouchHelper$Callback.onMove(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, android.support.v7.widget.RecyclerView$ViewHolder)>
	//*  98  192:ifeq            216
			mCallback.onMoved(mRecyclerView, viewholder, l, ((android.support.v7.widget.RecyclerView.ViewHolder) (obj)), k, i, j);
	//   99  195:aload_0         
	//  100  196:getfield        #128 <Field ItemTouchHelper$Callback mCallback>
	//  101  199:aload_0         
	//  102  200:getfield        #140 <Field RecyclerView mRecyclerView>
	//  103  203:aload_1         
	//  104  204:iload           6
	//  105  206:aload           7
	//  106  208:iload           5
	//  107  210:iload_3         
	//  108  211:iload           4
	//  109  213:invokevirtual   #531 <Method void ItemTouchHelper$Callback.onMoved(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, int, android.support.v7.widget.RecyclerView$ViewHolder, int, int, int)>
	//  110  216:return          
	}

	void obtainVelocityTracker()
	{
		VelocityTracker velocitytracker = mVelocityTracker;
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field VelocityTracker mVelocityTracker>
	//    2    4:astore_1        
		if(velocitytracker != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			velocitytracker.recycle();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #358 <Method void VelocityTracker.recycle()>
		mVelocityTracker = VelocityTracker.obtain();
	//    7   13:aload_0         
	//    8   14:invokestatic    #536 <Method VelocityTracker VelocityTracker.obtain()>
	//    9   17:putfield        #152 <Field VelocityTracker mVelocityTracker>
	//   10   20:return          
	}

	public void onChildViewAttachedToWindow(View view)
	{
	//    0    0:return          
	}

	public void onChildViewDetachedFromWindow(View view)
	{
		removeChildDrawingOrderCallbackIfNecessary(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #542 <Method void removeChildDrawingOrderCallbackIfNecessary(View)>
		view = ((View) (mRecyclerView.getChildViewHolder(view)));
	//    3    5:aload_0         
	//    4    6:getfield        #140 <Field RecyclerView mRecyclerView>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #292 <Method android.support.v7.widget.RecyclerView$ViewHolder RecyclerView.getChildViewHolder(View)>
	//    7   13:astore_1        
		if(view == null)
	//*   8   14:aload_1         
	//*   9   15:ifnonnull       19
			return;
	//   10   18:return          
		android.support.v7.widget.RecyclerView.ViewHolder viewholder = mSelected;
	//   11   19:aload_0         
	//   12   20:getfield        #102 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//   13   23:astore_2        
		if(viewholder != null && view == viewholder)
	//*  14   24:aload_2         
	//*  15   25:ifnull          40
	//*  16   28:aload_1         
	//*  17   29:aload_2         
	//*  18   30:if_acmpne       40
		{
			select(((android.support.v7.widget.RecyclerView.ViewHolder) (null)), 0);
	//   19   33:aload_0         
	//   20   34:aconst_null     
	//   21   35:iconst_0        
	//   22   36:invokevirtual   #464 <Method void select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
			return;
	//   23   39:return          
		}
		endRecoverAnimation(((android.support.v7.widget.RecyclerView.ViewHolder) (view)), false);
	//   24   40:aload_0         
	//   25   41:aload_1         
	//   26   42:iconst_0        
	//   27   43:invokevirtual   #544 <Method void endRecoverAnimation(android.support.v7.widget.RecyclerView$ViewHolder, boolean)>
		if(mPendingCleanup.remove(((Object) (((android.support.v7.widget.RecyclerView.ViewHolder) (view)).itemView))))
	//*  28   46:aload_0         
	//*  29   47:getfield        #98  <Field List mPendingCleanup>
	//*  30   50:aload_1         
	//*  31   51:getfield        #259 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  32   54:invokeinterface #547 <Method boolean List.remove(Object)>
	//*  33   59:ifeq            74
			mCallback.clearView(mRecyclerView, ((android.support.v7.widget.RecyclerView.ViewHolder) (view)));
	//   34   62:aload_0         
	//   35   63:getfield        #128 <Field ItemTouchHelper$Callback mCallback>
	//   36   66:aload_0         
	//   37   67:getfield        #140 <Field RecyclerView mRecyclerView>
	//   38   70:aload_1         
	//   39   71:invokevirtual   #228 <Method void ItemTouchHelper$Callback.clearView(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
	//   40   74:return          
	}

	public void onDraw(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.State state)
	{
		mOverdrawChildPosition = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #121 <Field int mOverdrawChildPosition>
		float f;
		float f1;
		if(mSelected != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #102 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//*   5    9:ifnull          38
		{
			getSelectedDxDy(mTmpPosition);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #100 <Field float[] mTmpPosition>
	//    9   17:invokespecial   #551 <Method void getSelectedDxDy(float[])>
			state = ((android.support.v7.widget.RecyclerView.State) (mTmpPosition));
	//   10   20:aload_0         
	//   11   21:getfield        #100 <Field float[] mTmpPosition>
	//   12   24:astore_3        
			f = state[0];
	//   13   25:aload_3         
	//   14   26:iconst_0        
	//   15   27:faload          
	//   16   28:fstore          4
			f1 = state[1];
	//   17   30:aload_3         
	//   18   31:iconst_1        
	//   19   32:faload          
	//   20   33:fstore          5
		} else
	//*  21   35:goto            44
		{
			f = 0.0F;
	//   22   38:fconst_0        
	//   23   39:fstore          4
			f1 = 0.0F;
	//   24   41:fconst_0        
	//   25   42:fstore          5
		}
		mCallback.onDraw(canvas, recyclerview, mSelected, mRecoverAnimations, mActionState, f, f1);
	//   26   44:aload_0         
	//   27   45:getfield        #128 <Field ItemTouchHelper$Callback mCallback>
	//   28   48:aload_1         
	//   29   49:aload_2         
	//   30   50:aload_0         
	//   31   51:getfield        #102 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//   32   54:aload_0         
	//   33   55:getfield        #108 <Field List mRecoverAnimations>
	//   34   58:aload_0         
	//   35   59:getfield        #106 <Field int mActionState>
	//   36   62:fload           4
	//   37   64:fload           5
	//   38   66:invokevirtual   #554 <Method void ItemTouchHelper$Callback.onDraw(Canvas, RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, List, int, float, float)>
	//   39   69:return          
	}

	public void onDrawOver(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.State state)
	{
		float f;
		float f1;
		if(mSelected != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//*   2    4:ifnull          33
		{
			getSelectedDxDy(mTmpPosition);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #100 <Field float[] mTmpPosition>
	//    6   12:invokespecial   #551 <Method void getSelectedDxDy(float[])>
			state = ((android.support.v7.widget.RecyclerView.State) (mTmpPosition));
	//    7   15:aload_0         
	//    8   16:getfield        #100 <Field float[] mTmpPosition>
	//    9   19:astore_3        
			f = state[0];
	//   10   20:aload_3         
	//   11   21:iconst_0        
	//   12   22:faload          
	//   13   23:fstore          4
			f1 = state[1];
	//   14   25:aload_3         
	//   15   26:iconst_1        
	//   16   27:faload          
	//   17   28:fstore          5
		} else
	//*  18   30:goto            39
		{
			f = 0.0F;
	//   19   33:fconst_0        
	//   20   34:fstore          4
			f1 = 0.0F;
	//   21   36:fconst_0        
	//   22   37:fstore          5
		}
		mCallback.onDrawOver(canvas, recyclerview, mSelected, mRecoverAnimations, mActionState, f, f1);
	//   23   39:aload_0         
	//   24   40:getfield        #128 <Field ItemTouchHelper$Callback mCallback>
	//   25   43:aload_1         
	//   26   44:aload_2         
	//   27   45:aload_0         
	//   28   46:getfield        #102 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//   29   49:aload_0         
	//   30   50:getfield        #108 <Field List mRecoverAnimations>
	//   31   53:aload_0         
	//   32   54:getfield        #106 <Field int mActionState>
	//   33   57:fload           4
	//   34   59:fload           5
	//   35   61:invokevirtual   #557 <Method void ItemTouchHelper$Callback.onDrawOver(Canvas, RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, List, int, float, float)>
	//   36   64:return          
	}

	void postDispatchSwipe(final RecoverAnimation anim, final int swipeDir)
	{
		mRecyclerView.post(((Runnable) (new _cls4())));
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field RecyclerView mRecyclerView>
	//    2    4:new             #561 <Class ItemTouchHelper$4>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:invokespecial   #564 <Method void ItemTouchHelper$4(ItemTouchHelper, ItemTouchHelper$RecoverAnimation, int)>
	//    8   14:invokevirtual   #568 <Method boolean RecyclerView.post(Runnable)>
	//    9   17:pop             
	//   10   18:return          
	}

	void removeChildDrawingOrderCallbackIfNecessary(View view)
	{
		if(view == mOverdrawChild)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #119 <Field View mOverdrawChild>
	//*   3    5:if_acmpne       28
		{
			mOverdrawChild = null;
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:putfield        #119 <Field View mOverdrawChild>
			if(mChildDrawingOrderCallback != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #117 <Field android.support.v7.widget.RecyclerView$ChildDrawingOrderCallback mChildDrawingOrderCallback>
	//*   9   17:ifnull          28
				mRecyclerView.setChildDrawingOrderCallback(((android.support.v7.widget.RecyclerView.ChildDrawingOrderCallback) (null)));
	//   10   20:aload_0         
	//   11   21:getfield        #140 <Field RecyclerView mRecyclerView>
	//   12   24:aconst_null     
	//   13   25:invokevirtual   #146 <Method void RecyclerView.setChildDrawingOrderCallback(android.support.v7.widget.RecyclerView$ChildDrawingOrderCallback)>
		}
	//   14   28:return          
	}

	boolean scrollIfNecessary()
	{
		int i;
		long l1;
		long l2;
		android.support.v7.widget.RecyclerView.LayoutManager layoutmanager;
label0:
		{
			if(mSelected == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #102 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//*   2    4:ifnonnull       16
			{
				mDragScrollStartTimeInMs = 0x0L;
	//    3    7:aload_0         
	//    4    8:ldc2w           #570 <Long 0x0L>
	//    5   11:putfield        #573 <Field long mDragScrollStartTimeInMs>
				return false;
	//    6   14:iconst_0        
	//    7   15:ireturn         
			}
			l2 = System.currentTimeMillis();
	//    8   16:invokestatic    #579 <Method long System.currentTimeMillis()>
	//    9   19:lstore          6
			l1 = mDragScrollStartTimeInMs;
	//   10   21:aload_0         
	//   11   22:getfield        #573 <Field long mDragScrollStartTimeInMs>
	//   12   25:lstore          4
			if(l1 == 0x0L)
	//*  13   27:lload           4
	//*  14   29:ldc2w           #570 <Long 0x0L>
	//*  15   32:lcmp            
	//*  16   33:ifne            42
				l1 = 0L;
	//   17   36:lconst_0        
	//   18   37:lstore          4
			else
	//*  19   39:goto            49
				l1 = l2 - l1;
	//   20   42:lload           6
	//   21   44:lload           4
	//   22   46:lsub            
	//   23   47:lstore          4
			layoutmanager = mRecyclerView.getLayoutManager();
	//   24   49:aload_0         
	//   25   50:getfield        #140 <Field RecyclerView mRecyclerView>
	//   26   53:invokevirtual   #267 <Method android.support.v7.widget.RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//   27   56:astore          8
			if(mTmpRect == null)
	//*  28   58:aload_0         
	//*  29   59:getfield        #581 <Field Rect mTmpRect>
	//*  30   62:ifnonnull       76
				mTmpRect = new Rect();
	//   31   65:aload_0         
	//   32   66:new             #503 <Class Rect>
	//   33   69:dup             
	//   34   70:invokespecial   #582 <Method void Rect()>
	//   35   73:putfield        #581 <Field Rect mTmpRect>
			layoutmanager.calculateItemDecorationsForChild(mSelected.itemView, mTmpRect);
	//   36   76:aload           8
	//   37   78:aload_0         
	//   38   79:getfield        #102 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//   39   82:getfield        #259 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   40   85:aload_0         
	//   41   86:getfield        #581 <Field Rect mTmpRect>
	//   42   89:invokevirtual   #586 <Method void android.support.v7.widget.RecyclerView$LayoutManager.calculateItemDecorationsForChild(View, Rect)>
			if(layoutmanager.canScrollHorizontally())
	//*  43   92:aload           8
	//*  44   94:invokevirtual   #335 <Method boolean android.support.v7.widget.RecyclerView$LayoutManager.canScrollHorizontally()>
	//*  45   97:ifeq            198
			{
				int j = (int)(mSelectedStartX + mDx);
	//   46  100:aload_0         
	//   47  101:getfield        #248 <Field float mSelectedStartX>
	//   48  104:aload_0         
	//   49  105:getfield        #150 <Field float mDx>
	//   50  108:fadd            
	//   51  109:f2i             
	//   52  110:istore_2        
				i = j - mTmpRect.left - mRecyclerView.getPaddingLeft();
	//   53  111:iload_2         
	//   54  112:aload_0         
	//   55  113:getfield        #581 <Field Rect mTmpRect>
	//   56  116:getfield        #589 <Field int Rect.left>
	//   57  119:isub            
	//   58  120:aload_0         
	//   59  121:getfield        #140 <Field RecyclerView mRecyclerView>
	//   60  124:invokevirtual   #592 <Method int RecyclerView.getPaddingLeft()>
	//   61  127:isub            
	//   62  128:istore_1        
				if(mDx < 0.0F && i < 0)
	//*  63  129:aload_0         
	//*  64  130:getfield        #150 <Field float mDx>
	//*  65  133:fconst_0        
	//*  66  134:fcmpg           
	//*  67  135:ifge            145
	//*  68  138:iload_1         
	//*  69  139:ifge            145
					break label0;
	//   70  142:goto            200
				if(mDx > 0.0F)
	//*  71  145:aload_0         
	//*  72  146:getfield        #150 <Field float mDx>
	//*  73  149:fconst_0        
	//*  74  150:fcmpl           
	//*  75  151:ifle            198
				{
					i = (j + mSelected.itemView.getWidth() + mTmpRect.right) - (mRecyclerView.getWidth() - mRecyclerView.getPaddingRight());
	//   76  154:iload_2         
	//   77  155:aload_0         
	//   78  156:getfield        #102 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//   79  159:getfield        #259 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   80  162:invokevirtual   #262 <Method int View.getWidth()>
	//   81  165:iadd            
	//   82  166:aload_0         
	//   83  167:getfield        #581 <Field Rect mTmpRect>
	//   84  170:getfield        #595 <Field int Rect.right>
	//   85  173:iadd            
	//   86  174:aload_0         
	//   87  175:getfield        #140 <Field RecyclerView mRecyclerView>
	//   88  178:invokevirtual   #187 <Method int RecyclerView.getWidth()>
	//   89  181:aload_0         
	//   90  182:getfield        #140 <Field RecyclerView mRecyclerView>
	//   91  185:invokevirtual   #598 <Method int RecyclerView.getPaddingRight()>
	//   92  188:isub            
	//   93  189:isub            
	//   94  190:istore_1        
					if(i > 0)
	//*  95  191:iload_1         
	//*  96  192:ifle            198
						break label0;
	//   97  195:goto            200
				}
			}
			i = 0;
	//   98  198:iconst_0        
	//   99  199:istore_1        
		}
		int k;
label1:
		{
			if(layoutmanager.canScrollVertically())
	//* 100  200:aload           8
	//* 101  202:invokevirtual   #338 <Method boolean android.support.v7.widget.RecyclerView$LayoutManager.canScrollVertically()>
	//* 102  205:ifeq            306
			{
				int l = (int)(mSelectedStartY + mDy);
	//  103  208:aload_0         
	//  104  209:getfield        #254 <Field float mSelectedStartY>
	//  105  212:aload_0         
	//  106  213:getfield        #194 <Field float mDy>
	//  107  216:fadd            
	//  108  217:f2i             
	//  109  218:istore_3        
				k = l - mTmpRect.top - mRecyclerView.getPaddingTop();
	//  110  219:iload_3         
	//  111  220:aload_0         
	//  112  221:getfield        #581 <Field Rect mTmpRect>
	//  113  224:getfield        #601 <Field int Rect.top>
	//  114  227:isub            
	//  115  228:aload_0         
	//  116  229:getfield        #140 <Field RecyclerView mRecyclerView>
	//  117  232:invokevirtual   #604 <Method int RecyclerView.getPaddingTop()>
	//  118  235:isub            
	//  119  236:istore_2        
				if(mDy < 0.0F && k < 0)
	//* 120  237:aload_0         
	//* 121  238:getfield        #194 <Field float mDy>
	//* 122  241:fconst_0        
	//* 123  242:fcmpg           
	//* 124  243:ifge            253
	//* 125  246:iload_2         
	//* 126  247:ifge            253
					break label1;
	//  127  250:goto            308
				if(mDy > 0.0F)
	//* 128  253:aload_0         
	//* 129  254:getfield        #194 <Field float mDy>
	//* 130  257:fconst_0        
	//* 131  258:fcmpl           
	//* 132  259:ifle            306
				{
					k = (l + mSelected.itemView.getHeight() + mTmpRect.bottom) - (mRecyclerView.getHeight() - mRecyclerView.getPaddingBottom());
	//  133  262:iload_3         
	//  134  263:aload_0         
	//  135  264:getfield        #102 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//  136  267:getfield        #259 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//  137  270:invokevirtual   #263 <Method int View.getHeight()>
	//  138  273:iadd            
	//  139  274:aload_0         
	//  140  275:getfield        #581 <Field Rect mTmpRect>
	//  141  278:getfield        #607 <Field int Rect.bottom>
	//  142  281:iadd            
	//  143  282:aload_0         
	//  144  283:getfield        #140 <Field RecyclerView mRecyclerView>
	//  145  286:invokevirtual   #197 <Method int RecyclerView.getHeight()>
	//  146  289:aload_0         
	//  147  290:getfield        #140 <Field RecyclerView mRecyclerView>
	//  148  293:invokevirtual   #610 <Method int RecyclerView.getPaddingBottom()>
	//  149  296:isub            
	//  150  297:isub            
	//  151  298:istore_2        
					if(k > 0)
	//* 152  299:iload_2         
	//* 153  300:ifle            306
						break label1;
	//  154  303:goto            308
				}
			}
			k = 0;
	//  155  306:iconst_0        
	//  156  307:istore_2        
		}
		if(i != 0)
	//* 157  308:iload_1         
	//* 158  309:ifeq            347
			i = mCallback.interpolateOutOfBoundsScroll(mRecyclerView, mSelected.itemView.getWidth(), i, mRecyclerView.getWidth(), l1);
	//  159  312:aload_0         
	//  160  313:getfield        #128 <Field ItemTouchHelper$Callback mCallback>
	//  161  316:aload_0         
	//  162  317:getfield        #140 <Field RecyclerView mRecyclerView>
	//  163  320:aload_0         
	//  164  321:getfield        #102 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//  165  324:getfield        #259 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//  166  327:invokevirtual   #262 <Method int View.getWidth()>
	//  167  330:iload_1         
	//  168  331:aload_0         
	//  169  332:getfield        #140 <Field RecyclerView mRecyclerView>
	//  170  335:invokevirtual   #187 <Method int RecyclerView.getWidth()>
	//  171  338:lload           4
	//  172  340:invokevirtual   #614 <Method int ItemTouchHelper$Callback.interpolateOutOfBoundsScroll(RecyclerView, int, int, int, long)>
	//  173  343:istore_1        
	//* 174  344:goto            347
		if(k != 0)
	//* 175  347:iload_2         
	//* 176  348:ifeq            386
			k = mCallback.interpolateOutOfBoundsScroll(mRecyclerView, mSelected.itemView.getHeight(), k, mRecyclerView.getHeight(), l1);
	//  177  351:aload_0         
	//  178  352:getfield        #128 <Field ItemTouchHelper$Callback mCallback>
	//  179  355:aload_0         
	//  180  356:getfield        #140 <Field RecyclerView mRecyclerView>
	//  181  359:aload_0         
	//  182  360:getfield        #102 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//  183  363:getfield        #259 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//  184  366:invokevirtual   #263 <Method int View.getHeight()>
	//  185  369:iload_2         
	//  186  370:aload_0         
	//  187  371:getfield        #140 <Field RecyclerView mRecyclerView>
	//  188  374:invokevirtual   #197 <Method int RecyclerView.getHeight()>
	//  189  377:lload           4
	//  190  379:invokevirtual   #614 <Method int ItemTouchHelper$Callback.interpolateOutOfBoundsScroll(RecyclerView, int, int, int, long)>
	//  191  382:istore_2        
	//* 192  383:goto            386
		if(i == 0 && k == 0)
	//* 193  386:iload_1         
	//* 194  387:ifne            406
	//* 195  390:iload_2         
	//* 196  391:ifeq            397
	//* 197  394:goto            406
		{
			mDragScrollStartTimeInMs = 0x0L;
	//  198  397:aload_0         
	//  199  398:ldc2w           #570 <Long 0x0L>
	//  200  401:putfield        #573 <Field long mDragScrollStartTimeInMs>
			return false;
	//  201  404:iconst_0        
	//  202  405:ireturn         
		}
		if(mDragScrollStartTimeInMs == 0x0L)
	//* 203  406:aload_0         
	//* 204  407:getfield        #573 <Field long mDragScrollStartTimeInMs>
	//* 205  410:ldc2w           #570 <Long 0x0L>
	//* 206  413:lcmp            
	//* 207  414:ifne            423
			mDragScrollStartTimeInMs = l2;
	//  208  417:aload_0         
	//  209  418:lload           6
	//  210  420:putfield        #573 <Field long mDragScrollStartTimeInMs>
		mRecyclerView.scrollBy(i, k);
	//  211  423:aload_0         
	//  212  424:getfield        #140 <Field RecyclerView mRecyclerView>
	//  213  427:iload_1         
	//  214  428:iload_2         
	//  215  429:invokevirtual   #618 <Method void RecyclerView.scrollBy(int, int)>
		return true;
	//  216  432:iconst_1        
	//  217  433:ireturn         
	}

	void select(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
	{
		if(viewholder == mSelected && i == mActionState)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #102 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//*   3    5:if_acmpne       17
	//*   4    8:iload_2         
	//*   5    9:aload_0         
	//*   6   10:getfield        #106 <Field int mActionState>
	//*   7   13:icmpne          17
			return;
	//    8   16:return          
		mDragScrollStartTimeInMs = 0x0L;
	//    9   17:aload_0         
	//   10   18:ldc2w           #570 <Long 0x0L>
	//   11   21:putfield        #573 <Field long mDragScrollStartTimeInMs>
		int k = mActionState;
	//   12   24:aload_0         
	//   13   25:getfield        #106 <Field int mActionState>
	//   14   28:istore          9
		endRecoverAnimation(viewholder, true);
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:iconst_1        
	//   18   33:invokevirtual   #544 <Method void endRecoverAnimation(android.support.v7.widget.RecyclerView$ViewHolder, boolean)>
		mActionState = i;
	//   19   36:aload_0         
	//   20   37:iload_2         
	//   21   38:putfield        #106 <Field int mActionState>
		if(i == 2)
	//*  22   41:iload_2         
	//*  23   42:iconst_2        
	//*  24   43:icmpne          76
			if(viewholder != null)
	//*  25   46:aload_1         
	//*  26   47:ifnull          65
			{
				mOverdrawChild = viewholder.itemView;
	//   27   50:aload_0         
	//   28   51:aload_1         
	//   29   52:getfield        #259 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//   30   55:putfield        #119 <Field View mOverdrawChild>
				addChildDrawingOrderCallback();
	//   31   58:aload_0         
	//   32   59:invokespecial   #620 <Method void addChildDrawingOrderCallback()>
			} else
	//*  33   62:goto            76
			{
				throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
	//   34   65:new             #622 <Class IllegalArgumentException>
	//   35   68:dup             
	//   36   69:ldc2            #624 <String "Must pass a ViewHolder when dragging">
	//   37   72:invokespecial   #627 <Method void IllegalArgumentException(String)>
	//   38   75:athrow          
			}
		final Object final_viewholder = ((Object) (mSelected));
	//   39   76:aload_0         
	//   40   77:getfield        #102 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//   41   80:astore          11
		boolean flag;
		if(final_viewholder != null)
	//*  42   82:aload           11
	//*  43   84:ifnull          386
		{
			if(((android.support.v7.widget.RecyclerView.ViewHolder) (final_viewholder)).itemView.getParent() != null)
	//*  44   87:aload           11
	//*  45   89:getfield        #259 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  46   92:invokevirtual   #631 <Method ViewParent View.getParent()>
	//*  47   95:ifnull          353
			{
				int j;
				if(k == 2)
	//*  48   98:iload           9
	//*  49  100:iconst_2        
	//*  50  101:icmpne          110
					j = 0;
	//   51  104:iconst_0        
	//   52  105:istore          8
				else
	//*  53  107:goto            118
					j = swipeIfNecessary(((android.support.v7.widget.RecyclerView.ViewHolder) (final_viewholder)));
	//   54  110:aload_0         
	//   55  111:aload           11
	//   56  113:invokespecial   #633 <Method int swipeIfNecessary(android.support.v7.widget.RecyclerView$ViewHolder)>
	//   57  116:istore          8
				releaseVelocityTracker();
	//   58  118:aload_0         
	//   59  119:invokespecial   #234 <Method void releaseVelocityTracker()>
				float f;
				float f1;
				if(j != 4 && j != 8 && j != 16 && j != 32)
	//*  60  122:iload           8
	//*  61  124:iconst_4        
	//*  62  125:icmpeq          203
	//*  63  128:iload           8
	//*  64  130:bipush          8
	//*  65  132:icmpeq          203
	//*  66  135:iload           8
	//*  67  137:bipush          16
	//*  68  139:icmpeq          203
	//*  69  142:iload           8
	//*  70  144:bipush          32
	//*  71  146:icmpeq          203
				{
					switch(j)
	//*  72  149:iload           8
					{
	//*  73  151:tableswitch     1 2: default 172
	//	               1 180
	//	               2 180
					default:
						f = 0.0F;
	//   74  172:fconst_0        
	//   75  173:fstore_3        
						f1 = 0.0F;
	//   76  174:fconst_0        
	//   77  175:fstore          4
						break;

	//*  78  177:goto            223
					case 1: // '\001'
					case 2: // '\002'
						f1 = Math.signum(mDy) * (float)mRecyclerView.getHeight();
	//   79  180:aload_0         
	//   80  181:getfield        #194 <Field float mDy>
	//   81  184:invokestatic    #636 <Method float Math.signum(float)>
	//   82  187:aload_0         
	//   83  188:getfield        #140 <Field RecyclerView mRecyclerView>
	//   84  191:invokevirtual   #197 <Method int RecyclerView.getHeight()>
	//   85  194:i2f             
	//   86  195:fmul            
	//   87  196:fstore          4
						f = 0.0F;
	//   88  198:fconst_0        
	//   89  199:fstore_3        
						break;
					}
				} else
	//*  90  200:goto            223
				{
					f = Math.signum(mDx) * (float)mRecyclerView.getWidth();
	//   91  203:aload_0         
	//   92  204:getfield        #150 <Field float mDx>
	//   93  207:invokestatic    #636 <Method float Math.signum(float)>
	//   94  210:aload_0         
	//   95  211:getfield        #140 <Field RecyclerView mRecyclerView>
	//   96  214:invokevirtual   #187 <Method int RecyclerView.getWidth()>
	//   97  217:i2f             
	//   98  218:fmul            
	//   99  219:fstore_3        
					f1 = 0.0F;
	//  100  220:fconst_0        
	//  101  221:fstore          4
				}
				final byte final_i;
				if(k == 2)
	//* 102  223:iload           9
	//* 103  225:iconst_2        
	//* 104  226:icmpne          236
					final_i = 8;
	//  105  229:bipush          8
	//  106  231:istore          7
				else
	//* 107  233:goto            250
				if(j > 0)
	//* 108  236:iload           8
	//* 109  238:ifle            247
					final_i = 2;
	//  110  241:iconst_2        
	//  111  242:istore          7
				else
	//* 112  244:goto            250
					final_i = 4;
	//  113  247:iconst_4        
	//  114  248:istore          7
				getSelectedDxDy(mTmpPosition);
	//  115  250:aload_0         
	//  116  251:aload_0         
	//  117  252:getfield        #100 <Field float[] mTmpPosition>
	//  118  255:invokespecial   #551 <Method void getSelectedDxDy(float[])>
				float af[] = mTmpPosition;
	//  119  258:aload_0         
	//  120  259:getfield        #100 <Field float[] mTmpPosition>
	//  121  262:astore          12
				float f2 = af[0];
	//  122  264:aload           12
	//  123  266:iconst_0        
	//  124  267:faload          
	//  125  268:fstore          5
				float f3 = af[1];
	//  126  270:aload           12
	//  127  272:iconst_1        
	//  128  273:faload          
	//  129  274:fstore          6
				final_viewholder = ((Object) (new _cls3(k, f2, f3, f, f1, j, ((android.support.v7.widget.RecyclerView.ViewHolder) (final_viewholder)))));
	//  130  276:new             #638 <Class ItemTouchHelper$3>
	//  131  279:dup             
	//  132  280:aload_0         
	//  133  281:aload           11
	//  134  283:iload           7
	//  135  285:iload           9
	//  136  287:fload           5
	//  137  289:fload           6
	//  138  291:fload_3         
	//  139  292:fload           4
	//  140  294:iload           8
	//  141  296:aload           11
	//  142  298:invokespecial   #641 <Method void ItemTouchHelper$3(ItemTouchHelper, android.support.v7.widget.RecyclerView$ViewHolder, int, int, float, float, float, float, int, android.support.v7.widget.RecyclerView$ViewHolder)>
	//  143  301:astore          11
				((RecoverAnimation) (final_viewholder)).setDuration(mCallback.getAnimationDuration(mRecyclerView, ((int) (final_i)), f - f2, f1 - f3));
	//  144  303:aload           11
	//  145  305:aload_0         
	//  146  306:getfield        #128 <Field ItemTouchHelper$Callback mCallback>
	//  147  309:aload_0         
	//  148  310:getfield        #140 <Field RecyclerView mRecyclerView>
	//  149  313:iload           7
	//  150  315:fload_3         
	//  151  316:fload           5
	//  152  318:fsub            
	//  153  319:fload           4
	//  154  321:fload           6
	//  155  323:fsub            
	//  156  324:invokevirtual   #645 <Method long ItemTouchHelper$Callback.getAnimationDuration(RecyclerView, int, float, float)>
	//  157  327:invokevirtual   #649 <Method void ItemTouchHelper$RecoverAnimation.setDuration(long)>
				mRecoverAnimations.add(final_viewholder);
	//  158  330:aload_0         
	//  159  331:getfield        #108 <Field List mRecoverAnimations>
	//  160  334:aload           11
	//  161  336:invokeinterface #651 <Method boolean List.add(Object)>
	//  162  341:pop             
				((RecoverAnimation) (final_viewholder)).start();
	//  163  342:aload           11
	//  164  344:invokevirtual   #654 <Method void ItemTouchHelper$RecoverAnimation.start()>
				flag = true;
	//  165  347:iconst_1        
	//  166  348:istore          7
			} else
	//* 167  350:goto            378
			{
				removeChildDrawingOrderCallbackIfNecessary(((android.support.v7.widget.RecyclerView.ViewHolder) (final_viewholder)).itemView);
	//  168  353:aload_0         
	//  169  354:aload           11
	//  170  356:getfield        #259 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//  171  359:invokevirtual   #542 <Method void removeChildDrawingOrderCallbackIfNecessary(View)>
				mCallback.clearView(mRecyclerView, ((android.support.v7.widget.RecyclerView.ViewHolder) (final_viewholder)));
	//  172  362:aload_0         
	//  173  363:getfield        #128 <Field ItemTouchHelper$Callback mCallback>
	//  174  366:aload_0         
	//  175  367:getfield        #140 <Field RecyclerView mRecyclerView>
	//  176  370:aload           11
	//  177  372:invokevirtual   #228 <Method void ItemTouchHelper$Callback.clearView(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
				flag = false;
	//  178  375:iconst_0        
	//  179  376:istore          7
			}
			mSelected = null;
	//  180  378:aload_0         
	//  181  379:aconst_null     
	//  182  380:putfield        #102 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
		} else
	//* 183  383:goto            389
		{
			flag = false;
	//  184  386:iconst_0        
	//  185  387:istore          7
		}
		if(viewholder != null)
	//* 186  389:aload_1         
	//* 187  390:ifnull          481
		{
			mSelectedFlags = (mCallback.getAbsoluteMovementFlags(mRecyclerView, viewholder) & (1 << i * 8 + 8) - 1) >> mActionState * 8;
	//  188  393:aload_0         
	//  189  394:aload_0         
	//  190  395:getfield        #128 <Field ItemTouchHelper$Callback mCallback>
	//  191  398:aload_0         
	//  192  399:getfield        #140 <Field RecyclerView mRecyclerView>
	//  193  402:aload_1         
	//  194  403:invokevirtual   #457 <Method int ItemTouchHelper$Callback.getAbsoluteMovementFlags(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
	//  195  406:iconst_1        
	//  196  407:iload_2         
	//  197  408:bipush          8
	//  198  410:imul            
	//  199  411:bipush          8
	//  200  413:iadd            
	//  201  414:ishl            
	//  202  415:iconst_1        
	//  203  416:isub            
	//  204  417:iand            
	//  205  418:aload_0         
	//  206  419:getfield        #106 <Field int mActionState>
	//  207  422:bipush          8
	//  208  424:imul            
	//  209  425:ishr            
	//  210  426:putfield        #346 <Field int mSelectedFlags>
			mSelectedStartX = viewholder.itemView.getLeft();
	//  211  429:aload_0         
	//  212  430:aload_1         
	//  213  431:getfield        #259 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//  214  434:invokevirtual   #288 <Method int View.getLeft()>
	//  215  437:i2f             
	//  216  438:putfield        #248 <Field float mSelectedStartX>
			mSelectedStartY = viewholder.itemView.getTop();
	//  217  441:aload_0         
	//  218  442:aload_1         
	//  219  443:getfield        #259 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//  220  446:invokevirtual   #282 <Method int View.getTop()>
	//  221  449:i2f             
	//  222  450:putfield        #254 <Field float mSelectedStartY>
			mSelected = viewholder;
	//  223  453:aload_0         
	//  224  454:aload_1         
	//  225  455:putfield        #102 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
			if(i == 2)
	//* 226  458:iload_2         
	//* 227  459:iconst_2        
	//* 228  460:icmpne          478
				mSelected.itemView.performHapticFeedback(0);
	//  229  463:aload_0         
	//  230  464:getfield        #102 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//  231  467:getfield        #259 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//  232  470:iconst_0        
	//  233  471:invokevirtual   #658 <Method boolean View.performHapticFeedback(int)>
	//  234  474:pop             
		}
	//* 235  475:goto            481
	//* 236  478:goto            481
		boolean flag1 = false;
	//  237  481:iconst_0        
	//  238  482:istore          10
		viewholder = ((android.support.v7.widget.RecyclerView.ViewHolder) (mRecyclerView.getParent()));
	//  239  484:aload_0         
	//  240  485:getfield        #140 <Field RecyclerView mRecyclerView>
	//  241  488:invokevirtual   #659 <Method ViewParent RecyclerView.getParent()>
	//  242  491:astore_1        
		if(viewholder != null)
	//* 243  492:aload_1         
	//* 244  493:ifnull          514
		{
			if(mSelected != null)
	//* 245  496:aload_0         
	//* 246  497:getfield        #102 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//* 247  500:ifnull          506
				flag1 = true;
	//  248  503:iconst_1        
	//  249  504:istore          10
			((ViewParent) (viewholder)).requestDisallowInterceptTouchEvent(flag1);
	//  250  506:aload_1         
	//  251  507:iload           10
	//  252  509:invokeinterface #665 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
		}
		if(!flag)
	//* 253  514:iload           7
	//* 254  516:ifne            529
			mRecyclerView.getLayoutManager().requestSimpleAnimationsInNextLayout();
	//  255  519:aload_0         
	//  256  520:getfield        #140 <Field RecyclerView mRecyclerView>
	//  257  523:invokevirtual   #267 <Method android.support.v7.widget.RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
	//  258  526:invokevirtual   #668 <Method void android.support.v7.widget.RecyclerView$LayoutManager.requestSimpleAnimationsInNextLayout()>
		mCallback.onSelectedChanged(mSelected, mActionState);
	//  259  529:aload_0         
	//  260  530:getfield        #128 <Field ItemTouchHelper$Callback mCallback>
	//  261  533:aload_0         
	//  262  534:getfield        #102 <Field android.support.v7.widget.RecyclerView$ViewHolder mSelected>
	//  263  537:aload_0         
	//  264  538:getfield        #106 <Field int mActionState>
	//  265  541:invokevirtual   #671 <Method void ItemTouchHelper$Callback.onSelectedChanged(android.support.v7.widget.RecyclerView$ViewHolder, int)>
		mRecyclerView.invalidate();
	//  266  544:aload_0         
	//  267  545:getfield        #140 <Field RecyclerView mRecyclerView>
	//  268  548:invokevirtual   #674 <Method void RecyclerView.invalidate()>
	//  269  551:return          
	}

	public void startDrag(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
	{
		if(!mCallback.hasDragFlag(mRecyclerView, viewholder))
	//*   0    0:aload_0         
	//*   1    1:getfield        #128 <Field ItemTouchHelper$Callback mCallback>
	//*   2    4:aload_0         
	//*   3    5:getfield        #140 <Field RecyclerView mRecyclerView>
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #679 <Method boolean ItemTouchHelper$Callback.hasDragFlag(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
	//*   6   12:ifne            25
		{
			Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
	//    7   15:ldc1            #42  <String "ItemTouchHelper">
	//    8   17:ldc2            #681 <String "Start drag has been called but dragging is not enabled">
	//    9   20:invokestatic    #687 <Method int Log.e(String, String)>
	//   10   23:pop             
			return;
	//   11   24:return          
		}
		if(viewholder.itemView.getParent() != mRecyclerView)
	//*  12   25:aload_1         
	//*  13   26:getfield        #259 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  14   29:invokevirtual   #631 <Method ViewParent View.getParent()>
	//*  15   32:aload_0         
	//*  16   33:getfield        #140 <Field RecyclerView mRecyclerView>
	//*  17   36:if_acmpeq       49
		{
			Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
	//   18   39:ldc1            #42  <String "ItemTouchHelper">
	//   19   41:ldc2            #689 <String "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.">
	//   20   44:invokestatic    #687 <Method int Log.e(String, String)>
	//   21   47:pop             
			return;
	//   22   48:return          
		} else
		{
			obtainVelocityTracker();
	//   23   49:aload_0         
	//   24   50:invokevirtual   #691 <Method void obtainVelocityTracker()>
			mDy = 0.0F;
	//   25   53:aload_0         
	//   26   54:fconst_0        
	//   27   55:putfield        #194 <Field float mDy>
			mDx = 0.0F;
	//   28   58:aload_0         
	//   29   59:fconst_0        
	//   30   60:putfield        #150 <Field float mDx>
			select(viewholder, 2);
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:iconst_2        
	//   34   66:invokevirtual   #464 <Method void select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
			return;
	//   35   69:return          
		}
	}

	public void startSwipe(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
	{
		if(!mCallback.hasSwipeFlag(mRecyclerView, viewholder))
	//*   0    0:aload_0         
	//*   1    1:getfield        #128 <Field ItemTouchHelper$Callback mCallback>
	//*   2    4:aload_0         
	//*   3    5:getfield        #140 <Field RecyclerView mRecyclerView>
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #695 <Method boolean ItemTouchHelper$Callback.hasSwipeFlag(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
	//*   6   12:ifne            25
		{
			Log.e("ItemTouchHelper", "Start swipe has been called but swiping is not enabled");
	//    7   15:ldc1            #42  <String "ItemTouchHelper">
	//    8   17:ldc2            #697 <String "Start swipe has been called but swiping is not enabled">
	//    9   20:invokestatic    #687 <Method int Log.e(String, String)>
	//   10   23:pop             
			return;
	//   11   24:return          
		}
		if(viewholder.itemView.getParent() != mRecyclerView)
	//*  12   25:aload_1         
	//*  13   26:getfield        #259 <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
	//*  14   29:invokevirtual   #631 <Method ViewParent View.getParent()>
	//*  15   32:aload_0         
	//*  16   33:getfield        #140 <Field RecyclerView mRecyclerView>
	//*  17   36:if_acmpeq       49
		{
			Log.e("ItemTouchHelper", "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.");
	//   18   39:ldc1            #42  <String "ItemTouchHelper">
	//   19   41:ldc2            #699 <String "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.">
	//   20   44:invokestatic    #687 <Method int Log.e(String, String)>
	//   21   47:pop             
			return;
	//   22   48:return          
		} else
		{
			obtainVelocityTracker();
	//   23   49:aload_0         
	//   24   50:invokevirtual   #691 <Method void obtainVelocityTracker()>
			mDy = 0.0F;
	//   25   53:aload_0         
	//   26   54:fconst_0        
	//   27   55:putfield        #194 <Field float mDy>
			mDx = 0.0F;
	//   28   58:aload_0         
	//   29   59:fconst_0        
	//   30   60:putfield        #150 <Field float mDx>
			select(viewholder, 1);
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:iconst_1        
	//   34   66:invokevirtual   #464 <Method void select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
			return;
	//   35   69:return          
		}
	}

	void updateDxDy(MotionEvent motionevent, int i, int j)
	{
		float f = motionevent.getX(j);
	//    0    0:aload_1         
	//    1    1:iload_3         
	//    2    2:invokevirtual   #322 <Method float MotionEvent.getX(int)>
	//    3    5:fstore          4
		float f1 = motionevent.getY(j);
	//    4    7:aload_1         
	//    5    8:iload_3         
	//    6    9:invokevirtual   #327 <Method float MotionEvent.getY(int)>
	//    7   12:fstore          5
		mDx = f - mInitialTouchX;
	//    8   14:aload_0         
	//    9   15:fload           4
	//   10   17:aload_0         
	//   11   18:getfield        #324 <Field float mInitialTouchX>
	//   12   21:fsub            
	//   13   22:putfield        #150 <Field float mDx>
		mDy = f1 - mInitialTouchY;
	//   14   25:aload_0         
	//   15   26:fload           5
	//   16   28:aload_0         
	//   17   29:getfield        #329 <Field float mInitialTouchY>
	//   18   32:fsub            
	//   19   33:putfield        #194 <Field float mDy>
		if((i & 4) == 0)
	//*  20   36:iload_2         
	//*  21   37:iconst_4        
	//*  22   38:iand            
	//*  23   39:ifne            54
			mDx = Math.max(0.0F, mDx);
	//   24   42:aload_0         
	//   25   43:fconst_0        
	//   26   44:aload_0         
	//   27   45:getfield        #150 <Field float mDx>
	//   28   48:invokestatic    #705 <Method float Math.max(float, float)>
	//   29   51:putfield        #150 <Field float mDx>
		if((i & 8) == 0)
	//*  30   54:iload_2         
	//*  31   55:bipush          8
	//*  32   57:iand            
	//*  33   58:ifne            73
			mDx = Math.min(0.0F, mDx);
	//   34   61:aload_0         
	//   35   62:fconst_0        
	//   36   63:aload_0         
	//   37   64:getfield        #150 <Field float mDx>
	//   38   67:invokestatic    #708 <Method float Math.min(float, float)>
	//   39   70:putfield        #150 <Field float mDx>
		if((i & 1) == 0)
	//*  40   73:iload_2         
	//*  41   74:iconst_1        
	//*  42   75:iand            
	//*  43   76:ifne            91
			mDy = Math.max(0.0F, mDy);
	//   44   79:aload_0         
	//   45   80:fconst_0        
	//   46   81:aload_0         
	//   47   82:getfield        #194 <Field float mDy>
	//   48   85:invokestatic    #705 <Method float Math.max(float, float)>
	//   49   88:putfield        #194 <Field float mDy>
		if((i & 2) == 0)
	//*  50   91:iload_2         
	//*  51   92:iconst_2        
	//*  52   93:iand            
	//*  53   94:ifne            109
			mDy = Math.min(0.0F, mDy);
	//   54   97:aload_0         
	//   55   98:fconst_0        
	//   56   99:aload_0         
	//   57  100:getfield        #194 <Field float mDy>
	//   58  103:invokestatic    #708 <Method float Math.min(float, float)>
	//   59  106:putfield        #194 <Field float mDy>
	//   60  109:return          
	}

	static final int ACTION_MODE_DRAG_MASK = 0xff0000;
	private static final int ACTION_MODE_IDLE_MASK = 255;
	static final int ACTION_MODE_SWIPE_MASK = 65280;
	public static final int ACTION_STATE_DRAG = 2;
	public static final int ACTION_STATE_IDLE = 0;
	public static final int ACTION_STATE_SWIPE = 1;
	private static final int ACTIVE_POINTER_ID_NONE = -1;
	public static final int ANIMATION_TYPE_DRAG = 8;
	public static final int ANIMATION_TYPE_SWIPE_CANCEL = 4;
	public static final int ANIMATION_TYPE_SWIPE_SUCCESS = 2;
	private static final boolean DEBUG = false;
	static final int DIRECTION_FLAG_COUNT = 8;
	public static final int DOWN = 2;
	public static final int END = 32;
	public static final int LEFT = 4;
	private static final int PIXELS_PER_SECOND = 1000;
	public static final int RIGHT = 8;
	public static final int START = 16;
	private static final String TAG = "ItemTouchHelper";
	public static final int UP = 1;
	private int mActionState;
	int mActivePointerId;
	Callback mCallback;
	private android.support.v7.widget.RecyclerView.ChildDrawingOrderCallback mChildDrawingOrderCallback;
	private List mDistances;
	private long mDragScrollStartTimeInMs;
	float mDx;
	float mDy;
	g mGestureDetector;
	float mInitialTouchX;
	float mInitialTouchY;
	private ItemTouchHelperGestureListener mItemTouchHelperGestureListener;
	private float mMaxSwipeVelocity;
	private final android.support.v7.widget.RecyclerView.OnItemTouchListener mOnItemTouchListener = new _cls2();
	View mOverdrawChild;
	int mOverdrawChildPosition;
	final List mPendingCleanup = new ArrayList();
	List mRecoverAnimations;
	RecyclerView mRecyclerView;
	final Runnable mScrollRunnable = new _cls1();
	android.support.v7.widget.RecyclerView.ViewHolder mSelected;
	int mSelectedFlags;
	private float mSelectedStartX;
	private float mSelectedStartY;
	private int mSlop;
	private List mSwapTargets;
	private float mSwipeEscapeVelocity;
	private final float mTmpPosition[] = new float[2];
	private Rect mTmpRect;
	VelocityTracker mVelocityTracker;

	private class _cls1
		implements Runnable
	{

		public void run()
		{
			if(mSelected != null && scrollIfNecessary())
		//*   0    0:aload_0         
		//*   1    1:getfield        #12  <Field ItemTouchHelper this$0>
		//*   2    4:getfield        #23  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper.mSelected>
		//*   3    7:ifnull          72
		//*   4   10:aload_0         
		//*   5   11:getfield        #12  <Field ItemTouchHelper this$0>
		//*   6   14:invokevirtual   #27  <Method boolean ItemTouchHelper.scrollIfNecessary()>
		//*   7   17:ifeq            72
			{
				if(mSelected != null)
		//*   8   20:aload_0         
		//*   9   21:getfield        #12  <Field ItemTouchHelper this$0>
		//*  10   24:getfield        #23  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper.mSelected>
		//*  11   27:ifnull          43
				{
					ItemTouchHelper itemtouchhelper = ItemTouchHelper.this;
		//   12   30:aload_0         
		//   13   31:getfield        #12  <Field ItemTouchHelper this$0>
		//   14   34:astore_1        
					itemtouchhelper.moveIfNecessary(itemtouchhelper.mSelected);
		//   15   35:aload_1         
		//   16   36:aload_1         
		//   17   37:getfield        #23  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper.mSelected>
		//   18   40:invokevirtual   #31  <Method void ItemTouchHelper.moveIfNecessary(android.support.v7.widget.RecyclerView$ViewHolder)>
				}
				mRecyclerView.removeCallbacks(mScrollRunnable);
		//   19   43:aload_0         
		//   20   44:getfield        #12  <Field ItemTouchHelper this$0>
		//   21   47:getfield        #35  <Field RecyclerView ItemTouchHelper.mRecyclerView>
		//   22   50:aload_0         
		//   23   51:getfield        #12  <Field ItemTouchHelper this$0>
		//   24   54:getfield        #39  <Field Runnable ItemTouchHelper.mScrollRunnable>
		//   25   57:invokevirtual   #45  <Method boolean RecyclerView.removeCallbacks(Runnable)>
		//   26   60:pop             
				ac.a(((View) (mRecyclerView)), ((Runnable) (this)));
		//   27   61:aload_0         
		//   28   62:getfield        #12  <Field ItemTouchHelper this$0>
		//   29   65:getfield        #35  <Field RecyclerView ItemTouchHelper.mRecyclerView>
		//   30   68:aload_0         
		//   31   69:invokestatic    #51  <Method void ac.a(View, Runnable)>
			}
		//   32   72:return          
		}

		final ItemTouchHelper this$0;

		_cls1()
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


	private class _cls2
		implements android.support.v7.widget.RecyclerView.OnItemTouchListener
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
						itemtouchhelper.mInitialTouchX = itemtouchhelper.mInitialTouchX - ((RecoverAnimation) (recyclerview)).mX;
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
						itemtouchhelper.mInitialTouchY = itemtouchhelper.mInitialTouchY - ((RecoverAnimation) (recyclerview)).mY;
		//   54  112:aload           5
		//   55  114:aload           5
		//   56  116:getfield        #58  <Field float ItemTouchHelper.mInitialTouchY>
		//   57  119:aload_1         
		//   58  120:getfield        #77  <Field float ItemTouchHelper$RecoverAnimation.mY>
		//   59  123:fsub            
		//   60  124:putfield        #58  <Field float ItemTouchHelper.mInitialTouchY>
						endRecoverAnimation(((RecoverAnimation) (recyclerview)).mViewHolder, true);
		//   61  127:aload_0         
		//   62  128:getfield        #12  <Field ItemTouchHelper this$0>
		//   63  131:aload_1         
		//   64  132:getfield        #80  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
		//   65  135:iconst_1        
		//   66  136:invokevirtual   #84  <Method void ItemTouchHelper.endRecoverAnimation(android.support.v7.widget.RecyclerView$ViewHolder, boolean)>
						if(mPendingCleanup.remove(((Object) (((RecoverAnimation) (recyclerview)).mViewHolder.itemView))))
		//*  67  139:aload_0         
		//*  68  140:getfield        #12  <Field ItemTouchHelper this$0>
		//*  69  143:getfield        #88  <Field List ItemTouchHelper.mPendingCleanup>
		//*  70  146:aload_1         
		//*  71  147:getfield        #80  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
		//*  72  150:getfield        #94  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//*  73  153:invokeinterface #100 <Method boolean List.remove(Object)>
		//*  74  158:ifeq            182
							mCallback.clearView(mRecyclerView, ((RecoverAnimation) (recyclerview)).mViewHolder);
		//   75  161:aload_0         
		//   76  162:getfield        #12  <Field ItemTouchHelper this$0>
		//   77  165:getfield        #104 <Field ItemTouchHelper$Callback ItemTouchHelper.mCallback>
		//   78  168:aload_0         
		//   79  169:getfield        #12  <Field ItemTouchHelper this$0>
		//   80  172:getfield        #108 <Field RecyclerView ItemTouchHelper.mRecyclerView>
		//   81  175:aload_1         
		//   82  176:getfield        #80  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
		//   83  179:invokevirtual   #114 <Method void ItemTouchHelper$Callback.clearView(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
						select(((RecoverAnimation) (recyclerview)).mViewHolder, ((RecoverAnimation) (recyclerview)).mActionState);
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
				((ItemTouchHelper) (recyclerview)).select(((android.support.v7.widget.RecyclerView.ViewHolder) (null)), 0);
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
				select(((android.support.v7.widget.RecyclerView.ViewHolder) (null)), 0);
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
		//		               1 229
		//		               2 156
		//		               3 133
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
							moveIfNecessary(((android.support.v7.widget.RecyclerView.ViewHolder) (recyclerview)));
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
					select(((android.support.v7.widget.RecyclerView.ViewHolder) (null)), 0);
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

		_cls2()
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


	private class _cls5
		implements android.support.v7.widget.RecyclerView.ChildDrawingOrderCallback
	{

		public int onGetChildDrawingOrder(int i, int j)
		{
			if(mOverdrawChild == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #12  <Field ItemTouchHelper this$0>
		//*   2    4:getfield        #24  <Field View ItemTouchHelper.mOverdrawChild>
		//*   3    7:ifnonnull       12
				return j;
		//    4   10:iload_2         
		//    5   11:ireturn         
			int l = mOverdrawChildPosition;
		//    6   12:aload_0         
		//    7   13:getfield        #12  <Field ItemTouchHelper this$0>
		//    8   16:getfield        #28  <Field int ItemTouchHelper.mOverdrawChildPosition>
		//    9   19:istore          4
			int k = l;
		//   10   21:iload           4
		//   11   23:istore_3        
			if(l == -1)
		//*  12   24:iload           4
		//*  13   26:iconst_m1       
		//*  14   27:icmpne          56
			{
				k = mRecyclerView.indexOfChild(mOverdrawChild);
		//   15   30:aload_0         
		//   16   31:getfield        #12  <Field ItemTouchHelper this$0>
		//   17   34:getfield        #32  <Field RecyclerView ItemTouchHelper.mRecyclerView>
		//   18   37:aload_0         
		//   19   38:getfield        #12  <Field ItemTouchHelper this$0>
		//   20   41:getfield        #24  <Field View ItemTouchHelper.mOverdrawChild>
		//   21   44:invokevirtual   #38  <Method int RecyclerView.indexOfChild(View)>
		//   22   47:istore_3        
				mOverdrawChildPosition = k;
		//   23   48:aload_0         
		//   24   49:getfield        #12  <Field ItemTouchHelper this$0>
		//   25   52:iload_3         
		//   26   53:putfield        #28  <Field int ItemTouchHelper.mOverdrawChildPosition>
			}
			if(j == i - 1)
		//*  27   56:iload_2         
		//*  28   57:iload_1         
		//*  29   58:iconst_1        
		//*  30   59:isub            
		//*  31   60:icmpne          65
				return k;
		//   32   63:iload_3         
		//   33   64:ireturn         
			if(j < k)
		//*  34   65:iload_2         
		//*  35   66:iload_3         
		//*  36   67:icmpge          72
				return j;
		//   37   70:iload_2         
		//   38   71:ireturn         
			else
				return j + 1;
		//   39   72:iload_2         
		//   40   73:iconst_1        
		//   41   74:iadd            
		//   42   75:ireturn         
		}

		final ItemTouchHelper this$0;

		_cls5()
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


	private class Callback
	{

		public static int convertToRelativeDirection(int i, int j)
		{
			int k = i & 0xc0c0c;
		//    0    0:iload_0         
		//    1    1:ldc1            #7   <Int 0xc0c0c>
		//    2    3:iand            
		//    3    4:istore_2        
			if(k == 0)
		//*   4    5:iload_2         
		//*   5    6:ifne            11
				return i;
		//    6    9:iload_0         
		//    7   10:ireturn         
			i &= ~k;
		//    8   11:iload_0         
		//    9   12:iload_2         
		//   10   13:iconst_m1       
		//   11   14:ixor            
		//   12   15:iand            
		//   13   16:istore_0        
			if(j == 0)
		//*  14   17:iload_1         
		//*  15   18:ifne            27
			{
				return i | k << 2;
		//   16   21:iload_0         
		//   17   22:iload_2         
		//   18   23:iconst_2        
		//   19   24:ishl            
		//   20   25:ior             
		//   21   26:ireturn         
			} else
			{
				j = k << 1;
		//   22   27:iload_2         
		//   23   28:iconst_1        
		//   24   29:ishl            
		//   25   30:istore_1        
				return i | 0xfff3f3f3 & j | (j & 0xc0c0c) << 2;
		//   26   31:iload_0         
		//   27   32:ldc1            #42  <Int 0xfff3f3f3>
		//   28   34:iload_1         
		//   29   35:iand            
		//   30   36:ior             
		//   31   37:iload_1         
		//   32   38:ldc1            #7   <Int 0xc0c0c>
		//   33   40:iand            
		//   34   41:iconst_2        
		//   35   42:ishl            
		//   36   43:ior             
		//   37   44:ireturn         
			}
		}

		public static ItemTouchUIUtil getDefaultUIUtil()
		{
			return ItemTouchUIUtilImpl.INSTANCE;
		//    0    0:getstatic       #50  <Field ItemTouchUIUtil ItemTouchUIUtilImpl.INSTANCE>
		//    1    3:areturn         
		}

		private int getMaxDragScroll(RecyclerView recyclerview)
		{
			if(mCachedMaxScrollSpeed == -1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #39  <Field int mCachedMaxScrollSpeed>
		//*   2    4:iconst_m1       
		//*   3    5:icmpne          22
				mCachedMaxScrollSpeed = recyclerview.getResources().getDimensionPixelSize(android.support.v7.recyclerview.R.dimen.item_touch_helper_max_drag_scroll_per_frame);
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:invokevirtual   #58  <Method Resources RecyclerView.getResources()>
		//    7   13:getstatic       #63  <Field int android.support.v7.recyclerview.R$dimen.item_touch_helper_max_drag_scroll_per_frame>
		//    8   16:invokevirtual   #69  <Method int Resources.getDimensionPixelSize(int)>
		//    9   19:putfield        #39  <Field int mCachedMaxScrollSpeed>
			return mCachedMaxScrollSpeed;
		//   10   22:aload_0         
		//   11   23:getfield        #39  <Field int mCachedMaxScrollSpeed>
		//   12   26:ireturn         
		}

		public static int makeFlag(int i, int j)
		{
			return j << i * 8;
		//    0    0:iload_1         
		//    1    1:iload_0         
		//    2    2:bipush          8
		//    3    4:imul            
		//    4    5:ishl            
		//    5    6:ireturn         
		}

		public static int makeMovementFlags(int i, int j)
		{
			int k = makeFlag(0, j | i);
		//    0    0:iconst_0        
		//    1    1:iload_1         
		//    2    2:iload_0         
		//    3    3:ior             
		//    4    4:invokestatic    #73  <Method int makeFlag(int, int)>
		//    5    7:istore_2        
			j = makeFlag(1, j);
		//    6    8:iconst_1        
		//    7    9:iload_1         
		//    8   10:invokestatic    #73  <Method int makeFlag(int, int)>
		//    9   13:istore_1        
			return makeFlag(2, i) | (j | k);
		//   10   14:iconst_2        
		//   11   15:iload_0         
		//   12   16:invokestatic    #73  <Method int makeFlag(int, int)>
		//   13   19:iload_1         
		//   14   20:iload_2         
		//   15   21:ior             
		//   16   22:ior             
		//   17   23:ireturn         
		}

		public boolean canDropOver(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder, android.support.v7.widget.RecyclerView.ViewHolder viewholder1)
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public android.support.v7.widget.RecyclerView.ViewHolder chooseDropTarget(android.support.v7.widget.RecyclerView.ViewHolder viewholder, List list, int i, int j)
		{
			int l1 = viewholder.itemView.getWidth();
		//    0    0:aload_1         
		//    1    1:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//    2    4:invokevirtual   #89  <Method int View.getWidth()>
		//    3    7:istore          9
			int i2 = viewholder.itemView.getHeight();
		//    4    9:aload_1         
		//    5   10:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//    6   13:invokevirtual   #92  <Method int View.getHeight()>
		//    7   16:istore          10
			int j2 = i - viewholder.itemView.getLeft();
		//    8   18:iload_3         
		//    9   19:aload_1         
		//   10   20:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   11   23:invokevirtual   #95  <Method int View.getLeft()>
		//   12   26:isub            
		//   13   27:istore          11
			int k2 = j - viewholder.itemView.getTop();
		//   14   29:iload           4
		//   15   31:aload_1         
		//   16   32:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   17   35:invokevirtual   #98  <Method int View.getTop()>
		//   18   38:isub            
		//   19   39:istore          12
			int l2 = list.size();
		//   20   41:aload_2         
		//   21   42:invokeinterface #103 <Method int List.size()>
		//   22   47:istore          13
			android.support.v7.widget.RecyclerView.ViewHolder viewholder3 = null;
		//   23   49:aconst_null     
		//   24   50:astore          16
			int k = -1;
		//   25   52:iconst_m1       
		//   26   53:istore          5
			for(int i1 = 0; i1 < l2; i1++)
		//*  27   55:iconst_0        
		//*  28   56:istore          7
		//*  29   58:iload           7
		//*  30   60:iload           13
		//*  31   62:icmpge          413
			{
				int l;
				android.support.v7.widget.RecyclerView.ViewHolder viewholder1;
label0:
				{
					viewholder1 = (android.support.v7.widget.RecyclerView.ViewHolder)list.get(i1);
		//   32   65:aload_2         
		//   33   66:iload           7
		//   34   68:invokeinterface #107 <Method Object List.get(int)>
		//   35   73:checkcast       #79  <Class android.support.v7.widget.RecyclerView$ViewHolder>
		//   36   76:astore          14
					if(j2 > 0)
		//*  37   78:iload           11
		//*  38   80:ifle            142
					{
						l = viewholder1.itemView.getRight() - (i + l1);
		//   39   83:aload           14
		//   40   85:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   41   88:invokevirtual   #110 <Method int View.getRight()>
		//   42   91:iload_3         
		//   43   92:iload           9
		//   44   94:iadd            
		//   45   95:isub            
		//   46   96:istore          6
						if(l < 0 && viewholder1.itemView.getRight() > viewholder.itemView.getRight())
		//*  47   98:iload           6
		//*  48  100:ifge            142
		//*  49  103:aload           14
		//*  50  105:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//*  51  108:invokevirtual   #110 <Method int View.getRight()>
		//*  52  111:aload_1         
		//*  53  112:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//*  54  115:invokevirtual   #110 <Method int View.getRight()>
		//*  55  118:icmple          142
						{
							l = Math.abs(l);
		//   56  121:iload           6
		//   57  123:invokestatic    #115 <Method int Math.abs(int)>
		//   58  126:istore          6
							if(l > k)
		//*  59  128:iload           6
		//*  60  130:iload           5
		//*  61  132:icmple          142
							{
								viewholder3 = viewholder1;
		//   62  135:aload           14
		//   63  137:astore          16
								break label0;
		//   64  139:goto            146
							}
						}
					}
					l = k;
		//   65  142:iload           5
		//   66  144:istore          6
				}
				android.support.v7.widget.RecyclerView.ViewHolder viewholder2 = viewholder3;
		//   67  146:aload           16
		//   68  148:astore          15
				k = l;
		//   69  150:iload           6
		//   70  152:istore          5
				if(j2 < 0)
		//*  71  154:iload           11
		//*  72  156:ifge            240
				{
					int j1 = viewholder1.itemView.getLeft() - i;
		//   73  159:aload           14
		//   74  161:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   75  164:invokevirtual   #95  <Method int View.getLeft()>
		//   76  167:iload_3         
		//   77  168:isub            
		//   78  169:istore          8
					viewholder2 = viewholder3;
		//   79  171:aload           16
		//   80  173:astore          15
					k = l;
		//   81  175:iload           6
		//   82  177:istore          5
					if(j1 > 0)
		//*  83  179:iload           8
		//*  84  181:ifle            240
					{
						viewholder2 = viewholder3;
		//   85  184:aload           16
		//   86  186:astore          15
						k = l;
		//   87  188:iload           6
		//   88  190:istore          5
						if(viewholder1.itemView.getLeft() < viewholder.itemView.getLeft())
		//*  89  192:aload           14
		//*  90  194:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//*  91  197:invokevirtual   #95  <Method int View.getLeft()>
		//*  92  200:aload_1         
		//*  93  201:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//*  94  204:invokevirtual   #95  <Method int View.getLeft()>
		//*  95  207:icmpge          240
						{
							j1 = Math.abs(j1);
		//   96  210:iload           8
		//   97  212:invokestatic    #115 <Method int Math.abs(int)>
		//   98  215:istore          8
							viewholder2 = viewholder3;
		//   99  217:aload           16
		//  100  219:astore          15
							k = l;
		//  101  221:iload           6
		//  102  223:istore          5
							if(j1 > l)
		//* 103  225:iload           8
		//* 104  227:iload           6
		//* 105  229:icmple          240
							{
								k = j1;
		//  106  232:iload           8
		//  107  234:istore          5
								viewholder2 = viewholder1;
		//  108  236:aload           14
		//  109  238:astore          15
							}
						}
					}
				}
				viewholder3 = viewholder2;
		//  110  240:aload           15
		//  111  242:astore          16
				l = k;
		//  112  244:iload           5
		//  113  246:istore          6
				if(k2 < 0)
		//* 114  248:iload           12
		//* 115  250:ifge            335
				{
					int k1 = viewholder1.itemView.getTop() - j;
		//  116  253:aload           14
		//  117  255:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//  118  258:invokevirtual   #98  <Method int View.getTop()>
		//  119  261:iload           4
		//  120  263:isub            
		//  121  264:istore          8
					viewholder3 = viewholder2;
		//  122  266:aload           15
		//  123  268:astore          16
					l = k;
		//  124  270:iload           5
		//  125  272:istore          6
					if(k1 > 0)
		//* 126  274:iload           8
		//* 127  276:ifle            335
					{
						viewholder3 = viewholder2;
		//  128  279:aload           15
		//  129  281:astore          16
						l = k;
		//  130  283:iload           5
		//  131  285:istore          6
						if(viewholder1.itemView.getTop() < viewholder.itemView.getTop())
		//* 132  287:aload           14
		//* 133  289:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//* 134  292:invokevirtual   #98  <Method int View.getTop()>
		//* 135  295:aload_1         
		//* 136  296:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//* 137  299:invokevirtual   #98  <Method int View.getTop()>
		//* 138  302:icmpge          335
						{
							k1 = Math.abs(k1);
		//  139  305:iload           8
		//  140  307:invokestatic    #115 <Method int Math.abs(int)>
		//  141  310:istore          8
							viewholder3 = viewholder2;
		//  142  312:aload           15
		//  143  314:astore          16
							l = k;
		//  144  316:iload           5
		//  145  318:istore          6
							if(k1 > k)
		//* 146  320:iload           8
		//* 147  322:iload           5
		//* 148  324:icmple          335
							{
								l = k1;
		//  149  327:iload           8
		//  150  329:istore          6
								viewholder3 = viewholder1;
		//  151  331:aload           14
		//  152  333:astore          16
							}
						}
					}
				}
				if(k2 > 0)
		//* 153  335:iload           12
		//* 154  337:ifle            400
				{
					k = viewholder1.itemView.getBottom() - (j + i2);
		//  155  340:aload           14
		//  156  342:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//  157  345:invokevirtual   #118 <Method int View.getBottom()>
		//  158  348:iload           4
		//  159  350:iload           10
		//  160  352:iadd            
		//  161  353:isub            
		//  162  354:istore          5
					if(k < 0 && viewholder1.itemView.getBottom() > viewholder.itemView.getBottom())
		//* 163  356:iload           5
		//* 164  358:ifge            400
		//* 165  361:aload           14
		//* 166  363:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//* 167  366:invokevirtual   #118 <Method int View.getBottom()>
		//* 168  369:aload_1         
		//* 169  370:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//* 170  373:invokevirtual   #118 <Method int View.getBottom()>
		//* 171  376:icmple          400
					{
						k = Math.abs(k);
		//  172  379:iload           5
		//  173  381:invokestatic    #115 <Method int Math.abs(int)>
		//  174  384:istore          5
						if(k > l)
		//* 175  386:iload           5
		//* 176  388:iload           6
		//* 177  390:icmple          400
						{
							viewholder3 = viewholder1;
		//  178  393:aload           14
		//  179  395:astore          16
							continue;
		//  180  397:goto            404
						}
					}
				}
				k = l;
		//  181  400:iload           6
		//  182  402:istore          5
			}

		//  183  404:iload           7
		//  184  406:iconst_1        
		//  185  407:iadd            
		//  186  408:istore          7
		//* 187  410:goto            58
			return viewholder3;
		//  188  413:aload           16
		//  189  415:areturn         
		}

		public void clearView(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder)
		{
			ItemTouchUIUtilImpl.INSTANCE.clearView(viewholder.itemView);
		//    0    0:getstatic       #50  <Field ItemTouchUIUtil ItemTouchUIUtilImpl.INSTANCE>
		//    1    3:aload_2         
		//    2    4:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//    3    7:invokeinterface #125 <Method void ItemTouchUIUtil.clearView(View)>
		//    4   12:return          
		}

		public int convertToAbsoluteDirection(int i, int j)
		{
			int k = i & 0x303030;
		//    0    0:iload_1         
		//    1    1:ldc1            #17  <Int 0x303030>
		//    2    3:iand            
		//    3    4:istore_3        
			if(k == 0)
		//*   4    5:iload_3         
		//*   5    6:ifne            11
				return i;
		//    6    9:iload_1         
		//    7   10:ireturn         
			i &= ~k;
		//    8   11:iload_1         
		//    9   12:iload_3         
		//   10   13:iconst_m1       
		//   11   14:ixor            
		//   12   15:iand            
		//   13   16:istore_1        
			if(j == 0)
		//*  14   17:iload_2         
		//*  15   18:ifne            27
			{
				return i | k >> 2;
		//   16   21:iload_1         
		//   17   22:iload_3         
		//   18   23:iconst_2        
		//   19   24:ishr            
		//   20   25:ior             
		//   21   26:ireturn         
			} else
			{
				j = k >> 1;
		//   22   27:iload_3         
		//   23   28:iconst_1        
		//   24   29:ishr            
		//   25   30:istore_2        
				return i | 0xffcfcfcf & j | (j & 0x303030) >> 2;
		//   26   31:iload_1         
		//   27   32:ldc1            #127 <Int 0xffcfcfcf>
		//   28   34:iload_2         
		//   29   35:iand            
		//   30   36:ior             
		//   31   37:iload_2         
		//   32   38:ldc1            #17  <Int 0x303030>
		//   33   40:iand            
		//   34   41:iconst_2        
		//   35   42:ishr            
		//   36   43:ior             
		//   37   44:ireturn         
			}
		}

		final int getAbsoluteMovementFlags(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder)
		{
			return convertToAbsoluteDirection(getMovementFlags(recyclerview, viewholder), ac.f(((View) (recyclerview))));
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:aload_1         
		//    3    3:aload_2         
		//    4    4:invokevirtual   #132 <Method int getMovementFlags(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
		//    5    7:aload_1         
		//    6    8:invokestatic    #138 <Method int ac.f(View)>
		//    7   11:invokevirtual   #140 <Method int convertToAbsoluteDirection(int, int)>
		//    8   14:ireturn         
		}

		public long getAnimationDuration(RecyclerView recyclerview, int i, float f, float f1)
		{
			recyclerview = ((RecyclerView) (recyclerview.getItemAnimator()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #146 <Method android.support.v7.widget.RecyclerView$ItemAnimator RecyclerView.getItemAnimator()>
		//    2    4:astore_1        
			if(recyclerview == null)
		//*   3    5:aload_1         
		//*   4    6:ifnonnull       23
				return i != 8 ? 250L : 200L;
		//    5    9:iload_2         
		//    6   10:bipush          8
		//    7   12:icmpne          19
		//    8   15:ldc2w           #147 <Long 200L>
		//    9   18:lreturn         
		//   10   19:ldc2w           #149 <Long 250L>
		//   11   22:lreturn         
			if(i == 8)
		//*  12   23:iload_2         
		//*  13   24:bipush          8
		//*  14   26:icmpne          34
				return ((android.support.v7.widget.RecyclerView.ItemAnimator) (recyclerview)).getMoveDuration();
		//   15   29:aload_1         
		//   16   30:invokevirtual   #156 <Method long android.support.v7.widget.RecyclerView$ItemAnimator.getMoveDuration()>
		//   17   33:lreturn         
			else
				return ((android.support.v7.widget.RecyclerView.ItemAnimator) (recyclerview)).getRemoveDuration();
		//   18   34:aload_1         
		//   19   35:invokevirtual   #159 <Method long android.support.v7.widget.RecyclerView$ItemAnimator.getRemoveDuration()>
		//   20   38:lreturn         
		}

		public int getBoundingBoxMargin()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public float getMoveThreshold(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
		{
			return 0.5F;
		//    0    0:ldc1            #163 <Float 0.5F>
		//    1    2:freturn         
		}

		public abstract int getMovementFlags(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder);

		public float getSwipeEscapeVelocity(float f)
		{
			return f;
		//    0    0:fload_1         
		//    1    1:freturn         
		}

		public float getSwipeThreshold(android.support.v7.widget.RecyclerView.ViewHolder viewholder)
		{
			return 0.5F;
		//    0    0:ldc1            #163 <Float 0.5F>
		//    1    2:freturn         
		}

		public float getSwipeVelocityThreshold(float f)
		{
			return f;
		//    0    0:fload_1         
		//    1    1:freturn         
		}

		boolean hasDragFlag(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder)
		{
			return (getAbsoluteMovementFlags(recyclerview, viewholder) & 0xff0000) != 0;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #171 <Method int getAbsoluteMovementFlags(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
		//    4    6:ldc1            #172 <Int 0xff0000>
		//    5    8:iand            
		//    6    9:ifeq            14
		//    7   12:iconst_1        
		//    8   13:ireturn         
		//    9   14:iconst_0        
		//   10   15:ireturn         
		}

		boolean hasSwipeFlag(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder)
		{
			return (getAbsoluteMovementFlags(recyclerview, viewholder) & 0xff00) != 0;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #171 <Method int getAbsoluteMovementFlags(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
		//    4    6:ldc1            #174 <Int 65280>
		//    5    8:iand            
		//    6    9:ifeq            14
		//    7   12:iconst_1        
		//    8   13:ireturn         
		//    9   14:iconst_0        
		//   10   15:ireturn         
		}

		public int interpolateOutOfBoundsScroll(RecyclerView recyclerview, int i, int j, int k, long l)
		{
			k = getMaxDragScroll(recyclerview);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #178 <Method int getMaxDragScroll(RecyclerView)>
		//    3    5:istore          4
			int i1 = Math.abs(j);
		//    4    7:iload_3         
		//    5    8:invokestatic    #115 <Method int Math.abs(int)>
		//    6   11:istore          9
			int j1 = (int)Math.signum(j);
		//    7   13:iload_3         
		//    8   14:i2f             
		//    9   15:invokestatic    #181 <Method float Math.signum(float)>
		//   10   18:f2i             
		//   11   19:istore          10
			float f1 = i1;
		//   12   21:iload           9
		//   13   23:i2f             
		//   14   24:fstore          8
			float f = 1.0F;
		//   15   26:fconst_1        
		//   16   27:fstore          7
			f1 = Math.min(1.0F, (f1 * 1.0F) / (float)i);
		//   17   29:fconst_1        
		//   18   30:fload           8
		//   19   32:fconst_1        
		//   20   33:fmul            
		//   21   34:iload_2         
		//   22   35:i2f             
		//   23   36:fdiv            
		//   24   37:invokestatic    #185 <Method float Math.min(float, float)>
		//   25   40:fstore          8
			i = (int)((float)(j1 * k) * sDragViewScrollCapInterpolator.getInterpolation(f1));
		//   26   42:iload           10
		//   27   44:iload           4
		//   28   46:imul            
		//   29   47:i2f             
		//   30   48:getstatic       #35  <Field Interpolator sDragViewScrollCapInterpolator>
		//   31   51:fload           8
		//   32   53:invokeinterface #190 <Method float Interpolator.getInterpolation(float)>
		//   33   58:fmul            
		//   34   59:f2i             
		//   35   60:istore_2        
			if(l <= 2000L)
		//*  36   61:lload           5
		//*  37   63:ldc2w           #14  <Long 2000L>
		//*  38   66:lcmp            
		//*  39   67:ifle            73
		//*  40   70:goto            81
				f = (float)l / 2000F;
		//   41   73:lload           5
		//   42   75:l2f             
		//   43   76:ldc1            #191 <Float 2000F>
		//   44   78:fdiv            
		//   45   79:fstore          7
			i = (int)((float)i * sDragScrollInterpolator.getInterpolation(f));
		//   46   81:iload_2         
		//   47   82:i2f             
		//   48   83:getstatic       #30  <Field Interpolator sDragScrollInterpolator>
		//   49   86:fload           7
		//   50   88:invokeinterface #190 <Method float Interpolator.getInterpolation(float)>
		//   51   93:fmul            
		//   52   94:f2i             
		//   53   95:istore_2        
			if(i == 0)
		//*  54   96:iload_2         
		//*  55   97:ifne            108
				return j <= 0 ? -1 : 1;
		//   56  100:iload_3         
		//   57  101:ifle            106
		//   58  104:iconst_1        
		//   59  105:ireturn         
		//   60  106:iconst_m1       
		//   61  107:ireturn         
			else
				return i;
		//   62  108:iload_2         
		//   63  109:ireturn         
		}

		public boolean isItemViewSwipeEnabled()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public boolean isLongPressDragEnabled()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public void onChildDraw(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder, float f, float f1, int i, boolean flag)
		{
			ItemTouchUIUtilImpl.INSTANCE.onDraw(canvas, recyclerview, viewholder.itemView, f, f1, i, flag);
		//    0    0:getstatic       #50  <Field ItemTouchUIUtil ItemTouchUIUtilImpl.INSTANCE>
		//    1    3:aload_1         
		//    2    4:aload_2         
		//    3    5:aload_3         
		//    4    6:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//    5    9:fload           4
		//    6   11:fload           5
		//    7   13:iload           6
		//    8   15:iload           7
		//    9   17:invokeinterface #200 <Method void ItemTouchUIUtil.onDraw(Canvas, RecyclerView, View, float, float, int, boolean)>
		//   10   22:return          
		}

		public void onChildDrawOver(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder, float f, float f1, int i, boolean flag)
		{
			ItemTouchUIUtilImpl.INSTANCE.onDrawOver(canvas, recyclerview, viewholder.itemView, f, f1, i, flag);
		//    0    0:getstatic       #50  <Field ItemTouchUIUtil ItemTouchUIUtilImpl.INSTANCE>
		//    1    3:aload_1         
		//    2    4:aload_2         
		//    3    5:aload_3         
		//    4    6:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//    5    9:fload           4
		//    6   11:fload           5
		//    7   13:iload           6
		//    8   15:iload           7
		//    9   17:invokeinterface #204 <Method void ItemTouchUIUtil.onDrawOver(Canvas, RecyclerView, View, float, float, int, boolean)>
		//   10   22:return          
		}

		void onDraw(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder, List list, int i, float f, float f1)
		{
			int l = list.size();
		//    0    0:aload           4
		//    1    2:invokeinterface #103 <Method int List.size()>
		//    2    7:istore          9
			for(int j = 0; j < l; j++)
		//*   3    9:iconst_0        
		//*   4   10:istore          8
		//*   5   12:iload           8
		//*   6   14:iload           9
		//*   7   16:icmpge          86
			{
				RecoverAnimation recoveranimation = (RecoverAnimation)list.get(j);
		//    8   19:aload           4
		//    9   21:iload           8
		//   10   23:invokeinterface #107 <Method Object List.get(int)>
		//   11   28:checkcast       #207 <Class ItemTouchHelper$RecoverAnimation>
		//   12   31:astore          11
				recoveranimation.update();
		//   13   33:aload           11
		//   14   35:invokevirtual   #210 <Method void ItemTouchHelper$RecoverAnimation.update()>
				int i1 = canvas.save();
		//   15   38:aload_1         
		//   16   39:invokevirtual   #215 <Method int Canvas.save()>
		//   17   42:istore          10
				onChildDraw(canvas, recyclerview, recoveranimation.mViewHolder, recoveranimation.mX, recoveranimation.mY, recoveranimation.mActionState, false);
		//   18   44:aload_0         
		//   19   45:aload_1         
		//   20   46:aload_2         
		//   21   47:aload           11
		//   22   49:getfield        #219 <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
		//   23   52:aload           11
		//   24   54:getfield        #223 <Field float ItemTouchHelper$RecoverAnimation.mX>
		//   25   57:aload           11
		//   26   59:getfield        #226 <Field float ItemTouchHelper$RecoverAnimation.mY>
		//   27   62:aload           11
		//   28   64:getfield        #229 <Field int ItemTouchHelper$RecoverAnimation.mActionState>
		//   29   67:iconst_0        
		//   30   68:invokevirtual   #231 <Method void onChildDraw(Canvas, RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, float, float, int, boolean)>
				canvas.restoreToCount(i1);
		//   31   71:aload_1         
		//   32   72:iload           10
		//   33   74:invokevirtual   #235 <Method void Canvas.restoreToCount(int)>
			}

		//   34   77:iload           8
		//   35   79:iconst_1        
		//   36   80:iadd            
		//   37   81:istore          8
		//*  38   83:goto            12
			if(viewholder != null)
		//*  39   86:aload_3         
		//*  40   87:ifnull          116
			{
				int k = canvas.save();
		//   41   90:aload_1         
		//   42   91:invokevirtual   #215 <Method int Canvas.save()>
		//   43   94:istore          8
				onChildDraw(canvas, recyclerview, viewholder, f, f1, i, true);
		//   44   96:aload_0         
		//   45   97:aload_1         
		//   46   98:aload_2         
		//   47   99:aload_3         
		//   48  100:fload           6
		//   49  102:fload           7
		//   50  104:iload           5
		//   51  106:iconst_1        
		//   52  107:invokevirtual   #231 <Method void onChildDraw(Canvas, RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, float, float, int, boolean)>
				canvas.restoreToCount(k);
		//   53  110:aload_1         
		//   54  111:iload           8
		//   55  113:invokevirtual   #235 <Method void Canvas.restoreToCount(int)>
			}
		//   56  116:return          
		}

		void onDrawOver(Canvas canvas, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder, List list, int i, float f, float f1)
		{
			int l = list.size();
		//    0    0:aload           4
		//    1    2:invokeinterface #103 <Method int List.size()>
		//    2    7:istore          10
			boolean flag1 = false;
		//    3    9:iconst_0        
		//    4   10:istore          9
			for(int j = 0; j < l; j++)
		//*   5   12:iconst_0        
		//*   6   13:istore          8
		//*   7   15:iload           8
		//*   8   17:iload           10
		//*   9   19:icmpge          84
			{
				RecoverAnimation recoveranimation = (RecoverAnimation)list.get(j);
		//   10   22:aload           4
		//   11   24:iload           8
		//   12   26:invokeinterface #107 <Method Object List.get(int)>
		//   13   31:checkcast       #207 <Class ItemTouchHelper$RecoverAnimation>
		//   14   34:astore          12
				int i1 = canvas.save();
		//   15   36:aload_1         
		//   16   37:invokevirtual   #215 <Method int Canvas.save()>
		//   17   40:istore          11
				onChildDrawOver(canvas, recyclerview, recoveranimation.mViewHolder, recoveranimation.mX, recoveranimation.mY, recoveranimation.mActionState, false);
		//   18   42:aload_0         
		//   19   43:aload_1         
		//   20   44:aload_2         
		//   21   45:aload           12
		//   22   47:getfield        #219 <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
		//   23   50:aload           12
		//   24   52:getfield        #223 <Field float ItemTouchHelper$RecoverAnimation.mX>
		//   25   55:aload           12
		//   26   57:getfield        #226 <Field float ItemTouchHelper$RecoverAnimation.mY>
		//   27   60:aload           12
		//   28   62:getfield        #229 <Field int ItemTouchHelper$RecoverAnimation.mActionState>
		//   29   65:iconst_0        
		//   30   66:invokevirtual   #237 <Method void onChildDrawOver(Canvas, RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, float, float, int, boolean)>
				canvas.restoreToCount(i1);
		//   31   69:aload_1         
		//   32   70:iload           11
		//   33   72:invokevirtual   #235 <Method void Canvas.restoreToCount(int)>
			}

		//   34   75:iload           8
		//   35   77:iconst_1        
		//   36   78:iadd            
		//   37   79:istore          8
		//*  38   81:goto            15
			if(viewholder != null)
		//*  39   84:aload_3         
		//*  40   85:ifnull          114
			{
				int k = canvas.save();
		//   41   88:aload_1         
		//   42   89:invokevirtual   #215 <Method int Canvas.save()>
		//   43   92:istore          8
				onChildDrawOver(canvas, recyclerview, viewholder, f, f1, i, true);
		//   44   94:aload_0         
		//   45   95:aload_1         
		//   46   96:aload_2         
		//   47   97:aload_3         
		//   48   98:fload           6
		//   49  100:fload           7
		//   50  102:iload           5
		//   51  104:iconst_1        
		//   52  105:invokevirtual   #237 <Method void onChildDrawOver(Canvas, RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder, float, float, int, boolean)>
				canvas.restoreToCount(k);
		//   53  108:aload_1         
		//   54  109:iload           8
		//   55  111:invokevirtual   #235 <Method void Canvas.restoreToCount(int)>
			}
			i = l - 1;
		//   56  114:iload           10
		//   57  116:iconst_1        
		//   58  117:isub            
		//   59  118:istore          5
			boolean flag = flag1;
		//   60  120:iload           9
		//   61  122:istore          8
			for(; i >= 0; i--)
		//*  62  124:iload           5
		//*  63  126:iflt            188
			{
				canvas = ((Canvas) ((RecoverAnimation)list.get(i)));
		//   64  129:aload           4
		//   65  131:iload           5
		//   66  133:invokeinterface #107 <Method Object List.get(int)>
		//   67  138:checkcast       #207 <Class ItemTouchHelper$RecoverAnimation>
		//   68  141:astore_1        
				if(((RecoverAnimation) (canvas)).mEnded && !((RecoverAnimation) (canvas)).mIsPendingCleanup)
		//*  69  142:aload_1         
		//*  70  143:getfield        #241 <Field boolean ItemTouchHelper$RecoverAnimation.mEnded>
		//*  71  146:ifeq            169
		//*  72  149:aload_1         
		//*  73  150:getfield        #244 <Field boolean ItemTouchHelper$RecoverAnimation.mIsPendingCleanup>
		//*  74  153:ifne            169
				{
					list.remove(i);
		//   75  156:aload           4
		//   76  158:iload           5
		//   77  160:invokeinterface #247 <Method Object List.remove(int)>
		//   78  165:pop             
					continue;
		//   79  166:goto            179
				}
				if(!((RecoverAnimation) (canvas)).mEnded)
		//*  80  169:aload_1         
		//*  81  170:getfield        #241 <Field boolean ItemTouchHelper$RecoverAnimation.mEnded>
		//*  82  173:ifne            179
					flag = true;
		//   83  176:iconst_1        
		//   84  177:istore          8
			}

		//   85  179:iload           5
		//   86  181:iconst_1        
		//   87  182:isub            
		//   88  183:istore          5
		//*  89  185:goto            124
			if(flag)
		//*  90  188:iload           8
		//*  91  190:ifeq            197
				recyclerview.invalidate();
		//   92  193:aload_2         
		//   93  194:invokevirtual   #250 <Method void RecyclerView.invalidate()>
		//   94  197:return          
		}

		public abstract boolean onMove(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder, android.support.v7.widget.RecyclerView.ViewHolder viewholder1);

		public void onMoved(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i, android.support.v7.widget.RecyclerView.ViewHolder viewholder1, int j, int k, int l)
		{
			android.support.v7.widget.RecyclerView.LayoutManager layoutmanager = recyclerview.getLayoutManager();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #257 <Method android.support.v7.widget.RecyclerView$LayoutManager RecyclerView.getLayoutManager()>
		//    2    4:astore          8
			if(layoutmanager instanceof ViewDropHandler)
		//*   3    6:aload           8
		//*   4    8:instanceof      #259 <Class ItemTouchHelper$ViewDropHandler>
		//*   5   11:ifeq            38
			{
				((ViewDropHandler)layoutmanager).prepareForDrop(viewholder.itemView, viewholder1.itemView, k, l);
		//    6   14:aload           8
		//    7   16:checkcast       #259 <Class ItemTouchHelper$ViewDropHandler>
		//    8   19:aload_2         
		//    9   20:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   10   23:aload           4
		//   11   25:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   12   28:iload           6
		//   13   30:iload           7
		//   14   32:invokeinterface #263 <Method void ItemTouchHelper$ViewDropHandler.prepareForDrop(View, View, int, int)>
				return;
		//   15   37:return          
			}
			if(layoutmanager.canScrollHorizontally())
		//*  16   38:aload           8
		//*  17   40:invokevirtual   #268 <Method boolean android.support.v7.widget.RecyclerView$LayoutManager.canScrollHorizontally()>
		//*  18   43:ifeq            97
			{
				if(layoutmanager.getDecoratedLeft(viewholder1.itemView) <= recyclerview.getPaddingLeft())
		//*  19   46:aload           8
		//*  20   48:aload           4
		//*  21   50:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//*  22   53:invokevirtual   #271 <Method int android.support.v7.widget.RecyclerView$LayoutManager.getDecoratedLeft(View)>
		//*  23   56:aload_1         
		//*  24   57:invokevirtual   #274 <Method int RecyclerView.getPaddingLeft()>
		//*  25   60:icmpgt          69
					recyclerview.scrollToPosition(j);
		//   26   63:aload_1         
		//   27   64:iload           5
		//   28   66:invokevirtual   #277 <Method void RecyclerView.scrollToPosition(int)>
				if(layoutmanager.getDecoratedRight(viewholder1.itemView) >= recyclerview.getWidth() - recyclerview.getPaddingRight())
		//*  29   69:aload           8
		//*  30   71:aload           4
		//*  31   73:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//*  32   76:invokevirtual   #280 <Method int android.support.v7.widget.RecyclerView$LayoutManager.getDecoratedRight(View)>
		//*  33   79:aload_1         
		//*  34   80:invokevirtual   #281 <Method int RecyclerView.getWidth()>
		//*  35   83:aload_1         
		//*  36   84:invokevirtual   #284 <Method int RecyclerView.getPaddingRight()>
		//*  37   87:isub            
		//*  38   88:icmplt          97
					recyclerview.scrollToPosition(j);
		//   39   91:aload_1         
		//   40   92:iload           5
		//   41   94:invokevirtual   #277 <Method void RecyclerView.scrollToPosition(int)>
			}
			if(layoutmanager.canScrollVertically())
		//*  42   97:aload           8
		//*  43   99:invokevirtual   #287 <Method boolean android.support.v7.widget.RecyclerView$LayoutManager.canScrollVertically()>
		//*  44  102:ifeq            156
			{
				if(layoutmanager.getDecoratedTop(viewholder1.itemView) <= recyclerview.getPaddingTop())
		//*  45  105:aload           8
		//*  46  107:aload           4
		//*  47  109:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//*  48  112:invokevirtual   #290 <Method int android.support.v7.widget.RecyclerView$LayoutManager.getDecoratedTop(View)>
		//*  49  115:aload_1         
		//*  50  116:invokevirtual   #293 <Method int RecyclerView.getPaddingTop()>
		//*  51  119:icmpgt          128
					recyclerview.scrollToPosition(j);
		//   52  122:aload_1         
		//   53  123:iload           5
		//   54  125:invokevirtual   #277 <Method void RecyclerView.scrollToPosition(int)>
				if(layoutmanager.getDecoratedBottom(viewholder1.itemView) >= recyclerview.getHeight() - recyclerview.getPaddingBottom())
		//*  55  128:aload           8
		//*  56  130:aload           4
		//*  57  132:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//*  58  135:invokevirtual   #296 <Method int android.support.v7.widget.RecyclerView$LayoutManager.getDecoratedBottom(View)>
		//*  59  138:aload_1         
		//*  60  139:invokevirtual   #297 <Method int RecyclerView.getHeight()>
		//*  61  142:aload_1         
		//*  62  143:invokevirtual   #300 <Method int RecyclerView.getPaddingBottom()>
		//*  63  146:isub            
		//*  64  147:icmplt          156
					recyclerview.scrollToPosition(j);
		//   65  150:aload_1         
		//   66  151:iload           5
		//   67  153:invokevirtual   #277 <Method void RecyclerView.scrollToPosition(int)>
			}
		//   68  156:return          
		}

		public void onSelectedChanged(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
		{
			if(viewholder != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          16
				ItemTouchUIUtilImpl.INSTANCE.onSelected(viewholder.itemView);
		//    2    4:getstatic       #50  <Field ItemTouchUIUtil ItemTouchUIUtilImpl.INSTANCE>
		//    3    7:aload_1         
		//    4    8:getfield        #83  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//    5   11:invokeinterface #305 <Method void ItemTouchUIUtil.onSelected(View)>
		//    6   16:return          
		}

		public abstract void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i);

		private static final int ABS_HORIZONTAL_DIR_FLAGS = 0xc0c0c;
		public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
		public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
		private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000L;
		static final int RELATIVE_DIR_FLAGS = 0x303030;
		private static final Interpolator sDragScrollInterpolator = new _cls1();
		private static final Interpolator sDragViewScrollCapInterpolator = new _cls2();
		private int mCachedMaxScrollSpeed;

		static 
		{
			class _cls1
				implements Interpolator
			{

				public float getInterpolation(float f)
				{
					return f * f * f * f * f;
				//    0    0:fload_1         
				//    1    1:fload_1         
				//    2    2:fmul            
				//    3    3:fload_1         
				//    4    4:fmul            
				//    5    5:fload_1         
				//    6    6:fmul            
				//    7    7:fload_1         
				//    8    8:fmul            
				//    9    9:freturn         
				}

				_cls1()
				{
				//    0    0:aload_0         
				//    1    1:invokespecial   #10  <Method void Object()>
				//    2    4:return          
				}
			}

		//    0    0:new             #25  <Class ItemTouchHelper$Callback$1>
		//    1    3:dup             
		//    2    4:invokespecial   #28  <Method void ItemTouchHelper$Callback$1()>
		//    3    7:putstatic       #30  <Field Interpolator sDragScrollInterpolator>
			class _cls2
				implements Interpolator
			{

				public float getInterpolation(float f)
				{
					f--;
				//    0    0:fload_1         
				//    1    1:fconst_1        
				//    2    2:fsub            
				//    3    3:fstore_1        
					return f * f * f * f * f + 1.0F;
				//    4    4:fload_1         
				//    5    5:fload_1         
				//    6    6:fmul            
				//    7    7:fload_1         
				//    8    8:fmul            
				//    9    9:fload_1         
				//   10   10:fmul            
				//   11   11:fload_1         
				//   12   12:fmul            
				//   13   13:fconst_1        
				//   14   14:fadd            
				//   15   15:freturn         
				}

				_cls2()
				{
				//    0    0:aload_0         
				//    1    1:invokespecial   #10  <Method void Object()>
				//    2    4:return          
				}
			}

		//    4   10:new             #32  <Class ItemTouchHelper$Callback$2>
		//    5   13:dup             
		//    6   14:invokespecial   #33  <Method void ItemTouchHelper$Callback$2()>
		//    7   17:putstatic       #35  <Field Interpolator sDragViewScrollCapInterpolator>
		//*   8   20:return          
		}

		public Callback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #37  <Method void Object()>
			mCachedMaxScrollSpeed = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #39  <Field int mCachedMaxScrollSpeed>
		//    5    9:return          
		}

		private class ViewDropHandler
		{

			public abstract void prepareForDrop(View view, View view1, int i, int j);
		}

	}


	private class RecoverAnimation
		implements android.animation.Animator.AnimatorListener
	{

		public void cancel()
		{
			mValueAnimator.cancel();
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field ValueAnimator mValueAnimator>
		//    2    4:invokevirtual   #87  <Method void ValueAnimator.cancel()>
		//    3    7:return          
		}

		public void onAnimationCancel(Animator animator)
		{
			setFraction(1.0F);
		//    0    0:aload_0         
		//    1    1:fconst_1        
		//    2    2:invokevirtual   #83  <Method void setFraction(float)>
		//    3    5:return          
		}

		public void onAnimationEnd(Animator animator)
		{
			if(!mEnded)
		//*   0    0:aload_0         
		//*   1    1:getfield        #34  <Field boolean mEnded>
		//*   2    4:ifne            15
				mViewHolder.setIsRecyclable(true);
		//    3    7:aload_0         
		//    4    8:getfield        #40  <Field android.support.v7.widget.RecyclerView$ViewHolder mViewHolder>
		//    5   11:iconst_1        
		//    6   12:invokevirtual   #94  <Method void android.support.v7.widget.RecyclerView$ViewHolder.setIsRecyclable(boolean)>
			mEnded = true;
		//    7   15:aload_0         
		//    8   16:iconst_1        
		//    9   17:putfield        #34  <Field boolean mEnded>
		//   10   20:return          
		}

		public void onAnimationRepeat(Animator animator)
		{
		//    0    0:return          
		}

		public void onAnimationStart(Animator animator)
		{
		//    0    0:return          
		}

		public void setDuration(long l)
		{
			mValueAnimator.setDuration(l);
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field ValueAnimator mValueAnimator>
		//    2    4:lload_1         
		//    3    5:invokevirtual   #101 <Method ValueAnimator ValueAnimator.setDuration(long)>
		//    4    8:pop             
		//    5    9:return          
		}

		public void setFraction(float f)
		{
			mFraction = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #103 <Field float mFraction>
		//    3    5:return          
		}

		public void start()
		{
			mViewHolder.setIsRecyclable(false);
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field android.support.v7.widget.RecyclerView$ViewHolder mViewHolder>
		//    2    4:iconst_0        
		//    3    5:invokevirtual   #94  <Method void android.support.v7.widget.RecyclerView$ViewHolder.setIsRecyclable(boolean)>
			mValueAnimator.start();
		//    4    8:aload_0         
		//    5    9:getfield        #56  <Field ValueAnimator mValueAnimator>
		//    6   12:invokevirtual   #106 <Method void ValueAnimator.start()>
		//    7   15:return          
		}

		public void update()
		{
			float f = mStartDx;
		//    0    0:aload_0         
		//    1    1:getfield        #42  <Field float mStartDx>
		//    2    4:fstore_1        
			float f1 = mTargetX;
		//    3    5:aload_0         
		//    4    6:getfield        #46  <Field float mTargetX>
		//    5    9:fstore_2        
			if(f == f1)
		//*   6   10:fload_1         
		//*   7   11:fload_2         
		//*   8   12:fcmpl           
		//*   9   13:ifne            33
				mX = mViewHolder.itemView.getTranslationX();
		//   10   16:aload_0         
		//   11   17:aload_0         
		//   12   18:getfield        #40  <Field android.support.v7.widget.RecyclerView$ViewHolder mViewHolder>
		//   13   21:getfield        #71  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   14   24:invokevirtual   #113 <Method float View.getTranslationX()>
		//   15   27:putfield        #115 <Field float mX>
			else
		//*  16   30:goto            47
				mX = f + mFraction * (f1 - f);
		//   17   33:aload_0         
		//   18   34:fload_1         
		//   19   35:aload_0         
		//   20   36:getfield        #103 <Field float mFraction>
		//   21   39:fload_2         
		//   22   40:fload_1         
		//   23   41:fsub            
		//   24   42:fmul            
		//   25   43:fadd            
		//   26   44:putfield        #115 <Field float mX>
			f = mStartDy;
		//   27   47:aload_0         
		//   28   48:getfield        #44  <Field float mStartDy>
		//   29   51:fstore_1        
			f1 = mTargetY;
		//   30   52:aload_0         
		//   31   53:getfield        #48  <Field float mTargetY>
		//   32   56:fstore_2        
			if(f == f1)
		//*  33   57:fload_1         
		//*  34   58:fload_2         
		//*  35   59:fcmpl           
		//*  36   60:ifne            78
			{
				mY = mViewHolder.itemView.getTranslationY();
		//   37   63:aload_0         
		//   38   64:aload_0         
		//   39   65:getfield        #40  <Field android.support.v7.widget.RecyclerView$ViewHolder mViewHolder>
		//   40   68:getfield        #71  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   41   71:invokevirtual   #118 <Method float View.getTranslationY()>
		//   42   74:putfield        #120 <Field float mY>
				return;
		//   43   77:return          
			} else
			{
				mY = f + mFraction * (f1 - f);
		//   44   78:aload_0         
		//   45   79:fload_1         
		//   46   80:aload_0         
		//   47   81:getfield        #103 <Field float mFraction>
		//   48   84:fload_2         
		//   49   85:fload_1         
		//   50   86:fsub            
		//   51   87:fmul            
		//   52   88:fadd            
		//   53   89:putfield        #120 <Field float mY>
				return;
		//   54   92:return          
			}
		}

		final int mActionState;
		final int mAnimationType;
		boolean mEnded;
		private float mFraction;
		boolean mIsPendingCleanup;
		boolean mOverridden;
		final float mStartDx;
		final float mStartDy;
		final float mTargetX;
		final float mTargetY;
		private final ValueAnimator mValueAnimator = ValueAnimator.ofFloat(new float[] {
			0.0F, 1.0F
		});
		final android.support.v7.widget.RecyclerView.ViewHolder mViewHolder;
		float mX;
		float mY;

		RecoverAnimation(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i, int j, float f, float f1, float f2, float f3)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #30  <Method void Object()>
			mOverridden = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #32  <Field boolean mOverridden>
			mEnded = false;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #34  <Field boolean mEnded>
			mActionState = j;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #36  <Field int mActionState>
			mAnimationType = i;
		//   11   19:aload_0         
		//   12   20:iload_2         
		//   13   21:putfield        #38  <Field int mAnimationType>
			mViewHolder = viewholder;
		//   14   24:aload_0         
		//   15   25:aload_1         
		//   16   26:putfield        #40  <Field android.support.v7.widget.RecyclerView$ViewHolder mViewHolder>
			mStartDx = f;
		//   17   29:aload_0         
		//   18   30:fload           4
		//   19   32:putfield        #42  <Field float mStartDx>
			mStartDy = f1;
		//   20   35:aload_0         
		//   21   36:fload           5
		//   22   38:putfield        #44  <Field float mStartDy>
			mTargetX = f2;
		//   23   41:aload_0         
		//   24   42:fload           6
		//   25   44:putfield        #46  <Field float mTargetX>
			mTargetY = f3;
		//   26   47:aload_0         
		//   27   48:fload           7
		//   28   50:putfield        #48  <Field float mTargetY>
		//   29   53:aload_0         
		//   30   54:iconst_2        
		//   31   55:newarray        float[]
		//   32   57:dup             
		//   33   58:iconst_0        
		//   34   59:fconst_0        
		//   35   60:fastore         
		//   36   61:dup             
		//   37   62:iconst_1        
		//   38   63:fconst_1        
		//   39   64:fastore         
		//   40   65:invokestatic    #54  <Method ValueAnimator ValueAnimator.ofFloat(float[])>
		//   41   68:putfield        #56  <Field ValueAnimator mValueAnimator>
			class _cls1
				implements android.animation.ValueAnimator.AnimatorUpdateListener
			{

				public void onAnimationUpdate(ValueAnimator valueanimator)
				{
					setFraction(valueanimator.getAnimatedFraction());
				//    0    0:aload_0         
				//    1    1:getfield        #12  <Field ItemTouchHelper$RecoverAnimation this$0>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #24  <Method float ValueAnimator.getAnimatedFraction()>
				//    4    8:invokevirtual   #30  <Method void ItemTouchHelper$RecoverAnimation.setFraction(float)>
				//    5   11:return          
				}

				final RecoverAnimation this$0;

				_cls1()
				{
					this$0 = RecoverAnimation.this;
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:putfield        #12  <Field ItemTouchHelper$RecoverAnimation this$0>
					super();
				//    3    5:aload_0         
				//    4    6:invokespecial   #15  <Method void Object()>
				//    5    9:return          
				}
			}

			mValueAnimator.addUpdateListener(((android.animation.ValueAnimator.AnimatorUpdateListener) (new _cls1())));
		//   42   71:aload_0         
		//   43   72:getfield        #56  <Field ValueAnimator mValueAnimator>
		//   44   75:new             #58  <Class ItemTouchHelper$RecoverAnimation$1>
		//   45   78:dup             
		//   46   79:aload_0         
		//   47   80:invokespecial   #61  <Method void ItemTouchHelper$RecoverAnimation$1(ItemTouchHelper$RecoverAnimation)>
		//   48   83:invokevirtual   #65  <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
			mValueAnimator.setTarget(((Object) (viewholder.itemView)));
		//   49   86:aload_0         
		//   50   87:getfield        #56  <Field ValueAnimator mValueAnimator>
		//   51   90:aload_1         
		//   52   91:getfield        #71  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   53   94:invokevirtual   #75  <Method void ValueAnimator.setTarget(Object)>
			mValueAnimator.addListener(((android.animation.Animator.AnimatorListener) (this)));
		//   54   97:aload_0         
		//   55   98:getfield        #56  <Field ValueAnimator mValueAnimator>
		//   56  101:aload_0         
		//   57  102:invokevirtual   #79  <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
			setFraction(0.0F);
		//   58  105:aload_0         
		//   59  106:fconst_0        
		//   60  107:invokevirtual   #83  <Method void setFraction(float)>
		//   61  110:return          
		}
	}


	private class ItemTouchHelperGestureListener extends android.view.GestureDetector.SimpleOnGestureListener
	{

		void doNotReactToLongPress()
		{
			mShouldReactToLongPress = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #17  <Field boolean mShouldReactToLongPress>
		//    3    5:return          
		}

		public boolean onDown(MotionEvent motionevent)
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public void onLongPress(MotionEvent motionevent)
		{
			if(!mShouldReactToLongPress)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field boolean mShouldReactToLongPress>
		//*   2    4:ifne            8
				return;
		//    3    7:return          
			Object obj = ((Object) (findChildView(motionevent)));
		//    4    8:aload_0         
		//    5    9:getfield        #12  <Field ItemTouchHelper this$0>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #29  <Method View ItemTouchHelper.findChildView(MotionEvent)>
		//    8   16:astore          5
			if(obj != null)
		//*   9   18:aload           5
		//*  10   20:ifnull          152
			{
				obj = ((Object) (mRecyclerView.getChildViewHolder(((View) (obj)))));
		//   11   23:aload_0         
		//   12   24:getfield        #12  <Field ItemTouchHelper this$0>
		//   13   27:getfield        #33  <Field RecyclerView ItemTouchHelper.mRecyclerView>
		//   14   30:aload           5
		//   15   32:invokevirtual   #39  <Method android.support.v7.widget.RecyclerView$ViewHolder RecyclerView.getChildViewHolder(View)>
		//   16   35:astore          5
				if(obj != null)
		//*  17   37:aload           5
		//*  18   39:ifnull          152
				{
					if(!mCallback.hasDragFlag(mRecyclerView, ((android.support.v7.widget.RecyclerView.ViewHolder) (obj))))
		//*  19   42:aload_0         
		//*  20   43:getfield        #12  <Field ItemTouchHelper this$0>
		//*  21   46:getfield        #43  <Field ItemTouchHelper$Callback ItemTouchHelper.mCallback>
		//*  22   49:aload_0         
		//*  23   50:getfield        #12  <Field ItemTouchHelper this$0>
		//*  24   53:getfield        #33  <Field RecyclerView ItemTouchHelper.mRecyclerView>
		//*  25   56:aload           5
		//*  26   58:invokevirtual   #49  <Method boolean ItemTouchHelper$Callback.hasDragFlag(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
		//*  27   61:ifne            65
						return;
		//   28   64:return          
					if(motionevent.getPointerId(0) == mActivePointerId)
		//*  29   65:aload_1         
		//*  30   66:iconst_0        
		//*  31   67:invokevirtual   #55  <Method int MotionEvent.getPointerId(int)>
		//*  32   70:aload_0         
		//*  33   71:getfield        #12  <Field ItemTouchHelper this$0>
		//*  34   74:getfield        #59  <Field int ItemTouchHelper.mActivePointerId>
		//*  35   77:icmpne          152
					{
						int i = motionevent.findPointerIndex(mActivePointerId);
		//   36   80:aload_1         
		//   37   81:aload_0         
		//   38   82:getfield        #12  <Field ItemTouchHelper this$0>
		//   39   85:getfield        #59  <Field int ItemTouchHelper.mActivePointerId>
		//   40   88:invokevirtual   #62  <Method int MotionEvent.findPointerIndex(int)>
		//   41   91:istore          4
						float f = motionevent.getX(i);
		//   42   93:aload_1         
		//   43   94:iload           4
		//   44   96:invokevirtual   #66  <Method float MotionEvent.getX(int)>
		//   45   99:fstore_2        
						float f1 = motionevent.getY(i);
		//   46  100:aload_1         
		//   47  101:iload           4
		//   48  103:invokevirtual   #69  <Method float MotionEvent.getY(int)>
		//   49  106:fstore_3        
						motionevent = ((MotionEvent) (ItemTouchHelper.this));
		//   50  107:aload_0         
		//   51  108:getfield        #12  <Field ItemTouchHelper this$0>
		//   52  111:astore_1        
						motionevent.mInitialTouchX = f;
		//   53  112:aload_1         
		//   54  113:fload_2         
		//   55  114:putfield        #73  <Field float ItemTouchHelper.mInitialTouchX>
						motionevent.mInitialTouchY = f1;
		//   56  117:aload_1         
		//   57  118:fload_3         
		//   58  119:putfield        #76  <Field float ItemTouchHelper.mInitialTouchY>
						motionevent.mDy = 0.0F;
		//   59  122:aload_1         
		//   60  123:fconst_0        
		//   61  124:putfield        #79  <Field float ItemTouchHelper.mDy>
						motionevent.mDx = 0.0F;
		//   62  127:aload_1         
		//   63  128:fconst_0        
		//   64  129:putfield        #82  <Field float ItemTouchHelper.mDx>
						if(((ItemTouchHelper) (motionevent)).mCallback.isLongPressDragEnabled())
		//*  65  132:aload_1         
		//*  66  133:getfield        #43  <Field ItemTouchHelper$Callback ItemTouchHelper.mCallback>
		//*  67  136:invokevirtual   #86  <Method boolean ItemTouchHelper$Callback.isLongPressDragEnabled()>
		//*  68  139:ifeq            152
							select(((android.support.v7.widget.RecyclerView.ViewHolder) (obj)), 2);
		//   69  142:aload_0         
		//   70  143:getfield        #12  <Field ItemTouchHelper this$0>
		//   71  146:aload           5
		//   72  148:iconst_2        
		//   73  149:invokevirtual   #90  <Method void ItemTouchHelper.select(android.support.v7.widget.RecyclerView$ViewHolder, int)>
					}
				}
			}
		//   74  152:return          
		}

		private boolean mShouldReactToLongPress;
		final ItemTouchHelper this$0;

		ItemTouchHelperGestureListener()
		{
			this$0 = ItemTouchHelper.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field ItemTouchHelper this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void android.view.GestureDetector$SimpleOnGestureListener()>
			mShouldReactToLongPress = true;
		//    5    9:aload_0         
		//    6   10:iconst_1        
		//    7   11:putfield        #17  <Field boolean mShouldReactToLongPress>
		//    8   14:return          
		}
	}


	private class _cls4
		implements Runnable
	{

		public void run()
		{
			if(mRecyclerView != null && mRecyclerView.isAttachedToWindow() && !anim.mOverridden && anim.mViewHolder.getAdapterPosition() != -1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #16  <Field ItemTouchHelper this$0>
		//*   2    4:getfield        #31  <Field RecyclerView ItemTouchHelper.mRecyclerView>
		//*   3    7:ifnull          114
		//*   4   10:aload_0         
		//*   5   11:getfield        #16  <Field ItemTouchHelper this$0>
		//*   6   14:getfield        #31  <Field RecyclerView ItemTouchHelper.mRecyclerView>
		//*   7   17:invokevirtual   #37  <Method boolean RecyclerView.isAttachedToWindow()>
		//*   8   20:ifeq            114
		//*   9   23:aload_0         
		//*  10   24:getfield        #18  <Field ItemTouchHelper$RecoverAnimation val$anim>
		//*  11   27:getfield        #43  <Field boolean ItemTouchHelper$RecoverAnimation.mOverridden>
		//*  12   30:ifne            114
		//*  13   33:aload_0         
		//*  14   34:getfield        #18  <Field ItemTouchHelper$RecoverAnimation val$anim>
		//*  15   37:getfield        #47  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
		//*  16   40:invokevirtual   #53  <Method int android.support.v7.widget.RecyclerView$ViewHolder.getAdapterPosition()>
		//*  17   43:iconst_m1       
		//*  18   44:icmpeq          114
			{
				android.support.v7.widget.RecyclerView.ItemAnimator itemanimator = mRecyclerView.getItemAnimator();
		//   19   47:aload_0         
		//   20   48:getfield        #16  <Field ItemTouchHelper this$0>
		//   21   51:getfield        #31  <Field RecyclerView ItemTouchHelper.mRecyclerView>
		//   22   54:invokevirtual   #57  <Method android.support.v7.widget.RecyclerView$ItemAnimator RecyclerView.getItemAnimator()>
		//   23   57:astore_1        
				if((itemanimator == null || !itemanimator.isRunning(((android.support.v7.widget.RecyclerView.ItemAnimator.ItemAnimatorFinishedListener) (null)))) && !hasRunningRecoverAnim())
		//*  24   58:aload_1         
		//*  25   59:ifnull          70
		//*  26   62:aload_1         
		//*  27   63:aconst_null     
		//*  28   64:invokevirtual   #63  <Method boolean android.support.v7.widget.RecyclerView$ItemAnimator.isRunning(android.support.v7.widget.RecyclerView$ItemAnimator$ItemAnimatorFinishedListener)>
		//*  29   67:ifne            102
		//*  30   70:aload_0         
		//*  31   71:getfield        #16  <Field ItemTouchHelper this$0>
		//*  32   74:invokevirtual   #66  <Method boolean ItemTouchHelper.hasRunningRecoverAnim()>
		//*  33   77:ifne            102
				{
					mCallback.onSwiped(anim.mViewHolder, swipeDir);
		//   34   80:aload_0         
		//   35   81:getfield        #16  <Field ItemTouchHelper this$0>
		//   36   84:getfield        #70  <Field ItemTouchHelper$Callback ItemTouchHelper.mCallback>
		//   37   87:aload_0         
		//   38   88:getfield        #18  <Field ItemTouchHelper$RecoverAnimation val$anim>
		//   39   91:getfield        #47  <Field android.support.v7.widget.RecyclerView$ViewHolder ItemTouchHelper$RecoverAnimation.mViewHolder>
		//   40   94:aload_0         
		//   41   95:getfield        #20  <Field int val$swipeDir>
		//   42   98:invokevirtual   #76  <Method void ItemTouchHelper$Callback.onSwiped(android.support.v7.widget.RecyclerView$ViewHolder, int)>
					return;
		//   43  101:return          
				}
				mRecyclerView.post(((Runnable) (this)));
		//   44  102:aload_0         
		//   45  103:getfield        #16  <Field ItemTouchHelper this$0>
		//   46  106:getfield        #31  <Field RecyclerView ItemTouchHelper.mRecyclerView>
		//   47  109:aload_0         
		//   48  110:invokevirtual   #80  <Method boolean RecyclerView.post(Runnable)>
		//   49  113:pop             
			}
		//   50  114:return          
		}

		final ItemTouchHelper this$0;
		final RecoverAnimation val$anim;
		final int val$swipeDir;

		_cls4()
		{
			this$0 = ItemTouchHelper.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field ItemTouchHelper this$0>
			anim = recoveranimation;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #18  <Field ItemTouchHelper$RecoverAnimation val$anim>
			swipeDir = i;
		//    6   10:aload_0         
		//    7   11:iload_3         
		//    8   12:putfield        #20  <Field int val$swipeDir>
			super();
		//    9   15:aload_0         
		//   10   16:invokespecial   #23  <Method void Object()>
		//   11   19:return          
		}
	}


	private class _cls3 extends RecoverAnimation
	{

		public void onAnimationEnd(Animator animator)
		{
			super.onAnimationEnd(animator);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #26  <Method void ItemTouchHelper$RecoverAnimation.onAnimationEnd(Animator)>
			if(mOverridden)
		//*   3    5:aload_0         
		//*   4    6:getfield        #30  <Field boolean mOverridden>
		//*   5    9:ifeq            13
				return;
		//    6   12:return          
			if(swipeDir <= 0)
		//*   7   13:aload_0         
		//*   8   14:getfield        #16  <Field int val$swipeDir>
		//*   9   17:ifgt            44
			{
				mCallback.clearView(mRecyclerView, prevSelected);
		//   10   20:aload_0         
		//   11   21:getfield        #14  <Field ItemTouchHelper this$0>
		//   12   24:getfield        #36  <Field ItemTouchHelper$Callback ItemTouchHelper.mCallback>
		//   13   27:aload_0         
		//   14   28:getfield        #14  <Field ItemTouchHelper this$0>
		//   15   31:getfield        #40  <Field RecyclerView ItemTouchHelper.mRecyclerView>
		//   16   34:aload_0         
		//   17   35:getfield        #18  <Field android.support.v7.widget.RecyclerView$ViewHolder val$prevSelected>
		//   18   38:invokevirtual   #46  <Method void ItemTouchHelper$Callback.clearView(RecyclerView, android.support.v7.widget.RecyclerView$ViewHolder)>
			} else
		//*  19   41:goto            87
			{
				mPendingCleanup.add(((Object) (prevSelected.itemView)));
		//   20   44:aload_0         
		//   21   45:getfield        #14  <Field ItemTouchHelper this$0>
		//   22   48:getfield        #50  <Field List ItemTouchHelper.mPendingCleanup>
		//   23   51:aload_0         
		//   24   52:getfield        #18  <Field android.support.v7.widget.RecyclerView$ViewHolder val$prevSelected>
		//   25   55:getfield        #56  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   26   58:invokeinterface #62  <Method boolean List.add(Object)>
		//   27   63:pop             
				mIsPendingCleanup = true;
		//   28   64:aload_0         
		//   29   65:iconst_1        
		//   30   66:putfield        #65  <Field boolean mIsPendingCleanup>
				int i = swipeDir;
		//   31   69:aload_0         
		//   32   70:getfield        #16  <Field int val$swipeDir>
		//   33   73:istore_2        
				if(i > 0)
		//*  34   74:iload_2         
		//*  35   75:ifle            87
					postDispatchSwipe(((RecoverAnimation) (this)), i);
		//   36   78:aload_0         
		//   37   79:getfield        #14  <Field ItemTouchHelper this$0>
		//   38   82:aload_0         
		//   39   83:iload_2         
		//   40   84:invokevirtual   #69  <Method void ItemTouchHelper.postDispatchSwipe(ItemTouchHelper$RecoverAnimation, int)>
			}
			if(mOverdrawChild == prevSelected.itemView)
		//*  41   87:aload_0         
		//*  42   88:getfield        #14  <Field ItemTouchHelper this$0>
		//*  43   91:getfield        #72  <Field View ItemTouchHelper.mOverdrawChild>
		//*  44   94:aload_0         
		//*  45   95:getfield        #18  <Field android.support.v7.widget.RecyclerView$ViewHolder val$prevSelected>
		//*  46   98:getfield        #56  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//*  47  101:if_acmpne       118
				removeChildDrawingOrderCallbackIfNecessary(prevSelected.itemView);
		//   48  104:aload_0         
		//   49  105:getfield        #14  <Field ItemTouchHelper this$0>
		//   50  108:aload_0         
		//   51  109:getfield        #18  <Field android.support.v7.widget.RecyclerView$ViewHolder val$prevSelected>
		//   52  112:getfield        #56  <Field View android.support.v7.widget.RecyclerView$ViewHolder.itemView>
		//   53  115:invokevirtual   #76  <Method void ItemTouchHelper.removeChildDrawingOrderCallbackIfNecessary(View)>
		//   54  118:return          
		}

		final ItemTouchHelper this$0;
		final android.support.v7.widget.RecyclerView.ViewHolder val$prevSelected;
		final int val$swipeDir;

		_cls3(int j, float f, float f1, float f2, 
				float f3, int k, android.support.v7.widget.RecyclerView.ViewHolder viewholder1)
		{
			this$0 = ItemTouchHelper.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field ItemTouchHelper this$0>
			swipeDir = k;
		//    3    5:aload_0         
		//    4    6:iload           9
		//    5    8:putfield        #16  <Field int val$swipeDir>
			prevSelected = viewholder1;
		//    6   11:aload_0         
		//    7   12:aload           10
		//    8   14:putfield        #18  <Field android.support.v7.widget.RecyclerView$ViewHolder val$prevSelected>
			super(final_viewholder, final_i, j, f, f1, f2, f3);
		//    9   17:aload_0         
		//   10   18:aload_2         
		//   11   19:iload_3         
		//   12   20:iload           4
		//   13   22:fload           5
		//   14   24:fload           6
		//   15   26:fload           7
		//   16   28:fload           8
		//   17   30:invokespecial   #21  <Method void ItemTouchHelper$RecoverAnimation(android.support.v7.widget.RecyclerView$ViewHolder, int, int, float, float, float, float)>
		//   18   33:return          
		}
	}

}
