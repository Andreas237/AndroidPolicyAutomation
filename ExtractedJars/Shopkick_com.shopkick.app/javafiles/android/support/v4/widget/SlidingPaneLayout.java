// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.*;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.*;
import android.view.*;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.widget:
//			ViewDragHelper

public class SlidingPaneLayout extends ViewGroup
{
	class AccessibilityDelegate extends AccessibilityDelegateCompat
	{

		private void copyNodeInfoNoChildren(AccessibilityNodeInfoCompat accessibilitynodeinfocompat, AccessibilityNodeInfoCompat accessibilitynodeinfocompat1)
		{
			Rect rect = mTmpRect;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field Rect mTmpRect>
		//    2    4:astore_3        
			accessibilitynodeinfocompat1.getBoundsInParent(rect);
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #32  <Method void AccessibilityNodeInfoCompat.getBoundsInParent(Rect)>
			accessibilitynodeinfocompat.setBoundsInParent(rect);
		//    6   10:aload_1         
		//    7   11:aload_3         
		//    8   12:invokevirtual   #35  <Method void AccessibilityNodeInfoCompat.setBoundsInParent(Rect)>
			accessibilitynodeinfocompat1.getBoundsInScreen(rect);
		//    9   15:aload_2         
		//   10   16:aload_3         
		//   11   17:invokevirtual   #38  <Method void AccessibilityNodeInfoCompat.getBoundsInScreen(Rect)>
			accessibilitynodeinfocompat.setBoundsInScreen(rect);
		//   12   20:aload_1         
		//   13   21:aload_3         
		//   14   22:invokevirtual   #41  <Method void AccessibilityNodeInfoCompat.setBoundsInScreen(Rect)>
			accessibilitynodeinfocompat.setVisibleToUser(accessibilitynodeinfocompat1.isVisibleToUser());
		//   15   25:aload_1         
		//   16   26:aload_2         
		//   17   27:invokevirtual   #45  <Method boolean AccessibilityNodeInfoCompat.isVisibleToUser()>
		//   18   30:invokevirtual   #49  <Method void AccessibilityNodeInfoCompat.setVisibleToUser(boolean)>
			accessibilitynodeinfocompat.setPackageName(accessibilitynodeinfocompat1.getPackageName());
		//   19   33:aload_1         
		//   20   34:aload_2         
		//   21   35:invokevirtual   #53  <Method CharSequence AccessibilityNodeInfoCompat.getPackageName()>
		//   22   38:invokevirtual   #57  <Method void AccessibilityNodeInfoCompat.setPackageName(CharSequence)>
			accessibilitynodeinfocompat.setClassName(accessibilitynodeinfocompat1.getClassName());
		//   23   41:aload_1         
		//   24   42:aload_2         
		//   25   43:invokevirtual   #60  <Method CharSequence AccessibilityNodeInfoCompat.getClassName()>
		//   26   46:invokevirtual   #63  <Method void AccessibilityNodeInfoCompat.setClassName(CharSequence)>
			accessibilitynodeinfocompat.setContentDescription(accessibilitynodeinfocompat1.getContentDescription());
		//   27   49:aload_1         
		//   28   50:aload_2         
		//   29   51:invokevirtual   #66  <Method CharSequence AccessibilityNodeInfoCompat.getContentDescription()>
		//   30   54:invokevirtual   #69  <Method void AccessibilityNodeInfoCompat.setContentDescription(CharSequence)>
			accessibilitynodeinfocompat.setEnabled(accessibilitynodeinfocompat1.isEnabled());
		//   31   57:aload_1         
		//   32   58:aload_2         
		//   33   59:invokevirtual   #72  <Method boolean AccessibilityNodeInfoCompat.isEnabled()>
		//   34   62:invokevirtual   #75  <Method void AccessibilityNodeInfoCompat.setEnabled(boolean)>
			accessibilitynodeinfocompat.setClickable(accessibilitynodeinfocompat1.isClickable());
		//   35   65:aload_1         
		//   36   66:aload_2         
		//   37   67:invokevirtual   #78  <Method boolean AccessibilityNodeInfoCompat.isClickable()>
		//   38   70:invokevirtual   #81  <Method void AccessibilityNodeInfoCompat.setClickable(boolean)>
			accessibilitynodeinfocompat.setFocusable(accessibilitynodeinfocompat1.isFocusable());
		//   39   73:aload_1         
		//   40   74:aload_2         
		//   41   75:invokevirtual   #84  <Method boolean AccessibilityNodeInfoCompat.isFocusable()>
		//   42   78:invokevirtual   #87  <Method void AccessibilityNodeInfoCompat.setFocusable(boolean)>
			accessibilitynodeinfocompat.setFocused(accessibilitynodeinfocompat1.isFocused());
		//   43   81:aload_1         
		//   44   82:aload_2         
		//   45   83:invokevirtual   #90  <Method boolean AccessibilityNodeInfoCompat.isFocused()>
		//   46   86:invokevirtual   #93  <Method void AccessibilityNodeInfoCompat.setFocused(boolean)>
			accessibilitynodeinfocompat.setAccessibilityFocused(accessibilitynodeinfocompat1.isAccessibilityFocused());
		//   47   89:aload_1         
		//   48   90:aload_2         
		//   49   91:invokevirtual   #96  <Method boolean AccessibilityNodeInfoCompat.isAccessibilityFocused()>
		//   50   94:invokevirtual   #99  <Method void AccessibilityNodeInfoCompat.setAccessibilityFocused(boolean)>
			accessibilitynodeinfocompat.setSelected(accessibilitynodeinfocompat1.isSelected());
		//   51   97:aload_1         
		//   52   98:aload_2         
		//   53   99:invokevirtual   #102 <Method boolean AccessibilityNodeInfoCompat.isSelected()>
		//   54  102:invokevirtual   #105 <Method void AccessibilityNodeInfoCompat.setSelected(boolean)>
			accessibilitynodeinfocompat.setLongClickable(accessibilitynodeinfocompat1.isLongClickable());
		//   55  105:aload_1         
		//   56  106:aload_2         
		//   57  107:invokevirtual   #108 <Method boolean AccessibilityNodeInfoCompat.isLongClickable()>
		//   58  110:invokevirtual   #111 <Method void AccessibilityNodeInfoCompat.setLongClickable(boolean)>
			accessibilitynodeinfocompat.addAction(accessibilitynodeinfocompat1.getActions());
		//   59  113:aload_1         
		//   60  114:aload_2         
		//   61  115:invokevirtual   #115 <Method int AccessibilityNodeInfoCompat.getActions()>
		//   62  118:invokevirtual   #119 <Method void AccessibilityNodeInfoCompat.addAction(int)>
			accessibilitynodeinfocompat.setMovementGranularities(accessibilitynodeinfocompat1.getMovementGranularities());
		//   63  121:aload_1         
		//   64  122:aload_2         
		//   65  123:invokevirtual   #122 <Method int AccessibilityNodeInfoCompat.getMovementGranularities()>
		//   66  126:invokevirtual   #125 <Method void AccessibilityNodeInfoCompat.setMovementGranularities(int)>
		//   67  129:return          
		}

		public boolean filter(View view)
		{
			return isDimmed(view);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field SlidingPaneLayout this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #130 <Method boolean SlidingPaneLayout.isDimmed(View)>
		//    4    8:ireturn         
		}

		public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
		{
			super.onInitializeAccessibilityEvent(view, accessibilityevent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #134 <Method void AccessibilityDelegateCompat.onInitializeAccessibilityEvent(View, AccessibilityEvent)>
			accessibilityevent.setClassName(((CharSequence) (((Class) (android/support/v4/widget/SlidingPaneLayout)).getName())));
		//    4    6:aload_2         
		//    5    7:ldc1            #6   <Class SlidingPaneLayout>
		//    6    9:invokevirtual   #140 <Method String Class.getName()>
		//    7   12:invokevirtual   #143 <Method void AccessibilityEvent.setClassName(CharSequence)>
		//    8   15:return          
		}

		public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
		{
			AccessibilityNodeInfoCompat accessibilitynodeinfocompat1 = AccessibilityNodeInfoCompat.obtain(accessibilitynodeinfocompat);
		//    0    0:aload_2         
		//    1    1:invokestatic    #149 <Method AccessibilityNodeInfoCompat AccessibilityNodeInfoCompat.obtain(AccessibilityNodeInfoCompat)>
		//    2    4:astore          5
			super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat1);
		//    3    6:aload_0         
		//    4    7:aload_1         
		//    5    8:aload           5
		//    6   10:invokespecial   #151 <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
			copyNodeInfoNoChildren(accessibilitynodeinfocompat, accessibilitynodeinfocompat1);
		//    7   13:aload_0         
		//    8   14:aload_2         
		//    9   15:aload           5
		//   10   17:invokespecial   #153 <Method void copyNodeInfoNoChildren(AccessibilityNodeInfoCompat, AccessibilityNodeInfoCompat)>
			accessibilitynodeinfocompat1.recycle();
		//   11   20:aload           5
		//   12   22:invokevirtual   #156 <Method void AccessibilityNodeInfoCompat.recycle()>
			accessibilitynodeinfocompat.setClassName(((CharSequence) (((Class) (android/support/v4/widget/SlidingPaneLayout)).getName())));
		//   13   25:aload_2         
		//   14   26:ldc1            #6   <Class SlidingPaneLayout>
		//   15   28:invokevirtual   #140 <Method String Class.getName()>
		//   16   31:invokevirtual   #63  <Method void AccessibilityNodeInfoCompat.setClassName(CharSequence)>
			accessibilitynodeinfocompat.setSource(view);
		//   17   34:aload_2         
		//   18   35:aload_1         
		//   19   36:invokevirtual   #160 <Method void AccessibilityNodeInfoCompat.setSource(View)>
			view = ((View) (ViewCompat.getParentForAccessibility(view)));
		//   20   39:aload_1         
		//   21   40:invokestatic    #166 <Method android.view.ViewParent ViewCompat.getParentForAccessibility(View)>
		//   22   43:astore_1        
			if(view instanceof View)
		//*  23   44:aload_1         
		//*  24   45:instanceof      #168 <Class View>
		//*  25   48:ifeq            59
				accessibilitynodeinfocompat.setParent((View)view);
		//   26   51:aload_2         
		//   27   52:aload_1         
		//   28   53:checkcast       #168 <Class View>
		//   29   56:invokevirtual   #171 <Method void AccessibilityNodeInfoCompat.setParent(View)>
			int j = getChildCount();
		//   30   59:aload_0         
		//   31   60:getfield        #15  <Field SlidingPaneLayout this$0>
		//   32   63:invokevirtual   #174 <Method int SlidingPaneLayout.getChildCount()>
		//   33   66:istore          4
			for(int i = 0; i < j; i++)
		//*  34   68:iconst_0        
		//*  35   69:istore_3        
		//*  36   70:iload_3         
		//*  37   71:iload           4
		//*  38   73:icmpge          117
			{
				view = getChildAt(i);
		//   39   76:aload_0         
		//   40   77:getfield        #15  <Field SlidingPaneLayout this$0>
		//   41   80:iload_3         
		//   42   81:invokevirtual   #178 <Method View SlidingPaneLayout.getChildAt(int)>
		//   43   84:astore_1        
				if(!filter(view) && view.getVisibility() == 0)
		//*  44   85:aload_0         
		//*  45   86:aload_1         
		//*  46   87:invokevirtual   #180 <Method boolean filter(View)>
		//*  47   90:ifne            110
		//*  48   93:aload_1         
		//*  49   94:invokevirtual   #183 <Method int View.getVisibility()>
		//*  50   97:ifne            110
				{
					ViewCompat.setImportantForAccessibility(view, 1);
		//   51  100:aload_1         
		//   52  101:iconst_1        
		//   53  102:invokestatic    #187 <Method void ViewCompat.setImportantForAccessibility(View, int)>
					accessibilitynodeinfocompat.addChild(view);
		//   54  105:aload_2         
		//   55  106:aload_1         
		//   56  107:invokevirtual   #190 <Method void AccessibilityNodeInfoCompat.addChild(View)>
				}
			}

		//   57  110:iload_3         
		//   58  111:iconst_1        
		//   59  112:iadd            
		//   60  113:istore_3        
		//*  61  114:goto            70
		//   62  117:return          
		}

		public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
		{
			if(!filter(view))
		//*   0    0:aload_0         
		//*   1    1:aload_2         
		//*   2    2:invokevirtual   #180 <Method boolean filter(View)>
		//*   3    5:ifne            16
				return super.onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:aload_3         
		//    8   12:invokespecial   #194 <Method boolean AccessibilityDelegateCompat.onRequestSendAccessibilityEvent(ViewGroup, View, AccessibilityEvent)>
		//    9   15:ireturn         
			else
				return false;
		//   10   16:iconst_0        
		//   11   17:ireturn         
		}

		private final Rect mTmpRect = new Rect();
		final SlidingPaneLayout this$0;

		AccessibilityDelegate()
		{
			this$0 = SlidingPaneLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field SlidingPaneLayout this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void AccessibilityDelegateCompat()>
		//    5    9:aload_0         
		//    6   10:new             #20  <Class Rect>
		//    7   13:dup             
		//    8   14:invokespecial   #21  <Method void Rect()>
		//    9   17:putfield        #23  <Field Rect mTmpRect>
		//   10   20:return          
		}
	}

	private class DisableLayerRunnable
		implements Runnable
	{

		public void run()
		{
			if(mChildView.getParent() == SlidingPaneLayout.this)
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field View mChildView>
		//*   2    4:invokevirtual   #30  <Method android.view.ViewParent View.getParent()>
		//*   3    7:aload_0         
		//*   4    8:getfield        #17  <Field SlidingPaneLayout this$0>
		//*   5   11:if_acmpne       34
			{
				mChildView.setLayerType(0, ((Paint) (null)));
		//    6   14:aload_0         
		//    7   15:getfield        #22  <Field View mChildView>
		//    8   18:iconst_0        
		//    9   19:aconst_null     
		//   10   20:invokevirtual   #34  <Method void View.setLayerType(int, Paint)>
				invalidateChildRegion(mChildView);
		//   11   23:aload_0         
		//   12   24:getfield        #17  <Field SlidingPaneLayout this$0>
		//   13   27:aload_0         
		//   14   28:getfield        #22  <Field View mChildView>
		//   15   31:invokevirtual   #38  <Method void SlidingPaneLayout.invalidateChildRegion(View)>
			}
			mPostedRunnables.remove(((Object) (this)));
		//   16   34:aload_0         
		//   17   35:getfield        #17  <Field SlidingPaneLayout this$0>
		//   18   38:getfield        #42  <Field ArrayList SlidingPaneLayout.mPostedRunnables>
		//   19   41:aload_0         
		//   20   42:invokevirtual   #48  <Method boolean ArrayList.remove(Object)>
		//   21   45:pop             
		//   22   46:return          
		}

		final View mChildView;
		final SlidingPaneLayout this$0;

		DisableLayerRunnable(View view)
		{
			this$0 = SlidingPaneLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field SlidingPaneLayout this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
			mChildView = view;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field View mChildView>
		//    8   14:return          
		}
	}

	private class DragHelperCallback extends ViewDragHelper.Callback
	{

