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
label0:
			{
				if(mDragHelper.getViewDragState() == 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #13  <Field SlidingPaneLayout this$0>
		//*   2    4:getfield        #77  <Field ViewDragHelper SlidingPaneLayout.mDragHelper>
		//*   3    7:invokevirtual   #92  <Method int ViewDragHelper.getViewDragState()>
		//*   4   10:ifne            61
				{
					if(mSlideOffset != 0.0F)
						break label0;
		//    5   13:aload_0         
		//    6   14:getfield        #13  <Field SlidingPaneLayout this$0>
		//    7   17:getfield        #96  <Field float SlidingPaneLayout.mSlideOffset>
		//    8   20:fconst_0        
		//    9   21:fcmpl           
		//   10   22:ifne            62
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
				}
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
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #29  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #31  <Class SlidingPaneLayout$LayoutParams>
		//    3    7:astore          6
			if(!isLayoutRtlSupport()) goto _L2; else goto _L1
		//    4    9:aload_0         
		//    5   10:getfield        #13  <Field SlidingPaneLayout this$0>
		//    6   13:invokevirtual   #35  <Method boolean SlidingPaneLayout.isLayoutRtlSupport()>
		//    7   16:ifeq            131
_L1:
			int i;
label0:
			{
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
						break label0;
		//   21   44:fload_2         
		//   22   45:fconst_0        
		//   23   46:fcmpl           
		//   24   47:ifne            79
					i = j;
		//   25   50:iload           5
		//   26   52:istore          4
					if(mSlideOffset <= 0.5F)
						break label0;
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
_L4:
			mDragHelper.settleCapturedViewAt(i, view.getTop());
		//   52  106:aload_0         
		//   53  107:getfield        #13  <Field SlidingPaneLayout this$0>
		//   54  110:getfield        #77  <Field ViewDragHelper SlidingPaneLayout.mDragHelper>
		//   55  113:iload           4
		//   56  115:aload_1         
		//   57  116:invokevirtual   #69  <Method int View.getTop()>
		//   58  119:invokevirtual   #125 <Method boolean ViewDragHelper.settleCapturedViewAt(int, int)>
		//   59  122:pop             
			invalidate();
		//   60  123:aload_0         
		//   61  124:getfield        #13  <Field SlidingPaneLayout this$0>
		//   62  127:invokevirtual   #118 <Method void SlidingPaneLayout.invalidate()>
			return;
		//   63  130:return          
_L2:
			int l = getPaddingLeft() + layoutparams.leftMargin;
		//   64  131:aload_0         
		//   65  132:getfield        #13  <Field SlidingPaneLayout this$0>
		//   66  135:invokevirtual   #62  <Method int SlidingPaneLayout.getPaddingLeft()>
		//   67  138:aload           6
		//   68  140:getfield        #65  <Field int SlidingPaneLayout$LayoutParams.leftMargin>
		//   69  143:iadd            
		//   70  144:istore          5
			if(f <= 0.0F)
		//*  71  146:fload_2         
		//*  72  147:fconst_0        
		//*  73  148:fcmpl           
		//*  74  149:ifgt            179
			{
				i = l;
		//   75  152:iload           5
		//   76  154:istore          4
				if(f != 0.0F)
					continue; /* Loop/switch isn't completed */
		//   77  156:fload_2         
		//   78  157:fconst_0        
		//   79  158:fcmpl           
		//   80  159:ifne            106
				i = l;
		//   81  162:iload           5
		//   82  164:istore          4
				if(mSlideOffset <= 0.5F)
					continue; /* Loop/switch isn't completed */
		//   83  166:aload_0         
		//   84  167:getfield        #13  <Field SlidingPaneLayout this$0>
		//   85  170:getfield        #96  <Field float SlidingPaneLayout.mSlideOffset>
		//   86  173:ldc1            #121 <Float 0.5F>
		//   87  175:fcmpl           
		//   88  176:ifle            106
			}
			i = l + mSlideRange;
		//   89  179:iload           5
		//   90  181:aload_0         
		//   91  182:getfield        #13  <Field SlidingPaneLayout this$0>
		//   92  185:getfield        #50  <Field int SlidingPaneLayout.mSlideRange>
		//   93  188:iadd            
		//   94  189:istore          4
			if(true) goto _L4; else goto _L3
		//   95  191:goto            106
_L3:
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
		//    3    3:invokespecial   #40  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			if(isOpen)
		//*   4    6:aload_0         
		//*   5    7:getfield        #33  <Field boolean isOpen>
		//*   6   10:ifeq            21
				i = 1;
		//    7   13:iconst_1        
		//    8   14:istore_2        
			else
		//*   9   15:aload_1         
		//*  10   16:iload_2         
		//*  11   17:invokevirtual   #44  <Method void Parcel.writeInt(int)>
		//*  12   20:return          
				i = 0;
		//   13   21:iconst_0        
		//   14   22:istore_2        
			parcel.writeInt(i);
		//*  15   23:goto            15
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
		//*   6   10:ifeq            21
				flag = true;
		//    7   13:iconst_1        
		//    8   14:istore_3        
			else
		//*   9   15:aload_0         
		//*  10   16:iload_3         
		//*  11   17:putfield        #33  <Field boolean isOpen>
		//*  12   20:return          
				flag = false;
		//   13   21:iconst_0        
		//   14   22:istore_3        
			isOpen = flag;
		//*  15   23:goto            15
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
		//*   1    1:getfield        #36  <Field Method mGetDisplayList>
		//*   2    4:ifnull          56
		//*   3    7:aload_0         
		//*   4    8:getfield        #43  <Field Field mRecreateDisplayList>
		//*   5   11:ifnull          56
			{
				try
				{
					mRecreateDisplayList.setBoolean(((Object) (view)), true);
		//    6   14:aload_0         
		//    7   15:getfield        #43  <Field Field mRecreateDisplayList>
		//    8   18:aload_2         
		//    9   19:iconst_1        
		//   10   20:invokevirtual   #70  <Method void Field.setBoolean(Object, boolean)>
					mGetDisplayList.invoke(((Object) (view)), (Object[])null);
		//   11   23:aload_0         
		//   12   24:getfield        #36  <Field Method mGetDisplayList>
		//   13   27:aload_2         
		//   14   28:aconst_null     
		//   15   29:checkcast       #72  <Class Object[]>
		//   16   32:invokevirtual   #78  <Method Object Method.invoke(Object, Object[])>
		//   17   35:pop             
				}
		//*  18   36:aload_0         
		//*  19   37:aload_1         
		//*  20   38:aload_2         
		//*  21   39:invokespecial   #80  <Method void SlidingPaneLayout$SlidingPanelLayoutImplBase.invalidateChildRegion(SlidingPaneLayout, View)>
		//*  22   42:return          
				catch(Exception exception)
		//*  23   43:astore_3        
				{
					Log.e("SlidingPaneLayout", "Error refreshing display list state", ((Throwable) (exception)));
		//   24   44:ldc1            #51  <String "SlidingPaneLayout">
		//   25   46:ldc1            #82  <String "Error refreshing display list state">
		//   26   48:aload_3         
		//   27   49:invokestatic    #59  <Method int Log.e(String, String, Throwable)>
		//   28   52:pop             
				}
				super.invalidateChildRegion(slidingpanelayout, view);
				return;
			} else
		//*  29   53:goto            36
			{
				view.invalidate();
		//   30   56:aload_2         
		//   31   57:invokevirtual   #85  <Method void View.invalidate()>
				return;
		//   32   60:return          
			}
		}

		private Method mGetDisplayList;
		private Field mRecreateDisplayList;

		SlidingPanelLayoutImplJB()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void SlidingPaneLayout$SlidingPanelLayoutImplBase()>
			try
			{
				mGetDisplayList = ((Class) (android/view/View)).getDeclaredMethod("getDisplayList", (Class[])null);
		//    2    4:aload_0         
		//    3    5:ldc1            #24  <Class View>
		//    4    7:ldc1            #26  <String "getDisplayList">
		//    5    9:aconst_null     
		//    6   10:checkcast       #28  <Class Class[]>
		//    7   13:invokevirtual   #34  <Method Method Class.getDeclaredMethod(String, Class[])>
		//    8   16:putfield        #36  <Field Method mGetDisplayList>
			}
		//*   9   19:aload_0         
		//*  10   20:ldc1            #24  <Class View>
		//*  11   22:ldc1            #37  <String "mRecreateDisplayList">
		//*  12   24:invokevirtual   #41  <Method Field Class.getDeclaredField(String)>
		//*  13   27:putfield        #43  <Field Field mRecreateDisplayList>
		//*  14   30:aload_0         
		//*  15   31:getfield        #43  <Field Field mRecreateDisplayList>
		//*  16   34:iconst_1        
		//*  17   35:invokevirtual   #49  <Method void Field.setAccessible(boolean)>
		//*  18   38:return          
			catch(NoSuchMethodException nosuchmethodexception)
		//*  19   39:astore_1        
			{
				Log.e("SlidingPaneLayout", "Couldn't fetch getDisplayList method; dimming won't work right.", ((Throwable) (nosuchmethodexception)));
		//   20   40:ldc1            #51  <String "SlidingPaneLayout">
		//   21   42:ldc1            #53  <String "Couldn't fetch getDisplayList method; dimming won't work right.">
		//   22   44:aload_1         
		//   23   45:invokestatic    #59  <Method int Log.e(String, String, Throwable)>
		//   24   48:pop             
			}
			try
			{
				mRecreateDisplayList = ((Class) (android/view/View)).getDeclaredField("mRecreateDisplayList");
				mRecreateDisplayList.setAccessible(true);
				return;
			}
		//*  25   49:goto            19
			catch(NoSuchFieldException nosuchfieldexception)
		//*  26   52:astore_1        
			{
				Log.e("SlidingPaneLayout", "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", ((Throwable) (nosuchfieldexception)));
		//   27   53:ldc1            #51  <String "SlidingPaneLayout">
		//   28   55:ldc1            #61  <String "Couldn't fetch mRecreateDisplayList field; dimming will be slow.">
		//   29   57:aload_1         
		//   30   58:invokestatic    #59  <Method int Log.e(String, String, Throwable)>
		//   31   61:pop             
			}
		//   32   62:return          
		}
	}

	static class SlidingPanelLayoutImplJBMR1 extends SlidingPanelLayoutImplBase
	{

		public void invalidateChildRegion(SlidingPaneLayout slidingpanelayout, View view)
		{
			ViewCompat.setLayerPaint(view, ((LayoutParams)view.getLayoutParams()).dimPaint);
		//    0    0:aload_2         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #23  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    3    5:checkcast       #25  <Class SlidingPaneLayout$LayoutParams>
		//    4    8:getfield        #29  <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
		//    5   11:invokestatic    #35  <Method void ViewCompat.setLayerPaint(View, Paint)>
		//    6   14:return          
		}

		SlidingPanelLayoutImplJBMR1()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void SlidingPaneLayout$SlidingPanelLayoutImplBase()>
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
		setWillNotDraw(false);
	//   34   65:aload_0         
	//   35   66:iconst_0        
	//   36   67:invokevirtual   #143 <Method void setWillNotDraw(boolean)>
		ViewCompat.setAccessibilityDelegate(((View) (this)), ((AccessibilityDelegateCompat) (new AccessibilityDelegate())));
	//   37   70:aload_0         
	//   38   71:new             #6   <Class SlidingPaneLayout$AccessibilityDelegate>
	//   39   74:dup             
	//   40   75:aload_0         
	//   41   76:invokespecial   #146 <Method void SlidingPaneLayout$AccessibilityDelegate(SlidingPaneLayout)>
	//   42   79:invokestatic    #152 <Method void ViewCompat.setAccessibilityDelegate(View, AccessibilityDelegateCompat)>
		ViewCompat.setImportantForAccessibility(((View) (this)), 1);
	//   43   82:aload_0         
	//   44   83:iconst_1        
	//   45   84:invokestatic    #156 <Method void ViewCompat.setImportantForAccessibility(View, int)>
		mDragHelper = ViewDragHelper.create(((ViewGroup) (this)), 0.5F, ((ViewDragHelper.Callback) (new DragHelperCallback())));
	//   46   87:aload_0         
	//   47   88:aload_0         
	//   48   89:ldc1            #137 <Float 0.5F>
	//   49   91:new             #12  <Class SlidingPaneLayout$DragHelperCallback>
	//   50   94:dup             
	//   51   95:aload_0         
	//   52   96:invokespecial   #157 <Method void SlidingPaneLayout$DragHelperCallback(SlidingPaneLayout)>
	//   53   99:invokestatic    #163 <Method ViewDragHelper ViewDragHelper.create(ViewGroup, float, ViewDragHelper$Callback)>
	//   54  102:putfield        #165 <Field ViewDragHelper mDragHelper>
		mDragHelper.setMinVelocity(400F * f);
	//   55  105:aload_0         
	//   56  106:getfield        #165 <Field ViewDragHelper mDragHelper>
	//   57  109:ldc1            #166 <Float 400F>
	//   58  111:fload           4
	//   59  113:fmul            
	//   60  114:invokevirtual   #170 <Method void ViewDragHelper.setMinVelocity(float)>
	//   61  117:return          
	}

	private boolean closePane(View view, int i)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(mFirstLayout || smoothSlideTo(0.0F, i))
	//*   2    2:aload_0         
	//*   3    3:getfield        #108 <Field boolean mFirstLayout>
	//*   4    6:ifne            18
	//*   5    9:aload_0         
	//*   6   10:fconst_0        
	//*   7   11:iload_2         
	//*   8   12:invokevirtual   #176 <Method boolean smoothSlideTo(float, int)>
	//*   9   15:ifeq            25
		{
			mPreservedOpenState = false;
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:putfield        #178 <Field boolean mPreservedOpenState>
			flag = true;
	//   13   23:iconst_1        
	//   14   24:istore_3        
		}
		return flag;
	//   15   25:iload_3         
	//   16   26:ireturn         
	}

	private void dimChildView(View view, float f, int i)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #186 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
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
	//   10   19:ldc1            #187 <Int 0xff000000>
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
	//*  21   34:getfield        #191 <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
	//*  22   37:ifnonnull       52
				layoutparams.dimPaint = new Paint();
	//   23   40:aload           5
	//   24   42:new             #193 <Class Paint>
	//   25   45:dup             
	//   26   46:invokespecial   #194 <Method void Paint()>
	//   27   49:putfield        #191 <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
			layoutparams.dimPaint.setColorFilter(((android.graphics.ColorFilter) (new PorterDuffColorFilter(j << 24 | 0xffffff & i, android.graphics.PorterDuff.Mode.SRC_OVER))));
	//   28   52:aload           5
	//   29   54:getfield        #191 <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
	//   30   57:new             #196 <Class PorterDuffColorFilter>
	//   31   60:dup             
	//   32   61:iload           4
	//   33   63:bipush          24
	//   34   65:ishl            
	//   35   66:ldc1            #197 <Int 0xffffff>
	//   36   68:iload_3         
	//   37   69:iand            
	//   38   70:ior             
	//   39   71:getstatic       #203 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_OVER>
	//   40   74:invokespecial   #206 <Method void PorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   41   77:invokevirtual   #210 <Method android.graphics.ColorFilter Paint.setColorFilter(android.graphics.ColorFilter)>
	//   42   80:pop             
			if(view.getLayerType() != 2)
	//*  43   81:aload_1         
	//*  44   82:invokevirtual   #214 <Method int View.getLayerType()>
	//*  45   85:iconst_2        
	//*  46   86:icmpeq          99
				view.setLayerType(2, layoutparams.dimPaint);
	//   47   89:aload_1         
	//   48   90:iconst_2        
	//   49   91:aload           5
	//   50   93:getfield        #191 <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
	//   51   96:invokevirtual   #218 <Method void View.setLayerType(int, Paint)>
			invalidateChildRegion(view);
	//   52   99:aload_0         
	//   53  100:aload_1         
	//   54  101:invokevirtual   #222 <Method void invalidateChildRegion(View)>
		} else
	//*  55  104:return          
		if(view.getLayerType() != 0)
	//*  56  105:aload_1         
	//*  57  106:invokevirtual   #214 <Method int View.getLayerType()>
	//*  58  109:ifeq            104
		{
			if(layoutparams.dimPaint != null)
	//*  59  112:aload           5
	//*  60  114:getfield        #191 <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
	//*  61  117:ifnull          130
				layoutparams.dimPaint.setColorFilter(((android.graphics.ColorFilter) (null)));
	//   62  120:aload           5
	//   63  122:getfield        #191 <Field Paint SlidingPaneLayout$LayoutParams.dimPaint>
	//   64  125:aconst_null     
	//   65  126:invokevirtual   #210 <Method android.graphics.ColorFilter Paint.setColorFilter(android.graphics.ColorFilter)>
	//   66  129:pop             
			view = ((View) (new DisableLayerRunnable(view)));
	//   67  130:new             #9   <Class SlidingPaneLayout$DisableLayerRunnable>
	//   68  133:dup             
	//   69  134:aload_0         
	//   70  135:aload_1         
	//   71  136:invokespecial   #225 <Method void SlidingPaneLayout$DisableLayerRunnable(SlidingPaneLayout, View)>
	//   72  139:astore_1        
			mPostedRunnables.add(((Object) (view)));
	//   73  140:aload_0         
	//   74  141:getfield        #118 <Field ArrayList mPostedRunnables>
	//   75  144:aload_1         
	//   76  145:invokevirtual   #229 <Method boolean ArrayList.add(Object)>
	//   77  148:pop             
			ViewCompat.postOnAnimation(((View) (this)), ((Runnable) (view)));
	//   78  149:aload_0         
	//   79  150:aload_1         
	//   80  151:invokestatic    #233 <Method void ViewCompat.postOnAnimation(View, Runnable)>
			return;
	//   81  154:return          
		}
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
	//*   6   10:invokevirtual   #176 <Method boolean smoothSlideTo(float, int)>
	//*   7   13:ifeq            23
		{
			mPreservedOpenState = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #178 <Field boolean mPreservedOpenState>
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
		Object obj;
		flag = isLayoutRtlSupport();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #239 <Method boolean isLayoutRtlSupport()>
	//    2    4:istore          8
		obj = ((Object) ((LayoutParams)mSlideableView.getLayoutParams()));
	//    3    6:aload_0         
	//    4    7:getfield        #241 <Field View mSlideableView>
	//    5   10:invokevirtual   #186 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    6   13:checkcast       #15  <Class SlidingPaneLayout$LayoutParams>
	//    7   16:astore          9
		if(((LayoutParams) (obj)).dimWhenOffset)
	//*   8   18:aload           9
	//*   9   20:getfield        #244 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
	//*  10   23:ifeq            94
		{
label0:
			{
				int j;
				int i1;
				if(flag)
	//*  11   26:iload           8
	//*  12   28:ifeq            85
					i = ((LayoutParams) (obj)).rightMargin;
	//   13   31:aload           9
	//   14   33:getfield        #247 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//   15   36:istore_3        
				else
	//*  16   37:iload_3         
	//*  17   38:ifgt            94
	//*  18   41:iconst_1        
	//*  19   42:istore_3        
	//*  20   43:aload_0         
	//*  21   44:invokevirtual   #250 <Method int getChildCount()>
	//*  22   47:istore          7
	//*  23   49:iconst_0        
	//*  24   50:istore          4
	//*  25   52:iload           4
	//*  26   54:iload           7
	//*  27   56:icmpge          195
	//*  28   59:aload_0         
	//*  29   60:iload           4
	//*  30   62:invokevirtual   #254 <Method View getChildAt(int)>
	//*  31   65:astore          9
	//*  32   67:aload           9
	//*  33   69:aload_0         
	//*  34   70:getfield        #241 <Field View mSlideableView>
	//*  35   73:if_acmpne       99
	//*  36   76:iload           4
	//*  37   78:iconst_1        
	//*  38   79:iadd            
	//*  39   80:istore          4
	//*  40   82:goto            52
					i = ((LayoutParams) (obj)).leftMargin;
	//   41   85:aload           9
	//   42   87:getfield        #257 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//   43   90:istore_3        
				if(i <= 0)
				{
					i = 1;
					break label0;
				}
			}
		}
	//*  44   91:goto            37
		i = 0;
	//   45   94:iconst_0        
	//   46   95:istore_3        
		continue;
	//   47   96:goto            43
		while(true) 
		{
			i1 = getChildCount();
			j = 0;
			while(j < i1) 
			{
				obj = ((Object) (getChildAt(j)));
				if(obj != mSlideableView)
				{
					int k = (int)((1.0F - mParallaxOffset) * (float)mParallaxBy);
	//   48   99:fconst_1        
	//   49  100:aload_0         
	//   50  101:getfield        #259 <Field float mParallaxOffset>
	//   51  104:fsub            
	//   52  105:aload_0         
	//   53  106:getfield        #261 <Field int mParallaxBy>
	//   54  109:i2f             
	//   55  110:fmul            
	//   56  111:f2i             
	//   57  112:istore          5
					mParallaxOffset = f;
	//   58  114:aload_0         
	//   59  115:fload_1         
	//   60  116:putfield        #259 <Field float mParallaxOffset>
					int l = k - (int)((1.0F - f) * (float)mParallaxBy);
	//   61  119:iload           5
	//   62  121:fconst_1        
	//   63  122:fload_1         
	//   64  123:fsub            
	//   65  124:aload_0         
	//   66  125:getfield        #261 <Field int mParallaxBy>
	//   67  128:i2f             
	//   68  129:fmul            
	//   69  130:f2i             
	//   70  131:isub            
	//   71  132:istore          6
					k = l;
	//   72  134:iload           6
	//   73  136:istore          5
					if(flag)
	//*  74  138:iload           8
	//*  75  140:ifeq            148
						k = -l;
	//   76  143:iload           6
	//   77  145:ineg            
	//   78  146:istore          5
					((View) (obj)).offsetLeftAndRight(k);
	//   79  148:aload           9
	//   80  150:iload           5
	//   81  152:invokevirtual   #265 <Method void View.offsetLeftAndRight(int)>
					if(i != 0)
	//*  82  155:iload_3         
	//*  83  156:ifeq            76
					{
						float f1;
						if(flag)
	//*  84  159:iload           8
	//*  85  161:ifeq            185
							f1 = mParallaxOffset - 1.0F;
	//   86  164:aload_0         
	//   87  165:getfield        #259 <Field float mParallaxOffset>
	//   88  168:fconst_1        
	//   89  169:fsub            
	//   90  170:fstore_2        
						else
	//*  91  171:aload_0         
	//*  92  172:aload           9
	//*  93  174:fload_2         
	//*  94  175:aload_0         
	//*  95  176:getfield        #267 <Field int mCoveredFadeColor>
	//*  96  179:invokespecial   #269 <Method void dimChildView(View, float, int)>
	//*  97  182:goto            76
							f1 = 1.0F - mParallaxOffset;
	//   98  185:fconst_1        
	//   99  186:aload_0         
	//  100  187:getfield        #259 <Field float mParallaxOffset>
	//  101  190:fsub            
	//  102  191:fstore_2        
						dimChildView(((View) (obj)), f1, mCoveredFadeColor);
					}
				}
				j++;
			}
	//* 103  192:goto            171
			return;
	//  104  195:return          
		}
	}

	private static boolean viewIsOpaque(View view)
	{
		if(!view.isOpaque())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #274 <Method boolean View.isOpaque()>
	//*   2    4:ifeq            9
	//*   3    7:iconst_1        
	//*   4    8:ireturn         
		{
			if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   5    9:getstatic       #88  <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   12:bipush          18
	//*   7   14:icmplt          19
				return false;
	//    8   17:iconst_0        
	//    9   18:ireturn         
			view = ((View) (view.getBackground()));
	//   10   19:aload_0         
	//   11   20:invokevirtual   #278 <Method Drawable View.getBackground()>
	//   12   23:astore_0        
			if(view != null)
	//*  13   24:aload_0         
	//*  14   25:ifnull          38
			{
				if(((Drawable) (view)).getOpacity() != -1)
	//*  15   28:aload_0         
	//*  16   29:invokevirtual   #283 <Method int Drawable.getOpacity()>
	//*  17   32:iconst_m1       
	//*  18   33:icmpeq          7
					return false;
	//   19   36:iconst_0        
	//   20   37:ireturn         
			} else
			{
				return false;
	//   21   38:iconst_0        
	//   22   39:ireturn         
			}
		}
		return true;
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
	//    7   14:invokevirtual   #288 <Method int View.getScrollX()>
	//    8   17:istore          7
			int j1 = view.getScrollY();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #291 <Method int View.getScrollY()>
	//   11   23:istore          8
			for(int l = viewgroup.getChildCount() - 1; l >= 0; l--)
	//*  12   25:aload           9
	//*  13   27:invokevirtual   #292 <Method int ViewGroup.getChildCount()>
	//*  14   30:iconst_1        
	//*  15   31:isub            
	//*  16   32:istore          6
	//*  17   34:iload           6
	//*  18   36:iflt            144
			{
				View view1 = viewgroup.getChildAt(l);
	//   19   39:aload           9
	//   20   41:iload           6
	//   21   43:invokevirtual   #293 <Method View ViewGroup.getChildAt(int)>
	//   22   46:astore          10
				if(j + i1 >= view1.getLeft() && j + i1 < view1.getRight() && k + j1 >= view1.getTop() && k + j1 < view1.getBottom() && canScroll(view1, true, i, (j + i1) - view1.getLeft(), (k + j1) - view1.getTop()))
	//*  23   48:iload           4
	//*  24   50:iload           7
	//*  25   52:iadd            
	//*  26   53:aload           10
	//*  27   55:invokevirtual   #296 <Method int View.getLeft()>
	//*  28   58:icmplt          135
	//*  29   61:iload           4
	//*  30   63:iload           7
	//*  31   65:iadd            
	//*  32   66:aload           10
	//*  33   68:invokevirtual   #299 <Method int View.getRight()>
	//*  34   71:icmpge          135
	//*  35   74:iload           5
	//*  36   76:iload           8
	//*  37   78:iadd            
	//*  38   79:aload           10
	//*  39   81:invokevirtual   #302 <Method int View.getTop()>
	//*  40   84:icmplt          135
	//*  41   87:iload           5
	//*  42   89:iload           8
	//*  43   91:iadd            
	//*  44   92:aload           10
	//*  45   94:invokevirtual   #305 <Method int View.getBottom()>
	//*  46   97:icmpge          135
	//*  47  100:aload_0         
	//*  48  101:aload           10
	//*  49  103:iconst_1        
	//*  50  104:iload_3         
	//*  51  105:iload           4
	//*  52  107:iload           7
	//*  53  109:iadd            
	//*  54  110:aload           10
	//*  55  112:invokevirtual   #296 <Method int View.getLeft()>
	//*  56  115:isub            
	//*  57  116:iload           5
	//*  58  118:iload           8
	//*  59  120:iadd            
	//*  60  121:aload           10
	//*  61  123:invokevirtual   #302 <Method int View.getTop()>
	//*  62  126:isub            
	//*  63  127:invokevirtual   #307 <Method boolean canScroll(View, boolean, int, int, int)>
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
	//*  75  149:invokevirtual   #239 <Method boolean isLayoutRtlSupport()>
	//*  76  152:ifeq            165
	//*  77  155:aload_1         
	//*  78  156:iload_3         
	//*  79  157:invokevirtual   #311 <Method boolean View.canScrollHorizontally(int)>
	//*  80  160:ifeq            171
	//*  81  163:iconst_1        
	//*  82  164:ireturn         
				i = -i;
	//   83  165:iload_3         
	//   84  166:ineg            
	//   85  167:istore_3        
			if(view.canScrollHorizontally(i))
				return true;
		}
	//*  86  168:goto            155
		return false;
	//   87  171:iconst_0        
	//   88  172:ireturn         
	}

	public boolean canSlide()
	{
		return mCanSlide;
	//    0    0:aload_0         
	//    1    1:getfield        #315 <Field boolean mCanSlide>
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
	//    5    9:invokespecial   #320 <Method boolean ViewGroup.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
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
	//    2    2:getfield        #241 <Field View mSlideableView>
	//    3    5:iconst_0        
	//    4    6:invokespecial   #322 <Method boolean closePane(View, int)>
	//    5    9:ireturn         
	}

	public void computeScroll()
	{
label0:
		{
			if(mDragHelper.continueSettling(true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #165 <Field ViewDragHelper mDragHelper>
	//*   2    4:iconst_1        
	//*   3    5:invokevirtual   #327 <Method boolean ViewDragHelper.continueSettling(boolean)>
	//*   4    8:ifeq            25
			{
				if(mCanSlide)
					break label0;
	//    5   11:aload_0         
	//    6   12:getfield        #315 <Field boolean mCanSlide>
	//    7   15:ifne            26
				mDragHelper.abort();
	//    8   18:aload_0         
	//    9   19:getfield        #165 <Field ViewDragHelper mDragHelper>
	//   10   22:invokevirtual   #330 <Method void ViewDragHelper.abort()>
			}
			return;
	//   11   25:return          
		}
		ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   12   26:aload_0         
	//   13   27:invokestatic    #333 <Method void ViewCompat.postInvalidateOnAnimation(View)>
	//   14   30:return          
	}

	void dispatchOnPanelClosed(View view)
	{
		if(mPanelSlideListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #336 <Field SlidingPaneLayout$PanelSlideListener mPanelSlideListener>
	//*   2    4:ifnull          17
			mPanelSlideListener.onPanelClosed(view);
	//    3    7:aload_0         
	//    4    8:getfield        #336 <Field SlidingPaneLayout$PanelSlideListener mPanelSlideListener>
	//    5   11:aload_1         
	//    6   12:invokeinterface #339 <Method void SlidingPaneLayout$PanelSlideListener.onPanelClosed(View)>
		sendAccessibilityEvent(32);
	//    7   17:aload_0         
	//    8   18:bipush          32
	//    9   20:invokevirtual   #342 <Method void sendAccessibilityEvent(int)>
	//   10   23:return          
	}

	void dispatchOnPanelOpened(View view)
	{
		if(mPanelSlideListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #336 <Field SlidingPaneLayout$PanelSlideListener mPanelSlideListener>
	//*   2    4:ifnull          17
			mPanelSlideListener.onPanelOpened(view);
	//    3    7:aload_0         
	//    4    8:getfield        #336 <Field SlidingPaneLayout$PanelSlideListener mPanelSlideListener>
	//    5   11:aload_1         
	//    6   12:invokeinterface #346 <Method void SlidingPaneLayout$PanelSlideListener.onPanelOpened(View)>
		sendAccessibilityEvent(32);
	//    7   17:aload_0         
	//    8   18:bipush          32
	//    9   20:invokevirtual   #342 <Method void sendAccessibilityEvent(int)>
	//   10   23:return          
	}

	void dispatchOnPanelSlide(View view)
	{
		if(mPanelSlideListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #336 <Field SlidingPaneLayout$PanelSlideListener mPanelSlideListener>
	//*   2    4:ifnull          21
			mPanelSlideListener.onPanelSlide(view, mSlideOffset);
	//    3    7:aload_0         
	//    4    8:getfield        #336 <Field SlidingPaneLayout$PanelSlideListener mPanelSlideListener>
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #349 <Field float mSlideOffset>
	//    8   16:invokeinterface #353 <Method void SlidingPaneLayout$PanelSlideListener.onPanelSlide(View, float)>
	//    9   21:return          
	}

	public void draw(Canvas canvas)
	{
		super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #357 <Method void ViewGroup.draw(Canvas)>
		Drawable drawable;
		View view;
		if(isLayoutRtlSupport())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #239 <Method boolean isLayoutRtlSupport()>
	//*   5    9:ifeq            44
			drawable = mShadowDrawableRight;
	//    6   12:aload_0         
	//    7   13:getfield        #359 <Field Drawable mShadowDrawableRight>
	//    8   16:astore          7
		else
	//*   9   18:aload_0         
	//*  10   19:invokevirtual   #250 <Method int getChildCount()>
	//*  11   22:iconst_1        
	//*  12   23:icmple          53
	//*  13   26:aload_0         
	//*  14   27:iconst_1        
	//*  15   28:invokevirtual   #254 <Method View getChildAt(int)>
	//*  16   31:astore          8
	//*  17   33:aload           8
	//*  18   35:ifnull          43
	//*  19   38:aload           7
	//*  20   40:ifnonnull       59
	//*  21   43:return          
			drawable = mShadowDrawableLeft;
	//   22   44:aload_0         
	//   23   45:getfield        #361 <Field Drawable mShadowDrawableLeft>
	//   24   48:astore          7
		if(getChildCount() > 1)
			view = getChildAt(1);
		else
	//*  25   50:goto            18
			view = null;
	//   26   53:aconst_null     
	//   27   54:astore          8
		if(view == null || drawable == null)
			return;
	//*  28   56:goto            33
		int k = view.getTop();
	//   29   59:aload           8
	//   30   61:invokevirtual   #302 <Method int View.getTop()>
	//   31   64:istore          4
		int l = view.getBottom();
	//   32   66:aload           8
	//   33   68:invokevirtual   #305 <Method int View.getBottom()>
	//   34   71:istore          5
		int i1 = drawable.getIntrinsicWidth();
	//   35   73:aload           7
	//   36   75:invokevirtual   #364 <Method int Drawable.getIntrinsicWidth()>
	//   37   78:istore          6
		int i;
		int j;
		if(isLayoutRtlSupport())
	//*  38   80:aload_0         
	//*  39   81:invokevirtual   #239 <Method boolean isLayoutRtlSupport()>
	//*  40   84:ifeq            116
		{
			i = view.getRight();
	//   41   87:aload           8
	//   42   89:invokevirtual   #299 <Method int View.getRight()>
	//   43   92:istore_2        
			j = i + i1;
	//   44   93:iload_2         
	//   45   94:iload           6
	//   46   96:iadd            
	//   47   97:istore_3        
		} else
	//*  48   98:aload           7
	//*  49  100:iload_2         
	//*  50  101:iload           4
	//*  51  103:iload_3         
	//*  52  104:iload           5
	//*  53  106:invokevirtual   #368 <Method void Drawable.setBounds(int, int, int, int)>
	//*  54  109:aload           7
	//*  55  111:aload_1         
	//*  56  112:invokevirtual   #369 <Method void Drawable.draw(Canvas)>
	//*  57  115:return          
		{
			j = view.getLeft();
	//   58  116:aload           8
	//   59  118:invokevirtual   #296 <Method int View.getLeft()>
	//   60  121:istore_3        
			i = j - i1;
	//   61  122:iload_3         
	//   62  123:iload           6
	//   63  125:isub            
	//   64  126:istore_2        
		}
		drawable.setBounds(i, k, j, l);
		drawable.draw(canvas);
	//*  65  127:goto            98
	}

	protected boolean drawChild(Canvas canvas, View view, long l)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #186 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #15  <Class SlidingPaneLayout$LayoutParams>
	//    3    7:astore          7
		int i = canvas.save(2);
	//    4    9:aload_1         
	//    5   10:iconst_2        
	//    6   11:invokevirtual   #377 <Method int Canvas.save(int)>
	//    7   14:istore          5
		if(mCanSlide && !layoutparams.slideable && mSlideableView != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #315 <Field boolean mCanSlide>
	//*  10   20:ifeq            87
	//*  11   23:aload           7
	//*  12   25:getfield        #380 <Field boolean SlidingPaneLayout$LayoutParams.slideable>
	//*  13   28:ifne            87
	//*  14   31:aload_0         
	//*  15   32:getfield        #241 <Field View mSlideableView>
	//*  16   35:ifnull          87
		{
			canvas.getClipBounds(mTmpRect);
	//   17   38:aload_1         
	//   18   39:aload_0         
	//   19   40:getfield        #113 <Field Rect mTmpRect>
	//   20   43:invokevirtual   #384 <Method boolean Canvas.getClipBounds(Rect)>
	//   21   46:pop             
			boolean flag;
			if(isLayoutRtlSupport())
	//*  22   47:aload_0         
	//*  23   48:invokevirtual   #239 <Method boolean isLayoutRtlSupport()>
	//*  24   51:ifeq            105
				mTmpRect.left = Math.max(mTmpRect.left, mSlideableView.getRight());
	//   25   54:aload_0         
	//   26   55:getfield        #113 <Field Rect mTmpRect>
	//   27   58:aload_0         
	//   28   59:getfield        #113 <Field Rect mTmpRect>
	//   29   62:getfield        #387 <Field int Rect.left>
	//   30   65:aload_0         
	//   31   66:getfield        #241 <Field View mSlideableView>
	//   32   69:invokevirtual   #299 <Method int View.getRight()>
	//   33   72:invokestatic    #393 <Method int Math.max(int, int)>
	//   34   75:putfield        #387 <Field int Rect.left>
			else
	//*  35   78:aload_1         
	//*  36   79:aload_0         
	//*  37   80:getfield        #113 <Field Rect mTmpRect>
	//*  38   83:invokevirtual   #396 <Method boolean Canvas.clipRect(Rect)>
	//*  39   86:pop             
	//*  40   87:aload_0         
	//*  41   88:aload_1         
	//*  42   89:aload_2         
	//*  43   90:lload_3         
	//*  44   91:invokespecial   #398 <Method boolean ViewGroup.drawChild(Canvas, View, long)>
	//*  45   94:istore          6
	//*  46   96:aload_1         
	//*  47   97:iload           5
	//*  48   99:invokevirtual   #401 <Method void Canvas.restoreToCount(int)>
	//*  49  102:iload           6
	//*  50  104:ireturn         
				mTmpRect.right = Math.min(mTmpRect.right, mSlideableView.getLeft());
	//   51  105:aload_0         
	//   52  106:getfield        #113 <Field Rect mTmpRect>
	//   53  109:aload_0         
	//   54  110:getfield        #113 <Field Rect mTmpRect>
	//   55  113:getfield        #404 <Field int Rect.right>
	//   56  116:aload_0         
	//   57  117:getfield        #241 <Field View mSlideableView>
	//   58  120:invokevirtual   #296 <Method int View.getLeft()>
	//   59  123:invokestatic    #407 <Method int Math.min(int, int)>
	//   60  126:putfield        #404 <Field int Rect.right>
			canvas.clipRect(mTmpRect);
		}
		flag = super.drawChild(canvas, view, l);
		canvas.restoreToCount(i);
		return flag;
	//*  61  129:goto            78
	}

	protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams()));
	//    0    0:new             #15  <Class SlidingPaneLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:invokespecial   #409 <Method void SlidingPaneLayout$LayoutParams()>
	//    3    7:areturn         
	}

	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(getContext(), attributeset)));
	//    0    0:new             #15  <Class SlidingPaneLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #415 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #416 <Method void SlidingPaneLayout$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #419 <Class android.view.ViewGroup$MarginLayoutParams>
	//*   2    4:ifeq            19
			return ((android.view.ViewGroup.LayoutParams) (new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams)));
	//    3    7:new             #15  <Class SlidingPaneLayout$LayoutParams>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:checkcast       #419 <Class android.view.ViewGroup$MarginLayoutParams>
	//    7   15:invokespecial   #422 <Method void SlidingPaneLayout$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
	//    8   18:areturn         
		else
			return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(layoutparams)));
	//    9   19:new             #15  <Class SlidingPaneLayout$LayoutParams>
	//   10   22:dup             
	//   11   23:aload_1         
	//   12   24:invokespecial   #425 <Method void SlidingPaneLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//   13   27:areturn         
	}

	public int getCoveredFadeColor()
	{
		return mCoveredFadeColor;
	//    0    0:aload_0         
	//    1    1:getfield        #267 <Field int mCoveredFadeColor>
	//    2    4:ireturn         
	}

	public int getParallaxDistance()
	{
		return mParallaxBy;
	//    0    0:aload_0         
	//    1    1:getfield        #261 <Field int mParallaxBy>
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
	//    3    5:invokeinterface #432 <Method void SlidingPaneLayout$SlidingPanelLayoutImpl.invalidateChildRegion(SlidingPaneLayout, View)>
	//    4   10:return          
	}

	boolean isDimmed(View view)
	{
		if(view != null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
	//*   2    4:iconst_0        
	//*   3    5:ireturn         
		{
			view = ((View) ((LayoutParams)view.getLayoutParams()));
	//    4    6:aload_1         
	//    5    7:invokevirtual   #186 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    6   10:checkcast       #15  <Class SlidingPaneLayout$LayoutParams>
	//    7   13:astore_1        
			if(mCanSlide && ((LayoutParams) (view)).dimWhenOffset && mSlideOffset > 0.0F)
	//*   8   14:aload_0         
	//*   9   15:getfield        #315 <Field boolean mCanSlide>
	//*  10   18:ifeq            4
	//*  11   21:aload_1         
	//*  12   22:getfield        #244 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
	//*  13   25:ifeq            4
	//*  14   28:aload_0         
	//*  15   29:getfield        #349 <Field float mSlideOffset>
	//*  16   32:fconst_0        
	//*  17   33:fcmpl           
	//*  18   34:ifle            4
				return true;
	//   19   37:iconst_1        
	//   20   38:ireturn         
		}
		return false;
	}

	boolean isLayoutRtlSupport()
	{
		return ViewCompat.getLayoutDirection(((View) (this))) == 1;
	//    0    0:aload_0         
	//    1    1:invokestatic    #437 <Method int ViewCompat.getLayoutDirection(View)>
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
	//    1    1:getfield        #315 <Field boolean mCanSlide>
	//    2    4:ifeq            16
	//    3    7:aload_0         
	//    4    8:getfield        #349 <Field float mSlideOffset>
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
	//    1    1:getfield        #315 <Field boolean mCanSlide>
	//    2    4:ireturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #442 <Method void ViewGroup.onAttachedToWindow()>
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
	//    1    1:invokespecial   #445 <Method void ViewGroup.onDetachedFromWindow()>
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
	//*   9   15:invokevirtual   #448 <Method int ArrayList.size()>
	//*  10   18:istore_2        
	//*  11   19:iload_1         
	//*  12   20:iload_2         
	//*  13   21:icmpge          45
			((DisableLayerRunnable)mPostedRunnables.get(i)).run();
	//   14   24:aload_0         
	//   15   25:getfield        #118 <Field ArrayList mPostedRunnables>
	//   16   28:iload_1         
	//   17   29:invokevirtual   #452 <Method Object ArrayList.get(int)>
	//   18   32:checkcast       #9   <Class SlidingPaneLayout$DisableLayerRunnable>
	//   19   35:invokevirtual   #455 <Method void SlidingPaneLayout$DisableLayerRunnable.run()>

	//   20   38:iload_1         
	//   21   39:iconst_1        
	//   22   40:iadd            
	//   23   41:istore_1        
	//*  24   42:goto            19
		mPostedRunnables.clear();
	//   25   45:aload_0         
	//   26   46:getfield        #118 <Field ArrayList mPostedRunnables>
	//   27   49:invokevirtual   #458 <Method void ArrayList.clear()>
	//   28   52:return          
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		boolean flag;
		boolean flag1;
		int i;
		i = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #465 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore          6
		if(!mCanSlide && i == 0 && getChildCount() > 1)
	//*   3    6:aload_0         
	//*   4    7:getfield        #315 <Field boolean mCanSlide>
	//*   5   10:ifne            69
	//*   6   13:iload           6
	//*   7   15:ifne            69
	//*   8   18:aload_0         
	//*   9   19:invokevirtual   #250 <Method int getChildCount()>
	//*  10   22:iconst_1        
	//*  11   23:icmple          69
		{
			View view = getChildAt(1);
	//   12   26:aload_0         
	//   13   27:iconst_1        
	//   14   28:invokevirtual   #254 <Method View getChildAt(int)>
	//   15   31:astore          8
			if(view != null)
	//*  16   33:aload           8
	//*  17   35:ifnull          69
			{
				boolean flag2;
				if(!mDragHelper.isViewUnder(view, (int)motionevent.getX(), (int)motionevent.getY()))
	//*  18   38:aload_0         
	//*  19   39:getfield        #165 <Field ViewDragHelper mDragHelper>
	//*  20   42:aload           8
	//*  21   44:aload_1         
	//*  22   45:invokevirtual   #469 <Method float MotionEvent.getX()>
	//*  23   48:f2i             
	//*  24   49:aload_1         
	//*  25   50:invokevirtual   #472 <Method float MotionEvent.getY()>
	//*  26   53:f2i             
	//*  27   54:invokevirtual   #476 <Method boolean ViewDragHelper.isViewUnder(View, int, int)>
	//*  28   57:ifne            101
					flag2 = true;
	//   29   60:iconst_1        
	//   30   61:istore          7
				else
	//*  31   63:aload_0         
	//*  32   64:iload           7
	//*  33   66:putfield        #178 <Field boolean mPreservedOpenState>
	//*  34   69:aload_0         
	//*  35   70:getfield        #315 <Field boolean mCanSlide>
	//*  36   73:ifeq            88
	//*  37   76:aload_0         
	//*  38   77:getfield        #478 <Field boolean mIsUnableToDrag>
	//*  39   80:ifeq            107
	//*  40   83:iload           6
	//*  41   85:ifeq            107
	//*  42   88:aload_0         
	//*  43   89:getfield        #165 <Field ViewDragHelper mDragHelper>
	//*  44   92:invokevirtual   #481 <Method void ViewDragHelper.cancel()>
	//*  45   95:aload_0         
	//*  46   96:aload_1         
	//*  47   97:invokespecial   #483 <Method boolean ViewGroup.onInterceptTouchEvent(MotionEvent)>
	//*  48  100:ireturn         
					flag2 = false;
	//   49  101:iconst_0        
	//   50  102:istore          7
				mPreservedOpenState = flag2;
			}
		}
		if(!mCanSlide || mIsUnableToDrag && i != 0)
		{
			mDragHelper.cancel();
			return super.onInterceptTouchEvent(motionevent);
		}
	//*  51  104:goto            63
		if(i == 3 || i == 1)
	//*  52  107:iload           6
	//*  53  109:iconst_3        
	//*  54  110:icmpeq          119
	//*  55  113:iload           6
	//*  56  115:iconst_1        
	//*  57  116:icmpne          128
		{
			mDragHelper.cancel();
	//   58  119:aload_0         
	//   59  120:getfield        #165 <Field ViewDragHelper mDragHelper>
	//   60  123:invokevirtual   #481 <Method void ViewDragHelper.cancel()>
			return false;
	//   61  126:iconst_0        
	//   62  127:ireturn         
		}
		flag1 = false;
	//   63  128:iconst_0        
	//   64  129:istore          5
		flag = flag1;
	//   65  131:iload           5
	//   66  133:istore          4
		i;
	//   67  135:iload           6
		JVM INSTR tableswitch 0 2: default 164
	//	               0 186
	//	               1 168
	//	               2 254;
	//   68  137:tableswitch     0 2: default 164
	//	               0 186
	//	               1 168
	//	               2 254
		   goto _L1 _L2 _L3 _L4
_L4:
		break MISSING_BLOCK_LABEL_254;
_L3:
		break; /* Loop/switch isn't completed */
_L1:
		flag = flag1;
	//   69  164:iload           5
	//   70  166:istore          4
_L5:
		float f;
		float f2;
		return mDragHelper.shouldInterceptTouchEvent(motionevent) || flag;
	//   71  168:aload_0         
	//   72  169:getfield        #165 <Field ViewDragHelper mDragHelper>
	//   73  172:aload_1         
	//   74  173:invokevirtual   #486 <Method boolean ViewDragHelper.shouldInterceptTouchEvent(MotionEvent)>
	//   75  176:ifne            184
	//   76  179:iload           4
	//   77  181:ifeq            325
	//   78  184:iconst_1        
	//   79  185:ireturn         
	//   80  186:aload_0         
	//   81  187:iconst_0        
	//   82  188:putfield        #478 <Field boolean mIsUnableToDrag>
	//   83  191:aload_1         
	//   84  192:invokevirtual   #469 <Method float MotionEvent.getX()>
	//   85  195:fstore_2        
	//   86  196:aload_1         
	//   87  197:invokevirtual   #472 <Method float MotionEvent.getY()>
	//   88  200:fstore_3        
	//   89  201:aload_0         
	//   90  202:fload_2         
	//   91  203:putfield        #488 <Field float mInitialMotionX>
	//   92  206:aload_0         
	//   93  207:fload_3         
	//   94  208:putfield        #490 <Field float mInitialMotionY>
	//   95  211:iload           5
	//   96  213:istore          4
	//   97  215:aload_0         
	//   98  216:getfield        #165 <Field ViewDragHelper mDragHelper>
	//   99  219:aload_0         
	//  100  220:getfield        #241 <Field View mSlideableView>
	//  101  223:fload_2         
	//  102  224:f2i             
	//  103  225:fload_3         
	//  104  226:f2i             
	//  105  227:invokevirtual   #476 <Method boolean ViewDragHelper.isViewUnder(View, int, int)>
	//  106  230:ifeq            168
	//  107  233:iload           5
	//  108  235:istore          4
	//  109  237:aload_0         
	//  110  238:aload_0         
	//  111  239:getfield        #241 <Field View mSlideableView>
	//  112  242:invokevirtual   #492 <Method boolean isDimmed(View)>
	//  113  245:ifeq            168
	//  114  248:iconst_1        
	//  115  249:istore          4
	//  116  251:goto            168
	//  117  254:aload_1         
	//  118  255:invokevirtual   #469 <Method float MotionEvent.getX()>
	//  119  258:fstore_3        
	//  120  259:aload_1         
	//  121  260:invokevirtual   #472 <Method float MotionEvent.getY()>
	//  122  263:fstore_2        
	//  123  264:fload_3         
	//  124  265:aload_0         
	//  125  266:getfield        #488 <Field float mInitialMotionX>
	//  126  269:fsub            
	//  127  270:invokestatic    #496 <Method float Math.abs(float)>
	//  128  273:fstore_3        
	//  129  274:fload_2         
	//  130  275:aload_0         
	//  131  276:getfield        #490 <Field float mInitialMotionY>
	//  132  279:fsub            
	//  133  280:invokestatic    #496 <Method float Math.abs(float)>
	//  134  283:fstore_2        
	//  135  284:iload           5
	//  136  286:istore          4
	//  137  288:fload_3         
	//  138  289:aload_0         
	//  139  290:getfield        #165 <Field ViewDragHelper mDragHelper>
	//  140  293:invokevirtual   #499 <Method int ViewDragHelper.getTouchSlop()>
	//  141  296:i2f             
	//  142  297:fcmpl           
	//  143  298:ifle            168
	//  144  301:iload           5
	//  145  303:istore          4
	//  146  305:fload_2         
	//  147  306:fload_3         
	//  148  307:fcmpl           
	//  149  308:ifle            168
	//  150  311:aload_0         
	//  151  312:getfield        #165 <Field ViewDragHelper mDragHelper>
	//  152  315:invokevirtual   #481 <Method void ViewDragHelper.cancel()>
	//  153  318:aload_0         
	//  154  319:iconst_1        
	//  155  320:putfield        #478 <Field boolean mIsUnableToDrag>
	//  156  323:iconst_0        
	//  157  324:ireturn         
	//  158  325:iconst_0        
	//  159  326:ireturn         
_L2:
		mIsUnableToDrag = false;
		f = motionevent.getX();
		f2 = motionevent.getY();
		mInitialMotionX = f;
		mInitialMotionY = f2;
		flag = flag1;
		if(mDragHelper.isViewUnder(mSlideableView, (int)f, (int)f2))
		{
			flag = flag1;
			if(isDimmed(mSlideableView))
				flag = true;
		}
		  goto _L5
		float f3 = motionevent.getX();
		float f1 = motionevent.getY();
		f3 = Math.abs(f3 - mInitialMotionX);
		f1 = Math.abs(f1 - mInitialMotionY);
		flag = flag1;
		if(f3 > (float)mDragHelper.getTouchSlop())
		{
			flag = flag1;
			if(f1 > f3)
			{
				mDragHelper.cancel();
				mIsUnableToDrag = true;
				return false;
			}
		}
		  goto _L5
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		boolean flag2 = isLayoutRtlSupport();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #239 <Method boolean isLayoutRtlSupport()>
	//    2    4:istore          14
		int k1;
		int l1;
		int i2;
		if(flag2)
	//*   3    6:iload           14
	//*   4    8:ifeq            137
			mDragHelper.setEdgeTrackingEnabled(2);
	//    5   11:aload_0         
	//    6   12:getfield        #165 <Field ViewDragHelper mDragHelper>
	//    7   15:iconst_2        
	//    8   16:invokevirtual   #504 <Method void ViewDragHelper.setEdgeTrackingEnabled(int)>
		else
	//*   9   19:iload           4
	//*  10   21:iload_2         
	//*  11   22:isub            
	//*  12   23:istore          9
	//*  13   25:iload           14
	//*  14   27:ifeq            148
	//*  15   30:aload_0         
	//*  16   31:invokevirtual   #507 <Method int getPaddingRight()>
	//*  17   34:istore_2        
	//*  18   35:iload           14
	//*  19   37:ifeq            156
	//*  20   40:aload_0         
	//*  21   41:invokevirtual   #510 <Method int getPaddingLeft()>
	//*  22   44:istore          4
	//*  23   46:aload_0         
	//*  24   47:invokevirtual   #513 <Method int getPaddingTop()>
	//*  25   50:istore          11
	//*  26   52:aload_0         
	//*  27   53:invokevirtual   #250 <Method int getChildCount()>
	//*  28   56:istore          10
	//*  29   58:iload_2         
	//*  30   59:istore          5
	//*  31   61:aload_0         
	//*  32   62:getfield        #108 <Field boolean mFirstLayout>
	//*  33   65:ifeq            91
	//*  34   68:aload_0         
	//*  35   69:getfield        #315 <Field boolean mCanSlide>
	//*  36   72:ifeq            165
	//*  37   75:aload_0         
	//*  38   76:getfield        #178 <Field boolean mPreservedOpenState>
	//*  39   79:ifeq            165
	//*  40   82:fconst_1        
	//*  41   83:fstore          6
	//*  42   85:aload_0         
	//*  43   86:fload           6
	//*  44   88:putfield        #349 <Field float mSlideOffset>
	//*  45   91:iconst_0        
	//*  46   92:istore          7
	//*  47   94:iload_2         
	//*  48   95:istore_3        
	//*  49   96:iload           5
	//*  50   98:istore_2        
	//*  51   99:iload           7
	//*  52  101:istore          5
	//*  53  103:iload           5
	//*  54  105:iload           10
	//*  55  107:icmpge          444
	//*  56  110:aload_0         
	//*  57  111:iload           5
	//*  58  113:invokevirtual   #254 <Method View getChildAt(int)>
	//*  59  116:astore          15
	//*  60  118:aload           15
	//*  61  120:invokevirtual   #516 <Method int View.getVisibility()>
	//*  62  123:bipush          8
	//*  63  125:icmpne          171
	//*  64  128:iload           5
	//*  65  130:iconst_1        
	//*  66  131:iadd            
	//*  67  132:istore          5
	//*  68  134:goto            103
			mDragHelper.setEdgeTrackingEnabled(1);
	//   69  137:aload_0         
	//   70  138:getfield        #165 <Field ViewDragHelper mDragHelper>
	//   71  141:iconst_1        
	//   72  142:invokevirtual   #504 <Method void ViewDragHelper.setEdgeTrackingEnabled(int)>
		k1 = k - i;
		if(flag2)
			i = getPaddingRight();
		else
	//*  73  145:goto            19
			i = getPaddingLeft();
	//   74  148:aload_0         
	//   75  149:invokevirtual   #510 <Method int getPaddingLeft()>
	//   76  152:istore_2        
		if(flag2)
			k = getPaddingLeft();
		else
	//*  77  153:goto            35
			k = getPaddingRight();
	//   78  156:aload_0         
	//   79  157:invokevirtual   #507 <Method int getPaddingRight()>
	//   80  160:istore          4
		i2 = getPaddingTop();
		l1 = getChildCount();
		l = i;
		if(mFirstLayout)
		{
			float f;
			boolean flag1;
			if(mCanSlide && mPreservedOpenState)
				f = 1.0F;
			else
	//*  81  162:goto            46
				f = 0.0F;
	//   82  165:fconst_0        
	//   83  166:fstore          6
			mSlideOffset = f;
		}
		flag1 = false;
		j = i;
		i = l;
		l = ((int) (flag1));
		while(l < l1) 
		{
			View view = getChildAt(l);
			if(view.getVisibility() != 8)
	//*  84  168:goto            85
			{
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   85  171:aload           15
	//   86  173:invokevirtual   #186 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   87  176:checkcast       #15  <Class SlidingPaneLayout$LayoutParams>
	//   88  179:astore          16
				int j2 = view.getMeasuredWidth();
	//   89  181:aload           15
	//   90  183:invokevirtual   #519 <Method int View.getMeasuredWidth()>
	//   91  186:istore          12
				int j1 = 0;
	//   92  188:iconst_0        
	//   93  189:istore          8
				int i1;
				if(layoutparams.slideable)
	//*  94  191:aload           16
	//*  95  193:getfield        #380 <Field boolean SlidingPaneLayout$LayoutParams.slideable>
	//*  96  196:ifeq            385
				{
					i1 = layoutparams.leftMargin;
	//   97  199:aload           16
	//   98  201:getfield        #257 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//   99  204:istore          7
					int k2 = layoutparams.rightMargin;
	//  100  206:aload           16
	//  101  208:getfield        #247 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//  102  211:istore          13
					k2 = Math.min(i, k1 - k - mOverhangSize) - j - (i1 + k2);
	//  103  213:iload_2         
	//  104  214:iload           9
	//  105  216:iload           4
	//  106  218:isub            
	//  107  219:aload_0         
	//  108  220:getfield        #139 <Field int mOverhangSize>
	//  109  223:isub            
	//  110  224:invokestatic    #407 <Method int Math.min(int, int)>
	//  111  227:iload_3         
	//  112  228:isub            
	//  113  229:iload           7
	//  114  231:iload           13
	//  115  233:iadd            
	//  116  234:isub            
	//  117  235:istore          13
					mSlideRange = k2;
	//  118  237:aload_0         
	//  119  238:iload           13
	//  120  240:putfield        #521 <Field int mSlideRange>
					if(flag2)
	//* 121  243:iload           14
	//* 122  245:ifeq            370
						i1 = layoutparams.rightMargin;
	//  123  248:aload           16
	//  124  250:getfield        #247 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//  125  253:istore          7
					else
	//* 126  255:iload_3         
	//* 127  256:iload           7
	//* 128  258:iadd            
	//* 129  259:iload           13
	//* 130  261:iadd            
	//* 131  262:iload           12
	//* 132  264:iconst_2        
	//* 133  265:idiv            
	//* 134  266:iadd            
	//* 135  267:iload           9
	//* 136  269:iload           4
	//* 137  271:isub            
	//* 138  272:icmple          380
	//* 139  275:iconst_1        
	//* 140  276:istore_1        
	//* 141  277:aload           16
	//* 142  279:iload_1         
	//* 143  280:putfield        #244 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
	//* 144  283:iload           13
	//* 145  285:i2f             
	//* 146  286:aload_0         
	//* 147  287:getfield        #349 <Field float mSlideOffset>
	//* 148  290:fmul            
	//* 149  291:f2i             
	//* 150  292:istore          13
	//* 151  294:iload_3         
	//* 152  295:iload           13
	//* 153  297:iload           7
	//* 154  299:iadd            
	//* 155  300:iadd            
	//* 156  301:istore_3        
	//* 157  302:aload_0         
	//* 158  303:iload           13
	//* 159  305:i2f             
	//* 160  306:aload_0         
	//* 161  307:getfield        #521 <Field int mSlideRange>
	//* 162  310:i2f             
	//* 163  311:fdiv            
	//* 164  312:putfield        #349 <Field float mSlideOffset>
	//* 165  315:iload           8
	//* 166  317:istore          7
	//* 167  319:iload           14
	//* 168  321:ifeq            428
	//* 169  324:iload           9
	//* 170  326:iload_3         
	//* 171  327:isub            
	//* 172  328:iload           7
	//* 173  330:iadd            
	//* 174  331:istore          8
	//* 175  333:iload           8
	//* 176  335:iload           12
	//* 177  337:isub            
	//* 178  338:istore          7
	//* 179  340:aload           15
	//* 180  342:iload           7
	//* 181  344:iload           11
	//* 182  346:iload           8
	//* 183  348:iload           11
	//* 184  350:aload           15
	//* 185  352:invokevirtual   #524 <Method int View.getMeasuredHeight()>
	//* 186  355:iadd            
	//* 187  356:invokevirtual   #527 <Method void View.layout(int, int, int, int)>
	//* 188  359:iload_2         
	//* 189  360:aload           15
	//* 190  362:invokevirtual   #530 <Method int View.getWidth()>
	//* 191  365:iadd            
	//* 192  366:istore_2        
	//* 193  367:goto            128
						i1 = layoutparams.leftMargin;
	//  194  370:aload           16
	//  195  372:getfield        #257 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//  196  375:istore          7
					if(j + i1 + k2 + j2 / 2 > k1 - k)
						flag = true;
					else
	//* 197  377:goto            255
						flag = false;
	//  198  380:iconst_0        
	//  199  381:istore_1        
					layoutparams.dimWhenOffset = flag;
					k2 = (int)((float)k2 * mSlideOffset);
					j += k2 + i1;
					mSlideOffset = (float)k2 / (float)mSlideRange;
					i1 = j1;
				} else
	//* 200  382:goto            277
				if(mCanSlide && mParallaxBy != 0)
	//* 201  385:aload_0         
	//* 202  386:getfield        #315 <Field boolean mCanSlide>
	//* 203  389:ifeq            419
	//* 204  392:aload_0         
	//* 205  393:getfield        #261 <Field int mParallaxBy>
	//* 206  396:ifeq            419
				{
					i1 = (int)((1.0F - mSlideOffset) * (float)mParallaxBy);
	//  207  399:fconst_1        
	//  208  400:aload_0         
	//  209  401:getfield        #349 <Field float mSlideOffset>
	//  210  404:fsub            
	//  211  405:aload_0         
	//  212  406:getfield        #261 <Field int mParallaxBy>
	//  213  409:i2f             
	//  214  410:fmul            
	//  215  411:f2i             
	//  216  412:istore          7
					j = i;
	//  217  414:iload_2         
	//  218  415:istore_3        
				} else
	//* 219  416:goto            319
				{
					j = i;
	//  220  419:iload_2         
	//  221  420:istore_3        
					i1 = j1;
	//  222  421:iload           8
	//  223  423:istore          7
				}
				if(flag2)
				{
					j1 = (k1 - j) + i1;
					i1 = j1 - j2;
				} else
	//* 224  425:goto            319
				{
					i1 = j - i1;
	//  225  428:iload_3         
	//  226  429:iload           7
	//  227  431:isub            
	//  228  432:istore          7
					j1 = i1 + j2;
	//  229  434:iload           7
	//  230  436:iload           12
	//  231  438:iadd            
	//  232  439:istore          8
				}
				view.layout(i1, i2, j1, i2 + view.getMeasuredHeight());
				i += view.getWidth();
			}
			l++;
		}
	//* 233  441:goto            340
		if(mFirstLayout)
	//* 234  444:aload_0         
	//* 235  445:getfield        #108 <Field boolean mFirstLayout>
	//* 236  448:ifeq            513
		{
			if(mCanSlide)
	//* 237  451:aload_0         
	//* 238  452:getfield        #315 <Field boolean mCanSlide>
	//* 239  455:ifeq            519
			{
				if(mParallaxBy != 0)
	//* 240  458:aload_0         
	//* 241  459:getfield        #261 <Field int mParallaxBy>
	//* 242  462:ifeq            473
					parallaxOtherViews(mSlideOffset);
	//  243  465:aload_0         
	//  244  466:aload_0         
	//  245  467:getfield        #349 <Field float mSlideOffset>
	//  246  470:invokespecial   #532 <Method void parallaxOtherViews(float)>
				if(((LayoutParams)mSlideableView.getLayoutParams()).dimWhenOffset)
	//* 247  473:aload_0         
	//* 248  474:getfield        #241 <Field View mSlideableView>
	//* 249  477:invokevirtual   #186 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 250  480:checkcast       #15  <Class SlidingPaneLayout$LayoutParams>
	//* 251  483:getfield        #244 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
	//* 252  486:ifeq            505
					dimChildView(mSlideableView, mSlideOffset, mSliderFadeColor);
	//  253  489:aload_0         
	//  254  490:aload_0         
	//  255  491:getfield        #241 <Field View mSlideableView>
	//  256  494:aload_0         
	//  257  495:getfield        #349 <Field float mSlideOffset>
	//  258  498:aload_0         
	//  259  499:getfield        #106 <Field int mSliderFadeColor>
	//  260  502:invokespecial   #269 <Method void dimChildView(View, float, int)>
			} else
	//* 261  505:aload_0         
	//* 262  506:aload_0         
	//* 263  507:getfield        #241 <Field View mSlideableView>
	//* 264  510:invokevirtual   #535 <Method void updateObscuredViewsVisibility(View)>
	//* 265  513:aload_0         
	//* 266  514:iconst_0        
	//* 267  515:putfield        #108 <Field boolean mFirstLayout>
	//* 268  518:return          
			{
				i = 0;
	//  269  519:iconst_0        
	//  270  520:istore_2        
				while(i < l1) 
	//* 271  521:iload_2         
	//* 272  522:iload           10
	//* 273  524:icmpge          505
				{
					dimChildView(getChildAt(i), 0.0F, mSliderFadeColor);
	//  274  527:aload_0         
	//  275  528:aload_0         
	//  276  529:iload_2         
	//  277  530:invokevirtual   #254 <Method View getChildAt(int)>
	//  278  533:fconst_0        
	//  279  534:aload_0         
	//  280  535:getfield        #106 <Field int mSliderFadeColor>
	//  281  538:invokespecial   #269 <Method void dimChildView(View, float, int)>
					i++;
	//  282  541:iload_2         
	//  283  542:iconst_1        
	//  284  543:iadd            
	//  285  544:istore_2        
				}
			}
			updateObscuredViewsVisibility(mSlideableView);
		}
		mFirstLayout = false;
	//* 286  545:goto            521
	}

	protected void onMeasure(int i, int j)
	{
		int k;
		int l;
		int k1;
		k1 = android.view.View.MeasureSpec.getMode(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #542 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore          8
		k = android.view.View.MeasureSpec.getSize(i);
	//    3    6:iload_1         
	//    4    7:invokestatic    #545 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5   10:istore          5
		l = android.view.View.MeasureSpec.getMode(j);
	//    6   12:iload_2         
	//    7   13:invokestatic    #542 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    8   16:istore          6
		j = android.view.View.MeasureSpec.getSize(j);
	//    9   18:iload_2         
	//   10   19:invokestatic    #545 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   11   22:istore_2        
		if(k1 == 0x40000000) goto _L2; else goto _L1
	//   12   23:iload           8
	//   13   25:ldc2            #546 <Int 0x40000000>
	//   14   28:icmpeq          254
_L1:
		if(!isInEditMode()) goto _L4; else goto _L3
	//   15   31:aload_0         
	//   16   32:invokevirtual   #549 <Method boolean isInEditMode()>
	//   17   35:ifeq            243
_L3:
		if(k1 != 0x80000000) goto _L6; else goto _L5
	//   18   38:iload           8
	//   19   40:ldc2            #550 <Int 0x80000000>
	//   20   43:icmpne          214
_L5:
		int j1;
		int l1;
		j1 = k;
	//   21   46:iload           5
	//   22   48:istore          7
		i = j;
	//   23   50:iload_2         
	//   24   51:istore_1        
		l1 = l;
	//   25   52:iload           6
	//   26   54:istore          9
_L19:
		k = 0;
	//   27   56:iconst_0        
	//   28   57:istore          5
		j = 0;
	//   29   59:iconst_0        
	//   30   60:istore_2        
		l1;
	//   31   61:iload           9
		JVM INSTR lookupswitch 2: default 88
	//	               -2147483648: 336
	//	               1073741824: 318;
	//   32   63:lookupswitch    2: default 88
	//	               -2147483648: 336
	//	               1073741824: 318
		   goto _L7 _L8 _L9
_L7:
		float f;
		int j2;
		int k3;
		int l3;
		boolean flag;
		f = 0.0F;
	//   33   88:fconst_0        
	//   34   89:fstore_3        
		flag = false;
	//   35   90:iconst_0        
	//   36   91:istore          15
		k3 = j1 - getPaddingLeft() - getPaddingRight();
	//   37   93:iload           7
	//   38   95:aload_0         
	//   39   96:invokevirtual   #510 <Method int getPaddingLeft()>
	//   40   99:isub            
	//   41  100:aload_0         
	//   42  101:invokevirtual   #507 <Method int getPaddingRight()>
	//   43  104:isub            
	//   44  105:istore          12
		k1 = k3;
	//   45  107:iload           12
	//   46  109:istore          8
		l3 = getChildCount();
	//   47  111:aload_0         
	//   48  112:invokevirtual   #250 <Method int getChildCount()>
	//   49  115:istore          13
		if(l3 > 2)
	//*  50  117:iload           13
	//*  51  119:iconst_2        
	//*  52  120:icmple          132
			Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
	//   53  123:ldc1            #52  <String "SlidingPaneLayout">
	//   54  125:ldc2            #552 <String "onMeasure: More than two child views are not supported.">
	//   55  128:invokestatic    #558 <Method int Log.e(String, String)>
	//   56  131:pop             
		mSlideableView = null;
	//   57  132:aload_0         
	//   58  133:aconst_null     
	//   59  134:putfield        #241 <Field View mSlideableView>
		j2 = 0;
	//   60  137:iconst_0        
	//   61  138:istore          10
_L14:
		if(j2 >= l3) goto _L11; else goto _L10
	//   62  140:iload           10
	//   63  142:iload           13
	//   64  144:icmpge          653
_L10:
		View view;
		LayoutParams layoutparams;
		view = getChildAt(j2);
	//   65  147:aload_0         
	//   66  148:iload           10
	//   67  150:invokevirtual   #254 <Method View getChildAt(int)>
	//   68  153:astore          17
		layoutparams = (LayoutParams)view.getLayoutParams();
	//   69  155:aload           17
	//   70  157:invokevirtual   #186 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   71  160:checkcast       #15  <Class SlidingPaneLayout$LayoutParams>
	//   72  163:astore          18
		if(view.getVisibility() != 8) goto _L13; else goto _L12
	//   73  165:aload           17
	//   74  167:invokevirtual   #516 <Method int View.getVisibility()>
	//   75  170:bipush          8
	//   76  172:icmpne          351
_L12:
		int l2;
		boolean flag1;
		layoutparams.dimWhenOffset = false;
	//   77  175:aload           18
	//   78  177:iconst_0        
	//   79  178:putfield        #244 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
		l2 = k1;
	//   80  181:iload           8
	//   81  183:istore          11
		l = k;
	//   82  185:iload           5
	//   83  187:istore          6
		flag1 = flag;
	//   84  189:iload           15
	//   85  191:istore          16
_L17:
		j2++;
	//   86  193:iload           10
	//   87  195:iconst_1        
	//   88  196:iadd            
	//   89  197:istore          10
		flag = flag1;
	//   90  199:iload           16
	//   91  201:istore          15
		k = l;
	//   92  203:iload           6
	//   93  205:istore          5
		k1 = l2;
	//   94  207:iload           11
	//   95  209:istore          8
		  goto _L14
	//*  96  211:goto            140
_L6:
		l1 = l;
	//   97  214:iload           6
	//   98  216:istore          9
		i = j;
	//   99  218:iload_2         
	//  100  219:istore_1        
		j1 = k;
	//  101  220:iload           5
	//  102  222:istore          7
		if(k1 == 0)
	//* 103  224:iload           8
	//* 104  226:ifne            56
		{
			j1 = 300;
	//  105  229:sipush          300
	//  106  232:istore          7
			l1 = l;
	//  107  234:iload           6
	//  108  236:istore          9
			i = j;
	//  109  238:iload_2         
	//  110  239:istore_1        
		}
		continue; /* Loop/switch isn't completed */
	//  111  240:goto            56
_L4:
		throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
	//  112  243:new             #560 <Class IllegalStateException>
	//  113  246:dup             
	//  114  247:ldc2            #562 <String "Width must have an exact value or MATCH_PARENT">
	//  115  250:invokespecial   #565 <Method void IllegalStateException(String)>
	//  116  253:athrow          
_L2:
		l1 = l;
	//  117  254:iload           6
	//  118  256:istore          9
		i = j;
	//  119  258:iload_2         
	//  120  259:istore_1        
		j1 = k;
	//  121  260:iload           5
	//  122  262:istore          7
		if(l == 0)
	//* 123  264:iload           6
	//* 124  266:ifne            56
			if(isInEditMode())
	//* 125  269:aload_0         
	//* 126  270:invokevirtual   #549 <Method boolean isInEditMode()>
	//* 127  273:ifeq            307
			{
				l1 = l;
	//  128  276:iload           6
	//  129  278:istore          9
				i = j;
	//  130  280:iload_2         
	//  131  281:istore_1        
				j1 = k;
	//  132  282:iload           5
	//  133  284:istore          7
				if(l == 0)
	//* 134  286:iload           6
	//* 135  288:ifne            56
				{
					l1 = 0x80000000;
	//  136  291:ldc2            #550 <Int 0x80000000>
	//  137  294:istore          9
					i = 300;
	//  138  296:sipush          300
	//  139  299:istore_1        
					j1 = k;
	//  140  300:iload           5
	//  141  302:istore          7
				}
			} else
	//* 142  304:goto            56
			{
				throw new IllegalStateException("Height must not be UNSPECIFIED");
	//  143  307:new             #560 <Class IllegalStateException>
	//  144  310:dup             
	//  145  311:ldc2            #567 <String "Height must not be UNSPECIFIED">
	//  146  314:invokespecial   #565 <Method void IllegalStateException(String)>
	//  147  317:athrow          
			}
		continue; /* Loop/switch isn't completed */
_L9:
		j = i - getPaddingTop() - getPaddingBottom();
	//  148  318:iload_1         
	//  149  319:aload_0         
	//  150  320:invokevirtual   #513 <Method int getPaddingTop()>
	//  151  323:isub            
	//  152  324:aload_0         
	//  153  325:invokevirtual   #570 <Method int getPaddingBottom()>
	//  154  328:isub            
	//  155  329:istore_2        
		k = j;
	//  156  330:iload_2         
	//  157  331:istore          5
		  goto _L7
	//* 158  333:goto            88
_L8:
		j = i - getPaddingTop() - getPaddingBottom();
	//  159  336:iload_1         
	//  160  337:aload_0         
	//  161  338:invokevirtual   #513 <Method int getPaddingTop()>
	//  162  341:isub            
	//  163  342:aload_0         
	//  164  343:invokevirtual   #570 <Method int getPaddingBottom()>
	//  165  346:isub            
	//  166  347:istore_2        
		  goto _L7
	//* 167  348:goto            88
_L13:
		float f1 = f;
	//  168  351:fload_3         
	//  169  352:fstore          4
		if(layoutparams.weight <= 0.0F) goto _L16; else goto _L15
	//  170  354:aload           18
	//  171  356:getfield        #573 <Field float SlidingPaneLayout$LayoutParams.weight>
	//  172  359:fconst_0        
	//  173  360:fcmpl           
	//  174  361:ifle            396
_L15:
		f1 = f + layoutparams.weight;
	//  175  364:fload_3         
	//  176  365:aload           18
	//  177  367:getfield        #573 <Field float SlidingPaneLayout$LayoutParams.weight>
	//  178  370:fadd            
	//  179  371:fstore          4
		flag1 = flag;
	//  180  373:iload           15
	//  181  375:istore          16
		l = k;
	//  182  377:iload           5
	//  183  379:istore          6
		f = f1;
	//  184  381:fload           4
	//  185  383:fstore_3        
		l2 = k1;
	//  186  384:iload           8
	//  187  386:istore          11
		if(layoutparams.width == 0) goto _L17; else goto _L16
	//  188  388:aload           18
	//  189  390:getfield        #576 <Field int SlidingPaneLayout$LayoutParams.width>
	//  190  393:ifeq            193
_L16:
		i = layoutparams.leftMargin + layoutparams.rightMargin;
	//  191  396:aload           18
	//  192  398:getfield        #257 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//  193  401:aload           18
	//  194  403:getfield        #247 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//  195  406:iadd            
	//  196  407:istore_1        
		if(layoutparams.width == -2)
	//* 197  408:aload           18
	//* 198  410:getfield        #576 <Field int SlidingPaneLayout$LayoutParams.width>
	//* 199  413:bipush          -2
	//* 200  415:icmpne          572
			i = android.view.View.MeasureSpec.makeMeasureSpec(k3 - i, 0x80000000);
	//  201  418:iload           12
	//  202  420:iload_1         
	//  203  421:isub            
	//  204  422:ldc2            #550 <Int 0x80000000>
	//  205  425:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  206  428:istore_1        
		else
	//* 207  429:aload           18
	//* 208  431:getfield        #582 <Field int SlidingPaneLayout$LayoutParams.height>
	//* 209  434:bipush          -2
	//* 210  436:icmpne          610
	//* 211  439:iload_2         
	//* 212  440:ldc2            #550 <Int 0x80000000>
	//* 213  443:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 214  446:istore          6
	//* 215  448:aload           17
	//* 216  450:iload_1         
	//* 217  451:iload           6
	//* 218  453:invokevirtual   #585 <Method void View.measure(int, int)>
	//* 219  456:aload           17
	//* 220  458:invokevirtual   #519 <Method int View.getMeasuredWidth()>
	//* 221  461:istore          6
	//* 222  463:aload           17
	//* 223  465:invokevirtual   #524 <Method int View.getMeasuredHeight()>
	//* 224  468:istore          11
	//* 225  470:iload           5
	//* 226  472:istore_1        
	//* 227  473:iload           9
	//* 228  475:ldc2            #550 <Int 0x80000000>
	//* 229  478:icmpne          498
	//* 230  481:iload           5
	//* 231  483:istore_1        
	//* 232  484:iload           11
	//* 233  486:iload           5
	//* 234  488:icmple          498
	//* 235  491:iload           11
	//* 236  493:iload_2         
	//* 237  494:invokestatic    #407 <Method int Math.min(int, int)>
	//* 238  497:istore_1        
	//* 239  498:iload           8
	//* 240  500:iload           6
	//* 241  502:isub            
	//* 242  503:istore          5
	//* 243  505:iload           5
	//* 244  507:ifge            647
	//* 245  510:iconst_1        
	//* 246  511:istore          16
	//* 247  513:aload           18
	//* 248  515:iload           16
	//* 249  517:putfield        #380 <Field boolean SlidingPaneLayout$LayoutParams.slideable>
	//* 250  520:iload           15
	//* 251  522:iload           16
	//* 252  524:ior             
	//* 253  525:istore          15
	//* 254  527:iload           15
	//* 255  529:istore          16
	//* 256  531:iload_1         
	//* 257  532:istore          6
	//* 258  534:fload           4
	//* 259  536:fstore_3        
	//* 260  537:iload           5
	//* 261  539:istore          11
	//* 262  541:aload           18
	//* 263  543:getfield        #380 <Field boolean SlidingPaneLayout$LayoutParams.slideable>
	//* 264  546:ifeq            193
	//* 265  549:aload_0         
	//* 266  550:aload           17
	//* 267  552:putfield        #241 <Field View mSlideableView>
	//* 268  555:iload           15
	//* 269  557:istore          16
	//* 270  559:iload_1         
	//* 271  560:istore          6
	//* 272  562:fload           4
	//* 273  564:fstore_3        
	//* 274  565:iload           5
	//* 275  567:istore          11
	//* 276  569:goto            193
		if(layoutparams.width == -1)
	//* 277  572:aload           18
	//* 278  574:getfield        #576 <Field int SlidingPaneLayout$LayoutParams.width>
	//* 279  577:iconst_m1       
	//* 280  578:icmpne          595
			i = android.view.View.MeasureSpec.makeMeasureSpec(k3 - i, 0x40000000);
	//  281  581:iload           12
	//  282  583:iload_1         
	//  283  584:isub            
	//  284  585:ldc2            #546 <Int 0x40000000>
	//  285  588:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  286  591:istore_1        
		else
	//* 287  592:goto            429
			i = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.width, 0x40000000);
	//  288  595:aload           18
	//  289  597:getfield        #576 <Field int SlidingPaneLayout$LayoutParams.width>
	//  290  600:ldc2            #546 <Int 0x40000000>
	//  291  603:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  292  606:istore_1        
		if(layoutparams.height == -2)
			l = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x80000000);
		else
	//* 293  607:goto            429
		if(layoutparams.height == -1)
	//* 294  610:aload           18
	//* 295  612:getfield        #582 <Field int SlidingPaneLayout$LayoutParams.height>
	//* 296  615:iconst_m1       
	//* 297  616:icmpne          631
			l = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
	//  298  619:iload_2         
	//  299  620:ldc2            #546 <Int 0x40000000>
	//  300  623:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  301  626:istore          6
		else
	//* 302  628:goto            448
			l = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000);
	//  303  631:aload           18
	//  304  633:getfield        #582 <Field int SlidingPaneLayout$LayoutParams.height>
	//  305  636:ldc2            #546 <Int 0x40000000>
	//  306  639:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  307  642:istore          6
		view.measure(i, l);
		l = view.getMeasuredWidth();
		l2 = view.getMeasuredHeight();
		i = k;
		if(l1 == 0x80000000)
		{
			i = k;
			if(l2 > k)
				i = Math.min(l2, j);
		}
		k = k1 - l;
		if(k < 0)
			flag1 = true;
		else
	//* 308  644:goto            448
			flag1 = false;
	//  309  647:iconst_0        
	//  310  648:istore          16
		layoutparams.slideable = flag1;
		flag |= flag1;
		flag1 = flag;
		l = i;
		f = f1;
		l2 = k;
		if(layoutparams.slideable)
		{
			mSlideableView = view;
			flag1 = flag;
			l = i;
			f = f1;
			l2 = k;
		}
		  goto _L17
	//* 311  650:goto            513
