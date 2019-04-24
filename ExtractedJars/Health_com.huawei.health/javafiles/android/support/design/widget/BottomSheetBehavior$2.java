// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.view.View;
import java.lang.ref.WeakReference;
import o.w;

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
		int k = e.mMinOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field BottomSheetBehavior e>
	//    2    4:getfield        #29  <Field int BottomSheetBehavior.mMinOffset>
	//    3    7:istore          4
		if(e.mHideable)
	//*   4    9:aload_0         
	//*   5   10:getfield        #12  <Field BottomSheetBehavior e>
	//*   6   13:getfield        #33  <Field boolean BottomSheetBehavior.mHideable>
	//*   7   16:ifeq            30
			j = e.mParentHeight;
	//    8   19:aload_0         
	//    9   20:getfield        #12  <Field BottomSheetBehavior e>
	//   10   23:getfield        #36  <Field int BottomSheetBehavior.mParentHeight>
	//   11   26:istore_3        
		else
	//*  12   27:goto            38
			j = e.mMaxOffset;
	//   13   30:aload_0         
	//   14   31:getfield        #12  <Field BottomSheetBehavior e>
	//   15   34:getfield        #39  <Field int BottomSheetBehavior.mMaxOffset>
	//   16   37:istore_3        
		return w.b(i, k, j);
	//   17   38:iload_2         
	//   18   39:iload           4
	//   19   41:iload_3         
	//   20   42:invokestatic    #45  <Method int w.b(int, int, int)>
	//   21   45:ireturn         
	}

	public int getViewVerticalDragRange(View view)
	{
		if(e.mHideable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field BottomSheetBehavior e>
	//*   2    4:getfield        #33  <Field boolean BottomSheetBehavior.mHideable>
	//*   3    7:ifeq            26
			return e.mParentHeight - e.mMinOffset;
	//    4   10:aload_0         
	//    5   11:getfield        #12  <Field BottomSheetBehavior e>
	//    6   14:getfield        #36  <Field int BottomSheetBehavior.mParentHeight>
	//    7   17:aload_0         
	//    8   18:getfield        #12  <Field BottomSheetBehavior e>
	//    9   21:getfield        #29  <Field int BottomSheetBehavior.mMinOffset>
	//   10   24:isub            
	//   11   25:ireturn         
		else
			return e.mMaxOffset - e.mMinOffset;
	//   12   26:aload_0         
	//   13   27:getfield        #12  <Field BottomSheetBehavior e>
	//   14   30:getfield        #39  <Field int BottomSheetBehavior.mMaxOffset>
	//   15   33:aload_0         
	//   16   34:getfield        #12  <Field BottomSheetBehavior e>
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
			e.setStateInternal(1);
	//    3    5:aload_0         
	//    4    6:getfield        #12  <Field BottomSheetBehavior e>
	//    5    9:iconst_1        
	//    6   10:invokevirtual   #52  <Method void BottomSheetBehavior.setStateInternal(int)>
	//    7   13:return          
	}

	public void onViewPositionChanged(View view, int i, int j, int k, int l)
	{
		e.dispatchOnSlide(j);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field BottomSheetBehavior e>
	//    2    4:iload_3         
	//    3    5:invokevirtual   #57  <Method void BottomSheetBehavior.dispatchOnSlide(int)>
	//    4    8:return          
	}

	public void onViewReleased(View view, float f, float f1)
	{
		int i;
		byte byte0;
		if(f1 < 0.0F)
	//*   0    0:fload_3         
	//*   1    1:fconst_0        
	//*   2    2:fcmpg           
	//*   3    3:ifge            21
		{
			i = e.mMinOffset;
	//    4    6:aload_0         
	//    5    7:getfield        #12  <Field BottomSheetBehavior e>
	//    6   10:getfield        #29  <Field int BottomSheetBehavior.mMinOffset>
	//    7   13:istore          4
			byte0 = 3;
	//    8   15:iconst_3        
	//    9   16:istore          5
		} else
	//*  10   18:goto            141
		if(e.mHideable && e.shouldHide(view, f1))
	//*  11   21:aload_0         
	//*  12   22:getfield        #12  <Field BottomSheetBehavior e>
	//*  13   25:getfield        #33  <Field boolean BottomSheetBehavior.mHideable>
	//*  14   28:ifeq            58
	//*  15   31:aload_0         
	//*  16   32:getfield        #12  <Field BottomSheetBehavior e>
	//*  17   35:aload_1         
	//*  18   36:fload_3         
	//*  19   37:invokevirtual   #63  <Method boolean BottomSheetBehavior.shouldHide(View, float)>
	//*  20   40:ifeq            58
		{
			i = e.mParentHeight;
	//   21   43:aload_0         
	//   22   44:getfield        #12  <Field BottomSheetBehavior e>
	//   23   47:getfield        #36  <Field int BottomSheetBehavior.mParentHeight>
	//   24   50:istore          4
			byte0 = 5;
	//   25   52:iconst_5        
	//   26   53:istore          5
		} else
	//*  27   55:goto            141
		if(f1 == 0.0F)
	//*  28   58:fload_3         
	//*  29   59:fconst_0        
	//*  30   60:fcmpl           
	//*  31   61:ifne            129
		{
			i = view.getTop();
	//   32   64:aload_1         
	//   33   65:invokevirtual   #66  <Method int View.getTop()>
	//   34   68:istore          4
			if(Math.abs(i - e.mMinOffset) < Math.abs(i - e.mMaxOffset))
	//*  35   70:iload           4
	//*  36   72:aload_0         
	//*  37   73:getfield        #12  <Field BottomSheetBehavior e>
	//*  38   76:getfield        #29  <Field int BottomSheetBehavior.mMinOffset>
	//*  39   79:isub            
	//*  40   80:invokestatic    #72  <Method int Math.abs(int)>
	//*  41   83:iload           4
	//*  42   85:aload_0         
	//*  43   86:getfield        #12  <Field BottomSheetBehavior e>
	//*  44   89:getfield        #39  <Field int BottomSheetBehavior.mMaxOffset>
	//*  45   92:isub            
	//*  46   93:invokestatic    #72  <Method int Math.abs(int)>
	//*  47   96:icmpge          114
			{
				i = e.mMinOffset;
	//   48   99:aload_0         
	//   49  100:getfield        #12  <Field BottomSheetBehavior e>
	//   50  103:getfield        #29  <Field int BottomSheetBehavior.mMinOffset>
	//   51  106:istore          4
				byte0 = 3;
	//   52  108:iconst_3        
	//   53  109:istore          5
			} else
	//*  54  111:goto            126
			{
				i = e.mMaxOffset;
	//   55  114:aload_0         
	//   56  115:getfield        #12  <Field BottomSheetBehavior e>
	//   57  118:getfield        #39  <Field int BottomSheetBehavior.mMaxOffset>
	//   58  121:istore          4
				byte0 = 4;
	//   59  123:iconst_4        
	//   60  124:istore          5
			}
		} else
	//*  61  126:goto            141
		{
			i = e.mMaxOffset;
	//   62  129:aload_0         
	//   63  130:getfield        #12  <Field BottomSheetBehavior e>
	//   64  133:getfield        #39  <Field int BottomSheetBehavior.mMaxOffset>
	//   65  136:istore          4
			byte0 = 4;
	//   66  138:iconst_4        
	//   67  139:istore          5
		}
		if(e.mViewDragHelper.settleCapturedViewAt(view.getLeft(), i))
	//*  68  141:aload_0         
	//*  69  142:getfield        #12  <Field BottomSheetBehavior e>
	//*  70  145:getfield        #76  <Field ViewDragHelper BottomSheetBehavior.mViewDragHelper>
	//*  71  148:aload_1         
	//*  72  149:invokevirtual   #24  <Method int View.getLeft()>
	//*  73  152:iload           4
	//*  74  154:invokevirtual   #82  <Method boolean ViewDragHelper.settleCapturedViewAt(int, int)>
	//*  75  157:ifeq            187
		{
			e.setStateInternal(2);
	//   76  160:aload_0         
	//   77  161:getfield        #12  <Field BottomSheetBehavior e>
	//   78  164:iconst_2        
	//   79  165:invokevirtual   #52  <Method void BottomSheetBehavior.setStateInternal(int)>
			ViewCompat.postOnAnimation(view, ((Runnable) (new BottomSheetBehavior$c(e, view, ((int) (byte0))))));
	//   80  168:aload_1         
	//   81  169:new             #84  <Class BottomSheetBehavior$c>
	//   82  172:dup             
	//   83  173:aload_0         
	//   84  174:getfield        #12  <Field BottomSheetBehavior e>
	//   85  177:aload_1         
	//   86  178:iload           5
	//   87  180:invokespecial   #87  <Method void BottomSheetBehavior$c(BottomSheetBehavior, View, int)>
	//   88  183:invokestatic    #93  <Method void ViewCompat.postOnAnimation(View, Runnable)>
			return;
	//   89  186:return          
		} else
		{
			e.setStateInternal(((int) (byte0)));
	//   90  187:aload_0         
	//   91  188:getfield        #12  <Field BottomSheetBehavior e>
	//   92  191:iload           5
	//   93  193:invokevirtual   #52  <Method void BottomSheetBehavior.setStateInternal(int)>
			return;
	//   94  196:return          
		}
	}

	public boolean tryCaptureView(View view, int i)
	{
		if(e.mState == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field BottomSheetBehavior e>
	//*   2    4:getfield        #98  <Field int BottomSheetBehavior.mState>
	//*   3    7:iconst_1        
	//*   4    8:icmpne          13
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		if(e.mTouchingScrollingChild)
	//*   7   13:aload_0         
	//*   8   14:getfield        #12  <Field BottomSheetBehavior e>
	//*   9   17:getfield        #101 <Field boolean BottomSheetBehavior.mTouchingScrollingChild>
	//*  10   20:ifeq            25
			return false;
	//   11   23:iconst_0        
	//   12   24:ireturn         
		if(e.mState == 3 && e.mActivePointerId == i)
	//*  13   25:aload_0         
	//*  14   26:getfield        #12  <Field BottomSheetBehavior e>
	//*  15   29:getfield        #98  <Field int BottomSheetBehavior.mState>
	//*  16   32:iconst_3        
	//*  17   33:icmpne          75
	//*  18   36:aload_0         
	//*  19   37:getfield        #12  <Field BottomSheetBehavior e>
	//*  20   40:getfield        #104 <Field int BottomSheetBehavior.mActivePointerId>
	//*  21   43:iload_2         
	//*  22   44:icmpne          75
		{
			View view1 = (View)e.mNestedScrollingChildRef.get();
	//   23   47:aload_0         
	//   24   48:getfield        #12  <Field BottomSheetBehavior e>
	//   25   51:getfield        #108 <Field WeakReference BottomSheetBehavior.mNestedScrollingChildRef>
	//   26   54:invokevirtual   #114 <Method Object WeakReference.get()>
	//   27   57:checkcast       #20  <Class View>
	//   28   60:astore_3        
			if(view1 != null && ViewCompat.canScrollVertically(view1, -1))
	//*  29   61:aload_3         
	//*  30   62:ifnull          75
	//*  31   65:aload_3         
	//*  32   66:iconst_m1       
	//*  33   67:invokestatic    #117 <Method boolean ViewCompat.canScrollVertically(View, int)>
	//*  34   70:ifeq            75
				return false;
	//   35   73:iconst_0        
	//   36   74:ireturn         
		}
		return e.mViewRef != null && e.mViewRef.get() == view;
	//   37   75:aload_0         
	//   38   76:getfield        #12  <Field BottomSheetBehavior e>
	//   39   79:getfield        #120 <Field WeakReference BottomSheetBehavior.mViewRef>
	//   40   82:ifnull          101
	//   41   85:aload_0         
	//   42   86:getfield        #12  <Field BottomSheetBehavior e>
	//   43   89:getfield        #120 <Field WeakReference BottomSheetBehavior.mViewRef>
	//   44   92:invokevirtual   #114 <Method Object WeakReference.get()>
	//   45   95:aload_1         
	//   46   96:if_acmpne       101
	//   47   99:iconst_1        
	//   48  100:ireturn         
	//   49  101:iconst_0        
	//   50  102:ireturn         
	}

	final BottomSheetBehavior e;

	BottomSheetBehavior$2(BottomSheetBehavior bottomsheetbehavior)
	{
		e = bottomsheetbehavior;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field BottomSheetBehavior e>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void android.support.v4.widget.ViewDragHelper$Callback()>
	//    5    9:return          
	}
}
