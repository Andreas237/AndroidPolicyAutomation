// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.math.MathUtils;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.view.View;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.design.widget:
//			BottomSheetBehavior

class BottomSheetBehavior$2 extends android.support.v4.widget.k
{

	public int clampViewPositionHorizontal(View view, int i, int j)
	{
		return view.getLeft();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #24  <Method int View.getLeft()>
	//    2    4:ireturn         
	}

	public int clampViewPositionVertical(View view, int i, int j)
	{
		int k = mMinOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field BottomSheetBehavior this$0>
	//    2    4:getfield        #29  <Field int BottomSheetBehavior.mMinOffset>
	//    3    7:istore          4
		if(mHideable)
	//*   4    9:aload_0         
	//*   5   10:getfield        #12  <Field BottomSheetBehavior this$0>
	//*   6   13:getfield        #33  <Field boolean BottomSheetBehavior.mHideable>
	//*   7   16:ifeq            35
			j = mParentHeight;
	//    8   19:aload_0         
	//    9   20:getfield        #12  <Field BottomSheetBehavior this$0>
	//   10   23:getfield        #36  <Field int BottomSheetBehavior.mParentHeight>
	//   11   26:istore_3        
		else
	//*  12   27:iload_2         
	//*  13   28:iload           4
	//*  14   30:iload_3         
	//*  15   31:invokestatic    #42  <Method int MathUtils.clamp(int, int, int)>
	//*  16   34:ireturn         
			j = mMaxOffset;
	//   17   35:aload_0         
	//   18   36:getfield        #12  <Field BottomSheetBehavior this$0>
	//   19   39:getfield        #45  <Field int BottomSheetBehavior.mMaxOffset>
	//   20   42:istore_3        
		return MathUtils.clamp(i, k, j);
	//*  21   43:goto            27
	}