_L11:
		if(flag || f > 0.0F)
	//* 312  653:iload           15
	//* 313  655:ifne            664
	//* 314  658:fload_3         
	//* 315  659:fconst_0        
	//* 316  660:fcmpl           
	//* 317  661:ifle            1073
		{
			int k2 = k3 - mOverhangSize;
	//  318  664:iload           12
	//  319  666:aload_0         
	//  320  667:getfield        #139 <Field int mOverhangSize>
	//  321  670:isub            
	//  322  671:istore          10
			int i1 = 0;
	//  323  673:iconst_0        
	//  324  674:istore          6
			while(i1 < l3) 
	//* 325  676:iload           6
	//* 326  678:iload           13
	//* 327  680:icmpge          1073
			{
				View view1 = getChildAt(i1);
	//  328  683:aload_0         
	//  329  684:iload           6
	//  330  686:invokevirtual   #254 <Method View getChildAt(int)>
	//  331  689:astore          17
				if(view1.getVisibility() != 8)
	//* 332  691:aload           17
	//* 333  693:invokevirtual   #516 <Method int View.getVisibility()>
	//* 334  696:bipush          8
	//* 335  698:icmpne          710
	//* 336  701:iload           6
	//* 337  703:iconst_1        
	//* 338  704:iadd            
	//* 339  705:istore          6
	//* 340  707:goto            676
				{
					LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//  341  710:aload           17
	//  342  712:invokevirtual   #186 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  343  715:checkcast       #15  <Class SlidingPaneLayout$LayoutParams>
	//  344  718:astore          18
					if(view1.getVisibility() != 8)
	//* 345  720:aload           17
	//* 346  722:invokevirtual   #516 <Method int View.getVisibility()>
	//* 347  725:bipush          8
	//* 348  727:icmpeq          701
					{
						int i2;
						if(layoutparams1.width == 0 && layoutparams1.weight > 0.0F)
	//* 349  730:aload           18
	//* 350  732:getfield        #576 <Field int SlidingPaneLayout$LayoutParams.width>
	//* 351  735:ifne            835
	//* 352  738:aload           18
	//* 353  740:getfield        #573 <Field float SlidingPaneLayout$LayoutParams.weight>
	//* 354  743:fconst_0        
	//* 355  744:fcmpl           
	//* 356  745:ifle            835
							i = 1;
	//  357  748:iconst_1        
	//  358  749:istore_1        
						else
	//* 359  750:iload_1         
	//* 360  751:ifeq            840
	//* 361  754:iconst_0        
	//* 362  755:istore          9
	//* 363  757:iload           15
	//* 364  759:ifeq            900
	//* 365  762:aload           17
	//* 366  764:aload_0         
	//* 367  765:getfield        #241 <Field View mSlideableView>
	//* 368  768:if_acmpeq       900
	//* 369  771:aload           18
	//* 370  773:getfield        #576 <Field int SlidingPaneLayout$LayoutParams.width>
	//* 371  776:ifge            701
	//* 372  779:iload           9
	//* 373  781:iload           10
	//* 374  783:icmpgt          796
	//* 375  786:aload           18
	//* 376  788:getfield        #573 <Field float SlidingPaneLayout$LayoutParams.weight>
	//* 377  791:fconst_0        
	//* 378  792:fcmpl           
	//* 379  793:ifle            701
	//* 380  796:iload_1         
	//* 381  797:ifeq            885
	//* 382  800:aload           18
	//* 383  802:getfield        #582 <Field int SlidingPaneLayout$LayoutParams.height>
	//* 384  805:bipush          -2
	//* 385  807:icmpne          850
	//* 386  810:iload_2         
	//* 387  811:ldc2            #550 <Int 0x80000000>
	//* 388  814:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 389  817:istore_1        
	//* 390  818:aload           17
	//* 391  820:iload           10
	//* 392  822:ldc2            #546 <Int 0x40000000>
	//* 393  825:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 394  828:iload_1         
	//* 395  829:invokevirtual   #585 <Method void View.measure(int, int)>
	//* 396  832:goto            701
							i = 0;
	//  397  835:iconst_0        
	//  398  836:istore_1        
						if(i != 0)
							i2 = 0;
						else
	//* 399  837:goto            750
							i2 = view1.getMeasuredWidth();
	//  400  840:aload           17
	//  401  842:invokevirtual   #519 <Method int View.getMeasuredWidth()>
	//  402  845:istore          9
						if(flag && view1 != mSlideableView)
						{
							if(layoutparams1.width < 0 && (i2 > k2 || layoutparams1.weight > 0.0F))
							{
								if(i != 0)
								{
									if(layoutparams1.height == -2)
										i = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x80000000);
									else
	//* 403  847:goto            757
									if(layoutparams1.height == -1)
	//* 404  850:aload           18
	//* 405  852:getfield        #582 <Field int SlidingPaneLayout$LayoutParams.height>
	//* 406  855:iconst_m1       
	//* 407  856:icmpne          870
										i = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
	//  408  859:iload_2         
	//  409  860:ldc2            #546 <Int 0x40000000>
	//  410  863:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  411  866:istore_1        
									else
	//* 412  867:goto            818
										i = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams1.height, 0x40000000);
	//  413  870:aload           18
	//  414  872:getfield        #582 <Field int SlidingPaneLayout$LayoutParams.height>
	//  415  875:ldc2            #546 <Int 0x40000000>
	//  416  878:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  417  881:istore_1        
								} else
	//* 418  882:goto            818
								{
									i = android.view.View.MeasureSpec.makeMeasureSpec(view1.getMeasuredHeight(), 0x40000000);
	//  419  885:aload           17
	//  420  887:invokevirtual   #524 <Method int View.getMeasuredHeight()>
	//  421  890:ldc2            #546 <Int 0x40000000>
	//  422  893:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  423  896:istore_1        
								}
								view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(k2, 0x40000000), i);
							}
						} else
	//* 424  897:goto            818
						if(layoutparams1.weight > 0.0F)
	//* 425  900:aload           18
	//* 426  902:getfield        #573 <Field float SlidingPaneLayout$LayoutParams.weight>
	//* 427  905:fconst_0        
	//* 428  906:fcmpl           
	//* 429  907:ifle            701
						{
							if(layoutparams1.width == 0)
	//* 430  910:aload           18
	//* 431  912:getfield        #576 <Field int SlidingPaneLayout$LayoutParams.width>
	//* 432  915:ifne            1020
							{
								if(layoutparams1.height == -2)
	//* 433  918:aload           18
	//* 434  920:getfield        #582 <Field int SlidingPaneLayout$LayoutParams.height>
	//* 435  923:bipush          -2
	//* 436  925:icmpne          985
									i = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x80000000);
	//  437  928:iload_2         
	//  438  929:ldc2            #550 <Int 0x80000000>
	//  439  932:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  440  935:istore_1        
								else
	//* 441  936:iload           15
	//* 442  938:ifeq            1035
	//* 443  941:iload           12
	//* 444  943:aload           18
	//* 445  945:getfield        #257 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//* 446  948:aload           18
	//* 447  950:getfield        #247 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//* 448  953:iadd            
	//* 449  954:isub            
	//* 450  955:istore          11
	//* 451  957:iload           11
	//* 452  959:ldc2            #546 <Int 0x40000000>
	//* 453  962:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 454  965:istore          14
	//* 455  967:iload           9
	//* 456  969:iload           11
	//* 457  971:icmpeq          701
	//* 458  974:aload           17
	//* 459  976:iload           14
	//* 460  978:iload_1         
	//* 461  979:invokevirtual   #585 <Method void View.measure(int, int)>
	//* 462  982:goto            701
								if(layoutparams1.height == -1)
	//* 463  985:aload           18
	//* 464  987:getfield        #582 <Field int SlidingPaneLayout$LayoutParams.height>
	//* 465  990:iconst_m1       
	//* 466  991:icmpne          1005
									i = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
	//  467  994:iload_2         
	//  468  995:ldc2            #546 <Int 0x40000000>
	//  469  998:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  470 1001:istore_1        
								else
	//* 471 1002:goto            936
									i = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams1.height, 0x40000000);
	//  472 1005:aload           18
	//  473 1007:getfield        #582 <Field int SlidingPaneLayout$LayoutParams.height>
	//  474 1010:ldc2            #546 <Int 0x40000000>
	//  475 1013:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  476 1016:istore_1        
							} else
	//* 477 1017:goto            936
							{
								i = android.view.View.MeasureSpec.makeMeasureSpec(view1.getMeasuredHeight(), 0x40000000);
	//  478 1020:aload           17
	//  479 1022:invokevirtual   #524 <Method int View.getMeasuredHeight()>
	//  480 1025:ldc2            #546 <Int 0x40000000>
	//  481 1028:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  482 1031:istore_1        
							}
							if(flag)
							{
								int i3 = k3 - (layoutparams1.leftMargin + layoutparams1.rightMargin);
								int i4 = android.view.View.MeasureSpec.makeMeasureSpec(i3, 0x40000000);
								if(i2 != i3)
									view1.measure(i4, i);
							} else
	//* 483 1032:goto            936
							{
								int j3 = Math.max(0, k1);
	//  484 1035:iconst_0        
	//  485 1036:iload           8
	//  486 1038:invokestatic    #393 <Method int Math.max(int, int)>
	//  487 1041:istore          11
								view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(i2 + (int)((layoutparams1.weight * (float)j3) / f), 0x40000000), i);
	//  488 1043:aload           17
	//  489 1045:iload           9
	//  490 1047:aload           18
	//  491 1049:getfield        #573 <Field float SlidingPaneLayout$LayoutParams.weight>
	//  492 1052:iload           11
	//  493 1054:i2f             
	//  494 1055:fmul            
	//  495 1056:fload_3         
	//  496 1057:fdiv            
	//  497 1058:f2i             
	//  498 1059:iadd            
	//  499 1060:ldc2            #546 <Int 0x40000000>
	//  500 1063:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  501 1066:iload_1         
	//  502 1067:invokevirtual   #585 <Method void View.measure(int, int)>
							}
						}
					}
				}
				i1++;
			}
		}
	//* 503 1070:goto            701
		setMeasuredDimension(j1, getPaddingTop() + k + getPaddingBottom());
	//  504 1073:aload_0         
	//  505 1074:iload           7
	//  506 1076:aload_0         
	//  507 1077:invokevirtual   #513 <Method int getPaddingTop()>
	//  508 1080:iload           5
	//  509 1082:iadd            
	//  510 1083:aload_0         
	//  511 1084:invokevirtual   #570 <Method int getPaddingBottom()>
	//  512 1087:iadd            
	//  513 1088:invokevirtual   #588 <Method void setMeasuredDimension(int, int)>
		mCanSlide = flag;
	//  514 1091:aload_0         
	//  515 1092:iload           15
	//  516 1094:putfield        #315 <Field boolean mCanSlide>
		if(mDragHelper.getViewDragState() != 0 && !flag)
	//* 517 1097:aload_0         
	//* 518 1098:getfield        #165 <Field ViewDragHelper mDragHelper>
	//* 519 1101:invokevirtual   #591 <Method int ViewDragHelper.getViewDragState()>
	//* 520 1104:ifeq            1119
	//* 521 1107:iload           15
	//* 522 1109:ifne            1119
			mDragHelper.abort();
	//  523 1112:aload_0         
	//  524 1113:getfield        #165 <Field ViewDragHelper mDragHelper>
	//  525 1116:invokevirtual   #330 <Method void ViewDragHelper.abort()>
		return;
	//  526 1119:return          
		if(true) goto _L19; else goto _L18
