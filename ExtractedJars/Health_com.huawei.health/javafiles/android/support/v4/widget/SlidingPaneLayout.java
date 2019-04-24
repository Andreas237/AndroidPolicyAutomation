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
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
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

	class DisableLayerRunnable
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

	class DragHelperCallback extends ViewDragHelper.Callback
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
				return Math.min(Math.max(i, j), j + l);
		//   49  100:iload_2         
		//   50  101:iload_3         
		//   51  102:invokestatic    #59  <Method int Math.max(int, int)>
		//   52  105:iload_3         
		//   53  106:iload           4
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
		//*   4   10:ifne            84
			{
				if(mSlideOffset == 0.0F)
		//*   5   13:aload_0         
		//*   6   14:getfield        #13  <Field SlidingPaneLayout this$0>
		//*   7   17:getfield        #96  <Field float SlidingPaneLayout.mSlideOffset>
		//*   8   20:fconst_0        
		//*   9   21:fcmpl           
		//*  10   22:ifne            62
				{
					updateObscuredViewsVisibility(mSlideableView);
		//   11   25:aload_0         
		//   12   26:getfield        #13  <Field SlidingPaneLayout this$0>
		//   13   29:aload_0         
		//   14   30:getfield        #13  <Field SlidingPaneLayout this$0>
		//   15   33:getfield        #23  <Field View SlidingPaneLayout.mSlideableView>
		//   16   36:invokevirtual   #100 <Method void SlidingPaneLayout.updateObscuredViewsVisibility(View)>
					dispatchOnPanelClosed(mSlideableView);
		//   17   39:aload_0         
		//   18   40:getfield        #13  <Field SlidingPaneLayout this$0>
		//   19   43:aload_0         
		//   20   44:getfield        #13  <Field SlidingPaneLayout this$0>
		//   21   47:getfield        #23  <Field View SlidingPaneLayout.mSlideableView>
		//   22   50:invokevirtual   #103 <Method void SlidingPaneLayout.dispatchOnPanelClosed(View)>
					mPreservedOpenState = false;
		//   23   53:aload_0         
		//   24   54:getfield        #13  <Field SlidingPaneLayout this$0>
		//   25   57:iconst_0        
		//   26   58:putfield        #107 <Field boolean SlidingPaneLayout.mPreservedOpenState>
					return;
		//   27   61:return          
				}
				dispatchOnPanelOpened(mSlideableView);
		//   28   62:aload_0         
		//   29   63:getfield        #13  <Field SlidingPaneLayout this$0>
		//   30   66:aload_0         
		//   31   67:getfield        #13  <Field SlidingPaneLayout this$0>
		//   32   70:getfield        #23  <Field View SlidingPaneLayout.mSlideableView>
		//   33   73:invokevirtual   #110 <Method void SlidingPaneLayout.dispatchOnPanelOpened(View)>
				mPreservedOpenState = true;
		//   34   76:aload_0         
		//   35   77:getfield        #13  <Field SlidingPaneLayout this$0>
		//   36   80:iconst_1        
		//   37   81:putfield        #107 <Field boolean SlidingPaneLayout.mPreservedOpenState>
			}
		//   38   84:return          
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
		//    3    7:astore          6
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
		//   11   26:aload           6
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
		//   52  106:goto            169
				}
				int l = getPaddingLeft() + layoutparams.leftMargin;
		//   53  109:aload_0         
		//   54  110:getfield        #13  <Field SlidingPaneLayout this$0>
		//   55  113:invokevirtual   #62  <Method int SlidingPaneLayout.getPaddingLeft()>
		//   56  116:aload           6
		//   57  118:getfield        #65  <Field int SlidingPaneLayout$LayoutParams.leftMargin>
		//   58  121:iadd            
		//   59  122:istore          5
				if(f <= 0.0F)
		//*  60  124:fload_2         
		//*  61  125:fconst_0        
		//*  62  126:fcmpl           
		//*  63  127:ifgt            157
				{
					i = l;
		//   64  130:iload           5
		//   65  132:istore          4
					if(f != 0.0F)
						break label0;
		//   66  134:fload_2         
		//   67  135:fconst_0        
		//   68  136:fcmpl           
		//   69  137:ifne            169
					i = l;
		//   70  140:iload           5
		//   71  142:istore          4
					if(mSlideOffset <= 0.5F)
						break label0;
		//   72  144:aload_0         
		//   73  145:getfield        #13  <Field SlidingPaneLayout this$0>
		//   74  148:getfield        #96  <Field float SlidingPaneLayout.mSlideOffset>
		//   75  151:ldc1            #121 <Float 0.5F>
		//   76  153:fcmpl           
		//   77  154:ifle            169
				}
				i = l + mSlideRange;
		//   78  157:iload           5
		//   79  159:aload_0         
		//   80  160:getfield        #13  <Field SlidingPaneLayout this$0>
		//   81  163:getfield        #50  <Field int SlidingPaneLayout.mSlideRange>
		//   82  166:iadd            
		//   83  167:istore          4
			}
			mDragHelper.settleCapturedViewAt(i, view.getTop());
		//   84  169:aload_0         
		//   85  170:getfield        #13  <Field SlidingPaneLayout this$0>
		//   86  173:getfield        #77  <Field ViewDragHelper SlidingPaneLayout.mDragHelper>
		//   87  176:iload           4
		//   88  178:aload_1         
		//   89  179:invokevirtual   #69  <Method int View.getTop()>
		//   90  182:invokevirtual   #125 <Method boolean ViewDragHelper.settleCapturedViewAt(int, int)>
		//   91  185:pop             
			invalidate();
		//   92  186:aload_0         
		//   93  187:getfield        #13  <Field SlidingPaneLayout this$0>
		//   94  190:invokevirtual   #118 <Method void SlidingPaneLayout.invalidate()>
		//   95  193:return          
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
		//    3    3:invokespecial   #31  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
			weight = 0.0F;
		//    4    6:aload_0         
		//    5    7:fconst_0        
		//    6    8:putfield        #28  <Field float weight>
			context = ((Context) (context.obtainStyledAttributes(attributeset, ATTRS)));
		//    7   11:aload_1         
		//    8   12:aload_2         
		//    9   13:getstatic       #21  <Field int[] ATTRS>
		//   10   16:invokevirtual   #37  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//   11   19:astore_1        
			weight = ((TypedArray) (context)).getFloat(0, 0.0F);
		//   12   20:aload_0         
		//   13   21:aload_1         
		//   14   22:iconst_0        
		//   15   23:fconst_0        
		//   16   24:invokevirtual   #43  <Method float TypedArray.getFloat(int, float)>
		//   17   27:putfield        #28  <Field float weight>
			((TypedArray) (context)).recycle();
		//   18   30:aload_1         
		//   19   31:invokevirtual   #46  <Method void TypedArray.recycle()>
		//   20   34:return          
		}

		public LayoutParams(LayoutParams layoutparams)
		{
			super(((android.view.ViewGroup.MarginLayoutParams) (layoutparams)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #50  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
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
		//    2    2:invokespecial   #53  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
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
		//    2    2:invokespecial   #50  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
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
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #46  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			if(isOpen)
		//*   4    6:aload_0         
		//*   5    7:getfield        #39  <Field boolean isOpen>
		//*   6   10:ifeq            18
				i = 1;
		//    7   13:iconst_1        
		//    8   14:istore_2        
			else
		//*   9   15:goto            20
				i = 0;
		//   10   18:iconst_0        
		//   11   19:istore_2        
			parcel.writeInt(i);
		//   12   20:aload_1         
		//   13   21:iload_2         
		//   14   22:invokevirtual   #50  <Method void Parcel.writeInt(int)>
		//   15   25:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks() {

			public SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class SlidingPaneLayout$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #22  <Method void SlidingPaneLayout$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (createFromParcel(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #25  <Method SlidingPaneLayout$SavedState createFromParcel(Parcel, ClassLoader)>
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
			//    2    2:invokevirtual   #30  <Method SlidingPaneLayout$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
);
		boolean isOpen;

		static 
		{
		//    0    0:new             #9   <Class SlidingPaneLayout$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #19  <Method void SlidingPaneLayout$SavedState$1()>
		//    3    7:invokestatic    #25  <Method android.os.Parcelable$Creator ParcelableCompat.newCreator(ParcelableCompatCreatorCallbacks)>
		//    4   10:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
		//*   5   13:return          
		}

		SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #31  <Method void AbsSavedState(Parcel, ClassLoader)>
			boolean flag;
			if(parcel.readInt() != 0)
		//*   4    6:aload_1         
		//*   5    7:invokevirtual   #37  <Method int Parcel.readInt()>
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
		//   14   22:putfield        #39  <Field boolean isOpen>
		//   15   25:return          
		}

		SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #42  <Method void AbsSavedState(Parcelable)>
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

	static interface SlidingPanelLayoutImpl
	{

		public abstract void invalidateChildRegion(SlidingPaneLayout slidingpanelayout, View view);
	}

	static class SlidingPanelLayoutImplBase
		implements SlidingPanelLayoutImpl
	{

		public void invalidateChildRegion(SlidingPaneLayout slidingpanelayout, View view)
		{
			ViewCompat.postInvalidateOnAnimation(((View) (slidingpanelayout)), view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #22  <Method int View.getLeft()>
		//    3    5:aload_2         
		//    4    6:invokevirtual   #25  <Method int View.getTop()>
		//    5    9:aload_2         
		//    6   10:invokevirtual   #28  <Method int View.getRight()>
		//    7   13:aload_2         
		//    8   14:invokevirtual   #31  <Method int View.getBottom()>
		//    9   17:invokestatic    #37  <Method void ViewCompat.postInvalidateOnAnimation(View, int, int, int, int)>
		//   10   20:return          
		}

		SlidingPanelLayoutImplBase()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static class SlidingPanelLayoutImplJB extends SlidingPanelLayoutImplBase
	{

		public void invalidateChildRegion(SlidingPaneLayout slidingpanelayout, View view)
		{
			if(mGetDisplayList != null && mRecreateDisplayList != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #31  <Field Method mGetDisplayList>
		//*   2    4:ifnull          49
		//*   3    7:aload_0         
		//*   4    8:getfield        #48  <Field Field mRecreateDisplayList>
		//*   5   11:ifnull          49
			{
				try
				{
					mRecreateDisplayList.setBoolean(((Object) (view)), true);
		//    6   14:aload_0         
		//    7   15:getfield        #48  <Field Field mRecreateDisplayList>
		//    8   18:aload_2         
		//    9   19:iconst_1        
		//   10   20:invokevirtual   #65  <Method void Field.setBoolean(Object, boolean)>
					mGetDisplayList.invoke(((Object) (view)), ((Object []) (null)));
		//   11   23:aload_0         
		//   12   24:getfield        #31  <Field Method mGetDisplayList>
		//   13   27:aload_2         
		//   14   28:aconst_null     
		//   15   29:invokevirtual   #71  <Method Object Method.invoke(Object, Object[])>
		//   16   32:pop             
				}
		//*  17   33:goto            54
				catch(Exception exception)
		//*  18   36:astore_3        
				{
					Log.e("SlidingPaneLayout", "Error refreshing display list state", ((Throwable) (exception)));
		//   19   37:ldc1            #33  <String "SlidingPaneLayout">
		//   20   39:ldc1            #73  <String "Error refreshing display list state">
		//   21   41:aload_3         
		//   22   42:invokestatic    #41  <Method int Log.e(String, String, Throwable)>
		//   23   45:pop             
				}
			} else
		//*  24   46:goto            54
			{
				view.invalidate();
		//   25   49:aload_2         
		//   26   50:invokevirtual   #76  <Method void View.invalidate()>
				return;
		//   27   53:return          
			}
			super.invalidateChildRegion(slidingpanelayout, view);
		//   28   54:aload_0         
		//   29   55:aload_1         
		//   30   56:aload_2         
		//   31   57:invokespecial   #78  <Method void SlidingPaneLayout$SlidingPanelLayoutImplBase.invalidateChildRegion(SlidingPaneLayout, View)>
		//   32   60:return          
		}

		private Method mGetDisplayList;
		private Field mRecreateDisplayList;

		SlidingPanelLayoutImplJB()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void SlidingPaneLayout$SlidingPanelLayoutImplBase()>
			try
			{
				mGetDisplayList = ((Class) (android/view/View)).getDeclaredMethod("getDisplayList", ((Class []) (null)));
		//    2    4:aload_0         
		//    3    5:ldc1            #21  <Class View>
		//    4    7:ldc1            #23  <String "getDisplayList">
		//    5    9:aconst_null     
		//    6   10:invokevirtual   #29  <Method Method Class.getDeclaredMethod(String, Class[])>
		//    7   13:putfield        #31  <Field Method mGetDisplayList>
			}
		//*   8   16:goto            29
			catch(NoSuchMethodException nosuchmethodexception)
		//*   9   19:astore_1        
			{
				Log.e("SlidingPaneLayout", "Couldn't fetch getDisplayList method; dimming won't work right.", ((Throwable) (nosuchmethodexception)));
		//   10   20:ldc1            #33  <String "SlidingPaneLayout">
		//   11   22:ldc1            #35  <String "Couldn't fetch getDisplayList method; dimming won't work right.">
		//   12   24:aload_1         
		//   13   25:invokestatic    #41  <Method int Log.e(String, String, Throwable)>
		//   14   28:pop             
			}
			try
			{
				mRecreateDisplayList = ((Class) (android/view/View)).getDeclaredField("mRecreateDisplayList");
		//   15   29:aload_0         
		//   16   30:ldc1            #21  <Class View>
		//   17   32:ldc1            #42  <String "mRecreateDisplayList">
		//   18   34:invokevirtual   #46  <Method Field Class.getDeclaredField(String)>
		//   19   37:putfield        #48  <Field Field mRecreateDisplayList>
				mRecreateDisplayList.setAccessible(true);
		//   20   40:aload_0         
		//   21   41:getfield        #48  <Field Field mRecreateDisplayList>
		//   22   44:iconst_1        
		//   23   45:invokevirtual   #54  <Method void Field.setAccessible(boolean)>
				return;
		//   24   48:return          
			}
			catch(NoSuchFieldException nosuchfieldexception)
		//*  25   49:astore_1        
			{
				Log.e("SlidingPaneLayout", "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", ((Throwable) (nosuchfieldexception)));
		//   26   50:ldc1            #33  <String "SlidingPaneLayout">
		//   27   52:ldc1            #56  <String "Couldn't fetch mRecreateDisplayList field; dimming will be slow.">
		//   28   54:aload_1         
		//   29   55:invokestatic    #41  <Method int Log.e(String, String, Throwable)>
		//   30   58:pop             
			}
		//   31   59:return          
		}
	}

	static class SlidingPanelLayoutImplJBMR1 extends SlidingPanelLayoutImplBase
	{

		public void invalidateChildRegion(SlidingPaneLayout slidingpanelayout, View view)
		{
			ViewCompat.setLayerPaint(view, ((LayoutParams)view.getLayoutParams()).dimPaint);
		//    0    0:aload_2         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #20  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    3    5:checkcast       #22  <Class SlidingPaneLayout$LayoutParams>
		//    4    8:getfield        #26  <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
		//    5   11:invokestatic    #32  <Method void ViewCompat.setLayerPaint(View, Paint)>
		//    6   14:return          
		}

		SlidingPanelLayoutImplJBMR1()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void SlidingPaneLayout$SlidingPanelLayoutImplBase()>
		//    2    4:return          
		}
	}


	public SlidingPaneLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #100 <Method void SlidingPaneLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public SlidingPaneLayout(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #103 <Method void SlidingPaneLayout(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public SlidingPaneLayout(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #104 <Method void ViewGroup(Context, AttributeSet, int)>
		mSliderFadeColor = 0xcccccccc;
	//    5    7:aload_0         
	//    6    8:ldc1            #42  <Int 0xcccccccc>
	//    7   10:putfield        #106 <Field int mSliderFadeColor>
		mFirstLayout = true;
	//    8   13:aload_0         
	//    9   14:iconst_1        
	//   10   15:putfield        #108 <Field boolean mFirstLayout>
		mTmpRect = new Rect();
	//   11   18:aload_0         
	//   12   19:new             #110 <Class Rect>
	//   13   22:dup             
	//   14   23:invokespecial   #111 <Method void Rect()>
	//   15   26:putfield        #113 <Field Rect mTmpRect>
		mPostedRunnables = new ArrayList();
	//   16   29:aload_0         
	//   17   30:new             #115 <Class ArrayList>
	//   18   33:dup             
	//   19   34:invokespecial   #116 <Method void ArrayList()>
	//   20   37:putfield        #118 <Field ArrayList mPostedRunnables>
		float f = context.getResources().getDisplayMetrics().density;
	//   21   40:aload_1         
	//   22   41:invokevirtual   #124 <Method Resources Context.getResources()>
	//   23   44:invokevirtual   #130 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   24   47:getfield        #135 <Field float DisplayMetrics.density>
	//   25   50:fstore          4
		mOverhangSize = (int)(32F * f + 0.5F);
	//   26   52:aload_0         
	//   27   53:ldc1            #136 <Float 32F>
	//   28   55:fload           4
	//   29   57:fmul            
	//   30   58:ldc1            #137 <Float 0.5F>
	//   31   60:fadd            
	//   32   61:f2i             
	//   33   62:putfield        #139 <Field int mOverhangSize>
		ViewConfiguration.get(context);
	//   34   65:aload_1         
	//   35   66:invokestatic    #145 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   36   69:pop             
		setWillNotDraw(false);
	//   37   70:aload_0         
	//   38   71:iconst_0        
	//   39   72:invokevirtual   #149 <Method void setWillNotDraw(boolean)>
		ViewCompat.setAccessibilityDelegate(((View) (this)), ((AccessibilityDelegateCompat) (new AccessibilityDelegate())));
	//   40   75:aload_0         
	//   41   76:new             #6   <Class SlidingPaneLayout$AccessibilityDelegate>
	//   42   79:dup             
	//   43   80:aload_0         
	//   44   81:invokespecial   #152 <Method void SlidingPaneLayout$AccessibilityDelegate(SlidingPaneLayout)>
	//   45   84:invokestatic    #158 <Method void ViewCompat.setAccessibilityDelegate(View, AccessibilityDelegateCompat)>
		ViewCompat.setImportantForAccessibility(((View) (this)), 1);
	//   46   87:aload_0         
	//   47   88:iconst_1        
	//   48   89:invokestatic    #162 <Method void ViewCompat.setImportantForAccessibility(View, int)>
		mDragHelper = ViewDragHelper.create(((ViewGroup) (this)), 0.5F, ((ViewDragHelper.Callback) (new DragHelperCallback())));
	//   49   92:aload_0         
	//   50   93:aload_0         
	//   51   94:ldc1            #137 <Float 0.5F>
	//   52   96:new             #12  <Class SlidingPaneLayout$DragHelperCallback>
	//   53   99:dup             
	//   54  100:aload_0         
	//   55  101:invokespecial   #163 <Method void SlidingPaneLayout$DragHelperCallback(SlidingPaneLayout)>
	//   56  104:invokestatic    #169 <Method ViewDragHelper ViewDragHelper.create(ViewGroup, float, ViewDragHelper$Callback)>
	//   57  107:putfield        #171 <Field ViewDragHelper mDragHelper>
		mDragHelper.setMinVelocity(400F * f);
	//   58  110:aload_0         
	//   59  111:getfield        #171 <Field ViewDragHelper mDragHelper>
	//   60  114:ldc1            #172 <Float 400F>
	//   61  116:fload           4
	//   62  118:fmul            
	//   63  119:invokevirtual   #176 <Method void ViewDragHelper.setMinVelocity(float)>
	//   64  122:return          
	}

	private boolean closePane(View view, int i)
	{
		if(mFirstLayout || smoothSlideTo(0.0F, i))
	//*   0    0:aload_0         
	//*   1    1:getfield        #108 <Field boolean mFirstLayout>
	//*   2    4:ifne            16
	//*   3    7:aload_0         
	//*   4    8:fconst_0        
	//*   5    9:iload_2         
	//*   6   10:invokevirtual   #182 <Method boolean smoothSlideTo(float, int)>
	//*   7   13:ifeq            23
		{
			mPreservedOpenState = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #184 <Field boolean mPreservedOpenState>
			return true;
	//   11   21:iconst_1        
	//   12   22:ireturn         
		} else
		{
			return false;
	//   13   23:iconst_0        
	//   14   24:ireturn         
		}
	}

	private void dimChildView(View view, float f, int i)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #192 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
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
	//   10   19:ldc1            #193 <Int 0xff000000>
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
	//*  21   34:getfield        #197 <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
	//*  22   37:ifnonnull       52
				layoutparams.dimPaint = new Paint();
	//   23   40:aload           5
	//   24   42:new             #199 <Class Paint>
	//   25   45:dup             
	//   26   46:invokespecial   #200 <Method void Paint()>
	//   27   49:putfield        #197 <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
			layoutparams.dimPaint.setColorFilter(((android.graphics.ColorFilter) (new PorterDuffColorFilter(j << 24 | 0xffffff & i, android.graphics.PorterDuff.Mode.SRC_OVER))));
	//   28   52:aload           5
	//   29   54:getfield        #197 <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
	//   30   57:new             #202 <Class PorterDuffColorFilter>
	//   31   60:dup             
	//   32   61:iload           4
	//   33   63:bipush          24
	//   34   65:ishl            
	//   35   66:ldc1            #203 <Int 0xffffff>
	//   36   68:iload_3         
	//   37   69:iand            
	//   38   70:ior             
	//   39   71:getstatic       #209 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_OVER>
	//   40   74:invokespecial   #212 <Method void PorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   41   77:invokevirtual   #216 <Method android.graphics.ColorFilter Paint.setColorFilter(android.graphics.ColorFilter)>
	//   42   80:pop             
			if(view.getLayerType() != 2)
	//*  43   81:aload_1         
	//*  44   82:invokevirtual   #220 <Method int View.getLayerType()>
	//*  45   85:iconst_2        
	//*  46   86:icmpeq          99
				view.setLayerType(2, layoutparams.dimPaint);
	//   47   89:aload_1         
	//   48   90:iconst_2        
	//   49   91:aload           5
	//   50   93:getfield        #197 <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
	//   51   96:invokevirtual   #224 <Method void View.setLayerType(int, Paint)>
			invalidateChildRegion(view);
	//   52   99:aload_0         
	//   53  100:aload_1         
	//   54  101:invokevirtual   #228 <Method void invalidateChildRegion(View)>
			return;
	//   55  104:return          
		}
		if(view.getLayerType() != 0)
	//*  56  105:aload_1         
	//*  57  106:invokevirtual   #220 <Method int View.getLayerType()>
	//*  58  109:ifeq            154
		{
			if(layoutparams.dimPaint != null)
	//*  59  112:aload           5
	//*  60  114:getfield        #197 <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
	//*  61  117:ifnull          130
				layoutparams.dimPaint.setColorFilter(((android.graphics.ColorFilter) (null)));
	//   62  120:aload           5
	//   63  122:getfield        #197 <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
	//   64  125:aconst_null     
	//   65  126:invokevirtual   #216 <Method android.graphics.ColorFilter Paint.setColorFilter(android.graphics.ColorFilter)>
	//   66  129:pop             
			view = ((View) (new DisableLayerRunnable(view)));
	//   67  130:new             #9   <Class SlidingPaneLayout$DisableLayerRunnable>
	//   68  133:dup             
	//   69  134:aload_0         
	//   70  135:aload_1         
	//   71  136:invokespecial   #231 <Method void SlidingPaneLayout$DisableLayerRunnable(SlidingPaneLayout, View)>
	//   72  139:astore_1        
			mPostedRunnables.add(((Object) (view)));
	//   73  140:aload_0         
	//   74  141:getfield        #118 <Field ArrayList mPostedRunnables>
	//   75  144:aload_1         
	//   76  145:invokevirtual   #235 <Method boolean ArrayList.add(Object)>
	//   77  148:pop             
			ViewCompat.postOnAnimation(((View) (this)), ((Runnable) (view)));
	//   78  149:aload_0         
	//   79  150:aload_1         
	//   80  151:invokestatic    #239 <Method void ViewCompat.postOnAnimation(View, Runnable)>
		}
	//   81  154:return          
	}

	private boolean openPane(View view, int i)
	{
		if(mFirstLayout || smoothSlideTo(1.0F, i))
	//*   0    0:aload_0         
	//*   1    1:getfield        #108 <Field boolean mFirstLayout>
	//*   2    4:ifne            16
	//*   3    7:aload_0         
	//*   4    8:fconst_1        
	//*   5    9:iload_2         
	//*   6   10:invokevirtual   #182 <Method boolean smoothSlideTo(float, int)>
	//*   7   13:ifeq            23
		{
			mPreservedOpenState = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #184 <Field boolean mPreservedOpenState>
			return true;
	//   11   21:iconst_1        
	//   12   22:ireturn         
		} else
		{
			return false;
	//   13   23:iconst_0        
	//   14   24:ireturn         
		}
	}

	private void parallaxOtherViews(float f)
	{
		int i;
		boolean flag;
label0:
		{
			flag = isLayoutRtlSupport();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #245 <Method boolean isLayoutRtlSupport()>
	//    2    4:istore          7
			LayoutParams layoutparams = (LayoutParams)mSlideableView.getLayoutParams();
	//    3    6:aload_0         
	//    4    7:getfield        #247 <Field View mSlideableView>
	//    5   10:invokevirtual   #192 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    6   13:checkcast       #15  <Class SlidingPaneLayout$LayoutParams>
	//    7   16:astore          8
			if(layoutparams.dimWhenOffset)
	//*   8   18:aload           8
	//*   9   20:getfield        #250 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
	//*  10   23:ifeq            55
			{
				if(flag)
	//*  11   26:iload           7
	//*  12   28:ifeq            40
					i = layoutparams.rightMargin;
	//   13   31:aload           8
	//   14   33:getfield        #253 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//   15   36:istore_3        
				else
	//*  16   37:goto            46
					i = layoutparams.leftMargin;
	//   17   40:aload           8
	//   18   42:getfield        #256 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//   19   45:istore_3        
				if(i <= 0)
	//*  20   46:iload_3         
	//*  21   47:ifgt            55
				{
					i = 1;
	//   22   50:iconst_1        
	//   23   51:istore_3        
					break label0;
	//   24   52:goto            57
				}
			}
			i = 0;
	//   25   55:iconst_0        
	//   26   56:istore_3        
		}
		int l = getChildCount();
	//   27   57:aload_0         
	//   28   58:invokevirtual   #259 <Method int getChildCount()>
	//   29   61:istore          6
		for(int j = 0; j < l; j++)
	//*  30   63:iconst_0        
	//*  31   64:istore          4
	//*  32   66:iload           4
	//*  33   68:iload           6
	//*  34   70:icmpge          194
		{
			View view = getChildAt(j);
	//   35   73:aload_0         
	//   36   74:iload           4
	//   37   76:invokevirtual   #263 <Method View getChildAt(int)>
	//   38   79:astore          8
			if(view == mSlideableView)
	//*  39   81:aload           8
	//*  40   83:aload_0         
	//*  41   84:getfield        #247 <Field View mSlideableView>
	//*  42   87:if_acmpne       93
				continue;
	//   43   90:goto            185
			int k = (int)((1.0F - mParallaxOffset) * (float)mParallaxBy);
	//   44   93:fconst_1        
	//   45   94:aload_0         
	//   46   95:getfield        #265 <Field float mParallaxOffset>
	//   47   98:fsub            
	//   48   99:aload_0         
	//   49  100:getfield        #267 <Field int mParallaxBy>
	//   50  103:i2f             
	//   51  104:fmul            
	//   52  105:f2i             
	//   53  106:istore          5
			mParallaxOffset = f;
	//   54  108:aload_0         
	//   55  109:fload_1         
	//   56  110:putfield        #265 <Field float mParallaxOffset>
			k -= (int)((1.0F - f) * (float)mParallaxBy);
	//   57  113:iload           5
	//   58  115:fconst_1        
	//   59  116:fload_1         
	//   60  117:fsub            
	//   61  118:aload_0         
	//   62  119:getfield        #267 <Field int mParallaxBy>
	//   63  122:i2f             
	//   64  123:fmul            
	//   65  124:f2i             
	//   66  125:isub            
	//   67  126:istore          5
			if(flag)
	//*  68  128:iload           7
	//*  69  130:ifeq            141
				k = -k;
	//   70  133:iload           5
	//   71  135:ineg            
	//   72  136:istore          5
	//*  73  138:goto            141
			view.offsetLeftAndRight(k);
	//   74  141:aload           8
	//   75  143:iload           5
	//   76  145:invokevirtual   #271 <Method void View.offsetLeftAndRight(int)>
			if(!i)
				continue;
	//   77  148:iload_3         
	//   78  149:ifeq            185
			float f1;
			if(flag)
	//*  79  152:iload           7
	//*  80  154:ifeq            167
				f1 = mParallaxOffset - 1.0F;
	//   81  157:aload_0         
	//   82  158:getfield        #265 <Field float mParallaxOffset>
	//   83  161:fconst_1        
	//   84  162:fsub            
	//   85  163:fstore_2        
			else
	//*  86  164:goto            174
				f1 = 1.0F - mParallaxOffset;
	//   87  167:fconst_1        
	//   88  168:aload_0         
	//   89  169:getfield        #265 <Field float mParallaxOffset>
	//   90  172:fsub            
	//   91  173:fstore_2        
			dimChildView(view, f1, mCoveredFadeColor);
	//   92  174:aload_0         
	//   93  175:aload           8
	//   94  177:fload_2         
	//   95  178:aload_0         
	//   96  179:getfield        #273 <Field int mCoveredFadeColor>
	//   97  182:invokespecial   #275 <Method void dimChildView(View, float, int)>
		}

	//   98  185:iload           4
	//   99  187:iconst_1        
	//  100  188:iadd            
	//  101  189:istore          4
	//* 102  191:goto            66
	//  103  194:return          
	}

	private static boolean viewIsOpaque(View view)
	{
		if(view.isOpaque())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #280 <Method boolean View.isOpaque()>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   5    9:getstatic       #88  <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   12:bipush          18
	//*   7   14:icmplt          19
			return false;
	//    8   17:iconst_0        
	//    9   18:ireturn         
		view = ((View) (view.getBackground()));
	//   10   19:aload_0         
	//   11   20:invokevirtual   #284 <Method Drawable View.getBackground()>
	//   12   23:astore_0        
		if(view != null)
	//*  13   24:aload_0         
	//*  14   25:ifnull          40
			return ((Drawable) (view)).getOpacity() == -1;
	//   15   28:aload_0         
	//   16   29:invokevirtual   #289 <Method int Drawable.getOpacity()>
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
	//*   2    4:ifeq            144
		{
			ViewGroup viewgroup = (ViewGroup)view;
	//    3    7:aload_1         
	//    4    8:checkcast       #4   <Class ViewGroup>
	//    5   11:astore          9
			int i1 = view.getScrollX();
	//    6   13:aload_1         
	//    7   14:invokevirtual   #294 <Method int View.getScrollX()>
	//    8   17:istore          7
			int j1 = view.getScrollY();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #297 <Method int View.getScrollY()>
	//   11   23:istore          8
			for(int l = viewgroup.getChildCount() - 1; l >= 0; l--)
	//*  12   25:aload           9
	//*  13   27:invokevirtual   #298 <Method int ViewGroup.getChildCount()>
	//*  14   30:iconst_1        
	//*  15   31:isub            
	//*  16   32:istore          6
	//*  17   34:iload           6
	//*  18   36:iflt            144
			{
				View view1 = viewgroup.getChildAt(l);
	//   19   39:aload           9
	//   20   41:iload           6
	//   21   43:invokevirtual   #299 <Method View ViewGroup.getChildAt(int)>
	//   22   46:astore          10
				if(j + i1 >= view1.getLeft() && j + i1 < view1.getRight() && k + j1 >= view1.getTop() && k + j1 < view1.getBottom() && canScroll(view1, true, i, (j + i1) - view1.getLeft(), (k + j1) - view1.getTop()))
	//*  23   48:iload           4
	//*  24   50:iload           7
	//*  25   52:iadd            
	//*  26   53:aload           10
	//*  27   55:invokevirtual   #302 <Method int View.getLeft()>
	//*  28   58:icmplt          135
	//*  29   61:iload           4
	//*  30   63:iload           7
	//*  31   65:iadd            
	//*  32   66:aload           10
	//*  33   68:invokevirtual   #305 <Method int View.getRight()>
	//*  34   71:icmpge          135
	//*  35   74:iload           5
	//*  36   76:iload           8
	//*  37   78:iadd            
	//*  38   79:aload           10
	//*  39   81:invokevirtual   #308 <Method int View.getTop()>
	//*  40   84:icmplt          135
	//*  41   87:iload           5
	//*  42   89:iload           8
	//*  43   91:iadd            
	//*  44   92:aload           10
	//*  45   94:invokevirtual   #311 <Method int View.getBottom()>
	//*  46   97:icmpge          135
	//*  47  100:aload_0         
	//*  48  101:aload           10
	//*  49  103:iconst_1        
	//*  50  104:iload_3         
	//*  51  105:iload           4
	//*  52  107:iload           7
	//*  53  109:iadd            
	//*  54  110:aload           10
	//*  55  112:invokevirtual   #302 <Method int View.getLeft()>
	//*  56  115:isub            
	//*  57  116:iload           5
	//*  58  118:iload           8
	//*  59  120:iadd            
	//*  60  121:aload           10
	//*  61  123:invokevirtual   #308 <Method int View.getTop()>
	//*  62  126:isub            
	//*  63  127:invokevirtual   #313 <Method boolean canScroll(View, boolean, int, int, int)>
	//*  64  130:ifeq            135
					return true;
	//   65  133:iconst_1        
	//   66  134:ireturn         
			}

	//   67  135:iload           6
	//   68  137:iconst_1        
	//   69  138:isub            
	//   70  139:istore          6
		}
	//*  71  141:goto            34
		if(flag)
	//*  72  144:iload_2         
	//*  73  145:ifeq            171
		{
			if(!isLayoutRtlSupport())
	//*  74  148:aload_0         
	//*  75  149:invokevirtual   #245 <Method boolean isLayoutRtlSupport()>
	//*  76  152:ifeq            158
	//*  77  155:goto            161
				i = -i;
	//   78  158:iload_3         
	//   79  159:ineg            
	//   80  160:istore_3        
			if(view.canScrollHorizontally(i))
	//*  81  161:aload_1         
	//*  82  162:iload_3         
	//*  83  163:invokevirtual   #317 <Method boolean View.canScrollHorizontally(int)>
	//*  84  166:ifeq            171
				return true;
	//   85  169:iconst_1        
	//   86  170:ireturn         
		}
		return false;
	//   87  171:iconst_0        
	//   88  172:ireturn         
	}

	public boolean canSlide()
	{
		return mCanSlide;
	//    0    0:aload_0         
	//    1    1:getfield        #321 <Field boolean mCanSlide>
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
	//    5    9:invokespecial   #326 <Method boolean ViewGroup.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
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
	//    2    2:getfield        #247 <Field View mSlideableView>
	//    3    5:iconst_0        
	//    4    6:invokespecial   #328 <Method boolean closePane(View, int)>
	//    5    9:ireturn         
	}

	public void computeScroll()
	{
		if(mDragHelper.continueSettling(true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #171 <Field ViewDragHelper mDragHelper>
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #333 <Method boolean ViewDragHelper.continueSettling(boolean)>
	//*   4    8:ifeq            30
		{
			if(!mCanSlide)
	//*   5   11:aload_0         
	//*   6   12:getfield        #321 <Field boolean mCanSlide>
	//*   7   15:ifne            26
			{
				mDragHelper.abort();
	//    8   18:aload_0         
	//    9   19:getfield        #171 <Field ViewDragHelper mDragHelper>
	//   10   22:invokevirtual   #336 <Method void ViewDragHelper.abort()>
				return;
	//   11   25:return          
			}
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   12   26:aload_0         
	//   13   27:invokestatic    #339 <Method void ViewCompat.postInvalidateOnAnimation(View)>
		}
	//   14   30:return          
	}

	void dispatchOnPanelClosed(View view)
	{
		if(mPanelSlideListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #342 <Field SlidingPaneLayout$PanelSlideListener mPanelSlideListener>
	//*   2    4:ifnull          17
			mPanelSlideListener.onPanelClosed(view);
	//    3    7:aload_0         
	//    4    8:getfield        #342 <Field SlidingPaneLayout$PanelSlideListener mPanelSlideListener>
	//    5   11:aload_1         
	//    6   12:invokeinterface #345 <Method void SlidingPaneLayout$PanelSlideListener.onPanelClosed(View)>
		sendAccessibilityEvent(32);
	//    7   17:aload_0         
	//    8   18:bipush          32
	//    9   20:invokevirtual   #348 <Method void sendAccessibilityEvent(int)>
	//   10   23:return          
	}

	void dispatchOnPanelOpened(View view)
	{
		if(mPanelSlideListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #342 <Field SlidingPaneLayout$PanelSlideListener mPanelSlideListener>
	//*   2    4:ifnull          17
			mPanelSlideListener.onPanelOpened(view);
	//    3    7:aload_0         
	//    4    8:getfield        #342 <Field SlidingPaneLayout$PanelSlideListener mPanelSlideListener>
	//    5   11:aload_1         
	//    6   12:invokeinterface #352 <Method void SlidingPaneLayout$PanelSlideListener.onPanelOpened(View)>
		sendAccessibilityEvent(32);
	//    7   17:aload_0         
	//    8   18:bipush          32
	//    9   20:invokevirtual   #348 <Method void sendAccessibilityEvent(int)>
	//   10   23:return          
	}

	void dispatchOnPanelSlide(View view)
	{
		if(mPanelSlideListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #342 <Field SlidingPaneLayout$PanelSlideListener mPanelSlideListener>
	//*   2    4:ifnull          21
			mPanelSlideListener.onPanelSlide(view, mSlideOffset);
	//    3    7:aload_0         
	//    4    8:getfield        #342 <Field SlidingPaneLayout$PanelSlideListener mPanelSlideListener>
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #355 <Field float mSlideOffset>
	//    8   16:invokeinterface #359 <Method void SlidingPaneLayout$PanelSlideListener.onPanelSlide(View, float)>
	//    9   21:return          
	}

	public void draw(Canvas canvas)
	{
		super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #363 <Method void ViewGroup.draw(Canvas)>
		Drawable drawable;
		if(isLayoutRtlSupport())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #245 <Method boolean isLayoutRtlSupport()>
	//*   5    9:ifeq            21
			drawable = mShadowDrawableRight;
	//    6   12:aload_0         
	//    7   13:getfield        #365 <Field Drawable mShadowDrawableRight>
	//    8   16:astore          7
		else
	//*   9   18:goto            27
			drawable = mShadowDrawableLeft;
	//   10   21:aload_0         
	//   11   22:getfield        #367 <Field Drawable mShadowDrawableLeft>
	//   12   25:astore          7
		View view;
		if(getChildCount() > 1)
	//*  13   27:aload_0         
	//*  14   28:invokevirtual   #259 <Method int getChildCount()>
	//*  15   31:iconst_1        
	//*  16   32:icmple          45
			view = getChildAt(1);
	//   17   35:aload_0         
	//   18   36:iconst_1        
	//   19   37:invokevirtual   #263 <Method View getChildAt(int)>
	//   20   40:astore          8
		else
	//*  21   42:goto            48
			view = null;
	//   22   45:aconst_null     
	//   23   46:astore          8
		if(view == null || drawable == null)
	//*  24   48:aload           8
	//*  25   50:ifnull          58
	//*  26   53:aload           7
	//*  27   55:ifnonnull       59
			return;
	//   28   58:return          
		int k = view.getTop();
	//   29   59:aload           8
	//   30   61:invokevirtual   #308 <Method int View.getTop()>
	//   31   64:istore          4
		int l = view.getBottom();
	//   32   66:aload           8
	//   33   68:invokevirtual   #311 <Method int View.getBottom()>
	//   34   71:istore          5
		int i1 = drawable.getIntrinsicWidth();
	//   35   73:aload           7
	//   36   75:invokevirtual   #370 <Method int Drawable.getIntrinsicWidth()>
	//   37   78:istore          6
		int i;
		int j;
		if(isLayoutRtlSupport())
	//*  38   80:aload_0         
	//*  39   81:invokevirtual   #245 <Method boolean isLayoutRtlSupport()>
	//*  40   84:ifeq            101
		{
			i = view.getRight();
	//   41   87:aload           8
	//   42   89:invokevirtual   #305 <Method int View.getRight()>
	//   43   92:istore_2        
			j = i + i1;
	//   44   93:iload_2         
	//   45   94:iload           6
	//   46   96:iadd            
	//   47   97:istore_3        
		} else
	//*  48   98:goto            112
		{
			j = view.getLeft();
	//   49  101:aload           8
	//   50  103:invokevirtual   #302 <Method int View.getLeft()>
	//   51  106:istore_3        
			i = j - i1;
	//   52  107:iload_3         
	//   53  108:iload           6
	//   54  110:isub            
	//   55  111:istore_2        
		}
		drawable.setBounds(i, k, j, l);
	//   56  112:aload           7
	//   57  114:iload_2         
	//   58  115:iload           4
	//   59  117:iload_3         
	//   60  118:iload           5
	//   61  120:invokevirtual   #374 <Method void Drawable.setBounds(int, int, int, int)>
		drawable.draw(canvas);
	//   62  123:aload           7
	//   63  125:aload_1         
	//   64  126:invokevirtual   #375 <Method void Drawable.draw(Canvas)>
	//   65  129:return          
	}

	protected boolean drawChild(Canvas canvas, View view, long l)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #192 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #15  <Class SlidingPaneLayout$LayoutParams>
	//    3    7:astore          7
		int i = canvas.save(2);
	//    4    9:aload_1         
	//    5   10:iconst_2        
	//    6   11:invokevirtual   #383 <Method int Canvas.save(int)>
	//    7   14:istore          5
		if(mCanSlide && !layoutparams.slideable && mSlideableView != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #321 <Field boolean mCanSlide>
	//*  10   20:ifeq            114
	//*  11   23:aload           7
	//*  12   25:getfield        #386 <Field boolean SlidingPaneLayout$LayoutParams.slideable>
	//*  13   28:ifne            114
	//*  14   31:aload_0         
	//*  15   32:getfield        #247 <Field View mSlideableView>
	//*  16   35:ifnull          114
		{
			canvas.getClipBounds(mTmpRect);
	//   17   38:aload_1         
	//   18   39:aload_0         
	//   19   40:getfield        #113 <Field Rect mTmpRect>
	//   20   43:invokevirtual   #390 <Method boolean Canvas.getClipBounds(Rect)>
	//   21   46:pop             
			if(isLayoutRtlSupport())
	//*  22   47:aload_0         
	//*  23   48:invokevirtual   #245 <Method boolean isLayoutRtlSupport()>
	//*  24   51:ifeq            81
				mTmpRect.left = Math.max(mTmpRect.left, mSlideableView.getRight());
	//   25   54:aload_0         
	//   26   55:getfield        #113 <Field Rect mTmpRect>
	//   27   58:aload_0         
	//   28   59:getfield        #113 <Field Rect mTmpRect>
	//   29   62:getfield        #393 <Field int Rect.left>
	//   30   65:aload_0         
	//   31   66:getfield        #247 <Field View mSlideableView>
	//   32   69:invokevirtual   #305 <Method int View.getRight()>
	//   33   72:invokestatic    #399 <Method int Math.max(int, int)>
	//   34   75:putfield        #393 <Field int Rect.left>
			else
	//*  35   78:goto            105
				mTmpRect.right = Math.min(mTmpRect.right, mSlideableView.getLeft());
	//   36   81:aload_0         
	//   37   82:getfield        #113 <Field Rect mTmpRect>
	//   38   85:aload_0         
	//   39   86:getfield        #113 <Field Rect mTmpRect>
	//   40   89:getfield        #402 <Field int Rect.right>
	//   41   92:aload_0         
	//   42   93:getfield        #247 <Field View mSlideableView>
	//   43   96:invokevirtual   #302 <Method int View.getLeft()>
	//   44   99:invokestatic    #405 <Method int Math.min(int, int)>
	//   45  102:putfield        #402 <Field int Rect.right>
			canvas.clipRect(mTmpRect);
	//   46  105:aload_1         
	//   47  106:aload_0         
	//   48  107:getfield        #113 <Field Rect mTmpRect>
	//   49  110:invokevirtual   #408 <Method boolean Canvas.clipRect(Rect)>
	//   50  113:pop             
		}
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT >= 11)
	//*  51  114:getstatic       #88  <Field int android.os.Build$VERSION.SDK_INT>
	//*  52  117:bipush          11
	//*  53  119:icmplt          134
			flag = super.drawChild(canvas, view, l);
	//   54  122:aload_0         
	//   55  123:aload_1         
	//   56  124:aload_2         
	//   57  125:lload_3         
	//   58  126:invokespecial   #410 <Method boolean ViewGroup.drawChild(Canvas, View, long)>
	//   59  129:istore          6
		else
	//*  60  131:goto            266
		if(layoutparams.dimWhenOffset && mSlideOffset > 0.0F)
	//*  61  134:aload           7
	//*  62  136:getfield        #250 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
	//*  63  139:ifeq            245
	//*  64  142:aload_0         
	//*  65  143:getfield        #355 <Field float mSlideOffset>
	//*  66  146:fconst_0        
	//*  67  147:fcmpl           
	//*  68  148:ifle            245
		{
			if(!view.isDrawingCacheEnabled())
	//*  69  151:aload_2         
	//*  70  152:invokevirtual   #413 <Method boolean View.isDrawingCacheEnabled()>
	//*  71  155:ifne            163
				view.setDrawingCacheEnabled(true);
	//   72  158:aload_2         
	//   73  159:iconst_1        
	//   74  160:invokevirtual   #416 <Method void View.setDrawingCacheEnabled(boolean)>
			android.graphics.Bitmap bitmap = view.getDrawingCache();
	//   75  163:aload_2         
	//   76  164:invokevirtual   #420 <Method android.graphics.Bitmap View.getDrawingCache()>
	//   77  167:astore          8
			if(bitmap != null)
	//*  78  169:aload           8
	//*  79  171:ifnull          201
			{
				canvas.drawBitmap(bitmap, view.getLeft(), view.getTop(), layoutparams.dimPaint);
	//   80  174:aload_1         
	//   81  175:aload           8
	//   82  177:aload_2         
	//   83  178:invokevirtual   #302 <Method int View.getLeft()>
	//   84  181:i2f             
	//   85  182:aload_2         
	//   86  183:invokevirtual   #308 <Method int View.getTop()>
	//   87  186:i2f             
	//   88  187:aload           7
	//   89  189:getfield        #197 <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
	//   90  192:invokevirtual   #424 <Method void Canvas.drawBitmap(android.graphics.Bitmap, float, float, Paint)>
				flag = false;
	//   91  195:iconst_0        
	//   92  196:istore          6
			} else
	//*  93  198:goto            242
			{
				Log.e("SlidingPaneLayout", (new StringBuilder()).append("drawChild: child view ").append(((Object) (view))).append(" returned null drawing cache").toString());
	//   94  201:ldc1            #52  <String "SlidingPaneLayout">
	//   95  203:new             #426 <Class StringBuilder>
	//   96  206:dup             
	//   97  207:invokespecial   #427 <Method void StringBuilder()>
	//   98  210:ldc2            #429 <String "drawChild: child view ">
	//   99  213:invokevirtual   #433 <Method StringBuilder StringBuilder.append(String)>
	//  100  216:aload_2         
	//  101  217:invokevirtual   #436 <Method StringBuilder StringBuilder.append(Object)>
	//  102  220:ldc2            #438 <String " returned null drawing cache">
	//  103  223:invokevirtual   #433 <Method StringBuilder StringBuilder.append(String)>
	//  104  226:invokevirtual   #442 <Method String StringBuilder.toString()>
	//  105  229:invokestatic    #448 <Method int Log.e(String, String)>
	//  106  232:pop             
				flag = super.drawChild(canvas, view, l);
	//  107  233:aload_0         
	//  108  234:aload_1         
	//  109  235:aload_2         
	//  110  236:lload_3         
	//  111  237:invokespecial   #410 <Method boolean ViewGroup.drawChild(Canvas, View, long)>
	//  112  240:istore          6
			}
		} else
	//* 113  242:goto            266
		{
			if(view.isDrawingCacheEnabled())
	//* 114  245:aload_2         
	//* 115  246:invokevirtual   #413 <Method boolean View.isDrawingCacheEnabled()>
	//* 116  249:ifeq            257
				view.setDrawingCacheEnabled(false);
	//  117  252:aload_2         
	//  118  253:iconst_0        
	//  119  254:invokevirtual   #416 <Method void View.setDrawingCacheEnabled(boolean)>
			flag = super.drawChild(canvas, view, l);
	//  120  257:aload_0         
	//  121  258:aload_1         
	//  122  259:aload_2         
	//  123  260:lload_3         
	//  124  261:invokespecial   #410 <Method boolean ViewGroup.drawChild(Canvas, View, long)>
	//  125  264:istore          6
		}
		canvas.restoreToCount(i);
	//  126  266:aload_1         
	//  127  267:iload           5
	//  128  269:invokevirtual   #451 <Method void Canvas.restoreToCount(int)>
		return flag;
	//  129  272:iload           6
	//  130  274:ireturn         
	}

	protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams()));
	//    0    0:new             #15  <Class SlidingPaneLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:invokespecial   #453 <Method void SlidingPaneLayout$LayoutParams()>
	//    3    7:areturn         
	}

	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(getContext(), attributeset)));
	//    0    0:new             #15  <Class SlidingPaneLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #459 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #460 <Method void SlidingPaneLayout$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #463 <Class android.view.ViewGroup$MarginLayoutParams>
	//*   2    4:ifeq            19
			return ((android.view.ViewGroup.LayoutParams) (new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams)));
	//    3    7:new             #15  <Class SlidingPaneLayout$LayoutParams>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:checkcast       #463 <Class android.view.ViewGroup$MarginLayoutParams>
	//    7   15:invokespecial   #466 <Method void SlidingPaneLayout$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
	//    8   18:areturn         
		else
			return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(layoutparams)));
	//    9   19:new             #15  <Class SlidingPaneLayout$LayoutParams>
	//   10   22:dup             
	//   11   23:aload_1         
	//   12   24:invokespecial   #469 <Method void SlidingPaneLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//   13   27:areturn         
	}

	public int getCoveredFadeColor()
	{
		return mCoveredFadeColor;
	//    0    0:aload_0         
	//    1    1:getfield        #273 <Field int mCoveredFadeColor>
	//    2    4:ireturn         
	}

	public int getParallaxDistance()
	{
		return mParallaxBy;
	//    0    0:aload_0         
	//    1    1:getfield        #267 <Field int mParallaxBy>
	//    2    4:ireturn         
	}

	public int getSliderFadeColor()
	{
		return mSliderFadeColor;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field int mSliderFadeColor>
	//    2    4:ireturn         
	}

	void invalidateChildRegion(View view)
	{
		IMPL.invalidateChildRegion(this, view);
	//    0    0:getstatic       #93  <Field SlidingPaneLayout$SlidingPanelLayoutImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #476 <Method void SlidingPaneLayout$SlidingPanelLayoutImpl.invalidateChildRegion(SlidingPaneLayout, View)>
	//    4   10:return          
	}

	boolean isDimmed(View view)
	{
		if(view == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		view = ((View) ((LayoutParams)view.getLayoutParams()));
	//    4    6:aload_1         
	//    5    7:invokevirtual   #192 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    6   10:checkcast       #15  <Class SlidingPaneLayout$LayoutParams>
	//    7   13:astore_1        
		return mCanSlide && ((LayoutParams) (view)).dimWhenOffset && mSlideOffset > 0.0F;
	//    8   14:aload_0         
	//    9   15:getfield        #321 <Field boolean mCanSlide>
	//   10   18:ifeq            39
	//   11   21:aload_1         
	//   12   22:getfield        #250 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
	//   13   25:ifeq            39
	//   14   28:aload_0         
	//   15   29:getfield        #355 <Field float mSlideOffset>
	//   16   32:fconst_0        
	//   17   33:fcmpl           
	//   18   34:ifle            39
	//   19   37:iconst_1        
	//   20   38:ireturn         
	//   21   39:iconst_0        
	//   22   40:ireturn         
	}

	boolean isLayoutRtlSupport()
	{
		return ViewCompat.getLayoutDirection(((View) (this))) == 1;
	//    0    0:aload_0         
	//    1    1:invokestatic    #481 <Method int ViewCompat.getLayoutDirection(View)>
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
	//    1    1:getfield        #321 <Field boolean mCanSlide>
	//    2    4:ifeq            16
	//    3    7:aload_0         
	//    4    8:getfield        #355 <Field float mSlideOffset>
	//    5   11:fconst_1        
	//    6   12:fcmpl           
	//    7   13:ifne            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public boolean isSlideable()
	{
		return mCanSlide;
	//    0    0:aload_0         
	//    1    1:getfield        #321 <Field boolean mCanSlide>
	//    2    4:ireturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #486 <Method void ViewGroup.onAttachedToWindow()>
		mFirstLayout = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #108 <Field boolean mFirstLayout>
	//    5    9:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #489 <Method void ViewGroup.onDetachedFromWindow()>
		mFirstLayout = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #108 <Field boolean mFirstLayout>
		int i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_1        
		for(int j = mPostedRunnables.size(); i < j; i++)
	//*   7   11:aload_0         
	//*   8   12:getfield        #118 <Field ArrayList mPostedRunnables>
	//*   9   15:invokevirtual   #492 <Method int ArrayList.size()>
	//*  10   18:istore_2        
	//*  11   19:iload_1         
	//*  12   20:iload_2         
	//*  13   21:icmpge          45
			((DisableLayerRunnable)mPostedRunnables.get(i)).run();
	//   14   24:aload_0         
	//   15   25:getfield        #118 <Field ArrayList mPostedRunnables>
	//   16   28:iload_1         
	//   17   29:invokevirtual   #495 <Method Object ArrayList.get(int)>
	//   18   32:checkcast       #9   <Class SlidingPaneLayout$DisableLayerRunnable>
	//   19   35:invokevirtual   #498 <Method void SlidingPaneLayout$DisableLayerRunnable.run()>

	//   20   38:iload_1         
	//   21   39:iconst_1        
	//   22   40:iadd            
	//   23   41:istore_1        
	//*  24   42:goto            19
		mPostedRunnables.clear();
	//   25   45:aload_0         
	//   26   46:getfield        #118 <Field ArrayList mPostedRunnables>
	//   27   49:invokevirtual   #501 <Method void ArrayList.clear()>
	//   28   52:return          
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		int i = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #508 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore          4
		if(!mCanSlide && i == 0 && getChildCount() > 1)
	//*   3    6:aload_0         
	//*   4    7:getfield        #321 <Field boolean mCanSlide>
	//*   5   10:ifne            75
	//*   6   13:iload           4
	//*   7   15:ifne            75
	//*   8   18:aload_0         
	//*   9   19:invokevirtual   #259 <Method int getChildCount()>
	//*  10   22:iconst_1        
	//*  11   23:icmple          75
		{
			View view = getChildAt(1);
	//   12   26:aload_0         
	//   13   27:iconst_1        
	//   14   28:invokevirtual   #263 <Method View getChildAt(int)>
	//   15   31:astore          7
			if(view != null)
	//*  16   33:aload           7
	//*  17   35:ifnull          75
			{
				boolean flag1;
				if(!mDragHelper.isViewUnder(view, (int)motionevent.getX(), (int)motionevent.getY()))
	//*  18   38:aload_0         
	//*  19   39:getfield        #171 <Field ViewDragHelper mDragHelper>
	//*  20   42:aload           7
	//*  21   44:aload_1         
	//*  22   45:invokevirtual   #512 <Method float MotionEvent.getX()>
	//*  23   48:f2i             
	//*  24   49:aload_1         
	//*  25   50:invokevirtual   #515 <Method float MotionEvent.getY()>
	//*  26   53:f2i             
	//*  27   54:invokevirtual   #519 <Method boolean ViewDragHelper.isViewUnder(View, int, int)>
	//*  28   57:ifne            66
					flag1 = true;
	//   29   60:iconst_1        
	//   30   61:istore          6
				else
	//*  31   63:goto            69
					flag1 = false;
	//   32   66:iconst_0        
	//   33   67:istore          6
				mPreservedOpenState = flag1;
	//   34   69:aload_0         
	//   35   70:iload           6
	//   36   72:putfield        #184 <Field boolean mPreservedOpenState>
			}
		}
		if(!mCanSlide || mIsUnableToDrag && i != 0)
	//*  37   75:aload_0         
	//*  38   76:getfield        #321 <Field boolean mCanSlide>
	//*  39   79:ifeq            94
	//*  40   82:aload_0         
	//*  41   83:getfield        #521 <Field boolean mIsUnableToDrag>
	//*  42   86:ifeq            107
	//*  43   89:iload           4
	//*  44   91:ifeq            107
		{
			mDragHelper.cancel();
	//   45   94:aload_0         
	//   46   95:getfield        #171 <Field ViewDragHelper mDragHelper>
	//   47   98:invokevirtual   #524 <Method void ViewDragHelper.cancel()>
			return super.onInterceptTouchEvent(motionevent);
	//   48  101:aload_0         
	//   49  102:aload_1         
	//   50  103:invokespecial   #526 <Method boolean ViewGroup.onInterceptTouchEvent(MotionEvent)>
	//   51  106:ireturn         
		}
		if(i == 3 || i == 1)
	//*  52  107:iload           4
	//*  53  109:iconst_3        
	//*  54  110:icmpeq          119
	//*  55  113:iload           4
	//*  56  115:iconst_1        
	//*  57  116:icmpne          128
		{
			mDragHelper.cancel();
	//   58  119:aload_0         
	//   59  120:getfield        #171 <Field ViewDragHelper mDragHelper>
	//   60  123:invokevirtual   #524 <Method void ViewDragHelper.cancel()>
			return false;
	//   61  126:iconst_0        
	//   62  127:ireturn         
		}
		boolean flag = false;
	//   63  128:iconst_0        
	//   64  129:istore          5
		switch(i)
	//*  65  131:iload           4
		{
	//*  66  133:lookupswitch    2: default 160
	//	               0: 167
	//	               2: 235
		default:
			i = ((int) (flag));
	//   67  160:iload           5
	//   68  162:istore          4
			break;

	//*  69  164:goto            306
		case 0: // '\0'
			mIsUnableToDrag = false;
	//   70  167:aload_0         
	//   71  168:iconst_0        
	//   72  169:putfield        #521 <Field boolean mIsUnableToDrag>
			float f = motionevent.getX();
	//   73  172:aload_1         
	//   74  173:invokevirtual   #512 <Method float MotionEvent.getX()>
	//   75  176:fstore_2        
			float f2 = motionevent.getY();
	//   76  177:aload_1         
	//   77  178:invokevirtual   #515 <Method float MotionEvent.getY()>
	//   78  181:fstore_3        
			mInitialMotionX = f;
	//   79  182:aload_0         
	//   80  183:fload_2         
	//   81  184:putfield        #528 <Field float mInitialMotionX>
			mInitialMotionY = f2;
	//   82  187:aload_0         
	//   83  188:fload_3         
	//   84  189:putfield        #530 <Field float mInitialMotionY>
			i = ((int) (flag));
	//   85  192:iload           5
	//   86  194:istore          4
			if(mDragHelper.isViewUnder(mSlideableView, (int)f, (int)f2))
	//*  87  196:aload_0         
	//*  88  197:getfield        #171 <Field ViewDragHelper mDragHelper>
	//*  89  200:aload_0         
	//*  90  201:getfield        #247 <Field View mSlideableView>
	//*  91  204:fload_2         
	//*  92  205:f2i             
	//*  93  206:fload_3         
	//*  94  207:f2i             
	//*  95  208:invokevirtual   #519 <Method boolean ViewDragHelper.isViewUnder(View, int, int)>
	//*  96  211:ifeq            306
			{
				i = ((int) (flag));
	//   97  214:iload           5
	//   98  216:istore          4
				if(isDimmed(mSlideableView))
	//*  99  218:aload_0         
	//* 100  219:aload_0         
	//* 101  220:getfield        #247 <Field View mSlideableView>
	//* 102  223:invokevirtual   #532 <Method boolean isDimmed(View)>
	//* 103  226:ifeq            306
					i = 1;
	//  104  229:iconst_1        
	//  105  230:istore          4
			}
			break;

	//* 106  232:goto            306
		case 2: // '\002'
			float f3 = motionevent.getX();
	//  107  235:aload_1         
	//  108  236:invokevirtual   #512 <Method float MotionEvent.getX()>
	//  109  239:fstore_3        
			float f1 = motionevent.getY();
	//  110  240:aload_1         
	//  111  241:invokevirtual   #515 <Method float MotionEvent.getY()>
	//  112  244:fstore_2        
			f3 = Math.abs(f3 - mInitialMotionX);
	//  113  245:fload_3         
	//  114  246:aload_0         
	//  115  247:getfield        #528 <Field float mInitialMotionX>
	//  116  250:fsub            
	//  117  251:invokestatic    #536 <Method float Math.abs(float)>
	//  118  254:fstore_3        
			f1 = Math.abs(f1 - mInitialMotionY);
	//  119  255:fload_2         
	//  120  256:aload_0         
	//  121  257:getfield        #530 <Field float mInitialMotionY>
	//  122  260:fsub            
	//  123  261:invokestatic    #536 <Method float Math.abs(float)>
	//  124  264:fstore_2        
			i = ((int) (flag));
	//  125  265:iload           5
	//  126  267:istore          4
			if(f3 > (float)mDragHelper.getTouchSlop())
	//* 127  269:fload_3         
	//* 128  270:aload_0         
	//* 129  271:getfield        #171 <Field ViewDragHelper mDragHelper>
	//* 130  274:invokevirtual   #539 <Method int ViewDragHelper.getTouchSlop()>
	//* 131  277:i2f             
	//* 132  278:fcmpl           
	//* 133  279:ifle            306
			{
				i = ((int) (flag));
	//  134  282:iload           5
	//  135  284:istore          4
				if(f1 > f3)
	//* 136  286:fload_2         
	//* 137  287:fload_3         
	//* 138  288:fcmpl           
	//* 139  289:ifle            306
				{
					mDragHelper.cancel();
	//  140  292:aload_0         
	//  141  293:getfield        #171 <Field ViewDragHelper mDragHelper>
	//  142  296:invokevirtual   #524 <Method void ViewDragHelper.cancel()>
					mIsUnableToDrag = true;
	//  143  299:aload_0         
	//  144  300:iconst_1        
	//  145  301:putfield        #521 <Field boolean mIsUnableToDrag>
					return false;
	//  146  304:iconst_0        
	//  147  305:ireturn         
				}
			}
			break;
		}
		return mDragHelper.shouldInterceptTouchEvent(motionevent) || i;
	//  148  306:aload_0         
	//  149  307:getfield        #171 <Field ViewDragHelper mDragHelper>
	//  150  310:aload_1         
	//  151  311:invokevirtual   #542 <Method boolean ViewDragHelper.shouldInterceptTouchEvent(MotionEvent)>
	//  152  314:ifne            322
	//  153  317:iload           4
	//  154  319:ifeq            324
	//  155  322:iconst_1        
	//  156  323:ireturn         
	//  157  324:iconst_0        
	//  158  325:ireturn         
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		boolean flag1 = isLayoutRtlSupport();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #245 <Method boolean isLayoutRtlSupport()>
	//    2    4:istore          14
		if(flag1)
	//*   3    6:iload           14
	//*   4    8:ifeq            22
			mDragHelper.setEdgeTrackingEnabled(2);
	//    5   11:aload_0         
	//    6   12:getfield        #171 <Field ViewDragHelper mDragHelper>
	//    7   15:iconst_2        
	//    8   16:invokevirtual   #547 <Method void ViewDragHelper.setEdgeTrackingEnabled(int)>
		else
	//*   9   19:goto            30
			mDragHelper.setEdgeTrackingEnabled(1);
	//   10   22:aload_0         
	//   11   23:getfield        #171 <Field ViewDragHelper mDragHelper>
	//   12   26:iconst_1        
	//   13   27:invokevirtual   #547 <Method void ViewDragHelper.setEdgeTrackingEnabled(int)>
		int k1 = k - i;
	//   14   30:iload           4
	//   15   32:iload_2         
	//   16   33:isub            
	//   17   34:istore          9
		if(flag1)
	//*  18   36:iload           14
	//*  19   38:ifeq            49
			j = getPaddingRight();
	//   20   41:aload_0         
	//   21   42:invokevirtual   #550 <Method int getPaddingRight()>
	//   22   45:istore_3        
		else
	//*  23   46:goto            54
			j = getPaddingLeft();
	//   24   49:aload_0         
	//   25   50:invokevirtual   #553 <Method int getPaddingLeft()>
	//   26   53:istore_3        
		if(flag1)
	//*  27   54:iload           14
	//*  28   56:ifeq            68
			k = getPaddingLeft();
	//   29   59:aload_0         
	//   30   60:invokevirtual   #553 <Method int getPaddingLeft()>
	//   31   63:istore          4
		else
	//*  32   65:goto            74
			k = getPaddingRight();
	//   33   68:aload_0         
	//   34   69:invokevirtual   #550 <Method int getPaddingRight()>
	//   35   72:istore          4
		int i2 = getPaddingTop();
	//   36   74:aload_0         
	//   37   75:invokevirtual   #556 <Method int getPaddingTop()>
	//   38   78:istore          11
		int l1 = getChildCount();
	//   39   80:aload_0         
	//   40   81:invokevirtual   #259 <Method int getChildCount()>
	//   41   84:istore          10
		i = j;
	//   42   86:iload_3         
	//   43   87:istore_2        
		if(mFirstLayout)
	//*  44   88:aload_0         
	//*  45   89:getfield        #108 <Field boolean mFirstLayout>
	//*  46   92:ifeq            124
		{
			float f;
			if(mCanSlide && mPreservedOpenState)
	//*  47   95:aload_0         
	//*  48   96:getfield        #321 <Field boolean mCanSlide>
	//*  49   99:ifeq            115
	//*  50  102:aload_0         
	//*  51  103:getfield        #184 <Field boolean mPreservedOpenState>
	//*  52  106:ifeq            115
				f = 1.0F;
	//   53  109:fconst_1        
	//   54  110:fstore          6
			else
	//*  55  112:goto            118
				f = 0.0F;
	//   56  115:fconst_0        
	//   57  116:fstore          6
			mSlideOffset = f;
	//   58  118:aload_0         
	//   59  119:fload           6
	//   60  121:putfield        #355 <Field float mSlideOffset>
		}
		for(l = 0; l < l1; l++)
	//*  61  124:iconst_0        
	//*  62  125:istore          5
	//*  63  127:iload           5
	//*  64  129:iload           10
	//*  65  131:icmpge          434
		{
			View view = getChildAt(l);
	//   66  134:aload_0         
	//   67  135:iload           5
	//   68  137:invokevirtual   #263 <Method View getChildAt(int)>
	//   69  140:astore          15
			if(view.getVisibility() == 8)
	//*  70  142:aload           15
	//*  71  144:invokevirtual   #559 <Method int View.getVisibility()>
	//*  72  147:bipush          8
	//*  73  149:icmpne          155
				continue;
	//   74  152:goto            425
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   75  155:aload           15
	//   76  157:invokevirtual   #192 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   77  160:checkcast       #15  <Class SlidingPaneLayout$LayoutParams>
	//   78  163:astore          16
			int j2 = view.getMeasuredWidth();
	//   79  165:aload           15
	//   80  167:invokevirtual   #562 <Method int View.getMeasuredWidth()>
	//   81  170:istore          12
			int j1 = 0;
	//   82  172:iconst_0        
	//   83  173:istore          8
			int i1;
			if(layoutparams.slideable)
	//*  84  175:aload           16
	//*  85  177:getfield        #386 <Field boolean SlidingPaneLayout$LayoutParams.slideable>
	//*  86  180:ifeq            321
			{
				i1 = layoutparams.leftMargin;
	//   87  183:aload           16
	//   88  185:getfield        #256 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//   89  188:istore          7
				int k2 = layoutparams.rightMargin;
	//   90  190:aload           16
	//   91  192:getfield        #253 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//   92  195:istore          13
				k2 = Math.min(i, k1 - k - mOverhangSize) - j - (i1 + k2);
	//   93  197:iload_2         
	//   94  198:iload           9
	//   95  200:iload           4
	//   96  202:isub            
	//   97  203:aload_0         
	//   98  204:getfield        #139 <Field int mOverhangSize>
	//   99  207:isub            
	//  100  208:invokestatic    #405 <Method int Math.min(int, int)>
	//  101  211:iload_3         
	//  102  212:isub            
	//  103  213:iload           7
	//  104  215:iload           13
	//  105  217:iadd            
	//  106  218:isub            
	//  107  219:istore          13
				mSlideRange = k2;
	//  108  221:aload_0         
	//  109  222:iload           13
	//  110  224:putfield        #564 <Field int mSlideRange>
				if(flag1)
	//* 111  227:iload           14
	//* 112  229:ifeq            242
					i1 = layoutparams.rightMargin;
	//  113  232:aload           16
	//  114  234:getfield        #253 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//  115  237:istore          7
				else
	//* 116  239:goto            249
					i1 = layoutparams.leftMargin;
	//  117  242:aload           16
	//  118  244:getfield        #256 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//  119  247:istore          7
				if(j + i1 + k2 + j2 / 2 > k1 - k)
	//* 120  249:iload_3         
	//* 121  250:iload           7
	//* 122  252:iadd            
	//* 123  253:iload           13
	//* 124  255:iadd            
	//* 125  256:iload           12
	//* 126  258:iconst_2        
	//* 127  259:idiv            
	//* 128  260:iadd            
	//* 129  261:iload           9
	//* 130  263:iload           4
	//* 131  265:isub            
	//* 132  266:icmple          274
					flag = true;
	//  133  269:iconst_1        
	//  134  270:istore_1        
				else
	//* 135  271:goto            276
					flag = false;
	//  136  274:iconst_0        
	//  137  275:istore_1        
				layoutparams.dimWhenOffset = flag;
	//  138  276:aload           16
	//  139  278:iload_1         
	//  140  279:putfield        #250 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
				k2 = (int)((float)k2 * mSlideOffset);
	//  141  282:iload           13
	//  142  284:i2f             
	//  143  285:aload_0         
	//  144  286:getfield        #355 <Field float mSlideOffset>
	//  145  289:fmul            
	//  146  290:f2i             
	//  147  291:istore          13
				j += k2 + i1;
	//  148  293:iload_3         
	//  149  294:iload           13
	//  150  296:iload           7
	//  151  298:iadd            
	//  152  299:iadd            
	//  153  300:istore_3        
				mSlideOffset = (float)k2 / (float)mSlideRange;
	//  154  301:aload_0         
	//  155  302:iload           13
	//  156  304:i2f             
	//  157  305:aload_0         
	//  158  306:getfield        #564 <Field int mSlideRange>
	//  159  309:i2f             
	//  160  310:fdiv            
	//  161  311:putfield        #355 <Field float mSlideOffset>
				i1 = j1;
	//  162  314:iload           8
	//  163  316:istore          7
			} else
	//* 164  318:goto            361
			if(mCanSlide && mParallaxBy != 0)
	//* 165  321:aload_0         
	//* 166  322:getfield        #321 <Field boolean mCanSlide>
	//* 167  325:ifeq            355
	//* 168  328:aload_0         
	//* 169  329:getfield        #267 <Field int mParallaxBy>
	//* 170  332:ifeq            355
			{
				i1 = (int)((1.0F - mSlideOffset) * (float)mParallaxBy);
	//  171  335:fconst_1        
	//  172  336:aload_0         
	//  173  337:getfield        #355 <Field float mSlideOffset>
	//  174  340:fsub            
	//  175  341:aload_0         
	//  176  342:getfield        #267 <Field int mParallaxBy>
	//  177  345:i2f             
	//  178  346:fmul            
	//  179  347:f2i             
	//  180  348:istore          7
				j = i;
	//  181  350:iload_2         
	//  182  351:istore_3        
			} else
	//* 183  352:goto            361
			{
				j = i;
	//  184  355:iload_2         
	//  185  356:istore_3        
				i1 = j1;
	//  186  357:iload           8
	//  187  359:istore          7
			}
			if(flag1)
	//* 188  361:iload           14
	//* 189  363:ifeq            385
			{
				i1 = (k1 - j) + i1;
	//  190  366:iload           9
	//  191  368:iload_3         
	//  192  369:isub            
	//  193  370:iload           7
	//  194  372:iadd            
	//  195  373:istore          7
				j1 = i1 - j2;
	//  196  375:iload           7
	//  197  377:iload           12
	//  198  379:isub            
	//  199  380:istore          8
			} else
	//* 200  382:goto            398
			{
				j1 = j - i1;
	//  201  385:iload_3         
	//  202  386:iload           7
	//  203  388:isub            
	//  204  389:istore          8
				i1 = j1 + j2;
	//  205  391:iload           8
	//  206  393:iload           12
	//  207  395:iadd            
	//  208  396:istore          7
			}
			view.layout(j1, i2, i1, i2 + view.getMeasuredHeight());
	//  209  398:aload           15
	//  210  400:iload           8
	//  211  402:iload           11
	//  212  404:iload           7
	//  213  406:iload           11
	//  214  408:aload           15
	//  215  410:invokevirtual   #567 <Method int View.getMeasuredHeight()>
	//  216  413:iadd            
	//  217  414:invokevirtual   #570 <Method void View.layout(int, int, int, int)>
			i += view.getWidth();
	//  218  417:iload_2         
	//  219  418:aload           15
	//  220  420:invokevirtual   #573 <Method int View.getWidth()>
	//  221  423:iadd            
	//  222  424:istore_2        
		}

	//  223  425:iload           5
	//  224  427:iconst_1        
	//  225  428:iadd            
	//  226  429:istore          5
	//* 227  431:goto            127
		if(mFirstLayout)
	//* 228  434:aload_0         
	//* 229  435:getfield        #108 <Field boolean mFirstLayout>
	//* 230  438:ifeq            535
		{
			if(mCanSlide)
	//* 231  441:aload_0         
	//* 232  442:getfield        #321 <Field boolean mCanSlide>
	//* 233  445:ifeq            498
			{
				if(mParallaxBy != 0)
	//* 234  448:aload_0         
	//* 235  449:getfield        #267 <Field int mParallaxBy>
	//* 236  452:ifeq            463
					parallaxOtherViews(mSlideOffset);
	//  237  455:aload_0         
	//  238  456:aload_0         
	//  239  457:getfield        #355 <Field float mSlideOffset>
	//  240  460:invokespecial   #575 <Method void parallaxOtherViews(float)>
				if(((LayoutParams)mSlideableView.getLayoutParams()).dimWhenOffset)
	//* 241  463:aload_0         
	//* 242  464:getfield        #247 <Field View mSlideableView>
	//* 243  467:invokevirtual   #192 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 244  470:checkcast       #15  <Class SlidingPaneLayout$LayoutParams>
	//* 245  473:getfield        #250 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
	//* 246  476:ifeq            527
					dimChildView(mSlideableView, mSlideOffset, mSliderFadeColor);
	//  247  479:aload_0         
	//  248  480:aload_0         
	//  249  481:getfield        #247 <Field View mSlideableView>
	//  250  484:aload_0         
	//  251  485:getfield        #355 <Field float mSlideOffset>
	//  252  488:aload_0         
	//  253  489:getfield        #106 <Field int mSliderFadeColor>
	//  254  492:invokespecial   #275 <Method void dimChildView(View, float, int)>
			} else
	//* 255  495:goto            527
			{
				for(i = 0; i < l1; i++)
	//* 256  498:iconst_0        
	//* 257  499:istore_2        
	//* 258  500:iload_2         
	//* 259  501:iload           10
	//* 260  503:icmpge          527
					dimChildView(getChildAt(i), 0.0F, mSliderFadeColor);
	//  261  506:aload_0         
	//  262  507:aload_0         
	//  263  508:iload_2         
	//  264  509:invokevirtual   #263 <Method View getChildAt(int)>
	//  265  512:fconst_0        
	//  266  513:aload_0         
	//  267  514:getfield        #106 <Field int mSliderFadeColor>
	//  268  517:invokespecial   #275 <Method void dimChildView(View, float, int)>

	//  269  520:iload_2         
	//  270  521:iconst_1        
	//  271  522:iadd            
	//  272  523:istore_2        
			}
	//* 273  524:goto            500
			updateObscuredViewsVisibility(mSlideableView);
	//  274  527:aload_0         
	//  275  528:aload_0         
	//  276  529:getfield        #247 <Field View mSlideableView>
	//  277  532:invokevirtual   #578 <Method void updateObscuredViewsVisibility(View)>
		}
		mFirstLayout = false;
	//  278  535:aload_0         
	//  279  536:iconst_0        
	//  280  537:putfield        #108 <Field boolean mFirstLayout>
	//  281  540:return          
	}

	protected void onMeasure(int i, int j)
	{
		int l1 = android.view.View.MeasureSpec.getMode(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #585 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore          8
		int k = android.view.View.MeasureSpec.getSize(i);
	//    3    6:iload_1         
	//    4    7:invokestatic    #588 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5   10:istore          5
		int l = android.view.View.MeasureSpec.getMode(j);
	//    6   12:iload_2         
	//    7   13:invokestatic    #585 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    8   16:istore          6
		j = android.view.View.MeasureSpec.getSize(j);
	//    9   18:iload_2         
	//   10   19:invokestatic    #588 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   11   22:istore_2        
		int k1;
		int i2;
		if(l1 != 0x40000000)
	//*  12   23:iload           8
	//*  13   25:ldc2            #589 <Int 0x40000000>
	//*  14   28:icmpeq          99
		{
			if(isInEditMode())
	//*  15   31:aload_0         
	//*  16   32:invokevirtual   #592 <Method boolean isInEditMode()>
	//*  17   35:ifeq            88
			{
				if(l1 == 0x80000000)
	//*  18   38:iload           8
	//*  19   40:ldc2            #593 <Int 0x80000000>
	//*  20   43:icmpne          59
				{
					k1 = k;
	//   21   46:iload           5
	//   22   48:istore          7
					i2 = l;
	//   23   50:iload           6
	//   24   52:istore          9
					i = j;
	//   25   54:iload_2         
	//   26   55:istore_1        
				} else
	//*  27   56:goto            163
				{
					k1 = k;
	//   28   59:iload           5
	//   29   61:istore          7
					i2 = l;
	//   30   63:iload           6
	//   31   65:istore          9
					i = j;
	//   32   67:iload_2         
	//   33   68:istore_1        
					if(l1 == 0)
	//*  34   69:iload           8
	//*  35   71:ifne            163
					{
						k1 = 300;
	//   36   74:sipush          300
	//   37   77:istore          7
						i2 = l;
	//   38   79:iload           6
	//   39   81:istore          9
						i = j;
	//   40   83:iload_2         
	//   41   84:istore_1        
					}
				}
			} else
	//*  42   85:goto            163
			{
				throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
	//   43   88:new             #595 <Class IllegalStateException>
	//   44   91:dup             
	//   45   92:ldc2            #597 <String "Width must have an exact value or MATCH_PARENT">
	//   46   95:invokespecial   #600 <Method void IllegalStateException(String)>
	//   47   98:athrow          
			}
		} else
		{
			k1 = k;
	//   48   99:iload           5
	//   49  101:istore          7
			i2 = l;
	//   50  103:iload           6
	//   51  105:istore          9
			i = j;
	//   52  107:iload_2         
	//   53  108:istore_1        
			if(l == 0)
	//*  54  109:iload           6
	//*  55  111:ifne            163
				if(isInEditMode())
	//*  56  114:aload_0         
	//*  57  115:invokevirtual   #592 <Method boolean isInEditMode()>
	//*  58  118:ifeq            152
				{
					k1 = k;
	//   59  121:iload           5
	//   60  123:istore          7
					i2 = l;
	//   61  125:iload           6
	//   62  127:istore          9
					i = j;
	//   63  129:iload_2         
	//   64  130:istore_1        
					if(l == 0)
	//*  65  131:iload           6
	//*  66  133:ifne            163
					{
						i2 = 0x80000000;
	//   67  136:ldc2            #593 <Int 0x80000000>
	//   68  139:istore          9
						i = 300;
	//   69  141:sipush          300
	//   70  144:istore_1        
						k1 = k;
	//   71  145:iload           5
	//   72  147:istore          7
					}
				} else
	//*  73  149:goto            163
				{
					throw new IllegalStateException("Height must not be UNSPECIFIED");
	//   74  152:new             #595 <Class IllegalStateException>
	//   75  155:dup             
	//   76  156:ldc2            #602 <String "Height must not be UNSPECIFIED">
	//   77  159:invokespecial   #600 <Method void IllegalStateException(String)>
	//   78  162:athrow          
				}
		}
		k = 0;
	//   79  163:iconst_0        
	//   80  164:istore          5
		j = -1;
	//   81  166:iconst_m1       
	//   82  167:istore_2        
		switch(i2)
	//*  83  168:iload           9
		{
	//*  84  170:lookupswitch    2: default 196
	//	               -2147483648: 218
	//	               1073741824: 199
	//*  85  196:goto            230
		case 1073741824: 
			k = i - getPaddingTop() - getPaddingBottom();
	//   86  199:iload_1         
	//   87  200:aload_0         
	//   88  201:invokevirtual   #556 <Method int getPaddingTop()>
	//   89  204:isub            
	//   90  205:aload_0         
	//   91  206:invokevirtual   #605 <Method int getPaddingBottom()>
	//   92  209:isub            
	//   93  210:istore          5
			j = k;
	//   94  212:iload           5
	//   95  214:istore_2        
			break;

	//*  96  215:goto            230
		case -2147483648: 
			j = i - getPaddingTop() - getPaddingBottom();
	//   97  218:iload_1         
	//   98  219:aload_0         
	//   99  220:invokevirtual   #556 <Method int getPaddingTop()>
	//  100  223:isub            
	//  101  224:aload_0         
	//  102  225:invokevirtual   #605 <Method int getPaddingBottom()>
	//  103  228:isub            
	//  104  229:istore_2        
			break;
		}
		float f1 = 0.0F;
	//  105  230:fconst_0        
	//  106  231:fstore          4
		boolean flag = false;
	//  107  233:iconst_0        
	//  108  234:istore          15
		int i3 = k1 - getPaddingLeft() - getPaddingRight();
	//  109  236:iload           7
	//  110  238:aload_0         
	//  111  239:invokevirtual   #553 <Method int getPaddingLeft()>
	//  112  242:isub            
	//  113  243:aload_0         
	//  114  244:invokevirtual   #550 <Method int getPaddingRight()>
	//  115  247:isub            
	//  116  248:istore          11
		l1 = i3;
	//  117  250:iload           11
	//  118  252:istore          8
		int j3 = getChildCount();
	//  119  254:aload_0         
	//  120  255:invokevirtual   #259 <Method int getChildCount()>
	//  121  258:istore          12
		if(j3 > 2)
	//* 122  260:iload           12
	//* 123  262:iconst_2        
	//* 124  263:icmple          275
			Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
	//  125  266:ldc1            #52  <String "SlidingPaneLayout">
	//  126  268:ldc2            #607 <String "onMeasure: More than two child views are not supported.">
	//  127  271:invokestatic    #448 <Method int Log.e(String, String)>
	//  128  274:pop             
		mSlideableView = null;
	//  129  275:aload_0         
	//  130  276:aconst_null     
	//  131  277:putfield        #247 <Field View mSlideableView>
		for(int k2 = 0; k2 < j3; k2++)
	//* 132  280:iconst_0        
	//* 133  281:istore          10
	//* 134  283:iload           10
	//* 135  285:iload           12
	//* 136  287:icmpge          627
		{
			View view = getChildAt(k2);
	//  137  290:aload_0         
	//  138  291:iload           10
	//  139  293:invokevirtual   #263 <Method View getChildAt(int)>
	//  140  296:astore          17
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//  141  298:aload           17
	//  142  300:invokevirtual   #192 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  143  303:checkcast       #15  <Class SlidingPaneLayout$LayoutParams>
	//  144  306:astore          18
			if(view.getVisibility() == 8)
	//* 145  308:aload           17
	//* 146  310:invokevirtual   #559 <Method int View.getVisibility()>
	//* 147  313:bipush          8
	//* 148  315:icmpne          327
			{
				layoutparams.dimWhenOffset = false;
	//  149  318:aload           18
	//  150  320:iconst_0        
	//  151  321:putfield        #250 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
				continue;
	//  152  324:goto            618
			}
			float f = f1;
	//  153  327:fload           4
	//  154  329:fstore_3        
			if(layoutparams.weight > 0.0F)
	//* 155  330:aload           18
	//* 156  332:getfield        #610 <Field float SlidingPaneLayout$LayoutParams.weight>
	//* 157  335:fconst_0        
	//* 158  336:fcmpl           
	//* 159  337:ifle            364
			{
				f1 += layoutparams.weight;
	//  160  340:fload           4
	//  161  342:aload           18
	//  162  344:getfield        #610 <Field float SlidingPaneLayout$LayoutParams.weight>
	//  163  347:fadd            
	//  164  348:fstore          4
				f = f1;
	//  165  350:fload           4
	//  166  352:fstore_3        
				if(layoutparams.width == 0)
	//* 167  353:aload           18
	//* 168  355:getfield        #613 <Field int SlidingPaneLayout$LayoutParams.width>
	//* 169  358:ifne            364
					continue;
	//  170  361:goto            618
			}
			i = layoutparams.leftMargin + layoutparams.rightMargin;
	//  171  364:aload           18
	//  172  366:getfield        #256 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//  173  369:aload           18
	//  174  371:getfield        #253 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//  175  374:iadd            
	//  176  375:istore_1        
			if(layoutparams.width == -2)
	//* 177  376:aload           18
	//* 178  378:getfield        #613 <Field int SlidingPaneLayout$LayoutParams.width>
	//* 179  381:bipush          -2
	//* 180  383:icmpne          400
				i = android.view.View.MeasureSpec.makeMeasureSpec(i3 - i, 0x80000000);
	//  181  386:iload           11
	//  182  388:iload_1         
	//  183  389:isub            
	//  184  390:ldc2            #593 <Int 0x80000000>
	//  185  393:invokestatic    #616 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  186  396:istore_1        
			else
	//* 187  397:goto            435
			if(layoutparams.width == -1)
	//* 188  400:aload           18
	//* 189  402:getfield        #613 <Field int SlidingPaneLayout$LayoutParams.width>
	//* 190  405:iconst_m1       
	//* 191  406:icmpne          423
				i = android.view.View.MeasureSpec.makeMeasureSpec(i3 - i, 0x40000000);
	//  192  409:iload           11
	//  193  411:iload_1         
	//  194  412:isub            
	//  195  413:ldc2            #589 <Int 0x40000000>
	//  196  416:invokestatic    #616 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  197  419:istore_1        
			else
	//* 198  420:goto            435
				i = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.width, 0x40000000);
	//  199  423:aload           18
	//  200  425:getfield        #613 <Field int SlidingPaneLayout$LayoutParams.width>
	//  201  428:ldc2            #589 <Int 0x40000000>
	//  202  431:invokestatic    #616 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  203  434:istore_1        
			int i1;
			if(layoutparams.height == -2)
	//* 204  435:aload           18
	//* 205  437:getfield        #619 <Field int SlidingPaneLayout$LayoutParams.height>
	//* 206  440:bipush          -2
	//* 207  442:icmpne          457
				i1 = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x80000000);
	//  208  445:iload_2         
	//  209  446:ldc2            #593 <Int 0x80000000>
	//  210  449:invokestatic    #616 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  211  452:istore          6
			else
	//* 212  454:goto            491
			if(layoutparams.height == -1)
	//* 213  457:aload           18
	//* 214  459:getfield        #619 <Field int SlidingPaneLayout$LayoutParams.height>
	//* 215  462:iconst_m1       
	//* 216  463:icmpne          478
				i1 = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
	//  217  466:iload_2         
	//  218  467:ldc2            #589 <Int 0x40000000>
	//  219  470:invokestatic    #616 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  220  473:istore          6
			else
	//* 221  475:goto            491
				i1 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000);
	//  222  478:aload           18
	//  223  480:getfield        #619 <Field int SlidingPaneLayout$LayoutParams.height>
	//  224  483:ldc2            #589 <Int 0x40000000>
	//  225  486:invokestatic    #616 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  226  489:istore          6
			view.measure(i, i1);
	//  227  491:aload           17
	//  228  493:iload_1         
	//  229  494:iload           6
	//  230  496:invokevirtual   #622 <Method void View.measure(int, int)>
			i1 = view.getMeasuredWidth();
	//  231  499:aload           17
	//  232  501:invokevirtual   #562 <Method int View.getMeasuredWidth()>
	//  233  504:istore          6
			int k3 = view.getMeasuredHeight();
	//  234  506:aload           17
	//  235  508:invokevirtual   #567 <Method int View.getMeasuredHeight()>
	//  236  511:istore          13
			i = k;
	//  237  513:iload           5
	//  238  515:istore_1        
			if(i2 == 0x80000000)
	//* 239  516:iload           9
	//* 240  518:ldc2            #593 <Int 0x80000000>
	//* 241  521:icmpne          541
			{
				i = k;
	//  242  524:iload           5
	//  243  526:istore_1        
				if(k3 > k)
	//* 244  527:iload           13
	//* 245  529:iload           5
	//* 246  531:icmple          541
					i = Math.min(k3, j);
	//  247  534:iload           13
	//  248  536:iload_2         
	//  249  537:invokestatic    #405 <Method int Math.min(int, int)>
	//  250  540:istore_1        
			}
			i1 = l1 - i1;
	//  251  541:iload           8
	//  252  543:iload           6
	//  253  545:isub            
	//  254  546:istore          6
			boolean flag1;
			if(i1 < 0)
	//* 255  548:iload           6
	//* 256  550:ifge            559
				flag1 = true;
	//  257  553:iconst_1        
	//  258  554:istore          16
			else
	//* 259  556:goto            562
				flag1 = false;
	//  260  559:iconst_0        
	//  261  560:istore          16
			layoutparams.slideable = flag1;
	//  262  562:aload           18
	//  263  564:iload           16
	//  264  566:putfield        #386 <Field boolean SlidingPaneLayout$LayoutParams.slideable>
			flag1 = flag | flag1;
	//  265  569:iload           15
	//  266  571:iload           16
	//  267  573:ior             
	//  268  574:istore          16
			k = i;
	//  269  576:iload_1         
	//  270  577:istore          5
			f1 = f;
	//  271  579:fload_3         
	//  272  580:fstore          4
			flag = flag1;
	//  273  582:iload           16
	//  274  584:istore          15
			l1 = i1;
	//  275  586:iload           6
	//  276  588:istore          8
			if(layoutparams.slideable)
	//* 277  590:aload           18
	//* 278  592:getfield        #386 <Field boolean SlidingPaneLayout$LayoutParams.slideable>
	//* 279  595:ifeq            618
			{
				mSlideableView = view;
	//  280  598:aload_0         
	//  281  599:aload           17
	//  282  601:putfield        #247 <Field View mSlideableView>
				l1 = i1;
	//  283  604:iload           6
	//  284  606:istore          8
				flag = flag1;
	//  285  608:iload           16
	//  286  610:istore          15
				f1 = f;
	//  287  612:fload_3         
	//  288  613:fstore          4
				k = i;
	//  289  615:iload_1         
	//  290  616:istore          5
			}
		}

	//  291  618:iload           10
	//  292  620:iconst_1        
	//  293  621:iadd            
	//  294  622:istore          10
	//* 295  624:goto            283
		if(flag || f1 > 0.0F)
	//* 296  627:iload           15
	//* 297  629:ifne            639
	//* 298  632:fload           4
	//* 299  634:fconst_0        
	//* 300  635:fcmpl           
	//* 301  636:ifle            1052
		{
			int l2 = i3 - mOverhangSize;
	//  302  639:iload           11
	//  303  641:aload_0         
	//  304  642:getfield        #139 <Field int mOverhangSize>
	//  305  645:isub            
	//  306  646:istore          10
			for(int j1 = 0; j1 < j3; j1++)
	//* 307  648:iconst_0        
	//* 308  649:istore          6
	//* 309  651:iload           6
	//* 310  653:iload           12
	//* 311  655:icmpge          1052
			{
				View view1 = getChildAt(j1);
	//  312  658:aload_0         
	//  313  659:iload           6
	//  314  661:invokevirtual   #263 <Method View getChildAt(int)>
	//  315  664:astore          17
				if(view1.getVisibility() == 8)
	//* 316  666:aload           17
	//* 317  668:invokevirtual   #559 <Method int View.getVisibility()>
	//* 318  671:bipush          8
	//* 319  673:icmpne          679
					continue;
	//  320  676:goto            1043
				LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//  321  679:aload           17
	//  322  681:invokevirtual   #192 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  323  684:checkcast       #15  <Class SlidingPaneLayout$LayoutParams>
	//  324  687:astore          18
				if(view1.getVisibility() == 8)
	//* 325  689:aload           17
	//* 326  691:invokevirtual   #559 <Method int View.getVisibility()>
	//* 327  694:bipush          8
	//* 328  696:icmpne          702
					continue;
	//  329  699:goto            1043
				if(layoutparams1.width == 0 && layoutparams1.weight > 0.0F)
	//* 330  702:aload           18
	//* 331  704:getfield        #613 <Field int SlidingPaneLayout$LayoutParams.width>
	//* 332  707:ifne            725
	//* 333  710:aload           18
	//* 334  712:getfield        #610 <Field float SlidingPaneLayout$LayoutParams.weight>
	//* 335  715:fconst_0        
	//* 336  716:fcmpl           
	//* 337  717:ifle            725
					i = 1;
	//  338  720:iconst_1        
	//  339  721:istore_1        
				else
	//* 340  722:goto            727
					i = 0;
	//  341  725:iconst_0        
	//  342  726:istore_1        
				int j2;
				if(i != 0)
	//* 343  727:iload_1         
	//* 344  728:ifeq            737
					j2 = 0;
	//  345  731:iconst_0        
	//  346  732:istore          9
				else
	//* 347  734:goto            744
					j2 = view1.getMeasuredWidth();
	//  348  737:aload           17
	//  349  739:invokevirtual   #562 <Method int View.getMeasuredWidth()>
	//  350  742:istore          9
				if(flag && view1 != mSlideableView)
	//* 351  744:iload           15
	//* 352  746:ifeq            872
	//* 353  749:aload           17
	//* 354  751:aload_0         
	//* 355  752:getfield        #247 <Field View mSlideableView>
	//* 356  755:if_acmpeq       872
				{
					if(layoutparams1.width >= 0 || j2 <= l2 && layoutparams1.weight <= 0.0F)
						continue;
	//  357  758:aload           18
	//  358  760:getfield        #613 <Field int SlidingPaneLayout$LayoutParams.width>
	//  359  763:ifge            1043
	//  360  766:iload           9
	//  361  768:iload           10
	//  362  770:icmpgt          783
	//  363  773:aload           18
	//  364  775:getfield        #610 <Field float SlidingPaneLayout$LayoutParams.weight>
	//  365  778:fconst_0        
	//  366  779:fcmpl           
	//  367  780:ifle            1043
					if(i != 0)
	//* 368  783:iload_1         
	//* 369  784:ifeq            843
					{
						if(layoutparams1.height == -2)
	//* 370  787:aload           18
	//* 371  789:getfield        #619 <Field int SlidingPaneLayout$LayoutParams.height>
	//* 372  792:bipush          -2
	//* 373  794:icmpne          808
							i = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x80000000);
	//  374  797:iload_2         
	//  375  798:ldc2            #593 <Int 0x80000000>
	//  376  801:invokestatic    #616 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  377  804:istore_1        
						else
	//* 378  805:goto            855
						if(layoutparams1.height == -1)
	//* 379  808:aload           18
	//* 380  810:getfield        #619 <Field int SlidingPaneLayout$LayoutParams.height>
	//* 381  813:iconst_m1       
	//* 382  814:icmpne          828
							i = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
	//  383  817:iload_2         
	//  384  818:ldc2            #589 <Int 0x40000000>
	//  385  821:invokestatic    #616 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  386  824:istore_1        
						else
	//* 387  825:goto            855
							i = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams1.height, 0x40000000);
	//  388  828:aload           18
	//  389  830:getfield        #619 <Field int SlidingPaneLayout$LayoutParams.height>
	//  390  833:ldc2            #589 <Int 0x40000000>
	//  391  836:invokestatic    #616 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  392  839:istore_1        
					} else
	//* 393  840:goto            855
					{
						i = android.view.View.MeasureSpec.makeMeasureSpec(view1.getMeasuredHeight(), 0x40000000);
	//  394  843:aload           17
	//  395  845:invokevirtual   #567 <Method int View.getMeasuredHeight()>
	//  396  848:ldc2            #589 <Int 0x40000000>
	//  397  851:invokestatic    #616 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  398  854:istore_1        
					}
					view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(l2, 0x40000000), i);
	//  399  855:aload           17
	//  400  857:iload           10
	//  401  859:ldc2            #589 <Int 0x40000000>
	//  402  862:invokestatic    #616 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  403  865:iload_1         
	//  404  866:invokevirtual   #622 <Method void View.measure(int, int)>
					continue;
	//  405  869:goto            1043
				}
				if(layoutparams1.weight <= 0.0F)
					continue;
	//  406  872:aload           18
	//  407  874:getfield        #610 <Field float SlidingPaneLayout$LayoutParams.weight>
	//  408  877:fconst_0        
	//  409  878:fcmpl           
	//  410  879:ifle            1043
				if(layoutparams1.width == 0)
	//* 411  882:aload           18
	//* 412  884:getfield        #613 <Field int SlidingPaneLayout$LayoutParams.width>
	//* 413  887:ifne            946
				{
					if(layoutparams1.height == -2)
	//* 414  890:aload           18
	//* 415  892:getfield        #619 <Field int SlidingPaneLayout$LayoutParams.height>
	//* 416  895:bipush          -2
	//* 417  897:icmpne          911
						i = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x80000000);
	//  418  900:iload_2         
	//  419  901:ldc2            #593 <Int 0x80000000>
	//  420  904:invokestatic    #616 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  421  907:istore_1        
					else
	//* 422  908:goto            958
					if(layoutparams1.height == -1)
	//* 423  911:aload           18
	//* 424  913:getfield        #619 <Field int SlidingPaneLayout$LayoutParams.height>
	//* 425  916:iconst_m1       
	//* 426  917:icmpne          931
						i = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
	//  427  920:iload_2         
	//  428  921:ldc2            #589 <Int 0x40000000>
	//  429  924:invokestatic    #616 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  430  927:istore_1        
					else
	//* 431  928:goto            958
						i = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams1.height, 0x40000000);
	//  432  931:aload           18
	//  433  933:getfield        #619 <Field int SlidingPaneLayout$LayoutParams.height>
	//  434  936:ldc2            #589 <Int 0x40000000>
	//  435  939:invokestatic    #616 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  436  942:istore_1        
				} else
	//* 437  943:goto            958
				{
					i = android.view.View.MeasureSpec.makeMeasureSpec(view1.getMeasuredHeight(), 0x40000000);
	//  438  946:aload           17
	//  439  948:invokevirtual   #567 <Method int View.getMeasuredHeight()>
	//  440  951:ldc2            #589 <Int 0x40000000>
	//  441  954:invokestatic    #616 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  442  957:istore_1        
				}
				if(flag)
	//* 443  958:iload           15
	//* 444  960:ifeq            1007
				{
					int l3 = i3 - (layoutparams1.leftMargin + layoutparams1.rightMargin);
	//  445  963:iload           11
	//  446  965:aload           18
	//  447  967:getfield        #256 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//  448  970:aload           18
	//  449  972:getfield        #253 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//  450  975:iadd            
	//  451  976:isub            
	//  452  977:istore          13
					int j4 = android.view.View.MeasureSpec.makeMeasureSpec(l3, 0x40000000);
	//  453  979:iload           13
	//  454  981:ldc2            #589 <Int 0x40000000>
	//  455  984:invokestatic    #616 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  456  987:istore          14
					if(j2 != l3)
	//* 457  989:iload           9
	//* 458  991:iload           13
	//* 459  993:icmpeq          1004
						view1.measure(j4, i);
	//  460  996:aload           17
	//  461  998:iload           14
	//  462 1000:iload_1         
	//  463 1001:invokevirtual   #622 <Method void View.measure(int, int)>
				} else
	//* 464 1004:goto            1043
				{
					int i4 = Math.max(0, l1);
	//  465 1007:iconst_0        
	//  466 1008:iload           8
	//  467 1010:invokestatic    #399 <Method int Math.max(int, int)>
	//  468 1013:istore          13
					view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(j2 + (int)((layoutparams1.weight * (float)i4) / f1), 0x40000000), i);
	//  469 1015:aload           17
	//  470 1017:iload           9
	//  471 1019:aload           18
	//  472 1021:getfield        #610 <Field float SlidingPaneLayout$LayoutParams.weight>
	//  473 1024:iload           13
	//  474 1026:i2f             
	//  475 1027:fmul            
	//  476 1028:fload           4
	//  477 1030:fdiv            
	//  478 1031:f2i             
	//  479 1032:iadd            
	//  480 1033:ldc2            #589 <Int 0x40000000>
	//  481 1036:invokestatic    #616 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  482 1039:iload_1         
	//  483 1040:invokevirtual   #622 <Method void View.measure(int, int)>
				}
			}

	//  484 1043:iload           6
	//  485 1045:iconst_1        
	//  486 1046:iadd            
	//  487 1047:istore          6
		}
	//* 488 1049:goto            651
		setMeasuredDimension(k1, getPaddingTop() + k + getPaddingBottom());
	//  489 1052:aload_0         
	//  490 1053:iload           7
	//  491 1055:aload_0         
	//  492 1056:invokevirtual   #556 <Method int getPaddingTop()>
	//  493 1059:iload           5
	//  494 1061:iadd            
	//  495 1062:aload_0         
	//  496 1063:invokevirtual   #605 <Method int getPaddingBottom()>
	//  497 1066:iadd            
	//  498 1067:invokevirtual   #625 <Method void setMeasuredDimension(int, int)>
		mCanSlide = flag;
	//  499 1070:aload_0         
	//  500 1071:iload           15
	//  501 1073:putfield        #321 <Field boolean mCanSlide>
		if(mDragHelper.getViewDragState() != 0 && !flag)
	//* 502 1076:aload_0         
	//* 503 1077:getfield        #171 <Field ViewDragHelper mDragHelper>
	//* 504 1080:invokevirtual   #628 <Method int ViewDragHelper.getViewDragState()>
	//* 505 1083:ifeq            1098
	//* 506 1086:iload           15
	//* 507 1088:ifne            1098
			mDragHelper.abort();
	//  508 1091:aload_0         
	//  509 1092:getfield        #171 <Field ViewDragHelper mDragHelper>
	//  510 1095:invokevirtual   #336 <Method void ViewDragHelper.abort()>
	//  511 1098:return          
	}

	void onPanelDragged(int i)
	{
		if(mSlideableView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #247 <Field View mSlideableView>
	//*   2    4:ifnonnull       13
		{
			mSlideOffset = 0.0F;
	//    3    7:aload_0         
	//    4    8:fconst_0        
	//    5    9:putfield        #355 <Field float mSlideOffset>
			return;
	//    6   12:return          
		}
		boolean flag = isLayoutRtlSupport();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #245 <Method boolean isLayoutRtlSupport()>
	//    9   17:istore          4
		LayoutParams layoutparams = (LayoutParams)mSlideableView.getLayoutParams();
	//   10   19:aload_0         
	//   11   20:getfield        #247 <Field View mSlideableView>
	//   12   23:invokevirtual   #192 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   13   26:checkcast       #15  <Class SlidingPaneLayout$LayoutParams>
	//   14   29:astore          5
		int j = mSlideableView.getWidth();
	//   15   31:aload_0         
	//   16   32:getfield        #247 <Field View mSlideableView>
	//   17   35:invokevirtual   #573 <Method int View.getWidth()>
	//   18   38:istore_2        
		if(flag)
	//*  19   39:iload           4
	//*  20   41:ifeq            56
			i = getWidth() - i - j;
	//   21   44:aload_0         
	//   22   45:invokevirtual   #630 <Method int getWidth()>
	//   23   48:iload_1         
	//   24   49:isub            
	//   25   50:iload_2         
	//   26   51:isub            
	//   27   52:istore_1        
	//*  28   53:goto            56
		if(flag)
	//*  29   56:iload           4
	//*  30   58:ifeq            69
			j = getPaddingRight();
	//   31   61:aload_0         
	//   32   62:invokevirtual   #550 <Method int getPaddingRight()>
	//   33   65:istore_2        
		else
	//*  34   66:goto            74
			j = getPaddingLeft();
	//   35   69:aload_0         
	//   36   70:invokevirtual   #553 <Method int getPaddingLeft()>
	//   37   73:istore_2        
		int k;
		if(flag)
	//*  38   74:iload           4
	//*  39   76:ifeq            88
			k = layoutparams.rightMargin;
	//   40   79:aload           5
	//   41   81:getfield        #253 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//   42   84:istore_3        
		else
	//*  43   85:goto            94
			k = layoutparams.leftMargin;
	//   44   88:aload           5
	//   45   90:getfield        #256 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//   46   93:istore_3        
		mSlideOffset = (float)(i - (j + k)) / (float)mSlideRange;
	//   47   94:aload_0         
	//   48   95:iload_1         
	//   49   96:iload_2         
	//   50   97:iload_3         
	//   51   98:iadd            
	//   52   99:isub            
	//   53  100:i2f             
	//   54  101:aload_0         
	//   55  102:getfield        #564 <Field int mSlideRange>
	//   56  105:i2f             
	//   57  106:fdiv            
	//   58  107:putfield        #355 <Field float mSlideOffset>
		if(mParallaxBy != 0)
	//*  59  110:aload_0         
	//*  60  111:getfield        #267 <Field int mParallaxBy>
	//*  61  114:ifeq            125
			parallaxOtherViews(mSlideOffset);
	//   62  117:aload_0         
	//   63  118:aload_0         
	//   64  119:getfield        #355 <Field float mSlideOffset>
	//   65  122:invokespecial   #575 <Method void parallaxOtherViews(float)>
		if(layoutparams.dimWhenOffset)
	//*  66  125:aload           5
	//*  67  127:getfield        #250 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
	//*  68  130:ifeq            149
			dimChildView(mSlideableView, mSlideOffset, mSliderFadeColor);
	//   69  133:aload_0         
	//   70  134:aload_0         
	//   71  135:getfield        #247 <Field View mSlideableView>
	//   72  138:aload_0         
	//   73  139:getfield        #355 <Field float mSlideOffset>
	//   74  142:aload_0         
	//   75  143:getfield        #106 <Field int mSliderFadeColor>
	//   76  146:invokespecial   #275 <Method void dimChildView(View, float, int)>
		dispatchOnPanelSlide(mSlideableView);
	//   77  149:aload_0         
	//   78  150:aload_0         
	//   79  151:getfield        #247 <Field View mSlideableView>
	//   80  154:invokevirtual   #632 <Method void dispatchOnPanelSlide(View)>
	//   81  157:return          
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
	//    5    9:invokespecial   #636 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
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
	//   12   20:invokevirtual   #640 <Method Parcelable SlidingPaneLayout$SavedState.getSuperState()>
	//   13   23:invokespecial   #636 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
		if(((SavedState) (parcelable)).isOpen)
	//*  14   26:aload_1         
	//*  15   27:getfield        #642 <Field boolean SlidingPaneLayout$SavedState.isOpen>
	//*  16   30:ifeq            41
			openPane();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #644 <Method boolean openPane()>
	//   19   37:pop             
		else
	//*  20   38:goto            46
			closePane();
	//   21   41:aload_0         
	//   22   42:invokevirtual   #646 <Method boolean closePane()>
	//   23   45:pop             
		mPreservedOpenState = ((SavedState) (parcelable)).isOpen;
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:getfield        #642 <Field boolean SlidingPaneLayout$SavedState.isOpen>
	//   27   51:putfield        #184 <Field boolean mPreservedOpenState>
	//   28   54:return          
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #21  <Class SlidingPaneLayout$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #649 <Method Parcelable ViewGroup.onSaveInstanceState()>
	//    4    8:invokespecial   #651 <Method void SlidingPaneLayout$SavedState(Parcelable)>
	//    5   11:astore_2        
		boolean flag;
		if(isSlideable())
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #653 <Method boolean isSlideable()>
	//*   8   16:ifeq            27
			flag = isOpen();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #655 <Method boolean isOpen()>
	//   11   23:istore_1        
		else
	//*  12   24:goto            32
			flag = mPreservedOpenState;
	//   13   27:aload_0         
	//   14   28:getfield        #184 <Field boolean mPreservedOpenState>
	//   15   31:istore_1        
		savedstate.isOpen = flag;
	//   16   32:aload_2         
	//   17   33:iload_1         
	//   18   34:putfield        #642 <Field boolean SlidingPaneLayout$SavedState.isOpen>
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
	//    5    6:invokespecial   #658 <Method void ViewGroup.onSizeChanged(int, int, int, int)>
		if(i != k)
	//*   6    9:iload_1         
	//*   7   10:iload_3         
	//*   8   11:icmpeq          19
			mFirstLayout = true;
	//    9   14:aload_0         
	//   10   15:iconst_1        
	//   11   16:putfield        #108 <Field boolean mFirstLayout>
	//   12   19:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(!mCanSlide)
	//*   0    0:aload_0         
	//*   1    1:getfield        #321 <Field boolean mCanSlide>
	//*   2    4:ifne            13
			return super.onTouchEvent(motionevent);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #661 <Method boolean ViewGroup.onTouchEvent(MotionEvent)>
	//    6   12:ireturn         
		mDragHelper.processTouchEvent(motionevent);
	//    7   13:aload_0         
	//    8   14:getfield        #171 <Field ViewDragHelper mDragHelper>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #665 <Method void ViewDragHelper.processTouchEvent(MotionEvent)>
		switch(motionevent.getActionMasked())
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #508 <Method int MotionEvent.getActionMasked()>
		{
	//*  13   25:lookupswitch    2: default 52
	//	               0: 54
	//	               1: 76
		default:
			return true;
	//   14   52:iconst_1        
	//   15   53:ireturn         

		case 0: // '\0'
			float f = motionevent.getX();
	//   16   54:aload_1         
	//   17   55:invokevirtual   #512 <Method float MotionEvent.getX()>
	//   18   58:fstore_2        
			float f2 = motionevent.getY();
	//   19   59:aload_1         
	//   20   60:invokevirtual   #515 <Method float MotionEvent.getY()>
	//   21   63:fstore_3        
			mInitialMotionX = f;
	//   22   64:aload_0         
	//   23   65:fload_2         
	//   24   66:putfield        #528 <Field float mInitialMotionX>
			mInitialMotionY = f2;
	//   25   69:aload_0         
	//   26   70:fload_3         
	//   27   71:putfield        #530 <Field float mInitialMotionY>
			return true;
	//   28   74:iconst_1        
	//   29   75:ireturn         

		case 1: // '\001'
			break;
		}
		if(isDimmed(mSlideableView))
	//*  30   76:aload_0         
	//*  31   77:aload_0         
	//*  32   78:getfield        #247 <Field View mSlideableView>
	//*  33   81:invokevirtual   #532 <Method boolean isDimmed(View)>
	//*  34   84:ifeq            171
		{
			float f1 = motionevent.getX();
	//   35   87:aload_1         
	//   36   88:invokevirtual   #512 <Method float MotionEvent.getX()>
	//   37   91:fstore_2        
			float f3 = motionevent.getY();
	//   38   92:aload_1         
	//   39   93:invokevirtual   #515 <Method float MotionEvent.getY()>
	//   40   96:fstore_3        
			float f4 = f1 - mInitialMotionX;
	//   41   97:fload_2         
	//   42   98:aload_0         
	//   43   99:getfield        #528 <Field float mInitialMotionX>
	//   44  102:fsub            
	//   45  103:fstore          4
			float f5 = f3 - mInitialMotionY;
	//   46  105:fload_3         
	//   47  106:aload_0         
	//   48  107:getfield        #530 <Field float mInitialMotionY>
	//   49  110:fsub            
	//   50  111:fstore          5
			int i = mDragHelper.getTouchSlop();
	//   51  113:aload_0         
	//   52  114:getfield        #171 <Field ViewDragHelper mDragHelper>
	//   53  117:invokevirtual   #539 <Method int ViewDragHelper.getTouchSlop()>
	//   54  120:istore          6
			if(f4 * f4 + f5 * f5 < (float)(i * i) && mDragHelper.isViewUnder(mSlideableView, (int)f1, (int)f3))
	//*  55  122:fload           4
	//*  56  124:fload           4
	//*  57  126:fmul            
	//*  58  127:fload           5
	//*  59  129:fload           5
	//*  60  131:fmul            
	//*  61  132:fadd            
	//*  62  133:iload           6
	//*  63  135:iload           6
	//*  64  137:imul            
	//*  65  138:i2f             
	//*  66  139:fcmpg           
	//*  67  140:ifge            171
	//*  68  143:aload_0         
	//*  69  144:getfield        #171 <Field ViewDragHelper mDragHelper>
	//*  70  147:aload_0         
	//*  71  148:getfield        #247 <Field View mSlideableView>
	//*  72  151:fload_2         
	//*  73  152:f2i             
	//*  74  153:fload_3         
	//*  75  154:f2i             
	//*  76  155:invokevirtual   #519 <Method boolean ViewDragHelper.isViewUnder(View, int, int)>
	//*  77  158:ifeq            171
				closePane(mSlideableView, 0);
	//   78  161:aload_0         
	//   79  162:aload_0         
	//   80  163:getfield        #247 <Field View mSlideableView>
	//   81  166:iconst_0        
	//   82  167:invokespecial   #328 <Method boolean closePane(View, int)>
	//   83  170:pop             
		}
		return true;
	//   84  171:iconst_1        
	//   85  172:ireturn         
	}

	public boolean openPane()
	{
		return openPane(mSlideableView, 0);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #247 <Field View mSlideableView>
	//    3    5:iconst_0        
	//    4    6:invokespecial   #667 <Method boolean openPane(View, int)>
	//    5    9:ireturn         
	}

	public void requestChildFocus(View view, View view1)
	{
		super.requestChildFocus(view, view1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #671 <Method void ViewGroup.requestChildFocus(View, View)>
		if(!isInTouchMode() && !mCanSlide)
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #674 <Method boolean isInTouchMode()>
	//*   6   10:ifne            40
	//*   7   13:aload_0         
	//*   8   14:getfield        #321 <Field boolean mCanSlide>
	//*   9   17:ifne            40
		{
			boolean flag;
			if(view == mSlideableView)
	//*  10   20:aload_1         
	//*  11   21:aload_0         
	//*  12   22:getfield        #247 <Field View mSlideableView>
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
	//   21   37:putfield        #184 <Field boolean mPreservedOpenState>
		}
	//   22   40:return          
	}

	void setAllChildrenVisible()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		for(int j = getChildCount(); i < j; i++)
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #259 <Method int getChildCount()>
	//*   4    6:istore_2        
	//*   5    7:iload_1         
	//*   6    8:iload_2         
	//*   7    9:icmpge          38
		{
			View view = getChildAt(i);
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:invokevirtual   #263 <Method View getChildAt(int)>
	//   11   17:astore_3        
			if(view.getVisibility() == 4)
	//*  12   18:aload_3         
	//*  13   19:invokevirtual   #559 <Method int View.getVisibility()>
	//*  14   22:iconst_4        
	//*  15   23:icmpne          31
				view.setVisibility(0);
	//   16   26:aload_3         
	//   17   27:iconst_0        
	//   18   28:invokevirtual   #678 <Method void View.setVisibility(int)>
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
	//    2    2:putfield        #273 <Field int mCoveredFadeColor>
	//    3    5:return          
	}

	public void setPanelSlideListener(PanelSlideListener panelslidelistener)
	{
		mPanelSlideListener = panelslidelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #342 <Field SlidingPaneLayout$PanelSlideListener mPanelSlideListener>
	//    3    5:return          
	}

	public void setParallaxDistance(int i)
	{
		mParallaxBy = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #267 <Field int mParallaxBy>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #686 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setShadowDrawable(Drawable drawable)
	{
		setShadowDrawableLeft(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #691 <Method void setShadowDrawableLeft(Drawable)>
	//    3    5:return          
	}

	public void setShadowDrawableLeft(Drawable drawable)
	{
		mShadowDrawableLeft = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #367 <Field Drawable mShadowDrawableLeft>
	//    3    5:return          
	}

	public void setShadowDrawableRight(Drawable drawable)
	{
		mShadowDrawableRight = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #365 <Field Drawable mShadowDrawableRight>
	//    3    5:return          
	}

	public void setShadowResource(int i)
	{
		setShadowDrawable(getResources().getDrawable(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #695 <Method Resources getResources()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #699 <Method Drawable Resources.getDrawable(int)>
	//    5    9:invokevirtual   #701 <Method void setShadowDrawable(Drawable)>
	//    6   12:return          
	}

	public void setShadowResourceLeft(int i)
	{
		setShadowDrawableLeft(ContextCompat.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #459 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #707 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    5    9:invokevirtual   #691 <Method void setShadowDrawableLeft(Drawable)>
	//    6   12:return          
	}

	public void setShadowResourceRight(int i)
	{
		setShadowDrawableRight(ContextCompat.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #459 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #707 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    5    9:invokevirtual   #710 <Method void setShadowDrawableRight(Drawable)>
	//    6   12:return          
	}

	public void setSliderFadeColor(int i)
	{
		mSliderFadeColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #106 <Field int mSliderFadeColor>
	//    3    5:return          
	}

	public void smoothSlideClosed()
	{
		closePane();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #646 <Method boolean closePane()>
	//    2    4:pop             
	//    3    5:return          
	}

	public void smoothSlideOpen()
	{
		openPane();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #644 <Method boolean openPane()>
	//    2    4:pop             
	//    3    5:return          
	}

	boolean smoothSlideTo(float f, int i)
	{
		if(!mCanSlide)
	//*   0    0:aload_0         
	//*   1    1:getfield        #321 <Field boolean mCanSlide>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		boolean flag = isLayoutRtlSupport();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #245 <Method boolean isLayoutRtlSupport()>
	//    7   13:istore          5
		LayoutParams layoutparams = (LayoutParams)mSlideableView.getLayoutParams();
	//    8   15:aload_0         
	//    9   16:getfield        #247 <Field View mSlideableView>
	//   10   19:invokevirtual   #192 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   11   22:checkcast       #15  <Class SlidingPaneLayout$LayoutParams>
	//   12   25:astore          6
		if(flag)
	//*  13   27:iload           5
	//*  14   29:ifeq            79
		{
			i = getPaddingRight();
	//   15   32:aload_0         
	//   16   33:invokevirtual   #550 <Method int getPaddingRight()>
	//   17   36:istore_2        
			int j = layoutparams.rightMargin;
	//   18   37:aload           6
	//   19   39:getfield        #253 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//   20   42:istore_3        
			int k = mSlideableView.getWidth();
	//   21   43:aload_0         
	//   22   44:getfield        #247 <Field View mSlideableView>
	//   23   47:invokevirtual   #573 <Method int View.getWidth()>
	//   24   50:istore          4
			i = (int)((float)getWidth() - ((float)(i + j) + (float)mSlideRange * f + (float)k));
	//   25   52:aload_0         
	//   26   53:invokevirtual   #630 <Method int getWidth()>
	//   27   56:i2f             
	//   28   57:iload_2         
	//   29   58:iload_3         
	//   30   59:iadd            
	//   31   60:i2f             
	//   32   61:aload_0         
	//   33   62:getfield        #564 <Field int mSlideRange>
	//   34   65:i2f             
	//   35   66:fload_1         
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
			i = (int)((float)(getPaddingLeft() + layoutparams.leftMargin) + (float)mSlideRange * f);
	//   45   79:aload_0         
	//   46   80:invokevirtual   #553 <Method int getPaddingLeft()>
	//   47   83:aload           6
	//   48   85:getfield        #256 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//   49   88:iadd            
	//   50   89:i2f             
	//   51   90:aload_0         
	//   52   91:getfield        #564 <Field int mSlideRange>
	//   53   94:i2f             
	//   54   95:fload_1         
	//   55   96:fmul            
	//   56   97:fadd            
	//   57   98:f2i             
	//   58   99:istore_2        
		}
		if(mDragHelper.smoothSlideViewTo(mSlideableView, i, mSlideableView.getTop()))
	//*  59  100:aload_0         
	//*  60  101:getfield        #171 <Field ViewDragHelper mDragHelper>
	//*  61  104:aload_0         
	//*  62  105:getfield        #247 <Field View mSlideableView>
	//*  63  108:iload_2         
	//*  64  109:aload_0         
	//*  65  110:getfield        #247 <Field View mSlideableView>
	//*  66  113:invokevirtual   #308 <Method int View.getTop()>
	//*  67  116:invokevirtual   #716 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//*  68  119:ifeq            132
		{
			setAllChildrenVisible();
	//   69  122:aload_0         
	//   70  123:invokevirtual   #718 <Method void setAllChildrenVisible()>
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   71  126:aload_0         
	//   72  127:invokestatic    #339 <Method void ViewCompat.postInvalidateOnAnimation(View)>
			return true;
	//   73  130:iconst_1        
	//   74  131:ireturn         
		} else
		{
			return false;
	//   75  132:iconst_0        
	//   76  133:ireturn         
		}
	}

	void updateObscuredViewsVisibility(View view)
	{
		boolean flag = isLayoutRtlSupport();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #245 <Method boolean isLayoutRtlSupport()>
	//    2    4:istore          17
		int i;
		if(flag)
	//*   3    6:iload           17
	//*   4    8:ifeq            24
			i = getWidth() - getPaddingRight();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #630 <Method int getWidth()>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #550 <Method int getPaddingRight()>
	//    9   19:isub            
	//   10   20:istore_2        
		else
	//*  11   21:goto            29
			i = getPaddingLeft();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #553 <Method int getPaddingLeft()>
	//   14   28:istore_2        
		int j;
		if(flag)
	//*  15   29:iload           17
	//*  16   31:ifeq            42
			j = getPaddingLeft();
	//   17   34:aload_0         
	//   18   35:invokevirtual   #553 <Method int getPaddingLeft()>
	//   19   38:istore_3        
		else
	//*  20   39:goto            52
			j = getWidth() - getPaddingRight();
	//   21   42:aload_0         
	//   22   43:invokevirtual   #630 <Method int getWidth()>
	//   23   46:aload_0         
	//   24   47:invokevirtual   #550 <Method int getPaddingRight()>
	//   25   50:isub            
	//   26   51:istore_3        
		int i2 = getPaddingTop();
	//   27   52:aload_0         
	//   28   53:invokevirtual   #556 <Method int getPaddingTop()>
	//   29   56:istore          10
		int j2 = getHeight();
	//   30   58:aload_0         
	//   31   59:invokevirtual   #721 <Method int getHeight()>
	//   32   62:istore          11
		int k2 = getPaddingBottom();
	//   33   64:aload_0         
	//   34   65:invokevirtual   #605 <Method int getPaddingBottom()>
	//   35   68:istore          12
		int k;
		int l;
		int i1;
		int j1;
		if(view != null && viewIsOpaque(view))
	//*  36   70:aload_1         
	//*  37   71:ifnull          108
	//*  38   74:aload_1         
	//*  39   75:invokestatic    #723 <Method boolean viewIsOpaque(View)>
	//*  40   78:ifeq            108
		{
			k = view.getLeft();
	//   41   81:aload_1         
	//   42   82:invokevirtual   #302 <Method int View.getLeft()>
	//   43   85:istore          4
			l = view.getRight();
	//   44   87:aload_1         
	//   45   88:invokevirtual   #305 <Method int View.getRight()>
	//   46   91:istore          5
			i1 = view.getTop();
	//   47   93:aload_1         
	//   48   94:invokevirtual   #308 <Method int View.getTop()>
	//   49   97:istore          6
			j1 = view.getBottom();
	//   50   99:aload_1         
	//   51  100:invokevirtual   #311 <Method int View.getBottom()>
	//   52  103:istore          7
		} else
	//*  53  105:goto            120
		{
			j1 = 0;
	//   54  108:iconst_0        
	//   55  109:istore          7
			i1 = 0;
	//   56  111:iconst_0        
	//   57  112:istore          6
			l = 0;
	//   58  114:iconst_0        
	//   59  115:istore          5
			k = 0;
	//   60  117:iconst_0        
	//   61  118:istore          4
		}
		int k1 = 0;
	//   62  120:iconst_0        
	//   63  121:istore          8
		for(int l2 = getChildCount(); k1 < l2; k1++)
	//*  64  123:aload_0         
	//*  65  124:invokevirtual   #259 <Method int getChildCount()>
	//*  66  127:istore          13
	//*  67  129:iload           8
	//*  68  131:iload           13
	//*  69  133:icmpge          296
		{
			View view1 = getChildAt(k1);
	//   70  136:aload_0         
	//   71  137:iload           8
	//   72  139:invokevirtual   #263 <Method View getChildAt(int)>
	//   73  142:astore          18
			if(view1 == view)
	//*  74  144:aload           18
	//*  75  146:aload_1         
	//*  76  147:if_acmpne       151
				return;
	//   77  150:return          
			if(view1.getVisibility() == 8)
	//*  78  151:aload           18
	//*  79  153:invokevirtual   #559 <Method int View.getVisibility()>
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
	//   92  182:invokevirtual   #302 <Method int View.getLeft()>
	//   93  185:invokestatic    #399 <Method int Math.max(int, int)>
	//   94  188:istore          14
			int j3 = Math.max(i2, view1.getTop());
	//   95  190:iload           10
	//   96  192:aload           18
	//   97  194:invokevirtual   #308 <Method int View.getTop()>
	//   98  197:invokestatic    #399 <Method int Math.max(int, int)>
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
	//  109  220:invokevirtual   #305 <Method int View.getRight()>
	//  110  223:invokestatic    #405 <Method int Math.min(int, int)>
	//  111  226:istore          9
			int k3 = Math.min(j2 - k2, view1.getBottom());
	//  112  228:iload           11
	//  113  230:iload           12
	//  114  232:isub            
	//  115  233:aload           18
	//  116  235:invokevirtual   #311 <Method int View.getBottom()>
	//  117  238:invokestatic    #405 <Method int Math.min(int, int)>
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
	//  138  284:invokevirtual   #678 <Method void View.setVisibility(int)>
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
	static final SlidingPanelLayoutImpl IMPL;
	private static final int MIN_FLING_VELOCITY = 400;
	private static final String TAG = "SlidingPaneLayout";
	private boolean mCanSlide;
	private int mCoveredFadeColor;
	final ViewDragHelper mDragHelper;
	private boolean mFirstLayout;
	private float mInitialMotionX;
	private float mInitialMotionY;
	boolean mIsUnableToDrag;
	private final int mOverhangSize;
	private PanelSlideListener mPanelSlideListener;
	private int mParallaxBy;
	private float mParallaxOffset;
	final ArrayList mPostedRunnables;
	boolean mPreservedOpenState;
	private Drawable mShadowDrawableLeft;
	private Drawable mShadowDrawableRight;
	float mSlideOffset;
	int mSlideRange;
	View mSlideableView;
	private int mSliderFadeColor;
	private final Rect mTmpRect;

	static 
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #88  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_0        
		if(i >= 17)
	//*   2    4:iload_0         
	//*   3    5:bipush          17
	//*   4    7:icmplt          21
			IMPL = ((SlidingPanelLayoutImpl) (new SlidingPanelLayoutImplJBMR1()));
	//    5   10:new             #38  <Class SlidingPaneLayout$SlidingPanelLayoutImplJBMR1>
	//    6   13:dup             
	//    7   14:invokespecial   #91  <Method void SlidingPaneLayout$SlidingPanelLayoutImplJBMR1()>
	//    8   17:putstatic       #93  <Field SlidingPaneLayout$SlidingPanelLayoutImpl IMPL>
	//    9   20:return          
		else
		if(i >= 16)
	//*  10   21:iload_0         
	//*  11   22:bipush          16
	//*  12   24:icmplt          38
			IMPL = ((SlidingPanelLayoutImpl) (new SlidingPanelLayoutImplJB()));
	//   13   27:new             #35  <Class SlidingPaneLayout$SlidingPanelLayoutImplJB>
	//   14   30:dup             
	//   15   31:invokespecial   #94  <Method void SlidingPaneLayout$SlidingPanelLayoutImplJB()>
	//   16   34:putstatic       #93  <Field SlidingPaneLayout$SlidingPanelLayoutImpl IMPL>
	//   17   37:return          
		else
			IMPL = ((SlidingPanelLayoutImpl) (new SlidingPanelLayoutImplBase()));
	//   18   38:new             #32  <Class SlidingPaneLayout$SlidingPanelLayoutImplBase>
	//   19   41:dup             
	//   20   42:invokespecial   #95  <Method void SlidingPaneLayout$SlidingPanelLayoutImplBase()>
	//   21   45:putstatic       #93  <Field SlidingPaneLayout$SlidingPanelLayoutImpl IMPL>
	//*  22   48:return          
	}
}
