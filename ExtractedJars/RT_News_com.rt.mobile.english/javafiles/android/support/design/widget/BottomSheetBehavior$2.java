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
	//*   7   16:ifeq            30
			j = mParentHeight;
	//    8   19:aload_0         
	//    9   20:getfield        #12  <Field BottomSheetBehavior this$0>
	//   10   23:getfield        #36  <Field int BottomSheetBehavior.mParentHeight>
	//   11   26:istore_3        
		else
	//*  12   27:goto            38
			j = mMaxOffset;
	//   13   30:aload_0         
	//   14   31:getfield        #12  <Field BottomSheetBehavior this$0>
	//   15   34:getfield        #39  <Field int BottomSheetBehavior.mMaxOffset>
	//   16   37:istore_3        
		return MathUtils.clamp(i, k, j);
	//   17   38:iload_2         
	//   18   39:iload           4
	//   19   41:iload_3         
	//   20   42:invokestatic    #45  <Method int MathUtils.clamp(int, int, int)>
	//   21   45:ireturn         
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
	//   14   30:getfield        #39  <Field int BottomSheetBehavior.mMaxOffset>
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
		byte byte0 = 4;
	//    0    0:iconst_4        
	//    1    1:istore          5
		if(f1 >= 0.0F) goto _L2; else goto _L1
	//    2    3:fload_3         
	//    3    4:fconst_0        
	//    4    5:fcmpg           
	//    5    6:ifge            24
_L1:
		int i = mMinOffset;
	//    6    9:aload_0         
	//    7   10:getfield        #12  <Field BottomSheetBehavior this$0>
	//    8   13:getfield        #29  <Field int BottomSheetBehavior.mMinOffset>
	//    9   16:istore          4
_L4:
		byte0 = 3;
	//   10   18:iconst_3        
	//   11   19:istore          5
		break MISSING_BLOCK_LABEL_135;
	//   12   21:goto            135
_L2:
		if(mHideable && shouldHide(view, f1))
	//*  13   24:aload_0         
	//*  14   25:getfield        #12  <Field BottomSheetBehavior this$0>
	//*  15   28:getfield        #33  <Field boolean BottomSheetBehavior.mHideable>
	//*  16   31:ifeq            61
	//*  17   34:aload_0         
	//*  18   35:getfield        #12  <Field BottomSheetBehavior this$0>
	//*  19   38:aload_1         
	//*  20   39:fload_3         
	//*  21   40:invokevirtual   #63  <Method boolean BottomSheetBehavior.shouldHide(View, float)>
	//*  22   43:ifeq            61
		{
			i = mParentHeight;
	//   23   46:aload_0         
	//   24   47:getfield        #12  <Field BottomSheetBehavior this$0>
	//   25   50:getfield        #36  <Field int BottomSheetBehavior.mParentHeight>
	//   26   53:istore          4
			byte0 = 5;
	//   27   55:iconst_5        
	//   28   56:istore          5
			break MISSING_BLOCK_LABEL_135;
	//   29   58:goto            135
		}
		if(f1 != 0.0F)
			break; /* Loop/switch isn't completed */
	//   30   61:fload_3         
	//   31   62:fconst_0        
	//   32   63:fcmpl           
	//   33   64:ifne            126
		i = view.getTop();
	//   34   67:aload_1         
	//   35   68:invokevirtual   #66  <Method int View.getTop()>
	//   36   71:istore          4
		if(Math.abs(i - mMinOffset) < Math.abs(i - mMaxOffset))
	//*  37   73:iload           4
	//*  38   75:aload_0         
	//*  39   76:getfield        #12  <Field BottomSheetBehavior this$0>
	//*  40   79:getfield        #29  <Field int BottomSheetBehavior.mMinOffset>
	//*  41   82:isub            
	//*  42   83:invokestatic    #72  <Method int Math.abs(int)>
	//*  43   86:iload           4
	//*  44   88:aload_0         
	//*  45   89:getfield        #12  <Field BottomSheetBehavior this$0>
	//*  46   92:getfield        #39  <Field int BottomSheetBehavior.mMaxOffset>
	//*  47   95:isub            
	//*  48   96:invokestatic    #72  <Method int Math.abs(int)>
	//*  49   99:icmpge          114
		{
			i = mMinOffset;
	//   50  102:aload_0         
	//   51  103:getfield        #12  <Field BottomSheetBehavior this$0>
	//   52  106:getfield        #29  <Field int BottomSheetBehavior.mMinOffset>
	//   53  109:istore          4
		} else
	//*  54  111:goto            18
		{
			i = mMaxOffset;
	//   55  114:aload_0         
	//   56  115:getfield        #12  <Field BottomSheetBehavior this$0>
	//   57  118:getfield        #39  <Field int BottomSheetBehavior.mMaxOffset>
	//   58  121:istore          4
			break MISSING_BLOCK_LABEL_135;
	//   59  123:goto            135
		}
		if(true) goto _L4; else goto _L3