	public int getViewVerticalDragRange(View view)
	{
		if(mHideable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field BottomSheetBehavior this$0>
	//*   2    4:getfield        #33  <Field boolean BottomSheetBehavior.mHideable>
	//*   3    7:ifeq            26
			return mParentHeight - mMinOffset;
	//    4   10:aload_0         
	//    5   11:getfield        #12  <Field BottomSheetBehavior this$0>
	//    6   14:getfield        #36  <Field int BottomSheetBehavior.mParentHeight>
	//    7   17:aload_0         
	//    8   18:getfield        #12  <Field BottomSheetBehavior this$0>
	//    9   21:getfield        #29  <Field int BottomSheetBehavior.mMinOffset>
	//   10   24:isub            
	//   11   25:ireturn         
		else
			return mMaxOffset - mMinOffset;
	//   12   26:aload_0         
	//   13   27:getfield        #12  <Field BottomSheetBehavior this$0>
	//   14   30:getfield        #45  <Field int BottomSheetBehavior.mMaxOffset>
	//   15   33:aload_0         
	//   16   34:getfield        #12  <Field BottomSheetBehavior this$0>
	//   17   37:getfield        #29  <Field int BottomSheetBehavior.mMinOffset>
	//   18   40:isub            
	//   19   41:ireturn         
	}

	public void onViewDragStateChanged(int i)
	{
		if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          13
			setStateInternal(1);
	//    3    5:aload_0         
	//    4    6:getfield        #12  <Field BottomSheetBehavior this$0>
	//    5    9:iconst_1        
	//    6   10:invokevirtual   #52  <Method void BottomSheetBehavior.setStateInternal(int)>
	//    7   13:return          
	}

	public void onViewPositionChanged(View view, int i, int j, int k, int l)
	{
		dispatchOnSlide(j);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field BottomSheetBehavior this$0>
	//    2    4:iload_3         
	//    3    5:invokevirtual   #57  <Method void BottomSheetBehavior.dispatchOnSlide(int)>
	//    4    8:return          
	}

	public void onViewReleased(View view, float f, float f1)
	{
		byte byte0 = 3;
	//    0    0:iconst_3        
	//    1    1:istore          5
		int i;
		if(f1 < 0.0F)
	//*   2    3:fload_3         
	//*   3    4:fconst_0        
	//*   4    5:fcmpg           
	//*   5    6:ifge            64
			i = mMinOffset;
	//    6    9:aload_0         
	//    7   10:getfield        #12  <Field BottomSheetBehavior this$0>
	//    8   13:getfield        #29  <Field int BottomSheetBehavior.mMinOffset>
	//    9   16:istore          4
		else
	//*  10   18:aload_0         
	//*  11   19:getfield        #12  <Field BottomSheetBehavior this$0>
	//*  12   22:getfield        #63  <Field ViewDragHelper BottomSheetBehavior.mViewDragHelper>
	//*  13   25:aload_1         
	//*  14   26:invokevirtual   #24  <Method int View.getLeft()>
	//*  15   29:iload           4
	//*  16   31:invokevirtual   #69  <Method boolean ViewDragHelper.settleCapturedViewAt(int, int)>
	//*  17   34:ifeq            184
	//*  18   37:aload_0         
	//*  19   38:getfield        #12  <Field BottomSheetBehavior this$0>
	//*  20   41:iconst_2        
	//*  21   42:invokevirtual   #52  <Method void BottomSheetBehavior.setStateInternal(int)>
	//*  22   45:aload_1         
	//*  23   46:new             #71  <Class BottomSheetBehavior$SettleRunnable>
	//*  24   49:dup             
	//*  25   50:aload_0         
	//*  26   51:getfield        #12  <Field BottomSheetBehavior this$0>
	//*  27   54:aload_1         
	//*  28   55:iload           5
	//*  29   57:invokespecial   #74  <Method void BottomSheetBehavior$SettleRunnable(BottomSheetBehavior, View, int)>
	//*  30   60:invokestatic    #80  <Method void ViewCompat.postOnAnimation(View, Runnable)>
	//*  31   63:return          
		if(mHideable && shouldHide(view, f1))
	//*  32   64:aload_0         
	//*  33   65:getfield        #12  <Field BottomSheetBehavior this$0>
	//*  34   68:getfield        #33  <Field boolean BottomSheetBehavior.mHideable>
	//*  35   71:ifeq            101
	//*  36   74:aload_0         
	//*  37   75:getfield        #12  <Field BottomSheetBehavior this$0>
	//*  38   78:aload_1         
	//*  39   79:fload_3         
	//*  40   80:invokevirtual   #84  <Method boolean BottomSheetBehavior.shouldHide(View, float)>
	//*  41   83:ifeq            101
		{
			i = mParentHeight;
	//   42   86:aload_0         
	//   43   87:getfield        #12  <Field BottomSheetBehavior this$0>
	//   44   90:getfield        #36  <Field int BottomSheetBehavior.mParentHeight>
	//   45   93:istore          4
			byte0 = 5;
	//   46   95:iconst_5        
	//   47   96:istore          5
		} else
	//*  48   98:goto            18
		if(f1 == 0.0F)
	//*  49  101:fload_3         
	//*  50  102:fconst_0        
	//*  51  103:fcmpl           
	//*  52  104:ifne            169
		{
			i = view.getTop();
	//   53  107:aload_1         
	//   54  108:invokevirtual   #87  <Method int View.getTop()>
	//   55  111:istore          4
			if(Math.abs(i - mMinOffset) < Math.abs(i - mMaxOffset))
	//*  56  113:iload           4
	//*  57  115:aload_0         
	//*  58  116:getfield        #12  <Field BottomSheetBehavior this$0>
	//*  59  119:getfield        #29  <Field int BottomSheetBehavior.mMinOffset>
	//*  60  122:isub            
	//*  61  123:invokestatic    #93  <Method int Math.abs(int)>
	//*  62  126:iload           4
	//*  63  128:aload_0         
	//*  64  129:getfield        #12  <Field BottomSheetBehavior this$0>
	//*  65  132:getfield        #45  <Field int BottomSheetBehavior.mMaxOffset>
	//*  66  135:isub            
	//*  67  136:invokestatic    #93  <Method int Math.abs(int)>
	//*  68  139:icmpge          154
			{
				i = mMinOffset;
	//   69  142:aload_0         
	//   70  143:getfield        #12  <Field BottomSheetBehavior this$0>
	//   71  146:getfield        #29  <Field int BottomSheetBehavior.mMinOffset>
	//   72  149:istore          4
			} else
	//*  73  151:goto            18
			{
				i = mMaxOffset;
	//   74  154:aload_0         
	//   75  155:getfield        #12  <Field BottomSheetBehavior this$0>
	//   76  158:getfield        #45  <Field int BottomSheetBehavior.mMaxOffset>
	//   77  161:istore          4
				byte0 = 4;
	//   78  163:iconst_4        
	//   79  164:istore          5
			}
		} else
	//*  80  166:goto            18
		{
			i = mMaxOffset;
	//   81  169:aload_0         
	//   82  170:getfield        #12  <Field BottomSheetBehavior this$0>
	//   83  173:getfield        #45  <Field int BottomSheetBehavior.mMaxOffset>
	//   84  176:istore          4
			byte0 = 4;
	//   85  178:iconst_4        
	//   86  179:istore          5
		}
		if(mViewDragHelper.settleCapturedViewAt(view.getLeft(), i))
		{
			setStateInternal(2);
			ViewCompat.postOnAnimation(view, ((Runnable) (new ttleRunnable(BottomSheetBehavior.this, view, ((int) (byte0))))));
			return;
		} else
	//*  87  181:goto            18
		{
			setStateInternal(((int) (byte0)));
	//   88  184:aload_0         
	//   89  185:getfield        #12  <Field BottomSheetBehavior this$0>
	//   90  188:iload           5
	//   91  190:invokevirtual   #52  <Method void BottomSheetBehavior.setStateInternal(int)>
			return;
	//   92  193:return          
		}
	}

	public boolean tryCaptureView(View view, int i)
	{
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field BottomSheetBehavior this$0>
	//*   2    4:getfield        #98  <Field int BottomSheetBehavior.mState>
	//*   3    7:iconst_1        
	//*   4    8:icmpne          13
_L2:
		return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		if(mState == 1 || mTouchingScrollingChild) goto _L2; else goto _L1
	//    7   13:aload_0         
	//    8   14:getfield        #12  <Field BottomSheetBehavior this$0>
	//    9   17:getfield        #101 <Field boolean BottomSheetBehavior.mTouchingScrollingChild>
	//   10   20:ifne            11
_L1:
		View view1;
		if(mState != 3 || mActivePointerId != i)
			break; /* Loop/switch isn't completed */
	//   11   23:aload_0         
	//   12   24:getfield        #12  <Field BottomSheetBehavior this$0>
	//   13   27:getfield        #98  <Field int BottomSheetBehavior.mState>
	//   14   30:iconst_3        
	//   15   31:icmpne          74
	//   16   34:aload_0         
	//   17   35:getfield        #12  <Field BottomSheetBehavior this$0>
	//   18   38:getfield        #104 <Field int BottomSheetBehavior.mActivePointerId>
	//   19   41:iload_2         
	//   20   42:icmpne          74
		view1 = (View)mNestedScrollingChildRef.get();
	//   21   45:aload_0         
	//   22   46:getfield        #12  <Field BottomSheetBehavior this$0>
	//   23   49:getfield        #108 <Field WeakReference BottomSheetBehavior.mNestedScrollingChildRef>
	//   24   52:invokevirtual   #114 <Method Object WeakReference.get()>
	//   25   55:checkcast       #20  <Class View>
	//   26   58:astore          4
		if(view1 != null && view1.canScrollVertically(-1)) goto _L2; else goto _L3
	//   27   60:aload           4
	//   28   62:ifnull          74
	//   29   65:aload           4
	//   30   67:iconst_m1       
	//   31   68:invokevirtual   #118 <Method boolean View.canScrollVertically(int)>
	//   32   71:ifne            11
_L3:
		boolean flag;
		if(mViewRef != null && mViewRef.get() == view)
	//*  33   74:aload_0         
	//*  34   75:getfield        #12  <Field BottomSheetBehavior this$0>
	//*  35   78:getfield        #121 <Field WeakReference BottomSheetBehavior.mViewRef>
	//*  36   81:ifnull          102
	//*  37   84:aload_0         
	//*  38   85:getfield        #12  <Field BottomSheetBehavior this$0>
	//*  39   88:getfield        #121 <Field WeakReference BottomSheetBehavior.mViewRef>
	//*  40   91:invokevirtual   #114 <Method Object WeakReference.get()>
	//*  41   94:aload_1         
	//*  42   95:if_acmpne       102
			flag = true;
	//   43   98:iconst_1        
	//   44   99:istore_3        
		else
	//*  45  100:iload_3         
	//*  46  101:ireturn         
			flag = false;
	//   47  102:iconst_0        
	//   48  103:istore_3        
		return flag;
	//*  49  104:goto            100
	}

	final BottomSheetBehavior this$0;

	BottomSheetBehavior$2()
	{
		this$0 = BottomSheetBehavior.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field BottomSheetBehavior this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void android.support.v4.widget.ViewDragHelper$Callback()>
	//    5    9:return          
	}
}
