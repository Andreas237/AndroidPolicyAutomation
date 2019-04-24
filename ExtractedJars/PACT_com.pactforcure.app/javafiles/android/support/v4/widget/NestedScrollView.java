// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.*;
import android.support.v4.view.*;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.util.*;
import android.view.*;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.*;
import java.util.List;

// Referenced classes of package android.support.v4.widget:
//			EdgeEffectCompat

public class NestedScrollView extends FrameLayout
	implements NestedScrollingParent, NestedScrollingChild2, ScrollingView
{
	static class AccessibilityDelegate extends AccessibilityDelegateCompat
	{

		public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
		{
			super.onInitializeAccessibilityEvent(view, accessibilityevent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #16  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityEvent(View, AccessibilityEvent)>
			view = ((View) ((NestedScrollView)view));
		//    4    6:aload_1         
		//    5    7:checkcast       #6   <Class NestedScrollView>
		//    6   10:astore_1        
			accessibilityevent.setClassName(((CharSequence) (((Class) (android/widget/ScrollView)).getName())));
		//    7   11:aload_2         
		//    8   12:ldc1            #18  <Class ScrollView>
		//    9   14:invokevirtual   #24  <Method String Class.getName()>
		//   10   17:invokevirtual   #30  <Method void AccessibilityEvent.setClassName(CharSequence)>
			boolean flag;
			if(((NestedScrollView) (view)).getScrollRange() > 0)
		//*  11   20:aload_1         
		//*  12   21:invokevirtual   #34  <Method int NestedScrollView.getScrollRange()>
		//*  13   24:ifle            67
				flag = true;
		//   14   27:iconst_1        
		//   15   28:istore_3        
			else
		//*  16   29:aload_2         
		//*  17   30:iload_3         
		//*  18   31:invokevirtual   #38  <Method void AccessibilityEvent.setScrollable(boolean)>
		//*  19   34:aload_2         
		//*  20   35:aload_1         
		//*  21   36:invokevirtual   #41  <Method int NestedScrollView.getScrollX()>
		//*  22   39:invokevirtual   #45  <Method void AccessibilityEvent.setScrollX(int)>
		//*  23   42:aload_2         
		//*  24   43:aload_1         
		//*  25   44:invokevirtual   #48  <Method int NestedScrollView.getScrollY()>
		//*  26   47:invokevirtual   #51  <Method void AccessibilityEvent.setScrollY(int)>
		//*  27   50:aload_2         
		//*  28   51:aload_1         
		//*  29   52:invokevirtual   #41  <Method int NestedScrollView.getScrollX()>
		//*  30   55:invokestatic    #57  <Method void AccessibilityRecordCompat.setMaxScrollX(android.view.accessibility.AccessibilityRecord, int)>
		//*  31   58:aload_2         
		//*  32   59:aload_1         
		//*  33   60:invokevirtual   #34  <Method int NestedScrollView.getScrollRange()>
		//*  34   63:invokestatic    #60  <Method void AccessibilityRecordCompat.setMaxScrollY(android.view.accessibility.AccessibilityRecord, int)>
		//*  35   66:return          
				flag = false;
		//   36   67:iconst_0        
		//   37   68:istore_3        
			accessibilityevent.setScrollable(flag);
			accessibilityevent.setScrollX(((NestedScrollView) (view)).getScrollX());
			accessibilityevent.setScrollY(((NestedScrollView) (view)).getScrollY());
			AccessibilityRecordCompat.setMaxScrollX(((android.view.accessibility.AccessibilityRecord) (accessibilityevent)), ((NestedScrollView) (view)).getScrollX());
			AccessibilityRecordCompat.setMaxScrollY(((android.view.accessibility.AccessibilityRecord) (accessibilityevent)), ((NestedScrollView) (view)).getScrollRange());
		//*  38   69:goto            29
		}

		public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
		{
			super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #64  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
			view = ((View) ((NestedScrollView)view));
		//    4    6:aload_1         
		//    5    7:checkcast       #6   <Class NestedScrollView>
		//    6   10:astore_1        
			accessibilitynodeinfocompat.setClassName(((CharSequence) (((Class) (android/widget/ScrollView)).getName())));
		//    7   11:aload_2         
		//    8   12:ldc1            #18  <Class ScrollView>
		//    9   14:invokevirtual   #24  <Method String Class.getName()>
		//   10   17:invokevirtual   #67  <Method void AccessibilityNodeInfoCompat.setClassName(CharSequence)>
			if(((NestedScrollView) (view)).isEnabled())
		//*  11   20:aload_1         
		//*  12   21:invokevirtual   #71  <Method boolean NestedScrollView.isEnabled()>
		//*  13   24:ifeq            70
			{
				int i = ((NestedScrollView) (view)).getScrollRange();
		//   14   27:aload_1         
		//   15   28:invokevirtual   #34  <Method int NestedScrollView.getScrollRange()>
		//   16   31:istore_3        
				if(i > 0)
		//*  17   32:iload_3         
		//*  18   33:ifle            70
				{
					accessibilitynodeinfocompat.setScrollable(true);
		//   19   36:aload_2         
		//   20   37:iconst_1        
		//   21   38:invokevirtual   #72  <Method void AccessibilityNodeInfoCompat.setScrollable(boolean)>
					if(((NestedScrollView) (view)).getScrollY() > 0)
		//*  22   41:aload_1         
		//*  23   42:invokevirtual   #48  <Method int NestedScrollView.getScrollY()>
		//*  24   45:ifle            55
						accessibilitynodeinfocompat.addAction(8192);
		//   25   48:aload_2         
		//   26   49:sipush          8192
		//   27   52:invokevirtual   #75  <Method void AccessibilityNodeInfoCompat.addAction(int)>
					if(((NestedScrollView) (view)).getScrollY() < i)
		//*  28   55:aload_1         
		//*  29   56:invokevirtual   #48  <Method int NestedScrollView.getScrollY()>
		//*  30   59:iload_3         
		//*  31   60:icmpge          70
						accessibilitynodeinfocompat.addAction(4096);
		//   32   63:aload_2         
		//   33   64:sipush          4096
		//   34   67:invokevirtual   #75  <Method void AccessibilityNodeInfoCompat.addAction(int)>
				}
			}
		//   35   70:return          
		}

		public boolean performAccessibilityAction(View view, int i, Bundle bundle)
		{
			if(super.performAccessibilityAction(view, i, bundle))
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:iload_2         
		//*   3    3:aload_3         
		//*   4    4:invokespecial   #79  <Method boolean AccessibilityDelegateCompat.performAccessibilityAction(View, int, Bundle)>
		//*   5    7:ifeq            12
				return true;
		//    6   10:iconst_1        
		//    7   11:ireturn         
			view = ((View) ((NestedScrollView)view));
		//    8   12:aload_1         
		//    9   13:checkcast       #6   <Class NestedScrollView>
		//   10   16:astore_1        
			if(!((NestedScrollView) (view)).isEnabled())
		//*  11   17:aload_1         
		//*  12   18:invokevirtual   #71  <Method boolean NestedScrollView.isEnabled()>
		//*  13   21:ifne            26
				return false;
		//   14   24:iconst_0        
		//   15   25:ireturn         
			switch(i)
		//*  16   26:iload_2         
			{
		//*  17   27:lookupswitch    2: default 52
		//		               4096: 54
		//		               8192: 109
			default:
				return false;
		//   18   52:iconst_0        
		//   19   53:ireturn         

			case 4096: 
				i = ((NestedScrollView) (view)).getHeight();
		//   20   54:aload_1         
		//   21   55:invokevirtual   #82  <Method int NestedScrollView.getHeight()>
		//   22   58:istore_2        
				int j = ((NestedScrollView) (view)).getPaddingBottom();
		//   23   59:aload_1         
		//   24   60:invokevirtual   #85  <Method int NestedScrollView.getPaddingBottom()>
		//   25   63:istore          4
				int l = ((NestedScrollView) (view)).getPaddingTop();
		//   26   65:aload_1         
		//   27   66:invokevirtual   #88  <Method int NestedScrollView.getPaddingTop()>
		//   28   69:istore          5
				i = Math.min(((NestedScrollView) (view)).getScrollY() + (i - j - l), ((NestedScrollView) (view)).getScrollRange());
		//   29   71:aload_1         
		//   30   72:invokevirtual   #48  <Method int NestedScrollView.getScrollY()>
		//   31   75:iload_2         
		//   32   76:iload           4
		//   33   78:isub            
		//   34   79:iload           5
		//   35   81:isub            
		//   36   82:iadd            
		//   37   83:aload_1         
		//   38   84:invokevirtual   #34  <Method int NestedScrollView.getScrollRange()>
		//   39   87:invokestatic    #94  <Method int Math.min(int, int)>
		//   40   90:istore_2        
				if(i != ((NestedScrollView) (view)).getScrollY())
		//*  41   91:iload_2         
		//*  42   92:aload_1         
		//*  43   93:invokevirtual   #48  <Method int NestedScrollView.getScrollY()>
		//*  44   96:icmpeq          107
				{
					((NestedScrollView) (view)).smoothScrollTo(0, i);
		//   45   99:aload_1         
		//   46  100:iconst_0        
		//   47  101:iload_2         
		//   48  102:invokevirtual   #98  <Method void NestedScrollView.smoothScrollTo(int, int)>
					return true;
		//   49  105:iconst_1        
		//   50  106:ireturn         
				} else
				{
					return false;
		//   51  107:iconst_0        
		//   52  108:ireturn         
				}

			case 8192: 
				i = ((NestedScrollView) (view)).getHeight();
		//   53  109:aload_1         
		//   54  110:invokevirtual   #82  <Method int NestedScrollView.getHeight()>
		//   55  113:istore_2        
				int k = ((NestedScrollView) (view)).getPaddingBottom();
		//   56  114:aload_1         
		//   57  115:invokevirtual   #85  <Method int NestedScrollView.getPaddingBottom()>
		//   58  118:istore          4
				int i1 = ((NestedScrollView) (view)).getPaddingTop();
		//   59  120:aload_1         
		//   60  121:invokevirtual   #88  <Method int NestedScrollView.getPaddingTop()>
		//   61  124:istore          5
				i = Math.max(((NestedScrollView) (view)).getScrollY() - (i - k - i1), 0);
		//   62  126:aload_1         
		//   63  127:invokevirtual   #48  <Method int NestedScrollView.getScrollY()>
		//   64  130:iload_2         
		//   65  131:iload           4
		//   66  133:isub            
		//   67  134:iload           5
		//   68  136:isub            
		//   69  137:isub            
		//   70  138:iconst_0        
		//   71  139:invokestatic    #101 <Method int Math.max(int, int)>
		//   72  142:istore_2        
				break;
			}
			if(i != ((NestedScrollView) (view)).getScrollY())
		//*  73  143:iload_2         
		//*  74  144:aload_1         
		//*  75  145:invokevirtual   #48  <Method int NestedScrollView.getScrollY()>
		//*  76  148:icmpeq          159
			{
				((NestedScrollView) (view)).smoothScrollTo(0, i);
		//   77  151:aload_1         
		//   78  152:iconst_0        
		//   79  153:iload_2         
		//   80  154:invokevirtual   #98  <Method void NestedScrollView.smoothScrollTo(int, int)>
				return true;
		//   81  157:iconst_1        
		//   82  158:ireturn         
			} else
			{
				return false;
		//   83  159:iconst_0        
		//   84  160:ireturn         
			}
		}

		AccessibilityDelegate()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void AccessibilityDelegateCompat()>
		//    2    4:return          
		}
	}

	public static interface OnScrollChangeListener
	{

		public abstract void onScrollChange(NestedScrollView nestedscrollview, int i, int j, int k, int l);
	}

	static class SavedState extends android.view.View.BaseSavedState
	{

		public String toString()
		{
			return (new StringBuilder()).append("HorizontalScrollView.SavedState{").append(Integer.toHexString(System.identityHashCode(((Object) (this))))).append(" scrollPosition=").append(scrollPosition).append("}").toString();
		//    0    0:new             #40  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #41  <Method void StringBuilder()>
		//    3    7:ldc1            #43  <String "HorizontalScrollView.SavedState{">
		//    4    9:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//    5   12:aload_0         
		//    6   13:invokestatic    #53  <Method int System.identityHashCode(Object)>
		//    7   16:invokestatic    #59  <Method String Integer.toHexString(int)>
		//    8   19:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//    9   22:ldc1            #61  <String " scrollPosition=">
		//   10   24:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//   11   27:aload_0         
		//   12   28:getfield        #33  <Field int scrollPosition>
		//   13   31:invokevirtual   #64  <Method StringBuilder StringBuilder.append(int)>
		//   14   34:ldc1            #66  <String "}">
		//   15   36:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//   16   39:invokevirtual   #68  <Method String StringBuilder.toString()>
		//   17   42:areturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #72  <Method void android.view.View$BaseSavedState.writeToParcel(Parcel, int)>
			parcel.writeInt(scrollPosition);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #33  <Field int scrollPosition>
		//    7   11:invokevirtual   #76  <Method void Parcel.writeInt(int)>
		//    8   14:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

			public SavedState createFromParcel(Parcel parcel)
			{
				return new SavedState(parcel);
			//    0    0:new             #9   <Class NestedScrollView$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokespecial   #22  <Method void NestedScrollView$SavedState(Parcel)>
			//    4    8:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #25  <Method NestedScrollView$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
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
			//    2    2:invokevirtual   #30  <Method NestedScrollView$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		public int scrollPosition;

		static 
		{
		//    0    0:new             #9   <Class NestedScrollView$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #19  <Method void NestedScrollView$SavedState$1()>
		//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		SavedState(Parcel parcel)
		{
			super(parcel);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #25  <Method void android.view.View$BaseSavedState(Parcel)>
			scrollPosition = parcel.readInt();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokevirtual   #31  <Method int Parcel.readInt()>
		//    6   10:putfield        #33  <Field int scrollPosition>
		//    7   13:return          
		}

		SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #36  <Method void android.view.View$BaseSavedState(Parcelable)>
		//    3    5:return          
		}
	}


	public NestedScrollView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #89  <Method void NestedScrollView(Context, AttributeSet)>
	//    4    6:return          
	}

	public NestedScrollView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #92  <Method void NestedScrollView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public NestedScrollView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #93  <Method void FrameLayout(Context, AttributeSet, int)>
		mTempRect = new Rect();
	//    5    7:aload_0         
	//    6    8:new             #95  <Class Rect>
	//    7   11:dup             
	//    8   12:invokespecial   #96  <Method void Rect()>
	//    9   15:putfield        #98  <Field Rect mTempRect>
		mIsLayoutDirty = true;
	//   10   18:aload_0         
	//   11   19:iconst_1        
	//   12   20:putfield        #100 <Field boolean mIsLayoutDirty>
		mIsLaidOut = false;
	//   13   23:aload_0         
	//   14   24:iconst_0        
	//   15   25:putfield        #102 <Field boolean mIsLaidOut>
		mChildToScrollTo = null;
	//   16   28:aload_0         
	//   17   29:aconst_null     
	//   18   30:putfield        #104 <Field View mChildToScrollTo>
		mIsBeingDragged = false;
	//   19   33:aload_0         
	//   20   34:iconst_0        
	//   21   35:putfield        #106 <Field boolean mIsBeingDragged>
		mSmoothScrollingEnabled = true;
	//   22   38:aload_0         
	//   23   39:iconst_1        
	//   24   40:putfield        #108 <Field boolean mSmoothScrollingEnabled>
		mActivePointerId = -1;
	//   25   43:aload_0         
	//   26   44:iconst_m1       
	//   27   45:putfield        #110 <Field int mActivePointerId>
		mScrollOffset = new int[2];
	//   28   48:aload_0         
	//   29   49:iconst_2        
	//   30   50:newarray        int[]
	//   31   52:putfield        #112 <Field int[] mScrollOffset>
		mScrollConsumed = new int[2];
	//   32   55:aload_0         
	//   33   56:iconst_2        
	//   34   57:newarray        int[]
	//   35   59:putfield        #114 <Field int[] mScrollConsumed>
		initScrollView();
	//   36   62:aload_0         
	//   37   63:invokespecial   #117 <Method void initScrollView()>
		context = ((Context) (context.obtainStyledAttributes(attributeset, SCROLLVIEW_STYLEABLE, i, 0)));
	//   38   66:aload_1         
	//   39   67:aload_2         
	//   40   68:getstatic       #84  <Field int[] SCROLLVIEW_STYLEABLE>
	//   41   71:iload_3         
	//   42   72:iconst_0        
	//   43   73:invokevirtual   #123 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   44   76:astore_1        
		setFillViewport(((TypedArray) (context)).getBoolean(0, false));
	//   45   77:aload_0         
	//   46   78:aload_1         
	//   47   79:iconst_0        
	//   48   80:iconst_0        
	//   49   81:invokevirtual   #129 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   50   84:invokevirtual   #133 <Method void setFillViewport(boolean)>
		((TypedArray) (context)).recycle();
	//   51   87:aload_1         
	//   52   88:invokevirtual   #136 <Method void TypedArray.recycle()>
		mParentHelper = new NestedScrollingParentHelper(((ViewGroup) (this)));
	//   53   91:aload_0         
	//   54   92:new             #138 <Class NestedScrollingParentHelper>
	//   55   95:dup             
	//   56   96:aload_0         
	//   57   97:invokespecial   #141 <Method void NestedScrollingParentHelper(ViewGroup)>
	//   58  100:putfield        #143 <Field NestedScrollingParentHelper mParentHelper>
		mChildHelper = new NestedScrollingChildHelper(((View) (this)));
	//   59  103:aload_0         
	//   60  104:new             #145 <Class NestedScrollingChildHelper>
	//   61  107:dup             
	//   62  108:aload_0         
	//   63  109:invokespecial   #148 <Method void NestedScrollingChildHelper(View)>
	//   64  112:putfield        #150 <Field NestedScrollingChildHelper mChildHelper>
		setNestedScrollingEnabled(true);
	//   65  115:aload_0         
	//   66  116:iconst_1        
	//   67  117:invokevirtual   #153 <Method void setNestedScrollingEnabled(boolean)>
		ViewCompat.setAccessibilityDelegate(((View) (this)), ((AccessibilityDelegateCompat) (ACCESSIBILITY_DELEGATE)));
	//   68  120:aload_0         
	//   69  121:getstatic       #81  <Field NestedScrollView$AccessibilityDelegate ACCESSIBILITY_DELEGATE>
	//   70  124:invokestatic    #159 <Method void ViewCompat.setAccessibilityDelegate(View, AccessibilityDelegateCompat)>
	//   71  127:return          
	}

	private boolean canScroll()
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		View view = getChildAt(0);
	//    2    2:aload_0         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #165 <Method View getChildAt(int)>
	//    5    7:astore          4
		boolean flag = flag1;
	//    6    9:iload_3         
	//    7   10:istore_2        
		if(view != null)
	//*   8   11:aload           4
	//*   9   13:ifnull          44
		{
			int i = view.getHeight();
	//   10   16:aload           4
	//   11   18:invokevirtual   #171 <Method int View.getHeight()>
	//   12   21:istore_1        
			flag = flag1;
	//   13   22:iload_3         
	//   14   23:istore_2        
			if(getHeight() < getPaddingTop() + i + getPaddingBottom())
	//*  15   24:aload_0         
	//*  16   25:invokevirtual   #172 <Method int getHeight()>
	//*  17   28:aload_0         
	//*  18   29:invokevirtual   #175 <Method int getPaddingTop()>
	//*  19   32:iload_1         
	//*  20   33:iadd            
	//*  21   34:aload_0         
	//*  22   35:invokevirtual   #178 <Method int getPaddingBottom()>
	//*  23   38:iadd            
	//*  24   39:icmpge          44
				flag = true;
	//   25   42:iconst_1        
	//   26   43:istore_2        
		}
		return flag;
	//   27   44:iload_2         
	//   28   45:ireturn         
	}

	private static int clamp(int i, int j, int k)
	{
		int l;
		if(j >= k || i < 0)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmpge          9
	//*   3    5:iload_0         
	//*   4    6:ifge            13
		{
			l = 0;
	//    5    9:iconst_0        
	//    6   10:istore_3        
		} else
	//*   7   11:iload_3         
	//*   8   12:ireturn         
		{
			l = i;
	//    9   13:iload_0         
	//   10   14:istore_3        
			if(j + i > k)
	//*  11   15:iload_1         
	//*  12   16:iload_0         
	//*  13   17:iadd            
	//*  14   18:iload_2         
	//*  15   19:icmple          11
				return k - j;
	//   16   22:iload_2         
	//   17   23:iload_1         
	//   18   24:isub            
	//   19   25:ireturn         
		}
		return l;
	}

	private void doScrollY(int i)
	{
label0:
		{
			if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            17
			{
				if(!mSmoothScrollingEnabled)
					break label0;
	//    2    4:aload_0         
	//    3    5:getfield        #108 <Field boolean mSmoothScrollingEnabled>
	//    4    8:ifeq            18
				smoothScrollBy(0, i);
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:iload_1         
	//    8   14:invokevirtual   #186 <Method void smoothScrollBy(int, int)>
			}
			return;
	//    9   17:return          
		}
		scrollBy(0, i);
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:iload_1         
	//   13   21:invokevirtual   #189 <Method void scrollBy(int, int)>
	//   14   24:return          
	}

	private void endDrag()
	{
		mIsBeingDragged = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #106 <Field boolean mIsBeingDragged>
		recycleVelocityTracker();
	//    3    5:aload_0         
	//    4    6:invokespecial   #193 <Method void recycleVelocityTracker()>
		stopNestedScroll(0);
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #196 <Method void stopNestedScroll(int)>
		if(mEdgeGlowTop != null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #198 <Field EdgeEffect mEdgeGlowTop>
	//*  10   18:ifnull          35
		{
			mEdgeGlowTop.onRelease();
	//   11   21:aload_0         
	//   12   22:getfield        #198 <Field EdgeEffect mEdgeGlowTop>
	//   13   25:invokevirtual   #203 <Method void EdgeEffect.onRelease()>
			mEdgeGlowBottom.onRelease();
	//   14   28:aload_0         
	//   15   29:getfield        #205 <Field EdgeEffect mEdgeGlowBottom>
	//   16   32:invokevirtual   #203 <Method void EdgeEffect.onRelease()>
		}
	//   17   35:return          
	}

	private void ensureGlows()
	{
		if(getOverScrollMode() != 2)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #209 <Method int getOverScrollMode()>
	//*   2    4:iconst_2        
	//*   3    5:icmpeq          45
		{
			if(mEdgeGlowTop == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #198 <Field EdgeEffect mEdgeGlowTop>
	//*   6   12:ifnonnull       44
			{
				Context context = getContext();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #213 <Method Context getContext()>
	//    9   19:astore_1        
				mEdgeGlowTop = new EdgeEffect(context);
	//   10   20:aload_0         
	//   11   21:new             #200 <Class EdgeEffect>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:invokespecial   #215 <Method void EdgeEffect(Context)>
	//   15   29:putfield        #198 <Field EdgeEffect mEdgeGlowTop>
				mEdgeGlowBottom = new EdgeEffect(context);
	//   16   32:aload_0         
	//   17   33:new             #200 <Class EdgeEffect>
	//   18   36:dup             
	//   19   37:aload_1         
	//   20   38:invokespecial   #215 <Method void EdgeEffect(Context)>
	//   21   41:putfield        #205 <Field EdgeEffect mEdgeGlowBottom>
			}
			return;
	//   22   44:return          
		} else
		{
			mEdgeGlowTop = null;
	//   23   45:aload_0         
	//   24   46:aconst_null     
	//   25   47:putfield        #198 <Field EdgeEffect mEdgeGlowTop>
			mEdgeGlowBottom = null;
	//   26   50:aload_0         
	//   27   51:aconst_null     
	//   28   52:putfield        #205 <Field EdgeEffect mEdgeGlowBottom>
			return;
	//   29   55:return          
		}
	}

	private View findFocusableViewInBounds(boolean flag, int i, int j)
	{
		java.util.ArrayList arraylist = getFocusables(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokevirtual   #221 <Method java.util.ArrayList getFocusables(int)>
	//    3    5:astore          14
		View view2 = null;
	//    4    7:aconst_null     
	//    5    8:astore          13
		boolean flag3 = false;
	//    6   10:iconst_0        
	//    7   11:istore          7
		int i1 = ((List) (arraylist)).size();
	//    8   13:aload           14
	//    9   15:invokeinterface #226 <Method int List.size()>
	//   10   20:istore          9
		int k = 0;
	//   11   22:iconst_0        
	//   12   23:istore          6
		while(k < i1) 
	//*  13   25:iload           6
	//*  14   27:iload           9
	//*  15   29:icmpge          257
		{
			View view1 = (View)((List) (arraylist)).get(k);
	//   16   32:aload           14
	//   17   34:iload           6
	//   18   36:invokeinterface #230 <Method Object List.get(int)>
	//   19   41:checkcast       #167 <Class View>
	//   20   44:astore          12
			int l = view1.getTop();
	//   21   46:aload           12
	//   22   48:invokevirtual   #233 <Method int View.getTop()>
	//   23   51:istore          8
			int j1 = view1.getBottom();
	//   24   53:aload           12
	//   25   55:invokevirtual   #236 <Method int View.getBottom()>
	//   26   58:istore          10
			View view = view2;
	//   27   60:aload           13
	//   28   62:astore          11
			boolean flag2 = flag3;
	//   29   64:iload           7
	//   30   66:istore          5
			if(i < j1)
	//*  31   68:iload_2         
	//*  32   69:iload           10
	//*  33   71:icmpge          116
			{
				view = view2;
	//   34   74:aload           13
	//   35   76:astore          11
				flag2 = flag3;
	//   36   78:iload           7
	//   37   80:istore          5
				if(l < j)
	//*  38   82:iload           8
	//*  39   84:iload_3         
	//*  40   85:icmpge          116
				{
					boolean flag1;
					if(i < l && j1 < j)
	//*  41   88:iload_2         
	//*  42   89:iload           8
	//*  43   91:icmpge          133
	//*  44   94:iload           10
	//*  45   96:iload_3         
	//*  46   97:icmpge          133
						flag1 = true;
	//   47  100:iconst_1        
	//   48  101:istore          4
					else
	//*  49  103:aload           13
	//*  50  105:ifnonnull       139
	//*  51  108:aload           12
	//*  52  110:astore          11
	//*  53  112:iload           4
	//*  54  114:istore          5
	//*  55  116:iload           6
	//*  56  118:iconst_1        
	//*  57  119:iadd            
	//*  58  120:istore          6
	//*  59  122:aload           11
	//*  60  124:astore          13
	//*  61  126:iload           5
	//*  62  128:istore          7
	//*  63  130:goto            25
						flag1 = false;
	//   64  133:iconst_0        
	//   65  134:istore          4
					if(view2 == null)
					{
						view = view1;
						flag2 = flag1;
					} else
	//*  66  136:goto            103
					{
						boolean flag4;
						if(flag && l < view2.getTop() || !flag && j1 > view2.getBottom())
	//*  67  139:iload_1         
	//*  68  140:ifeq            153
	//*  69  143:iload           8
	//*  70  145:aload           13
	//*  71  147:invokevirtual   #233 <Method int View.getTop()>
	//*  72  150:icmplt          167
	//*  73  153:iload_1         
	//*  74  154:ifne            212
	//*  75  157:iload           10
	//*  76  159:aload           13
	//*  77  161:invokevirtual   #236 <Method int View.getBottom()>
	//*  78  164:icmple          212
							flag4 = true;
	//   79  167:iconst_1        
	//   80  168:istore          8
						else
	//*  81  170:iload           7
	//*  82  172:ifeq            218
	//*  83  175:aload           13
	//*  84  177:astore          11
	//*  85  179:iload           7
	//*  86  181:istore          5
	//*  87  183:iload           4
	//*  88  185:ifeq            116
	//*  89  188:aload           13
	//*  90  190:astore          11
	//*  91  192:iload           7
	//*  92  194:istore          5
	//*  93  196:iload           8
	//*  94  198:ifeq            116
	//*  95  201:aload           12
	//*  96  203:astore          11
	//*  97  205:iload           7
	//*  98  207:istore          5
	//*  99  209:goto            116
							flag4 = false;
	//  100  212:iconst_0        
	//  101  213:istore          8
						if(flag3)
						{
							view = view2;
							flag2 = flag3;
							if(flag1)
							{
								view = view2;
								flag2 = flag3;
								if(flag4)
								{
									view = view1;
									flag2 = flag3;
								}
							}
						} else
	//* 102  215:goto            170
						if(flag1)
	//* 103  218:iload           4
	//* 104  220:ifeq            233
						{
							view = view1;
	//  105  223:aload           12
	//  106  225:astore          11
							flag2 = true;
	//  107  227:iconst_1        
	//  108  228:istore          5
						} else
	//* 109  230:goto            116
						{
							view = view2;
	//  110  233:aload           13
	//  111  235:astore          11
							flag2 = flag3;
	//  112  237:iload           7
	//  113  239:istore          5
							if(flag4)
	//* 114  241:iload           8
	//* 115  243:ifeq            116
							{
								view = view1;
	//  116  246:aload           12
	//  117  248:astore          11
								flag2 = flag3;
	//  118  250:iload           7
	//  119  252:istore          5
							}
						}
					}
				}
			}
			k++;
			view2 = view;
			flag3 = flag2;
		}
	//* 120  254:goto            116
		return view2;
	//  121  257:aload           13
	//  122  259:areturn         
	}

	private void flingWithNestedDispatch(int i)
	{
		int j = getScrollY();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #240 <Method int getScrollY()>
	//    2    4:istore_2        
		boolean flag;
		if((j > 0 || i > 0) && (j < getScrollRange() || i < 0))
	//*   3    5:iload_2         
	//*   4    6:ifgt            13
	//*   5    9:iload_1         
	//*   6   10:ifle            52
	//*   7   13:iload_2         
	//*   8   14:aload_0         
	//*   9   15:invokevirtual   #243 <Method int getScrollRange()>
	//*  10   18:icmplt          25
	//*  11   21:iload_1         
	//*  12   22:ifge            52
			flag = true;
	//   13   25:iconst_1        
	//   14   26:istore_3        
		else
	//*  15   27:aload_0         
	//*  16   28:fconst_0        
	//*  17   29:iload_1         
	//*  18   30:i2f             
	//*  19   31:invokevirtual   #247 <Method boolean dispatchNestedPreFling(float, float)>
	//*  20   34:ifne            51
	//*  21   37:aload_0         
	//*  22   38:fconst_0        
	//*  23   39:iload_1         
	//*  24   40:i2f             
	//*  25   41:iload_3         
	//*  26   42:invokevirtual   #251 <Method boolean dispatchNestedFling(float, float, boolean)>
	//*  27   45:pop             
	//*  28   46:aload_0         
	//*  29   47:iload_1         
	//*  30   48:invokevirtual   #254 <Method void fling(int)>
	//*  31   51:return          
			flag = false;
	//   32   52:iconst_0        
	//   33   53:istore_3        
		if(!dispatchNestedPreFling(0.0F, i))
		{
			dispatchNestedFling(0.0F, i, flag);
			fling(i);
		}
	//*  34   54:goto            27
	}

	private float getVerticalScrollFactorCompat()
	{
		if(mVerticalScrollFactor == 0.0F)
	//*   0    0:aload_0         
	//*   1    1:getfield        #258 <Field float mVerticalScrollFactor>
	//*   2    4:fconst_0        
	//*   3    5:fcmpl           
	//*   4    6:ifne            63
		{
			TypedValue typedvalue = new TypedValue();
	//    5    9:new             #260 <Class TypedValue>
	//    6   12:dup             
	//    7   13:invokespecial   #261 <Method void TypedValue()>
	//    8   16:astore_1        
			Context context = getContext();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #213 <Method Context getContext()>
	//   11   21:astore_2        
			if(!context.getTheme().resolveAttribute(0x101004d, typedvalue, true))
	//*  12   22:aload_2         
	//*  13   23:invokevirtual   #265 <Method android.content.res.Resources$Theme Context.getTheme()>
	//*  14   26:ldc2            #266 <Int 0x101004d>
	//*  15   29:aload_1         
	//*  16   30:iconst_1        
	//*  17   31:invokevirtual   #272 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//*  18   34:ifne            48
				throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
	//   19   37:new             #274 <Class IllegalStateException>
	//   20   40:dup             
	//   21   41:ldc2            #276 <String "Expected theme to define listPreferredItemHeight.">
	//   22   44:invokespecial   #279 <Method void IllegalStateException(String)>
	//   23   47:athrow          
			mVerticalScrollFactor = typedvalue.getDimension(context.getResources().getDisplayMetrics());
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:aload_2         
	//   27   51:invokevirtual   #283 <Method Resources Context.getResources()>
	//   28   54:invokevirtual   #289 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   29   57:invokevirtual   #293 <Method float TypedValue.getDimension(android.util.DisplayMetrics)>
	//   30   60:putfield        #258 <Field float mVerticalScrollFactor>
		}
		return mVerticalScrollFactor;
	//   31   63:aload_0         
	//   32   64:getfield        #258 <Field float mVerticalScrollFactor>
	//   33   67:freturn         
	}

	private boolean inChild(int i, int j)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		boolean flag = flag1;
	//    2    3:iload           5
	//    3    5:istore          4
		if(getChildCount() > 0)
	//*   4    7:aload_0         
	//*   5    8:invokevirtual   #298 <Method int getChildCount()>
	//*   6   11:ifle            85
		{
			int k = getScrollY();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #240 <Method int getScrollY()>
	//    9   18:istore_3        
			View view = getChildAt(0);
	//   10   19:aload_0         
	//   11   20:iconst_0        
	//   12   21:invokevirtual   #165 <Method View getChildAt(int)>
	//   13   24:astore          6
			flag = flag1;
	//   14   26:iload           5
	//   15   28:istore          4
			if(j >= view.getTop() - k)
	//*  16   30:iload_2         
	//*  17   31:aload           6
	//*  18   33:invokevirtual   #233 <Method int View.getTop()>
	//*  19   36:iload_3         
	//*  20   37:isub            
	//*  21   38:icmplt          85
			{
				flag = flag1;
	//   22   41:iload           5
	//   23   43:istore          4
				if(j < view.getBottom() - k)
	//*  24   45:iload_2         
	//*  25   46:aload           6
	//*  26   48:invokevirtual   #236 <Method int View.getBottom()>
	//*  27   51:iload_3         
	//*  28   52:isub            
	//*  29   53:icmpge          85
				{
					flag = flag1;
	//   30   56:iload           5
	//   31   58:istore          4
					if(i >= view.getLeft())
	//*  32   60:iload_1         
	//*  33   61:aload           6
	//*  34   63:invokevirtual   #301 <Method int View.getLeft()>
	//*  35   66:icmplt          85
					{
						flag = flag1;
	//   36   69:iload           5
	//   37   71:istore          4
						if(i < view.getRight())
	//*  38   73:iload_1         
	//*  39   74:aload           6
	//*  40   76:invokevirtual   #304 <Method int View.getRight()>
	//*  41   79:icmpge          85
							flag = true;
	//   42   82:iconst_1        
	//   43   83:istore          4
					}
				}
			}
		}
		return flag;
	//   44   85:iload           4
	//   45   87:ireturn         
	}

	private void initOrResetVelocityTracker()
	{
		if(mVelocityTracker == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #307 <Field VelocityTracker mVelocityTracker>
	//*   2    4:ifnonnull       15
		{
			mVelocityTracker = VelocityTracker.obtain();
	//    3    7:aload_0         
	//    4    8:invokestatic    #313 <Method VelocityTracker VelocityTracker.obtain()>
	//    5   11:putfield        #307 <Field VelocityTracker mVelocityTracker>
			return;
	//    6   14:return          
		} else
		{
			mVelocityTracker.clear();
	//    7   15:aload_0         
	//    8   16:getfield        #307 <Field VelocityTracker mVelocityTracker>
	//    9   19:invokevirtual   #316 <Method void VelocityTracker.clear()>
			return;
	//   10   22:return          
		}
	}

	private void initScrollView()
	{
		mScroller = new OverScroller(getContext());
	//    0    0:aload_0         
	//    1    1:new             #318 <Class OverScroller>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokevirtual   #213 <Method Context getContext()>
	//    5    9:invokespecial   #319 <Method void OverScroller(Context)>
	//    6   12:putfield        #321 <Field OverScroller mScroller>
		setFocusable(true);
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:invokevirtual   #324 <Method void setFocusable(boolean)>
		setDescendantFocusability(0x40000);
	//   10   20:aload_0         
	//   11   21:ldc2            #325 <Int 0x40000>
	//   12   24:invokevirtual   #328 <Method void setDescendantFocusability(int)>
		setWillNotDraw(false);
	//   13   27:aload_0         
	//   14   28:iconst_0        
	//   15   29:invokevirtual   #331 <Method void setWillNotDraw(boolean)>
		ViewConfiguration viewconfiguration = ViewConfiguration.get(getContext());
	//   16   32:aload_0         
	//   17   33:invokevirtual   #213 <Method Context getContext()>
	//   18   36:invokestatic    #336 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   19   39:astore_1        
		mTouchSlop = viewconfiguration.getScaledTouchSlop();
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:invokevirtual   #339 <Method int ViewConfiguration.getScaledTouchSlop()>
	//   23   45:putfield        #341 <Field int mTouchSlop>
		mMinimumVelocity = viewconfiguration.getScaledMinimumFlingVelocity();
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:invokevirtual   #344 <Method int ViewConfiguration.getScaledMinimumFlingVelocity()>
	//   27   53:putfield        #346 <Field int mMinimumVelocity>
		mMaximumVelocity = viewconfiguration.getScaledMaximumFlingVelocity();
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:invokevirtual   #349 <Method int ViewConfiguration.getScaledMaximumFlingVelocity()>
	//   31   61:putfield        #351 <Field int mMaximumVelocity>
	//   32   64:return          
	}

	private void initVelocityTrackerIfNotExists()
	{
		if(mVelocityTracker == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #307 <Field VelocityTracker mVelocityTracker>
	//*   2    4:ifnonnull       14
			mVelocityTracker = VelocityTracker.obtain();
	//    3    7:aload_0         
	//    4    8:invokestatic    #313 <Method VelocityTracker VelocityTracker.obtain()>
	//    5   11:putfield        #307 <Field VelocityTracker mVelocityTracker>
	//    6   14:return          
	}

	private boolean isOffScreen(View view)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(!isWithinDeltaOfScreen(view, 0, getHeight()))
	//*   2    2:aload_0         
	//*   3    3:aload_1         
	//*   4    4:iconst_0        
	//*   5    5:aload_0         
	//*   6    6:invokevirtual   #172 <Method int getHeight()>
	//*   7    9:invokespecial   #358 <Method boolean isWithinDeltaOfScreen(View, int, int)>
	//*   8   12:ifne            17
			flag = true;
	//    9   15:iconst_1        
	//   10   16:istore_2        
		return flag;
	//   11   17:iload_2         
	//   12   18:ireturn         
	}

	private static boolean isViewDescendantOf(View view, View view1)
	{
		if(view != view1)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
	//*   5    7:aload_0         
	//*   6    8:invokevirtual   #364 <Method ViewParent View.getParent()>
	//*   7   11:astore_0        
			if(!((view = ((View) (view.getParent()))) instanceof ViewGroup) || !isViewDescendantOf((View)view, view1))
	//*   8   12:aload_0         
	//*   9   13:instanceof      #366 <Class ViewGroup>
	//*  10   16:ifeq            30
	//*  11   19:aload_0         
	//*  12   20:checkcast       #167 <Class View>
	//*  13   23:aload_1         
	//*  14   24:invokestatic    #368 <Method boolean isViewDescendantOf(View, View)>
	//*  15   27:ifne            5
				return false;
	//   16   30:iconst_0        
	//   17   31:ireturn         
		return true;
	}

	private boolean isWithinDeltaOfScreen(View view, int i, int j)
	{
		view.getDrawingRect(mTempRect);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #98  <Field Rect mTempRect>
	//    3    5:invokevirtual   #372 <Method void View.getDrawingRect(Rect)>
		offsetDescendantRectToMyCoords(view, mTempRect);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #98  <Field Rect mTempRect>
	//    8   14:invokevirtual   #376 <Method void offsetDescendantRectToMyCoords(View, Rect)>
		return mTempRect.bottom + i >= getScrollY() && mTempRect.top - i <= getScrollY() + j;
	//    9   17:aload_0         
	//   10   18:getfield        #98  <Field Rect mTempRect>
	//   11   21:getfield        #379 <Field int Rect.bottom>
	//   12   24:iload_2         
	//   13   25:iadd            
	//   14   26:aload_0         
	//   15   27:invokevirtual   #240 <Method int getScrollY()>
	//   16   30:icmplt          53
	//   17   33:aload_0         
	//   18   34:getfield        #98  <Field Rect mTempRect>
	//   19   37:getfield        #382 <Field int Rect.top>
	//   20   40:iload_2         
	//   21   41:isub            
	//   22   42:aload_0         
	//   23   43:invokevirtual   #240 <Method int getScrollY()>
	//   24   46:iload_3         
	//   25   47:iadd            
	//   26   48:icmpgt          53
	//   27   51:iconst_1        
	//   28   52:ireturn         
	//   29   53:iconst_0        
	//   30   54:ireturn         
	}

	private void onSecondaryPointerUp(MotionEvent motionevent)
	{
		int i = motionevent.getActionIndex();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #389 <Method int MotionEvent.getActionIndex()>
	//    2    4:istore_2        
		if(motionevent.getPointerId(i) == mActivePointerId)
	//*   3    5:aload_1         
	//*   4    6:iload_2         
	//*   5    7:invokevirtual   #393 <Method int MotionEvent.getPointerId(int)>
	//*   6   10:aload_0         
	//*   7   11:getfield        #110 <Field int mActivePointerId>
	//*   8   14:icmpne          56
		{
			if(i == 0)
	//*   9   17:iload_2         
	//*  10   18:ifne            57
				i = 1;
	//   11   21:iconst_1        
	//   12   22:istore_2        
			else
	//*  13   23:aload_0         
	//*  14   24:aload_1         
	//*  15   25:iload_2         
	//*  16   26:invokevirtual   #397 <Method float MotionEvent.getY(int)>
	//*  17   29:f2i             
	//*  18   30:putfield        #399 <Field int mLastMotionY>
	//*  19   33:aload_0         
	//*  20   34:aload_1         
	//*  21   35:iload_2         
	//*  22   36:invokevirtual   #393 <Method int MotionEvent.getPointerId(int)>
	//*  23   39:putfield        #110 <Field int mActivePointerId>
	//*  24   42:aload_0         
	//*  25   43:getfield        #307 <Field VelocityTracker mVelocityTracker>
	//*  26   46:ifnull          56
	//*  27   49:aload_0         
	//*  28   50:getfield        #307 <Field VelocityTracker mVelocityTracker>
	//*  29   53:invokevirtual   #316 <Method void VelocityTracker.clear()>
	//*  30   56:return          
				i = 0;
	//   31   57:iconst_0        
	//   32   58:istore_2        
			mLastMotionY = (int)motionevent.getY(i);
			mActivePointerId = motionevent.getPointerId(i);
			if(mVelocityTracker != null)
				mVelocityTracker.clear();
		}
	//*  33   59:goto            23
	}

	private void recycleVelocityTracker()
	{
		if(mVelocityTracker != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #307 <Field VelocityTracker mVelocityTracker>
	//*   2    4:ifnull          19
		{
			mVelocityTracker.recycle();
	//    3    7:aload_0         
	//    4    8:getfield        #307 <Field VelocityTracker mVelocityTracker>
	//    5   11:invokevirtual   #400 <Method void VelocityTracker.recycle()>
			mVelocityTracker = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #307 <Field VelocityTracker mVelocityTracker>
		}
	//    9   19:return          
	}

	private boolean scrollAndFocus(int i, int j, int k)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          7
		int i1 = getHeight();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #172 <Method int getHeight()>
	//    4    7:istore          5
		int l = getScrollY();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #240 <Method int getScrollY()>
	//    7   13:istore          4
		i1 = l + i1;
	//    8   15:iload           4
	//    9   17:iload           5
	//   10   19:iadd            
	//   11   20:istore          5
		boolean flag;
		Object obj;
		View view;
		if(i == 33)
	//*  12   22:iload_1         
	//*  13   23:bipush          33
	//*  14   25:icmpne          87
			flag = true;
	//   15   28:iconst_1        
	//   16   29:istore          6
		else
	//*  17   31:aload_0         
	//*  18   32:iload           6
	//*  19   34:iload_2         
	//*  20   35:iload_3         
	//*  21   36:invokespecial   #404 <Method View findFocusableViewInBounds(boolean, int, int)>
	//*  22   39:astore          9
	//*  23   41:aload           9
	//*  24   43:astore          8
	//*  25   45:aload           9
	//*  26   47:ifnonnull       53
	//*  27   50:aload_0         
	//*  28   51:astore          8
	//*  29   53:iload_2         
	//*  30   54:iload           4
	//*  31   56:icmplt          93
	//*  32   59:iload_3         
	//*  33   60:iload           5
	//*  34   62:icmpgt          93
	//*  35   65:iconst_0        
	//*  36   66:istore          6
	//*  37   68:aload           8
	//*  38   70:aload_0         
	//*  39   71:invokevirtual   #408 <Method View findFocus()>
	//*  40   74:if_acmpeq       84
	//*  41   77:aload           8
	//*  42   79:iload_1         
	//*  43   80:invokevirtual   #412 <Method boolean View.requestFocus(int)>
	//*  44   83:pop             
	//*  45   84:iload           6
	//*  46   86:ireturn         
			flag = false;
	//   47   87:iconst_0        
	//   48   88:istore          6
		view = findFocusableViewInBounds(flag, j, k);
		obj = ((Object) (view));
		if(view == null)
			obj = ((Object) (this));
		if(j >= l && k <= i1)
		{
			flag = false;
		} else
	//*  49   90:goto            31
		{
			if(flag)
	//*  50   93:iload           6
	//*  51   95:ifeq            115
				j -= l;
	//   52   98:iload_2         
	//   53   99:iload           4
	//   54  101:isub            
	//   55  102:istore_2        
			else
	//*  56  103:aload_0         
	//*  57  104:iload_2         
	//*  58  105:invokespecial   #414 <Method void doScrollY(int)>
	//*  59  108:iload           7
	//*  60  110:istore          6
	//*  61  112:goto            68
				j = k - i1;
	//   62  115:iload_3         
	//   63  116:iload           5
	//   64  118:isub            
	//   65  119:istore_2        
			doScrollY(j);
			flag = flag1;
		}
		if(obj != findFocus())
			((View) (obj)).requestFocus(i);
		return flag;
	//*  66  120:goto            103
	}

	private void scrollToChild(View view)
	{
		view.getDrawingRect(mTempRect);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #98  <Field Rect mTempRect>
	//    3    5:invokevirtual   #372 <Method void View.getDrawingRect(Rect)>
		offsetDescendantRectToMyCoords(view, mTempRect);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #98  <Field Rect mTempRect>
	//    8   14:invokevirtual   #376 <Method void offsetDescendantRectToMyCoords(View, Rect)>
		int i = computeScrollDeltaToGetChildRectOnScreen(mTempRect);
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #98  <Field Rect mTempRect>
	//   12   22:invokevirtual   #419 <Method int computeScrollDeltaToGetChildRectOnScreen(Rect)>
	//   13   25:istore_2        
		if(i != 0)
	//*  14   26:iload_2         
	//*  15   27:ifeq            36
			scrollBy(0, i);
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:iload_2         
	//   19   33:invokevirtual   #189 <Method void scrollBy(int, int)>
	//   20   36:return          
	}

	private boolean scrollToChildRect(Rect rect, boolean flag)
	{
		int i;
		boolean flag1;
label0:
		{
			i = computeScrollDeltaToGetChildRectOnScreen(rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #419 <Method int computeScrollDeltaToGetChildRectOnScreen(Rect)>
	//    3    5:istore_3        
			if(i != 0)
	//*   4    6:iload_3         
	//*   5    7:ifeq            31
				flag1 = true;
	//    6   10:iconst_1        
	//    7   11:istore          4
			else
	//*   8   13:iload           4
	//*   9   15:ifeq            28
	//*  10   18:iload_2         
	//*  11   19:ifeq            37
	//*  12   22:aload_0         
	//*  13   23:iconst_0        
	//*  14   24:iload_3         
	//*  15   25:invokevirtual   #189 <Method void scrollBy(int, int)>
	//*  16   28:iload           4
	//*  17   30:ireturn         
				flag1 = false;
	//   18   31:iconst_0        
	//   19   32:istore          4
			if(flag1)
			{
				if(!flag)
					break label0;
				scrollBy(0, i);
			}
			return flag1;
		}
	//*  20   34:goto            13
		smoothScrollBy(0, i);
	//   21   37:aload_0         
	//   22   38:iconst_0        
	//   23   39:iload_3         
	//   24   40:invokevirtual   #186 <Method void smoothScrollBy(int, int)>
		return flag1;
	//   25   43:iload           4
	//   26   45:ireturn         
	}

	public void addView(View view)
	{
		if(getChildCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #298 <Method int getChildCount()>
	//*   2    4:ifle            18
		{
			throw new IllegalStateException("ScrollView can host only one direct child");
	//    3    7:new             #274 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #424 <String "ScrollView can host only one direct child">
	//    6   14:invokespecial   #279 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			super.addView(view);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokespecial   #426 <Method void FrameLayout.addView(View)>
			return;
	//   11   23:return          
		}
	}

	public void addView(View view, int i)
	{
		if(getChildCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #298 <Method int getChildCount()>
	//*   2    4:ifle            18
		{
			throw new IllegalStateException("ScrollView can host only one direct child");
	//    3    7:new             #274 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #424 <String "ScrollView can host only one direct child">
	//    6   14:invokespecial   #279 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			super.addView(view, i);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:iload_2         
	//   11   21:invokespecial   #429 <Method void FrameLayout.addView(View, int)>
			return;
	//   12   24:return          
		}
	}

	public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(getChildCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #298 <Method int getChildCount()>
	//*   2    4:ifle            18
		{
			throw new IllegalStateException("ScrollView can host only one direct child");
	//    3    7:new             #274 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #424 <String "ScrollView can host only one direct child">
	//    6   14:invokespecial   #279 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			super.addView(view, i, layoutparams);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:iload_2         
	//   11   21:aload_3         
	//   12   22:invokespecial   #432 <Method void FrameLayout.addView(View, int, android.view.ViewGroup$LayoutParams)>
			return;
	//   13   25:return          
		}
	}

	public void addView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(getChildCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #298 <Method int getChildCount()>
	//*   2    4:ifle            18
		{
			throw new IllegalStateException("ScrollView can host only one direct child");
	//    3    7:new             #274 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #424 <String "ScrollView can host only one direct child">
	//    6   14:invokespecial   #279 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			super.addView(view, layoutparams);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:invokespecial   #435 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
			return;
	//   12   24:return          
		}
	}

	public boolean arrowScroll(int i)
	{
		int l;
		boolean flag;
		View view;
		View view1;
		flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          7
		view1 = findFocus();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #408 <Method View findFocus()>
	//    4    7:astore          9
		view = view1;
	//    5    9:aload           9
	//    6   11:astore          8
		if(view1 == this)
	//*   7   13:aload           9
	//*   8   15:aload_0         
	//*   9   16:if_acmpne       22
			view = null;
	//   10   19:aconst_null     
	//   11   20:astore          8
		view1 = FocusFinder.getInstance().findNextFocus(((ViewGroup) (this)), view, i);
	//   12   22:invokestatic    #442 <Method FocusFinder FocusFinder.getInstance()>
	//   13   25:aload_0         
	//   14   26:aload           8
	//   15   28:iload_1         
	//   16   29:invokevirtual   #446 <Method View FocusFinder.findNextFocus(ViewGroup, View, int)>
	//   17   32:astore          9
		l = getMaxScrollAmount();
	//   18   34:aload_0         
	//   19   35:invokevirtual   #449 <Method int getMaxScrollAmount()>
	//   20   38:istore          4
		if(view1 == null || !isWithinDeltaOfScreen(view1, l, getHeight())) goto _L2; else goto _L1
	//   21   40:aload           9
	//   22   42:ifnull          148
	//   23   45:aload_0         
	//   24   46:aload           9
	//   25   48:iload           4
	//   26   50:aload_0         
	//   27   51:invokevirtual   #172 <Method int getHeight()>
	//   28   54:invokespecial   #358 <Method boolean isWithinDeltaOfScreen(View, int, int)>
	//   29   57:ifeq            148
_L1:
		view1.getDrawingRect(mTempRect);
	//   30   60:aload           9
	//   31   62:aload_0         
	//   32   63:getfield        #98  <Field Rect mTempRect>
	//   33   66:invokevirtual   #372 <Method void View.getDrawingRect(Rect)>
		offsetDescendantRectToMyCoords(view1, mTempRect);
	//   34   69:aload_0         
	//   35   70:aload           9
	//   36   72:aload_0         
	//   37   73:getfield        #98  <Field Rect mTempRect>
	//   38   76:invokevirtual   #376 <Method void offsetDescendantRectToMyCoords(View, Rect)>
		doScrollY(computeScrollDeltaToGetChildRectOnScreen(mTempRect));
	//   39   79:aload_0         
	//   40   80:aload_0         
	//   41   81:aload_0         
	//   42   82:getfield        #98  <Field Rect mTempRect>
	//   43   85:invokevirtual   #419 <Method int computeScrollDeltaToGetChildRectOnScreen(Rect)>
	//   44   88:invokespecial   #414 <Method void doScrollY(int)>
		view1.requestFocus(i);
	//   45   91:aload           9
	//   46   93:iload_1         
	//   47   94:invokevirtual   #412 <Method boolean View.requestFocus(int)>
	//   48   97:pop             
_L6:
		if(view != null && view.isFocused() && isOffScreen(view))
	//*  49   98:aload           8
	//*  50  100:ifnull          142
	//*  51  103:aload           8
	//*  52  105:invokevirtual   #452 <Method boolean View.isFocused()>
	//*  53  108:ifeq            142
	//*  54  111:aload_0         
	//*  55  112:aload           8
	//*  56  114:invokespecial   #454 <Method boolean isOffScreen(View)>
	//*  57  117:ifeq            142
		{
			i = getDescendantFocusability();
	//   58  120:aload_0         
	//   59  121:invokevirtual   #457 <Method int getDescendantFocusability()>
	//   60  124:istore_1        
			setDescendantFocusability(0x20000);
	//   61  125:aload_0         
	//   62  126:ldc2            #458 <Int 0x20000>
	//   63  129:invokevirtual   #328 <Method void setDescendantFocusability(int)>
			requestFocus();
	//   64  132:aload_0         
	//   65  133:invokevirtual   #460 <Method boolean requestFocus()>
	//   66  136:pop             
			setDescendantFocusability(i);
	//   67  137:aload_0         
	//   68  138:iload_1         
	//   69  139:invokevirtual   #328 <Method void setDescendantFocusability(int)>
		}
		flag = true;
	//   70  142:iconst_1        
	//   71  143:istore          7
_L4:
		return flag;
	//   72  145:iload           7
	//   73  147:ireturn         
_L2:
		int j;
		int k = l;
	//   74  148:iload           4
	//   75  150:istore_3        
		if(i == 33 && getScrollY() < k)
	//*  76  151:iload_1         
	//*  77  152:bipush          33
	//*  78  154:icmpne          189
	//*  79  157:aload_0         
	//*  80  158:invokevirtual   #240 <Method int getScrollY()>
	//*  81  161:iload_3         
	//*  82  162:icmpge          189
		{
			j = getScrollY();
	//   83  165:aload_0         
	//   84  166:invokevirtual   #240 <Method int getScrollY()>
	//   85  169:istore_2        
		} else
	//*  86  170:iload_2         
	//*  87  171:ifeq            145
	//*  88  174:iload_1         
	//*  89  175:sipush          130
	//*  90  178:icmpne          254
	//*  91  181:aload_0         
	//*  92  182:iload_2         
	//*  93  183:invokespecial   #414 <Method void doScrollY(int)>
	//*  94  186:goto            98
		{
			j = k;
	//   95  189:iload_3         
	//   96  190:istore_2        
			if(i == 130)
	//*  97  191:iload_1         
	//*  98  192:sipush          130
	//*  99  195:icmpne          170
			{
				j = k;
	//  100  198:iload_3         
	//  101  199:istore_2        
				if(getChildCount() > 0)
	//* 102  200:aload_0         
	//* 103  201:invokevirtual   #298 <Method int getChildCount()>
	//* 104  204:ifle            170
				{
					int i1 = getChildAt(0).getBottom();
	//  105  207:aload_0         
	//  106  208:iconst_0        
	//  107  209:invokevirtual   #165 <Method View getChildAt(int)>
	//  108  212:invokevirtual   #236 <Method int View.getBottom()>
	//  109  215:istore          5
					int j1 = (getScrollY() + getHeight()) - getPaddingBottom();
	//  110  217:aload_0         
	//  111  218:invokevirtual   #240 <Method int getScrollY()>
	//  112  221:aload_0         
	//  113  222:invokevirtual   #172 <Method int getHeight()>
	//  114  225:iadd            
	//  115  226:aload_0         
	//  116  227:invokevirtual   #178 <Method int getPaddingBottom()>
	//  117  230:isub            
	//  118  231:istore          6
					j = k;
	//  119  233:iload_3         
	//  120  234:istore_2        
					if(i1 - j1 < l)
	//* 121  235:iload           5
	//* 122  237:iload           6
	//* 123  239:isub            
	//* 124  240:iload           4
	//* 125  242:icmpge          170
						j = i1 - j1;
	//  126  245:iload           5
	//  127  247:iload           6
	//  128  249:isub            
	//  129  250:istore_2        
				}
			}
		}
		if(j == 0) goto _L4; else goto _L3
_L3:
		if(i != 130)
	//* 130  251:goto            170
			j = -j;
	//  131  254:iload_2         
	//  132  255:ineg            
	//  133  256:istore_2        
		doScrollY(j);
		if(true) goto _L6; else goto _L5
	//  134  257:goto            181
_L5:
	}

	public int computeHorizontalScrollExtent()
	{
		return super.computeHorizontalScrollExtent();
	//    0    0:aload_0         
	//    1    1:invokespecial   #467 <Method int FrameLayout.computeHorizontalScrollExtent()>
	//    2    4:ireturn         
	}

	public int computeHorizontalScrollOffset()
	{
		return super.computeHorizontalScrollOffset();
	//    0    0:aload_0         
	//    1    1:invokespecial   #471 <Method int FrameLayout.computeHorizontalScrollOffset()>
	//    2    4:ireturn         
	}

	public int computeHorizontalScrollRange()
	{
		return super.computeHorizontalScrollRange();
	//    0    0:aload_0         
	//    1    1:invokespecial   #474 <Method int FrameLayout.computeHorizontalScrollRange()>
	//    2    4:ireturn         
	}

	public void computeScroll()
	{
		if(!mScroller.computeScrollOffset()) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #321 <Field OverScroller mScroller>
	//    2    4:invokevirtual   #478 <Method boolean OverScroller.computeScrollOffset()>
	//    3    7:ifeq            214
_L1:
		int i;
		int i1;
		mScroller.getCurrX();
	//    4   10:aload_0         
	//    5   11:getfield        #321 <Field OverScroller mScroller>
	//    6   14:invokevirtual   #481 <Method int OverScroller.getCurrX()>
	//    7   17:pop             
		i1 = mScroller.getCurrY();
	//    8   18:aload_0         
	//    9   19:getfield        #321 <Field OverScroller mScroller>
	//   10   22:invokevirtual   #484 <Method int OverScroller.getCurrY()>
	//   11   25:istore_3        
		int k = i1 - mLastScrollerY;
	//   12   26:iload_3         
	//   13   27:aload_0         
	//   14   28:getfield        #486 <Field int mLastScrollerY>
	//   15   31:isub            
	//   16   32:istore_2        
		i = k;
	//   17   33:iload_2         
	//   18   34:istore_1        
		if(dispatchNestedPreScroll(0, k, mScrollConsumed, ((int []) (null)), 1))
	//*  19   35:aload_0         
	//*  20   36:iconst_0        
	//*  21   37:iload_2         
	//*  22   38:aload_0         
	//*  23   39:getfield        #114 <Field int[] mScrollConsumed>
	//*  24   42:aconst_null     
	//*  25   43:iconst_1        
	//*  26   44:invokevirtual   #490 <Method boolean dispatchNestedPreScroll(int, int, int[], int[], int)>
	//*  27   47:ifeq            59
			i = k - mScrollConsumed[1];
	//   28   50:iload_2         
	//   29   51:aload_0         
	//   30   52:getfield        #114 <Field int[] mScrollConsumed>
	//   31   55:iconst_1        
	//   32   56:iaload          
	//   33   57:isub            
	//   34   58:istore_1        
		if(i == 0) goto _L4; else goto _L3
	//   35   59:iload_1         
	//   36   60:ifeq            170
_L3:
		int l;
		int j1;
		int k1;
		l = getScrollRange();
	//   37   63:aload_0         
	//   38   64:invokevirtual   #243 <Method int getScrollRange()>
	//   39   67:istore_2        
		j1 = getScrollY();
	//   40   68:aload_0         
	//   41   69:invokevirtual   #240 <Method int getScrollY()>
	//   42   72:istore          4
		overScrollByCompat(0, i, getScrollX(), j1, 0, l, 0, 0, false);
	//   43   74:aload_0         
	//   44   75:iconst_0        
	//   45   76:iload_1         
	//   46   77:aload_0         
	//   47   78:invokevirtual   #493 <Method int getScrollX()>
	//   48   81:iload           4
	//   49   83:iconst_0        
	//   50   84:iload_2         
	//   51   85:iconst_0        
	//   52   86:iconst_0        
	//   53   87:iconst_0        
	//   54   88:invokevirtual   #497 <Method boolean overScrollByCompat(int, int, int, int, int, int, int, int, boolean)>
	//   55   91:pop             
		k1 = getScrollY() - j1;
	//   56   92:aload_0         
	//   57   93:invokevirtual   #240 <Method int getScrollY()>
	//   58   96:iload           4
	//   59   98:isub            
	//   60   99:istore          5
		if(dispatchNestedScroll(0, k1, 0, i - k1, ((int []) (null)), 1)) goto _L4; else goto _L5
	//   61  101:aload_0         
	//   62  102:iconst_0        
	//   63  103:iload           5
	//   64  105:iconst_0        
	//   65  106:iload_1         
	//   66  107:iload           5
	//   67  109:isub            
	//   68  110:aconst_null     
	//   69  111:iconst_1        
	//   70  112:invokevirtual   #501 <Method boolean dispatchNestedScroll(int, int, int, int, int[], int)>
	//   71  115:ifne            170
_L5:
		int j = getOverScrollMode();
	//   72  118:aload_0         
	//   73  119:invokevirtual   #209 <Method int getOverScrollMode()>
	//   74  122:istore_1        
		if(j == 0 || j == 1 && l > 0)
	//*  75  123:iload_1         
	//*  76  124:ifeq            136
	//*  77  127:iload_1         
	//*  78  128:iconst_1        
	//*  79  129:icmpne          180
	//*  80  132:iload_2         
	//*  81  133:ifle            180
			j = 1;
	//   82  136:iconst_1        
	//   83  137:istore_1        
		else
	//*  84  138:iload_1         
	//*  85  139:ifeq            170
	//*  86  142:aload_0         
	//*  87  143:invokespecial   #503 <Method void ensureGlows()>
	//*  88  146:iload_3         
	//*  89  147:ifgt            185
	//*  90  150:iload           4
	//*  91  152:ifle            185
	//*  92  155:aload_0         
	//*  93  156:getfield        #198 <Field EdgeEffect mEdgeGlowTop>
	//*  94  159:aload_0         
	//*  95  160:getfield        #321 <Field OverScroller mScroller>
	//*  96  163:invokevirtual   #506 <Method float OverScroller.getCurrVelocity()>
	//*  97  166:f2i             
	//*  98  167:invokevirtual   #509 <Method void EdgeEffect.onAbsorb(int)>
	//*  99  170:aload_0         
	//* 100  171:iload_3         
	//* 101  172:putfield        #486 <Field int mLastScrollerY>
	//* 102  175:aload_0         
	//* 103  176:invokestatic    #512 <Method void ViewCompat.postInvalidateOnAnimation(View)>
	//* 104  179:return          
			j = 0;
	//  105  180:iconst_0        
	//  106  181:istore_1        
		if(!j) goto _L4; else goto _L6
_L6:
		ensureGlows();
		if(i1 > 0 || j1 <= 0) goto _L8; else goto _L7
_L7:
		mEdgeGlowTop.onAbsorb((int)mScroller.getCurrVelocity());
_L4:
		mLastScrollerY = i1;
		ViewCompat.postInvalidateOnAnimation(((View) (this)));
		return;
	//* 107  182:goto            138
_L8:
		if(i1 >= l && j1 < l)
	//* 108  185:iload_3         
	//* 109  186:iload_2         
	//* 110  187:icmplt          170
	//* 111  190:iload           4
	//* 112  192:iload_2         
	//* 113  193:icmpge          170
			mEdgeGlowBottom.onAbsorb((int)mScroller.getCurrVelocity());
	//  114  196:aload_0         
	//  115  197:getfield        #205 <Field EdgeEffect mEdgeGlowBottom>
	//  116  200:aload_0         
	//  117  201:getfield        #321 <Field OverScroller mScroller>
	//  118  204:invokevirtual   #506 <Method float OverScroller.getCurrVelocity()>
	//  119  207:f2i             
	//  120  208:invokevirtual   #509 <Method void EdgeEffect.onAbsorb(int)>
		if(true) goto _L4; else goto _L2
	//  121  211:goto            170
_L2:
		if(hasNestedScrollingParent(1))
	//* 122  214:aload_0         
	//* 123  215:iconst_1        
	//* 124  216:invokevirtual   #515 <Method boolean hasNestedScrollingParent(int)>
	//* 125  219:ifeq            227
			stopNestedScroll(1);
	//  126  222:aload_0         
	//  127  223:iconst_1        
	//  128  224:invokevirtual   #196 <Method void stopNestedScroll(int)>
		mLastScrollerY = 0;
	//  129  227:aload_0         
	//  130  228:iconst_0        
	//  131  229:putfield        #486 <Field int mLastScrollerY>
		return;
	//  132  232:return          
	}

	protected int computeScrollDeltaToGetChildRectOnScreen(Rect rect)
	{
		if(getChildCount() != 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #298 <Method int getChildCount()>
	//*   2    4:ifne            9
	//*   3    7:iconst_0        
	//*   4    8:ireturn         
		{
			int l = getHeight();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #172 <Method int getHeight()>
	//    7   13:istore          5
			int i = getScrollY();
	//    8   15:aload_0         
	//    9   16:invokevirtual   #240 <Method int getScrollY()>
	//   10   19:istore_2        
			int k = i + l;
	//   11   20:iload_2         
	//   12   21:iload           5
	//   13   23:iadd            
	//   14   24:istore          4
			int i1 = getVerticalFadingEdgeLength();
	//   15   26:aload_0         
	//   16   27:invokevirtual   #518 <Method int getVerticalFadingEdgeLength()>
	//   17   30:istore          6
			int j = i;
	//   18   32:iload_2         
	//   19   33:istore_3        
			if(rect.top > 0)
	//*  20   34:aload_1         
	//*  21   35:getfield        #382 <Field int Rect.top>
	//*  22   38:ifle            46
				j = i + i1;
	//   23   41:iload_2         
	//   24   42:iload           6
	//   25   44:iadd            
	//   26   45:istore_3        
			i = k;
	//   27   46:iload           4
	//   28   48:istore_2        
			if(rect.bottom < getChildAt(0).getHeight())
	//*  29   49:aload_1         
	//*  30   50:getfield        #379 <Field int Rect.bottom>
	//*  31   53:aload_0         
	//*  32   54:iconst_0        
	//*  33   55:invokevirtual   #165 <Method View getChildAt(int)>
	//*  34   58:invokevirtual   #171 <Method int View.getHeight()>
	//*  35   61:icmpge          70
				i = k - i1;
	//   36   64:iload           4
	//   37   66:iload           6
	//   38   68:isub            
	//   39   69:istore_2        
			if(rect.bottom > i && rect.top > j)
	//*  40   70:aload_1         
	//*  41   71:getfield        #379 <Field int Rect.bottom>
	//*  42   74:iload_2         
	//*  43   75:icmple          131
	//*  44   78:aload_1         
	//*  45   79:getfield        #382 <Field int Rect.top>
	//*  46   82:iload_3         
	//*  47   83:icmple          131
			{
				if(rect.height() > l)
	//*  48   86:aload_1         
	//*  49   87:invokevirtual   #521 <Method int Rect.height()>
	//*  50   90:iload           5
	//*  51   92:icmple          119
					j = 0 + (rect.top - j);
	//   52   95:iconst_0        
	//   53   96:aload_1         
	//   54   97:getfield        #382 <Field int Rect.top>
	//   55  100:iload_3         
	//   56  101:isub            
	//   57  102:iadd            
	//   58  103:istore_3        
				else
	//*  59  104:iload_3         
	//*  60  105:aload_0         
	//*  61  106:iconst_0        
	//*  62  107:invokevirtual   #165 <Method View getChildAt(int)>
	//*  63  110:invokevirtual   #236 <Method int View.getBottom()>
	//*  64  113:iload_2         
	//*  65  114:isub            
	//*  66  115:invokestatic    #527 <Method int Math.min(int, int)>
	//*  67  118:ireturn         
					j = 0 + (rect.bottom - i);
	//   68  119:iconst_0        
	//   69  120:aload_1         
	//   70  121:getfield        #379 <Field int Rect.bottom>
	//   71  124:iload_2         
	//   72  125:isub            
	//   73  126:iadd            
	//   74  127:istore_3        
				return Math.min(j, getChildAt(0).getBottom() - i);
			}
	//*  75  128:goto            104
			if(rect.top < j && rect.bottom < i)
	//*  76  131:aload_1         
	//*  77  132:getfield        #382 <Field int Rect.top>
	//*  78  135:iload_3         
	//*  79  136:icmpge          7
	//*  80  139:aload_1         
	//*  81  140:getfield        #379 <Field int Rect.bottom>
	//*  82  143:iload_2         
	//*  83  144:icmpge          7
			{
				if(rect.height() > l)
	//*  84  147:aload_1         
	//*  85  148:invokevirtual   #521 <Method int Rect.height()>
	//*  86  151:iload           5
	//*  87  153:icmple          175
					i = 0 - (i - rect.bottom);
	//   88  156:iconst_0        
	//   89  157:iload_2         
	//   90  158:aload_1         
	//   91  159:getfield        #379 <Field int Rect.bottom>
	//   92  162:isub            
	//   93  163:isub            
	//   94  164:istore_2        
				else
	//*  95  165:iload_2         
	//*  96  166:aload_0         
	//*  97  167:invokevirtual   #240 <Method int getScrollY()>
	//*  98  170:ineg            
	//*  99  171:invokestatic    #530 <Method int Math.max(int, int)>
	//* 100  174:ireturn         
					i = 0 - (j - rect.top);
	//  101  175:iconst_0        
	//  102  176:iload_3         
	//  103  177:aload_1         
	//  104  178:getfield        #382 <Field int Rect.top>
	//  105  181:isub            
	//  106  182:isub            
	//  107  183:istore_2        
				return Math.max(i, -getScrollY());
			}
		}
		return 0;
	//* 108  184:goto            165
	}

	public int computeVerticalScrollExtent()
	{
		return super.computeVerticalScrollExtent();
	//    0    0:aload_0         
	//    1    1:invokespecial   #533 <Method int FrameLayout.computeVerticalScrollExtent()>
	//    2    4:ireturn         
	}

	public int computeVerticalScrollOffset()
	{
		return Math.max(0, super.computeVerticalScrollOffset());
	//    0    0:iconst_0        
	//    1    1:aload_0         
	//    2    2:invokespecial   #536 <Method int FrameLayout.computeVerticalScrollOffset()>
	//    3    5:invokestatic    #530 <Method int Math.max(int, int)>
	//    4    8:ireturn         
	}

	public int computeVerticalScrollRange()
	{
		int k;
		int l;
		int i1;
		k = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #298 <Method int getChildCount()>
	//    2    4:istore_2        
		int i = getHeight() - getPaddingBottom() - getPaddingTop();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #172 <Method int getHeight()>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #178 <Method int getPaddingBottom()>
	//    7   13:isub            
	//    8   14:aload_0         
	//    9   15:invokevirtual   #175 <Method int getPaddingTop()>
	//   10   18:isub            
	//   11   19:istore_1        
		if(k == 0)
	//*  12   20:iload_2         
	//*  13   21:ifne            26
			return i;
	//   14   24:iload_1         
	//   15   25:ireturn         
		k = getChildAt(0).getBottom();
	//   16   26:aload_0         
	//   17   27:iconst_0        
	//   18   28:invokevirtual   #165 <Method View getChildAt(int)>
	//   19   31:invokevirtual   #236 <Method int View.getBottom()>
	//   20   34:istore_2        
		l = getScrollY();
	//   21   35:aload_0         
	//   22   36:invokevirtual   #240 <Method int getScrollY()>
	//   23   39:istore_3        
		i1 = Math.max(0, k - i);
	//   24   40:iconst_0        
	//   25   41:iload_2         
	//   26   42:iload_1         
	//   27   43:isub            
	//   28   44:invokestatic    #530 <Method int Math.max(int, int)>
	//   29   47:istore          4
		if(l >= 0) goto _L2; else goto _L1
	//   30   49:iload_3         
	//   31   50:ifge            59
_L1:
		int j = k - l;
	//   32   53:iload_2         
	//   33   54:iload_3         
	//   34   55:isub            
	//   35   56:istore_1        
_L4:
		return j;
	//   36   57:iload_1         
	//   37   58:ireturn         
_L2:
		j = k;
	//   38   59:iload_2         
	//   39   60:istore_1        
		if(l > i1)
	//*  40   61:iload_3         
	//*  41   62:iload           4
	//*  42   64:icmple          57
			j = k + (l - i1);
	//   43   67:iload_2         
	//   44   68:iload_3         
	//   45   69:iload           4
	//   46   71:isub            
	//   47   72:iadd            
	//   48   73:istore_1        
		if(true) goto _L4; else goto _L3
	//   49   74:goto            57
_L3:
	}

	public boolean dispatchKeyEvent(KeyEvent keyevent)
	{
		return super.dispatchKeyEvent(keyevent) || executeKeyEvent(keyevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #541 <Method boolean FrameLayout.dispatchKeyEvent(KeyEvent)>
	//    3    5:ifne            16
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #544 <Method boolean executeKeyEvent(KeyEvent)>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public boolean dispatchNestedFling(float f, float f1, boolean flag)
	{
		return mChildHelper.dispatchNestedFling(f, f1, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #545 <Method boolean NestedScrollingChildHelper.dispatchNestedFling(float, float, boolean)>
	//    6   10:ireturn         
	}

	public boolean dispatchNestedPreFling(float f, float f1)
	{
		return mChildHelper.dispatchNestedPreFling(f, f1);
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokevirtual   #546 <Method boolean NestedScrollingChildHelper.dispatchNestedPreFling(float, float)>
	//    5    9:ireturn         
	}

	public boolean dispatchNestedPreScroll(int i, int j, int ai[], int ai1[])
	{
		return mChildHelper.dispatchNestedPreScroll(i, j, ai, ai1);
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #549 <Method boolean NestedScrollingChildHelper.dispatchNestedPreScroll(int, int, int[], int[])>
	//    7   12:ireturn         
	}

	public boolean dispatchNestedPreScroll(int i, int j, int ai[], int ai1[], int k)
	{
		return mChildHelper.dispatchNestedPreScroll(i, j, ai, ai1, k);
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:iload           5
	//    7   11:invokevirtual   #550 <Method boolean NestedScrollingChildHelper.dispatchNestedPreScroll(int, int, int[], int[], int)>
	//    8   14:ireturn         
	}

	public boolean dispatchNestedScroll(int i, int j, int k, int l, int ai[])
	{
		return mChildHelper.dispatchNestedScroll(i, j, k, l, ai);
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:aload           5
	//    7   11:invokevirtual   #553 <Method boolean NestedScrollingChildHelper.dispatchNestedScroll(int, int, int, int, int[])>
	//    8   14:ireturn         
	}

	public boolean dispatchNestedScroll(int i, int j, int k, int l, int ai[], int i1)
	{
		return mChildHelper.dispatchNestedScroll(i, j, k, l, ai, i1);
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:aload           5
	//    7   11:iload           6
	//    8   13:invokevirtual   #554 <Method boolean NestedScrollingChildHelper.dispatchNestedScroll(int, int, int, int, int[], int)>
	//    9   16:ireturn         
	}

	public void draw(Canvas canvas)
	{
		super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #558 <Method void FrameLayout.draw(Canvas)>
		if(mEdgeGlowTop != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #198 <Field EdgeEffect mEdgeGlowTop>
	//*   5    9:ifnull          208
		{
			int i = getScrollY();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #240 <Method int getScrollY()>
	//    8   16:istore_2        
			if(!mEdgeGlowTop.isFinished())
	//*   9   17:aload_0         
	//*  10   18:getfield        #198 <Field EdgeEffect mEdgeGlowTop>
	//*  11   21:invokevirtual   #561 <Method boolean EdgeEffect.isFinished()>
	//*  12   24:ifne            104
			{
				int j = canvas.save();
	//   13   27:aload_1         
	//   14   28:invokevirtual   #566 <Method int Canvas.save()>
	//   15   31:istore_3        
				int l = getWidth();
	//   16   32:aload_0         
	//   17   33:invokevirtual   #569 <Method int getWidth()>
	//   18   36:istore          4
				int j1 = getPaddingLeft();
	//   19   38:aload_0         
	//   20   39:invokevirtual   #572 <Method int getPaddingLeft()>
	//   21   42:istore          5
				int l1 = getPaddingRight();
	//   22   44:aload_0         
	//   23   45:invokevirtual   #575 <Method int getPaddingRight()>
	//   24   48:istore          6
				canvas.translate(getPaddingLeft(), Math.min(0, i));
	//   25   50:aload_1         
	//   26   51:aload_0         
	//   27   52:invokevirtual   #572 <Method int getPaddingLeft()>
	//   28   55:i2f             
	//   29   56:iconst_0        
	//   30   57:iload_2         
	//   31   58:invokestatic    #527 <Method int Math.min(int, int)>
	//   32   61:i2f             
	//   33   62:invokevirtual   #579 <Method void Canvas.translate(float, float)>
				mEdgeGlowTop.setSize(l - j1 - l1, getHeight());
	//   34   65:aload_0         
	//   35   66:getfield        #198 <Field EdgeEffect mEdgeGlowTop>
	//   36   69:iload           4
	//   37   71:iload           5
	//   38   73:isub            
	//   39   74:iload           6
	//   40   76:isub            
	//   41   77:aload_0         
	//   42   78:invokevirtual   #172 <Method int getHeight()>
	//   43   81:invokevirtual   #582 <Method void EdgeEffect.setSize(int, int)>
				if(mEdgeGlowTop.draw(canvas))
	//*  44   84:aload_0         
	//*  45   85:getfield        #198 <Field EdgeEffect mEdgeGlowTop>
	//*  46   88:aload_1         
	//*  47   89:invokevirtual   #585 <Method boolean EdgeEffect.draw(Canvas)>
	//*  48   92:ifeq            99
					ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   49   95:aload_0         
	//   50   96:invokestatic    #512 <Method void ViewCompat.postInvalidateOnAnimation(View)>
				canvas.restoreToCount(j);
	//   51   99:aload_1         
	//   52  100:iload_3         
	//   53  101:invokevirtual   #588 <Method void Canvas.restoreToCount(int)>
			}
			if(!mEdgeGlowBottom.isFinished())
	//*  54  104:aload_0         
	//*  55  105:getfield        #205 <Field EdgeEffect mEdgeGlowBottom>
	//*  56  108:invokevirtual   #561 <Method boolean EdgeEffect.isFinished()>
	//*  57  111:ifne            208
			{
				int k = canvas.save();
	//   58  114:aload_1         
	//   59  115:invokevirtual   #566 <Method int Canvas.save()>
	//   60  118:istore_3        
				int i1 = getWidth() - getPaddingLeft() - getPaddingRight();
	//   61  119:aload_0         
	//   62  120:invokevirtual   #569 <Method int getWidth()>
	//   63  123:aload_0         
	//   64  124:invokevirtual   #572 <Method int getPaddingLeft()>
	//   65  127:isub            
	//   66  128:aload_0         
	//   67  129:invokevirtual   #575 <Method int getPaddingRight()>
	//   68  132:isub            
	//   69  133:istore          4
				int k1 = getHeight();
	//   70  135:aload_0         
	//   71  136:invokevirtual   #172 <Method int getHeight()>
	//   72  139:istore          5
				canvas.translate(-i1 + getPaddingLeft(), Math.max(getScrollRange(), i) + k1);
	//   73  141:aload_1         
	//   74  142:iload           4
	//   75  144:ineg            
	//   76  145:aload_0         
	//   77  146:invokevirtual   #572 <Method int getPaddingLeft()>
	//   78  149:iadd            
	//   79  150:i2f             
	//   80  151:aload_0         
	//   81  152:invokevirtual   #243 <Method int getScrollRange()>
	//   82  155:iload_2         
	//   83  156:invokestatic    #530 <Method int Math.max(int, int)>
	//   84  159:iload           5
	//   85  161:iadd            
	//   86  162:i2f             
	//   87  163:invokevirtual   #579 <Method void Canvas.translate(float, float)>
				canvas.rotate(180F, i1, 0.0F);
	//   88  166:aload_1         
	//   89  167:ldc2            #589 <Float 180F>
	//   90  170:iload           4
	//   91  172:i2f             
	//   92  173:fconst_0        
	//   93  174:invokevirtual   #593 <Method void Canvas.rotate(float, float, float)>
				mEdgeGlowBottom.setSize(i1, k1);
	//   94  177:aload_0         
	//   95  178:getfield        #205 <Field EdgeEffect mEdgeGlowBottom>
	//   96  181:iload           4
	//   97  183:iload           5
	//   98  185:invokevirtual   #582 <Method void EdgeEffect.setSize(int, int)>
				if(mEdgeGlowBottom.draw(canvas))
	//*  99  188:aload_0         
	//* 100  189:getfield        #205 <Field EdgeEffect mEdgeGlowBottom>
	//* 101  192:aload_1         
	//* 102  193:invokevirtual   #585 <Method boolean EdgeEffect.draw(Canvas)>
	//* 103  196:ifeq            203
					ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//  104  199:aload_0         
	//  105  200:invokestatic    #512 <Method void ViewCompat.postInvalidateOnAnimation(View)>
				canvas.restoreToCount(k);
	//  106  203:aload_1         
	//  107  204:iload_3         
	//  108  205:invokevirtual   #588 <Method void Canvas.restoreToCount(int)>
			}
		}
	//  109  208:return          
	}

	public boolean executeKeyEvent(KeyEvent keyevent)
	{
		boolean flag1;
		boolean flag2;
		flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		mTempRect.setEmpty();
	//    2    3:aload_0         
	//    3    4:getfield        #98  <Field Rect mTempRect>
	//    4    7:invokevirtual   #596 <Method void Rect.setEmpty()>
		if(!canScroll())
	//*   5   10:aload_0         
	//*   6   11:invokespecial   #598 <Method boolean canScroll()>
	//*   7   14:ifne            99
		{
			boolean flag = flag2;
	//    8   17:iload           4
	//    9   19:istore_3        
			if(isFocused())
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #599 <Method boolean isFocused()>
	//*  12   24:ifeq            97
			{
				flag = flag2;
	//   13   27:iload           4
	//   14   29:istore_3        
				if(keyevent.getKeyCode() != 4)
	//*  15   30:aload_1         
	//*  16   31:invokevirtual   #604 <Method int KeyEvent.getKeyCode()>
	//*  17   34:iconst_4        
	//*  18   35:icmpeq          97
				{
					View view = findFocus();
	//   19   38:aload_0         
	//   20   39:invokevirtual   #408 <Method View findFocus()>
	//   21   42:astore          5
					keyevent = ((KeyEvent) (view));
	//   22   44:aload           5
	//   23   46:astore_1        
					if(view == this)
	//*  24   47:aload           5
	//*  25   49:aload_0         
	//*  26   50:if_acmpne       55
						keyevent = null;
	//   27   53:aconst_null     
	//   28   54:astore_1        
					keyevent = ((KeyEvent) (FocusFinder.getInstance().findNextFocus(((ViewGroup) (this)), ((View) (keyevent)), 130)));
	//   29   55:invokestatic    #442 <Method FocusFinder FocusFinder.getInstance()>
	//   30   58:aload_0         
	//   31   59:aload_1         
	//   32   60:sipush          130
	//   33   63:invokevirtual   #446 <Method View FocusFinder.findNextFocus(ViewGroup, View, int)>
	//   34   66:astore_1        
					flag = flag2;
	//   35   67:iload           4
	//   36   69:istore_3        
					if(keyevent != null)
	//*  37   70:aload_1         
	//*  38   71:ifnull          97
					{
						flag = flag2;
	//   39   74:iload           4
	//   40   76:istore_3        
						if(keyevent != this)
	//*  41   77:aload_1         
	//*  42   78:aload_0         
	//*  43   79:if_acmpeq       97
						{
							flag = flag2;
	//   44   82:iload           4
	//   45   84:istore_3        
							if(((View) (keyevent)).requestFocus(130))
	//*  46   85:aload_1         
	//*  47   86:sipush          130
	//*  48   89:invokevirtual   #412 <Method boolean View.requestFocus(int)>
	//*  49   92:ifeq            97
								flag = true;
	//   50   95:iconst_1        
	//   51   96:istore_3        
						}
					}
				}
			}
			return flag;
	//   52   97:iload_3         
	//   53   98:ireturn         
		}
		flag2 = false;
	//   54   99:iconst_0        
	//   55  100:istore          4
		flag1 = flag2;
	//   56  102:iload           4
	//   57  104:istore_3        
		if(keyevent.getAction() != 0) goto _L2; else goto _L1
	//   58  105:aload_1         
	//   59  106:invokevirtual   #607 <Method int KeyEvent.getAction()>
	//   60  109:ifne            155
_L1:
		keyevent.getKeyCode();
	//   61  112:aload_1         
	//   62  113:invokevirtual   #604 <Method int KeyEvent.getKeyCode()>
		JVM INSTR lookupswitch 3: default 152
	//	               19: 157
	//	               20: 184
	//	               62: 213;
	//   63  116:lookupswitch    3: default 152
	//	               19: 157
	//	               20: 184
	//	               62: 213
		   goto _L3 _L4 _L5 _L6
_L3:
		flag1 = flag2;
	//   64  152:iload           4
	//   65  154:istore_3        
_L2:
		return flag1;
	//   66  155:iload_3         
	//   67  156:ireturn         
_L4:
		if(!keyevent.isAltPressed())
	//*  68  157:aload_1         
	//*  69  158:invokevirtual   #610 <Method boolean KeyEvent.isAltPressed()>
	//*  70  161:ifne            174
			flag1 = arrowScroll(33);
	//   71  164:aload_0         
	//   72  165:bipush          33
	//   73  167:invokevirtual   #612 <Method boolean arrowScroll(int)>
	//   74  170:istore_3        
		else
	//*  75  171:goto            155
			flag1 = fullScroll(33);
	//   76  174:aload_0         
	//   77  175:bipush          33
	//   78  177:invokevirtual   #615 <Method boolean fullScroll(int)>
	//   79  180:istore_3        
		continue; /* Loop/switch isn't completed */
	//   80  181:goto            155
_L5:
		if(!keyevent.isAltPressed())
	//*  81  184:aload_1         
	//*  82  185:invokevirtual   #610 <Method boolean KeyEvent.isAltPressed()>
	//*  83  188:ifne            202
			flag1 = arrowScroll(130);
	//   84  191:aload_0         
	//   85  192:sipush          130
	//   86  195:invokevirtual   #612 <Method boolean arrowScroll(int)>
	//   87  198:istore_3        
		else
	//*  88  199:goto            155
			flag1 = fullScroll(130);
	//   89  202:aload_0         
	//   90  203:sipush          130
	//   91  206:invokevirtual   #615 <Method boolean fullScroll(int)>
	//   92  209:istore_3        
		continue; /* Loop/switch isn't completed */
	//   93  210:goto            155
_L6:
		char c;
		if(keyevent.isShiftPressed())
	//*  94  213:aload_1         
	//*  95  214:invokevirtual   #618 <Method boolean KeyEvent.isShiftPressed()>
	//*  96  217:ifeq            235
			c = '!';
	//   97  220:bipush          33
	//   98  222:istore_2        
		else
	//*  99  223:aload_0         
	//* 100  224:iload_2         
	//* 101  225:invokevirtual   #621 <Method boolean pageScroll(int)>
	//* 102  228:pop             
	//* 103  229:iload           4
	//* 104  231:istore_3        
	//* 105  232:goto            155
			c = '\202';
	//  106  235:sipush          130
	//  107  238:istore_2        
		pageScroll(((int) (c)));
		flag1 = flag2;
		if(true) goto _L2; else goto _L7
	//  108  239:goto            223
_L7:
	}

	public void fling(int i)
	{
		if(getChildCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #298 <Method int getChildCount()>
	//*   2    4:ifle            53
		{
			startNestedScroll(2, 1);
	//    3    7:aload_0         
	//    4    8:iconst_2        
	//    5    9:iconst_1        
	//    6   10:invokevirtual   #624 <Method boolean startNestedScroll(int, int)>
	//    7   13:pop             
			mScroller.fling(getScrollX(), getScrollY(), 0, i, 0, 0, 0x80000000, 0x7fffffff, 0, 0);
	//    8   14:aload_0         
	//    9   15:getfield        #321 <Field OverScroller mScroller>
	//   10   18:aload_0         
	//   11   19:invokevirtual   #493 <Method int getScrollX()>
	//   12   22:aload_0         
	//   13   23:invokevirtual   #240 <Method int getScrollY()>
	//   14   26:iconst_0        
	//   15   27:iload_1         
	//   16   28:iconst_0        
	//   17   29:iconst_0        
	//   18   30:ldc2            #625 <Int 0x80000000>
	//   19   33:ldc2            #626 <Int 0x7fffffff>
	//   20   36:iconst_0        
	//   21   37:iconst_0        
	//   22   38:invokevirtual   #629 <Method void OverScroller.fling(int, int, int, int, int, int, int, int, int, int)>
			mLastScrollerY = getScrollY();
	//   23   41:aload_0         
	//   24   42:aload_0         
	//   25   43:invokevirtual   #240 <Method int getScrollY()>
	//   26   46:putfield        #486 <Field int mLastScrollerY>
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   27   49:aload_0         
	//   28   50:invokestatic    #512 <Method void ViewCompat.postInvalidateOnAnimation(View)>
		}
	//   29   53:return          
	}

	public boolean fullScroll(int i)
	{
		int j;
		int k;
		if(i == 130)
	//*   0    0:iload_1         
	//*   1    1:sipush          130
	//*   2    4:icmpne          105
			j = 1;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #172 <Method int getHeight()>
	//*   7   13:istore_3        
	//*   8   14:aload_0         
	//*   9   15:getfield        #98  <Field Rect mTempRect>
	//*  10   18:iconst_0        
	//*  11   19:putfield        #382 <Field int Rect.top>
	//*  12   22:aload_0         
	//*  13   23:getfield        #98  <Field Rect mTempRect>
	//*  14   26:iload_3         
	//*  15   27:putfield        #379 <Field int Rect.bottom>
	//*  16   30:iload_2         
	//*  17   31:ifeq            85
	//*  18   34:aload_0         
	//*  19   35:invokevirtual   #298 <Method int getChildCount()>
	//*  20   38:istore_2        
	//*  21   39:iload_2         
	//*  22   40:ifle            85
	//*  23   43:aload_0         
	//*  24   44:iload_2         
	//*  25   45:iconst_1        
	//*  26   46:isub            
	//*  27   47:invokevirtual   #165 <Method View getChildAt(int)>
	//*  28   50:astore          4
	//*  29   52:aload_0         
	//*  30   53:getfield        #98  <Field Rect mTempRect>
	//*  31   56:aload           4
	//*  32   58:invokevirtual   #236 <Method int View.getBottom()>
	//*  33   61:aload_0         
	//*  34   62:invokevirtual   #178 <Method int getPaddingBottom()>
	//*  35   65:iadd            
	//*  36   66:putfield        #379 <Field int Rect.bottom>
	//*  37   69:aload_0         
	//*  38   70:getfield        #98  <Field Rect mTempRect>
	//*  39   73:aload_0         
	//*  40   74:getfield        #98  <Field Rect mTempRect>
	//*  41   77:getfield        #379 <Field int Rect.bottom>
	//*  42   80:iload_3         
	//*  43   81:isub            
	//*  44   82:putfield        #382 <Field int Rect.top>
	//*  45   85:aload_0         
	//*  46   86:iload_1         
	//*  47   87:aload_0         
	//*  48   88:getfield        #98  <Field Rect mTempRect>
	//*  49   91:getfield        #382 <Field int Rect.top>
	//*  50   94:aload_0         
	//*  51   95:getfield        #98  <Field Rect mTempRect>
	//*  52   98:getfield        #379 <Field int Rect.bottom>
	//*  53  101:invokespecial   #631 <Method boolean scrollAndFocus(int, int, int)>
	//*  54  104:ireturn         
			j = 0;
	//   55  105:iconst_0        
	//   56  106:istore_2        
		k = getHeight();
		mTempRect.top = 0;
		mTempRect.bottom = k;
		if(j != 0)
		{
			j = getChildCount();
			if(j > 0)
			{
				View view = getChildAt(j - 1);
				mTempRect.bottom = view.getBottom() + getPaddingBottom();
				mTempRect.top = mTempRect.bottom - k;
			}
		}
		return scrollAndFocus(i, mTempRect.top, mTempRect.bottom);
	//*  57  107:goto            9
	}

	protected float getBottomFadingEdgeStrength()
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #298 <Method int getChildCount()>
	//*   2    4:ifne            9
			return 0.0F;
	//    3    7:fconst_0        
	//    4    8:freturn         
		int i = getVerticalFadingEdgeLength();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #518 <Method int getVerticalFadingEdgeLength()>
	//    7   13:istore_1        
		int j = getHeight();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #172 <Method int getHeight()>
	//   10   18:istore_2        
		int k = getPaddingBottom();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #178 <Method int getPaddingBottom()>
	//   13   23:istore_3        
		j = getChildAt(0).getBottom() - getScrollY() - (j - k);
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:invokevirtual   #165 <Method View getChildAt(int)>
	//   17   29:invokevirtual   #236 <Method int View.getBottom()>
	//   18   32:aload_0         
	//   19   33:invokevirtual   #240 <Method int getScrollY()>
	//   20   36:isub            
	//   21   37:iload_2         
	//   22   38:iload_3         
	//   23   39:isub            
	//   24   40:isub            
	//   25   41:istore_2        
		if(j < i)
	//*  26   42:iload_2         
	//*  27   43:iload_1         
	//*  28   44:icmpge          53
			return (float)j / (float)i;
	//   29   47:iload_2         
	//   30   48:i2f             
	//   31   49:iload_1         
	//   32   50:i2f             
	//   33   51:fdiv            
	//   34   52:freturn         
		else
			return 1.0F;
	//   35   53:fconst_1        
	//   36   54:freturn         
	}

	public int getMaxScrollAmount()
	{
		return (int)(0.5F * (float)getHeight());
	//    0    0:ldc1            #31  <Float 0.5F>
	//    1    2:aload_0         
	//    2    3:invokevirtual   #172 <Method int getHeight()>
	//    3    6:i2f             
	//    4    7:fmul            
	//    5    8:f2i             
	//    6    9:ireturn         
	}

	public int getNestedScrollAxes()
	{
		return mParentHelper.getNestedScrollAxes();
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field NestedScrollingParentHelper mParentHelper>
	//    2    4:invokevirtual   #635 <Method int NestedScrollingParentHelper.getNestedScrollAxes()>
	//    3    7:ireturn         
	}

	int getScrollRange()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(getChildCount() > 0)
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #298 <Method int getChildCount()>
	//*   4    6:ifle            37
			i = Math.max(0, getChildAt(0).getHeight() - (getHeight() - getPaddingBottom() - getPaddingTop()));
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #165 <Method View getChildAt(int)>
	//    9   15:invokevirtual   #171 <Method int View.getHeight()>
	//   10   18:aload_0         
	//   11   19:invokevirtual   #172 <Method int getHeight()>
	//   12   22:aload_0         
	//   13   23:invokevirtual   #178 <Method int getPaddingBottom()>
	//   14   26:isub            
	//   15   27:aload_0         
	//   16   28:invokevirtual   #175 <Method int getPaddingTop()>
	//   17   31:isub            
	//   18   32:isub            
	//   19   33:invokestatic    #530 <Method int Math.max(int, int)>
	//   20   36:istore_1        
		return i;
	//   21   37:iload_1         
	//   22   38:ireturn         
	}

	protected float getTopFadingEdgeStrength()
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #298 <Method int getChildCount()>
	//*   2    4:ifne            9
			return 0.0F;
	//    3    7:fconst_0        
	//    4    8:freturn         
		int i = getVerticalFadingEdgeLength();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #518 <Method int getVerticalFadingEdgeLength()>
	//    7   13:istore_1        
		int j = getScrollY();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #240 <Method int getScrollY()>
	//   10   18:istore_2        
		if(j < i)
	//*  11   19:iload_2         
	//*  12   20:iload_1         
	//*  13   21:icmpge          30
			return (float)j / (float)i;
	//   14   24:iload_2         
	//   15   25:i2f             
	//   16   26:iload_1         
	//   17   27:i2f             
	//   18   28:fdiv            
	//   19   29:freturn         
		else
			return 1.0F;
	//   20   30:fconst_1        
	//   21   31:freturn         
	}

	public boolean hasNestedScrollingParent()
	{
		return mChildHelper.hasNestedScrollingParent();
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:invokevirtual   #638 <Method boolean NestedScrollingChildHelper.hasNestedScrollingParent()>
	//    3    7:ireturn         
	}

	public boolean hasNestedScrollingParent(int i)
	{
		return mChildHelper.hasNestedScrollingParent(i);
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #639 <Method boolean NestedScrollingChildHelper.hasNestedScrollingParent(int)>
	//    4    8:ireturn         
	}

	public boolean isFillViewport()
	{
		return mFillViewport;
	//    0    0:aload_0         
	//    1    1:getfield        #642 <Field boolean mFillViewport>
	//    2    4:ireturn         
	}

	public boolean isNestedScrollingEnabled()
	{
		return mChildHelper.isNestedScrollingEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:invokevirtual   #645 <Method boolean NestedScrollingChildHelper.isNestedScrollingEnabled()>
	//    3    7:ireturn         
	}

	public boolean isSmoothScrollingEnabled()
	{
		return mSmoothScrollingEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field boolean mSmoothScrollingEnabled>
	//    2    4:ireturn         
	}

	protected void measureChild(View view, int i, int j)
	{
		android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #652 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:astore          4
		view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), layoutparams.width), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
	//    3    6:aload_1         
	//    4    7:iload_2         
	//    5    8:aload_0         
	//    6    9:invokevirtual   #572 <Method int getPaddingLeft()>
	//    7   12:aload_0         
	//    8   13:invokevirtual   #575 <Method int getPaddingRight()>
	//    9   16:iadd            
	//   10   17:aload           4
	//   11   19:getfield        #657 <Field int android.view.ViewGroup$LayoutParams.width>
	//   12   22:invokestatic    #660 <Method int getChildMeasureSpec(int, int, int)>
	//   13   25:iconst_0        
	//   14   26:iconst_0        
	//   15   27:invokestatic    #665 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   16   30:invokevirtual   #668 <Method void View.measure(int, int)>
	//   17   33:return          
	}

	protected void measureChildWithMargins(View view, int i, int j, int k, int l)
	{
		android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #652 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #672 <Class android.view.ViewGroup$MarginLayoutParams>
	//    3    7:astore          6
		view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginlayoutparams.leftMargin + marginlayoutparams.rightMargin + j, marginlayoutparams.width), android.view.View.MeasureSpec.makeMeasureSpec(marginlayoutparams.topMargin + marginlayoutparams.bottomMargin, 0));
	//    4    9:aload_1         
	//    5   10:iload_2         
	//    6   11:aload_0         
	//    7   12:invokevirtual   #572 <Method int getPaddingLeft()>
	//    8   15:aload_0         
	//    9   16:invokevirtual   #575 <Method int getPaddingRight()>
	//   10   19:iadd            
	//   11   20:aload           6
	//   12   22:getfield        #675 <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//   13   25:iadd            
	//   14   26:aload           6
	//   15   28:getfield        #678 <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//   16   31:iadd            
	//   17   32:iload_3         
	//   18   33:iadd            
	//   19   34:aload           6
	//   20   36:getfield        #679 <Field int android.view.ViewGroup$MarginLayoutParams.width>
	//   21   39:invokestatic    #660 <Method int getChildMeasureSpec(int, int, int)>
	//   22   42:aload           6
	//   23   44:getfield        #682 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//   24   47:aload           6
	//   25   49:getfield        #685 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
	//   26   52:iadd            
	//   27   53:iconst_0        
	//   28   54:invokestatic    #665 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   29   57:invokevirtual   #668 <Method void View.measure(int, int)>
	//   30   60:return          
	}

	public void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #688 <Method void FrameLayout.onAttachedToWindow()>
		mIsLaidOut = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #102 <Field boolean mIsLaidOut>
	//    5    9:return          
	}

	public boolean onGenericMotionEvent(MotionEvent motionevent)
	{
		if((motionevent.getSource() & 2) == 0) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:invokevirtual   #693 <Method int MotionEvent.getSource()>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:ifeq            32
_L1:
		motionevent.getAction();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #694 <Method int MotionEvent.getAction()>
		JVM INSTR tableswitch 8 8: default 32
	//	               8 34;
	//    7   13:tableswitch     8 8: default 32
	//	               8 34
		   goto _L2 _L3
_L2:
		return false;
	//    8   32:iconst_0        
	//    9   33:ireturn         
_L3:
		int i;
		int j;
		int k;
		int l;
		float f;
		if(mIsBeingDragged || (f = motionevent.getAxisValue(9)) == 0.0F)
			continue; /* Loop/switch isn't completed */
	//   10   34:aload_0         
	//   11   35:getfield        #106 <Field boolean mIsBeingDragged>
	//   12   38:ifne            32
	//   13   41:aload_1         
	//   14   42:bipush          9
	//   15   44:invokevirtual   #697 <Method float MotionEvent.getAxisValue(int)>
	//   16   47:fstore_2        
	//   17   48:fload_2         
	//   18   49:fconst_0        
	//   19   50:fcmpl           
	//   20   51:ifeq            32
		i = (int)(getVerticalScrollFactorCompat() * f);
	//   21   54:aload_0         
	//   22   55:invokespecial   #699 <Method float getVerticalScrollFactorCompat()>
	//   23   58:fload_2         
	//   24   59:fmul            
	//   25   60:f2i             
	//   26   61:istore_3        
		j = getScrollRange();
	//   27   62:aload_0         
	//   28   63:invokevirtual   #243 <Method int getScrollRange()>
	//   29   66:istore          4
		l = getScrollY();
	//   30   68:aload_0         
	//   31   69:invokevirtual   #240 <Method int getScrollY()>
	//   32   72:istore          6
		k = l - i;
	//   33   74:iload           6
	//   34   76:iload_3         
	//   35   77:isub            
	//   36   78:istore          5
		if(k >= 0)
			break; /* Loop/switch isn't completed */
	//   37   80:iload           5
	//   38   82:ifge            104
		i = 0;
	//   39   85:iconst_0        
	//   40   86:istore_3        
_L5:
		if(i != l)
	//*  41   87:iload_3         
	//*  42   88:iload           6
	//*  43   90:icmpeq          32
		{
			super.scrollTo(getScrollX(), i);
	//   44   93:aload_0         
	//   45   94:aload_0         
	//   46   95:invokevirtual   #493 <Method int getScrollX()>
	//   47   98:iload_3         
	//   48   99:invokespecial   #702 <Method void FrameLayout.scrollTo(int, int)>
			return true;
	//   49  102:iconst_1        
	//   50  103:ireturn         
		}
		if(true) goto _L2; else goto _L4
_L4:
		i = k;
	//   51  104:iload           5
	//   52  106:istore_3        
		if(k > j)
	//*  53  107:iload           5
	//*  54  109:iload           4
	//*  55  111:icmple          87
			i = j;
	//   56  114:iload           4
	//   57  116:istore_3        
		  goto _L5
		if(true) goto _L2; else goto _L6
_L6:
	//*  58  117:goto            87
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		int i;
		boolean flag;
		flag = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		i = motionevent.getAction();
	//    2    3:aload_1         
	//    3    4:invokevirtual   #694 <Method int MotionEvent.getAction()>
	//    4    7:istore_2        
		if(i == 2 && mIsBeingDragged)
	//*   5    8:iload_2         
	//*   6    9:iconst_2        
	//*   7   10:icmpne          22
	//*   8   13:aload_0         
	//*   9   14:getfield        #106 <Field boolean mIsBeingDragged>
	//*  10   17:ifeq            22
			return true;
	//   11   20:iconst_1        
	//   12   21:ireturn         
		i & 0xff;
	//   13   22:iload_2         
	//   14   23:sipush          255
	//   15   26:iand            
		JVM INSTR tableswitch 0 6: default 68
	//	               0 207
	//	               1 304
	//	               2 73
	//	               3 304
	//	               4 68
	//	               5 68
	//	               6 355;
	//   16   27:tableswitch     0 6: default 68
	//	               0 207
	//	               1 304
	//	               2 73
	//	               3 304
	//	               4 68
	//	               5 68
	//	               6 355
		   goto _L1 _L2 _L3 _L4 _L3 _L1 _L1 _L5
_L1:
		return mIsBeingDragged;
	//   17   68:aload_0         
	//   18   69:getfield        #106 <Field boolean mIsBeingDragged>
	//   19   72:ireturn         
_L4:
		int j = mActivePointerId;
	//   20   73:aload_0         
	//   21   74:getfield        #110 <Field int mActivePointerId>
	//   22   77:istore_2        
		if(j != -1)
	//*  23   78:iload_2         
	//*  24   79:iconst_m1       
	//*  25   80:icmpeq          68
		{
			int i1 = motionevent.findPointerIndex(j);
	//   26   83:aload_1         
	//   27   84:iload_2         
	//   28   85:invokevirtual   #706 <Method int MotionEvent.findPointerIndex(int)>
	//   29   88:istore_3        
			if(i1 == -1)
	//*  30   89:iload_3         
	//*  31   90:iconst_m1       
	//*  32   91:icmpne          129
			{
				Log.e("NestedScrollView", (new StringBuilder()).append("Invalid pointerId=").append(j).append(" in onInterceptTouchEvent").toString());
	//   33   94:ldc1            #37  <String "NestedScrollView">
	//   34   96:new             #708 <Class StringBuilder>
	//   35   99:dup             
	//   36  100:invokespecial   #709 <Method void StringBuilder()>
	//   37  103:ldc2            #711 <String "Invalid pointerId=">
	//   38  106:invokevirtual   #715 <Method StringBuilder StringBuilder.append(String)>
	//   39  109:iload_2         
	//   40  110:invokevirtual   #718 <Method StringBuilder StringBuilder.append(int)>
	//   41  113:ldc2            #720 <String " in onInterceptTouchEvent">
	//   42  116:invokevirtual   #715 <Method StringBuilder StringBuilder.append(String)>
	//   43  119:invokevirtual   #724 <Method String StringBuilder.toString()>
	//   44  122:invokestatic    #730 <Method int Log.e(String, String)>
	//   45  125:pop             
			} else
	//*  46  126:goto            68
			{
				int k = (int)motionevent.getY(i1);
	//   47  129:aload_1         
	//   48  130:iload_3         
	//   49  131:invokevirtual   #397 <Method float MotionEvent.getY(int)>
	//   50  134:f2i             
	//   51  135:istore_2        
				if(Math.abs(k - mLastMotionY) > mTouchSlop && (getNestedScrollAxes() & 2) == 0)
	//*  52  136:iload_2         
	//*  53  137:aload_0         
	//*  54  138:getfield        #399 <Field int mLastMotionY>
	//*  55  141:isub            
	//*  56  142:invokestatic    #733 <Method int Math.abs(int)>
	//*  57  145:aload_0         
	//*  58  146:getfield        #341 <Field int mTouchSlop>
	//*  59  149:icmple          68
	//*  60  152:aload_0         
	//*  61  153:invokevirtual   #734 <Method int getNestedScrollAxes()>
	//*  62  156:iconst_2        
	//*  63  157:iand            
	//*  64  158:ifne            68
				{
					mIsBeingDragged = true;
	//   65  161:aload_0         
	//   66  162:iconst_1        
	//   67  163:putfield        #106 <Field boolean mIsBeingDragged>
					mLastMotionY = k;
	//   68  166:aload_0         
	//   69  167:iload_2         
	//   70  168:putfield        #399 <Field int mLastMotionY>
					initVelocityTrackerIfNotExists();
	//   71  171:aload_0         
	//   72  172:invokespecial   #736 <Method void initVelocityTrackerIfNotExists()>
					mVelocityTracker.addMovement(motionevent);
	//   73  175:aload_0         
	//   74  176:getfield        #307 <Field VelocityTracker mVelocityTracker>
	//   75  179:aload_1         
	//   76  180:invokevirtual   #739 <Method void VelocityTracker.addMovement(MotionEvent)>
					mNestedYOffset = 0;
	//   77  183:aload_0         
	//   78  184:iconst_0        
	//   79  185:putfield        #741 <Field int mNestedYOffset>
					motionevent = ((MotionEvent) (getParent()));
	//   80  188:aload_0         
	//   81  189:invokevirtual   #742 <Method ViewParent getParent()>
	//   82  192:astore_1        
					if(motionevent != null)
	//*  83  193:aload_1         
	//*  84  194:ifnull          68
						((ViewParent) (motionevent)).requestDisallowInterceptTouchEvent(true);
	//   85  197:aload_1         
	//   86  198:iconst_1        
	//   87  199:invokeinterface #747 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
				}
			}
		}
		continue; /* Loop/switch isn't completed */
	//   88  204:goto            68
_L2:
		int l = (int)motionevent.getY();
	//   89  207:aload_1         
	//   90  208:invokevirtual   #749 <Method float MotionEvent.getY()>
	//   91  211:f2i             
	//   92  212:istore_2        
		if(!inChild((int)motionevent.getX(), l))
	//*  93  213:aload_0         
	//*  94  214:aload_1         
	//*  95  215:invokevirtual   #752 <Method float MotionEvent.getX()>
	//*  96  218:f2i             
	//*  97  219:iload_2         
	//*  98  220:invokespecial   #754 <Method boolean inChild(int, int)>
	//*  99  223:ifne            238
		{
			mIsBeingDragged = false;
	//  100  226:aload_0         
	//  101  227:iconst_0        
	//  102  228:putfield        #106 <Field boolean mIsBeingDragged>
			recycleVelocityTracker();
	//  103  231:aload_0         
	//  104  232:invokespecial   #193 <Method void recycleVelocityTracker()>
		} else
	//* 105  235:goto            68
		{
			mLastMotionY = l;
	//  106  238:aload_0         
	//  107  239:iload_2         
	//  108  240:putfield        #399 <Field int mLastMotionY>
			mActivePointerId = motionevent.getPointerId(0);
	//  109  243:aload_0         
	//  110  244:aload_1         
	//  111  245:iconst_0        
	//  112  246:invokevirtual   #393 <Method int MotionEvent.getPointerId(int)>
	//  113  249:putfield        #110 <Field int mActivePointerId>
			initOrResetVelocityTracker();
	//  114  252:aload_0         
	//  115  253:invokespecial   #756 <Method void initOrResetVelocityTracker()>
			mVelocityTracker.addMovement(motionevent);
	//  116  256:aload_0         
	//  117  257:getfield        #307 <Field VelocityTracker mVelocityTracker>
	//  118  260:aload_1         
	//  119  261:invokevirtual   #739 <Method void VelocityTracker.addMovement(MotionEvent)>
			mScroller.computeScrollOffset();
	//  120  264:aload_0         
	//  121  265:getfield        #321 <Field OverScroller mScroller>
	//  122  268:invokevirtual   #478 <Method boolean OverScroller.computeScrollOffset()>
	//  123  271:pop             
			if(mScroller.isFinished())
	//* 124  272:aload_0         
	//* 125  273:getfield        #321 <Field OverScroller mScroller>
	//* 126  276:invokevirtual   #757 <Method boolean OverScroller.isFinished()>
	//* 127  279:ifne            298
	//* 128  282:aload_0         
	//* 129  283:iload           4
	//* 130  285:putfield        #106 <Field boolean mIsBeingDragged>
	//* 131  288:aload_0         
	//* 132  289:iconst_2        
	//* 133  290:iconst_0        
	//* 134  291:invokevirtual   #624 <Method boolean startNestedScroll(int, int)>
	//* 135  294:pop             
	//* 136  295:goto            68
				flag = false;
	//  137  298:iconst_0        
	//  138  299:istore          4
			mIsBeingDragged = flag;
			startNestedScroll(2, 0);
		}
		continue; /* Loop/switch isn't completed */
	//  139  301:goto            282
_L3:
		mIsBeingDragged = false;
	//  140  304:aload_0         
	//  141  305:iconst_0        
	//  142  306:putfield        #106 <Field boolean mIsBeingDragged>
		mActivePointerId = -1;
	//  143  309:aload_0         
	//  144  310:iconst_m1       
	//  145  311:putfield        #110 <Field int mActivePointerId>
		recycleVelocityTracker();
	//  146  314:aload_0         
	//  147  315:invokespecial   #193 <Method void recycleVelocityTracker()>
		if(mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()))
	//* 148  318:aload_0         
	//* 149  319:getfield        #321 <Field OverScroller mScroller>
	//* 150  322:aload_0         
	//* 151  323:invokevirtual   #493 <Method int getScrollX()>
	//* 152  326:aload_0         
	//* 153  327:invokevirtual   #240 <Method int getScrollY()>
	//* 154  330:iconst_0        
	//* 155  331:iconst_0        
	//* 156  332:iconst_0        
	//* 157  333:aload_0         
	//* 158  334:invokevirtual   #243 <Method int getScrollRange()>
	//* 159  337:invokevirtual   #761 <Method boolean OverScroller.springBack(int, int, int, int, int, int)>
	//* 160  340:ifeq            347
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//  161  343:aload_0         
	//  162  344:invokestatic    #512 <Method void ViewCompat.postInvalidateOnAnimation(View)>
		stopNestedScroll(0);
	//  163  347:aload_0         
	//  164  348:iconst_0        
	//  165  349:invokevirtual   #196 <Method void stopNestedScroll(int)>
		continue; /* Loop/switch isn't completed */
	//  166  352:goto            68
_L5:
		onSecondaryPointerUp(motionevent);
	//  167  355:aload_0         
	//  168  356:aload_1         
	//  169  357:invokespecial   #763 <Method void onSecondaryPointerUp(MotionEvent)>
		if(true) goto _L1; else goto _L6
	//  170  360:goto            68
_L6:
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		super.onLayout(flag, i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokespecial   #767 <Method void FrameLayout.onLayout(boolean, int, int, int, int)>
		mIsLayoutDirty = false;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #100 <Field boolean mIsLayoutDirty>
		if(mChildToScrollTo != null && isViewDescendantOf(mChildToScrollTo, ((View) (this))))
	//*  10   16:aload_0         
	//*  11   17:getfield        #104 <Field View mChildToScrollTo>
	//*  12   20:ifnull          42
	//*  13   23:aload_0         
	//*  14   24:getfield        #104 <Field View mChildToScrollTo>
	//*  15   27:aload_0         
	//*  16   28:invokestatic    #368 <Method boolean isViewDescendantOf(View, View)>
	//*  17   31:ifeq            42
			scrollToChild(mChildToScrollTo);
	//   18   34:aload_0         
	//   19   35:aload_0         
	//   20   36:getfield        #104 <Field View mChildToScrollTo>
	//   21   39:invokespecial   #769 <Method void scrollToChild(View)>
		mChildToScrollTo = null;
	//   22   42:aload_0         
	//   23   43:aconst_null     
	//   24   44:putfield        #104 <Field View mChildToScrollTo>
		if(mIsLaidOut) goto _L2; else goto _L1
	//   25   47:aload_0         
	//   26   48:getfield        #102 <Field boolean mIsLaidOut>
	//   27   51:ifne            135
_L1:
		if(mSavedState != null)
	//*  28   54:aload_0         
	//*  29   55:getfield        #771 <Field NestedScrollView$SavedState mSavedState>
	//*  30   58:ifnull          81
		{
			scrollTo(getScrollX(), mSavedState.scrollPosition);
	//   31   61:aload_0         
	//   32   62:aload_0         
	//   33   63:invokevirtual   #493 <Method int getScrollX()>
	//   34   66:aload_0         
	//   35   67:getfield        #771 <Field NestedScrollView$SavedState mSavedState>
	//   36   70:getfield        #774 <Field int NestedScrollView$SavedState.scrollPosition>
	//   37   73:invokevirtual   #775 <Method void scrollTo(int, int)>
			mSavedState = null;
	//   38   76:aload_0         
	//   39   77:aconst_null     
	//   40   78:putfield        #771 <Field NestedScrollView$SavedState mSavedState>
		}
		if(getChildCount() > 0)
	//*  41   81:aload_0         
	//*  42   82:invokevirtual   #298 <Method int getChildCount()>
	//*  43   85:ifle            153
			i = getChildAt(0).getMeasuredHeight();
	//   44   88:aload_0         
	//   45   89:iconst_0        
	//   46   90:invokevirtual   #165 <Method View getChildAt(int)>
	//   47   93:invokevirtual   #778 <Method int View.getMeasuredHeight()>
	//   48   96:istore_2        
		else
	//*  49   97:iconst_0        
	//*  50   98:iload_2         
	//*  51   99:iload           5
	//*  52  101:iload_3         
	//*  53  102:isub            
	//*  54  103:aload_0         
	//*  55  104:invokevirtual   #178 <Method int getPaddingBottom()>
	//*  56  107:isub            
	//*  57  108:aload_0         
	//*  58  109:invokevirtual   #175 <Method int getPaddingTop()>
	//*  59  112:isub            
	//*  60  113:isub            
	//*  61  114:invokestatic    #530 <Method int Math.max(int, int)>
	//*  62  117:istore_2        
	//*  63  118:aload_0         
	//*  64  119:invokevirtual   #240 <Method int getScrollY()>
	//*  65  122:iload_2         
	//*  66  123:icmple          158
	//*  67  126:aload_0         
	//*  68  127:aload_0         
	//*  69  128:invokevirtual   #493 <Method int getScrollX()>
	//*  70  131:iload_2         
	//*  71  132:invokevirtual   #775 <Method void scrollTo(int, int)>
	//*  72  135:aload_0         
	//*  73  136:aload_0         
	//*  74  137:invokevirtual   #493 <Method int getScrollX()>
	//*  75  140:aload_0         
	//*  76  141:invokevirtual   #240 <Method int getScrollY()>
	//*  77  144:invokevirtual   #775 <Method void scrollTo(int, int)>
	//*  78  147:aload_0         
	//*  79  148:iconst_1        
	//*  80  149:putfield        #102 <Field boolean mIsLaidOut>
	//*  81  152:return          
			i = 0;
	//   82  153:iconst_0        
	//   83  154:istore_2        
		i = Math.max(0, i - (l - j - getPaddingBottom() - getPaddingTop()));
		if(getScrollY() <= i) goto _L4; else goto _L3
_L3:
		scrollTo(getScrollX(), i);
_L2:
		scrollTo(getScrollX(), getScrollY());
		mIsLaidOut = true;
		return;
	//*  84  155:goto            97
_L4:
		if(getScrollY() < 0)
	//*  85  158:aload_0         
	//*  86  159:invokevirtual   #240 <Method int getScrollY()>
	//*  87  162:ifge            135
			scrollTo(getScrollX(), 0);
	//   88  165:aload_0         
	//   89  166:aload_0         
	//   90  167:invokevirtual   #493 <Method int getScrollX()>
	//   91  170:iconst_0        
	//   92  171:invokevirtual   #775 <Method void scrollTo(int, int)>
		if(true) goto _L2; else goto _L5
	//   93  174:goto            135
_L5:
	}

	protected void onMeasure(int i, int j)
	{
		super.onMeasure(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #781 <Method void FrameLayout.onMeasure(int, int)>
		break MISSING_BLOCK_LABEL_6;
		if(mFillViewport && android.view.View.MeasureSpec.getMode(j) != 0 && getChildCount() > 0)
	//*   4    6:aload_0         
	//*   5    7:getfield        #642 <Field boolean mFillViewport>
	//*   6   10:ifne            14
	//*   7   13:return          
	//*   8   14:iload_2         
	//*   9   15:invokestatic    #784 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*  10   18:ifeq            13
	//*  11   21:aload_0         
	//*  12   22:invokevirtual   #298 <Method int getChildCount()>
	//*  13   25:ifle            13
		{
			View view = getChildAt(0);
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:invokevirtual   #165 <Method View getChildAt(int)>
	//   17   33:astore_3        
			j = getMeasuredHeight();
	//   18   34:aload_0         
	//   19   35:invokevirtual   #785 <Method int getMeasuredHeight()>
	//   20   38:istore_2        
			if(view.getMeasuredHeight() < j)
	//*  21   39:aload_3         
	//*  22   40:invokevirtual   #778 <Method int View.getMeasuredHeight()>
	//*  23   43:iload_2         
	//*  24   44:icmpge          13
			{
				android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
	//   25   47:aload_3         
	//   26   48:invokevirtual   #652 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   27   51:checkcast       #787 <Class android.widget.FrameLayout$LayoutParams>
	//   28   54:astore          4
				view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), layoutparams.width), android.view.View.MeasureSpec.makeMeasureSpec(j - getPaddingTop() - getPaddingBottom(), 0x40000000));
	//   29   56:aload_3         
	//   30   57:iload_1         
	//   31   58:aload_0         
	//   32   59:invokevirtual   #572 <Method int getPaddingLeft()>
	//   33   62:aload_0         
	//   34   63:invokevirtual   #575 <Method int getPaddingRight()>
	//   35   66:iadd            
	//   36   67:aload           4
	//   37   69:getfield        #788 <Field int android.widget.FrameLayout$LayoutParams.width>
	//   38   72:invokestatic    #660 <Method int getChildMeasureSpec(int, int, int)>
	//   39   75:iload_2         
	//   40   76:aload_0         
	//   41   77:invokevirtual   #175 <Method int getPaddingTop()>
	//   42   80:isub            
	//   43   81:aload_0         
	//   44   82:invokevirtual   #178 <Method int getPaddingBottom()>
	//   45   85:isub            
	//   46   86:ldc2            #789 <Int 0x40000000>
	//   47   89:invokestatic    #665 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   48   92:invokevirtual   #668 <Method void View.measure(int, int)>
				return;
	//   49   95:return          
			}
		}
		return;
	}

	public boolean onNestedFling(View view, float f, float f1, boolean flag)
	{
		if(!flag)
	//*   0    0:iload           4
	//*   1    2:ifne            13
		{
			flingWithNestedDispatch((int)f1);
	//    2    5:aload_0         
	//    3    6:fload_3         
	//    4    7:f2i             
	//    5    8:invokespecial   #793 <Method void flingWithNestedDispatch(int)>
			return true;
	//    6   11:iconst_1        
	//    7   12:ireturn         
		} else
		{
			return false;
	//    8   13:iconst_0        
	//    9   14:ireturn         
		}
	}

	public boolean onNestedPreFling(View view, float f, float f1)
	{
		return dispatchNestedPreFling(f, f1);
	//    0    0:aload_0         
	//    1    1:fload_2         
	//    2    2:fload_3         
	//    3    3:invokevirtual   #247 <Method boolean dispatchNestedPreFling(float, float)>
	//    4    6:ireturn         
	}

	public void onNestedPreScroll(View view, int i, int j, int ai[])
	{
		dispatchNestedPreScroll(i, j, ai, ((int []) (null)));
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:aload           4
	//    4    5:aconst_null     
	//    5    6:invokevirtual   #798 <Method boolean dispatchNestedPreScroll(int, int, int[], int[])>
	//    6    9:pop             
	//    7   10:return          
	}

	public void onNestedScroll(View view, int i, int j, int k, int l)
	{
		i = getScrollY();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #240 <Method int getScrollY()>
	//    2    4:istore_2        
		scrollBy(0, l);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:iload           5
	//    6    9:invokevirtual   #189 <Method void scrollBy(int, int)>
		i = getScrollY() - i;
	//    7   12:aload_0         
	//    8   13:invokevirtual   #240 <Method int getScrollY()>
	//    9   16:iload_2         
	//   10   17:isub            
	//   11   18:istore_2        
		dispatchNestedScroll(0, i, 0, l - i, ((int []) (null)));
	//   12   19:aload_0         
	//   13   20:iconst_0        
	//   14   21:iload_2         
	//   15   22:iconst_0        
	//   16   23:iload           5
	//   17   25:iload_2         
	//   18   26:isub            
	//   19   27:aconst_null     
	//   20   28:invokevirtual   #800 <Method boolean dispatchNestedScroll(int, int, int, int, int[])>
	//   21   31:pop             
	//   22   32:return          
	}

	public void onNestedScrollAccepted(View view, View view1, int i)
	{
		mParentHelper.onNestedScrollAccepted(view, view1, i);
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field NestedScrollingParentHelper mParentHelper>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #804 <Method void NestedScrollingParentHelper.onNestedScrollAccepted(View, View, int)>
		startNestedScroll(2);
	//    6   10:aload_0         
	//    7   11:iconst_2        
	//    8   12:invokevirtual   #806 <Method boolean startNestedScroll(int)>
	//    9   15:pop             
	//   10   16:return          
	}

	protected void onOverScrolled(int i, int j, boolean flag, boolean flag1)
	{
		super.scrollTo(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #702 <Method void FrameLayout.scrollTo(int, int)>
	//    4    6:return          
	}

	protected boolean onRequestFocusInDescendants(int i, Rect rect)
	{
		int j;
		View view;
		if(i == 2)
	//*   0    0:iload_1         
	//*   1    1:iconst_2        
	//*   2    2:icmpne          31
		{
			j = 130;
	//    3    5:sipush          130
	//    4    8:istore_3        
		} else
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       44
	//*   7   13:invokestatic    #442 <Method FocusFinder FocusFinder.getInstance()>
	//*   8   16:aload_0         
	//*   9   17:aconst_null     
	//*  10   18:iload_3         
	//*  11   19:invokevirtual   #446 <Method View FocusFinder.findNextFocus(ViewGroup, View, int)>
	//*  12   22:astore          4
	//*  13   24:aload           4
	//*  14   26:ifnonnull       58
	//*  15   29:iconst_0        
	//*  16   30:ireturn         
		{
			j = i;
	//   17   31:iload_1         
	//   18   32:istore_3        
			if(i == 1)
	//*  19   33:iload_1         
	//*  20   34:iconst_1        
	//*  21   35:icmpne          9
				j = 33;
	//   22   38:bipush          33
	//   23   40:istore_3        
		}
		if(rect == null)
			view = FocusFinder.getInstance().findNextFocus(((ViewGroup) (this)), ((View) (null)), j);
		else
	//*  24   41:goto            9
			view = FocusFinder.getInstance().findNextFocusFromRect(((ViewGroup) (this)), rect, j);
	//   25   44:invokestatic    #442 <Method FocusFinder FocusFinder.getInstance()>
	//   26   47:aload_0         
	//   27   48:aload_2         
	//   28   49:iload_3         
	//   29   50:invokevirtual   #814 <Method View FocusFinder.findNextFocusFromRect(ViewGroup, Rect, int)>
	//   30   53:astore          4
		if(view == null || isOffScreen(view))
			return false;
		else
	//*  31   55:goto            24
	//*  32   58:aload_0         
	//*  33   59:aload           4
	//*  34   61:invokespecial   #454 <Method boolean isOffScreen(View)>
	//*  35   64:ifne            29
			return view.requestFocus(j, rect);
	//   36   67:aload           4
	//   37   69:iload_3         
	//   38   70:aload_2         
	//   39   71:invokevirtual   #816 <Method boolean View.requestFocus(int, Rect)>
	//   40   74:ireturn         
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #18  <Class NestedScrollView$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #820 <Method void FrameLayout.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		} else
		{
			parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #18  <Class NestedScrollView$SavedState>
	//    9   17:astore_1        
			super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #824 <Method Parcelable NestedScrollView$SavedState.getSuperState()>
	//   13   23:invokespecial   #820 <Method void FrameLayout.onRestoreInstanceState(Parcelable)>
			mSavedState = ((SavedState) (parcelable));
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:putfield        #771 <Field NestedScrollView$SavedState mSavedState>
			requestLayout();
	//   17   31:aload_0         
	//   18   32:invokevirtual   #827 <Method void requestLayout()>
			return;
	//   19   35:return          
		}
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #18  <Class NestedScrollView$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #830 <Method Parcelable FrameLayout.onSaveInstanceState()>
	//    4    8:invokespecial   #832 <Method void NestedScrollView$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.scrollPosition = getScrollY();
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #240 <Method int getScrollY()>
	//    9   17:putfield        #774 <Field int NestedScrollView$SavedState.scrollPosition>
		return ((Parcelable) (savedstate));
	//   10   20:aload_1         
	//   11   21:areturn         
	}

	protected void onScrollChanged(int i, int j, int k, int l)
	{
		super.onScrollChanged(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #836 <Method void FrameLayout.onScrollChanged(int, int, int, int)>
		if(mOnScrollChangeListener != null)
	//*   6    9:aload_0         
	//*   7   10:getfield        #838 <Field NestedScrollView$OnScrollChangeListener mOnScrollChangeListener>
	//*   8   13:ifnull          31
			mOnScrollChangeListener.onScrollChange(this, i, j, k, l);
	//    9   16:aload_0         
	//   10   17:getfield        #838 <Field NestedScrollView$OnScrollChangeListener mOnScrollChangeListener>
	//   11   20:aload_0         
	//   12   21:iload_1         
	//   13   22:iload_2         
	//   14   23:iload_3         
	//   15   24:iload           4
	//   16   26:invokeinterface #842 <Method void NestedScrollView$OnScrollChangeListener.onScrollChange(NestedScrollView, int, int, int, int)>
	//   17   31:return          
	}

	protected void onSizeChanged(int i, int j, int k, int l)
	{
		super.onSizeChanged(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #845 <Method void FrameLayout.onSizeChanged(int, int, int, int)>
		View view;
		for(view = findFocus(); view == null || this == view || !isWithinDeltaOfScreen(view, 0, l);)
	//*   6    9:aload_0         
	//*   7   10:invokevirtual   #408 <Method View findFocus()>
	//*   8   13:astore          5
	//*   9   15:aload           5
	//*  10   17:ifnull          26
	//*  11   20:aload_0         
	//*  12   21:aload           5
	//*  13   23:if_acmpne       27
			return;
	//   14   26:return          

	//   15   27:aload_0         
	//   16   28:aload           5
	//   17   30:iconst_0        
	//   18   31:iload           4
	//   19   33:invokespecial   #358 <Method boolean isWithinDeltaOfScreen(View, int, int)>
	//   20   36:ifeq            26
		view.getDrawingRect(mTempRect);
	//   21   39:aload           5
	//   22   41:aload_0         
	//   23   42:getfield        #98  <Field Rect mTempRect>
	//   24   45:invokevirtual   #372 <Method void View.getDrawingRect(Rect)>
		offsetDescendantRectToMyCoords(view, mTempRect);
	//   25   48:aload_0         
	//   26   49:aload           5
	//   27   51:aload_0         
	//   28   52:getfield        #98  <Field Rect mTempRect>
	//   29   55:invokevirtual   #376 <Method void offsetDescendantRectToMyCoords(View, Rect)>
		doScrollY(computeScrollDeltaToGetChildRectOnScreen(mTempRect));
	//   30   58:aload_0         
	//   31   59:aload_0         
	//   32   60:aload_0         
	//   33   61:getfield        #98  <Field Rect mTempRect>
	//   34   64:invokevirtual   #419 <Method int computeScrollDeltaToGetChildRectOnScreen(Rect)>
	//   35   67:invokespecial   #414 <Method void doScrollY(int)>
	//   36   70:return          
	}

	public boolean onStartNestedScroll(View view, View view1, int i)
	{
		return (i & 2) != 0;
	//    0    0:iload_3         
	//    1    1:iconst_2        
	//    2    2:iand            
	//    3    3:ifeq            8
	//    4    6:iconst_1        
	//    5    7:ireturn         
	//    6    8:iconst_0        
	//    7    9:ireturn         
	}

	public void onStopNestedScroll(View view)
	{
		mParentHelper.onStopNestedScroll(view);
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field NestedScrollingParentHelper mParentHelper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #850 <Method void NestedScrollingParentHelper.onStopNestedScroll(View)>
		stopNestedScroll();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #852 <Method void stopNestedScroll()>
	//    6   12:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		int i;
		MotionEvent motionevent1;
		initVelocityTrackerIfNotExists();
	//    0    0:aload_0         
	//    1    1:invokespecial   #736 <Method void initVelocityTrackerIfNotExists()>
		motionevent1 = MotionEvent.obtain(motionevent);
	//    2    4:aload_1         
	//    3    5:invokestatic    #856 <Method MotionEvent MotionEvent.obtain(MotionEvent)>
	//    4    8:astore          9
		i = motionevent.getActionMasked();
	//    5   10:aload_1         
	//    6   11:invokevirtual   #859 <Method int MotionEvent.getActionMasked()>
	//    7   14:istore_2        
		if(i == 0)
	//*   8   15:iload_2         
	//*   9   16:ifne            24
			mNestedYOffset = 0;
	//   10   19:aload_0         
	//   11   20:iconst_0        
	//   12   21:putfield        #741 <Field int mNestedYOffset>
		motionevent1.offsetLocation(0.0F, mNestedYOffset);
	//   13   24:aload           9
	//   14   26:fconst_0        
	//   15   27:aload_0         
	//   16   28:getfield        #741 <Field int mNestedYOffset>
	//   17   31:i2f             
	//   18   32:invokevirtual   #862 <Method void MotionEvent.offsetLocation(float, float)>
		i;
	//   19   35:iload_2         
		JVM INSTR tableswitch 0 6: default 80
	//	               0 103
	//	               1 719
	//	               2 206
	//	               3 807
	//	               4 80
	//	               5 862
	//	               6 889;
	//   20   36:tableswitch     0 6: default 80
	//	               0 103
	//	               1 719
	//	               2 206
	//	               3 807
	//	               4 80
	//	               5 862
	//	               6 889
		   goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L1:
		if(mVelocityTracker != null)
	//*  21   80:aload_0         
	//*  22   81:getfield        #307 <Field VelocityTracker mVelocityTracker>
	//*  23   84:ifnull          96
			mVelocityTracker.addMovement(motionevent1);
	//   24   87:aload_0         
	//   25   88:getfield        #307 <Field VelocityTracker mVelocityTracker>
	//   26   91:aload           9
	//   27   93:invokevirtual   #739 <Method void VelocityTracker.addMovement(MotionEvent)>
		motionevent1.recycle();
	//   28   96:aload           9
	//   29   98:invokevirtual   #863 <Method void MotionEvent.recycle()>
		return true;
	//   30  101:iconst_1        
	//   31  102:ireturn         
_L2:
		if(getChildCount() == 0)
	//*  32  103:aload_0         
	//*  33  104:invokevirtual   #298 <Method int getChildCount()>
	//*  34  107:ifne            112
			return false;
	//   35  110:iconst_0        
	//   36  111:ireturn         
		boolean flag;
		if(!mScroller.isFinished())
	//*  37  112:aload_0         
	//*  38  113:getfield        #321 <Field OverScroller mScroller>
	//*  39  116:invokevirtual   #757 <Method boolean OverScroller.isFinished()>
	//*  40  119:ifne            200
			flag = true;
	//   41  122:iconst_1        
	//   42  123:istore          8
		else
	//*  43  125:aload_0         
	//*  44  126:iload           8
	//*  45  128:putfield        #106 <Field boolean mIsBeingDragged>
	//*  46  131:iload           8
	//*  47  133:ifeq            155
	//*  48  136:aload_0         
	//*  49  137:invokevirtual   #742 <Method ViewParent getParent()>
	//*  50  140:astore          10
	//*  51  142:aload           10
	//*  52  144:ifnull          155
	//*  53  147:aload           10
	//*  54  149:iconst_1        
	//*  55  150:invokeinterface #747 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
	//*  56  155:aload_0         
	//*  57  156:getfield        #321 <Field OverScroller mScroller>
	//*  58  159:invokevirtual   #757 <Method boolean OverScroller.isFinished()>
	//*  59  162:ifne            172
	//*  60  165:aload_0         
	//*  61  166:getfield        #321 <Field OverScroller mScroller>
	//*  62  169:invokevirtual   #866 <Method void OverScroller.abortAnimation()>
	//*  63  172:aload_0         
	//*  64  173:aload_1         
	//*  65  174:invokevirtual   #749 <Method float MotionEvent.getY()>
	//*  66  177:f2i             
	//*  67  178:putfield        #399 <Field int mLastMotionY>
	//*  68  181:aload_0         
	//*  69  182:aload_1         
	//*  70  183:iconst_0        
	//*  71  184:invokevirtual   #393 <Method int MotionEvent.getPointerId(int)>
	//*  72  187:putfield        #110 <Field int mActivePointerId>
	//*  73  190:aload_0         
	//*  74  191:iconst_2        
	//*  75  192:iconst_0        
	//*  76  193:invokevirtual   #624 <Method boolean startNestedScroll(int, int)>
	//*  77  196:pop             
	//*  78  197:goto            80
			flag = false;
	//   79  200:iconst_0        
	//   80  201:istore          8
		mIsBeingDragged = flag;
		if(flag)
		{
			ViewParent viewparent = getParent();
			if(viewparent != null)
				viewparent.requestDisallowInterceptTouchEvent(true);
		}
		if(!mScroller.isFinished())
			mScroller.abortAnimation();
		mLastMotionY = (int)motionevent.getY();
		mActivePointerId = motionevent.getPointerId(0);
		startNestedScroll(2, 0);
		continue; /* Loop/switch isn't completed */
	//   81  203:goto            125
_L4:
		int k;
		int l;
		int i1;
		l = motionevent.findPointerIndex(mActivePointerId);
	//   82  206:aload_1         
	//   83  207:aload_0         
	//   84  208:getfield        #110 <Field int mActivePointerId>
	//   85  211:invokevirtual   #706 <Method int MotionEvent.findPointerIndex(int)>
	//   86  214:istore          4
		if(l == -1)
	//*  87  216:iload           4
	//*  88  218:iconst_m1       
	//*  89  219:icmpne          260
		{
			Log.e("NestedScrollView", (new StringBuilder()).append("Invalid pointerId=").append(mActivePointerId).append(" in onTouchEvent").toString());
	//   90  222:ldc1            #37  <String "NestedScrollView">
	//   91  224:new             #708 <Class StringBuilder>
	//   92  227:dup             
	//   93  228:invokespecial   #709 <Method void StringBuilder()>
	//   94  231:ldc2            #711 <String "Invalid pointerId=">
	//   95  234:invokevirtual   #715 <Method StringBuilder StringBuilder.append(String)>
	//   96  237:aload_0         
	//   97  238:getfield        #110 <Field int mActivePointerId>
	//   98  241:invokevirtual   #718 <Method StringBuilder StringBuilder.append(int)>
	//   99  244:ldc2            #868 <String " in onTouchEvent">
	//  100  247:invokevirtual   #715 <Method StringBuilder StringBuilder.append(String)>
	//  101  250:invokevirtual   #724 <Method String StringBuilder.toString()>
	//  102  253:invokestatic    #730 <Method int Log.e(String, String)>
	//  103  256:pop             
			continue; /* Loop/switch isn't completed */
	//  104  257:goto            80
		}
		i1 = (int)motionevent.getY(l);
	//  105  260:aload_1         
	//  106  261:iload           4
	//  107  263:invokevirtual   #397 <Method float MotionEvent.getY(int)>
	//  108  266:f2i             
	//  109  267:istore          5
		i = mLastMotionY - i1;
	//  110  269:aload_0         
	//  111  270:getfield        #399 <Field int mLastMotionY>
	//  112  273:iload           5
	//  113  275:isub            
	//  114  276:istore_2        
		k = i;
	//  115  277:iload_2         
	//  116  278:istore_3        
		if(dispatchNestedPreScroll(0, i, mScrollConsumed, mScrollOffset, 0))
	//* 117  279:aload_0         
	//* 118  280:iconst_0        
	//* 119  281:iload_2         
	//* 120  282:aload_0         
	//* 121  283:getfield        #114 <Field int[] mScrollConsumed>
	//* 122  286:aload_0         
	//* 123  287:getfield        #112 <Field int[] mScrollOffset>
	//* 124  290:iconst_0        
	//* 125  291:invokevirtual   #490 <Method boolean dispatchNestedPreScroll(int, int, int[], int[], int)>
	//* 126  294:ifeq            334
		{
			k = i - mScrollConsumed[1];
	//  127  297:iload_2         
	//  128  298:aload_0         
	//  129  299:getfield        #114 <Field int[] mScrollConsumed>
	//  130  302:iconst_1        
	//  131  303:iaload          
	//  132  304:isub            
	//  133  305:istore_3        
			motionevent1.offsetLocation(0.0F, mScrollOffset[1]);
	//  134  306:aload           9
	//  135  308:fconst_0        
	//  136  309:aload_0         
	//  137  310:getfield        #112 <Field int[] mScrollOffset>
	//  138  313:iconst_1        
	//  139  314:iaload          
	//  140  315:i2f             
	//  141  316:invokevirtual   #862 <Method void MotionEvent.offsetLocation(float, float)>
			mNestedYOffset = mNestedYOffset + mScrollOffset[1];
	//  142  319:aload_0         
	//  143  320:aload_0         
	//  144  321:getfield        #741 <Field int mNestedYOffset>
	//  145  324:aload_0         
	//  146  325:getfield        #112 <Field int[] mScrollOffset>
	//  147  328:iconst_1        
	//  148  329:iaload          
	//  149  330:iadd            
	//  150  331:putfield        #741 <Field int mNestedYOffset>
		}
		i = k;
	//  151  334:iload_3         
	//  152  335:istore_2        
		int j1;
		if(!mIsBeingDragged)
	//* 153  336:aload_0         
	//* 154  337:getfield        #106 <Field boolean mIsBeingDragged>
	//* 155  340:ifne            391
		{
			i = k;
	//  156  343:iload_3         
	//  157  344:istore_2        
			if(Math.abs(k) > mTouchSlop)
	//* 158  345:iload_3         
	//* 159  346:invokestatic    #733 <Method int Math.abs(int)>
	//* 160  349:aload_0         
	//* 161  350:getfield        #341 <Field int mTouchSlop>
	//* 162  353:icmple          391
			{
				ViewParent viewparent1 = getParent();
	//  163  356:aload_0         
	//  164  357:invokevirtual   #742 <Method ViewParent getParent()>
	//  165  360:astore          10
				if(viewparent1 != null)
	//* 166  362:aload           10
	//* 167  364:ifnull          375
					viewparent1.requestDisallowInterceptTouchEvent(true);
	//  168  367:aload           10
	//  169  369:iconst_1        
	//  170  370:invokeinterface #747 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
				mIsBeingDragged = true;
	//  171  375:aload_0         
	//  172  376:iconst_1        
	//  173  377:putfield        #106 <Field boolean mIsBeingDragged>
				int k1;
				if(k > 0)
	//* 174  380:iload_3         
	//* 175  381:ifle            554
					i = k - mTouchSlop;
	//  176  384:iload_3         
	//  177  385:aload_0         
	//  178  386:getfield        #341 <Field int mTouchSlop>
	//  179  389:isub            
	//  180  390:istore_2        
				else
	//* 181  391:aload_0         
	//* 182  392:getfield        #106 <Field boolean mIsBeingDragged>
	//* 183  395:ifeq            80
	//* 184  398:aload_0         
	//* 185  399:iload           5
	//* 186  401:aload_0         
	//* 187  402:getfield        #112 <Field int[] mScrollOffset>
	//* 188  405:iconst_1        
	//* 189  406:iaload          
	//* 190  407:isub            
	//* 191  408:putfield        #399 <Field int mLastMotionY>
	//* 192  411:aload_0         
	//* 193  412:invokevirtual   #240 <Method int getScrollY()>
	//* 194  415:istore          6
	//* 195  417:aload_0         
	//* 196  418:invokevirtual   #243 <Method int getScrollRange()>
	//* 197  421:istore          5
	//* 198  423:aload_0         
	//* 199  424:invokevirtual   #209 <Method int getOverScrollMode()>
	//* 200  427:istore_3        
	//* 201  428:iload_3         
	//* 202  429:ifeq            442
	//* 203  432:iload_3         
	//* 204  433:iconst_1        
	//* 205  434:icmpne          564
	//* 206  437:iload           5
	//* 207  439:ifle            564
	//* 208  442:iconst_1        
	//* 209  443:istore_3        
	//* 210  444:aload_0         
	//* 211  445:iconst_0        
	//* 212  446:iload_2         
	//* 213  447:iconst_0        
	//* 214  448:aload_0         
	//* 215  449:invokevirtual   #240 <Method int getScrollY()>
	//* 216  452:iconst_0        
	//* 217  453:iload           5
	//* 218  455:iconst_0        
	//* 219  456:iconst_0        
	//* 220  457:iconst_1        
	//* 221  458:invokevirtual   #497 <Method boolean overScrollByCompat(int, int, int, int, int, int, int, int, boolean)>
	//* 222  461:ifeq            479
	//* 223  464:aload_0         
	//* 224  465:iconst_0        
	//* 225  466:invokevirtual   #515 <Method boolean hasNestedScrollingParent(int)>
	//* 226  469:ifne            479
	//* 227  472:aload_0         
	//* 228  473:getfield        #307 <Field VelocityTracker mVelocityTracker>
	//* 229  476:invokevirtual   #316 <Method void VelocityTracker.clear()>
	//* 230  479:aload_0         
	//* 231  480:invokevirtual   #240 <Method int getScrollY()>
	//* 232  483:iload           6
	//* 233  485:isub            
	//* 234  486:istore          7
	//* 235  488:aload_0         
	//* 236  489:iconst_0        
	//* 237  490:iload           7
	//* 238  492:iconst_0        
	//* 239  493:iload_2         
	//* 240  494:iload           7
	//* 241  496:isub            
	//* 242  497:aload_0         
	//* 243  498:getfield        #112 <Field int[] mScrollOffset>
	//* 244  501:iconst_0        
	//* 245  502:invokevirtual   #501 <Method boolean dispatchNestedScroll(int, int, int, int, int[], int)>
	//* 246  505:ifeq            569
	//* 247  508:aload_0         
	//* 248  509:aload_0         
	//* 249  510:getfield        #399 <Field int mLastMotionY>
	//* 250  513:aload_0         
	//* 251  514:getfield        #112 <Field int[] mScrollOffset>
	//* 252  517:iconst_1        
	//* 253  518:iaload          
	//* 254  519:isub            
	//* 255  520:putfield        #399 <Field int mLastMotionY>
	//* 256  523:aload           9
	//* 257  525:fconst_0        
	//* 258  526:aload_0         
	//* 259  527:getfield        #112 <Field int[] mScrollOffset>
	//* 260  530:iconst_1        
	//* 261  531:iaload          
	//* 262  532:i2f             
	//* 263  533:invokevirtual   #862 <Method void MotionEvent.offsetLocation(float, float)>
	//* 264  536:aload_0         
	//* 265  537:aload_0         
	//* 266  538:getfield        #741 <Field int mNestedYOffset>
	//* 267  541:aload_0         
	//* 268  542:getfield        #112 <Field int[] mScrollOffset>
	//* 269  545:iconst_1        
	//* 270  546:iaload          
	//* 271  547:iadd            
	//* 272  548:putfield        #741 <Field int mNestedYOffset>
	//* 273  551:goto            80
					i = k + mTouchSlop;
	//  274  554:iload_3         
	//  275  555:aload_0         
	//  276  556:getfield        #341 <Field int mTouchSlop>
	//  277  559:iadd            
	//  278  560:istore_2        
			}
		}
		if(!mIsBeingDragged)
			continue; /* Loop/switch isn't completed */
		mLastMotionY = i1 - mScrollOffset[1];
		j1 = getScrollY();
		i1 = getScrollRange();
		k = getOverScrollMode();
		if(k == 0 || k == 1 && i1 > 0)
			k = 1;
		else
	//* 279  561:goto            391
			k = 0;
	//  280  564:iconst_0        
	//  281  565:istore_3        
		if(overScrollByCompat(0, i, 0, getScrollY(), 0, i1, 0, 0, true) && !hasNestedScrollingParent(0))
			mVelocityTracker.clear();
		k1 = getScrollY() - j1;
		if(dispatchNestedScroll(0, k1, 0, i - k1, mScrollOffset, 0))
		{
			mLastMotionY = mLastMotionY - mScrollOffset[1];
			motionevent1.offsetLocation(0.0F, mScrollOffset[1]);
			mNestedYOffset = mNestedYOffset + mScrollOffset[1];
			continue; /* Loop/switch isn't completed */
		}
	//* 282  566:goto            444
		if(k == 0)
			continue; /* Loop/switch isn't completed */
	//  283  569:iload_3         
	//  284  570:ifeq            80
		ensureGlows();
	//  285  573:aload_0         
	//  286  574:invokespecial   #503 <Method void ensureGlows()>
		k = j1 + i;
	//  287  577:iload           6
	//  288  579:iload_2         
	//  289  580:iadd            
	//  290  581:istore_3        
		if(k >= 0) goto _L9; else goto _L8
	//  291  582:iload_3         
	//  292  583:ifge            664
_L8:
		EdgeEffectCompat.onPull(mEdgeGlowTop, (float)i / (float)getHeight(), motionevent.getX(l) / (float)getWidth());
	//  293  586:aload_0         
	//  294  587:getfield        #198 <Field EdgeEffect mEdgeGlowTop>
	//  295  590:iload_2         
	//  296  591:i2f             
	//  297  592:aload_0         
	//  298  593:invokevirtual   #172 <Method int getHeight()>
	//  299  596:i2f             
	//  300  597:fdiv            
	//  301  598:aload_1         
	//  302  599:iload           4
	//  303  601:invokevirtual   #870 <Method float MotionEvent.getX(int)>
	//  304  604:aload_0         
	//  305  605:invokevirtual   #569 <Method int getWidth()>
	//  306  608:i2f             
	//  307  609:fdiv            
	//  308  610:invokestatic    #876 <Method void EdgeEffectCompat.onPull(EdgeEffect, float, float)>
		if(!mEdgeGlowBottom.isFinished())
	//* 309  613:aload_0         
	//* 310  614:getfield        #205 <Field EdgeEffect mEdgeGlowBottom>
	//* 311  617:invokevirtual   #561 <Method boolean EdgeEffect.isFinished()>
	//* 312  620:ifne            630
			mEdgeGlowBottom.onRelease();
	//  313  623:aload_0         
	//  314  624:getfield        #205 <Field EdgeEffect mEdgeGlowBottom>
	//  315  627:invokevirtual   #203 <Method void EdgeEffect.onRelease()>
_L10:
		if(mEdgeGlowTop != null && (!mEdgeGlowTop.isFinished() || !mEdgeGlowBottom.isFinished()))
	//* 316  630:aload_0         
	//* 317  631:getfield        #198 <Field EdgeEffect mEdgeGlowTop>
	//* 318  634:ifnull          80
	//* 319  637:aload_0         
	//* 320  638:getfield        #198 <Field EdgeEffect mEdgeGlowTop>
	//* 321  641:invokevirtual   #561 <Method boolean EdgeEffect.isFinished()>
	//* 322  644:ifeq            657
	//* 323  647:aload_0         
	//* 324  648:getfield        #205 <Field EdgeEffect mEdgeGlowBottom>
	//* 325  651:invokevirtual   #561 <Method boolean EdgeEffect.isFinished()>
	//* 326  654:ifne            80
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//  327  657:aload_0         
	//  328  658:invokestatic    #512 <Method void ViewCompat.postInvalidateOnAnimation(View)>
		continue; /* Loop/switch isn't completed */
	//  329  661:goto            80
_L9:
		if(k > i1)
	//* 330  664:iload_3         
	//* 331  665:iload           5
	//* 332  667:icmple          630
		{
			EdgeEffectCompat.onPull(mEdgeGlowBottom, (float)i / (float)getHeight(), 1.0F - motionevent.getX(l) / (float)getWidth());
	//  333  670:aload_0         
	//  334  671:getfield        #205 <Field EdgeEffect mEdgeGlowBottom>
	//  335  674:iload_2         
	//  336  675:i2f             
	//  337  676:aload_0         
	//  338  677:invokevirtual   #172 <Method int getHeight()>
	//  339  680:i2f             
	//  340  681:fdiv            
	//  341  682:fconst_1        
	//  342  683:aload_1         
	//  343  684:iload           4
	//  344  686:invokevirtual   #870 <Method float MotionEvent.getX(int)>
	//  345  689:aload_0         
	//  346  690:invokevirtual   #569 <Method int getWidth()>
	//  347  693:i2f             
	//  348  694:fdiv            
	//  349  695:fsub            
	//  350  696:invokestatic    #876 <Method void EdgeEffectCompat.onPull(EdgeEffect, float, float)>
			if(!mEdgeGlowTop.isFinished())
	//* 351  699:aload_0         
	//* 352  700:getfield        #198 <Field EdgeEffect mEdgeGlowTop>
	//* 353  703:invokevirtual   #561 <Method boolean EdgeEffect.isFinished()>
	//* 354  706:ifne            630
				mEdgeGlowTop.onRelease();
	//  355  709:aload_0         
	//  356  710:getfield        #198 <Field EdgeEffect mEdgeGlowTop>
	//  357  713:invokevirtual   #203 <Method void EdgeEffect.onRelease()>
		}
		if(true) goto _L10; else goto _L3
	//  358  716:goto            630
_L3:
		motionevent = ((MotionEvent) (mVelocityTracker));
	//  359  719:aload_0         
	//  360  720:getfield        #307 <Field VelocityTracker mVelocityTracker>
	//  361  723:astore_1        
		((VelocityTracker) (motionevent)).computeCurrentVelocity(1000, mMaximumVelocity);
	//  362  724:aload_1         
	//  363  725:sipush          1000
	//  364  728:aload_0         
	//  365  729:getfield        #351 <Field int mMaximumVelocity>
	//  366  732:i2f             
	//  367  733:invokevirtual   #880 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
		i = (int)((VelocityTracker) (motionevent)).getYVelocity(mActivePointerId);
	//  368  736:aload_1         
	//  369  737:aload_0         
	//  370  738:getfield        #110 <Field int mActivePointerId>
	//  371  741:invokevirtual   #883 <Method float VelocityTracker.getYVelocity(int)>
	//  372  744:f2i             
	//  373  745:istore_2        
		if(Math.abs(i) <= mMinimumVelocity) goto _L12; else goto _L11
	//  374  746:iload_2         
	//  375  747:invokestatic    #733 <Method int Math.abs(int)>
	//  376  750:aload_0         
	//  377  751:getfield        #346 <Field int mMinimumVelocity>
	//  378  754:icmple          775
_L11:
		flingWithNestedDispatch(-i);
	//  379  757:aload_0         
	//  380  758:iload_2         
	//  381  759:ineg            
	//  382  760:invokespecial   #793 <Method void flingWithNestedDispatch(int)>
_L13:
		mActivePointerId = -1;
	//  383  763:aload_0         
	//  384  764:iconst_m1       
	//  385  765:putfield        #110 <Field int mActivePointerId>
		endDrag();
	//  386  768:aload_0         
	//  387  769:invokespecial   #885 <Method void endDrag()>
		continue; /* Loop/switch isn't completed */
	//  388  772:goto            80
_L12:
		if(mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()))
	//* 389  775:aload_0         
	//* 390  776:getfield        #321 <Field OverScroller mScroller>
	//* 391  779:aload_0         
	//* 392  780:invokevirtual   #493 <Method int getScrollX()>
	//* 393  783:aload_0         
	//* 394  784:invokevirtual   #240 <Method int getScrollY()>
	//* 395  787:iconst_0        
	//* 396  788:iconst_0        
	//* 397  789:iconst_0        
	//* 398  790:aload_0         
	//* 399  791:invokevirtual   #243 <Method int getScrollRange()>
	//* 400  794:invokevirtual   #761 <Method boolean OverScroller.springBack(int, int, int, int, int, int)>
	//* 401  797:ifeq            763
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//  402  800:aload_0         
	//  403  801:invokestatic    #512 <Method void ViewCompat.postInvalidateOnAnimation(View)>
		if(true) goto _L13; else goto _L5
	//  404  804:goto            763
_L5:
		if(mIsBeingDragged && getChildCount() > 0 && mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()))
	//* 405  807:aload_0         
	//* 406  808:getfield        #106 <Field boolean mIsBeingDragged>
	//* 407  811:ifeq            850
	//* 408  814:aload_0         
	//* 409  815:invokevirtual   #298 <Method int getChildCount()>
	//* 410  818:ifle            850
	//* 411  821:aload_0         
	//* 412  822:getfield        #321 <Field OverScroller mScroller>
	//* 413  825:aload_0         
	//* 414  826:invokevirtual   #493 <Method int getScrollX()>
	//* 415  829:aload_0         
	//* 416  830:invokevirtual   #240 <Method int getScrollY()>
	//* 417  833:iconst_0        
	//* 418  834:iconst_0        
	//* 419  835:iconst_0        
	//* 420  836:aload_0         
	//* 421  837:invokevirtual   #243 <Method int getScrollRange()>
	//* 422  840:invokevirtual   #761 <Method boolean OverScroller.springBack(int, int, int, int, int, int)>
	//* 423  843:ifeq            850
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//  424  846:aload_0         
	//  425  847:invokestatic    #512 <Method void ViewCompat.postInvalidateOnAnimation(View)>
		mActivePointerId = -1;
	//  426  850:aload_0         
	//  427  851:iconst_m1       
	//  428  852:putfield        #110 <Field int mActivePointerId>
		endDrag();
	//  429  855:aload_0         
	//  430  856:invokespecial   #885 <Method void endDrag()>
		continue; /* Loop/switch isn't completed */
	//  431  859:goto            80
_L6:
		int j = motionevent.getActionIndex();
	//  432  862:aload_1         
	//  433  863:invokevirtual   #389 <Method int MotionEvent.getActionIndex()>
	//  434  866:istore_2        
		mLastMotionY = (int)motionevent.getY(j);
	//  435  867:aload_0         
	//  436  868:aload_1         
	//  437  869:iload_2         
	//  438  870:invokevirtual   #397 <Method float MotionEvent.getY(int)>
	//  439  873:f2i             
	//  440  874:putfield        #399 <Field int mLastMotionY>
		mActivePointerId = motionevent.getPointerId(j);
	//  441  877:aload_0         
	//  442  878:aload_1         
	//  443  879:iload_2         
	//  444  880:invokevirtual   #393 <Method int MotionEvent.getPointerId(int)>
	//  445  883:putfield        #110 <Field int mActivePointerId>
		continue; /* Loop/switch isn't completed */
	//  446  886:goto            80
_L7:
		onSecondaryPointerUp(motionevent);
	//  447  889:aload_0         
	//  448  890:aload_1         
	//  449  891:invokespecial   #763 <Method void onSecondaryPointerUp(MotionEvent)>
		mLastMotionY = (int)motionevent.getY(motionevent.findPointerIndex(mActivePointerId));
	//  450  894:aload_0         
	//  451  895:aload_1         
	//  452  896:aload_1         
	//  453  897:aload_0         
	//  454  898:getfield        #110 <Field int mActivePointerId>
	//  455  901:invokevirtual   #706 <Method int MotionEvent.findPointerIndex(int)>
	//  456  904:invokevirtual   #397 <Method float MotionEvent.getY(int)>
	//  457  907:f2i             
	//  458  908:putfield        #399 <Field int mLastMotionY>
		if(true) goto _L1; else goto _L14
	//  459  911:goto            80
_L14:
	}

	boolean overScrollByCompat(int i, int j, int k, int l, int i1, int j1, int k1, 
			int l1, boolean flag)
	{
		int i2 = getOverScrollMode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #209 <Method int getOverScrollMode()>
	//    2    4:istore          12
		boolean flag1;
		boolean flag2;
		boolean flag3;
		if(computeHorizontalScrollRange() > computeHorizontalScrollExtent())
	//*   3    6:aload_0         
	//*   4    7:invokevirtual   #886 <Method int computeHorizontalScrollRange()>
	//*   5   10:aload_0         
	//*   6   11:invokevirtual   #887 <Method int computeHorizontalScrollExtent()>
	//*   7   14:icmple          199
			flag1 = true;
	//    8   17:iconst_1        
	//    9   18:istore          10
		else
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #889 <Method int computeVerticalScrollRange()>
	//*  12   24:aload_0         
	//*  13   25:invokevirtual   #890 <Method int computeVerticalScrollExtent()>
	//*  14   28:icmple          205
	//*  15   31:iconst_1        
	//*  16   32:istore          11
	//*  17   34:iload           12
	//*  18   36:ifeq            50
	//*  19   39:iload           12
	//*  20   41:iconst_1        
	//*  21   42:icmpne          211
	//*  22   45:iload           10
	//*  23   47:ifeq            211
	//*  24   50:iconst_1        
	//*  25   51:istore          10
	//*  26   53:iload           12
	//*  27   55:ifeq            69
	//*  28   58:iload           12
	//*  29   60:iconst_1        
	//*  30   61:icmpne          217
	//*  31   64:iload           11
	//*  32   66:ifeq            217
	//*  33   69:iconst_1        
	//*  34   70:istore          11
	//*  35   72:iload_3         
	//*  36   73:iload_1         
	//*  37   74:iadd            
	//*  38   75:istore_3        
	//*  39   76:iload           10
	//*  40   78:ifne            84
	//*  41   81:iconst_0        
	//*  42   82:istore          7
	//*  43   84:iload           4
	//*  44   86:iload_2         
	//*  45   87:iadd            
	//*  46   88:istore          4
	//*  47   90:iload           11
	//*  48   92:ifne            98
	//*  49   95:iconst_0        
	//*  50   96:istore          8
	//*  51   98:iload           7
	//*  52  100:ineg            
	//*  53  101:istore_2        
	//*  54  102:iload           7
	//*  55  104:iload           5
	//*  56  106:iadd            
	//*  57  107:istore_1        
	//*  58  108:iload           8
	//*  59  110:ineg            
	//*  60  111:istore          5
	//*  61  113:iload           8
	//*  62  115:iload           6
	//*  63  117:iadd            
	//*  64  118:istore          6
	//*  65  120:iconst_0        
	//*  66  121:istore          9
	//*  67  123:iload_3         
	//*  68  124:iload_1         
	//*  69  125:icmple          223
	//*  70  128:iconst_1        
	//*  71  129:istore          9
	//*  72  131:iconst_0        
	//*  73  132:istore          13
	//*  74  134:iload           4
	//*  75  136:iload           6
	//*  76  138:icmple          238
	//*  77  141:iload           6
	//*  78  143:istore_2        
	//*  79  144:iconst_1        
	//*  80  145:istore          13
	//*  81  147:iload           13
	//*  82  149:ifeq            177
	//*  83  152:aload_0         
	//*  84  153:iconst_1        
	//*  85  154:invokevirtual   #515 <Method boolean hasNestedScrollingParent(int)>
	//*  86  157:ifne            177
	//*  87  160:aload_0         
	//*  88  161:getfield        #321 <Field OverScroller mScroller>
	//*  89  164:iload_1         
	//*  90  165:iload_2         
	//*  91  166:iconst_0        
	//*  92  167:iconst_0        
	//*  93  168:iconst_0        
	//*  94  169:aload_0         
	//*  95  170:invokevirtual   #243 <Method int getScrollRange()>
	//*  96  173:invokevirtual   #761 <Method boolean OverScroller.springBack(int, int, int, int, int, int)>
	//*  97  176:pop             
	//*  98  177:aload_0         
	//*  99  178:iload_1         
	//* 100  179:iload_2         
	//* 101  180:iload           9
	//* 102  182:iload           13
	//* 103  184:invokevirtual   #892 <Method void onOverScrolled(int, int, boolean, boolean)>
	//* 104  187:iload           9
	//* 105  189:ifne            197
	//* 106  192:iload           13
	//* 107  194:ifeq            257
	//* 108  197:iconst_1        
	//* 109  198:ireturn         
			flag1 = false;
	//  110  199:iconst_0        
	//  111  200:istore          10
		if(computeVerticalScrollRange() > computeVerticalScrollExtent())
			flag2 = true;
		else
	//* 112  202:goto            20
			flag2 = false;
	//  113  205:iconst_0        
	//  114  206:istore          11
		if(i2 == 0 || i2 == 1 && flag1)
			flag1 = true;
		else
	//* 115  208:goto            34
			flag1 = false;
	//  116  211:iconst_0        
	//  117  212:istore          10
		if(i2 == 0 || i2 == 1 && flag2)
			flag2 = true;
		else
	//* 118  214:goto            53
			flag2 = false;
	//  119  217:iconst_0        
	//  120  218:istore          11
		k += i;
		if(!flag1)
			k1 = 0;
		l += j;
		if(!flag2)
			l1 = 0;
		j = -k1;
		i = k1 + i1;
		i1 = -l1;
		j1 = l1 + j1;
		flag = false;
		if(k > i)
		{
			flag = true;
		} else
	//* 121  220:goto            72
		{
			i = k;
	//  122  223:iload_3         
	//  123  224:istore_1        
			if(k < j)
	//* 124  225:iload_3         
	//* 125  226:iload_2         
	//* 126  227:icmpge          131
			{
				i = j;
	//  127  230:iload_2         
	//  128  231:istore_1        
				flag = true;
	//  129  232:iconst_1        
	//  130  233:istore          9
			}
		}
		flag3 = false;
		if(l > j1)
		{
			j = j1;
			flag3 = true;
		} else
	//* 131  235:goto            131
		{
			j = l;
	//  132  238:iload           4
	//  133  240:istore_2        
			if(l < i1)
	//* 134  241:iload           4
	//* 135  243:iload           5
	//* 136  245:icmpge          147
			{
				j = i1;
	//  137  248:iload           5
	//  138  250:istore_2        
				flag3 = true;
	//  139  251:iconst_1        
	//  140  252:istore          13
			}
		}
		if(flag3 && !hasNestedScrollingParent(1))
			mScroller.springBack(i, j, 0, 0, 0, getScrollRange());
		onOverScrolled(i, j, flag, flag3);
		return flag || flag3;
	//  141  254:goto            147
	//  142  257:iconst_0        
	//  143  258:ireturn         
	}

	public boolean pageScroll(int i)
	{
		int k;
		int j;
		View view;
		if(i == 130)
	//*   0    0:iload_1         
	//*   1    1:sipush          130
	//*   2    4:icmpne          116
			j = 1;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #172 <Method int getHeight()>
	//*   7   13:istore_3        
	//*   8   14:iload_2         
	//*   9   15:ifeq            121
	//*  10   18:aload_0         
	//*  11   19:getfield        #98  <Field Rect mTempRect>
	//*  12   22:aload_0         
	//*  13   23:invokevirtual   #240 <Method int getScrollY()>
	//*  14   26:iload_3         
	//*  15   27:iadd            
	//*  16   28:putfield        #382 <Field int Rect.top>
	//*  17   31:aload_0         
	//*  18   32:invokevirtual   #298 <Method int getChildCount()>
	//*  19   35:istore_2        
	//*  20   36:iload_2         
	//*  21   37:ifle            80
	//*  22   40:aload_0         
	//*  23   41:iload_2         
	//*  24   42:iconst_1        
	//*  25   43:isub            
	//*  26   44:invokevirtual   #165 <Method View getChildAt(int)>
	//*  27   47:astore          4
	//*  28   49:aload_0         
	//*  29   50:getfield        #98  <Field Rect mTempRect>
	//*  30   53:getfield        #382 <Field int Rect.top>
	//*  31   56:iload_3         
	//*  32   57:iadd            
	//*  33   58:aload           4
	//*  34   60:invokevirtual   #236 <Method int View.getBottom()>
	//*  35   63:icmple          80
	//*  36   66:aload_0         
	//*  37   67:getfield        #98  <Field Rect mTempRect>
	//*  38   70:aload           4
	//*  39   72:invokevirtual   #236 <Method int View.getBottom()>
	//*  40   75:iload_3         
	//*  41   76:isub            
	//*  42   77:putfield        #382 <Field int Rect.top>
	//*  43   80:aload_0         
	//*  44   81:getfield        #98  <Field Rect mTempRect>
	//*  45   84:aload_0         
	//*  46   85:getfield        #98  <Field Rect mTempRect>
	//*  47   88:getfield        #382 <Field int Rect.top>
	//*  48   91:iload_3         
	//*  49   92:iadd            
	//*  50   93:putfield        #379 <Field int Rect.bottom>
	//*  51   96:aload_0         
	//*  52   97:iload_1         
	//*  53   98:aload_0         
	//*  54   99:getfield        #98  <Field Rect mTempRect>
	//*  55  102:getfield        #382 <Field int Rect.top>
	//*  56  105:aload_0         
	//*  57  106:getfield        #98  <Field Rect mTempRect>
	//*  58  109:getfield        #379 <Field int Rect.bottom>
	//*  59  112:invokespecial   #631 <Method boolean scrollAndFocus(int, int, int)>
	//*  60  115:ireturn         
			j = 0;
	//   61  116:iconst_0        
	//   62  117:istore_2        
		k = getHeight();
		if(j == 0) goto _L2; else goto _L1
_L1:
		mTempRect.top = getScrollY() + k;
		j = getChildCount();
		if(j > 0)
		{
			view = getChildAt(j - 1);
			if(mTempRect.top + k > view.getBottom())
				mTempRect.top = view.getBottom() - k;
		}
_L4:
		mTempRect.bottom = mTempRect.top + k;
		return scrollAndFocus(i, mTempRect.top, mTempRect.bottom);
	//*  63  118:goto            9
_L2:
		mTempRect.top = getScrollY() - k;
	//   64  121:aload_0         
	//   65  122:getfield        #98  <Field Rect mTempRect>
	//   66  125:aload_0         
	//   67  126:invokevirtual   #240 <Method int getScrollY()>
	//   68  129:iload_3         
	//   69  130:isub            
	//   70  131:putfield        #382 <Field int Rect.top>
		if(mTempRect.top < 0)
	//*  71  134:aload_0         
	//*  72  135:getfield        #98  <Field Rect mTempRect>
	//*  73  138:getfield        #382 <Field int Rect.top>
	//*  74  141:ifge            80
			mTempRect.top = 0;
	//   75  144:aload_0         
	//   76  145:getfield        #98  <Field Rect mTempRect>
	//   77  148:iconst_0        
	//   78  149:putfield        #382 <Field int Rect.top>
		if(true) goto _L4; else goto _L3
	//   79  152:goto            80
_L3:
	}

	public void requestChildFocus(View view, View view1)
	{
		if(!mIsLayoutDirty)
	//*   0    0:aload_0         
	//*   1    1:getfield        #100 <Field boolean mIsLayoutDirty>
	//*   2    4:ifne            19
			scrollToChild(view1);
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:invokespecial   #769 <Method void scrollToChild(View)>
		else
	//*   6   12:aload_0         
	//*   7   13:aload_1         
	//*   8   14:aload_2         
	//*   9   15:invokespecial   #896 <Method void FrameLayout.requestChildFocus(View, View)>
	//*  10   18:return          
			mChildToScrollTo = view1;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:putfield        #104 <Field View mChildToScrollTo>
		super.requestChildFocus(view, view1);
	//*  14   24:goto            12
	}

	public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean flag)
	{
		rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #301 <Method int View.getLeft()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #899 <Method int View.getScrollX()>
	//    5    9:isub            
	//    6   10:aload_1         
	//    7   11:invokevirtual   #233 <Method int View.getTop()>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #900 <Method int View.getScrollY()>
	//   10   18:isub            
	//   11   19:invokevirtual   #903 <Method void Rect.offset(int, int)>
		return scrollToChildRect(rect, flag);
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:iload_3         
	//   15   25:invokespecial   #905 <Method boolean scrollToChildRect(Rect, boolean)>
	//   16   28:ireturn         
	}

	public void requestDisallowInterceptTouchEvent(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            8
			recycleVelocityTracker();
	//    2    4:aload_0         
	//    3    5:invokespecial   #193 <Method void recycleVelocityTracker()>
		super.requestDisallowInterceptTouchEvent(flag);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokespecial   #906 <Method void FrameLayout.requestDisallowInterceptTouchEvent(boolean)>
	//    7   13:return          
	}

	public void requestLayout()
	{
		mIsLayoutDirty = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #100 <Field boolean mIsLayoutDirty>
		super.requestLayout();
	//    3    5:aload_0         
	//    4    6:invokespecial   #907 <Method void FrameLayout.requestLayout()>
	//    5    9:return          
	}

	public void scrollTo(int i, int j)
	{
		if(getChildCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #298 <Method int getChildCount()>
	//*   2    4:ifle            81
		{
			View view = getChildAt(0);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #165 <Method View getChildAt(int)>
	//    6   12:astore_3        
			i = clamp(i, getWidth() - getPaddingRight() - getPaddingLeft(), view.getWidth());
	//    7   13:iload_1         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #569 <Method int getWidth()>
	//   10   18:aload_0         
	//   11   19:invokevirtual   #575 <Method int getPaddingRight()>
	//   12   22:isub            
	//   13   23:aload_0         
	//   14   24:invokevirtual   #572 <Method int getPaddingLeft()>
	//   15   27:isub            
	//   16   28:aload_3         
	//   17   29:invokevirtual   #908 <Method int View.getWidth()>
	//   18   32:invokestatic    #910 <Method int clamp(int, int, int)>
	//   19   35:istore_1        
			j = clamp(j, getHeight() - getPaddingBottom() - getPaddingTop(), view.getHeight());
	//   20   36:iload_2         
	//   21   37:aload_0         
	//   22   38:invokevirtual   #172 <Method int getHeight()>
	//   23   41:aload_0         
	//   24   42:invokevirtual   #178 <Method int getPaddingBottom()>
	//   25   45:isub            
	//   26   46:aload_0         
	//   27   47:invokevirtual   #175 <Method int getPaddingTop()>
	//   28   50:isub            
	//   29   51:aload_3         
	//   30   52:invokevirtual   #171 <Method int View.getHeight()>
	//   31   55:invokestatic    #910 <Method int clamp(int, int, int)>
	//   32   58:istore_2        
			if(i != getScrollX() || j != getScrollY())
	//*  33   59:iload_1         
	//*  34   60:aload_0         
	//*  35   61:invokevirtual   #493 <Method int getScrollX()>
	//*  36   64:icmpne          75
	//*  37   67:iload_2         
	//*  38   68:aload_0         
	//*  39   69:invokevirtual   #240 <Method int getScrollY()>
	//*  40   72:icmpeq          81
				super.scrollTo(i, j);
	//   41   75:aload_0         
	//   42   76:iload_1         
	//   43   77:iload_2         
	//   44   78:invokespecial   #702 <Method void FrameLayout.scrollTo(int, int)>
		}
	//   45   81:return          
	}

	public void setFillViewport(boolean flag)
	{
		if(flag != mFillViewport)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #642 <Field boolean mFillViewport>
	//*   3    5:icmpeq          17
		{
			mFillViewport = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #642 <Field boolean mFillViewport>
			requestLayout();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #827 <Method void requestLayout()>
		}
	//    9   17:return          
	}

	public void setNestedScrollingEnabled(boolean flag)
	{
		mChildHelper.setNestedScrollingEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #911 <Method void NestedScrollingChildHelper.setNestedScrollingEnabled(boolean)>
	//    4    8:return          
	}

	public void setOnScrollChangeListener(OnScrollChangeListener onscrollchangelistener)
	{
		mOnScrollChangeListener = onscrollchangelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #838 <Field NestedScrollView$OnScrollChangeListener mOnScrollChangeListener>
	//    3    5:return          
	}

	public void setSmoothScrollingEnabled(boolean flag)
	{
		mSmoothScrollingEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #108 <Field boolean mSmoothScrollingEnabled>
	//    3    5:return          
	}

	public boolean shouldDelayChildPressedState()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public final void smoothScrollBy(int i, int j)
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #298 <Method int getChildCount()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(AnimationUtils.currentAnimationTimeMillis() - mLastScroll > 250L)
	//*   4    8:invokestatic    #921 <Method long AnimationUtils.currentAnimationTimeMillis()>
	//*   5   11:aload_0         
	//*   6   12:getfield        #923 <Field long mLastScroll>
	//*   7   15:lsub            
	//*   8   16:ldc2w           #924 <Long 250L>
	//*   9   19:lcmp            
	//*  10   20:ifle            104
		{
			i = getHeight();
	//   11   23:aload_0         
	//   12   24:invokevirtual   #172 <Method int getHeight()>
	//   13   27:istore_1        
			int k = getPaddingBottom();
	//   14   28:aload_0         
	//   15   29:invokevirtual   #178 <Method int getPaddingBottom()>
	//   16   32:istore_3        
			int l = getPaddingTop();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #175 <Method int getPaddingTop()>
	//   19   37:istore          4
			k = Math.max(0, getChildAt(0).getHeight() - (i - k - l));
	//   20   39:iconst_0        
	//   21   40:aload_0         
	//   22   41:iconst_0        
	//   23   42:invokevirtual   #165 <Method View getChildAt(int)>
	//   24   45:invokevirtual   #171 <Method int View.getHeight()>
	//   25   48:iload_1         
	//   26   49:iload_3         
	//   27   50:isub            
	//   28   51:iload           4
	//   29   53:isub            
	//   30   54:isub            
	//   31   55:invokestatic    #530 <Method int Math.max(int, int)>
	//   32   58:istore_3        
			i = getScrollY();
	//   33   59:aload_0         
	//   34   60:invokevirtual   #240 <Method int getScrollY()>
	//   35   63:istore_1        
			j = Math.max(0, Math.min(i + j, k));
	//   36   64:iconst_0        
	//   37   65:iload_1         
	//   38   66:iload_2         
	//   39   67:iadd            
	//   40   68:iload_3         
	//   41   69:invokestatic    #527 <Method int Math.min(int, int)>
	//   42   72:invokestatic    #530 <Method int Math.max(int, int)>
	//   43   75:istore_2        
			mScroller.startScroll(getScrollX(), i, 0, j - i);
	//   44   76:aload_0         
	//   45   77:getfield        #321 <Field OverScroller mScroller>
	//   46   80:aload_0         
	//   47   81:invokevirtual   #493 <Method int getScrollX()>
	//   48   84:iload_1         
	//   49   85:iconst_0        
	//   50   86:iload_2         
	//   51   87:iload_1         
	//   52   88:isub            
	//   53   89:invokevirtual   #928 <Method void OverScroller.startScroll(int, int, int, int)>
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   54   92:aload_0         
	//   55   93:invokestatic    #512 <Method void ViewCompat.postInvalidateOnAnimation(View)>
		} else
	//*  56   96:aload_0         
	//*  57   97:invokestatic    #921 <Method long AnimationUtils.currentAnimationTimeMillis()>
	//*  58  100:putfield        #923 <Field long mLastScroll>
	//*  59  103:return          
		{
			if(!mScroller.isFinished())
	//*  60  104:aload_0         
	//*  61  105:getfield        #321 <Field OverScroller mScroller>
	//*  62  108:invokevirtual   #757 <Method boolean OverScroller.isFinished()>
	//*  63  111:ifne            121
				mScroller.abortAnimation();
	//   64  114:aload_0         
	//   65  115:getfield        #321 <Field OverScroller mScroller>
	//   66  118:invokevirtual   #866 <Method void OverScroller.abortAnimation()>
			scrollBy(i, j);
	//   67  121:aload_0         
	//   68  122:iload_1         
	//   69  123:iload_2         
	//   70  124:invokevirtual   #189 <Method void scrollBy(int, int)>
		}
		mLastScroll = AnimationUtils.currentAnimationTimeMillis();
	//*  71  127:goto            96
	}

	public final void smoothScrollTo(int i, int j)
	{
		smoothScrollBy(i - getScrollX(), j - getScrollY());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #493 <Method int getScrollX()>
	//    4    6:isub            
	//    5    7:iload_2         
	//    6    8:aload_0         
	//    7    9:invokevirtual   #240 <Method int getScrollY()>
	//    8   12:isub            
	//    9   13:invokevirtual   #186 <Method void smoothScrollBy(int, int)>
	//   10   16:return          
	}

	public boolean startNestedScroll(int i)
	{
		return mChildHelper.startNestedScroll(i);
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #930 <Method boolean NestedScrollingChildHelper.startNestedScroll(int)>
	//    4    8:ireturn         
	}

	public boolean startNestedScroll(int i, int j)
	{
		return mChildHelper.startNestedScroll(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #931 <Method boolean NestedScrollingChildHelper.startNestedScroll(int, int)>
	//    5    9:ireturn         
	}

	public void stopNestedScroll()
	{
		mChildHelper.stopNestedScroll();
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:invokevirtual   #932 <Method void NestedScrollingChildHelper.stopNestedScroll()>
	//    3    7:return          
	}

	public void stopNestedScroll(int i)
	{
		mChildHelper.stopNestedScroll(i);
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #933 <Method void NestedScrollingChildHelper.stopNestedScroll(int)>
	//    4    8:return          
	}

	private static final AccessibilityDelegate ACCESSIBILITY_DELEGATE = new AccessibilityDelegate();
	static final int ANIMATED_SCROLL_GAP = 250;
	private static final int INVALID_POINTER = -1;
	static final float MAX_SCROLL_FACTOR = 0.5F;
	private static final int SCROLLVIEW_STYLEABLE[] = {
		0x101017a
	};
	private static final String TAG = "NestedScrollView";
	private int mActivePointerId;
	private final NestedScrollingChildHelper mChildHelper;
	private View mChildToScrollTo;
	private EdgeEffect mEdgeGlowBottom;
	private EdgeEffect mEdgeGlowTop;
	private boolean mFillViewport;
	private boolean mIsBeingDragged;
	private boolean mIsLaidOut;
	private boolean mIsLayoutDirty;
	private int mLastMotionY;
	private long mLastScroll;
	private int mLastScrollerY;
	private int mMaximumVelocity;
	private int mMinimumVelocity;
	private int mNestedYOffset;
	private OnScrollChangeListener mOnScrollChangeListener;
	private final NestedScrollingParentHelper mParentHelper;
	private SavedState mSavedState;
	private final int mScrollConsumed[];
	private final int mScrollOffset[];
	private OverScroller mScroller;
	private boolean mSmoothScrollingEnabled;
	private final Rect mTempRect;
	private int mTouchSlop;
	private VelocityTracker mVelocityTracker;
	private float mVerticalScrollFactor;

	static 
	{
	//    0    0:new             #12  <Class NestedScrollView$AccessibilityDelegate>
	//    1    3:dup             
	//    2    4:invokespecial   #79  <Method void NestedScrollView$AccessibilityDelegate()>
	//    3    7:putstatic       #81  <Field NestedScrollView$AccessibilityDelegate ACCESSIBILITY_DELEGATE>
	//    4   10:iconst_1        
	//    5   11:newarray        int[]
	//    6   13:dup             
	//    7   14:iconst_0        
	//    8   15:ldc1            #82  <Int 0x101017a>
	//    9   17:iastore         
	//   10   18:putstatic       #84  <Field int[] SCROLLVIEW_STYLEABLE>
	//*  11   21:return          
	}
}