_L18:
	}

	void onPanelDragged(int i)
	{
		if(mSlideableView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #241 <Field View mSlideableView>
	//*   2    4:ifnonnull       13
		{
			mSlideOffset = 0.0F;
	//    3    7:aload_0         
	//    4    8:fconst_0        
	//    5    9:putfield        #349 <Field float mSlideOffset>
			return;
	//    6   12:return          
		}
		boolean flag = isLayoutRtlSupport();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #239 <Method boolean isLayoutRtlSupport()>
	//    9   17:istore          4
		LayoutParams layoutparams = (LayoutParams)mSlideableView.getLayoutParams();
	//   10   19:aload_0         
	//   11   20:getfield        #241 <Field View mSlideableView>
	//   12   23:invokevirtual   #186 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   13   26:checkcast       #15  <Class SlidingPaneLayout$LayoutParams>
	//   14   29:astore          5
		int j = mSlideableView.getWidth();
	//   15   31:aload_0         
	//   16   32:getfield        #241 <Field View mSlideableView>
	//   17   35:invokevirtual   #530 <Method int View.getWidth()>
	//   18   38:istore_2        
		if(flag)
	//*  19   39:iload           4
	//*  20   41:ifeq            138
			i = getWidth() - i - j;
	//   21   44:aload_0         
	//   22   45:invokevirtual   #593 <Method int getWidth()>
	//   23   48:iload_1         
	//   24   49:isub            
	//   25   50:iload_2         
	//   26   51:isub            
	//   27   52:istore_1        
		int k;
		if(flag)
	//*  28   53:iload           4
	//*  29   55:ifeq            141
			j = getPaddingRight();
	//   30   58:aload_0         
	//   31   59:invokevirtual   #507 <Method int getPaddingRight()>
	//   32   62:istore_2        
		else
	//*  33   63:iload           4
	//*  34   65:ifeq            149
	//*  35   68:aload           5
	//*  36   70:getfield        #247 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//*  37   73:istore_3        
	//*  38   74:aload_0         
	//*  39   75:iload_1         
	//*  40   76:iload_2         
	//*  41   77:iload_3         
	//*  42   78:iadd            
	//*  43   79:isub            
	//*  44   80:i2f             
	//*  45   81:aload_0         
	//*  46   82:getfield        #521 <Field int mSlideRange>
	//*  47   85:i2f             
	//*  48   86:fdiv            
	//*  49   87:putfield        #349 <Field float mSlideOffset>
	//*  50   90:aload_0         
	//*  51   91:getfield        #261 <Field int mParallaxBy>
	//*  52   94:ifeq            105
	//*  53   97:aload_0         
	//*  54   98:aload_0         
	//*  55   99:getfield        #349 <Field float mSlideOffset>
	//*  56  102:invokespecial   #532 <Method void parallaxOtherViews(float)>
	//*  57  105:aload           5
	//*  58  107:getfield        #244 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
	//*  59  110:ifeq            129
	//*  60  113:aload_0         
	//*  61  114:aload_0         
	//*  62  115:getfield        #241 <Field View mSlideableView>
	//*  63  118:aload_0         
	//*  64  119:getfield        #349 <Field float mSlideOffset>
	//*  65  122:aload_0         
	//*  66  123:getfield        #106 <Field int mSliderFadeColor>
	//*  67  126:invokespecial   #269 <Method void dimChildView(View, float, int)>
	//*  68  129:aload_0         
	//*  69  130:aload_0         
	//*  70  131:getfield        #241 <Field View mSlideableView>
	//*  71  134:invokevirtual   #595 <Method void dispatchOnPanelSlide(View)>
	//*  72  137:return          
	//*  73  138:goto            53
			j = getPaddingLeft();
	//   74  141:aload_0         
	//   75  142:invokevirtual   #510 <Method int getPaddingLeft()>
	//   76  145:istore_2        
		if(flag)
			k = layoutparams.rightMargin;
		else
	//*  77  146:goto            63
			k = layoutparams.leftMargin;
	//   78  149:aload           5
	//   79  151:getfield        #257 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//   80  154:istore_3        
		mSlideOffset = (float)(i - (j + k)) / (float)mSlideRange;
		if(mParallaxBy != 0)
			parallaxOtherViews(mSlideOffset);
		if(layoutparams.dimWhenOffset)
			dimChildView(mSlideableView, mSlideOffset, mSliderFadeColor);
		dispatchOnPanelSlide(mSlideableView);
	//*  81  155:goto            74
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
	//    5    9:invokespecial   #599 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
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
	//   12   20:invokevirtual   #603 <Method Parcelable SlidingPaneLayout$SavedState.getSuperState()>
	//   13   23:invokespecial   #599 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
		if(((SavedState) (parcelable)).isOpen)
	//*  14   26:aload_1         
	//*  15   27:getfield        #605 <Field boolean SlidingPaneLayout$SavedState.isOpen>
	//*  16   30:ifeq            47
			openPane();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #607 <Method boolean openPane()>
	//   19   37:pop             
		else
	//*  20   38:aload_0         
	//*  21   39:aload_1         
	//*  22   40:getfield        #605 <Field boolean SlidingPaneLayout$SavedState.isOpen>
	//*  23   43:putfield        #178 <Field boolean mPreservedOpenState>
	//*  24   46:return          
			closePane();
	//   25   47:aload_0         
	//   26   48:invokevirtual   #609 <Method boolean closePane()>
	//   27   51:pop             
		mPreservedOpenState = ((SavedState) (parcelable)).isOpen;
	//*  28   52:goto            38
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #21  <Class SlidingPaneLayout$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #612 <Method Parcelable ViewGroup.onSaveInstanceState()>
	//    4    8:invokespecial   #614 <Method void SlidingPaneLayout$SavedState(Parcelable)>
	//    5   11:astore_2        
		boolean flag;
		if(isSlideable())
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #616 <Method boolean isSlideable()>
	//*   8   16:ifeq            31
			flag = isOpen();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #618 <Method boolean isOpen()>
	//   11   23:istore_1        
		else
	//*  12   24:aload_2         
	//*  13   25:iload_1         
	//*  14   26:putfield        #605 <Field boolean SlidingPaneLayout$SavedState.isOpen>
	//*  15   29:aload_2         
	//*  16   30:areturn         
			flag = mPreservedOpenState;
	//   17   31:aload_0         
	//   18   32:getfield        #178 <Field boolean mPreservedOpenState>
	//   19   35:istore_1        
		savedstate.isOpen = flag;
		return ((Parcelable) (savedstate));
	//*  20   36:goto            24
	}

	protected void onSizeChanged(int i, int j, int k, int l)
	{
		super.onSizeChanged(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #621 <Method void ViewGroup.onSizeChanged(int, int, int, int)>
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
		boolean flag;
		if(!mCanSlide)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field boolean mCanSlide>
	//*   2    4:ifne            17
		{
			flag = super.onTouchEvent(motionevent);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #624 <Method boolean ViewGroup.onTouchEvent(MotionEvent)>
	//    6   12:istore          7
		} else
	//*   7   14:iload           7
	//*   8   16:ireturn         
		{
			mDragHelper.processTouchEvent(motionevent);
	//    9   17:aload_0         
	//   10   18:getfield        #165 <Field ViewDragHelper mDragHelper>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #628 <Method void ViewDragHelper.processTouchEvent(MotionEvent)>
			boolean flag1 = true;
	//   13   25:iconst_1        
	//   14   26:istore          8
			switch(motionevent.getActionMasked())
	//*  15   28:aload_1         
	//*  16   29:invokevirtual   #465 <Method int MotionEvent.getActionMasked()>
			{
	//*  17   32:tableswitch     0 1: default 56
	//	               0 58
	//	               1 80
			default:
				return true;
	//   18   56:iconst_1        
	//   19   57:ireturn         

			case 0: // '\0'
				float f = motionevent.getX();
	//   20   58:aload_1         
	//   21   59:invokevirtual   #469 <Method float MotionEvent.getX()>
	//   22   62:fstore_2        
				float f2 = motionevent.getY();
	//   23   63:aload_1         
	//   24   64:invokevirtual   #472 <Method float MotionEvent.getY()>
	//   25   67:fstore_3        
				mInitialMotionX = f;
	//   26   68:aload_0         
	//   27   69:fload_2         
	//   28   70:putfield        #488 <Field float mInitialMotionX>
				mInitialMotionY = f2;
	//   29   73:aload_0         
	//   30   74:fload_3         
	//   31   75:putfield        #490 <Field float mInitialMotionY>
				return true;
	//   32   78:iconst_1        
	//   33   79:ireturn         

			case 1: // '\001'
				flag = flag1;
	//   34   80:iload           8
	//   35   82:istore          7
				break;
			}
			if(isDimmed(mSlideableView))
	//*  36   84:aload_0         
	//*  37   85:aload_0         
	//*  38   86:getfield        #241 <Field View mSlideableView>
	//*  39   89:invokevirtual   #492 <Method boolean isDimmed(View)>
	//*  40   92:ifeq            14
			{
				float f1 = motionevent.getX();
	//   41   95:aload_1         
	//   42   96:invokevirtual   #469 <Method float MotionEvent.getX()>
	//   43   99:fstore_2        
				float f3 = motionevent.getY();
	//   44  100:aload_1         
	//   45  101:invokevirtual   #472 <Method float MotionEvent.getY()>
	//   46  104:fstore_3        
				float f4 = f1 - mInitialMotionX;
	//   47  105:fload_2         
	//   48  106:aload_0         
	//   49  107:getfield        #488 <Field float mInitialMotionX>
	//   50  110:fsub            
	//   51  111:fstore          4
				float f5 = f3 - mInitialMotionY;
	//   52  113:fload_3         
	//   53  114:aload_0         
	//   54  115:getfield        #490 <Field float mInitialMotionY>
	//   55  118:fsub            
	//   56  119:fstore          5
				int i = mDragHelper.getTouchSlop();
	//   57  121:aload_0         
	//   58  122:getfield        #165 <Field ViewDragHelper mDragHelper>
	//   59  125:invokevirtual   #499 <Method int ViewDragHelper.getTouchSlop()>
	//   60  128:istore          6
				flag = flag1;
	//   61  130:iload           8
	//   62  132:istore          7
				if(f4 * f4 + f5 * f5 < (float)(i * i))
	//*  63  134:fload           4
	//*  64  136:fload           4
	//*  65  138:fmul            
	//*  66  139:fload           5
	//*  67  141:fload           5
	//*  68  143:fmul            
	//*  69  144:fadd            
	//*  70  145:iload           6
	//*  71  147:iload           6
	//*  72  149:imul            
	//*  73  150:i2f             
	//*  74  151:fcmpg           
	//*  75  152:ifge            14
				{
					flag = flag1;
	//   76  155:iload           8
	//   77  157:istore          7
					if(mDragHelper.isViewUnder(mSlideableView, (int)f1, (int)f3))
	//*  78  159:aload_0         
	//*  79  160:getfield        #165 <Field ViewDragHelper mDragHelper>
	//*  80  163:aload_0         
	//*  81  164:getfield        #241 <Field View mSlideableView>
	//*  82  167:fload_2         
	//*  83  168:f2i             
	//*  84  169:fload_3         
	//*  85  170:f2i             
	//*  86  171:invokevirtual   #476 <Method boolean ViewDragHelper.isViewUnder(View, int, int)>
	//*  87  174:ifeq            14
					{
						closePane(mSlideableView, 0);
	//   88  177:aload_0         
	//   89  178:aload_0         
	//   90  179:getfield        #241 <Field View mSlideableView>
	//   91  182:iconst_0        
	//   92  183:invokespecial   #322 <Method boolean closePane(View, int)>
	//   93  186:pop             
						return true;
	//   94  187:iconst_1        
	//   95  188:ireturn         
					}
				}
			}
		}
		return flag;
	}

	public boolean openPane()
	{
		return openPane(mSlideableView, 0);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #241 <Field View mSlideableView>
	//    3    5:iconst_0        
	//    4    6:invokespecial   #630 <Method boolean openPane(View, int)>
	//    5    9:ireturn         
	}

	public void requestChildFocus(View view, View view1)
	{
		super.requestChildFocus(view, view1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #634 <Method void ViewGroup.requestChildFocus(View, View)>
		if(!isInTouchMode() && !mCanSlide)
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #637 <Method boolean isInTouchMode()>
	//*   6   10:ifne            35
	//*   7   13:aload_0         
	//*   8   14:getfield        #315 <Field boolean mCanSlide>
	//*   9   17:ifne            35
		{
			boolean flag;
			if(view == mSlideableView)
	//*  10   20:aload_1         
	//*  11   21:aload_0         
	//*  12   22:getfield        #241 <Field View mSlideableView>
	//*  13   25:if_acmpne       36
				flag = true;
	//   14   28:iconst_1        
	//   15   29:istore_3        
			else
	//*  16   30:aload_0         
	//*  17   31:iload_3         
	//*  18   32:putfield        #178 <Field boolean mPreservedOpenState>
	//*  19   35:return          
				flag = false;
	//   20   36:iconst_0        
	//   21   37:istore_3        
			mPreservedOpenState = flag;
		}
	//*  22   38:goto            30
	}

	void setAllChildrenVisible()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		for(int j = getChildCount(); i < j; i++)
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #250 <Method int getChildCount()>
	//*   4    6:istore_2        
	//*   5    7:iload_1         
	//*   6    8:iload_2         
	//*   7    9:icmpge          38
		{
			View view = getChildAt(i);
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:invokevirtual   #254 <Method View getChildAt(int)>
	//   11   17:astore_3        
			if(view.getVisibility() == 4)
	//*  12   18:aload_3         
	//*  13   19:invokevirtual   #516 <Method int View.getVisibility()>
	//*  14   22:iconst_4        
	//*  15   23:icmpne          31
				view.setVisibility(0);
	//   16   26:aload_3         
	//   17   27:iconst_0        
	//   18   28:invokevirtual   #641 <Method void View.setVisibility(int)>
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
	//    2    2:putfield        #267 <Field int mCoveredFadeColor>
	//    3    5:return          
	}

	public void setPanelSlideListener(PanelSlideListener panelslidelistener)
	{
		mPanelSlideListener = panelslidelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #336 <Field SlidingPaneLayout$PanelSlideListener mPanelSlideListener>
	//    3    5:return          
	}

	public void setParallaxDistance(int i)
	{
		mParallaxBy = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #261 <Field int mParallaxBy>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #649 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setShadowDrawable(Drawable drawable)
	{
		setShadowDrawableLeft(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #654 <Method void setShadowDrawableLeft(Drawable)>
	//    3    5:return          
	}

	public void setShadowDrawableLeft(Drawable drawable)
	{
		mShadowDrawableLeft = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #361 <Field Drawable mShadowDrawableLeft>
	//    3    5:return          
	}

	public void setShadowDrawableRight(Drawable drawable)
	{
		mShadowDrawableRight = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #359 <Field Drawable mShadowDrawableRight>
	//    3    5:return          
	}

	public void setShadowResource(int i)
	{
		setShadowDrawable(getResources().getDrawable(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #658 <Method Resources getResources()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #662 <Method Drawable Resources.getDrawable(int)>
	//    5    9:invokevirtual   #664 <Method void setShadowDrawable(Drawable)>
	//    6   12:return          
	}

	public void setShadowResourceLeft(int i)
	{
		setShadowDrawableLeft(ContextCompat.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #415 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #670 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    5    9:invokevirtual   #654 <Method void setShadowDrawableLeft(Drawable)>
	//    6   12:return          
	}

	public void setShadowResourceRight(int i)
	{
		setShadowDrawableRight(ContextCompat.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #415 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #670 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    5    9:invokevirtual   #673 <Method void setShadowDrawableRight(Drawable)>
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
	//    1    1:invokevirtual   #609 <Method boolean closePane()>
	//    2    4:pop             
	//    3    5:return          
	}

	public void smoothSlideOpen()
	{
		openPane();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #607 <Method boolean openPane()>
	//    2    4:pop             
	//    3    5:return          
	}

	boolean smoothSlideTo(float f, int i)
	{
		if(mCanSlide)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field boolean mCanSlide>
	//*   2    4:ifne            9
	//*   3    7:iconst_0        
	//*   4    8:ireturn         
		{
			boolean flag = isLayoutRtlSupport();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #239 <Method boolean isLayoutRtlSupport()>
	//    7   13:istore          5
			LayoutParams layoutparams = (LayoutParams)mSlideableView.getLayoutParams();
	//    8   15:aload_0         
	//    9   16:getfield        #241 <Field View mSlideableView>
	//   10   19:invokevirtual   #186 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   11   22:checkcast       #15  <Class SlidingPaneLayout$LayoutParams>
	//   12   25:astore          6
			if(flag)
	//*  13   27:iload           5
	//*  14   29:ifeq            108
			{
				i = getPaddingRight();
	//   15   32:aload_0         
	//   16   33:invokevirtual   #507 <Method int getPaddingRight()>
	//   17   36:istore_2        
				int j = layoutparams.rightMargin;
	//   18   37:aload           6
	//   19   39:getfield        #247 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//   20   42:istore_3        
				int k = mSlideableView.getWidth();
	//   21   43:aload_0         
	//   22   44:getfield        #241 <Field View mSlideableView>
	//   23   47:invokevirtual   #530 <Method int View.getWidth()>
	//   24   50:istore          4
				i = (int)((float)getWidth() - ((float)(i + j) + (float)mSlideRange * f + (float)k));
	//   25   52:aload_0         
	//   26   53:invokevirtual   #593 <Method int getWidth()>
	//   27   56:i2f             
	//   28   57:iload_2         
	//   29   58:iload_3         
	//   30   59:iadd            
	//   31   60:i2f             
	//   32   61:aload_0         
	//   33   62:getfield        #521 <Field int mSlideRange>
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
	//*  44   76:aload_0         
	//*  45   77:getfield        #165 <Field ViewDragHelper mDragHelper>
	//*  46   80:aload_0         
	//*  47   81:getfield        #241 <Field View mSlideableView>
	//*  48   84:iload_2         
	//*  49   85:aload_0         
	//*  50   86:getfield        #241 <Field View mSlideableView>
	//*  51   89:invokevirtual   #302 <Method int View.getTop()>
	//*  52   92:invokevirtual   #679 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//*  53   95:ifeq            7
	//*  54   98:aload_0         
	//*  55   99:invokevirtual   #681 <Method void setAllChildrenVisible()>
	//*  56  102:aload_0         
	//*  57  103:invokestatic    #333 <Method void ViewCompat.postInvalidateOnAnimation(View)>
	//*  58  106:iconst_1        
	//*  59  107:ireturn         
			{
				i = (int)((float)(getPaddingLeft() + layoutparams.leftMargin) + (float)mSlideRange * f);
	//   60  108:aload_0         
	//   61  109:invokevirtual   #510 <Method int getPaddingLeft()>
	//   62  112:aload           6
	//   63  114:getfield        #257 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//   64  117:iadd            
	//   65  118:i2f             
	//   66  119:aload_0         
	//   67  120:getfield        #521 <Field int mSlideRange>
	//   68  123:i2f             
	//   69  124:fload_1         
	//   70  125:fmul            
	//   71  126:fadd            
	//   72  127:f2i             
	//   73  128:istore_2        
			}
			if(mDragHelper.smoothSlideViewTo(mSlideableView, i, mSlideableView.getTop()))
			{
				setAllChildrenVisible();
				ViewCompat.postInvalidateOnAnimation(((View) (this)));
				return true;
			}
		}
		return false;
	//*  74  129:goto            76
	}

	void updateObscuredViewsVisibility(View view)
	{
		int i;
		int j;
		int k;
		int l;
		int i1;
		int j1;
		int k1;
		int i2;
		int j2;
		int k2;
		boolean flag;
		View view1;
		flag = isLayoutRtlSupport();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #239 <Method boolean isLayoutRtlSupport()>
	//    2    4:istore          17
		int l2;
		if(flag)
	//*   3    6:iload           17
	//*   4    8:ifeq            115
			i = getWidth() - getPaddingRight();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #593 <Method int getWidth()>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #507 <Method int getPaddingRight()>
	//    9   19:isub            
	//   10   20:istore_2        
		else
	//*  11   21:iload           17
	//*  12   23:ifeq            123
	//*  13   26:aload_0         
	//*  14   27:invokevirtual   #510 <Method int getPaddingLeft()>
	//*  15   30:istore_3        
	//*  16   31:aload_0         
	//*  17   32:invokevirtual   #513 <Method int getPaddingTop()>
	//*  18   35:istore          10
	//*  19   37:aload_0         
	//*  20   38:invokevirtual   #684 <Method int getHeight()>
	//*  21   41:istore          11
	//*  22   43:aload_0         
	//*  23   44:invokevirtual   #570 <Method int getPaddingBottom()>
	//*  24   47:istore          12
	//*  25   49:aload_1         
	//*  26   50:ifnull          136
	//*  27   53:aload_1         
	//*  28   54:invokestatic    #686 <Method boolean viewIsOpaque(View)>
	//*  29   57:ifeq            136
	//*  30   60:aload_1         
	//*  31   61:invokevirtual   #296 <Method int View.getLeft()>
	//*  32   64:istore          5
	//*  33   66:aload_1         
	//*  34   67:invokevirtual   #299 <Method int View.getRight()>
	//*  35   70:istore          6
	//*  36   72:aload_1         
	//*  37   73:invokevirtual   #302 <Method int View.getTop()>
	//*  38   76:istore          7
	//*  39   78:aload_1         
	//*  40   79:invokevirtual   #305 <Method int View.getBottom()>
	//*  41   82:istore          4
	//*  42   84:iconst_0        
	//*  43   85:istore          8
	//*  44   87:aload_0         
	//*  45   88:invokevirtual   #250 <Method int getChildCount()>
	//*  46   91:istore          13
	//*  47   93:iload           8
	//*  48   95:iload           13
	//*  49   97:icmpge          114
	//*  50  100:aload_0         
	//*  51  101:iload           8
	//*  52  103:invokevirtual   #254 <Method View getChildAt(int)>
	//*  53  106:astore          18
	//*  54  108:aload           18
	//*  55  110:aload_1         
	//*  56  111:if_acmpne       151
	//*  57  114:return          
			i = getPaddingLeft();
	//   58  115:aload_0         
	//   59  116:invokevirtual   #510 <Method int getPaddingLeft()>
	//   60  119:istore_2        
		if(flag)
			j = getPaddingLeft();
		else
	//*  61  120:goto            21
			j = getWidth() - getPaddingRight();
	//   62  123:aload_0         
	//   63  124:invokevirtual   #593 <Method int getWidth()>
	//   64  127:aload_0         
	//   65  128:invokevirtual   #507 <Method int getPaddingRight()>
	//   66  131:isub            
	//   67  132:istore_3        
		i2 = getPaddingTop();
		j2 = getHeight();
		k2 = getPaddingBottom();
		if(view != null && viewIsOpaque(view))
		{
			l = view.getLeft();
			i1 = view.getRight();
			j1 = view.getTop();
			k = view.getBottom();
		} else
	//*  68  133:goto            31
		{
			k = 0;
	//   69  136:iconst_0        
	//   70  137:istore          4
			j1 = 0;
	//   71  139:iconst_0        
	//   72  140:istore          7
			i1 = 0;
	//   73  142:iconst_0        
	//   74  143:istore          6
			l = 0;
	//   75  145:iconst_0        
	//   76  146:istore          5
		}
		k1 = 0;
		l2 = getChildCount();
_L2:
label0:
		{
			if(k1 < l2)
			{
				view1 = getChildAt(k1);
				if(view1 != view)
					break label0;
			}
			return;
		}
	//*  77  148:goto            84
		if(view1.getVisibility() != 8)
			break; /* Loop/switch isn't completed */
	//   78  151:aload           18
	//   79  153:invokevirtual   #516 <Method int View.getVisibility()>
	//   80  156:bipush          8
	//   81  158:icmpne          170
_L3:
		k1++;
	//   82  161:iload           8
	//   83  163:iconst_1        
	//   84  164:iadd            
	//   85  165:istore          8
		if(true) goto _L2; else goto _L1
	//   86  167:goto            93
_L1:
		int l1;
		int i3;
		int j3;
		int k3;
		if(flag)
	//*  87  170:iload           17
	//*  88  172:ifeq            278
			l1 = j;
	//   89  175:iload_3         
	//   90  176:istore          9
		else
	//*  91  178:iload           9
	//*  92  180:aload           18
	//*  93  182:invokevirtual   #296 <Method int View.getLeft()>
	//*  94  185:invokestatic    #393 <Method int Math.max(int, int)>
	//*  95  188:istore          14
	//*  96  190:iload           10
	//*  97  192:aload           18
	//*  98  194:invokevirtual   #302 <Method int View.getTop()>
	//*  99  197:invokestatic    #393 <Method int Math.max(int, int)>
	//* 100  200:istore          15
	//* 101  202:iload           17
	//* 102  204:ifeq            284
	//* 103  207:iload_2         
	//* 104  208:istore          9
	//* 105  210:iload           9
	//* 106  212:aload           18
	//* 107  214:invokevirtual   #299 <Method int View.getRight()>
	//* 108  217:invokestatic    #407 <Method int Math.min(int, int)>
	//* 109  220:istore          9
	//* 110  222:iload           11
	//* 111  224:iload           12
	//* 112  226:isub            
	//* 113  227:aload           18
	//* 114  229:invokevirtual   #305 <Method int View.getBottom()>
	//* 115  232:invokestatic    #407 <Method int Math.min(int, int)>
	//* 116  235:istore          16
	//* 117  237:iload           14
	//* 118  239:iload           5
	//* 119  241:icmplt          290
	//* 120  244:iload           15
	//* 121  246:iload           7
	//* 122  248:icmplt          290
	//* 123  251:iload           9
	//* 124  253:iload           6
	//* 125  255:icmpgt          290
	//* 126  258:iload           16
	//* 127  260:iload           4
	//* 128  262:icmpgt          290
	//* 129  265:iconst_4        
	//* 130  266:istore          9
	//* 131  268:aload           18
	//* 132  270:iload           9
	//* 133  272:invokevirtual   #641 <Method void View.setVisibility(int)>
	//* 134  275:goto            161
			l1 = i;
	//  135  278:iload_2         
	//  136  279:istore          9
		i3 = Math.max(l1, view1.getLeft());
		j3 = Math.max(i2, view1.getTop());
		if(flag)
			l1 = i;
		else
	//* 137  281:goto            178
			l1 = j;
	//  138  284:iload_3         
	//  139  285:istore          9
		l1 = Math.min(l1, view1.getRight());
		k3 = Math.min(j2 - k2, view1.getBottom());
		if(i3 >= l && j3 >= j1 && l1 <= i1 && k3 <= k)
			l1 = 4;
		else
	//* 140  287:goto            210
			l1 = 0;
	//  141  290:iconst_0        
	//  142  291:istore          9
		view1.setVisibility(l1);
		  goto _L3
		if(true) goto _L2; else goto _L4
_L4:
	//* 143  293:goto            268
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
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #88  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          19
			IMPL = ((SlidingPanelLayoutImpl) (new SlidingPanelLayoutImplJBMR1()));
	//    3    8:new             #38  <Class SlidingPaneLayout$SlidingPanelLayoutImplJBMR1>
	//    4   11:dup             
	//    5   12:invokespecial   #91  <Method void SlidingPaneLayout$SlidingPanelLayoutImplJBMR1()>
	//    6   15:putstatic       #93  <Field SlidingPaneLayout$SlidingPanelLayoutImpl IMPL>
	//    7   18:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   8   19:getstatic       #88  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   22:bipush          16
	//*  10   24:icmplt          38
			IMPL = ((SlidingPanelLayoutImpl) (new SlidingPanelLayoutImplJB()));
	//   11   27:new             #35  <Class SlidingPaneLayout$SlidingPanelLayoutImplJB>
	//   12   30:dup             
	//   13   31:invokespecial   #94  <Method void SlidingPaneLayout$SlidingPanelLayoutImplJB()>
	//   14   34:putstatic       #93  <Field SlidingPaneLayout$SlidingPanelLayoutImpl IMPL>
	//   15   37:return          
		else
			IMPL = ((SlidingPanelLayoutImpl) (new SlidingPanelLayoutImplBase()));
	//   16   38:new             #32  <Class SlidingPaneLayout$SlidingPanelLayoutImplBase>
	//   17   41:dup             
	//   18   42:invokespecial   #95  <Method void SlidingPaneLayout$SlidingPanelLayoutImplBase()>
	//   19   45:putstatic       #93  <Field SlidingPaneLayout$SlidingPanelLayoutImpl IMPL>
	//*  20   48:return          
	}
}
