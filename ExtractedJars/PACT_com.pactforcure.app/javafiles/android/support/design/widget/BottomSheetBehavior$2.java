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
		int i;
		int j;
		if(f1 < 0.0F)
	//*   0    0:fload_3         
	//*   1    1:fconst_0        
	//*   2    2:fcmpg           
	//*   3    3:ifge            64
		{
			j = mMinOffset;
	//    4    6:aload_0         
	//    5    7:getfield        #12  <Field BottomSheetBehavior this$0>
	//    6   10:getfield        #29  <Field int BottomSheetBehavior.mMinOffset>
	//    7   13:istore          5
			i = 3;
	//    8   15:iconst_3        
	//    9   16:istore          4
		} else
	//*  10   18:aload_0         
	//*  11   19:getfield        #12  <Field BottomSheetBehavior this$0>
	//*  12   22:getfield        #63  <Field ViewDragHelper BottomSheetBehavior.mViewDragHelper>
	//*  13   25:aload_1         
	//*  14   26:invokevirtual   #24  <Method int View.getLeft()>
	//*  15   29:iload           5
	//*  16   31:invokevirtual   #69  <Method boolean ViewDragHelper.settleCapturedViewAt(int, int)>
	//*  17   34:ifeq            187
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
	//*  28   55:iload           4
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
			j = mParentHeight;
	//   42   86:aload_0         
	//   43   87:getfield        #12  <Field BottomSheetBehavior this$0>
	//   44   90:getfield        #36  <Field int BottomSheetBehavior.mParentHeight>
	//   45   93:istore          5
			i = 5;
	//   46   95:iconst_5        
	//   47   96:istore          4
		} else
	//*  48   98:goto            18
		if(f1 == 0.0F)
	//*  49  101:fload_3         
	//*  50  102:fconst_0        
	//*  51  103:fcmpl           
	//*  52  104:ifne            172
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
	//*  68  139:icmpge          157
			{
				j = mMinOffset;
	//   69  142:aload_0         
	//   70  143:getfield        #12  <Field BottomSheetBehavior this$0>
	//   71  146:getfield        #29  <Field int BottomSheetBehavior.mMinOffset>
	//   72  149:istore          5
				i = 3;
	//   73  151:iconst_3        
	//   74  152:istore          4
			} else
	//*  75  154:goto            18
			{
				j = mMaxOffset;
	//   76  157:aload_0         
	//   77  158:getfield        #12  <Field BottomSheetBehavior this$0>
	//   78  161:getfield        #45  <Field int BottomSheetBehavior.mMaxOffset>
	//   79  164:istore          5
				i = 4;
	//   80  166:iconst_4        
	//   81  167:istore          4
			}
		} else
	//*  82  169:goto            18
		{
			j = mMaxOffset;
	//   83  172:aload_0         
	//   84  173:getfield        #12  <Field BottomSheetBehavior this$0>
	//   85  176:getfield        #45  <Field int BottomSheetBehavior.mMaxOffset>
	//   86  179:istore          5
			i = 4;
	//   87  181:iconst_4        
	//   88  182:istore          4
		}
		if(mViewDragHelper.settleCapturedViewAt(view.getLeft(), j))
		{
			setStateInternal(2);
			ViewCompat.postOnAnimation(view, ((Runnable) (new ttleRunnable(BottomSheetBehavior.this, view, i))));
			return;
		} else
	//*  89  184:goto            18
		{
			setStateInternal(i);
	//   90  187:aload_0         
	//   91  188:getfield        #12  <Field BottomSheetBehavior this$0>
	//   92  191:iload           4
	//   93  193:invokevirtual   #52  <Method void BottomSheetBehavior.setStateInternal(int)>
			return;
	//   94  196:return          
		}
	}

	public boolean tryCaptureView(View view, int i)
	{
		boolean flag;
		flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		break MISSING_BLOCK_LABEL_2;
		View view1;
		for(; view1 != null && view1.canScrollVertically(-1); view1 = (View)mNestedScrollingChildRef.get())
		{
			do
	//*   2    2:aload_0         
	//*   3    3:getfield        #12  <Field BottomSheetBehavior this$0>
	//*   4    6:getfield        #98  <Field int BottomSheetBehavior.mState>
	//*   5    9:iconst_1        
	//*   6   10:icmpne          15
				return false;
	//    7   13:iconst_0        
	//    8   14:ireturn         
			while(mState == 1 || mTouchingScrollingChild);
	//    9   15:aload_0         
	//   10   16:getfield        #12  <Field BottomSheetBehavior this$0>
	//   11   19:getfield        #101 <Field boolean BottomSheetBehavior.mTouchingScrollingChild>
	//   12   22:ifne            13
			if(mState != 3 || mActivePointerId != i)
				break;
	//   13   25:aload_0         
	//   14   26:getfield        #12  <Field BottomSheetBehavior this$0>
	//   15   29:getfield        #98  <Field int BottomSheetBehavior.mState>
	//   16   32:iconst_3        
	//   17   33:icmpne          76
	//   18   36:aload_0         
	//   19   37:getfield        #12  <Field BottomSheetBehavior this$0>
	//   20   40:getfield        #104 <Field int BottomSheetBehavior.mActivePointerId>
	//   21   43:iload_2         
	//   22   44:icmpne          76
		}

	//   23   47:aload_0         
	//   24   48:getfield        #12  <Field BottomSheetBehavior this$0>
	//   25   51:getfield        #108 <Field WeakReference BottomSheetBehavior.mNestedScrollingChildRef>
	//   26   54:invokevirtual   #114 <Method Object WeakReference.get()>
	//   27   57:checkcast       #20  <Class View>
	//   28   60:astore          4
	//   29   62:aload           4
	//   30   64:ifnull          76
	//   31   67:aload           4
	//   32   69:iconst_m1       
	//   33   70:invokevirtual   #118 <Method boolean View.canScrollVertically(int)>
	//   34   73:ifne            13
		if(mViewRef == null || mViewRef.get() != view)
	//*  35   76:aload_0         
	//*  36   77:getfield        #12  <Field BottomSheetBehavior this$0>
	//*  37   80:getfield        #121 <Field WeakReference BottomSheetBehavior.mViewRef>
	//*  38   83:ifnull          102
	//*  39   86:aload_0         
	//*  40   87:getfield        #12  <Field BottomSheetBehavior this$0>
	//*  41   90:getfield        #121 <Field WeakReference BottomSheetBehavior.mViewRef>
	//*  42   93:invokevirtual   #114 <Method Object WeakReference.get()>
	//*  43   96:aload_1         
	//*  44   97:if_acmpne       102
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