		public int clampViewPositionHorizontal(View view, int i, int j)
		{
			view = ((View) ((LayoutParams)mSlideableView.getLayoutParams()));
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field SlidingPaneLayout this$0>
		//    2    4:getfield        #23  <Field View SlidingPaneLayout.mSlideableView>
		//    3    7:invokevirtual   #29  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    4   10:checkcast       #31  <Class SlidingPaneLayout$LayoutParams>
		//    5   13:astore_1        
			if(isLayoutRtlSupport())
		//*   6   14:aload_0         
		//*   7   15:getfield        #13  <Field SlidingPaneLayout this$0>
		//*   8   18:invokevirtual   #35  <Method boolean SlidingPaneLayout.isLayoutRtlSupport()>
		//*   9   21:ifeq            78
			{
				j = getWidth() - (getPaddingRight() + ((LayoutParams) (view)).rightMargin + mSlideableView.getWidth());
		//   10   24:aload_0         
		//   11   25:getfield        #13  <Field SlidingPaneLayout this$0>
		//   12   28:invokevirtual   #39  <Method int SlidingPaneLayout.getWidth()>
		//   13   31:aload_0         
		//   14   32:getfield        #13  <Field SlidingPaneLayout this$0>
		//   15   35:invokevirtual   #42  <Method int SlidingPaneLayout.getPaddingRight()>
		//   16   38:aload_1         
		//   17   39:getfield        #46  <Field int SlidingPaneLayout$LayoutParams.rightMargin>
		//   18   42:iadd            
		//   19   43:aload_0         
		//   20   44:getfield        #13  <Field SlidingPaneLayout this$0>
		//   21   47:getfield        #23  <Field View SlidingPaneLayout.mSlideableView>
		//   22   50:invokevirtual   #47  <Method int View.getWidth()>
		//   23   53:iadd            
		//   24   54:isub            
		//   25   55:istore_3        
				int k = mSlideRange;
		//   26   56:aload_0         
		//   27   57:getfield        #13  <Field SlidingPaneLayout this$0>
		//   28   60:getfield        #50  <Field int SlidingPaneLayout.mSlideRange>
		//   29   63:istore          4
				return Math.max(Math.min(i, j), j - k);
		//   30   65:iload_2         
		//   31   66:iload_3         
		//   32   67:invokestatic    #56  <Method int Math.min(int, int)>
		//   33   70:iload_3         
		//   34   71:iload           4
		//   35   73:isub            
		//   36   74:invokestatic    #59  <Method int Math.max(int, int)>
		//   37   77:ireturn         
			} else
			{
				j = getPaddingLeft() + ((LayoutParams) (view)).leftMargin;
		//   38   78:aload_0         
		//   39   79:getfield        #13  <Field SlidingPaneLayout this$0>
		//   40   82:invokevirtual   #62  <Method int SlidingPaneLayout.getPaddingLeft()>
		//   41   85:aload_1         
		//   42   86:getfield        #65  <Field int SlidingPaneLayout$LayoutParams.leftMargin>
		//   43   89:iadd            
		//   44   90:istore_3        
				int l = mSlideRange;
		//   45   91:aload_0         
		//   46   92:getfield        #13  <Field SlidingPaneLayout this$0>
		//   47   95:getfield        #50  <Field int SlidingPaneLayout.mSlideRange>
		//   48   98:istore          4
				return Math.min(Math.max(i, j), l + j);
		//   49  100:iload_2         
		//   50  101:iload_3         
		//   51  102:invokestatic    #59  <Method int Math.max(int, int)>
		//   52  105:iload           4
		//   53  107:iload_3         
		//   54  108:iadd            
		//   55  109:invokestatic    #56  <Method int Math.min(int, int)>
		//   56  112:ireturn         
			}
		}

		public int clampViewPositionVertical(View view, int i, int j)
		{
			return view.getTop();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #69  <Method int View.getTop()>
		//    2    4:ireturn         
		}

		public int getViewHorizontalDragRange(View view)
		{
			return mSlideRange;
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field SlidingPaneLayout this$0>
		//    2    4:getfield        #50  <Field int SlidingPaneLayout.mSlideRange>
		//    3    7:ireturn         
		}

		public void onEdgeDragStarted(int i, int j)
		{
			mDragHelper.captureChildView(mSlideableView, j);
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field SlidingPaneLayout this$0>
		//    2    4:getfield        #77  <Field ViewDragHelper SlidingPaneLayout.mDragHelper>
		//    3    7:aload_0         
		//    4    8:getfield        #13  <Field SlidingPaneLayout this$0>
		//    5   11:getfield        #23  <Field View SlidingPaneLayout.mSlideableView>
		//    6   14:iload_2         
		//    7   15:invokevirtual   #83  <Method void ViewDragHelper.captureChildView(View, int)>
		//    8   18:return          
		}

		public void onViewCaptured(View view, int i)
		{
			setAllChildrenVisible();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field SlidingPaneLayout this$0>
		//    2    4:invokevirtual   #87  <Method void SlidingPaneLayout.setAllChildrenVisible()>
		//    3    7:return          
		}

		public void onViewDragStateChanged(int i)
		{
			if(mDragHelper.getViewDragState() == 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #13  <Field SlidingPaneLayout this$0>
		//*   2    4:getfield        #77  <Field ViewDragHelper SlidingPaneLayout.mDragHelper>
		//*   3    7:invokevirtual   #92  <Method int ViewDragHelper.getViewDragState()>
		//*   4   10:ifne            81
			{
				if(mSlideOffset == 0.0F)
		//*   5   13:aload_0         
		//*   6   14:getfield        #13  <Field SlidingPaneLayout this$0>
		//*   7   17:getfield        #96  <Field float SlidingPaneLayout.mSlideOffset>
		//*   8   20:fconst_0        
		//*   9   21:fcmpl           
		//*  10   22:ifne            60
				{
					SlidingPaneLayout slidingpanelayout = SlidingPaneLayout.this;
		//   11   25:aload_0         
		//   12   26:getfield        #13  <Field SlidingPaneLayout this$0>
		//   13   29:astore_2        
					slidingpanelayout.updateObscuredViewsVisibility(slidingpanelayout.mSlideableView);
		//   14   30:aload_2         
		//   15   31:aload_2         
		//   16   32:getfield        #23  <Field View SlidingPaneLayout.mSlideableView>
		//   17   35:invokevirtual   #100 <Method void SlidingPaneLayout.updateObscuredViewsVisibility(View)>
					slidingpanelayout = SlidingPaneLayout.this;
		//   18   38:aload_0         
		//   19   39:getfield        #13  <Field SlidingPaneLayout this$0>
		//   20   42:astore_2        
					slidingpanelayout.dispatchOnPanelClosed(slidingpanelayout.mSlideableView);
		//   21   43:aload_2         
		//   22   44:aload_2         
		//   23   45:getfield        #23  <Field View SlidingPaneLayout.mSlideableView>
		//   24   48:invokevirtual   #103 <Method void SlidingPaneLayout.dispatchOnPanelClosed(View)>
					mPreservedOpenState = false;
		//   25   51:aload_0         
		//   26   52:getfield        #13  <Field SlidingPaneLayout this$0>
		//   27   55:iconst_0        
		//   28   56:putfield        #107 <Field boolean SlidingPaneLayout.mPreservedOpenState>
					return;
		//   29   59:return          
				}
				SlidingPaneLayout slidingpanelayout1 = SlidingPaneLayout.this;
		//   30   60:aload_0         
		//   31   61:getfield        #13  <Field SlidingPaneLayout this$0>
		//   32   64:astore_2        
				slidingpanelayout1.dispatchOnPanelOpened(slidingpanelayout1.mSlideableView);
		//   33   65:aload_2         
		//   34   66:aload_2         
		//   35   67:getfield        #23  <Field View SlidingPaneLayout.mSlideableView>
		//   36   70:invokevirtual   #110 <Method void SlidingPaneLayout.dispatchOnPanelOpened(View)>
				mPreservedOpenState = true;
		//   37   73:aload_0         
		//   38   74:getfield        #13  <Field SlidingPaneLayout this$0>
		//   39   77:iconst_1        
		//   40   78:putfield        #107 <Field boolean SlidingPaneLayout.mPreservedOpenState>
			}
		//   41   81:return          
		}

		public void onViewPositionChanged(View view, int i, int j, int k, int l)
		{
			onPanelDragged(i);
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field SlidingPaneLayout this$0>
		//    2    4:iload_2         
		//    3    5:invokevirtual   #115 <Method void SlidingPaneLayout.onPanelDragged(int)>
			invalidate();
		//    4    8:aload_0         
		//    5    9:getfield        #13  <Field SlidingPaneLayout this$0>
		//    6   12:invokevirtual   #118 <Method void SlidingPaneLayout.invalidate()>
		//    7   15:return          
		}

		public void onViewReleased(View view, float f, float f1)
		{
			int i;
label0:
			{
				LayoutParams layoutparams;
label1:
				{
label2:
					{
						layoutparams = (LayoutParams)view.getLayoutParams();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #29  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #31  <Class SlidingPaneLayout$LayoutParams>
		//    3    7:astore          7
						if(!isLayoutRtlSupport())
							break label1;
		//    4    9:aload_0         
		//    5   10:getfield        #13  <Field SlidingPaneLayout this$0>
		//    6   13:invokevirtual   #35  <Method boolean SlidingPaneLayout.isLayoutRtlSupport()>
		//    7   16:ifeq            109
						int j = getPaddingRight() + layoutparams.rightMargin;
		//    8   19:aload_0         
		//    9   20:getfield        #13  <Field SlidingPaneLayout this$0>
		//   10   23:invokevirtual   #42  <Method int SlidingPaneLayout.getPaddingRight()>
		//   11   26:aload           7
		//   12   28:getfield        #46  <Field int SlidingPaneLayout$LayoutParams.rightMargin>
		//   13   31:iadd            
		//   14   32:istore          5
						if(f >= 0.0F)
		//*  15   34:fload_2         
		//*  16   35:fconst_0        
		//*  17   36:fcmpg           
		//*  18   37:iflt            67
						{
							i = j;
		//   19   40:iload           5
		//   20   42:istore          4
							if(f != 0.0F)
								break label2;
		//   21   44:fload_2         
		//   22   45:fconst_0        
		//   23   46:fcmpl           
		//   24   47:ifne            79
							i = j;
		//   25   50:iload           5
		//   26   52:istore          4
							if(mSlideOffset <= 0.5F)
								break label2;
		//   27   54:aload_0         
		//   28   55:getfield        #13  <Field SlidingPaneLayout this$0>
		//   29   58:getfield        #96  <Field float SlidingPaneLayout.mSlideOffset>
		//   30   61:ldc1            #121 <Float 0.5F>
		//   31   63:fcmpl           
		//   32   64:ifle            79
						}
						i = j + mSlideRange;
		//   33   67:iload           5
		//   34   69:aload_0         
		//   35   70:getfield        #13  <Field SlidingPaneLayout this$0>
		//   36   73:getfield        #50  <Field int SlidingPaneLayout.mSlideRange>
		//   37   76:iadd            
		//   38   77:istore          4
					}
					int k = mSlideableView.getWidth();
		//   39   79:aload_0         
		//   40   80:getfield        #13  <Field SlidingPaneLayout this$0>
		//   41   83:getfield        #23  <Field View SlidingPaneLayout.mSlideableView>
		//   42   86:invokevirtual   #47  <Method int View.getWidth()>
		//   43   89:istore          5
					i = getWidth() - i - k;
		//   44   91:aload_0         
		//   45   92:getfield        #13  <Field SlidingPaneLayout this$0>
		//   46   95:invokevirtual   #39  <Method int SlidingPaneLayout.getWidth()>
		//   47   98:iload           4
		//   48  100:isub            
		//   49  101:iload           5
		//   50  103:isub            
		//   51  104:istore          4
					break label0;
		//   52  106:goto            176
				}
				i = getPaddingLeft();
		//   53  109:aload_0         
		//   54  110:getfield        #13  <Field SlidingPaneLayout this$0>
		//   55  113:invokevirtual   #62  <Method int SlidingPaneLayout.getPaddingLeft()>
		//   56  116:istore          4
				int l = layoutparams.leftMargin + i;
		//   57  118:aload           7
		//   58  120:getfield        #65  <Field int SlidingPaneLayout$LayoutParams.leftMargin>
		//   59  123:iload           4
		//   60  125:iadd            
		//   61  126:istore          5
				int i1 = f != 0.0F;
		//   62  128:fload_2         
		//   63  129:fconst_0        
		//   64  130:fcmpl           
		//   65  131:istore          6
				if(i1 <= 0)
		//*  66  133:iload           6
		//*  67  135:ifgt            164
				{
					i = l;
		//   68  138:iload           5
		//   69  140:istore          4
					if(i1 != 0)
						break label0;
		//   70  142:iload           6
		//   71  144:ifne            176
					i = l;
		//   72  147:iload           5
		//   73  149:istore          4
					if(mSlideOffset <= 0.5F)
						break label0;
		//   74  151:aload_0         
		//   75  152:getfield        #13  <Field SlidingPaneLayout this$0>
		//   76  155:getfield        #96  <Field float SlidingPaneLayout.mSlideOffset>
		//   77  158:ldc1            #121 <Float 0.5F>
		//   78  160:fcmpl           
		//   79  161:ifle            176
				}
				i = l + mSlideRange;
		//   80  164:iload           5
		//   81  166:aload_0         
		//   82  167:getfield        #13  <Field SlidingPaneLayout this$0>
		//   83  170:getfield        #50  <Field int SlidingPaneLayout.mSlideRange>
		//   84  173:iadd            
		//   85  174:istore          4
			}
			mDragHelper.settleCapturedViewAt(i, view.getTop());
		//   86  176:aload_0         
		//   87  177:getfield        #13  <Field SlidingPaneLayout this$0>
		//   88  180:getfield        #77  <Field ViewDragHelper SlidingPaneLayout.mDragHelper>
		//   89  183:iload           4
		//   90  185:aload_1         
		//   91  186:invokevirtual   #69  <Method int View.getTop()>
		//   92  189:invokevirtual   #125 <Method boolean ViewDragHelper.settleCapturedViewAt(int, int)>
		//   93  192:pop             
			invalidate();
		//   94  193:aload_0         
		//   95  194:getfield        #13  <Field SlidingPaneLayout this$0>
		//   96  197:invokevirtual   #118 <Method void SlidingPaneLayout.invalidate()>
		//   97  200:return          
		}

		public boolean tryCaptureView(View view, int i)
		{
			if(mIsUnableToDrag)
		//*   0    0:aload_0         
		//*   1    1:getfield        #13  <Field SlidingPaneLayout this$0>
		//*   2    4:getfield        #130 <Field boolean SlidingPaneLayout.mIsUnableToDrag>
		//*   3    7:ifeq            12
				return false;
		//    4   10:iconst_0        
		//    5   11:ireturn         
			else
				return ((LayoutParams)view.getLayoutParams()).slideable;
		//    6   12:aload_1         
		//    7   13:invokevirtual   #29  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    8   16:checkcast       #31  <Class SlidingPaneLayout$LayoutParams>
		//    9   19:getfield        #133 <Field boolean SlidingPaneLayout$LayoutParams.slideable>
		//   10   22:ireturn         
		}

		final SlidingPaneLayout this$0;

		DragHelperCallback()
		{
			this$0 = SlidingPaneLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field SlidingPaneLayout this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void ViewDragHelper$Callback()>
		//    5    9:return          
		}
	}