_L3:
		i = mMaxOffset;
	//   60  126:aload_0         
	//   61  127:getfield        #12  <Field BottomSheetBehavior this$0>
	//   62  130:getfield        #39  <Field int BottomSheetBehavior.mMaxOffset>
	//   63  133:istore          4
		if(mViewDragHelper.settleCapturedViewAt(view.getLeft(), i))
	//*  64  135:aload_0         
	//*  65  136:getfield        #12  <Field BottomSheetBehavior this$0>
	//*  66  139:getfield        #76  <Field ViewDragHelper BottomSheetBehavior.mViewDragHelper>
	//*  67  142:aload_1         
	//*  68  143:invokevirtual   #24  <Method int View.getLeft()>
	//*  69  146:iload           4
	//*  70  148:invokevirtual   #82  <Method boolean ViewDragHelper.settleCapturedViewAt(int, int)>
	//*  71  151:ifeq            181
		{
			setStateInternal(2);
	//   72  154:aload_0         
	//   73  155:getfield        #12  <Field BottomSheetBehavior this$0>
	//   74  158:iconst_2        
	//   75  159:invokevirtual   #52  <Method void BottomSheetBehavior.setStateInternal(int)>
			ViewCompat.postOnAnimation(view, ((Runnable) (new ttleRunnable(BottomSheetBehavior.this, view, ((int) (byte0))))));
	//   76  162:aload_1         
	//   77  163:new             #84  <Class BottomSheetBehavior$SettleRunnable>
	//   78  166:dup             
	//   79  167:aload_0         
	//   80  168:getfield        #12  <Field BottomSheetBehavior this$0>
	//   81  171:aload_1         
	//   82  172:iload           5
	//   83  174:invokespecial   #87  <Method void BottomSheetBehavior$SettleRunnable(BottomSheetBehavior, View, int)>
	//   84  177:invokestatic    #93  <Method void ViewCompat.postOnAnimation(View, Runnable)>
			return;
	//   85  180:return          
		} else
		{
			setStateInternal(((int) (byte0)));
	//   86  181:aload_0         
	//   87  182:getfield        #12  <Field BottomSheetBehavior this$0>
	//   88  185:iload           5
	//   89  187:invokevirtual   #52  <Method void BottomSheetBehavior.setStateInternal(int)>
			return;
	//   90  190:return          
		}
	}

	public boolean tryCaptureView(View view, int i)
	{
		if(mState == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field BottomSheetBehavior this$0>
	//*   2    4:getfield        #98  <Field int BottomSheetBehavior.mState>
	//*   3    7:iconst_1        
	//*   4    8:icmpne          13
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		if(mTouchingScrollingChild)
	//*   7   13:aload_0         
	//*   8   14:getfield        #12  <Field BottomSheetBehavior this$0>
	//*   9   17:getfield        #101 <Field boolean BottomSheetBehavior.mTouchingScrollingChild>
	//*  10   20:ifeq            25
			return false;
	//   11   23:iconst_0        
	//   12   24:ireturn         
		if(mState == 3 && mActivePointerId == i)
	//*  13   25:aload_0         
	//*  14   26:getfield        #12  <Field BottomSheetBehavior this$0>
	//*  15   29:getfield        #98  <Field int BottomSheetBehavior.mState>
	//*  16   32:iconst_3        
	//*  17   33:icmpne          75
	//*  18   36:aload_0         
	//*  19   37:getfield        #12  <Field BottomSheetBehavior this$0>
	//*  20   40:getfield        #104 <Field int BottomSheetBehavior.mActivePointerId>
	//*  21   43:iload_2         
	//*  22   44:icmpne          75
		{
			View view1 = (View)mNestedScrollingChildRef.get();
	//   23   47:aload_0         
	//   24   48:getfield        #12  <Field BottomSheetBehavior this$0>
	//   25   51:getfield        #108 <Field WeakReference BottomSheetBehavior.mNestedScrollingChildRef>
	//   26   54:invokevirtual   #114 <Method Object WeakReference.get()>
	//   27   57:checkcast       #20  <Class View>
	//   28   60:astore_3        
			if(view1 != null && view1.canScrollVertically(-1))
	//*  29   61:aload_3         
	//*  30   62:ifnull          75
	//*  31   65:aload_3         
	//*  32   66:iconst_m1       
	//*  33   67:invokevirtual   #118 <Method boolean View.canScrollVertically(int)>
	//*  34   70:ifeq            75
				return false;
	//   35   73:iconst_0        
	//   36   74:ireturn         
		}
		return mViewRef != null && mViewRef.get() == view;
	//   37   75:aload_0         
	//   38   76:getfield        #12  <Field BottomSheetBehavior this$0>
	//   39   79:getfield        #121 <Field WeakReference BottomSheetBehavior.mViewRef>
	//   40   82:ifnull          101
	//   41   85:aload_0         
	//   42   86:getfield        #12  <Field BottomSheetBehavior this$0>
	//   43   89:getfield        #121 <Field WeakReference BottomSheetBehavior.mViewRef>
	//   44   92:invokevirtual   #114 <Method Object WeakReference.get()>
	//   45   95:aload_1         
	//   46   96:if_acmpne       101
	//   47   99:iconst_1        
	//   48  100:ireturn         
	//   49  101:iconst_0        
	//   50  102:ireturn         
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
