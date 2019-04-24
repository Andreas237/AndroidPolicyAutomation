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
		//*   9   21:ifeq            84
			{
				j = getWidth();
		//   10   24:aload_0         
		//   11   25:getfield        #13  <Field SlidingPaneLayout this$0>
		//   12   28:invokevirtual   #39  <Method int SlidingPaneLayout.getWidth()>
		//   13   31:istore_3        
				int k = getPaddingRight();
		//   14   32:aload_0         
		//   15   33:getfield        #13  <Field SlidingPaneLayout this$0>
		//   16   36:invokevirtual   #42  <Method int SlidingPaneLayout.getPaddingRight()>
		//   17   39:istore          4
				j -= ((LayoutParams) (view)).rightMargin + k + mSlideableView.getWidth();
		//   18   41:iload_3         
		//   19   42:aload_1         
		//   20   43:getfield        #46  <Field int SlidingPaneLayout$LayoutParams.rightMargin>
		//   21   46:iload           4
		//   22   48:iadd            
		//   23   49:aload_0         
		//   24   50:getfield        #13  <Field SlidingPaneLayout this$0>
		//   25   53:getfield        #23  <Field View SlidingPaneLayout.mSlideableView>
		//   26   56:invokevirtual   #47  <Method int View.getWidth()>
		//   27   59:iadd            
		//   28   60:isub            
		//   29   61:istore_3        
				k = mSlideRange;
		//   30   62:aload_0         
		//   31   63:getfield        #13  <Field SlidingPaneLayout this$0>
		//   32   66:getfield        #50  <Field int SlidingPaneLayout.mSlideRange>
		//   33   69:istore          4
				return Math.max(Math.min(i, j), j - k);
		//   34   71:iload_2         
		//   35   72:iload_3         
		//   36   73:invokestatic    #56  <Method int Math.min(int, int)>
		//   37   76:iload_3         
		//   38   77:iload           4
		//   39   79:isub            
		//   40   80:invokestatic    #59  <Method int Math.max(int, int)>
		//   41   83:ireturn         
			} else
			{
				j = getPaddingLeft();
		//   42   84:aload_0         
		//   43   85:getfield        #13  <Field SlidingPaneLayout this$0>
		//   44   88:invokevirtual   #62  <Method int SlidingPaneLayout.getPaddingLeft()>
		//   45   91:istore_3        
				j = ((LayoutParams) (view)).leftMargin + j;
		//   46   92:aload_1         
		//   47   93:getfield        #65  <Field int SlidingPaneLayout$LayoutParams.leftMargin>
		//   48   96:iload_3         
		//   49   97:iadd            
		//   50   98:istore_3        
				int l = mSlideRange;
		//   51   99:aload_0         
		//   52  100:getfield        #13  <Field SlidingPaneLayout this$0>
		//   53  103:getfield        #50  <Field int SlidingPaneLayout.mSlideRange>
		//   54  106:istore          4
				return Math.min(Math.max(i, j), l + j);
		//   55  108:iload_2         
		//   56  109:iload_3         
		//   57  110:invokestatic    #59  <Method int Math.max(int, int)>
		//   58  113:iload           4
		//   59  115:iload_3         
		//   60  116:iadd            
		//   61  117:invokestatic    #56  <Method int Math.min(int, int)>
		//   62  120:ireturn         
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
		//    7   16:ifeq            135
_L1:
			int i;
label0:
			{
				i = getPaddingRight();
		//    8   19:aload_0         
		//    9   20:getfield        #13  <Field SlidingPaneLayout this$0>
		//   10   23:invokevirtual   #42  <Method int SlidingPaneLayout.getPaddingRight()>
		//   11   26:istore          4
				int j = layoutparams.rightMargin + i;
		//   12   28:aload           6
		//   13   30:getfield        #46  <Field int SlidingPaneLayout$LayoutParams.rightMargin>
		//   14   33:iload           4
		//   15   35:iadd            
		//   16   36:istore          5
				if(f >= 0.0F)
		//*  17   38:fload_2         
		//*  18   39:fconst_0        
		//*  19   40:fcmpg           
		//*  20   41:iflt            71
				{
					i = j;
		//   21   44:iload           5
		//   22   46:istore          4
					if(f != 0.0F)
						break label0;
		//   23   48:fload_2         
		//   24   49:fconst_0        
		//   25   50:fcmpl           
		//   26   51:ifne            83
					i = j;
		//   27   54:iload           5
		//   28   56:istore          4
					if(mSlideOffset <= 0.5F)
						break label0;
		//   29   58:aload_0         
		//   30   59:getfield        #13  <Field SlidingPaneLayout this$0>
		//   31   62:getfield        #96  <Field float SlidingPaneLayout.mSlideOffset>
		//   32   65:ldc1            #121 <Float 0.5F>
		//   33   67:fcmpl           
		//   34   68:ifle            83
				}
				i = j + mSlideRange;
		//   35   71:iload           5
		//   36   73:aload_0         
		//   37   74:getfield        #13  <Field SlidingPaneLayout this$0>
		//   38   77:getfield        #50  <Field int SlidingPaneLayout.mSlideRange>
		//   39   80:iadd            
		//   40   81:istore          4
			}
			int k = mSlideableView.getWidth();
		//   41   83:aload_0         
		//   42   84:getfield        #13  <Field SlidingPaneLayout this$0>
		//   43   87:getfield        #23  <Field View SlidingPaneLayout.mSlideableView>
		//   44   90:invokevirtual   #47  <Method int View.getWidth()>
		//   45   93:istore          5
			i = getWidth() - i - k;
		//   46   95:aload_0         
		//   47   96:getfield        #13  <Field SlidingPaneLayout this$0>
		//   48   99:invokevirtual   #39  <Method int SlidingPaneLayout.getWidth()>
		//   49  102:iload           4
		//   50  104:isub            
		//   51  105:iload           5
		//   52  107:isub            
		//   53  108:istore          4
_L4:
			mDragHelper.settleCapturedViewAt(i, view.getTop());
		//   54  110:aload_0         
		//   55  111:getfield        #13  <Field SlidingPaneLayout this$0>
		//   56  114:getfield        #77  <Field ViewDragHelper SlidingPaneLayout.mDragHelper>
		//   57  117:iload           4
		//   58  119:aload_1         
		//   59  120:invokevirtual   #69  <Method int View.getTop()>
		//   60  123:invokevirtual   #125 <Method boolean ViewDragHelper.settleCapturedViewAt(int, int)>
		//   61  126:pop             
			invalidate();
		//   62  127:aload_0         
		//   63  128:getfield        #13  <Field SlidingPaneLayout this$0>
		//   64  131:invokevirtual   #118 <Method void SlidingPaneLayout.invalidate()>
			return;
		//   65  134:return          
_L2:
			i = getPaddingLeft();
		//   66  135:aload_0         
		//   67  136:getfield        #13  <Field SlidingPaneLayout this$0>
		//   68  139:invokevirtual   #62  <Method int SlidingPaneLayout.getPaddingLeft()>
		//   69  142:istore          4
			int l = layoutparams.leftMargin + i;
		//   70  144:aload           6
		//   71  146:getfield        #65  <Field int SlidingPaneLayout$LayoutParams.leftMargin>
		//   72  149:iload           4
		//   73  151:iadd            
		//   74  152:istore          5
			if(f <= 0.0F)
		//*  75  154:fload_2         
		//*  76  155:fconst_0        
		//*  77  156:fcmpl           
		//*  78  157:ifgt            187
			{
				i = l;
		//   79  160:iload           5
		//   80  162:istore          4
				if(f != 0.0F)
					continue; /* Loop/switch isn't completed */
		//   81  164:fload_2         
		//   82  165:fconst_0        
		//   83  166:fcmpl           
		//   84  167:ifne            110
				i = l;
		//   85  170:iload           5
		//   86  172:istore          4
				if(mSlideOffset <= 0.5F)
					continue; /* Loop/switch isn't completed */
		//   87  174:aload_0         
		//   88  175:getfield        #13  <Field SlidingPaneLayout this$0>
		//   89  178:getfield        #96  <Field float SlidingPaneLayout.mSlideOffset>
		//   90  181:ldc1            #121 <Float 0.5F>
		//   91  183:fcmpl           
		//   92  184:ifle            110
			}
			i = l + mSlideRange;
		//   93  187:iload           5
		//   94  189:aload_0         
		//   95  190:getfield        #13  <Field SlidingPaneLayout this$0>
		//   96  193:getfield        #50  <Field int SlidingPaneLayout.mSlideRange>
		//   97  196:iadd            
		//   98  197:istore          4
			if(true) goto _L4; else goto _L3
		//   99  199:goto            110
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
		mDragHelper.setMinVelocity(f * 400F);
	//   55  105:aload_0         
	//   56  106:getfield        #165 <Field ViewDragHelper mDragHelper>
	//   57  109:fload           4
	//   58  111:ldc1            #166 <Float 400F>
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
		if(!(view instanceof ViewGroup)) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:instanceof      #4   <Class ViewGroup>
	//    2    4:ifeq            144
_L1:
		int l;
		int i1;
		int j1;
		ViewGroup viewgroup;
		viewgroup = (ViewGroup)view;
	//    3    7:aload_1         
	//    4    8:checkcast       #4   <Class ViewGroup>
	//    5   11:astore          9
		i1 = view.getScrollX();
	//    6   13:aload_1         
	//    7   14:invokevirtual   #288 <Method int View.getScrollX()>
	//    8   17:istore          7
		j1 = view.getScrollY();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #291 <Method int View.getScrollY()>
	//   11   23:istore          8
		l = viewgroup.getChildCount() - 1;
	//   12   25:aload           9
	//   13   27:invokevirtual   #292 <Method int ViewGroup.getChildCount()>
	//   14   30:iconst_1        
	//   15   31:isub            
	//   16   32:istore          6
_L8:
		if(l < 0) goto _L2; else goto _L3
	//   17   34:iload           6
	//   18   36:iflt            144
_L3:
		View view1 = viewgroup.getChildAt(l);
	//   19   39:aload           9
	//   20   41:iload           6
	//   21   43:invokevirtual   #293 <Method View ViewGroup.getChildAt(int)>
	//   22   46:astore          10
		if(j + i1 < view1.getLeft() || j + i1 >= view1.getRight() || k + j1 < view1.getTop() || k + j1 >= view1.getBottom() || !canScroll(view1, true, i, (j + i1) - view1.getLeft(), (k + j1) - view1.getTop())) goto _L5; else goto _L4
	//   23   48:iload           4
	//   24   50:iload           7
	//   25   52:iadd            
	//   26   53:aload           10
	//   27   55:invokevirtual   #296 <Method int View.getLeft()>
	//   28   58:icmplt          135
	//   29   61:iload           4
	//   30   63:iload           7
	//   31   65:iadd            
	//   32   66:aload           10
	//   33   68:invokevirtual   #299 <Method int View.getRight()>
	//   34   71:icmpge          135
	//   35   74:iload           5
	//   36   76:iload           8
	//   37   78:iadd            
	//   38   79:aload           10
	//   39   81:invokevirtual   #302 <Method int View.getTop()>
	//   40   84:icmplt          135
	//   41   87:iload           5
	//   42   89:iload           8
	//   43   91:iadd            
	//   44   92:aload           10
	//   45   94:invokevirtual   #305 <Method int View.getBottom()>
	//   46   97:icmpge          135
	//   47  100:aload_0         
	//   48  101:aload           10
	//   49  103:iconst_1        
	//   50  104:iload_3         
	//   51  105:iload           4
	//   52  107:iload           7
	//   53  109:iadd            
	//   54  110:aload           10
	//   55  112:invokevirtual   #296 <Method int View.getLeft()>
	//   56  115:isub            
	//   57  116:iload           5
	//   58  118:iload           8
	//   59  120:iadd            
	//   60  121:aload           10
	//   61  123:invokevirtual   #302 <Method int View.getTop()>
	//   62  126:isub            
	//   63  127:invokevirtual   #307 <Method boolean canScroll(View, boolean, int, int, int)>
	//   64  130:ifeq            135
_L4:
		return true;
	//   65  133:iconst_1        
	//   66  134:ireturn         
_L5:
		l--;
	//   67  135:iload           6
	//   68  137:iconst_1        
	//   69  138:isub            
	//   70  139:istore          6
		continue; /* Loop/switch isn't completed */
	//   71  141:goto            34
_L2:
		if(!flag)
			break; /* Loop/switch isn't completed */
	//   72  144:iload_2         
	//   73  145:ifeq            163
		if(!isLayoutRtlSupport())
	//*  74  148:aload_0         
	//*  75  149:invokevirtual   #239 <Method boolean isLayoutRtlSupport()>
	//*  76  152:ifeq            165
	//*  77  155:aload_1         
	//*  78  156:iload_3         
	//*  79  157:invokevirtual   #311 <Method boolean View.canScrollHorizontally(int)>
	//*  80  160:ifne            133
	//*  81  163:iconst_0        
	//*  82  164:ireturn         
			i = -i;
	//   83  165:iload_3         
	//   84  166:ineg            
	//   85  167:istore_3        
		if(view.canScrollHorizontally(i)) goto _L4; else goto _L6
_L6:
		return false;
		if(true) goto _L8; else goto _L7
_L7:
	//*  86  168:goto            155
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
			j = view.getRight();
	//   41   87:aload           8
	//   42   89:invokevirtual   #299 <Method int View.getRight()>
	//   43   92:istore_3        
			i = j + i1;
	//   44   93:iload_3         
	//   45   94:iload           6
	//   46   96:iadd            
	//   47   97:istore_2        
		} else
	//*  48   98:aload           7
	//*  49  100:iload_3         
	//*  50  101:iload           4
	//*  51  103:iload_2         
	//*  52  104:iload           5
	//*  53  106:invokevirtual   #368 <Method void Drawable.setBounds(int, int, int, int)>
	//*  54  109:aload           7
	//*  55  111:aload_1         
	//*  56  112:invokevirtual   #369 <Method void Drawable.draw(Canvas)>
	//*  57  115:return          
		{
			i = view.getLeft();
	//   58  116:aload           8
	//   59  118:invokevirtual   #296 <Method int View.getLeft()>
	//   60  121:istore_2        
			j = i - i1;
	//   61  122:iload_2         
	//   62  123:iload           6
	//   63  125:isub            
	//   64  126:istore_3        
		}
		drawable.setBounds(j, k, i, l);
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
		if(view == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		view = ((View) ((LayoutParams)view.getLayoutParams()));
	//    4    6:aload_1         
	//    5    7:invokevirtual   #186 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    6   10:checkcast       #15  <Class SlidingPaneLayout$LayoutParams>
	//    7   13:astore_1        
		boolean flag;
		if(mCanSlide && ((LayoutParams) (view)).dimWhenOffset && mSlideOffset > 0.0F)
	//*   8   14:aload_0         
	//*   9   15:getfield        #315 <Field boolean mCanSlide>
	//*  10   18:ifeq            41
	//*  11   21:aload_1         
	//*  12   22:getfield        #244 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
	//*  13   25:ifeq            41
	//*  14   28:aload_0         
	//*  15   29:getfield        #349 <Field float mSlideOffset>
	//*  16   32:fconst_0        
	//*  17   33:fcmpl           
	//*  18   34:ifle            41
			flag = true;
	//   19   37:iconst_1        
	//   20   38:istore_2        
		else
	//*  21   39:iload_2         
	//*  22   40:ireturn         
			flag = false;
	//   23   41:iconst_0        
	//   24   42:istore_2        
		return flag;
	//*  25   43:goto            39
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
		int j = mPostedRunnables.size();
	//    5    9:aload_0         
	//    6   10:getfield        #118 <Field ArrayList mPostedRunnables>
	//    7   13:invokevirtual   #448 <Method int ArrayList.size()>
	//    8   16:istore_2        
		for(int i = 0; i < j; i++)
	//*   9   17:iconst_0        
	//*  10   18:istore_1        
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
		int i;
		boolean flag;
		boolean flag1;
		flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          6
		i = motionevent.getActionMasked();
	//    2    3:aload_1         
	//    3    4:invokevirtual   #465 <Method int MotionEvent.getActionMasked()>
	//    4    7:istore          4
		if(!mCanSlide && i == 0 && getChildCount() > 1)
	//*   5    9:aload_0         
	//*   6   10:getfield        #315 <Field boolean mCanSlide>
	//*   7   13:ifne            72
	//*   8   16:iload           4
	//*   9   18:ifne            72
	//*  10   21:aload_0         
	//*  11   22:invokevirtual   #250 <Method int getChildCount()>
	//*  12   25:iconst_1        
	//*  13   26:icmple          72
		{
			View view = getChildAt(1);
	//   14   29:aload_0         
	//   15   30:iconst_1        
	//   16   31:invokevirtual   #254 <Method View getChildAt(int)>
	//   17   34:astore          7
			if(view != null)
	//*  18   36:aload           7
	//*  19   38:ifnull          72
			{
				if(!mDragHelper.isViewUnder(view, (int)motionevent.getX(), (int)motionevent.getY()))
	//*  20   41:aload_0         
	//*  21   42:getfield        #165 <Field ViewDragHelper mDragHelper>
	//*  22   45:aload           7
	//*  23   47:aload_1         
	//*  24   48:invokevirtual   #469 <Method float MotionEvent.getX()>
	//*  25   51:f2i             
	//*  26   52:aload_1         
	//*  27   53:invokevirtual   #472 <Method float MotionEvent.getY()>
	//*  28   56:f2i             
	//*  29   57:invokevirtual   #476 <Method boolean ViewDragHelper.isViewUnder(View, int, int)>
	//*  30   60:ifne            108
					flag = true;
	//   31   63:iconst_1        
	//   32   64:istore          5
				else
	//*  33   66:aload_0         
	//*  34   67:iload           5
	//*  35   69:putfield        #178 <Field boolean mPreservedOpenState>
	//*  36   72:aload_0         
	//*  37   73:getfield        #315 <Field boolean mCanSlide>
	//*  38   76:ifeq            91
	//*  39   79:aload_0         
	//*  40   80:getfield        #478 <Field boolean mIsUnableToDrag>
	//*  41   83:ifeq            114
	//*  42   86:iload           4
	//*  43   88:ifeq            114
	//*  44   91:aload_0         
	//*  45   92:getfield        #165 <Field ViewDragHelper mDragHelper>
	//*  46   95:invokevirtual   #481 <Method void ViewDragHelper.cancel()>
	//*  47   98:aload_0         
	//*  48   99:aload_1         
	//*  49  100:invokespecial   #483 <Method boolean ViewGroup.onInterceptTouchEvent(MotionEvent)>
	//*  50  103:istore          5
	//*  51  105:iload           5
	//*  52  107:ireturn         
					flag = false;
	//   53  108:iconst_0        
	//   54  109:istore          5
				mPreservedOpenState = flag;
			}
		}
		if(mCanSlide && (!mIsUnableToDrag || i == 0)) goto _L2; else goto _L1
_L1:
		mDragHelper.cancel();
		flag = super.onInterceptTouchEvent(motionevent);
_L7:
		return flag;
	//*  55  111:goto            66
_L2:
		if(i == 3 || i == 1)
	//*  56  114:iload           4
	//*  57  116:iconst_3        
	//*  58  117:icmpeq          126
	//*  59  120:iload           4
	//*  60  122:iconst_1        
	//*  61  123:icmpne          135
		{
			mDragHelper.cancel();
	//   62  126:aload_0         
	//   63  127:getfield        #165 <Field ViewDragHelper mDragHelper>
	//   64  130:invokevirtual   #481 <Method void ViewDragHelper.cancel()>
			return false;
	//   65  133:iconst_0        
	//   66  134:ireturn         
		}
		i;
	//   67  135:iload           4
		JVM INSTR tableswitch 0 2: default 164
	//	               0 189
	//	               1 164
	//	               2 249;
	//   68  137:tableswitch     0 2: default 164
	//	               0 189
	//	               1 164
	//	               2 249
		   goto _L3 _L4 _L3 _L5
_L3:
		i = 0;
	//   69  164:iconst_0        
	//   70  165:istore          4
_L9:
		if(mDragHelper.shouldInterceptTouchEvent(motionevent))
			break; /* Loop/switch isn't completed */
	//   71  167:aload_0         
	//   72  168:getfield        #165 <Field ViewDragHelper mDragHelper>
	//   73  171:aload_1         
	//   74  172:invokevirtual   #486 <Method boolean ViewDragHelper.shouldInterceptTouchEvent(MotionEvent)>
	//   75  175:ifne            187
		flag = flag1;
	//   76  178:iload           6
	//   77  180:istore          5
		if(!i) goto _L7; else goto _L6
	//   78  182:iload           4
	//   79  184:ifeq            105
_L6:
		return true;
	//   80  187:iconst_1        
	//   81  188:ireturn         
_L4:
		float f;
		float f2;
		mIsUnableToDrag = false;
	//   82  189:aload_0         
	//   83  190:iconst_0        
	//   84  191:putfield        #478 <Field boolean mIsUnableToDrag>
		f = motionevent.getX();
	//   85  194:aload_1         
	//   86  195:invokevirtual   #469 <Method float MotionEvent.getX()>
	//   87  198:fstore_2        
		f2 = motionevent.getY();
	//   88  199:aload_1         
	//   89  200:invokevirtual   #472 <Method float MotionEvent.getY()>
	//   90  203:fstore_3        
		mInitialMotionX = f;
	//   91  204:aload_0         
	//   92  205:fload_2         
	//   93  206:putfield        #488 <Field float mInitialMotionX>
		mInitialMotionY = f2;
	//   94  209:aload_0         
	//   95  210:fload_3         
	//   96  211:putfield        #490 <Field float mInitialMotionY>
		if(!mDragHelper.isViewUnder(mSlideableView, (int)f, (int)f2) || !isDimmed(mSlideableView)) goto _L3; else goto _L8
	//   97  214:aload_0         
	//   98  215:getfield        #165 <Field ViewDragHelper mDragHelper>
	//   99  218:aload_0         
	//  100  219:getfield        #241 <Field View mSlideableView>
	//  101  222:fload_2         
	//  102  223:f2i             
	//  103  224:fload_3         
	//  104  225:f2i             
	//  105  226:invokevirtual   #476 <Method boolean ViewDragHelper.isViewUnder(View, int, int)>
	//  106  229:ifeq            164
	//  107  232:aload_0         
	//  108  233:aload_0         
	//  109  234:getfield        #241 <Field View mSlideableView>
	//  110  237:invokevirtual   #492 <Method boolean isDimmed(View)>
	//  111  240:ifeq            164
_L8:
		i = 1;
	//  112  243:iconst_1        
	//  113  244:istore          4
		  goto _L9
	//* 114  246:goto            167
_L5:
		float f3 = motionevent.getX();
	//  115  249:aload_1         
	//  116  250:invokevirtual   #469 <Method float MotionEvent.getX()>
	//  117  253:fstore_3        
		float f1 = motionevent.getY();
	//  118  254:aload_1         
	//  119  255:invokevirtual   #472 <Method float MotionEvent.getY()>
	//  120  258:fstore_2        
		f3 = Math.abs(f3 - mInitialMotionX);
	//  121  259:fload_3         
	//  122  260:aload_0         
	//  123  261:getfield        #488 <Field float mInitialMotionX>
	//  124  264:fsub            
	//  125  265:invokestatic    #496 <Method float Math.abs(float)>
	//  126  268:fstore_3        
		f1 = Math.abs(f1 - mInitialMotionY);
	//  127  269:fload_2         
	//  128  270:aload_0         
	//  129  271:getfield        #490 <Field float mInitialMotionY>
	//  130  274:fsub            
	//  131  275:invokestatic    #496 <Method float Math.abs(float)>
	//  132  278:fstore_2        
		if(f3 > (float)mDragHelper.getTouchSlop() && f1 > f3)
	//* 133  279:fload_3         
	//* 134  280:aload_0         
	//* 135  281:getfield        #165 <Field ViewDragHelper mDragHelper>
	//* 136  284:invokevirtual   #499 <Method int ViewDragHelper.getTouchSlop()>
	//* 137  287:i2f             
	//* 138  288:fcmpl           
	//* 139  289:ifle            164
	//* 140  292:fload_2         
	//* 141  293:fload_3         
	//* 142  294:fcmpl           
	//* 143  295:ifle            164
		{
			mDragHelper.cancel();
	//  144  298:aload_0         
	//  145  299:getfield        #165 <Field ViewDragHelper mDragHelper>
	//  146  302:invokevirtual   #481 <Method void ViewDragHelper.cancel()>
			mIsUnableToDrag = true;
	//  147  305:aload_0         
	//  148  306:iconst_1        
	//  149  307:putfield        #478 <Field boolean mIsUnableToDrag>
			return false;
	//  150  310:iconst_0        
	//  151  311:ireturn         
		}
		  goto _L3
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		boolean flag1 = isLayoutRtlSupport();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #239 <Method boolean isLayoutRtlSupport()>
	//    2    4:istore          13
		int k1;
		int l1;
		int i2;
		if(flag1)
	//*   3    6:iload           13
	//*   4    8:ifeq            143
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
	//*  13   25:iload           13
	//*  14   27:ifeq            154
	//*  15   30:aload_0         
	//*  16   31:invokevirtual   #507 <Method int getPaddingRight()>
	//*  17   34:istore_2        
	//*  18   35:iload           13
	//*  19   37:ifeq            162
	//*  20   40:aload_0         
	//*  21   41:invokevirtual   #510 <Method int getPaddingLeft()>
	//*  22   44:istore          5
	//*  23   46:aload_0         
	//*  24   47:invokevirtual   #513 <Method int getPaddingTop()>
	//*  25   50:istore          11
	//*  26   52:aload_0         
	//*  27   53:invokevirtual   #250 <Method int getChildCount()>
	//*  28   56:istore          10
	//*  29   58:aload_0         
	//*  30   59:getfield        #108 <Field boolean mFirstLayout>
	//*  31   62:ifeq            88
	//*  32   65:aload_0         
	//*  33   66:getfield        #315 <Field boolean mCanSlide>
	//*  34   69:ifeq            171
	//*  35   72:aload_0         
	//*  36   73:getfield        #178 <Field boolean mPreservedOpenState>
	//*  37   76:ifeq            171
	//*  38   79:fconst_1        
	//*  39   80:fstore          6
	//*  40   82:aload_0         
	//*  41   83:fload           6
	//*  42   85:putfield        #349 <Field float mSlideOffset>
	//*  43   88:iconst_0        
	//*  44   89:istore          7
	//*  45   91:iload_2         
	//*  46   92:istore_3        
	//*  47   93:iload           7
	//*  48   95:iload           10
	//*  49   97:icmpge          451
	//*  50  100:aload_0         
	//*  51  101:iload           7
	//*  52  103:invokevirtual   #254 <Method View getChildAt(int)>
	//*  53  106:astore          14
	//*  54  108:aload           14
	//*  55  110:invokevirtual   #516 <Method int View.getVisibility()>
	//*  56  113:bipush          8
	//*  57  115:icmpne          177
	//*  58  118:iload_2         
	//*  59  119:istore          4
	//*  60  121:iload_3         
	//*  61  122:istore_2        
	//*  62  123:iload           4
	//*  63  125:istore_3        
	//*  64  126:iload           7
	//*  65  128:iconst_1        
	//*  66  129:iadd            
	//*  67  130:istore          7
	//*  68  132:iload_2         
	//*  69  133:istore          4
	//*  70  135:iload_3         
	//*  71  136:istore_2        
	//*  72  137:iload           4
	//*  73  139:istore_3        
	//*  74  140:goto            93
			mDragHelper.setEdgeTrackingEnabled(1);
	//   75  143:aload_0         
	//   76  144:getfield        #165 <Field ViewDragHelper mDragHelper>
	//   77  147:iconst_1        
	//   78  148:invokevirtual   #504 <Method void ViewDragHelper.setEdgeTrackingEnabled(int)>
		k1 = k - i;
		if(flag1)
			i = getPaddingRight();
		else
	//*  79  151:goto            19
			i = getPaddingLeft();
	//   80  154:aload_0         
	//   81  155:invokevirtual   #510 <Method int getPaddingLeft()>
	//   82  158:istore_2        
		if(flag1)
			l = getPaddingLeft();
		else
	//*  83  159:goto            35
			l = getPaddingRight();
	//   84  162:aload_0         
	//   85  163:invokevirtual   #507 <Method int getPaddingRight()>
	//   86  166:istore          5
		i2 = getPaddingTop();
		l1 = getChildCount();
		if(mFirstLayout)
		{
			float f;
			int i1;
			if(mCanSlide && mPreservedOpenState)
				f = 1.0F;
			else
	//*  87  168:goto            46
				f = 0.0F;
	//   88  171:fconst_0        
	//   89  172:fstore          6
			mSlideOffset = f;
		}
		i1 = 0;
		j = i;
		while(i1 < l1) 
		{
			View view = getChildAt(i1);
			if(view.getVisibility() == 8)
			{
				k = i;
				i = j;
				j = k;
			} else
	//*  90  174:goto            82
			{
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   91  177:aload           14
	//   92  179:invokevirtual   #186 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   93  182:checkcast       #15  <Class SlidingPaneLayout$LayoutParams>
	//   94  185:astore          15
				int j2 = view.getMeasuredWidth();
	//   95  187:aload           14
	//   96  189:invokevirtual   #519 <Method int View.getMeasuredWidth()>
	//   97  192:istore          12
				int j1;
				if(layoutparams.slideable)
	//*  98  194:aload           15
	//*  99  196:getfield        #380 <Field boolean SlidingPaneLayout$LayoutParams.slideable>
	//* 100  199:ifeq            393
				{
					k = layoutparams.leftMargin;
	//  101  202:aload           15
	//  102  204:getfield        #257 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//  103  207:istore          4
					j1 = layoutparams.rightMargin;
	//  104  209:aload           15
	//  105  211:getfield        #247 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//  106  214:istore          8
					j1 = Math.min(i, k1 - l - mOverhangSize) - j - (k + j1);
	//  107  216:iload_2         
	//  108  217:iload           9
	//  109  219:iload           5
	//  110  221:isub            
	//  111  222:aload_0         
	//  112  223:getfield        #139 <Field int mOverhangSize>
	//  113  226:isub            
	//  114  227:invokestatic    #407 <Method int Math.min(int, int)>
	//  115  230:iload_3         
	//  116  231:isub            
	//  117  232:iload           4
	//  118  234:iload           8
	//  119  236:iadd            
	//  120  237:isub            
	//  121  238:istore          8
					mSlideRange = j1;
	//  122  240:aload_0         
	//  123  241:iload           8
	//  124  243:putfield        #521 <Field int mSlideRange>
					if(flag1)
	//* 125  246:iload           13
	//* 126  248:ifeq            378
						k = layoutparams.rightMargin;
	//  127  251:aload           15
	//  128  253:getfield        #247 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//  129  256:istore          4
					else
	//* 130  258:iload_3         
	//* 131  259:iload           4
	//* 132  261:iadd            
	//* 133  262:iload           8
	//* 134  264:iadd            
	//* 135  265:iload           12
	//* 136  267:iconst_2        
	//* 137  268:idiv            
	//* 138  269:iadd            
	//* 139  270:iload           9
	//* 140  272:iload           5
	//* 141  274:isub            
	//* 142  275:icmple          388
	//* 143  278:iconst_1        
	//* 144  279:istore_1        
	//* 145  280:aload           15
	//* 146  282:iload_1         
	//* 147  283:putfield        #244 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
	//* 148  286:iload           8
	//* 149  288:i2f             
	//* 150  289:aload_0         
	//* 151  290:getfield        #349 <Field float mSlideOffset>
	//* 152  293:fmul            
	//* 153  294:f2i             
	//* 154  295:istore          8
	//* 155  297:iload_3         
	//* 156  298:iload           4
	//* 157  300:iload           8
	//* 158  302:iadd            
	//* 159  303:iadd            
	//* 160  304:istore_3        
	//* 161  305:aload_0         
	//* 162  306:iload           8
	//* 163  308:i2f             
	//* 164  309:aload_0         
	//* 165  310:getfield        #521 <Field int mSlideRange>
	//* 166  313:i2f             
	//* 167  314:fdiv            
	//* 168  315:putfield        #349 <Field float mSlideOffset>
	//* 169  318:iconst_0        
	//* 170  319:istore          4
	//* 171  321:iload           13
	//* 172  323:ifeq            435
	//* 173  326:iload           9
	//* 174  328:iload_3         
	//* 175  329:isub            
	//* 176  330:iload           4
	//* 177  332:iadd            
	//* 178  333:istore          8
	//* 179  335:iload           8
	//* 180  337:iload           12
	//* 181  339:isub            
	//* 182  340:istore          4
	//* 183  342:aload           14
	//* 184  344:iload           4
	//* 185  346:iload           11
	//* 186  348:iload           8
	//* 187  350:aload           14
	//* 188  352:invokevirtual   #524 <Method int View.getMeasuredHeight()>
	//* 189  355:iload           11
	//* 190  357:iadd            
	//* 191  358:invokevirtual   #527 <Method void View.layout(int, int, int, int)>
	//* 192  361:aload           14
	//* 193  363:invokevirtual   #530 <Method int View.getWidth()>
	//* 194  366:iload_2         
	//* 195  367:iadd            
	//* 196  368:istore          4
	//* 197  370:iload_3         
	//* 198  371:istore_2        
	//* 199  372:iload           4
	//* 200  374:istore_3        
	//* 201  375:goto            126
						k = layoutparams.leftMargin;
	//  202  378:aload           15
	//  203  380:getfield        #257 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//  204  383:istore          4
					if(j + k + j1 + j2 / 2 > k1 - l)
						flag = true;
					else
	//* 205  385:goto            258
						flag = false;
	//  206  388:iconst_0        
	//  207  389:istore_1        
					layoutparams.dimWhenOffset = flag;
					j1 = (int)((float)j1 * mSlideOffset);
					j += k + j1;
					mSlideOffset = (float)j1 / (float)mSlideRange;
					k = 0;
				} else
	//* 208  390:goto            280
				if(mCanSlide && mParallaxBy != 0)
	//* 209  393:aload_0         
	//* 210  394:getfield        #315 <Field boolean mCanSlide>
	//* 211  397:ifeq            427
	//* 212  400:aload_0         
	//* 213  401:getfield        #261 <Field int mParallaxBy>
	//* 214  404:ifeq            427
				{
					k = (int)((1.0F - mSlideOffset) * (float)mParallaxBy);
	//  215  407:fconst_1        
	//  216  408:aload_0         
	//  217  409:getfield        #349 <Field float mSlideOffset>
	//  218  412:fsub            
	//  219  413:aload_0         
	//  220  414:getfield        #261 <Field int mParallaxBy>
	//  221  417:i2f             
	//  222  418:fmul            
	//  223  419:f2i             
	//  224  420:istore          4
					j = i;
	//  225  422:iload_2         
	//  226  423:istore_3        
				} else
	//* 227  424:goto            321
				{
					k = 0;
	//  228  427:iconst_0        
	//  229  428:istore          4
					j = i;
	//  230  430:iload_2         
	//  231  431:istore_3        
				}
				if(flag1)
				{
					j1 = (k1 - j) + k;
					k = j1 - j2;
				} else
	//* 232  432:goto            321
				{
					k = j - k;
	//  233  435:iload_3         
	//  234  436:iload           4
	//  235  438:isub            
	//  236  439:istore          4
					j1 = k + j2;
	//  237  441:iload           4
	//  238  443:iload           12
	//  239  445:iadd            
	//  240  446:istore          8
				}
				view.layout(k, i2, j1, view.getMeasuredHeight() + i2);
				k = view.getWidth() + i;
				i = j;
				j = k;
			}
			i1++;
			k = i;
			i = j;
			j = k;
		}
	//* 241  448:goto            342
		if(mFirstLayout)
	//* 242  451:aload_0         
	//* 243  452:getfield        #108 <Field boolean mFirstLayout>
	//* 244  455:ifeq            520
		{
			if(mCanSlide)
	//* 245  458:aload_0         
	//* 246  459:getfield        #315 <Field boolean mCanSlide>
	//* 247  462:ifeq            526
			{
				if(mParallaxBy != 0)
	//* 248  465:aload_0         
	//* 249  466:getfield        #261 <Field int mParallaxBy>
	//* 250  469:ifeq            480
					parallaxOtherViews(mSlideOffset);
	//  251  472:aload_0         
	//  252  473:aload_0         
	//  253  474:getfield        #349 <Field float mSlideOffset>
	//  254  477:invokespecial   #532 <Method void parallaxOtherViews(float)>
				if(((LayoutParams)mSlideableView.getLayoutParams()).dimWhenOffset)
	//* 255  480:aload_0         
	//* 256  481:getfield        #241 <Field View mSlideableView>
	//* 257  484:invokevirtual   #186 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 258  487:checkcast       #15  <Class SlidingPaneLayout$LayoutParams>
	//* 259  490:getfield        #244 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
	//* 260  493:ifeq            512
					dimChildView(mSlideableView, mSlideOffset, mSliderFadeColor);
	//  261  496:aload_0         
	//  262  497:aload_0         
	//  263  498:getfield        #241 <Field View mSlideableView>
	//  264  501:aload_0         
	//  265  502:getfield        #349 <Field float mSlideOffset>
	//  266  505:aload_0         
	//  267  506:getfield        #106 <Field int mSliderFadeColor>
	//  268  509:invokespecial   #269 <Method void dimChildView(View, float, int)>
			} else
	//* 269  512:aload_0         
	//* 270  513:aload_0         
	//* 271  514:getfield        #241 <Field View mSlideableView>
	//* 272  517:invokevirtual   #535 <Method void updateObscuredViewsVisibility(View)>
	//* 273  520:aload_0         
	//* 274  521:iconst_0        
	//* 275  522:putfield        #108 <Field boolean mFirstLayout>
	//* 276  525:return          
			{
				i = 0;
	//  277  526:iconst_0        
	//  278  527:istore_2        
				while(i < l1) 
	//* 279  528:iload_2         
	//* 280  529:iload           10
	//* 281  531:icmpge          512
				{
					dimChildView(getChildAt(i), 0.0F, mSliderFadeColor);
	//  282  534:aload_0         
	//  283  535:aload_0         
	//  284  536:iload_2         
	//  285  537:invokevirtual   #254 <Method View getChildAt(int)>
	//  286  540:fconst_0        
	//  287  541:aload_0         
	//  288  542:getfield        #106 <Field int mSliderFadeColor>
	//  289  545:invokespecial   #269 <Method void dimChildView(View, float, int)>
					i++;
	//  290  548:iload_2         
	//  291  549:iconst_1        
	//  292  550:iadd            
	//  293  551:istore_2        
				}
			}
			updateObscuredViewsVisibility(mSlideableView);
		}
		mFirstLayout = false;
	//* 294  552:goto            528
	}

	protected void onMeasure(int i, int j)
	{
		int k;
		int l;
		int i1;
		i1 = android.view.View.MeasureSpec.getMode(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #542 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore          7
		k = android.view.View.MeasureSpec.getSize(i);
	//    3    6:iload_1         
	//    4    7:invokestatic    #545 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5   10:istore          5
		l = android.view.View.MeasureSpec.getMode(j);
	//    6   12:iload_2         
	//    7   13:invokestatic    #542 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    8   16:istore          6
		i = android.view.View.MeasureSpec.getSize(j);
	//    9   18:iload_2         
	//   10   19:invokestatic    #545 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   11   22:istore_1        
		if(i1 == 0x40000000) goto _L2; else goto _L1
	//   12   23:iload           7
	//   13   25:ldc2            #546 <Int 0x40000000>
	//   14   28:icmpeq          233
_L1:
		if(!isInEditMode()) goto _L4; else goto _L3
	//   15   31:aload_0         
	//   16   32:invokevirtual   #549 <Method boolean isInEditMode()>
	//   17   35:ifeq            222
_L3:
		if(i1 != 0x80000000) goto _L6; else goto _L5
	//   18   38:iload           7
	//   19   40:ldc2            #550 <Int 0x80000000>
	//   20   43:icmpne          206
_L5:
		j = k;
	//   21   46:iload           5
	//   22   48:istore_2        
		k = l;
	//   23   49:iload           6
	//   24   51:istore          5
_L16:
		k;
	//   25   53:iload           5
		JVM INSTR lookupswitch 2: default 80
	//	               -2147483648: 298
	//	               1073741824: 280;
	//   26   55:lookupswitch    2: default 80
	//	               -2147483648: 298
	//	               1073741824: 280
		   goto _L7 _L8 _L9
_L7:
		i = 0;
	//   27   80:iconst_0        
	//   28   81:istore_1        
		i1 = 0;
	//   29   82:iconst_0        
	//   30   83:istore          7
_L13:
		float f;
		int i3;
		int k3;
		int l3;
		boolean flag;
		flag = false;
	//   31   85:iconst_0        
	//   32   86:istore          15
		k3 = j - getPaddingLeft() - getPaddingRight();
	//   33   88:iload_2         
	//   34   89:aload_0         
	//   35   90:invokevirtual   #510 <Method int getPaddingLeft()>
	//   36   93:isub            
	//   37   94:aload_0         
	//   38   95:invokevirtual   #507 <Method int getPaddingRight()>
	//   39   98:isub            
	//   40   99:istore          11
		l3 = getChildCount();
	//   41  101:aload_0         
	//   42  102:invokevirtual   #250 <Method int getChildCount()>
	//   43  105:istore          12
		if(l3 > 2)
	//*  44  107:iload           12
	//*  45  109:iconst_2        
	//*  46  110:icmple          122
			Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
	//   47  113:ldc1            #52  <String "SlidingPaneLayout">
	//   48  115:ldc2            #552 <String "onMeasure: More than two child views are not supported.">
	//   49  118:invokestatic    #558 <Method int Log.e(String, String)>
	//   50  121:pop             
		mSlideableView = null;
	//   51  122:aload_0         
	//   52  123:aconst_null     
	//   53  124:putfield        #241 <Field View mSlideableView>
		i3 = 0;
	//   54  127:iconst_0        
	//   55  128:istore          10
		l = k3;
	//   56  130:iload           11
	//   57  132:istore          6
		f = 0.0F;
	//   58  134:fconst_0        
	//   59  135:fstore_3        
_L11:
		float f1;
		View view;
		LayoutParams layoutparams;
		if(i3 >= l3)
			break; /* Loop/switch isn't completed */
	//   60  136:iload           10
	//   61  138:iload           12
	//   62  140:icmpge          617
		view = getChildAt(i3);
	//   63  143:aload_0         
	//   64  144:iload           10
	//   65  146:invokevirtual   #254 <Method View getChildAt(int)>
	//   66  149:astore          17
		layoutparams = (LayoutParams)view.getLayoutParams();
	//   67  151:aload           17
	//   68  153:invokevirtual   #186 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   69  156:checkcast       #15  <Class SlidingPaneLayout$LayoutParams>
	//   70  159:astore          18
		int k1;
		if(view.getVisibility() == 8)
	//*  71  161:aload           17
	//*  72  163:invokevirtual   #516 <Method int View.getVisibility()>
	//*  73  166:bipush          8
	//*  74  168:icmpne          328
		{
			layoutparams.dimWhenOffset = false;
	//   75  171:aload           18
	//   76  173:iconst_0        
	//   77  174:putfield        #244 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
			int j1 = l;
	//   78  177:iload           6
	//   79  179:istore          8
			l = i;
	//   80  181:iload_1         
	//   81  182:istore          6
			i = j1;
	//   82  184:iload           8
	//   83  186:istore_1        
		} else
	//*  84  187:iload           10
	//*  85  189:iconst_1        
	//*  86  190:iadd            
	//*  87  191:istore          10
	//*  88  193:iload           6
	//*  89  195:istore          8
	//*  90  197:iload_1         
	//*  91  198:istore          6
	//*  92  200:iload           8
	//*  93  202:istore_1        
	//*  94  203:goto            136
	//*  95  206:iload           7
	//*  96  208:ifne            1105
	//*  97  211:iload           6
	//*  98  213:istore          5
	//*  99  215:sipush          300
	//* 100  218:istore_2        
	//* 101  219:goto            53
	//* 102  222:new             #560 <Class IllegalStateException>
	//* 103  225:dup             
	//* 104  226:ldc2            #562 <String "Width must have an exact value or MATCH_PARENT">
	//* 105  229:invokespecial   #565 <Method void IllegalStateException(String)>
	//* 106  232:athrow          
	//* 107  233:iload           6
	//* 108  235:ifne            1105
	//* 109  238:aload_0         
	//* 110  239:invokevirtual   #549 <Method boolean isInEditMode()>
	//* 111  242:ifeq            269
	//* 112  245:iload           6
	//* 113  247:ifne            1105
	//* 114  250:ldc2            #550 <Int 0x80000000>
	//* 115  253:istore          6
	//* 116  255:iload           5
	//* 117  257:istore_2        
	//* 118  258:sipush          300
	//* 119  261:istore_1        
	//* 120  262:iload           6
	//* 121  264:istore          5
	//* 122  266:goto            53
	//* 123  269:new             #560 <Class IllegalStateException>
	//* 124  272:dup             
	//* 125  273:ldc2            #567 <String "Height must not be UNSPECIFIED">
	//* 126  276:invokespecial   #565 <Method void IllegalStateException(String)>
	//* 127  279:athrow          
	//* 128  280:iload_1         
	//* 129  281:aload_0         
	//* 130  282:invokevirtual   #513 <Method int getPaddingTop()>
	//* 131  285:isub            
	//* 132  286:aload_0         
	//* 133  287:invokevirtual   #570 <Method int getPaddingBottom()>
	//* 134  290:isub            
	//* 135  291:istore_1        
	//* 136  292:iload_1         
	//* 137  293:istore          7
	//* 138  295:goto            85
	//* 139  298:aload_0         
	//* 140  299:invokevirtual   #513 <Method int getPaddingTop()>
	//* 141  302:istore          7
	//* 142  304:aload_0         
	//* 143  305:invokevirtual   #570 <Method int getPaddingBottom()>
	//* 144  308:istore          8
	//* 145  310:iconst_0        
	//* 146  311:istore          6
	//* 147  313:iload_1         
	//* 148  314:iload           7
	//* 149  316:isub            
	//* 150  317:iload           8
	//* 151  319:isub            
	//* 152  320:istore          7
	//* 153  322:iload           6
	//* 154  324:istore_1        
	//* 155  325:goto            85
		{
label0:
			{
				f1 = f;
	//  156  328:fload_3         
	//  157  329:fstore          4
				if(layoutparams.weight <= 0.0F)
					break label0;
	//  158  331:aload           18
	//  159  333:getfield        #573 <Field float SlidingPaneLayout$LayoutParams.weight>
	//  160  336:fconst_0        
	//  161  337:fcmpl           
	//  162  338:ifle            373
				f += layoutparams.weight;
	//  163  341:fload_3         
	//  164  342:aload           18
	//  165  344:getfield        #573 <Field float SlidingPaneLayout$LayoutParams.weight>
	//  166  347:fadd            
	//  167  348:fstore_3        
				f1 = f;
	//  168  349:fload_3         
	//  169  350:fstore          4
				if(layoutparams.width != 0)
					break label0;
	//  170  352:aload           18
	//  171  354:getfield        #576 <Field int SlidingPaneLayout$LayoutParams.width>
	//  172  357:ifne            373
				int l1 = i;
	//  173  360:iload_1         
	//  174  361:istore          8
				i = l;
	//  175  363:iload           6
	//  176  365:istore_1        
				l = l1;
	//  177  366:iload           8
	//  178  368:istore          6
			}
		}
_L14:
		i3++;
		k1 = l;
		l = i;
		i = k1;
		if(true) goto _L11; else goto _L10
_L6:
		if(i1 == 0)
		{
			k = l;
			j = 300;
			continue; /* Loop/switch isn't completed */
		}
		  goto _L12
_L4:
		throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
_L2:
		if(l == 0)
			if(isInEditMode())
			{
				if(l == 0)
				{
					l = 0x80000000;
					j = k;
					i = 300;
					k = l;
					continue; /* Loop/switch isn't completed */
				}
			} else
			{
				throw new IllegalStateException("Height must not be UNSPECIFIED");
			}
		  goto _L12
_L9:
		i = i - getPaddingTop() - getPaddingBottom();
		i1 = i;
		  goto _L13
_L8:
		i1 = getPaddingTop();
		k1 = getPaddingBottom();
		l = 0;
		i1 = i - i1 - k1;
		i = l;
		  goto _L13
	//* 179  370:goto            187
		int i2 = layoutparams.leftMargin + layoutparams.rightMargin;
	//  180  373:aload           18
	//  181  375:getfield        #257 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//  182  378:aload           18
	//  183  380:getfield        #247 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//  184  383:iadd            
	//  185  384:istore          8
		int k2;
		int i4;
		boolean flag1;
		if(layoutparams.width == -2)
	//* 186  386:aload           18
	//* 187  388:getfield        #576 <Field int SlidingPaneLayout$LayoutParams.width>
	//* 188  391:bipush          -2
	//* 189  393:icmpne          532
			i2 = android.view.View.MeasureSpec.makeMeasureSpec(k3 - i2, 0x80000000);
	//  190  396:iload           11
	//  191  398:iload           8
	//  192  400:isub            
	//  193  401:ldc2            #550 <Int 0x80000000>
	//  194  404:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  195  407:istore          8
		else
	//* 196  409:aload           18
	//* 197  411:getfield        #582 <Field int SlidingPaneLayout$LayoutParams.height>
	//* 198  414:bipush          -2
	//* 199  416:icmpne          573
	//* 200  419:iload           7
	//* 201  421:ldc2            #550 <Int 0x80000000>
	//* 202  424:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 203  427:istore          9
	//* 204  429:aload           17
	//* 205  431:iload           8
	//* 206  433:iload           9
	//* 207  435:invokevirtual   #585 <Method void View.measure(int, int)>
	//* 208  438:aload           17
	//* 209  440:invokevirtual   #519 <Method int View.getMeasuredWidth()>
	//* 210  443:istore          9
	//* 211  445:aload           17
	//* 212  447:invokevirtual   #524 <Method int View.getMeasuredHeight()>
	//* 213  450:istore          13
	//* 214  452:iload_1         
	//* 215  453:istore          8
	//* 216  455:iload           5
	//* 217  457:ldc2            #550 <Int 0x80000000>
	//* 218  460:icmpne          481
	//* 219  463:iload_1         
	//* 220  464:istore          8
	//* 221  466:iload           13
	//* 222  468:iload_1         
	//* 223  469:icmple          481
	//* 224  472:iload           13
	//* 225  474:iload           7
	//* 226  476:invokestatic    #407 <Method int Math.min(int, int)>
	//* 227  479:istore          8
	//* 228  481:iload           6
	//* 229  483:iload           9
	//* 230  485:isub            
	//* 231  486:istore_1        
	//* 232  487:iload_1         
	//* 233  488:ifge            611
	//* 234  491:iconst_1        
	//* 235  492:istore          16
	//* 236  494:aload           18
	//* 237  496:iload           16
	//* 238  498:putfield        #380 <Field boolean SlidingPaneLayout$LayoutParams.slideable>
	//* 239  501:aload           18
	//* 240  503:getfield        #380 <Field boolean SlidingPaneLayout$LayoutParams.slideable>
	//* 241  506:ifeq            515
	//* 242  509:aload_0         
	//* 243  510:aload           17
	//* 244  512:putfield        #241 <Field View mSlideableView>
	//* 245  515:iload           8
	//* 246  517:istore          6
	//* 247  519:iload           16
	//* 248  521:iload           15
	//* 249  523:ior             
	//* 250  524:istore          15
	//* 251  526:fload           4
	//* 252  528:fstore_3        
	//* 253  529:goto            187
		if(layoutparams.width == -1)
	//* 254  532:aload           18
	//* 255  534:getfield        #576 <Field int SlidingPaneLayout$LayoutParams.width>
	//* 256  537:iconst_m1       
	//* 257  538:icmpne          557
			i2 = android.view.View.MeasureSpec.makeMeasureSpec(k3 - i2, 0x40000000);
	//  258  541:iload           11
	//  259  543:iload           8
	//  260  545:isub            
	//  261  546:ldc2            #546 <Int 0x40000000>
	//  262  549:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  263  552:istore          8
		else
	//* 264  554:goto            409
			i2 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.width, 0x40000000);
	//  265  557:aload           18
	//  266  559:getfield        #576 <Field int SlidingPaneLayout$LayoutParams.width>
	//  267  562:ldc2            #546 <Int 0x40000000>
	//  268  565:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  269  568:istore          8
		if(layoutparams.height == -2)
			k2 = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x80000000);
		else
	//* 270  570:goto            409
		if(layoutparams.height == -1)
	//* 271  573:aload           18
	//* 272  575:getfield        #582 <Field int SlidingPaneLayout$LayoutParams.height>
	//* 273  578:iconst_m1       
	//* 274  579:icmpne          595
			k2 = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
	//  275  582:iload           7
	//  276  584:ldc2            #546 <Int 0x40000000>
	//  277  587:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  278  590:istore          9
		else
	//* 279  592:goto            429
			k2 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000);
	//  280  595:aload           18
	//  281  597:getfield        #582 <Field int SlidingPaneLayout$LayoutParams.height>
	//  282  600:ldc2            #546 <Int 0x40000000>
	//  283  603:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  284  606:istore          9
		view.measure(i2, k2);
		k2 = view.getMeasuredWidth();
		i4 = view.getMeasuredHeight();
		i2 = i;
		if(k == 0x80000000)
		{
			i2 = i;
			if(i4 > i)
				i2 = Math.min(i4, i1);
		}
		i = l - k2;
		if(i < 0)
			flag1 = true;
		else
	//* 285  608:goto            429
			flag1 = false;
	//  286  611:iconst_0        
	//  287  612:istore          16
		layoutparams.slideable = flag1;
		if(layoutparams.slideable)
			mSlideableView = view;
		l = i2;
		flag = flag1 | flag;
		f = f1;
		  goto _L14
	//* 288  614:goto            494
