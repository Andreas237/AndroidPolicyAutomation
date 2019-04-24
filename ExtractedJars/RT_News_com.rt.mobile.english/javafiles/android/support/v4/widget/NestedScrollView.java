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
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		View view = getChildAt(0);
	//    2    2:aload_0         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #168 <Method View getChildAt(int)>
	//    5    7:astore_3        
		if(view != null)
	//*   6    8:aload_3         
	//*   7    9:ifnull          39
		{
			int i = view.getHeight();
	//    8   12:aload_3         
	//    9   13:invokevirtual   #174 <Method int View.getHeight()>
	//   10   16:istore_1        
			if(getHeight() < i + getPaddingTop() + getPaddingBottom())
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #175 <Method int getHeight()>
	//*  13   21:iload_1         
	//*  14   22:aload_0         
	//*  15   23:invokevirtual   #178 <Method int getPaddingTop()>
	//*  16   26:iadd            
	//*  17   27:aload_0         
	//*  18   28:invokevirtual   #181 <Method int getPaddingBottom()>
	//*  19   31:iadd            
	//*  20   32:icmpge          37
				flag = true;
	//   21   35:iconst_1        
	//   22   36:istore_2        
			return flag;
	//   23   37:iload_2         
	//   24   38:ireturn         
		} else
		{
			return false;
	//   25   39:iconst_0        
	//   26   40:ireturn         
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
	//    8   14:invokevirtual   #189 <Method void smoothScrollBy(int, int)>
				return;
	//    9   17:return          
			}
			scrollBy(0, i);
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:iload_1         
	//   13   21:invokevirtual   #192 <Method void scrollBy(int, int)>
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
	//    4    6:invokespecial   #196 <Method void recycleVelocityTracker()>
		stopNestedScroll(0);
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #199 <Method void stopNestedScroll(int)>
		if(mEdgeGlowTop != null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #201 <Field EdgeEffect mEdgeGlowTop>
	//*  10   18:ifnull          35
		{
			mEdgeGlowTop.onRelease();
	//   11   21:aload_0         
	//   12   22:getfield        #201 <Field EdgeEffect mEdgeGlowTop>
	//   13   25:invokevirtual   #206 <Method void EdgeEffect.onRelease()>
			mEdgeGlowBottom.onRelease();
	//   14   28:aload_0         
	//   15   29:getfield        #208 <Field EdgeEffect mEdgeGlowBottom>
	//   16   32:invokevirtual   #206 <Method void EdgeEffect.onRelease()>
		}
	//   17   35:return          
	}

	private void ensureGlows()
	{
		if(getOverScrollMode() != 2)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #212 <Method int getOverScrollMode()>
	//*   2    4:iconst_2        
	//*   3    5:icmpeq          45
		{
			if(mEdgeGlowTop == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #201 <Field EdgeEffect mEdgeGlowTop>
	//*   6   12:ifnonnull       55
			{
				Context context = getContext();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #216 <Method Context getContext()>
	//    9   19:astore_1        
				mEdgeGlowTop = new EdgeEffect(context);
	//   10   20:aload_0         
	//   11   21:new             #203 <Class EdgeEffect>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:invokespecial   #218 <Method void EdgeEffect(Context)>
	//   15   29:putfield        #201 <Field EdgeEffect mEdgeGlowTop>
				mEdgeGlowBottom = new EdgeEffect(context);
	//   16   32:aload_0         
	//   17   33:new             #203 <Class EdgeEffect>
	//   18   36:dup             
	//   19   37:aload_1         
	//   20   38:invokespecial   #218 <Method void EdgeEffect(Context)>
	//   21   41:putfield        #208 <Field EdgeEffect mEdgeGlowBottom>
				return;
	//   22   44:return          
			}
		} else
		{
			mEdgeGlowTop = null;
	//   23   45:aload_0         
	//   24   46:aconst_null     
	//   25   47:putfield        #201 <Field EdgeEffect mEdgeGlowTop>
			mEdgeGlowBottom = null;
	//   26   50:aload_0         
	//   27   51:aconst_null     
	//   28   52:putfield        #208 <Field EdgeEffect mEdgeGlowBottom>
		}
	//   29   55:return          
	}

	private View findFocusableViewInBounds(boolean flag, int i, int j)
	{
		java.util.ArrayList arraylist = getFocusables(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokevirtual   #224 <Method java.util.ArrayList getFocusables(int)>
	//    3    5:astore          14
		int i1 = ((List) (arraylist)).size();
	//    4    7:aload           14
	//    5    9:invokeinterface #229 <Method int List.size()>
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
	//   18   37:invokeinterface #233 <Method Object List.get(int)>
	//   19   42:checkcast       #170 <Class View>
	//   20   45:astore          12
				int l = view1.getTop();
	//   21   47:aload           12
	//   22   49:invokevirtual   #236 <Method int View.getTop()>
	//   23   52:istore          8
				int j1 = view1.getBottom();
	//   24   54:aload           12
	//   25   56:invokevirtual   #239 <Method int View.getBottom()>
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
	//*  63  134:invokevirtual   #236 <Method int View.getTop()>
	//*  64  137:icmplt          154
	//*  65  140:iload_1         
	//*  66  141:ifne            160
	//*  67  144:iload           10
	//*  68  146:aload           13
	//*  69  148:invokevirtual   #239 <Method int View.getBottom()>
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
	//    1    1:invokevirtual   #243 <Method int getScrollY()>
	//    2    4:istore_3        
		boolean flag;
		if(j <= 0 && i <= 0 || j >= getScrollRange() && i >= 0)
	//*   3    5:iload_3         
	//*   4    6:ifgt            13
	//*   5    9:iload_1         
	//*   6   10:ifle            28
	//*   7   13:iload_3         
	//*   8   14:aload_0         
	//*   9   15:invokevirtual   #246 <Method int getScrollRange()>
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
	//*  25   43:invokevirtual   #250 <Method boolean dispatchNestedPreFling(float, float)>
	//*  26   46:ifne            63
		{
			dispatchNestedFling(0.0F, f, flag);
	//   27   49:aload_0         
	//   28   50:fconst_0        
	//   29   51:fload_2         
	//   30   52:iload           4
	//   31   54:invokevirtual   #254 <Method boolean dispatchNestedFling(float, float, boolean)>
	//   32   57:pop             
			fling(i);
	//   33   58:aload_0         
	//   34   59:iload_1         
	//   35   60:invokevirtual   #257 <Method void fling(int)>
		}
	//   36   63:return          
	}

	private float getVerticalScrollFactorCompat()
	{
		if(mVerticalScrollFactor == 0.0F)
	//*   0    0:aload_0         
	//*   1    1:getfield        #261 <Field float mVerticalScrollFactor>
	//*   2    4:fconst_0        
	//*   3    5:fcmpl           
	//*   4    6:ifne            63
		{
			TypedValue typedvalue = new TypedValue();
	//    5    9:new             #263 <Class TypedValue>
	//    6   12:dup             
	//    7   13:invokespecial   #264 <Method void TypedValue()>
	//    8   16:astore_1        
			Context context = getContext();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #216 <Method Context getContext()>
	//   11   21:astore_2        
			if(!context.getTheme().resolveAttribute(0x101004d, typedvalue, true))
	//*  12   22:aload_2         
	//*  13   23:invokevirtual   #268 <Method android.content.res.Resources$Theme Context.getTheme()>
	//*  14   26:ldc2            #269 <Int 0x101004d>
	//*  15   29:aload_1         
	//*  16   30:iconst_1        
	//*  17   31:invokevirtual   #275 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//*  18   34:ifne            48
				throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
	//   19   37:new             #277 <Class IllegalStateException>
	//   20   40:dup             
	//   21   41:ldc2            #279 <String "Expected theme to define listPreferredItemHeight.">
	//   22   44:invokespecial   #282 <Method void IllegalStateException(String)>
	//   23   47:athrow          
			mVerticalScrollFactor = typedvalue.getDimension(context.getResources().getDisplayMetrics());
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:aload_2         
	//   27   51:invokevirtual   #286 <Method Resources Context.getResources()>
	//   28   54:invokevirtual   #292 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   29   57:invokevirtual   #296 <Method float TypedValue.getDimension(android.util.DisplayMetrics)>
	//   30   60:putfield        #261 <Field float mVerticalScrollFactor>
		}
		return mVerticalScrollFactor;
	//   31   63:aload_0         
	//   32   64:getfield        #261 <Field float mVerticalScrollFactor>
	//   33   67:freturn         
	}

	private boolean inChild(int i, int j)
	{
		int k = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #301 <Method int getChildCount()>
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
	//    8   13:invokevirtual   #243 <Method int getScrollY()>
	//    9   16:istore_3        
			View view = getChildAt(0);
	//   10   17:aload_0         
	//   11   18:iconst_0        
	//   12   19:invokevirtual   #168 <Method View getChildAt(int)>
	//   13   22:astore          6
			boolean flag = flag1;
	//   14   24:iload           5
	//   15   26:istore          4
			if(j >= view.getTop() - l)
	//*  16   28:iload_2         
	//*  17   29:aload           6
	//*  18   31:invokevirtual   #236 <Method int View.getTop()>
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
	//*  26   46:invokevirtual   #239 <Method int View.getBottom()>
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
	//*  34   61:invokevirtual   #304 <Method int View.getLeft()>
	//*  35   64:icmplt          83
					{
						flag = flag1;
	//   36   67:iload           5
	//   37   69:istore          4
						if(i < view.getRight())
	//*  38   71:iload_1         
	//*  39   72:aload           6
	//*  40   74:invokevirtual   #307 <Method int View.getRight()>
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
		if(mVelocityTracker == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #310 <Field VelocityTracker mVelocityTracker>
	//*   2    4:ifnonnull       15
		{
			mVelocityTracker = VelocityTracker.obtain();
	//    3    7:aload_0         
	//    4    8:invokestatic    #316 <Method VelocityTracker VelocityTracker.obtain()>
	//    5   11:putfield        #310 <Field VelocityTracker mVelocityTracker>
			return;
	//    6   14:return          
		} else
		{
			mVelocityTracker.clear();
	//    7   15:aload_0         
	//    8   16:getfield        #310 <Field VelocityTracker mVelocityTracker>
	//    9   19:invokevirtual   #319 <Method void VelocityTracker.clear()>
			return;
	//   10   22:return          
		}
	}

	private void initScrollView()
	{
		mScroller = new OverScroller(getContext());
	//    0    0:aload_0         
	//    1    1:new             #321 <Class OverScroller>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokevirtual   #216 <Method Context getContext()>
	//    5    9:invokespecial   #322 <Method void OverScroller(Context)>
	//    6   12:putfield        #324 <Field OverScroller mScroller>
		setFocusable(true);
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:invokevirtual   #327 <Method void setFocusable(boolean)>
		setDescendantFocusability(0x40000);
	//   10   20:aload_0         
	//   11   21:ldc2            #328 <Int 0x40000>
	//   12   24:invokevirtual   #331 <Method void setDescendantFocusability(int)>
		setWillNotDraw(false);
	//   13   27:aload_0         
	//   14   28:iconst_0        
	//   15   29:invokevirtual   #334 <Method void setWillNotDraw(boolean)>
		ViewConfiguration viewconfiguration = ViewConfiguration.get(getContext());
	//   16   32:aload_0         
	//   17   33:invokevirtual   #216 <Method Context getContext()>
	//   18   36:invokestatic    #339 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   19   39:astore_1        
		mTouchSlop = viewconfiguration.getScaledTouchSlop();
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:invokevirtual   #342 <Method int ViewConfiguration.getScaledTouchSlop()>
	//   23   45:putfield        #344 <Field int mTouchSlop>
		mMinimumVelocity = viewconfiguration.getScaledMinimumFlingVelocity();
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:invokevirtual   #347 <Method int ViewConfiguration.getScaledMinimumFlingVelocity()>
	//   27   53:putfield        #349 <Field int mMinimumVelocity>
		mMaximumVelocity = viewconfiguration.getScaledMaximumFlingVelocity();
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:invokevirtual   #352 <Method int ViewConfiguration.getScaledMaximumFlingVelocity()>
	//   31   61:putfield        #354 <Field int mMaximumVelocity>
	//   32   64:return          
	}

	private void initVelocityTrackerIfNotExists()
	{
		if(mVelocityTracker == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #310 <Field VelocityTracker mVelocityTracker>
	//*   2    4:ifnonnull       14
			mVelocityTracker = VelocityTracker.obtain();
	//    3    7:aload_0         
	//    4    8:invokestatic    #316 <Method VelocityTracker VelocityTracker.obtain()>
	//    5   11:putfield        #310 <Field VelocityTracker mVelocityTracker>
	//    6   14:return          
	}

	private boolean isOffScreen(View view)
	{
		return isWithinDeltaOfScreen(view, 0, getHeight()) ^ true;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_0         
	//    4    4:invokevirtual   #175 <Method int getHeight()>
	//    5    7:invokespecial   #361 <Method boolean isWithinDeltaOfScreen(View, int, int)>
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
	//    6    8:invokevirtual   #367 <Method ViewParent View.getParent()>
	//    7   11:astore_0        
		return (view instanceof ViewGroup) && isViewDescendantOf((View)view, view1);
	//    8   12:aload_0         
	//    9   13:instanceof      #369 <Class ViewGroup>
	//   10   16:ifeq            32
	//   11   19:aload_0         
	//   12   20:checkcast       #170 <Class View>
	//   13   23:aload_1         
	//   14   24:invokestatic    #371 <Method boolean isViewDescendantOf(View, View)>
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
	//    3    5:invokevirtual   #375 <Method void View.getDrawingRect(Rect)>
		offsetDescendantRectToMyCoords(view, mTempRect);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #101 <Field Rect mTempRect>
	//    8   14:invokevirtual   #379 <Method void offsetDescendantRectToMyCoords(View, Rect)>
		return mTempRect.bottom + i >= getScrollY() && mTempRect.top - i <= getScrollY() + j;
	//    9   17:aload_0         
	//   10   18:getfield        #101 <Field Rect mTempRect>
	//   11   21:getfield        #382 <Field int Rect.bottom>
	//   12   24:iload_2         
	//   13   25:iadd            
	//   14   26:aload_0         
	//   15   27:invokevirtual   #243 <Method int getScrollY()>
	//   16   30:icmplt          53
	//   17   33:aload_0         
	//   18   34:getfield        #101 <Field Rect mTempRect>
	//   19   37:getfield        #385 <Field int Rect.top>
	//   20   40:iload_2         
	//   21   41:isub            
	//   22   42:aload_0         
	//   23   43:invokevirtual   #243 <Method int getScrollY()>
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
	//    1    1:invokevirtual   #392 <Method int MotionEvent.getActionIndex()>
	//    2    4:istore_2        
		if(motionevent.getPointerId(i) == mActivePointerId)
	//*   3    5:aload_1         
	//*   4    6:iload_2         
	//*   5    7:invokevirtual   #396 <Method int MotionEvent.getPointerId(int)>
	//*   6   10:aload_0         
	//*   7   11:getfield        #113 <Field int mActivePointerId>
	//*   8   14:icmpne          61
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
	//   19   31:invokevirtual   #400 <Method float MotionEvent.getY(int)>
	//   20   34:f2i             
	//   21   35:putfield        #402 <Field int mLastMotionY>
			mActivePointerId = motionevent.getPointerId(i);
	//   22   38:aload_0         
	//   23   39:aload_1         
	//   24   40:iload_2         
	//   25   41:invokevirtual   #396 <Method int MotionEvent.getPointerId(int)>
	//   26   44:putfield        #113 <Field int mActivePointerId>
			if(mVelocityTracker != null)
	//*  27   47:aload_0         
	//*  28   48:getfield        #310 <Field VelocityTracker mVelocityTracker>
	//*  29   51:ifnull          61
				mVelocityTracker.clear();
	//   30   54:aload_0         
	//   31   55:getfield        #310 <Field VelocityTracker mVelocityTracker>
	//   32   58:invokevirtual   #319 <Method void VelocityTracker.clear()>
		}
	//   33   61:return          
	}

	private void recycleVelocityTracker()
	{
		if(mVelocityTracker != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #310 <Field VelocityTracker mVelocityTracker>
	//*   2    4:ifnull          19
		{
			mVelocityTracker.recycle();
	//    3    7:aload_0         
	//    4    8:getfield        #310 <Field VelocityTracker mVelocityTracker>
	//    5   11:invokevirtual   #403 <Method void VelocityTracker.recycle()>
			mVelocityTracker = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #310 <Field VelocityTracker mVelocityTracker>
		}
	//    9   19:return          
	}

	private boolean scrollAndFocus(int i, int j, int k)
	{
		int i1 = getHeight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #175 <Method int getHeight()>
	//    2    4:istore          5
		int l = getScrollY();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #243 <Method int getScrollY()>
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
	//   24   42:invokespecial   #407 <Method View findFocusableViewInBounds(boolean, int, int)>
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
	//   54   98:invokespecial   #409 <Method void doScrollY(int)>
			flag = true;
	//   55  101:iconst_1        
	//   56  102:istore          6
		}
		if(obj != findFocus())
	//*  57  104:aload           8
	//*  58  106:aload_0         
	//*  59  107:invokevirtual   #413 <Method View findFocus()>
	//*  60  110:if_acmpeq       120
			((View) (obj)).requestFocus(i);
	//   61  113:aload           8
	//   62  115:iload_1         
	//   63  116:invokevirtual   #417 <Method boolean View.requestFocus(int)>
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
	//    3    5:invokevirtual   #375 <Method void View.getDrawingRect(Rect)>
		offsetDescendantRectToMyCoords(view, mTempRect);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #101 <Field Rect mTempRect>
	//    8   14:invokevirtual   #379 <Method void offsetDescendantRectToMyCoords(View, Rect)>
		int i = computeScrollDeltaToGetChildRectOnScreen(mTempRect);
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #101 <Field Rect mTempRect>
	//   12   22:invokevirtual   #422 <Method int computeScrollDeltaToGetChildRectOnScreen(Rect)>
	//   13   25:istore_2        
		if(i != 0)
	//*  14   26:iload_2         
	//*  15   27:ifeq            36
			scrollBy(0, i);
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:iload_2         
	//   19   33:invokevirtual   #192 <Method void scrollBy(int, int)>
	//   20   36:return          
	}

	private boolean scrollToChildRect(Rect rect, boolean flag)
	{
		int i = computeScrollDeltaToGetChildRectOnScreen(rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #422 <Method int computeScrollDeltaToGetChildRectOnScreen(Rect)>
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
	//   18   31:invokevirtual   #192 <Method void scrollBy(int, int)>
				return flag1;
	//   19   34:iload           4
	//   20   36:ireturn         
			}
			smoothScrollBy(0, i);
	//   21   37:aload_0         
	//   22   38:iconst_0        
	//   23   39:iload_3         
	//   24   40:invokevirtual   #189 <Method void smoothScrollBy(int, int)>
		}
		return flag1;
	//   25   43:iload           4
	//   26   45:ireturn         
	}

	public void addView(View view)
	{
		if(getChildCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #301 <Method int getChildCount()>
	//*   2    4:ifle            18
		{
			throw new IllegalStateException("ScrollView can host only one direct child");
	//    3    7:new             #277 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #427 <String "ScrollView can host only one direct child">
	//    6   14:invokespecial   #282 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			super.addView(view);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokespecial   #429 <Method void FrameLayout.addView(View)>
			return;
	//   11   23:return          
		}
	}

	public void addView(View view, int i)
	{
		if(getChildCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #301 <Method int getChildCount()>
	//*   2    4:ifle            18
		{
			throw new IllegalStateException("ScrollView can host only one direct child");
	//    3    7:new             #277 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #427 <String "ScrollView can host only one direct child">
	//    6   14:invokespecial   #282 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			super.addView(view, i);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:iload_2         
	//   11   21:invokespecial   #432 <Method void FrameLayout.addView(View, int)>
			return;
	//   12   24:return          
		}
	}

	public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(getChildCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #301 <Method int getChildCount()>
	//*   2    4:ifle            18
		{
			throw new IllegalStateException("ScrollView can host only one direct child");
	//    3    7:new             #277 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #427 <String "ScrollView can host only one direct child">
	//    6   14:invokespecial   #282 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			super.addView(view, i, layoutparams);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:iload_2         
	//   11   21:aload_3         
	//   12   22:invokespecial   #435 <Method void FrameLayout.addView(View, int, android.view.ViewGroup$LayoutParams)>
			return;
	//   13   25:return          
		}
	}

	public void addView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(getChildCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #301 <Method int getChildCount()>
	//*   2    4:ifle            18
		{
			throw new IllegalStateException("ScrollView can host only one direct child");
	//    3    7:new             #277 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #427 <String "ScrollView can host only one direct child">
	//    6   14:invokespecial   #282 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			super.addView(view, layoutparams);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:invokespecial   #438 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
			return;
	//   12   24:return          
		}
	}

	public boolean arrowScroll(int i)
	{
		View view1 = findFocus();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #413 <Method View findFocus()>
	//    2    4:astore          6
		View view = view1;
	//    3    6:aload           6
	//    4    8:astore          5
		if(view1 == this)
	//*   5   10:aload           6
	//*   6   12:aload_0         
	//*   7   13:if_acmpne       19
			view = null;
	//    8   16:aconst_null     
	//    9   17:astore          5
		view1 = FocusFinder.getInstance().findNextFocus(((ViewGroup) (this)), view, i);
	//   10   19:invokestatic    #445 <Method FocusFinder FocusFinder.getInstance()>
	//   11   22:aload_0         
	//   12   23:aload           5
	//   13   25:iload_1         
	//   14   26:invokevirtual   #449 <Method View FocusFinder.findNextFocus(ViewGroup, View, int)>
	//   15   29:astore          6
		int k = getMaxScrollAmount();
	//   16   31:aload_0         
	//   17   32:invokevirtual   #452 <Method int getMaxScrollAmount()>
	//   18   35:istore_3        
		if(view1 != null && isWithinDeltaOfScreen(view1, k, getHeight()))
	//*  19   36:aload           6
	//*  20   38:ifnull          96
	//*  21   41:aload_0         
	//*  22   42:aload           6
	//*  23   44:iload_3         
	//*  24   45:aload_0         
	//*  25   46:invokevirtual   #175 <Method int getHeight()>
	//*  26   49:invokespecial   #361 <Method boolean isWithinDeltaOfScreen(View, int, int)>
	//*  27   52:ifeq            96
		{
			view1.getDrawingRect(mTempRect);
	//   28   55:aload           6
	//   29   57:aload_0         
	//   30   58:getfield        #101 <Field Rect mTempRect>
	//   31   61:invokevirtual   #375 <Method void View.getDrawingRect(Rect)>
			offsetDescendantRectToMyCoords(view1, mTempRect);
	//   32   64:aload_0         
	//   33   65:aload           6
	//   34   67:aload_0         
	//   35   68:getfield        #101 <Field Rect mTempRect>
	//   36   71:invokevirtual   #379 <Method void offsetDescendantRectToMyCoords(View, Rect)>
			doScrollY(computeScrollDeltaToGetChildRectOnScreen(mTempRect));
	//   37   74:aload_0         
	//   38   75:aload_0         
	//   39   76:aload_0         
	//   40   77:getfield        #101 <Field Rect mTempRect>
	//   41   80:invokevirtual   #422 <Method int computeScrollDeltaToGetChildRectOnScreen(Rect)>
	//   42   83:invokespecial   #409 <Method void doScrollY(int)>
			view1.requestFocus(i);
	//   43   86:aload           6
	//   44   88:iload_1         
	//   45   89:invokevirtual   #417 <Method boolean View.requestFocus(int)>
	//   46   92:pop             
		} else
	//*  47   93:goto            196
		{
			int j;
			if(i == 33 && getScrollY() < k)
	//*  48   96:iload_1         
	//*  49   97:bipush          33
	//*  50   99:icmpne          118
	//*  51  102:aload_0         
	//*  52  103:invokevirtual   #243 <Method int getScrollY()>
	//*  53  106:iload_3         
	//*  54  107:icmpge          118
			{
				j = getScrollY();
	//   55  110:aload_0         
	//   56  111:invokevirtual   #243 <Method int getScrollY()>
	//   57  114:istore_2        
			} else
	//*  58  115:goto            172
			{
				j = k;
	//   59  118:iload_3         
	//   60  119:istore_2        
				if(i == 130)
	//*  61  120:iload_1         
	//*  62  121:sipush          130
	//*  63  124:icmpne          172
				{
					j = k;
	//   64  127:iload_3         
	//   65  128:istore_2        
					if(getChildCount() > 0)
	//*  66  129:aload_0         
	//*  67  130:invokevirtual   #301 <Method int getChildCount()>
	//*  68  133:ifle            172
					{
						int l = getChildAt(0).getBottom() - ((getScrollY() + getHeight()) - getPaddingBottom());
	//   69  136:aload_0         
	//   70  137:iconst_0        
	//   71  138:invokevirtual   #168 <Method View getChildAt(int)>
	//   72  141:invokevirtual   #239 <Method int View.getBottom()>
	//   73  144:aload_0         
	//   74  145:invokevirtual   #243 <Method int getScrollY()>
	//   75  148:aload_0         
	//   76  149:invokevirtual   #175 <Method int getHeight()>
	//   77  152:iadd            
	//   78  153:aload_0         
	//   79  154:invokevirtual   #181 <Method int getPaddingBottom()>
	//   80  157:isub            
	//   81  158:isub            
	//   82  159:istore          4
						j = k;
	//   83  161:iload_3         
	//   84  162:istore_2        
						if(l < k)
	//*  85  163:iload           4
	//*  86  165:iload_3         
	//*  87  166:icmpge          172
							j = l;
	//   88  169:iload           4
	//   89  171:istore_2        
					}
				}
			}
			if(j == 0)
	//*  90  172:iload_2         
	//*  91  173:ifne            178
				return false;
	//   92  176:iconst_0        
	//   93  177:ireturn         
			if(i != 130)
	//*  94  178:iload_1         
	//*  95  179:sipush          130
	//*  96  182:icmpne          188
	//*  97  185:goto            191
				j = -j;
	//   98  188:iload_2         
	//   99  189:ineg            
	//  100  190:istore_2        
			doScrollY(j);
	//  101  191:aload_0         
	//  102  192:iload_2         
	//  103  193:invokespecial   #409 <Method void doScrollY(int)>
		}
		if(view != null && view.isFocused() && isOffScreen(view))
	//* 104  196:aload           5
	//* 105  198:ifnull          240
	//* 106  201:aload           5
	//* 107  203:invokevirtual   #455 <Method boolean View.isFocused()>
	//* 108  206:ifeq            240
	//* 109  209:aload_0         
	//* 110  210:aload           5
	//* 111  212:invokespecial   #457 <Method boolean isOffScreen(View)>
	//* 112  215:ifeq            240
		{
			i = getDescendantFocusability();
	//  113  218:aload_0         
	//  114  219:invokevirtual   #460 <Method int getDescendantFocusability()>
	//  115  222:istore_1        
			setDescendantFocusability(0x20000);
	//  116  223:aload_0         
	//  117  224:ldc2            #461 <Int 0x20000>
	//  118  227:invokevirtual   #331 <Method void setDescendantFocusability(int)>
			requestFocus();
	//  119  230:aload_0         
	//  120  231:invokevirtual   #463 <Method boolean requestFocus()>
	//  121  234:pop             
			setDescendantFocusability(i);
	//  122  235:aload_0         
	//  123  236:iload_1         
	//  124  237:invokevirtual   #331 <Method void setDescendantFocusability(int)>
		}
		return true;
	//  125  240:iconst_1        
	//  126  241:ireturn         
	}

	public int computeHorizontalScrollExtent()
	{
		return super.computeHorizontalScrollExtent();
	//    0    0:aload_0         
	//    1    1:invokespecial   #470 <Method int FrameLayout.computeHorizontalScrollExtent()>
	//    2    4:ireturn         
	}

	public int computeHorizontalScrollOffset()
	{
		return super.computeHorizontalScrollOffset();
	//    0    0:aload_0         
	//    1    1:invokespecial   #474 <Method int FrameLayout.computeHorizontalScrollOffset()>
	//    2    4:ireturn         
	}

	public int computeHorizontalScrollRange()
	{
		return super.computeHorizontalScrollRange();
	//    0    0:aload_0         
	//    1    1:invokespecial   #477 <Method int FrameLayout.computeHorizontalScrollRange()>
	//    2    4:ireturn         
	}

	public void computeScroll()
	{
		if(mScroller.computeScrollOffset())
	//*   0    0:aload_0         
	//*   1    1:getfield        #324 <Field OverScroller mScroller>
	//*   2    4:invokevirtual   #481 <Method boolean OverScroller.computeScrollOffset()>
	//*   3    7:ifeq            217
		{
			mScroller.getCurrX();
	//    4   10:aload_0         
	//    5   11:getfield        #324 <Field OverScroller mScroller>
	//    6   14:invokevirtual   #484 <Method int OverScroller.getCurrX()>
	//    7   17:pop             
			int i1 = mScroller.getCurrY();
	//    8   18:aload_0         
	//    9   19:getfield        #324 <Field OverScroller mScroller>
	//   10   22:invokevirtual   #487 <Method int OverScroller.getCurrY()>
	//   11   25:istore_3        
			int k = i1 - mLastScrollerY;
	//   12   26:iload_3         
	//   13   27:aload_0         
	//   14   28:getfield        #489 <Field int mLastScrollerY>
	//   15   31:isub            
	//   16   32:istore_2        
			int i = k;
	//   17   33:iload_2         
	//   18   34:istore_1        
			if(dispatchNestedPreScroll(0, k, mScrollConsumed, ((int []) (null)), 1))
	//*  19   35:aload_0         
	//*  20   36:iconst_0        
	//*  21   37:iload_2         
	//*  22   38:aload_0         
	//*  23   39:getfield        #117 <Field int[] mScrollConsumed>
	//*  24   42:aconst_null     
	//*  25   43:iconst_1        
	//*  26   44:invokevirtual   #493 <Method boolean dispatchNestedPreScroll(int, int, int[], int[], int)>
	//*  27   47:ifeq            59
				i = k - mScrollConsumed[1];
	//   28   50:iload_2         
	//   29   51:aload_0         
	//   30   52:getfield        #117 <Field int[] mScrollConsumed>
	//   31   55:iconst_1        
	//   32   56:iaload          
	//   33   57:isub            
	//   34   58:istore_1        
			if(i != 0)
	//*  35   59:iload_1         
	//*  36   60:ifeq            207
			{
				int l = getScrollRange();
	//   37   63:aload_0         
	//   38   64:invokevirtual   #246 <Method int getScrollRange()>
	//   39   67:istore_2        
				int j1 = getScrollY();
	//   40   68:aload_0         
	//   41   69:invokevirtual   #243 <Method int getScrollY()>
	//   42   72:istore          4
				overScrollByCompat(0, i, getScrollX(), j1, 0, l, 0, 0, false);
	//   43   74:aload_0         
	//   44   75:iconst_0        
	//   45   76:iload_1         
	//   46   77:aload_0         
	//   47   78:invokevirtual   #496 <Method int getScrollX()>
	//   48   81:iload           4
	//   49   83:iconst_0        
	//   50   84:iload_2         
	//   51   85:iconst_0        
	//   52   86:iconst_0        
	//   53   87:iconst_0        
	//   54   88:invokevirtual   #500 <Method boolean overScrollByCompat(int, int, int, int, int, int, int, int, boolean)>
	//   55   91:pop             
				int k1 = getScrollY() - j1;
	//   56   92:aload_0         
	//   57   93:invokevirtual   #243 <Method int getScrollY()>
	//   58   96:iload           4
	//   59   98:isub            
	//   60   99:istore          5
				if(!dispatchNestedScroll(0, k1, 0, i - k1, ((int []) (null)), 1))
	//*  61  101:aload_0         
	//*  62  102:iconst_0        
	//*  63  103:iload           5
	//*  64  105:iconst_0        
	//*  65  106:iload_1         
	//*  66  107:iload           5
	//*  67  109:isub            
	//*  68  110:aconst_null     
	//*  69  111:iconst_1        
	//*  70  112:invokevirtual   #504 <Method boolean dispatchNestedScroll(int, int, int, int, int[], int)>
	//*  71  115:ifne            207
				{
					int j = getOverScrollMode();
	//   72  118:aload_0         
	//   73  119:invokevirtual   #212 <Method int getOverScrollMode()>
	//   74  122:istore_1        
					boolean flag;
					if(j != 0 && (j != 1 || l <= 0))
	//*  75  123:iload_1         
	//*  76  124:ifeq            144
	//*  77  127:iload_1         
	//*  78  128:iconst_1        
	//*  79  129:icmpne          139
	//*  80  132:iload_2         
	//*  81  133:ifle            139
	//*  82  136:goto            144
						flag = false;
	//   83  139:iconst_0        
	//   84  140:istore_1        
					else
	//*  85  141:goto            146
						flag = true;
	//   86  144:iconst_1        
	//   87  145:istore_1        
					if(flag)
	//*  88  146:iload_1         
	//*  89  147:ifeq            207
					{
						ensureGlows();
	//   90  150:aload_0         
	//   91  151:invokespecial   #506 <Method void ensureGlows()>
						if(i1 <= 0 && j1 > 0)
	//*  92  154:iload_3         
	//*  93  155:ifgt            181
	//*  94  158:iload           4
	//*  95  160:ifle            181
							mEdgeGlowTop.onAbsorb((int)mScroller.getCurrVelocity());
	//   96  163:aload_0         
	//   97  164:getfield        #201 <Field EdgeEffect mEdgeGlowTop>
	//   98  167:aload_0         
	//   99  168:getfield        #324 <Field OverScroller mScroller>
	//  100  171:invokevirtual   #509 <Method float OverScroller.getCurrVelocity()>
	//  101  174:f2i             
	//  102  175:invokevirtual   #512 <Method void EdgeEffect.onAbsorb(int)>
						else
	//* 103  178:goto            207
						if(i1 >= l && j1 < l)
	//* 104  181:iload_3         
	//* 105  182:iload_2         
	//* 106  183:icmplt          207
	//* 107  186:iload           4
	//* 108  188:iload_2         
	//* 109  189:icmpge          207
							mEdgeGlowBottom.onAbsorb((int)mScroller.getCurrVelocity());
	//  110  192:aload_0         
	//  111  193:getfield        #208 <Field EdgeEffect mEdgeGlowBottom>
	//  112  196:aload_0         
	//  113  197:getfield        #324 <Field OverScroller mScroller>
	//  114  200:invokevirtual   #509 <Method float OverScroller.getCurrVelocity()>
	//  115  203:f2i             
	//  116  204:invokevirtual   #512 <Method void EdgeEffect.onAbsorb(int)>
					}
				}
			}
			mLastScrollerY = i1;
	//  117  207:aload_0         
	//  118  208:iload_3         
	//  119  209:putfield        #489 <Field int mLastScrollerY>
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//  120  212:aload_0         
	//  121  213:invokestatic    #515 <Method void ViewCompat.postInvalidateOnAnimation(View)>
			return;
	//  122  216:return          
		}
		if(hasNestedScrollingParent(1))
	//* 123  217:aload_0         
	//* 124  218:iconst_1        
	//* 125  219:invokevirtual   #518 <Method boolean hasNestedScrollingParent(int)>
	//* 126  222:ifeq            230
			stopNestedScroll(1);
	//  127  225:aload_0         
	//  128  226:iconst_1        
	//  129  227:invokevirtual   #199 <Method void stopNestedScroll(int)>
		mLastScrollerY = 0;
	//  130  230:aload_0         
	//  131  231:iconst_0        
	//  132  232:putfield        #489 <Field int mLastScrollerY>
	//  133  235:return          
	}

	protected int computeScrollDeltaToGetChildRectOnScreen(Rect rect)
	{
		int i = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #301 <Method int getChildCount()>
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
	//   10   15:invokevirtual   #175 <Method int getHeight()>
	//   11   18:istore          6
		i = getScrollY();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #243 <Method int getScrollY()>
	//   14   24:istore_2        
		int k = i + l;
	//   15   25:iload_2         
	//   16   26:iload           6
	//   17   28:iadd            
	//   18   29:istore          4
		int i1 = getVerticalFadingEdgeLength();
	//   19   31:aload_0         
	//   20   32:invokevirtual   #521 <Method int getVerticalFadingEdgeLength()>
	//   21   35:istore          7
		int j = i;
	//   22   37:iload_2         
	//   23   38:istore_3        
		if(rect.top > 0)
	//*  24   39:aload_1         
	//*  25   40:getfield        #385 <Field int Rect.top>
	//*  26   43:ifle            51
			j = i + i1;
	//   27   46:iload_2         
	//   28   47:iload           7
	//   29   49:iadd            
	//   30   50:istore_3        
		i = k;
	//   31   51:iload           4
	//   32   53:istore_2        
		if(rect.bottom < getChildAt(0).getHeight())
	//*  33   54:aload_1         
	//*  34   55:getfield        #382 <Field int Rect.bottom>
	//*  35   58:aload_0         
	//*  36   59:iconst_0        
	//*  37   60:invokevirtual   #168 <Method View getChildAt(int)>
	//*  38   63:invokevirtual   #174 <Method int View.getHeight()>
	//*  39   66:icmpge          75
			i = k - i1;
	//   40   69:iload           4
	//   41   71:iload           7
	//   42   73:isub            
	//   43   74:istore_2        
		if(rect.bottom > i && rect.top > j)
	//*  44   75:aload_1         
	//*  45   76:getfield        #382 <Field int Rect.bottom>
	//*  46   79:iload_2         
	//*  47   80:icmple          136
	//*  48   83:aload_1         
	//*  49   84:getfield        #385 <Field int Rect.top>
	//*  50   87:iload_3         
	//*  51   88:icmple          136
		{
			if(rect.height() > l)
	//*  52   91:aload_1         
	//*  53   92:invokevirtual   #524 <Method int Rect.height()>
	//*  54   95:iload           6
	//*  55   97:icmple          112
				j = (rect.top - j) + 0;
	//   56  100:aload_1         
	//   57  101:getfield        #385 <Field int Rect.top>
	//   58  104:iload_3         
	//   59  105:isub            
	//   60  106:iconst_0        
	//   61  107:iadd            
	//   62  108:istore_3        
			else
	//*  63  109:goto            121
				j = (rect.bottom - i) + 0;
	//   64  112:aload_1         
	//   65  113:getfield        #382 <Field int Rect.bottom>
	//   66  116:iload_2         
	//   67  117:isub            
	//   68  118:iconst_0        
	//   69  119:iadd            
	//   70  120:istore_3        
			return Math.min(j, getChildAt(0).getBottom() - i);
	//   71  121:iload_3         
	//   72  122:aload_0         
	//   73  123:iconst_0        
	//   74  124:invokevirtual   #168 <Method View getChildAt(int)>
	//   75  127:invokevirtual   #239 <Method int View.getBottom()>
	//   76  130:iload_2         
	//   77  131:isub            
	//   78  132:invokestatic    #530 <Method int Math.min(int, int)>
	//   79  135:ireturn         
		}
		k = ((int) (flag));
	//   80  136:iload           5
	//   81  138:istore          4
		if(rect.top < j)
	//*  82  140:aload_1         
	//*  83  141:getfield        #385 <Field int Rect.top>
	//*  84  144:iload_3         
	//*  85  145:icmpge          201
		{
			k = ((int) (flag));
	//   86  148:iload           5
	//   87  150:istore          4
			if(rect.bottom < i)
	//*  88  152:aload_1         
	//*  89  153:getfield        #382 <Field int Rect.bottom>
	//*  90  156:iload_2         
	//*  91  157:icmpge          201
			{
				if(rect.height() > l)
	//*  92  160:aload_1         
	//*  93  161:invokevirtual   #524 <Method int Rect.height()>
	//*  94  164:iload           6
	//*  95  166:icmple          181
					i = 0 - (i - rect.bottom);
	//   96  169:iconst_0        
	//   97  170:iload_2         
	//   98  171:aload_1         
	//   99  172:getfield        #382 <Field int Rect.bottom>
	//  100  175:isub            
	//  101  176:isub            
	//  102  177:istore_2        
				else
	//* 103  178:goto            190
					i = 0 - (j - rect.top);
	//  104  181:iconst_0        
	//  105  182:iload_3         
	//  106  183:aload_1         
	//  107  184:getfield        #385 <Field int Rect.top>
	//  108  187:isub            
	//  109  188:isub            
	//  110  189:istore_2        
				k = Math.max(i, -getScrollY());
	//  111  190:iload_2         
	//  112  191:aload_0         
	//  113  192:invokevirtual   #243 <Method int getScrollY()>
	//  114  195:ineg            
	//  115  196:invokestatic    #533 <Method int Math.max(int, int)>
	//  116  199:istore          4
			}
		}
		return k;
	//  117  201:iload           4
	//  118  203:ireturn         
	}

	public int computeVerticalScrollExtent()
	{
		return super.computeVerticalScrollExtent();
	//    0    0:aload_0         
	//    1    1:invokespecial   #536 <Method int FrameLayout.computeVerticalScrollExtent()>
	//    2    4:ireturn         
	}

	public int computeVerticalScrollOffset()
	{
		return Math.max(0, super.computeVerticalScrollOffset());
	//    0    0:iconst_0        
	//    1    1:aload_0         
	//    2    2:invokespecial   #539 <Method int FrameLayout.computeVerticalScrollOffset()>
	//    3    5:invokestatic    #533 <Method int Math.max(int, int)>
	//    4    8:ireturn         
	}

	public int computeVerticalScrollRange()
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #301 <Method int getChildCount()>
	//    2    4:istore_2        
		int i = getHeight() - getPaddingBottom() - getPaddingTop();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #175 <Method int getHeight()>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #181 <Method int getPaddingBottom()>
	//    7   13:isub            
	//    8   14:aload_0         
	//    9   15:invokevirtual   #178 <Method int getPaddingTop()>
	//   10   18:isub            
	//   11   19:istore_1        
		if(j == 0)
	//*  12   20:iload_2         
	//*  13   21:ifne            26
			return i;
	//   14   24:iload_1         
	//   15   25:ireturn         
		j = getChildAt(0).getBottom();
	//   16   26:aload_0         
	//   17   27:iconst_0        
	//   18   28:invokevirtual   #168 <Method View getChildAt(int)>
	//   19   31:invokevirtual   #239 <Method int View.getBottom()>
	//   20   34:istore_2        
		int k = getScrollY();
	//   21   35:aload_0         
	//   22   36:invokevirtual   #243 <Method int getScrollY()>
	//   23   39:istore_3        
		int l = Math.max(0, j - i);
	//   24   40:iconst_0        
	//   25   41:iload_2         
	//   26   42:iload_1         
	//   27   43:isub            
	//   28   44:invokestatic    #533 <Method int Math.max(int, int)>
	//   29   47:istore          4
		if(k < 0)
	//*  30   49:iload_3         
	//*  31   50:ifge            57
			return j - k;
	//   32   53:iload_2         
	//   33   54:iload_3         
	//   34   55:isub            
	//   35   56:ireturn         
		i = j;
	//   36   57:iload_2         
	//   37   58:istore_1        
		if(k > l)
	//*  38   59:iload_3         
	//*  39   60:iload           4
	//*  40   62:icmple          72
			i = j + (k - l);
	//   41   65:iload_2         
	//   42   66:iload_3         
	//   43   67:iload           4
	//   44   69:isub            
	//   45   70:iadd            
	//   46   71:istore_1        
		return i;
	//   47   72:iload_1         
	//   48   73:ireturn         
	}

	public boolean dispatchKeyEvent(KeyEvent keyevent)
	{
		return super.dispatchKeyEvent(keyevent) || executeKeyEvent(keyevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #544 <Method boolean FrameLayout.dispatchKeyEvent(KeyEvent)>
	//    3    5:ifne            21
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #547 <Method boolean executeKeyEvent(KeyEvent)>
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
	//    5    7:invokevirtual   #548 <Method boolean NestedScrollingChildHelper.dispatchNestedFling(float, float, boolean)>
	//    6   10:ireturn         
	}

	public boolean dispatchNestedPreFling(float f, float f1)
	{
		return mChildHelper.dispatchNestedPreFling(f, f1);
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokevirtual   #549 <Method boolean NestedScrollingChildHelper.dispatchNestedPreFling(float, float)>
	//    5    9:ireturn         
	}

	public boolean dispatchNestedPreScroll(int i, int j, int ai[], int ai1[])
	{
		return mChildHelper.dispatchNestedPreScroll(i, j, ai, ai1);
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #552 <Method boolean NestedScrollingChildHelper.dispatchNestedPreScroll(int, int, int[], int[])>
	//    7   12:ireturn         
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
	//    7   11:invokevirtual   #553 <Method boolean NestedScrollingChildHelper.dispatchNestedPreScroll(int, int, int[], int[], int)>
	//    8   14:ireturn         
	}

	public boolean dispatchNestedScroll(int i, int j, int k, int l, int ai[])
	{
		return mChildHelper.dispatchNestedScroll(i, j, k, l, ai);
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:aload           5
	//    7   11:invokevirtual   #556 <Method boolean NestedScrollingChildHelper.dispatchNestedScroll(int, int, int, int, int[])>
	//    8   14:ireturn         
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
	//    8   13:invokevirtual   #557 <Method boolean NestedScrollingChildHelper.dispatchNestedScroll(int, int, int, int, int[], int)>
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
	//    2    2:invokespecial   #561 <Method void FrameLayout.draw(Canvas)>
				if(mEdgeGlowTop == null)
					break label0;
	//    3    5:aload_0         
	//    4    6:getfield        #201 <Field EdgeEffect mEdgeGlowTop>
	//    5    9:ifnull          385
				int j3 = getScrollY();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #243 <Method int getScrollY()>
	//    8   16:istore          9
				boolean flag1 = mEdgeGlowTop.isFinished();
	//    9   18:aload_0         
	//   10   19:getfield        #201 <Field EdgeEffect mEdgeGlowTop>
	//   11   22:invokevirtual   #564 <Method boolean EdgeEffect.isFinished()>
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
	//   18   36:invokevirtual   #569 <Method int Canvas.save()>
	//   19   39:istore          10
					int i = getWidth();
	//   20   41:aload_0         
	//   21   42:invokevirtual   #572 <Method int getWidth()>
	//   22   45:istore_2        
					int l2 = getHeight();
	//   23   46:aload_0         
	//   24   47:invokevirtual   #175 <Method int getHeight()>
	//   25   50:istore          8
					int j2 = Math.min(0, j3);
	//   26   52:iconst_0        
	//   27   53:iload           9
	//   28   55:invokestatic    #530 <Method int Math.min(int, int)>
	//   29   58:istore          7
					int k;
					if(android.os.Build.VERSION.SDK_INT >= 21 && !getClipToPadding())
	//*  30   60:getstatic       #577 <Field int android.os.Build$VERSION.SDK_INT>
	//*  31   63:bipush          21
	//*  32   65:icmplt          83
	//*  33   68:aload_0         
	//*  34   69:invokevirtual   #580 <Method boolean getClipToPadding()>
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
	//   42   85:invokevirtual   #583 <Method int getPaddingLeft()>
	//   43   88:aload_0         
	//   44   89:invokevirtual   #586 <Method int getPaddingRight()>
	//   45   92:iadd            
	//   46   93:isub            
	//   47   94:istore_2        
						k = getPaddingLeft() + 0;
	//   48   95:aload_0         
	//   49   96:invokevirtual   #583 <Method int getPaddingLeft()>
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
	//*  57  110:getstatic       #577 <Field int android.os.Build$VERSION.SDK_INT>
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
	//*  65  127:invokevirtual   #580 <Method boolean getClipToPadding()>
	//*  66  130:ifeq            156
						{
							l1 = l2 - (getPaddingTop() + getPaddingBottom());
	//   67  133:iload           8
	//   68  135:aload_0         
	//   69  136:invokevirtual   #178 <Method int getPaddingTop()>
	//   70  139:aload_0         
	//   71  140:invokevirtual   #181 <Method int getPaddingBottom()>
	//   72  143:iadd            
	//   73  144:isub            
	//   74  145:istore          5
							i1 = j2 + getPaddingTop();
	//   75  147:iload           7
	//   76  149:aload_0         
	//   77  150:invokevirtual   #178 <Method int getPaddingTop()>
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
	//   85  162:invokevirtual   #590 <Method void Canvas.translate(float, float)>
					mEdgeGlowTop.setSize(i, l1);
	//   86  165:aload_0         
	//   87  166:getfield        #201 <Field EdgeEffect mEdgeGlowTop>
	//   88  169:iload_2         
	//   89  170:iload           5
	//   90  172:invokevirtual   #593 <Method void EdgeEffect.setSize(int, int)>
					if(mEdgeGlowTop.draw(canvas))
	//*  91  175:aload_0         
	//*  92  176:getfield        #201 <Field EdgeEffect mEdgeGlowTop>
	//*  93  179:aload_1         
	//*  94  180:invokevirtual   #596 <Method boolean EdgeEffect.draw(Canvas)>
	//*  95  183:ifeq            190
						ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   96  186:aload_0         
	//   97  187:invokestatic    #515 <Method void ViewCompat.postInvalidateOnAnimation(View)>
					canvas.restoreToCount(k3);
	//   98  190:aload_1         
	//   99  191:iload           10
	//  100  193:invokevirtual   #599 <Method void Canvas.restoreToCount(int)>
				}
				if(mEdgeGlowBottom.isFinished())
					break label0;
	//  101  196:aload_0         
	//  102  197:getfield        #208 <Field EdgeEffect mEdgeGlowBottom>
	//  103  200:invokevirtual   #564 <Method boolean EdgeEffect.isFinished()>
	//  104  203:ifne            385
				l3 = canvas.save();
	//  105  206:aload_1         
	//  106  207:invokevirtual   #569 <Method int Canvas.save()>
	//  107  210:istore          10
				int j1 = getWidth();
	//  108  212:aload_0         
	//  109  213:invokevirtual   #572 <Method int getWidth()>
	//  110  216:istore          4
				k2 = getHeight();
	//  111  218:aload_0         
	//  112  219:invokevirtual   #175 <Method int getHeight()>
	//  113  222:istore          7
				i3 = Math.max(getScrollRange(), j3) + k2;
	//  114  224:aload_0         
	//  115  225:invokevirtual   #246 <Method int getScrollRange()>
	//  116  228:iload           9
	//  117  230:invokestatic    #533 <Method int Math.max(int, int)>
	//  118  233:iload           7
	//  119  235:iadd            
	//  120  236:istore          8
				if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 121  238:getstatic       #577 <Field int android.os.Build$VERSION.SDK_INT>
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
	//  129  253:invokevirtual   #580 <Method boolean getClipToPadding()>
	//  130  256:ifeq            279
				}
				j = j1 - (getPaddingLeft() + getPaddingRight());
	//  131  259:iload           4
	//  132  261:aload_0         
	//  133  262:invokevirtual   #583 <Method int getPaddingLeft()>
	//  134  265:aload_0         
	//  135  266:invokevirtual   #586 <Method int getPaddingRight()>
	//  136  269:iadd            
	//  137  270:isub            
	//  138  271:istore_2        
				l = 0 + getPaddingLeft();
	//  139  272:iconst_0        
	//  140  273:aload_0         
	//  141  274:invokevirtual   #583 <Method int getPaddingLeft()>
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
	//* 148  287:getstatic       #577 <Field int android.os.Build$VERSION.SDK_INT>
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
	//* 156  304:invokevirtual   #580 <Method boolean getClipToPadding()>
	//* 157  307:ifeq            333
				{
					k1 = k2 - (getPaddingTop() + getPaddingBottom());
	//  158  310:iload           7
	//  159  312:aload_0         
	//  160  313:invokevirtual   #178 <Method int getPaddingTop()>
	//  161  316:aload_0         
	//  162  317:invokevirtual   #181 <Method int getPaddingBottom()>
	//  163  320:iadd            
	//  164  321:isub            
	//  165  322:istore          4
					i2 = i3 - getPaddingBottom();
	//  166  324:iload           8
	//  167  326:aload_0         
	//  168  327:invokevirtual   #181 <Method int getPaddingBottom()>
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
	//  178  341:invokevirtual   #590 <Method void Canvas.translate(float, float)>
			canvas.rotate(180F, j, 0.0F);
	//  179  344:aload_1         
	//  180  345:ldc2            #600 <Float 180F>
	//  181  348:iload_2         
	//  182  349:i2f             
	//  183  350:fconst_0        
	//  184  351:invokevirtual   #604 <Method void Canvas.rotate(float, float, float)>
			mEdgeGlowBottom.setSize(j, k1);
	//  185  354:aload_0         
	//  186  355:getfield        #208 <Field EdgeEffect mEdgeGlowBottom>
	//  187  358:iload_2         
	//  188  359:iload           4
	//  189  361:invokevirtual   #593 <Method void EdgeEffect.setSize(int, int)>
			if(mEdgeGlowBottom.draw(canvas))
	//* 190  364:aload_0         
	//* 191  365:getfield        #208 <Field EdgeEffect mEdgeGlowBottom>
	//* 192  368:aload_1         
	//* 193  369:invokevirtual   #596 <Method boolean EdgeEffect.draw(Canvas)>
	//* 194  372:ifeq            379
				ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//  195  375:aload_0         
	//  196  376:invokestatic    #515 <Method void ViewCompat.postInvalidateOnAnimation(View)>
			canvas.restoreToCount(l3);
	//  197  379:aload_1         
	//  198  380:iload           10
	//  199  382:invokevirtual   #599 <Method void Canvas.restoreToCount(int)>
		}
	//  200  385:return          
	}

	public boolean executeKeyEvent(KeyEvent keyevent)
	{
		mTempRect.setEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field Rect mTempRect>
	//    2    4:invokevirtual   #607 <Method void Rect.setEmpty()>
		boolean flag = canScroll();
	//    3    7:aload_0         
	//    4    8:invokespecial   #609 <Method boolean canScroll()>
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
	//*  13   26:invokevirtual   #610 <Method boolean isFocused()>
	//*  14   29:ifeq            106
	//*  15   32:aload_1         
	//*  16   33:invokevirtual   #615 <Method int KeyEvent.getKeyCode()>
	//*  17   36:iconst_4        
	//*  18   37:icmpeq          106
			{
				View view = findFocus();
	//   19   40:aload_0         
	//   20   41:invokevirtual   #413 <Method View findFocus()>
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
	//   29   57:invokestatic    #445 <Method FocusFinder FocusFinder.getInstance()>
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:sipush          130
	//   33   65:invokevirtual   #449 <Method View FocusFinder.findNextFocus(ViewGroup, View, int)>
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
	//*  48   94:invokevirtual   #417 <Method boolean View.requestFocus(int)>
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
	//*  57  109:invokevirtual   #618 <Method int KeyEvent.getAction()>
	//*  58  112:ifne            210
		{
			int i = keyevent.getKeyCode();
	//   59  115:aload_1         
	//   60  116:invokevirtual   #615 <Method int KeyEvent.getKeyCode()>
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
	//*  70  151:invokevirtual   #621 <Method boolean KeyEvent.isAltPressed()>
	//*  71  154:ifne            165
						return arrowScroll(130);
	//   72  157:aload_0         
	//   73  158:sipush          130
	//   74  161:invokevirtual   #623 <Method boolean arrowScroll(int)>
	//   75  164:ireturn         
					else
						return fullScroll(130);
	//   76  165:aload_0         
	//   77  166:sipush          130
	//   78  169:invokevirtual   #626 <Method boolean fullScroll(int)>
	//   79  172:ireturn         

				case 19: // '\023'
					break;
				}
				if(!keyevent.isAltPressed())
	//*  80  173:aload_1         
	//*  81  174:invokevirtual   #621 <Method boolean KeyEvent.isAltPressed()>
	//*  82  177:ifne            187
					return arrowScroll(33);
	//   83  180:aload_0         
	//   84  181:bipush          33
	//   85  183:invokevirtual   #623 <Method boolean arrowScroll(int)>
	//   86  186:ireturn         
				else
					return fullScroll(33);
	//   87  187:aload_0         
	//   88  188:bipush          33
	//   89  190:invokevirtual   #626 <Method boolean fullScroll(int)>
	//   90  193:ireturn         
			}
			if(keyevent.isShiftPressed())
	//*  91  194:aload_1         
	//*  92  195:invokevirtual   #629 <Method boolean KeyEvent.isShiftPressed()>
	//*  93  198:ifeq            204
				c = '!';
	//   94  201:bipush          33
	//   95  203:istore_2        
			pageScroll(((int) (c)));
	//   96  204:aload_0         
	//   97  205:iload_2         
	//   98  206:invokevirtual   #632 <Method boolean pageScroll(int)>
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
	//*   1    1:invokevirtual   #301 <Method int getChildCount()>
	//*   2    4:ifle            53
		{
			startNestedScroll(2, 1);
	//    3    7:aload_0         
	//    4    8:iconst_2        
	//    5    9:iconst_1        
	//    6   10:invokevirtual   #635 <Method boolean startNestedScroll(int, int)>
	//    7   13:pop             
			mScroller.fling(getScrollX(), getScrollY(), 0, i, 0, 0, 0x80000000, 0x7fffffff, 0, 0);
	//    8   14:aload_0         
	//    9   15:getfield        #324 <Field OverScroller mScroller>
	//   10   18:aload_0         
	//   11   19:invokevirtual   #496 <Method int getScrollX()>
	//   12   22:aload_0         
	//   13   23:invokevirtual   #243 <Method int getScrollY()>
	//   14   26:iconst_0        
	//   15   27:iload_1         
	//   16   28:iconst_0        
	//   17   29:iconst_0        
	//   18   30:ldc2            #636 <Int 0x80000000>
	//   19   33:ldc2            #637 <Int 0x7fffffff>
	//   20   36:iconst_0        
	//   21   37:iconst_0        
	//   22   38:invokevirtual   #640 <Method void OverScroller.fling(int, int, int, int, int, int, int, int, int, int)>
			mLastScrollerY = getScrollY();
	//   23   41:aload_0         
	//   24   42:aload_0         
	//   25   43:invokevirtual   #243 <Method int getScrollY()>
	//   26   46:putfield        #489 <Field int mLastScrollerY>
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   27   49:aload_0         
	//   28   50:invokestatic    #515 <Method void ViewCompat.postInvalidateOnAnimation(View)>
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
	//    9   15:invokevirtual   #175 <Method int getHeight()>
	//   10   18:istore_3        
		mTempRect.top = 0;
	//   11   19:aload_0         
	//   12   20:getfield        #101 <Field Rect mTempRect>
	//   13   23:iconst_0        
	//   14   24:putfield        #385 <Field int Rect.top>
		mTempRect.bottom = k;
	//   15   27:aload_0         
	//   16   28:getfield        #101 <Field Rect mTempRect>
	//   17   31:iload_3         
	//   18   32:putfield        #382 <Field int Rect.bottom>
		if(flag)
	//*  19   35:iload_2         
	//*  20   36:ifeq            90
		{
			int j = getChildCount();
	//   21   39:aload_0         
	//   22   40:invokevirtual   #301 <Method int getChildCount()>
	//   23   43:istore_2        
			if(j > 0)
	//*  24   44:iload_2         
	//*  25   45:ifle            90
			{
				View view = getChildAt(j - 1);
	//   26   48:aload_0         
	//   27   49:iload_2         
	//   28   50:iconst_1        
	//   29   51:isub            
	//   30   52:invokevirtual   #168 <Method View getChildAt(int)>
	//   31   55:astore          4
				mTempRect.bottom = view.getBottom() + getPaddingBottom();
	//   32   57:aload_0         
	//   33   58:getfield        #101 <Field Rect mTempRect>
	//   34   61:aload           4
	//   35   63:invokevirtual   #239 <Method int View.getBottom()>
	//   36   66:aload_0         
	//   37   67:invokevirtual   #181 <Method int getPaddingBottom()>
	//   38   70:iadd            
	//   39   71:putfield        #382 <Field int Rect.bottom>
				mTempRect.top = mTempRect.bottom - k;
	//   40   74:aload_0         
	//   41   75:getfield        #101 <Field Rect mTempRect>
	//   42   78:aload_0         
	//   43   79:getfield        #101 <Field Rect mTempRect>
	//   44   82:getfield        #382 <Field int Rect.bottom>
	//   45   85:iload_3         
	//   46   86:isub            
	//   47   87:putfield        #385 <Field int Rect.top>
			}
		}
		return scrollAndFocus(i, mTempRect.top, mTempRect.bottom);
	//   48   90:aload_0         
	//   49   91:iload_1         
	//   50   92:aload_0         
	//   51   93:getfield        #101 <Field Rect mTempRect>
	//   52   96:getfield        #385 <Field int Rect.top>
	//   53   99:aload_0         
	//   54  100:getfield        #101 <Field Rect mTempRect>
	//   55  103:getfield        #382 <Field int Rect.bottom>
	//   56  106:invokespecial   #642 <Method boolean scrollAndFocus(int, int, int)>
	//   57  109:ireturn         
	}

	protected float getBottomFadingEdgeStrength()
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #301 <Method int getChildCount()>
	//*   2    4:ifne            9
			return 0.0F;
	//    3    7:fconst_0        
	//    4    8:freturn         
		int i = getVerticalFadingEdgeLength();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #521 <Method int getVerticalFadingEdgeLength()>
	//    7   13:istore_1        
		int j = getHeight();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #175 <Method int getHeight()>
	//   10   18:istore_2        
		int k = getPaddingBottom();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #181 <Method int getPaddingBottom()>
	//   13   23:istore_3        
		j = getChildAt(0).getBottom() - getScrollY() - (j - k);
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:invokevirtual   #168 <Method View getChildAt(int)>
	//   17   29:invokevirtual   #239 <Method int View.getBottom()>
	//   18   32:aload_0         
	//   19   33:invokevirtual   #243 <Method int getScrollY()>
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
	//    2    3:invokevirtual   #175 <Method int getHeight()>
	//    3    6:i2f             
	//    4    7:fmul            
	//    5    8:f2i             
	//    6    9:ireturn         
	}

	public int getNestedScrollAxes()
	{
		return mParentHelper.getNestedScrollAxes();
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field NestedScrollingParentHelper mParentHelper>
	//    2    4:invokevirtual   #646 <Method int NestedScrollingParentHelper.getNestedScrollAxes()>
	//    3    7:ireturn         
	}

	int getScrollRange()
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #301 <Method int getChildCount()>
	//    2    4:istore_2        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		if(j > 0)
	//*   5    7:iload_2         
	//*   6    8:ifle            39
			i = Math.max(0, getChildAt(0).getHeight() - (getHeight() - getPaddingBottom() - getPaddingTop()));
	//    7   11:iconst_0        
	//    8   12:aload_0         
	//    9   13:iconst_0        
	//   10   14:invokevirtual   #168 <Method View getChildAt(int)>
	//   11   17:invokevirtual   #174 <Method int View.getHeight()>
	//   12   20:aload_0         
	//   13   21:invokevirtual   #175 <Method int getHeight()>
	//   14   24:aload_0         
	//   15   25:invokevirtual   #181 <Method int getPaddingBottom()>
	//   16   28:isub            
	//   17   29:aload_0         
	//   18   30:invokevirtual   #178 <Method int getPaddingTop()>
	//   19   33:isub            
	//   20   34:isub            
	//   21   35:invokestatic    #533 <Method int Math.max(int, int)>
	//   22   38:istore_1        
		return i;
	//   23   39:iload_1         
	//   24   40:ireturn         
	}

	protected float getTopFadingEdgeStrength()
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #301 <Method int getChildCount()>
	//*   2    4:ifne            9
			return 0.0F;
	//    3    7:fconst_0        
	//    4    8:freturn         
		int i = getVerticalFadingEdgeLength();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #521 <Method int getVerticalFadingEdgeLength()>
	//    7   13:istore_1        
		int j = getScrollY();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #243 <Method int getScrollY()>
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
	//    1    1:getfield        #153 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:invokevirtual   #649 <Method boolean NestedScrollingChildHelper.hasNestedScrollingParent()>
	//    3    7:ireturn         
	}

	public boolean hasNestedScrollingParent(int i)
	{
		return mChildHelper.hasNestedScrollingParent(i);
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #650 <Method boolean NestedScrollingChildHelper.hasNestedScrollingParent(int)>
	//    4    8:ireturn         
	}

	public boolean isFillViewport()
	{
		return mFillViewport;
	//    0    0:aload_0         
	//    1    1:getfield        #653 <Field boolean mFillViewport>
	//    2    4:ireturn         
	}

	public boolean isNestedScrollingEnabled()
	{
		return mChildHelper.isNestedScrollingEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:invokevirtual   #656 <Method boolean NestedScrollingChildHelper.isNestedScrollingEnabled()>
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
	//    1    1:invokevirtual   #663 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:astore          4
		view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), layoutparams.width), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
	//    3    6:aload_1         
	//    4    7:iload_2         
	//    5    8:aload_0         
	//    6    9:invokevirtual   #583 <Method int getPaddingLeft()>
	//    7   12:aload_0         
	//    8   13:invokevirtual   #586 <Method int getPaddingRight()>
	//    9   16:iadd            
	//   10   17:aload           4
	//   11   19:getfield        #668 <Field int android.view.ViewGroup$LayoutParams.width>
	//   12   22:invokestatic    #671 <Method int getChildMeasureSpec(int, int, int)>
	//   13   25:iconst_0        
	//   14   26:iconst_0        
	//   15   27:invokestatic    #676 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   16   30:invokevirtual   #679 <Method void View.measure(int, int)>
	//   17   33:return          
	}

	protected void measureChildWithMargins(View view, int i, int j, int k, int l)
	{
		android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #663 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #683 <Class android.view.ViewGroup$MarginLayoutParams>
	//    3    7:astore          6
		view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginlayoutparams.leftMargin + marginlayoutparams.rightMargin + j, marginlayoutparams.width), android.view.View.MeasureSpec.makeMeasureSpec(marginlayoutparams.topMargin + marginlayoutparams.bottomMargin, 0));
	//    4    9:aload_1         
	//    5   10:iload_2         
	//    6   11:aload_0         
	//    7   12:invokevirtual   #583 <Method int getPaddingLeft()>
	//    8   15:aload_0         
	//    9   16:invokevirtual   #586 <Method int getPaddingRight()>
	//   10   19:iadd            
	//   11   20:aload           6
	//   12   22:getfield        #686 <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//   13   25:iadd            
	//   14   26:aload           6
	//   15   28:getfield        #689 <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//   16   31:iadd            
	//   17   32:iload_3         
	//   18   33:iadd            
	//   19   34:aload           6
	//   20   36:getfield        #690 <Field int android.view.ViewGroup$MarginLayoutParams.width>
	//   21   39:invokestatic    #671 <Method int getChildMeasureSpec(int, int, int)>
	//   22   42:aload           6
	//   23   44:getfield        #693 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//   24   47:aload           6
	//   25   49:getfield        #696 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
	//   26   52:iadd            
	//   27   53:iconst_0        
	//   28   54:invokestatic    #676 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   29   57:invokevirtual   #679 <Method void View.measure(int, int)>
	//   30   60:return          
	}

	public void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #699 <Method void FrameLayout.onAttachedToWindow()>
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
	//*   1    1:invokevirtual   #704 <Method int MotionEvent.getSource()>
	//*   2    4:iconst_2        
	//*   3    5:iand            
	//*   4    6:ifeq            106
		{
			if(motionevent.getAction() != 8)
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #705 <Method int MotionEvent.getAction()>
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
	//   16   30:invokevirtual   #708 <Method float MotionEvent.getAxisValue(int)>
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
	//   24   42:invokespecial   #710 <Method float getVerticalScrollFactorCompat()>
	//   25   45:fmul            
	//   26   46:f2i             
	//   27   47:istore_3        
					int j = getScrollRange();
	//   28   48:aload_0         
	//   29   49:invokevirtual   #246 <Method int getScrollRange()>
	//   30   52:istore          4
					int l = getScrollY();
	//   31   54:aload_0         
	//   32   55:invokevirtual   #243 <Method int getScrollY()>
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
	//   55   97:invokevirtual   #496 <Method int getScrollX()>
	//   56  100:iload_3         
	//   57  101:invokespecial   #713 <Method void FrameLayout.scrollTo(int, int)>
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
	//    1    1:invokevirtual   #705 <Method int MotionEvent.getAction()>
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
	//   30   82:invokevirtual   #717 <Method int MotionEvent.findPointerIndex(int)>
	//   31   85:istore_3        
					if(i1 == -1)
	//*  32   86:iload_3         
	//*  33   87:iconst_m1       
	//*  34   88:icmpne          134
					{
						motionevent = ((MotionEvent) (new StringBuilder()));
	//   35   91:new             #719 <Class StringBuilder>
	//   36   94:dup             
	//   37   95:invokespecial   #720 <Method void StringBuilder()>
	//   38   98:astore_1        
						((StringBuilder) (motionevent)).append("Invalid pointerId=");
	//   39   99:aload_1         
	//   40  100:ldc2            #722 <String "Invalid pointerId=">
	//   41  103:invokevirtual   #726 <Method StringBuilder StringBuilder.append(String)>
	//   42  106:pop             
						((StringBuilder) (motionevent)).append(j);
	//   43  107:aload_1         
	//   44  108:iload_2         
	//   45  109:invokevirtual   #729 <Method StringBuilder StringBuilder.append(int)>
	//   46  112:pop             
						((StringBuilder) (motionevent)).append(" in onInterceptTouchEvent");
	//   47  113:aload_1         
	//   48  114:ldc2            #731 <String " in onInterceptTouchEvent">
	//   49  117:invokevirtual   #726 <Method StringBuilder StringBuilder.append(String)>
	//   50  120:pop             
						Log.e("NestedScrollView", ((StringBuilder) (motionevent)).toString());
	//   51  121:ldc1            #37  <String "NestedScrollView">
	//   52  123:aload_1         
	//   53  124:invokevirtual   #735 <Method String StringBuilder.toString()>
	//   54  127:invokestatic    #741 <Method int Log.e(String, String)>
	//   55  130:pop             
					} else
	//*  56  131:goto            356
					{
						int k = (int)motionevent.getY(i1);
	//   57  134:aload_1         
	//   58  135:iload_3         
	//   59  136:invokevirtual   #400 <Method float MotionEvent.getY(int)>
	//   60  139:f2i             
	//   61  140:istore_2        
						if(Math.abs(k - mLastMotionY) > mTouchSlop && (2 & getNestedScrollAxes()) == 0)
	//*  62  141:iload_2         
	//*  63  142:aload_0         
	//*  64  143:getfield        #402 <Field int mLastMotionY>
	//*  65  146:isub            
	//*  66  147:invokestatic    #744 <Method int Math.abs(int)>
	//*  67  150:aload_0         
	//*  68  151:getfield        #344 <Field int mTouchSlop>
	//*  69  154:icmple          356
	//*  70  157:iconst_2        
	//*  71  158:aload_0         
	//*  72  159:invokevirtual   #745 <Method int getNestedScrollAxes()>
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
	//   80  173:putfield        #402 <Field int mLastMotionY>
							initVelocityTrackerIfNotExists();
	//   81  176:aload_0         
	//   82  177:invokespecial   #747 <Method void initVelocityTrackerIfNotExists()>
							mVelocityTracker.addMovement(motionevent);
	//   83  180:aload_0         
	//   84  181:getfield        #310 <Field VelocityTracker mVelocityTracker>
	//   85  184:aload_1         
	//   86  185:invokevirtual   #750 <Method void VelocityTracker.addMovement(MotionEvent)>
							mNestedYOffset = 0;
	//   87  188:aload_0         
	//   88  189:iconst_0        
	//   89  190:putfield        #752 <Field int mNestedYOffset>
							motionevent = ((MotionEvent) (getParent()));
	//   90  193:aload_0         
	//   91  194:invokevirtual   #753 <Method ViewParent getParent()>
	//   92  197:astore_1        
							if(motionevent != null)
	//*  93  198:aload_1         
	//*  94  199:ifnull          356
								((ViewParent) (motionevent)).requestDisallowInterceptTouchEvent(true);
	//   95  202:aload_1         
	//   96  203:iconst_1        
	//   97  204:invokeinterface #758 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
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
	//  106  223:invokespecial   #196 <Method void recycleVelocityTracker()>
				if(mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()))
	//* 107  226:aload_0         
	//* 108  227:getfield        #324 <Field OverScroller mScroller>
	//* 109  230:aload_0         
	//* 110  231:invokevirtual   #496 <Method int getScrollX()>
	//* 111  234:aload_0         
	//* 112  235:invokevirtual   #243 <Method int getScrollY()>
	//* 113  238:iconst_0        
	//* 114  239:iconst_0        
	//* 115  240:iconst_0        
	//* 116  241:aload_0         
	//* 117  242:invokevirtual   #246 <Method int getScrollRange()>
	//* 118  245:invokevirtual   #762 <Method boolean OverScroller.springBack(int, int, int, int, int, int)>
	//* 119  248:ifeq            255
					ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//  120  251:aload_0         
	//  121  252:invokestatic    #515 <Method void ViewCompat.postInvalidateOnAnimation(View)>
				stopNestedScroll(0);
	//  122  255:aload_0         
	//  123  256:iconst_0        
	//  124  257:invokevirtual   #199 <Method void stopNestedScroll(int)>
				break;

	//* 125  260:goto            356
			case 0: // '\0'
				int l = (int)motionevent.getY();
	//  126  263:aload_1         
	//  127  264:invokevirtual   #764 <Method float MotionEvent.getY()>
	//  128  267:f2i             
	//  129  268:istore_2        
				if(!inChild((int)motionevent.getX(), l))
	//* 130  269:aload_0         
	//* 131  270:aload_1         
	//* 132  271:invokevirtual   #767 <Method float MotionEvent.getX()>
	//* 133  274:f2i             
	//* 134  275:iload_2         
	//* 135  276:invokespecial   #769 <Method boolean inChild(int, int)>
	//* 136  279:ifne            294
				{
					mIsBeingDragged = false;
	//  137  282:aload_0         
	//  138  283:iconst_0        
	//  139  284:putfield        #109 <Field boolean mIsBeingDragged>
					recycleVelocityTracker();
	//  140  287:aload_0         
	//  141  288:invokespecial   #196 <Method void recycleVelocityTracker()>
				} else
	//* 142  291:goto            356
				{
					mLastMotionY = l;
	//  143  294:aload_0         
	//  144  295:iload_2         
	//  145  296:putfield        #402 <Field int mLastMotionY>
					mActivePointerId = motionevent.getPointerId(0);
	//  146  299:aload_0         
	//  147  300:aload_1         
	//  148  301:iconst_0        
	//  149  302:invokevirtual   #396 <Method int MotionEvent.getPointerId(int)>
	//  150  305:putfield        #113 <Field int mActivePointerId>
					initOrResetVelocityTracker();
	//  151  308:aload_0         
	//  152  309:invokespecial   #771 <Method void initOrResetVelocityTracker()>
					mVelocityTracker.addMovement(motionevent);
	//  153  312:aload_0         
	//  154  313:getfield        #310 <Field VelocityTracker mVelocityTracker>
	//  155  316:aload_1         
	//  156  317:invokevirtual   #750 <Method void VelocityTracker.addMovement(MotionEvent)>
					mScroller.computeScrollOffset();
	//  157  320:aload_0         
	//  158  321:getfield        #324 <Field OverScroller mScroller>
	//  159  324:invokevirtual   #481 <Method boolean OverScroller.computeScrollOffset()>
	//  160  327:pop             
					mIsBeingDragged = mScroller.isFinished() ^ true;
	//  161  328:aload_0         
	//  162  329:aload_0         
	//  163  330:getfield        #324 <Field OverScroller mScroller>
	//  164  333:invokevirtual   #772 <Method boolean OverScroller.isFinished()>
	//  165  336:iconst_1        
	//  166  337:ixor            
	//  167  338:putfield        #109 <Field boolean mIsBeingDragged>
					startNestedScroll(2, 0);
	//  168  341:aload_0         
	//  169  342:iconst_2        
	//  170  343:iconst_0        
	//  171  344:invokevirtual   #635 <Method boolean startNestedScroll(int, int)>
	//  172  347:pop             
				}
				break;
			}
		else
	//* 173  348:goto            356
			onSecondaryPointerUp(motionevent);
	//  174  351:aload_0         
	//  175  352:aload_1         
	//  176  353:invokespecial   #774 <Method void onSecondaryPointerUp(MotionEvent)>
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
	//    6    8:invokespecial   #778 <Method void FrameLayout.onLayout(boolean, int, int, int, int)>
		mIsLayoutDirty = false;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #103 <Field boolean mIsLayoutDirty>
		if(mChildToScrollTo != null && isViewDescendantOf(mChildToScrollTo, ((View) (this))))
	//*  10   16:aload_0         
	//*  11   17:getfield        #107 <Field View mChildToScrollTo>
	//*  12   20:ifnull          42
	//*  13   23:aload_0         
	//*  14   24:getfield        #107 <Field View mChildToScrollTo>
	//*  15   27:aload_0         
	//*  16   28:invokestatic    #371 <Method boolean isViewDescendantOf(View, View)>
	//*  17   31:ifeq            42
			scrollToChild(mChildToScrollTo);
	//   18   34:aload_0         
	//   19   35:aload_0         
	//   20   36:getfield        #107 <Field View mChildToScrollTo>
	//   21   39:invokespecial   #780 <Method void scrollToChild(View)>
		mChildToScrollTo = null;
	//   22   42:aload_0         
	//   23   43:aconst_null     
	//   24   44:putfield        #107 <Field View mChildToScrollTo>
		if(!mIsLaidOut)
	//*  25   47:aload_0         
	//*  26   48:getfield        #105 <Field boolean mIsLaidOut>
	//*  27   51:ifne            159
		{
			if(mSavedState != null)
	//*  28   54:aload_0         
	//*  29   55:getfield        #782 <Field NestedScrollView$SavedState mSavedState>
	//*  30   58:ifnull          81
			{
				scrollTo(getScrollX(), mSavedState.scrollPosition);
	//   31   61:aload_0         
	//   32   62:aload_0         
	//   33   63:invokevirtual   #496 <Method int getScrollX()>
	//   34   66:aload_0         
	//   35   67:getfield        #782 <Field NestedScrollView$SavedState mSavedState>
	//   36   70:getfield        #785 <Field int NestedScrollView$SavedState.scrollPosition>
	//   37   73:invokevirtual   #786 <Method void scrollTo(int, int)>
				mSavedState = null;
	//   38   76:aload_0         
	//   39   77:aconst_null     
	//   40   78:putfield        #782 <Field NestedScrollView$SavedState mSavedState>
			}
			if(getChildCount() > 0)
	//*  41   81:aload_0         
	//*  42   82:invokevirtual   #301 <Method int getChildCount()>
	//*  43   85:ifle            100
				i = getChildAt(0).getMeasuredHeight();
	//   44   88:aload_0         
	//   45   89:iconst_0        
	//   46   90:invokevirtual   #168 <Method View getChildAt(int)>
	//   47   93:invokevirtual   #789 <Method int View.getMeasuredHeight()>
	//   48   96:istore_2        
			else
	//*  49   97:goto            102
				i = 0;
	//   50  100:iconst_0        
	//   51  101:istore_2        
			i = Math.max(0, i - (l - j - getPaddingBottom() - getPaddingTop()));
	//   52  102:iconst_0        
	//   53  103:iload_2         
	//   54  104:iload           5
	//   55  106:iload_3         
	//   56  107:isub            
	//   57  108:aload_0         
	//   58  109:invokevirtual   #181 <Method int getPaddingBottom()>
	//   59  112:isub            
	//   60  113:aload_0         
	//   61  114:invokevirtual   #178 <Method int getPaddingTop()>
	//   62  117:isub            
	//   63  118:isub            
	//   64  119:invokestatic    #533 <Method int Math.max(int, int)>
	//   65  122:istore_2        
			if(getScrollY() > i)
	//*  66  123:aload_0         
	//*  67  124:invokevirtual   #243 <Method int getScrollY()>
	//*  68  127:iload_2         
	//*  69  128:icmple          143
				scrollTo(getScrollX(), i);
	//   70  131:aload_0         
	//   71  132:aload_0         
	//   72  133:invokevirtual   #496 <Method int getScrollX()>
	//   73  136:iload_2         
	//   74  137:invokevirtual   #786 <Method void scrollTo(int, int)>
			else
	//*  75  140:goto            159
			if(getScrollY() < 0)
	//*  76  143:aload_0         
	//*  77  144:invokevirtual   #243 <Method int getScrollY()>
	//*  78  147:ifge            159
				scrollTo(getScrollX(), 0);
	//   79  150:aload_0         
	//   80  151:aload_0         
	//   81  152:invokevirtual   #496 <Method int getScrollX()>
	//   82  155:iconst_0        
	//   83  156:invokevirtual   #786 <Method void scrollTo(int, int)>
		}
		scrollTo(getScrollX(), getScrollY());
	//   84  159:aload_0         
	//   85  160:aload_0         
	//   86  161:invokevirtual   #496 <Method int getScrollX()>
	//   87  164:aload_0         
	//   88  165:invokevirtual   #243 <Method int getScrollY()>
	//   89  168:invokevirtual   #786 <Method void scrollTo(int, int)>
		mIsLaidOut = true;
	//   90  171:aload_0         
	//   91  172:iconst_1        
	//   92  173:putfield        #105 <Field boolean mIsLaidOut>
	//   93  176:return          
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
	//*   5    7:getfield        #653 <Field boolean mFillViewport>
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
	//*  13   23:invokevirtual   #301 <Method int getChildCount()>
	//*  14   26:ifle            96
		{
			View view = getChildAt(0);
	//   15   29:aload_0         
	//   16   30:iconst_0        
	//   17   31:invokevirtual   #168 <Method View getChildAt(int)>
	//   18   34:astore_3        
			j = getMeasuredHeight();
	//   19   35:aload_0         
	//   20   36:invokevirtual   #796 <Method int getMeasuredHeight()>
	//   21   39:istore_2        
			if(view.getMeasuredHeight() < j)
	//*  22   40:aload_3         
	//*  23   41:invokevirtual   #789 <Method int View.getMeasuredHeight()>
	//*  24   44:iload_2         
	//*  25   45:icmpge          96
			{
				android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
	//   26   48:aload_3         
	//   27   49:invokevirtual   #663 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   28   52:checkcast       #798 <Class android.widget.FrameLayout$LayoutParams>
	//   29   55:astore          4
				view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), layoutparams.width), android.view.View.MeasureSpec.makeMeasureSpec(j - getPaddingTop() - getPaddingBottom(), 0x40000000));
	//   30   57:aload_3         
	//   31   58:iload_1         
	//   32   59:aload_0         
	//   33   60:invokevirtual   #583 <Method int getPaddingLeft()>
	//   34   63:aload_0         
	//   35   64:invokevirtual   #586 <Method int getPaddingRight()>
	//   36   67:iadd            
	//   37   68:aload           4
	//   38   70:getfield        #799 <Field int android.widget.FrameLayout$LayoutParams.width>
	//   39   73:invokestatic    #671 <Method int getChildMeasureSpec(int, int, int)>
	//   40   76:iload_2         
	//   41   77:aload_0         
	//   42   78:invokevirtual   #178 <Method int getPaddingTop()>
	//   43   81:isub            
	//   44   82:aload_0         
	//   45   83:invokevirtual   #181 <Method int getPaddingBottom()>
	//   46   86:isub            
	//   47   87:ldc2            #800 <Int 0x40000000>
	//   48   90:invokestatic    #676 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   49   93:invokevirtual   #679 <Method void View.measure(int, int)>
			}
		}
	//   50   96:return          
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
	//    3    3:invokevirtual   #250 <Method boolean dispatchNestedPreFling(float, float)>
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
	//    5    6:invokevirtual   #809 <Method boolean dispatchNestedPreScroll(int, int, int[], int[])>
	//    6    9:pop             
	//    7   10:return          
	}

	public void onNestedScroll(View view, int i, int j, int k, int l)
	{
		i = getScrollY();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #243 <Method int getScrollY()>
	//    2    4:istore_2        
		scrollBy(0, l);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:iload           5
	//    6    9:invokevirtual   #192 <Method void scrollBy(int, int)>
		i = getScrollY() - i;
	//    7   12:aload_0         
	//    8   13:invokevirtual   #243 <Method int getScrollY()>
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
	//   20   28:invokevirtual   #811 <Method boolean dispatchNestedScroll(int, int, int, int, int[])>
	//   21   31:pop             
	//   22   32:return          
	}

	public void onNestedScrollAccepted(View view, View view1, int i)
	{
		mParentHelper.onNestedScrollAccepted(view, view1, i);
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field NestedScrollingParentHelper mParentHelper>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #815 <Method void NestedScrollingParentHelper.onNestedScrollAccepted(View, View, int)>
		startNestedScroll(2);
	//    6   10:aload_0         
	//    7   11:iconst_2        
	//    8   12:invokevirtual   #817 <Method boolean startNestedScroll(int)>
	//    9   15:pop             
	//   10   16:return          
	}

	protected void onOverScrolled(int i, int j, boolean flag, boolean flag1)
	{
		super.scrollTo(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #713 <Method void FrameLayout.scrollTo(int, int)>
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
	//   15   26:invokestatic    #445 <Method FocusFinder FocusFinder.getInstance()>
	//   16   29:aload_0         
	//   17   30:aconst_null     
	//   18   31:iload_3         
	//   19   32:invokevirtual   #449 <Method View FocusFinder.findNextFocus(ViewGroup, View, int)>
	//   20   35:astore          4
		else
	//*  21   37:goto            51
			view = FocusFinder.getInstance().findNextFocusFromRect(((ViewGroup) (this)), rect, j);
	//   22   40:invokestatic    #445 <Method FocusFinder FocusFinder.getInstance()>
	//   23   43:aload_0         
	//   24   44:aload_2         
	//   25   45:iload_3         
	//   26   46:invokevirtual   #825 <Method View FocusFinder.findNextFocusFromRect(ViewGroup, Rect, int)>
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
	//*  34   61:invokespecial   #457 <Method boolean isOffScreen(View)>
	//*  35   64:ifeq            69
			return false;
	//   36   67:iconst_0        
	//   37   68:ireturn         
		else
			return view.requestFocus(j, rect);
	//   38   69:aload           4
	//   39   71:iload_3         
	//   40   72:aload_2         
	//   41   73:invokevirtual   #827 <Method boolean View.requestFocus(int, Rect)>
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
	//    5    9:invokespecial   #831 <Method void FrameLayout.onRestoreInstanceState(Parcelable)>
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
	//   12   20:invokevirtual   #835 <Method Parcelable NestedScrollView$SavedState.getSuperState()>
	//   13   23:invokespecial   #831 <Method void FrameLayout.onRestoreInstanceState(Parcelable)>
			mSavedState = ((SavedState) (parcelable));
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:putfield        #782 <Field NestedScrollView$SavedState mSavedState>
			requestLayout();
	//   17   31:aload_0         
	//   18   32:invokevirtual   #838 <Method void requestLayout()>
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
	//    3    5:invokespecial   #841 <Method Parcelable FrameLayout.onSaveInstanceState()>
	//    4    8:invokespecial   #843 <Method void NestedScrollView$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.scrollPosition = getScrollY();
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #243 <Method int getScrollY()>
	//    9   17:putfield        #785 <Field int NestedScrollView$SavedState.scrollPosition>
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
	//    5    6:invokespecial   #847 <Method void FrameLayout.onScrollChanged(int, int, int, int)>
		if(mOnScrollChangeListener != null)
	//*   6    9:aload_0         
	//*   7   10:getfield        #849 <Field NestedScrollView$OnScrollChangeListener mOnScrollChangeListener>
	//*   8   13:ifnull          31
			mOnScrollChangeListener.onScrollChange(this, i, j, k, l);
	//    9   16:aload_0         
	//   10   17:getfield        #849 <Field NestedScrollView$OnScrollChangeListener mOnScrollChangeListener>
	//   11   20:aload_0         
	//   12   21:iload_1         
	//   13   22:iload_2         
	//   14   23:iload_3         
	//   15   24:iload           4
	//   16   26:invokeinterface #853 <Method void NestedScrollView$OnScrollChangeListener.onScrollChange(NestedScrollView, int, int, int, int)>
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
	//    5    6:invokespecial   #856 <Method void FrameLayout.onSizeChanged(int, int, int, int)>
		View view = findFocus();
	//    6    9:aload_0         
	//    7   10:invokevirtual   #413 <Method View findFocus()>
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
	//*  19   33:invokespecial   #361 <Method boolean isWithinDeltaOfScreen(View, int, int)>
	//*  20   36:ifeq            70
			{
				view.getDrawingRect(mTempRect);
	//   21   39:aload           5
	//   22   41:aload_0         
	//   23   42:getfield        #101 <Field Rect mTempRect>
	//   24   45:invokevirtual   #375 <Method void View.getDrawingRect(Rect)>
				offsetDescendantRectToMyCoords(view, mTempRect);
	//   25   48:aload_0         
	//   26   49:aload           5
	//   27   51:aload_0         
	//   28   52:getfield        #101 <Field Rect mTempRect>
	//   29   55:invokevirtual   #379 <Method void offsetDescendantRectToMyCoords(View, Rect)>
				doScrollY(computeScrollDeltaToGetChildRectOnScreen(mTempRect));
	//   30   58:aload_0         
	//   31   59:aload_0         
	//   32   60:aload_0         
	//   33   61:getfield        #101 <Field Rect mTempRect>
	//   34   64:invokevirtual   #422 <Method int computeScrollDeltaToGetChildRectOnScreen(Rect)>
	//   35   67:invokespecial   #409 <Method void doScrollY(int)>
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
	//    1    1:getfield        #146 <Field NestedScrollingParentHelper mParentHelper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #861 <Method void NestedScrollingParentHelper.onStopNestedScroll(View)>
		stopNestedScroll();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #863 <Method void stopNestedScroll()>
	//    6   12:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		initVelocityTrackerIfNotExists();
	//    0    0:aload_0         
	//    1    1:invokespecial   #747 <Method void initVelocityTrackerIfNotExists()>
		MotionEvent motionevent1 = MotionEvent.obtain(motionevent);
	//    2    4:aload_1         
	//    3    5:invokestatic    #867 <Method MotionEvent MotionEvent.obtain(MotionEvent)>
	//    4    8:astore          9
		int i = motionevent.getActionMasked();
	//    5   10:aload_1         
	//    6   11:invokevirtual   #870 <Method int MotionEvent.getActionMasked()>
	//    7   14:istore_2        
		if(i == 0)
	//*   8   15:iload_2         
	//*   9   16:ifne            24
			mNestedYOffset = 0;
	//   10   19:aload_0         
	//   11   20:iconst_0        
	//   12   21:putfield        #752 <Field int mNestedYOffset>
		motionevent1.offsetLocation(0.0F, mNestedYOffset);
	//   13   24:aload           9
	//   14   26:fconst_0        
	//   15   27:aload_0         
	//   16   28:getfield        #752 <Field int mNestedYOffset>
	//   17   31:i2f             
	//   18   32:invokevirtual   #873 <Method void MotionEvent.offsetLocation(float, float)>
		switch(i)
	//*  19   35:iload_2         
		{
	//*  20   36:tableswitch     0 6: default 80
	//	               0 802
	//	               1 714
	//	               2 190
	//	               3 135
	//	               4 80
	//	               5 108
	//	               6 83
	//*  21   80:goto            894
		case 6: // '\006'
			onSecondaryPointerUp(motionevent);
	//   22   83:aload_0         
	//   23   84:aload_1         
	//   24   85:invokespecial   #774 <Method void onSecondaryPointerUp(MotionEvent)>
			mLastMotionY = (int)motionevent.getY(motionevent.findPointerIndex(mActivePointerId));
	//   25   88:aload_0         
	//   26   89:aload_1         
	//   27   90:aload_1         
	//   28   91:aload_0         
	//   29   92:getfield        #113 <Field int mActivePointerId>
	//   30   95:invokevirtual   #717 <Method int MotionEvent.findPointerIndex(int)>
	//   31   98:invokevirtual   #400 <Method float MotionEvent.getY(int)>
	//   32  101:f2i             
	//   33  102:putfield        #402 <Field int mLastMotionY>
			break;

	//*  34  105:goto            894
		case 5: // '\005'
			int j = motionevent.getActionIndex();
	//   35  108:aload_1         
	//   36  109:invokevirtual   #392 <Method int MotionEvent.getActionIndex()>
	//   37  112:istore_2        
			mLastMotionY = (int)motionevent.getY(j);
	//   38  113:aload_0         
	//   39  114:aload_1         
	//   40  115:iload_2         
	//   41  116:invokevirtual   #400 <Method float MotionEvent.getY(int)>
	//   42  119:f2i             
	//   43  120:putfield        #402 <Field int mLastMotionY>
			mActivePointerId = motionevent.getPointerId(j);
	//   44  123:aload_0         
	//   45  124:aload_1         
	//   46  125:iload_2         
	//   47  126:invokevirtual   #396 <Method int MotionEvent.getPointerId(int)>
	//   48  129:putfield        #113 <Field int mActivePointerId>
			break;

	//*  49  132:goto            894
		case 3: // '\003'
			if(mIsBeingDragged && getChildCount() > 0 && mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()))
	//*  50  135:aload_0         
	//*  51  136:getfield        #109 <Field boolean mIsBeingDragged>
	//*  52  139:ifeq            178
	//*  53  142:aload_0         
	//*  54  143:invokevirtual   #301 <Method int getChildCount()>
	//*  55  146:ifle            178
	//*  56  149:aload_0         
	//*  57  150:getfield        #324 <Field OverScroller mScroller>
	//*  58  153:aload_0         
	//*  59  154:invokevirtual   #496 <Method int getScrollX()>
	//*  60  157:aload_0         
	//*  61  158:invokevirtual   #243 <Method int getScrollY()>
	//*  62  161:iconst_0        
	//*  63  162:iconst_0        
	//*  64  163:iconst_0        
	//*  65  164:aload_0         
	//*  66  165:invokevirtual   #246 <Method int getScrollRange()>
	//*  67  168:invokevirtual   #762 <Method boolean OverScroller.springBack(int, int, int, int, int, int)>
	//*  68  171:ifeq            178
				ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   69  174:aload_0         
	//   70  175:invokestatic    #515 <Method void ViewCompat.postInvalidateOnAnimation(View)>
			mActivePointerId = -1;
	//   71  178:aload_0         
	//   72  179:iconst_m1       
	//   73  180:putfield        #113 <Field int mActivePointerId>
			endDrag();
	//   74  183:aload_0         
	//   75  184:invokespecial   #875 <Method void endDrag()>
			break;

	//*  76  187:goto            894
		case 2: // '\002'
			int l1 = motionevent.findPointerIndex(mActivePointerId);
	//   77  190:aload_1         
	//   78  191:aload_0         
	//   79  192:getfield        #113 <Field int mActivePointerId>
	//   80  195:invokevirtual   #717 <Method int MotionEvent.findPointerIndex(int)>
	//   81  198:istore          4
			if(l1 == -1)
	//*  82  200:iload           4
	//*  83  202:iconst_m1       
	//*  84  203:icmpne          252
			{
				motionevent = ((MotionEvent) (new StringBuilder()));
	//   85  206:new             #719 <Class StringBuilder>
	//   86  209:dup             
	//   87  210:invokespecial   #720 <Method void StringBuilder()>
	//   88  213:astore_1        
				((StringBuilder) (motionevent)).append("Invalid pointerId=");
	//   89  214:aload_1         
	//   90  215:ldc2            #722 <String "Invalid pointerId=">
	//   91  218:invokevirtual   #726 <Method StringBuilder StringBuilder.append(String)>
	//   92  221:pop             
				((StringBuilder) (motionevent)).append(mActivePointerId);
	//   93  222:aload_1         
	//   94  223:aload_0         
	//   95  224:getfield        #113 <Field int mActivePointerId>
	//   96  227:invokevirtual   #729 <Method StringBuilder StringBuilder.append(int)>
	//   97  230:pop             
				((StringBuilder) (motionevent)).append(" in onTouchEvent");
	//   98  231:aload_1         
	//   99  232:ldc2            #877 <String " in onTouchEvent">
	//  100  235:invokevirtual   #726 <Method StringBuilder StringBuilder.append(String)>
	//  101  238:pop             
				Log.e("NestedScrollView", ((StringBuilder) (motionevent)).toString());
	//  102  239:ldc1            #37  <String "NestedScrollView">
	//  103  241:aload_1         
	//  104  242:invokevirtual   #735 <Method String StringBuilder.toString()>
	//  105  245:invokestatic    #741 <Method int Log.e(String, String)>
	//  106  248:pop             
			} else
	//* 107  249:goto            894
			{
				int i2 = (int)motionevent.getY(l1);
	//  108  252:aload_1         
	//  109  253:iload           4
	//  110  255:invokevirtual   #400 <Method float MotionEvent.getY(int)>
	//  111  258:f2i             
	//  112  259:istore          5
				int k = mLastMotionY - i2;
	//  113  261:aload_0         
	//  114  262:getfield        #402 <Field int mLastMotionY>
	//  115  265:iload           5
	//  116  267:isub            
	//  117  268:istore_2        
				int i1 = k;
	//  118  269:iload_2         
	//  119  270:istore_3        
				if(dispatchNestedPreScroll(0, k, mScrollConsumed, mScrollOffset, 0))
	//* 120  271:aload_0         
	//* 121  272:iconst_0        
	//* 122  273:iload_2         
	//* 123  274:aload_0         
	//* 124  275:getfield        #117 <Field int[] mScrollConsumed>
	//* 125  278:aload_0         
	//* 126  279:getfield        #115 <Field int[] mScrollOffset>
	//* 127  282:iconst_0        
	//* 128  283:invokevirtual   #493 <Method boolean dispatchNestedPreScroll(int, int, int[], int[], int)>
	//* 129  286:ifeq            326
				{
					i1 = k - mScrollConsumed[1];
	//  130  289:iload_2         
	//  131  290:aload_0         
	//  132  291:getfield        #117 <Field int[] mScrollConsumed>
	//  133  294:iconst_1        
	//  134  295:iaload          
	//  135  296:isub            
	//  136  297:istore_3        
					motionevent1.offsetLocation(0.0F, mScrollOffset[1]);
	//  137  298:aload           9
	//  138  300:fconst_0        
	//  139  301:aload_0         
	//  140  302:getfield        #115 <Field int[] mScrollOffset>
	//  141  305:iconst_1        
	//  142  306:iaload          
	//  143  307:i2f             
	//  144  308:invokevirtual   #873 <Method void MotionEvent.offsetLocation(float, float)>
					mNestedYOffset = mNestedYOffset + mScrollOffset[1];
	//  145  311:aload_0         
	//  146  312:aload_0         
	//  147  313:getfield        #752 <Field int mNestedYOffset>
	//  148  316:aload_0         
	//  149  317:getfield        #115 <Field int[] mScrollOffset>
	//  150  320:iconst_1        
	//  151  321:iaload          
	//  152  322:iadd            
	//  153  323:putfield        #752 <Field int mNestedYOffset>
				}
				k = i1;
	//  154  326:iload_3         
	//  155  327:istore_2        
				if(!mIsBeingDragged)
	//* 156  328:aload_0         
	//* 157  329:getfield        #109 <Field boolean mIsBeingDragged>
	//* 158  332:ifne            393
				{
					k = i1;
	//  159  335:iload_3         
	//  160  336:istore_2        
					if(Math.abs(i1) > mTouchSlop)
	//* 161  337:iload_3         
	//* 162  338:invokestatic    #744 <Method int Math.abs(int)>
	//* 163  341:aload_0         
	//* 164  342:getfield        #344 <Field int mTouchSlop>
	//* 165  345:icmple          393
					{
						ViewParent viewparent = getParent();
	//  166  348:aload_0         
	//  167  349:invokevirtual   #753 <Method ViewParent getParent()>
	//  168  352:astore          10
						if(viewparent != null)
	//* 169  354:aload           10
	//* 170  356:ifnull          367
							viewparent.requestDisallowInterceptTouchEvent(true);
	//  171  359:aload           10
	//  172  361:iconst_1        
	//  173  362:invokeinterface #758 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
						mIsBeingDragged = true;
	//  174  367:aload_0         
	//  175  368:iconst_1        
	//  176  369:putfield        #109 <Field boolean mIsBeingDragged>
						if(i1 > 0)
	//* 177  372:iload_3         
	//* 178  373:ifle            386
							k = i1 - mTouchSlop;
	//  179  376:iload_3         
	//  180  377:aload_0         
	//  181  378:getfield        #344 <Field int mTouchSlop>
	//  182  381:isub            
	//  183  382:istore_2        
						else
	//* 184  383:goto            393
							k = i1 + mTouchSlop;
	//  185  386:iload_3         
	//  186  387:aload_0         
	//  187  388:getfield        #344 <Field int mTouchSlop>
	//  188  391:iadd            
	//  189  392:istore_2        
					}
				}
				if(mIsBeingDragged)
	//* 190  393:aload_0         
	//* 191  394:getfield        #109 <Field boolean mIsBeingDragged>
	//* 192  397:ifeq            894
				{
					mLastMotionY = i2 - mScrollOffset[1];
	//  193  400:aload_0         
	//  194  401:iload           5
	//  195  403:aload_0         
	//  196  404:getfield        #115 <Field int[] mScrollOffset>
	//  197  407:iconst_1        
	//  198  408:iaload          
	//  199  409:isub            
	//  200  410:putfield        #402 <Field int mLastMotionY>
					int j2 = getScrollY();
	//  201  413:aload_0         
	//  202  414:invokevirtual   #243 <Method int getScrollY()>
	//  203  417:istore          6
					i2 = getScrollRange();
	//  204  419:aload_0         
	//  205  420:invokevirtual   #246 <Method int getScrollRange()>
	//  206  423:istore          5
					int j1 = getOverScrollMode();
	//  207  425:aload_0         
	//  208  426:invokevirtual   #212 <Method int getOverScrollMode()>
	//  209  429:istore_3        
					boolean flag;
					if(j1 != 0 && (j1 != 1 || i2 <= 0))
	//* 210  430:iload_3         
	//* 211  431:ifeq            452
	//* 212  434:iload_3         
	//* 213  435:iconst_1        
	//* 214  436:icmpne          447
	//* 215  439:iload           5
	//* 216  441:ifle            447
	//* 217  444:goto            452
						flag = false;
	//  218  447:iconst_0        
	//  219  448:istore_3        
					else
	//* 220  449:goto            454
						flag = true;
	//  221  452:iconst_1        
	//  222  453:istore_3        
					if(overScrollByCompat(0, k, 0, getScrollY(), 0, i2, 0, 0, true) && !hasNestedScrollingParent(0))
	//* 223  454:aload_0         
	//* 224  455:iconst_0        
	//* 225  456:iload_2         
	//* 226  457:iconst_0        
	//* 227  458:aload_0         
	//* 228  459:invokevirtual   #243 <Method int getScrollY()>
	//* 229  462:iconst_0        
	//* 230  463:iload           5
	//* 231  465:iconst_0        
	//* 232  466:iconst_0        
	//* 233  467:iconst_1        
	//* 234  468:invokevirtual   #500 <Method boolean overScrollByCompat(int, int, int, int, int, int, int, int, boolean)>
	//* 235  471:ifeq            489
	//* 236  474:aload_0         
	//* 237  475:iconst_0        
	//* 238  476:invokevirtual   #518 <Method boolean hasNestedScrollingParent(int)>
	//* 239  479:ifne            489
						mVelocityTracker.clear();
	//  240  482:aload_0         
	//  241  483:getfield        #310 <Field VelocityTracker mVelocityTracker>
	//  242  486:invokevirtual   #319 <Method void VelocityTracker.clear()>
					int k2 = getScrollY() - j2;
	//  243  489:aload_0         
	//  244  490:invokevirtual   #243 <Method int getScrollY()>
	//  245  493:iload           6
	//  246  495:isub            
	//  247  496:istore          7
					if(dispatchNestedScroll(0, k2, 0, k - k2, mScrollOffset, 0))
	//* 248  498:aload_0         
	//* 249  499:iconst_0        
	//* 250  500:iload           7
	//* 251  502:iconst_0        
	//* 252  503:iload_2         
	//* 253  504:iload           7
	//* 254  506:isub            
	//* 255  507:aload_0         
	//* 256  508:getfield        #115 <Field int[] mScrollOffset>
	//* 257  511:iconst_0        
	//* 258  512:invokevirtual   #504 <Method boolean dispatchNestedScroll(int, int, int, int, int[], int)>
	//* 259  515:ifeq            564
					{
						mLastMotionY = mLastMotionY - mScrollOffset[1];
	//  260  518:aload_0         
	//  261  519:aload_0         
	//  262  520:getfield        #402 <Field int mLastMotionY>
	//  263  523:aload_0         
	//  264  524:getfield        #115 <Field int[] mScrollOffset>
	//  265  527:iconst_1        
	//  266  528:iaload          
	//  267  529:isub            
	//  268  530:putfield        #402 <Field int mLastMotionY>
						motionevent1.offsetLocation(0.0F, mScrollOffset[1]);
	//  269  533:aload           9
	//  270  535:fconst_0        
	//  271  536:aload_0         
	//  272  537:getfield        #115 <Field int[] mScrollOffset>
	//  273  540:iconst_1        
	//  274  541:iaload          
	//  275  542:i2f             
	//  276  543:invokevirtual   #873 <Method void MotionEvent.offsetLocation(float, float)>
						mNestedYOffset = mNestedYOffset + mScrollOffset[1];
	//  277  546:aload_0         
	//  278  547:aload_0         
	//  279  548:getfield        #752 <Field int mNestedYOffset>
	//  280  551:aload_0         
	//  281  552:getfield        #115 <Field int[] mScrollOffset>
	//  282  555:iconst_1        
	//  283  556:iaload          
	//  284  557:iadd            
	//  285  558:putfield        #752 <Field int mNestedYOffset>
					} else
	//* 286  561:goto            894
					if(flag)
	//* 287  564:iload_3         
	//* 288  565:ifeq            894
					{
						ensureGlows();
	//  289  568:aload_0         
	//  290  569:invokespecial   #506 <Method void ensureGlows()>
						int k1 = j2 + k;
	//  291  572:iload           6
	//  292  574:iload_2         
	//  293  575:iadd            
	//  294  576:istore_3        
						if(k1 < 0)
	//* 295  577:iload_3         
	//* 296  578:ifge            628
						{
							EdgeEffectCompat.onPull(mEdgeGlowTop, (float)k / (float)getHeight(), motionevent.getX(l1) / (float)getWidth());
	//  297  581:aload_0         
	//  298  582:getfield        #201 <Field EdgeEffect mEdgeGlowTop>
	//  299  585:iload_2         
	//  300  586:i2f             
	//  301  587:aload_0         
	//  302  588:invokevirtual   #175 <Method int getHeight()>
	//  303  591:i2f             
	//  304  592:fdiv            
	//  305  593:aload_1         
	//  306  594:iload           4
	//  307  596:invokevirtual   #879 <Method float MotionEvent.getX(int)>
	//  308  599:aload_0         
	//  309  600:invokevirtual   #572 <Method int getWidth()>
	//  310  603:i2f             
	//  311  604:fdiv            
	//  312  605:invokestatic    #885 <Method void EdgeEffectCompat.onPull(EdgeEffect, float, float)>
							if(!mEdgeGlowBottom.isFinished())
	//* 313  608:aload_0         
	//* 314  609:getfield        #208 <Field EdgeEffect mEdgeGlowBottom>
	//* 315  612:invokevirtual   #564 <Method boolean EdgeEffect.isFinished()>
	//* 316  615:ifne            680
								mEdgeGlowBottom.onRelease();
	//  317  618:aload_0         
	//  318  619:getfield        #208 <Field EdgeEffect mEdgeGlowBottom>
	//  319  622:invokevirtual   #206 <Method void EdgeEffect.onRelease()>
						} else
	//* 320  625:goto            680
						if(k1 > i2)
	//* 321  628:iload_3         
	//* 322  629:iload           5
	//* 323  631:icmple          680
						{
							EdgeEffectCompat.onPull(mEdgeGlowBottom, (float)k / (float)getHeight(), 1.0F - motionevent.getX(l1) / (float)getWidth());
	//  324  634:aload_0         
	//  325  635:getfield        #208 <Field EdgeEffect mEdgeGlowBottom>
	//  326  638:iload_2         
	//  327  639:i2f             
	//  328  640:aload_0         
	//  329  641:invokevirtual   #175 <Method int getHeight()>
	//  330  644:i2f             
	//  331  645:fdiv            
	//  332  646:fconst_1        
	//  333  647:aload_1         
	//  334  648:iload           4
	//  335  650:invokevirtual   #879 <Method float MotionEvent.getX(int)>
	//  336  653:aload_0         
	//  337  654:invokevirtual   #572 <Method int getWidth()>
	//  338  657:i2f             
	//  339  658:fdiv            
	//  340  659:fsub            
	//  341  660:invokestatic    #885 <Method void EdgeEffectCompat.onPull(EdgeEffect, float, float)>
							if(!mEdgeGlowTop.isFinished())
	//* 342  663:aload_0         
	//* 343  664:getfield        #201 <Field EdgeEffect mEdgeGlowTop>
	//* 344  667:invokevirtual   #564 <Method boolean EdgeEffect.isFinished()>
	//* 345  670:ifne            680
								mEdgeGlowTop.onRelease();
	//  346  673:aload_0         
	//  347  674:getfield        #201 <Field EdgeEffect mEdgeGlowTop>
	//  348  677:invokevirtual   #206 <Method void EdgeEffect.onRelease()>
						}
						if(mEdgeGlowTop != null && (!mEdgeGlowTop.isFinished() || !mEdgeGlowBottom.isFinished()))
	//* 349  680:aload_0         
	//* 350  681:getfield        #201 <Field EdgeEffect mEdgeGlowTop>
	//* 351  684:ifnull          894
	//* 352  687:aload_0         
	//* 353  688:getfield        #201 <Field EdgeEffect mEdgeGlowTop>
	//* 354  691:invokevirtual   #564 <Method boolean EdgeEffect.isFinished()>
	//* 355  694:ifeq            707
	//* 356  697:aload_0         
	//* 357  698:getfield        #208 <Field EdgeEffect mEdgeGlowBottom>
	//* 358  701:invokevirtual   #564 <Method boolean EdgeEffect.isFinished()>
	//* 359  704:ifne            894
							ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//  360  707:aload_0         
	//  361  708:invokestatic    #515 <Method void ViewCompat.postInvalidateOnAnimation(View)>
					}
				}
			}
			break;

	//* 362  711:goto            894
		case 1: // '\001'
			motionevent = ((MotionEvent) (mVelocityTracker));
	//  363  714:aload_0         
	//  364  715:getfield        #310 <Field VelocityTracker mVelocityTracker>
	//  365  718:astore_1        
			((VelocityTracker) (motionevent)).computeCurrentVelocity(1000, mMaximumVelocity);
	//  366  719:aload_1         
	//  367  720:sipush          1000
	//  368  723:aload_0         
	//  369  724:getfield        #354 <Field int mMaximumVelocity>
	//  370  727:i2f             
	//  371  728:invokevirtual   #889 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
			int l = (int)((VelocityTracker) (motionevent)).getYVelocity(mActivePointerId);
	//  372  731:aload_1         
	//  373  732:aload_0         
	//  374  733:getfield        #113 <Field int mActivePointerId>
	//  375  736:invokevirtual   #892 <Method float VelocityTracker.getYVelocity(int)>
	//  376  739:f2i             
	//  377  740:istore_2        
			if(Math.abs(l) > mMinimumVelocity)
	//* 378  741:iload_2         
	//* 379  742:invokestatic    #744 <Method int Math.abs(int)>
	//* 380  745:aload_0         
	//* 381  746:getfield        #349 <Field int mMinimumVelocity>
	//* 382  749:icmple          761
				flingWithNestedDispatch(-l);
	//  383  752:aload_0         
	//  384  753:iload_2         
	//  385  754:ineg            
	//  386  755:invokespecial   #804 <Method void flingWithNestedDispatch(int)>
			else
	//* 387  758:goto            790
			if(mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()))
	//* 388  761:aload_0         
	//* 389  762:getfield        #324 <Field OverScroller mScroller>
	//* 390  765:aload_0         
	//* 391  766:invokevirtual   #496 <Method int getScrollX()>
	//* 392  769:aload_0         
	//* 393  770:invokevirtual   #243 <Method int getScrollY()>
	//* 394  773:iconst_0        
	//* 395  774:iconst_0        
	//* 396  775:iconst_0        
	//* 397  776:aload_0         
	//* 398  777:invokevirtual   #246 <Method int getScrollRange()>
	//* 399  780:invokevirtual   #762 <Method boolean OverScroller.springBack(int, int, int, int, int, int)>
	//* 400  783:ifeq            790
				ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//  401  786:aload_0         
	//  402  787:invokestatic    #515 <Method void ViewCompat.postInvalidateOnAnimation(View)>
			mActivePointerId = -1;
	//  403  790:aload_0         
	//  404  791:iconst_m1       
	//  405  792:putfield        #113 <Field int mActivePointerId>
			endDrag();
	//  406  795:aload_0         
	//  407  796:invokespecial   #875 <Method void endDrag()>
			break;

	//* 408  799:goto            894
		case 0: // '\0'
			if(getChildCount() == 0)
	//* 409  802:aload_0         
	//* 410  803:invokevirtual   #301 <Method int getChildCount()>
	//* 411  806:ifne            811
				return false;
	//  412  809:iconst_0        
	//  413  810:ireturn         
			boolean flag1 = mScroller.isFinished() ^ true;
	//  414  811:aload_0         
	//  415  812:getfield        #324 <Field OverScroller mScroller>
	//  416  815:invokevirtual   #772 <Method boolean OverScroller.isFinished()>
	//  417  818:iconst_1        
	//  418  819:ixor            
	//  419  820:istore          8
			mIsBeingDragged = flag1;
	//  420  822:aload_0         
	//  421  823:iload           8
	//  422  825:putfield        #109 <Field boolean mIsBeingDragged>
			if(flag1)
	//* 423  828:iload           8
	//* 424  830:ifeq            852
			{
				ViewParent viewparent1 = getParent();
	//  425  833:aload_0         
	//  426  834:invokevirtual   #753 <Method ViewParent getParent()>
	//  427  837:astore          10
				if(viewparent1 != null)
	//* 428  839:aload           10
	//* 429  841:ifnull          852
					viewparent1.requestDisallowInterceptTouchEvent(true);
	//  430  844:aload           10
	//  431  846:iconst_1        
	//  432  847:invokeinterface #758 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
			}
			if(!mScroller.isFinished())
	//* 433  852:aload_0         
	//* 434  853:getfield        #324 <Field OverScroller mScroller>
	//* 435  856:invokevirtual   #772 <Method boolean OverScroller.isFinished()>
	//* 436  859:ifne            869
				mScroller.abortAnimation();
	//  437  862:aload_0         
	//  438  863:getfield        #324 <Field OverScroller mScroller>
	//  439  866:invokevirtual   #895 <Method void OverScroller.abortAnimation()>
			mLastMotionY = (int)motionevent.getY();
	//  440  869:aload_0         
	//  441  870:aload_1         
	//  442  871:invokevirtual   #764 <Method float MotionEvent.getY()>
	//  443  874:f2i             
	//  444  875:putfield        #402 <Field int mLastMotionY>
			mActivePointerId = motionevent.getPointerId(0);
	//  445  878:aload_0         
	//  446  879:aload_1         
	//  447  880:iconst_0        
	//  448  881:invokevirtual   #396 <Method int MotionEvent.getPointerId(int)>
	//  449  884:putfield        #113 <Field int mActivePointerId>
			startNestedScroll(2, 0);
	//  450  887:aload_0         
	//  451  888:iconst_2        
	//  452  889:iconst_0        
	//  453  890:invokevirtual   #635 <Method boolean startNestedScroll(int, int)>
	//  454  893:pop             
			break;
		}
		if(mVelocityTracker != null)
	//* 455  894:aload_0         
	//* 456  895:getfield        #310 <Field VelocityTracker mVelocityTracker>
	//* 457  898:ifnull          910
			mVelocityTracker.addMovement(motionevent1);
	//  458  901:aload_0         
	//  459  902:getfield        #310 <Field VelocityTracker mVelocityTracker>
	//  460  905:aload           9
	//  461  907:invokevirtual   #750 <Method void VelocityTracker.addMovement(MotionEvent)>
		motionevent1.recycle();
	//  462  910:aload           9
	//  463  912:invokevirtual   #896 <Method void MotionEvent.recycle()>
		return true;
	//  464  915:iconst_1        
	//  465  916:ireturn         
	}

	boolean overScrollByCompat(int i, int j, int k, int l, int i1, int j1, int k1, 
			int l1, boolean flag)
	{
		boolean flag4;
		int k2 = getOverScrollMode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #212 <Method int getOverScrollMode()>
	//    2    4:istore          12
		int i2 = computeHorizontalScrollRange();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #897 <Method int computeHorizontalScrollRange()>
	//    5   10:istore          10
		int j2 = computeHorizontalScrollExtent();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #898 <Method int computeHorizontalScrollExtent()>
	//    8   16:istore          11
		flag4 = false;
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
	//*  20   38:invokevirtual   #900 <Method int computeVerticalScrollRange()>
	//*  21   41:aload_0         
	//*  22   42:invokevirtual   #901 <Method int computeVerticalScrollExtent()>
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
		if(l <= j) goto _L2; else goto _L1
	//  109  198:iload           4
	//  110  200:iload_2         
	//  111  201:icmple          210
_L1:
		boolean flag3;
		flag3 = true;
	//  112  204:iconst_1        
	//  113  205:istore          13
		break MISSING_BLOCK_LABEL_229;
	//  114  207:goto            229
_L2:
		if(l >= i1)
			break; /* Loop/switch isn't completed */
	//  115  210:iload           4
	//  116  212:iload           5
	//  117  214:icmpge          223
		j = i1;
	//  118  217:iload           5
	//  119  219:istore_2        
		if(true) goto _L1; else goto _L3
	//  120  220:goto            204
_L3:
		j = l;
	//  121  223:iload           4
	//  122  225:istore_2        
		flag3 = false;
	//  123  226:iconst_0        
	//  124  227:istore          13
label0:
		{
			if(flag3 && !hasNestedScrollingParent(1))
	//* 125  229:iload           13
	//* 126  231:ifeq            259
	//* 127  234:aload_0         
	//* 128  235:iconst_1        
	//* 129  236:invokevirtual   #518 <Method boolean hasNestedScrollingParent(int)>
	//* 130  239:ifne            259
				mScroller.springBack(i, j, 0, 0, 0, getScrollRange());
	//  131  242:aload_0         
	//  132  243:getfield        #324 <Field OverScroller mScroller>
	//  133  246:iload_1         
	//  134  247:iload_2         
	//  135  248:iconst_0        
	//  136  249:iconst_0        
	//  137  250:iconst_0        
	//  138  251:aload_0         
	//  139  252:invokevirtual   #246 <Method int getScrollRange()>
	//  140  255:invokevirtual   #762 <Method boolean OverScroller.springBack(int, int, int, int, int, int)>
	//  141  258:pop             
			onOverScrolled(i, j, flag, flag3);
	//  142  259:aload_0         
	//  143  260:iload_1         
	//  144  261:iload_2         
	//  145  262:iload           9
	//  146  264:iload           13
	//  147  266:invokevirtual   #903 <Method void onOverScrolled(int, int, boolean, boolean)>
			if(!flag)
	//* 148  269:iload           9
	//* 149  271:ifne            283
			{
				flag = flag4;
	//  150  274:iload           14
	//  151  276:istore          9
				if(!flag3)
					break label0;
	//  152  278:iload           13
	//  153  280:ifeq            286
			}
			flag = true;
	//  154  283:iconst_1        
	//  155  284:istore          9
		}
		return flag;
	//  156  286:iload           9
	//  157  288:ireturn         
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
	//    9   15:invokevirtual   #175 <Method int getHeight()>
	//   10   18:istore_3        
		if(flag)
	//*  11   19:iload_2         
	//*  12   20:ifeq            88
		{
			mTempRect.top = getScrollY() + k;
	//   13   23:aload_0         
	//   14   24:getfield        #101 <Field Rect mTempRect>
	//   15   27:aload_0         
	//   16   28:invokevirtual   #243 <Method int getScrollY()>
	//   17   31:iload_3         
	//   18   32:iadd            
	//   19   33:putfield        #385 <Field int Rect.top>
			int j = getChildCount();
	//   20   36:aload_0         
	//   21   37:invokevirtual   #301 <Method int getChildCount()>
	//   22   40:istore_2        
			if(j > 0)
	//*  23   41:iload_2         
	//*  24   42:ifle            119
			{
				View view = getChildAt(j - 1);
	//   25   45:aload_0         
	//   26   46:iload_2         
	//   27   47:iconst_1        
	//   28   48:isub            
	//   29   49:invokevirtual   #168 <Method View getChildAt(int)>
	//   30   52:astore          4
				if(mTempRect.top + k > view.getBottom())
	//*  31   54:aload_0         
	//*  32   55:getfield        #101 <Field Rect mTempRect>
	//*  33   58:getfield        #385 <Field int Rect.top>
	//*  34   61:iload_3         
	//*  35   62:iadd            
	//*  36   63:aload           4
	//*  37   65:invokevirtual   #239 <Method int View.getBottom()>
	//*  38   68:icmple          119
					mTempRect.top = view.getBottom() - k;
	//   39   71:aload_0         
	//   40   72:getfield        #101 <Field Rect mTempRect>
	//   41   75:aload           4
	//   42   77:invokevirtual   #239 <Method int View.getBottom()>
	//   43   80:iload_3         
	//   44   81:isub            
	//   45   82:putfield        #385 <Field int Rect.top>
			}
		} else
	//*  46   85:goto            119
		{
			mTempRect.top = getScrollY() - k;
	//   47   88:aload_0         
	//   48   89:getfield        #101 <Field Rect mTempRect>
	//   49   92:aload_0         
	//   50   93:invokevirtual   #243 <Method int getScrollY()>
	//   51   96:iload_3         
	//   52   97:isub            
	//   53   98:putfield        #385 <Field int Rect.top>
			if(mTempRect.top < 0)
	//*  54  101:aload_0         
	//*  55  102:getfield        #101 <Field Rect mTempRect>
	//*  56  105:getfield        #385 <Field int Rect.top>
	//*  57  108:ifge            119
				mTempRect.top = 0;
	//   58  111:aload_0         
	//   59  112:getfield        #101 <Field Rect mTempRect>
	//   60  115:iconst_0        
	//   61  116:putfield        #385 <Field int Rect.top>
		}
		mTempRect.bottom = mTempRect.top + k;
	//   62  119:aload_0         
	//   63  120:getfield        #101 <Field Rect mTempRect>
	//   64  123:aload_0         
	//   65  124:getfield        #101 <Field Rect mTempRect>
	//   66  127:getfield        #385 <Field int Rect.top>
	//   67  130:iload_3         
	//   68  131:iadd            
	//   69  132:putfield        #382 <Field int Rect.bottom>
		return scrollAndFocus(i, mTempRect.top, mTempRect.bottom);
	//   70  135:aload_0         
	//   71  136:iload_1         
	//   72  137:aload_0         
	//   73  138:getfield        #101 <Field Rect mTempRect>
	//   74  141:getfield        #385 <Field int Rect.top>
	//   75  144:aload_0         
	//   76  145:getfield        #101 <Field Rect mTempRect>
	//   77  148:getfield        #382 <Field int Rect.bottom>
	//   78  151:invokespecial   #642 <Method boolean scrollAndFocus(int, int, int)>
	//   79  154:ireturn         
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
	//    5    9:invokespecial   #780 <Method void scrollToChild(View)>
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
	//   13   23:invokespecial   #907 <Method void FrameLayout.requestChildFocus(View, View)>
	//   14   26:return          
	}

	public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean flag)
	{
		rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #304 <Method int View.getLeft()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #910 <Method int View.getScrollX()>
	//    5    9:isub            
	//    6   10:aload_1         
	//    7   11:invokevirtual   #236 <Method int View.getTop()>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #911 <Method int View.getScrollY()>
	//   10   18:isub            
	//   11   19:invokevirtual   #914 <Method void Rect.offset(int, int)>
		return scrollToChildRect(rect, flag);
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:iload_3         
	//   15   25:invokespecial   #916 <Method boolean scrollToChildRect(Rect, boolean)>
	//   16   28:ireturn         
	}

	public void requestDisallowInterceptTouchEvent(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            8
			recycleVelocityTracker();
	//    2    4:aload_0         
	//    3    5:invokespecial   #196 <Method void recycleVelocityTracker()>
		super.requestDisallowInterceptTouchEvent(flag);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokespecial   #917 <Method void FrameLayout.requestDisallowInterceptTouchEvent(boolean)>
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
	//    4    6:invokespecial   #918 <Method void FrameLayout.requestLayout()>
	//    5    9:return          
	}

	public void scrollTo(int i, int j)
	{
		if(getChildCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #301 <Method int getChildCount()>
	//*   2    4:ifle            81
		{
			View view = getChildAt(0);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #168 <Method View getChildAt(int)>
	//    6   12:astore_3        
			i = clamp(i, getWidth() - getPaddingRight() - getPaddingLeft(), view.getWidth());
	//    7   13:iload_1         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #572 <Method int getWidth()>
	//   10   18:aload_0         
	//   11   19:invokevirtual   #586 <Method int getPaddingRight()>
	//   12   22:isub            
	//   13   23:aload_0         
	//   14   24:invokevirtual   #583 <Method int getPaddingLeft()>
	//   15   27:isub            
	//   16   28:aload_3         
	//   17   29:invokevirtual   #919 <Method int View.getWidth()>
	//   18   32:invokestatic    #921 <Method int clamp(int, int, int)>
	//   19   35:istore_1        
			j = clamp(j, getHeight() - getPaddingBottom() - getPaddingTop(), view.getHeight());
	//   20   36:iload_2         
	//   21   37:aload_0         
	//   22   38:invokevirtual   #175 <Method int getHeight()>
	//   23   41:aload_0         
	//   24   42:invokevirtual   #181 <Method int getPaddingBottom()>
	//   25   45:isub            
	//   26   46:aload_0         
	//   27   47:invokevirtual   #178 <Method int getPaddingTop()>
	//   28   50:isub            
	//   29   51:aload_3         
	//   30   52:invokevirtual   #174 <Method int View.getHeight()>
	//   31   55:invokestatic    #921 <Method int clamp(int, int, int)>
	//   32   58:istore_2        
			if(i != getScrollX() || j != getScrollY())
	//*  33   59:iload_1         
	//*  34   60:aload_0         
	//*  35   61:invokevirtual   #496 <Method int getScrollX()>
	//*  36   64:icmpne          75
	//*  37   67:iload_2         
	//*  38   68:aload_0         
	//*  39   69:invokevirtual   #243 <Method int getScrollY()>
	//*  40   72:icmpeq          81
				super.scrollTo(i, j);
	//   41   75:aload_0         
	//   42   76:iload_1         
	//   43   77:iload_2         
	//   44   78:invokespecial   #713 <Method void FrameLayout.scrollTo(int, int)>
		}
	//   45   81:return          
	}

	public void setFillViewport(boolean flag)
	{
		if(flag != mFillViewport)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #653 <Field boolean mFillViewport>
	//*   3    5:icmpeq          17
		{
			mFillViewport = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #653 <Field boolean mFillViewport>
			requestLayout();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #838 <Method void requestLayout()>
		}
	//    9   17:return          
	}

	public void setNestedScrollingEnabled(boolean flag)
	{
		mChildHelper.setNestedScrollingEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #922 <Method void NestedScrollingChildHelper.setNestedScrollingEnabled(boolean)>
	//    4    8:return          
	}

	public void setOnScrollChangeListener(OnScrollChangeListener onscrollchangelistener)
	{
		mOnScrollChangeListener = onscrollchangelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #849 <Field NestedScrollView$OnScrollChangeListener mOnScrollChangeListener>
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
	//*   1    1:invokevirtual   #301 <Method int getChildCount()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(AnimationUtils.currentAnimationTimeMillis() - mLastScroll > 250L)
	//*   4    8:invokestatic    #932 <Method long AnimationUtils.currentAnimationTimeMillis()>
	//*   5   11:aload_0         
	//*   6   12:getfield        #934 <Field long mLastScroll>
	//*   7   15:lsub            
	//*   8   16:ldc2w           #935 <Long 250L>
	//*   9   19:lcmp            
	//*  10   20:ifle            99
		{
			i = getHeight();
	//   11   23:aload_0         
	//   12   24:invokevirtual   #175 <Method int getHeight()>
	//   13   27:istore_1        
			int k = getPaddingBottom();
	//   14   28:aload_0         
	//   15   29:invokevirtual   #181 <Method int getPaddingBottom()>
	//   16   32:istore_3        
			int l = getPaddingTop();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #178 <Method int getPaddingTop()>
	//   19   37:istore          4
			k = Math.max(0, getChildAt(0).getHeight() - (i - k - l));
	//   20   39:iconst_0        
	//   21   40:aload_0         
	//   22   41:iconst_0        
	//   23   42:invokevirtual   #168 <Method View getChildAt(int)>
	//   24   45:invokevirtual   #174 <Method int View.getHeight()>
	//   25   48:iload_1         
	//   26   49:iload_3         
	//   27   50:isub            
	//   28   51:iload           4
	//   29   53:isub            
	//   30   54:isub            
	//   31   55:invokestatic    #533 <Method int Math.max(int, int)>
	//   32   58:istore_3        
			i = getScrollY();
	//   33   59:aload_0         
	//   34   60:invokevirtual   #243 <Method int getScrollY()>
	//   35   63:istore_1        
			j = Math.max(0, Math.min(j + i, k));
	//   36   64:iconst_0        
	//   37   65:iload_2         
	//   38   66:iload_1         
	//   39   67:iadd            
	//   40   68:iload_3         
	//   41   69:invokestatic    #530 <Method int Math.min(int, int)>
	//   42   72:invokestatic    #533 <Method int Math.max(int, int)>
	//   43   75:istore_2        
			mScroller.startScroll(getScrollX(), i, 0, j - i);
	//   44   76:aload_0         
	//   45   77:getfield        #324 <Field OverScroller mScroller>
	//   46   80:aload_0         
	//   47   81:invokevirtual   #496 <Method int getScrollX()>
	//   48   84:iload_1         
	//   49   85:iconst_0        
	//   50   86:iload_2         
	//   51   87:iload_1         
	//   52   88:isub            
	//   53   89:invokevirtual   #939 <Method void OverScroller.startScroll(int, int, int, int)>
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   54   92:aload_0         
	//   55   93:invokestatic    #515 <Method void ViewCompat.postInvalidateOnAnimation(View)>
		} else
	//*  56   96:goto            122
		{
			if(!mScroller.isFinished())
	//*  57   99:aload_0         
	//*  58  100:getfield        #324 <Field OverScroller mScroller>
	//*  59  103:invokevirtual   #772 <Method boolean OverScroller.isFinished()>
	//*  60  106:ifne            116
				mScroller.abortAnimation();
	//   61  109:aload_0         
	//   62  110:getfield        #324 <Field OverScroller mScroller>
	//   63  113:invokevirtual   #895 <Method void OverScroller.abortAnimation()>
			scrollBy(i, j);
	//   64  116:aload_0         
	//   65  117:iload_1         
	//   66  118:iload_2         
	//   67  119:invokevirtual   #192 <Method void scrollBy(int, int)>
		}
		mLastScroll = AnimationUtils.currentAnimationTimeMillis();
	//   68  122:aload_0         
	//   69  123:invokestatic    #932 <Method long AnimationUtils.currentAnimationTimeMillis()>
	//   70  126:putfield        #934 <Field long mLastScroll>
	//   71  129:return          
	}

	public final void smoothScrollTo(int i, int j)
	{
		smoothScrollBy(i - getScrollX(), j - getScrollY());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #496 <Method int getScrollX()>
	//    4    6:isub            
	//    5    7:iload_2         
	//    6    8:aload_0         
	//    7    9:invokevirtual   #243 <Method int getScrollY()>
	//    8   12:isub            
	//    9   13:invokevirtual   #189 <Method void smoothScrollBy(int, int)>
	//   10   16:return          
	}

	public boolean startNestedScroll(int i)
	{
		return mChildHelper.startNestedScroll(i);
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #941 <Method boolean NestedScrollingChildHelper.startNestedScroll(int)>
	//    4    8:ireturn         
	}

	public boolean startNestedScroll(int i, int j)
	{
		return mChildHelper.startNestedScroll(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #942 <Method boolean NestedScrollingChildHelper.startNestedScroll(int, int)>
	//    5    9:ireturn         
	}

	public void stopNestedScroll()
	{
		mChildHelper.stopNestedScroll();
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:invokevirtual   #943 <Method void NestedScrollingChildHelper.stopNestedScroll()>
	//    3    7:return          
	}

	public void stopNestedScroll(int i)
	{
		mChildHelper.stopNestedScroll(i);
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #944 <Method void NestedScrollingChildHelper.stopNestedScroll(int)>
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
