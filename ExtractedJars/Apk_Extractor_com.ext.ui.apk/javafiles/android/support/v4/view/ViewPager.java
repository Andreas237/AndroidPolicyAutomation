// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.*;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.*;
import android.view.*;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.Annotation;
import java.util.*;

// Referenced classes of package android.support.v4.view:
//			PagerAdapter, ViewCompat, AccessibilityDelegateCompat, AbsSavedState, 
//			OnApplyWindowInsetsListener, WindowInsetsCompat

public class ViewPager extends ViewGroup
{
	public static interface DecorView
		extends Annotation
	{
	}

	static class ItemInfo
	{

		Object object;
		float offset;
		int position;
		boolean scrolling;
		float widthFactor;

		ItemInfo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class LayoutParams extends android.view.ViewGroup.LayoutParams
	{

		int childIndex;
		public int gravity;
		public boolean isDecor;
		boolean needsMeasure;
		int position;
		float widthFactor;

		public LayoutParams()
		{
			super(-1, -1);
		//    0    0:aload_0         
		//    1    1:iconst_m1       
		//    2    2:iconst_m1       
		//    3    3:invokespecial   #21  <Method void android.view.ViewGroup$LayoutParams(int, int)>
			widthFactor = 0.0F;
		//    4    6:aload_0         
		//    5    7:fconst_0        
		//    6    8:putfield        #23  <Field float widthFactor>
		//    7   11:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #27  <Method void android.view.ViewGroup$LayoutParams(Context, AttributeSet)>
			widthFactor = 0.0F;
		//    4    6:aload_0         
		//    5    7:fconst_0        
		//    6    8:putfield        #23  <Field float widthFactor>
			context = ((Context) (context.obtainStyledAttributes(attributeset, ViewPager.LAYOUT_ATTRS)));
		//    7   11:aload_1         
		//    8   12:aload_2         
		//    9   13:getstatic       #31  <Field int[] ViewPager.LAYOUT_ATTRS>
		//   10   16:invokevirtual   #37  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//   11   19:astore_1        
			gravity = ((TypedArray) (context)).getInteger(0, 48);
		//   12   20:aload_0         
		//   13   21:aload_1         
		//   14   22:iconst_0        
		//   15   23:bipush          48
		//   16   25:invokevirtual   #43  <Method int TypedArray.getInteger(int, int)>
		//   17   28:putfield        #45  <Field int gravity>
			((TypedArray) (context)).recycle();
		//   18   31:aload_1         
		//   19   32:invokevirtual   #48  <Method void TypedArray.recycle()>
		//   20   35:return          
		}
	}

	class MyAccessibilityDelegate extends AccessibilityDelegateCompat
	{

		private boolean canScroll()
		{
			return mAdapter != null && mAdapter.getCount() > 1;
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field ViewPager this$0>
		//    2    4:getfield        #23  <Field PagerAdapter ViewPager.mAdapter>
		//    3    7:ifnull          26
		//    4   10:aload_0         
		//    5   11:getfield        #13  <Field ViewPager this$0>
		//    6   14:getfield        #23  <Field PagerAdapter ViewPager.mAdapter>
		//    7   17:invokevirtual   #29  <Method int PagerAdapter.getCount()>
		//    8   20:iconst_1        
		//    9   21:icmple          26
		//   10   24:iconst_1        
		//   11   25:ireturn         
		//   12   26:iconst_0        
		//   13   27:ireturn         
		}

		public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
		{
			super.onInitializeAccessibilityEvent(view, accessibilityevent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #33  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityEvent(View, AccessibilityEvent)>
			accessibilityevent.setClassName(((CharSequence) (((Class) (android/support/v4/view/ViewPager)).getName())));
		//    4    6:aload_2         
		//    5    7:ldc1            #6   <Class ViewPager>
		//    6    9:invokevirtual   #39  <Method String Class.getName()>
		//    7   12:invokevirtual   #45  <Method void AccessibilityEvent.setClassName(CharSequence)>
			accessibilityevent.setScrollable(canScroll());
		//    8   15:aload_2         
		//    9   16:aload_0         
		//   10   17:invokespecial   #47  <Method boolean canScroll()>
		//   11   20:invokevirtual   #51  <Method void AccessibilityEvent.setScrollable(boolean)>
			if(accessibilityevent.getEventType() == 4096 && mAdapter != null)
		//*  12   23:aload_2         
		//*  13   24:invokevirtual   #54  <Method int AccessibilityEvent.getEventType()>
		//*  14   27:sipush          4096
		//*  15   30:icmpne          79
		//*  16   33:aload_0         
		//*  17   34:getfield        #13  <Field ViewPager this$0>
		//*  18   37:getfield        #23  <Field PagerAdapter ViewPager.mAdapter>
		//*  19   40:ifnull          79
			{
				accessibilityevent.setItemCount(mAdapter.getCount());
		//   20   43:aload_2         
		//   21   44:aload_0         
		//   22   45:getfield        #13  <Field ViewPager this$0>
		//   23   48:getfield        #23  <Field PagerAdapter ViewPager.mAdapter>
		//   24   51:invokevirtual   #29  <Method int PagerAdapter.getCount()>
		//   25   54:invokevirtual   #58  <Method void AccessibilityEvent.setItemCount(int)>
				accessibilityevent.setFromIndex(mCurItem);
		//   26   57:aload_2         
		//   27   58:aload_0         
		//   28   59:getfield        #13  <Field ViewPager this$0>
		//   29   62:getfield        #62  <Field int ViewPager.mCurItem>
		//   30   65:invokevirtual   #65  <Method void AccessibilityEvent.setFromIndex(int)>
				accessibilityevent.setToIndex(mCurItem);
		//   31   68:aload_2         
		//   32   69:aload_0         
		//   33   70:getfield        #13  <Field ViewPager this$0>
		//   34   73:getfield        #62  <Field int ViewPager.mCurItem>
		//   35   76:invokevirtual   #68  <Method void AccessibilityEvent.setToIndex(int)>
			}
		//   36   79:return          
		}

		public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
		{
			super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #72  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
			accessibilitynodeinfocompat.setClassName(((CharSequence) (((Class) (android/support/v4/view/ViewPager)).getName())));
		//    4    6:aload_2         
		//    5    7:ldc1            #6   <Class ViewPager>
		//    6    9:invokevirtual   #39  <Method String Class.getName()>
		//    7   12:invokevirtual   #75  <Method void AccessibilityNodeInfoCompat.setClassName(CharSequence)>
			accessibilitynodeinfocompat.setScrollable(canScroll());
		//    8   15:aload_2         
		//    9   16:aload_0         
		//   10   17:invokespecial   #47  <Method boolean canScroll()>
		//   11   20:invokevirtual   #76  <Method void AccessibilityNodeInfoCompat.setScrollable(boolean)>
			if(canScrollHorizontally(1))
		//*  12   23:aload_0         
		//*  13   24:getfield        #13  <Field ViewPager this$0>
		//*  14   27:iconst_1        
		//*  15   28:invokevirtual   #80  <Method boolean ViewPager.canScrollHorizontally(int)>
		//*  16   31:ifeq            41
				accessibilitynodeinfocompat.addAction(4096);
		//   17   34:aload_2         
		//   18   35:sipush          4096
		//   19   38:invokevirtual   #83  <Method void AccessibilityNodeInfoCompat.addAction(int)>
			if(canScrollHorizontally(-1))
		//*  20   41:aload_0         
		//*  21   42:getfield        #13  <Field ViewPager this$0>
		//*  22   45:iconst_m1       
		//*  23   46:invokevirtual   #80  <Method boolean ViewPager.canScrollHorizontally(int)>
		//*  24   49:ifeq            59
				accessibilitynodeinfocompat.addAction(8192);
		//   25   52:aload_2         
		//   26   53:sipush          8192
		//   27   56:invokevirtual   #83  <Method void AccessibilityNodeInfoCompat.addAction(int)>
		//   28   59:return          
		}

		public boolean performAccessibilityAction(View view, int i, Bundle bundle)
		{
			if(super.performAccessibilityAction(view, i, bundle))
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:iload_2         
		//*   3    3:aload_3         
		//*   4    4:invokespecial   #87  <Method boolean AccessibilityDelegateCompat.performAccessibilityAction(View, int, Bundle)>
		//*   5    7:ifeq            12
				return true;
		//    6   10:iconst_1        
		//    7   11:ireturn         
			switch(i)
		//*   8   12:iload_2         
			{
		//*   9   13:lookupswitch    2: default 40
		//		               4096: 42
		//		               8192: 73
			default:
				return false;
		//   10   40:iconst_0        
		//   11   41:ireturn         

			case 4096: 
				if(canScrollHorizontally(1))
		//*  12   42:aload_0         
		//*  13   43:getfield        #13  <Field ViewPager this$0>
		//*  14   46:iconst_1        
		//*  15   47:invokevirtual   #80  <Method boolean ViewPager.canScrollHorizontally(int)>
		//*  16   50:ifeq            71
				{
					setCurrentItem(mCurItem + 1);
		//   17   53:aload_0         
		//   18   54:getfield        #13  <Field ViewPager this$0>
		//   19   57:aload_0         
		//   20   58:getfield        #13  <Field ViewPager this$0>
		//   21   61:getfield        #62  <Field int ViewPager.mCurItem>
		//   22   64:iconst_1        
		//   23   65:iadd            
		//   24   66:invokevirtual   #90  <Method void ViewPager.setCurrentItem(int)>
					return true;
		//   25   69:iconst_1        
		//   26   70:ireturn         
				} else
				{
					return false;
		//   27   71:iconst_0        
		//   28   72:ireturn         
				}

			case 8192: 
				break;
			}
			if(canScrollHorizontally(-1))
		//*  29   73:aload_0         
		//*  30   74:getfield        #13  <Field ViewPager this$0>
		//*  31   77:iconst_m1       
		//*  32   78:invokevirtual   #80  <Method boolean ViewPager.canScrollHorizontally(int)>
		//*  33   81:ifeq            102
			{
				setCurrentItem(mCurItem - 1);
		//   34   84:aload_0         
		//   35   85:getfield        #13  <Field ViewPager this$0>
		//   36   88:aload_0         
		//   37   89:getfield        #13  <Field ViewPager this$0>
		//   38   92:getfield        #62  <Field int ViewPager.mCurItem>
		//   39   95:iconst_1        
		//   40   96:isub            
		//   41   97:invokevirtual   #90  <Method void ViewPager.setCurrentItem(int)>
				return true;
		//   42  100:iconst_1        
		//   43  101:ireturn         
			} else
			{
				return false;
		//   44  102:iconst_0        
		//   45  103:ireturn         
			}
		}

		final ViewPager this$0;

		MyAccessibilityDelegate()
		{
			this$0 = ViewPager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field ViewPager this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void AccessibilityDelegateCompat()>
		//    5    9:return          
		}
	}

	public static interface OnAdapterChangeListener
	{

		public abstract void onAdapterChanged(ViewPager viewpager, PagerAdapter pageradapter, PagerAdapter pageradapter1);
	}

	public static interface OnPageChangeListener
	{

		public abstract void onPageScrollStateChanged(int i);

		public abstract void onPageScrolled(int i, float f, int j);

		public abstract void onPageSelected(int i);
	}

	public static interface PageTransformer
	{

		public abstract void transformPage(View view, float f);
	}

	private class PagerObserver extends DataSetObserver
	{

		public void onChanged()
		{
			dataSetChanged();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field ViewPager this$0>
		//    2    4:invokevirtual   #21  <Method void ViewPager.dataSetChanged()>
		//    3    7:return          
		}

		public void onInvalidated()
		{
			dataSetChanged();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field ViewPager this$0>
		//    2    4:invokevirtual   #21  <Method void ViewPager.dataSetChanged()>
		//    3    7:return          
		}

		final ViewPager this$0;

		PagerObserver()
		{
			this$0 = ViewPager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field ViewPager this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void DataSetObserver()>
		//    5    9:return          
		}
	}

	public static class SavedState extends AbsSavedState
	{

		public String toString()
		{
			return (new StringBuilder()).append("FragmentPager.SavedState{").append(Integer.toHexString(System.identityHashCode(((Object) (this))))).append(" position=").append(position).append("}").toString();
		//    0    0:new             #64  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #65  <Method void StringBuilder()>
		//    3    7:ldc1            #67  <String "FragmentPager.SavedState{">
		//    4    9:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//    5   12:aload_0         
		//    6   13:invokestatic    #77  <Method int System.identityHashCode(Object)>
		//    7   16:invokestatic    #83  <Method String Integer.toHexString(int)>
		//    8   19:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//    9   22:ldc1            #85  <String " position=">
		//   10   24:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   11   27:aload_0         
		//   12   28:getfield        #49  <Field int position>
		//   13   31:invokevirtual   #88  <Method StringBuilder StringBuilder.append(int)>
		//   14   34:ldc1            #90  <String "}">
		//   15   36:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   16   39:invokevirtual   #92  <Method String StringBuilder.toString()>
		//   17   42:areturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #96  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeInt(position);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #49  <Field int position>
		//    7   11:invokevirtual   #100 <Method void Parcel.writeInt(int)>
			parcel.writeParcelable(adapterState, i);
		//    8   14:aload_1         
		//    9   15:aload_0         
		//   10   16:getfield        #55  <Field Parcelable adapterState>
		//   11   19:iload_2         
		//   12   20:invokevirtual   #104 <Method void Parcel.writeParcelable(Parcelable, int)>
		//   13   23:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public SavedState createFromParcel(Parcel parcel)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class ViewPager$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void ViewPager$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class ViewPager$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #22  <Method void ViewPager$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #26  <Method ViewPager$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (createFromParcel(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #29  <Method ViewPager$SavedState createFromParcel(Parcel, ClassLoader)>
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
			//    2    2:invokevirtual   #34  <Method ViewPager$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		Parcelable adapterState;
		ClassLoader loader;
		int position;

		static 
		{
		//    0    0:new             #9   <Class ViewPager$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #23  <Method void ViewPager$SavedState$1()>
		//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #29  <Method void AbsSavedState(Parcel, ClassLoader)>
			ClassLoader classloader1 = classloader;
		//    4    6:aload_2         
		//    5    7:astore_3        
			if(classloader == null)
		//*   6    8:aload_2         
		//*   7    9:ifnonnull       20
				classloader1 = ((Object)this).getClass().getClassLoader();
		//    8   12:aload_0         
		//    9   13:invokevirtual   #35  <Method Class Object.getClass()>
		//   10   16:invokevirtual   #41  <Method ClassLoader Class.getClassLoader()>
		//   11   19:astore_3        
			position = parcel.readInt();
		//   12   20:aload_0         
		//   13   21:aload_1         
		//   14   22:invokevirtual   #47  <Method int Parcel.readInt()>
		//   15   25:putfield        #49  <Field int position>
			adapterState = parcel.readParcelable(classloader1);
		//   16   28:aload_0         
		//   17   29:aload_1         
		//   18   30:aload_3         
		//   19   31:invokevirtual   #53  <Method Parcelable Parcel.readParcelable(ClassLoader)>
		//   20   34:putfield        #55  <Field Parcelable adapterState>
			loader = classloader1;
		//   21   37:aload_0         
		//   22   38:aload_3         
		//   23   39:putfield        #57  <Field ClassLoader loader>
		//   24   42:return          
		}

		public SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #60  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}

	public static class SimpleOnPageChangeListener
		implements OnPageChangeListener
	{

		public void onPageScrollStateChanged(int i)
		{
		//    0    0:return          
		}

		public void onPageScrolled(int i, float f, int j)
		{
		//    0    0:return          
		}

		public void onPageSelected(int i)
		{
		//    0    0:return          
		}

		public SimpleOnPageChangeListener()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static class ViewPositionComparator
		implements Comparator
	{

		public int compare(View view, View view1)
		{
			view = ((View) ((LayoutParams)view.getLayoutParams()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #23  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #25  <Class ViewPager$LayoutParams>
		//    3    7:astore_1        
			view1 = ((View) ((LayoutParams)view1.getLayoutParams()));
		//    4    8:aload_2         
		//    5    9:invokevirtual   #23  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    6   12:checkcast       #25  <Class ViewPager$LayoutParams>
		//    7   15:astore_2        
			if(((LayoutParams) (view)).isDecor != ((LayoutParams) (view1)).isDecor)
		//*   8   16:aload_1         
		//*   9   17:getfield        #29  <Field boolean ViewPager$LayoutParams.isDecor>
		//*  10   20:aload_2         
		//*  11   21:getfield        #29  <Field boolean ViewPager$LayoutParams.isDecor>
		//*  12   24:icmpeq          38
				return !((LayoutParams) (view)).isDecor ? -1 : 1;
		//   13   27:aload_1         
		//   14   28:getfield        #29  <Field boolean ViewPager$LayoutParams.isDecor>
		//   15   31:ifeq            36
		//   16   34:iconst_1        
		//   17   35:ireturn         
		//   18   36:iconst_m1       
		//   19   37:ireturn         
			else
				return ((LayoutParams) (view)).position - ((LayoutParams) (view1)).position;
		//   20   38:aload_1         
		//   21   39:getfield        #33  <Field int ViewPager$LayoutParams.position>
		//   22   42:aload_2         
		//   23   43:getfield        #33  <Field int ViewPager$LayoutParams.position>
		//   24   46:isub            
		//   25   47:ireturn         
		}

		public volatile int compare(Object obj, Object obj1)
		{
			return compare((View)obj, (View)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #19  <Class View>
		//    3    5:aload_2         
		//    4    6:checkcast       #19  <Class View>
		//    5    9:invokevirtual   #36  <Method int compare(View, View)>
		//    6   12:ireturn         
		}

		ViewPositionComparator()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}


	public ViewPager(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #183 <Method void ViewGroup(Context)>
		mItems = new ArrayList();
	//    3    5:aload_0         
	//    4    6:new             #185 <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #186 <Method void ArrayList()>
	//    7   13:putfield        #188 <Field ArrayList mItems>
		mTempItem = new ItemInfo();
	//    8   16:aload_0         
	//    9   17:new             #17  <Class ViewPager$ItemInfo>
	//   10   20:dup             
	//   11   21:invokespecial   #189 <Method void ViewPager$ItemInfo()>
	//   12   24:putfield        #191 <Field ViewPager$ItemInfo mTempItem>
		mTempRect = new Rect();
	//   13   27:aload_0         
	//   14   28:new             #193 <Class Rect>
	//   15   31:dup             
	//   16   32:invokespecial   #194 <Method void Rect()>
	//   17   35:putfield        #196 <Field Rect mTempRect>
		mRestoredCurItem = -1;
	//   18   38:aload_0         
	//   19   39:iconst_m1       
	//   20   40:putfield        #198 <Field int mRestoredCurItem>
		mRestoredAdapterState = null;
	//   21   43:aload_0         
	//   22   44:aconst_null     
	//   23   45:putfield        #200 <Field Parcelable mRestoredAdapterState>
		mRestoredClassLoader = null;
	//   24   48:aload_0         
	//   25   49:aconst_null     
	//   26   50:putfield        #202 <Field ClassLoader mRestoredClassLoader>
		mFirstOffset = -3.402823E+38F;
	//   27   53:aload_0         
	//   28   54:ldc1            #203 <Float -3.402823E+38F>
	//   29   56:putfield        #205 <Field float mFirstOffset>
		mLastOffset = 3.402823E+38F;
	//   30   59:aload_0         
	//   31   60:ldc1            #206 <Float 3.402823E+38F>
	//   32   62:putfield        #208 <Field float mLastOffset>
		mOffscreenPageLimit = 1;
	//   33   65:aload_0         
	//   34   66:iconst_1        
	//   35   67:putfield        #210 <Field int mOffscreenPageLimit>
		mActivePointerId = -1;
	//   36   70:aload_0         
	//   37   71:iconst_m1       
	//   38   72:putfield        #212 <Field int mActivePointerId>
		mFirstLayout = true;
	//   39   75:aload_0         
	//   40   76:iconst_1        
	//   41   77:putfield        #214 <Field boolean mFirstLayout>
		mNeedCalculatePageOffsets = false;
	//   42   80:aload_0         
	//   43   81:iconst_0        
	//   44   82:putfield        #216 <Field boolean mNeedCalculatePageOffsets>
		mEndScrollRunnable = new Runnable() {

			public void run()
			{
				setScrollState(0);
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field ViewPager this$0>
			//    2    4:iconst_0        
			//    3    5:invokevirtual   #23  <Method void ViewPager.setScrollState(int)>
				populate();
			//    4    8:aload_0         
			//    5    9:getfield        #14  <Field ViewPager this$0>
			//    6   12:invokevirtual   #26  <Method void ViewPager.populate()>
			//    7   15:return          
			}

			final ViewPager this$0;

			
			{
				this$0 = ViewPager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ViewPager this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   45   85:aload_0         
	//   46   86:new             #10  <Class ViewPager$3>
	//   47   89:dup             
	//   48   90:aload_0         
	//   49   91:invokespecial   #219 <Method void ViewPager$3(ViewPager)>
	//   50   94:putfield        #221 <Field Runnable mEndScrollRunnable>
		mScrollState = 0;
	//   51   97:aload_0         
	//   52   98:iconst_0        
	//   53   99:putfield        #223 <Field int mScrollState>
		initViewPager();
	//   54  102:aload_0         
	//   55  103:invokevirtual   #226 <Method void initViewPager()>
	//   56  106:return          
	}

	public ViewPager(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #229 <Method void ViewGroup(Context, AttributeSet)>
		mItems = new ArrayList();
	//    4    6:aload_0         
	//    5    7:new             #185 <Class ArrayList>
	//    6   10:dup             
	//    7   11:invokespecial   #186 <Method void ArrayList()>
	//    8   14:putfield        #188 <Field ArrayList mItems>
		mTempItem = new ItemInfo();
	//    9   17:aload_0         
	//   10   18:new             #17  <Class ViewPager$ItemInfo>
	//   11   21:dup             
	//   12   22:invokespecial   #189 <Method void ViewPager$ItemInfo()>
	//   13   25:putfield        #191 <Field ViewPager$ItemInfo mTempItem>
		mTempRect = new Rect();
	//   14   28:aload_0         
	//   15   29:new             #193 <Class Rect>
	//   16   32:dup             
	//   17   33:invokespecial   #194 <Method void Rect()>
	//   18   36:putfield        #196 <Field Rect mTempRect>
		mRestoredCurItem = -1;
	//   19   39:aload_0         
	//   20   40:iconst_m1       
	//   21   41:putfield        #198 <Field int mRestoredCurItem>
		mRestoredAdapterState = null;
	//   22   44:aload_0         
	//   23   45:aconst_null     
	//   24   46:putfield        #200 <Field Parcelable mRestoredAdapterState>
		mRestoredClassLoader = null;
	//   25   49:aload_0         
	//   26   50:aconst_null     
	//   27   51:putfield        #202 <Field ClassLoader mRestoredClassLoader>
		mFirstOffset = -3.402823E+38F;
	//   28   54:aload_0         
	//   29   55:ldc1            #203 <Float -3.402823E+38F>
	//   30   57:putfield        #205 <Field float mFirstOffset>
		mLastOffset = 3.402823E+38F;
	//   31   60:aload_0         
	//   32   61:ldc1            #206 <Float 3.402823E+38F>
	//   33   63:putfield        #208 <Field float mLastOffset>
		mOffscreenPageLimit = 1;
	//   34   66:aload_0         
	//   35   67:iconst_1        
	//   36   68:putfield        #210 <Field int mOffscreenPageLimit>
		mActivePointerId = -1;
	//   37   71:aload_0         
	//   38   72:iconst_m1       
	//   39   73:putfield        #212 <Field int mActivePointerId>
		mFirstLayout = true;
	//   40   76:aload_0         
	//   41   77:iconst_1        
	//   42   78:putfield        #214 <Field boolean mFirstLayout>
		mNeedCalculatePageOffsets = false;
	//   43   81:aload_0         
	//   44   82:iconst_0        
	//   45   83:putfield        #216 <Field boolean mNeedCalculatePageOffsets>
		mEndScrollRunnable = new _cls3();
	//   46   86:aload_0         
	//   47   87:new             #10  <Class ViewPager$3>
	//   48   90:dup             
	//   49   91:aload_0         
	//   50   92:invokespecial   #219 <Method void ViewPager$3(ViewPager)>
	//   51   95:putfield        #221 <Field Runnable mEndScrollRunnable>
		mScrollState = 0;
	//   52   98:aload_0         
	//   53   99:iconst_0        
	//   54  100:putfield        #223 <Field int mScrollState>
		initViewPager();
	//   55  103:aload_0         
	//   56  104:invokevirtual   #226 <Method void initViewPager()>
	//   57  107:return          
	}

	private void calculatePageOffsets(ItemInfo iteminfo, int i, ItemInfo iteminfo1)
	{
		int i2 = mAdapter.getCount();
	//    0    0:aload_0         
	//    1    1:getfield        #233 <Field PagerAdapter mAdapter>
	//    2    4:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//    3    7:istore          10
		int j = getClientWidth();
	//    4    9:aload_0         
	//    5   10:invokespecial   #242 <Method int getClientWidth()>
	//    6   13:istore          7
		float f3;
		if(j > 0)
	//*   7   15:iload           7
	//*   8   17:ifle            168
			f3 = (float)mPageMargin / (float)j;
	//    9   20:aload_0         
	//   10   21:getfield        #244 <Field int mPageMargin>
	//   11   24:i2f             
	//   12   25:iload           7
	//   13   27:i2f             
	//   14   28:fdiv            
	//   15   29:fstore          5
		else
	//*  16   31:aload_3         
	//*  17   32:ifnull          409
	//*  18   35:aload_3         
	//*  19   36:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  20   39:istore          7
	//*  21   41:iload           7
	//*  22   43:aload_1         
	//*  23   44:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  24   47:icmpge          236
	//*  25   50:aload_3         
	//*  26   51:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//*  27   54:aload_3         
	//*  28   55:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//*  29   58:fadd            
	//*  30   59:fload           5
	//*  31   61:fadd            
	//*  32   62:fstore          4
	//*  33   64:iload           7
	//*  34   66:iconst_1        
	//*  35   67:iadd            
	//*  36   68:istore          7
	//*  37   70:iconst_0        
	//*  38   71:istore          8
	//*  39   73:iload           7
	//*  40   75:aload_1         
	//*  41   76:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  42   79:icmpgt          409
	//*  43   82:iload           8
	//*  44   84:aload_0         
	//*  45   85:getfield        #188 <Field ArrayList mItems>
	//*  46   88:invokevirtual   #256 <Method int ArrayList.size()>
	//*  47   91:icmpge          409
	//*  48   94:aload_0         
	//*  49   95:getfield        #188 <Field ArrayList mItems>
	//*  50   98:iload           8
	//*  51  100:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//*  52  103:checkcast       #17  <Class ViewPager$ItemInfo>
	//*  53  106:astore_3        
	//*  54  107:iload           7
	//*  55  109:istore          9
	//*  56  111:fload           4
	//*  57  113:fstore          6
	//*  58  115:iload           7
	//*  59  117:aload_3         
	//*  60  118:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  61  121:icmple          174
	//*  62  124:iload           7
	//*  63  126:istore          9
	//*  64  128:fload           4
	//*  65  130:fstore          6
	//*  66  132:iload           8
	//*  67  134:aload_0         
	//*  68  135:getfield        #188 <Field ArrayList mItems>
	//*  69  138:invokevirtual   #256 <Method int ArrayList.size()>
	//*  70  141:iconst_1        
	//*  71  142:isub            
	//*  72  143:icmpge          174
	//*  73  146:iload           8
	//*  74  148:iconst_1        
	//*  75  149:iadd            
	//*  76  150:istore          8
	//*  77  152:aload_0         
	//*  78  153:getfield        #188 <Field ArrayList mItems>
	//*  79  156:iload           8
	//*  80  158:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//*  81  161:checkcast       #17  <Class ViewPager$ItemInfo>
	//*  82  164:astore_3        
	//*  83  165:goto            107
			f3 = 0.0F;
	//   84  168:fconst_0        
	//   85  169:fstore          5
		if(iteminfo1 != null)
		{
			j = iteminfo1.position;
			if(j < iteminfo.position)
			{
				float f = iteminfo1.offset + iteminfo1.widthFactor + f3;
				j++;
				int j1;
				for(int k = 0; j <= iteminfo.position && k < mItems.size(); j = j1 + 1)
				{
					iteminfo1 = (ItemInfo)mItems.get(k);
					float f4;
					do
					{
						j1 = j;
						f4 = f;
						if(j <= iteminfo1.position)
							break;
						j1 = j;
						f4 = f;
						if(k >= mItems.size() - 1)
							break;
						k++;
						iteminfo1 = (ItemInfo)mItems.get(k);
					} while(true);
	//*  86  171:goto            31
					for(; j1 < iteminfo1.position; j1++)
	//*  87  174:iload           9
	//*  88  176:aload_3         
	//*  89  177:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  90  180:icmpge          209
						f4 += mAdapter.getPageWidth(j1) + f3;
	//   91  183:fload           6
	//   92  185:aload_0         
	//   93  186:getfield        #233 <Field PagerAdapter mAdapter>
	//   94  189:iload           9
	//   95  191:invokevirtual   #264 <Method float PagerAdapter.getPageWidth(int)>
	//   96  194:fload           5
	//   97  196:fadd            
	//   98  197:fadd            
	//   99  198:fstore          6

	//  100  200:iload           9
	//  101  202:iconst_1        
	//  102  203:iadd            
	//  103  204:istore          9
	//* 104  206:goto            174
					iteminfo1.offset = f4;
	//  105  209:aload_3         
	//  106  210:fload           6
	//  107  212:putfield        #250 <Field float ViewPager$ItemInfo.offset>
					f = f4 + (iteminfo1.widthFactor + f3);
	//  108  215:fload           6
	//  109  217:aload_3         
	//  110  218:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  111  221:fload           5
	//  112  223:fadd            
	//  113  224:fadd            
	//  114  225:fstore          4
				}

	//  115  227:iload           9
	//  116  229:iconst_1        
	//  117  230:iadd            
	//  118  231:istore          7
			} else
	//* 119  233:goto            73
			if(j > iteminfo.position)
	//* 120  236:iload           7
	//* 121  238:aload_1         
	//* 122  239:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 123  242:icmple          409
			{
				int l = mItems.size() - 1;
	//  124  245:aload_0         
	//  125  246:getfield        #188 <Field ArrayList mItems>
	//  126  249:invokevirtual   #256 <Method int ArrayList.size()>
	//  127  252:iconst_1        
	//  128  253:isub            
	//  129  254:istore          8
				float f1 = iteminfo1.offset;
	//  130  256:aload_3         
	//  131  257:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//  132  260:fstore          4
				int k1;
				for(j--; j >= iteminfo.position && l >= 0; j = k1 - 1)
	//* 133  262:iload           7
	//* 134  264:iconst_1        
	//* 135  265:isub            
	//* 136  266:istore          7
	//* 137  268:iload           7
	//* 138  270:aload_1         
	//* 139  271:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 140  274:icmplt          409
	//* 141  277:iload           8
	//* 142  279:iflt            409
				{
					iteminfo1 = (ItemInfo)mItems.get(l);
	//  143  282:aload_0         
	//  144  283:getfield        #188 <Field ArrayList mItems>
	//  145  286:iload           8
	//  146  288:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//  147  291:checkcast       #17  <Class ViewPager$ItemInfo>
	//  148  294:astore_3        
					float f5;
					do
					{
						k1 = j;
	//  149  295:iload           7
	//  150  297:istore          9
						f5 = f1;
	//  151  299:fload           4
	//  152  301:fstore          6
						if(j >= iteminfo1.position)
							break;
	//  153  303:iload           7
	//  154  305:aload_3         
	//  155  306:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//  156  309:icmpge          347
						k1 = j;
	//  157  312:iload           7
	//  158  314:istore          9
						f5 = f1;
	//  159  316:fload           4
	//  160  318:fstore          6
						if(l <= 0)
							break;
	//  161  320:iload           8
	//  162  322:ifle            347
						l--;
	//  163  325:iload           8
	//  164  327:iconst_1        
	//  165  328:isub            
	//  166  329:istore          8
						iteminfo1 = (ItemInfo)mItems.get(l);
	//  167  331:aload_0         
	//  168  332:getfield        #188 <Field ArrayList mItems>
	//  169  335:iload           8
	//  170  337:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//  171  340:checkcast       #17  <Class ViewPager$ItemInfo>
	//  172  343:astore_3        
					} while(true);
	//  173  344:goto            295
					for(; k1 > iteminfo1.position; k1--)
	//* 174  347:iload           9
	//* 175  349:aload_3         
	//* 176  350:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 177  353:icmple          382
						f5 -= mAdapter.getPageWidth(k1) + f3;
	//  178  356:fload           6
	//  179  358:aload_0         
	//  180  359:getfield        #233 <Field PagerAdapter mAdapter>
	//  181  362:iload           9
	//  182  364:invokevirtual   #264 <Method float PagerAdapter.getPageWidth(int)>
	//  183  367:fload           5
	//  184  369:fadd            
	//  185  370:fsub            
	//  186  371:fstore          6

	//  187  373:iload           9
	//  188  375:iconst_1        
	//  189  376:isub            
	//  190  377:istore          9
	//* 191  379:goto            347
					f1 = f5 - (iteminfo1.widthFactor + f3);
	//  192  382:fload           6
	//  193  384:aload_3         
	//  194  385:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  195  388:fload           5
	//  196  390:fadd            
	//  197  391:fsub            
	//  198  392:fstore          4
					iteminfo1.offset = f1;
	//  199  394:aload_3         
	//  200  395:fload           4
	//  201  397:putfield        #250 <Field float ViewPager$ItemInfo.offset>
				}

	//  202  400:iload           9
	//  203  402:iconst_1        
	//  204  403:isub            
	//  205  404:istore          7
			}
		}
	//* 206  406:goto            268
		int l1 = mItems.size();
	//  207  409:aload_0         
	//  208  410:getfield        #188 <Field ArrayList mItems>
	//  209  413:invokevirtual   #256 <Method int ArrayList.size()>
	//  210  416:istore          9
		float f6 = iteminfo.offset;
	//  211  418:aload_1         
	//  212  419:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//  213  422:fstore          6
		j = iteminfo.position - 1;
	//  214  424:aload_1         
	//  215  425:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//  216  428:iconst_1        
	//  217  429:isub            
	//  218  430:istore          7
		float f2;
		int i1;
		if(iteminfo.position == 0)
	//* 219  432:aload_1         
	//* 220  433:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 221  436:ifne            543
			f2 = iteminfo.offset;
	//  222  439:aload_1         
	//  223  440:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//  224  443:fstore          4
		else
	//* 225  445:aload_0         
	//* 226  446:fload           4
	//* 227  448:putfield        #205 <Field float mFirstOffset>
	//* 228  451:aload_1         
	//* 229  452:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 230  455:iload           10
	//* 231  457:iconst_1        
	//* 232  458:isub            
	//* 233  459:icmpne          550
	//* 234  462:aload_1         
	//* 235  463:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//* 236  466:aload_1         
	//* 237  467:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//* 238  470:fadd            
	//* 239  471:fconst_1        
	//* 240  472:fsub            
	//* 241  473:fstore          4
	//* 242  475:aload_0         
	//* 243  476:fload           4
	//* 244  478:putfield        #208 <Field float mLastOffset>
	//* 245  481:iload_2         
	//* 246  482:iconst_1        
	//* 247  483:isub            
	//* 248  484:istore          8
	//* 249  486:fload           6
	//* 250  488:fstore          4
	//* 251  490:iload           8
	//* 252  492:iflt            603
	//* 253  495:aload_0         
	//* 254  496:getfield        #188 <Field ArrayList mItems>
	//* 255  499:iload           8
	//* 256  501:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//* 257  504:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 258  507:astore_3        
	//* 259  508:iload           7
	//* 260  510:aload_3         
	//* 261  511:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 262  514:icmple          557
	//* 263  517:fload           4
	//* 264  519:aload_0         
	//* 265  520:getfield        #233 <Field PagerAdapter mAdapter>
	//* 266  523:iload           7
	//* 267  525:invokevirtual   #264 <Method float PagerAdapter.getPageWidth(int)>
	//* 268  528:fload           5
	//* 269  530:fadd            
	//* 270  531:fsub            
	//* 271  532:fstore          4
	//* 272  534:iload           7
	//* 273  536:iconst_1        
	//* 274  537:isub            
	//* 275  538:istore          7
	//* 276  540:goto            508
			f2 = -3.402823E+38F;
	//  277  543:ldc1            #203 <Float -3.402823E+38F>
	//  278  545:fstore          4
		mFirstOffset = f2;
		if(iteminfo.position == i2 - 1)
			f2 = (iteminfo.offset + iteminfo.widthFactor) - 1.0F;
		else
	//* 279  547:goto            445
			f2 = 3.402823E+38F;
	//  280  550:ldc1            #206 <Float 3.402823E+38F>
	//  281  552:fstore          4
		mLastOffset = f2;
		i1 = i - 1;
		f2 = f6;
		for(; i1 >= 0; i1--)
		{
			for(iteminfo1 = (ItemInfo)mItems.get(i1); j > iteminfo1.position; j--)
				f2 -= mAdapter.getPageWidth(j) + f3;

	//* 282  554:goto            475
			f2 -= iteminfo1.widthFactor + f3;
	//  283  557:fload           4
	//  284  559:aload_3         
	//  285  560:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  286  563:fload           5
	//  287  565:fadd            
	//  288  566:fsub            
	//  289  567:fstore          4
			iteminfo1.offset = f2;
	//  290  569:aload_3         
	//  291  570:fload           4
	//  292  572:putfield        #250 <Field float ViewPager$ItemInfo.offset>
			if(iteminfo1.position == 0)
	//* 293  575:aload_3         
	//* 294  576:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 295  579:ifne            588
				mFirstOffset = f2;
	//  296  582:aload_0         
	//  297  583:fload           4
	//  298  585:putfield        #205 <Field float mFirstOffset>
			j--;
	//  299  588:iload           7
	//  300  590:iconst_1        
	//  301  591:isub            
	//  302  592:istore          7
		}

	//  303  594:iload           8
	//  304  596:iconst_1        
	//  305  597:isub            
	//  306  598:istore          8
	//* 307  600:goto            490
		f2 = iteminfo.offset + iteminfo.widthFactor + f3;
	//  308  603:aload_1         
	//  309  604:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//  310  607:aload_1         
	//  311  608:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  312  611:fadd            
	//  313  612:fload           5
	//  314  614:fadd            
	//  315  615:fstore          4
		i1 = iteminfo.position + 1;
	//  316  617:aload_1         
	//  317  618:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//  318  621:iconst_1        
	//  319  622:iadd            
	//  320  623:istore          8
		j = i + 1;
	//  321  625:iload_2         
	//  322  626:iconst_1        
	//  323  627:iadd            
	//  324  628:istore          7
		i = i1;
	//  325  630:iload           8
	//  326  632:istore_2        
		for(; j < l1; j++)
	//* 327  633:iload           7
	//* 328  635:iload           9
	//* 329  637:icmpge          739
		{
			for(iteminfo = (ItemInfo)mItems.get(j); i < iteminfo.position; i++)
	//* 330  640:aload_0         
	//* 331  641:getfield        #188 <Field ArrayList mItems>
	//* 332  644:iload           7
	//* 333  646:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//* 334  649:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 335  652:astore_1        
	//* 336  653:iload_2         
	//* 337  654:aload_1         
	//* 338  655:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 339  658:icmpge          684
				f2 = mAdapter.getPageWidth(i) + f3 + f2;
	//  340  661:aload_0         
	//  341  662:getfield        #233 <Field PagerAdapter mAdapter>
	//  342  665:iload_2         
	//  343  666:invokevirtual   #264 <Method float PagerAdapter.getPageWidth(int)>
	//  344  669:fload           5
	//  345  671:fadd            
	//  346  672:fload           4
	//  347  674:fadd            
	//  348  675:fstore          4

	//  349  677:iload_2         
	//  350  678:iconst_1        
	//  351  679:iadd            
	//  352  680:istore_2        
	//* 353  681:goto            653
			if(iteminfo.position == i2 - 1)
	//* 354  684:aload_1         
	//* 355  685:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 356  688:iload           10
	//* 357  690:iconst_1        
	//* 358  691:isub            
	//* 359  692:icmpne          708
				mLastOffset = (iteminfo.widthFactor + f2) - 1.0F;
	//  360  695:aload_0         
	//  361  696:aload_1         
	//  362  697:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  363  700:fload           4
	//  364  702:fadd            
	//  365  703:fconst_1        
	//  366  704:fsub            
	//  367  705:putfield        #208 <Field float mLastOffset>
			iteminfo.offset = f2;
	//  368  708:aload_1         
	//  369  709:fload           4
	//  370  711:putfield        #250 <Field float ViewPager$ItemInfo.offset>
			f2 += iteminfo.widthFactor + f3;
	//  371  714:fload           4
	//  372  716:aload_1         
	//  373  717:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  374  720:fload           5
	//  375  722:fadd            
	//  376  723:fadd            
	//  377  724:fstore          4
			i++;
	//  378  726:iload_2         
	//  379  727:iconst_1        
	//  380  728:iadd            
	//  381  729:istore_2        
		}

	//  382  730:iload           7
	//  383  732:iconst_1        
	//  384  733:iadd            
	//  385  734:istore          7
	//* 386  736:goto            633
		mNeedCalculatePageOffsets = false;
	//  387  739:aload_0         
	//  388  740:iconst_0        
	//  389  741:putfield        #216 <Field boolean mNeedCalculatePageOffsets>
	//  390  744:return          
	}

	private void completeScroll(boolean flag)
	{
label0:
		{
			int i;
			int j;
			if(mScrollState == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #223 <Field int mScrollState>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          165
				i = 1;
	//    4    8:iconst_1        
	//    5    9:istore_2        
			else
	//*   6   10:iload_2         
	//*   7   11:ifeq            105
	//*   8   14:aload_0         
	//*   9   15:iconst_0        
	//*  10   16:invokespecial   #269 <Method void setScrollingCacheEnabled(boolean)>
	//*  11   19:aload_0         
	//*  12   20:getfield        #271 <Field Scroller mScroller>
	//*  13   23:invokevirtual   #277 <Method boolean Scroller.isFinished()>
	//*  14   26:ifne            170
	//*  15   29:iconst_1        
	//*  16   30:istore_3        
	//*  17   31:iload_3         
	//*  18   32:ifeq            105
	//*  19   35:aload_0         
	//*  20   36:getfield        #271 <Field Scroller mScroller>
	//*  21   39:invokevirtual   #280 <Method void Scroller.abortAnimation()>
	//*  22   42:aload_0         
	//*  23   43:invokevirtual   #283 <Method int getScrollX()>
	//*  24   46:istore_3        
	//*  25   47:aload_0         
	//*  26   48:invokevirtual   #286 <Method int getScrollY()>
	//*  27   51:istore          4
	//*  28   53:aload_0         
	//*  29   54:getfield        #271 <Field Scroller mScroller>
	//*  30   57:invokevirtual   #289 <Method int Scroller.getCurrX()>
	//*  31   60:istore          5
	//*  32   62:aload_0         
	//*  33   63:getfield        #271 <Field Scroller mScroller>
	//*  34   66:invokevirtual   #292 <Method int Scroller.getCurrY()>
	//*  35   69:istore          6
	//*  36   71:iload_3         
	//*  37   72:iload           5
	//*  38   74:icmpne          84
	//*  39   77:iload           4
	//*  40   79:iload           6
	//*  41   81:icmpeq          105
	//*  42   84:aload_0         
	//*  43   85:iload           5
	//*  44   87:iload           6
	//*  45   89:invokevirtual   #296 <Method void scrollTo(int, int)>
	//*  46   92:iload           5
	//*  47   94:iload_3         
	//*  48   95:icmpeq          105
	//*  49   98:aload_0         
	//*  50   99:iload           5
	//*  51  101:invokespecial   #300 <Method boolean pageScrolled(int)>
	//*  52  104:pop             
	//*  53  105:aload_0         
	//*  54  106:iconst_0        
	//*  55  107:putfield        #302 <Field boolean mPopulatePending>
	//*  56  110:iconst_0        
	//*  57  111:istore          4
	//*  58  113:iload_2         
	//*  59  114:istore_3        
	//*  60  115:iload           4
	//*  61  117:istore_2        
	//*  62  118:iload_2         
	//*  63  119:aload_0         
	//*  64  120:getfield        #188 <Field ArrayList mItems>
	//*  65  123:invokevirtual   #256 <Method int ArrayList.size()>
	//*  66  126:icmpge          175
	//*  67  129:aload_0         
	//*  68  130:getfield        #188 <Field ArrayList mItems>
	//*  69  133:iload_2         
	//*  70  134:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//*  71  137:checkcast       #17  <Class ViewPager$ItemInfo>
	//*  72  140:astore          7
	//*  73  142:aload           7
	//*  74  144:getfield        #305 <Field boolean ViewPager$ItemInfo.scrolling>
	//*  75  147:ifeq            158
	//*  76  150:aload           7
	//*  77  152:iconst_0        
	//*  78  153:putfield        #305 <Field boolean ViewPager$ItemInfo.scrolling>
	//*  79  156:iconst_1        
	//*  80  157:istore_3        
	//*  81  158:iload_2         
	//*  82  159:iconst_1        
	//*  83  160:iadd            
	//*  84  161:istore_2        
	//*  85  162:goto            118
				i = 0;
	//   86  165:iconst_0        
	//   87  166:istore_2        
			if(i != 0)
			{
				setScrollingCacheEnabled(false);
				boolean flag1;
				ItemInfo iteminfo;
				if(!mScroller.isFinished())
					j = 1;
				else
	//*  88  167:goto            10
					j = 0;
	//   89  170:iconst_0        
	//   90  171:istore_3        
				if(j != 0)
				{
					mScroller.abortAnimation();
					j = getScrollX();
					int k = getScrollY();
					int l = mScroller.getCurrX();
					int i1 = mScroller.getCurrY();
					if(j != l || k != i1)
					{
						scrollTo(l, i1);
						if(l != j)
							pageScrolled(l);
					}
				}
			}
			mPopulatePending = false;
			flag1 = false;
			j = i;
			for(i = ((int) (flag1)); i < mItems.size(); i++)
			{
				iteminfo = (ItemInfo)mItems.get(i);
				if(iteminfo.scrolling)
				{
					iteminfo.scrolling = false;
					j = 1;
				}
			}

	//*  91  172:goto            31
			if(j != 0)
	//*  92  175:iload_3         
	//*  93  176:ifeq            191
			{
				if(!flag)
					break label0;
	//   94  179:iload_1         
	//   95  180:ifeq            192
				ViewCompat.postOnAnimation(((View) (this)), mEndScrollRunnable);
	//   96  183:aload_0         
	//   97  184:aload_0         
	//   98  185:getfield        #221 <Field Runnable mEndScrollRunnable>
	//   99  188:invokestatic    #311 <Method void ViewCompat.postOnAnimation(View, Runnable)>
			}
			return;
	//  100  191:return          
		}
		mEndScrollRunnable.run();
	//  101  192:aload_0         
	//  102  193:getfield        #221 <Field Runnable mEndScrollRunnable>
	//  103  196:invokeinterface #316 <Method void Runnable.run()>
	//  104  201:return          
	}

	private int determineTargetPage(int i, float f, int j, int k)
	{
		if(Math.abs(k) > mFlingDistance && Math.abs(j) > mMinimumVelocity)
	//*   0    0:iload           4
	//*   1    2:invokestatic    #324 <Method int Math.abs(int)>
	//*   2    5:aload_0         
	//*   3    6:getfield        #326 <Field int mFlingDistance>
	//*   4    9:icmple          100
	//*   5   12:iload_3         
	//*   6   13:invokestatic    #324 <Method int Math.abs(int)>
	//*   7   16:aload_0         
	//*   8   17:getfield        #328 <Field int mMinimumVelocity>
	//*   9   20:icmple          100
		{
			if(j <= 0)
	//*  10   23:iload_3         
	//*  11   24:ifle            93
	//*  12   27:iload_1         
	//*  13   28:istore_3        
	//*  14   29:aload_0         
	//*  15   30:getfield        #188 <Field ArrayList mItems>
	//*  16   33:invokevirtual   #256 <Method int ArrayList.size()>
	//*  17   36:ifle            91
	//*  18   39:aload_0         
	//*  19   40:getfield        #188 <Field ArrayList mItems>
	//*  20   43:iconst_0        
	//*  21   44:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//*  22   47:checkcast       #17  <Class ViewPager$ItemInfo>
	//*  23   50:astore          6
	//*  24   52:aload_0         
	//*  25   53:getfield        #188 <Field ArrayList mItems>
	//*  26   56:aload_0         
	//*  27   57:getfield        #188 <Field ArrayList mItems>
	//*  28   60:invokevirtual   #256 <Method int ArrayList.size()>
	//*  29   63:iconst_1        
	//*  30   64:isub            
	//*  31   65:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//*  32   68:checkcast       #17  <Class ViewPager$ItemInfo>
	//*  33   71:astore          7
	//*  34   73:aload           6
	//*  35   75:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  36   78:iload_1         
	//*  37   79:aload           7
	//*  38   81:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  39   84:invokestatic    #332 <Method int Math.min(int, int)>
	//*  40   87:invokestatic    #335 <Method int Math.max(int, int)>
	//*  41   90:istore_3        
	//*  42   91:iload_3         
	//*  43   92:ireturn         
				i++;
	//   44   93:iload_1         
	//   45   94:iconst_1        
	//   46   95:iadd            
	//   47   96:istore_1        
		} else
	//*  48   97:goto            27
		{
			float f1;
			if(i >= mCurItem)
	//*  49  100:iload_1         
	//*  50  101:aload_0         
	//*  51  102:getfield        #337 <Field int mCurItem>
	//*  52  105:icmplt          124
				f1 = 0.4F;
	//   53  108:ldc2            #338 <Float 0.4F>
	//   54  111:fstore          5
			else
	//*  55  113:iload_1         
	//*  56  114:fload           5
	//*  57  116:fload_2         
	//*  58  117:fadd            
	//*  59  118:f2i             
	//*  60  119:iadd            
	//*  61  120:istore_1        
	//*  62  121:goto            27
				f1 = 0.6F;
	//   63  124:ldc2            #339 <Float 0.6F>
	//   64  127:fstore          5
			i += (int)(f1 + f);
		}
		j = i;
		if(mItems.size() > 0)
		{
			ItemInfo iteminfo = (ItemInfo)mItems.get(0);
			ItemInfo iteminfo1 = (ItemInfo)mItems.get(mItems.size() - 1);
			j = Math.max(iteminfo.position, Math.min(i, iteminfo1.position));
		}
		return j;
	//*  65  129:goto            113
	}

	private void dispatchOnPageScrolled(int i, float f, int j)
	{
		if(mOnPageChangeListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #343 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
	//*   2    4:ifnull          19
			mOnPageChangeListener.onPageScrolled(i, f, j);
	//    3    7:aload_0         
	//    4    8:getfield        #343 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
	//    5   11:iload_1         
	//    6   12:fload_2         
	//    7   13:iload_3         
	//    8   14:invokeinterface #346 <Method void ViewPager$OnPageChangeListener.onPageScrolled(int, float, int)>
		if(mOnPageChangeListeners != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #348 <Field List mOnPageChangeListeners>
	//*  11   23:ifnull          87
		{
			int l = mOnPageChangeListeners.size();
	//   12   26:aload_0         
	//   13   27:getfield        #348 <Field List mOnPageChangeListeners>
	//   14   30:invokeinterface #351 <Method int List.size()>
	//   15   35:istore          5
			for(int k = 0; k < l; k++)
	//*  16   37:iconst_0        
	//*  17   38:istore          4
	//*  18   40:iload           4
	//*  19   42:iload           5
	//*  20   44:icmpge          87
			{
				OnPageChangeListener onpagechangelistener = (OnPageChangeListener)mOnPageChangeListeners.get(k);
	//   21   47:aload_0         
	//   22   48:getfield        #348 <Field List mOnPageChangeListeners>
	//   23   51:iload           4
	//   24   53:invokeinterface #352 <Method Object List.get(int)>
	//   25   58:checkcast       #29  <Class ViewPager$OnPageChangeListener>
	//   26   61:astore          6
				if(onpagechangelistener != null)
	//*  27   63:aload           6
	//*  28   65:ifnull          78
					onpagechangelistener.onPageScrolled(i, f, j);
	//   29   68:aload           6
	//   30   70:iload_1         
	//   31   71:fload_2         
	//   32   72:iload_3         
	//   33   73:invokeinterface #346 <Method void ViewPager$OnPageChangeListener.onPageScrolled(int, float, int)>
			}

	//   34   78:iload           4
	//   35   80:iconst_1        
	//   36   81:iadd            
	//   37   82:istore          4
		}
	//*  38   84:goto            40
		if(mInternalPageChangeListener != null)
	//*  39   87:aload_0         
	//*  40   88:getfield        #354 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
	//*  41   91:ifnull          106
			mInternalPageChangeListener.onPageScrolled(i, f, j);
	//   42   94:aload_0         
	//   43   95:getfield        #354 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
	//   44   98:iload_1         
	//   45   99:fload_2         
	//   46  100:iload_3         
	//   47  101:invokeinterface #346 <Method void ViewPager$OnPageChangeListener.onPageScrolled(int, float, int)>
	//   48  106:return          
	}

	private void dispatchOnPageSelected(int i)
	{
		if(mOnPageChangeListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #343 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
	//*   2    4:ifnull          17
			mOnPageChangeListener.onPageSelected(i);
	//    3    7:aload_0         
	//    4    8:getfield        #343 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
	//    5   11:iload_1         
	//    6   12:invokeinterface #359 <Method void ViewPager$OnPageChangeListener.onPageSelected(int)>
		if(mOnPageChangeListeners != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #348 <Field List mOnPageChangeListeners>
	//*   9   21:ifnull          76
		{
			int k = mOnPageChangeListeners.size();
	//   10   24:aload_0         
	//   11   25:getfield        #348 <Field List mOnPageChangeListeners>
	//   12   28:invokeinterface #351 <Method int List.size()>
	//   13   33:istore_3        
			for(int j = 0; j < k; j++)
	//*  14   34:iconst_0        
	//*  15   35:istore_2        
	//*  16   36:iload_2         
	//*  17   37:iload_3         
	//*  18   38:icmpge          76
			{
				OnPageChangeListener onpagechangelistener = (OnPageChangeListener)mOnPageChangeListeners.get(j);
	//   19   41:aload_0         
	//   20   42:getfield        #348 <Field List mOnPageChangeListeners>
	//   21   45:iload_2         
	//   22   46:invokeinterface #352 <Method Object List.get(int)>
	//   23   51:checkcast       #29  <Class ViewPager$OnPageChangeListener>
	//   24   54:astore          4
				if(onpagechangelistener != null)
	//*  25   56:aload           4
	//*  26   58:ifnull          69
					onpagechangelistener.onPageSelected(i);
	//   27   61:aload           4
	//   28   63:iload_1         
	//   29   64:invokeinterface #359 <Method void ViewPager$OnPageChangeListener.onPageSelected(int)>
			}

	//   30   69:iload_2         
	//   31   70:iconst_1        
	//   32   71:iadd            
	//   33   72:istore_2        
		}
	//*  34   73:goto            36
		if(mInternalPageChangeListener != null)
	//*  35   76:aload_0         
	//*  36   77:getfield        #354 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
	//*  37   80:ifnull          93
			mInternalPageChangeListener.onPageSelected(i);
	//   38   83:aload_0         
	//   39   84:getfield        #354 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
	//   40   87:iload_1         
	//   41   88:invokeinterface #359 <Method void ViewPager$OnPageChangeListener.onPageSelected(int)>
	//   42   93:return          
	}

	private void dispatchOnScrollStateChanged(int i)
	{
		if(mOnPageChangeListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #343 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
	//*   2    4:ifnull          17
			mOnPageChangeListener.onPageScrollStateChanged(i);
	//    3    7:aload_0         
	//    4    8:getfield        #343 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
	//    5   11:iload_1         
	//    6   12:invokeinterface #363 <Method void ViewPager$OnPageChangeListener.onPageScrollStateChanged(int)>
		if(mOnPageChangeListeners != null)
	//*   7   17:aload_0         
	//*   8   18:getfield        #348 <Field List mOnPageChangeListeners>
	//*   9   21:ifnull          76
		{
			int k = mOnPageChangeListeners.size();
	//   10   24:aload_0         
	//   11   25:getfield        #348 <Field List mOnPageChangeListeners>
	//   12   28:invokeinterface #351 <Method int List.size()>
	//   13   33:istore_3        
			for(int j = 0; j < k; j++)
	//*  14   34:iconst_0        
	//*  15   35:istore_2        
	//*  16   36:iload_2         
	//*  17   37:iload_3         
	//*  18   38:icmpge          76
			{
				OnPageChangeListener onpagechangelistener = (OnPageChangeListener)mOnPageChangeListeners.get(j);
	//   19   41:aload_0         
	//   20   42:getfield        #348 <Field List mOnPageChangeListeners>
	//   21   45:iload_2         
	//   22   46:invokeinterface #352 <Method Object List.get(int)>
	//   23   51:checkcast       #29  <Class ViewPager$OnPageChangeListener>
	//   24   54:astore          4
				if(onpagechangelistener != null)
	//*  25   56:aload           4
	//*  26   58:ifnull          69
					onpagechangelistener.onPageScrollStateChanged(i);
	//   27   61:aload           4
	//   28   63:iload_1         
	//   29   64:invokeinterface #363 <Method void ViewPager$OnPageChangeListener.onPageScrollStateChanged(int)>
			}

	//   30   69:iload_2         
	//   31   70:iconst_1        
	//   32   71:iadd            
	//   33   72:istore_2        
		}
	//*  34   73:goto            36
		if(mInternalPageChangeListener != null)
	//*  35   76:aload_0         
	//*  36   77:getfield        #354 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
	//*  37   80:ifnull          93
			mInternalPageChangeListener.onPageScrollStateChanged(i);
	//   38   83:aload_0         
	//   39   84:getfield        #354 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
	//   40   87:iload_1         
	//   41   88:invokeinterface #363 <Method void ViewPager$OnPageChangeListener.onPageScrollStateChanged(int)>
	//   42   93:return          
	}

	private void enableLayers(boolean flag)
	{
		int k = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #367 <Method int getChildCount()>
	//    2    4:istore          4
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_2        
		while(i < k) 
	//*   5    8:iload_2         
	//*   6    9:iload           4
	//*   7   11:icmpge          45
		{
			int j;
			if(flag)
	//*   8   14:iload_1         
	//*   9   15:ifeq            40
				j = mPageTransformerLayerType;
	//   10   18:aload_0         
	//   11   19:getfield        #369 <Field int mPageTransformerLayerType>
	//   12   22:istore_3        
			else
	//*  13   23:aload_0         
	//*  14   24:iload_2         
	//*  15   25:invokevirtual   #373 <Method View getChildAt(int)>
	//*  16   28:iload_3         
	//*  17   29:aconst_null     
	//*  18   30:invokevirtual   #379 <Method void View.setLayerType(int, android.graphics.Paint)>
	//*  19   33:iload_2         
	//*  20   34:iconst_1        
	//*  21   35:iadd            
	//*  22   36:istore_2        
	//*  23   37:goto            8
				j = 0;
	//   24   40:iconst_0        
	//   25   41:istore_3        
			getChildAt(i).setLayerType(j, ((android.graphics.Paint) (null)));
			i++;
		}
	//*  26   42:goto            23
	//   27   45:return          
	}

	private void endDrag()
	{
		mIsBeingDragged = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #382 <Field boolean mIsBeingDragged>
		mIsUnableToDrag = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #384 <Field boolean mIsUnableToDrag>
		if(mVelocityTracker != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//*   8   14:ifnull          29
		{
			mVelocityTracker.recycle();
	//    9   17:aload_0         
	//   10   18:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//   11   21:invokevirtual   #391 <Method void VelocityTracker.recycle()>
			mVelocityTracker = null;
	//   12   24:aload_0         
	//   13   25:aconst_null     
	//   14   26:putfield        #386 <Field VelocityTracker mVelocityTracker>
		}
	//   15   29:return          
	}

	private Rect getChildRectInPagerCoordinates(Rect rect, View view)
	{
		if(rect == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       142
			rect = new Rect();
	//    2    4:new             #193 <Class Rect>
	//    3    7:dup             
	//    4    8:invokespecial   #194 <Method void Rect()>
	//    5   11:astore_1        
		if(view == null)
	//*   6   12:aload_2         
	//*   7   13:ifnonnull       26
		{
			rect.set(0, 0, 0, 0);
	//    8   16:aload_1         
	//    9   17:iconst_0        
	//   10   18:iconst_0        
	//   11   19:iconst_0        
	//   12   20:iconst_0        
	//   13   21:invokevirtual   #397 <Method void Rect.set(int, int, int, int)>
			return rect;
	//   14   24:aload_1         
	//   15   25:areturn         
		}
		rect.left = view.getLeft();
	//   16   26:aload_1         
	//   17   27:aload_2         
	//   18   28:invokevirtual   #400 <Method int View.getLeft()>
	//   19   31:putfield        #403 <Field int Rect.left>
		rect.right = view.getRight();
	//   20   34:aload_1         
	//   21   35:aload_2         
	//   22   36:invokevirtual   #406 <Method int View.getRight()>
	//   23   39:putfield        #409 <Field int Rect.right>
		rect.top = view.getTop();
	//   24   42:aload_1         
	//   25   43:aload_2         
	//   26   44:invokevirtual   #412 <Method int View.getTop()>
	//   27   47:putfield        #415 <Field int Rect.top>
		rect.bottom = view.getBottom();
	//   28   50:aload_1         
	//   29   51:aload_2         
	//   30   52:invokevirtual   #418 <Method int View.getBottom()>
	//   31   55:putfield        #421 <Field int Rect.bottom>
		for(view = ((View) (view.getParent())); (view instanceof ViewGroup) && view != this; view = ((View) (((ViewGroup) (view)).getParent())))
	//*  32   58:aload_2         
	//*  33   59:invokevirtual   #425 <Method ViewParent View.getParent()>
	//*  34   62:astore_2        
	//*  35   63:aload_2         
	//*  36   64:instanceof      #4   <Class ViewGroup>
	//*  37   67:ifeq            140
	//*  38   70:aload_2         
	//*  39   71:aload_0         
	//*  40   72:if_acmpeq       140
		{
			view = ((View) ((ViewGroup)view));
	//   41   75:aload_2         
	//   42   76:checkcast       #4   <Class ViewGroup>
	//   43   79:astore_2        
			rect.left = rect.left + ((ViewGroup) (view)).getLeft();
	//   44   80:aload_1         
	//   45   81:aload_1         
	//   46   82:getfield        #403 <Field int Rect.left>
	//   47   85:aload_2         
	//   48   86:invokevirtual   #426 <Method int ViewGroup.getLeft()>
	//   49   89:iadd            
	//   50   90:putfield        #403 <Field int Rect.left>
			rect.right = rect.right + ((ViewGroup) (view)).getRight();
	//   51   93:aload_1         
	//   52   94:aload_1         
	//   53   95:getfield        #409 <Field int Rect.right>
	//   54   98:aload_2         
	//   55   99:invokevirtual   #427 <Method int ViewGroup.getRight()>
	//   56  102:iadd            
	//   57  103:putfield        #409 <Field int Rect.right>
			rect.top = rect.top + ((ViewGroup) (view)).getTop();
	//   58  106:aload_1         
	//   59  107:aload_1         
	//   60  108:getfield        #415 <Field int Rect.top>
	//   61  111:aload_2         
	//   62  112:invokevirtual   #428 <Method int ViewGroup.getTop()>
	//   63  115:iadd            
	//   64  116:putfield        #415 <Field int Rect.top>
			rect.bottom = rect.bottom + ((ViewGroup) (view)).getBottom();
	//   65  119:aload_1         
	//   66  120:aload_1         
	//   67  121:getfield        #421 <Field int Rect.bottom>
	//   68  124:aload_2         
	//   69  125:invokevirtual   #429 <Method int ViewGroup.getBottom()>
	//   70  128:iadd            
	//   71  129:putfield        #421 <Field int Rect.bottom>
		}

	//   72  132:aload_2         
	//   73  133:invokevirtual   #430 <Method ViewParent ViewGroup.getParent()>
	//   74  136:astore_2        
	//*  75  137:goto            63
		return rect;
	//   76  140:aload_1         
	//   77  141:areturn         
	//*  78  142:goto            12
	}

	private int getClientWidth()
	{
		return getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #433 <Method int getMeasuredWidth()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #436 <Method int getPaddingLeft()>
	//    4    8:isub            
	//    5    9:aload_0         
	//    6   10:invokevirtual   #439 <Method int getPaddingRight()>
	//    7   13:isub            
	//    8   14:ireturn         
	}

	private ItemInfo infoForCurrentScrollPosition()
	{
		int i = getClientWidth();
	//    0    0:aload_0         
	//    1    1:invokespecial   #242 <Method int getClientWidth()>
	//    2    4:istore          5
		float f;
		float f1;
		float f2;
		float f3;
		boolean flag;
		int j;
		ItemInfo iteminfo1;
		if(i > 0)
	//*   3    6:iload           5
	//*   4    8:ifle            209
			f = (float)getScrollX() / (float)i;
	//    5   11:aload_0         
	//    6   12:invokevirtual   #283 <Method int getScrollX()>
	//    7   15:i2f             
	//    8   16:iload           5
	//    9   18:i2f             
	//   10   19:fdiv            
	//   11   20:fstore_1        
		else
	//*  12   21:iload           5
	//*  13   23:ifle            214
	//*  14   26:aload_0         
	//*  15   27:getfield        #244 <Field int mPageMargin>
	//*  16   30:i2f             
	//*  17   31:iload           5
	//*  18   33:i2f             
	//*  19   34:fdiv            
	//*  20   35:fstore_2        
	//*  21   36:fconst_0        
	//*  22   37:fstore          4
	//*  23   39:fconst_0        
	//*  24   40:fstore_3        
	//*  25   41:iconst_m1       
	//*  26   42:istore          7
	//*  27   44:iconst_0        
	//*  28   45:istore          5
	//*  29   47:iconst_1        
	//*  30   48:istore          6
	//*  31   50:aconst_null     
	//*  32   51:astore          9
	//*  33   53:aload           9
	//*  34   55:astore          10
	//*  35   57:iload           5
	//*  36   59:aload_0         
	//*  37   60:getfield        #188 <Field ArrayList mItems>
	//*  38   63:invokevirtual   #256 <Method int ArrayList.size()>
	//*  39   66:icmpge          206
	//*  40   69:aload_0         
	//*  41   70:getfield        #188 <Field ArrayList mItems>
	//*  42   73:iload           5
	//*  43   75:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//*  44   78:checkcast       #17  <Class ViewPager$ItemInfo>
	//*  45   81:astore          8
	//*  46   83:iload           6
	//*  47   85:ifne            249
	//*  48   88:aload           8
	//*  49   90:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  50   93:iload           7
	//*  51   95:iconst_1        
	//*  52   96:iadd            
	//*  53   97:icmpeq          249
	//*  54  100:aload_0         
	//*  55  101:getfield        #191 <Field ViewPager$ItemInfo mTempItem>
	//*  56  104:astore          8
	//*  57  106:aload           8
	//*  58  108:fload           4
	//*  59  110:fload_3         
	//*  60  111:fadd            
	//*  61  112:fload_2         
	//*  62  113:fadd            
	//*  63  114:putfield        #250 <Field float ViewPager$ItemInfo.offset>
	//*  64  117:aload           8
	//*  65  119:iload           7
	//*  66  121:iconst_1        
	//*  67  122:iadd            
	//*  68  123:putfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  69  126:aload           8
	//*  70  128:aload_0         
	//*  71  129:getfield        #233 <Field PagerAdapter mAdapter>
	//*  72  132:aload           8
	//*  73  134:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  74  137:invokevirtual   #264 <Method float PagerAdapter.getPageWidth(int)>
	//*  75  140:putfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//*  76  143:iload           5
	//*  77  145:iconst_1        
	//*  78  146:isub            
	//*  79  147:istore          5
	//*  80  149:aload           8
	//*  81  151:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//*  82  154:fstore_3        
	//*  83  155:aload           8
	//*  84  157:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//*  85  160:fstore          4
	//*  86  162:iload           6
	//*  87  164:ifne            177
	//*  88  167:aload           9
	//*  89  169:astore          10
	//*  90  171:fload_1         
	//*  91  172:fload_3         
	//*  92  173:fcmpl           
	//*  93  174:iflt            206
	//*  94  177:fload_1         
	//*  95  178:fload           4
	//*  96  180:fload_3         
	//*  97  181:fadd            
	//*  98  182:fload_2         
	//*  99  183:fadd            
	//* 100  184:fcmpg           
	//* 101  185:iflt            202
	//* 102  188:iload           5
	//* 103  190:aload_0         
	//* 104  191:getfield        #188 <Field ArrayList mItems>
	//* 105  194:invokevirtual   #256 <Method int ArrayList.size()>
	//* 106  197:iconst_1        
	//* 107  198:isub            
	//* 108  199:icmpne          219
	//* 109  202:aload           8
	//* 110  204:astore          10
	//* 111  206:aload           10
	//* 112  208:areturn         
			f = 0.0F;
	//  113  209:fconst_0        
	//  114  210:fstore_1        
		if(i > 0)
			f1 = (float)mPageMargin / (float)i;
		else
	//* 115  211:goto            21
			f1 = 0.0F;
	//  116  214:fconst_0        
	//  117  215:fstore_2        
		f3 = 0.0F;
		f2 = 0.0F;
		j = -1;
		i = 0;
		flag = true;
		iteminfo1 = null;
		do
		{
			ItemInfo iteminfo;
label0:
			{
				ItemInfo iteminfo2;
label1:
				{
					iteminfo2 = iteminfo1;
					if(i >= mItems.size())
						break label1;
					iteminfo = (ItemInfo)mItems.get(i);
					if(!flag && iteminfo.position != j + 1)
					{
						iteminfo = mTempItem;
						iteminfo.offset = f3 + f2 + f1;
						iteminfo.position = j + 1;
						iteminfo.widthFactor = mAdapter.getPageWidth(iteminfo.position);
						i--;
					}
					f2 = iteminfo.offset;
					f3 = iteminfo.widthFactor;
					if(!flag)
					{
						iteminfo2 = iteminfo1;
						if(f < f2)
							break label1;
					}
					if(f >= f3 + f2 + f1 && i != mItems.size() - 1)
						break label0;
					iteminfo2 = iteminfo;
				}
				return iteminfo2;
			}
	//* 118  216:goto            36
			j = iteminfo.position;
	//  119  219:aload           8
	//  120  221:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//  121  224:istore          7
			f3 = iteminfo.widthFactor;
	//  122  226:aload           8
	//  123  228:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  124  231:fstore          4
			flag = false;
	//  125  233:iconst_0        
	//  126  234:istore          6
			i++;
	//  127  236:iload           5
	//  128  238:iconst_1        
	//  129  239:iadd            
	//  130  240:istore          5
			iteminfo1 = iteminfo;
	//  131  242:aload           8
	//  132  244:astore          9
		} while(true);
	//  133  246:goto            53
	//* 134  249:goto            149
	}

	private static boolean isDecorView(View view)
	{
		return ((Object) (view)).getClass().getAnnotation(android/support/v4/view/ViewPager$DecorView) != null;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #450 <Method Class Object.getClass()>
	//    2    4:ldc1            #14  <Class ViewPager$DecorView>
	//    3    6:invokevirtual   #456 <Method Annotation Class.getAnnotation(Class)>
	//    4    9:ifnull          14
	//    5   12:iconst_1        
	//    6   13:ireturn         
	//    7   14:iconst_0        
	//    8   15:ireturn         
	}

	private boolean isGutterDrag(float f, float f1)
	{
		return f < (float)mGutterSize && f1 > 0.0F || f > (float)(getWidth() - mGutterSize) && f1 < 0.0F;
	//    0    0:fload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #461 <Field int mGutterSize>
	//    3    5:i2f             
	//    4    6:fcmpg           
	//    5    7:ifge            16
	//    6   10:fload_2         
	//    7   11:fconst_0        
	//    8   12:fcmpl           
	//    9   13:ifgt            37
	//   10   16:fload_1         
	//   11   17:aload_0         
	//   12   18:invokevirtual   #464 <Method int getWidth()>
	//   13   21:aload_0         
	//   14   22:getfield        #461 <Field int mGutterSize>
	//   15   25:isub            
	//   16   26:i2f             
	//   17   27:fcmpl           
	//   18   28:ifle            39
	//   19   31:fload_2         
	//   20   32:fconst_0        
	//   21   33:fcmpg           
	//   22   34:ifge            39
	//   23   37:iconst_1        
	//   24   38:ireturn         
	//   25   39:iconst_0        
	//   26   40:ireturn         
	}

	private void onSecondaryPointerUp(MotionEvent motionevent)
	{
		int i = motionevent.getActionIndex();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #471 <Method int MotionEvent.getActionIndex()>
	//    2    4:istore_2        
		if(motionevent.getPointerId(i) == mActivePointerId)
	//*   3    5:aload_1         
	//*   4    6:iload_2         
	//*   5    7:invokevirtual   #474 <Method int MotionEvent.getPointerId(int)>
	//*   6   10:aload_0         
	//*   7   11:getfield        #212 <Field int mActivePointerId>
	//*   8   14:icmpne          55
		{
			if(i == 0)
	//*   9   17:iload_2         
	//*  10   18:ifne            56
				i = 1;
	//   11   21:iconst_1        
	//   12   22:istore_2        
			else
	//*  13   23:aload_0         
	//*  14   24:aload_1         
	//*  15   25:iload_2         
	//*  16   26:invokevirtual   #477 <Method float MotionEvent.getX(int)>
	//*  17   29:putfield        #479 <Field float mLastMotionX>
	//*  18   32:aload_0         
	//*  19   33:aload_1         
	//*  20   34:iload_2         
	//*  21   35:invokevirtual   #474 <Method int MotionEvent.getPointerId(int)>
	//*  22   38:putfield        #212 <Field int mActivePointerId>
	//*  23   41:aload_0         
	//*  24   42:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//*  25   45:ifnull          55
	//*  26   48:aload_0         
	//*  27   49:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//*  28   52:invokevirtual   #482 <Method void VelocityTracker.clear()>
	//*  29   55:return          
				i = 0;
	//   30   56:iconst_0        
	//   31   57:istore_2        
			mLastMotionX = motionevent.getX(i);
			mActivePointerId = motionevent.getPointerId(i);
			if(mVelocityTracker != null)
				mVelocityTracker.clear();
		}
	//*  32   58:goto            23
	}

	private boolean pageScrolled(int i)
	{
		if(mItems.size() != 0)
			break MISSING_BLOCK_LABEL_49;
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field ArrayList mItems>
	//    2    4:invokevirtual   #256 <Method int ArrayList.size()>
	//    3    7:ifne            49
		if(!mFirstLayout) goto _L2; else goto _L1
	//    4   10:aload_0         
	//    5   11:getfield        #214 <Field boolean mFirstLayout>
	//    6   14:ifeq            19
_L1:
		return false;
	//    7   17:iconst_0        
	//    8   18:ireturn         
_L2:
		mCalledSuper = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #484 <Field boolean mCalledSuper>
		onPageScrolled(0, 0.0F, 0);
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:fconst_0        
	//   15   27:iconst_0        
	//   16   28:invokevirtual   #485 <Method void onPageScrolled(int, float, int)>
		if(mCalledSuper) goto _L1; else goto _L3
	//   17   31:aload_0         
	//   18   32:getfield        #484 <Field boolean mCalledSuper>
	//   19   35:ifne            17
_L3:
		throw new IllegalStateException("onPageScrolled did not call superclass implementation");
	//   20   38:new             #487 <Class IllegalStateException>
	//   21   41:dup             
	//   22   42:ldc2            #489 <String "onPageScrolled did not call superclass implementation">
	//   23   45:invokespecial   #492 <Method void IllegalStateException(String)>
	//   24   48:athrow          
		ItemInfo iteminfo = infoForCurrentScrollPosition();
	//   25   49:aload_0         
	//   26   50:invokespecial   #494 <Method ViewPager$ItemInfo infoForCurrentScrollPosition()>
	//   27   53:astore          6
		int k = getClientWidth();
	//   28   55:aload_0         
	//   29   56:invokespecial   #242 <Method int getClientWidth()>
	//   30   59:istore          4
		int l = mPageMargin;
	//   31   61:aload_0         
	//   32   62:getfield        #244 <Field int mPageMargin>
	//   33   65:istore          5
		float f = (float)mPageMargin / (float)k;
	//   34   67:aload_0         
	//   35   68:getfield        #244 <Field int mPageMargin>
	//   36   71:i2f             
	//   37   72:iload           4
	//   38   74:i2f             
	//   39   75:fdiv            
	//   40   76:fstore_2        
		int j = iteminfo.position;
	//   41   77:aload           6
	//   42   79:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//   43   82:istore_3        
		f = ((float)i / (float)k - iteminfo.offset) / (iteminfo.widthFactor + f);
	//   44   83:iload_1         
	//   45   84:i2f             
	//   46   85:iload           4
	//   47   87:i2f             
	//   48   88:fdiv            
	//   49   89:aload           6
	//   50   91:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   51   94:fsub            
	//   52   95:aload           6
	//   53   97:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//   54  100:fload_2         
	//   55  101:fadd            
	//   56  102:fdiv            
	//   57  103:fstore_2        
		i = (int)((float)(l + k) * f);
	//   58  104:iload           5
	//   59  106:iload           4
	//   60  108:iadd            
	//   61  109:i2f             
	//   62  110:fload_2         
	//   63  111:fmul            
	//   64  112:f2i             
	//   65  113:istore_1        
		mCalledSuper = false;
	//   66  114:aload_0         
	//   67  115:iconst_0        
	//   68  116:putfield        #484 <Field boolean mCalledSuper>
		onPageScrolled(j, f, i);
	//   69  119:aload_0         
	//   70  120:iload_3         
	//   71  121:fload_2         
	//   72  122:iload_1         
	//   73  123:invokevirtual   #485 <Method void onPageScrolled(int, float, int)>
		if(!mCalledSuper)
	//*  74  126:aload_0         
	//*  75  127:getfield        #484 <Field boolean mCalledSuper>
	//*  76  130:ifne            144
			throw new IllegalStateException("onPageScrolled did not call superclass implementation");
	//   77  133:new             #487 <Class IllegalStateException>
	//   78  136:dup             
	//   79  137:ldc2            #489 <String "onPageScrolled did not call superclass implementation">
	//   80  140:invokespecial   #492 <Method void IllegalStateException(String)>
	//   81  143:athrow          
		else
			return true;
	//   82  144:iconst_1        
	//   83  145:ireturn         
	}

	private boolean performDrag(float f)
	{
		boolean flag3 = true;
	//    0    0:iconst_1        
	//    1    1:istore          9
		boolean flag2 = true;
	//    2    3:iconst_1        
	//    3    4:istore          8
		float f1 = mLastMotionX;
	//    4    6:aload_0         
	//    5    7:getfield        #479 <Field float mLastMotionX>
	//    6   10:fstore_2        
		mLastMotionX = f;
	//    7   11:aload_0         
	//    8   12:fload_1         
	//    9   13:putfield        #479 <Field float mLastMotionX>
		float f2 = (float)getScrollX() + (f1 - f);
	//   10   16:aload_0         
	//   11   17:invokevirtual   #283 <Method int getScrollX()>
	//   12   20:i2f             
	//   13   21:fload_2         
	//   14   22:fload_1         
	//   15   23:fsub            
	//   16   24:fadd            
	//   17   25:fstore_3        
		int i = getClientWidth();
	//   18   26:aload_0         
	//   19   27:invokespecial   #242 <Method int getClientWidth()>
	//   20   30:istore          7
		f = (float)i * mFirstOffset;
	//   21   32:iload           7
	//   22   34:i2f             
	//   23   35:aload_0         
	//   24   36:getfield        #205 <Field float mFirstOffset>
	//   25   39:fmul            
	//   26   40:fstore_1        
		f1 = i;
	//   27   41:iload           7
	//   28   43:i2f             
	//   29   44:fstore_2        
		float f3 = mLastOffset;
	//   30   45:aload_0         
	//   31   46:getfield        #208 <Field float mLastOffset>
	//   32   49:fstore          4
		ItemInfo iteminfo = (ItemInfo)mItems.get(0);
	//   33   51:aload_0         
	//   34   52:getfield        #188 <Field ArrayList mItems>
	//   35   55:iconst_0        
	//   36   56:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   37   59:checkcast       #17  <Class ViewPager$ItemInfo>
	//   38   62:astore          10
		ItemInfo iteminfo1 = (ItemInfo)mItems.get(mItems.size() - 1);
	//   39   64:aload_0         
	//   40   65:getfield        #188 <Field ArrayList mItems>
	//   41   68:aload_0         
	//   42   69:getfield        #188 <Field ArrayList mItems>
	//   43   72:invokevirtual   #256 <Method int ArrayList.size()>
	//   44   75:iconst_1        
	//   45   76:isub            
	//   46   77:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   47   80:checkcast       #17  <Class ViewPager$ItemInfo>
	//   48   83:astore          11
		boolean flag;
		boolean flag1;
		if(iteminfo.position != 0)
	//*  49   85:aload           10
	//*  50   87:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  51   90:ifeq            266
		{
			f = iteminfo.offset * (float)i;
	//   52   93:aload           10
	//   53   95:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   54   98:iload           7
	//   55  100:i2f             
	//   56  101:fmul            
	//   57  102:fstore_1        
			flag = false;
	//   58  103:iconst_0        
	//   59  104:istore          5
		} else
	//*  60  106:aload           11
	//*  61  108:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  62  111:aload_0         
	//*  63  112:getfield        #233 <Field PagerAdapter mAdapter>
	//*  64  115:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//*  65  118:iconst_1        
	//*  66  119:isub            
	//*  67  120:icmpeq          255
	//*  68  123:aload           11
	//*  69  125:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//*  70  128:iload           7
	//*  71  130:i2f             
	//*  72  131:fmul            
	//*  73  132:fstore_2        
	//*  74  133:iconst_0        
	//*  75  134:istore          6
	//*  76  136:fload_3         
	//*  77  137:fload_1         
	//*  78  138:fcmpg           
	//*  79  139:ifge            198
	//*  80  142:iload           5
	//*  81  144:ifeq            249
	//*  82  147:aload_0         
	//*  83  148:getfield        #498 <Field EdgeEffect mLeftEdge>
	//*  84  151:fload_1         
	//*  85  152:fload_3         
	//*  86  153:fsub            
	//*  87  154:invokestatic    #501 <Method float Math.abs(float)>
	//*  88  157:iload           7
	//*  89  159:i2f             
	//*  90  160:fdiv            
	//*  91  161:invokevirtual   #507 <Method void EdgeEffect.onPull(float)>
	//*  92  164:aload_0         
	//*  93  165:aload_0         
	//*  94  166:getfield        #479 <Field float mLastMotionX>
	//*  95  169:fload_1         
	//*  96  170:fload_1         
	//*  97  171:f2i             
	//*  98  172:i2f             
	//*  99  173:fsub            
	//* 100  174:fadd            
	//* 101  175:putfield        #479 <Field float mLastMotionX>
	//* 102  178:aload_0         
	//* 103  179:fload_1         
	//* 104  180:f2i             
	//* 105  181:aload_0         
	//* 106  182:invokevirtual   #286 <Method int getScrollY()>
	//* 107  185:invokevirtual   #296 <Method void scrollTo(int, int)>
	//* 108  188:aload_0         
	//* 109  189:fload_1         
	//* 110  190:f2i             
	//* 111  191:invokespecial   #300 <Method boolean pageScrolled(int)>
	//* 112  194:pop             
	//* 113  195:iload           8
	//* 114  197:ireturn         
	//* 115  198:fload_3         
	//* 116  199:fload_2         
	//* 117  200:fcmpl           
	//* 118  201:ifle            241
	//* 119  204:iload           6
	//* 120  206:ifeq            235
	//* 121  209:aload_0         
	//* 122  210:getfield        #509 <Field EdgeEffect mRightEdge>
	//* 123  213:fload_3         
	//* 124  214:fload_2         
	//* 125  215:fsub            
	//* 126  216:invokestatic    #501 <Method float Math.abs(float)>
	//* 127  219:iload           7
	//* 128  221:i2f             
	//* 129  222:fdiv            
	//* 130  223:invokevirtual   #507 <Method void EdgeEffect.onPull(float)>
	//* 131  226:iload           9
	//* 132  228:istore          8
	//* 133  230:fload_2         
	//* 134  231:fstore_1        
	//* 135  232:goto            164
	//* 136  235:iconst_0        
	//* 137  236:istore          8
	//* 138  238:goto            230
	//* 139  241:fload_3         
	//* 140  242:fstore_1        
	//* 141  243:iconst_0        
	//* 142  244:istore          8
	//* 143  246:goto            164
	//* 144  249:iconst_0        
	//* 145  250:istore          8
	//* 146  252:goto            164
	//* 147  255:fload_2         
	//* 148  256:fload           4
	//* 149  258:fmul            
	//* 150  259:fstore_2        
	//* 151  260:iconst_1        
	//* 152  261:istore          6
	//* 153  263:goto            136
		{
			flag = true;
	//  154  266:iconst_1        
	//  155  267:istore          5
		}
		if(iteminfo1.position != mAdapter.getCount() - 1)
		{
			f1 = iteminfo1.offset * (float)i;
			flag1 = false;
		} else
		{
			f1 *= f3;
			flag1 = true;
		}
		if(f2 < f)
		{
			if(flag)
				mLeftEdge.onPull(Math.abs(f - f2) / (float)i);
			else
				flag2 = false;
		} else
		if(f2 > f1)
		{
			if(flag1)
			{
				mRightEdge.onPull(Math.abs(f2 - f1) / (float)i);
				flag2 = flag3;
			} else
			{
				flag2 = false;
			}
			f = f1;
		} else
		{
			f = f2;
			flag2 = false;
		}
		mLastMotionX = mLastMotionX + (f - (float)(int)f);
		scrollTo((int)f, getScrollY());
		pageScrolled((int)f);
		return flag2;
	//* 156  269:goto            106
	}

	private void recomputeScrollPosition(int i, int j, int k, int l)
	{
		if(j <= 0 || mItems.isEmpty()) goto _L2; else goto _L1
	//    0    0:iload_2         
	//    1    1:ifle            107
	//    2    4:aload_0         
	//    3    5:getfield        #188 <Field ArrayList mItems>
	//    4    8:invokevirtual   #513 <Method boolean ArrayList.isEmpty()>
	//    5   11:ifne            107
_L1:
		if(mScroller.isFinished()) goto _L4; else goto _L3
	//    6   14:aload_0         
	//    7   15:getfield        #271 <Field Scroller mScroller>
	//    8   18:invokevirtual   #277 <Method boolean Scroller.isFinished()>
	//    9   21:ifne            41
_L3:
		mScroller.setFinalX(getCurrentItem() * getClientWidth());
	//   10   24:aload_0         
	//   11   25:getfield        #271 <Field Scroller mScroller>
	//   12   28:aload_0         
	//   13   29:invokevirtual   #516 <Method int getCurrentItem()>
	//   14   32:aload_0         
	//   15   33:invokespecial   #242 <Method int getClientWidth()>
	//   16   36:imul            
	//   17   37:invokevirtual   #519 <Method void Scroller.setFinalX(int)>
_L6:
		return;
	//   18   40:return          
_L4:
		int i1 = getPaddingLeft();
	//   19   41:aload_0         
	//   20   42:invokevirtual   #436 <Method int getPaddingLeft()>
	//   21   45:istore          6
		int j1 = getPaddingRight();
	//   22   47:aload_0         
	//   23   48:invokevirtual   #439 <Method int getPaddingRight()>
	//   24   51:istore          7
		int k1 = getPaddingLeft();
	//   25   53:aload_0         
	//   26   54:invokevirtual   #436 <Method int getPaddingLeft()>
	//   27   57:istore          8
		int l1 = getPaddingRight();
	//   28   59:aload_0         
	//   29   60:invokevirtual   #439 <Method int getPaddingRight()>
	//   30   63:istore          9
		float f = (float)getScrollX() / (float)((j - k1 - l1) + l);
	//   31   65:aload_0         
	//   32   66:invokevirtual   #283 <Method int getScrollX()>
	//   33   69:i2f             
	//   34   70:iload_2         
	//   35   71:iload           8
	//   36   73:isub            
	//   37   74:iload           9
	//   38   76:isub            
	//   39   77:iload           4
	//   40   79:iadd            
	//   41   80:i2f             
	//   42   81:fdiv            
	//   43   82:fstore          5
		scrollTo((int)((float)((i - i1 - j1) + k) * f), getScrollY());
	//   44   84:aload_0         
	//   45   85:iload_1         
	//   46   86:iload           6
	//   47   88:isub            
	//   48   89:iload           7
	//   49   91:isub            
	//   50   92:iload_3         
	//   51   93:iadd            
	//   52   94:i2f             
	//   53   95:fload           5
	//   54   97:fmul            
	//   55   98:f2i             
	//   56   99:aload_0         
	//   57  100:invokevirtual   #286 <Method int getScrollY()>
	//   58  103:invokevirtual   #296 <Method void scrollTo(int, int)>
		return;
	//   59  106:return          
_L2:
		ItemInfo iteminfo = infoForPosition(mCurItem);
	//   60  107:aload_0         
	//   61  108:aload_0         
	//   62  109:getfield        #337 <Field int mCurItem>
	//   63  112:invokevirtual   #523 <Method ViewPager$ItemInfo infoForPosition(int)>
	//   64  115:astore          10
		float f1;
		if(iteminfo != null)
	//*  65  117:aload           10
	//*  66  119:ifnull          176
			f1 = Math.min(iteminfo.offset, mLastOffset);
	//   67  122:aload           10
	//   68  124:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   69  127:aload_0         
	//   70  128:getfield        #208 <Field float mLastOffset>
	//   71  131:invokestatic    #526 <Method float Math.min(float, float)>
	//   72  134:fstore          5
		else
	//*  73  136:fload           5
	//*  74  138:iload_1         
	//*  75  139:aload_0         
	//*  76  140:invokevirtual   #436 <Method int getPaddingLeft()>
	//*  77  143:isub            
	//*  78  144:aload_0         
	//*  79  145:invokevirtual   #439 <Method int getPaddingRight()>
	//*  80  148:isub            
	//*  81  149:i2f             
	//*  82  150:fmul            
	//*  83  151:f2i             
	//*  84  152:istore_1        
	//*  85  153:iload_1         
	//*  86  154:aload_0         
	//*  87  155:invokevirtual   #283 <Method int getScrollX()>
	//*  88  158:icmpeq          40
	//*  89  161:aload_0         
	//*  90  162:iconst_0        
	//*  91  163:invokespecial   #528 <Method void completeScroll(boolean)>
	//*  92  166:aload_0         
	//*  93  167:iload_1         
	//*  94  168:aload_0         
	//*  95  169:invokevirtual   #286 <Method int getScrollY()>
	//*  96  172:invokevirtual   #296 <Method void scrollTo(int, int)>
	//*  97  175:return          
			f1 = 0.0F;
	//   98  176:fconst_0        
	//   99  177:fstore          5
		i = (int)(f1 * (float)(i - getPaddingLeft() - getPaddingRight()));
		if(i != getScrollX())
		{
			completeScroll(false);
			scrollTo(i, getScrollY());
			return;
		}
		if(true) goto _L6; else goto _L5
	//  100  179:goto            136
_L5:
	}

	private void removeNonDecorViews()
	{
		int j;
		for(int i = 0; i < getChildCount(); i = j + 1)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:invokevirtual   #367 <Method int getChildCount()>
	//*   5    7:icmpge          45
		{
			j = i;
	//    6   10:iload_1         
	//    7   11:istore_2        
			if(!((LayoutParams)getChildAt(i).getLayoutParams()).isDecor)
	//*   8   12:aload_0         
	//*   9   13:iload_1         
	//*  10   14:invokevirtual   #373 <Method View getChildAt(int)>
	//*  11   17:invokevirtual   #533 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  12   20:checkcast       #20  <Class ViewPager$LayoutParams>
	//*  13   23:getfield        #536 <Field boolean ViewPager$LayoutParams.isDecor>
	//*  14   26:ifne            38
			{
				removeViewAt(i);
	//   15   29:aload_0         
	//   16   30:iload_1         
	//   17   31:invokevirtual   #539 <Method void removeViewAt(int)>
				j = i - 1;
	//   18   34:iload_1         
	//   19   35:iconst_1        
	//   20   36:isub            
	//   21   37:istore_2        
			}
		}

	//   22   38:iload_2         
	//   23   39:iconst_1        
	//   24   40:iadd            
	//   25   41:istore_1        
	//*  26   42:goto            2
	//   27   45:return          
	}

	private void requestParentDisallowInterceptTouchEvent(boolean flag)
	{
		ViewParent viewparent = getParent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #541 <Method ViewParent getParent()>
	//    2    4:astore_2        
		if(viewparent != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			viewparent.requestDisallowInterceptTouchEvent(flag);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokeinterface #546 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
	//    8   16:return          
	}

	private boolean resetTouch()
	{
		mActivePointerId = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #212 <Field int mActivePointerId>
		endDrag();
	//    3    5:aload_0         
	//    4    6:invokespecial   #549 <Method void endDrag()>
		mLeftEdge.onRelease();
	//    5    9:aload_0         
	//    6   10:getfield        #498 <Field EdgeEffect mLeftEdge>
	//    7   13:invokevirtual   #552 <Method void EdgeEffect.onRelease()>
		mRightEdge.onRelease();
	//    8   16:aload_0         
	//    9   17:getfield        #509 <Field EdgeEffect mRightEdge>
	//   10   20:invokevirtual   #552 <Method void EdgeEffect.onRelease()>
		return mLeftEdge.isFinished() || mRightEdge.isFinished();
	//   11   23:aload_0         
	//   12   24:getfield        #498 <Field EdgeEffect mLeftEdge>
	//   13   27:invokevirtual   #553 <Method boolean EdgeEffect.isFinished()>
	//   14   30:ifne            43
	//   15   33:aload_0         
	//   16   34:getfield        #509 <Field EdgeEffect mRightEdge>
	//   17   37:invokevirtual   #553 <Method boolean EdgeEffect.isFinished()>
	//   18   40:ifeq            45
	//   19   43:iconst_1        
	//   20   44:ireturn         
	//   21   45:iconst_0        
	//   22   46:ireturn         
	}

	private void scrollToItem(int i, boolean flag, int j, boolean flag1)
	{
		ItemInfo iteminfo = infoForPosition(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #523 <Method ViewPager$ItemInfo infoForPosition(int)>
	//    3    5:astore          7
		int k;
		if(iteminfo != null)
	//*   4    7:aload           7
	//*   5    9:ifnull          97
		{
			float f = getClientWidth();
	//    6   12:aload_0         
	//    7   13:invokespecial   #242 <Method int getClientWidth()>
	//    8   16:i2f             
	//    9   17:fstore          5
			k = (int)(Math.max(mFirstOffset, Math.min(iteminfo.offset, mLastOffset)) * f);
	//   10   19:aload_0         
	//   11   20:getfield        #205 <Field float mFirstOffset>
	//   12   23:aload           7
	//   13   25:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   14   28:aload_0         
	//   15   29:getfield        #208 <Field float mLastOffset>
	//   16   32:invokestatic    #526 <Method float Math.min(float, float)>
	//   17   35:invokestatic    #557 <Method float Math.max(float, float)>
	//   18   38:fload           5
	//   19   40:fmul            
	//   20   41:f2i             
	//   21   42:istore          6
		} else
	//*  22   44:iload_2         
	//*  23   45:ifeq            67
	//*  24   48:aload_0         
	//*  25   49:iload           6
	//*  26   51:iconst_0        
	//*  27   52:iload_3         
	//*  28   53:invokevirtual   #561 <Method void smoothScrollTo(int, int, int)>
	//*  29   56:iload           4
	//*  30   58:ifeq            66
	//*  31   61:aload_0         
	//*  32   62:iload_1         
	//*  33   63:invokespecial   #563 <Method void dispatchOnPageSelected(int)>
	//*  34   66:return          
	//*  35   67:iload           4
	//*  36   69:ifeq            77
	//*  37   72:aload_0         
	//*  38   73:iload_1         
	//*  39   74:invokespecial   #563 <Method void dispatchOnPageSelected(int)>
	//*  40   77:aload_0         
	//*  41   78:iconst_0        
	//*  42   79:invokespecial   #528 <Method void completeScroll(boolean)>
	//*  43   82:aload_0         
	//*  44   83:iload           6
	//*  45   85:iconst_0        
	//*  46   86:invokevirtual   #296 <Method void scrollTo(int, int)>
	//*  47   89:aload_0         
	//*  48   90:iload           6
	//*  49   92:invokespecial   #300 <Method boolean pageScrolled(int)>
	//*  50   95:pop             
	//*  51   96:return          
		{
			k = 0;
	//   52   97:iconst_0        
	//   53   98:istore          6
		}
		if(flag)
		{
			smoothScrollTo(k, 0, j);
			if(flag1)
				dispatchOnPageSelected(i);
			return;
		}
		if(flag1)
			dispatchOnPageSelected(i);
		completeScroll(false);
		scrollTo(k, 0);
		pageScrolled(k);
	//*  54  100:goto            44
	}

	private void setScrollingCacheEnabled(boolean flag)
	{
		if(mScrollingCacheEnabled != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #565 <Field boolean mScrollingCacheEnabled>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          13
			mScrollingCacheEnabled = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #565 <Field boolean mScrollingCacheEnabled>
	//    7   13:return          
	}

	private void sortChildDrawingOrder()
	{
		if(mDrawingOrder != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #568 <Field int mDrawingOrder>
	//*   2    4:ifeq            79
		{
			int j;
			if(mDrawingOrderedChildren == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #570 <Field ArrayList mDrawingOrderedChildren>
	//*   5   11:ifnonnull       59
				mDrawingOrderedChildren = new ArrayList();
	//    6   14:aload_0         
	//    7   15:new             #185 <Class ArrayList>
	//    8   18:dup             
	//    9   19:invokespecial   #186 <Method void ArrayList()>
	//   10   22:putfield        #570 <Field ArrayList mDrawingOrderedChildren>
			else
	//*  11   25:aload_0         
	//*  12   26:invokevirtual   #367 <Method int getChildCount()>
	//*  13   29:istore_2        
	//*  14   30:iconst_0        
	//*  15   31:istore_1        
	//*  16   32:iload_1         
	//*  17   33:iload_2         
	//*  18   34:icmpge          69
	//*  19   37:aload_0         
	//*  20   38:iload_1         
	//*  21   39:invokevirtual   #373 <Method View getChildAt(int)>
	//*  22   42:astore_3        
	//*  23   43:aload_0         
	//*  24   44:getfield        #570 <Field ArrayList mDrawingOrderedChildren>
	//*  25   47:aload_3         
	//*  26   48:invokevirtual   #574 <Method boolean ArrayList.add(Object)>
	//*  27   51:pop             
	//*  28   52:iload_1         
	//*  29   53:iconst_1        
	//*  30   54:iadd            
	//*  31   55:istore_1        
	//*  32   56:goto            32
				mDrawingOrderedChildren.clear();
	//   33   59:aload_0         
	//   34   60:getfield        #570 <Field ArrayList mDrawingOrderedChildren>
	//   35   63:invokevirtual   #575 <Method void ArrayList.clear()>
			j = getChildCount();
			for(int i = 0; i < j; i++)
			{
				View view = getChildAt(i);
				mDrawingOrderedChildren.add(((Object) (view)));
			}

	//*  36   66:goto            25
			Collections.sort(((List) (mDrawingOrderedChildren)), ((Comparator) (sPositionComparator)));
	//   37   69:aload_0         
	//   38   70:getfield        #570 <Field ArrayList mDrawingOrderedChildren>
	//   39   73:getstatic       #179 <Field ViewPager$ViewPositionComparator sPositionComparator>
	//   40   76:invokestatic    #581 <Method void Collections.sort(List, Comparator)>
		}
	//   41   79:return          
	}

	public void addFocusables(ArrayList arraylist, int i, int j)
	{
		int l = arraylist.size();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #256 <Method int ArrayList.size()>
	//    2    4:istore          5
		int i1 = getDescendantFocusability();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #586 <Method int getDescendantFocusability()>
	//    5   10:istore          6
		if(i1 != 0x60000)
	//*   6   12:iload           6
	//*   7   14:ldc2            #587 <Int 0x60000>
	//*   8   17:icmpeq          90
		{
			for(int k = 0; k < getChildCount(); k++)
	//*   9   20:iconst_0        
	//*  10   21:istore          4
	//*  11   23:iload           4
	//*  12   25:aload_0         
	//*  13   26:invokevirtual   #367 <Method int getChildCount()>
	//*  14   29:icmpge          90
			{
				View view = getChildAt(k);
	//   15   32:aload_0         
	//   16   33:iload           4
	//   17   35:invokevirtual   #373 <Method View getChildAt(int)>
	//   18   38:astore          7
				if(view.getVisibility() == 0)
	//*  19   40:aload           7
	//*  20   42:invokevirtual   #590 <Method int View.getVisibility()>
	//*  21   45:ifne            81
				{
					ItemInfo iteminfo = infoForChild(view);
	//   22   48:aload_0         
	//   23   49:aload           7
	//   24   51:invokevirtual   #594 <Method ViewPager$ItemInfo infoForChild(View)>
	//   25   54:astore          8
					if(iteminfo != null && iteminfo.position == mCurItem)
	//*  26   56:aload           8
	//*  27   58:ifnull          81
	//*  28   61:aload           8
	//*  29   63:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  30   66:aload_0         
	//*  31   67:getfield        #337 <Field int mCurItem>
	//*  32   70:icmpne          81
						view.addFocusables(arraylist, i, j);
	//   33   73:aload           7
	//   34   75:aload_1         
	//   35   76:iload_2         
	//   36   77:iload_3         
	//   37   78:invokevirtual   #596 <Method void View.addFocusables(ArrayList, int, int)>
				}
			}

	//   38   81:iload           4
	//   39   83:iconst_1        
	//   40   84:iadd            
	//   41   85:istore          4
		}
	//*  42   87:goto            23
		while(i1 == 0x40000 && l != arraylist.size() || !isFocusable() || (j & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode() || arraylist == null) 
	//*  43   90:iload           6
	//*  44   92:ldc2            #597 <Int 0x40000>
	//*  45   95:icmpne          107
	//*  46   98:iload           5
	//*  47  100:aload_1         
	//*  48  101:invokevirtual   #256 <Method int ArrayList.size()>
	//*  49  104:icmpne          114
	//*  50  107:aload_0         
	//*  51  108:invokevirtual   #600 <Method boolean isFocusable()>
	//*  52  111:ifne            115
			return;
	//   53  114:return          
	//   54  115:iload_3         
	//   55  116:iconst_1        
	//   56  117:iand            
	//   57  118:iconst_1        
	//   58  119:icmpne          136
	//   59  122:aload_0         
	//   60  123:invokevirtual   #603 <Method boolean isInTouchMode()>
	//   61  126:ifeq            136
	//   62  129:aload_0         
	//   63  130:invokevirtual   #606 <Method boolean isFocusableInTouchMode()>
	//   64  133:ifeq            114
	//   65  136:aload_1         
	//   66  137:ifnull          114
		arraylist.add(((Object) (this)));
	//   67  140:aload_1         
	//   68  141:aload_0         
	//   69  142:invokevirtual   #574 <Method boolean ArrayList.add(Object)>
	//   70  145:pop             
	//   71  146:return          
	}

	ItemInfo addNewItem(int i, int j)
	{
		ItemInfo iteminfo = new ItemInfo();
	//    0    0:new             #17  <Class ViewPager$ItemInfo>
	//    1    3:dup             
	//    2    4:invokespecial   #189 <Method void ViewPager$ItemInfo()>
	//    3    7:astore_3        
		iteminfo.position = i;
	//    4    8:aload_3         
	//    5    9:iload_1         
	//    6   10:putfield        #247 <Field int ViewPager$ItemInfo.position>
		iteminfo.object = mAdapter.instantiateItem(((ViewGroup) (this)), i);
	//    7   13:aload_3         
	//    8   14:aload_0         
	//    9   15:getfield        #233 <Field PagerAdapter mAdapter>
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:invokevirtual   #614 <Method Object PagerAdapter.instantiateItem(ViewGroup, int)>
	//   13   23:putfield        #618 <Field Object ViewPager$ItemInfo.object>
		iteminfo.widthFactor = mAdapter.getPageWidth(i);
	//   14   26:aload_3         
	//   15   27:aload_0         
	//   16   28:getfield        #233 <Field PagerAdapter mAdapter>
	//   17   31:iload_1         
	//   18   32:invokevirtual   #264 <Method float PagerAdapter.getPageWidth(int)>
	//   19   35:putfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
		if(j < 0 || j >= mItems.size())
	//*  20   38:iload_2         
	//*  21   39:iflt            53
	//*  22   42:iload_2         
	//*  23   43:aload_0         
	//*  24   44:getfield        #188 <Field ArrayList mItems>
	//*  25   47:invokevirtual   #256 <Method int ArrayList.size()>
	//*  26   50:icmplt          64
		{
			mItems.add(((Object) (iteminfo)));
	//   27   53:aload_0         
	//   28   54:getfield        #188 <Field ArrayList mItems>
	//   29   57:aload_3         
	//   30   58:invokevirtual   #574 <Method boolean ArrayList.add(Object)>
	//   31   61:pop             
			return iteminfo;
	//   32   62:aload_3         
	//   33   63:areturn         
		} else
		{
			mItems.add(j, ((Object) (iteminfo)));
	//   34   64:aload_0         
	//   35   65:getfield        #188 <Field ArrayList mItems>
	//   36   68:iload_2         
	//   37   69:aload_3         
	//   38   70:invokevirtual   #621 <Method void ArrayList.add(int, Object)>
			return iteminfo;
	//   39   73:aload_3         
	//   40   74:areturn         
		}
	}

	public void addOnAdapterChangeListener(OnAdapterChangeListener onadapterchangelistener)
	{
		if(mAdapterChangeListeners == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #625 <Field List mAdapterChangeListeners>
	//*   2    4:ifnonnull       18
			mAdapterChangeListeners = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #185 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #186 <Method void ArrayList()>
	//    7   15:putfield        #625 <Field List mAdapterChangeListeners>
		mAdapterChangeListeners.add(((Object) (onadapterchangelistener)));
	//    8   18:aload_0         
	//    9   19:getfield        #625 <Field List mAdapterChangeListeners>
	//   10   22:aload_1         
	//   11   23:invokeinterface #626 <Method boolean List.add(Object)>
	//   12   28:pop             
	//   13   29:return          
	}

	public void addOnPageChangeListener(OnPageChangeListener onpagechangelistener)
	{
		if(mOnPageChangeListeners == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #348 <Field List mOnPageChangeListeners>
	//*   2    4:ifnonnull       18
			mOnPageChangeListeners = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #185 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #186 <Method void ArrayList()>
	//    7   15:putfield        #348 <Field List mOnPageChangeListeners>
		mOnPageChangeListeners.add(((Object) (onpagechangelistener)));
	//    8   18:aload_0         
	//    9   19:getfield        #348 <Field List mOnPageChangeListeners>
	//   10   22:aload_1         
	//   11   23:invokeinterface #626 <Method boolean List.add(Object)>
	//   12   28:pop             
	//   13   29:return          
	}

	public void addTouchables(ArrayList arraylist)
	{
		for(int i = 0; i < getChildCount(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:invokevirtual   #367 <Method int getChildCount()>
	//*   5    7:icmpge          59
		{
			View view = getChildAt(i);
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #373 <Method View getChildAt(int)>
	//    9   15:astore_3        
			if(view.getVisibility() != 0)
				continue;
	//   10   16:aload_3         
	//   11   17:invokevirtual   #590 <Method int View.getVisibility()>
	//   12   20:ifne            52
			ItemInfo iteminfo = infoForChild(view);
	//   13   23:aload_0         
	//   14   24:aload_3         
	//   15   25:invokevirtual   #594 <Method ViewPager$ItemInfo infoForChild(View)>
	//   16   28:astore          4
			if(iteminfo != null && iteminfo.position == mCurItem)
	//*  17   30:aload           4
	//*  18   32:ifnull          52
	//*  19   35:aload           4
	//*  20   37:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  21   40:aload_0         
	//*  22   41:getfield        #337 <Field int mCurItem>
	//*  23   44:icmpne          52
				view.addTouchables(arraylist);
	//   24   47:aload_3         
	//   25   48:aload_1         
	//   26   49:invokevirtual   #632 <Method void View.addTouchables(ArrayList)>
		}

	//   27   52:iload_2         
	//   28   53:iconst_1        
	//   29   54:iadd            
	//   30   55:istore_2        
	//*  31   56:goto            2
	//   32   59:return          
	}

	public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(!checkLayoutParams(layoutparams))
	//*   0    0:aload_0         
	//*   1    1:aload_3         
	//*   2    2:invokevirtual   #639 <Method boolean checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//*   3    5:ifne            89
			layoutparams = generateLayoutParams(layoutparams);
	//    4    8:aload_0         
	//    5    9:aload_3         
	//    6   10:invokevirtual   #643 <Method android.view.ViewGroup$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    7   13:astore_3        
		LayoutParams layoutparams1 = (LayoutParams)layoutparams;
	//    8   14:aload_3         
	//    9   15:checkcast       #20  <Class ViewPager$LayoutParams>
	//   10   18:astore          4
		layoutparams1.isDecor = layoutparams1.isDecor | isDecorView(view);
	//   11   20:aload           4
	//   12   22:aload           4
	//   13   24:getfield        #536 <Field boolean ViewPager$LayoutParams.isDecor>
	//   14   27:aload_1         
	//   15   28:invokestatic    #645 <Method boolean isDecorView(View)>
	//   16   31:ior             
	//   17   32:putfield        #536 <Field boolean ViewPager$LayoutParams.isDecor>
		if(mInLayout)
	//*  18   35:aload_0         
	//*  19   36:getfield        #647 <Field boolean mInLayout>
	//*  20   39:ifeq            81
		{
			if(layoutparams1 != null && layoutparams1.isDecor)
	//*  21   42:aload           4
	//*  22   44:ifnull          66
	//*  23   47:aload           4
	//*  24   49:getfield        #536 <Field boolean ViewPager$LayoutParams.isDecor>
	//*  25   52:ifeq            66
			{
				throw new IllegalStateException("Cannot add pager decor view during layout");
	//   26   55:new             #487 <Class IllegalStateException>
	//   27   58:dup             
	//   28   59:ldc2            #649 <String "Cannot add pager decor view during layout">
	//   29   62:invokespecial   #492 <Method void IllegalStateException(String)>
	//   30   65:athrow          
			} else
			{
				layoutparams1.needsMeasure = true;
	//   31   66:aload           4
	//   32   68:iconst_1        
	//   33   69:putfield        #652 <Field boolean ViewPager$LayoutParams.needsMeasure>
				addViewInLayout(view, i, layoutparams);
	//   34   72:aload_0         
	//   35   73:aload_1         
	//   36   74:iload_2         
	//   37   75:aload_3         
	//   38   76:invokevirtual   #656 <Method boolean addViewInLayout(View, int, android.view.ViewGroup$LayoutParams)>
	//   39   79:pop             
				return;
	//   40   80:return          
			}
		} else
		{
			super.addView(view, i, layoutparams);
	//   41   81:aload_0         
	//   42   82:aload_1         
	//   43   83:iload_2         
	//   44   84:aload_3         
	//   45   85:invokespecial   #658 <Method void ViewGroup.addView(View, int, android.view.ViewGroup$LayoutParams)>
			return;
	//   46   88:return          
		}
	//*  47   89:goto            14
	}

	public boolean arrowScroll(int i)
	{
		View view = findFocus();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #663 <Method View findFocus()>
	//    2    4:astore          6
		if(view != this) goto _L2; else goto _L1
	//    3    6:aload           6
	//    4    8:aload_0         
	//    5    9:if_acmpne       105
_L1:
		Object obj = null;
	//    6   12:aconst_null     
	//    7   13:astore          5
_L13:
		view = FocusFinder.getInstance().findNextFocus(((ViewGroup) (this)), ((View) (obj)), i);
	//    8   15:invokestatic    #669 <Method FocusFinder FocusFinder.getInstance()>
	//    9   18:aload_0         
	//   10   19:aload           5
	//   11   21:iload_1         
	//   12   22:invokevirtual   #673 <Method View FocusFinder.findNextFocus(ViewGroup, View, int)>
	//   13   25:astore          6
		if(view == null || view == obj) goto _L4; else goto _L3
	//   14   27:aload           6
	//   15   29:ifnull          328
	//   16   32:aload           6
	//   17   34:aload           5
	//   18   36:if_acmpeq       328
_L3:
		if(i != 17) goto _L6; else goto _L5
	//   19   39:iload_1         
	//   20   40:bipush          17
	//   21   42:icmpne          265
_L5:
		int j;
		boolean flag;
		j = getChildRectInPagerCoordinates(mTempRect, view).left;
	//   22   45:aload_0         
	//   23   46:aload_0         
	//   24   47:getfield        #196 <Field Rect mTempRect>
	//   25   50:aload           6
	//   26   52:invokespecial   #675 <Method Rect getChildRectInPagerCoordinates(Rect, View)>
	//   27   55:getfield        #403 <Field int Rect.left>
	//   28   58:istore_2        
		int k = getChildRectInPagerCoordinates(mTempRect, ((View) (obj))).left;
	//   29   59:aload_0         
	//   30   60:aload_0         
	//   31   61:getfield        #196 <Field Rect mTempRect>
	//   32   64:aload           5
	//   33   66:invokespecial   #675 <Method Rect getChildRectInPagerCoordinates(Rect, View)>
	//   34   69:getfield        #403 <Field int Rect.left>
	//   35   72:istore_3        
		StringBuilder stringbuilder;
		if(obj != null && j >= k)
	//*  36   73:aload           5
	//*  37   75:ifnull          255
	//*  38   78:iload_2         
	//*  39   79:iload_3         
	//*  40   80:icmplt          255
			flag = pageLeft();
	//   41   83:aload_0         
	//   42   84:invokevirtual   #678 <Method boolean pageLeft()>
	//   43   87:istore          4
		else
	//*  44   89:iload           4
	//*  45   91:ifeq            102
	//*  46   94:aload_0         
	//*  47   95:iload_1         
	//*  48   96:invokestatic    #683 <Method int SoundEffectConstants.getContantForFocusDirection(int)>
	//*  49   99:invokevirtual   #686 <Method void playSoundEffect(int)>
	//*  50  102:iload           4
	//*  51  104:ireturn         
	//*  52  105:aload           6
	//*  53  107:ifnull          374
	//*  54  110:aload           6
	//*  55  112:invokevirtual   #425 <Method ViewParent View.getParent()>
	//*  56  115:astore          5
	//*  57  117:aload           5
	//*  58  119:instanceof      #4   <Class ViewGroup>
	//*  59  122:ifeq            381
	//*  60  125:aload           5
	//*  61  127:aload_0         
	//*  62  128:if_acmpne       207
	//*  63  131:iconst_1        
	//*  64  132:istore_2        
	//*  65  133:iload_2         
	//*  66  134:ifne            374
	//*  67  137:new             #688 <Class StringBuilder>
	//*  68  140:dup             
	//*  69  141:invokespecial   #689 <Method void StringBuilder()>
	//*  70  144:astore          7
	//*  71  146:aload           7
	//*  72  148:aload           6
	//*  73  150:invokevirtual   #450 <Method Class Object.getClass()>
	//*  74  153:invokevirtual   #693 <Method String Class.getSimpleName()>
	//*  75  156:invokevirtual   #697 <Method StringBuilder StringBuilder.append(String)>
	//*  76  159:pop             
	//*  77  160:aload           6
	//*  78  162:invokevirtual   #425 <Method ViewParent View.getParent()>
	//*  79  165:astore          5
	//*  80  167:aload           5
	//*  81  169:instanceof      #4   <Class ViewGroup>
	//*  82  172:ifeq            219
	//*  83  175:aload           7
	//*  84  177:ldc2            #699 <String " => ">
	//*  85  180:invokevirtual   #697 <Method StringBuilder StringBuilder.append(String)>
	//*  86  183:aload           5
	//*  87  185:invokevirtual   #450 <Method Class Object.getClass()>
	//*  88  188:invokevirtual   #693 <Method String Class.getSimpleName()>
	//*  89  191:invokevirtual   #697 <Method StringBuilder StringBuilder.append(String)>
	//*  90  194:pop             
	//*  91  195:aload           5
	//*  92  197:invokeinterface #700 <Method ViewParent ViewParent.getParent()>
	//*  93  202:astore          5
	//*  94  204:goto            167
	//*  95  207:aload           5
	//*  96  209:invokeinterface #700 <Method ViewParent ViewParent.getParent()>
	//*  97  214:astore          5
	//*  98  216:goto            117
	//*  99  219:ldc1            #80  <String "ViewPager">
	//* 100  221:new             #688 <Class StringBuilder>
	//* 101  224:dup             
	//* 102  225:invokespecial   #689 <Method void StringBuilder()>
	//* 103  228:ldc2            #702 <String "arrowScroll tried to find focus based on non-child current focused view ">
	//* 104  231:invokevirtual   #697 <Method StringBuilder StringBuilder.append(String)>
	//* 105  234:aload           7
	//* 106  236:invokevirtual   #705 <Method String StringBuilder.toString()>
	//* 107  239:invokevirtual   #697 <Method StringBuilder StringBuilder.append(String)>
	//* 108  242:invokevirtual   #705 <Method String StringBuilder.toString()>
	//* 109  245:invokestatic    #711 <Method int Log.e(String, String)>
	//* 110  248:pop             
	//* 111  249:aconst_null     
	//* 112  250:astore          5
	//* 113  252:goto            15
			flag = view.requestFocus();
	//  114  255:aload           6
	//  115  257:invokevirtual   #714 <Method boolean View.requestFocus()>
	//  116  260:istore          4
_L16:
		if(flag)
			playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
		return flag;
_L2:
		if(view == null) goto _L8; else goto _L7
_L7:
		obj = ((Object) (view.getParent()));
_L12:
		if(!(obj instanceof ViewGroup))
			break MISSING_BLOCK_LABEL_381;
		if(obj != this) goto _L10; else goto _L9
_L9:
		j = 1;
_L18:
		if(j != 0) goto _L8; else goto _L11
_L10:
		obj = ((Object) (((ViewParent) (obj)).getParent()));
		  goto _L12
_L11:
		stringbuilder = new StringBuilder();
		stringbuilder.append(((Object) (view)).getClass().getSimpleName());
		for(obj = ((Object) (view.getParent())); obj instanceof ViewGroup; obj = ((Object) (((ViewParent) (obj)).getParent())))
			stringbuilder.append(" => ").append(obj.getClass().getSimpleName());

		Log.e("ViewPager", (new StringBuilder()).append("arrowScroll tried to find focus based on non-child current focused view ").append(stringbuilder.toString()).toString());
		obj = null;
		  goto _L13
	//* 117  262:goto            89
_L6:
		if(i != 66) goto _L15; else goto _L14
	//  118  265:iload_1         
	//  119  266:bipush          66
	//  120  268:icmpne          368
_L14:
		j = getChildRectInPagerCoordinates(mTempRect, view).left;
	//  121  271:aload_0         
	//  122  272:aload_0         
	//  123  273:getfield        #196 <Field Rect mTempRect>
	//  124  276:aload           6
	//  125  278:invokespecial   #675 <Method Rect getChildRectInPagerCoordinates(Rect, View)>
	//  126  281:getfield        #403 <Field int Rect.left>
	//  127  284:istore_2        
		int l = getChildRectInPagerCoordinates(mTempRect, ((View) (obj))).left;
	//  128  285:aload_0         
	//  129  286:aload_0         
	//  130  287:getfield        #196 <Field Rect mTempRect>
	//  131  290:aload           5
	//  132  292:invokespecial   #675 <Method Rect getChildRectInPagerCoordinates(Rect, View)>
	//  133  295:getfield        #403 <Field int Rect.left>
	//  134  298:istore_3        
		if(obj != null && j <= l)
	//* 135  299:aload           5
	//* 136  301:ifnull          318
	//* 137  304:iload_2         
	//* 138  305:iload_3         
	//* 139  306:icmpgt          318
			flag = pageRight();
	//  140  309:aload_0         
	//  141  310:invokevirtual   #717 <Method boolean pageRight()>
	//  142  313:istore          4
		else
	//* 143  315:goto            89
			flag = view.requestFocus();
	//  144  318:aload           6
	//  145  320:invokevirtual   #714 <Method boolean View.requestFocus()>
	//  146  323:istore          4
		  goto _L16
	//* 147  325:goto            89
_L4:
label0:
		{
			if(i != 17 && i != 1)
				break label0;
	//  148  328:iload_1         
	//  149  329:bipush          17
	//  150  331:icmpeq          339
	//  151  334:iload_1         
	//  152  335:iconst_1        
	//  153  336:icmpne          348
			flag = pageLeft();
	//  154  339:aload_0         
	//  155  340:invokevirtual   #678 <Method boolean pageLeft()>
	//  156  343:istore          4
		}
		  goto _L16
	//* 157  345:goto            89
		if(i != 66 && i != 2) goto _L15; else goto _L17
	//  158  348:iload_1         
	//  159  349:bipush          66
	//  160  351:icmpeq          359
	//  161  354:iload_1         
	//  162  355:iconst_2        
	//  163  356:icmpne          368
_L17:
		flag = pageRight();
	//  164  359:aload_0         
	//  165  360:invokevirtual   #717 <Method boolean pageRight()>
	//  166  363:istore          4
		  goto _L16
	//* 167  365:goto            89
_L15:
		flag = false;
	//  168  368:iconst_0        
	//  169  369:istore          4
		  goto _L16
	//* 170  371:goto            89
_L8:
		obj = ((Object) (view));
	//  171  374:aload           6
	//  172  376:astore          5
		  goto _L13
	//* 173  378:goto            15
		j = 0;
	//  174  381:iconst_0        
	//  175  382:istore_2        
		  goto _L18
	//* 176  383:goto            133
	}

	public boolean beginFakeDrag()
	{
		if(mIsBeingDragged)
	//*   0    0:aload_0         
	//*   1    1:getfield        #382 <Field boolean mIsBeingDragged>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		mFakeDragging = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #720 <Field boolean mFakeDragging>
		setScrollState(1);
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:invokevirtual   #723 <Method void setScrollState(int)>
		mLastMotionX = 0.0F;
	//   11   19:aload_0         
	//   12   20:fconst_0        
	//   13   21:putfield        #479 <Field float mLastMotionX>
		mInitialMotionX = 0.0F;
	//   14   24:aload_0         
	//   15   25:fconst_0        
	//   16   26:putfield        #725 <Field float mInitialMotionX>
		long l;
		MotionEvent motionevent;
		if(mVelocityTracker == null)
	//*  17   29:aload_0         
	//*  18   30:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//*  19   33:ifnonnull       76
			mVelocityTracker = VelocityTracker.obtain();
	//   20   36:aload_0         
	//   21   37:invokestatic    #729 <Method VelocityTracker VelocityTracker.obtain()>
	//   22   40:putfield        #386 <Field VelocityTracker mVelocityTracker>
		else
	//*  23   43:invokestatic    #735 <Method long SystemClock.uptimeMillis()>
	//*  24   46:lstore_1        
	//*  25   47:lload_1         
	//*  26   48:lload_1         
	//*  27   49:iconst_0        
	//*  28   50:fconst_0        
	//*  29   51:fconst_0        
	//*  30   52:iconst_0        
	//*  31   53:invokestatic    #738 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//*  32   56:astore_3        
	//*  33   57:aload_0         
	//*  34   58:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//*  35   61:aload_3         
	//*  36   62:invokevirtual   #741 <Method void VelocityTracker.addMovement(MotionEvent)>
	//*  37   65:aload_3         
	//*  38   66:invokevirtual   #742 <Method void MotionEvent.recycle()>
	//*  39   69:aload_0         
	//*  40   70:lload_1         
	//*  41   71:putfield        #744 <Field long mFakeDragBeginTime>
	//*  42   74:iconst_1        
	//*  43   75:ireturn         
			mVelocityTracker.clear();
	//   44   76:aload_0         
	//   45   77:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//   46   80:invokevirtual   #482 <Method void VelocityTracker.clear()>
		l = SystemClock.uptimeMillis();
		motionevent = MotionEvent.obtain(l, l, 0, 0.0F, 0.0F, 0);
		mVelocityTracker.addMovement(motionevent);
		motionevent.recycle();
		mFakeDragBeginTime = l;
		return true;
	//*  47   83:goto            43
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
	//    7   14:invokevirtual   #747 <Method int View.getScrollX()>
	//    8   17:istore          7
		j1 = view.getScrollY();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #748 <Method int View.getScrollY()>
	//   11   23:istore          8
		l = viewgroup.getChildCount() - 1;
	//   12   25:aload           9
	//   13   27:invokevirtual   #749 <Method int ViewGroup.getChildCount()>
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
	//   21   43:invokevirtual   #750 <Method View ViewGroup.getChildAt(int)>
	//   22   46:astore          10
		if(j + i1 < view1.getLeft() || j + i1 >= view1.getRight() || k + j1 < view1.getTop() || k + j1 >= view1.getBottom() || !canScroll(view1, true, i, (j + i1) - view1.getLeft(), (k + j1) - view1.getTop())) goto _L5; else goto _L4
	//   23   48:iload           4
	//   24   50:iload           7
	//   25   52:iadd            
	//   26   53:aload           10
	//   27   55:invokevirtual   #400 <Method int View.getLeft()>
	//   28   58:icmplt          135
	//   29   61:iload           4
	//   30   63:iload           7
	//   31   65:iadd            
	//   32   66:aload           10
	//   33   68:invokevirtual   #406 <Method int View.getRight()>
	//   34   71:icmpge          135
	//   35   74:iload           5
	//   36   76:iload           8
	//   37   78:iadd            
	//   38   79:aload           10
	//   39   81:invokevirtual   #412 <Method int View.getTop()>
	//   40   84:icmplt          135
	//   41   87:iload           5
	//   42   89:iload           8
	//   43   91:iadd            
	//   44   92:aload           10
	//   45   94:invokevirtual   #418 <Method int View.getBottom()>
	//   46   97:icmpge          135
	//   47  100:aload_0         
	//   48  101:aload           10
	//   49  103:iconst_1        
	//   50  104:iload_3         
	//   51  105:iload           4
	//   52  107:iload           7
	//   53  109:iadd            
	//   54  110:aload           10
	//   55  112:invokevirtual   #400 <Method int View.getLeft()>
	//   56  115:isub            
	//   57  116:iload           5
	//   58  118:iload           8
	//   59  120:iadd            
	//   60  121:aload           10
	//   61  123:invokevirtual   #412 <Method int View.getTop()>
	//   62  126:isub            
	//   63  127:invokevirtual   #752 <Method boolean canScroll(View, boolean, int, int, int)>
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
		if(flag && view.canScrollHorizontally(-i)) goto _L4; else goto _L6
	//   72  144:iload_2         
	//   73  145:ifeq            157
	//   74  148:aload_1         
	//   75  149:iload_3         
	//   76  150:ineg            
	//   77  151:invokevirtual   #755 <Method boolean View.canScrollHorizontally(int)>
	//   78  154:ifne            133
_L6:
		return false;
	//   79  157:iconst_0        
	//   80  158:ireturn         
		if(true) goto _L8; else goto _L7
_L7:
	}

	public boolean canScrollHorizontally(int i)
	{
		boolean flag2 = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		boolean flag = true;
	//    2    3:iconst_1        
	//    3    4:istore          4
		if(mAdapter != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #233 <Field PagerAdapter mAdapter>
	//*   6   10:ifnonnull       15
	//*   7   13:iconst_0        
	//*   8   14:ireturn         
		{
			int j = getClientWidth();
	//    9   15:aload_0         
	//   10   16:invokespecial   #242 <Method int getClientWidth()>
	//   11   19:istore_2        
			int k = getScrollX();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #283 <Method int getScrollX()>
	//   14   24:istore_3        
			if(i < 0)
	//*  15   25:iload_1         
	//*  16   26:ifge            50
			{
				if(k <= (int)((float)j * mFirstOffset))
	//*  17   29:iload_3         
	//*  18   30:iload_2         
	//*  19   31:i2f             
	//*  20   32:aload_0         
	//*  21   33:getfield        #205 <Field float mFirstOffset>
	//*  22   36:fmul            
	//*  23   37:f2i             
	//*  24   38:icmple          44
	//*  25   41:iload           4
	//*  26   43:ireturn         
					flag = false;
	//   27   44:iconst_0        
	//   28   45:istore          4
				return flag;
			}
	//*  29   47:goto            41
			if(i > 0)
	//*  30   50:iload_1         
	//*  31   51:ifle            13
			{
				boolean flag1;
				if(k < (int)((float)j * mLastOffset))
	//*  32   54:iload_3         
	//*  33   55:iload_2         
	//*  34   56:i2f             
	//*  35   57:aload_0         
	//*  36   58:getfield        #208 <Field float mLastOffset>
	//*  37   61:fmul            
	//*  38   62:f2i             
	//*  39   63:icmpge          73
					flag1 = flag2;
	//   40   66:iload           5
	//   41   68:istore          4
				else
	//*  42   70:iload           4
	//*  43   72:ireturn         
					flag1 = false;
	//   44   73:iconst_0        
	//   45   74:istore          4
				return flag1;
			}
		}
		return false;
	//*  46   76:goto            70
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
	//    0    0:aload_1         
	//    1    1:instanceof      #20  <Class ViewPager$LayoutParams>
	//    2    4:ifeq            17
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #756 <Method boolean ViewGroup.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    6   12:ifeq            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public void clearOnPageChangeListeners()
	{
		if(mOnPageChangeListeners != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #348 <Field List mOnPageChangeListeners>
	//*   2    4:ifnull          16
			mOnPageChangeListeners.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #348 <Field List mOnPageChangeListeners>
	//    5   11:invokeinterface #758 <Method void List.clear()>
	//    6   16:return          
	}

	public void computeScroll()
	{
		mIsScrollStarted = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #761 <Field boolean mIsScrollStarted>
		if(!mScroller.isFinished() && mScroller.computeScrollOffset())
	//*   3    5:aload_0         
	//*   4    6:getfield        #271 <Field Scroller mScroller>
	//*   5    9:invokevirtual   #277 <Method boolean Scroller.isFinished()>
	//*   6   12:ifne            97
	//*   7   15:aload_0         
	//*   8   16:getfield        #271 <Field Scroller mScroller>
	//*   9   19:invokevirtual   #764 <Method boolean Scroller.computeScrollOffset()>
	//*  10   22:ifeq            97
		{
			int i = getScrollX();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #283 <Method int getScrollX()>
	//   13   29:istore_1        
			int j = getScrollY();
	//   14   30:aload_0         
	//   15   31:invokevirtual   #286 <Method int getScrollY()>
	//   16   34:istore_2        
			int k = mScroller.getCurrX();
	//   17   35:aload_0         
	//   18   36:getfield        #271 <Field Scroller mScroller>
	//   19   39:invokevirtual   #289 <Method int Scroller.getCurrX()>
	//   20   42:istore_3        
			int l = mScroller.getCurrY();
	//   21   43:aload_0         
	//   22   44:getfield        #271 <Field Scroller mScroller>
	//   23   47:invokevirtual   #292 <Method int Scroller.getCurrY()>
	//   24   50:istore          4
			if(i != k || j != l)
	//*  25   52:iload_1         
	//*  26   53:iload_3         
	//*  27   54:icmpne          63
	//*  28   57:iload_2         
	//*  29   58:iload           4
	//*  30   60:icmpeq          92
			{
				scrollTo(k, l);
	//   31   63:aload_0         
	//   32   64:iload_3         
	//   33   65:iload           4
	//   34   67:invokevirtual   #296 <Method void scrollTo(int, int)>
				if(!pageScrolled(k))
	//*  35   70:aload_0         
	//*  36   71:iload_3         
	//*  37   72:invokespecial   #300 <Method boolean pageScrolled(int)>
	//*  38   75:ifne            92
				{
					mScroller.abortAnimation();
	//   39   78:aload_0         
	//   40   79:getfield        #271 <Field Scroller mScroller>
	//   41   82:invokevirtual   #280 <Method void Scroller.abortAnimation()>
					scrollTo(0, l);
	//   42   85:aload_0         
	//   43   86:iconst_0        
	//   44   87:iload           4
	//   45   89:invokevirtual   #296 <Method void scrollTo(int, int)>
				}
			}
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   46   92:aload_0         
	//   47   93:invokestatic    #768 <Method void ViewCompat.postInvalidateOnAnimation(View)>
			return;
	//   48   96:return          
		} else
		{
			completeScroll(true);
	//   49   97:aload_0         
	//   50   98:iconst_1        
	//   51   99:invokespecial   #528 <Method void completeScroll(boolean)>
			return;
	//   52  102:return          
		}
	}

	void dataSetChanged()
	{
		int i2 = mAdapter.getCount();
	//    0    0:aload_0         
	//    1    1:getfield        #233 <Field PagerAdapter mAdapter>
	//    2    4:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//    3    7:istore          7
		mExpectedAdapterCount = i2;
	//    4    9:aload_0         
	//    5   10:iload           7
	//    6   12:putfield        #771 <Field int mExpectedAdapterCount>
		int i;
		int j;
		int k;
		int l;
		boolean flag;
		if(mItems.size() < mOffscreenPageLimit * 2 + 1 && mItems.size() < i2)
	//*   7   15:aload_0         
	//*   8   16:getfield        #188 <Field ArrayList mItems>
	//*   9   19:invokevirtual   #256 <Method int ArrayList.size()>
	//*  10   22:aload_0         
	//*  11   23:getfield        #210 <Field int mOffscreenPageLimit>
	//*  12   26:iconst_2        
	//*  13   27:imul            
	//*  14   28:iconst_1        
	//*  15   29:iadd            
	//*  16   30:icmpge          152
	//*  17   33:aload_0         
	//*  18   34:getfield        #188 <Field ArrayList mItems>
	//*  19   37:invokevirtual   #256 <Method int ArrayList.size()>
	//*  20   40:iload           7
	//*  21   42:icmpge          152
			i = 1;
	//   22   45:iconst_1        
	//   23   46:istore_1        
		else
	//*  24   47:aload_0         
	//*  25   48:getfield        #337 <Field int mCurItem>
	//*  26   51:istore_2        
	//*  27   52:iconst_0        
	//*  28   53:istore_3        
	//*  29   54:iconst_0        
	//*  30   55:istore          5
	//*  31   57:iload_1         
	//*  32   58:istore          4
	//*  33   60:iload_2         
	//*  34   61:istore_1        
	//*  35   62:iload_3         
	//*  36   63:istore_2        
	//*  37   64:iload           5
	//*  38   66:istore_3        
	//*  39   67:iload_3         
	//*  40   68:aload_0         
	//*  41   69:getfield        #188 <Field ArrayList mItems>
	//*  42   72:invokevirtual   #256 <Method int ArrayList.size()>
	//*  43   75:icmpge          299
	//*  44   78:aload_0         
	//*  45   79:getfield        #188 <Field ArrayList mItems>
	//*  46   82:iload_3         
	//*  47   83:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//*  48   86:checkcast       #17  <Class ViewPager$ItemInfo>
	//*  49   89:astore          8
	//*  50   91:aload_0         
	//*  51   92:getfield        #233 <Field PagerAdapter mAdapter>
	//*  52   95:aload           8
	//*  53   97:getfield        #618 <Field Object ViewPager$ItemInfo.object>
	//*  54  100:invokevirtual   #775 <Method int PagerAdapter.getItemPosition(Object)>
	//*  55  103:istore          5
	//*  56  105:iload           5
	//*  57  107:iconst_m1       
	//*  58  108:icmpne          157
	//*  59  111:iload_3         
	//*  60  112:istore          5
	//*  61  114:iload_2         
	//*  62  115:istore          6
	//*  63  117:iload           4
	//*  64  119:istore_3        
	//*  65  120:iload_1         
	//*  66  121:istore_2        
	//*  67  122:iload           6
	//*  68  124:istore_1        
	//*  69  125:iload           5
	//*  70  127:istore          4
	//*  71  129:iload_3         
	//*  72  130:istore          5
	//*  73  132:iload_2         
	//*  74  133:istore          6
	//*  75  135:iload           4
	//*  76  137:iconst_1        
	//*  77  138:iadd            
	//*  78  139:istore_3        
	//*  79  140:iload_1         
	//*  80  141:istore_2        
	//*  81  142:iload           6
	//*  82  144:istore_1        
	//*  83  145:iload           5
	//*  84  147:istore          4
	//*  85  149:goto            67
			i = 0;
	//   86  152:iconst_0        
	//   87  153:istore_1        
		j = mCurItem;
		k = 0;
		flag = false;
		l = i;
		i = j;
		j = k;
		k = ((int) (flag));
		while(k < mItems.size()) 
		{
			Object obj = ((Object) ((ItemInfo)mItems.get(k)));
			int i1 = mAdapter.getItemPosition(((ItemInfo) (obj)).object);
			int k1;
			if(i1 == -1)
			{
				i1 = k;
				int j1 = j;
				k = l;
				j = i;
				i = j1;
				l = i1;
			} else
	//*  88  154:goto            47
			if(i1 == -2)
	//*  89  157:iload           5
	//*  90  159:bipush          -2
	//*  91  161:icmpne          247
			{
				mItems.remove(k);
	//   92  164:aload_0         
	//   93  165:getfield        #188 <Field ArrayList mItems>
	//   94  168:iload_3         
	//   95  169:invokevirtual   #778 <Method Object ArrayList.remove(int)>
	//   96  172:pop             
				l = k - 1;
	//   97  173:iload_3         
	//   98  174:iconst_1        
	//   99  175:isub            
	//  100  176:istore          4
				k = j;
	//  101  178:iload_2         
	//  102  179:istore_3        
				if(j == 0)
	//* 103  180:iload_2         
	//* 104  181:ifne            194
				{
					mAdapter.startUpdate(((ViewGroup) (this)));
	//  105  184:aload_0         
	//  106  185:getfield        #233 <Field PagerAdapter mAdapter>
	//  107  188:aload_0         
	//  108  189:invokevirtual   #782 <Method void PagerAdapter.startUpdate(ViewGroup)>
					k = 1;
	//  109  192:iconst_1        
	//  110  193:istore_3        
				}
				mAdapter.destroyItem(((ViewGroup) (this)), ((ItemInfo) (obj)).position, ((ItemInfo) (obj)).object);
	//  111  194:aload_0         
	//  112  195:getfield        #233 <Field PagerAdapter mAdapter>
	//  113  198:aload_0         
	//  114  199:aload           8
	//  115  201:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//  116  204:aload           8
	//  117  206:getfield        #618 <Field Object ViewPager$ItemInfo.object>
	//  118  209:invokevirtual   #786 <Method void PagerAdapter.destroyItem(ViewGroup, int, Object)>
				int l1;
				if(mCurItem == ((ItemInfo) (obj)).position)
	//* 119  212:aload_0         
	//* 120  213:getfield        #337 <Field int mCurItem>
	//* 121  216:aload           8
	//* 122  218:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 123  221:icmpne          405
				{
					j = Math.max(0, Math.min(mCurItem, i2 - 1));
	//  124  224:iconst_0        
	//  125  225:aload_0         
	//  126  226:getfield        #337 <Field int mCurItem>
	//  127  229:iload           7
	//  128  231:iconst_1        
	//  129  232:isub            
	//  130  233:invokestatic    #332 <Method int Math.min(int, int)>
	//  131  236:invokestatic    #335 <Method int Math.max(int, int)>
	//  132  239:istore_2        
					i = k;
	//  133  240:iload_3         
	//  134  241:istore_1        
					k = 1;
	//  135  242:iconst_1        
	//  136  243:istore_3        
				} else
	//* 137  244:goto            129
	//* 138  247:aload           8
	//* 139  249:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 140  252:iload           5
	//* 141  254:icmpeq          384
	//* 142  257:aload           8
	//* 143  259:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 144  262:aload_0         
	//* 145  263:getfield        #337 <Field int mCurItem>
	//* 146  266:icmpne          272
	//* 147  269:iload           5
	//* 148  271:istore_1        
	//* 149  272:aload           8
	//* 150  274:iload           5
	//* 151  276:putfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 152  279:iload_1         
	//* 153  280:istore          5
	//* 154  282:iconst_1        
	//* 155  283:istore          6
	//* 156  285:iload_3         
	//* 157  286:istore          4
	//* 158  288:iload_2         
	//* 159  289:istore_1        
	//* 160  290:iload           5
	//* 161  292:istore_2        
	//* 162  293:iload           6
	//* 163  295:istore_3        
	//* 164  296:goto            129
	//* 165  299:iload_2         
	//* 166  300:ifeq            311
	//* 167  303:aload_0         
	//* 168  304:getfield        #233 <Field PagerAdapter mAdapter>
	//* 169  307:aload_0         
	//* 170  308:invokevirtual   #789 <Method void PagerAdapter.finishUpdate(ViewGroup)>
	//* 171  311:aload_0         
	//* 172  312:getfield        #188 <Field ArrayList mItems>
	//* 173  315:getstatic       #173 <Field Comparator COMPARATOR>
	//* 174  318:invokestatic    #581 <Method void Collections.sort(List, Comparator)>
	//* 175  321:iload           4
	//* 176  323:ifeq            383
	//* 177  326:aload_0         
	//* 178  327:invokevirtual   #367 <Method int getChildCount()>
	//* 179  330:istore_3        
	//* 180  331:iconst_0        
	//* 181  332:istore_2        
	//* 182  333:iload_2         
	//* 183  334:iload_3         
	//* 184  335:icmpge          372
	//* 185  338:aload_0         
	//* 186  339:iload_2         
	//* 187  340:invokevirtual   #373 <Method View getChildAt(int)>
	//* 188  343:invokevirtual   #533 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 189  346:checkcast       #20  <Class ViewPager$LayoutParams>
	//* 190  349:astore          8
	//* 191  351:aload           8
	//* 192  353:getfield        #536 <Field boolean ViewPager$LayoutParams.isDecor>
	//* 193  356:ifne            365
	//* 194  359:aload           8
	//* 195  361:fconst_0        
	//* 196  362:putfield        #790 <Field float ViewPager$LayoutParams.widthFactor>
	//* 197  365:iload_2         
	//* 198  366:iconst_1        
	//* 199  367:iadd            
	//* 200  368:istore_2        
	//* 201  369:goto            333
	//* 202  372:aload_0         
	//* 203  373:iload_1         
	//* 204  374:iconst_0        
	//* 205  375:iconst_1        
	//* 206  376:invokevirtual   #794 <Method void setCurrentItemInternal(int, boolean, boolean)>
	//* 207  379:aload_0         
	//* 208  380:invokevirtual   #797 <Method void requestLayout()>
	//* 209  383:return          
	//* 210  384:iload_1         
	//* 211  385:istore          5
	//* 212  387:iload           4
	//* 213  389:istore          6
	//* 214  391:iload_3         
	//* 215  392:istore          4
	//* 216  394:iload_2         
	//* 217  395:istore_1        
	//* 218  396:iload           5
	//* 219  398:istore_2        
	//* 220  399:iload           6
	//* 221  401:istore_3        
	//* 222  402:goto            129
				{
					j = i;
	//  223  405:iload_1         
	//  224  406:istore_2        
					boolean flag1 = true;
	//  225  407:iconst_1        
	//  226  408:istore          5
					i = k;
	//  227  410:iload_3         
	//  228  411:istore_1        
					k = ((int) (flag1));
	//  229  412:iload           5
	//  230  414:istore_3        
				}
			} else
			if(((ItemInfo) (obj)).position != i1)
			{
				if(((ItemInfo) (obj)).position == mCurItem)
					i = i1;
				obj.position = i1;
				i1 = i;
				l1 = 1;
				l = k;
				i = j;
				j = i1;
				k = l1;
			} else
			{
				i1 = i;
				l1 = l;
				l = k;
				i = j;
				j = i1;
				k = l1;
			}
			i1 = k;
			k1 = j;
			k = l + 1;
			j = i;
			i = k1;
			l = i1;
		}
		if(j != 0)
			mAdapter.finishUpdate(((ViewGroup) (this)));
		Collections.sort(((List) (mItems)), COMPARATOR);
		if(l != 0)
		{
			k = getChildCount();
			for(j = 0; j < k; j++)
			{
				obj = ((Object) ((LayoutParams)getChildAt(j).getLayoutParams()));
				if(!((LayoutParams) (obj)).isDecor)
					obj.widthFactor = 0.0F;
			}

			setCurrentItemInternal(i, false, true);
			requestLayout();
		}
	//* 231  415:goto            129
	}

	public boolean dispatchKeyEvent(KeyEvent keyevent)
	{
		return super.dispatchKeyEvent(keyevent) || executeKeyEvent(keyevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #801 <Method boolean ViewGroup.dispatchKeyEvent(KeyEvent)>
	//    3    5:ifne            16
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #804 <Method boolean executeKeyEvent(KeyEvent)>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		if(accessibilityevent.getEventType() != 4096) goto _L2; else goto _L1
	//    2    3:aload_1         
	//    3    4:invokevirtual   #811 <Method int AccessibilityEvent.getEventType()>
	//    4    7:sipush          4096
	//    5   10:icmpne          23
_L1:
		boolean flag = super.dispatchPopulateAccessibilityEvent(accessibilityevent);
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:invokespecial   #813 <Method boolean ViewGroup.dispatchPopulateAccessibilityEvent(AccessibilityEvent)>
	//    9   18:istore          4
_L4:
		return flag;
	//   10   20:iload           4
	//   11   22:ireturn         
_L2:
		int j = getChildCount();
	//   12   23:aload_0         
	//   13   24:invokevirtual   #367 <Method int getChildCount()>
	//   14   27:istore_3        
		int i = 0;
	//   15   28:iconst_0        
	//   16   29:istore_2        
		do
		{
			flag = flag1;
	//   17   30:iload           5
	//   18   32:istore          4
			if(i >= j)
				continue;
	//   19   34:iload_2         
	//   20   35:iload_3         
	//   21   36:icmpge          20
			View view = getChildAt(i);
	//   22   39:aload_0         
	//   23   40:iload_2         
	//   24   41:invokevirtual   #373 <Method View getChildAt(int)>
	//   25   44:astore          6
			if(view.getVisibility() == 0)
	//*  26   46:aload           6
	//*  27   48:invokevirtual   #590 <Method int View.getVisibility()>
	//*  28   51:ifne            90
			{
				ItemInfo iteminfo = infoForChild(view);
	//   29   54:aload_0         
	//   30   55:aload           6
	//   31   57:invokevirtual   #594 <Method ViewPager$ItemInfo infoForChild(View)>
	//   32   60:astore          7
				if(iteminfo != null && iteminfo.position == mCurItem && view.dispatchPopulateAccessibilityEvent(accessibilityevent))
	//*  33   62:aload           7
	//*  34   64:ifnull          90
	//*  35   67:aload           7
	//*  36   69:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  37   72:aload_0         
	//*  38   73:getfield        #337 <Field int mCurItem>
	//*  39   76:icmpne          90
	//*  40   79:aload           6
	//*  41   81:aload_1         
	//*  42   82:invokevirtual   #814 <Method boolean View.dispatchPopulateAccessibilityEvent(AccessibilityEvent)>
	//*  43   85:ifeq            90
					return true;
	//   44   88:iconst_1        
	//   45   89:ireturn         
			}
			i++;
	//   46   90:iload_2         
	//   47   91:iconst_1        
	//   48   92:iadd            
	//   49   93:istore_2        
		} while(true);
	//   50   94:goto            30
		if(true) goto _L4; else goto _L3
_L3:
	}

	float distanceInfluenceForSnapDuration(float f)
	{
		return (float)Math.sin((f - 0.5F) * 0.4712389F);
	//    0    0:fload_1         
	//    1    1:ldc2            #816 <Float 0.5F>
	//    2    4:fsub            
	//    3    5:ldc2            #817 <Float 0.4712389F>
	//    4    8:fmul            
	//    5    9:f2d             
	//    6   10:invokestatic    #821 <Method double Math.sin(double)>
	//    7   13:d2f             
	//    8   14:freturn         
	}

	public void draw(Canvas canvas)
	{
		super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #825 <Method void ViewGroup.draw(Canvas)>
		int j = 0;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		int i = 0;
	//    5    7:iconst_0        
	//    6    8:istore_2        
		int k = getOverScrollMode();
	//    7    9:aload_0         
	//    8   10:invokevirtual   #828 <Method int getOverScrollMode()>
	//    9   13:istore          4
		if(k == 0 || k == 1 && mAdapter != null && mAdapter.getCount() > 1)
	//*  10   15:iload           4
	//*  11   17:ifeq            44
	//*  12   20:iload           4
	//*  13   22:iconst_1        
	//*  14   23:icmpne          243
	//*  15   26:aload_0         
	//*  16   27:getfield        #233 <Field PagerAdapter mAdapter>
	//*  17   30:ifnull          243
	//*  18   33:aload_0         
	//*  19   34:getfield        #233 <Field PagerAdapter mAdapter>
	//*  20   37:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//*  21   40:iconst_1        
	//*  22   41:icmple          243
		{
			if(!mLeftEdge.isFinished())
	//*  23   44:aload_0         
	//*  24   45:getfield        #498 <Field EdgeEffect mLeftEdge>
	//*  25   48:invokevirtual   #553 <Method boolean EdgeEffect.isFinished()>
	//*  26   51:ifne            133
			{
				j = canvas.save();
	//   27   54:aload_1         
	//   28   55:invokevirtual   #833 <Method int Canvas.save()>
	//   29   58:istore_3        
				i = getHeight() - getPaddingTop() - getPaddingBottom();
	//   30   59:aload_0         
	//   31   60:invokevirtual   #836 <Method int getHeight()>
	//   32   63:aload_0         
	//   33   64:invokevirtual   #839 <Method int getPaddingTop()>
	//   34   67:isub            
	//   35   68:aload_0         
	//   36   69:invokevirtual   #842 <Method int getPaddingBottom()>
	//   37   72:isub            
	//   38   73:istore_2        
				int l = getWidth();
	//   39   74:aload_0         
	//   40   75:invokevirtual   #464 <Method int getWidth()>
	//   41   78:istore          4
				canvas.rotate(270F);
	//   42   80:aload_1         
	//   43   81:ldc2            #843 <Float 270F>
	//   44   84:invokevirtual   #846 <Method void Canvas.rotate(float)>
				canvas.translate(-i + getPaddingTop(), mFirstOffset * (float)l);
	//   45   87:aload_1         
	//   46   88:iload_2         
	//   47   89:ineg            
	//   48   90:aload_0         
	//   49   91:invokevirtual   #839 <Method int getPaddingTop()>
	//   50   94:iadd            
	//   51   95:i2f             
	//   52   96:aload_0         
	//   53   97:getfield        #205 <Field float mFirstOffset>
	//   54  100:iload           4
	//   55  102:i2f             
	//   56  103:fmul            
	//   57  104:invokevirtual   #850 <Method void Canvas.translate(float, float)>
				mLeftEdge.setSize(i, l);
	//   58  107:aload_0         
	//   59  108:getfield        #498 <Field EdgeEffect mLeftEdge>
	//   60  111:iload_2         
	//   61  112:iload           4
	//   62  114:invokevirtual   #853 <Method void EdgeEffect.setSize(int, int)>
				i = ((int) (false | mLeftEdge.draw(canvas)));
	//   63  117:iconst_0        
	//   64  118:aload_0         
	//   65  119:getfield        #498 <Field EdgeEffect mLeftEdge>
	//   66  122:aload_1         
	//   67  123:invokevirtual   #856 <Method boolean EdgeEffect.draw(Canvas)>
	//   68  126:ior             
	//   69  127:istore_2        
				canvas.restoreToCount(j);
	//   70  128:aload_1         
	//   71  129:iload_3         
	//   72  130:invokevirtual   #859 <Method void Canvas.restoreToCount(int)>
			}
			j = i;
	//   73  133:iload_2         
	//   74  134:istore_3        
			if(!mRightEdge.isFinished())
	//*  75  135:aload_0         
	//*  76  136:getfield        #509 <Field EdgeEffect mRightEdge>
	//*  77  139:invokevirtual   #553 <Method boolean EdgeEffect.isFinished()>
	//*  78  142:ifne            234
			{
				int i1 = canvas.save();
	//   79  145:aload_1         
	//   80  146:invokevirtual   #833 <Method int Canvas.save()>
	//   81  149:istore          4
				j = getWidth();
	//   82  151:aload_0         
	//   83  152:invokevirtual   #464 <Method int getWidth()>
	//   84  155:istore_3        
				int j1 = getHeight();
	//   85  156:aload_0         
	//   86  157:invokevirtual   #836 <Method int getHeight()>
	//   87  160:istore          5
				int k1 = getPaddingTop();
	//   88  162:aload_0         
	//   89  163:invokevirtual   #839 <Method int getPaddingTop()>
	//   90  166:istore          6
				int l1 = getPaddingBottom();
	//   91  168:aload_0         
	//   92  169:invokevirtual   #842 <Method int getPaddingBottom()>
	//   93  172:istore          7
				canvas.rotate(90F);
	//   94  174:aload_1         
	//   95  175:ldc2            #860 <Float 90F>
	//   96  178:invokevirtual   #846 <Method void Canvas.rotate(float)>
				canvas.translate(-getPaddingTop(), -(mLastOffset + 1.0F) * (float)j);
	//   97  181:aload_1         
	//   98  182:aload_0         
	//   99  183:invokevirtual   #839 <Method int getPaddingTop()>
	//  100  186:ineg            
	//  101  187:i2f             
	//  102  188:aload_0         
	//  103  189:getfield        #208 <Field float mLastOffset>
	//  104  192:fconst_1        
	//  105  193:fadd            
	//  106  194:fneg            
	//  107  195:iload_3         
	//  108  196:i2f             
	//  109  197:fmul            
	//  110  198:invokevirtual   #850 <Method void Canvas.translate(float, float)>
				mRightEdge.setSize(j1 - k1 - l1, j);
	//  111  201:aload_0         
	//  112  202:getfield        #509 <Field EdgeEffect mRightEdge>
	//  113  205:iload           5
	//  114  207:iload           6
	//  115  209:isub            
	//  116  210:iload           7
	//  117  212:isub            
	//  118  213:iload_3         
	//  119  214:invokevirtual   #853 <Method void EdgeEffect.setSize(int, int)>
				j = i | mRightEdge.draw(canvas);
	//  120  217:iload_2         
	//  121  218:aload_0         
	//  122  219:getfield        #509 <Field EdgeEffect mRightEdge>
	//  123  222:aload_1         
	//  124  223:invokevirtual   #856 <Method boolean EdgeEffect.draw(Canvas)>
	//  125  226:ior             
	//  126  227:istore_3        
				canvas.restoreToCount(i1);
	//  127  228:aload_1         
	//  128  229:iload           4
	//  129  231:invokevirtual   #859 <Method void Canvas.restoreToCount(int)>
			}
		} else
	//* 130  234:iload_3         
	//* 131  235:ifeq            242
	//* 132  238:aload_0         
	//* 133  239:invokestatic    #768 <Method void ViewCompat.postInvalidateOnAnimation(View)>
	//* 134  242:return          
		{
			mLeftEdge.finish();
	//  135  243:aload_0         
	//  136  244:getfield        #498 <Field EdgeEffect mLeftEdge>
	//  137  247:invokevirtual   #863 <Method void EdgeEffect.finish()>
			mRightEdge.finish();
	//  138  250:aload_0         
	//  139  251:getfield        #509 <Field EdgeEffect mRightEdge>
	//  140  254:invokevirtual   #863 <Method void EdgeEffect.finish()>
		}
		if(j != 0)
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//* 141  257:goto            234
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #866 <Method void ViewGroup.drawableStateChanged()>
		Drawable drawable = mMarginDrawable;
	//    2    4:aload_0         
	//    3    5:getfield        #868 <Field Drawable mMarginDrawable>
	//    4    8:astore_1        
		if(drawable != null && drawable.isStateful())
	//*   5    9:aload_1         
	//*   6   10:ifnull          29
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #873 <Method boolean Drawable.isStateful()>
	//*   9   17:ifeq            29
			drawable.setState(getDrawableState());
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:invokevirtual   #877 <Method int[] getDrawableState()>
	//   13   25:invokevirtual   #881 <Method boolean Drawable.setState(int[])>
	//   14   28:pop             
	//   15   29:return          
	}

	public void endFakeDrag()
	{
		if(!mFakeDragging)
	//*   0    0:aload_0         
	//*   1    1:getfield        #720 <Field boolean mFakeDragging>
	//*   2    4:ifne            18
			throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
	//    3    7:new             #487 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #884 <String "No fake drag in progress. Call beginFakeDrag first.">
	//    6   14:invokespecial   #492 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		if(mAdapter != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #233 <Field PagerAdapter mAdapter>
	//*  10   22:ifnull          120
		{
			Object obj = ((Object) (mVelocityTracker));
	//   11   25:aload_0         
	//   12   26:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//   13   29:astore          4
			((VelocityTracker) (obj)).computeCurrentVelocity(1000, mMaximumVelocity);
	//   14   31:aload           4
	//   15   33:sipush          1000
	//   16   36:aload_0         
	//   17   37:getfield        #886 <Field int mMaximumVelocity>
	//   18   40:i2f             
	//   19   41:invokevirtual   #890 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
			int i = (int)((VelocityTracker) (obj)).getXVelocity(mActivePointerId);
	//   20   44:aload           4
	//   21   46:aload_0         
	//   22   47:getfield        #212 <Field int mActivePointerId>
	//   23   50:invokevirtual   #893 <Method float VelocityTracker.getXVelocity(int)>
	//   24   53:f2i             
	//   25   54:istore_1        
			mPopulatePending = true;
	//   26   55:aload_0         
	//   27   56:iconst_1        
	//   28   57:putfield        #302 <Field boolean mPopulatePending>
			int j = getClientWidth();
	//   29   60:aload_0         
	//   30   61:invokespecial   #242 <Method int getClientWidth()>
	//   31   64:istore_2        
			int k = getScrollX();
	//   32   65:aload_0         
	//   33   66:invokevirtual   #283 <Method int getScrollX()>
	//   34   69:istore_3        
			obj = ((Object) (infoForCurrentScrollPosition()));
	//   35   70:aload_0         
	//   36   71:invokespecial   #494 <Method ViewPager$ItemInfo infoForCurrentScrollPosition()>
	//   37   74:astore          4
			setCurrentItemInternal(determineTargetPage(((ItemInfo) (obj)).position, ((float)k / (float)j - ((ItemInfo) (obj)).offset) / ((ItemInfo) (obj)).widthFactor, i, (int)(mLastMotionX - mInitialMotionX)), true, true, i);
	//   38   76:aload_0         
	//   39   77:aload_0         
	//   40   78:aload           4
	//   41   80:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//   42   83:iload_3         
	//   43   84:i2f             
	//   44   85:iload_2         
	//   45   86:i2f             
	//   46   87:fdiv            
	//   47   88:aload           4
	//   48   90:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   49   93:fsub            
	//   50   94:aload           4
	//   51   96:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//   52   99:fdiv            
	//   53  100:iload_1         
	//   54  101:aload_0         
	//   55  102:getfield        #479 <Field float mLastMotionX>
	//   56  105:aload_0         
	//   57  106:getfield        #725 <Field float mInitialMotionX>
	//   58  109:fsub            
	//   59  110:f2i             
	//   60  111:invokespecial   #895 <Method int determineTargetPage(int, float, int, int)>
	//   61  114:iconst_1        
	//   62  115:iconst_1        
	//   63  116:iload_1         
	//   64  117:invokevirtual   #898 <Method void setCurrentItemInternal(int, boolean, boolean, int)>
		}
		endDrag();
	//   65  120:aload_0         
	//   66  121:invokespecial   #549 <Method void endDrag()>
		mFakeDragging = false;
	//   67  124:aload_0         
	//   68  125:iconst_0        
	//   69  126:putfield        #720 <Field boolean mFakeDragging>
	//   70  129:return          
	}

	public boolean executeKeyEvent(KeyEvent keyevent)
	{
		if(keyevent.getAction() != 0) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:invokevirtual   #903 <Method int KeyEvent.getAction()>
	//    2    4:ifne            44
_L1:
		keyevent.getKeyCode();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #906 <Method int KeyEvent.getKeyCode()>
		JVM INSTR lookupswitch 3: default 44
	//	               21: 46
	//	               22: 66
	//	               61: 86;
	//    5   11:lookupswitch    3: default 44
	//	               21: 46
	//	               22: 66
	//	               61: 86
		   goto _L2 _L3 _L4 _L5
_L2:
		return false;
	//    6   44:iconst_0        
	//    7   45:ireturn         
_L3:
		if(keyevent.hasModifiers(2))
	//*   8   46:aload_1         
	//*   9   47:iconst_2        
	//*  10   48:invokevirtual   #909 <Method boolean KeyEvent.hasModifiers(int)>
	//*  11   51:ifeq            59
			return pageLeft();
	//   12   54:aload_0         
	//   13   55:invokevirtual   #678 <Method boolean pageLeft()>
	//   14   58:ireturn         
		else
			return arrowScroll(17);
	//   15   59:aload_0         
	//   16   60:bipush          17
	//   17   62:invokevirtual   #911 <Method boolean arrowScroll(int)>
	//   18   65:ireturn         
_L4:
		if(keyevent.hasModifiers(2))
	//*  19   66:aload_1         
	//*  20   67:iconst_2        
	//*  21   68:invokevirtual   #909 <Method boolean KeyEvent.hasModifiers(int)>
	//*  22   71:ifeq            79
			return pageRight();
	//   23   74:aload_0         
	//   24   75:invokevirtual   #717 <Method boolean pageRight()>
	//   25   78:ireturn         
		else
			return arrowScroll(66);
	//   26   79:aload_0         
	//   27   80:bipush          66
	//   28   82:invokevirtual   #911 <Method boolean arrowScroll(int)>
	//   29   85:ireturn         
_L5:
		if(keyevent.hasNoModifiers())
	//*  30   86:aload_1         
	//*  31   87:invokevirtual   #914 <Method boolean KeyEvent.hasNoModifiers()>
	//*  32   90:ifeq            99
			return arrowScroll(2);
	//   33   93:aload_0         
	//   34   94:iconst_2        
	//   35   95:invokevirtual   #911 <Method boolean arrowScroll(int)>
	//   36   98:ireturn         
		if(keyevent.hasModifiers(1))
	//*  37   99:aload_1         
	//*  38  100:iconst_1        
	//*  39  101:invokevirtual   #909 <Method boolean KeyEvent.hasModifiers(int)>
	//*  40  104:ifeq            44
			return arrowScroll(1);
	//   41  107:aload_0         
	//   42  108:iconst_1        
	//   43  109:invokevirtual   #911 <Method boolean arrowScroll(int)>
	//   44  112:ireturn         
		if(true) goto _L2; else goto _L6
_L6:
	}

	public void fakeDragBy(float f)
	{
		if(!mFakeDragging)
	//*   0    0:aload_0         
	//*   1    1:getfield        #720 <Field boolean mFakeDragging>
	//*   2    4:ifne            18
			throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
	//    3    7:new             #487 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #884 <String "No fake drag in progress. Call beginFakeDrag first.">
	//    6   14:invokespecial   #492 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		if(mAdapter == null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #233 <Field PagerAdapter mAdapter>
	//*  10   22:ifnonnull       26
			return;
	//   11   25:return          
		mLastMotionX = mLastMotionX + f;
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:getfield        #479 <Field float mLastMotionX>
	//   15   31:fload_1         
	//   16   32:fadd            
	//   17   33:putfield        #479 <Field float mLastMotionX>
		float f2 = (float)getScrollX() - f;
	//   18   36:aload_0         
	//   19   37:invokevirtual   #283 <Method int getScrollX()>
	//   20   40:i2f             
	//   21   41:fload_1         
	//   22   42:fsub            
	//   23   43:fstore_3        
		int i = getClientWidth();
	//   24   44:aload_0         
	//   25   45:invokespecial   #242 <Method int getClientWidth()>
	//   26   48:istore          6
		f = i;
	//   27   50:iload           6
	//   28   52:i2f             
	//   29   53:fstore_1        
		float f4 = mFirstOffset;
	//   30   54:aload_0         
	//   31   55:getfield        #205 <Field float mFirstOffset>
	//   32   58:fstore          5
		float f1 = i;
	//   33   60:iload           6
	//   34   62:i2f             
	//   35   63:fstore_2        
		float f3 = mLastOffset;
	//   36   64:aload_0         
	//   37   65:getfield        #208 <Field float mLastOffset>
	//   38   68:fstore          4
		Object obj = ((Object) ((ItemInfo)mItems.get(0)));
	//   39   70:aload_0         
	//   40   71:getfield        #188 <Field ArrayList mItems>
	//   41   74:iconst_0        
	//   42   75:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   43   78:checkcast       #17  <Class ViewPager$ItemInfo>
	//   44   81:astore          9
		ItemInfo iteminfo = (ItemInfo)mItems.get(mItems.size() - 1);
	//   45   83:aload_0         
	//   46   84:getfield        #188 <Field ArrayList mItems>
	//   47   87:aload_0         
	//   48   88:getfield        #188 <Field ArrayList mItems>
	//   49   91:invokevirtual   #256 <Method int ArrayList.size()>
	//   50   94:iconst_1        
	//   51   95:isub            
	//   52   96:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   53   99:checkcast       #17  <Class ViewPager$ItemInfo>
	//   54  102:astore          10
		long l;
		if(((ItemInfo) (obj)).position != 0)
	//*  55  104:aload           9
	//*  56  106:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  57  109:ifeq            248
			f = ((ItemInfo) (obj)).offset * (float)i;
	//   58  112:aload           9
	//   59  114:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   60  117:iload           6
	//   61  119:i2f             
	//   62  120:fmul            
	//   63  121:fstore_1        
		else
	//*  64  122:aload           10
	//*  65  124:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  66  127:aload_0         
	//*  67  128:getfield        #233 <Field PagerAdapter mAdapter>
	//*  68  131:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//*  69  134:iconst_1        
	//*  70  135:isub            
	//*  71  136:icmpeq          240
	//*  72  139:aload           10
	//*  73  141:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//*  74  144:iload           6
	//*  75  146:i2f             
	//*  76  147:fmul            
	//*  77  148:fstore_2        
	//*  78  149:fload_3         
	//*  79  150:fload_1         
	//*  80  151:fcmpg           
	//*  81  152:ifge            224
	//*  82  155:aload_0         
	//*  83  156:aload_0         
	//*  84  157:getfield        #479 <Field float mLastMotionX>
	//*  85  160:fload_1         
	//*  86  161:fload_1         
	//*  87  162:f2i             
	//*  88  163:i2f             
	//*  89  164:fsub            
	//*  90  165:fadd            
	//*  91  166:putfield        #479 <Field float mLastMotionX>
	//*  92  169:aload_0         
	//*  93  170:fload_1         
	//*  94  171:f2i             
	//*  95  172:aload_0         
	//*  96  173:invokevirtual   #286 <Method int getScrollY()>
	//*  97  176:invokevirtual   #296 <Method void scrollTo(int, int)>
	//*  98  179:aload_0         
	//*  99  180:fload_1         
	//* 100  181:f2i             
	//* 101  182:invokespecial   #300 <Method boolean pageScrolled(int)>
	//* 102  185:pop             
	//* 103  186:invokestatic    #735 <Method long SystemClock.uptimeMillis()>
	//* 104  189:lstore          7
	//* 105  191:aload_0         
	//* 106  192:getfield        #744 <Field long mFakeDragBeginTime>
	//* 107  195:lload           7
	//* 108  197:iconst_2        
	//* 109  198:aload_0         
	//* 110  199:getfield        #479 <Field float mLastMotionX>
	//* 111  202:fconst_0        
	//* 112  203:iconst_0        
	//* 113  204:invokestatic    #738 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//* 114  207:astore          9
	//* 115  209:aload_0         
	//* 116  210:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//* 117  213:aload           9
	//* 118  215:invokevirtual   #741 <Method void VelocityTracker.addMovement(MotionEvent)>
	//* 119  218:aload           9
	//* 120  220:invokevirtual   #742 <Method void MotionEvent.recycle()>
	//* 121  223:return          
	//* 122  224:fload_3         
	//* 123  225:fload_2         
	//* 124  226:fcmpl           
	//* 125  227:ifle            235
	//* 126  230:fload_2         
	//* 127  231:fstore_1        
	//* 128  232:goto            155
	//* 129  235:fload_3         
	//* 130  236:fstore_1        
	//* 131  237:goto            155
	//* 132  240:fload_2         
	//* 133  241:fload           4
	//* 134  243:fmul            
	//* 135  244:fstore_2        
	//* 136  245:goto            149
			f *= f4;
	//  137  248:fload_1         
	//  138  249:fload           5
	//  139  251:fmul            
	//  140  252:fstore_1        
		if(iteminfo.position != mAdapter.getCount() - 1)
			f1 = iteminfo.offset * (float)i;
		else
			f1 *= f3;
		if(f2 >= f)
			if(f2 > f1)
				f = f1;
			else
				f = f2;
		mLastMotionX = mLastMotionX + (f - (float)(int)f);
		scrollTo((int)f, getScrollY());
		pageScrolled((int)f);
		l = SystemClock.uptimeMillis();
		obj = ((Object) (MotionEvent.obtain(mFakeDragBeginTime, l, 2, mLastMotionX, 0.0F, 0)));
		mVelocityTracker.addMovement(((MotionEvent) (obj)));
		((MotionEvent) (obj)).recycle();
	//* 141  253:goto            122
	}

	protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams()));
	//    0    0:new             #20  <Class ViewPager$LayoutParams>
	//    1    3:dup             
	//    2    4:invokespecial   #917 <Method void ViewPager$LayoutParams()>
	//    3    7:areturn         
	}

	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(getContext(), attributeset)));
	//    0    0:new             #20  <Class ViewPager$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #922 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #923 <Method void ViewPager$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return generateDefaultLayoutParams();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #925 <Method android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	public PagerAdapter getAdapter()
	{
		return mAdapter;
	//    0    0:aload_0         
	//    1    1:getfield        #233 <Field PagerAdapter mAdapter>
	//    2    4:areturn         
	}

	protected int getChildDrawingOrder(int i, int j)
	{
		int k = j;
	//    0    0:iload_2         
	//    1    1:istore_3        
		if(mDrawingOrder == 2)
	//*   2    2:aload_0         
	//*   3    3:getfield        #568 <Field int mDrawingOrder>
	//*   4    6:iconst_2        
	//*   5    7:icmpne          16
			k = i - 1 - j;
	//    6   10:iload_1         
	//    7   11:iconst_1        
	//    8   12:isub            
	//    9   13:iload_2         
	//   10   14:isub            
	//   11   15:istore_3        
		return ((LayoutParams)((View)mDrawingOrderedChildren.get(k)).getLayoutParams()).childIndex;
	//   12   16:aload_0         
	//   13   17:getfield        #570 <Field ArrayList mDrawingOrderedChildren>
	//   14   20:iload_3         
	//   15   21:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   16   24:checkcast       #375 <Class View>
	//   17   27:invokevirtual   #533 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   18   30:checkcast       #20  <Class ViewPager$LayoutParams>
	//   19   33:getfield        #931 <Field int ViewPager$LayoutParams.childIndex>
	//   20   36:ireturn         
	}

	public int getCurrentItem()
	{
		return mCurItem;
	//    0    0:aload_0         
	//    1    1:getfield        #337 <Field int mCurItem>
	//    2    4:ireturn         
	}

	public int getOffscreenPageLimit()
	{
		return mOffscreenPageLimit;
	//    0    0:aload_0         
	//    1    1:getfield        #210 <Field int mOffscreenPageLimit>
	//    2    4:ireturn         
	}

	public int getPageMargin()
	{
		return mPageMargin;
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field int mPageMargin>
	//    2    4:ireturn         
	}

	ItemInfo infoForAnyChild(View view)
	{
		do
		{
			ViewParent viewparent = view.getParent();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #425 <Method ViewParent View.getParent()>
	//    2    4:astore_2        
			if(viewparent != this)
	//*   3    5:aload_2         
	//*   4    6:aload_0         
	//*   5    7:if_acmpeq       31
			{
				if(viewparent == null || !(viewparent instanceof View))
	//*   6   10:aload_2         
	//*   7   11:ifnull          21
	//*   8   14:aload_2         
	//*   9   15:instanceof      #375 <Class View>
	//*  10   18:ifne            23
					return null;
	//   11   21:aconst_null     
	//   12   22:areturn         
				view = (View)viewparent;
	//   13   23:aload_2         
	//   14   24:checkcast       #375 <Class View>
	//   15   27:astore_1        
			} else
	//*  16   28:goto            0
			{
				return infoForChild(view);
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:invokevirtual   #594 <Method ViewPager$ItemInfo infoForChild(View)>
	//   20   36:areturn         
			}
		} while(true);
	}

	ItemInfo infoForChild(View view)
	{
		for(int i = 0; i < mItems.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #188 <Field ArrayList mItems>
	//*   5    7:invokevirtual   #256 <Method int ArrayList.size()>
	//*   6   10:icmpge          49
		{
			ItemInfo iteminfo = (ItemInfo)mItems.get(i);
	//    7   13:aload_0         
	//    8   14:getfield        #188 <Field ArrayList mItems>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #17  <Class ViewPager$ItemInfo>
	//   12   24:astore_3        
			if(mAdapter.isViewFromObject(view, iteminfo.object))
	//*  13   25:aload_0         
	//*  14   26:getfield        #233 <Field PagerAdapter mAdapter>
	//*  15   29:aload_1         
	//*  16   30:aload_3         
	//*  17   31:getfield        #618 <Field Object ViewPager$ItemInfo.object>
	//*  18   34:invokevirtual   #938 <Method boolean PagerAdapter.isViewFromObject(View, Object)>
	//*  19   37:ifeq            42
				return iteminfo;
	//   20   40:aload_3         
	//   21   41:areturn         
		}

	//   22   42:iload_2         
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:istore_2        
	//*  26   46:goto            2
		return null;
	//   27   49:aconst_null     
	//   28   50:areturn         
	}

	ItemInfo infoForPosition(int i)
	{
		for(int j = 0; j < mItems.size(); j++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #188 <Field ArrayList mItems>
	//*   5    7:invokevirtual   #256 <Method int ArrayList.size()>
	//*   6   10:icmpge          42
		{
			ItemInfo iteminfo = (ItemInfo)mItems.get(j);
	//    7   13:aload_0         
	//    8   14:getfield        #188 <Field ArrayList mItems>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #17  <Class ViewPager$ItemInfo>
	//   12   24:astore_3        
			if(iteminfo.position == i)
	//*  13   25:aload_3         
	//*  14   26:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  15   29:iload_1         
	//*  16   30:icmpne          35
				return iteminfo;
	//   17   33:aload_3         
	//   18   34:areturn         
		}

	//   19   35:iload_2         
	//   20   36:iconst_1        
	//   21   37:iadd            
	//   22   38:istore_2        
	//*  23   39:goto            2
		return null;
	//   24   42:aconst_null     
	//   25   43:areturn         
	}

	void initViewPager()
	{
		setWillNotDraw(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #941 <Method void setWillNotDraw(boolean)>
		setDescendantFocusability(0x40000);
	//    3    5:aload_0         
	//    4    6:ldc2            #597 <Int 0x40000>
	//    5    9:invokevirtual   #944 <Method void setDescendantFocusability(int)>
		setFocusable(true);
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #947 <Method void setFocusable(boolean)>
		Context context = getContext();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #922 <Method Context getContext()>
	//   11   21:astore_2        
		mScroller = new Scroller(context, sInterpolator);
	//   12   22:aload_0         
	//   13   23:new             #273 <Class Scroller>
	//   14   26:dup             
	//   15   27:aload_2         
	//   16   28:getstatic       #176 <Field Interpolator sInterpolator>
	//   17   31:invokespecial   #950 <Method void Scroller(Context, Interpolator)>
	//   18   34:putfield        #271 <Field Scroller mScroller>
		ViewConfiguration viewconfiguration = ViewConfiguration.get(context);
	//   19   37:aload_2         
	//   20   38:invokestatic    #955 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   21   41:astore_3        
		float f = context.getResources().getDisplayMetrics().density;
	//   22   42:aload_2         
	//   23   43:invokevirtual   #961 <Method Resources Context.getResources()>
	//   24   46:invokevirtual   #967 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   25   49:getfield        #972 <Field float DisplayMetrics.density>
	//   26   52:fstore_1        
		mTouchSlop = viewconfiguration.getScaledPagingTouchSlop();
	//   27   53:aload_0         
	//   28   54:aload_3         
	//   29   55:invokevirtual   #975 <Method int ViewConfiguration.getScaledPagingTouchSlop()>
	//   30   58:putfield        #977 <Field int mTouchSlop>
		mMinimumVelocity = (int)(400F * f);
	//   31   61:aload_0         
	//   32   62:ldc2            #978 <Float 400F>
	//   33   65:fload_1         
	//   34   66:fmul            
	//   35   67:f2i             
	//   36   68:putfield        #328 <Field int mMinimumVelocity>
		mMaximumVelocity = viewconfiguration.getScaledMaximumFlingVelocity();
	//   37   71:aload_0         
	//   38   72:aload_3         
	//   39   73:invokevirtual   #981 <Method int ViewConfiguration.getScaledMaximumFlingVelocity()>
	//   40   76:putfield        #886 <Field int mMaximumVelocity>
		mLeftEdge = new EdgeEffect(context);
	//   41   79:aload_0         
	//   42   80:new             #503 <Class EdgeEffect>
	//   43   83:dup             
	//   44   84:aload_2         
	//   45   85:invokespecial   #982 <Method void EdgeEffect(Context)>
	//   46   88:putfield        #498 <Field EdgeEffect mLeftEdge>
		mRightEdge = new EdgeEffect(context);
	//   47   91:aload_0         
	//   48   92:new             #503 <Class EdgeEffect>
	//   49   95:dup             
	//   50   96:aload_2         
	//   51   97:invokespecial   #982 <Method void EdgeEffect(Context)>
	//   52  100:putfield        #509 <Field EdgeEffect mRightEdge>
		mFlingDistance = (int)(25F * f);
	//   53  103:aload_0         
	//   54  104:ldc2            #983 <Float 25F>
	//   55  107:fload_1         
	//   56  108:fmul            
	//   57  109:f2i             
	//   58  110:putfield        #326 <Field int mFlingDistance>
		mCloseEnough = (int)(2.0F * f);
	//   59  113:aload_0         
	//   60  114:fconst_2        
	//   61  115:fload_1         
	//   62  116:fmul            
	//   63  117:f2i             
	//   64  118:putfield        #985 <Field int mCloseEnough>
		mDefaultGutterSize = (int)(16F * f);
	//   65  121:aload_0         
	//   66  122:ldc2            #986 <Float 16F>
	//   67  125:fload_1         
	//   68  126:fmul            
	//   69  127:f2i             
	//   70  128:putfield        #988 <Field int mDefaultGutterSize>
		ViewCompat.setAccessibilityDelegate(((View) (this)), ((AccessibilityDelegateCompat) (new MyAccessibilityDelegate())));
	//   71  131:aload_0         
	//   72  132:new             #23  <Class ViewPager$MyAccessibilityDelegate>
	//   73  135:dup             
	//   74  136:aload_0         
	//   75  137:invokespecial   #989 <Method void ViewPager$MyAccessibilityDelegate(ViewPager)>
	//   76  140:invokestatic    #993 <Method void ViewCompat.setAccessibilityDelegate(View, AccessibilityDelegateCompat)>
		if(ViewCompat.getImportantForAccessibility(((View) (this))) == 0)
	//*  77  143:aload_0         
	//*  78  144:invokestatic    #997 <Method int ViewCompat.getImportantForAccessibility(View)>
	//*  79  147:ifne            155
			ViewCompat.setImportantForAccessibility(((View) (this)), 1);
	//   80  150:aload_0         
	//   81  151:iconst_1        
	//   82  152:invokestatic    #1001 <Method void ViewCompat.setImportantForAccessibility(View, int)>
		ViewCompat.setOnApplyWindowInsetsListener(((View) (this)), new OnApplyWindowInsetsListener() {

			public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
			{
				view = ((View) (ViewCompat.onApplyWindowInsets(view, windowinsetscompat)));
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:invokestatic    #33  <Method WindowInsetsCompat ViewCompat.onApplyWindowInsets(View, WindowInsetsCompat)>
			//    3    5:astore_1        
				if(((WindowInsetsCompat) (view)).isConsumed())
			//*   4    6:aload_1         
			//*   5    7:invokevirtual   #39  <Method boolean WindowInsetsCompat.isConsumed()>
			//*   6   10:ifeq            15
					return ((WindowInsetsCompat) (view));
			//    7   13:aload_1         
			//    8   14:areturn         
				windowinsetscompat = ((WindowInsetsCompat) (mTempRect));
			//    9   15:aload_0         
			//   10   16:getfield        #26  <Field Rect mTempRect>
			//   11   19:astore_2        
				windowinsetscompat.left = ((WindowInsetsCompat) (view)).getSystemWindowInsetLeft();
			//   12   20:aload_2         
			//   13   21:aload_1         
			//   14   22:invokevirtual   #43  <Method int WindowInsetsCompat.getSystemWindowInsetLeft()>
			//   15   25:putfield        #47  <Field int Rect.left>
				windowinsetscompat.top = ((WindowInsetsCompat) (view)).getSystemWindowInsetTop();
			//   16   28:aload_2         
			//   17   29:aload_1         
			//   18   30:invokevirtual   #50  <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
			//   19   33:putfield        #53  <Field int Rect.top>
				windowinsetscompat.right = ((WindowInsetsCompat) (view)).getSystemWindowInsetRight();
			//   20   36:aload_2         
			//   21   37:aload_1         
			//   22   38:invokevirtual   #56  <Method int WindowInsetsCompat.getSystemWindowInsetRight()>
			//   23   41:putfield        #59  <Field int Rect.right>
				windowinsetscompat.bottom = ((WindowInsetsCompat) (view)).getSystemWindowInsetBottom();
			//   24   44:aload_2         
			//   25   45:aload_1         
			//   26   46:invokevirtual   #62  <Method int WindowInsetsCompat.getSystemWindowInsetBottom()>
			//   27   49:putfield        #65  <Field int Rect.bottom>
				int i = 0;
			//   28   52:iconst_0        
			//   29   53:istore_3        
				for(int j = getChildCount(); i < j; i++)
			//*  30   54:aload_0         
			//*  31   55:getfield        #19  <Field ViewPager this$0>
			//*  32   58:invokevirtual   #68  <Method int ViewPager.getChildCount()>
			//*  33   61:istore          4
			//*  34   63:iload_3         
			//*  35   64:iload           4
			//*  36   66:icmpge          154
				{
					WindowInsetsCompat windowinsetscompat1 = ViewCompat.dispatchApplyWindowInsets(getChildAt(i), ((WindowInsetsCompat) (view)));
			//   37   69:aload_0         
			//   38   70:getfield        #19  <Field ViewPager this$0>
			//   39   73:iload_3         
			//   40   74:invokevirtual   #72  <Method View ViewPager.getChildAt(int)>
			//   41   77:aload_1         
			//   42   78:invokestatic    #75  <Method WindowInsetsCompat ViewCompat.dispatchApplyWindowInsets(View, WindowInsetsCompat)>
			//   43   81:astore          5
					windowinsetscompat.left = Math.min(windowinsetscompat1.getSystemWindowInsetLeft(), ((Rect) (windowinsetscompat)).left);
			//   44   83:aload_2         
			//   45   84:aload           5
			//   46   86:invokevirtual   #43  <Method int WindowInsetsCompat.getSystemWindowInsetLeft()>
			//   47   89:aload_2         
			//   48   90:getfield        #47  <Field int Rect.left>
			//   49   93:invokestatic    #81  <Method int Math.min(int, int)>
			//   50   96:putfield        #47  <Field int Rect.left>
					windowinsetscompat.top = Math.min(windowinsetscompat1.getSystemWindowInsetTop(), ((Rect) (windowinsetscompat)).top);
			//   51   99:aload_2         
			//   52  100:aload           5
			//   53  102:invokevirtual   #50  <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
			//   54  105:aload_2         
			//   55  106:getfield        #53  <Field int Rect.top>
			//   56  109:invokestatic    #81  <Method int Math.min(int, int)>
			//   57  112:putfield        #53  <Field int Rect.top>
					windowinsetscompat.right = Math.min(windowinsetscompat1.getSystemWindowInsetRight(), ((Rect) (windowinsetscompat)).right);
			//   58  115:aload_2         
			//   59  116:aload           5
			//   60  118:invokevirtual   #56  <Method int WindowInsetsCompat.getSystemWindowInsetRight()>
			//   61  121:aload_2         
			//   62  122:getfield        #59  <Field int Rect.right>
			//   63  125:invokestatic    #81  <Method int Math.min(int, int)>
			//   64  128:putfield        #59  <Field int Rect.right>
					windowinsetscompat.bottom = Math.min(windowinsetscompat1.getSystemWindowInsetBottom(), ((Rect) (windowinsetscompat)).bottom);
			//   65  131:aload_2         
			//   66  132:aload           5
			//   67  134:invokevirtual   #62  <Method int WindowInsetsCompat.getSystemWindowInsetBottom()>
			//   68  137:aload_2         
			//   69  138:getfield        #65  <Field int Rect.bottom>
			//   70  141:invokestatic    #81  <Method int Math.min(int, int)>
			//   71  144:putfield        #65  <Field int Rect.bottom>
				}

			//   72  147:iload_3         
			//   73  148:iconst_1        
			//   74  149:iadd            
			//   75  150:istore_3        
			//*  76  151:goto            63
				return ((WindowInsetsCompat) (view)).replaceSystemWindowInsets(((Rect) (windowinsetscompat)).left, ((Rect) (windowinsetscompat)).top, ((Rect) (windowinsetscompat)).right, ((Rect) (windowinsetscompat)).bottom);
			//   77  154:aload_1         
			//   78  155:aload_2         
			//   79  156:getfield        #47  <Field int Rect.left>
			//   80  159:aload_2         
			//   81  160:getfield        #53  <Field int Rect.top>
			//   82  163:aload_2         
			//   83  164:getfield        #59  <Field int Rect.right>
			//   84  167:aload_2         
			//   85  168:getfield        #65  <Field int Rect.bottom>
			//   86  171:invokevirtual   #85  <Method WindowInsetsCompat WindowInsetsCompat.replaceSystemWindowInsets(int, int, int, int)>
			//   87  174:areturn         
			}

			private final Rect mTempRect = new Rect();
			final ViewPager this$0;

			
			{
				this$0 = ViewPager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ViewPager this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:aload_0         
			//    6   10:new             #23  <Class Rect>
			//    7   13:dup             
			//    8   14:invokespecial   #24  <Method void Rect()>
			//    9   17:putfield        #26  <Field Rect mTempRect>
			//   10   20:return          
			}
		}
);
	//   83  155:aload_0         
	//   84  156:new             #12  <Class ViewPager$4>
	//   85  159:dup             
	//   86  160:aload_0         
	//   87  161:invokespecial   #1002 <Method void ViewPager$4(ViewPager)>
	//   88  164:invokestatic    #1006 <Method void ViewCompat.setOnApplyWindowInsetsListener(View, OnApplyWindowInsetsListener)>
	//   89  167:return          
	}

	public boolean isFakeDragging()
	{
		return mFakeDragging;
	//    0    0:aload_0         
	//    1    1:getfield        #720 <Field boolean mFakeDragging>
	//    2    4:ireturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1010 <Method void ViewGroup.onAttachedToWindow()>
		mFirstLayout = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #214 <Field boolean mFirstLayout>
	//    5    9:return          
	}

	protected void onDetachedFromWindow()
	{
		removeCallbacks(mEndScrollRunnable);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #221 <Field Runnable mEndScrollRunnable>
	//    3    5:invokevirtual   #1015 <Method boolean removeCallbacks(Runnable)>
	//    4    8:pop             
		if(mScroller != null && !mScroller.isFinished())
	//*   5    9:aload_0         
	//*   6   10:getfield        #271 <Field Scroller mScroller>
	//*   7   13:ifnull          33
	//*   8   16:aload_0         
	//*   9   17:getfield        #271 <Field Scroller mScroller>
	//*  10   20:invokevirtual   #277 <Method boolean Scroller.isFinished()>
	//*  11   23:ifne            33
			mScroller.abortAnimation();
	//   12   26:aload_0         
	//   13   27:getfield        #271 <Field Scroller mScroller>
	//   14   30:invokevirtual   #280 <Method void Scroller.abortAnimation()>
		super.onDetachedFromWindow();
	//   15   33:aload_0         
	//   16   34:invokespecial   #1017 <Method void ViewGroup.onDetachedFromWindow()>
	//   17   37:return          
	}

	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #1020 <Method void ViewGroup.onDraw(Canvas)>
		if(mPageMargin <= 0 || mMarginDrawable == null || mItems.size() <= 0 || mAdapter == null) goto _L2; else goto _L1
	//    3    5:aload_0         
	//    4    6:getfield        #244 <Field int mPageMargin>
	//    5    9:ifle            270
	//    6   12:aload_0         
	//    7   13:getfield        #868 <Field Drawable mMarginDrawable>
	//    8   16:ifnull          270
	//    9   19:aload_0         
	//   10   20:getfield        #188 <Field ArrayList mItems>
	//   11   23:invokevirtual   #256 <Method int ArrayList.size()>
	//   12   26:ifle            270
	//   13   29:aload_0         
	//   14   30:getfield        #233 <Field PagerAdapter mAdapter>
	//   15   33:ifnull          270
_L1:
		float f;
		float f2;
		int i;
		int j;
		int k;
		int l;
		int i1;
		int j1;
		Object obj;
		k = getScrollX();
	//   16   36:aload_0         
	//   17   37:invokevirtual   #283 <Method int getScrollX()>
	//   18   40:istore          8
		l = getWidth();
	//   19   42:aload_0         
	//   20   43:invokevirtual   #464 <Method int getWidth()>
	//   21   46:istore          9
		f2 = (float)mPageMargin / (float)l;
	//   22   48:aload_0         
	//   23   49:getfield        #244 <Field int mPageMargin>
	//   24   52:i2f             
	//   25   53:iload           9
	//   26   55:i2f             
	//   27   56:fdiv            
	//   28   57:fstore          4
		obj = ((Object) ((ItemInfo)mItems.get(0)));
	//   29   59:aload_0         
	//   30   60:getfield        #188 <Field ArrayList mItems>
	//   31   63:iconst_0        
	//   32   64:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   33   67:checkcast       #17  <Class ViewPager$ItemInfo>
	//   34   70:astore          12
		f = ((ItemInfo) (obj)).offset;
	//   35   72:aload           12
	//   36   74:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   37   77:fstore_2        
		i1 = mItems.size();
	//   38   78:aload_0         
	//   39   79:getfield        #188 <Field ArrayList mItems>
	//   40   82:invokevirtual   #256 <Method int ArrayList.size()>
	//   41   85:istore          10
		i = ((ItemInfo) (obj)).position;
	//   42   87:aload           12
	//   43   89:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//   44   92:istore          6
		j1 = ((ItemInfo)mItems.get(i1 - 1)).position;
	//   45   94:aload_0         
	//   46   95:getfield        #188 <Field ArrayList mItems>
	//   47   98:iload           10
	//   48  100:iconst_1        
	//   49  101:isub            
	//   50  102:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   51  105:checkcast       #17  <Class ViewPager$ItemInfo>
	//   52  108:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//   53  111:istore          11
		j = 0;
	//   54  113:iconst_0        
	//   55  114:istore          7
_L6:
		if(i >= j1) goto _L2; else goto _L3
	//   56  116:iload           6
	//   57  118:iload           11
	//   58  120:icmpge          270
_L3:
		for(; i > ((ItemInfo) (obj)).position && j < i1; obj = ((Object) ((ItemInfo)((ArrayList) (obj)).get(j))))
	//*  59  123:iload           6
	//*  60  125:aload           12
	//*  61  127:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  62  130:icmple          167
	//*  63  133:iload           7
	//*  64  135:iload           10
	//*  65  137:icmpge          167
		{
			obj = ((Object) (mItems));
	//   66  140:aload_0         
	//   67  141:getfield        #188 <Field ArrayList mItems>
	//   68  144:astore          12
			j++;
	//   69  146:iload           7
	//   70  148:iconst_1        
	//   71  149:iadd            
	//   72  150:istore          7
		}

	//   73  152:aload           12
	//   74  154:iload           7
	//   75  156:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   76  159:checkcast       #17  <Class ViewPager$ItemInfo>
	//   77  162:astore          12
	//*  78  164:goto            123
		float f1;
		if(i == ((ItemInfo) (obj)).position)
	//*  79  167:iload           6
	//*  80  169:aload           12
	//*  81  171:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  82  174:icmpne          271
		{
			f1 = (((ItemInfo) (obj)).offset + ((ItemInfo) (obj)).widthFactor) * (float)l;
	//   83  177:aload           12
	//   84  179:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   85  182:aload           12
	//   86  184:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//   87  187:fadd            
	//   88  188:iload           9
	//   89  190:i2f             
	//   90  191:fmul            
	//   91  192:fstore_3        
			f = ((ItemInfo) (obj)).offset + ((ItemInfo) (obj)).widthFactor + f2;
	//   92  193:aload           12
	//   93  195:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   94  198:aload           12
	//   95  200:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//   96  203:fadd            
	//   97  204:fload           4
	//   98  206:fadd            
	//   99  207:fstore_2        
		} else
	//* 100  208:aload_0         
	//* 101  209:getfield        #244 <Field int mPageMargin>
	//* 102  212:i2f             
	//* 103  213:fload_3         
	//* 104  214:fadd            
	//* 105  215:iload           8
	//* 106  217:i2f             
	//* 107  218:fcmpl           
	//* 108  219:ifle            259
	//* 109  222:aload_0         
	//* 110  223:getfield        #868 <Field Drawable mMarginDrawable>
	//* 111  226:fload_3         
	//* 112  227:invokestatic    #1024 <Method int Math.round(float)>
	//* 113  230:aload_0         
	//* 114  231:getfield        #1026 <Field int mTopPageBounds>
	//* 115  234:aload_0         
	//* 116  235:getfield        #244 <Field int mPageMargin>
	//* 117  238:i2f             
	//* 118  239:fload_3         
	//* 119  240:fadd            
	//* 120  241:invokestatic    #1024 <Method int Math.round(float)>
	//* 121  244:aload_0         
	//* 122  245:getfield        #1028 <Field int mBottomPageBounds>
	//* 123  248:invokevirtual   #1031 <Method void Drawable.setBounds(int, int, int, int)>
	//* 124  251:aload_0         
	//* 125  252:getfield        #868 <Field Drawable mMarginDrawable>
	//* 126  255:aload_1         
	//* 127  256:invokevirtual   #1032 <Method void Drawable.draw(Canvas)>
	//* 128  259:fload_3         
	//* 129  260:iload           8
	//* 130  262:iload           9
	//* 131  264:iadd            
	//* 132  265:i2f             
	//* 133  266:fcmpl           
	//* 134  267:ifle            302
	//* 135  270:return          
		{
			float f3 = mAdapter.getPageWidth(i);
	//  136  271:aload_0         
	//  137  272:getfield        #233 <Field PagerAdapter mAdapter>
	//  138  275:iload           6
	//  139  277:invokevirtual   #264 <Method float PagerAdapter.getPageWidth(int)>
	//  140  280:fstore          5
			f1 = (f + f3) * (float)l;
	//  141  282:fload_2         
	//  142  283:fload           5
	//  143  285:fadd            
	//  144  286:iload           9
	//  145  288:i2f             
	//  146  289:fmul            
	//  147  290:fstore_3        
			f += f3 + f2;
	//  148  291:fload_2         
	//  149  292:fload           5
	//  150  294:fload           4
	//  151  296:fadd            
	//  152  297:fadd            
	//  153  298:fstore_2        
		}
		if((float)mPageMargin + f1 > (float)k)
		{
			mMarginDrawable.setBounds(Math.round(f1), mTopPageBounds, Math.round((float)mPageMargin + f1), mBottomPageBounds);
			mMarginDrawable.draw(canvas);
		}
		if(f1 <= (float)(k + l)) goto _L4; else goto _L2
_L2:
		return;
	//* 154  299:goto            208
_L4:
		i++;
	//  155  302:iload           6
	//  156  304:iconst_1        
	//  157  305:iadd            
	//  158  306:istore          6
		if(true) goto _L6; else goto _L5
	//  159  308:goto            116
_L5:
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		int i = motionevent.getAction() & 0xff;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #1035 <Method int MotionEvent.getAction()>
	//    2    4:sipush          255
	//    3    7:iand            
	//    4    8:istore          7
		if(i != 3 && i != 1) goto _L2; else goto _L1
	//    5   10:iload           7
	//    6   12:iconst_3        
	//    7   13:icmpeq          22
	//    8   16:iload           7
	//    9   18:iconst_1        
	//   10   19:icmpne          29
_L1:
		resetTouch();
	//   11   22:aload_0         
	//   12   23:invokespecial   #1037 <Method boolean resetTouch()>
	//   13   26:pop             
_L4:
		return false;
	//   14   27:iconst_0        
	//   15   28:ireturn         
_L2:
		if(i == 0)
			break; /* Loop/switch isn't completed */
	//   16   29:iload           7
	//   17   31:ifeq            50
		if(mIsBeingDragged)
	//*  18   34:aload_0         
	//*  19   35:getfield        #382 <Field boolean mIsBeingDragged>
	//*  20   38:ifeq            43
			return true;
	//   21   41:iconst_1        
	//   22   42:ireturn         
		if(mIsUnableToDrag) goto _L4; else goto _L3
	//   23   43:aload_0         
	//   24   44:getfield        #384 <Field boolean mIsUnableToDrag>
	//   25   47:ifne            27
_L3:
		i;
	//   26   50:iload           7
		JVM INSTR lookupswitch 3: default 88
	//	               0: 353
	//	               2: 115
	//	               6: 490;
	//   27   52:lookupswitch    3: default 88
	//	               0: 353
	//	               2: 115
	//	               6: 490
		   goto _L5 _L6 _L7 _L8
_L5:
		if(mVelocityTracker == null)
	//*  28   88:aload_0         
	//*  29   89:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//*  30   92:ifnonnull       102
			mVelocityTracker = VelocityTracker.obtain();
	//   31   95:aload_0         
	//   32   96:invokestatic    #729 <Method VelocityTracker VelocityTracker.obtain()>
	//   33   99:putfield        #386 <Field VelocityTracker mVelocityTracker>
		mVelocityTracker.addMovement(motionevent);
	//   34  102:aload_0         
	//   35  103:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//   36  106:aload_1         
	//   37  107:invokevirtual   #741 <Method void VelocityTracker.addMovement(MotionEvent)>
		return mIsBeingDragged;
	//   38  110:aload_0         
	//   39  111:getfield        #382 <Field boolean mIsBeingDragged>
	//   40  114:ireturn         
_L7:
		float f;
		float f2;
		float f3;
		float f4;
		float f5;
		int j = mActivePointerId;
	//   41  115:aload_0         
	//   42  116:getfield        #212 <Field int mActivePointerId>
	//   43  119:istore          7
		if(j == -1)
			continue; /* Loop/switch isn't completed */
	//   44  121:iload           7
	//   45  123:iconst_m1       
	//   46  124:icmpeq          88
		j = motionevent.findPointerIndex(j);
	//   47  127:aload_1         
	//   48  128:iload           7
	//   49  130:invokevirtual   #1040 <Method int MotionEvent.findPointerIndex(int)>
	//   50  133:istore          7
		f2 = motionevent.getX(j);
	//   51  135:aload_1         
	//   52  136:iload           7
	//   53  138:invokevirtual   #477 <Method float MotionEvent.getX(int)>
	//   54  141:fstore_3        
		f = f2 - mLastMotionX;
	//   55  142:fload_3         
	//   56  143:aload_0         
	//   57  144:getfield        #479 <Field float mLastMotionX>
	//   58  147:fsub            
	//   59  148:fstore_2        
		f4 = Math.abs(f);
	//   60  149:fload_2         
	//   61  150:invokestatic    #501 <Method float Math.abs(float)>
	//   62  153:fstore          5
		f3 = motionevent.getY(j);
	//   63  155:aload_1         
	//   64  156:iload           7
	//   65  158:invokevirtual   #1043 <Method float MotionEvent.getY(int)>
	//   66  161:fstore          4
		f5 = Math.abs(f3 - mInitialMotionY);
	//   67  163:fload           4
	//   68  165:aload_0         
	//   69  166:getfield        #1045 <Field float mInitialMotionY>
	//   70  169:fsub            
	//   71  170:invokestatic    #501 <Method float Math.abs(float)>
	//   72  173:fstore          6
		if(f != 0.0F && !isGutterDrag(mLastMotionX, f) && canScroll(((View) (this)), false, (int)f, (int)f2, (int)f3))
	//*  73  175:fload_2         
	//*  74  176:fconst_0        
	//*  75  177:fcmpl           
	//*  76  178:ifeq            227
	//*  77  181:aload_0         
	//*  78  182:aload_0         
	//*  79  183:getfield        #479 <Field float mLastMotionX>
	//*  80  186:fload_2         
	//*  81  187:invokespecial   #1047 <Method boolean isGutterDrag(float, float)>
	//*  82  190:ifne            227
	//*  83  193:aload_0         
	//*  84  194:aload_0         
	//*  85  195:iconst_0        
	//*  86  196:fload_2         
	//*  87  197:f2i             
	//*  88  198:fload_3         
	//*  89  199:f2i             
	//*  90  200:fload           4
	//*  91  202:f2i             
	//*  92  203:invokevirtual   #752 <Method boolean canScroll(View, boolean, int, int, int)>
	//*  93  206:ifeq            227
		{
			mLastMotionX = f2;
	//   94  209:aload_0         
	//   95  210:fload_3         
	//   96  211:putfield        #479 <Field float mLastMotionX>
			mLastMotionY = f3;
	//   97  214:aload_0         
	//   98  215:fload           4
	//   99  217:putfield        #1049 <Field float mLastMotionY>
			mIsUnableToDrag = true;
	//  100  220:aload_0         
	//  101  221:iconst_1        
	//  102  222:putfield        #384 <Field boolean mIsUnableToDrag>
			return false;
	//  103  225:iconst_0        
	//  104  226:ireturn         
		}
		if(f4 <= (float)mTouchSlop || 0.5F * f4 <= f5) goto _L10; else goto _L9
	//  105  227:fload           5
	//  106  229:aload_0         
	//  107  230:getfield        #977 <Field int mTouchSlop>
	//  108  233:i2f             
	//  109  234:fcmpl           
	//  110  235:ifle            334
	//  111  238:ldc2            #816 <Float 0.5F>
	//  112  241:fload           5
	//  113  243:fmul            
	//  114  244:fload           6
	//  115  246:fcmpl           
	//  116  247:ifle            334
_L9:
		mIsBeingDragged = true;
	//  117  250:aload_0         
	//  118  251:iconst_1        
	//  119  252:putfield        #382 <Field boolean mIsBeingDragged>
		requestParentDisallowInterceptTouchEvent(true);
	//  120  255:aload_0         
	//  121  256:iconst_1        
	//  122  257:invokespecial   #1051 <Method void requestParentDisallowInterceptTouchEvent(boolean)>
		setScrollState(1);
	//  123  260:aload_0         
	//  124  261:iconst_1        
	//  125  262:invokevirtual   #723 <Method void setScrollState(int)>
		if(f > 0.0F)
	//* 126  265:fload_2         
	//* 127  266:fconst_0        
	//* 128  267:fcmpl           
	//* 129  268:ifle            320
			f = mInitialMotionX + (float)mTouchSlop;
	//  130  271:aload_0         
	//  131  272:getfield        #725 <Field float mInitialMotionX>
	//  132  275:aload_0         
	//  133  276:getfield        #977 <Field int mTouchSlop>
	//  134  279:i2f             
	//  135  280:fadd            
	//  136  281:fstore_2        
		else
	//* 137  282:aload_0         
	//* 138  283:fload_2         
	//* 139  284:putfield        #479 <Field float mLastMotionX>
	//* 140  287:aload_0         
	//* 141  288:fload           4
	//* 142  290:putfield        #1049 <Field float mLastMotionY>
	//* 143  293:aload_0         
	//* 144  294:iconst_1        
	//* 145  295:invokespecial   #269 <Method void setScrollingCacheEnabled(boolean)>
	//* 146  298:aload_0         
	//* 147  299:getfield        #382 <Field boolean mIsBeingDragged>
	//* 148  302:ifeq            88
	//* 149  305:aload_0         
	//* 150  306:fload_3         
	//* 151  307:invokespecial   #1053 <Method boolean performDrag(float)>
	//* 152  310:ifeq            88
	//* 153  313:aload_0         
	//* 154  314:invokestatic    #768 <Method void ViewCompat.postInvalidateOnAnimation(View)>
	//* 155  317:goto            88
			f = mInitialMotionX - (float)mTouchSlop;
	//  156  320:aload_0         
	//  157  321:getfield        #725 <Field float mInitialMotionX>
	//  158  324:aload_0         
	//  159  325:getfield        #977 <Field int mTouchSlop>
	//  160  328:i2f             
	//  161  329:fsub            
	//  162  330:fstore_2        
		mLastMotionX = f;
		mLastMotionY = f3;
		setScrollingCacheEnabled(true);
_L11:
		if(mIsBeingDragged && performDrag(f2))
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
		continue; /* Loop/switch isn't completed */
	//* 163  331:goto            282
_L10:
		if(f5 > (float)mTouchSlop)
	//* 164  334:fload           6
	//* 165  336:aload_0         
	//* 166  337:getfield        #977 <Field int mTouchSlop>
	//* 167  340:i2f             
	//* 168  341:fcmpl           
	//* 169  342:ifle            298
			mIsUnableToDrag = true;
	//  170  345:aload_0         
	//  171  346:iconst_1        
	//  172  347:putfield        #384 <Field boolean mIsUnableToDrag>
		if(true) goto _L11; else goto _L6
	//  173  350:goto            298
_L6:
		float f1 = motionevent.getX();
	//  174  353:aload_1         
	//  175  354:invokevirtual   #1056 <Method float MotionEvent.getX()>
	//  176  357:fstore_2        
		mInitialMotionX = f1;
	//  177  358:aload_0         
	//  178  359:fload_2         
	//  179  360:putfield        #725 <Field float mInitialMotionX>
		mLastMotionX = f1;
	//  180  363:aload_0         
	//  181  364:fload_2         
	//  182  365:putfield        #479 <Field float mLastMotionX>
		f1 = motionevent.getY();
	//  183  368:aload_1         
	//  184  369:invokevirtual   #1058 <Method float MotionEvent.getY()>
	//  185  372:fstore_2        
		mInitialMotionY = f1;
	//  186  373:aload_0         
	//  187  374:fload_2         
	//  188  375:putfield        #1045 <Field float mInitialMotionY>
		mLastMotionY = f1;
	//  189  378:aload_0         
	//  190  379:fload_2         
	//  191  380:putfield        #1049 <Field float mLastMotionY>
		mActivePointerId = motionevent.getPointerId(0);
	//  192  383:aload_0         
	//  193  384:aload_1         
	//  194  385:iconst_0        
	//  195  386:invokevirtual   #474 <Method int MotionEvent.getPointerId(int)>
	//  196  389:putfield        #212 <Field int mActivePointerId>
		mIsUnableToDrag = false;
	//  197  392:aload_0         
	//  198  393:iconst_0        
	//  199  394:putfield        #384 <Field boolean mIsUnableToDrag>
		mIsScrollStarted = true;
	//  200  397:aload_0         
	//  201  398:iconst_1        
	//  202  399:putfield        #761 <Field boolean mIsScrollStarted>
		mScroller.computeScrollOffset();
	//  203  402:aload_0         
	//  204  403:getfield        #271 <Field Scroller mScroller>
	//  205  406:invokevirtual   #764 <Method boolean Scroller.computeScrollOffset()>
	//  206  409:pop             
		if(mScrollState == 2 && Math.abs(mScroller.getFinalX() - mScroller.getCurrX()) > mCloseEnough)
	//* 207  410:aload_0         
	//* 208  411:getfield        #223 <Field int mScrollState>
	//* 209  414:iconst_2        
	//* 210  415:icmpne          477
	//* 211  418:aload_0         
	//* 212  419:getfield        #271 <Field Scroller mScroller>
	//* 213  422:invokevirtual   #1061 <Method int Scroller.getFinalX()>
	//* 214  425:aload_0         
	//* 215  426:getfield        #271 <Field Scroller mScroller>
	//* 216  429:invokevirtual   #289 <Method int Scroller.getCurrX()>
	//* 217  432:isub            
	//* 218  433:invokestatic    #324 <Method int Math.abs(int)>
	//* 219  436:aload_0         
	//* 220  437:getfield        #985 <Field int mCloseEnough>
	//* 221  440:icmple          477
		{
			mScroller.abortAnimation();
	//  222  443:aload_0         
	//  223  444:getfield        #271 <Field Scroller mScroller>
	//  224  447:invokevirtual   #280 <Method void Scroller.abortAnimation()>
			mPopulatePending = false;
	//  225  450:aload_0         
	//  226  451:iconst_0        
	//  227  452:putfield        #302 <Field boolean mPopulatePending>
			populate();
	//  228  455:aload_0         
	//  229  456:invokevirtual   #1064 <Method void populate()>
			mIsBeingDragged = true;
	//  230  459:aload_0         
	//  231  460:iconst_1        
	//  232  461:putfield        #382 <Field boolean mIsBeingDragged>
			requestParentDisallowInterceptTouchEvent(true);
	//  233  464:aload_0         
	//  234  465:iconst_1        
	//  235  466:invokespecial   #1051 <Method void requestParentDisallowInterceptTouchEvent(boolean)>
			setScrollState(1);
	//  236  469:aload_0         
	//  237  470:iconst_1        
	//  238  471:invokevirtual   #723 <Method void setScrollState(int)>
		} else
	//* 239  474:goto            88
		{
			completeScroll(false);
	//  240  477:aload_0         
	//  241  478:iconst_0        
	//  242  479:invokespecial   #528 <Method void completeScroll(boolean)>
			mIsBeingDragged = false;
	//  243  482:aload_0         
	//  244  483:iconst_0        
	//  245  484:putfield        #382 <Field boolean mIsBeingDragged>
		}
		continue; /* Loop/switch isn't completed */
	//  246  487:goto            88
_L8:
		onSecondaryPointerUp(motionevent);
	//  247  490:aload_0         
	//  248  491:aload_1         
	//  249  492:invokespecial   #1066 <Method void onSecondaryPointerUp(MotionEvent)>
		if(true) goto _L5; else goto _L12
	//  250  495:goto            88
_L12:
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		int i1;
		int j1;
		int j2;
		int l3;
		int i4;
		int j4;
		int k4;
		l3 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #367 <Method int getChildCount()>
	//    2    4:istore          12
		j4 = k - i;
	//    3    6:iload           4
	//    4    8:iload_2         
	//    5    9:isub            
	//    6   10:istore          14
		i4 = l - j;
	//    7   12:iload           5
	//    8   14:iload_3         
	//    9   15:isub            
	//   10   16:istore          13
		j = getPaddingLeft();
	//   11   18:aload_0         
	//   12   19:invokevirtual   #436 <Method int getPaddingLeft()>
	//   13   22:istore_3        
		i = getPaddingTop();
	//   14   23:aload_0         
	//   15   24:invokevirtual   #839 <Method int getPaddingTop()>
	//   16   27:istore_2        
		i1 = getPaddingRight();
	//   17   28:aload_0         
	//   18   29:invokevirtual   #439 <Method int getPaddingRight()>
	//   19   32:istore          7
		k = getPaddingBottom();
	//   20   34:aload_0         
	//   21   35:invokevirtual   #842 <Method int getPaddingBottom()>
	//   22   38:istore          4
		k4 = getScrollX();
	//   23   40:aload_0         
	//   24   41:invokevirtual   #283 <Method int getScrollX()>
	//   25   44:istore          15
		j1 = 0;
	//   26   46:iconst_0        
	//   27   47:istore          8
		j2 = 0;
	//   28   49:iconst_0        
	//   29   50:istore          10
_L14:
		if(j2 >= l3) goto _L2; else goto _L1
	//   30   52:iload           10
	//   31   54:iload           12
	//   32   56:icmpge          457
_L1:
		View view = getChildAt(j2);
	//   33   59:aload_0         
	//   34   60:iload           10
	//   35   62:invokevirtual   #373 <Method View getChildAt(int)>
	//   36   65:astore          17
		if(view.getVisibility() == 8) goto _L4; else goto _L3
	//   37   67:aload           17
	//   38   69:invokevirtual   #590 <Method int View.getVisibility()>
	//   39   72:bipush          8
	//   40   74:icmpeq          671
_L3:
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   41   77:aload           17
	//   42   79:invokevirtual   #533 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   43   82:checkcast       #20  <Class ViewPager$LayoutParams>
	//   44   85:astore          18
		if(!layoutparams.isDecor) goto _L4; else goto _L5
	//   45   87:aload           18
	//   46   89:getfield        #536 <Field boolean ViewPager$LayoutParams.isDecor>
	//   47   92:ifeq            671
_L5:
		int l4;
		l = layoutparams.gravity;
	//   48   95:aload           18
	//   49   97:getfield        #1071 <Field int ViewPager$LayoutParams.gravity>
	//   50  100:istore          5
		l4 = layoutparams.gravity;
	//   51  102:aload           18
	//   52  104:getfield        #1071 <Field int ViewPager$LayoutParams.gravity>
	//   53  107:istore          16
		l & 7;
	//   54  109:iload           5
	//   55  111:bipush          7
	//   56  113:iand            
		JVM INSTR tableswitch 1 5: default 148
	//	               1 304
	//	               2 148
	//	               3 285
	//	               4 148
	//	               5 326;
	//   57  114:tableswitch     1 5: default 148
	//	               1 304
	//	               2 148
	//	               3 285
	//	               4 148
	//	               5 326
		   goto _L6 _L7 _L6 _L8 _L6 _L9
_L6:
		int k1;
		l = j;
	//   58  148:iload_3         
	//   59  149:istore          5
		k1 = j;
	//   60  151:iload_3         
	//   61  152:istore          9
_L15:
		l4 & 0x70;
	//   62  154:iload           16
	//   63  156:bipush          112
	//   64  158:iand            
		JVM INSTR lookupswitch 3: default 192
	//	               16: 394
	//	               48: 367
	//	               80: 422;
	//   65  159:lookupswitch    3: default 192
	//	               16: 394
	//	               48: 367
	//	               80: 422
		   goto _L10 _L11 _L12 _L13
_L10:
		int k2 = i;
	//   66  192:iload_2         
	//   67  193:istore          11
		j = i;
	//   68  195:iload_2         
	//   69  196:istore_3        
		i = k;
	//   70  197:iload           4
	//   71  199:istore_2        
		k = k2;
	//   72  200:iload           11
	//   73  202:istore          4
_L16:
		l += k4;
	//   74  204:iload           5
	//   75  206:iload           15
	//   76  208:iadd            
	//   77  209:istore          5
		view.layout(l, k, view.getMeasuredWidth() + l, view.getMeasuredHeight() + k);
	//   78  211:aload           17
	//   79  213:iload           5
	//   80  215:iload           4
	//   81  217:aload           17
	//   82  219:invokevirtual   #1072 <Method int View.getMeasuredWidth()>
	//   83  222:iload           5
	//   84  224:iadd            
	//   85  225:aload           17
	//   86  227:invokevirtual   #1075 <Method int View.getMeasuredHeight()>
	//   87  230:iload           4
	//   88  232:iadd            
	//   89  233:invokevirtual   #1078 <Method void View.layout(int, int, int, int)>
		j1++;
	//   90  236:iload           8
	//   91  238:iconst_1        
	//   92  239:iadd            
	//   93  240:istore          8
		l = i1;
	//   94  242:iload           7
	//   95  244:istore          5
		k = k1;
	//   96  246:iload           9
	//   97  248:istore          4
		i1 = i;
	//   98  250:iload_2         
	//   99  251:istore          7
		i = j1;
	//  100  253:iload           8
	//  101  255:istore_2        
_L17:
		j2++;
	//  102  256:iload           10
	//  103  258:iconst_1        
	//  104  259:iadd            
	//  105  260:istore          10
		k1 = k;
	//  106  262:iload           4
	//  107  264:istore          9
		j1 = i;
	//  108  266:iload_2         
	//  109  267:istore          8
		i = j;
	//  110  269:iload_3         
	//  111  270:istore_2        
		k = i1;
	//  112  271:iload           7
	//  113  273:istore          4
		i1 = l;
	//  114  275:iload           5
	//  115  277:istore          7
		j = k1;
	//  116  279:iload           9
	//  117  281:istore_3        
		  goto _L14
	//* 118  282:goto            52
_L8:
		k1 = view.getMeasuredWidth();
	//  119  285:aload           17
	//  120  287:invokevirtual   #1072 <Method int View.getMeasuredWidth()>
	//  121  290:istore          9
		l = j;
	//  122  292:iload_3         
	//  123  293:istore          5
		k1 += j;
	//  124  295:iload           9
	//  125  297:iload_3         
	//  126  298:iadd            
	//  127  299:istore          9
		  goto _L15
	//* 128  301:goto            154
_L7:
		l = Math.max((j4 - view.getMeasuredWidth()) / 2, j);
	//  129  304:iload           14
	//  130  306:aload           17
	//  131  308:invokevirtual   #1072 <Method int View.getMeasuredWidth()>
	//  132  311:isub            
	//  133  312:iconst_2        
	//  134  313:idiv            
	//  135  314:iload_3         
	//  136  315:invokestatic    #335 <Method int Math.max(int, int)>
	//  137  318:istore          5
		k1 = j;
	//  138  320:iload_3         
	//  139  321:istore          9
		  goto _L15
	//* 140  323:goto            154
_L9:
		k1 = view.getMeasuredWidth();
	//  141  326:aload           17
	//  142  328:invokevirtual   #1072 <Method int View.getMeasuredWidth()>
	//  143  331:istore          9
		l = i1 + view.getMeasuredWidth();
	//  144  333:iload           7
	//  145  335:aload           17
	//  146  337:invokevirtual   #1072 <Method int View.getMeasuredWidth()>
	//  147  340:iadd            
	//  148  341:istore          5
		int l2 = j4 - i1 - k1;
	//  149  343:iload           14
	//  150  345:iload           7
	//  151  347:isub            
	//  152  348:iload           9
	//  153  350:isub            
	//  154  351:istore          11
		i1 = l;
	//  155  353:iload           5
	//  156  355:istore          7
		k1 = j;
	//  157  357:iload_3         
	//  158  358:istore          9
		l = l2;
	//  159  360:iload           11
	//  160  362:istore          5
		  goto _L15
	//* 161  364:goto            154
_L12:
		int i3 = view.getMeasuredHeight();
	//  162  367:aload           17
	//  163  369:invokevirtual   #1075 <Method int View.getMeasuredHeight()>
	//  164  372:istore          11
		j = k;
	//  165  374:iload           4
	//  166  376:istore_3        
		i3 += i;
	//  167  377:iload           11
	//  168  379:iload_2         
	//  169  380:iadd            
	//  170  381:istore          11
		k = i;
	//  171  383:iload_2         
	//  172  384:istore          4
		i = j;
	//  173  386:iload_3         
	//  174  387:istore_2        
		j = i3;
	//  175  388:iload           11
	//  176  390:istore_3        
		  goto _L16
	//* 177  391:goto            204
_L11:
		int j3 = Math.max((i4 - view.getMeasuredHeight()) / 2, i);
	//  178  394:iload           13
	//  179  396:aload           17
	//  180  398:invokevirtual   #1075 <Method int View.getMeasuredHeight()>
	//  181  401:isub            
	//  182  402:iconst_2        
	//  183  403:idiv            
	//  184  404:iload_2         
	//  185  405:invokestatic    #335 <Method int Math.max(int, int)>
	//  186  408:istore          11
		j = i;
	//  187  410:iload_2         
	//  188  411:istore_3        
		i = k;
	//  189  412:iload           4
	//  190  414:istore_2        
		k = j3;
	//  191  415:iload           11
	//  192  417:istore          4
		  goto _L16
	//* 193  419:goto            204
_L13:
		int k3 = i4 - k - view.getMeasuredHeight();
	//  194  422:iload           13
	//  195  424:iload           4
	//  196  426:isub            
	//  197  427:aload           17
	//  198  429:invokevirtual   #1075 <Method int View.getMeasuredHeight()>
	//  199  432:isub            
	//  200  433:istore          11
		int i5 = view.getMeasuredHeight();
	//  201  435:aload           17
	//  202  437:invokevirtual   #1075 <Method int View.getMeasuredHeight()>
	//  203  440:istore          16
		j = i;
	//  204  442:iload_2         
	//  205  443:istore_3        
		i = k + i5;
	//  206  444:iload           4
	//  207  446:iload           16
	//  208  448:iadd            
	//  209  449:istore_2        
		k = k3;
	//  210  450:iload           11
	//  211  452:istore          4
		  goto _L16
	//* 212  454:goto            204
_L2:
		i1 = j4 - j - i1;
	//  213  457:iload           14
	//  214  459:iload_3         
	//  215  460:isub            
	//  216  461:iload           7
	//  217  463:isub            
	//  218  464:istore          7
		for(l = 0; l < l3; l++)
	//* 219  466:iconst_0        
	//* 220  467:istore          5
	//* 221  469:iload           5
	//* 222  471:iload           12
	//* 223  473:icmpge          627
		{
			View view1 = getChildAt(l);
	//  224  476:aload_0         
	//  225  477:iload           5
	//  226  479:invokevirtual   #373 <Method View getChildAt(int)>
	//  227  482:astore          17
			if(view1.getVisibility() == 8)
				continue;
	//  228  484:aload           17
	//  229  486:invokevirtual   #590 <Method int View.getVisibility()>
	//  230  489:bipush          8
	//  231  491:icmpeq          618
			LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//  232  494:aload           17
	//  233  496:invokevirtual   #533 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  234  499:checkcast       #20  <Class ViewPager$LayoutParams>
	//  235  502:astore          18
			if(layoutparams1.isDecor)
				continue;
	//  236  504:aload           18
	//  237  506:getfield        #536 <Field boolean ViewPager$LayoutParams.isDecor>
	//  238  509:ifne            618
			ItemInfo iteminfo = infoForChild(view1);
	//  239  512:aload_0         
	//  240  513:aload           17
	//  241  515:invokevirtual   #594 <Method ViewPager$ItemInfo infoForChild(View)>
	//  242  518:astore          19
			if(iteminfo == null)
				continue;
	//  243  520:aload           19
	//  244  522:ifnull          618
			float f = i1;
	//  245  525:iload           7
	//  246  527:i2f             
	//  247  528:fstore          6
			int l1 = (int)(iteminfo.offset * f) + j;
	//  248  530:aload           19
	//  249  532:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//  250  535:fload           6
	//  251  537:fmul            
	//  252  538:f2i             
	//  253  539:iload_3         
	//  254  540:iadd            
	//  255  541:istore          9
			if(layoutparams1.needsMeasure)
	//* 256  543:aload           18
	//* 257  545:getfield        #652 <Field boolean ViewPager$LayoutParams.needsMeasure>
	//* 258  548:ifeq            595
			{
				layoutparams1.needsMeasure = false;
	//  259  551:aload           18
	//  260  553:iconst_0        
	//  261  554:putfield        #652 <Field boolean ViewPager$LayoutParams.needsMeasure>
				float f1 = i1;
	//  262  557:iload           7
	//  263  559:i2f             
	//  264  560:fstore          6
				view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)(layoutparams1.widthFactor * f1), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(i4 - i - k, 0x40000000));
	//  265  562:aload           17
	//  266  564:aload           18
	//  267  566:getfield        #790 <Field float ViewPager$LayoutParams.widthFactor>
	//  268  569:fload           6
	//  269  571:fmul            
	//  270  572:f2i             
	//  271  573:ldc2            #1079 <Int 0x40000000>
	//  272  576:invokestatic    #1084 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  273  579:iload           13
	//  274  581:iload_2         
	//  275  582:isub            
	//  276  583:iload           4
	//  277  585:isub            
	//  278  586:ldc2            #1079 <Int 0x40000000>
	//  279  589:invokestatic    #1084 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  280  592:invokevirtual   #1087 <Method void View.measure(int, int)>
			}
			view1.layout(l1, i, view1.getMeasuredWidth() + l1, view1.getMeasuredHeight() + i);
	//  281  595:aload           17
	//  282  597:iload           9
	//  283  599:iload_2         
	//  284  600:aload           17
	//  285  602:invokevirtual   #1072 <Method int View.getMeasuredWidth()>
	//  286  605:iload           9
	//  287  607:iadd            
	//  288  608:aload           17
	//  289  610:invokevirtual   #1075 <Method int View.getMeasuredHeight()>
	//  290  613:iload_2         
	//  291  614:iadd            
	//  292  615:invokevirtual   #1078 <Method void View.layout(int, int, int, int)>
		}

	//  293  618:iload           5
	//  294  620:iconst_1        
	//  295  621:iadd            
	//  296  622:istore          5
	//* 297  624:goto            469
		mTopPageBounds = i;
	//  298  627:aload_0         
	//  299  628:iload_2         
	//  300  629:putfield        #1026 <Field int mTopPageBounds>
		mBottomPageBounds = i4 - k;
	//  301  632:aload_0         
	//  302  633:iload           13
	//  303  635:iload           4
	//  304  637:isub            
	//  305  638:putfield        #1028 <Field int mBottomPageBounds>
		mDecorChildCount = j1;
	//  306  641:aload_0         
	//  307  642:iload           8
	//  308  644:putfield        #1089 <Field int mDecorChildCount>
		if(mFirstLayout)
	//* 309  647:aload_0         
	//* 310  648:getfield        #214 <Field boolean mFirstLayout>
	//* 311  651:ifeq            665
			scrollToItem(mCurItem, false, 0, false);
	//  312  654:aload_0         
	//  313  655:aload_0         
	//  314  656:getfield        #337 <Field int mCurItem>
	//  315  659:iconst_0        
	//  316  660:iconst_0        
	//  317  661:iconst_0        
	//  318  662:invokespecial   #1091 <Method void scrollToItem(int, boolean, int, boolean)>
		mFirstLayout = false;
	//  319  665:aload_0         
	//  320  666:iconst_0        
	//  321  667:putfield        #214 <Field boolean mFirstLayout>
		return;
	//  322  670:return          
_L4:
		l = j1;
	//  323  671:iload           8
	//  324  673:istore          5
		j1 = i;
	//  325  675:iload_2         
	//  326  676:istore          8
		int i2 = j;
	//  327  678:iload_3         
	//  328  679:istore          9
		i = l;
	//  329  681:iload           5
	//  330  683:istore_2        
		l = i1;
	//  331  684:iload           7
	//  332  686:istore          5
		i1 = k;
	//  333  688:iload           4
	//  334  690:istore          7
		j = j1;
	//  335  692:iload           8
	//  336  694:istore_3        
		k = i2;
	//  337  695:iload           9
	//  338  697:istore          4
		  goto _L17
	//* 339  699:goto            256
	}

	protected void onMeasure(int i, int j)
	{
label0:
		{
			setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, j));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iload_1         
	//    3    3:invokestatic    #1095 <Method int getDefaultSize(int, int)>
	//    4    6:iconst_0        
	//    5    7:iload_2         
	//    6    8:invokestatic    #1095 <Method int getDefaultSize(int, int)>
	//    7   11:invokevirtual   #1098 <Method void setMeasuredDimension(int, int)>
			i = getMeasuredWidth();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #433 <Method int getMeasuredWidth()>
	//   10   18:istore_1        
			mGutterSize = Math.min(i / 10, mDefaultGutterSize);
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:bipush          10
	//   14   23:idiv            
	//   15   24:aload_0         
	//   16   25:getfield        #988 <Field int mDefaultGutterSize>
	//   17   28:invokestatic    #332 <Method int Math.min(int, int)>
	//   18   31:putfield        #461 <Field int mGutterSize>
			i = i - getPaddingLeft() - getPaddingRight();
	//   19   34:iload_1         
	//   20   35:aload_0         
	//   21   36:invokevirtual   #436 <Method int getPaddingLeft()>
	//   22   39:isub            
	//   23   40:aload_0         
	//   24   41:invokevirtual   #439 <Method int getPaddingRight()>
	//   25   44:isub            
	//   26   45:istore_1        
			j = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
	//   27   46:aload_0         
	//   28   47:invokevirtual   #1099 <Method int getMeasuredHeight()>
	//   29   50:aload_0         
	//   30   51:invokevirtual   #839 <Method int getPaddingTop()>
	//   31   54:isub            
	//   32   55:aload_0         
	//   33   56:invokevirtual   #842 <Method int getPaddingBottom()>
	//   34   59:isub            
	//   35   60:istore_2        
			int j2 = getChildCount();
	//   36   61:aload_0         
	//   37   62:invokevirtual   #367 <Method int getChildCount()>
	//   38   65:istore          12
			int i1 = 0;
	//   39   67:iconst_0        
	//   40   68:istore          6
			while(i1 < j2) 
	//*  41   70:iload           6
	//*  42   72:iload           12
	//*  43   74:icmpge          392
			{
label1:
				{
					{
						View view = getChildAt(i1);
	//   44   77:aload_0         
	//   45   78:iload           6
	//   46   80:invokevirtual   #373 <Method View getChildAt(int)>
	//   47   83:astore          13
						int k = i;
	//   48   85:iload_1         
	//   49   86:istore          4
						int l = j;
	//   50   88:iload_2         
	//   51   89:istore          5
						if(view.getVisibility() == 8)
							break label1;
	//   52   91:aload           13
	//   53   93:invokevirtual   #590 <Method int View.getVisibility()>
	//   54   96:bipush          8
	//   55   98:icmpeq          318
						LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   56  101:aload           13
	//   57  103:invokevirtual   #533 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   58  106:checkcast       #20  <Class ViewPager$LayoutParams>
	//   59  109:astore          14
						k = i;
	//   60  111:iload_1         
	//   61  112:istore          4
						l = j;
	//   62  114:iload_2         
	//   63  115:istore          5
						if(layoutparams == null)
							break label1;
	//   64  117:aload           14
	//   65  119:ifnull          318
						k = i;
	//   66  122:iload_1         
	//   67  123:istore          4
						l = j;
	//   68  125:iload_2         
	//   69  126:istore          5
						if(!layoutparams.isDecor)
							break label1;
	//   70  128:aload           14
	//   71  130:getfield        #536 <Field boolean ViewPager$LayoutParams.isDecor>
	//   72  133:ifeq            318
						k = layoutparams.gravity & 7;
	//   73  136:aload           14
	//   74  138:getfield        #1071 <Field int ViewPager$LayoutParams.gravity>
	//   75  141:bipush          7
	//   76  143:iand            
	//   77  144:istore          4
						int j1 = layoutparams.gravity & 0x70;
	//   78  146:aload           14
	//   79  148:getfield        #1071 <Field int ViewPager$LayoutParams.gravity>
	//   80  151:bipush          112
	//   81  153:iand            
	//   82  154:istore          7
						int k1 = 0x80000000;
	//   83  156:ldc2            #1100 <Int 0x80000000>
	//   84  159:istore          9
						l = 0x80000000;
	//   85  161:ldc2            #1100 <Int 0x80000000>
	//   86  164:istore          5
						boolean flag;
						boolean flag1;
						if(j1 == 48 || j1 == 80)
	//*  87  166:iload           7
	//*  88  168:bipush          48
	//*  89  170:icmpeq          180
	//*  90  173:iload           7
	//*  91  175:bipush          80
	//*  92  177:icmpne          333
							flag = true;
	//   93  180:iconst_1        
	//   94  181:istore          7
						else
	//*  95  183:iload           4
	//*  96  185:iconst_3        
	//*  97  186:icmpeq          195
	//*  98  189:iload           4
	//*  99  191:iconst_5        
	//* 100  192:icmpne          339
	//* 101  195:iconst_1        
	//* 102  196:istore          8
	//* 103  198:iload           7
	//* 104  200:ifeq            345
	//* 105  203:ldc2            #1079 <Int 0x40000000>
	//* 106  206:istore          4
	//* 107  208:aload           14
	//* 108  210:getfield        #1103 <Field int ViewPager$LayoutParams.width>
	//* 109  213:bipush          -2
	//* 110  215:icmpeq          528
	//* 111  218:ldc2            #1079 <Int 0x40000000>
	//* 112  221:istore          9
	//* 113  223:aload           14
	//* 114  225:getfield        #1103 <Field int ViewPager$LayoutParams.width>
	//* 115  228:iconst_m1       
	//* 116  229:icmpeq          522
	//* 117  232:aload           14
	//* 118  234:getfield        #1103 <Field int ViewPager$LayoutParams.width>
	//* 119  237:istore          4
	//* 120  239:aload           14
	//* 121  241:getfield        #1106 <Field int ViewPager$LayoutParams.height>
	//* 122  244:bipush          -2
	//* 123  246:icmpeq          516
	//* 124  249:ldc2            #1079 <Int 0x40000000>
	//* 125  252:istore          10
	//* 126  254:iload           10
	//* 127  256:istore          5
	//* 128  258:aload           14
	//* 129  260:getfield        #1106 <Field int ViewPager$LayoutParams.height>
	//* 130  263:iconst_m1       
	//* 131  264:icmpeq          516
	//* 132  267:aload           14
	//* 133  269:getfield        #1106 <Field int ViewPager$LayoutParams.height>
	//* 134  272:istore          11
	//* 135  274:iload           10
	//* 136  276:istore          5
	//* 137  278:iload           11
	//* 138  280:istore          10
	//* 139  282:aload           13
	//* 140  284:iload           4
	//* 141  286:iload           9
	//* 142  288:invokestatic    #1084 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 143  291:iload           10
	//* 144  293:iload           5
	//* 145  295:invokestatic    #1084 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 146  298:invokevirtual   #1087 <Method void View.measure(int, int)>
	//* 147  301:iload           7
	//* 148  303:ifeq            366
	//* 149  306:iload_2         
	//* 150  307:aload           13
	//* 151  309:invokevirtual   #1075 <Method int View.getMeasuredHeight()>
	//* 152  312:isub            
	//* 153  313:istore          5
	//* 154  315:iload_1         
	//* 155  316:istore          4
	//* 156  318:iload           6
	//* 157  320:iconst_1        
	//* 158  321:iadd            
	//* 159  322:istore          6
	//* 160  324:iload           4
	//* 161  326:istore_1        
	//* 162  327:iload           5
	//* 163  329:istore_2        
	//* 164  330:goto            70
							flag = false;
	//  165  333:iconst_0        
	//  166  334:istore          7
						if(k == 3 || k == 5)
							flag1 = true;
						else
	//* 167  336:goto            183
							flag1 = false;
	//  168  339:iconst_0        
	//  169  340:istore          8
						if(flag)
						{
							k = 0x40000000;
						} else
	//* 170  342:goto            198
						{
							k = k1;
	//  171  345:iload           9
	//  172  347:istore          4
							if(flag1)
	//* 173  349:iload           8
	//* 174  351:ifeq            208
							{
								l = 0x40000000;
	//  175  354:ldc2            #1079 <Int 0x40000000>
	//  176  357:istore          5
								k = k1;
	//  177  359:iload           9
	//  178  361:istore          4
							}
						}
						if(layoutparams.width != -2)
						{
							k1 = 0x40000000;
							float f;
							int l1;
							int i2;
							if(layoutparams.width != -1)
								k = layoutparams.width;
							else
	//* 179  363:goto            208
	//* 180  366:iload_1         
	//* 181  367:istore          4
	//* 182  369:iload_2         
	//* 183  370:istore          5
	//* 184  372:iload           8
	//* 185  374:ifeq            318
	//* 186  377:iload_1         
	//* 187  378:aload           13
	//* 188  380:invokevirtual   #1072 <Method int View.getMeasuredWidth()>
	//* 189  383:isub            
	//* 190  384:istore          4
	//* 191  386:iload_2         
	//* 192  387:istore          5
	//* 193  389:goto            318
	//* 194  392:aload_0         
	//* 195  393:iload_1         
	//* 196  394:ldc2            #1079 <Int 0x40000000>
	//* 197  397:invokestatic    #1084 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 198  400:putfield        #1108 <Field int mChildWidthMeasureSpec>
	//* 199  403:aload_0         
	//* 200  404:iload_2         
	//* 201  405:ldc2            #1079 <Int 0x40000000>
	//* 202  408:invokestatic    #1084 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 203  411:putfield        #1110 <Field int mChildHeightMeasureSpec>
	//* 204  414:aload_0         
	//* 205  415:iconst_1        
	//* 206  416:putfield        #647 <Field boolean mInLayout>
	//* 207  419:aload_0         
	//* 208  420:invokevirtual   #1064 <Method void populate()>
	//* 209  423:aload_0         
	//* 210  424:iconst_0        
	//* 211  425:putfield        #647 <Field boolean mInLayout>
	//* 212  428:aload_0         
	//* 213  429:invokevirtual   #367 <Method int getChildCount()>
	//* 214  432:istore          4
	//* 215  434:iconst_0        
	//* 216  435:istore_2        
	//* 217  436:iload_2         
	//* 218  437:iload           4
	//* 219  439:icmpge          515
	//* 220  442:aload_0         
	//* 221  443:iload_2         
	//* 222  444:invokevirtual   #373 <Method View getChildAt(int)>
	//* 223  447:astore          13
	//* 224  449:aload           13
	//* 225  451:invokevirtual   #590 <Method int View.getVisibility()>
	//* 226  454:bipush          8
	//* 227  456:icmpeq          508
	//* 228  459:aload           13
	//* 229  461:invokevirtual   #533 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 230  464:checkcast       #20  <Class ViewPager$LayoutParams>
	//* 231  467:astore          14
	//* 232  469:aload           14
	//* 233  471:ifnull          482
	//* 234  474:aload           14
	//* 235  476:getfield        #536 <Field boolean ViewPager$LayoutParams.isDecor>
	//* 236  479:ifne            508
	//* 237  482:iload_1         
	//* 238  483:i2f             
	//* 239  484:fstore_3        
	//* 240  485:aload           13
	//* 241  487:aload           14
	//* 242  489:getfield        #790 <Field float ViewPager$LayoutParams.widthFactor>
	//* 243  492:fload_3         
	//* 244  493:fmul            
	//* 245  494:f2i             
	//* 246  495:ldc2            #1079 <Int 0x40000000>
	//* 247  498:invokestatic    #1084 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 248  501:aload_0         
	//* 249  502:getfield        #1110 <Field int mChildHeightMeasureSpec>
	//* 250  505:invokevirtual   #1087 <Method void View.measure(int, int)>
	//* 251  508:iload_2         
	//* 252  509:iconst_1        
	//* 253  510:iadd            
	//* 254  511:istore_2        
	//* 255  512:goto            436
	//* 256  515:return          
	//* 257  516:iload_2         
	//* 258  517:istore          10
	//* 259  519:goto            282
								k = i;
	//  260  522:iload_1         
	//  261  523:istore          4
						} else
	//* 262  525:goto            239
						{
							k1 = k;
	//  263  528:iload           4
	//  264  530:istore          9
							k = i;
	//  265  532:iload_1         
	//  266  533:istore          4
						}
						if(layoutparams.height == -2)
							break label0;
						l1 = 0x40000000;
						l = l1;
						if(layoutparams.height == -1)
							break label0;
						i2 = layoutparams.height;
						l = l1;
						l1 = i2;
					}
					view.measure(android.view.View.MeasureSpec.makeMeasureSpec(k, k1), android.view.View.MeasureSpec.makeMeasureSpec(l1, l));
					if(flag)
					{
						l = j - view.getMeasuredHeight();
						k = i;
					} else
					{
						k = i;
						l = j;
						if(flag1)
						{
							k = i - view.getMeasuredWidth();
							l = j;
						}
					}
				}
				i1++;
				i = k;
				j = l;
			}
			mChildWidthMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
			mChildHeightMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
			mInLayout = true;
			populate();
			mInLayout = false;
			k = getChildCount();
			for(j = 0; j < k; j++)
			{
				view = getChildAt(j);
				if(view.getVisibility() == 8)
					continue;
				layoutparams = (LayoutParams)view.getLayoutParams();
				if(layoutparams == null || !layoutparams.isDecor)
				{
					f = i;
					view.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)(layoutparams.widthFactor * f), 0x40000000), mChildHeightMeasureSpec);
				}
			}

			return;
		}
		l1 = j;
		break MISSING_BLOCK_LABEL_282;
	//* 267  535:goto            239
	}

	protected void onPageScrolled(int i, float f, int j)
	{
		int k;
		int i1;
		int k2;
		int l2;
		int i3;
		int j3;
		if(mDecorChildCount <= 0)
			break MISSING_BLOCK_LABEL_299;
	//    0    0:aload_0         
	//    1    1:getfield        #1089 <Field int mDecorChildCount>
	//    2    4:ifle            299
		l2 = getScrollX();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #283 <Method int getScrollX()>
	//    5   11:istore          9
		k = getPaddingLeft();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #436 <Method int getPaddingLeft()>
	//    8   17:istore          4
		i1 = getPaddingRight();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #439 <Method int getPaddingRight()>
	//   11   23:istore          5
		i3 = getWidth();
	//   12   25:aload_0         
	//   13   26:invokevirtual   #464 <Method int getWidth()>
	//   14   29:istore          10
		j3 = getChildCount();
	//   15   31:aload_0         
	//   16   32:invokevirtual   #367 <Method int getChildCount()>
	//   17   35:istore          11
		k2 = 0;
	//   18   37:iconst_0        
	//   19   38:istore          8
_L2:
		int j1;
		int k1;
		View view;
		LayoutParams layoutparams;
		if(k2 >= j3)
			break MISSING_BLOCK_LABEL_299;
	//   20   40:iload           8
	//   21   42:iload           11
	//   22   44:icmpge          299
		view = getChildAt(k2);
	//   23   47:aload_0         
	//   24   48:iload           8
	//   25   50:invokevirtual   #373 <Method View getChildAt(int)>
	//   26   53:astore          13
		layoutparams = (LayoutParams)view.getLayoutParams();
	//   27   55:aload           13
	//   28   57:invokevirtual   #533 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   29   60:checkcast       #20  <Class ViewPager$LayoutParams>
	//   30   63:astore          14
		if(layoutparams.isDecor)
			break; /* Loop/switch isn't completed */
	//   31   65:aload           14
	//   32   67:getfield        #536 <Field boolean ViewPager$LayoutParams.isDecor>
	//   33   70:ifne            98
		k1 = k;
	//   34   73:iload           4
	//   35   75:istore          7
		j1 = i1;
	//   36   77:iload           5
	//   37   79:istore          6
_L7:
		k2++;
	//   38   81:iload           8
	//   39   83:iconst_1        
	//   40   84:iadd            
	//   41   85:istore          8
		k = k1;
	//   42   87:iload           7
	//   43   89:istore          4
		i1 = j1;
	//   44   91:iload           6
	//   45   93:istore          5
		if(true) goto _L2; else goto _L1
	//   46   95:goto            40
_L1:
		layoutparams.gravity & 7;
	//   47   98:aload           14
	//   48  100:getfield        #1071 <Field int ViewPager$LayoutParams.gravity>
	//   49  103:bipush          7
	//   50  105:iand            
		JVM INSTR tableswitch 1 5: default 140
	//	               1 229
	//	               2 140
	//	               3 200
	//	               4 140
	//	               5 261;
	//   51  106:tableswitch     1 5: default 140
	//	               1 229
	//	               2 140
	//	               3 200
	//	               4 140
	//	               5 261
		   goto _L3 _L4 _L3 _L5 _L3 _L6
_L6:
		break MISSING_BLOCK_LABEL_261;
_L3:
		j1 = k;
	//   52  140:iload           4
	//   53  142:istore          6
		k1 = i1;
	//   54  144:iload           5
	//   55  146:istore          7
		i1 = k;
	//   56  148:iload           4
	//   57  150:istore          5
		k = k1;
	//   58  152:iload           7
	//   59  154:istore          4
_L8:
		int k3 = (j1 + l2) - view.getLeft();
	//   60  156:iload           6
	//   61  158:iload           9
	//   62  160:iadd            
	//   63  161:aload           13
	//   64  163:invokevirtual   #400 <Method int View.getLeft()>
	//   65  166:isub            
	//   66  167:istore          12
		j1 = k;
	//   67  169:iload           4
	//   68  171:istore          6
		k1 = i1;
	//   69  173:iload           5
	//   70  175:istore          7
		if(k3 != 0)
	//*  71  177:iload           12
	//*  72  179:ifeq            81
		{
			view.offsetLeftAndRight(k3);
	//   73  182:aload           13
	//   74  184:iload           12
	//   75  186:invokevirtual   #1114 <Method void View.offsetLeftAndRight(int)>
			j1 = k;
	//   76  189:iload           4
	//   77  191:istore          6
			k1 = i1;
	//   78  193:iload           5
	//   79  195:istore          7
		}
		  goto _L7
	//*  80  197:goto            81
_L5:
		j1 = view.getWidth();
	//   81  200:aload           13
	//   82  202:invokevirtual   #1115 <Method int View.getWidth()>
	//   83  205:istore          6
		int l1 = j1 + k;
	//   84  207:iload           6
	//   85  209:iload           4
	//   86  211:iadd            
	//   87  212:istore          7
		j1 = k;
	//   88  214:iload           4
	//   89  216:istore          6
		k = i1;
	//   90  218:iload           5
	//   91  220:istore          4
		i1 = l1;
	//   92  222:iload           7
	//   93  224:istore          5
		  goto _L8
	//*  94  226:goto            156
_L4:
		j1 = Math.max((i3 - view.getMeasuredWidth()) / 2, k);
	//   95  229:iload           10
	//   96  231:aload           13
	//   97  233:invokevirtual   #1072 <Method int View.getMeasuredWidth()>
	//   98  236:isub            
	//   99  237:iconst_2        
	//  100  238:idiv            
	//  101  239:iload           4
	//  102  241:invokestatic    #335 <Method int Math.max(int, int)>
	//  103  244:istore          6
		int i2 = k;
	//  104  246:iload           4
	//  105  248:istore          7
		k = i1;
	//  106  250:iload           5
	//  107  252:istore          4
		i1 = i2;
	//  108  254:iload           7
	//  109  256:istore          5
		  goto _L8
	//* 110  258:goto            156
		j1 = i3 - i1 - view.getMeasuredWidth();
	//  111  261:iload           10
	//  112  263:iload           5
	//  113  265:isub            
	//  114  266:aload           13
	//  115  268:invokevirtual   #1072 <Method int View.getMeasuredWidth()>
	//  116  271:isub            
	//  117  272:istore          6
		int l3 = view.getMeasuredWidth();
	//  118  274:aload           13
	//  119  276:invokevirtual   #1072 <Method int View.getMeasuredWidth()>
	//  120  279:istore          12
		int j2 = k;
	//  121  281:iload           4
	//  122  283:istore          7
		k = i1 + l3;
	//  123  285:iload           5
	//  124  287:iload           12
	//  125  289:iadd            
	//  126  290:istore          4
		i1 = j2;
	//  127  292:iload           7
	//  128  294:istore          5
		  goto _L8
	//* 129  296:goto            156
		dispatchOnPageScrolled(i, f, j);
	//  130  299:aload_0         
	//  131  300:iload_1         
	//  132  301:fload_2         
	//  133  302:iload_3         
	//  134  303:invokespecial   #1117 <Method void dispatchOnPageScrolled(int, float, int)>
		if(mPageTransformer != null)
	//* 135  306:aload_0         
	//* 136  307:getfield        #1119 <Field ViewPager$PageTransformer mPageTransformer>
	//* 137  310:ifnull          390
		{
			j = getScrollX();
	//  138  313:aload_0         
	//  139  314:invokevirtual   #283 <Method int getScrollX()>
	//  140  317:istore_3        
			int l = getChildCount();
	//  141  318:aload_0         
	//  142  319:invokevirtual   #367 <Method int getChildCount()>
	//  143  322:istore          4
			i = 0;
	//  144  324:iconst_0        
	//  145  325:istore_1        
			while(i < l) 
	//* 146  326:iload_1         
	//* 147  327:iload           4
	//* 148  329:icmpge          390
			{
				View view1 = getChildAt(i);
	//  149  332:aload_0         
	//  150  333:iload_1         
	//  151  334:invokevirtual   #373 <Method View getChildAt(int)>
	//  152  337:astore          13
				if(!((LayoutParams)view1.getLayoutParams()).isDecor)
	//* 153  339:aload           13
	//* 154  341:invokevirtual   #533 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 155  344:checkcast       #20  <Class ViewPager$LayoutParams>
	//* 156  347:getfield        #536 <Field boolean ViewPager$LayoutParams.isDecor>
	//* 157  350:ifeq            360
	//* 158  353:iload_1         
	//* 159  354:iconst_1        
	//* 160  355:iadd            
	//* 161  356:istore_1        
	//* 162  357:goto            326
				{
					f = (float)(view1.getLeft() - j) / (float)getClientWidth();
	//  163  360:aload           13
	//  164  362:invokevirtual   #400 <Method int View.getLeft()>
	//  165  365:iload_3         
	//  166  366:isub            
	//  167  367:i2f             
	//  168  368:aload_0         
	//  169  369:invokespecial   #242 <Method int getClientWidth()>
	//  170  372:i2f             
	//  171  373:fdiv            
	//  172  374:fstore_2        
					mPageTransformer.transformPage(view1, f);
	//  173  375:aload_0         
	//  174  376:getfield        #1119 <Field ViewPager$PageTransformer mPageTransformer>
	//  175  379:aload           13
	//  176  381:fload_2         
	//  177  382:invokeinterface #1123 <Method void ViewPager$PageTransformer.transformPage(View, float)>
				}
				i++;
			}
		}
	//* 178  387:goto            353
		mCalledSuper = true;
	//  179  390:aload_0         
	//  180  391:iconst_1        
	//  181  392:putfield        #484 <Field boolean mCalledSuper>
		return;
	//  182  395:return          
		  goto _L7
	}

	protected boolean onRequestFocusInDescendants(int i, Rect rect)
	{
		byte byte0 = -1;
	//    0    0:iconst_m1       
	//    1    1:istore          5
		int k = getChildCount();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #367 <Method int getChildCount()>
	//    4    7:istore          4
		int j;
		if((i & 2) != 0)
	//*   5    9:iload_1         
	//*   6   10:iconst_2        
	//*   7   11:iand            
	//*   8   12:ifeq            78
		{
			byte0 = 1;
	//    9   15:iconst_1        
	//   10   16:istore          5
			j = 0;
	//   11   18:iconst_0        
	//   12   19:istore_3        
		} else
	//*  13   20:iload_3         
	//*  14   21:iload           4
	//*  15   23:icmpeq          97
	//*  16   26:aload_0         
	//*  17   27:iload_3         
	//*  18   28:invokevirtual   #373 <Method View getChildAt(int)>
	//*  19   31:astore          6
	//*  20   33:aload           6
	//*  21   35:invokevirtual   #590 <Method int View.getVisibility()>
	//*  22   38:ifne            89
	//*  23   41:aload_0         
	//*  24   42:aload           6
	//*  25   44:invokevirtual   #594 <Method ViewPager$ItemInfo infoForChild(View)>
	//*  26   47:astore          7
	//*  27   49:aload           7
	//*  28   51:ifnull          89
	//*  29   54:aload           7
	//*  30   56:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  31   59:aload_0         
	//*  32   60:getfield        #337 <Field int mCurItem>
	//*  33   63:icmpne          89
	//*  34   66:aload           6
	//*  35   68:iload_1         
	//*  36   69:aload_2         
	//*  37   70:invokevirtual   #1128 <Method boolean View.requestFocus(int, Rect)>
	//*  38   73:ifeq            89
	//*  39   76:iconst_1        
	//*  40   77:ireturn         
		{
			j = k - 1;
	//   41   78:iload           4
	//   42   80:iconst_1        
	//   43   81:isub            
	//   44   82:istore_3        
			k = -1;
	//   45   83:iconst_m1       
	//   46   84:istore          4
		}
		for(; j != k; j += ((int) (byte0)))
		{
			View view = getChildAt(j);
			if(view.getVisibility() != 0)
				continue;
			ItemInfo iteminfo = infoForChild(view);
			if(iteminfo != null && iteminfo.position == mCurItem && view.requestFocus(i, rect))
				return true;
		}

	//   47   86:goto            20
	//   48   89:iload_3         
	//   49   90:iload           5
	//   50   92:iadd            
	//   51   93:istore_3        
	//*  52   94:goto            20
		return false;
	//   53   97:iconst_0        
	//   54   98:ireturn         
	}

	public void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #38  <Class ViewPager$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #1132 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		}
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #38  <Class ViewPager$SavedState>
	//    9   17:astore_1        
		super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #1136 <Method Parcelable ViewPager$SavedState.getSuperState()>
	//   13   23:invokespecial   #1132 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
		if(mAdapter != null)
	//*  14   26:aload_0         
	//*  15   27:getfield        #233 <Field PagerAdapter mAdapter>
	//*  16   30:ifnull          59
		{
			mAdapter.restoreState(((SavedState) (parcelable)).adapterState, ((SavedState) (parcelable)).loader);
	//   17   33:aload_0         
	//   18   34:getfield        #233 <Field PagerAdapter mAdapter>
	//   19   37:aload_1         
	//   20   38:getfield        #1139 <Field Parcelable ViewPager$SavedState.adapterState>
	//   21   41:aload_1         
	//   22   42:getfield        #1142 <Field ClassLoader ViewPager$SavedState.loader>
	//   23   45:invokevirtual   #1146 <Method void PagerAdapter.restoreState(Parcelable, ClassLoader)>
			setCurrentItemInternal(((SavedState) (parcelable)).position, false, true);
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:getfield        #1147 <Field int ViewPager$SavedState.position>
	//   27   53:iconst_0        
	//   28   54:iconst_1        
	//   29   55:invokevirtual   #794 <Method void setCurrentItemInternal(int, boolean, boolean)>
			return;
	//   30   58:return          
		} else
		{
			mRestoredCurItem = ((SavedState) (parcelable)).position;
	//   31   59:aload_0         
	//   32   60:aload_1         
	//   33   61:getfield        #1147 <Field int ViewPager$SavedState.position>
	//   34   64:putfield        #198 <Field int mRestoredCurItem>
			mRestoredAdapterState = ((SavedState) (parcelable)).adapterState;
	//   35   67:aload_0         
	//   36   68:aload_1         
	//   37   69:getfield        #1139 <Field Parcelable ViewPager$SavedState.adapterState>
	//   38   72:putfield        #200 <Field Parcelable mRestoredAdapterState>
			mRestoredClassLoader = ((SavedState) (parcelable)).loader;
	//   39   75:aload_0         
	//   40   76:aload_1         
	//   41   77:getfield        #1142 <Field ClassLoader ViewPager$SavedState.loader>
	//   42   80:putfield        #202 <Field ClassLoader mRestoredClassLoader>
			return;
	//   43   83:return          
		}
	}

	public Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #38  <Class ViewPager$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #1150 <Method Parcelable ViewGroup.onSaveInstanceState()>
	//    4    8:invokespecial   #1152 <Method void ViewPager$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.position = mCurItem;
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #337 <Field int mCurItem>
	//    9   17:putfield        #1147 <Field int ViewPager$SavedState.position>
		if(mAdapter != null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #233 <Field PagerAdapter mAdapter>
	//*  12   24:ifnull          38
			savedstate.adapterState = mAdapter.saveState();
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #233 <Field PagerAdapter mAdapter>
	//   16   32:invokevirtual   #1155 <Method Parcelable PagerAdapter.saveState()>
	//   17   35:putfield        #1139 <Field Parcelable ViewPager$SavedState.adapterState>
		return ((Parcelable) (savedstate));
	//   18   38:aload_1         
	//   19   39:areturn         
	}

	protected void onSizeChanged(int i, int j, int k, int l)
	{
		super.onSizeChanged(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #1158 <Method void ViewGroup.onSizeChanged(int, int, int, int)>
		if(i != k)
	//*   6    9:iload_1         
	//*   7   10:iload_3         
	//*   8   11:icmpeq          28
			recomputeScrollPosition(i, k, mPageMargin, mPageMargin);
	//    9   14:aload_0         
	//   10   15:iload_1         
	//   11   16:iload_3         
	//   12   17:aload_0         
	//   13   18:getfield        #244 <Field int mPageMargin>
	//   14   21:aload_0         
	//   15   22:getfield        #244 <Field int mPageMargin>
	//   16   25:invokespecial   #1160 <Method void recomputeScrollPosition(int, int, int, int)>
	//   17   28:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		boolean flag;
		boolean flag1;
		flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          10
		if(mFakeDragging)
	//*   2    3:aload_0         
	//*   3    4:getfield        #720 <Field boolean mFakeDragging>
	//*   4    7:ifeq            12
			return true;
	//    5   10:iconst_1        
	//    6   11:ireturn         
		if(motionevent.getAction() == 0 && motionevent.getEdgeFlags() != 0)
	//*   7   12:aload_1         
	//*   8   13:invokevirtual   #1035 <Method int MotionEvent.getAction()>
	//*   9   16:ifne            28
	//*  10   19:aload_1         
	//*  11   20:invokevirtual   #1164 <Method int MotionEvent.getEdgeFlags()>
	//*  12   23:ifeq            28
			return false;
	//   13   26:iconst_0        
	//   14   27:ireturn         
		if(mAdapter == null || mAdapter.getCount() == 0)
	//*  15   28:aload_0         
	//*  16   29:getfield        #233 <Field PagerAdapter mAdapter>
	//*  17   32:ifnull          45
	//*  18   35:aload_0         
	//*  19   36:getfield        #233 <Field PagerAdapter mAdapter>
	//*  20   39:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//*  21   42:ifne            47
			return false;
	//   22   45:iconst_0        
	//   23   46:ireturn         
		if(mVelocityTracker == null)
	//*  24   47:aload_0         
	//*  25   48:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//*  26   51:ifnonnull       61
			mVelocityTracker = VelocityTracker.obtain();
	//   27   54:aload_0         
	//   28   55:invokestatic    #729 <Method VelocityTracker VelocityTracker.obtain()>
	//   29   58:putfield        #386 <Field VelocityTracker mVelocityTracker>
		mVelocityTracker.addMovement(motionevent);
	//   30   61:aload_0         
	//   31   62:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//   32   65:aload_1         
	//   33   66:invokevirtual   #741 <Method void VelocityTracker.addMovement(MotionEvent)>
		flag = flag1;
	//   34   69:iload           10
	//   35   71:istore          9
		motionevent.getAction() & 0xff;
	//   36   73:aload_1         
	//   37   74:invokevirtual   #1035 <Method int MotionEvent.getAction()>
	//   38   77:sipush          255
	//   39   80:iand            
		JVM INSTR tableswitch 0 6: default 124
	//	               0 139
	//	               1 407
	//	               2 201
	//	               3 549
	//	               4 128
	//	               5 580
	//	               6 613;
	//   40   81:tableswitch     0 6: default 124
	//	               0 139
	//	               1 407
	//	               2 201
	//	               3 549
	//	               4 128
	//	               5 580
	//	               6 613
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L6:
		break; /* Loop/switch isn't completed */
_L1:
		flag = flag1;
	//   41  124:iload           10
	//   42  126:istore          9
_L10:
		if(flag)
	//*  43  128:iload           9
	//*  44  130:ifeq            137
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   45  133:aload_0         
	//   46  134:invokestatic    #768 <Method void ViewCompat.postInvalidateOnAnimation(View)>
		return true;
	//   47  137:iconst_1        
	//   48  138:ireturn         
_L2:
		mScroller.abortAnimation();
	//   49  139:aload_0         
	//   50  140:getfield        #271 <Field Scroller mScroller>
	//   51  143:invokevirtual   #280 <Method void Scroller.abortAnimation()>
		mPopulatePending = false;
	//   52  146:aload_0         
	//   53  147:iconst_0        
	//   54  148:putfield        #302 <Field boolean mPopulatePending>
		populate();
	//   55  151:aload_0         
	//   56  152:invokevirtual   #1064 <Method void populate()>
		float f = motionevent.getX();
	//   57  155:aload_1         
	//   58  156:invokevirtual   #1056 <Method float MotionEvent.getX()>
	//   59  159:fstore_2        
		mInitialMotionX = f;
	//   60  160:aload_0         
	//   61  161:fload_2         
	//   62  162:putfield        #725 <Field float mInitialMotionX>
		mLastMotionX = f;
	//   63  165:aload_0         
	//   64  166:fload_2         
	//   65  167:putfield        #479 <Field float mLastMotionX>
		f = motionevent.getY();
	//   66  170:aload_1         
	//   67  171:invokevirtual   #1058 <Method float MotionEvent.getY()>
	//   68  174:fstore_2        
		mInitialMotionY = f;
	//   69  175:aload_0         
	//   70  176:fload_2         
	//   71  177:putfield        #1045 <Field float mInitialMotionY>
		mLastMotionY = f;
	//   72  180:aload_0         
	//   73  181:fload_2         
	//   74  182:putfield        #1049 <Field float mLastMotionY>
		mActivePointerId = motionevent.getPointerId(0);
	//   75  185:aload_0         
	//   76  186:aload_1         
	//   77  187:iconst_0        
	//   78  188:invokevirtual   #474 <Method int MotionEvent.getPointerId(int)>
	//   79  191:putfield        #212 <Field int mActivePointerId>
		flag = flag1;
	//   80  194:iload           10
	//   81  196:istore          9
		continue; /* Loop/switch isn't completed */
	//   82  198:goto            128
_L4:
		if(!mIsBeingDragged)
	//*  83  201:aload_0         
	//*  84  202:getfield        #382 <Field boolean mIsBeingDragged>
	//*  85  205:ifne            359
		{
			int i = motionevent.findPointerIndex(mActivePointerId);
	//   86  208:aload_1         
	//   87  209:aload_0         
	//   88  210:getfield        #212 <Field int mActivePointerId>
	//   89  213:invokevirtual   #1040 <Method int MotionEvent.findPointerIndex(int)>
	//   90  216:istore          6
			if(i == -1)
	//*  91  218:iload           6
	//*  92  220:iconst_m1       
	//*  93  221:icmpne          233
			{
				flag = resetTouch();
	//   94  224:aload_0         
	//   95  225:invokespecial   #1037 <Method boolean resetTouch()>
	//   96  228:istore          9
				continue; /* Loop/switch isn't completed */
	//   97  230:goto            128
			}
			float f1 = motionevent.getX(i);
	//   98  233:aload_1         
	//   99  234:iload           6
	//  100  236:invokevirtual   #477 <Method float MotionEvent.getX(int)>
	//  101  239:fstore_2        
			float f4 = Math.abs(f1 - mLastMotionX);
	//  102  240:fload_2         
	//  103  241:aload_0         
	//  104  242:getfield        #479 <Field float mLastMotionX>
	//  105  245:fsub            
	//  106  246:invokestatic    #501 <Method float Math.abs(float)>
	//  107  249:fstore          4
			float f3 = motionevent.getY(i);
	//  108  251:aload_1         
	//  109  252:iload           6
	//  110  254:invokevirtual   #1043 <Method float MotionEvent.getY(int)>
	//  111  257:fstore_3        
			float f5 = Math.abs(f3 - mLastMotionY);
	//  112  258:fload_3         
	//  113  259:aload_0         
	//  114  260:getfield        #1049 <Field float mLastMotionY>
	//  115  263:fsub            
	//  116  264:invokestatic    #501 <Method float Math.abs(float)>
	//  117  267:fstore          5
			if(f4 > (float)mTouchSlop && f4 > f5)
	//* 118  269:fload           4
	//* 119  271:aload_0         
	//* 120  272:getfield        #977 <Field int mTouchSlop>
	//* 121  275:i2f             
	//* 122  276:fcmpl           
	//* 123  277:ifle            359
	//* 124  280:fload           4
	//* 125  282:fload           5
	//* 126  284:fcmpl           
	//* 127  285:ifle            359
			{
				mIsBeingDragged = true;
	//  128  288:aload_0         
	//  129  289:iconst_1        
	//  130  290:putfield        #382 <Field boolean mIsBeingDragged>
				requestParentDisallowInterceptTouchEvent(true);
	//  131  293:aload_0         
	//  132  294:iconst_1        
	//  133  295:invokespecial   #1051 <Method void requestParentDisallowInterceptTouchEvent(boolean)>
				ViewParent viewparent;
				if(f1 - mInitialMotionX > 0.0F)
	//* 134  298:fload_2         
	//* 135  299:aload_0         
	//* 136  300:getfield        #725 <Field float mInitialMotionX>
	//* 137  303:fsub            
	//* 138  304:fconst_0        
	//* 139  305:fcmpl           
	//* 140  306:ifle            393
					f1 = mInitialMotionX + (float)mTouchSlop;
	//  141  309:aload_0         
	//  142  310:getfield        #725 <Field float mInitialMotionX>
	//  143  313:aload_0         
	//  144  314:getfield        #977 <Field int mTouchSlop>
	//  145  317:i2f             
	//  146  318:fadd            
	//  147  319:fstore_2        
				else
	//* 148  320:aload_0         
	//* 149  321:fload_2         
	//* 150  322:putfield        #479 <Field float mLastMotionX>
	//* 151  325:aload_0         
	//* 152  326:fload_3         
	//* 153  327:putfield        #1049 <Field float mLastMotionY>
	//* 154  330:aload_0         
	//* 155  331:iconst_1        
	//* 156  332:invokevirtual   #723 <Method void setScrollState(int)>
	//* 157  335:aload_0         
	//* 158  336:iconst_1        
	//* 159  337:invokespecial   #269 <Method void setScrollingCacheEnabled(boolean)>
	//* 160  340:aload_0         
	//* 161  341:invokevirtual   #541 <Method ViewParent getParent()>
	//* 162  344:astore          11
	//* 163  346:aload           11
	//* 164  348:ifnull          359
	//* 165  351:aload           11
	//* 166  353:iconst_1        
	//* 167  354:invokeinterface #546 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
	//* 168  359:iload           10
	//* 169  361:istore          9
	//* 170  363:aload_0         
	//* 171  364:getfield        #382 <Field boolean mIsBeingDragged>
	//* 172  367:ifeq            128
	//* 173  370:iconst_0        
	//* 174  371:aload_0         
	//* 175  372:aload_1         
	//* 176  373:aload_1         
	//* 177  374:aload_0         
	//* 178  375:getfield        #212 <Field int mActivePointerId>
	//* 179  378:invokevirtual   #1040 <Method int MotionEvent.findPointerIndex(int)>
	//* 180  381:invokevirtual   #477 <Method float MotionEvent.getX(int)>
	//* 181  384:invokespecial   #1053 <Method boolean performDrag(float)>
	//* 182  387:ior             
	//* 183  388:istore          9
	//* 184  390:goto            128
					f1 = mInitialMotionX - (float)mTouchSlop;
	//  185  393:aload_0         
	//  186  394:getfield        #725 <Field float mInitialMotionX>
	//  187  397:aload_0         
	//  188  398:getfield        #977 <Field int mTouchSlop>
	//  189  401:i2f             
	//  190  402:fsub            
	//  191  403:fstore_2        
				mLastMotionX = f1;
				mLastMotionY = f3;
				setScrollState(1);
				setScrollingCacheEnabled(true);
				viewparent = getParent();
				if(viewparent != null)
					viewparent.requestDisallowInterceptTouchEvent(true);
			}
		}
		flag = flag1;
		if(mIsBeingDragged)
			flag = false | performDrag(motionevent.getX(motionevent.findPointerIndex(mActivePointerId)));
		continue; /* Loop/switch isn't completed */
	//  192  404:goto            320
_L3:
		flag = flag1;
	//  193  407:iload           10
	//  194  409:istore          9
		if(mIsBeingDragged)
	//* 195  411:aload_0         
	//* 196  412:getfield        #382 <Field boolean mIsBeingDragged>
	//* 197  415:ifeq            128
		{
			Object obj = ((Object) (mVelocityTracker));
	//  198  418:aload_0         
	//  199  419:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//  200  422:astore          11
			((VelocityTracker) (obj)).computeCurrentVelocity(1000, mMaximumVelocity);
	//  201  424:aload           11
	//  202  426:sipush          1000
	//  203  429:aload_0         
	//  204  430:getfield        #886 <Field int mMaximumVelocity>
	//  205  433:i2f             
	//  206  434:invokevirtual   #890 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
			int j = (int)((VelocityTracker) (obj)).getXVelocity(mActivePointerId);
	//  207  437:aload           11
	//  208  439:aload_0         
	//  209  440:getfield        #212 <Field int mActivePointerId>
	//  210  443:invokevirtual   #893 <Method float VelocityTracker.getXVelocity(int)>
	//  211  446:f2i             
	//  212  447:istore          6
			mPopulatePending = true;
	//  213  449:aload_0         
	//  214  450:iconst_1        
	//  215  451:putfield        #302 <Field boolean mPopulatePending>
			int l = getClientWidth();
	//  216  454:aload_0         
	//  217  455:invokespecial   #242 <Method int getClientWidth()>
	//  218  458:istore          7
			int i1 = getScrollX();
	//  219  460:aload_0         
	//  220  461:invokevirtual   #283 <Method int getScrollX()>
	//  221  464:istore          8
			obj = ((Object) (infoForCurrentScrollPosition()));
	//  222  466:aload_0         
	//  223  467:invokespecial   #494 <Method ViewPager$ItemInfo infoForCurrentScrollPosition()>
	//  224  470:astore          11
			float f2 = (float)mPageMargin / (float)l;
	//  225  472:aload_0         
	//  226  473:getfield        #244 <Field int mPageMargin>
	//  227  476:i2f             
	//  228  477:iload           7
	//  229  479:i2f             
	//  230  480:fdiv            
	//  231  481:fstore_2        
			setCurrentItemInternal(determineTargetPage(((ItemInfo) (obj)).position, ((float)i1 / (float)l - ((ItemInfo) (obj)).offset) / (((ItemInfo) (obj)).widthFactor + f2), j, (int)(motionevent.getX(motionevent.findPointerIndex(mActivePointerId)) - mInitialMotionX)), true, true, j);
	//  232  482:aload_0         
	//  233  483:aload_0         
	//  234  484:aload           11
	//  235  486:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//  236  489:iload           8
	//  237  491:i2f             
	//  238  492:iload           7
	//  239  494:i2f             
	//  240  495:fdiv            
	//  241  496:aload           11
	//  242  498:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//  243  501:fsub            
	//  244  502:aload           11
	//  245  504:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  246  507:fload_2         
	//  247  508:fadd            
	//  248  509:fdiv            
	//  249  510:iload           6
	//  250  512:aload_1         
	//  251  513:aload_1         
	//  252  514:aload_0         
	//  253  515:getfield        #212 <Field int mActivePointerId>
	//  254  518:invokevirtual   #1040 <Method int MotionEvent.findPointerIndex(int)>
	//  255  521:invokevirtual   #477 <Method float MotionEvent.getX(int)>
	//  256  524:aload_0         
	//  257  525:getfield        #725 <Field float mInitialMotionX>
	//  258  528:fsub            
	//  259  529:f2i             
	//  260  530:invokespecial   #895 <Method int determineTargetPage(int, float, int, int)>
	//  261  533:iconst_1        
	//  262  534:iconst_1        
	//  263  535:iload           6
	//  264  537:invokevirtual   #898 <Method void setCurrentItemInternal(int, boolean, boolean, int)>
			flag = resetTouch();
	//  265  540:aload_0         
	//  266  541:invokespecial   #1037 <Method boolean resetTouch()>
	//  267  544:istore          9
		}
		continue; /* Loop/switch isn't completed */
	//  268  546:goto            128
_L5:
		flag = flag1;
	//  269  549:iload           10
	//  270  551:istore          9
		if(mIsBeingDragged)
	//* 271  553:aload_0         
	//* 272  554:getfield        #382 <Field boolean mIsBeingDragged>
	//* 273  557:ifeq            128
		{
			scrollToItem(mCurItem, true, 0, false);
	//  274  560:aload_0         
	//  275  561:aload_0         
	//  276  562:getfield        #337 <Field int mCurItem>
	//  277  565:iconst_1        
	//  278  566:iconst_0        
	//  279  567:iconst_0        
	//  280  568:invokespecial   #1091 <Method void scrollToItem(int, boolean, int, boolean)>
			flag = resetTouch();
	//  281  571:aload_0         
	//  282  572:invokespecial   #1037 <Method boolean resetTouch()>
	//  283  575:istore          9
		}
		continue; /* Loop/switch isn't completed */
	//  284  577:goto            128
_L7:
		int k = motionevent.getActionIndex();
	//  285  580:aload_1         
	//  286  581:invokevirtual   #471 <Method int MotionEvent.getActionIndex()>
	//  287  584:istore          6
		mLastMotionX = motionevent.getX(k);
	//  288  586:aload_0         
	//  289  587:aload_1         
	//  290  588:iload           6
	//  291  590:invokevirtual   #477 <Method float MotionEvent.getX(int)>
	//  292  593:putfield        #479 <Field float mLastMotionX>
		mActivePointerId = motionevent.getPointerId(k);
	//  293  596:aload_0         
	//  294  597:aload_1         
	//  295  598:iload           6
	//  296  600:invokevirtual   #474 <Method int MotionEvent.getPointerId(int)>
	//  297  603:putfield        #212 <Field int mActivePointerId>
		flag = flag1;
	//  298  606:iload           10
	//  299  608:istore          9
		continue; /* Loop/switch isn't completed */
	//  300  610:goto            128
_L8:
		onSecondaryPointerUp(motionevent);
	//  301  613:aload_0         
	//  302  614:aload_1         
	//  303  615:invokespecial   #1066 <Method void onSecondaryPointerUp(MotionEvent)>
		mLastMotionX = motionevent.getX(motionevent.findPointerIndex(mActivePointerId));
	//  304  618:aload_0         
	//  305  619:aload_1         
	//  306  620:aload_1         
	//  307  621:aload_0         
	//  308  622:getfield        #212 <Field int mActivePointerId>
	//  309  625:invokevirtual   #1040 <Method int MotionEvent.findPointerIndex(int)>
	//  310  628:invokevirtual   #477 <Method float MotionEvent.getX(int)>
	//  311  631:putfield        #479 <Field float mLastMotionX>
		flag = flag1;
	//  312  634:iload           10
	//  313  636:istore          9
		if(true) goto _L10; else goto _L9
	//  314  638:goto            128
_L9:
	}

	boolean pageLeft()
	{
		if(mCurItem > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #337 <Field int mCurItem>
	//*   2    4:ifle            20
		{
			setCurrentItem(mCurItem - 1, true);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #337 <Field int mCurItem>
	//    6   12:iconst_1        
	//    7   13:isub            
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #1168 <Method void setCurrentItem(int, boolean)>
			return true;
	//   10   18:iconst_1        
	//   11   19:ireturn         
		} else
		{
			return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         
		}
	}

	boolean pageRight()
	{
		if(mAdapter != null && mCurItem < mAdapter.getCount() - 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #233 <Field PagerAdapter mAdapter>
	//*   2    4:ifnull          36
	//*   3    7:aload_0         
	//*   4    8:getfield        #337 <Field int mCurItem>
	//*   5   11:aload_0         
	//*   6   12:getfield        #233 <Field PagerAdapter mAdapter>
	//*   7   15:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//*   8   18:iconst_1        
	//*   9   19:isub            
	//*  10   20:icmpge          36
		{
			setCurrentItem(mCurItem + 1, true);
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #337 <Field int mCurItem>
	//   14   28:iconst_1        
	//   15   29:iadd            
	//   16   30:iconst_1        
	//   17   31:invokevirtual   #1168 <Method void setCurrentItem(int, boolean)>
			return true;
	//   18   34:iconst_1        
	//   19   35:ireturn         
		} else
		{
			return false;
	//   20   36:iconst_0        
	//   21   37:ireturn         
		}
	}

	void populate()
	{
		populate(mCurItem);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #337 <Field int mCurItem>
	//    3    5:invokevirtual   #1170 <Method void populate(int)>
	//    4    8:return          
	}

	void populate(int i)
	{
		float f;
		float f1;
		float f2;
		int j;
		int k;
		int l;
		int i1;
		int j1;
		int k1;
		int l1;
		int i2;
		Object obj;
		Object obj1;
		Object obj2;
		Object obj3;
		if(mCurItem != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #337 <Field int mCurItem>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          1255
		{
			obj1 = ((Object) (infoForPosition(mCurItem)));
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #337 <Field int mCurItem>
	//    7   13:invokevirtual   #523 <Method ViewPager$ItemInfo infoForPosition(int)>
	//    8   16:astore          14
			mCurItem = i;
	//    9   18:aload_0         
	//   10   19:iload_1         
	//   11   20:putfield        #337 <Field int mCurItem>
		} else
	//*  12   23:aload_0         
	//*  13   24:getfield        #233 <Field PagerAdapter mAdapter>
	//*  14   27:ifnonnull       35
	//*  15   30:aload_0         
	//*  16   31:invokespecial   #1174 <Method void sortChildDrawingOrder()>
	//*  17   34:return          
	//*  18   35:aload_0         
	//*  19   36:getfield        #302 <Field boolean mPopulatePending>
	//*  20   39:ifeq            47
	//*  21   42:aload_0         
	//*  22   43:invokespecial   #1174 <Method void sortChildDrawingOrder()>
	//*  23   46:return          
	//*  24   47:aload_0         
	//*  25   48:invokevirtual   #1178 <Method android.os.IBinder getWindowToken()>
	//*  26   51:ifnull          34
	//*  27   54:aload_0         
	//*  28   55:getfield        #233 <Field PagerAdapter mAdapter>
	//*  29   58:aload_0         
	//*  30   59:invokevirtual   #782 <Method void PagerAdapter.startUpdate(ViewGroup)>
	//*  31   62:aload_0         
	//*  32   63:getfield        #210 <Field int mOffscreenPageLimit>
	//*  33   66:istore_1        
	//*  34   67:iconst_0        
	//*  35   68:aload_0         
	//*  36   69:getfield        #337 <Field int mCurItem>
	//*  37   72:iload_1         
	//*  38   73:isub            
	//*  39   74:invokestatic    #335 <Method int Math.max(int, int)>
	//*  40   77:istore          11
	//*  41   79:aload_0         
	//*  42   80:getfield        #233 <Field PagerAdapter mAdapter>
	//*  43   83:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//*  44   86:istore          9
	//*  45   88:iload           9
	//*  46   90:iconst_1        
	//*  47   91:isub            
	//*  48   92:iload_1         
	//*  49   93:aload_0         
	//*  50   94:getfield        #337 <Field int mCurItem>
	//*  51   97:iadd            
	//*  52   98:invokestatic    #332 <Method int Math.min(int, int)>
	//*  53  101:istore          10
	//*  54  103:iload           9
	//*  55  105:aload_0         
	//*  56  106:getfield        #771 <Field int mExpectedAdapterCount>
	//*  57  109:icmpeq          221
	//*  58  112:aload_0         
	//*  59  113:invokevirtual   #1179 <Method Resources getResources()>
	//*  60  116:aload_0         
	//*  61  117:invokevirtual   #1182 <Method int getId()>
	//*  62  120:invokevirtual   #1186 <Method String Resources.getResourceName(int)>
	//*  63  123:astore          13
	//*  64  125:new             #487 <Class IllegalStateException>
	//*  65  128:dup             
	//*  66  129:new             #688 <Class StringBuilder>
	//*  67  132:dup             
	//*  68  133:invokespecial   #689 <Method void StringBuilder()>
	//*  69  136:ldc2            #1188 <String "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ">
	//*  70  139:invokevirtual   #697 <Method StringBuilder StringBuilder.append(String)>
	//*  71  142:aload_0         
	//*  72  143:getfield        #771 <Field int mExpectedAdapterCount>
	//*  73  146:invokevirtual   #1191 <Method StringBuilder StringBuilder.append(int)>
	//*  74  149:ldc2            #1193 <String ", found: ">
	//*  75  152:invokevirtual   #697 <Method StringBuilder StringBuilder.append(String)>
	//*  76  155:iload           9
	//*  77  157:invokevirtual   #1191 <Method StringBuilder StringBuilder.append(int)>
	//*  78  160:ldc2            #1195 <String " Pager id: ">
	//*  79  163:invokevirtual   #697 <Method StringBuilder StringBuilder.append(String)>
	//*  80  166:aload           13
	//*  81  168:invokevirtual   #697 <Method StringBuilder StringBuilder.append(String)>
	//*  82  171:ldc2            #1197 <String " Pager class: ">
	//*  83  174:invokevirtual   #697 <Method StringBuilder StringBuilder.append(String)>
	//*  84  177:aload_0         
	//*  85  178:invokevirtual   #450 <Method Class Object.getClass()>
	//*  86  181:invokevirtual   #1200 <Method StringBuilder StringBuilder.append(Object)>
	//*  87  184:ldc2            #1202 <String " Problematic adapter: ">
	//*  88  187:invokevirtual   #697 <Method StringBuilder StringBuilder.append(String)>
	//*  89  190:aload_0         
	//*  90  191:getfield        #233 <Field PagerAdapter mAdapter>
	//*  91  194:invokevirtual   #450 <Method Class Object.getClass()>
	//*  92  197:invokevirtual   #1200 <Method StringBuilder StringBuilder.append(Object)>
	//*  93  200:invokevirtual   #705 <Method String StringBuilder.toString()>
	//*  94  203:invokespecial   #492 <Method void IllegalStateException(String)>
	//*  95  206:athrow          
	//*  96  207:astore          13
	//*  97  209:aload_0         
	//*  98  210:invokevirtual   #1182 <Method int getId()>
	//*  99  213:invokestatic    #1207 <Method String Integer.toHexString(int)>
	//* 100  216:astore          13
	//* 101  218:goto            125
	//* 102  221:iconst_0        
	//* 103  222:istore_1        
	//* 104  223:iload_1         
	//* 105  224:aload_0         
	//* 106  225:getfield        #188 <Field ArrayList mItems>
	//* 107  228:invokevirtual   #256 <Method int ArrayList.size()>
	//* 108  231:icmpge          1249
	//* 109  234:aload_0         
	//* 110  235:getfield        #188 <Field ArrayList mItems>
	//* 111  238:iload_1         
	//* 112  239:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//* 113  242:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 114  245:astore          13
	//* 115  247:aload           13
	//* 116  249:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 117  252:aload_0         
	//* 118  253:getfield        #337 <Field int mCurItem>
	//* 119  256:icmplt          610
	//* 120  259:aload           13
	//* 121  261:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 122  264:aload_0         
	//* 123  265:getfield        #337 <Field int mCurItem>
	//* 124  268:icmpne          1249
	//* 125  271:aload           13
	//* 126  273:ifnonnull       1242
	//* 127  276:iload           9
	//* 128  278:ifle            1242
	//* 129  281:aload_0         
	//* 130  282:aload_0         
	//* 131  283:getfield        #337 <Field int mCurItem>
	//* 132  286:iload_1         
	//* 133  287:invokevirtual   #1209 <Method ViewPager$ItemInfo addNewItem(int, int)>
	//* 134  290:astore          15
	//* 135  292:aload           15
	//* 136  294:ifnull          475
	//* 137  297:iload_1         
	//* 138  298:iconst_1        
	//* 139  299:isub            
	//* 140  300:istore          8
	//* 141  302:iload           8
	//* 142  304:iflt            617
	//* 143  307:aload_0         
	//* 144  308:getfield        #188 <Field ArrayList mItems>
	//* 145  311:iload           8
	//* 146  313:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//* 147  316:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 148  319:astore          13
	//* 149  321:aload_0         
	//* 150  322:invokespecial   #242 <Method int getClientWidth()>
	//* 151  325:istore          12
	//* 152  327:iload           12
	//* 153  329:ifgt            623
	//* 154  332:fconst_0        
	//* 155  333:fstore_3        
	//* 156  334:aload_0         
	//* 157  335:getfield        #337 <Field int mCurItem>
	//* 158  338:istore          5
	//* 159  340:fconst_0        
	//* 160  341:fstore          4
	//* 161  343:iload           5
	//* 162  345:iconst_1        
	//* 163  346:isub            
	//* 164  347:istore          7
	//* 165  349:iload_1         
	//* 166  350:istore          6
	//* 167  352:aload           13
	//* 168  354:astore          16
	//* 169  356:iload           7
	//* 170  358:iflt            380
	//* 171  361:fload           4
	//* 172  363:fload_3         
	//* 173  364:fcmpl           
	//* 174  365:iflt            778
	//* 175  368:iload           7
	//* 176  370:iload           11
	//* 177  372:icmpge          778
	//* 178  375:aload           16
	//* 179  377:ifnonnull       644
	//* 180  380:aload           15
	//* 181  382:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//* 182  385:fstore_2        
	//* 183  386:iload           6
	//* 184  388:iconst_1        
	//* 185  389:iadd            
	//* 186  390:istore_1        
	//* 187  391:fload_2         
	//* 188  392:fconst_2        
	//* 189  393:fcmpg           
	//* 190  394:ifge            465
	//* 191  397:iload_1         
	//* 192  398:aload_0         
	//* 193  399:getfield        #188 <Field ArrayList mItems>
	//* 194  402:invokevirtual   #256 <Method int ArrayList.size()>
	//* 195  405:icmpge          898
	//* 196  408:aload_0         
	//* 197  409:getfield        #188 <Field ArrayList mItems>
	//* 198  412:iload_1         
	//* 199  413:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//* 200  416:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 201  419:astore          13
	//* 202  421:iload           12
	//* 203  423:ifgt            904
	//* 204  426:fconst_0        
	//* 205  427:fstore_3        
	//* 206  428:aload_0         
	//* 207  429:getfield        #337 <Field int mCurItem>
	//* 208  432:istore          5
	//* 209  434:iload           5
	//* 210  436:iconst_1        
	//* 211  437:iadd            
	//* 212  438:istore          5
	//* 213  440:iload           5
	//* 214  442:iload           9
	//* 215  444:icmpge          465
	//* 216  447:fload_2         
	//* 217  448:fload_3         
	//* 218  449:fcmpl           
	//* 219  450:iflt            1000
	//* 220  453:iload           5
	//* 221  455:iload           10
	//* 222  457:icmple          1000
	//* 223  460:aload           13
	//* 224  462:ifnonnull       919
	//* 225  465:aload_0         
	//* 226  466:aload           15
	//* 227  468:iload           6
	//* 228  470:aload           14
	//* 229  472:invokespecial   #1211 <Method void calculatePageOffsets(ViewPager$ItemInfo, int, ViewPager$ItemInfo)>
	//* 230  475:aload_0         
	//* 231  476:getfield        #233 <Field PagerAdapter mAdapter>
	//* 232  479:astore          14
	//* 233  481:aload_0         
	//* 234  482:getfield        #337 <Field int mCurItem>
	//* 235  485:istore_1        
	//* 236  486:aload           15
	//* 237  488:ifnull          1122
	//* 238  491:aload           15
	//* 239  493:getfield        #618 <Field Object ViewPager$ItemInfo.object>
	//* 240  496:astore          13
	//* 241  498:aload           14
	//* 242  500:aload_0         
	//* 243  501:iload_1         
	//* 244  502:aload           13
	//* 245  504:invokevirtual   #1214 <Method void PagerAdapter.setPrimaryItem(ViewGroup, int, Object)>
	//* 246  507:aload_0         
	//* 247  508:getfield        #233 <Field PagerAdapter mAdapter>
	//* 248  511:aload_0         
	//* 249  512:invokevirtual   #789 <Method void PagerAdapter.finishUpdate(ViewGroup)>
	//* 250  515:aload_0         
	//* 251  516:invokevirtual   #367 <Method int getChildCount()>
	//* 252  519:istore          5
	//* 253  521:iconst_0        
	//* 254  522:istore_1        
	//* 255  523:iload_1         
	//* 256  524:iload           5
	//* 257  526:icmpge          1128
	//* 258  529:aload_0         
	//* 259  530:iload_1         
	//* 260  531:invokevirtual   #373 <Method View getChildAt(int)>
	//* 261  534:astore          14
	//* 262  536:aload           14
	//* 263  538:invokevirtual   #533 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 264  541:checkcast       #20  <Class ViewPager$LayoutParams>
	//* 265  544:astore          13
	//* 266  546:aload           13
	//* 267  548:iload_1         
	//* 268  549:putfield        #931 <Field int ViewPager$LayoutParams.childIndex>
	//* 269  552:aload           13
	//* 270  554:getfield        #536 <Field boolean ViewPager$LayoutParams.isDecor>
	//* 271  557:ifne            603
	//* 272  560:aload           13
	//* 273  562:getfield        #790 <Field float ViewPager$LayoutParams.widthFactor>
	//* 274  565:fconst_0        
	//* 275  566:fcmpl           
	//* 276  567:ifne            603
	//* 277  570:aload_0         
	//* 278  571:aload           14
	//* 279  573:invokevirtual   #594 <Method ViewPager$ItemInfo infoForChild(View)>
	//* 280  576:astore          14
	//* 281  578:aload           14
	//* 282  580:ifnull          603
	//* 283  583:aload           13
	//* 284  585:aload           14
	//* 285  587:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//* 286  590:putfield        #790 <Field float ViewPager$LayoutParams.widthFactor>
	//* 287  593:aload           13
	//* 288  595:aload           14
	//* 289  597:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 290  600:putfield        #1215 <Field int ViewPager$LayoutParams.position>
	//* 291  603:iload_1         
	//* 292  604:iconst_1        
	//* 293  605:iadd            
	//* 294  606:istore_1        
	//* 295  607:goto            523
	//* 296  610:iload_1         
	//* 297  611:iconst_1        
	//* 298  612:iadd            
	//* 299  613:istore_1        
	//* 300  614:goto            223
	//* 301  617:aconst_null     
	//* 302  618:astore          13
	//* 303  620:goto            321
	//* 304  623:fconst_2        
	//* 305  624:aload           15
	//* 306  626:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//* 307  629:fsub            
	//* 308  630:aload_0         
	//* 309  631:invokevirtual   #436 <Method int getPaddingLeft()>
	//* 310  634:i2f             
	//* 311  635:iload           12
	//* 312  637:i2f             
	//* 313  638:fdiv            
	//* 314  639:fadd            
	//* 315  640:fstore_3        
	//* 316  641:goto            334
	//* 317  644:aload           16
	//* 318  646:astore          13
	//* 319  648:iload           8
	//* 320  650:istore_1        
	//* 321  651:fload           4
	//* 322  653:fstore_2        
	//* 323  654:iload           6
	//* 324  656:istore          5
	//* 325  658:iload           7
	//* 326  660:aload           16
	//* 327  662:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 328  665:icmpne          746
	//* 329  668:aload           16
	//* 330  670:astore          13
	//* 331  672:iload           8
	//* 332  674:istore_1        
	//* 333  675:fload           4
	//* 334  677:fstore_2        
	//* 335  678:iload           6
	//* 336  680:istore          5
	//* 337  682:aload           16
	//* 338  684:getfield        #305 <Field boolean ViewPager$ItemInfo.scrolling>
	//* 339  687:ifne            746
	//* 340  690:aload_0         
	//* 341  691:getfield        #188 <Field ArrayList mItems>
	//* 342  694:iload           8
	//* 343  696:invokevirtual   #778 <Method Object ArrayList.remove(int)>
	//* 344  699:pop             
	//* 345  700:aload_0         
	//* 346  701:getfield        #233 <Field PagerAdapter mAdapter>
	//* 347  704:aload_0         
	//* 348  705:iload           7
	//* 349  707:aload           16
	//* 350  709:getfield        #618 <Field Object ViewPager$ItemInfo.object>
	//* 351  712:invokevirtual   #786 <Method void PagerAdapter.destroyItem(ViewGroup, int, Object)>
	//* 352  715:iload           8
	//* 353  717:iconst_1        
	//* 354  718:isub            
	//* 355  719:istore_1        
	//* 356  720:iload           6
	//* 357  722:iconst_1        
	//* 358  723:isub            
	//* 359  724:istore          5
	//* 360  726:iload_1         
	//* 361  727:iflt            769
	//* 362  730:aload_0         
	//* 363  731:getfield        #188 <Field ArrayList mItems>
	//* 364  734:iload_1         
	//* 365  735:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//* 366  738:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 367  741:astore          13
	//* 368  743:fload           4
	//* 369  745:fstore_2        
	//* 370  746:iload           7
	//* 371  748:iconst_1        
	//* 372  749:isub            
	//* 373  750:istore          7
	//* 374  752:aload           13
	//* 375  754:astore          16
	//* 376  756:iload_1         
	//* 377  757:istore          8
	//* 378  759:fload_2         
	//* 379  760:fstore          4
	//* 380  762:iload           5
	//* 381  764:istore          6
	//* 382  766:goto            356
	//* 383  769:aconst_null     
	//* 384  770:astore          13
	//* 385  772:fload           4
	//* 386  774:fstore_2        
	//* 387  775:goto            746
	//* 388  778:aload           16
	//* 389  780:ifnull          841
	//* 390  783:iload           7
	//* 391  785:aload           16
	//* 392  787:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 393  790:icmpne          841
	//* 394  793:fload           4
	//* 395  795:aload           16
	//* 396  797:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//* 397  800:fadd            
	//* 398  801:fstore_2        
	//* 399  802:iload           8
	//* 400  804:iconst_1        
	//* 401  805:isub            
	//* 402  806:istore_1        
	//* 403  807:iload_1         
	//* 404  808:iflt            831
	//* 405  811:aload_0         
	//* 406  812:getfield        #188 <Field ArrayList mItems>
	//* 407  815:iload_1         
	//* 408  816:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//* 409  819:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 410  822:astore          13
	//* 411  824:iload           6
	//* 412  826:istore          5
	//* 413  828:goto            746
	//* 414  831:aconst_null     
	//* 415  832:astore          13
	//* 416  834:iload           6
	//* 417  836:istore          5
	//* 418  838:goto            746
	//* 419  841:fload           4
	//* 420  843:aload_0         
	//* 421  844:iload           7
	//* 422  846:iload           8
	//* 423  848:iconst_1        
	//* 424  849:iadd            
	//* 425  850:invokevirtual   #1209 <Method ViewPager$ItemInfo addNewItem(int, int)>
	//* 426  853:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//* 427  856:fadd            
	//* 428  857:fstore_2        
	//* 429  858:iload           6
	//* 430  860:iconst_1        
	//* 431  861:iadd            
	//* 432  862:istore          5
	//* 433  864:iload           8
	//* 434  866:iflt            889
	//* 435  869:aload_0         
	//* 436  870:getfield        #188 <Field ArrayList mItems>
	//* 437  873:iload           8
	//* 438  875:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//* 439  878:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 440  881:astore          13
	//* 441  883:iload           8
	//* 442  885:istore_1        
	//* 443  886:goto            746
	//* 444  889:aconst_null     
	//* 445  890:astore          13
	//* 446  892:iload           8
	//* 447  894:istore_1        
	//* 448  895:goto            746
	//* 449  898:aconst_null     
	//* 450  899:astore          13
	//* 451  901:goto            421
	//* 452  904:aload_0         
	//* 453  905:invokevirtual   #439 <Method int getPaddingRight()>
	//* 454  908:i2f             
	//* 455  909:iload           12
	//* 456  911:i2f             
	//* 457  912:fdiv            
	//* 458  913:fconst_2        
	//* 459  914:fadd            
	//* 460  915:fstore_3        
	//* 461  916:goto            428
	//* 462  919:iload           5
	//* 463  921:aload           13
	//* 464  923:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 465  926:icmpne          1239
	//* 466  929:aload           13
	//* 467  931:getfield        #305 <Field boolean ViewPager$ItemInfo.scrolling>
	//* 468  934:ifne            1239
	//* 469  937:aload_0         
	//* 470  938:getfield        #188 <Field ArrayList mItems>
	//* 471  941:iload_1         
	//* 472  942:invokevirtual   #778 <Method Object ArrayList.remove(int)>
	//* 473  945:pop             
	//* 474  946:aload_0         
	//* 475  947:getfield        #233 <Field PagerAdapter mAdapter>
	//* 476  950:aload_0         
	//* 477  951:iload           5
	//* 478  953:aload           13
	//* 479  955:getfield        #618 <Field Object ViewPager$ItemInfo.object>
	//* 480  958:invokevirtual   #786 <Method void PagerAdapter.destroyItem(ViewGroup, int, Object)>
	//* 481  961:iload_1         
	//* 482  962:aload_0         
	//* 483  963:getfield        #188 <Field ArrayList mItems>
	//* 484  966:invokevirtual   #256 <Method int ArrayList.size()>
	//* 485  969:icmpge          994
	//* 486  972:aload_0         
	//* 487  973:getfield        #188 <Field ArrayList mItems>
	//* 488  976:iload_1         
	//* 489  977:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//* 490  980:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 491  983:astore          13
	//* 492  985:iload           5
	//* 493  987:iconst_1        
	//* 494  988:iadd            
	//* 495  989:istore          5
	//* 496  991:goto            440
	//* 497  994:aconst_null     
	//* 498  995:astore          13
	//* 499  997:goto            985
	//* 500 1000:aload           13
	//* 501 1002:ifnull          1064
	//* 502 1005:iload           5
	//* 503 1007:aload           13
	//* 504 1009:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 505 1012:icmpne          1064
	//* 506 1015:aload           13
	//* 507 1017:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//* 508 1020:fstore          4
	//* 509 1022:iload_1         
	//* 510 1023:iconst_1        
	//* 511 1024:iadd            
	//* 512 1025:istore_1        
	//* 513 1026:iload_1         
	//* 514 1027:aload_0         
	//* 515 1028:getfield        #188 <Field ArrayList mItems>
	//* 516 1031:invokevirtual   #256 <Method int ArrayList.size()>
	//* 517 1034:icmpge          1058
	//* 518 1037:aload_0         
	//* 519 1038:getfield        #188 <Field ArrayList mItems>
	//* 520 1041:iload_1         
	//* 521 1042:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//* 522 1045:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 523 1048:astore          13
	//* 524 1050:fload_2         
	//* 525 1051:fload           4
	//* 526 1053:fadd            
	//* 527 1054:fstore_2        
	//* 528 1055:goto            985
	//* 529 1058:aconst_null     
	//* 530 1059:astore          13
	//* 531 1061:goto            1050
	//* 532 1064:aload_0         
	//* 533 1065:iload           5
	//* 534 1067:iload_1         
	//* 535 1068:invokevirtual   #1209 <Method ViewPager$ItemInfo addNewItem(int, int)>
	//* 536 1071:astore          13
	//* 537 1073:iload_1         
	//* 538 1074:iconst_1        
	//* 539 1075:iadd            
	//* 540 1076:istore_1        
	//* 541 1077:aload           13
	//* 542 1079:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//* 543 1082:fstore          4
	//* 544 1084:iload_1         
	//* 545 1085:aload_0         
	//* 546 1086:getfield        #188 <Field ArrayList mItems>
	//* 547 1089:invokevirtual   #256 <Method int ArrayList.size()>
	//* 548 1092:icmpge          1116
	//* 549 1095:aload_0         
	//* 550 1096:getfield        #188 <Field ArrayList mItems>
	//* 551 1099:iload_1         
	//* 552 1100:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//* 553 1103:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 554 1106:astore          13
	//* 555 1108:fload_2         
	//* 556 1109:fload           4
	//* 557 1111:fadd            
	//* 558 1112:fstore_2        
	//* 559 1113:goto            985
	//* 560 1116:aconst_null     
	//* 561 1117:astore          13
	//* 562 1119:goto            1108
	//* 563 1122:aconst_null     
	//* 564 1123:astore          13
	//* 565 1125:goto            498
	//* 566 1128:aload_0         
	//* 567 1129:invokespecial   #1174 <Method void sortChildDrawingOrder()>
	//* 568 1132:aload_0         
	//* 569 1133:invokevirtual   #1218 <Method boolean hasFocus()>
	//* 570 1136:ifeq            34
	//* 571 1139:aload_0         
	//* 572 1140:invokevirtual   #663 <Method View findFocus()>
	//* 573 1143:astore          13
	//* 574 1145:aload           13
	//* 575 1147:ifnull          1233
	//* 576 1150:aload_0         
	//* 577 1151:aload           13
	//* 578 1153:invokevirtual   #1220 <Method ViewPager$ItemInfo infoForAnyChild(View)>
	//* 579 1156:astore          13
	//* 580 1158:aload           13
	//* 581 1160:ifnull          1175
	//* 582 1163:aload           13
	//* 583 1165:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 584 1168:aload_0         
	//* 585 1169:getfield        #337 <Field int mCurItem>
	//* 586 1172:icmpeq          34
	//* 587 1175:iconst_0        
	//* 588 1176:istore_1        
	//* 589 1177:iload_1         
	//* 590 1178:aload_0         
	//* 591 1179:invokevirtual   #367 <Method int getChildCount()>
	//* 592 1182:icmpge          34
	//* 593 1185:aload_0         
	//* 594 1186:iload_1         
	//* 595 1187:invokevirtual   #373 <Method View getChildAt(int)>
	//* 596 1190:astore          13
	//* 597 1192:aload_0         
	//* 598 1193:aload           13
	//* 599 1195:invokevirtual   #594 <Method ViewPager$ItemInfo infoForChild(View)>
	//* 600 1198:astore          14
	//* 601 1200:aload           14
	//* 602 1202:ifnull          1226
	//* 603 1205:aload           14
	//* 604 1207:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 605 1210:aload_0         
	//* 606 1211:getfield        #337 <Field int mCurItem>
	//* 607 1214:icmpne          1226
	//* 608 1217:aload           13
	//* 609 1219:iconst_2        
	//* 610 1220:invokevirtual   #1222 <Method boolean View.requestFocus(int)>
	//* 611 1223:ifne            34
	//* 612 1226:iload_1         
	//* 613 1227:iconst_1        
	//* 614 1228:iadd            
	//* 615 1229:istore_1        
	//* 616 1230:goto            1177
	//* 617 1233:aconst_null     
	//* 618 1234:astore          13
	//* 619 1236:goto            1158
	//* 620 1239:goto            985
	//* 621 1242:aload           13
	//* 622 1244:astore          15
	//* 623 1246:goto            292
	//* 624 1249:aconst_null     
	//* 625 1250:astore          13
	//* 626 1252:goto            271
		{
			obj1 = null;
	//  627 1255:aconst_null     
	//  628 1256:astore          14
		}
		if(mAdapter != null) goto _L2; else goto _L1
_L1:
		sortChildDrawingOrder();
_L4:
		return;
_L2:
		if(mPopulatePending)
		{
			sortChildDrawingOrder();
			return;
		}
		if(getWindowToken() == null) goto _L4; else goto _L3
_L3:
		mAdapter.startUpdate(((ViewGroup) (this)));
		i = mOffscreenPageLimit;
		l1 = Math.max(0, mCurItem - i);
		j1 = mAdapter.getCount();
		k1 = Math.min(j1 - 1, i + mCurItem);
		if(j1 != mExpectedAdapterCount)
		{
			String s;
			try
			{
				s = getResources().getResourceName(getId());
			}
			catch(android.content.res.Resources.NotFoundException notfoundexception)
			{
				notfoundexception = ((android.content.res.Resources.NotFoundException) (Integer.toHexString(getId())));
			}
			throw new IllegalStateException((new StringBuilder()).append("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ").append(mExpectedAdapterCount).append(", found: ").append(j1).append(" Pager id: ").append(s).append(" Pager class: ").append(((Object) (((Object)this).getClass()))).append(" Problematic adapter: ").append(((Object) (((Object) (mAdapter)).getClass()))).toString());
		}
		i = 0;
_L20:
		if(i >= mItems.size())
			break MISSING_BLOCK_LABEL_1249;
		obj = ((Object) ((ItemInfo)mItems.get(i)));
		if(((ItemInfo) (obj)).position < mCurItem) goto _L6; else goto _L5
_L5:
		if(((ItemInfo) (obj)).position != mCurItem)
			break MISSING_BLOCK_LABEL_1249;
_L30:
		if(obj == null && j1 > 0)
			obj2 = ((Object) (addNewItem(mCurItem, i)));
		else
			obj2 = obj;
		if(obj2 == null) goto _L8; else goto _L7
_L7:
		i1 = i - 1;
		if(i1 >= 0)
			obj = ((Object) ((ItemInfo)mItems.get(i1)));
		else
			obj = null;
		i2 = getClientWidth();
		if(i2 <= 0)
			f1 = 0.0F;
		else
			f1 = (2.0F - ((ItemInfo) (obj2)).widthFactor) + (float)getPaddingLeft() / (float)i2;
		j = mCurItem;
		f2 = 0.0F;
		l = j - 1;
		k = i;
		obj3 = obj;
_L21:
		if(l < 0) goto _L10; else goto _L9
_L9:
		if(f2 < f1 || l >= l1) goto _L12; else goto _L11
_L11:
		if(obj3 != null) goto _L13; else goto _L10
_L10:
		f = ((ItemInfo) (obj2)).widthFactor;
		i = k + 1;
		if(f >= 2.0F) goto _L15; else goto _L14
_L14:
		if(i < mItems.size())
			obj = ((Object) ((ItemInfo)mItems.get(i)));
		else
			obj = null;
		if(i2 <= 0)
			f1 = 0.0F;
		else
			f1 = (float)getPaddingRight() / (float)i2 + 2.0F;
		j = mCurItem;
		j++;
_L23:
		if(j >= j1) goto _L15; else goto _L16
_L16:
		if(f < f1 || j <= k1) goto _L18; else goto _L17
_L17:
		if(obj != null) goto _L19; else goto _L15
_L15:
		calculatePageOffsets(((ItemInfo) (obj2)), k, ((ItemInfo) (obj1)));
		  goto _L8
_L6:
		i++;
		  goto _L20
_L13:
		obj = obj3;
		i = i1;
		f = f2;
		j = k;
		if(l == ((ItemInfo) (obj3)).position)
		{
			obj = obj3;
			i = i1;
			f = f2;
			j = k;
			if(!((ItemInfo) (obj3)).scrolling)
			{
				mItems.remove(i1);
				mAdapter.destroyItem(((ViewGroup) (this)), l, ((ItemInfo) (obj3)).object);
				i = i1 - 1;
				j = k - 1;
				if(i >= 0)
				{
					obj = ((Object) ((ItemInfo)mItems.get(i)));
					f = f2;
				} else
				{
					obj = null;
					f = f2;
				}
			}
		}
_L22:
		l--;
		obj3 = obj;
		i1 = i;
		f2 = f;
		k = j;
		  goto _L21
_L12:
		if(obj3 != null && l == ((ItemInfo) (obj3)).position)
		{
			f = f2 + ((ItemInfo) (obj3)).widthFactor;
			i = i1 - 1;
			if(i >= 0)
			{
				obj = ((Object) ((ItemInfo)mItems.get(i)));
				j = k;
			} else
			{
				obj = null;
				j = k;
			}
		} else
		{
			f = f2 + addNewItem(l, i1 + 1).widthFactor;
			j = k + 1;
			if(i1 >= 0)
			{
				obj = ((Object) ((ItemInfo)mItems.get(i1)));
				i = i1;
			} else
			{
				obj = null;
				i = i1;
			}
		}
		  goto _L22
_L19:
		if(j == ((ItemInfo) (obj)).position && !((ItemInfo) (obj)).scrolling)
		{
			mItems.remove(i);
			mAdapter.destroyItem(((ViewGroup) (this)), j, ((ItemInfo) (obj)).object);
			if(i < mItems.size())
				obj = ((Object) ((ItemInfo)mItems.get(i)));
			else
				obj = null;
		}
_L24:
		j++;
		  goto _L23
_L18:
		if(obj != null && j == ((ItemInfo) (obj)).position)
		{
			float f3 = ((ItemInfo) (obj)).widthFactor;
			i++;
			if(i < mItems.size())
				obj = ((Object) ((ItemInfo)mItems.get(i)));
			else
				obj = null;
			f += f3;
		} else
		{
			obj = ((Object) (addNewItem(j, i)));
			i++;
			float f4 = ((ItemInfo) (obj)).widthFactor;
			if(i < mItems.size())
				obj = ((Object) ((ItemInfo)mItems.get(i)));
			else
				obj = null;
			f += f4;
		}
		  goto _L24
_L8:
		obj1 = ((Object) (mAdapter));
		i = mCurItem;
		if(obj2 != null)
			obj = ((ItemInfo) (obj2)).object;
		else
			obj = null;
		((PagerAdapter) (obj1)).setPrimaryItem(((ViewGroup) (this)), i, obj);
		mAdapter.finishUpdate(((ViewGroup) (this)));
		j = getChildCount();
		for(i = 0; i < j; i++)
		{
			obj1 = ((Object) (getChildAt(i)));
			obj = ((Object) ((LayoutParams)((View) (obj1)).getLayoutParams()));
			obj.childIndex = i;
			if(!((LayoutParams) (obj)).isDecor && ((LayoutParams) (obj)).widthFactor == 0.0F)
			{
				obj1 = ((Object) (infoForChild(((View) (obj1)))));
				if(obj1 != null)
				{
					obj.widthFactor = ((ItemInfo) (obj1)).widthFactor;
					obj.position = ((ItemInfo) (obj1)).position;
				}
			}
		}

		sortChildDrawingOrder();
		if(!hasFocus()) goto _L4; else goto _L25
_L25:
		obj = ((Object) (findFocus()));
		if(obj != null)
			obj = ((Object) (infoForAnyChild(((View) (obj)))));
		else
			obj = null;
		if(obj != null && ((ItemInfo) (obj)).position == mCurItem) goto _L4; else goto _L26
_L26:
		i = 0;
_L29:
		if(i >= getChildCount()) goto _L4; else goto _L27
_L27:
		obj = ((Object) (getChildAt(i)));
		obj1 = ((Object) (infoForChild(((View) (obj)))));
		if(obj1 != null && ((ItemInfo) (obj1)).position == mCurItem && ((View) (obj)).requestFocus(2)) goto _L4; else goto _L28
_L28:
		i++;
		  goto _L29
		obj = null;
		  goto _L30
	//* 629 1258:goto            23
	}

	public void removeOnAdapterChangeListener(OnAdapterChangeListener onadapterchangelistener)
	{
		if(mAdapterChangeListeners != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #625 <Field List mAdapterChangeListeners>
	//*   2    4:ifnull          18
			mAdapterChangeListeners.remove(((Object) (onadapterchangelistener)));
	//    3    7:aload_0         
	//    4    8:getfield        #625 <Field List mAdapterChangeListeners>
	//    5   11:aload_1         
	//    6   12:invokeinterface #1225 <Method boolean List.remove(Object)>
	//    7   17:pop             
	//    8   18:return          
	}

	public void removeOnPageChangeListener(OnPageChangeListener onpagechangelistener)
	{
		if(mOnPageChangeListeners != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #348 <Field List mOnPageChangeListeners>
	//*   2    4:ifnull          18
			mOnPageChangeListeners.remove(((Object) (onpagechangelistener)));
	//    3    7:aload_0         
	//    4    8:getfield        #348 <Field List mOnPageChangeListeners>
	//    5   11:aload_1         
	//    6   12:invokeinterface #1225 <Method boolean List.remove(Object)>
	//    7   17:pop             
	//    8   18:return          
	}

	public void removeView(View view)
	{
		if(mInLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #647 <Field boolean mInLayout>
	//*   2    4:ifeq            13
		{
			removeViewInLayout(view);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #1230 <Method void removeViewInLayout(View)>
			return;
	//    6   12:return          
		} else
		{
			super.removeView(view);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #1232 <Method void ViewGroup.removeView(View)>
			return;
	//   10   18:return          
		}
	}

	public void setAdapter(PagerAdapter pageradapter)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(mAdapter != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #233 <Field PagerAdapter mAdapter>
	//*   4    6:ifnull          106
		{
			mAdapter.setViewPagerObserver(((DataSetObserver) (null)));
	//    5    9:aload_0         
	//    6   10:getfield        #233 <Field PagerAdapter mAdapter>
	//    7   13:aconst_null     
	//    8   14:invokevirtual   #1238 <Method void PagerAdapter.setViewPagerObserver(DataSetObserver)>
			mAdapter.startUpdate(((ViewGroup) (this)));
	//    9   17:aload_0         
	//   10   18:getfield        #233 <Field PagerAdapter mAdapter>
	//   11   21:aload_0         
	//   12   22:invokevirtual   #782 <Method void PagerAdapter.startUpdate(ViewGroup)>
			for(int i = 0; i < mItems.size(); i++)
	//*  13   25:iconst_0        
	//*  14   26:istore_2        
	//*  15   27:iload_2         
	//*  16   28:aload_0         
	//*  17   29:getfield        #188 <Field ArrayList mItems>
	//*  18   32:invokevirtual   #256 <Method int ArrayList.size()>
	//*  19   35:icmpge          76
			{
				ItemInfo iteminfo = (ItemInfo)mItems.get(i);
	//   20   38:aload_0         
	//   21   39:getfield        #188 <Field ArrayList mItems>
	//   22   42:iload_2         
	//   23   43:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   24   46:checkcast       #17  <Class ViewPager$ItemInfo>
	//   25   49:astore          6
				mAdapter.destroyItem(((ViewGroup) (this)), iteminfo.position, iteminfo.object);
	//   26   51:aload_0         
	//   27   52:getfield        #233 <Field PagerAdapter mAdapter>
	//   28   55:aload_0         
	//   29   56:aload           6
	//   30   58:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//   31   61:aload           6
	//   32   63:getfield        #618 <Field Object ViewPager$ItemInfo.object>
	//   33   66:invokevirtual   #786 <Method void PagerAdapter.destroyItem(ViewGroup, int, Object)>
			}

	//   34   69:iload_2         
	//   35   70:iconst_1        
	//   36   71:iadd            
	//   37   72:istore_2        
	//*  38   73:goto            27
			mAdapter.finishUpdate(((ViewGroup) (this)));
	//   39   76:aload_0         
	//   40   77:getfield        #233 <Field PagerAdapter mAdapter>
	//   41   80:aload_0         
	//   42   81:invokevirtual   #789 <Method void PagerAdapter.finishUpdate(ViewGroup)>
			mItems.clear();
	//   43   84:aload_0         
	//   44   85:getfield        #188 <Field ArrayList mItems>
	//   45   88:invokevirtual   #575 <Method void ArrayList.clear()>
			removeNonDecorViews();
	//   46   91:aload_0         
	//   47   92:invokespecial   #1240 <Method void removeNonDecorViews()>
			mCurItem = 0;
	//   48   95:aload_0         
	//   49   96:iconst_0        
	//   50   97:putfield        #337 <Field int mCurItem>
			scrollTo(0, 0);
	//   51  100:aload_0         
	//   52  101:iconst_0        
	//   53  102:iconst_0        
	//   54  103:invokevirtual   #296 <Method void scrollTo(int, int)>
		}
		PagerAdapter pageradapter1 = mAdapter;
	//   55  106:aload_0         
	//   56  107:getfield        #233 <Field PagerAdapter mAdapter>
	//   57  110:astore          6
		mAdapter = pageradapter;
	//   58  112:aload_0         
	//   59  113:aload_1         
	//   60  114:putfield        #233 <Field PagerAdapter mAdapter>
		mExpectedAdapterCount = 0;
	//   61  117:aload_0         
	//   62  118:iconst_0        
	//   63  119:putfield        #771 <Field int mExpectedAdapterCount>
		if(mAdapter != null)
	//*  64  122:aload_0         
	//*  65  123:getfield        #233 <Field PagerAdapter mAdapter>
	//*  66  126:ifnull          233
		{
			if(mObserver == null)
	//*  67  129:aload_0         
	//*  68  130:getfield        #1242 <Field ViewPager$PagerObserver mObserver>
	//*  69  133:ifnonnull       148
				mObserver = new PagerObserver();
	//   70  136:aload_0         
	//   71  137:new             #35  <Class ViewPager$PagerObserver>
	//   72  140:dup             
	//   73  141:aload_0         
	//   74  142:invokespecial   #1243 <Method void ViewPager$PagerObserver(ViewPager)>
	//   75  145:putfield        #1242 <Field ViewPager$PagerObserver mObserver>
			mAdapter.setViewPagerObserver(((DataSetObserver) (mObserver)));
	//   76  148:aload_0         
	//   77  149:getfield        #233 <Field PagerAdapter mAdapter>
	//   78  152:aload_0         
	//   79  153:getfield        #1242 <Field ViewPager$PagerObserver mObserver>
	//   80  156:invokevirtual   #1238 <Method void PagerAdapter.setViewPagerObserver(DataSetObserver)>
			mPopulatePending = false;
	//   81  159:aload_0         
	//   82  160:iconst_0        
	//   83  161:putfield        #302 <Field boolean mPopulatePending>
			boolean flag1 = mFirstLayout;
	//   84  164:aload_0         
	//   85  165:getfield        #214 <Field boolean mFirstLayout>
	//   86  168:istore          5
			mFirstLayout = true;
	//   87  170:aload_0         
	//   88  171:iconst_1        
	//   89  172:putfield        #214 <Field boolean mFirstLayout>
			mExpectedAdapterCount = mAdapter.getCount();
	//   90  175:aload_0         
	//   91  176:aload_0         
	//   92  177:getfield        #233 <Field PagerAdapter mAdapter>
	//   93  180:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//   94  183:putfield        #771 <Field int mExpectedAdapterCount>
			int j;
			int k;
			if(mRestoredCurItem >= 0)
	//*  95  186:aload_0         
	//*  96  187:getfield        #198 <Field int mRestoredCurItem>
	//*  97  190:iflt            300
			{
				mAdapter.restoreState(mRestoredAdapterState, mRestoredClassLoader);
	//   98  193:aload_0         
	//   99  194:getfield        #233 <Field PagerAdapter mAdapter>
	//  100  197:aload_0         
	//  101  198:getfield        #200 <Field Parcelable mRestoredAdapterState>
	//  102  201:aload_0         
	//  103  202:getfield        #202 <Field ClassLoader mRestoredClassLoader>
	//  104  205:invokevirtual   #1146 <Method void PagerAdapter.restoreState(Parcelable, ClassLoader)>
				setCurrentItemInternal(mRestoredCurItem, false, true);
	//  105  208:aload_0         
	//  106  209:aload_0         
	//  107  210:getfield        #198 <Field int mRestoredCurItem>
	//  108  213:iconst_0        
	//  109  214:iconst_1        
	//  110  215:invokevirtual   #794 <Method void setCurrentItemInternal(int, boolean, boolean)>
				mRestoredCurItem = -1;
	//  111  218:aload_0         
	//  112  219:iconst_m1       
	//  113  220:putfield        #198 <Field int mRestoredCurItem>
				mRestoredAdapterState = null;
	//  114  223:aload_0         
	//  115  224:aconst_null     
	//  116  225:putfield        #200 <Field Parcelable mRestoredAdapterState>
				mRestoredClassLoader = null;
	//  117  228:aload_0         
	//  118  229:aconst_null     
	//  119  230:putfield        #202 <Field ClassLoader mRestoredClassLoader>
			} else
	//* 120  233:aload_0         
	//* 121  234:getfield        #625 <Field List mAdapterChangeListeners>
	//* 122  237:ifnull          319
	//* 123  240:aload_0         
	//* 124  241:getfield        #625 <Field List mAdapterChangeListeners>
	//* 125  244:invokeinterface #1244 <Method boolean List.isEmpty()>
	//* 126  249:ifne            319
	//* 127  252:aload_0         
	//* 128  253:getfield        #625 <Field List mAdapterChangeListeners>
	//* 129  256:invokeinterface #351 <Method int List.size()>
	//* 130  261:istore          4
	//* 131  263:iload_3         
	//* 132  264:istore_2        
	//* 133  265:iload_2         
	//* 134  266:iload           4
	//* 135  268:icmpge          319
	//* 136  271:aload_0         
	//* 137  272:getfield        #625 <Field List mAdapterChangeListeners>
	//* 138  275:iload_2         
	//* 139  276:invokeinterface #352 <Method Object List.get(int)>
	//* 140  281:checkcast       #26  <Class ViewPager$OnAdapterChangeListener>
	//* 141  284:aload_0         
	//* 142  285:aload           6
	//* 143  287:aload_1         
	//* 144  288:invokeinterface #1248 <Method void ViewPager$OnAdapterChangeListener.onAdapterChanged(ViewPager, PagerAdapter, PagerAdapter)>
	//* 145  293:iload_2         
	//* 146  294:iconst_1        
	//* 147  295:iadd            
	//* 148  296:istore_2        
	//* 149  297:goto            265
			if(!flag1)
	//* 150  300:iload           5
	//* 151  302:ifne            312
				populate();
	//  152  305:aload_0         
	//  153  306:invokevirtual   #1064 <Method void populate()>
			else
	//* 154  309:goto            233
				requestLayout();
	//  155  312:aload_0         
	//  156  313:invokevirtual   #797 <Method void requestLayout()>
		}
		if(mAdapterChangeListeners != null && !mAdapterChangeListeners.isEmpty())
		{
			k = mAdapterChangeListeners.size();
			for(j = ((int) (flag)); j < k; j++)
				((OnAdapterChangeListener)mAdapterChangeListeners.get(j)).onAdapterChanged(this, pageradapter1, pageradapter);

		}
	//* 157  316:goto            233
	//  158  319:return          
	}

	public void setCurrentItem(int i)
	{
		mPopulatePending = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #302 <Field boolean mPopulatePending>
		boolean flag;
		if(!mFirstLayout)
	//*   3    5:aload_0         
	//*   4    6:getfield        #214 <Field boolean mFirstLayout>
	//*   5    9:ifne            22
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_2        
		else
	//*   8   14:aload_0         
	//*   9   15:iload_1         
	//*  10   16:iload_2         
	//*  11   17:iconst_0        
	//*  12   18:invokevirtual   #794 <Method void setCurrentItemInternal(int, boolean, boolean)>
	//*  13   21:return          
			flag = false;
	//   14   22:iconst_0        
	//   15   23:istore_2        
		setCurrentItemInternal(i, flag, false);
	//*  16   24:goto            14
	}

	public void setCurrentItem(int i, boolean flag)
	{
		mPopulatePending = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #302 <Field boolean mPopulatePending>
		setCurrentItemInternal(i, flag, false);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iload_2         
	//    6    8:iconst_0        
	//    7    9:invokevirtual   #794 <Method void setCurrentItemInternal(int, boolean, boolean)>
	//    8   12:return          
	}

	void setCurrentItemInternal(int i, boolean flag, boolean flag1)
	{
		setCurrentItemInternal(i, flag, flag1, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #898 <Method void setCurrentItemInternal(int, boolean, boolean, int)>
	//    6    8:return          
	}

	void setCurrentItemInternal(int i, boolean flag, boolean flag1, int j)
	{
		boolean flag2;
		flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore          6
		if(mAdapter == null || mAdapter.getCount() <= 0)
	//*   2    3:aload_0         
	//*   3    4:getfield        #233 <Field PagerAdapter mAdapter>
	//*   4    7:ifnull          20
	//*   5   10:aload_0         
	//*   6   11:getfield        #233 <Field PagerAdapter mAdapter>
	//*   7   14:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//*   8   17:ifgt            26
		{
			setScrollingCacheEnabled(false);
	//    9   20:aload_0         
	//   10   21:iconst_0        
	//   11   22:invokespecial   #269 <Method void setScrollingCacheEnabled(boolean)>
			return;
	//   12   25:return          
		}
		if(!flag1 && mCurItem == i && mItems.size() != 0)
	//*  13   26:iload_3         
	//*  14   27:ifne            54
	//*  15   30:aload_0         
	//*  16   31:getfield        #337 <Field int mCurItem>
	//*  17   34:iload_1         
	//*  18   35:icmpne          54
	//*  19   38:aload_0         
	//*  20   39:getfield        #188 <Field ArrayList mItems>
	//*  21   42:invokevirtual   #256 <Method int ArrayList.size()>
	//*  22   45:ifeq            54
		{
			setScrollingCacheEnabled(false);
	//   23   48:aload_0         
	//   24   49:iconst_0        
	//   25   50:invokespecial   #269 <Method void setScrollingCacheEnabled(boolean)>
			return;
	//   26   53:return          
		}
		if(i >= 0) goto _L2; else goto _L1
	//   27   54:iload_1         
	//   28   55:ifge            123
_L1:
		int k = 0;
	//   29   58:iconst_0        
	//   30   59:istore          5
_L4:
		i = mOffscreenPageLimit;
	//   31   61:aload_0         
	//   32   62:getfield        #210 <Field int mOffscreenPageLimit>
	//   33   65:istore_1        
		if(k > mCurItem + i || k < mCurItem - i)
	//*  34   66:iload           5
	//*  35   68:aload_0         
	//*  36   69:getfield        #337 <Field int mCurItem>
	//*  37   72:iload_1         
	//*  38   73:iadd            
	//*  39   74:icmpgt          88
	//*  40   77:iload           5
	//*  41   79:aload_0         
	//*  42   80:getfield        #337 <Field int mCurItem>
	//*  43   83:iload_1         
	//*  44   84:isub            
	//*  45   85:icmpge          151
			for(i = 0; i < mItems.size(); i++)
	//*  46   88:iconst_0        
	//*  47   89:istore_1        
	//*  48   90:iload_1         
	//*  49   91:aload_0         
	//*  50   92:getfield        #188 <Field ArrayList mItems>
	//*  51   95:invokevirtual   #256 <Method int ArrayList.size()>
	//*  52   98:icmpge          151
				((ItemInfo)mItems.get(i)).scrolling = true;
	//   53  101:aload_0         
	//   54  102:getfield        #188 <Field ArrayList mItems>
	//   55  105:iload_1         
	//   56  106:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   57  109:checkcast       #17  <Class ViewPager$ItemInfo>
	//   58  112:iconst_1        
	//   59  113:putfield        #305 <Field boolean ViewPager$ItemInfo.scrolling>

	//   60  116:iload_1         
	//   61  117:iconst_1        
	//   62  118:iadd            
	//   63  119:istore_1        
		break; /* Loop/switch isn't completed */
	//   64  120:goto            90
_L2:
		k = i;
	//   65  123:iload_1         
	//   66  124:istore          5
		if(i >= mAdapter.getCount())
	//*  67  126:iload_1         
	//*  68  127:aload_0         
	//*  69  128:getfield        #233 <Field PagerAdapter mAdapter>
	//*  70  131:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//*  71  134:icmplt          61
			k = mAdapter.getCount() - 1;
	//   72  137:aload_0         
	//   73  138:getfield        #233 <Field PagerAdapter mAdapter>
	//   74  141:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//   75  144:iconst_1        
	//   76  145:isub            
	//   77  146:istore          5
		if(true) goto _L4; else goto _L3
	//   78  148:goto            61
_L3:
		flag1 = flag2;
	//   79  151:iload           6
	//   80  153:istore_3        
		if(mCurItem != k)
	//*  81  154:aload_0         
	//*  82  155:getfield        #337 <Field int mCurItem>
	//*  83  158:iload           5
	//*  84  160:icmpeq          165
			flag1 = true;
	//   85  163:iconst_1        
	//   86  164:istore_3        
		if(mFirstLayout)
	//*  87  165:aload_0         
	//*  88  166:getfield        #214 <Field boolean mFirstLayout>
	//*  89  169:ifeq            193
		{
			mCurItem = k;
	//   90  172:aload_0         
	//   91  173:iload           5
	//   92  175:putfield        #337 <Field int mCurItem>
			if(flag1)
	//*  93  178:iload_3         
	//*  94  179:ifeq            188
				dispatchOnPageSelected(k);
	//   95  182:aload_0         
	//   96  183:iload           5
	//   97  185:invokespecial   #563 <Method void dispatchOnPageSelected(int)>
			requestLayout();
	//   98  188:aload_0         
	//   99  189:invokevirtual   #797 <Method void requestLayout()>
			return;
	//  100  192:return          
		} else
		{
			populate(k);
	//  101  193:aload_0         
	//  102  194:iload           5
	//  103  196:invokevirtual   #1170 <Method void populate(int)>
			scrollToItem(k, flag, j, flag1);
	//  104  199:aload_0         
	//  105  200:iload           5
	//  106  202:iload_2         
	//  107  203:iload           4
	//  108  205:iload_3         
	//  109  206:invokespecial   #1091 <Method void scrollToItem(int, boolean, int, boolean)>
			return;
	//  110  209:return          
		}
	}

	OnPageChangeListener setInternalPageChangeListener(OnPageChangeListener onpagechangelistener)
	{
		OnPageChangeListener onpagechangelistener1 = mInternalPageChangeListener;
	//    0    0:aload_0         
	//    1    1:getfield        #354 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
	//    2    4:astore_2        
		mInternalPageChangeListener = onpagechangelistener;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #354 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
		return onpagechangelistener1;
	//    6   10:aload_2         
	//    7   11:areturn         
	}

	public void setOffscreenPageLimit(int i)
	{
		int j = i;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(i < 1)
	//*   2    2:iload_1         
	//*   3    3:iconst_1        
	//*   4    4:icmpge          45
		{
			Log.w("ViewPager", (new StringBuilder()).append("Requested offscreen page limit ").append(i).append(" too small; defaulting to ").append(1).toString());
	//    5    7:ldc1            #80  <String "ViewPager">
	//    6    9:new             #688 <Class StringBuilder>
	//    7   12:dup             
	//    8   13:invokespecial   #689 <Method void StringBuilder()>
	//    9   16:ldc2            #1253 <String "Requested offscreen page limit ">
	//   10   19:invokevirtual   #697 <Method StringBuilder StringBuilder.append(String)>
	//   11   22:iload_1         
	//   12   23:invokevirtual   #1191 <Method StringBuilder StringBuilder.append(int)>
	//   13   26:ldc2            #1255 <String " too small; defaulting to ">
	//   14   29:invokevirtual   #697 <Method StringBuilder StringBuilder.append(String)>
	//   15   32:iconst_1        
	//   16   33:invokevirtual   #1191 <Method StringBuilder StringBuilder.append(int)>
	//   17   36:invokevirtual   #705 <Method String StringBuilder.toString()>
	//   18   39:invokestatic    #1258 <Method int Log.w(String, String)>
	//   19   42:pop             
			j = 1;
	//   20   43:iconst_1        
	//   21   44:istore_2        
		}
		if(j != mOffscreenPageLimit)
	//*  22   45:iload_2         
	//*  23   46:aload_0         
	//*  24   47:getfield        #210 <Field int mOffscreenPageLimit>
	//*  25   50:icmpeq          62
		{
			mOffscreenPageLimit = j;
	//   26   53:aload_0         
	//   27   54:iload_2         
	//   28   55:putfield        #210 <Field int mOffscreenPageLimit>
			populate();
	//   29   58:aload_0         
	//   30   59:invokevirtual   #1064 <Method void populate()>
		}
	//   31   62:return          
	}

	public void setOnPageChangeListener(OnPageChangeListener onpagechangelistener)
	{
		mOnPageChangeListener = onpagechangelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #343 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
	//    3    5:return          
	}

	public void setPageMargin(int i)
	{
		int j = mPageMargin;
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field int mPageMargin>
	//    2    4:istore_2        
		mPageMargin = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #244 <Field int mPageMargin>
		int k = getWidth();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #464 <Method int getWidth()>
	//    8   14:istore_3        
		recomputeScrollPosition(k, k, i, j);
	//    9   15:aload_0         
	//   10   16:iload_3         
	//   11   17:iload_3         
	//   12   18:iload_1         
	//   13   19:iload_2         
	//   14   20:invokespecial   #1160 <Method void recomputeScrollPosition(int, int, int, int)>
		requestLayout();
	//   15   23:aload_0         
	//   16   24:invokevirtual   #797 <Method void requestLayout()>
	//   17   27:return          
	}

	public void setPageMarginDrawable(int i)
	{
		setPageMarginDrawable(ContextCompat.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #922 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #1270 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    5    9:invokevirtual   #1273 <Method void setPageMarginDrawable(Drawable)>
	//    6   12:return          
	}

	public void setPageMarginDrawable(Drawable drawable)
	{
		mMarginDrawable = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #868 <Field Drawable mMarginDrawable>
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			refreshDrawableState();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #1276 <Method void refreshDrawableState()>
		boolean flag;
		if(drawable == null)
	//*   7   13:aload_1         
	//*   8   14:ifnonnull       29
			flag = true;
	//    9   17:iconst_1        
	//   10   18:istore_2        
		else
	//*  11   19:aload_0         
	//*  12   20:iload_2         
	//*  13   21:invokevirtual   #941 <Method void setWillNotDraw(boolean)>
	//*  14   24:aload_0         
	//*  15   25:invokevirtual   #1279 <Method void invalidate()>
	//*  16   28:return          
			flag = false;
	//   17   29:iconst_0        
	//   18   30:istore_2        
		setWillNotDraw(flag);
		invalidate();
	//*  19   31:goto            19
	}

	public void setPageTransformer(boolean flag, PageTransformer pagetransformer)
	{
		setPageTransformer(flag, pagetransformer, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iconst_2        
	//    4    4:invokevirtual   #1284 <Method void setPageTransformer(boolean, ViewPager$PageTransformer, int)>
	//    5    7:return          
	}

	public void setPageTransformer(boolean flag, PageTransformer pagetransformer, int i)
	{
		int j = 1;
	//    0    0:iconst_1        
	//    1    1:istore          5
		boolean flag1;
		boolean flag2;
		boolean flag3;
		if(pagetransformer != null)
	//*   2    3:aload_2         
	//*   3    4:ifnull          74
			flag2 = true;
	//    4    7:iconst_1        
	//    5    8:istore          6
		else
	//*   6   10:aload_0         
	//*   7   11:getfield        #1119 <Field ViewPager$PageTransformer mPageTransformer>
	//*   8   14:ifnull          80
	//*   9   17:iconst_1        
	//*  10   18:istore          7
	//*  11   20:iload           6
	//*  12   22:iload           7
	//*  13   24:icmpeq          86
	//*  14   27:iconst_1        
	//*  15   28:istore          4
	//*  16   30:aload_0         
	//*  17   31:aload_2         
	//*  18   32:putfield        #1119 <Field ViewPager$PageTransformer mPageTransformer>
	//*  19   35:aload_0         
	//*  20   36:iload           6
	//*  21   38:invokevirtual   #1287 <Method void setChildrenDrawingOrderEnabled(boolean)>
	//*  22   41:iload           6
	//*  23   43:ifeq            92
	//*  24   46:iload_1         
	//*  25   47:ifeq            53
	//*  26   50:iconst_2        
	//*  27   51:istore          5
	//*  28   53:aload_0         
	//*  29   54:iload           5
	//*  30   56:putfield        #568 <Field int mDrawingOrder>
	//*  31   59:aload_0         
	//*  32   60:iload_3         
	//*  33   61:putfield        #369 <Field int mPageTransformerLayerType>
	//*  34   64:iload           4
	//*  35   66:ifeq            73
	//*  36   69:aload_0         
	//*  37   70:invokevirtual   #1064 <Method void populate()>
	//*  38   73:return          
			flag2 = false;
	//   39   74:iconst_0        
	//   40   75:istore          6
		if(mPageTransformer != null)
			flag3 = true;
		else
	//*  41   77:goto            10
			flag3 = false;
	//   42   80:iconst_0        
	//   43   81:istore          7
		if(flag2 != flag3)
			flag1 = true;
		else
	//*  44   83:goto            20
			flag1 = false;
	//   45   86:iconst_0        
	//   46   87:istore          4
		mPageTransformer = pagetransformer;
		setChildrenDrawingOrderEnabled(flag2);
		if(flag2)
		{
			if(flag)
				j = 2;
			mDrawingOrder = j;
			mPageTransformerLayerType = i;
		} else
	//*  47   89:goto            30
		{
			mDrawingOrder = 0;
	//   48   92:aload_0         
	//   49   93:iconst_0        
	//   50   94:putfield        #568 <Field int mDrawingOrder>
		}
		if(flag1)
			populate();
	//*  51   97:goto            64
	}

	void setScrollState(int i)
	{
		if(mScrollState == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #223 <Field int mScrollState>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		mScrollState = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #223 <Field int mScrollState>
		if(mPageTransformer != null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #1119 <Field ViewPager$PageTransformer mPageTransformer>
	//*  10   18:ifnull          32
		{
			boolean flag;
			if(i != 0)
	//*  11   21:iload_1         
	//*  12   22:ifeq            38
				flag = true;
	//   13   25:iconst_1        
	//   14   26:istore_2        
			else
	//*  15   27:aload_0         
	//*  16   28:iload_2         
	//*  17   29:invokespecial   #1289 <Method void enableLayers(boolean)>
	//*  18   32:aload_0         
	//*  19   33:iload_1         
	//*  20   34:invokespecial   #1291 <Method void dispatchOnScrollStateChanged(int)>
	//*  21   37:return          
				flag = false;
	//   22   38:iconst_0        
	//   23   39:istore_2        
			enableLayers(flag);
		}
		dispatchOnScrollStateChanged(i);
	//*  24   40:goto            27
	}

	void smoothScrollTo(int i, int j)
	{
		smoothScrollTo(i, j, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #561 <Method void smoothScrollTo(int, int, int)>
	//    5    7:return          
	}

	void smoothScrollTo(int i, int j, int k)
	{
		if(getChildCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #367 <Method int getChildCount()>
	//*   2    4:ifne            13
		{
			setScrollingCacheEnabled(false);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:invokespecial   #269 <Method void setScrollingCacheEnabled(boolean)>
			return;
	//    6   12:return          
		}
		int l;
		int i1;
		int j1;
		if(mScroller != null && !mScroller.isFinished())
	//*   7   13:aload_0         
	//*   8   14:getfield        #271 <Field Scroller mScroller>
	//*   9   17:ifnull          107
	//*  10   20:aload_0         
	//*  11   21:getfield        #271 <Field Scroller mScroller>
	//*  12   24:invokevirtual   #277 <Method boolean Scroller.isFinished()>
	//*  13   27:ifne            107
			l = 1;
	//   14   30:iconst_1        
	//   15   31:istore          7
		else
	//*  16   33:iload           7
	//*  17   35:ifeq            125
	//*  18   38:aload_0         
	//*  19   39:getfield        #761 <Field boolean mIsScrollStarted>
	//*  20   42:ifeq            113
	//*  21   45:aload_0         
	//*  22   46:getfield        #271 <Field Scroller mScroller>
	//*  23   49:invokevirtual   #289 <Method int Scroller.getCurrX()>
	//*  24   52:istore          7
	//*  25   54:aload_0         
	//*  26   55:getfield        #271 <Field Scroller mScroller>
	//*  27   58:invokevirtual   #280 <Method void Scroller.abortAnimation()>
	//*  28   61:aload_0         
	//*  29   62:iconst_0        
	//*  30   63:invokespecial   #269 <Method void setScrollingCacheEnabled(boolean)>
	//*  31   66:aload_0         
	//*  32   67:invokevirtual   #286 <Method int getScrollY()>
	//*  33   70:istore          8
	//*  34   72:iload_1         
	//*  35   73:iload           7
	//*  36   75:isub            
	//*  37   76:istore          9
	//*  38   78:iload_2         
	//*  39   79:iload           8
	//*  40   81:isub            
	//*  41   82:istore_2        
	//*  42   83:iload           9
	//*  43   85:ifne            134
	//*  44   88:iload_2         
	//*  45   89:ifne            134
	//*  46   92:aload_0         
	//*  47   93:iconst_0        
	//*  48   94:invokespecial   #528 <Method void completeScroll(boolean)>
	//*  49   97:aload_0         
	//*  50   98:invokevirtual   #1064 <Method void populate()>
	//*  51  101:aload_0         
	//*  52  102:iconst_0        
	//*  53  103:invokevirtual   #723 <Method void setScrollState(int)>
	//*  54  106:return          
			l = 0;
	//   55  107:iconst_0        
	//   56  108:istore          7
		if(l != 0)
		{
			if(mIsScrollStarted)
				l = mScroller.getCurrX();
			else
	//*  57  110:goto            33
				l = mScroller.getStartX();
	//   58  113:aload_0         
	//   59  114:getfield        #271 <Field Scroller mScroller>
	//   60  117:invokevirtual   #1294 <Method int Scroller.getStartX()>
	//   61  120:istore          7
			mScroller.abortAnimation();
			setScrollingCacheEnabled(false);
		} else
	//*  62  122:goto            54
		{
			l = getScrollX();
	//   63  125:aload_0         
	//   64  126:invokevirtual   #283 <Method int getScrollX()>
	//   65  129:istore          7
		}
		i1 = getScrollY();
		j1 = i - l;
		j -= i1;
		if(j1 == 0 && j == 0)
		{
			completeScroll(false);
			populate();
			setScrollState(0);
			return;
		}
	//*  66  131:goto            66
		setScrollingCacheEnabled(true);
	//   67  134:aload_0         
	//   68  135:iconst_1        
	//   69  136:invokespecial   #269 <Method void setScrollingCacheEnabled(boolean)>
		setScrollState(2);
	//   70  139:aload_0         
	//   71  140:iconst_2        
	//   72  141:invokevirtual   #723 <Method void setScrollState(int)>
		i = getClientWidth();
	//   73  144:aload_0         
	//   74  145:invokespecial   #242 <Method int getClientWidth()>
	//   75  148:istore_1        
		int k1 = i / 2;
	//   76  149:iload_1         
	//   77  150:iconst_2        
	//   78  151:idiv            
	//   79  152:istore          10
		float f4 = Math.min(1.0F, ((float)Math.abs(j1) * 1.0F) / (float)i);
	//   80  154:fconst_1        
	//   81  155:iload           9
	//   82  157:invokestatic    #324 <Method int Math.abs(int)>
	//   83  160:i2f             
	//   84  161:fconst_1        
	//   85  162:fmul            
	//   86  163:iload_1         
	//   87  164:i2f             
	//   88  165:fdiv            
	//   89  166:invokestatic    #526 <Method float Math.min(float, float)>
	//   90  169:fstore          6
		float f = k1;
	//   91  171:iload           10
	//   92  173:i2f             
	//   93  174:fstore          4
		float f2 = k1;
	//   94  176:iload           10
	//   95  178:i2f             
	//   96  179:fstore          5
		f4 = distanceInfluenceForSnapDuration(f4);
	//   97  181:aload_0         
	//   98  182:fload           6
	//   99  184:invokevirtual   #1296 <Method float distanceInfluenceForSnapDuration(float)>
	//  100  187:fstore          6
		k = Math.abs(k);
	//  101  189:iload_3         
	//  102  190:invokestatic    #324 <Method int Math.abs(int)>
	//  103  193:istore_3        
		if(k > 0)
	//* 104  194:iload_3         
	//* 105  195:ifle            255
		{
			i = Math.round(1000F * Math.abs((f2 * f4 + f) / (float)k)) * 4;
	//  106  198:ldc2            #1297 <Float 1000F>
	//  107  201:fload           5
	//  108  203:fload           6
	//  109  205:fmul            
	//  110  206:fload           4
	//  111  208:fadd            
	//  112  209:iload_3         
	//  113  210:i2f             
	//  114  211:fdiv            
	//  115  212:invokestatic    #501 <Method float Math.abs(float)>
	//  116  215:fmul            
	//  117  216:invokestatic    #1024 <Method int Math.round(float)>
	//  118  219:iconst_4        
	//  119  220:imul            
	//  120  221:istore_1        
		} else
	//* 121  222:iload_1         
	//* 122  223:sipush          600
	//* 123  226:invokestatic    #332 <Method int Math.min(int, int)>
	//* 124  229:istore_1        
	//* 125  230:aload_0         
	//* 126  231:iconst_0        
	//* 127  232:putfield        #761 <Field boolean mIsScrollStarted>
	//* 128  235:aload_0         
	//* 129  236:getfield        #271 <Field Scroller mScroller>
	//* 130  239:iload           7
	//* 131  241:iload           8
	//* 132  243:iload           9
	//* 133  245:iload_2         
	//* 134  246:iload_1         
	//* 135  247:invokevirtual   #1301 <Method void Scroller.startScroll(int, int, int, int, int)>
	//* 136  250:aload_0         
	//* 137  251:invokestatic    #768 <Method void ViewCompat.postInvalidateOnAnimation(View)>
	//* 138  254:return          
		{
			float f1 = i;
	//  139  255:iload_1         
	//  140  256:i2f             
	//  141  257:fstore          4
			float f3 = mAdapter.getPageWidth(mCurItem);
	//  142  259:aload_0         
	//  143  260:getfield        #233 <Field PagerAdapter mAdapter>
	//  144  263:aload_0         
	//  145  264:getfield        #337 <Field int mCurItem>
	//  146  267:invokevirtual   #264 <Method float PagerAdapter.getPageWidth(int)>
	//  147  270:fstore          5
			i = (int)(((float)Math.abs(j1) / (f1 * f3 + (float)mPageMargin) + 1.0F) * 100F);
	//  148  272:iload           9
	//  149  274:invokestatic    #324 <Method int Math.abs(int)>
	//  150  277:i2f             
	//  151  278:fload           4
	//  152  280:fload           5
	//  153  282:fmul            
	//  154  283:aload_0         
	//  155  284:getfield        #244 <Field int mPageMargin>
	//  156  287:i2f             
	//  157  288:fadd            
	//  158  289:fdiv            
	//  159  290:fconst_1        
	//  160  291:fadd            
	//  161  292:ldc2            #1302 <Float 100F>
	//  162  295:fmul            
	//  163  296:f2i             
	//  164  297:istore_1        
		}
		i = Math.min(i, 600);
		mIsScrollStarted = false;
		mScroller.startScroll(l, i1, j1, j, i);
		ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//* 165  298:goto            222
	}

	protected boolean verifyDrawable(Drawable drawable)
	{
		return super.verifyDrawable(drawable) || drawable == mMarginDrawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #1306 <Method boolean ViewGroup.verifyDrawable(Drawable)>
	//    3    5:ifne            16
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #868 <Field Drawable mMarginDrawable>
	//    7   13:if_acmpne       18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	private static final int CLOSE_ENOUGH = 2;
	private static final Comparator COMPARATOR = new Comparator() {

		public int compare(ItemInfo iteminfo, ItemInfo iteminfo1)
		{
			return iteminfo.position - iteminfo1.position;
		//    0    0:aload_1         
		//    1    1:getfield        #22  <Field int ViewPager$ItemInfo.position>
		//    2    4:aload_2         
		//    3    5:getfield        #22  <Field int ViewPager$ItemInfo.position>
		//    4    8:isub            
		//    5    9:ireturn         
		}

		public volatile int compare(Object obj, Object obj1)
		{
			return compare((ItemInfo)obj, (ItemInfo)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #18  <Class ViewPager$ItemInfo>
		//    3    5:aload_2         
		//    4    6:checkcast       #18  <Class ViewPager$ItemInfo>
		//    5    9:invokevirtual   #25  <Method int compare(ViewPager$ItemInfo, ViewPager$ItemInfo)>
		//    6   12:ireturn         
		}

	}
;
	private static final boolean DEBUG = false;
	private static final int DEFAULT_GUTTER_SIZE = 16;
	private static final int DEFAULT_OFFSCREEN_PAGES = 1;
	private static final int DRAW_ORDER_DEFAULT = 0;
	private static final int DRAW_ORDER_FORWARD = 1;
	private static final int DRAW_ORDER_REVERSE = 2;
	private static final int INVALID_POINTER = -1;
	static final int LAYOUT_ATTRS[] = {
		0x10100b3
	};
	private static final int MAX_SETTLE_DURATION = 600;
	private static final int MIN_DISTANCE_FOR_FLING = 25;
	private static final int MIN_FLING_VELOCITY = 400;
	public static final int SCROLL_STATE_DRAGGING = 1;
	public static final int SCROLL_STATE_IDLE = 0;
	public static final int SCROLL_STATE_SETTLING = 2;
	private static final String TAG = "ViewPager";
	private static final boolean USE_CACHE = false;
	private static final Interpolator sInterpolator = new Interpolator() {

		public float getInterpolation(float f)
		{
			f--;
		//    0    0:fload_1         
		//    1    1:fconst_1        
		//    2    2:fsub            
		//    3    3:fstore_1        
			return f * (f * f * f * f) + 1.0F;
		//    4    4:fload_1         
		//    5    5:fload_1         
		//    6    6:fload_1         
		//    7    7:fmul            
		//    8    8:fload_1         
		//    9    9:fmul            
		//   10   10:fload_1         
		//   11   11:fmul            
		//   12   12:fmul            
		//   13   13:fconst_1        
		//   14   14:fadd            
		//   15   15:freturn         
		}

	}
;
	private static final ViewPositionComparator sPositionComparator = new ViewPositionComparator();
	private int mActivePointerId;
	PagerAdapter mAdapter;
	private List mAdapterChangeListeners;
	private int mBottomPageBounds;
	private boolean mCalledSuper;
	private int mChildHeightMeasureSpec;
	private int mChildWidthMeasureSpec;
	private int mCloseEnough;
	int mCurItem;
	private int mDecorChildCount;
	private int mDefaultGutterSize;
	private int mDrawingOrder;
	private ArrayList mDrawingOrderedChildren;
	private final Runnable mEndScrollRunnable;
	private int mExpectedAdapterCount;
	private long mFakeDragBeginTime;
	private boolean mFakeDragging;
	private boolean mFirstLayout;
	private float mFirstOffset;
	private int mFlingDistance;
	private int mGutterSize;
	private boolean mInLayout;
	private float mInitialMotionX;
	private float mInitialMotionY;
	private OnPageChangeListener mInternalPageChangeListener;
	private boolean mIsBeingDragged;
	private boolean mIsScrollStarted;
	private boolean mIsUnableToDrag;
	private final ArrayList mItems;
	private float mLastMotionX;
	private float mLastMotionY;
	private float mLastOffset;
	private EdgeEffect mLeftEdge;
	private Drawable mMarginDrawable;
	private int mMaximumVelocity;
	private int mMinimumVelocity;
	private boolean mNeedCalculatePageOffsets;
	private PagerObserver mObserver;
	private int mOffscreenPageLimit;
	private OnPageChangeListener mOnPageChangeListener;
	private List mOnPageChangeListeners;
	private int mPageMargin;
	private PageTransformer mPageTransformer;
	private int mPageTransformerLayerType;
	private boolean mPopulatePending;
	private Parcelable mRestoredAdapterState;
	private ClassLoader mRestoredClassLoader;
	private int mRestoredCurItem;
	private EdgeEffect mRightEdge;
	private int mScrollState;
	private Scroller mScroller;
	private boolean mScrollingCacheEnabled;
	private final ItemInfo mTempItem;
	private final Rect mTempRect;
	private int mTopPageBounds;
	private int mTouchSlop;
	private VelocityTracker mVelocityTracker;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #166 <Int 0x10100b3>
	//    5    7:iastore         
	//    6    8:putstatic       #168 <Field int[] LAYOUT_ATTRS>
	//    7   11:new             #6   <Class ViewPager$1>
	//    8   14:dup             
	//    9   15:invokespecial   #171 <Method void ViewPager$1()>
	//   10   18:putstatic       #173 <Field Comparator COMPARATOR>
	//   11   21:new             #8   <Class ViewPager$2>
	//   12   24:dup             
	//   13   25:invokespecial   #174 <Method void ViewPager$2()>
	//   14   28:putstatic       #176 <Field Interpolator sInterpolator>
	//   15   31:new             #46  <Class ViewPager$ViewPositionComparator>
	//   16   34:dup             
	//   17   35:invokespecial   #177 <Method void ViewPager$ViewPositionComparator()>
	//   18   38:putstatic       #179 <Field ViewPager$ViewPositionComparator sPositionComparator>
	//*  19   41:return          
	}
}