_L10:
		if(flag || f > 0.0F)
	//* 289  617:iload           15
	//* 290  619:ifne            628
	//* 291  622:fload_3         
	//* 292  623:fconst_0        
	//* 293  624:fcmpl           
	//* 294  625:ifle            1060
		{
			int j3 = k3 - mOverhangSize;
	//  295  628:iload           11
	//  296  630:aload_0         
	//  297  631:getfield        #139 <Field int mOverhangSize>
	//  298  634:isub            
	//  299  635:istore          10
			int j2 = 0;
	//  300  637:iconst_0        
	//  301  638:istore          8
			while(j2 < l3) 
	//* 302  640:iload           8
	//* 303  642:iload           12
	//* 304  644:icmpge          1060
			{
				View view1 = getChildAt(j2);
	//  305  647:aload_0         
	//  306  648:iload           8
	//  307  650:invokevirtual   #254 <Method View getChildAt(int)>
	//  308  653:astore          17
				if(view1.getVisibility() != 8)
	//* 309  655:aload           17
	//* 310  657:invokevirtual   #516 <Method int View.getVisibility()>
	//* 311  660:bipush          8
	//* 312  662:icmpne          674
	//* 313  665:iload           8
	//* 314  667:iconst_1        
	//* 315  668:iadd            
	//* 316  669:istore          8
	//* 317  671:goto            640
				{
					LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//  318  674:aload           17
	//  319  676:invokevirtual   #186 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  320  679:checkcast       #15  <Class SlidingPaneLayout$LayoutParams>
	//  321  682:astore          18
					if(view1.getVisibility() != 8)
	//* 322  684:aload           17
	//* 323  686:invokevirtual   #516 <Method int View.getVisibility()>
	//* 324  689:bipush          8
	//* 325  691:icmpeq          665
					{
						int l2;
						if(layoutparams1.width == 0 && layoutparams1.weight > 0.0F)
	//* 326  694:aload           18
	//* 327  696:getfield        #576 <Field int SlidingPaneLayout$LayoutParams.width>
	//* 328  699:ifne            805
	//* 329  702:aload           18
	//* 330  704:getfield        #573 <Field float SlidingPaneLayout$LayoutParams.weight>
	//* 331  707:fconst_0        
	//* 332  708:fcmpl           
	//* 333  709:ifle            805
							k = 1;
	//  334  712:iconst_1        
	//  335  713:istore          5
						else
	//* 336  715:iload           5
	//* 337  717:ifeq            811
	//* 338  720:iconst_0        
	//* 339  721:istore          9
	//* 340  723:iload           15
	//* 341  725:ifeq            875
	//* 342  728:aload           17
	//* 343  730:aload_0         
	//* 344  731:getfield        #241 <Field View mSlideableView>
	//* 345  734:if_acmpeq       875
	//* 346  737:aload           18
	//* 347  739:getfield        #576 <Field int SlidingPaneLayout$LayoutParams.width>
	//* 348  742:ifge            665
	//* 349  745:iload           9
	//* 350  747:iload           10
	//* 351  749:icmpgt          762
	//* 352  752:aload           18
	//* 353  754:getfield        #573 <Field float SlidingPaneLayout$LayoutParams.weight>
	//* 354  757:fconst_0        
	//* 355  758:fcmpl           
	//* 356  759:ifle            665
	//* 357  762:iload           5
	//* 358  764:ifeq            859
	//* 359  767:aload           18
	//* 360  769:getfield        #582 <Field int SlidingPaneLayout$LayoutParams.height>
	//* 361  772:bipush          -2
	//* 362  774:icmpne          821
	//* 363  777:iload           7
	//* 364  779:ldc2            #550 <Int 0x80000000>
	//* 365  782:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 366  785:istore          5
	//* 367  787:aload           17
	//* 368  789:iload           10
	//* 369  791:ldc2            #546 <Int 0x40000000>
	//* 370  794:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 371  797:iload           5
	//* 372  799:invokevirtual   #585 <Method void View.measure(int, int)>
	//* 373  802:goto            665
							k = 0;
	//  374  805:iconst_0        
	//  375  806:istore          5
						if(k != 0)
							l2 = 0;
						else
	//* 376  808:goto            715
							l2 = view1.getMeasuredWidth();
	//  377  811:aload           17
	//  378  813:invokevirtual   #519 <Method int View.getMeasuredWidth()>
	//  379  816:istore          9
						if(flag && view1 != mSlideableView)
						{
							if(layoutparams1.width < 0 && (l2 > j3 || layoutparams1.weight > 0.0F))
							{
								if(k != 0)
								{
									if(layoutparams1.height == -2)
										k = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x80000000);
									else
	//* 380  818:goto            723
									if(layoutparams1.height == -1)
	//* 381  821:aload           18
	//* 382  823:getfield        #582 <Field int SlidingPaneLayout$LayoutParams.height>
	//* 383  826:iconst_m1       
	//* 384  827:icmpne          843
										k = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
	//  385  830:iload           7
	//  386  832:ldc2            #546 <Int 0x40000000>
	//  387  835:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  388  838:istore          5
									else
	//* 389  840:goto            787
										k = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams1.height, 0x40000000);
	//  390  843:aload           18
	//  391  845:getfield        #582 <Field int SlidingPaneLayout$LayoutParams.height>
	//  392  848:ldc2            #546 <Int 0x40000000>
	//  393  851:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  394  854:istore          5
								} else
	//* 395  856:goto            787
								{
									k = android.view.View.MeasureSpec.makeMeasureSpec(view1.getMeasuredHeight(), 0x40000000);
	//  396  859:aload           17
	//  397  861:invokevirtual   #524 <Method int View.getMeasuredHeight()>
	//  398  864:ldc2            #546 <Int 0x40000000>
	//  399  867:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  400  870:istore          5
								}
								view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(j3, 0x40000000), k);
							}
						} else
	//* 401  872:goto            787
						if(layoutparams1.weight > 0.0F)
	//* 402  875:aload           18
	//* 403  877:getfield        #573 <Field float SlidingPaneLayout$LayoutParams.weight>
	//* 404  880:fconst_0        
	//* 405  881:fcmpl           
	//* 406  882:ifle            665
						{
							if(layoutparams1.width == 0)
	//* 407  885:aload           18
	//* 408  887:getfield        #576 <Field int SlidingPaneLayout$LayoutParams.width>
	//* 409  890:ifne            1005
							{
								if(layoutparams1.height == -2)
	//* 410  893:aload           18
	//* 411  895:getfield        #582 <Field int SlidingPaneLayout$LayoutParams.height>
	//* 412  898:bipush          -2
	//* 413  900:icmpne          967
									k = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x80000000);
	//  414  903:iload           7
	//  415  905:ldc2            #550 <Int 0x80000000>
	//  416  908:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  417  911:istore          5
								else
	//* 418  913:iload           15
	//* 419  915:ifeq            1021
	//* 420  918:aload           18
	//* 421  920:getfield        #257 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//* 422  923:istore          13
	//* 423  925:iload           11
	//* 424  927:aload           18
	//* 425  929:getfield        #247 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//* 426  932:iload           13
	//* 427  934:iadd            
	//* 428  935:isub            
	//* 429  936:istore          13
	//* 430  938:iload           13
	//* 431  940:ldc2            #546 <Int 0x40000000>
	//* 432  943:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 433  946:istore          14
	//* 434  948:iload           9
	//* 435  950:iload           13
	//* 436  952:icmpeq          665
	//* 437  955:aload           17
	//* 438  957:iload           14
	//* 439  959:iload           5
	//* 440  961:invokevirtual   #585 <Method void View.measure(int, int)>
	//* 441  964:goto            665
								if(layoutparams1.height == -1)
	//* 442  967:aload           18
	//* 443  969:getfield        #582 <Field int SlidingPaneLayout$LayoutParams.height>
	//* 444  972:iconst_m1       
	//* 445  973:icmpne          989
									k = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
	//  446  976:iload           7
	//  447  978:ldc2            #546 <Int 0x40000000>
	//  448  981:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  449  984:istore          5
								else
	//* 450  986:goto            913
									k = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams1.height, 0x40000000);
	//  451  989:aload           18
	//  452  991:getfield        #582 <Field int SlidingPaneLayout$LayoutParams.height>
	//  453  994:ldc2            #546 <Int 0x40000000>
	//  454  997:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  455 1000:istore          5
							} else
	//* 456 1002:goto            913
							{
								k = android.view.View.MeasureSpec.makeMeasureSpec(view1.getMeasuredHeight(), 0x40000000);
	//  457 1005:aload           17
	//  458 1007:invokevirtual   #524 <Method int View.getMeasuredHeight()>
	//  459 1010:ldc2            #546 <Int 0x40000000>
	//  460 1013:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  461 1016:istore          5
							}
							if(flag)
							{
								int j4 = layoutparams1.leftMargin;
								j4 = k3 - (layoutparams1.rightMargin + j4);
								int l4 = android.view.View.MeasureSpec.makeMeasureSpec(j4, 0x40000000);
								if(l2 != j4)
									view1.measure(l4, k);
							} else
	//* 462 1018:goto            913
							{
								int k4 = Math.max(0, l);
	//  463 1021:iconst_0        
	//  464 1022:iload           6
	//  465 1024:invokestatic    #393 <Method int Math.max(int, int)>
	//  466 1027:istore          13
								view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)((layoutparams1.weight * (float)k4) / f) + l2, 0x40000000), k);
	//  467 1029:aload           17
	//  468 1031:aload           18
	//  469 1033:getfield        #573 <Field float SlidingPaneLayout$LayoutParams.weight>
	//  470 1036:iload           13
	//  471 1038:i2f             
	//  472 1039:fmul            
	//  473 1040:fload_3         
	//  474 1041:fdiv            
	//  475 1042:f2i             
	//  476 1043:iload           9
	//  477 1045:iadd            
	//  478 1046:ldc2            #546 <Int 0x40000000>
	//  479 1049:invokestatic    #579 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  480 1052:iload           5
	//  481 1054:invokevirtual   #585 <Method void View.measure(int, int)>
							}
						}
					}
				}
				j2++;
			}
		}
	//* 482 1057:goto            665
		setMeasuredDimension(j, getPaddingTop() + i + getPaddingBottom());
	//  483 1060:aload_0         
	//  484 1061:iload_2         
	//  485 1062:aload_0         
	//  486 1063:invokevirtual   #513 <Method int getPaddingTop()>
	//  487 1066:iload_1         
	//  488 1067:iadd            
	//  489 1068:aload_0         
	//  490 1069:invokevirtual   #570 <Method int getPaddingBottom()>
	//  491 1072:iadd            
	//  492 1073:invokevirtual   #588 <Method void setMeasuredDimension(int, int)>
		mCanSlide = flag;
	//  493 1076:aload_0         
	//  494 1077:iload           15
	//  495 1079:putfield        #315 <Field boolean mCanSlide>
		if(mDragHelper.getViewDragState() != 0 && !flag)
	//* 496 1082:aload_0         
	//* 497 1083:getfield        #165 <Field ViewDragHelper mDragHelper>
	//* 498 1086:invokevirtual   #591 <Method int ViewDragHelper.getViewDragState()>
	//* 499 1089:ifeq            1104
	//* 500 1092:iload           15
	//* 501 1094:ifne            1104
			mDragHelper.abort();
	//  502 1097:aload_0         
	//  503 1098:getfield        #165 <Field ViewDragHelper mDragHelper>
	//  504 1101:invokevirtual   #330 <Method void ViewDragHelper.abort()>
		return;
	//  505 1104:return          
