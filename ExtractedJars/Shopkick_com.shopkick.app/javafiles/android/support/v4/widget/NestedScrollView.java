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
	implements NestedScrollingParent2, NestedScrollingChild2, ScrollingView
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
		//*  13   24:ifle            32
				flag = true;
		//   14   27:iconst_1        
		//   15   28:istore_3        
			else
		//*  16   29:goto            34
				flag = false;
		//   17   32:iconst_0        
		//   18   33:istore_3        
			accessibilityevent.setScrollable(flag);
		//   19   34:aload_2         
		//   20   35:iload_3         
		//   21   36:invokevirtual   #38  <Method void AccessibilityEvent.setScrollable(boolean)>
			accessibilityevent.setScrollX(((NestedScrollView) (view)).getScrollX());
		//   22   39:aload_2         
		//   23   40:aload_1         
		//   24   41:invokevirtual   #41  <Method int NestedScrollView.getScrollX()>
		//   25   44:invokevirtual   #45  <Method void AccessibilityEvent.setScrollX(int)>
			accessibilityevent.setScrollY(((NestedScrollView) (view)).getScrollY());
		//   26   47:aload_2         
		//   27   48:aload_1         
		//   28   49:invokevirtual   #48  <Method int NestedScrollView.getScrollY()>
		//   29   52:invokevirtual   #51  <Method void AccessibilityEvent.setScrollY(int)>
			AccessibilityRecordCompat.setMaxScrollX(((android.view.accessibility.AccessibilityRecord) (accessibilityevent)), ((NestedScrollView) (view)).getScrollX());
		//   30   55:aload_2         
		//   31   56:aload_1         
		//   32   57:invokevirtual   #41  <Method int NestedScrollView.getScrollX()>
		//   33   60:invokestatic    #57  <Method void AccessibilityRecordCompat.setMaxScrollX(android.view.accessibility.AccessibilityRecord, int)>
			AccessibilityRecordCompat.setMaxScrollY(((android.view.accessibility.AccessibilityRecord) (accessibilityevent)), ((NestedScrollView) (view)).getScrollRange());
		//   34   63:aload_2         
		//   35   64:aload_1         
		//   36   65:invokevirtual   #34  <Method int NestedScrollView.getScrollRange()>
		//   37   68:invokestatic    #60  <Method void AccessibilityRecordCompat.setMaxScrollY(android.view.accessibility.AccessibilityRecord, int)>
		//   38   71:return          
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
			if(i != 4096)
		//*  16   26:iload_2         
		//*  17   27:sipush          4096
		//*  18   30:icmpeq          94
			{
				if(i != 8192)
		//*  19   33:iload_2         
		//*  20   34:sipush          8192
		//*  21   37:icmpeq          42
					return false;
		//   22   40:iconst_0        
		//   23   41:ireturn         
				i = ((NestedScrollView) (view)).getHeight();
		//   24   42:aload_1         
		//   25   43:invokevirtual   #82  <Method int NestedScrollView.getHeight()>
		//   26   46:istore_2        
				int j = ((NestedScrollView) (view)).getPaddingBottom();
		//   27   47:aload_1         
		//   28   48:invokevirtual   #85  <Method int NestedScrollView.getPaddingBottom()>
		//   29   51:istore          4
				int l = ((NestedScrollView) (view)).getPaddingTop();
		//   30   53:aload_1         
		//   31   54:invokevirtual   #88  <Method int NestedScrollView.getPaddingTop()>
		//   32   57:istore          5
				i = Math.max(((NestedScrollView) (view)).getScrollY() - (i - j - l), 0);
		//   33   59:aload_1         
		//   34   60:invokevirtual   #48  <Method int NestedScrollView.getScrollY()>
		//   35   63:iload_2         
		//   36   64:iload           4
		//   37   66:isub            
		//   38   67:iload           5
		//   39   69:isub            
		//   40   70:isub            
		//   41   71:iconst_0        
		//   42   72:invokestatic    #94  <Method int Math.max(int, int)>
		//   43   75:istore_2        
				if(i != ((NestedScrollView) (view)).getScrollY())
		//*  44   76:iload_2         
		//*  45   77:aload_1         
		//*  46   78:invokevirtual   #48  <Method int NestedScrollView.getScrollY()>
		//*  47   81:icmpeq          92
				{
					((NestedScrollView) (view)).smoothScrollTo(0, i);
		//   48   84:aload_1         
		//   49   85:iconst_0        
		//   50   86:iload_2         
		//   51   87:invokevirtual   #98  <Method void NestedScrollView.smoothScrollTo(int, int)>
					return true;
		//   52   90:iconst_1        
		//   53   91:ireturn         
				} else
				{
					return false;
		//   54   92:iconst_0        
		//   55   93:ireturn         
				}
			}
			i = ((NestedScrollView) (view)).getHeight();
		//   56   94:aload_1         
		//   57   95:invokevirtual   #82  <Method int NestedScrollView.getHeight()>
		//   58   98:istore_2        
			int k = ((NestedScrollView) (view)).getPaddingBottom();
		//   59   99:aload_1         
		//   60  100:invokevirtual   #85  <Method int NestedScrollView.getPaddingBottom()>
		//   61  103:istore          4
			int i1 = ((NestedScrollView) (view)).getPaddingTop();
		//   62  105:aload_1         
		//   63  106:invokevirtual   #88  <Method int NestedScrollView.getPaddingTop()>
		//   64  109:istore          5
			i = Math.min(((NestedScrollView) (view)).getScrollY() + (i - k - i1), ((NestedScrollView) (view)).getScrollRange());
		//   65  111:aload_1         
		//   66  112:invokevirtual   #48  <Method int NestedScrollView.getScrollY()>
		//   67  115:iload_2         
		//   68  116:iload           4
		//   69  118:isub            
		//   70  119:iload           5
		//   71  121:isub            
		//   72  122:iadd            
		//   73  123:aload_1         
		//   74  124:invokevirtual   #34  <Method int NestedScrollView.getScrollRange()>
		//   75  127:invokestatic    #101 <Method int Math.min(int, int)>
		//   76  130:istore_2        
			if(i != ((NestedScrollView) (view)).getScrollY())
		//*  77  131:iload_2         
		//*  78  132:aload_1         
		//*  79  133:invokevirtual   #48  <Method int NestedScrollView.getScrollY()>
		//*  80  136:icmpeq          147
			{
				((NestedScrollView) (view)).smoothScrollTo(0, i);
		//   81  139:aload_1         
		//   82  140:iconst_0        
		//   83  141:iload_2         
		//   84  142:invokevirtual   #98  <Method void NestedScrollView.smoothScrollTo(int, int)>
				return true;
		//   85  145:iconst_1        
		//   86  146:ireturn         
			} else
			{
				return false;
		//   87  147:iconst_0        
		//   88  148:ireturn         
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
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #40  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #41  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("HorizontalScrollView.SavedState{");
		//    4    8:aload_1         
		//    5    9:ldc1            #43  <String "HorizontalScrollView.SavedState{">
		//    6   11:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:invokestatic    #53  <Method int System.identityHashCode(Object)>
		//   11   20:invokestatic    #59  <Method String Integer.toHexString(int)>
		//   12   23:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//   13   26:pop             
			stringbuilder.append(" scrollPosition=");
		//   14   27:aload_1         
		//   15   28:ldc1            #61  <String " scrollPosition=">
		//   16   30:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//   17   33:pop             
			stringbuilder.append(scrollPosition);
		//   18   34:aload_1         
		//   19   35:aload_0         
		//   20   36:getfield        #33  <Field int scrollPosition>
		//   21   39:invokevirtual   #64  <Method StringBuilder StringBuilder.append(int)>
		//   22   42:pop             
			stringbuilder.append("}");
		//   23   43:aload_1         
		//   24   44:ldc1            #66  <String "}">
		//   25   46:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//   26   49:pop             
			return stringbuilder.toString();
		//   27   50:aload_1         
		//   28   51:invokevirtual   #68  <Method String StringBuilder.toString()>
		//   29   54:areturn         
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
	//    3    3:invokespecial   #90  <Method void NestedScrollView(Context, AttributeSet)>
	//    4    6:return          
	}

	public NestedScrollView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #95  <Method void NestedScrollView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public NestedScrollView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #96  <Method void FrameLayout(Context, AttributeSet, int)>
		mTempRect = new Rect();
	//    5    7:aload_0         
	//    6    8:new             #98  <Class Rect>
	//    7   11:dup             
	//    8   12:invokespecial   #99  <Method void Rect()>
	//    9   15:putfield        #101 <Field Rect mTempRect>
		mIsLayoutDirty = true;
	//   10   18:aload_0         
	//   11   19:iconst_1        
	//   12   20:putfield        #103 <Field boolean mIsLayoutDirty>
		mIsLaidOut = false;
	//   13   23:aload_0         
	//   14   24:iconst_0        
	//   15   25:putfield        #105 <Field boolean mIsLaidOut>
		mChildToScrollTo = null;
	//   16   28:aload_0         
	//   17   29:aconst_null     
	//   18   30:putfield        #107 <Field View mChildToScrollTo>
		mIsBeingDragged = false;
	//   19   33:aload_0         
	//   20   34:iconst_0        
	//   21   35:putfield        #109 <Field boolean mIsBeingDragged>
		mSmoothScrollingEnabled = true;
	//   22   38:aload_0         
	//   23   39:iconst_1        
	//   24   40:putfield        #111 <Field boolean mSmoothScrollingEnabled>
		mActivePointerId = -1;
	//   25   43:aload_0         
	//   26   44:iconst_m1       
	//   27   45:putfield        #113 <Field int mActivePointerId>
		mScrollOffset = new int[2];
	//   28   48:aload_0         
	//   29   49:iconst_2        
	//   30   50:newarray        int[]
	//   31   52:putfield        #115 <Field int[] mScrollOffset>
		mScrollConsumed = new int[2];
	//   32   55:aload_0         
	//   33   56:iconst_2        
	//   34   57:newarray        int[]
	//   35   59:putfield        #117 <Field int[] mScrollConsumed>
		initScrollView();
	//   36   62:aload_0         
	//   37   63:invokespecial   #120 <Method void initScrollView()>
		context = ((Context) (context.obtainStyledAttributes(attributeset, SCROLLVIEW_STYLEABLE, i, 0)));
	//   38   66:aload_1         
	//   39   67:aload_2         
	//   40   68:getstatic       #84  <Field int[] SCROLLVIEW_STYLEABLE>
	//   41   71:iload_3         
	//   42   72:iconst_0        
	//   43   73:invokevirtual   #126 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   44   76:astore_1        
		setFillViewport(((TypedArray) (context)).getBoolean(0, false));
	//   45   77:aload_0         
	//   46   78:aload_1         
	//   47   79:iconst_0        
	//   48   80:iconst_0        
	//   49   81:invokevirtual   #132 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   50   84:invokevirtual   #136 <Method void setFillViewport(boolean)>
		((TypedArray) (context)).recycle();
	//   51   87:aload_1         
	//   52   88:invokevirtual   #139 <Method void TypedArray.recycle()>
		mParentHelper = new NestedScrollingParentHelper(((ViewGroup) (this)));
	//   53   91:aload_0         
	//   54   92:new             #141 <Class NestedScrollingParentHelper>
	//   55   95:dup             
	//   56   96:aload_0         
	//   57   97:invokespecial   #144 <Method void NestedScrollingParentHelper(ViewGroup)>
	//   58  100:putfield        #146 <Field NestedScrollingParentHelper mParentHelper>
		mChildHelper = new NestedScrollingChildHelper(((View) (this)));
	//   59  103:aload_0         
	//   60  104:new             #148 <Class NestedScrollingChildHelper>
	//   61  107:dup             
	//   62  108:aload_0         
	//   63  109:invokespecial   #151 <Method void NestedScrollingChildHelper(View)>
	//   64  112:putfield        #153 <Field NestedScrollingChildHelper mChildHelper>
		setNestedScrollingEnabled(true);
	//   65  115:aload_0         
	//   66  116:iconst_1        
	//   67  117:invokevirtual   #156 <Method void setNestedScrollingEnabled(boolean)>
		ViewCompat.setAccessibilityDelegate(((View) (this)), ((AccessibilityDelegateCompat) (ACCESSIBILITY_DELEGATE)));
	//   68  120:aload_0         
	//   69  121:getstatic       #81  <Field NestedScrollView$AccessibilityDelegate ACCESSIBILITY_DELEGATE>
	//   70  124:invokestatic    #162 <Method void ViewCompat.setAccessibilityDelegate(View, AccessibilityDelegateCompat)>
	//   71  127:return          
	}

	private boolean canScroll()
	{
		int i = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #168 <Method int getChildCount()>
	//    2    4:istore_1        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		if(i > 0)
	//*   5    7:iload_1         
	//*   6    8:ifle            63
		{
			View view = getChildAt(0);
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #172 <Method View getChildAt(int)>
	//   10   16:astore_3        
			android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
	//   11   17:aload_3         
	//   12   18:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   13   21:checkcast       #180 <Class android.widget.FrameLayout$LayoutParams>
	//   14   24:astore          4
			if(view.getHeight() + layoutparams.topMargin + layoutparams.bottomMargin > getHeight() - getPaddingTop() - getPaddingBottom())
	//*  15   26:aload_3         
	//*  16   27:invokevirtual   #183 <Method int View.getHeight()>
	//*  17   30:aload           4
	//*  18   32:getfield        #186 <Field int android.widget.FrameLayout$LayoutParams.topMargin>
	//*  19   35:iadd            
	//*  20   36:aload           4
	//*  21   38:getfield        #189 <Field int android.widget.FrameLayout$LayoutParams.bottomMargin>
	//*  22   41:iadd            
	//*  23   42:aload_0         
	//*  24   43:invokevirtual   #190 <Method int getHeight()>
	//*  25   46:aload_0         
	//*  26   47:invokevirtual   #193 <Method int getPaddingTop()>
	//*  27   50:isub            
	//*  28   51:aload_0         
	//*  29   52:invokevirtual   #196 <Method int getPaddingBottom()>
	//*  30   55:isub            
	//*  31   56:icmple          61
				flag = true;
	//   32   59:iconst_1        
	//   33   60:istore_2        
			return flag;
	//   34   61:iload_2         
	//   35   62:ireturn         
		} else
		{
			return false;
	//   36   63:iconst_0        
	//   37   64:ireturn         
		}
	}

	private static int clamp(int i, int j, int k)
	{
		if(j < k && i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmpge          25
	//*   3    5:iload_0         
	//*   4    6:ifge            12
	//*   5    9:goto            25
		{
			if(j + i > k)
	//*   6   12:iload_1         
	//*   7   13:iload_0         
	//*   8   14:iadd            
	//*   9   15:iload_2         
	//*  10   16:icmple          23
				return k - j;
	//   11   19:iload_2         
	//   12   20:iload_1         
	//   13   21:isub            
	//   14   22:ireturn         
			else
				return i;
	//   15   23:iload_0         
	//   16   24:ireturn         
		} else
		{
			return 0;
	//   17   25:iconst_0        
	//   18   26:ireturn         
		}
	}

	private void doScrollY(int i)
	{
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            24
		{
			if(mSmoothScrollingEnabled)
	//*   2    4:aload_0         
	//*   3    5:getfield        #111 <Field boolean mSmoothScrollingEnabled>
	//*   4    8:ifeq            18
			{
				smoothScrollBy(0, i);
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:iload_1         
	//    8   14:invokevirtual   #204 <Method void smoothScrollBy(int, int)>
				return;
	//    9   17:return          
			}
			scrollBy(0, i);
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:iload_1         
	//   13   21:invokevirtual   #207 <Method void scrollBy(int, int)>
		}
	//   14   24:return          
	}

	private void endDrag()
	{
		mIsBeingDragged = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #109 <Field boolean mIsBeingDragged>
		recycleVelocityTracker();
	//    3    5:aload_0         
	//    4    6:invokespecial   #211 <Method void recycleVelocityTracker()>
		stopNestedScroll(0);
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #214 <Method void stopNestedScroll(int)>
		EdgeEffect edgeeffect = mEdgeGlowTop;
	//    8   14:aload_0         
	//    9   15:getfield        #216 <Field EdgeEffect mEdgeGlowTop>
	//   10   18:astore_1        
		if(edgeeffect != null)
	//*  11   19:aload_1         
	//*  12   20:ifnull          34
		{
			edgeeffect.onRelease();
	//   13   23:aload_1         
	//   14   24:invokevirtual   #221 <Method void EdgeEffect.onRelease()>
			mEdgeGlowBottom.onRelease();
	//   15   27:aload_0         
	//   16   28:getfield        #223 <Field EdgeEffect mEdgeGlowBottom>
	//   17   31:invokevirtual   #221 <Method void EdgeEffect.onRelease()>
		}
	//   18   34:return          
	}

	private void ensureGlows()
	{
		if(getOverScrollMode() != 2)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #227 <Method int getOverScrollMode()>
	//*   2    4:iconst_2        
	//*   3    5:icmpeq          45
		{
			if(mEdgeGlowTop == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #216 <Field EdgeEffect mEdgeGlowTop>
	//*   6   12:ifnonnull       55
			{
				Context context = getContext();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #231 <Method Context getContext()>
	//    9   19:astore_1        
				mEdgeGlowTop = new EdgeEffect(context);
	//   10   20:aload_0         
	//   11   21:new             #218 <Class EdgeEffect>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:invokespecial   #233 <Method void EdgeEffect(Context)>
	//   15   29:putfield        #216 <Field EdgeEffect mEdgeGlowTop>
				mEdgeGlowBottom = new EdgeEffect(context);
	//   16   32:aload_0         
	//   17   33:new             #218 <Class EdgeEffect>
	//   18   36:dup             
	//   19   37:aload_1         
	//   20   38:invokespecial   #233 <Method void EdgeEffect(Context)>
	//   21   41:putfield        #223 <Field EdgeEffect mEdgeGlowBottom>
				return;
	//   22   44:return          
			}
		} else
		{
			mEdgeGlowTop = null;
	//   23   45:aload_0         
	//   24   46:aconst_null     
	//   25   47:putfield        #216 <Field EdgeEffect mEdgeGlowTop>
			mEdgeGlowBottom = null;
	//   26   50:aload_0         
	//   27   51:aconst_null     
	//   28   52:putfield        #223 <Field EdgeEffect mEdgeGlowBottom>
		}
	//   29   55:return          
	}

	private View findFocusableViewInBounds(boolean flag, int i, int j)
	{
		java.util.ArrayList arraylist = getFocusables(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokevirtual   #239 <Method java.util.ArrayList getFocusables(int)>
	//    3    5:astore          14
		int i1 = ((List) (arraylist)).size();
	//    4    7:aload           14
	//    5    9:invokeinterface #244 <Method int List.size()>
	//    6   14:istore          9
		boolean flag3 = false;
	//    7   16:iconst_0        
	//    8   17:istore          7
		View view2 = null;
	//    9   19:aconst_null     
	//   10   20:astore          13
		for(int k = ((int) (flag3)); k < i1;)
	//*  11   22:iload           7
	//*  12   24:istore          6
	//*  13   26:iload           6
	//*  14   28:iload           9
	//*  15   30:icmpge          250
		{
			boolean flag2;
			View view;
label0:
			{
				View view1 = (View)((List) (arraylist)).get(k);
	//   16   33:aload           14
	//   17   35:iload           6
	//   18   37:invokeinterface #248 <Method Object List.get(int)>
	//   19   42:checkcast       #174 <Class View>
	//   20   45:astore          12
				int l = view1.getTop();
	//   21   47:aload           12
	//   22   49:invokevirtual   #251 <Method int View.getTop()>
	//   23   52:istore          8
				int j1 = view1.getBottom();
	//   24   54:aload           12
	//   25   56:invokevirtual   #254 <Method int View.getBottom()>
	//   26   59:istore          10
				view = view2;
	//   27   61:aload           13
	//   28   63:astore          11
				flag2 = flag3;
	//   29   65:iload           7
	//   30   67:istore          5
				if(i >= j1)
					break label0;
	//   31   69:iload_2         
	//   32   70:iload           10
	//   33   72:icmpge          233
				view = view2;
	//   34   75:aload           13
	//   35   77:astore          11
				flag2 = flag3;
	//   36   79:iload           7
	//   37   81:istore          5
				if(l >= j)
					break label0;
	//   38   83:iload           8
	//   39   85:iload_3         
	//   40   86:icmpge          233
				boolean flag1;
				if(i < l && j1 < j)
	//*  41   89:iload_2         
	//*  42   90:iload           8
	//*  43   92:icmpge          107
	//*  44   95:iload           10
	//*  45   97:iload_3         
	//*  46   98:icmpge          107
					flag1 = true;
	//   47  101:iconst_1        
	//   48  102:istore          4
				else
	//*  49  104:goto            110
					flag1 = false;
	//   50  107:iconst_0        
	//   51  108:istore          4
				if(view2 == null)
	//*  52  110:aload           13
	//*  53  112:ifnonnull       126
				{
					view = view1;
	//   54  115:aload           12
	//   55  117:astore          11
					flag2 = flag1;
	//   56  119:iload           4
	//   57  121:istore          5
					break label0;
	//   58  123:goto            233
				}
				if(flag && l < view2.getTop() || !flag && j1 > view2.getBottom())
	//*  59  126:iload_1         
	//*  60  127:ifeq            140
	//*  61  130:iload           8
	//*  62  132:aload           13
	//*  63  134:invokevirtual   #251 <Method int View.getTop()>
	//*  64  137:icmplt          154
	//*  65  140:iload_1         
	//*  66  141:ifne            160
	//*  67  144:iload           10
	//*  68  146:aload           13
	//*  69  148:invokevirtual   #254 <Method int View.getBottom()>
	//*  70  151:icmple          160
					l = 1;
	//   71  154:iconst_1        
	//   72  155:istore          8
				else
	//*  73  157:goto            163
					l = 0;
	//   74  160:iconst_0        
	//   75  161:istore          8
				if(flag3)
	//*  76  163:iload           7
	//*  77  165:ifeq            197
				{
					view = view2;
	//   78  168:aload           13
	//   79  170:astore          11
					flag2 = flag3;
	//   80  172:iload           7
	//   81  174:istore          5
					if(!flag1)
						break label0;
	//   82  176:iload           4
	//   83  178:ifeq            233
					view = view2;
	//   84  181:aload           13
	//   85  183:astore          11
					flag2 = flag3;
	//   86  185:iload           7
	//   87  187:istore          5
					if(!l)
	//*  88  189:iload           8
	//*  89  191:ifeq            233
						break label0;
	//   90  194:goto            225
				} else
				{
					if(flag1)
	//*  91  197:iload           4
	//*  92  199:ifeq            212
					{
						view = view1;
	//   93  202:aload           12
	//   94  204:astore          11
						flag2 = true;
	//   95  206:iconst_1        
	//   96  207:istore          5
						break label0;
	//   97  209:goto            233
					}
					view = view2;
	//   98  212:aload           13
	//   99  214:astore          11
					flag2 = flag3;
	//  100  216:iload           7
	//  101  218:istore          5
					if(!l)
						break label0;
	//  102  220:iload           8
	//  103  222:ifeq            233
				}
				view = view1;
	//  104  225:aload           12
	//  105  227:astore          11
				flag2 = flag3;
	//  106  229:iload           7
	//  107  231:istore          5
			}
			k++;
	//  108  233:iload           6
	//  109  235:iconst_1        
	//  110  236:iadd            
	//  111  237:istore          6
			view2 = view;
	//  112  239:aload           11
	//  113  241:astore          13
			flag3 = flag2;
	//  114  243:iload           5
	//  115  245:istore          7
		}

	//* 116  247:goto            26
		return view2;
	//  117  250:aload           13
	//  118  252:areturn         
	}

	private void flingWithNestedDispatch(int i)
	{
		int j = getScrollY();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #258 <Method int getScrollY()>
	//    2    4:istore_3        
		boolean flag;
		if(j <= 0 && i <= 0 || j >= getScrollRange() && i >= 0)
	//*   3    5:iload_3         
	//*   4    6:ifgt            13
	//*   5    9:iload_1         
	//*   6   10:ifle            28
	//*   7   13:iload_3         
	//*   8   14:aload_0         
	//*   9   15:invokevirtual   #261 <Method int getScrollRange()>
	//*  10   18:icmplt          34
	//*  11   21:iload_1         
	//*  12   22:ifge            28
	//*  13   25:goto            34
			flag = false;
	//   14   28:iconst_0        
	//   15   29:istore          4
		else
	//*  16   31:goto            37
			flag = true;
	//   17   34:iconst_1        
	//   18   35:istore          4
		float f = i;
	//   19   37:iload_1         
	//   20   38:i2f             
	//   21   39:fstore_2        
		if(!dispatchNestedPreFling(0.0F, f))
	//*  22   40:aload_0         
	//*  23   41:fconst_0        
	//*  24   42:fload_2         
	//*  25   43:invokevirtual   #265 <Method boolean dispatchNestedPreFling(float, float)>
	//*  26   46:ifne            63
		{
			dispatchNestedFling(0.0F, f, flag);
	//   27   49:aload_0         
	//   28   50:fconst_0        
	//   29   51:fload_2         
	//   30   52:iload           4
	//   31   54:invokevirtual   #269 <Method boolean dispatchNestedFling(float, float, boolean)>
	//   32   57:pop             
			fling(i);
	//   33   58:aload_0         
	//   34   59:iload_1         
	//   35   60:invokevirtual   #272 <Method void fling(int)>
		}
	//   36   63:return          
	}

	private float getVerticalScrollFactorCompat()
	{
		if(mVerticalScrollFactor == 0.0F)
	//*   0    0:aload_0         
	//*   1    1:getfield        #276 <Field float mVerticalScrollFactor>
	//*   2    4:fconst_0        
	//*   3    5:fcmpl           
	//*   4    6:ifne            66
		{
			TypedValue typedvalue = new TypedValue();
	//    5    9:new             #278 <Class TypedValue>
	//    6   12:dup             
	//    7   13:invokespecial   #279 <Method void TypedValue()>
	//    8   16:astore_1        
			Context context = getContext();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #231 <Method Context getContext()>
	//   11   21:astore_2        
			if(context.getTheme().resolveAttribute(0x101004d, typedvalue, true))
	//*  12   22:aload_2         
	//*  13   23:invokevirtual   #283 <Method android.content.res.Resources$Theme Context.getTheme()>
	//*  14   26:ldc2            #284 <Int 0x101004d>
	//*  15   29:aload_1         
	//*  16   30:iconst_1        
	//*  17   31:invokevirtual   #290 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//*  18   34:ifeq            55
				mVerticalScrollFactor = typedvalue.getDimension(context.getResources().getDisplayMetrics());
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:aload_2         
	//   22   40:invokevirtual   #294 <Method Resources Context.getResources()>
	//   23   43:invokevirtual   #300 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   24   46:invokevirtual   #304 <Method float TypedValue.getDimension(android.util.DisplayMetrics)>
	//   25   49:putfield        #276 <Field float mVerticalScrollFactor>
			else
	//*  26   52:goto            66
				throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
	//   27   55:new             #306 <Class IllegalStateException>
	//   28   58:dup             
	//   29   59:ldc2            #308 <String "Expected theme to define listPreferredItemHeight.">
	//   30   62:invokespecial   #311 <Method void IllegalStateException(String)>
	//   31   65:athrow          
		}
		return mVerticalScrollFactor;
	//   32   66:aload_0         
	//   33   67:getfield        #276 <Field float mVerticalScrollFactor>
	//   34   70:freturn         
	}

	private boolean inChild(int i, int j)
	{
		int k = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #168 <Method int getChildCount()>
	//    2    4:istore_3        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore          5
		if(k > 0)
	//*   5    8:iload_3         
	//*   6    9:ifle            86
		{
			int l = getScrollY();
	//    7   12:aload_0         
	//    8   13:invokevirtual   #258 <Method int getScrollY()>
	//    9   16:istore_3        
			View view = getChildAt(0);
	//   10   17:aload_0         
	//   11   18:iconst_0        
	//   12   19:invokevirtual   #172 <Method View getChildAt(int)>
	//   13   22:astore          6
			boolean flag = flag1;
	//   14   24:iload           5
	//   15   26:istore          4
			if(j >= view.getTop() - l)
	//*  16   28:iload_2         
	//*  17   29:aload           6
	//*  18   31:invokevirtual   #251 <Method int View.getTop()>
	//*  19   34:iload_3         
	//*  20   35:isub            
	//*  21   36:icmplt          83
			{
				flag = flag1;
	//   22   39:iload           5
	//   23   41:istore          4
				if(j < view.getBottom() - l)
	//*  24   43:iload_2         
	//*  25   44:aload           6
	//*  26   46:invokevirtual   #254 <Method int View.getBottom()>
	//*  27   49:iload_3         
	//*  28   50:isub            
	//*  29   51:icmpge          83
				{
					flag = flag1;
	//   30   54:iload           5
	//   31   56:istore          4
					if(i >= view.getLeft())
	//*  32   58:iload_1         
	//*  33   59:aload           6
	//*  34   61:invokevirtual   #316 <Method int View.getLeft()>
	//*  35   64:icmplt          83
					{
						flag = flag1;
	//   36   67:iload           5
	//   37   69:istore          4
						if(i < view.getRight())
	//*  38   71:iload_1         
	//*  39   72:aload           6
	//*  40   74:invokevirtual   #319 <Method int View.getRight()>
	//*  41   77:icmpge          83
							flag = true;
	//   42   80:iconst_1        
	//   43   81:istore          4
					}
				}
			}
			return flag;
	//   44   83:iload           4
	//   45   85:ireturn         
		} else
		{
			return false;
	//   46   86:iconst_0        
	//   47   87:ireturn         
		}
	}

	private void initOrResetVelocityTracker()
	{
		VelocityTracker velocitytracker = mVelocityTracker;
	//    0    0:aload_0         
	//    1    1:getfield        #322 <Field VelocityTracker mVelocityTracker>
	//    2    4:astore_1        
		if(velocitytracker == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       17
		{
			mVelocityTracker = VelocityTracker.obtain();
	//    5    9:aload_0         
	//    6   10:invokestatic    #328 <Method VelocityTracker VelocityTracker.obtain()>
	//    7   13:putfield        #322 <Field VelocityTracker mVelocityTracker>
			return;
	//    8   16:return          
		} else
		{
			velocitytracker.clear();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #331 <Method void VelocityTracker.clear()>
			return;
	//   11   21:return          
		}
	}

	private void initScrollView()
	{
		mScroller = new OverScroller(getContext());
	//    0    0:aload_0         
	//    1    1:new             #333 <Class OverScroller>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokevirtual   #231 <Method Context getContext()>
	//    5    9:invokespecial   #334 <Method void OverScroller(Context)>
	//    6   12:putfield        #336 <Field OverScroller mScroller>
		setFocusable(true);
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:invokevirtual   #339 <Method void setFocusable(boolean)>
		setDescendantFocusability(0x40000);
	//   10   20:aload_0         
	//   11   21:ldc2            #340 <Int 0x40000>
	//   12   24:invokevirtual   #343 <Method void setDescendantFocusability(int)>
		setWillNotDraw(false);
	//   13   27:aload_0         
	//   14   28:iconst_0        
	//   15   29:invokevirtual   #346 <Method void setWillNotDraw(boolean)>
		ViewConfiguration viewconfiguration = ViewConfiguration.get(getContext());
	//   16   32:aload_0         
	//   17   33:invokevirtual   #231 <Method Context getContext()>
	//   18   36:invokestatic    #351 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   19   39:astore_1        
		mTouchSlop = viewconfiguration.getScaledTouchSlop();
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:invokevirtual   #354 <Method int ViewConfiguration.getScaledTouchSlop()>
	//   23   45:putfield        #356 <Field int mTouchSlop>
		mMinimumVelocity = viewconfiguration.getScaledMinimumFlingVelocity();
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:invokevirtual   #359 <Method int ViewConfiguration.getScaledMinimumFlingVelocity()>
	//   27   53:putfield        #361 <Field int mMinimumVelocity>
		mMaximumVelocity = viewconfiguration.getScaledMaximumFlingVelocity();
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:invokevirtual   #364 <Method int ViewConfiguration.getScaledMaximumFlingVelocity()>
	//   31   61:putfield        #366 <Field int mMaximumVelocity>
	//   32   64:return          
	}

	private void initVelocityTrackerIfNotExists()
	{
		if(mVelocityTracker == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #322 <Field VelocityTracker mVelocityTracker>
	//*   2    4:ifnonnull       14
			mVelocityTracker = VelocityTracker.obtain();
	//    3    7:aload_0         
	//    4    8:invokestatic    #328 <Method VelocityTracker VelocityTracker.obtain()>
	//    5   11:putfield        #322 <Field VelocityTracker mVelocityTracker>
	//    6   14:return          
	}

	private boolean isOffScreen(View view)
	{
		return isWithinDeltaOfScreen(view, 0, getHeight()) ^ true;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_0         
	//    4    4:invokevirtual   #190 <Method int getHeight()>
	//    5    7:invokespecial   #373 <Method boolean isWithinDeltaOfScreen(View, int, int)>
	//    6   10:iconst_1        
	//    7   11:ixor            
	//    8   12:ireturn         
	}

	private static boolean isViewDescendantOf(View view, View view1)
	{
		if(view == view1)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		view = ((View) (view.getParent()));
	//    5    7:aload_0         
	//    6    8:invokevirtual   #379 <Method ViewParent View.getParent()>
	//    7   11:astore_0        
		return (view instanceof ViewGroup) && isViewDescendantOf((View)view, view1);
	//    8   12:aload_0         
	//    9   13:instanceof      #381 <Class ViewGroup>
	//   10   16:ifeq            32
	//   11   19:aload_0         
	//   12   20:checkcast       #174 <Class View>
	//   13   23:aload_1         
	//   14   24:invokestatic    #383 <Method boolean isViewDescendantOf(View, View)>
	//   15   27:ifeq            32
	//   16   30:iconst_1        
	//   17   31:ireturn         
	//   18   32:iconst_0        
	//   19   33:ireturn         
	}

	private boolean isWithinDeltaOfScreen(View view, int i, int j)
	{
		view.getDrawingRect(mTempRect);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #101 <Field Rect mTempRect>
	//    3    5:invokevirtual   #387 <Method void View.getDrawingRect(Rect)>
		offsetDescendantRectToMyCoords(view, mTempRect);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #101 <Field Rect mTempRect>
	//    8   14:invokevirtual   #391 <Method void offsetDescendantRectToMyCoords(View, Rect)>
		return mTempRect.bottom + i >= getScrollY() && mTempRect.top - i <= getScrollY() + j;
	//    9   17:aload_0         
	//   10   18:getfield        #101 <Field Rect mTempRect>
	//   11   21:getfield        #394 <Field int Rect.bottom>
	//   12   24:iload_2         
	//   13   25:iadd            
	//   14   26:aload_0         
	//   15   27:invokevirtual   #258 <Method int getScrollY()>
	//   16   30:icmplt          53
	//   17   33:aload_0         
	//   18   34:getfield        #101 <Field Rect mTempRect>
	//   19   37:getfield        #397 <Field int Rect.top>
	//   20   40:iload_2         
	//   21   41:isub            
	//   22   42:aload_0         
	//   23   43:invokevirtual   #258 <Method int getScrollY()>
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
	//    1    1:invokevirtual   #404 <Method int MotionEvent.getActionIndex()>
	//    2    4:istore_2        
		if(motionevent.getPointerId(i) == mActivePointerId)
	//*   3    5:aload_1         
	//*   4    6:iload_2         
	//*   5    7:invokevirtual   #408 <Method int MotionEvent.getPointerId(int)>
	//*   6   10:aload_0         
	//*   7   11:getfield        #113 <Field int mActivePointerId>
	//*   8   14:icmpne          60
		{
			if(i == 0)
	//*   9   17:iload_2         
	//*  10   18:ifne            26
				i = 1;
	//   11   21:iconst_1        
	//   12   22:istore_2        
			else
	//*  13   23:goto            28
				i = 0;
	//   14   26:iconst_0        
	//   15   27:istore_2        
			mLastMotionY = (int)motionevent.getY(i);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:iload_2         
	//   19   31:invokevirtual   #412 <Method float MotionEvent.getY(int)>
	//   20   34:f2i             
	//   21   35:putfield        #414 <Field int mLastMotionY>
			mActivePointerId = motionevent.getPointerId(i);
	//   22   38:aload_0         
	//   23   39:aload_1         
	//   24   40:iload_2         
	//   25   41:invokevirtual   #408 <Method int MotionEvent.getPointerId(int)>
	//   26   44:putfield        #113 <Field int mActivePointerId>
			motionevent = ((MotionEvent) (mVelocityTracker));
	//   27   47:aload_0         
	//   28   48:getfield        #322 <Field VelocityTracker mVelocityTracker>
	//   29   51:astore_1        
			if(motionevent != null)
	//*  30   52:aload_1         
	//*  31   53:ifnull          60
				((VelocityTracker) (motionevent)).clear();
	//   32   56:aload_1         
	//   33   57:invokevirtual   #331 <Method void VelocityTracker.clear()>
		}
	//   34   60:return          
	}

	private void recycleVelocityTracker()
	{
		VelocityTracker velocitytracker = mVelocityTracker;
	//    0    0:aload_0         
	//    1    1:getfield        #322 <Field VelocityTracker mVelocityTracker>
	//    2    4:astore_1        
		if(velocitytracker != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
		{
			velocitytracker.recycle();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #415 <Method void VelocityTracker.recycle()>
			mVelocityTracker = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #322 <Field VelocityTracker mVelocityTracker>
		}
	//   10   18:return          
	}

	private boolean scrollAndFocus(int i, int j, int k)
	{
		int i1 = getHeight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #190 <Method int getHeight()>
	//    2    4:istore          5
		int l = getScrollY();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #258 <Method int getScrollY()>
	//    5   10:istore          4
		i1 += l;
	//    6   12:iload           5
	//    7   14:iload           4
	//    8   16:iadd            
	//    9   17:istore          5
		boolean flag1 = false;
	//   10   19:iconst_0        
	//   11   20:istore          7
		boolean flag;
		if(i == 33)
	//*  12   22:iload_1         
	//*  13   23:bipush          33
	//*  14   25:icmpne          34
			flag = true;
	//   15   28:iconst_1        
	//   16   29:istore          6
		else
	//*  17   31:goto            37
			flag = false;
	//   18   34:iconst_0        
	//   19   35:istore          6
		View view = findFocusableViewInBounds(flag, j, k);
	//   20   37:aload_0         
	//   21   38:iload           6
	//   22   40:iload_2         
	//   23   41:iload_3         
	//   24   42:invokespecial   #419 <Method View findFocusableViewInBounds(boolean, int, int)>
	//   25   45:astore          9
		Object obj = ((Object) (view));
	//   26   47:aload           9
	//   27   49:astore          8
		if(view == null)
	//*  28   51:aload           9
	//*  29   53:ifnonnull       59
			obj = ((Object) (this));
	//   30   56:aload_0         
	//   31   57:astore          8
		if(j >= l && k <= i1)
	//*  32   59:iload_2         
	//*  33   60:iload           4
	//*  34   62:icmplt          78
	//*  35   65:iload_3         
	//*  36   66:iload           5
	//*  37   68:icmpgt          78
		{
			flag = flag1;
	//   38   71:iload           7
	//   39   73:istore          6
		} else
	//*  40   75:goto            104
		{
			if(flag)
	//*  41   78:iload           6
	//*  42   80:ifeq            91
				j -= l;
	//   43   83:iload_2         
	//   44   84:iload           4
	//   45   86:isub            
	//   46   87:istore_2        
			else
	//*  47   88:goto            96
				j = k - i1;
	//   48   91:iload_3         
	//   49   92:iload           5
	//   50   94:isub            
	//   51   95:istore_2        
			doScrollY(j);
	//   52   96:aload_0         
	//   53   97:iload_2         
	//   54   98:invokespecial   #421 <Method void doScrollY(int)>
			flag = true;
	//   55  101:iconst_1        
	//   56  102:istore          6
		}
		if(obj != findFocus())
	//*  57  104:aload           8
	//*  58  106:aload_0         
	//*  59  107:invokevirtual   #425 <Method View findFocus()>
	//*  60  110:if_acmpeq       120
			((View) (obj)).requestFocus(i);
	//   61  113:aload           8
	//   62  115:iload_1         
	//   63  116:invokevirtual   #429 <Method boolean View.requestFocus(int)>
	//   64  119:pop             
		return flag;
	//   65  120:iload           6
	//   66  122:ireturn         
	}

	private void scrollToChild(View view)
	{
		view.getDrawingRect(mTempRect);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #101 <Field Rect mTempRect>
	//    3    5:invokevirtual   #387 <Method void View.getDrawingRect(Rect)>
		offsetDescendantRectToMyCoords(view, mTempRect);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #101 <Field Rect mTempRect>
	//    8   14:invokevirtual   #391 <Method void offsetDescendantRectToMyCoords(View, Rect)>
		int i = computeScrollDeltaToGetChildRectOnScreen(mTempRect);
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #101 <Field Rect mTempRect>
	//   12   22:invokevirtual   #434 <Method int computeScrollDeltaToGetChildRectOnScreen(Rect)>
	//   13   25:istore_2        
		if(i != 0)
	//*  14   26:iload_2         
	//*  15   27:ifeq            36
			scrollBy(0, i);
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:iload_2         
	//   19   33:invokevirtual   #207 <Method void scrollBy(int, int)>
	//   20   36:return          
	}

	private boolean scrollToChildRect(Rect rect, boolean flag)
	{
		int i = computeScrollDeltaToGetChildRectOnScreen(rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #434 <Method int computeScrollDeltaToGetChildRectOnScreen(Rect)>
	//    3    5:istore_3        
		boolean flag1;
		if(i != 0)
	//*   4    6:iload_3         
	//*   5    7:ifeq            16
			flag1 = true;
	//    6   10:iconst_1        
	//    7   11:istore          4
		else
	//*   8   13:goto            19
			flag1 = false;
	//    9   16:iconst_0        
	//   10   17:istore          4
		if(flag1)
	//*  11   19:iload           4
	//*  12   21:ifeq            43
		{
			if(flag)
	//*  13   24:iload_2         
	//*  14   25:ifeq            37
			{
				scrollBy(0, i);
	//   15   28:aload_0         
	//   16   29:iconst_0        
	//   17   30:iload_3         
	//   18   31:invokevirtual   #207 <Method void scrollBy(int, int)>
				return flag1;
	//   19   34:iload           4
	//   20   36:ireturn         
			}
			smoothScrollBy(0, i);
	//   21   37:aload_0         
	//   22   38:iconst_0        
	//   23   39:iload_3         
	//   24   40:invokevirtual   #204 <Method void smoothScrollBy(int, int)>
		}
		return flag1;
	//   25   43:iload           4
	//   26   45:ireturn         
	}

	public void addView(View view)
	{
		if(getChildCount() <= 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #168 <Method int getChildCount()>
	//*   2    4:ifgt            13
		{
			super.addView(view);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #439 <Method void FrameLayout.addView(View)>
			return;
	//    6   12:return          
		} else
		{
			throw new IllegalStateException("ScrollView can host only one direct child");
	//    7   13:new             #306 <Class IllegalStateException>
	//    8   16:dup             
	//    9   17:ldc2            #441 <String "ScrollView can host only one direct child">
	//   10   20:invokespecial   #311 <Method void IllegalStateException(String)>
	//   11   23:athrow          
		}
	}

	public void addView(View view, int i)
	{
		if(getChildCount() <= 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #168 <Method int getChildCount()>
	//*   2    4:ifgt            14
		{
			super.addView(view, i);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokespecial   #444 <Method void FrameLayout.addView(View, int)>
			return;
	//    7   13:return          
		} else
		{
			throw new IllegalStateException("ScrollView can host only one direct child");
	//    8   14:new             #306 <Class IllegalStateException>
	//    9   17:dup             
	//   10   18:ldc2            #441 <String "ScrollView can host only one direct child">
	//   11   21:invokespecial   #311 <Method void IllegalStateException(String)>
	//   12   24:athrow          
		}
	}

	public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(getChildCount() <= 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #168 <Method int getChildCount()>
	//*   2    4:ifgt            15
		{
			super.addView(view, i, layoutparams);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:aload_3         
	//    7   11:invokespecial   #447 <Method void FrameLayout.addView(View, int, android.view.ViewGroup$LayoutParams)>
			return;
	//    8   14:return          
		} else
		{
			throw new IllegalStateException("ScrollView can host only one direct child");
	//    9   15:new             #306 <Class IllegalStateException>
	//   10   18:dup             
	//   11   19:ldc2            #441 <String "ScrollView can host only one direct child">
	//   12   22:invokespecial   #311 <Method void IllegalStateException(String)>
	//   13   25:athrow          
		}
	}

	public void addView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(getChildCount() <= 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #168 <Method int getChildCount()>
	//*   2    4:ifgt            14
		{
			super.addView(view, layoutparams);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #450 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
			return;
	//    7   13:return          
		} else
		{
			throw new IllegalStateException("ScrollView can host only one direct child");
	//    8   14:new             #306 <Class IllegalStateException>
	//    9   17:dup             
	//   10   18:ldc2            #441 <String "ScrollView can host only one direct child">
	//   11   21:invokespecial   #311 <Method void IllegalStateException(String)>
	//   12   24:athrow          
		}
	}

	public boolean arrowScroll(int i)
	{
		View view1 = findFocus();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #425 <Method View findFocus()>
	//    2    4:astore          5
		View view = view1;
	//    3    6:aload           5
	//    4    8:astore          4
		if(view1 == this)
	//*   5   10:aload           5
	//*   6   12:aload_0         
	//*   7   13:if_acmpne       19
			view = null;
	//    8   16:aconst_null     
	//    9   17:astore          4
		view1 = FocusFinder.getInstance().findNextFocus(((ViewGroup) (this)), view, i);
	//   10   19:invokestatic    #457 <Method FocusFinder FocusFinder.getInstance()>
	//   11   22:aload_0         
	//   12   23:aload           4
	//   13   25:iload_1         
	//   14   26:invokevirtual   #461 <Method View FocusFinder.findNextFocus(ViewGroup, View, int)>
	//   15   29:astore          5
		int k = getMaxScrollAmount();
	//   16   31:aload_0         
	//   17   32:invokevirtual   #464 <Method int getMaxScrollAmount()>
	//   18   35:istore_3        
		if(view1 != null && isWithinDeltaOfScreen(view1, k, getHeight()))
	//*  19   36:aload           5
	//*  20   38:ifnull          96
	//*  21   41:aload_0         
	//*  22   42:aload           5
	//*  23   44:iload_3         
	//*  24   45:aload_0         
	//*  25   46:invokevirtual   #190 <Method int getHeight()>
	//*  26   49:invokespecial   #373 <Method boolean isWithinDeltaOfScreen(View, int, int)>
	//*  27   52:ifeq            96
		{
			view1.getDrawingRect(mTempRect);
	//   28   55:aload           5
	//   29   57:aload_0         
	//   30   58:getfield        #101 <Field Rect mTempRect>
	//   31   61:invokevirtual   #387 <Method void View.getDrawingRect(Rect)>
			offsetDescendantRectToMyCoords(view1, mTempRect);
	//   32   64:aload_0         
	//   33   65:aload           5
	//   34   67:aload_0         
	//   35   68:getfield        #101 <Field Rect mTempRect>
	//   36   71:invokevirtual   #391 <Method void offsetDescendantRectToMyCoords(View, Rect)>
			doScrollY(computeScrollDeltaToGetChildRectOnScreen(mTempRect));
	//   37   74:aload_0         
	//   38   75:aload_0         
	//   39   76:aload_0         
	//   40   77:getfield        #101 <Field Rect mTempRect>
	//   41   80:invokevirtual   #434 <Method int computeScrollDeltaToGetChildRectOnScreen(Rect)>
	//   42   83:invokespecial   #421 <Method void doScrollY(int)>
			view1.requestFocus(i);
	//   43   86:aload           5
	//   44   88:iload_1         
	//   45   89:invokevirtual   #429 <Method boolean View.requestFocus(int)>
	//   46   92:pop             
		} else
	//*  47   93:goto            208
		{
			int j;
			if(i == 33 && getScrollY() < k)
	//*  48   96:iload_1         
	//*  49   97:bipush          33
	//*  50   99:icmpne          118
	//*  51  102:aload_0         
	//*  52  103:invokevirtual   #258 <Method int getScrollY()>
	//*  53  106:iload_3         
	//*  54  107:icmpge          118
			{
				j = getScrollY();
	//   55  110:aload_0         
	//   56  111:invokevirtual   #258 <Method int getScrollY()>
	//   57  114:istore_2        
			} else
	//*  58  115:goto            184
			{
				j = k;
	//   59  118:iload_3         
	//   60  119:istore_2        
				if(i == 130)
	//*  61  120:iload_1         
	//*  62  121:sipush          130
	//*  63  124:icmpne          184
				{
					j = k;
	//   64  127:iload_3         
	//   65  128:istore_2        
					if(getChildCount() > 0)
	//*  66  129:aload_0         
	//*  67  130:invokevirtual   #168 <Method int getChildCount()>
	//*  68  133:ifle            184
					{
						View view2 = getChildAt(0);
	//   69  136:aload_0         
	//   70  137:iconst_0        
	//   71  138:invokevirtual   #172 <Method View getChildAt(int)>
	//   72  141:astore          5
						android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view2.getLayoutParams();
	//   73  143:aload           5
	//   74  145:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   75  148:checkcast       #180 <Class android.widget.FrameLayout$LayoutParams>
	//   76  151:astore          6
						j = Math.min((view2.getBottom() + layoutparams.bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), k);
	//   77  153:aload           5
	//   78  155:invokevirtual   #254 <Method int View.getBottom()>
	//   79  158:aload           6
	//   80  160:getfield        #189 <Field int android.widget.FrameLayout$LayoutParams.bottomMargin>
	//   81  163:iadd            
	//   82  164:aload_0         
	//   83  165:invokevirtual   #258 <Method int getScrollY()>
	//   84  168:aload_0         
	//   85  169:invokevirtual   #190 <Method int getHeight()>
	//   86  172:iadd            
	//   87  173:aload_0         
	//   88  174:invokevirtual   #196 <Method int getPaddingBottom()>
	//   89  177:isub            
	//   90  178:isub            
	//   91  179:iload_3         
	//   92  180:invokestatic    #470 <Method int Math.min(int, int)>
	//   93  183:istore_2        
					}
				}
			}
			if(j == 0)
	//*  94  184:iload_2         
	//*  95  185:ifne            190
				return false;
	//   96  188:iconst_0        
	//   97  189:ireturn         
			if(i != 130)
	//*  98  190:iload_1         
	//*  99  191:sipush          130
	//* 100  194:icmpne          200
	//* 101  197:goto            203
				j = -j;
	//  102  200:iload_2         
	//  103  201:ineg            
	//  104  202:istore_2        
			doScrollY(j);
	//  105  203:aload_0         
	//  106  204:iload_2         
	//  107  205:invokespecial   #421 <Method void doScrollY(int)>
		}
		if(view != null && view.isFocused() && isOffScreen(view))
	//* 108  208:aload           4
	//* 109  210:ifnull          252
	//* 110  213:aload           4
	//* 111  215:invokevirtual   #473 <Method boolean View.isFocused()>
	//* 112  218:ifeq            252
	//* 113  221:aload_0         
	//* 114  222:aload           4
	//* 115  224:invokespecial   #475 <Method boolean isOffScreen(View)>
	//* 116  227:ifeq            252
		{
			i = getDescendantFocusability();
	//  117  230:aload_0         
	//  118  231:invokevirtual   #478 <Method int getDescendantFocusability()>
	//  119  234:istore_1        
			setDescendantFocusability(0x20000);
	//  120  235:aload_0         
	//  121  236:ldc2            #479 <Int 0x20000>
	//  122  239:invokevirtual   #343 <Method void setDescendantFocusability(int)>
			requestFocus();
	//  123  242:aload_0         
	//  124  243:invokevirtual   #481 <Method boolean requestFocus()>
	//  125  246:pop             
			setDescendantFocusability(i);
	//  126  247:aload_0         
	//  127  248:iload_1         
	//  128  249:invokevirtual   #343 <Method void setDescendantFocusability(int)>
		}
		return true;
	//  129  252:iconst_1        
	//  130  253:ireturn         
	}

	public int computeHorizontalScrollExtent()
	{
		return super.computeHorizontalScrollExtent();
	//    0    0:aload_0         
	//    1    1:invokespecial   #488 <Method int FrameLayout.computeHorizontalScrollExtent()>
	//    2    4:ireturn         
	}

	public int computeHorizontalScrollOffset()
	{
		return super.computeHorizontalScrollOffset();
	//    0    0:aload_0         
	//    1    1:invokespecial   #492 <Method int FrameLayout.computeHorizontalScrollOffset()>
	//    2    4:ireturn         
	}

	public int computeHorizontalScrollRange()
	{
		return super.computeHorizontalScrollRange();
	//    0    0:aload_0         
	//    1    1:invokespecial   #495 <Method int FrameLayout.computeHorizontalScrollRange()>
	//    2    4:ireturn         
	}

	public void computeScroll()
	{
		if(mScroller.computeScrollOffset())
	//*   0    0:aload_0         
	//*   1    1:getfield        #336 <Field OverScroller mScroller>
	//*   2    4:invokevirtual   #499 <Method boolean OverScroller.computeScrollOffset()>
	//*   3    7:ifeq            218
		{
			mScroller.getCurrX();
	//    4   10:aload_0         
	//    5   11:getfield        #336 <Field OverScroller mScroller>
	//    6   14:invokevirtual   #502 <Method int OverScroller.getCurrX()>
	//    7   17:pop             
			int k = mScroller.getCurrY();
	//    8   18:aload_0         
	//    9   19:getfield        #336 <Field OverScroller mScroller>
	//   10   22:invokevirtual   #505 <Method int OverScroller.getCurrY()>
	//   11   25:istore_2        
			int i = k - mLastScrollerY;
	//   12   26:iload_2         
	//   13   27:aload_0         
	//   14   28:getfield        #507 <Field int mLastScrollerY>
	//   15   31:isub            
	//   16   32:istore_1        
			if(dispatchNestedPreScroll(0, i, mScrollConsumed, ((int []) (null)), 1))
	//*  17   33:aload_0         
	//*  18   34:iconst_0        
	//*  19   35:iload_1         
	//*  20   36:aload_0         
	//*  21   37:getfield        #117 <Field int[] mScrollConsumed>
	//*  22   40:aconst_null     
	//*  23   41:iconst_1        
	//*  24   42:invokevirtual   #511 <Method boolean dispatchNestedPreScroll(int, int, int[], int[], int)>
	//*  25   45:ifeq            60
				i -= mScrollConsumed[1];
	//   26   48:iload_1         
	//   27   49:aload_0         
	//   28   50:getfield        #117 <Field int[] mScrollConsumed>
	//   29   53:iconst_1        
	//   30   54:iaload          
	//   31   55:isub            
	//   32   56:istore_1        
	//*  33   57:goto            60
			if(i != 0)
	//*  34   60:iload_1         
	//*  35   61:ifeq            208
			{
				int l = getScrollRange();
	//   36   64:aload_0         
	//   37   65:invokevirtual   #261 <Method int getScrollRange()>
	//   38   68:istore_3        
				int i1 = getScrollY();
	//   39   69:aload_0         
	//   40   70:invokevirtual   #258 <Method int getScrollY()>
	//   41   73:istore          4
				overScrollByCompat(0, i, getScrollX(), i1, 0, l, 0, 0, false);
	//   42   75:aload_0         
	//   43   76:iconst_0        
	//   44   77:iload_1         
	//   45   78:aload_0         
	//   46   79:invokevirtual   #514 <Method int getScrollX()>
	//   47   82:iload           4
	//   48   84:iconst_0        
	//   49   85:iload_3         
	//   50   86:iconst_0        
	//   51   87:iconst_0        
	//   52   88:iconst_0        
	//   53   89:invokevirtual   #518 <Method boolean overScrollByCompat(int, int, int, int, int, int, int, int, boolean)>
	//   54   92:pop             
				int j1 = getScrollY() - i1;
	//   55   93:aload_0         
	//   56   94:invokevirtual   #258 <Method int getScrollY()>
	//   57   97:iload           4
	//   58   99:isub            
	//   59  100:istore          5
				if(!dispatchNestedScroll(0, j1, 0, i - j1, ((int []) (null)), 1))
	//*  60  102:aload_0         
	//*  61  103:iconst_0        
	//*  62  104:iload           5
	//*  63  106:iconst_0        
	//*  64  107:iload_1         
	//*  65  108:iload           5
	//*  66  110:isub            
	//*  67  111:aconst_null     
	//*  68  112:iconst_1        
	//*  69  113:invokevirtual   #522 <Method boolean dispatchNestedScroll(int, int, int, int, int[], int)>
	//*  70  116:ifne            208
				{
					int j = getOverScrollMode();
	//   71  119:aload_0         
	//   72  120:invokevirtual   #227 <Method int getOverScrollMode()>
	//   73  123:istore_1        
					boolean flag;
					if(j != 0 && (j != 1 || l <= 0))
	//*  74  124:iload_1         
	//*  75  125:ifeq            145
	//*  76  128:iload_1         
	//*  77  129:iconst_1        
	//*  78  130:icmpne          140
	//*  79  133:iload_3         
	//*  80  134:ifle            140
	//*  81  137:goto            145
						flag = false;
	//   82  140:iconst_0        
	//   83  141:istore_1        
					else
	//*  84  142:goto            147
						flag = true;
	//   85  145:iconst_1        
	//   86  146:istore_1        
					if(flag)
	//*  87  147:iload_1         
	//*  88  148:ifeq            208
					{
						ensureGlows();
	//   89  151:aload_0         
	//   90  152:invokespecial   #524 <Method void ensureGlows()>
						if(k <= 0 && i1 > 0)
	//*  91  155:iload_2         
	//*  92  156:ifgt            182
	//*  93  159:iload           4
	//*  94  161:ifle            182
							mEdgeGlowTop.onAbsorb((int)mScroller.getCurrVelocity());
	//   95  164:aload_0         
	//   96  165:getfield        #216 <Field EdgeEffect mEdgeGlowTop>
	//   97  168:aload_0         
	//   98  169:getfield        #336 <Field OverScroller mScroller>
	//   99  172:invokevirtual   #527 <Method float OverScroller.getCurrVelocity()>
	//  100  175:f2i             
	//  101  176:invokevirtual   #530 <Method void EdgeEffect.onAbsorb(int)>
						else
	//* 102  179:goto            208
						if(k >= l && i1 < l)
	//* 103  182:iload_2         
	//* 104  183:iload_3         
	//* 105  184:icmplt          208
	//* 106  187:iload           4
	//* 107  189:iload_3         
	//* 108  190:icmpge          208
							mEdgeGlowBottom.onAbsorb((int)mScroller.getCurrVelocity());
	//  109  193:aload_0         
	//  110  194:getfield        #223 <Field EdgeEffect mEdgeGlowBottom>
	//  111  197:aload_0         
	//  112  198:getfield        #336 <Field OverScroller mScroller>
	//  113  201:invokevirtual   #527 <Method float OverScroller.getCurrVelocity()>
	//  114  204:f2i             
	//  115  205:invokevirtual   #530 <Method void EdgeEffect.onAbsorb(int)>
					}
				}
			}
			mLastScrollerY = k;
	//  116  208:aload_0         
	//  117  209:iload_2         
	//  118  210:putfield        #507 <Field int mLastScrollerY>
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//  119  213:aload_0         
	//  120  214:invokestatic    #533 <Method void ViewCompat.postInvalidateOnAnimation(View)>
			return;
	//  121  217:return          
		}
		if(hasNestedScrollingParent(1))
	//* 122  218:aload_0         
	//* 123  219:iconst_1        
	//* 124  220:invokevirtual   #536 <Method boolean hasNestedScrollingParent(int)>
	//* 125  223:ifeq            234
			stopNestedScroll(1);
	//  126  226:aload_0         
	//  127  227:iconst_1        
	//  128  228:invokevirtual   #214 <Method void stopNestedScroll(int)>
	//* 129  231:goto            234
		mLastScrollerY = 0;
	//  130  234:aload_0         
	//  131  235:iconst_0        
	//  132  236:putfield        #507 <Field int mLastScrollerY>
	//  133  239:return          
	}

	protected int computeScrollDeltaToGetChildRectOnScreen(Rect rect)
	{
		int i = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #168 <Method int getChildCount()>
	//    2    4:istore_2        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore          5
		if(i == 0)
	//*   5    8:iload_2         
	//*   6    9:ifne            14
			return 0;
	//    7   12:iconst_0        
	//    8   13:ireturn         
		int l = getHeight();
	//    9   14:aload_0         
	//   10   15:invokevirtual   #190 <Method int getHeight()>
	//   11   18:istore          6
		int j = getScrollY();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #258 <Method int getScrollY()>
	//   14   24:istore_3        
		int k = j + l;
	//   15   25:iload_3         
	//   16   26:iload           6
	//   17   28:iadd            
	//   18   29:istore          4
		int i1 = getVerticalFadingEdgeLength();
	//   19   31:aload_0         
	//   20   32:invokevirtual   #539 <Method int getVerticalFadingEdgeLength()>
	//   21   35:istore          7
		i = j;
	//   22   37:iload_3         
	//   23   38:istore_2        
		if(rect.top > 0)
	//*  24   39:aload_1         
	//*  25   40:getfield        #397 <Field int Rect.top>
	//*  26   43:ifle            51
			i = j + i1;
	//   27   46:iload_3         
	//   28   47:iload           7
	//   29   49:iadd            
	//   30   50:istore_2        
		View view = getChildAt(0);
	//   31   51:aload_0         
	//   32   52:iconst_0        
	//   33   53:invokevirtual   #172 <Method View getChildAt(int)>
	//   34   56:astore          8
		android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
	//   35   58:aload           8
	//   36   60:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   37   63:checkcast       #180 <Class android.widget.FrameLayout$LayoutParams>
	//   38   66:astore          9
		if(rect.bottom < view.getHeight() + layoutparams.topMargin + layoutparams.bottomMargin)
	//*  39   68:aload_1         
	//*  40   69:getfield        #394 <Field int Rect.bottom>
	//*  41   72:aload           8
	//*  42   74:invokevirtual   #183 <Method int View.getHeight()>
	//*  43   77:aload           9
	//*  44   79:getfield        #186 <Field int android.widget.FrameLayout$LayoutParams.topMargin>
	//*  45   82:iadd            
	//*  46   83:aload           9
	//*  47   85:getfield        #189 <Field int android.widget.FrameLayout$LayoutParams.bottomMargin>
	//*  48   88:iadd            
	//*  49   89:icmpge          101
			j = k - i1;
	//   50   92:iload           4
	//   51   94:iload           7
	//   52   96:isub            
	//   53   97:istore_3        
		else
	//*  54   98:goto            104
			j = k;
	//   55  101:iload           4
	//   56  103:istore_3        
		if(rect.bottom > j && rect.top > i)
	//*  57  104:aload_1         
	//*  58  105:getfield        #394 <Field int Rect.bottom>
	//*  59  108:iload_3         
	//*  60  109:icmple          169
	//*  61  112:aload_1         
	//*  62  113:getfield        #397 <Field int Rect.top>
	//*  63  116:iload_2         
	//*  64  117:icmple          169
		{
			if(rect.height() > l)
	//*  65  120:aload_1         
	//*  66  121:invokevirtual   #542 <Method int Rect.height()>
	//*  67  124:iload           6
	//*  68  126:icmple          141
				i = (rect.top - i) + 0;
	//   69  129:aload_1         
	//   70  130:getfield        #397 <Field int Rect.top>
	//   71  133:iload_2         
	//   72  134:isub            
	//   73  135:iconst_0        
	//   74  136:iadd            
	//   75  137:istore_2        
			else
	//*  76  138:goto            150
				i = (rect.bottom - j) + 0;
	//   77  141:aload_1         
	//   78  142:getfield        #394 <Field int Rect.bottom>
	//   79  145:iload_3         
	//   80  146:isub            
	//   81  147:iconst_0        
	//   82  148:iadd            
	//   83  149:istore_2        
			return Math.min(i, (view.getBottom() + layoutparams.bottomMargin) - k);
	//   84  150:iload_2         
	//   85  151:aload           8
	//   86  153:invokevirtual   #254 <Method int View.getBottom()>
	//   87  156:aload           9
	//   88  158:getfield        #189 <Field int android.widget.FrameLayout$LayoutParams.bottomMargin>
	//   89  161:iadd            
	//   90  162:iload           4
	//   91  164:isub            
	//   92  165:invokestatic    #470 <Method int Math.min(int, int)>
	//   93  168:ireturn         
		}
		k = ((int) (flag));
	//   94  169:iload           5
	//   95  171:istore          4
		if(rect.top < i)
	//*  96  173:aload_1         
	//*  97  174:getfield        #397 <Field int Rect.top>
	//*  98  177:iload_2         
	//*  99  178:icmpge          234
		{
			k = ((int) (flag));
	//  100  181:iload           5
	//  101  183:istore          4
			if(rect.bottom < j)
	//* 102  185:aload_1         
	//* 103  186:getfield        #394 <Field int Rect.bottom>
	//* 104  189:iload_3         
	//* 105  190:icmpge          234
			{
				if(rect.height() > l)
	//* 106  193:aload_1         
	//* 107  194:invokevirtual   #542 <Method int Rect.height()>
	//* 108  197:iload           6
	//* 109  199:icmple          214
					i = 0 - (j - rect.bottom);
	//  110  202:iconst_0        
	//  111  203:iload_3         
	//  112  204:aload_1         
	//  113  205:getfield        #394 <Field int Rect.bottom>
	//  114  208:isub            
	//  115  209:isub            
	//  116  210:istore_2        
				else
	//* 117  211:goto            223
					i = 0 - (i - rect.top);
	//  118  214:iconst_0        
	//  119  215:iload_2         
	//  120  216:aload_1         
	//  121  217:getfield        #397 <Field int Rect.top>
	//  122  220:isub            
	//  123  221:isub            
	//  124  222:istore_2        
				k = Math.max(i, -getScrollY());
	//  125  223:iload_2         
	//  126  224:aload_0         
	//  127  225:invokevirtual   #258 <Method int getScrollY()>
	//  128  228:ineg            
	//  129  229:invokestatic    #545 <Method int Math.max(int, int)>
	//  130  232:istore          4
			}
		}
		return k;
	//  131  234:iload           4
	//  132  236:ireturn         
	}

	public int computeVerticalScrollExtent()
	{
		return super.computeVerticalScrollExtent();
	//    0    0:aload_0         
	//    1    1:invokespecial   #548 <Method int FrameLayout.computeVerticalScrollExtent()>
	//    2    4:ireturn         
	}

	public int computeVerticalScrollOffset()
	{
		return Math.max(0, super.computeVerticalScrollOffset());
	//    0    0:iconst_0        
	//    1    1:aload_0         
	//    2    2:invokespecial   #551 <Method int FrameLayout.computeVerticalScrollOffset()>
	//    3    5:invokestatic    #545 <Method int Math.max(int, int)>
	//    4    8:ireturn         
	}

	public int computeVerticalScrollRange()
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #168 <Method int getChildCount()>
	//    2    4:istore_2        
		int i = getHeight() - getPaddingBottom() - getPaddingTop();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #190 <Method int getHeight()>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #196 <Method int getPaddingBottom()>
	//    7   13:isub            
	//    8   14:aload_0         
	//    9   15:invokevirtual   #193 <Method int getPaddingTop()>
	//   10   18:isub            
	//   11   19:istore_1        
		if(j == 0)
	//*  12   20:iload_2         
	//*  13   21:ifne            26
			return i;
	//   14   24:iload_1         
	//   15   25:ireturn         
		View view = getChildAt(0);
	//   16   26:aload_0         
	//   17   27:iconst_0        
	//   18   28:invokevirtual   #172 <Method View getChildAt(int)>
	//   19   31:astore          5
		android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
	//   20   33:aload           5
	//   21   35:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   22   38:checkcast       #180 <Class android.widget.FrameLayout$LayoutParams>
	//   23   41:astore          6
		j = view.getBottom() + layoutparams.bottomMargin;
	//   24   43:aload           5
	//   25   45:invokevirtual   #254 <Method int View.getBottom()>
	//   26   48:aload           6
	//   27   50:getfield        #189 <Field int android.widget.FrameLayout$LayoutParams.bottomMargin>
	//   28   53:iadd            
	//   29   54:istore_2        
		int k = getScrollY();
	//   30   55:aload_0         
	//   31   56:invokevirtual   #258 <Method int getScrollY()>
	//   32   59:istore_3        
		int l = Math.max(0, j - i);
	//   33   60:iconst_0        
	//   34   61:iload_2         
	//   35   62:iload_1         
	//   36   63:isub            
	//   37   64:invokestatic    #545 <Method int Math.max(int, int)>
	//   38   67:istore          4
		if(k < 0)
	//*  39   69:iload_3         
	//*  40   70:ifge            77
			return j - k;
	//   41   73:iload_2         
	//   42   74:iload_3         
	//   43   75:isub            
	//   44   76:ireturn         
		i = j;
	//   45   77:iload_2         
	//   46   78:istore_1        
		if(k > l)
	//*  47   79:iload_3         
	//*  48   80:iload           4
	//*  49   82:icmple          92
			i = j + (k - l);
	//   50   85:iload_2         
	//   51   86:iload_3         
	//   52   87:iload           4
	//   53   89:isub            
	//   54   90:iadd            
	//   55   91:istore_1        
		return i;
	//   56   92:iload_1         
	//   57   93:ireturn         
	}

	public boolean dispatchKeyEvent(KeyEvent keyevent)
	{
		return super.dispatchKeyEvent(keyevent) || executeKeyEvent(keyevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #556 <Method boolean FrameLayout.dispatchKeyEvent(KeyEvent)>
	//    3    5:ifne            21
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #559 <Method boolean executeKeyEvent(KeyEvent)>
	//    7   13:ifeq            19
	//    8   16:goto            21
	//    9   19:iconst_0        
	//   10   20:ireturn         
	//   11   21:iconst_1        
	//   12   22:ireturn         
	}

	public boolean dispatchNestedFling(float f, float f1, boolean flag)
	{
		return mChildHelper.dispatchNestedFling(f, f1, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #560 <Method boolean NestedScrollingChildHelper.dispatchNestedFling(float, float, boolean)>
	//    6   10:ireturn         
	}

	public boolean dispatchNestedPreFling(float f, float f1)
	{
		return mChildHelper.dispatchNestedPreFling(f, f1);
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokevirtual   #561 <Method boolean NestedScrollingChildHelper.dispatchNestedPreFling(float, float)>
	//    5    9:ireturn         
	}

	public boolean dispatchNestedPreScroll(int i, int j, int ai[], int ai1[])
	{
		return dispatchNestedPreScroll(i, j, ai, ai1, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iconst_0        
	//    6    7:invokevirtual   #511 <Method boolean dispatchNestedPreScroll(int, int, int[], int[], int)>
	//    7   10:ireturn         
	}

	public boolean dispatchNestedPreScroll(int i, int j, int ai[], int ai1[], int k)
	{
		return mChildHelper.dispatchNestedPreScroll(i, j, ai, ai1, k);
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:iload           5
	//    7   11:invokevirtual   #563 <Method boolean NestedScrollingChildHelper.dispatchNestedPreScroll(int, int, int[], int[], int)>
	//    8   14:ireturn         
	}

	public boolean dispatchNestedScroll(int i, int j, int k, int l, int ai[])
	{
		return dispatchNestedScroll(i, j, k, l, ai, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:iconst_0        
	//    7    9:invokevirtual   #522 <Method boolean dispatchNestedScroll(int, int, int, int, int[], int)>
	//    8   12:ireturn         
	}

	public boolean dispatchNestedScroll(int i, int j, int k, int l, int ai[], int i1)
	{
		return mChildHelper.dispatchNestedScroll(i, j, k, l, ai, i1);
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:aload           5
	//    7   11:iload           6
	//    8   13:invokevirtual   #565 <Method boolean NestedScrollingChildHelper.dispatchNestedScroll(int, int, int, int, int[], int)>
	//    9   16:ireturn         
	}

	public void draw(Canvas canvas)
	{
label0:
		{
			int j;
			int l;
			int k2;
			int i3;
			int l3;
label1:
			{
				super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #569 <Method void FrameLayout.draw(Canvas)>
				if(mEdgeGlowTop == null)
					break label0;
	//    3    5:aload_0         
	//    4    6:getfield        #216 <Field EdgeEffect mEdgeGlowTop>
	//    5    9:ifnull          385
				int j3 = getScrollY();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #258 <Method int getScrollY()>
	//    8   16:istore          9
				boolean flag1 = mEdgeGlowTop.isFinished();
	//    9   18:aload_0         
	//   10   19:getfield        #216 <Field EdgeEffect mEdgeGlowTop>
	//   11   22:invokevirtual   #572 <Method boolean EdgeEffect.isFinished()>
	//   12   25:istore          11
				boolean flag = false;
	//   13   27:iconst_0        
	//   14   28:istore          6
				if(!flag1)
	//*  15   30:iload           11
	//*  16   32:ifne            196
				{
					int k3 = canvas.save();
	//   17   35:aload_1         
	//   18   36:invokevirtual   #577 <Method int Canvas.save()>
	//   19   39:istore          10
					int i = getWidth();
	//   20   41:aload_0         
	//   21   42:invokevirtual   #580 <Method int getWidth()>
	//   22   45:istore_2        
					int l2 = getHeight();
	//   23   46:aload_0         
	//   24   47:invokevirtual   #190 <Method int getHeight()>
	//   25   50:istore          8
					int j2 = Math.min(0, j3);
	//   26   52:iconst_0        
	//   27   53:iload           9
	//   28   55:invokestatic    #470 <Method int Math.min(int, int)>
	//   29   58:istore          7
					int k;
					if(android.os.Build.VERSION.SDK_INT >= 21 && !getClipToPadding())
	//*  30   60:getstatic       #585 <Field int android.os.Build$VERSION.SDK_INT>
	//*  31   63:bipush          21
	//*  32   65:icmplt          83
	//*  33   68:aload_0         
	//*  34   69:invokevirtual   #588 <Method boolean getClipToPadding()>
	//*  35   72:ifeq            78
	//*  36   75:goto            83
					{
						k = 0;
	//   37   78:iconst_0        
	//   38   79:istore_3        
					} else
	//*  39   80:goto            102
					{
						i -= getPaddingLeft() + getPaddingRight();
	//   40   83:iload_2         
	//   41   84:aload_0         
	//   42   85:invokevirtual   #591 <Method int getPaddingLeft()>
	//   43   88:aload_0         
	//   44   89:invokevirtual   #594 <Method int getPaddingRight()>
	//   45   92:iadd            
	//   46   93:isub            
	//   47   94:istore_2        
						k = getPaddingLeft() + 0;
	//   48   95:aload_0         
	//   49   96:invokevirtual   #591 <Method int getPaddingLeft()>
	//   50   99:iconst_0        
	//   51  100:iadd            
	//   52  101:istore_3        
					}
					int l1 = l2;
	//   53  102:iload           8
	//   54  104:istore          5
					int i1 = j2;
	//   55  106:iload           7
	//   56  108:istore          4
					if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  57  110:getstatic       #585 <Field int android.os.Build$VERSION.SDK_INT>
	//*  58  113:bipush          21
	//*  59  115:icmplt          156
					{
						l1 = l2;
	//   60  118:iload           8
	//   61  120:istore          5
						i1 = j2;
	//   62  122:iload           7
	//   63  124:istore          4
						if(getClipToPadding())
	//*  64  126:aload_0         
	//*  65  127:invokevirtual   #588 <Method boolean getClipToPadding()>
	//*  66  130:ifeq            156
						{
							l1 = l2 - (getPaddingTop() + getPaddingBottom());
	//   67  133:iload           8
	//   68  135:aload_0         
	//   69  136:invokevirtual   #193 <Method int getPaddingTop()>
	//   70  139:aload_0         
	//   71  140:invokevirtual   #196 <Method int getPaddingBottom()>
	//   72  143:iadd            
	//   73  144:isub            
	//   74  145:istore          5
							i1 = j2 + getPaddingTop();
	//   75  147:iload           7
	//   76  149:aload_0         
	//   77  150:invokevirtual   #193 <Method int getPaddingTop()>
	//   78  153:iadd            
	//   79  154:istore          4
						}
					}
					canvas.translate(k, i1);
	//   80  156:aload_1         
	//   81  157:iload_3         
	//   82  158:i2f             
	//   83  159:iload           4
	//   84  161:i2f             
	//   85  162:invokevirtual   #598 <Method void Canvas.translate(float, float)>
					mEdgeGlowTop.setSize(i, l1);
	//   86  165:aload_0         
	//   87  166:getfield        #216 <Field EdgeEffect mEdgeGlowTop>
	//   88  169:iload_2         
	//   89  170:iload           5
	//   90  172:invokevirtual   #601 <Method void EdgeEffect.setSize(int, int)>
					if(mEdgeGlowTop.draw(canvas))
	//*  91  175:aload_0         
	//*  92  176:getfield        #216 <Field EdgeEffect mEdgeGlowTop>
	//*  93  179:aload_1         
	//*  94  180:invokevirtual   #604 <Method boolean EdgeEffect.draw(Canvas)>
	//*  95  183:ifeq            190
						ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   96  186:aload_0         
	//   97  187:invokestatic    #533 <Method void ViewCompat.postInvalidateOnAnimation(View)>
					canvas.restoreToCount(k3);
	//   98  190:aload_1         
	//   99  191:iload           10
	//  100  193:invokevirtual   #607 <Method void Canvas.restoreToCount(int)>
				}
				if(mEdgeGlowBottom.isFinished())
					break label0;
	//  101  196:aload_0         
	//  102  197:getfield        #223 <Field EdgeEffect mEdgeGlowBottom>
	//  103  200:invokevirtual   #572 <Method boolean EdgeEffect.isFinished()>
	//  104  203:ifne            385
				l3 = canvas.save();
	//  105  206:aload_1         
	//  106  207:invokevirtual   #577 <Method int Canvas.save()>
	//  107  210:istore          10
				int j1 = getWidth();
	//  108  212:aload_0         
	//  109  213:invokevirtual   #580 <Method int getWidth()>
	//  110  216:istore          4
				k2 = getHeight();
	//  111  218:aload_0         
	//  112  219:invokevirtual   #190 <Method int getHeight()>
	//  113  222:istore          7
				i3 = Math.max(getScrollRange(), j3) + k2;
	//  114  224:aload_0         
	//  115  225:invokevirtual   #261 <Method int getScrollRange()>
	//  116  228:iload           9
	//  117  230:invokestatic    #545 <Method int Math.max(int, int)>
	//  118  233:iload           7
	//  119  235:iadd            
	//  120  236:istore          8
				if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 121  238:getstatic       #585 <Field int android.os.Build$VERSION.SDK_INT>
	//* 122  241:bipush          21
	//* 123  243:icmplt          259
				{
					l = ((int) (flag));
	//  124  246:iload           6
	//  125  248:istore_3        
					j = j1;
	//  126  249:iload           4
	//  127  251:istore_2        
					if(!getClipToPadding())
						break label1;
	//  128  252:aload_0         
	//  129  253:invokevirtual   #588 <Method boolean getClipToPadding()>
	//  130  256:ifeq            279
				}
				j = j1 - (getPaddingLeft() + getPaddingRight());
	//  131  259:iload           4
	//  132  261:aload_0         
	//  133  262:invokevirtual   #591 <Method int getPaddingLeft()>
	//  134  265:aload_0         
	//  135  266:invokevirtual   #594 <Method int getPaddingRight()>
	//  136  269:iadd            
	//  137  270:isub            
	//  138  271:istore_2        
				l = 0 + getPaddingLeft();
	//  139  272:iconst_0        
	//  140  273:aload_0         
	//  141  274:invokevirtual   #591 <Method int getPaddingLeft()>
	//  142  277:iadd            
	//  143  278:istore_3        
			}
			int i2 = i3;
	//  144  279:iload           8
	//  145  281:istore          5
			int k1 = k2;
	//  146  283:iload           7
	//  147  285:istore          4
			if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 148  287:getstatic       #585 <Field int android.os.Build$VERSION.SDK_INT>
	//* 149  290:bipush          21
	//* 150  292:icmplt          333
			{
				i2 = i3;
	//  151  295:iload           8
	//  152  297:istore          5
				k1 = k2;
	//  153  299:iload           7
	//  154  301:istore          4
				if(getClipToPadding())
	//* 155  303:aload_0         
	//* 156  304:invokevirtual   #588 <Method boolean getClipToPadding()>
	//* 157  307:ifeq            333
				{
					k1 = k2 - (getPaddingTop() + getPaddingBottom());
	//  158  310:iload           7
	//  159  312:aload_0         
	//  160  313:invokevirtual   #193 <Method int getPaddingTop()>
	//  161  316:aload_0         
	//  162  317:invokevirtual   #196 <Method int getPaddingBottom()>
	//  163  320:iadd            
	//  164  321:isub            
	//  165  322:istore          4
					i2 = i3 - getPaddingBottom();
	//  166  324:iload           8
	//  167  326:aload_0         
	//  168  327:invokevirtual   #196 <Method int getPaddingBottom()>
	//  169  330:isub            
	//  170  331:istore          5
				}
			}
			canvas.translate(l - j, i2);
	//  171  333:aload_1         
	//  172  334:iload_3         
	//  173  335:iload_2         
	//  174  336:isub            
	//  175  337:i2f             
	//  176  338:iload           5
	//  177  340:i2f             
	//  178  341:invokevirtual   #598 <Method void Canvas.translate(float, float)>
			canvas.rotate(180F, j, 0.0F);
	//  179  344:aload_1         
	//  180  345:ldc2            #608 <Float 180F>
	//  181  348:iload_2         
	//  182  349:i2f             
	//  183  350:fconst_0        
	//  184  351:invokevirtual   #612 <Method void Canvas.rotate(float, float, float)>
			mEdgeGlowBottom.setSize(j, k1);
	//  185  354:aload_0         
	//  186  355:getfield        #223 <Field EdgeEffect mEdgeGlowBottom>
	//  187  358:iload_2         
	//  188  359:iload           4
	//  189  361:invokevirtual   #601 <Method void EdgeEffect.setSize(int, int)>
			if(mEdgeGlowBottom.draw(canvas))
	//* 190  364:aload_0         
	//* 191  365:getfield        #223 <Field EdgeEffect mEdgeGlowBottom>
	//* 192  368:aload_1         
	//* 193  369:invokevirtual   #604 <Method boolean EdgeEffect.draw(Canvas)>
	//* 194  372:ifeq            379
				ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//  195  375:aload_0         
	//  196  376:invokestatic    #533 <Method void ViewCompat.postInvalidateOnAnimation(View)>
			canvas.restoreToCount(l3);
	//  197  379:aload_1         
	//  198  380:iload           10
	//  199  382:invokevirtual   #607 <Method void Canvas.restoreToCount(int)>
		}
	//  200  385:return          
	}

	public boolean executeKeyEvent(KeyEvent keyevent)
	{
		mTempRect.setEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field Rect mTempRect>
	//    2    4:invokevirtual   #615 <Method void Rect.setEmpty()>
		boolean flag = canScroll();
	//    3    7:aload_0         
	//    4    8:invokespecial   #617 <Method boolean canScroll()>
	//    5   11:istore          4
		boolean flag2 = false;
	//    6   13:iconst_0        
	//    7   14:istore          5
		char c = '\202';
	//    8   16:sipush          130
	//    9   19:istore_2        
		if(!flag)
	//*  10   20:iload           4
	//*  11   22:ifne            108
			if(isFocused() && keyevent.getKeyCode() != 4)
	//*  12   25:aload_0         
	//*  13   26:invokevirtual   #618 <Method boolean isFocused()>
	//*  14   29:ifeq            106
	//*  15   32:aload_1         
	//*  16   33:invokevirtual   #623 <Method int KeyEvent.getKeyCode()>
	//*  17   36:iconst_4        
	//*  18   37:icmpeq          106
			{
				View view = findFocus();
	//   19   40:aload_0         
	//   20   41:invokevirtual   #425 <Method View findFocus()>
	//   21   44:astore          6
				keyevent = ((KeyEvent) (view));
	//   22   46:aload           6
	//   23   48:astore_1        
				if(view == this)
	//*  24   49:aload           6
	//*  25   51:aload_0         
	//*  26   52:if_acmpne       57
					keyevent = null;
	//   27   55:aconst_null     
	//   28   56:astore_1        
				keyevent = ((KeyEvent) (FocusFinder.getInstance().findNextFocus(((ViewGroup) (this)), ((View) (keyevent)), 130)));
	//   29   57:invokestatic    #457 <Method FocusFinder FocusFinder.getInstance()>
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:sipush          130
	//   33   65:invokevirtual   #461 <Method View FocusFinder.findNextFocus(ViewGroup, View, int)>
	//   34   68:astore_1        
				boolean flag1 = flag2;
	//   35   69:iload           5
	//   36   71:istore          4
				if(keyevent != null)
	//*  37   73:aload_1         
	//*  38   74:ifnull          103
				{
					flag1 = flag2;
	//   39   77:iload           5
	//   40   79:istore          4
					if(keyevent != this)
	//*  41   81:aload_1         
	//*  42   82:aload_0         
	//*  43   83:if_acmpeq       103
					{
						flag1 = flag2;
	//   44   86:iload           5
	//   45   88:istore          4
						if(((View) (keyevent)).requestFocus(130))
	//*  46   90:aload_1         
	//*  47   91:sipush          130
	//*  48   94:invokevirtual   #429 <Method boolean View.requestFocus(int)>
	//*  49   97:ifeq            103
							flag1 = true;
	//   50  100:iconst_1        
	//   51  101:istore          4
					}
				}
				return flag1;
	//   52  103:iload           4
	//   53  105:ireturn         
			} else
			{
				return false;
	//   54  106:iconst_0        
	//   55  107:ireturn         
			}
		if(keyevent.getAction() == 0)
	//*  56  108:aload_1         
	//*  57  109:invokevirtual   #626 <Method int KeyEvent.getAction()>
	//*  58  112:ifne            210
		{
			int i = keyevent.getKeyCode();
	//   59  115:aload_1         
	//   60  116:invokevirtual   #623 <Method int KeyEvent.getKeyCode()>
	//   61  119:istore_3        
			if(i != 62)
	//*  62  120:iload_3         
	//*  63  121:bipush          62
	//*  64  123:icmpeq          194
			{
				switch(i)
	//*  65  126:iload_3         
				{
	//*  66  127:tableswitch     19 20: default 148
	//	               19 173
	//	               20 150
				default:
					return false;
	//   67  148:iconst_0        
	//   68  149:ireturn         

				case 20: // '\024'
					if(!keyevent.isAltPressed())
	//*  69  150:aload_1         
	//*  70  151:invokevirtual   #629 <Method boolean KeyEvent.isAltPressed()>
	//*  71  154:ifne            165
						return arrowScroll(130);
	//   72  157:aload_0         
	//   73  158:sipush          130
	//   74  161:invokevirtual   #631 <Method boolean arrowScroll(int)>
	//   75  164:ireturn         
					else
						return fullScroll(130);
	//   76  165:aload_0         
	//   77  166:sipush          130
	//   78  169:invokevirtual   #634 <Method boolean fullScroll(int)>
	//   79  172:ireturn         

				case 19: // '\023'
					break;
				}
				if(!keyevent.isAltPressed())
	//*  80  173:aload_1         
	//*  81  174:invokevirtual   #629 <Method boolean KeyEvent.isAltPressed()>
	//*  82  177:ifne            187
					return arrowScroll(33);
	//   83  180:aload_0         
	//   84  181:bipush          33
	//   85  183:invokevirtual   #631 <Method boolean arrowScroll(int)>
	//   86  186:ireturn         
				else
					return fullScroll(33);
	//   87  187:aload_0         
	//   88  188:bipush          33
	//   89  190:invokevirtual   #634 <Method boolean fullScroll(int)>
	//   90  193:ireturn         
			}
			if(keyevent.isShiftPressed())
	//*  91  194:aload_1         
	//*  92  195:invokevirtual   #637 <Method boolean KeyEvent.isShiftPressed()>
	//*  93  198:ifeq            204
				c = '!';
	//   94  201:bipush          33
	//   95  203:istore_2        
			pageScroll(((int) (c)));
	//   96  204:aload_0         
	//   97  205:iload_2         
	//   98  206:invokevirtual   #640 <Method boolean pageScroll(int)>
	//   99  209:pop             
		}
		return false;
	//  100  210:iconst_0        
	//  101  211:ireturn         
	}

	public void fling(int i)
	{
		if(getChildCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #168 <Method int getChildCount()>
	//*   2    4:ifle            53
		{
			startNestedScroll(2, 1);
	//    3    7:aload_0         
	//    4    8:iconst_2        
	//    5    9:iconst_1        
	//    6   10:invokevirtual   #643 <Method boolean startNestedScroll(int, int)>
	//    7   13:pop             
			mScroller.fling(getScrollX(), getScrollY(), 0, i, 0, 0, 0x80000000, 0x7fffffff, 0, 0);
	//    8   14:aload_0         
	//    9   15:getfield        #336 <Field OverScroller mScroller>
	//   10   18:aload_0         
	//   11   19:invokevirtual   #514 <Method int getScrollX()>
	//   12   22:aload_0         
	//   13   23:invokevirtual   #258 <Method int getScrollY()>
	//   14   26:iconst_0        
	//   15   27:iload_1         
	//   16   28:iconst_0        
	//   17   29:iconst_0        
	//   18   30:ldc2            #644 <Int 0x80000000>
	//   19   33:ldc2            #645 <Int 0x7fffffff>
	//   20   36:iconst_0        
	//   21   37:iconst_0        
	//   22   38:invokevirtual   #648 <Method void OverScroller.fling(int, int, int, int, int, int, int, int, int, int)>
			mLastScrollerY = getScrollY();
	//   23   41:aload_0         
	//   24   42:aload_0         
	//   25   43:invokevirtual   #258 <Method int getScrollY()>
	//   26   46:putfield        #507 <Field int mLastScrollerY>
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   27   49:aload_0         
	//   28   50:invokestatic    #533 <Method void ViewCompat.postInvalidateOnAnimation(View)>
		}
	//   29   53:return          
	}

	public boolean fullScroll(int i)
	{
		boolean flag;
		if(i == 130)
	//*   0    0:iload_1         
	//*   1    1:sipush          130
	//*   2    4:icmpne          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		int k = getHeight();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #190 <Method int getHeight()>
	//   10   18:istore_3        
		Rect rect = mTempRect;
	//   11   19:aload_0         
	//   12   20:getfield        #101 <Field Rect mTempRect>
	//   13   23:astore          4
		rect.top = 0;
	//   14   25:aload           4
	//   15   27:iconst_0        
	//   16   28:putfield        #397 <Field int Rect.top>
		rect.bottom = k;
	//   17   31:aload           4
	//   18   33:iload_3         
	//   19   34:putfield        #394 <Field int Rect.bottom>
		if(flag)
	//*  20   37:iload_2         
	//*  21   38:ifeq            110
		{
			int j = getChildCount();
	//   22   41:aload_0         
	//   23   42:invokevirtual   #168 <Method int getChildCount()>
	//   24   45:istore_2        
			if(j > 0)
	//*  25   46:iload_2         
	//*  26   47:ifle            110
			{
				Object obj = ((Object) (getChildAt(j - 1)));
	//   27   50:aload_0         
	//   28   51:iload_2         
	//   29   52:iconst_1        
	//   30   53:isub            
	//   31   54:invokevirtual   #172 <Method View getChildAt(int)>
	//   32   57:astore          4
				android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)((View) (obj)).getLayoutParams();
	//   33   59:aload           4
	//   34   61:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   35   64:checkcast       #180 <Class android.widget.FrameLayout$LayoutParams>
	//   36   67:astore          5
				mTempRect.bottom = ((View) (obj)).getBottom() + layoutparams.bottomMargin + getPaddingBottom();
	//   37   69:aload_0         
	//   38   70:getfield        #101 <Field Rect mTempRect>
	//   39   73:aload           4
	//   40   75:invokevirtual   #254 <Method int View.getBottom()>
	//   41   78:aload           5
	//   42   80:getfield        #189 <Field int android.widget.FrameLayout$LayoutParams.bottomMargin>
	//   43   83:iadd            
	//   44   84:aload_0         
	//   45   85:invokevirtual   #196 <Method int getPaddingBottom()>
	//   46   88:iadd            
	//   47   89:putfield        #394 <Field int Rect.bottom>
				obj = ((Object) (mTempRect));
	//   48   92:aload_0         
	//   49   93:getfield        #101 <Field Rect mTempRect>
	//   50   96:astore          4
				obj.top = ((Rect) (obj)).bottom - k;
	//   51   98:aload           4
	//   52  100:aload           4
	//   53  102:getfield        #394 <Field int Rect.bottom>
	//   54  105:iload_3         
	//   55  106:isub            
	//   56  107:putfield        #397 <Field int Rect.top>
			}
		}
		return scrollAndFocus(i, mTempRect.top, mTempRect.bottom);
	//   57  110:aload_0         
	//   58  111:iload_1         
	//   59  112:aload_0         
	//   60  113:getfield        #101 <Field Rect mTempRect>
	//   61  116:getfield        #397 <Field int Rect.top>
	//   62  119:aload_0         
	//   63  120:getfield        #101 <Field Rect mTempRect>
	//   64  123:getfield        #394 <Field int Rect.bottom>
	//   65  126:invokespecial   #650 <Method boolean scrollAndFocus(int, int, int)>
	//   66  129:ireturn         
	}

	protected float getBottomFadingEdgeStrength()
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #168 <Method int getChildCount()>
	//*   2    4:ifne            9
			return 0.0F;
	//    3    7:fconst_0        
	//    4    8:freturn         
		View view = getChildAt(0);
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #172 <Method View getChildAt(int)>
	//    8   14:astore          4
		android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
	//    9   16:aload           4
	//   10   18:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   11   21:checkcast       #180 <Class android.widget.FrameLayout$LayoutParams>
	//   12   24:astore          5
		int i = getVerticalFadingEdgeLength();
	//   13   26:aload_0         
	//   14   27:invokevirtual   #539 <Method int getVerticalFadingEdgeLength()>
	//   15   30:istore_1        
		int j = getHeight();
	//   16   31:aload_0         
	//   17   32:invokevirtual   #190 <Method int getHeight()>
	//   18   35:istore_2        
		int k = getPaddingBottom();
	//   19   36:aload_0         
	//   20   37:invokevirtual   #196 <Method int getPaddingBottom()>
	//   21   40:istore_3        
		j = (view.getBottom() + layoutparams.bottomMargin) - getScrollY() - (j - k);
	//   22   41:aload           4
	//   23   43:invokevirtual   #254 <Method int View.getBottom()>
	//   24   46:aload           5
	//   25   48:getfield        #189 <Field int android.widget.FrameLayout$LayoutParams.bottomMargin>
	//   26   51:iadd            
	//   27   52:aload_0         
	//   28   53:invokevirtual   #258 <Method int getScrollY()>
	//   29   56:isub            
	//   30   57:iload_2         
	//   31   58:iload_3         
	//   32   59:isub            
	//   33   60:isub            
	//   34   61:istore_2        
		if(j < i)
	//*  35   62:iload_2         
	//*  36   63:iload_1         
	//*  37   64:icmpge          73
			return (float)j / (float)i;
	//   38   67:iload_2         
	//   39   68:i2f             
	//   40   69:iload_1         
	//   41   70:i2f             
	//   42   71:fdiv            
	//   43   72:freturn         
		else
			return 1.0F;
	//   44   73:fconst_1        
	//   45   74:freturn         
	}

	public int getMaxScrollAmount()
	{
		return (int)((float)getHeight() * 0.5F);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #190 <Method int getHeight()>
	//    2    4:i2f             
	//    3    5:ldc1            #31  <Float 0.5F>
	//    4    7:fmul            
	//    5    8:f2i             
	//    6    9:ireturn         
	}

	public int getNestedScrollAxes()
	{
		return mParentHelper.getNestedScrollAxes();
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field NestedScrollingParentHelper mParentHelper>
	//    2    4:invokevirtual   #654 <Method int NestedScrollingParentHelper.getNestedScrollAxes()>
	//    3    7:ireturn         
	}

	int getScrollRange()
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #168 <Method int getChildCount()>
	//    2    4:istore_2        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		if(j > 0)
	//*   5    7:iload_2         
	//*   6    8:ifle            62
		{
			View view = getChildAt(0);
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #172 <Method View getChildAt(int)>
	//   10   16:astore_3        
			android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
	//   11   17:aload_3         
	//   12   18:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   13   21:checkcast       #180 <Class android.widget.FrameLayout$LayoutParams>
	//   14   24:astore          4
			i = Math.max(0, (view.getHeight() + layoutparams.topMargin + layoutparams.bottomMargin) - (getHeight() - getPaddingTop() - getPaddingBottom()));
	//   15   26:iconst_0        
	//   16   27:aload_3         
	//   17   28:invokevirtual   #183 <Method int View.getHeight()>
	//   18   31:aload           4
	//   19   33:getfield        #186 <Field int android.widget.FrameLayout$LayoutParams.topMargin>
	//   20   36:iadd            
	//   21   37:aload           4
	//   22   39:getfield        #189 <Field int android.widget.FrameLayout$LayoutParams.bottomMargin>
	//   23   42:iadd            
	//   24   43:aload_0         
	//   25   44:invokevirtual   #190 <Method int getHeight()>
	//   26   47:aload_0         
	//   27   48:invokevirtual   #193 <Method int getPaddingTop()>
	//   28   51:isub            
	//   29   52:aload_0         
	//   30   53:invokevirtual   #196 <Method int getPaddingBottom()>
	//   31   56:isub            
	//   32   57:isub            
	//   33   58:invokestatic    #545 <Method int Math.max(int, int)>
	//   34   61:istore_1        
		}
		return i;
	//   35   62:iload_1         
	//   36   63:ireturn         
	}

	protected float getTopFadingEdgeStrength()
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #168 <Method int getChildCount()>
	//*   2    4:ifne            9
			return 0.0F;
	//    3    7:fconst_0        
	//    4    8:freturn         
		int i = getVerticalFadingEdgeLength();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #539 <Method int getVerticalFadingEdgeLength()>
	//    7   13:istore_1        
		int j = getScrollY();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #258 <Method int getScrollY()>
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
		return hasNestedScrollingParent(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #536 <Method boolean hasNestedScrollingParent(int)>
	//    3    5:ireturn         
	}

	public boolean hasNestedScrollingParent(int i)
	{
		return mChildHelper.hasNestedScrollingParent(i);
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #656 <Method boolean NestedScrollingChildHelper.hasNestedScrollingParent(int)>
	//    4    8:ireturn         
	}

	public boolean isFillViewport()
	{
		return mFillViewport;
	//    0    0:aload_0         
	//    1    1:getfield        #659 <Field boolean mFillViewport>
	//    2    4:ireturn         
	}

	public boolean isNestedScrollingEnabled()
	{
		return mChildHelper.isNestedScrollingEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:invokevirtual   #662 <Method boolean NestedScrollingChildHelper.isNestedScrollingEnabled()>
	//    3    7:ireturn         
	}

	public boolean isSmoothScrollingEnabled()
	{
		return mSmoothScrollingEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field boolean mSmoothScrollingEnabled>
	//    2    4:ireturn         
	}

	protected void measureChild(View view, int i, int j)
	{
		android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:astore          4
		view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), layoutparams.width), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
	//    3    6:aload_1         
	//    4    7:iload_2         
	//    5    8:aload_0         
	//    6    9:invokevirtual   #591 <Method int getPaddingLeft()>
	//    7   12:aload_0         
	//    8   13:invokevirtual   #594 <Method int getPaddingRight()>
	//    9   16:iadd            
	//   10   17:aload           4
	//   11   19:getfield        #670 <Field int android.view.ViewGroup$LayoutParams.width>
	//   12   22:invokestatic    #673 <Method int getChildMeasureSpec(int, int, int)>
	//   13   25:iconst_0        
	//   14   26:iconst_0        
	//   15   27:invokestatic    #678 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   16   30:invokevirtual   #681 <Method void View.measure(int, int)>
	//   17   33:return          
	}

	protected void measureChildWithMargins(View view, int i, int j, int k, int l)
	{
		android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #685 <Class android.view.ViewGroup$MarginLayoutParams>
	//    3    7:astore          6
		view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginlayoutparams.leftMargin + marginlayoutparams.rightMargin + j, marginlayoutparams.width), android.view.View.MeasureSpec.makeMeasureSpec(marginlayoutparams.topMargin + marginlayoutparams.bottomMargin, 0));
	//    4    9:aload_1         
	//    5   10:iload_2         
	//    6   11:aload_0         
	//    7   12:invokevirtual   #591 <Method int getPaddingLeft()>
	//    8   15:aload_0         
	//    9   16:invokevirtual   #594 <Method int getPaddingRight()>
	//   10   19:iadd            
	//   11   20:aload           6
	//   12   22:getfield        #688 <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//   13   25:iadd            
	//   14   26:aload           6
	//   15   28:getfield        #691 <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//   16   31:iadd            
	//   17   32:iload_3         
	//   18   33:iadd            
	//   19   34:aload           6
	//   20   36:getfield        #692 <Field int android.view.ViewGroup$MarginLayoutParams.width>
	//   21   39:invokestatic    #673 <Method int getChildMeasureSpec(int, int, int)>
	//   22   42:aload           6
	//   23   44:getfield        #693 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//   24   47:aload           6
	//   25   49:getfield        #694 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
	//   26   52:iadd            
	//   27   53:iconst_0        
	//   28   54:invokestatic    #678 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   29   57:invokevirtual   #681 <Method void View.measure(int, int)>
	//   30   60:return          
	}

	public void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #697 <Method void FrameLayout.onAttachedToWindow()>
		mIsLaidOut = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #105 <Field boolean mIsLaidOut>
	//    5    9:return          
	}

	public boolean onGenericMotionEvent(MotionEvent motionevent)
	{
		if((motionevent.getSource() & 2) != 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #702 <Method int MotionEvent.getSource()>
	//*   2    4:iconst_2        
	//*   3    5:iand            
	//*   4    6:ifeq            106
		{
			if(motionevent.getAction() != 8)
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #703 <Method int MotionEvent.getAction()>
	//*   7   13:bipush          8
	//*   8   15:icmpeq          20
				return false;
	//    9   18:iconst_0        
	//   10   19:ireturn         
			if(!mIsBeingDragged)
	//*  11   20:aload_0         
	//*  12   21:getfield        #109 <Field boolean mIsBeingDragged>
	//*  13   24:ifne            106
			{
				float f = motionevent.getAxisValue(9);
	//   14   27:aload_1         
	//   15   28:bipush          9
	//   16   30:invokevirtual   #706 <Method float MotionEvent.getAxisValue(int)>
	//   17   33:fstore_2        
				if(f != 0.0F)
	//*  18   34:fload_2         
	//*  19   35:fconst_0        
	//*  20   36:fcmpl           
	//*  21   37:ifeq            106
				{
					int i = (int)(f * getVerticalScrollFactorCompat());
	//   22   40:fload_2         
	//   23   41:aload_0         
	//   24   42:invokespecial   #708 <Method float getVerticalScrollFactorCompat()>
	//   25   45:fmul            
	//   26   46:f2i             
	//   27   47:istore_3        
					int j = getScrollRange();
	//   28   48:aload_0         
	//   29   49:invokevirtual   #261 <Method int getScrollRange()>
	//   30   52:istore          4
					int l = getScrollY();
	//   31   54:aload_0         
	//   32   55:invokevirtual   #258 <Method int getScrollY()>
	//   33   58:istore          6
					int k = l - i;
	//   34   60:iload           6
	//   35   62:iload_3         
	//   36   63:isub            
	//   37   64:istore          5
					if(k < 0)
	//*  38   66:iload           5
	//*  39   68:ifge            76
					{
						i = 0;
	//   40   71:iconst_0        
	//   41   72:istore_3        
					} else
	//*  42   73:goto            89
					{
						i = k;
	//   43   76:iload           5
	//   44   78:istore_3        
						if(k > j)
	//*  45   79:iload           5
	//*  46   81:iload           4
	//*  47   83:icmple          89
							i = j;
	//   48   86:iload           4
	//   49   88:istore_3        
					}
					if(i != l)
	//*  50   89:iload_3         
	//*  51   90:iload           6
	//*  52   92:icmpeq          106
					{
						super.scrollTo(getScrollX(), i);
	//   53   95:aload_0         
	//   54   96:aload_0         
	//   55   97:invokevirtual   #514 <Method int getScrollX()>
	//   56  100:iload_3         
	//   57  101:invokespecial   #711 <Method void FrameLayout.scrollTo(int, int)>
						return true;
	//   58  104:iconst_1        
	//   59  105:ireturn         
					}
				}
			}
		}
		return false;
	//   60  106:iconst_0        
	//   61  107:ireturn         
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		int i = motionevent.getAction();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #703 <Method int MotionEvent.getAction()>
	//    2    4:istore_2        
		if(i == 2 && mIsBeingDragged)
	//*   3    5:iload_2         
	//*   4    6:iconst_2        
	//*   5    7:icmpne          19
	//*   6   10:aload_0         
	//*   7   11:getfield        #109 <Field boolean mIsBeingDragged>
	//*   8   14:ifeq            19
			return true;
	//    9   17:iconst_1        
	//   10   18:ireturn         
		i &= 0xff;
	//   11   19:iload_2         
	//   12   20:sipush          255
	//   13   23:iand            
	//   14   24:istore_2        
		if(i != 6)
	//*  15   25:iload_2         
	//*  16   26:bipush          6
	//*  17   28:icmpeq          351
			switch(i)
	//*  18   31:iload_2         
			{
	//*  19   32:tableswitch     0 3: default 64
	//	               0 263
	//	               1 212
	//	               2 67
	//	               3 212
	//*  20   64:goto            356
			case 2: // '\002'
				int j = mActivePointerId;
	//   21   67:aload_0         
	//   22   68:getfield        #113 <Field int mActivePointerId>
	//   23   71:istore_2        
				if(j != -1)
	//*  24   72:iload_2         
	//*  25   73:iconst_m1       
	//*  26   74:icmpne          80
	//*  27   77:goto            356
				{
					int i1 = motionevent.findPointerIndex(j);
	//   28   80:aload_1         
	//   29   81:iload_2         
	//   30   82:invokevirtual   #715 <Method int MotionEvent.findPointerIndex(int)>
	//   31   85:istore_3        
					if(i1 == -1)
	//*  32   86:iload_3         
	//*  33   87:iconst_m1       
	//*  34   88:icmpne          134
					{
						motionevent = ((MotionEvent) (new StringBuilder()));
	//   35   91:new             #717 <Class StringBuilder>
	//   36   94:dup             
	//   37   95:invokespecial   #718 <Method void StringBuilder()>
	//   38   98:astore_1        
						((StringBuilder) (motionevent)).append("Invalid pointerId=");
	//   39   99:aload_1         
	//   40  100:ldc2            #720 <String "Invalid pointerId=">
	//   41  103:invokevirtual   #724 <Method StringBuilder StringBuilder.append(String)>
	//   42  106:pop             
						((StringBuilder) (motionevent)).append(j);
	//   43  107:aload_1         
	//   44  108:iload_2         
	//   45  109:invokevirtual   #727 <Method StringBuilder StringBuilder.append(int)>
	//   46  112:pop             
						((StringBuilder) (motionevent)).append(" in onInterceptTouchEvent");
	//   47  113:aload_1         
	//   48  114:ldc2            #729 <String " in onInterceptTouchEvent">
	//   49  117:invokevirtual   #724 <Method StringBuilder StringBuilder.append(String)>
	//   50  120:pop             
						Log.e("NestedScrollView", ((StringBuilder) (motionevent)).toString());
	//   51  121:ldc1            #37  <String "NestedScrollView">
	//   52  123:aload_1         
	//   53  124:invokevirtual   #733 <Method String StringBuilder.toString()>
	//   54  127:invokestatic    #739 <Method int Log.e(String, String)>
	//   55  130:pop             
					} else
	//*  56  131:goto            356
					{
						int k = (int)motionevent.getY(i1);
	//   57  134:aload_1         
	//   58  135:iload_3         
	//   59  136:invokevirtual   #412 <Method float MotionEvent.getY(int)>
	//   60  139:f2i             
	//   61  140:istore_2        
						if(Math.abs(k - mLastMotionY) > mTouchSlop && (2 & getNestedScrollAxes()) == 0)
	//*  62  141:iload_2         
	//*  63  142:aload_0         
	//*  64  143:getfield        #414 <Field int mLastMotionY>
	//*  65  146:isub            
	//*  66  147:invokestatic    #742 <Method int Math.abs(int)>
	//*  67  150:aload_0         
	//*  68  151:getfield        #356 <Field int mTouchSlop>
	//*  69  154:icmple          356
	//*  70  157:iconst_2        
	//*  71  158:aload_0         
	//*  72  159:invokevirtual   #743 <Method int getNestedScrollAxes()>
	//*  73  162:iand            
	//*  74  163:ifne            356
						{
							mIsBeingDragged = true;
	//   75  166:aload_0         
	//   76  167:iconst_1        
	//   77  168:putfield        #109 <Field boolean mIsBeingDragged>
							mLastMotionY = k;
	//   78  171:aload_0         
	//   79  172:iload_2         
	//   80  173:putfield        #414 <Field int mLastMotionY>
							initVelocityTrackerIfNotExists();
	//   81  176:aload_0         
	//   82  177:invokespecial   #745 <Method void initVelocityTrackerIfNotExists()>
							mVelocityTracker.addMovement(motionevent);
	//   83  180:aload_0         
	//   84  181:getfield        #322 <Field VelocityTracker mVelocityTracker>
	//   85  184:aload_1         
	//   86  185:invokevirtual   #748 <Method void VelocityTracker.addMovement(MotionEvent)>
							mNestedYOffset = 0;
	//   87  188:aload_0         
	//   88  189:iconst_0        
	//   89  190:putfield        #750 <Field int mNestedYOffset>
							motionevent = ((MotionEvent) (getParent()));
	//   90  193:aload_0         
	//   91  194:invokevirtual   #751 <Method ViewParent getParent()>
	//   92  197:astore_1        
							if(motionevent != null)
	//*  93  198:aload_1         
	//*  94  199:ifnull          356
								((ViewParent) (motionevent)).requestDisallowInterceptTouchEvent(true);
	//   95  202:aload_1         
	//   96  203:iconst_1        
	//   97  204:invokeinterface #756 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
						}
					}
				}
				break;

	//*  98  209:goto            356
			case 1: // '\001'
			case 3: // '\003'
				mIsBeingDragged = false;
	//   99  212:aload_0         
	//  100  213:iconst_0        
	//  101  214:putfield        #109 <Field boolean mIsBeingDragged>
				mActivePointerId = -1;
	//  102  217:aload_0         
	//  103  218:iconst_m1       
	//  104  219:putfield        #113 <Field int mActivePointerId>
				recycleVelocityTracker();
	//  105  222:aload_0         
	//  106  223:invokespecial   #211 <Method void recycleVelocityTracker()>
				if(mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()))
	//* 107  226:aload_0         
	//* 108  227:getfield        #336 <Field OverScroller mScroller>
	//* 109  230:aload_0         
	//* 110  231:invokevirtual   #514 <Method int getScrollX()>
	//* 111  234:aload_0         
	//* 112  235:invokevirtual   #258 <Method int getScrollY()>
	//* 113  238:iconst_0        
	//* 114  239:iconst_0        
	//* 115  240:iconst_0        
	//* 116  241:aload_0         
	//* 117  242:invokevirtual   #261 <Method int getScrollRange()>
	//* 118  245:invokevirtual   #760 <Method boolean OverScroller.springBack(int, int, int, int, int, int)>
	//* 119  248:ifeq            255
					ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//  120  251:aload_0         
	//  121  252:invokestatic    #533 <Method void ViewCompat.postInvalidateOnAnimation(View)>
				stopNestedScroll(0);
	//  122  255:aload_0         
	//  123  256:iconst_0        
	//  124  257:invokevirtual   #214 <Method void stopNestedScroll(int)>
				break;

	//* 125  260:goto            356
			case 0: // '\0'
				int l = (int)motionevent.getY();
	//  126  263:aload_1         
	//  127  264:invokevirtual   #762 <Method float MotionEvent.getY()>
	//  128  267:f2i             
	//  129  268:istore_2        
				if(!inChild((int)motionevent.getX(), l))
	//* 130  269:aload_0         
	//* 131  270:aload_1         
	//* 132  271:invokevirtual   #765 <Method float MotionEvent.getX()>
	//* 133  274:f2i             
	//* 134  275:iload_2         
	//* 135  276:invokespecial   #767 <Method boolean inChild(int, int)>
	//* 136  279:ifne            294
				{
					mIsBeingDragged = false;
	//  137  282:aload_0         
	//  138  283:iconst_0        
	//  139  284:putfield        #109 <Field boolean mIsBeingDragged>
					recycleVelocityTracker();
	//  140  287:aload_0         
	//  141  288:invokespecial   #211 <Method void recycleVelocityTracker()>
				} else
	//* 142  291:goto            356
				{
					mLastMotionY = l;
	//  143  294:aload_0         
	//  144  295:iload_2         
	//  145  296:putfield        #414 <Field int mLastMotionY>
					mActivePointerId = motionevent.getPointerId(0);
	//  146  299:aload_0         
	//  147  300:aload_1         
	//  148  301:iconst_0        
	//  149  302:invokevirtual   #408 <Method int MotionEvent.getPointerId(int)>
	//  150  305:putfield        #113 <Field int mActivePointerId>
					initOrResetVelocityTracker();
	//  151  308:aload_0         
	//  152  309:invokespecial   #769 <Method void initOrResetVelocityTracker()>
					mVelocityTracker.addMovement(motionevent);
	//  153  312:aload_0         
	//  154  313:getfield        #322 <Field VelocityTracker mVelocityTracker>
	//  155  316:aload_1         
	//  156  317:invokevirtual   #748 <Method void VelocityTracker.addMovement(MotionEvent)>
					mScroller.computeScrollOffset();
	//  157  320:aload_0         
	//  158  321:getfield        #336 <Field OverScroller mScroller>
	//  159  324:invokevirtual   #499 <Method boolean OverScroller.computeScrollOffset()>
	//  160  327:pop             
					mIsBeingDragged = mScroller.isFinished() ^ true;
	//  161  328:aload_0         
	//  162  329:aload_0         
	//  163  330:getfield        #336 <Field OverScroller mScroller>
	//  164  333:invokevirtual   #770 <Method boolean OverScroller.isFinished()>
	//  165  336:iconst_1        
	//  166  337:ixor            
	//  167  338:putfield        #109 <Field boolean mIsBeingDragged>
					startNestedScroll(2, 0);
	//  168  341:aload_0         
	//  169  342:iconst_2        
	//  170  343:iconst_0        
	//  171  344:invokevirtual   #643 <Method boolean startNestedScroll(int, int)>
	//  172  347:pop             
				}
				break;
			}
		else
	//* 173  348:goto            356
			onSecondaryPointerUp(motionevent);
	//  174  351:aload_0         
	//  175  352:aload_1         
	//  176  353:invokespecial   #772 <Method void onSecondaryPointerUp(MotionEvent)>
		return mIsBeingDragged;
	//  177  356:aload_0         
	//  178  357:getfield        #109 <Field boolean mIsBeingDragged>
	//  179  360:ireturn         
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
	//    6    8:invokespecial   #776 <Method void FrameLayout.onLayout(boolean, int, int, int, int)>
		i = 0;
	//    7   11:iconst_0        
	//    8   12:istore_2        
		mIsLayoutDirty = false;
	//    9   13:aload_0         
	//   10   14:iconst_0        
	//   11   15:putfield        #103 <Field boolean mIsLayoutDirty>
		View view = mChildToScrollTo;
	//   12   18:aload_0         
	//   13   19:getfield        #107 <Field View mChildToScrollTo>
	//   14   22:astore          8
		if(view != null && isViewDescendantOf(view, ((View) (this))))
	//*  15   24:aload           8
	//*  16   26:ifnull          46
	//*  17   29:aload           8
	//*  18   31:aload_0         
	//*  19   32:invokestatic    #383 <Method boolean isViewDescendantOf(View, View)>
	//*  20   35:ifeq            46
			scrollToChild(mChildToScrollTo);
	//   21   38:aload_0         
	//   22   39:aload_0         
	//   23   40:getfield        #107 <Field View mChildToScrollTo>
	//   24   43:invokespecial   #778 <Method void scrollToChild(View)>
		mChildToScrollTo = null;
	//   25   46:aload_0         
	//   26   47:aconst_null     
	//   27   48:putfield        #107 <Field View mChildToScrollTo>
		if(!mIsLaidOut)
	//*  28   51:aload_0         
	//*  29   52:getfield        #105 <Field boolean mIsLaidOut>
	//*  30   55:ifne            177
		{
			if(mSavedState != null)
	//*  31   58:aload_0         
	//*  32   59:getfield        #780 <Field NestedScrollView$SavedState mSavedState>
	//*  33   62:ifnull          85
			{
				scrollTo(getScrollX(), mSavedState.scrollPosition);
	//   34   65:aload_0         
	//   35   66:aload_0         
	//   36   67:invokevirtual   #514 <Method int getScrollX()>
	//   37   70:aload_0         
	//   38   71:getfield        #780 <Field NestedScrollView$SavedState mSavedState>
	//   39   74:getfield        #783 <Field int NestedScrollView$SavedState.scrollPosition>
	//   40   77:invokevirtual   #784 <Method void scrollTo(int, int)>
				mSavedState = null;
	//   41   80:aload_0         
	//   42   81:aconst_null     
	//   43   82:putfield        #780 <Field NestedScrollView$SavedState mSavedState>
			}
			if(getChildCount() > 0)
	//*  44   85:aload_0         
	//*  45   86:invokevirtual   #168 <Method int getChildCount()>
	//*  46   89:ifle            127
			{
				View view1 = getChildAt(0);
	//   47   92:aload_0         
	//   48   93:iconst_0        
	//   49   94:invokevirtual   #172 <Method View getChildAt(int)>
	//   50   97:astore          8
				android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view1.getLayoutParams();
	//   51   99:aload           8
	//   52  101:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   53  104:checkcast       #180 <Class android.widget.FrameLayout$LayoutParams>
	//   54  107:astore          9
				i = view1.getMeasuredHeight() + layoutparams.topMargin + layoutparams.bottomMargin;
	//   55  109:aload           8
	//   56  111:invokevirtual   #787 <Method int View.getMeasuredHeight()>
	//   57  114:aload           9
	//   58  116:getfield        #186 <Field int android.widget.FrameLayout$LayoutParams.topMargin>
	//   59  119:iadd            
	//   60  120:aload           9
	//   61  122:getfield        #189 <Field int android.widget.FrameLayout$LayoutParams.bottomMargin>
	//   62  125:iadd            
	//   63  126:istore_2        
			}
			int i1 = getPaddingTop();
	//   64  127:aload_0         
	//   65  128:invokevirtual   #193 <Method int getPaddingTop()>
	//   66  131:istore          6
			int j1 = getPaddingBottom();
	//   67  133:aload_0         
	//   68  134:invokevirtual   #196 <Method int getPaddingBottom()>
	//   69  137:istore          7
			k = getScrollY();
	//   70  139:aload_0         
	//   71  140:invokevirtual   #258 <Method int getScrollY()>
	//   72  143:istore          4
			i = clamp(k, l - j - i1 - j1, i);
	//   73  145:iload           4
	//   74  147:iload           5
	//   75  149:iload_3         
	//   76  150:isub            
	//   77  151:iload           6
	//   78  153:isub            
	//   79  154:iload           7
	//   80  156:isub            
	//   81  157:iload_2         
	//   82  158:invokestatic    #789 <Method int clamp(int, int, int)>
	//   83  161:istore_2        
			if(i != k)
	//*  84  162:iload_2         
	//*  85  163:iload           4
	//*  86  165:icmpeq          177
				scrollTo(getScrollX(), i);
	//   87  168:aload_0         
	//   88  169:aload_0         
	//   89  170:invokevirtual   #514 <Method int getScrollX()>
	//   90  173:iload_2         
	//   91  174:invokevirtual   #784 <Method void scrollTo(int, int)>
		}
		scrollTo(getScrollX(), getScrollY());
	//   92  177:aload_0         
	//   93  178:aload_0         
	//   94  179:invokevirtual   #514 <Method int getScrollX()>
	//   95  182:aload_0         
	//   96  183:invokevirtual   #258 <Method int getScrollY()>
	//   97  186:invokevirtual   #784 <Method void scrollTo(int, int)>
		mIsLaidOut = true;
	//   98  189:aload_0         
	//   99  190:iconst_1        
	//  100  191:putfield        #105 <Field boolean mIsLaidOut>
	//  101  194:return          
	}

	protected void onMeasure(int i, int j)
	{
		super.onMeasure(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #792 <Method void FrameLayout.onMeasure(int, int)>
		if(!mFillViewport)
	//*   4    6:aload_0         
	//*   5    7:getfield        #659 <Field boolean mFillViewport>
	//*   6   10:ifne            14
			return;
	//    7   13:return          
		if(android.view.View.MeasureSpec.getMode(j) == 0)
	//*   8   14:iload_2         
	//*   9   15:invokestatic    #795 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*  10   18:ifne            22
			return;
	//   11   21:return          
		if(getChildCount() > 0)
	//*  12   22:aload_0         
	//*  13   23:invokevirtual   #168 <Method int getChildCount()>
	//*  14   26:ifle            126
		{
			View view = getChildAt(0);
	//   15   29:aload_0         
	//   16   30:iconst_0        
	//   17   31:invokevirtual   #172 <Method View getChildAt(int)>
	//   18   34:astore          4
			android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
	//   19   36:aload           4
	//   20   38:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   21   41:checkcast       #180 <Class android.widget.FrameLayout$LayoutParams>
	//   22   44:astore          5
			j = view.getMeasuredHeight();
	//   23   46:aload           4
	//   24   48:invokevirtual   #787 <Method int View.getMeasuredHeight()>
	//   25   51:istore_2        
			int k = getMeasuredHeight() - getPaddingTop() - getPaddingBottom() - layoutparams.topMargin - layoutparams.bottomMargin;
	//   26   52:aload_0         
	//   27   53:invokevirtual   #796 <Method int getMeasuredHeight()>
	//   28   56:aload_0         
	//   29   57:invokevirtual   #193 <Method int getPaddingTop()>
	//   30   60:isub            
	//   31   61:aload_0         
	//   32   62:invokevirtual   #196 <Method int getPaddingBottom()>
	//   33   65:isub            
	//   34   66:aload           5
	//   35   68:getfield        #186 <Field int android.widget.FrameLayout$LayoutParams.topMargin>
	//   36   71:isub            
	//   37   72:aload           5
	//   38   74:getfield        #189 <Field int android.widget.FrameLayout$LayoutParams.bottomMargin>
	//   39   77:isub            
	//   40   78:istore_3        
			if(j < k)
	//*  41   79:iload_2         
	//*  42   80:iload_3         
	//*  43   81:icmpge          126
				view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutparams.leftMargin + layoutparams.rightMargin, layoutparams.width), android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000));
	//   44   84:aload           4
	//   45   86:iload_1         
	//   46   87:aload_0         
	//   47   88:invokevirtual   #591 <Method int getPaddingLeft()>
	//   48   91:aload_0         
	//   49   92:invokevirtual   #594 <Method int getPaddingRight()>
	//   50   95:iadd            
	//   51   96:aload           5
	//   52   98:getfield        #797 <Field int android.widget.FrameLayout$LayoutParams.leftMargin>
	//   53  101:iadd            
	//   54  102:aload           5
	//   55  104:getfield        #798 <Field int android.widget.FrameLayout$LayoutParams.rightMargin>
	//   56  107:iadd            
	//   57  108:aload           5
	//   58  110:getfield        #799 <Field int android.widget.FrameLayout$LayoutParams.width>
	//   59  113:invokestatic    #673 <Method int getChildMeasureSpec(int, int, int)>
	//   60  116:iload_3         
	//   61  117:ldc2            #800 <Int 0x40000000>
	//   62  120:invokestatic    #678 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   63  123:invokevirtual   #681 <Method void View.measure(int, int)>
		}
	//   64  126:return          
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
	//    5    8:invokespecial   #804 <Method void flingWithNestedDispatch(int)>
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
	//    3    3:invokevirtual   #265 <Method boolean dispatchNestedPreFling(float, float)>
	//    4    6:ireturn         
	}

	public void onNestedPreScroll(View view, int i, int j, int ai[])
	{
		onNestedPreScroll(view, i, j, ai, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:iconst_0        
	//    6    7:invokevirtual   #811 <Method void onNestedPreScroll(View, int, int, int[], int)>
	//    7   10:return          
	}

	public void onNestedPreScroll(View view, int i, int j, int ai[], int k)
	{
		dispatchNestedPreScroll(i, j, ai, ((int []) (null)), k);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:aload           4
	//    4    5:aconst_null     
	//    5    6:iload           5
	//    6    8:invokevirtual   #511 <Method boolean dispatchNestedPreScroll(int, int, int[], int[], int)>
	//    7   11:pop             
	//    8   12:return          
	}

	public void onNestedScroll(View view, int i, int j, int k, int l)
	{
		onNestedScroll(view, i, j, k, l, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iconst_0        
	//    7    9:invokevirtual   #815 <Method void onNestedScroll(View, int, int, int, int, int)>
	//    8   12:return          
	}

	public void onNestedScroll(View view, int i, int j, int k, int l, int i1)
	{
		i = getScrollY();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #258 <Method int getScrollY()>
	//    2    4:istore_2        
		scrollBy(0, l);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:iload           5
	//    6    9:invokevirtual   #207 <Method void scrollBy(int, int)>
		i = getScrollY() - i;
	//    7   12:aload_0         
	//    8   13:invokevirtual   #258 <Method int getScrollY()>
	//    9   16:iload_2         
	//   10   17:isub            
	//   11   18:istore_2        
		dispatchNestedScroll(0, i, 0, l - i, ((int []) (null)), i1);
	//   12   19:aload_0         
	//   13   20:iconst_0        
	//   14   21:iload_2         
	//   15   22:iconst_0        
	//   16   23:iload           5
	//   17   25:iload_2         
	//   18   26:isub            
	//   19   27:aconst_null     
	//   20   28:iload           6
	//   21   30:invokevirtual   #522 <Method boolean dispatchNestedScroll(int, int, int, int, int[], int)>
	//   22   33:pop             
	//   23   34:return          
	}

	public void onNestedScrollAccepted(View view, View view1, int i)
	{
		onNestedScrollAccepted(view, view1, i, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #820 <Method void onNestedScrollAccepted(View, View, int, int)>
	//    6    8:return          
	}

	public void onNestedScrollAccepted(View view, View view1, int i, int j)
	{
		mParentHelper.onNestedScrollAccepted(view, view1, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field NestedScrollingParentHelper mParentHelper>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #821 <Method void NestedScrollingParentHelper.onNestedScrollAccepted(View, View, int, int)>
		startNestedScroll(2, j);
	//    7   12:aload_0         
	//    8   13:iconst_2        
	//    9   14:iload           4
	//   10   16:invokevirtual   #643 <Method boolean startNestedScroll(int, int)>
	//   11   19:pop             
	//   12   20:return          
	}

	protected void onOverScrolled(int i, int j, boolean flag, boolean flag1)
	{
		super.scrollTo(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #711 <Method void FrameLayout.scrollTo(int, int)>
	//    4    6:return          
	}

	protected boolean onRequestFocusInDescendants(int i, Rect rect)
	{
		int j;
		if(i == 2)
	//*   0    0:iload_1         
	//*   1    1:iconst_2        
	//*   2    2:icmpne          12
		{
			j = 130;
	//    3    5:sipush          130
	//    4    8:istore_3        
		} else
	//*   5    9:goto            22
		{
			j = i;
	//    6   12:iload_1         
	//    7   13:istore_3        
			if(i == 1)
	//*   8   14:iload_1         
	//*   9   15:iconst_1        
	//*  10   16:icmpne          22
				j = 33;
	//   11   19:bipush          33
	//   12   21:istore_3        
		}
		View view;
		if(rect == null)
	//*  13   22:aload_2         
	//*  14   23:ifnonnull       40
			view = FocusFinder.getInstance().findNextFocus(((ViewGroup) (this)), ((View) (null)), j);
	//   15   26:invokestatic    #457 <Method FocusFinder FocusFinder.getInstance()>
	//   16   29:aload_0         
	//   17   30:aconst_null     
	//   18   31:iload_3         
	//   19   32:invokevirtual   #461 <Method View FocusFinder.findNextFocus(ViewGroup, View, int)>
	//   20   35:astore          4
		else
	//*  21   37:goto            51
			view = FocusFinder.getInstance().findNextFocusFromRect(((ViewGroup) (this)), rect, j);
	//   22   40:invokestatic    #457 <Method FocusFinder FocusFinder.getInstance()>
	//   23   43:aload_0         
	//   24   44:aload_2         
	//   25   45:iload_3         
	//   26   46:invokevirtual   #829 <Method View FocusFinder.findNextFocusFromRect(ViewGroup, Rect, int)>
	//   27   49:astore          4
		if(view == null)
	//*  28   51:aload           4
	//*  29   53:ifnonnull       58
			return false;
	//   30   56:iconst_0        
	//   31   57:ireturn         
		if(isOffScreen(view))
	//*  32   58:aload_0         
	//*  33   59:aload           4
	//*  34   61:invokespecial   #475 <Method boolean isOffScreen(View)>
	//*  35   64:ifeq            69
			return false;
	//   36   67:iconst_0        
	//   37   68:ireturn         
		else
			return view.requestFocus(j, rect);
	//   38   69:aload           4
	//   39   71:iload_3         
	//   40   72:aload_2         
	//   41   73:invokevirtual   #831 <Method boolean View.requestFocus(int, Rect)>
	//   42   76:ireturn         
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
	//    5    9:invokespecial   #835 <Method void FrameLayout.onRestoreInstanceState(Parcelable)>
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
	//   12   20:invokevirtual   #839 <Method Parcelable NestedScrollView$SavedState.getSuperState()>
	//   13   23:invokespecial   #835 <Method void FrameLayout.onRestoreInstanceState(Parcelable)>
			mSavedState = ((SavedState) (parcelable));
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:putfield        #780 <Field NestedScrollView$SavedState mSavedState>
			requestLayout();
	//   17   31:aload_0         
	//   18   32:invokevirtual   #842 <Method void requestLayout()>
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
	//    3    5:invokespecial   #845 <Method Parcelable FrameLayout.onSaveInstanceState()>
	//    4    8:invokespecial   #847 <Method void NestedScrollView$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.scrollPosition = getScrollY();
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #258 <Method int getScrollY()>
	//    9   17:putfield        #783 <Field int NestedScrollView$SavedState.scrollPosition>
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
	//    5    6:invokespecial   #851 <Method void FrameLayout.onScrollChanged(int, int, int, int)>
		OnScrollChangeListener onscrollchangelistener = mOnScrollChangeListener;
	//    6    9:aload_0         
	//    7   10:getfield        #853 <Field NestedScrollView$OnScrollChangeListener mOnScrollChangeListener>
	//    8   13:astore          5
		if(onscrollchangelistener != null)
	//*   9   15:aload           5
	//*  10   17:ifnull          33
			onscrollchangelistener.onScrollChange(this, i, j, k, l);
	//   11   20:aload           5
	//   12   22:aload_0         
	//   13   23:iload_1         
	//   14   24:iload_2         
	//   15   25:iload_3         
	//   16   26:iload           4
	//   17   28:invokeinterface #857 <Method void NestedScrollView$OnScrollChangeListener.onScrollChange(NestedScrollView, int, int, int, int)>
	//   18   33:return          
	}

	protected void onSizeChanged(int i, int j, int k, int l)
	{
		super.onSizeChanged(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #860 <Method void FrameLayout.onSizeChanged(int, int, int, int)>
		View view = findFocus();
	//    6    9:aload_0         
	//    7   10:invokevirtual   #425 <Method View findFocus()>
	//    8   13:astore          5
		if(view != null)
	//*   9   15:aload           5
	//*  10   17:ifnull          71
		{
			if(this == view)
	//*  11   20:aload_0         
	//*  12   21:aload           5
	//*  13   23:if_acmpne       27
				return;
	//   14   26:return          
			if(isWithinDeltaOfScreen(view, 0, l))
	//*  15   27:aload_0         
	//*  16   28:aload           5
	//*  17   30:iconst_0        
	//*  18   31:iload           4
	//*  19   33:invokespecial   #373 <Method boolean isWithinDeltaOfScreen(View, int, int)>
	//*  20   36:ifeq            70
			{
				view.getDrawingRect(mTempRect);
	//   21   39:aload           5
	//   22   41:aload_0         
	//   23   42:getfield        #101 <Field Rect mTempRect>
	//   24   45:invokevirtual   #387 <Method void View.getDrawingRect(Rect)>
				offsetDescendantRectToMyCoords(view, mTempRect);
	//   25   48:aload_0         
	//   26   49:aload           5
	//   27   51:aload_0         
	//   28   52:getfield        #101 <Field Rect mTempRect>
	//   29   55:invokevirtual   #391 <Method void offsetDescendantRectToMyCoords(View, Rect)>
				doScrollY(computeScrollDeltaToGetChildRectOnScreen(mTempRect));
	//   30   58:aload_0         
	//   31   59:aload_0         
	//   32   60:aload_0         
	//   33   61:getfield        #101 <Field Rect mTempRect>
	//   34   64:invokevirtual   #434 <Method int computeScrollDeltaToGetChildRectOnScreen(Rect)>
	//   35   67:invokespecial   #421 <Method void doScrollY(int)>
			}
			return;
	//   36   70:return          
		} else
		{
			return;
	//   37   71:return          
		}
	}

	public boolean onStartNestedScroll(View view, View view1, int i)
	{
		return onStartNestedScroll(view, view1, i, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #865 <Method boolean onStartNestedScroll(View, View, int, int)>
	//    6    8:ireturn         
	}

	public boolean onStartNestedScroll(View view, View view1, int i, int j)
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
		onStopNestedScroll(view, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #868 <Method void onStopNestedScroll(View, int)>
	//    4    6:return          
	}

	public void onStopNestedScroll(View view, int i)
	{
		mParentHelper.onStopNestedScroll(view, i);
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field NestedScrollingParentHelper mParentHelper>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #869 <Method void NestedScrollingParentHelper.onStopNestedScroll(View, int)>
		stopNestedScroll(i);
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:invokevirtual   #214 <Method void stopNestedScroll(int)>
	//    8   14:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		initVelocityTrackerIfNotExists();
	//    0    0:aload_0         
	//    1    1:invokespecial   #745 <Method void initVelocityTrackerIfNotExists()>
		MotionEvent motionevent1 = MotionEvent.obtain(motionevent);
	//    2    4:aload_1         
	//    3    5:invokestatic    #873 <Method MotionEvent MotionEvent.obtain(MotionEvent)>
	//    4    8:astore          9
		int i = motionevent.getActionMasked();
	//    5   10:aload_1         
	//    6   11:invokevirtual   #876 <Method int MotionEvent.getActionMasked()>
	//    7   14:istore_2        
		if(i == 0)
	//*   8   15:iload_2         
	//*   9   16:ifne            24
			mNestedYOffset = 0;
	//   10   19:aload_0         
	//   11   20:iconst_0        
	//   12   21:putfield        #750 <Field int mNestedYOffset>
		motionevent1.offsetLocation(0.0F, mNestedYOffset);
	//   13   24:aload           9
	//   14   26:fconst_0        
	//   15   27:aload_0         
	//   16   28:getfield        #750 <Field int mNestedYOffset>
	//   17   31:i2f             
	//   18   32:invokevirtual   #879 <Method void MotionEvent.offsetLocation(float, float)>
		switch(i)
	//*  19   35:iload_2         
		{
		case 4: // '\004'
		default:
			break;

	//*  20   36:tableswitch     0 6: default 80
	//	               0 801
	//	               1 713
	//	               2 190
	//	               3 135
	//	               4 80
	//	               5 108
	//	               6 83
	//*  21   80:goto            893
		case 6: // '\006'
			onSecondaryPointerUp(motionevent);
	//   22   83:aload_0         
	//   23   84:aload_1         
	//   24   85:invokespecial   #772 <Method void onSecondaryPointerUp(MotionEvent)>
			mLastMotionY = (int)motionevent.getY(motionevent.findPointerIndex(mActivePointerId));
	//   25   88:aload_0         
	//   26   89:aload_1         
	//   27   90:aload_1         
	//   28   91:aload_0         
	//   29   92:getfield        #113 <Field int mActivePointerId>
	//   30   95:invokevirtual   #715 <Method int MotionEvent.findPointerIndex(int)>
	//   31   98:invokevirtual   #412 <Method float MotionEvent.getY(int)>
	//   32  101:f2i             
	//   33  102:putfield        #414 <Field int mLastMotionY>
			break;
	//   34  105:goto            893

		case 5: // '\005'
			int j = motionevent.getActionIndex();
	//   35  108:aload_1         
	//   36  109:invokevirtual   #404 <Method int MotionEvent.getActionIndex()>
	//   37  112:istore_2        
			mLastMotionY = (int)motionevent.getY(j);
	//   38  113:aload_0         
	//   39  114:aload_1         
	//   40  115:iload_2         
	//   41  116:invokevirtual   #412 <Method float MotionEvent.getY(int)>
	//   42  119:f2i             
	//   43  120:putfield        #414 <Field int mLastMotionY>
			mActivePointerId = motionevent.getPointerId(j);
	//   44  123:aload_0         
	//   45  124:aload_1         
	//   46  125:iload_2         
	//   47  126:invokevirtual   #408 <Method int MotionEvent.getPointerId(int)>
	//   48  129:putfield        #113 <Field int mActivePointerId>
			break;
	//   49  132:goto            893

		case 3: // '\003'
			if(mIsBeingDragged && getChildCount() > 0 && mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()))
	//*  50  135:aload_0         
	//*  51  136:getfield        #109 <Field boolean mIsBeingDragged>
	//*  52  139:ifeq            178
	//*  53  142:aload_0         
	//*  54  143:invokevirtual   #168 <Method int getChildCount()>
	//*  55  146:ifle            178
	//*  56  149:aload_0         
	//*  57  150:getfield        #336 <Field OverScroller mScroller>
	//*  58  153:aload_0         
	//*  59  154:invokevirtual   #514 <Method int getScrollX()>
	//*  60  157:aload_0         
	//*  61  158:invokevirtual   #258 <Method int getScrollY()>
	//*  62  161:iconst_0        
	//*  63  162:iconst_0        
	//*  64  163:iconst_0        
	//*  65  164:aload_0         
	//*  66  165:invokevirtual   #261 <Method int getScrollRange()>
	//*  67  168:invokevirtual   #760 <Method boolean OverScroller.springBack(int, int, int, int, int, int)>
	//*  68  171:ifeq            178
				ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   69  174:aload_0         
	//   70  175:invokestatic    #533 <Method void ViewCompat.postInvalidateOnAnimation(View)>
			mActivePointerId = -1;
	//   71  178:aload_0         
	//   72  179:iconst_m1       
	//   73  180:putfield        #113 <Field int mActivePointerId>
			endDrag();
	//   74  183:aload_0         
	//   75  184:invokespecial   #881 <Method void endDrag()>
			break;
	//   76  187:goto            893

		case 2: // '\002'
			int j1 = motionevent.findPointerIndex(mActivePointerId);
	//   77  190:aload_1         
	//   78  191:aload_0         
	//   79  192:getfield        #113 <Field int mActivePointerId>
	//   80  195:invokevirtual   #715 <Method int MotionEvent.findPointerIndex(int)>
	//   81  198:istore          4
			if(j1 == -1)
	//*  82  200:iload           4
	//*  83  202:iconst_m1       
	//*  84  203:icmpne          252
			{
				motionevent = ((MotionEvent) (new StringBuilder()));
	//   85  206:new             #717 <Class StringBuilder>
	//   86  209:dup             
	//   87  210:invokespecial   #718 <Method void StringBuilder()>
	//   88  213:astore_1        
				((StringBuilder) (motionevent)).append("Invalid pointerId=");
	//   89  214:aload_1         
	//   90  215:ldc2            #720 <String "Invalid pointerId=">
	//   91  218:invokevirtual   #724 <Method StringBuilder StringBuilder.append(String)>
	//   92  221:pop             
				((StringBuilder) (motionevent)).append(mActivePointerId);
	//   93  222:aload_1         
	//   94  223:aload_0         
	//   95  224:getfield        #113 <Field int mActivePointerId>
	//   96  227:invokevirtual   #727 <Method StringBuilder StringBuilder.append(int)>
	//   97  230:pop             
				((StringBuilder) (motionevent)).append(" in onTouchEvent");
	//   98  231:aload_1         
	//   99  232:ldc2            #883 <String " in onTouchEvent">
	//  100  235:invokevirtual   #724 <Method StringBuilder StringBuilder.append(String)>
	//  101  238:pop             
				Log.e("NestedScrollView", ((StringBuilder) (motionevent)).toString());
	//  102  239:ldc1            #37  <String "NestedScrollView">
	//  103  241:aload_1         
	//  104  242:invokevirtual   #733 <Method String StringBuilder.toString()>
	//  105  245:invokestatic    #739 <Method int Log.e(String, String)>
	//  106  248:pop             
				break;
	//  107  249:goto            893
			}
			int k1 = (int)motionevent.getY(j1);
	//  108  252:aload_1         
	//  109  253:iload           4
	//  110  255:invokevirtual   #412 <Method float MotionEvent.getY(int)>
	//  111  258:f2i             
	//  112  259:istore          5
			int i1 = mLastMotionY - k1;
	//  113  261:aload_0         
	//  114  262:getfield        #414 <Field int mLastMotionY>
	//  115  265:iload           5
	//  116  267:isub            
	//  117  268:istore_3        
			int k = i1;
	//  118  269:iload_3         
	//  119  270:istore_2        
			if(dispatchNestedPreScroll(0, i1, mScrollConsumed, mScrollOffset, 0))
	//* 120  271:aload_0         
	//* 121  272:iconst_0        
	//* 122  273:iload_3         
	//* 123  274:aload_0         
	//* 124  275:getfield        #117 <Field int[] mScrollConsumed>
	//* 125  278:aload_0         
	//* 126  279:getfield        #115 <Field int[] mScrollOffset>
	//* 127  282:iconst_0        
	//* 128  283:invokevirtual   #511 <Method boolean dispatchNestedPreScroll(int, int, int[], int[], int)>
	//* 129  286:ifeq            326
			{
				k = i1 - mScrollConsumed[1];
	//  130  289:iload_3         
	//  131  290:aload_0         
	//  132  291:getfield        #117 <Field int[] mScrollConsumed>
	//  133  294:iconst_1        
	//  134  295:iaload          
	//  135  296:isub            
	//  136  297:istore_2        
				motionevent1.offsetLocation(0.0F, mScrollOffset[1]);
	//  137  298:aload           9
	//  138  300:fconst_0        
	//  139  301:aload_0         
	//  140  302:getfield        #115 <Field int[] mScrollOffset>
	//  141  305:iconst_1        
	//  142  306:iaload          
	//  143  307:i2f             
	//  144  308:invokevirtual   #879 <Method void MotionEvent.offsetLocation(float, float)>
				mNestedYOffset = mNestedYOffset + mScrollOffset[1];
	//  145  311:aload_0         
	//  146  312:aload_0         
	//  147  313:getfield        #750 <Field int mNestedYOffset>
	//  148  316:aload_0         
	//  149  317:getfield        #115 <Field int[] mScrollOffset>
	//  150  320:iconst_1        
	//  151  321:iaload          
	//  152  322:iadd            
	//  153  323:putfield        #750 <Field int mNestedYOffset>
			}
			if(!mIsBeingDragged && Math.abs(k) > mTouchSlop)
	//* 154  326:aload_0         
	//* 155  327:getfield        #109 <Field boolean mIsBeingDragged>
	//* 156  330:ifne            392
	//* 157  333:iload_2         
	//* 158  334:invokestatic    #742 <Method int Math.abs(int)>
	//* 159  337:aload_0         
	//* 160  338:getfield        #356 <Field int mTouchSlop>
	//* 161  341:icmple          392
			{
				ViewParent viewparent = getParent();
	//  162  344:aload_0         
	//  163  345:invokevirtual   #751 <Method ViewParent getParent()>
	//  164  348:astore          10
				if(viewparent != null)
	//* 165  350:aload           10
	//* 166  352:ifnull          363
					viewparent.requestDisallowInterceptTouchEvent(true);
	//  167  355:aload           10
	//  168  357:iconst_1        
	//  169  358:invokeinterface #756 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
				mIsBeingDragged = true;
	//  170  363:aload_0         
	//  171  364:iconst_1        
	//  172  365:putfield        #109 <Field boolean mIsBeingDragged>
				if(k > 0)
	//* 173  368:iload_2         
	//* 174  369:ifle            382
					k -= mTouchSlop;
	//  175  372:iload_2         
	//  176  373:aload_0         
	//  177  374:getfield        #356 <Field int mTouchSlop>
	//  178  377:isub            
	//  179  378:istore_2        
				else
	//* 180  379:goto            392
					k += mTouchSlop;
	//  181  382:iload_2         
	//  182  383:aload_0         
	//  183  384:getfield        #356 <Field int mTouchSlop>
	//  184  387:iadd            
	//  185  388:istore_2        
			}
	//* 186  389:goto            392
			if(!mIsBeingDragged)
				break;
	//  187  392:aload_0         
	//  188  393:getfield        #109 <Field boolean mIsBeingDragged>
	//  189  396:ifeq            893
			mLastMotionY = k1 - mScrollOffset[1];
	//  190  399:aload_0         
	//  191  400:iload           5
	//  192  402:aload_0         
	//  193  403:getfield        #115 <Field int[] mScrollOffset>
	//  194  406:iconst_1        
	//  195  407:iaload          
	//  196  408:isub            
	//  197  409:putfield        #414 <Field int mLastMotionY>
			int l1 = getScrollY();
	//  198  412:aload_0         
	//  199  413:invokevirtual   #258 <Method int getScrollY()>
	//  200  416:istore          6
			k1 = getScrollRange();
	//  201  418:aload_0         
	//  202  419:invokevirtual   #261 <Method int getScrollRange()>
	//  203  422:istore          5
			i1 = getOverScrollMode();
	//  204  424:aload_0         
	//  205  425:invokevirtual   #227 <Method int getOverScrollMode()>
	//  206  428:istore_3        
			if(i1 != 0 && (i1 != 1 || k1 <= 0))
	//* 207  429:iload_3         
	//* 208  430:ifeq            451
	//* 209  433:iload_3         
	//* 210  434:iconst_1        
	//* 211  435:icmpne          446
	//* 212  438:iload           5
	//* 213  440:ifle            446
	//* 214  443:goto            451
				i1 = 0;
	//  215  446:iconst_0        
	//  216  447:istore_3        
			else
	//* 217  448:goto            453
				i1 = 1;
	//  218  451:iconst_1        
	//  219  452:istore_3        
			if(overScrollByCompat(0, k, 0, getScrollY(), 0, k1, 0, 0, true) && !hasNestedScrollingParent(0))
	//* 220  453:aload_0         
	//* 221  454:iconst_0        
	//* 222  455:iload_2         
	//* 223  456:iconst_0        
	//* 224  457:aload_0         
	//* 225  458:invokevirtual   #258 <Method int getScrollY()>
	//* 226  461:iconst_0        
	//* 227  462:iload           5
	//* 228  464:iconst_0        
	//* 229  465:iconst_0        
	//* 230  466:iconst_1        
	//* 231  467:invokevirtual   #518 <Method boolean overScrollByCompat(int, int, int, int, int, int, int, int, boolean)>
	//* 232  470:ifeq            488
	//* 233  473:aload_0         
	//* 234  474:iconst_0        
	//* 235  475:invokevirtual   #536 <Method boolean hasNestedScrollingParent(int)>
	//* 236  478:ifne            488
				mVelocityTracker.clear();
	//  237  481:aload_0         
	//  238  482:getfield        #322 <Field VelocityTracker mVelocityTracker>
	//  239  485:invokevirtual   #331 <Method void VelocityTracker.clear()>
			int i2 = getScrollY() - l1;
	//  240  488:aload_0         
	//  241  489:invokevirtual   #258 <Method int getScrollY()>
	//  242  492:iload           6
	//  243  494:isub            
	//  244  495:istore          7
			if(dispatchNestedScroll(0, i2, 0, k - i2, mScrollOffset, 0))
	//* 245  497:aload_0         
	//* 246  498:iconst_0        
	//* 247  499:iload           7
	//* 248  501:iconst_0        
	//* 249  502:iload_2         
	//* 250  503:iload           7
	//* 251  505:isub            
	//* 252  506:aload_0         
	//* 253  507:getfield        #115 <Field int[] mScrollOffset>
	//* 254  510:iconst_0        
	//* 255  511:invokevirtual   #522 <Method boolean dispatchNestedScroll(int, int, int, int, int[], int)>
	//* 256  514:ifeq            564
			{
				k = mLastMotionY;
	//  257  517:aload_0         
	//  258  518:getfield        #414 <Field int mLastMotionY>
	//  259  521:istore_2        
				motionevent = ((MotionEvent) (mScrollOffset));
	//  260  522:aload_0         
	//  261  523:getfield        #115 <Field int[] mScrollOffset>
	//  262  526:astore_1        
				mLastMotionY = k - motionevent[1];
	//  263  527:aload_0         
	//  264  528:iload_2         
	//  265  529:aload_1         
	//  266  530:iconst_1        
	//  267  531:iaload          
	//  268  532:isub            
	//  269  533:putfield        #414 <Field int mLastMotionY>
				motionevent1.offsetLocation(0.0F, motionevent[1]);
	//  270  536:aload           9
	//  271  538:fconst_0        
	//  272  539:aload_1         
	//  273  540:iconst_1        
	//  274  541:iaload          
	//  275  542:i2f             
	//  276  543:invokevirtual   #879 <Method void MotionEvent.offsetLocation(float, float)>
				mNestedYOffset = mNestedYOffset + mScrollOffset[1];
	//  277  546:aload_0         
	//  278  547:aload_0         
	//  279  548:getfield        #750 <Field int mNestedYOffset>
	//  280  551:aload_0         
	//  281  552:getfield        #115 <Field int[] mScrollOffset>
	//  282  555:iconst_1        
	//  283  556:iaload          
	//  284  557:iadd            
	//  285  558:putfield        #750 <Field int mNestedYOffset>
				break;
	//  286  561:goto            893
			}
			if(!i1)
				break;
	//  287  564:iload_3         
	//  288  565:ifeq            893
			ensureGlows();
	//  289  568:aload_0         
	//  290  569:invokespecial   #524 <Method void ensureGlows()>
			i1 = l1 + k;
	//  291  572:iload           6
	//  292  574:iload_2         
	//  293  575:iadd            
	//  294  576:istore_3        
			if(i1 < 0)
	//* 295  577:iload_3         
	//* 296  578:ifge            628
			{
				EdgeEffectCompat.onPull(mEdgeGlowTop, (float)k / (float)getHeight(), motionevent.getX(j1) / (float)getWidth());
	//  297  581:aload_0         
	//  298  582:getfield        #216 <Field EdgeEffect mEdgeGlowTop>
	//  299  585:iload_2         
	//  300  586:i2f             
	//  301  587:aload_0         
	//  302  588:invokevirtual   #190 <Method int getHeight()>
	//  303  591:i2f             
	//  304  592:fdiv            
	//  305  593:aload_1         
	//  306  594:iload           4
	//  307  596:invokevirtual   #885 <Method float MotionEvent.getX(int)>
	//  308  599:aload_0         
	//  309  600:invokevirtual   #580 <Method int getWidth()>
	//  310  603:i2f             
	//  311  604:fdiv            
	//  312  605:invokestatic    #891 <Method void EdgeEffectCompat.onPull(EdgeEffect, float, float)>
				if(!mEdgeGlowBottom.isFinished())
	//* 313  608:aload_0         
	//* 314  609:getfield        #223 <Field EdgeEffect mEdgeGlowBottom>
	//* 315  612:invokevirtual   #572 <Method boolean EdgeEffect.isFinished()>
	//* 316  615:ifne            680
					mEdgeGlowBottom.onRelease();
	//  317  618:aload_0         
	//  318  619:getfield        #223 <Field EdgeEffect mEdgeGlowBottom>
	//  319  622:invokevirtual   #221 <Method void EdgeEffect.onRelease()>
			} else
	//* 320  625:goto            680
			if(i1 > k1)
	//* 321  628:iload_3         
	//* 322  629:iload           5
	//* 323  631:icmple          680
			{
				EdgeEffectCompat.onPull(mEdgeGlowBottom, (float)k / (float)getHeight(), 1.0F - motionevent.getX(j1) / (float)getWidth());
	//  324  634:aload_0         
	//  325  635:getfield        #223 <Field EdgeEffect mEdgeGlowBottom>
	//  326  638:iload_2         
	//  327  639:i2f             
	//  328  640:aload_0         
	//  329  641:invokevirtual   #190 <Method int getHeight()>
	//  330  644:i2f             
	//  331  645:fdiv            
	//  332  646:fconst_1        
	//  333  647:aload_1         
	//  334  648:iload           4
	//  335  650:invokevirtual   #885 <Method float MotionEvent.getX(int)>
	//  336  653:aload_0         
	//  337  654:invokevirtual   #580 <Method int getWidth()>
	//  338  657:i2f             
	//  339  658:fdiv            
	//  340  659:fsub            
	//  341  660:invokestatic    #891 <Method void EdgeEffectCompat.onPull(EdgeEffect, float, float)>
				if(!mEdgeGlowTop.isFinished())
	//* 342  663:aload_0         
	//* 343  664:getfield        #216 <Field EdgeEffect mEdgeGlowTop>
	//* 344  667:invokevirtual   #572 <Method boolean EdgeEffect.isFinished()>
	//* 345  670:ifne            680
					mEdgeGlowTop.onRelease();
	//  346  673:aload_0         
	//  347  674:getfield        #216 <Field EdgeEffect mEdgeGlowTop>
	//  348  677:invokevirtual   #221 <Method void EdgeEffect.onRelease()>
			}
			motionevent = ((MotionEvent) (mEdgeGlowTop));
	//  349  680:aload_0         
	//  350  681:getfield        #216 <Field EdgeEffect mEdgeGlowTop>
	//  351  684:astore_1        
			if(motionevent != null && (!((EdgeEffect) (motionevent)).isFinished() || !mEdgeGlowBottom.isFinished()))
	//* 352  685:aload_1         
	//* 353  686:ifnull          893
	//* 354  689:aload_1         
	//* 355  690:invokevirtual   #572 <Method boolean EdgeEffect.isFinished()>
	//* 356  693:ifeq            706
	//* 357  696:aload_0         
	//* 358  697:getfield        #223 <Field EdgeEffect mEdgeGlowBottom>
	//* 359  700:invokevirtual   #572 <Method boolean EdgeEffect.isFinished()>
	//* 360  703:ifne            893
				ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//  361  706:aload_0         
	//  362  707:invokestatic    #533 <Method void ViewCompat.postInvalidateOnAnimation(View)>
			break;
	//  363  710:goto            893

		case 1: // '\001'
			motionevent = ((MotionEvent) (mVelocityTracker));
	//  364  713:aload_0         
	//  365  714:getfield        #322 <Field VelocityTracker mVelocityTracker>
	//  366  717:astore_1        
			((VelocityTracker) (motionevent)).computeCurrentVelocity(1000, mMaximumVelocity);
	//  367  718:aload_1         
	//  368  719:sipush          1000
	//  369  722:aload_0         
	//  370  723:getfield        #366 <Field int mMaximumVelocity>
	//  371  726:i2f             
	//  372  727:invokevirtual   #895 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
			int l = (int)((VelocityTracker) (motionevent)).getYVelocity(mActivePointerId);
	//  373  730:aload_1         
	//  374  731:aload_0         
	//  375  732:getfield        #113 <Field int mActivePointerId>
	//  376  735:invokevirtual   #898 <Method float VelocityTracker.getYVelocity(int)>
	//  377  738:f2i             
	//  378  739:istore_2        
			if(Math.abs(l) > mMinimumVelocity)
	//* 379  740:iload_2         
	//* 380  741:invokestatic    #742 <Method int Math.abs(int)>
	//* 381  744:aload_0         
	//* 382  745:getfield        #361 <Field int mMinimumVelocity>
	//* 383  748:icmple          760
				flingWithNestedDispatch(-l);
	//  384  751:aload_0         
	//  385  752:iload_2         
	//  386  753:ineg            
	//  387  754:invokespecial   #804 <Method void flingWithNestedDispatch(int)>
			else
	//* 388  757:goto            789
			if(mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()))
	//* 389  760:aload_0         
	//* 390  761:getfield        #336 <Field OverScroller mScroller>
	//* 391  764:aload_0         
	//* 392  765:invokevirtual   #514 <Method int getScrollX()>
	//* 393  768:aload_0         
	//* 394  769:invokevirtual   #258 <Method int getScrollY()>
	//* 395  772:iconst_0        
	//* 396  773:iconst_0        
	//* 397  774:iconst_0        
	//* 398  775:aload_0         
	//* 399  776:invokevirtual   #261 <Method int getScrollRange()>
	//* 400  779:invokevirtual   #760 <Method boolean OverScroller.springBack(int, int, int, int, int, int)>
	//* 401  782:ifeq            789
				ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//  402  785:aload_0         
	//  403  786:invokestatic    #533 <Method void ViewCompat.postInvalidateOnAnimation(View)>
			mActivePointerId = -1;
	//  404  789:aload_0         
	//  405  790:iconst_m1       
	//  406  791:putfield        #113 <Field int mActivePointerId>
			endDrag();
	//  407  794:aload_0         
	//  408  795:invokespecial   #881 <Method void endDrag()>
			break;
	//  409  798:goto            893

		case 0: // '\0'
			if(getChildCount() == 0)
	//* 410  801:aload_0         
	//* 411  802:invokevirtual   #168 <Method int getChildCount()>
	//* 412  805:ifne            810
				return false;
	//  413  808:iconst_0        
	//  414  809:ireturn         
			boolean flag = mScroller.isFinished() ^ true;
	//  415  810:aload_0         
	//  416  811:getfield        #336 <Field OverScroller mScroller>
	//  417  814:invokevirtual   #770 <Method boolean OverScroller.isFinished()>
	//  418  817:iconst_1        
	//  419  818:ixor            
	//  420  819:istore          8
			mIsBeingDragged = flag;
	//  421  821:aload_0         
	//  422  822:iload           8
	//  423  824:putfield        #109 <Field boolean mIsBeingDragged>
			if(flag)
	//* 424  827:iload           8
	//* 425  829:ifeq            851
			{
				ViewParent viewparent1 = getParent();
	//  426  832:aload_0         
	//  427  833:invokevirtual   #751 <Method ViewParent getParent()>
	//  428  836:astore          10
				if(viewparent1 != null)
	//* 429  838:aload           10
	//* 430  840:ifnull          851
					viewparent1.requestDisallowInterceptTouchEvent(true);
	//  431  843:aload           10
	//  432  845:iconst_1        
	//  433  846:invokeinterface #756 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
			}
			if(!mScroller.isFinished())
	//* 434  851:aload_0         
	//* 435  852:getfield        #336 <Field OverScroller mScroller>
	//* 436  855:invokevirtual   #770 <Method boolean OverScroller.isFinished()>
	//* 437  858:ifne            868
				mScroller.abortAnimation();
	//  438  861:aload_0         
	//  439  862:getfield        #336 <Field OverScroller mScroller>
	//  440  865:invokevirtual   #901 <Method void OverScroller.abortAnimation()>
			mLastMotionY = (int)motionevent.getY();
	//  441  868:aload_0         
	//  442  869:aload_1         
	//  443  870:invokevirtual   #762 <Method float MotionEvent.getY()>
	//  444  873:f2i             
	//  445  874:putfield        #414 <Field int mLastMotionY>
			mActivePointerId = motionevent.getPointerId(0);
	//  446  877:aload_0         
	//  447  878:aload_1         
	//  448  879:iconst_0        
	//  449  880:invokevirtual   #408 <Method int MotionEvent.getPointerId(int)>
	//  450  883:putfield        #113 <Field int mActivePointerId>
			startNestedScroll(2, 0);
	//  451  886:aload_0         
	//  452  887:iconst_2        
	//  453  888:iconst_0        
	//  454  889:invokevirtual   #643 <Method boolean startNestedScroll(int, int)>
	//  455  892:pop             
			break;
		}
		motionevent = ((MotionEvent) (mVelocityTracker));
	//  456  893:aload_0         
	//  457  894:getfield        #322 <Field VelocityTracker mVelocityTracker>
	//  458  897:astore_1        
		if(motionevent != null)
	//* 459  898:aload_1         
	//* 460  899:ifnull          908
			((VelocityTracker) (motionevent)).addMovement(motionevent1);
	//  461  902:aload_1         
	//  462  903:aload           9
	//  463  905:invokevirtual   #748 <Method void VelocityTracker.addMovement(MotionEvent)>
		motionevent1.recycle();
	//  464  908:aload           9
	//  465  910:invokevirtual   #902 <Method void MotionEvent.recycle()>
		return true;
	//  466  913:iconst_1        
	//  467  914:ireturn         
	}

	boolean overScrollByCompat(int i, int j, int k, int l, int i1, int j1, int k1, 
			int l1, boolean flag)
	{
label0:
		{
			int k2 = getOverScrollMode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #227 <Method int getOverScrollMode()>
	//    2    4:istore          12
			int i2 = computeHorizontalScrollRange();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #903 <Method int computeHorizontalScrollRange()>
	//    5   10:istore          10
			int j2 = computeHorizontalScrollExtent();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #904 <Method int computeHorizontalScrollExtent()>
	//    8   16:istore          11
			boolean flag4 = false;
	//    9   18:iconst_0        
	//   10   19:istore          14
			if(i2 > j2)
	//*  11   21:iload           10
	//*  12   23:iload           11
	//*  13   25:icmple          34
				i2 = 1;
	//   14   28:iconst_1        
	//   15   29:istore          10
			else
	//*  16   31:goto            37
				i2 = 0;
	//   17   34:iconst_0        
	//   18   35:istore          10
			if(computeVerticalScrollRange() > computeVerticalScrollExtent())
	//*  19   37:aload_0         
	//*  20   38:invokevirtual   #906 <Method int computeVerticalScrollRange()>
	//*  21   41:aload_0         
	//*  22   42:invokevirtual   #907 <Method int computeVerticalScrollExtent()>
	//*  23   45:icmple          54
				j2 = 1;
	//   24   48:iconst_1        
	//   25   49:istore          11
			else
	//*  26   51:goto            57
				j2 = 0;
	//   27   54:iconst_0        
	//   28   55:istore          11
			boolean flag1;
			if(k2 != 0 && (k2 != 1 || !i2))
	//*  29   57:iload           12
	//*  30   59:ifeq            82
	//*  31   62:iload           12
	//*  32   64:iconst_1        
	//*  33   65:icmpne          76
	//*  34   68:iload           10
	//*  35   70:ifeq            76
	//*  36   73:goto            82
				flag1 = false;
	//   37   76:iconst_0        
	//   38   77:istore          10
			else
	//*  39   79:goto            85
				flag1 = true;
	//   40   82:iconst_1        
	//   41   83:istore          10
			boolean flag2;
			if(k2 != 0 && (k2 != 1 || !j2))
	//*  42   85:iload           12
	//*  43   87:ifeq            110
	//*  44   90:iload           12
	//*  45   92:iconst_1        
	//*  46   93:icmpne          104
	//*  47   96:iload           11
	//*  48   98:ifeq            104
	//*  49  101:goto            110
				flag2 = false;
	//   50  104:iconst_0        
	//   51  105:istore          11
			else
	//*  52  107:goto            113
				flag2 = true;
	//   53  110:iconst_1        
	//   54  111:istore          11
			k += i;
	//   55  113:iload_3         
	//   56  114:iload_1         
	//   57  115:iadd            
	//   58  116:istore_3        
			if(!flag1)
	//*  59  117:iload           10
	//*  60  119:ifne            127
				i = 0;
	//   61  122:iconst_0        
	//   62  123:istore_1        
			else
	//*  63  124:goto            130
				i = k1;
	//   64  127:iload           7
	//   65  129:istore_1        
			l += j;
	//   66  130:iload           4
	//   67  132:iload_2         
	//   68  133:iadd            
	//   69  134:istore          4
			if(!flag2)
	//*  70  136:iload           11
	//*  71  138:ifne            146
				j = 0;
	//   72  141:iconst_0        
	//   73  142:istore_2        
			else
	//*  74  143:goto            149
				j = l1;
	//   75  146:iload           8
	//   76  148:istore_2        
			k1 = -i;
	//   77  149:iload_1         
	//   78  150:ineg            
	//   79  151:istore          7
			i += i1;
	//   80  153:iload_1         
	//   81  154:iload           5
	//   82  156:iadd            
	//   83  157:istore_1        
			i1 = -j;
	//   84  158:iload_2         
	//   85  159:ineg            
	//   86  160:istore          5
			j += j1;
	//   87  162:iload_2         
	//   88  163:iload           6
	//   89  165:iadd            
	//   90  166:istore_2        
			if(k > i)
	//*  91  167:iload_3         
	//*  92  168:iload_1         
	//*  93  169:icmple          178
				flag = true;
	//   94  172:iconst_1        
	//   95  173:istore          9
			else
	//*  96  175:goto            198
			if(k < k1)
	//*  97  178:iload_3         
	//*  98  179:iload           7
	//*  99  181:icmpge          193
			{
				flag = true;
	//  100  184:iconst_1        
	//  101  185:istore          9
				i = k1;
	//  102  187:iload           7
	//  103  189:istore_1        
			} else
	//* 104  190:goto            198
			{
				i = k;
	//  105  193:iload_3         
	//  106  194:istore_1        
				flag = false;
	//  107  195:iconst_0        
	//  108  196:istore          9
			}
			boolean flag3;
			if(l > j)
	//* 109  198:iload           4
	//* 110  200:iload_2         
	//* 111  201:icmple          210
				flag3 = true;
	//  112  204:iconst_1        
	//  113  205:istore          13
			else
	//* 114  207:goto            232
			if(l < i1)
	//* 115  210:iload           4
	//* 116  212:iload           5
	//* 117  214:icmpge          226
			{
				flag3 = true;
	//  118  217:iconst_1        
	//  119  218:istore          13
				j = i1;
	//  120  220:iload           5
	//  121  222:istore_2        
			} else
	//* 122  223:goto            232
			{
				flag3 = false;
	//  123  226:iconst_0        
	//  124  227:istore          13
				j = l;
	//  125  229:iload           4
	//  126  231:istore_2        
			}
			if(flag3 && !hasNestedScrollingParent(1))
	//* 127  232:iload           13
	//* 128  234:ifeq            262
	//* 129  237:aload_0         
	//* 130  238:iconst_1        
	//* 131  239:invokevirtual   #536 <Method boolean hasNestedScrollingParent(int)>
	//* 132  242:ifne            262
				mScroller.springBack(i, j, 0, 0, 0, getScrollRange());
	//  133  245:aload_0         
	//  134  246:getfield        #336 <Field OverScroller mScroller>
	//  135  249:iload_1         
	//  136  250:iload_2         
	//  137  251:iconst_0        
	//  138  252:iconst_0        
	//  139  253:iconst_0        
	//  140  254:aload_0         
	//  141  255:invokevirtual   #261 <Method int getScrollRange()>
	//  142  258:invokevirtual   #760 <Method boolean OverScroller.springBack(int, int, int, int, int, int)>
	//  143  261:pop             
			onOverScrolled(i, j, flag, flag3);
	//  144  262:aload_0         
	//  145  263:iload_1         
	//  146  264:iload_2         
	//  147  265:iload           9
	//  148  267:iload           13
	//  149  269:invokevirtual   #909 <Method void onOverScrolled(int, int, boolean, boolean)>
			if(!flag)
	//* 150  272:iload           9
	//* 151  274:ifne            286
			{
				flag = flag4;
	//  152  277:iload           14
	//  153  279:istore          9
				if(!flag3)
					break label0;
	//  154  281:iload           13
	//  155  283:ifeq            289
			}
			flag = true;
	//  156  286:iconst_1        
	//  157  287:istore          9
		}
		return flag;
	//  158  289:iload           9
	//  159  291:ireturn         
	}

	public boolean pageScroll(int i)
	{
		boolean flag;
		if(i == 130)
	//*   0    0:iload_1         
	//*   1    1:sipush          130
	//*   2    4:icmpne          12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		int k = getHeight();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #190 <Method int getHeight()>
	//   10   18:istore_3        
		if(flag)
	//*  11   19:iload_2         
	//*  12   20:ifeq            107
		{
			mTempRect.top = getScrollY() + k;
	//   13   23:aload_0         
	//   14   24:getfield        #101 <Field Rect mTempRect>
	//   15   27:aload_0         
	//   16   28:invokevirtual   #258 <Method int getScrollY()>
	//   17   31:iload_3         
	//   18   32:iadd            
	//   19   33:putfield        #397 <Field int Rect.top>
			int j = getChildCount();
	//   20   36:aload_0         
	//   21   37:invokevirtual   #168 <Method int getChildCount()>
	//   22   40:istore_2        
			if(j > 0)
	//*  23   41:iload_2         
	//*  24   42:ifle            138
			{
				View view = getChildAt(j - 1);
	//   25   45:aload_0         
	//   26   46:iload_2         
	//   27   47:iconst_1        
	//   28   48:isub            
	//   29   49:invokevirtual   #172 <Method View getChildAt(int)>
	//   30   52:astore          4
				android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
	//   31   54:aload           4
	//   32   56:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   33   59:checkcast       #180 <Class android.widget.FrameLayout$LayoutParams>
	//   34   62:astore          5
				j = view.getBottom() + layoutparams.bottomMargin + getPaddingBottom();
	//   35   64:aload           4
	//   36   66:invokevirtual   #254 <Method int View.getBottom()>
	//   37   69:aload           5
	//   38   71:getfield        #189 <Field int android.widget.FrameLayout$LayoutParams.bottomMargin>
	//   39   74:iadd            
	//   40   75:aload_0         
	//   41   76:invokevirtual   #196 <Method int getPaddingBottom()>
	//   42   79:iadd            
	//   43   80:istore_2        
				if(mTempRect.top + k > j)
	//*  44   81:aload_0         
	//*  45   82:getfield        #101 <Field Rect mTempRect>
	//*  46   85:getfield        #397 <Field int Rect.top>
	//*  47   88:iload_3         
	//*  48   89:iadd            
	//*  49   90:iload_2         
	//*  50   91:icmple          138
					mTempRect.top = j - k;
	//   51   94:aload_0         
	//   52   95:getfield        #101 <Field Rect mTempRect>
	//   53   98:iload_2         
	//   54   99:iload_3         
	//   55  100:isub            
	//   56  101:putfield        #397 <Field int Rect.top>
			}
		} else
	//*  57  104:goto            138
		{
			mTempRect.top = getScrollY() - k;
	//   58  107:aload_0         
	//   59  108:getfield        #101 <Field Rect mTempRect>
	//   60  111:aload_0         
	//   61  112:invokevirtual   #258 <Method int getScrollY()>
	//   62  115:iload_3         
	//   63  116:isub            
	//   64  117:putfield        #397 <Field int Rect.top>
			if(mTempRect.top < 0)
	//*  65  120:aload_0         
	//*  66  121:getfield        #101 <Field Rect mTempRect>
	//*  67  124:getfield        #397 <Field int Rect.top>
	//*  68  127:ifge            138
				mTempRect.top = 0;
	//   69  130:aload_0         
	//   70  131:getfield        #101 <Field Rect mTempRect>
	//   71  134:iconst_0        
	//   72  135:putfield        #397 <Field int Rect.top>
		}
		Rect rect = mTempRect;
	//   73  138:aload_0         
	//   74  139:getfield        #101 <Field Rect mTempRect>
	//   75  142:astore          4
		rect.bottom = rect.top + k;
	//   76  144:aload           4
	//   77  146:aload           4
	//   78  148:getfield        #397 <Field int Rect.top>
	//   79  151:iload_3         
	//   80  152:iadd            
	//   81  153:putfield        #394 <Field int Rect.bottom>
		return scrollAndFocus(i, mTempRect.top, mTempRect.bottom);
	//   82  156:aload_0         
	//   83  157:iload_1         
	//   84  158:aload_0         
	//   85  159:getfield        #101 <Field Rect mTempRect>
	//   86  162:getfield        #397 <Field int Rect.top>
	//   87  165:aload_0         
	//   88  166:getfield        #101 <Field Rect mTempRect>
	//   89  169:getfield        #394 <Field int Rect.bottom>
	//   90  172:invokespecial   #650 <Method boolean scrollAndFocus(int, int, int)>
	//   91  175:ireturn         
	}

	public void requestChildFocus(View view, View view1)
	{
		if(!mIsLayoutDirty)
	//*   0    0:aload_0         
	//*   1    1:getfield        #103 <Field boolean mIsLayoutDirty>
	//*   2    4:ifne            15
			scrollToChild(view1);
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:invokespecial   #778 <Method void scrollToChild(View)>
		else
	//*   6   12:goto            20
			mChildToScrollTo = view1;
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:putfield        #107 <Field View mChildToScrollTo>
		super.requestChildFocus(view, view1);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokespecial   #913 <Method void FrameLayout.requestChildFocus(View, View)>
	//   14   26:return          
	}

	public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean flag)
	{
		rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #316 <Method int View.getLeft()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #916 <Method int View.getScrollX()>
	//    5    9:isub            
	//    6   10:aload_1         
	//    7   11:invokevirtual   #251 <Method int View.getTop()>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #917 <Method int View.getScrollY()>
	//   10   18:isub            
	//   11   19:invokevirtual   #920 <Method void Rect.offset(int, int)>
		return scrollToChildRect(rect, flag);
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:iload_3         
	//   15   25:invokespecial   #922 <Method boolean scrollToChildRect(Rect, boolean)>
	//   16   28:ireturn         
	}

	public void requestDisallowInterceptTouchEvent(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            8
			recycleVelocityTracker();
	//    2    4:aload_0         
	//    3    5:invokespecial   #211 <Method void recycleVelocityTracker()>
		super.requestDisallowInterceptTouchEvent(flag);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokespecial   #923 <Method void FrameLayout.requestDisallowInterceptTouchEvent(boolean)>
	//    7   13:return          
	}

	public void requestLayout()
	{
		mIsLayoutDirty = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #103 <Field boolean mIsLayoutDirty>
		super.requestLayout();
	//    3    5:aload_0         
	//    4    6:invokespecial   #924 <Method void FrameLayout.requestLayout()>
	//    5    9:return          
	}

	public void scrollTo(int i, int j)
	{
		if(getChildCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #168 <Method int getChildCount()>
	//*   2    4:ifle            164
		{
			View view = getChildAt(0);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #172 <Method View getChildAt(int)>
	//    6   12:astore          15
			android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
	//    7   14:aload           15
	//    8   16:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    9   19:checkcast       #180 <Class android.widget.FrameLayout$LayoutParams>
	//   10   22:astore          16
			int i2 = getWidth();
	//   11   24:aload_0         
	//   12   25:invokevirtual   #580 <Method int getWidth()>
	//   13   28:istore          9
			int j2 = getPaddingLeft();
	//   14   30:aload_0         
	//   15   31:invokevirtual   #591 <Method int getPaddingLeft()>
	//   16   34:istore          10
			int k2 = getPaddingRight();
	//   17   36:aload_0         
	//   18   37:invokevirtual   #594 <Method int getPaddingRight()>
	//   19   40:istore          11
			int l2 = view.getWidth();
	//   20   42:aload           15
	//   21   44:invokevirtual   #925 <Method int View.getWidth()>
	//   22   47:istore          12
			int i3 = layoutparams.leftMargin;
	//   23   49:aload           16
	//   24   51:getfield        #797 <Field int android.widget.FrameLayout$LayoutParams.leftMargin>
	//   25   54:istore          13
			int j3 = layoutparams.rightMargin;
	//   26   56:aload           16
	//   27   58:getfield        #798 <Field int android.widget.FrameLayout$LayoutParams.rightMargin>
	//   28   61:istore          14
			int k = getHeight();
	//   29   63:aload_0         
	//   30   64:invokevirtual   #190 <Method int getHeight()>
	//   31   67:istore_3        
			int l = getPaddingTop();
	//   32   68:aload_0         
	//   33   69:invokevirtual   #193 <Method int getPaddingTop()>
	//   34   72:istore          4
			int i1 = getPaddingBottom();
	//   35   74:aload_0         
	//   36   75:invokevirtual   #196 <Method int getPaddingBottom()>
	//   37   78:istore          5
			int j1 = view.getHeight();
	//   38   80:aload           15
	//   39   82:invokevirtual   #183 <Method int View.getHeight()>
	//   40   85:istore          6
			int k1 = layoutparams.topMargin;
	//   41   87:aload           16
	//   42   89:getfield        #186 <Field int android.widget.FrameLayout$LayoutParams.topMargin>
	//   43   92:istore          7
			int l1 = layoutparams.bottomMargin;
	//   44   94:aload           16
	//   45   96:getfield        #189 <Field int android.widget.FrameLayout$LayoutParams.bottomMargin>
	//   46   99:istore          8
			i = clamp(i, i2 - j2 - k2, l2 + i3 + j3);
	//   47  101:iload_1         
	//   48  102:iload           9
	//   49  104:iload           10
	//   50  106:isub            
	//   51  107:iload           11
	//   52  109:isub            
	//   53  110:iload           12
	//   54  112:iload           13
	//   55  114:iadd            
	//   56  115:iload           14
	//   57  117:iadd            
	//   58  118:invokestatic    #789 <Method int clamp(int, int, int)>
	//   59  121:istore_1        
			j = clamp(j, k - l - i1, j1 + k1 + l1);
	//   60  122:iload_2         
	//   61  123:iload_3         
	//   62  124:iload           4
	//   63  126:isub            
	//   64  127:iload           5
	//   65  129:isub            
	//   66  130:iload           6
	//   67  132:iload           7
	//   68  134:iadd            
	//   69  135:iload           8
	//   70  137:iadd            
	//   71  138:invokestatic    #789 <Method int clamp(int, int, int)>
	//   72  141:istore_2        
			if(i != getScrollX() || j != getScrollY())
	//*  73  142:iload_1         
	//*  74  143:aload_0         
	//*  75  144:invokevirtual   #514 <Method int getScrollX()>
	//*  76  147:icmpne          158
	//*  77  150:iload_2         
	//*  78  151:aload_0         
	//*  79  152:invokevirtual   #258 <Method int getScrollY()>
	//*  80  155:icmpeq          164
				super.scrollTo(i, j);
	//   81  158:aload_0         
	//   82  159:iload_1         
	//   83  160:iload_2         
	//   84  161:invokespecial   #711 <Method void FrameLayout.scrollTo(int, int)>
		}
	//   85  164:return          
	}

	public void setFillViewport(boolean flag)
	{
		if(flag != mFillViewport)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #659 <Field boolean mFillViewport>
	//*   3    5:icmpeq          17
		{
			mFillViewport = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #659 <Field boolean mFillViewport>
			requestLayout();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #842 <Method void requestLayout()>
		}
	//    9   17:return          
	}

	public void setNestedScrollingEnabled(boolean flag)
	{
		mChildHelper.setNestedScrollingEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #926 <Method void NestedScrollingChildHelper.setNestedScrollingEnabled(boolean)>
	//    4    8:return          
	}

	public void setOnScrollChangeListener(OnScrollChangeListener onscrollchangelistener)
	{
		mOnScrollChangeListener = onscrollchangelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #853 <Field NestedScrollView$OnScrollChangeListener mOnScrollChangeListener>
	//    3    5:return          
	}

	public void setSmoothScrollingEnabled(boolean flag)
	{
		mSmoothScrollingEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #111 <Field boolean mSmoothScrollingEnabled>
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
	//*   1    1:invokevirtual   #168 <Method int getChildCount()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(AnimationUtils.currentAnimationTimeMillis() - mLastScroll > 250L)
	//*   4    8:invokestatic    #936 <Method long AnimationUtils.currentAnimationTimeMillis()>
	//*   5   11:aload_0         
	//*   6   12:getfield        #938 <Field long mLastScroll>
	//*   7   15:lsub            
	//*   8   16:ldc2w           #939 <Long 250L>
	//*   9   19:lcmp            
	//*  10   20:ifle            145
		{
			View view = getChildAt(0);
	//   11   23:aload_0         
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #172 <Method View getChildAt(int)>
	//   14   28:astore          9
			android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
	//   15   30:aload           9
	//   16   32:invokevirtual   #178 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   17   35:checkcast       #180 <Class android.widget.FrameLayout$LayoutParams>
	//   18   38:astore          10
			int k = view.getHeight();
	//   19   40:aload           9
	//   20   42:invokevirtual   #183 <Method int View.getHeight()>
	//   21   45:istore_3        
			int l = layoutparams.topMargin;
	//   22   46:aload           10
	//   23   48:getfield        #186 <Field int android.widget.FrameLayout$LayoutParams.topMargin>
	//   24   51:istore          4
			int i1 = layoutparams.bottomMargin;
	//   25   53:aload           10
	//   26   55:getfield        #189 <Field int android.widget.FrameLayout$LayoutParams.bottomMargin>
	//   27   58:istore          5
			int j1 = getHeight();
	//   28   60:aload_0         
	//   29   61:invokevirtual   #190 <Method int getHeight()>
	//   30   64:istore          6
			int k1 = getPaddingTop();
	//   31   66:aload_0         
	//   32   67:invokevirtual   #193 <Method int getPaddingTop()>
	//   33   70:istore          7
			int l1 = getPaddingBottom();
	//   34   72:aload_0         
	//   35   73:invokevirtual   #196 <Method int getPaddingBottom()>
	//   36   76:istore          8
			i = getScrollY();
	//   37   78:aload_0         
	//   38   79:invokevirtual   #258 <Method int getScrollY()>
	//   39   82:istore_1        
			j = Math.max(0, Math.min(j + i, Math.max(0, (k + l + i1) - (j1 - k1 - l1))));
	//   40   83:iconst_0        
	//   41   84:iload_2         
	//   42   85:iload_1         
	//   43   86:iadd            
	//   44   87:iconst_0        
	//   45   88:iload_3         
	//   46   89:iload           4
	//   47   91:iadd            
	//   48   92:iload           5
	//   49   94:iadd            
	//   50   95:iload           6
	//   51   97:iload           7
	//   52   99:isub            
	//   53  100:iload           8
	//   54  102:isub            
	//   55  103:isub            
	//   56  104:invokestatic    #545 <Method int Math.max(int, int)>
	//   57  107:invokestatic    #470 <Method int Math.min(int, int)>
	//   58  110:invokestatic    #545 <Method int Math.max(int, int)>
	//   59  113:istore_2        
			mLastScrollerY = getScrollY();
	//   60  114:aload_0         
	//   61  115:aload_0         
	//   62  116:invokevirtual   #258 <Method int getScrollY()>
	//   63  119:putfield        #507 <Field int mLastScrollerY>
			mScroller.startScroll(getScrollX(), i, 0, j - i);
	//   64  122:aload_0         
	//   65  123:getfield        #336 <Field OverScroller mScroller>
	//   66  126:aload_0         
	//   67  127:invokevirtual   #514 <Method int getScrollX()>
	//   68  130:iload_1         
	//   69  131:iconst_0        
	//   70  132:iload_2         
	//   71  133:iload_1         
	//   72  134:isub            
	//   73  135:invokevirtual   #943 <Method void OverScroller.startScroll(int, int, int, int)>
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   74  138:aload_0         
	//   75  139:invokestatic    #533 <Method void ViewCompat.postInvalidateOnAnimation(View)>
		} else
	//*  76  142:goto            168
		{
			if(!mScroller.isFinished())
	//*  77  145:aload_0         
	//*  78  146:getfield        #336 <Field OverScroller mScroller>
	//*  79  149:invokevirtual   #770 <Method boolean OverScroller.isFinished()>
	//*  80  152:ifne            162
				mScroller.abortAnimation();
	//   81  155:aload_0         
	//   82  156:getfield        #336 <Field OverScroller mScroller>
	//   83  159:invokevirtual   #901 <Method void OverScroller.abortAnimation()>
			scrollBy(i, j);
	//   84  162:aload_0         
	//   85  163:iload_1         
	//   86  164:iload_2         
	//   87  165:invokevirtual   #207 <Method void scrollBy(int, int)>
		}
		mLastScroll = AnimationUtils.currentAnimationTimeMillis();
	//   88  168:aload_0         
	//   89  169:invokestatic    #936 <Method long AnimationUtils.currentAnimationTimeMillis()>
	//   90  172:putfield        #938 <Field long mLastScroll>
	//   91  175:return          
	}

	public final void smoothScrollTo(int i, int j)
	{
		smoothScrollBy(i - getScrollX(), j - getScrollY());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #514 <Method int getScrollX()>
	//    4    6:isub            
	//    5    7:iload_2         
	//    6    8:aload_0         
	//    7    9:invokevirtual   #258 <Method int getScrollY()>
	//    8   12:isub            
	//    9   13:invokevirtual   #204 <Method void smoothScrollBy(int, int)>
	//   10   16:return          
	}

	public boolean startNestedScroll(int i)
	{
		return startNestedScroll(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #643 <Method boolean startNestedScroll(int, int)>
	//    4    6:ireturn         
	}

	public boolean startNestedScroll(int i, int j)
	{
		return mChildHelper.startNestedScroll(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #945 <Method boolean NestedScrollingChildHelper.startNestedScroll(int, int)>
	//    5    9:ireturn         
	}

	public void stopNestedScroll()
	{
		stopNestedScroll(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #214 <Method void stopNestedScroll(int)>
	//    3    5:return          
	}

	public void stopNestedScroll(int i)
	{
		mChildHelper.stopNestedScroll(i);
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #946 <Method void NestedScrollingChildHelper.stopNestedScroll(int)>
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