	public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
	{

		private static final int ATTRS[] = {
			0x1010181
		};
		Paint dimPaint;
		boolean dimWhenOffset;
		boolean slideable;
		public float weight;

		static 
		{
		//    0    0:iconst_1        
		//    1    1:newarray        int[]
		//    2    3:dup             
		//    3    4:iconst_0        
		//    4    5:ldc1            #19  <Int 0x1010181>
		//    5    7:iastore         
		//    6    8:putstatic       #21  <Field int[] ATTRS>
		//*   7   11:return          
		}

		public LayoutParams()
		{
			super(-1, -1);
		//    0    0:aload_0         
		//    1    1:iconst_m1       
		//    2    2:iconst_m1       
		//    3    3:invokespecial   #26  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
			weight = 0.0F;
		//    4    6:aload_0         
		//    5    7:fconst_0        
		//    6    8:putfield        #28  <Field float weight>
		//    7   11:return          
		}

		public LayoutParams(int i, int j)
		{
			super(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #26  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
			weight = 0.0F;
		//    4    6:aload_0         
		//    5    7:fconst_0        
		//    6    8:putfield        #28  <Field float weight>
		//    7   11:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #33  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
			weight = 0.0F;
		//    4    6:aload_0         
		//    5    7:fconst_0        
		//    6    8:putfield        #28  <Field float weight>
			context = ((Context) (context.obtainStyledAttributes(attributeset, ATTRS)));
		//    7   11:aload_1         
		//    8   12:aload_2         
		//    9   13:getstatic       #21  <Field int[] ATTRS>
		//   10   16:invokevirtual   #39  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//   11   19:astore_1        
			weight = ((TypedArray) (context)).getFloat(0, 0.0F);
		//   12   20:aload_0         
		//   13   21:aload_1         
		//   14   22:iconst_0        
		//   15   23:fconst_0        
		//   16   24:invokevirtual   #45  <Method float TypedArray.getFloat(int, float)>
		//   17   27:putfield        #28  <Field float weight>
			((TypedArray) (context)).recycle();
		//   18   30:aload_1         
		//   19   31:invokevirtual   #48  <Method void TypedArray.recycle()>
		//   20   34:return          
		}

		public LayoutParams(LayoutParams layoutparams)
		{
			super(((android.view.ViewGroup.MarginLayoutParams) (layoutparams)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #53  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
			weight = 0.0F;
		//    3    5:aload_0         
		//    4    6:fconst_0        
		//    5    7:putfield        #28  <Field float weight>
			weight = layoutparams.weight;
		//    6   10:aload_0         
		//    7   11:aload_1         
		//    8   12:getfield        #28  <Field float weight>
		//    9   15:putfield        #28  <Field float weight>
		//   10   18:return          
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #56  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
			weight = 0.0F;
		//    3    5:aload_0         
		//    4    6:fconst_0        
		//    5    7:putfield        #28  <Field float weight>
		//    6   10:return          
		}

		public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			super(marginlayoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #53  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
			weight = 0.0F;
		//    3    5:aload_0         
		//    4    6:fconst_0        
		//    5    7:putfield        #28  <Field float weight>
		//    6   10:return          
		}
	}

	public static interface PanelSlideListener
	{

		public abstract void onPanelClosed(View view);

		public abstract void onPanelOpened(View view);

		public abstract void onPanelSlide(View view, float f);
	}

	static class SavedState extends AbsSavedState
	{

		public void writeToParcel(Parcel parcel, int i)
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #40  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #42  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #47  <Method void Runtime(String)>
		//    4    9:athrow          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public SavedState createFromParcel(Parcel parcel)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class SlidingPaneLayout$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void SlidingPaneLayout$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class SlidingPaneLayout$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void SlidingPaneLayout$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #26  <Method SlidingPaneLayout$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (createFromParcel(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #29  <Method SlidingPaneLayout$SavedState createFromParcel(Parcel, ClassLoader)>
			//    4    6:areturn         
			}

			public SavedState[] newArray(int i)
			{
				return new SavedState[i];
			//    0    0:iload_1         
			//    1    1:anewarray       SavedState[]
			//    2    4:areturn         
			}

			public volatile Object[] newArray(int i)
			{
				return ((Object []) (newArray(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #34  <Method SlidingPaneLayout$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		boolean isOpen;

		static 
		{
		//    0    0:new             #9   <Class SlidingPaneLayout$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #19  <Method void SlidingPaneLayout$SavedState$1()>
		//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #25  <Method void AbsSavedState(Parcel, ClassLoader)>
			boolean flag;
			if(parcel.readInt() != 0)
		//*   4    6:aload_1         
		//*   5    7:invokevirtual   #31  <Method int Parcel.readInt()>
		//*   6   10:ifeq            18
				flag = true;
		//    7   13:iconst_1        
		//    8   14:istore_3        
			else
		//*   9   15:goto            20
				flag = false;
		//   10   18:iconst_0        
		//   11   19:istore_3        
			isOpen = flag;
		//   12   20:aload_0         
		//   13   21:iload_3         
		//   14   22:putfield        #33  <Field boolean isOpen>
		//   15   25:return          
		}

		SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #36  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}

	public static class SimplePanelSlideListener
		implements PanelSlideListener
	{

		public void onPanelClosed(View view)
		{
		//    0    0:return          
		}

		public void onPanelOpened(View view)
		{
		//    0    0:return          
		}

		public void onPanelSlide(View view, float f)
		{
		//    0    0:return          
		}

		public SimplePanelSlideListener()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}


	public SlidingPaneLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #78  <Method void SlidingPaneLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public SlidingPaneLayout(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #84  <Method void SlidingPaneLayout(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public SlidingPaneLayout(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #85  <Method void ViewGroup(Context, AttributeSet, int)>
		mSliderFadeColor = 0xcccccccc;
	//    5    7:aload_0         
	//    6    8:ldc1            #30  <Int 0xcccccccc>
	//    7   10:putfield        #87  <Field int mSliderFadeColor>
		mFirstLayout = true;
	//    8   13:aload_0         
	//    9   14:iconst_1        
	//   10   15:putfield        #89  <Field boolean mFirstLayout>
		mTmpRect = new Rect();
	//   11   18:aload_0         
	//   12   19:new             #91  <Class Rect>
	//   13   22:dup             
	//   14   23:invokespecial   #94  <Method void Rect()>
	//   15   26:putfield        #96  <Field Rect mTmpRect>
		mPostedRunnables = new ArrayList();
	//   16   29:aload_0         
	//   17   30:new             #98  <Class ArrayList>
	//   18   33:dup             
	//   19   34:invokespecial   #99  <Method void ArrayList()>
	//   20   37:putfield        #101 <Field ArrayList mPostedRunnables>
		float f = context.getResources().getDisplayMetrics().density;
	//   21   40:aload_1         
	//   22   41:invokevirtual   #107 <Method Resources Context.getResources()>
	//   23   44:invokevirtual   #113 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   24   47:getfield        #118 <Field float DisplayMetrics.density>
	//   25   50:fstore          4
		mOverhangSize = (int)(32F * f + 0.5F);
	//   26   52:aload_0         
	//   27   53:ldc1            #119 <Float 32F>
	//   28   55:fload           4
	//   29   57:fmul            
	//   30   58:ldc1            #120 <Float 0.5F>
	//   31   60:fadd            
	//   32   61:f2i             
	//   33   62:putfield        #122 <Field int mOverhangSize>
		setWillNotDraw(false);
	//   34   65:aload_0         
	//   35   66:iconst_0        
	//   36   67:invokevirtual   #126 <Method void setWillNotDraw(boolean)>
		ViewCompat.setAccessibilityDelegate(((View) (this)), ((AccessibilityDelegateCompat) (new AccessibilityDelegate())));
	//   37   70:aload_0         
	//   38   71:new             #6   <Class SlidingPaneLayout$AccessibilityDelegate>
	//   39   74:dup             
	//   40   75:aload_0         
	//   41   76:invokespecial   #129 <Method void SlidingPaneLayout$AccessibilityDelegate(SlidingPaneLayout)>
	//   42   79:invokestatic    #135 <Method void ViewCompat.setAccessibilityDelegate(View, AccessibilityDelegateCompat)>
		ViewCompat.setImportantForAccessibility(((View) (this)), 1);
	//   43   82:aload_0         
	//   44   83:iconst_1        
	//   45   84:invokestatic    #139 <Method void ViewCompat.setImportantForAccessibility(View, int)>
		mDragHelper = ViewDragHelper.create(((ViewGroup) (this)), 0.5F, ((ViewDragHelper.Callback) (new DragHelperCallback())));
	//   46   87:aload_0         
	//   47   88:aload_0         
	//   48   89:ldc1            #120 <Float 0.5F>
	//   49   91:new             #12  <Class SlidingPaneLayout$DragHelperCallback>
	//   50   94:dup             
	//   51   95:aload_0         
	//   52   96:invokespecial   #140 <Method void SlidingPaneLayout$DragHelperCallback(SlidingPaneLayout)>
	//   53   99:invokestatic    #146 <Method ViewDragHelper ViewDragHelper.create(ViewGroup, float, ViewDragHelper$Callback)>
	//   54  102:putfield        #148 <Field ViewDragHelper mDragHelper>
		mDragHelper.setMinVelocity(f * 400F);
	//   55  105:aload_0         
	//   56  106:getfield        #148 <Field ViewDragHelper mDragHelper>
	//   57  109:fload           4
	//   58  111:ldc1            #149 <Float 400F>
	//   59  113:fmul            
	//   60  114:invokevirtual   #153 <Method void ViewDragHelper.setMinVelocity(float)>
	//   61  117:return          
	}

	private boolean closePane(View view, int i)
	{
		if(!mFirstLayout && !smoothSlideTo(0.0F, i))
	//*   0    0:aload_0         
	//*   1    1:getfield        #89  <Field boolean mFirstLayout>
	//*   2    4:ifne            21
	//*   3    7:aload_0         
	//*   4    8:fconst_0        
	//*   5    9:iload_2         
	//*   6   10:invokevirtual   #159 <Method boolean smoothSlideTo(float, int)>
	//*   7   13:ifeq            19
	//*   8   16:goto            21
		{
			return false;
	//    9   19:iconst_0        
	//   10   20:ireturn         
		} else
		{
			mPreservedOpenState = false;
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:putfield        #161 <Field boolean mPreservedOpenState>
			return true;
	//   14   26:iconst_1        
	//   15   27:ireturn         
		}
	}

	private void dimChildView(View view, float f, int i)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #169 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #15  <Class SlidingPaneLayout$LayoutParams>
	//    3    7:astore          5
		if(f > 0.0F && i != 0)
	//*   4    9:fload_2         
	//*   5   10:fconst_0        
	//*   6   11:fcmpl           
	//*   7   12:ifle            105
	//*   8   15:iload_3         
	//*   9   16:ifeq            105
		{
			int j = (int)((float)((0xff000000 & i) >>> 24) * f);
	//   10   19:ldc1            #170 <Int 0xff000000>
	//   11   21:iload_3         
	//   12   22:iand            
	//   13   23:bipush          24
	//   14   25:iushr           
	//   15   26:i2f             
	//   16   27:fload_2         
	//   17   28:fmul            
	//   18   29:f2i             
	//   19   30:istore          4
			if(layoutparams.dimPaint == null)
	//*  20   32:aload           5
	//*  21   34:getfield        #174 <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
	//*  22   37:ifnonnull       52
				layoutparams.dimPaint = new Paint();
	//   23   40:aload           5
	//   24   42:new             #176 <Class Paint>
	//   25   45:dup             
	//   26   46:invokespecial   #177 <Method void Paint()>
	//   27   49:putfield        #174 <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
			layoutparams.dimPaint.setColorFilter(((android.graphics.ColorFilter) (new PorterDuffColorFilter(j << 24 | i & 0xffffff, android.graphics.PorterDuff.Mode.SRC_OVER))));
	//   28   52:aload           5
	//   29   54:getfield        #174 <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
	//   30   57:new             #179 <Class PorterDuffColorFilter>
	//   31   60:dup             
	//   32   61:iload           4
	//   33   63:bipush          24
	//   34   65:ishl            
	//   35   66:iload_3         
	//   36   67:ldc1            #180 <Int 0xffffff>
	//   37   69:iand            
	//   38   70:ior             
	//   39   71:getstatic       #186 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_OVER>
	//   40   74:invokespecial   #189 <Method void PorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   41   77:invokevirtual   #193 <Method android.graphics.ColorFilter Paint.setColorFilter(android.graphics.ColorFilter)>
	//   42   80:pop             
			if(view.getLayerType() != 2)
	//*  43   81:aload_1         
	//*  44   82:invokevirtual   #197 <Method int View.getLayerType()>
	//*  45   85:iconst_2        
	//*  46   86:icmpeq          99
				view.setLayerType(2, layoutparams.dimPaint);
	//   47   89:aload_1         
	//   48   90:iconst_2        
	//   49   91:aload           5
	//   50   93:getfield        #174 <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
	//   51   96:invokevirtual   #201 <Method void View.setLayerType(int, Paint)>
			invalidateChildRegion(view);
	//   52   99:aload_0         
	//   53  100:aload_1         
	//   54  101:invokevirtual   #205 <Method void invalidateChildRegion(View)>
			return;
	//   55  104:return          
		}
		if(view.getLayerType() != 0)
	//*  56  105:aload_1         
	//*  57  106:invokevirtual   #197 <Method int View.getLayerType()>
	//*  58  109:ifeq            154
		{
			if(layoutparams.dimPaint != null)
	//*  59  112:aload           5
	//*  60  114:getfield        #174 <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
	//*  61  117:ifnull          130
				layoutparams.dimPaint.setColorFilter(((android.graphics.ColorFilter) (null)));
	//   62  120:aload           5
	//   63  122:getfield        #174 <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
	//   64  125:aconst_null     
	//   65  126:invokevirtual   #193 <Method android.graphics.ColorFilter Paint.setColorFilter(android.graphics.ColorFilter)>
	//   66  129:pop             
			view = ((View) (new DisableLayerRunnable(view)));
	//   67  130:new             #9   <Class SlidingPaneLayout$DisableLayerRunnable>
	//   68  133:dup             
	//   69  134:aload_0         
	//   70  135:aload_1         
	//   71  136:invokespecial   #208 <Method void SlidingPaneLayout$DisableLayerRunnable(SlidingPaneLayout, View)>
	//   72  139:astore_1        
			mPostedRunnables.add(((Object) (view)));
	//   73  140:aload_0         
	//   74  141:getfield        #101 <Field ArrayList mPostedRunnables>
	//   75  144:aload_1         
	//   76  145:invokevirtual   #212 <Method boolean ArrayList.add(Object)>
	//   77  148:pop             
			ViewCompat.postOnAnimation(((View) (this)), ((Runnable) (view)));
	//   78  149:aload_0         
	//   79  150:aload_1         
	//   80  151:invokestatic    #216 <Method void ViewCompat.postOnAnimation(View, Runnable)>
		}
	//   81  154:return          
	}

	private boolean openPane(View view, int i)
	{
		if(!mFirstLayout && !smoothSlideTo(1.0F, i))
	//*   0    0:aload_0         
	//*   1    1:getfield        #89  <Field boolean mFirstLayout>
	//*   2    4:ifne            21
	//*   3    7:aload_0         
	//*   4    8:fconst_1        
	//*   5    9:iload_2         
	//*   6   10:invokevirtual   #159 <Method boolean smoothSlideTo(float, int)>
	//*   7   13:ifeq            19
	//*   8   16:goto            21
		{
			return false;
	//    9   19:iconst_0        
	//   10   20:ireturn         
		} else
		{
			mPreservedOpenState = true;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #161 <Field boolean mPreservedOpenState>
			return true;
	//   14   26:iconst_1        
	//   15   27:ireturn         
		}
	}

	private void parallaxOtherViews(float f)
	{
		int i;
		int j;
		boolean flag;
label0:
		{
			flag = isLayoutRtlSupport();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #222 <Method boolean isLayoutRtlSupport()>
	//    2    4:istore          8
			LayoutParams layoutparams = (LayoutParams)mSlideableView.getLayoutParams();
	//    3    6:aload_0         
	//    4    7:getfield        #224 <Field View mSlideableView>
	//    5   10:invokevirtual   #169 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    6   13:checkcast       #15  <Class SlidingPaneLayout$LayoutParams>
	//    7   16:astore          10
			boolean flag1 = layoutparams.dimWhenOffset;
	//    8   18:aload           10
	//    9   20:getfield        #227 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
	//   10   23:istore          9
			j = 0;
	//   11   25:iconst_0        
	//   12   26:istore          4
			if(flag1)
	//*  13   28:iload           9
	//*  14   30:ifeq            62
			{
				if(flag)
	//*  15   33:iload           8
	//*  16   35:ifeq            47
					i = layoutparams.rightMargin;
	//   17   38:aload           10
	//   18   40:getfield        #230 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//   19   43:istore_3        
				else
	//*  20   44:goto            53
					i = layoutparams.leftMargin;
	//   21   47:aload           10
	//   22   49:getfield        #233 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//   23   52:istore_3        
				if(i <= 0)
	//*  24   53:iload_3         
	//*  25   54:ifgt            62
				{
					i = 1;
	//   26   57:iconst_1        
	//   27   58:istore_3        
					break label0;
	//   28   59:goto            64
				}
			}
			i = 0;
	//   29   62:iconst_0        
	//   30   63:istore_3        
		}
		for(int i1 = getChildCount(); j < i1; j++)
	//*  31   64:aload_0         
	//*  32   65:invokevirtual   #236 <Method int getChildCount()>
	//*  33   68:istore          7
	//*  34   70:iload           4
	//*  35   72:iload           7
	//*  36   74:icmpge          203
		{
			View view = getChildAt(j);
	//   37   77:aload_0         
	//   38   78:iload           4
	//   39   80:invokevirtual   #240 <Method View getChildAt(int)>
	//   40   83:astore          10
			if(view == mSlideableView)
	//*  41   85:aload           10
	//*  42   87:aload_0         
	//*  43   88:getfield        #224 <Field View mSlideableView>
	//*  44   91:if_acmpne       97
				continue;
	//   45   94:goto            194
			float f1 = mParallaxOffset;
	//   46   97:aload_0         
	//   47   98:getfield        #242 <Field float mParallaxOffset>
	//   48  101:fstore_2        
			int k = mParallaxBy;
	//   49  102:aload_0         
	//   50  103:getfield        #244 <Field int mParallaxBy>
	//   51  106:istore          5
			int l = (int)((1.0F - f1) * (float)k);
	//   52  108:fconst_1        
	//   53  109:fload_2         
	//   54  110:fsub            
	//   55  111:iload           5
	//   56  113:i2f             
	//   57  114:fmul            
	//   58  115:f2i             
	//   59  116:istore          6
			mParallaxOffset = f;
	//   60  118:aload_0         
	//   61  119:fload_1         
	//   62  120:putfield        #242 <Field float mParallaxOffset>
			l -= (int)((1.0F - f) * (float)k);
	//   63  123:iload           6
	//   64  125:fconst_1        
	//   65  126:fload_1         
	//   66  127:fsub            
	//   67  128:iload           5
	//   68  130:i2f             
	//   69  131:fmul            
	//   70  132:f2i             
	//   71  133:isub            
	//   72  134:istore          6
			k = l;
	//   73  136:iload           6
	//   74  138:istore          5
			if(flag)
	//*  75  140:iload           8
	//*  76  142:ifeq            150
				k = -l;
	//   77  145:iload           6
	//   78  147:ineg            
	//   79  148:istore          5
			view.offsetLeftAndRight(k);
	//   80  150:aload           10
	//   81  152:iload           5
	//   82  154:invokevirtual   #248 <Method void View.offsetLeftAndRight(int)>
			if(!i)
				continue;
	//   83  157:iload_3         
	//   84  158:ifeq            194
			if(flag)
	//*  85  161:iload           8
	//*  86  163:ifeq            176
				f1 = mParallaxOffset - 1.0F;
	//   87  166:aload_0         
	//   88  167:getfield        #242 <Field float mParallaxOffset>
	//   89  170:fconst_1        
	//   90  171:fsub            
	//   91  172:fstore_2        
			else
	//*  92  173:goto            183
				f1 = 1.0F - mParallaxOffset;
	//   93  176:fconst_1        
	//   94  177:aload_0         
	//   95  178:getfield        #242 <Field float mParallaxOffset>
	//   96  181:fsub            
	//   97  182:fstore_2        
			dimChildView(view, f1, mCoveredFadeColor);
	//   98  183:aload_0         
	//   99  184:aload           10
	//  100  186:fload_2         
	//  101  187:aload_0         
	//  102  188:getfield        #250 <Field int mCoveredFadeColor>
	//  103  191:invokespecial   #252 <Method void dimChildView(View, float, int)>
		}

	//  104  194:iload           4
	//  105  196:iconst_1        
	//  106  197:iadd            
	//  107  198:istore          4
	//* 108  200:goto            70
	//  109  203:return          
	}

	private static boolean viewIsOpaque(View view)
	{
		if(view.isOpaque())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #257 <Method boolean View.isOpaque()>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   5    9:getstatic       #262 <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   12:bipush          18
	//*   7   14:icmplt          19
			return false;
	//    8   17:iconst_0        
	//    9   18:ireturn         
		view = ((View) (view.getBackground()));
	//   10   19:aload_0         
	//   11   20:invokevirtual   #266 <Method Drawable View.getBackground()>
	//   12   23:astore_0        
		if(view != null)
	//*  13   24:aload_0         
	//*  14   25:ifnull          40
			return ((Drawable) (view)).getOpacity() == -1;
	//   15   28:aload_0         
	//   16   29:invokevirtual   #271 <Method int Drawable.getOpacity()>
	//   17   32:iconst_m1       
	//   18   33:icmpne          38
	//   19   36:iconst_1        
	//   20   37:ireturn         
	//   21   38:iconst_0        
	//   22   39:ireturn         
		else
			return false;
	//   23   40:iconst_0        
	//   24   41:ireturn         
	}

	protected boolean canScroll(View view, boolean flag, int i, int j, int k)
	{
		if(view instanceof ViewGroup)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #4   <Class ViewGroup>
	//*   2    4:ifeq            140
		{
			ViewGroup viewgroup = (ViewGroup)view;
	//    3    7:aload_1         
	//    4    8:checkcast       #4   <Class ViewGroup>
	//    5   11:astore          11
			int i1 = view.getScrollX();
	//    6   13:aload_1         
	//    7   14:invokevirtual   #276 <Method int View.getScrollX()>
	//    8   17:istore          7
			int j1 = view.getScrollY();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #279 <Method int View.getScrollY()>
	//   11   23:istore          8
			for(int l = viewgroup.getChildCount() - 1; l >= 0; l--)
	//*  12   25:aload           11
	//*  13   27:invokevirtual   #280 <Method int ViewGroup.getChildCount()>
	//*  14   30:iconst_1        
	//*  15   31:isub            
	//*  16   32:istore          6
	//*  17   34:iload           6
	//*  18   36:iflt            140
			{
				View view1 = viewgroup.getChildAt(l);
	//   19   39:aload           11
	//   20   41:iload           6
	//   21   43:invokevirtual   #281 <Method View ViewGroup.getChildAt(int)>
	//   22   46:astore          12
				int k1 = j + i1;
	//   23   48:iload           4
	//   24   50:iload           7
	//   25   52:iadd            
	//   26   53:istore          9
				if(k1 < view1.getLeft() || k1 >= view1.getRight())
					continue;
	//   27   55:iload           9
	//   28   57:aload           12
	//   29   59:invokevirtual   #284 <Method int View.getLeft()>
	//   30   62:icmplt          131
	//   31   65:iload           9
	//   32   67:aload           12
	//   33   69:invokevirtual   #287 <Method int View.getRight()>
	//   34   72:icmpge          131
				int l1 = k + j1;
	//   35   75:iload           5
	//   36   77:iload           8
	//   37   79:iadd            
	//   38   80:istore          10
				if(l1 >= view1.getTop() && l1 < view1.getBottom() && canScroll(view1, true, i, k1 - view1.getLeft(), l1 - view1.getTop()))
	//*  39   82:iload           10
	//*  40   84:aload           12
	//*  41   86:invokevirtual   #290 <Method int View.getTop()>
	//*  42   89:icmplt          131
	//*  43   92:iload           10
	//*  44   94:aload           12
	//*  45   96:invokevirtual   #293 <Method int View.getBottom()>
	//*  46   99:icmpge          131
	//*  47  102:aload_0         
	//*  48  103:aload           12
	//*  49  105:iconst_1        
	//*  50  106:iload_3         
	//*  51  107:iload           9
	//*  52  109:aload           12
	//*  53  111:invokevirtual   #284 <Method int View.getLeft()>
	//*  54  114:isub            
	//*  55  115:iload           10
	//*  56  117:aload           12
	//*  57  119:invokevirtual   #290 <Method int View.getTop()>
	//*  58  122:isub            
	//*  59  123:invokevirtual   #295 <Method boolean canScroll(View, boolean, int, int, int)>
	//*  60  126:ifeq            131
					return true;
	//   61  129:iconst_1        
	//   62  130:ireturn         
			}

	//   63  131:iload           6
	//   64  133:iconst_1        
	//   65  134:isub            
	//   66  135:istore          6
		}
	//*  67  137:goto            34
		if(flag)
	//*  68  140:iload_2         
	//*  69  141:ifeq            167
		{
			if(!isLayoutRtlSupport())
	//*  70  144:aload_0         
	//*  71  145:invokevirtual   #222 <Method boolean isLayoutRtlSupport()>
	//*  72  148:ifeq            154
	//*  73  151:goto            157
				i = -i;
	//   74  154:iload_3         
	//   75  155:ineg            
	//   76  156:istore_3        
			if(view.canScrollHorizontally(i))
	//*  77  157:aload_1         
	//*  78  158:iload_3         
	//*  79  159:invokevirtual   #299 <Method boolean View.canScrollHorizontally(int)>
	//*  80  162:ifeq            167
				return true;
	//   81  165:iconst_1        
	//   82  166:ireturn         
		}
		return false;
	//   83  167:iconst_0        
	//   84  168:ireturn         
	}

	public boolean canSlide()
	{
		return mCanSlide;
	//    0    0:aload_0         
	//    1    1:getfield        #303 <Field boolean mCanSlide>
	//    2    4:ireturn         
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
	//    0    0:aload_1         
	//    1    1:instanceof      #15  <Class SlidingPaneLayout$LayoutParams>
	//    2    4:ifeq            17
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #308 <Method boolean ViewGroup.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    6   12:ifeq            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public boolean closePane()
	{
		return closePane(mSlideableView, 0);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #224 <Field View mSlideableView>
	//    3    5:iconst_0        
	//    4    6:invokespecial   #310 <Method boolean closePane(View, int)>
	//    5    9:ireturn         
	}

	public void computeScroll()
	{
		if(mDragHelper.continueSettling(true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #148 <Field ViewDragHelper mDragHelper>
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #315 <Method boolean ViewDragHelper.continueSettling(boolean)>
	//*   4    8:ifeq            30
		{
			if(!mCanSlide)
	//*   5   11:aload_0         
	//*   6   12:getfield        #303 <Field boolean mCanSlide>
	//*   7   15:ifne            26
			{
				mDragHelper.abort();
	//    8   18:aload_0         
	//    9   19:getfield        #148 <Field ViewDragHelper mDragHelper>
	//   10   22:invokevirtual   #318 <Method void ViewDragHelper.abort()>
				return;
	//   11   25:return          
			}
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   12   26:aload_0         
	//   13   27:invokestatic    #321 <Method void ViewCompat.postInvalidateOnAnimation(View)>
		}
	//   14   30:return          
	}

	void dispatchOnPanelClosed(View view)
	{
		PanelSlideListener panelslidelistener = mPanelSlideListener;
	//    0    0:aload_0         
	//    1    1:getfield        #324 <Field SlidingPaneLayout$PanelSlideListener mPanelSlideListener>
	//    2    4:astore_2        
		if(panelslidelistener != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			panelslidelistener.onPanelClosed(view);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #327 <Method void SlidingPaneLayout$PanelSlideListener.onPanelClosed(View)>
		sendAccessibilityEvent(32);
	//    8   16:aload_0         
	//    9   17:bipush          32
	//   10   19:invokevirtual   #330 <Method void sendAccessibilityEvent(int)>
	//   11   22:return          
	}

	void dispatchOnPanelOpened(View view)
	{
		PanelSlideListener panelslidelistener = mPanelSlideListener;
	//    0    0:aload_0         
	//    1    1:getfield        #324 <Field SlidingPaneLayout$PanelSlideListener mPanelSlideListener>
	//    2    4:astore_2        
		if(panelslidelistener != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			panelslidelistener.onPanelOpened(view);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #334 <Method void SlidingPaneLayout$PanelSlideListener.onPanelOpened(View)>
		sendAccessibilityEvent(32);
	//    8   16:aload_0         
	//    9   17:bipush          32
	//   10   19:invokevirtual   #330 <Method void sendAccessibilityEvent(int)>
	//   11   22:return          
	}

	void dispatchOnPanelSlide(View view)
	{
		PanelSlideListener panelslidelistener = mPanelSlideListener;
	//    0    0:aload_0         
	//    1    1:getfield        #324 <Field SlidingPaneLayout$PanelSlideListener mPanelSlideListener>
	//    2    4:astore_2        
		if(panelslidelistener != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          20
			panelslidelistener.onPanelSlide(view, mSlideOffset);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:getfield        #337 <Field float mSlideOffset>
	//    9   15:invokeinterface #341 <Method void SlidingPaneLayout$PanelSlideListener.onPanelSlide(View, float)>
	//   10   20:return          
	}

	public void draw(Canvas canvas)
	{
		super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #345 <Method void ViewGroup.draw(Canvas)>
		Drawable drawable;
		if(isLayoutRtlSupport())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #222 <Method boolean isLayoutRtlSupport()>
	//*   5    9:ifeq            21
			drawable = mShadowDrawableRight;
	//    6   12:aload_0         
	//    7   13:getfield        #347 <Field Drawable mShadowDrawableRight>
	//    8   16:astore          7
		else
	//*   9   18:goto            27
			drawable = mShadowDrawableLeft;
	//   10   21:aload_0         
	//   11   22:getfield        #349 <Field Drawable mShadowDrawableLeft>
	//   12   25:astore          7
		View view;
		if(getChildCount() > 1)
	//*  13   27:aload_0         
	//*  14   28:invokevirtual   #236 <Method int getChildCount()>
	//*  15   31:iconst_1        
	//*  16   32:icmple          45
			view = getChildAt(1);
	//   17   35:aload_0         
	//   18   36:iconst_1        
	//   19   37:invokevirtual   #240 <Method View getChildAt(int)>
	//   20   40:astore          8
		else
	//*  21   42:goto            48
			view = null;
	//   22   45:aconst_null     
	//   23   46:astore          8
		if(view != null)
	//*  24   48:aload           8
	//*  25   50:ifnull          138
		{
			if(drawable == null)
	//*  26   53:aload           7
	//*  27   55:ifnonnull       59
				return;
	//   28   58:return          
			int l = view.getTop();
	//   29   59:aload           8
	//   30   61:invokevirtual   #290 <Method int View.getTop()>
	//   31   64:istore          5
			int i1 = view.getBottom();
	//   32   66:aload           8
	//   33   68:invokevirtual   #293 <Method int View.getBottom()>
	//   34   71:istore          6
			int k = drawable.getIntrinsicWidth();
	//   35   73:aload           7
	//   36   75:invokevirtual   #352 <Method int Drawable.getIntrinsicWidth()>
	//   37   78:istore          4
			int i;
			int j;
			if(isLayoutRtlSupport())
	//*  38   80:aload_0         
	//*  39   81:invokevirtual   #222 <Method boolean isLayoutRtlSupport()>
	//*  40   84:ifeq            101
			{
				i = view.getRight();
	//   41   87:aload           8
	//   42   89:invokevirtual   #287 <Method int View.getRight()>
	//   43   92:istore_2        
				j = k + i;
	//   44   93:iload           4
	//   45   95:iload_2         
	//   46   96:iadd            
	//   47   97:istore_3        
			} else
	//*  48   98:goto            120
			{
				j = view.getLeft();
	//   49  101:aload           8
	//   50  103:invokevirtual   #284 <Method int View.getLeft()>
	//   51  106:istore_3        
				i = j;
	//   52  107:iload_3         
	//   53  108:istore_2        
				k = j - k;
	//   54  109:iload_3         
	//   55  110:iload           4
	//   56  112:isub            
	//   57  113:istore          4
				j = i;
	//   58  115:iload_2         
	//   59  116:istore_3        
				i = k;
	//   60  117:iload           4
	//   61  119:istore_2        
			}
			drawable.setBounds(i, l, j, i1);
	//   62  120:aload           7
	//   63  122:iload_2         
	//   64  123:iload           5
	//   65  125:iload_3         
	//   66  126:iload           6
	//   67  128:invokevirtual   #356 <Method void Drawable.setBounds(int, int, int, int)>
			drawable.draw(canvas);
	//   68  131:aload           7
	//   69  133:aload_1         
	//   70  134:invokevirtual   #357 <Method void Drawable.draw(Canvas)>
			return;
	//   71  137:return          
		} else
		{
			return;
	//   72  138:return          
		}
	}

	protected boolean drawChild(Canvas canvas, View view, long l)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #169 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #15  <Class SlidingPaneLayout$LayoutParams>
	//    3    7:astore          7
		int i = canvas.save();
	//    4    9:aload_1         
	//    5   10:invokevirtual   #364 <Method int Canvas.save()>
	//    6   13:istore          5
		if(mCanSlide && !layoutparams.slideable && mSlideableView != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #303 <Field boolean mCanSlide>
	//*   9   19:ifeq            117
	//*  10   22:aload           7
	//*  11   24:getfield        #367 <Field boolean SlidingPaneLayout$LayoutParams.slideable>
	//*  12   27:ifne            117
	//*  13   30:aload_0         
	//*  14   31:getfield        #224 <Field View mSlideableView>
	//*  15   34:ifnull          117
		{
			canvas.getClipBounds(mTmpRect);
	//   16   37:aload_1         
	//   17   38:aload_0         
	//   18   39:getfield        #96  <Field Rect mTmpRect>
	//   19   42:invokevirtual   #371 <Method boolean Canvas.getClipBounds(Rect)>
	//   20   45:pop             
			if(isLayoutRtlSupport())
	//*  21   46:aload_0         
	//*  22   47:invokevirtual   #222 <Method boolean isLayoutRtlSupport()>
	//*  23   50:ifeq            82
			{
				Rect rect = mTmpRect;
	//   24   53:aload_0         
	//   25   54:getfield        #96  <Field Rect mTmpRect>
	//   26   57:astore          7
				rect.left = Math.max(rect.left, mSlideableView.getRight());
	//   27   59:aload           7
	//   28   61:aload           7
	//   29   63:getfield        #374 <Field int Rect.left>
	//   30   66:aload_0         
	//   31   67:getfield        #224 <Field View mSlideableView>
	//   32   70:invokevirtual   #287 <Method int View.getRight()>
	//   33   73:invokestatic    #380 <Method int Math.max(int, int)>
	//   34   76:putfield        #374 <Field int Rect.left>
			} else
	//*  35   79:goto            108
			{
				Rect rect1 = mTmpRect;
	//   36   82:aload_0         
	//   37   83:getfield        #96  <Field Rect mTmpRect>
	//   38   86:astore          7
				rect1.right = Math.min(rect1.right, mSlideableView.getLeft());
	//   39   88:aload           7
	//   40   90:aload           7
	//   41   92:getfield        #383 <Field int Rect.right>
	//   42   95:aload_0         
	//   43   96:getfield        #224 <Field View mSlideableView>
	//   44   99:invokevirtual   #284 <Method int View.getLeft()>
	//   45  102:invokestatic    #386 <Method int Math.min(int, int)>
	//   46  105:putfield        #383 <Field int Rect.right>
			}
			canvas.clipRect(mTmpRect);
	//   47  108:aload_1         
	//   48  109:aload_0         
	//   49  110:getfield        #96  <Field Rect mTmpRect>
	//   50  113:invokevirtual   #389 <Method boolean Canvas.clipRect(Rect)>
	//   51  116:pop             
		}
		boolean flag = super.drawChild(canvas, view, l);
	//   52  117:aload_0         
	//   53  118:aload_1         
	//   54  119:aload_2         
	//   55  120:lload_3         
	//   56  121:invokespecial   #391 <Method boolean ViewGroup.drawChild(Canvas, View, long)>
	//   57  124:istore          6
		canvas.restoreToCount(i);
	//   58  126:aload_1         
	//   59  127:iload           5
	//   60  129:invokevirtual   #394 <Method void Canvas.restoreToCount(int)>
		return flag;
	//   61  132:iload           6
	//   62  134:ireturn         
	}

	protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams()));
	//    0    0:new             #15  <Class SlidingPaneLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:invokespecial   #396 <Method void SlidingPaneLayout$LayoutParams()>
	//    3    7:areturn         
	}

	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(getContext(), attributeset)));
	//    0    0:new             #15  <Class SlidingPaneLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #402 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #403 <Method void SlidingPaneLayout$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #406 <Class android.view.ViewGroup$MarginLayoutParams>
	//*   2    4:ifeq            19
			return ((android.view.ViewGroup.LayoutParams) (new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams)));
	//    3    7:new             #15  <Class SlidingPaneLayout$LayoutParams>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:checkcast       #406 <Class android.view.ViewGroup$MarginLayoutParams>
	//    7   15:invokespecial   #409 <Method void SlidingPaneLayout$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
	//    8   18:areturn         
		else
			return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(layoutparams)));
	//    9   19:new             #15  <Class SlidingPaneLayout$LayoutParams>
	//   10   22:dup             
	//   11   23:aload_1         
	//   12   24:invokespecial   #412 <Method void SlidingPaneLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//   13   27:areturn         
	}

	public int getCoveredFadeColor()
	{
		return mCoveredFadeColor;
	//    0    0:aload_0         
	//    1    1:getfield        #250 <Field int mCoveredFadeColor>
	//    2    4:ireturn         
	}

	public int getParallaxDistance()
	{
		return mParallaxBy;
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field int mParallaxBy>
	//    2    4:ireturn         
	}

	public int getSliderFadeColor()
	{
		return mSliderFadeColor;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int mSliderFadeColor>
	//    2    4:ireturn         
	}

	void invalidateChildRegion(View view)
	{
label0:
		{
			if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #262 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          23
			{
				ViewCompat.setLayerPaint(view, ((LayoutParams)view.getLayoutParams()).dimPaint);
	//    3    8:aload_1         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #169 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    6   13:checkcast       #15  <Class SlidingPaneLayout$LayoutParams>
	//    7   16:getfield        #174 <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
	//    8   19:invokestatic    #428 <Method void ViewCompat.setLayerPaint(View, Paint)>
				return;
	//    9   22:return          
			}
			if(android.os.Build.VERSION.SDK_INT < 16)
				break label0;
	//   10   23:getstatic       #262 <Field int android.os.Build$VERSION.SDK_INT>
	//   11   26:bipush          16
	//   12   28:icmplt          167
			if(!mDisplayListReflectionLoaded)
	//*  13   31:aload_0         
	//*  14   32:getfield        #430 <Field boolean mDisplayListReflectionLoaded>
	//*  15   35:ifne            107
			{
				try
				{
					mGetDisplayList = ((Class) (android/view/View)).getDeclaredMethod("getDisplayList", (Class[])null);
	//   16   38:aload_0         
	//   17   39:ldc1            #165 <Class View>
	//   18   41:ldc2            #432 <String "getDisplayList">
	//   19   44:aconst_null     
	//   20   45:checkcast       #434 <Class Class[]>
	//   21   48:invokevirtual   #440 <Method Method Class.getDeclaredMethod(String, Class[])>
	//   22   51:putfield        #442 <Field Method mGetDisplayList>
				}
	//*  23   54:goto            68
				catch(NoSuchMethodException nosuchmethodexception)
	//*  24   57:astore_2        
				{
					Log.e("SlidingPaneLayout", "Couldn't fetch getDisplayList method; dimming won't work right.", ((Throwable) (nosuchmethodexception)));
	//   25   58:ldc1            #38  <String "SlidingPaneLayout">
	//   26   60:ldc2            #444 <String "Couldn't fetch getDisplayList method; dimming won't work right.">
	//   27   63:aload_2         
	//   28   64:invokestatic    #450 <Method int Log.e(String, String, Throwable)>
	//   29   67:pop             
				}
				try
				{
					mRecreateDisplayList = ((Class) (android/view/View)).getDeclaredField("mRecreateDisplayList");
	//   30   68:aload_0         
	//   31   69:ldc1            #165 <Class View>
	//   32   71:ldc2            #451 <String "mRecreateDisplayList">
	//   33   74:invokevirtual   #455 <Method Field Class.getDeclaredField(String)>
	//   34   77:putfield        #457 <Field Field mRecreateDisplayList>
					mRecreateDisplayList.setAccessible(true);
	//   35   80:aload_0         
	//   36   81:getfield        #457 <Field Field mRecreateDisplayList>
	//   37   84:iconst_1        
	//   38   85:invokevirtual   #462 <Method void Field.setAccessible(boolean)>
				}
	//*  39   88:goto            102
				catch(NoSuchFieldException nosuchfieldexception)
	//*  40   91:astore_2        
				{
					Log.e("SlidingPaneLayout", "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", ((Throwable) (nosuchfieldexception)));
	//   41   92:ldc1            #38  <String "SlidingPaneLayout">
	//   42   94:ldc2            #464 <String "Couldn't fetch mRecreateDisplayList field; dimming will be slow.">
	//   43   97:aload_2         
	//   44   98:invokestatic    #450 <Method int Log.e(String, String, Throwable)>
	//   45  101:pop             
				}
				mDisplayListReflectionLoaded = true;
	//   46  102:aload_0         
	//   47  103:iconst_1        
	//   48  104:putfield        #430 <Field boolean mDisplayListReflectionLoaded>
			}
			if(mGetDisplayList != null)
	//*  49  107:aload_0         
	//*  50  108:getfield        #442 <Field Method mGetDisplayList>
	//*  51  111:ifnull          162
			{
				Field field = mRecreateDisplayList;
	//   52  114:aload_0         
	//   53  115:getfield        #457 <Field Field mRecreateDisplayList>
	//   54  118:astore_2        
				if(field != null)
	//*  55  119:aload_2         
	//*  56  120:ifnonnull       126
	//*  57  123:goto            162
				{
					try
					{
						field.setBoolean(((Object) (view)), true);
	//   58  126:aload_2         
	//   59  127:aload_1         
	//   60  128:iconst_1        
	//   61  129:invokevirtual   #468 <Method void Field.setBoolean(Object, boolean)>
						mGetDisplayList.invoke(((Object) (view)), (Object[])null);
	//   62  132:aload_0         
	//   63  133:getfield        #442 <Field Method mGetDisplayList>
	//   64  136:aload_1         
	//   65  137:aconst_null     
	//   66  138:checkcast       #470 <Class Object[]>
	//   67  141:invokevirtual   #476 <Method Object Method.invoke(Object, Object[])>
	//   68  144:pop             
					}
	//*  69  145:goto            167
					catch(Exception exception)
	//*  70  148:astore_2        
					{
						Log.e("SlidingPaneLayout", "Error refreshing display list state", ((Throwable) (exception)));
	//   71  149:ldc1            #38  <String "SlidingPaneLayout">
	//   72  151:ldc2            #478 <String "Error refreshing display list state">
	//   73  154:aload_2         
	//   74  155:invokestatic    #450 <Method int Log.e(String, String, Throwable)>
	//   75  158:pop             
					}
					break label0;
	//   76  159:goto            167
				}
			}
			view.invalidate();
	//   77  162:aload_1         
	//   78  163:invokevirtual   #481 <Method void View.invalidate()>
			return;
	//   79  166:return          
		}
		ViewCompat.postInvalidateOnAnimation(((View) (this)), view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
	//   80  167:aload_0         
	//   81  168:aload_1         
	//   82  169:invokevirtual   #284 <Method int View.getLeft()>
	//   83  172:aload_1         
	//   84  173:invokevirtual   #290 <Method int View.getTop()>
	//   85  176:aload_1         
	//   86  177:invokevirtual   #287 <Method int View.getRight()>
	//   87  180:aload_1         
	//   88  181:invokevirtual   #293 <Method int View.getBottom()>
	//   89  184:invokestatic    #484 <Method void ViewCompat.postInvalidateOnAnimation(View, int, int, int, int)>
	//   90  187:return          
	}

	boolean isDimmed(View view)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(view == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       8
			return false;
	//    4    6:iconst_0        
	//    5    7:ireturn         
		view = ((View) ((LayoutParams)view.getLayoutParams()));
	//    6    8:aload_1         
	//    7    9:invokevirtual   #169 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    8   12:checkcast       #15  <Class SlidingPaneLayout$LayoutParams>
	//    9   15:astore_1        
		boolean flag = flag1;
	//   10   16:iload_3         
	//   11   17:istore_2        
		if(mCanSlide)
	//*  12   18:aload_0         
	//*  13   19:getfield        #303 <Field boolean mCanSlide>
	//*  14   22:ifeq            47
		{
			flag = flag1;
	//   15   25:iload_3         
	//   16   26:istore_2        
			if(((LayoutParams) (view)).dimWhenOffset)
	//*  17   27:aload_1         
	//*  18   28:getfield        #227 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
	//*  19   31:ifeq            47
			{
				flag = flag1;
	//   20   34:iload_3         
	//   21   35:istore_2        
				if(mSlideOffset > 0.0F)
	//*  22   36:aload_0         
	//*  23   37:getfield        #337 <Field float mSlideOffset>
	//*  24   40:fconst_0        
	//*  25   41:fcmpl           
	//*  26   42:ifle            47
					flag = true;
	//   27   45:iconst_1        
	//   28   46:istore_2        
			}
		}
		return flag;
	//   29   47:iload_2         
	//   30   48:ireturn         
	}

	boolean isLayoutRtlSupport()
	{
		return ViewCompat.getLayoutDirection(((View) (this))) == 1;
	//    0    0:aload_0         
	//    1    1:invokestatic    #489 <Method int ViewCompat.getLayoutDirection(View)>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean isOpen()
	{
		return !mCanSlide || mSlideOffset == 1.0F;
	//    0    0:aload_0         
	//    1    1:getfield        #303 <Field boolean mCanSlide>
	//    2    4:ifeq            21
	//    3    7:aload_0         
	//    4    8:getfield        #337 <Field float mSlideOffset>
	//    5   11:fconst_1        
	//    6   12:fcmpl           
	//    7   13:ifne            19
	//    8   16:goto            21
	//    9   19:iconst_0        
	//   10   20:ireturn         
	//   11   21:iconst_1        
	//   12   22:ireturn         
	}

	public boolean isSlideable()
	{
		return mCanSlide;
	//    0    0:aload_0         
	//    1    1:getfield        #303 <Field boolean mCanSlide>
	//    2    4:ireturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #494 <Method void ViewGroup.onAttachedToWindow()>
		mFirstLayout = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #89  <Field boolean mFirstLayout>
	//    5    9:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #497 <Method void ViewGroup.onDetachedFromWindow()>
		mFirstLayout = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #89  <Field boolean mFirstLayout>
		int j = mPostedRunnables.size();
	//    5    9:aload_0         
	//    6   10:getfield        #101 <Field ArrayList mPostedRunnables>
	//    7   13:invokevirtual   #500 <Method int ArrayList.size()>
	//    8   16:istore_2        
		for(int i = 0; i < j; i++)
	//*   9   17:iconst_0        
	//*  10   18:istore_1        
	//*  11   19:iload_1         
	//*  12   20:iload_2         
	//*  13   21:icmpge          45
			((DisableLayerRunnable)mPostedRunnables.get(i)).run();
	//   14   24:aload_0         
	//   15   25:getfield        #101 <Field ArrayList mPostedRunnables>
	//   16   28:iload_1         
	//   17   29:invokevirtual   #504 <Method Object ArrayList.get(int)>
	//   18   32:checkcast       #9   <Class SlidingPaneLayout$DisableLayerRunnable>
	//   19   35:invokevirtual   #507 <Method void SlidingPaneLayout$DisableLayerRunnable.run()>

	//   20   38:iload_1         
	//   21   39:iconst_1        
	//   22   40:iadd            
	//   23   41:istore_1        
	//*  24   42:goto            19
		mPostedRunnables.clear();
	//   25   45:aload_0         
	//   26   46:getfield        #101 <Field ArrayList mPostedRunnables>
	//   27   49:invokevirtual   #510 <Method void ArrayList.clear()>
	//   28   52:return          
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
label0:
		{
label1:
			{
				boolean flag;
				boolean flag1;
label2:
				{
					int i = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #517 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore          4
					boolean flag2 = mCanSlide;
	//    3    6:aload_0         
	//    4    7:getfield        #303 <Field boolean mCanSlide>
	//    5   10:istore          6
					flag1 = true;
	//    6   12:iconst_1        
	//    7   13:istore          5
					if(!flag2 && i == 0 && getChildCount() > 1)
	//*   8   15:iload           6
	//*   9   17:ifne            70
	//*  10   20:iload           4
	//*  11   22:ifne            70
	//*  12   25:aload_0         
	//*  13   26:invokevirtual   #236 <Method int getChildCount()>
	//*  14   29:iconst_1        
	//*  15   30:icmple          70
					{
						View view = getChildAt(1);
	//   16   33:aload_0         
	//   17   34:iconst_1        
	//   18   35:invokevirtual   #240 <Method View getChildAt(int)>
	//   19   38:astore          7
						if(view != null)
	//*  20   40:aload           7
	//*  21   42:ifnull          70
							mPreservedOpenState = mDragHelper.isViewUnder(view, (int)motionevent.getX(), (int)motionevent.getY()) ^ true;
	//   22   45:aload_0         
	//   23   46:aload_0         
	//   24   47:getfield        #148 <Field ViewDragHelper mDragHelper>
	//   25   50:aload           7
	//   26   52:aload_1         
	//   27   53:invokevirtual   #521 <Method float MotionEvent.getX()>
	//   28   56:f2i             
	//   29   57:aload_1         
	//   30   58:invokevirtual   #524 <Method float MotionEvent.getY()>
	//   31   61:f2i             
	//   32   62:invokevirtual   #528 <Method boolean ViewDragHelper.isViewUnder(View, int, int)>
	//   33   65:iconst_1        
	//   34   66:ixor            
	//   35   67:putfield        #161 <Field boolean mPreservedOpenState>
					}
					if(!mCanSlide || mIsUnableToDrag && i != 0)
	//*  36   70:aload_0         
	//*  37   71:getfield        #303 <Field boolean mCanSlide>
	//*  38   74:ifeq            280
	//*  39   77:aload_0         
	//*  40   78:getfield        #530 <Field boolean mIsUnableToDrag>
	//*  41   81:ifeq            92
	//*  42   84:iload           4
	//*  43   86:ifeq            92
						break label0;
	//   44   89:goto            280
					if(i == 3 || i == 1)
	//*  45   92:iload           4
	//*  46   94:iconst_3        
	//*  47   95:icmpeq          271
	//*  48   98:iload           4
	//*  49  100:iconst_1        
	//*  50  101:icmpne          107
						break label1;
	//   51  104:goto            271
					if(i != 0)
	//*  52  107:iload           4
	//*  53  109:ifeq            184
					{
						if(i == 2)
	//*  54  112:iload           4
	//*  55  114:iconst_2        
	//*  56  115:icmpeq          121
	//*  57  118:goto            244
						{
							float f2 = motionevent.getX();
	//   58  121:aload_1         
	//   59  122:invokevirtual   #521 <Method float MotionEvent.getX()>
	//   60  125:fstore_3        
							float f = motionevent.getY();
	//   61  126:aload_1         
	//   62  127:invokevirtual   #524 <Method float MotionEvent.getY()>
	//   63  130:fstore_2        
							f2 = Math.abs(f2 - mInitialMotionX);
	//   64  131:fload_3         
	//   65  132:aload_0         
	//   66  133:getfield        #532 <Field float mInitialMotionX>
	//   67  136:fsub            
	//   68  137:invokestatic    #536 <Method float Math.abs(float)>
	//   69  140:fstore_3        
							f = Math.abs(f - mInitialMotionY);
	//   70  141:fload_2         
	//   71  142:aload_0         
	//   72  143:getfield        #538 <Field float mInitialMotionY>
	//   73  146:fsub            
	//   74  147:invokestatic    #536 <Method float Math.abs(float)>
	//   75  150:fstore_2        
							if(f2 > (float)mDragHelper.getTouchSlop() && f > f2)
	//*  76  151:fload_3         
	//*  77  152:aload_0         
	//*  78  153:getfield        #148 <Field ViewDragHelper mDragHelper>
	//*  79  156:invokevirtual   #541 <Method int ViewDragHelper.getTouchSlop()>
	//*  80  159:i2f             
	//*  81  160:fcmpl           
	//*  82  161:ifle            244
	//*  83  164:fload_2         
	//*  84  165:fload_3         
	//*  85  166:fcmpl           
	//*  86  167:ifle            244
							{
								mDragHelper.cancel();
	//   87  170:aload_0         
	//   88  171:getfield        #148 <Field ViewDragHelper mDragHelper>
	//   89  174:invokevirtual   #544 <Method void ViewDragHelper.cancel()>
								mIsUnableToDrag = true;
	//   90  177:aload_0         
	//   91  178:iconst_1        
	//   92  179:putfield        #530 <Field boolean mIsUnableToDrag>
								return false;
	//   93  182:iconst_0        
	//   94  183:ireturn         
							}
						}
					} else
					{
						mIsUnableToDrag = false;
	//   95  184:aload_0         
	//   96  185:iconst_0        
	//   97  186:putfield        #530 <Field boolean mIsUnableToDrag>
						float f1 = motionevent.getX();
	//   98  189:aload_1         
	//   99  190:invokevirtual   #521 <Method float MotionEvent.getX()>
	//  100  193:fstore_2        
						float f3 = motionevent.getY();
	//  101  194:aload_1         
	//  102  195:invokevirtual   #524 <Method float MotionEvent.getY()>
	//  103  198:fstore_3        
						mInitialMotionX = f1;
	//  104  199:aload_0         
	//  105  200:fload_2         
	//  106  201:putfield        #532 <Field float mInitialMotionX>
						mInitialMotionY = f3;
	//  107  204:aload_0         
	//  108  205:fload_3         
	//  109  206:putfield        #538 <Field float mInitialMotionY>
						if(mDragHelper.isViewUnder(mSlideableView, (int)f1, (int)f3) && isDimmed(mSlideableView))
	//* 110  209:aload_0         
	//* 111  210:getfield        #148 <Field ViewDragHelper mDragHelper>
	//* 112  213:aload_0         
	//* 113  214:getfield        #224 <Field View mSlideableView>
	//* 114  217:fload_2         
	//* 115  218:f2i             
	//* 116  219:fload_3         
	//* 117  220:f2i             
	//* 118  221:invokevirtual   #528 <Method boolean ViewDragHelper.isViewUnder(View, int, int)>
	//* 119  224:ifeq            244
	//* 120  227:aload_0         
	//* 121  228:aload_0         
	//* 122  229:getfield        #224 <Field View mSlideableView>
	//* 123  232:invokevirtual   #546 <Method boolean isDimmed(View)>
	//* 124  235:ifeq            244
						{
							flag = true;
	//  125  238:iconst_1        
	//  126  239:istore          4
							break label2;
	//  127  241:goto            247
						}
					}
					flag = false;
	//  128  244:iconst_0        
	//  129  245:istore          4
				}
				if(!mDragHelper.shouldInterceptTouchEvent(motionevent))
	//* 130  247:aload_0         
	//* 131  248:getfield        #148 <Field ViewDragHelper mDragHelper>
	//* 132  251:aload_1         
	//* 133  252:invokevirtual   #549 <Method boolean ViewDragHelper.shouldInterceptTouchEvent(MotionEvent)>
	//* 134  255:ifne            268
				{
					if(flag)
	//* 135  258:iload           4
	//* 136  260:ifeq            265
						return true;
	//  137  263:iconst_1        
	//  138  264:ireturn         
					flag1 = false;
	//  139  265:iconst_0        
	//  140  266:istore          5
				}
				return flag1;
	//  141  268:iload           5
	//  142  270:ireturn         
			}
			mDragHelper.cancel();
	//  143  271:aload_0         
	//  144  272:getfield        #148 <Field ViewDragHelper mDragHelper>
	//  145  275:invokevirtual   #544 <Method void ViewDragHelper.cancel()>
			return false;
	//  146  278:iconst_0        
	//  147  279:ireturn         
		}
		mDragHelper.cancel();
	//  148  280:aload_0         
	//  149  281:getfield        #148 <Field ViewDragHelper mDragHelper>
	//  150  284:invokevirtual   #544 <Method void ViewDragHelper.cancel()>
		return super.onInterceptTouchEvent(motionevent);
	//  151  287:aload_0         
	//  152  288:aload_1         
	//  153  289:invokespecial   #551 <Method boolean ViewGroup.onInterceptTouchEvent(MotionEvent)>
	//  154  292:ireturn         
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		boolean flag1 = isLayoutRtlSupport();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #222 <Method boolean isLayoutRtlSupport()>
	//    2    4:istore          14
		if(flag1)
	//*   3    6:iload           14
	//*   4    8:ifeq            22
			mDragHelper.setEdgeTrackingEnabled(2);
	//    5   11:aload_0         
	//    6   12:getfield        #148 <Field ViewDragHelper mDragHelper>
	//    7   15:iconst_2        
	//    8   16:invokevirtual   #556 <Method void ViewDragHelper.setEdgeTrackingEnabled(int)>
		else
	//*   9   19:goto            30
			mDragHelper.setEdgeTrackingEnabled(1);
	//   10   22:aload_0         
	//   11   23:getfield        #148 <Field ViewDragHelper mDragHelper>
	//   12   26:iconst_1        
	//   13   27:invokevirtual   #556 <Method void ViewDragHelper.setEdgeTrackingEnabled(int)>
		int l1 = k - i;
	//   14   30:iload           4
	//   15   32:iload_2         
	//   16   33:isub            
	//   17   34:istore          9
		if(flag1)
	//*  18   36:iload           14
	//*  19   38:ifeq            49
			i = getPaddingRight();
	//   20   41:aload_0         
	//   21   42:invokevirtual   #559 <Method int getPaddingRight()>
	//   22   45:istore_2        
		else
	//*  23   46:goto            54
			i = getPaddingLeft();
	//   24   49:aload_0         
	//   25   50:invokevirtual   #562 <Method int getPaddingLeft()>
	//   26   53:istore_2        
		if(flag1)
	//*  27   54:iload           14
	//*  28   56:ifeq            68
			l = getPaddingLeft();
	//   29   59:aload_0         
	//   30   60:invokevirtual   #562 <Method int getPaddingLeft()>
	//   31   63:istore          5
		else
	//*  32   65:goto            74
			l = getPaddingRight();
	//   33   68:aload_0         
	//   34   69:invokevirtual   #559 <Method int getPaddingRight()>
	//   35   72:istore          5
		int j2 = getPaddingTop();
	//   36   74:aload_0         
	//   37   75:invokevirtual   #565 <Method int getPaddingTop()>
	//   38   78:istore          11
		int i2 = getChildCount();
	//   39   80:aload_0         
	//   40   81:invokevirtual   #236 <Method int getChildCount()>
	//   41   84:istore          10
		if(mFirstLayout)
	//*  42   86:aload_0         
	//*  43   87:getfield        #89  <Field boolean mFirstLayout>
	//*  44   90:ifeq            122
		{
			float f;
			if(mCanSlide && mPreservedOpenState)
	//*  45   93:aload_0         
	//*  46   94:getfield        #303 <Field boolean mCanSlide>
	//*  47   97:ifeq            113
	//*  48  100:aload_0         
	//*  49  101:getfield        #161 <Field boolean mPreservedOpenState>
	//*  50  104:ifeq            113
				f = 1.0F;
	//   51  107:fconst_1        
	//   52  108:fstore          6
			else
	//*  53  110:goto            116
				f = 0.0F;
	//   54  113:fconst_0        
	//   55  114:fstore          6
			mSlideOffset = f;
	//   56  116:aload_0         
	//   57  117:fload           6
	//   58  119:putfield        #337 <Field float mSlideOffset>
		}
		j = i;
	//   59  122:iload_2         
	//   60  123:istore_3        
		for(int i1 = 0; i1 < i2; i1++)
	//*  61  124:iconst_0        
	//*  62  125:istore          7
	//*  63  127:iload           7
	//*  64  129:iload           10
	//*  65  131:icmpge          429
		{
			int k2;
			View view;
label0:
			{
				view = getChildAt(i1);
	//   66  134:aload_0         
	//   67  135:iload           7
	//   68  137:invokevirtual   #240 <Method View getChildAt(int)>
	//   69  140:astore          15
				if(view.getVisibility() == 8)
	//*  70  142:aload           15
	//*  71  144:invokevirtual   #568 <Method int View.getVisibility()>
	//*  72  147:bipush          8
	//*  73  149:icmpne          155
					continue;
	//   74  152:goto            420
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   75  155:aload           15
	//   76  157:invokevirtual   #169 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   77  160:checkcast       #15  <Class SlidingPaneLayout$LayoutParams>
	//   78  163:astore          16
				k2 = view.getMeasuredWidth();
	//   79  165:aload           15
	//   80  167:invokevirtual   #571 <Method int View.getMeasuredWidth()>
	//   81  170:istore          12
				if(layoutparams.slideable)
	//*  82  172:aload           16
	//*  83  174:getfield        #367 <Field boolean SlidingPaneLayout$LayoutParams.slideable>
	//*  84  177:ifeq            318
				{
					k = layoutparams.leftMargin;
	//   85  180:aload           16
	//   86  182:getfield        #233 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//   87  185:istore          4
					int l2 = layoutparams.rightMargin;
	//   88  187:aload           16
	//   89  189:getfield        #230 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//   90  192:istore          13
					int j1 = l1 - l;
	//   91  194:iload           9
	//   92  196:iload           5
	//   93  198:isub            
	//   94  199:istore          8
					l2 = Math.min(i, j1 - mOverhangSize) - j - (k + l2);
	//   95  201:iload_2         
	//   96  202:iload           8
	//   97  204:aload_0         
	//   98  205:getfield        #122 <Field int mOverhangSize>
	//   99  208:isub            
	//  100  209:invokestatic    #386 <Method int Math.min(int, int)>
	//  101  212:iload_3         
	//  102  213:isub            
	//  103  214:iload           4
	//  104  216:iload           13
	//  105  218:iadd            
	//  106  219:isub            
	//  107  220:istore          13
					mSlideRange = l2;
	//  108  222:aload_0         
	//  109  223:iload           13
	//  110  225:putfield        #573 <Field int mSlideRange>
					if(flag1)
	//* 111  228:iload           14
	//* 112  230:ifeq            243
						k = layoutparams.rightMargin;
	//  113  233:aload           16
	//  114  235:getfield        #230 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//  115  238:istore          4
					else
	//* 116  240:goto            250
						k = layoutparams.leftMargin;
	//  117  243:aload           16
	//  118  245:getfield        #233 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//  119  248:istore          4
					if(j + k + l2 + k2 / 2 > j1)
	//* 120  250:iload_3         
	//* 121  251:iload           4
	//* 122  253:iadd            
	//* 123  254:iload           13
	//* 124  256:iadd            
	//* 125  257:iload           12
	//* 126  259:iconst_2        
	//* 127  260:idiv            
	//* 128  261:iadd            
	//* 129  262:iload           8
	//* 130  264:icmple          272
						flag = true;
	//  131  267:iconst_1        
	//  132  268:istore_1        
					else
	//* 133  269:goto            274
						flag = false;
	//  134  272:iconst_0        
	//  135  273:istore_1        
					layoutparams.dimWhenOffset = flag;
	//  136  274:aload           16
	//  137  276:iload_1         
	//  138  277:putfield        #227 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
					j1 = (int)((float)l2 * mSlideOffset);
	//  139  280:iload           13
	//  140  282:i2f             
	//  141  283:aload_0         
	//  142  284:getfield        #337 <Field float mSlideOffset>
	//  143  287:fmul            
	//  144  288:f2i             
	//  145  289:istore          8
					j = k + j1 + j;
	//  146  291:iload           4
	//  147  293:iload           8
	//  148  295:iadd            
	//  149  296:iload_3         
	//  150  297:iadd            
	//  151  298:istore_3        
					mSlideOffset = (float)j1 / (float)mSlideRange;
	//  152  299:aload_0         
	//  153  300:iload           8
	//  154  302:i2f             
	//  155  303:aload_0         
	//  156  304:getfield        #573 <Field int mSlideRange>
	//  157  307:i2f             
	//  158  308:fdiv            
	//  159  309:putfield        #337 <Field float mSlideOffset>
					k = 0;
	//  160  312:iconst_0        
	//  161  313:istore          4
					break label0;
	//  162  315:goto            356
				}
				if(mCanSlide)
	//* 163  318:aload_0         
	//* 164  319:getfield        #303 <Field boolean mCanSlide>
	//* 165  322:ifeq            351
				{
					j = mParallaxBy;
	//  166  325:aload_0         
	//  167  326:getfield        #244 <Field int mParallaxBy>
	//  168  329:istore_3        
					if(j != 0)
	//* 169  330:iload_3         
	//* 170  331:ifeq            351
					{
						k = (int)((1.0F - mSlideOffset) * (float)j);
	//  171  334:fconst_1        
	//  172  335:aload_0         
	//  173  336:getfield        #337 <Field float mSlideOffset>
	//  174  339:fsub            
	//  175  340:iload_3         
	//  176  341:i2f             
	//  177  342:fmul            
	//  178  343:f2i             
	//  179  344:istore          4
						j = i;
	//  180  346:iload_2         
	//  181  347:istore_3        
						break label0;
	//  182  348:goto            356
					}
				}
				j = i;
	//  183  351:iload_2         
	//  184  352:istore_3        
				k = 0;
	//  185  353:iconst_0        
	//  186  354:istore          4
			}
			int k1;
			if(flag1)
	//* 187  356:iload           14
	//* 188  358:ifeq            380
			{
				k1 = (l1 - j) + k;
	//  189  361:iload           9
	//  190  363:iload_3         
	//  191  364:isub            
	//  192  365:iload           4
	//  193  367:iadd            
	//  194  368:istore          8
				k = k1 - k2;
	//  195  370:iload           8
	//  196  372:iload           12
	//  197  374:isub            
	//  198  375:istore          4
			} else
	//* 199  377:goto            393
			{
				k = j - k;
	//  200  380:iload_3         
	//  201  381:iload           4
	//  202  383:isub            
	//  203  384:istore          4
				k1 = k + k2;
	//  204  386:iload           4
	//  205  388:iload           12
	//  206  390:iadd            
	//  207  391:istore          8
			}
			view.layout(k, j2, k1, view.getMeasuredHeight() + j2);
	//  208  393:aload           15
	//  209  395:iload           4
	//  210  397:iload           11
	//  211  399:iload           8
	//  212  401:aload           15
	//  213  403:invokevirtual   #576 <Method int View.getMeasuredHeight()>
	//  214  406:iload           11
	//  215  408:iadd            
	//  216  409:invokevirtual   #579 <Method void View.layout(int, int, int, int)>
			i += view.getWidth();
	//  217  412:iload_2         
	//  218  413:aload           15
	//  219  415:invokevirtual   #582 <Method int View.getWidth()>
	//  220  418:iadd            
	//  221  419:istore_2        
		}

	//  222  420:iload           7
	//  223  422:iconst_1        
	//  224  423:iadd            
	//  225  424:istore          7
	//* 226  426:goto            127
		if(mFirstLayout)
	//* 227  429:aload_0         
	//* 228  430:getfield        #89  <Field boolean mFirstLayout>
	//* 229  433:ifeq            533
		{
			if(mCanSlide)
	//* 230  436:aload_0         
	//* 231  437:getfield        #303 <Field boolean mCanSlide>
	//* 232  440:ifeq            493
			{
				if(mParallaxBy != 0)
	//* 233  443:aload_0         
	//* 234  444:getfield        #244 <Field int mParallaxBy>
	//* 235  447:ifeq            458
					parallaxOtherViews(mSlideOffset);
	//  236  450:aload_0         
	//  237  451:aload_0         
	//  238  452:getfield        #337 <Field float mSlideOffset>
	//  239  455:invokespecial   #584 <Method void parallaxOtherViews(float)>
				if(((LayoutParams)mSlideableView.getLayoutParams()).dimWhenOffset)
	//* 240  458:aload_0         
	//* 241  459:getfield        #224 <Field View mSlideableView>
	//* 242  462:invokevirtual   #169 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 243  465:checkcast       #15  <Class SlidingPaneLayout$LayoutParams>
	//* 244  468:getfield        #227 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
	//* 245  471:ifeq            522
					dimChildView(mSlideableView, mSlideOffset, mSliderFadeColor);
	//  246  474:aload_0         
	//  247  475:aload_0         
	//  248  476:getfield        #224 <Field View mSlideableView>
	//  249  479:aload_0         
	//  250  480:getfield        #337 <Field float mSlideOffset>
	//  251  483:aload_0         
	//  252  484:getfield        #87  <Field int mSliderFadeColor>
	//  253  487:invokespecial   #252 <Method void dimChildView(View, float, int)>
			} else
	//* 254  490:goto            522
			{
				for(i = 0; i < i2; i++)
	//* 255  493:iconst_0        
	//* 256  494:istore_2        
	//* 257  495:iload_2         
	//* 258  496:iload           10
	//* 259  498:icmpge          522
					dimChildView(getChildAt(i), 0.0F, mSliderFadeColor);
	//  260  501:aload_0         
	//  261  502:aload_0         
	//  262  503:iload_2         
	//  263  504:invokevirtual   #240 <Method View getChildAt(int)>
	//  264  507:fconst_0        
	//  265  508:aload_0         
	//  266  509:getfield        #87  <Field int mSliderFadeColor>
	//  267  512:invokespecial   #252 <Method void dimChildView(View, float, int)>

	//  268  515:iload_2         
	//  269  516:iconst_1        
	//  270  517:iadd            
	//  271  518:istore_2        
			}
	//* 272  519:goto            495
			updateObscuredViewsVisibility(mSlideableView);
	//  273  522:aload_0         
	//  274  523:aload_0         
	//  275  524:getfield        #224 <Field View mSlideableView>
	//  276  527:invokevirtual   #587 <Method void updateObscuredViewsVisibility(View)>
		}
	//* 277  530:goto            533
		mFirstLayout = false;
	//  278  533:aload_0         
	//  279  534:iconst_0        
	//  280  535:putfield        #89  <Field boolean mFirstLayout>
	//  281  538:return          
	}

	protected void onMeasure(int i, int j)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #591 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #593 <String "d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #598 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	void onPanelDragged(int i)
	{
		if(mSlideableView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #224 <Field View mSlideableView>
	//*   2    4:ifnonnull       13
		{
			mSlideOffset = 0.0F;
	//    3    7:aload_0         
	//    4    8:fconst_0        
	//    5    9:putfield        #337 <Field float mSlideOffset>
			return;
	//    6   12:return          
		}
		boolean flag = isLayoutRtlSupport();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #222 <Method boolean isLayoutRtlSupport()>
	//    9   17:istore          4
		LayoutParams layoutparams = (LayoutParams)mSlideableView.getLayoutParams();
	//   10   19:aload_0         
	//   11   20:getfield        #224 <Field View mSlideableView>
	//   12   23:invokevirtual   #169 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   13   26:checkcast       #15  <Class SlidingPaneLayout$LayoutParams>
	//   14   29:astore          5
		int k = mSlideableView.getWidth();
	//   15   31:aload_0         
	//   16   32:getfield        #224 <Field View mSlideableView>
	//   17   35:invokevirtual   #582 <Method int View.getWidth()>
	//   18   38:istore_3        
		int j = i;
	//   19   39:iload_1         
	//   20   40:istore_2        
		if(flag)
	//*  21   41:iload           4
	//*  22   43:ifeq            55
			j = getWidth() - i - k;
	//   23   46:aload_0         
	//   24   47:invokevirtual   #600 <Method int getWidth()>
	//   25   50:iload_1         
	//   26   51:isub            
	//   27   52:iload_3         
	//   28   53:isub            
	//   29   54:istore_2        
		if(flag)
	//*  30   55:iload           4
	//*  31   57:ifeq            68
			i = getPaddingRight();
	//   32   60:aload_0         
	//   33   61:invokevirtual   #559 <Method int getPaddingRight()>
	//   34   64:istore_1        
		else
	//*  35   65:goto            73
			i = getPaddingLeft();
	//   36   68:aload_0         
	//   37   69:invokevirtual   #562 <Method int getPaddingLeft()>
	//   38   72:istore_1        
		if(flag)
	//*  39   73:iload           4
	//*  40   75:ifeq            87
			k = layoutparams.rightMargin;
	//   41   78:aload           5
	//   42   80:getfield        #230 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//   43   83:istore_3        
		else
	//*  44   84:goto            93
			k = layoutparams.leftMargin;
	//   45   87:aload           5
	//   46   89:getfield        #233 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//   47   92:istore_3        
		mSlideOffset = (float)(j - (i + k)) / (float)mSlideRange;
	//   48   93:aload_0         
	//   49   94:iload_2         
	//   50   95:iload_1         
	//   51   96:iload_3         
	//   52   97:iadd            
	//   53   98:isub            
	//   54   99:i2f             
	//   55  100:aload_0         
	//   56  101:getfield        #573 <Field int mSlideRange>
	//   57  104:i2f             
	//   58  105:fdiv            
	//   59  106:putfield        #337 <Field float mSlideOffset>
		if(mParallaxBy != 0)
	//*  60  109:aload_0         
	//*  61  110:getfield        #244 <Field int mParallaxBy>
	//*  62  113:ifeq            124
			parallaxOtherViews(mSlideOffset);
	//   63  116:aload_0         
	//   64  117:aload_0         
	//   65  118:getfield        #337 <Field float mSlideOffset>
	//   66  121:invokespecial   #584 <Method void parallaxOtherViews(float)>
		if(layoutparams.dimWhenOffset)
	//*  67  124:aload           5
	//*  68  126:getfield        #227 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
	//*  69  129:ifeq            148
			dimChildView(mSlideableView, mSlideOffset, mSliderFadeColor);
	//   70  132:aload_0         
	//   71  133:aload_0         
	//   72  134:getfield        #224 <Field View mSlideableView>
	//   73  137:aload_0         
	//   74  138:getfield        #337 <Field float mSlideOffset>
	//   75  141:aload_0         
	//   76  142:getfield        #87  <Field int mSliderFadeColor>
	//   77  145:invokespecial   #252 <Method void dimChildView(View, float, int)>
		dispatchOnPanelSlide(mSlideableView);
	//   78  148:aload_0         
	//   79  149:aload_0         
	//   80  150:getfield        #224 <Field View mSlideableView>
	//   81  153:invokevirtual   #602 <Method void dispatchOnPanelSlide(View)>
	//   82  156:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #21  <Class SlidingPaneLayout$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #606 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		}
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #21  <Class SlidingPaneLayout$SavedState>
	//    9   17:astore_1        
		super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #610 <Method Parcelable SlidingPaneLayout$SavedState.getSuperState()>
	//   13   23:invokespecial   #606 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
		if(((SavedState) (parcelable)).isOpen)
	//*  14   26:aload_1         
	//*  15   27:getfield        #612 <Field boolean SlidingPaneLayout$SavedState.isOpen>
	//*  16   30:ifeq            41
			openPane();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #614 <Method boolean openPane()>
	//   19   37:pop             
		else
	//*  20   38:goto            46
			closePane();
	//   21   41:aload_0         
	//   22   42:invokevirtual   #616 <Method boolean closePane()>
	//   23   45:pop             
		mPreservedOpenState = ((SavedState) (parcelable)).isOpen;
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:getfield        #612 <Field boolean SlidingPaneLayout$SavedState.isOpen>
	//   27   51:putfield        #161 <Field boolean mPreservedOpenState>
	//   28   54:return          
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #21  <Class SlidingPaneLayout$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #619 <Method Parcelable ViewGroup.onSaveInstanceState()>
	//    4    8:invokespecial   #621 <Method void SlidingPaneLayout$SavedState(Parcelable)>
	//    5   11:astore_2        
		boolean flag;
		if(isSlideable())
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #623 <Method boolean isSlideable()>
	//*   8   16:ifeq            27
			flag = isOpen();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #625 <Method boolean isOpen()>
	//   11   23:istore_1        
		else
	//*  12   24:goto            32
			flag = mPreservedOpenState;
	//   13   27:aload_0         
	//   14   28:getfield        #161 <Field boolean mPreservedOpenState>
	//   15   31:istore_1        
		savedstate.isOpen = flag;
	//   16   32:aload_2         
	//   17   33:iload_1         
	//   18   34:putfield        #612 <Field boolean SlidingPaneLayout$SavedState.isOpen>
		return ((Parcelable) (savedstate));
	//   19   37:aload_2         
	//   20   38:areturn         
	}

	protected void onSizeChanged(int i, int j, int k, int l)
	{
		super.onSizeChanged(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #628 <Method void ViewGroup.onSizeChanged(int, int, int, int)>
		if(i != k)
	//*   6    9:iload_1         
	//*   7   10:iload_3         
	//*   8   11:icmpeq          19
			mFirstLayout = true;
	//    9   14:aload_0         
	//   10   15:iconst_1        
	//   11   16:putfield        #89  <Field boolean mFirstLayout>
	//   12   19:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(!mCanSlide)
	//*   0    0:aload_0         
	//*   1    1:getfield        #303 <Field boolean mCanSlide>
	//*   2    4:ifne            13
			return super.onTouchEvent(motionevent);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #631 <Method boolean ViewGroup.onTouchEvent(MotionEvent)>
	//    6   12:ireturn         
		mDragHelper.processTouchEvent(motionevent);
	//    7   13:aload_0         
	//    8   14:getfield        #148 <Field ViewDragHelper mDragHelper>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #635 <Method void ViewDragHelper.processTouchEvent(MotionEvent)>
		switch(motionevent.getActionMasked())
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #517 <Method int MotionEvent.getActionMasked()>
		{
	//*  13   25:tableswitch     0 1: default 48
	//	               0 147
	//	               1 50
		default:
			return true;
	//   14   48:iconst_1        
	//   15   49:ireturn         

		case 1: // '\001'
			if(isDimmed(mSlideableView))
	//*  16   50:aload_0         
	//*  17   51:aload_0         
	//*  18   52:getfield        #224 <Field View mSlideableView>
	//*  19   55:invokevirtual   #546 <Method boolean isDimmed(View)>
	//*  20   58:ifeq            167
			{
				float f = motionevent.getX();
	//   21   61:aload_1         
	//   22   62:invokevirtual   #521 <Method float MotionEvent.getX()>
	//   23   65:fstore_2        
				float f2 = motionevent.getY();
	//   24   66:aload_1         
	//   25   67:invokevirtual   #524 <Method float MotionEvent.getY()>
	//   26   70:fstore_3        
				float f4 = f - mInitialMotionX;
	//   27   71:fload_2         
	//   28   72:aload_0         
	//   29   73:getfield        #532 <Field float mInitialMotionX>
	//   30   76:fsub            
	//   31   77:fstore          4
				float f5 = f2 - mInitialMotionY;
	//   32   79:fload_3         
	//   33   80:aload_0         
	//   34   81:getfield        #538 <Field float mInitialMotionY>
	//   35   84:fsub            
	//   36   85:fstore          5
				int i = mDragHelper.getTouchSlop();
	//   37   87:aload_0         
	//   38   88:getfield        #148 <Field ViewDragHelper mDragHelper>
	//   39   91:invokevirtual   #541 <Method int ViewDragHelper.getTouchSlop()>
	//   40   94:istore          6
				if(f4 * f4 + f5 * f5 < (float)(i * i) && mDragHelper.isViewUnder(mSlideableView, (int)f, (int)f2))
	//*  41   96:fload           4
	//*  42   98:fload           4
	//*  43  100:fmul            
	//*  44  101:fload           5
	//*  45  103:fload           5
	//*  46  105:fmul            
	//*  47  106:fadd            
	//*  48  107:iload           6
	//*  49  109:iload           6
	//*  50  111:imul            
	//*  51  112:i2f             
	//*  52  113:fcmpg           
	//*  53  114:ifge            167
	//*  54  117:aload_0         
	//*  55  118:getfield        #148 <Field ViewDragHelper mDragHelper>
	//*  56  121:aload_0         
	//*  57  122:getfield        #224 <Field View mSlideableView>
	//*  58  125:fload_2         
	//*  59  126:f2i             
	//*  60  127:fload_3         
	//*  61  128:f2i             
	//*  62  129:invokevirtual   #528 <Method boolean ViewDragHelper.isViewUnder(View, int, int)>
	//*  63  132:ifeq            167
				{
					closePane(mSlideableView, 0);
	//   64  135:aload_0         
	//   65  136:aload_0         
	//   66  137:getfield        #224 <Field View mSlideableView>
	//   67  140:iconst_0        
	//   68  141:invokespecial   #310 <Method boolean closePane(View, int)>
	//   69  144:pop             
					return true;
	//   70  145:iconst_1        
	//   71  146:ireturn         
				}
			}
			break;

		case 0: // '\0'
			float f1 = motionevent.getX();
	//   72  147:aload_1         
	//   73  148:invokevirtual   #521 <Method float MotionEvent.getX()>
	//   74  151:fstore_2        
			float f3 = motionevent.getY();
	//   75  152:aload_1         
	//   76  153:invokevirtual   #524 <Method float MotionEvent.getY()>
	//   77  156:fstore_3        
			mInitialMotionX = f1;
	//   78  157:aload_0         
	//   79  158:fload_2         
	//   80  159:putfield        #532 <Field float mInitialMotionX>
			mInitialMotionY = f3;
	//   81  162:aload_0         
	//   82  163:fload_3         
	//   83  164:putfield        #538 <Field float mInitialMotionY>
			break;
		}
		return true;
	//   84  167:iconst_1        
	//   85  168:ireturn         
	}

	public boolean openPane()
	{
		return openPane(mSlideableView, 0);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #224 <Field View mSlideableView>
	//    3    5:iconst_0        
	//    4    6:invokespecial   #637 <Method boolean openPane(View, int)>
	//    5    9:ireturn         
	}

	public void requestChildFocus(View view, View view1)
	{
		super.requestChildFocus(view, view1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #641 <Method void ViewGroup.requestChildFocus(View, View)>
		if(!isInTouchMode() && !mCanSlide)
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #644 <Method boolean isInTouchMode()>
	//*   6   10:ifne            40
	//*   7   13:aload_0         
	//*   8   14:getfield        #303 <Field boolean mCanSlide>
	//*   9   17:ifne            40
		{
			boolean flag;
			if(view == mSlideableView)
	//*  10   20:aload_1         
	//*  11   21:aload_0         
	//*  12   22:getfield        #224 <Field View mSlideableView>
	//*  13   25:if_acmpne       33
				flag = true;
	//   14   28:iconst_1        
	//   15   29:istore_3        
			else
	//*  16   30:goto            35
				flag = false;
	//   17   33:iconst_0        
	//   18   34:istore_3        
			mPreservedOpenState = flag;
	//   19   35:aload_0         
	//   20   36:iload_3         
	//   21   37:putfield        #161 <Field boolean mPreservedOpenState>
		}
	//   22   40:return          
	}

	void setAllChildrenVisible()
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #236 <Method int getChildCount()>
	//    2    4:istore_2        
		for(int i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iload_2         
	//*   7    9:icmpge          38
		{
			View view = getChildAt(i);
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:invokevirtual   #240 <Method View getChildAt(int)>
	//   11   17:astore_3        
			if(view.getVisibility() == 4)
	//*  12   18:aload_3         
	//*  13   19:invokevirtual   #568 <Method int View.getVisibility()>
	//*  14   22:iconst_4        
	//*  15   23:icmpne          31
				view.setVisibility(0);
	//   16   26:aload_3         
	//   17   27:iconst_0        
	//   18   28:invokevirtual   #648 <Method void View.setVisibility(int)>
		}

	//   19   31:iload_1         
	//   20   32:iconst_1        
	//   21   33:iadd            
	//   22   34:istore_1        
	//*  23   35:goto            7
	//   24   38:return          
	}

	public void setCoveredFadeColor(int i)
	{
		mCoveredFadeColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #250 <Field int mCoveredFadeColor>
	//    3    5:return          
	}

	public void setPanelSlideListener(PanelSlideListener panelslidelistener)
	{
		mPanelSlideListener = panelslidelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #324 <Field SlidingPaneLayout$PanelSlideListener mPanelSlideListener>
	//    3    5:return          
	}

	public void setParallaxDistance(int i)
	{
		mParallaxBy = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #244 <Field int mParallaxBy>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #655 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setShadowDrawable(Drawable drawable)
	{
		setShadowDrawableLeft(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #660 <Method void setShadowDrawableLeft(Drawable)>
	//    3    5:return          
	}

	public void setShadowDrawableLeft(Drawable drawable)
	{
		mShadowDrawableLeft = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #349 <Field Drawable mShadowDrawableLeft>
	//    3    5:return          
	}

	public void setShadowDrawableRight(Drawable drawable)
	{
		mShadowDrawableRight = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #347 <Field Drawable mShadowDrawableRight>
	//    3    5:return          
	}

	public void setShadowResource(int i)
	{
		setShadowDrawable(getResources().getDrawable(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #664 <Method Resources getResources()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #668 <Method Drawable Resources.getDrawable(int)>
	//    5    9:invokevirtual   #670 <Method void setShadowDrawable(Drawable)>
	//    6   12:return          
	}

	public void setShadowResourceLeft(int i)
	{
		setShadowDrawableLeft(ContextCompat.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #402 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #676 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    5    9:invokevirtual   #660 <Method void setShadowDrawableLeft(Drawable)>
	//    6   12:return          
	}

	public void setShadowResourceRight(int i)
	{
		setShadowDrawableRight(ContextCompat.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #402 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #676 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    5    9:invokevirtual   #679 <Method void setShadowDrawableRight(Drawable)>
	//    6   12:return          
	}

	public void setSliderFadeColor(int i)
	{
		mSliderFadeColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #87  <Field int mSliderFadeColor>
	//    3    5:return          
	}

	public void smoothSlideClosed()
	{
		closePane();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #616 <Method boolean closePane()>
	//    2    4:pop             
	//    3    5:return          
	}

	public void smoothSlideOpen()
	{
		openPane();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #614 <Method boolean openPane()>
	//    2    4:pop             
	//    3    5:return          
	}

	boolean smoothSlideTo(float f, int i)
	{
		if(!mCanSlide)
	//*   0    0:aload_0         
	//*   1    1:getfield        #303 <Field boolean mCanSlide>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		boolean flag = isLayoutRtlSupport();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #222 <Method boolean isLayoutRtlSupport()>
	//    7   13:istore          5
		Object obj = ((Object) ((LayoutParams)mSlideableView.getLayoutParams()));
	//    8   15:aload_0         
	//    9   16:getfield        #224 <Field View mSlideableView>
	//   10   19:invokevirtual   #169 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   11   22:checkcast       #15  <Class SlidingPaneLayout$LayoutParams>
	//   12   25:astore          6
		if(flag)
	//*  13   27:iload           5
	//*  14   29:ifeq            79
		{
			i = getPaddingRight();
	//   15   32:aload_0         
	//   16   33:invokevirtual   #559 <Method int getPaddingRight()>
	//   17   36:istore_2        
			int j = ((LayoutParams) (obj)).rightMargin;
	//   18   37:aload           6
	//   19   39:getfield        #230 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//   20   42:istore_3        
			int k = mSlideableView.getWidth();
	//   21   43:aload_0         
	//   22   44:getfield        #224 <Field View mSlideableView>
	//   23   47:invokevirtual   #582 <Method int View.getWidth()>
	//   24   50:istore          4
			i = (int)((float)getWidth() - ((float)(i + j) + f * (float)mSlideRange + (float)k));
	//   25   52:aload_0         
	//   26   53:invokevirtual   #600 <Method int getWidth()>
	//   27   56:i2f             
	//   28   57:iload_2         
	//   29   58:iload_3         
	//   30   59:iadd            
	//   31   60:i2f             
	//   32   61:fload_1         
	//   33   62:aload_0         
	//   34   63:getfield        #573 <Field int mSlideRange>
	//   35   66:i2f             
	//   36   67:fmul            
	//   37   68:fadd            
	//   38   69:iload           4
	//   39   71:i2f             
	//   40   72:fadd            
	//   41   73:fsub            
	//   42   74:f2i             
	//   43   75:istore_2        
		} else
	//*  44   76:goto            100
		{
			i = (int)((float)(getPaddingLeft() + ((LayoutParams) (obj)).leftMargin) + f * (float)mSlideRange);
	//   45   79:aload_0         
	//   46   80:invokevirtual   #562 <Method int getPaddingLeft()>
	//   47   83:aload           6
	//   48   85:getfield        #233 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//   49   88:iadd            
	//   50   89:i2f             
	//   51   90:fload_1         
	//   52   91:aload_0         
	//   53   92:getfield        #573 <Field int mSlideRange>
	//   54   95:i2f             
	//   55   96:fmul            
	//   56   97:fadd            
	//   57   98:f2i             
	//   58   99:istore_2        
		}
		obj = ((Object) (mDragHelper));
	//   59  100:aload_0         
	//   60  101:getfield        #148 <Field ViewDragHelper mDragHelper>
	//   61  104:astore          6
		View view = mSlideableView;
	//   62  106:aload_0         
	//   63  107:getfield        #224 <Field View mSlideableView>
	//   64  110:astore          7
		if(((ViewDragHelper) (obj)).smoothSlideViewTo(view, i, view.getTop()))
	//*  65  112:aload           6
	//*  66  114:aload           7
	//*  67  116:iload_2         
	//*  68  117:aload           7
	//*  69  119:invokevirtual   #290 <Method int View.getTop()>
	//*  70  122:invokevirtual   #685 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//*  71  125:ifeq            138
		{
			setAllChildrenVisible();
	//   72  128:aload_0         
	//   73  129:invokevirtual   #687 <Method void setAllChildrenVisible()>
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   74  132:aload_0         
	//   75  133:invokestatic    #321 <Method void ViewCompat.postInvalidateOnAnimation(View)>
			return true;
	//   76  136:iconst_1        
	//   77  137:ireturn         
		} else
		{
			return false;
	//   78  138:iconst_0        
	//   79  139:ireturn         
		}
	}

	void updateObscuredViewsVisibility(View view)
	{
		boolean flag = isLayoutRtlSupport();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #222 <Method boolean isLayoutRtlSupport()>
	//    2    4:istore          17
		int i;
		if(flag)
	//*   3    6:iload           17
	//*   4    8:ifeq            24
			i = getWidth() - getPaddingRight();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #600 <Method int getWidth()>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #559 <Method int getPaddingRight()>
	//    9   19:isub            
	//   10   20:istore_2        
		else
	//*  11   21:goto            29
			i = getPaddingLeft();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #562 <Method int getPaddingLeft()>
	//   14   28:istore_2        
		int j;
		if(flag)
	//*  15   29:iload           17
	//*  16   31:ifeq            42
			j = getPaddingLeft();
	//   17   34:aload_0         
	//   18   35:invokevirtual   #562 <Method int getPaddingLeft()>
	//   19   38:istore_3        
		else
	//*  20   39:goto            52
			j = getWidth() - getPaddingRight();
	//   21   42:aload_0         
	//   22   43:invokevirtual   #600 <Method int getWidth()>
	//   23   46:aload_0         
	//   24   47:invokevirtual   #559 <Method int getPaddingRight()>
	//   25   50:isub            
	//   26   51:istore_3        
		int i2 = getPaddingTop();
	//   27   52:aload_0         
	//   28   53:invokevirtual   #565 <Method int getPaddingTop()>
	//   29   56:istore          10
		int j2 = getHeight();
	//   30   58:aload_0         
	//   31   59:invokevirtual   #690 <Method int getHeight()>
	//   32   62:istore          11
		int k2 = getPaddingBottom();
	//   33   64:aload_0         
	//   34   65:invokevirtual   #693 <Method int getPaddingBottom()>
	//   35   68:istore          12
		int k;
		int l;
		int i1;
		int j1;
		if(view != null && viewIsOpaque(view))
	//*  36   70:aload_1         
	//*  37   71:ifnull          108
	//*  38   74:aload_1         
	//*  39   75:invokestatic    #695 <Method boolean viewIsOpaque(View)>
	//*  40   78:ifeq            108
		{
			k = view.getLeft();
	//   41   81:aload_1         
	//   42   82:invokevirtual   #284 <Method int View.getLeft()>
	//   43   85:istore          4
			l = view.getRight();
	//   44   87:aload_1         
	//   45   88:invokevirtual   #287 <Method int View.getRight()>
	//   46   91:istore          5
			i1 = view.getTop();
	//   47   93:aload_1         
	//   48   94:invokevirtual   #290 <Method int View.getTop()>
	//   49   97:istore          6
			j1 = view.getBottom();
	//   50   99:aload_1         
	//   51  100:invokevirtual   #293 <Method int View.getBottom()>
	//   52  103:istore          7
		} else
	//*  53  105:goto            120
		{
			k = 0;
	//   54  108:iconst_0        
	//   55  109:istore          4
			l = 0;
	//   56  111:iconst_0        
	//   57  112:istore          5
			i1 = 0;
	//   58  114:iconst_0        
	//   59  115:istore          6
			j1 = 0;
	//   60  117:iconst_0        
	//   61  118:istore          7
		}
		int l2 = getChildCount();
	//   62  120:aload_0         
	//   63  121:invokevirtual   #236 <Method int getChildCount()>
	//   64  124:istore          13
		for(int k1 = 0; k1 < l2; k1++)
	//*  65  126:iconst_0        
	//*  66  127:istore          8
	//*  67  129:iload           8
	//*  68  131:iload           13
	//*  69  133:icmpge          296
		{
			View view1 = getChildAt(k1);
	//   70  136:aload_0         
	//   71  137:iload           8
	//   72  139:invokevirtual   #240 <Method View getChildAt(int)>
	//   73  142:astore          18
			if(view1 == view)
	//*  74  144:aload           18
	//*  75  146:aload_1         
	//*  76  147:if_acmpne       151
				return;
	//   77  150:return          
			if(view1.getVisibility() == 8)
	//*  78  151:aload           18
	//*  79  153:invokevirtual   #568 <Method int View.getVisibility()>
	//*  80  156:bipush          8
	//*  81  158:icmpne          164
				continue;
	//   82  161:goto            287
			int l1;
			if(flag)
	//*  83  164:iload           17
	//*  84  166:ifeq            175
				l1 = j;
	//   85  169:iload_3         
	//   86  170:istore          9
			else
	//*  87  172:goto            178
				l1 = i;
	//   88  175:iload_2         
	//   89  176:istore          9
			int i3 = Math.max(l1, view1.getLeft());
	//   90  178:iload           9
	//   91  180:aload           18
	//   92  182:invokevirtual   #284 <Method int View.getLeft()>
	//   93  185:invokestatic    #380 <Method int Math.max(int, int)>
	//   94  188:istore          14
			int j3 = Math.max(i2, view1.getTop());
	//   95  190:iload           10
	//   96  192:aload           18
	//   97  194:invokevirtual   #290 <Method int View.getTop()>
	//   98  197:invokestatic    #380 <Method int Math.max(int, int)>
	//   99  200:istore          15
			if(flag)
	//* 100  202:iload           17
	//* 101  204:ifeq            213
				l1 = i;
	//  102  207:iload_2         
	//  103  208:istore          9
			else
	//* 104  210:goto            216
				l1 = j;
	//  105  213:iload_3         
	//  106  214:istore          9
			l1 = Math.min(l1, view1.getRight());
	//  107  216:iload           9
	//  108  218:aload           18
	//  109  220:invokevirtual   #287 <Method int View.getRight()>
	//  110  223:invokestatic    #386 <Method int Math.min(int, int)>
	//  111  226:istore          9
			int k3 = Math.min(j2 - k2, view1.getBottom());
	//  112  228:iload           11
	//  113  230:iload           12
	//  114  232:isub            
	//  115  233:aload           18
	//  116  235:invokevirtual   #293 <Method int View.getBottom()>
	//  117  238:invokestatic    #386 <Method int Math.min(int, int)>
	//  118  241:istore          16
			if(i3 >= k && j3 >= i1 && l1 <= l && k3 <= j1)
	//* 119  243:iload           14
	//* 120  245:iload           4
	//* 121  247:icmplt          277
	//* 122  250:iload           15
	//* 123  252:iload           6
	//* 124  254:icmplt          277
	//* 125  257:iload           9
	//* 126  259:iload           5
	//* 127  261:icmpgt          277
	//* 128  264:iload           16
	//* 129  266:iload           7
	//* 130  268:icmpgt          277
				l1 = 4;
	//  131  271:iconst_4        
	//  132  272:istore          9
			else
	//* 133  274:goto            280
				l1 = 0;
	//  134  277:iconst_0        
	//  135  278:istore          9
			view1.setVisibility(l1);
	//  136  280:aload           18
	//  137  282:iload           9
	//  138  284:invokevirtual   #648 <Method void View.setVisibility(int)>
		}

	//  139  287:iload           8
	//  140  289:iconst_1        
	//  141  290:iadd            
	//  142  291:istore          8
	//* 143  293:goto            129
	//  144  296:return          
	}

	private static final int DEFAULT_FADE_COLOR = 0xcccccccc;
	private static final int DEFAULT_OVERHANG_SIZE = 32;
	private static final int MIN_FLING_VELOCITY = 400;
	private static final String TAG = "SlidingPaneLayout";
	private boolean mCanSlide;
	private int mCoveredFadeColor;
	private boolean mDisplayListReflectionLoaded;
	final ViewDragHelper mDragHelper;
	private boolean mFirstLayout;
	private Method mGetDisplayList;
	private float mInitialMotionX;
	private float mInitialMotionY;
	boolean mIsUnableToDrag;
	private final int mOverhangSize;
	private PanelSlideListener mPanelSlideListener;
	private int mParallaxBy;
	private float mParallaxOffset;
	final ArrayList mPostedRunnables;
	boolean mPreservedOpenState;
	private Field mRecreateDisplayList;
	private Drawable mShadowDrawableLeft;
	private Drawable mShadowDrawableRight;
	float mSlideOffset;
	int mSlideRange;
	View mSlideableView;
	private int mSliderFadeColor;
	private final Rect mTmpRect;
}
