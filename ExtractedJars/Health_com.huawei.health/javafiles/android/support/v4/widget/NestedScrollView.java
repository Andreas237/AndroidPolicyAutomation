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
import android.support.v4.view.accessibility.*;
import android.util.*;
import android.view.*;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.*;
import java.util.List;

// Referenced classes of package android.support.v4.widget:
//			EdgeEffectCompat

public class NestedScrollView extends FrameLayout
	implements NestedScrollingParent, NestedScrollingChild, ScrollingView
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
			accessibilityevent = ((AccessibilityEvent) (AccessibilityEventCompat.asRecord(accessibilityevent)));
		//   11   20:aload_2         
		//   12   21:invokestatic    #36  <Method AccessibilityRecordCompat AccessibilityEventCompat.asRecord(AccessibilityEvent)>
		//   13   24:astore_2        
			boolean flag;
			if(((NestedScrollView) (view)).getScrollRange() > 0)
		//*  14   25:aload_1         
		//*  15   26:invokevirtual   #40  <Method int NestedScrollView.getScrollRange()>
		//*  16   29:ifle            37
				flag = true;
		//   17   32:iconst_1        
		//   18   33:istore_3        
			else
		//*  19   34:goto            39
				flag = false;
		//   20   37:iconst_0        
		//   21   38:istore_3        
			((AccessibilityRecordCompat) (accessibilityevent)).setScrollable(flag);
		//   22   39:aload_2         
		//   23   40:iload_3         
		//   24   41:invokevirtual   #46  <Method void AccessibilityRecordCompat.setScrollable(boolean)>
			((AccessibilityRecordCompat) (accessibilityevent)).setScrollX(((NestedScrollView) (view)).getScrollX());
		//   25   44:aload_2         
		//   26   45:aload_1         
		//   27   46:invokevirtual   #49  <Method int NestedScrollView.getScrollX()>
		//   28   49:invokevirtual   #53  <Method void AccessibilityRecordCompat.setScrollX(int)>
			((AccessibilityRecordCompat) (accessibilityevent)).setScrollY(((NestedScrollView) (view)).getScrollY());
		//   29   52:aload_2         
		//   30   53:aload_1         
		//   31   54:invokevirtual   #56  <Method int NestedScrollView.getScrollY()>
		//   32   57:invokevirtual   #59  <Method void AccessibilityRecordCompat.setScrollY(int)>
			((AccessibilityRecordCompat) (accessibilityevent)).setMaxScrollX(((NestedScrollView) (view)).getScrollX());
		//   33   60:aload_2         
		//   34   61:aload_1         
		//   35   62:invokevirtual   #49  <Method int NestedScrollView.getScrollX()>
		//   36   65:invokevirtual   #62  <Method void AccessibilityRecordCompat.setMaxScrollX(int)>
			((AccessibilityRecordCompat) (accessibilityevent)).setMaxScrollY(((NestedScrollView) (view)).getScrollRange());
		//   37   68:aload_2         
		//   38   69:aload_1         
		//   39   70:invokevirtual   #40  <Method int NestedScrollView.getScrollRange()>
		//   40   73:invokevirtual   #65  <Method void AccessibilityRecordCompat.setMaxScrollY(int)>
		//   41   76:return          
		}

		public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
		{
			super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #69  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
			view = ((View) ((NestedScrollView)view));
		//    4    6:aload_1         
		//    5    7:checkcast       #6   <Class NestedScrollView>
		//    6   10:astore_1        
			accessibilitynodeinfocompat.setClassName(((CharSequence) (((Class) (android/widget/ScrollView)).getName())));
		//    7   11:aload_2         
		//    8   12:ldc1            #18  <Class ScrollView>
		//    9   14:invokevirtual   #24  <Method String Class.getName()>
		//   10   17:invokevirtual   #72  <Method void AccessibilityNodeInfoCompat.setClassName(CharSequence)>
			if(((NestedScrollView) (view)).isEnabled())
		//*  11   20:aload_1         
		//*  12   21:invokevirtual   #76  <Method boolean NestedScrollView.isEnabled()>
		//*  13   24:ifeq            70
			{
				int i = ((NestedScrollView) (view)).getScrollRange();
		//   14   27:aload_1         
		//   15   28:invokevirtual   #40  <Method int NestedScrollView.getScrollRange()>
		//   16   31:istore_3        
				if(i > 0)
		//*  17   32:iload_3         
		//*  18   33:ifle            70
				{
					accessibilitynodeinfocompat.setScrollable(true);
		//   19   36:aload_2         
		//   20   37:iconst_1        
		//   21   38:invokevirtual   #77  <Method void AccessibilityNodeInfoCompat.setScrollable(boolean)>
					if(((NestedScrollView) (view)).getScrollY() > 0)
		//*  22   41:aload_1         
		//*  23   42:invokevirtual   #56  <Method int NestedScrollView.getScrollY()>
		//*  24   45:ifle            55
						accessibilitynodeinfocompat.addAction(8192);
		//   25   48:aload_2         
		//   26   49:sipush          8192
		//   27   52:invokevirtual   #80  <Method void AccessibilityNodeInfoCompat.addAction(int)>
					if(((NestedScrollView) (view)).getScrollY() < i)
		//*  28   55:aload_1         
		//*  29   56:invokevirtual   #56  <Method int NestedScrollView.getScrollY()>
		//*  30   59:iload_3         
		//*  31   60:icmpge          70
						accessibilitynodeinfocompat.addAction(4096);
		//   32   63:aload_2         
		//   33   64:sipush          4096
		//   34   67:invokevirtual   #80  <Method void AccessibilityNodeInfoCompat.addAction(int)>
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
		//*   4    4:invokespecial   #84  <Method boolean AccessibilityDelegateCompat.performAccessibilityAction(View, int, Bundle)>
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
		//*  12   18:invokevirtual   #76  <Method boolean NestedScrollView.isEnabled()>
		//*  13   21:ifne            26
				return false;
		//   14   24:iconst_0        
		//   15   25:ireturn         
			switch(i)
		//*  16   26:iload_2         
			{
		//*  17   27:lookupswitch    2: default 52
		//		               4096: 55
		//		               8192: 110
		//*  18   52:goto            162
			case 4096: 
				i = ((NestedScrollView) (view)).getHeight();
		//   19   55:aload_1         
		//   20   56:invokevirtual   #87  <Method int NestedScrollView.getHeight()>
		//   21   59:istore_2        
				int j = ((NestedScrollView) (view)).getPaddingBottom();
		//   22   60:aload_1         
		//   23   61:invokevirtual   #90  <Method int NestedScrollView.getPaddingBottom()>
		//   24   64:istore          4
				int l = ((NestedScrollView) (view)).getPaddingTop();
		//   25   66:aload_1         
		//   26   67:invokevirtual   #93  <Method int NestedScrollView.getPaddingTop()>
		//   27   70:istore          5
				i = Math.min(((NestedScrollView) (view)).getScrollY() + (i - j - l), ((NestedScrollView) (view)).getScrollRange());
		//   28   72:aload_1         
		//   29   73:invokevirtual   #56  <Method int NestedScrollView.getScrollY()>
		//   30   76:iload_2         
		//   31   77:iload           4
		//   32   79:isub            
		//   33   80:iload           5
		//   34   82:isub            
		//   35   83:iadd            
		//   36   84:aload_1         
		//   37   85:invokevirtual   #40  <Method int NestedScrollView.getScrollRange()>
		//   38   88:invokestatic    #99  <Method int Math.min(int, int)>
		//   39   91:istore_2        
				if(i != ((NestedScrollView) (view)).getScrollY())
		//*  40   92:iload_2         
		//*  41   93:aload_1         
		//*  42   94:invokevirtual   #56  <Method int NestedScrollView.getScrollY()>
		//*  43   97:icmpeq          108
				{
					((NestedScrollView) (view)).smoothScrollTo(0, i);
		//   44  100:aload_1         
		//   45  101:iconst_0        
		//   46  102:iload_2         
		//   47  103:invokevirtual   #103 <Method void NestedScrollView.smoothScrollTo(int, int)>
					return true;
		//   48  106:iconst_1        
		//   49  107:ireturn         
				} else
				{
					return false;
		//   50  108:iconst_0        
		//   51  109:ireturn         
				}

			case 8192: 
				i = ((NestedScrollView) (view)).getHeight();
		//   52  110:aload_1         
		//   53  111:invokevirtual   #87  <Method int NestedScrollView.getHeight()>
		//   54  114:istore_2        
				int k = ((NestedScrollView) (view)).getPaddingBottom();
		//   55  115:aload_1         
		//   56  116:invokevirtual   #90  <Method int NestedScrollView.getPaddingBottom()>
		//   57  119:istore          4
				int i1 = ((NestedScrollView) (view)).getPaddingTop();
		//   58  121:aload_1         
		//   59  122:invokevirtual   #93  <Method int NestedScrollView.getPaddingTop()>
		//   60  125:istore          5
				i = Math.max(((NestedScrollView) (view)).getScrollY() - (i - k - i1), 0);
		//   61  127:aload_1         
		//   62  128:invokevirtual   #56  <Method int NestedScrollView.getScrollY()>
		//   63  131:iload_2         
		//   64  132:iload           4
		//   65  134:isub            
		//   66  135:iload           5
		//   67  137:isub            
		//   68  138:isub            
		//   69  139:iconst_0        
		//   70  140:invokestatic    #106 <Method int Math.max(int, int)>
		//   71  143:istore_2        
				if(i != ((NestedScrollView) (view)).getScrollY())
		//*  72  144:iload_2         
		//*  73  145:aload_1         
		//*  74  146:invokevirtual   #56  <Method int NestedScrollView.getScrollY()>
		//*  75  149:icmpeq          160
				{
					((NestedScrollView) (view)).smoothScrollTo(0, i);
		//   76  152:aload_1         
		//   77  153:iconst_0        
		//   78  154:iload_2         
		//   79  155:invokevirtual   #103 <Method void NestedScrollView.smoothScrollTo(int, int)>
					return true;
		//   80  158:iconst_1        
		//   81  159:ireturn         
				} else
				{
					return false;
		//   82  160:iconst_0        
		//   83  161:ireturn         
				}
			}
			return false;
		//   84  162:iconst_0        
		//   85  163:ireturn         
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
	//    3    3:invokespecial   #88  <Method void NestedScrollView(Context, AttributeSet)>
	//    4    6:return          
	}

	public NestedScrollView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #91  <Method void NestedScrollView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public NestedScrollView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #92  <Method void FrameLayout(Context, AttributeSet, int)>
		mTempRect = new Rect();
	//    5    7:aload_0         
	//    6    8:new             #94  <Class Rect>
	//    7   11:dup             
	//    8   12:invokespecial   #95  <Method void Rect()>
	//    9   15:putfield        #97  <Field Rect mTempRect>
		mIsLayoutDirty = true;
	//   10   18:aload_0         
	//   11   19:iconst_1        
	//   12   20:putfield        #99  <Field boolean mIsLayoutDirty>
		mIsLaidOut = false;
	//   13   23:aload_0         
	//   14   24:iconst_0        
	//   15   25:putfield        #101 <Field boolean mIsLaidOut>
		mChildToScrollTo = null;
	//   16   28:aload_0         
	//   17   29:aconst_null     
	//   18   30:putfield        #103 <Field View mChildToScrollTo>
		mIsBeingDragged = false;
	//   19   33:aload_0         
	//   20   34:iconst_0        
	//   21   35:putfield        #105 <Field boolean mIsBeingDragged>
		mSmoothScrollingEnabled = true;
	//   22   38:aload_0         
	//   23   39:iconst_1        
	//   24   40:putfield        #107 <Field boolean mSmoothScrollingEnabled>
		mActivePointerId = -1;
	//   25   43:aload_0         
	//   26   44:iconst_m1       
	//   27   45:putfield        #109 <Field int mActivePointerId>
		mScrollOffset = new int[2];
	//   28   48:aload_0         
	//   29   49:iconst_2        
	//   30   50:newarray        int[]
	//   31   52:putfield        #111 <Field int[] mScrollOffset>
		mScrollConsumed = new int[2];
	//   32   55:aload_0         
	//   33   56:iconst_2        
	//   34   57:newarray        int[]
	//   35   59:putfield        #113 <Field int[] mScrollConsumed>
		initScrollView();
	//   36   62:aload_0         
	//   37   63:invokespecial   #116 <Method void initScrollView()>
		context = ((Context) (context.obtainStyledAttributes(attributeset, SCROLLVIEW_STYLEABLE, i, 0)));
	//   38   66:aload_1         
	//   39   67:aload_2         
	//   40   68:getstatic       #83  <Field int[] SCROLLVIEW_STYLEABLE>
	//   41   71:iload_3         
	//   42   72:iconst_0        
	//   43   73:invokevirtual   #122 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   44   76:astore_1        
		setFillViewport(((TypedArray) (context)).getBoolean(0, false));
	//   45   77:aload_0         
	//   46   78:aload_1         
	//   47   79:iconst_0        
	//   48   80:iconst_0        
	//   49   81:invokevirtual   #128 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   50   84:invokevirtual   #132 <Method void setFillViewport(boolean)>
		((TypedArray) (context)).recycle();
	//   51   87:aload_1         
	//   52   88:invokevirtual   #135 <Method void TypedArray.recycle()>
		mParentHelper = new NestedScrollingParentHelper(((ViewGroup) (this)));
	//   53   91:aload_0         
	//   54   92:new             #137 <Class NestedScrollingParentHelper>
	//   55   95:dup             
	//   56   96:aload_0         
	//   57   97:invokespecial   #140 <Method void NestedScrollingParentHelper(ViewGroup)>
	//   58  100:putfield        #142 <Field NestedScrollingParentHelper mParentHelper>
		mChildHelper = new NestedScrollingChildHelper(((View) (this)));
	//   59  103:aload_0         
	//   60  104:new             #144 <Class NestedScrollingChildHelper>
	//   61  107:dup             
	//   62  108:aload_0         
	//   63  109:invokespecial   #147 <Method void NestedScrollingChildHelper(View)>
	//   64  112:putfield        #149 <Field NestedScrollingChildHelper mChildHelper>
		setNestedScrollingEnabled(true);
	//   65  115:aload_0         
	//   66  116:iconst_1        
	//   67  117:invokevirtual   #152 <Method void setNestedScrollingEnabled(boolean)>
		ViewCompat.setAccessibilityDelegate(((View) (this)), ((AccessibilityDelegateCompat) (ACCESSIBILITY_DELEGATE)));
	//   68  120:aload_0         
	//   69  121:getstatic       #80  <Field NestedScrollView$AccessibilityDelegate ACCESSIBILITY_DELEGATE>
	//   70  124:invokestatic    #158 <Method void ViewCompat.setAccessibilityDelegate(View, AccessibilityDelegateCompat)>
	//   71  127:return          
	}

	private boolean canScroll()
	{
		View view = getChildAt(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #164 <Method View getChildAt(int)>
	//    3    5:astore_2        
		if(view != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          37
		{
			int i = view.getHeight();
	//    6   10:aload_2         
	//    7   11:invokevirtual   #170 <Method int View.getHeight()>
	//    8   14:istore_1        
			return getHeight() < getPaddingTop() + i + getPaddingBottom();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #171 <Method int getHeight()>
	//   11   19:aload_0         
	//   12   20:invokevirtual   #174 <Method int getPaddingTop()>
	//   13   23:iload_1         
	//   14   24:iadd            
	//   15   25:aload_0         
	//   16   26:invokevirtual   #177 <Method int getPaddingBottom()>
	//   17   29:iadd            
	//   18   30:icmpge          35
	//   19   33:iconst_1        
	//   20   34:ireturn         
	//   21   35:iconst_0        
	//   22   36:ireturn         
		} else
		{
			return false;
	//   23   37:iconst_0        
	//   24   38:ireturn         
		}
	}

	private static int clamp(int i, int j, int k)
	{
		if(j >= k || i < 0)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmpge          9
	//*   3    5:iload_0         
	//*   4    6:ifge            11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		if(j + i > k)
	//*   7   11:iload_1         
	//*   8   12:iload_0         
	//*   9   13:iadd            
	//*  10   14:iload_2         
	//*  11   15:icmple          22
			return k - j;
	//   12   18:iload_2         
	//   13   19:iload_1         
	//   14   20:isub            
	//   15   21:ireturn         
		else
			return i;
	//   16   22:iload_0         
	//   17   23:ireturn         
	}

	private void doScrollY(int i)
	{
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            24
		{
			if(mSmoothScrollingEnabled)
	//*   2    4:aload_0         
	//*   3    5:getfield        #107 <Field boolean mSmoothScrollingEnabled>
	//*   4    8:ifeq            18
			{
				smoothScrollBy(0, i);
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:iload_1         
	//    8   14:invokevirtual   #185 <Method void smoothScrollBy(int, int)>
				return;
	//    9   17:return          
			}
			scrollBy(0, i);
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:iload_1         
	//   13   21:invokevirtual   #188 <Method void scrollBy(int, int)>
		}
	//   14   24:return          
	}

	private void endDrag()
	{
		mIsBeingDragged = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #105 <Field boolean mIsBeingDragged>
		recycleVelocityTracker();
	//    3    5:aload_0         
	//    4    6:invokespecial   #192 <Method void recycleVelocityTracker()>
		stopNestedScroll();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #195 <Method void stopNestedScroll()>
		if(mEdgeGlowTop != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #197 <Field EdgeEffect mEdgeGlowTop>
	//*   9   17:ifnull          34
		{
			mEdgeGlowTop.onRelease();
	//   10   20:aload_0         
	//   11   21:getfield        #197 <Field EdgeEffect mEdgeGlowTop>
	//   12   24:invokevirtual   #202 <Method void EdgeEffect.onRelease()>
			mEdgeGlowBottom.onRelease();
	//   13   27:aload_0         
	//   14   28:getfield        #204 <Field EdgeEffect mEdgeGlowBottom>
	//   15   31:invokevirtual   #202 <Method void EdgeEffect.onRelease()>
		}
	//   16   34:return          
	}

	private void ensureGlows()
	{
		if(getOverScrollMode() != 2)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #208 <Method int getOverScrollMode()>
	//*   2    4:iconst_2        
	//*   3    5:icmpeq          45
		{
			if(mEdgeGlowTop == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #197 <Field EdgeEffect mEdgeGlowTop>
	//*   6   12:ifnonnull       55
			{
				Context context = getContext();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #212 <Method Context getContext()>
	//    9   19:astore_1        
				mEdgeGlowTop = new EdgeEffect(context);
	//   10   20:aload_0         
	//   11   21:new             #199 <Class EdgeEffect>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:invokespecial   #214 <Method void EdgeEffect(Context)>
	//   15   29:putfield        #197 <Field EdgeEffect mEdgeGlowTop>
				mEdgeGlowBottom = new EdgeEffect(context);
	//   16   32:aload_0         
	//   17   33:new             #199 <Class EdgeEffect>
	//   18   36:dup             
	//   19   37:aload_1         
	//   20   38:invokespecial   #214 <Method void EdgeEffect(Context)>
	//   21   41:putfield        #204 <Field EdgeEffect mEdgeGlowBottom>
				return;
	//   22   44:return          
			}
		} else
		{
			mEdgeGlowTop = null;
	//   23   45:aload_0         
	//   24   46:aconst_null     
	//   25   47:putfield        #197 <Field EdgeEffect mEdgeGlowTop>
			mEdgeGlowBottom = null;
	//   26   50:aload_0         
	//   27   51:aconst_null     
	//   28   52:putfield        #204 <Field EdgeEffect mEdgeGlowBottom>
		}
	//   29   55:return          
	}

	private View findFocusableViewInBounds(boolean flag, int i, int j)
	{
		java.util.ArrayList arraylist = getFocusables(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokevirtual   #220 <Method java.util.ArrayList getFocusables(int)>
	//    3    5:astore          14
		View view2 = null;
	//    4    7:aconst_null     
	//    5    8:astore          13
		boolean flag3 = false;
	//    6   10:iconst_0        
	//    7   11:istore          7
		int i1 = ((List) (arraylist)).size();
	//    8   13:aload           14
	//    9   15:invokeinterface #225 <Method int List.size()>
	//   10   20:istore          9
		for(int k = 0; k < i1;)
	//*  11   22:iconst_0        
	//*  12   23:istore          6
	//*  13   25:iload           6
	//*  14   27:iload           9
	//*  15   29:icmpge          257
		{
			View view1 = (View)((List) (arraylist)).get(k);
	//   16   32:aload           14
	//   17   34:iload           6
	//   18   36:invokeinterface #229 <Method Object List.get(int)>
	//   19   41:checkcast       #166 <Class View>
	//   20   44:astore          12
			int l = view1.getTop();
	//   21   46:aload           12
	//   22   48:invokevirtual   #232 <Method int View.getTop()>
	//   23   51:istore          8
			int j1 = view1.getBottom();
	//   24   53:aload           12
	//   25   55:invokevirtual   #235 <Method int View.getBottom()>
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
	//*  33   71:icmpge          240
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
	//*  40   85:icmpge          240
				{
					boolean flag1;
					if(i < l && j1 < j)
	//*  41   88:iload_2         
	//*  42   89:iload           8
	//*  43   91:icmpge          106
	//*  44   94:iload           10
	//*  45   96:iload_3         
	//*  46   97:icmpge          106
						flag1 = true;
	//   47  100:iconst_1        
	//   48  101:istore          4
					else
	//*  49  103:goto            109
						flag1 = false;
	//   50  106:iconst_0        
	//   51  107:istore          4
					if(view2 == null)
	//*  52  109:aload           13
	//*  53  111:ifnonnull       125
					{
						view = view1;
	//   54  114:aload           12
	//   55  116:astore          11
						flag2 = flag1;
	//   56  118:iload           4
	//   57  120:istore          5
					} else
	//*  58  122:goto            240
					{
						boolean flag4;
						if(flag && l < view2.getTop() || !flag && j1 > view2.getBottom())
	//*  59  125:iload_1         
	//*  60  126:ifeq            139
	//*  61  129:iload           8
	//*  62  131:aload           13
	//*  63  133:invokevirtual   #232 <Method int View.getTop()>
	//*  64  136:icmplt          153
	//*  65  139:iload_1         
	//*  66  140:ifne            159
	//*  67  143:iload           10
	//*  68  145:aload           13
	//*  69  147:invokevirtual   #235 <Method int View.getBottom()>
	//*  70  150:icmple          159
							flag4 = true;
	//   71  153:iconst_1        
	//   72  154:istore          8
						else
	//*  73  156:goto            162
							flag4 = false;
	//   74  159:iconst_0        
	//   75  160:istore          8
						if(flag3)
	//*  76  162:iload           7
	//*  77  164:ifeq            204
						{
							view = view2;
	//   78  167:aload           13
	//   79  169:astore          11
							flag2 = flag3;
	//   80  171:iload           7
	//   81  173:istore          5
							if(flag1)
	//*  82  175:iload           4
	//*  83  177:ifeq            240
							{
								view = view2;
	//   84  180:aload           13
	//   85  182:astore          11
								flag2 = flag3;
	//   86  184:iload           7
	//   87  186:istore          5
								if(flag4)
	//*  88  188:iload           8
	//*  89  190:ifeq            240
								{
									view = view1;
	//   90  193:aload           12
	//   91  195:astore          11
									flag2 = flag3;
	//   92  197:iload           7
	//   93  199:istore          5
								}
							}
						} else
	//*  94  201:goto            240
						if(flag1)
	//*  95  204:iload           4
	//*  96  206:ifeq            219
						{
							view = view1;
	//   97  209:aload           12
	//   98  211:astore          11
							flag2 = true;
	//   99  213:iconst_1        
	//  100  214:istore          5
						} else
	//* 101  216:goto            240
						{
							view = view2;
	//  102  219:aload           13
	//  103  221:astore          11
							flag2 = flag3;
	//  104  223:iload           7
	//  105  225:istore          5
							if(flag4)
	//* 106  227:iload           8
	//* 107  229:ifeq            240
							{
								view = view1;
	//  108  232:aload           12
	//  109  234:astore          11
								flag2 = flag3;
	//  110  236:iload           7
	//  111  238:istore          5
							}
						}
					}
				}
			}
			k++;
	//  112  240:iload           6
	//  113  242:iconst_1        
	//  114  243:iadd            
	//  115  244:istore          6
			view2 = view;
	//  116  246:aload           11
	//  117  248:astore          13
			flag3 = flag2;
	//  118  250:iload           5
	//  119  252:istore          7
		}

	//* 120  254:goto            25
		return view2;
	//  121  257:aload           13
	//  122  259:areturn         
	}

	private void flingWithNestedDispatch(int i)
	{
		int j = getScrollY();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #239 <Method int getScrollY()>
	//    2    4:istore_2        
		boolean flag;
		if((j > 0 || i > 0) && (j < getScrollRange() || i < 0))
	//*   3    5:iload_2         
	//*   4    6:ifgt            13
	//*   5    9:iload_1         
	//*   6   10:ifle            30
	//*   7   13:iload_2         
	//*   8   14:aload_0         
	//*   9   15:invokevirtual   #242 <Method int getScrollRange()>
	//*  10   18:icmplt          25
	//*  11   21:iload_1         
	//*  12   22:ifge            30
			flag = true;
	//   13   25:iconst_1        
	//   14   26:istore_3        
		else
	//*  15   27:goto            32
			flag = false;
	//   16   30:iconst_0        
	//   17   31:istore_3        
		if(!dispatchNestedPreFling(0.0F, i))
	//*  18   32:aload_0         
	//*  19   33:fconst_0        
	//*  20   34:iload_1         
	//*  21   35:i2f             
	//*  22   36:invokevirtual   #246 <Method boolean dispatchNestedPreFling(float, float)>
	//*  23   39:ifne            60
		{
			dispatchNestedFling(0.0F, i, flag);
	//   24   42:aload_0         
	//   25   43:fconst_0        
	//   26   44:iload_1         
	//   27   45:i2f             
	//   28   46:iload_3         
	//   29   47:invokevirtual   #250 <Method boolean dispatchNestedFling(float, float, boolean)>
	//   30   50:pop             
			if(flag)
	//*  31   51:iload_3         
	//*  32   52:ifeq            60
				fling(i);
	//   33   55:aload_0         
	//   34   56:iload_1         
	//   35   57:invokevirtual   #253 <Method void fling(int)>
		}
	//   36   60:return          
	}

	private float getVerticalScrollFactorCompat()
	{
		if(mVerticalScrollFactor == 0.0F)
	//*   0    0:aload_0         
	//*   1    1:getfield        #257 <Field float mVerticalScrollFactor>
	//*   2    4:fconst_0        
	//*   3    5:fcmpl           
	//*   4    6:ifne            63
		{
			TypedValue typedvalue = new TypedValue();
	//    5    9:new             #259 <Class TypedValue>
	//    6   12:dup             
	//    7   13:invokespecial   #260 <Method void TypedValue()>
	//    8   16:astore_1        
			Context context = getContext();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #212 <Method Context getContext()>
	//   11   21:astore_2        
			if(!context.getTheme().resolveAttribute(0x101004d, typedvalue, true))
	//*  12   22:aload_2         
	//*  13   23:invokevirtual   #264 <Method android.content.res.Resources$Theme Context.getTheme()>
	//*  14   26:ldc2            #265 <Int 0x101004d>
	//*  15   29:aload_1         
	//*  16   30:iconst_1        
	//*  17   31:invokevirtual   #271 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//*  18   34:ifne            48
				throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
	//   19   37:new             #273 <Class IllegalStateException>
	//   20   40:dup             
	//   21   41:ldc2            #275 <String "Expected theme to define listPreferredItemHeight.">
	//   22   44:invokespecial   #278 <Method void IllegalStateException(String)>
	//   23   47:athrow          
			mVerticalScrollFactor = typedvalue.getDimension(context.getResources().getDisplayMetrics());
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:aload_2         
	//   27   51:invokevirtual   #282 <Method Resources Context.getResources()>
	//   28   54:invokevirtual   #288 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   29   57:invokevirtual   #292 <Method float TypedValue.getDimension(android.util.DisplayMetrics)>
	//   30   60:putfield        #257 <Field float mVerticalScrollFactor>
		}
		return mVerticalScrollFactor;
	//   31   63:aload_0         
	//   32   64:getfield        #257 <Field float mVerticalScrollFactor>
	//   33   67:freturn         
	}

	private boolean inChild(int i, int j)
	{
		if(getChildCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #297 <Method int getChildCount()>
	//*   2    4:ifle            63
		{
			int k = getScrollY();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #239 <Method int getScrollY()>
	//    5   11:istore_3        
			View view = getChildAt(0);
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:invokevirtual   #164 <Method View getChildAt(int)>
	//    9   17:astore          4
			return j >= view.getTop() - k && j < view.getBottom() - k && i >= view.getLeft() && i < view.getRight();
	//   10   19:iload_2         
	//   11   20:aload           4
	//   12   22:invokevirtual   #232 <Method int View.getTop()>
	//   13   25:iload_3         
	//   14   26:isub            
	//   15   27:icmplt          61
	//   16   30:iload_2         
	//   17   31:aload           4
	//   18   33:invokevirtual   #235 <Method int View.getBottom()>
	//   19   36:iload_3         
	//   20   37:isub            
	//   21   38:icmpge          61
	//   22   41:iload_1         
	//   23   42:aload           4
	//   24   44:invokevirtual   #300 <Method int View.getLeft()>
	//   25   47:icmplt          61
	//   26   50:iload_1         
	//   27   51:aload           4
	//   28   53:invokevirtual   #303 <Method int View.getRight()>
	//   29   56:icmpge          61
	//   30   59:iconst_1        
	//   31   60:ireturn         
	//   32   61:iconst_0        
	//   33   62:ireturn         
		} else
		{
			return false;
	//   34   63:iconst_0        
	//   35   64:ireturn         
		}
	}

	private void initOrResetVelocityTracker()
	{
		if(mVelocityTracker == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #306 <Field VelocityTracker mVelocityTracker>
	//*   2    4:ifnonnull       15
		{
			mVelocityTracker = VelocityTracker.obtain();
	//    3    7:aload_0         
	//    4    8:invokestatic    #312 <Method VelocityTracker VelocityTracker.obtain()>
	//    5   11:putfield        #306 <Field VelocityTracker mVelocityTracker>
			return;
	//    6   14:return          
		} else
		{
			mVelocityTracker.clear();
	//    7   15:aload_0         
	//    8   16:getfield        #306 <Field VelocityTracker mVelocityTracker>
	//    9   19:invokevirtual   #315 <Method void VelocityTracker.clear()>
			return;
	//   10   22:return          
		}
	}

	private void initScrollView()
	{
		mScroller = new OverScroller(getContext());
	//    0    0:aload_0         
	//    1    1:new             #317 <Class OverScroller>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokevirtual   #212 <Method Context getContext()>
	//    5    9:invokespecial   #318 <Method void OverScroller(Context)>
	//    6   12:putfield        #320 <Field OverScroller mScroller>
		setFocusable(true);
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:invokevirtual   #323 <Method void setFocusable(boolean)>
		setDescendantFocusability(0x40000);
	//   10   20:aload_0         
	//   11   21:ldc2            #324 <Int 0x40000>
	//   12   24:invokevirtual   #327 <Method void setDescendantFocusability(int)>
		setWillNotDraw(false);
	//   13   27:aload_0         
	//   14   28:iconst_0        
	//   15   29:invokevirtual   #330 <Method void setWillNotDraw(boolean)>
		ViewConfiguration viewconfiguration = ViewConfiguration.get(getContext());
	//   16   32:aload_0         
	//   17   33:invokevirtual   #212 <Method Context getContext()>
	//   18   36:invokestatic    #335 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   19   39:astore_1        
		mTouchSlop = viewconfiguration.getScaledTouchSlop();
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:invokevirtual   #338 <Method int ViewConfiguration.getScaledTouchSlop()>
	//   23   45:putfield        #340 <Field int mTouchSlop>
		mMinimumVelocity = viewconfiguration.getScaledMinimumFlingVelocity();
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:invokevirtual   #343 <Method int ViewConfiguration.getScaledMinimumFlingVelocity()>
	//   27   53:putfield        #345 <Field int mMinimumVelocity>
		mMaximumVelocity = viewconfiguration.getScaledMaximumFlingVelocity();
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:invokevirtual   #348 <Method int ViewConfiguration.getScaledMaximumFlingVelocity()>
	//   31   61:putfield        #350 <Field int mMaximumVelocity>
	//   32   64:return          
	}

	private void initVelocityTrackerIfNotExists()
	{
		if(mVelocityTracker == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #306 <Field VelocityTracker mVelocityTracker>
	//*   2    4:ifnonnull       14
			mVelocityTracker = VelocityTracker.obtain();
	//    3    7:aload_0         
	//    4    8:invokestatic    #312 <Method VelocityTracker VelocityTracker.obtain()>
	//    5   11:putfield        #306 <Field VelocityTracker mVelocityTracker>
	//    6   14:return          
	}

	private boolean isOffScreen(View view)
	{
		return !isWithinDeltaOfScreen(view, 0, getHeight());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_0         
	//    4    4:invokevirtual   #171 <Method int getHeight()>
	//    5    7:invokespecial   #357 <Method boolean isWithinDeltaOfScreen(View, int, int)>
	//    6   10:ifne            15
	//    7   13:iconst_1        
	//    8   14:ireturn         
	//    9   15:iconst_0        
	//   10   16:ireturn         
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
	//    6    8:invokevirtual   #363 <Method ViewParent View.getParent()>
	//    7   11:astore_0        
		return (view instanceof ViewGroup) && isViewDescendantOf((View)view, view1);
	//    8   12:aload_0         
	//    9   13:instanceof      #365 <Class ViewGroup>
	//   10   16:ifeq            32
	//   11   19:aload_0         
	//   12   20:checkcast       #166 <Class View>
	//   13   23:aload_1         
	//   14   24:invokestatic    #367 <Method boolean isViewDescendantOf(View, View)>
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
	//    2    2:getfield        #97  <Field Rect mTempRect>
	//    3    5:invokevirtual   #371 <Method void View.getDrawingRect(Rect)>
		offsetDescendantRectToMyCoords(view, mTempRect);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #97  <Field Rect mTempRect>
	//    8   14:invokevirtual   #375 <Method void offsetDescendantRectToMyCoords(View, Rect)>
		return mTempRect.bottom + i >= getScrollY() && mTempRect.top - i <= getScrollY() + j;
	//    9   17:aload_0         
	//   10   18:getfield        #97  <Field Rect mTempRect>
	//   11   21:getfield        #378 <Field int Rect.bottom>
	//   12   24:iload_2         
	//   13   25:iadd            
	//   14   26:aload_0         
	//   15   27:invokevirtual   #239 <Method int getScrollY()>
	//   16   30:icmplt          53
	//   17   33:aload_0         
	//   18   34:getfield        #97  <Field Rect mTempRect>
	//   19   37:getfield        #381 <Field int Rect.top>
	//   20   40:iload_2         
	//   21   41:isub            
	//   22   42:aload_0         
	//   23   43:invokevirtual   #239 <Method int getScrollY()>
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
	//    1    1:invokevirtual   #388 <Method int MotionEvent.getActionIndex()>
	//    2    4:istore_2        
		if(motionevent.getPointerId(i) == mActivePointerId)
	//*   3    5:aload_1         
	//*   4    6:iload_2         
	//*   5    7:invokevirtual   #392 <Method int MotionEvent.getPointerId(int)>
	//*   6   10:aload_0         
	//*   7   11:getfield        #109 <Field int mActivePointerId>
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
	//   19   31:invokevirtual   #396 <Method float MotionEvent.getY(int)>
	//   20   34:f2i             
	//   21   35:putfield        #398 <Field int mLastMotionY>
			mActivePointerId = motionevent.getPointerId(i);
	//   22   38:aload_0         
	//   23   39:aload_1         
	//   24   40:iload_2         
	//   25   41:invokevirtual   #392 <Method int MotionEvent.getPointerId(int)>
	//   26   44:putfield        #109 <Field int mActivePointerId>
			if(mVelocityTracker != null)
	//*  27   47:aload_0         
	//*  28   48:getfield        #306 <Field VelocityTracker mVelocityTracker>
	//*  29   51:ifnull          61
				mVelocityTracker.clear();
	//   30   54:aload_0         
	//   31   55:getfield        #306 <Field VelocityTracker mVelocityTracker>
	//   32   58:invokevirtual   #315 <Method void VelocityTracker.clear()>
		}
	//   33   61:return          
	}

	private void recycleVelocityTracker()
	{
		if(mVelocityTracker != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #306 <Field VelocityTracker mVelocityTracker>
	//*   2    4:ifnull          19
		{
			mVelocityTracker.recycle();
	//    3    7:aload_0         
	//    4    8:getfield        #306 <Field VelocityTracker mVelocityTracker>
	//    5   11:invokevirtual   #399 <Method void VelocityTracker.recycle()>
			mVelocityTracker = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #306 <Field VelocityTracker mVelocityTracker>
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
	//    3    4:invokevirtual   #171 <Method int getHeight()>
	//    4    7:istore          5
		int l = getScrollY();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #239 <Method int getScrollY()>
	//    7   13:istore          4
		i1 = l + i1;
	//    8   15:iload           4
	//    9   17:iload           5
	//   10   19:iadd            
	//   11   20:istore          5
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
	//   24   42:invokespecial   #403 <Method View findFocusableViewInBounds(boolean, int, int)>
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
	//*  34   62:icmplt          77
	//*  35   65:iload_3         
	//*  36   66:iload           5
	//*  37   68:icmpgt          77
		{
			flag = false;
	//   38   71:iconst_0        
	//   39   72:istore          6
		} else
	//*  40   74:goto            104
		{
			if(flag)
	//*  41   77:iload           6
	//*  42   79:ifeq            90
				j -= l;
	//   43   82:iload_2         
	//   44   83:iload           4
	//   45   85:isub            
	//   46   86:istore_2        
			else
	//*  47   87:goto            95
				j = k - i1;
	//   48   90:iload_3         
	//   49   91:iload           5
	//   50   93:isub            
	//   51   94:istore_2        
			doScrollY(j);
	//   52   95:aload_0         
	//   53   96:iload_2         
	//   54   97:invokespecial   #405 <Method void doScrollY(int)>
			flag = flag1;
	//   55  100:iload           7
	//   56  102:istore          6
		}
		if(obj != findFocus())
	//*  57  104:aload           8
	//*  58  106:aload_0         
	//*  59  107:invokevirtual   #409 <Method View findFocus()>
	//*  60  110:if_acmpeq       120
			((View) (obj)).requestFocus(i);
	//   61  113:aload           8
	//   62  115:iload_1         
	//   63  116:invokevirtual   #413 <Method boolean View.requestFocus(int)>
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
	//    2    2:getfield        #97  <Field Rect mTempRect>
	//    3    5:invokevirtual   #371 <Method void View.getDrawingRect(Rect)>
		offsetDescendantRectToMyCoords(view, mTempRect);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #97  <Field Rect mTempRect>
	//    8   14:invokevirtual   #375 <Method void offsetDescendantRectToMyCoords(View, Rect)>
		int i = computeScrollDeltaToGetChildRectOnScreen(mTempRect);
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #97  <Field Rect mTempRect>
	//   12   22:invokevirtual   #418 <Method int computeScrollDeltaToGetChildRectOnScreen(Rect)>
	//   13   25:istore_2        
		if(i != 0)
	//*  14   26:iload_2         
	//*  15   27:ifeq            36
			scrollBy(0, i);
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:iload_2         
	//   19   33:invokevirtual   #188 <Method void scrollBy(int, int)>
	//   20   36:return          
	}

	private boolean scrollToChildRect(Rect rect, boolean flag)
	{
		int i = computeScrollDeltaToGetChildRectOnScreen(rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #418 <Method int computeScrollDeltaToGetChildRectOnScreen(Rect)>
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
	//   18   31:invokevirtual   #188 <Method void scrollBy(int, int)>
				return flag1;
	//   19   34:iload           4
	//   20   36:ireturn         
			}
			smoothScrollBy(0, i);
	//   21   37:aload_0         
	//   22   38:iconst_0        
	//   23   39:iload_3         
	//   24   40:invokevirtual   #185 <Method void smoothScrollBy(int, int)>
		}
		return flag1;
	//   25   43:iload           4
	//   26   45:ireturn         
	}

	public void addView(View view)
	{
		if(getChildCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #297 <Method int getChildCount()>
	//*   2    4:ifle            18
		{
			throw new IllegalStateException("ScrollView can host only one direct child");
	//    3    7:new             #273 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #423 <String "ScrollView can host only one direct child">
	//    6   14:invokespecial   #278 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			super.addView(view);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokespecial   #425 <Method void FrameLayout.addView(View)>
			return;
	//   11   23:return          
		}
	}

	public void addView(View view, int i)
	{
		if(getChildCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #297 <Method int getChildCount()>
	//*   2    4:ifle            18
		{
			throw new IllegalStateException("ScrollView can host only one direct child");
	//    3    7:new             #273 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #423 <String "ScrollView can host only one direct child">
	//    6   14:invokespecial   #278 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			super.addView(view, i);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:iload_2         
	//   11   21:invokespecial   #428 <Method void FrameLayout.addView(View, int)>
			return;
	//   12   24:return          
		}
	}

	public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(getChildCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #297 <Method int getChildCount()>
	//*   2    4:ifle            18
		{
			throw new IllegalStateException("ScrollView can host only one direct child");
	//    3    7:new             #273 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #423 <String "ScrollView can host only one direct child">
	//    6   14:invokespecial   #278 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			super.addView(view, i, layoutparams);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:iload_2         
	//   11   21:aload_3         
	//   12   22:invokespecial   #431 <Method void FrameLayout.addView(View, int, android.view.ViewGroup$LayoutParams)>
			return;
	//   13   25:return          
		}
	}

	public void addView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(getChildCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #297 <Method int getChildCount()>
	//*   2    4:ifle            18
		{
			throw new IllegalStateException("ScrollView can host only one direct child");
	//    3    7:new             #273 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #423 <String "ScrollView can host only one direct child">
	//    6   14:invokespecial   #278 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			super.addView(view, layoutparams);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:invokespecial   #434 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
			return;
	//   12   24:return          
		}
	}

	public boolean arrowScroll(int i)
	{
		View view1 = findFocus();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #409 <Method View findFocus()>
	//    2    4:astore          8
		View view = view1;
	//    3    6:aload           8
	//    4    8:astore          7
		if(view1 == this)
	//*   5   10:aload           8
	//*   6   12:aload_0         
	//*   7   13:if_acmpne       19
			view = null;
	//    8   16:aconst_null     
	//    9   17:astore          7
		view1 = FocusFinder.getInstance().findNextFocus(((ViewGroup) (this)), view, i);
	//   10   19:invokestatic    #441 <Method FocusFinder FocusFinder.getInstance()>
	//   11   22:aload_0         
	//   12   23:aload           7
	//   13   25:iload_1         
	//   14   26:invokevirtual   #445 <Method View FocusFinder.findNextFocus(ViewGroup, View, int)>
	//   15   29:astore          8
		int l = getMaxScrollAmount();
	//   16   31:aload_0         
	//   17   32:invokevirtual   #448 <Method int getMaxScrollAmount()>
	//   18   35:istore          4
		if(view1 != null && isWithinDeltaOfScreen(view1, l, getHeight()))
	//*  19   37:aload           8
	//*  20   39:ifnull          98
	//*  21   42:aload_0         
	//*  22   43:aload           8
	//*  23   45:iload           4
	//*  24   47:aload_0         
	//*  25   48:invokevirtual   #171 <Method int getHeight()>
	//*  26   51:invokespecial   #357 <Method boolean isWithinDeltaOfScreen(View, int, int)>
	//*  27   54:ifeq            98
		{
			view1.getDrawingRect(mTempRect);
	//   28   57:aload           8
	//   29   59:aload_0         
	//   30   60:getfield        #97  <Field Rect mTempRect>
	//   31   63:invokevirtual   #371 <Method void View.getDrawingRect(Rect)>
			offsetDescendantRectToMyCoords(view1, mTempRect);
	//   32   66:aload_0         
	//   33   67:aload           8
	//   34   69:aload_0         
	//   35   70:getfield        #97  <Field Rect mTempRect>
	//   36   73:invokevirtual   #375 <Method void offsetDescendantRectToMyCoords(View, Rect)>
			doScrollY(computeScrollDeltaToGetChildRectOnScreen(mTempRect));
	//   37   76:aload_0         
	//   38   77:aload_0         
	//   39   78:aload_0         
	//   40   79:getfield        #97  <Field Rect mTempRect>
	//   41   82:invokevirtual   #418 <Method int computeScrollDeltaToGetChildRectOnScreen(Rect)>
	//   42   85:invokespecial   #405 <Method void doScrollY(int)>
			view1.requestFocus(i);
	//   43   88:aload           8
	//   44   90:iload_1         
	//   45   91:invokevirtual   #413 <Method boolean View.requestFocus(int)>
	//   46   94:pop             
		} else
	//*  47   95:goto            209
		{
			int k = l;
	//   48   98:iload           4
	//   49  100:istore_3        
			int j;
			if(i == 33 && getScrollY() < k)
	//*  50  101:iload_1         
	//*  51  102:bipush          33
	//*  52  104:icmpne          123
	//*  53  107:aload_0         
	//*  54  108:invokevirtual   #239 <Method int getScrollY()>
	//*  55  111:iload_3         
	//*  56  112:icmpge          123
			{
				j = getScrollY();
	//   57  115:aload_0         
	//   58  116:invokevirtual   #239 <Method int getScrollY()>
	//   59  119:istore_2        
			} else
	//*  60  120:goto            185
			{
				j = k;
	//   61  123:iload_3         
	//   62  124:istore_2        
				if(i == 130)
	//*  63  125:iload_1         
	//*  64  126:sipush          130
	//*  65  129:icmpne          185
				{
					j = k;
	//   66  132:iload_3         
	//   67  133:istore_2        
					if(getChildCount() > 0)
	//*  68  134:aload_0         
	//*  69  135:invokevirtual   #297 <Method int getChildCount()>
	//*  70  138:ifle            185
					{
						int i1 = getChildAt(0).getBottom();
	//   71  141:aload_0         
	//   72  142:iconst_0        
	//   73  143:invokevirtual   #164 <Method View getChildAt(int)>
	//   74  146:invokevirtual   #235 <Method int View.getBottom()>
	//   75  149:istore          5
						int j1 = (getScrollY() + getHeight()) - getPaddingBottom();
	//   76  151:aload_0         
	//   77  152:invokevirtual   #239 <Method int getScrollY()>
	//   78  155:aload_0         
	//   79  156:invokevirtual   #171 <Method int getHeight()>
	//   80  159:iadd            
	//   81  160:aload_0         
	//   82  161:invokevirtual   #177 <Method int getPaddingBottom()>
	//   83  164:isub            
	//   84  165:istore          6
						j = k;
	//   85  167:iload_3         
	//   86  168:istore_2        
						if(i1 - j1 < l)
	//*  87  169:iload           5
	//*  88  171:iload           6
	//*  89  173:isub            
	//*  90  174:iload           4
	//*  91  176:icmpge          185
							j = i1 - j1;
	//   92  179:iload           5
	//   93  181:iload           6
	//   94  183:isub            
	//   95  184:istore_2        
					}
				}
			}
			if(j == 0)
	//*  96  185:iload_2         
	//*  97  186:ifne            191
				return false;
	//   98  189:iconst_0        
	//   99  190:ireturn         
			if(i != 130)
	//* 100  191:iload_1         
	//* 101  192:sipush          130
	//* 102  195:icmpne          201
	//* 103  198:goto            204
				j = -j;
	//  104  201:iload_2         
	//  105  202:ineg            
	//  106  203:istore_2        
			doScrollY(j);
	//  107  204:aload_0         
	//  108  205:iload_2         
	//  109  206:invokespecial   #405 <Method void doScrollY(int)>
		}
		if(view != null && view.isFocused() && isOffScreen(view))
	//* 110  209:aload           7
	//* 111  211:ifnull          253
	//* 112  214:aload           7
	//* 113  216:invokevirtual   #451 <Method boolean View.isFocused()>
	//* 114  219:ifeq            253
	//* 115  222:aload_0         
	//* 116  223:aload           7
	//* 117  225:invokespecial   #453 <Method boolean isOffScreen(View)>
	//* 118  228:ifeq            253
		{
			i = getDescendantFocusability();
	//  119  231:aload_0         
	//  120  232:invokevirtual   #456 <Method int getDescendantFocusability()>
	//  121  235:istore_1        
			setDescendantFocusability(0x20000);
	//  122  236:aload_0         
	//  123  237:ldc2            #457 <Int 0x20000>
	//  124  240:invokevirtual   #327 <Method void setDescendantFocusability(int)>
			requestFocus();
	//  125  243:aload_0         
	//  126  244:invokevirtual   #459 <Method boolean requestFocus()>
	//  127  247:pop             
			setDescendantFocusability(i);
	//  128  248:aload_0         
	//  129  249:iload_1         
	//  130  250:invokevirtual   #327 <Method void setDescendantFocusability(int)>
		}
		return true;
	//  131  253:iconst_1        
	//  132  254:ireturn         
	}

	public int computeHorizontalScrollExtent()
	{
		return super.computeHorizontalScrollExtent();
	//    0    0:aload_0         
	//    1    1:invokespecial   #466 <Method int FrameLayout.computeHorizontalScrollExtent()>
	//    2    4:ireturn         
	}

	public int computeHorizontalScrollOffset()
	{
		return super.computeHorizontalScrollOffset();
	//    0    0:aload_0         
	//    1    1:invokespecial   #470 <Method int FrameLayout.computeHorizontalScrollOffset()>
	//    2    4:ireturn         
	}

	public int computeHorizontalScrollRange()
	{
		return super.computeHorizontalScrollRange();
	//    0    0:aload_0         
	//    1    1:invokespecial   #473 <Method int FrameLayout.computeHorizontalScrollRange()>
	//    2    4:ireturn         
	}

	public void computeScroll()
	{
		if(mScroller.computeScrollOffset())
	//*   0    0:aload_0         
	//*   1    1:getfield        #320 <Field OverScroller mScroller>
	//*   2    4:invokevirtual   #477 <Method boolean OverScroller.computeScrollOffset()>
	//*   3    7:ifeq            164
		{
			int j = getScrollX();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #480 <Method int getScrollX()>
	//    6   14:istore_2        
			int k = getScrollY();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #239 <Method int getScrollY()>
	//    9   19:istore_3        
			int l = mScroller.getCurrX();
	//   10   20:aload_0         
	//   11   21:getfield        #320 <Field OverScroller mScroller>
	//   12   24:invokevirtual   #483 <Method int OverScroller.getCurrX()>
	//   13   27:istore          4
			int i1 = mScroller.getCurrY();
	//   14   29:aload_0         
	//   15   30:getfield        #320 <Field OverScroller mScroller>
	//   16   33:invokevirtual   #486 <Method int OverScroller.getCurrY()>
	//   17   36:istore          5
			if(j != l || k != i1)
	//*  18   38:iload_2         
	//*  19   39:iload           4
	//*  20   41:icmpne          50
	//*  21   44:iload_3         
	//*  22   45:iload           5
	//*  23   47:icmpeq          164
			{
				int j1 = getScrollRange();
	//   24   50:aload_0         
	//   25   51:invokevirtual   #242 <Method int getScrollRange()>
	//   26   54:istore          6
				int i = getOverScrollMode();
	//   27   56:aload_0         
	//   28   57:invokevirtual   #208 <Method int getOverScrollMode()>
	//   29   60:istore_1        
				boolean flag;
				if(i == 0 || i == 1 && j1 > 0)
	//*  30   61:iload_1         
	//*  31   62:ifeq            75
	//*  32   65:iload_1         
	//*  33   66:iconst_1        
	//*  34   67:icmpne          80
	//*  35   70:iload           6
	//*  36   72:ifle            80
					flag = true;
	//   37   75:iconst_1        
	//   38   76:istore_1        
				else
	//*  39   77:goto            82
					flag = false;
	//   40   80:iconst_0        
	//   41   81:istore_1        
				overScrollByCompat(l - j, i1 - k, j, k, 0, j1, 0, 0, false);
	//   42   82:aload_0         
	//   43   83:iload           4
	//   44   85:iload_2         
	//   45   86:isub            
	//   46   87:iload           5
	//   47   89:iload_3         
	//   48   90:isub            
	//   49   91:iload_2         
	//   50   92:iload_3         
	//   51   93:iconst_0        
	//   52   94:iload           6
	//   53   96:iconst_0        
	//   54   97:iconst_0        
	//   55   98:iconst_0        
	//   56   99:invokevirtual   #490 <Method boolean overScrollByCompat(int, int, int, int, int, int, int, int, boolean)>
	//   57  102:pop             
				if(flag)
	//*  58  103:iload_1         
	//*  59  104:ifeq            164
				{
					ensureGlows();
	//   60  107:aload_0         
	//   61  108:invokespecial   #492 <Method void ensureGlows()>
					if(i1 <= 0 && k > 0)
	//*  62  111:iload           5
	//*  63  113:ifgt            136
	//*  64  116:iload_3         
	//*  65  117:ifle            136
					{
						mEdgeGlowTop.onAbsorb((int)mScroller.getCurrVelocity());
	//   66  120:aload_0         
	//   67  121:getfield        #197 <Field EdgeEffect mEdgeGlowTop>
	//   68  124:aload_0         
	//   69  125:getfield        #320 <Field OverScroller mScroller>
	//   70  128:invokevirtual   #495 <Method float OverScroller.getCurrVelocity()>
	//   71  131:f2i             
	//   72  132:invokevirtual   #498 <Method void EdgeEffect.onAbsorb(int)>
						return;
	//   73  135:return          
					}
					if(i1 >= j1 && k < j1)
	//*  74  136:iload           5
	//*  75  138:iload           6
	//*  76  140:icmplt          164
	//*  77  143:iload_3         
	//*  78  144:iload           6
	//*  79  146:icmpge          164
						mEdgeGlowBottom.onAbsorb((int)mScroller.getCurrVelocity());
	//   80  149:aload_0         
	//   81  150:getfield        #204 <Field EdgeEffect mEdgeGlowBottom>
	//   82  153:aload_0         
	//   83  154:getfield        #320 <Field OverScroller mScroller>
	//   84  157:invokevirtual   #495 <Method float OverScroller.getCurrVelocity()>
	//   85  160:f2i             
	//   86  161:invokevirtual   #498 <Method void EdgeEffect.onAbsorb(int)>
				}
			}
		}
	//   87  164:return          
	}

	protected int computeScrollDeltaToGetChildRectOnScreen(Rect rect)
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #297 <Method int getChildCount()>
	//*   2    4:ifne            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		int i1 = getHeight();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #171 <Method int getHeight()>
	//    7   13:istore          6
		int i = getScrollY();
	//    8   15:aload_0         
	//    9   16:invokevirtual   #239 <Method int getScrollY()>
	//   10   19:istore_2        
		int k = i + i1;
	//   11   20:iload_2         
	//   12   21:iload           6
	//   13   23:iadd            
	//   14   24:istore          4
		int l = getVerticalFadingEdgeLength();
	//   15   26:aload_0         
	//   16   27:invokevirtual   #501 <Method int getVerticalFadingEdgeLength()>
	//   17   30:istore          5
		int j = i;
	//   18   32:iload_2         
	//   19   33:istore_3        
		if(rect.top > 0)
	//*  20   34:aload_1         
	//*  21   35:getfield        #381 <Field int Rect.top>
	//*  22   38:ifle            46
			j = i + l;
	//   23   41:iload_2         
	//   24   42:iload           5
	//   25   44:iadd            
	//   26   45:istore_3        
		i = k;
	//   27   46:iload           4
	//   28   48:istore_2        
		if(rect.bottom < getChildAt(0).getHeight())
	//*  29   49:aload_1         
	//*  30   50:getfield        #378 <Field int Rect.bottom>
	//*  31   53:aload_0         
	//*  32   54:iconst_0        
	//*  33   55:invokevirtual   #164 <Method View getChildAt(int)>
	//*  34   58:invokevirtual   #170 <Method int View.getHeight()>
	//*  35   61:icmpge          70
			i = k - l;
	//   36   64:iload           4
	//   37   66:iload           5
	//   38   68:isub            
	//   39   69:istore_2        
		l = 0;
	//   40   70:iconst_0        
	//   41   71:istore          5
		if(rect.bottom > i && rect.top > j)
	//*  42   73:aload_1         
	//*  43   74:getfield        #378 <Field int Rect.bottom>
	//*  44   77:iload_2         
	//*  45   78:icmple          134
	//*  46   81:aload_1         
	//*  47   82:getfield        #381 <Field int Rect.top>
	//*  48   85:iload_3         
	//*  49   86:icmple          134
		{
			if(rect.height() > i1)
	//*  50   89:aload_1         
	//*  51   90:invokevirtual   #504 <Method int Rect.height()>
	//*  52   93:iload           6
	//*  53   95:icmple          110
				j = (rect.top - j) + 0;
	//   54   98:aload_1         
	//   55   99:getfield        #381 <Field int Rect.top>
	//   56  102:iload_3         
	//   57  103:isub            
	//   58  104:iconst_0        
	//   59  105:iadd            
	//   60  106:istore_3        
			else
	//*  61  107:goto            119
				j = (rect.bottom - i) + 0;
	//   62  110:aload_1         
	//   63  111:getfield        #378 <Field int Rect.bottom>
	//   64  114:iload_2         
	//   65  115:isub            
	//   66  116:iconst_0        
	//   67  117:iadd            
	//   68  118:istore_3        
			return Math.min(j, getChildAt(0).getBottom() - i);
	//   69  119:iload_3         
	//   70  120:aload_0         
	//   71  121:iconst_0        
	//   72  122:invokevirtual   #164 <Method View getChildAt(int)>
	//   73  125:invokevirtual   #235 <Method int View.getBottom()>
	//   74  128:iload_2         
	//   75  129:isub            
	//   76  130:invokestatic    #510 <Method int Math.min(int, int)>
	//   77  133:ireturn         
		}
		k = l;
	//   78  134:iload           5
	//   79  136:istore          4
		if(rect.top < j)
	//*  80  138:aload_1         
	//*  81  139:getfield        #381 <Field int Rect.top>
	//*  82  142:iload_3         
	//*  83  143:icmpge          199
		{
			k = l;
	//   84  146:iload           5
	//   85  148:istore          4
			if(rect.bottom < i)
	//*  86  150:aload_1         
	//*  87  151:getfield        #378 <Field int Rect.bottom>
	//*  88  154:iload_2         
	//*  89  155:icmpge          199
			{
				if(rect.height() > i1)
	//*  90  158:aload_1         
	//*  91  159:invokevirtual   #504 <Method int Rect.height()>
	//*  92  162:iload           6
	//*  93  164:icmple          179
					i = 0 - (i - rect.bottom);
	//   94  167:iconst_0        
	//   95  168:iload_2         
	//   96  169:aload_1         
	//   97  170:getfield        #378 <Field int Rect.bottom>
	//   98  173:isub            
	//   99  174:isub            
	//  100  175:istore_2        
				else
	//* 101  176:goto            188
					i = 0 - (j - rect.top);
	//  102  179:iconst_0        
	//  103  180:iload_3         
	//  104  181:aload_1         
	//  105  182:getfield        #381 <Field int Rect.top>
	//  106  185:isub            
	//  107  186:isub            
	//  108  187:istore_2        
				k = Math.max(i, -getScrollY());
	//  109  188:iload_2         
	//  110  189:aload_0         
	//  111  190:invokevirtual   #239 <Method int getScrollY()>
	//  112  193:ineg            
	//  113  194:invokestatic    #513 <Method int Math.max(int, int)>
	//  114  197:istore          4
			}
		}
		return k;
	//  115  199:iload           4
	//  116  201:ireturn         
	}

	public int computeVerticalScrollExtent()
	{
		return super.computeVerticalScrollExtent();
	//    0    0:aload_0         
	//    1    1:invokespecial   #516 <Method int FrameLayout.computeVerticalScrollExtent()>
	//    2    4:ireturn         
	}

	public int computeVerticalScrollOffset()
	{
		return Math.max(0, super.computeVerticalScrollOffset());
	//    0    0:iconst_0        
	//    1    1:aload_0         
	//    2    2:invokespecial   #519 <Method int FrameLayout.computeVerticalScrollOffset()>
	//    3    5:invokestatic    #513 <Method int Math.max(int, int)>
	//    4    8:ireturn         
	}

	public int computeVerticalScrollRange()
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #297 <Method int getChildCount()>
	//    2    4:istore_2        
		int i = getHeight() - getPaddingBottom() - getPaddingTop();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #171 <Method int getHeight()>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #177 <Method int getPaddingBottom()>
	//    7   13:isub            
	//    8   14:aload_0         
	//    9   15:invokevirtual   #174 <Method int getPaddingTop()>
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
	//   18   28:invokevirtual   #164 <Method View getChildAt(int)>
	//   19   31:invokevirtual   #235 <Method int View.getBottom()>
	//   20   34:istore_2        
		int k = getScrollY();
	//   21   35:aload_0         
	//   22   36:invokevirtual   #239 <Method int getScrollY()>
	//   23   39:istore_3        
		int l = Math.max(0, j - i);
	//   24   40:iconst_0        
	//   25   41:iload_2         
	//   26   42:iload_1         
	//   27   43:isub            
	//   28   44:invokestatic    #513 <Method int Math.max(int, int)>
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
	//    2    2:invokespecial   #524 <Method boolean FrameLayout.dispatchKeyEvent(KeyEvent)>
	//    3    5:ifne            16
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #527 <Method boolean executeKeyEvent(KeyEvent)>
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
	//    1    1:getfield        #149 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #528 <Method boolean NestedScrollingChildHelper.dispatchNestedFling(float, float, boolean)>
	//    6   10:ireturn         
	}

	public boolean dispatchNestedPreFling(float f, float f1)
	{
		return mChildHelper.dispatchNestedPreFling(f, f1);
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokevirtual   #529 <Method boolean NestedScrollingChildHelper.dispatchNestedPreFling(float, float)>
	//    5    9:ireturn         
	}

	public boolean dispatchNestedPreScroll(int i, int j, int ai[], int ai1[])
	{
		return mChildHelper.dispatchNestedPreScroll(i, j, ai, ai1);
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #533 <Method boolean NestedScrollingChildHelper.dispatchNestedPreScroll(int, int, int[], int[])>
	//    7   12:ireturn         
	}

	public boolean dispatchNestedScroll(int i, int j, int k, int l, int ai[])
	{
		return mChildHelper.dispatchNestedScroll(i, j, k, l, ai);
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:aload           5
	//    7   11:invokevirtual   #537 <Method boolean NestedScrollingChildHelper.dispatchNestedScroll(int, int, int, int, int[])>
	//    8   14:ireturn         
	}

	public void draw(Canvas canvas)
	{
		super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #541 <Method void FrameLayout.draw(Canvas)>
		if(mEdgeGlowTop != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #197 <Field EdgeEffect mEdgeGlowTop>
	//*   5    9:ifnull          208
		{
			int i = getScrollY();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #239 <Method int getScrollY()>
	//    8   16:istore_2        
			if(!mEdgeGlowTop.isFinished())
	//*   9   17:aload_0         
	//*  10   18:getfield        #197 <Field EdgeEffect mEdgeGlowTop>
	//*  11   21:invokevirtual   #544 <Method boolean EdgeEffect.isFinished()>
	//*  12   24:ifne            104
			{
				int j = canvas.save();
	//   13   27:aload_1         
	//   14   28:invokevirtual   #549 <Method int Canvas.save()>
	//   15   31:istore_3        
				int l = getWidth();
	//   16   32:aload_0         
	//   17   33:invokevirtual   #552 <Method int getWidth()>
	//   18   36:istore          4
				int j1 = getPaddingLeft();
	//   19   38:aload_0         
	//   20   39:invokevirtual   #555 <Method int getPaddingLeft()>
	//   21   42:istore          5
				int l1 = getPaddingRight();
	//   22   44:aload_0         
	//   23   45:invokevirtual   #558 <Method int getPaddingRight()>
	//   24   48:istore          6
				canvas.translate(getPaddingLeft(), Math.min(0, i));
	//   25   50:aload_1         
	//   26   51:aload_0         
	//   27   52:invokevirtual   #555 <Method int getPaddingLeft()>
	//   28   55:i2f             
	//   29   56:iconst_0        
	//   30   57:iload_2         
	//   31   58:invokestatic    #510 <Method int Math.min(int, int)>
	//   32   61:i2f             
	//   33   62:invokevirtual   #562 <Method void Canvas.translate(float, float)>
				mEdgeGlowTop.setSize(l - j1 - l1, getHeight());
	//   34   65:aload_0         
	//   35   66:getfield        #197 <Field EdgeEffect mEdgeGlowTop>
	//   36   69:iload           4
	//   37   71:iload           5
	//   38   73:isub            
	//   39   74:iload           6
	//   40   76:isub            
	//   41   77:aload_0         
	//   42   78:invokevirtual   #171 <Method int getHeight()>
	//   43   81:invokevirtual   #565 <Method void EdgeEffect.setSize(int, int)>
				if(mEdgeGlowTop.draw(canvas))
	//*  44   84:aload_0         
	//*  45   85:getfield        #197 <Field EdgeEffect mEdgeGlowTop>
	//*  46   88:aload_1         
	//*  47   89:invokevirtual   #568 <Method boolean EdgeEffect.draw(Canvas)>
	//*  48   92:ifeq            99
					ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   49   95:aload_0         
	//   50   96:invokestatic    #571 <Method void ViewCompat.postInvalidateOnAnimation(View)>
				canvas.restoreToCount(j);
	//   51   99:aload_1         
	//   52  100:iload_3         
	//   53  101:invokevirtual   #574 <Method void Canvas.restoreToCount(int)>
			}
			if(!mEdgeGlowBottom.isFinished())
	//*  54  104:aload_0         
	//*  55  105:getfield        #204 <Field EdgeEffect mEdgeGlowBottom>
	//*  56  108:invokevirtual   #544 <Method boolean EdgeEffect.isFinished()>
	//*  57  111:ifne            208
			{
				int k = canvas.save();
	//   58  114:aload_1         
	//   59  115:invokevirtual   #549 <Method int Canvas.save()>
	//   60  118:istore_3        
				int i1 = getWidth() - getPaddingLeft() - getPaddingRight();
	//   61  119:aload_0         
	//   62  120:invokevirtual   #552 <Method int getWidth()>
	//   63  123:aload_0         
	//   64  124:invokevirtual   #555 <Method int getPaddingLeft()>
	//   65  127:isub            
	//   66  128:aload_0         
	//   67  129:invokevirtual   #558 <Method int getPaddingRight()>
	//   68  132:isub            
	//   69  133:istore          4
				int k1 = getHeight();
	//   70  135:aload_0         
	//   71  136:invokevirtual   #171 <Method int getHeight()>
	//   72  139:istore          5
				canvas.translate(-i1 + getPaddingLeft(), Math.max(getScrollRange(), i) + k1);
	//   73  141:aload_1         
	//   74  142:iload           4
	//   75  144:ineg            
	//   76  145:aload_0         
	//   77  146:invokevirtual   #555 <Method int getPaddingLeft()>
	//   78  149:iadd            
	//   79  150:i2f             
	//   80  151:aload_0         
	//   81  152:invokevirtual   #242 <Method int getScrollRange()>
	//   82  155:iload_2         
	//   83  156:invokestatic    #513 <Method int Math.max(int, int)>
	//   84  159:iload           5
	//   85  161:iadd            
	//   86  162:i2f             
	//   87  163:invokevirtual   #562 <Method void Canvas.translate(float, float)>
				canvas.rotate(180F, i1, 0.0F);
	//   88  166:aload_1         
	//   89  167:ldc2            #575 <Float 180F>
	//   90  170:iload           4
	//   91  172:i2f             
	//   92  173:fconst_0        
	//   93  174:invokevirtual   #579 <Method void Canvas.rotate(float, float, float)>
				mEdgeGlowBottom.setSize(i1, k1);
	//   94  177:aload_0         
	//   95  178:getfield        #204 <Field EdgeEffect mEdgeGlowBottom>
	//   96  181:iload           4
	//   97  183:iload           5
	//   98  185:invokevirtual   #565 <Method void EdgeEffect.setSize(int, int)>
				if(mEdgeGlowBottom.draw(canvas))
	//*  99  188:aload_0         
	//* 100  189:getfield        #204 <Field EdgeEffect mEdgeGlowBottom>
	//* 101  192:aload_1         
	//* 102  193:invokevirtual   #568 <Method boolean EdgeEffect.draw(Canvas)>
	//* 103  196:ifeq            203
					ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//  104  199:aload_0         
	//  105  200:invokestatic    #571 <Method void ViewCompat.postInvalidateOnAnimation(View)>
				canvas.restoreToCount(k);
	//  106  203:aload_1         
	//  107  204:iload_3         
	//  108  205:invokevirtual   #574 <Method void Canvas.restoreToCount(int)>
			}
		}
	//  109  208:return          
	}

	public boolean executeKeyEvent(KeyEvent keyevent)
	{
		mTempRect.setEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field Rect mTempRect>
	//    2    4:invokevirtual   #582 <Method void Rect.setEmpty()>
		if(!canScroll())
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #584 <Method boolean canScroll()>
	//*   5   11:ifne            80
			if(isFocused() && keyevent.getKeyCode() != 4)
	//*   6   14:aload_0         
	//*   7   15:invokevirtual   #585 <Method boolean isFocused()>
	//*   8   18:ifeq            78
	//*   9   21:aload_1         
	//*  10   22:invokevirtual   #590 <Method int KeyEvent.getKeyCode()>
	//*  11   25:iconst_4        
	//*  12   26:icmpeq          78
			{
				View view = findFocus();
	//   13   29:aload_0         
	//   14   30:invokevirtual   #409 <Method View findFocus()>
	//   15   33:astore_3        
				keyevent = ((KeyEvent) (view));
	//   16   34:aload_3         
	//   17   35:astore_1        
				if(view == this)
	//*  18   36:aload_3         
	//*  19   37:aload_0         
	//*  20   38:if_acmpne       43
					keyevent = null;
	//   21   41:aconst_null     
	//   22   42:astore_1        
				keyevent = ((KeyEvent) (FocusFinder.getInstance().findNextFocus(((ViewGroup) (this)), ((View) (keyevent)), 130)));
	//   23   43:invokestatic    #441 <Method FocusFinder FocusFinder.getInstance()>
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:sipush          130
	//   27   51:invokevirtual   #445 <Method View FocusFinder.findNextFocus(ViewGroup, View, int)>
	//   28   54:astore_1        
				return keyevent != null && keyevent != this && ((View) (keyevent)).requestFocus(130);
	//   29   55:aload_1         
	//   30   56:ifnull          76
	//   31   59:aload_1         
	//   32   60:aload_0         
	//   33   61:if_acmpeq       76
	//   34   64:aload_1         
	//   35   65:sipush          130
	//   36   68:invokevirtual   #413 <Method boolean View.requestFocus(int)>
	//   37   71:ifeq            76
	//   38   74:iconst_1        
	//   39   75:ireturn         
	//   40   76:iconst_0        
	//   41   77:ireturn         
			} else
			{
				return false;
	//   42   78:iconst_0        
	//   43   79:ireturn         
			}
		if(keyevent.getAction() == 0)
	//*  44   80:aload_1         
	//*  45   81:invokevirtual   #593 <Method int KeyEvent.getAction()>
	//*  46   84:ifne            193
		{
			switch(keyevent.getKeyCode())
	//*  47   87:aload_1         
	//*  48   88:invokevirtual   #590 <Method int KeyEvent.getKeyCode()>
			{
	//*  49   91:lookupswitch    3: default 124
	//	               19: 126
	//	               20: 147
	//	               62: 170
			default:
				return false;
	//   50  124:iconst_0        
	//   51  125:ireturn         

			case 19: // '\023'
				if(!keyevent.isAltPressed())
	//*  52  126:aload_1         
	//*  53  127:invokevirtual   #596 <Method boolean KeyEvent.isAltPressed()>
	//*  54  130:ifne            140
					return arrowScroll(33);
	//   55  133:aload_0         
	//   56  134:bipush          33
	//   57  136:invokevirtual   #598 <Method boolean arrowScroll(int)>
	//   58  139:ireturn         
				else
					return fullScroll(33);
	//   59  140:aload_0         
	//   60  141:bipush          33
	//   61  143:invokevirtual   #601 <Method boolean fullScroll(int)>
	//   62  146:ireturn         

			case 20: // '\024'
				if(!keyevent.isAltPressed())
	//*  63  147:aload_1         
	//*  64  148:invokevirtual   #596 <Method boolean KeyEvent.isAltPressed()>
	//*  65  151:ifne            162
					return arrowScroll(130);
	//   66  154:aload_0         
	//   67  155:sipush          130
	//   68  158:invokevirtual   #598 <Method boolean arrowScroll(int)>
	//   69  161:ireturn         
				else
					return fullScroll(130);
	//   70  162:aload_0         
	//   71  163:sipush          130
	//   72  166:invokevirtual   #601 <Method boolean fullScroll(int)>
	//   73  169:ireturn         

			case 62: // '>'
				break;
			}
			char c;
			if(keyevent.isShiftPressed())
	//*  74  170:aload_1         
	//*  75  171:invokevirtual   #604 <Method boolean KeyEvent.isShiftPressed()>
	//*  76  174:ifeq            183
				c = '!';
	//   77  177:bipush          33
	//   78  179:istore_2        
			else
	//*  79  180:goto            187
				c = '\202';
	//   80  183:sipush          130
	//   81  186:istore_2        
			pageScroll(((int) (c)));
	//   82  187:aload_0         
	//   83  188:iload_2         
	//   84  189:invokevirtual   #607 <Method boolean pageScroll(int)>
	//   85  192:pop             
		}
		return false;
	//   86  193:iconst_0        
	//   87  194:ireturn         
	}

	public void fling(int i)
	{
		if(getChildCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #297 <Method int getChildCount()>
	//*   2    4:ifle            66
		{
			int j = getHeight() - getPaddingBottom() - getPaddingTop();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #171 <Method int getHeight()>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #177 <Method int getPaddingBottom()>
	//    7   15:isub            
	//    8   16:aload_0         
	//    9   17:invokevirtual   #174 <Method int getPaddingTop()>
	//   10   20:isub            
	//   11   21:istore_2        
			int k = getChildAt(0).getHeight();
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:invokevirtual   #164 <Method View getChildAt(int)>
	//   15   27:invokevirtual   #170 <Method int View.getHeight()>
	//   16   30:istore_3        
			mScroller.fling(getScrollX(), getScrollY(), 0, i, 0, 0, 0, Math.max(0, k - j), 0, j / 2);
	//   17   31:aload_0         
	//   18   32:getfield        #320 <Field OverScroller mScroller>
	//   19   35:aload_0         
	//   20   36:invokevirtual   #480 <Method int getScrollX()>
	//   21   39:aload_0         
	//   22   40:invokevirtual   #239 <Method int getScrollY()>
	//   23   43:iconst_0        
	//   24   44:iload_1         
	//   25   45:iconst_0        
	//   26   46:iconst_0        
	//   27   47:iconst_0        
	//   28   48:iconst_0        
	//   29   49:iload_3         
	//   30   50:iload_2         
	//   31   51:isub            
	//   32   52:invokestatic    #513 <Method int Math.max(int, int)>
	//   33   55:iconst_0        
	//   34   56:iload_2         
	//   35   57:iconst_2        
	//   36   58:idiv            
	//   37   59:invokevirtual   #610 <Method void OverScroller.fling(int, int, int, int, int, int, int, int, int, int)>
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   38   62:aload_0         
	//   39   63:invokestatic    #571 <Method void ViewCompat.postInvalidateOnAnimation(View)>
		}
	//   40   66:return          
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
	//    9   15:invokevirtual   #171 <Method int getHeight()>
	//   10   18:istore_3        
		mTempRect.top = 0;
	//   11   19:aload_0         
	//   12   20:getfield        #97  <Field Rect mTempRect>
	//   13   23:iconst_0        
	//   14   24:putfield        #381 <Field int Rect.top>
		mTempRect.bottom = k;
	//   15   27:aload_0         
	//   16   28:getfield        #97  <Field Rect mTempRect>
	//   17   31:iload_3         
	//   18   32:putfield        #378 <Field int Rect.bottom>
		if(flag)
	//*  19   35:iload_2         
	//*  20   36:ifeq            90
		{
			int j = getChildCount();
	//   21   39:aload_0         
	//   22   40:invokevirtual   #297 <Method int getChildCount()>
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
	//   30   52:invokevirtual   #164 <Method View getChildAt(int)>
	//   31   55:astore          4
				mTempRect.bottom = view.getBottom() + getPaddingBottom();
	//   32   57:aload_0         
	//   33   58:getfield        #97  <Field Rect mTempRect>
	//   34   61:aload           4
	//   35   63:invokevirtual   #235 <Method int View.getBottom()>
	//   36   66:aload_0         
	//   37   67:invokevirtual   #177 <Method int getPaddingBottom()>
	//   38   70:iadd            
	//   39   71:putfield        #378 <Field int Rect.bottom>
				mTempRect.top = mTempRect.bottom - k;
	//   40   74:aload_0         
	//   41   75:getfield        #97  <Field Rect mTempRect>
	//   42   78:aload_0         
	//   43   79:getfield        #97  <Field Rect mTempRect>
	//   44   82:getfield        #378 <Field int Rect.bottom>
	//   45   85:iload_3         
	//   46   86:isub            
	//   47   87:putfield        #381 <Field int Rect.top>
			}
		}
		return scrollAndFocus(i, mTempRect.top, mTempRect.bottom);
	//   48   90:aload_0         
	//   49   91:iload_1         
	//   50   92:aload_0         
	//   51   93:getfield        #97  <Field Rect mTempRect>
	//   52   96:getfield        #381 <Field int Rect.top>
	//   53   99:aload_0         
	//   54  100:getfield        #97  <Field Rect mTempRect>
	//   55  103:getfield        #378 <Field int Rect.bottom>
	//   56  106:invokespecial   #612 <Method boolean scrollAndFocus(int, int, int)>
	//   57  109:ireturn         
	}

	protected float getBottomFadingEdgeStrength()
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #297 <Method int getChildCount()>
	//*   2    4:ifne            9
			return 0.0F;
	//    3    7:fconst_0        
	//    4    8:freturn         
		int i = getVerticalFadingEdgeLength();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #501 <Method int getVerticalFadingEdgeLength()>
	//    7   13:istore_1        
		int j = getHeight();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #171 <Method int getHeight()>
	//   10   18:istore_2        
		int k = getPaddingBottom();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #177 <Method int getPaddingBottom()>
	//   13   23:istore_3        
		j = getChildAt(0).getBottom() - getScrollY() - (j - k);
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:invokevirtual   #164 <Method View getChildAt(int)>
	//   17   29:invokevirtual   #235 <Method int View.getBottom()>
	//   18   32:aload_0         
	//   19   33:invokevirtual   #239 <Method int getScrollY()>
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
		return (int)((float)getHeight() * 0.5F);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #171 <Method int getHeight()>
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
	//    1    1:getfield        #142 <Field NestedScrollingParentHelper mParentHelper>
	//    2    4:invokevirtual   #616 <Method int NestedScrollingParentHelper.getNestedScrollAxes()>
	//    3    7:ireturn         
	}

	int getScrollRange()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(getChildCount() > 0)
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #297 <Method int getChildCount()>
	//*   4    6:ifle            37
			i = Math.max(0, getChildAt(0).getHeight() - (getHeight() - getPaddingBottom() - getPaddingTop()));
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #164 <Method View getChildAt(int)>
	//    9   15:invokevirtual   #170 <Method int View.getHeight()>
	//   10   18:aload_0         
	//   11   19:invokevirtual   #171 <Method int getHeight()>
	//   12   22:aload_0         
	//   13   23:invokevirtual   #177 <Method int getPaddingBottom()>
	//   14   26:isub            
	//   15   27:aload_0         
	//   16   28:invokevirtual   #174 <Method int getPaddingTop()>
	//   17   31:isub            
	//   18   32:isub            
	//   19   33:invokestatic    #513 <Method int Math.max(int, int)>
	//   20   36:istore_1        
		return i;
	//   21   37:iload_1         
	//   22   38:ireturn         
	}

	protected float getTopFadingEdgeStrength()
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #297 <Method int getChildCount()>
	//*   2    4:ifne            9
			return 0.0F;
	//    3    7:fconst_0        
	//    4    8:freturn         
		int i = getVerticalFadingEdgeLength();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #501 <Method int getVerticalFadingEdgeLength()>
	//    7   13:istore_1        
		int j = getScrollY();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #239 <Method int getScrollY()>
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
	//    1    1:getfield        #149 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:invokevirtual   #620 <Method boolean NestedScrollingChildHelper.hasNestedScrollingParent()>
	//    3    7:ireturn         
	}

	public boolean isFillViewport()
	{
		return mFillViewport;
	//    0    0:aload_0         
	//    1    1:getfield        #623 <Field boolean mFillViewport>
	//    2    4:ireturn         
	}

	public boolean isNestedScrollingEnabled()
	{
		return mChildHelper.isNestedScrollingEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:invokevirtual   #626 <Method boolean NestedScrollingChildHelper.isNestedScrollingEnabled()>
	//    3    7:ireturn         
	}

	public boolean isSmoothScrollingEnabled()
	{
		return mSmoothScrollingEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field boolean mSmoothScrollingEnabled>
	//    2    4:ireturn         
	}

	protected void measureChild(View view, int i, int j)
	{
		android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #633 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:astore          4
		view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), layoutparams.width), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
	//    3    6:aload_1         
	//    4    7:iload_2         
	//    5    8:aload_0         
	//    6    9:invokevirtual   #555 <Method int getPaddingLeft()>
	//    7   12:aload_0         
	//    8   13:invokevirtual   #558 <Method int getPaddingRight()>
	//    9   16:iadd            
	//   10   17:aload           4
	//   11   19:getfield        #638 <Field int android.view.ViewGroup$LayoutParams.width>
	//   12   22:invokestatic    #641 <Method int getChildMeasureSpec(int, int, int)>
	//   13   25:iconst_0        
	//   14   26:iconst_0        
	//   15   27:invokestatic    #646 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   16   30:invokevirtual   #649 <Method void View.measure(int, int)>
	//   17   33:return          
	}

	protected void measureChildWithMargins(View view, int i, int j, int k, int l)
	{
		android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #633 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #653 <Class android.view.ViewGroup$MarginLayoutParams>
	//    3    7:astore          6
		view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginlayoutparams.leftMargin + marginlayoutparams.rightMargin + j, marginlayoutparams.width), android.view.View.MeasureSpec.makeMeasureSpec(marginlayoutparams.topMargin + marginlayoutparams.bottomMargin, 0));
	//    4    9:aload_1         
	//    5   10:iload_2         
	//    6   11:aload_0         
	//    7   12:invokevirtual   #555 <Method int getPaddingLeft()>
	//    8   15:aload_0         
	//    9   16:invokevirtual   #558 <Method int getPaddingRight()>
	//   10   19:iadd            
	//   11   20:aload           6
	//   12   22:getfield        #656 <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//   13   25:iadd            
	//   14   26:aload           6
	//   15   28:getfield        #659 <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//   16   31:iadd            
	//   17   32:iload_3         
	//   18   33:iadd            
	//   19   34:aload           6
	//   20   36:getfield        #660 <Field int android.view.ViewGroup$MarginLayoutParams.width>
	//   21   39:invokestatic    #641 <Method int getChildMeasureSpec(int, int, int)>
	//   22   42:aload           6
	//   23   44:getfield        #663 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//   24   47:aload           6
	//   25   49:getfield        #666 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
	//   26   52:iadd            
	//   27   53:iconst_0        
	//   28   54:invokestatic    #646 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   29   57:invokevirtual   #649 <Method void View.measure(int, int)>
	//   30   60:return          
	}

	public void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #669 <Method void FrameLayout.onAttachedToWindow()>
		mIsLaidOut = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #101 <Field boolean mIsLaidOut>
	//    5    9:return          
	}

	public boolean onGenericMotionEvent(MotionEvent motionevent)
	{
		if((motionevent.getSource() & 2) != 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #674 <Method int MotionEvent.getSource()>
	//*   2    4:iconst_2        
	//*   3    5:iand            
	//*   4    6:ifeq            121
			switch(motionevent.getAction())
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #675 <Method int MotionEvent.getAction()>
			{
	//*   7   13:lookupswitch    1: default 32
	//	               8: 35
	//*   8   32:goto            121
			case 8: // '\b'
				if(!mIsBeingDragged)
	//*   9   35:aload_0         
	//*  10   36:getfield        #105 <Field boolean mIsBeingDragged>
	//*  11   39:ifne            121
				{
					float f = motionevent.getAxisValue(9);
	//   12   42:aload_1         
	//   13   43:bipush          9
	//   14   45:invokevirtual   #678 <Method float MotionEvent.getAxisValue(int)>
	//   15   48:fstore_2        
					if(f != 0.0F)
	//*  16   49:fload_2         
	//*  17   50:fconst_0        
	//*  18   51:fcmpl           
	//*  19   52:ifeq            121
					{
						int i = (int)(getVerticalScrollFactorCompat() * f);
	//   20   55:aload_0         
	//   21   56:invokespecial   #680 <Method float getVerticalScrollFactorCompat()>
	//   22   59:fload_2         
	//   23   60:fmul            
	//   24   61:f2i             
	//   25   62:istore_3        
						int j = getScrollRange();
	//   26   63:aload_0         
	//   27   64:invokevirtual   #242 <Method int getScrollRange()>
	//   28   67:istore          4
						int l = getScrollY();
	//   29   69:aload_0         
	//   30   70:invokevirtual   #239 <Method int getScrollY()>
	//   31   73:istore          6
						int k = l - i;
	//   32   75:iload           6
	//   33   77:iload_3         
	//   34   78:isub            
	//   35   79:istore          5
						if(k < 0)
	//*  36   81:iload           5
	//*  37   83:ifge            91
						{
							i = 0;
	//   38   86:iconst_0        
	//   39   87:istore_3        
						} else
	//*  40   88:goto            104
						{
							i = k;
	//   41   91:iload           5
	//   42   93:istore_3        
							if(k > j)
	//*  43   94:iload           5
	//*  44   96:iload           4
	//*  45   98:icmple          104
								i = j;
	//   46  101:iload           4
	//   47  103:istore_3        
						}
						if(i != l)
	//*  48  104:iload_3         
	//*  49  105:iload           6
	//*  50  107:icmpeq          121
						{
							super.scrollTo(getScrollX(), i);
	//   51  110:aload_0         
	//   52  111:aload_0         
	//   53  112:invokevirtual   #480 <Method int getScrollX()>
	//   54  115:iload_3         
	//   55  116:invokespecial   #683 <Method void FrameLayout.scrollTo(int, int)>
							return true;
	//   56  119:iconst_1        
	//   57  120:ireturn         
						}
					}
				}
				break;
			}
		return false;
	//   58  121:iconst_0        
	//   59  122:ireturn         
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		int i = motionevent.getAction();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #675 <Method int MotionEvent.getAction()>
	//    2    4:istore_2        
		if(i == 2 && mIsBeingDragged)
	//*   3    5:iload_2         
	//*   4    6:iconst_2        
	//*   5    7:icmpne          19
	//*   6   10:aload_0         
	//*   7   11:getfield        #105 <Field boolean mIsBeingDragged>
	//*   8   14:ifeq            19
			return true;
	//    9   17:iconst_1        
	//   10   18:ireturn         
		switch(i & 0xff)
	//*  11   19:iload_2         
	//*  12   20:sipush          255
	//*  13   23:iand            
		{
		case 4: // '\004'
		case 5: // '\005'
		default:
			break;

	//*  14   24:tableswitch     0 6: default 68
	//	               0 208
	//	               1 307
	//	               2 71
	//	               3 307
	//	               4 362
	//	               5 362
	//	               6 357
	//*  15   68:goto            362
		case 2: // '\002'
			int j = mActivePointerId;
	//   16   71:aload_0         
	//   17   72:getfield        #109 <Field int mActivePointerId>
	//   18   75:istore_2        
			if(j != -1)
	//*  19   76:iload_2         
	//*  20   77:iconst_m1       
	//*  21   78:icmpne          84
	//*  22   81:goto            362
			{
				int i1 = motionevent.findPointerIndex(j);
	//   23   84:aload_1         
	//   24   85:iload_2         
	//   25   86:invokevirtual   #687 <Method int MotionEvent.findPointerIndex(int)>
	//   26   89:istore_3        
				if(i1 == -1)
	//*  27   90:iload_3         
	//*  28   91:iconst_m1       
	//*  29   92:icmpne          130
				{
					Log.e("NestedScrollView", (new StringBuilder()).append("Invalid pointerId=").append(j).append(" in onInterceptTouchEvent").toString());
	//   30   95:ldc1            #37  <String "NestedScrollView">
	//   31   97:new             #689 <Class StringBuilder>
	//   32  100:dup             
	//   33  101:invokespecial   #690 <Method void StringBuilder()>
	//   34  104:ldc2            #692 <String "Invalid pointerId=">
	//   35  107:invokevirtual   #696 <Method StringBuilder StringBuilder.append(String)>
	//   36  110:iload_2         
	//   37  111:invokevirtual   #699 <Method StringBuilder StringBuilder.append(int)>
	//   38  114:ldc2            #701 <String " in onInterceptTouchEvent">
	//   39  117:invokevirtual   #696 <Method StringBuilder StringBuilder.append(String)>
	//   40  120:invokevirtual   #705 <Method String StringBuilder.toString()>
	//   41  123:invokestatic    #711 <Method int Log.e(String, String)>
	//   42  126:pop             
				} else
	//*  43  127:goto            362
				{
					int k = (int)motionevent.getY(i1);
	//   44  130:aload_1         
	//   45  131:iload_3         
	//   46  132:invokevirtual   #396 <Method float MotionEvent.getY(int)>
	//   47  135:f2i             
	//   48  136:istore_2        
					if(Math.abs(k - mLastMotionY) > mTouchSlop && (getNestedScrollAxes() & 2) == 0)
	//*  49  137:iload_2         
	//*  50  138:aload_0         
	//*  51  139:getfield        #398 <Field int mLastMotionY>
	//*  52  142:isub            
	//*  53  143:invokestatic    #714 <Method int Math.abs(int)>
	//*  54  146:aload_0         
	//*  55  147:getfield        #340 <Field int mTouchSlop>
	//*  56  150:icmple          362
	//*  57  153:aload_0         
	//*  58  154:invokevirtual   #715 <Method int getNestedScrollAxes()>
	//*  59  157:iconst_2        
	//*  60  158:iand            
	//*  61  159:ifne            362
					{
						mIsBeingDragged = true;
	//   62  162:aload_0         
	//   63  163:iconst_1        
	//   64  164:putfield        #105 <Field boolean mIsBeingDragged>
						mLastMotionY = k;
	//   65  167:aload_0         
	//   66  168:iload_2         
	//   67  169:putfield        #398 <Field int mLastMotionY>
						initVelocityTrackerIfNotExists();
	//   68  172:aload_0         
	//   69  173:invokespecial   #717 <Method void initVelocityTrackerIfNotExists()>
						mVelocityTracker.addMovement(motionevent);
	//   70  176:aload_0         
	//   71  177:getfield        #306 <Field VelocityTracker mVelocityTracker>
	//   72  180:aload_1         
	//   73  181:invokevirtual   #720 <Method void VelocityTracker.addMovement(MotionEvent)>
						mNestedYOffset = 0;
	//   74  184:aload_0         
	//   75  185:iconst_0        
	//   76  186:putfield        #722 <Field int mNestedYOffset>
						motionevent = ((MotionEvent) (getParent()));
	//   77  189:aload_0         
	//   78  190:invokevirtual   #723 <Method ViewParent getParent()>
	//   79  193:astore_1        
						if(motionevent != null)
	//*  80  194:aload_1         
	//*  81  195:ifnull          205
							((ViewParent) (motionevent)).requestDisallowInterceptTouchEvent(true);
	//   82  198:aload_1         
	//   83  199:iconst_1        
	//   84  200:invokeinterface #728 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
					}
				}
			}
			break;
	//   85  205:goto            362

		case 0: // '\0'
			int l = (int)motionevent.getY();
	//   86  208:aload_1         
	//   87  209:invokevirtual   #730 <Method float MotionEvent.getY()>
	//   88  212:f2i             
	//   89  213:istore_2        
			if(!inChild((int)motionevent.getX(), l))
	//*  90  214:aload_0         
	//*  91  215:aload_1         
	//*  92  216:invokevirtual   #733 <Method float MotionEvent.getX()>
	//*  93  219:f2i             
	//*  94  220:iload_2         
	//*  95  221:invokespecial   #735 <Method boolean inChild(int, int)>
	//*  96  224:ifne            239
			{
				mIsBeingDragged = false;
	//   97  227:aload_0         
	//   98  228:iconst_0        
	//   99  229:putfield        #105 <Field boolean mIsBeingDragged>
				recycleVelocityTracker();
	//  100  232:aload_0         
	//  101  233:invokespecial   #192 <Method void recycleVelocityTracker()>
				break;
	//  102  236:goto            362
			}
			mLastMotionY = l;
	//  103  239:aload_0         
	//  104  240:iload_2         
	//  105  241:putfield        #398 <Field int mLastMotionY>
			mActivePointerId = motionevent.getPointerId(0);
	//  106  244:aload_0         
	//  107  245:aload_1         
	//  108  246:iconst_0        
	//  109  247:invokevirtual   #392 <Method int MotionEvent.getPointerId(int)>
	//  110  250:putfield        #109 <Field int mActivePointerId>
			initOrResetVelocityTracker();
	//  111  253:aload_0         
	//  112  254:invokespecial   #737 <Method void initOrResetVelocityTracker()>
			mVelocityTracker.addMovement(motionevent);
	//  113  257:aload_0         
	//  114  258:getfield        #306 <Field VelocityTracker mVelocityTracker>
	//  115  261:aload_1         
	//  116  262:invokevirtual   #720 <Method void VelocityTracker.addMovement(MotionEvent)>
			mScroller.computeScrollOffset();
	//  117  265:aload_0         
	//  118  266:getfield        #320 <Field OverScroller mScroller>
	//  119  269:invokevirtual   #477 <Method boolean OverScroller.computeScrollOffset()>
	//  120  272:pop             
			boolean flag;
			if(!mScroller.isFinished())
	//* 121  273:aload_0         
	//* 122  274:getfield        #320 <Field OverScroller mScroller>
	//* 123  277:invokevirtual   #738 <Method boolean OverScroller.isFinished()>
	//* 124  280:ifne            289
				flag = true;
	//  125  283:iconst_1        
	//  126  284:istore          4
			else
	//* 127  286:goto            292
				flag = false;
	//  128  289:iconst_0        
	//  129  290:istore          4
			mIsBeingDragged = flag;
	//  130  292:aload_0         
	//  131  293:iload           4
	//  132  295:putfield        #105 <Field boolean mIsBeingDragged>
			startNestedScroll(2);
	//  133  298:aload_0         
	//  134  299:iconst_2        
	//  135  300:invokevirtual   #741 <Method boolean startNestedScroll(int)>
	//  136  303:pop             
			break;
	//  137  304:goto            362

		case 1: // '\001'
		case 3: // '\003'
			mIsBeingDragged = false;
	//  138  307:aload_0         
	//  139  308:iconst_0        
	//  140  309:putfield        #105 <Field boolean mIsBeingDragged>
			mActivePointerId = -1;
	//  141  312:aload_0         
	//  142  313:iconst_m1       
	//  143  314:putfield        #109 <Field int mActivePointerId>
			recycleVelocityTracker();
	//  144  317:aload_0         
	//  145  318:invokespecial   #192 <Method void recycleVelocityTracker()>
			if(mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()))
	//* 146  321:aload_0         
	//* 147  322:getfield        #320 <Field OverScroller mScroller>
	//* 148  325:aload_0         
	//* 149  326:invokevirtual   #480 <Method int getScrollX()>
	//* 150  329:aload_0         
	//* 151  330:invokevirtual   #239 <Method int getScrollY()>
	//* 152  333:iconst_0        
	//* 153  334:iconst_0        
	//* 154  335:iconst_0        
	//* 155  336:aload_0         
	//* 156  337:invokevirtual   #242 <Method int getScrollRange()>
	//* 157  340:invokevirtual   #745 <Method boolean OverScroller.springBack(int, int, int, int, int, int)>
	//* 158  343:ifeq            350
				ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//  159  346:aload_0         
	//  160  347:invokestatic    #571 <Method void ViewCompat.postInvalidateOnAnimation(View)>
			stopNestedScroll();
	//  161  350:aload_0         
	//  162  351:invokevirtual   #195 <Method void stopNestedScroll()>
			break;

	//* 163  354:goto            362
		case 6: // '\006'
			onSecondaryPointerUp(motionevent);
	//  164  357:aload_0         
	//  165  358:aload_1         
	//  166  359:invokespecial   #747 <Method void onSecondaryPointerUp(MotionEvent)>
			break;
		}
		return mIsBeingDragged;
	//  167  362:aload_0         
	//  168  363:getfield        #105 <Field boolean mIsBeingDragged>
	//  169  366:ireturn         
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
	//    6    8:invokespecial   #751 <Method void FrameLayout.onLayout(boolean, int, int, int, int)>
		mIsLayoutDirty = false;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #99  <Field boolean mIsLayoutDirty>
		if(mChildToScrollTo != null && isViewDescendantOf(mChildToScrollTo, ((View) (this))))
	//*  10   16:aload_0         
	//*  11   17:getfield        #103 <Field View mChildToScrollTo>
	//*  12   20:ifnull          42
	//*  13   23:aload_0         
	//*  14   24:getfield        #103 <Field View mChildToScrollTo>
	//*  15   27:aload_0         
	//*  16   28:invokestatic    #367 <Method boolean isViewDescendantOf(View, View)>
	//*  17   31:ifeq            42
			scrollToChild(mChildToScrollTo);
	//   18   34:aload_0         
	//   19   35:aload_0         
	//   20   36:getfield        #103 <Field View mChildToScrollTo>
	//   21   39:invokespecial   #753 <Method void scrollToChild(View)>
		mChildToScrollTo = null;
	//   22   42:aload_0         
	//   23   43:aconst_null     
	//   24   44:putfield        #103 <Field View mChildToScrollTo>
		if(!mIsLaidOut)
	//*  25   47:aload_0         
	//*  26   48:getfield        #101 <Field boolean mIsLaidOut>
	//*  27   51:ifne            159
		{
			if(mSavedState != null)
	//*  28   54:aload_0         
	//*  29   55:getfield        #755 <Field NestedScrollView$SavedState mSavedState>
	//*  30   58:ifnull          81
			{
				scrollTo(getScrollX(), mSavedState.scrollPosition);
	//   31   61:aload_0         
	//   32   62:aload_0         
	//   33   63:invokevirtual   #480 <Method int getScrollX()>
	//   34   66:aload_0         
	//   35   67:getfield        #755 <Field NestedScrollView$SavedState mSavedState>
	//   36   70:getfield        #758 <Field int NestedScrollView$SavedState.scrollPosition>
	//   37   73:invokevirtual   #759 <Method void scrollTo(int, int)>
				mSavedState = null;
	//   38   76:aload_0         
	//   39   77:aconst_null     
	//   40   78:putfield        #755 <Field NestedScrollView$SavedState mSavedState>
			}
			if(getChildCount() > 0)
	//*  41   81:aload_0         
	//*  42   82:invokevirtual   #297 <Method int getChildCount()>
	//*  43   85:ifle            100
				i = getChildAt(0).getMeasuredHeight();
	//   44   88:aload_0         
	//   45   89:iconst_0        
	//   46   90:invokevirtual   #164 <Method View getChildAt(int)>
	//   47   93:invokevirtual   #762 <Method int View.getMeasuredHeight()>
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
	//   58  109:invokevirtual   #177 <Method int getPaddingBottom()>
	//   59  112:isub            
	//   60  113:aload_0         
	//   61  114:invokevirtual   #174 <Method int getPaddingTop()>
	//   62  117:isub            
	//   63  118:isub            
	//   64  119:invokestatic    #513 <Method int Math.max(int, int)>
	//   65  122:istore_2        
			if(getScrollY() > i)
	//*  66  123:aload_0         
	//*  67  124:invokevirtual   #239 <Method int getScrollY()>
	//*  68  127:iload_2         
	//*  69  128:icmple          143
				scrollTo(getScrollX(), i);
	//   70  131:aload_0         
	//   71  132:aload_0         
	//   72  133:invokevirtual   #480 <Method int getScrollX()>
	//   73  136:iload_2         
	//   74  137:invokevirtual   #759 <Method void scrollTo(int, int)>
			else
	//*  75  140:goto            159
			if(getScrollY() < 0)
	//*  76  143:aload_0         
	//*  77  144:invokevirtual   #239 <Method int getScrollY()>
	//*  78  147:ifge            159
				scrollTo(getScrollX(), 0);
	//   79  150:aload_0         
	//   80  151:aload_0         
	//   81  152:invokevirtual   #480 <Method int getScrollX()>
	//   82  155:iconst_0        
	//   83  156:invokevirtual   #759 <Method void scrollTo(int, int)>
		}
		scrollTo(getScrollX(), getScrollY());
	//   84  159:aload_0         
	//   85  160:aload_0         
	//   86  161:invokevirtual   #480 <Method int getScrollX()>
	//   87  164:aload_0         
	//   88  165:invokevirtual   #239 <Method int getScrollY()>
	//   89  168:invokevirtual   #759 <Method void scrollTo(int, int)>
		mIsLaidOut = true;
	//   90  171:aload_0         
	//   91  172:iconst_1        
	//   92  173:putfield        #101 <Field boolean mIsLaidOut>
	//   93  176:return          
	}

	protected void onMeasure(int i, int j)
	{
		super.onMeasure(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #765 <Method void FrameLayout.onMeasure(int, int)>
		if(!mFillViewport)
	//*   4    6:aload_0         
	//*   5    7:getfield        #623 <Field boolean mFillViewport>
	//*   6   10:ifne            14
			return;
	//    7   13:return          
		if(android.view.View.MeasureSpec.getMode(j) == 0)
	//*   8   14:iload_2         
	//*   9   15:invokestatic    #768 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*  10   18:ifne            22
			return;
	//   11   21:return          
		if(getChildCount() > 0)
	//*  12   22:aload_0         
	//*  13   23:invokevirtual   #297 <Method int getChildCount()>
	//*  14   26:ifle            96
		{
			View view = getChildAt(0);
	//   15   29:aload_0         
	//   16   30:iconst_0        
	//   17   31:invokevirtual   #164 <Method View getChildAt(int)>
	//   18   34:astore_3        
			j = getMeasuredHeight();
	//   19   35:aload_0         
	//   20   36:invokevirtual   #769 <Method int getMeasuredHeight()>
	//   21   39:istore_2        
			if(view.getMeasuredHeight() < j)
	//*  22   40:aload_3         
	//*  23   41:invokevirtual   #762 <Method int View.getMeasuredHeight()>
	//*  24   44:iload_2         
	//*  25   45:icmpge          96
			{
				android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
	//   26   48:aload_3         
	//   27   49:invokevirtual   #633 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   28   52:checkcast       #771 <Class android.widget.FrameLayout$LayoutParams>
	//   29   55:astore          4
				view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), layoutparams.width), android.view.View.MeasureSpec.makeMeasureSpec(j - getPaddingTop() - getPaddingBottom(), 0x40000000));
	//   30   57:aload_3         
	//   31   58:iload_1         
	//   32   59:aload_0         
	//   33   60:invokevirtual   #555 <Method int getPaddingLeft()>
	//   34   63:aload_0         
	//   35   64:invokevirtual   #558 <Method int getPaddingRight()>
	//   36   67:iadd            
	//   37   68:aload           4
	//   38   70:getfield        #772 <Field int android.widget.FrameLayout$LayoutParams.width>
	//   39   73:invokestatic    #641 <Method int getChildMeasureSpec(int, int, int)>
	//   40   76:iload_2         
	//   41   77:aload_0         
	//   42   78:invokevirtual   #174 <Method int getPaddingTop()>
	//   43   81:isub            
	//   44   82:aload_0         
	//   45   83:invokevirtual   #177 <Method int getPaddingBottom()>
	//   46   86:isub            
	//   47   87:ldc2            #773 <Int 0x40000000>
	//   48   90:invokestatic    #646 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   49   93:invokevirtual   #649 <Method void View.measure(int, int)>
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
	//    5    8:invokespecial   #777 <Method void flingWithNestedDispatch(int)>
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
	//    3    3:invokevirtual   #246 <Method boolean dispatchNestedPreFling(float, float)>
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
	//    5    6:invokevirtual   #782 <Method boolean dispatchNestedPreScroll(int, int, int[], int[])>
	//    6    9:pop             
	//    7   10:return          
	}

	public void onNestedScroll(View view, int i, int j, int k, int l)
	{
		i = getScrollY();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #239 <Method int getScrollY()>
	//    2    4:istore_2        
		scrollBy(0, l);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:iload           5
	//    6    9:invokevirtual   #188 <Method void scrollBy(int, int)>
		i = getScrollY() - i;
	//    7   12:aload_0         
	//    8   13:invokevirtual   #239 <Method int getScrollY()>
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
	//   20   28:invokevirtual   #784 <Method boolean dispatchNestedScroll(int, int, int, int, int[])>
	//   21   31:pop             
	//   22   32:return          
	}

	public void onNestedScrollAccepted(View view, View view1, int i)
	{
		mParentHelper.onNestedScrollAccepted(view, view1, i);
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field NestedScrollingParentHelper mParentHelper>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #788 <Method void NestedScrollingParentHelper.onNestedScrollAccepted(View, View, int)>
		startNestedScroll(2);
	//    6   10:aload_0         
	//    7   11:iconst_2        
	//    8   12:invokevirtual   #741 <Method boolean startNestedScroll(int)>
	//    9   15:pop             
	//   10   16:return          
	}

	protected void onOverScrolled(int i, int j, boolean flag, boolean flag1)
	{
		super.scrollTo(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #683 <Method void FrameLayout.scrollTo(int, int)>
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
	//   15   26:invokestatic    #441 <Method FocusFinder FocusFinder.getInstance()>
	//   16   29:aload_0         
	//   17   30:aconst_null     
	//   18   31:iload_3         
	//   19   32:invokevirtual   #445 <Method View FocusFinder.findNextFocus(ViewGroup, View, int)>
	//   20   35:astore          4
		else
	//*  21   37:goto            51
			view = FocusFinder.getInstance().findNextFocusFromRect(((ViewGroup) (this)), rect, j);
	//   22   40:invokestatic    #441 <Method FocusFinder FocusFinder.getInstance()>
	//   23   43:aload_0         
	//   24   44:aload_2         
	//   25   45:iload_3         
	//   26   46:invokevirtual   #796 <Method View FocusFinder.findNextFocusFromRect(ViewGroup, Rect, int)>
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
	//*  34   61:invokespecial   #453 <Method boolean isOffScreen(View)>
	//*  35   64:ifeq            69
			return false;
	//   36   67:iconst_0        
	//   37   68:ireturn         
		else
			return view.requestFocus(j, rect);
	//   38   69:aload           4
	//   39   71:iload_3         
	//   40   72:aload_2         
	//   41   73:invokevirtual   #798 <Method boolean View.requestFocus(int, Rect)>
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
	//    5    9:invokespecial   #802 <Method void FrameLayout.onRestoreInstanceState(Parcelable)>
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
	//   12   20:invokevirtual   #806 <Method Parcelable NestedScrollView$SavedState.getSuperState()>
	//   13   23:invokespecial   #802 <Method void FrameLayout.onRestoreInstanceState(Parcelable)>
			mSavedState = ((SavedState) (parcelable));
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:putfield        #755 <Field NestedScrollView$SavedState mSavedState>
			requestLayout();
	//   17   31:aload_0         
	//   18   32:invokevirtual   #809 <Method void requestLayout()>
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
	//    3    5:invokespecial   #812 <Method Parcelable FrameLayout.onSaveInstanceState()>
	//    4    8:invokespecial   #814 <Method void NestedScrollView$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.scrollPosition = getScrollY();
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #239 <Method int getScrollY()>
	//    9   17:putfield        #758 <Field int NestedScrollView$SavedState.scrollPosition>
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
	//    5    6:invokespecial   #818 <Method void FrameLayout.onScrollChanged(int, int, int, int)>
		if(mOnScrollChangeListener != null)
	//*   6    9:aload_0         
	//*   7   10:getfield        #820 <Field NestedScrollView$OnScrollChangeListener mOnScrollChangeListener>
	//*   8   13:ifnull          31
			mOnScrollChangeListener.onScrollChange(this, i, j, k, l);
	//    9   16:aload_0         
	//   10   17:getfield        #820 <Field NestedScrollView$OnScrollChangeListener mOnScrollChangeListener>
	//   11   20:aload_0         
	//   12   21:iload_1         
	//   13   22:iload_2         
	//   14   23:iload_3         
	//   15   24:iload           4
	//   16   26:invokeinterface #824 <Method void NestedScrollView$OnScrollChangeListener.onScrollChange(NestedScrollView, int, int, int, int)>
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
	//    5    6:invokespecial   #827 <Method void FrameLayout.onSizeChanged(int, int, int, int)>
		View view = findFocus();
	//    6    9:aload_0         
	//    7   10:invokevirtual   #409 <Method View findFocus()>
	//    8   13:astore          5
		if(view == null || this == view)
	//*   9   15:aload           5
	//*  10   17:ifnull          26
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
	//*  19   33:invokespecial   #357 <Method boolean isWithinDeltaOfScreen(View, int, int)>
	//*  20   36:ifeq            70
		{
			view.getDrawingRect(mTempRect);
	//   21   39:aload           5
	//   22   41:aload_0         
	//   23   42:getfield        #97  <Field Rect mTempRect>
	//   24   45:invokevirtual   #371 <Method void View.getDrawingRect(Rect)>
			offsetDescendantRectToMyCoords(view, mTempRect);
	//   25   48:aload_0         
	//   26   49:aload           5
	//   27   51:aload_0         
	//   28   52:getfield        #97  <Field Rect mTempRect>
	//   29   55:invokevirtual   #375 <Method void offsetDescendantRectToMyCoords(View, Rect)>
			doScrollY(computeScrollDeltaToGetChildRectOnScreen(mTempRect));
	//   30   58:aload_0         
	//   31   59:aload_0         
	//   32   60:aload_0         
	//   33   61:getfield        #97  <Field Rect mTempRect>
	//   34   64:invokevirtual   #418 <Method int computeScrollDeltaToGetChildRectOnScreen(Rect)>
	//   35   67:invokespecial   #405 <Method void doScrollY(int)>
		}
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
	//    1    1:getfield        #142 <Field NestedScrollingParentHelper mParentHelper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #832 <Method void NestedScrollingParentHelper.onStopNestedScroll(View)>
		stopNestedScroll();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #195 <Method void stopNestedScroll()>
	//    6   12:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		initVelocityTrackerIfNotExists();
	//    0    0:aload_0         
	//    1    1:invokespecial   #717 <Method void initVelocityTrackerIfNotExists()>
		MotionEvent motionevent1 = MotionEvent.obtain(motionevent);
	//    2    4:aload_1         
	//    3    5:invokestatic    #836 <Method MotionEvent MotionEvent.obtain(MotionEvent)>
	//    4    8:astore          9
		int i = motionevent.getActionMasked();
	//    5   10:aload_1         
	//    6   11:invokevirtual   #839 <Method int MotionEvent.getActionMasked()>
	//    7   14:istore_2        
		if(i == 0)
	//*   8   15:iload_2         
	//*   9   16:ifne            24
			mNestedYOffset = 0;
	//   10   19:aload_0         
	//   11   20:iconst_0        
	//   12   21:putfield        #722 <Field int mNestedYOffset>
		motionevent1.offsetLocation(0.0F, mNestedYOffset);
	//   13   24:aload           9
	//   14   26:fconst_0        
	//   15   27:aload_0         
	//   16   28:getfield        #722 <Field int mNestedYOffset>
	//   17   31:i2f             
	//   18   32:invokevirtual   #842 <Method void MotionEvent.offsetLocation(float, float)>
		switch(i)
	//*  19   35:iload_2         
		{
	//*  20   36:tableswitch     0 6: default 80
	//	               0 83
	//	               1 695
	//	               2 185
	//	               3 790
	//	               4 894
	//	               5 845
	//	               6 872
	//*  21   80:goto            894
		case 0: // '\0'
			if(getChildCount() == 0)
	//*  22   83:aload_0         
	//*  23   84:invokevirtual   #297 <Method int getChildCount()>
	//*  24   87:ifne            92
				return false;
	//   25   90:iconst_0        
	//   26   91:ireturn         
			boolean flag1;
			if(!mScroller.isFinished())
	//*  27   92:aload_0         
	//*  28   93:getfield        #320 <Field OverScroller mScroller>
	//*  29   96:invokevirtual   #738 <Method boolean OverScroller.isFinished()>
	//*  30   99:ifne            108
				flag1 = true;
	//   31  102:iconst_1        
	//   32  103:istore          8
			else
	//*  33  105:goto            111
				flag1 = false;
	//   34  108:iconst_0        
	//   35  109:istore          8
			mIsBeingDragged = flag1;
	//   36  111:aload_0         
	//   37  112:iload           8
	//   38  114:putfield        #105 <Field boolean mIsBeingDragged>
			if(flag1)
	//*  39  117:iload           8
	//*  40  119:ifeq            141
			{
				ViewParent viewparent = getParent();
	//   41  122:aload_0         
	//   42  123:invokevirtual   #723 <Method ViewParent getParent()>
	//   43  126:astore          10
				if(viewparent != null)
	//*  44  128:aload           10
	//*  45  130:ifnull          141
					viewparent.requestDisallowInterceptTouchEvent(true);
	//   46  133:aload           10
	//   47  135:iconst_1        
	//   48  136:invokeinterface #728 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
			}
			if(!mScroller.isFinished())
	//*  49  141:aload_0         
	//*  50  142:getfield        #320 <Field OverScroller mScroller>
	//*  51  145:invokevirtual   #738 <Method boolean OverScroller.isFinished()>
	//*  52  148:ifne            158
				mScroller.abortAnimation();
	//   53  151:aload_0         
	//   54  152:getfield        #320 <Field OverScroller mScroller>
	//   55  155:invokevirtual   #845 <Method void OverScroller.abortAnimation()>
			mLastMotionY = (int)motionevent.getY();
	//   56  158:aload_0         
	//   57  159:aload_1         
	//   58  160:invokevirtual   #730 <Method float MotionEvent.getY()>
	//   59  163:f2i             
	//   60  164:putfield        #398 <Field int mLastMotionY>
			mActivePointerId = motionevent.getPointerId(0);
	//   61  167:aload_0         
	//   62  168:aload_1         
	//   63  169:iconst_0        
	//   64  170:invokevirtual   #392 <Method int MotionEvent.getPointerId(int)>
	//   65  173:putfield        #109 <Field int mActivePointerId>
			startNestedScroll(2);
	//   66  176:aload_0         
	//   67  177:iconst_2        
	//   68  178:invokevirtual   #741 <Method boolean startNestedScroll(int)>
	//   69  181:pop             
			break;

	//*  70  182:goto            894
		case 2: // '\002'
			int l1 = motionevent.findPointerIndex(mActivePointerId);
	//   71  185:aload_1         
	//   72  186:aload_0         
	//   73  187:getfield        #109 <Field int mActivePointerId>
	//   74  190:invokevirtual   #687 <Method int MotionEvent.findPointerIndex(int)>
	//   75  193:istore          4
			if(l1 == -1)
	//*  76  195:iload           4
	//*  77  197:iconst_m1       
	//*  78  198:icmpne          239
			{
				Log.e("NestedScrollView", (new StringBuilder()).append("Invalid pointerId=").append(mActivePointerId).append(" in onTouchEvent").toString());
	//   79  201:ldc1            #37  <String "NestedScrollView">
	//   80  203:new             #689 <Class StringBuilder>
	//   81  206:dup             
	//   82  207:invokespecial   #690 <Method void StringBuilder()>
	//   83  210:ldc2            #692 <String "Invalid pointerId=">
	//   84  213:invokevirtual   #696 <Method StringBuilder StringBuilder.append(String)>
	//   85  216:aload_0         
	//   86  217:getfield        #109 <Field int mActivePointerId>
	//   87  220:invokevirtual   #699 <Method StringBuilder StringBuilder.append(int)>
	//   88  223:ldc2            #847 <String " in onTouchEvent">
	//   89  226:invokevirtual   #696 <Method StringBuilder StringBuilder.append(String)>
	//   90  229:invokevirtual   #705 <Method String StringBuilder.toString()>
	//   91  232:invokestatic    #711 <Method int Log.e(String, String)>
	//   92  235:pop             
			} else
	//*  93  236:goto            894
			{
				int i2 = (int)motionevent.getY(l1);
	//   94  239:aload_1         
	//   95  240:iload           4
	//   96  242:invokevirtual   #396 <Method float MotionEvent.getY(int)>
	//   97  245:f2i             
	//   98  246:istore          5
				int j = mLastMotionY - i2;
	//   99  248:aload_0         
	//  100  249:getfield        #398 <Field int mLastMotionY>
	//  101  252:iload           5
	//  102  254:isub            
	//  103  255:istore_2        
				int i1 = j;
	//  104  256:iload_2         
	//  105  257:istore_3        
				if(dispatchNestedPreScroll(0, j, mScrollConsumed, mScrollOffset))
	//* 106  258:aload_0         
	//* 107  259:iconst_0        
	//* 108  260:iload_2         
	//* 109  261:aload_0         
	//* 110  262:getfield        #113 <Field int[] mScrollConsumed>
	//* 111  265:aload_0         
	//* 112  266:getfield        #111 <Field int[] mScrollOffset>
	//* 113  269:invokevirtual   #782 <Method boolean dispatchNestedPreScroll(int, int, int[], int[])>
	//* 114  272:ifeq            312
				{
					i1 = j - mScrollConsumed[1];
	//  115  275:iload_2         
	//  116  276:aload_0         
	//  117  277:getfield        #113 <Field int[] mScrollConsumed>
	//  118  280:iconst_1        
	//  119  281:iaload          
	//  120  282:isub            
	//  121  283:istore_3        
					motionevent1.offsetLocation(0.0F, mScrollOffset[1]);
	//  122  284:aload           9
	//  123  286:fconst_0        
	//  124  287:aload_0         
	//  125  288:getfield        #111 <Field int[] mScrollOffset>
	//  126  291:iconst_1        
	//  127  292:iaload          
	//  128  293:i2f             
	//  129  294:invokevirtual   #842 <Method void MotionEvent.offsetLocation(float, float)>
					mNestedYOffset = mNestedYOffset + mScrollOffset[1];
	//  130  297:aload_0         
	//  131  298:aload_0         
	//  132  299:getfield        #722 <Field int mNestedYOffset>
	//  133  302:aload_0         
	//  134  303:getfield        #111 <Field int[] mScrollOffset>
	//  135  306:iconst_1        
	//  136  307:iaload          
	//  137  308:iadd            
	//  138  309:putfield        #722 <Field int mNestedYOffset>
				}
				j = i1;
	//  139  312:iload_3         
	//  140  313:istore_2        
				if(!mIsBeingDragged)
	//* 141  314:aload_0         
	//* 142  315:getfield        #105 <Field boolean mIsBeingDragged>
	//* 143  318:ifne            379
				{
					j = i1;
	//  144  321:iload_3         
	//  145  322:istore_2        
					if(Math.abs(i1) > mTouchSlop)
	//* 146  323:iload_3         
	//* 147  324:invokestatic    #714 <Method int Math.abs(int)>
	//* 148  327:aload_0         
	//* 149  328:getfield        #340 <Field int mTouchSlop>
	//* 150  331:icmple          379
					{
						ViewParent viewparent1 = getParent();
	//  151  334:aload_0         
	//  152  335:invokevirtual   #723 <Method ViewParent getParent()>
	//  153  338:astore          10
						if(viewparent1 != null)
	//* 154  340:aload           10
	//* 155  342:ifnull          353
							viewparent1.requestDisallowInterceptTouchEvent(true);
	//  156  345:aload           10
	//  157  347:iconst_1        
	//  158  348:invokeinterface #728 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
						mIsBeingDragged = true;
	//  159  353:aload_0         
	//  160  354:iconst_1        
	//  161  355:putfield        #105 <Field boolean mIsBeingDragged>
						if(i1 > 0)
	//* 162  358:iload_3         
	//* 163  359:ifle            372
							j = i1 - mTouchSlop;
	//  164  362:iload_3         
	//  165  363:aload_0         
	//  166  364:getfield        #340 <Field int mTouchSlop>
	//  167  367:isub            
	//  168  368:istore_2        
						else
	//* 169  369:goto            379
							j = i1 + mTouchSlop;
	//  170  372:iload_3         
	//  171  373:aload_0         
	//  172  374:getfield        #340 <Field int mTouchSlop>
	//  173  377:iadd            
	//  174  378:istore_2        
					}
				}
				if(mIsBeingDragged)
	//* 175  379:aload_0         
	//* 176  380:getfield        #105 <Field boolean mIsBeingDragged>
	//* 177  383:ifeq            894
				{
					mLastMotionY = i2 - mScrollOffset[1];
	//  178  386:aload_0         
	//  179  387:iload           5
	//  180  389:aload_0         
	//  181  390:getfield        #111 <Field int[] mScrollOffset>
	//  182  393:iconst_1        
	//  183  394:iaload          
	//  184  395:isub            
	//  185  396:putfield        #398 <Field int mLastMotionY>
					int j2 = getScrollY();
	//  186  399:aload_0         
	//  187  400:invokevirtual   #239 <Method int getScrollY()>
	//  188  403:istore          6
					i2 = getScrollRange();
	//  189  405:aload_0         
	//  190  406:invokevirtual   #242 <Method int getScrollRange()>
	//  191  409:istore          5
					int j1 = getOverScrollMode();
	//  192  411:aload_0         
	//  193  412:invokevirtual   #208 <Method int getOverScrollMode()>
	//  194  415:istore_3        
					boolean flag;
					if(j1 == 0 || j1 == 1 && i2 > 0)
	//* 195  416:iload_3         
	//* 196  417:ifeq            430
	//* 197  420:iload_3         
	//* 198  421:iconst_1        
	//* 199  422:icmpne          435
	//* 200  425:iload           5
	//* 201  427:ifle            435
						flag = true;
	//  202  430:iconst_1        
	//  203  431:istore_3        
					else
	//* 204  432:goto            437
						flag = false;
	//  205  435:iconst_0        
	//  206  436:istore_3        
					if(overScrollByCompat(0, j, 0, getScrollY(), 0, i2, 0, 0, true) && !hasNestedScrollingParent())
	//* 207  437:aload_0         
	//* 208  438:iconst_0        
	//* 209  439:iload_2         
	//* 210  440:iconst_0        
	//* 211  441:aload_0         
	//* 212  442:invokevirtual   #239 <Method int getScrollY()>
	//* 213  445:iconst_0        
	//* 214  446:iload           5
	//* 215  448:iconst_0        
	//* 216  449:iconst_0        
	//* 217  450:iconst_1        
	//* 218  451:invokevirtual   #490 <Method boolean overScrollByCompat(int, int, int, int, int, int, int, int, boolean)>
	//* 219  454:ifeq            471
	//* 220  457:aload_0         
	//* 221  458:invokevirtual   #848 <Method boolean hasNestedScrollingParent()>
	//* 222  461:ifne            471
						mVelocityTracker.clear();
	//  223  464:aload_0         
	//  224  465:getfield        #306 <Field VelocityTracker mVelocityTracker>
	//  225  468:invokevirtual   #315 <Method void VelocityTracker.clear()>
					int k2 = getScrollY() - j2;
	//  226  471:aload_0         
	//  227  472:invokevirtual   #239 <Method int getScrollY()>
	//  228  475:iload           6
	//  229  477:isub            
	//  230  478:istore          7
					if(dispatchNestedScroll(0, k2, 0, j - k2, mScrollOffset))
	//* 231  480:aload_0         
	//* 232  481:iconst_0        
	//* 233  482:iload           7
	//* 234  484:iconst_0        
	//* 235  485:iload_2         
	//* 236  486:iload           7
	//* 237  488:isub            
	//* 238  489:aload_0         
	//* 239  490:getfield        #111 <Field int[] mScrollOffset>
	//* 240  493:invokevirtual   #784 <Method boolean dispatchNestedScroll(int, int, int, int, int[])>
	//* 241  496:ifeq            545
					{
						mLastMotionY = mLastMotionY - mScrollOffset[1];
	//  242  499:aload_0         
	//  243  500:aload_0         
	//  244  501:getfield        #398 <Field int mLastMotionY>
	//  245  504:aload_0         
	//  246  505:getfield        #111 <Field int[] mScrollOffset>
	//  247  508:iconst_1        
	//  248  509:iaload          
	//  249  510:isub            
	//  250  511:putfield        #398 <Field int mLastMotionY>
						motionevent1.offsetLocation(0.0F, mScrollOffset[1]);
	//  251  514:aload           9
	//  252  516:fconst_0        
	//  253  517:aload_0         
	//  254  518:getfield        #111 <Field int[] mScrollOffset>
	//  255  521:iconst_1        
	//  256  522:iaload          
	//  257  523:i2f             
	//  258  524:invokevirtual   #842 <Method void MotionEvent.offsetLocation(float, float)>
						mNestedYOffset = mNestedYOffset + mScrollOffset[1];
	//  259  527:aload_0         
	//  260  528:aload_0         
	//  261  529:getfield        #722 <Field int mNestedYOffset>
	//  262  532:aload_0         
	//  263  533:getfield        #111 <Field int[] mScrollOffset>
	//  264  536:iconst_1        
	//  265  537:iaload          
	//  266  538:iadd            
	//  267  539:putfield        #722 <Field int mNestedYOffset>
					} else
	//* 268  542:goto            692
					if(flag)
	//* 269  545:iload_3         
	//* 270  546:ifeq            692
					{
						ensureGlows();
	//  271  549:aload_0         
	//  272  550:invokespecial   #492 <Method void ensureGlows()>
						int k1 = j2 + j;
	//  273  553:iload           6
	//  274  555:iload_2         
	//  275  556:iadd            
	//  276  557:istore_3        
						if(k1 < 0)
	//* 277  558:iload_3         
	//* 278  559:ifge            609
						{
							EdgeEffectCompat.onPull(mEdgeGlowTop, (float)j / (float)getHeight(), motionevent.getX(l1) / (float)getWidth());
	//  279  562:aload_0         
	//  280  563:getfield        #197 <Field EdgeEffect mEdgeGlowTop>
	//  281  566:iload_2         
	//  282  567:i2f             
	//  283  568:aload_0         
	//  284  569:invokevirtual   #171 <Method int getHeight()>
	//  285  572:i2f             
	//  286  573:fdiv            
	//  287  574:aload_1         
	//  288  575:iload           4
	//  289  577:invokevirtual   #850 <Method float MotionEvent.getX(int)>
	//  290  580:aload_0         
	//  291  581:invokevirtual   #552 <Method int getWidth()>
	//  292  584:i2f             
	//  293  585:fdiv            
	//  294  586:invokestatic    #856 <Method void EdgeEffectCompat.onPull(EdgeEffect, float, float)>
							if(!mEdgeGlowBottom.isFinished())
	//* 295  589:aload_0         
	//* 296  590:getfield        #204 <Field EdgeEffect mEdgeGlowBottom>
	//* 297  593:invokevirtual   #544 <Method boolean EdgeEffect.isFinished()>
	//* 298  596:ifne            661
								mEdgeGlowBottom.onRelease();
	//  299  599:aload_0         
	//  300  600:getfield        #204 <Field EdgeEffect mEdgeGlowBottom>
	//  301  603:invokevirtual   #202 <Method void EdgeEffect.onRelease()>
						} else
	//* 302  606:goto            661
						if(k1 > i2)
	//* 303  609:iload_3         
	//* 304  610:iload           5
	//* 305  612:icmple          661
						{
							EdgeEffectCompat.onPull(mEdgeGlowBottom, (float)j / (float)getHeight(), 1.0F - motionevent.getX(l1) / (float)getWidth());
	//  306  615:aload_0         
	//  307  616:getfield        #204 <Field EdgeEffect mEdgeGlowBottom>
	//  308  619:iload_2         
	//  309  620:i2f             
	//  310  621:aload_0         
	//  311  622:invokevirtual   #171 <Method int getHeight()>
	//  312  625:i2f             
	//  313  626:fdiv            
	//  314  627:fconst_1        
	//  315  628:aload_1         
	//  316  629:iload           4
	//  317  631:invokevirtual   #850 <Method float MotionEvent.getX(int)>
	//  318  634:aload_0         
	//  319  635:invokevirtual   #552 <Method int getWidth()>
	//  320  638:i2f             
	//  321  639:fdiv            
	//  322  640:fsub            
	//  323  641:invokestatic    #856 <Method void EdgeEffectCompat.onPull(EdgeEffect, float, float)>
							if(!mEdgeGlowTop.isFinished())
	//* 324  644:aload_0         
	//* 325  645:getfield        #197 <Field EdgeEffect mEdgeGlowTop>
	//* 326  648:invokevirtual   #544 <Method boolean EdgeEffect.isFinished()>
	//* 327  651:ifne            661
								mEdgeGlowTop.onRelease();
	//  328  654:aload_0         
	//  329  655:getfield        #197 <Field EdgeEffect mEdgeGlowTop>
	//  330  658:invokevirtual   #202 <Method void EdgeEffect.onRelease()>
						}
						if(mEdgeGlowTop != null && (!mEdgeGlowTop.isFinished() || !mEdgeGlowBottom.isFinished()))
	//* 331  661:aload_0         
	//* 332  662:getfield        #197 <Field EdgeEffect mEdgeGlowTop>
	//* 333  665:ifnull          692
	//* 334  668:aload_0         
	//* 335  669:getfield        #197 <Field EdgeEffect mEdgeGlowTop>
	//* 336  672:invokevirtual   #544 <Method boolean EdgeEffect.isFinished()>
	//* 337  675:ifeq            688
	//* 338  678:aload_0         
	//* 339  679:getfield        #204 <Field EdgeEffect mEdgeGlowBottom>
	//* 340  682:invokevirtual   #544 <Method boolean EdgeEffect.isFinished()>
	//* 341  685:ifne            692
							ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//  342  688:aload_0         
	//  343  689:invokestatic    #571 <Method void ViewCompat.postInvalidateOnAnimation(View)>
					}
				}
			}
			break;

	//* 344  692:goto            894
		case 1: // '\001'
			if(mIsBeingDragged)
	//* 345  695:aload_0         
	//* 346  696:getfield        #105 <Field boolean mIsBeingDragged>
	//* 347  699:ifeq            778
			{
				motionevent = ((MotionEvent) (mVelocityTracker));
	//  348  702:aload_0         
	//  349  703:getfield        #306 <Field VelocityTracker mVelocityTracker>
	//  350  706:astore_1        
				((VelocityTracker) (motionevent)).computeCurrentVelocity(1000, mMaximumVelocity);
	//  351  707:aload_1         
	//  352  708:sipush          1000
	//  353  711:aload_0         
	//  354  712:getfield        #350 <Field int mMaximumVelocity>
	//  355  715:i2f             
	//  356  716:invokevirtual   #860 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
				int k = (int)((VelocityTracker) (motionevent)).getYVelocity(mActivePointerId);
	//  357  719:aload_1         
	//  358  720:aload_0         
	//  359  721:getfield        #109 <Field int mActivePointerId>
	//  360  724:invokevirtual   #863 <Method float VelocityTracker.getYVelocity(int)>
	//  361  727:f2i             
	//  362  728:istore_2        
				if(Math.abs(k) > mMinimumVelocity)
	//* 363  729:iload_2         
	//* 364  730:invokestatic    #714 <Method int Math.abs(int)>
	//* 365  733:aload_0         
	//* 366  734:getfield        #345 <Field int mMinimumVelocity>
	//* 367  737:icmple          749
					flingWithNestedDispatch(-k);
	//  368  740:aload_0         
	//  369  741:iload_2         
	//  370  742:ineg            
	//  371  743:invokespecial   #777 <Method void flingWithNestedDispatch(int)>
				else
	//* 372  746:goto            778
				if(mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()))
	//* 373  749:aload_0         
	//* 374  750:getfield        #320 <Field OverScroller mScroller>
	//* 375  753:aload_0         
	//* 376  754:invokevirtual   #480 <Method int getScrollX()>
	//* 377  757:aload_0         
	//* 378  758:invokevirtual   #239 <Method int getScrollY()>
	//* 379  761:iconst_0        
	//* 380  762:iconst_0        
	//* 381  763:iconst_0        
	//* 382  764:aload_0         
	//* 383  765:invokevirtual   #242 <Method int getScrollRange()>
	//* 384  768:invokevirtual   #745 <Method boolean OverScroller.springBack(int, int, int, int, int, int)>
	//* 385  771:ifeq            778
					ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//  386  774:aload_0         
	//  387  775:invokestatic    #571 <Method void ViewCompat.postInvalidateOnAnimation(View)>
			}
			mActivePointerId = -1;
	//  388  778:aload_0         
	//  389  779:iconst_m1       
	//  390  780:putfield        #109 <Field int mActivePointerId>
			endDrag();
	//  391  783:aload_0         
	//  392  784:invokespecial   #865 <Method void endDrag()>
			break;

	//* 393  787:goto            894
		case 3: // '\003'
			if(mIsBeingDragged && getChildCount() > 0 && mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()))
	//* 394  790:aload_0         
	//* 395  791:getfield        #105 <Field boolean mIsBeingDragged>
	//* 396  794:ifeq            833
	//* 397  797:aload_0         
	//* 398  798:invokevirtual   #297 <Method int getChildCount()>
	//* 399  801:ifle            833
	//* 400  804:aload_0         
	//* 401  805:getfield        #320 <Field OverScroller mScroller>
	//* 402  808:aload_0         
	//* 403  809:invokevirtual   #480 <Method int getScrollX()>
	//* 404  812:aload_0         
	//* 405  813:invokevirtual   #239 <Method int getScrollY()>
	//* 406  816:iconst_0        
	//* 407  817:iconst_0        
	//* 408  818:iconst_0        
	//* 409  819:aload_0         
	//* 410  820:invokevirtual   #242 <Method int getScrollRange()>
	//* 411  823:invokevirtual   #745 <Method boolean OverScroller.springBack(int, int, int, int, int, int)>
	//* 412  826:ifeq            833
				ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//  413  829:aload_0         
	//  414  830:invokestatic    #571 <Method void ViewCompat.postInvalidateOnAnimation(View)>
			mActivePointerId = -1;
	//  415  833:aload_0         
	//  416  834:iconst_m1       
	//  417  835:putfield        #109 <Field int mActivePointerId>
			endDrag();
	//  418  838:aload_0         
	//  419  839:invokespecial   #865 <Method void endDrag()>
			break;

	//* 420  842:goto            894
		case 5: // '\005'
			int l = motionevent.getActionIndex();
	//  421  845:aload_1         
	//  422  846:invokevirtual   #388 <Method int MotionEvent.getActionIndex()>
	//  423  849:istore_2        
			mLastMotionY = (int)motionevent.getY(l);
	//  424  850:aload_0         
	//  425  851:aload_1         
	//  426  852:iload_2         
	//  427  853:invokevirtual   #396 <Method float MotionEvent.getY(int)>
	//  428  856:f2i             
	//  429  857:putfield        #398 <Field int mLastMotionY>
			mActivePointerId = motionevent.getPointerId(l);
	//  430  860:aload_0         
	//  431  861:aload_1         
	//  432  862:iload_2         
	//  433  863:invokevirtual   #392 <Method int MotionEvent.getPointerId(int)>
	//  434  866:putfield        #109 <Field int mActivePointerId>
			break;

	//* 435  869:goto            894
		case 6: // '\006'
			onSecondaryPointerUp(motionevent);
	//  436  872:aload_0         
	//  437  873:aload_1         
	//  438  874:invokespecial   #747 <Method void onSecondaryPointerUp(MotionEvent)>
			mLastMotionY = (int)motionevent.getY(motionevent.findPointerIndex(mActivePointerId));
	//  439  877:aload_0         
	//  440  878:aload_1         
	//  441  879:aload_1         
	//  442  880:aload_0         
	//  443  881:getfield        #109 <Field int mActivePointerId>
	//  444  884:invokevirtual   #687 <Method int MotionEvent.findPointerIndex(int)>
	//  445  887:invokevirtual   #396 <Method float MotionEvent.getY(int)>
	//  446  890:f2i             
	//  447  891:putfield        #398 <Field int mLastMotionY>
			break;
		}
		if(mVelocityTracker != null)
	//* 448  894:aload_0         
	//* 449  895:getfield        #306 <Field VelocityTracker mVelocityTracker>
	//* 450  898:ifnull          910
			mVelocityTracker.addMovement(motionevent1);
	//  451  901:aload_0         
	//  452  902:getfield        #306 <Field VelocityTracker mVelocityTracker>
	//  453  905:aload           9
	//  454  907:invokevirtual   #720 <Method void VelocityTracker.addMovement(MotionEvent)>
		motionevent1.recycle();
	//  455  910:aload           9
	//  456  912:invokevirtual   #866 <Method void MotionEvent.recycle()>
		return true;
	//  457  915:iconst_1        
	//  458  916:ireturn         
	}

	boolean overScrollByCompat(int i, int j, int k, int l, int i1, int j1, int k1, 
			int l1, boolean flag)
	{
		int i2 = getOverScrollMode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #208 <Method int getOverScrollMode()>
	//    2    4:istore          12
		boolean flag1;
		if(computeHorizontalScrollRange() > computeHorizontalScrollExtent())
	//*   3    6:aload_0         
	//*   4    7:invokevirtual   #867 <Method int computeHorizontalScrollRange()>
	//*   5   10:aload_0         
	//*   6   11:invokevirtual   #868 <Method int computeHorizontalScrollExtent()>
	//*   7   14:icmple          23
			flag1 = true;
	//    8   17:iconst_1        
	//    9   18:istore          10
		else
	//*  10   20:goto            26
			flag1 = false;
	//   11   23:iconst_0        
	//   12   24:istore          10
		boolean flag2;
		if(computeVerticalScrollRange() > computeVerticalScrollExtent())
	//*  13   26:aload_0         
	//*  14   27:invokevirtual   #870 <Method int computeVerticalScrollRange()>
	//*  15   30:aload_0         
	//*  16   31:invokevirtual   #871 <Method int computeVerticalScrollExtent()>
	//*  17   34:icmple          43
			flag2 = true;
	//   18   37:iconst_1        
	//   19   38:istore          11
		else
	//*  20   40:goto            46
			flag2 = false;
	//   21   43:iconst_0        
	//   22   44:istore          11
		if(i2 == 0 || i2 == 1 && flag1)
	//*  23   46:iload           12
	//*  24   48:ifeq            62
	//*  25   51:iload           12
	//*  26   53:iconst_1        
	//*  27   54:icmpne          68
	//*  28   57:iload           10
	//*  29   59:ifeq            68
			flag1 = true;
	//   30   62:iconst_1        
	//   31   63:istore          10
		else
	//*  32   65:goto            71
			flag1 = false;
	//   33   68:iconst_0        
	//   34   69:istore          10
		if(i2 == 0 || i2 == 1 && flag2)
	//*  35   71:iload           12
	//*  36   73:ifeq            87
	//*  37   76:iload           12
	//*  38   78:iconst_1        
	//*  39   79:icmpne          93
	//*  40   82:iload           11
	//*  41   84:ifeq            93
			flag2 = true;
	//   42   87:iconst_1        
	//   43   88:istore          11
		else
	//*  44   90:goto            96
			flag2 = false;
	//   45   93:iconst_0        
	//   46   94:istore          11
		k += i;
	//   47   96:iload_3         
	//   48   97:iload_1         
	//   49   98:iadd            
	//   50   99:istore_3        
		if(!flag1)
	//*  51  100:iload           10
	//*  52  102:ifne            108
			k1 = 0;
	//   53  105:iconst_0        
	//   54  106:istore          7
		l += j;
	//   55  108:iload           4
	//   56  110:iload_2         
	//   57  111:iadd            
	//   58  112:istore          4
		if(!flag2)
	//*  59  114:iload           11
	//*  60  116:ifne            122
			l1 = 0;
	//   61  119:iconst_0        
	//   62  120:istore          8
		j = -k1;
	//   63  122:iload           7
	//   64  124:ineg            
	//   65  125:istore_2        
		i = k1 + i1;
	//   66  126:iload           7
	//   67  128:iload           5
	//   68  130:iadd            
	//   69  131:istore_1        
		i1 = -l1;
	//   70  132:iload           8
	//   71  134:ineg            
	//   72  135:istore          5
		j1 = l1 + j1;
	//   73  137:iload           8
	//   74  139:iload           6
	//   75  141:iadd            
	//   76  142:istore          6
		flag = false;
	//   77  144:iconst_0        
	//   78  145:istore          9
		if(k > i)
	//*  79  147:iload_3         
	//*  80  148:iload_1         
	//*  81  149:icmple          158
		{
			flag = true;
	//   82  152:iconst_1        
	//   83  153:istore          9
		} else
	//*  84  155:goto            170
		{
			i = k;
	//   85  158:iload_3         
	//   86  159:istore_1        
			if(k < j)
	//*  87  160:iload_3         
	//*  88  161:iload_2         
	//*  89  162:icmpge          170
			{
				i = j;
	//   90  165:iload_2         
	//   91  166:istore_1        
				flag = true;
	//   92  167:iconst_1        
	//   93  168:istore          9
			}
		}
		boolean flag3 = false;
	//   94  170:iconst_0        
	//   95  171:istore          13
		if(l > j1)
	//*  96  173:iload           4
	//*  97  175:iload           6
	//*  98  177:icmple          189
		{
			j = j1;
	//   99  180:iload           6
	//  100  182:istore_2        
			flag3 = true;
	//  101  183:iconst_1        
	//  102  184:istore          13
		} else
	//* 103  186:goto            205
		{
			j = l;
	//  104  189:iload           4
	//  105  191:istore_2        
			if(l < i1)
	//* 106  192:iload           4
	//* 107  194:iload           5
	//* 108  196:icmpge          205
			{
				j = i1;
	//  109  199:iload           5
	//  110  201:istore_2        
				flag3 = true;
	//  111  202:iconst_1        
	//  112  203:istore          13
			}
		}
		if(flag3)
	//* 113  205:iload           13
	//* 114  207:ifeq            227
			mScroller.springBack(i, j, 0, 0, 0, getScrollRange());
	//  115  210:aload_0         
	//  116  211:getfield        #320 <Field OverScroller mScroller>
	//  117  214:iload_1         
	//  118  215:iload_2         
	//  119  216:iconst_0        
	//  120  217:iconst_0        
	//  121  218:iconst_0        
	//  122  219:aload_0         
	//  123  220:invokevirtual   #242 <Method int getScrollRange()>
	//  124  223:invokevirtual   #745 <Method boolean OverScroller.springBack(int, int, int, int, int, int)>
	//  125  226:pop             
		onOverScrolled(i, j, flag, flag3);
	//  126  227:aload_0         
	//  127  228:iload_1         
	//  128  229:iload_2         
	//  129  230:iload           9
	//  130  232:iload           13
	//  131  234:invokevirtual   #873 <Method void onOverScrolled(int, int, boolean, boolean)>
		return flag || flag3;
	//  132  237:iload           9
	//  133  239:ifne            247
	//  134  242:iload           13
	//  135  244:ifeq            249
	//  136  247:iconst_1        
	//  137  248:ireturn         
	//  138  249:iconst_0        
	//  139  250:ireturn         
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
	//    9   15:invokevirtual   #171 <Method int getHeight()>
	//   10   18:istore_3        
		if(flag)
	//*  11   19:iload_2         
	//*  12   20:ifeq            88
		{
			mTempRect.top = getScrollY() + k;
	//   13   23:aload_0         
	//   14   24:getfield        #97  <Field Rect mTempRect>
	//   15   27:aload_0         
	//   16   28:invokevirtual   #239 <Method int getScrollY()>
	//   17   31:iload_3         
	//   18   32:iadd            
	//   19   33:putfield        #381 <Field int Rect.top>
			int j = getChildCount();
	//   20   36:aload_0         
	//   21   37:invokevirtual   #297 <Method int getChildCount()>
	//   22   40:istore_2        
			if(j > 0)
	//*  23   41:iload_2         
	//*  24   42:ifle            85
			{
				View view = getChildAt(j - 1);
	//   25   45:aload_0         
	//   26   46:iload_2         
	//   27   47:iconst_1        
	//   28   48:isub            
	//   29   49:invokevirtual   #164 <Method View getChildAt(int)>
	//   30   52:astore          4
				if(mTempRect.top + k > view.getBottom())
	//*  31   54:aload_0         
	//*  32   55:getfield        #97  <Field Rect mTempRect>
	//*  33   58:getfield        #381 <Field int Rect.top>
	//*  34   61:iload_3         
	//*  35   62:iadd            
	//*  36   63:aload           4
	//*  37   65:invokevirtual   #235 <Method int View.getBottom()>
	//*  38   68:icmple          85
					mTempRect.top = view.getBottom() - k;
	//   39   71:aload_0         
	//   40   72:getfield        #97  <Field Rect mTempRect>
	//   41   75:aload           4
	//   42   77:invokevirtual   #235 <Method int View.getBottom()>
	//   43   80:iload_3         
	//   44   81:isub            
	//   45   82:putfield        #381 <Field int Rect.top>
			}
		} else
	//*  46   85:goto            119
		{
			mTempRect.top = getScrollY() - k;
	//   47   88:aload_0         
	//   48   89:getfield        #97  <Field Rect mTempRect>
	//   49   92:aload_0         
	//   50   93:invokevirtual   #239 <Method int getScrollY()>
	//   51   96:iload_3         
	//   52   97:isub            
	//   53   98:putfield        #381 <Field int Rect.top>
			if(mTempRect.top < 0)
	//*  54  101:aload_0         
	//*  55  102:getfield        #97  <Field Rect mTempRect>
	//*  56  105:getfield        #381 <Field int Rect.top>
	//*  57  108:ifge            119
				mTempRect.top = 0;
	//   58  111:aload_0         
	//   59  112:getfield        #97  <Field Rect mTempRect>
	//   60  115:iconst_0        
	//   61  116:putfield        #381 <Field int Rect.top>
		}
		mTempRect.bottom = mTempRect.top + k;
	//   62  119:aload_0         
	//   63  120:getfield        #97  <Field Rect mTempRect>
	//   64  123:aload_0         
	//   65  124:getfield        #97  <Field Rect mTempRect>
	//   66  127:getfield        #381 <Field int Rect.top>
	//   67  130:iload_3         
	//   68  131:iadd            
	//   69  132:putfield        #378 <Field int Rect.bottom>
		return scrollAndFocus(i, mTempRect.top, mTempRect.bottom);
	//   70  135:aload_0         
	//   71  136:iload_1         
	//   72  137:aload_0         
	//   73  138:getfield        #97  <Field Rect mTempRect>
	//   74  141:getfield        #381 <Field int Rect.top>
	//   75  144:aload_0         
	//   76  145:getfield        #97  <Field Rect mTempRect>
	//   77  148:getfield        #378 <Field int Rect.bottom>
	//   78  151:invokespecial   #612 <Method boolean scrollAndFocus(int, int, int)>
	//   79  154:ireturn         
	}

	public void requestChildFocus(View view, View view1)
	{
		if(!mIsLayoutDirty)
	//*   0    0:aload_0         
	//*   1    1:getfield        #99  <Field boolean mIsLayoutDirty>
	//*   2    4:ifne            15
			scrollToChild(view1);
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:invokespecial   #753 <Method void scrollToChild(View)>
		else
	//*   6   12:goto            20
			mChildToScrollTo = view1;
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:putfield        #103 <Field View mChildToScrollTo>
		super.requestChildFocus(view, view1);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokespecial   #877 <Method void FrameLayout.requestChildFocus(View, View)>
	//   14   26:return          
	}

	public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean flag)
	{
		rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #300 <Method int View.getLeft()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #880 <Method int View.getScrollX()>
	//    5    9:isub            
	//    6   10:aload_1         
	//    7   11:invokevirtual   #232 <Method int View.getTop()>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #881 <Method int View.getScrollY()>
	//   10   18:isub            
	//   11   19:invokevirtual   #884 <Method void Rect.offset(int, int)>
		return scrollToChildRect(rect, flag);
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:iload_3         
	//   15   25:invokespecial   #886 <Method boolean scrollToChildRect(Rect, boolean)>
	//   16   28:ireturn         
	}

	public void requestDisallowInterceptTouchEvent(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            8
			recycleVelocityTracker();
	//    2    4:aload_0         
	//    3    5:invokespecial   #192 <Method void recycleVelocityTracker()>
		super.requestDisallowInterceptTouchEvent(flag);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokespecial   #887 <Method void FrameLayout.requestDisallowInterceptTouchEvent(boolean)>
	//    7   13:return          
	}

	public void requestLayout()
	{
		mIsLayoutDirty = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #99  <Field boolean mIsLayoutDirty>
		super.requestLayout();
	//    3    5:aload_0         
	//    4    6:invokespecial   #888 <Method void FrameLayout.requestLayout()>
	//    5    9:return          
	}

	public void scrollTo(int i, int j)
	{
		if(getChildCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #297 <Method int getChildCount()>
	//*   2    4:ifle            81
		{
			View view = getChildAt(0);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #164 <Method View getChildAt(int)>
	//    6   12:astore_3        
			i = clamp(i, getWidth() - getPaddingRight() - getPaddingLeft(), view.getWidth());
	//    7   13:iload_1         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #552 <Method int getWidth()>
	//   10   18:aload_0         
	//   11   19:invokevirtual   #558 <Method int getPaddingRight()>
	//   12   22:isub            
	//   13   23:aload_0         
	//   14   24:invokevirtual   #555 <Method int getPaddingLeft()>
	//   15   27:isub            
	//   16   28:aload_3         
	//   17   29:invokevirtual   #889 <Method int View.getWidth()>
	//   18   32:invokestatic    #891 <Method int clamp(int, int, int)>
	//   19   35:istore_1        
			j = clamp(j, getHeight() - getPaddingBottom() - getPaddingTop(), view.getHeight());
	//   20   36:iload_2         
	//   21   37:aload_0         
	//   22   38:invokevirtual   #171 <Method int getHeight()>
	//   23   41:aload_0         
	//   24   42:invokevirtual   #177 <Method int getPaddingBottom()>
	//   25   45:isub            
	//   26   46:aload_0         
	//   27   47:invokevirtual   #174 <Method int getPaddingTop()>
	//   28   50:isub            
	//   29   51:aload_3         
	//   30   52:invokevirtual   #170 <Method int View.getHeight()>
	//   31   55:invokestatic    #891 <Method int clamp(int, int, int)>
	//   32   58:istore_2        
			if(i != getScrollX() || j != getScrollY())
	//*  33   59:iload_1         
	//*  34   60:aload_0         
	//*  35   61:invokevirtual   #480 <Method int getScrollX()>
	//*  36   64:icmpne          75
	//*  37   67:iload_2         
	//*  38   68:aload_0         
	//*  39   69:invokevirtual   #239 <Method int getScrollY()>
	//*  40   72:icmpeq          81
				super.scrollTo(i, j);
	//   41   75:aload_0         
	//   42   76:iload_1         
	//   43   77:iload_2         
	//   44   78:invokespecial   #683 <Method void FrameLayout.scrollTo(int, int)>
		}
	//   45   81:return          
	}

	public void setFillViewport(boolean flag)
	{
		if(flag != mFillViewport)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #623 <Field boolean mFillViewport>
	//*   3    5:icmpeq          17
		{
			mFillViewport = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #623 <Field boolean mFillViewport>
			requestLayout();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #809 <Method void requestLayout()>
		}
	//    9   17:return          
	}

	public void setNestedScrollingEnabled(boolean flag)
	{
		mChildHelper.setNestedScrollingEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #892 <Method void NestedScrollingChildHelper.setNestedScrollingEnabled(boolean)>
	//    4    8:return          
	}

	public void setOnScrollChangeListener(OnScrollChangeListener onscrollchangelistener)
	{
		mOnScrollChangeListener = onscrollchangelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #820 <Field NestedScrollView$OnScrollChangeListener mOnScrollChangeListener>
	//    3    5:return          
	}

	public void setSmoothScrollingEnabled(boolean flag)
	{
		mSmoothScrollingEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #107 <Field boolean mSmoothScrollingEnabled>
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
	//*   1    1:invokevirtual   #297 <Method int getChildCount()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(AnimationUtils.currentAnimationTimeMillis() - mLastScroll > 250L)
	//*   4    8:invokestatic    #902 <Method long AnimationUtils.currentAnimationTimeMillis()>
	//*   5   11:aload_0         
	//*   6   12:getfield        #904 <Field long mLastScroll>
	//*   7   15:lsub            
	//*   8   16:ldc2w           #905 <Long 250L>
	//*   9   19:lcmp            
	//*  10   20:ifle            99
		{
			i = getHeight();
	//   11   23:aload_0         
	//   12   24:invokevirtual   #171 <Method int getHeight()>
	//   13   27:istore_1        
			int k = getPaddingBottom();
	//   14   28:aload_0         
	//   15   29:invokevirtual   #177 <Method int getPaddingBottom()>
	//   16   32:istore_3        
			int l = getPaddingTop();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #174 <Method int getPaddingTop()>
	//   19   37:istore          4
			k = Math.max(0, getChildAt(0).getHeight() - (i - k - l));
	//   20   39:iconst_0        
	//   21   40:aload_0         
	//   22   41:iconst_0        
	//   23   42:invokevirtual   #164 <Method View getChildAt(int)>
	//   24   45:invokevirtual   #170 <Method int View.getHeight()>
	//   25   48:iload_1         
	//   26   49:iload_3         
	//   27   50:isub            
	//   28   51:iload           4
	//   29   53:isub            
	//   30   54:isub            
	//   31   55:invokestatic    #513 <Method int Math.max(int, int)>
	//   32   58:istore_3        
			i = getScrollY();
	//   33   59:aload_0         
	//   34   60:invokevirtual   #239 <Method int getScrollY()>
	//   35   63:istore_1        
			j = Math.max(0, Math.min(i + j, k));
	//   36   64:iconst_0        
	//   37   65:iload_1         
	//   38   66:iload_2         
	//   39   67:iadd            
	//   40   68:iload_3         
	//   41   69:invokestatic    #510 <Method int Math.min(int, int)>
	//   42   72:invokestatic    #513 <Method int Math.max(int, int)>
	//   43   75:istore_2        
			mScroller.startScroll(getScrollX(), i, 0, j - i);
	//   44   76:aload_0         
	//   45   77:getfield        #320 <Field OverScroller mScroller>
	//   46   80:aload_0         
	//   47   81:invokevirtual   #480 <Method int getScrollX()>
	//   48   84:iload_1         
	//   49   85:iconst_0        
	//   50   86:iload_2         
	//   51   87:iload_1         
	//   52   88:isub            
	//   53   89:invokevirtual   #909 <Method void OverScroller.startScroll(int, int, int, int)>
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   54   92:aload_0         
	//   55   93:invokestatic    #571 <Method void ViewCompat.postInvalidateOnAnimation(View)>
		} else
	//*  56   96:goto            122
		{
			if(!mScroller.isFinished())
	//*  57   99:aload_0         
	//*  58  100:getfield        #320 <Field OverScroller mScroller>
	//*  59  103:invokevirtual   #738 <Method boolean OverScroller.isFinished()>
	//*  60  106:ifne            116
				mScroller.abortAnimation();
	//   61  109:aload_0         
	//   62  110:getfield        #320 <Field OverScroller mScroller>
	//   63  113:invokevirtual   #845 <Method void OverScroller.abortAnimation()>
			scrollBy(i, j);
	//   64  116:aload_0         
	//   65  117:iload_1         
	//   66  118:iload_2         
	//   67  119:invokevirtual   #188 <Method void scrollBy(int, int)>
		}
		mLastScroll = AnimationUtils.currentAnimationTimeMillis();
	//   68  122:aload_0         
	//   69  123:invokestatic    #902 <Method long AnimationUtils.currentAnimationTimeMillis()>
	//   70  126:putfield        #904 <Field long mLastScroll>
	//   71  129:return          
	}

	public final void smoothScrollTo(int i, int j)
	{
		smoothScrollBy(i - getScrollX(), j - getScrollY());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #480 <Method int getScrollX()>
	//    4    6:isub            
	//    5    7:iload_2         
	//    6    8:aload_0         
	//    7    9:invokevirtual   #239 <Method int getScrollY()>
	//    8   12:isub            
	//    9   13:invokevirtual   #185 <Method void smoothScrollBy(int, int)>
	//   10   16:return          
	}

	public boolean startNestedScroll(int i)
	{
		return mChildHelper.startNestedScroll(i);
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #911 <Method boolean NestedScrollingChildHelper.startNestedScroll(int)>
	//    4    8:ireturn         
	}

	public void stopNestedScroll()
	{
		mChildHelper.stopNestedScroll();
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field NestedScrollingChildHelper mChildHelper>
	//    2    4:invokevirtual   #912 <Method void NestedScrollingChildHelper.stopNestedScroll()>
	//    3    7:return          
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
	//    2    4:invokespecial   #78  <Method void NestedScrollView$AccessibilityDelegate()>
	//    3    7:putstatic       #80  <Field NestedScrollView$AccessibilityDelegate ACCESSIBILITY_DELEGATE>
	//    4   10:iconst_1        
	//    5   11:newarray        int[]
	//    6   13:dup             
	//    7   14:iconst_0        
	//    8   15:ldc1            #81  <Int 0x101017a>
	//    9   17:iastore         
	//   10   18:putstatic       #83  <Field int[] SCROLLVIEW_STYLEABLE>
	//*  11   21:return          
	}
}