_L12:
		j = k;
	//  506 1105:iload           5
	//  507 1107:istore_2        
		k = l;
	//  508 1108:iload           6
	//  509 1110:istore          5
		if(true) goto _L16; else goto _L15
	//  510 1112:goto            53
_L15:
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
		int k = mSlideableView.getWidth();
	//   15   31:aload_0         
	//   16   32:getfield        #241 <Field View mSlideableView>
	//   17   35:invokevirtual   #530 <Method int View.getWidth()>
	//   18   38:istore_3        
		int j = i;
	//   19   39:iload_1         
	//   20   40:istore_2        
		if(flag)
	//*  21   41:iload           4
	//*  22   43:ifeq            55
			j = getWidth() - i - k;
	//   23   46:aload_0         
	//   24   47:invokevirtual   #593 <Method int getWidth()>
	//   25   50:iload_1         
	//   26   51:isub            
	//   27   52:iload_3         
	//   28   53:isub            
	//   29   54:istore_2        
		if(flag)
	//*  30   55:iload           4
	//*  31   57:ifeq            140
			i = getPaddingRight();
	//   32   60:aload_0         
	//   33   61:invokevirtual   #507 <Method int getPaddingRight()>
	//   34   64:istore_1        
		else
	//*  35   65:iload           4
	//*  36   67:ifeq            148
	//*  37   70:aload           5
	//*  38   72:getfield        #247 <Field int SlidingPaneLayout$LayoutParams.rightMargin>
	//*  39   75:istore_3        
	//*  40   76:aload_0         
	//*  41   77:iload_2         
	//*  42   78:iload_3         
	//*  43   79:iload_1         
	//*  44   80:iadd            
	//*  45   81:isub            
	//*  46   82:i2f             
	//*  47   83:aload_0         
	//*  48   84:getfield        #521 <Field int mSlideRange>
	//*  49   87:i2f             
	//*  50   88:fdiv            
	//*  51   89:putfield        #349 <Field float mSlideOffset>
	//*  52   92:aload_0         
	//*  53   93:getfield        #261 <Field int mParallaxBy>
	//*  54   96:ifeq            107
	//*  55   99:aload_0         
	//*  56  100:aload_0         
	//*  57  101:getfield        #349 <Field float mSlideOffset>
	//*  58  104:invokespecial   #532 <Method void parallaxOtherViews(float)>
	//*  59  107:aload           5
	//*  60  109:getfield        #244 <Field boolean SlidingPaneLayout$LayoutParams.dimWhenOffset>
	//*  61  112:ifeq            131
	//*  62  115:aload_0         
	//*  63  116:aload_0         
	//*  64  117:getfield        #241 <Field View mSlideableView>
	//*  65  120:aload_0         
	//*  66  121:getfield        #349 <Field float mSlideOffset>
	//*  67  124:aload_0         
	//*  68  125:getfield        #106 <Field int mSliderFadeColor>
	//*  69  128:invokespecial   #269 <Method void dimChildView(View, float, int)>
	//*  70  131:aload_0         
	//*  71  132:aload_0         
	//*  72  133:getfield        #241 <Field View mSlideableView>
	//*  73  136:invokevirtual   #595 <Method void dispatchOnPanelSlide(View)>
	//*  74  139:return          
			i = getPaddingLeft();
	//   75  140:aload_0         
	//   76  141:invokevirtual   #510 <Method int getPaddingLeft()>
	//   77  144:istore_1        
		if(flag)
			k = layoutparams.rightMargin;
		else
	//*  78  145:goto            65
			k = layoutparams.leftMargin;
	//   79  148:aload           5
	//   80  150:getfield        #257 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//   81  153:istore_3        
		mSlideOffset = (float)(j - (k + i)) / (float)mSlideRange;
		if(mParallaxBy != 0)
			parallaxOtherViews(mSlideOffset);
		if(layoutparams.dimWhenOffset)
			dimChildView(mSlideableView, mSlideOffset, mSliderFadeColor);
		dispatchOnPanelSlide(mSlideableView);
	//*  82  154:goto            76
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
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #250 <Method int getChildCount()>
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
		if(!mCanSlide)
	//*   0    0:aload_0         
	//*   1    1:getfield        #315 <Field boolean mCanSlide>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
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
			i = (int)((float)getWidth() - ((float)(j + i) + (float)mSlideRange * f + (float)k));
	//   25   52:aload_0         
	//   26   53:invokevirtual   #593 <Method int getWidth()>
	//   27   56:i2f             
	//   28   57:iload_3         
	//   29   58:iload_2         
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
	//*  53   95:ifeq            134
	//*  54   98:aload_0         
	//*  55   99:invokevirtual   #681 <Method void setAllChildrenVisible()>
	//*  56  102:aload_0         
	//*  57  103:invokestatic    #333 <Method void ViewCompat.postInvalidateOnAnimation(View)>
	//*  58  106:iconst_1        
	//*  59  107:ireturn         
		{
			i = getPaddingLeft();
	//   60  108:aload_0         
	//   61  109:invokevirtual   #510 <Method int getPaddingLeft()>
	//   62  112:istore_2        
			i = (int)((float)(layoutparams.leftMargin + i) + (float)mSlideRange * f);
	//   63  113:aload           6
	//   64  115:getfield        #257 <Field int SlidingPaneLayout$LayoutParams.leftMargin>
	//   65  118:iload_2         
	//   66  119:iadd            
	//   67  120:i2f             
	//   68  121:aload_0         
	//   69  122:getfield        #521 <Field int mSlideRange>
	//   70  125:i2f             
	//   71  126:fload_1         
	//   72  127:fmul            
	//   73  128:fadd            
	//   74  129:f2i             
	//   75  130:istore_2        
		}
		if(mDragHelper.smoothSlideViewTo(mSlideableView, i, mSlideableView.getTop()))
		{
			setAllChildrenVisible();
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
			return true;
		} else
	//*  76  131:goto            76
		{
			return false;
	//   77  134:iconst_0        
	//   78  135:ireturn         
		}
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
	//*  32   64:istore          7
	//*  33   66:aload_1         
	//*  34   67:invokevirtual   #299 <Method int View.getRight()>
	//*  35   70:istore          6
	//*  36   72:aload_1         
	//*  37   73:invokevirtual   #302 <Method int View.getTop()>
	//*  38   76:istore          5
	//*  39   78:aload_1         
	//*  40   79:invokevirtual   #305 <Method int View.getBottom()>
	//*  41   82:istore          4
	//*  42   84:aload_0         
	//*  43   85:invokevirtual   #250 <Method int getChildCount()>
	//*  44   88:istore          13
	//*  45   90:iconst_0        
	//*  46   91:istore          8
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
			j1 = view.getLeft();
			i1 = view.getRight();
			l = view.getTop();
			k = view.getBottom();
		} else
	//*  68  133:goto            31
		{
			k = 0;
	//   69  136:iconst_0        
	//   70  137:istore          4
			l = 0;
	//   71  139:iconst_0        
	//   72  140:istore          5
			i1 = 0;
	//   73  142:iconst_0        
	//   74  143:istore          6
			j1 = 0;
	//   75  145:iconst_0        
	//   76  146:istore          7
		}
		l2 = getChildCount();
		k1 = 0;
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
	//* 118  239:iload           7
	//* 119  241:icmplt          290
	//* 120  244:iload           15
	//* 121  246:iload           5
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
		if(i3 >= j1 && j3 >= l && l1 <= i1 && k3 <= k)
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
