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
			if(i != 4096)
		//*   8   12:iload_2         
		//*   9   13:sipush          4096
		//*  10   16:icmpeq          58
			{
				if(i != 8192)
		//*  11   19:iload_2         
		//*  12   20:sipush          8192
		//*  13   23:icmpeq          28
					return false;
		//   14   26:iconst_0        
		//   15   27:ireturn         
				if(canScrollHorizontally(-1))
		//*  16   28:aload_0         
		//*  17   29:getfield        #13  <Field ViewPager this$0>
		//*  18   32:iconst_m1       
		//*  19   33:invokevirtual   #80  <Method boolean ViewPager.canScrollHorizontally(int)>
		//*  20   36:ifeq            56
				{
					view = ((View) (ViewPager.this));
		//   21   39:aload_0         
		//   22   40:getfield        #13  <Field ViewPager this$0>
		//   23   43:astore_1        
					((ViewPager) (view)).setCurrentItem(((ViewPager) (view)).mCurItem - 1);
		//   24   44:aload_1         
		//   25   45:aload_1         
		//   26   46:getfield        #62  <Field int ViewPager.mCurItem>
		//   27   49:iconst_1        
		//   28   50:isub            
		//   29   51:invokevirtual   #90  <Method void ViewPager.setCurrentItem(int)>
					return true;
		//   30   54:iconst_1        
		//   31   55:ireturn         
				} else
				{
					return false;
		//   32   56:iconst_0        
		//   33   57:ireturn         
				}
			}
			if(canScrollHorizontally(1))
		//*  34   58:aload_0         
		//*  35   59:getfield        #13  <Field ViewPager this$0>
		//*  36   62:iconst_1        
		//*  37   63:invokevirtual   #80  <Method boolean ViewPager.canScrollHorizontally(int)>
		//*  38   66:ifeq            86
			{
				view = ((View) (ViewPager.this));
		//   39   69:aload_0         
		//   40   70:getfield        #13  <Field ViewPager this$0>
		//   41   73:astore_1        
				((ViewPager) (view)).setCurrentItem(((ViewPager) (view)).mCurItem + 1);
		//   42   74:aload_1         
		//   43   75:aload_1         
		//   44   76:getfield        #62  <Field int ViewPager.mCurItem>
		//   45   79:iconst_1        
		//   46   80:iadd            
		//   47   81:invokevirtual   #90  <Method void ViewPager.setCurrentItem(int)>
				return true;
		//   48   84:iconst_1        
		//   49   85:ireturn         
			} else
			{
				return false;
		//   50   86:iconst_0        
		//   51   87:ireturn         
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
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #66  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #67  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("FragmentPager.SavedState{");
		//    4    8:aload_1         
		//    5    9:ldc1            #69  <String "FragmentPager.SavedState{">
		//    6   11:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:invokestatic    #79  <Method int System.identityHashCode(Object)>
		//   11   20:invokestatic    #85  <Method String Integer.toHexString(int)>
		//   12   23:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
		//   13   26:pop             
			stringbuilder.append(" position=");
		//   14   27:aload_1         
		//   15   28:ldc1            #87  <String " position=">
		//   16   30:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
		//   17   33:pop             
			stringbuilder.append(position);
		//   18   34:aload_1         
		//   19   35:aload_0         
		//   20   36:getfield        #49  <Field int position>
		//   21   39:invokevirtual   #90  <Method StringBuilder StringBuilder.append(int)>
		//   22   42:pop             
			stringbuilder.append("}");
		//   23   43:aload_1         
		//   24   44:ldc1            #92  <String "}">
		//   25   46:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
		//   26   49:pop             
			return stringbuilder.toString();
		//   27   50:aload_1         
		//   28   51:invokevirtual   #94  <Method String StringBuilder.toString()>
		//   29   54:areturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #98  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeInt(position);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #49  <Field int position>
		//    7   11:invokevirtual   #102 <Method void Parcel.writeInt(int)>
			parcel.writeParcelable(adapterState, i);
		//    8   14:aload_1         
		//    9   15:aload_0         
		//   10   16:getfield        #55  <Field Parcelable adapterState>
		//   11   19:iload_2         
		//   12   20:invokevirtual   #106 <Method void Parcel.writeParcelable(Parcelable, int)>
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
		//    2    2:invokespecial   #61  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
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
	//    2    2:invokespecial   #181 <Method void ViewGroup(Context)>
		mItems = new ArrayList();
	//    3    5:aload_0         
	//    4    6:new             #183 <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #184 <Method void ArrayList()>
	//    7   13:putfield        #186 <Field ArrayList mItems>
		mTempItem = new ItemInfo();
	//    8   16:aload_0         
	//    9   17:new             #17  <Class ViewPager$ItemInfo>
	//   10   20:dup             
	//   11   21:invokespecial   #187 <Method void ViewPager$ItemInfo()>
	//   12   24:putfield        #189 <Field ViewPager$ItemInfo mTempItem>
		mTempRect = new Rect();
	//   13   27:aload_0         
	//   14   28:new             #191 <Class Rect>
	//   15   31:dup             
	//   16   32:invokespecial   #192 <Method void Rect()>
	//   17   35:putfield        #194 <Field Rect mTempRect>
		mRestoredCurItem = -1;
	//   18   38:aload_0         
	//   19   39:iconst_m1       
	//   20   40:putfield        #196 <Field int mRestoredCurItem>
		mRestoredAdapterState = null;
	//   21   43:aload_0         
	//   22   44:aconst_null     
	//   23   45:putfield        #198 <Field Parcelable mRestoredAdapterState>
		mRestoredClassLoader = null;
	//   24   48:aload_0         
	//   25   49:aconst_null     
	//   26   50:putfield        #200 <Field ClassLoader mRestoredClassLoader>
		mFirstOffset = -3.402823E+38F;
	//   27   53:aload_0         
	//   28   54:ldc1            #201 <Float -3.402823E+38F>
	//   29   56:putfield        #203 <Field float mFirstOffset>
		mLastOffset = 3.402823E+38F;
	//   30   59:aload_0         
	//   31   60:ldc1            #204 <Float 3.402823E+38F>
	//   32   62:putfield        #206 <Field float mLastOffset>
		mOffscreenPageLimit = 1;
	//   33   65:aload_0         
	//   34   66:iconst_1        
	//   35   67:putfield        #208 <Field int mOffscreenPageLimit>
		mActivePointerId = -1;
	//   36   70:aload_0         
	//   37   71:iconst_m1       
	//   38   72:putfield        #210 <Field int mActivePointerId>
		mFirstLayout = true;
	//   39   75:aload_0         
	//   40   76:iconst_1        
	//   41   77:putfield        #212 <Field boolean mFirstLayout>
		mNeedCalculatePageOffsets = false;
	//   42   80:aload_0         
	//   43   81:iconst_0        
	//   44   82:putfield        #214 <Field boolean mNeedCalculatePageOffsets>
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
	//   49   91:invokespecial   #217 <Method void ViewPager$3(ViewPager)>
	//   50   94:putfield        #219 <Field Runnable mEndScrollRunnable>
		mScrollState = 0;
	//   51   97:aload_0         
	//   52   98:iconst_0        
	//   53   99:putfield        #221 <Field int mScrollState>
		initViewPager();
	//   54  102:aload_0         
	//   55  103:invokevirtual   #224 <Method void initViewPager()>
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
	//    5    7:new             #183 <Class ArrayList>
	//    6   10:dup             
	//    7   11:invokespecial   #184 <Method void ArrayList()>
	//    8   14:putfield        #186 <Field ArrayList mItems>
		mTempItem = new ItemInfo();
	//    9   17:aload_0         
	//   10   18:new             #17  <Class ViewPager$ItemInfo>
	//   11   21:dup             
	//   12   22:invokespecial   #187 <Method void ViewPager$ItemInfo()>
	//   13   25:putfield        #189 <Field ViewPager$ItemInfo mTempItem>
		mTempRect = new Rect();
	//   14   28:aload_0         
	//   15   29:new             #191 <Class Rect>
	//   16   32:dup             
	//   17   33:invokespecial   #192 <Method void Rect()>
	//   18   36:putfield        #194 <Field Rect mTempRect>
		mRestoredCurItem = -1;
	//   19   39:aload_0         
	//   20   40:iconst_m1       
	//   21   41:putfield        #196 <Field int mRestoredCurItem>
		mRestoredAdapterState = null;
	//   22   44:aload_0         
	//   23   45:aconst_null     
	//   24   46:putfield        #198 <Field Parcelable mRestoredAdapterState>
		mRestoredClassLoader = null;
	//   25   49:aload_0         
	//   26   50:aconst_null     
	//   27   51:putfield        #200 <Field ClassLoader mRestoredClassLoader>
		mFirstOffset = -3.402823E+38F;
	//   28   54:aload_0         
	//   29   55:ldc1            #201 <Float -3.402823E+38F>
	//   30   57:putfield        #203 <Field float mFirstOffset>
		mLastOffset = 3.402823E+38F;
	//   31   60:aload_0         
	//   32   61:ldc1            #204 <Float 3.402823E+38F>
	//   33   63:putfield        #206 <Field float mLastOffset>
		mOffscreenPageLimit = 1;
	//   34   66:aload_0         
	//   35   67:iconst_1        
	//   36   68:putfield        #208 <Field int mOffscreenPageLimit>
		mActivePointerId = -1;
	//   37   71:aload_0         
	//   38   72:iconst_m1       
	//   39   73:putfield        #210 <Field int mActivePointerId>
		mFirstLayout = true;
	//   40   76:aload_0         
	//   41   77:iconst_1        
	//   42   78:putfield        #212 <Field boolean mFirstLayout>
		mNeedCalculatePageOffsets = false;
	//   43   81:aload_0         
	//   44   82:iconst_0        
	//   45   83:putfield        #214 <Field boolean mNeedCalculatePageOffsets>
		mEndScrollRunnable = new _cls3();
	//   46   86:aload_0         
	//   47   87:new             #10  <Class ViewPager$3>
	//   48   90:dup             
	//   49   91:aload_0         
	//   50   92:invokespecial   #217 <Method void ViewPager$3(ViewPager)>
	//   51   95:putfield        #219 <Field Runnable mEndScrollRunnable>
		mScrollState = 0;
	//   52   98:aload_0         
	//   53   99:iconst_0        
	//   54  100:putfield        #221 <Field int mScrollState>
		initViewPager();
	//   55  103:aload_0         
	//   56  104:invokevirtual   #224 <Method void initViewPager()>
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
	//*   8   17:ifle            34
			f3 = (float)mPageMargin / (float)j;
	//    9   20:aload_0         
	//   10   21:getfield        #244 <Field int mPageMargin>
	//   11   24:i2f             
	//   12   25:iload           7
	//   13   27:i2f             
	//   14   28:fdiv            
	//   15   29:fstore          5
		else
	//*  16   31:goto            37
			f3 = 0.0F;
	//   17   34:fconst_0        
	//   18   35:fstore          5
		if(iteminfo1 != null)
	//*  19   37:aload_3         
	//*  20   38:ifnull          409
		{
			j = iteminfo1.position;
	//   21   41:aload_3         
	//   22   42:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//   23   45:istore          7
			if(j < iteminfo.position)
	//*  24   47:iload           7
	//*  25   49:aload_1         
	//*  26   50:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  27   53:icmpge          236
			{
				float f = iteminfo1.offset + iteminfo1.widthFactor + f3;
	//   28   56:aload_3         
	//   29   57:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   30   60:aload_3         
	//   31   61:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//   32   64:fadd            
	//   33   65:fload           5
	//   34   67:fadd            
	//   35   68:fstore          4
				j++;
	//   36   70:iload           7
	//   37   72:iconst_1        
	//   38   73:iadd            
	//   39   74:istore          7
				int j1;
				for(int k = 0; j <= iteminfo.position && k < mItems.size(); j = j1 + 1)
	//*  40   76:iconst_0        
	//*  41   77:istore          8
	//*  42   79:iload           7
	//*  43   81:aload_1         
	//*  44   82:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  45   85:icmpgt          409
	//*  46   88:iload           8
	//*  47   90:aload_0         
	//*  48   91:getfield        #186 <Field ArrayList mItems>
	//*  49   94:invokevirtual   #256 <Method int ArrayList.size()>
	//*  50   97:icmpge          409
				{
					iteminfo1 = (ItemInfo)mItems.get(k);
	//   51  100:aload_0         
	//   52  101:getfield        #186 <Field ArrayList mItems>
	//   53  104:iload           8
	//   54  106:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   55  109:checkcast       #17  <Class ViewPager$ItemInfo>
	//   56  112:astore_3        
					float f4;
					do
					{
						j1 = j;
	//   57  113:iload           7
	//   58  115:istore          9
						f4 = f;
	//   59  117:fload           4
	//   60  119:fstore          6
						if(j <= iteminfo1.position)
							break;
	//   61  121:iload           7
	//   62  123:aload_3         
	//   63  124:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//   64  127:icmple          174
						j1 = j;
	//   65  130:iload           7
	//   66  132:istore          9
						f4 = f;
	//   67  134:fload           4
	//   68  136:fstore          6
						if(k >= mItems.size() - 1)
							break;
	//   69  138:iload           8
	//   70  140:aload_0         
	//   71  141:getfield        #186 <Field ArrayList mItems>
	//   72  144:invokevirtual   #256 <Method int ArrayList.size()>
	//   73  147:iconst_1        
	//   74  148:isub            
	//   75  149:icmpge          174
						k++;
	//   76  152:iload           8
	//   77  154:iconst_1        
	//   78  155:iadd            
	//   79  156:istore          8
						iteminfo1 = (ItemInfo)mItems.get(k);
	//   80  158:aload_0         
	//   81  159:getfield        #186 <Field ArrayList mItems>
	//   82  162:iload           8
	//   83  164:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   84  167:checkcast       #17  <Class ViewPager$ItemInfo>
	//   85  170:astore_3        
					} while(true);
	//   86  171:goto            113
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
	//* 119  233:goto            79
			if(j > iteminfo.position)
	//* 120  236:iload           7
	//* 121  238:aload_1         
	//* 122  239:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 123  242:icmple          409
			{
				int l = mItems.size() - 1;
	//  124  245:aload_0         
	//  125  246:getfield        #186 <Field ArrayList mItems>
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
	//  144  283:getfield        #186 <Field ArrayList mItems>
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
	//  168  332:getfield        #186 <Field ArrayList mItems>
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
	//  208  410:getfield        #186 <Field ArrayList mItems>
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
		if(iteminfo.position == 0)
	//* 219  432:aload_1         
	//* 220  433:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 221  436:ifne            448
			f2 = iteminfo.offset;
	//  222  439:aload_1         
	//  223  440:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//  224  443:fstore          4
		else
	//* 225  445:goto            452
			f2 = -3.402823E+38F;
	//  226  448:ldc1            #201 <Float -3.402823E+38F>
	//  227  450:fstore          4
		mFirstOffset = f2;
	//  228  452:aload_0         
	//  229  453:fload           4
	//  230  455:putfield        #203 <Field float mFirstOffset>
		int i1 = iteminfo.position;
	//  231  458:aload_1         
	//  232  459:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//  233  462:istore          8
		i2--;
	//  234  464:iload           10
	//  235  466:iconst_1        
	//  236  467:isub            
	//  237  468:istore          10
		if(i1 == i2)
	//* 238  470:iload           8
	//* 239  472:iload           10
	//* 240  474:icmpne          493
			f2 = (iteminfo.offset + iteminfo.widthFactor) - 1.0F;
	//  241  477:aload_1         
	//  242  478:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//  243  481:aload_1         
	//  244  482:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  245  485:fadd            
	//  246  486:fconst_1        
	//  247  487:fsub            
	//  248  488:fstore          4
		else
	//* 249  490:goto            497
			f2 = 3.402823E+38F;
	//  250  493:ldc1            #204 <Float 3.402823E+38F>
	//  251  495:fstore          4
		mLastOffset = f2;
	//  252  497:aload_0         
	//  253  498:fload           4
	//  254  500:putfield        #206 <Field float mLastOffset>
		i1 = i - 1;
	//  255  503:iload_2         
	//  256  504:iconst_1        
	//  257  505:isub            
	//  258  506:istore          8
		f2 = f6;
	//  259  508:fload           6
	//  260  510:fstore          4
		while(i1 >= 0) 
	//* 261  512:iload           8
	//* 262  514:iflt            611
		{
			for(iteminfo1 = (ItemInfo)mItems.get(i1); j > iteminfo1.position; j--)
	//* 263  517:aload_0         
	//* 264  518:getfield        #186 <Field ArrayList mItems>
	//* 265  521:iload           8
	//* 266  523:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//* 267  526:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 268  529:astore_3        
	//* 269  530:iload           7
	//* 270  532:aload_3         
	//* 271  533:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 272  536:icmple          565
				f2 -= mAdapter.getPageWidth(j) + f3;
	//  273  539:fload           4
	//  274  541:aload_0         
	//  275  542:getfield        #233 <Field PagerAdapter mAdapter>
	//  276  545:iload           7
	//  277  547:invokevirtual   #264 <Method float PagerAdapter.getPageWidth(int)>
	//  278  550:fload           5
	//  279  552:fadd            
	//  280  553:fsub            
	//  281  554:fstore          4

	//  282  556:iload           7
	//  283  558:iconst_1        
	//  284  559:isub            
	//  285  560:istore          7
	//* 286  562:goto            530
			f2 -= iteminfo1.widthFactor + f3;
	//  287  565:fload           4
	//  288  567:aload_3         
	//  289  568:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  290  571:fload           5
	//  291  573:fadd            
	//  292  574:fsub            
	//  293  575:fstore          4
			iteminfo1.offset = f2;
	//  294  577:aload_3         
	//  295  578:fload           4
	//  296  580:putfield        #250 <Field float ViewPager$ItemInfo.offset>
			if(iteminfo1.position == 0)
	//* 297  583:aload_3         
	//* 298  584:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 299  587:ifne            596
				mFirstOffset = f2;
	//  300  590:aload_0         
	//  301  591:fload           4
	//  302  593:putfield        #203 <Field float mFirstOffset>
			i1--;
	//  303  596:iload           8
	//  304  598:iconst_1        
	//  305  599:isub            
	//  306  600:istore          8
			j--;
	//  307  602:iload           7
	//  308  604:iconst_1        
	//  309  605:isub            
	//  310  606:istore          7
		}
	//* 311  608:goto            512
		f2 = iteminfo.offset + iteminfo.widthFactor + f3;
	//  312  611:aload_1         
	//  313  612:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//  314  615:aload_1         
	//  315  616:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  316  619:fadd            
	//  317  620:fload           5
	//  318  622:fadd            
	//  319  623:fstore          4
		i1 = iteminfo.position + 1;
	//  320  625:aload_1         
	//  321  626:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//  322  629:iconst_1        
	//  323  630:iadd            
	//  324  631:istore          8
		j = i + 1;
	//  325  633:iload_2         
	//  326  634:iconst_1        
	//  327  635:iadd            
	//  328  636:istore          7
		for(i = i1; j < l1; i++)
	//* 329  638:iload           8
	//* 330  640:istore_2        
	//* 331  641:iload           7
	//* 332  643:iload           9
	//* 333  645:icmpge          745
		{
			for(iteminfo = (ItemInfo)mItems.get(j); i < iteminfo.position; i++)
	//* 334  648:aload_0         
	//* 335  649:getfield        #186 <Field ArrayList mItems>
	//* 336  652:iload           7
	//* 337  654:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//* 338  657:checkcast       #17  <Class ViewPager$ItemInfo>
	//* 339  660:astore_1        
	//* 340  661:iload_2         
	//* 341  662:aload_1         
	//* 342  663:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 343  666:icmpge          692
				f2 += mAdapter.getPageWidth(i) + f3;
	//  344  669:fload           4
	//  345  671:aload_0         
	//  346  672:getfield        #233 <Field PagerAdapter mAdapter>
	//  347  675:iload_2         
	//  348  676:invokevirtual   #264 <Method float PagerAdapter.getPageWidth(int)>
	//  349  679:fload           5
	//  350  681:fadd            
	//  351  682:fadd            
	//  352  683:fstore          4

	//  353  685:iload_2         
	//  354  686:iconst_1        
	//  355  687:iadd            
	//  356  688:istore_2        
	//* 357  689:goto            661
			if(iteminfo.position == i2)
	//* 358  692:aload_1         
	//* 359  693:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 360  696:iload           10
	//* 361  698:icmpne          714
				mLastOffset = (iteminfo.widthFactor + f2) - 1.0F;
	//  362  701:aload_0         
	//  363  702:aload_1         
	//  364  703:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  365  706:fload           4
	//  366  708:fadd            
	//  367  709:fconst_1        
	//  368  710:fsub            
	//  369  711:putfield        #206 <Field float mLastOffset>
			iteminfo.offset = f2;
	//  370  714:aload_1         
	//  371  715:fload           4
	//  372  717:putfield        #250 <Field float ViewPager$ItemInfo.offset>
			f2 += iteminfo.widthFactor + f3;
	//  373  720:fload           4
	//  374  722:aload_1         
	//  375  723:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  376  726:fload           5
	//  377  728:fadd            
	//  378  729:fadd            
	//  379  730:fstore          4
			j++;
	//  380  732:iload           7
	//  381  734:iconst_1        
	//  382  735:iadd            
	//  383  736:istore          7
		}

	//  384  738:iload_2         
	//  385  739:iconst_1        
	//  386  740:iadd            
	//  387  741:istore_2        
	//* 388  742:goto            641
		mNeedCalculatePageOffsets = false;
	//  389  745:aload_0         
	//  390  746:iconst_0        
	//  391  747:putfield        #214 <Field boolean mNeedCalculatePageOffsets>
	//  392  750:return          
	}

	private void completeScroll(boolean flag)
	{
		boolean flag1;
		if(mScrollState == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #221 <Field int mScrollState>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          13
			flag1 = true;
	//    4    8:iconst_1        
	//    5    9:istore_2        
		else
	//*   6   10:goto            15
			flag1 = false;
	//    7   13:iconst_0        
	//    8   14:istore_2        
		if(flag1)
	//*   9   15:iload_2         
	//*  10   16:ifeq            106
		{
			setScrollingCacheEnabled(false);
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:invokespecial   #269 <Method void setScrollingCacheEnabled(boolean)>
			if(mScroller.isFinished() ^ true)
	//*  14   24:aload_0         
	//*  15   25:getfield        #271 <Field Scroller mScroller>
	//*  16   28:invokevirtual   #277 <Method boolean Scroller.isFinished()>
	//*  17   31:iconst_1        
	//*  18   32:ixor            
	//*  19   33:ifeq            106
			{
				mScroller.abortAnimation();
	//   20   36:aload_0         
	//   21   37:getfield        #271 <Field Scroller mScroller>
	//   22   40:invokevirtual   #280 <Method void Scroller.abortAnimation()>
				int j = getScrollX();
	//   23   43:aload_0         
	//   24   44:invokevirtual   #283 <Method int getScrollX()>
	//   25   47:istore_3        
				int k = getScrollY();
	//   26   48:aload_0         
	//   27   49:invokevirtual   #286 <Method int getScrollY()>
	//   28   52:istore          4
				int l = mScroller.getCurrX();
	//   29   54:aload_0         
	//   30   55:getfield        #271 <Field Scroller mScroller>
	//   31   58:invokevirtual   #289 <Method int Scroller.getCurrX()>
	//   32   61:istore          5
				int i1 = mScroller.getCurrY();
	//   33   63:aload_0         
	//   34   64:getfield        #271 <Field Scroller mScroller>
	//   35   67:invokevirtual   #292 <Method int Scroller.getCurrY()>
	//   36   70:istore          6
				if(j != l || k != i1)
	//*  37   72:iload_3         
	//*  38   73:iload           5
	//*  39   75:icmpne          85
	//*  40   78:iload           4
	//*  41   80:iload           6
	//*  42   82:icmpeq          106
				{
					scrollTo(l, i1);
	//   43   85:aload_0         
	//   44   86:iload           5
	//   45   88:iload           6
	//   46   90:invokevirtual   #296 <Method void scrollTo(int, int)>
					if(l != j)
	//*  47   93:iload           5
	//*  48   95:iload_3         
	//*  49   96:icmpeq          106
						pageScrolled(l);
	//   50   99:aload_0         
	//   51  100:iload           5
	//   52  102:invokespecial   #300 <Method boolean pageScrolled(int)>
	//   53  105:pop             
				}
			}
		}
		mPopulatePending = false;
	//   54  106:aload_0         
	//   55  107:iconst_0        
	//   56  108:putfield        #302 <Field boolean mPopulatePending>
		boolean flag3 = false;
	//   57  111:iconst_0        
	//   58  112:istore          4
		boolean flag2 = flag1;
	//   59  114:iload_2         
	//   60  115:istore_3        
		for(int i = ((int) (flag3)); i < mItems.size(); i++)
	//*  61  116:iload           4
	//*  62  118:istore_2        
	//*  63  119:iload_2         
	//*  64  120:aload_0         
	//*  65  121:getfield        #186 <Field ArrayList mItems>
	//*  66  124:invokevirtual   #256 <Method int ArrayList.size()>
	//*  67  127:icmpge          166
		{
			ItemInfo iteminfo = (ItemInfo)mItems.get(i);
	//   68  130:aload_0         
	//   69  131:getfield        #186 <Field ArrayList mItems>
	//   70  134:iload_2         
	//   71  135:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   72  138:checkcast       #17  <Class ViewPager$ItemInfo>
	//   73  141:astore          7
			if(iteminfo.scrolling)
	//*  74  143:aload           7
	//*  75  145:getfield        #305 <Field boolean ViewPager$ItemInfo.scrolling>
	//*  76  148:ifeq            159
			{
				iteminfo.scrolling = false;
	//   77  151:aload           7
	//   78  153:iconst_0        
	//   79  154:putfield        #305 <Field boolean ViewPager$ItemInfo.scrolling>
				flag2 = true;
	//   80  157:iconst_1        
	//   81  158:istore_3        
			}
		}

	//   82  159:iload_2         
	//   83  160:iconst_1        
	//   84  161:iadd            
	//   85  162:istore_2        
	//*  86  163:goto            119
		if(flag2)
	//*  87  166:iload_3         
	//*  88  167:ifeq            192
		{
			if(flag)
	//*  89  170:iload_1         
	//*  90  171:ifeq            183
			{
				ViewCompat.postOnAnimation(((View) (this)), mEndScrollRunnable);
	//   91  174:aload_0         
	//   92  175:aload_0         
	//   93  176:getfield        #219 <Field Runnable mEndScrollRunnable>
	//   94  179:invokestatic    #311 <Method void ViewCompat.postOnAnimation(View, Runnable)>
				return;
	//   95  182:return          
			}
			mEndScrollRunnable.run();
	//   96  183:aload_0         
	//   97  184:getfield        #219 <Field Runnable mEndScrollRunnable>
	//   98  187:invokeinterface #316 <Method void Runnable.run()>
		}
	//   99  192:return          
	}

	private int determineTargetPage(int i, float f, int j, int k)
	{
		if(Math.abs(k) > mFlingDistance && Math.abs(j) > mMinimumVelocity)
	//*   0    0:iload           4
	//*   1    2:invokestatic    #324 <Method int Math.abs(int)>
	//*   2    5:aload_0         
	//*   3    6:getfield        #326 <Field int mFlingDistance>
	//*   4    9:icmple          37
	//*   5   12:iload_3         
	//*   6   13:invokestatic    #324 <Method int Math.abs(int)>
	//*   7   16:aload_0         
	//*   8   17:getfield        #328 <Field int mMinimumVelocity>
	//*   9   20:icmple          37
		{
			if(j <= 0)
	//*  10   23:iload_3         
	//*  11   24:ifle            30
	//*  12   27:goto            66
				i++;
	//   13   30:iload_1         
	//   14   31:iconst_1        
	//   15   32:iadd            
	//   16   33:istore_1        
		} else
	//*  17   34:goto            66
		{
			float f1;
			if(i >= mCurItem)
	//*  18   37:iload_1         
	//*  19   38:aload_0         
	//*  20   39:getfield        #330 <Field int mCurItem>
	//*  21   42:icmplt          53
				f1 = 0.4F;
	//   22   45:ldc2            #331 <Float 0.4F>
	//   23   48:fstore          5
			else
	//*  24   50:goto            58
				f1 = 0.6F;
	//   25   53:ldc2            #332 <Float 0.6F>
	//   26   56:fstore          5
			i += (int)(f + f1);
	//   27   58:iload_1         
	//   28   59:fload_2         
	//   29   60:fload           5
	//   30   62:fadd            
	//   31   63:f2i             
	//   32   64:iadd            
	//   33   65:istore_1        
		}
		j = i;
	//   34   66:iload_1         
	//   35   67:istore_3        
		if(mItems.size() > 0)
	//*  36   68:aload_0         
	//*  37   69:getfield        #186 <Field ArrayList mItems>
	//*  38   72:invokevirtual   #256 <Method int ArrayList.size()>
	//*  39   75:ifle            132
		{
			ItemInfo iteminfo = (ItemInfo)mItems.get(0);
	//   40   78:aload_0         
	//   41   79:getfield        #186 <Field ArrayList mItems>
	//   42   82:iconst_0        
	//   43   83:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   44   86:checkcast       #17  <Class ViewPager$ItemInfo>
	//   45   89:astore          6
			Object obj = ((Object) (mItems));
	//   46   91:aload_0         
	//   47   92:getfield        #186 <Field ArrayList mItems>
	//   48   95:astore          7
			obj = ((Object) ((ItemInfo)((ArrayList) (obj)).get(((ArrayList) (obj)).size() - 1)));
	//   49   97:aload           7
	//   50   99:aload           7
	//   51  101:invokevirtual   #256 <Method int ArrayList.size()>
	//   52  104:iconst_1        
	//   53  105:isub            
	//   54  106:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   55  109:checkcast       #17  <Class ViewPager$ItemInfo>
	//   56  112:astore          7
			j = Math.max(iteminfo.position, Math.min(i, ((ItemInfo) (obj)).position));
	//   57  114:aload           6
	//   58  116:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//   59  119:iload_1         
	//   60  120:aload           7
	//   61  122:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//   62  125:invokestatic    #336 <Method int Math.min(int, int)>
	//   63  128:invokestatic    #339 <Method int Math.max(int, int)>
	//   64  131:istore_3        
		}
		return j;
	//   65  132:iload_3         
	//   66  133:ireturn         
	}

	private void dispatchOnPageScrolled(int i, float f, int j)
	{
		Object obj = ((Object) (mOnPageChangeListener));
	//    0    0:aload_0         
	//    1    1:getfield        #343 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
	//    2    4:astore          6
		if(obj != null)
	//*   3    6:aload           6
	//*   4    8:ifnull          21
			((OnPageChangeListener) (obj)).onPageScrolled(i, f, j);
	//    5   11:aload           6
	//    6   13:iload_1         
	//    7   14:fload_2         
	//    8   15:iload_3         
	//    9   16:invokeinterface #346 <Method void ViewPager$OnPageChangeListener.onPageScrolled(int, float, int)>
		obj = ((Object) (mOnPageChangeListeners));
	//   10   21:aload_0         
	//   11   22:getfield        #348 <Field List mOnPageChangeListeners>
	//   12   25:astore          6
		if(obj != null)
	//*  13   27:aload           6
	//*  14   29:ifnull          91
		{
			int k = 0;
	//   15   32:iconst_0        
	//   16   33:istore          4
			for(int l = ((List) (obj)).size(); k < l; k++)
	//*  17   35:aload           6
	//*  18   37:invokeinterface #351 <Method int List.size()>
	//*  19   42:istore          5
	//*  20   44:iload           4
	//*  21   46:iload           5
	//*  22   48:icmpge          91
			{
				obj = ((Object) ((OnPageChangeListener)mOnPageChangeListeners.get(k)));
	//   23   51:aload_0         
	//   24   52:getfield        #348 <Field List mOnPageChangeListeners>
	//   25   55:iload           4
	//   26   57:invokeinterface #352 <Method Object List.get(int)>
	//   27   62:checkcast       #29  <Class ViewPager$OnPageChangeListener>
	//   28   65:astore          6
				if(obj != null)
	//*  29   67:aload           6
	//*  30   69:ifnull          82
					((OnPageChangeListener) (obj)).onPageScrolled(i, f, j);
	//   31   72:aload           6
	//   32   74:iload_1         
	//   33   75:fload_2         
	//   34   76:iload_3         
	//   35   77:invokeinterface #346 <Method void ViewPager$OnPageChangeListener.onPageScrolled(int, float, int)>
			}

	//   36   82:iload           4
	//   37   84:iconst_1        
	//   38   85:iadd            
	//   39   86:istore          4
		}
	//*  40   88:goto            44
		obj = ((Object) (mInternalPageChangeListener));
	//   41   91:aload_0         
	//   42   92:getfield        #354 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
	//   43   95:astore          6
		if(obj != null)
	//*  44   97:aload           6
	//*  45   99:ifnull          112
			((OnPageChangeListener) (obj)).onPageScrolled(i, f, j);
	//   46  102:aload           6
	//   47  104:iload_1         
	//   48  105:fload_2         
	//   49  106:iload_3         
	//   50  107:invokeinterface #346 <Method void ViewPager$OnPageChangeListener.onPageScrolled(int, float, int)>
	//   51  112:return          
	}

	private void dispatchOnPageSelected(int i)
	{
		Object obj = ((Object) (mOnPageChangeListener));
	//    0    0:aload_0         
	//    1    1:getfield        #343 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
	//    2    4:astore          4
		if(obj != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          19
			((OnPageChangeListener) (obj)).onPageSelected(i);
	//    5   11:aload           4
	//    6   13:iload_1         
	//    7   14:invokeinterface #359 <Method void ViewPager$OnPageChangeListener.onPageSelected(int)>
		obj = ((Object) (mOnPageChangeListeners));
	//    8   19:aload_0         
	//    9   20:getfield        #348 <Field List mOnPageChangeListeners>
	//   10   23:astore          4
		if(obj != null)
	//*  11   25:aload           4
	//*  12   27:ifnull          80
		{
			int j = 0;
	//   13   30:iconst_0        
	//   14   31:istore_2        
			for(int k = ((List) (obj)).size(); j < k; j++)
	//*  15   32:aload           4
	//*  16   34:invokeinterface #351 <Method int List.size()>
	//*  17   39:istore_3        
	//*  18   40:iload_2         
	//*  19   41:iload_3         
	//*  20   42:icmpge          80
			{
				obj = ((Object) ((OnPageChangeListener)mOnPageChangeListeners.get(j)));
	//   21   45:aload_0         
	//   22   46:getfield        #348 <Field List mOnPageChangeListeners>
	//   23   49:iload_2         
	//   24   50:invokeinterface #352 <Method Object List.get(int)>
	//   25   55:checkcast       #29  <Class ViewPager$OnPageChangeListener>
	//   26   58:astore          4
				if(obj != null)
	//*  27   60:aload           4
	//*  28   62:ifnull          73
					((OnPageChangeListener) (obj)).onPageSelected(i);
	//   29   65:aload           4
	//   30   67:iload_1         
	//   31   68:invokeinterface #359 <Method void ViewPager$OnPageChangeListener.onPageSelected(int)>
			}

	//   32   73:iload_2         
	//   33   74:iconst_1        
	//   34   75:iadd            
	//   35   76:istore_2        
		}
	//*  36   77:goto            40
		obj = ((Object) (mInternalPageChangeListener));
	//   37   80:aload_0         
	//   38   81:getfield        #354 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
	//   39   84:astore          4
		if(obj != null)
	//*  40   86:aload           4
	//*  41   88:ifnull          99
			((OnPageChangeListener) (obj)).onPageSelected(i);
	//   42   91:aload           4
	//   43   93:iload_1         
	//   44   94:invokeinterface #359 <Method void ViewPager$OnPageChangeListener.onPageSelected(int)>
	//   45   99:return          
	}

	private void dispatchOnScrollStateChanged(int i)
	{
		Object obj = ((Object) (mOnPageChangeListener));
	//    0    0:aload_0         
	//    1    1:getfield        #343 <Field ViewPager$OnPageChangeListener mOnPageChangeListener>
	//    2    4:astore          4
		if(obj != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          19
			((OnPageChangeListener) (obj)).onPageScrollStateChanged(i);
	//    5   11:aload           4
	//    6   13:iload_1         
	//    7   14:invokeinterface #363 <Method void ViewPager$OnPageChangeListener.onPageScrollStateChanged(int)>
		obj = ((Object) (mOnPageChangeListeners));
	//    8   19:aload_0         
	//    9   20:getfield        #348 <Field List mOnPageChangeListeners>
	//   10   23:astore          4
		if(obj != null)
	//*  11   25:aload           4
	//*  12   27:ifnull          80
		{
			int j = 0;
	//   13   30:iconst_0        
	//   14   31:istore_2        
			for(int k = ((List) (obj)).size(); j < k; j++)
	//*  15   32:aload           4
	//*  16   34:invokeinterface #351 <Method int List.size()>
	//*  17   39:istore_3        
	//*  18   40:iload_2         
	//*  19   41:iload_3         
	//*  20   42:icmpge          80
			{
				obj = ((Object) ((OnPageChangeListener)mOnPageChangeListeners.get(j)));
	//   21   45:aload_0         
	//   22   46:getfield        #348 <Field List mOnPageChangeListeners>
	//   23   49:iload_2         
	//   24   50:invokeinterface #352 <Method Object List.get(int)>
	//   25   55:checkcast       #29  <Class ViewPager$OnPageChangeListener>
	//   26   58:astore          4
				if(obj != null)
	//*  27   60:aload           4
	//*  28   62:ifnull          73
					((OnPageChangeListener) (obj)).onPageScrollStateChanged(i);
	//   29   65:aload           4
	//   30   67:iload_1         
	//   31   68:invokeinterface #363 <Method void ViewPager$OnPageChangeListener.onPageScrollStateChanged(int)>
			}

	//   32   73:iload_2         
	//   33   74:iconst_1        
	//   34   75:iadd            
	//   35   76:istore_2        
		}
	//*  36   77:goto            40
		obj = ((Object) (mInternalPageChangeListener));
	//   37   80:aload_0         
	//   38   81:getfield        #354 <Field ViewPager$OnPageChangeListener mInternalPageChangeListener>
	//   39   84:astore          4
		if(obj != null)
	//*  40   86:aload           4
	//*  41   88:ifnull          99
			((OnPageChangeListener) (obj)).onPageScrollStateChanged(i);
	//   42   91:aload           4
	//   43   93:iload_1         
	//   44   94:invokeinterface #363 <Method void ViewPager$OnPageChangeListener.onPageScrollStateChanged(int)>
	//   45   99:return          
	}

	private void enableLayers(boolean flag)
	{
		int k = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #367 <Method int getChildCount()>
	//    2    4:istore          4
		for(int i = 0; i < k; i++)
	//*   3    6:iconst_0        
	//*   4    7:istore_2        
	//*   5    8:iload_2         
	//*   6    9:iload           4
	//*   7   11:icmpge          45
		{
			int j;
			if(flag)
	//*   8   14:iload_1         
	//*   9   15:ifeq            26
				j = mPageTransformerLayerType;
	//   10   18:aload_0         
	//   11   19:getfield        #369 <Field int mPageTransformerLayerType>
	//   12   22:istore_3        
			else
	//*  13   23:goto            28
				j = 0;
	//   14   26:iconst_0        
	//   15   27:istore_3        
			getChildAt(i).setLayerType(j, ((android.graphics.Paint) (null)));
	//   16   28:aload_0         
	//   17   29:iload_2         
	//   18   30:invokevirtual   #373 <Method View getChildAt(int)>
	//   19   33:iload_3         
	//   20   34:aconst_null     
	//   21   35:invokevirtual   #379 <Method void View.setLayerType(int, android.graphics.Paint)>
		}

	//   22   38:iload_2         
	//   23   39:iconst_1        
	//   24   40:iadd            
	//   25   41:istore_2        
	//*  26   42:goto            8
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
		VelocityTracker velocitytracker = mVelocityTracker;
	//    6   10:aload_0         
	//    7   11:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//    8   14:astore_1        
		if(velocitytracker != null)
	//*   9   15:aload_1         
	//*  10   16:ifnull          28
		{
			velocitytracker.recycle();
	//   11   19:aload_1         
	//   12   20:invokevirtual   #391 <Method void VelocityTracker.recycle()>
			mVelocityTracker = null;
	//   13   23:aload_0         
	//   14   24:aconst_null     
	//   15   25:putfield        #386 <Field VelocityTracker mVelocityTracker>
		}
	//   16   28:return          
	}

	private Rect getChildRectInPagerCoordinates(Rect rect, View view)
	{
		Rect rect1 = rect;
	//    0    0:aload_1         
	//    1    1:astore_3        
		if(rect == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       14
			rect1 = new Rect();
	//    4    6:new             #191 <Class Rect>
	//    5    9:dup             
	//    6   10:invokespecial   #192 <Method void Rect()>
	//    7   13:astore_3        
		if(view == null)
	//*   8   14:aload_2         
	//*   9   15:ifnonnull       28
		{
			rect1.set(0, 0, 0, 0);
	//   10   18:aload_3         
	//   11   19:iconst_0        
	//   12   20:iconst_0        
	//   13   21:iconst_0        
	//   14   22:iconst_0        
	//   15   23:invokevirtual   #397 <Method void Rect.set(int, int, int, int)>
			return rect1;
	//   16   26:aload_3         
	//   17   27:areturn         
		}
		rect1.left = view.getLeft();
	//   18   28:aload_3         
	//   19   29:aload_2         
	//   20   30:invokevirtual   #400 <Method int View.getLeft()>
	//   21   33:putfield        #403 <Field int Rect.left>
		rect1.right = view.getRight();
	//   22   36:aload_3         
	//   23   37:aload_2         
	//   24   38:invokevirtual   #406 <Method int View.getRight()>
	//   25   41:putfield        #409 <Field int Rect.right>
		rect1.top = view.getTop();
	//   26   44:aload_3         
	//   27   45:aload_2         
	//   28   46:invokevirtual   #412 <Method int View.getTop()>
	//   29   49:putfield        #415 <Field int Rect.top>
		rect1.bottom = view.getBottom();
	//   30   52:aload_3         
	//   31   53:aload_2         
	//   32   54:invokevirtual   #418 <Method int View.getBottom()>
	//   33   57:putfield        #421 <Field int Rect.bottom>
		for(rect = ((Rect) (view.getParent())); (rect instanceof ViewGroup) && rect != this; rect = ((Rect) (((ViewGroup) (rect)).getParent())))
	//*  34   60:aload_2         
	//*  35   61:invokevirtual   #425 <Method ViewParent View.getParent()>
	//*  36   64:astore_1        
	//*  37   65:aload_1         
	//*  38   66:instanceof      #4   <Class ViewGroup>
	//*  39   69:ifeq            142
	//*  40   72:aload_1         
	//*  41   73:aload_0         
	//*  42   74:if_acmpeq       142
		{
			rect = ((Rect) ((ViewGroup)rect));
	//   43   77:aload_1         
	//   44   78:checkcast       #4   <Class ViewGroup>
	//   45   81:astore_1        
			rect1.left = rect1.left + ((ViewGroup) (rect)).getLeft();
	//   46   82:aload_3         
	//   47   83:aload_3         
	//   48   84:getfield        #403 <Field int Rect.left>
	//   49   87:aload_1         
	//   50   88:invokevirtual   #426 <Method int ViewGroup.getLeft()>
	//   51   91:iadd            
	//   52   92:putfield        #403 <Field int Rect.left>
			rect1.right = rect1.right + ((ViewGroup) (rect)).getRight();
	//   53   95:aload_3         
	//   54   96:aload_3         
	//   55   97:getfield        #409 <Field int Rect.right>
	//   56  100:aload_1         
	//   57  101:invokevirtual   #427 <Method int ViewGroup.getRight()>
	//   58  104:iadd            
	//   59  105:putfield        #409 <Field int Rect.right>
			rect1.top = rect1.top + ((ViewGroup) (rect)).getTop();
	//   60  108:aload_3         
	//   61  109:aload_3         
	//   62  110:getfield        #415 <Field int Rect.top>
	//   63  113:aload_1         
	//   64  114:invokevirtual   #428 <Method int ViewGroup.getTop()>
	//   65  117:iadd            
	//   66  118:putfield        #415 <Field int Rect.top>
			rect1.bottom = rect1.bottom + ((ViewGroup) (rect)).getBottom();
	//   67  121:aload_3         
	//   68  122:aload_3         
	//   69  123:getfield        #421 <Field int Rect.bottom>
	//   70  126:aload_1         
	//   71  127:invokevirtual   #429 <Method int ViewGroup.getBottom()>
	//   72  130:iadd            
	//   73  131:putfield        #421 <Field int Rect.bottom>
		}

	//   74  134:aload_1         
	//   75  135:invokevirtual   #430 <Method ViewParent ViewGroup.getParent()>
	//   76  138:astore_1        
	//*  77  139:goto            65
		return rect1;
	//   78  142:aload_3         
	//   79  143:areturn         
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
		if(i > 0)
	//*   3    6:iload           5
	//*   4    8:ifle            24
			f = (float)getScrollX() / (float)i;
	//    5   11:aload_0         
	//    6   12:invokevirtual   #283 <Method int getScrollX()>
	//    7   15:i2f             
	//    8   16:iload           5
	//    9   18:i2f             
	//   10   19:fdiv            
	//   11   20:fstore_1        
		else
	//*  12   21:goto            26
			f = 0.0F;
	//   13   24:fconst_0        
	//   14   25:fstore_1        
		float f1;
		if(i > 0)
	//*  15   26:iload           5
	//*  16   28:ifle            44
			f1 = (float)mPageMargin / (float)i;
	//   17   31:aload_0         
	//   18   32:getfield        #244 <Field int mPageMargin>
	//   19   35:i2f             
	//   20   36:iload           5
	//   21   38:i2f             
	//   22   39:fdiv            
	//   23   40:fstore_2        
		else
	//*  24   41:goto            46
			f1 = 0.0F;
	//   25   44:fconst_0        
	//   26   45:fstore_2        
		ItemInfo iteminfo1 = null;
	//   27   46:aconst_null     
	//   28   47:astore          11
		i = 0;
	//   29   49:iconst_0        
	//   30   50:istore          5
		boolean flag = true;
	//   31   52:iconst_1        
	//   32   53:istore          6
		int j = -1;
	//   33   55:iconst_m1       
	//   34   56:istore          7
		float f2 = 0.0F;
	//   35   58:fconst_0        
	//   36   59:fstore_3        
		float f3 = 0.0F;
	//   37   60:fconst_0        
	//   38   61:fstore          4
		while(i < mItems.size()) 
	//*  39   63:iload           5
	//*  40   65:aload_0         
	//*  41   66:getfield        #186 <Field ArrayList mItems>
	//*  42   69:invokevirtual   #256 <Method int ArrayList.size()>
	//*  43   72:icmpge          268
		{
			ItemInfo iteminfo2 = (ItemInfo)mItems.get(i);
	//   44   75:aload_0         
	//   45   76:getfield        #186 <Field ArrayList mItems>
	//   46   79:iload           5
	//   47   81:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   48   84:checkcast       #17  <Class ViewPager$ItemInfo>
	//   49   87:astore          12
			int k = i;
	//   50   89:iload           5
	//   51   91:istore          8
			ItemInfo iteminfo = iteminfo2;
	//   52   93:aload           12
	//   53   95:astore          10
			if(!flag)
	//*  54   97:iload           6
	//*  55   99:ifne            177
			{
				int l = iteminfo2.position;
	//   56  102:aload           12
	//   57  104:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//   58  107:istore          9
				j++;
	//   59  109:iload           7
	//   60  111:iconst_1        
	//   61  112:iadd            
	//   62  113:istore          7
				k = i;
	//   63  115:iload           5
	//   64  117:istore          8
				iteminfo = iteminfo2;
	//   65  119:aload           12
	//   66  121:astore          10
				if(l != j)
	//*  67  123:iload           9
	//*  68  125:iload           7
	//*  69  127:icmpeq          177
				{
					iteminfo = mTempItem;
	//   70  130:aload_0         
	//   71  131:getfield        #189 <Field ViewPager$ItemInfo mTempItem>
	//   72  134:astore          10
					iteminfo.offset = f2 + f3 + f1;
	//   73  136:aload           10
	//   74  138:fload_3         
	//   75  139:fload           4
	//   76  141:fadd            
	//   77  142:fload_2         
	//   78  143:fadd            
	//   79  144:putfield        #250 <Field float ViewPager$ItemInfo.offset>
					iteminfo.position = j;
	//   80  147:aload           10
	//   81  149:iload           7
	//   82  151:putfield        #247 <Field int ViewPager$ItemInfo.position>
					iteminfo.widthFactor = mAdapter.getPageWidth(iteminfo.position);
	//   83  154:aload           10
	//   84  156:aload_0         
	//   85  157:getfield        #233 <Field PagerAdapter mAdapter>
	//   86  160:aload           10
	//   87  162:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//   88  165:invokevirtual   #264 <Method float PagerAdapter.getPageWidth(int)>
	//   89  168:putfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
					k = i - 1;
	//   90  171:iload           5
	//   91  173:iconst_1        
	//   92  174:isub            
	//   93  175:istore          8
				}
			}
			f2 = iteminfo.offset;
	//   94  177:aload           10
	//   95  179:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   96  182:fstore_3        
			f3 = iteminfo.widthFactor;
	//   97  183:aload           10
	//   98  185:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//   99  188:fstore          4
			if(!flag && f < f2)
	//* 100  190:iload           6
	//* 101  192:ifne            207
	//* 102  195:fload_1         
	//* 103  196:fload_3         
	//* 104  197:fcmpl           
	//* 105  198:iflt            204
	//* 106  201:goto            207
				return iteminfo1;
	//  107  204:aload           11
	//  108  206:areturn         
			if(f >= f3 + f2 + f1)
	//* 109  207:fload_1         
	//* 110  208:fload           4
	//* 111  210:fload_3         
	//* 112  211:fadd            
	//* 113  212:fload_2         
	//* 114  213:fadd            
	//* 115  214:fcmpg           
	//* 116  215:iflt            265
			{
				if(k == mItems.size() - 1)
	//* 117  218:iload           8
	//* 118  220:aload_0         
	//* 119  221:getfield        #186 <Field ArrayList mItems>
	//* 120  224:invokevirtual   #256 <Method int ArrayList.size()>
	//* 121  227:iconst_1        
	//* 122  228:isub            
	//* 123  229:icmpne          235
					return iteminfo;
	//  124  232:aload           10
	//  125  234:areturn         
				j = iteminfo.position;
	//  126  235:aload           10
	//  127  237:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//  128  240:istore          7
				f3 = iteminfo.widthFactor;
	//  129  242:aload           10
	//  130  244:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  131  247:fstore          4
				i = k + 1;
	//  132  249:iload           8
	//  133  251:iconst_1        
	//  134  252:iadd            
	//  135  253:istore          5
				flag = false;
	//  136  255:iconst_0        
	//  137  256:istore          6
				iteminfo1 = iteminfo;
	//  138  258:aload           10
	//  139  260:astore          11
			} else
	//* 140  262:goto            63
			{
				return iteminfo;
	//  141  265:aload           10
	//  142  267:areturn         
			}
		}
		return iteminfo1;
	//  143  268:aload           11
	//  144  270:areturn         
	}

	private static boolean isDecorView(View view)
	{
		return ((Object) (view)).getClass().getAnnotation(android/support/v4/view/ViewPager$DecorView) != null;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #449 <Method Class Object.getClass()>
	//    2    4:ldc1            #14  <Class ViewPager$DecorView>
	//    3    6:invokevirtual   #455 <Method Annotation Class.getAnnotation(Class)>
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
	//    2    2:getfield        #459 <Field int mGutterSize>
	//    3    5:i2f             
	//    4    6:fcmpg           
	//    5    7:ifge            16
	//    6   10:fload_2         
	//    7   11:fconst_0        
	//    8   12:fcmpl           
	//    9   13:ifgt            37
	//   10   16:fload_1         
	//   11   17:aload_0         
	//   12   18:invokevirtual   #462 <Method int getWidth()>
	//   13   21:aload_0         
	//   14   22:getfield        #459 <Field int mGutterSize>
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
	//    1    1:invokevirtual   #469 <Method int MotionEvent.getActionIndex()>
	//    2    4:istore_2        
		if(motionevent.getPointerId(i) == mActivePointerId)
	//*   3    5:aload_1         
	//*   4    6:iload_2         
	//*   5    7:invokevirtual   #472 <Method int MotionEvent.getPointerId(int)>
	//*   6   10:aload_0         
	//*   7   11:getfield        #210 <Field int mActivePointerId>
	//*   8   14:icmpne          59
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
			mLastMotionX = motionevent.getX(i);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:iload_2         
	//   19   31:invokevirtual   #475 <Method float MotionEvent.getX(int)>
	//   20   34:putfield        #477 <Field float mLastMotionX>
			mActivePointerId = motionevent.getPointerId(i);
	//   21   37:aload_0         
	//   22   38:aload_1         
	//   23   39:iload_2         
	//   24   40:invokevirtual   #472 <Method int MotionEvent.getPointerId(int)>
	//   25   43:putfield        #210 <Field int mActivePointerId>
			motionevent = ((MotionEvent) (mVelocityTracker));
	//   26   46:aload_0         
	//   27   47:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//   28   50:astore_1        
			if(motionevent != null)
	//*  29   51:aload_1         
	//*  30   52:ifnull          59
				((VelocityTracker) (motionevent)).clear();
	//   31   55:aload_1         
	//   32   56:invokevirtual   #480 <Method void VelocityTracker.clear()>
		}
	//   33   59:return          
	}

	private boolean pageScrolled(int i)
	{
		if(mItems.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #186 <Field ArrayList mItems>
	//*   2    4:invokevirtual   #256 <Method int ArrayList.size()>
	//*   3    7:ifne            51
		{
			if(mFirstLayout)
	//*   4   10:aload_0         
	//*   5   11:getfield        #212 <Field boolean mFirstLayout>
	//*   6   14:ifeq            19
				return false;
	//    7   17:iconst_0        
	//    8   18:ireturn         
			mCalledSuper = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #482 <Field boolean mCalledSuper>
			onPageScrolled(0, 0.0F, 0);
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:fconst_0        
	//   15   27:iconst_0        
	//   16   28:invokevirtual   #483 <Method void onPageScrolled(int, float, int)>
			if(mCalledSuper)
	//*  17   31:aload_0         
	//*  18   32:getfield        #482 <Field boolean mCalledSuper>
	//*  19   35:ifeq            40
				return false;
	//   20   38:iconst_0        
	//   21   39:ireturn         
			else
				throw new IllegalStateException("onPageScrolled did not call superclass implementation");
	//   22   40:new             #485 <Class IllegalStateException>
	//   23   43:dup             
	//   24   44:ldc2            #487 <String "onPageScrolled did not call superclass implementation">
	//   25   47:invokespecial   #490 <Method void IllegalStateException(String)>
	//   26   50:athrow          
		}
		ItemInfo iteminfo = infoForCurrentScrollPosition();
	//   27   51:aload_0         
	//   28   52:invokespecial   #492 <Method ViewPager$ItemInfo infoForCurrentScrollPosition()>
	//   29   55:astore          7
		int k = getClientWidth();
	//   30   57:aload_0         
	//   31   58:invokespecial   #242 <Method int getClientWidth()>
	//   32   61:istore          5
		int l = mPageMargin;
	//   33   63:aload_0         
	//   34   64:getfield        #244 <Field int mPageMargin>
	//   35   67:istore          6
		float f1 = l;
	//   36   69:iload           6
	//   37   71:i2f             
	//   38   72:fstore_3        
		float f = k;
	//   39   73:iload           5
	//   40   75:i2f             
	//   41   76:fstore_2        
		f1 /= f;
	//   42   77:fload_3         
	//   43   78:fload_2         
	//   44   79:fdiv            
	//   45   80:fstore_3        
		int j = iteminfo.position;
	//   46   81:aload           7
	//   47   83:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//   48   86:istore          4
		f = ((float)i / f - iteminfo.offset) / (iteminfo.widthFactor + f1);
	//   49   88:iload_1         
	//   50   89:i2f             
	//   51   90:fload_2         
	//   52   91:fdiv            
	//   53   92:aload           7
	//   54   94:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   55   97:fsub            
	//   56   98:aload           7
	//   57  100:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//   58  103:fload_3         
	//   59  104:fadd            
	//   60  105:fdiv            
	//   61  106:fstore_2        
		i = (int)((float)(k + l) * f);
	//   62  107:iload           5
	//   63  109:iload           6
	//   64  111:iadd            
	//   65  112:i2f             
	//   66  113:fload_2         
	//   67  114:fmul            
	//   68  115:f2i             
	//   69  116:istore_1        
		mCalledSuper = false;
	//   70  117:aload_0         
	//   71  118:iconst_0        
	//   72  119:putfield        #482 <Field boolean mCalledSuper>
		onPageScrolled(j, f, i);
	//   73  122:aload_0         
	//   74  123:iload           4
	//   75  125:fload_2         
	//   76  126:iload_1         
	//   77  127:invokevirtual   #483 <Method void onPageScrolled(int, float, int)>
		if(mCalledSuper)
	//*  78  130:aload_0         
	//*  79  131:getfield        #482 <Field boolean mCalledSuper>
	//*  80  134:ifeq            139
			return true;
	//   81  137:iconst_1        
	//   82  138:ireturn         
		else
			throw new IllegalStateException("onPageScrolled did not call superclass implementation");
	//   83  139:new             #485 <Class IllegalStateException>
	//   84  142:dup             
	//   85  143:ldc2            #487 <String "onPageScrolled did not call superclass implementation">
	//   86  146:invokespecial   #490 <Method void IllegalStateException(String)>
	//   87  149:athrow          
	}

	private boolean performDrag(float f)
	{
		float f1 = mLastMotionX;
	//    0    0:aload_0         
	//    1    1:getfield        #477 <Field float mLastMotionX>
	//    2    4:fstore_2        
		mLastMotionX = f;
	//    3    5:aload_0         
	//    4    6:fload_1         
	//    5    7:putfield        #477 <Field float mLastMotionX>
		float f2 = (float)getScrollX() + (f1 - f);
	//    6   10:aload_0         
	//    7   11:invokevirtual   #283 <Method int getScrollX()>
	//    8   14:i2f             
	//    9   15:fload_2         
	//   10   16:fload_1         
	//   11   17:fsub            
	//   12   18:fadd            
	//   13   19:fstore_3        
		float f3 = getClientWidth();
	//   14   20:aload_0         
	//   15   21:invokespecial   #242 <Method int getClientWidth()>
	//   16   24:i2f             
	//   17   25:fstore          4
		f = mFirstOffset * f3;
	//   18   27:aload_0         
	//   19   28:getfield        #203 <Field float mFirstOffset>
	//   20   31:fload           4
	//   21   33:fmul            
	//   22   34:fstore_1        
		f1 = mLastOffset * f3;
	//   23   35:aload_0         
	//   24   36:getfield        #206 <Field float mLastOffset>
	//   25   39:fload           4
	//   26   41:fmul            
	//   27   42:fstore_2        
		Object obj = ((Object) (mItems));
	//   28   43:aload_0         
	//   29   44:getfield        #186 <Field ArrayList mItems>
	//   30   47:astore          10
		boolean flag3 = false;
	//   31   49:iconst_0        
	//   32   50:istore          8
		boolean flag4 = false;
	//   33   52:iconst_0        
	//   34   53:istore          9
		boolean flag2 = false;
	//   35   55:iconst_0        
	//   36   56:istore          7
		obj = ((Object) ((ItemInfo)((ArrayList) (obj)).get(0)));
	//   37   58:aload           10
	//   38   60:iconst_0        
	//   39   61:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   40   64:checkcast       #17  <Class ViewPager$ItemInfo>
	//   41   67:astore          10
		Object obj1 = ((Object) (mItems));
	//   42   69:aload_0         
	//   43   70:getfield        #186 <Field ArrayList mItems>
	//   44   73:astore          11
		obj1 = ((Object) ((ItemInfo)((ArrayList) (obj1)).get(((ArrayList) (obj1)).size() - 1)));
	//   45   75:aload           11
	//   46   77:aload           11
	//   47   79:invokevirtual   #256 <Method int ArrayList.size()>
	//   48   82:iconst_1        
	//   49   83:isub            
	//   50   84:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   51   87:checkcast       #17  <Class ViewPager$ItemInfo>
	//   52   90:astore          11
		boolean flag;
		if(((ItemInfo) (obj)).position != 0)
	//*  53   92:aload           10
	//*  54   94:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  55   97:ifeq            115
		{
			f = ((ItemInfo) (obj)).offset * f3;
	//   56  100:aload           10
	//   57  102:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   58  105:fload           4
	//   59  107:fmul            
	//   60  108:fstore_1        
			flag = false;
	//   61  109:iconst_0        
	//   62  110:istore          5
		} else
	//*  63  112:goto            118
		{
			flag = true;
	//   64  115:iconst_1        
	//   65  116:istore          5
		}
		boolean flag1;
		if(((ItemInfo) (obj1)).position != mAdapter.getCount() - 1)
	//*  66  118:aload           11
	//*  67  120:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  68  123:aload_0         
	//*  69  124:getfield        #233 <Field PagerAdapter mAdapter>
	//*  70  127:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//*  71  130:iconst_1        
	//*  72  131:isub            
	//*  73  132:icmpeq          150
		{
			f1 = ((ItemInfo) (obj1)).offset * f3;
	//   74  135:aload           11
	//   75  137:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   76  140:fload           4
	//   77  142:fmul            
	//   78  143:fstore_2        
			flag1 = false;
	//   79  144:iconst_0        
	//   80  145:istore          6
		} else
	//*  81  147:goto            153
		{
			flag1 = true;
	//   82  150:iconst_1        
	//   83  151:istore          6
		}
		if(f2 < f)
	//*  84  153:fload_3         
	//*  85  154:fload_1         
	//*  86  155:fcmpg           
	//*  87  156:ifge            186
		{
			if(flag)
	//*  88  159:iload           5
	//*  89  161:ifeq            183
			{
				mLeftEdge.onPull(Math.abs(f - f2) / f3);
	//   90  164:aload_0         
	//   91  165:getfield        #496 <Field EdgeEffect mLeftEdge>
	//   92  168:fload_1         
	//   93  169:fload_3         
	//   94  170:fsub            
	//   95  171:invokestatic    #499 <Method float Math.abs(float)>
	//   96  174:fload           4
	//   97  176:fdiv            
	//   98  177:invokevirtual   #505 <Method void EdgeEffect.onPull(float)>
				flag2 = true;
	//   99  180:iconst_1        
	//  100  181:istore          7
			}
		} else
	//* 101  183:goto            228
		{
			flag2 = flag4;
	//  102  186:iload           9
	//  103  188:istore          7
			f = f2;
	//  104  190:fload_3         
	//  105  191:fstore_1        
			if(f2 > f1)
	//* 106  192:fload_3         
	//* 107  193:fload_2         
	//* 108  194:fcmpl           
	//* 109  195:ifle            228
			{
				flag2 = flag3;
	//  110  198:iload           8
	//  111  200:istore          7
				if(flag1)
	//* 112  202:iload           6
	//* 113  204:ifeq            226
				{
					mRightEdge.onPull(Math.abs(f2 - f1) / f3);
	//  114  207:aload_0         
	//  115  208:getfield        #507 <Field EdgeEffect mRightEdge>
	//  116  211:fload_3         
	//  117  212:fload_2         
	//  118  213:fsub            
	//  119  214:invokestatic    #499 <Method float Math.abs(float)>
	//  120  217:fload           4
	//  121  219:fdiv            
	//  122  220:invokevirtual   #505 <Method void EdgeEffect.onPull(float)>
					flag2 = true;
	//  123  223:iconst_1        
	//  124  224:istore          7
				}
				f = f1;
	//  125  226:fload_2         
	//  126  227:fstore_1        
			}
		}
		f1 = mLastMotionX;
	//  127  228:aload_0         
	//  128  229:getfield        #477 <Field float mLastMotionX>
	//  129  232:fstore_2        
		int i = (int)f;
	//  130  233:fload_1         
	//  131  234:f2i             
	//  132  235:istore          5
		mLastMotionX = f1 + (f - (float)i);
	//  133  237:aload_0         
	//  134  238:fload_2         
	//  135  239:fload_1         
	//  136  240:iload           5
	//  137  242:i2f             
	//  138  243:fsub            
	//  139  244:fadd            
	//  140  245:putfield        #477 <Field float mLastMotionX>
		scrollTo(i, getScrollY());
	//  141  248:aload_0         
	//  142  249:iload           5
	//  143  251:aload_0         
	//  144  252:invokevirtual   #286 <Method int getScrollY()>
	//  145  255:invokevirtual   #296 <Method void scrollTo(int, int)>
		pageScrolled(i);
	//  146  258:aload_0         
	//  147  259:iload           5
	//  148  261:invokespecial   #300 <Method boolean pageScrolled(int)>
	//  149  264:pop             
		return flag2;
	//  150  265:iload           7
	//  151  267:ireturn         
	}

	private void recomputeScrollPosition(int i, int j, int k, int l)
	{
		if(j > 0 && !mItems.isEmpty())
	//*   0    0:iload_2         
	//*   1    1:ifle            103
	//*   2    4:aload_0         
	//*   3    5:getfield        #186 <Field ArrayList mItems>
	//*   4    8:invokevirtual   #511 <Method boolean ArrayList.isEmpty()>
	//*   5   11:ifne            103
			if(!mScroller.isFinished())
	//*   6   14:aload_0         
	//*   7   15:getfield        #271 <Field Scroller mScroller>
	//*   8   18:invokevirtual   #277 <Method boolean Scroller.isFinished()>
	//*   9   21:ifne            41
			{
				mScroller.setFinalX(getCurrentItem() * getClientWidth());
	//   10   24:aload_0         
	//   11   25:getfield        #271 <Field Scroller mScroller>
	//   12   28:aload_0         
	//   13   29:invokevirtual   #514 <Method int getCurrentItem()>
	//   14   32:aload_0         
	//   15   33:invokespecial   #242 <Method int getClientWidth()>
	//   16   36:imul            
	//   17   37:invokevirtual   #517 <Method void Scroller.setFinalX(int)>
				return;
	//   18   40:return          
			} else
			{
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
				scrollTo((int)(((float)getScrollX() / (float)((j - k1 - l1) + l)) * (float)((i - i1 - j1) + k)), getScrollY());
	//   31   65:aload_0         
	//   32   66:aload_0         
	//   33   67:invokevirtual   #283 <Method int getScrollX()>
	//   34   70:i2f             
	//   35   71:iload_2         
	//   36   72:iload           8
	//   37   74:isub            
	//   38   75:iload           9
	//   39   77:isub            
	//   40   78:iload           4
	//   41   80:iadd            
	//   42   81:i2f             
	//   43   82:fdiv            
	//   44   83:iload_1         
	//   45   84:iload           6
	//   46   86:isub            
	//   47   87:iload           7
	//   48   89:isub            
	//   49   90:iload_3         
	//   50   91:iadd            
	//   51   92:i2f             
	//   52   93:fmul            
	//   53   94:f2i             
	//   54   95:aload_0         
	//   55   96:invokevirtual   #286 <Method int getScrollY()>
	//   56   99:invokevirtual   #296 <Method void scrollTo(int, int)>
				return;
	//   57  102:return          
			}
		ItemInfo iteminfo = infoForPosition(mCurItem);
	//   58  103:aload_0         
	//   59  104:aload_0         
	//   60  105:getfield        #330 <Field int mCurItem>
	//   61  108:invokevirtual   #521 <Method ViewPager$ItemInfo infoForPosition(int)>
	//   62  111:astore          10
		float f;
		if(iteminfo != null)
	//*  63  113:aload           10
	//*  64  115:ifnull          135
			f = Math.min(iteminfo.offset, mLastOffset);
	//   65  118:aload           10
	//   66  120:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   67  123:aload_0         
	//   68  124:getfield        #206 <Field float mLastOffset>
	//   69  127:invokestatic    #524 <Method float Math.min(float, float)>
	//   70  130:fstore          5
		else
	//*  71  132:goto            138
			f = 0.0F;
	//   72  135:fconst_0        
	//   73  136:fstore          5
		i = (int)(f * (float)(i - getPaddingLeft() - getPaddingRight()));
	//   74  138:fload           5
	//   75  140:iload_1         
	//   76  141:aload_0         
	//   77  142:invokevirtual   #436 <Method int getPaddingLeft()>
	//   78  145:isub            
	//   79  146:aload_0         
	//   80  147:invokevirtual   #439 <Method int getPaddingRight()>
	//   81  150:isub            
	//   82  151:i2f             
	//   83  152:fmul            
	//   84  153:f2i             
	//   85  154:istore_1        
		if(i != getScrollX())
	//*  86  155:iload_1         
	//*  87  156:aload_0         
	//*  88  157:invokevirtual   #283 <Method int getScrollX()>
	//*  89  160:icmpeq          177
		{
			completeScroll(false);
	//   90  163:aload_0         
	//   91  164:iconst_0        
	//   92  165:invokespecial   #526 <Method void completeScroll(boolean)>
			scrollTo(i, getScrollY());
	//   93  168:aload_0         
	//   94  169:iload_1         
	//   95  170:aload_0         
	//   96  171:invokevirtual   #286 <Method int getScrollY()>
	//   97  174:invokevirtual   #296 <Method void scrollTo(int, int)>
		}
	//   98  177:return          
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
	//*  11   17:invokevirtual   #531 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  12   20:checkcast       #20  <Class ViewPager$LayoutParams>
	//*  13   23:getfield        #534 <Field boolean ViewPager$LayoutParams.isDecor>
	//*  14   26:ifne            38
			{
				removeViewAt(i);
	//   15   29:aload_0         
	//   16   30:iload_1         
	//   17   31:invokevirtual   #537 <Method void removeViewAt(int)>
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
	//    1    1:invokevirtual   #539 <Method ViewParent getParent()>
	//    2    4:astore_2        
		if(viewparent != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			viewparent.requestDisallowInterceptTouchEvent(flag);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokeinterface #544 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
	//    8   16:return          
	}

	private boolean resetTouch()
	{
		mActivePointerId = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #210 <Field int mActivePointerId>
		endDrag();
	//    3    5:aload_0         
	//    4    6:invokespecial   #547 <Method void endDrag()>
		mLeftEdge.onRelease();
	//    5    9:aload_0         
	//    6   10:getfield        #496 <Field EdgeEffect mLeftEdge>
	//    7   13:invokevirtual   #550 <Method void EdgeEffect.onRelease()>
		mRightEdge.onRelease();
	//    8   16:aload_0         
	//    9   17:getfield        #507 <Field EdgeEffect mRightEdge>
	//   10   20:invokevirtual   #550 <Method void EdgeEffect.onRelease()>
		return mLeftEdge.isFinished() || mRightEdge.isFinished();
	//   11   23:aload_0         
	//   12   24:getfield        #496 <Field EdgeEffect mLeftEdge>
	//   13   27:invokevirtual   #551 <Method boolean EdgeEffect.isFinished()>
	//   14   30:ifne            48
	//   15   33:aload_0         
	//   16   34:getfield        #507 <Field EdgeEffect mRightEdge>
	//   17   37:invokevirtual   #551 <Method boolean EdgeEffect.isFinished()>
	//   18   40:ifeq            46
	//   19   43:goto            48
	//   20   46:iconst_0        
	//   21   47:ireturn         
	//   22   48:iconst_1        
	//   23   49:ireturn         
	}

	private void scrollToItem(int i, boolean flag, int j, boolean flag1)
	{
		ItemInfo iteminfo = infoForPosition(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #521 <Method ViewPager$ItemInfo infoForPosition(int)>
	//    3    5:astore          6
		int k;
		if(iteminfo != null)
	//*   4    7:aload           6
	//*   5    9:ifnull          43
			k = (int)((float)getClientWidth() * Math.max(mFirstOffset, Math.min(iteminfo.offset, mLastOffset)));
	//    6   12:aload_0         
	//    7   13:invokespecial   #242 <Method int getClientWidth()>
	//    8   16:i2f             
	//    9   17:aload_0         
	//   10   18:getfield        #203 <Field float mFirstOffset>
	//   11   21:aload           6
	//   12   23:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   13   26:aload_0         
	//   14   27:getfield        #206 <Field float mLastOffset>
	//   15   30:invokestatic    #524 <Method float Math.min(float, float)>
	//   16   33:invokestatic    #555 <Method float Math.max(float, float)>
	//   17   36:fmul            
	//   18   37:f2i             
	//   19   38:istore          5
		else
	//*  20   40:goto            46
			k = 0;
	//   21   43:iconst_0        
	//   22   44:istore          5
		if(flag)
	//*  23   46:iload_2         
	//*  24   47:ifeq            69
		{
			smoothScrollTo(k, 0, j);
	//   25   50:aload_0         
	//   26   51:iload           5
	//   27   53:iconst_0        
	//   28   54:iload_3         
	//   29   55:invokevirtual   #559 <Method void smoothScrollTo(int, int, int)>
			if(flag1)
	//*  30   58:iload           4
	//*  31   60:ifeq            98
			{
				dispatchOnPageSelected(i);
	//   32   63:aload_0         
	//   33   64:iload_1         
	//   34   65:invokespecial   #561 <Method void dispatchOnPageSelected(int)>
				return;
	//   35   68:return          
			}
		} else
		{
			if(flag1)
	//*  36   69:iload           4
	//*  37   71:ifeq            79
				dispatchOnPageSelected(i);
	//   38   74:aload_0         
	//   39   75:iload_1         
	//   40   76:invokespecial   #561 <Method void dispatchOnPageSelected(int)>
			completeScroll(false);
	//   41   79:aload_0         
	//   42   80:iconst_0        
	//   43   81:invokespecial   #526 <Method void completeScroll(boolean)>
			scrollTo(k, 0);
	//   44   84:aload_0         
	//   45   85:iload           5
	//   46   87:iconst_0        
	//   47   88:invokevirtual   #296 <Method void scrollTo(int, int)>
			pageScrolled(k);
	//   48   91:aload_0         
	//   49   92:iload           5
	//   50   94:invokespecial   #300 <Method boolean pageScrolled(int)>
	//   51   97:pop             
		}
	//   52   98:return          
	}

	private void setScrollingCacheEnabled(boolean flag)
	{
		if(mScrollingCacheEnabled != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #563 <Field boolean mScrollingCacheEnabled>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          13
			mScrollingCacheEnabled = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #563 <Field boolean mScrollingCacheEnabled>
	//    7   13:return          
	}

	private void sortChildDrawingOrder()
	{
		if(mDrawingOrder != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #566 <Field int mDrawingOrder>
	//*   2    4:ifeq            78
		{
			ArrayList arraylist = mDrawingOrderedChildren;
	//    3    7:aload_0         
	//    4    8:getfield        #568 <Field ArrayList mDrawingOrderedChildren>
	//    5   11:astore_3        
			if(arraylist == null)
	//*   6   12:aload_3         
	//*   7   13:ifnonnull       30
				mDrawingOrderedChildren = new ArrayList();
	//    8   16:aload_0         
	//    9   17:new             #183 <Class ArrayList>
	//   10   20:dup             
	//   11   21:invokespecial   #184 <Method void ArrayList()>
	//   12   24:putfield        #568 <Field ArrayList mDrawingOrderedChildren>
			else
	//*  13   27:goto            34
				arraylist.clear();
	//   14   30:aload_3         
	//   15   31:invokevirtual   #569 <Method void ArrayList.clear()>
			int j = getChildCount();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #367 <Method int getChildCount()>
	//   18   38:istore_2        
			for(int i = 0; i < j; i++)
	//*  19   39:iconst_0        
	//*  20   40:istore_1        
	//*  21   41:iload_1         
	//*  22   42:iload_2         
	//*  23   43:icmpge          68
			{
				View view = getChildAt(i);
	//   24   46:aload_0         
	//   25   47:iload_1         
	//   26   48:invokevirtual   #373 <Method View getChildAt(int)>
	//   27   51:astore_3        
				mDrawingOrderedChildren.add(((Object) (view)));
	//   28   52:aload_0         
	//   29   53:getfield        #568 <Field ArrayList mDrawingOrderedChildren>
	//   30   56:aload_3         
	//   31   57:invokevirtual   #573 <Method boolean ArrayList.add(Object)>
	//   32   60:pop             
			}

	//   33   61:iload_1         
	//   34   62:iconst_1        
	//   35   63:iadd            
	//   36   64:istore_1        
	//*  37   65:goto            41
			Collections.sort(((List) (mDrawingOrderedChildren)), ((Comparator) (sPositionComparator)));
	//   38   68:aload_0         
	//   39   69:getfield        #568 <Field ArrayList mDrawingOrderedChildren>
	//   40   72:getstatic       #176 <Field ViewPager$ViewPositionComparator sPositionComparator>
	//   41   75:invokestatic    #579 <Method void Collections.sort(List, Comparator)>
		}
	//   42   78:return          
	}

	public void addFocusables(ArrayList arraylist, int i, int j)
	{
		int l = arraylist.size();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #256 <Method int ArrayList.size()>
	//    2    4:istore          5
		int i1 = getDescendantFocusability();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #584 <Method int getDescendantFocusability()>
	//    5   10:istore          6
		if(i1 != 0x60000)
	//*   6   12:iload           6
	//*   7   14:ldc2            #585 <Int 0x60000>
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
				if(view.getVisibility() != 0)
					continue;
	//   19   40:aload           7
	//   20   42:invokevirtual   #588 <Method int View.getVisibility()>
	//   21   45:ifne            81
				ItemInfo iteminfo = infoForChild(view);
	//   22   48:aload_0         
	//   23   49:aload           7
	//   24   51:invokevirtual   #592 <Method ViewPager$ItemInfo infoForChild(View)>
	//   25   54:astore          8
				if(iteminfo != null && iteminfo.position == mCurItem)
	//*  26   56:aload           8
	//*  27   58:ifnull          81
	//*  28   61:aload           8
	//*  29   63:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  30   66:aload_0         
	//*  31   67:getfield        #330 <Field int mCurItem>
	//*  32   70:icmpne          81
					view.addFocusables(arraylist, i, j);
	//   33   73:aload           7
	//   34   75:aload_1         
	//   35   76:iload_2         
	//   36   77:iload_3         
	//   37   78:invokevirtual   #594 <Method void View.addFocusables(ArrayList, int, int)>
			}

	//   38   81:iload           4
	//   39   83:iconst_1        
	//   40   84:iadd            
	//   41   85:istore          4
		}
	//*  42   87:goto            23
		if(i1 != 0x40000 || l == arraylist.size())
	//*  43   90:iload           6
	//*  44   92:ldc2            #595 <Int 0x40000>
	//*  45   95:icmpne          107
	//*  46   98:iload           5
	//*  47  100:aload_1         
	//*  48  101:invokevirtual   #256 <Method int ArrayList.size()>
	//*  49  104:icmpne          147
		{
			if(!isFocusable())
	//*  50  107:aload_0         
	//*  51  108:invokevirtual   #598 <Method boolean isFocusable()>
	//*  52  111:ifne            115
				return;
	//   53  114:return          
			if((j & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode())
	//*  54  115:iload_3         
	//*  55  116:iconst_1        
	//*  56  117:iand            
	//*  57  118:iconst_1        
	//*  58  119:icmpne          137
	//*  59  122:aload_0         
	//*  60  123:invokevirtual   #601 <Method boolean isInTouchMode()>
	//*  61  126:ifeq            137
	//*  62  129:aload_0         
	//*  63  130:invokevirtual   #604 <Method boolean isFocusableInTouchMode()>
	//*  64  133:ifne            137
				return;
	//   65  136:return          
			if(arraylist != null)
	//*  66  137:aload_1         
	//*  67  138:ifnull          147
				arraylist.add(((Object) (this)));
	//   68  141:aload_1         
	//   69  142:aload_0         
	//   70  143:invokevirtual   #573 <Method boolean ArrayList.add(Object)>
	//   71  146:pop             
		}
	//   72  147:return          
	}

	ItemInfo addNewItem(int i, int j)
	{
		ItemInfo iteminfo = new ItemInfo();
	//    0    0:new             #17  <Class ViewPager$ItemInfo>
	//    1    3:dup             
	//    2    4:invokespecial   #187 <Method void ViewPager$ItemInfo()>
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
	//   12   20:invokevirtual   #612 <Method Object PagerAdapter.instantiateItem(ViewGroup, int)>
	//   13   23:putfield        #616 <Field Object ViewPager$ItemInfo.object>
		iteminfo.widthFactor = mAdapter.getPageWidth(i);
	//   14   26:aload_3         
	//   15   27:aload_0         
	//   16   28:getfield        #233 <Field PagerAdapter mAdapter>
	//   17   31:iload_1         
	//   18   32:invokevirtual   #264 <Method float PagerAdapter.getPageWidth(int)>
	//   19   35:putfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
		if(j >= 0 && j < mItems.size())
	//*  20   38:iload_2         
	//*  21   39:iflt            67
	//*  22   42:iload_2         
	//*  23   43:aload_0         
	//*  24   44:getfield        #186 <Field ArrayList mItems>
	//*  25   47:invokevirtual   #256 <Method int ArrayList.size()>
	//*  26   50:icmplt          56
	//*  27   53:goto            67
		{
			mItems.add(j, ((Object) (iteminfo)));
	//   28   56:aload_0         
	//   29   57:getfield        #186 <Field ArrayList mItems>
	//   30   60:iload_2         
	//   31   61:aload_3         
	//   32   62:invokevirtual   #619 <Method void ArrayList.add(int, Object)>
			return iteminfo;
	//   33   65:aload_3         
	//   34   66:areturn         
		} else
		{
			mItems.add(((Object) (iteminfo)));
	//   35   67:aload_0         
	//   36   68:getfield        #186 <Field ArrayList mItems>
	//   37   71:aload_3         
	//   38   72:invokevirtual   #573 <Method boolean ArrayList.add(Object)>
	//   39   75:pop             
			return iteminfo;
	//   40   76:aload_3         
	//   41   77:areturn         
		}
	}

	public void addOnAdapterChangeListener(OnAdapterChangeListener onadapterchangelistener)
	{
		if(mAdapterChangeListeners == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #623 <Field List mAdapterChangeListeners>
	//*   2    4:ifnonnull       18
			mAdapterChangeListeners = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #183 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #184 <Method void ArrayList()>
	//    7   15:putfield        #623 <Field List mAdapterChangeListeners>
		mAdapterChangeListeners.add(((Object) (onadapterchangelistener)));
	//    8   18:aload_0         
	//    9   19:getfield        #623 <Field List mAdapterChangeListeners>
	//   10   22:aload_1         
	//   11   23:invokeinterface #624 <Method boolean List.add(Object)>
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
	//    4    8:new             #183 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #184 <Method void ArrayList()>
	//    7   15:putfield        #348 <Field List mOnPageChangeListeners>
		mOnPageChangeListeners.add(((Object) (onpagechangelistener)));
	//    8   18:aload_0         
	//    9   19:getfield        #348 <Field List mOnPageChangeListeners>
	//   10   22:aload_1         
	//   11   23:invokeinterface #624 <Method boolean List.add(Object)>
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
	//   11   17:invokevirtual   #588 <Method int View.getVisibility()>
	//   12   20:ifne            52
			ItemInfo iteminfo = infoForChild(view);
	//   13   23:aload_0         
	//   14   24:aload_3         
	//   15   25:invokevirtual   #592 <Method ViewPager$ItemInfo infoForChild(View)>
	//   16   28:astore          4
			if(iteminfo != null && iteminfo.position == mCurItem)
	//*  17   30:aload           4
	//*  18   32:ifnull          52
	//*  19   35:aload           4
	//*  20   37:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  21   40:aload_0         
	//*  22   41:getfield        #330 <Field int mCurItem>
	//*  23   44:icmpne          52
				view.addTouchables(arraylist);
	//   24   47:aload_3         
	//   25   48:aload_1         
	//   26   49:invokevirtual   #630 <Method void View.addTouchables(ArrayList)>
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
		android.view.ViewGroup.LayoutParams layoutparams1 = layoutparams;
	//    0    0:aload_3         
	//    1    1:astore          4
		if(!checkLayoutParams(layoutparams))
	//*   2    3:aload_0         
	//*   3    4:aload_3         
	//*   4    5:invokevirtual   #637 <Method boolean checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//*   5    8:ifne            18
			layoutparams1 = generateLayoutParams(layoutparams);
	//    6   11:aload_0         
	//    7   12:aload_3         
	//    8   13:invokevirtual   #641 <Method android.view.ViewGroup$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    9   16:astore          4
		layoutparams = ((android.view.ViewGroup.LayoutParams) ((LayoutParams)layoutparams1));
	//   10   18:aload           4
	//   11   20:checkcast       #20  <Class ViewPager$LayoutParams>
	//   12   23:astore_3        
		layoutparams.isDecor = ((LayoutParams) (layoutparams)).isDecor | isDecorView(view);
	//   13   24:aload_3         
	//   14   25:aload_3         
	//   15   26:getfield        #534 <Field boolean ViewPager$LayoutParams.isDecor>
	//   16   29:aload_1         
	//   17   30:invokestatic    #643 <Method boolean isDecorView(View)>
	//   18   33:ior             
	//   19   34:putfield        #534 <Field boolean ViewPager$LayoutParams.isDecor>
		if(mInLayout)
	//*  20   37:aload_0         
	//*  21   38:getfield        #645 <Field boolean mInLayout>
	//*  22   41:ifeq            84
		{
			if(layoutparams != null && ((LayoutParams) (layoutparams)).isDecor)
	//*  23   44:aload_3         
	//*  24   45:ifnull          69
	//*  25   48:aload_3         
	//*  26   49:getfield        #534 <Field boolean ViewPager$LayoutParams.isDecor>
	//*  27   52:ifne            58
	//*  28   55:goto            69
			{
				throw new IllegalStateException("Cannot add pager decor view during layout");
	//   29   58:new             #485 <Class IllegalStateException>
	//   30   61:dup             
	//   31   62:ldc2            #647 <String "Cannot add pager decor view during layout">
	//   32   65:invokespecial   #490 <Method void IllegalStateException(String)>
	//   33   68:athrow          
			} else
			{
				layoutparams.needsMeasure = true;
	//   34   69:aload_3         
	//   35   70:iconst_1        
	//   36   71:putfield        #650 <Field boolean ViewPager$LayoutParams.needsMeasure>
				addViewInLayout(view, i, layoutparams1);
	//   37   74:aload_0         
	//   38   75:aload_1         
	//   39   76:iload_2         
	//   40   77:aload           4
	//   41   79:invokevirtual   #654 <Method boolean addViewInLayout(View, int, android.view.ViewGroup$LayoutParams)>
	//   42   82:pop             
				return;
	//   43   83:return          
			}
		} else
		{
			super.addView(view, i, layoutparams1);
	//   44   84:aload_0         
	//   45   85:aload_1         
	//   46   86:iload_2         
	//   47   87:aload           4
	//   48   89:invokespecial   #656 <Method void ViewGroup.addView(View, int, android.view.ViewGroup$LayoutParams)>
			return;
	//   49   92:return          
		}
	}

	public boolean arrowScroll(int i)
	{
		boolean flag1;
		Object obj;
label0:
		{
			View view1;
label1:
			{
				boolean flag;
				Object obj1;
label2:
				{
					view1 = findFocus();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #661 <Method View findFocus()>
	//    2    4:astore          7
					flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore          4
					obj1 = null;
	//    5    9:aconst_null     
	//    6   10:astore          6
					if(view1 == this)
	//*   7   12:aload           7
	//*   8   14:aload_0         
	//*   9   15:if_acmpne       25
					{
						obj = ((Object) (obj1));
	//   10   18:aload           6
	//   11   20:astore          5
						break label0;
	//   12   22:goto            198
					}
					if(view1 == null)
						break label1;
	//   13   25:aload           7
	//   14   27:ifnull          194
					obj = ((Object) (view1.getParent()));
	//   15   30:aload           7
	//   16   32:invokevirtual   #425 <Method ViewParent View.getParent()>
	//   17   35:astore          5
					do
					{
						if(!(obj instanceof ViewGroup))
							break;
	//   18   37:aload           5
	//   19   39:instanceof      #4   <Class ViewGroup>
	//   20   42:ifeq            68
						if(obj == this)
	//*  21   45:aload           5
	//*  22   47:aload_0         
	//*  23   48:if_acmpne       56
						{
							flag = true;
	//   24   51:iconst_1        
	//   25   52:istore_2        
							break label2;
	//   26   53:goto            70
						}
						obj = ((Object) (((ViewParent) (obj)).getParent()));
	//   27   56:aload           5
	//   28   58:invokeinterface #662 <Method ViewParent ViewParent.getParent()>
	//   29   63:astore          5
					} while(true);
	//   30   65:goto            37
					flag = false;
	//   31   68:iconst_0        
	//   32   69:istore_2        
				}
				if(!flag)
	//*  33   70:iload_2         
	//*  34   71:ifne            194
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   35   74:new             #664 <Class StringBuilder>
	//   36   77:dup             
	//   37   78:invokespecial   #665 <Method void StringBuilder()>
	//   38   81:astore          8
					stringbuilder.append(((Object) (view1)).getClass().getSimpleName());
	//   39   83:aload           8
	//   40   85:aload           7
	//   41   87:invokevirtual   #449 <Method Class Object.getClass()>
	//   42   90:invokevirtual   #669 <Method String Class.getSimpleName()>
	//   43   93:invokevirtual   #673 <Method StringBuilder StringBuilder.append(String)>
	//   44   96:pop             
					for(obj = ((Object) (view1.getParent())); obj instanceof ViewGroup; obj = ((Object) (((ViewParent) (obj)).getParent())))
	//*  45   97:aload           7
	//*  46   99:invokevirtual   #425 <Method ViewParent View.getParent()>
	//*  47  102:astore          5
	//*  48  104:aload           5
	//*  49  106:instanceof      #4   <Class ViewGroup>
	//*  50  109:ifeq            147
					{
						stringbuilder.append(" => ");
	//   51  112:aload           8
	//   52  114:ldc2            #675 <String " => ">
	//   53  117:invokevirtual   #673 <Method StringBuilder StringBuilder.append(String)>
	//   54  120:pop             
						stringbuilder.append(obj.getClass().getSimpleName());
	//   55  121:aload           8
	//   56  123:aload           5
	//   57  125:invokevirtual   #449 <Method Class Object.getClass()>
	//   58  128:invokevirtual   #669 <Method String Class.getSimpleName()>
	//   59  131:invokevirtual   #673 <Method StringBuilder StringBuilder.append(String)>
	//   60  134:pop             
					}

	//   61  135:aload           5
	//   62  137:invokeinterface #662 <Method ViewParent ViewParent.getParent()>
	//   63  142:astore          5
	//*  64  144:goto            104
					obj = ((Object) (new StringBuilder()));
	//   65  147:new             #664 <Class StringBuilder>
	//   66  150:dup             
	//   67  151:invokespecial   #665 <Method void StringBuilder()>
	//   68  154:astore          5
					((StringBuilder) (obj)).append("arrowScroll tried to find focus based on non-child current focused view ");
	//   69  156:aload           5
	//   70  158:ldc2            #677 <String "arrowScroll tried to find focus based on non-child current focused view ">
	//   71  161:invokevirtual   #673 <Method StringBuilder StringBuilder.append(String)>
	//   72  164:pop             
					((StringBuilder) (obj)).append(stringbuilder.toString());
	//   73  165:aload           5
	//   74  167:aload           8
	//   75  169:invokevirtual   #680 <Method String StringBuilder.toString()>
	//   76  172:invokevirtual   #673 <Method StringBuilder StringBuilder.append(String)>
	//   77  175:pop             
					Log.e("ViewPager", ((StringBuilder) (obj)).toString());
	//   78  176:ldc1            #77  <String "ViewPager">
	//   79  178:aload           5
	//   80  180:invokevirtual   #680 <Method String StringBuilder.toString()>
	//   81  183:invokestatic    #686 <Method int Log.e(String, String)>
	//   82  186:pop             
					obj = ((Object) (obj1));
	//   83  187:aload           6
	//   84  189:astore          5
					break label0;
	//   85  191:goto            198
				}
			}
			obj = ((Object) (view1));
	//   86  194:aload           7
	//   87  196:astore          5
		}
		View view = FocusFinder.getInstance().findNextFocus(((ViewGroup) (this)), ((View) (obj)), i);
	//   88  198:invokestatic    #692 <Method FocusFinder FocusFinder.getInstance()>
	//   89  201:aload_0         
	//   90  202:aload           5
	//   91  204:iload_1         
	//   92  205:invokevirtual   #696 <Method View FocusFinder.findNextFocus(ViewGroup, View, int)>
	//   93  208:astore          6
		if(view != null && view != obj)
	//*  94  210:aload           6
	//*  95  212:ifnull          348
	//*  96  215:aload           6
	//*  97  217:aload           5
	//*  98  219:if_acmpeq       348
		{
			if(i == 17)
	//*  99  222:iload_1         
	//* 100  223:bipush          17
	//* 101  225:icmpne          285
			{
				int j = getChildRectInPagerCoordinates(mTempRect, view).left;
	//  102  228:aload_0         
	//  103  229:aload_0         
	//  104  230:getfield        #194 <Field Rect mTempRect>
	//  105  233:aload           6
	//  106  235:invokespecial   #698 <Method Rect getChildRectInPagerCoordinates(Rect, View)>
	//  107  238:getfield        #403 <Field int Rect.left>
	//  108  241:istore_2        
				int l = getChildRectInPagerCoordinates(mTempRect, ((View) (obj))).left;
	//  109  242:aload_0         
	//  110  243:aload_0         
	//  111  244:getfield        #194 <Field Rect mTempRect>
	//  112  247:aload           5
	//  113  249:invokespecial   #698 <Method Rect getChildRectInPagerCoordinates(Rect, View)>
	//  114  252:getfield        #403 <Field int Rect.left>
	//  115  255:istore_3        
				if(obj != null && j >= l)
	//* 116  256:aload           5
	//* 117  258:ifnull          275
	//* 118  261:iload_2         
	//* 119  262:iload_3         
	//* 120  263:icmplt          275
					flag1 = pageLeft();
	//  121  266:aload_0         
	//  122  267:invokevirtual   #701 <Method boolean pageLeft()>
	//  123  270:istore          4
				else
	//* 124  272:goto            388
					flag1 = view.requestFocus();
	//  125  275:aload           6
	//  126  277:invokevirtual   #704 <Method boolean View.requestFocus()>
	//  127  280:istore          4
			} else
	//* 128  282:goto            388
			if(i == 66)
	//* 129  285:iload_1         
	//* 130  286:bipush          66
	//* 131  288:icmpne          388
			{
				int k = getChildRectInPagerCoordinates(mTempRect, view).left;
	//  132  291:aload_0         
	//  133  292:aload_0         
	//  134  293:getfield        #194 <Field Rect mTempRect>
	//  135  296:aload           6
	//  136  298:invokespecial   #698 <Method Rect getChildRectInPagerCoordinates(Rect, View)>
	//  137  301:getfield        #403 <Field int Rect.left>
	//  138  304:istore_2        
				int i1 = getChildRectInPagerCoordinates(mTempRect, ((View) (obj))).left;
	//  139  305:aload_0         
	//  140  306:aload_0         
	//  141  307:getfield        #194 <Field Rect mTempRect>
	//  142  310:aload           5
	//  143  312:invokespecial   #698 <Method Rect getChildRectInPagerCoordinates(Rect, View)>
	//  144  315:getfield        #403 <Field int Rect.left>
	//  145  318:istore_3        
				if(obj != null && k <= i1)
	//* 146  319:aload           5
	//* 147  321:ifnull          338
	//* 148  324:iload_2         
	//* 149  325:iload_3         
	//* 150  326:icmpgt          338
					flag1 = pageRight();
	//  151  329:aload_0         
	//  152  330:invokevirtual   #707 <Method boolean pageRight()>
	//  153  333:istore          4
				else
	//* 154  335:goto            388
					flag1 = view.requestFocus();
	//  155  338:aload           6
	//  156  340:invokevirtual   #704 <Method boolean View.requestFocus()>
	//  157  343:istore          4
			}
		} else
	//* 158  345:goto            388
		if(i != 17 && i != 1)
	//* 159  348:iload_1         
	//* 160  349:bipush          17
	//* 161  351:icmpeq          382
	//* 162  354:iload_1         
	//* 163  355:iconst_1        
	//* 164  356:icmpne          362
	//* 165  359:goto            382
		{
			if(i == 66 || i == 2)
	//* 166  362:iload_1         
	//* 167  363:bipush          66
	//* 168  365:icmpeq          373
	//* 169  368:iload_1         
	//* 170  369:iconst_2        
	//* 171  370:icmpne          388
				flag1 = pageRight();
	//  172  373:aload_0         
	//  173  374:invokevirtual   #707 <Method boolean pageRight()>
	//  174  377:istore          4
		} else
	//* 175  379:goto            388
		{
			flag1 = pageLeft();
	//  176  382:aload_0         
	//  177  383:invokevirtual   #701 <Method boolean pageLeft()>
	//  178  386:istore          4
		}
		if(flag1)
	//* 179  388:iload           4
	//* 180  390:ifeq            401
			playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
	//  181  393:aload_0         
	//  182  394:iload_1         
	//  183  395:invokestatic    #712 <Method int SoundEffectConstants.getContantForFocusDirection(int)>
	//  184  398:invokevirtual   #715 <Method void playSoundEffect(int)>
		return flag1;
	//  185  401:iload           4
	//  186  403:ireturn         
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
	//    7   11:putfield        #718 <Field boolean mFakeDragging>
		setScrollState(1);
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:invokevirtual   #721 <Method void setScrollState(int)>
		mLastMotionX = 0.0F;
	//   11   19:aload_0         
	//   12   20:fconst_0        
	//   13   21:putfield        #477 <Field float mLastMotionX>
		mInitialMotionX = 0.0F;
	//   14   24:aload_0         
	//   15   25:fconst_0        
	//   16   26:putfield        #723 <Field float mInitialMotionX>
		Object obj = ((Object) (mVelocityTracker));
	//   17   29:aload_0         
	//   18   30:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//   19   33:astore_3        
		if(obj == null)
	//*  20   34:aload_3         
	//*  21   35:ifnonnull       48
			mVelocityTracker = VelocityTracker.obtain();
	//   22   38:aload_0         
	//   23   39:invokestatic    #727 <Method VelocityTracker VelocityTracker.obtain()>
	//   24   42:putfield        #386 <Field VelocityTracker mVelocityTracker>
		else
	//*  25   45:goto            52
			((VelocityTracker) (obj)).clear();
	//   26   48:aload_3         
	//   27   49:invokevirtual   #480 <Method void VelocityTracker.clear()>
		long l = SystemClock.uptimeMillis();
	//   28   52:invokestatic    #733 <Method long SystemClock.uptimeMillis()>
	//   29   55:lstore_1        
		obj = ((Object) (MotionEvent.obtain(l, l, 0, 0.0F, 0.0F, 0)));
	//   30   56:lload_1         
	//   31   57:lload_1         
	//   32   58:iconst_0        
	//   33   59:fconst_0        
	//   34   60:fconst_0        
	//   35   61:iconst_0        
	//   36   62:invokestatic    #736 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//   37   65:astore_3        
		mVelocityTracker.addMovement(((MotionEvent) (obj)));
	//   38   66:aload_0         
	//   39   67:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//   40   70:aload_3         
	//   41   71:invokevirtual   #739 <Method void VelocityTracker.addMovement(MotionEvent)>
		((MotionEvent) (obj)).recycle();
	//   42   74:aload_3         
	//   43   75:invokevirtual   #740 <Method void MotionEvent.recycle()>
		mFakeDragBeginTime = l;
	//   44   78:aload_0         
	//   45   79:lload_1         
	//   46   80:putfield        #742 <Field long mFakeDragBeginTime>
		return true;
	//   47   83:iconst_1        
	//   48   84:ireturn         
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
	//    7   14:invokevirtual   #745 <Method int View.getScrollX()>
	//    8   17:istore          7
			int j1 = view.getScrollY();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #746 <Method int View.getScrollY()>
	//   11   23:istore          8
			for(int l = viewgroup.getChildCount() - 1; l >= 0; l--)
	//*  12   25:aload           11
	//*  13   27:invokevirtual   #747 <Method int ViewGroup.getChildCount()>
	//*  14   30:iconst_1        
	//*  15   31:isub            
	//*  16   32:istore          6
	//*  17   34:iload           6
	//*  18   36:iflt            140
			{
				View view1 = viewgroup.getChildAt(l);
	//   19   39:aload           11
	//   20   41:iload           6
	//   21   43:invokevirtual   #748 <Method View ViewGroup.getChildAt(int)>
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
	//   29   59:invokevirtual   #400 <Method int View.getLeft()>
	//   30   62:icmplt          131
	//   31   65:iload           9
	//   32   67:aload           12
	//   33   69:invokevirtual   #406 <Method int View.getRight()>
	//   34   72:icmpge          131
				int l1 = k + j1;
	//   35   75:iload           5
	//   36   77:iload           8
	//   37   79:iadd            
	//   38   80:istore          10
				if(l1 >= view1.getTop() && l1 < view1.getBottom() && canScroll(view1, true, i, k1 - view1.getLeft(), l1 - view1.getTop()))
	//*  39   82:iload           10
	//*  40   84:aload           12
	//*  41   86:invokevirtual   #412 <Method int View.getTop()>
	//*  42   89:icmplt          131
	//*  43   92:iload           10
	//*  44   94:aload           12
	//*  45   96:invokevirtual   #418 <Method int View.getBottom()>
	//*  46   99:icmpge          131
	//*  47  102:aload_0         
	//*  48  103:aload           12
	//*  49  105:iconst_1        
	//*  50  106:iload_3         
	//*  51  107:iload           9
	//*  52  109:aload           12
	//*  53  111:invokevirtual   #400 <Method int View.getLeft()>
	//*  54  114:isub            
	//*  55  115:iload           10
	//*  56  117:aload           12
	//*  57  119:invokevirtual   #412 <Method int View.getTop()>
	//*  58  122:isub            
	//*  59  123:invokevirtual   #750 <Method boolean canScroll(View, boolean, int, int, int)>
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
		return flag && view.canScrollHorizontally(-i);
	//   68  140:iload_2         
	//   69  141:ifeq            155
	//   70  144:aload_1         
	//   71  145:iload_3         
	//   72  146:ineg            
	//   73  147:invokevirtual   #753 <Method boolean View.canScrollHorizontally(int)>
	//   74  150:ifeq            155
	//   75  153:iconst_1        
	//   76  154:ireturn         
	//   77  155:iconst_0        
	//   78  156:ireturn         
	}

	public boolean canScrollHorizontally(int i)
	{
		PagerAdapter pageradapter = mAdapter;
	//    0    0:aload_0         
	//    1    1:getfield        #233 <Field PagerAdapter mAdapter>
	//    2    4:astore          6
		boolean flag2 = false;
	//    3    6:iconst_0        
	//    4    7:istore          5
		boolean flag = false;
	//    5    9:iconst_0        
	//    6   10:istore          4
		if(pageradapter == null)
	//*   7   12:aload           6
	//*   8   14:ifnonnull       19
			return false;
	//    9   17:iconst_0        
	//   10   18:ireturn         
		int j = getClientWidth();
	//   11   19:aload_0         
	//   12   20:invokespecial   #242 <Method int getClientWidth()>
	//   13   23:istore_2        
		int k = getScrollX();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #283 <Method int getScrollX()>
	//   16   28:istore_3        
		if(i < 0)
	//*  17   29:iload_1         
	//*  18   30:ifge            51
		{
			if(k > (int)((float)j * mFirstOffset))
	//*  19   33:iload_3         
	//*  20   34:iload_2         
	//*  21   35:i2f             
	//*  22   36:aload_0         
	//*  23   37:getfield        #203 <Field float mFirstOffset>
	//*  24   40:fmul            
	//*  25   41:f2i             
	//*  26   42:icmple          48
				flag = true;
	//   27   45:iconst_1        
	//   28   46:istore          4
			return flag;
	//   29   48:iload           4
	//   30   50:ireturn         
		}
		if(i > 0)
	//*  31   51:iload_1         
	//*  32   52:ifle            77
		{
			boolean flag1 = flag2;
	//   33   55:iload           5
	//   34   57:istore          4
			if(k < (int)((float)j * mLastOffset))
	//*  35   59:iload_3         
	//*  36   60:iload_2         
	//*  37   61:i2f             
	//*  38   62:aload_0         
	//*  39   63:getfield        #206 <Field float mLastOffset>
	//*  40   66:fmul            
	//*  41   67:f2i             
	//*  42   68:icmpge          74
				flag1 = true;
	//   43   71:iconst_1        
	//   44   72:istore          4
			return flag1;
	//   45   74:iload           4
	//   46   76:ireturn         
		} else
		{
			return false;
	//   47   77:iconst_0        
	//   48   78:ireturn         
		}
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
	//    0    0:aload_1         
	//    1    1:instanceof      #20  <Class ViewPager$LayoutParams>
	//    2    4:ifeq            17
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #754 <Method boolean ViewGroup.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    6   12:ifeq            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public void clearOnPageChangeListeners()
	{
		List list = mOnPageChangeListeners;
	//    0    0:aload_0         
	//    1    1:getfield        #348 <Field List mOnPageChangeListeners>
	//    2    4:astore_1        
		if(list != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			list.clear();
	//    5    9:aload_1         
	//    6   10:invokeinterface #756 <Method void List.clear()>
	//    7   15:return          
	}

	public void computeScroll()
	{
		mIsScrollStarted = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #759 <Field boolean mIsScrollStarted>
		if(!mScroller.isFinished() && mScroller.computeScrollOffset())
	//*   3    5:aload_0         
	//*   4    6:getfield        #271 <Field Scroller mScroller>
	//*   5    9:invokevirtual   #277 <Method boolean Scroller.isFinished()>
	//*   6   12:ifne            97
	//*   7   15:aload_0         
	//*   8   16:getfield        #271 <Field Scroller mScroller>
	//*   9   19:invokevirtual   #762 <Method boolean Scroller.computeScrollOffset()>
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
	//   47   93:invokestatic    #766 <Method void ViewCompat.postInvalidateOnAnimation(View)>
			return;
	//   48   96:return          
		} else
		{
			completeScroll(true);
	//   49   97:aload_0         
	//   50   98:iconst_1        
	//   51   99:invokespecial   #526 <Method void completeScroll(boolean)>
			return;
	//   52  102:return          
		}
	}

	void dataSetChanged()
	{
		int k2 = mAdapter.getCount();
	//    0    0:aload_0         
	//    1    1:getfield        #233 <Field PagerAdapter mAdapter>
	//    2    4:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//    3    7:istore          9
		mExpectedAdapterCount = k2;
	//    4    9:aload_0         
	//    5   10:iload           9
	//    6   12:putfield        #769 <Field int mExpectedAdapterCount>
		int i;
		if(mItems.size() < mOffscreenPageLimit * 2 + 1 && mItems.size() < k2)
	//*   7   15:aload_0         
	//*   8   16:getfield        #186 <Field ArrayList mItems>
	//*   9   19:invokevirtual   #256 <Method int ArrayList.size()>
	//*  10   22:aload_0         
	//*  11   23:getfield        #208 <Field int mOffscreenPageLimit>
	//*  12   26:iconst_2        
	//*  13   27:imul            
	//*  14   28:iconst_1        
	//*  15   29:iadd            
	//*  16   30:icmpge          50
	//*  17   33:aload_0         
	//*  18   34:getfield        #186 <Field ArrayList mItems>
	//*  19   37:invokevirtual   #256 <Method int ArrayList.size()>
	//*  20   40:iload           9
	//*  21   42:icmpge          50
			i = 1;
	//   22   45:iconst_1        
	//   23   46:istore_1        
		else
	//*  24   47:goto            52
			i = 0;
	//   25   50:iconst_0        
	//   26   51:istore_1        
		int k = mCurItem;
	//   27   52:aload_0         
	//   28   53:getfield        #330 <Field int mCurItem>
	//   29   56:istore_2        
		int j1 = 0;
	//   30   57:iconst_0        
	//   31   58:istore          4
		int l = 0;
	//   32   60:iconst_0        
	//   33   61:istore_3        
		while(j1 < mItems.size()) 
	//*  34   62:iload           4
	//*  35   64:aload_0         
	//*  36   65:getfield        #186 <Field ArrayList mItems>
	//*  37   68:invokevirtual   #256 <Method int ArrayList.size()>
	//*  38   71:icmpge          299
		{
			ItemInfo iteminfo = (ItemInfo)mItems.get(j1);
	//   39   74:aload_0         
	//   40   75:getfield        #186 <Field ArrayList mItems>
	//   41   78:iload           4
	//   42   80:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   43   83:checkcast       #17  <Class ViewPager$ItemInfo>
	//   44   86:astore          10
			int j2 = mAdapter.getItemPosition(iteminfo.object);
	//   45   88:aload_0         
	//   46   89:getfield        #233 <Field PagerAdapter mAdapter>
	//   47   92:aload           10
	//   48   94:getfield        #616 <Field Object ViewPager$ItemInfo.object>
	//   49   97:invokevirtual   #773 <Method int PagerAdapter.getItemPosition(Object)>
	//   50  100:istore          8
			int k1;
			int l1;
			int i2;
			if(j2 == -1)
	//*  51  102:iload           8
	//*  52  104:iconst_m1       
	//*  53  105:icmpne          121
			{
				l1 = j1;
	//   54  108:iload           4
	//   55  110:istore          6
				i2 = l;
	//   56  112:iload_3         
	//   57  113:istore          7
				k1 = k;
	//   58  115:iload_2         
	//   59  116:istore          5
			} else
	//*  60  118:goto            284
			if(j2 == -2)
	//*  61  121:iload           8
	//*  62  123:bipush          -2
	//*  63  125:icmpne          230
			{
				mItems.remove(j1);
	//   64  128:aload_0         
	//   65  129:getfield        #186 <Field ArrayList mItems>
	//   66  132:iload           4
	//   67  134:invokevirtual   #776 <Method Object ArrayList.remove(int)>
	//   68  137:pop             
				l1 = j1 - 1;
	//   69  138:iload           4
	//   70  140:iconst_1        
	//   71  141:isub            
	//   72  142:istore          6
				i = l;
	//   73  144:iload_3         
	//   74  145:istore_1        
				if(l == 0)
	//*  75  146:iload_3         
	//*  76  147:ifne            160
				{
					mAdapter.startUpdate(((ViewGroup) (this)));
	//   77  150:aload_0         
	//   78  151:getfield        #233 <Field PagerAdapter mAdapter>
	//   79  154:aload_0         
	//   80  155:invokevirtual   #780 <Method void PagerAdapter.startUpdate(ViewGroup)>
					i = 1;
	//   81  158:iconst_1        
	//   82  159:istore_1        
				}
				mAdapter.destroyItem(((ViewGroup) (this)), iteminfo.position, iteminfo.object);
	//   83  160:aload_0         
	//   84  161:getfield        #233 <Field PagerAdapter mAdapter>
	//   85  164:aload_0         
	//   86  165:aload           10
	//   87  167:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//   88  170:aload           10
	//   89  172:getfield        #616 <Field Object ViewPager$ItemInfo.object>
	//   90  175:invokevirtual   #784 <Method void PagerAdapter.destroyItem(ViewGroup, int, Object)>
				if(mCurItem == iteminfo.position)
	//*  91  178:aload_0         
	//*  92  179:getfield        #330 <Field int mCurItem>
	//*  93  182:aload           10
	//*  94  184:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  95  187:icmpne          217
				{
					k1 = Math.max(0, Math.min(mCurItem, k2 - 1));
	//   96  190:iconst_0        
	//   97  191:aload_0         
	//   98  192:getfield        #330 <Field int mCurItem>
	//   99  195:iload           9
	//  100  197:iconst_1        
	//  101  198:isub            
	//  102  199:invokestatic    #336 <Method int Math.min(int, int)>
	//  103  202:invokestatic    #339 <Method int Math.max(int, int)>
	//  104  205:istore          5
					k = 1;
	//  105  207:iconst_1        
	//  106  208:istore_2        
					i2 = i;
	//  107  209:iload_1         
	//  108  210:istore          7
					i = k;
	//  109  212:iload_2         
	//  110  213:istore_1        
				} else
	//* 111  214:goto            284
				{
					l = 1;
	//  112  217:iconst_1        
	//  113  218:istore_3        
					i2 = i;
	//  114  219:iload_1         
	//  115  220:istore          7
					i = l;
	//  116  222:iload_3         
	//  117  223:istore_1        
					k1 = k;
	//  118  224:iload_2         
	//  119  225:istore          5
				}
			} else
	//* 120  227:goto            284
			{
				l1 = j1;
	//  121  230:iload           4
	//  122  232:istore          6
				i2 = l;
	//  123  234:iload_3         
	//  124  235:istore          7
				k1 = k;
	//  125  237:iload_2         
	//  126  238:istore          5
				if(iteminfo.position != j2)
	//* 127  240:aload           10
	//* 128  242:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 129  245:iload           8
	//* 130  247:icmpeq          284
				{
					if(iteminfo.position == mCurItem)
	//* 131  250:aload           10
	//* 132  252:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 133  255:aload_0         
	//* 134  256:getfield        #330 <Field int mCurItem>
	//* 135  259:icmpne          265
						k = j2;
	//  136  262:iload           8
	//  137  264:istore_2        
					iteminfo.position = j2;
	//  138  265:aload           10
	//  139  267:iload           8
	//  140  269:putfield        #247 <Field int ViewPager$ItemInfo.position>
					i = 1;
	//  141  272:iconst_1        
	//  142  273:istore_1        
					k1 = k;
	//  143  274:iload_2         
	//  144  275:istore          5
					i2 = l;
	//  145  277:iload_3         
	//  146  278:istore          7
					l1 = j1;
	//  147  280:iload           4
	//  148  282:istore          6
				}
			}
			j1 = l1 + 1;
	//  149  284:iload           6
	//  150  286:iconst_1        
	//  151  287:iadd            
	//  152  288:istore          4
			l = i2;
	//  153  290:iload           7
	//  154  292:istore_3        
			k = k1;
	//  155  293:iload           5
	//  156  295:istore_2        
		}
	//* 157  296:goto            62
		if(l != 0)
	//* 158  299:iload_3         
	//* 159  300:ifeq            311
			mAdapter.finishUpdate(((ViewGroup) (this)));
	//  160  303:aload_0         
	//  161  304:getfield        #233 <Field PagerAdapter mAdapter>
	//  162  307:aload_0         
	//  163  308:invokevirtual   #787 <Method void PagerAdapter.finishUpdate(ViewGroup)>
		Collections.sort(((List) (mItems)), COMPARATOR);
	//  164  311:aload_0         
	//  165  312:getfield        #186 <Field ArrayList mItems>
	//  166  315:getstatic       #170 <Field Comparator COMPARATOR>
	//  167  318:invokestatic    #579 <Method void Collections.sort(List, Comparator)>
		if(i != 0)
	//* 168  321:iload_1         
	//* 169  322:ifeq            382
		{
			int i1 = getChildCount();
	//  170  325:aload_0         
	//  171  326:invokevirtual   #367 <Method int getChildCount()>
	//  172  329:istore_3        
			for(int j = 0; j < i1; j++)
	//* 173  330:iconst_0        
	//* 174  331:istore_1        
	//* 175  332:iload_1         
	//* 176  333:iload_3         
	//* 177  334:icmpge          371
			{
				LayoutParams layoutparams = (LayoutParams)getChildAt(j).getLayoutParams();
	//  178  337:aload_0         
	//  179  338:iload_1         
	//  180  339:invokevirtual   #373 <Method View getChildAt(int)>
	//  181  342:invokevirtual   #531 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  182  345:checkcast       #20  <Class ViewPager$LayoutParams>
	//  183  348:astore          10
				if(!layoutparams.isDecor)
	//* 184  350:aload           10
	//* 185  352:getfield        #534 <Field boolean ViewPager$LayoutParams.isDecor>
	//* 186  355:ifne            364
					layoutparams.widthFactor = 0.0F;
	//  187  358:aload           10
	//  188  360:fconst_0        
	//  189  361:putfield        #788 <Field float ViewPager$LayoutParams.widthFactor>
			}

	//  190  364:iload_1         
	//  191  365:iconst_1        
	//  192  366:iadd            
	//  193  367:istore_1        
	//* 194  368:goto            332
			setCurrentItemInternal(k, false, true);
	//  195  371:aload_0         
	//  196  372:iload_2         
	//  197  373:iconst_0        
	//  198  374:iconst_1        
	//  199  375:invokevirtual   #792 <Method void setCurrentItemInternal(int, boolean, boolean)>
			requestLayout();
	//  200  378:aload_0         
	//  201  379:invokevirtual   #795 <Method void requestLayout()>
		}
	//  202  382:return          
	}

	public boolean dispatchKeyEvent(KeyEvent keyevent)
	{
		return super.dispatchKeyEvent(keyevent) || executeKeyEvent(keyevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #799 <Method boolean ViewGroup.dispatchKeyEvent(KeyEvent)>
	//    3    5:ifne            21
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #802 <Method boolean executeKeyEvent(KeyEvent)>
	//    7   13:ifeq            19
	//    8   16:goto            21
	//    9   19:iconst_0        
	//   10   20:ireturn         
	//   11   21:iconst_1        
	//   12   22:ireturn         
	}

	public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		if(accessibilityevent.getEventType() == 4096)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #809 <Method int AccessibilityEvent.getEventType()>
	//*   2    4:sipush          4096
	//*   3    7:icmpne          16
			return super.dispatchPopulateAccessibilityEvent(accessibilityevent);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:invokespecial   #811 <Method boolean ViewGroup.dispatchPopulateAccessibilityEvent(AccessibilityEvent)>
	//    7   15:ireturn         
		int j = getChildCount();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #367 <Method int getChildCount()>
	//   10   20:istore_3        
		for(int i = 0; i < j; i++)
	//*  11   21:iconst_0        
	//*  12   22:istore_2        
	//*  13   23:iload_2         
	//*  14   24:iload_3         
	//*  15   25:icmpge          86
		{
			View view = getChildAt(i);
	//   16   28:aload_0         
	//   17   29:iload_2         
	//   18   30:invokevirtual   #373 <Method View getChildAt(int)>
	//   19   33:astore          4
			if(view.getVisibility() != 0)
				continue;
	//   20   35:aload           4
	//   21   37:invokevirtual   #588 <Method int View.getVisibility()>
	//   22   40:ifne            79
			ItemInfo iteminfo = infoForChild(view);
	//   23   43:aload_0         
	//   24   44:aload           4
	//   25   46:invokevirtual   #592 <Method ViewPager$ItemInfo infoForChild(View)>
	//   26   49:astore          5
			if(iteminfo != null && iteminfo.position == mCurItem && view.dispatchPopulateAccessibilityEvent(accessibilityevent))
	//*  27   51:aload           5
	//*  28   53:ifnull          79
	//*  29   56:aload           5
	//*  30   58:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  31   61:aload_0         
	//*  32   62:getfield        #330 <Field int mCurItem>
	//*  33   65:icmpne          79
	//*  34   68:aload           4
	//*  35   70:aload_1         
	//*  36   71:invokevirtual   #812 <Method boolean View.dispatchPopulateAccessibilityEvent(AccessibilityEvent)>
	//*  37   74:ifeq            79
				return true;
	//   38   77:iconst_1        
	//   39   78:ireturn         
		}

	//   40   79:iload_2         
	//   41   80:iconst_1        
	//   42   81:iadd            
	//   43   82:istore_2        
	//*  44   83:goto            23
		return false;
	//   45   86:iconst_0        
	//   46   87:ireturn         
	}

	float distanceInfluenceForSnapDuration(float f)
	{
		return (float)Math.sin((f - 0.5F) * 0.4712389F);
	//    0    0:fload_1         
	//    1    1:ldc2            #814 <Float 0.5F>
	//    2    4:fsub            
	//    3    5:ldc2            #815 <Float 0.4712389F>
	//    4    8:fmul            
	//    5    9:f2d             
	//    6   10:invokestatic    #819 <Method double Math.sin(double)>
	//    7   13:d2f             
	//    8   14:freturn         
	}

	public void draw(Canvas canvas)
	{
		int j;
label0:
		{
			int i;
label1:
			{
				super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #823 <Method void ViewGroup.draw(Canvas)>
				int k = getOverScrollMode();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #826 <Method int getOverScrollMode()>
	//    5    9:istore          4
				j = 0;
	//    6   11:iconst_0        
	//    7   12:istore_3        
				i = 0;
	//    8   13:iconst_0        
	//    9   14:istore_2        
				if(k == 0)
					break label1;
	//   10   15:iload           4
	//   11   17:ifeq            66
				if(k == 1)
	//*  12   20:iload           4
	//*  13   22:iconst_1        
	//*  14   23:icmpne          49
				{
					PagerAdapter pageradapter = mAdapter;
	//   15   26:aload_0         
	//   16   27:getfield        #233 <Field PagerAdapter mAdapter>
	//   17   30:astore          8
					if(pageradapter != null && pageradapter.getCount() > 1)
	//*  18   32:aload           8
	//*  19   34:ifnull          49
	//*  20   37:aload           8
	//*  21   39:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//*  22   42:iconst_1        
	//*  23   43:icmple          49
						break label1;
	//   24   46:goto            66
				}
				mLeftEdge.finish();
	//   25   49:aload_0         
	//   26   50:getfield        #496 <Field EdgeEffect mLeftEdge>
	//   27   53:invokevirtual   #829 <Method void EdgeEffect.finish()>
				mRightEdge.finish();
	//   28   56:aload_0         
	//   29   57:getfield        #507 <Field EdgeEffect mRightEdge>
	//   30   60:invokevirtual   #829 <Method void EdgeEffect.finish()>
				break label0;
	//   31   63:goto            256
			}
			if(!mLeftEdge.isFinished())
	//*  32   66:aload_0         
	//*  33   67:getfield        #496 <Field EdgeEffect mLeftEdge>
	//*  34   70:invokevirtual   #551 <Method boolean EdgeEffect.isFinished()>
	//*  35   73:ifne            155
			{
				j = canvas.save();
	//   36   76:aload_1         
	//   37   77:invokevirtual   #834 <Method int Canvas.save()>
	//   38   80:istore_3        
				i = getHeight() - getPaddingTop() - getPaddingBottom();
	//   39   81:aload_0         
	//   40   82:invokevirtual   #837 <Method int getHeight()>
	//   41   85:aload_0         
	//   42   86:invokevirtual   #840 <Method int getPaddingTop()>
	//   43   89:isub            
	//   44   90:aload_0         
	//   45   91:invokevirtual   #843 <Method int getPaddingBottom()>
	//   46   94:isub            
	//   47   95:istore_2        
				int l = getWidth();
	//   48   96:aload_0         
	//   49   97:invokevirtual   #462 <Method int getWidth()>
	//   50  100:istore          4
				canvas.rotate(270F);
	//   51  102:aload_1         
	//   52  103:ldc2            #844 <Float 270F>
	//   53  106:invokevirtual   #847 <Method void Canvas.rotate(float)>
				canvas.translate(-i + getPaddingTop(), mFirstOffset * (float)l);
	//   54  109:aload_1         
	//   55  110:iload_2         
	//   56  111:ineg            
	//   57  112:aload_0         
	//   58  113:invokevirtual   #840 <Method int getPaddingTop()>
	//   59  116:iadd            
	//   60  117:i2f             
	//   61  118:aload_0         
	//   62  119:getfield        #203 <Field float mFirstOffset>
	//   63  122:iload           4
	//   64  124:i2f             
	//   65  125:fmul            
	//   66  126:invokevirtual   #851 <Method void Canvas.translate(float, float)>
				mLeftEdge.setSize(i, l);
	//   67  129:aload_0         
	//   68  130:getfield        #496 <Field EdgeEffect mLeftEdge>
	//   69  133:iload_2         
	//   70  134:iload           4
	//   71  136:invokevirtual   #854 <Method void EdgeEffect.setSize(int, int)>
				i = ((int) (false | mLeftEdge.draw(canvas)));
	//   72  139:iconst_0        
	//   73  140:aload_0         
	//   74  141:getfield        #496 <Field EdgeEffect mLeftEdge>
	//   75  144:aload_1         
	//   76  145:invokevirtual   #857 <Method boolean EdgeEffect.draw(Canvas)>
	//   77  148:ior             
	//   78  149:istore_2        
				canvas.restoreToCount(j);
	//   79  150:aload_1         
	//   80  151:iload_3         
	//   81  152:invokevirtual   #860 <Method void Canvas.restoreToCount(int)>
			}
			j = i;
	//   82  155:iload_2         
	//   83  156:istore_3        
			if(!mRightEdge.isFinished())
	//*  84  157:aload_0         
	//*  85  158:getfield        #507 <Field EdgeEffect mRightEdge>
	//*  86  161:invokevirtual   #551 <Method boolean EdgeEffect.isFinished()>
	//*  87  164:ifne            256
			{
				int i1 = canvas.save();
	//   88  167:aload_1         
	//   89  168:invokevirtual   #834 <Method int Canvas.save()>
	//   90  171:istore          4
				j = getWidth();
	//   91  173:aload_0         
	//   92  174:invokevirtual   #462 <Method int getWidth()>
	//   93  177:istore_3        
				int j1 = getHeight();
	//   94  178:aload_0         
	//   95  179:invokevirtual   #837 <Method int getHeight()>
	//   96  182:istore          5
				int k1 = getPaddingTop();
	//   97  184:aload_0         
	//   98  185:invokevirtual   #840 <Method int getPaddingTop()>
	//   99  188:istore          6
				int l1 = getPaddingBottom();
	//  100  190:aload_0         
	//  101  191:invokevirtual   #843 <Method int getPaddingBottom()>
	//  102  194:istore          7
				canvas.rotate(90F);
	//  103  196:aload_1         
	//  104  197:ldc2            #861 <Float 90F>
	//  105  200:invokevirtual   #847 <Method void Canvas.rotate(float)>
				canvas.translate(-getPaddingTop(), -(mLastOffset + 1.0F) * (float)j);
	//  106  203:aload_1         
	//  107  204:aload_0         
	//  108  205:invokevirtual   #840 <Method int getPaddingTop()>
	//  109  208:ineg            
	//  110  209:i2f             
	//  111  210:aload_0         
	//  112  211:getfield        #206 <Field float mLastOffset>
	//  113  214:fconst_1        
	//  114  215:fadd            
	//  115  216:fneg            
	//  116  217:iload_3         
	//  117  218:i2f             
	//  118  219:fmul            
	//  119  220:invokevirtual   #851 <Method void Canvas.translate(float, float)>
				mRightEdge.setSize(j1 - k1 - l1, j);
	//  120  223:aload_0         
	//  121  224:getfield        #507 <Field EdgeEffect mRightEdge>
	//  122  227:iload           5
	//  123  229:iload           6
	//  124  231:isub            
	//  125  232:iload           7
	//  126  234:isub            
	//  127  235:iload_3         
	//  128  236:invokevirtual   #854 <Method void EdgeEffect.setSize(int, int)>
				j = i | mRightEdge.draw(canvas);
	//  129  239:iload_2         
	//  130  240:aload_0         
	//  131  241:getfield        #507 <Field EdgeEffect mRightEdge>
	//  132  244:aload_1         
	//  133  245:invokevirtual   #857 <Method boolean EdgeEffect.draw(Canvas)>
	//  134  248:ior             
	//  135  249:istore_3        
				canvas.restoreToCount(i1);
	//  136  250:aload_1         
	//  137  251:iload           4
	//  138  253:invokevirtual   #860 <Method void Canvas.restoreToCount(int)>
			}
		}
		if(j != 0)
	//* 139  256:iload_3         
	//* 140  257:ifeq            264
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//  141  260:aload_0         
	//  142  261:invokestatic    #766 <Method void ViewCompat.postInvalidateOnAnimation(View)>
	//  143  264:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #864 <Method void ViewGroup.drawableStateChanged()>
		Drawable drawable = mMarginDrawable;
	//    2    4:aload_0         
	//    3    5:getfield        #866 <Field Drawable mMarginDrawable>
	//    4    8:astore_1        
		if(drawable != null && drawable.isStateful())
	//*   5    9:aload_1         
	//*   6   10:ifnull          29
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #871 <Method boolean Drawable.isStateful()>
	//*   9   17:ifeq            29
			drawable.setState(getDrawableState());
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:invokevirtual   #875 <Method int[] getDrawableState()>
	//   13   25:invokevirtual   #879 <Method boolean Drawable.setState(int[])>
	//   14   28:pop             
	//   15   29:return          
	}

	public void endFakeDrag()
	{
		if(mFakeDragging)
	//*   0    0:aload_0         
	//*   1    1:getfield        #718 <Field boolean mFakeDragging>
	//*   2    4:ifeq            119
		{
			if(mAdapter != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #233 <Field PagerAdapter mAdapter>
	//*   5   11:ifnull          109
			{
				Object obj = ((Object) (mVelocityTracker));
	//    6   14:aload_0         
	//    7   15:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//    8   18:astore          4
				((VelocityTracker) (obj)).computeCurrentVelocity(1000, mMaximumVelocity);
	//    9   20:aload           4
	//   10   22:sipush          1000
	//   11   25:aload_0         
	//   12   26:getfield        #882 <Field int mMaximumVelocity>
	//   13   29:i2f             
	//   14   30:invokevirtual   #886 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
				int i = (int)((VelocityTracker) (obj)).getXVelocity(mActivePointerId);
	//   15   33:aload           4
	//   16   35:aload_0         
	//   17   36:getfield        #210 <Field int mActivePointerId>
	//   18   39:invokevirtual   #889 <Method float VelocityTracker.getXVelocity(int)>
	//   19   42:f2i             
	//   20   43:istore_1        
				mPopulatePending = true;
	//   21   44:aload_0         
	//   22   45:iconst_1        
	//   23   46:putfield        #302 <Field boolean mPopulatePending>
				int j = getClientWidth();
	//   24   49:aload_0         
	//   25   50:invokespecial   #242 <Method int getClientWidth()>
	//   26   53:istore_2        
				int k = getScrollX();
	//   27   54:aload_0         
	//   28   55:invokevirtual   #283 <Method int getScrollX()>
	//   29   58:istore_3        
				obj = ((Object) (infoForCurrentScrollPosition()));
	//   30   59:aload_0         
	//   31   60:invokespecial   #492 <Method ViewPager$ItemInfo infoForCurrentScrollPosition()>
	//   32   63:astore          4
				setCurrentItemInternal(determineTargetPage(((ItemInfo) (obj)).position, ((float)k / (float)j - ((ItemInfo) (obj)).offset) / ((ItemInfo) (obj)).widthFactor, i, (int)(mLastMotionX - mInitialMotionX)), true, true, i);
	//   33   65:aload_0         
	//   34   66:aload_0         
	//   35   67:aload           4
	//   36   69:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//   37   72:iload_3         
	//   38   73:i2f             
	//   39   74:iload_2         
	//   40   75:i2f             
	//   41   76:fdiv            
	//   42   77:aload           4
	//   43   79:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   44   82:fsub            
	//   45   83:aload           4
	//   46   85:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//   47   88:fdiv            
	//   48   89:iload_1         
	//   49   90:aload_0         
	//   50   91:getfield        #477 <Field float mLastMotionX>
	//   51   94:aload_0         
	//   52   95:getfield        #723 <Field float mInitialMotionX>
	//   53   98:fsub            
	//   54   99:f2i             
	//   55  100:invokespecial   #891 <Method int determineTargetPage(int, float, int, int)>
	//   56  103:iconst_1        
	//   57  104:iconst_1        
	//   58  105:iload_1         
	//   59  106:invokevirtual   #894 <Method void setCurrentItemInternal(int, boolean, boolean, int)>
			}
			endDrag();
	//   60  109:aload_0         
	//   61  110:invokespecial   #547 <Method void endDrag()>
			mFakeDragging = false;
	//   62  113:aload_0         
	//   63  114:iconst_0        
	//   64  115:putfield        #718 <Field boolean mFakeDragging>
			return;
	//   65  118:return          
		} else
		{
			throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
	//   66  119:new             #485 <Class IllegalStateException>
	//   67  122:dup             
	//   68  123:ldc2            #896 <String "No fake drag in progress. Call beginFakeDrag first.">
	//   69  126:invokespecial   #490 <Method void IllegalStateException(String)>
	//   70  129:athrow          
		}
	}

	public boolean executeKeyEvent(KeyEvent keyevent)
	{
		if(keyevent.getAction() == 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #901 <Method int KeyEvent.getAction()>
	//*   2    4:ifne            110
		{
			int i = keyevent.getKeyCode();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #904 <Method int KeyEvent.getKeyCode()>
	//    5   11:istore_2        
			if(i != 61)
	//*   6   12:iload_2         
	//*   7   13:bipush          61
	//*   8   15:icmpeq          83
			{
				switch(i)
	//*   9   18:iload_2         
				{
	//*  10   19:tableswitch     21 22: default 40
	//	               21 63
	//	               22 43
	//*  11   40:goto            110
				case 22: // '\026'
					if(keyevent.hasModifiers(2))
	//*  12   43:aload_1         
	//*  13   44:iconst_2        
	//*  14   45:invokevirtual   #907 <Method boolean KeyEvent.hasModifiers(int)>
	//*  15   48:ifeq            56
						return pageRight();
	//   16   51:aload_0         
	//   17   52:invokevirtual   #707 <Method boolean pageRight()>
	//   18   55:ireturn         
					else
						return arrowScroll(66);
	//   19   56:aload_0         
	//   20   57:bipush          66
	//   21   59:invokevirtual   #909 <Method boolean arrowScroll(int)>
	//   22   62:ireturn         

				case 21: // '\025'
					if(keyevent.hasModifiers(2))
	//*  23   63:aload_1         
	//*  24   64:iconst_2        
	//*  25   65:invokevirtual   #907 <Method boolean KeyEvent.hasModifiers(int)>
	//*  26   68:ifeq            76
						return pageLeft();
	//   27   71:aload_0         
	//   28   72:invokevirtual   #701 <Method boolean pageLeft()>
	//   29   75:ireturn         
					else
						return arrowScroll(17);
	//   30   76:aload_0         
	//   31   77:bipush          17
	//   32   79:invokevirtual   #909 <Method boolean arrowScroll(int)>
	//   33   82:ireturn         
				}
			} else
			{
				if(keyevent.hasNoModifiers())
	//*  34   83:aload_1         
	//*  35   84:invokevirtual   #912 <Method boolean KeyEvent.hasNoModifiers()>
	//*  36   87:ifeq            96
					return arrowScroll(2);
	//   37   90:aload_0         
	//   38   91:iconst_2        
	//   39   92:invokevirtual   #909 <Method boolean arrowScroll(int)>
	//   40   95:ireturn         
				if(keyevent.hasModifiers(1))
	//*  41   96:aload_1         
	//*  42   97:iconst_1        
	//*  43   98:invokevirtual   #907 <Method boolean KeyEvent.hasModifiers(int)>
	//*  44  101:ifeq            110
					return arrowScroll(1);
	//   45  104:aload_0         
	//   46  105:iconst_1        
	//   47  106:invokevirtual   #909 <Method boolean arrowScroll(int)>
	//   48  109:ireturn         
			}
		}
		return false;
	//   49  110:iconst_0        
	//   50  111:ireturn         
	}

	public void fakeDragBy(float f)
	{
		if(mFakeDragging)
	//*   0    0:aload_0         
	//*   1    1:getfield        #718 <Field boolean mFakeDragging>
	//*   2    4:ifeq            229
		{
			if(mAdapter == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #233 <Field PagerAdapter mAdapter>
	//*   5   11:ifnonnull       15
				return;
	//    6   14:return          
			mLastMotionX = mLastMotionX + f;
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #477 <Field float mLastMotionX>
	//   10   20:fload_1         
	//   11   21:fadd            
	//   12   22:putfield        #477 <Field float mLastMotionX>
			float f2 = (float)getScrollX() - f;
	//   13   25:aload_0         
	//   14   26:invokevirtual   #283 <Method int getScrollX()>
	//   15   29:i2f             
	//   16   30:fload_1         
	//   17   31:fsub            
	//   18   32:fstore_3        
			float f3 = getClientWidth();
	//   19   33:aload_0         
	//   20   34:invokespecial   #242 <Method int getClientWidth()>
	//   21   37:i2f             
	//   22   38:fstore          4
			f = mFirstOffset * f3;
	//   23   40:aload_0         
	//   24   41:getfield        #203 <Field float mFirstOffset>
	//   25   44:fload           4
	//   26   46:fmul            
	//   27   47:fstore_1        
			float f1 = mLastOffset * f3;
	//   28   48:aload_0         
	//   29   49:getfield        #206 <Field float mLastOffset>
	//   30   52:fload           4
	//   31   54:fmul            
	//   32   55:fstore_2        
			Object obj = ((Object) ((ItemInfo)mItems.get(0)));
	//   33   56:aload_0         
	//   34   57:getfield        #186 <Field ArrayList mItems>
	//   35   60:iconst_0        
	//   36   61:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   37   64:checkcast       #17  <Class ViewPager$ItemInfo>
	//   38   67:astore          8
			Object obj1 = ((Object) (mItems));
	//   39   69:aload_0         
	//   40   70:getfield        #186 <Field ArrayList mItems>
	//   41   73:astore          9
			obj1 = ((Object) ((ItemInfo)((ArrayList) (obj1)).get(((ArrayList) (obj1)).size() - 1)));
	//   42   75:aload           9
	//   43   77:aload           9
	//   44   79:invokevirtual   #256 <Method int ArrayList.size()>
	//   45   82:iconst_1        
	//   46   83:isub            
	//   47   84:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   48   87:checkcast       #17  <Class ViewPager$ItemInfo>
	//   49   90:astore          9
			if(((ItemInfo) (obj)).position != 0)
	//*  50   92:aload           8
	//*  51   94:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  52   97:ifeq            109
				f = ((ItemInfo) (obj)).offset * f3;
	//   53  100:aload           8
	//   54  102:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   55  105:fload           4
	//   56  107:fmul            
	//   57  108:fstore_1        
			if(((ItemInfo) (obj1)).position != mAdapter.getCount() - 1)
	//*  58  109:aload           9
	//*  59  111:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  60  114:aload_0         
	//*  61  115:getfield        #233 <Field PagerAdapter mAdapter>
	//*  62  118:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//*  63  121:iconst_1        
	//*  64  122:isub            
	//*  65  123:icmpeq          135
				f1 = ((ItemInfo) (obj1)).offset * f3;
	//   66  126:aload           9
	//   67  128:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   68  131:fload           4
	//   69  133:fmul            
	//   70  134:fstore_2        
			if(f2 >= f)
	//*  71  135:fload_3         
	//*  72  136:fload_1         
	//*  73  137:fcmpg           
	//*  74  138:ifge            144
	//*  75  141:goto            154
			{
				f = f2;
	//   76  144:fload_3         
	//   77  145:fstore_1        
				if(f2 > f1)
	//*  78  146:fload_3         
	//*  79  147:fload_2         
	//*  80  148:fcmpl           
	//*  81  149:ifle            154
					f = f1;
	//   82  152:fload_2         
	//   83  153:fstore_1        
			}
			f1 = mLastMotionX;
	//   84  154:aload_0         
	//   85  155:getfield        #477 <Field float mLastMotionX>
	//   86  158:fstore_2        
			int i = (int)f;
	//   87  159:fload_1         
	//   88  160:f2i             
	//   89  161:istore          5
			mLastMotionX = f1 + (f - (float)i);
	//   90  163:aload_0         
	//   91  164:fload_2         
	//   92  165:fload_1         
	//   93  166:iload           5
	//   94  168:i2f             
	//   95  169:fsub            
	//   96  170:fadd            
	//   97  171:putfield        #477 <Field float mLastMotionX>
			scrollTo(i, getScrollY());
	//   98  174:aload_0         
	//   99  175:iload           5
	//  100  177:aload_0         
	//  101  178:invokevirtual   #286 <Method int getScrollY()>
	//  102  181:invokevirtual   #296 <Method void scrollTo(int, int)>
			pageScrolled(i);
	//  103  184:aload_0         
	//  104  185:iload           5
	//  105  187:invokespecial   #300 <Method boolean pageScrolled(int)>
	//  106  190:pop             
			long l = SystemClock.uptimeMillis();
	//  107  191:invokestatic    #733 <Method long SystemClock.uptimeMillis()>
	//  108  194:lstore          6
			obj = ((Object) (MotionEvent.obtain(mFakeDragBeginTime, l, 2, mLastMotionX, 0.0F, 0)));
	//  109  196:aload_0         
	//  110  197:getfield        #742 <Field long mFakeDragBeginTime>
	//  111  200:lload           6
	//  112  202:iconst_2        
	//  113  203:aload_0         
	//  114  204:getfield        #477 <Field float mLastMotionX>
	//  115  207:fconst_0        
	//  116  208:iconst_0        
	//  117  209:invokestatic    #736 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//  118  212:astore          8
			mVelocityTracker.addMovement(((MotionEvent) (obj)));
	//  119  214:aload_0         
	//  120  215:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//  121  218:aload           8
	//  122  220:invokevirtual   #739 <Method void VelocityTracker.addMovement(MotionEvent)>
			((MotionEvent) (obj)).recycle();
	//  123  223:aload           8
	//  124  225:invokevirtual   #740 <Method void MotionEvent.recycle()>
			return;
	//  125  228:return          
		} else
		{
			throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
	//  126  229:new             #485 <Class IllegalStateException>
	//  127  232:dup             
	//  128  233:ldc2            #896 <String "No fake drag in progress. Call beginFakeDrag first.">
	//  129  236:invokespecial   #490 <Method void IllegalStateException(String)>
	//  130  239:athrow          
		}
	}

	protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams()));
	//    0    0:new             #20  <Class ViewPager$LayoutParams>
	//    1    3:dup             
	//    2    4:invokespecial   #915 <Method void ViewPager$LayoutParams()>
	//    3    7:areturn         
	}

	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(getContext(), attributeset)));
	//    0    0:new             #20  <Class ViewPager$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #920 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #921 <Method void ViewPager$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return generateDefaultLayoutParams();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #923 <Method android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()>
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
	//*   3    3:getfield        #566 <Field int mDrawingOrder>
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
	//   13   17:getfield        #568 <Field ArrayList mDrawingOrderedChildren>
	//   14   20:iload_3         
	//   15   21:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   16   24:checkcast       #375 <Class View>
	//   17   27:invokevirtual   #531 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   18   30:checkcast       #20  <Class ViewPager$LayoutParams>
	//   19   33:getfield        #930 <Field int ViewPager$LayoutParams.childIndex>
	//   20   36:ireturn         
	}

	public int getCurrentItem()
	{
		return mCurItem;
	//    0    0:aload_0         
	//    1    1:getfield        #330 <Field int mCurItem>
	//    2    4:ireturn         
	}

	public int getOffscreenPageLimit()
	{
		return mOffscreenPageLimit;
	//    0    0:aload_0         
	//    1    1:getfield        #208 <Field int mOffscreenPageLimit>
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
	//*   5    7:if_acmpeq       34
			{
				if(viewparent != null && (viewparent instanceof View))
	//*   6   10:aload_2         
	//*   7   11:ifnull          32
	//*   8   14:aload_2         
	//*   9   15:instanceof      #375 <Class View>
	//*  10   18:ifne            24
	//*  11   21:goto            32
					view = (View)viewparent;
	//   12   24:aload_2         
	//   13   25:checkcast       #375 <Class View>
	//   14   28:astore_1        
				else
	//*  15   29:goto            0
					return null;
	//   16   32:aconst_null     
	//   17   33:areturn         
			} else
			{
				return infoForChild(view);
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #592 <Method ViewPager$ItemInfo infoForChild(View)>
	//   21   39:areturn         
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
	//*   4    4:getfield        #186 <Field ArrayList mItems>
	//*   5    7:invokevirtual   #256 <Method int ArrayList.size()>
	//*   6   10:icmpge          49
		{
			ItemInfo iteminfo = (ItemInfo)mItems.get(i);
	//    7   13:aload_0         
	//    8   14:getfield        #186 <Field ArrayList mItems>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #17  <Class ViewPager$ItemInfo>
	//   12   24:astore_3        
			if(mAdapter.isViewFromObject(view, iteminfo.object))
	//*  13   25:aload_0         
	//*  14   26:getfield        #233 <Field PagerAdapter mAdapter>
	//*  15   29:aload_1         
	//*  16   30:aload_3         
	//*  17   31:getfield        #616 <Field Object ViewPager$ItemInfo.object>
	//*  18   34:invokevirtual   #937 <Method boolean PagerAdapter.isViewFromObject(View, Object)>
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
	//*   4    4:getfield        #186 <Field ArrayList mItems>
	//*   5    7:invokevirtual   #256 <Method int ArrayList.size()>
	//*   6   10:icmpge          42
		{
			ItemInfo iteminfo = (ItemInfo)mItems.get(j);
	//    7   13:aload_0         
	//    8   14:getfield        #186 <Field ArrayList mItems>
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
	//    2    2:invokevirtual   #940 <Method void setWillNotDraw(boolean)>
		setDescendantFocusability(0x40000);
	//    3    5:aload_0         
	//    4    6:ldc2            #595 <Int 0x40000>
	//    5    9:invokevirtual   #943 <Method void setDescendantFocusability(int)>
		setFocusable(true);
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #946 <Method void setFocusable(boolean)>
		Context context = getContext();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #920 <Method Context getContext()>
	//   11   21:astore_2        
		mScroller = new Scroller(context, sInterpolator);
	//   12   22:aload_0         
	//   13   23:new             #273 <Class Scroller>
	//   14   26:dup             
	//   15   27:aload_2         
	//   16   28:getstatic       #173 <Field Interpolator sInterpolator>
	//   17   31:invokespecial   #949 <Method void Scroller(Context, Interpolator)>
	//   18   34:putfield        #271 <Field Scroller mScroller>
		ViewConfiguration viewconfiguration = ViewConfiguration.get(context);
	//   19   37:aload_2         
	//   20   38:invokestatic    #954 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   21   41:astore_3        
		float f = context.getResources().getDisplayMetrics().density;
	//   22   42:aload_2         
	//   23   43:invokevirtual   #960 <Method Resources Context.getResources()>
	//   24   46:invokevirtual   #966 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   25   49:getfield        #971 <Field float DisplayMetrics.density>
	//   26   52:fstore_1        
		mTouchSlop = viewconfiguration.getScaledPagingTouchSlop();
	//   27   53:aload_0         
	//   28   54:aload_3         
	//   29   55:invokevirtual   #974 <Method int ViewConfiguration.getScaledPagingTouchSlop()>
	//   30   58:putfield        #976 <Field int mTouchSlop>
		mMinimumVelocity = (int)(400F * f);
	//   31   61:aload_0         
	//   32   62:ldc2            #977 <Float 400F>
	//   33   65:fload_1         
	//   34   66:fmul            
	//   35   67:f2i             
	//   36   68:putfield        #328 <Field int mMinimumVelocity>
		mMaximumVelocity = viewconfiguration.getScaledMaximumFlingVelocity();
	//   37   71:aload_0         
	//   38   72:aload_3         
	//   39   73:invokevirtual   #980 <Method int ViewConfiguration.getScaledMaximumFlingVelocity()>
	//   40   76:putfield        #882 <Field int mMaximumVelocity>
		mLeftEdge = new EdgeEffect(context);
	//   41   79:aload_0         
	//   42   80:new             #501 <Class EdgeEffect>
	//   43   83:dup             
	//   44   84:aload_2         
	//   45   85:invokespecial   #981 <Method void EdgeEffect(Context)>
	//   46   88:putfield        #496 <Field EdgeEffect mLeftEdge>
		mRightEdge = new EdgeEffect(context);
	//   47   91:aload_0         
	//   48   92:new             #501 <Class EdgeEffect>
	//   49   95:dup             
	//   50   96:aload_2         
	//   51   97:invokespecial   #981 <Method void EdgeEffect(Context)>
	//   52  100:putfield        #507 <Field EdgeEffect mRightEdge>
		mFlingDistance = (int)(25F * f);
	//   53  103:aload_0         
	//   54  104:ldc2            #982 <Float 25F>
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
	//   64  118:putfield        #984 <Field int mCloseEnough>
		mDefaultGutterSize = (int)(f * 16F);
	//   65  121:aload_0         
	//   66  122:fload_1         
	//   67  123:ldc2            #985 <Float 16F>
	//   68  126:fmul            
	//   69  127:f2i             
	//   70  128:putfield        #987 <Field int mDefaultGutterSize>
		ViewCompat.setAccessibilityDelegate(((View) (this)), ((AccessibilityDelegateCompat) (new MyAccessibilityDelegate())));
	//   71  131:aload_0         
	//   72  132:new             #23  <Class ViewPager$MyAccessibilityDelegate>
	//   73  135:dup             
	//   74  136:aload_0         
	//   75  137:invokespecial   #988 <Method void ViewPager$MyAccessibilityDelegate(ViewPager)>
	//   76  140:invokestatic    #992 <Method void ViewCompat.setAccessibilityDelegate(View, AccessibilityDelegateCompat)>
		if(ViewCompat.getImportantForAccessibility(((View) (this))) == 0)
	//*  77  143:aload_0         
	//*  78  144:invokestatic    #996 <Method int ViewCompat.getImportantForAccessibility(View)>
	//*  79  147:ifne            155
			ViewCompat.setImportantForAccessibility(((View) (this)), 1);
	//   80  150:aload_0         
	//   81  151:iconst_1        
	//   82  152:invokestatic    #1000 <Method void ViewCompat.setImportantForAccessibility(View, int)>
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
	//   87  161:invokespecial   #1001 <Method void ViewPager$4(ViewPager)>
	//   88  164:invokestatic    #1005 <Method void ViewCompat.setOnApplyWindowInsetsListener(View, OnApplyWindowInsetsListener)>
	//   89  167:return          
	}

	public boolean isFakeDragging()
	{
		return mFakeDragging;
	//    0    0:aload_0         
	//    1    1:getfield        #718 <Field boolean mFakeDragging>
	//    2    4:ireturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1009 <Method void ViewGroup.onAttachedToWindow()>
		mFirstLayout = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #212 <Field boolean mFirstLayout>
	//    5    9:return          
	}

	protected void onDetachedFromWindow()
	{
		removeCallbacks(mEndScrollRunnable);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #219 <Field Runnable mEndScrollRunnable>
	//    3    5:invokevirtual   #1014 <Method boolean removeCallbacks(Runnable)>
	//    4    8:pop             
		Scroller scroller = mScroller;
	//    5    9:aload_0         
	//    6   10:getfield        #271 <Field Scroller mScroller>
	//    7   13:astore_1        
		if(scroller != null && !scroller.isFinished())
	//*   8   14:aload_1         
	//*   9   15:ifnull          32
	//*  10   18:aload_1         
	//*  11   19:invokevirtual   #277 <Method boolean Scroller.isFinished()>
	//*  12   22:ifne            32
			mScroller.abortAnimation();
	//   13   25:aload_0         
	//   14   26:getfield        #271 <Field Scroller mScroller>
	//   15   29:invokevirtual   #280 <Method void Scroller.abortAnimation()>
		super.onDetachedFromWindow();
	//   16   32:aload_0         
	//   17   33:invokespecial   #1016 <Method void ViewGroup.onDetachedFromWindow()>
	//   18   36:return          
	}

	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #1019 <Method void ViewGroup.onDraw(Canvas)>
		if(mPageMargin > 0 && mMarginDrawable != null && mItems.size() > 0 && mAdapter != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #244 <Field int mPageMargin>
	//*   5    9:ifle            333
	//*   6   12:aload_0         
	//*   7   13:getfield        #866 <Field Drawable mMarginDrawable>
	//*   8   16:ifnull          333
	//*   9   19:aload_0         
	//*  10   20:getfield        #186 <Field ArrayList mItems>
	//*  11   23:invokevirtual   #256 <Method int ArrayList.size()>
	//*  12   26:ifle            333
	//*  13   29:aload_0         
	//*  14   30:getfield        #233 <Field PagerAdapter mAdapter>
	//*  15   33:ifnull          333
		{
			int k = getScrollX();
	//   16   36:aload_0         
	//   17   37:invokevirtual   #283 <Method int getScrollX()>
	//   18   40:istore          9
			int l = getWidth();
	//   19   42:aload_0         
	//   20   43:invokevirtual   #462 <Method int getWidth()>
	//   21   46:istore          10
			float f = mPageMargin;
	//   22   48:aload_0         
	//   23   49:getfield        #244 <Field int mPageMargin>
	//   24   52:i2f             
	//   25   53:fstore_2        
			float f4 = l;
	//   26   54:iload           10
	//   27   56:i2f             
	//   28   57:fstore          6
			float f1 = f / f4;
	//   29   59:fload_2         
	//   30   60:fload           6
	//   31   62:fdiv            
	//   32   63:fstore_3        
			Object obj = ((Object) (mItems));
	//   33   64:aload_0         
	//   34   65:getfield        #186 <Field ArrayList mItems>
	//   35   68:astore          13
			int j = 0;
	//   36   70:iconst_0        
	//   37   71:istore          8
			obj = ((Object) ((ItemInfo)((ArrayList) (obj)).get(0)));
	//   38   73:aload           13
	//   39   75:iconst_0        
	//   40   76:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   41   79:checkcast       #17  <Class ViewPager$ItemInfo>
	//   42   82:astore          13
			f = ((ItemInfo) (obj)).offset;
	//   43   84:aload           13
	//   44   86:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   45   89:fstore_2        
			int i1 = mItems.size();
	//   46   90:aload_0         
	//   47   91:getfield        #186 <Field ArrayList mItems>
	//   48   94:invokevirtual   #256 <Method int ArrayList.size()>
	//   49   97:istore          11
			int i = ((ItemInfo) (obj)).position;
	//   50   99:aload           13
	//   51  101:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//   52  104:istore          7
			for(int j1 = ((ItemInfo)mItems.get(i1 - 1)).position; i < j1; i++)
	//*  53  106:aload_0         
	//*  54  107:getfield        #186 <Field ArrayList mItems>
	//*  55  110:iload           11
	//*  56  112:iconst_1        
	//*  57  113:isub            
	//*  58  114:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//*  59  117:checkcast       #17  <Class ViewPager$ItemInfo>
	//*  60  120:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  61  123:istore          12
	//*  62  125:iload           7
	//*  63  127:iload           12
	//*  64  129:icmpge          333
			{
				for(; i > ((ItemInfo) (obj)).position && j < i1; obj = ((Object) ((ItemInfo)((ArrayList) (obj)).get(j))))
	//*  65  132:iload           7
	//*  66  134:aload           13
	//*  67  136:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  68  139:icmple          176
	//*  69  142:iload           8
	//*  70  144:iload           11
	//*  71  146:icmpge          176
				{
					obj = ((Object) (mItems));
	//   72  149:aload_0         
	//   73  150:getfield        #186 <Field ArrayList mItems>
	//   74  153:astore          13
					j++;
	//   75  155:iload           8
	//   76  157:iconst_1        
	//   77  158:iadd            
	//   78  159:istore          8
				}

	//   79  161:aload           13
	//   80  163:iload           8
	//   81  165:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   82  168:checkcast       #17  <Class ViewPager$ItemInfo>
	//   83  171:astore          13
	//*  84  173:goto            132
				float f2;
				if(i == ((ItemInfo) (obj)).position)
	//*  85  176:iload           7
	//*  86  178:aload           13
	//*  87  180:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  88  183:icmpne          219
				{
					f2 = (((ItemInfo) (obj)).offset + ((ItemInfo) (obj)).widthFactor) * f4;
	//   89  186:aload           13
	//   90  188:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   91  191:aload           13
	//   92  193:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//   93  196:fadd            
	//   94  197:fload           6
	//   95  199:fmul            
	//   96  200:fstore          4
					f = ((ItemInfo) (obj)).offset + ((ItemInfo) (obj)).widthFactor + f1;
	//   97  202:aload           13
	//   98  204:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//   99  207:aload           13
	//  100  209:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  101  212:fadd            
	//  102  213:fload_3         
	//  103  214:fadd            
	//  104  215:fstore_2        
				} else
	//* 105  216:goto            254
				{
					float f3 = mAdapter.getPageWidth(i);
	//  106  219:aload_0         
	//  107  220:getfield        #233 <Field PagerAdapter mAdapter>
	//  108  223:iload           7
	//  109  225:invokevirtual   #264 <Method float PagerAdapter.getPageWidth(int)>
	//  110  228:fstore          5
					f2 = f + (f3 + f1);
	//  111  230:fload_2         
	//  112  231:fload           5
	//  113  233:fload_3         
	//  114  234:fadd            
	//  115  235:fadd            
	//  116  236:fstore          4
					f3 = (f + f3) * f4;
	//  117  238:fload_2         
	//  118  239:fload           5
	//  119  241:fadd            
	//  120  242:fload           6
	//  121  244:fmul            
	//  122  245:fstore          5
					f = f2;
	//  123  247:fload           4
	//  124  249:fstore_2        
					f2 = f3;
	//  125  250:fload           5
	//  126  252:fstore          4
				}
				if((float)mPageMargin + f2 > (float)k)
	//* 127  254:aload_0         
	//* 128  255:getfield        #244 <Field int mPageMargin>
	//* 129  258:i2f             
	//* 130  259:fload           4
	//* 131  261:fadd            
	//* 132  262:iload           9
	//* 133  264:i2f             
	//* 134  265:fcmpl           
	//* 135  266:ifle            311
				{
					mMarginDrawable.setBounds(Math.round(f2), mTopPageBounds, Math.round((float)mPageMargin + f2), mBottomPageBounds);
	//  136  269:aload_0         
	//  137  270:getfield        #866 <Field Drawable mMarginDrawable>
	//  138  273:fload           4
	//  139  275:invokestatic    #1023 <Method int Math.round(float)>
	//  140  278:aload_0         
	//  141  279:getfield        #1025 <Field int mTopPageBounds>
	//  142  282:aload_0         
	//  143  283:getfield        #244 <Field int mPageMargin>
	//  144  286:i2f             
	//  145  287:fload           4
	//  146  289:fadd            
	//  147  290:invokestatic    #1023 <Method int Math.round(float)>
	//  148  293:aload_0         
	//  149  294:getfield        #1027 <Field int mBottomPageBounds>
	//  150  297:invokevirtual   #1030 <Method void Drawable.setBounds(int, int, int, int)>
					mMarginDrawable.draw(canvas);
	//  151  300:aload_0         
	//  152  301:getfield        #866 <Field Drawable mMarginDrawable>
	//  153  304:aload_1         
	//  154  305:invokevirtual   #1031 <Method void Drawable.draw(Canvas)>
				}
	//* 155  308:goto            311
				if(f2 > (float)(k + l))
	//* 156  311:fload           4
	//* 157  313:iload           9
	//* 158  315:iload           10
	//* 159  317:iadd            
	//* 160  318:i2f             
	//* 161  319:fcmpl           
	//* 162  320:ifle            324
					return;
	//  163  323:return          
			}

	//  164  324:iload           7
	//  165  326:iconst_1        
	//  166  327:iadd            
	//  167  328:istore          7
		}
	//* 168  330:goto            125
	//  169  333:return          
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		int i = motionevent.getAction() & 0xff;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #1034 <Method int MotionEvent.getAction()>
	//    2    4:sipush          255
	//    3    7:iand            
	//    4    8:istore          7
		if(i != 3 && i != 1)
	//*   5   10:iload           7
	//*   6   12:iconst_3        
	//*   7   13:icmpeq          482
	//*   8   16:iload           7
	//*   9   18:iconst_1        
	//*  10   19:icmpne          25
	//*  11   22:goto            482
		{
			if(i != 0)
	//*  12   25:iload           7
	//*  13   27:ifeq            48
			{
				if(mIsBeingDragged)
	//*  14   30:aload_0         
	//*  15   31:getfield        #382 <Field boolean mIsBeingDragged>
	//*  16   34:ifeq            39
					return true;
	//   17   37:iconst_1        
	//   18   38:ireturn         
				if(mIsUnableToDrag)
	//*  19   39:aload_0         
	//*  20   40:getfield        #384 <Field boolean mIsUnableToDrag>
	//*  21   43:ifeq            48
					return false;
	//   22   46:iconst_0        
	//   23   47:ireturn         
			}
			if(i != 0)
	//*  24   48:iload           7
	//*  25   50:ifeq            321
			{
				if(i != 2)
	//*  26   53:iload           7
	//*  27   55:iconst_2        
	//*  28   56:icmpeq          77
				{
					if(i == 6)
	//*  29   59:iload           7
	//*  30   61:bipush          6
	//*  31   63:icmpeq          69
	//*  32   66:goto            455
						onSecondaryPointerUp(motionevent);
	//   33   69:aload_0         
	//   34   70:aload_1         
	//   35   71:invokespecial   #1036 <Method void onSecondaryPointerUp(MotionEvent)>
				} else
	//*  36   74:goto            455
				{
					int j = mActivePointerId;
	//   37   77:aload_0         
	//   38   78:getfield        #210 <Field int mActivePointerId>
	//   39   81:istore          7
					if(j != -1)
	//*  40   83:iload           7
	//*  41   85:iconst_m1       
	//*  42   86:icmpne          92
	//*  43   89:goto            455
					{
						j = motionevent.findPointerIndex(j);
	//   44   92:aload_1         
	//   45   93:iload           7
	//   46   95:invokevirtual   #1039 <Method int MotionEvent.findPointerIndex(int)>
	//   47   98:istore          7
						float f3 = motionevent.getX(j);
	//   48  100:aload_1         
	//   49  101:iload           7
	//   50  103:invokevirtual   #475 <Method float MotionEvent.getX(int)>
	//   51  106:fstore_3        
						float f = f3 - mLastMotionX;
	//   52  107:fload_3         
	//   53  108:aload_0         
	//   54  109:getfield        #477 <Field float mLastMotionX>
	//   55  112:fsub            
	//   56  113:fstore_2        
						float f5 = Math.abs(f);
	//   57  114:fload_2         
	//   58  115:invokestatic    #499 <Method float Math.abs(float)>
	//   59  118:fstore          5
						float f4 = motionevent.getY(j);
	//   60  120:aload_1         
	//   61  121:iload           7
	//   62  123:invokevirtual   #1042 <Method float MotionEvent.getY(int)>
	//   63  126:fstore          4
						float f6 = Math.abs(f4 - mInitialMotionY);
	//   64  128:fload           4
	//   65  130:aload_0         
	//   66  131:getfield        #1044 <Field float mInitialMotionY>
	//   67  134:fsub            
	//   68  135:invokestatic    #499 <Method float Math.abs(float)>
	//   69  138:fstore          6
						j = f != 0.0F;
	//   70  140:fload_2         
	//   71  141:fconst_0        
	//   72  142:fcmpl           
	//   73  143:istore          7
						if(j != 0 && !isGutterDrag(mLastMotionX, f) && canScroll(((View) (this)), false, (int)f, (int)f3, (int)f4))
	//*  74  145:iload           7
	//*  75  147:ifeq            196
	//*  76  150:aload_0         
	//*  77  151:aload_0         
	//*  78  152:getfield        #477 <Field float mLastMotionX>
	//*  79  155:fload_2         
	//*  80  156:invokespecial   #1046 <Method boolean isGutterDrag(float, float)>
	//*  81  159:ifne            196
	//*  82  162:aload_0         
	//*  83  163:aload_0         
	//*  84  164:iconst_0        
	//*  85  165:fload_2         
	//*  86  166:f2i             
	//*  87  167:fload_3         
	//*  88  168:f2i             
	//*  89  169:fload           4
	//*  90  171:f2i             
	//*  91  172:invokevirtual   #750 <Method boolean canScroll(View, boolean, int, int, int)>
	//*  92  175:ifeq            196
						{
							mLastMotionX = f3;
	//   93  178:aload_0         
	//   94  179:fload_3         
	//   95  180:putfield        #477 <Field float mLastMotionX>
							mLastMotionY = f4;
	//   96  183:aload_0         
	//   97  184:fload           4
	//   98  186:putfield        #1048 <Field float mLastMotionY>
							mIsUnableToDrag = true;
	//   99  189:aload_0         
	//  100  190:iconst_1        
	//  101  191:putfield        #384 <Field boolean mIsUnableToDrag>
							return false;
	//  102  194:iconst_0        
	//  103  195:ireturn         
						}
						if(f5 > (float)mTouchSlop && f5 * 0.5F > f6)
	//* 104  196:fload           5
	//* 105  198:aload_0         
	//* 106  199:getfield        #976 <Field int mTouchSlop>
	//* 107  202:i2f             
	//* 108  203:fcmpl           
	//* 109  204:ifle            283
	//* 110  207:fload           5
	//* 111  209:ldc2            #814 <Float 0.5F>
	//* 112  212:fmul            
	//* 113  213:fload           6
	//* 114  215:fcmpl           
	//* 115  216:ifle            283
						{
							mIsBeingDragged = true;
	//  116  219:aload_0         
	//  117  220:iconst_1        
	//  118  221:putfield        #382 <Field boolean mIsBeingDragged>
							requestParentDisallowInterceptTouchEvent(true);
	//  119  224:aload_0         
	//  120  225:iconst_1        
	//  121  226:invokespecial   #1050 <Method void requestParentDisallowInterceptTouchEvent(boolean)>
							setScrollState(1);
	//  122  229:aload_0         
	//  123  230:iconst_1        
	//  124  231:invokevirtual   #721 <Method void setScrollState(int)>
							float f1;
							if(j > 0)
	//* 125  234:iload           7
	//* 126  236:ifle            253
								f1 = mInitialMotionX + (float)mTouchSlop;
	//  127  239:aload_0         
	//  128  240:getfield        #723 <Field float mInitialMotionX>
	//  129  243:aload_0         
	//  130  244:getfield        #976 <Field int mTouchSlop>
	//  131  247:i2f             
	//  132  248:fadd            
	//  133  249:fstore_2        
							else
	//* 134  250:goto            264
								f1 = mInitialMotionX - (float)mTouchSlop;
	//  135  253:aload_0         
	//  136  254:getfield        #723 <Field float mInitialMotionX>
	//  137  257:aload_0         
	//  138  258:getfield        #976 <Field int mTouchSlop>
	//  139  261:i2f             
	//  140  262:fsub            
	//  141  263:fstore_2        
							mLastMotionX = f1;
	//  142  264:aload_0         
	//  143  265:fload_2         
	//  144  266:putfield        #477 <Field float mLastMotionX>
							mLastMotionY = f4;
	//  145  269:aload_0         
	//  146  270:fload           4
	//  147  272:putfield        #1048 <Field float mLastMotionY>
							setScrollingCacheEnabled(true);
	//  148  275:aload_0         
	//  149  276:iconst_1        
	//  150  277:invokespecial   #269 <Method void setScrollingCacheEnabled(boolean)>
						} else
	//* 151  280:goto            299
						if(f6 > (float)mTouchSlop)
	//* 152  283:fload           6
	//* 153  285:aload_0         
	//* 154  286:getfield        #976 <Field int mTouchSlop>
	//* 155  289:i2f             
	//* 156  290:fcmpl           
	//* 157  291:ifle            299
							mIsUnableToDrag = true;
	//  158  294:aload_0         
	//  159  295:iconst_1        
	//  160  296:putfield        #384 <Field boolean mIsUnableToDrag>
						if(mIsBeingDragged && performDrag(f3))
	//* 161  299:aload_0         
	//* 162  300:getfield        #382 <Field boolean mIsBeingDragged>
	//* 163  303:ifeq            455
	//* 164  306:aload_0         
	//* 165  307:fload_3         
	//* 166  308:invokespecial   #1052 <Method boolean performDrag(float)>
	//* 167  311:ifeq            455
							ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//  168  314:aload_0         
	//  169  315:invokestatic    #766 <Method void ViewCompat.postInvalidateOnAnimation(View)>
					}
				}
			} else
	//* 170  318:goto            455
			{
				float f2 = motionevent.getX();
	//  171  321:aload_1         
	//  172  322:invokevirtual   #1055 <Method float MotionEvent.getX()>
	//  173  325:fstore_2        
				mInitialMotionX = f2;
	//  174  326:aload_0         
	//  175  327:fload_2         
	//  176  328:putfield        #723 <Field float mInitialMotionX>
				mLastMotionX = f2;
	//  177  331:aload_0         
	//  178  332:fload_2         
	//  179  333:putfield        #477 <Field float mLastMotionX>
				f2 = motionevent.getY();
	//  180  336:aload_1         
	//  181  337:invokevirtual   #1057 <Method float MotionEvent.getY()>
	//  182  340:fstore_2        
				mInitialMotionY = f2;
	//  183  341:aload_0         
	//  184  342:fload_2         
	//  185  343:putfield        #1044 <Field float mInitialMotionY>
				mLastMotionY = f2;
	//  186  346:aload_0         
	//  187  347:fload_2         
	//  188  348:putfield        #1048 <Field float mLastMotionY>
				mActivePointerId = motionevent.getPointerId(0);
	//  189  351:aload_0         
	//  190  352:aload_1         
	//  191  353:iconst_0        
	//  192  354:invokevirtual   #472 <Method int MotionEvent.getPointerId(int)>
	//  193  357:putfield        #210 <Field int mActivePointerId>
				mIsUnableToDrag = false;
	//  194  360:aload_0         
	//  195  361:iconst_0        
	//  196  362:putfield        #384 <Field boolean mIsUnableToDrag>
				mIsScrollStarted = true;
	//  197  365:aload_0         
	//  198  366:iconst_1        
	//  199  367:putfield        #759 <Field boolean mIsScrollStarted>
				mScroller.computeScrollOffset();
	//  200  370:aload_0         
	//  201  371:getfield        #271 <Field Scroller mScroller>
	//  202  374:invokevirtual   #762 <Method boolean Scroller.computeScrollOffset()>
	//  203  377:pop             
				if(mScrollState == 2 && Math.abs(mScroller.getFinalX() - mScroller.getCurrX()) > mCloseEnough)
	//* 204  378:aload_0         
	//* 205  379:getfield        #221 <Field int mScrollState>
	//* 206  382:iconst_2        
	//* 207  383:icmpne          445
	//* 208  386:aload_0         
	//* 209  387:getfield        #271 <Field Scroller mScroller>
	//* 210  390:invokevirtual   #1060 <Method int Scroller.getFinalX()>
	//* 211  393:aload_0         
	//* 212  394:getfield        #271 <Field Scroller mScroller>
	//* 213  397:invokevirtual   #289 <Method int Scroller.getCurrX()>
	//* 214  400:isub            
	//* 215  401:invokestatic    #324 <Method int Math.abs(int)>
	//* 216  404:aload_0         
	//* 217  405:getfield        #984 <Field int mCloseEnough>
	//* 218  408:icmple          445
				{
					mScroller.abortAnimation();
	//  219  411:aload_0         
	//  220  412:getfield        #271 <Field Scroller mScroller>
	//  221  415:invokevirtual   #280 <Method void Scroller.abortAnimation()>
					mPopulatePending = false;
	//  222  418:aload_0         
	//  223  419:iconst_0        
	//  224  420:putfield        #302 <Field boolean mPopulatePending>
					populate();
	//  225  423:aload_0         
	//  226  424:invokevirtual   #1063 <Method void populate()>
					mIsBeingDragged = true;
	//  227  427:aload_0         
	//  228  428:iconst_1        
	//  229  429:putfield        #382 <Field boolean mIsBeingDragged>
					requestParentDisallowInterceptTouchEvent(true);
	//  230  432:aload_0         
	//  231  433:iconst_1        
	//  232  434:invokespecial   #1050 <Method void requestParentDisallowInterceptTouchEvent(boolean)>
					setScrollState(1);
	//  233  437:aload_0         
	//  234  438:iconst_1        
	//  235  439:invokevirtual   #721 <Method void setScrollState(int)>
				} else
	//* 236  442:goto            455
				{
					completeScroll(false);
	//  237  445:aload_0         
	//  238  446:iconst_0        
	//  239  447:invokespecial   #526 <Method void completeScroll(boolean)>
					mIsBeingDragged = false;
	//  240  450:aload_0         
	//  241  451:iconst_0        
	//  242  452:putfield        #382 <Field boolean mIsBeingDragged>
				}
			}
			if(mVelocityTracker == null)
	//* 243  455:aload_0         
	//* 244  456:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//* 245  459:ifnonnull       469
				mVelocityTracker = VelocityTracker.obtain();
	//  246  462:aload_0         
	//  247  463:invokestatic    #727 <Method VelocityTracker VelocityTracker.obtain()>
	//  248  466:putfield        #386 <Field VelocityTracker mVelocityTracker>
			mVelocityTracker.addMovement(motionevent);
	//  249  469:aload_0         
	//  250  470:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//  251  473:aload_1         
	//  252  474:invokevirtual   #739 <Method void VelocityTracker.addMovement(MotionEvent)>
			return mIsBeingDragged;
	//  253  477:aload_0         
	//  254  478:getfield        #382 <Field boolean mIsBeingDragged>
	//  255  481:ireturn         
		} else
		{
			resetTouch();
	//  256  482:aload_0         
	//  257  483:invokespecial   #1065 <Method boolean resetTouch()>
	//  258  486:pop             
			return false;
	//  259  487:iconst_0        
	//  260  488:ireturn         
		}
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		int i3 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #367 <Method int getChildCount()>
	//    2    4:istore          14
		int j3 = k - i;
	//    3    6:iload           4
	//    4    8:iload_2         
	//    5    9:isub            
	//    6   10:istore          15
		int k3 = l - j;
	//    7   12:iload           5
	//    8   14:iload_3         
	//    9   15:isub            
	//   10   16:istore          16
		j = getPaddingLeft();
	//   11   18:aload_0         
	//   12   19:invokevirtual   #436 <Method int getPaddingLeft()>
	//   13   22:istore_3        
		i = getPaddingTop();
	//   14   23:aload_0         
	//   15   24:invokevirtual   #840 <Method int getPaddingTop()>
	//   16   27:istore_2        
		int k1 = getPaddingRight();
	//   17   28:aload_0         
	//   18   29:invokevirtual   #439 <Method int getPaddingRight()>
	//   19   32:istore          8
		l = getPaddingBottom();
	//   20   34:aload_0         
	//   21   35:invokevirtual   #843 <Method int getPaddingBottom()>
	//   22   38:istore          5
		int l3 = getScrollX();
	//   23   40:aload_0         
	//   24   41:invokevirtual   #283 <Method int getScrollX()>
	//   25   44:istore          17
		int l1 = 0;
	//   26   46:iconst_0        
	//   27   47:istore          9
		for(int i2 = 0; i2 < i3;)
	//*  28   49:iconst_0        
	//*  29   50:istore          10
	//*  30   52:iload           10
	//*  31   54:iload           14
	//*  32   56:icmpge          402
		{
			View view = getChildAt(i2);
	//   33   59:aload_0         
	//   34   60:iload           10
	//   35   62:invokevirtual   #373 <Method View getChildAt(int)>
	//   36   65:astore          18
			int i1 = j;
	//   37   67:iload_3         
	//   38   68:istore          7
			int l2 = k1;
	//   39   70:iload           8
	//   40   72:istore          13
			int k2 = i;
	//   41   74:iload_2         
	//   42   75:istore          12
			int j2 = l;
	//   43   77:iload           5
	//   44   79:istore          11
			k = l1;
	//   45   81:iload           9
	//   46   83:istore          4
			if(view.getVisibility() != 8)
	//*  47   85:aload           18
	//*  48   87:invokevirtual   #588 <Method int View.getVisibility()>
	//*  49   90:bipush          8
	//*  50   92:icmpeq          375
			{
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   51   95:aload           18
	//   52   97:invokevirtual   #531 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   53  100:checkcast       #20  <Class ViewPager$LayoutParams>
	//   54  103:astore          19
				i1 = j;
	//   55  105:iload_3         
	//   56  106:istore          7
				l2 = k1;
	//   57  108:iload           8
	//   58  110:istore          13
				k2 = i;
	//   59  112:iload_2         
	//   60  113:istore          12
				j2 = l;
	//   61  115:iload           5
	//   62  117:istore          11
				k = l1;
	//   63  119:iload           9
	//   64  121:istore          4
				if(layoutparams.isDecor)
	//*  65  123:aload           19
	//*  66  125:getfield        #534 <Field boolean ViewPager$LayoutParams.isDecor>
	//*  67  128:ifeq            375
				{
					k = layoutparams.gravity & 7;
	//   68  131:aload           19
	//   69  133:getfield        #1070 <Field int ViewPager$LayoutParams.gravity>
	//   70  136:bipush          7
	//   71  138:iand            
	//   72  139:istore          4
					j2 = layoutparams.gravity & 0x70;
	//   73  141:aload           19
	//   74  143:getfield        #1070 <Field int ViewPager$LayoutParams.gravity>
	//   75  146:bipush          112
	//   76  148:iand            
	//   77  149:istore          11
					if(k != 1)
	//*  78  151:iload           4
	//*  79  153:iconst_1        
	//*  80  154:icmpeq          226
					{
						if(k != 3)
	//*  81  157:iload           4
	//*  82  159:iconst_3        
	//*  83  160:icmpeq          207
						{
							if(k != 5)
	//*  84  163:iload           4
	//*  85  165:iconst_5        
	//*  86  166:icmpeq          178
							{
								k = j;
	//   87  169:iload_3         
	//   88  170:istore          4
								i1 = j;
	//   89  172:iload_3         
	//   90  173:istore          7
							} else
	//*  91  175:goto            245
							{
								k = j3 - k1 - view.getMeasuredWidth();
	//   92  178:iload           15
	//   93  180:iload           8
	//   94  182:isub            
	//   95  183:aload           18
	//   96  185:invokevirtual   #1071 <Method int View.getMeasuredWidth()>
	//   97  188:isub            
	//   98  189:istore          4
								k1 += view.getMeasuredWidth();
	//   99  191:iload           8
	//  100  193:aload           18
	//  101  195:invokevirtual   #1071 <Method int View.getMeasuredWidth()>
	//  102  198:iadd            
	//  103  199:istore          8
								i1 = j;
	//  104  201:iload_3         
	//  105  202:istore          7
							}
						} else
	//* 106  204:goto            245
						{
							i1 = view.getMeasuredWidth();
	//  107  207:aload           18
	//  108  209:invokevirtual   #1071 <Method int View.getMeasuredWidth()>
	//  109  212:istore          7
							k = j;
	//  110  214:iload_3         
	//  111  215:istore          4
							i1 += j;
	//  112  217:iload           7
	//  113  219:iload_3         
	//  114  220:iadd            
	//  115  221:istore          7
						}
					} else
	//* 116  223:goto            245
					{
						k = Math.max((j3 - view.getMeasuredWidth()) / 2, j);
	//  117  226:iload           15
	//  118  228:aload           18
	//  119  230:invokevirtual   #1071 <Method int View.getMeasuredWidth()>
	//  120  233:isub            
	//  121  234:iconst_2        
	//  122  235:idiv            
	//  123  236:iload_3         
	//  124  237:invokestatic    #339 <Method int Math.max(int, int)>
	//  125  240:istore          4
						i1 = j;
	//  126  242:iload_3         
	//  127  243:istore          7
					}
					if(j2 != 16)
	//* 128  245:iload           11
	//* 129  247:bipush          16
	//* 130  249:icmpeq          313
					{
						if(j2 != 48)
	//* 131  252:iload           11
	//* 132  254:bipush          48
	//* 133  256:icmpeq          296
						{
							if(j2 != 80)
	//* 134  259:iload           11
	//* 135  261:bipush          80
	//* 136  263:icmpeq          271
							{
								j = i;
	//  137  266:iload_2         
	//  138  267:istore_3        
							} else
	//* 139  268:goto            328
							{
								j = k3 - l - view.getMeasuredHeight();
	//  140  271:iload           16
	//  141  273:iload           5
	//  142  275:isub            
	//  143  276:aload           18
	//  144  278:invokevirtual   #1074 <Method int View.getMeasuredHeight()>
	//  145  281:isub            
	//  146  282:istore_3        
								l += view.getMeasuredHeight();
	//  147  283:iload           5
	//  148  285:aload           18
	//  149  287:invokevirtual   #1074 <Method int View.getMeasuredHeight()>
	//  150  290:iadd            
	//  151  291:istore          5
							}
						} else
	//* 152  293:goto            328
						{
							j2 = view.getMeasuredHeight();
	//  153  296:aload           18
	//  154  298:invokevirtual   #1074 <Method int View.getMeasuredHeight()>
	//  155  301:istore          11
							j = i;
	//  156  303:iload_2         
	//  157  304:istore_3        
							i = j2 + i;
	//  158  305:iload           11
	//  159  307:iload_2         
	//  160  308:iadd            
	//  161  309:istore_2        
						}
					} else
	//* 162  310:goto            328
					{
						j = Math.max((k3 - view.getMeasuredHeight()) / 2, i);
	//  163  313:iload           16
	//  164  315:aload           18
	//  165  317:invokevirtual   #1074 <Method int View.getMeasuredHeight()>
	//  166  320:isub            
	//  167  321:iconst_2        
	//  168  322:idiv            
	//  169  323:iload_2         
	//  170  324:invokestatic    #339 <Method int Math.max(int, int)>
	//  171  327:istore_3        
					}
					k += l3;
	//  172  328:iload           4
	//  173  330:iload           17
	//  174  332:iadd            
	//  175  333:istore          4
					view.layout(k, j, view.getMeasuredWidth() + k, j + view.getMeasuredHeight());
	//  176  335:aload           18
	//  177  337:iload           4
	//  178  339:iload_3         
	//  179  340:aload           18
	//  180  342:invokevirtual   #1071 <Method int View.getMeasuredWidth()>
	//  181  345:iload           4
	//  182  347:iadd            
	//  183  348:iload_3         
	//  184  349:aload           18
	//  185  351:invokevirtual   #1074 <Method int View.getMeasuredHeight()>
	//  186  354:iadd            
	//  187  355:invokevirtual   #1077 <Method void View.layout(int, int, int, int)>
					k = l1 + 1;
	//  188  358:iload           9
	//  189  360:iconst_1        
	//  190  361:iadd            
	//  191  362:istore          4
					j2 = l;
	//  192  364:iload           5
	//  193  366:istore          11
					k2 = i;
	//  194  368:iload_2         
	//  195  369:istore          12
					l2 = k1;
	//  196  371:iload           8
	//  197  373:istore          13
				}
			}
			i2++;
	//  198  375:iload           10
	//  199  377:iconst_1        
	//  200  378:iadd            
	//  201  379:istore          10
			j = i1;
	//  202  381:iload           7
	//  203  383:istore_3        
			k1 = l2;
	//  204  384:iload           13
	//  205  386:istore          8
			i = k2;
	//  206  388:iload           12
	//  207  390:istore_2        
			l = j2;
	//  208  391:iload           11
	//  209  393:istore          5
			l1 = k;
	//  210  395:iload           4
	//  211  397:istore          9
		}

	//* 212  399:goto            52
		for(k = 0; k < i3; k++)
	//* 213  402:iconst_0        
	//* 214  403:istore          4
	//* 215  405:iload           4
	//* 216  407:iload           14
	//* 217  409:icmpge          563
		{
			View view1 = getChildAt(k);
	//  218  412:aload_0         
	//  219  413:iload           4
	//  220  415:invokevirtual   #373 <Method View getChildAt(int)>
	//  221  418:astore          18
			if(view1.getVisibility() == 8)
				continue;
	//  222  420:aload           18
	//  223  422:invokevirtual   #588 <Method int View.getVisibility()>
	//  224  425:bipush          8
	//  225  427:icmpeq          554
			LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//  226  430:aload           18
	//  227  432:invokevirtual   #531 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  228  435:checkcast       #20  <Class ViewPager$LayoutParams>
	//  229  438:astore          19
			if(layoutparams1.isDecor)
				continue;
	//  230  440:aload           19
	//  231  442:getfield        #534 <Field boolean ViewPager$LayoutParams.isDecor>
	//  232  445:ifne            554
			ItemInfo iteminfo = infoForChild(view1);
	//  233  448:aload_0         
	//  234  449:aload           18
	//  235  451:invokevirtual   #592 <Method ViewPager$ItemInfo infoForChild(View)>
	//  236  454:astore          20
			if(iteminfo == null)
				continue;
	//  237  456:aload           20
	//  238  458:ifnull          554
			float f = j3 - j - k1;
	//  239  461:iload           15
	//  240  463:iload_3         
	//  241  464:isub            
	//  242  465:iload           8
	//  243  467:isub            
	//  244  468:i2f             
	//  245  469:fstore          6
			int j1 = (int)(iteminfo.offset * f) + j;
	//  246  471:aload           20
	//  247  473:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//  248  476:fload           6
	//  249  478:fmul            
	//  250  479:f2i             
	//  251  480:iload_3         
	//  252  481:iadd            
	//  253  482:istore          7
			if(layoutparams1.needsMeasure)
	//* 254  484:aload           19
	//* 255  486:getfield        #650 <Field boolean ViewPager$LayoutParams.needsMeasure>
	//* 256  489:ifeq            531
			{
				layoutparams1.needsMeasure = false;
	//  257  492:aload           19
	//  258  494:iconst_0        
	//  259  495:putfield        #650 <Field boolean ViewPager$LayoutParams.needsMeasure>
				view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)(f * layoutparams1.widthFactor), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(k3 - i - l, 0x40000000));
	//  260  498:aload           18
	//  261  500:fload           6
	//  262  502:aload           19
	//  263  504:getfield        #788 <Field float ViewPager$LayoutParams.widthFactor>
	//  264  507:fmul            
	//  265  508:f2i             
	//  266  509:ldc2            #1078 <Int 0x40000000>
	//  267  512:invokestatic    #1083 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  268  515:iload           16
	//  269  517:iload_2         
	//  270  518:isub            
	//  271  519:iload           5
	//  272  521:isub            
	//  273  522:ldc2            #1078 <Int 0x40000000>
	//  274  525:invokestatic    #1083 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  275  528:invokevirtual   #1086 <Method void View.measure(int, int)>
			}
			view1.layout(j1, i, view1.getMeasuredWidth() + j1, view1.getMeasuredHeight() + i);
	//  276  531:aload           18
	//  277  533:iload           7
	//  278  535:iload_2         
	//  279  536:aload           18
	//  280  538:invokevirtual   #1071 <Method int View.getMeasuredWidth()>
	//  281  541:iload           7
	//  282  543:iadd            
	//  283  544:aload           18
	//  284  546:invokevirtual   #1074 <Method int View.getMeasuredHeight()>
	//  285  549:iload_2         
	//  286  550:iadd            
	//  287  551:invokevirtual   #1077 <Method void View.layout(int, int, int, int)>
		}

	//  288  554:iload           4
	//  289  556:iconst_1        
	//  290  557:iadd            
	//  291  558:istore          4
	//* 292  560:goto            405
		mTopPageBounds = i;
	//  293  563:aload_0         
	//  294  564:iload_2         
	//  295  565:putfield        #1025 <Field int mTopPageBounds>
		mBottomPageBounds = k3 - l;
	//  296  568:aload_0         
	//  297  569:iload           16
	//  298  571:iload           5
	//  299  573:isub            
	//  300  574:putfield        #1027 <Field int mBottomPageBounds>
		mDecorChildCount = l1;
	//  301  577:aload_0         
	//  302  578:iload           9
	//  303  580:putfield        #1088 <Field int mDecorChildCount>
		if(mFirstLayout)
	//* 304  583:aload_0         
	//* 305  584:getfield        #212 <Field boolean mFirstLayout>
	//* 306  587:ifeq            604
			scrollToItem(mCurItem, false, 0, false);
	//  307  590:aload_0         
	//  308  591:aload_0         
	//  309  592:getfield        #330 <Field int mCurItem>
	//  310  595:iconst_0        
	//  311  596:iconst_0        
	//  312  597:iconst_0        
	//  313  598:invokespecial   #1090 <Method void scrollToItem(int, boolean, int, boolean)>
	//* 314  601:goto            604
		mFirstLayout = false;
	//  315  604:aload_0         
	//  316  605:iconst_0        
	//  317  606:putfield        #212 <Field boolean mFirstLayout>
	//  318  609:return          
	}

	protected void onMeasure(int i, int j)
	{
		setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, j));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iload_1         
	//    3    3:invokestatic    #1094 <Method int getDefaultSize(int, int)>
	//    4    6:iconst_0        
	//    5    7:iload_2         
	//    6    8:invokestatic    #1094 <Method int getDefaultSize(int, int)>
	//    7   11:invokevirtual   #1097 <Method void setMeasuredDimension(int, int)>
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
	//   16   25:getfield        #987 <Field int mDefaultGutterSize>
	//   17   28:invokestatic    #336 <Method int Math.min(int, int)>
	//   18   31:putfield        #459 <Field int mGutterSize>
		int k = getPaddingLeft();
	//   19   34:aload_0         
	//   20   35:invokevirtual   #436 <Method int getPaddingLeft()>
	//   21   38:istore_3        
		int j1 = getPaddingRight();
	//   22   39:aload_0         
	//   23   40:invokevirtual   #439 <Method int getPaddingRight()>
	//   24   43:istore          4
		j = getMeasuredHeight();
	//   25   45:aload_0         
	//   26   46:invokevirtual   #1098 <Method int getMeasuredHeight()>
	//   27   49:istore_2        
		int l1 = getPaddingTop();
	//   28   50:aload_0         
	//   29   51:invokevirtual   #840 <Method int getPaddingTop()>
	//   30   54:istore          5
		int j2 = getPaddingBottom();
	//   31   56:aload_0         
	//   32   57:invokevirtual   #843 <Method int getPaddingBottom()>
	//   33   60:istore          6
		int i3 = getChildCount();
	//   34   62:aload_0         
	//   35   63:invokevirtual   #367 <Method int getChildCount()>
	//   36   66:istore          11
		j = j - l1 - j2;
	//   37   68:iload_2         
	//   38   69:iload           5
	//   39   71:isub            
	//   40   72:iload           6
	//   41   74:isub            
	//   42   75:istore_2        
		i = i - k - j1;
	//   43   76:iload_1         
	//   44   77:iload_3         
	//   45   78:isub            
	//   46   79:iload           4
	//   47   81:isub            
	//   48   82:istore_1        
		j2 = 0;
	//   49   83:iconst_0        
	//   50   84:istore          6
		do
		{
			int i2 = 1;
	//   51   86:iconst_1        
	//   52   87:istore          5
			int l2 = 0x40000000;
	//   53   89:ldc2            #1078 <Int 0x40000000>
	//   54   92:istore          10
			if(j2 >= i3)
				break;
	//   55   94:iload           6
	//   56   96:iload           11
	//   57   98:icmpge          426
			View view = getChildAt(j2);
	//   58  101:aload_0         
	//   59  102:iload           6
	//   60  104:invokevirtual   #373 <Method View getChildAt(int)>
	//   61  107:astore          12
			int l = i;
	//   62  109:iload_1         
	//   63  110:istore_3        
			int k1 = j;
	//   64  111:iload_2         
	//   65  112:istore          4
			if(view.getVisibility() != 8)
	//*  66  114:aload           12
	//*  67  116:invokevirtual   #588 <Method int View.getVisibility()>
	//*  68  119:bipush          8
	//*  69  121:icmpeq          412
			{
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   70  124:aload           12
	//   71  126:invokevirtual   #531 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   72  129:checkcast       #20  <Class ViewPager$LayoutParams>
	//   73  132:astore          13
				l = i;
	//   74  134:iload_1         
	//   75  135:istore_3        
				k1 = j;
	//   76  136:iload_2         
	//   77  137:istore          4
				if(layoutparams != null)
	//*  78  139:aload           13
	//*  79  141:ifnull          412
				{
					l = i;
	//   80  144:iload_1         
	//   81  145:istore_3        
					k1 = j;
	//   82  146:iload_2         
	//   83  147:istore          4
					if(layoutparams.isDecor)
	//*  84  149:aload           13
	//*  85  151:getfield        #534 <Field boolean ViewPager$LayoutParams.isDecor>
	//*  86  154:ifeq            412
					{
						l = layoutparams.gravity & 7;
	//   87  157:aload           13
	//   88  159:getfield        #1070 <Field int ViewPager$LayoutParams.gravity>
	//   89  162:bipush          7
	//   90  164:iand            
	//   91  165:istore_3        
						k1 = layoutparams.gravity & 0x70;
	//   92  166:aload           13
	//   93  168:getfield        #1070 <Field int ViewPager$LayoutParams.gravity>
	//   94  171:bipush          112
	//   95  173:iand            
	//   96  174:istore          4
						boolean flag1;
						if(k1 != 48 && k1 != 80)
	//*  97  176:iload           4
	//*  98  178:bipush          48
	//*  99  180:icmpeq          199
	//* 100  183:iload           4
	//* 101  185:bipush          80
	//* 102  187:icmpne          193
	//* 103  190:goto            199
							flag1 = false;
	//  104  193:iconst_0        
	//  105  194:istore          8
						else
	//* 106  196:goto            202
							flag1 = true;
	//  107  199:iconst_1        
	//  108  200:istore          8
						boolean flag = ((boolean) (i2));
	//  109  202:iload           5
	//  110  204:istore          7
						if(l != 3)
	//* 111  206:iload_3         
	//* 112  207:iconst_3        
	//* 113  208:icmpeq          226
							if(l == 5)
	//* 114  211:iload_3         
	//* 115  212:iconst_5        
	//* 116  213:icmpne          223
								flag = ((boolean) (i2));
	//  117  216:iload           5
	//  118  218:istore          7
							else
	//* 119  220:goto            226
								flag = false;
	//  120  223:iconst_0        
	//  121  224:istore          7
						k1 = 0x80000000;
	//  122  226:ldc2            #1099 <Int 0x80000000>
	//  123  229:istore          4
						if(flag1)
	//* 124  231:iload           8
	//* 125  233:ifeq            248
						{
							k1 = 0x40000000;
	//  126  236:ldc2            #1078 <Int 0x40000000>
	//  127  239:istore          4
							l = 0x80000000;
	//  128  241:ldc2            #1099 <Int 0x80000000>
	//  129  244:istore_3        
						} else
	//* 130  245:goto            264
						if(flag)
	//* 131  248:iload           7
	//* 132  250:ifeq            260
							l = 0x40000000;
	//  133  253:ldc2            #1078 <Int 0x40000000>
	//  134  256:istore_3        
						else
	//* 135  257:goto            264
							l = 0x80000000;
	//  136  260:ldc2            #1099 <Int 0x80000000>
	//  137  263:istore_3        
						if(layoutparams.width != -2)
	//* 138  264:aload           13
	//* 139  266:getfield        #1102 <Field int ViewPager$LayoutParams.width>
	//* 140  269:bipush          -2
	//* 141  271:icmpeq          309
						{
							if(layoutparams.width != -1)
	//* 142  274:aload           13
	//* 143  276:getfield        #1102 <Field int ViewPager$LayoutParams.width>
	//* 144  279:iconst_m1       
	//* 145  280:icmpeq          298
							{
								i2 = layoutparams.width;
	//  146  283:aload           13
	//  147  285:getfield        #1102 <Field int ViewPager$LayoutParams.width>
	//  148  288:istore          5
								k1 = 0x40000000;
	//  149  290:ldc2            #1078 <Int 0x40000000>
	//  150  293:istore          4
							} else
	//* 151  295:goto            312
							{
								i2 = i;
	//  152  298:iload_1         
	//  153  299:istore          5
								k1 = 0x40000000;
	//  154  301:ldc2            #1078 <Int 0x40000000>
	//  155  304:istore          4
							}
						} else
	//* 156  306:goto            312
						{
							i2 = i;
	//  157  309:iload_1         
	//  158  310:istore          5
						}
						if(layoutparams.height != -2)
	//* 159  312:aload           13
	//* 160  314:getfield        #1105 <Field int ViewPager$LayoutParams.height>
	//* 161  317:bipush          -2
	//* 162  319:icmpeq          345
						{
							if(layoutparams.height != -1)
	//* 163  322:aload           13
	//* 164  324:getfield        #1105 <Field int ViewPager$LayoutParams.height>
	//* 165  327:iconst_m1       
	//* 166  328:icmpeq          340
								l = layoutparams.height;
	//  167  331:aload           13
	//  168  333:getfield        #1105 <Field int ViewPager$LayoutParams.height>
	//  169  336:istore_3        
							else
	//* 170  337:goto            354
								l = j;
	//  171  340:iload_2         
	//  172  341:istore_3        
						} else
	//* 173  342:goto            354
						{
							int k2 = j;
	//  174  345:iload_2         
	//  175  346:istore          9
							l2 = l;
	//  176  348:iload_3         
	//  177  349:istore          10
							l = k2;
	//  178  351:iload           9
	//  179  353:istore_3        
						}
						view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i2, k1), android.view.View.MeasureSpec.makeMeasureSpec(l, l2));
	//  180  354:aload           12
	//  181  356:iload           5
	//  182  358:iload           4
	//  183  360:invokestatic    #1083 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  184  363:iload_3         
	//  185  364:iload           10
	//  186  366:invokestatic    #1083 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  187  369:invokevirtual   #1086 <Method void View.measure(int, int)>
						if(flag1)
	//* 188  372:iload           8
	//* 189  374:ifeq            391
						{
							k1 = j - view.getMeasuredHeight();
	//  190  377:iload_2         
	//  191  378:aload           12
	//  192  380:invokevirtual   #1074 <Method int View.getMeasuredHeight()>
	//  193  383:isub            
	//  194  384:istore          4
							l = i;
	//  195  386:iload_1         
	//  196  387:istore_3        
						} else
	//* 197  388:goto            412
						{
							l = i;
	//  198  391:iload_1         
	//  199  392:istore_3        
							k1 = j;
	//  200  393:iload_2         
	//  201  394:istore          4
							if(flag)
	//* 202  396:iload           7
	//* 203  398:ifeq            412
							{
								l = i - view.getMeasuredWidth();
	//  204  401:iload_1         
	//  205  402:aload           12
	//  206  404:invokevirtual   #1071 <Method int View.getMeasuredWidth()>
	//  207  407:isub            
	//  208  408:istore_3        
								k1 = j;
	//  209  409:iload_2         
	//  210  410:istore          4
							}
						}
					}
				}
			}
			j2++;
	//  211  412:iload           6
	//  212  414:iconst_1        
	//  213  415:iadd            
	//  214  416:istore          6
			i = l;
	//  215  418:iload_3         
	//  216  419:istore_1        
			j = k1;
	//  217  420:iload           4
	//  218  422:istore_2        
		} while(true);
	//  219  423:goto            86
		mChildWidthMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
	//  220  426:aload_0         
	//  221  427:iload_1         
	//  222  428:ldc2            #1078 <Int 0x40000000>
	//  223  431:invokestatic    #1083 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  224  434:putfield        #1107 <Field int mChildWidthMeasureSpec>
		mChildHeightMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
	//  225  437:aload_0         
	//  226  438:iload_2         
	//  227  439:ldc2            #1078 <Int 0x40000000>
	//  228  442:invokestatic    #1083 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  229  445:putfield        #1109 <Field int mChildHeightMeasureSpec>
		mInLayout = true;
	//  230  448:aload_0         
	//  231  449:iconst_1        
	//  232  450:putfield        #645 <Field boolean mInLayout>
		populate();
	//  233  453:aload_0         
	//  234  454:invokevirtual   #1063 <Method void populate()>
		j = 0;
	//  235  457:iconst_0        
	//  236  458:istore_2        
		mInLayout = false;
	//  237  459:aload_0         
	//  238  460:iconst_0        
	//  239  461:putfield        #645 <Field boolean mInLayout>
		for(int i1 = getChildCount(); j < i1; j++)
	//* 240  464:aload_0         
	//* 241  465:invokevirtual   #367 <Method int getChildCount()>
	//* 242  468:istore_3        
	//* 243  469:iload_2         
	//* 244  470:iload_3         
	//* 245  471:icmpge          545
		{
			View view1 = getChildAt(j);
	//  246  474:aload_0         
	//  247  475:iload_2         
	//  248  476:invokevirtual   #373 <Method View getChildAt(int)>
	//  249  479:astore          12
			if(view1.getVisibility() == 8)
				continue;
	//  250  481:aload           12
	//  251  483:invokevirtual   #588 <Method int View.getVisibility()>
	//  252  486:bipush          8
	//  253  488:icmpeq          538
			LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//  254  491:aload           12
	//  255  493:invokevirtual   #531 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  256  496:checkcast       #20  <Class ViewPager$LayoutParams>
	//  257  499:astore          13
			if(layoutparams1 == null || !layoutparams1.isDecor)
	//* 258  501:aload           13
	//* 259  503:ifnull          514
	//* 260  506:aload           13
	//* 261  508:getfield        #534 <Field boolean ViewPager$LayoutParams.isDecor>
	//* 262  511:ifne            538
				view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)((float)i * layoutparams1.widthFactor), 0x40000000), mChildHeightMeasureSpec);
	//  263  514:aload           12
	//  264  516:iload_1         
	//  265  517:i2f             
	//  266  518:aload           13
	//  267  520:getfield        #788 <Field float ViewPager$LayoutParams.widthFactor>
	//  268  523:fmul            
	//  269  524:f2i             
	//  270  525:ldc2            #1078 <Int 0x40000000>
	//  271  528:invokestatic    #1083 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  272  531:aload_0         
	//  273  532:getfield        #1109 <Field int mChildHeightMeasureSpec>
	//  274  535:invokevirtual   #1086 <Method void View.measure(int, int)>
		}

	//  275  538:iload_2         
	//  276  539:iconst_1        
	//  277  540:iadd            
	//  278  541:istore_2        
	//* 279  542:goto            469
	//  280  545:return          
	}

	protected void onPageScrolled(int i, float f, int j)
	{
		int k = mDecorChildCount;
	//    0    0:aload_0         
	//    1    1:getfield        #1088 <Field int mDecorChildCount>
	//    2    4:istore          4
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          9
		if(k > 0)
	//*   5    9:iload           4
	//*   6   11:ifle            232
		{
			int l2 = getScrollX();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #283 <Method int getScrollX()>
	//    9   18:istore          10
			int l = getPaddingLeft();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #436 <Method int getPaddingLeft()>
	//   12   24:istore          4
			int j1 = getPaddingRight();
	//   13   26:aload_0         
	//   14   27:invokevirtual   #439 <Method int getPaddingRight()>
	//   15   30:istore          5
			int i3 = getWidth();
	//   16   32:aload_0         
	//   17   33:invokevirtual   #462 <Method int getWidth()>
	//   18   36:istore          11
			int j3 = getChildCount();
	//   19   38:aload_0         
	//   20   39:invokevirtual   #367 <Method int getChildCount()>
	//   21   42:istore          12
			for(int l1 = 0; l1 < j3; l1++)
	//*  22   44:iconst_0        
	//*  23   45:istore          7
	//*  24   47:iload           7
	//*  25   49:iload           12
	//*  26   51:icmpge          232
			{
				View view = getChildAt(l1);
	//   27   54:aload_0         
	//   28   55:iload           7
	//   29   57:invokevirtual   #373 <Method View getChildAt(int)>
	//   30   60:astore          13
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   31   62:aload           13
	//   32   64:invokevirtual   #531 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   33   67:checkcast       #20  <Class ViewPager$LayoutParams>
	//   34   70:astore          14
				if(!layoutparams.isDecor)
	//*  35   72:aload           14
	//*  36   74:getfield        #534 <Field boolean ViewPager$LayoutParams.isDecor>
	//*  37   77:ifne            83
					continue;
	//   38   80:goto            223
				int k1 = layoutparams.gravity & 7;
	//   39   83:aload           14
	//   40   85:getfield        #1070 <Field int ViewPager$LayoutParams.gravity>
	//   41   88:bipush          7
	//   42   90:iand            
	//   43   91:istore          6
				if(k1 != 1)
	//*  44   93:iload           6
	//*  45   95:iconst_1        
	//*  46   96:icmpeq          181
				{
					if(k1 != 3)
	//*  47   99:iload           6
	//*  48  101:iconst_3        
	//*  49  102:icmpeq          160
					{
						if(k1 != 5)
	//*  50  105:iload           6
	//*  51  107:iconst_5        
	//*  52  108:icmpeq          126
						{
							int i2 = l;
	//   53  111:iload           4
	//   54  113:istore          8
							k1 = l;
	//   55  115:iload           4
	//   56  117:istore          6
							l = i2;
	//   57  119:iload           8
	//   58  121:istore          4
						} else
	//*  59  123:goto            198
						{
							k1 = view.getMeasuredWidth();
	//   60  126:aload           13
	//   61  128:invokevirtual   #1071 <Method int View.getMeasuredWidth()>
	//   62  131:istore          6
							int j2 = j1 + view.getMeasuredWidth();
	//   63  133:iload           5
	//   64  135:aload           13
	//   65  137:invokevirtual   #1071 <Method int View.getMeasuredWidth()>
	//   66  140:iadd            
	//   67  141:istore          8
							k1 = i3 - j1 - k1;
	//   68  143:iload           11
	//   69  145:iload           5
	//   70  147:isub            
	//   71  148:iload           6
	//   72  150:isub            
	//   73  151:istore          6
							j1 = j2;
	//   74  153:iload           8
	//   75  155:istore          5
						}
					} else
	//*  76  157:goto            198
					{
						int k2 = view.getWidth() + l;
	//   77  160:aload           13
	//   78  162:invokevirtual   #1111 <Method int View.getWidth()>
	//   79  165:iload           4
	//   80  167:iadd            
	//   81  168:istore          8
						k1 = l;
	//   82  170:iload           4
	//   83  172:istore          6
						l = k2;
	//   84  174:iload           8
	//   85  176:istore          4
					}
				} else
	//*  86  178:goto            198
				{
					k1 = Math.max((i3 - view.getMeasuredWidth()) / 2, l);
	//   87  181:iload           11
	//   88  183:aload           13
	//   89  185:invokevirtual   #1071 <Method int View.getMeasuredWidth()>
	//   90  188:isub            
	//   91  189:iconst_2        
	//   92  190:idiv            
	//   93  191:iload           4
	//   94  193:invokestatic    #339 <Method int Math.max(int, int)>
	//   95  196:istore          6
				}
				k1 = (k1 + l2) - view.getLeft();
	//   96  198:iload           6
	//   97  200:iload           10
	//   98  202:iadd            
	//   99  203:aload           13
	//  100  205:invokevirtual   #400 <Method int View.getLeft()>
	//  101  208:isub            
	//  102  209:istore          6
				if(k1 != 0)
	//* 103  211:iload           6
	//* 104  213:ifeq            223
					view.offsetLeftAndRight(k1);
	//  105  216:aload           13
	//  106  218:iload           6
	//  107  220:invokevirtual   #1114 <Method void View.offsetLeftAndRight(int)>
			}

	//  108  223:iload           7
	//  109  225:iconst_1        
	//  110  226:iadd            
	//  111  227:istore          7
		}
	//* 112  229:goto            47
		dispatchOnPageScrolled(i, f, j);
	//  113  232:aload_0         
	//  114  233:iload_1         
	//  115  234:fload_2         
	//  116  235:iload_3         
	//  117  236:invokespecial   #1116 <Method void dispatchOnPageScrolled(int, float, int)>
		if(mPageTransformer != null)
	//* 118  239:aload_0         
	//* 119  240:getfield        #1118 <Field ViewPager$PageTransformer mPageTransformer>
	//* 120  243:ifnull          324
		{
			j = getScrollX();
	//  121  246:aload_0         
	//  122  247:invokevirtual   #283 <Method int getScrollX()>
	//  123  250:istore_3        
			int i1 = getChildCount();
	//  124  251:aload_0         
	//  125  252:invokevirtual   #367 <Method int getChildCount()>
	//  126  255:istore          4
			for(i = ((int) (flag)); i < i1; i++)
	//* 127  257:iload           9
	//* 128  259:istore_1        
	//* 129  260:iload_1         
	//* 130  261:iload           4
	//* 131  263:icmpge          324
			{
				View view1 = getChildAt(i);
	//  132  266:aload_0         
	//  133  267:iload_1         
	//  134  268:invokevirtual   #373 <Method View getChildAt(int)>
	//  135  271:astore          13
				if(!((LayoutParams)view1.getLayoutParams()).isDecor)
	//* 136  273:aload           13
	//* 137  275:invokevirtual   #531 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 138  278:checkcast       #20  <Class ViewPager$LayoutParams>
	//* 139  281:getfield        #534 <Field boolean ViewPager$LayoutParams.isDecor>
	//* 140  284:ifeq            290
	//* 141  287:goto            317
				{
					f = (float)(view1.getLeft() - j) / (float)getClientWidth();
	//  142  290:aload           13
	//  143  292:invokevirtual   #400 <Method int View.getLeft()>
	//  144  295:iload_3         
	//  145  296:isub            
	//  146  297:i2f             
	//  147  298:aload_0         
	//  148  299:invokespecial   #242 <Method int getClientWidth()>
	//  149  302:i2f             
	//  150  303:fdiv            
	//  151  304:fstore_2        
					mPageTransformer.transformPage(view1, f);
	//  152  305:aload_0         
	//  153  306:getfield        #1118 <Field ViewPager$PageTransformer mPageTransformer>
	//  154  309:aload           13
	//  155  311:fload_2         
	//  156  312:invokeinterface #1122 <Method void ViewPager$PageTransformer.transformPage(View, float)>
				}
			}

	//  157  317:iload_1         
	//  158  318:iconst_1        
	//  159  319:iadd            
	//  160  320:istore_1        
		}
	//* 161  321:goto            260
		mCalledSuper = true;
	//  162  324:aload_0         
	//  163  325:iconst_1        
	//  164  326:putfield        #482 <Field boolean mCalledSuper>
	//  165  329:return          
	}

	protected boolean onRequestFocusInDescendants(int i, Rect rect)
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #367 <Method int getChildCount()>
	//    2    4:istore_3        
		int k = -1;
	//    3    5:iconst_m1       
	//    4    6:istore          5
		byte byte0;
		if((i & 2) != 0)
	//*   5    8:iload_1         
	//*   6    9:iconst_2        
	//*   7   10:iand            
	//*   8   11:ifeq            25
		{
			k = j;
	//    9   14:iload_3         
	//   10   15:istore          5
			j = 0;
	//   11   17:iconst_0        
	//   12   18:istore_3        
			byte0 = 1;
	//   13   19:iconst_1        
	//   14   20:istore          4
		} else
	//*  15   22:goto            32
		{
			j--;
	//   16   25:iload_3         
	//   17   26:iconst_1        
	//   18   27:isub            
	//   19   28:istore_3        
			byte0 = -1;
	//   20   29:iconst_m1       
	//   21   30:istore          4
		}
		for(; j != k; j += ((int) (byte0)))
	//*  22   32:iload_3         
	//*  23   33:iload           5
	//*  24   35:icmpeq          98
		{
			View view = getChildAt(j);
	//   25   38:aload_0         
	//   26   39:iload_3         
	//   27   40:invokevirtual   #373 <Method View getChildAt(int)>
	//   28   43:astore          6
			if(view.getVisibility() != 0)
				continue;
	//   29   45:aload           6
	//   30   47:invokevirtual   #588 <Method int View.getVisibility()>
	//   31   50:ifne            90
			ItemInfo iteminfo = infoForChild(view);
	//   32   53:aload_0         
	//   33   54:aload           6
	//   34   56:invokevirtual   #592 <Method ViewPager$ItemInfo infoForChild(View)>
	//   35   59:astore          7
			if(iteminfo != null && iteminfo.position == mCurItem && view.requestFocus(i, rect))
	//*  36   61:aload           7
	//*  37   63:ifnull          90
	//*  38   66:aload           7
	//*  39   68:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  40   71:aload_0         
	//*  41   72:getfield        #330 <Field int mCurItem>
	//*  42   75:icmpne          90
	//*  43   78:aload           6
	//*  44   80:iload_1         
	//*  45   81:aload_2         
	//*  46   82:invokevirtual   #1126 <Method boolean View.requestFocus(int, Rect)>
	//*  47   85:ifeq            90
				return true;
	//   48   88:iconst_1        
	//   49   89:ireturn         
		}

	//   50   90:iload_3         
	//   51   91:iload           4
	//   52   93:iadd            
	//   53   94:istore_3        
	//*  54   95:goto            32
		return false;
	//   55   98:iconst_0        
	//   56   99:ireturn         
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
	//    5    9:invokespecial   #1130 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
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
	//   12   20:invokevirtual   #1134 <Method Parcelable ViewPager$SavedState.getSuperState()>
	//   13   23:invokespecial   #1130 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
		PagerAdapter pageradapter = mAdapter;
	//   14   26:aload_0         
	//   15   27:getfield        #233 <Field PagerAdapter mAdapter>
	//   16   30:astore_2        
		if(pageradapter != null)
	//*  17   31:aload_2         
	//*  18   32:ifnull          58
		{
			pageradapter.restoreState(((SavedState) (parcelable)).adapterState, ((SavedState) (parcelable)).loader);
	//   19   35:aload_2         
	//   20   36:aload_1         
	//   21   37:getfield        #1137 <Field Parcelable ViewPager$SavedState.adapterState>
	//   22   40:aload_1         
	//   23   41:getfield        #1140 <Field ClassLoader ViewPager$SavedState.loader>
	//   24   44:invokevirtual   #1144 <Method void PagerAdapter.restoreState(Parcelable, ClassLoader)>
			setCurrentItemInternal(((SavedState) (parcelable)).position, false, true);
	//   25   47:aload_0         
	//   26   48:aload_1         
	//   27   49:getfield        #1145 <Field int ViewPager$SavedState.position>
	//   28   52:iconst_0        
	//   29   53:iconst_1        
	//   30   54:invokevirtual   #792 <Method void setCurrentItemInternal(int, boolean, boolean)>
			return;
	//   31   57:return          
		} else
		{
			mRestoredCurItem = ((SavedState) (parcelable)).position;
	//   32   58:aload_0         
	//   33   59:aload_1         
	//   34   60:getfield        #1145 <Field int ViewPager$SavedState.position>
	//   35   63:putfield        #196 <Field int mRestoredCurItem>
			mRestoredAdapterState = ((SavedState) (parcelable)).adapterState;
	//   36   66:aload_0         
	//   37   67:aload_1         
	//   38   68:getfield        #1137 <Field Parcelable ViewPager$SavedState.adapterState>
	//   39   71:putfield        #198 <Field Parcelable mRestoredAdapterState>
			mRestoredClassLoader = ((SavedState) (parcelable)).loader;
	//   40   74:aload_0         
	//   41   75:aload_1         
	//   42   76:getfield        #1140 <Field ClassLoader ViewPager$SavedState.loader>
	//   43   79:putfield        #200 <Field ClassLoader mRestoredClassLoader>
			return;
	//   44   82:return          
		}
	}

	public Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #38  <Class ViewPager$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #1148 <Method Parcelable ViewGroup.onSaveInstanceState()>
	//    4    8:invokespecial   #1150 <Method void ViewPager$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.position = mCurItem;
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #330 <Field int mCurItem>
	//    9   17:putfield        #1145 <Field int ViewPager$SavedState.position>
		PagerAdapter pageradapter = mAdapter;
	//   10   20:aload_0         
	//   11   21:getfield        #233 <Field PagerAdapter mAdapter>
	//   12   24:astore_2        
		if(pageradapter != null)
	//*  13   25:aload_2         
	//*  14   26:ifnull          37
			savedstate.adapterState = pageradapter.saveState();
	//   15   29:aload_1         
	//   16   30:aload_2         
	//   17   31:invokevirtual   #1153 <Method Parcelable PagerAdapter.saveState()>
	//   18   34:putfield        #1137 <Field Parcelable ViewPager$SavedState.adapterState>
		return ((Parcelable) (savedstate));
	//   19   37:aload_1         
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
	//    5    6:invokespecial   #1156 <Method void ViewGroup.onSizeChanged(int, int, int, int)>
		if(i != k)
	//*   6    9:iload_1         
	//*   7   10:iload_3         
	//*   8   11:icmpeq          27
		{
			j = mPageMargin;
	//    9   14:aload_0         
	//   10   15:getfield        #244 <Field int mPageMargin>
	//   11   18:istore_2        
			recomputeScrollPosition(i, k, j, j);
	//   12   19:aload_0         
	//   13   20:iload_1         
	//   14   21:iload_3         
	//   15   22:iload_2         
	//   16   23:iload_2         
	//   17   24:invokespecial   #1158 <Method void recomputeScrollPosition(int, int, int, int)>
		}
	//   18   27:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(mFakeDragging)
	//*   0    0:aload_0         
	//*   1    1:getfield        #718 <Field boolean mFakeDragging>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		int i = motionevent.getAction();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #1034 <Method int MotionEvent.getAction()>
	//    7   13:istore          6
		boolean flag = false;
	//    8   15:iconst_0        
	//    9   16:istore          9
		if(i == 0 && motionevent.getEdgeFlags() != 0)
	//*  10   18:iload           6
	//*  11   20:ifne            32
	//*  12   23:aload_1         
	//*  13   24:invokevirtual   #1162 <Method int MotionEvent.getEdgeFlags()>
	//*  14   27:ifeq            32
			return false;
	//   15   30:iconst_0        
	//   16   31:ireturn         
		PagerAdapter pageradapter = mAdapter;
	//   17   32:aload_0         
	//   18   33:getfield        #233 <Field PagerAdapter mAdapter>
	//   19   36:astore          10
		if(pageradapter != null)
	//*  20   38:aload           10
	//*  21   40:ifnull          615
		{
			if(pageradapter.getCount() == 0)
	//*  22   43:aload           10
	//*  23   45:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//*  24   48:ifne            53
				return false;
	//   25   51:iconst_0        
	//   26   52:ireturn         
			if(mVelocityTracker == null)
	//*  27   53:aload_0         
	//*  28   54:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//*  29   57:ifnonnull       67
				mVelocityTracker = VelocityTracker.obtain();
	//   30   60:aload_0         
	//   31   61:invokestatic    #727 <Method VelocityTracker VelocityTracker.obtain()>
	//   32   64:putfield        #386 <Field VelocityTracker mVelocityTracker>
			mVelocityTracker.addMovement(motionevent);
	//   33   67:aload_0         
	//   34   68:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//   35   71:aload_1         
	//   36   72:invokevirtual   #739 <Method void VelocityTracker.addMovement(MotionEvent)>
			switch(motionevent.getAction() & 0xff)
	//*  37   75:aload_1         
	//*  38   76:invokevirtual   #1034 <Method int MotionEvent.getAction()>
	//*  39   79:sipush          255
	//*  40   82:iand            
			{
			case 4: // '\004'
			default:
				break;

	//*  41   83:tableswitch     0 6: default 124
	//	               0 549
	//	               1 409
	//	               2 207
	//	               3 180
	//	               4 124
	//	               5 151
	//	               6 127
	//*  42  124:goto            604
			case 6: // '\006'
				onSecondaryPointerUp(motionevent);
	//   43  127:aload_0         
	//   44  128:aload_1         
	//   45  129:invokespecial   #1036 <Method void onSecondaryPointerUp(MotionEvent)>
				mLastMotionX = motionevent.getX(motionevent.findPointerIndex(mActivePointerId));
	//   46  132:aload_0         
	//   47  133:aload_1         
	//   48  134:aload_1         
	//   49  135:aload_0         
	//   50  136:getfield        #210 <Field int mActivePointerId>
	//   51  139:invokevirtual   #1039 <Method int MotionEvent.findPointerIndex(int)>
	//   52  142:invokevirtual   #475 <Method float MotionEvent.getX(int)>
	//   53  145:putfield        #477 <Field float mLastMotionX>
				break;
	//   54  148:goto            604

			case 5: // '\005'
				int j = motionevent.getActionIndex();
	//   55  151:aload_1         
	//   56  152:invokevirtual   #469 <Method int MotionEvent.getActionIndex()>
	//   57  155:istore          6
				mLastMotionX = motionevent.getX(j);
	//   58  157:aload_0         
	//   59  158:aload_1         
	//   60  159:iload           6
	//   61  161:invokevirtual   #475 <Method float MotionEvent.getX(int)>
	//   62  164:putfield        #477 <Field float mLastMotionX>
				mActivePointerId = motionevent.getPointerId(j);
	//   63  167:aload_0         
	//   64  168:aload_1         
	//   65  169:iload           6
	//   66  171:invokevirtual   #472 <Method int MotionEvent.getPointerId(int)>
	//   67  174:putfield        #210 <Field int mActivePointerId>
				break;
	//   68  177:goto            604

			case 3: // '\003'
				if(mIsBeingDragged)
	//*  69  180:aload_0         
	//*  70  181:getfield        #382 <Field boolean mIsBeingDragged>
	//*  71  184:ifeq            604
				{
					scrollToItem(mCurItem, true, 0, false);
	//   72  187:aload_0         
	//   73  188:aload_0         
	//   74  189:getfield        #330 <Field int mCurItem>
	//   75  192:iconst_1        
	//   76  193:iconst_0        
	//   77  194:iconst_0        
	//   78  195:invokespecial   #1090 <Method void scrollToItem(int, boolean, int, boolean)>
					flag = resetTouch();
	//   79  198:aload_0         
	//   80  199:invokespecial   #1065 <Method boolean resetTouch()>
	//   81  202:istore          9
				}
				break;
	//   82  204:goto            604

			case 2: // '\002'
				if(!mIsBeingDragged)
	//*  83  207:aload_0         
	//*  84  208:getfield        #382 <Field boolean mIsBeingDragged>
	//*  85  211:ifne            379
				{
					int k = motionevent.findPointerIndex(mActivePointerId);
	//   86  214:aload_1         
	//   87  215:aload_0         
	//   88  216:getfield        #210 <Field int mActivePointerId>
	//   89  219:invokevirtual   #1039 <Method int MotionEvent.findPointerIndex(int)>
	//   90  222:istore          6
					if(k == -1)
	//*  91  224:iload           6
	//*  92  226:iconst_m1       
	//*  93  227:icmpne          239
					{
						flag = resetTouch();
	//   94  230:aload_0         
	//   95  231:invokespecial   #1065 <Method boolean resetTouch()>
	//   96  234:istore          9
						break;
	//   97  236:goto            604
					}
					float f = motionevent.getX(k);
	//   98  239:aload_1         
	//   99  240:iload           6
	//  100  242:invokevirtual   #475 <Method float MotionEvent.getX(int)>
	//  101  245:fstore_2        
					float f5 = Math.abs(f - mLastMotionX);
	//  102  246:fload_2         
	//  103  247:aload_0         
	//  104  248:getfield        #477 <Field float mLastMotionX>
	//  105  251:fsub            
	//  106  252:invokestatic    #499 <Method float Math.abs(float)>
	//  107  255:fstore          4
					float f3 = motionevent.getY(k);
	//  108  257:aload_1         
	//  109  258:iload           6
	//  110  260:invokevirtual   #1042 <Method float MotionEvent.getY(int)>
	//  111  263:fstore_3        
					float f7 = Math.abs(f3 - mLastMotionY);
	//  112  264:fload_3         
	//  113  265:aload_0         
	//  114  266:getfield        #1048 <Field float mLastMotionY>
	//  115  269:fsub            
	//  116  270:invokestatic    #499 <Method float Math.abs(float)>
	//  117  273:fstore          5
					if(f5 > (float)mTouchSlop && f5 > f7)
	//* 118  275:fload           4
	//* 119  277:aload_0         
	//* 120  278:getfield        #976 <Field int mTouchSlop>
	//* 121  281:i2f             
	//* 122  282:fcmpl           
	//* 123  283:ifle            379
	//* 124  286:fload           4
	//* 125  288:fload           5
	//* 126  290:fcmpl           
	//* 127  291:ifle            379
					{
						mIsBeingDragged = true;
	//  128  294:aload_0         
	//  129  295:iconst_1        
	//  130  296:putfield        #382 <Field boolean mIsBeingDragged>
						requestParentDisallowInterceptTouchEvent(true);
	//  131  299:aload_0         
	//  132  300:iconst_1        
	//  133  301:invokespecial   #1050 <Method void requestParentDisallowInterceptTouchEvent(boolean)>
						float f6 = mInitialMotionX;
	//  134  304:aload_0         
	//  135  305:getfield        #723 <Field float mInitialMotionX>
	//  136  308:fstore          4
						if(f - f6 > 0.0F)
	//* 137  310:fload_2         
	//* 138  311:fload           4
	//* 139  313:fsub            
	//* 140  314:fconst_0        
	//* 141  315:fcmpl           
	//* 142  316:ifle            331
							f = f6 + (float)mTouchSlop;
	//  143  319:fload           4
	//  144  321:aload_0         
	//  145  322:getfield        #976 <Field int mTouchSlop>
	//  146  325:i2f             
	//  147  326:fadd            
	//  148  327:fstore_2        
						else
	//* 149  328:goto            340
							f = f6 - (float)mTouchSlop;
	//  150  331:fload           4
	//  151  333:aload_0         
	//  152  334:getfield        #976 <Field int mTouchSlop>
	//  153  337:i2f             
	//  154  338:fsub            
	//  155  339:fstore_2        
						mLastMotionX = f;
	//  156  340:aload_0         
	//  157  341:fload_2         
	//  158  342:putfield        #477 <Field float mLastMotionX>
						mLastMotionY = f3;
	//  159  345:aload_0         
	//  160  346:fload_3         
	//  161  347:putfield        #1048 <Field float mLastMotionY>
						setScrollState(1);
	//  162  350:aload_0         
	//  163  351:iconst_1        
	//  164  352:invokevirtual   #721 <Method void setScrollState(int)>
						setScrollingCacheEnabled(true);
	//  165  355:aload_0         
	//  166  356:iconst_1        
	//  167  357:invokespecial   #269 <Method void setScrollingCacheEnabled(boolean)>
						ViewParent viewparent = getParent();
	//  168  360:aload_0         
	//  169  361:invokevirtual   #539 <Method ViewParent getParent()>
	//  170  364:astore          10
						if(viewparent != null)
	//* 171  366:aload           10
	//* 172  368:ifnull          379
							viewparent.requestDisallowInterceptTouchEvent(true);
	//  173  371:aload           10
	//  174  373:iconst_1        
	//  175  374:invokeinterface #544 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
					}
				}
				if(mIsBeingDragged)
	//* 176  379:aload_0         
	//* 177  380:getfield        #382 <Field boolean mIsBeingDragged>
	//* 178  383:ifeq            604
					flag = false | performDrag(motionevent.getX(motionevent.findPointerIndex(mActivePointerId)));
	//  179  386:iconst_0        
	//  180  387:aload_0         
	//  181  388:aload_1         
	//  182  389:aload_1         
	//  183  390:aload_0         
	//  184  391:getfield        #210 <Field int mActivePointerId>
	//  185  394:invokevirtual   #1039 <Method int MotionEvent.findPointerIndex(int)>
	//  186  397:invokevirtual   #475 <Method float MotionEvent.getX(int)>
	//  187  400:invokespecial   #1052 <Method boolean performDrag(float)>
	//  188  403:ior             
	//  189  404:istore          9
				break;

	//* 190  406:goto            604
			case 1: // '\001'
				if(mIsBeingDragged)
	//* 191  409:aload_0         
	//* 192  410:getfield        #382 <Field boolean mIsBeingDragged>
	//* 193  413:ifeq            604
				{
					Object obj = ((Object) (mVelocityTracker));
	//  194  416:aload_0         
	//  195  417:getfield        #386 <Field VelocityTracker mVelocityTracker>
	//  196  420:astore          10
					((VelocityTracker) (obj)).computeCurrentVelocity(1000, mMaximumVelocity);
	//  197  422:aload           10
	//  198  424:sipush          1000
	//  199  427:aload_0         
	//  200  428:getfield        #882 <Field int mMaximumVelocity>
	//  201  431:i2f             
	//  202  432:invokevirtual   #886 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
					int l = (int)((VelocityTracker) (obj)).getXVelocity(mActivePointerId);
	//  203  435:aload           10
	//  204  437:aload_0         
	//  205  438:getfield        #210 <Field int mActivePointerId>
	//  206  441:invokevirtual   #889 <Method float VelocityTracker.getXVelocity(int)>
	//  207  444:f2i             
	//  208  445:istore          6
					mPopulatePending = true;
	//  209  447:aload_0         
	//  210  448:iconst_1        
	//  211  449:putfield        #302 <Field boolean mPopulatePending>
					int i1 = getClientWidth();
	//  212  452:aload_0         
	//  213  453:invokespecial   #242 <Method int getClientWidth()>
	//  214  456:istore          7
					int j1 = getScrollX();
	//  215  458:aload_0         
	//  216  459:invokevirtual   #283 <Method int getScrollX()>
	//  217  462:istore          8
					obj = ((Object) (infoForCurrentScrollPosition()));
	//  218  464:aload_0         
	//  219  465:invokespecial   #492 <Method ViewPager$ItemInfo infoForCurrentScrollPosition()>
	//  220  468:astore          10
					float f4 = mPageMargin;
	//  221  470:aload_0         
	//  222  471:getfield        #244 <Field int mPageMargin>
	//  223  474:i2f             
	//  224  475:fstore_3        
					float f1 = i1;
	//  225  476:iload           7
	//  226  478:i2f             
	//  227  479:fstore_2        
					f4 /= f1;
	//  228  480:fload_3         
	//  229  481:fload_2         
	//  230  482:fdiv            
	//  231  483:fstore_3        
					setCurrentItemInternal(determineTargetPage(((ItemInfo) (obj)).position, ((float)j1 / f1 - ((ItemInfo) (obj)).offset) / (((ItemInfo) (obj)).widthFactor + f4), l, (int)(motionevent.getX(motionevent.findPointerIndex(mActivePointerId)) - mInitialMotionX)), true, true, l);
	//  232  484:aload_0         
	//  233  485:aload_0         
	//  234  486:aload           10
	//  235  488:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//  236  491:iload           8
	//  237  493:i2f             
	//  238  494:fload_2         
	//  239  495:fdiv            
	//  240  496:aload           10
	//  241  498:getfield        #250 <Field float ViewPager$ItemInfo.offset>
	//  242  501:fsub            
	//  243  502:aload           10
	//  244  504:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  245  507:fload_3         
	//  246  508:fadd            
	//  247  509:fdiv            
	//  248  510:iload           6
	//  249  512:aload_1         
	//  250  513:aload_1         
	//  251  514:aload_0         
	//  252  515:getfield        #210 <Field int mActivePointerId>
	//  253  518:invokevirtual   #1039 <Method int MotionEvent.findPointerIndex(int)>
	//  254  521:invokevirtual   #475 <Method float MotionEvent.getX(int)>
	//  255  524:aload_0         
	//  256  525:getfield        #723 <Field float mInitialMotionX>
	//  257  528:fsub            
	//  258  529:f2i             
	//  259  530:invokespecial   #891 <Method int determineTargetPage(int, float, int, int)>
	//  260  533:iconst_1        
	//  261  534:iconst_1        
	//  262  535:iload           6
	//  263  537:invokevirtual   #894 <Method void setCurrentItemInternal(int, boolean, boolean, int)>
					flag = resetTouch();
	//  264  540:aload_0         
	//  265  541:invokespecial   #1065 <Method boolean resetTouch()>
	//  266  544:istore          9
				}
				break;

	//* 267  546:goto            604
			case 0: // '\0'
				mScroller.abortAnimation();
	//  268  549:aload_0         
	//  269  550:getfield        #271 <Field Scroller mScroller>
	//  270  553:invokevirtual   #280 <Method void Scroller.abortAnimation()>
				mPopulatePending = false;
	//  271  556:aload_0         
	//  272  557:iconst_0        
	//  273  558:putfield        #302 <Field boolean mPopulatePending>
				populate();
	//  274  561:aload_0         
	//  275  562:invokevirtual   #1063 <Method void populate()>
				float f2 = motionevent.getX();
	//  276  565:aload_1         
	//  277  566:invokevirtual   #1055 <Method float MotionEvent.getX()>
	//  278  569:fstore_2        
				mInitialMotionX = f2;
	//  279  570:aload_0         
	//  280  571:fload_2         
	//  281  572:putfield        #723 <Field float mInitialMotionX>
				mLastMotionX = f2;
	//  282  575:aload_0         
	//  283  576:fload_2         
	//  284  577:putfield        #477 <Field float mLastMotionX>
				f2 = motionevent.getY();
	//  285  580:aload_1         
	//  286  581:invokevirtual   #1057 <Method float MotionEvent.getY()>
	//  287  584:fstore_2        
				mInitialMotionY = f2;
	//  288  585:aload_0         
	//  289  586:fload_2         
	//  290  587:putfield        #1044 <Field float mInitialMotionY>
				mLastMotionY = f2;
	//  291  590:aload_0         
	//  292  591:fload_2         
	//  293  592:putfield        #1048 <Field float mLastMotionY>
				mActivePointerId = motionevent.getPointerId(0);
	//  294  595:aload_0         
	//  295  596:aload_1         
	//  296  597:iconst_0        
	//  297  598:invokevirtual   #472 <Method int MotionEvent.getPointerId(int)>
	//  298  601:putfield        #210 <Field int mActivePointerId>
				break;
			}
			if(flag)
	//* 299  604:iload           9
	//* 300  606:ifeq            613
				ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//  301  609:aload_0         
	//  302  610:invokestatic    #766 <Method void ViewCompat.postInvalidateOnAnimation(View)>
			return true;
	//  303  613:iconst_1        
	//  304  614:ireturn         
		} else
		{
			return false;
	//  305  615:iconst_0        
	//  306  616:ireturn         
		}
	}

	boolean pageLeft()
	{
		int i = mCurItem;
	//    0    0:aload_0         
	//    1    1:getfield        #330 <Field int mCurItem>
	//    2    4:istore_1        
		if(i > 0)
	//*   3    5:iload_1         
	//*   4    6:ifle            19
		{
			setCurrentItem(i - 1, true);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:iconst_1        
	//    8   12:isub            
	//    9   13:iconst_1        
	//   10   14:invokevirtual   #1166 <Method void setCurrentItem(int, boolean)>
			return true;
	//   11   17:iconst_1        
	//   12   18:ireturn         
		} else
		{
			return false;
	//   13   19:iconst_0        
	//   14   20:ireturn         
		}
	}

	boolean pageRight()
	{
		PagerAdapter pageradapter = mAdapter;
	//    0    0:aload_0         
	//    1    1:getfield        #233 <Field PagerAdapter mAdapter>
	//    2    4:astore_1        
		if(pageradapter != null && mCurItem < pageradapter.getCount() - 1)
	//*   3    5:aload_1         
	//*   4    6:ifnull          35
	//*   5    9:aload_0         
	//*   6   10:getfield        #330 <Field int mCurItem>
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//*   9   17:iconst_1        
	//*  10   18:isub            
	//*  11   19:icmpge          35
		{
			setCurrentItem(mCurItem + 1, true);
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #330 <Field int mCurItem>
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:iconst_1        
	//   18   30:invokevirtual   #1166 <Method void setCurrentItem(int, boolean)>
			return true;
	//   19   33:iconst_1        
	//   20   34:ireturn         
		} else
		{
			return false;
	//   21   35:iconst_0        
	//   22   36:ireturn         
		}
	}

	void populate()
	{
		populate(mCurItem);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #330 <Field int mCurItem>
	//    3    5:invokevirtual   #1168 <Method void populate(int)>
	//    4    8:return          
	}

	void populate(int i)
	{
		android.content.res.Resources.NotFoundException notfoundexception;
		int j2;
label0:
		{
			int k2;
			int l2;
			ItemInfo iteminfo;
			ItemInfo iteminfo5;
label1:
			{
				int j = mCurItem;
	//    0    0:aload_0         
	//    1    1:getfield        #330 <Field int mCurItem>
	//    2    4:istore          5
				if(j != i)
	//*   3    6:iload           5
	//*   4    8:iload_1         
	//*   5    9:icmpeq          28
				{
					iteminfo5 = infoForPosition(j);
	//    6   12:aload_0         
	//    7   13:iload           5
	//    8   15:invokevirtual   #521 <Method ViewPager$ItemInfo infoForPosition(int)>
	//    9   18:astore          14
					mCurItem = i;
	//   10   20:aload_0         
	//   11   21:iload_1         
	//   12   22:putfield        #330 <Field int mCurItem>
				} else
	//*  13   25:goto            31
				{
					iteminfo5 = null;
	//   14   28:aconst_null     
	//   15   29:astore          14
				}
				if(mAdapter == null)
	//*  16   31:aload_0         
	//*  17   32:getfield        #233 <Field PagerAdapter mAdapter>
	//*  18   35:ifnonnull       43
				{
					sortChildDrawingOrder();
	//   19   38:aload_0         
	//   20   39:invokespecial   #1172 <Method void sortChildDrawingOrder()>
					return;
	//   21   42:return          
				}
				if(mPopulatePending)
	//*  22   43:aload_0         
	//*  23   44:getfield        #302 <Field boolean mPopulatePending>
	//*  24   47:ifeq            55
				{
					sortChildDrawingOrder();
	//   25   50:aload_0         
	//   26   51:invokespecial   #1172 <Method void sortChildDrawingOrder()>
					return;
	//   27   54:return          
				}
				if(getWindowToken() == null)
	//*  28   55:aload_0         
	//*  29   56:invokevirtual   #1176 <Method android.os.IBinder getWindowToken()>
	//*  30   59:ifnonnull       63
					return;
	//   31   62:return          
				mAdapter.startUpdate(((ViewGroup) (this)));
	//   32   63:aload_0         
	//   33   64:getfield        #233 <Field PagerAdapter mAdapter>
	//   34   67:aload_0         
	//   35   68:invokevirtual   #780 <Method void PagerAdapter.startUpdate(ViewGroup)>
				i = mOffscreenPageLimit;
	//   36   71:aload_0         
	//   37   72:getfield        #208 <Field int mOffscreenPageLimit>
	//   38   75:istore_1        
				l2 = Math.max(0, mCurItem - i);
	//   39   76:iconst_0        
	//   40   77:aload_0         
	//   41   78:getfield        #330 <Field int mCurItem>
	//   42   81:iload_1         
	//   43   82:isub            
	//   44   83:invokestatic    #339 <Method int Math.max(int, int)>
	//   45   86:istore          11
				j2 = mAdapter.getCount();
	//   46   88:aload_0         
	//   47   89:getfield        #233 <Field PagerAdapter mAdapter>
	//   48   92:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//   49   95:istore          9
				k2 = Math.min(j2 - 1, mCurItem + i);
	//   50   97:iload           9
	//   51   99:iconst_1        
	//   52  100:isub            
	//   53  101:aload_0         
	//   54  102:getfield        #330 <Field int mCurItem>
	//   55  105:iload_1         
	//   56  106:iadd            
	//   57  107:invokestatic    #336 <Method int Math.min(int, int)>
	//   58  110:istore          10
				if(j2 != mExpectedAdapterCount)
					break label0;
	//   59  112:iload           9
	//   60  114:aload_0         
	//   61  115:getfield        #769 <Field int mExpectedAdapterCount>
	//   62  118:icmpne          1177
				i = 0;
	//   63  121:iconst_0        
	//   64  122:istore_1        
				do
				{
					if(i >= mItems.size())
						break;
	//   65  123:iload_1         
	//   66  124:aload_0         
	//   67  125:getfield        #186 <Field ArrayList mItems>
	//   68  128:invokevirtual   #256 <Method int ArrayList.size()>
	//   69  131:icmpge          181
					iteminfo = (ItemInfo)mItems.get(i);
	//   70  134:aload_0         
	//   71  135:getfield        #186 <Field ArrayList mItems>
	//   72  138:iload_1         
	//   73  139:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   74  142:checkcast       #17  <Class ViewPager$ItemInfo>
	//   75  145:astore          13
					if(iteminfo.position >= mCurItem)
	//*  76  147:aload           13
	//*  77  149:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  78  152:aload_0         
	//*  79  153:getfield        #330 <Field int mCurItem>
	//*  80  156:icmplt          174
					{
						if(iteminfo.position == mCurItem)
	//*  81  159:aload           13
	//*  82  161:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//*  83  164:aload_0         
	//*  84  165:getfield        #330 <Field int mCurItem>
	//*  85  168:icmpne          181
							break label1;
	//   86  171:goto            184
						break;
					}
					i++;
	//   87  174:iload_1         
	//   88  175:iconst_1        
	//   89  176:iadd            
	//   90  177:istore_1        
				} while(true);
	//   91  178:goto            123
				iteminfo = null;
	//   92  181:aconst_null     
	//   93  182:astore          13
			}
			ItemInfo iteminfo7 = iteminfo;
	//   94  184:aload           13
	//   95  186:astore          15
			if(iteminfo == null)
	//*  96  188:aload           13
	//*  97  190:ifnonnull       213
			{
				iteminfo7 = iteminfo;
	//   98  193:aload           13
	//   99  195:astore          15
				if(j2 > 0)
	//* 100  197:iload           9
	//* 101  199:ifle            213
					iteminfo7 = addNewItem(mCurItem, i);
	//  102  202:aload_0         
	//  103  203:aload_0         
	//  104  204:getfield        #330 <Field int mCurItem>
	//  105  207:iload_1         
	//  106  208:invokevirtual   #1178 <Method ViewPager$ItemInfo addNewItem(int, int)>
	//  107  211:astore          15
			}
			if(iteminfo7 != null)
	//* 108  213:aload           15
	//* 109  215:ifnull          961
			{
				int i2 = i - 1;
	//  110  218:iload_1         
	//  111  219:iconst_1        
	//  112  220:isub            
	//  113  221:istore          8
				ItemInfo iteminfo1;
				if(i2 >= 0)
	//* 114  223:iload           8
	//* 115  225:iflt            245
					iteminfo1 = (ItemInfo)mItems.get(i2);
	//  116  228:aload_0         
	//  117  229:getfield        #186 <Field ArrayList mItems>
	//  118  232:iload           8
	//  119  234:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//  120  237:checkcast       #17  <Class ViewPager$ItemInfo>
	//  121  240:astore          13
				else
	//* 122  242:goto            248
					iteminfo1 = null;
	//  123  245:aconst_null     
	//  124  246:astore          13
				int i3 = getClientWidth();
	//  125  248:aload_0         
	//  126  249:invokespecial   #242 <Method int getClientWidth()>
	//  127  252:istore          12
				float f2;
				if(i3 <= 0)
	//* 128  254:iload           12
	//* 129  256:ifgt            264
					f2 = 0.0F;
	//  130  259:fconst_0        
	//  131  260:fstore_3        
				else
	//* 132  261:goto            282
					f2 = (2.0F - iteminfo7.widthFactor) + (float)getPaddingLeft() / (float)i3;
	//  133  264:fconst_2        
	//  134  265:aload           15
	//  135  267:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  136  270:fsub            
	//  137  271:aload_0         
	//  138  272:invokevirtual   #436 <Method int getPaddingLeft()>
	//  139  275:i2f             
	//  140  276:iload           12
	//  141  278:i2f             
	//  142  279:fdiv            
	//  143  280:fadd            
	//  144  281:fstore_3        
				int k1 = mCurItem - 1;
	//  145  282:aload_0         
	//  146  283:getfield        #330 <Field int mCurItem>
	//  147  286:iconst_1        
	//  148  287:isub            
	//  149  288:istore          7
				float f4 = 0.0F;
	//  150  290:fconst_0        
	//  151  291:fstore          4
				ItemInfo iteminfo8 = iteminfo1;
	//  152  293:aload           13
	//  153  295:astore          16
				int j1 = i;
	//  154  297:iload_1         
	//  155  298:istore          6
				while(k1 >= 0) 
	//* 156  300:iload           7
	//* 157  302:iflt            575
				{
					float f;
					int k;
					ItemInfo iteminfo2;
					if(f4 >= f2 && k1 < l2)
	//* 158  305:fload           4
	//* 159  307:fload_3         
	//* 160  308:fcmpl           
	//* 161  309:iflt            440
	//* 162  312:iload           7
	//* 163  314:iload           11
	//* 164  316:icmpge          440
					{
						if(iteminfo8 == null)
	//* 165  319:aload           16
	//* 166  321:ifnonnull       327
							break;
	//  167  324:goto            575
						f = f4;
	//  168  327:fload           4
	//  169  329:fstore_2        
						i = j1;
	//  170  330:iload           6
	//  171  332:istore_1        
						iteminfo2 = iteminfo8;
	//  172  333:aload           16
	//  173  335:astore          13
						k = i2;
	//  174  337:iload           8
	//  175  339:istore          5
						if(k1 == iteminfo8.position)
	//* 176  341:iload           7
	//* 177  343:aload           16
	//* 178  345:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 179  348:icmpne          552
						{
							f = f4;
	//  180  351:fload           4
	//  181  353:fstore_2        
							i = j1;
	//  182  354:iload           6
	//  183  356:istore_1        
							iteminfo2 = iteminfo8;
	//  184  357:aload           16
	//  185  359:astore          13
							k = i2;
	//  186  361:iload           8
	//  187  363:istore          5
							if(!iteminfo8.scrolling)
	//* 188  365:aload           16
	//* 189  367:getfield        #305 <Field boolean ViewPager$ItemInfo.scrolling>
	//* 190  370:ifne            552
							{
								mItems.remove(i2);
	//  191  373:aload_0         
	//  192  374:getfield        #186 <Field ArrayList mItems>
	//  193  377:iload           8
	//  194  379:invokevirtual   #776 <Method Object ArrayList.remove(int)>
	//  195  382:pop             
								mAdapter.destroyItem(((ViewGroup) (this)), k1, iteminfo8.object);
	//  196  383:aload_0         
	//  197  384:getfield        #233 <Field PagerAdapter mAdapter>
	//  198  387:aload_0         
	//  199  388:iload           7
	//  200  390:aload           16
	//  201  392:getfield        #616 <Field Object ViewPager$ItemInfo.object>
	//  202  395:invokevirtual   #784 <Method void PagerAdapter.destroyItem(ViewGroup, int, Object)>
								k = i2 - 1;
	//  203  398:iload           8
	//  204  400:iconst_1        
	//  205  401:isub            
	//  206  402:istore          5
								i = j1 - 1;
	//  207  404:iload           6
	//  208  406:iconst_1        
	//  209  407:isub            
	//  210  408:istore_1        
								if(k >= 0)
	//* 211  409:iload           5
	//* 212  411:iflt            431
									iteminfo2 = (ItemInfo)mItems.get(k);
	//  213  414:aload_0         
	//  214  415:getfield        #186 <Field ArrayList mItems>
	//  215  418:iload           5
	//  216  420:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//  217  423:checkcast       #17  <Class ViewPager$ItemInfo>
	//  218  426:astore          13
								else
	//* 219  428:goto            434
									iteminfo2 = null;
	//  220  431:aconst_null     
	//  221  432:astore          13
								f = f4;
	//  222  434:fload           4
	//  223  436:fstore_2        
							}
						}
					} else
	//* 224  437:goto            552
					if(iteminfo8 != null && k1 == iteminfo8.position)
	//* 225  440:aload           16
	//* 226  442:ifnull          501
	//* 227  445:iload           7
	//* 228  447:aload           16
	//* 229  449:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 230  452:icmpne          501
					{
						f = f4 + iteminfo8.widthFactor;
	//  231  455:fload           4
	//  232  457:aload           16
	//  233  459:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  234  462:fadd            
	//  235  463:fstore_2        
						k = i2 - 1;
	//  236  464:iload           8
	//  237  466:iconst_1        
	//  238  467:isub            
	//  239  468:istore          5
						if(k >= 0)
	//* 240  470:iload           5
	//* 241  472:iflt            492
							iteminfo2 = (ItemInfo)mItems.get(k);
	//  242  475:aload_0         
	//  243  476:getfield        #186 <Field ArrayList mItems>
	//  244  479:iload           5
	//  245  481:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//  246  484:checkcast       #17  <Class ViewPager$ItemInfo>
	//  247  487:astore          13
						else
	//* 248  489:goto            495
							iteminfo2 = null;
	//  249  492:aconst_null     
	//  250  493:astore          13
						i = j1;
	//  251  495:iload           6
	//  252  497:istore_1        
					} else
	//* 253  498:goto            552
					{
						f = f4 + addNewItem(k1, i2 + 1).widthFactor;
	//  254  501:fload           4
	//  255  503:aload_0         
	//  256  504:iload           7
	//  257  506:iload           8
	//  258  508:iconst_1        
	//  259  509:iadd            
	//  260  510:invokevirtual   #1178 <Method ViewPager$ItemInfo addNewItem(int, int)>
	//  261  513:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  262  516:fadd            
	//  263  517:fstore_2        
						i = j1 + 1;
	//  264  518:iload           6
	//  265  520:iconst_1        
	//  266  521:iadd            
	//  267  522:istore_1        
						if(i2 >= 0)
	//* 268  523:iload           8
	//* 269  525:iflt            545
							iteminfo2 = (ItemInfo)mItems.get(i2);
	//  270  528:aload_0         
	//  271  529:getfield        #186 <Field ArrayList mItems>
	//  272  532:iload           8
	//  273  534:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//  274  537:checkcast       #17  <Class ViewPager$ItemInfo>
	//  275  540:astore          13
						else
	//* 276  542:goto            548
							iteminfo2 = null;
	//  277  545:aconst_null     
	//  278  546:astore          13
						k = i2;
	//  279  548:iload           8
	//  280  550:istore          5
					}
					k1--;
	//  281  552:iload           7
	//  282  554:iconst_1        
	//  283  555:isub            
	//  284  556:istore          7
					f4 = f;
	//  285  558:fload_2         
	//  286  559:fstore          4
					j1 = i;
	//  287  561:iload_1         
	//  288  562:istore          6
					iteminfo8 = iteminfo2;
	//  289  564:aload           13
	//  290  566:astore          16
					i2 = k;
	//  291  568:iload           5
	//  292  570:istore          8
				}
	//* 293  572:goto            300
				f4 = iteminfo7.widthFactor;
	//  294  575:aload           15
	//  295  577:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  296  580:fstore          4
				int l = j1 + 1;
	//  297  582:iload           6
	//  298  584:iconst_1        
	//  299  585:iadd            
	//  300  586:istore          5
				if(f4 < 2.0F)
	//* 301  588:fload           4
	//* 302  590:fconst_2        
	//* 303  591:fcmpg           
	//* 304  592:ifge            934
				{
					ItemInfo iteminfo3;
					if(l < mItems.size())
	//* 305  595:iload           5
	//* 306  597:aload_0         
	//* 307  598:getfield        #186 <Field ArrayList mItems>
	//* 308  601:invokevirtual   #256 <Method int ArrayList.size()>
	//* 309  604:icmpge          624
						iteminfo3 = (ItemInfo)mItems.get(l);
	//  310  607:aload_0         
	//  311  608:getfield        #186 <Field ArrayList mItems>
	//  312  611:iload           5
	//  313  613:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//  314  616:checkcast       #17  <Class ViewPager$ItemInfo>
	//  315  619:astore          13
					else
	//* 316  621:goto            627
						iteminfo3 = null;
	//  317  624:aconst_null     
	//  318  625:astore          13
					float f3;
					if(i3 <= 0)
	//* 319  627:iload           12
	//* 320  629:ifgt            637
						f3 = 0.0F;
	//  321  632:fconst_0        
	//  322  633:fstore_3        
					else
	//* 323  634:goto            649
						f3 = (float)getPaddingRight() / (float)i3 + 2.0F;
	//  324  637:aload_0         
	//  325  638:invokevirtual   #439 <Method int getPaddingRight()>
	//  326  641:i2f             
	//  327  642:iload           12
	//  328  644:i2f             
	//  329  645:fdiv            
	//  330  646:fconst_2        
	//  331  647:fadd            
	//  332  648:fstore_3        
					i = mCurItem;
	//  333  649:aload_0         
	//  334  650:getfield        #330 <Field int mCurItem>
	//  335  653:istore_1        
					ItemInfo iteminfo9 = iteminfo3;
	//  336  654:aload           13
	//  337  656:astore          16
					do
					{
						int l1 = i + 1;
	//  338  658:iload_1         
	//  339  659:iconst_1        
	//  340  660:iadd            
	//  341  661:istore          7
						if(l1 >= j2)
							break;
	//  342  663:iload           7
	//  343  665:iload           9
	//  344  667:icmpge          934
						float f1;
						ItemInfo iteminfo4;
						if(f4 >= f3 && l1 > k2)
	//* 345  670:fload           4
	//* 346  672:fload_3         
	//* 347  673:fcmpl           
	//* 348  674:iflt            802
	//* 349  677:iload           7
	//* 350  679:iload           10
	//* 351  681:icmple          802
						{
							if(iteminfo9 == null)
	//* 352  684:aload           16
	//* 353  686:ifnonnull       692
								break;
	//  354  689:goto            934
							f1 = f4;
	//  355  692:fload           4
	//  356  694:fstore_2        
							i = l;
	//  357  695:iload           5
	//  358  697:istore_1        
							iteminfo4 = iteminfo9;
	//  359  698:aload           16
	//  360  700:astore          13
							if(l1 == iteminfo9.position)
	//* 361  702:iload           7
	//* 362  704:aload           16
	//* 363  706:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 364  709:icmpne          918
							{
								f1 = f4;
	//  365  712:fload           4
	//  366  714:fstore_2        
								i = l;
	//  367  715:iload           5
	//  368  717:istore_1        
								iteminfo4 = iteminfo9;
	//  369  718:aload           16
	//  370  720:astore          13
								if(!iteminfo9.scrolling)
	//* 371  722:aload           16
	//* 372  724:getfield        #305 <Field boolean ViewPager$ItemInfo.scrolling>
	//* 373  727:ifne            918
								{
									mItems.remove(l);
	//  374  730:aload_0         
	//  375  731:getfield        #186 <Field ArrayList mItems>
	//  376  734:iload           5
	//  377  736:invokevirtual   #776 <Method Object ArrayList.remove(int)>
	//  378  739:pop             
									mAdapter.destroyItem(((ViewGroup) (this)), l1, iteminfo9.object);
	//  379  740:aload_0         
	//  380  741:getfield        #233 <Field PagerAdapter mAdapter>
	//  381  744:aload_0         
	//  382  745:iload           7
	//  383  747:aload           16
	//  384  749:getfield        #616 <Field Object ViewPager$ItemInfo.object>
	//  385  752:invokevirtual   #784 <Method void PagerAdapter.destroyItem(ViewGroup, int, Object)>
									if(l < mItems.size())
	//* 386  755:iload           5
	//* 387  757:aload_0         
	//* 388  758:getfield        #186 <Field ArrayList mItems>
	//* 389  761:invokevirtual   #256 <Method int ArrayList.size()>
	//* 390  764:icmpge          790
									{
										iteminfo4 = (ItemInfo)mItems.get(l);
	//  391  767:aload_0         
	//  392  768:getfield        #186 <Field ArrayList mItems>
	//  393  771:iload           5
	//  394  773:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//  395  776:checkcast       #17  <Class ViewPager$ItemInfo>
	//  396  779:astore          13
										f1 = f4;
	//  397  781:fload           4
	//  398  783:fstore_2        
										i = l;
	//  399  784:iload           5
	//  400  786:istore_1        
									} else
	//* 401  787:goto            918
									{
										iteminfo4 = null;
	//  402  790:aconst_null     
	//  403  791:astore          13
										f1 = f4;
	//  404  793:fload           4
	//  405  795:fstore_2        
										i = l;
	//  406  796:iload           5
	//  407  798:istore_1        
									}
								}
							}
						} else
	//* 408  799:goto            918
						if(iteminfo9 != null && l1 == iteminfo9.position)
	//* 409  802:aload           16
	//* 410  804:ifnull          864
	//* 411  807:iload           7
	//* 412  809:aload           16
	//* 413  811:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 414  814:icmpne          864
						{
							f1 = f4 + iteminfo9.widthFactor;
	//  415  817:fload           4
	//  416  819:aload           16
	//  417  821:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  418  824:fadd            
	//  419  825:fstore_2        
							i = l + 1;
	//  420  826:iload           5
	//  421  828:iconst_1        
	//  422  829:iadd            
	//  423  830:istore_1        
							if(i < mItems.size())
	//* 424  831:iload_1         
	//* 425  832:aload_0         
	//* 426  833:getfield        #186 <Field ArrayList mItems>
	//* 427  836:invokevirtual   #256 <Method int ArrayList.size()>
	//* 428  839:icmpge          858
								iteminfo4 = (ItemInfo)mItems.get(i);
	//  429  842:aload_0         
	//  430  843:getfield        #186 <Field ArrayList mItems>
	//  431  846:iload_1         
	//  432  847:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//  433  850:checkcast       #17  <Class ViewPager$ItemInfo>
	//  434  853:astore          13
							else
	//* 435  855:goto            918
								iteminfo4 = null;
	//  436  858:aconst_null     
	//  437  859:astore          13
						} else
	//* 438  861:goto            918
						{
							iteminfo4 = addNewItem(l1, l);
	//  439  864:aload_0         
	//  440  865:iload           7
	//  441  867:iload           5
	//  442  869:invokevirtual   #1178 <Method ViewPager$ItemInfo addNewItem(int, int)>
	//  443  872:astore          13
							i = l + 1;
	//  444  874:iload           5
	//  445  876:iconst_1        
	//  446  877:iadd            
	//  447  878:istore_1        
							f1 = f4 + iteminfo4.widthFactor;
	//  448  879:fload           4
	//  449  881:aload           13
	//  450  883:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  451  886:fadd            
	//  452  887:fstore_2        
							if(i < mItems.size())
	//* 453  888:iload_1         
	//* 454  889:aload_0         
	//* 455  890:getfield        #186 <Field ArrayList mItems>
	//* 456  893:invokevirtual   #256 <Method int ArrayList.size()>
	//* 457  896:icmpge          915
								iteminfo4 = (ItemInfo)mItems.get(i);
	//  458  899:aload_0         
	//  459  900:getfield        #186 <Field ArrayList mItems>
	//  460  903:iload_1         
	//  461  904:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//  462  907:checkcast       #17  <Class ViewPager$ItemInfo>
	//  463  910:astore          13
							else
	//* 464  912:goto            918
								iteminfo4 = null;
	//  465  915:aconst_null     
	//  466  916:astore          13
						}
						f4 = f1;
	//  467  918:fload_2         
	//  468  919:fstore          4
						l = i;
	//  469  921:iload_1         
	//  470  922:istore          5
						iteminfo9 = iteminfo4;
	//  471  924:aload           13
	//  472  926:astore          16
						i = l1;
	//  473  928:iload           7
	//  474  930:istore_1        
					} while(true);
	//  475  931:goto            658
				}
				calculatePageOffsets(iteminfo7, j1, iteminfo5);
	//  476  934:aload_0         
	//  477  935:aload           15
	//  478  937:iload           6
	//  479  939:aload           14
	//  480  941:invokespecial   #1180 <Method void calculatePageOffsets(ViewPager$ItemInfo, int, ViewPager$ItemInfo)>
				mAdapter.setPrimaryItem(((ViewGroup) (this)), mCurItem, iteminfo7.object);
	//  481  944:aload_0         
	//  482  945:getfield        #233 <Field PagerAdapter mAdapter>
	//  483  948:aload_0         
	//  484  949:aload_0         
	//  485  950:getfield        #330 <Field int mCurItem>
	//  486  953:aload           15
	//  487  955:getfield        #616 <Field Object ViewPager$ItemInfo.object>
	//  488  958:invokevirtual   #1183 <Method void PagerAdapter.setPrimaryItem(ViewGroup, int, Object)>
			}
			mAdapter.finishUpdate(((ViewGroup) (this)));
	//  489  961:aload_0         
	//  490  962:getfield        #233 <Field PagerAdapter mAdapter>
	//  491  965:aload_0         
	//  492  966:invokevirtual   #787 <Method void PagerAdapter.finishUpdate(ViewGroup)>
			int i1 = getChildCount();
	//  493  969:aload_0         
	//  494  970:invokevirtual   #367 <Method int getChildCount()>
	//  495  973:istore          5
			for(i = 0; i < i1; i++)
	//* 496  975:iconst_0        
	//* 497  976:istore_1        
	//* 498  977:iload_1         
	//* 499  978:iload           5
	//* 500  980:icmpge          1064
			{
				Object obj1 = ((Object) (getChildAt(i)));
	//  501  983:aload_0         
	//  502  984:iload_1         
	//  503  985:invokevirtual   #373 <Method View getChildAt(int)>
	//  504  988:astore          14
				LayoutParams layoutparams = (LayoutParams)((View) (obj1)).getLayoutParams();
	//  505  990:aload           14
	//  506  992:invokevirtual   #531 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  507  995:checkcast       #20  <Class ViewPager$LayoutParams>
	//  508  998:astore          13
				layoutparams.childIndex = i;
	//  509 1000:aload           13
	//  510 1002:iload_1         
	//  511 1003:putfield        #930 <Field int ViewPager$LayoutParams.childIndex>
				if(layoutparams.isDecor || layoutparams.widthFactor != 0.0F)
					continue;
	//  512 1006:aload           13
	//  513 1008:getfield        #534 <Field boolean ViewPager$LayoutParams.isDecor>
	//  514 1011:ifne            1057
	//  515 1014:aload           13
	//  516 1016:getfield        #788 <Field float ViewPager$LayoutParams.widthFactor>
	//  517 1019:fconst_0        
	//  518 1020:fcmpl           
	//  519 1021:ifne            1057
				obj1 = ((Object) (infoForChild(((View) (obj1)))));
	//  520 1024:aload_0         
	//  521 1025:aload           14
	//  522 1027:invokevirtual   #592 <Method ViewPager$ItemInfo infoForChild(View)>
	//  523 1030:astore          14
				if(obj1 != null)
	//* 524 1032:aload           14
	//* 525 1034:ifnull          1057
				{
					layoutparams.widthFactor = ((ItemInfo) (obj1)).widthFactor;
	//  526 1037:aload           13
	//  527 1039:aload           14
	//  528 1041:getfield        #253 <Field float ViewPager$ItemInfo.widthFactor>
	//  529 1044:putfield        #788 <Field float ViewPager$LayoutParams.widthFactor>
					layoutparams.position = ((ItemInfo) (obj1)).position;
	//  530 1047:aload           13
	//  531 1049:aload           14
	//  532 1051:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//  533 1054:putfield        #1184 <Field int ViewPager$LayoutParams.position>
				}
			}

	//  534 1057:iload_1         
	//  535 1058:iconst_1        
	//  536 1059:iadd            
	//  537 1060:istore_1        
	//* 538 1061:goto            977
			sortChildDrawingOrder();
	//  539 1064:aload_0         
	//  540 1065:invokespecial   #1172 <Method void sortChildDrawingOrder()>
			if(hasFocus())
	//* 541 1068:aload_0         
	//* 542 1069:invokevirtual   #1187 <Method boolean hasFocus()>
	//* 543 1072:ifeq            1176
			{
				Object obj = ((Object) (findFocus()));
	//  544 1075:aload_0         
	//  545 1076:invokevirtual   #661 <Method View findFocus()>
	//  546 1079:astore          13
				if(obj != null)
	//* 547 1081:aload           13
	//* 548 1083:ifnull          1097
					obj = ((Object) (infoForAnyChild(((View) (obj)))));
	//  549 1086:aload_0         
	//  550 1087:aload           13
	//  551 1089:invokevirtual   #1189 <Method ViewPager$ItemInfo infoForAnyChild(View)>
	//  552 1092:astore          13
				else
	//* 553 1094:goto            1100
					obj = null;
	//  554 1097:aconst_null     
	//  555 1098:astore          13
				if(obj == null || ((ItemInfo) (obj)).position != mCurItem)
	//* 556 1100:aload           13
	//* 557 1102:ifnull          1117
	//* 558 1105:aload           13
	//* 559 1107:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 560 1110:aload_0         
	//* 561 1111:getfield        #330 <Field int mCurItem>
	//* 562 1114:icmpeq          1176
					for(i = 0; i < getChildCount(); i++)
	//* 563 1117:iconst_0        
	//* 564 1118:istore_1        
	//* 565 1119:iload_1         
	//* 566 1120:aload_0         
	//* 567 1121:invokevirtual   #367 <Method int getChildCount()>
	//* 568 1124:icmpge          1176
					{
						View view = getChildAt(i);
	//  569 1127:aload_0         
	//  570 1128:iload_1         
	//  571 1129:invokevirtual   #373 <Method View getChildAt(int)>
	//  572 1132:astore          13
						ItemInfo iteminfo6 = infoForChild(view);
	//  573 1134:aload_0         
	//  574 1135:aload           13
	//  575 1137:invokevirtual   #592 <Method ViewPager$ItemInfo infoForChild(View)>
	//  576 1140:astore          14
						if(iteminfo6 != null && iteminfo6.position == mCurItem && view.requestFocus(2))
	//* 577 1142:aload           14
	//* 578 1144:ifnull          1169
	//* 579 1147:aload           14
	//* 580 1149:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//* 581 1152:aload_0         
	//* 582 1153:getfield        #330 <Field int mCurItem>
	//* 583 1156:icmpne          1169
	//* 584 1159:aload           13
	//* 585 1161:iconst_2        
	//* 586 1162:invokevirtual   #1191 <Method boolean View.requestFocus(int)>
	//* 587 1165:ifeq            1169
							return;
	//  588 1168:return          
					}

	//  589 1169:iload_1         
	//  590 1170:iconst_1        
	//  591 1171:iadd            
	//  592 1172:istore_1        
			}
	//* 593 1173:goto            1119
			return;
	//  594 1176:return          
		}
		String s;
		try
		{
			s = getResources().getResourceName(getId());
	//  595 1177:aload_0         
	//  596 1178:invokevirtual   #1192 <Method Resources getResources()>
	//  597 1181:aload_0         
	//  598 1182:invokevirtual   #1195 <Method int getId()>
	//  599 1185:invokevirtual   #1199 <Method String Resources.getResourceName(int)>
	//  600 1188:astore          13
		}
	//* 601 1190:goto            1202
	//* 602 1193:aload_0         
	//* 603 1194:invokevirtual   #1195 <Method int getId()>
	//* 604 1197:invokestatic    #1204 <Method String Integer.toHexString(int)>
	//* 605 1200:astore          13
	//* 606 1202:new             #664 <Class StringBuilder>
	//* 607 1205:dup             
	//* 608 1206:invokespecial   #665 <Method void StringBuilder()>
	//* 609 1209:astore          14
	//* 610 1211:aload           14
	//* 611 1213:ldc2            #1206 <String "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ">
	//* 612 1216:invokevirtual   #673 <Method StringBuilder StringBuilder.append(String)>
	//* 613 1219:pop             
	//* 614 1220:aload           14
	//* 615 1222:aload_0         
	//* 616 1223:getfield        #769 <Field int mExpectedAdapterCount>
	//* 617 1226:invokevirtual   #1209 <Method StringBuilder StringBuilder.append(int)>
	//* 618 1229:pop             
	//* 619 1230:aload           14
	//* 620 1232:ldc2            #1211 <String ", found: ">
	//* 621 1235:invokevirtual   #673 <Method StringBuilder StringBuilder.append(String)>
	//* 622 1238:pop             
	//* 623 1239:aload           14
	//* 624 1241:iload           9
	//* 625 1243:invokevirtual   #1209 <Method StringBuilder StringBuilder.append(int)>
	//* 626 1246:pop             
	//* 627 1247:aload           14
	//* 628 1249:ldc2            #1213 <String " Pager id: ">
	//* 629 1252:invokevirtual   #673 <Method StringBuilder StringBuilder.append(String)>
	//* 630 1255:pop             
	//* 631 1256:aload           14
	//* 632 1258:aload           13
	//* 633 1260:invokevirtual   #673 <Method StringBuilder StringBuilder.append(String)>
	//* 634 1263:pop             
	//* 635 1264:aload           14
	//* 636 1266:ldc2            #1215 <String " Pager class: ">
	//* 637 1269:invokevirtual   #673 <Method StringBuilder StringBuilder.append(String)>
	//* 638 1272:pop             
	//* 639 1273:aload           14
	//* 640 1275:aload_0         
	//* 641 1276:invokevirtual   #449 <Method Class Object.getClass()>
	//* 642 1279:invokevirtual   #1218 <Method StringBuilder StringBuilder.append(Object)>
	//* 643 1282:pop             
	//* 644 1283:aload           14
	//* 645 1285:ldc2            #1220 <String " Problematic adapter: ">
	//* 646 1288:invokevirtual   #673 <Method StringBuilder StringBuilder.append(String)>
	//* 647 1291:pop             
	//* 648 1292:aload           14
	//* 649 1294:aload_0         
	//* 650 1295:getfield        #233 <Field PagerAdapter mAdapter>
	//* 651 1298:invokevirtual   #449 <Method Class Object.getClass()>
	//* 652 1301:invokevirtual   #1218 <Method StringBuilder StringBuilder.append(Object)>
	//* 653 1304:pop             
	//* 654 1305:new             #485 <Class IllegalStateException>
	//* 655 1308:dup             
	//* 656 1309:aload           14
	//* 657 1311:invokevirtual   #680 <Method String StringBuilder.toString()>
	//* 658 1314:invokespecial   #490 <Method void IllegalStateException(String)>
	//* 659 1317:athrow          
		// Misplaced declaration of an exception variable
		catch(android.content.res.Resources.NotFoundException notfoundexception)
		{
			s = Integer.toHexString(getId());
		}
		StringBuilder stringbuilder = new StringBuilder();
		stringbuilder.append("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
		stringbuilder.append(mExpectedAdapterCount);
		stringbuilder.append(", found: ");
		stringbuilder.append(j2);
		stringbuilder.append(" Pager id: ");
		stringbuilder.append(s);
		stringbuilder.append(" Pager class: ");
		stringbuilder.append(((Object) (((Object)this).getClass())));
		stringbuilder.append(" Problematic adapter: ");
		stringbuilder.append(((Object) (((Object) (mAdapter)).getClass())));
		throw new IllegalStateException(stringbuilder.toString());
	//* 660 1318:astore          13
	//* 661 1320:goto            1193
	}

	public void removeOnAdapterChangeListener(OnAdapterChangeListener onadapterchangelistener)
	{
		List list = mAdapterChangeListeners;
	//    0    0:aload_0         
	//    1    1:getfield        #623 <Field List mAdapterChangeListeners>
	//    2    4:astore_2        
		if(list != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
			list.remove(((Object) (onadapterchangelistener)));
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #1223 <Method boolean List.remove(Object)>
	//    8   16:pop             
	//    9   17:return          
	}

	public void removeOnPageChangeListener(OnPageChangeListener onpagechangelistener)
	{
		List list = mOnPageChangeListeners;
	//    0    0:aload_0         
	//    1    1:getfield        #348 <Field List mOnPageChangeListeners>
	//    2    4:astore_2        
		if(list != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          17
			list.remove(((Object) (onpagechangelistener)));
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #1223 <Method boolean List.remove(Object)>
	//    8   16:pop             
	//    9   17:return          
	}

	public void removeView(View view)
	{
		if(mInLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #645 <Field boolean mInLayout>
	//*   2    4:ifeq            13
		{
			removeViewInLayout(view);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #1228 <Method void removeViewInLayout(View)>
			return;
	//    6   12:return          
		} else
		{
			super.removeView(view);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #1230 <Method void ViewGroup.removeView(View)>
			return;
	//   10   18:return          
		}
	}

	public void setAdapter(PagerAdapter pageradapter)
	{
		Object obj = ((Object) (mAdapter));
	//    0    0:aload_0         
	//    1    1:getfield        #233 <Field PagerAdapter mAdapter>
	//    2    4:astore          6
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		if(obj != null)
	//*   5    8:aload           6
	//*   6   10:ifnull          108
		{
			((PagerAdapter) (obj)).setViewPagerObserver(((DataSetObserver) (null)));
	//    7   13:aload           6
	//    8   15:aconst_null     
	//    9   16:invokevirtual   #1236 <Method void PagerAdapter.setViewPagerObserver(DataSetObserver)>
			mAdapter.startUpdate(((ViewGroup) (this)));
	//   10   19:aload_0         
	//   11   20:getfield        #233 <Field PagerAdapter mAdapter>
	//   12   23:aload_0         
	//   13   24:invokevirtual   #780 <Method void PagerAdapter.startUpdate(ViewGroup)>
			for(int i = 0; i < mItems.size(); i++)
	//*  14   27:iconst_0        
	//*  15   28:istore_2        
	//*  16   29:iload_2         
	//*  17   30:aload_0         
	//*  18   31:getfield        #186 <Field ArrayList mItems>
	//*  19   34:invokevirtual   #256 <Method int ArrayList.size()>
	//*  20   37:icmpge          78
			{
				obj = ((Object) ((ItemInfo)mItems.get(i)));
	//   21   40:aload_0         
	//   22   41:getfield        #186 <Field ArrayList mItems>
	//   23   44:iload_2         
	//   24   45:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   25   48:checkcast       #17  <Class ViewPager$ItemInfo>
	//   26   51:astore          6
				mAdapter.destroyItem(((ViewGroup) (this)), ((ItemInfo) (obj)).position, ((ItemInfo) (obj)).object);
	//   27   53:aload_0         
	//   28   54:getfield        #233 <Field PagerAdapter mAdapter>
	//   29   57:aload_0         
	//   30   58:aload           6
	//   31   60:getfield        #247 <Field int ViewPager$ItemInfo.position>
	//   32   63:aload           6
	//   33   65:getfield        #616 <Field Object ViewPager$ItemInfo.object>
	//   34   68:invokevirtual   #784 <Method void PagerAdapter.destroyItem(ViewGroup, int, Object)>
			}

	//   35   71:iload_2         
	//   36   72:iconst_1        
	//   37   73:iadd            
	//   38   74:istore_2        
	//*  39   75:goto            29
			mAdapter.finishUpdate(((ViewGroup) (this)));
	//   40   78:aload_0         
	//   41   79:getfield        #233 <Field PagerAdapter mAdapter>
	//   42   82:aload_0         
	//   43   83:invokevirtual   #787 <Method void PagerAdapter.finishUpdate(ViewGroup)>
			mItems.clear();
	//   44   86:aload_0         
	//   45   87:getfield        #186 <Field ArrayList mItems>
	//   46   90:invokevirtual   #569 <Method void ArrayList.clear()>
			removeNonDecorViews();
	//   47   93:aload_0         
	//   48   94:invokespecial   #1238 <Method void removeNonDecorViews()>
			mCurItem = 0;
	//   49   97:aload_0         
	//   50   98:iconst_0        
	//   51   99:putfield        #330 <Field int mCurItem>
			scrollTo(0, 0);
	//   52  102:aload_0         
	//   53  103:iconst_0        
	//   54  104:iconst_0        
	//   55  105:invokevirtual   #296 <Method void scrollTo(int, int)>
		}
		obj = ((Object) (mAdapter));
	//   56  108:aload_0         
	//   57  109:getfield        #233 <Field PagerAdapter mAdapter>
	//   58  112:astore          6
		mAdapter = pageradapter;
	//   59  114:aload_0         
	//   60  115:aload_1         
	//   61  116:putfield        #233 <Field PagerAdapter mAdapter>
		mExpectedAdapterCount = 0;
	//   62  119:aload_0         
	//   63  120:iconst_0        
	//   64  121:putfield        #769 <Field int mExpectedAdapterCount>
		if(mAdapter != null)
	//*  65  124:aload_0         
	//*  66  125:getfield        #233 <Field PagerAdapter mAdapter>
	//*  67  128:ifnull          254
		{
			if(mObserver == null)
	//*  68  131:aload_0         
	//*  69  132:getfield        #1240 <Field ViewPager$PagerObserver mObserver>
	//*  70  135:ifnonnull       150
				mObserver = new PagerObserver();
	//   71  138:aload_0         
	//   72  139:new             #35  <Class ViewPager$PagerObserver>
	//   73  142:dup             
	//   74  143:aload_0         
	//   75  144:invokespecial   #1241 <Method void ViewPager$PagerObserver(ViewPager)>
	//   76  147:putfield        #1240 <Field ViewPager$PagerObserver mObserver>
			mAdapter.setViewPagerObserver(((DataSetObserver) (mObserver)));
	//   77  150:aload_0         
	//   78  151:getfield        #233 <Field PagerAdapter mAdapter>
	//   79  154:aload_0         
	//   80  155:getfield        #1240 <Field ViewPager$PagerObserver mObserver>
	//   81  158:invokevirtual   #1236 <Method void PagerAdapter.setViewPagerObserver(DataSetObserver)>
			mPopulatePending = false;
	//   82  161:aload_0         
	//   83  162:iconst_0        
	//   84  163:putfield        #302 <Field boolean mPopulatePending>
			boolean flag1 = mFirstLayout;
	//   85  166:aload_0         
	//   86  167:getfield        #212 <Field boolean mFirstLayout>
	//   87  170:istore          5
			mFirstLayout = true;
	//   88  172:aload_0         
	//   89  173:iconst_1        
	//   90  174:putfield        #212 <Field boolean mFirstLayout>
			mExpectedAdapterCount = mAdapter.getCount();
	//   91  177:aload_0         
	//   92  178:aload_0         
	//   93  179:getfield        #233 <Field PagerAdapter mAdapter>
	//   94  182:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//   95  185:putfield        #769 <Field int mExpectedAdapterCount>
			if(mRestoredCurItem >= 0)
	//*  96  188:aload_0         
	//*  97  189:getfield        #196 <Field int mRestoredCurItem>
	//*  98  192:iflt            238
			{
				mAdapter.restoreState(mRestoredAdapterState, mRestoredClassLoader);
	//   99  195:aload_0         
	//  100  196:getfield        #233 <Field PagerAdapter mAdapter>
	//  101  199:aload_0         
	//  102  200:getfield        #198 <Field Parcelable mRestoredAdapterState>
	//  103  203:aload_0         
	//  104  204:getfield        #200 <Field ClassLoader mRestoredClassLoader>
	//  105  207:invokevirtual   #1144 <Method void PagerAdapter.restoreState(Parcelable, ClassLoader)>
				setCurrentItemInternal(mRestoredCurItem, false, true);
	//  106  210:aload_0         
	//  107  211:aload_0         
	//  108  212:getfield        #196 <Field int mRestoredCurItem>
	//  109  215:iconst_0        
	//  110  216:iconst_1        
	//  111  217:invokevirtual   #792 <Method void setCurrentItemInternal(int, boolean, boolean)>
				mRestoredCurItem = -1;
	//  112  220:aload_0         
	//  113  221:iconst_m1       
	//  114  222:putfield        #196 <Field int mRestoredCurItem>
				mRestoredAdapterState = null;
	//  115  225:aload_0         
	//  116  226:aconst_null     
	//  117  227:putfield        #198 <Field Parcelable mRestoredAdapterState>
				mRestoredClassLoader = null;
	//  118  230:aload_0         
	//  119  231:aconst_null     
	//  120  232:putfield        #200 <Field ClassLoader mRestoredClassLoader>
			} else
	//* 121  235:goto            254
			if(!flag1)
	//* 122  238:iload           5
	//* 123  240:ifne            250
				populate();
	//  124  243:aload_0         
	//  125  244:invokevirtual   #1063 <Method void populate()>
			else
	//* 126  247:goto            254
				requestLayout();
	//  127  250:aload_0         
	//  128  251:invokevirtual   #795 <Method void requestLayout()>
		}
		List list = mAdapterChangeListeners;
	//  129  254:aload_0         
	//  130  255:getfield        #623 <Field List mAdapterChangeListeners>
	//  131  258:astore          7
		if(list != null && !list.isEmpty())
	//* 132  260:aload           7
	//* 133  262:ifnull          323
	//* 134  265:aload           7
	//* 135  267:invokeinterface #1242 <Method boolean List.isEmpty()>
	//* 136  272:ifne            323
		{
			int k = mAdapterChangeListeners.size();
	//  137  275:aload_0         
	//  138  276:getfield        #623 <Field List mAdapterChangeListeners>
	//  139  279:invokeinterface #351 <Method int List.size()>
	//  140  284:istore          4
			for(int j = ((int) (flag)); j < k; j++)
	//* 141  286:iload_3         
	//* 142  287:istore_2        
	//* 143  288:iload_2         
	//* 144  289:iload           4
	//* 145  291:icmpge          323
				((OnAdapterChangeListener)mAdapterChangeListeners.get(j)).onAdapterChanged(this, ((PagerAdapter) (obj)), pageradapter);
	//  146  294:aload_0         
	//  147  295:getfield        #623 <Field List mAdapterChangeListeners>
	//  148  298:iload_2         
	//  149  299:invokeinterface #352 <Method Object List.get(int)>
	//  150  304:checkcast       #26  <Class ViewPager$OnAdapterChangeListener>
	//  151  307:aload_0         
	//  152  308:aload           6
	//  153  310:aload_1         
	//  154  311:invokeinterface #1246 <Method void ViewPager$OnAdapterChangeListener.onAdapterChanged(ViewPager, PagerAdapter, PagerAdapter)>

	//  155  316:iload_2         
	//  156  317:iconst_1        
	//  157  318:iadd            
	//  158  319:istore_2        
		}
	//* 159  320:goto            288
	//  160  323:return          
	}

	public void setCurrentItem(int i)
	{
		mPopulatePending = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #302 <Field boolean mPopulatePending>
		setCurrentItemInternal(i, mFirstLayout ^ true, false);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #212 <Field boolean mFirstLayout>
	//    7   11:iconst_1        
	//    8   12:ixor            
	//    9   13:iconst_0        
	//   10   14:invokevirtual   #792 <Method void setCurrentItemInternal(int, boolean, boolean)>
	//   11   17:return          
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
	//    7    9:invokevirtual   #792 <Method void setCurrentItemInternal(int, boolean, boolean)>
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
	//    5    5:invokevirtual   #894 <Method void setCurrentItemInternal(int, boolean, boolean, int)>
	//    6    8:return          
	}

	void setCurrentItemInternal(int i, boolean flag, boolean flag1, int j)
	{
		PagerAdapter pageradapter = mAdapter;
	//    0    0:aload_0         
	//    1    1:getfield        #233 <Field PagerAdapter mAdapter>
	//    2    4:astore          7
		if(pageradapter != null && pageradapter.getCount() > 0)
	//*   3    6:aload           7
	//*   4    8:ifnull          210
	//*   5   11:aload           7
	//*   6   13:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//*   7   16:ifgt            22
	//*   8   19:goto            210
		{
			if(!flag1 && mCurItem == i && mItems.size() != 0)
	//*   9   22:iload_3         
	//*  10   23:ifne            50
	//*  11   26:aload_0         
	//*  12   27:getfield        #330 <Field int mCurItem>
	//*  13   30:iload_1         
	//*  14   31:icmpne          50
	//*  15   34:aload_0         
	//*  16   35:getfield        #186 <Field ArrayList mItems>
	//*  17   38:invokevirtual   #256 <Method int ArrayList.size()>
	//*  18   41:ifeq            50
			{
				setScrollingCacheEnabled(false);
	//   19   44:aload_0         
	//   20   45:iconst_0        
	//   21   46:invokespecial   #269 <Method void setScrollingCacheEnabled(boolean)>
				return;
	//   22   49:return          
			}
			flag1 = true;
	//   23   50:iconst_1        
	//   24   51:istore_3        
			int k;
			if(i < 0)
	//*  25   52:iload_1         
	//*  26   53:ifge            62
			{
				k = 0;
	//   27   56:iconst_0        
	//   28   57:istore          5
			} else
	//*  29   59:goto            87
			{
				k = i;
	//   30   62:iload_1         
	//   31   63:istore          5
				if(i >= mAdapter.getCount())
	//*  32   65:iload_1         
	//*  33   66:aload_0         
	//*  34   67:getfield        #233 <Field PagerAdapter mAdapter>
	//*  35   70:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//*  36   73:icmplt          87
					k = mAdapter.getCount() - 1;
	//   37   76:aload_0         
	//   38   77:getfield        #233 <Field PagerAdapter mAdapter>
	//   39   80:invokevirtual   #239 <Method int PagerAdapter.getCount()>
	//   40   83:iconst_1        
	//   41   84:isub            
	//   42   85:istore          5
			}
			i = mOffscreenPageLimit;
	//   43   87:aload_0         
	//   44   88:getfield        #208 <Field int mOffscreenPageLimit>
	//   45   91:istore_1        
			int l = mCurItem;
	//   46   92:aload_0         
	//   47   93:getfield        #330 <Field int mCurItem>
	//   48   96:istore          6
			if(k > l + i || k < l - i)
	//*  49   98:iload           5
	//*  50  100:iload           6
	//*  51  102:iload_1         
	//*  52  103:iadd            
	//*  53  104:icmpgt          116
	//*  54  107:iload           5
	//*  55  109:iload           6
	//*  56  111:iload_1         
	//*  57  112:isub            
	//*  58  113:icmpge          151
				for(i = 0; i < mItems.size(); i++)
	//*  59  116:iconst_0        
	//*  60  117:istore_1        
	//*  61  118:iload_1         
	//*  62  119:aload_0         
	//*  63  120:getfield        #186 <Field ArrayList mItems>
	//*  64  123:invokevirtual   #256 <Method int ArrayList.size()>
	//*  65  126:icmpge          151
					((ItemInfo)mItems.get(i)).scrolling = true;
	//   66  129:aload_0         
	//   67  130:getfield        #186 <Field ArrayList mItems>
	//   68  133:iload_1         
	//   69  134:invokevirtual   #260 <Method Object ArrayList.get(int)>
	//   70  137:checkcast       #17  <Class ViewPager$ItemInfo>
	//   71  140:iconst_1        
	//   72  141:putfield        #305 <Field boolean ViewPager$ItemInfo.scrolling>

	//   73  144:iload_1         
	//   74  145:iconst_1        
	//   75  146:iadd            
	//   76  147:istore_1        
	//*  77  148:goto            118
			if(mCurItem == k)
	//*  78  151:aload_0         
	//*  79  152:getfield        #330 <Field int mCurItem>
	//*  80  155:iload           5
	//*  81  157:icmpeq          163
	//*  82  160:goto            165
				flag1 = false;
	//   83  163:iconst_0        
	//   84  164:istore_3        
			if(mFirstLayout)
	//*  85  165:aload_0         
	//*  86  166:getfield        #212 <Field boolean mFirstLayout>
	//*  87  169:ifeq            193
			{
				mCurItem = k;
	//   88  172:aload_0         
	//   89  173:iload           5
	//   90  175:putfield        #330 <Field int mCurItem>
				if(flag1)
	//*  91  178:iload_3         
	//*  92  179:ifeq            188
					dispatchOnPageSelected(k);
	//   93  182:aload_0         
	//   94  183:iload           5
	//   95  185:invokespecial   #561 <Method void dispatchOnPageSelected(int)>
				requestLayout();
	//   96  188:aload_0         
	//   97  189:invokevirtual   #795 <Method void requestLayout()>
				return;
	//   98  192:return          
			} else
			{
				populate(k);
	//   99  193:aload_0         
	//  100  194:iload           5
	//  101  196:invokevirtual   #1168 <Method void populate(int)>
				scrollToItem(k, flag, j, flag1);
	//  102  199:aload_0         
	//  103  200:iload           5
	//  104  202:iload_2         
	//  105  203:iload           4
	//  106  205:iload_3         
	//  107  206:invokespecial   #1090 <Method void scrollToItem(int, boolean, int, boolean)>
				return;
	//  108  209:return          
			}
		} else
		{
			setScrollingCacheEnabled(false);
	//  109  210:aload_0         
	//  110  211:iconst_0        
	//  111  212:invokespecial   #269 <Method void setScrollingCacheEnabled(boolean)>
			return;
	//  112  215:return          
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
	//*   4    4:icmpge          55
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    5    7:new             #664 <Class StringBuilder>
	//    6   10:dup             
	//    7   11:invokespecial   #665 <Method void StringBuilder()>
	//    8   14:astore_3        
			stringbuilder.append("Requested offscreen page limit ");
	//    9   15:aload_3         
	//   10   16:ldc2            #1251 <String "Requested offscreen page limit ">
	//   11   19:invokevirtual   #673 <Method StringBuilder StringBuilder.append(String)>
	//   12   22:pop             
			stringbuilder.append(i);
	//   13   23:aload_3         
	//   14   24:iload_1         
	//   15   25:invokevirtual   #1209 <Method StringBuilder StringBuilder.append(int)>
	//   16   28:pop             
			stringbuilder.append(" too small; defaulting to ");
	//   17   29:aload_3         
	//   18   30:ldc2            #1253 <String " too small; defaulting to ">
	//   19   33:invokevirtual   #673 <Method StringBuilder StringBuilder.append(String)>
	//   20   36:pop             
			stringbuilder.append(1);
	//   21   37:aload_3         
	//   22   38:iconst_1        
	//   23   39:invokevirtual   #1209 <Method StringBuilder StringBuilder.append(int)>
	//   24   42:pop             
			Log.w("ViewPager", stringbuilder.toString());
	//   25   43:ldc1            #77  <String "ViewPager">
	//   26   45:aload_3         
	//   27   46:invokevirtual   #680 <Method String StringBuilder.toString()>
	//   28   49:invokestatic    #1256 <Method int Log.w(String, String)>
	//   29   52:pop             
			j = 1;
	//   30   53:iconst_1        
	//   31   54:istore_2        
		}
		if(j != mOffscreenPageLimit)
	//*  32   55:iload_2         
	//*  33   56:aload_0         
	//*  34   57:getfield        #208 <Field int mOffscreenPageLimit>
	//*  35   60:icmpeq          72
		{
			mOffscreenPageLimit = j;
	//   36   63:aload_0         
	//   37   64:iload_2         
	//   38   65:putfield        #208 <Field int mOffscreenPageLimit>
			populate();
	//   39   68:aload_0         
	//   40   69:invokevirtual   #1063 <Method void populate()>
		}
	//   41   72:return          
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
	//    7   11:invokevirtual   #462 <Method int getWidth()>
	//    8   14:istore_3        
		recomputeScrollPosition(k, k, i, j);
	//    9   15:aload_0         
	//   10   16:iload_3         
	//   11   17:iload_3         
	//   12   18:iload_1         
	//   13   19:iload_2         
	//   14   20:invokespecial   #1158 <Method void recomputeScrollPosition(int, int, int, int)>
		requestLayout();
	//   15   23:aload_0         
	//   16   24:invokevirtual   #795 <Method void requestLayout()>
	//   17   27:return          
	}

	public void setPageMarginDrawable(int i)
	{
		setPageMarginDrawable(ContextCompat.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #920 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #1268 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    5    9:invokevirtual   #1271 <Method void setPageMarginDrawable(Drawable)>
	//    6   12:return          
	}

	public void setPageMarginDrawable(Drawable drawable)
	{
		mMarginDrawable = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #866 <Field Drawable mMarginDrawable>
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			refreshDrawableState();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #1274 <Method void refreshDrawableState()>
		boolean flag;
		if(drawable == null)
	//*   7   13:aload_1         
	//*   8   14:ifnonnull       22
			flag = true;
	//    9   17:iconst_1        
	//   10   18:istore_2        
		else
	//*  11   19:goto            24
			flag = false;
	//   12   22:iconst_0        
	//   13   23:istore_2        
		setWillNotDraw(flag);
	//   14   24:aload_0         
	//   15   25:iload_2         
	//   16   26:invokevirtual   #940 <Method void setWillNotDraw(boolean)>
		invalidate();
	//   17   29:aload_0         
	//   18   30:invokevirtual   #1277 <Method void invalidate()>
	//   19   33:return          
	}

	public void setPageTransformer(boolean flag, PageTransformer pagetransformer)
	{
		setPageTransformer(flag, pagetransformer, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iconst_2        
	//    4    4:invokevirtual   #1282 <Method void setPageTransformer(boolean, ViewPager$PageTransformer, int)>
	//    5    7:return          
	}

	public void setPageTransformer(boolean flag, PageTransformer pagetransformer, int i)
	{
		int j = 1;
	//    0    0:iconst_1        
	//    1    1:istore          5
		boolean flag2;
		if(pagetransformer != null)
	//*   2    3:aload_2         
	//*   3    4:ifnull          13
			flag2 = true;
	//    4    7:iconst_1        
	//    5    8:istore          6
		else
	//*   6   10:goto            16
			flag2 = false;
	//    7   13:iconst_0        
	//    8   14:istore          6
		boolean flag3;
		if(mPageTransformer != null)
	//*   9   16:aload_0         
	//*  10   17:getfield        #1118 <Field ViewPager$PageTransformer mPageTransformer>
	//*  11   20:ifnull          29
			flag3 = true;
	//   12   23:iconst_1        
	//   13   24:istore          7
		else
	//*  14   26:goto            32
			flag3 = false;
	//   15   29:iconst_0        
	//   16   30:istore          7
		boolean flag1;
		if(flag2 != flag3)
	//*  17   32:iload           6
	//*  18   34:iload           7
	//*  19   36:icmpeq          45
			flag1 = true;
	//   20   39:iconst_1        
	//   21   40:istore          4
		else
	//*  22   42:goto            48
			flag1 = false;
	//   23   45:iconst_0        
	//   24   46:istore          4
		mPageTransformer = pagetransformer;
	//   25   48:aload_0         
	//   26   49:aload_2         
	//   27   50:putfield        #1118 <Field ViewPager$PageTransformer mPageTransformer>
		setChildrenDrawingOrderEnabled(flag2);
	//   28   53:aload_0         
	//   29   54:iload           6
	//   30   56:invokevirtual   #1285 <Method void setChildrenDrawingOrderEnabled(boolean)>
		if(flag2)
	//*  31   59:iload           6
	//*  32   61:ifeq            85
		{
			if(flag)
	//*  33   64:iload_1         
	//*  34   65:ifeq            71
				j = 2;
	//   35   68:iconst_2        
	//   36   69:istore          5
			mDrawingOrder = j;
	//   37   71:aload_0         
	//   38   72:iload           5
	//   39   74:putfield        #566 <Field int mDrawingOrder>
			mPageTransformerLayerType = i;
	//   40   77:aload_0         
	//   41   78:iload_3         
	//   42   79:putfield        #369 <Field int mPageTransformerLayerType>
		} else
	//*  43   82:goto            90
		{
			mDrawingOrder = 0;
	//   44   85:aload_0         
	//   45   86:iconst_0        
	//   46   87:putfield        #566 <Field int mDrawingOrder>
		}
		if(flag1)
	//*  47   90:iload           4
	//*  48   92:ifeq            99
			populate();
	//   49   95:aload_0         
	//   50   96:invokevirtual   #1063 <Method void populate()>
	//   51   99:return          
	}

	void setScrollState(int i)
	{
		if(mScrollState == i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #221 <Field int mScrollState>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		mScrollState = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #221 <Field int mScrollState>
		if(mPageTransformer != null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #1118 <Field ViewPager$PageTransformer mPageTransformer>
	//*  10   18:ifnull          37
		{
			boolean flag;
			if(i != 0)
	//*  11   21:iload_1         
	//*  12   22:ifeq            30
				flag = true;
	//   13   25:iconst_1        
	//   14   26:istore_2        
			else
	//*  15   27:goto            32
				flag = false;
	//   16   30:iconst_0        
	//   17   31:istore_2        
			enableLayers(flag);
	//   18   32:aload_0         
	//   19   33:iload_2         
	//   20   34:invokespecial   #1287 <Method void enableLayers(boolean)>
		}
		dispatchOnScrollStateChanged(i);
	//   21   37:aload_0         
	//   22   38:iload_1         
	//   23   39:invokespecial   #1289 <Method void dispatchOnScrollStateChanged(int)>
	//   24   42:return          
	}

	void smoothScrollTo(int i, int j)
	{
		smoothScrollTo(i, j, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:invokevirtual   #559 <Method void smoothScrollTo(int, int, int)>
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
		Scroller scroller = mScroller;
	//    7   13:aload_0         
	//    8   14:getfield        #271 <Field Scroller mScroller>
	//    9   17:astore          11
		boolean flag;
		if(scroller != null && !scroller.isFinished())
	//*  10   19:aload           11
	//*  11   21:ifnull          38
	//*  12   24:aload           11
	//*  13   26:invokevirtual   #277 <Method boolean Scroller.isFinished()>
	//*  14   29:ifne            38
			flag = true;
	//   15   32:iconst_1        
	//   16   33:istore          7
		else
	//*  17   35:goto            41
			flag = false;
	//   18   38:iconst_0        
	//   19   39:istore          7
		int l;
		if(flag)
	//*  20   41:iload           7
	//*  21   43:ifeq            89
		{
			if(mIsScrollStarted)
	//*  22   46:aload_0         
	//*  23   47:getfield        #759 <Field boolean mIsScrollStarted>
	//*  24   50:ifeq            65
				l = mScroller.getCurrX();
	//   25   53:aload_0         
	//   26   54:getfield        #271 <Field Scroller mScroller>
	//   27   57:invokevirtual   #289 <Method int Scroller.getCurrX()>
	//   28   60:istore          7
			else
	//*  29   62:goto            74
				l = mScroller.getStartX();
	//   30   65:aload_0         
	//   31   66:getfield        #271 <Field Scroller mScroller>
	//   32   69:invokevirtual   #1292 <Method int Scroller.getStartX()>
	//   33   72:istore          7
			mScroller.abortAnimation();
	//   34   74:aload_0         
	//   35   75:getfield        #271 <Field Scroller mScroller>
	//   36   78:invokevirtual   #280 <Method void Scroller.abortAnimation()>
			setScrollingCacheEnabled(false);
	//   37   81:aload_0         
	//   38   82:iconst_0        
	//   39   83:invokespecial   #269 <Method void setScrollingCacheEnabled(boolean)>
		} else
	//*  40   86:goto            95
		{
			l = getScrollX();
	//   41   89:aload_0         
	//   42   90:invokevirtual   #283 <Method int getScrollX()>
	//   43   93:istore          7
		}
		int i1 = getScrollY();
	//   44   95:aload_0         
	//   45   96:invokevirtual   #286 <Method int getScrollY()>
	//   46   99:istore          8
		int j1 = i - l;
	//   47  101:iload_1         
	//   48  102:iload           7
	//   49  104:isub            
	//   50  105:istore          9
		j -= i1;
	//   51  107:iload_2         
	//   52  108:iload           8
	//   53  110:isub            
	//   54  111:istore_2        
		if(j1 == 0 && j == 0)
	//*  55  112:iload           9
	//*  56  114:ifne            136
	//*  57  117:iload_2         
	//*  58  118:ifne            136
		{
			completeScroll(false);
	//   59  121:aload_0         
	//   60  122:iconst_0        
	//   61  123:invokespecial   #526 <Method void completeScroll(boolean)>
			populate();
	//   62  126:aload_0         
	//   63  127:invokevirtual   #1063 <Method void populate()>
			setScrollState(0);
	//   64  130:aload_0         
	//   65  131:iconst_0        
	//   66  132:invokevirtual   #721 <Method void setScrollState(int)>
			return;
	//   67  135:return          
		}
		setScrollingCacheEnabled(true);
	//   68  136:aload_0         
	//   69  137:iconst_1        
	//   70  138:invokespecial   #269 <Method void setScrollingCacheEnabled(boolean)>
		setScrollState(2);
	//   71  141:aload_0         
	//   72  142:iconst_2        
	//   73  143:invokevirtual   #721 <Method void setScrollState(int)>
		i = getClientWidth();
	//   74  146:aload_0         
	//   75  147:invokespecial   #242 <Method int getClientWidth()>
	//   76  150:istore_1        
		int k1 = i / 2;
	//   77  151:iload_1         
	//   78  152:iconst_2        
	//   79  153:idiv            
	//   80  154:istore          10
		float f1 = Math.abs(j1);
	//   81  156:iload           9
	//   82  158:invokestatic    #324 <Method int Math.abs(int)>
	//   83  161:i2f             
	//   84  162:fstore          5
		float f = i;
	//   85  164:iload_1         
	//   86  165:i2f             
	//   87  166:fstore          4
		float f3 = Math.min(1.0F, (f1 * 1.0F) / f);
	//   88  168:fconst_1        
	//   89  169:fload           5
	//   90  171:fconst_1        
	//   91  172:fmul            
	//   92  173:fload           4
	//   93  175:fdiv            
	//   94  176:invokestatic    #524 <Method float Math.min(float, float)>
	//   95  179:fstore          6
		f1 = k1;
	//   96  181:iload           10
	//   97  183:i2f             
	//   98  184:fstore          5
		f3 = distanceInfluenceForSnapDuration(f3);
	//   99  186:aload_0         
	//  100  187:fload           6
	//  101  189:invokevirtual   #1294 <Method float distanceInfluenceForSnapDuration(float)>
	//  102  192:fstore          6
		i = Math.abs(k);
	//  103  194:iload_3         
	//  104  195:invokestatic    #324 <Method int Math.abs(int)>
	//  105  198:istore_1        
		if(i > 0)
	//* 106  199:iload_1         
	//* 107  200:ifle            230
		{
			i = Math.round(Math.abs((f1 + f3 * f1) / (float)i) * 1000F) * 4;
	//  108  203:fload           5
	//  109  205:fload           6
	//  110  207:fload           5
	//  111  209:fmul            
	//  112  210:fadd            
	//  113  211:iload_1         
	//  114  212:i2f             
	//  115  213:fdiv            
	//  116  214:invokestatic    #499 <Method float Math.abs(float)>
	//  117  217:ldc2            #1295 <Float 1000F>
	//  118  220:fmul            
	//  119  221:invokestatic    #1023 <Method int Math.round(float)>
	//  120  224:iconst_4        
	//  121  225:imul            
	//  122  226:istore_1        
		} else
	//* 123  227:goto            269
		{
			float f2 = mAdapter.getPageWidth(mCurItem);
	//  124  230:aload_0         
	//  125  231:getfield        #233 <Field PagerAdapter mAdapter>
	//  126  234:aload_0         
	//  127  235:getfield        #330 <Field int mCurItem>
	//  128  238:invokevirtual   #264 <Method float PagerAdapter.getPageWidth(int)>
	//  129  241:fstore          5
			i = (int)(((float)Math.abs(j1) / (f * f2 + (float)mPageMargin) + 1.0F) * 100F);
	//  130  243:iload           9
	//  131  245:invokestatic    #324 <Method int Math.abs(int)>
	//  132  248:i2f             
	//  133  249:fload           4
	//  134  251:fload           5
	//  135  253:fmul            
	//  136  254:aload_0         
	//  137  255:getfield        #244 <Field int mPageMargin>
	//  138  258:i2f             
	//  139  259:fadd            
	//  140  260:fdiv            
	//  141  261:fconst_1        
	//  142  262:fadd            
	//  143  263:ldc2            #1296 <Float 100F>
	//  144  266:fmul            
	//  145  267:f2i             
	//  146  268:istore_1        
		}
		i = Math.min(i, 600);
	//  147  269:iload_1         
	//  148  270:sipush          600
	//  149  273:invokestatic    #336 <Method int Math.min(int, int)>
	//  150  276:istore_1        
		mIsScrollStarted = false;
	//  151  277:aload_0         
	//  152  278:iconst_0        
	//  153  279:putfield        #759 <Field boolean mIsScrollStarted>
		mScroller.startScroll(l, i1, j1, j, i);
	//  154  282:aload_0         
	//  155  283:getfield        #271 <Field Scroller mScroller>
	//  156  286:iload           7
	//  157  288:iload           8
	//  158  290:iload           9
	//  159  292:iload_2         
	//  160  293:iload_1         
	//  161  294:invokevirtual   #1300 <Method void Scroller.startScroll(int, int, int, int, int)>
		ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//  162  297:aload_0         
	//  163  298:invokestatic    #766 <Method void ViewCompat.postInvalidateOnAnimation(View)>
	//  164  301:return          
	}

	protected boolean verifyDrawable(Drawable drawable)
	{
		return super.verifyDrawable(drawable) || drawable == mMarginDrawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #1304 <Method boolean ViewGroup.verifyDrawable(Drawable)>
	//    3    5:ifne            21
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #866 <Field Drawable mMarginDrawable>
	//    7   13:if_acmpne       19
	//    8   16:goto            21
	//    9   19:iconst_0        
	//   10   20:ireturn         
	//   11   21:iconst_1        
	//   12   22:ireturn         
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
			return f * f * f * f * f + 1.0F;
		//    4    4:fload_1         
		//    5    5:fload_1         
		//    6    6:fmul            
		//    7    7:fload_1         
		//    8    8:fmul            
		//    9    9:fload_1         
		//   10   10:fmul            
		//   11   11:fload_1         
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
	//    4    5:ldc1            #163 <Int 0x10100b3>
	//    5    7:iastore         
	//    6    8:putstatic       #165 <Field int[] LAYOUT_ATTRS>
	//    7   11:new             #6   <Class ViewPager$1>
	//    8   14:dup             
	//    9   15:invokespecial   #168 <Method void ViewPager$1()>
	//   10   18:putstatic       #170 <Field Comparator COMPARATOR>
	//   11   21:new             #8   <Class ViewPager$2>
	//   12   24:dup             
	//   13   25:invokespecial   #171 <Method void ViewPager$2()>
	//   14   28:putstatic       #173 <Field Interpolator sInterpolator>
	//   15   31:new             #43  <Class ViewPager$ViewPositionComparator>
	//   16   34:dup             
	//   17   35:invokespecial   #174 <Method void ViewPager$ViewPositionComparator()>
	//   18   38:putstatic       #176 <Field ViewPager$ViewPositionComparator sPositionComparator>
	//*  19   41:return          
	}
}
